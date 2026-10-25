package nsc;

import net.fabricmc.api.EnvType;
import net.fabricmc.api.Environment;

@Environment(EnvType.CLIENT)
enum aababbaab {
   private static final int[] a;
   private static final aababbaab[] aa;
   public static final aababbaab b;
   private static final String[] bb;
   public static final aababbaab ab;
   private static final Object[] aaa;
   private final ababbbbaa ba;

   private static String ab(int var0, int var1) {
      int var3 = var0 ^ 1323300608;
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
      int var7 = (var6.getClassName().hashCode() ^ var6.getMethodName().hashCode()) >> 16 ^ -1596918940;
      int var8 = 0;

      do {
         var4[var8] = (char)(var4[var8] ^ switch (var8 & 31) {
            default -> 0;
            case 1 -> 105;
            case 2 -> 144;
            case 3 -> 90;
            case 4 -> 234;
            case 5 -> 247;
            case 6 -> 115;
            case 7 -> 38;
            case 8 -> 144;
            case 9 -> 81;
            case 10 -> 94;
            case 11 -> 45;
            case 12 -> 177;
            case 13 -> 24;
            case 14 -> 98;
            case 15 -> 120;
            case 16 -> 81;
            case 17 -> 171;
            case 18 -> 131;
            case 19 -> 11;
            case 20 -> 188;
            case 21 -> 238;
            case 22 -> 81;
            case 23 -> 31;
            case 24 -> 9;
            case 25 -> 63;
            case 26 -> 192;
            case 27 -> 217;
            case 28 -> 43;
            case 29 -> 250;
            case 30 -> 17;
            case 31 -> 43;
         } ^ var1 >> 16 ^ var7);
      } while (++var8 < var4.length);

      return new String(var4).intern();
   }

   // $VF: Irreducible bytecode was duplicated to produce valid code
   static {
      int var17 = 732896453;
      String[] var9 = new String[2];
      short var12 = 17217;
      int var10 = 0;
      int var8 = "\u0013觧姠钧\ue9e3騧姦跇뇠麇觢辇\ue1e1鍧᧠蕧槣賧\ue1e7颇\u0013⫬\ufb08㤌䌋㩌\ueb0fⳌ嬊ヌ\ueb0b⪌⬋㔬⬊ℬ\ue30a⸬茌㔌".length();
      int var11 = 0;
      String var7 = "\u0013觧姠钧\ue9e3騧姦跇뇠麇觢辇\ue1e1鍧᧠蕧槣賧\ue1e7颇\u0013⫬\ufb08㤌䌋㩌\ueb0fⳌ嬊ヌ\ueb0b⪌⬋㔬⬊ℬ\ue30a⸬茌㔌";

      do {
         char var13 = var7.charAt(var11);
         int var10001 = var11 + 1;
         int var10002 = var11 + 1;
         int var15 = 0;
         char[] var14 = var7.substring(var10001, var10002 + var13).toCharArray();

         do {
            char var16 = var14[var15];
            if (var15 % 2 == 0) {
               var14[var15] = (char)((var16 >>> 5 | var16 << 11) & 65535 ^ var12);
            } else {
               var14[var15] = (char)((var16 << 5 | var16 >>> 11) & 65535 ^ var12);
            }
         } while (++var15 < var14.length);

         var9[var10] = new String(var14);
         var10++;
         var11 = var11 + var13 + 1;
      } while (var11 < var8);

      bb = var9;
      aaa = new Object[var9.length];
      byte var10000 = 0;
      int var22 = 0;
      a = new int[10];
      byte[] var34 = "Bø(\u0083hâ\u000eP\u007f2(Å\u0098\u008eçhÉ\u0012¬áiZ¤Á\u0004¸6\u009bÿèÎ\u009cÕ\u0097£>â\u008ao¾".getBytes("ISO-8859-1");

      int var56;
      do {
         a[var10000] = ((var34[var22] & 255) << 24 | (var34[var22 + 1] & 255) << 16 | (var34[var22 + 2] & 255) << 8 | var34[var22 + 3] & 255) ^ -1089604458;
         var10000 += 1;
         var56 = var22 + 4;
         var22 += 4;
      } while (var56 < var34.length);

      String[] var0 = new String[4];
      int var4 = 0;
      String var3;
      int var5 = (var3 = ab(1323300608, var17 ^ 892613778)).length();
      int var2 = a(1961686392, var17 ^ 1565065026);
      int var19 = -1;

      label92:
      while (true) {
         String var20 = var3.substring(++var19, var19 + var2);
         var22 = (byte)-1;

         while (true) {
            label87: {
               char[] var27 = var20.toCharArray();
               var56 = var27.length;
               int var6 = 0;
               var43 = var27;
               var22 = var56;
               char[] var60;
               int var74;
               if (var56 <= 1) {
                  var60 = var27;
                  var74 = var6;
               } else {
                  var43 = var27;
                  var22 = var56;
                  if (var56 <= var6) {
                     break label87;
                  }

                  var60 = var27;
                  var74 = var6;
               }

               while (true) {
                  var60[var74] = (char)(var60[var74] ^ switch (var6 % a(1961686394, var17 ^ 1619197701)) {
                     case 0 -> a(1961686395, var17 ^ -2025967344);
                     case 1 -> a(1961686396, var17 ^ -693994654);
                     case 2 -> a(1961686397, var17 ^ 1995075989);
                     case 3 -> a(1961686398, var17 ^ 453567451);
                     case 4 -> a(1961686399, var17 ^ -531096627);
                     case 5 -> a(1961686384, var17 ^ -903383542);
                     default -> a(1961686385, var17 ^ -46483395);
                  });
                  var6++;
                  if (var22 == 0) {
                     var74 = var22;
                     var60 = var43;
                  } else {
                     if (var22 <= var6) {
                        break;
                     }

                     var60 = var43;
                     var74 = var6;
                  }
               }
            }

            String var67 = new String(var43).intern();
            switch (var22) {
               case 0:
                  var0[var4++] = var67;
                  if ((var19 += var2) >= var5) {
                     ab = new aababbaab(aabbaaaba.aaab(var0[1]));
                     b = new aababbaab(aabbaaaba.aaab(var0[2]));
                     aa = aa();
                     return;
                  }

                  var2 = var3.charAt(var19);
                  break;
               default:
                  var0[var4++] = var67;
                  if ((var19 += var2) < var5) {
                     var2 = var3.charAt(var19);
                     continue label92;
                  }

                  var5 = (var3 = ab(1323300609, var17 ^ 1748729750)).length();
                  var2 = a(1961686393, var17 ^ 2001917990);
                  var19 = -1;
            }

            var20 = var3.substring(++var19, var19 + var2);
            var22 = (byte)0;
         }
      }
   }

   private aababbaab(ababbbbaa var3) {
      this.ba = var3;
   }

   private static int a(int var0, int var1) {
      int var2 = a[var0 ^ 1961686392] ^ var1 ^ var0;
      var2 ^= 3674;
      var2 -= 12056;
      var2 += 38780;
      var2 ^= 12058;
      var2 ^= 947;
      return var2 + 65097;
   }

   public static aababbaab b(String var0) {
      return Enum.valueOf(aababbaab.class, var0);
   }

   private static aababbaab[] aa() {
      return new aababbaab[]{ab, b};
   }

   @Override
   public String toString() {
      return this.ba.abab();
   }
}
