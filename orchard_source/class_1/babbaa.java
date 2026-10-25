package nsc.mixin;

import net.fabricmc.api.EnvType;
import net.fabricmc.api.Environment;
import net.minecraft.class_310;
import net.minecraft.class_757;
import org.joml.Matrix4f;
import org.spongepowered.asm.mixin.Mixin;
import org.spongepowered.asm.mixin.gen.Invoker;
import org.spongepowered.asm.mixin.injection.At;
import org.spongepowered.asm.mixin.injection.Redirect;
import nsc.abaa;
import nsc.abaaaaaba;

@Environment(EnvType.CLIENT)
@Mixin({class_757.class})
public abstract class babbaa {
   @Invoker("method_3172")
   protected abstract void yj$invokeShaderHands(float var1, boolean var2, Matrix4f var3);

   private void a(float var1, boolean var2, Matrix4f var3) {
      this.yj$invokeShaderHands(var1, var2, var3);
   }

   @Redirect(
      method = {"method_3188(Lnet/minecraft/class_9779;)V"},
      at = @At(
         value = "INVOKE",
         target = "Lnet/minecraft/class_757;method_3172(FZLorg/joml/Matrix4f;)V"
      ),
      require = 1
   )
   private void b(class_757 var1, float var2, boolean var3, Matrix4f var4) {
      abaaaaaba var5 = abaaaaaba.aaaaa();
      class_310 var6 = class_310.method_1551();
      abaa var7 = var5 != null && var5.aaba() != null ? var5.aaba().bbabba() : null;
      if (var7 != null && var7.bab(var6, var3)) {
         var7.ba(var6, this::a);
      } else {
         this.yj$invokeShaderHands(var2, var3, var4);
      }
   }
}
