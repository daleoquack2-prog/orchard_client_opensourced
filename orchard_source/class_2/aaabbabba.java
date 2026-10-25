package nsc;

import net.fabricmc.api.EnvType;
import net.fabricmc.api.Environment;

@Environment(EnvType.CLIENT)
record aaabbabba(double a, double b) {
   private final double aa;

   private aaabbabba(double a, double b) {
      this.b = a;
      this.aa = b;
   }
}
