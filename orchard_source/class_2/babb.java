package nsc;

import net.fabricmc.api.EnvType;
import net.fabricmc.api.Environment;
import net.minecraft.class_1297;
import net.minecraft.class_243;
import net.minecraft.class_3532;

@Environment(EnvType.CLIENT)
public record babb(float ah, float ai) {
   private final float a;
   private final float b;

   public babb(float ah, float ai) {
      this.a = ah;
      this.b = ai;
   }

   public float aa(babb var1) {
      return (float)Math.hypot(this.b(var1), this.ab(var1));
   }

   public float ab(babb var1) {
      return class_3532.method_15363(var1.b, -90.0F, 90.0F) - this.b;
   }

   public float b(babb var1) {
      return class_3532.method_15393(var1.a - this.a);
   }

   public static babb ba(class_243 var0, class_243 var1) {
      class_243 var2 = var1.method_1020(var0);
      double var3 = Math.hypot(var2.field_1352, var2.field_1350);
      float var5 = (float)Math.toDegrees(Math.atan2(var2.field_1350, var2.field_1352)) - 90.0F;
      float var6 = (float)(-Math.toDegrees(Math.atan2(var2.field_1351, var3)));
      return new babb(var5, var6);
   }

   public float bb() {
      return this.a;
   }

   public static babb aaa(class_1297 var0) {
      return new babb(var0.method_36454(), var0.method_36455());
   }

   public float aab() {
      return this.b;
   }

   public babb aba(float var1, float var2) {
      return new babb(this.a + var1, class_3532.method_15363(this.b + var2, -90.0F, 90.0F));
   }

   public class_243 abb() {
      float var1 = (float)Math.toRadians(this.b);
      float var2 = (float)(-Math.toRadians(this.a));
      float var3 = (float)Math.cos(var1);
      return new class_243(Math.sin(var2) * var3, -Math.sin(var1), Math.cos(var2) * var3);
   }
}
