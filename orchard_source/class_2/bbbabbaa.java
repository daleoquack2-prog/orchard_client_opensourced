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
record bbbabbaa(
   class_11231 aP, Matrix3x2fc aQ, float aR, float aS, float aT, float aU, float aV, int aW, @Nullable class_8030 a, @Nullable class_8030 b
) implements class_11244 {
   private final float aa;
   private final float ab;
   private final int ba;
   private final Matrix3x2fc bb;
   private final float aaa;
   @Nullable
   private final class_8030 aab;
   private final float a;
   private final class_11231 aba;
   @Nullable
   private final class_8030 abb;
   private final float b;

   public float a() {
      return this.ab;
   }

   private bbbabbaa(
      class_11231 aP, Matrix3x2fc aQ, float aR, float aS, float aT, float aU, float aV, int aW, @Nullable class_8030 a, @Nullable class_8030 b
   ) {
      this.aba = aP;
      this.bb = aQ;
      this.aa = aR;
      this.ab = aS;
      this.aaa = aT;
      this.b = aU;
      this.a = aV;
      this.ba = aW;
      this.aab = a;
      this.abb = b;
   }

   public float b() {
      return this.aaa;
   }

   public RenderPipeline comp_4055() {
      return aaababbb.aabba;
   }

   private bbbabbaa(
      class_11231 var1, Matrix3x2fc var2, float var3, float var4, float var5, float var6, float var7, int var8, @Nullable class_8030 var9
   ) {
      this(var1, var2, var3, var4, var5, var6, var7, var8, var9, aaababbb.abbab(var3, var4, var5, var6, var2, var9));
   }

   public class_11231 ab() {
      return this.aba;
   }

   public class_11231 comp_4056() {
      return this.aba;
   }

   @Nullable
   public class_8030 comp_4274() {
      return this.abb;
   }

   public float ba() {
      return this.a;
   }

   @Nullable
   public class_8030 comp_4069() {
      return this.aab;
   }

   public void method_70917(class_4588 var1) {
      aaababbb.abb(var1, this.bb, this.aa, this.ab, this.aaa, this.b, this.a, this.ba);
   }

   public int bb() {
      return this.ba;
   }

   public float aaa() {
      return this.b;
   }

   public Matrix3x2fc aab() {
      return this.bb;
   }
}
