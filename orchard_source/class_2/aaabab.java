package nsc;

import net.fabricmc.api.EnvType;
import net.fabricmc.api.Environment;
import net.minecraft.class_243;
import net.minecraft.class_3965;

@Environment(EnvType.CLIENT)
record aaabab(class_243 cB, class_3965 cC) {
   private final class_243 a;
   private final class_3965 b;

   private aaabab(class_243 cB, class_3965 cC) {
      this.a = cB;
      this.b = cC;
   }
}
