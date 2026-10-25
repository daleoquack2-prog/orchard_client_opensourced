package nsc;

import net.fabricmc.api.EnvType;
import net.fabricmc.api.Environment;

@Environment(EnvType.CLIENT)
public enum baaaabbb {
   private static final baaaabbb[] aa;
   private static final Object[] aaa;
   private static final int[] a;
   public static final baaaabbb b;
   public static final baaaabbb ab;
   private final ababbbbaa ba;
   private static final String[] bb;

   private static baaaabbb[] b() {
      return new baaaabbb[]{ab, b};
   }

   // $VF: Irreducible bytecode was duplicated to produce valid code
   static {
      int var17 = -238050006;
      short var12 = 8871;
      int var8 = "\u0011筨懬篈쇿簰懤翘䇡砘ǯ窸⇶羰懮翸䇣穸\u000f\udbfc퍬\uda2c卸\udc4c鍪\ude0c퍧\ud984鍣\udba4덷\uddc4鍥\udff4".length();
      int var11 = 0;
      int var10 = 0;
      String[] var9 = new String[2];
      String var7 = "\u0011筨懬篈쇿簰懤翘䇡砘ǯ窸⇶羰懮翸䇣穸\u000f\udbfc퍬\uda2c卸\udc4c鍪\ude0c퍧\ud984鍣\udba4덷\uddc4鍥\udff4";

      do {
         char var13 = var7.charAt(var11);
         int var15 = 0;
         char[] var14 = var7.substring(var11 + 1, var11 + 1 + var13).toCharArray();

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
      int var10001 = 0;
      a = new int[10];
      byte[] var10002 = "\u008fè3«\u0097è½å\u009e\u0017¼\u000f\u0083ÆIZ\u0080\u001f\\Îs¿a\u009bü6º7,(kùéî\u009d\u0086N\u000e\u0096\u0090"
         .getBytes("ISO-8859-1");

      int var54;
      do {
         a[var10000] = (
               (var10002[var10001] & 255) << 24 | (var10002[var10001 + 1] & 255) << 16 | (var10002[var10001 + 2] & 255) << 8 | var10002[var10001 + 3] & 255
            )
            ^ 133021589;
         var10000 += 1;
         var54 = var10001 + 4;
         var10001 += 4;
      } while (var54 < var10002.length);

      String[] var0 = new String[4];
      int var4 = 0;
      String var3;
      int var5 = (var3 = aa(90, (short)-2175, 1107258812, 763428269, (char)'譡', 17379)).length();
      int var2 = a(1985664859, var17 ^ 261278886);
      int var19 = -1;

      label92:
      while (true) {
         String var20 = var3.substring(++var19, var19 + var2);
         var10001 = (byte)-1;

         while (true) {
            label87: {
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
                     break label87;
                  }

                  var58 = var26;
                  var72 = var6;
               }

               while (true) {
                  var58[var72] = (char)(var58[var72] ^ switch (var6 % a(1985664857, var17 ^ 510477117)) {
                     case 0 -> a(1985664856, var17 ^ 62699113);
                     case 1 -> a(1985664863, var17 ^ 6661646);
                     case 2 -> a(1985664862, var17 ^ -205152623);
                     case 3 -> a(1985664861, var17 ^ 2085373221);
                     case 4 -> a(1985664860, var17 ^ -1403875041);
                     case 5 -> a(1985664851, var17 ^ 1771332248);
                     default -> a(1985664850, var17 ^ -831230901);
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
                     ab = new baaaabbb(aabbaaaba.aaab(var0[3]));
                     b = new baaaabbb(aabbaaaba.aaab(var0[0]));
                     aa = b();
                     return;
                  }

                  var2 = var3.charAt(var19);
                  break;
               default:
                  var0[var4++] = var65;
                  if ((var19 += var2) < var5) {
                     var2 = var3.charAt(var19);
                     continue label92;
                  }

                  var5 = (var3 = aa((byte)-52, (short)20943, 1134599522, 763428268, (char)'ꯕ', 24152)).length();
                  var2 = a(1985664858, var17 ^ 395461315);
                  var19 = -1;
            }

            var20 = var3.substring(++var19, var19 + var2);
            var10001 = (byte)0;
         }
      }
   }

   private static String aa(byte var0, short var1, int var2, int var3, char var4, char var5) {
      int var10 = var3 ^ 763428269;
      char[] var9 = bb[var10].toCharArray();
      StackTraceElement[] var11 = (StackTraceElement[])aaa[var10];
      StackTraceElement[] var12;
      if (var11 != null) {
         var12 = var11;
      } else {
         var12 = new Throwable().getStackTrace();
         aaa[var10] = var12;
      }

      StackTraceElement var13 = var12[1];
      int var7 = (var13.getClassName().hashCode() ^ var13.getMethodName().hashCode()) >> 16 ^ 54742;

      for (int var8 = 0; var8 < var9.length; var8++) {
         var9[var8] = (char)(var9[var8] ^ var8 ^ switch (var8 % 8) {
            default -> 101;
            case 1 -> 15;
            case 2 -> 75;
            case 3 -> 249;
            case 4 -> 184;
            case 5 -> 126;
            case 6 -> 129;
            case 7 -> 9;
         } ^ 21336 ^ var5 ^ var4 ^ var7 ^ var0 ^ var1 ^ var3 ^ var2);
      }

      return new String(var9).intern();
   }

   private static int a(int var0, int var1) {
      int var2 = a[var0 ^ 1985664859] ^ var1 ^ var0;
      var2 ^= 36874;
      var2 += 4308;
      var2 -= 31203;
      var2 -= 50165;
      var2 ^= 61962;
      var2 -= 27452;
      var2 -= 44824;
      var2 -= 8309;
      return var2 - 19712;
   }

   private baaaabbb(ababbbbaa var3) {
      this.ba = var3;
   }

   @Override
   public String toString() {
      return this.ba.abab();
   }
}
