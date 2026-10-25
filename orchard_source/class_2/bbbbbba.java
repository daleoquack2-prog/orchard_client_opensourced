package nsc;

import net.fabricmc.api.EnvType;
import net.fabricmc.api.Environment;
import net.minecraft.class_1267;

// $VF: synthetic class
@Environment(EnvType.CLIENT)
class bbbbbba {
   static final int[] b = new int[class_1267.values().length];

   static {
      try {
         b[class_1267.field_5801.ordinal()] = 1;
      } catch (NoSuchFieldError var4) {
      }

      try {
         b[class_1267.field_5805.ordinal()] = 2;
      } catch (NoSuchFieldError var3) {
      }

      try {
         b[class_1267.field_5802.ordinal()] = 3;
      } catch (NoSuchFieldError var2) {
      }

      try {
         b[class_1267.field_5807.ordinal()] = 4;
      } catch (NoSuchFieldError var1) {
      }
   }
}
