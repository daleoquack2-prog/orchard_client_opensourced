package nsc;

import java.awt.Color;
import net.fabricmc.api.EnvType;
import net.fabricmc.api.Environment;

@Environment(EnvType.CLIENT)
record aabaabb(Color a, Color b) {
   private final Color aa;

   public Color aa() {
      return this.b;
   }

   public Color a() {
      return this.aa;
   }

   private aabaabb(Color a, Color b) {
      this.b = a;
      this.aa = b;
   }
}
