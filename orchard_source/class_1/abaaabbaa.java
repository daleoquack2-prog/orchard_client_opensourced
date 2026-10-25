package nsc.mixin;

import net.fabricmc.api.EnvType;
import net.fabricmc.api.Environment;
import net.minecraft.class_310;
import net.minecraft.class_757;
import org.joml.Matrix4f;
import org.spongepowered.asm.mixin.Mixin;
import org.spongepowered.asm.mixin.Unique;
import org.spongepowered.asm.mixin.injection.At;
import org.spongepowered.asm.mixin.injection.Inject;
import org.spongepowered.asm.mixin.injection.callback.CallbackInfo;
import nsc.abaaaaaba;
import nsc.bbabbbb;

@Environment(EnvType.CLIENT)
@Mixin({class_757.class})
public abstract class abaaabbaa {
   @Unique
   private boolean a;
   @Unique
   private int b;

   @Inject(
      method = {"method_3172(FZLorg/joml/Matrix4f;)V"},
      at = {@At("HEAD")},
      require = 1
   )
   private void a(float var1, boolean var2, Matrix4f var3, CallbackInfo var4) {
      class_310 var5 = class_310.method_1551();
      if (abaaaaaba.aaaaa() != null
         && var5 != null
         && var5.field_1724 != null
         && var5.method_1560() == var5.field_1724
         && bbabbbb.abaabb(var5.field_1724)) {
         int var6 = System.identityHashCode(var5.field_1724);
         bbabbbb.aaababa(
            var5.field_1724,
            bbabbbb.abbbab(var5.field_1724, var1),
            bbabbbb.abaa(var5.field_1724, var1),
            !this.a || this.b != var6
         );
         this.a = true;
         this.b = var6;
      } else {
         this.a = false;
         this.b = 0;
      }
   }
}
