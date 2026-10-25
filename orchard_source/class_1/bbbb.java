package nsc.mixin;

import net.fabricmc.api.EnvType;
import net.fabricmc.api.Environment;
import net.minecraft.class_1799;
import net.minecraft.class_746;
import net.minecraft.class_759;
import org.spongepowered.asm.mixin.Mixin;
import org.spongepowered.asm.mixin.injection.At;
import org.spongepowered.asm.mixin.injection.Redirect;
import nsc.aabbabbbb;

@Environment(EnvType.CLIENT)
@Mixin({class_759.class})
public abstract class bbbb {
   @Redirect(
      method = {"method_3220"},
      at = @At(
         value = "INVOKE",
         target = "Lnet/minecraft/class_746;method_6047()Lnet/minecraft/class_1799;"
      )
   )
   private class_1799 a(class_746 var1) {
      return aabbabbbb.babbba(var1);
   }

   @Redirect(
      method = {"method_33303"},
      at = @At(
         value = "INVOKE",
         target = "Lnet/minecraft/class_746;method_6047()Lnet/minecraft/class_1799;"
      )
   )
   private static class_1799 b(class_746 var0) {
      return aabbabbbb.babbba(var0);
   }
}
