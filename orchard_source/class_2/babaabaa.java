package nsc;

import net.fabricmc.api.EnvType;
import net.fabricmc.api.Environment;
import net.minecraft.class_1309;

@Environment(EnvType.CLIENT)
record babaabaa(class_1309 a, aaaabbbaa b, double c, double d, float e) {
   private final float aa;
   private final class_1309 ab;
   private final aaaabbbaa a;
   private final double b;
   private final double ba;

   public double aa() {
      return this.b;
   }

   public double ab() {
      return this.ba;
   }

   private babaabaa(class_1309 a, aaaabbbaa b, double c, double d, float e) {
      this.ab = a;
      this.a = b;
      this.b = c;
      this.ba = d;
      this.aa = e;
   }

   public aaaabbbaa ba() {
      return this.a;
   }

   public class_1309 b() {
      return this.ab;
   }

   public float a() {
      return this.aa;
   }
}
