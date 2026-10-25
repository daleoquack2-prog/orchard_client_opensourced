package nsc;

import com.sun.jna.Library;
import com.sun.jna.Native;
import net.fabricmc.api.EnvType;
import net.fabricmc.api.Environment;

@Environment(EnvType.CLIENT)
interface aaabaaa extends Library {
   int aa;
   String ab;
   int ba;
   String[] b;
   long[] bb;
   long aaa;
   int aab;
   Integer[] aba;
   int abb;
   Object[] bba;
   int[] a;
   aaabaaa baa;
   String[] bab;

   private static String bb(short var0, int var1, char var2) {
      int var3 = var2 ^ '굛';
      char[] var4 = bab[var3].toCharArray();
      StackTraceElement[] var5 = (StackTraceElement[])bba[var3];
      StackTraceElement[] var6;
      if (var5 != null) {
         var6 = var5;
      } else {
         var6 = new Throwable().getStackTrace();
         bba[var3] = var6;
      }

      StackTraceElement var7 = var6[1];
      int var8 = (var7.getClassName().hashCode() ^ var7.getMethodName().hashCode()) >> 16 ^ 8147;
      int var9 = 0;

      do {
         int var10 = var4[var9] - 647;
         var10 -= 51149;
         var10 -= 15857;
         var10 ^= 5082;
         var10 ^= 20596;
         var10 ^= 45624;
         var10 -= 35487;
         var10 += 31187;
         var10 += 3013;
         var10 ^= 48041;
         var4[var9] = (char)(var10 ^ var8 ^ var0 ^ var1 >> 16);
      } while (++var9 < var4.length);

      return new String(var4).intern();
   }

   void b(int var1, int var2, int var3, int var4, int var5);

