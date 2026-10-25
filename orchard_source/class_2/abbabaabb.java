package nsc;

import net.fabricmc.api.EnvType;
import net.fabricmc.api.Environment;
import net.minecraft.class_243;

@Environment(EnvType.CLIENT)
record abbabaabb(class_243 a, long b) {
   private final class_243 aa;
   private final long a;

   public long aa() {
      return this.a;
   }

   public class_243 b() {
      return this.aa;
   }

   private abbabaabb(class_243 a, long b) {
      this.aa = a;
      this.a = b;
   }
}
