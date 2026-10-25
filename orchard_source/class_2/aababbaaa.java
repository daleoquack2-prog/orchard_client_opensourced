package nsc;

import net.fabricmc.api.EnvType;
import net.fabricmc.api.Environment;

@Environment(EnvType.CLIENT)
record aababbaaa(String a, int b, int c) {
   private final String aa;
   private final int a;

   public int aa() {
      return this.a;
   }

   public String b() {
      return this.aa;
   }

   public int a() {
      return this.b;
   }

   aababbaaa(String a, int b, int c) {
      this.aa = a;
      this.a = b;
      this.b = c;
   }
}
