package nsc.mixin;

import io.netty.channel.ChannelHandlerContext;
import net.fabricmc.api.EnvType;
import net.fabricmc.api.Environment;
import net.minecraft.class_2535;
import net.minecraft.class_2596;
import org.spongepowered.asm.mixin.Mixin;
import org.spongepowered.asm.mixin.injection.At;
import org.spongepowered.asm.mixin.injection.Inject;
import org.spongepowered.asm.mixin.injection.ModifyVariable;
import org.spongepowered.asm.mixin.injection.callback.CallbackInfo;
import nsc.aabaaa;
import nsc.baaabbab;

@Environment(EnvType.CLIENT)
@Mixin({class_2535.class})
public abstract class baababaa {
   @Inject(
      method = {"method_10770(Lio/netty/channel/ChannelHandlerContext;Lnet/minecraft/class_2596;)V"},
      at = {@At("HEAD")}
   )
   private void a(ChannelHandlerContext var1, class_2596 var2, CallbackInfo var3) {
      baaabbab.aaaaa(var2);
   }

   @ModifyVariable(
      method = {"method_10743(Lnet/minecraft/class_2596;)V"},
      at = @At("HEAD"),
      argsOnly = true
   )
   private class_2596 b(class_2596 var1) {
      return baaabbab.abab(var1);
   }

   @Inject(
      method = {"method_10743(Lnet/minecraft/class_2596;)V"},
      at = {@At("HEAD")}
   )
   private void aa(class_2596 var1, CallbackInfo var2) {
      aabaaa.abbbaaa(var1);
   }

   @Inject(
      method = {"method_10743(Lnet/minecraft/class_2596;)V"},
      at = {@At("HEAD")},
      cancellable = true
   )
   private void ab(class_2596 var1, CallbackInfo var2) {
      if (baaabbab.bbba(var1)) {
         var2.cancel();
      }
   }
}
