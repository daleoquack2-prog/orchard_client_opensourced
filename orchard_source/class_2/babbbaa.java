package nsc;

import net.fabricmc.api.EnvType;
import net.fabricmc.api.Environment;

@Environment(EnvType.CLIENT)
public record babbbaa(double a, double b, double c) {
   private final double aa;
   private final double ab;

   public double aa() {
      return this.a;
   }

   public double b() {
      return this.ab;
   }

   public babbbaa(double a, double b, double c) {
      this.ab = a;
      this.a = b;
      this.aa = c;
   }

   public double a() {
      return this.aa;
   }
}
