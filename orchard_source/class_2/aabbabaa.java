package nsc;

import net.fabricmc.api.EnvType;
import net.fabricmc.api.Environment;
import net.minecraft.class_1657;

@Environment(EnvType.CLIENT)
record aabbabaa(class_1657 cD, double cE, double cF, float cG) {
   private final double a;
   private final double b;
   private final class_1657 aa;
   private final float ab;

   public float a() {
      return this.ab;
   }

   public double aa() {
      return this.a;
   }

   private aabbabaa(class_1657 cD, double cE, double cF, float cG) {
      this.aa = cD;
      this.a = cE;
      this.b = cF;
      this.ab = cG;
   }

   public class_1657 ab() {
      return this.aa;
   }
}
