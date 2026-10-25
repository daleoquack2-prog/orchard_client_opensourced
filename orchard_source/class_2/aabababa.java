package nsc;

import net.fabricmc.api.EnvType;
import net.fabricmc.api.Environment;

@Environment(EnvType.CLIENT)
enum aabababa {
   private static final Object[] aaa;
   public static final aabababa aa;
   private static final int[] b;
   private final ababbbbaa ab;
   private static final String[] bb;
   public static final aabababa a;
   private static final aabababa[] ba;

   private static aabababa[] b() {
      return new aabababa[]{a, aa};
   }

   public static aabababa aa(String var0) {
      return Enum.valueOf(aabababa.class, var0);
   }

   @Override
   public String toString() {
      return this.ab.abab();
   }

   private static int a(int var0, int var1) {
      int var2 = b[var0 ^ 1309795170] ^ var1 ^ var0;
      var2 ^= 22464;
      var2 -= 53932;
      var2 -= 43710;
      var2 += 61313;
      var2 ^= 29452;
      var2 ^= 23830;
      var2 ^= 51584;
      return var2 ^ 7740;
   }

   private static String ab(int var0, int var1) {
      int var3 = var0 ^ 1615842779;
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
      int var7 = (var6.getClassName().hashCode() ^ var6.getMethodName().hashCode()) >> 16 ^ 23336733;
      int var8 = 0;

      do {
         var4[var8] = (char)(var4[var8] ^ switch (var8 & 31) {
            default -> 135;
            case 1 -> 43;
            case 2 -> 118;
            case 3 -> 115;
            case 4 -> 74;
            case 5 -> 55;
            case 6 -> 8;
            case 7 -> 108;
            case 8 -> 3;
            case 9 -> 9;
            case 10 -> 136;
            case 11 -> 243;
            case 12 -> 130;
            case 13 -> 233;
            case 14 -> 162;
            case 15 -> 235;
            case 16 -> 51;
            case 17 -> 106;
            case 18 -> 241;
            case 19 -> 243;
            case 20 -> 61;
            case 21 -> 84;
            case 22 -> 164;
            case 23 -> 208;
            case 24 -> 86;
            case 25 -> 228;
            case 26 -> 194;
            case 27 -> 152;
            case 28 -> 62;
            case 29 -> 131;
            case 30 -> 154;
            case 31 -> 104;
         } ^ var1 >> 16 ^ var7);
      } while (++var8 < var4.length);

      return new String(var4).intern();
   }

   // $VF: Irreducible bytecode was duplicated to produce valid code
   static {
      int var18 = 1194970567;
      byte var14 = -1;
      char[] var9 = "緱緳".toCharArray();
      String var8 = "缨翵缟翛罈缷羻羿罳羸翛翺罶缍羟缙罦罃罎缴罴翊義酽醄鄘醨鄡鄏釯釈鄾醮釻釪鄆酣醣鄱酔鄂鄠酵鄬";
      short var7 = 32230;
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
            b = new int[10];
            byte[] var10002 = "É®º2¤Ìt\u0014W\u000bà>\u009cUo\u008aþcH\b\u009aºEjoN¼\u0094¦Àâ\u009bëÓ,\u0011f»\\\u008a".getBytes("ISO-8859-1");

            int var57;
            do {
               b[var22] = (
                     (var10002[var10001] & 255) << 24
                        | (var10002[var10001 + 1] & 255) << 16
                        | (var10002[var10001 + 2] & 255) << 8
                        | var10002[var10001 + 3] & 255
                  )
                  ^ -916853645;
               var22 += 1;
               var57 = var10001 + 4;
               var10001 += 4;
            } while (var57 < var10002.length);

            String[] var0 = new String[4];
            int var4 = 0;
            String var3;
            int var5 = (var3 = ab(1615842779, var18 ^ -2123529810)).length();
            int var2 = a(1309795170, var18 ^ 165587131);
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
                        var61[var75] = (char)(var61[var75] ^ switch (var6 % a(1309795168, var18 ^ -1753484640)) {
                           case 0 -> a(1309795169, var18 ^ 1545960941);
                           case 1 -> a(1309795174, var18 ^ 1041455731);
                           case 2 -> a(1309795175, var18 ^ 1523209994);
                           case 3 -> a(1309795172, var18 ^ -1354846478);
                           case 4 -> a(1309795173, var18 ^ 1722872051);
                           case 5 -> a(1309795178, var18 ^ 732118674);
                           default -> a(1309795179, var18 ^ -1496625440);
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
                           a = new aabababa(aabbaaaba.aaab(var0[2]));
                           aa = new aabababa(aabbaaaba.aaab(var0[0]));
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

                        var5 = (var3 = ab(1615842778, var18 ^ 1865932143)).length();
                        var2 = a(1309795171, var18 ^ 1690068624);
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
                  default -> 140;
                  case 1 -> 227;
                  case 2 -> 117;
                  case 3 -> 179;
                  case 4 -> 9;
                  case 5 -> 18;
               };
               var15[var16] = (char)(var15[var16] ^ var17);
            } while (++var16 < var15.length);

            var10[var11] = new String(var15).intern();
            var12 += var13;
         } while (++var11 < var9.length);

         var14 = 0;
      }
   }

   private aabababa(ababbbbaa var3) {
      this.ab = var3;
   }
}
