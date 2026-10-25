package nsc;

import net.fabricmc.api.EnvType;
import net.fabricmc.api.Environment;

@Environment(EnvType.CLIENT)
public enum aaabbabaa implements bbaabba {
   private static final Object[] aab;
   public static final aaabbabaa aa;
   private static final aaabbabaa[] ab;
   public static final aaabbabaa b;
   private final ababbbbaa ba;
   private static final String[] aaa;
   private static final int[] bb;
   public static final aaabbabaa a;

   private aaabbabaa(ababbbbaa var3) {
      this.ba = var3;
   }

   @Override
   public String toString() {
      return this.ba.abab();
   }

   // $VF: Irreducible bytecode was duplicated to produce valid code
   static {
      int var23 = -1919687743;
      int var16 = 0;
      String[] var10002 = new String[2];
      short var18 = 16917;
      String[] var15 = var10002;
      int var10001 = "\u001e䑫\uf44e䕧\uf457䓯둨䟇\uf443䓫㑕䒿㑖䐣㑗䒓瑃䕛둋䞗瑹䔗둉䑫둌䔋\uf440䗫瑄䒏瑇\u0015㞀荽㛈썤㟜荔㐼荪㛐䍣㛸썥㞀썼㟠썡㘌䍽㔌荌㝸".length();
      int var17 = 0;
      int var14 = var10001;
      String var13 = "\u001e䑫\uf44e䕧\uf457䓯둨䟇\uf443䓫㑕䒿㑖䐣㑗䒓瑃䕛둋䞗瑹䔗둉䑫둌䔋\uf440䗫瑄䒏瑇\u0015㞀荽㛈썤㟜荔㐼荪㛐䍣㛸썥㞀썼㟠썡㘌䍽㔌荌㝸";

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

      aaa = var15;
      aab = new Object[var15.length];
      int var9 = 1027683771;
      byte[] var7 = "\u008bà:÷\u0092Vt;ç:\n\u0081qÇYßÜ7Ñ|`¸¨\u0082.BÝ\u001f:Èà\u0087ùÕ_Ë½Ú\u001e\u008a¬¢\u0011?".getBytes("ISO-8859-1");
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

      String[] var0 = new String[a(1804512827, var23 ^ 1354568375)];
      int var4 = 0;
      String var3;
      int var5 = (var3 = b('拓', 1213, -775679531, (char)'좕')).length();
      int var2 = a(1804512826, var23 ^ 1225481338);
      int var25 = -1;

      label88:
      while (true) {
         String var10000 = var3.substring(++var25, var25 + var2);
         int var28 = -1;

         while (true) {
            label83: {
               char[] var30 = var10000.toCharArray();
               int var10003 = var30.length;
               int var6 = 0;
               var40 = var30;
               var28 = var10003;
               char[] var48;
               int var10004;
               if (var10003 <= 1) {
                  var48 = var30;
                  var10004 = var6;
               } else {
                  var40 = var30;
                  var28 = var10003;
                  if (var10003 <= var6) {
                     break label83;
                  }

                  var48 = var30;
                  var10004 = var6;
               }

               while (true) {
                  var48[var10004] = (char)(var48[var10004] ^ switch (var6 % a(1804512824, var23 ^ -1432718947)) {
                     case 0 -> a(1804512831, var23 ^ 124509154);
                     case 1 -> a(1804512830, var23 ^ -1142587154);
                     case 2 -> a(1804512829, var23 ^ -182454962);
                     case 3 -> a(1804512828, var23 ^ -510334423);
                     case 4 -> a(1804512819, var23 ^ 579368867);
                     case 5 -> a(1804512818, var23 ^ 1720137467);
                     default -> a(1804512817, var23 ^ 2013141963);
                  });
                  var6++;
                  if (var28 == 0) {
                     var10004 = var28;
                     var48 = var40;
                  } else {
                     if (var28 <= var6) {
                        break;
                     }

                     var48 = var40;
                     var10004 = var6;
                  }
               }
            }

            String var55 = new String(var40).intern();
            switch (var28) {
               case 0:
                  var0[var4++] = var55;
                  if ((var25 += var2) >= var5) {
                     aa = new aaabbabaa(aabbaaaba.aaab(var0[5]));
                     b = new aaabbabaa(aabbaaaba.aaab(var0[4]));
                     a = new aaabbabaa(aabbaaaba.aaab(var0[2]));
                     ab = aa();
                     return;
                  }

                  var2 = var3.charAt(var25);
                  break;
               default:
                  var0[var4++] = var55;
                  if ((var25 += var2) < var5) {
                     var2 = var3.charAt(var25);
                     continue label88;
                  }

                  var5 = (var3 = b(8545, (char)'홵', -775679532, '蔶')).length();
                  var2 = a(1804512825, var23 ^ 1013392113);
                  var25 = -1;
            }

            var10000 = var3.substring(++var25, var25 + var2);
            var28 = 0;
         }
      }
   }

   private static int a(int var0, int var1) {
      int var2 = bb[var0 ^ 1804512827] ^ var1 ^ var0;
      var2 -= 37014;
      var2 += 65436;
      var2 -= 53312;
      var2 ^= 37138;
      var2 += 32506;
      var2 -= 33982;
      var2 ^= 20039;
      var2 += 35006;
      var2 ^= 8512;
      return var2 ^ 40018;
   }

   private static aaabbabaa[] aa() {
      return new aaabbabaa[]{aa, b, a};
   }

   private static String b(char var0, char var1, int var2, char var3) {
      int var8 = var2 ^ -775679531;
      char[] var7 = aaa[var8].toCharArray();
      StackTraceElement[] var9 = (StackTraceElement[])aab[var8];
      StackTraceElement[] var10;
      if (var9 != null) {
         var10 = var9;
      } else {
         var10 = new Throwable().getStackTrace();
         aab[var8] = var10;
      }

      StackTraceElement var11 = var10[1];
      int var5 = (var11.getClassName().hashCode() ^ var11.getMethodName().hashCode()) >> 16 ^ 22286;
      int var6 = 0;

      do {
         var7[var6] = (char)(var7[var6] ^ switch (var6 % 13) {
            default -> 123;
            case 1 -> 41;
            case 2 -> 101;
            case 3 -> 15;
            case 4 -> 54;
            case 5 -> 160;
            case 6 -> 174;
            case 7 -> 109;
            case 8 -> 37;
            case 9 -> 127;
            case 10 -> 99;
            case 11 -> 2;
            case 12 -> 97;
         } ^ var6 ^ 7414 ^ var0 ^ var5 ^ var2 ^ var1 ^ var3);
      } while (++var6 < var7.length);

      return new String(var7).intern();
   }

   public static aaabbabaa ab(String var0) {
      return Enum.valueOf(aaabbabaa.class, var0);
   }
}
