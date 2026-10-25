package nsc;

import net.fabricmc.api.EnvType;
import net.fabricmc.api.Environment;
import net.minecraft.class_243;

@Environment(EnvType.CLIENT)
record abaaaaaa(class_243 position, class_243 initialVelocity, aaabbab c) {
   private final aaabbab aa;
   private final class_243 ab;
   private final class_243 a;

   public class_243 aa() {
      return this.ab;
   }

   public aaabbab a() {
      return this.aa;
   }

   private abaaaaaa(class_243 position, class_243 initialVelocity, aaabbab c) {
      this.ab = position;
      this.a = initialVelocity;
      this.aa = c;
   }

   public class_243 ab() {
      return this.a;
   }
}
