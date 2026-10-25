package nsc;

import net.fabricmc.api.EnvType;
import net.fabricmc.api.Environment;

@Environment(EnvType.CLIENT)
public enum aaaababba {
   public static final aaaababba aa;
   private static final int[] ba;
   private final ababbbbaa ab;
   private static final String[] bb;
   private static final aaaababba[] a;
   private static final Object[] aaa;
   public static final aaaababba b;

   // $VF: Irreducible bytecode was duplicated to produce valid code
   static {
      int var18 = 687829376;
      char[] var9 = "泲泧".toCharArray();
      String var8 = "耀能聋胂胛肰聾肕而肯耹耢꾥꼶꾊꽳꽌꼑꿝꽉꾶꼣꾔꾍꽸꼍꾨꾒꼺꿍꾠꼌꾉꼫꼌꼄꾛";
      short var7 = 27902;
      String[] var10000 = new String[var9.length];
      byte var14 = -1;
      String[] var10 = var10000;

      while (true) {
         int var11 = 0;
         int var12 = 0;
         int var13 = 0;
         if (var14 == 0) {
            bb = var10;
            aaa = new Object[var10.length];
            ba = new int[10];
            byte var23 = 0;
            int var10001 = 0;
            byte[] var10002 = "¾S\u009d\u000b[Íømk\b\u007fñ[\u001b\u0015Ò¸Ýû<Ï\u009a1«¤ü¨Ý\u0088\u0016½cÃÁí§È¡E\u00ad".getBytes("ISO-8859-1");

            int var58;
            do {
               ba[var23] = (
                     (var10002[var10001] & 255) << 24
                        | (var10002[var10001 + 1] & 255) << 16
                        | (var10002[var10001 + 2] & 255) << 8
                        | var10002[var10001 + 3] & 255
                  )
                  ^ 1202355003;
               var23 += 1;
               var58 = var10001 + 4;
               var10001 += 4;
            } while (var58 < var10002.length);

            String[] var0 = new String[4];
            int var4 = 0;
            String var3;
            int var5 = (var3 = aa(-450322539, var18 ^ 2014276138)).length();
            int var2 = a(-1811806751, var18 ^ -1157911632);
            int var20 = -1;

            label101:
            while (true) {
               String var24 = var3.substring(++var20, var20 + var2);
               var10001 = (byte)-1;

               while (true) {
                  label96: {
                     char[] var30 = var24.toCharArray();
                     var58 = var30.length;
                     int var6 = 0;
                     var45 = var30;
                     var10001 = var58;
                     char[] var62;
                     int var76;
                     if (var58 <= 1) {
                        var62 = var30;
                        var76 = var6;
                     } else {
                        var45 = var30;
                        var10001 = var58;
                        if (var58 <= var6) {
                           break label96;
                        }

                        var62 = var30;
                        var76 = var6;
                     }

                     while (true) {
                        var62[var76] = (char)(var62[var76] ^ switch (var6 % a(-1811806749, var18 ^ 1872775589)) {
                           case 0 -> a(-1811806750, var18 ^ 1605575482);
                           case 1 -> a(-1811806747, var18 ^ -1133130286);
                           case 2 -> a(-1811806748, var18 ^ -885913853);
                           case 3 -> a(-1811806745, var18 ^ -1605067141);
                           case 4 -> a(-1811806746, var18 ^ -1933669441);
                           case 5 -> a(-1811806743, var18 ^ -949363917);
                           default -> a(-1811806744, var18 ^ -871795871);
                        });
                        var6++;
                        if (var10001 == 0) {
                           var76 = var10001;
                           var62 = var45;
                        } else {
                           if (var10001 <= var6) {
                              break;
                           }

                           var62 = var45;
                           var76 = var6;
                        }
                     }
                  }

                  String var69 = new String(var45).intern();
                  switch (var10001) {
                     case 0:
                        var0[var4++] = var69;
                        if ((var20 += var2) >= var5) {
                           b = new aaaababba(aabbaaaba.aaab(var0[0]));
                           aa = new aaaababba(aabbaaaba.aaab(var0[3]));
                           a = b();
                           return;
                        }

                        var2 = var3.charAt(var20);
                        break;
                     default:
                        var0[var4++] = var69;
                        if ((var20 += var2) < var5) {
                           var2 = var3.charAt(var20);
                           continue label101;
                        }

                        var5 = (var3 = aa(-450322540, var18 ^ 1470516446)).length();
                        var2 = a(-1811806752, var18 ^ 1600507607);
                        var20 = -1;
                  }

                  var24 = var3.substring(++var20, var20 + var2);
                  var10001 = (byte)0;
               }
            }
         }

         do {
            var13 = var9[var11] ^ var7;
            char[] var15 = var8.substring(var12, var12 + var13).toCharArray();
            int var16 = 0;

            do {
               short var17 = switch (var16 % 5) {
                  default -> 250;
                  case 1 -> 2;
                  case 2 -> 20;
                  case 3 -> 218;
                  case 4 -> 49;
               };
               var15[var16] = (char)(var15[var16] ^ var17);
            } while (++var16 < var15.length);

            var10[var11] = new String(var15).intern();
            var12 += var13;
         } while (++var11 < var9.length);

         var14 = 0;
      }
   }

   private static String aa(int var0, int var1) {
      int var3 = var0 ^ -450322539;
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
      int var7 = (var6.getClassName().hashCode() ^ var6.getMethodName().hashCode()) >> 16 ^ -2057390827;
      int var8 = 0;

      do {
         var4[var8] = (char)(var4[var8] ^ switch (var8 & 31) {
            default -> 207;
            case 1 -> 182;
            case 2 -> 89;
            case 3 -> 71;
            case 4 -> 147;
            case 5 -> 50;
            case 6 -> 67;
            case 7 -> 196;
            case 8 -> 245;
            case 9 -> 174;
            case 10 -> 241;
            case 11 -> 74;
            case 12 -> 255;
            case 13 -> 48;
            case 14 -> 49;
            case 15 -> 221;
            case 16 -> 177;
            case 17 -> 81;
            case 18 -> 168;
            case 19 -> 228;
            case 20 -> 184;
            case 21 -> 135;
            case 22 -> 150;
            case 23 -> 50;
            case 24 -> 69;
            case 25 -> 178;
            case 26 -> 127;
            case 27 -> 109;
            case 28 -> 112;
            case 29 -> 21;
            case 30 -> 23;
            case 31 -> 123;
         } ^ var1 >> 16 ^ var7);
      } while (++var8 < var4.length);

      return new String(var4).intern();
   }

   private static aaaababba[] b() {
      return new aaaababba[]{b, aa};
   }

   private static int a(int var0, int var1) {
      int var2 = ba[var0 ^ -1811806751] ^ var1 ^ var0;
      var2 ^= 64865;
      var2 ^= 33768;
      var2 += 50424;
      var2 ^= 3792;
      var2 += 38377;
      return var2 ^ 39057;
   }

   private aaaababba(ababbbbaa var3) {
      this.ab = var3;
   }

   @Override
   public String toString() {
      return this.ab.abab();
   }
}
