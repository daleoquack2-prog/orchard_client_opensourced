package nsc;

import net.fabricmc.api.EnvType;
import net.fabricmc.api.Environment;
import net.minecraft.class_2350;

// $VF: synthetic class
@Environment(EnvType.CLIENT)
class bbaaaab {
   static final int[] b = new int[class_2350.values().length];

   static {
      long var2 = 4379768503224826627L;
      long var10002 = -3920778077203268859L ^ var2;
      byte var10001 = -1;
      long var0 = var10002;

      try {
         b[class_2350.field_11036.ordinal()] = 1;
      } catch (NoSuchFieldError var10) {
      }

      try {
         b[class_2350.field_11033.ordinal()] = 2;
      } catch (NoSuchFieldError var9) {
      }

      try {
         b[class_2350.field_11043.ordinal()] = 3;
      } catch (NoSuchFieldError var8) {
      }

      try {
         b[class_2350.field_11035.ordinal()] = 4;
      } catch (NoSuchFieldError var7) {
      }

      try {
         b[class_2350.field_11039.ordinal()] = 5;
      } catch (NoSuchFieldError var6) {
      }

      try {
         b[class_2350.field_11034.ordinal()] = (int)var0;
      } catch (NoSuchFieldError var5) {
      }
   }
}
