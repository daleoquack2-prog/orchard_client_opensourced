#version 330
#moj_import <minecraft:globals.glsl>
uniform sampler2D InSampler;
layout(std140) uniform H4Params { vec4 Tint; };
in vec2 texCoord;
out vec4 fragColor;
const float TAU = 6.2831853;
// Liquid: the hands seen through moving water. The image wobbles with two
// crossing waves, takes on a deep-to-light water body, and caustic light and
// a slow sheen run over it. Integer GameTime multipliers keep it continuous
// across the day wrap.
void main() {
    float slow = fract(GameTime * 150.0);
    float fast = fract(GameTime * 300.0);
    vec2 uv = texCoord;
    float w1 = sin(TAU * (uv.y * 3.0 - slow) + sin(TAU * (uv.x * 2.0 + fast)) * 1.3);
    float w2 = sin(TAU * (uv.x * 4.0 + uv.y * 2.0 - fast) + w1);
    vec4 base = texture(InSampler, uv + vec2(w1, w2) * 0.0035);
    if (base.a < 0.003) {
        fragColor = vec4(0.0);
        return;
    }
    float w3 = sin(TAU * ((uv.x - uv.y) * 7.0 + fast * 2.0) + w2 * 1.5);
    float caustic = pow(clamp(1.0 - abs(w2 + w3) * 0.5, 0.0, 1.0), 7.0);
    vec3 water = Tint.w > 0.5 ? Tint.rgb : vec3(0.22, 0.62, 1.0);
    vec3 body = mix(water * 0.55, water, 0.35 + 0.4 * (0.5 + 0.5 * w1));
    float luma = dot(base.rgb, vec3(0.299, 0.587, 0.114));
    vec3 tinted = mix(base.rgb, body * (0.6 + 0.8 * luma), 0.55);
    float sheen = pow(clamp(0.5 + 0.5 * sin(TAU * (uv.y * 1.5 + uv.x * 0.6 - slow)), 0.0, 1.0), 12.0);
    fragColor = vec4(clamp(tinted + vec3(caustic * 0.45 + sheen * 0.25), 0.0, 1.0), base.a);
}
