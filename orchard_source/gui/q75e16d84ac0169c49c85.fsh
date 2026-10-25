#version 330
#moj_import <minecraft:globals.glsl>
uniform sampler2D InSampler;
layout(std140) uniform H4Params { vec4 Tint; };
in vec2 texCoord;
out vec4 fragColor;
void main() {
    vec4 base = texture(InSampler, texCoord);
    float phase = 6.2831853 * fract(GameTime * 150.0);
    float wave = sin(texCoord.x * 18.0 + sin(texCoord.y * 12.0 + phase) * 2.5 + phase);
    vec3 rgb = 0.5 + 0.5 * cos(6.2831853 * (texCoord.y * 0.6 + wave * 0.15 + fract(GameTime * 150.0) + vec3(0.0, 0.33, 0.67)));
    vec3 aurora = Tint.w > 0.5 ? Tint.rgb * (0.7 + wave * 0.15 + 0.15) : rgb;
    float shine = 0.5 + 0.5 * sin(texCoord.y * 36.0 - phase);
    fragColor = vec4(clamp(mix(base.rgb, aurora, 0.60) + aurora * shine * 0.12, 0.0, 1.0), base.a);
}
