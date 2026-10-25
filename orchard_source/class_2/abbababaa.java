package nsc;

import net.fabricmc.api.EnvType;
import net.fabricmc.api.Environment;

@Environment(EnvType.CLIENT)
public enum abbababaa {
   private static final String[] bb;
   public static final abbababaa aa;
   private static final Object[] aaa;
   public static final abbababaa ab;
   private static final abbababaa[] ba;
   private static final int[] a;
   private final ababbbbaa b;

   private abbababaa(ababbbbaa var3) {
      this.b = var3;
   }

   // $VF: Irreducible bytecode was duplicated to produce valid code
   static {
      int var17 = 837379011;
      int var10 = 0;
      int var11 = 0;
      String[] var9 = new String[2];
      int var8 = "\u0013䰔\udc32劜ꑳ䐲璑䴿퐔䉷ᱼ幵鰳䦰Პ塴ᰴ䴜둳凲\u0013黖뒆莞볇鞰\uec25鰝岡馵Ⓥ褗쒆鶒쐨觶⒀鋞\ue4c5胐".length();
      String var7 = "\u0013䰔\udc32劜ꑳ䐲璑䴿퐔䉷ᱼ幵鰳䦰Პ塴ᰴ䴜둳凲\u0013黖뒆莞볇鞰\uec25鰝岡馵Ⓥ褗쒆鶒쐨觶⒀鋞\ue4c5胐";
      short var12 = 7349;

      do {
         int var15 = 0;
         char var13 = var7.charAt(var11);
         char[] var14 = var7.substring(var11 + 1, var11 + 1 + var13).toCharArray();

         do {
            int var16 = var14[var15];

            var16 = (char)(switch (var15 % 7) {
               default -> 199;
               case 1 -> 228;
               case 2 -> 175;
               case 3 -> 166;
               case 4 -> 225;
               case 5 -> 67;
               case 6 -> 76;
            }) ^ var16;
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

      bb = var9;
      aaa = new Object[var9.length];
      byte var21 = 0;
      a = new int[10];
      int var10001 = 0;
      byte[] var10002 = "ËcTð\u0092rî|Î\tuEÛ¡(\u0086,0l.`Ðæ\u0018F¤OÃ»\u0002Ã3$nÔÿ\u0017ÂãÛ".getBytes("ISO-8859-1");

      int var56;
      do {
         a[var21] = (
               (var10002[var10001] & 255) << 24 | (var10002[var10001 + 1] & 255) << 16 | (var10002[var10001 + 2] & 255) << 8 | var10002[var10001 + 3] & 255
            )
            ^ -996223410;
         var21 += 1;
         var56 = var10001 + 4;
         var10001 += 4;
      } while (var56 < var10002.length);

      String[] var0 = new String[4];
      int var4 = 0;
      String var3;
      int var5 = (var3 = ab(2021203982, var17 ^ 829510883)).length();
      int var2 = a(-1597805429, var17 ^ -1630025476);
      int var19 = -1;

      label102:
      while (true) {
         String var22 = var3.substring(++var19, var19 + var2);
         var10001 = (byte)-1;

         while (true) {
            label97: {
               char[] var28 = var22.toCharArray();
               var56 = var28.length;
               int var6 = 0;
               var43 = var28;
               var10001 = var56;
               char[] var60;
               int var74;
               if (var56 <= 1) {
                  var60 = var28;
                  var74 = var6;
               } else {
                  var43 = var28;
                  var10001 = var56;
                  if (var56 <= var6) {
                     break label97;
                  }

                  var60 = var28;
                  var74 = var6;
               }

               while (true) {
                  var60[var74] = (char)(var60[var74] ^ switch (var6 % a(-1597805431, var17 ^ -1682052790)) {
                     case 0 -> a(-1597805432, var17 ^ -1911180259);
                     case 1 -> a(-1597805425, var17 ^ 2038755564);
                     case 2 -> a(-1597805426, var17 ^ 895777765);
                     case 3 -> a(-1597805427, var17 ^ 319869485);
                     case 4 -> a(-1597805428, var17 ^ -290037858);
                     case 5 -> a(-1597805437, var17 ^ 1910130944);
                     default -> a(-1597805438, var17 ^ 1115062085);
                  });
                  var6++;
                  if (var10001 == 0) {
                     var74 = var10001;
                     var60 = var43;
                  } else {
                     if (var10001 <= var6) {
                        break;
                     }

                     var60 = var43;
                     var74 = var6;
                  }
               }
            }

            String var67 = new String(var43).intern();
            switch (var10001) {
               case 0:
                  var0[var4++] = var67;
                  if ((var19 += var2) >= var5) {
                     ab = new abbababaa(aabbaaaba.aaab(var0[3]));
                     aa = new abbababaa(aabbaaaba.aaab(var0[1]));
                     ba = aa();
                     return;
                  }

                  var2 = var3.charAt(var19);
                  break;
               default:
                  var0[var4++] = var67;
                  if ((var19 += var2) < var5) {
                     var2 = var3.charAt(var19);
                     continue label102;
                  }

                  var5 = (var3 = ab(2021203983, var17 ^ 670568911)).length();
                  var2 = a(-1597805430, var17 ^ -943295887);
                  var19 = -1;
            }

            var22 = var3.substring(++var19, var19 + var2);
            var10001 = (byte)0;
         }
      }
   }

   public static abbababaa b(String var0) {
      return Enum.valueOf(abbababaa.class, var0);
   }

   private static int a(int var0, int var1) {
      int var2 = a[var0 ^ -1597805429] ^ var1 ^ var0;
      var2 += 45372;
      var2 ^= 42460;
      var2 ^= 55388;
      var2 += 15601;
      var2 -= 16313;
      return var2 ^ 35064;
   }

   private static String ab(int var0, int var1) {
      int var3 = var0 ^ 2021203982;
      char[] var4 = bb[var3].toCharArray();
      StackTraceElement[] var2 = (StackTraceElement[])aaa[var3];
      StackTraceElement[] var5;
      if (var2 != null) {
         var5 = var2;
      } else {
         var5 = new Throwable().getStackTrace();
         aaa[var3] = var5;
      }

      StackTraceElement var6 = var5[1];
      int var7 = (var6.getClassName().hashCode() ^ var6.getMethodName().hashCode()) >> 16 ^ 69307622;
      int var8 = 0;

      do {
         var4[var8] = (char)(var4[var8] ^ switch (var8 & 31) {
            default -> 24;
            case 1 -> 157;
            case 2 -> 147;
            case 3 -> 166;
            case 4 -> 109;
            case 5 -> 92;
            case 6 -> 32;
            case 7 -> 34;
            case 8 -> 122;
            case 9 -> 120;
            case 10 -> 202;
            case 11 -> 28;
            case 12 -> 119;
            case 13 -> 64;
            case 14 -> 139;
            case 15 -> 48;
            case 16 -> 22;
            case 17 -> 223;
            case 18 -> 170;
            case 19 -> 250;
            case 20 -> 35;
            case 21 -> 63;
            case 22 -> 122;
            case 23 -> 201;
            case 24 -> 174;
            case 25 -> 47;
            case 26 -> 16;
            case 27 -> 127;
            case 28 -> 178;
            case 29 -> 121;
            case 30 -> 118;
            case 31 -> 80;
         } ^ var1 >> 16 ^ var7);
      } while (++var8 < var4.length);

      return new String(var4).intern();
   }

   @Override
   public String toString() {
      return this.b.abab();
   }

   private static abbababaa[] aa() {
      return new abbababaa[]{ab, aa};
   }
}
