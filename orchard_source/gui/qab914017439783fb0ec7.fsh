#version 330
#moj_import <minecraft:globals.glsl>
uniform sampler2D InSampler;
layout(std140) uniform H4Params { vec4 Tint; };
in vec2 texCoord;
out vec4 fragColor;
void main() {
    vec4 base = texture(InSampler, texCoord);
    vec2 px = 1.0 / vec2(textureSize(InSampler, 0));
    float nearAlpha = max(max(texture(InSampler, texCoord + vec2(px.x * 2.0, 0.0)).a,
                              texture(InSampler, texCoord - vec2(px.x * 2.0, 0.0)).a),
                          max(texture(InSampler, texCoord + vec2(0.0, px.y * 2.0)).a,
                              texture(InSampler, texCoord - vec2(0.0, px.y * 2.0)).a));
    vec3 rgb = 0.55 + 0.45 * cos(6.2831853 * (texCoord.y * 0.7 + fract(GameTime * 300.0) + vec3(0.0, 0.33, 0.67)));
    vec3 neon = Tint.w > 0.5 ? Tint.rgb : rgb;
    float rim = clamp(nearAlpha - base.a, 0.0, 1.0);
    vec3 color = mix(base.rgb, neon, 0.38) + neon * rim * 0.55;
    fragColor = vec4(clamp(color, 0.0, 1.0), max(base.a, rim * 0.55));
}
