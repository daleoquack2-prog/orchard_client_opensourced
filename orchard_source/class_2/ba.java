package nsc;

import net.fabricmc.api.EnvType;
import net.fabricmc.api.Environment;

@Environment(EnvType.CLIENT)
public record ba(float bR, float bS, int bT, int bU, int bV) {
   private final int a;
   private final float b;
   private final int aa;
   private final float ab;
   private final int ba;

   public float b() {
      return this.ab;
   }

   public ba(float bR, float bS, int bT, int bU, int bV) {
      this.ab = bR;
      this.b = bS;
      this.ba = bT;
      this.a = bU;
      this.aa = bV;
   }

   public int aa() {
      return this.ba;
   }

   public float ab() {
      return this.b;
   }

   public int ba() {
      return this.aa;
   }
}
