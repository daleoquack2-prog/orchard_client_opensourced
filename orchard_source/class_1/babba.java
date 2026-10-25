package nsc.mixin;

import net.fabricmc.api.EnvType;
import net.fabricmc.api.Environment;
import net.minecraft.class_10017;
import net.minecraft.class_11658;
import net.minecraft.class_1297;
import net.minecraft.class_243;
import net.minecraft.class_310;
import net.minecraft.class_4184;
import net.minecraft.class_4604;
import net.minecraft.class_746;
import net.minecraft.class_761;
import net.minecraft.class_898;
import net.minecraft.class_9779;
import org.spongepowered.asm.mixin.Final;
import org.spongepowered.asm.mixin.Mixin;
import org.spongepowered.asm.mixin.Shadow;
import org.spongepowered.asm.mixin.injection.At;
import org.spongepowered.asm.mixin.injection.Inject;
import org.spongepowered.asm.mixin.injection.callback.CallbackInfo;
import nsc.abaaaaaba;
import nsc.bbabbaaa;

@Environment(EnvType.CLIENT)
@Mixin({class_761.class})
public abstract class babba {
   @Shadow
   @Final
   private class_898 field_4109;

   @Inject(
      method = {"method_72917"},
      at = {@At("TAIL")}
   )
   private void a(class_4184 var1, class_4604 var2, class_9779 var3, class_11658 var4, CallbackInfo var5) {
      abaaaaaba var6 = abaaaaaba.aaaaa();
      if (var6 != null && var6.aaba() != null) {
         bbabbaaa var7 = var6.aaba().aaaaaba();
         class_310 var8 = class_310.method_1551();
         class_746 var9 = var8.field_1724;
         class_1297 var10 = var1.method_19331();
         if (var7 != null && var9 != null && var8.field_1687 != null && var7.aaa(var10)) {
            if (var10 != var9 || !var1.method_19333() && !var9.method_6113()) {
               class_243 var11 = var1.method_71156();
               if (this.field_4109.method_3950(var9, var2, var11.field_1352, var11.field_1351, var11.field_1350)) {
                  float var12 = var3.method_60637(!var8.field_1687.method_54719().method_54746(var9));
                  class_10017 var13 = this.field_4109.method_72977(var9, var12);
                  var4.field_61735.add(var13);
                  if (var13.method_72997() && this.method_3270()) {
                     var4.field_61736 = true;
                  }
               }
            }
         }
      }
   }

   @Shadow
   protected abstract boolean method_3270();
}
