package nsc;

import net.fabricmc.api.EnvType;
import net.fabricmc.api.Environment;
import net.minecraft.class_4184;
import net.minecraft.class_757;
import org.joml.Matrix4f;

@Environment(EnvType.CLIENT)
public final class bbbababa {
   public static final aaabaabb aa = new aaabaabb();
   private static volatile abbabbbab a = new abbabbbab(null, null, null, null, null);
   private static volatile abaabaabb b = new abaabaabb(null, null, null, null);

   private static Object b(Object var0, Object var1) {
      int var2 = baaabbaa.bba;

      try {
         if (var2 != 0) {
            return var0;
         }

         if (var0 != null) {
            return var0;
         }
      } catch (MatchException var3) {
         throw var3;
      }

      return var1;
   }

   public static void aa(class_4184 var0, class_757 var1, Matrix4f var2, Matrix4f var3) {
      b = new abaabaabb(var0, var1, ab(var2), ab(var3));
   }

   private static Matrix4f ab(Matrix4f var0) {
      try {
         if (var0 == null) {
            return null;
         }
      } catch (MatchException var1) {
         throw var1;
      }

      return new Matrix4f(var0);
   }

   private bbbababa() {
   }
}
