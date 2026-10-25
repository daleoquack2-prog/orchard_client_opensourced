package nsc;

import net.fabricmc.api.EnvType;
import net.fabricmc.api.Environment;

@Environment(EnvType.CLIENT)
record abbbbaaaa(Object a, long b) {
   private final long aa;
   private final Object b;

   public Object aa() {
      return this.b;
   }

   public long a() {
      return this.aa;
   }

   private abbbbaaaa(Object a, long b) {
      this.b = a;
      this.aa = b;
   }
}
