package nsc.mixin;

import net.fabricmc.api.EnvType;
import net.fabricmc.api.Environment;
import net.minecraft.class_638;
import net.minecraft.class_7202;
import org.spongepowered.asm.mixin.Mixin;
import org.spongepowered.asm.mixin.gen.Accessor;

@Environment(EnvType.CLIENT)
@Mixin({class_638.class})
public interface bbaabb {
   @Accessor("field_37951")
   class_7202 yj$pendingUpdateManager();
}
