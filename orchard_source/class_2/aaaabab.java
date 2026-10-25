package nsc;

import net.fabricmc.api.EnvType;
import net.fabricmc.api.Environment;

@Environment(EnvType.CLIENT)
public enum aaaabab {
   private static final aaaabab[] aa;
   public static final aaaabab b;
   private final ababbbbaa ab;
   private static final String[] aaa;
   private static final int[] bb;
   public static final aaaabab a;
   private static final Object[] aab;
   public static final aaaabab ba;

   private static aaaabab[] aa() {
      return new aaaabab[]{ba, a, b};
   }

   // $VF: Irreducible bytecode was duplicated to produce valid code
   static {
      int var24 = -748531550;
      String var14 = "㗝㕫㖥㕼㗰㗚㕪㛕㙒㛝㕥㖢㛜㔖㔬㘺㚈㛤㖫㛺㔉㗒㔶㖽㛤㗒㖦㔤㙘㔢㘐㗞㛢㙫㛀㗍㕇㯟㲶㳩㬍㳉㯟㲣㯸㬆";
      char[] var15 = "⌥⌉".toCharArray();
      short var13 = 8960;
      byte var20 = -1;
      String[] var16 = new String[var15.length];

      while (true) {
         int var17 = 0;
         int var18 = 0;
         int var19 = 0;
         if (var20 == 0) {
            aaa = var16;
            aab = new Object[var16.length];
            int var9 = 154943205;
            byte[] var7 = "#I\u008a$RêEÖ9Î/1zO<\u0090ÉõãiÆ+G·\u0016w G\u001aáñ¸\tg\u007fÕ\u0090\u0016ú\u0083".getBytes("ISO-8859-1");
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

            String[] var0 = new String[a(-860915154, var24 ^ 901280612)];
            int var4 = 0;
            String var3;
            int var5 = (var3 = ba(var24 ^ 379520401, 39698, 'ⴔ')).length();
            int var2 = a(-860915153, var24 ^ 1142668433);
            int var26 = -1;

            label100:
            while (true) {
               String var29 = var3.substring(++var26, var26 + var2);
               int var10001 = -1;

               while (true) {
                  char[] var41;
                  label95: {
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
                           break label95;
                        }

                        var49 = var32;
                        var10004 = var6;
                     }

                     while (true) {
                        var49[var10004] = (char)(var49[var10004] ^ switch (var6 % a(-860915156, var24 ^ 792712816)) {
                           case 0 -> a(-860915155, var24 ^ 1824441354);
                           case 1 -> a(-860915158, var24 ^ -553379265);
                           case 2 -> a(-860915157, var24 ^ -790970640);
                           case 3 -> a(-860915160, var24 ^ 8837414);
                           case 4 -> a(-860915159, var24 ^ 202377456);
                           case 5 -> a(-860915162, var24 ^ 529958765);
                           default -> a(-860915161, var24 ^ -2031680965);
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
                           ba = new aaaabab(aabbaaaba.aaab(var0[2]));
                           a = new aaaabab(aabbaaaba.aaab(var0[3]));
                           b = new aaaabab(aabbaaaba.aaab(var0[0]));
                           aa = aa();
                           return;
                        }

                        var2 = var3.charAt(var26);
                        break;
                     default:
                        var0[var4++] = var56;
                        if ((var26 += var2) < var5) {
                           var2 = var3.charAt(var26);
                           continue label100;
                        }

                        var5 = (var3 = ba(var24 ^ 54795803, 33006, 'ⴕ')).length();
                        var2 = 4;
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
                  default -> 55;
                  case 1 -> 153;
                  case 2 -> 199;
                  case 3 -> 65;
                  case 4 -> 203;
               };
               var21[var22] = (char)(var21[var22] ^ var23);
            } while (++var22 < var21.length);

            var16[var17] = new String(var21).intern();
            var18 += var19;
         } while (++var17 < var15.length);

         var20 = 0;
      }
   }

   public static aaaabab b(String var0) {
      return Enum.valueOf(aaaabab.class, var0);
   }

   private aaaabab(ababbbbaa var3) {
      this.ab = var3;
   }

   private static String ba(int var0, int var1, char var2) {
      int var3 = var2 ^ 11540;
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
      int var8 = (var7.getClassName().hashCode() ^ var7.getMethodName().hashCode()) >> 16 ^ 4429;
      int var9 = 0;

      do {
         int var10 = var4[var9] - '\ueba7';
         var10 -= 5811;
         var10 -= 11873;
         var10 ^= 24965;
         var10 += 5025;
         var10 += 36159;
         var10 += 36948;
         var10 -= 45529;
         var10 ^= 23395;
         var4[var9] = (char)(var10 ^ var8 ^ var1 ^ var0 >> 16);
      } while (++var9 < var4.length);

      return new String(var4).intern();
   }

   public ababbbbaa ab() {
      return this.ab;
   }

   @Override
   public String toString() {
      return this.ab.abab();
   }

   private static int a(int var0, int var1) {
      int var2 = bb[var0 ^ -860915154] ^ var1 ^ var0;
      var2 += 17973;
      var2 ^= 47355;
      var2 -= 16386;
      var2 -= 54548;
      var2 -= 10100;
      var2 ^= 21888;
      var2 ^= 3448;
      var2 ^= 244;
      return var2 ^ 5905;
   }
}
