package nsc;

import net.fabricmc.api.EnvType;
import net.fabricmc.api.Environment;

@Environment(EnvType.CLIENT)
enum baaabba {
   private static final baaabba[] aa;
   private final ababbbbaa b;
   private static final int[] ba;
   public static final baaabba a;
   private static final Object[] aaa;
   public static final baaabba ab;
   private static final String[] bb;

   private static int a(int var0, int var1) {
      int var2 = ba[var0 ^ 1117746649] ^ var1 ^ var0;
      var2 ^= 29380;
      var2 += 40838;
      var2 -= 21371;
      var2 ^= 39140;
      var2 += 7507;
      var2 ^= 62540;
      var2 -= 16275;
      var2 ^= 14939;
      var2 ^= 9651;
      return var2 - 27871;
   }

   @Override
   public String toString() {
      return this.b.abab();
   }

   private static String ab(int var0, byte var1, char var2, char var3, int var4, char var5, byte var6) {
      int var11 = var4 ^ 1549167941;
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
      int var8 = (var14.getClassName().hashCode() ^ var14.getMethodName().hashCode()) >> 16 ^ 10462;

      for (int var9 = 0; var9 < var10.length; var9++) {
         var10[var9] = (char)(var10[var9] ^ 32411 ^ switch (var9 % 29) {
            default -> 38;
            case 1 -> 35;
            case 2 -> 197;
            case 3 -> 235;
            case 4 -> 195;
            case 5 -> 152;
            case 6 -> 213;
            case 7 -> 189;
            case 8 -> 113;
            case 9 -> 124;
            case 10 -> 166;
            case 11 -> 147;
            case 12 -> 104;
            case 13 -> 111;
            case 14 -> 58;
            case 15 -> 172;
            case 16 -> 36;
            case 17 -> 28;
            case 18 -> 158;
            case 19 -> 81;
            case 20 -> 225;
            case 21 -> 209;
            case 22 -> 30;
            case 23 -> 194;
            case 24 -> 211;
            case 25 -> 6;
            case 26 -> 203;
            case 27 -> 92;
            case 28 -> 57;
         } ^ var9 ^ var8 ^ var3 ^ var4 ^ var6 ^ var2 ^ var5 ^ var1 ^ var0);
      }

      return new String(var10).intern();
   }

   private static baaabba[] b() {
      return new baaabba[]{a, ab};
   }

   public static baaabba aa(String var0) {
      return Enum.valueOf(baaabba.class, var0);
   }

   private baaabba(ababbbbaa var3) {
      this.b = var3;
   }

   // $VF: Irreducible bytecode was duplicated to produce valid code
   static {
      int var18 = -1611589414;
      String var8 = "펗펋팛폖팛팯퍮퍱펭퍺팖팥폥폺폂펏폰폥팴폈퍠폜평퍟팊펫퍯퍂펛펹펡퍺퍸䆤䇧䄧䆁䅋䅰䄤䄺䇋䄪䄅䄢䇖䆉䆐䆜䇃";
      short var7 = 22515;
      byte var14 = -1;
      char[] var9 = "埒埢".toCharArray();
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
            ba = new int[10];
            byte[] var10002 = "\u008a0á×·bËÖZÙ\u0081\u009b\u008f\u0011&\u008fÂà¨êÛ\u001c\u0086ð\u0097#æb ^¯\f!\u0014åÌ\u0097$\u008d»".getBytes("ISO-8859-1");

            int var57;
            do {
               ba[var22] = (
                     (var10002[var10001] & 255) << 24
                        | (var10002[var10001 + 1] & 255) << 16
                        | (var10002[var10001 + 2] & 255) << 8
                        | var10002[var10001 + 3] & 255
                  )
                  ^ 95145526;
               var22 += 1;
               var57 = var10001 + 4;
               var10001 += 4;
            } while (var57 < var10002.length);

            String[] var0 = new String[4];
            int var4 = 0;
            String var3;
            int var5 = (var3 = ab(1259253644, (byte)121, 'μ', '贯', 1549167941, 3068, (byte)-18)).length();
            int var2 = a(1117746649, var18 ^ 1391809914);
            int var20 = -1;

            label102:
            while (true) {
               String var23 = var3.substring(++var20, var20 + var2);
               var10001 = (byte)-1;

               while (true) {
                  label97: {
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
                           break label97;
                        }

                        var61 = var29;
                        var75 = var6;
                     }

                     while (true) {
                        var61[var75] = (char)(var61[var75] ^ switch (var6 % a(1117746651, var18 ^ -2112080613)) {
                           case 0 -> a(1117746650, var18 ^ 1473549440);
                           case 1 -> a(1117746653, var18 ^ 438639783);
                           case 2 -> a(1117746652, var18 ^ 64565842);
                           case 3 -> a(1117746655, var18 ^ 1340494580);
                           case 4 -> a(1117746654, var18 ^ -124052764);
                           case 5 -> a(1117746641, var18 ^ -103722965);
                           default -> a(1117746640, var18 ^ 1340160100);
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
                           a = new baaabba(aabbaaaba.aaab(var0[0]));
                           ab = new baaabba(aabbaaaba.aaab(var0[1]));
                           aa = b();
                           return;
                        }

                        var2 = var3.charAt(var20);
                        break;
                     default:
                        var0[var4++] = var68;
                        if ((var20 += var2) < var5) {
                           var2 = var3.charAt(var20);
                           continue label102;
                        }

                        var5 = (var3 = ab(-1032879701, (byte)110, '\uec46', (char)'럀', 1549167940, '抳', (byte)-35)).length();
                        var2 = a(1117746648, var18 ^ 1873248082);
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
               short var17 = switch (var16 % 6) {
                  default -> 18;
                  case 1 -> 6;
                  case 2 -> 80;
                  case 3 -> 207;
                  case 4 -> 102;
                  case 5 -> 20;
               };
               var15[var16] = (char)(var15[var16] ^ var17);
            } while (++var16 < var15.length);

            var10[var11] = new String(var15).intern();
            var12 += var13;
         } while (++var11 < var9.length);

         var14 = 0;
      }
   }
}
