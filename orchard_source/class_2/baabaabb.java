package nsc;

import net.fabricmc.api.EnvType;
import net.fabricmc.api.Environment;

@Environment(EnvType.CLIENT)
public enum baabaabb {
   private static final String[] bb;
   public static final baabaabb aa;
   private final ababbbbaa ab;
   private static final int[] b;
   private static final Object[] aaa;
   public static final baabaabb a;
   private static final baabaabb[] ba;

   private static int a(int var0, int var1) {
      int var2 = b[var0 ^ -630259708] ^ var1 ^ var0;
      var2 -= 53469;
      var2 ^= 52623;
      var2 ^= 20118;
      var2 ^= 7567;
      var2 += 23207;
      return var2 + 14588;
   }

   @Override
   public String toString() {
      return this.ab.abab();
   }

   private static baabaabb[] b() {
      return new baabaabb[]{a, aa};
   }

   // $VF: Irreducible bytecode was duplicated to produce valid code
   static {
      int var18 = 1690216618;
      byte var14 = -1;
      String var8 = "쉨싎쉐숆슘쉆싔쉃슰쉅숏쉌쉲숺쉑숋싅슧쉞ꪊ꩙ꪍꪓꨴꫣ꩟ꫢꨶ\uaada\uaad7\uaac6\uaaf8ꪭꫝꪟꩇꨢ\uaacc";
      char[] var9 = "ܨܨ".toCharArray();
      short var7 = 1851;
      String[] var10 = new String[var9.length];

      while (true) {
         int var11 = 0;
         int var12 = 0;
         int var13 = 0;
         if (var14 == 0) {
            bb = var10;
            aaa = new Object[var10.length];
            byte var22 = 0;
            int var10001 = 0;
            b = new int[10];
            byte[] var10002 = "ëÂ<_ÊûÞw¬û1Ê¹\u0085\u009d\u000bP\u008d^àïÓ\u0096ò¦\u00077Þ\u007f*\u001f\u0016\u0090Èäkg\u0018\n\u008f".getBytes("ISO-8859-1");

            int var57;
            do {
               b[var22] = (
                     (var10002[var10001] & 255) << 24
                        | (var10002[var10001 + 1] & 255) << 16
                        | (var10002[var10001 + 2] & 255) << 8
                        | var10002[var10001 + 3] & 255
                  )
                  ^ -1796056523;
               var22 += 1;
               var57 = var10001 + 4;
               var10001 += 4;
            } while (var57 < var10002.length);

            String[] var0 = new String[4];
            int var4 = 0;
            String var3;
            int var5 = (var3 = aa(-2079349216, var18 ^ -165159485)).length();
            int var2 = a(-630259708, var18 ^ -1042215656);
            int var20 = -1;

            label100:
            while (true) {
               String var23 = var3.substring(++var20, var20 + var2);
               var10001 = (byte)-1;

               while (true) {
                  label95: {
                     char[] var29 = var23.toCharArray();
                     var57 = var29.length;
                     int var6 = 0;
                     var44 = var29;
                     var10001 = var57;
                     char[] var61;
                     int var75;
                     if (var57 <= 1) {
                        var61 = var29;
                        var75 = var6;
                     } else {
                        var44 = var29;
                        var10001 = var57;
                        if (var57 <= var6) {
                           break label95;
                        }

                        var61 = var29;
                        var75 = var6;
                     }

                     while (true) {
                        var61[var75] = (char)(var61[var75] ^ switch (var6 % a(-630259706, var18 ^ -2032664420)) {
                           case 0 -> a(-630259705, var18 ^ -1817793401);
                           case 1 -> a(-630259712, var18 ^ 2058252118);
                           case 2 -> a(-630259711, var18 ^ -974084177);
                           case 3 -> a(-630259710, var18 ^ -1943795805);
                           case 4 -> a(-630259709, var18 ^ 1426665038);
                           case 5 -> a(-630259700, var18 ^ -1158949860);
                           default -> a(-630259699, var18 ^ 1295727572);
                        });
                        var6++;
                        if (var10001 == 0) {
                           var75 = var10001;
                           var61 = var44;
                        } else {
                           if (var10001 <= var6) {
                              break;
                           }

                           var61 = var44;
                           var75 = var6;
                        }
                     }
                  }

                  String var68 = new String(var44).intern();
                  switch (var10001) {
                     case 0:
                        var0[var4++] = var68;
                        if ((var20 += var2) >= var5) {
                           a = new baabaabb(aabbaaaba.aaab(var0[0]));
                           aa = new baabaabb(aabbaaaba.aaab(var0[2]));
                           ba = b();
                           return;
                        }

                        var2 = var3.charAt(var20);
                        break;
                     default:
                        var0[var4++] = var68;
                        if ((var20 += var2) < var5) {
                           var2 = var3.charAt(var20);
                           continue label100;
                        }

                        var5 = (var3 = aa(-2079349215, var18 ^ -1632765612)).length();
                        var2 = a(-630259707, var18 ^ -522653903);
                        var20 = -1;
                  }

                  var23 = var3.substring(++var20, var20 + var2);
                  var10001 = (byte)0;
               }
            }
         }

         do {
            var13 = var9[var11] ^ var7;
            char[] var15 = var8.substring(var12, var12 + var13).toCharArray();
            int var16 = 0;

            do {
               short var17 = switch (var16 % 5) {
                  default -> 154;
                  case 1 -> 73;
                  case 2 -> 83;
                  case 3 -> 77;
                  case 4 -> 247;
               };
               var15[var16] = (char)(var15[var16] ^ var17);
            } while (++var16 < var15.length);

            var10[var11] = new String(var15).intern();
            var12 += var13;
         } while (++var11 < var9.length);

         var14 = 0;
      }
   }

   private static String aa(int var0, int var1) {
      int var3 = var0 ^ -2079349216;
      char[] var4 = bb[var3].toCharArray();
      StackTraceElement[] var2 = (StackTraceElement[])aaa[var3];
      StackTraceElement[] var5;
      if (var2 != null) {
         var5 = var2;
      } else {
         var5 = new Throwable().getStackTrace();
         aaa[var3] = var5;
      }

      StackTraceElement var6 = var5[1];
      int var7 = (var6.getClassName().hashCode() ^ var6.getMethodName().hashCode()) >> 16 ^ 991188179;
      int var8 = 0;

      do {
         var4[var8] = (char)(var4[var8] ^ switch (var8 & 31) {
            default -> 140;
            case 1 -> 205;
            case 2 -> 67;
            case 3 -> 71;
            case 4 -> 85;
            case 5 -> 254;
            case 6 -> 215;
            case 7 -> 84;
            case 8 -> 215;
            case 9 -> 134;
            case 10 -> 161;
            case 11 -> 79;
            case 12 -> 68;
            case 13 -> 30;
            case 14 -> 247;
            case 15 -> 179;
            case 16 -> 154;
            case 17 -> 194;
            case 18 -> 8;
            case 19 -> 227;
            case 20 -> 34;
            case 21 -> 53;
            case 22 -> 217;
            case 23 -> 49;
            case 24 -> 158;
            case 25 -> 178;
            case 26 -> 143;
            case 27 -> 216;
            case 28 -> 69;
            case 29 -> 131;
            case 30 -> 16;
            case 31 -> 130;
         } ^ var1 >> 16 ^ var7);
      } while (++var8 < var4.length);

      return new String(var4).intern();
   }

   private baabaabb(ababbbbaa var3) {
      this.ab = var3;
   }
}
