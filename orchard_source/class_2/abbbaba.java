package nsc;

import io.netty.channel.ChannelPromise;
import net.fabricmc.api.EnvType;
import net.fabricmc.api.Environment;

@Environment(EnvType.CLIENT)
record abbbaba(Object a, ChannelPromise b, long c, aabaaab d) {
   private final long aa;
   private final Object ab;
   private final ChannelPromise a;
   private final aabaaab b;

   public Object aa() {
      return this.ab;
   }

   private abbbaba(Object a, ChannelPromise b, long c, aabaaab d) {
      this.ab = a;
      this.a = b;
      this.aa = c;
      this.b = d;
   }

   public long ab() {
      return this.aa;
   }
}
