package nsc;

import com.sun.jna.Library;
import com.sun.jna.Native;
import com.sun.jna.platform.win32.BaseTSD.ULONG_PTR;
import net.fabricmc.api.EnvType;
import net.fabricmc.api.Environment;

@Environment(EnvType.CLIENT)
interface aababba extends Library {
   String[] aab;
   Integer[] aa;
   aababba ab;
   int[] aaa;
   long[] a;
   String[] ba;
   Object[] aba;
   long b;
   String bb;

   void b(byte var1, byte var2, int var3, ULONG_PTR var4);

   private static String bb(int var0, int var1) {
      int var3 = var0 ^ -49531549;
      char[] var4 = aab[var3].toCharArray();
      StackTraceElement[] var2 = (StackTraceElement[])aba[var3];
      StackTraceElement[] var5;
      if (var2 != null) {
         var5 = var2;
      } else {
         var5 = new Throwable().getStackTrace();
         aba[var3] = var5;
      }

      StackTraceElement var6 = var5[1];
      int var7 = (var6.getClassName().hashCode() ^ var6.getMethodName().hashCode()) >> 16 ^ -390309103;
      int var8 = 0;

      do {
         var4[var8] = (char)(var4[var8] ^ switch (var8 & 31) {
            default -> 101;
            case 1 -> 108;
            case 2 -> 18;
            case 3 -> 17;
            case 4 -> 142;
            case 5 -> 188;
            case 6 -> 9;
            case 7 -> 132;
            case 8 -> 197;
            case 9 -> 182;
            case 10 -> 115;
            case 11 -> 202;
            case 12 -> 11;
            case 13 -> 220;
            case 14 -> 18;
            case 15 -> 109;
            case 16 -> 236;
            case 17 -> 57;
            case 18 -> 27;
            case 19 -> 227;
            case 20 -> 118;
            case 21 -> 135;
            case 22 -> 65;
            case 23 -> 7;
            case 24 -> 16;
            case 25 -> 189;
            case 26 -> 159;
            case 27 -> 246;
            case 28 -> 73;
            case 29 -> 79;
            case 30 -> 35;
            case 31 -> 148;
         } ^ var1 >> 16 ^ var7);
      } while (++var8 < var4.length);

      return new String(var4).intern();
   }

   static int a(int var0, int var1) {
      int var2 = aaa[var0 ^ 1995765330] ^ var1 ^ var0;
      var2 += 12311;
      var2 ^= 54947;
      var2 += 36769;
      var2 += 43012;
      var2 -= 11574;
      var2 -= 8331;
      var2 -= 36089;
      var2 += 39311;
      return var2 ^ 28814;
   }

   static void aa() {
      ba[0] = ab(bb.toCharArray(), b, ba(a(1995765315, -770201669 ^ -1860801436), 6287874772344840631L));
   }

   static String ab(char[] var0, long var1, int var3) {
      int var4 = ba(a(1995765312, 1799015522 ^ -1766251527), 1346956947267809570L) ^ var3;

      for (int var5 = 0; var5 < var0.length; var5++) {
         int var7 = var4 ^ (int)var1 ^ ~var5;
         int var8 = var7 ^ var3 - var5 * var0.length;
         var4 = -var8 * var3 | var5;
         var0[var5] = (char)(var0[var5] ^ var4);
         int var6 = var5 & ba(a(1995765313, 1799015522 ^ -1050684508), 7051100603196394541L);
         var3 = var3 << var6 | var3 >>> -var6;
         var1 ^= var6;
      }

      return new String(var0);
   }

