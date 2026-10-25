package nsc;

import io.netty.channel.ChannelPromise;
import net.fabricmc.api.EnvType;
import net.fabricmc.api.Environment;

@Environment(EnvType.CLIENT)
record aabaaab(Object a, ChannelPromise b, long c, int d, long e) {
   private final long aa;
   private final ChannelPromise ab;
   private final long b;
   private final Object ba;
   private final int a;

   public long ab() {
      return this.b;
   }

   public int ba() {
      return this.a;
   }

   public Object bb() {
      return this.ba;
   }

   private aabaaab(Object a, ChannelPromise b, long c, int d, long e) {
      this.ba = a;
      this.ab = b;
      this.aa = c;
      this.a = d;
      this.b = e;
   }

   public ChannelPromise a() {
      return this.ab;
   }
}
