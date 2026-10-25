package nsc;

import net.fabricmc.api.EnvType;
import net.fabricmc.api.Environment;

@Environment(EnvType.CLIENT)
public enum aaabbabbb {
   private static final Object[] bb;
   private static final int[] ab;
   public static final aaabbabbb b;
   private static final aaabbabbb[] aa;
   public static final aaabbabbb a;
   private static final String[] ba;

   // $VF: Irreducible bytecode was duplicated to produce valid code
   static {
      int var17 = 298020561;
      int var11 = 0;
      short var12 = 9670;
      int var10001 = "\u0018䳏诓垏寒俯ϗ儯毓䷏쏖䧏\udbd4仏篓亯篖䷏菓搯\udbd6䈯寐侏Ꮢ".length();
      int var10 = 0;
      int var8 = var10001;
      String[] var9 = new String[1];
      String var7 = "\u0018䳏诓垏寒俯ϗ儯毓䷏쏖䧏\udbd4仏篓亯篖䷏菓搯\udbd6䈯寐侏Ꮢ";

      do {
         char var10000 = var7.charAt(var11);
         int var15 = 0;
         char var13 = var10000;
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

      ba = var9;
      bb = new Object[var9.length];
      byte var19 = 0;
      int var20 = 0;
      ab = new int[9];
      byte[] var10002 = "ø\u0092\u00040\u0096Û\u0003¿}\u009e\u0082ÌL_Å>?\u00046\u001f\u0099Æ1ýöòAOä\u001d+T¬øy\u008e".getBytes("ISO-8859-1");

      int var50;
      do {
         ab[var19] = ((var10002[var20] & 255) << 24 | (var10002[var20 + 1] & 255) << 16 | (var10002[var20 + 2] & 255) << 8 | var10002[var20 + 3] & 255)
            ^ -87612179;
         var19 += 1;
         var50 = var20 + 4;
         var20 += 4;
      } while (var50 < var10002.length);

      String[] var0 = new String[2];
      int var4 = 0;
      String var3;
      int var5 = (var3 = ab('柑', '㹾', var17 ^ -494384957)).length();
      int var2 = a(-713753071, var17 ^ -957993013);
      int var1 = -1;

      while (true) {
         label77: {
            char[] var23 = var3.substring(++var1, var1 + var2).toCharArray();
            var50 = var23.length;
            int var6 = 0;
            var38 = var23;
            var20 = var50;
            char[] var54;
            int var68;
            if (var50 <= 1) {
               var54 = var23;
               var68 = var6;
            } else {
               var38 = var23;
               var20 = var50;
               if (var50 <= var6) {
                  break label77;
               }

               var54 = var23;
               var68 = var6;
            }

            while (true) {
               var54[var68] = (char)(var54[var68] ^ switch (var6 % a(-713753072, var17 ^ -1464915731)) {
                  case 0 -> a(-713753069, var17 ^ 1139452262);
                  case 1 -> a(-713753070, var17 ^ 1915481731);
                  case 2 -> a(-713753067, var17 ^ 24124673);
                  case 3 -> a(-713753068, var17 ^ -1481499950);
                  case 4 -> a(-713753065, var17 ^ -930715004);
                  case 5 -> a(-713753066, var17 ^ -630652751);
                  default -> a(-713753063, var17 ^ -1836297674);
               });
               var6++;
               if (var20 == 0) {
                  var68 = var20;
                  var54 = var38;
               } else {
                  if (var20 <= var6) {
                     break;
                  }

                  var54 = var38;
                  var68 = var6;
               }
            }
         }

         String var61 = new String(var38).intern();
         byte var30 = -1;
         var0[var4++] = var61;
         if ((var1 += var2) >= var5) {
            a = new aaabbabbb();
            b = new aaabbabbb();
            aa = aa();
            return;
         }

         var2 = var3.charAt(var1);
      }
   }

   public static aaabbabbb b(String var0) {
      return Enum.valueOf(aaabbabbb.class, var0);
   }

   private static int a(int var0, int var1) {
      int var2 = ab[var0 ^ -713753071] ^ var1 ^ var0;
      var2 ^= 48208;
      var2 -= 45329;
      var2 -= 47090;
      var2 -= 48468;
      var2 ^= 51693;
      var2 ^= 58820;
      var2 -= 61180;
      return var2 ^ 57861;
   }

   private static aaabbabbb[] aa() {
      return new aaabbabbb[]{a, b};
   }

   private static String ab(char var0, char var1, int var2) {
      int var3 = var1 ^ 15998;
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
      int var8 = (var7.getClassName().hashCode() ^ var7.getMethodName().hashCode()) >> 16 ^ 3532;
      int var9 = 0;

      do {
         int var10 = var4[var9] ^ 19943;
         var10 += 63322;
         var10 -= 36609;
         var10 ^= 17365;
         var10 ^= 7041;
         var10 += 18749;
         var10 += 14886;
         var10 += 21575;
         var10 ^= 37938;
         var10 -= 28623;
         var4[var9] = (char)(var10 ^ var8 ^ var0 ^ var2 >> 16);
      } while (++var9 < var4.length);

      return new String(var4).intern();
   }
}
