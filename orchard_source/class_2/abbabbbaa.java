package nsc;

import net.fabricmc.api.EnvType;
import net.fabricmc.api.Environment;

@Environment(EnvType.CLIENT)
record abbabbbaa(int a, int n, int o, int p, long q) {
   private final int b;
   private final int aa;
   private final long ab;
   private final int ba;
   private final int bb;

   public int b() {
      return this.ba;
   }

   public int aa() {
      return this.bb;
   }

   public long a() {
      return this.ab;
   }

   public int ab() {
      return this.b;
   }

   public int ba() {
      return this.aa;
   }

   private abbabbbaa(int a, int n, int o, int p, long q) {
      this.bb = a;
      this.aa = n;
      this.b = o;
      this.ba = p;
      this.ab = q;
   }
}
