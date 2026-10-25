package nsc.mixin;

import net.fabricmc.api.EnvType;
import net.fabricmc.api.Environment;
import net.minecraft.class_1297;
import net.minecraft.class_310;
import org.spongepowered.asm.mixin.Mixin;
import org.spongepowered.asm.mixin.Unique;
import org.spongepowered.asm.mixin.injection.At;
import org.spongepowered.asm.mixin.injection.Inject;
import org.spongepowered.asm.mixin.injection.callback.CallbackInfo;
import nsc.abaaaaaba;
import nsc.ababb;
import nsc.abbaab;
import nsc.bbabbaaa;
import nsc.bbbbbabb;

@Environment(EnvType.CLIENT)
@Mixin({class_1297.class})
public abstract class ababbabba {
   @Unique
   private static final int aa;
   @Unique
   private static final int ab;
   @Unique
   private ababb ba = ababb.aa;
   @Unique
   private static final int bb = 0;
   private static final Integer[] aaa;
   @Unique
   private float b;
   @Unique
   private float aab;
   private static final long[] aba;
   @Unique
   private int a;
   @Unique
   private static final int abb = 1;

   @Inject(
      method = {"method_5872"},
      at = {@At("HEAD")}
   )
   private void b(double var1, double var3, CallbackInfo var5) {
      this.a = 0;
      this.ba = ababb.aa;
      abaaaaaba var6 = abaaaaaba.aaaaa();
      class_1297 var7 = (class_1297)this;
      class_310 var8 = class_310.method_1551();
      if (var6 != null && var7 == var8.field_1724) {
         bbabbaaa var9 = var6.aaba().aaaaaba();
         bbbbbabb var10 = var6.aaba().ababbab();
         ababb var11 = abbaab.ba();
         if (var9 != null && var9.babbaab()) {
            this.a = 1;
         } else if (var10 != null && var10.ababaa()) {
            this.a = aa(14040, 1069588419841742049L);
         } else {
            if (var11 == ababb.aa) {
               return;
            }

            this.a = aa(7082, 1467693326287305104L);
            this.ba = var11;
         }

         this.aab = var7.method_36454();
         this.b = var7.method_36455();
      }
   }

   static {
      long var0 = 736811869148888295L;
      long[] var6 = new long[4];
      int var3 = 0;
      String var4 = "$7I\u008bêòr°I}E\u0081fyÅt";
      int var5 = "$7I\u008bêòr°I}E\u0081fyÅt".length();
      byte var2 = 0;

      label20:
      while (true) {
         int var10001 = var2;
         var2 += 8;
         byte[] var7 = var4.substring(var10001, var2).getBytes("ISO-8859-1");
         long[] var10000 = var6;
         var10001 = var3++;
         long var10002 = (var7[0] & 255L) << 56
            | (var7[1] & 255L) << 48
            | (var7[2] & 255L) << 40
            | (var7[3] & 255L) << 32
            | (var7[4] & 255L) << 24
            | (var7[5] & 255L) << 16
            | (var7[6] & 255L) << 8
            | var7[7] & 255L;
         byte var10003 = -1;

         while (true) {
            long var13 = var10002 ^ var0;
            switch (var10003) {
               case 0:
                  var10000[var10001] = var13;
                  if (var2 >= var5) {
                     aba = var6;
                     aaa = new Integer[4];
                     ab = aa(1408, 3230346478213228472L);
                     aa = aa(11375, 373444581709794900L);
                     return;
                  }
                  break;
               default:
                  var10000[var10001] = var13;
                  if (var2 < var5) {
                     continue label20;
                  }

                  var4 = "\u001a6\u009b¸\u0082`è\u0004ýVåÎ\u0001¼[]";
                  var5 = "\u001a6\u009b¸\u0082`è\u0004ýVåÎ\u0001¼[]".length();
                  var2 = 0;
            }

            byte var10 = var2;
            var2 += 8;
            var7 = var4.substring(var10, var2).getBytes("ISO-8859-1");
            var10000 = var6;
            var10001 = var3++;
            var10002 = (var7[0] & 255L) << 56
               | (var7[1] & 255L) << 48
               | (var7[2] & 255L) << 40
               | (var7[3] & 255L) << 32
               | (var7[4] & 255L) << 24
               | (var7[5] & 255L) << 16
               | (var7[6] & 255L) << 8
               | var7[7] & 255L;
            var10003 = 0;
         }
      }
   }

   private static int aa(int var0, long var1) {
      int var3 = var0 ^ (int)(var1 & 32767L) ^ 25147;
      if (aaa[var3] == null) {
         aaa[var3] = (int)(aba[var3] ^ var1);
      }

      return aaa[var3];
   }

   @Inject(
      method = {"method_5872"},
      at = {@At("TAIL")}
   )
   private void a(double var1, double var3, CallbackInfo var5) {
      if (this.a != 0) {
         class_1297 var6 = (class_1297)this;
         class_310 var7 = class_310.method_1551();
         abaaaaaba var8 = abaaaaaba.aaaaa();

         try {
            if (var6 != var7.field_1724) {
               return;
            }

            float var9 = var6.method_36454();
            float var10 = var6.method_36455();
            if (var8 != null && this.a == 1) {
               bbabbaaa var15 = var8.aaba().aaaaaba();
               if (var15 != null) {
                  var15.aa(this.aab, this.b, var9, var10);
               }
            } else if (var8 != null && this.a == 2) {
               bbbbbabb var11 = var8.aaba().ababbab();
               if (var11 != null) {
                  var11.babaab(this.aab, this.b, var9, var10);
               }
            } else if (this.a == 3) {
               abbaab.aaa(this.ba, this.aab, this.b, var9, var10);
            }
         } finally {
            if (var6 == var7.field_1724) {
               var6.method_36456(this.aab);
               var6.method_36457(this.b);
            }

            this.a = 0;
            this.ba = ababb.aa;
         }
      }
   }
}
