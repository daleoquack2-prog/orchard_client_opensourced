package nsc;

import net.fabricmc.api.EnvType;
import net.fabricmc.api.Environment;

@Environment(EnvType.CLIENT)
public record aaababba(float bP, float bQ) {
   private final float a;
   private final float b;

   public float a() {
      return this.b;
   }

   public float b() {
      return this.a;
   }

   public aaababba(float bP, float bQ) {
      this.a = bP;
      this.b = bQ;
   }
}
