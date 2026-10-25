package nsc;

import net.fabricmc.api.EnvType;
import net.fabricmc.api.Environment;

@Environment(EnvType.CLIENT)
enum aabaaaabb {
   public static final aabaaaabb b;
   private static final aabaaaabb[] aa;
   private static final String[] aaa;
   public static final aabaaaabb a;
   public static final aabaaaabb ab;
   private static final int[] bb;
   private static final Object[] aab;
   public static final aabaaaabb ba;

   // $VF: Irreducible bytecode was duplicated to produce valid code
   static {
      int var23 = 311604368;
      String[] var15 = new String[2];
      short var18 = 28869;
      int var14 = "\u0012\uf35bﯹﭻ\uebf5\uf56b쯶溜毱\uf7cb毲\uf32b⯱ﺛﯴ\uf8fb미\uf15b믲\u0016ꔺ㪯겊⪢\ua4ca窧ꨊ檤ꀪꪣꈺ\udaa2ꬊ骣걊檩ꎊ骣귺媤깺䪬".length();
      String var13 = "\u0012\uf35bﯹﭻ\uebf5\uf56b쯶溜毱\uf7cb毲\uf32b⯱ﺛﯴ\uf8fb미\uf15b믲\u0016ꔺ㪯겊⪢\ua4ca窧ꨊ檤ꀪꪣꈺ\udaa2ꬊ骣걊檩ꎊ骣귺媤깺䪬";
      int var16 = 0;
      int var17 = 0;

      do {
         char var19 = var13.charAt(var17);
         char[] var20 = var13.substring(var17 + 1, var17 + 1 + var19).toCharArray();
         int var21 = 0;

         do {
            char var22 = var20[var21];
            if (var21 % 2 == 0) {
               var20[var21] = (char)((var22 >>> 4 | var22 << '\f') & 65535 ^ var18);
            } else {
               var20[var21] = (char)((var22 << 4 | var22 >>> '\f') & 65535 ^ var18);
            }
         } while (++var21 < var20.length);

         var15[var16] = new String(var20);
         var16++;
         var17 = var17 + var19 + 1;
      } while (var17 < var14);

      aaa = var15;
      aab = new Object[var15.length];
      int var9 = 547367408;
      byte[] var7 = "\u0080\u0095v!>Äÿ\u008eµhá\u0099ª»kYxá\u0003¸\u001bÑ+F±Ñ2F\u001bº\u008b|".getBytes("ISO-8859-1");
      int var8 = var7.length / 4;
      bb = new int[var8];
      byte var10 = 0;
      int var11 = 0;

      do {
         int var12 = (var7[var10] & 255) << 24 | (var7[var10 + 1] & 255) << 16 | (var7[var10 + 2] & 255) << 8 | var7[var10 + 3] & 255;
         var12 ^= var9;
         bb[var11] = var12;
         var10 += 4;
      } while (++var11 < var8);

      String[] var0 = new String[4];
      int var4 = 0;
      String var3;
      int var5 = (var3 = aa(-753193948, var23 ^ -754595872)).length();
      int var2 = 4;
      int var25 = -1;

      label88:
      while (true) {
         String var10000 = var3.substring(++var25, var25 + var2);
         int var10001 = -1;

         while (true) {
            char[] var38;
            label83: {
               char[] var29 = var10000.toCharArray();
               int var10003 = var29.length;
               int var6 = 0;
               var38 = var29;
               var10001 = var10003;
               char[] var46;
               int var10004;
               if (var10003 <= 1) {
                  var46 = var29;
                  var10004 = var6;
               } else {
                  var38 = var29;
                  var10001 = var10003;
                  if (var10003 <= var6) {
                     break label83;
                  }

                  var46 = var29;
                  var10004 = var6;
               }

               while (true) {
                  var46[var10004] = (char)(var46[var10004] ^ switch (var6 % a(1761624340, var23 ^ 1710513231)) {
                     case 0 -> a(1761624343, var23 ^ -296206286);
                     case 1 -> a(1761624342, var23 ^ -242496777);
                     case 2 -> 2;
                     case 3 -> a(1761624337, var23 ^ 600940724);
                     case 4 -> a(1761624336, var23 ^ 1088522964);
                     case 5 -> a(1761624339, var23 ^ -354315854);
                     default -> a(1761624338, var23 ^ 1082796220);
                  });
                  var6++;
                  if (var10001 == 0) {
                     var10004 = var10001;
                     var46 = var38;
                  } else {
                     if (var10001 <= var6) {
                        break;
                     }

                     var46 = var38;
                     var10004 = var6;
                  }
               }
            }

            String var53 = new String(var38).intern();
            switch (var10001) {
               case 0:
                  var0[var4++] = var53;
                  if ((var25 += var2) >= var5) {
                     b = new aabaaaabb();
                     a = new aabaaaabb();
                     ab = new aabaaaabb();
                     ba = new aabaaaabb();
                     aa = b();
                     return;
                  }

                  var2 = var3.charAt(var25);
                  break;
               default:
                  var0[var4++] = var53;
                  if ((var25 += var2) < var5) {
                     var2 = var3.charAt(var25);
                     continue label88;
                  }

                  var5 = (var3 = aa(-753193947, var23 ^ -966545442)).length();
                  var2 = a(1761624341, var23 ^ -609888785);
                  var25 = -1;
            }

            var10000 = var3.substring(++var25, var25 + var2);
            var10001 = 0;
         }
      }
   }

   private static int a(int var0, int var1) {
      int var2 = bb[var0 ^ 1761624341] ^ var1 ^ var0;
      var2 += 43402;
      var2 += 4192;
      var2 -= 63933;
      var2 ^= 46831;
      var2 -= 41310;
      var2 ^= 32932;
      var2 -= 15227;
      var2 -= 38711;
      return var2 - 37970;
   }

   private static String aa(int var0, int var1) {
      int var3 = var0 ^ -753193948;
      char[] var4 = aaa[var3].toCharArray();
      StackTraceElement[] var2 = (StackTraceElement[])aab[var3];
      StackTraceElement[] var5;
      if (var2 != null) {
         var5 = var2;
      } else {
         var5 = new Throwable().getStackTrace();
         aab[var3] = var5;
      }

      StackTraceElement var6 = var5[1];
      int var7 = (var6.getClassName().hashCode() ^ var6.getMethodName().hashCode()) >> 16 ^ 2063375527;
      int var8 = 0;

      do {
         var4[var8] = (char)(var4[var8] ^ switch (var8 & 31) {
            default -> 27;
            case 1 -> 188;
            case 2 -> 179;
            case 3 -> 108;
            case 4 -> 19;
            case 5 -> 73;
            case 6 -> 168;
            case 7 -> 21;
            case 8 -> 88;
            case 9 -> 24;
            case 10 -> 102;
            case 11 -> 102;
            case 12 -> 206;
            case 13 -> 124;
            case 14 -> 151;
            case 15 -> 189;
            case 16 -> 54;
            case 17 -> 122;
            case 18 -> 134;
            case 19 -> 44;
            case 20 -> 184;
            case 21 -> 156;
            case 22 -> 30;
            case 23 -> 166;
            case 24 -> 44;
            case 25 -> 158;
            case 26 -> 173;
            case 27 -> 156;
            case 28 -> 66;
            case 29 -> 104;
            case 30 -> 122;
            case 31 -> 126;
         } ^ var1 >> 16 ^ var7);
      } while (++var8 < var4.length);

      return new String(var4).intern();
   }

   private static aabaaaabb[] b() {
      return new aabaaaabb[]{b, a, ab, ba};
   }
}
