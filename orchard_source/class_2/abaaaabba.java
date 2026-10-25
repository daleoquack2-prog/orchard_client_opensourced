package nsc;

import net.fabricmc.api.EnvType;
import net.fabricmc.api.Environment;

@Environment(EnvType.CLIENT)
public enum abaaaabba {
   public static final abaaaabba b;
   public static final abaaaabba aa;
   private static final String[] aaa;
   public static final abaaaabba ab;
   public static final abaaaabba ba;
   private static final Object[] aab;
   private static final int[] a;
   private static final abaaaabba[] bb;

   private static int a(int var0, int var1) {
      int var2 = a[var0 ^ -2042614953] ^ var1 ^ var0;
      var2 ^= 38090;
      var2 += 49244;
      var2 += 6451;
      var2 ^= 26126;
      var2 -= 25922;
      var2 += 30855;
      var2 ^= 49383;
      var2 += 16784;
      var2 ^= 17555;
      return var2 + 34655;
   }

   private static String ab(int var0, int var1, char var2) {
      int var3 = var2 ^ 7286;
      char[] var4 = aaa[var3].toCharArray();
      StackTraceElement[] var5 = (StackTraceElement[])aab[var3];
      StackTraceElement[] var6;
      if (var5 != null) {
         var6 = var5;
      } else {
         var6 = new Throwable().getStackTrace();
         aab[var3] = var6;
      }

      StackTraceElement var7 = var6[1];
      int var8 = (var7.getClassName().hashCode() ^ var7.getMethodName().hashCode()) >> 16 ^ 32115;
      int var9 = 0;

      do {
         int var10 = var4[var9] + 24867;
         var10 += 19839;
         var10 += 19116;
         var10 += 4746;
         var4[var9] = (char)(var10 ^ var8 ^ var1 ^ var0 >> 16);
      } while (++var9 < var4.length);

      return new String(var4).intern();
   }

   // $VF: Irreducible bytecode was duplicated to produce valid code
   static {
      int var17 = 1949429677;
      int var8 = "\n\ue18d힉\ue29d垇\ue7ad㞞\ue28dច\ue2dd랉\u0013挦馎戾㦳滆ᦈ泞年捆妌滶僚涞妲戾㦈泎僚溞".length();
      String var7 = "\n\ue18d힉\ue29d垇\ue7ad㞞\ue28dច\ue2dd랉\u0013挦馎戾㦳滆ᦈ泞年捆妌滶僚涞妲戾㦈泎僚溞";
      int var10 = 0;
      short var12 = 21350;
      String[] var10000 = new String[2];
      int var11 = 0;
      String[] var9 = var10000;

      do {
         char var13 = var7.charAt(var11);
         int var15 = 0;
         char[] var14 = var7.substring(var11 + 1, var11 + 1 + var13).toCharArray();

         do {
            char var16 = var14[var15];
            if (var15 % 2 == 0) {
               var14[var15] = (char)((var16 >>> 3 | var16 << '\r') & 65535 ^ var12);
            } else {
               var14[var15] = (char)((var16 << 3 | var16 >>> '\r') & 65535 ^ var12);
            }
         } while (++var15 < var14.length);

         var9[var10] = new String(var14);
         var10++;
         var11 = var11 + var13 + 1;
      } while (var11 < var8);

      aaa = var9;
      aab = new Object[var9.length];
      byte var20 = 0;
      int var10001 = 0;
      a = new int[9];
      byte[] var10002 = "îX;\u001a\u0099àò\u0096\u0018rÐÂÅ§îCC:Û+ka»çZib\u0090ÀÝdó56©ý".getBytes("ISO-8859-1");

      int var55;
      do {
         a[var20] = (
               (var10002[var10001] & 255) << 24 | (var10002[var10001 + 1] & 255) << 16 | (var10002[var10001 + 2] & 255) << 8 | var10002[var10001 + 3] & 255
            )
            ^ -39179611;
         var20 += 1;
         var55 = var10001 + 4;
         var10001 += 4;
      } while (var55 < var10002.length);

      String[] var0 = new String[4];
      int var4 = 0;
      String var3;
      int var5 = (var3 = ab(var17 ^ 1692698751, 19226, 'ᱶ')).length();
      int var2 = a(-2042614953, var17 ^ 511583982);
      int var19 = -1;

      label92:
      while (true) {
         String var21 = var3.substring(++var19, var19 + var2);
         var10001 = (byte)-1;

         while (true) {
            label87: {
               char[] var27 = var21.toCharArray();
               var55 = var27.length;
               int var6 = 0;
               var42 = var27;
               var10001 = var55;
               char[] var59;
               int var73;
               if (var55 <= 1) {
                  var59 = var27;
                  var73 = var6;
               } else {
                  var42 = var27;
                  var10001 = var55;
                  if (var55 <= var6) {
                     break label87;
                  }

                  var59 = var27;
                  var73 = var6;
               }

               while (true) {
                  var59[var73] = (char)(var59[var73] ^ switch (var6 % a(-2042614954, var17 ^ 1774645112)) {
                     case 0 -> a(-2042614955, var17 ^ -397091765);
                     case 1 -> a(-2042614956, var17 ^ 897708929);
                     case 2 -> a(-2042614957, var17 ^ -1289959780);
                     case 3 -> a(-2042614958, var17 ^ -1689798814);
                     case 4 -> a(-2042614959, var17 ^ -1437630630);
                     case 5 -> a(-2042614960, var17 ^ 821786939);
                     default -> a(-2042614945, var17 ^ -988760881);
                  });
                  var6++;
                  if (var10001 == 0) {
                     var73 = var10001;
                     var59 = var42;
                  } else {
                     if (var10001 <= var6) {
                        break;
                     }

                     var59 = var42;
                     var73 = var6;
                  }
               }
            }

            String var66 = new String(var42).intern();
            switch (var10001) {
               case 0:
                  var0[var4++] = var66;
                  if ((var19 += var2) >= var5) {
                     aa = new abaaaabba();
                     ab = new abaaaabba();
                     ba = new abaaaabba();
                     b = new abaaaabba();
                     bb = b();
                     return;
                  }

                  var2 = var3.charAt(var19);
                  break;
               default:
                  var0[var4++] = var66;
                  if ((var19 += var2) < var5) {
                     var2 = var3.charAt(var19);
                     continue label92;
                  }

                  var5 = (var3 = ab(var17 ^ -1395525397, 53968, 'ᱷ')).length();
                  var2 = 5;
                  var19 = -1;
            }

            var21 = var3.substring(++var19, var19 + var2);
            var10001 = (byte)0;
         }
      }
   }

   private static abaaaabba[] b() {
      return new abaaaabba[]{aa, ab, ba, b};
   }

   public static abaaaabba aa(String var0) {
      return Enum.valueOf(abaaaabba.class, var0);
   }
}
