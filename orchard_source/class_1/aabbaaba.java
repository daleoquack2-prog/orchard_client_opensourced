package nsc.mixin;

import net.fabricmc.api.EnvType;
import net.fabricmc.api.Environment;
import net.minecraft.class_11909;
import net.minecraft.class_332;
import net.minecraft.class_408;
import org.spongepowered.asm.mixin.Mixin;
import org.spongepowered.asm.mixin.Unique;
import org.spongepowered.asm.mixin.injection.At;
import org.spongepowered.asm.mixin.injection.Inject;
import org.spongepowered.asm.mixin.injection.callback.CallbackInfo;
import org.spongepowered.asm.mixin.injection.callback.CallbackInfoReturnable;
import nsc.aabababab;
import nsc.abaaaaaba;

@Environment(EnvType.CLIENT)
@Mixin({class_408.class})
public abstract class aabbaaba {
   @Unique
   private aabababab a;

   @Inject(
      method = {"method_25394"},
      at = {@At("TAIL")},
      require = 1
   )
   private void a(class_332 var1, int var2, int var3, float var4, CallbackInfo var5) {
      this.aa().aa(var1);
   }

   @Inject(
      method = {"method_25432"},
      at = {@At("HEAD")},
      require = 0
   )
   private void b(CallbackInfo var1) {
      if (this.a != null) {
         this.a.ab();
      }
   }

   @Unique
   private aabababab aa() {
      if (this.a == null) {
         this.a = new aabababab();
      }

      return this.a;
   }

   @Inject(
      method = {"method_25402"},
      at = {@At("HEAD")},
      cancellable = true,
      require = 1
   )
   private void ab(class_11909 var1, boolean var2, CallbackInfoReturnable var3) {
      abaaaaaba var4 = abaaaaaba.aaaaa();
      if (var4 != null && var4.aaba() != null && var4.aaba().bbbb(var1.comp_4798(), var1.comp_4799(), var1.method_74245())) {
         var3.setReturnValue(true);
      } else {
         if (this.aa().b(var1.comp_4798(), var1.comp_4799(), var1.method_74245())) {
            var3.setReturnValue(true);
         }
      }
   }
}
