package nsc;

import net.fabricmc.api.EnvType;
import net.fabricmc.api.Environment;

@Environment(EnvType.CLIENT)
record baaabbba(String a, String b) {
   private final String aa;

   private baaabbba(String a, String b) {
      this.aa = a;
      this.a = b;
   }
}
