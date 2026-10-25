package nsc;

import net.fabricmc.api.EnvType;
import net.fabricmc.api.Environment;
import net.minecraft.class_2338;

@Environment(EnvType.CLIENT)
record abbbabbba(baaaaa a, int b, class_2338 c) {
   private final baaaaa aa;
   private final class_2338 a;
   private final int ab;

   private abbbabbba(baaaaa a, int b, class_2338 c) {
      this.aa = a;
      this.ab = b;
      this.a = c;
   }

   public int a() {
      return this.ab;
   }

   public class_2338 b() {
      return this.a;
   }
}
