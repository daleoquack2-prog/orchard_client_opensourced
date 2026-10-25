package nsc;

import net.fabricmc.api.EnvType;
import net.fabricmc.api.Environment;
import net.minecraft.class_243;

@Environment(EnvType.CLIENT)
record aababbabb(class_243 ao, float ap, float aq, float ar, float as, float at, float au) {
   private final float a;
   private final float b;
   private final class_243 aa;
   private final float ab;
   private final float ba;
   private final float bb;
   private final float aaa;

   public float a() {
      return this.ba;
   }

   private aababbabb(class_243 ao, float ap, float aq, float ar, float as, float at, float au) {
      this.aa = ao;
      this.ab = ap;
      this.ba = aq;
      this.b = ar;
      this.aaa = as;
      this.bb = at;
      this.a = au;
   }

   public class_243 b() {
      return this.aa;
   }

   public float aa() {
      return this.bb;
   }

   public float ab() {
      return this.aaa;
   }

   public float ba() {
      return this.ab;
   }

   public float bb() {
      return this.b;
   }

   public float aaa() {
      return this.a;
   }
}
