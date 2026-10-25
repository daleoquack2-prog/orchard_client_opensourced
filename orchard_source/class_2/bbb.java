package nsc;

import net.fabricmc.api.EnvType;
import net.fabricmc.api.Environment;

@Environment(EnvType.CLIENT)
public enum bbb {
   private static final String[] bb;
   public static final bbb aa;
   private static final int[] a;
   private static final bbb[] ab;
   public static final bbb b;
   private static final Object[] aaa;
   private final ababbbbaa ba;

   private bbb(ababbbbaa var3) {
      this.ba = var3;
   }

   @Override
   public String toString() {
      return this.ba.abab();
   }

   private static String aa(int var0, short var1, char var2, byte var3, byte var4) {
      int var9 = var0 ^ 1093292318;
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
      int var6 = (var12.getClassName().hashCode() ^ var12.getMethodName().hashCode()) >> 16 ^ 11355;

      for (int var7 = 0; var7 < var8.length; var7++) {
         var8[var7] = (char)(var8[var7] ^ var7 ^ switch (var7 % 14) {
            default -> 180;
            case 1 -> 132;
            case 2 -> 136;
            case 3 -> 179;
            case 4 -> 27;
            case 5 -> 74;
            case 6 -> 2;
            case 7 -> 98;
            case 8 -> 159;
            case 9 -> 250;
            case 10 -> 53;
            case 11 -> 13;
            case 12 -> 210;
            case 13 -> 237;
         } ^ var2 ^ var3 ^ var0 ^ var6 ^ var4 ^ var1);
      }

      return new String(var8).intern();
   }

   private static bbb[] b() {
      return new bbb[]{b, aa};
   }

   // $VF: Irreducible bytecode was duplicated to produce valid code
   static {
      int var23 = -1402393023;
      int var16 = 0;
      int var14 = "\u0019絜߈糄䟍缸߿縰쟿紌蟟缼䟠約쟚簈쟙簈䟕織ߴ纜쟫籄쟓纨\r똶⭦뚊⭠땎ꭒ뒦歐똲歱됞歑뜎".length();
      String[] var15 = new String[2];
      String var13 = "\u0019絜߈糄䟍缸߿縰쟿紌蟟缼䟠約쟚簈쟙簈䟕織ߴ纜쟫籄쟓纨\r똶⭦뚊⭠땎ꭒ뒦歐똲歱됞歑뜎";
      int var17 = 0;
      short var18 = 20466;

      do {
         char var19 = var13.charAt(var17);
         int var21 = 0;
         char[] var20 = var13.substring(var17 + 1, var17 + 1 + var19).toCharArray();

         do {
            char var22 = var20[var21];
            if (var21 % 2 == 0) {
               var20[var21] = (char)((var22 >>> 2 | var22 << 14) & 65535 ^ var18);
            } else {
               var20[var21] = (char)((var22 << 2 | var22 >>> 14) & 65535 ^ var18);
            }
         } while (++var21 < var20.length);

         var15[var16] = new String(var20);
         var16++;
         var17 = var17 + var19 + 1;
      } while (var17 < var14);

      bb = var15;
      aaa = new Object[var15.length];
      int var9 = -215690427;
      byte[] var7 = "ç\u001cc'|=M°kÌ¹\u0006\u00ad}\u0090¼\u001a\u0017È\u0082\u0010]ù«ËDm\u0080\u0007{ !\u0006\u000f0oði\t\u001d".getBytes("ISO-8859-1");
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
      int var5 = (var3 = aa(1093292318, (short)-18200, (char)'짆', (byte)-28, (byte)-92)).length();
      int var2 = a(34402204, var23 ^ -1168373270);
      int var25 = -1;

      label90:
      while (true) {
         String var10000 = var3.substring(++var25, var25 + var2);
         int var10001 = -1;

         while (true) {
            char[] var38;
            label85: {
               char[] var29 = var10000.toCharArray();
               int var10003 = var29.length;
               int var6 = 0;
               var38 = var29;
               var10001 = var10003;
               char[] var46;
               int var10004;
               if (var10003 <= 1) {
                  var46 = var29;
                  var10004 = var6;
               } else {
                  var38 = var29;
                  var10001 = var10003;
                  if (var10003 <= var6) {
                     break label85;
                  }

                  var46 = var29;
                  var10004 = var6;
               }

               while (true) {
                  var46[var10004] = (char)(var46[var10004] ^ switch (var6 % a(34402206, var23 ^ 915198930)) {
                     case 0 -> a(34402207, var23 ^ -264374873);
                     case 1 -> a(34402200, var23 ^ 1196928472);
                     case 2 -> a(34402201, var23 ^ 1293786272);
                     case 3 -> a(34402202, var23 ^ -1778120519);
                     case 4 -> a(34402203, var23 ^ 1513867990);
                     case 5 -> a(34402196, var23 ^ 1531925828);
                     default -> a(34402197, var23 ^ -1389794053);
                  });
                  var6++;
                  if (var10001 == 0) {
                     var10004 = var10001;
                     var46 = var38;
                  } else {
                     if (var10001 <= var6) {
                        break;
                     }

                     var46 = var38;
                     var10004 = var6;
                  }
               }
            }

            String var53 = new String(var38).intern();
            switch (var10001) {
               case 0:
                  var0[var4++] = var53;
                  if ((var25 += var2) >= var5) {
                     b = new bbb(aabbaaaba.aaab(var0[1]));
                     aa = new bbb(aabbaaaba.aaab(var0[0]));
                     ab = b();
                     return;
                  }

                  var2 = var3.charAt(var25);
                  break;
               default:
                  var0[var4++] = var53;
                  if ((var25 += var2) < var5) {
                     var2 = var3.charAt(var25);
                     continue label90;
                  }

                  var5 = (var3 = aa(1093292319, (short)11572, 4357, (byte)-94, 68)).length();
                  var2 = a(34402205, var23 ^ 561850214);
                  var25 = -1;
            }

            var10000 = var3.substring(++var25, var25 + var2);
            var10001 = 0;
         }
      }
   }

   private static int a(int var0, int var1) {
      int var2 = a[var0 ^ 34402204] ^ var1 ^ var0;
      var2 -= 40199;
      var2 += 21086;
      var2 -= 33739;
      var2 += 25575;
      var2 += 3101;
      var2 ^= 901;
      var2 -= 50996;
      return var2 - 21280;
   }
}
