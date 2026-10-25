package nsc;

import net.fabricmc.api.EnvType;
import net.fabricmc.api.Environment;

@Environment(EnvType.CLIENT)
enum babababb {
   private static final babababb[] b;
   private static final Object[] bb;
   private static final int[] ab;
   private static final String[] ba;
   public static final babababb a;
   public static final babababb aa;

   private static String ab(char var0, char var1, int var2) {
      int var3 = var0 ^ '\ueb00';
      char[] var4 = ba[var3].toCharArray();
      StackTraceElement[] var5 = (StackTraceElement[])bb[var3];
      StackTraceElement[] var6;
      if (var5 != null) {
         var6 = var5;
      } else {
         var6 = new Throwable().getStackTrace();
         bb[var3] = var6;
      }

      StackTraceElement var7 = var6[1];
      int var8 = (var7.getClassName().hashCode() ^ var7.getMethodName().hashCode()) >> 16 ^ 12713;
      int var9 = 0;

      do {
         int var10 = var4[var9] ^ '몷';
         var10 += 30479;
         var10 -= 25607;
         var10 ^= 26604;
         var10 -= 57744;
         var10 += 23288;
         var10 ^= 1542;
         var10 += 36264;
         var10 -= 31245;
         var10 -= 45234;
         var4[var9] = (char)(var10 ^ var8 ^ var1 ^ var2 >> 16);
      } while (++var9 < var4.length);

      return new String(var4).intern();
   }

   // $VF: Irreducible bytecode was duplicated to produce valid code
   static {
      int var17 = -2119964232;
      String[] var10001 = new String[1];
      int var10 = 0;
      String[] var9 = var10001;
      short var12 = 15367;
      int var11 = 0;
      int var8 = "\f㑐\uf385㜅卂㘕ϡぇ猗༉덦\u0f98鎍".length();
      String var7 = "\f㑐\uf385㜅卂㘕ϡぇ猗༉덦\u0f98鎍";

      do {
         char var13 = var7.charAt(var11);
         int var21 = var11 + 1;
         int var10002 = var11 + 1 + var13;
         int var15 = 0;
         char[] var14 = var7.substring(var21, var10002).toCharArray();

         do {
            int var16 = var14[var15];

            var16 = (char)(switch (var15 % 7) {
               default -> 35;
               case 1 -> 138;
               case 2 -> 86;
               case 3 -> 75;
               case 4 -> 134;
               case 5 -> 213;
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

      ba = var9;
      bb = new Object[var9.length];
      ab = new int[8];
      byte var20 = 0;
      byte var22 = 0;
      byte[] var33 = "ä\u00adÐwÉ*¬\rÊ\u0014uIü\u008f\u0007¦2ö\u000f¼9\u001dÏgelÎ\u001a\u009aÆ\u0019\u000b".getBytes("ISO-8859-1");

      int var53;
      do {
         ab[var20] = ((var33[var22] & 255) << 24 | (var33[var22 + 1] & 255) << 16 | (var33[var22 + 2] & 255) << 8 | var33[var22 + 3] & 255) ^ 1087111554;
         var20 += 1;
         var53 = var22 + 4;
         var22 += 4;
      } while (var53 < var33.length);

      String[] var0 = new String[2];
      int var4 = 0;
      String var3;
      int var5 = (var3 = ab('\ueb00', '̯', var17 ^ 665822543)).length();
      int var2 = a(1645567457, var17 ^ 1205312717);
      int var1 = -1;

      while (true) {
         label87: {
            char[] var25 = var3.substring(++var1, var1 + var2).toCharArray();
            var53 = var25.length;
            int var6 = 0;
            var41 = var25;
            int var28 = var53;
            char[] var57;
            int var71;
            if (var53 <= 1) {
               var57 = var25;
               var71 = var6;
            } else {
               var41 = var25;
               var28 = var53;
               if (var53 <= var6) {
                  break label87;
               }

               var57 = var25;
               var71 = var6;
            }

            while (true) {
               var57[var71] = (char)(var57[var71] ^ switch (var6 % a(1645567456, var17 ^ 1783685301)) {
                  case 0 -> a(1645567459, var17 ^ 1768831396);
                  case 1 -> a(1645567458, var17 ^ 1609911069);
                  case 2 -> a(1645567461, var17 ^ -1853078660);
                  case 3 -> a(1645567460, var17 ^ -1704492050);
                  case 4 -> a(1645567463, var17 ^ -971603246);
                  case 5 -> a(1645567462, var17 ^ 968644064);
                  default -> 4;
               });
               var6++;
               if (var28 == 0) {
                  var71 = var28;
                  var57 = var41;
               } else {
                  if (var28 <= var6) {
                     break;
                  }

                  var57 = var41;
                  var71 = var6;
               }
            }
         }

         String var64 = new String(var41).intern();
         byte var32 = -1;
         var0[var4++] = var64;
         if ((var1 += var2) >= var5) {
            aa = new babababb();
            a = new babababb();
            b = b();
            return;
         }

         var2 = var3.charAt(var1);
      }
   }

   private static babababb[] b() {
      return new babababb[]{aa, a};
   }

   public static babababb aa(String var0) {
      return Enum.valueOf(babababb.class, var0);
   }

   private static int a(int var0, int var1) {
      int var2 = ab[var0 ^ 1645567457] ^ var1 ^ var0;
      var2 -= 25910;
      var2 += 6567;
      var2 ^= 45801;
      var2 ^= 20132;
      var2 += 518;
      return var2 ^ 21411;
   }
}
