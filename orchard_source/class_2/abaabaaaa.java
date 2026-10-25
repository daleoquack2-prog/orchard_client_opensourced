package nsc;

import net.fabricmc.api.EnvType;
import net.fabricmc.api.Environment;

// $VF: synthetic class
@Environment(EnvType.CLIENT)
class abaabaaaa {
   private static final String[] ab;
   private static final int[] b;
   private static final Object[] ba;
   static final int[] aa;
   static final int[] a;

   private static String b(int var0, int var1) {
      int var3 = var0 ^ 2042590667;
      char[] var4 = ab[var3].toCharArray();
      StackTraceElement[] var2 = (StackTraceElement[])ba[var3];
      StackTraceElement[] var5;
      if (var2 != null) {
         var5 = var2;
      } else {
         var5 = new Throwable().getStackTrace();
         ba[var3] = var5;
      }

      StackTraceElement var6 = var5[1];
      int var7 = (var6.getClassName().hashCode() ^ var6.getMethodName().hashCode()) >> 16 ^ 1453780955;
      int var8 = 0;

      do {
         var4[var8] = (char)(var4[var8] ^ switch (var8 & 31) {
            default -> 34;
            case 1 -> 173;
            case 2 -> 18;
            case 3 -> 109;
            case 4 -> 193;
            case 5 -> 75;
            case 6 -> 215;
            case 7 -> 87;
            case 8 -> 44;
            case 9 -> 226;
            case 10 -> 171;
            case 11 -> 63;
            case 12 -> 70;
            case 13 -> 188;
            case 14 -> 236;
            case 15 -> 244;
            case 16 -> 91;
            case 17 -> 219;
            case 18 -> 6;
            case 19 -> 201;
            case 20 -> 204;
            case 21 -> 121;
            case 22 -> 33;
            case 23 -> 114;
            case 24 -> 103;
            case 25 -> 113;
            case 26 -> 205;
            case 27 -> 141;
            case 28 -> 32;
            case 29 -> 5;
            case 30 -> 170;
            case 31 -> 151;
         } ^ var1 >> 16 ^ var7);
      } while (++var8 < var4.length);

      return new String(var4).intern();
   }

   static {
      int var19 = 1533845869;
      String[] var11 = new String[2];
      int var12 = 0;
      int var10 = "\u0010ﰓ돽\uf5a3菳\uf4d3\uf3fd念菰ﳓ菲\uf1a3돵ﲣ菲﨓ꏺ\n躓쎇跳⎌螳ᎏ蘃쎎蠳ᎅ".length();
      short var14 = 10953;
      int var13 = 0;
      String var9 = "\u0010ﰓ돽\uf5a3菳\uf4d3\uf3fd念菰ﳓ菲\uf1a3돵ﲣ菲﨓ꏺ\n躓쎇跳⎌螳ᎏ蘃쎎蠳ᎅ";

      do {
         char var15 = var9.charAt(var13);
         int var17 = 0;
         char[] var16 = var9.substring(var13 + 1, var13 + 1 + var15).toCharArray();

         do {
            char var18 = var16[var17];
            if (var17 % 2 == 0) {
               var16[var17] = (char)((var18 >>> 4 | var18 << '\f') & 65535 ^ var14);
            } else {
               var16[var17] = (char)((var18 << 4 | var18 >>> '\f') & 65535 ^ var14);
            }
         } while (++var17 < var16.length);

         var11[var12] = new String(var16);
         var12++;
         var13 = var13 + var15 + 1;
      } while (var13 < var10);

      ab = var11;
      ba = new Object[var11.length];
      byte var10000 = 0;
      b = new int[9];
      int var10001 = 0;
      byte[] var10002 = "E÷\u0099\u001aa/\u0087Åºf\rçí-0\u008cõõ·\u00ad#5¹6òR!kÓX\tÍÁR=ß".getBytes("ISO-8859-1");

      int var46;
      do {
         b[var10000] = (
               (var10002[var10001] & 255) << 24 | (var10002[var10001 + 1] & 255) << 16 | (var10002[var10001 + 2] & 255) << 8 | var10002[var10001 + 3] & 255
            )
            ^ -667113192;
         var10000 += 1;
         var46 = var10001 + 4;
         var10001 += 4;
      } while (var46 < var10002.length);

      long var1 = 5968107925668002671L;
      long[] var0 = new long[2];
      int var4 = 0;
      String var5;
      int var6 = (var5 = b(2042590667, var19 ^ 2095759964)).length();
      byte var3 = 0;

      do {
         var10001 = var3;
         var3 += 8;
         byte[] var7 = var5.substring(var10001, var3).getBytes(b(2042590666, var19 ^ 2069811654));
         var10001 = var4++;
         long var54 = (
               (var7[0] & 255L) << a(-1724653845, var19 ^ -1603642474)
                  | (var7[1] & 255L) << a(-1724653846, var19 ^ -2068691648)
                  | (var7[2] & 255L) << a(-1724653847, var19 ^ 1610338137)
                  | (var7[3] & 255L) << a(-1724653848, var19 ^ 145814075)
                  | (var7[4] & 255L) << a(-1724653841, var19 ^ 275280581)
                  | (var7[5] & 255L) << a(-1724653842, var19 ^ -962036649)
                  | (var7[a(-1724653843, var19 ^ 399500259)] & 255L) << a(-1724653844, var19 ^ 918932310)
                  | var7[a(-1724653853, var19 ^ 617611096)] & 255L
            )
            ^ var1;
         byte var47 = -1;
         var0[var10001] = var54;
      } while (var3 < var6);

      a = new int[aabaabbbb.values().length];

      try {
         a[aabaabbbb.baa.ordinal()] = 1;
      } catch (NoSuchFieldError var29) {
      }

      try {
         a[aabaabbbb.aaa.ordinal()] = 2;
      } catch (NoSuchFieldError var28) {
      }

      try {
         a[aabaabbbb.aa.ordinal()] = 3;
      } catch (NoSuchFieldError var27) {
      }

      try {
         a[aabaabbbb.aab.ordinal()] = 4;
      } catch (NoSuchFieldError var26) {
      }

      try {
         a[aabaabbbb.ba.ordinal()] = 5;
      } catch (NoSuchFieldError var25) {
      }

      try {
         a[aabaabbbb.abb.ordinal()] = (int)var0[0];
      } catch (NoSuchFieldError var24) {
      }

      try {
         a[aabaabbbb.a.ordinal()] = (int)var0[1];
      } catch (NoSuchFieldError var23) {
      }

      aa = new int[aaaabab.values().length];

      try {
         aa[aaaabab.a.ordinal()] = 1;
      } catch (NoSuchFieldError var22) {
      }

      try {
         aa[aaaabab.b.ordinal()] = 2;
      } catch (NoSuchFieldError var21) {
      }

      try {
         aa[aaaabab.ba.ordinal()] = 3;
      } catch (NoSuchFieldError var20) {
      }
   }

   private static int a(int var0, int var1) {
      int var2 = b[var0 ^ -1724653845] ^ var1 ^ var0;
      var2 += 52688;
      var2 += 35596;
      var2 += 39230;
      var2 += 18851;
      var2 += 3793;
      var2 ^= 19531;
      return var2 ^ 4819;
   }
}
