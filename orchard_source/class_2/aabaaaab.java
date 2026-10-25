package nsc;

import net.fabricmc.api.EnvType;
import net.fabricmc.api.Environment;

@Environment(EnvType.CLIENT)
final class aabaaaab {
   private static final String[] aba;
   private static final int[] a;
   private static final Long[] aa;
   private static final Object[] abb;
   private static final long[] ab;
   private long ba;
   private long bb;
   private long aaa;
   private long aab = b(a(-1319361890, -1808310754 ^ -826062334), 7429701300691763720L);
   private long b;

   private static String aa(int var0, int var1) {
      int var3 = var0 ^ 11623840;
      char[] var4 = aba[var3].toCharArray();
      StackTraceElement[] var2 = (StackTraceElement[])abb[var3];
      StackTraceElement[] var5;
      if (var2 != null) {
         var5 = var2;
      } else {
         var5 = new Throwable().getStackTrace();
         abb[var3] = var5;
      }

      StackTraceElement var6 = var5[1];
      int var7 = (var6.getClassName().hashCode() ^ var6.getMethodName().hashCode()) >> 16 ^ 1641902566;
      int var8 = 0;

      do {
         var4[var8] = (char)(var4[var8] ^ switch (var8 & 31) {
            default -> 236;
            case 1 -> 72;
            case 2 -> 150;
            case 3 -> 206;
            case 4 -> 179;
            case 5 -> 224;
            case 6 -> 201;
            case 7 -> 3;
            case 8 -> 198;
            case 9 -> 135;
            case 10 -> 152;
            case 11 -> 83;
            case 12 -> 106;
            case 13 -> 119;
            case 14 -> 199;
            case 15 -> 74;
            case 16 -> 51;
            case 17 -> 105;
            case 18 -> 179;
            case 19 -> 181;
            case 20 -> 171;
            case 21 -> 36;
            case 22 -> 167;
            case 23 -> 20;
            case 24 -> 153;
            case 25 -> 62;
            case 26 -> 16;
            case 27 -> 56;
            case 28 -> 179;
            case 29 -> 148;
            case 30 -> 70;
            case 31 -> 211;
         } ^ var1 >> 16 ^ var7);
      } while (++var8 < var4.length);

      return new String(var4).intern();
   }

   private static long b(int var0, long var1) {
      int var3 = (var0 ^ (int)var1 ^ a(-1319361892, -332966065 ^ -532919964)) & a(-1319361889, -332966065 ^ -1697076160);
      if (aa[var3] == null) {
         aa[var3] = ab[var3] ^ var1;
      }

      return aa[var3];
   }

   private static int a(int var0, int var1) {
      int var2 = a[var0 ^ -1319361899] ^ var1 ^ var0;
      var2 += 54715;
      var2 ^= 56979;
      var2 -= 28419;
      var2 += 65409;
      var2 += 25466;
      var2 -= 16718;
      return var2 - 65172;
   }

   static {
      int var18 = -195347412;
      String[] var10000 = new String[2];
      int var12 = 0;
      short var13 = 11694;
      String[] var10 = var10000;
      int var9 = "\u0010쪲\udc58째\udcb6짓鳦쮖\udc4b쪰Ე쮧᳸쥮ᱎ제\udc90\n\ufaf4罾﮺羜逸뿖ﮐ㽶ﭲ㾉".length();
      String var8 = "\u0010쪲\udc58째\udcb6짓鳦쮖\udc4b쪰Ე쮧᳸쥮ᱎ제\udc90\n\ufaf4罾﮺羜逸뿖ﮐ㽶ﭲ㾉";
      int var11 = 0;

      do {
         char var14 = var8.charAt(var12);
         int var10001 = var12 + 1;
         int var10002 = var12 + 1;
         int var16 = 0;
         char[] var15 = var8.substring(var10001, var10002 + var14).toCharArray();

         do {
            int var17 = var15[var16];

            var17 = (char)(switch (var16 % 6) {
               default -> 91;
               case 1 -> 251;
               case 2 -> 229;
               case 3 -> 39;
               case 4 -> 50;
               case 5 -> 99;
            }) ^ var17;
            if (var16 % 2 == 0) {
               var15[var16] = (char)((var17 >>> 2 | var17 << 14) & 65535 ^ var13);
            } else {
               var15[var16] = (char)((var17 << 2 | var17 >>> 14) & 65535 ^ var13);
            }
         } while (++var16 < var15.length);

         var10[var11] = new String(var15);
         var11++;
         var12 = var12 + var14 + 1;
      } while (var12 < var9);

      aba = var10;
      abb = new Object[var10.length];
      byte var21 = 0;
      int var22 = 0;
      byte[] var27 = "a§h;C\u0000~\b@\u001eav\u007f\f}ÑÝJYì\u0016y>z\tu;ù\u0005\u0004ÂO\u001aæ\u0092¥|f§l\u0006\u0082\u0010\u009f*\u0089«±1»Çì"
         .getBytes("ISO-8859-1");
      a = new int[13];

      int var40;
      do {
         a[var21] = ((var27[var22] & 255) << 24 | (var27[var22 + 1] & 255) << 16 | (var27[var22 + 2] & 255) << 8 | var27[var22 + 3] & 255) ^ 1054799536;
         var21 += 1;
         var40 = var22 + 4;
         var22 += 4;
      } while (var40 < var27.length);

      long var0 = 66842949760748025L;
      long[] var6 = new long[2];
      int var3 = 0;
      String var4;
      int var5 = (var4 = aa(11623840, var18 ^ 1959666485)).length();
      byte var2 = 0;

      do {
         var22 = var2;
         var2 += 8;
         byte[] var7 = var4.substring(var22, var2).getBytes(aa(11623841, var18 ^ -133280713));
         var22 = var3++;
         long var48 = (
               (var7[0] & 255L) << a(-1319361899, var18 ^ -444515132)
                  | (var7[1] & 255L) << a(-1319361900, var18 ^ -953799986)
                  | (var7[2] & 255L) << a(-1319361897, var18 ^ -1002949189)
                  | (var7[3] & 255L) << a(-1319361898, var18 ^ -81123067)
                  | (var7[4] & 255L) << a(-1319361903, var18 ^ 1500253495)
                  | (var7[5] & 255L) << a(-1319361904, var18 ^ -1839240744)
                  | (var7[a(-1319361901, var18 ^ -1923912610)] & 255L) << a(-1319361902, var18 ^ -2128439833)
                  | var7[a(-1319361891, var18 ^ -1631533821)] & 255L
            )
            ^ var0;
         byte var41 = -1;
         var6[var22] = var48;
      } while (var2 < var5);

      ab = var6;
      aa = new Long[2];
   }

   private aabaaaab() {
      this.bb = b(a(-1319361895, -1808310754 ^ -705568372), 7104205490802409821L);
   }
}
