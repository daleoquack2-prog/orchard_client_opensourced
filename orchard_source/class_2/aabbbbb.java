package nsc;

import net.fabricmc.api.EnvType;
import net.fabricmc.api.Environment;

@Environment(EnvType.CLIENT)
public enum aabbbbb {
   public static final aabbbbb aa;
   private final ababbbbaa ab;
   private static final int[] ba;
   private static final Object[] aaa;
   private static final aabbbbb[] a;
   private static final String[] bb;
   public static final aabbbbb b;

   private static int a(int var0, int var1) {
      int var2 = ba[var0 ^ 1238130863] ^ var1 ^ var0;
      var2 += 10800;
      var2 ^= 50658;
      var2 ^= 37080;
      var2 -= 9705;
      var2 += 590;
      return var2 - 17617;
   }

   private aabbbbb(ababbbbaa var3) {
      this.ab = var3;
   }

   // $VF: Irreducible bytecode was duplicated to produce valid code
   static {
      int var18 = 13479863;
      byte var14 = -1;
      String var8 = "춟쵦춱췈춗췽쵛쵎촵촆춖쵠쵄쵙춧쵬쵬췷춏춆췋춐쵐춣춨ℰ↬℘ℒⅉℊↀ↋↻↯ℊ";
      char[] var9 = "\u0019\u000b".toCharArray();
      short var7 = 11222;
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
            ba = new int[8];
            byte[] var10002 = "\u0019e»\u0013\u0018\u009f´¢\u009aûñµ¼p0A\u0099Ù\u0003òrÍ'ÿ\u0016@ñæÛ\u001e'¿".getBytes("ISO-8859-1");

            int var57;
            do {
               ba[var22] = (
                     (var10002[var10001] & 255) << 24
                        | (var10002[var10001 + 1] & 255) << 16
                        | (var10002[var10001 + 2] & 255) << 8
                        | var10002[var10001 + 3] & 255
                  )
                  ^ 1713760709;
               var22 += 1;
               var57 = var10001 + 4;
               var10001 += 4;
            } while (var57 < var10002.length);

            String[] var0 = new String[4];
            int var4 = 0;
            String var3;
            int var5 = (var3 = ab(597112754, var18 ^ 1343985490)).length();
            int var2 = a(1238130863, var18 ^ 910266076);
            int var20 = -1;

            label103:
            while (true) {
               String var23 = var3.substring(++var20, var20 + var2);
               var10001 = (byte)-1;

               while (true) {
                  label98: {
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
                           break label98;
                        }

                        var61 = var29;
                        var75 = var6;
                     }

                     while (true) {
                        var61[var75] = (char)(var61[var75] ^ switch (var6 % a(1238130862, var18 ^ 935035239)) {
                           case 0 -> 1;
                           case 1 -> a(1238130861, var18 ^ -1243626265);
                           case 2 -> a(1238130860, var18 ^ -1823209996);
                           case 3 -> a(1238130859, var18 ^ -1224919421);
                           case 4 -> a(1238130858, var18 ^ 1575555706);
                           case 5 -> a(1238130857, var18 ^ 962905247);
                           default -> a(1238130856, var18 ^ -197520880);
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
                           b = new aabbbbb(aabbaaaba.aaab(var0[1]));
                           aa = new aabbbbb(aabbaaaba.aaab(var0[0]));
                           a = aa();
                           return;
                        }

                        var2 = var3.charAt(var20);
                        break;
                     default:
                        var0[var4++] = var68;
                        if ((var20 += var2) < var5) {
                           var2 = var3.charAt(var20);
                           continue label103;
                        }

                        var5 = (var3 = ab(597112755, var18 ^ -1126715271)).length();
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
                  default -> 55;
                  case 1 -> 190;
                  case 2 -> 227;
                  case 3 -> 190;
                  case 4 -> 233;
               };
               var15[var16] = (char)(var15[var16] ^ var17 ^ var7);
            } while (++var16 < var15.length);

            var10[var11] = new String(var15).intern();
            var12 += var13;
         } while (++var11 < var9.length);

         var14 = 0;
      }
   }

   public static aabbbbb b(String var0) {
      return Enum.valueOf(aabbbbb.class, var0);
   }

   private static String ab(int var0, int var1) {
      int var3 = var0 ^ 597112754;
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
      int var7 = (var6.getClassName().hashCode() ^ var6.getMethodName().hashCode()) >> 16 ^ 231491127;
      int var8 = 0;

      do {
         var4[var8] = (char)(var4[var8] ^ switch (var8 & 31) {
            default -> 64;
            case 1 -> 67;
            case 2 -> 143;
            case 3 -> 142;
            case 4 -> 174;
            case 5 -> 45;
            case 6 -> 125;
            case 7 -> 57;
            case 8 -> 113;
            case 9 -> 100;
            case 10 -> 51;
            case 11 -> 113;
            case 12 -> 114;
            case 13 -> 77;
            case 14 -> 220;
            case 15 -> 246;
            case 16 -> 31;
            case 17 -> 202;
            case 18 -> 213;
            case 19 -> 203;
            case 20 -> 117;
            case 21 -> 161;
            case 22 -> 56;
            case 23 -> 143;
            case 24 -> 238;
            case 25 -> 105;
            case 26 -> 162;
            case 27 -> 164;
            case 28 -> 143;
            case 29 -> 32;
            case 30 -> 223;
            case 31 -> 254;
         } ^ var1 >> 16 ^ var7);
      } while (++var8 < var4.length);

      return new String(var4).intern();
   }

   private static aabbbbb[] aa() {
      return new aabbbbb[]{b, aa};
   }

   @Override
   public String toString() {
      return this.ab.abab();
   }
}
