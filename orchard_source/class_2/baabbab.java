package nsc;

import net.fabricmc.api.EnvType;
import net.fabricmc.api.Environment;

@Environment(EnvType.CLIENT)
record baabbab(double x, double y, double w, double h) {
   private final double aa;
   private final double ab;
   private final double b;
   private final double a;

   private baabbab(double x, double y, double w, double h) {
      this.b = x;
      this.ab = y;
      this.aa = w;
      this.a = h;
   }

   public double ab() {
      return this.a;
   }

   public double ba() {
      return this.ab;
   }
}
