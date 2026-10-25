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
record bbababba(
   Matrix3x2fc a, float b, float c, float d, float e, float f, float g, int h, int i, int j, int k, int l, @Nullable class_8030 m, @Nullable class_8030 n
) implements class_11244 {
   @Nullable
   private final class_8030 aa;
   private final int ab;
   private final float ba;
   private final int bb;
   private final int aaa;
   private final Matrix3x2fc aab;
   private final float a;
   private final int aba;
   @Nullable
   private final class_8030 abb;
   private final int baa;
   private final float bab;
   private final float bba;
   private final float bbb;

   public class_11231 comp_4056() {
      return aaababbb.ab;
   }

   public RenderPipeline comp_4055() {
      return aaababbb.bbaa;
   }

   public int aa() {
      return this.aaa;
   }

   public Matrix3x2fc ab() {
      return this.aab;
   }

   @Nullable
   public class_8030 comp_4274() {
      return this.aa;
   }

   private bbababba(
      Matrix3x2fc a, float b, float c, float d, float e, float f, float g, int h, int i, int j, int k, int l, @Nullable class_8030 m, @Nullable class_8030 n
   ) {
      this.aab = a;
      this.bba = b;
      this.ba = c;
      this.b = d;
      this.a = e;
      this.bbb = f;
      this.bab = g;
      this.aaa = h;
      this.baa = i;
      this.bb = j;
      this.ab = k;
      this.aba = l;
      this.abb = m;
      this.aa = n;
   }

   public float ba() {
      return this.bbb;
   }

   public float aaa() {
      return this.bab;
   }

   public void method_70917(class_4588 var1) {
      aaababbb.aabb(
         var1, this.aab, this.bba, this.ba, this.b, this.a, this.bbb, this.bab, this.aaa, this.baa, this.bb, this.ab, this.aba
      );
   }

   public float aab() {
      return this.bba;
   }

   public float b() {
      return this.ba;
   }

   public float abb() {
      return this.b;
   }

   public int baa() {
      return this.ab;
   }

   public int bab() {
      return this.baa;
   }

   private bbababba(
      Matrix3x2fc var1,
      float var2,
      float var3,
      float var4,
      float var5,
      float var6,
      float var7,
      int var8,
      int var9,
      int var10,
      int var11,
      int var12,
      @Nullable class_8030 var13
   ) {
      this(
         var1,
         var2 - 1.25F,
         var3 - 1.25F,
         var4 + 2.5F,
         var5 + 2.5F,
         var6,
         var7,
         var8,
         var9,
         var10,
         var11,
         var12,
         var13,
         aaababbb.abbab(var2 - 1.25F, var3 - 1.25F, var4 + 2.5F, var5 + 2.5F, var1, var13)
      );
   }

   @Nullable
   public class_8030 comp_4069() {
      return this.abb;
   }
}
