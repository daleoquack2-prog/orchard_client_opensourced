package nsc;

import net.fabricmc.api.EnvType;
import net.fabricmc.api.Environment;

@Environment(EnvType.CLIENT)
public enum babbbab {
   private static final Object[] bb;
   private static final int[] ab;
   private static final babbbab[] b;
   public static final babbbab a;
   private static final String[] ba;
   public static final babbbab aa;

   // $VF: Irreducible bytecode was duplicated to produce valid code
   static {
      int var17 = 638378436;
      int var10 = 0;
      String[] var9 = new String[1];
      short var12 = 2013;
      int var8 = "\fㄊ퍘ㅶ錜ゼ錑ㄼ폵㏝鍏\u31ea匹".length();
      int var11 = 0;
      String var7 = "\fㄊ퍘ㅶ錜ゼ錑ㄼ폵㏝鍏\u31ea匹";

      do {
         char var10000 = var7.charAt(var11);
         int var15 = 0;
         char var13 = var10000;
         char[] var14 = var7.substring(var11 + 1, var11 + 1 + var13).toCharArray();

         do {
            int var16 = var14[var15];

            var16 = (char)(switch (var15 % 7) {
               default -> 223;
               case 1 -> 124;
               case 2 -> 91;
               case 3 -> 11;
               case 4 -> 17;
               case 5 -> 59;
               case 6 -> 153;
            }) ^ var16;
            if (var15 % 2 == 0) {
               var14[var15] = (char)((var16 >>> 2 | var16 << 14) & 65535 ^ var12);
            } else {
               var14[var15] = (char)((var16 << 2 | var16 >>> 14) & 65535 ^ var12);
            }
         } while (++var15 < var14.length);

         var9[var10] = new String(var14);
         var10++;
         var11 = var11 + var13 + 1;
      } while (var11 < var8);

      ba = var9;
      bb = new Object[var9.length];
      byte var21 = 0;
      int var10001 = 0;
      ab = new int[8];
      byte[] var10002 = "HÜ\u0082¸ÓZ\u008dttT»\b\u0094¯÷øn½öÅ\u0098\u0099,\u00183rô\u00adÎ\u0001\u001dð".getBytes("ISO-8859-1");

      int var51;
      do {
         ab[var21] = (
               (var10002[var10001] & 255) << 24 | (var10002[var10001 + 1] & 255) << 16 | (var10002[var10001 + 2] & 255) << 8 | var10002[var10001 + 3] & 255
            )
            ^ 2111093030;
         var21 += 1;
         var51 = var10001 + 4;
         var10001 += 4;
      } while (var51 < var10002.length);

      String[] var0 = new String[2];
      int var4 = 0;
      String var3;
      int var5 = (var3 = aa(-1285354043, var17 ^ -575747897)).length();
      char var2 = 5;
      int var1 = -1;

      while (true) {
         label89: {
            char[] var24 = var3.substring(++var1, var1 + var2).toCharArray();
            var51 = var24.length;
            int var6 = 0;
            var39 = var24;
            var10001 = var51;
            char[] var55;
            int var69;
            if (var51 <= 1) {
               var55 = var24;
               var69 = var6;
            } else {
               var39 = var24;
               var10001 = var51;
               if (var51 <= var6) {
                  break label89;
               }

               var55 = var24;
               var69 = var6;
            }

            while (true) {
               var55[var69] = (char)(var55[var69] ^ switch (var6 % a(-552378795, var17 ^ 870920442)) {
                  case 0 -> a(-552378796, var17 ^ -1469104220);
                  case 1 -> a(-552378793, var17 ^ 258017551);
                  case 2 -> a(-552378794, var17 ^ -275102234);
                  case 3 -> a(-552378799, var17 ^ 361252078);
                  case 4 -> a(-552378800, var17 ^ -475226610);
                  case 5 -> a(-552378797, var17 ^ 1212630699);
                  default -> a(-552378798, var17 ^ -1254838316);
               });
               var6++;
               if (var10001 == 0) {
                  var69 = var10001;
                  var55 = var39;
               } else {
                  if (var10001 <= var6) {
                     break;
                  }

                  var55 = var39;
                  var69 = var6;
               }
            }
         }

         String var62 = new String(var39).intern();
         byte var31 = -1;
         var0[var4++] = var62;
         if ((var1 += var2) >= var5) {
            aa = new babbbab();
            a = new babbbab();
            b = b();
            return;
         }

         var2 = var3.charAt(var1);
      }
   }

   private static babbbab[] b() {
      return new babbbab[]{aa, a};
   }

   private static String aa(int var0, int var1) {
      int var3 = var0 ^ -1285354043;
      char[] var4 = ba[var3].toCharArray();
      StackTraceElement[] var2 = (StackTraceElement[])bb[var3];
      StackTraceElement[] var5;
      if (var2 != null) {
         var5 = var2;
      } else {
         var5 = new Throwable().getStackTrace();
         bb[var3] = var5;
      }

      StackTraceElement var6 = var5[1];
      int var7 = (var6.getClassName().hashCode() ^ var6.getMethodName().hashCode()) >> 16 ^ -660501127;
      int var8 = 0;

      do {
         var4[var8] = (char)(var4[var8] ^ switch (var8 & 31) {
            default -> 173;
            case 1 -> 89;
            case 2 -> 138;
            case 3 -> 149;
            case 4 -> 132;
            case 5 -> 98;
            case 6 -> 177;
            case 7 -> 120;
            case 8 -> 37;
            case 9 -> 145;
            case 10 -> 217;
            case 11 -> 26;
            case 12 -> 212;
            case 13 -> 183;
            case 14 -> 255;
            case 15 -> 26;
            case 16 -> 203;
            case 17 -> 54;
            case 18 -> 105;
            case 19 -> 20;
            case 20 -> 50;
            case 21 -> 105;
            case 22 -> 192;
            case 23 -> 109;
            case 24 -> 93;
            case 25 -> 190;
            case 26 -> 63;
            case 27 -> 99;
            case 28 -> 102;
            case 29 -> 56;
            case 30 -> 205;
            case 31 -> 166;
         } ^ var1 >> 16 ^ var7);
      } while (++var8 < var4.length);

      return new String(var4).intern();
   }

   private static int a(int var0, int var1) {
      int var2 = ab[var0 ^ -552378795] ^ var1 ^ var0;
      var2 += 32173;
      var2 += 37421;
      var2 ^= 39437;
      var2 += 19583;
      var2 += 22892;
      var2 += 31498;
      var2 ^= 42217;
      return var2 - 56151;
   }
}
