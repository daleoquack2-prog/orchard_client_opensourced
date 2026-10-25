package nsc;

import net.fabricmc.api.EnvType;
import net.fabricmc.api.Environment;

@Environment(EnvType.CLIENT)
enum aaabbaaa {
   public static final aaabbaaa b;
   public static final aaabbaaa aa;
   private static final Object[] aba;
   private static final int[] a;
   private static final String[] aab;
   public static final aaabbaaa ab;
   public static final aaabbaaa ba;
   public static final aaabbaaa bb;
   private static final aaabbaaa[] aaa;

   private static aaabbaaa[] b() {
      return new aaabbaaa[]{aa, b, ab, bb, ba};
   }

   private static int a(int var0, int var1) {
      int var2 = a[var0 ^ -2025273347] ^ var1 ^ var0;
      var2 += 6332;
      var2 ^= 61182;
      var2 ^= 12330;
      var2 ^= 40512;
      var2 += 33359;
      return var2 - 35971;
   }

   public static aaabbaaa aa(String var0) {
      return Enum.valueOf(aaabbaaa.class, var0);
   }

   // $VF: Irreducible bytecode was duplicated to produce valid code
   static {
      int var17 = -1562419491;
      int var10 = 0;
      int var8 = "\u0017䯈摘䨙⑉䬡⒵䡳\ue48a䦌撿䩘ꑚ䥭\ue465䤅꒿䢿꒗䤄撝䥴\ue464䤽\r\uea5c湃\uebf1깒\ueacd\ueeba\ue93b⺌\ue92c\ueeb0\uebb8깆\ue9fd".length();
      int var11 = 0;
      String var7 = "\u0017䯈摘䨙⑉䬡⒵䡳\ue48a䦌撿䩘ꑚ䥭\ue465䤅꒿䢿꒗䤄撝䥴\ue464䤽\r\uea5c湃\uebf1깒\ueacd\ueeba\ue93b⺌\ue92c\ueeb0\uebb8깆\ue9fd";
      String[] var9 = new String[2];
      short var12 = 5781;

      do {
         int var15 = 0;
         char var13 = var7.charAt(var11);
         char[] var14 = var7.substring(var11 + 1, var11 + 1 + var13).toCharArray();

         do {
            int var16 = var14[var15];

            var16 = (char)(switch (var15 % 5) {
               default -> 58;
               case 1 -> 197;
               case 2 -> 7;
               case 3 -> 238;
               case 4 -> 7;
            }) ^ var16;
            if (var15 % 2 == 0) {
               var14[var15] = (char)((var16 >>> 2 | var16 << 14) & 65535 ^ var12);
            } else {
               var14[var15] = (char)((var16 << 2 | var16 >>> 14) & 65535 ^ var12);
            }
         } while (++var15 < var14.length);

         var9[var10] = new String(var14);
         var10++;
         var11 = var11 + var13 + 1;
      } while (var11 < var8);

      aab = var9;
      aba = new Object[var9.length];
      byte var21 = 0;
      int var10001 = 0;
      a = new int[9];
      byte[] var10002 = "wÑ.`ºÎU°ûó\fò\u0005¸Ì\u0099ê\u0088^ÂYä¼xa@êË¦)î¢4ÈÝ±".getBytes("ISO-8859-1");

      int var56;
      do {
         a[var21] = (
               (var10002[var10001] & 255) << 24 | (var10002[var10001 + 1] & 255) << 16 | (var10002[var10001 + 2] & 255) << 8 | var10002[var10001 + 3] & 255
            )
            ^ -490783796;
         var21 += 1;
         var56 = var10001 + 4;
         var10001 += 4;
      } while (var56 < var10002.length);

      String[] var0 = new String[5];
      int var4 = 0;
      String var3;
      int var5 = (var3 = ab(-1551085726, var17 ^ -499903682)).length();
      int var2 = 4;
      int var19 = -1;

      label102:
      while (true) {
         String var22 = var3.substring(++var19, var19 + var2);
         var10001 = (byte)-1;

         while (true) {
            label97: {
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
                     break label97;
                  }

                  var60 = var28;
                  var74 = var6;
               }

               while (true) {
                  var60[var74] = (char)(var60[var74] ^ switch (var6 % a(-2025273348, var17 ^ 2112276142)) {
                     case 0 -> a(-2025273345, var17 ^ 1021026150);
                     case 1 -> a(-2025273346, var17 ^ -1030725876);
                     case 2 -> a(-2025273351, var17 ^ 765513251);
                     case 3 -> a(-2025273352, var17 ^ -1630786388);
                     case 4 -> a(-2025273349, var17 ^ -1503102450);
                     case 5 -> a(-2025273350, var17 ^ 1627487815);
                     default -> a(-2025273355, var17 ^ -203403918);
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
                     aa = new aaabbaaa();
                     b = new aaabbaaa();
                     ab = new aaabbaaa();
                     bb = new aaabbaaa();
                     ba = new aaabbaaa();
                     aaa = b();
                     return;
                  }

                  var2 = var3.charAt(var19);
                  break;
               default:
                  var0[var4++] = var67;
                  if ((var19 += var2) < var5) {
                     var2 = var3.charAt(var19);
                     continue label102;
                  }

                  var5 = (var3 = ab(-1551085725, var17 ^ -901023302)).length();
                  var2 = a(-2025273347, var17 ^ -1325810306);
                  var19 = -1;
            }

            var22 = var3.substring(++var19, var19 + var2);
            var10001 = (byte)0;
         }
      }
   }

   private static String ab(int var0, int var1) {
      int var3 = var0 ^ -1551085726;
      char[] var4 = aab[var3].toCharArray();
      StackTraceElement[] var2 = (StackTraceElement[])aba[var3];
      StackTraceElement[] var5;
      if (var2 != null) {
         var5 = var2;
      } else {
         var5 = new Throwable().getStackTrace();
         aba[var3] = var5;
      }

      StackTraceElement var6 = var5[1];
      int var7 = (var6.getClassName().hashCode() ^ var6.getMethodName().hashCode()) >> 16 ^ -323917621;
      int var8 = 0;

      do {
         var4[var8] = (char)(var4[var8] ^ switch (var8 & 31) {
            default -> 39;
            case 1 -> 163;
            case 2 -> 42;
            case 3 -> 28;
            case 4 -> 57;
            case 5 -> 226;
            case 6 -> 250;
            case 7 -> 145;
            case 8 -> 212;
            case 9 -> 2;
            case 10 -> 17;
            case 11 -> 147;
            case 12 -> 135;
            case 13 -> 233;
            case 14 -> 224;
            case 15 -> 135;
            case 16 -> 236;
            case 17 -> 187;
            case 18 -> 184;
            case 19 -> 183;
            case 20 -> 243;
            case 21 -> 1;
            case 22 -> 188;
            case 23 -> 22;
            case 24 -> 11;
            case 25 -> 194;
            case 26 -> 62;
            case 27 -> 160;
            case 28 -> 236;
            case 29 -> 103;
            case 30 -> 171;
            case 31 -> 190;
         } ^ var1 >> 16 ^ var7);
      } while (++var8 < var4.length);

      return new String(var4).intern();
   }
}
