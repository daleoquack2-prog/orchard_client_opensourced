package nsc.mixin;

import net.fabricmc.api.EnvType;
import net.fabricmc.api.Environment;
import net.minecraft.class_1297;
import net.minecraft.class_1657;
import net.minecraft.class_2561;
import org.spongepowered.asm.mixin.Mixin;
import org.spongepowered.asm.mixin.injection.At;
import org.spongepowered.asm.mixin.injection.Inject;
import org.spongepowered.asm.mixin.injection.callback.CallbackInfoReturnable;
import nsc.aabaabba;
import nsc.abaaaab;
import nsc.baaabaab;
import nsc.babaaabb;
import nsc.bbabaa;

@Environment(EnvType.CLIENT)
@Mixin({class_1297.class})
public abstract class bbabbbbb {
   @Inject(
      method = {"method_5733"},
      at = {@At("HEAD")},
      cancellable = true
   )
   private void a(CallbackInfoReturnable var1) {
      class_1297 var2 = (class_1297)this;
      if (baaabaab.ab(var2) || aabaabba.ab(var2)) {
         var1.setReturnValue(false);
      }
   }

   @Inject(
      method = {"method_5476"},
      at = {@At("RETURN")},
      cancellable = true
   )
   private void b(CallbackInfoReturnable var1) {
      class_1297 var2 = (class_1297)this;
      if (var2 instanceof class_1657 var3) {
         class_2561 var4 = babaaabb.aaa(var3.method_7334(), (class_2561)var1.getReturnValue());
         var1.setReturnValue(abaaaab.aaaa(var3, bbabaa.aaaa(var3, var4)));
      }
   }

   @Inject(
      method = {"method_5477"},
      at = {@At("RETURN")},
      cancellable = true
   )
   private void aa(CallbackInfoReturnable var1) {
      class_1297 var2 = (class_1297)this;
      if (var2 instanceof class_1657 var3) {
         class_2561 var4 = babaaabb.aaa(var3.method_7334(), (class_2561)var1.getReturnValue());
         var1.setReturnValue(abaaaab.aaaa(var3, bbabaa.aaaa(var3, var4)));
      }
   }

   @Inject(
      method = {"method_5756"},
      at = {@At("HEAD")},
      cancellable = true
   )
   private void ab(class_1657 var1, CallbackInfoReturnable var2) {
      class_1297 var3 = (class_1297)this;
      if (baaabaab.aa(var3)) {
         var2.setReturnValue(true);
      }
   }
}
