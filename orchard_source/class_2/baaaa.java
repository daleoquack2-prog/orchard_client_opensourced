package nsc;

import net.fabricmc.api.EnvType;
import net.fabricmc.api.Environment;

@Environment(EnvType.CLIENT)
enum baaaa {
   private final ababbbbaa aa;
   private static final Object[] aaa;
   private static final String[] bb;
   private static final int[] ba;
   public static final baaaa a;
   private static final baaaa[] ab;
   public static final baaaa b;

   public static baaaa b(String var0) {
      return Enum.valueOf(baaaa.class, var0);
   }

   private baaaa(ababbbbaa var3) {
      this.aa = var3;
   }

   // $VF: Irreducible bytecode was duplicated to produce valid code
   static {
      int var23 = 1891621468;
      int var10001 = "\u0013\u2d9bꢐ㌐郣⚑惾ㄤꂳ㘸\u001fガ颟ㄑᣬ⡛\ud890㊐룣㕑\r㒋䲑Ⳡ㳥⣁瓿⨔풲⸨됟⧜㲟ぁ".length();
      int var16 = 0;
      String[] var10002 = new String[2];
      short var18 = 16516;
      String[] var15 = var10002;
      int var14 = var10001;
      int var17 = 0;
      String var13 = "\u0013\u2d9bꢐ㌐郣⚑惾ㄤꂳ㘸\u001fガ颟ㄑᣬ⡛\ud890㊐룣㕑\r㒋䲑Ⳡ㳥⣁瓿⨔풲⸨됟⧜㲟ぁ";

      do {
         char var19 = var13.charAt(var17);
         int var21 = 0;
         char[] var20 = var13.substring(var17 + 1, var17 + 1 + var19).toCharArray();

         do {
            int var22 = var20[var21];

            var22 = (char)(switch (var21 % 7) {
               default -> 120;
               case 1 -> 91;
               case 2 -> 211;
               case 3 -> 47;
               case 4 -> 82;
               case 5 -> 50;
               case 6 -> 39;
            }) ^ var22;
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

      bb = var15;
      aaa = new Object[var15.length];
      int var9 = -1409548311;
      byte[] var7 = "8Ì=\u0081º°×½*@\u008aÑÞ²õ\"\u0002LS0$Þ*º\f2¤\u0083ÍJÒ\u0013".getBytes("ISO-8859-1");
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
      int var5 = (var3 = ab(var23 ^ -1050499482, '눶', '荭')).length();
      int var2 = a(1214899060, var23 ^ -1411256928);
      int var25 = -1;

      label99:
      while (true) {
         String var28 = var3.substring(++var25, var25 + var2);
         int var30 = -1;

         while (true) {
            label94: {
               char[] var32 = var28.toCharArray();
               int var10003 = var32.length;
               int var6 = 0;
               var42 = var32;
               var30 = var10003;
               char[] var50;
               int var10004;
               if (var10003 <= 1) {
                  var50 = var32;
                  var10004 = var6;
               } else {
                  var42 = var32;
                  var30 = var10003;
                  if (var10003 <= var6) {
                     break label94;
                  }

                  var50 = var32;
                  var10004 = var6;
               }

               while (true) {
                  var50[var10004] = (char)(var50[var10004] ^ switch (var6 % a(1214899061, var23 ^ 698156952)) {
                     case 0 -> a(1214899062, var23 ^ -1184015790);
                     case 1 -> a(1214899063, var23 ^ 1302275348);
                     case 2 -> a(1214899056, var23 ^ -1855880438);
                     case 3 -> a(1214899057, var23 ^ -1208747378);
                     case 4 -> a(1214899058, var23 ^ -1625328465);
                     case 5 -> a(1214899059, var23 ^ 1583809226);
                     default -> 2;
                  });
                  var6++;
                  if (var30 == 0) {
                     var10004 = var30;
                     var50 = var42;
                  } else {
                     if (var30 <= var6) {
                        break;
                     }

                     var50 = var42;
                     var10004 = var6;
                  }
               }
            }

            String var57 = new String(var42).intern();
            switch (var30) {
               case 0:
                  var0[var4++] = var57;
                  if ((var25 += var2) >= var5) {
                     a = new baaaa(aabbaaaba.aaab(var0[3]));
                     b = new baaaa(aabbaaaba.aaab(var0[1]));
                     ab = aa();
                     return;
                  }

                  var2 = var3.charAt(var25);
                  break;
               default:
                  var0[var4++] = var57;
                  if ((var25 += var2) < var5) {
                     var2 = var3.charAt(var25);
                     continue label99;
                  }

                  var5 = (var3 = ab(var23 ^ 1279759395, '눷', '踐')).length();
                  var2 = 4;
                  var25 = -1;
            }

            var28 = var3.substring(++var25, var25 + var2);
            var30 = 0;
         }
      }
   }

   private static int a(int var0, int var1) {
      int var2 = ba[var0 ^ 1214899060] ^ var1 ^ var0;
      var2 += 43761;
      var2 ^= 5541;
      var2 -= 59963;
      var2 += 9850;
      var2 ^= 7930;
      var2 -= 39628;
      var2 ^= 46795;
      var2 ^= 9974;
      return var2 + 7366;
   }

   private static String ab(int var0, char var1, char var2) {
      int var3 = var1 ^ '눶';
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
      int var8 = (var7.getClassName().hashCode() ^ var7.getMethodName().hashCode()) >> 16 ^ 31662;
      int var9 = 0;

      do {
         int var10 = var4[var9] ^ 31108;
         var10 -= 7707;
         var10 += 2034;
         var10 -= 54387;
         var10 -= 3032;
         var10 += 3519;
         var10 += 42658;
         var10 -= 19821;
         var10 += 23883;
         var4[var9] = (char)(var10 ^ var8 ^ var2 ^ var0 >> 16);
      } while (++var9 < var4.length);

      return new String(var4).intern();
   }

   @Override
   public String toString() {
      return this.aa.abab();
   }

   private static baaaa[] aa() {
      return new baaaa[]{a, b};
   }
}
