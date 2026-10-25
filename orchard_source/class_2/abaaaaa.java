package nsc;

import net.fabricmc.api.EnvType;
import net.fabricmc.api.Environment;

@Environment(EnvType.CLIENT)
public enum abaaaaa {
   public static final abaaaaa aa;
   private static final String[] bb;
   public static final abaaaaa ab;
   private static final int[] b;
   private static final Object[] aaa;
   private final ababbbbaa ba;
   private static final abaaaaa[] a;

   private static String aa(int var0, int var1, char var2) {
      int var3 = var2 ^ 7788;
      char[] var4 = bb[var3].toCharArray();
      StackTraceElement[] var5 = (StackTraceElement[])aaa[var3];
      StackTraceElement[] var6;
      if (var5 != null) {
         var6 = var5;
      } else {
         var6 = new Throwable().getStackTrace();
         aaa[var3] = var6;
      }

      StackTraceElement var7 = var6[1];
      int var8 = (var7.getClassName().hashCode() ^ var7.getMethodName().hashCode()) >> 16 ^ 17172;
      int var9 = 0;

      do {
         int var10 = var4[var9] + '낙';
         var10 ^= 36395;
         var10 -= 43398;
         var10 -= 46022;
         var10 += 20095;
         var10 ^= 5098;
         var10 ^= 40506;
         var10 += 6403;
         var10 ^= 20277;
         var10 ^= 18247;
         var4[var9] = (char)(var10 ^ var8 ^ var0 ^ var1 >> 16);
      } while (++var9 < var4.length);

      return new String(var4).intern();
   }

   private static int a(int var0, int var1) {
      int var2 = b[var0 ^ -1322211441] ^ var1 ^ var0;
      var2 += 20748;
      var2 ^= 821;
      var2 += 45283;
      var2 ^= 52040;
      var2 ^= 43240;
      var2 += 42260;
      return var2 - 23214;
   }

   private static abaaaaa[] b() {
      return new abaaaaa[]{aa, ab};
   }

   private abaaaaa(ababbbbaa var3) {
      this.ba = var3;
   }

   // $VF: Irreducible bytecode was duplicated to produce valid code
   static {
      int var17 = -449369577;
      String[] var9 = new String[2];
      int var10001 = "\u0013缄孛缤箚繷쭀畿譐績ᮬ뵋存瀑\u0bc5猤ﭕ纔讜봷\u0014잩雠\ud8c9䛦윺䘡슲曭씓ꘙ\ud9b6ᛮ쐬뙲옉\ue6e1\udb99团\udd0a㘸".length();
      int var11 = 0;
      short var12 = 12949;
      int var10 = 0;
      int var8 = var10001;
      String var7 = "\u0013缄孛缤箚繷쭀畿譐績ᮬ뵋存瀑\u0bc5猤ﭕ纔讜봷\u0014잩雠\ud8c9䛦윺䘡슲曭씓ꘙ\ud9b6ᛮ쐬뙲옉\ue6e1\udb99团\udd0a㘸";

      do {
         char var13 = var7.charAt(var11);
         int var15 = 0;
         char[] var14 = var7.substring(var11 + 1, var11 + 1 + var13).toCharArray();

         do {
            int var16 = var14[var15];

            var16 = (char)(switch (var15 % 7) {
               default -> 47;
               case 1 -> 37;
               case 2 -> 223;
               case 3 -> 32;
               case 4 -> 44;
               case 5 -> 250;
               case 6 -> 180;
            }) ^ var16;
            if (var15 % 2 == 0) {
               var14[var15] = (char)((var16 >>> 4 | var16 << 12) & 65535 ^ var12);
            } else {
               var14[var15] = (char)((var16 << 4 | var16 >>> 12) & 65535 ^ var12);
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
      byte[] var10002 = "$1èÆÝ\\¹²¬ \u008d¸Ë½\u0086\u0013»x¨òúSÇ\u0099âu\u0091\u000bCRDúÖ\u0094\u0095\u008dDàÓ`".getBytes("ISO-8859-1");
      b = new int[10];

      int var57;
      do {
         b[var21] = ((var10002[var24] & 255) << 24 | (var10002[var24 + 1] & 255) << 16 | (var10002[var24 + 2] & 255) << 8 | var10002[var24 + 3] & 255)
            ^ -2056230858;
         var21 += 1;
         var57 = var24 + 4;
         var24 += 4;
      } while (var57 < var10002.length);

      String[] var0 = new String[4];
      int var4 = 0;
      String var3;
      int var5 = (var3 = aa(25232, var17 ^ 65689728, 'Ṭ')).length();
      int var2 = a(-1322211441, var17 ^ 179886196);
      int var19 = -1;

      label103:
      while (true) {
         String var22 = var3.substring(++var19, var19 + var2);
         var24 = (byte)-1;

         while (true) {
            label98: {
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
                     break label98;
                  }

                  var61 = var29;
                  var75 = var6;
               }

               while (true) {
                  var61[var75] = (char)(var61[var75] ^ switch (var6 % a(-1322211443, var17 ^ -2111193845)) {
                     case 0 -> a(-1322211444, var17 ^ -449530113);
                     case 1 -> a(-1322211445, var17 ^ -1779328113);
                     case 2 -> a(-1322211446, var17 ^ -723847976);
                     case 3 -> a(-1322211447, var17 ^ -855858926);
                     case 4 -> a(-1322211448, var17 ^ 1843098643);
                     case 5 -> a(-1322211449, var17 ^ -132274980);
                     default -> a(-1322211450, var17 ^ 1785323555);
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
                     aa = new abaaaaa(aabbaaaba.aaab(var0[2]));
                     ab = new abaaaaa(aabbaaaba.aaab(var0[1]));
                     a = b();
                     return;
                  }

                  var2 = var3.charAt(var19);
                  break;
               default:
                  var0[var4++] = var68;
                  if ((var19 += var2) < var5) {
                     var2 = var3.charAt(var19);
                     continue label103;
                  }

                  var5 = (var3 = aa(54579, var17 ^ -1853013767, 'ṭ')).length();
                  var2 = a(-1322211442, var17 ^ -204109545);
                  var19 = -1;
            }

            var22 = var3.substring(++var19, var19 + var2);
            var24 = (byte)0;
         }
      }
   }

   @Override
   public String toString() {
      return this.ba.abab();
   }
}
