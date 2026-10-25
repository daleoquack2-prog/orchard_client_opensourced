package nsc.mixin;

import net.fabricmc.api.EnvType;
import net.fabricmc.api.Environment;
import net.minecraft.class_304;
import net.minecraft.class_3675.class_306;
import org.spongepowered.asm.mixin.Mixin;
import org.spongepowered.asm.mixin.gen.Accessor;

@Environment(EnvType.CLIENT)
@Mixin({class_304.class})
public interface abbaababb {
   @Accessor("field_1661")
   void yj$setTimesPressed(int var1);

   @Accessor("field_1655")
   class_306 yj$getBoundKey();

   @Accessor("field_1661")
   int yj$getTimesPressed();
}
