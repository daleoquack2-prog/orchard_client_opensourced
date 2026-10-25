package nsc;

import net.fabricmc.api.EnvType;
import net.fabricmc.api.Environment;
import net.minecraft.class_1268;
import net.minecraft.class_1799;

@Environment(EnvType.CLIENT)
record bbbaaabb(int a, int b, float c, class_1799 d) {
   private final float aa;
   private final int ab;
   private static final long b;
   private final class_1799 ba;
   private final int bb;

   private class_1268 aa() {
      try {
         if (this.bb == (int)b) {
            return class_1268.field_5810;
         }
      } catch (MatchException var1) {
         throw var1;
      }

      return class_1268.field_5808;
   }

   public int a() {
      return this.bb;
   }

   public float b() {
      return this.aa;
   }

   private bbbaaabb(int a, int b, float c, class_1799 d) {
      this.bb = a;
      this.ab = b;
      this.aa = c;
      this.ba = d;
   }

   static {
      long var0 = 3926838090963164413L;
      long var10002 = -6702201691613881131L ^ var0;
      byte var10001 = -1;
      b = var10002;
   }
}
