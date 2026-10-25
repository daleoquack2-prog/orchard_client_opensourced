package nsc.mixin;

import net.fabricmc.api.EnvType;
import net.fabricmc.api.Environment;
import net.minecraft.class_1297;
import net.minecraft.class_1309;
import net.minecraft.class_1657;
import net.minecraft.class_310;
import net.minecraft.class_636;
import org.spongepowered.asm.mixin.Mixin;
import org.spongepowered.asm.mixin.injection.At;
import org.spongepowered.asm.mixin.injection.Inject;
import org.spongepowered.asm.mixin.injection.callback.CallbackInfo;
import nsc.aabbabbbb;
import nsc.abaaaaaba;
import nsc.ababaa;
import nsc.abbbbaaab;

@Environment(EnvType.CLIENT)
@Mixin({class_636.class})
public abstract class aaabbbabb {
   @Inject(
      method = {"method_2918"},
      at = {@At("TAIL")}
   )
   private void a(class_1657 var1, class_1297 var2, CallbackInfo var3) {
      aabbabbbb.bbbab();
      abaaaaaba var4 = abaaaaaba.aaaaa();
      if (var4 != null) {
         var4.aaba().aaabaa(var2);
      }
   }

   @Inject(
      method = {"method_2918"},
      at = {@At("HEAD")},
      cancellable = true
   )
   private void b(class_1657 var1, class_1297 var2, CallbackInfo var3) {
      abaaaaaba var4 = abaaaaaba.aaaaa();
      if (var4 != null) {
         abbbbaaab var5 = var4.aaba().bbbaaa();
         if (var5 != null && var5.bb(class_310.method_1551())) {
            var3.cancel();
            return;
         }

         ababaa var6 = var4.aaba().bbbbaa();
         if (var6 != null && var6.babbaab() && !aabbabbbb.babbaaa() && var2 instanceof class_1309 var7) {
            var6.baab(class_310.method_1551(), var7);
         }

         var4.aaba().ababa(var2);
      }
   }
}
