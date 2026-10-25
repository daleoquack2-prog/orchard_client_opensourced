package nsc.mixin;

import net.fabricmc.api.EnvType;
import net.fabricmc.api.Environment;
import net.minecraft.class_1309;
import net.minecraft.class_239;
import net.minecraft.class_304;
import net.minecraft.class_310;
import net.minecraft.class_3966;
import org.spongepowered.asm.mixin.Mixin;
import org.spongepowered.asm.mixin.Unique;
import org.spongepowered.asm.mixin.injection.At;
import org.spongepowered.asm.mixin.injection.Inject;
import org.spongepowered.asm.mixin.injection.callback.CallbackInfo;
import org.spongepowered.asm.mixin.injection.callback.CallbackInfoReturnable;
import nsc.aabaaa;
import nsc.aabbabbbb;
import nsc.abaaaaaba;
import nsc.abaabbbba;
import nsc.ababaabab;
import nsc.abbabaa;
import nsc.abbbbaa;
import nsc.baaabbb;
import nsc.bbaabaab;
import nsc.bbaba;
import nsc.bbabbbb;
import nsc.bbbbbbaa;

@Environment(EnvType.CLIENT)
@Mixin({class_310.class})
public abstract class aabbbb {
   @Unique
   private class_239 a;
   @Unique
   private boolean b;

   @Inject(
      method = {"method_1490"},
      at = {@At("HEAD")}
   )
   private void a(CallbackInfo var1) {
      if (!abbabaa.aa()) {
         abaaaaaba var2 = abaaaaaba.aaaaa();
         if (var2 != null) {
            var2.ab();
         }
      }
   }

   @Inject(
      method = {"method_1583"},
      at = {@At("RETURN")}
   )
   private void b(CallbackInfo var1) {
      if (!abbabaa.aa()) {
         abaaaaaba var2 = abaaaaaba.aaaaa();
         if (var2 != null && var2.aaba() != null) {
            bbaba var3 = (bbaba)var2.aaba()
               .aababab(bbaba.class);
            if (var3 != null) {
               var3.aa(class_310.method_1551());
            }
         }
      }
   }

   @Unique
   private class_3966 aa(class_310 var1, abaaaaaba var2) {
      if (var1 != null && var1.field_1724 != null && var1.field_1687 != null && var2 != null && var2.aaba() != null) {
         if (var1.field_1765 instanceof class_3966 var3 && var3.method_17782() instanceof class_1309) {
            return null;
         } else {
            class_3966 var6 = aabbabbbb.bbbaba(var1, 3.0);
            return var6 != null && var6.method_17782() instanceof class_1309 var7 && !abaabbbba.aa(var7) ? var6 : null;
         }
      } else {
         return null;
      }
   }

   @Inject(
      method = {"method_1583"},
      at = {@At("HEAD")},
      cancellable = true
   )
   private void ab(CallbackInfo var1) {
      if (!abbabaa.aa()) {
         class_310 var2 = class_310.method_1551();
         if (aabbabbbb.bbabbaa()
            || !bbbbbbaa.aabb(var2)
               && !aabbabbbb.aaaaaba()
               && !bbabbbb.babbb()) {
            if (aabbabbbb.ababbaa(var2)) {
               var1.cancel();
            }
         } else {
            var1.cancel();
         }
      }
   }

   @Inject(
      method = {"method_1536"},
      at = {@At("HEAD")},
      cancellable = true
   )
   private void ba(CallbackInfoReturnable var1) {
      if (!abbabaa.aa()) {
         class_310 var2 = class_310.method_1551();
         if (var2 != null) {
            this.aaa(var2);
            abaaaaaba var3 = abaaaaaba.aaaaa();
            if (aabbabbbb.aabaaa()
               || aabbabbbb.bbabbaa()
               || !bbbbbbaa.aabb(var2)
                  && !aabbabbbb.aaaaaba()
                  && !bbabbbb.babbb()) {
               if (!aabbabbbb.aabaaa() && aabbabbbb.ababbaa(var2)) {
                  var1.setReturnValue(false);
               } else if (var3 != null && var3.aaba() != null) {
                  class_3966 var4 = this.aa(var2, var3);
                  if (var4 != null) {
                     this.a = var2.field_1765;
                     this.b = true;
                     var2.field_1765 = var4;
                  }

                  if (var2.field_1765 instanceof class_3966 var5 && aabbabbbb.bbaabb(var2, var5.method_17782())) {
                     aabbabbbb.aabaabb(var2);
                     var1.setReturnValue(false);
                  } else {
                     if (!aabbabbbb.aabaaa()) {
                        abbbbaa var7 = var3.aaba().aabbaa();
                        if (var7 != null && var7.aa(var2)) {
                           var1.setReturnValue(false);
                           return;
                        }

                        ababaabab var8 = var3.aaba().baabba();
                        if (var8 != null && var8.aba(var2)) {
                           var1.setReturnValue(false);
                           return;
                        }
                     }
                  }
               }
            } else {
               var1.setReturnValue(false);
            }
         }
      }
   }

