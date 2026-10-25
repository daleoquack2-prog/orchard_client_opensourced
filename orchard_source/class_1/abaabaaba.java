package nsc.mixin;

import net.fabricmc.api.EnvType;
import net.fabricmc.api.Environment;
import net.minecraft.class_2561;
import net.minecraft.class_338;
import org.spongepowered.asm.mixin.Mixin;
import org.spongepowered.asm.mixin.injection.At;
import org.spongepowered.asm.mixin.injection.Inject;
import org.spongepowered.asm.mixin.injection.ModifyVariable;
import org.spongepowered.asm.mixin.injection.callback.CallbackInfo;
import nsc.abaaaaaba;
import nsc.babaaabb;

@Environment(EnvType.CLIENT)
@Mixin({class_338.class})
public abstract class abaabaaba {
   @Inject(
      method = {"method_1812"},
      at = {@At("HEAD")},
      require = 0
   )
   private void a(class_2561 var1, CallbackInfo var2) {
      abaaaaaba var3 = abaaaaaba.aaaaa();
      if (var3 != null && var3.aaba() != null && var1 != null) {
         var3.aaba().aabbbbb(var1.getString());
      }
   }

   @ModifyVariable(
      method = {"method_1812"},
      at = @At("HEAD"),
      argsOnly = true,
      ordinal = 0,
      require = 0
   )
   private class_2561 b(class_2561 var1) {
      return babaaabb.aab(var1);
   }
}
