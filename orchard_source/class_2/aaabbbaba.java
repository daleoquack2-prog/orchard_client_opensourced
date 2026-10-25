package nsc;

import net.fabricmc.api.EnvType;
import net.fabricmc.api.Environment;

@Environment(EnvType.CLIENT)
public enum aaabbbaba {
   private static final int[] bb;
   public static final aaabbbaba aa;
   private static final String[] aaa;
   private final ababbbbaa ab;
   private static final Object[] aab;
   public static final aaabbbaba a;
   private static final aaabbbaba[] ba;
   public static final aaabbbaba b;

   private static String ba(int var0, int var1) {
      int var3 = var0 ^ -2009807707;
      char[] var4 = aaa[var3].toCharArray();
      StackTraceElement[] var2 = (StackTraceElement[])aab[var3];
      StackTraceElement[] var5;
      if (var2 != null) {
         var5 = var2;
      } else {
         var5 = new Throwable().getStackTrace();
         aab[var3] = var5;
      }

      StackTraceElement var6 = var5[1];
      int var7 = (var6.getClassName().hashCode() ^ var6.getMethodName().hashCode()) >> 16 ^ 904331611;
      int var8 = 0;

      do {
         var4[var8] = (char)(var4[var8] ^ switch (var8 & 31) {
            default -> 228;
            case 1 -> 233;
            case 2 -> 114;
            case 3 -> 41;
            case 4 -> 84;
            case 5 -> 170;
            case 6 -> 208;
            case 7 -> 223;
            case 8 -> 9;
            case 9 -> 251;
            case 10 -> 161;
            case 11 -> 88;
            case 12 -> 109;
            case 13 -> 81;
            case 14 -> 11;
            case 15 -> 21;
            case 16 -> 228;
            case 17 -> 153;
            case 18 -> 91;
            case 19 -> 110;
            case 20 -> 122;
            case 21 -> 105;
            case 22 -> 146;
            case 23 -> 140;
            case 24 -> 1;
            case 25 -> 25;
            case 26 -> 194;
            case 27 -> 212;
            case 28 -> 186;
            case 29 -> 209;
            case 30 -> 248;
            case 31 -> 252;
         } ^ var1 >> 16 ^ var7);
      } while (++var8 < var4.length);

      return new String(var4).intern();
   }

   private static aaabbbaba[] aa() {
      return new aaabbbaba[]{a, b, aa};
   }

   private aaabbbaba(ababbbbaa var3) {
      this.ab = var3;
   }

   @Override
   public String toString() {
      return this.ab.abab();
   }

   public static aaabbbaba b(String var0) {
      return Enum.valueOf(aaabbbaba.class, var0);
   }

