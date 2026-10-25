package nsc.mixin;

import net.fabricmc.api.EnvType;
import net.fabricmc.api.Environment;
import net.minecraft.class_1657;
import net.minecraft.class_2561;
import org.spongepowered.asm.mixin.Mixin;
import org.spongepowered.asm.mixin.injection.At;
import org.spongepowered.asm.mixin.injection.Inject;
import org.spongepowered.asm.mixin.injection.callback.CallbackInfoReturnable;
import nsc.abaaaab;
import nsc.babaaabb;
import nsc.bbabaa;

@Environment(EnvType.CLIENT)
@Mixin({class_1657.class})
public abstract class bbbbaaba {
   @Inject(
      method = {"method_5476"},
      at = {@At("RETURN")},
      cancellable = true,
      require = 0
   )
   private void a(CallbackInfoReturnable var1) {
      class_1657 var2 = (class_1657)this;
      class_2561 var3 = babaaabb.aaa(var2.method_7334(), (class_2561)var1.getReturnValue());
      var1.setReturnValue(abaaaab.aaaa(var2, bbabaa.aaaa(var2, var3)));
   }

   @Inject(
      method = {"method_5477"},
      at = {@At("RETURN")},
      cancellable = true,
      require = 0
   )
   private void b(CallbackInfoReturnable var1) {
      class_1657 var2 = (class_1657)this;
      class_2561 var3 = babaaabb.aaa(var2.method_7334(), (class_2561)var1.getReturnValue());
      var1.setReturnValue(abaaaab.aaaa(var2, bbabaa.aaaa(var2, var3)));
   }
}
