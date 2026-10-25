package nsc.mixin;

import net.fabricmc.api.EnvType;
import net.fabricmc.api.Environment;
import net.minecraft.class_1294;
import net.minecraft.class_1297;
import net.minecraft.class_310;
import net.minecraft.class_5636;
import net.minecraft.class_6880;
import net.minecraft.class_7286;
import org.spongepowered.asm.mixin.Mixin;
import org.spongepowered.asm.mixin.Shadow;
import org.spongepowered.asm.mixin.injection.At;
import org.spongepowered.asm.mixin.injection.Inject;
import org.spongepowered.asm.mixin.injection.callback.CallbackInfoReturnable;
import nsc.abaaaaaba;
import nsc.babaaa;

@Environment(EnvType.CLIENT)
@Mixin({class_7286.class})
public abstract class abbabaaba {
   @Shadow
   public abstract class_6880 method_42590();

   @Inject(
      method = {"method_42593"},
      at = {@At("HEAD")},
      cancellable = true
   )
   private void a(class_5636 var1, class_1297 var2, CallbackInfoReturnable var3) {
      if (this.b(var2)) {
         var3.setReturnValue(false);
      }
   }

   private boolean b(class_1297 var1) {
      class_310 var2 = class_310.method_1551();
      if (var2 != null && var2.field_1724 != null && var1 == var2.field_1724) {
         class_6880 var3 = this.method_42590();
         if (!class_1294.field_5919.equals(var3) && !class_1294.field_38092.equals(var3)) {
            return false;
         } else {
            abaaaaaba var4 = abaaaaaba.aaaaa();
            if (var4 == null) {
               return false;
            } else {
               babaaa var5 = (babaaa)var4.aaba()
                  .aababab(babaaa.class);
               return var5 != null && var5.aa(var3);
            }
         }
      } else {
         return false;
      }
   }
}
