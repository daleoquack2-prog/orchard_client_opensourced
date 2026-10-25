package nsc;

import net.fabricmc.api.EnvType;
import net.fabricmc.api.Environment;

@Environment(EnvType.CLIENT)
public enum aaaaaabb {
   private final ababbbbaa aa;
   public static final aaaaaabb a;
   public static final aaaaaabb ab;
   private static final int[] b;
   private static final String[] aab;
   public static final aaaaaabb ba;
   private static final Object[] aba;
   public static final aaaaaabb bb;
   private static final aaaaaabb[] aaa;

   private static int a(int var0, int var1) {
      int var2 = b[var0 ^ 127857683] ^ var1 ^ var0;
      var2 ^= 8217;
      var2 += 37097;
      var2 -= 33154;
      var2 -= 28391;
      var2 += 38686;
      var2 += 19433;
      var2 ^= 7044;
      var2 += 2240;
      return var2 ^ 42110;
   }

   private static String ab(int var0, short var1, byte var2, short var3) {
      int var8 = var0 ^ -558906597;
      char[] var7 = aab[var8].toCharArray();
      StackTraceElement[] var9 = (StackTraceElement[])aba[var8];
      StackTraceElement[] var10;
      if (var9 != null) {
         var10 = var9;
      } else {
         var10 = new Throwable().getStackTrace();
         aba[var8] = var10;
      }

      StackTraceElement var11 = var10[1];
      int var5 = (var11.getClassName().hashCode() ^ var11.getMethodName().hashCode()) >> 16 ^ 58352;

      for (int var6 = 0; var6 < var7.length; var6++) {
         var7[var6] = (char)(var7[var6] ^ var6 ^ switch (var6 % 19) {
            default -> 191;
            case 1 -> 25;
            case 2 -> 141;
            case 3 -> 129;
            case 4 -> 73;
            case 5 -> 81;
            case 6 -> 213;
            case 7 -> 144;
            case 8 -> 226;
            case 9 -> 121;
            case 10 -> 154;
            case 11 -> 217;
            case 12 -> 196;
            case 13 -> 160;
            case 14 -> 62;
            case 15 -> 206;
            case 16 -> 200;
            case 17 -> 54;
            case 18 -> 189;
         } ^ var2 ^ var0 ^ var1 ^ var3 ^ var5);
      }

      return new String(var7).intern();
   }

   private aaaaaabb(ababbbbaa var3) {
      this.aa = var3;
   }

   @Override
   public String toString() {
      return this.aa.abab();
   }

   private static aaaaaabb[] aa() {
      return new aaaaaabb[]{ab, bb, ba, a};
   }

   public ababbbbaa b() {
      return this.aa;
   }

