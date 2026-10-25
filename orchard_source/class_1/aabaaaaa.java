package nsc.mixin;

import net.fabricmc.api.EnvType;
import net.fabricmc.api.Environment;
import net.minecraft.class_310;
import net.minecraft.class_761;
import org.spongepowered.asm.mixin.Mixin;
import org.spongepowered.asm.mixin.injection.At;
import org.spongepowered.asm.mixin.injection.ModifyVariable;
import nsc.abaaaaaba;
import nsc.bbabbaaa;

@Environment(EnvType.CLIENT)
@Mixin({class_761.class})
public abstract class aabaaaaa {
   @ModifyVariable(
      method = {"method_74752"},
      at = @At("HEAD"),
      argsOnly = true
   )
   private boolean a(boolean var1) {
      if (var1) {
         return true;
      } else {
         abaaaaaba var2 = abaaaaaba.aaaaa();
         if (var2 != null && var2.aaba() != null) {
            bbabbaaa var3 = var2.aaba().aaaaaba();
            class_310 var4 = class_310.method_1551();
            return var3 != null && var3.aaa(var4.field_1773.method_19418().method_19331());
         } else {
            return false;
         }
      }
   }
}
