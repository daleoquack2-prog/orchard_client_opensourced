package nsc;

import net.fabricmc.api.EnvType;
import net.fabricmc.api.Environment;

@Environment(EnvType.CLIENT)
record bbbaabbb(float a, float b) {
   private final float aa;

   private bbbaabbb(float a, float b) {
      this.aa = a;
      this.a = b;
   }

   public float aa() {
      return this.a;
   }

   public float b() {
      return this.aa;
   }
}
