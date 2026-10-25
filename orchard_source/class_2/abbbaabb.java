package nsc;

import net.fabricmc.api.EnvType;
import net.fabricmc.api.Environment;
import net.minecraft.class_1735;
import net.minecraft.class_310;

@Environment(EnvType.CLIENT)
public final class abbbaabb extends abbaabbaa {
   private static final long aa;
   private long ab;
   private static final int[] abab;
   private final bababa ba;
   private final abbaaaaa bb;
   private int aaa;
   private static final Object[] abbb;
   private long aab;
   private int aba;
   private static final String[] abb;
   private int baa;
   private static final String[] bab;
   private static final String[] abba;
   private long bba;
   private static final long[] bbb;
   private final aaabbbab aaaa;
   private static final Long[] aaab;
   private static final Integer[] aaba;
   private static final int aabb;
   private static final long[] abaa;

   private static int aa(int var0, long var1) {
      int var3 = var0 ^ (int)(var1 & 32767L) ^ b(-190071070, -855144935 ^ 851480456);
      if (aaba[var3] == null) {
         aaba[var3] = (int)(abaa[var3] ^ var1);
      }

      return aaba[var3];
   }

   @Override
   public void aabaa() {
      this.ba();
      this.baa = -1;
      this.ab = 0L;
   }

   @Override
   public void bbaa() {
      this.aab(class_310.method_1551());
   }

   private static int b(int var0, int var1) {
      int var2 = abab[var0 ^ -190071070] ^ var1 ^ var0;
      var2 ^= 27547;
      var2 += 37034;
      var2 ^= 1098;
      var2 -= 24366;
      var2 -= 42347;
      var2 += 32386;
      return var2 + 57281;
   }

   private static String aba(byte var0, byte var1, short var2, char var3, int var4, byte var5, byte var6) {
      int var11 = var4 ^ 1607573314;
      char[] var10 = abba[var11].toCharArray();
      StackTraceElement[] var12 = (StackTraceElement[])abbb[var11];
      StackTraceElement[] var13;
      if (var12 != null) {
         var13 = var12;
      } else {
         var13 = new Throwable().getStackTrace();
         abbb[var11] = var13;
      }

      StackTraceElement var14 = var13[1];
      int var8 = (var14.getClassName().hashCode() ^ var14.getMethodName().hashCode()) >> 16 ^ 42185;

      for (int var9 = 0; var9 < var10.length; var9++) {
         var10[var9] = (char)(var10[var9] ^ switch (var9 % 4) {
            default -> 215;
            case 1 -> 84;
            case 2 -> 9;
            case 3 -> 74;
         } ^ var9 ^ var6 ^ var5 ^ var0 ^ var3 ^ var4 ^ var2 ^ var1 ^ var8);
      }

      return new String(var10).intern();
   }

