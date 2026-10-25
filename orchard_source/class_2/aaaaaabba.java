package nsc;

import net.fabricmc.api.EnvType;
import net.fabricmc.api.Environment;

@Environment(EnvType.CLIENT)
public enum aaaaaabba {
   private static final String[] aaa;
   public static final aaaaaabba aa;
   private static final aaaaaabba[] ab;
   private static final Object[] aab;
   private static final int[] bb;
   private final ababbbbaa b;
   public static final aaaaaabba a;
   public static final aaaaaabba ba;

   private static String aa(char var0, short var1, short var2, int var3) {
      int var8 = var3 ^ -218532731;
      char[] var7 = aaa[var8].toCharArray();
      StackTraceElement[] var9 = (StackTraceElement[])aab[var8];
      StackTraceElement[] var10;
      if (var9 != null) {
         var10 = var9;
      } else {
         var10 = new Throwable().getStackTrace();
         aab[var8] = var10;
      }

      StackTraceElement var11 = var10[1];
      int var5 = (var11.getClassName().hashCode() ^ var11.getMethodName().hashCode()) >> 16 ^ 19075;
      int var6 = 0;

      do {
         var7[var6] = (char)(var7[var6] ^ '\uea53' ^ switch (var6 % 28) {
            default -> 90;
            case 1 -> 45;
            case 2 -> 164;
            case 3 -> 168;
            case 4 -> 202;
            case 5 -> 133;
            case 6 -> 47;
            case 7 -> 214;
            case 8 -> 248;
            case 9 -> 94;
            case 10 -> 105;
            case 11 -> 101;
            case 12 -> 136;
            case 13 -> 220;
            case 14 -> 26;
            case 15 -> 26;
            case 16 -> 56;
            case 17 -> 127;
            case 18 -> 207;
            case 19 -> 186;
            case 20 -> 110;
            case 21 -> 16;
            case 22 -> 52;
            case 23 -> 53;
            case 24 -> 241;
            case 25 -> 243;
            case 26 -> 14;
            case 27 -> 82;
         } ^ var2 ^ var0 ^ var1 ^ var5 ^ var3);
      } while (++var6 < var7.length);

      return new String(var7).intern();
   }

