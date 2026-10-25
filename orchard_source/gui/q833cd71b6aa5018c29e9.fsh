#version 330

uniform sampler2D InSampler;

layout(std140) uniform SamplerInfo {
    vec2 OutSize;
    vec2 InSize;
};

// x: rim width in pixels (1..4), y: weight of the rim inside the silhouette
layout(std140) uniform EdgeParams {
    vec4 Edge;
};

in vec2 texCoord;

out vec4 fragColor;

const int RAYS = 8;
const float TAU = 6.28318530718;

// Marks a soft rim on both sides of every silhouette edge in the outline
// target. Output is premultiplied so the separable blur that follows can
// spread it into a halo without darkening toward transparent black.
void main() {
    vec2 texel = 1.0 / InSize;
    vec4 center = texture(InSampler, texCoord);
    bool inside = center.a > 0.5;
    float width = clamp(Edge.x, 1.0, 4.0);
    float rim = 0.0;
    vec3 color = center.rgb;

    for (int ray = 0; ray < RAYS; ray++) {
        float angle = TAU * (float(ray) + 0.5) / float(RAYS);
        vec2 dir = vec2(cos(angle), sin(angle)) * texel;
        for (int s = 1; s <= 4; s++) {
            float d = float(s);
            if (d > width + 0.001) {
                break;
            }
            vec4 probe = texture(InSampler, texCoord + dir * d);
            if ((probe.a > 0.5) != inside) {
                float strength = 1.0 - (d - 1.0) / width;
                if (inside) {
                    strength *= Edge.y;
                } else if (strength > rim) {
                    color = probe.rgb;
                }
                rim = max(rim, strength);
                break;
            }
        }
    }

    fragColor = vec4(color * rim, rim);
}
