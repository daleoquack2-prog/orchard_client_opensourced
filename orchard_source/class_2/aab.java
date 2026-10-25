package nsc;

import net.fabricmc.api.EnvType;
import net.fabricmc.api.Environment;
import net.minecraft.class_2338;
import net.minecraft.class_243;
import net.minecraft.class_3965;

@Environment(EnvType.CLIENT)
record aab(class_2338 a, class_243 b, class_3965 c) {
   private final class_243 aa;
   private final class_3965 b;
   private final class_2338 ab;

   private aab(class_2338 a, class_243 b, class_3965 c) {
      this.ab = a;
      this.aa = b;
      this.b = c;
   }

   public class_2338 aa() {
      return this.ab;
   }

   public class_3965 a() {
      return this.b;
   }

   public class_243 ab() {
      return this.aa;
   }
}
