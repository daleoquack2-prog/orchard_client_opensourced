package nsc;

import net.fabricmc.api.EnvType;
import net.fabricmc.api.Environment;

@Environment(EnvType.CLIENT)
record bbaababa(double b_, double ca, double cb) {
   private final double a;
   private final double b;
   private final double aa;

   public double a() {
      return this.b;
   }

   private bbaababa(double b_, double ca, double cb) {
      this.b = b_;
      this.aa = ca;
      this.a = cb;
   }

   public double b() {
      return this.aa;
   }

   public double aa() {
      return this.a;
   }
}
