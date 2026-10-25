package nsc;

import net.fabricmc.api.EnvType;
import net.fabricmc.api.Environment;

@Environment(EnvType.CLIENT)
record bababaa(String a, String b, boolean c) {
   private final String aa;
   private final boolean b;
   private final String ab;

   private bababaa(String a, String b, boolean c) {
      this.ab = a;
      this.aa = b;
      this.b = c;
   }

   public boolean aa() {
      return this.b;
   }

   public String ab() {
      return this.aa;
   }

   public String b() {
      return this.ab;
   }
}
