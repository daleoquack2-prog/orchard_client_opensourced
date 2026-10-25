package nsc;

import net.fabricmc.api.EnvType;
import net.fabricmc.api.Environment;

@Environment(EnvType.CLIENT)
record abbbbbb(
   ababbab a, boolean b, boolean c, boolean d, boolean e, boolean f, boolean g, boolean h, boolean i, long j
) {
   private final boolean aa;
   private final boolean ab;
   private final boolean ba;
   private final boolean bb;
   private final boolean aaa;
   private final boolean aab;
   private final long aba;
   private final ababbab abb;
   private final boolean a;

   public boolean aa() {
      return this.aab;
   }

   private abbbbbb(
      ababbab a, boolean b, boolean c, boolean d, boolean e, boolean f, boolean g, boolean h, boolean i, long j
   ) {
      this.abb = a;
      this.aa = b;
      this.ab = c;
      this.aab = d;
      this.ba = e;
      this.a = f;
      this.aaa = g;
      this.b = h;
      this.bb = i;
      this.aba = j;
   }

   public boolean ab() {
      return this.aaa;
   }

   public ababbab ba() {
      return this.abb;
   }

   public boolean a() {
      return this.ab;
   }

   public long bb() {
      return this.aba;
   }

   public boolean aaa() {
      return this.b;
   }

   public boolean aab() {
      return this.a;
   }

   public boolean aba() {
      return this.ba;
   }

   public boolean abb() {
      return this.bb;
   }

   public boolean baa() {
      return this.aa;
   }
}
