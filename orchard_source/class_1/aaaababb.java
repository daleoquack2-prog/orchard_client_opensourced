package nsc.mixin;

import net.fabricmc.api.EnvType;
import net.fabricmc.api.Environment;
import net.minecraft.class_310;
import net.minecraft.class_757;
import org.joml.Matrix4f;
import org.spongepowered.asm.mixin.Mixin;
import org.spongepowered.asm.mixin.Shadow;
import org.spongepowered.asm.mixin.injection.At;
import org.spongepowered.asm.mixin.injection.Inject;
import org.spongepowered.asm.mixin.injection.callback.CallbackInfoReturnable;
import nsc.aabaaaaba;
import nsc.abaaaaaba;

@Environment(EnvType.CLIENT)
@Mixin({class_757.class})
public abstract class aaaababb {
   @Inject(
      method = {"method_22973"},
      at = {@At("HEAD")},
      cancellable = true
   )
   private void a(float var1, CallbackInfoReturnable var2) {
      class_310 var3 = class_310.method_1551();
      abaaaaaba var4 = abaaaaaba.aaaaa();
      aabaaaaba var5 = var4 != null && var4.aaba() != null ? var4.aaba().aabbabb() : null;
      if (var3 != null && var3.method_22683() != null && var5 != null && var5.babbaab()) {
         int var6 = var3.method_22683().method_4489();
         int var7 = var3.method_22683().method_4506();
         if (var6 > 0 && var7 > 0) {
            double var8 = (double)var6 / var7;
            double var10 = var5.ba(var8);
            if (Double.isFinite(var10) && !(var10 <= 0.0) && !(Math.abs(var10 - var8) < 1.0E-6)) {
               var2.setReturnValue(new Matrix4f().perspective(var1 * (float) (Math.PI / 180.0), (float)var10, 0.05F, this.method_32796()));
            }
         }
      }
   }

   @Shadow
   public abstract float method_32796();
}