   // $VF: Irreducible bytecode was duplicated to produce valid code
   static {
      int var23 = 213158320;
      short var18 = 17873;
      int var17 = 0;
      String[] var15 = new String[2];
      int var16 = 0;
      int var14 = "!孾辗䓾잓䷾鞗偞羖䫞ޖ墾枑䚞⾒䲾ޒ吞\udf97䍞鞑䢞辐僾辕䉞瞓嵾\ue795峾䞗厞쾔坾\u0013䆲⒒嫲법倒鲐䥒\ue491圲ᒑ䖲粔庲咔婒Ⲗ䤲沑徒".length();
      String var13 = "!孾辗䓾잓䷾鞗偞羖䫞ޖ墾枑䚞⾒䲾ޒ吞\udf97䍞鞑䢞辐僾辕䉞瞓嵾\ue795峾䞗厞쾔坾\u0013䆲⒒嫲법倒鲐䥒\ue491圲ᒑ䖲粔庲咔婒Ⲗ䤲沑徒";

      do {
         char var19 = var13.charAt(var17);
         char[] var10000 = var13.substring(var17 + 1, var17 + 1 + var19).toCharArray();
         int var21 = 0;
         char[] var20 = var10000;

         do {
            char var22 = var20[var21];
            if (var21 % 2 == 0) {
               var20[var21] = (char)((var22 >>> 5 | var22 << 11) & 65535 ^ var18);
            } else {
               var20[var21] = (char)((var22 << 5 | var22 >>> 11) & 65535 ^ var18);
            }
         } while (++var21 < var20.length);

         var15[var16] = new String(var20);
         var16++;
         var17 = var17 + var19 + 1;
      } while (var17 < var14);

      aaa = var15;
      aab = new Object[var15.length];
      int var9 = -1109778517;
      byte[] var7 = "\u0094#Ú\u008e {h\u0083Lw¦{fþvíÍL\u0089\u0091\u00ad\u008a¼\u009e\u0093¤Ø\u0015rI¢'ô\u0089FQ²\u0001\u009ep\u0084ô¦z".getBytes("ISO-8859-1");
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

      String[] var0 = new String[a(620680993, var23 ^ 28479448)];
      int var4 = 0;
      String var3;
      int var5 = (var3 = ba(-2009807707, var23 ^ -570847808)).length();
      int var2 = a(620680992, var23 ^ -1242939950);
      int var25 = -1;

      label88:
      while (true) {
         String var27 = var3.substring(++var25, var25 + var2);
         int var10001 = -1;

         while (true) {
            char[] var39;
            label83: {
               char[] var30 = var27.toCharArray();
               int var10003 = var30.length;
               int var6 = 0;
               var39 = var30;
               var10001 = var10003;
               char[] var47;
               int var10004;
               if (var10003 <= 1) {
                  var47 = var30;
                  var10004 = var6;
               } else {
                  var39 = var30;
                  var10001 = var10003;
                  if (var10003 <= var6) {
                     break label83;
                  }

                  var47 = var30;
                  var10004 = var6;
               }

               while (true) {
                  var47[var10004] = (char)(var47[var10004] ^ switch (var6 % a(620680994, var23 ^ -210820167)) {
                     case 0 -> a(620680997, var23 ^ 1490935017);
                     case 1 -> a(620680996, var23 ^ 941353313);
                     case 2 -> a(620680999, var23 ^ 104172956);
                     case 3 -> a(620680998, var23 ^ -405212987);
                     case 4 -> a(620681001, var23 ^ 1628967685);
                     case 5 -> a(620681000, var23 ^ 663800826);
                     default -> a(620681003, var23 ^ 291894265);
                  });
                  var6++;
                  if (var10001 == 0) {
                     var10004 = var10001;
                     var47 = var39;
                  } else {
                     if (var10001 <= var6) {
                        break;
                     }

                     var47 = var39;
                     var10004 = var6;
                  }
               }
            }

            String var54 = new String(var39).intern();
            switch (var10001) {
               case 0:
                  var0[var4++] = var54;
                  if ((var25 += var2) >= var5) {
                     a = new aaabbbaba(aabbaaaba.aaab(var0[2]));
                     b = new aaabbbaba(aabbaaaba.aaab(var0[5]));
                     aa = new aaabbbaba(aabbaaaba.aaab(var0[0]));
                     ba = aa();
                     return;
                  }

                  var2 = var3.charAt(var25);
                  break;
               default:
                  var0[var4++] = var54;
                  if ((var25 += var2) < var5) {
                     var2 = var3.charAt(var25);
                     continue label88;
                  }

                  var5 = (var3 = ba(-2009807708, var23 ^ -1120485833)).length();
                  var2 = a(620680995, var23 ^ -639175889);
                  var25 = -1;
            }

            var27 = var3.substring(++var25, var25 + var2);
            var10001 = 0;
         }
      }
   }

   private static int a(int var0, int var1) {
      int var2 = bb[var0 ^ 620680993] ^ var1 ^ var0;
      var2 -= 12227;
      var2 ^= 24419;
      var2 -= 3153;
      var2 += 30975;
      var2 -= 37217;
      var2 += 8337;
      var2 += 3050;
      var2 -= 13441;
      var2 += 23626;
      return var2 ^ 60253;
   }

   public ababbbbaa ab() {
      return this.ab;
   }
}
