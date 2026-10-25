package nsc;

import net.fabricmc.api.EnvType;
import net.fabricmc.api.Environment;

@Environment(EnvType.CLIENT)
enum babab implements bbaabba {
   public static final babab aa;
   private static final int[] bb;
   private final ababbbbaa ab;
   private static final Object[] aab;
   private static final String[] aaa;
   private static final babab[] a;
   public static final babab b;
   public static final babab ba;

   private static babab[] a() {
      return new babab[]{b, aa, ba};
   }

   private static String aa(char var0, short var1, int var2) {
      int var3 = var0 ^ 30148;
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
      int var8 = (var7.getClassName().hashCode() ^ var7.getMethodName().hashCode()) >> 16 ^ 10591;
      int var9 = 0;

      do {
         int var10 = var4[var9] - '踥';
         var10 += 58514;
         var10 -= 42191;
         var10 += 26160;
         var10 ^= 36637;
         var4[var9] = (char)(var10 ^ var8 ^ var1 ^ var2 >> 16);
      } while (++var9 < var4.length);

      return new String(var4).intern();
   }

   private static int b(int var0, int var1) {
      int var2 = bb[var0 ^ -1222031578] ^ var1 ^ var0;
      var2 ^= 55732;
      var2 ^= 27747;
      var2 -= 21795;
      var2 += 22276;
      var2 += 13621;
      return var2 + 57279;
   }

   // $VF: Irreducible bytecode was duplicated to produce valid code
   static {
      int var23 = -635093659;
      short var18 = 22389;
      int var10001 = "\u001aꮘ訬뛅櫰ꫠ⨖ꮸ詓됵ꪋ\uaad8\uea6a듸\uea2cꪭ꫶ꫨ⨒ꫨ쨫ꨭꫲꭐ䨗똈\uea56\rᑴ墫ᔙ᠋ᑜ㣮଼㢫ᔹ塱ᑼ壮ୄ".length();
      int var17 = 0;
      int var14 = var10001;
      String var13 = "\u001aꮘ訬뛅櫰ꫠ⨖ꮸ詓됵ꪋ\uaad8\uea6a듸\uea2cꪭ꫶ꫨ⨒ꫨ쨫ꨭꫲꭐ䨗똈\uea56\rᑴ墫ᔙ᠋ᑜ㣮଼㢫ᔹ塱ᑼ壮ୄ";
      int var16 = 0;
      String[] var15 = new String[2];

      do {
         char var19 = var13.charAt(var17);
         var10001 = var17 + 1;
         int var10002 = var17 + 1;
         int var21 = 0;
         char[] var20 = var13.substring(var10001, var10002 + var19).toCharArray();

         do {
            int var22 = var20[var21];

            var22 = (char)(switch (var21 % 6) {
               default -> 50;
               case 1 -> 135;
               case 2 -> 135;
               case 3 -> 33;
               case 4 -> 26;
               case 5 -> 188;
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

      aaa = var15;
      aab = new Object[var15.length];
      int var9 = 818397692;
      byte[] var7 = "Ô*\u001eÔB\u001cø\u001aD\u009bö¡·¾¡åÈÖÙÈ°\u0018Z\u009e?m>>É\"\u0094-ü¶\u007fkÂ\u007f\u008e xt\u0088\u0088".getBytes("ISO-8859-1");
      int var8 = var7.length / 4;
      bb = new int[var8];
      byte var10 = 0;
      int var11 = 0;

      do {
         int var12 = (var7[var10] & 255) << 24 | (var7[var10 + 1] & 255) << 16 | (var7[var10 + 2] & 255) << 8 | var7[var10 + 3] & 255;
         var12 ^= var9;
         bb[var11] = var12;
         var10 += 4;
      } while (++var11 < var8);

      String[] var0 = new String[b(-1222031578, var23 ^ 1981806989)];
      int var4 = 0;
      String var3;
      int var5 = (var3 = aa('痄', (short)15661, var23 ^ -4637863)).length();
      int var2 = b(-1222031577, var23 ^ -534175936);
      int var25 = -1;

      label99:
      while (true) {
         String var28 = var3.substring(++var25, var25 + var2);
         int var31 = -1;

         while (true) {
            char[] var43;
            label94: {
               char[] var33 = var28.toCharArray();
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
                     break label94;
                  }

                  var51 = var33;
                  var10004 = var6;
               }

               while (true) {
                  var51[var10004] = (char)(var51[var10004] ^ switch (var6 % b(-1222031579, var23 ^ 361449148)) {
                     case 0 -> b(-1222031582, var23 ^ 1793277599);
                     case 1 -> b(-1222031581, var23 ^ 304987554);
                     case 2 -> b(-1222031584, var23 ^ -1655121456);
                     case 3 -> b(-1222031583, var23 ^ 1796699007);
                     case 4 -> b(-1222031570, var23 ^ 1585682486);
                     case 5 -> b(-1222031569, var23 ^ 1615489529);
                     default -> b(-1222031572, var23 ^ -633245810);
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
                     b = new babab(aabbaaaba.aaab(var0[0]));
                     aa = new babab(aabbaaaba.aaab(var0[4]));
                     ba = new babab(aabbaaaba.aaab(var0[2]));
                     a = a();
                     return;
                  }

                  var2 = var3.charAt(var25);
                  break;
               default:
                  var0[var4++] = var58;
                  if ((var25 += var2) < var5) {
                     var2 = var3.charAt(var25);
                     continue label99;
                  }

                  var5 = (var3 = aa('病', (short)1691, var23 ^ 1881735323)).length();
                  var2 = b(-1222031580, var23 ^ -424799752);
                  var25 = -1;
            }

            var28 = var3.substring(++var25, var25 + var2);
            var31 = 0;
         }
      }
   }

   private babab(ababbbbaa var3) {
      this.ab = var3;
   }

   @Override
   public String toString() {
      return this.ab.abab();
   }
}
