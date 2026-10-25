package nsc;

import java.util.List;
import java.util.concurrent.ThreadLocalRandom;
import net.fabricmc.api.EnvType;
import net.fabricmc.api.Environment;

@Environment(EnvType.CLIENT)
record aabbabab(List<Integer> a, int b) {
   private final int aa;
   private final List b;

   boolean aa() {
      int var1 = baaabbaa.bba;

      try {
         if (var1 != 0) {
            return (boolean)this.aa;
         }

         if (this.aa > 0) {
            return (boolean)1;
         }
      } catch (MatchException var2) {
         throw var2;
      }

      return (boolean)0;
   }

   private aabbabab(List a, int b) {
      this.b = a;
      this.aa = b;
   }

   public int a() {
      return this.aa;
   }

   boolean ab() {
      int var1 = baaabbaa.bba;

      try {
         boolean var10000 = this.b.isEmpty();
         if (var1 != 0) {
            return var10000;
         }

         if (!var10000) {
            return true;
         }
      } catch (MatchException var2) {
         throw var2;
      }

      return false;
   }

   int ba() {
      return (Integer)this.b.get(ThreadLocalRandom.current().nextInt(this.b.size()));
   }
}
