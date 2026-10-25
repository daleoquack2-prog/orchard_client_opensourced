#version 330
#moj_import <minecraft:globals.glsl>
uniform sampler2D InSampler;
layout(std140) uniform H4Params { vec4 Tint; };
in vec2 texCoord;
out vec4 fragColor;
void main() {
    vec4 base = texture(InSampler, texCoord);
    float phase = fract(GameTime * 150.0);
    vec2 facets = floor(texCoord * vec2(35.0, 22.0));
    float hue = dot(facets, vec2(0.071, 0.097)) + phase;
    vec3 rgb = 0.5 + 0.5 * cos(6.2831853 * (hue + vec3(0.0, 0.33, 0.67)));
    vec3 spectrum = Tint.w > 0.5 ? Tint.rgb * (0.78 + 0.22 * sin(hue * 6.2831853)) : rgb;
    float sheen = 0.18 * pow(max(0.0, sin((texCoord.x + texCoord.y + phase) * 6.2831853)), 8.0);
    fragColor = vec4(clamp(mix(base.rgb, spectrum, 0.65) + sheen, 0.0, 1.0), base.a);
}
