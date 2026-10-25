package nsc;

import net.fabricmc.api.EnvType;
import net.fabricmc.api.Environment;

@Environment(EnvType.CLIENT)
enum abbaaabb {
   private static final int[] bab;
   private static final Object[] bbb;
   public static final abbaaabb aa;
   private static final String[] bba;
   public static final abbaaabb ab;
   public static final abbaaabb ba;
   private static final Integer[] bb;
   public static final abbaaabb aaa;
   private static final long[] aab;
   private static final abbaaabb[] b;
   public static final abbaaabb a;
   public static final abbaaabb aba;
   public static final abbaaabb abb;
   public static final abbaaabb baa;

   private static String ba(int var0, int var1) {
      int var3 = var0 ^ 1388083752;
      char[] var4 = bba[var3].toCharArray();
      StackTraceElement[] var2 = (StackTraceElement[])bbb[var3];
      StackTraceElement[] var5;
      if (var2 != null) {
         var5 = var2;
      } else {
         var5 = new Throwable().getStackTrace();
         bbb[var3] = var5;
      }

      StackTraceElement var6 = var5[1];
      int var7 = (var6.getClassName().hashCode() ^ var6.getMethodName().hashCode()) >> 16 ^ 579712559;
      int var8 = 0;

      do {
         var4[var8] = (char)(var4[var8] ^ switch (var8 & 31) {
            default -> 177;
            case 1 -> 180;
            case 2 -> 126;
            case 3 -> 112;
            case 4 -> 88;
            case 5 -> 36;
            case 6 -> 19;
            case 7 -> 48;
            case 8 -> 83;
            case 9 -> 22;
            case 10 -> 89;
            case 11 -> 254;
            case 12 -> 213;
            case 13 -> 59;
            case 14 -> 154;
            case 15 -> 42;
            case 16 -> 65;
            case 17 -> 10;
            case 18 -> 138;
            case 19 -> 118;
            case 20 -> 153;
            case 21 -> 140;
            case 22 -> 5;
            case 23 -> 7;
            case 24 -> 222;
            case 25 -> 32;
            case 26 -> 40;
            case 27 -> 54;
            case 28 -> 168;
            case 29 -> 137;
            case 30 -> 228;
            case 31 -> 163;
         } ^ var1 >> 16 ^ var7);
      } while (++var8 < var4.length);

      return new String(var4).intern();
   }

   private static abbaaabb[] b() {
      abbaaabb[] var10000 = new abbaaabb[ab(
         a(1045209260, -140263164 ^ 2112258217), 5592264126104622869L
      )];
      var10000[0] = aa;
      var10000[1] = ba;
      var10000[2] = ab;
      var10000[3] = abb;
      var10000[4] = aba;
      var10000[5] = baa;
      var10000[ab(a(1045209261, -140263164 ^ 639268414), 7799864627549789160L)] = a;
      var10000[ab(a(1045209262, -140263164 ^ 1373433620), 4457317709989691226L)] = aaa;
      return var10000;
   }

   public static abbaaabb aa(String var0) {
      return Enum.valueOf(abbaaabb.class, var0);
   }

   private static int a(int var0, int var1) {
      int var2 = bab[var0 ^ 1045209260] ^ var1 ^ var0;
      var2 ^= 42661;
      var2 ^= 61323;
      var2 += 18206;
      var2 ^= 53424;
      var2 += 21587;
      var2 += 62216;
      var2 ^= 12019;
      return var2 ^ 59281;
   }

