package nsc;

import net.fabricmc.api.EnvType;
import net.fabricmc.api.Environment;
import net.minecraft.class_2338;
import net.minecraft.class_243;
import net.minecraft.class_3965;

@Environment(EnvType.CLIENT)
record abbabaaaa(class_2338 aC, class_243 aD, class_3965 aE) {
   private final class_3965 a;
   private final class_2338 b;
   private final class_243 aa;

   public class_243 a() {
      return this.aa;
   }

   private abbabaaaa(class_2338 aC, class_243 aD, class_3965 aE) {
      this.b = aC;
      this.aa = aD;
      this.a = aE;
   }

   public class_3965 aa() {
      return this.a;
   }
}