   // $VF: Irreducible bytecode was duplicated to produce valid code
   static {
      int var34 = -1108962272;
      char[] var25 = "睃眹眄眖県眖県眖".toCharArray();
      short var23 = 30492;
      byte var30 = -1;
      String var24 = "䙃䙂䚍䛨䙽䚑䛅䚐䘴䙣䘂䚍䘘䙤䛎䛣䛿䙚䙟䚢䙒䛸䛙䛦䚙䙬䚲䛣䚡䙕䙢䙈䘀䛢䙢䛮䛚䚻䛮䚦䚢䚫䛠䚵䛐䙭䙰䚲䚆䚖䘳䛜䘄䚂䚯䘧䛭䘰䘬䙫䚉䛶䙦䚝䛤䙱䙕䘡䚯䙊䚥䘱䘷䘔䘲䙙䛏䚥䚜䚍䚣䛾䚄䘕䙊䚇䘻䘫䙔䙄䛦䛼䛴䚦䚣Șːʩʂɬ˘ˏˠ˙ˊʳɘʵ˷˔ȓȃɹ˸ɒȀɵ˙ɒɥʠʢ˫ɹɜȚʑˈȦ˨ȫɦ\uf647\uf60a\uf60e\uf6d3\uf662\uf6f4\uf606\uf679\uf6d2\uf698\uf645\uf6e7\uf624\uf64f\uf6e9\uf60b\uf6eb\uf6f7\uf61e\uf6d7\uf63f\uf69a\uf6d5\uf648튼퉌퉂튋퉪퉳툘툾틴튃ٲۆڥؚ،۶۾صٿۭ۟ڤځ۸ځڶ뢉롹롷뢾롟롆렭렋룁뢶ﾯￆＸ\ufff9ｏ￩ｸ･ￃ\uffe7８ｴﾋﾼＪｸ\uf4bf\uf44f\uf441\uf488\uf469\uf470\uf41b\uf43d\uf4f7\uf480";
      String[] var26 = new String[var25.length];

      while (true) {
         int var27 = 0;
         int var28 = 0;
         int var29 = 0;
         if (var30 == 0) {
            abba = var26;
            abbb = new Object[var26.length];
            byte var39 = 0;
            int var10001 = 0;
            byte[] var10002 = "\u0001VLø{vz\u0082¶\u0014W\u001aP¢b\u0095kÉ:sJ\u001aøÊhð±Ö&\tä\u007fñ_2Gk\u0013ÝB\r`Ã\u0018$3%DèDÇ&_²A\u0012ivO\u0086 :øûÖJ7Ó_\u0000\u008b@Ö¨\u0081\u0017\u0005U©\fy\u000eá\u0007\u0085ÍOpý¶\u0099Ï|q\u0007î(´)\u001a9ñ\r÷(Ã×\u008b>\u009e^:×u!öñ£¼\u0098ë0\u001e¡\u0012hÊÚV ¦×qóP\u0085à.ä\n\u008e¡Ç\u008b´î_µã\u0007\u0015Mº\u009c±'ô»\u001eúf%\n=°Ô4÷\u007f£¥\u008d¹Ã¼\u008br\u0016'¼,cçê\u0099\u001f×\u0016l7\u0018 veù\t\u0010Ù\u0099ûÙÆyæ;\u009e\u000f\u009aÎj\u009aEÌÀÃ¤ïµ{\u0007\u0016\u001aü4³ú®\u00888\u008b³gl[\u008c\u0092Snø\u0004Wú{hûËÍÙ,.ynP5 =\u0002\u0096\u0080\u001dÐßê\u0005`4^ß\u0013V\u0005æDy\u008dIsh}]èY=~Úz\\\u0091?8`8-j\u009f/b ?\u009f~\u0094à@nùóQ\u009bù\u0005\u001d\u0082Æçf¹\u0093\u0016\u008b\u0083.64·ÖJ\u0088\u0007\u008aÙ¨!S\u0019Yvn_\u00899Uuh@¸Q^\u0093\u0001X9ñ#Ø´&p\u0098v*\u0088í\f\u0095Á\u0017\u001bkgè\u008c6+QPé^Þêö~\u0088wõïwssü7\u0019ãT*.1·°j<\u0087Dèqä\u009f\u000f\u0003\u0097PóS/ÿ\u000e\u00025\u0015:¹³ÁpcAIh \u001a\u0016Z\u0099à³\u0019RIVÌGN/0ØQ\u0096¡ÜC5ç¦Kþ¿ï|d\bCq\u0018.\u0018\u0095ô:yx5u¨s4rË&Ò¦ Hòß\u0017\u0015lWò`p½\u0096É\u00145sñH°´ÇõNÕ8\u009f\u0090&\\6\u009a¢ÿ.\"1Ð{\u001eÁ®\u0001¤\bt\u0017?\u0015Ö\u0093ÿOÑil¤cÀiWÞ\bk%Ó½\f\u0014p²\u009f\u000e\u000fmãÉÙ0°.&È%Á\u0014\u000fïò±îÅK\u0011ñ)ÝÎ:\u009b Ï¡À\u001a\u0019ºX¶\"IÞêÿ`ÔJ\u0015¹\u0015Çç\u0005r&\u009e\u0084Òærµè\b\u0012\u0019\u0091<ë\u0094ç[\u0080>Î\u008eßW§Å\u007f\u0088-\u009a\u0088\u008f\u0097\"¥\u0013y! Ç\u0088$²õ§nõ°8,B\u0093\u0019¶nö3]¡\u0097e\u008c&Õ²\u00ad²mÂ\u0086IÜzK\tJËo\u0002ìá\u00ad·A\u009eïðç\u001aò=/\u0086\u001b¨«\u008bnÃûÿ@Ö\u0003Î\u001d\u0080Ð\u0082\u0092SiÿNìÃ5©uù¶Í\u001c%\u0017¼+O$«ÿ_èIw\u0000»iJû\u009aÙ\u0002î¹$\u0019ý|®Ì©I\u0085Xä\u008b¢\u0096\u0003é·©¬LV8aùRAók«\u000bY\u001fê\u008c]\u0002zµùí\u0007\fà\u0097\u001aO\u009d§ÍÉ\u000bºB£_ó\u0098Çk!®\u0015\u0011±íh¬\u008b¦Ô\u0095½ô\u000f\u009cú«\u0016\u00adhY¢3Ô¶Ò\b:\u0003\u008b ½½à\u0093\u001d\u0004{øCJ½A\u009aW\u0018ò°\u0093X\u0013Ä5\u0090©Á\u0001\u0083ãD¦mìåÑìaD'\u00956é¾î²â¸\u008a÷ñÔo0ÄH´\u009fö\u0010ù\u0000åO\u0086»3¼ª0\u0094\u0013\u007fU÷acZÙ³^ûAC\u0093\f¿@NÃ,O\u0081l\u0016\u0014ãº\u0003QG\u0005'vûè\u0002\u0095#\u0018#B½\u0005ëÝ±\u0088\u009eaâ\u00848\u0004Ñ\u0016m\u000eC:\u001a:5nç\u0003Ó\f§b\u001cý(ÚþX\u001f+¨²\u0003+ª\u0096²Æxh\u008b\u008aGù|Ð\u0012\u0095\u0085^c²\b\u001e\u0001c¡f3Ç\u009f\u009e\r²C\u0093n\t¼0Ì?\u0010ª\u000e\u000b\u0099¼\u0085GÎ\u009enÇP\u0092U.)¦\u0083>D2'\u0003b\u0004g\u0003\u0005·\u008eãtCÝ\u0016RP÷\u0082Áï\u001dG\u000eá\u0080^¬\u0001\u009eM¥ß¡øLM}]øÔ¹q-ÌÑ\u0018\u0001gA\u0083µ+\u009d\u008b?Å\u0083\u0086Vr°Tï±\u0090A¦*ºT\t±ã\u0015ÇkÉ{áô\u001bç×\u008dºH\u009c\u009b¹Màë¨2bµ\u009dÇ}xwx=¼^é\u008cq?\u007fÄ\u0005+ý^ýï\"\u0011\u0081\bäoä{k\tzìë~ºó³[O|\u0093ÊÔ4\u00815\u008e\u0087ÎZ_\u008d¨bp\u009fë}\u008e#Qí\u0098\u00adrsA4L-ü·$zè\u0089v¿¼!)\u0010a\u00adº\u0097ÍH\u008f\"\"Ì\u0099Á\u00159\u001c9ë4Ûÿ!_\u0000\u0084â\u009c\u0085E\u0087:B\u008d\u008cM-Ë0\u0089BÆ\r\u009dµ\u0006"
               .getBytes("ISO-8859-1");
            abab = new int[318];

            int var82;
            do {
               abab[var39] = (
                     (var10002[var10001] & 255) << 24
                        | (var10002[var10001 + 1] & 255) << 16
                        | (var10002[var10001 + 2] & 255) << 8
                        | var10002[var10001 + 3] & 255
                  )
                  ^ -171605511;
               var39 += 1;
               var82 = var10001 + 4;
               var10001 += 4;
            } while (var82 < var10002.length);

            String[] var21 = new String[b(-190071069, var34 ^ 939633487)];
            int var19 = 0;
            String var18;
            int var20 = (var18 = aba((byte)58, 18, (short)-10506, 29172, 1607573314, (byte)-107, (byte)-38)).length();
            int var17 = b(-190071072, var34 ^ -178027090);
            int var37 = -1;

            label135:
            while (true) {
               String var40 = var18.substring(++var37, var37 + var17);
               var10001 = (byte)-1;

               while (true) {
                  label130: {
                     char[] var47 = var40.toCharArray();
                     var82 = var47.length;
                     int var22 = 0;
                     var67 = var47;
                     var10001 = var82;
                     char[] var86;
                     int var103;
                     if (var82 <= 1) {
                        var86 = var47;
                        var103 = var22;
                     } else {
                        var67 = var47;
                        var10001 = var82;
                        if (var82 <= var22) {
                           break label130;
                        }

                        var86 = var47;
                        var103 = var22;
                     }

                     while (true) {
                        var86[var103] = (char)(var86[var103] ^ switch (var22 % b(-190071065, var34 ^ 158148866)) {
                           case 0 -> b(-190071068, var34 ^ 730293024);
                           case 1 -> b(-190071067, var34 ^ 1702770005);
                           case 2 -> b(-190071062, var34 ^ -1305943854);
                           case 3 -> 2;
                           case 4 -> b(-190071061, var34 ^ 677646242);
                           case 5 -> b(-190071064, var34 ^ 1310134844);
                           default -> b(-190071063, var34 ^ 1732573175);
                        });
                        var22++;
                        if (var10001 == 0) {
                           var103 = var10001;
                           var86 = var67;
                        } else {
                           if (var10001 <= var22) {
                              break;
                           }

                           var86 = var67;
                           var103 = var22;
                        }
                     }
                  }

                  String var93 = new String(var67).intern();
                  switch (var10001) {
                     case 0:
                        var21[var19++] = var93;
                        if ((var37 += var17) >= var20) {
                           bab = var21;
                           abb = new String[b(-190071066, var34 ^ 683600827)];
                           long var8 = 607425784624281892L;
                           long[] var14 = new long[5];
                           int var11 = 0;
                           String var12;
                           int var13 = (var12 = aba((byte)16, (byte)-58, (short)10105, '〷', 1607573312, (byte)36, (byte)-103)).length();
                           byte var10 = 0;

                           label109:
                           while (true) {
                              int var54 = var10;
                              var10 += 8;
                              byte[] var15 = var12.substring(var54, var10).getBytes(aba((byte)-62, (byte)13, (short)19893, (char)'腥', 1607573313, 4, (byte)23));
                              long[] var42 = var14;
                              var54 = var11++;
                              long var73 = (var15[0] & 255L) << b(-190071058, var34 ^ -1422715504)
                                 | (var15[1] & 255L) << b(-190071057, var34 ^ 482710429)
                                 | (var15[2] & 255L) << b(-190071060, var34 ^ 704749218)
                                 | (var15[3] & 255L) << b(-190071059, var34 ^ 1666001350)
                                 | (var15[4] & 255L) << b(-190071054, var34 ^ -1791105511)
                                 | (var15[5] & 255L) << b(-190071053, var34 ^ 477583987)
                                 | (var15[b(-190071056, var34 ^ -1780526903)] & 255L) << b(-190071055, var34 ^ 1176664277)
                                 | var15[b(-190071050, var34 ^ 981020894)] & 255L;
                              byte var94 = -1;

                              while (true) {
                                 long var105 = var73 ^ var8;
                                 switch (var94) {
                                    case 0:
                                       var42[var54] = var105;
                                       if (var10 >= var13) {
                                          abaa = var14;
                                          aaba = new Integer[5];
                                          aabb = aa(b(-190071044, var34 ^ -1471683680), 6900697670445212490L);
                                          long var0 = 647801118349483854L;
                                          long[] var6 = new long[2];
                                          int var3 = 0;
                                          String var4;
                                          int var5 = (var4 = aba(124, (byte)-85, (short)-4563, 4003, 1607573316, (byte)-24, (byte)-58)).length();
                                          byte var2 = 0;

                                          do {
                                             int var57 = var2;
                                             var2 += 8;
                                             byte[] var7 = var4.substring(var57, var2)
                                                .getBytes(aba((byte)78, (byte)-118, (short)-8732, 14180, 1607573317, 115, (byte)60));
                                             var57 = var3++;
                                             var105 = (
                                                   (var7[0] & 255L) << b(-190071043, var34 ^ 1360992383)
                                                      | (var7[1] & 255L) << b(-190071102, var34 ^ 366441589)
                                                      | (var7[2] & 255L) << b(-190071101, var34 ^ 847544718)
                                                      | (var7[3] & 255L) << b(-190071104, var34 ^ -1554434790)
                                                      | (var7[4] & 255L) << b(-190071103, var34 ^ -841607566)
                                                      | (var7[5] & 255L) << b(-190071098, var34 ^ -140931405)
                                                      | (var7[b(-190071097, var34 ^ -1603222364)] & 255L) << b(-190071100, var34 ^ -102014773)
                                                      | var7[b(-190071099, var34 ^ -1211314416)] & 255L
                                                )
                                                ^ var0;
                                             var94 = -1;
                                             var6[var57] = var105;
                                          } while (var2 < var5);

                                          bbb = var6;
                                          aaab = new Long[2];
                                          aa = a(b(-190071094, var34 ^ 626173370), 3195929069108491360L);
                                          return;
                                       }
                                       break;
                                    default:
                                       var42[var54] = var105;
                                       if (var10 < var13) {
                                          continue label109;
                                       }

                                       var13 = (var12 = aba((byte)-122, (byte)-121, (short)-23001, '뻀', 1607573318, (byte)-50, (byte)121)).length();
                                       var10 = 0;
                                 }

                                 byte var56 = var10;
                                 var10 += 8;
                                 var15 = var12.substring(var56, var10).getBytes(aba(32, 104, 8415, 31210, 1607573319, 39, (byte)101));
                                 var42 = var14;
                                 var54 = var11++;
                                 var73 = (var15[0] & 255L) << b(-190071049, var34 ^ -960848417)
                                    | (var15[1] & 255L) << b(-190071052, var34 ^ -1094628517)
                                    | (var15[2] & 255L) << b(-190071051, var34 ^ 1057412819)
                                    | (var15[3] & 255L) << b(-190071046, var34 ^ 1808005168)
                                    | (var15[4] & 255L) << b(-190071045, var34 ^ 2055658548)
                                    | (var15[5] & 255L) << b(-190071048, var34 ^ 1806960307)
                                    | (var15[b(-190071047, var34 ^ 2112458733)] & 255L) << b(-190071042, var34 ^ -1811746784)
                                    | var15[b(-190071041, var34 ^ -1294701240)] & 255L;
                                 var94 = 0;
                              }
                           }
                        }

                        var17 = var18.charAt(var37);
                        break;
                     default:
                        var21[var19++] = var93;
                        if ((var37 += var17) < var20) {
                           var17 = var18.charAt(var37);
                           continue label135;
                        }

                        var20 = (var18 = aba(110, 8, 27731, '迦', 1607573315, (byte)6, 14)).length();
                        var17 = b(-190071071, var34 ^ 332772160);
                        var37 = -1;
                  }

                  var40 = var18.substring(++var37, var37 + var17);
                  var10001 = (byte)0;
               }
            }
         }

         do {
            var29 = var25[var27] ^ var23;
            char[] var31 = var24.substring(var28, var28 + var29).toCharArray();
            int var32 = 0;

            do {
               short var33 = switch (var32 % 6) {
                  default -> 73;
                  case 1 -> 33;
                  case 2 -> 109;
                  case 3 -> 132;
                  case 4 -> 234;
                  case 5 -> 113;
               };
               var31[var32] = (char)(var31[var32] ^ var33);
            } while (++var32 < var31.length);

            var26[var27] = new String(var31).intern();
            var28 += var29;
         } while (++var27 < var25.length);

         var30 = 0;
      }
   }

