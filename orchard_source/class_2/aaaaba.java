package nsc;

import net.fabricmc.api.EnvType;
import net.fabricmc.api.Environment;
import net.minecraft.class_1297;
import net.minecraft.class_243;

@Environment(EnvType.CLIENT)
record aaaaba(class_1297 a, class_243 b, double c) {
   private final class_243 aa;
   private final double b;
   private final class_1297 ab;

   public class_1297 aa() {
      return this.ab;
   }

   private aaaaba(class_1297 a, class_243 b, double c) {
      this.ab = a;
      this.aa = b;
      this.b = c;
   }

   public double a() {
      return this.b;
   }

   public class_243 ab() {
      return this.aa;
   }
}
