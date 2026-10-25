package nsc.mixin;

import net.fabricmc.api.EnvType;
import net.fabricmc.api.Environment;
import net.minecraft.class_1297;
import net.minecraft.class_1657;
import net.minecraft.class_243;
import org.spongepowered.asm.mixin.Mixin;
import org.spongepowered.asm.mixin.injection.At;
import org.spongepowered.asm.mixin.injection.Redirect;
import nsc.aaaaabbab;
import nsc.abaaaaaba;

@Environment(EnvType.CLIENT)
@Mixin({class_1657.class})
public abstract class abaaab {
   @Redirect(
      method = {"method_75122"},
      at = @At(
         value = "INVOKE",
         target = "Lnet/minecraft/class_243;method_18805(DDD)Lnet/minecraft/class_243;"
      )
   )
   private class_243 a(class_243 var1, double var2, double var4, double var6, class_1297 var8, float var9, class_243 var10) {
      class_1657 var11 = (class_1657)this;
      aaaaabbab var12 = b();
      if (var12 != null && var12.abb(var11)) {
         double var13 = var12.bb();
         return var1.method_18805(var13, var4, var13);
      } else {
         return var1.method_18805(var2, var4, var6);
      }
   }

   private static aaaaabbab b() {
      abaaaaaba var0 = abaaaaaba.aaaaa();
      return var0 != null && var0.aaba() != null ? var0.aaba().abaaaa() : null;
   }

   @Redirect(
      method = {"method_75122"},
      at = @At(
         value = "INVOKE",
         target = "Lnet/minecraft/class_1657;method_5728(Z)V"
      )
   )
   private void aa(class_1657 var1, boolean var2, class_1297 var3, float var4, class_243 var5) {
      aaaaabbab var6 = b();
      if (var6 == null || !var6.aba(var1)) {
         var1.method_5728(var2);
      }
   }
}