   private boolean ab(class_310 param1, class_1735 param2) {
      // $VF: Couldn't be decompiled
      // Please report this to the Vineflower issue tracker, at https://github.com/Vineflower/vineflower/issues with a copy of the class file (if you have the rights to distribute it!)
      // java.lang.RuntimeException: parsing failure!
      //   at org.jetbrains.java.decompiler.modules.decompiler.decompose.DomHelper.parseGraph(DomHelper.java:211)
      //   at org.jetbrains.java.decompiler.main.rels.MethodProcessor.codeToJava(MethodProcessor.java:166)
      //
      // Bytecode:
      // 00: getstatic qeaa361f143ee4a0894bd168fd9b30c66/qf4ccf8f5435d4a78bdca4d6a018b578e/baaabbaa.bba I
      // 03: istore 3
      // 04: aload 1
      // 05: iload 3
      // 06: ifne 11
      // 09: ifnull 3d
      // 0c: goto 10
      // 0f: athrow
      // 10: aload 1
      // 11: getfield net/minecraft/class_310.field_1724 Lnet/minecraft/class_746;
      // 14: ifnull 3d
      // 17: aload 2
      // 18: iload 3
      // 19: ifne 28
      // 1c: goto 20
      // 1f: athrow
      // 20: ifnull 3d
      // 23: goto 27
      // 26: athrow
      // 27: aload 2
      // 28: iload 3
      // 29: ifne 41
      // 2c: getfield net/minecraft/class_1735.field_7871 Lnet/minecraft/class_1263;
      // 2f: aload 1
      // 30: getfield net/minecraft/class_310.field_1724 Lnet/minecraft/class_746;
      // 33: invokevirtual net/minecraft/class_746.method_31548 ()Lnet/minecraft/class_1661;
      // 36: if_acmpeq 40
      // 39: goto 3d
      // 3c: athrow
      // 3d: bipush 0
      // 3e: ireturn
      // 3f: athrow
      // 40: aload 2
      // 41: invokevirtual net/minecraft/class_1735.method_34266 ()I
      // 44: istore 4
      // 46: iload 4
      // 48: iload 3
      // 49: ifne 6c
      // 4c: ldc_w -190071093
      // 4f: ldc_w 1168909931
      // 52: ldc_w 199848500
      // 55: ixor
      // 56: invokestatic qeaa361f143ee4a0894bd168fd9b30c66/qf4ccf8f5435d4a78bdca4d6a018b578e/abbbaabb.b (II)I
      // 59: ldc2_w 7588430487428602378
      // 5c: invokestatic qeaa361f143ee4a0894bd168fd9b30c66/qf4ccf8f5435d4a78bdca4d6a018b578e/abbbaabb.aa (IJ)I
      // 5f: if_icmplt 92
      // 62: goto 66
      // 65: athrow
      // 66: iload 4
      // 68: goto 6c
      // 6b: athrow
      // 6c: iload 3
      // 6d: ifne 8f
      // 70: ldc_w -190071096
      // 73: ldc_w 1168909931
      // 76: ldc_w -996256378
      // 79: ixor
      // 7a: invokestatic qeaa361f143ee4a0894bd168fd9b30c66/qf4ccf8f5435d4a78bdca4d6a018b578e/abbbaabb.b (II)I
      // 7d: ldc2_w 531588060938694760
      // 80: invokestatic qeaa361f143ee4a0894bd168fd9b30c66/qf4ccf8f5435d4a78bdca4d6a018b578e/abbbaabb.aa (IJ)I
      // 83: if_icmpge 92
      // 86: goto 8a
      // 89: athrow
      // 8a: bipush 1
      // 8b: goto 8f
      // 8e: athrow
      // 8f: goto 93
      // 92: bipush 0
      // 93: ireturn
   }

   public abbbaabb() {
      int var1 = 1592830580;
      super(
         aabbaaaba.aaab(bb(b(-190071095, var1 ^ 430101200), b(-190071090, var1 ^ -764014369))),
         bbaabbba.bba,
         aabbaaaba.aaab(bb(b(-190071089, var1 ^ -1945990734), b(-190071092, var1 ^ 964603423)))
      );
      this.aaaa = (aaabbbab)this.abbbaaa(
         new aaabbbab(
               aabbaaaba.aaab(bb(b(-190071091, var1 ^ -866748805), b(-190071086, var1 ^ -704354014))),
               0.0,
               0.0,
               0.0,
               500.0,
               5.0
            )
            .bbb(aabbaaaba.aaab(bb(b(-190071085, var1 ^ -1330055340), b(-190071088, var1 ^ 2041044016))))
      );
      this.bb = (abbaaaaa)this.abbbaaa(
         new abbaaaaa(
            aabbaaaba.aaab(bb(b(-190071087, var1 ^ -1677762250), b(-190071082, var1 ^ 1846220560))), true
         )
      );
      this.ba = (bababa)this.abbbaaa(
         new bababa(
            aabbaaaba.aaab(bb(b(-190071081, var1 ^ 1822535136), b(-190071084, var1 ^ 1339328513))), 1.0, 1.0, 9.0, 1.0
         )
      );
      this.baa = -1;
      this.aaa = -1;
   }

