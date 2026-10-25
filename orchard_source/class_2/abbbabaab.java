package nsc;

import net.fabricmc.api.EnvType;
import net.fabricmc.api.Environment;

@Environment(EnvType.CLIENT)
enum abbbabaab {
   private static final abbbabaab[] b;
   private static final int[] ab;
   private static final Object[] bb;
   private static final String[] ba;
   public static final abbbabaab a;
   public static final abbbabaab aa;

   // $VF: Irreducible bytecode was duplicated to produce valid code
   static {
      int var24 = 419366411;
      short var13 = 21105;
      char[] var15 = "\n".toCharArray();
      String var14 = "\uf6c2\uf681\uf694\uf6b2\uf6fe\uf6fc\uf6b2\uf6fe\uf6c8\uf6a2";
      String[] var10000 = new String[var15.length];
      byte var20 = -1;
      String[] var16 = var10000;

      while (true) {
         int var17 = 0;
         char var18 = 0;
         char var19 = '\u0000';
         if (var20 == 0) {
            ba = var16;
            bb = new Object[var16.length];
            int var9 = -1268894687;
            byte[] var7 = "MîkÂx\u000bkò\u001eÙ\u0098!(¬\u009c\u001dÙj\u0087zý\u0004ö«o'·4=Ðh=".getBytes("ISO-8859-1");
            int var8 = var7.length / 4;
            ab = new int[var8];
            byte var10 = 0;
            int var11 = 0;

            do {
               int var12 = (var7[var10] & 255) << 24 | (var7[var10 + 1] & 255) << 16 | (var7[var10 + 2] & 255) << 8 | var7[var10 + 3] & 255;
               var12 ^= var9;
               ab[var11] = var12;
               var10 += 4;
            } while (++var11 < var8);

            String[] var0 = new String[2];
            int var4 = 0;
            String var3;
            int var5 = (var3 = ab((byte)-61, 214544329, -1460511284, '͒', 1028770908, (byte)-42)).length();
            char var2 = 4;
            int var1 = -1;

            while (true) {
               char[] var37;
               label85: {
                  char[] var10001 = var3.substring(++var1, var1 + var2).toCharArray();
                  int var10003 = var10001.length;
                  int var6 = 0;
                  var37 = var10001;
                  int var31 = var10003;
                  char[] var44;
                  int var10004;
                  if (var10003 <= 1) {
                     var44 = var10001;
                     var10004 = var6;
                  } else {
                     var37 = var10001;
                     var31 = var10003;
                     if (var10003 <= var6) {
                        break label85;
                     }

                     var44 = var10001;
                     var10004 = var6;
                  }

                  while (true) {
                     var44[var10004] = (char)(var44[var10004] ^ switch (var6 % a(727658763, var24 ^ -904906947)) {
                        case 0 -> a(727658762, var24 ^ -706791);
                        case 1 -> a(727658761, var24 ^ -1725447022);
                        case 2 -> a(727658760, var24 ^ -1353531145);
                        case 3 -> a(727658767, var24 ^ 1586813744);
                        case 4 -> a(727658766, var24 ^ 2063247885);
                        case 5 -> a(727658765, var24 ^ -388371541);
                        default -> a(727658764, var24 ^ -1171376939);
                     });
                     var6++;
                     if (var31 == 0) {
                        var10004 = var31;
                        var44 = var37;
                     } else {
                        if (var31 <= var6) {
                           break;
                        }

                        var44 = var37;
                        var10004 = var6;
                     }
                  }
               }

               String var51 = new String(var37).intern();
               byte var35 = -1;
               var0[var4++] = var51;
               if ((var1 += var2) >= var5) {
                  a = new abbbabaab();
                  aa = new abbbabaab();
                  b = b();
                  return;
               }

               var2 = var3.charAt(var1);
            }
         }

         do {
            var19 = var15[var17];
            char[] var21 = var14.substring(var18, var18 + var19).toCharArray();
            int var22 = 0;

            do {
               byte var23 = switch (var22 % 6) {
                  default -> 102;
                  case 1 -> 92;
                  case 2 -> 51;
                  case 3 -> 66;
                  case 4 -> 49;
                  case 5 -> 67;
               };
               var21[var22] = (char)(var21[var22] ^ var23 ^ var13);
            } while (++var22 < var21.length);

            var16[var17] = new String(var21).intern();
            var18 += var19;
         } while (++var17 < var15.length);

         var20 = 0;
      }
   }

   private static String ab(byte var0, int var1, int var2, char var3, int var4, byte var5) {
      int var10 = var4 ^ 1028770908;
      char[] var9 = ba[var10].toCharArray();
      StackTraceElement[] var11 = (StackTraceElement[])bb[var10];
      StackTraceElement[] var12;
      if (var11 != null) {
         var12 = var11;
      } else {
         var12 = new Throwable().getStackTrace();
         bb[var10] = var12;
      }

      StackTraceElement var13 = var12[1];
      int var7 = (var13.getClassName().hashCode() ^ var13.getMethodName().hashCode()) >> 16 ^ 41254;

      for (int var8 = 0; var8 < var9.length; var8++) {
         var9[var8] = (char)(var9[var8] ^ 15568 ^ var8 ^ var1 ^ var2 ^ var0 ^ var3 ^ var4 ^ var5 ^ var7);
      }

      return new String(var9).intern();
   }

   private static abbbabaab[] b() {
      return new abbbabaab[]{a, aa};
   }

   private static int a(int var0, int var1) {
      int var2 = ab[var0 ^ 727658763] ^ var1 ^ var0;
      var2 += 11284;
      var2 ^= 50693;
      var2 ^= 6062;
      var2 ^= 6545;
      var2 += 3839;
      var2 ^= 39833;
      return var2 ^ 51545;
   }

   public static abbbabaab aa(String var0) {
      return Enum.valueOf(abbbabaab.class, var0);
   }
}
