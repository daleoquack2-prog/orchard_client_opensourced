package nsc.mixin;

import net.fabricmc.api.EnvType;
import net.fabricmc.api.Environment;
import net.minecraft.class_304;
import net.minecraft.class_3675.class_306;
import org.spongepowered.asm.mixin.Mixin;
import org.spongepowered.asm.mixin.injection.At;
import org.spongepowered.asm.mixin.injection.Inject;
import org.spongepowered.asm.mixin.injection.callback.CallbackInfo;
import nsc.aabbabbbb;
import nsc.baaabbb;

@Environment(EnvType.CLIENT)
@Mixin({class_304.class})
public abstract class ababbbabb {
   @Inject(
      method = {"method_1424"},
      at = {@At("HEAD")}
   )
   private static void a(CallbackInfo var0) {
      aabbabbbb.babaaaa();
   }

   @Inject(
      method = {"method_1420"},
      at = {@At("TAIL")}
   )
   private static void b(class_306 var0, CallbackInfo var1) {
      baaabbb.bba(var0);
   }
}
