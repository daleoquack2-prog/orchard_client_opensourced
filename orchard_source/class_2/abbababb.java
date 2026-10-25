package nsc;

import net.fabricmc.api.EnvType;
import net.fabricmc.api.Environment;

@Environment(EnvType.CLIENT)
record abbababb(double a, double b) {
   private final double aa;

   public double aa() {
      return this.b;
   }

   private abbababb(double a, double b) {
      this.b = a;
      this.aa = b;
   }

   public double a() {
      return this.aa;
   }
}
