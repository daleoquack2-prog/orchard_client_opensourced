package nsc;

import net.fabricmc.api.EnvType;
import net.fabricmc.api.Environment;

@Environment(EnvType.CLIENT)
record bbbbaab(int ae, float af, float ag) {
   private final float a;
   private final float b;
   private final int aa;

   public int a() {
      return this.aa;
   }

   public float aa() {
      return this.a;
   }

   private bbbbaab(int ae, float af, float ag) {
      this.aa = ae;
      this.a = af;
      this.b = ag;
   }
}
