package nsc;

import net.fabricmc.api.EnvType;
import net.fabricmc.api.Environment;

@Environment(EnvType.CLIENT)
record babbba(double x, double y, int c) {
   private final int aa;
   private final double ab;
   private final double b;

   public double aa() {
      return this.b;
   }

   private babbba(double x, double y, int c) {
      this.b = x;
      this.ab = y;
      this.aa = c;
   }

   public int a() {
      return this.aa;
   }
}
