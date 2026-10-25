package nsc;

import net.fabricmc.api.EnvType;
import net.fabricmc.api.Environment;

@Environment(EnvType.CLIENT)
record babaaaba(baaababa a, bbabaaab b) {
   private final baaababa aa;
   private final bbabaaab a;

   private babaaaba(baaababa a, bbabaaab b) {
      this.aa = a;
      this.a = b;
   }

   public bbabaaab aa() {
      return this.a;
   }

   public baaababa b() {
      return this.aa;
   }
}
