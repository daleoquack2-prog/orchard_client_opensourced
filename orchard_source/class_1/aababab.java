package nsc.mixin;

import net.fabricmc.api.EnvType;
import net.fabricmc.api.Environment;
import net.minecraft.class_10426;
import net.minecraft.class_1306;
import net.minecraft.class_1309;
import net.minecraft.class_1799;
import net.minecraft.class_746;
import org.spongepowered.asm.mixin.Mixin;
import org.spongepowered.asm.mixin.injection.At;
import org.spongepowered.asm.mixin.injection.Redirect;
import nsc.aabbabbbb;

@Environment(EnvType.CLIENT)
@Mixin({class_10426.class})
public abstract class aababab {
   @Redirect(
      method = {"method_65577"},
      at = @At(
         value = "INVOKE",
         target = "Lnet/minecraft/class_1309;method_6047()Lnet/minecraft/class_1799;"
      )
   )
   private static class_1799 a(class_1309 var0) {
      return var0 instanceof class_746 var1 ? aabbabbbb.babbba(var1) : var0.method_6047();
   }

   @Redirect(
      method = {"method_65577"},
      at = @At(
         value = "INVOKE",
         target = "Lnet/minecraft/class_1309;method_61420(Lnet/minecraft/class_1306;)Lnet/minecraft/class_1799;"
      )
   )
   private static class_1799 b(class_1309 var0, class_1306 var1) {
      return var0 instanceof class_746 var2 && var1 == var0.method_6068() ? aabbabbbb.babbba(var2) : var0.method_61420(var1);
   }
}
