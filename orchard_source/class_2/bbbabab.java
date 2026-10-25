package nsc;

import net.fabricmc.api.EnvType;
import net.fabricmc.api.Environment;

@Environment(EnvType.CLIENT)
enum bbbabab {
   public static final bbbabab b;
   public static final bbbabab aa;
   private static final bbbabab[] ab;
   public static final bbbabab a;
   public static final bbbabab ba;
   private static final Object[] aba;
   private static final int[] aaa;
   private static final String[] aab;
   public static final bbbabab bb;

   public static bbbabab b(String var0) {
      return Enum.valueOf(bbbabab.class, var0);
   }

   private static String ab(int var0, int var1) {
      int var3 = var0 ^ 69193052;
      char[] var4 = aab[var3].toCharArray();
      StackTraceElement[] var2 = (StackTraceElement[])aba[var3];
      StackTraceElement[] var5;
      if (var2 != null) {
         var5 = var2;
      } else {
         var5 = new Throwable().getStackTrace();
         aba[var3] = var5;
      }

      StackTraceElement var6 = var5[1];
      int var7 = (var6.getClassName().hashCode() ^ var6.getMethodName().hashCode()) >> 16 ^ -1443262632;
      int var8 = 0;

      do {
         var4[var8] = (char)(var4[var8] ^ switch (var8 & 31) {
            default -> 126;
            case 1 -> 123;
            case 2 -> 48;
            case 3 -> 80;
            case 4 -> 209;
            case 5 -> 253;
            case 6 -> 133;
            case 7 -> 151;
            case 8 -> 33;
            case 9 -> 236;
            case 10 -> 127;
            case 11 -> 75;
            case 12 -> 217;
            case 13 -> 83;
            case 14 -> 12;
            case 15 -> 177;
            case 16 -> 106;
            case 17 -> 230;
            case 18 -> 92;
            case 19 -> 163;
            case 20 -> 131;
            case 21 -> 182;
            case 22 -> 153;
            case 23 -> 207;
            case 24 -> 127;
            case 25 -> 62;
            case 26 -> 233;
            case 27 -> 139;
            case 28 -> 18;
            case 29 -> 71;
            case 30 -> 213;
            case 31 -> 157;
         } ^ var1 >> 16 ^ var7);
      } while (++var8 < var4.length);

      return new String(var4).intern();
   }

