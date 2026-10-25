package nsc;

import net.fabricmc.api.EnvType;
import net.fabricmc.api.Environment;

@Environment(EnvType.CLIENT)
enum aabbbbbb {
   public static final aabbbbbb aa;
   private static final Object[] aba;
   public static final aabbbbbb ab;
   private final ababbbbaa ba;
   private static final String[] aab;
   private static final aabbbbbb[] a;
   public static final aabbbbbb b;
   private static final int[] aaa;
   public static final aabbbbbb bb;

   private static int a(int var0, int var1) {
      int var2 = aaa[var0 ^ 499986263] ^ var1 ^ var0;
      var2 ^= 5899;
      var2 += 43159;
      var2 -= 41427;
      var2 -= 45527;
      var2 += 51022;
      return var2 + 5907;
   }

   private aabbbbbb(ababbbbaa var3) {
      this.ba = var3;
   }

   // $VF: Irreducible bytecode was duplicated to produce valid code
   static {
      int var24 = -1395799544;
      char[] var15 = "8\b".toCharArray();
      String var14 = "䎙䍈䏑䌦䎻䎼䌠䎒䍓䏡䏊䌟䎓䍶䎷䏮䍍䎰䍱䎧䏑䍭䎚䍆䏓䎠䍿䎹䍕䎓䎋䌂䎋䍫䎙䏏䌹䎞䌼䎏䏬䍒䎹䍺䏤䎘䍓䎰䍢䎪䎍䍯䎠䍔䎆䎬괖귅굔귣괏괋귈굇";
      short var13 = 21015;
      byte var20 = -1;
      String[] var16 = new String[var15.length];

      while (true) {
         int var17 = 0;
         char var18 = 0;
         char var19 = '\u0000';
         if (var20 == 0) {
            aab = var16;
            aba = new Object[var16.length];
            int var9 = 901998563;
            byte[] var7 = "9ô\u0010\u0096\u0000¯ê®zí\u0000×\u0018oÍË¢\u0097lý`xÍS\u0095¹\u0002J\u0086\u0095f\u0083vÇ*\u0007\f\u0001Å\u0018c\u000e*$äÍ\u0003´"
               .getBytes("ISO-8859-1");
            int var8 = var7.length / 4;
            aaa = new int[var8];
            byte var10 = 0;
            int var11 = 0;

            do {
               int var12 = (var7[var10] & 255) << 24 | (var7[var10 + 1] & 255) << 16 | (var7[var10 + 2] & 255) << 8 | var7[var10 + 3] & 255;
               var12 ^= var9;
               aaa[var11] = var12;
               var10 += 4;
            } while (++var11 < var8);

            String[] var0 = new String[a(499986263, var24 ^ 1120422299)];
            int var4 = 0;
            String var3;
            int var5 = (var3 = ab(700017763, (short)-789, -849744784, '妎', 28930)).length();
            int var2 = a(499986262, var24 ^ 2073277350);
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
                        var49[var10004] = (char)(var49[var10004] ^ switch (var6 % a(499986261, var24 ^ 30497243)) {
                           case 0 -> a(499986260, var24 ^ 1666422135);
                           case 1 -> a(499986259, var24 ^ -643091391);
                           case 2 -> a(499986258, var24 ^ 457479222);
                           case 3 -> a(499986257, var24 ^ -293250306);
                           case 4 -> a(499986256, var24 ^ -39240134);
                           case 5 -> a(499986271, var24 ^ 234582682);
                           default -> a(499986270, var24 ^ 2000526458);
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
                           b = new aabbbbbb(aabbaaaba.aaab(var0[3]));
                           bb = new aabbbbbb(aabbaaaba.aaab(var0[1]));
                           aa = new aabbbbbb(aabbaaaba.aaab(var0[5]));
                           ab = new aabbbbbb(aabbaaaba.aaab(var0[0]));
                           a = aa();
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

                        var5 = (var3 = ab(700017762, (short)9499, -642162613, 6364, (short)-29896)).length();
                        var2 = 4;
                        var26 = -1;
                  }

                  var29 = var3.substring(++var26, var26 + var2);
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
                  default -> 143;
                  case 1 -> 95;
                  case 2 -> 182;
                  case 3 -> 100;
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

   public static aabbbbbb b(String var0) {
      return Enum.valueOf(aabbbbbb.class, var0);
   }

   @Override
   public String toString() {
      return this.ba.abab();
   }

   private static String ab(int var0, short var1, int var2, char var3, short var4) {
      int var9 = var0 ^ 700017763;
      char[] var8 = aab[var9].toCharArray();
      StackTraceElement[] var10 = (StackTraceElement[])aba[var9];
      StackTraceElement[] var11;
      if (var10 != null) {
         var11 = var10;
      } else {
         var11 = new Throwable().getStackTrace();
         aba[var9] = var11;
      }

      StackTraceElement var12 = var11[1];
      int var6 = (var12.getClassName().hashCode() ^ var12.getMethodName().hashCode()) >> 16 ^ 57501;
      int var7 = 0;

      do {
         var8[var7] = (char)(var8[var7] ^ 3037 ^ var7 ^ var2 ^ var0 ^ var3 ^ var4 ^ var6 ^ var1);
      } while (++var7 < var8.length);

      return new String(var8).intern();
   }

   private static aabbbbbb[] aa() {
      return new aabbbbbb[]{b, bb, aa, ab};
   }
}
