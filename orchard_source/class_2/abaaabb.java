package nsc;

import net.fabricmc.api.EnvType;
import net.fabricmc.api.Environment;

@Environment(EnvType.CLIENT)
public record abaaabb(boolean b1, double b2) {
   private final double a;
   private final boolean b;

   public boolean a() {
      return this.b;
   }

   public abaaabb(boolean b1, double b2) {
      this.b = b1;
      this.a = b2;
   }

   public double b() {
      return this.a;
   }
}
