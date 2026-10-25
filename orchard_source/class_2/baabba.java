package nsc;

import net.fabricmc.api.EnvType;
import net.fabricmc.api.Environment;

@Environment(EnvType.CLIENT)
public enum baabba {
   public static final baabba aa;
   private final ababbbbaa ab;
   private static final String[] bb;
   private static final baabba[] a;
   private static final int[] ba;
   private static final Object[] aaa;
   public static final baabba b;

   private static int a(int var0, int var1) {
      int var2 = ba[var0 ^ 429374609] ^ var1 ^ var0;
      var2 ^= 49008;
      var2 -= 31267;
      var2 -= 31026;
      var2 ^= 14451;
      var2 += 46916;
      var2 ^= 39727;
      return var2 ^ 37560;
   }

   private static baabba[] b() {
      return new baabba[]{aa, b};
   }

   private static String aa(short var0, int var1, int var2, int var3, int var4, short var5, int var6) {
      int var11 = var1 ^ 1786953359;
      char[] var10 = bb[var11].toCharArray();
      StackTraceElement[] var12 = (StackTraceElement[])aaa[var11];
      StackTraceElement[] var13;
      if (var12 != null) {
         var13 = var12;
      } else {
         var13 = new Throwable().getStackTrace();
         aaa[var11] = var13;
      }

      StackTraceElement var14 = var13[1];
      int var8 = (var14.getClassName().hashCode() ^ var14.getMethodName().hashCode()) >> 16 ^ 8404;
      int var9 = 0;

      do {
         var10[var9] = (char)(var10[var9] ^ switch (var9 % 26) {
            default -> 148;
            case 1 -> 174;
            case 2 -> 108;
            case 3 -> 243;
            case 4 -> 147;
            case 5 -> 63;
            case 6 -> 80;
            case 7 -> 193;
            case 8 -> 235;
            case 9 -> 137;
            case 10 -> 251;
            case 11 -> 213;
            case 12 -> 124;
            case 13 -> 245;
            case 14 -> 133;
            case 15 -> 8;
            case 16 -> 112;
            case 17 -> 39;
            case 18 -> 12;
            case 19 -> 42;
            case 20 -> 70;
            case 21 -> 114;
            case 22 -> 164;
            case 23 -> 220;
            case 24 -> 126;
            case 25 -> 121;
         } ^ var9 ^ 5104 ^ var3 ^ var0 ^ var1 ^ var4 ^ var2 ^ var5 ^ var6 ^ var8);
      } while (++var9 < var10.length);

      return new String(var10).intern();
   }

