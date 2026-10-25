#version 330

layout(std140) uniform DynamicTransforms {
    mat4 ModelViewMat;
    vec4 ColorModulator;
    vec3 ModelOffset;
    mat4 TextureMat;
};

uniform sampler2D Sampler0;

in vec2 texCoord0;
in vec3 shapeData;
in vec4 vertexColor;

out vec4 fragColor;

float median(float r, float g, float b) {
    return max(min(r, g), min(max(r, g), b));
}

void main() {
    vec3 sampleValue = texture(Sampler0, texCoord0).rgb;
    float sd = median(sampleValue.r, sampleValue.g, sampleValue.b) - 0.5;
    float screenPxDistance = sd / max(fwidth(sd), 0.0001);
    float alpha;
    if (shapeData.x > 0.001) {
        // Soft glow pass (drawn under the fill): solid at the glyph edge with
        // a quadratic falloff over shapeData.x screen pixels outward - the
        // SDF equivalent of a blurred halo, uniform along the whole outline.
        float outside = max(-screenPxDistance, 0.0);
        float t = clamp(outside / shapeData.x, 0.0, 1.0);
        float falloff = 1.0 - t;
        alpha = falloff * falloff;
    } else {
        // Negative shapeData.x is a fill dilation in pixels: shifts the alpha
        // threshold inward so strokes render slightly bolder without a
        // heavier font atlas.
        float dilation = shapeData.x < -0.001 ? -shapeData.x : 0.0;
        alpha = clamp(screenPxDistance + 0.5 + dilation, 0.0, 1.0);
    }

    vec4 color = vertexColor * ColorModulator;
    color.a *= alpha;
    if (color.a <= 0.001) {
        discard;
    }
    fragColor = color;
}
