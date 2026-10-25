# "Dirt Mod v1.1" — Deobfuscation Report

## What this file actually is

The jar's `fabric.mod.json` claims to be **MaLiLib 0.27.20** (masa's library mod, LGPL),
but that metadata is a disguise. The real mod inside is identified by its language keys
(`key.nsc.panel`, `key.nsc.profile_1` … `profile_24`):

- **Internal ID: `nsc`** — a client-side utility/"profile" client with **24 profile-switching
  keybinds** and a **panel keybind** (config GUI overlay panel).
- Targets **Minecraft 1.21.11** (Fabric Loader 0.18.4, Fabric API, Java 21, client-side only).
- Obfuscated with **Superblaubeere's Obfuscator** (flow obfuscation, per-class string
  encryption bound to stack-trace hashes, number-lookup tables, randomized decryptor
  signatures, an AES-like second string layer `abba`/`aabb`, plus a hidden
  `42ef6d8f-e867-4e08-91b5-f19765a90403.bin` data blob).

## What it hooks (77 mixins, intermediary names)

| Target (intermediary) | Meaning | Count |
|---|---|---|
| `class_634` / `class_640` / `class_2535` | ClientPlayNetworkHandler / Connection (packets) | 7 |
| `class_636` / `class_746` | ClientPlayerInteractionManager (block breaking / using / attacking) | 5 |
| `class_312` / `class_304` | Mouse + Keyboard input | 5 |
| `class_1297` / `class_1309` / `class_1657` / `class_742` | Entity / LivingEntity / PlayerEntity | 9+ |
| `class_757` / `class_4184` / `class_761` / `class_329` / `class_1671` | GameRenderer, Camera, HUD, DebugHud | 8+ |
| `class_310` | Minecraft client itself | 3 |
| others | ItemStack, SignBlockEntity, EntityRenderDispatcher, SoundSystem, MinecraftServer, … | |

A "profile" system with 24 hotkeys plus hooks into input, packets, interaction
manager and entities is the classic shape of a **utility / hacked client**.
Behavioral details (reach, velocity, auto-clicker, etc.) live behind the encrypted
string layer, so they can't be confirmed from this artifact alone.

## Deliverables (in Downloads)

- **`Dirt Mod_v1.1_deobfuscated.jar`** — the jar with the first string-encryption layer
  removed (412 string constants inlined as plaintext; e.g. `"ISO-8859-1"` table strings).
  Still loads the same way as the original.
- **`Dirt Mod_v1.1_source/`** — full decompiled source (758 classes, Vineflower):
  - `nsc/` — main mod code (676 classes)
  - `nsc.mixin/` — the 77 mixins (readable targets & injections)
  - `assets/`, `META-INF/` — original resources

## What was done (tooling, all offline/static)

1. Extracted & inspected metadata (`fabric.mod.json` claims MaLiLib — disguise).
2. Decompiled baseline with **Vineflower 1.11.1**.
3. Wrote a custom bytecode deobfuscator (Java + ASM 9.8):
   - detected the 396 per-class string decryptors (randomized signatures,
     stack-trace-based key binding),
   - extracted args per call site with a constant-propagating dataflow analysis
     (ASM Analyzer subclass),
   - reconstructed the packed string tables (static unpack + interpreted `<clinit>`),
   - executed each decryptor in a mini JVM interpreter with a *fake stack trace*
     carrying the real caller names, and inlined the results into the bytecode.
4. Re-decompiled and renamed the obfuscated packages:
   `qeaa361f…qf4ccf8f…` → `nsc`, `…q9fca77a8…` → `nsc.mixin` (long hash prefixes stripped).

## Known limitations

- **Second string layer not broken**: ~600 string sites decrypt to an intermediate
  ciphertext that is further transformed at runtime by `nsc.aabbaaaba.abba` (an AES-like
  routine) plus PRNG helpers (`ab`, `aa`, number tables). Those calls are left intact in
  the jar (still work at runtime) and marked in `deobf2.jar.skipped.txt`.
- 79 classes have no constant-arg call sites (values computed at runtime).
- Method/field names are unrecoverable — the obfuscator discards them; only structure,
  types and Minecraft references (intermediary names) are meaningful.
- Some Vineflower "Statement cannot be decomposed" warnings on a few heavily
  flow-obfuscated methods (bytecode comments included in those files).

## Caution

This is an anonymously distributed, heavily obfuscated client mod whose metadata lies
about its identity. Even without confirmed malicious behavior, running an obfuscated
third-party client mod on servers you care about is risky (account ban / client-side
malware surface). Behavior analysis in a sandbox would be the follow-up if you want to
know exactly what the second layer decrypts to.
