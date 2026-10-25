package nsc;

import net.fabricmc.api.EnvType;
import net.fabricmc.api.Environment;
import net.minecraft.class_2338;

@Environment(EnvType.CLIENT)
record abbbbabaa(class_2338 bM, double bN, double bO) {
   private final double a;
   private final class_2338 b;
   private final double aa;

   public class_2338 a() {
      return this.b;
   }

   private abbbbabaa(class_2338 bM, double bN, double bO) {
      this.b = bM;
      this.a = bN;
      this.aa = bO;
   }

   public double b() {
      return this.aa;
   }

   public double aa() {
      return this.a;
   }
}
