package nsc;

import net.fabricmc.api.EnvType;
import net.fabricmc.api.Environment;

@Environment(EnvType.CLIENT)
public record bbbaabaa(boolean a, Integer b) {
   private final boolean aa;
   private static final bbbaabaa a = new bbbaabaa(false, null);
   private final Integer ab;

   public bbbaabaa(boolean a, Integer b) {
      this.aa = a;
      this.ab = b;
   }

   public Integer aa() {
      return this.ab;
   }

   public boolean b() {
      return this.aa;
   }
}
