package nsc.mixin;

import net.fabricmc.api.EnvType;
import net.fabricmc.api.Environment;
import net.minecraft.class_11908;
import net.minecraft.class_309;
import org.spongepowered.asm.mixin.Mixin;
import org.spongepowered.asm.mixin.injection.At;
import org.spongepowered.asm.mixin.injection.Inject;
import org.spongepowered.asm.mixin.injection.callback.CallbackInfo;
import nsc.aabbabbbb;

@Environment(EnvType.CLIENT)
@Mixin({class_309.class})
public abstract class aaaaabbba {
   @Inject(
      method = {"method_1466"},
      at = {@At("HEAD")}
   )
   private void a(long var1, int var3, class_11908 var4, CallbackInfo var5) {
      if (var4 != null) {
         aabbabbbb.bababba(var3, var4.comp_4796());
      }
   }
}
