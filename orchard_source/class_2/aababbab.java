package nsc;

import io.netty.channel.ChannelPromise;
import net.fabricmc.api.EnvType;
import net.fabricmc.api.Environment;

@Environment(EnvType.CLIENT)
record aababbab(Object a, ChannelPromise b, long c, long d) {
   private final Object aa;
   private final long a;
   private final ChannelPromise ab;
   private final long b;

   public long aa() {
      return this.a;
   }

   public Object b() {
      return this.aa;
   }

   public long a() {
      return this.b;
   }

   private aababbab(Object a, ChannelPromise b, long c, long d) {
      this.aa = a;
      this.ab = b;
      this.a = c;
      this.b = d;
   }
}
