package nsc;

import net.fabricmc.api.EnvType;
import net.fabricmc.api.Environment;

@Environment(EnvType.CLIENT)
record abbabbaaa(double ck, double cl, double cm, double cn, double co, double cp, int cq) {
   private final int a;
   private final double b;
   private final double aa;
   private final double ab;
   private final double ba;
   private final double bb;
   private final double aaa;

   public double a() {
      return this.ab;
   }

   public double b() {
      return this.bb;
   }

   public double aa() {
      return this.b;
   }

   public double ab() {
      return this.ba;
   }

   public double ba() {
      return this.aa;
   }

   public double bb() {
      return this.aaa;
   }

   public int aaa() {
      return this.a;
   }

   private abbabbaaa(double ck, double cl, double cm, double cn, double co, double cp, int cq) {
      this.bb = ck;
      this.b = cl;
      this.ba = cm;
      this.ab = cn;
      this.aa = co;
      this.aaa = cp;
      this.a = cq;
   }
}
