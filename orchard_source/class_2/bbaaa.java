package nsc;

import net.fabricmc.api.EnvType;
import net.fabricmc.api.Environment;
import net.minecraft.class_243;

@Environment(EnvType.CLIENT)
record bbaaa(class_243 bt, class_243 bu) {
   private final class_243 a;
   private final class_243 b;

   bbaaa(class_243 bt, class_243 bu) {
      this.b = bt;
      this.a = bu;
   }

   public class_243 a() {
      return this.b;
   }

   public class_243 b() {
      return this.a;
   }
}
