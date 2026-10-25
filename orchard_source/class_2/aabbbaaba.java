package nsc;

import net.fabricmc.api.EnvType;
import net.fabricmc.api.Environment;
import net.minecraft.class_243;

@Environment(EnvType.CLIENT)
record aabbbaaba(int a, class_243 b, float c, double d, double e, double f, double g) {
   private final double aa;
   private final float ab;
   private final class_243 ba;
   private final double b;
   private final double bb;
   private final int aaa;
   private final double a;

   public class_243 ab() {
      return this.ba;
   }

   private aabbbaaba(int a, class_243 b, float c, double d, double e, double f, double g) {
      this.aaa = a;
      this.ba = b;
      this.ab = c;
      this.b = d;
      this.a = e;
      this.aa = f;
      this.bb = g;
   }

   public double b() {
      return this.a;
   }

   public double ba() {
      return this.b;
   }

   public float bb() {
      return this.ab;
   }

   public double aaa() {
      return this.bb;
   }

   public int aab() {
      return this.aaa;
   }
}
