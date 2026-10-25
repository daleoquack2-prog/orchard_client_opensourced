package nsc;

import net.fabricmc.api.EnvType;
import net.fabricmc.api.Environment;

@Environment(EnvType.CLIENT)
enum aabbaabaa {
   private static final Object[] aab;
   public static final aabbaabaa b;
   private static final String[] aaa;
   public static final aabbaabaa aa;
   private static final int[] a;
   public static final aabbaabaa ab;
   public static final aabbaabaa ba;
   private static final aabbaabaa[] bb;

   // $VF: Irreducible bytecode was duplicated to produce valid code
   static {
      int var23 = -1975729952;
      int var16 = 0;
      short var18 = 2723;
      int var17 = 0;
      int var10001 = "\u0010劲\uf526剺㗶巗疎匜땵嶓甆剎㔵史뗣嶿㖎\f⻄툝⸀툽⸅ቜ⧪劭⸝ስ⻨刞".length();
      String[] var15 = new String[2];
      int var14 = var10001;
      String var13 = "\u0010劲\uf526剺㗶巗疎匜땵嶓甆剎㔵史뗣嶿㖎\f⻄툝⸀툽⸅ቜ⧪劭⸝ስ⻨刞";

      do {
         char var19 = var13.charAt(var17);
         var10001 = var17 + 1;
         int var10002 = var17 + 1;
         int var21 = 0;
         char[] var20 = var13.substring(var10001, var10002 + var19).toCharArray();

         do {
            int var22 = var20[var21];

            var22 = (char)(switch (var21 % 5) {
               default -> 181;
               case 1 -> 243;
               case 2 -> 81;
               case 3 -> 216;
               case 4 -> 208;
            }) ^ var22;
            if (var21 % 2 == 0) {
               var20[var21] = (char)((var22 >>> 2 | var22 << 14) & 65535 ^ var18);
            } else {
               var20[var21] = (char)((var22 << 2 | var22 >>> 14) & 65535 ^ var18);
            }
         } while (++var21 < var20.length);

         var15[var16] = new String(var20);
         var16++;
         var17 = var17 + var19 + 1;
      } while (var17 < var14);

      aaa = var15;
      aab = new Object[var15.length];
      int var9 = -48633760;
      byte[] var7 = "N\u008d$B\u0085IãPQbè&SS^å\u009c*ÑaäÙ¤\r#]Y²ßl\u0084ONj\u009bË\u00026\u0004d".getBytes("ISO-8859-1");
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

      String[] var0 = new String[4];
      int var4 = 0;
      String var3;
      int var5 = (var3 = aa('럽', 'ꦣ', var23 ^ -410007338)).length();
      int var2 = a(1933009326, var23 ^ 1251977085);
      int var25 = -1;

      label97:
      while (true) {
         String var28 = var3.substring(++var25, var25 + var2);
         int var31 = -1;

         while (true) {
            char[] var43;
            label92: {
               char[] var33 = var28.toCharArray();
               int var10003 = var33.length;
               int var6 = 0;
               var43 = var33;
               var31 = var10003;
               char[] var51;
               int var10004;
               if (var10003 <= 1) {
                  var51 = var33;
                  var10004 = var6;
               } else {
                  var43 = var33;
                  var31 = var10003;
                  if (var10003 <= var6) {
                     break label92;
                  }

                  var51 = var33;
                  var10004 = var6;
               }

               while (true) {
                  var51[var10004] = (char)(var51[var10004] ^ switch (var6 % a(1933009324, var23 ^ 1433430809)) {
                     case 0 -> a(1933009325, var23 ^ 1463934407);
                     case 1 -> a(1933009322, var23 ^ -1741139223);
                     case 2 -> a(1933009323, var23 ^ -523557053);
                     case 3 -> a(1933009320, var23 ^ 659544741);
                     case 4 -> a(1933009321, var23 ^ -612497649);
                     case 5 -> a(1933009318, var23 ^ 1249384604);
                     default -> a(1933009319, var23 ^ 103057198);
                  });
                  var6++;
                  if (var31 == 0) {
                     var10004 = var31;
                     var51 = var43;
                  } else {
                     if (var31 <= var6) {
                        break;
                     }

                     var51 = var43;
                     var10004 = var6;
                  }
               }
            }

            String var58 = new String(var43).intern();
            switch (var31) {
               case 0:
                  var0[var4++] = var58;
                  if ((var25 += var2) >= var5) {
                     b = new aabbaabaa();
                     ab = new aabbaabaa();
                     ba = new aabbaabaa();
                     aa = new aabbaabaa();
                     bb = b();
                     return;
                  }

                  var2 = var3.charAt(var25);
                  break;
               default:
                  var0[var4++] = var58;
                  if ((var25 += var2) < var5) {
                     var2 = var3.charAt(var25);
                     continue label97;
                  }

                  var5 = (var3 = aa('痌', 'ꦢ', var23 ^ 2022373181)).length();
                  var2 = a(1933009327, var23 ^ -2124717973);
                  var25 = -1;
            }

            var28 = var3.substring(++var25, var25 + var2);
            var31 = 0;
         }
      }
   }

   private static String aa(char var0, char var1, int var2) {
      int var3 = var1 ^ 'ꦣ';
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
      int var8 = (var7.getClassName().hashCode() ^ var7.getMethodName().hashCode()) >> 16 ^ 10960;
      int var9 = 0;

      do {
         int var10 = var4[var9] + 5317;
         var10 ^= 11240;
         var10 += 27073;
         var10 += 6614;
         var4[var9] = (char)(var10 ^ var8 ^ var0 ^ var2 >> 16);
      } while (++var9 < var4.length);

      return new String(var4).intern();
   }

   private static aabbaabaa[] b() {
      return new aabbaabaa[]{b, ab, ba, aa};
   }

   private static int a(int var0, int var1) {
      int var2 = a[var0 ^ 1933009326] ^ var1 ^ var0;
      var2 -= 44668;
      var2 += 26220;
      var2 += 4951;
      var2 ^= 51502;
      var2 -= 2109;
      var2 -= 21391;
      var2 ^= 9017;
      var2 ^= 7472;
      return var2 - 16026;
   }
}
