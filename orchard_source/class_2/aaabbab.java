package nsc;

import net.fabricmc.api.EnvType;
import net.fabricmc.api.Environment;

@Environment(EnvType.CLIENT)
record aaabbab(
   double gravity, double drag, double waterDrag, double underwaterGravity, boolean e, bbbaa f
) {
   private final double aa;
   private final double a;
   private final double ab;
   private final double ba;
   private final bbbaa b;
   private final boolean bb;

   private aaabbab(
      double gravity, double drag, double waterDrag, double underwaterGravity, boolean e, bbbaa f
   ) {
      this.aa = gravity;
      this.ba = drag;
      this.ab = waterDrag;
      this.a = underwaterGravity;
      this.bb = e;
      this.b = f;
   }

   public double aa() {
      return this.ab;
   }

   public bbbaa ab() {
      return this.b;
   }

   public double ba() {
      return this.a;
   }

   public double aaa() {
      return this.ba;
   }

   public double b() {
      return this.aa;
   }
}
