package nsc;

import net.fabricmc.api.EnvType;
import net.fabricmc.api.Environment;
import net.minecraft.class_2338;
import net.minecraft.class_243;
import net.minecraft.class_3965;

@Environment(EnvType.CLIENT)
record abaaaabaa(class_2338 by, class_243 bz, class_3965 bA) {
   private final class_243 a;
   private final class_3965 b;
   private final class_2338 aa;

   private abaaaabaa(class_2338 by, class_243 bz, class_3965 bA) {
      this.aa = by;
      this.a = bz;
      this.b = bA;
   }
}
