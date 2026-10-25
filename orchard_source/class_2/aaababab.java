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
record aaababab(
   Matrix3x2fc a,
   float b,
   float c,
   float d,
   float e,
   float f,
   float g,
   float h,
   float i,
   int j,
   float aZ,
   float a0,
   class_11231 k,
   @Nullable class_8030 l,
   @Nullable class_8030 m
) implements class_11244 {
   private final class_11231 aa;
   private final float ab;
   private final float ba;
   private final float bb;
   private final float aaa;
   private final float aab;
   private final int aba;
   private final float abb;
   private final float baa;
   private final float bab;
   private final Matrix3x2fc bba;
   private final float a;
   @Nullable
   private final class_8030 bbb;
   @Nullable
   private final class_8030 aaaa;

   @Nullable
   public class_8030 comp_4274() {
      return this.bbb;
   }

   public float aa() {
      return this.a;
   }

   public int ab() {
      return this.aba;
   }

   public float ba() {
      return this.abb;
   }

   public float bb() {
      return this.baa;
   }

   public float aaa() {
      return this.bab;
   }

   public float aab() {
      return this.ba;
   }

   public float aba() {
      return this.aaa;
   }

   public class_11231 comp_4056() {
      return this.aa;
   }

   public void method_70917(class_4588 var1) {
      aaababbb.ababa(
         var1, this.bba, this.abb, this.a, this.baa, this.ba, this.ab, this.bab, this.b, this.aab, this.aba, this.bb, this.aaa
      );
   }

   public Matrix3x2fc abb() {
      return this.bba;
   }

   public class_11231 a() {
      return this.aa;
   }

   public float baa() {
      return this.aab;
   }

   private aaababab(
      Matrix3x2fc a,
      float b,
      float c,
      float d,
      float e,
      float f,
      float g,
      float h,
      float i,
      int j,
      float aZ,
      float a0,
      class_11231 k,
      @Nullable class_8030 l,
      @Nullable class_8030 m
   ) {
      this.bba = a;
      this.abb = b;
      this.a = c;
      this.baa = d;
      this.ba = e;
      this.ab = f;
      this.bab = g;
      this.b = h;
      this.aab = i;
      this.aba = j;
      this.bb = aZ;
      this.aaa = a0;
      this.aa = k;
      this.aaaa = l;
      this.bbb = m;
   }

   public RenderPipeline comp_4055() {
      return aaababbb.aaab;
   }

   public float bab() {
      return this.bb;
   }

   public float bba() {
      return this.ab;
   }

   private aaababab(
      Matrix3x2fc var1,
      float var2,
      float var3,
      float var4,
      float var5,
      float var6,
      float var7,
      float var8,
      float var9,
      int var10,
      float var11,
      class_11231 var12,
      @Nullable class_8030 var13
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
         var10,
         var11,
         0.0F,
         var12,
         var13,
         aaababbb.abbab(var2, var3, var4, var5, var1, var13)
      );
   }

   private aaababab(
      Matrix3x2fc var1,
      float var2,
      float var3,
      float var4,
      float var5,
      float var6,
      float var7,
      float var8,
      float var9,
      int var10,
      float var11,
      float var12,
      class_11231 var13,
      @Nullable class_8030 var14
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
         var10,
         var11,
         var12,
         var13,
         var14,
         aaababbb.abbab(var2, var3, var4, var5, var1, var14)
      );
   }

   @Nullable
   public class_8030 comp_4069() {
      return this.aaaa;
   }
}
