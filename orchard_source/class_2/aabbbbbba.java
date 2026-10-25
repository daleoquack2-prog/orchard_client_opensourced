package nsc;

import net.fabricmc.api.EnvType;
import net.fabricmc.api.Environment;

@Environment(EnvType.CLIENT)
enum aabbbbbba {
   public static final aabbbbbba aa;
   public static final aabbbbbba ab;
   private static final int[] b;
   private static final Object[] aba;
   private final ababbbbaa ba;
   public static final aabbbbbba a;
   public static final aabbbbbba bb;
   private static final String[] aab;
   private static final aabbbbbba[] aaa;

   // $VF: Irreducible bytecode was duplicated to produce valid code
   static {
      int var18 = -1523935663;
      String var8 = "햂햂했헜헸헙헽헳햚핚헃픱픲햔픷헮햎헾픯픶헽햅헾헗헹헜헪햏픨햟픟헜픭픪픓헪픲픐헫헱햒햑햇ﻖﻎ︵\ufe53︮ﻳﻬ﹃︷︉ﻄ︳ﻐﺗ﹗﹒ﻅ︬﹏ﻐﻖ";
      char[] var9 = "+\u0015".toCharArray();
      byte var14 = -1;
      short var7 = 25807;
      String[] var10 = new String[var9.length];

      while (true) {
         int var11 = 0;
         char var12 = 0;
         char var13 = '\u0000';
         if (var14 == 0) {
            aab = var10;
            aba = new Object[var10.length];
            byte var22 = 0;
            int var10001 = 0;
            b = new int[13];
            byte[] var10002 = "\u0016ÎM\u0017%á\u001céV§\fj\u0007Ê\u0087\u0088bmËï\u001fä\u0012\u009dæ\u0006\u0016\u001f¨p#ÈèÜ\u001f8e\u0006óõoð\u0099£Ü\u0099¿N\bèGù"
               .getBytes("ISO-8859-1");

            int var57;
            do {
               b[var22] = (
                     (var10002[var10001] & 255) << 24
                        | (var10002[var10001 + 1] & 255) << 16
                        | (var10002[var10001 + 2] & 255) << 8
                        | var10002[var10001 + 3] & 255
                  )
                  ^ 1521184714;
               var22 += 1;
               var57 = var10001 + 4;
               var10001 += 4;
            } while (var57 < var10002.length);

            String[] var0 = new String[a(2074527020, var18 ^ 1830062829)];
            int var4 = 0;
            String var3;
            int var5 = (var3 = aa(20232, var18 ^ 679585070, 40571)).length();
            int var2 = a(2074527021, var18 ^ 1580981012);
            int var20 = -1;

            label101:
            while (true) {
               String var23 = var3.substring(++var20, var20 + var2);
               var10001 = (byte)-1;

               while (true) {
                  label96: {
                     char[] var29 = var23.toCharArray();
                     var57 = var29.length;
                     int var6 = 0;
                     var44 = var29;
                     var10001 = var57;
                     char[] var61;
                     int var75;
                     if (var57 <= 1) {
                        var61 = var29;
                        var75 = var6;
                     } else {
                        var44 = var29;
                        var10001 = var57;
                        if (var57 <= var6) {
                           break label96;
                        }

                        var61 = var29;
                        var75 = var6;
                     }

                     while (true) {
                        var61[var75] = (char)(var61[var75] ^ switch (var6 % a(2074527023, var18 ^ 2081439858)) {
                           case 0 -> a(2074527016, var18 ^ 431427048);
                           case 1 -> a(2074527017, var18 ^ 1681839346);
                           case 2 -> a(2074527018, var18 ^ -1646473108);
                           case 3 -> a(2074527019, var18 ^ -743774977);
                           case 4 -> a(2074527012, var18 ^ -1828267828);
                           case 5 -> a(2074527013, var18 ^ 517747925);
                           default -> a(2074527014, var18 ^ 338321313);
                        });
                        var6++;
                        if (var10001 == 0) {
                           var75 = var10001;
                           var61 = var44;
                        } else {
                           if (var10001 <= var6) {
                              break;
                           }

                           var61 = var44;
                           var75 = var6;
                        }
                     }
                  }

                  String var68 = new String(var44).intern();
                  switch (var10001) {
                     case 0:
                        var0[var4++] = var68;
                        if ((var20 += var2) >= var5) {
                           aa = new aabbbbbba(aabbaaaba.aaab(var0[5]));
                           a = new aabbbbbba(
                              aabbaaaba.aaab(var0[a(2074527015, var18 ^ -1488750404)])
                           );
                           bb = new aabbbbbba(aabbaaaba.aaab(var0[4]));
                           ab = new aabbbbbba(
                              aabbaaaba.aaab(var0[a(2074527008, var18 ^ 1932689417)])
                           );
                           aaa = b();
                           return;
                        }

                        var2 = var3.charAt(var20);
                        break;
                     default:
                        var0[var4++] = var68;
                        if ((var20 += var2) < var5) {
                           var2 = var3.charAt(var20);
                           continue label101;
                        }

                        var5 = (var3 = aa(3463, var18 ^ 458745291, 40570)).length();
                        var2 = a(2074527022, var18 ^ 763218834);
                        var20 = -1;
                  }

                  var23 = var3.substring(++var20, var20 + var2);
                  var10001 = (byte)0;
               }
            }
         }

         do {
            var13 = var9[var11];
            char[] var15 = var8.substring(var12, var12 + var13).toCharArray();
            int var16 = 0;

            do {
               short var17 = switch (var16 % 5) {
                  default -> 208;
                  case 1 -> 214;
                  case 2 -> 222;
                  case 3 -> 206;
                  case 4 -> 31;
               };
               var15[var16] = (char)(var15[var16] ^ var17 ^ var7);
            } while (++var16 < var15.length);

            var10[var11] = new String(var15).intern();
            var12 += var13;
         } while (++var11 < var9.length);

         var14 = 0;
      }
   }

   private aabbbbbba(ababbbbaa var3) {
      this.ba = var3;
   }

   private static aabbbbbba[] b() {
      return new aabbbbbba[]{aa, a, bb, ab};
   }

   private static String aa(int var0, int var1, int var2) {
      int var3 = var2 ^ 40571;
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
      int var8 = (var7.getClassName().hashCode() ^ var7.getMethodName().hashCode()) >> 16 ^ 19166;
      int var9 = 0;

      do {
         int var10 = var4[var9] ^ '鮣';
         var10 -= 53916;
         var10 += 45176;
         var10 ^= 21683;
         var10 -= 21214;
         var10 += 33701;
         var10 -= 20803;
         var10 -= 38524;
         var10 ^= 33178;
         var4[var9] = (char)(var10 ^ var8 ^ var0 ^ var1 >> 16);
      } while (++var9 < var4.length);

      return new String(var4).intern();
   }

   @Override
   public String toString() {
      return this.ba.abab();
   }

   private static int a(int var0, int var1) {
      int var2 = b[var0 ^ 2074527020] ^ var1 ^ var0;
      var2 += 43275;
      var2 += 33494;
      var2 ^= 14772;
      var2 ^= 56697;
      var2 -= 11233;
      var2 += 8157;
      var2 ^= 32624;
      return var2 + 14169;
   }
}
