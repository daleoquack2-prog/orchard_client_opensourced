package nsc;

import net.fabricmc.api.EnvType;
import net.fabricmc.api.Environment;

@Environment(EnvType.CLIENT)
public record abaaababa(double b6, double b7, double b8, double b9) {
   private final double a;
   private final double b;
   private final double aa;
   private final double ab;

   public abaaababa(double b6, double b7, double b8, double b9) {
      this.a = b6;
      this.b = b7;
      this.aa = b8;
      this.ab = b9;
   }

   public double a() {
      return this.aa;
   }

   public double b() {
      return this.a;
   }

   public double aa() {
      return this.ab;
   }

   public double ab() {
      return this.b;
   }
}
