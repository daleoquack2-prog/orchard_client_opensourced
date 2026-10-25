package nsc;

import java.util.Map;
import net.fabricmc.api.EnvType;
import net.fabricmc.api.Environment;
import net.minecraft.class_2960;

@Environment(EnvType.CLIENT)
record bbbbaabb(
   class_2960 a,
   double b,
   double c,
   float d,
   double e,
   double f,
   double g,
   Map<Integer, aabaababb> h,
   aabaababb[] i,
   aabaababb j
) {
   private final double aa;
   private final aabaababb[] ab;
   private final Map ba;
   private final class_2960 bb;
   private final double a;
   private final double aaa;
   private final aabaababb b;
   private final double aab;
   private final float aba;
   private final double abb;

   public double aa() {
      return this.abb;
   }

   public double ab() {
      return this.aa;
   }

   public float ba() {
      return this.aba;
   }

   public Map bb() {
      return this.ba;
   }

   public aabaababb[] aab() {
      return this.ab;
   }

   public double aba() {
      return this.aab;
   }

   private bbbbaabb(
      class_2960 a,
      double b,
      double c,
      float d,
      double e,
      double f,
      double g,
      Map h,
      aabaababb[] i,
      aabaababb j
   ) {
      this.bb = a;
      this.aaa = b;
      this.a = c;
      this.aba = d;
      this.abb = e;
      this.aab = f;
      this.aa = g;
      this.ba = h;
      this.ab = i;
      this.b = j;
   }

   public class_2960 abb() {
      return this.bb;
   }
}
