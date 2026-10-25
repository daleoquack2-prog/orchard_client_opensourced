package nsc.mixin;

import net.fabricmc.api.EnvType;
import net.fabricmc.api.Environment;
import net.minecraft.class_310;
import net.minecraft.class_634;
import net.minecraft.class_7439;
import org.spongepowered.asm.mixin.Mixin;
import org.spongepowered.asm.mixin.injection.At;
import org.spongepowered.asm.mixin.injection.Inject;
import org.spongepowered.asm.mixin.injection.callback.CallbackInfo;
import nsc.aaababaaa;

@Environment(EnvType.CLIENT)
@Mixin({class_634.class})
public abstract class abbaaabbb {
   @Inject(
      method = {"method_43596"},
      at = {@At("HEAD")},
      require = 0
   )
   private void a(class_7439 var1, CallbackInfo var2) {
      if (class_310.method_1551().method_18854()) {
         if (var1 != null && var1.comp_763() != null) {
            aaababaaa.ab(var1.comp_763().getString());
         }
      }
   }
}
