package nsc;

import net.fabricmc.api.EnvType;
import net.fabricmc.api.Environment;

@Environment(EnvType.CLIENT)
public enum aaaaaaba implements bbaabba {
   private static final Object[] abb;
   private static final String[] aba;
   public static final aaaaaaba aa;
   private static final int[] a;
   private static final aaaaaaba[] ab;
   public static final aaaaaaba b;
   public static final aaaaaaba ba;
   public static final aaaaaaba bb;
   public static final aaaaaaba aaa;
   private final ababbbbaa aab;

   private static String aa(short var0, short var1, byte var2, int var3) {
      int var8 = var3 ^ -362880705;
      char[] var7 = aba[var8].toCharArray();
      StackTraceElement[] var9 = (StackTraceElement[])abb[var8];
      StackTraceElement[] var10;
      if (var9 != null) {
         var10 = var9;
      } else {
         var10 = new Throwable().getStackTrace();
         abb[var8] = var10;
      }

      StackTraceElement var11 = var10[1];
      int var5 = (var11.getClassName().hashCode() ^ var11.getMethodName().hashCode()) >> 16 ^ 30624;

      for (int var6 = 0; var6 < var7.length; var6++) {
         var7[var6] = (char)(var7[var6] ^ var6 ^ 20610 ^ var5 ^ var0 ^ var2 ^ var3 ^ var1);
      }

      return new String(var7).intern();
   }

   @Override
   public String toString() {
      return this.aab.abab();
   }

   private aaaaaaba(ababbbbaa var3) {
      this.aab = var3;
   }

   // $VF: Irreducible bytecode was duplicated to produce valid code
   static {
      int var23 = 440012920;
      String[] var15 = new String[2];
      int var14 = ">Ϻ騁\u001a娃ܚ樃՚娇ժ㨁ݚ糖Պᨁ۪稃Ϊ訆ӊ쨀ۊ樃к⨂\u05fa䨂\u001a䨅ɺ㨆ؚ樄Ȫ稅Ū\uea01ݚ訃ޚ⨂κ稆Ί稅Ԫ娇Ū稂њਆъ宅Ɋ쨀̪\uda04֪ꨃ\u07ba먃ޚ\uda03\u0010\uaacd綯ꤽණꯝ綨ꢽ궭꿝궪갍궨ꢍ붬ꭝ涯".length();
      short var18 = 7696;
      int var17 = 0;
      int var16 = 0;
      String var13 = ">Ϻ騁\u001a娃ܚ樃՚娇ժ㨁ݚ糖Պᨁ۪稃Ϊ訆ӊ쨀ۊ樃к⨂\u05fa䨂\u001a䨅ɺ㨆ؚ樄Ȫ稅Ū\uea01ݚ訃ޚ⨂κ稆Ί稅Ԫ娇Ū稂њਆъ宅Ɋ쨀̪\uda04֪ꨃ\u07ba먃ޚ\uda03\u0010\uaacd綯ꤽණꯝ綨ꢽ궭꿝궪갍궨ꢍ붬ꭝ涯";

      do {
         char var19 = var13.charAt(var17);
         int var10001 = var17 + 1;
         int var10002 = var17 + 1;
         int var21 = 0;
         char[] var20 = var13.substring(var10001, var10002 + var19).toCharArray();

         do {
            char var22 = var20[var21];
            if (var21 % 2 == 0) {
               var20[var21] = (char)((var22 >>> 4 | var22 << '\f') & 65535 ^ var18);
            } else {
               var20[var21] = (char)((var22 << 4 | var22 >>> '\f') & 65535 ^ var18);
            }
         } while (++var21 < var20.length);

         var15[var16] = new String(var20);
         var16++;
         var17 = var17 + var19 + 1;
      } while (var17 < var14);

      aba = var15;
      abb = new Object[var15.length];
      int var9 = -1436119428;
      byte[] var7 = "cý\u009a,\u009b\u001fVNZ\u008b!\u0005(~.a\u0000\u0001VdaÉ=\u0084ù¨\u001a\u0011ýª\u0098\u00adÌ\u0085D\u008fíÆï\u0089C]o}u\u0018X5¤#T\u0081\u001ek 6yrô\n"
         .getBytes("ISO-8859-1");
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

      String[] var0 = new String[b(735727638, var23 ^ 126264168)];
      int var4 = 0;
      String var3;
      int var5 = (var3 = aa((short)-11739, (short)-1643, (byte)-90, -362880705)).length();
      int var2 = b(735727639, var23 ^ -10195187);
      int var25 = -1;

      label88:
      while (true) {
         String var10000 = var3.substring(++var25, var25 + var2);
         int var28 = -1;

         while (true) {
            char[] var40;
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
                  var48[var10004] = (char)(var48[var10004] ^ switch (var6 % b(735727637, var23 ^ 1275402021)) {
                     case 0 -> b(735727634, var23 ^ 1685745452);
                     case 1 -> b(735727635, var23 ^ 95552805);
                     case 2 -> b(735727632, var23 ^ -1647107213);
                     case 3 -> b(735727633, var23 ^ -1714314761);
                     case 4 -> b(735727646, var23 ^ -1459717091);
                     case 5 -> b(735727647, var23 ^ -1984047422);
                     default -> b(735727644, var23 ^ 656824304);
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
                     bb = new aaaaaaba(aabbaaaba.aaab(var0[b(735727645, var23 ^ 291725689)]));
                     aa = new aaaaaaba(aabbaaaba.aaab(var0[4]));
                     b = new aaaaaaba(aabbaaaba.aaab(var0[b(735727643, var23 ^ 2047875451)]));
                     aaa = new aaaaaaba(aabbaaaba.aaab(var0[0]));
                     ba = new aaaaaaba(aabbaaaba.aaab(var0[b(735727640, var23 ^ 487181638)]));
                     ab = a();
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

                  var5 = (var3 = aa((short)-19513, 7494, (byte)57, -362880706)).length();
                  var2 = b(735727636, var23 ^ 1055922245);
                  var25 = -1;
            }

            var10000 = var3.substring(++var25, var25 + var2);
            var28 = 0;
         }
      }
   }

   private static int b(int var0, int var1) {
      int var2 = a[var0 ^ 735727638] ^ var1 ^ var0;
      var2 ^= 21478;
      var2 += 59129;
      var2 += 55641;
      var2 += 3417;
      var2 += 59206;
      var2 ^= 28789;
      var2 += 22576;
      return var2 - 33274;
   }

   private static aaaaaaba[] a() {
      return new aaaaaaba[]{bb, aa, b, aaa, ba};
   }
}
