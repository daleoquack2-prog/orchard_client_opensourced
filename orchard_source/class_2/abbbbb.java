package nsc;

import net.fabricmc.api.EnvType;
import net.fabricmc.api.Environment;
import net.minecraft.class_2338;
import net.minecraft.class_243;
import net.minecraft.class_3965;

@Environment(EnvType.CLIENT)
record abbbbb(class_2338 bI, class_2338 bJ, class_243 bK, class_3965 bL) {
   private final class_2338 a;
   private final class_2338 b;
   private final class_3965 aa;
   private final class_243 ab;

   public class_3965 a() {
      return this.aa;
   }

   private abbbbb(class_2338 bI, class_2338 bJ, class_243 bK, class_3965 bL) {
      this.a = bI;
      this.b = bJ;
      this.ab = bK;
      this.aa = bL;
   }

   public class_2338 aa() {
      return this.a;
   }
}
