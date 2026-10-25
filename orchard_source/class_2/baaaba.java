package nsc;

import net.fabricmc.api.EnvType;
import net.fabricmc.api.Environment;

@Environment(EnvType.CLIENT)
public enum baaaba {
   public static final baaaba aa;
   private static final baaaba[] ab;
   private static final int[] a;
   public static final baaaba b;
   public static final baaaba ba;
   private static final Object[] aba;
   public static final baaaba bb;
   private static final String[] aab;
   private final ababbbbaa aaa;

   private static String aa(char var0, int var1, char var2) {
      int var3 = var0 ^ '\ue2e3';
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
      int var8 = (var7.getClassName().hashCode() ^ var7.getMethodName().hashCode()) >> 16 ^ 1688;
      int var9 = 0;

      do {
         int var10 = var4[var9] + 16058;
         var10 += 48969;
         var10 -= 50630;
         var10 += 51650;
         var10 ^= 24629;
         var10 -= 26194;
         var10 ^= 1238;
         var10 ^= 46116;
         var4[var9] = (char)(var10 ^ var8 ^ var2 ^ var1 >> 16);
      } while (++var9 < var4.length);

      return new String(var4).intern();
   }

   private baaaba(ababbbbaa var3) {
      this.aaa = var3;
   }

   @Override
   public String toString() {
      return this.aaa.abab();
   }

   private static baaaba[] b() {
      return new baaaba[]{aa, bb, ba, b};
   }

   private static int a(int var0, int var1) {
      int var2 = a[var0 ^ 1846867284] ^ var1 ^ var0;
      var2 += 27484;
      var2 -= 2442;
      var2 ^= 65271;
      var2 ^= 19630;
      var2 -= 20066;
      var2 ^= 52948;
      return var2 + 25125;
   }

   // $VF: Irreducible bytecode was duplicated to produce valid code
   static {
      int var23 = 675628277;
      String[] var10000 = new String[2];
      int var17 = 0;
      int var16 = 0;
      String[] var15 = var10000;
      short var18 = 24349;
      int var14 = "-㴿鱡㪧벥㨉ﳹ㵼ﱻ㵸籺㮇ᱠ㴏岣㶹鳢㬼鱣㷸鱻㵷履㲿粼㶹㳴㨤㱸㷰鱸㨧㱸㾗\udca1㲱᳡㴔\udc7a㩰뱺㳏뱼㽗㲣㶑\u0013릇㹰맿\udebb옉뻨믌\ude64뮐ᾕ믗㹲륷ằ웹\udeed뮌鹬롰".length();
      String var13 = "-㴿鱡㪧벥㨉ﳹ㵼ﱻ㵸籺㮇ᱠ㴏岣㶹鳢㬼鱣㷸鱻㵷履㲿粼㶹㳴㨤㱸㷰鱸㨧㱸㾗\udca1㲱᳡㴔\udc7a㩰뱺㳏뱼㽗㲣㶑\u0013릇㹰맿\udebb옉뻨믌\ude64뮐ᾕ믗㹲륷ằ웹\udeed뮌鹬롰";

      do {
         char var19 = var13.charAt(var17);
         int var10001 = var17 + 1;
         int var10002 = var17 + 1;
         int var21 = 0;
         char[] var20 = var13.substring(var10001, var10002 + var19).toCharArray();

         do {
            int var22 = var20[var21];

            var22 = (char)(switch (var21 % 5) {
               default -> 8;
               case 1 -> 147;
               case 2 -> 136;
               case 3 -> 87;
               case 4 -> 142;
            }) ^ var22;
            if (var21 % 2 == 0) {
               var20[var21] = (char)((var22 >>> 3 | var22 << 13) & 65535 ^ var18);
            } else {
               var20[var21] = (char)((var22 << 3 | var22 >>> 13) & 65535 ^ var18);
            }
         } while (++var21 < var20.length);

         var15[var16] = new String(var20);
         var16++;
         var17 = var17 + var19 + 1;
      } while (var17 < var14);

      aab = var15;
      aba = new Object[var15.length];
      int var9 = 1534652644;
      byte[] var7 = "1Ö\u0098`}$\u0010¦t(_\u000fè$êÚ,¢Röl\u0012\u0000gÄjç\u0099åÆ\u0007&ÁÒ{\u009bv\u001dÜ_@\rÓu¾\t÷\u000e\u0011\rêû".getBytes("ISO-8859-1");
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

      String[] var0 = new String[a(1846867284, var23 ^ -754882357)];
      int var4 = 0;
      String var3;
      int var5 = (var3 = aa('\ue2e3', var23 ^ -1443216163, '\uf006')).length();
      int var2 = a(1846867285, var23 ^ -1611407336);
      int var25 = -1;

      label98:
      while (true) {
         String var29 = var3.substring(++var25, var25 + var2);
         int var31 = -1;

         while (true) {
            char[] var43;
            label93: {
               char[] var33 = var29.toCharArray();
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
                     break label93;
                  }

                  var51 = var33;
                  var10004 = var6;
               }

               while (true) {
                  var51[var10004] = (char)(var51[var10004] ^ switch (var6 % a(1846867287, var23 ^ 183704179)) {
                     case 0 -> a(1846867280, var23 ^ -831137759);
                     case 1 -> a(1846867281, var23 ^ -1899629823);
                     case 2 -> a(1846867282, var23 ^ 649948528);
                     case 3 -> a(1846867283, var23 ^ 118590651);
                     case 4 -> a(1846867292, var23 ^ 587592003);
                     case 5 -> a(1846867293, var23 ^ -1798678953);
                     default -> a(1846867294, var23 ^ -1562748517);
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
                     aa = new baaaba(aabbaaaba.aaab(var0[0]));
                     bb = new baaaba(aabbaaaba.aaab(var0[5]));
                     ba = new baaaba(aabbaaaba.aaab(var0[1]));
                     b = new baaaba(aabbaaaba.aaab(var0[a(1846867288, var23 ^ -203810226)]));
                     ab = b();
                     return;
                  }

                  var2 = var3.charAt(var25);
                  break;
               default:
                  var0[var4++] = var58;
                  if ((var25 += var2) < var5) {
                     var2 = var3.charAt(var25);
                     continue label98;
                  }

                  var5 = (var3 = aa('\ue2e2', var23 ^ -867550916, '舽')).length();
                  var2 = a(1846867286, var23 ^ -1761628238);
                  var25 = -1;
            }

            var29 = var3.substring(++var25, var25 + var2);
            var31 = 0;
         }
      }
   }
}
