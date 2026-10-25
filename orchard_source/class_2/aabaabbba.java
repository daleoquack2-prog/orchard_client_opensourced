package nsc;

import net.fabricmc.api.EnvType;
import net.fabricmc.api.Environment;
import net.minecraft.class_1268;
import net.minecraft.class_1799;

@Environment(EnvType.CLIENT)
record aabaabbba(class_1268 a, int b, class_1799 c) {
   private final class_1799 aa;
   private final int ab;
   private final class_1268 b;

   public class_1268 aa() {
      return this.b;
   }

   private aabaabbba(class_1268 a, int b, class_1799 c) {
      this.b = a;
      this.ab = b;
      this.aa = c;
   }

   public int a() {
      return this.ab;
   }

   public class_1799 b() {
      return this.aa;
   }
}
