#version 330
#moj_import <minecraft:globals.glsl>
uniform sampler2D InSampler;
layout(std140) uniform H4Params { vec4 Tint; };
in vec2 texCoord;
out vec4 fragColor;
void main() {
    vec4 base = texture(InSampler, texCoord);
    vec2 size = vec2(textureSize(InSampler, 0));
    float phase = fract(GameTime * 300.0);
    float scan = 0.5 + 0.5 * sin((texCoord.y * size.y / 4.0 + phase) * 6.2831853);
    float sweep = pow(max(0.0, cos((texCoord.y - phase) * 6.2831853)), 18.0);
    vec3 rgb = 0.5 + 0.5 * cos(6.2831853 * (texCoord.y * 0.7 + phase + vec3(0.0, 0.33, 0.67)));
    vec3 hologram = (Tint.w > 0.5 ? Tint.rgb : rgb) * (0.65 + scan * 0.3 + sweep * 0.25);
    fragColor = vec4(clamp(mix(base.rgb, hologram, 0.78), 0.0, 1.0), base.a * (0.68 + scan * 0.20));
}
