package nsc.mixin;

import net.fabricmc.api.EnvType;
import net.fabricmc.api.Environment;
import net.minecraft.class_1799;
import net.minecraft.class_1802;
import net.minecraft.class_310;
import org.spongepowered.asm.mixin.Mixin;
import org.spongepowered.asm.mixin.injection.At;
import org.spongepowered.asm.mixin.injection.Inject;
import org.spongepowered.asm.mixin.injection.callback.CallbackInfoReturnable;
import nsc.aabbba;
import nsc.abaaaaaba;

@Environment(EnvType.CLIENT)
@Mixin({class_1799.class})
public abstract class aabbaaaa {
   @Inject(
      method = {"method_7965"},
      at = {@At("HEAD")},
      cancellable = true
   )
   private void a(CallbackInfoReturnable var1) {
      class_310 var2 = class_310.method_1551();
      abaaaaaba var3 = abaaaaaba.aaaaa();
      if (var2.field_1724 != null && var3 != null && var3.aaba() != null) {
         aabbba var4 = (aabbba)var3.aaba()
            .aababab(aabbba.class);
         class_1799 var5 = (class_1799)this;
         if (var4 != null && var4.babbaab() && var5.method_31574(class_1802.field_8301)) {
            var1.setReturnValue(0);
         }
      }
   }
}
