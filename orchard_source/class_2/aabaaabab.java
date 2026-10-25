package nsc;

import net.fabricmc.api.EnvType;
import net.fabricmc.api.Environment;
import net.minecraft.class_2338;
import net.minecraft.class_243;
import net.minecraft.class_3965;

@Environment(EnvType.CLIENT)
record aabaaabab(class_2338 aF, class_2338 a, class_243 aH, class_3965 aI) {
   private final class_3965 b;
   private final class_243 aa;
   private final class_2338 ab;

   public class_243 a() {
      return this.aa;
   }

   public class_2338 aa() {
      return this.a;
   }

   private aabaaabab(class_2338 aF, class_2338 a, class_243 aH, class_3965 aI) {
      this.a = aF;
      this.ab = a;
      this.aa = aH;
      this.b = aI;
   }
}
