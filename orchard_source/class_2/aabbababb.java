package nsc;

import net.fabricmc.api.EnvType;
import net.fabricmc.api.Environment;

@Environment(EnvType.CLIENT)
record aabbababb(int a, aaaabbba b) {
   private final aaaabbba aa;
   private final int b;

   private aabbababb(int a, aaaabbba b) {
      this.b = a;
      this.aa = b;
   }

   public int aa() {
      return this.b;
   }

   public aaaabbba a() {
      return this.aa;
   }
}
