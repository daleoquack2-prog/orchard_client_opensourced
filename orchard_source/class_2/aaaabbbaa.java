package nsc;

import net.fabricmc.api.EnvType;
import net.fabricmc.api.Environment;
import net.minecraft.class_243;

@Environment(EnvType.CLIENT)
public record aaaabbbaa(int a, class_243 b, float c, double d, float e, boolean f, float g, float h, boolean i) {
   private final float aa;
   private final float ab;
   private final float ba;
   private final class_243 bb;
   private final boolean b;
   private final double aaa;
   private final float aab;
   private final boolean aba;
   private final int abb;

   public boolean aa() {
      return this.aba;
   }

   public float ab() {
      return this.aab;
   }

   public float ba() {
      return this.ab;
   }

   public float bb() {
      return this.ba;
   }

   static aaaabbbaa aaa(int var0, class_243 var1) {
      try {
         if (var1 == null) {
            return null;
         }
      } catch (MatchException var2) {
         throw var2;
      }

      return new aaaabbbaa(var0, var1, 0.0F, 0.0, 360.0F, false, 0.0F, 0.0F, true);
   }

   public double aab() {
      return this.aaa;
   }

   aaaabbbaa(int var1, class_243 var2, float var3, double var4, float var6) {
      this(var1, var2, var3, var4, var6, false, 0.0F, 0.0F, false);
   }

   public aaaabbbaa(int a, class_243 b, float c, double d, float e, boolean f, float g, float h, boolean i) {
      this.abb = a;
      this.bb = b;
      this.ba = c;
      this.aaa = d;
      this.aab = e;
      this.b = f;
      this.aa = g;
      this.ab = h;
      this.aba = i;
   }

   public int aba() {
      return this.abb;
   }

   public float a() {
      return this.aa;
   }

   public class_243 abb() {
      return this.bb;
   }

   aaaabbbaa(int var1, class_243 var2, float var3, double var4, float var6, boolean var7) {
      this(var1, var2, var3, var4, var6, var7, 0.0F, 0.0F, false);
   }
}
