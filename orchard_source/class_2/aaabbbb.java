package nsc;

import net.fabricmc.api.EnvType;
import net.fabricmc.api.Environment;
import net.minecraft.class_2540;
import net.minecraft.class_2960;
import net.minecraft.class_8710;
import net.minecraft.class_9139;
import net.minecraft.class_8710.class_9154;

@Environment(EnvType.CLIENT)
public record aaabbbb(byte[] cg) implements class_8710 {
   private final byte[] aa;
   public static final class_9139 ab;
   private static final Object[] bb;
   private static final int[] a;
   public static final class_9154 b;
   private static final String[] ba;

   private static int ab(int var0, int var1) {
      int var2 = a[var0 ^ -204609139] ^ var1 ^ var0;
      var2 ^= 35353;
      var2 -= 21241;
      var2 -= 57037;
      var2 -= 14733;
      var2 += 55299;
      return var2 - 31782;
   }

   private static aaabbbb a(class_2540 var0) {
      byte[] var1 = new byte[var0.readableBytes()];
      var0.method_52979(var1);
      return new aaabbbb(var1);
   }

   public byte[] b() {
      return this.aa;
   }

   // $VF: Irreducible bytecode was duplicated to produce valid code
   static {
      int var17 = -1420618785;
      String[] var9 = new String[1];
      short var12 = 9808;
      int var11 = 0;
      int var10 = 0;
      int var8 = "\u0015故蒮朌ӈ文ꔇ於ꔎ旳薏抝ꕝ揄Ⓣ枯\ue501攴씉披\ue58b拵".length();
      String var7 = "\u0015故蒮朌ӈ文ꔇ於ꔎ旳薏抝ꕝ揄Ⓣ枯\ue501攴씉披\ue58b拵";

      do {
         char var10000 = var7.charAt(var11);
         int var15 = 0;
         char var13 = var10000;
         char[] var14 = var7.substring(var11 + 1, var11 + 1 + var13).toCharArray();

         do {
            int var16 = var14[var15];

            var16 = (char)(switch (var15 % 5) {
               default -> 148;
               case 1 -> 213;
               case 2 -> 157;
               case 3 -> 178;
               case 4 -> 30;
            }) ^ var16;
            if (var15 % 2 == 0) {
               var14[var15] = (char)((var16 >>> 3 | var16 << 13) & 65535 ^ var12);
            } else {
               var14[var15] = (char)((var16 << 3 | var16 >>> 13) & 65535 ^ var12);
            }
         } while (++var15 < var14.length);

         var9[var10] = new String(var14);
         var10++;
         var11 = var11 + var13 + 1;
      } while (var11 < var8);

      ba = var9;
      bb = new Object[var9.length];
      byte var21 = 0;
      int var10001 = 0;
      a = new int[9];
      byte[] var10002 = "BÚ\u001d¾I (\u0017\u0090n\u001d\u009e\\5ÒÞ\r\u0014\u009a)ë\u0000^Gç\u001bJ\u0004°ç\u0010E7õ\u001a\u008f".getBytes("ISO-8859-1");

      int var51;
      do {
         a[var21] = (
               (var10002[var10001] & 255) << 24 | (var10002[var10001 + 1] & 255) << 16 | (var10002[var10001 + 2] & 255) << 8 | var10002[var10001 + 3] & 255
            )
            ^ 775033683;
         var21 += 1;
         var51 = var10001 + 4;
         var10001 += 4;
      } while (var51 < var10002.length);

      String[] var0 = new String[2];
      int var4 = 0;
      String var3;
      int var5 = (var3 = ba('⋂', var17 ^ 1958832663, '\ue325')).length();
      int var2 = ab(-204609139, var17 ^ 880242980);
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
               var55[var69] = (char)(var55[var69] ^ switch (var6 % ab(-204609140, var17 ^ 1057834099)) {
                  case 0 -> ab(-204609137, var17 ^ -423399112);
                  case 1 -> ab(-204609138, var17 ^ 714653265);
                  case 2 -> ab(-204609143, var17 ^ 2075784836);
                  case 3 -> ab(-204609144, var17 ^ -1649593631);
                  case 4 -> ab(-204609141, var17 ^ -1850333561);
                  case 5 -> ab(-204609142, var17 ^ -968196965);
                  default -> ab(-204609147, var17 ^ 1096316475);
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
            b = new class_9154(
               class_2960.method_60655(aabbaaaba.abba(var0[1]), aabbaaaba.abba(var0[0]))
            );
            ab = class_8710.method_56484(aaabbbb::aa, aaabbbb::a);
            return;
         }

         var2 = var3.charAt(var1);
      }
   }

   public class_9154 method_56479() {
      return b;
   }

   public aaabbbb(byte[] cg) {
      this.aa = cg;
   }

   private static String ba(char var0, int var1, char var2) {
      int var3 = var2 ^ '\ue325';
      char[] var4 = ba[var3].toCharArray();
      StackTraceElement[] var5 = (StackTraceElement[])bb[var3];
      StackTraceElement[] var6;
      if (var5 != null) {
         var6 = var5;
      } else {
         var6 = new Throwable().getStackTrace();
         bb[var3] = var6;
      }

      StackTraceElement var7 = var6[1];
      int var8 = (var7.getClassName().hashCode() ^ var7.getMethodName().hashCode()) >> 16 ^ 17704;
      int var9 = 0;

      do {
         int var10 = var4[var9] ^ 13460;
         var10 ^= 18697;
         var10 -= 54063;
         var10 ^= 27847;
         var10 ^= 42415;
         var10 += 36;
         var10 -= 31178;
         var10 += 26919;
         var10 -= 5140;
         var4[var9] = (char)(var10 ^ var8 ^ var0 ^ var1 >> 16);
      } while (++var9 < var4.length);

      return new String(var4).intern();
   }

   private static void aa(aaabbbb var0, class_2540 var1) {
      var1.method_52983(var0.b());
   }
}
