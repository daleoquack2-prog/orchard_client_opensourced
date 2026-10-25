package nsc.mixin;

import java.lang.reflect.Field;
import java.util.ArrayList;
import java.util.List;
import net.fabricmc.api.EnvType;
import net.fabricmc.api.Environment;
import net.minecraft.class_10017;
import net.minecraft.class_11659;
import net.minecraft.class_11785;
import net.minecraft.class_12075;
import net.minecraft.class_12249;
import net.minecraft.class_1297;
import net.minecraft.class_1657;
import net.minecraft.class_243;
import net.minecraft.class_2561;
import net.minecraft.class_310;
import net.minecraft.class_327;
import net.minecraft.class_4587;
import net.minecraft.class_4588;
import net.minecraft.class_5250;
import net.minecraft.class_897;
import net.minecraft.class_4587.class_4665;
import org.spongepowered.asm.mixin.Mixin;
import org.spongepowered.asm.mixin.Shadow;
import org.spongepowered.asm.mixin.injection.At;
import org.spongepowered.asm.mixin.injection.Inject;
import org.spongepowered.asm.mixin.injection.Redirect;
import org.spongepowered.asm.mixin.injection.callback.CallbackInfo;
import nsc.aaabbaaab;
import nsc.aabbaaaba;
import nsc.abbbbaba;
import nsc.babaaabb;

@Environment(EnvType.CLIENT)
@Mixin({class_897.class})
public abstract class babaaaab {
   private static final long b;

   @Inject(
      method = {"method_3926"},
      at = {@At("HEAD")}
   )
   private void a(class_10017 var1, class_4587 var2, class_11659 var3, class_12075 var4, CallbackInfo var5) {
      var1.field_53337 = this.abb(var1, var1.field_53337);
   }

   private void b(float var1, float var2, float var3, float var4, int var5, class_4665 var6, class_4588 var7) {
      this.ba(var7, var6, var1, var2, var3, var4, var5);
   }

   private static class_1297 aa(Object var0) {
      if (var0 == null) {
         return null;
      } else {
         class_1297 var1 = aab(var0);
         if (var1 != null) {
            return var1;
         } else {
            Integer var2 = baa(var0);
            if (var2 == null) {
               return null;
            } else {
               class_310 var3 = class_310.method_1551();
               return var3 != null && var3.field_1687 != null ? var3.field_1687.method_8469(var2) : null;
            }
         }
      }
   }

   @Redirect(
      method = {"method_3926"},
      at = @At(
         value = "INVOKE",
         target = "Lnet/minecraft/class_11785;method_73482(Lnet/minecraft/class_4587;Lnet/minecraft/class_243;ILnet/minecraft/class_2561;ZIDLnet/minecraft/class_12075;)V"
      )
   )
   private void ab(
      class_11785 var1,
      class_4587 var2,
      class_243 var3,
      int var4,
      class_2561 var5,
      boolean var6,
      int var7,
      double var8,
      class_12075 var10,
      class_10017 var11,
      class_4587 var12,
      class_11659 var13,
      class_12075 var14
   ) {
      class_2561 var15 = this.abb(var11, var5);
      aaabbaaab var16 = abbbbaba.bbab(var5);
      if (var16 == null) {
         var1.method_73482(var2, var3, var4, var15, var6, var7, var8, var10);
      } else {
         class_2561 var17 = this.aba(var15, var16.aa());
         this.bb(var13, var12, var3, var4, var7, var14, var17, var16);
         var1.method_73482(var2, var3, var4, var17, var6, var7, var8, var10);
      }
   }

   private void ba(class_4588 var1, class_4665 var2, float var3, float var4, float var5, float var6, int var7) {
      var1.method_56824(var2, var3, var4 + var6, 0.0F).method_22913(0.0F, 1.0F).method_39415(-1).method_60803(var7);
      var1.method_56824(var2, var3 + var5, var4 + var6, 0.0F).method_22913(1.0F, 1.0F).method_39415(-1).method_60803(var7);
      var1.method_56824(var2, var3 + var5, var4, 0.0F).method_22913(1.0F, 0.0F).method_39415(-1).method_60803(var7);
      var1.method_56824(var2, var3, var4, 0.0F).method_22913(0.0F, 0.0F).method_39415(-1).method_60803(var7);
   }

