package nsc;

import net.fabricmc.api.EnvType;
import net.fabricmc.api.Environment;

@Environment(EnvType.CLIENT)
public enum baabbbb {
   private static final String[] aaa;
   public static final baabbbb aa;
   public static final baabbbb ab;
   private static final Object[] aab;
   private final ababbbbaa ba;
   public static final baabbbb a;
   private static final int[] b;
   private static final baabbbb[] bb;

   private static String aa(char var0, short var1, int var2) {
      int var3 = var0 ^ 1014;
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
      int var8 = (var7.getClassName().hashCode() ^ var7.getMethodName().hashCode()) >> 16 ^ 5724;
      int var9 = 0;

      do {
         int var10 = var4[var9] - 9184;
         var10 -= 54932;
         var10 ^= 9093;
         var10 ^= 2884;
         var10 ^= 48978;
         var10 -= 12255;
         var10 ^= 12585;
         var10 += 16347;
         var10 -= 15099;
         var10 -= 50858;
         var4[var9] = (char)(var10 ^ var8 ^ var1 ^ var2 >> 16);
      } while (++var9 < var4.length);

      return new String(var4).intern();
   }

   private static baabbbb[] b() {
      return new baabbbb[]{a, ab, aa};
   }

   private baabbbb(ababbbbaa var3) {
      this.ba = var3;
   }

   @Override
   public String toString() {
      return this.ba.abab();
   }

   // $VF: Irreducible bytecode was duplicated to produce valid code
   static {
      int var23 = -2079894055;
      int var17 = 0;
      short var18 = 18039;
      int var14 = " 퇶ᮡ텞㮷톎פֿ\ue846㭅\ued2e魅톶뭊\ueff6נּ\ued2e孄\ue81eᭈ퉆孉팆᮶턖鮿\uef3e箷톎孊퍦魀퇮뭈\r\u20ce碋㼦碊↾颋⎾㢉㿎\ud8ff₎\ud8e1㡎".length();
      int var16 = 0;
      String[] var15 = new String[2];
      String var13 = " 퇶ᮡ텞㮷톎פֿ\ue846㭅\ued2e魅톶뭊\ueff6נּ\ued2e孄\ue81eᭈ퉆孉팆᮶턖鮿\uef3e箷톎孊퍦魀퇮뭈\r\u20ce碋㼦碊↾颋⎾㢉㿎\ud8ff₎\ud8e1㡎";

      do {
         char var19 = var13.charAt(var17);
         int var21 = 0;
         char[] var20 = var13.substring(var17 + 1, var17 + 1 + var19).toCharArray();

         do {
            char var22 = var20[var21];
            if (var21 % 2 == 0) {
               var20[var21] = (char)((var22 >>> 3 | var22 << '\r') & 65535 ^ var18);
            } else {
               var20[var21] = (char)((var22 << 3 | var22 >>> '\r') & 65535 ^ var18);
            }
         } while (++var21 < var20.length);

         var15[var16] = new String(var20);
         var16++;
         var17 = var17 + var19 + 1;
      } while (var17 < var14);

      aaa = var15;
      aab = new Object[var15.length];
      int var9 = 1108404706;
      byte[] var7 = "\u0004æè\u0004Z\u0015¢;¦H{\u0096K·è\u0084èÊ|\u000büÏ\u001eU\u000bf®\u0096T7%c".getBytes("ISO-8859-1");
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

      String[] var0 = new String[a(1677237207, var23 ^ -1593115094)];
      int var4 = 0;
      String var3;
      int var5 = (var3 = aa('϶', (short)22474, var23 ^ -1915547668)).length();
      char var2 = 4;
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
                  var46[var10004] = (char)(var46[var10004] ^ switch (var6 % a(1677237206, var23 ^ -412449)) {
                     case 0 -> a(1677237205, var23 ^ 61107580);
                     case 1 -> 3;
                     case 2 -> a(1677237204, var23 ^ -295960668);
                     case 3 -> a(1677237203, var23 ^ 1294363607);
                     case 4 -> a(1677237202, var23 ^ 1495468304);
                     case 5 -> a(1677237201, var23 ^ -1366640489);
                     default -> a(1677237200, var23 ^ -237292639);
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
                     a = new baabbbb(aabbaaaba.aaab(var0[2]));
                     ab = new baabbbb(aabbaaaba.aaab(var0[3]));
                     aa = new baabbbb(aabbaaaba.aaab(var0[5]));
                     bb = b();
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

                  var5 = (var3 = aa('Ϸ', (short)'\uf8ad', var23 ^ 1491565753)).length();
                  var2 = 4;
                  var25 = -1;
            }

            var10000 = var3.substring(++var25, var25 + var2);
            var10001 = 0;
         }
      }
   }

   private static int a(int var0, int var1) {
      int var2 = b[var0 ^ 1677237207] ^ var1 ^ var0;
      var2 ^= 25268;
      var2 -= 39072;
      var2 -= 62701;
      var2 ^= 28735;
      var2 += 12205;
      var2 ^= 41431;
      var2 ^= 9035;
      var2 -= 41697;
      var2 ^= 3713;
      return var2 ^ 51897;
   }
}