   private void ba() {
      this.aaa = -1;
      this.aba = 0;
      this.aab = 0L;
      this.bba = 0L;
   }

   private static String bb(int var0, int var1) {
      int var9 = -248027963;
      int var2 = (var0 ^ b(-190071083, var9 ^ 431774919)) & b(-190071078, var9 ^ 1134792576);
      if (abb[var2] == null) {
         char[] var3 = bab[var2].toCharArray();

         int var4 = switch (var3[0] & b(-190071077, var9 ^ 925733230)) {
            case 0 -> b(-190071080, var9 ^ 1677569296);
            case 1 -> b(-190071079, var9 ^ 1556666991);
            case 2 -> b(-190071074, var9 ^ 1482447136);
            case 3 -> b(-190071073, var9 ^ -194121841);
            case 4 -> b(-190071076, var9 ^ 596138972);
            case 5 -> b(-190071075, var9 ^ 1603469726);
            case 6 -> b(-190071134, var9 ^ 221291037);
            case 7 -> b(-190071133, var9 ^ -545666975);
            case 8 -> b(-190071136, var9 ^ 1871871208);
            case 9 -> b(-190071135, var9 ^ 485499920);
            case 10 -> b(-190071130, var9 ^ 1272949794);
            case 11 -> b(-190071129, var9 ^ 2093898914);
            case 12 -> b(-190071132, var9 ^ -402710765);
            case 13 -> b(-190071131, var9 ^ -706970024);
            case 14 -> b(-190071126, var9 ^ 815677986);
            case 15 -> b(-190071125, var9 ^ 583843497);
            case 16 -> b(-190071128, var9 ^ 1837506300);
            case 17 -> b(-190071127, var9 ^ 1899152126);
            case 18 -> b(-190071122, var9 ^ 1633669762);
            case 19 -> b(-190071121, var9 ^ -1805703285);
            case 20 -> b(-190071124, var9 ^ -1923037898);
            case 21 -> b(-190071123, var9 ^ -1238027053);
            case 22 -> b(-190071118, var9 ^ -1937238921);
            case 23 -> b(-190071117, var9 ^ -1200592063);
            case 24 -> b(-190071120, var9 ^ 137165774);
            case 25 -> b(-190071119, var9 ^ 787823378);
            case 26 -> b(-190071114, var9 ^ 2043182482);
            case 27 -> b(-190071113, var9 ^ 921916656);
            case 28 -> b(-190071116, var9 ^ 1327394854);
            case 29 -> b(-190071115, var9 ^ -1666745849);
            case 30 -> b(-190071110, var9 ^ -24774312);
            case 31 -> b(-190071109, var9 ^ 701937937);
            case 32 -> b(-190071112, var9 ^ 623824686);
            case 33 -> b(-190071111, var9 ^ -1704511769);
            case 34 -> b(-190071106, var9 ^ 1690421843);
            case 35 -> b(-190071105, var9 ^ 965571438);
            case 36 -> b(-190071108, var9 ^ -419889969);
            case 37 -> b(-190071107, var9 ^ -103241089);
            case 38 -> b(-190071166, var9 ^ -95857165);
            case 39 -> b(-190071165, var9 ^ 2086278517);
            case 40 -> b(-190071168, var9 ^ -319682545);
            case 41 -> b(-190071167, var9 ^ 1041338989);
            case 42 -> b(-190071162, var9 ^ 857826635);
            case 43 -> b(-190071161, var9 ^ 2118302997);
            case 44 -> b(-190071164, var9 ^ 204567270);
            case 45 -> 3;
            case 46 -> b(-190071163, var9 ^ 1552538940);
            case 47 -> b(-190071158, var9 ^ 227751863);
            case 48 -> b(-190071157, var9 ^ -1240079497);
            case 49 -> b(-190071160, var9 ^ 1827104967);
            case 50 -> b(-190071159, var9 ^ -1346620329);
            case 51 -> b(-190071154, var9 ^ -1773760003);
            case 52 -> b(-190071153, var9 ^ 1575974124);
            case 53 -> b(-190071156, var9 ^ 1223167398);
            case 54 -> b(-190071155, var9 ^ -671632364);
            case 55 -> b(-190071150, var9 ^ -739960884);
            case 56 -> b(-190071149, var9 ^ -1444029257);
            case 57 -> b(-190071152, var9 ^ -522565987);
            case 58 -> b(-190071151, var9 ^ 1289173635);
            case 59 -> b(-190071146, var9 ^ 389273058);
            case 60 -> b(-190071145, var9 ^ 1994266487);
            case 61 -> b(-190071148, var9 ^ -1479207310);
            case 62 -> b(-190071147, var9 ^ -998182865);
            case 63 -> b(-190071142, var9 ^ -1343302764);
            case 64 -> b(-190071141, var9 ^ 414404088);
            case 65 -> b(-190071144, var9 ^ -37334376);
            case 66 -> b(-190071143, var9 ^ -1720764947);
            case 67 -> b(-190071138, var9 ^ 2086103788);
            case 68 -> b(-190071137, var9 ^ -1151215813);
            case 69 -> b(-190071140, var9 ^ -627130834);
            case 70 -> b(-190071139, var9 ^ 704254982);
            case 71 -> b(-190071198, var9 ^ -1386673066);
            case 72 -> b(-190071197, var9 ^ 1047943669);
            case 73 -> b(-190071200, var9 ^ -838328169);
            case 74 -> b(-190071199, var9 ^ 131216733);
            case 75 -> b(-190071194, var9 ^ 443593437);
            case 76 -> b(-190071193, var9 ^ 1081560059);
            case 77 -> b(-190071196, var9 ^ -1413095098);
            case 78 -> b(-190071195, var9 ^ 1484270203);
            case 79 -> b(-190071190, var9 ^ 712351736);
            case 80 -> b(-190071189, var9 ^ 467046422);
            case 81 -> b(-190071192, var9 ^ 27873158);
            case 82 -> b(-190071191, var9 ^ -964750974);
            case 83 -> b(-190071186, var9 ^ 562096411);
            case 84 -> b(-190071185, var9 ^ -827183728);
            case 85 -> b(-190071188, var9 ^ -48771935);
            case 86 -> 0;
            case 87 -> b(-190071187, var9 ^ 1152897028);
            case 88 -> b(-190071182, var9 ^ -764930018);
            case 89 -> b(-190071181, var9 ^ 795444176);
            case 90 -> b(-190071184, var9 ^ 364878711);
            case 91 -> b(-190071183, var9 ^ -1182504119);
            case 92 -> b(-190071178, var9 ^ -447135143);
            case 93 -> b(-190071177, var9 ^ 1169398610);
            case 94 -> b(-190071180, var9 ^ -935254217);
            case 95 -> b(-190071179, var9 ^ 691578393);
            case 96 -> b(-190071174, var9 ^ -371943625);
            case 97 -> b(-190071173, var9 ^ 129251488);
            case 98 -> b(-190071176, var9 ^ 860730924);
            case 99 -> b(-190071175, var9 ^ 1411783697);
            case 100 -> b(-190071170, var9 ^ -2122746572);
            case 101 -> b(-190071169, var9 ^ -891704659);
            case 102 -> b(-190071172, var9 ^ -1792102766);
            case 103 -> b(-190071171, var9 ^ 755184011);
            case 104 -> b(-190071230, var9 ^ 772203872);
            case 105 -> b(-190071229, var9 ^ 722786153);
            case 106 -> b(-190071232, var9 ^ 1632867011);
            case 107 -> b(-190071231, var9 ^ 602190237);
            case 108 -> b(-190071226, var9 ^ -1178020039);
            case 109 -> b(-190071225, var9 ^ 1376237018);
            case 110 -> b(-190071228, var9 ^ -2088700136);
            case 111 -> b(-190071227, var9 ^ -1575727175);
            case 112 -> b(-190071222, var9 ^ -1980760494);
            case 113 -> b(-190071221, var9 ^ 1152346250);
            case 114 -> b(-190071224, var9 ^ 1621413440);
            case 115 -> b(-190071223, var9 ^ -1575918632);
            case 116 -> b(-190071218, var9 ^ -531184193);
            case 117 -> b(-190071217, var9 ^ -40170155);
            case 118 -> b(-190071220, var9 ^ 336497119);
            case 119 -> b(-190071219, var9 ^ 1634064682);
            case 120 -> b(-190071214, var9 ^ 1332748792);
            case 121 -> b(-190071213, var9 ^ 304542329);
            case 122 -> b(-190071216, var9 ^ -1644868853);
            case 123 -> b(-190071215, var9 ^ 1095426634);
            case 124 -> 2;
            case 125 -> b(-190071210, var9 ^ -1496065838);
            case 126 -> b(-190071209, var9 ^ -1027995779);
            case 127 -> b(-190071212, var9 ^ -1282576825);
            case 128 -> b(-190071211, var9 ^ -1537639117);
            case 129 -> b(-190071206, var9 ^ 1188110879);
            case 130 -> b(-190071205, var9 ^ 1726798184);
            case 131 -> b(-190071208, var9 ^ -693842850);
            case 132 -> b(-190071207, var9 ^ 733994800);
            case 133 -> b(-190071202, var9 ^ -1586852878);
            case 134 -> b(-190071201, var9 ^ -1963014900);
            case 135 -> b(-190071204, var9 ^ -1389354265);
            case 136 -> b(-190071203, var9 ^ -1206940042);
            case 137 -> b(-190071262, var9 ^ 1503544271);
            case 138 -> b(-190071261, var9 ^ 1575473495);
            case 139 -> b(-190071264, var9 ^ -1532134452);
            case 140 -> b(-190071263, var9 ^ -450200476);
            case 141 -> b(-190071258, var9 ^ 1964235604);
            case 142 -> b(-190071257, var9 ^ 145408706);
            case 143 -> b(-190071260, var9 ^ 367640508);
            case 144 -> b(-190071259, var9 ^ -1032901965);
            case 145 -> b(-190071254, var9 ^ 1292205704);
            case 146 -> b(-190071253, var9 ^ -1755231827);
            case 147 -> b(-190071256, var9 ^ -1582092076);
            case 148 -> b(-190071255, var9 ^ -489779834);
            case 149 -> b(-190071250, var9 ^ -1452099797);
            case 150 -> b(-190071249, var9 ^ -72761680);
            case 151 -> b(-190071252, var9 ^ -1531932887);
            case 152 -> b(-190071251, var9 ^ 1443107217);
            case 153 -> b(-190071246, var9 ^ -1183569357);
            case 154 -> b(-190071245, var9 ^ 204276373);
            case 155 -> b(-190071248, var9 ^ -1303989953);
            case 156 -> b(-190071247, var9 ^ 199088820);
            case 157 -> b(-190071242, var9 ^ 1159422173);
            case 158 -> b(-190071241, var9 ^ 1488900213);
            case 159 -> b(-190071244, var9 ^ -1661062759);
            case 160 -> b(-190071243, var9 ^ 976653306);
            case 161 -> b(-190071238, var9 ^ 237355515);
            case 162 -> b(-190071237, var9 ^ -1446261373);
            case 163 -> b(-190071240, var9 ^ -565558384);
            case 164 -> b(-190071239, var9 ^ 674436208);
            case 165 -> b(-190071234, var9 ^ -1320644425);
            case 166 -> b(-190071233, var9 ^ -1221798600);
            case 167 -> b(-190071236, var9 ^ -607579526);
            case 168 -> b(-190071235, var9 ^ 1192410457);
            case 169 -> b(-190071294, var9 ^ 526328120);
            case 170 -> b(-190071293, var9 ^ 1075878204);
            case 171 -> b(-190071296, var9 ^ -1291054496);
            case 172 -> b(-190071295, var9 ^ 484013277);
            case 173 -> b(-190071290, var9 ^ 1858435131);
            case 174 -> b(-190071289, var9 ^ -1124541952);
            case 175 -> b(-190071292, var9 ^ 1278553656);
            case 176 -> b(-190071291, var9 ^ 1340662282);
            case 177 -> b(-190071286, var9 ^ 1076317638);
            case 178 -> b(-190071285, var9 ^ 457546588);
            case 179 -> b(-190071288, var9 ^ 1591813204);
            case 180 -> b(-190071287, var9 ^ 2036189803);
            case 181 -> b(-190071282, var9 ^ -1702544858);
            case 182 -> b(-190071281, var9 ^ 1293625234);
            case 183 -> b(-190071284, var9 ^ -770200863);
            case 184 -> b(-190071283, var9 ^ 1849992862);
            case 185 -> b(-190071278, var9 ^ 192361483);
            case 186 -> b(-190071277, var9 ^ 31791230);
            case 187 -> b(-190071280, var9 ^ 898845943);
            case 188 -> b(-190071279, var9 ^ 209006087);
            case 189 -> b(-190071274, var9 ^ 1840962630);
            case 190 -> b(-190071273, var9 ^ -715622024);
            case 191 -> b(-190071276, var9 ^ 604935113);
            case 192 -> b(-190071275, var9 ^ 604812387);
            case 193 -> b(-190071270, var9 ^ -908178922);
            case 194 -> b(-190071269, var9 ^ -2048796626);
            case 195 -> b(-190071272, var9 ^ -541804757);
            case 196 -> b(-190071271, var9 ^ 1371902081);
            case 197 -> b(-190071266, var9 ^ 296173948);
            case 198 -> b(-190071265, var9 ^ 1771431300);
            case 199 -> b(-190071268, var9 ^ -1851027227);
            case 200 -> b(-190071267, var9 ^ -1664603927);
            case 201 -> b(-190070814, var9 ^ 1063919531);
            case 202 -> b(-190070813, var9 ^ -1515706135);
            case 203 -> b(-190070816, var9 ^ -1289525257);
            case 204 -> b(-190070815, var9 ^ -1849105236);
            case 205 -> b(-190070810, var9 ^ -1645015599);
            case 206 -> b(-190070809, var9 ^ -1457185536);
            case 207 -> b(-190070812, var9 ^ 1031872562);
            case 208 -> b(-190070811, var9 ^ 197206094);
            case 209 -> b(-190070806, var9 ^ -1205288108);
            case 210 -> b(-190070805, var9 ^ 1283143043);
            case 211 -> b(-190070808, var9 ^ 1599185411);
            case 212 -> b(-190070807, var9 ^ -524589148);
            case 213 -> b(-190070802, var9 ^ -299467241);
            case 214 -> b(-190070801, var9 ^ 238579267);
            case 215 -> b(-190070804, var9 ^ -804792171);
            case 216 -> b(-190070803, var9 ^ 1121680700);
            case 217 -> b(-190070798, var9 ^ -618704393);
            case 218 -> b(-190070797, var9 ^ -1015596880);
            case 219 -> b(-190070800, var9 ^ 1760010332);
            case 220 -> b(-190070799, var9 ^ 607889449);
            case 221 -> b(-190070794, var9 ^ -903502207);
            case 222 -> b(-190070793, var9 ^ 2098624507);
            case 223 -> b(-190070796, var9 ^ -1103732046);
            case 224 -> b(-190070795, var9 ^ 622622714);
            case 225 -> b(-190070790, var9 ^ -1102760607);
            case 226 -> b(-190070789, var9 ^ 1685018851);
            case 227 -> b(-190070792, var9 ^ -71448752);
            case 228 -> b(-190070791, var9 ^ -2112067517);
            case 229 -> b(-190070786, var9 ^ -1809879613);
            case 230 -> b(-190070785, var9 ^ -468839741);
            case 231 -> 4;
            case 232 -> 1;
            case 233 -> b(-190070788, var9 ^ -1170480042);
            case 234 -> b(-190070787, var9 ^ 2010209132);
            case 235 -> b(-190070846, var9 ^ -1275540817);
            case 236 -> b(-190070845, var9 ^ 2123979796);
            case 237 -> b(-190070848, var9 ^ 177069667);
            case 238 -> b(-190070847, var9 ^ -230096616);
            case 239 -> 5;
            case 240 -> b(-190070842, var9 ^ -1901148971);
            case 241 -> b(-190070841, var9 ^ -337819480);
            case 242 -> b(-190070844, var9 ^ 1967836001);
            case 243 -> b(-190070843, var9 ^ -1252683742);
            case 244 -> b(-190070838, var9 ^ 1088074550);
            case 245 -> b(-190070837, var9 ^ -611147219);
            case 246 -> b(-190070840, var9 ^ -2128482819);
            case 247 -> b(-190070839, var9 ^ 1345031098);
            case 248 -> b(-190070834, var9 ^ 2134493235);
            case 249 -> b(-190070833, var9 ^ -2121960720);
            case 250 -> b(-190070836, var9 ^ -1760865995);
            case 251 -> b(-190070835, var9 ^ 1318219528);
            case 252 -> b(-190070830, var9 ^ -216988552);
            case 253 -> b(-190070829, var9 ^ -416328097);
            case 254 -> b(-190070832, var9 ^ -1282995825);
            default -> b(-190070831, var9 ^ 1846254182);
         };
         int var5 = (var1 & b(-190070826, var9 ^ -1024545754)) - var4;
         if (var5 < 0) {
            var5 += 256;
         }

         int var6 = ((var1 & b(-190070825, var9 ^ -761939516)) >>> b(-190070828, var9 ^ 446643232)) - var4;
         if (var6 < 0) {
            var6 += 256;
         }

         for (int var7 = 0; var7 < var3.length; var7++) {
            int var8 = var7 % 2;
            char var10002 = var3[var7];
            if (var8 == 0) {
               var3[var7] = (char)(var10002 ^ var5);
               var5 = ((var5 >>> 3 | var5 << 5) ^ var3[var7]) & b(-190070827, var9 ^ -460130056);
            } else {
               var3[var7] = (char)(var10002 ^ var6);
               var6 = ((var6 >>> 3 | var6 << 5) ^ var3[var7]) & b(-190070822, var9 ^ 788079500);
            }
         }

         abb[var2] = new String(var3).intern();
      }

      return abb[var2];
   }

