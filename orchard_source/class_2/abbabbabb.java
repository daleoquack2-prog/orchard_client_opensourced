package nsc;

import net.fabricmc.api.EnvType;
import net.fabricmc.api.Environment;

@Environment(EnvType.CLIENT)
public enum abbabbabb {
   public static final abbabbabb b;
   private static final int[] ab;
   private static final Object[] bb;
   private static final String[] ba;
   private static final abbabbabb[] aa;
   public static final abbabbabb a;

   // $VF: Irreducible bytecode was duplicated to produce valid code
   static {
      int var17 = 1579410720;
      short var12 = 6803;
      int var10001 = "\u0010룅枻받螬몌ꞅ륚ꞻ묲䝈룅垾눋枥뭬랃".length();
      String[] var9 = new String[1];
      int var10 = 0;
      int var8 = var10001;
      String var7 = "\u0010룅枻받螬몌ꞅ륚ꞻ묲䝈룅垾눋枥뭬랃";
      int var11 = 0;

      do {
         char var13 = var7.charAt(var11);
         char[] var10000 = var7.substring(var11 + 1, var11 + 1 + var13).toCharArray();
         int var15 = 0;
         char[] var14 = var10000;

         do {
            int var16 = var14[var15];

            var16 = (char)(switch (var15 % 5) {
               default -> 50;
               case 1 -> 13;
               case 2 -> 12;
               case 3 -> 21;
               case 4 -> 251;
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
      byte var21 = 0;
      int var22 = 0;
      ab = new int[9];
      byte[] var10002 = "N ¿µ\u0018Ãàwå)¡\u000f³äî²}ui\u001fÏÎm\u000f¢ù\u0015L\u00119ÿ¹n§ë\u009b".getBytes("ISO-8859-1");

      int var52;
      do {
         ab[var21] = ((var10002[var22] & 255) << 24 | (var10002[var22 + 1] & 255) << 16 | (var10002[var22 + 2] & 255) << 8 | var10002[var22 + 3] & 255)
            ^ -600635169;
         var21 += 1;
         var52 = var22 + 4;
         var22 += 4;
      } while (var52 < var10002.length);

      String[] var0 = new String[2];
      int var4 = 0;
      String var3;
      int var5 = (var3 = ab((byte)6, 271087924, (byte)15, 'ꃧ')).length();
      int var2 = a(-1132459147, var17 ^ -1890638027);
      int var1 = -1;

      while (true) {
         label87: {
            char[] var25 = var3.substring(++var1, var1 + var2).toCharArray();
            var52 = var25.length;
            int var6 = 0;
            var40 = var25;
            var22 = var52;
            char[] var56;
            int var70;
            if (var52 <= 1) {
               var56 = var25;
               var70 = var6;
            } else {
               var40 = var25;
               var22 = var52;
               if (var52 <= var6) {
                  break label87;
               }

               var56 = var25;
               var70 = var6;
            }

            while (true) {
               var56[var70] = (char)(var56[var70] ^ switch (var6 % a(-1132459148, var17 ^ -643008267)) {
                  case 0 -> a(-1132459145, var17 ^ 608581933);
                  case 1 -> a(-1132459146, var17 ^ 1921742439);
                  case 2 -> a(-1132459151, var17 ^ -1139085007);
                  case 3 -> a(-1132459152, var17 ^ 245495222);
                  case 4 -> a(-1132459149, var17 ^ 1670804411);
                  case 5 -> a(-1132459150, var17 ^ -799643793);
                  default -> a(-1132459139, var17 ^ -1345817722);
               });
               var6++;
               if (var22 == 0) {
                  var70 = var22;
                  var56 = var40;
               } else {
                  if (var22 <= var6) {
                     break;
                  }

                  var56 = var40;
                  var70 = var6;
               }
            }
         }

         String var63 = new String(var40).intern();
         byte var32 = -1;
         var0[var4++] = var63;
         if ((var1 += var2) >= var5) {
            a = new abbabbabb();
            b = new abbabbabb();
            aa = b();
            return;
         }

         var2 = var3.charAt(var1);
      }
   }

   private static String ab(byte var0, int var1, byte var2, char var3) {
      int var8 = var1 ^ 271087924;
      char[] var7 = ba[var8].toCharArray();
      StackTraceElement[] var9 = (StackTraceElement[])bb[var8];
      StackTraceElement[] var10;
      if (var9 != null) {
         var10 = var9;
      } else {
         var10 = new Throwable().getStackTrace();
         bb[var8] = var10;
      }

      StackTraceElement var11 = var10[1];
      int var5 = (var11.getClassName().hashCode() ^ var11.getMethodName().hashCode()) >> 16 ^ 34463;
      int var6 = 0;

      do {
         var7[var6] = (char)(var7[var6] ^ switch (var6 % 30) {
            default -> 103;
            case 1 -> 245;
            case 2 -> 51;
            case 3 -> 39;
            case 4 -> 83;
            case 5 -> 227;
            case 6 -> 92;
            case 7 -> 152;
            case 8 -> 43;
            case 9 -> 194;
            case 10 -> 56;
            case 11 -> 204;
            case 12 -> 186;
            case 13 -> 207;
            case 14 -> 90;
            case 15 -> 149;
            case 16 -> 67;
            case 17 -> 162;
            case 18 -> 7;
            case 19 -> 69;
            case 20 -> 233;
            case 21 -> 13;
            case 22 -> 206;
            case 23 -> 11;
            case 24 -> 10;
            case 25 -> 209;
            case 26 -> 226;
            case 27 -> 117;
            case 28 -> 107;
            case 29 -> 35;
         } ^ 13467 ^ var2 ^ var1 ^ var0 ^ var5 ^ var3);
      } while (++var6 < var7.length);

      return new String(var7).intern();
   }

   private static abbabbabb[] b() {
      return new abbabbabb[]{a, b};
   }

   private static int a(int var0, int var1) {
      int var2 = ab[var0 ^ -1132459147] ^ var1 ^ var0;
      var2 -= 12429;
      var2 -= 17826;
      var2 ^= 53184;
      var2 += 51043;
      var2 ^= 44771;
      var2 -= 63976;
      return var2 + 55377;
   }

   public static abbabbabb aa(String var0) {
      return Enum.valueOf(abbabbabb.class, var0);
   }
}
