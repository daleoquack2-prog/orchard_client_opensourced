package nsc;

import net.fabricmc.api.EnvType;
import net.fabricmc.api.Environment;

@Environment(EnvType.CLIENT)
enum bbbabbb {
   private static final String[] ba;
   private static final int[] ab;
   public static final bbbabbb b;
   private static final Object[] bb;
   private static final bbbabbb[] aa;
   public static final bbbabbb a;

   private static int a(int var0, int var1) {
      int var2 = ab[var0 ^ -2106015912] ^ var1 ^ var0;
      var2 ^= 55215;
      var2 -= 27198;
      var2 += 26612;
      var2 ^= 22766;
      var2 += 2020;
      return var2 ^ 65461;
   }

   // $VF: Irreducible bytecode was duplicated to produce valid code
   static {
      int var17 = -1348309253;
      String[] var9 = new String[1];
      int var10 = 0;
      int var10001 = "\u0011ꍉᩞꌩ䉟ꆉ橨祉\ue268嗩\uea68ꁩ剨ꈉ䉞ꏉ\uda5eꎩ".length();
      int var11 = 0;
      int var8 = var10001;
      String var7 = "\u0011ꍉᩞꌩ䉟ꆉ橨祉\ue268嗩\uea68ꁩ剨ꈉ䉞ꏉ\uda5eꎩ";
      short var12 = 18742;

      do {
         char var10000 = var7.charAt(var11);
         int var15 = 0;
         char var13 = var10000;
         char[] var14 = var7.substring(var11 + 1, var11 + 1 + var13).toCharArray();

         do {
            char var16 = var14[var15];
            if (var15 % 2 == 0) {
               var14[var15] = (char)((var16 >>> 5 | var16 << 11) & 65535 ^ var12);
            } else {
               var14[var15] = (char)((var16 << 5 | var16 >>> 11) & 65535 ^ var12);
            }
         } while (++var15 < var14.length);

         var9[var10] = new String(var14);
         var10++;
         var11 = var11 + var13 + 1;
      } while (var11 < var8);

      ba = var9;
      bb = new Object[var9.length];
      ab = new int[9];
      byte var19 = 0;
      int var20 = 0;
      byte[] var10002 = "/\u0013\u009bÊ\t_uÉ:\u0011Y>Õ\u0084µì\u009f¶(ËO½©ZÀ5\u0084\u0014K\u009aK\u0010×\"»ç".getBytes("ISO-8859-1");

      int var50;
      do {
         ab[var19] = ((var10002[var20] & 255) << 24 | (var10002[var20 + 1] & 255) << 16 | (var10002[var20 + 2] & 255) << 8 | var10002[var20 + 3] & 255)
            ^ 585486159;
         var19 += 1;
         var50 = var20 + 4;
         var20 += 4;
      } while (var50 < var10002.length);

      String[] var0 = new String[2];
      int var4 = 0;
      String var3;
      int var5 = (var3 = aa(13509, var17 ^ -1090693785, 8446)).length();
      int var2 = a(-2106015912, var17 ^ 539812834);
      int var1 = -1;

      while (true) {
         label77: {
            char[] var23 = var3.substring(++var1, var1 + var2).toCharArray();
            var50 = var23.length;
            int var6 = 0;
            var38 = var23;
            var20 = var50;
            char[] var54;
            int var68;
            if (var50 <= 1) {
               var54 = var23;
               var68 = var6;
            } else {
               var38 = var23;
               var20 = var50;
               if (var50 <= var6) {
                  break label77;
               }

               var54 = var23;
               var68 = var6;
            }

            while (true) {
               var54[var68] = (char)(var54[var68] ^ switch (var6 % a(-2106015911, var17 ^ 106958305)) {
                  case 0 -> a(-2106015910, var17 ^ 892215789);
                  case 1 -> a(-2106015909, var17 ^ -625226294);
                  case 2 -> a(-2106015908, var17 ^ -1870049279);
                  case 3 -> a(-2106015907, var17 ^ 1082315145);
                  case 4 -> a(-2106015906, var17 ^ -821363678);
                  case 5 -> a(-2106015905, var17 ^ 1151677389);
                  default -> a(-2106015920, var17 ^ -669134463);
               });
               var6++;
               if (var20 == 0) {
                  var68 = var20;
                  var54 = var38;
               } else {
                  if (var20 <= var6) {
                     break;
                  }

                  var54 = var38;
                  var68 = var6;
               }
            }
         }

         String var61 = new String(var38).intern();
         byte var30 = -1;
         var0[var4++] = var61;
         if ((var1 += var2) >= var5) {
            b = new bbbabbb();
            a = new bbbabbb();
            aa = b();
            return;
         }

         var2 = var3.charAt(var1);
      }
   }

   private static String aa(int var0, int var1, int var2) {
      int var3 = var2 ^ 8446;
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
      int var8 = (var7.getClassName().hashCode() ^ var7.getMethodName().hashCode()) >> 16 ^ 7872;
      int var9 = 0;

      do {
         int var10 = var4[var9] - 26820;
         var10 ^= 44979;
         var10 -= 61787;
         var10 -= 21092;
         var10 ^= 31342;
         var10 -= 5946;
         var10 ^= 7436;
         var10 -= 38804;
         var10 += 13061;
         var4[var9] = (char)(var10 ^ var8 ^ var0 ^ var1 >> 16);
      } while (++var9 < var4.length);

      return new String(var4).intern();
   }

   private static bbbabbb[] b() {
      return new bbbabbb[]{b, a};
   }
}
