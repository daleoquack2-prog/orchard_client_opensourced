package nsc.mixin;

import net.fabricmc.api.EnvType;
import net.fabricmc.api.Environment;
import net.minecraft.class_1309;
import net.minecraft.class_310;
import net.minecraft.class_6880;
import org.spongepowered.asm.mixin.Mixin;
import org.spongepowered.asm.mixin.injection.At;
import org.spongepowered.asm.mixin.injection.Inject;
import org.spongepowered.asm.mixin.injection.callback.CallbackInfoReturnable;
import nsc.abaaaaaba;
import nsc.babaaa;

@Environment(EnvType.CLIENT)
@Mixin({class_1309.class})
public abstract class baaaabb {
   private boolean a(class_6880 var1) {
      class_310 var2 = class_310.method_1551();
      if (var2 != null && var2.field_1724 != null && var2.field_1724 == this) {
         abaaaaaba var3 = abaaaaaba.aaaaa();
         if (var3 == null) {
            return false;
         } else {
            babaaa var4 = (babaaa)var3.aaba()
               .aababab(babaaa.class);
            return var4 != null && var4.aa(var1);
         }
      } else {
         return false;
      }
   }

   @Inject(
      method = {"method_66279"},
      at = {@At("HEAD")},
      cancellable = true
   )
   private void b(class_6880 var1, float var2, CallbackInfoReturnable var3) {
      if (this.a(var1)) {
         var3.setReturnValue(0.0F);
      }
   }
}
