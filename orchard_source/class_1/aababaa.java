package nsc.mixin;

import net.fabricmc.api.EnvType;
import net.fabricmc.api.Environment;
import net.minecraft.class_310;
import net.minecraft.class_315;
import net.minecraft.class_743;
import net.minecraft.class_744;
import org.spongepowered.asm.mixin.Mixin;
import org.spongepowered.asm.mixin.Shadow;
import org.spongepowered.asm.mixin.injection.At;
import org.spongepowered.asm.mixin.injection.Inject;
import org.spongepowered.asm.mixin.injection.callback.CallbackInfo;
import nsc.aaababaa;
import nsc.aabbaabb;
import nsc.abaaaaaba;
import nsc.bbabbbb;

@Environment(EnvType.CLIENT)
@Mixin({class_743.class})
public abstract class aababaa extends class_744 {
   @Shadow
   private class_315 field_3902;

   @Inject(
      method = {"method_3129"},
      at = {@At("TAIL")},
      require = 0
   )
   private void a(CallbackInfo var1) {
      abaaaaaba var2 = abaaaaaba.aaaaa();
      if (var2 != null) {
         aaababaa var3 = var2.aaba().baaa();
         if (var3 != null) {
            var3.b(class_310.method_1551(), this);
         }

         aabbaabb var4 = aabbaabb.bab();
         if (var4 != null) {
            var4.aaba(this.field_3902, this);
         }

         bbabbbb.bbbab(class_310.method_1551(), this);
      }
   }
}