   // $VF: Irreducible bytecode was duplicated to produce valid code
   static {
      int var27 = 579611535;
      short var22 = 25126;
      String[] var19 = new String[5];
      int var21 = 0;
      int var20 = 0;
      int var18 = "\b↳ஆ䠁㰹\ue589\ue0e2᩷\ue08a(ᵌ昪＞嚤ጓ䛒\u243a繀Ȿ㛠⅌สⒾ庥ዓ䛑\u1afa噃Ⓘ離ﾌ︡✞ᚮ\u0a53ۓᅺ뙏⊞团\u19cc븫\u0a7e庤➓㻑\u171a繏ၞ컯\n稘挼硊鎧އ\udbd5ծ㍆۪珪\u0010额艀铯拃霂ꪷ邋ꨯ鉏슈ꜽ\ueabdꛯ\uf2c2鄢\uea4b\n茟⋂蕍퉇\uf880ᨪ葩犸蟭㈊"
         .length();
      String var17 = "\b↳ஆ䠁㰹\ue589\ue0e2᩷\ue08a(ᵌ昪＞嚤ጓ䛒\u243a繀Ȿ㛠⅌สⒾ庥ዓ䛑\u1afa噃Ⓘ離ﾌ︡✞ᚮ\u0a53ۓᅺ뙏⊞团\u19cc븫\u0a7e庤➓㻑\u171a繏ၞ컯\n稘挼硊鎧އ\udbd5ծ㍆۪珪\u0010额艀铯拃霂ꪷ邋ꨯ鉏슈ꜽ\ueabdꛯ\uf2c2鄢\uea4b\n茟⋂蕍퉇\uf880ᨪ葩犸蟭㈊";

      do {
         int var25 = 0;
         char var23 = var17.charAt(var21);
         char[] var24 = var17.substring(var21 + 1, var21 + 1 + var23).toCharArray();

         do {
            int var26 = var24[var25];

            var26 = (char)(switch (var25 % 5) {
               default -> 212;
               case 1 -> 34;
               case 2 -> 70;
               case 3 -> 166;
               case 4 -> 235;
            }) ^ var26;
            if (var25 % 2 == 0) {
               var24[var25] = (char)((var26 >>> 5 | var26 << 11) & 65535 ^ var22);
            } else {
               var24[var25] = (char)((var26 << 5 | var26 >>> 11) & 65535 ^ var22);
            }
         } while (++var25 < var24.length);

         var19[var20] = new String(var24);
         var20++;
         var21 = var21 + var23 + 1;
      } while (var21 < var18);

      bab = var19;
      bba = new Object[var19.length];
      int var13 = 1480448352;
      byte[] var11 = "¸44\u0095Ðï\u001e\u0005©Û¦_\u001dP5ÖÙ)aÁ§\u0006\u0000¢ÄÑvàè¤¤y\u0088Á\u009a\u000bý\u0002´ï\"UÕ\u000e¥6%nï\b÷E\u0012\fþ\u009cE§¶.§\nïÅª+w{\u0092C\u0095B×·»¹RÚ\u0001æâç\u000e-\u009b\u001d§¾÷\u0000 \u00156¬úc\u0098¡v=O0'g¦|'ì\u0087ßÇÑóüX3\u008aãü\bô>\"\nj`M\u0087Å\u0093%\u0098\tÌÏ]\u009f\u009c\u001a\u009e¹ß6\u000b"
         .getBytes("ISO-8859-1");
      int var12 = var11.length / 4;
      a = new int[var12];
      byte var14 = 0;
      int var15 = 0;

      do {
         int var16 = (var11[var14] & 255) << 24 | (var11[var14 + 1] & 255) << 16 | (var11[var14 + 2] & 255) << 8 | var11[var14 + 3] & 255;
         var16 ^= var13;
         a[var15] = var16;
         var14 += 4;
      } while (++var15 < var12);

      char[] var10001 = bb((short)'뢘', var27 ^ -989651656, '굛').toCharArray();
      int var10003 = var10001.length;
      int var10 = 0;
      char[] var67 = var10001;
      int var48 = var10003;
      char[] var83;
      int var10004;
      char var10005;
      int var10006;
      if (var10003 <= 1) {
         var83 = var10001;
         var10004 = var10;
         var10005 = var10001[var10];
         switch (var10 % a(-2136508216, var27 ^ 1109525582)) {
            case 0:
               var10006 = a(-2136508215, var27 ^ 720973462);
               break;
            case 1:
               var10006 = a(-2136508214, var27 ^ 1405982587);
               break;
            case 2:
               var10006 = a(-2136508213, var27 ^ -414841576);
               break;
            case 3:
               var10006 = a(-2136508212, var27 ^ 591352042);
               break;
            case 4:
               var10006 = a(-2136508211, var27 ^ 1561342000);
               break;
            case 5:
               var10006 = a(-2136508210, var27 ^ 1053247039);
               break;
            default:
               var10006 = a(-2136508209, var27 ^ 313693522);
         }
      } else {
         var67 = var10001;
         var48 = var10003;
         if (var10003 <= var10) {
            String var95 = new String(var10001).intern();
            byte var59 = -1;
            ab = var95;
            long var29 = 5978664530083837139L;
            long[] var34 = new long[a(-2136508224, var27 ^ 1926736600)];
            int var31 = 0;
            String var32;
            int var33 = (var32 = bb((short)'谂', var27 ^ -1668004491, '굚')).length();
            byte var30 = 0;

            label86:
            while (true) {
               byte var60 = var30;
               var30 += 8;
               String var43 = var32.substring(var60, var30);
               char var61 = 'ﺓ';
               int var76 = var27 ^ -1947834057;
               char var96 = '굙';
               byte[] var36 = var43.getBytes("ISO-8859-1");
               long[] var44 = var34;
               int var62 = var31++;
               long var77 = (var36[0] & 255L) << a(-2136508223, var27 ^ 118785472)
                  | (var36[1] & 255L) << a(-2136508222, var27 ^ -666638902)
                  | (var36[2] & 255L) << a(-2136508221, var27 ^ 1595938227)
                  | (var36[3] & 255L) << a(-2136508220, var27 ^ 354338743)
                  | (var36[4] & 255L) << a(-2136508219, var27 ^ -400896105)
                  | (var36[5] & 255L) << a(-2136508218, var27 ^ -1078884594)
                  | (var36[a(-2136508217, var27 ^ 1562173202)] & 255L) << a(-2136508200, var27 ^ 1346192989)
                  | var36[a(-2136508199, var27 ^ 1750443400)] & 255L;
               byte var97 = -1;

               while (true) {
                  long var103 = var77 ^ var29;
                  switch (var97) {
                     case 0:
                        var44[var62] = var103;
                        if (var30 >= var33) {
                           bb = var34;
                           aba = new Integer[a(-2136508205, var27 ^ 2110387985)];
                           ba = ba(a(-2136508204, var27 ^ 166366950), 5804807930993201679L);
                           aa = ba(a(-2136508203, var27 ^ 1895109892), 3661313425245757408L);
                           abb = ba(a(-2136508202, var27 ^ 237565635), 5212829434449055756L);
                           aab = ba(a(-2136508201, var27 ^ -1871306494), 7714185524738209888L);
                           long var28 = 9024765895949954174L;
                           long var80 = 9024765895950052778L ^ var28;
                           byte var65 = -1;
                           aaa = var80;
                           b = new String[1];
                           ab();
                           baa = (aaabaaa)Native.load(
                              aabbaaaba.abba(b[0]), aaabaaa.class
                           );
                           return;
                        }
                        break;
                     default:
                        var44[var62] = var103;
                        if (var30 < var33) {
                           continue label86;
                        }

                        var33 = (var32 = bb((short)'럻', var27 ^ 328941267, '굘')).length();
                        var30 = 0;
                  }

                  byte var63 = var30;
                  var30 += 8;
                  var43 = var32.substring(var63, var30);
                  short var64 = 7430;
                  int var79 = var27 ^ -736413200;
                  var96 = '굟';
                  var36 = var43.getBytes("ISO-8859-1");
                  var44 = var34;
                  var62 = var31++;
                  var77 = (var36[0] & 255L) << a(-2136508198, var27 ^ 765561485)
                     | (var36[1] & 255L) << a(-2136508197, var27 ^ -1463013061)
                     | (var36[2] & 255L) << a(-2136508196, var27 ^ 418463471)
                     | (var36[3] & 255L) << a(-2136508195, var27 ^ 1628149589)
                     | (var36[4] & 255L) << a(-2136508194, var27 ^ 219549957)
                     | (var36[5] & 255L) << a(-2136508193, var27 ^ -860173478)
                     | (var36[a(-2136508208, var27 ^ 1656178429)] & 255L) << a(-2136508207, var27 ^ -1255795128)
                     | var36[a(-2136508206, var27 ^ 1550456621)] & 255L;
                  var97 = 0;
               }
            }
         }

         var83 = var10001;
         var10004 = var10;
         var10005 = var10001[var10];
         switch (var10 % a(-2136508216, var27 ^ 1109525582)) {
            case 0:
               var10006 = a(-2136508215, var27 ^ 720973462);
               break;
            case 1:
               var10006 = a(-2136508214, var27 ^ 1405982587);
               break;
            case 2:
               var10006 = a(-2136508213, var27 ^ -414841576);
               break;
            case 3:
               var10006 = a(-2136508212, var27 ^ 591352042);
               break;
            case 4:
               var10006 = a(-2136508211, var27 ^ 1561342000);
               break;
            case 5:
               var10006 = a(-2136508210, var27 ^ 1053247039);
               break;
            default:
               var10006 = a(-2136508209, var27 ^ 313693522);
         }
      }

      while (true) {
         var83[var10004] = (char)(var10005 ^ var10006);
         var10++;
         if (var48 == 0) {
            var10004 = var48;
            var83 = var67;
            var10005 = var67[var48];
            switch (var10 % a(-2136508216, var27 ^ 1109525582)) {
               case 0:
                  var10006 = a(-2136508215, var27 ^ 720973462);
                  break;
               case 1:
                  var10006 = a(-2136508214, var27 ^ 1405982587);
                  break;
               case 2:
                  var10006 = a(-2136508213, var27 ^ -414841576);
                  break;
               case 3:
                  var10006 = a(-2136508212, var27 ^ 591352042);
                  break;
               case 4:
                  var10006 = a(-2136508211, var27 ^ 1561342000);
                  break;
               case 5:
                  var10006 = a(-2136508210, var27 ^ 1053247039);
                  break;
               default:
                  var10006 = a(-2136508209, var27 ^ 313693522);
            }
         } else {
            if (var48 <= var10) {
               String var90 = new String(var67).intern();
               byte var52 = -1;
               ab = var90;
               long var2 = 5978664530083837139L;
               long[] var8 = new long[a(-2136508224, var27 ^ 1926736600)];
               int var5 = 0;
               String var6;
               int var7 = (var6 = bb((short)'谂', var27 ^ -1668004491, '굚')).length();
               byte var4 = 0;

               label126:
               while (true) {
                  byte var53 = var4;
                  var4 += 8;
                  String var40 = var6.substring(var53, var4);
                  char var54 = 'ﺓ';
                  int var71 = var27 ^ -1947834057;
                  char var91 = '굙';
                  byte[] var9 = var40.getBytes("ISO-8859-1");
                  long[] var41 = var8;
                  int var55 = var5++;
                  long var72 = (var9[0] & 255L) << a(-2136508223, var27 ^ 118785472)
                     | (var9[1] & 255L) << a(-2136508222, var27 ^ -666638902)
                     | (var9[2] & 255L) << a(-2136508221, var27 ^ 1595938227)
                     | (var9[3] & 255L) << a(-2136508220, var27 ^ 354338743)
                     | (var9[4] & 255L) << a(-2136508219, var27 ^ -400896105)
                     | (var9[5] & 255L) << a(-2136508218, var27 ^ -1078884594)
                     | (var9[a(-2136508217, var27 ^ 1562173202)] & 255L) << a(-2136508200, var27 ^ 1346192989)
                     | var9[a(-2136508199, var27 ^ 1750443400)] & 255L;
                  byte var92 = -1;

                  while (true) {
                     long var101 = var72 ^ var2;
                     switch (var92) {
                        case 0:
                           var41[var55] = var101;
                           if (var4 >= var7) {
                              bb = var8;
                              aba = new Integer[a(-2136508205, var27 ^ 2110387985)];
                              ba = ba(a(-2136508204, var27 ^ 166366950), 5804807930993201679L);
                              aa = ba(a(-2136508203, var27 ^ 1895109892), 3661313425245757408L);
                              abb = ba(a(-2136508202, var27 ^ 237565635), 5212829434449055756L);
                              aab = ba(a(-2136508201, var27 ^ -1871306494), 7714185524738209888L);
                              long var0 = 9024765895949954174L;
                              long var75 = 9024765895950052778L ^ var0;
                              byte var58 = -1;
                              aaa = var75;
                              b = new String[1];
                              ab();
                              baa = (aaabaaa)Native.load(
                                 aabbaaaba.abba(b[0]), aaabaaa.class
                              );
                              return;
                           }
                           break;
                        default:
                           var41[var55] = var101;
                           if (var4 < var7) {
                              continue label126;
                           }

                           var7 = (var6 = bb((short)'럻', var27 ^ 328941267, '굘')).length();
                           var4 = 0;
                     }

                     byte var56 = var4;
                     var4 += 8;
                     var40 = var6.substring(var56, var4);
                     short var57 = 7430;
                     int var74 = var27 ^ -736413200;
                     var91 = '굟';
                     var9 = var40.getBytes("ISO-8859-1");
                     var41 = var8;
                     var55 = var5++;
                     var72 = (var9[0] & 255L) << a(-2136508198, var27 ^ 765561485)
                        | (var9[1] & 255L) << a(-2136508197, var27 ^ -1463013061)
                        | (var9[2] & 255L) << a(-2136508196, var27 ^ 418463471)
                        | (var9[3] & 255L) << a(-2136508195, var27 ^ 1628149589)
                        | (var9[4] & 255L) << a(-2136508194, var27 ^ 219549957)
                        | (var9[5] & 255L) << a(-2136508193, var27 ^ -860173478)
                        | (var9[a(-2136508208, var27 ^ 1656178429)] & 255L) << a(-2136508207, var27 ^ -1255795128)
                        | var9[a(-2136508206, var27 ^ 1550456621)] & 255L;
                     var92 = 0;
                  }
               }
            }

            var83 = var67;
            var10004 = var10;
            var10005 = var67[var10];
            switch (var10 % a(-2136508216, var27 ^ 1109525582)) {
               case 0:
                  var10006 = a(-2136508215, var27 ^ 720973462);
                  break;
               case 1:
                  var10006 = a(-2136508214, var27 ^ 1405982587);
                  break;
               case 2:
                  var10006 = a(-2136508213, var27 ^ -414841576);
                  break;
               case 3:
                  var10006 = a(-2136508212, var27 ^ 591352042);
                  break;
               case 4:
                  var10006 = a(-2136508211, var27 ^ 1561342000);
                  break;
               case 5:
                  var10006 = a(-2136508210, var27 ^ 1053247039);
                  break;
               default:
                  var10006 = a(-2136508209, var27 ^ 313693522);
            }
         }
      }
   }

