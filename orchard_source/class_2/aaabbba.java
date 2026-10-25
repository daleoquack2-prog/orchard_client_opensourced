package nsc;

import com.mojang.blaze3d.pipeline.RenderPipeline;
import net.fabricmc.api.EnvType;
import net.fabricmc.api.Environment;
import net.minecraft.class_11231;
import net.minecraft.class_11244;
import net.minecraft.class_4588;
import net.minecraft.class_8030;
import org.joml.Matrix3x2fc;
import org.jspecify.annotations.Nullable;

@Environment(EnvType.CLIENT)
record aaabbba(
   Matrix3x2fc a, float b, float c, float d, float e, float f, float g, int h, @Nullable class_8030 i, @Nullable class_8030 j
) implements class_11244 {
   private final float aa;
   @Nullable
   private final class_8030 ab;
   private final float ba;
   private final float bb;
   private final int aaa;
   private final float aab;
   @Nullable
   private final class_8030 aba;
   private final float abb;
   private final Matrix3x2fc b;
   private final float a;

   public float aa() {
      return this.aab;
   }

   private aaabbba(
      Matrix3x2fc var1, float var2, float var3, float var4, float var5, float var6, float var7, int var8, @Nullable class_8030 var9
   ) {
      this(
         var1,
         var2,
         var3,
         var4,
         var5,
         var6,
         var7,
         var8,
         var9,
         aaababbb.abbab(var2 - var4, var3 - var4, var4 * 2.0F, var4 * 2.0F, var1, var9)
      );
   }

   private aaabbba(
      Matrix3x2fc a, float b, float c, float d, float e, float f, float g, int h, @Nullable class_8030 i, @Nullable class_8030 j
   ) {
      this.b = a;
      this.abb = b;
      this.aab = c;
      this.aa = d;
      this.bb = e;
      this.a = f;
      this.ba = g;
      this.aaa = h;
      this.ab = i;
      this.aba = j;
   }

   @Nullable
   public class_8030 comp_4274() {
      return this.aba;
   }

   @Nullable
   public class_8030 comp_4069() {
      return this.ab;
   }

   public float ab() {
      return this.a;
   }

   public Matrix3x2fc bb() {
      return this.b;
   }

   public int a() {
      return this.aaa;
   }

   public float aaa() {
      return this.aa;
   }

   public float aab() {
      return this.bb;
   }

   public float aba() {
      return this.abb;
   }

   public class_11231 comp_4056() {
      return aaababbb.ab;
   }

   public RenderPipeline comp_4055() {
      return aaababbb.bab;
   }

   public void method_70917(class_4588 var1) {
      float var2 = this.aa * 2.0F;
      aaababbb.aba(var1, this.b, this.abb - this.aa, this.aab - this.aa, var2, var2, this.bb, this.a, this.ba, this.aaa);
   }
}
