package nsc.mixin;

import net.fabricmc.api.EnvType;
import net.fabricmc.api.Environment;
import net.minecraft.class_11910;
import net.minecraft.class_312;
import org.spongepowered.asm.mixin.Mixin;
import org.spongepowered.asm.mixin.gen.Invoker;

@Environment(EnvType.CLIENT)
@Mixin({class_312.class})
public interface bababbaa {
   @Invoker("method_1601")
   void wq$onMouseButton(long var1, class_11910 var3, int var4);
}
