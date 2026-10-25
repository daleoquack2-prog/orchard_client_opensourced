package nsc;

import net.fabricmc.api.EnvType;
import net.fabricmc.api.Environment;

@Environment(EnvType.CLIENT)
record aababa(float a, float aO) {
   private final float b;

   private aababa(float a, float aO) {
      this.b = a;
      this.a = aO;
   }
}
