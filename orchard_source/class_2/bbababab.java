package nsc;

import net.fabricmc.api.EnvType;
import net.fabricmc.api.Environment;
import net.minecraft.class_2960;

@Environment(EnvType.CLIENT)
record bbababab(char a, class_2960 b) {
   private final class_2960 aa;
   private final char b;

   private bbababab(char a, class_2960 b) {
      this.b = a;
      this.aa = b;
   }

   public char aa() {
      return this.b;
   }

   public class_2960 a() {
      return this.aa;
   }
}
