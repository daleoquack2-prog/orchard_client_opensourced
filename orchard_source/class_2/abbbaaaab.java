package nsc;

import net.fabricmc.api.EnvType;
import net.fabricmc.api.Environment;
import net.minecraft.class_1657;

@Environment(EnvType.CLIENT)
record abbbaaaab(class_1657 w, double x, double y, float z) {
   private final double a;
   private final class_1657 b;
   private final double aa;
   private final float ab;

   public class_1657 a() {
      return this.b;
   }

   private abbbaaaab(class_1657 w, double x, double y, float z) {
      this.b = w;
      this.aa = x;
      this.a = y;
      this.ab = z;
   }

   public float b() {
      return this.ab;
   }

   public double aa() {
      return this.a;
   }

   public double ab() {
      return this.aa;
   }
}
