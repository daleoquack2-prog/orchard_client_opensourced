package nsc.mixin;

import net.fabricmc.api.EnvType;
import net.fabricmc.api.Environment;
import net.minecraft.class_1297;
import net.minecraft.class_897;
import org.spongepowered.asm.mixin.Mixin;
import org.spongepowered.asm.mixin.injection.At;
import org.spongepowered.asm.mixin.injection.Inject;
import org.spongepowered.asm.mixin.injection.callback.CallbackInfoReturnable;
import nsc.aabaabba;
import nsc.baaabaab;

@Environment(EnvType.CLIENT)
@Mixin({class_897.class})
public abstract class abbbbaaa {
   @Inject(
      method = {"method_3921"},
      at = {@At("HEAD")},
      cancellable = true,
      require = 0
   )
   private void a(class_1297 var1, double var2, CallbackInfoReturnable var4) {
      if (baaabaab.ab(var1) || aabaabba.ab(var1)) {
         var4.setReturnValue(false);
      }
   }
}
