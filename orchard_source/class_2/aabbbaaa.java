package nsc;

import com.mojang.blaze3d.systems.RenderSystem;
import com.mojang.blaze3d.textures.FilterMode;
import java.util.function.Supplier;
import net.fabricmc.api.EnvType;
import net.fabricmc.api.Environment;
import net.minecraft.class_1011;
import net.minecraft.class_1043;

@Environment(EnvType.CLIENT)
final class aabbbaaa extends class_1043 {
   private aabbbaaa(Supplier var1, class_1011 var2) {
      super(var1, var2);
      if (RenderSystem.getSamplerCache() != null) {
         this.field_63613 = RenderSystem.getSamplerCache().method_75294(FilterMode.LINEAR);
      }
   }
}
