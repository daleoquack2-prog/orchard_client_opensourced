package nsc.mixin;

import net.fabricmc.api.EnvType;
import net.fabricmc.api.Environment;
import net.minecraft.class_1661;
import org.spongepowered.asm.mixin.Mixin;
import org.spongepowered.asm.mixin.gen.Accessor;

@Environment(EnvType.CLIENT)
@Mixin({class_1661.class})
public interface aababbba {
   @Accessor("field_7545")
   void wq_setSlot(int var1);

   @Accessor("field_7545")
   int wq_getSelectedSlot();

   @Accessor("field_7545")
   int wq$getSelectedSlot();

   @Accessor("field_7545")
   void wq$setSlot(int var1);
}
