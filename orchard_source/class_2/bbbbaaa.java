package nsc;

import net.fabricmc.api.EnvType;
import net.fabricmc.api.Environment;

@Environment(EnvType.CLIENT)
public record bbbbaaa(
   double a, float b, boolean c, aaaabbba d, boolean e, boolean f, boolean g, boolean h, boolean aJ, boolean aK, double aL
) {
   private final boolean aa;
   private final double ab;
   private final float a;
   private final boolean b;
   private final boolean ba;
   private final boolean bb;
   private final aaaabbba aaa;
   private final double aab;
   private final boolean aba;
   private final boolean abb;
   private final boolean baa;

   public float aa() {
      return this.a;
   }

   public boolean b() {
      return this.aa;
   }

   public boolean ab() {
      return this.b;
   }

   public double ba() {
      return this.aab;
   }

   public aaaabbba bb() {
      return this.aaa;
   }

   public boolean aaa() {
      return this.bb;
   }

   public bbbbaaa(
      double a, float b, boolean c, aaaabbba d, boolean e, boolean f, boolean g, boolean h, boolean aJ, boolean aK, double aL
   ) {
      this.ab = a;
      this.a = b;
      this.baa = c;
      this.aaa = d;
      this.b = e;
      this.ba = f;
      this.bb = g;
      this.abb = h;
      this.aba = aJ;
      this.aa = aK;
      this.aab = aL;
   }

   bbbbaaa(
      double var1, float var3, boolean var4, aaaabbba var5, boolean var6, boolean var7, boolean var8, boolean var9
   ) {
      this(var1, var3, var4, var5, var6, var7, var8, var9, true, false, 1.0);
   }

   public boolean aab() {
      return this.ba;
   }

   public boolean aba() {
      return this.baa;
   }

   public boolean baa() {
      return this.aba;
   }

   public double bab() {
      return this.ab;
   }
}
