package nsc;

import net.fabricmc.api.EnvType;
import net.fabricmc.api.Environment;

@Environment(EnvType.CLIENT)
enum bbabba {
   private static final int[] a;
   public static final bbabba b;
   private static final String[] bb;
   private static final Object[] aaa;
   public static final bbabba aa;
   public static final bbabba ab;
   private static final bbabba[] ba;

   private static bbabba[] b() {
      return new bbabba[]{ab, b, aa};
   }

   private static String aa(int var0, int var1) {
      int var3 = var0 ^ 1846140466;
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
      int var7 = (var6.getClassName().hashCode() ^ var6.getMethodName().hashCode()) >> 16 ^ -727454937;
      int var8 = 0;

      do {
         var4[var8] = (char)(var4[var8] ^ switch (var8 & 31) {
            default -> 97;
            case 1 -> 178;
            case 2 -> 94;
            case 3 -> 216;
            case 4 -> 204;
            case 5 -> 187;
            case 6 -> 30;
            case 7 -> 46;
            case 8 -> 200;
            case 9 -> 24;
            case 10 -> 104;
            case 11 -> 166;
            case 12 -> 26;
            case 13 -> 211;
            case 14 -> 39;
            case 15 -> 43;
            case 16 -> 211;
            case 17 -> 247;
            case 18 -> 80;
            case 19 -> 135;
            case 20 -> 104;
            case 21 -> 176;
            case 22 -> 222;
            case 23 -> 200;
            case 24 -> 235;
            case 25 -> 246;
            case 26 -> 87;
            case 27 -> 155;
            case 28 -> 163;
            case 29 -> 167;
            case 30 -> 182;
            case 31 -> 208;
         } ^ var1 >> 16 ^ var7);
      } while (++var8 < var4.length);

      return new String(var4).intern();
   }

   // $VF: Irreducible bytecode was duplicated to produce valid code
   static {
      int var17 = 2006250895;
      int var11 = 0;
      short var12 = 20056;
      String[] var9 = new String[1];
      int var10001 = "\u0015\ue50c넙\ue0cb醰\uf519凴\ue582텗\uf20b聾\uecac䄛\ue9eb\u09b3\ueed9ꇰ\uf6e2慓\ue66b䥀\ue9ec".length();
      int var10 = 0;
      int var8 = var10001;
      String var7 = "\u0015\ue50c넙\ue0cb醰\uf519凴\ue582텗\uf20b聾\uecac䄛\ue9eb\u09b3\ueed9ꇰ\uf6e2慓\ue66b䥀\ue9ec";

      do {
         char var13 = var7.charAt(var11);
         char[] var10000 = var7.substring(var11 + 1, var11 + 1 + var13).toCharArray();
         int var15 = 0;
         char[] var14 = var10000;

         do {
            int var16 = var14[var15];

            var16 = (char)(switch (var15 % 5) {
               default -> 11;
               case 1 -> 229;
               case 2 -> 172;
               case 3 -> 76;
               case 4 -> 190;
            }) ^ var16;
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
      byte var21 = 0;
      int var22 = 0;
      a = new int[8];
      byte[] var10002 = "Dê\u008a,\u0017Õú¨\u009eôÈ»\u0007<\u0088\u0002ÏÞaá\u009d.³\u0080¢Bòï«\u008a\u0011®".getBytes("ISO-8859-1");

      int var52;
      do {
         a[var21] = ((var10002[var22] & 255) << 24 | (var10002[var22 + 1] & 255) << 16 | (var10002[var22 + 2] & 255) << 8 | var10002[var22 + 3] & 255)
            ^ 1433461724;
         var21 += 1;
         var52 = var22 + 4;
         var22 += 4;
      } while (var52 < var10002.length);

      String[] var0 = new String[3];
      int var4 = 0;
      String var3;
      int var5 = (var3 = aa(1846140466, var17 ^ 1577254666)).length();
      char var2 = 4;
      int var1 = -1;

      while (true) {
         label85: {
            char[] var25 = var3.substring(++var1, var1 + var2).toCharArray();
            var52 = var25.length;
            int var6 = 0;
            var40 = var25;
            var22 = var52;
            char[] var56;
            int var70;
            if (var52 <= 1) {
               var56 = var25;
               var70 = var6;
            } else {
               var40 = var25;
               var22 = var52;
               if (var52 <= var6) {
                  break label85;
               }

               var56 = var25;
               var70 = var6;
            }

            while (true) {
               var56[var70] = (char)(var56[var70] ^ switch (var6 % a(-96606092, var17 ^ 1674324848)) {
                  case 0 -> a(-96606091, var17 ^ 821257365);
                  case 1 -> a(-96606090, var17 ^ -1177392667);
                  case 2 -> a(-96606089, var17 ^ 538585486);
                  case 3 -> a(-96606096, var17 ^ -386334756);
                  case 4 -> a(-96606095, var17 ^ -1173870817);
                  case 5 -> a(-96606094, var17 ^ -2057022530);
                  default -> a(-96606093, var17 ^ -1934850723);
               });
               var6++;
               if (var22 == 0) {
                  var70 = var22;
                  var56 = var40;
               } else {
                  if (var22 <= var6) {
                     break;
                  }

                  var56 = var40;
                  var70 = var6;
               }
            }
         }

         String var63 = new String(var40).intern();
         byte var32 = -1;
         var0[var4++] = var63;
         if ((var1 += var2) >= var5) {
            ab = new bbabba();
            b = new bbabba();
            aa = new bbabba();
            ba = b();
            return;
         }

         var2 = var3.charAt(var1);
      }
   }

   private static int a(int var0, int var1) {
      int var2 = a[var0 ^ -96606092] ^ var1 ^ var0;
      var2 += 9118;
      var2 -= 16582;
      var2 ^= 1469;
      var2 += 62033;
      var2 ^= 49042;
      var2 -= 55650;
      return var2 + 21436;
   }
}
