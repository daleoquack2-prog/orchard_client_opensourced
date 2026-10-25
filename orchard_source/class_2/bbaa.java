package nsc;

import net.fabricmc.api.EnvType;
import net.fabricmc.api.Environment;

@Environment(EnvType.CLIENT)
record bbaa(long r, int s) {
   private final int a;
   private final long b;

   private bbaa(long r, int s) {
      this.b = r;
      this.a = s;
   }
}
