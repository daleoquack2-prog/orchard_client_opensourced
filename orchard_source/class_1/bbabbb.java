package nsc.mixin;

import net.fabricmc.api.EnvType;
import net.fabricmc.api.Environment;
import net.minecraft.class_1297;
import net.minecraft.class_1309;
import net.minecraft.class_243;
import org.spongepowered.asm.mixin.Mixin;
import org.spongepowered.asm.mixin.injection.At;
import org.spongepowered.asm.mixin.injection.ModifyVariable;
import org.spongepowered.asm.mixin.injection.Redirect;
import nsc.bbabbbb;

@Environment(EnvType.CLIENT)
@Mixin({class_1309.class})
public abstract class bbabbb {
   @Redirect(
      method = {"method_61430"},
      at = @At(
         value = "INVOKE",
         target = "Lnet/minecraft/class_1309;method_5720()Lnet/minecraft/class_243;"
      ),
      require = 0
   )
   private class_243 a(class_1309 var1) {
      return bbabbbb.bbaba(var1);
   }

   @Redirect(
      method = {"method_61430"},
      at = @At(
         value = "INVOKE",
         target = "Lnet/minecraft/class_1309;method_36455()F"
      ),
      require = 0
   )
   private float b(class_1309 var1) {
      return bbabbbb.baabab(var1);
   }

   @ModifyVariable(
      method = {"method_6043"},
      at = @At("STORE"),
      ordinal = 1,
      require = 0
   )
   private float aa(float var1) {
      class_1309 var2 = (class_1309)this;
      float var3 = bbabbbb.aaabab((class_1297)var2, var2.method_36454());
      return var3 == var2.method_36454() && !bbabbbb.bbbaba() ? var1 : var3 * (float) (Math.PI / 180.0);
   }
}
