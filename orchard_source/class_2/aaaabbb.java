package nsc;

import net.fabricmc.api.EnvType;
import net.fabricmc.api.Environment;

@Environment(EnvType.CLIENT)
record aaaabbb(float a, float t) {
   private final float b;

   public float b() {
      return this.a;
   }

   public float aa() {
      return this.b;
   }

   private aaaabbb(float a, float t) {
      this.b = a;
      this.a = t;
   }
}
