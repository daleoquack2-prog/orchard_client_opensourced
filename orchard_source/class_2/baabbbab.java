package nsc;

import net.fabricmc.api.EnvType;
import net.fabricmc.api.Environment;

@Environment(EnvType.CLIENT)
record baabbbab(int bY, int bZ, int b0) {
   private final int a;
   private final int b;
   private final int aa;

   private baabbbab(int bY, int bZ, int b0) {
      this.b = bY;
      this.aa = bZ;
      this.a = b0;
   }

   public int a() {
      return this.b;
   }

   public int b() {
      return this.a;
   }
}