   @Override
   public void bbaabb(class_310 var1) {
      this.aab(var1);
   }

   private long aaa() {
      // $VF: Couldn't be decompiled
      // Please report this to the Vineflower issue tracker, at https://github.com/Vineflower/vineflower/issues with a copy of the class file (if you have the rights to distribute it!)
      // java.lang.RuntimeException: parsing failure!
      //   at org.jetbrains.java.decompiler.modules.decompiler.decompose.DomHelper.parseGraph(DomHelper.java:211)
      //   at org.jetbrains.java.decompiler.main.rels.MethodProcessor.codeToJava(MethodProcessor.java:166)
      //
      // Bytecode:
      // 00: aload 0
      // 01: getfield qeaa361f143ee4a0894bd168fd9b30c66/qf4ccf8f5435d4a78bdca4d6a018b578e/abbbaabb.aaaa Lqeaa361f143ee4a0894bd168fd9b30c66/qf4ccf8f5435d4a78bdca4d6a018b578e/aaabbbab;
      // 04: invokevirtual qeaa361f143ee4a0894bd168fd9b30c66/qf4ccf8f5435d4a78bdca4d6a018b578e/aaabbbab.bab ()D
      // 07: dstore 2
      // 08: getstatic qeaa361f143ee4a0894bd168fd9b30c66/qf4ccf8f5435d4a78bdca4d6a018b578e/baaabbaa.bba I
      // 0b: aload 0
      // 0c: getfield qeaa361f143ee4a0894bd168fd9b30c66/qf4ccf8f5435d4a78bdca4d6a018b578e/abbbaabb.aaaa Lqeaa361f143ee4a0894bd168fd9b30c66/qf4ccf8f5435d4a78bdca4d6a018b578e/aaabbbab;
      // 0f: invokevirtual qeaa361f143ee4a0894bd168fd9b30c66/qf4ccf8f5435d4a78bdca4d6a018b578e/aaabbbab.abb ()D
      // 12: dstore 4
      // 14: istore 1
      // 15: dload 4
      // 17: iload 1
      // 18: ifne 39
      // 1b: dload 2
      // 1c: dcmpg
      // 1d: ifgt 2c
      // 20: goto 24
      // 23: athrow
      // 24: dconst_0
      // 25: dload 2
      // 26: invokestatic java/lang/Math.max (DD)D
      // 29: d2l
      // 2a: lreturn
      // 2b: athrow
      // 2c: dload 2
      // 2d: invokestatic java/util/concurrent/ThreadLocalRandom.current ()Ljava/util/concurrent/ThreadLocalRandom;
      // 30: invokevirtual java/util/concurrent/ThreadLocalRandom.nextDouble ()D
      // 33: dload 4
      // 35: dload 2
      // 36: dsub
      // 37: dmul
      // 38: dadd
      // 39: d2l
      // 3a: lreturn
   }