   // $VF: Irreducible bytecode was duplicated to produce valid code
   static {
      int var28 = -954211201;
      byte var24 = -1;
      String var18 = "誁\udac0昽륮途퍓᤺\uea09੶\u0a64\u0ad5\u0ab4ઑ\u0a5fੁ\u0a57ૣਫ਼\u0a45\u0adcੀઢછੈਧરવઝ\u0a63અઈથ㴻㵵㷢㴸㵹㵱㴫㷷㵗㶃";
      char[] var19 = "\b\u0018\n".toCharArray();
      short var17 = 2091;
      String[] var20 = new String[var19.length];

      while (true) {
         int var21 = 0;
         char var22 = 0;
         char var23 = '\u0000';
         if (var24 == 0) {
            aab = var20;
            aba = new Object[var20.length];
            int var13 = 35106788;
            byte[] var11 = "\u00adÉwÿ± |¿\u0015\u0092¶\u0010\u0087ehV\u0082\u009a£Ó\u0086rT÷¾x\u009f\u0081\u009bGÃ®\u0088\u008cü*hÜØz¹²Æy<Åªøô¡\u0093\u008b\u0086v7\u0092ëLY\u008aoìâñýD`IÈ\u001dÏßv\u009f\u001a1!y%y¬Y5E"
               .getBytes("ISO-8859-1");
            int var12 = var11.length / 4;
            aaa = new int[var12];
            byte var14 = 0;
            int var15 = 0;

            do {
               int var16 = (var11[var14] & 255) << 24 | (var11[var14 + 1] & 255) << 16 | (var11[var14 + 2] & 255) << 8 | var11[var14 + 3] & 255;
               var16 ^= var13;
               aaa[var15] = var16;
               var14 += 4;
            } while (++var15 < var12);

            char[] var10001 = bb(-49531549, var28 ^ 629916055).toCharArray();
            int var10003 = var10001.length;
            int var10 = 0;
            char[] var54 = var10001;
            int var41 = var10003;
            char[] var62;
            int var10004;
            char var10005;
            int var10006;
            if (var10003 <= 1) {
               var62 = var10001;
               var10004 = var10;
               var10005 = var10001[var10];
               switch (var10 % a(1995765330, var28 ^ -506808669)) {
                  case 0:
                     var10006 = a(1995765331, var28 ^ -39600896);
                     break;
                  case 1:
                     var10006 = a(1995765328, var28 ^ 1502705500);
                     break;
                  case 2:
                     var10006 = a(1995765329, var28 ^ -882464437);
                     break;
                  case 3:
                     var10006 = a(1995765334, var28 ^ -828808547);
                     break;
                  case 4:
                     var10006 = a(1995765335, var28 ^ -898525801);
                     break;
                  case 5:
                     var10006 = a(1995765332, var28 ^ -226795977);
                     break;
                  default:
                     var10006 = a(1995765333, var28 ^ -683408870);
               }
            } else {
               var54 = var10001;
               var41 = var10003;
               if (var10003 <= var10) {
                  String var71 = new String(var10001).intern();
                  byte var49 = -1;
                  bb = var71;
                  long var30 = 6511924274801056789L;
                  long[] var35 = new long[3];
                  int var32 = 0;
                  String var33;
                  int var34 = (var33 = bb(-49531550, var28 ^ 1860347189)).length();
                  byte var31 = 0;

                  do {
                     byte var50 = var31;
                     var31 += 8;
                     byte[] var36 = var33.substring(var50, var31).getBytes(bb(-49531551, var28 ^ 1493490975));
                     int var51 = var32++;
                     long var74 = (
                           (var36[0] & 255L) << a(1995765338, var28 ^ -997245597)
                              | (var36[1] & 255L) << a(1995765339, var28 ^ 618600810)
                              | (var36[2] & 255L) << a(1995765336, var28 ^ -172947518)
                              | (var36[3] & 255L) << a(1995765337, var28 ^ 1892051898)
                              | (var36[4] & 255L) << a(1995765342, var28 ^ -1197321498)
                              | (var36[5] & 255L) << a(1995765343, var28 ^ -898238938)
                              | (var36[a(1995765340, var28 ^ -1487955749)] & 255L) << a(1995765341, var28 ^ 602874799)
                              | var36[a(1995765314, var28 ^ -1320705787)] & 255L
                        )
                        ^ var30;
                     byte var72 = -1;
                     var35[var51] = var74;
                  } while (var31 < var34);

                  a = var35;
                  aa = new Integer[3];
                  long var29 = 4842752431078070661L;
                  long var59 = 4842752431078106313L ^ var29;
                  byte var52 = -1;
                  b = var59;
                  ba = new String[1];
                  aa();
                  ab = (aababba)Native.load(
                     aabbaaaba.abba(ba[0]), aababba.class
                  );
                  return;
               }

               var62 = var10001;
               var10004 = var10;
               var10005 = var10001[var10];
               switch (var10 % a(1995765330, var28 ^ -506808669)) {
                  case 0:
                     var10006 = a(1995765331, var28 ^ -39600896);
                     break;
                  case 1:
                     var10006 = a(1995765328, var28 ^ 1502705500);
                     break;
                  case 2:
                     var10006 = a(1995765329, var28 ^ -882464437);
                     break;
                  case 3:
                     var10006 = a(1995765334, var28 ^ -828808547);
                     break;
                  case 4:
                     var10006 = a(1995765335, var28 ^ -898525801);
                     break;
                  case 5:
                     var10006 = a(1995765332, var28 ^ -226795977);
                     break;
                  default:
                     var10006 = a(1995765333, var28 ^ -683408870);
               }
            }

            while (true) {
               var62[var10004] = (char)(var10005 ^ var10006);
               var10++;
               if (var41 == 0) {
                  var10004 = var41;
                  var62 = var54;
                  var10005 = var54[var41];
                  switch (var10 % a(1995765330, var28 ^ -506808669)) {
                     case 0:
                        var10006 = a(1995765331, var28 ^ -39600896);
                        break;
                     case 1:
                        var10006 = a(1995765328, var28 ^ 1502705500);
                        break;
                     case 2:
                        var10006 = a(1995765329, var28 ^ -882464437);
                        break;
                     case 3:
                        var10006 = a(1995765334, var28 ^ -828808547);
                        break;
                     case 4:
                        var10006 = a(1995765335, var28 ^ -898525801);
                        break;
                     case 5:
                        var10006 = a(1995765332, var28 ^ -226795977);
                        break;
                     default:
                        var10006 = a(1995765333, var28 ^ -683408870);
                  }
               } else {
                  if (var41 <= var10) {
                     String var69 = new String(var54).intern();
                     byte var45 = -1;
                     bb = var69;
                     long var2 = 6511924274801056789L;
                     long[] var8 = new long[3];
                     int var5 = 0;
                     String var6;
                     int var7 = (var6 = bb(-49531550, var28 ^ 1860347189)).length();
                     byte var4 = 0;

                     do {
                        byte var46 = var4;
                        var4 += 8;
                        byte[] var9 = var6.substring(var46, var4).getBytes(bb(-49531551, var28 ^ 1493490975));
                        int var47 = var5++;
                        long var73 = (
                              (var9[0] & 255L) << a(1995765338, var28 ^ -997245597)
                                 | (var9[1] & 255L) << a(1995765339, var28 ^ 618600810)
                                 | (var9[2] & 255L) << a(1995765336, var28 ^ -172947518)
                                 | (var9[3] & 255L) << a(1995765337, var28 ^ 1892051898)
                                 | (var9[4] & 255L) << a(1995765342, var28 ^ -1197321498)
                                 | (var9[5] & 255L) << a(1995765343, var28 ^ -898238938)
                                 | (var9[a(1995765340, var28 ^ -1487955749)] & 255L) << a(1995765341, var28 ^ 602874799)
                                 | var9[a(1995765314, var28 ^ -1320705787)] & 255L
                           )
                           ^ var2;
                        byte var70 = -1;
                        var8[var47] = var73;
                     } while (var4 < var7);

                     a = var8;
                     aa = new Integer[3];
                     long var0 = 4842752431078070661L;
                     long var58 = 4842752431078106313L ^ var0;
                     byte var48 = -1;
                     b = var58;
                     ba = new String[1];
                     aa();
                     ab = (aababba)Native.load(
                        aabbaaaba.abba(ba[0]), aababba.class
                     );
                     return;
                  }

                  var62 = var54;
                  var10004 = var10;
                  var10005 = var54[var10];
                  switch (var10 % a(1995765330, var28 ^ -506808669)) {
                     case 0:
                        var10006 = a(1995765331, var28 ^ -39600896);
                        break;
                     case 1:
                        var10006 = a(1995765328, var28 ^ 1502705500);
                        break;
                     case 2:
                        var10006 = a(1995765329, var28 ^ -882464437);
                        break;
                     case 3:
                        var10006 = a(1995765334, var28 ^ -828808547);
                        break;
                     case 4:
                        var10006 = a(1995765335, var28 ^ -898525801);
                        break;
                     case 5:
                        var10006 = a(1995765332, var28 ^ -226795977);
                        break;
                     default:
                        var10006 = a(1995765333, var28 ^ -683408870);
                  }
               }
            }
         }

         do {
            var23 = var19[var21];
            char[] var25 = var18.substring(var22, var22 + var23).toCharArray();
            int var26 = 0;

            do {
               short var27 = switch (var26 % 6) {
                  default -> 215;
                  case 1 -> 138;
                  case 2 -> 127;
                  case 3 -> 196;
                  case 4 -> 15;
                  case 5 -> 53;
               };
               var25[var26] = (char)(var25[var26] ^ var27 ^ var17);
            } while (++var26 < var25.length);

            var20[var21] = new String(var25).intern();
            var22 += var23;
         } while (++var21 < var19.length);

         var24 = 0;
      }
   }

   private static int ba(int var0, long var1) {
      int var3 = var0 ^ (int)(var1 & 32767L) ^ a(1995765318, 723316521 ^ 207224096);
      if (aa[var3] == null) {
         aa[var3] = (int)(a[var3] ^ var1);
      }

      return aa[var3];
   }
}
