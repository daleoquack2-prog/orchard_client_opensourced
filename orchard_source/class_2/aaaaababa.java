package nsc;

import net.fabricmc.api.EnvType;
import net.fabricmc.api.Environment;

@Environment(EnvType.CLIENT)
enum aaaaababa {
   private static final int[] ba;
   private static final String[] bb;
   private static final aaaaababa[] aa;
   private static final Object[] aaa;
   private final ababbbbaa b;
   public static final aaaaababa a;
   public static final aaaaababa ab;

   // $VF: Irreducible bytecode was duplicated to produce valid code
   static {
      int var23 = 807472346;
      short var18 = 7201;
      int var17 = 0;
      int var16 = 0;
      String[] var15 = new String[2];
      int var14 = "\u0013䫒撰䢆⒄䬪\ue485䦮撢䮞⒐䣎\ue4a8䦚Ⓖ䢖\ue4bc䣎\ue48b䧖\u0013㉥ጸ\u31e5ጌ㏱ጅ\u31ed匸㊁化ス팳ㆽ팵ち팲チጊネ".length();
      String var13 = "\u0013䫒撰䢆⒄䬪\ue485䦮撢䮞⒐䣎\ue4a8䦚Ⓖ䢖\ue4bc䣎\ue48b䧖\u0013㉥ጸ\u31e5ጌ㏱ጅ\u31ed匸㊁化ス팳ㆽ팵ち팲チጊネ";

      do {
         int var21 = 0;
         char var19 = var13.charAt(var17);
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

      bb = var15;
      aaa = new Object[var15.length];
      int var9 = 5233646;
      byte[] var7 = "%7¿Ì\u0002ë¯ï\u0096\u008a¥\u0096\u009cÙË/>\u0015³\tÚ\u000bm\rØ\u009bg\u001d\u0084\u0013Ú\u000fMâºÓ\u0015Xþ{".getBytes("ISO-8859-1");
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
      int var5 = (var3 = ab(-891922931, (byte)-108, (short)-27336, -1909857314, '訩', (char)'履', (short)-20581)).length();
      int var2 = a(-194096626, var23 ^ -516554954);
      int var25 = -1;

      label89:
      while (true) {
         String var10000 = var3.substring(++var25, var25 + var2);
         int var10001 = -1;

         while (true) {
            char[] var38;
            label84: {
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
                     break label84;
                  }

                  var46 = var29;
                  var10004 = var6;
               }

               while (true) {
                  var46[var10004] = (char)(var46[var10004] ^ switch (var6 % a(-194096628, var23 ^ 1384703339)) {
                     case 0 -> a(-194096627, var23 ^ 1490781297);
                     case 1 -> a(-194096630, var23 ^ -99091382);
                     case 2 -> a(-194096629, var23 ^ 503918053);
                     case 3 -> a(-194096632, var23 ^ 479799193);
                     case 4 -> a(-194096631, var23 ^ 1074894148);
                     case 5 -> a(-194096634, var23 ^ -1981745764);
                     default -> a(-194096633, var23 ^ -782582122);
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
                     a = new aaaaababa(aabbaaaba.aaab(var0[3]));
                     ab = new aaaaababa(aabbaaaba.aaab(var0[0]));
                     aa = b();
                     return;
                  }

                  var2 = var3.charAt(var25);
                  break;
               default:
                  var0[var4++] = var53;
                  if ((var25 += var2) < var5) {
                     var2 = var3.charAt(var25);
                     continue label89;
                  }

                  var5 = (var3 = ab(-891922932, 116, (short)-8187, 1507357306, '䘶', '㟊', (short)26835)).length();
                  var2 = a(-194096625, var23 ^ -957747426);
                  var25 = -1;
            }

            var10000 = var3.substring(++var25, var25 + var2);
            var10001 = 0;
         }
      }
   }

   @Override
   public String toString() {
      return this.b.abab();
   }

   private static String ab(int var0, byte var1, short var2, int var3, char var4, char var5, short var6) {
      int var11 = var0 ^ -891922931;
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
      int var8 = (var14.getClassName().hashCode() ^ var14.getMethodName().hashCode()) >> 16 ^ 16199;

      for (int var9 = 0; var9 < var10.length; var9++) {
         var10[var9] = (char)(var10[var9] ^ switch (var9 % 20) {
            default -> 141;
            case 1 -> 242;
            case 2 -> 3;
            case 3 -> 121;
            case 4 -> 240;
            case 5 -> 1;
            case 6 -> 66;
            case 7 -> 141;
            case 8 -> 189;
            case 9 -> 29;
            case 10 -> 107;
            case 11 -> 230;
            case 12 -> 101;
            case 13 -> 206;
            case 14 -> 4;
            case 15 -> 160;
            case 16 -> 91;
            case 17 -> 3;
            case 18 -> 85;
            case 19 -> 117;
         } ^ 55214 ^ var9 ^ var2 ^ var5 ^ var4 ^ var1 ^ var8 ^ var3 ^ var6 ^ var0);
      }

      return new String(var10).intern();
   }

   private static int a(int var0, int var1) {
      int var2 = ba[var0 ^ -194096626] ^ var1 ^ var0;
      var2 ^= 60077;
      var2 ^= 30488;
      var2 -= 30958;
      var2 -= 64658;
      var2 ^= 5336;
      return var2 - 63009;
   }

   private static aaaaababa[] b() {
      return new aaaaababa[]{a, ab};
   }

   public static aaaaababa aa(String var0) {
      return Enum.valueOf(aaaaababa.class, var0);
   }

   private aaaaababa(ababbbbaa var3) {
      this.b = var3;
   }
}
