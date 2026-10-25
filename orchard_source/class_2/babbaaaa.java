package nsc;

import net.fabricmc.api.EnvType;
import net.fabricmc.api.Environment;

@Environment(EnvType.CLIENT)
public record babbaaaa(double minX, double minY, double maxX, double maxY) {
   private final double aa;
   private final double ab;
   private final double b;
   private final double a;

   public double aa() {
      return (this.b + this.aa) * 0.5;
   }

   public double ab() {
      return this.b;
   }

   public double ba() {
      return this.aa - this.b;
   }

   public double a() {
      return this.ab;
   }

   public double bb() {
      return this.a - this.ab;
   }

   public double b() {
      return this.a;
   }

   public double aaa() {
      return (this.ab + this.a) * 0.5;
   }

   public babbaaaa(double minX, double minY, double maxX, double maxY) {
      this.b = minX;
      this.ab = minY;
      this.aa = maxX;
      this.a = maxY;
   }

   public double aab() {
      return this.aa;
   }
}
