package nsc.mixin;

import net.fabricmc.api.EnvType;
import net.fabricmc.api.Environment;
import net.minecraft.class_1747;
import net.minecraft.class_1750;
import net.minecraft.class_2246;
import net.minecraft.class_2680;
import org.spongepowered.asm.mixin.Mixin;
import org.spongepowered.asm.mixin.Shadow;
import org.spongepowered.asm.mixin.injection.At;
import org.spongepowered.asm.mixin.injection.Inject;
import org.spongepowered.asm.mixin.injection.callback.CallbackInfoReturnable;
import nsc.aababbb;
import nsc.abaaaaaba;
import nsc.abaaabbba;
import nsc.babababa;

@Environment(EnvType.CLIENT)
@Mixin({class_1747.class})
public abstract class baaabaa {
   @Shadow
   protected abstract boolean method_20360();

   @Inject(
      method = {"method_7709"},
      at = {@At("HEAD")},
      cancellable = true
   )
   private void a(class_1750 var1, class_2680 var2, CallbackInfoReturnable var3) {
      abaaaaaba var4 = abaaaaaba.aaaaa();
      aababbb var5 = var4 != null && var4.aaba() != null ? var4.aaba().abaaaaa() : null;
      babababa var6 = var4 != null && var4.aaba() != null ? var4.aaba().aaabaaa() : null;
      abaaabbba var7 = var4 != null && var4.aaba() != null ? var4.aaba().bbbaa() : null;
      if (var2.method_27852(class_2246.field_10343) && (var5 != null && var5.babbaab() || var6 != null && var6.aba() || var7 != null && var7.bbaaa())) {
         var3.setReturnValue(!this.method_20360() || var2.method_26184(var1.method_8045(), var1.method_8037()));
      }
   }
}
