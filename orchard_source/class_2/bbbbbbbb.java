package nsc;

import net.fabricmc.api.EnvType;
import net.fabricmc.api.Environment;

@Environment(EnvType.CLIENT)
record bbbbbbbb(double a, double b, double c, double d) {
   private final double aa;
   private final double ab;

   private bbbbbbbb(double a, double b, double c, double d) {
      this.aa = a;
      this.a = b;
      this.b = c;
      this.ab = d;
   }
}
