package nsc;

import java.util.SplittableRandom;
import net.fabricmc.api.EnvType;
import net.fabricmc.api.Environment;
import net.minecraft.class_3532;

@Environment(EnvType.CLIENT)
final class bbbbba {
   private float aa;
   private float b;
   private float ab = 2.7F;
   private float ba;
   private float bb;
   private float a;
   private SplittableRandom aaa;
   private float aab = 4.5F;
   private float aba;

   float[] b(float var1, float var2, float var3) {
      return this.aa(var1, var2, var3, 0.65F);
   }

   float[] aa(float var1, float var2, float var3, float var4) {
      int var10000 = baaabbaa.bba;
      float var6 = Math.max(0.0F, Math.min(var1, 0.1F));
      int var5 = var10000;
      this.bb = this.bb + var6 * this.ab;

      float var10001;
      float var10002;
      while (true) {
         if (this.bb >= 1.0F) {
            try {
               this.bb--;
               this.aa = this.aba;
               var19 = this;
               var10001 = this.aaa.nextFloat();
               var10002 = 2.0F;
               if (var5 != 0) {
                  break;
               }

               this.aba = var10001 * 2.0F - 1.0F;
               if (var5 == 0) {
                  continue;
               }
            } catch (MatchException var18) {
               throw var18;
            }
         }

         var19 = this;
         var10001 = this.ba;
         var10002 = var6 * this.aab;
         break;
      }

      var19.ba = var10001 + var10002;

      while (true) {
         if (this.ba >= 1.0F) {
            try {
               this.ba--;
               var20 = this;
               if (var5 != 0) {
                  break;
               }

               this.a = this.b;
               this.b = this.aaa.nextFloat() * 2.0F - 1.0F;
               if (var5 == 0) {
                  continue;
               }
            } catch (MatchException var17) {
               throw var17;
            }
         }

         var20 = this;
         break;
      }

      float var7 = var20.bb;
      float var8 = var7 * var7 * (3.0F - 2.0F * var7);
      float var9 = class_3532.method_16439(var8, this.aa, this.aba);
      float var10 = this.ba;
      float var11 = var10 * var10 * (3.0F - 2.0F * var10);
      float var12 = class_3532.method_16439(var11, this.a, this.b);
      float var13 = class_3532.method_15363(var2 / 120.0F, 0.0F, 1.0F);
      float var14 = 0.6F + 0.4F * var13 * var13;
      float var15 = var3 * 1.35F * var14;
      float var16 = var3 * 1.1F * class_3532.method_15363(var4, 0.35F, 1.0F) * var14;
      return new float[]{var9 * var15, var12 * var16};
   }

   bbbbba() {
      this.aaa = new SplittableRandom();
      this.ba(System.nanoTime());
   }

   void ab() {
      this.ba(System.nanoTime());
   }

   void ba(long var1) {
      SplittableRandom var3 = new SplittableRandom(var1);
      this.aaa = var3;
      this.bb = var3.nextFloat();
      this.aa = var3.nextFloat() * 2.0F - 1.0F;
      this.aba = var3.nextFloat() * 2.0F - 1.0F;
      this.ba = var3.nextFloat();
      this.a = var3.nextFloat() * 2.0F - 1.0F;
      this.b = var3.nextFloat() * 2.0F - 1.0F;
      this.ab = 4.6F + var3.nextFloat() * 3.4F;
      this.aab = 5.4F + var3.nextFloat() * 4.2F;
   }
}
