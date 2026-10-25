package nsc;

import net.fabricmc.api.EnvType;
import net.fabricmc.api.Environment;
import net.minecraft.class_243;

@Environment(EnvType.CLIENT)
record aabb(class_243 bq, abaabb br, class_243 bs) {
   private final class_243 a;
   private final abaabb b;
   private final class_243 aa;

   public abaabb a() {
      return this.b;
   }

   private aabb(class_243 bq, abaabb br, class_243 bs) {
      this.a = bq;
      this.b = br;
      this.aa = bs;
   }

   public class_243 b() {
      return this.aa;
   }

   public class_243 aa() {
      return this.a;
   }
}
