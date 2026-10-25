package nsc.mixin;

import com.mojang.blaze3d.platform.GLX;
import net.fabricmc.api.EnvType;
import net.fabricmc.api.Environment;
import org.spongepowered.asm.mixin.Mixin;
import org.spongepowered.asm.mixin.injection.At;
import org.spongepowered.asm.mixin.injection.Redirect;
import oshi.hardware.CentralProcessor;
import oshi.hardware.HardwareAbstractionLayer;
import nsc.aabbaaaba;

@Environment(EnvType.CLIENT)
@Mixin({GLX.class})
public abstract class abaaaaab {
   @Redirect(
      method = {"_getCpuInfo"},
      remap = false,
      require = 0,
      at = @At(
         value = "INVOKE",
         target = "Loshi/hardware/HardwareAbstractionLayer;getProcessor()Loshi/hardware/CentralProcessor;",
         remap = false
      )
   )
   private static CentralProcessor a(HardwareAbstractionLayer var0) {
      String var1 = System.getProperty(aabbaaaba.abba("XQGUyzwlTCtb"), "").toLowerCase();
      if (var1.contains(aabbaaaba.abba("uOTkqA8="))) {
         throw new IllegalStateException(aabbaaaba.abba("gt4z7msQkF6zq440PRGgOmmmYOpxCIk3vrzbYwUqgQdH"));
      } else {
         return var0.getProcessor();
      }
   }
}
