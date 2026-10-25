package nsc;

import java.util.List;
import net.fabricmc.api.EnvType;
import net.fabricmc.api.Environment;
import net.minecraft.class_1297;
import net.minecraft.class_243;

@Environment(EnvType.CLIENT)
record babbabaa(List<class_243> a, boolean b, class_1297 c) {
   private final class_1297 aa;
   private final List ab;
   private final boolean a;

   public boolean ab() {
      return this.a;
   }

   public List b() {
      return this.ab;
   }

   private babbabaa(List a, boolean b, class_1297 c) {
      this.ab = a;
      this.a = b;
      this.aa = c;
   }
}
