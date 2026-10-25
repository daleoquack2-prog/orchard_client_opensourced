package nsc.mixin;

import net.fabricmc.api.EnvType;
import net.fabricmc.api.Environment;
import net.minecraft.class_10185;
import net.minecraft.class_243;
import net.minecraft.class_304;
import net.minecraft.class_310;
import net.minecraft.class_3532;
import net.minecraft.class_744;
import net.minecraft.class_746;
import net.minecraft.class_3675.class_306;
import org.spongepowered.asm.mixin.Mixin;
import org.spongepowered.asm.mixin.Shadow;
import org.spongepowered.asm.mixin.Unique;
import org.spongepowered.asm.mixin.injection.At;
import org.spongepowered.asm.mixin.injection.Inject;
import org.spongepowered.asm.mixin.injection.Redirect;
import org.spongepowered.asm.mixin.injection.At.Shift;
import org.spongepowered.asm.mixin.injection.callback.CallbackInfo;
import org.spongepowered.asm.mixin.injection.callback.CallbackInfoReturnable;
import nsc.aaababaa;
import nsc.aaababaaa;
import nsc.aaababba;
import nsc.aabababb;
import nsc.aababbbba;
import nsc.aabbaabb;
import nsc.aabbababa;
import nsc.aabbabbab;
import nsc.aabbabbbb;
import nsc.aabbbbb;
import nsc.abaaaaaba;
import nsc.ababaaab;
import nsc.abbabaa;
import nsc.abbbbaaab;
import nsc.baaba;
import nsc.baabbaa;
import nsc.bbaaaaa;
import nsc.bbabbaaa;
import nsc.bbabbbb;
import nsc.bbbbbbaa;

@Environment(EnvType.CLIENT)
@Mixin({class_746.class})
public abstract class ababbbaa {
   @Unique
   private boolean aa;
   private static final long[] ab;
   @Unique
   private boolean a;
   @Unique
   private boolean ba;
   @Unique
   private boolean bb;
   @Unique
   private float aaa;
   @Unique
   private boolean aab;
   @Unique
   private boolean aba;
   @Unique
   private float abb;
   @Unique
   private boolean baa;
   @Unique
   private boolean bab;
   @Unique
   private boolean bba;
   @Unique
   private boolean bbb;
   @Unique
   private boolean aaaa;
   @Unique
   private boolean aaab;
   @Unique
   private boolean aaba;
   @Unique
   private boolean aabb;
   @Unique
   private boolean abaa;
   @Unique
   private boolean abab;
   @Unique
   private boolean abba;
   @Shadow
   public class_744 field_3913;
   @Unique
   private boolean abbb;
   private static final Integer[] baaa;
   @Unique
   private boolean b;
   @Unique
   private boolean baab;
   @Unique
   private long baba;
   @Unique
   private int babb;
   @Unique
   private boolean bbaa;
   @Unique
   private boolean bbab;
   @Unique
   private boolean bbba;
   @Unique
   private boolean bbbb;
   @Unique
   private boolean aaaaa;

   @Unique
   private void b(class_310 var1, float var2, float var3) {
      if (var1 != null && var1.field_1690 != null) {
         this.aaa = var2;
         this.abb = var3;
         this.aaba = var2 <= 0.0F;
         aaababaaa.ab = var2;
         aaababaaa.a = var3;
         this.aab = true;
         abaaaaaba var4 = abaaaaaba.aaaaa();
         this.aab(var4, var1, var1.field_1690.field_1894, var2 > 0.0F);
         this.aab(var4, var1, var1.field_1690.field_1881, var2 < 0.0F);
         this.aab(var4, var1, var1.field_1690.field_1913, var3 > 0.0F);
         this.aab(var4, var1, var1.field_1690.field_1849, var3 < 0.0F);
         this.bbba = true;
      }
   }

