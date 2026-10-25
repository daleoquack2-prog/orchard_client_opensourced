package nsc;

import net.fabricmc.api.EnvType;
import net.fabricmc.api.Environment;

@Environment(EnvType.CLIENT)
record babaabbb(Object a, abba b) {
   private final abba aa;
   private final Object b;

   private boolean aa(Object var1) {
      try {
         if (this.b == var1) {
            return true;
         }
      } catch (MatchException var2) {
         throw var2;
      }

      return false;
   }

   private babaabbb(Object a, abba b) {
      this.b = a;
      this.aa = b;
   }

   public Object ab() {
      return this.b;
   }

   public abba a() {
      return this.aa;
   }
}
