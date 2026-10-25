package nsc;

import net.fabricmc.api.EnvType;
import net.fabricmc.api.Environment;

@Environment(EnvType.CLIENT)
record abaaaabbb(double a) {
   private final double b;

   private abaaaabbb(double a) {
      this.b = a;
   }
}
