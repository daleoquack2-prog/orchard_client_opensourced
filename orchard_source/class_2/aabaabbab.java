package nsc;

import net.fabricmc.api.EnvType;
import net.fabricmc.api.Environment;

@Environment(EnvType.CLIENT)
enum aabaabbab {
   public static final aabaabbab aa;
   private static final Object[] aaa;
   private final ababbbbaa ab;
   private static final String[] bb;
   public static final aabaabbab a;
   private static final int[] b;
   private static final aabaabbab[] ba;

   private static String aa(char var0, char var1, int var2) {
      int var3 = var0 ^ '\udc85';
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
      int var8 = (var7.getClassName().hashCode() ^ var7.getMethodName().hashCode()) >> 16 ^ 16600;
      int var9 = 0;

      do {
         int var10 = var4[var9] - '鵸';
         var10 ^= 53121;
         var10 += 33831;
         var10 ^= 24423;
         var10 += 63146;
         var10 -= 62223;
         var4[var9] = (char)(var10 ^ var8 ^ var1 ^ var2 >> 16);
      } while (++var9 < var4.length);

      return new String(var4).intern();
   }

   @Override
   public String toString() {
      return this.ab.abab();
   }

   // $VF: Irreducible bytecode was duplicated to produce valid code
   static {
      int var23 = 498195088;
      int var14 = "\u0013\uf129㿶\uf345忞\uf45e\udf80\uf2a2鿿\uf484忩\uf21aἪ\uf820齞\uf219鿷\uf3b5\udfdd\uf883\u0014ၓ갖\u0a49䰰\u0af7퐦\u0a7e呟ॽ\uec0d\u0bdeⳊੴ듒ᆣ气ૹ갸\u0a57䱉"
         .length();
      int var16 = 0;
      int var17 = 0;
      String[] var15 = new String[2];
      String var13 = "\u0013\uf129㿶\uf345忞\uf45e\udf80\uf2a2鿿\uf484忩\uf21aἪ\uf820齞\uf219鿷\uf3b5\udfdd\uf883\u0014ၓ갖\u0a49䰰\u0af7퐦\u0a7e呟ॽ\uec0d\u0bdeⳊੴ듒ᆣ气ૹ갸\u0a57䱉";
      short var18 = 21349;

      do {
         int var21 = 0;
         char var19 = var13.charAt(var17);
         char[] var20 = var13.substring(var17 + 1, var17 + 1 + var19).toCharArray();

         do {
            int var22 = var20[var21];

            var22 = (char)(switch (var21 % 7) {
               default -> 30;
               case 1 -> 62;
               case 2 -> 34;
               case 3 -> 21;
               case 4 -> 228;
               case 5 -> 103;
               case 6 -> 149;
            }) ^ var22;
            if (var21 % 2 == 0) {
               var20[var21] = (char)((var22 >>> 3 | var22 << 13) & 65535 ^ var18);
            } else {
               var20[var21] = (char)((var22 << 3 | var22 >>> 13) & 65535 ^ var18);
            }
         } while (++var21 < var20.length);

         var15[var16] = new String(var20);
         var16++;
         var17 = var17 + var19 + 1;
      } while (var17 < var14);

      bb = var15;
      aaa = new Object[var15.length];
      int var9 = -1529985937;
      byte[] var7 = "\u0093q[S1ûÒ\u009fw\u0014RW\fÕÎ¢¨ä|r'3±\u000e)\u0084\u0089«\u0095Ïwvæ:`\u0086ÆªÁu".getBytes("ISO-8859-1");
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
      int var5 = (var3 = aa('\udc85', '뒗', var23 ^ 1708318380)).length();
      int var2 = a(-436870509, var23 ^ -805593518);
      int var25 = -1;

      label97:
      while (true) {
         String var28 = var3.substring(++var25, var25 + var2);
         int var10001 = -1;

         while (true) {
            char[] var40;
            label92: {
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
                     break label92;
                  }

                  var48 = var31;
                  var10004 = var6;
               }

               while (true) {
                  var48[var10004] = (char)(var48[var10004] ^ switch (var6 % a(-436870511, var23 ^ 731813719)) {
                     case 0 -> a(-436870512, var23 ^ 1348405455);
                     case 1 -> a(-436870505, var23 ^ -194070239);
                     case 2 -> a(-436870506, var23 ^ 2075751435);
                     case 3 -> a(-436870507, var23 ^ 1963871245);
                     case 4 -> a(-436870508, var23 ^ -918179259);
                     case 5 -> a(-436870501, var23 ^ -1162828054);
                     default -> a(-436870502, var23 ^ -1709177039);
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
                     a = new aabaabbab(aabbaaaba.aaab(var0[3]));
                     aa = new aabaabbab(aabbaaaba.aaab(var0[0]));
                     ba = b();
                     return;
                  }

                  var2 = var3.charAt(var25);
                  break;
               default:
                  var0[var4++] = var55;
                  if ((var25 += var2) < var5) {
                     var2 = var3.charAt(var25);
                     continue label97;
                  }

                  var5 = (var3 = aa('\udc84', '监', var23 ^ 983345844)).length();
                  var2 = a(-436870510, var23 ^ 1836128156);
                  var25 = -1;
            }

            var28 = var3.substring(++var25, var25 + var2);
            var10001 = 0;
         }
      }
   }

   private aabaabbab(ababbbbaa var3) {
      this.ab = var3;
   }

   private static int a(int var0, int var1) {
      int var2 = b[var0 ^ -436870509] ^ var1 ^ var0;
      var2 += 49618;
      var2 -= 37938;
      var2 += 38502;
      var2 ^= 44;
      var2 -= 41302;
      var2 ^= 60517;
      var2 += 41115;
      return var2 - 53499;
   }

   private static aabaabbab[] b() {
      return new aabaabbab[]{a, aa};
   }
}
