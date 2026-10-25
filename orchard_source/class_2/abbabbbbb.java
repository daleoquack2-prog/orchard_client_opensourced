package nsc;

import net.fabricmc.api.EnvType;
import net.fabricmc.api.Environment;
import net.minecraft.class_2338;
import net.minecraft.class_243;

@Environment(EnvType.CLIENT)
record abbabbbbb(class_2338 a, class_2338 b, class_243 c) {
   private final class_2338 aa;
   private final class_243 a;
   private final class_2338 ab;

   public class_243 aa() {
      return this.a;
   }

   public class_2338 ab() {
      return this.aa;
   }

   public class_2338 a() {
      return this.ab;
   }

   private abbabbbbb(class_2338 a, class_2338 b, class_243 c) {
      this.aa = a;
      this.ab = b;
      this.a = c;
   }
}
