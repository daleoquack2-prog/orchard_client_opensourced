package nsc;

import net.fabricmc.api.EnvType;
import net.fabricmc.api.Environment;

@Environment(EnvType.CLIENT)
record abbabbbb(float a, float b) {
   private final float aa;

   private abbabbbb(float a, float b) {
      this.b = a;
      this.aa = b;
   }
}
