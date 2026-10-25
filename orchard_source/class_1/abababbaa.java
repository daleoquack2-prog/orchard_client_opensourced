package nsc.mixin;

import net.fabricmc.api.EnvType;
import net.fabricmc.api.Environment;
import net.minecraft.class_1309;
import org.spongepowered.asm.mixin.Mixin;
import org.spongepowered.asm.mixin.gen.Accessor;

@Environment(EnvType.CLIENT)
@Mixin({class_1309.class})
public interface abababbaa {
   @Accessor("field_6228")
   void wq$setJumpingCooldown(int var1);

   @Accessor("field_6228")
   void yj$setJumpingCooldown(int var1);
}
