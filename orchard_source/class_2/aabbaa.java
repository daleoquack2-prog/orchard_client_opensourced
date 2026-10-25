package nsc;

import net.fabricmc.api.EnvType;
import net.fabricmc.api.Environment;

@Environment(EnvType.CLIENT)
record aabbaa(long a, abaabbbaa b, int c) {
   private final abaabbbaa aa;
   private final int b;
   private final long ab;

   public int aa() {
      return this.b;
   }

   private aabbaa(long a, abaabbbaa b, int c) {
      this.ab = a;
      this.aa = b;
      this.b = c;
   }

   public abaabbbaa a() {
      return this.aa;
   }
}
