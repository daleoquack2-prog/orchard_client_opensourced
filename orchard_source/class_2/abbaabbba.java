package nsc;

import net.fabricmc.api.EnvType;
import net.fabricmc.api.Environment;

@Environment(EnvType.CLIENT)
enum abbaabbba {
   public static final abbaabbba aa;
   private static final String[] bb;
   private static final int[] a;
   public static final abbaabbba ab;
   private static final abbaabbba[] ba;
   private static final Object[] aaa;
   private final ababbbbaa b;

   public static abbaabbba b(String var0) {
      return Enum.valueOf(abbaabbba.class, var0);
   }

   private static abbaabbba[] aa() {
      return new abbaabbba[]{ab, aa};
   }

   private static int a(int var0, int var1) {
      int var2 = a[var0 ^ -2012755] ^ var1 ^ var0;
      var2 ^= 28264;
      var2 -= 59876;
      var2 -= 1964;
      var2 -= 39051;
      var2 ^= 57369;
      var2 += 4160;
      var2 ^= 62267;
      return var2 ^ 15656;
   }

   // $VF: Irreducible bytecode was duplicated to produce valid code
   static {
      int var24 = -395316072;
      short var13 = 11043;
      byte var20 = -1;
      String var14 = "礿秣硭砽礎磰禐禥秤礟磲砘秅䞗䝺䜀䞊䞃䝸䝡䟰䝩䞣䟞䞤䜢䜗䝎䝏䜗䝁䞰䟵䞣䝐䝚䞏䟼";
      char[] var15 = "⬮⬺".toCharArray();
      String[] var16 = new String[var15.length];

      while (true) {
         int var17 = 0;
         int var18 = 0;
         int var19 = 0;
         if (var20 == 0) {
            bb = var16;
            aaa = new Object[var16.length];
            int var9 = -507851543;
            byte[] var7 = "5c[Ü\u008d0t\u008d«ïûÃ÷#G³3öF\u0019ÔÆÿFËõ\u001f\u0007\u001bì\u0012|aÐp]>\u009c_è".getBytes("ISO-8859-1");
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
            int var5 = (var3 = ab('ﺣ', var24 ^ -1394936577, '똪')).length();
            int var2 = a(-2012755, var24 ^ -1017732224);
            int var26 = -1;

            label98:
            while (true) {
               String var29 = var3.substring(++var26, var26 + var2);
               int var10001 = -1;

               while (true) {
                  char[] var41;
                  label93: {
                     char[] var32 = var29.toCharArray();
                     int var10003 = var32.length;
                     int var6 = 0;
                     var41 = var32;
                     var10001 = var10003;
                     char[] var49;
                     int var10004;
                     if (var10003 <= 1) {
                        var49 = var32;
                        var10004 = var6;
                     } else {
                        var41 = var32;
                        var10001 = var10003;
                        if (var10003 <= var6) {
                           break label93;
                        }

                        var49 = var32;
                        var10004 = var6;
                     }

                     while (true) {
                        var49[var10004] = (char)(var49[var10004] ^ switch (var6 % a(-2012753, var24 ^ 1574568861)) {
                           case 0 -> a(-2012754, var24 ^ 18264109);
                           case 1 -> a(-2012759, var24 ^ -977030767);
                           case 2 -> a(-2012760, var24 ^ 586352388);
                           case 3 -> a(-2012757, var24 ^ 1036052291);
                           case 4 -> a(-2012758, var24 ^ -304487017);
                           case 5 -> a(-2012763, var24 ^ -1746565119);
                           default -> a(-2012764, var24 ^ -928405480);
                        });
                        var6++;
                        if (var10001 == 0) {
                           var10004 = var10001;
                           var49 = var41;
                        } else {
                           if (var10001 <= var6) {
                              break;
                           }

                           var49 = var41;
                           var10004 = var6;
                        }
                     }
                  }

                  String var56 = new String(var41).intern();
                  switch (var10001) {
                     case 0:
                        var0[var4++] = var56;
                        if ((var26 += var2) >= var5) {
                           ab = new abbaabbba(aabbaaaba.aaab(var0[3]));
                           aa = new abbaabbba(aabbaaaba.aaab(var0[2]));
                           ba = aa();
                           return;
                        }

                        var2 = var3.charAt(var26);
                        break;
                     default:
                        var0[var4++] = var56;
                        if ((var26 += var2) < var5) {
                           var2 = var3.charAt(var26);
                           continue label98;
                        }

                        var5 = (var3 = ab('ｧ', var24 ^ -1617655822, '똫')).length();
                        var2 = a(-2012756, var24 ^ 2063961305);
                        var26 = -1;
                  }

                  var29 = var3.substring(++var26, var26 + var2);
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
                  default -> 18;
                  case 1 -> 194;
                  case 2 -> 142;
                  case 3 -> 213;
                  case 4 -> 54;
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
      return this.b.abab();
   }

   private static String ab(char var0, int var1, char var2) {
      int var3 = var2 ^ '똪';
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
      int var8 = (var7.getClassName().hashCode() ^ var7.getMethodName().hashCode()) >> 16 ^ 4331;
      int var9 = 0;

      do {
         int var10 = var4[var9] + 174;
         var10 += 880;
         var10 += 45872;
         var10 -= 55431;
         var10 += 40803;
         var10 ^= 22327;
         var4[var9] = (char)(var10 ^ var8 ^ var0 ^ var1 >> 16);
      } while (++var9 < var4.length);

      return new String(var4).intern();
   }

   private abbaabbba(ababbbbaa var3) {
      this.b = var3;
   }
}
