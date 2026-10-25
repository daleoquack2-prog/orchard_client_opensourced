package nsc;

import net.fabricmc.api.EnvType;
import net.fabricmc.api.Environment;
import net.minecraft.class_2338;
import net.minecraft.class_3965;

@Environment(EnvType.CLIENT)
record abbaaabaa(class_2338 a, class_3965 b) {
   private final class_2338 aa;
   private final class_3965 a;

   public class_3965 aa() {
      return this.a;
   }

   private abbaaabaa(class_2338 a, class_3965 b) {
      this.aa = a;
      this.a = b;
   }

   public class_2338 b() {
      return this.aa;
   }
}
