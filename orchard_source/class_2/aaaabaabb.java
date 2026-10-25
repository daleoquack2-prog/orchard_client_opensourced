package nsc;

import net.fabricmc.api.EnvType;
import net.fabricmc.api.Environment;

@Environment(EnvType.CLIENT)
record aaaabaabb(double a, double b, double c, double d) {
   private final double aa;
   private final double ab;
   private final double ba;

   private aaaabaabb aa(aaaabaabb var1) {
      return new aaaabaabb(
         Math.max(this.ba, var1.ba), Math.max(this.ab, var1.ab), Math.min(this.aa, var1.aa), Math.min(this.b, var1.b)
      );
   }

   private aaaabaabb(double a, double b, double c, double d) {
      this.ba = a;
      this.ab = b;
      this.aa = c;
      this.b = d;
   }

   private static aaaabaabb ab(double var0, double var2, double var4, double var6) {
      return new aaaabaabb(Math.min(var0, var4), Math.min(var2, var6), Math.max(var0, var4), Math.max(var2, var6));
   }

   public double a() {
      return this.aa;
   }

   public double bb() {
      return this.ab;
   }
}
