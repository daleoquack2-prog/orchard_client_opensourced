package nsc.mixin;

import net.fabricmc.api.EnvType;
import net.fabricmc.api.Environment;
import net.minecraft.class_1041;
import net.minecraft.class_11910;
import net.minecraft.class_310;
import net.minecraft.class_312;
import org.spongepowered.asm.mixin.Mixin;
import org.spongepowered.asm.mixin.Shadow;
import org.spongepowered.asm.mixin.injection.At;
import org.spongepowered.asm.mixin.injection.Inject;
import org.spongepowered.asm.mixin.injection.callback.CallbackInfo;
import nsc.aabbabbbb;
import nsc.abaaaaaba;
import nsc.baaba;

@Environment(EnvType.CLIENT)
@Mixin({class_312.class})
public abstract class aaabbbaa {
   @Shadow
   private class_310 field_1779;

   @Shadow
   public abstract double method_68883(class_1041 var1);

   @Inject(
      method = {"method_1601"},
      at = {@At("HEAD")},
      cancellable = true
   )
   private void a(long var1, class_11910 var3, int var4, CallbackInfo var5) {
      aabbabbbb.baabbbb(var1, var3.comp_4801(), var4);
      if (this.field_1779 != null
         && this.field_1779.field_1755 != null
         && !(this.field_1779.field_1755 instanceof baaba)
         && this.field_1779.method_18506() == null
         && var4 == 1) {
         class_1041 var6 = this.field_1779.method_22683();
         if (var1 == var6.method_4490()) {
            abaaaaaba var7 = abaaaaaba.aaaaa();
            if (var7 != null && var7.aaba() != null) {
               double var8 = this.method_68879(var6);
               double var10 = this.method_68883(var6);
               if (var7.aaba().bbbb(var8, var10, var3.comp_4801())) {
                  var5.cancel();
               }
            }
         }
      }
   }

   @Shadow
   public abstract double method_68879(class_1041 var1);
}
