package nsc;

import net.fabricmc.api.EnvType;
import net.fabricmc.api.Environment;

@Environment(EnvType.CLIENT)
public enum abaaabbb {
   public static final abaaabbb b;
   private static final abaaabbb[] aa;
   private static final String[] bb;
   public static final abaaabbb a;
   private static final int[] ba;
   private static final Object[] aaa;
   public static final abaaabbb ab;

   private static int a(int var0, int var1) {
      int var2 = ba[var0 ^ -1414851549] ^ var1 ^ var0;
      var2 ^= 63533;
      var2 ^= 56830;
      var2 ^= 16092;
      var2 ^= 2894;
      var2 ^= 42279;
      var2 -= 59722;
      return var2 - 64725;
   }

   // $VF: Irreducible bytecode was duplicated to produce valid code
   static {
      int var24 = 1278352226;
      byte var20 = -1;
      String var14 = "\ue9c4\ue973\ue991\ue904\ue939\ue9d3\ue9c1\ue9cb\ue9df\ue960\ue9c2\ue9a5\ue9c4\ue947\ue9dd\ue913\ue948\ue9d0\ue91e\ue948\ue902\ue96e\ue94e\ue99d\ue9d3\ue92e\ue9e9\ue996\ue912\ue93a\ue9f0\ue97f\ue9ec\ue976\ue90b\ue99f\ue983\ue9d7\ue992\ue956\ue9b8\ue9fb\ue9f2\ue962\ue9cc\ue909\ue907";
      char[] var15 = "/".toCharArray();
      short var13 = 13718;
      String[] var16 = new String[var15.length];

      while (true) {
         int var17 = 0;
         char var18 = 0;
         char var19 = '\u0000';
         if (var20 == 0) {
            bb = var16;
            aaa = new Object[var16.length];
            int var9 = 2128771296;
            byte[] var7 = "\fú\u00873\f»ë=\u0005\u008e{³àÜÍóÏaï\u008b'\u008c«£Ë#qºÐäù]".getBytes("ISO-8859-1");
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

            String[] var0 = new String[3];
            int var4 = 0;
            String var3;
            int var5 = (var3 = ab(-1562251275, (byte)-10, 1901706764, '뻔', (char)'됡', -1077499028, -1617085831)).length();
            int var2 = a(-1414851549, var24 ^ -1786731559);
            int var1 = -1;

            while (true) {
               char[] var36;
               label86: {
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
                        break label86;
                     }

                     var43 = var10001;
                     var10004 = var6;
                  }

                  while (true) {
                     var43[var10004] = (char)(var43[var10004] ^ switch (var6 % a(-1414851550, var24 ^ -1782460451)) {
                        case 0 -> a(-1414851551, var24 ^ -1661706442);
                        case 1 -> a(-1414851552, var24 ^ 2040981789);
                        case 2 -> a(-1414851545, var24 ^ 1444662131);
                        case 3 -> a(-1414851546, var24 ^ -1091137553);
                        case 4 -> a(-1414851547, var24 ^ 1381586253);
                        case 5 -> a(-1414851548, var24 ^ 1235148058);
                        default -> 3;
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
                  b = new abaaabbb();
                  ab = new abaaabbb();
                  a = new abaaabbb();
                  aa = b();
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
                  default -> 1;
                  case 1 -> 22;
                  case 2 -> 136;
                  case 3 -> 254;
                  case 4 -> 174;
                  case 5 -> 65;
               };
               var21[var22] = (char)(var21[var22] ^ var23 ^ var13);
            } while (++var22 < var21.length);

            var16[var17] = new String(var21).intern();
            var18 += var19;
         } while (++var17 < var15.length);

         var20 = 0;
      }
   }

   private static abaaabbb[] b() {
      return new abaaabbb[]{b, ab, a};
   }

   public static abaaabbb aa(String var0) {
      return Enum.valueOf(abaaabbb.class, var0);
   }

   private static String ab(int var0, byte var1, int var2, char var3, char var4, int var5, int var6) {
      int var11 = var2 ^ 1901706764;
      char[] var10 = bb[var11].toCharArray();
      StackTraceElement[] var12 = (StackTraceElement[])aaa[var11];
      StackTraceElement[] var13;
      if (var12 != null) {
         var13 = var12;
      } else {
         var13 = new Throwable().getStackTrace();
         aaa[var11] = var13;
      }

      StackTraceElement var14 = var13[1];
      int var8 = (var14.getClassName().hashCode() ^ var14.getMethodName().hashCode()) >> 16 ^ 6226;

      for (int var9 = 0; var9 < var10.length; var9++) {
         var10[var9] = (char)(var10[var9] ^ switch (var9 % 30) {
            default -> 134;
            case 1 -> 5;
            case 2 -> 105;
            case 3 -> 234;
            case 4 -> 230;
            case 5 -> 143;
            case 6 -> 181;
            case 7 -> 145;
            case 8 -> 36;
            case 9 -> 252;
            case 10 -> 117;
            case 11 -> 232;
            case 12 -> 178;
            case 13 -> 76;
            case 14 -> 105;
            case 15 -> 161;
            case 16 -> 151;
            case 17 -> 242;
            case 18 -> 30;
            case 19 -> 56;
            case 20 -> 134;
            case 21 -> 246;
            case 22 -> 189;
            case 23 -> 176;
            case 24 -> 161;
            case 25 -> 50;
            case 26 -> 1;
            case 27 -> 119;
            case 28 -> 210;
            case 29 -> 41;
         } ^ var9 ^ 10280 ^ var2 ^ var3 ^ var8 ^ var1 ^ var5 ^ var4 ^ var6 ^ var0);
      }

      return new String(var10).intern();
   }
}
