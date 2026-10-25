package nsc;

import net.fabricmc.api.EnvType;
import net.fabricmc.api.Environment;

@Environment(EnvType.CLIENT)
public enum aabbabbb {
   public static final aabbabbb aa;
   public static final aabbabbb ab;
   private final ababbbbaa ba;
   private static final int[] b;
   private static final Object[] aab;
   private static final String[] aaa;
   public static final aabbabbb a;
   private static final aabbabbb[] bb;

   // $VF: Irreducible bytecode was duplicated to produce valid code
   static {
      int var17 = 1611108340;
      String[] var9 = new String[2];
      int var10001 = "%ᰝ\uf740͝䝇Н坅´\uf740\u0b9d\uf744ቝ읇ఽὂᄝᝃᵝ\uf747ؽὂ᷽䝄ḝ轁ࡽ罆ͽ睇\u1add݁࠽ὄჽ݅Ƚ흂ᑝ\u000eьﬆᡬଁᷬጂࢌꌄ\u19cc⬃ˬ鬀ᫌ謅".length();
      int var10 = 0;
      int var8 = var10001;
      String var7 = "%ᰝ\uf740͝䝇Н坅´\uf740\u0b9d\uf744ቝ읇ఽὂᄝᝃᵝ\uf747ؽὂ᷽䝄ḝ轁ࡽ罆ͽ睇\u1add݁࠽ὄჽ݅Ƚ흂ᑝ\u000eьﬆᡬଁᷬጂࢌꌄ\u19cc⬃ˬ鬀ᫌ謅";
      int var11 = 0;
      short var12 = 18123;

      do {
         int var15 = 0;
         char var13 = var7.charAt(var11);
         char[] var14 = var7.substring(var11 + 1, var11 + 1 + var13).toCharArray();

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

      aaa = var9;
      aab = new Object[var9.length];
      byte var10000 = 0;
      int var22 = 0;
      b = new int[9];
      byte[] var10002 = "FD^\u0011\\´o\u0016&¡Éõ\u008dïtúm£\u0013à²âàA^+]\u0012\u008d[J$kË\u009bs".getBytes("ISO-8859-1");

      int var55;
      do {
         b[var10000] = ((var10002[var22] & 255) << 24 | (var10002[var22 + 1] & 255) << 16 | (var10002[var22 + 2] & 255) << 8 | var10002[var22 + 3] & 255)
            ^ 390776225;
         var10000 += 1;
         var55 = var22 + 4;
         var22 += 4;
      } while (var55 < var10002.length);

      String[] var0 = new String[a(-1788042201, var17 ^ 1536857655)];
      int var4 = 0;
      String var3;
      int var5 = (var3 = ab((short)-3698, 941903501, -1330706067, 1699093162, -1539367941, (char)'阆')).length();
      char var2 = 4;
      int var19 = -1;

      label91:
      while (true) {
         String var20 = var3.substring(++var19, var19 + var2);
         var22 = (byte)-1;

         while (true) {
            label86: {
               char[] var27 = var20.toCharArray();
               var55 = var27.length;
               int var6 = 0;
               var42 = var27;
               var22 = var55;
               char[] var59;
               int var73;
               if (var55 <= 1) {
                  var59 = var27;
                  var73 = var6;
               } else {
                  var42 = var27;
                  var22 = var55;
                  if (var55 <= var6) {
                     break label86;
                  }

                  var59 = var27;
                  var73 = var6;
               }

               while (true) {
                  var59[var73] = (char)(var59[var73] ^ switch (var6 % a(-1788042202, var17 ^ 1097508648)) {
                     case 0 -> a(-1788042203, var17 ^ 998179197);
                     case 1 -> a(-1788042204, var17 ^ -1875788683);
                     case 2 -> a(-1788042205, var17 ^ 1887296014);
                     case 3 -> a(-1788042206, var17 ^ -1355011616);
                     case 4 -> a(-1788042207, var17 ^ 1140167918);
                     case 5 -> a(-1788042208, var17 ^ -1870298602);
                     default -> a(-1788042193, var17 ^ 1981108947);
                  });
                  var6++;
                  if (var22 == 0) {
                     var73 = var22;
                     var59 = var42;
                  } else {
                     if (var22 <= var6) {
                        break;
                     }

                     var59 = var42;
                     var73 = var6;
                  }
               }
            }

            String var66 = new String(var42).intern();
            switch (var22) {
               case 0:
                  var0[var4++] = var66;
                  if ((var19 += var2) >= var5) {
                     a = new aabbabbb(aabbaaaba.aaab(var0[2]));
                     aa = new aabbabbb(aabbaaaba.aaab(var0[1]));
                     ab = new aabbabbb(aabbaaaba.aaab(var0[5]));
                     bb = aa();
                     return;
                  }

                  var2 = var3.charAt(var19);
                  break;
               default:
                  var0[var4++] = var66;
                  if ((var19 += var2) < var5) {
                     var2 = var3.charAt(var19);
                     continue label91;
                  }

                  var5 = (var3 = ab(30344, 941903500, -1971088915, -1934796502, 1231383186, '㎪')).length();
                  var2 = 5;
                  var19 = -1;
            }

            var20 = var3.substring(++var19, var19 + var2);
            var22 = (byte)0;
         }
      }
   }

   private aabbabbb(ababbbbaa var3) {
      this.ba = var3;
   }

   public static aabbabbb b(String var0) {
      return Enum.valueOf(aabbabbb.class, var0);
   }

   private static String ab(short var0, int var1, int var2, int var3, int var4, char var5) {
      int var10 = var1 ^ 941903501;
      char[] var9 = aaa[var10].toCharArray();
      StackTraceElement[] var11 = (StackTraceElement[])aab[var10];
      StackTraceElement[] var12;
      if (var11 != null) {
         var12 = var11;
      } else {
         var12 = new Throwable().getStackTrace();
         aab[var10] = var12;
      }

      StackTraceElement var13 = var12[1];
      int var7 = (var13.getClassName().hashCode() ^ var13.getMethodName().hashCode()) >> 16 ^ 8563;

      for (int var8 = 0; var8 < var9.length; var8++) {
         var9[var8] = (char)(var9[var8] ^ var8 ^ switch (var8 % 11) {
            default -> 124;
            case 1 -> 132;
            case 2 -> 242;
            case 3 -> 95;
            case 4 -> 172;
            case 5 -> 9;
            case 6 -> 103;
            case 7 -> 206;
            case 8 -> 221;
            case 9 -> 0;
            case 10 -> 38;
         } ^ var1 ^ var4 ^ var7 ^ var5 ^ var3 ^ var2 ^ var0);
      }

      return new String(var9).intern();
   }

   private static int a(int var0, int var1) {
      int var2 = b[var0 ^ -1788042201] ^ var1 ^ var0;
      var2 -= 63793;
      var2 += 52987;
      var2 ^= 11374;
      var2 ^= 15253;
      var2 += 26559;
      var2 ^= 42868;
      var2 -= 24016;
      var2 ^= 48951;
      return var2 + 55247;
   }

   private static aabbabbb[] aa() {
      return new aabbabbb[]{a, aa, ab};
   }

   @Override
   public String toString() {
      return this.ba.abab();
   }
}
