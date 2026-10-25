package nsc.mixin;

import net.fabricmc.api.EnvType;
import net.fabricmc.api.Environment;
import net.minecraft.class_1297;
import net.minecraft.class_4604;
import org.spongepowered.asm.mixin.Mixin;
import org.spongepowered.asm.mixin.injection.At;
import org.spongepowered.asm.mixin.injection.Inject;
import org.spongepowered.asm.mixin.injection.callback.CallbackInfoReturnable;
import nsc.baaabaab;

@Environment(EnvType.CLIENT)
@Mixin(
   targets = {"net/minecraft/class_898"}
)
public abstract class aabaabab {
   @Inject(
      method = {"method_3950"},
      at = {@At("HEAD")},
      cancellable = true
   )
   private void a(class_1297 var1, class_4604 var2, double var3, double var5, double var7, CallbackInfoReturnable var9) {
      if (baaabaab.aa(var1)) {
         var9.setReturnValue(false);
      }
   }
}
