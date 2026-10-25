package nsc;

import net.fabricmc.api.EnvType;
import net.fabricmc.api.Environment;

@Environment(EnvType.CLIENT)
public enum aaaabaaab {
   private static final aaaabaaab[] aa;
   public static final aaaabaaab b;
   private static final Object[] aaa;
   private static final String[] bb;
   private static final int[] ba;
   private final ababbbbaa ab;
   public static final aaaabaaab a;

   @Override
   public String toString() {
      return this.ab.abab();
   }

   private static int a(int var0, int var1) {
      int var2 = ba[var0 ^ -132087658] ^ var1 ^ var0;
      var2 -= 13338;
      var2 += 55424;
      var2 -= 25537;
      var2 += 52017;
      var2 += 36190;
      var2 ^= 4410;
      var2 ^= 27711;
      var2 ^= 14071;
      var2 -= 45082;
      return var2 - 47699;
   }

   private static String aa(int var0, int var1) {
      int var3 = var0 ^ -1600349135;
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
      int var7 = (var6.getClassName().hashCode() ^ var6.getMethodName().hashCode()) >> 16 ^ 104333644;
      int var8 = 0;

      do {
         var4[var8] = (char)(var4[var8] ^ switch (var8 & 31) {
            default -> 69;
            case 1 -> 51;
            case 2 -> 72;
            case 3 -> 153;
            case 4 -> 104;
            case 5 -> 225;
            case 6 -> 58;
            case 7 -> 48;
            case 8 -> 165;
            case 9 -> 69;
            case 10 -> 199;
            case 11 -> 24;
            case 12 -> 199;
            case 13 -> 6;
            case 14 -> 86;
            case 15 -> 93;
            case 16 -> 84;
            case 17 -> 225;
            case 18 -> 146;
            case 19 -> 32;
            case 20 -> 179;
            case 21 -> 211;
            case 22 -> 11;
            case 23 -> 18;
            case 24 -> 62;
            case 25 -> 91;
            case 26 -> 100;
            case 27 -> 178;
            case 28 -> 82;
            case 29 -> 205;
            case 30 -> 14;
            case 31 -> 219;
         } ^ var1 >> 16 ^ var7);
      } while (++var8 < var4.length);

      return new String(var4).intern();
   }

   // $VF: Irreducible bytecode was duplicated to produce valid code
   static {
      int var18 = -750624698;
      char[] var9 = "䅹䅹".toCharArray();
      String var8 = "둀됄뒻됊듑뒆둽듞둴뒩뒝된됰듥뒷됝둛됿됽饦餵駫餴駾馋饍馠餥馦首饦饲駪駔饝饌餔餼";
      byte var14 = -1;
      short var7 = 16746;
      String[] var10 = new String[var9.length];

      while (true) {
         int var11 = 0;
         int var12 = 0;
         int var13 = 0;
         if (var14 == 0) {
            bb = var10;
            aaa = new Object[var10.length];
            ba = new int[10];
            byte var22 = 0;
            int var10001 = 0;
            byte[] var10002 = "v²}\"\u0086i3#\u009bÊ°\u000e´cúWO´m \u00adVGÓ¦ÕÖòVA£T85Å½ÇÖ¹o".getBytes("ISO-8859-1");

            int var57;
            do {
               ba[var22] = (
                     (var10002[var10001] & 255) << 24
                        | (var10002[var10001 + 1] & 255) << 16
                        | (var10002[var10001 + 2] & 255) << 8
                        | var10002[var10001 + 3] & 255
                  )
                  ^ 1900373532;
               var22 += 1;
               var57 = var10001 + 4;
               var10001 += 4;
            } while (var57 < var10002.length);

            String[] var0 = new String[4];
            int var4 = 0;
            String var3;
            int var5 = (var3 = aa(-1600349135, var18 ^ 56908990)).length();
            int var2 = a(-132087658, var18 ^ -747998279);
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
                        var61[var75] = (char)(var61[var75] ^ switch (var6 % a(-132087660, var18 ^ 1041415826)) {
                           case 0 -> a(-132087659, var18 ^ 297532287);
                           case 1 -> a(-132087662, var18 ^ -361995273);
                           case 2 -> a(-132087661, var18 ^ 143542563);
                           case 3 -> a(-132087664, var18 ^ 51238916);
                           case 4 -> a(-132087663, var18 ^ -208035222);
                           case 5 -> a(-132087650, var18 ^ -1645360320);
                           default -> a(-132087649, var18 ^ 1645131653);
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
                           a = new aaaabaaab(aabbaaaba.aaab(var0[0]));
                           b = new aaaabaaab(aabbaaaba.aaab(var0[3]));
                           aa = b();
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

                        var5 = (var3 = aa(-1600349136, var18 ^ 776473273)).length();
                        var2 = a(-132087657, var18 ^ 598818211);
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
               short var17 = switch (var16 % 5) {
                  default -> 143;
                  case 1 -> 248;
                  case 2 -> 94;
                  case 3 -> 126;
                  case 4 -> 53;
               };
               var15[var16] = (char)(var15[var16] ^ var17);
            } while (++var16 < var15.length);

            var10[var11] = new String(var15).intern();
            var12 += var13;
         } while (++var11 < var9.length);

         var14 = 0;
      }
   }

   private aaaabaaab(ababbbbaa var3) {
      this.ab = var3;
   }

   private static aaaabaaab[] b() {
      return new aaaabaaab[]{a, b};
   }
}
