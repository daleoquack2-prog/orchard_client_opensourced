package nsc;

import net.fabricmc.api.EnvType;
import net.fabricmc.api.Environment;
import net.minecraft.class_2540;
import net.minecraft.class_2960;
import net.minecraft.class_8710;
import net.minecraft.class_9139;
import net.minecraft.class_8710.class_9154;

@Environment(EnvType.CLIENT)
public record bbabbabb(byte[] ci) implements class_8710 {
   private final byte[] aa;
   private static final int[] b;
   public static final class_9154 ab;
   public static final class_9139 a;
   private static final Object[] bb;
   private static final String[] ba;

   private static int ab(int var0, int var1) {
      int var2 = b[var0 ^ 1537817496] ^ var1 ^ var0;
      var2 ^= 37489;
      var2 ^= 6429;
      var2 ^= 63854;
      var2 += 8950;
      var2 -= 48039;
      return var2 ^ 61423;
   }

   public byte[] a() {
      return this.aa;
   }

   private static String ba(char var0, byte var1, int var2, short var3, short var4, int var5, byte var6) {
      int var11 = var5 ^ -1739746634;
      char[] var10 = ba[var11].toCharArray();
      StackTraceElement[] var12 = (StackTraceElement[])bb[var11];
      StackTraceElement[] var13;
      if (var12 != null) {
         var13 = var12;
      } else {
         var13 = new Throwable().getStackTrace();
         bb[var11] = var13;
      }

      StackTraceElement var14 = var13[1];
      int var8 = (var14.getClassName().hashCode() ^ var14.getMethodName().hashCode()) >> 16 ^ 23946;
      int var9 = 0;

      do {
         var10[var9] = (char)(var10[var9] ^ '쭳' ^ var6 ^ var0 ^ var1 ^ var8 ^ var5 ^ var2 ^ var3 ^ var4);
      } while (++var9 < var10.length);

      return new String(var10).intern();
   }

   public bbabbabb(byte[] ci) {
      this.aa = ci;
   }

   // $VF: Irreducible bytecode was duplicated to produce valid code
   static {
      int var18 = 1494323622;
      byte var14 = -1;
      char[] var9 = "\u0019".toCharArray();
      short var7 = 9680;
      String var8 = "䳎䳎䰬䳱䱣䰏䲐䳓䱓䲞䱨䱌䲡䳯䰏䲕䱧䱆䳖䲳䰻䲒䱁䱱䲛";
      String[] var10 = new String[var9.length];

      while (true) {
         int var11 = 0;
         char var12 = 0;
         char var13 = '\u0000';
         if (var14 == 0) {
            ba = var10;
            bb = new Object[var10.length];
            byte var21 = 0;
            b = new int[7];
            int var10001 = 0;
            byte[] var10002 = ")\nF¶\u009aß\\'=.[Ð'Òq\u009c\u001f\u009cá\u0088\u0091hÆØ´+\u001d¼".getBytes("ISO-8859-1");

            int var51;
            do {
               b[var21] = (
                     (var10002[var10001] & 255) << 24
                        | (var10002[var10001 + 1] & 255) << 16
                        | (var10002[var10001 + 2] & 255) << 8
                        | var10002[var10001 + 3] & 255
                  )
                  ^ -1104705907;
               var21 += 1;
               var51 = var10001 + 4;
               var10001 += 4;
            } while (var51 < var10002.length);

            String[] var0 = new String[2];
            int var4 = 0;
            String var3;
            int var5 = (var3 = ba((char)'\uf4f0', (byte)116, -208274377, 16923, (short)-5796, -1739746634, (byte)-33)).length();
            int var2 = ab(1537817496, var18 ^ -1785425773);
            int var1 = -1;

            while (true) {
               label87: {
                  char[] var24 = var3.substring(++var1, var1 + var2).toCharArray();
                  var51 = var24.length;
                  int var6 = 0;
                  var39 = var24;
                  var10001 = var51;
                  char[] var55;
                  int var69;
                  if (var51 <= 1) {
                     var55 = var24;
                     var69 = var6;
                  } else {
                     var39 = var24;
                     var10001 = var51;
                     if (var51 <= var6) {
                        break label87;
                     }

                     var55 = var24;
                     var69 = var6;
                  }

                  while (true) {
                     var55[var69] = (char)(var55[var69] ^ switch (var6 % ab(1537817497, var18 ^ 641829390)) {
                        case 0 -> 5;
                        case 1 -> ab(1537817498, var18 ^ -2119135973);
                        case 2 -> ab(1537817499, var18 ^ -1689475246);
                        case 3 -> ab(1537817500, var18 ^ -1560135931);
                        case 4 -> ab(1537817501, var18 ^ 771100921);
                        case 5 -> 2;
                        default -> ab(1537817502, var18 ^ 146131789);
                     });
                     var6++;
                     if (var10001 == 0) {
                        var69 = var10001;
                        var55 = var39;
                     } else {
                        if (var10001 <= var6) {
                           break;
                        }

                        var55 = var39;
                        var69 = var6;
                     }
                  }
               }

               String var62 = new String(var39).intern();
               byte var31 = -1;
               var0[var4++] = var62;
               if ((var1 += var2) >= var5) {
                  ab = new class_9154(
                     class_2960.method_60655(aabbaaaba.abba(var0[0]), aabbaaaba.abba(var0[1]))
                  );
                  a = class_8710.method_56484(bbabbabb::b, bbabbabb::aa);
                  return;
               }

               var2 = var3.charAt(var1);
            }
         }

         do {
            var13 = var9[var11];
            char[] var15 = var8.substring(var12, var12 + var13).toCharArray();
            int var16 = 0;

            do {
               short var17 = switch (var16 % 6) {
                  default -> 41;
                  case 1 -> 33;
                  case 2 -> 206;
                  case 3 -> 111;
                  case 4 -> 185;
                  case 5 -> 254;
               };
               var15[var16] = (char)(var15[var16] ^ var17 ^ var7);
            } while (++var16 < var15.length);

            var10[var11] = new String(var15).intern();
            var12 += var13;
         } while (++var11 < var9.length);

         var14 = 0;
      }
   }

   public class_9154 method_56479() {
      return ab;
   }

   private static void b(bbabbabb var0, class_2540 var1) {
      var1.method_52983(var0.a());
   }

   private static bbabbabb aa(class_2540 var0) {
      byte[] var1 = new byte[var0.readableBytes()];
      var0.method_52979(var1);
      return new bbabbabb(var1);
   }
}
