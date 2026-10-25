package nsc.mixin;

import java.util.HashMap;
import java.util.Map;
import net.fabricmc.api.EnvType;
import net.fabricmc.api.Environment;
import net.minecraft.class_2561;
import net.minecraft.class_327;
import net.minecraft.class_332;
import net.minecraft.class_355;
import net.minecraft.class_640;
import org.spongepowered.asm.mixin.Mixin;
import org.spongepowered.asm.mixin.Shadow;
import org.spongepowered.asm.mixin.Unique;
import org.spongepowered.asm.mixin.injection.At;
import org.spongepowered.asm.mixin.injection.Inject;
import org.spongepowered.asm.mixin.injection.Redirect;
import org.spongepowered.asm.mixin.injection.callback.CallbackInfo;
import org.spongepowered.asm.mixin.injection.callback.CallbackInfoReturnable;
import nsc.aababaaba;
import nsc.abaaaab;
import nsc.abbbbaba;
import nsc.babaaabb;
import nsc.bbabaa;

@Environment(EnvType.CLIENT)
@Mixin({class_355.class})
public abstract class aabaaabba {
   private static final long[] aa;
   @Unique
   private final Map a = new HashMap();
   private static final Integer[] ab;

   private static int b(int var0, long var1) {
      int var3 = var0 ^ (int)(var1 & 32767L) ^ 25402;
      if (ab[var3] == null) {
         ab[var3] = (int)(aa[var3] ^ var1);
      }

      return ab[var3];
   }

   @Inject(
      method = {"method_1919"},
      at = {@At("RETURN")}
   )
   private void a(CallbackInfo var1) {
      aababaaba.aaa();
   }

   @Inject(
      method = {"method_1918"},
      at = {@At("RETURN")},
      cancellable = true
   )
   private void aa(class_640 var1, CallbackInfoReturnable var2) {
      class_2561 var3 = abaaaab.abba(var1, (class_2561)var2.getReturnValue());
      var3 = babaaabb.ab(var1, var3);
      class_2561 var4 = bbabaa.aba(var1, var3);
      if (var4 != null) {
         this.a.put(var4.getString(), var1);
      }

      var2.setReturnValue(var4);
   }

   @Redirect(
      method = {"method_1919"},
      at = @At(
         value = "INVOKE",
         target = "Lnet/minecraft/class_332;drawTextWithShadow(Lnet/minecraft/class_327;Lnet/minecraft/class_2561;III)I"
      )
   )
   private int ab(class_332 var1, class_327 var2, class_2561 var3, int var4, int var5, int var6) {
      class_640 var7 = (class_640)this.a.remove(var3.getString());
      int var8 = abbbbaba.bbba(var1, var7, var2, var4, var5);
      aababaaba.ab(
         var4 - b(27654, 7636646760543457085L),
         var5 - 1,
         var4 + var8 + var2.method_27525(var3) + b(8007, 525252321845640319L),
         var5 + b(57, 7327779708814222083L)
      );
      var1.method_27535(var2, var3, var4 + var8, var5, var6);
      return 0;
   }

   @Shadow
   public abstract class_2561 method_1918(class_640 var1);

   static {
      long var0 = 1795529463235435836L;
      long[] var6 = new long[3];
      int var3 = 0;
      String var4 = "|\u0019©\u0085·Ê¾7ÊV\rD\u0002±Ò\u000b®\u000f¢\u0015²ë¡-";
      int var5 = "|\u0019©\u0085·Ê¾7ÊV\rD\u0002±Ò\u000b®\u000f¢\u0015²ë¡-".length();
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

      aa = var6;
      ab = new Integer[3];
   }

   @Inject(
      method = {"method_1919"},
      at = {@At("HEAD")}
   )
   private void ba(CallbackInfo var1) {
      this.a.clear();
      aababaaba.b();
   }
}