   @Unique
   private void aa(class_310 var1) {
      if (var1 != null && var1.field_1690 != null) {
         this.abb(var1, var1.field_1690.field_1894);
         this.abb(var1, var1.field_1690.field_1881);
         this.abb(var1, var1.field_1690.field_1913);
         this.abb(var1, var1.field_1690.field_1849);
         this.abb(var1, var1.field_1690.field_1867);
         this.abb(var1, var1.field_1690.field_1832);
         this.abb(var1, var1.field_1690.field_1903);
      }
   }

   static {
      long var0 = 7066230408233560446L;
      long[] var6 = new long[2];
      int var3 = 0;
      String var4 = "\u009d[c¥|[eN\u001d\u0002µfigK\u0099";
      int var5 = "\u009d[c¥|[eN\u001d\u0002µfigK\u0099".length();
      byte var2 = 0;

      do {
         int var10001 = var2;
         var2 += 8;
         byte[] var7 = var4.substring(var10001, var2).getBytes("ISO-8859-1");
         var10001 = var3++;
         long var10004 = (
               (var7[0] & 255L) << 56
                  | (var7[1] & 255L) << 48
                  | (var7[2] & 255L) << 40
                  | (var7[3] & 255L) << 32
                  | (var7[4] & 255L) << 24
                  | (var7[5] & 255L) << 16
                  | (var7[6] & 255L) << 8
                  | var7[7] & 255L
            )
            ^ var0;
         byte var10003 = -1;
         var6[var10001] = var10004;
      } while (var2 < var5);

      ab = var6;
      baaa = new Integer[2];
   }

   @Unique
   private void ab(class_310 var1) {
      if (var1 != null && var1.field_1690 != null && (this.bbba || this.aab)) {
         if (this.aab && this.field_3913 != null) {
            aabbabbbb.baaabaa(this.field_3913, this.aaa, this.abb);
         }

         abaaaaaba var2 = abaaaaaba.aaaaa();
         aaababaa var3 = var2 != null && var2.aaba() != null ? var2.aaba().baaa() : null;
         boolean var4 = var3 != null && var3.abb();
         boolean var5 = this.bbba;
         if (var5) {
            if (!bbbbbbaa.abab(var1)) {
               if (this.aaaa && !var4) {
                  this.aabb(var2, var1, var1.field_1690.field_1894);
               }

               if (this.aaaaa && !var4) {
                  this.aabb(var2, var1, var1.field_1690.field_1881);
               }

               if (this.bbb) {
                  this.aabb(var2, var1, var1.field_1690.field_1913);
               }

               if (this.abba) {
                  this.aabb(var2, var1, var1.field_1690.field_1849);
               }

               if (this.bab && !var4) {
                  this.aabb(var2, var1, var1.field_1690.field_1867);
               }

               if (this.abbb) {
                  this.aabb(var2, var1, var1.field_1690.field_1832);
               }
            }

            if (this.aaab) {
               this.aabb(var2, var1, var1.field_1690.field_1903);
            }
         }

         if (this.baab) {
            var1.field_1690.field_1886.method_23481(this.baa);
            var1.field_1690.field_1904.method_23481(this.bbab);
            this.baab = false;
         }

         if (var2 != null && var5 && !bbbbbbaa.abab(var1) && !var4) {
            this.ba(var1, var2);
         }

         this.bbba = false;
         this.aab = false;
      }
   }

   @Unique
   private void ba(class_310 var1, abaaaaaba var2) {
      if (!this.aba) {
         if (var1 != null && var1.field_1724 != null && var1.field_1690 != null && var2 != null) {
            if (var2.aaba() == null || var2.aaba().baaa() == null || !var2.aaba().baaa().abb()) {
               boolean var3 = var1.field_1724.method_6115();
               if (var1.field_1724.method_5624()) {
                  this.abab = false;
               }

               if (!var1.field_1724.method_5624() && var1.field_1724.method_5805() && !var1.field_1724.method_5715() && !var3) {
                  bbaaaaa var4 = var2.aaba().abbb();
                  boolean var5 = var4 != null && var4.bbb(var1);
                  aabbababa var6 = var2.aaba().babbba();
                  boolean var7 = var6 != null && var6.aaa();
                  boolean var8 = this.bb
                     || var1.field_1690.field_1867.method_1434()
                     || aabbabbbb.aaab(var1, var1.field_1690.field_1867)
                     || this.abab;
                  if (var5 || var7 || var8) {
                     if (var5 || !this.aab || !(this.aaa <= 0.0F)) {
                        if (var5 || var1.field_1690.field_1894.method_1434() && !var1.field_1690.field_1881.method_1434()) {
                           var1.field_1724.method_5728(true);
                           this.abab = false;
                        }
                     }
                  }
               }
            }
         }
      }
   }

