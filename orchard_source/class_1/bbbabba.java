package nsc.mixin;

import net.fabricmc.api.EnvType;
import net.fabricmc.api.Environment;
import net.minecraft.class_5223;
import org.spongepowered.asm.mixin.Mixin;
import org.spongepowered.asm.mixin.injection.At;
import org.spongepowered.asm.mixin.injection.ModifyVariable;
import nsc.babaaabb;

@Environment(EnvType.CLIENT)
@Mixin({class_5223.class})
public abstract class bbbabba {
   @ModifyVariable(
      method = {"method_27474", "method_27478", "method_27479", "method_27472", "method_27473"},
      at = @At("HEAD"),
      argsOnly = true,
      ordinal = 0
   )
   private static String a(String var0) {
      return babaaabb.b(var0);
   }
}
