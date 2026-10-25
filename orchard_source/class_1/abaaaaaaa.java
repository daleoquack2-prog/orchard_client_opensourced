package nsc.mixin;

import java.lang.reflect.Field;
import java.util.ArrayList;
import java.util.List;
import net.fabricmc.api.EnvType;
import net.fabricmc.api.Environment;
import net.minecraft.class_10055;
import net.minecraft.class_11659;
import net.minecraft.class_11890;
import net.minecraft.class_12075;
import net.minecraft.class_1297;
import net.minecraft.class_310;
import net.minecraft.class_4587;
import org.spongepowered.asm.mixin.Mixin;
import org.spongepowered.asm.mixin.injection.At;
import org.spongepowered.asm.mixin.injection.Inject;
import org.spongepowered.asm.mixin.injection.callback.CallbackInfo;
import nsc.aabaabba;
import nsc.aabbaaaba;
import nsc.abaaaaaba;
import nsc.abbbbaaba;
import nsc.bbabbbb;

@Environment(EnvType.CLIENT)
@Mixin(
   targets = {"net/minecraft/class_1007"}
)
public abstract class abaaaaaaa {
   private static class_1297 a(class_10055 var0) {
      if (var0 == null) {
         return null;
      } else {
         class_1297 var1 = ba(var0);
         if (var1 != null) {
            return var1;
         } else {
            Integer var2 = bb(var0);
            if (var2 == null) {
               return null;
            } else {
               class_310 var3 = class_310.method_1551();
               return var3 != null && var3.field_1687 != null ? var3.field_1687.method_8469(var2) : null;
            }
         }
      }
   }

   private static List b(Class var0) {
      ArrayList var1 = new ArrayList();

      for (Class var2 = var0; var2 != null && var2 != Object.class; var2 = var2.getSuperclass()) {
         Field[] var3 = var2.getDeclaredFields();

         for (Field var7 : var3) {
            var1.add(var7);
         }
      }

      return var1;
   }

   @Inject(
      method = {"method_62604"},
      at = {@At("TAIL")},
      require = 0
   )
   private void aa(class_11890 var1, class_10055 var2, float var3, CallbackInfo var4) {
      class_310 var5 = class_310.method_1551();
      abaaaaaba var6 = abaaaaaba.aaaaa();
      abbbbaaba var7 = var6 != null && var6.aaba() != null ? var6.aaba().aabb() : null;
      if (var5 != null && var1 == var5.field_1724 && var7 != null && var7.babbaab()) {
         bbabbbb.baaaab(var5, var2, var3);
      }
   }

   @Inject(
      method = {"method_4213"},
      at = {@At("HEAD")},
      cancellable = true,
      require = 0
   )
   private void ab(class_10055 var1, class_4587 var2, class_11659 var3, class_12075 var4, CallbackInfo var5) {
      if (aabaabba.aaaaa()) {
         class_1297 var6 = a(var1);
         if (var6 != null && aabaabba.ab(var6)) {
            var5.cancel();
         }
      }
   }

   private static class_1297 ba(Object var0) {
      for (Field var2 : b(var0.getClass())) {
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

   private static Integer bb(Object var0) {
      class_310 var1 = class_310.method_1551();
      if (var1 == null) {
         return null;
      } else {
         ArrayList var2 = new ArrayList();

         for (Field var4 : b(var0.getClass())) {
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