   @Unique
   private void bb(class_310 var1, float var2) {
      float var3 = ((class_746)this).method_36454();
      aaababba var4 = aabbabbab.ab(this.ba, this.aa, this.bba, this.abaa, var3 + var2, var3);
      if (var4.b() != 0.0F || var4.a() != 0.0F) {
         this.b(var1, var4.b(), var4.a());
      }
   }

   @Inject(
      method = {"method_48300"},
      at = {@At("HEAD")},
      cancellable = true
   )
   private void aaa(CallbackInfoReturnable var1) {
      if (!abbabaa.aa() && abaaaaaba.aaaaa() != null && (this.aba || this.aaba)) {
         var1.setReturnValue(false);
      }
   }

   @Unique
   private void aab(abaaaaaba var1, class_310 var2, class_304 var3, boolean var4) {
      if (var2.field_1690 != null) {
         if (var3 == var2.field_1690.field_1894) {
            this.aaaa = true;
         } else if (var3 == var2.field_1690.field_1881) {
            this.aaaaa = true;
         } else if (var3 == var2.field_1690.field_1913) {
            this.bbb = true;
         } else if (var3 == var2.field_1690.field_1849) {
            this.abba = true;
         } else if (var3 == var2.field_1690.field_1867) {
            this.bab = true;
         } else if (var3 == var2.field_1690.field_1832) {
            this.abbb = true;
         } else if (var3 == var2.field_1690.field_1903) {
            this.aaab = true;
         }
      }

      aabbaabb var5 = aabbaabb.bab();
      if (var5 != null) {
         var5.ba(this, var2, var3, var4);
      } else {
         var3.method_23481(var4);
      }
   }

