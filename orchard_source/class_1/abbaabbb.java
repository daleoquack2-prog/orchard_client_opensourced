package nsc.mixin;

import net.fabricmc.api.EnvType;
import net.fabricmc.api.Environment;
import net.minecraft.class_1309;
import org.spongepowered.asm.mixin.Mixin;
import org.spongepowered.asm.mixin.gen.Accessor;

@Environment(EnvType.CLIENT)
@Mixin({class_1309.class})
public interface abbaabbb {
   @Accessor("field_6252")
   void yj$setHandSwinging(boolean var1);

   @Accessor("field_6279")
   void yj$setHandSwingTicks(int var1);

   @Accessor("field_6279")
   int yj$getHandSwingTicks();

   @Accessor("field_6252")
   boolean yj$isHandSwinging();
}
