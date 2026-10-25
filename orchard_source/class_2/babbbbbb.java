package nsc;

import net.fabricmc.api.EnvType;
import net.fabricmc.api.Environment;

@Environment(EnvType.CLIENT)
enum babbbbbb {
   public static final babbbbbb aa;
   public static final babbbbbb ab;
   private static final String[] bb;
   private static final Object[] aaa;
   private static final int[] a;
   private static final babbbbbb[] ba;
   private final ababbbbaa b;

   private static String ab(byte var0, int var1, int var2, byte var3) {
      int var8 = var2 ^ -1725606685;
      char[] var7 = bb[var8].toCharArray();
      StackTraceElement[] var9 = (StackTraceElement[])aaa[var8];
      StackTraceElement[] var10;
      if (var9 != null) {
         var10 = var9;
      } else {
         var10 = new Throwable().getStackTrace();
         aaa[var8] = var10;
      }

      StackTraceElement var11 = var10[1];
      int var5 = (var11.getClassName().hashCode() ^ var11.getMethodName().hashCode()) >> 16 ^ 27730;
      int var6 = 0;

      do {
         var7[var6] = (char)(var7[var6] ^ switch (var6 % 23) {
            default -> 221;
            case 1 -> 88;
            case 2 -> 71;
            case 3 -> 153;
            case 4 -> 243;
            case 5 -> 156;
            case 6 -> 43;
            case 7 -> 149;
            case 8 -> 233;
            case 9 -> 155;
            case 10 -> 98;
            case 11 -> 180;
            case 12 -> 19;
            case 13 -> 178;
            case 14 -> 205;
            case 15 -> 149;
            case 16 -> 69;
            case 17 -> 201;
            case 18 -> 210;
            case 19 -> 95;
            case 20 -> 231;
            case 21 -> 192;
            case 22 -> 180;
         } ^ var6 ^ var5 ^ var0 ^ var2 ^ var1 ^ var3);
      } while (++var6 < var7.length);

      return new String(var7).intern();
   }

   public static babbbbbb b(String var0) {
      return Enum.valueOf(babbbbbb.class, var0);
   }

   private static int a(int var0, int var1) {
      int var2 = a[var0 ^ 1649571861] ^ var1 ^ var0;
      var2 ^= 40690;
      var2 += 18773;
      var2 -= 64831;
      var2 -= 49936;
      var2 ^= 33145;
      var2 += 11608;
      var2 ^= 45122;
      var2 += 14333;
      return var2 ^ 12803;
   }

   private static babbbbbb[] aa() {
      return new babbbbbb[]{ab, aa};
   }

   // $VF: Irreducible bytecode was duplicated to produce valid code
   static {
      int var24 = -1210161238;
      char[] var15 = "\n\u0015".toCharArray();
      String var14 = "嗴啞嗶唅嗎單唦唠啢嗵廯幇廧幔庰庱帘幛帽廜帔廴廷帑庨庣帲幣幧幈廃";
      short var13 = 32013;
      String[] var10000 = new String[var15.length];
      byte var20 = -1;
      String[] var16 = var10000;

      while (true) {
         int var17 = 0;
         char var18 = 0;
         char var19 = '\u0000';
         if (var20 == 0) {
            bb = var16;
            aaa = new Object[var16.length];
            int var9 = -868393579;
            byte[] var7 = "k\u008b\b:'B\u008b¤a¾´\u0018+)\u000bà\u0095Çí\u0003£ý\u008ak\u008dÁÕÞØzP\u009cD=îJ".getBytes("ISO-8859-1");
            int var8 = var7.length / 4;
            a = new int[var8];
            byte var10 = 0;
            int var11 = 0;

            do {
               int var12 = (var7[var10] & 255) << 24 | (var7[var10 + 1] & 255) << 16 | (var7[var10 + 2] & 255) << 8 | var7[var10 + 3] & 255;
               var12 ^= var9;
               a[var11] = var12;
               var10 += 4;
            } while (++var11 < var8);

            String[] var0 = new String[4];
            int var4 = 0;
            String var3;
            int var5 = (var3 = ab((byte)-93, -1661146534, -1725606685, 17)).length();
            int var2 = 4;
            int var26 = -1;

            label99:
            while (true) {
               String var30 = var3.substring(++var26, var26 + var2);
               int var10001 = -1;

               while (true) {
                  char[] var42;
                  label94: {
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
                           break label94;
                        }

                        var50 = var33;
                        var10004 = var6;
                     }

                     while (true) {
                        var50[var10004] = (char)(var50[var10004] ^ switch (var6 % a(1649571860, var24 ^ 1056064499)) {
                           case 0 -> a(1649571863, var24 ^ 2014215118);
                           case 1 -> a(1649571862, var24 ^ 848937799);
                           case 2 -> a(1649571857, var24 ^ -1938349387);
                           case 3 -> a(1649571856, var24 ^ -1169341936);
                           case 4 -> a(1649571859, var24 ^ -1804526202);
                           case 5 -> a(1649571858, var24 ^ -1043687181);
                           default -> a(1649571869, var24 ^ 1569531479);
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
                           ab = new babbbbbb(aabbaaaba.aaab(var0[2]));
                           aa = new babbbbbb(aabbaaaba.aaab(var0[3]));
                           ba = aa();
                           return;
                        }

                        var2 = var3.charAt(var26);
                        break;
                     default:
                        var0[var4++] = var57;
                        if ((var26 += var2) < var5) {
                           var2 = var3.charAt(var26);
                           continue label99;
                        }

                        var5 = (var3 = ab((byte)29, -1188830874, -1725606686, (byte)-92)).length();
                        var2 = a(1649571861, var24 ^ 1916518553);
                        var26 = -1;
                  }

                  var30 = var3.substring(++var26, var26 + var2);
                  var10001 = 0;
               }
            }
         }

         do {
            var19 = var15[var17];
            char[] var21 = var14.substring(var18, var18 + var19).toCharArray();
            int var22 = 0;

            do {
               short var23 = switch (var22 % 5) {
                  default -> 175;
                  case 1 -> 248;
                  case 2 -> 97;
                  case 3 -> 19;
                  case 4 -> 139;
               };
               var21[var22] = (char)(var21[var22] ^ var23 ^ var13);
            } while (++var22 < var21.length);

            var16[var17] = new String(var21).intern();
            var18 += var19;
         } while (++var17 < var15.length);

         var20 = 0;
      }
   }

   @Override
   public String toString() {
      return this.b.abab();
   }

   private babbbbbb(ababbbbaa var3) {
      this.b = var3;
   }
}
