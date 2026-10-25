package nsc;

import java.util.List;
import net.fabricmc.api.EnvType;
import net.fabricmc.api.Environment;

@Environment(EnvType.CLIENT)
public record babbbaaa(double b3, double b4, List<abaaabb> b5) {
   private final double a;
   private final List b;
   private final double aa;

   public babbbaaa(double b3, double b4, List b5) {
      this.aa = b3;
      this.a = b4;
      this.b = b5;
   }

   public double a() {
      return this.aa;
   }

   public double b() {
      return this.a;
   }

   public List aa() {
      return this.b;
   }
}
