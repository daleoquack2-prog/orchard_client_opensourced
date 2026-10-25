package nsc.mixin;

import net.fabricmc.api.EnvType;
import net.fabricmc.api.Environment;
import net.minecraft.class_745;
import org.spongepowered.asm.mixin.Mixin;
import org.spongepowered.asm.mixin.injection.At;
import org.spongepowered.asm.mixin.injection.Inject;
import org.spongepowered.asm.mixin.injection.callback.CallbackInfo;
import nsc.ababbabb;
import nsc.abbabaa;
import nsc.baaaab;

@Environment(EnvType.CLIENT)
@Mixin({class_745.class})
public abstract class bbaabbbb {
   @Inject(
      method = {"method_6007"},
      at = {@At("HEAD")},
      cancellable = true,
      require = 1
   )
   private void a(CallbackInfo var1) {
      if (!abbabaa.aa()) {
         baaaab var2 = ababbabb.abbab();
         class_745 var3 = (class_745)this;
         if (var2 != null && var2.b(var3)) {
            var3.method_22862();
            var3.field_42108.method_48567(0.0F);
            var1.cancel();
         }
      }
   }
}