   @Inject(
      method = {"method_6007"},
      at = {@At("HEAD")},
      require = 0
   )
   private void aba(CallbackInfo var1) {
      long var2 = aabbabbbb.baab();
      if (var2 != this.baba) {
         this.baba = var2;
         this.aba = false;
         this.babb = 0;
         this.a = this.b && !((class_746)this).method_5624();
      }

      if (((class_746)this).method_24828()) {
         this.aba = false;
         this.babb = 0;
      }

      if (this.babb > 0) {
         this.babb--;
      } else {
         this.aba = false;
      }

      if (!abbabaa.aa()) {
         class_310 var4 = class_310.method_1551();
         if (var4 != null) {
            aabbabbbb.bababb(var4);
            bbabbbb.baab(var4);
         }

         abaaaaaba var5 = abaaaaaba.aaaaa();
         if (var5 != null) {
            class_310 var6 = class_310.method_1551();
            if (var6.field_1690 != null) {
               if (bbbbbbaa.b(var6)) {
                  this.aaba(var6);
               }

               boolean var7 = var6.field_1755 instanceof baaba var8 && var8.aabbaaa();
               boolean var28 = var6.field_1755 != null && !var7;
               if (this.bbaa && !var28) {
                  this.aa(var6);
               }

               this.bbaa = var28;
               if (var28) {
                  this.baa(var6);
               } else {
                  if (var7 && !bbbbbbaa.abab(var6)) {
                     this.aa(var6);
                  }

                  this.bbba = false;
                  this.aaba = false;
                  this.aab = false;
                  this.aaa = 0.0F;
                  this.abb = 0.0F;
                  if (!bbbbbbaa.abab(var6)) {
                     if (this.aaaa) {
                        this.aabb(var5, var6, var6.field_1690.field_1894);
                     }

                     if (this.aaaaa) {
                        this.aabb(var5, var6, var6.field_1690.field_1881);
                     }

                     if (this.bbb) {
                        this.aabb(var5, var6, var6.field_1690.field_1913);
                     }

                     if (this.abba) {
                        this.aabb(var5, var6, var6.field_1690.field_1849);
                     }

                     if (this.bab) {
                        this.aabb(var5, var6, var6.field_1690.field_1867);
                     }

                     if (this.abbb) {
                        this.aabb(var5, var6, var6.field_1690.field_1832);
                     }

                     if (this.aaab) {
                        this.aabb(var5, var6, var6.field_1690.field_1903);
                     }
                  }

                  this.aaaa = false;
                  this.aaaaa = false;
                  this.bbb = false;
                  this.abba = false;
                  this.bab = false;
                  this.abbb = false;
                  this.aaab = false;
                  aaababaa var29 = var5.aaba() != null ? var5.aaba().baaa() : null;
                  boolean var10 = var29 != null && var29.abb();
                  this.ba = !var10 && this.baab(var6, var6.field_1690.field_1894);
                  this.aa = var10
                     ? var29.aaab() == aabbbbb.aa || this.baab(var6, var6.field_1690.field_1881)
                     : this.baab(var6, var6.field_1690.field_1881);
                  this.bba = this.baab(var6, var6.field_1690.field_1913);
                  this.abaa = this.baab(var6, var6.field_1690.field_1849);
                  this.bb = !var10 && this.baab(var6, var6.field_1690.field_1867);
                  this.bbbb = this.baab(var6, var6.field_1690.field_1832);
                  this.aabb = this.baab(var6, var6.field_1690.field_1903);
                  bbabbaaa var11 = var5.aaba().aaaaaba();
                  if (var11 != null && var11.babbaab()) {
                     this.aab(var5, var6, var6.field_1690.field_1894, false);
                     this.aab(var5, var6, var6.field_1690.field_1881, false);
                     this.aab(var5, var6, var6.field_1690.field_1913, false);
                     this.aab(var5, var6, var6.field_1690.field_1849, false);
                     this.aab(var5, var6, var6.field_1690.field_1867, false);
                     this.aab(var5, var6, var6.field_1690.field_1832, false);
                     this.aab(var5, var6, var6.field_1690.field_1903, false);
                     if (this.field_3913 != null) {
                        aabbabbbb.baaabaa(this.field_3913, 0.0F, 0.0F);
                     }

                     this.bbba = true;
                  }

                  aabbababa var12 = var5.aaba().babbba();
                  if (var12 != null && var12.aaa()) {
                     this.aab(var5, var6, var6.field_1690.field_1867, true);
                     this.bbba = true;
                  }

                  aabababb var13 = var5.aaba().aababa();
                  if (var13 != null) {
                     var13.aa(var6, var13.ba(var6));
                  }

                  bbaaaaa var14 = var5.aaba().abbb();
                  if (var14 != null && var14.bab(var6)) {
                     this.aab(var5, var6, var6.field_1690.field_1903, true);
                     this.bbba = true;
                  }

                  if (var14 != null && var14.bbb(var6)) {
                     this.aab(var5, var6, var6.field_1690.field_1867, true);
                     this.bbba = true;
                  }

                  baabbaa var15 = var5.aaba().bbaa();
                  if (var15 != null && var15.aaa(var6)) {
                     this.aab(var5, var6, var6.field_1690.field_1903, true);
                     this.bbba = true;
                  }

                  aababbbba var16 = var5.aaba().abbaab();
                  boolean var17 = var16 != null && var16.abb(var6);
                  if (var17) {
                     this.aab(var5, var6, var6.field_1690.field_1832, true);
                     this.bbb(var6, var16.aaa(var6));
                     this.bbba = true;
                  }

                  if (var16 != null && var16.bb(var6)) {
                     this.aab(var5, var6, var6.field_1690.field_1867, false);
                     this.bbba = true;
                  }

                  ababaaab var18 = var5.aaba().aaaabaa();
                  boolean var19 = var18 != null && var18.aba();
                  boolean var20 = var18 != null && var18.abb();
                  boolean var21 = var18 != null && var18.ba();
                  boolean var22 = bbabbbb.abaaba();
                  boolean var23 = (var19 || var22) && bbabbbb.abbaba(var6);
                  aaababaaa.aa = var21 ? 2 : (var20 ? 1 : 0);
                  aaababaaa.b = var23 ? 3 : 0;
                  float var24 = bbabbbb.ababbb(var6);
                  if (!var10 && !this.aab && Float.isFinite(var24) && !var21) {
                     this.abab(var6);
                     this.bb(var6, var24);
                     aaababaaa.b = abba(32179, 8834198527429337829L);
                  }

                  if (bbbbbbaa.bba(var6)) {
                     this.ba = this.baba(var6, var6.field_1690.field_1894);
                     this.aa = this.baba(var6, var6.field_1690.field_1881);
                     this.bba = this.baba(var6, var6.field_1690.field_1913);
                     this.abaa = this.baba(var6, var6.field_1690.field_1849);
                     this.bb = this.baba(var6, var6.field_1690.field_1867);
                     this.bbbb = this.baba(var6, var6.field_1690.field_1832);
                     this.aabb = this.baba(var6, var6.field_1690.field_1903);
                     this.aab(var5, var6, var6.field_1690.field_1894, false);
                     this.aab(var5, var6, var6.field_1690.field_1881, false);
                     this.aab(var5, var6, var6.field_1690.field_1913, false);
                     this.aab(var5, var6, var6.field_1690.field_1849, false);
                     this.aab(var5, var6, var6.field_1690.field_1867, false);
                     this.aab(var5, var6, var6.field_1690.field_1832, false);
                     this.aab(var5, var6, var6.field_1690.field_1903, false);
                     if (this.field_3913 != null) {
                        aabbabbbb.baaabaa(this.field_3913, 0.0F, 0.0F);
                     }

                     this.bbba = true;
                  }

                  bbbbbbaa.baaa(var6);
                  abbbbaaab var25 = var5.aaba().bbbaaa();
                  if (var25 != null && var25.bb(var6)) {
                     bbbbbbaa.baab(var6);
                  }

                  if (bbbbbbaa.babb(var6)) {
                     this.baa = this.baba(var6, var6.field_1690.field_1886);
                     this.bbab = this.baba(var6, var6.field_1690.field_1904);
                     var6.field_1690.field_1886.method_23481(false);
                     var6.field_1690.field_1904.method_23481(false);
                     this.baab = true;
                     this.bbba = true;
                  }

                  boolean var26 = var6.field_1724 != null
                     && (
                        var5.aaba().b() != null && var5.aaba().b().aabb(var6)
                           || var5.aaba().aaaaab() != null && var5.aaba().aaaaab().bba(var6)
                           || var5.aaba().aababba() != null && var5.aaba().aababba().aababa(var6)
                     );
                  boolean var27 = var5.aaba().b() != null && var5.aaba().b().babbaab() || var5.aaba().aaaaab() != null && var5.aaba().aaaaab().babbaab();
                  if (var27 && var6.field_1724 != null && (this.a || var26 && !this.aba && var6.field_1724.method_5624())) {
                     this.abab = true;
                  }

                  this.a = false;
                  if (!var27 || !this.baab(var6, var6.field_1690.field_1894)) {
                     this.abab = false;
                  }

                  if (var26) {
                     this.aba = true;
                     this.babb = abba(21369, 3195652675614559278L);
                  }

                  if (this.aba) {
                     this.aab(var5, var6, var6.field_1690.field_1867, false);
                     this.bbba = true;
                  } else if (this.abab) {
                     this.bbba = true;
                  }
               }
            }
         }
      }
   }