   static int a(int var0, int var1) {
      int var2 = a[var0 ^ -2136508216] ^ var1 ^ var0;
      var2 += 43994;
      var2 ^= 4366;
      var2 -= 14102;
      var2 -= 29042;
      var2 -= 27759;
      var2 ^= 47797;
      return var2 ^ 55379;
   }

   static String aa(char[] var0, long var1, int var3) {
      int var4 = ba(a(-2136508184, 327976583 ^ 243629289), 3507488964464472220L) ^ var3;

      for (int var5 = 0; var5 < var0.length; var5++) {
         int var7 = var4 ^ (int)var1 ^ ~var5;
         int var8 = var7 ^ var3 - var5 * var0.length;
         var4 = -var8 * var3 | var5;
         var0[var5] = (char)(var0[var5] ^ var4);
         int var6 = var5 & ba(a(-2136508183, 327976583 ^ -1025884167), 9017235952875645781L);
         var3 = var3 << var6 | var3 >>> -var6;
         var1 ^= var6;
      }

      return new String(var0);
   }

   static void ab() {
      b[0] = aa(ab.toCharArray(), aaa, ba(a(-2136508182, -1999662326 ^ -808889090), 7761742678778868345L));
   }

   private static int ba(int var0, long var1) {
      int var3 = var0 ^ (int)(var1 & 32767L) ^ a(-2136508181, 1448817169 ^ 924740428);
      if (aba[var3] == null) {
         aba[var3] = (int)(bb[var3] ^ var1);
      }

      return aba[var3];
   }
}
