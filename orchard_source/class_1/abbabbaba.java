package nsc.mixin;

import net.fabricmc.api.EnvType;
import net.fabricmc.api.Environment;
import net.minecraft.class_4184;
import org.spongepowered.asm.mixin.Mixin;
import org.spongepowered.asm.mixin.injection.At;
import org.spongepowered.asm.mixin.injection.Inject;
import org.spongepowered.asm.mixin.injection.callback.CallbackInfoReturnable;
import nsc.aaaababab;

@Environment(EnvType.CLIENT)
@Mixin({class_4184.class})
public abstract class abbabbaba {
   @Inject(
      method = {"method_19318(F)F"},
      at = {@At("HEAD")},
      cancellable = true,
      require = 0
   )
   private void a(float var1, CallbackInfoReturnable var2) {
      if (aaaababab.aa()) {
         var2.setReturnValue(var1);
      }
   }
}
