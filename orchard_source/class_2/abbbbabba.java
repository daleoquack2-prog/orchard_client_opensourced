package nsc;

import net.fabricmc.api.EnvType;
import net.fabricmc.api.Environment;

@Environment(EnvType.CLIENT)
public enum abbbbabba {
   private static final Object[] aab;
   private final ababbbbaa aa;
   public static final abbbbabba a;
   public static final abbbbabba ab;
   private static final String[] aaa;
   private static final int[] bb;
   private static final abbbbabba[] ba;
   public static final abbbbabba b;

   private static String aa(int var0, char var1, int var2) {
      int var3 = var1 ^ 22204;
      char[] var4 = aaa[var3].toCharArray();
      StackTraceElement[] var5 = (StackTraceElement[])aab[var3];
      StackTraceElement[] var6;
      if (var5 != null) {
         var6 = var5;
      } else {
         var6 = new Throwable().getStackTrace();
         aab[var3] = var6;
      }

      StackTraceElement var7 = var6[1];
      int var8 = (var7.getClassName().hashCode() ^ var7.getMethodName().hashCode()) >> 16 ^ 25071;
      int var9 = 0;

      do {
         int var10 = var4[var9] - '鉀';
         var10 += 65065;
         var10 ^= 46104;
         var10 -= 26320;
         var10 += 55091;
         var4[var9] = (char)(var10 ^ var8 ^ var0 ^ var2 >> 16);
      } while (++var9 < var4.length);

      return new String(var4).intern();
   }

   private static abbbbabba[] b() {
      return new abbbbabba[]{b, ab, a};
   }

   private abbbbabba(ababbbbaa var3) {
      this.aa = var3;
   }

   // $VF: Irreducible bytecode was duplicated to produce valid code
   static {
      int var24 = 283470146;
      String var14 = "᷊ᶉᶸᴉᵔᵩᴜᵕᶣᴭᵤᵸ᷑ᶅᶓᴽᶽᴂ᷋ᵆᶣᴆᵦᶦᴡᶠᶉ᷍ᵒᵓᴓᵀᶆ᷺ᶴᶚ᷶ᵋᶿᴽᙪᘁ\u169eឲᛩᚃឫᘇᜈᙊᛀᛛᙌᘲᛇᘁ\u16ff";
      short var13 = 13991;
      char[] var10000 = "㚏㚶".toCharArray();
      byte var20 = -1;
      char[] var15 = var10000;
      String[] var16 = new String[var15.length];

      while (true) {
         int var17 = 0;
         int var18 = 0;
         int var19 = 0;
         if (var20 == 0) {
            aaa = var16;
            aab = new Object[var16.length];
            int var9 = -1331985722;
            byte[] var7 = "\u0014¾à4\t©ü¤Ê¼\u0018\u009a\u009e&ç\u0085__¿ý\u00821ÜIFc±\nÝ\u00868è\u008aÙfñÏ\u0007ûO".getBytes("ISO-8859-1");
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

            String[] var0 = new String[a(-739716942, var24 ^ -1730796244)];
            int var4 = 0;
            String var3;
            int var5 = (var3 = aa(25817, '嚼', var24 ^ -1138280987)).length();
            int var2 = a(-739716941, var24 ^ -2050934181);
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
                        var50[var10004] = (char)(var50[var10004] ^ switch (var6 % a(-739716943, var24 ^ 307110557)) {
                           case 0 -> a(-739716938, var24 ^ -751339233);
                           case 1 -> a(-739716937, var24 ^ 240720255);
                           case 2 -> a(-739716940, var24 ^ -905218068);
                           case 3 -> a(-739716939, var24 ^ 1374617108);
                           case 4 -> 5;
                           case 5 -> a(-739716934, var24 ^ 112304132);
                           default -> a(-739716933, var24 ^ 1131363956);
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
                           b = new abbbbabba(aabbaaaba.aaab(var0[4]));
                           ab = new abbbbabba(aabbaaaba.aaab(var0[0]));
                           a = new abbbbabba(aabbaaaba.aaab(var0[1]));
                           ba = b();
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

                        var5 = (var3 = aa(7678, '嚽', var24 ^ -809078497)).length();
                        var2 = a(-739716944, var24 ^ 1188355658);
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
               short var23 = switch (var22 % 6) {
                  default -> 136;
                  case 1 -> 217;
                  case 2 -> 39;
                  case 3 -> 157;
                  case 4 -> 25;
                  case 5 -> 57;
               };
               var21[var22] = (char)(var21[var22] ^ var23);
            } while (++var22 < var21.length);

            var16[var17] = new String(var21).intern();
            var18 += var19;
         } while (++var17 < var15.length);

         var20 = 0;
      }
   }

   private static int a(int var0, int var1) {
      int var2 = bb[var0 ^ -739716942] ^ var1 ^ var0;
      var2 -= 27528;
      var2 ^= 17624;
      var2 += 46152;
      var2 += 41405;
      var2 -= 56642;
      var2 ^= 62430;
      var2 ^= 5077;
      var2 += 38438;
      return var2 - 17770;
   }

   @Override
   public String toString() {
      return this.aa.abab();
   }
}
