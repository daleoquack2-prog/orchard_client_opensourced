package nsc;

import net.fabricmc.api.EnvType;
import net.fabricmc.api.Environment;
import net.minecraft.class_1657;

@Environment(EnvType.CLIENT)
record baabbb(class_1657 a, double b, double c, double d, double e) {
   private final double aa;
   private final class_1657 ab;
   private final double a;
   private final double ba;

   private baabbb(class_1657 a, double b, double c, double d, double e) {
      this.ab = a;
      this.ba = b;
      this.b = c;
      this.aa = d;
      this.a = e;
   }

   public double aa() {
      return this.a;
   }

   public double a() {
      return this.b;
   }

   public double ba() {
      return this.aa;
   }

   public double bb() {
      return this.ba;
   }
}
