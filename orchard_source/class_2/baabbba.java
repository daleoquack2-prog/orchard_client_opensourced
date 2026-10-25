package nsc;

import java.util.function.Consumer;
import java.util.function.Predicate;
import net.fabricmc.api.EnvType;
import net.fabricmc.api.Environment;
import net.minecraft.class_2596;

@Environment(EnvType.CLIENT)
record baabbba(Predicate<class_2596<?>> a, Consumer<class_2596<?>> b, Predicate<class_2596<?>> aM, Predicate<class_2596<?>> aN) {
   private final Predicate aa;
   private final Predicate ab;
   private final Predicate ba;
   private final Consumer a;

   private baabbba(Predicate a, Consumer b, Predicate aM, Predicate aN) {
      this.ba = a;
      this.a = b;
      this.ab = aM;
      this.aa = aN;
   }

   public Consumer aa() {
      return this.a;
   }

   public Predicate b() {
      return this.ba;
   }

   public Predicate a() {
      return this.aa;
   }
}
