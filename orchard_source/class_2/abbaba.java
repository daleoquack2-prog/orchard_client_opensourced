package nsc;

import net.fabricmc.api.EnvType;
import net.fabricmc.api.Environment;

@Environment(EnvType.CLIENT)
class abbaba implements ababaabba {
   final double[] aa;
   final double[] ab;
   final int b;
   final double a;
   final double[] ba;
   final double bb;

   @Override
   public double aa() {
      return this.bb;
   }

   @Override
   public double ab() {
      return this.a;
   }

   abbaba(int var1, double[] var2, double[] var3, double[] var4, double var5, double var7) {
      this.b = var1;
      this.ab = var2;
      this.ba = var3;
      this.aa = var4;
      this.bb = var5;
      this.a = var7;
   }

   @Override
   public void b(double var1, double[] var3) {
      double var4 = Math.max(0.0, Math.min((double)(this.b - 1), var1));
      int var6 = Math.min(this.b - 2, (int)Math.floor(var4));
      double var7 = var4 - var6;
      var3[0] = this.ab[var6] + (this.ab[var6 + 1] - this.ab[var6]) * var7;
      var3[1] = this.ba[var6] + (this.ba[var6 + 1] - this.ba[var6]) * var7;
      var3[2] = this.aa[var6] + (this.aa[var6 + 1] - this.aa[var6]) * var7;
   }
}
