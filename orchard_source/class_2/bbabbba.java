package nsc;

import net.fabricmc.api.EnvType;
import net.fabricmc.api.Environment;
import net.minecraft.class_2338;

@Environment(EnvType.CLIENT)
record bbabbba(aabaaaabb aA, class_2338 aB) {
   static final bbabbba b = new bbabbba(aabaaaabb.b, null);
   private final aabaaaabb a;
   private final class_2338 aa;

   bbabbba(aabaaaabb aA, class_2338 aB) {
      this.a = aA;
      this.aa = aB;
   }

   public class_2338 b() {
      return this.aa;
   }
}