   private void bb(
      class_11659 var1, class_4587 var2, class_243 var3, int var4, int var5, class_12075 var6, class_2561 var7, aaabbaaab var8
   ) {
      class_327 var9 = this.method_3932();
      if (var1 != null && var2 != null && var6 != null && var9 != null && var7 != null && var8 != null) {
         int var10 = var9.method_27525(var7);
         float var11 = -var10 / 2.0F;
         float var12 = var4 + (9.0F - var8.a()) / 2.0F;
         float var13 = var8.bbb();
         float var14 = var8.a();
         var2.method_22903();
         var2.method_22904(var3.field_1352, var3.field_1351 + 0.5, var3.field_1350);
         var2.method_22907(var6.field_63081);
         var2.method_22905(0.025F, -0.025F, 0.025F);
         var1.method_73483(var2, class_12249.method_76000(var8.ab()), this::b);
         var2.method_22909();
      }
   }

   private static List aaa(Class var0) {
      ArrayList var1 = new ArrayList();

      for (Class var2 = var0; var2 != null && var2 != Object.class; var2 = var2.getSuperclass()) {
         Field[] var3 = var2.getDeclaredFields();

         for (Field var7 : var3) {
            var1.add(var7);
         }
      }

      return var1;
   }

   private static class_1297 aab(Object var0) {
      for (Field var2 : aaa(var0.getClass())) {
         if (class_1297.class.isAssignableFrom(var2.getType())) {
            try {
               var2.setAccessible(true);
               if (var2.get(var0) instanceof class_1297 var4) {
                  return var4;
               }
            } catch (ReflectiveOperationException var5) {
            }
         }
      }

      return null;
   }

   private class_2561 aba(class_2561 var1, int var2) {
      class_327 var3 = this.method_3932();
      if (var1 != null && var3 != null && var2 > 0) {
         StringBuilder var4 = new StringBuilder(aabbaaaba.abba("Ug6X"));
         class_5250 var5 = class_2561.method_43470(var4.toString()).method_10852(var1.method_27661());

         for (int var6 = var3.method_27525(var1);
            var3.method_27525(var5) - var6 < var2;
            var5 = class_2561.method_43470(var4.toString()).method_10852(var1.method_27661())
         ) {
            var4.append((char)((int)b));
         }

         return var5;
      } else {
         return var1;
      }
   }

   static {
      long var0 = 851075943874137240L;
      long var10002 = 4239495971492302008L ^ var0;
      byte var10001 = -1;
      b = var10002;
   }

   private class_2561 abb(class_10017 var1, class_2561 var2) {
      if (var2 == null) {
         return null;
      } else {
         boolean var3 = babaaabb.ba();
         boolean var4 = abbbbaba.aa();
         if (!var3 && !var4) {
            return var2;
         } else {
            class_2561 var5 = var2;
            if (var3) {
               var5 = aa(var1) instanceof class_1657 var7
                  ? babaaabb.aaa(var7.method_7334(), var2)
                  : babaaabb.aab(var2);
            }

            return var4 ? abbbbaba.abab(var5) : var5;
         }
      }
   }

   @Shadow
   public abstract class_327 method_3932();

   private static Integer baa(Object var0) {
      class_310 var1 = class_310.method_1551();
      if (var1 == null) {
         return null;
      } else {
         ArrayList var2 = new ArrayList();

         for (Field var4 : aaa(var0.getClass())) {
            Class var5 = var4.getType();
            if (var5 == int.class || var5 == Integer.class) {
               try {
                  var4.setAccessible(true);
                  if (var4.get(var0) instanceof Integer var7 && var7 >= 0) {
                     String var8 = var4.getName().toLowerCase();
                     if ((
                           var8.equals(aabbaaaba.abba("+KRuSg=="))
                              || var8.contains(aabbaaaba.abba("FEgTJbUCT90nag=="))
                              || var8.contains(aabbaaaba.abba("SxckNNe5KpjWdRo="))
                        )
                        && (var1.field_1687 == null || var1.field_1687.method_8469(var7) != null)) {
                        return var7;
                     }

                     var2.add(var7);
                  }
               } catch (ReflectiveOperationException var9) {
               }
            }
         }

         if (var1.field_1687 != null) {
            for (Integer var11 : var2) {
               if (var1.field_1687.method_8469(var11) != null) {
                  return var11;
               }
            }
         }

         return !var2.isEmpty() ? (Integer)var2.get(0) : null;
      }
   }
}
