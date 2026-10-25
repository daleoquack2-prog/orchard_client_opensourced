package nsc;

import net.fabricmc.api.EnvType;
import net.fabricmc.api.Environment;

@Environment(EnvType.CLIENT)
record aaaabaaba(int bB, int bC, int bD) {
   private final int a;
   private final int b;
   private final int aa;

   public int a() {
      return this.b;
   }

   public int b() {
      return this.aa;
   }

   private aaaabaaba(int bB, int bC, int bD) {
      this.b = bB;
      this.aa = bC;
      this.a = bD;
   }

   public int aa() {
      return this.a;
   }
}
