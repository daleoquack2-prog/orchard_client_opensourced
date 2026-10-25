package nsc;

import net.fabricmc.api.EnvType;
import net.fabricmc.api.Environment;

@Environment(EnvType.CLIENT)
record aaaabb(double a, double b) {
   private final double aa;

   public double aa() {
      return this.a;
   }

   public double b() {
      return this.aa;
   }

   private aaaabb(double a, double b) {
      this.aa = a;
      this.a = b;
   }
}