   // $VF: Irreducible bytecode was duplicated to produce valid code
   static {
      int var17 = 682873802;
      int var10001 = "0㴬䏜㼘쏸㹤Ͻ㴴쏵㸀φ㷨菎㾸Ϯ㵈ώ㳰䏑㹈쏸㵬䏒㵤쏙㼨菽㳰䏀㱼菁㾨϶㹘華㷔菵㿴쏉㰼ϕ㾀華㷄䏂㴰菀㽐菦\u0017큵\udd04툁ᴼ폡ᴣ텍\udd2c펅ᴖ킽ᴛ퉩鴧턉\udd03킩崉폩\udd32톕ᴓ퇙".length();
      int var11 = 0;
      int var8 = var10001;
      int var10 = 0;
      String[] var9 = new String[2];
      short var12 = 28185;
      String var7 = "0㴬䏜㼘쏸㹤Ͻ㴴쏵㸀φ㷨菎㾸Ϯ㵈ώ㳰䏑㹈쏸㵬䏒㵤쏙㼨菽㳰䏀㱼菁㾨϶㹘華㷔菵㿴쏉㰼ϕ㾀華㷄䏂㴰菀㽐菦\u0017큵\udd04툁ᴼ폡ᴣ텍\udd2c펅ᴖ킽ᴛ퉩鴧턉\udd03킩崉폩\udd32톕ᴓ퇙";

      do {
         char var13 = var7.charAt(var11);
         int var15 = 0;
         char[] var14 = var7.substring(var11 + 1, var11 + 1 + var13).toCharArray();

         do {
            char var16 = var14[var15];
            if (var15 % 2 == 0) {
               var14[var15] = (char)((var16 >>> 2 | var16 << 14) & 65535 ^ var12);
            } else {
               var14[var15] = (char)((var16 << 2 | var16 >>> 14) & 65535 ^ var12);
            }
         } while (++var15 < var14.length);

         var9[var10] = new String(var14);
         var10++;
         var11 = var11 + var13 + 1;
      } while (var11 < var8);

      aaa = var9;
      aab = new Object[var9.length];
      byte var10000 = 0;
      bb = new int[11];
      int var22 = 0;
      byte[] var10002 = "h¬¤7õd\r Tõ<æ:nAÌô/'\u0005b\u0092Ý§\u0082ß\u008b°ÿE-Q\u008cÊ4C\u0082&5s\u0084¨¤¼".getBytes("ISO-8859-1");

      int var55;
      do {
         bb[var10000] = ((var10002[var22] & 255) << 24 | (var10002[var22 + 1] & 255) << 16 | (var10002[var22 + 2] & 255) << 8 | var10002[var22 + 3] & 255)
            ^ -667738778;
         var10000 += 1;
         var55 = var22 + 4;
         var22 += 4;
      } while (var55 < var10002.length);

      String[] var0 = new String[a(-1112812925, var17 ^ 629592855)];
      int var4 = 0;
      String var3;
      int var5 = (var3 = aa('걄', 2234, 29805, -218532731)).length();
      int var2 = a(-1112812926, var17 ^ -1202816033);
      int var19 = -1;

      label93:
      while (true) {
         String var20 = var3.substring(++var19, var19 + var2);
         var22 = (byte)-1;

         while (true) {
            label88: {
               char[] var27 = var20.toCharArray();
               var55 = var27.length;
               int var6 = 0;
               var42 = var27;
               var22 = var55;
               char[] var59;
               int var73;
               if (var55 <= 1) {
                  var59 = var27;
                  var73 = var6;
               } else {
                  var42 = var27;
                  var22 = var55;
                  if (var55 <= var6) {
                     break label88;
                  }

                  var59 = var27;
                  var73 = var6;
               }

               while (true) {
                  var59[var73] = (char)(var59[var73] ^ switch (var6 % a(-1112812928, var17 ^ 2000959214)) {
                     case 0 -> a(-1112812921, var17 ^ -1190833850);
                     case 1 -> a(-1112812922, var17 ^ 800631647);
                     case 2 -> a(-1112812923, var17 ^ -805962602);
                     case 3 -> a(-1112812924, var17 ^ -1301324856);
                     case 4 -> a(-1112812917, var17 ^ -1042267468);
                     case 5 -> a(-1112812918, var17 ^ -821279860);
                     default -> a(-1112812919, var17 ^ -914173041);
                  });
                  var6++;
                  if (var22 == 0) {
                     var73 = var22;
                     var59 = var42;
                  } else {
                     if (var22 <= var6) {
                        break;
                     }

                     var59 = var42;
                     var73 = var6;
                  }
               }
            }

            String var66 = new String(var42).intern();
            switch (var22) {
               case 0:
                  var0[var4++] = var66;
                  if ((var19 += var2) >= var5) {
                     aa = new aaaaaabba(aabbaaaba.aaab(var0[0]));
                     ba = new aaaaaabba(aabbaaaba.aaab(var0[5]));
                     a = new aaaaaabba(aabbaaaba.aaab(var0[3]));
                     ab = b();
                     return;
                  }

                  var2 = var3.charAt(var19);
                  break;
               default:
                  var0[var4++] = var66;
                  if ((var19 += var2) < var5) {
                     var2 = var3.charAt(var19);
                     continue label93;
                  }

                  var5 = (var3 = aa((char)'\uee90', 25043, 9393, -218532732)).length();
                  var2 = a(-1112812927, var17 ^ 434064324);
                  var19 = -1;
            }

            var20 = var3.substring(++var19, var19 + var2);
            var22 = (byte)0;
         }
      }
   }

   private aaaaaabba(ababbbbaa var3) {
      this.b = var3;
   }

   private static int a(int var0, int var1) {
      int var2 = bb[var0 ^ -1112812925] ^ var1 ^ var0;
      var2 ^= 11439;
      var2 ^= 13962;
      var2 += 34892;
      var2 ^= 64090;
      var2 -= 59960;
      return var2 ^ 6386;
   }

   @Override
   public String toString() {
      return this.b.abab();
   }

   private static aaaaaabba[] b() {
      return new aaaaaabba[]{aa, ba, a};
   }
}
