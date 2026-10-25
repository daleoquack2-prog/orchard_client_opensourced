package nsc;

import net.fabricmc.api.EnvType;
import net.fabricmc.api.Environment;

@Environment(EnvType.CLIENT)
record aaaaaabaa(double a, double b, double c) {
   private final double aa;
   private final double ab;

   public double aa() {
      return this.b;
   }

   public double ab() {
      return this.aa;
   }

   private aaaaaabaa(double a, double b, double c) {
      this.ab = a;
      this.aa = b;
      this.b = c;
   }

   public double b() {
      return this.ab;
   }
}
