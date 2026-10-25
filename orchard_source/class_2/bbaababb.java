package nsc;

import net.fabricmc.api.EnvType;
import net.fabricmc.api.Environment;

@Environment(EnvType.CLIENT)
record bbaababb(String a, String bg, String bh, int bi, double b, double c, double d) {
   private final String aa;
   private final double a;
   private final int ab;
   private final String ba;
   private final double bb;
   private final String aaa;
   private final double aab;

   public String b() {
      return this.aa;
   }

   private bbaababb(String a, String bg, String bh, int bi, double b, double c, double d) {
      this.aa = a;
      this.aaa = bg;
      this.ba = bh;
      this.ab = bi;
      this.aab = b;
      this.bb = c;
      this.a = d;
   }

   public int a() {
      return this.ab;
   }

   public double aa() {
      return this.a;
   }

   public String ab() {
      return this.aaa;
   }

   public double ba() {
      return this.aab;
   }

   public String bb() {
      return this.ba;
   }

   public double aaa() {
      return this.bb;
   }
}