   @Unique
   private void abb(class_310 var1, class_304 var2) {
      if (var2 != null) {
         boolean var3 = this.baba(var1, var2);
         var2.method_23481(var3);
         class_306 var4 = aabbabbbb.abbaabb(var2);
         if (!aabbabbbb.bbaaaaa(var4)) {
            class_304.method_1416(var4, var3);
         }
      }
   }

   @Unique
   private void baa(class_310 var1) {
      if (var1 != null && var1.field_1690 != null) {
         var1.field_1690.field_1894.method_23481(false);
         var1.field_1690.field_1881.method_23481(false);
         var1.field_1690.field_1913.method_23481(false);
         var1.field_1690.field_1849.method_23481(false);
         var1.field_1690.field_1867.method_23481(false);
         var1.field_1690.field_1832.method_23481(false);
         var1.field_1690.field_1903.method_23481(false);
         if (this.field_3913 != null) {
            this.field_3913.field_54155 = new class_10185(false, false, false, false, false, false, false);
            aabbabbbb.baaabaa(this.field_3913, 0.0F, 0.0F);
         }
      }
   }

   @Redirect(
      method = {"method_3136"},
      at = @At(
         value = "INVOKE",
         target = "Lnet/minecraft/class_746;method_36454()F"
      ),
      require = 0
   )
   private float bab(class_746 var1) {
      return bbabbbb.bbaab(var1.method_36454());
   }

