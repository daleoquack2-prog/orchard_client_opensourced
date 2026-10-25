package nsc;

import net.fabricmc.api.EnvType;
import net.fabricmc.api.Environment;

@Environment(EnvType.CLIENT)
enum aabbbabba {
   private static final int[] b;
   private final ababbbbaa aa;
   public static final aabbbabba a;
   private static final Object[] aaa;
   public static final aabbbabba ab;
   private static final String[] bb;
   private static final aabbbabba[] ba;

   private aabbbabba(ababbbbaa var3) {
      this.aa = var3;
   }

   @Override
   public String toString() {
      return this.aa.abab();
   }

   private static String aa(int var0, int var1) {
      int var3 = var0 ^ -27766108;
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
      int var7 = (var6.getClassName().hashCode() ^ var6.getMethodName().hashCode()) >> 16 ^ 1189322446;
      int var8 = 0;

      do {
         var4[var8] = (char)(var4[var8] ^ switch (var8 & 31) {
            default -> 249;
            case 1 -> 247;
            case 2 -> 162;
            case 3 -> 126;
            case 4 -> 152;
            case 5 -> 91;
            case 6 -> 85;
            case 7 -> 4;
            case 8 -> 84;
            case 9 -> 172;
            case 10 -> 131;
            case 11 -> 197;
            case 12 -> 92;
            case 13 -> 32;
            case 14 -> 37;
            case 15 -> 204;
            case 16 -> 103;
            case 17 -> 134;
            case 18 -> 61;
            case 19 -> 38;
            case 20 -> 198;
            case 21 -> 36;
            case 22 -> 78;
            case 23 -> 85;
            case 24 -> 172;
            case 25 -> 167;
            case 26 -> 199;
            case 27 -> 235;
            case 28 -> 98;
            case 29 -> 107;
            case 30 -> 84;
            case 31 -> 208;
         } ^ var1 >> 16 ^ var7);
      } while (++var8 < var4.length);

      return new String(var4).intern();
   }

   private static int a(int var0, int var1) {
      int var2 = b[var0 ^ -882526476] ^ var1 ^ var0;
      var2 += 20492;
      var2 += 64684;
      var2 += 43822;
      var2 ^= 17323;
      var2 ^= 670;
      var2 ^= 32485;
      var2 += 40941;
      var2 += 58826;
      var2 -= 11708;
      return var2 + 22258;
   }

   // $VF: Irreducible bytecode was duplicated to produce valid code
   static {
      int var18 = 219768094;
      byte var14 = -1;
      short var7 = 23169;
      char[] var9 = "媒媕".toCharArray();
      String var8 = "矪矦眍矠矮矁眤睴矛睕石眶眦眷矰眛眦眩睳\udf35\udf29\udfce\udf3a\udf20\udf01\udfa2\udfe6\udf6f\udf81\udf73\udfc8\udfb2\udfc2\udf2e\udfaa\udfd0\udffe\udfcd\udff1";
      String[] var10 = new String[var9.length];

      while (true) {
         int var11 = 0;
         int var12 = 0;
         int var13 = 0;
         if (var14 == 0) {
            bb = var10;
            aaa = new Object[var10.length];
            byte var22 = 0;
            b = new int[8];
            int var10001 = 0;
            byte[] var10002 = "q\u0018\bþQ¶D\u0018j¬\u009b+\u0086ÏiR<Â3K+m«õ4\u0019\u0001\t:¤¯a".getBytes("ISO-8859-1");

            int var57;
            do {
               b[var22] = (
                     (var10002[var10001] & 255) << 24
                        | (var10002[var10001 + 1] & 255) << 16
                        | (var10002[var10001 + 2] & 255) << 8
                        | var10002[var10001 + 3] & 255
                  )
                  ^ -1785956022;
               var22 += 1;
               var57 = var10001 + 4;
               var10001 += 4;
            } while (var57 < var10002.length);

            String[] var0 = new String[4];
            int var4 = 0;
            String var3;
            int var5 = (var3 = aa(-27766108, var18 ^ 1210790091)).length();
            int var2 = a(-882526476, var18 ^ -585837379);
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
                        var61[var75] = (char)(var61[var75] ^ switch (var6 % a(-882526474, var18 ^ -962574483)) {
                           case 0 -> a(-882526473, var18 ^ 717469021);
                           case 1 -> a(-882526480, var18 ^ -1865486551);
                           case 2 -> a(-882526479, var18 ^ -2023655552);
                           case 3 -> 2;
                           case 4 -> 4;
                           case 5 -> a(-882526478, var18 ^ -1743397508);
                           default -> a(-882526477, var18 ^ -1767345450);
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
                           ab = new aabbbabba(aabbaaaba.aaab(var0[3]));
                           a = new aabbbabba(aabbaaaba.aaab(var0[1]));
                           ba = b();
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

                        var5 = (var3 = aa(-27766107, var18 ^ -521058247)).length();
                        var2 = a(-882526475, var18 ^ -38102947);
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
                  default -> 249;
                  case 1 -> 176;
                  case 2 -> 47;
                  case 3 -> 89;
                  case 4 -> 175;
                  case 5 -> 27;
               };
               var15[var16] = (char)(var15[var16] ^ var17);
            } while (++var16 < var15.length);

            var10[var11] = new String(var15).intern();
            var12 += var13;
         } while (++var11 < var9.length);

         var14 = 0;
      }
   }

   private static aabbbabba[] b() {
      return new aabbbabba[]{ab, a};
   }
}
