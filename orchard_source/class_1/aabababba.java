package nsc.mixin;

import net.fabricmc.api.EnvType;
import net.fabricmc.api.Environment;
import net.minecraft.class_1774;
import net.minecraft.class_1799;
import net.minecraft.class_1838;
import org.spongepowered.asm.mixin.Mixin;
import org.spongepowered.asm.mixin.injection.At;
import org.spongepowered.asm.mixin.injection.Redirect;
import nsc.aabbba;
import nsc.abaaaaaba;

@Environment(EnvType.CLIENT)
@Mixin({class_1774.class})
public abstract class aabababba {
   @Redirect(
      method = {"method_7884"},
      at = @At(
         value = "INVOKE",
         target = "Lnet/minecraft/class_1799;method_7934(I)V"
      )
   )
   private void a(class_1799 var1, int var2, class_1838 var3) {
      abaaaaaba var4 = abaaaaaba.aaaaa();
      aabbba var5 = var4 != null && var4.aaba() != null
         ? (aabbba)var4.aaba().aababab(aabbba.class)
         : null;
      if (!var3.method_8045().method_8608() || var5 == null || !var5.babbaab()) {
         var1.method_7934(var2);
      }
   }
}