   @Inject(
      method = {"method_66282"},
      at = {@At("TAIL")},
      require = 0
   )
   private void bba(CallbackInfo var1) {
      class_746 var2 = (class_746)this;
      class_310 var3 = class_310.method_1551();
      if (var3 != null) {
         if (var3.method_1560() == var2 && bbabbbb.abaabb(var2)) {
            float var4 = bbabbbb.abbbab(var2, 1.0F);
            float var5 = bbabbbb.abaa(var2, 1.0F);
            if (var2.field_6012 > 1 && !(Math.abs(class_3532.method_15393(var4 - var2.field_3931)) > 90.0F) && !(Math.abs(var5 - var2.field_3914) > 45.0F)) {
               var2.field_3931 = bbabbbb.bababb(var4, var2.field_3931);
               var2.field_3932 = var2.field_3931 + class_3532.method_15393(var4 - var2.field_3931) * 0.5F;
               var2.field_3916 = var2.field_3914 + (var5 - var2.field_3914) * 0.5F;
            } else {
               var2.field_3931 = var2.field_3932 = var4;
               var2.field_3914 = var2.field_3916 = var5;
            }
         } else {
            var2.field_3932 = var2.field_3931;
            var2.field_3916 = var2.field_3914;
         }
      }
   }

   private void bbb(class_310 var1, double var2) {
      if (var1 != null && var1.field_1690 != null && !(var2 >= 0.999)) {
         float var4 = (this.ba ? 1.0F : 0.0F) - (this.aa ? 1.0F : 0.0F);
         float var5 = (this.bba ? 1.0F : 0.0F) - (this.abaa ? 1.0F : 0.0F);
         float var6 = class_3532.method_15355(var4 * var4 + var5 * var5);
         if (!(var6 <= 1.0E-4F)) {
            if (var6 > 1.0F) {
               var4 /= var6;
               var5 /= var6;
            }

            float var7 = (float)var2;
            this.aaa = var4 * var7;
            this.abb = var5 * var7;
            this.aab = true;
         }
      }
   }

   @Inject(
      method = {"method_5773"},
      at = {@At(
         value = "INVOKE",
         target = "Lnet/minecraft/class_746;method_3136()V"
      )},
      require = 0
   )
   private void aaaa(CallbackInfo var1) {
      if (!abbabaa.aa()) {
         class_310 var2 = class_310.method_1551();
         aabbabbbb.bababb(var2);
         abaaaaaba var3 = abaaaaaba.aaaaa();
         if (var3 != null) {
            abbbbaaab var4 = var3.aaba().bbbaaa();
            if (var4 != null) {
               var4.ba(var2);
            }
         }

         bbabbbb.abaab(var2);
         aaababaaa.aa(var2);
      }
   }

