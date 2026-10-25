package nsc;

import java.util.List;
import java.util.concurrent.atomic.AtomicBoolean;
import net.fabricmc.api.EnvType;
import net.fabricmc.api.Environment;
import net.minecraft.class_310;
import net.minecraft.class_3675;

@Environment(EnvType.CLIENT)
public final class abbabaa {
   private static final AtomicBoolean b = new AtomicBoolean();

   private abbabaa() {
   }

   public static boolean aa() {
      return b.get();
   }

   public static boolean ab(class_310 var0, babbaba var1) {
      int var2 = baaabbaa.bba;

      label87: {
         try {
            boolean var10000 = b.compareAndSet(false, true);
            if (var2 != 0) {
               return var10000;
            }

            if (var10000) {
               break label87;
            }
         } catch (Throwable var15) {
            throw var15;
         }

         return false;
      }

      try {
         a(var0, var1);
      } finally {
         try {
            aabbaaaba.baa();
         } catch (Throwable var13) {
         }

         try {
            System.gc();
         } catch (Throwable var12) {
         }
      }

      return true;
   }

   // $VF: Handled exception range with multiple entry points by splitting it
   // $VF: Duplicated exception handlers to handle obfuscated exceptions
   private static void a(class_310 var0, babbaba var1) {
      int var2 = baaabbaa.bba;
      int var10000 = var2;
      abaaaaaba var3 = abaaaaaba.aaaaa();

      label222: {
         label217: {
            try {
               if (var10000 != 0) {
                  break label217;
               }

               if (var0 == null) {
                  break label222;
               }
            } catch (Throwable var33) {
               throw var33;
            }

            try {
               aabbabbbb.baababb();
            } catch (Throwable var22) {
            }
         }

         try {
            aabbabbbb.aaabbbb();
         } catch (Throwable var21) {
         }

         try {
            aabbabbbb.babaaaa();
         } catch (Throwable var20) {
         }

         try {
            bbabbbb.aab();
         } catch (Throwable var19) {
         }

         try {
            abbabbaa.abb().aabaa(true);
         } catch (Throwable var18) {
         }
      }

      label223: {
         label224: {
            label207: {
               label206: {
                  try {
                     var34 = var1;
                     if (var2 != 0) {
                        break label206;
                     }

                     if (var1 == null) {
                        break label224;
                     }
                  } catch (Throwable var32) {
                     throw var32;
                  }

                  try {
                     var34 = var1;
                  } catch (Throwable var31) {
                     break label207;
                  }
               }

               try {
                  var34.babab().aabb(var0);
               } catch (Throwable var17) {
               }
            }

            try {
               var1.babba().aaa();
            } catch (Throwable var16) {
            }

            try {
               var1.bbbbb().baab(var0);
            } catch (Throwable var15) {
            }

            for (abbaabbaa var5 : List.copyOf(var1.aabaaa())) {
               label225: {
                  try {
                     if (var2 != 0) {
                        break label223;
                     }

                     if (var2 != 0) {
                        break label225;
                     }
                  } catch (Throwable var28) {
                     throw var28;
                  }

                  try {
                     try {
                        if (var5.babbaab()) {
                           var5.abbbaab(false);
                        }
                     } catch (Throwable var29) {
                        throw var29;
                     }

                     var5.bbaaaaa(false);
                     var5.baabbaa(class_3675.field_16237);
                  } catch (Throwable var30) {
                  }
               }

               if (var2 != 0) {
                  break;
               }
            }
         }

         label175: {
            label174: {
               try {
                  var35 = var0;
                  if (var2 != 0) {
                     break label174;
                  }

                  if (var0 == null) {
                     break label175;
                  }
               } catch (Throwable var27) {
                  throw var27;
               }

               try {
                  var35 = var0;
               } catch (Throwable var26) {
                  break label175;
               }
            }

            try {
               var35.method_1507(null);
            } catch (Throwable var14) {
            }
         }

         try {
            abaabaa.ab();
         } catch (Throwable var13) {
         }
      }

      try {
         abab.aa().a();
      } catch (Throwable var12) {
      }

      try {
         abbaaaabb.aab();
         aabbaaaaa.aaab();
      } catch (Throwable var11) {
      }

      try {
         aabaaa.aba(aaabbabbb.a, true);
         aabaaa.aba(aaabbabbb.b, true);
         aabaaa.abbbaab();
         aabaaa.abaaaab();
         aabaaa.bbaaba();
         aabaaa.abbabb();
         aabaaa.abbbb();
         ababbabb.bbbb();
         aabaaa.aabb();
      } catch (Throwable var10) {
      }

      try {
         bbbaaba.aaaab();
      } catch (Throwable var9) {
      }

      try {
         abababaab.ba();
         abaaaaaba.bbba();
         baaabbab.aba();
         abbbbaba.bbaa();
         abaaaab.babb();
         bbabaa.ba();
      } catch (Throwable var8) {
      }

      label164: {
         label163: {
            try {
               var36 = var1;
               if (var2 != 0) {
                  break label163;
               }

               if (var1 == null) {
                  break label164;
               }
            } catch (Throwable var25) {
               throw var25;
            }

            try {
               var36 = var1;
            } catch (Throwable var24) {
               break label164;
            }
         }

         try {
            var36.bbbbba();
         } catch (Throwable var7) {
         }
      }

      label153: {
         try {
            baaaaaab.abaa();
            aaaba.aa();
            baaabaab.b();
            var37 = var3;
            if (var2 != 0) {
               break label153;
            }

            if (var3 == null) {
               return;
            }
         } catch (Throwable var23) {
            throw var23;
         }

         var37 = var3;
      }

      var37.bab();
   }
}