   // $VF: Irreducible bytecode was duplicated to produce valid code
   static {
      int var17 = -1880611854;
      short var12 = 431;
      int var10 = 0;
      int var8 = "\u0011쥚\uf8ac쟸⠋쨰롒솚䢬츨᠉챐졟샺袪쮘栆쑀\u0019疭缒穿\udfb7瞗㿬綽弖炿羴睗信笽１璯羼禗쿭磭\uef1a祿쾾皗ῡ箽".length();
      String[] var10001 = new String[2];
      int var11 = 0;
      String[] var9 = var10001;
      String var7 = "\u0011쥚\uf8ac쟸⠋쨰롒솚䢬츨᠉챐졟샺袪쮘栆쑀\u0019疭缒穿\udfb7瞗㿬綽弖炿羴睗信笽１璯羼禗쿭磭\uef1a祿쾾皗ῡ箽";

      do {
         char var13 = var7.charAt(var11);
         char[] var14 = var7.substring(var11 + 1, var11 + 1 + var13).toCharArray();
         int var15 = 0;

         do {
            int var16 = var14[var15];

            var16 = (char)(switch (var15 % 6) {
               default -> 194;
               case 1 -> 103;
               case 2 -> 224;
               case 3 -> 193;
               case 4 -> 152;
               case 5 -> 147;
            }) ^ var16;
            if (var15 % 2 == 0) {
               var14[var15] = (char)((var16 >>> 4 | var16 << 12) & 65535 ^ var12);
            } else {
               var14[var15] = (char)((var16 << 4 | var16 >>> 12) & 65535 ^ var12);
            }
         } while (++var15 < var14.length);

         var9[var10] = new String(var14);
         var10++;
         var11 = var11 + var13 + 1;
      } while (var11 < var8);

      bb = var9;
      aaa = new Object[var9.length];
      byte var21 = 0;
      ba = new int[10];
      byte var24 = 0;
      byte[] var10002 = "\u0083\u0015£Ì\u0015\u001c|ôuYèl\u0013«O\u008dT\u0099j¦X[Zá²ËHUý'õ6Ål\u0088íne\u0004\u000b".getBytes("ISO-8859-1");

      int var57;
      do {
         ba[var21] = ((var10002[var24] & 255) << 24 | (var10002[var24 + 1] & 255) << 16 | (var10002[var24 + 2] & 255) << 8 | var10002[var24 + 3] & 255)
            ^ -636072437;
         var21 += 1;
         var57 = var24 + 4;
         var24 += 4;
      } while (var57 < var10002.length);

      String[] var0 = new String[4];
      int var4 = 0;
      String var3;
      int var5 = (var3 = aa((short)-16349, 1786953359, -1782140614, -1453682871, -1610460645, 15379, -1234230329)).length();
      int var2 = a(429374609, var17 ^ -813920087);
      int var19 = -1;

      label102:
      while (true) {
         String var22 = var3.substring(++var19, var19 + var2);
         byte var27 = -1;

         while (true) {
            label97: {
               char[] var29 = var22.toCharArray();
               var57 = var29.length;
               int var6 = 0;
               var44 = var29;
               int var32 = var57;
               char[] var61;
               int var75;
               if (var57 <= 1) {
                  var61 = var29;
                  var75 = var6;
               } else {
                  var44 = var29;
                  var32 = var57;
                  if (var57 <= var6) {
                     break label97;
                  }

                  var61 = var29;
                  var75 = var6;
               }

               while (true) {
                  var61[var75] = (char)(var61[var75] ^ switch (var6 % a(429374611, var17 ^ 959503330)) {
                     case 0 -> a(429374610, var17 ^ 1606582177);
                     case 1 -> a(429374613, var17 ^ 418405011);
                     case 2 -> a(429374612, var17 ^ 338848442);
                     case 3 -> a(429374615, var17 ^ -22905919);
                     case 4 -> a(429374614, var17 ^ -1320237821);
                     case 5 -> a(429374617, var17 ^ -1996113723);
                     default -> a(429374616, var17 ^ 571226012);
                  });
                  var6++;
                  if (var32 == 0) {
                     var75 = var32;
                     var61 = var44;
                  } else {
                     if (var32 <= var6) {
                        break;
                     }

                     var61 = var44;
                     var75 = var6;
                  }
               }
            }

            String var68 = new String(var44).intern();
            switch (var27) {
               case 0:
                  var0[var4++] = var68;
                  if ((var19 += var2) >= var5) {
                     aa = new baabba(aabbaaaba.aaab(var0[1]));
                     b = new baabba(aabbaaaba.aaab(var0[0]));
                     a = b();
                     return;
                  }

                  var2 = var3.charAt(var19);
                  break;
               default:
                  var0[var4++] = var68;
                  if ((var19 += var2) < var5) {
                     var2 = var3.charAt(var19);
                     continue label102;
                  }

                  var5 = (var3 = aa(20050, 1786953358, -159856604, 444123888, 863357964, 27742, 1533551752)).length();
                  var2 = a(429374608, var17 ^ 1500860310);
                  var19 = -1;
            }

            var22 = var3.substring(++var19, var19 + var2);
            var27 = 0;
         }
      }
   }

   private baabba(ababbbbaa var3) {
      this.ab = var3;
   }

   @Override
   public String toString() {
      return this.ab.abab();
   }
}
