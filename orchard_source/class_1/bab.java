package nsc.mixin;

import net.fabricmc.api.EnvType;
import net.fabricmc.api.Environment;
import net.minecraft.class_1661;
import org.spongepowered.asm.mixin.Mixin;
import org.spongepowered.asm.mixin.injection.At;
import org.spongepowered.asm.mixin.injection.Inject;
import org.spongepowered.asm.mixin.injection.callback.CallbackInfoReturnable;
import nsc.aabbabbbb;

@Environment(EnvType.CLIENT)
@Mixin({class_1661.class})
public abstract class bab {
   private static final long b;

   static {
      long var0 = 2455331377747109520L;
      long var10002 = 5830923197045581465L ^ var0;
      byte var10001 = -1;
      b = var10002;
   }

   @Inject(
      method = {"method_7391"},
      at = {@At("HEAD")},
      cancellable = true
   )
   private void a(CallbackInfoReturnable var1) {
      class_1661 var2 = (class_1661)this;
      int var3 = aabbabbbb.bbabba(var2);
      int var4 = ((aababbba)var2).wq$getSelectedSlot();
      if (var3 >= 0 && var3 < (int)b && var3 != var4) {
         var1.setReturnValue(var2.method_5438(var3));
      }
   }
}
