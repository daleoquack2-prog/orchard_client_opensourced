package nsc;

import net.fabricmc.api.EnvType;
import net.fabricmc.api.Environment;
import net.minecraft.class_2561;

@Environment(EnvType.CLIENT)
record ab(class_2561 a, boolean b) {
   private final class_2561 aa;
   private final boolean a;

   private ab(class_2561 a, boolean b) {
      this.aa = a;
      this.a = b;
   }

   public boolean aa() {
      return this.a;
   }

   public class_2561 b() {
      return this.aa;
   }
}
