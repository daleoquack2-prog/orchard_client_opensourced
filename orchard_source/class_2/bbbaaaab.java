package nsc;

import net.fabricmc.api.EnvType;
import net.fabricmc.api.Environment;

@Environment(EnvType.CLIENT)
public enum bbbaaaab {
   private static final Object[] aaa;
   private static final String[] bb;
   private static final int[] b;
   public static final bbbaaaab aa;
   public static final bbbaaaab ab;
   private final ababbbbaa ba;
   private static final bbbaaaab[] a;

   private static String ba(int var0, int var1) {
      int var3 = var0 ^ 452399462;
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
      int var7 = (var6.getClassName().hashCode() ^ var6.getMethodName().hashCode()) >> 16 ^ -1085649994;
      int var8 = 0;

      do {
         var4[var8] = (char)(var4[var8] ^ switch (var8 & 31) {
            default -> 167;
            case 1 -> 50;
            case 2 -> 225;
            case 3 -> 126;
            case 4 -> 162;
            case 5 -> 24;
            case 6 -> 192;
            case 7 -> 223;
            case 8 -> 165;
            case 9 -> 221;
            case 10 -> 69;
            case 11 -> 143;
            case 12 -> 179;
            case 13 -> 54;
            case 14 -> 240;
            case 15 -> 64;
            case 16 -> 38;
            case 17 -> 19;
            case 18 -> 237;
            case 19 -> 190;
            case 20 -> 92;
            case 21 -> 34;
            case 22 -> 22;
            case 23 -> 234;
            case 24 -> 28;
            case 25 -> 26;
            case 26 -> 141;
            case 27 -> 31;
            case 28 -> 11;
            case 29 -> 34;
            case 30 -> 105;
            case 31 -> 155;
         } ^ var1 >> 16 ^ var7);
      } while (++var8 < var4.length);

      return new String(var4).intern();
   }

   private static bbbaaaab[] aa() {
      return new bbbaaaab[]{ab, aa};
   }

   public static bbbaaaab b(String var0) {
      return Enum.valueOf(bbbaaaab.class, var0);
   }

   private bbbaaaab(ababbbbaa var3) {
      this.ba = var3;
   }

   // $VF: Irreducible bytecode was duplicated to produce valid code
   static {
      int var17 = 2121517315;
      int var8 = "\u0015Ꮃ咰ṫ쐓ᖝꓱ᎓Ⓐያ쐗ܝ䳶ታ\uf4b1ၫ\uf410Խ쓰᱓沵ો\n䵭ଧ䙵讅䫣덤䵍댣䰕䮃".length();
      short var12 = 29016;
      String var7 = "\u0015Ꮃ咰ṫ쐓ᖝꓱ᎓Ⓐያ쐗ܝ䳶ታ\uf4b1ၫ\uf410Խ쓰᱓沵ો\n䵭ଧ䙵讅䫣덤䵍댣䰕䮃";
      int var10 = 0;
      String[] var9 = new String[2];
      int var11 = 0;

      do {
         char var13 = var7.charAt(var11);
         int var15 = 0;
         char[] var14 = var7.substring(var11 + 1, var11 + 1 + var13).toCharArray();

         do {
            int var16 = var14[var15];

            var16 = (char)(switch (var15 % 6) {
               default -> 0;
               case 1 -> 115;
               case 2 -> 216;
               case 3 -> 208;
               case 4 -> 206;
               case 5 -> 50;
            }) ^ var16;
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
      b = new int[9];
      byte var21 = 0;
      int var10001 = 0;
      byte[] var10002 = "JãÊ!\"o\u008b3%åI\u0087\u0010{\u0099¯\u0085\tÑnZþ·j\u000f \u0097PÇðr~7\u008bô5".getBytes("ISO-8859-1");

      int var56;
      do {
         b[var21] = (
               (var10002[var10001] & 255) << 24 | (var10002[var10001 + 1] & 255) << 16 | (var10002[var10001 + 2] & 255) << 8 | var10002[var10001 + 3] & 255
            )
            ^ 1862919936;
         var21 += 1;
         var56 = var10001 + 4;
         var10001 += 4;
      } while (var56 < var10002.length);

      String[] var0 = new String[4];
      int var4 = 0;
      String var3;
      int var5 = (var3 = ba(452399462, var17 ^ -293620115)).length();
      int var2 = a(1979242517, var17 ^ 778159269);
      int var19 = -1;

      label103:
      while (true) {
         String var22 = var3.substring(++var19, var19 + var2);
         var10001 = (byte)-1;

         while (true) {
            label98: {
               char[] var28 = var22.toCharArray();
               var56 = var28.length;
               int var6 = 0;
               var43 = var28;
               var10001 = var56;
               char[] var60;
               int var74;
               if (var56 <= 1) {
                  var60 = var28;
                  var74 = var6;
               } else {
                  var43 = var28;
                  var10001 = var56;
                  if (var56 <= var6) {
                     break label98;
                  }

                  var60 = var28;
                  var74 = var6;
               }

               while (true) {
                  var60[var74] = (char)(var60[var74] ^ switch (var6 % a(1979242516, var17 ^ 1189971385)) {
                     case 0 -> a(1979242519, var17 ^ 1097287314);
                     case 1 -> a(1979242518, var17 ^ 1962514256);
                     case 2 -> a(1979242513, var17 ^ -510927248);
                     case 3 -> a(1979242512, var17 ^ 1048361077);
                     case 4 -> a(1979242515, var17 ^ 1797429715);
                     case 5 -> a(1979242514, var17 ^ -1552778090);
                     default -> a(1979242525, var17 ^ 1393162957);
                  });
                  var6++;
                  if (var10001 == 0) {
                     var74 = var10001;
                     var60 = var43;
                  } else {
                     if (var10001 <= var6) {
                        break;
                     }

                     var60 = var43;
                     var74 = var6;
                  }
               }
            }

            String var67 = new String(var43).intern();
            switch (var10001) {
               case 0:
                  var0[var4++] = var67;
                  if ((var19 += var2) >= var5) {
                     ab = new bbbaaaab(aabbaaaba.aaab(var0[1]));
                     aa = new bbbaaaab(aabbaaaba.aaab(var0[0]));
                     a = aa();
                     return;
                  }

                  var2 = var3.charAt(var19);
                  break;
               default:
                  var0[var4++] = var67;
                  if ((var19 += var2) < var5) {
                     var2 = var3.charAt(var19);
                     continue label103;
                  }

                  var5 = (var3 = ba(452399463, var17 ^ 481410146)).length();
                  var2 = 4;
                  var19 = -1;
            }

            var22 = var3.substring(++var19, var19 + var2);
            var10001 = (byte)0;
         }
      }
   }

   private static int a(int var0, int var1) {
      int var2 = b[var0 ^ 1979242517] ^ var1 ^ var0;
      var2 ^= 4650;
      var2 -= 12225;
      var2 += 27882;
      var2 -= 64309;
      var2 -= 1551;
      var2 -= 49399;
      return var2 + 39522;
   }

   @Override
   public String toString() {
      return this.ba.abab();
   }

   public ababbbbaa ab() {
      return this.ba;
   }
}
