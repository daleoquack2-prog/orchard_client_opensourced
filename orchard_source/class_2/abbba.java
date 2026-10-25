package nsc;

import net.fabricmc.api.EnvType;
import net.fabricmc.api.Environment;

@Environment(EnvType.CLIENT)
record abbba(String a, boolean b, boolean c) {
   private final boolean aa;
   private final String ab;

   public String b() {
      return this.ab;
   }

   public boolean a() {
      return this.b;
   }

   private abbba(String a, boolean b, boolean c) {
      this.ab = a;
      this.aa = b;
      this.b = c;
   }
}
