package nsc.mixin;

import net.fabricmc.api.EnvType;
import net.fabricmc.api.Environment;
import net.minecraft.class_312;
import org.spongepowered.asm.mixin.Mixin;
import org.spongepowered.asm.mixin.Shadow;
import org.spongepowered.asm.mixin.injection.At;
import org.spongepowered.asm.mixin.injection.Inject;
import org.spongepowered.asm.mixin.injection.callback.CallbackInfo;
import nsc.abaaaaaba;
import nsc.babbaba;
import nsc.bbaaaa;
import nsc.bbbaaaa;

@Environment(EnvType.CLIENT)
@Mixin({class_312.class})
public abstract class aabaababa {
   @Shadow
   private double field_1787;
   @Shadow
   private double field_1789;

   @Inject(
      method = {"method_55793"},
      at = {@At("HEAD")}
   )
   private void a(CallbackInfo var1) {
      abaaaaaba var2 = abaaaaaba.aaaaa();
      if (var2 != null) {
         babbaba var3 = var2.aaba();
         if (var3 != null) {
            bbaaaa var4 = var3.bbabbb();
            if (var4 != null) {
               var4.b(this.field_1789, this.field_1787);
            }

            bbbaaaa var5 = var3.abaab();
            if (var5 != null && var5.aa()) {
               float var6 = var5.aaaa();
               this.field_1789 *= var6;
               this.field_1787 *= var6;
            }
         }
      }
   }
}
