package nsc;

import net.fabricmc.api.EnvType;
import net.fabricmc.api.Environment;
import net.minecraft.class_243;

@Environment(EnvType.CLIENT)
record bbaaaaaa(class_243 a, float yaw, float pitch, float yawDelta, float pitchDelta, float rawYawDelta, float rawPitchDelta) {
   private final float aa;
   private final float ab;
   private final float ba;
   private final float bb;
   private final class_243 aaa;
   private final float a;
   private final float b;

   public float aa() {
      return this.a;
   }

   private bbaaaaaa(
      class_243 a, float yaw, float pitch, float yawDelta, float pitchDelta, float rawYawDelta, float rawPitchDelta
   ) {
      this.aaa = a;
      this.a = yaw;
      this.ba = pitch;
      this.ab = yawDelta;
      this.bb = pitchDelta;
      this.b = rawYawDelta;
      this.aa = rawPitchDelta;
   }

   public float b() {
      return this.aa;
   }

   public float ab() {
      return this.b;
   }

   public float a() {
      return this.ab;
   }
}
