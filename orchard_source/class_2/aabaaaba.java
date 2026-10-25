package nsc;

import net.fabricmc.api.EnvType;
import net.fabricmc.api.Environment;

@Environment(EnvType.CLIENT)
enum aabaaaba {
   private final ababbbbaa aa;
   public static final aabaaaba a;
   private static final Object[] aaa;
   public static final aabaaaba ab;
   private static final int[] b;
   private static final aabaaaba[] ba;
   private static final String[] bb;

   // $VF: Irreducible bytecode was duplicated to produce valid code
   static {
      int var23 = 1291131;
      String[] var10000 = new String[2];
      short var18 = 2312;
      String[] var15 = var10000;
      int var14 = "\u0013橫⥚瓦覑椲⥂瓓椽檶覑珢ꥁ橳\ue95b楾䦐瑚襀瓓\u0013刴햹凑刵儕ᖭ剜떶鬘爬鲼\uf29b鲥떸励爯鮌ᖭ剤".length();
      int var16 = 0;
      int var17 = 0;
      String var13 = "\u0013橫⥚瓦覑椲⥂瓓椽檶覑珢ꥁ橳\ue95b楾䦐瑚襀瓓\u0013刴햹凑刵儕ᖭ剜떶鬘爬鲼\uf29b鲥떸励爯鮌ᖭ剤";

      do {
         char var19 = var13.charAt(var17);
         int var10001 = var17 + 1;
         int var10002 = var17 + 1 + var19;
         int var21 = 0;
         char[] var20 = var13.substring(var10001, var10002).toCharArray();

         do {
            int var22 = var20[var21];

            var22 = (char)(switch (var21 % 6) {
               default -> 105;
               case 1 -> 243;
               case 2 -> 172;
               case 3 -> 94;
               case 4 -> 40;
               case 5 -> 233;
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

      bb = var15;
      aaa = new Object[var15.length];
      int var9 = 484525125;
      byte[] var7 = "[\u001dT')\u0089\u0000ÙûÛÕ°9\u0010®<\u0097\u001fÏ½~R\u009fÂHîÃ¼m\né\u0089ß\u001b`\u009eB°Úw".getBytes("ISO-8859-1");
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

      String[] var0 = new String[4];
      int var4 = 0;
      String var3;
      int var5 = (var3 = ab('兴', 'ゲ', var23 ^ 1626843451)).length();
      int var2 = a(-1041582035, var23 ^ -2046410620);
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
                  var51[var10004] = (char)(var51[var10004] ^ switch (var6 % a(-1041582033, var23 ^ 650166550)) {
                     case 0 -> a(-1041582034, var23 ^ -468993311);
                     case 1 -> a(-1041582039, var23 ^ 1241832303);
                     case 2 -> a(-1041582040, var23 ^ -1555460954);
                     case 3 -> a(-1041582037, var23 ^ -1779052351);
                     case 4 -> a(-1041582038, var23 ^ -1340998352);
                     case 5 -> a(-1041582043, var23 ^ 33584177);
                     default -> a(-1041582044, var23 ^ -1616131784);
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
                     ab = new aabaaaba(aabbaaaba.aaab(var0[1]));
                     a = new aabaaaba(aabbaaaba.aaab(var0[2]));
                     ba = b();
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

                  var5 = (var3 = ab('隳', 'コ', var23 ^ -2110733911)).length();
                  var2 = a(-1041582036, var23 ^ -191753215);
                  var25 = -1;
            }

            var29 = var3.substring(++var25, var25 + var2);
            var31 = 0;
         }
      }
   }

   private static String ab(char var0, char var1, int var2) {
      int var3 = var1 ^ 12466;
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
      int var8 = (var7.getClassName().hashCode() ^ var7.getMethodName().hashCode()) >> 16 ^ 28480;
      int var9 = 0;

      do {
         int var10 = var4[var9] ^ 7991;
         var10 ^= 30021;
         var10 ^= 25726;
         var10 += 28102;
         var10 += 21980;
         var10 -= 40265;
         var10 -= 55095;
         var10 ^= 54202;
         var10 += 42432;
         var4[var9] = (char)(var10 ^ var8 ^ var0 ^ var2 >> 16);
      } while (++var9 < var4.length);

      return new String(var4).intern();
   }

   @Override
   public String toString() {
      return this.aa.abab();
   }

   private static int a(int var0, int var1) {
      int var2 = b[var0 ^ -1041582035] ^ var1 ^ var0;
      var2 -= 60775;
      var2 -= 35857;
      var2 -= 61976;
      var2 ^= 59755;
      var2 -= 30229;
      var2 += 6503;
      var2 += 52634;
      return var2 - 35377;
   }

   private aabaaaba(ababbbbaa var3) {
      this.aa = var3;
   }

   private static aabaaaba[] b() {
      return new aabaaaba[]{ab, a};
   }

   public static aabaaaba aa(String var0) {
      return Enum.valueOf(aabaaaba.class, var0);
   }
}
