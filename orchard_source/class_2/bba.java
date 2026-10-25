package nsc;

import net.fabricmc.api.EnvType;
import net.fabricmc.api.Environment;

@Environment(EnvType.CLIENT)
enum bba implements bbaabba {
   public static final bba aa;
   private static final Object[] aaa;
   private static final bba[] ab;
   private static final String[] bb;
   private static final int[] a;
   public static final bba b;
   private final ababbbbaa ba;

   private static int b(int var0, int var1) {
      int var2 = a[var0 ^ -840033421] ^ var1 ^ var0;
      var2 += 9728;
      var2 -= 49304;
      var2 ^= 17764;
      var2 += 5515;
      var2 ^= 7596;
      var2 += 32521;
      var2 -= 50179;
      return var2 + 41256;
   }

   private static String aa(int var0, int var1) {
      int var3 = var0 ^ 384550057;
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
      int var7 = (var6.getClassName().hashCode() ^ var6.getMethodName().hashCode()) >> 16 ^ -1481615748;
      int var8 = 0;

      do {
         var4[var8] = (char)(var4[var8] ^ switch (var8 & 31) {
            default -> 132;
            case 1 -> 121;
            case 2 -> 170;
            case 3 -> 221;
            case 4 -> 55;
            case 5 -> 198;
            case 6 -> 123;
            case 7 -> 87;
            case 8 -> 100;
            case 9 -> 198;
            case 10 -> 103;
            case 11 -> 57;
            case 12 -> 35;
            case 13 -> 147;
            case 14 -> 50;
            case 15 -> 8;
            case 16 -> 14;
            case 17 -> 142;
            case 18 -> 167;
            case 19 -> 16;
            case 20 -> 179;
            case 21 -> 248;
            case 22 -> 217;
            case 23 -> 161;
            case 24 -> 146;
            case 25 -> 37;
            case 26 -> 76;
            case 27 -> 214;
            case 28 -> 192;
            case 29 -> 132;
            case 30 -> 233;
            case 31 -> 107;
         } ^ var1 >> 16 ^ var7);
      } while (++var8 < var4.length);

      return new String(var4).intern();
   }

   private static bba[] a() {
      return new bba[]{b, aa};
   }

   // $VF: Irreducible bytecode was duplicated to produce valid code
   static {
      int var18 = 1140535346;
      char[] var9 = "\f\u0019".toCharArray();
      String var8 = "锪閅镓锢闑锏閿閲閮锪關門㼕㿫㼑㽁㾌㽦㿳㿟㾪㽬㿖㿦㿂㼲㾏㾄㾠㼴㽰㾫㽰㼗㽁㼚㽿";
      short var7 = 26871;
      String[] var10 = new String[var9.length];
      byte var14 = -1;

      while (true) {
         int var11 = 0;
         char var12 = 0;
         char var13 = '\u0000';
         if (var14 == 0) {
            bb = var10;
            aaa = new Object[var10.length];
            byte var22 = 0;
            a = new int[8];
            int var10001 = 0;
            byte[] var10002 = "®oì\u0083¿ÊGæÕÖ ÌÇ]?ÌZm\u0081Ã{V\u009f\t\u0004¥\u0084z(àCF".getBytes("ISO-8859-1");

            int var57;
            do {
               a[var22] = (
                     (var10002[var10001] & 255) << 24
                        | (var10002[var10001 + 1] & 255) << 16
                        | (var10002[var10001 + 2] & 255) << 8
                        | var10002[var10001 + 3] & 255
                  )
                  ^ -1658672373;
               var22 += 1;
               var57 = var10001 + 4;
               var10001 += 4;
            } while (var57 < var10002.length);

            String[] var0 = new String[4];
            int var4 = 0;
            String var3;
            int var5 = (var3 = aa(384550057, var18 ^ -1269545403)).length();
            int var2 = 5;
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
                        var61[var75] = (char)(var61[var75] ^ switch (var6 % b(-840033422, var18 ^ -1392685173)) {
                           case 0 -> b(-840033423, var18 ^ -958322496);
                           case 1 -> b(-840033424, var18 ^ -731236409);
                           case 2 -> b(-840033417, var18 ^ 1230666325);
                           case 3 -> 1;
                           case 4 -> b(-840033418, var18 ^ 1751226159);
                           case 5 -> b(-840033419, var18 ^ 395476960);
                           default -> b(-840033420, var18 ^ 1003993319);
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
                           b = new bba(aabbaaaba.aaab(var0[3]));
                           aa = new bba(aabbaaaba.aaab(var0[2]));
                           ab = a();
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

                        var5 = (var3 = aa(384550056, var18 ^ 504784097)).length();
                        var2 = b(-840033421, var18 ^ -1118247726);
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
                  default -> 161;
                  case 1 -> 212;
                  case 2 -> 193;
                  case 3 -> 249;
                  case 4 -> 230;
               };
               var15[var16] = (char)(var15[var16] ^ var17 ^ var7);
            } while (++var16 < var15.length);

            var10[var11] = new String(var15).intern();
            var12 += var13;
         } while (++var11 < var9.length);

         var14 = 0;
      }
   }

   @Override
   public String toString() {
      return this.ba.abab();
   }

   private bba(ababbbbaa var3) {
      this.ba = var3;
   }
}
