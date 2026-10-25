package nsc;

import net.fabricmc.api.EnvType;
import net.fabricmc.api.Environment;
import net.minecraft.class_3675.class_307;

// $VF: synthetic class
@Environment(EnvType.CLIENT)
class aaaaaba {
   static final int[] aa = new int[bbbabbab.values().length];
   static final int[] b;

   static {
      try {
         aa[bbbabbab.abb.ordinal()] = 1;
      } catch (NoSuchFieldError var6) {
      }

      try {
         aa[bbbabbab.aa.ordinal()] = 2;
      } catch (NoSuchFieldError var5) {
      }

      try {
         aa[bbbabbab.b.ordinal()] = 3;
      } catch (NoSuchFieldError var4) {
      }

      b = new int[class_307.values().length];

      try {
         b[class_307.field_1672.ordinal()] = 1;
      } catch (NoSuchFieldError var3) {
      }

      try {
         b[class_307.field_1668.ordinal()] = 2;
      } catch (NoSuchFieldError var2) {
      }

      try {
         b[class_307.field_1671.ordinal()] = 3;
      } catch (NoSuchFieldError var1) {
      }
   }
}
