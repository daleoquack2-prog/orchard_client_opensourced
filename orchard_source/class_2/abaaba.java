package nsc;

import java.util.List;
import net.fabricmc.api.EnvType;
import net.fabricmc.api.Environment;
import net.minecraft.class_1297;
import net.minecraft.class_2350;
import net.minecraft.class_243;

@Environment(EnvType.CLIENT)
record abaaba(List<class_243> bv, class_2350 bw, class_1297 bx) {
   private final class_1297 a;
   private final class_2350 b;
   private final List aa;

   public List a() {
      return this.aa;
   }

   public class_1297 aa() {
      return this.a;
   }

   private abaaba(List bv, class_2350 bw, class_1297 bx) {
      this.aa = bv;
      this.b = bw;
      this.a = bx;
   }
}