   @Unique
   private void aaab(class_310 var1) {
      if (var1 != null && var1.field_1690 != null) {
         this.ba = this.baba(var1, var1.field_1690.field_1894);
         this.aa = this.baba(var1, var1.field_1690.field_1881);
         this.bba = this.baba(var1, var1.field_1690.field_1913);
         this.abaa = this.baba(var1, var1.field_1690.field_1849);
      }
   }

   @Unique
   private void aaba(class_310 var1) {
      if (var1 != null && var1.field_1690 != null) {
         abaaaaaba var2 = abaaaaaba.aaaaa();
         this.aabb(var2, var1, var1.field_1690.field_1894);
         this.aabb(var2, var1, var1.field_1690.field_1881);
         this.aabb(var2, var1, var1.field_1690.field_1913);
         this.aabb(var2, var1, var1.field_1690.field_1849);
         this.aabb(var2, var1, var1.field_1690.field_1867);
         this.aabb(var2, var1, var1.field_1690.field_1832);
         this.aabb(var2, var1, var1.field_1690.field_1903);
      }
   }

   @Unique
   private void aabb(abaaaaaba var1, class_310 var2, class_304 var3) {
      aabbaabb var4 = aabbaabb.bab();
      if (var4 != null) {
         var4.baa(this, var2, var3);
      } else {
         var3.method_23481(this.baba(var2, var3));
      }
   }

   @Inject(
      method = {"method_6007"},
      at = {@At("TAIL")},
      require = 0
   )
   private void abaa(CallbackInfo var1) {
      if (!abbabaa.aa()) {
         class_310 var2 = class_310.method_1551();
         class_746 var3 = (class_746)this;
         if (this.field_3913 != null && this.field_3913.field_54155 != null) {
            if (this.aaba) {
               var3.method_5728(false);
               class_10185 var4 = this.field_3913.field_54155;
               if (var4.comp_3165()) {
                  this.field_3913.field_54155 = new class_10185(
                     var4.comp_3159(), var4.comp_3160(), var4.comp_3161(), var4.comp_3162(), var4.comp_3163(), var4.comp_3164(), false
                  );
               }
            } else if (var3.method_5624() && !this.field_3913.field_54155.comp_3165() && this.field_3913.method_20622()) {
               class_10185 var14 = this.field_3913.field_54155;
               this.field_3913.field_54155 = new class_10185(
                  var14.comp_3159(), var14.comp_3160(), var14.comp_3161(), var14.comp_3162(), var14.comp_3163(), var14.comp_3164(), true
               );
            }
         }

         this.ab(var2);
         abaaaaaba var15 = abaaaaaba.aaaaa();
         if (var15 != null) {
            class_746 var5 = (class_746)this;
            if (var2.field_1724 != null) {
               bbaaaaa var6 = var15.aaba().abbb();
               if (var6 != null && var6.ba() && !var5.method_24828()) {
                  class_243 var7 = var5.method_18798();
                  double var8 = Math.sqrt(var7.field_1352 * var7.field_1352 + var7.field_1350 * var7.field_1350);
                  if (var8 > 0.001) {
                     float var10 = var6.aaab();
                     float var11 = (float)Math.toDegrees(Math.atan2(-var7.field_1352, var7.field_1350));
                     float var12 = class_3532.method_15393(var10 - var11);
                     class_243 var13 = new class_243(var7.field_1352, 0.0, var7.field_1350).method_1024(-((float)Math.toRadians(var12)));
                     var5.method_18800(var13.field_1352, var7.field_1351, var13.field_1350);
                  }
               }

               float var16 = bbabbbb.aababaa() ? bbabbbb.a() : var5.method_36454();
               aabbabbbb.bbbaaaa(var2, var16);
            }
         }
      }
   }

