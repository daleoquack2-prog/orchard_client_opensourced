package nsc;

import net.fabricmc.api.EnvType;
import net.fabricmc.api.Environment;

@Environment(EnvType.CLIENT)
public enum aaabaaaab {
   public static final aaabaaaab aa;
   private static final String[] bb;
   private final ababbbbaa ab;
   public static final aaabaaaab a;
   private static final int[] b;
   private static final Object[] aaa;
   private static final aaabaaaab[] ba;

   // $VF: Irreducible bytecode was duplicated to produce valid code
   static {
      int var24 = -587294366;
      char[] var15 = "\u000f\u0011".toCharArray();
      String var14 = "敃旁旽斮敍攧旴斷斨敶攉斁旔施敩䫔䩁䩄䨗䫇䫕䩅䨆䨞䪗䪯䨈䩐䩲䫪䪼䩯";
      short var13 = 30695;
      byte var20 = -1;
      String[] var16 = new String[var15.length];

      while (true) {
         int var17 = 0;
         char var18 = 0;
         char var19 = '\u0000';
         if (var20 == 0) {
            bb = var16;
            aaa = new Object[var16.length];
            int var9 = -747734897;
            byte[] var7 = "¨á\u0007¾,À\u001fÿb²³Uay\u0006Ïøö=\u0012\u0089¶| \u000b\u0085Ä·Y%[p\u0097\u0092\u001aÄc\u0004F\u0084".getBytes("ISO-8859-1");
            int var8 = var7.length / 4;
            b = new int[var8];
            byte var10 = 0;
            int var11 = 0;

            do {
               int var12 = (var7[var10] & 255) << 24 | (var7[var10 + 1] & 255) << 16 | (var7[var10 + 2] & 255) << 8 | var7[var10 + 3] & 255;
               var12 ^= var9;
               b[var11] = var12;
               var10 += 4;
            } while (++var11 < var8);

            String[] var0 = new String[4];
            int var4 = 0;
            String var3;
            int var5 = (var3 = aa(26310, (short)-23431, -1354822134, (short)30151, (char)'轣')).length();
            int var2 = a(-1441547572, var24 ^ -224600963);
            int var26 = -1;

            label99:
            while (true) {
               String var29 = var3.substring(++var26, var26 + var2);
               int var10001 = -1;

               while (true) {
                  char[] var41;
                  label94: {
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
                           break label94;
                        }

                        var49 = var32;
                        var10004 = var6;
                     }

                     while (true) {
                        var49[var10004] = (char)(var49[var10004] ^ switch (var6 % a(-1441547570, var24 ^ 953116821)) {
                           case 0 -> a(-1441547569, var24 ^ 990174549);
                           case 1 -> a(-1441547576, var24 ^ -1567889556);
                           case 2 -> a(-1441547575, var24 ^ -741628282);
                           case 3 -> a(-1441547574, var24 ^ 1375215411);
                           case 4 -> a(-1441547573, var24 ^ 56131835);
                           case 5 -> a(-1441547580, var24 ^ -839925645);
                           default -> a(-1441547579, var24 ^ 964271151);
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
                           aa = new aaabaaaab(aabbaaaba.aaab(var0[1]));
                           a = new aaabaaaab(aabbaaaba.aaab(var0[2]));
                           ba = b();
                           return;
                        }

                        var2 = var3.charAt(var26);
                        break;
                     default:
                        var0[var4++] = var56;
                        if ((var26 += var2) < var5) {
                           var2 = var3.charAt(var26);
                           continue label99;
                        }

                        var5 = (var3 = aa('ꔗ', (short)25246, -1354822133, (short)-23505, 29745)).length();
                        var2 = a(-1441547571, var24 ^ 1992148023);
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
                  default -> 226;
                  case 1 -> 20;
                  case 2 -> 59;
                  case 3 -> 65;
                  case 4 -> 173;
               };
               var21[var22] = (char)(var21[var22] ^ var23 ^ var13);
            } while (++var22 < var21.length);

            var16[var17] = new String(var21).intern();
            var18 += var19;
         } while (++var17 < var15.length);

         var20 = 0;
      }
   }

   private aaabaaaab(ababbbbaa var3) {
      this.ab = var3;
   }

   private static String aa(char var0, short var1, int var2, short var3, char var4) {
      int var9 = var2 ^ -1354822134;
      char[] var8 = bb[var9].toCharArray();
      StackTraceElement[] var10 = (StackTraceElement[])aaa[var9];
      StackTraceElement[] var11;
      if (var10 != null) {
         var11 = var10;
      } else {
         var11 = new Throwable().getStackTrace();
         aaa[var9] = var11;
      }

      StackTraceElement var12 = var11[1];
      int var6 = (var12.getClassName().hashCode() ^ var12.getMethodName().hashCode()) >> 16 ^ 17271;

      for (int var7 = 0; var7 < var8.length; var7++) {
         var8[var7] = (char)(var8[var7] ^ var7 ^ var4 ^ var3 ^ var1 ^ var6 ^ var2 ^ var0);
      }

      return new String(var8).intern();
   }

   @Override
   public String toString() {
      return this.ab.abab();
   }

   private static aaabaaaab[] b() {
      return new aaabaaaab[]{aa, a};
   }

   private static int a(int var0, int var1) {
      int var2 = b[var0 ^ -1441547572] ^ var1 ^ var0;
      var2 += 40968;
      var2 ^= 10235;
      var2 -= 8323;
      var2 += 36134;
      var2 ^= 58271;
      return var2 + 28635;
   }
}
