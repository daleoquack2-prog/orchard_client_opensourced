package nsc;

import net.fabricmc.api.EnvType;
import net.fabricmc.api.Environment;

@Environment(EnvType.CLIENT)
record abbbaabaa(double x, double z) {
   private final double aa;
   private final double a;

   abbbaabaa(double x, double z) {
      this.aa = x;
      this.a = z;
   }
}
