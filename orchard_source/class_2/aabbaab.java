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
record aabbaab(
   Matrix3x2fc a, float b, float c, float d, float e, int f, boolean g, @Nullable class_8030 h, @Nullable class_8030 i
) implements class_11244 {
   private final float aa;
   @Nullable
   private final class_8030 ab;
   private final int ba;
   private final float bb;
   @Nullable
   private final class_8030 b;
   private final Matrix3x2fc aaa;
   private final float a;
   private final float aab;
   private final boolean aba;

   public RenderPipeline comp_4055() {
      return aaababbb.bb;
   }

   private aabbaab(
      Matrix3x2fc a, float b, float c, float d, float e, int f, boolean g, @Nullable class_8030 h, @Nullable class_8030 i
   ) {
      this.aaa = a;
      this.bb = b;
      this.aab = c;
      this.aa = d;
      this.a = e;
      this.ba = f;
      this.aba = g;
      this.ab = h;
      this.b = i;
   }

   @Nullable
   public class_8030 comp_4274() {
      return this.b;
   }

   public void method_70917(class_4588 var1) {
      try {
         if (this.aba) {
            aaababbb.aa(var1, this.aaa, this.bb, this.aab, this.aa, this.a, this.ba);
            return;
         }
      } catch (MatchException var2) {
         throw var2;
      }

      aaababbb.aaaaaa(var1, this.aaa, this.bb, this.aab, this.aa, this.ba);
   }

   private aabbaab(
      Matrix3x2fc var1, float var2, float var3, float var4, float var5, int var6, boolean var7, @Nullable class_8030 var8, float var9
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
         aaababbb.abbab(var2 - var9, var3 - var9, var9 * 2.0F, var9 * 2.0F, var1, var8)
      );
   }

   @Nullable
   public class_8030 comp_4069() {
      return this.ab;
   }

   public float aa() {
      return this.a;
   }

   public class_11231 comp_4056() {
      return aaababbb.ab;
   }

   public int ab() {
      return this.ba;
   }

   public float ba() {
      return this.aa;
   }

   public float bb() {
      return this.aab;
   }

   public float aaa() {
      return this.bb;
   }

   public boolean b() {
      return this.aba;
   }

   public Matrix3x2fc aab() {
      return this.aaa;
   }
}
