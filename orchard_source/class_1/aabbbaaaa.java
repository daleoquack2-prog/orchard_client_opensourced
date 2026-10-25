package nsc.mixin;

import net.fabricmc.api.EnvType;
import net.fabricmc.api.Environment;
import net.minecraft.class_1268;
import net.minecraft.class_1269;
import net.minecraft.class_1297;
import net.minecraft.class_1657;
import net.minecraft.class_2338;
import net.minecraft.class_2350;
import net.minecraft.class_310;
import net.minecraft.class_3965;
import net.minecraft.class_636;
import net.minecraft.class_746;
import org.spongepowered.asm.mixin.Mixin;
import org.spongepowered.asm.mixin.Unique;
import org.spongepowered.asm.mixin.injection.At;
import org.spongepowered.asm.mixin.injection.Inject;
import org.spongepowered.asm.mixin.injection.callback.CallbackInfo;
import org.spongepowered.asm.mixin.injection.callback.CallbackInfoReturnable;
import nsc.aaaaaaaba;
import nsc.aaaaaabbb;
import nsc.aaabbbbb;
import nsc.aabaaabbb;
import nsc.aababbbaa;
import nsc.aabbabbbb;
import nsc.aabbbbabb;
import nsc.abaaaaaba;
import nsc.ababba;
import nsc.abbbbaaab;
import nsc.baaaabab;

@Environment(EnvType.CLIENT)
@Mixin({class_636.class})
public abstract class aabbbaaaa {
   @Unique
   private int a;

   @Inject(
      method = {"method_2919"},
      at = {@At("RETURN")}
   )
   private void a(class_1657 var1, class_1268 var2, CallbackInfoReturnable var3) {
      this.b();
      abaaaaaba var4 = abaaaaaba.aaaaa();
      if (var4 != null) {
         baaaabab var5 = var4.aaba().aabbaaa();
         if (var5 != null) {
            var5.bba(class_310.method_1551(), var2, (class_1269)var3.getReturnValue());
         }
      }
   }

   @Unique
   private void b() {
      if (this.a > 0) {
         this.a--;
         aabbabbbb.baaaa();
      }
   }

   @Inject(
      method = {"method_2919"},
      at = {@At("HEAD")},
      cancellable = true
   )
   private void aa(class_1657 var1, class_1268 var2, CallbackInfoReturnable var3) {
      if (aabbabbbb.bbbbaa()) {
         this.a++;
      }

      abaaaaaba var4 = abaaaaaba.aaaaa();
      if (var4 != null) {
         abbbbaaab var5 = var4.aaba().bbbaaa();
         if (var5 != null && var5.bb(class_310.method_1551())) {
            this.b();
            var3.setReturnValue(class_1269.field_5814);
         }
      }
   }

   @Inject(
      method = {"method_2918"},
      at = {@At("HEAD")}
   )
   private void ab(class_1657 var1, class_1297 var2, CallbackInfo var3) {
      if (aabbabbbb.bbbbaa()) {
         this.a++;
      }
   }

   @Inject(
      method = {"method_2910"},
      at = {@At("HEAD")},
      cancellable = true
   )
   private void ba(class_2338 var1, class_2350 var2, CallbackInfoReturnable var3) {
      abaaaaaba var4 = abaaaaaba.aaaaa();
      if (var4 != null) {
         ababba var5 = (ababba)var4.aaba()
            .aababab(ababba.class);
         boolean var6 = var5 != null && var5.abb(class_310.method_1551(), var1, var2);
         abbbbaaab var7 = var4.aaba().bbbaaa();
         if (var7 != null && var7.bb(class_310.method_1551())) {
            var3.setReturnValue(false);
         } else if (var6) {
            var3.setReturnValue(false);
         } else {
            aaaaaaaba var8 = var4.aaba().aabab();
            if (var8 != null) {
               if (var8.ba(var1, var2)) {
                  var3.setReturnValue(true);
               }
            }
         }
      }
   }

