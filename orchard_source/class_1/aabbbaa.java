package nsc.mixin;

import net.fabricmc.api.EnvType;
import net.fabricmc.api.Environment;
import net.minecraft.class_2596;
import net.minecraft.class_2626;
import net.minecraft.class_2637;
import net.minecraft.class_268;
import net.minecraft.class_269;
import net.minecraft.class_310;
import net.minecraft.class_5900;
import net.minecraft.class_634;
import net.minecraft.class_5900.class_5901;
import org.spongepowered.asm.mixin.Mixin;
import org.spongepowered.asm.mixin.Unique;
import org.spongepowered.asm.mixin.injection.At;
import org.spongepowered.asm.mixin.injection.Inject;
import org.spongepowered.asm.mixin.injection.Redirect;
import org.spongepowered.asm.mixin.injection.callback.CallbackInfo;
import nsc.abaaaaaba;
import nsc.abaaabbba;

@Environment(EnvType.CLIENT)
@Mixin({class_634.class})
public abstract class aabbbaa {
   @Unique
   private void a(class_2596 var1) {
      abaaaaaba var2 = abaaaaaba.aaaaa();
      abaaabbba var3 = var2 != null && var2.aaba() != null ? var2.aaba().bbbaa() : null;
      if (var3 != null && var3.bbaaa()) {
         var3.abbaabb(var1);
      }
   }

   @Inject(
      method = {"method_11136"},
      at = {@At("TAIL")},
      require = 1
   )
   private void b(class_2626 var1, CallbackInfo var2) {
      this.a(var1);
   }

   @Redirect(
      method = {"method_11099"},
      at = @At(
         value = "INVOKE",
         target = "Lnet/minecraft/class_269;method_1157(Ljava/lang/String;Lnet/minecraft/class_268;)V"
      )
   )
   private void aa(class_269 var1, String var2, class_268 var3) {
      if (var1 != null && var3 != null && var1.method_1164(var2) == var3) {
         try {
            var1.method_1157(var2, var3);
         } catch (IllegalStateException var5) {
         }
      }
   }

   @Inject(
      method = {"method_11099"},
      at = {@At("HEAD")},
      cancellable = true
   )
   private void ab(class_5900 var1, CallbackInfo var2) {
      if (class_310.method_1551().method_18854()) {
         if (var1 != null && var1.method_34176() != class_5901.field_29155) {
            class_269 var3 = ((class_634)this).method_55823();
            if (var3 == null || var3.method_1153(var1.method_34177()) == null) {
               var2.cancel();
            }
         }
      }
   }

   @Inject(
      method = {"method_11100"},
      at = {@At("TAIL")},
      require = 1
   )
   private void ba(class_2637 var1, CallbackInfo var2) {
      this.a(var1);
   }
}
