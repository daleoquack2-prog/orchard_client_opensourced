package nsc;

import net.fabricmc.api.EnvType;
import net.fabricmc.api.Environment;

@Environment(EnvType.CLIENT)
public record aaa(double x, double y, double distanceSq) {
   private final double aa;
   private final double ab;
   private final double b;

   public double ab() {
      return this.b;
   }

   public aaa(double x, double y, double distanceSq) {
      this.b = x;
      this.ab = y;
      this.aa = distanceSq;
   }

   public double a() {
      return this.ab;
   }
}
