package nsc;

import net.fabricmc.api.EnvType;
import net.fabricmc.api.Environment;

@Environment(EnvType.CLIENT)
record aabaaba(
   aababbaaa a, ababbbbab b, boolean c, boolean d
) {
   private final aababbaaa aa;
   private final boolean a;
   private final ababbbbab ab;
   private final boolean b;

   public boolean aa() {
      return this.a;
   }

   public boolean ab() {
      return this.b;
   }

   public ababbbbab ba() {
      return this.ab;
   }

   aabaaba(aababbaaa a, ababbbbab b, boolean c, boolean d) {
      this.aa = a;
      this.ab = b;
      this.b = c;
      this.a = d;
   }

   static aabaaba bb(aababbaaa var0) {
      return new aabaaba(var0, null, true, false);
   }

   static aabaaba b(aababbaaa var0) {
      return new aabaaba(var0, null, false, false);
   }

   static aabaaba aaa(
      aababbaaa var0, ababbbbab var1, boolean var2
   ) {
      return new aabaaba(var0, var1, true, var2);
   }

   public aababbaaa aab() {
      return this.aa;
   }
}
