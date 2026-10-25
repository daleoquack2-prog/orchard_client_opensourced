package nsc;

import net.fabricmc.api.EnvType;
import net.fabricmc.api.Environment;
import net.minecraft.class_4081;

// $VF: synthetic class
@Environment(EnvType.CLIENT)
class aabbbbaab {
   static final int[] b = new int[class_4081.values().length];

   static {
      try {
         b[class_4081.field_18271.ordinal()] = 1;
      } catch (NoSuchFieldError var3) {
      }

      try {
         b[class_4081.field_18273.ordinal()] = 2;
      } catch (NoSuchFieldError var2) {
      }

      try {
         b[class_4081.field_18272.ordinal()] = 3;
      } catch (NoSuchFieldError var1) {
      }
   }
}
