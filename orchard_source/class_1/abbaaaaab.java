package nsc.mixin;

import net.fabricmc.api.EnvType;
import net.fabricmc.api.Environment;
import net.minecraft.class_2535;
import net.minecraft.class_2720;
import net.minecraft.class_2856;
import net.minecraft.class_310;
import net.minecraft.class_8673;
import net.minecraft.class_2856.class_2857;
import org.spongepowered.asm.mixin.Final;
import org.spongepowered.asm.mixin.Mixin;
import org.spongepowered.asm.mixin.Shadow;
import org.spongepowered.asm.mixin.injection.At;
import org.spongepowered.asm.mixin.injection.Inject;
import org.spongepowered.asm.mixin.injection.callback.CallbackInfo;
import nsc.abbabaa;
import nsc.baaabbab;

@Environment(EnvType.CLIENT)
@Mixin({class_8673.class})
public abstract class abbaaaaab {
   @Shadow
   @Final
   protected class_310 field_45588;
   @Shadow
   @Final
   protected class_2535 field_45589;

   private void a(class_2720 var1, Boolean var2) {
      if (!abbabaa.aa() && this.field_45589.method_10758()) {
         if (!baaabbab.b()) {
            this.method_52784(var1);
         } else if (var2 && baaabbab.aaba(var1.comp_2159())) {
            baaabbab.bbab(var1.comp_2158());
            this.method_52784(var1);
         } else {
            this.field_45589.method_10743(new class_2856(var1.comp_2158(), class_2857.field_47667));
            baaabbab.bab(var1.comp_2159());
         }
      }
   }

   @Shadow
   public abstract void method_52784(class_2720 var1);

   @Inject(
      method = {"method_52784"},
      at = {@At("HEAD")},
      cancellable = true
   )
   private void b(class_2720 var1, CallbackInfo var2) {
      if (baaabbab.b()) {
         if (!baaabbab.abaa(var1.comp_2158())) {
            var2.cancel();
            baaabbab.baaa(var1.comp_2159(), this::aa);
         }
      }
   }

   private void aa(class_2720 var1, Boolean var2) {
      this.field_45588.execute(this::a);
   }
}
