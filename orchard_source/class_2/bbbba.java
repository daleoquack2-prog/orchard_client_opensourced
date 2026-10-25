package nsc;

import net.fabricmc.api.EnvType;
import net.fabricmc.api.Environment;

@Environment(EnvType.CLIENT)
public enum bbbba {
   private static final String[] bb;
   private static final Object[] aaa;
   private final ababbbbaa aa;
   private static final int[] b;
   public static final bbbba a;
   public static final bbbba ab;
   private static final bbbba[] ba;

   private static bbbba[] b() {
      return new bbbba[]{ab, a};
   }

   // $VF: Irreducible bytecode was duplicated to produce valid code
   static {
      int var17 = 314221584;
      short var12 = 9483;
      String[] var9 = new String[2];
      int var11 = 0;
      int var10 = 0;
      int var8 = "\u0011阥텣謥ꅠ郥\uf167覅楢蒅ꅦ肥䅣讥ॣ菅ꅥ遅\u0010艵\uf564龵\udd66譵\ued60韵ᕦ騵啡閵镧魕쵦鄵鵢".length();
      String var7 = "\u0011阥텣謥ꅠ郥\uf167覅楢蒅ꅦ肥䅣讥ॣ菅ꅥ遅\u0010艵\uf564龵\udd66譵\ued60韵ᕦ騵啡閵镧魕쵦鄵鵢";

      do {
         int var15 = 0;
         char var13 = var7.charAt(var11);
         char[] var14 = var7.substring(var11 + 1, var11 + 1 + var13).toCharArray();

         do {
            char var16 = var14[var15];
            if (var15 % 2 == 0) {
               var14[var15] = (char)((var16 >>> 5 | var16 << 11) & 65535 ^ var12);
            } else {
               var14[var15] = (char)((var16 << 5 | var16 >>> 11) & 65535 ^ var12);
            }
         } while (++var15 < var14.length);

         var9[var10] = new String(var14);
         var10++;
         var11 = var11 + var13 + 1;
      } while (var11 < var8);

      bb = var9;
      aaa = new Object[var9.length];
      byte var10000 = 0;
      int var10001 = 0;
      b = new int[10];
      byte[] var10002 = "\u0085fY\u008b\u0011*~\u0088Ô}80v¥¹á\u0094Uèì¶ô¬·Ç\u001e\u0002\rýn<\u00ad,)pZTÿtÇ".getBytes("ISO-8859-1");

      int var54;
      do {
         b[var10000] = (
               (var10002[var10001] & 255) << 24 | (var10002[var10001 + 1] & 255) << 16 | (var10002[var10001 + 2] & 255) << 8 | var10002[var10001 + 3] & 255
            )
            ^ 2004865907;
         var10000 += 1;
         var54 = var10001 + 4;
         var10001 += 4;
      } while (var54 < var10002.length);

      String[] var0 = new String[4];
      int var4 = 0;
      String var3;
      int var5 = (var3 = aa(572640506, var17 ^ -1794074787)).length();
      int var2 = a(-360515696, var17 ^ 169976103);
      int var19 = -1;

      label92:
      while (true) {
         String var20 = var3.substring(++var19, var19 + var2);
         var10001 = (byte)-1;

         while (true) {
            label87: {
               char[] var26 = var20.toCharArray();
               var54 = var26.length;
               int var6 = 0;
               var41 = var26;
               var10001 = var54;
               char[] var58;
               int var72;
               if (var54 <= 1) {
                  var58 = var26;
                  var72 = var6;
               } else {
                  var41 = var26;
                  var10001 = var54;
                  if (var54 <= var6) {
                     break label87;
                  }

                  var58 = var26;
                  var72 = var6;
               }

               while (true) {
                  var58[var72] = (char)(var58[var72] ^ switch (var6 % a(-360515694, var17 ^ 1530577059)) {
                     case 0 -> a(-360515693, var17 ^ -102611232);
                     case 1 -> a(-360515692, var17 ^ 454170603);
                     case 2 -> a(-360515691, var17 ^ 968076359);
                     case 3 -> a(-360515690, var17 ^ 1213856422);
                     case 4 -> a(-360515689, var17 ^ 1915339777);
                     case 5 -> a(-360515688, var17 ^ -1553037084);
                     default -> a(-360515687, var17 ^ -608668626);
                  });
                  var6++;
                  if (var10001 == 0) {
                     var72 = var10001;
                     var58 = var41;
                  } else {
                     if (var10001 <= var6) {
                        break;
                     }

                     var58 = var41;
                     var72 = var6;
                  }
               }
            }

            String var65 = new String(var41).intern();
            switch (var10001) {
               case 0:
                  var0[var4++] = var65;
                  if ((var19 += var2) >= var5) {
                     ab = new bbbba(aabbaaaba.aaab(var0[0]));
                     a = new bbbba(aabbaaaba.aaab(var0[2]));
                     ba = b();
                     return;
                  }

                  var2 = var3.charAt(var19);
                  break;
               default:
                  var0[var4++] = var65;
                  if ((var19 += var2) < var5) {
                     var2 = var3.charAt(var19);
                     continue label92;
                  }

                  var5 = (var3 = aa(572640507, var17 ^ 365739709)).length();
                  var2 = a(-360515695, var17 ^ -1636989415);
                  var19 = -1;
            }

            var20 = var3.substring(++var19, var19 + var2);
            var10001 = (byte)0;
         }
      }
   }

   @Override
   public String toString() {
      return this.aa.abab();
   }

   private static String aa(int var0, int var1) {
      int var3 = var0 ^ 572640506;
      char[] var4 = bb[var3].toCharArray();
      StackTraceElement[] var2 = (StackTraceElement[])aaa[var3];
      StackTraceElement[] var5;
      if (var2 != null) {
         var5 = var2;
      } else {
         var5 = new Throwable().getStackTrace();
         aaa[var3] = var5;
      }

      StackTraceElement var6 = var5[1];
      int var7 = (var6.getClassName().hashCode() ^ var6.getMethodName().hashCode()) >> 16 ^ 37955910;
      int var8 = 0;

      do {
         var4[var8] = (char)(var4[var8] ^ switch (var8 & 31) {
            default -> 94;
            case 1 -> 202;
            case 2 -> 213;
            case 3 -> 248;
            case 4 -> 92;
            case 5 -> 19;
            case 6 -> 231;
            case 7 -> 242;
            case 8 -> 172;
            case 9 -> 122;
            case 10 -> 239;
            case 11 -> 185;
            case 12 -> 255;
            case 13 -> 251;
            case 14 -> 148;
            case 15 -> 61;
            case 16 -> 99;
            case 17 -> 97;
            case 18 -> 113;
            case 19 -> 154;
            case 20 -> 170;
            case 21 -> 66;
            case 22 -> 248;
            case 23 -> 102;
            case 24 -> 241;
            case 25 -> 221;
            case 26 -> 21;
            case 27 -> 105;
            case 28 -> 19;
            case 29 -> 57;
            case 30 -> 153;
            case 31 -> 160;
         } ^ var1 >> 16 ^ var7);
      } while (++var8 < var4.length);

      return new String(var4).intern();
   }

   private static int a(int var0, int var1) {
      int var2 = b[var0 ^ -360515696] ^ var1 ^ var0;
      var2 -= 63031;
      var2 -= 47363;
      var2 += 1987;
      var2 += 18921;
      var2 += 9558;
      var2 ^= 7166;
      var2 -= 11988;
      return var2 + 54023;
   }

   private bbbba(ababbbbaa var3) {
      this.aa = var3;
   }
}