   private static long a(int var0, long var1) {
      int var3 = (var0 ^ (int)var1 ^ b(-190070821, 158879374 ^ 360031517)) & b(-190070824, 158879374 ^ 1892927692);
      if (aaab[var3] == null) {
         aaab[var3] = bbb[var3] ^ var1;
      }

      return aaab[var3];
   }

   private void aab(class_310 param1) {
      // $VF: Couldn't be decompiled
      // Please report this to the Vineflower issue tracker, at https://github.com/Vineflower/vineflower/issues with a copy of the class file (if you have the rights to distribute it!)
      // java.lang.RuntimeException: parsing failure!
      //   at org.jetbrains.java.decompiler.modules.decompiler.decompose.DomHelper.parseGraph(DomHelper.java:211)
      //   at org.jetbrains.java.decompiler.main.rels.MethodProcessor.codeToJava(MethodProcessor.java:166)
      //
      // Bytecode:
      // 000: getstatic qeaa361f143ee4a0894bd168fd9b30c66/qf4ccf8f5435d4a78bdca4d6a018b578e/baaabbaa.bba I
      // 003: istore 2
      // 004: aload 1
      // 005: iload 2
      // 006: ifne 011
      // 009: ifnull 056
      // 00c: goto 010
      // 00f: athrow
      // 010: aload 1
      // 011: iload 2
      // 012: ifne 024
      // 015: getfield net/minecraft/class_310.field_1724 Lnet/minecraft/class_746;
      // 018: ifnull 056
      // 01b: goto 01f
      // 01e: athrow
      // 01f: aload 1
      // 020: goto 024
      // 023: athrow
      // 024: iload 2
      // 025: ifne 037
      // 028: getfield net/minecraft/class_310.field_1761 Lnet/minecraft/class_636;
      // 02b: ifnull 056
      // 02e: goto 032
      // 031: athrow
      // 032: aload 1
      // 033: goto 037
      // 036: athrow
      // 037: getfield net/minecraft/class_310.field_1755 Lnet/minecraft/class_437;
      // 03a: astore 4
      // 03c: iload 2
      // 03d: ifne 05e
      // 040: aload 4
      // 042: instanceof net/minecraft/class_465
      // 045: ifeq 056
      // 048: goto 04c
      // 04b: athrow
      // 04c: aload 4
      // 04e: checkcast net/minecraft/class_465
      // 051: astore 3
      // 052: iload 2
      // 053: ifeq 05f
      // 056: aload 0
      // 057: invokevirtual qeaa361f143ee4a0894bd168fd9b30c66/qf4ccf8f5435d4a78bdca4d6a018b578e/abbbaabb.ba ()V
      // 05a: goto 05e
      // 05d: athrow
      // 05e: return
      // 05f: aload 3
      // 060: invokevirtual net/minecraft/class_465.method_17577 ()Lnet/minecraft/class_1703;
      // 063: astore 4
      // 065: aload 4
      // 067: iload 2
      // 068: ifne 074
      // 06b: ifnull 07d
      // 06e: goto 072
      // 071: athrow
      // 072: aload 4
      // 074: invokevirtual net/minecraft/class_1703.method_34255 ()Lnet/minecraft/class_1799;
      // 077: invokevirtual net/minecraft/class_1799.method_7960 ()Z
      // 07a: ifne 07f
      // 07d: return
      // 07e: athrow
      // 07f: aload 3
      // 080: checkcast qeaa361f143ee4a0894bd168fd9b30c66/q9fca77a8c4f94f01ae294010b0bee919/aabab
      // 083: invokeinterface qeaa361f143ee4a0894bd168fd9b30c66/q9fca77a8c4f94f01ae294010b0bee919/aabab.wq_fbb2be ()Lnet/minecraft/class_1735; 1
      // 088: astore 5
      // 08a: iload 2
      // 08b: ifne 0dd
      // 08e: aload 5
      // 090: ifnull 0d5
      // 093: goto 097
      // 096: athrow
      // 097: aload 5
      // 099: iload 2
      // 09a: ifne 0b5
      // 09d: goto 0a1
      // 0a0: athrow
      // 0a1: getfield net/minecraft/class_1735.field_7874 I
      // 0a4: iflt 0d5
      // 0a7: goto 0ab
      // 0aa: athrow
      // 0ab: aload 5
      // 0ad: iload 2
      // 0ae: ifne 0c1
      // 0b1: goto 0b5
      // 0b4: athrow
      // 0b5: invokevirtual net/minecraft/class_1735.method_7681 ()Z
      // 0b8: ifeq 0d5
      // 0bb: aload 5
      // 0bd: goto 0c1
      // 0c0: athrow
      // 0c1: invokevirtual net/minecraft/class_1735.method_7677 ()Lnet/minecraft/class_1799;
      // 0c4: getstatic net/minecraft/class_1802.field_8288 Lnet/minecraft/class_1792;
      // 0c7: iload 2
      // 0c8: ifne 0e8
      // 0cb: invokevirtual net/minecraft/class_1799.method_31574 (Lnet/minecraft/class_1792;)Z
      // 0ce: ifne 0de
      // 0d1: goto 0d5
      // 0d4: athrow
      // 0d5: aload 0
      // 0d6: invokevirtual qeaa361f143ee4a0894bd168fd9b30c66/qf4ccf8f5435d4a78bdca4d6a018b578e/abbbaabb.ba ()V
      // 0d9: goto 0dd
      // 0dc: athrow
      // 0dd: return
      // 0de: aload 1
      // 0df: getfield net/minecraft/class_310.field_1724 Lnet/minecraft/class_746;
      // 0e2: invokevirtual net/minecraft/class_746.method_6079 ()Lnet/minecraft/class_1799;
      // 0e5: getstatic net/minecraft/class_1802.field_8288 Lnet/minecraft/class_1792;
      // 0e8: invokevirtual net/minecraft/class_1799.method_31574 (Lnet/minecraft/class_1792;)Z
      // 0eb: istore 6
      // 0ed: bipush -1
      // 0ee: istore 7
      // 0f0: iload 6
      // 0f2: iload 2
      // 0f3: ifne 127
      // 0f6: ifne 116
      // 0f9: goto 0fd
      // 0fc: athrow
      // 0fd: ldc_w -190070823
      // 100: ldc_w 1849604877
      // 103: ldc_w 484608272
      // 106: ixor
      // 107: invokestatic qeaa361f143ee4a0894bd168fd9b30c66/qf4ccf8f5435d4a78bdca4d6a018b578e/abbbaabb.b (II)I
      // 10a: ldc2_w 1293871725150583173
      // 10d: invokestatic qeaa361f143ee4a0894bd168fd9b30c66/qf4ccf8f5435d4a78bdca4d6a018b578e/abbbaabb.aa (IJ)I
      // 110: istore 7
      // 112: iload 2
      // 113: ifeq 1e1
      // 116: aload 0
      // 117: getfield qeaa361f143ee4a0894bd168fd9b30c66/qf4ccf8f5435d4a78bdca4d6a018b578e/abbbaabb.bb Lqeaa361f143ee4a0894bd168fd9b30c66/qf4ccf8f5435d4a78bdca4d6a018b578e/abbaaaaa;
      // 11a: invokevirtual qeaa361f143ee4a0894bd168fd9b30c66/qf4ccf8f5435d4a78bdca4d6a018b578e/abbaaaaa.abbb ()Ljava/lang/Object;
      // 11d: checkcast java/lang/Boolean
      // 120: invokevirtual java/lang/Boolean.booleanValue ()Z
      // 123: goto 127
      // 126: athrow
      // 127: iload 2
      // 128: ifne 1e3
      // 12b: ifeq 1e1
      // 12e: goto 132
      // 131: athrow
      // 132: aload 0
      // 133: aload 1
      // 134: aload 5
      // 136: invokevirtual qeaa361f143ee4a0894bd168fd9b30c66/qf4ccf8f5435d4a78bdca4d6a018b578e/abbbaabb.ab (Lnet/minecraft/class_310;Lnet/minecraft/class_1735;)Z
      // 139: iload 2
      // 13a: ifne 1e3
      // 13d: goto 141
      // 140: athrow
      // 141: ifeq 1e1
      // 144: goto 148
      // 147: athrow
      // 148: aload 0
      // 149: getfield qeaa361f143ee4a0894bd168fd9b30c66/qf4ccf8f5435d4a78bdca4d6a018b578e/abbbaabb.ba Lqeaa361f143ee4a0894bd168fd9b30c66/qf4ccf8f5435d4a78bdca4d6a018b578e/bababa;
      // 14c: invokevirtual qeaa361f143ee4a0894bd168fd9b30c66/qf4ccf8f5435d4a78bdca4d6a018b578e/bababa.abbb ()Ljava/lang/Object;
      // 14f: checkcast java/lang/Double
      // 152: invokevirtual java/lang/Double.doubleValue ()D
      // 155: invokestatic java/lang/Math.round (D)J
      // 158: l2i
      // 159: bipush 1
      // 15a: iload 2
      // 15b: ifne 1e4
      // 15e: goto 162
      // 161: athrow
      // 162: isub
      // 163: istore 8
      // 165: iload 8
      // 167: iflt 1e1
      // 16a: iload 8
      // 16c: iload 2
      // 16d: ifne 1e3
      // 170: goto 174
      // 173: athrow
      // 174: ldc_w -190070818
      // 177: ldc_w 1849604877
      // 17a: ldc_w -1608107987
      // 17d: ixor
      // 17e: invokestatic qeaa361f143ee4a0894bd168fd9b30c66/qf4ccf8f5435d4a78bdca4d6a018b578e/abbbaabb.b (II)I
      // 181: ldc2_w 4749066248948972155
      // 184: invokestatic qeaa361f143ee4a0894bd168fd9b30c66/qf4ccf8f5435d4a78bdca4d6a018b578e/abbbaabb.aa (IJ)I
      // 187: if_icmpge 1e1
      // 18a: goto 18e
      // 18d: athrow
      // 18e: aload 1
      // 18f: getfield net/minecraft/class_310.field_1724 Lnet/minecraft/class_746;
      // 192: invokevirtual net/minecraft/class_746.method_31548 ()Lnet/minecraft/class_1661;
      // 195: iload 8
      // 197: invokevirtual net/minecraft/class_1661.method_5438 (I)Lnet/minecraft/class_1799;
      // 19a: astore 9
      // 19c: aload 9
      // 19e: invokevirtual net/minecraft/class_1799.method_7960 ()Z
      // 1a1: iload 2
      // 1a2: ifne 1e3
      // 1a5: ifeq 1e1
      // 1a8: goto 1ac
      // 1ab: athrow
      // 1ac: aload 5
      // 1ae: iload 2
      // 1af: ifne 1cd
      // 1b2: goto 1b6
      // 1b5: athrow
      // 1b6: getfield net/minecraft/class_1735.field_7871 Lnet/minecraft/class_1263;
      // 1b9: aload 1
      // 1ba: getfield net/minecraft/class_310.field_1724 Lnet/minecraft/class_746;
      // 1bd: invokevirtual net/minecraft/class_746.method_31548 ()Lnet/minecraft/class_1661;
      // 1c0: if_acmpne 1dd
      // 1c3: goto 1c7
      // 1c6: athrow
      // 1c7: aload 5
      // 1c9: goto 1cd
      // 1cc: athrow
      // 1cd: invokevirtual net/minecraft/class_1735.method_34266 ()I
      // 1d0: iload 2
      // 1d1: ifne 1e3
      // 1d4: iload 8
      // 1d6: if_icmpeq 1e1
      // 1d9: goto 1dd
      // 1dc: athrow
      // 1dd: iload 8
      // 1df: istore 7
      // 1e1: iload 7
      // 1e3: bipush -1
      // 1e4: if_icmpne 1ed
      // 1e7: aload 0
      // 1e8: invokevirtual qeaa361f143ee4a0894bd168fd9b30c66/qf4ccf8f5435d4a78bdca4d6a018b578e/abbbaabb.ba ()V
      // 1eb: return
      // 1ec: athrow
      // 1ed: invokestatic java/lang/System.currentTimeMillis ()J
      // 1f0: lstore 8
      // 1f2: iload 2
      // 1f3: ifne 226
      // 1f6: aload 5
      // 1f8: getfield net/minecraft/class_1735.field_7874 I
      // 1fb: aload 0
      // 1fc: getfield qeaa361f143ee4a0894bd168fd9b30c66/qf4ccf8f5435d4a78bdca4d6a018b578e/abbbaabb.aaa I
      // 1ff: if_icmpeq 22a
      // 202: goto 206
      // 205: athrow
      // 206: aload 0
      // 207: aload 5
      // 209: getfield net/minecraft/class_1735.field_7874 I
      // 20c: putfield qeaa361f143ee4a0894bd168fd9b30c66/qf4ccf8f5435d4a78bdca4d6a018b578e/abbbaabb.aaa I
      // 20f: aload 0
      // 210: bipush 1
      // 211: putfield qeaa361f143ee4a0894bd168fd9b30c66/qf4ccf8f5435d4a78bdca4d6a018b578e/abbbaabb.aba I
      // 214: aload 0
      // 215: lload 8
      // 217: putfield qeaa361f143ee4a0894bd168fd9b30c66/qf4ccf8f5435d4a78bdca4d6a018b578e/abbbaabb.aab J
      // 21a: aload 0
      // 21b: aload 0
      // 21c: invokevirtual qeaa361f143ee4a0894bd168fd9b30c66/qf4ccf8f5435d4a78bdca4d6a018b578e/abbbaabb.aaa ()J
      // 21f: putfield qeaa361f143ee4a0894bd168fd9b30c66/qf4ccf8f5435d4a78bdca4d6a018b578e/abbbaabb.bba J
      // 222: goto 226
      // 225: athrow
      // 226: iload 2
      // 227: ifeq 238
      // 22a: aload 0
      // 22b: dup
      // 22c: getfield qeaa361f143ee4a0894bd168fd9b30c66/qf4ccf8f5435d4a78bdca4d6a018b578e/abbbaabb.aba I
      // 22f: bipush 1
      // 230: iadd
      // 231: putfield qeaa361f143ee4a0894bd168fd9b30c66/qf4ccf8f5435d4a78bdca4d6a018b578e/abbbaabb.aba I
      // 234: goto 238
      // 237: athrow
      // 238: aload 0
      // 239: getfield qeaa361f143ee4a0894bd168fd9b30c66/qf4ccf8f5435d4a78bdca4d6a018b578e/abbbaabb.aba I
      // 23c: iload 2
      // 23d: ifne 258
      // 240: bipush 2
      // 241: if_icmplt 263
      // 244: goto 248
      // 247: athrow
      // 248: lload 8
      // 24a: aload 0
      // 24b: getfield qeaa361f143ee4a0894bd168fd9b30c66/qf4ccf8f5435d4a78bdca4d6a018b578e/abbbaabb.aab J
      // 24e: lsub
      // 24f: aload 0
      // 250: getfield qeaa361f143ee4a0894bd168fd9b30c66/qf4ccf8f5435d4a78bdca4d6a018b578e/abbbaabb.bba J
      // 253: lcmp
      // 254: goto 258
      // 257: athrow
      // 258: iload 2
      // 259: ifne 269
      // 25c: ifge 264
      // 25f: goto 263
      // 262: athrow
      // 263: return
      // 264: aload 5
      // 266: getfield net/minecraft/class_1735.field_7874 I
      // 269: iload 2
      // 26a: ifne 2b4
      // 26d: aload 0
      // 26e: getfield qeaa361f143ee4a0894bd168fd9b30c66/qf4ccf8f5435d4a78bdca4d6a018b578e/abbbaabb.baa I
      // 271: if_icmpne 2a8
      // 274: goto 278
      // 277: athrow
      // 278: lload 8
      // 27a: aload 0
      // 27b: getfield qeaa361f143ee4a0894bd168fd9b30c66/qf4ccf8f5435d4a78bdca4d6a018b578e/abbbaabb.ab J
      // 27e: lsub
      // 27f: ldc_w -190070817
      // 282: ldc_w 1849604877
      // 285: ldc_w -1657659736
      // 288: ixor
      // 289: invokestatic qeaa361f143ee4a0894bd168fd9b30c66/qf4ccf8f5435d4a78bdca4d6a018b578e/abbbaabb.b (II)I
      // 28c: ldc2_w 7842622919707658960
      // 28f: invokestatic qeaa361f143ee4a0894bd168fd9b30c66/qf4ccf8f5435d4a78bdca4d6a018b578e/abbbaabb.a (IJ)J
      // 292: aload 0
      // 293: getfield qeaa361f143ee4a0894bd168fd9b30c66/qf4ccf8f5435d4a78bdca4d6a018b578e/abbbaabb.bba J
      // 296: ladd
      // 297: lcmp
      // 298: iload 2
      // 299: ifne 2b4
      // 29c: goto 2a0
      // 29f: athrow
      // 2a0: ifge 2a8
      // 2a3: goto 2a7
      // 2a6: athrow
      // 2a7: return
      // 2a8: aload 1
      // 2a9: iload 2
      // 2aa: ifne 2b9
      // 2ad: invokestatic qeaa361f143ee4a0894bd168fd9b30c66/qf4ccf8f5435d4a78bdca4d6a018b578e/bbbbbbaa.abaa (Lnet/minecraft/class_310;)Z
      // 2b0: goto 2b4
      // 2b3: athrow
      // 2b4: ifne 2b8
      // 2b7: return
      // 2b8: aload 1
      // 2b9: getfield net/minecraft/class_310.field_1761 Lnet/minecraft/class_636;
      // 2bc: aload 4
      // 2be: getfield net/minecraft/class_1703.field_7763 I
      // 2c1: aload 5
      // 2c3: getfield net/minecraft/class_1735.field_7874 I
      // 2c6: iload 7
      // 2c8: getstatic net/minecraft/class_1713.field_7791 Lnet/minecraft/class_1713;
      // 2cb: aload 1
      // 2cc: getfield net/minecraft/class_310.field_1724 Lnet/minecraft/class_746;
      // 2cf: invokevirtual net/minecraft/class_636.method_2906 (IIILnet/minecraft/class_1713;Lnet/minecraft/class_1657;)V
      // 2d2: aload 0
      // 2d3: aload 5
      // 2d5: getfield net/minecraft/class_1735.field_7874 I
      // 2d8: putfield qeaa361f143ee4a0894bd168fd9b30c66/qf4ccf8f5435d4a78bdca4d6a018b578e/abbbaabb.baa I
      // 2db: aload 0
      // 2dc: lload 8
      // 2de: putfield qeaa361f143ee4a0894bd168fd9b30c66/qf4ccf8f5435d4a78bdca4d6a018b578e/abbbaabb.ab J
      // 2e1: return
   }
}