   // $VF: Irreducible bytecode was duplicated to produce valid code
   static {
      int var23 = 128755338;
      int var14 = ",徢䖁婙鵨佾\uedb3䂢춇備絮弞ⶵ䎢ﶁ夙൯対\uf5b2壢嶇䢙嵯䎾䖱剢\ue582䦙൬嫾ප䱢얄彙굨庞궴䭂\ued85䵹鵮勞涳嵂ﶁ\u0013毫꿌沰뼥篷꿾甫蟊朰윣样\ue7f8璫翌漐蜢氷\uffff湋".length();
      String[] var15 = new String[2];
      int var16 = 0;
      short var18 = 11188;
      String var13 = ",徢䖁婙鵨佾\uedb3䂢춇備絮弞ⶵ䎢ﶁ夙൯対\uf5b2壢嶇䢙嵯䎾䖱剢\ue582䦙൬嫾ප䱢얄彙굨庞궴䭂\ued85䵹鵮勞涳嵂ﶁ\u0013毫꿌沰뼥篷꿾甫蟊朰윣样\ue7f8璫翌漐蜢氷\uffff湋";
      int var17 = 0;

      do {
         char var19 = var13.charAt(var17);
         char[] var20 = var13.substring(var17 + 1, var17 + 1 + var19).toCharArray();
         int var21 = 0;

         do {
            int var22 = var20[var21];

            var22 = (char)(switch (var21 % 6) {
               default -> 183;
               case 1 -> 215;
               case 2 -> 236;
               case 3 -> 62;
               case 4 -> 139;
               case 5 -> 226;
            }) ^ var22;
            if (var21 % 2 == 0) {
               var20[var21] = (char)((var22 >>> 5 | var22 << 11) & 65535 ^ var18);
            } else {
               var20[var21] = (char)((var22 << 5 | var22 >>> 11) & 65535 ^ var18);
            }
         } while (++var21 < var20.length);

         var15[var16] = new String(var20);
         var16++;
         var17 = var17 + var19 + 1;
      } while (var17 < var14);

      aab = var15;
      aba = new Object[var15.length];
      int var9 = 377156735;
      byte[] var7 = "\u0090T¨Gà\u0095[¸\u0005ÿ\r\u009eð\u008eÚ\u0005úé¡}\u008et\u008ac¸à:\u0083'\u0000Zá\u001cÁ\u0005xqNª\u0010".getBytes("ISO-8859-1");
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

      String[] var0 = new String[5];
      int var4 = 0;
      String var3;
      int var5 = (var3 = ab(69193052, var23 ^ 906748522)).length();
      int var2 = a(197766969, var23 ^ -1974836115);
      int var25 = -1;

      label99:
      while (true) {
         String var28 = var3.substring(++var25, var25 + var2);
         int var10001 = -1;

         while (true) {
            char[] var40;
            label94: {
               char[] var31 = var28.toCharArray();
               int var10003 = var31.length;
               int var6 = 0;
               var40 = var31;
               var10001 = var10003;
               char[] var48;
               int var10004;
               if (var10003 <= 1) {
                  var48 = var31;
                  var10004 = var6;
               } else {
                  var40 = var31;
                  var10001 = var10003;
                  if (var10003 <= var6) {
                     break label94;
                  }

                  var48 = var31;
                  var10004 = var6;
               }

               while (true) {
                  var48[var10004] = (char)(var48[var10004] ^ switch (var6 % a(197766971, var23 ^ 534888863)) {
                     case 0 -> a(197766970, var23 ^ -359655875);
                     case 1 -> a(197766973, var23 ^ -520655579);
                     case 2 -> a(197766972, var23 ^ -1804974592);
                     case 3 -> a(197766975, var23 ^ -1560349036);
                     case 4 -> a(197766974, var23 ^ 1025414855);
                     case 5 -> a(197766961, var23 ^ 115329320);
                     default -> a(197766960, var23 ^ 1800431157);
                  });
                  var6++;
                  if (var10001 == 0) {
                     var10004 = var10001;
                     var48 = var40;
                  } else {
                     if (var10001 <= var6) {
                        break;
                     }

                     var48 = var40;
                     var10004 = var6;
                  }
               }
            }

            String var55 = new String(var40).intern();
            switch (var10001) {
               case 0:
                  var0[var4++] = var55;
                  if ((var25 += var2) >= var5) {
                     aa = new bbbabab();
                     a = new bbbabab();
                     bb = new bbbabab();
                     b = new bbbabab();
                     ba = new bbbabab();
                     ab = aa();
                     return;
                  }

                  var2 = var3.charAt(var25);
                  break;
               default:
                  var0[var4++] = var55;
                  if ((var25 += var2) < var5) {
                     var2 = var3.charAt(var25);
                     continue label99;
                  }

                  var5 = (var3 = ab(69193053, var23 ^ 2142429217)).length();
                  var2 = a(197766968, var23 ^ -91514989);
                  var25 = -1;
            }

            var28 = var3.substring(++var25, var25 + var2);
            var10001 = 0;
         }
      }
   }

   private static bbbabab[] aa() {
      return new bbbabab[]{aa, a, bb, b, ba};
   }

   private static int a(int var0, int var1) {
      int var2 = aaa[var0 ^ 197766969] ^ var1 ^ var0;
      var2 -= 39232;
      var2 -= 65460;
      var2 -= 5705;
      var2 -= 17595;
      var2 ^= 65482;
      var2 += 27402;
      return var2 - 11552;
   }
}
