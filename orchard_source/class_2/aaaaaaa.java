package nsc;

import net.fabricmc.api.EnvType;
import net.fabricmc.api.Environment;

@Environment(EnvType.CLIENT)
public record aaaaaaa(double x, double y, float c) {
   private final double aa;
   private final float a;
   private final double ab;

   public aaaaaaa(double x, double y, float c) {
      this.aa = x;
      this.ab = y;
      this.a = c;
   }

   public double aa() {
      return this.ab;
   }

   public float b() {
      return this.a;
   }

   public double ab() {
      return this.aa;
   }
}
