package nsc;

import net.fabricmc.api.EnvType;
import net.fabricmc.api.Environment;

@Environment(EnvType.CLIENT)
record babbab(int a, ababbaa b, double c, int d) {
   private final double aa;
   private final int ab;
   private final int ba;
   private final ababbaa a;

   private babbab(int a, ababbaa b, double c, int d) {
      this.ba = a;
      this.a = b;
      this.aa = c;
      this.ab = d;
   }

   public int aa() {
      return this.ba;
   }

   public int a() {
      return this.ab;
   }

   public double ab() {
      return this.aa;
   }

   public ababbaa ba() {
      return this.a;
   }
}
