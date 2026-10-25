package nsc;

import net.fabricmc.api.EnvType;
import net.fabricmc.api.Environment;

@Environment(EnvType.CLIENT)
enum bbabaaba implements bbaabba {
   private static final Object[] aaa;
   public static final bbabaaba aa;
   private final ababbbbaa ab;
   private static final int[] b;
   public static final bbabaaba a;
   private static final String[] bb;
   private static final bbabaaba[] ba;

   private bbabaaba(ababbbbaa var3) {
      this.ab = var3;
   }

   @Override
   public String toString() {
      return this.ab.abab();
   }

   // $VF: Irreducible bytecode was duplicated to produce valid code
   static {
      int var17 = 551503899;
      String[] var9 = new String[2];
      int var10001 = "\u0012䥢뾏俭羓䥔念䛂\udf8e俭瞒䪴뿵䛂澌䷍澓䍴ῶ\u0013ﺢ힢節ើ︴쟙車\uefa1\uf46d澽﨔韘｢Ꞣ\uf86d㾿Ｔ䟙\uf402".length();
      short var12 = 1101;
      int var11 = 0;
      int var10 = 0;
      int var8 = var10001;
      String var7 = "\u0012䥢뾏俭羓䥔念䛂\udf8e俭瞒䪴뿵䛂澌䷍澓䍴ῶ\u0013ﺢ힢節ើ︴쟙車\uefa1\uf46d澽﨔韘｢Ꞣ\uf86d㾿Ｔ䟙\uf402";

      do {
         char var13 = var7.charAt(var11);
         int var15 = 0;
         char[] var14 = var7.substring(var11 + 1, var11 + 1 + var13).toCharArray();

         do {
            int var16 = var14[var15];

            var16 = (char)(switch (var15 % 6) {
               default -> 93;
               case 1 -> 94;
               case 2 -> 146;
               case 3 -> 65;
               case 4 -> 11;
               case 5 -> 38;
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
      byte var21 = 0;
      int var24 = 0;
      byte[] var10002 = "¢Í¯ \u0000K;P5qø\u0012êò\u0099\u0017(\u009c?õ³ê k\u001f\u000fUÖ_µ)\u0003\u0096'Ú\u0006".getBytes("ISO-8859-1");
      b = new int[9];

      int var57;
      do {
         b[var21] = ((var10002[var24] & 255) << 24 | (var10002[var24 + 1] & 255) << 16 | (var10002[var24 + 2] & 255) << 8 | var10002[var24 + 3] & 255)
            ^ -1374005130;
         var21 += 1;
         var57 = var24 + 4;
         var24 += 4;
      } while (var57 < var10002.length);

      String[] var0 = new String[4];
      int var4 = 0;
      String var3;
      int var5 = (var3 = aa(58, (short)29923, (byte)-90, (short)15827, 77, -1298985379, -216285205)).length();
      int var2 = 5;
      int var19 = -1;

      label97:
      while (true) {
         String var22 = var3.substring(++var19, var19 + var2);
         var24 = (byte)-1;

         while (true) {
            label92: {
               char[] var29 = var22.toCharArray();
               var57 = var29.length;
               int var6 = 0;
               var44 = var29;
               var24 = var57;
               char[] var61;
               int var75;
               if (var57 <= 1) {
                  var61 = var29;
                  var75 = var6;
               } else {
                  var44 = var29;
                  var24 = var57;
                  if (var57 <= var6) {
                     break label92;
                  }

                  var61 = var29;
                  var75 = var6;
               }

               while (true) {
                  var61[var75] = (char)(var61[var75] ^ switch (var6 % b(-480012869, var17 ^ 1844412935)) {
                     case 0 -> b(-480012872, var17 ^ 1490370957);
                     case 1 -> b(-480012871, var17 ^ -2024398764);
                     case 2 -> b(-480012866, var17 ^ 1161332299);
                     case 3 -> b(-480012865, var17 ^ -565274350);
                     case 4 -> b(-480012868, var17 ^ 1923869780);
                     case 5 -> b(-480012867, var17 ^ 840011921);
                     default -> b(-480012878, var17 ^ -75275361);
                  });
                  var6++;
                  if (var24 == 0) {
                     var75 = var24;
                     var61 = var44;
                  } else {
                     if (var24 <= var6) {
                        break;
                     }

                     var61 = var44;
                     var75 = var6;
                  }
               }
            }

            String var68 = new String(var44).intern();
            switch (var24) {
               case 0:
                  var0[var4++] = var68;
                  if ((var19 += var2) >= var5) {
                     aa = new bbabaaba(aabbaaaba.aaab(var0[3]));
                     a = new bbabaaba(aabbaaaba.aaab(var0[1]));
                     ba = a();
                     return;
                  }

                  var2 = var3.charAt(var19);
                  break;
               default:
                  var0[var4++] = var68;
                  if ((var19 += var2) < var5) {
                     var2 = var3.charAt(var19);
                     continue label97;
                  }

                  var5 = (var3 = aa((byte)-74, 28783, 68, (short)-7918, (byte)-103, 1237855242, -216285206)).length();
                  var2 = b(-480012870, var17 ^ -815175407);
                  var19 = -1;
            }

            var22 = var3.substring(++var19, var19 + var2);
            var24 = (byte)0;
         }
      }
   }

   private static String aa(byte var0, short var1, byte var2, short var3, byte var4, int var5, int var6) {
      int var11 = var6 ^ -216285205;
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
      int var8 = (var14.getClassName().hashCode() ^ var14.getMethodName().hashCode()) >> 16 ^ 2475;

      for (int var9 = 0; var9 < var10.length; var9++) {
         var10[var9] = (char)(var10[var9] ^ '쇦' ^ var8 ^ var3 ^ var6 ^ var0 ^ var1 ^ var4 ^ var5 ^ var2);
      }

      return new String(var10).intern();
   }

   private static bbabaaba[] a() {
      return new bbabaaba[]{aa, a};
   }

   private static int b(int var0, int var1) {
      int var2 = b[var0 ^ -480012870] ^ var1 ^ var0;
      var2 -= 19508;
      var2 ^= 40013;
      var2 += 41343;
      var2 -= 58270;
      var2 -= 19987;
      var2 -= 6804;
      var2 -= 21358;
      return var2 - 28101;
   }
}