   @Unique
   private void abab(class_310 var1) {
      if (var1 != null && var1.field_1690 != null) {
         abaaaaaba var2 = abaaaaaba.aaaaa();
         aaababaa var3 = var2 != null && var2.aaba() != null ? var2.aaba().baaa() : null;
         boolean var4 = var3 != null && var3.abb();
         this.ba = !var4 && this.baab(var1, var1.field_1690.field_1894);
         this.aa = var4
            ? var3.aaab() == aabbbbb.aa || this.baab(var1, var1.field_1690.field_1881)
            : this.baab(var1, var1.field_1690.field_1881);
         this.bba = this.baab(var1, var1.field_1690.field_1913);
         this.abaa = this.baab(var1, var1.field_1690.field_1849);
      }
   }

   private static int abba(int var0, long var1) {
      int var3 = var0 ^ (int)(var1 & 32767L) ^ 8023;
      if (baaa[var3] == null) {
         baaa[var3] = (int)(ab[var3] ^ var1);
      }

      return baaa[var3];
   }

   @Redirect(
      method = {"method_3136"},
      at = @At(
         value = "INVOKE",
         target = "Lnet/minecraft/class_746;method_36455()F"
      ),
      require = 0
   )
   private float a(class_746 var1) {
      return bbabbbb.aaabbb(var1.method_36455());
   }

   @Inject(
      method = {"method_6007"},
      at = {@At("TAIL")},
      require = 0
   )
   private void abbb(CallbackInfo var1) {
      this.b = ((class_746)this).method_5624();
      if (!abbabaa.aa()) {
         class_310 var2 = class_310.method_1551();
         bbabbbb.baa(var2);
      }
   }

   @Inject(
      method = {"method_6007"},
      at = {@At(
         value = "INVOKE",
         target = "Lnet/minecraft/class_1156;method_4909(Lnet/minecraft/class_744;)V"
      )},
      require = 0
   )
   private void baaa(CallbackInfo var1) {
      if (!abbabaa.aa()) {
         class_310 var2 = class_310.method_1551();
         if (var2.field_1690 != null) {
            boolean var3 = var2.field_1755 instanceof baaba var4 && var4.aabbaaa();
            if (var2.field_1755 != null && !var3) {
               this.baa(var2);
            } else {
               this.ab(var2);
               if (var2.field_1724 != null && (this.aba || this.aaba)) {
                  if (this.field_3913 != null && this.field_3913.field_54155 != null) {
                     class_10185 var6 = this.field_3913.field_54155;
                     if (var6.comp_3165()) {
                        this.field_3913.field_54155 = new class_10185(
                           var6.comp_3159(), var6.comp_3160(), var6.comp_3161(), var6.comp_3162(), var6.comp_3163(), var6.comp_3164(), false
                        );
                     }
                  }

                  var2.field_1724.method_5728(false);
               }
            }
         }
      }
   }

   @Unique
   private boolean baab(class_310 var1, class_304 var2) {
      aabbaabb var3 = aabbaabb.bab();
      return var3 == null ? this.baba(var1, var2) : var3.ab(var1, var2);
   }

   @Unique
   private boolean baba(class_310 var1, class_304 var2) {
      return var2 != null && aabbabbbb.aaab(var1, var2);
   }

   @Inject(
      method = {"method_5773"},
      at = {@At(
         value = "INVOKE",
         target = "Lnet/minecraft/class_746;method_3136()V",
         shift = Shift.AFTER
      )},
      require = 0
   )
   private void babb(CallbackInfo var1) {
      if (!abbabaa.aa()) {
         class_310 var2 = class_310.method_1551();
         aaababaaa.ba(var2);
         aabbabbbb.bbbabb();
         bbabbbb.aaabbaa(var2);
         bbbbbbaa.ba(var2);
         abaaaaaba var3 = abaaaaaba.aaaaa();
         if (var3 != null) {
            var3.aaba().aaaaba(var2);
         }
      }
   }
}
