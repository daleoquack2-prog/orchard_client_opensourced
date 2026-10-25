package nsc;

import net.fabricmc.api.EnvType;
import net.fabricmc.api.Environment;

@Environment(EnvType.CLIENT)
public enum bbbaab {
   public static final bbbaab aa;
   private static final Object[] aaa;
   private static final bbbaab[] ab;
   private static final String[] bb;
   private static final int[] a;
   public static final bbbaab b;
   private final ababbbbaa ba;

   public ababbbbaa aa() {
      return this.ba;
   }

   // $VF: Irreducible bytecode was duplicated to produce valid code
   static {
      int var24 = 1748830073;
      String var14 = "㿚㾜㽂㼭㿅㼚㿞㾺㼶㼕㾡㼘㿜둏된뒡뒠둛뒮둴됊듐뒜된듻둋둘뒫뒽됹뒭둉됄뒋뒕됏둢됵";
      short var13 = 25999;
      byte var20 = -1;
      char[] var15 = "\r\u0019".toCharArray();
      String[] var16 = new String[var15.length];

      while (true) {
         int var17 = 0;
         char var18 = 0;
         char var19 = '\u0000';
         if (var20 == 0) {
            bb = var16;
            aaa = new Object[var16.length];
            int var9 = 718208347;
            byte[] var7 = " åØÜ\u0012\u0019ø¸ÔË8¢î\u0088\n»´Ùõú29nVÊL>·Çë¼X\u0093L\u0013\t\u0006\u001au¨".getBytes("ISO-8859-1");
            int var8 = var7.length / 4;
            a = new int[var8];
            byte var10 = 0;
            int var11 = 0;

            do {
               int var12 = (var7[var10] & 255) << 24 | (var7[var10 + 1] & 255) << 16 | (var7[var10 + 2] & 255) << 8 | var7[var10 + 3] & 255;
               var12 ^= var9;
               a[var11] = var12;
               var10 += 4;
            } while (++var11 < var8);

            String[] var0 = new String[4];
            int var4 = 0;
            String var3;
            int var5 = (var3 = ab('ᰚ', var24 ^ -213695929, '㩳')).length();
            int var2 = b(656561331, var24 ^ -986294067);
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
                        var49[var10004] = (char)(var49[var10004] ^ switch (var6 % b(656561329, var24 ^ -1323779920)) {
                           case 0 -> b(656561328, var24 ^ -1956935034);
                           case 1 -> b(656561335, var24 ^ -787842463);
                           case 2 -> b(656561334, var24 ^ 1475014211);
                           case 3 -> b(656561333, var24 ^ -1348485498);
                           case 4 -> b(656561332, var24 ^ -1573375033);
                           case 5 -> b(656561339, var24 ^ -157314254);
                           default -> b(656561338, var24 ^ 1674179959);
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
                           aa = new bbbaab(aabbaaaba.aaab(var0[2]));
                           b = new bbbaab(aabbaaaba.aaab(var0[3]));
                           ab = a();
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

                        var5 = (var3 = ab('摔', var24 ^ 328210188, '㩲')).length();
                        var2 = b(656561330, var24 ^ 2009757906);
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
               short var23 = switch (var22 % 6) {
                  default -> 99;
                  case 1 -> 28;
                  case 2 -> 176;
                  case 3 -> 249;
                  case 4 -> 125;
                  case 5 -> 173;
               };
               var21[var22] = (char)(var21[var22] ^ var23 ^ var13);
            } while (++var22 < var21.length);

            var16[var17] = new String(var21).intern();
            var18 += var19;
         } while (++var17 < var15.length);

         var20 = 0;
      }
   }

   @Override
   public String toString() {
      return this.ba.abab();
   }

   private static int b(int var0, int var1) {
      int var2 = a[var0 ^ 656561331] ^ var1 ^ var0;
      var2 ^= 42689;
      var2 -= 44962;
      var2 ^= 28761;
      var2 -= 61369;
      var2 -= 35745;
      return var2 ^ 11626;
   }

   private static String ab(char var0, int var1, char var2) {
      int var3 = var2 ^ 14963;
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
      int var8 = (var7.getClassName().hashCode() ^ var7.getMethodName().hashCode()) >> 16 ^ 1635;
      int var9 = 0;

      do {
         int var10 = var4[var9] ^ 7247;
         var10 ^= 23685;
         var10 ^= 41205;
         var10 -= 14005;
         var10 += 62973;
         var10 += 47417;
         var4[var9] = (char)(var10 ^ var8 ^ var0 ^ var1 >> 16);
      } while (++var9 < var4.length);

      return new String(var4).intern();
   }

   private static bbbaab[] a() {
      return new bbbaab[]{aa, b};
   }

   private bbbaab(ababbbbaa var3) {
      this.ba = var3;
   }
}
