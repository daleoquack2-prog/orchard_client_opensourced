package nsc;

import net.fabricmc.api.EnvType;
import net.fabricmc.api.Environment;

@Environment(EnvType.CLIENT)
record aaaaababb(float cc, float cd, int ce, boolean cf) {
   private final float a;
   private final int b;
   private final boolean aa;
   private final float ab;

   aaaaababb(float cc, float cd, int ce, boolean cf) {
      this.ab = cc;
      this.a = cd;
      this.b = ce;
      this.aa = cf;
   }

   public float aa() {
      return this.ab;
   }

   public boolean ab() {
      return this.aa;
   }
}
