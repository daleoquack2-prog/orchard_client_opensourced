package nsc;

import net.fabricmc.api.EnvType;
import net.fabricmc.api.Environment;

@Environment(EnvType.CLIENT)
public enum bbaab {
   private final ababbbbaa aa;
   public static final bbaab a;
   public static final bbaab ab;
   private static final Object[] aba;
   private static final int[] b;
   public static final bbaab ba;
   private static final String[] aab;
   public static final bbaab bb;
   private static final bbaab[] aaa;

   private static String aa(int var0, short var1, int var2) {
      int var3 = var0 ^ 6307;
      char[] var4 = aab[var3].toCharArray();
      StackTraceElement[] var5 = (StackTraceElement[])aba[var3];
      StackTraceElement[] var6;
      if (var5 != null) {
         var6 = var5;
      } else {
         var6 = new Throwable().getStackTrace();
         aba[var3] = var6;
      }

      StackTraceElement var7 = var6[1];
      int var8 = (var7.getClassName().hashCode() ^ var7.getMethodName().hashCode()) >> 16 ^ 22188;
      int var9 = 0;

      do {
         int var10 = var4[var9] - '폘';
         var10 -= 1832;
         var10 += 57827;
         var10 ^= 45265;
         var10 -= 47502;
         var10 -= 22842;
         var4[var9] = (char)(var10 ^ var8 ^ var1 ^ var2 >> 16);
      } while (++var9 < var4.length);

      return new String(var4).intern();
   }

   private static bbaab[] b() {
      return new bbaab[]{ba, a, ab, bb};
   }

   @Override
   public String toString() {
      return this.aa.abab();
   }

   private bbaab(ababbbbaa var3) {
      this.aa = var3;
   }

   // $VF: Irreducible bytecode was duplicated to produce valid code
   static {
      int var23 = -617913497;
      short var18 = 27402;
      int var14 = "3ꔾ\uaa3aꕆ\uea4fꔚ橗ꔢ\uea3bꔂ꩕ꕊ\uea35ꕂ\uea56ꓒ⯁ꔢ⨹밚⨿꒪橓ꔮ樹ꑞꯀꎦ⩑뱪⩒ꔺ\uebc3ꔮ橊ꎚ樼ꎒ⩗ꋪ⩋밂ꯆꓒ\uea51ꓞꩌꔮ꩓ꏂ\uaa3c뱢\u0013ꖢ⩶\ua62e⩤ꗢ⩳Ꙋ橎Ꝃ橉ꕞ\uea73ꖮ⩜ꖒ\uaa5b꘦\uea5a꜊"
         .length();
      String[] var15 = new String[2];
      int var17 = 0;
      int var16 = 0;
      String var13 = "3ꔾ\uaa3aꕆ\uea4fꔚ橗ꔢ\uea3bꔂ꩕ꕊ\uea35ꕂ\uea56ꓒ⯁ꔢ⨹밚⨿꒪橓ꔮ樹ꑞꯀꎦ⩑뱪⩒ꔺ\uebc3ꔮ橊ꎚ樼ꎒ⩗ꋪ⩋밂ꯆꓒ\uea51ꓞꩌꔮ꩓ꏂ\uaa3c뱢\u0013ꖢ⩶\ua62e⩤ꗢ⩳Ꙋ橎Ꝃ橉ꕞ\uea73ꖮ⩜ꖒ\uaa5b꘦\uea5a꜊";

      do {
         char var19 = var13.charAt(var17);
         int var21 = 0;
         char[] var20 = var13.substring(var17 + 1, var17 + 1 + var19).toCharArray();

         do {
            char var22 = var20[var21];
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

      aab = var15;
      aba = new Object[var15.length];
      int var9 = -1110988051;
      byte[] var7 = "²¼\u0017Iw²\u0000-â\u001f\u0085¢\u0091\rVìmo\u00125e¦§\u009a##æËÌ\u0084Ù}\u0017°ß\u0006\u00921\u008e¤\u00817åO¼\u0012\u0086="
         .getBytes("ISO-8859-1");
      int var8 = var7.length / 4;
      b = new int[var8];
      byte var10 = 0;
      int var11 = 0;

      do {
         int var12 = (var7[var10] & 255) << 24 | (var7[var10 + 1] & 255) << 16 | (var7[var10 + 2] & 255) << 8 | var7[var10 + 3] & 255;
         var12 ^= var9;
         b[var11] = var12;
         var10 += 4;
      } while (++var11 < var8);

      String[] var0 = new String[a(-2018920094, var23 ^ 1409012347)];
      int var4 = 0;
      String var3;
      int var5 = (var3 = aa(6307, (short)15240, var23 ^ 1986948248)).length();
      int var2 = 5;
      int var25 = -1;

      label90:
      while (true) {
         String var10000 = var3.substring(++var25, var25 + var2);
         int var10001 = -1;

         while (true) {
            char[] var38;
            label85: {
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
                     break label85;
                  }

                  var46 = var29;
                  var10004 = var6;
               }

               while (true) {
                  var46[var10004] = (char)(var46[var10004] ^ switch (var6 % a(-2018920096, var23 ^ 56115349)) {
                     case 0 -> a(-2018920095, var23 ^ 1883935492);
                     case 1 -> a(-2018920090, var23 ^ -1943480521);
                     case 2 -> a(-2018920089, var23 ^ -2065603590);
                     case 3 -> a(-2018920092, var23 ^ -1033624930);
                     case 4 -> a(-2018920091, var23 ^ 767761679);
                     case 5 -> a(-2018920086, var23 ^ -151577999);
                     default -> a(-2018920085, var23 ^ 1937132229);
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
                     ba = new bbaab(aabbaaaba.aaab(var0[3]));
                     a = new bbaab(aabbaaaba.aaab(var0[5]));
                     ab = new bbaab(aabbaaaba.aaab(var0[4]));
                     bb = new bbaab(aabbaaaba.aaab(var0[a(-2018920087, var23 ^ 1565868802)]));
                     aaa = b();
                     return;
                  }

                  var2 = var3.charAt(var25);
                  break;
               default:
                  var0[var4++] = var53;
                  if ((var25 += var2) < var5) {
                     var2 = var3.charAt(var25);
                     continue label90;
                  }

                  var5 = (var3 = aa(6306, (short)8785, var23 ^ 1851543251)).length();
                  var2 = a(-2018920093, var23 ^ -1762278118);
                  var25 = -1;
            }

            var10000 = var3.substring(++var25, var25 + var2);
            var10001 = 0;
         }
      }
   }

   private static int a(int var0, int var1) {
      int var2 = b[var0 ^ -2018920094] ^ var1 ^ var0;
      var2 ^= 35753;
      var2 -= 46906;
      var2 ^= 23219;
      var2 -= 2266;
      var2 -= 56043;
      var2 ^= 63605;
      var2 ^= 10421;
      var2 += 48031;
      var2 -= 2524;
      return var2 - 56000;
   }
}
