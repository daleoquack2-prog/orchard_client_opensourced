package nsc.mixin;

import net.fabricmc.api.EnvType;
import net.fabricmc.api.Environment;
import net.minecraft.class_1297;
import net.minecraft.class_2616;
import net.minecraft.class_2663;
import net.minecraft.class_2672;
import net.minecraft.class_310;
import net.minecraft.class_634;
import net.minecraft.class_8143;
import org.spongepowered.asm.mixin.Mixin;
import org.spongepowered.asm.mixin.injection.At;
import org.spongepowered.asm.mixin.injection.Inject;
import org.spongepowered.asm.mixin.injection.callback.CallbackInfo;
import nsc.aabababb;
import nsc.aabbaaaba;
import nsc.aabbabbbb;
import nsc.abaaaaaba;
import nsc.abbbaa;
import nsc.abbbbaaab;

@Environment(EnvType.CLIENT)
@Mixin({class_634.class})
public abstract class aaabbaabb {
   private static final Integer[] aa;
   private static final long[] b;

   @Inject(
      method = {"method_49034"},
      at = {@At("TAIL")}
   )
   private void b(class_8143 var1, CallbackInfo var2) {
      abaaaaaba var3 = abaaaaaba.aaaaa();
      if (var3 != null && var3.aaba() != null) {
         class_310 var4 = class_310.method_1551();
         if (var4.field_1724 != null && var4.field_1687 != null && var1.comp_1267() == var4.field_1724.method_5628()) {
            aabababb var5 = var3.aaba().aababa();
            if (var5 != null && var5.babbaab()) {
               var5.aba(var1.method_49071(var4.field_1687));
            }
         }
      }
   }

   private static int aa(int var0, long var1) {
      int var3 = var0 ^ (int)(var1 & 32767L) ^ 21827;
      if (aa[var3] == null) {
         aa[var3] = (int)(b[var3] ^ var1);
      }

      return aa[var3];
   }

   @Inject(
      method = {"method_11148"},
      at = {@At("TAIL")}
   )
   private void a(class_2663 var1, CallbackInfo var2) {
      abaaaaaba var3 = abaaaaaba.aaaaa();
      if (var3 != null) {
         class_310 var4 = class_310.method_1551();
         if (var4.field_1687 != null) {
            class_1297 var5 = var1.method_11469(var4.field_1687);
            if (var5 != null && var3.aaba() != null) {
               var3.aaba().bbbbab(var5, var1.method_11470());
            }

            if (var1.method_11470() == aa(11324, 443664277578283391L)) {
               if (var4.field_1724 != null && var5 != null && var5.method_5628() == var4.field_1724.method_5628()) {
                  abbbbaaab var6 = var3.aaba().bbbaaa();
                  if (var6 != null) {
                     var6.baba();
                  }
               }
            }
         }
      }
   }

   @Inject(
      method = {"method_11160"},
      at = {@At("HEAD")}
   )
   private void ab(class_2616 var1, CallbackInfo var2) {
      class_310 var3 = class_310.method_1551();
      if (var3.method_18854()) {
         abaaaaaba var4 = abaaaaaba.aaaaa();
         if (var4 != null && var4.aaba() != null) {
            if (var3.field_1687 != null) {
               class_1297 var5 = var3.field_1687.method_8469(var1.method_11269());
               if (var5 != null) {
                  var4.aaba().abab(var5, var1.method_11267());
               }
            }
         }
      }
   }

   @Inject(
      method = {"method_11128"},
      at = {@At("TAIL")}
   )
   private void ba(class_2672 var1, CallbackInfo var2) {
      abaaaaaba var3 = abaaaaaba.aaaaa();
      class_310 var4 = class_310.method_1551();
      if (var3 != null && var3.aaba() != null && var4.field_1687 != null) {
         abbbaa var5 = (abbbaa)var3.aaba()
            .aababab(abbbaa.class);
         if (var5 != null && var5.babbaab()) {
            var5.aba(var4, var1.method_11523(), var1.method_11524());
         }
      }
   }

   static {
      long var0 = 2881432695720630717L;
      long[] var6 = new long[2];
      int var3 = 0;
      String var4 = "Cþé\u008b`\n á¨{X÷r`\u009d\r";
      int var5 = "Cþé\u008b`\n á¨{X÷r`\u009d\r".length();
      byte var2 = 0;

      do {
         int var10001 = var2;
         var2 += 8;
         byte[] var7 = var4.substring(var10001, var2).getBytes("ISO-8859-1");
         var10001 = var3++;
         long var10004 = (
               (var7[0] & 255L) << 56
                  | (var7[1] & 255L) << 48
                  | (var7[2] & 255L) << 40
                  | (var7[3] & 255L) << 32
                  | (var7[4] & 255L) << 24
                  | (var7[5] & 255L) << 16
                  | (var7[6] & 255L) << 8
                  | var7[7] & 255L
            )
            ^ var0;
         byte var10003 = -1;
         var6[var10001] = var10004;
      } while (var2 < var5);

      b = var6;
      aa = new Integer[2];
   }

   @Inject(
      method = {"method_45729"},
      at = {@At("HEAD")},
      cancellable = true
   )
   private void bb(String var1, CallbackInfo var2) {
      if (aabbaaaba.aaab("VAiEh5mVx9yzwYjwJ9G9mJQngVbYQgmdchnTOOGQdFnb91cWBQRS").baba(var1)) {
         var2.cancel();
         abaaaaaba var3 = abaaaaaba.aaaaa();
         if (var3 != null) {
            var3.aba().bbaab(aabbabbbb.babaabb(aa(4266, 2319258297737102824L)));
            var3.aaa();
         }
      }
   }
}
