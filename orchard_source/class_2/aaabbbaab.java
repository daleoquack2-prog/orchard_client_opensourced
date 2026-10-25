package nsc;

import net.fabricmc.api.EnvType;
import net.fabricmc.api.Environment;

@Environment(EnvType.CLIENT)
record aaabbbaab(double a, long b) {
   private final long aa;
   private final double b;

   private aaabbbaab(double a, long b) {
      this.b = a;
      this.aa = b;
   }
}
