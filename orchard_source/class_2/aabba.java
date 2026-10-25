package nsc;

import net.fabricmc.api.EnvType;
import net.fabricmc.api.Environment;
import net.minecraft.class_2540;
import net.minecraft.class_2960;
import net.minecraft.class_8710;
import net.minecraft.class_9139;
import net.minecraft.class_8710.class_9154;

@Environment(EnvType.CLIENT)
public record aabba(byte[] ch) implements class_8710 {
   private static final Object[] bb;
   private static final String[] ba;
   public static final class_9139 aa;
   private static final int[] ab;
   public static final class_9154 b;
   private final byte[] a;

   private static String ba(int var0, int var1) {
      int var3 = var0 ^ -1815747381;
      char[] var4 = ba[var3].toCharArray();
      StackTraceElement[] var2 = (StackTraceElement[])bb[var3];
      StackTraceElement[] var5;
      if (var2 != null) {
         var5 = var2;
      } else {
         var5 = new Throwable().getStackTrace();
         bb[var3] = var5;
      }

      StackTraceElement var6 = var5[1];
      int var7 = (var6.getClassName().hashCode() ^ var6.getMethodName().hashCode()) >> 16 ^ -326525676;
      int var8 = 0;

      do {
         var4[var8] = (char)(var4[var8] ^ switch (var8 & 31) {
            default -> 80;
            case 1 -> 225;
            case 2 -> 149;
            case 3 -> 240;
            case 4 -> 158;
            case 5 -> 163;
            case 6 -> 176;
            case 7 -> 56;
            case 8 -> 237;
            case 9 -> 184;
            case 10 -> 61;
            case 11 -> 231;
            case 12 -> 94;
            case 13 -> 208;
            case 14 -> 235;
            case 15 -> 248;
            case 16 -> 3;
            case 17 -> 94;
            case 18 -> 68;
            case 19 -> 5;
            case 20 -> 135;
            case 21 -> 145;
            case 22 -> 116;
            case 23 -> 170;
            case 24 -> 161;
            case 25 -> 6;
            case 26 -> 164;
            case 27 -> 91;
            case 28 -> 88;
            case 29 -> 86;
            case 30 -> 229;
            case 31 -> 178;
         } ^ var1 >> 16 ^ var7);
      } while (++var8 < var4.length);

      return new String(var4).intern();
   }

   private static aabba a(class_2540 var0) {
      byte[] var1 = new byte[var0.readableBytes()];
      var0.method_52979(var1);
      return new aabba(var1);
   }

   public aabba(byte[] ch) {
      this.a = ch;
   }

   private static void b(aabba var0, class_2540 var1) {
      var1.method_52983(var0.aa());
   }

   // $VF: Irreducible bytecode was duplicated to produce valid code
   static {
      int var23 = -1585180441;
      int var16 = 0;
      int var17 = 0;
      String[] var15 = new String[1];
      short var18 = 12569;
      int var14 = "\u0019蔥⺻芲湘茱ย茂\u0e7c舚临蝵캽蛺깟聑⸥薒칸蟂中苭亰蓚깒臩".length();
      String var13 = "\u0019蔥⺻芲湘茱ย茂\u0e7c舚临蝵캽蛺깟聑⸥薒칸蟂中苭亰蓚깒臩";

      do {
         char var19 = var13.charAt(var17);
         int var10001 = var17 + 1;
         int var10002 = var17 + 1;
         int var21 = 0;
         char[] var20 = var13.substring(var10001, var10002 + var19).toCharArray();

         do {
            int var22 = var20[var21];

            var22 = (char)(switch (var21 % 5) {
               default -> 38;
               case 1 -> 185;
               case 2 -> 97;
               case 3 -> 89;
               case 4 -> 50;
            }) ^ var22;
            if (var21 % 2 == 0) {
               var20[var21] = (char)((var22 >>> 3 | var22 << 13) & 65535 ^ var18);
            } else {
               var20[var21] = (char)((var22 << 3 | var22 >>> 13) & 65535 ^ var18);
            }
         } while (++var21 < var20.length);

         var15[var16] = new String(var20);
         var16++;
         var17 = var17 + var19 + 1;
      } while (var17 < var14);

      ba = var15;
      bb = new Object[var15.length];
      int var9 = 497179070;
      byte[] var7 = "\f¨\u0014\b0¥R\u0091\u0092¤\u0018¦h\u009b¬\u0094s¾l6eé\u0018*\u0097\u000e\u001dÝÄ71ÕT\\{Ê".getBytes("ISO-8859-1");
      int var8 = var7.length / 4;
      ab = new int[var8];
      byte var10 = 0;
      int var11 = 0;

      do {
         int var12 = (var7[var10] & 255) << 24 | (var7[var10 + 1] & 255) << 16 | (var7[var10 + 2] & 255) << 8 | var7[var10 + 3] & 255;
         var12 ^= var9;
         ab[var11] = var12;
         var10 += 4;
      } while (++var11 < var8);

      String[] var0 = new String[2];
      int var4 = 0;
      String var3;
      int var5 = (var3 = ba(-1815747381, var23 ^ -631880566)).length();
      int var2 = ab(-694780453, var23 ^ 1712880496);
      int var1 = -1;

      while (true) {
         char[] var37;
         label84: {
            char[] var27 = var3.substring(++var1, var1 + var2).toCharArray();
            int var10003 = var27.length;
            int var6 = 0;
            var37 = var27;
            int var30 = var10003;
            char[] var44;
            int var10004;
            if (var10003 <= 1) {
               var44 = var27;
               var10004 = var6;
            } else {
               var37 = var27;
               var30 = var10003;
               if (var10003 <= var6) {
                  break label84;
               }

               var44 = var27;
               var10004 = var6;
            }

            while (true) {
               var44[var10004] = (char)(var44[var10004] ^ switch (var6 % ab(-694780454, var23 ^ 1511340755)) {
                  case 0 -> ab(-694780455, var23 ^ -132876365);
                  case 1 -> ab(-694780456, var23 ^ 36422624);
                  case 2 -> ab(-694780449, var23 ^ 420348728);
                  case 3 -> ab(-694780450, var23 ^ 257521474);
                  case 4 -> ab(-694780451, var23 ^ -37850435);
                  case 5 -> ab(-694780452, var23 ^ -1366860055);
                  default -> ab(-694780461, var23 ^ 1055659184);
               });
               var6++;
               if (var30 == 0) {
                  var10004 = var30;
                  var44 = var37;
               } else {
                  if (var30 <= var6) {
                     break;
                  }

                  var44 = var37;
                  var10004 = var6;
               }
            }
         }

         String var51 = new String(var37).intern();
         byte var34 = -1;
         var0[var4++] = var51;
         if ((var1 += var2) >= var5) {
            b = new class_9154(
               class_2960.method_60655(aabbaaaba.abba(var0[0]), aabbaaaba.abba(var0[1]))
            );
            aa = class_8710.method_56484(aabba::b, aabba::a);
            return;
         }

         var2 = var3.charAt(var1);
      }
   }

   private static int ab(int var0, int var1) {
      int var2 = ab[var0 ^ -694780453] ^ var1 ^ var0;
      var2 -= 51975;
      var2 += 60458;
      var2 ^= 23342;
      var2 ^= 30647;
      var2 -= 61375;
      var2 += 48096;
      var2 ^= 1345;
      var2 += 3149;
      var2 -= 56152;
      return var2 + 46643;
   }

   public class_9154 method_56479() {
      return b;
   }

   public byte[] aa() {
      return this.a;
   }
}
