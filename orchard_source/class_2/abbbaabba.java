package nsc;

import net.fabricmc.api.EnvType;
import net.fabricmc.api.Environment;

@Environment(EnvType.CLIENT)
public enum abbbaabba {
   private static final Object[] aaa;
   public static final abbbaabba aa;
   private static final String[] bb;
   public static final abbbaabba ab;
   private static final abbbaabba[] ba;
   private static final int[] a;
   private final ababbbbaa b;

   private static abbbaabba[] b() {
      return new abbbaabba[]{ab, aa};
   }

   private static String aa(short var0, int var1, char var2) {
      int var3 = var2 ^ 'ꑸ';
      char[] var4 = bb[var3].toCharArray();
      StackTraceElement[] var5 = (StackTraceElement[])aaa[var3];
      StackTraceElement[] var6;
      if (var5 != null) {
         var6 = var5;
      } else {
         var6 = new Throwable().getStackTrace();
         aaa[var3] = var6;
      }

      StackTraceElement var7 = var6[1];
      int var8 = (var7.getClassName().hashCode() ^ var7.getMethodName().hashCode()) >> 16 ^ 25768;
      int var9 = 0;

      do {
         int var10 = var4[var9] - '荘';
         var10 -= 36886;
         var10 ^= 42455;
         var10 -= 1256;
         var10 -= 61920;
         var4[var9] = (char)(var10 ^ var8 ^ var0 ^ var1 >> 16);
      } while (++var9 < var4.length);

      return new String(var4).intern();
   }

   // $VF: Irreducible bytecode was duplicated to produce valid code
   static {
      int var17 = -1838536039;
      short var12 = 18984;
      int var11 = 0;
      int var10 = 0;
      String[] var9 = new String[2];
      int var8 = "\u0019Ξ\uf803Ȗ\uf80cɎ砖ξ렃\u05fe\ud80bþ㠗ņ砑Ö㠖Φ砅ц\ud80eȖ砍Ԟ㠔\u05ce\r偕땇굌핆꽌늾꺌\uf545儽犸껴商꿬".length();
      String var7 = "\u0019Ξ\uf803Ȗ\uf80cɎ砖ξ렃\u05fe\ud80bþ㠗ņ砑Ö㠖Φ砅ц\ud80eȖ砍Ԟ㠔\u05ce\r偕땇굌핆꽌늾꺌\uf545儽犸껴商꿬";

      do {
         char var13 = var7.charAt(var11);
         int var10001 = var11 + 1;
         int var10002 = var11 + 1;
         int var15 = 0;
         char[] var14 = var7.substring(var10001, var10002 + var13).toCharArray();

         do {
            char var16 = var14[var15];
            if (var15 % 2 == 0) {
               var14[var15] = (char)((var16 >>> 3 | var16 << '\r') & 65535 ^ var12);
            } else {
               var14[var15] = (char)((var16 << 3 | var16 >>> '\r') & 65535 ^ var12);
            }
         } while (++var15 < var14.length);

         var9[var10] = new String(var14);
         var10++;
         var11 = var11 + var13 + 1;
      } while (var11 < var8);

      bb = var9;
      aaa = new Object[var9.length];
      byte var10000 = 0;
      int var22 = 0;
      byte[] var34 = "\u008eÀ\u0014Q)O\u000fº[_\u0093\u0006\u0018ÀU°?¹0£@W¦d{\u0088åþ\u009f¡f\u009c(\u0085?\u0092I<r~".getBytes("ISO-8859-1");
      a = new int[10];

      int var56;
      do {
         a[var10000] = ((var34[var22] & 255) << 24 | (var34[var22 + 1] & 255) << 16 | (var34[var22 + 2] & 255) << 8 | var34[var22 + 3] & 255) ^ -1817172867;
         var10000 += 1;
         var56 = var22 + 4;
         var22 += 4;
      } while (var56 < var34.length);

      String[] var0 = new String[4];
      int var4 = 0;
      String var3;
      int var5 = (var3 = aa((short)32570, var17 ^ 1373534869, 'ꑸ')).length();
      int var2 = a(1718133959, var17 ^ -378386430);
      int var19 = -1;

      label92:
      while (true) {
         String var20 = var3.substring(++var19, var19 + var2);
         var22 = (byte)-1;

         while (true) {
            label87: {
               char[] var27 = var20.toCharArray();
               var56 = var27.length;
               int var6 = 0;
               var43 = var27;
               var22 = var56;
               char[] var60;
               int var74;
               if (var56 <= 1) {
                  var60 = var27;
                  var74 = var6;
               } else {
                  var43 = var27;
                  var22 = var56;
                  if (var56 <= var6) {
                     break label87;
                  }

                  var60 = var27;
                  var74 = var6;
               }

               while (true) {
                  var60[var74] = (char)(var60[var74] ^ switch (var6 % a(1718133957, var17 ^ 1022218064)) {
                     case 0 -> a(1718133956, var17 ^ 2138179890);
                     case 1 -> a(1718133955, var17 ^ 1477143631);
                     case 2 -> a(1718133954, var17 ^ 669383384);
                     case 3 -> a(1718133953, var17 ^ 473610607);
                     case 4 -> a(1718133952, var17 ^ -132957596);
                     case 5 -> a(1718133967, var17 ^ 1329029951);
                     default -> a(1718133966, var17 ^ 781069879);
                  });
                  var6++;
                  if (var22 == 0) {
                     var74 = var22;
                     var60 = var43;
                  } else {
                     if (var22 <= var6) {
                        break;
                     }

                     var60 = var43;
                     var74 = var6;
                  }
               }
            }

            String var67 = new String(var43).intern();
            switch (var22) {
               case 0:
                  var0[var4++] = var67;
                  if ((var19 += var2) >= var5) {
                     ab = new abbbaabba(aabbaaaba.aaab(var0[1]));
                     aa = new abbbaabba(aabbaaaba.aaab(var0[0]));
                     ba = b();
                     return;
                  }

                  var2 = var3.charAt(var19);
                  break;
               default:
                  var0[var4++] = var67;
                  if ((var19 += var2) < var5) {
                     var2 = var3.charAt(var19);
                     continue label92;
                  }

                  var5 = (var3 = aa((short)'ꢻ', var17 ^ 683412634, 'ꑹ')).length();
                  var2 = a(1718133958, var17 ^ 1325224942);
                  var19 = -1;
            }

            var20 = var3.substring(++var19, var19 + var2);
            var22 = (byte)0;
         }
      }
   }

   private static int a(int var0, int var1) {
      int var2 = a[var0 ^ 1718133959] ^ var1 ^ var0;
      var2 -= 47011;
      var2 -= 56232;
      var2 += 53541;
      var2 += 47560;
      var2 ^= 6868;
      return var2 ^ 62666;
   }

   private abbbaabba(ababbbbaa var3) {
      this.b = var3;
   }

   @Override
   public String toString() {
      return this.b.abab();
   }
}