   @Inject(
      method = {"method_1574"},
      at = {@At("HEAD")},
      order = 900
   )
   private void bb(CallbackInfo var1) {
      if (!abbabaa.aa()) {
         aabaaa.aaabaa();
      }
   }

   @Unique
   private void aaa(class_310 var1) {
      if (this.b) {
         if (var1 != null) {
            var1.field_1765 = this.a;
         }

         this.a = null;
         this.b = false;
      }
   }

   @Inject(
      method = {"method_1508"},
      at = {@At("TAIL")}
   )
   private void aab(CallbackInfo var1) {
      if (!abbabaa.aa()) {
         abaaaaaba var2 = abaaaaaba.aaaaa();
         if (var2 != null) {
            var2.aaba().abaaaba(class_310.method_1551());
         }
      }
   }

   @Inject(
      method = {"method_1536"},
      at = {@At("RETURN")}
   )
   private void aba(CallbackInfoReturnable var1) {
      class_310 var2 = class_310.method_1551();
      this.aaa(var2);
   }

   @Inject(
      method = {"method_1508"},
      at = {@At("HEAD")}
   )
   private void abb(CallbackInfo var1) {
      if (!abbabaa.aa()) {
         abaaaaaba var2 = abaaaaaba.aaaaa();
         if (var2 != null) {
            class_310 var3 = class_310.method_1551();
            baaabbb var4 = var2.aaba().bbbbb();
            if (var4 != null) {
               var4.babb(var3);
            }

            if (var2.aaba().aaaaaba() != null && var2.aaba().aaaaaba().babbaab() && var3 != null && var3.field_1690 != null) {
               class_304 var5 = var3.field_1690.field_1824;
               if (var5 != null) {
                  aabbabbbb.bababaa(var5);
                  var5.method_23481(false);
               }
            }

            if (var3 != null && var3.field_1690 != null) {
               aabbabbbb.baaaaa(var3);
               bbaabaab var6 = var2.aaba().aababba();
               if (var6 != null) {
                  var6.ababab(var3);
               }

               if (aabbabbbb.ababa(var3)) {
                  if (var6 != null) {
                     var6.aabbaba(var3);
                     var6.babbb(var3);
                  }

                  bbabbbb.bbaabb(var3);
               }

               if (!aabbabbbb.bbabbaa()
                  && (
                     bbbbbbaa.aabb(var3)
                        || aabbabbbb.aaaaaba()
                        || bbabbbb.babbb()
                  )) {
                  if (var3.field_1690.field_1886 != null) {
                     aabbabbbb.bababaa(var3.field_1690.field_1886);
                     var3.field_1690.field_1886.method_23481(false);
                  }

                  if (var3.field_1690.field_1904 != null) {
                     aabbabbbb.bababaa(var3.field_1690.field_1904);
                     var3.field_1690.field_1904.method_23481(false);
                  }
               }
            }

            if (var2.aaba() != null) {
               var2.aaba().abaabab(var3);
               var2.aaba().baa(var3);
            }

            var2.aaba().bababb(class_310.method_1551());
            if (var4 != null) {
               var4.babb(var3);
            }

            if (var3 != null && var3.field_1690 != null) {
               if (aabbabbbb.ababa(var3)) {
                  bbabbbb.bbaabb(var3);
               }

               if (aabbabbbb.ababbaa(var3)) {
                  if (var3.field_1690.field_1886 != null) {
                     aabbabbbb.bababaa(var3.field_1690.field_1886);
                     var3.field_1690.field_1886.method_23481(false);
                  }

                  if (var3.field_1690.field_1904 != null) {
                     aabbabbbb.bababaa(var3.field_1690.field_1904);
                     var3.field_1690.field_1904.method_23481(false);
                  }
               } else if (var3.field_1755 == null
                  && !bbbbbbaa.aabb(var3)
                  && !aabbabbbb.aaaaaba()
                  && !bbabbbb.babbb()) {
                  if (var3.field_1690.field_1886 != null
                     && !var3.field_1690.field_1886.method_1434()
                     && aabbabbbb.aaab(var3, var3.field_1690.field_1886)) {
                     var3.field_1690.field_1886.method_23481(true);
                  }

                  if (var3.field_1690.field_1904 != null
                     && !var3.field_1690.field_1904.method_1434()
                     && aabbabbbb.aaab(var3, var3.field_1690.field_1904)) {
                     var3.field_1690.field_1904.method_23481(true);
                  }
               }
            }
         }
      }
   }
}
