package nsc;

import net.fabricmc.api.EnvType;
import net.fabricmc.api.Environment;

@Environment(EnvType.CLIENT)
enum abbababa {
   private static final abbababa[] aa;
   private static final Object[] aab;
   private static final int[] bb;
   public static final abbababa b;
   public static final abbababa ab;
   private final ababbbbaa ba;
   public static final abbababa a;
   private static final String[] aaa;

   private static String ab(int var0, int var1, short var2) {
      int var7 = var1 ^ 1045667549;
      char[] var6 = aaa[var7].toCharArray();
      StackTraceElement[] var8 = (StackTraceElement[])aab[var7];
      StackTraceElement[] var9;
      if (var8 != null) {
         var9 = var8;
      } else {
         var9 = new Throwable().getStackTrace();
         aab[var7] = var9;
      }

      StackTraceElement var10 = var9[1];
      int var4 = (var10.getClassName().hashCode() ^ var10.getMethodName().hashCode()) >> 16 ^ 21574;
      int var5 = 0;

      do {
         var6[var5] = (char)(var6[var5] ^ var5 ^ switch (var5 % 16) {
            default -> 28;
            case 1 -> 195;
            case 2 -> 19;
            case 3 -> 62;
            case 4 -> 52;
            case 5 -> 116;
            case 6 -> 72;
            case 7 -> 73;
            case 8 -> 1;
            case 9 -> 235;
            case 10 -> 77;
            case 11 -> 43;
            case 12 -> 250;
            case 13 -> 173;
            case 14 -> 244;
            case 15 -> 232;
         } ^ var2 ^ var4 ^ var1 ^ var0);
      } while (++var5 < var6.length);

      return new String(var6).intern();
   }

   private abbababa(ababbbbaa var3) {
      this.ba = var3;
   }

   // $VF: Irreducible bytecode was duplicated to produce valid code
   static {
      int var24 = -72725862;
      short var13 = 10760;
      char[] var15 = "⨠⨖".toCharArray();
      String var14 = "㣍㣷㢌㠐㡎㣢㠚㣴㠀㣯㣤㠦㠔㢌㢅㡣㡎㠊㡙㠌㣾㡃㣉㡷㠗㡛㠠㣐㣤㣃㡓㢒㢇㣁㠽㢷㠐㣚㠪㠜\"7uãætËs£sS·½\u001bW\u0095ë\u00adÒ\u009c\u0010ÎA\u0088âà´q\u0007f";
      int var10000 = var15.length;
      byte var20 = -1;
      String[] var16 = new String[var10000];

      while (true) {
         int var17 = 0;
         int var18 = 0;
         int var19 = 0;
         if (var20 == 0) {
            aaa = var16;
            aab = new Object[var16.length];
            int var9 = 1160827801;
            byte[] var7 = "y)hl°¹D³,\u000b¦\u001b\u0014íý\u0094*~U^hûn9\u000bjt<\u0011\u0092ýà[è<íuB[µ\u008e\u0017\u008b<".getBytes("ISO-8859-1");
            int var8 = var7.length / 4;
            bb = new int[var8];
            byte var10 = 0;
            int var11 = 0;

            do {
               int var12 = (var7[var10] & 255) << 24 | (var7[var10 + 1] & 255) << 16 | (var7[var10 + 2] & 255) << 8 | var7[var10 + 3] & 255;
               var12 ^= var9;
               bb[var11] = var12;
               var10 += 4;
            } while (++var11 < var8);

            String[] var0 = new String[a(-330293916, var24 ^ 736242104)];
            int var4 = 0;
            String var3;
            int var5 = (var3 = ab(-684752499, 1045667549, (short)-22167)).length();
            int var2 = a(-330293915, var24 ^ -495843996);
            int var26 = -1;

            label100:
            while (true) {
               String var30 = var3.substring(++var26, var26 + var2);
               int var10001 = -1;

               while (true) {
                  char[] var42;
                  label95: {
                     char[] var33 = var30.toCharArray();
                     int var10003 = var33.length;
                     int var6 = 0;
                     var42 = var33;
                     var10001 = var10003;
                     char[] var50;
                     int var10004;
                     if (var10003 <= 1) {
                        var50 = var33;
                        var10004 = var6;
                     } else {
                        var42 = var33;
                        var10001 = var10003;
                        if (var10003 <= var6) {
                           break label95;
                        }

                        var50 = var33;
                        var10004 = var6;
                     }

                     while (true) {
                        var50[var10004] = (char)(var50[var10004] ^ switch (var6 % a(-330293913, var24 ^ 1176943692)) {
                           case 0 -> a(-330293920, var24 ^ 2025132837);
                           case 1 -> a(-330293919, var24 ^ 976234553);
                           case 2 -> a(-330293918, var24 ^ 1503737310);
                           case 3 -> a(-330293917, var24 ^ 1129954240);
                           case 4 -> a(-330293908, var24 ^ 153320081);
                           case 5 -> a(-330293907, var24 ^ 663296598);
                           default -> a(-330293906, var24 ^ -589552771);
                        });
                        var6++;
                        if (var10001 == 0) {
                           var10004 = var10001;
                           var50 = var42;
                        } else {
                           if (var10001 <= var6) {
                              break;
                           }

                           var50 = var42;
                           var10004 = var6;
                        }
                     }
                  }

                  String var57 = new String(var42).intern();
                  switch (var10001) {
                     case 0:
                        var0[var4++] = var57;
                        if ((var26 += var2) >= var5) {
                           a = new abbababa(aabbaaaba.aaab(var0[3]));
                           ab = new abbababa(aabbaaaba.aaab(var0[0]));
                           b = new abbababa(aabbaaaba.aaab(var0[4]));
                           aa = b();
                           return;
                        }

                        var2 = var3.charAt(var26);
                        break;
                     default:
                        var0[var4++] = var57;
                        if ((var26 += var2) < var5) {
                           var2 = var3.charAt(var26);
                           continue label100;
                        }

                        var5 = (var3 = ab(1968913531, 1045667548, (short)11337)).length();
                        var2 = a(-330293914, var24 ^ 2126569503);
                        var26 = -1;
                  }

                  var30 = var3.substring(++var26, var26 + var2);
                  var10001 = 0;
               }
            }
         }

         do {
            var19 = var15[var17] ^ var13;
            char[] var21 = var14.substring(var18, var18 + var19).toCharArray();
            int var22 = 0;

            do {
               short var23 = switch (var22 % 5) {
                  default -> 115;
                  case 1 -> 241;
                  case 2 -> 105;
                  case 3 -> 143;
                  case 4 -> 172;
               };
               var21[var22] = (char)(var21[var22] ^ var23);
            } while (++var22 < var21.length);

            var16[var17] = new String(var21).intern();
            var18 += var19;
         } while (++var17 < var15.length);

         var20 = 0;
      }
   }

   @Override
   public String toString() {
      return this.ba.abab();
   }

   private static abbababa[] b() {
      return new abbababa[]{a, ab, b};
   }

   private static int a(int var0, int var1) {
      int var2 = bb[var0 ^ -330293916] ^ var1 ^ var0;
      var2 ^= 1474;
      var2 ^= 6800;
      var2 ^= 41225;
      var2 -= 63307;
      var2 ^= 27427;
      var2 -= 43227;
      var2 -= 5695;
      var2 ^= 58926;
      var2 -= 24386;
      return var2 - 30530;
   }

   public static abbababa aa(String var0) {
      return Enum.valueOf(abbababa.class, var0);
   }
}