   // $VF: Irreducible bytecode was duplicated to produce valid code
   static {
      int var17 = -1213891641;
      short var12 = 21600;
      int var10 = 0;
      int var8 = "0\ue0a7ꧽ\ue0a7秺\uf6c7秼\ue4c7釸\ue527\ud9fe\ue727釻\ue2a7퇸\ufae7槹\ue647ǿ\ue167\uf1fa\uf747ꧺ\uefc7⇽\uf227移\uec67ꇻ獵ꇹ\ue147䇺\ue2e7ㇽ\ue627凹輻뇺\ue3e7䇽\ue167쇻\uf407ꧽ\ued47觹\uec47懼\u0011柣惜杣ლ煣ß淣\ue8da惣烜樣\uf0d9樣\ud8d9猃胘浃"
         .length();
      String var7 = "0\ue0a7ꧽ\ue0a7秺\uf6c7秼\ue4c7釸\ue527\ud9fe\ue727釻\ue2a7퇸\ufae7槹\ue647ǿ\ue167\uf1fa\uf747ꧺ\uefc7⇽\uf227移\uec67ꇻ獵ꇹ\ue147䇺\ue2e7ㇽ\ue627凹輻뇺\ue3e7䇽\ue167쇻\uf407ꧽ\ued47觹\uec47懼\u0011柣惜杣ლ煣ß淣\ue8da惣烜樣\uf0d9樣\ud8d9猃胘浃";
      String[] var9 = new String[2];
      int var11 = 0;

      do {
         char var13 = var7.charAt(var11);
         char[] var14 = var7.substring(var11 + 1, var11 + 1 + var13).toCharArray();
         int var15 = 0;

         do {
            char var16 = var14[var15];
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

      aab = var9;
      aba = new Object[var9.length];
      byte var10000 = 0;
      int var10001 = 0;
      b = new int[12];
      byte[] var10002 = "ó¿{=\u0083\u0092 ÿlT±>qýòÄ@}ßô\u0011Ó\u0017ÉÏHe\u0091´\u0010¹+\u0013{rç\u0089$Nn_8H\u0092Ä¾R¤".getBytes("ISO-8859-1");

      int var54;
      do {
         b[var10000] = (
               (var10002[var10001] & 255) << 24 | (var10002[var10001 + 1] & 255) << 16 | (var10002[var10001 + 2] & 255) << 8 | var10002[var10001 + 3] & 255
            )
            ^ 1279514047;
         var10000 += 1;
         var54 = var10001 + 4;
         var10001 += 4;
      } while (var54 < var10002.length);

      String[] var0 = new String[a(127857683, var17 ^ -264700444)];
      int var4 = 0;
      String var3;
      int var5 = (var3 = ab(-558906597, (short)13008, (byte)-61, 10773)).length();
      int var2 = a(127857682, var17 ^ -2146097625);
      int var19 = -1;

      label91:
      while (true) {
         String var20 = var3.substring(++var19, var19 + var2);
         var10001 = (byte)-1;

         while (true) {
            label86: {
               char[] var26 = var20.toCharArray();
               var54 = var26.length;
               int var6 = 0;
               var41 = var26;
               var10001 = var54;
               char[] var58;
               int var72;
               if (var54 <= 1) {
                  var58 = var26;
                  var72 = var6;
               } else {
                  var41 = var26;
                  var10001 = var54;
                  if (var54 <= var6) {
                     break label86;
                  }

                  var58 = var26;
                  var72 = var6;
               }

               while (true) {
                  var58[var72] = (char)(var58[var72] ^ switch (var6 % a(127857681, var17 ^ 1876113400)) {
                     case 0 -> a(127857680, var17 ^ 1920627753);
                     case 1 -> a(127857687, var17 ^ 1140480291);
                     case 2 -> a(127857686, var17 ^ 307532090);
                     case 3 -> a(127857685, var17 ^ -858791240);
                     case 4 -> a(127857684, var17 ^ -1214824922);
                     case 5 -> a(127857691, var17 ^ 285013447);
                     default -> a(127857690, var17 ^ -1968977589);
                  });
                  var6++;
                  if (var10001 == 0) {
                     var72 = var10001;
                     var58 = var41;
                  } else {
                     if (var10001 <= var6) {
                        break;
                     }

                     var58 = var41;
                     var72 = var6;
                  }
               }
            }

            String var65 = new String(var41).intern();
            switch (var10001) {
               case 0:
                  var0[var4++] = var65;
                  if ((var19 += var2) >= var5) {
                     ab = new aaaaaabb(aabbaaaba.aaab(var0[1]));
                     bb = new aaaaaabb(aabbaaaba.aaab(var0[2]));
                     ba = new aaaaaabb(aabbaaaba.aaab(var0[a(127857689, var17 ^ 1556074076)]));
                     a = new aaaaaabb(aabbaaaba.aaab(var0[0]));
                     aaa = aa();
                     return;
                  }

                  var2 = var3.charAt(var19);
                  break;
               default:
                  var0[var4++] = var65;
                  if ((var19 += var2) < var5) {
                     var2 = var3.charAt(var19);
                     continue label91;
                  }

                  var5 = (var3 = ab(-558906598, (short)-27971, (byte)-67, (short)-20986)).length();
                  var2 = 4;
                  var19 = -1;
            }

            var20 = var3.substring(++var19, var19 + var2);
            var10001 = (byte)0;
         }
      }
   }
}
