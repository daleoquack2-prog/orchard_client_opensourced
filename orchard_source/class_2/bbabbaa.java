package nsc;

import net.fabricmc.api.EnvType;
import net.fabricmc.api.Environment;
import net.minecraft.class_243;

@Environment(EnvType.CLIENT)
public record bbabbaa(class_243 a, float b, float c, float d, float e) {
   private final float aa;
   private final float ab;
   private final float ba;
   private final class_243 bb;

   public float aa() {
      return this.b;
   }

   public class_243 b() {
      return this.bb;
   }

   public bbabbaa(class_243 a, float b, float c, float d, float e) {
      this.bb = a;
      this.ab = b;
      this.ba = c;
      this.b = d;
      this.aa = e;
   }

   public float a() {
      return this.aa;
   }
}
