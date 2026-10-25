package nsc;

import net.fabricmc.api.EnvType;
import net.fabricmc.api.Environment;
import net.minecraft.class_1792;
import net.minecraft.class_1802;

@Environment(EnvType.CLIENT)
final class babbbbba {
   private static final int[] a;
   private static final Object[] ab;
   private static final class_1792[] b;
   private static final String[] aa;

   static {
      int var18 = -1415531940;
      String[] var10001 = new String[2];
      short var13 = 5189;
      String[] var10 = var10001;
      int var11 = 0;
      int var12 = 0;
      int var9 = "\u0010墍ᕣ夝\uf562寍\uf57a媽땮嬥啭姝啧廝땢崅핰\n㯊࣬㺚裸㠒\ue8e9㱚裾㲺裼".length();
      String var8 = "\u0010墍ᕣ夝\uf562寍\uf57a媽땮嬥啭姝啧廝땢崅핰\n㯊࣬㺚裸㠒\ue8e9㱚裾㲺裼";

      do {
         char var14 = var8.charAt(var12);
         int var20 = var12 + 1;
         int var16 = 0;
         char[] var15 = var8.substring(var20, var20 + var14).toCharArray();

         do {
            char var17 = var15[var16];
            if (var16 % 2 == 0) {
               var15[var16] = (char)((var17 >>> 3 | var17 << '\r') & 65535 ^ var13);
            } else {
               var15[var16] = (char)((var17 << 3 | var17 >>> '\r') & 65535 ^ var13);
            }
         } while (++var16 < var15.length);

         var10[var11] = new String(var15);
         var11++;
         var12 = var12 + var14 + 1;
      } while (var12 < var9);

      aa = var10;
      ab = new Object[var10.length];
      byte var10000 = 0;
      byte var21 = 0;
      a = new int[9];
      byte[] var10002 = "{õµ\r\u000eÉ=µuÀÝÍ=Êv\b\u0086ÿè\"\u001fÇ\u0007òl\u0080¶\u0017\u0085Ëß\u0002öXÎÛ".getBytes("ISO-8859-1");

      int var38;
      do {
         a[var10000] = ((var10002[var21] & 255) << 24 | (var10002[var21 + 1] & 255) << 16 | (var10002[var21 + 2] & 255) << 8 | var10002[var21 + 3] & 255)
            ^ -2129062206;
         var10000 += 1;
         var38 = var21 + 4;
         var21 += 4;
      } while (var38 < var10002.length);

      long var1 = 3843104550310427119L;
      long[] var0 = new long[2];
      int var4 = 0;
      String var5;
      int var6 = (var5 = b(-1861325079, var18 ^ -245135892)).length();
      byte var3 = 0;

      do {
         byte var24 = var3;
         var3 += 8;
         byte[] var7 = var5.substring(var24, var3).getBytes(b(-1861325080, var18 ^ 489941918));
         int var25 = var4++;
         long var46 = (
               (var7[0] & 255L) << a(1941098327, var18 ^ 587116323)
                  | (var7[1] & 255L) << a(1941098326, var18 ^ 1472354338)
                  | (var7[2] & 255L) << a(1941098325, var18 ^ 751548497)
                  | (var7[3] & 255L) << a(1941098324, var18 ^ 1690375053)
                  | (var7[4] & 255L) << a(1941098323, var18 ^ -537621080)
                  | (var7[5] & 255L) << a(1941098322, var18 ^ 1187782017)
                  | (var7[a(1941098321, var18 ^ 898346093)] & 255L) << a(1941098320, var18 ^ -591346309)
                  | var7[a(1941098335, var18 ^ -1353460570)] & 255L
            )
            ^ var1;
         byte var39 = -1;
         var0[var25] = var46;
      } while (var3 < var6);

      class_1792[] var19 = new class_1792[(int)var0[0]];
      var19[0] = class_1802.field_63390;
      var19[1] = class_1802.field_63389;
      var19[2] = class_1802.field_63387;
      var19[3] = class_1802.field_63388;
      var19[4] = class_1802.field_63386;
      var19[5] = class_1802.field_63385;
      var19[(int)var0[1]] = class_1802.field_63384;
      b = var19;
   }

   private babbbbba() {
   }

   private static String b(int var0, int var1) {
      int var3 = var0 ^ -1861325079;
      char[] var4 = aa[var3].toCharArray();
      StackTraceElement[] var2 = (StackTraceElement[])ab[var3];
      StackTraceElement[] var5;
      if (var2 != null) {
         var5 = var2;
      } else {
         var5 = new Throwable().getStackTrace();
         ab[var3] = var5;
      }

      StackTraceElement var6 = var5[1];
      int var7 = (var6.getClassName().hashCode() ^ var6.getMethodName().hashCode()) >> 16 ^ 497934515;
      int var8 = 0;

      do {
         var4[var8] = (char)(var4[var8] ^ switch (var8 & 31) {
            default -> 182;
            case 1 -> 181;
            case 2 -> 26;
            case 3 -> 111;
            case 4 -> 188;
            case 5 -> 241;
            case 6 -> 56;
            case 7 -> 75;
            case 8 -> 60;
            case 9 -> 83;
            case 10 -> 250;
            case 11 -> 19;
            case 12 -> 30;
            case 13 -> 51;
            case 14 -> 207;
            case 15 -> 185;
            case 16 -> 12;
            case 17 -> 70;
            case 18 -> 102;
            case 19 -> 35;
            case 20 -> 127;
            case 21 -> 200;
            case 22 -> 196;
            case 23 -> 167;
            case 24 -> 197;
            case 25 -> 100;
            case 26 -> 98;
            case 27 -> 139;
            case 28 -> 15;
            case 29 -> 192;
            case 30 -> 51;
            case 31 -> 81;
         } ^ var1 >> 16 ^ var7);
      } while (++var8 < var4.length);

      return new String(var4).intern();
   }

   private static int a(int var0, int var1) {
      int var2 = a[var0 ^ 1941098327] ^ var1 ^ var0;
      var2 ^= 20048;
      var2 += 11487;
      var2 ^= 11820;
      var2 -= 23183;
      var2 ^= 8697;
      return var2 + 13926;
   }
}