   @Inject(
      method = {"method_2918"},
      at = {@At("RETURN")}
   )
   private void bb(class_1657 var1, class_1297 var2, CallbackInfo var3) {
      this.b();
   }

   @Inject(
      method = {"method_2896"},
      at = {@At("HEAD")},
      cancellable = true
   )
   private void aaa(class_746 var1, class_1268 var2, class_3965 var3, CallbackInfoReturnable var4) {
      if (aabbabbbb.bbbbaa()) {
         this.a++;
      }

      abaaaaaba var5 = abaaaaaba.aaaaa();
      if (var5 != null) {
         abbbbaaab var6 = var5.aaba().bbbaaa();
         if (var6 != null && var6.bb(class_310.method_1551())) {
            this.b();
            var4.setReturnValue(class_1269.field_5814);
         } else {
            aaabbbbb var7 = (aaabbbbb)var5.aaba()
               .aababab(aaabbbbb.class);
            if (var7 != null && var7.aa(class_310.method_1551(), var3)) {
               this.b();
               var4.setReturnValue(class_1269.field_5814);
            } else {
               aabaaabbb var8 = var5.aaba().ba();
               if (var8 != null) {
                  var8.aaaab(class_310.method_1551(), var2, var3);
               }

               aababbbaa var9 = var5.aaba().abb();
               if (var9 != null) {
                  var9.ab(class_310.method_1551(), var2, var3);
               }

               aabbbbabb var10 = var5.aaba().abaaa();
               if (var10 != null) {
                  var10.aaaaaaab(class_310.method_1551(), var2, var3);
               }

               aaaaaabbb var11 = var5.aaba().abbba();
               if (var11 != null && !var11.bab()) {
                  var11.ba(class_310.method_1551(), var2, var3);
               }

               baaaabab var12 = var5.aaba().aabbaaa();
               if (var12 != null) {
                  var12.aaaa(class_310.method_1551(), var2, var3);
               }

               aaaaaaaba var13 = var5.aaba().aabab();
               if (var13 != null && var13.babbaab()) {
                  if (var13.abbaa(class_310.method_1551())) {
                     this.b();
                     var4.setReturnValue(class_1269.field_5814);
                  }
               }
            }
         }
      }
   }

   @Inject(
      method = {"method_2896"},
      at = {@At("RETURN")}
   )
   private void aab(class_746 var1, class_1268 var2, class_3965 var3, CallbackInfoReturnable var4) {
      this.b();
      abaaaaaba var5 = abaaaaaba.aaaaa();
      if (var5 != null) {
         aababbbaa var6 = var5.aaba().abb();
         if (var6 != null) {
            var6.bbbbba(class_310.method_1551(), var2, var3, (class_1269)var4.getReturnValue());
         }

         aabaaabbb var7 = var5.aaba().ba();
         if (var7 != null) {
            var7.aaabb(class_310.method_1551(), var2, var3, (class_1269)var4.getReturnValue());
         }

         baaaabab var8 = var5.aaba().aabbaaa();
         if (var8 != null) {
            var8.bab(class_310.method_1551(), var2, var3, (class_1269)var4.getReturnValue());
         }

         aabbbbabb var9 = var5.aaba().abaaa();
         if (var9 != null) {
            var9.aababab(class_310.method_1551(), var2, var3, (class_1269)var4.getReturnValue());
         }

         aaaaaabbb var10 = var5.aaba().abbba();
         if (var10 != null) {
            var10.bbb(class_310.method_1551(), var2, var3, (class_1269)var4.getReturnValue());
         }
      }
   }

   @Inject(
      method = {"method_2911"},
      at = {@At("HEAD")},
      cancellable = true
   )
   private void aba(CallbackInfo var1) {
      if (aabbabbbb.babba()) {
         var1.cancel();
      }
   }
}
