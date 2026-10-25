package nsc;

import net.fabricmc.api.EnvType;
import net.fabricmc.api.Environment;

@Environment(EnvType.CLIENT)
record abaaaa(
   ababbbbaa a, ababbbbaa b, double c, double d, double e
) {
   private final double aa;
   private final ababbbbaa ab;
   private final double b;
   private final ababbbbaa ba;
   private final double a;

   public ababbbbaa aa() {
      return this.ba;
   }

   private abaaaa(
      ababbbbaa a, ababbbbaa b, double c, double d, double e
   ) {
      this.ba = a;
      this.ab = b;
      this.b = c;
      this.a = d;
      this.aa = e;
   }

   public ababbbbaa a() {
      return this.ab;
   }

   public double b() {
      return this.a;
   }

   public double ab() {
      return this.aa;
   }

   public double ba() {
      return this.b;
   }
}
