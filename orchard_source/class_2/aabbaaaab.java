package nsc;

import net.fabricmc.api.EnvType;
import net.fabricmc.api.Environment;

@Environment(EnvType.CLIENT)
record aabbaaaab(double x1, double y1, double x2, double y2, int e) {
   private final int aa;
   private final double ab;
   private final double a;
   private final double ba;
   private final double b;

   public double a() {
      return this.b;
   }

   public double ba() {
      return this.a;
   }

   private aabbaaaab(double x1, double y1, double x2, double y2, int e) {
      this.ab = x1;
      this.ba = y1;
      this.a = x2;
      this.b = y2;
      this.aa = e;
   }

   public double bb() {
      return this.ba;
   }
}
