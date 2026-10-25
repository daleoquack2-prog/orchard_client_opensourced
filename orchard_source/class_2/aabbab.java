package nsc;

import net.fabricmc.api.EnvType;
import net.fabricmc.api.Environment;
import net.minecraft.class_2338;

@Environment(EnvType.CLIENT)
record aabbab(class_2338 a, int b, float aa, float ab) {
   private final int ba;
   private final float b;
   private final class_2338 ab;

   public float ba() {
      return this.aa;
   }

   public int ab() {
      return this.ba;
   }

   public class_2338 b() {
      return this.ab;
   }

   public float a() {
      return this.b;
   }

   private aabbab(class_2338 a, int b, float aa, float ab) {
      this.ab = a;
      this.ba = b;
      this.b = aa;
      this.aa = ab;
   }
}
