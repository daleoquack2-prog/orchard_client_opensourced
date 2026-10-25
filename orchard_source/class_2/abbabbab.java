package nsc;

import net.fabricmc.api.EnvType;
import net.fabricmc.api.Environment;

@Environment(EnvType.CLIENT)
public enum abbabbab {
   private static final abbabbab[] aa;
   public static final abbabbab b;
   private static final int[] ba;
   private static final Object[] aaa;
   private static final String[] bb;
   private final ababbbbaa ab;
   public static final abbabbab a;

   private static String ab(short var0, int var1, char var2, int var3, int var4, byte var5, int var6) {
      int var11 = var6 ^ -790623020;
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
      int var8 = (var14.getClassName().hashCode() ^ var14.getMethodName().hashCode()) >> 16 ^ 32387;
      int var9 = 0;

      do {
         var10[var9] = (char)(var10[var9] ^ '쓓' ^ var6 ^ var2 ^ var1 ^ var8 ^ var4 ^ var0 ^ var3 ^ var5);
      } while (++var9 < var10.length);

      return new String(var10).intern();
   }

   public static abbabbab b(String var0) {
      return Enum.valueOf(abbabbab.class, var0);
   }

   // $VF: Irreducible bytecode was duplicated to produce valid code
   static {
      int var23 = 381266661;
      String[] var15 = new String[2];
      short var18 = 26886;
      int var10001 = "\u0013苗乚藍渘菚乮聐麑蔀Ḗ螧繝蕍丞膪鹪薀캗蓠\u0012뾩f맳․뻴U롎삫뭾〮뵹\u2065볃!뽄聑붾\uf0ab".length();
      int var17 = 0;
      int var14 = var10001;
      int var16 = 0;
      String var13 = "\u0013苗乚藍渘菚乮聐麑蔀Ḗ螧繝蕍丞膪鹪薀캗蓠\u0012뾩f맳․뻴U롎삫뭾〮뵹\u2065볃!뽄聑붾\uf0ab";

      do {
         char var19 = var13.charAt(var17);
         char[] var10000 = var13.substring(var17 + 1, var17 + 1 + var19).toCharArray();
         int var21 = 0;
         char[] var20 = var10000;

         do {
            int var22 = var20[var21];

            var22 = (char)(switch (var21 % 5) {
               default -> 233;
               case 1 -> 222;
               case 2 -> 19;
               case 3 -> 158;
               case 4 -> 148;
            }) ^ var22;
            if (var21 % 2 == 0) {
               var20[var21] = (char)((var22 >>> 4 | var22 << 12) & 65535 ^ var18);
            } else {
               var20[var21] = (char)((var22 << 4 | var22 >>> 12) & 65535 ^ var18);
            }
         } while (++var21 < var20.length);

         var15[var16] = new String(var20);
         var16++;
         var17 = var17 + var19 + 1;
      } while (var17 < var14);

      bb = var15;
      aaa = new Object[var15.length];
      int var9 = -2047796548;
      byte[] var7 = "lFjAw\u0012@?Á\u00915\u008fÕe¿\u00803xj\r\u001b$ÜD|\u000f\u0012á\\AHÐÜ7=\u0082".getBytes("ISO-8859-1");
      int var8 = var7.length / 4;
      ba = new int[var8];
      byte var10 = 0;
      int var11 = 0;

      do {
         int var12 = (var7[var10] & 255) << 24 | (var7[var10 + 1] & 255) << 16 | (var7[var10 + 2] & 255) << 8 | var7[var10 + 3] & 255;
         var12 ^= var9;
         ba[var11] = var12;
         var10 += 4;
      } while (++var11 < var8);

      String[] var0 = new String[4];
      int var4 = 0;
      String var3;
      int var5 = (var3 = ab((short)-162, 206404940, (char)'뒇', -1820051061, -918217235, (byte)-113, -790623020)).length();
      int var2 = a(276751874, var23 ^ -277848185);
      int var25 = -1;

      label96:
      while (true) {
         String var29 = var3.substring(++var25, var25 + var2);
         int var31 = -1;

         while (true) {
            char[] var42;
            label91: {
               char[] var33 = var29.toCharArray();
               int var10003 = var33.length;
               int var6 = 0;
               var42 = var33;
               var31 = var10003;
               char[] var50;
               int var10004;
               if (var10003 <= 1) {
                  var50 = var33;
                  var10004 = var6;
               } else {
                  var42 = var33;
                  var31 = var10003;
                  if (var10003 <= var6) {
                     break label91;
                  }

                  var50 = var33;
                  var10004 = var6;
               }

               while (true) {
                  var50[var10004] = (char)(var50[var10004] ^ switch (var6 % a(276751875, var23 ^ -198937105)) {
                     case 0 -> a(276751872, var23 ^ 1118244793);
                     case 1 -> a(276751873, var23 ^ 1448315472);
                     case 2 -> a(276751878, var23 ^ -1337042594);
                     case 3 -> a(276751879, var23 ^ -1743589456);
                     case 4 -> a(276751876, var23 ^ -13031207);
                     case 5 -> a(276751877, var23 ^ -545817805);
                     default -> a(276751882, var23 ^ 1593904766);
                  });
                  var6++;
                  if (var31 == 0) {
                     var10004 = var31;
                     var50 = var42;
                  } else {
                     if (var31 <= var6) {
                        break;
                     }

                     var50 = var42;
                     var10004 = var6;
                  }
               }
            }

            String var57 = new String(var42).intern();
            switch (var31) {
               case 0:
                  var0[var4++] = var57;
                  if ((var25 += var2) >= var5) {
                     a = new abbabbab(aabbaaaba.aaab(var0[1]));
                     b = new abbabbab(aabbaaaba.aaab(var0[3]));
                     aa = aa();
                     return;
                  }

                  var2 = var3.charAt(var25);
                  break;
               default:
                  var0[var4++] = var57;
                  if ((var25 += var2) < var5) {
                     var2 = var3.charAt(var25);
                     continue label96;
                  }

                  var5 = (var3 = ab((short)6182, -49731070, (char)'\uddd2', 591400291, 1968434232, 24, -790623019)).length();
                  var2 = 5;
                  var25 = -1;
            }

            var29 = var3.substring(++var25, var25 + var2);
            var31 = 0;
         }
      }
   }

   private static abbabbab[] aa() {
      return new abbabbab[]{a, b};
   }

   private static int a(int var0, int var1) {
      int var2 = ba[var0 ^ 276751874] ^ var1 ^ var0;
      var2 ^= 48497;
      var2 ^= 54952;
      var2 += 50653;
      var2 += 65215;
      var2 ^= 17213;
      var2 -= 21200;
      var2 ^= 32698;
      var2 -= 44741;
      return var2 - 37868;
   }

   @Override
   public String toString() {
      return this.ab.abab();
   }

   private abbabbab(ababbbbaa var3) {
      this.ab = var3;
   }
}
