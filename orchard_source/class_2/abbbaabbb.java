package nsc;

import net.fabricmc.api.EnvType;
import net.fabricmc.api.Environment;

@Environment(EnvType.CLIENT)
record abbbaabbb(
   boolean moving, boolean closeToEdge, boolean safeToRelease, double directionX, double directionZ, double distance
) {
   private final double aa;
   private final double ab;
   private final boolean ba;
   private final double b;
   private final boolean bb;
   private final boolean a;

   public boolean aa() {
      return this.bb;
   }

   static abbbaabbb b() {
      return new abbbaabbb(false, false, true, 0.0, 0.0, 0.0);
   }

   public double a() {
      return this.aa;
   }

   public boolean ab() {
      return this.ba;
   }

   public boolean ba() {
      return this.a;
   }

   public double bb() {
      return this.b;
   }

   public double aaa() {
      return this.ab;
   }

   abbbaabbb(boolean moving, boolean closeToEdge, boolean safeToRelease, double directionX, double directionZ, double distance) {
      this.bb = moving;
      this.ba = closeToEdge;
      this.a = safeToRelease;
      this.b = directionX;
      this.aa = directionZ;
      this.ab = distance;
   }
}
