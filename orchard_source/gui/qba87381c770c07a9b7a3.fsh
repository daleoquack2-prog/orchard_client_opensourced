#version 330

#moj_import <minecraft:globals.glsl>

uniform sampler2D MaskSampler;
uniform sampler2D LineSampler;
uniform sampler2D HaloSampler;

layout(std140) uniform SamplerInfo {
    vec2 OutSize;
    vec2 MaskSize;
    vec2 LineSize;
    vec2 HaloSize;
};

// x: style (0 neon, 1 aurora, 2 prism, 3 hologram, 4 liquid), y: fill opacity,
// z: halo gain, w: rim opacity
layout(std140) uniform LookParams {
    vec4 Look;
};

in vec2 texCoord;

out vec4 fragColor;

const float TAU = 6.28318530718;

vec3 rgbToHsv(vec3 c) {
    vec4 k = vec4(0.0, -1.0 / 3.0, 2.0 / 3.0, -1.0);
    vec4 p = mix(vec4(c.bg, k.wz), vec4(c.gb, k.xy), step(c.b, c.g));
    vec4 q = mix(vec4(p.xyw, c.r), vec4(c.r, p.yzx), step(p.x, c.r));
    float d = q.x - min(q.w, q.y);
    float e = 1.0e-10;
    return vec3(abs(q.z + (q.w - q.y) / (6.0 * d + e)), d / (q.x + e), q.x);
}

vec3 hsvToRgb(vec3 c) {
    vec3 p = abs(fract(c.xxx + vec3(1.0, 2.0 / 3.0, 1.0 / 3.0)) * 6.0 - 3.0);
    return c.z * mix(vec3(1.0), clamp(p - 1.0, 0.0, 1.0), c.y);
}

void main() {
    vec4 mask = texture(MaskSampler, texCoord);
    vec4 line = texture(LineSampler, texCoord);
    vec4 halo = texture(HaloSampler, texCoord);

    float inside = step(0.5, mask.a);
    float lineA = clamp(line.a, 0.0, 1.0);
    float haloA = clamp(halo.a, 0.0, 1.0);
    if (inside + lineA + haloA < 0.002) {
        fragColor = vec4(0.0);
        return;
    }

    vec3 base;
    if (inside > 0.5) {
        base = mask.rgb;
    } else if (lineA > 0.001) {
        base = line.rgb / lineA;
    } else {
        base = halo.rgb / max(haloA, 0.001);
    }
    base = clamp(base, 0.0, 1.0);

    int style = int(Look.x + 0.5);
    float fill = Look.y;
    // GameTime advances 1/24000 per tick and wraps every 24000 ticks; integer
    // multipliers keep every phase below continuous across that wrap.
    float t = fract(GameTime * 300.0);
    float slow = fract(GameTime * 150.0);
    vec2 px = texCoord * OutSize;
    float diag = (px.x + px.y) / max(OutSize.y, 1.0);
    // The theme accent arrives in the mask color; styles only wobble it
    // slightly so the selected theme keeps driving the look.
    vec3 hsv = rgbToHsv(base);
    float sat = clamp(hsv.y, 0.25, 1.0);

    vec3 rimColor;
    vec3 fillColor;
    if (style == 1) {
        float wave = sin(TAU * (texCoord.y * 2.0 + 0.25 * sin(TAU * (texCoord.x * 1.5 + slow)) - t));
        float hue = hsv.x + 0.05 * wave + 0.02 * sin(TAU * (diag - slow));
        rimColor = hsvToRgb(vec3(fract(hue + 0.03), sat, 1.0));
        fillColor = hsvToRgb(vec3(fract(hue), sat * 0.9, 1.0));
        fill *= 0.55 + 0.45 * (0.5 + 0.5 * wave);
    } else if (style == 2) {
        float hue = fract(hsv.x + 0.05 * sin(TAU * (diag * 0.9 - t)));
        rimColor = hsvToRgb(vec3(hue, sat, 1.0));
        fillColor = hsvToRgb(vec3(fract(hue + 0.05), sat * 0.9, 1.0));
    } else if (style == 3) {
        float scan = 0.5 + 0.5 * cos(TAU * (px.y * 0.25 - t * 6.0));
        float sweep = fract(texCoord.y + t) - 0.5;
        float band = exp(-sweep * sweep * 64.0);
        rimColor = hsvToRgb(vec3(fract(hsv.x - 0.03), sat * 0.9, 1.0));
        fillColor = mix(rimColor, vec3(1.0), 0.2 * band);
        fill *= 0.35 + 0.45 * scan + 0.9 * band;
    } else if (style == 4) {
        // Liquid: a deep body of the theme colour with caustic light flowing
        // through it and a bright, rippling surface along the rim.
        vec2 uv = px / max(OutSize.y, 1.0);
        float w1 = sin(TAU * (uv.x * 3.0 + uv.y * 1.2 - t));
        float w2 = sin(TAU * (uv.y * 4.0 - uv.x * 0.8 + slow * 2.0) + w1 * 1.4);
        float w3 = sin(TAU * ((uv.x + uv.y) * 6.0 + t * 2.0) + w2);
        float caustic = pow(clamp(1.0 - abs(w2 + w3) * 0.5, 0.0, 1.0), 6.0);
        vec3 deep = hsvToRgb(vec3(hsv.x, sat, 0.55));
        vec3 surface = hsvToRgb(vec3(fract(hsv.x + 0.02), sat * 0.6, 1.0));
        fillColor = clamp(mix(deep, surface, 0.25 + 0.35 * (0.5 + 0.5 * w1)) + vec3(caustic * 0.55), 0.0, 1.0);
        rimColor = mix(surface, vec3(1.0), 0.35 + 0.25 * (0.5 + 0.5 * w3));
        fill *= 0.75 + 0.25 * (0.5 + 0.5 * w2);
    } else {
        float hue = hsv.x + 0.05 * sin(TAU * (diag * 1.2 - t));
        rimColor = hsvToRgb(vec3(fract(hue), sat, 1.0));
        fillColor = rimColor;
        rimColor = mix(rimColor, vec3(1.0), 0.35 * lineA * lineA);
    }

    float rimMask = clamp(lineA * Look.w, 0.0, 1.0);
    // The halo is the blurred silhouette itself, not blurred rim lines, so it
    // depends only on how near the body is. Blurred lines added up wherever
    // two edges sat close (neck, armpits, between the legs) and showed as
    // brighter overlapping patches. Coverage just outside the body runs from
    // 0.25 at an outward corner to 0.75 in a notch; saturating at 0.25 gives
    // every stretch of the outline the same brightness before it fades.
    float reach = clamp(haloA * 4.0, 0.0, 1.0);
    // The halo lives strictly outside every silhouette: overlapping players
    // read as one clean outlined glow instead of glow washing over bodies.
    // 0.1 keeps each style's glow about as strong at the body as it was when
    // the gain applied to the much fainter blurred lines.
    float haloMask = (1.0 - exp(-reach * sqrt(reach) * Look.z * 0.1)) * (1.0 - inside);
    float fillMask = clamp(inside * fill, 0.0, 1.0) * (1.0 - lineA);
    float weight = rimMask + haloMask + fillMask;
    if (weight < 0.0005) {
        fragColor = vec4(0.0);
        return;
    }
    vec3 color = (rimColor * (rimMask + haloMask) + fillColor * fillMask) / weight;
    float alpha = 1.0 - (1.0 - rimMask) * (1.0 - haloMask) * (1.0 - fillMask);
    fragColor = vec4(clamp(color, 0.0, 1.0), clamp(alpha, 0.0, 1.0));
}
