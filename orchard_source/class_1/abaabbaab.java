package nsc.mixin;

import net.fabricmc.api.EnvType;
import net.fabricmc.api.Environment;
import net.minecraft.class_1297;
import org.spongepowered.asm.mixin.Mixin;
import org.spongepowered.asm.mixin.injection.At;
import org.spongepowered.asm.mixin.injection.ModifyArg;
import nsc.bbabbbb;

@Environment(EnvType.CLIENT)
@Mixin({class_1297.class})
public abstract class abaabbaab {
   @ModifyArg(
      method = {"method_5724"},
      at = @At(
         value = "INVOKE",
         target = "Lnet/minecraft/class_1297;method_18795(Lnet/minecraft/class_243;FF)Lnet/minecraft/class_243;"
      ),
      index = 2,
      require = 0
   )
   private float a(float var1) {
      return bbabbbb.aaabab((class_1297)this, var1);
   }
}
