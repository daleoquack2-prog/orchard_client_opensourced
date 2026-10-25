package nsc;

import net.fabricmc.api.EnvType;
import net.fabricmc.api.Environment;

@Environment(EnvType.CLIENT)
public enum aabbaabba {
   private static final Object[] aaa;
   private static final int[] b;
   public static final aabbaabba aa;
   private final ababbbbaa ab;
   private static final String[] bb;
   public static final aabbaabba a;
   private static final aabbaabba[] ba;

   public ababbbbaa aa() {
      return this.ab;
   }

   private aabbaabba(ababbbbaa var3) {
      this.ab = var3;
   }

   // $VF: Irreducible bytecode was duplicated to produce valid code
   static {
      int var17 = -594466954;
      int var10 = 0;
      short var12 = 1236;
      int var11 = 0;
      String[] var9 = new String[2];
      int var8 = "!\ue19b꾋\ue01b⾈\ue263來\ue34b侁\ue313ྀ\ue07b侃\ue09b澋\ue0ab쾌\ue0eb꾇\ue10b྄\ue223⾃\ue083ྌ\ue123侄\ue3bb⾀\ue10b澅\ue153侍\ue0c3\u0014䶚\ue937䵚椲䷪श丂褶䵒褶䶪ꤱ䴲⤹䱒\ue934䱊⤰乢䤴"
         .length();
      String var7 = "!\ue19b꾋\ue01b⾈\ue263來\ue34b侁\ue313ྀ\ue07b侃\ue09b澋\ue0ab쾌\ue0eb꾇\ue10b྄\ue223⾃\ue083ྌ\ue123侄\ue3bb⾀\ue10b澅\ue153侍\ue0c3\u0014䶚\ue937䵚椲䷪श丂褶䵒褶䶪ꤱ䴲⤹䱒\ue934䱊⤰乢䤴";

      do {
         char var13 = var7.charAt(var11);
         int var10001 = var11 + 1;
         int var10002 = var11 + 1 + var13;
         int var15 = 0;
         char[] var14 = var7.substring(var10001, var10002).toCharArray();

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
      b = new int[10];
      byte[] var34 = "\u0013BF\u001a§u\u009b\u0016x^Å\u008b\u001a4\u0006\u0095\u0093åØ\u008d\u0001\u0088\u001a)Ð\u0098'AË\u0093Fß?rú\u0091Û\u0095¨\u009e"
         .getBytes("ISO-8859-1");

      int var56;
      do {
         b[var10000] = ((var34[var22] & 255) << 24 | (var34[var22 + 1] & 255) << 16 | (var34[var22 + 2] & 255) << 8 | var34[var22 + 3] & 255) ^ -1075132676;
         var10000 += 1;
         var56 = var22 + 4;
         var22 += 4;
      } while (var56 < var34.length);

      String[] var0 = new String[4];
      int var4 = 0;
      String var3;
      int var5 = (var3 = ba(1979503666, 752385128, '吻', (short)13836, (byte)30)).length();
      int var2 = b(-100934765, var17 ^ -1983679742);
      int var19 = -1;

      label91:
      while (true) {
         String var20 = var3.substring(++var19, var19 + var2);
         var22 = (byte)-1;

         while (true) {
            label86: {
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
                     break label86;
                  }

                  var60 = var27;
                  var74 = var6;
               }

               while (true) {
                  var60[var74] = (char)(var60[var74] ^ switch (var6 % b(-100934767, var17 ^ -488639914)) {
                     case 0 -> b(-100934768, var17 ^ -2135608399);
                     case 1 -> b(-100934761, var17 ^ 157609822);
                     case 2 -> b(-100934762, var17 ^ -1693896854);
                     case 3 -> b(-100934763, var17 ^ 1243157098);
                     case 4 -> b(-100934764, var17 ^ 1360163787);
                     case 5 -> b(-100934757, var17 ^ -1510748260);
                     default -> b(-100934758, var17 ^ 1091869820);
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
                     a = new aabbaabba(aabbaaaba.aaab(var0[2]));
                     aa = new aabbaabba(aabbaaaba.aaab(var0[0]));
                     ba = a();
                     return;
                  }

                  var2 = var3.charAt(var19);
                  break;
               default:
                  var0[var4++] = var67;
                  if ((var19 += var2) < var5) {
                     var2 = var3.charAt(var19);
                     continue label91;
                  }

                  var5 = (var3 = ba(1979503667, 368218282, '迫', (short)13482, 5)).length();
                  var2 = b(-100934766, var17 ^ 1039446007);
                  var19 = -1;
            }

            var20 = var3.substring(++var19, var19 + var2);
            var22 = (byte)0;
         }
      }
   }

   public static aabbaabba ab(String var0) {
      return Enum.valueOf(aabbaabba.class, var0);
   }

   private static String ba(int var0, int var1, char var2, short var3, byte var4) {
      int var9 = var0 ^ 1979503666;
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
      int var6 = (var12.getClassName().hashCode() ^ var12.getMethodName().hashCode()) >> 16 ^ 7909;
      int var7 = 0;

      do {
         var8[var7] = (char)(var8[var7] ^ var7 ^ var2 ^ var0 ^ var3 ^ var4 ^ var1 ^ var6);
      } while (++var7 < var8.length);

      return new String(var8).intern();
   }

   private static aabbaabba[] a() {
      return new aabbaabba[]{a, aa};
   }

   private static int b(int var0, int var1) {
      int var2 = b[var0 ^ -100934765] ^ var1 ^ var0;
      var2 += 47774;
      var2 ^= 8340;
      var2 -= 50384;
      var2 -= 31818;
      var2 -= 21460;
      return var2 ^ 21509;
   }

   @Override
   public String toString() {
      return this.ab.abab();
   }
}
