package nsc;

import net.fabricmc.api.EnvType;
import net.fabricmc.api.Environment;

@Environment(EnvType.CLIENT)
public interface aaabbbaaa {
   void aaa();

   default babb ab(
      babb var1, babb var2, float var3, float var4, float var5
   ) {
      return this.bb(var1, var2, var3, var5);
   }

   babb bb(babb var1, babb var2, float var3, float var4);
}
