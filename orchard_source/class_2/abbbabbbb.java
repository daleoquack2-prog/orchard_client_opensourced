package nsc;

import net.fabricmc.api.EnvType;
import net.fabricmc.api.Environment;

@Environment(EnvType.CLIENT)
public enum abbbabbbb {
   public static final abbbabbbb b;
   private static final abbbabbbb[] aa;
   private static final String[] ba;
   private static final Object[] bb;
   private static final int[] ab;
   public static final abbbabbbb a;

   // $VF: Irreducible bytecode was duplicated to produce valid code
   static {
      int var18 = 1914163626;
      short var7 = 16873;
      byte var14 = -1;
      char[] var9 = "䇰".toCharArray();
      String var8 = "슾솃슑솯섴셱섇쉀셂쇹셔싛섇쉋섍쇑셑섒셁속셨솢섍셽셻";
      String[] var10 = new String[var9.length];

      while (true) {
         int var11 = 0;
         int var12 = 0;
         int var13 = 0;
         if (var14 == 0) {
            ba = var10;
            bb = new Object[var10.length];
            byte var21 = 0;
            int var10001 = 0;
            ab = new int[8];
            byte[] var10002 = "¤läÚ@\u00105bË\u0010*ðr4dä\u009aÀ\u0007ÀþøûS<'\u0095UJÑÎ|".getBytes("ISO-8859-1");

            int var51;
            do {
               ab[var21] = (
                     (var10002[var10001] & 255) << 24
                        | (var10002[var10001 + 1] & 255) << 16
                        | (var10002[var10001 + 2] & 255) << 8
                        | var10002[var10001 + 3] & 255
                  )
                  ^ -603806608;
               var21 += 1;
               var51 = var10001 + 4;
               var10001 += 4;
            } while (var51 < var10002.length);

            String[] var0 = new String[2];
            int var4 = 0;
            String var3;
            int var5 = (var3 = aa((short)'뇚', var18 ^ -1446651559, '剿')).length();
            int var2 = a(1850340205, var18 ^ -1680960200);
            int var1 = -1;

            while (true) {
               label82: {
                  char[] var24 = var3.substring(++var1, var1 + var2).toCharArray();
                  var51 = var24.length;
                  int var6 = 0;
                  var39 = var24;
                  var10001 = var51;
                  char[] var55;
                  int var69;
                  if (var51 <= 1) {
                     var55 = var24;
                     var69 = var6;
                  } else {
                     var39 = var24;
                     var10001 = var51;
                     if (var51 <= var6) {
                        break label82;
                     }

                     var55 = var24;
                     var69 = var6;
                  }

                  while (true) {
                     var55[var69] = (char)(var55[var69] ^ switch (var6 % a(1850340204, var18 ^ 2142389404)) {
                        case 0 -> a(1850340207, var18 ^ -189637888);
                        case 1 -> a(1850340206, var18 ^ 1301681486);
                        case 2 -> 3;
                        case 3 -> a(1850340201, var18 ^ -1520273784);
                        case 4 -> a(1850340200, var18 ^ -1051030833);
                        case 5 -> a(1850340203, var18 ^ 59106547);
                        default -> a(1850340202, var18 ^ 1970520012);
                     });
                     var6++;
                     if (var10001 == 0) {
                        var69 = var10001;
                        var55 = var39;
                     } else {
                        if (var10001 <= var6) {
                           break;
                        }

                        var55 = var39;
                        var69 = var6;
                     }
                  }
               }

               String var62 = new String(var39).intern();
               byte var31 = -1;
               var0[var4++] = var62;
               if ((var1 += var2) >= var5) {
                  b = new abbbabbbb();
                  a = new abbbabbbb();
                  aa = b();
                  return;
               }

               var2 = var3.charAt(var1);
            }
         }

         do {
            var13 = var9[var11] ^ var7;
            char[] var15 = var8.substring(var12, var12 + var13).toCharArray();
            int var16 = 0;

            do {
               short var17 = switch (var16 % 6) {
                  default -> 191;
                  case 1 -> 67;
                  case 2 -> 144;
                  case 3 -> 15;
                  case 4 -> 234;
                  case 5 -> 200;
               };
               var15[var16] = (char)(var15[var16] ^ var17);
            } while (++var16 < var15.length);

            var10[var11] = new String(var15).intern();
            var12 += var13;
         } while (++var11 < var9.length);

         var14 = 0;
      }
   }

   private static int a(int var0, int var1) {
      int var2 = ab[var0 ^ 1850340205] ^ var1 ^ var0;
      var2 ^= 37360;
      var2 ^= 53504;
      var2 += 43369;
      var2 += 47378;
      var2 ^= 8067;
      var2 += 4608;
      var2 += 22623;
      return var2 ^ 28680;
   }

   private static String aa(short var0, int var1, char var2) {
      int var3 = var2 ^ 21119;
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
      int var8 = (var7.getClassName().hashCode() ^ var7.getMethodName().hashCode()) >> 16 ^ 29946;
      int var9 = 0;

      do {
         int var10 = var4[var9] - 2460;
         var10 -= 53010;
         var10 += 26233;
         var10 ^= 38149;
         var10 += 16415;
         var4[var9] = (char)(var10 ^ var8 ^ var0 ^ var1 >> 16);
      } while (++var9 < var4.length);

      return new String(var4).intern();
   }

   private static abbbabbbb[] b() {
      return new abbbabbbb[]{b, a};
   }
}
