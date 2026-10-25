package nsc;

import net.fabricmc.api.EnvType;
import net.fabricmc.api.Environment;
import net.minecraft.class_4184;
import net.minecraft.class_757;
import org.joml.Matrix4f;

@Environment(EnvType.CLIENT)
record abaabaabb(class_4184 a, class_757 b, Matrix4f viewMatrix, Matrix4f projectionMatrix) {
   private final class_4184 aa;
   private final Matrix4f a;
   private final Matrix4f ab;
   private final class_757 ba;

   public class_757 aa() {
      return this.ba;
   }

   public Matrix4f b() {
      return this.ab;
   }

   public class_4184 ab() {
      return this.aa;
   }

   private abaabaabb(class_4184 a, class_757 b, Matrix4f viewMatrix, Matrix4f projectionMatrix) {
      this.aa = a;
      this.ba = b;
      this.a = viewMatrix;
      this.ab = projectionMatrix;
   }
}
