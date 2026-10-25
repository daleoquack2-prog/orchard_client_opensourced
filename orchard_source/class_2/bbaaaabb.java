package nsc;

import net.fabricmc.api.EnvType;
import net.fabricmc.api.Environment;

@Environment(EnvType.CLIENT)
record bbaaaabb(double x, double y, double width, double height, double distanceSq, long f) {
   private final long aa;
   private final double ab;
   private final double ba;
   private final double bb;
   private final double aaa;
   private final double b;

   public double aa() {
      return this.ba;
   }

   public double ab() {
      return this.aaa;
   }

   public double b() {
      return this.bb;
   }

   private bbaaaabb(double x, double y, double width, double height, double distanceSq, long f) {
      this.b = x;
      this.aaa = y;
      this.ab = width;
      this.ba = height;
      this.bb = distanceSq;
      this.aa = f;
   }

   public double ba() {
      return this.b;
   }

   public double a() {
      return this.ab;
   }

   public long bb() {
      return this.aa;
   }
}
