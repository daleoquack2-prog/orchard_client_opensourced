package nsc;

import net.fabricmc.api.EnvType;
import net.fabricmc.api.Environment;

@Environment(EnvType.CLIENT)
enum aabbbaabb {
   private static final String[] ba;
   private static final aabbbaabb[] b;
   public static final aabbbaabb a;
   private static final int[] ab;
   private static final Object[] bb;
   public static final aabbbaabb aa;

   private static String ab(int var0, char var1, int var2) {
      int var3 = var0 ^ 18449;
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
      int var8 = (var7.getClassName().hashCode() ^ var7.getMethodName().hashCode()) >> 16 ^ 4423;
      int var9 = 0;

      do {
         int var10 = var4[var9] - '\udbd3';
         var10 -= 23873;
         var10 -= 18275;
         var10 += 54405;
         var10 += 49085;
         var10 ^= 52527;
         var10 -= 62929;
         var10 += 25015;
         var10 += 34404;
         var4[var9] = (char)(var10 ^ var8 ^ var1 ^ var2 >> 16);
      } while (++var9 < var4.length);

      return new String(var4).intern();
   }

   // $VF: Irreducible bytecode was duplicated to produce valid code
   static {
      int var24 = -1045988753;
      char[] var15 = "\f".toCharArray();
      byte var20 = -1;
      short var13 = 25591;
      String var14 = "樑檌檐賨谩檤樑檏檞贀跹賨";
      String[] var16 = new String[var15.length];

      while (true) {
         int var17 = 0;
         char var18 = 0;
         char var19 = '\u0000';
         if (var20 == 0) {
            ba = var16;
            bb = new Object[var16.length];
            int var9 = -1469447800;
            byte[] var7 = "\u008fß\u0007[p\u0096\u009d\u0095\u0090\u0010ñgiWy´\u0013ÙJVÝÞzé%\u007f4º".getBytes("ISO-8859-1");
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
            int var5 = (var3 = ab(18449, '擯', var24 ^ -633403040)).length();
            char var2 = 5;
            int var1 = -1;

            while (true) {
               char[] var36;
               label83: {
                  char[] var10001 = var3.substring(++var1, var1 + var2).toCharArray();
                  int var10003 = var10001.length;
                  int var6 = 0;
                  var36 = var10001;
                  int var30 = var10003;
                  char[] var43;
                  int var10004;
                  if (var10003 <= 1) {
                     var43 = var10001;
                     var10004 = var6;
                  } else {
                     var36 = var10001;
                     var30 = var10003;
                     if (var10003 <= var6) {
                        break label83;
                     }

                     var43 = var10001;
                     var10004 = var6;
                  }

                  while (true) {
                     var43[var10004] = (char)(var43[var10004] ^ switch (var6 % a(1805134751, var24 ^ 1920284282)) {
                        case 0 -> a(1805134750, var24 ^ -1925403448);
                        case 1 -> a(1805134749, var24 ^ 1840955425);
                        case 2 -> a(1805134748, var24 ^ -1795340065);
                        case 3 -> a(1805134747, var24 ^ -294421646);
                        case 4 -> a(1805134746, var24 ^ 544492481);
                        case 5 -> a(1805134745, var24 ^ -657128016);
                        default -> 5;
                     });
                     var6++;
                     if (var30 == 0) {
                        var10004 = var30;
                        var43 = var36;
                     } else {
                        if (var30 <= var6) {
                           break;
                        }

                        var43 = var36;
                        var10004 = var6;
                     }
                  }
               }

               String var50 = new String(var36).intern();
               byte var34 = -1;
               var0[var4++] = var50;
               if ((var1 += var2) >= var5) {
                  a = new aabbbaabb();
                  aa = new aabbbaabb();
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
               short var23 = switch (var22 % 6) {
                  default -> 186;
                  case 1 -> 19;
                  case 2 -> 48;
                  case 3 -> 62;
                  case 4 -> 198;
                  case 5 -> 51;
               };
               var21[var22] = (char)(var21[var22] ^ var23 ^ var13);
            } while (++var22 < var21.length);

            var16[var17] = new String(var21).intern();
            var18 += var19;
         } while (++var17 < var15.length);

         var20 = 0;
      }
   }

   private static int a(int var0, int var1) {
      int var2 = ab[var0 ^ 1805134751] ^ var1 ^ var0;
      var2 += 55628;
      var2 += 6659;
      var2 += 61660;
      var2 -= 5348;
      var2 -= 45517;
      return var2 ^ 32468;
   }

   private static aabbbaabb[] b() {
      return new aabbbaabb[]{a, aa};
   }

   public static aabbbaabb aa(String var0) {
      return Enum.valueOf(aabbbaabb.class, var0);
   }
}
