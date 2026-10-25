package nsc.mixin;

import net.fabricmc.api.EnvType;
import net.fabricmc.api.Environment;
import net.minecraft.class_1309;
import net.minecraft.class_310;
import org.spongepowered.asm.mixin.Mixin;
import org.spongepowered.asm.mixin.injection.At;
import org.spongepowered.asm.mixin.injection.Inject;
import org.spongepowered.asm.mixin.injection.callback.CallbackInfoReturnable;
import nsc.abaaaaaba;
import nsc.baaabbbb;

@Environment(EnvType.CLIENT)
@Mixin({class_1309.class})
public abstract class bbbaabb {
   @Inject(
      method = {"method_6028"},
      at = {@At("RETURN")},
      cancellable = true,
      require = 0
   )
   private void a(CallbackInfoReturnable var1) {
      class_310 var2 = class_310.method_1551();
      if (var2 != null && var2.field_1724 == this) {
         abaaaaaba var3 = abaaaaaba.aaaaa();
         if (var3 != null) {
            baaabbbb var4 = var3.aaba().aaab();
            if (var4 != null && var4.aab()) {
               var1.setReturnValue(var4.bba((Integer)var1.getReturnValue()));
            }
         }
      }
   }
}
