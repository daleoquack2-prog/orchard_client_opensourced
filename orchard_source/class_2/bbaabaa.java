package nsc;

import net.fabricmc.api.EnvType;
import net.fabricmc.api.Environment;

@Environment(EnvType.CLIENT)
public enum bbaabaa {
   private static final Object[] bb;
   private static final bbaabaa[] b;
   private static final String[] ba;
   private static final int[] ab;
   public static final bbaabaa a;
   public static final bbaabaa aa;

   private static bbaabaa[] b() {
      return new bbaabaa[]{aa, a};
   }

   // $VF: Irreducible bytecode was duplicated to produce valid code
   static {
      int var17 = 2087588201;
      int var11 = 0;
      int var10 = 0;
      int var10001 = "\t袲Ტ覲\ueca3訒䒢讲鲡蔒".length();
      short var12 = 1138;
      String[] var9 = new String[1];
      int var8 = var10001;
      String var7 = "\t袲Ტ覲\ueca3訒䒢讲鲡蔒";

      do {
         char var13 = var7.charAt(var11);
         var10001 = var11 + 1;
         int var15 = 0;
         char[] var14 = var7.substring(var10001, var10001 + var13).toCharArray();

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
      byte var10000 = 0;
      int var20 = 0;
      ab = new int[7];
      byte[] var10002 = "\u0082. \u008aZñ½¢I^¬ÉÁ\u001aæãJL\r\u0003%ýoêk\bÄ1".getBytes("ISO-8859-1");

      int var50;
      do {
         ab[var10000] = ((var10002[var20] & 255) << 24 | (var10002[var20 + 1] & 255) << 16 | (var10002[var20 + 2] & 255) << 8 | var10002[var20 + 3] & 255)
            ^ 1085205218;
         var10000 += 1;
         var50 = var20 + 4;
         var20 += 4;
      } while (var50 < var10002.length);

      String[] var0 = new String[2];
      int var4 = 0;
      String var3;
      int var5 = (var3 = ab(-321031235, 2027392472, -1925372855, 1612700962, (byte)46, 18211, (byte)-43)).length();
      char var2 = 3;
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
               var54[var68] = (char)(var54[var68] ^ switch (var6 % a(1894104391, var17 ^ 838102939)) {
                  case 0 -> a(1894104390, var17 ^ -382995511);
                  case 1 -> a(1894104389, var17 ^ -91954526);
                  case 2 -> a(1894104388, var17 ^ 1925228703);
                  case 3 -> a(1894104387, var17 ^ -107593213);
                  case 4 -> a(1894104386, var17 ^ -1775820571);
                  case 5 -> a(1894104385, var17 ^ -657290607);
                  default -> 4;
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
            aa = new bbaabaa();
            a = new bbaabaa();
            b = b();
            return;
         }

         var2 = var3.charAt(var1);
      }
   }

   private static String ab(int var0, int var1, int var2, int var3, byte var4, short var5, byte var6) {
      int var11 = var0 ^ -321031235;
      char[] var10 = ba[var11].toCharArray();
      StackTraceElement[] var12 = (StackTraceElement[])bb[var11];
      StackTraceElement[] var13;
      if (var12 != null) {
         var13 = var12;
      } else {
         var13 = new Throwable().getStackTrace();
         bb[var11] = var13;
      }

      StackTraceElement var14 = var13[1];
      int var8 = (var14.getClassName().hashCode() ^ var14.getMethodName().hashCode()) >> 16 ^ 29271;

      for (int var9 = 0; var9 < var10.length; var9++) {
         var10[var9] = (char)(var10[var9] ^ 25113 ^ var1 ^ var3 ^ var8 ^ var5 ^ var2 ^ var6 ^ var4 ^ var0);
      }

      return new String(var10).intern();
   }

   public static bbaabaa aa(String var0) {
      return Enum.valueOf(bbaabaa.class, var0);
   }

   private static int a(int var0, int var1) {
      int var2 = ab[var0 ^ 1894104391] ^ var1 ^ var0;
      var2 ^= 20696;
      var2 -= 36519;
      var2 += 38161;
      var2 -= 35590;
      var2 += 41292;
      var2 -= 3708;
      var2 += 13241;
      var2 += 18857;
      var2 ^= 10950;
      return var2 + 12714;
   }
}
