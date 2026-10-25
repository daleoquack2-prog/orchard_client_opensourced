package nsc;

import net.fabricmc.api.EnvType;
import net.fabricmc.api.Environment;

@Environment(EnvType.CLIENT)
enum bbbab {
   private static final Object[] aaa;
   public static final bbbab aa;
   private static final String[] bb;
   private static final bbbab[] ab;
   private static final int[] ba;
   private final ababbbbaa b;
   public static final bbbab a;

   private static int a(int var0, int var1) {
      int var2 = ba[var0 ^ 1737827467] ^ var1 ^ var0;
      var2 ^= 32170;
      var2 -= 38146;
      var2 -= 5590;
      var2 ^= 13589;
      var2 ^= 44205;
      var2 += 31837;
      var2 += 42850;
      var2 ^= 46852;
      var2 -= 61240;
      return var2 ^ 6818;
   }

   private static bbbab[] b() {
      return new bbbab[]{a, aa};
   }

   public static bbbab aa(String var0) {
      return Enum.valueOf(bbbab.class, var0);
   }

   @Override
   public String toString() {
      return this.b.abab();
   }

   private static String ab(int var0, int var1) {
      int var3 = var0 ^ -2127881646;
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
      int var7 = (var6.getClassName().hashCode() ^ var6.getMethodName().hashCode()) >> 16 ^ -960012641;
      int var8 = 0;

      do {
         var4[var8] = (char)(var4[var8] ^ switch (var8 & 31) {
            default -> 36;
            case 1 -> 109;
            case 2 -> 134;
            case 3 -> 225;
            case 4 -> 39;
            case 5 -> 32;
            case 6 -> 230;
            case 7 -> 101;
            case 8 -> 162;
            case 9 -> 139;
            case 10 -> 247;
            case 11 -> 9;
            case 12 -> 156;
            case 13 -> 17;
            case 14 -> 47;
            case 15 -> 121;
            case 16 -> 190;
            case 17 -> 240;
            case 18 -> 76;
            case 19 -> 42;
            case 20 -> 6;
            case 21 -> 237;
            case 22 -> 232;
            case 23 -> 131;
            case 24 -> 115;
            case 25 -> 207;
            case 26 -> 232;
            case 27 -> 230;
            case 28 -> 47;
            case 29 -> 57;
            case 30 -> 80;
            case 31 -> 107;
         } ^ var1 >> 16 ^ var7);
      } while (++var8 < var4.length);

      return new String(var4).intern();
   }

   // $VF: Irreducible bytecode was duplicated to produce valid code
   static {
      int var18 = -1749444573;
      String var8 = "⦼⥴⦵⧶⦱⦝⧽⤓⧻⥼⤛⥝⦤⤖⦸⦈⧏⦮⥠⦒⦠⧭⦖⦓⦴ꒁꑩ꒷\ua4c8꒹\ua4cd꒑ꑂꓟꑟꑊꐑ";
      byte var14 = -1;
      char[] var9 = "\u0019\f".toCharArray();
      short var7 = 21129;
      String[] var10 = new String[var9.length];

      while (true) {
         int var11 = 0;
         char var12 = 0;
         char var13 = '\u0000';
         if (var14 == 0) {
            bb = var10;
            aaa = new Object[var10.length];
            byte var22 = 0;
            int var10001 = 0;
            ba = new int[10];
            byte[] var10002 = "'\n£\u0001\b\u0083Æ\u0015\u000e&\u008c\u008b®ë,ªKÕÁt^ZÒVY¸±Ó|Ól²\u0094\u0090Z«\u008fPð\\".getBytes("ISO-8859-1");

            int var57;
            do {
               ba[var22] = (
                     (var10002[var10001] & 255) << 24
                        | (var10002[var10001 + 1] & 255) << 16
                        | (var10002[var10001 + 2] & 255) << 8
                        | var10002[var10001 + 3] & 255
                  )
                  ^ 583598793;
               var22 += 1;
               var57 = var10001 + 4;
               var10001 += 4;
            } while (var57 < var10002.length);

            String[] var0 = new String[4];
            int var4 = 0;
            String var3;
            int var5 = (var3 = ab(-2127881646, var18 ^ 358842932)).length();
            int var2 = a(1737827467, var18 ^ -168833607);
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
                        var61[var75] = (char)(var61[var75] ^ switch (var6 % a(1737827465, var18 ^ -591142344)) {
                           case 0 -> a(1737827464, var18 ^ 2081309863);
                           case 1 -> a(1737827471, var18 ^ -1724862525);
                           case 2 -> a(1737827470, var18 ^ -1933591979);
                           case 3 -> a(1737827469, var18 ^ -1956782270);
                           case 4 -> a(1737827468, var18 ^ -1372192001);
                           case 5 -> a(1737827459, var18 ^ 1182086375);
                           default -> a(1737827458, var18 ^ 1572183578);
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
                           a = new bbbab(aabbaaaba.aaab(var0[1]));
                           aa = new bbbab(aabbaaaba.aaab(var0[0]));
                           ab = b();
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

                        var5 = (var3 = ab(-2127881645, var18 ^ -1740188769)).length();
                        var2 = a(1737827466, var18 ^ -630806362);
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
                  default -> 57;
                  case 1 -> 218;
                  case 2 -> 185;
                  case 3 -> 169;
                  case 4 -> 73;
               };
               var15[var16] = (char)(var15[var16] ^ var17 ^ var7);
            } while (++var16 < var15.length);

            var10[var11] = new String(var15).intern();
            var12 += var13;
         } while (++var11 < var9.length);

         var14 = 0;
      }
   }

   private bbbab(ababbbbaa var3) {
      this.b = var3;
   }
}
