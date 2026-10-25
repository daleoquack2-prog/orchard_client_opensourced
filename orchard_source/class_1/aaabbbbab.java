package nsc.mixin;

import net.fabricmc.api.EnvType;
import net.fabricmc.api.Environment;
import net.minecraft.class_1309;
import net.minecraft.class_1671;
import net.minecraft.class_243;
import org.spongepowered.asm.mixin.Mixin;
import org.spongepowered.asm.mixin.injection.At;
import org.spongepowered.asm.mixin.injection.Redirect;
import nsc.abaaaaaba;
import nsc.ababaaab;

@Environment(EnvType.CLIENT)
@Mixin({class_1671.class})
public abstract class aaabbbbab {
   @Redirect(
      method = {"method_5773"},
      at = @At(
         value = "INVOKE",
         target = "Lnet/minecraft/class_1309;method_5720()Lnet/minecraft/class_243;"
      ),
      require = 0
   )
   private class_243 a(class_1309 var1) {
      abaaaaaba var2 = abaaaaaba.aaaaa();
      if (var2 != null && var2.aaba() != null) {
         ababaaab var3 = var2.aaba().aaaabaa();
         return var3 == null ? var1.method_5720() : var3.aa(var1);
      } else {
         return var1.method_5720();
      }
   }
}
