package nsc;

import net.fabricmc.api.EnvType;
import net.fabricmc.api.Environment;
import net.minecraft.class_2338;

@Environment(EnvType.CLIENT)
record abbbaaaa(class_2338 a, class_2338 b, float c, float d, class_2338 aj, class_2338 ak) {
   private final class_2338 aa;
   private final float ab;
   private final float ba;
   private final class_2338 bb;

   public class_2338 aa() {
      return this.b;
   }

   public class_2338 ab() {
      return this.bb;
   }

   private abbbaaaa(class_2338 a, class_2338 b, float c, float d, class_2338 aj, class_2338 ak) {
      this.bb = a;
      this.a = b;
      this.ab = c;
      this.ba = d;
      this.aa = aj;
      this.b = ak;
   }

   public float a() {
      return this.ab;
   }

   public class_2338 bb() {
      return this.aa;
   }

   public class_2338 aaa() {
      return this.a;
   }
}
