package nsc.mixin;

import net.fabricmc.api.EnvType;
import net.fabricmc.api.Environment;
import net.minecraft.class_1297;
import org.spongepowered.asm.mixin.Mixin;
import org.spongepowered.asm.mixin.injection.At;
import org.spongepowered.asm.mixin.injection.Inject;
import org.spongepowered.asm.mixin.injection.callback.CallbackInfoReturnable;
import nsc.aaaabba;

@Environment(EnvType.CLIENT)
@Mixin({class_1297.class})
public abstract class aabaaabb {
   @Inject(
      method = {"method_22861"},
      at = {@At("HEAD")},
      cancellable = true
   )
   private void a(CallbackInfoReturnable var1) {
      class_1297 var2 = (class_1297)this;
      if (aaaabba.ab(var2.method_5667())) {
         var1.setReturnValue(aaaabba.aaa(var2.method_5667()));
      }
   }

   @Inject(
      method = {"method_5851"},
      at = {@At("HEAD")},
      cancellable = true
   )
   private void b(CallbackInfoReturnable var1) {
      class_1297 var2 = (class_1297)this;
      if (aaaabba.ab(var2.method_5667())) {
         var1.setReturnValue(true);
      }
   }
}
