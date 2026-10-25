package nsc;

import net.fabricmc.api.EnvType;
import net.fabricmc.api.Environment;

@Environment(EnvType.CLIENT)
enum aaabaaaaa {
   public static final aaabaaaaa b;
   public static final aaabaaaaa aa;
   private static final int[] a;
   private static final Object[] bb;
   private static final aaabaaaaa[] ab;
   private static final String[] ba;

   private static String aa(byte var0, int var1, int var2, int var3, char var4, int var5) {
      int var10 = var5 ^ -1751500602;
      char[] var9 = ba[var10].toCharArray();
      StackTraceElement[] var11 = (StackTraceElement[])bb[var10];
      StackTraceElement[] var12;
      if (var11 != null) {
         var12 = var11;
      } else {
         var12 = new Throwable().getStackTrace();
         bb[var10] = var12;
      }

      StackTraceElement var13 = var12[1];
      int var7 = (var13.getClassName().hashCode() ^ var13.getMethodName().hashCode()) >> 16 ^ 43581;
      int var8 = 0;

      do {
         var9[var8] = (char)(var9[var8] ^ switch (var8 % 22) {
            default -> 122;
            case 1 -> 183;
            case 2 -> 102;
            case 3 -> 150;
            case 4 -> 150;
            case 5 -> 24;
            case 6 -> 14;
            case 7 -> 14;
            case 8 -> 72;
            case 9 -> 235;
            case 10 -> 22;
            case 11 -> 203;
            case 12 -> 216;
            case 13 -> 82;
            case 14 -> 177;
            case 15 -> 27;
            case 16 -> 92;
            case 17 -> 115;
            case 18 -> 24;
            case 19 -> 129;
            case 20 -> 5;
            case 21 -> 14;
         } ^ var7 ^ var2 ^ var0 ^ var4 ^ var1 ^ var3 ^ var5);
      } while (++var8 < var9.length);

      return new String(var9).intern();
   }

   // $VF: Irreducible bytecode was duplicated to produce valid code
   static {
      int var24 = -1957867563;
      byte var20 = -1;
      char[] var15 = "㱼".toCharArray();
      String var14 = "㱬㳻㳒㳼㰙㱵㱁㳆㱩㱐";
      short var13 = 15478;
      String[] var16 = new String[var15.length];

      while (true) {
         int var17 = 0;
         int var18 = 0;
         int var19 = 0;
         if (var20 == 0) {
            ba = var16;
            bb = new Object[var16.length];
            int var9 = -1981780767;
            byte[] var7 = "Ã\u0014±M\\²MÇ\u0099*\u009b/\u0088½a×¥\u0086ØpjÂ/\u00ad9Ö+IspTi".getBytes("ISO-8859-1");
            int var8 = var7.length / 4;
            a = new int[var8];
            byte var10 = 0;
            int var11 = 0;

            do {
               int var12 = (var7[var10] & 255) << 24 | (var7[var10 + 1] & 255) << 16 | (var7[var10 + 2] & 255) << 8 | var7[var10 + 3] & 255;
               var12 ^= var9;
               a[var11] = var12;
               var10 += 4;
            } while (++var11 < var8);

            String[] var0 = new String[2];
            int var4 = 0;
            String var3;
            int var5 = (var3 = aa((byte)-71, -388404470, -1399510912, -467964152, 6687, -1751500602)).length();
            char var2 = 5;
            int var1 = -1;

            while (true) {
               char[] var36;
               label83: {
                  char[] var10001 = var3.substring(++var1, var1 + var2).toCharArray();
                  int var10003 = var10001.length;
                  int var6 = 0;
                  var36 = var10001;
                  int var30 = var10003;
                  char[] var43;
                  int var10004;
                  if (var10003 <= 1) {
                     var43 = var10001;
                     var10004 = var6;
                  } else {
                     var36 = var10001;
                     var30 = var10003;
                     if (var10003 <= var6) {
                        break label83;
                     }

                     var43 = var10001;
                     var10004 = var6;
                  }

                  while (true) {
                     var43[var10004] = (char)(var43[var10004] ^ switch (var6 % a(1531879151, var24 ^ 1695068276)) {
                        case 0 -> a(1531879150, var24 ^ -89240695);
                        case 1 -> a(1531879149, var24 ^ 1060543845);
                        case 2 -> a(1531879148, var24 ^ 782329712);
                        case 3 -> a(1531879147, var24 ^ 60479871);
                        case 4 -> a(1531879146, var24 ^ -857855522);
                        case 5 -> a(1531879145, var24 ^ -1614139936);
                        default -> a(1531879144, var24 ^ -714321201);
                     });
                     var6++;
                     if (var30 == 0) {
                        var10004 = var30;
                        var43 = var36;
                     } else {
                        if (var30 <= var6) {
                           break;
                        }

                        var43 = var36;
                        var10004 = var6;
                     }
                  }
               }

               String var50 = new String(var36).intern();
               byte var34 = -1;
               var0[var4++] = var50;
               if ((var1 += var2) >= var5) {
                  b = new aaabaaaaa();
                  aa = new aaabaaaaa();
                  ab = b();
                  return;
               }

               var2 = var3.charAt(var1);
            }
         }

         do {
            var19 = var15[var17] ^ var13;
            char[] var21 = var14.substring(var18, var18 + var19).toCharArray();
            int var22 = 0;

            do {
               short var23 = switch (var22 % 5) {
                  default -> 217;
                  case 1 -> 138;
                  case 2 -> 3;
                  case 3 -> 137;
                  case 4 -> 87;
               };
               var21[var22] = (char)(var21[var22] ^ var23);
            } while (++var22 < var21.length);

            var16[var17] = new String(var21).intern();
            var18 += var19;
         } while (++var17 < var15.length);

         var20 = 0;
      }
   }

   private static int a(int var0, int var1) {
      int var2 = a[var0 ^ 1531879151] ^ var1 ^ var0;
      var2 += 35278;
      var2 -= 19576;
      var2 += 58388;
      var2 -= 11810;
      var2 -= 15993;
      var2 ^= 20845;
      var2 += 20921;
      var2 += 57509;
      var2 -= 23701;
      return var2 - 63134;
   }

   private static aaabaaaaa[] b() {
      return new aaabaaaaa[]{b, aa};
   }
}
