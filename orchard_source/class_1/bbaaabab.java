package nsc.mixin;

import net.fabricmc.api.EnvType;
import net.fabricmc.api.Environment;
import net.minecraft.class_10042;
import net.minecraft.class_1309;
import net.minecraft.class_310;
import net.minecraft.class_922;
import org.spongepowered.asm.mixin.Mixin;
import org.spongepowered.asm.mixin.injection.At;
import org.spongepowered.asm.mixin.injection.Inject;
import org.spongepowered.asm.mixin.injection.callback.CallbackInfo;
import nsc.aabbabba;

@Environment(EnvType.CLIENT)
@Mixin({class_922.class})
public abstract class bbaaabab {
   @Inject(
      method = {"method_62355(Lnet/minecraft/class_1309;Lnet/minecraft/class_10042;F)V"},
      at = {@At("TAIL")},
      require = 0
   )
   private void a(class_1309 var1, class_10042 var2, float var3, CallbackInfo var4) {
      class_310 var5 = class_310.method_1551();
      if (var5 != null && var5.field_1724 != null && var1 == var5.field_1724) {
         aabbabba var6 = aabbabba.ab();
         if (var6 != null) {
            var6.b(var2, var3);
         }
      }
   }
}
