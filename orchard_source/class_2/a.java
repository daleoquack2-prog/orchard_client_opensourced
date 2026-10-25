package nsc;

import net.fabricmc.api.EnvType;
import net.fabricmc.api.Environment;
import net.minecraft.class_1922;
import net.minecraft.class_2338;
import net.minecraft.class_243;
import net.minecraft.class_259;
import net.minecraft.class_265;
import net.minecraft.class_2680;
import net.minecraft.class_3726;
import net.minecraft.class_3959;
import net.minecraft.class_3959.class_242;
import net.minecraft.class_3959.class_3960;

@Environment(EnvType.CLIENT)
class a extends class_3959 {
   a(class_243 var1, class_243 var2, class_3960 var3, class_242 var4, class_3726 var5) {
      super(var1, var2, var3, var4, var5);
   }

   public class_265 method_17748(class_2680 var1, class_1922 var2, class_2338 var3) {
      try {
         if (aabbabbbb.ababaa(var1)) {
            return class_259.method_1073();
         }
      } catch (MatchException var4) {
         throw var4;
      }

      return super.method_17748(var1, var2, var3);
   }
}