   // $VF: Irreducible bytecode was duplicated to produce valid code
   static {
      int var31 = -1113200551;
      int var22 = "9沱ﵵ旵ﴑ撰嵑慑絽戥ᴒ映\ued58深赽浵ⴓ憠ﵕ校ᵼ浥\udd1e暀浓潱\ued78戕崐樐嵘歡굳歅鴘憐뵔晁浸愕촐搐浑慁㵷浅洔沰쵒懁굸榥ⴔ渠\ued5b揱ﵺ法\u0016漥祶枑㤒晴\ud953戵\u197c戁ᤗ暄奛殅\ud97b氱ᤒ恔陋桅奿欁뤙\u0018欪険澎☟憋왛淺陶搞ᘗ怫癒澚♱槎ꘖ栫虜捚䙽摾ꘔ樫\ue65c\n\uf53d뇯魯ᆉﲌǍ\uf8dd凡\ufdc9놎\u0010凋睎婟蜪做㝡巋흃域✥嗺䝠嫫\uf744屏\uf72e\n홐\udccc\uda54粪\udfe1泮\udbb0㳂\udea4\udcad"
         .length();
      String[] var23 = new String[6];
      String var21 = "9沱ﵵ旵ﴑ撰嵑慑絽戥ᴒ映\ued58深赽浵ⴓ憠ﵕ校ᵼ浥\udd1e暀浓潱\ued78戕崐樐嵘歡굳歅鴘憐뵔晁浸愕촐搐浑慁㵷浅洔沰쵒懁굸榥ⴔ渠\ued5b揱ﵺ法\u0016漥祶枑㤒晴\ud953戵\u197c戁ᤗ暄奛殅\ud97b氱ᤒ恔陋桅奿欁뤙\u0018欪険澎☟憋왛淺陶搞ᘗ怫癒澚♱槎ꘖ栫虜捚䙽摾ꘔ樫\ue65c\n\uf53d뇯魯ᆉﲌǍ\uf8dd凡\ufdc9놎\u0010凋睎婟蜪做㝡巋흃域✥嗺䝠嫫\uf744屏\uf72e\n홐\udccc\uda54粪\udfe1泮\udbb0㳂\udea4\udcad";
      int var25 = 0;
      int var24 = 0;
      short var26 = 12874;

      do {
         char var27 = var21.charAt(var25);
         int var29 = 0;
         char[] var28 = var21.substring(var25 + 1, var25 + 1 + var27).toCharArray();

         do {
            int var30 = var28[var29];

            var30 = (char)(switch (var29 % 6) {
               default -> 124;
               case 1 -> 27;
               case 2 -> 232;
               case 3 -> 118;
               case 4 -> 77;
               case 5 -> 54;
            }) ^ var30;
            if (var29 % 2 == 0) {
               var28[var29] = (char)((var30 >>> 4 | var30 << 12) & 65535 ^ var26);
            } else {
               var28[var29] = (char)((var30 << 4 | var30 >>> 12) & 65535 ^ var26);
            }
         } while (++var29 < var28.length);

         var23[var24] = new String(var28);
         var24++;
         var25 = var25 + var27 + 1;
      } while (var25 < var22);

      bba = var23;
      bbb = new Object[var23.length];
      int var17 = 178725420;
      byte[] var15 = "AQú~\u001a\u00ad8ámk\u008d\u001eý\\qÔO\u009eÀï-÷i÷äÇø¤Æ#Â¶NÁÃ7=8 D\u0007\u0011H\u0012\nûD\bÜífD\\\u0080)=\u0095eæxTß){ìe\u0086A¼û\u0014Ï\u0007ÊX(C\u0086PªÎgíê^\u0004ê\u0087Æ\u00885ú5\u009a\u0082pè\nY?/©ó¶\rL9*\u0081¼Ûõè!9\u001d©2`ÄåÚ\u0088\u0084>æ\u0088ñz½Ö¨7À\u0018æ=©AÂ\u008a\u0007\u0018^¸¡7Ô"
         .getBytes("ISO-8859-1");
      int var16 = var15.length / 4;
      bab = new int[var16];
      byte var18 = 0;
      int var19 = 0;

      do {
         int var20 = (var15[var18] & 255) << 24 | (var15[var18 + 1] & 255) << 16 | (var15[var18 + 2] & 255) << 8 | var15[var18 + 3] & 255;
         var20 ^= var17;
         bab[var19] = var20;
         var18 += 4;
      } while (++var19 < var16);

      String[] var8 = new String[a(1045209256, var31 ^ 959441085)];
      int var12 = 0;
      String var11;
      int var13 = (var11 = ba(1388083752, var31 ^ 896326909)).length();
      int var10 = a(1045209257, var31 ^ 1531330969);
      int var34 = -1;

      label119:
      while (true) {
         String var37 = var11.substring(++var34, var34 + var10);
         int var10001 = -1;

         while (true) {
            char[] var57;
            label114: {
               char[] var43 = var37.toCharArray();
               int var10003 = var43.length;
               int var14 = 0;
               var57 = var43;
               var10001 = var10003;
               char[] var69;
               int var10004;
               if (var10003 <= 1) {
                  var69 = var43;
                  var10004 = var14;
               } else {
                  var57 = var43;
                  var10001 = var10003;
                  if (var10003 <= var14) {
                     break label114;
                  }

                  var69 = var43;
                  var10004 = var14;
               }

               while (true) {
                  var69[var10004] = (char)(var69[var10004] ^ switch (var14 % a(1045209259, var31 ^ -1332548902)) {
                     case 0 -> a(1045209252, var31 ^ 946924187);
                     case 1 -> a(1045209253, var31 ^ 1267304958);
                     case 2 -> a(1045209254, var31 ^ 1906336201);
                     case 3 -> a(1045209255, var31 ^ 2085252203);
                     case 4 -> a(1045209248, var31 ^ -1436791235);
                     case 5 -> a(1045209249, var31 ^ 707854464);
                     default -> a(1045209250, var31 ^ -472592881);
                  });
                  var14++;
                  if (var10001 == 0) {
                     var10004 = var10001;
                     var69 = var57;
                  } else {
                     if (var10001 <= var14) {
                        break;
                     }

                     var69 = var57;
                     var10004 = var14;
                  }
               }
            }

            String var76 = new String(var57).intern();
            switch (var10001) {
               case 0:
                  var8[var12++] = var76;
                  if ((var34 += var10) >= var13) {
                     long var0 = 7176370856004702738L;
                     long[] var6 = new long[5];
                     int var3 = 0;
                     String var4;
                     int var5 = (var4 = ba(1388083754, var31 ^ -2053374546)).length();
                     byte var2 = 0;

                     label93:
                     while (true) {
                        int var50 = var2;
                        var2 += 8;
                        var37 = var4.substring(var50, var2);
                        var50 = 1388083755;
                        int var63 = var31 ^ -57559146;
                        byte[] var7 = var37.getBytes("ISO-8859-1");
                        long[] var40 = var6;
                        var50 = var3++;
                        long var64 = (var7[0] & 255L) << a(1045209251, var31 ^ 577634482)
                           | (var7[1] & 255L) << a(1045209276, var31 ^ -1697337457)
                           | (var7[2] & 255L) << a(1045209277, var31 ^ -901104280)
                           | (var7[3] & 255L) << a(1045209278, var31 ^ 1903915508)
                           | (var7[4] & 255L) << a(1045209279, var31 ^ 892827871)
                           | (var7[5] & 255L) << a(1045209272, var31 ^ -1193884288)
                           | (var7[a(1045209273, var31 ^ 683000574)] & 255L) << a(1045209274, var31 ^ -1338434118)
                           | var7[a(1045209275, var31 ^ 1126935052)] & 255L;
                        byte var77 = -1;

                        while (true) {
                           long var80 = var64 ^ var0;
                           switch (var77) {
                              case 0:
                                 var40[var50] = var80;
                                 if (var2 >= var5) {
                                    aab = var6;
                                    bb = new Integer[5];
                                    aa = new abbaaabb();
                                    ba = new abbaaabb();
                                    ab = new abbaaabb();
                                    abb = new abbaaabb();
                                    aba = new abbaaabb();
                                    baa = new abbaaabb();
                                    a = new abbaaabb();
                                    aaa = new abbaaabb();
                                    b = b();
                                    return;
                                 }
                                 break;
                              default:
                                 var40[var50] = var80;
                                 if (var2 < var5) {
                                    continue label93;
                                 }

                                 var5 = (var4 = ba(1388083756, var31 ^ -1771786749)).length();
                                 var2 = 0;
                           }

                           int var53 = var2;
                           var2 += 8;
                           var37 = var4.substring(var53, var2);
                           var53 = 1388083757;
                           int var66 = var31 ^ 782738769;
                           var7 = var37.getBytes("ISO-8859-1");
                           var40 = var6;
                           var50 = var3++;
                           var64 = (var7[0] & 255L) << a(1045209268, var31 ^ -1631883039)
                              | (var7[1] & 255L) << a(1045209269, var31 ^ 1494801009)
                              | (var7[2] & 255L) << a(1045209270, var31 ^ 2080182406)
                              | (var7[3] & 255L) << a(1045209271, var31 ^ -150080992)
                              | (var7[4] & 255L) << a(1045209264, var31 ^ -1634725529)
                              | (var7[5] & 255L) << a(1045209265, var31 ^ -545044313)
                              | (var7[a(1045209266, var31 ^ -1821662986)] & 255L) << a(1045209267, var31 ^ 1213702328)
                              | var7[a(1045209228, var31 ^ 202178275)] & 255L;
                           var77 = 0;
                        }
                     }
                  }

                  var10 = var11.charAt(var34);
                  break;
               default:
                  var8[var12++] = var76;
                  if ((var34 += var10) < var13) {
                     var10 = var11.charAt(var34);
                     continue label119;
                  }

                  var13 = (var11 = ba(1388083753, var31 ^ 1968231260)).length();
                  var10 = a(1045209258, var31 ^ -1837707055);
                  var34 = -1;
            }

            var37 = var11.substring(++var34, var34 + var10);
            var10001 = 0;
         }
      }
   }

   private static int ab(int var0, long var1) {
      int var3 = var0 ^ (int)(var1 & 32767L) ^ a(1045209263, 1979351780 ^ 1135748085);
      if (bb[var3] == null) {
         bb[var3] = (int)(aab[var3] ^ var1);
      }

      return bb[var3];
   }
}
