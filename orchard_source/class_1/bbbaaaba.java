package nsc.mixin;

import net.fabricmc.api.EnvType;
import net.fabricmc.api.Environment;
import net.minecraft.class_11659;
import net.minecraft.class_12152;
import net.minecraft.class_1268;
import net.minecraft.class_1306;
import net.minecraft.class_1799;
import net.minecraft.class_310;
import net.minecraft.class_3532;
import net.minecraft.class_4587;
import net.minecraft.class_742;
import net.minecraft.class_746;
import net.minecraft.class_759;
import org.spongepowered.asm.mixin.Mixin;
import org.spongepowered.asm.mixin.Shadow;
import org.spongepowered.asm.mixin.Unique;
import org.spongepowered.asm.mixin.gen.Invoker;
import org.spongepowered.asm.mixin.injection.At;
import org.spongepowered.asm.mixin.injection.Inject;
import org.spongepowered.asm.mixin.injection.Redirect;
import org.spongepowered.asm.mixin.injection.callback.CallbackInfo;
import nsc.aabbabbbb;
import nsc.abaabba;
import nsc.baaabbbb;
import nsc.bbabbbb;

@Environment(EnvType.CLIENT)
@Mixin({class_759.class})
public abstract class bbbaaaba {
   @Unique
   private boolean a;
   @Shadow
   private float field_4043;
   @Shadow
   private float field_4052;
   @Unique
   private float b;
   @Unique
   private float aa;
   @Shadow
   private class_1799 field_4047;
   @Shadow
   private class_1799 field_4048;

   @Redirect(
      method = {"method_3228"},
      at = @At(
         value = "INVOKE",
         target = "Lnet/minecraft/class_12152;method_75391(FLnet/minecraft/class_4587;ILnet/minecraft/class_1306;)V"
      ),
      require = 1
   )
   private void a(
      float var1,
      class_4587 var2,
      int var3,
      class_1306 var4,
      class_742 var5,
      float var6,
      float var7,
      class_1268 var8,
      float var9,
      class_1799 var10,
      float var11,
      class_4587 var12,
      class_11659 var13,
      int var14
   ) {
      if (!abaabba.b(var8)) {
         class_12152.method_75391(var1, var2, var3, var4);
      }
   }

   @Unique
   private float b(float var1, float var2, float var3) {
      if (var3 <= 0.0F) {
         return var2;
      } else {
         float var4 = class_3532.method_15363(1.0F - var3 * 0.82F, 0.16F, 1.0F);
         return var1 + (var2 - var1) * var4;
      }
   }

   @Inject(
      method = {"method_3228"},
      at = {@At("HEAD")},
      cancellable = true
   )
   private void aa(
      class_742 var1,
      float var2,
      float var3,
      class_1268 var4,
      float var5,
      class_1799 var6,
      float var7,
      class_4587 var8,
      class_11659 var9,
      int var10,
      CallbackInfo var11
   ) {
      if (!abaabba.bb(var1, var4)) {
         var11.cancel();
      }
   }

   @Invoker("method_65816")
   protected abstract void yj$invokeSwingArm(float var1, class_4587 var2, int var3, class_1306 var4);

   @Redirect(
      method = {"method_22976(FLnet/minecraft/class_4587;Lnet/minecraft/class_11659;Lnet/minecraft/class_746;I)V"},
      at = @At(
         value = "INVOKE",
         target = "Lnet/minecraft/class_746;method_5695(F)F"
      ),
      require = 1
   )
   private float ab(class_746 var1, float var2) {
      float var3 = class_3532.method_16439(var2, var1.field_3914, var1.field_3916);
      return var3 + class_3532.method_15363(bbabbbb.abaa(var1, var2) - var3, -30.0F, 30.0F);
   }

   @Redirect(
      method = {"method_3228"},
      at = @At(
         value = "INVOKE",
         target = "Lnet/minecraft/class_759;method_65816(FLnet/minecraft/class_4587;ILnet/minecraft/class_1306;)V"
      ),
      require = 1
   )
   private void ba(
      class_759 var1,
      float var2,
      class_4587 var3,
      int var4,
      class_1306 var5,
      class_742 var6,
      float var7,
      float var8,
      class_1268 var9,
      float var10,
      class_1799 var11,
      float var12,
      class_4587 var13,
      class_11659 var14,
      int var15
   ) {
      if (!abaabba.b(var9)) {
         this.yj$invokeSwingArm(var2, var3, var4, var5);
      }
   }

   @Inject(
      method = {"method_3220"},
      at = {@At("TAIL")},
      require = 0
   )
   private void bb(CallbackInfo var1) {
      baaabbbb var2 = abaabba.abb();
      if (var2 == null || !var2.babbaab()) {
         this.abb();
      } else if (!this.a) {
         this.abb();
      } else {
         this.b = this.b(this.b, this.field_4043, var2.aba(class_1268.field_5808));
         this.aa = this.b(this.aa, this.field_4052, var2.aba(class_1268.field_5810));
         class_310 var3 = class_310.method_1551();
         if (var2.ba(class_1268.field_5808)) {
            this.b = 1.0F;
            if (var3 != null && var3.field_1724 != null) {
               this.field_4047 = aabbabbbb.babbba(var3.field_1724);
            }
         }

         if (var2.ba(class_1268.field_5810)) {
            this.aa = 1.0F;
            if (var3 != null && var3.field_1724 != null) {
               this.field_4048 = var3.field_1724.method_6079();
            }
         }

         this.field_4043 = this.b;
         this.field_4052 = this.aa;
      }
   }

   @Inject(
      method = {"method_3228"},
      at = {@At(
         value = "INVOKE",
         target = "Lnet/minecraft/class_759;method_3233(Lnet/minecraft/class_1309;Lnet/minecraft/class_1799;Lnet/minecraft/class_811;Lnet/minecraft/class_4587;Lnet/minecraft/class_11659;I)V"
      )},
      require = 1
   )
   private void aaa(
      class_742 var1,
      float var2,
      float var3,
      class_1268 var4,
      float var5,
      class_1799 var6,
      float var7,
      class_4587 var8,
      class_11659 var9,
      int var10,
      CallbackInfo var11
   ) {
      abaabba.aaa(var1, var4, var6, var2, var5, var8);
   }

   @Redirect(
      method = {"method_22976(FLnet/minecraft/class_4587;Lnet/minecraft/class_11659;Lnet/minecraft/class_746;I)V"},
      at = @At(
         value = "INVOKE",
         target = "Lnet/minecraft/class_746;method_5705(F)F"
      ),
      require = 1
   )
   private float aab(class_746 var1, float var2) {
      float var3 = class_3532.method_16439(var2, var1.field_3931, var1.field_3932);
      return var3 + class_3532.method_15363(class_3532.method_15393(bbabbbb.abbbab(var1, var2) - var3), -30.0F, 30.0F);
   }

   @Redirect(
      method = {"method_22976(FLnet/minecraft/class_4587;Lnet/minecraft/class_11659;Lnet/minecraft/class_746;I)V"},
      at = @At(
         value = "INVOKE",
         target = "Lnet/minecraft/class_746;method_61414(F)F"
      ),
      require = 1
   )
   private float aba(class_746 var1, float var2) {
      return bbabbbb.abaa(var1, var2);
   }

   @Unique
   private void abb() {
      this.a = true;
      this.b = this.field_4043;
      this.aa = this.field_4052;
   }
}
