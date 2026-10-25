package nsc.mixin;

import io.netty.channel.Channel;
import io.netty.channel.ChannelHandler;
import io.netty.channel.ChannelHandlerContext;
import io.netty.channel.ChannelPipeline;
import net.fabricmc.api.EnvType;
import net.fabricmc.api.Environment;
import net.minecraft.class_2535;
import net.minecraft.class_2596;
import net.minecraft.class_2598;
import net.minecraft.class_2815;
import org.spongepowered.asm.mixin.Final;
import org.spongepowered.asm.mixin.Mixin;
import org.spongepowered.asm.mixin.Shadow;
import org.spongepowered.asm.mixin.Unique;
import org.spongepowered.asm.mixin.injection.At;
import org.spongepowered.asm.mixin.injection.Inject;
import org.spongepowered.asm.mixin.injection.callback.CallbackInfo;
import nsc.aabaaa;
import nsc.aabbaaaba;
import nsc.abaaaaaba;
import nsc.ababaaaab;
import nsc.abbbbaaab;
import nsc.bbab;

@Environment(EnvType.CLIENT)
@Mixin({class_2535.class})
public abstract class abbababbb {
   @Shadow
   @Final
   private class_2598 field_11643;
   @Unique
   private aabaaa a;
   @Shadow
   private Channel field_11651;
   @Unique
   private static final String b = aabbaaaba.abba("jNCBrR8kShW0PrZlLLPNbzKNR27W");

   @Inject(
      method = {"method_10743"},
      at = {@At("HEAD")},
      cancellable = true
   )
   private void a(class_2596 var1, CallbackInfo var2) {
      abaaaaaba var3 = abaaaaaba.aaaaa();
      if (this.b()) {
         this.ba(this.field_11651.pipeline());
      }

      if (var3 != null && var3.aaba() != null) {
         abbbbaaab var4 = var3.aaba().bbbaaa();
         if (var4 != null && var4.aaba(var1)) {
            var2.cancel();
            return;
         }
      }

      if (var3 != null && var1 instanceof class_2815 var6) {
         bbab var5 = var3.aaba().baaaba();
         if (var5 != null && var5.aa(var6)) {
            var2.cancel();
            return;
         }
      }

      if (var3 != null && var3.aaba() != null && var3.aaba().baab() != null) {
         var3.aaba().baab().aa(var1);
      }

      if (var3 != null && var3.aaba() != null) {
         var3.aaba().aaa(var1);
      }

      aabaaa.abbabba(var1);
   }

   @Unique
   private boolean b() {
      return this.field_11643 == class_2598.field_11942 && this.field_11651 != null;
   }

   @Inject(
      method = {"method_10743"},
      at = {@At("TAIL")}
   )
   private void aa(class_2596 var1, CallbackInfo var2) {
      abaaaaaba var3 = abaaaaaba.aaaaa();
      if (var3 != null && var3.aaba() != null) {
         var3.aaba().bba(var1);
      }
   }

   @Inject(
      method = {"method_53859"},
      at = {@At("RETURN")}
   )
   private void ab(ChannelPipeline var1, CallbackInfo var2) {
      if (this.b()) {
         this.ba(var1);
      }
   }

   @Unique
   private void ba(ChannelPipeline var1) {
      ababaaaab.aaa().aab();
      Channel var2 = var1.channel();
      Runnable var3 = this::aab;
      if (var2.eventLoop().inEventLoop()) {
         var3.run();
      } else {
         try {
            var2.eventLoop().execute(var3);
         } catch (RuntimeException var5) {
         }
      }
   }

   @Inject(
      method = {"channelActive"},
      at = {@At("TAIL")}
   )
   private void bb(ChannelHandlerContext var1, CallbackInfo var2) {
      if (this.b()) {
         this.ba(var1.pipeline());
      }
   }

   @Inject(
      method = {"channelInactive"},
      at = {@At("HEAD")}
   )
   private void aaa(ChannelHandlerContext var1, CallbackInfo var2) {
      ababaaaab.aaa().ab();
      if (this.a != null) {
         this.a.babbaa();
         this.a = null;
      }
   }

   private void aab(Channel var1, ChannelPipeline var2) {
      if (this.field_11651 == var1 && var1.isOpen()) {
         ChannelHandler var3 = var2.get(b);
         if (var3 instanceof aabaaa var6) {
            this.a = var6;
         } else if (var3 == null) {
            ChannelHandlerContext var4 = var2.context((ChannelHandler)this);
            aabaaa var5 = new aabaaa();
            if (var4 != null) {
               var2.addBefore(var4.name(), b, var5);
            } else {
               var2.addLast(b, var5);
            }

            this.a = var5;
         }
      }
   }
}
