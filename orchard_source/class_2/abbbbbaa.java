package nsc;

import net.fabricmc.api.EnvType;
import net.fabricmc.api.Environment;
import net.minecraft.class_2338;
import net.minecraft.class_243;
import net.minecraft.class_3965;

@Environment(EnvType.CLIENT)
record abbbbbaa(class_2338 a3, class_243 a4, class_3965 a5, float a6, float a7) {
   private final class_243 a;
   private final float b;
   private final class_2338 aa;
   private final float ab;
   private final class_3965 ba;

   public float a() {
      return this.ab;
   }

   public class_3965 b() {
      return this.ba;
   }

   public class_243 aa() {
      return this.a;
   }

   public float ab() {
      return this.b;
   }

   public class_2338 ba() {
      return this.aa;
   }

   private abbbbbaa(class_2338 a3, class_243 a4, class_3965 a5, float a6, float a7) {
      this.aa = a3;
      this.a = a4;
      this.ba = a5;
      this.b = a6;
      this.ab = a7;
   }
}
