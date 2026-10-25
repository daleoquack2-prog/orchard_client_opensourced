package nsc;

import net.fabricmc.api.EnvType;
import net.fabricmc.api.Environment;

@Environment(EnvType.CLIENT)
public enum aaaabbba {
   public static final aaaabbba aa;
   private static final int[] aba;
   public static final aaaabbba ab;
   public static final aaaabbba ba;
   private final ababbbbaa bb;
   private static final Object[] baa;
   private final double a;
   private static final aaaabbba[] aaa;
   private static final String[] abb;
   private final double aab;
   private final double b;

   private static int bb(int var0, int var1) {
      int var2 = aba[var0 ^ -1609161550] ^ var1 ^ var0;
      var2 += 14633;
      var2 ^= 14707;
      var2 -= 57490;
      var2 -= 14510;
      var2 ^= 36067;
      return var2 ^ 3621;
   }

   private static String aaa(int var0, short var1, int var2, char var3) {
      int var8 = var2 ^ 747272824;
      char[] var7 = abb[var8].toCharArray();
      StackTraceElement[] var9 = (StackTraceElement[])baa[var8];
      StackTraceElement[] var10;
      if (var9 != null) {
         var10 = var9;
      } else {
         var10 = new Throwable().getStackTrace();
         baa[var8] = var10;
      }

      StackTraceElement var11 = var10[1];
      int var5 = (var11.getClassName().hashCode() ^ var11.getMethodName().hashCode()) >> 16 ^ 56290;

      for (int var6 = 0; var6 < var7.length; var6++) {
         var7[var6] = (char)(var7[var6] ^ var6 ^ 21529 ^ switch (var6 % 13) {
            default -> 81;
            case 1 -> 42;
            case 2 -> 254;
            case 3 -> 98;
            case 4 -> 245;
            case 5 -> 73;
            case 6 -> 221;
            case 7 -> 74;
            case 8 -> 75;
            case 9 -> 44;
            case 10 -> 61;
            case 11 -> 223;
            case 12 -> 144;
         } ^ var3 ^ var2 ^ var5 ^ var0 ^ var1);
      }

      return new String(var7).intern();
   }

   public static aaaabbba aa(String var0) {
      return Enum.valueOf(aaaabbba.class, var0);
   }

   double ab() {
      return this.b;
   }

   private aaaabbba(ababbbbaa var3, double var4, double var6, double var8) {
      this.bb = var3;
      this.aab = var4;
      this.b = var6;
      this.a = var8;
   }

   @Override
   public String toString() {
      return this.bb.abab();
   }

   double b() {
      return this.aab;
   }

   double a() {
      return this.a;
   }

   // $VF: Irreducible bytecode was duplicated to produce valid code
   static {
      int var18 = 300160372;
      char[] var9 = "#\n".toCharArray();
      short var7 = 22391;
      byte var14 = -1;
      String var8 = "䪨䨐䫡䫯䨥䪣䪃䨷䫿䫩䫅䪃䪺䫤䫄䩳䩓䫢䪮䨉䫃䩐䩠䪂䩿䨋䩉䩑䩹䫍䩩䩜䪎䪠䪄䤭䦰䥑䤁䦽䤍䥣䦹䤴䤈";
      String[] var10 = new String[var9.length];

      while (true) {
         int var11 = 0;
         char var12 = 0;
         char var13 = '\u0000';
         if (var14 == 0) {
            abb = var10;
            baa = new Object[var10.length];
            byte var22 = 0;
            int var10001 = 0;
            aba = new int[9];
            byte[] var10002 = "Ãª\u008dL\u001fú¡\nñ\u001f~\u001d\u001añ\u0090\u0000jKùû\u0092»ÆÀ\u0004%:ù\u009cûéú¿òØ\u008f".getBytes("ISO-8859-1");

            int var57;
            do {
               aba[var22] = (
                     (var10002[var10001] & 255) << 24
                        | (var10002[var10001 + 1] & 255) << 16
                        | (var10002[var10001 + 2] & 255) << 8
                        | var10002[var10001 + 3] & 255
                  )
                  ^ 1420070530;
               var22 += 1;
               var57 = var10001 + 4;
               var10001 += 4;
            } while (var57 < var10002.length);

            String[] var0 = new String[bb(-1609161550, var18 ^ 654138946)];
            int var4 = 0;
            String var3;
            int var5 = (var3 = aaa(639055957, 14868, 747272824, '䚚')).length();
            int var2 = bb(-1609161549, var18 ^ -89296357);
            int var20 = -1;

            label97:
            while (true) {
               String var23 = var3.substring(++var20, var20 + var2);
               var10001 = (byte)-1;

               while (true) {
                  label92: {
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
                           break label92;
                        }

                        var61 = var29;
                        var75 = var6;
                     }

                     while (true) {
                        var61[var75] = (char)(var61[var75] ^ switch (var6 % bb(-1609161552, var18 ^ 340307218)) {
                           case 0 -> bb(-1609161551, var18 ^ -5880287);
                           case 1 -> bb(-1609161546, var18 ^ -1893978172);
                           case 2 -> 4;
                           case 3 -> bb(-1609161545, var18 ^ 2011960776);
                           case 4 -> bb(-1609161548, var18 ^ -512561968);
                           case 5 -> bb(-1609161547, var18 ^ 2041331496);
                           default -> bb(-1609161542, var18 ^ 1520765942);
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
                           ba = new aaaabbba(aabbaaaba.aaab(var0[3]), 0.88, 0.72, 1.0);
                           ab = new aaaabbba(aabbaaaba.aaab(var0[1]), 0.58, 0.38, 0.72);
                           aa = new aaaabbba(aabbaaaba.aaab(var0[0]), 0.24, 0.0, 0.38);
                           aaa = ba();
                           return;
                        }

                        var2 = var3.charAt(var20);
                        break;
                     default:
                        var0[var4++] = var68;
                        if ((var20 += var2) < var5) {
                           var2 = var3.charAt(var20);
                           continue label97;
                        }

                        var5 = (var3 = aaa(1960430994, 28413, 747272825, (char)'\ue431')).length();
                        var2 = 5;
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
                  default -> 169;
                  case 1 -> 98;
                  case 2 -> 0;
                  case 3 -> 216;
                  case 4 -> 149;
               };
               var15[var16] = (char)(var15[var16] ^ var17 ^ var7);
            } while (++var16 < var15.length);

            var10[var11] = new String(var15).intern();
            var12 += var13;
         } while (++var11 < var9.length);

         var14 = 0;
      }
   }

   private static aaaabbba[] ba() {
      return new aaaabbba[]{ba, ab, aa};
   }
}
