package nsc;

import net.fabricmc.api.EnvType;
import net.fabricmc.api.Environment;

@Environment(EnvType.CLIENT)
public enum abbbabb {
   public static final abbbabb aa;
   private static final int[] a;
   public static final abbbabb ab;
   private static final abbbabb[] ba;
   private static final String[] bb;
   private static final Object[] aaa;
   private final ababbbbaa b;

   // $VF: Irreducible bytecode was duplicated to produce valid code
   static {
      int var18 = 2046343156;
      String var8 = "殥殃毖歁歚殢毌殓毷歎欟武欪歁歎欜毂欢尷尮屈区岭尔叩尠峡岒屶䮾叮峈峖屬尢发峴峓屴小射䭾岠對尦可峮";
      short var7 = 9272;
      char[] var9 = "\u0012\u001d".toCharArray();
      byte var14 = -1;
      String[] var10 = new String[var9.length];

      while (true) {
         int var11 = 0;
         char var12 = 0;
         char var13 = '\u0000';
         if (var14 == 0) {
            bb = var10;
            aaa = new Object[var10.length];
            byte var22 = 0;
            a = new int[10];
            int var10001 = 0;
            byte[] var10002 = "\u001fØ.ÕÇ\u0099î\u0091\u009c¾{Æy²+~\u0004\u000e\u0016%!A\u0089Ê~\u0088óæ(Ô\u008a6Y\n\u009a³0\u0097ãø".getBytes("ISO-8859-1");

            int var57;
            do {
               a[var22] = (
                     (var10002[var10001] & 255) << 24
                        | (var10002[var10001 + 1] & 255) << 16
                        | (var10002[var10001 + 2] & 255) << 8
                        | var10002[var10001 + 3] & 255
                  )
                  ^ -768437236;
               var22 += 1;
               var57 = var10001 + 4;
               var10001 += 4;
            } while (var57 < var10002.length);

            String[] var0 = new String[4];
            int var4 = 0;
            String var3;
            int var5 = (var3 = aa((short)10404, '؟', var18 ^ 293836241)).length();
            int var2 = a(-720261412, var18 ^ 1627534670);
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
                        var61[var75] = (char)(var61[var75] ^ switch (var6 % a(-720261410, var18 ^ -496738269)) {
                           case 0 -> a(-720261409, var18 ^ 124268865);
                           case 1 -> a(-720261416, var18 ^ 2060717081);
                           case 2 -> a(-720261415, var18 ^ 1604031409);
                           case 3 -> a(-720261414, var18 ^ 5433830);
                           case 4 -> a(-720261413, var18 ^ 1443795034);
                           case 5 -> a(-720261420, var18 ^ 667975809);
                           default -> a(-720261419, var18 ^ 1313732998);
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
                           ab = new abbbabb(aabbaaaba.aaab(var0[3]));
                           aa = new abbbabb(aabbaaaba.aaab(var0[2]));
                           ba = b();
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

                        var5 = (var3 = aa((short)'舛', '؞', var18 ^ 1542107722)).length();
                        var2 = a(-720261411, var18 ^ -1186728698);
                        var20 = -1;
                  }

                  var23 = var3.substring(++var20, var20 + var2);
                  var10001 = (byte)0;
               }
            }
         }

         do {
            var13 = var9[var11];
            char[] var15 = var8.substring(var12, var12 + var13).toCharArray();
            int var16 = 0;

            do {
               short var17 = switch (var16 % 5) {
                  default -> 7;
                  case 1 -> 32;
                  case 2 -> 54;
                  case 3 -> 226;
                  case 4 -> 172;
               };
               var15[var16] = (char)(var15[var16] ^ var17 ^ var7);
            } while (++var16 < var15.length);

            var10[var11] = new String(var15).intern();
            var12 += var13;
         } while (++var11 < var9.length);

         var14 = 0;
      }
   }

   private static String aa(short var0, char var1, int var2) {
      int var3 = var1 ^ 1567;
      char[] var4 = bb[var3].toCharArray();
      StackTraceElement[] var5 = (StackTraceElement[])aaa[var3];
      StackTraceElement[] var6;
      if (var5 != null) {
         var6 = var5;
      } else {
         var6 = new Throwable().getStackTrace();
         aaa[var3] = var6;
      }

      StackTraceElement var7 = var6[1];
      int var8 = (var7.getClassName().hashCode() ^ var7.getMethodName().hashCode()) >> 16 ^ 18865;
      int var9 = 0;

      do {
         int var10 = var4[var9] + 'ꓥ';
         var10 += 63900;
         var10 += 49253;
         var10 -= 3762;
         var10 += 22604;
         var10 += 27554;
         var10 -= 43809;
         var10 -= 25823;
         var10 ^= 3010;
         var10 += 41841;
         var4[var9] = (char)(var10 ^ var8 ^ var0 ^ var2 >> 16);
      } while (++var9 < var4.length);

      return new String(var4).intern();
   }

   private abbbabb(ababbbbaa var3) {
      this.b = var3;
   }

   @Override
   public String toString() {
      return this.b.abab();
   }

   private static abbbabb[] b() {
      return new abbbabb[]{ab, aa};
   }

   private static int a(int var0, int var1) {
      int var2 = a[var0 ^ -720261412] ^ var1 ^ var0;
      var2 += 42975;
      var2 -= 13734;
      var2 -= 39613;
      var2 ^= 60241;
      var2 += 26322;
      var2 += 14339;
      var2 -= 48069;
      var2 -= 55667;
      return var2 ^ 36620;
   }
}
