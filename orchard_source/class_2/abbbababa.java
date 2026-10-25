package nsc;

import net.fabricmc.api.EnvType;
import net.fabricmc.api.Environment;

@Environment(EnvType.CLIENT)
public enum abbbababa {
   public static final abbbababa aa;
   private static final int[] a;
   private static final String[] bb;
   private static final Object[] aaa;
   public static final abbbababa ab;
   private static final abbbababa[] ba;
   private final ababbbbaa b;

   private static String ab(char var0, int var1, short var2, int var3, short var4, byte var5, int var6) {
      int var11 = var1 ^ -347081461;
      char[] var10 = bb[var11].toCharArray();
      StackTraceElement[] var12 = (StackTraceElement[])aaa[var11];
      StackTraceElement[] var13;
      if (var12 != null) {
         var13 = var12;
      } else {
         var13 = new Throwable().getStackTrace();
         aaa[var11] = var13;
      }

      StackTraceElement var14 = var13[1];
      int var8 = (var14.getClassName().hashCode() ^ var14.getMethodName().hashCode()) >> 16 ^ 19136;

      for (int var9 = 0; var9 < var10.length; var9++) {
         var10[var9] = (char)(var10[var9] ^ switch (var9 % 30) {
            default -> 177;
            case 1 -> 109;
            case 2 -> 152;
            case 3 -> 55;
            case 4 -> 213;
            case 5 -> 123;
            case 6 -> 29;
            case 7 -> 57;
            case 8 -> 230;
            case 9 -> 138;
            case 10 -> 47;
            case 11 -> 173;
            case 12 -> 44;
            case 13 -> 232;
            case 14 -> 45;
            case 15 -> 32;
            case 16 -> 254;
            case 17 -> 163;
            case 18 -> 100;
            case 19 -> 143;
            case 20 -> 201;
            case 21 -> 207;
            case 22 -> 11;
            case 23 -> 65;
            case 24 -> 100;
            case 25 -> 21;
            case 26 -> 158;
            case 27 -> 221;
            case 28 -> 132;
            case 29 -> 178;
         } ^ var9 ^ var8 ^ var6 ^ var4 ^ var5 ^ var1 ^ var3 ^ var0 ^ var2);
      }

      return new String(var10).intern();
   }

   private abbbababa(ababbbbaa var3) {
      this.b = var3;
   }

   private static abbbababa[] b() {
      return new abbbababa[]{ab, aa};
   }

   public static abbbababa aa(String var0) {
      return Enum.valueOf(abbbababa.class, var0);
   }

   // $VF: Irreducible bytecode was duplicated to produce valid code
   static {
      int var17 = 628101409;
      int var11 = 0;
      int var10001 = "\u0012药칭苾\u0e3c菴칻藗\u0e66聞츪薬湬藟칳蝮긹菜\u2e6e\u0013쐦歰욧䬠쓝୭쏮䭲욇\u0b31샵⭳쌮⭯쌇謥쟽쭿슖".length();
      short var12 = 14358;
      String[] var9 = new String[2];
      int var10 = 0;
      int var8 = var10001;
      String var7 = "\u0012药칭苾\u0e3c菴칻藗\u0e66聞츪薬湬藟칳蝮긹菜\u2e6e\u0013쐦歰욧䬠쓝୭쏮䭲욇\u0b31샵⭳쌮⭯쌇謥쟽쭿슖";

      do {
         char var13 = var7.charAt(var11);
         var10001 = var11 + 1;
         int var15 = 0;
         char[] var14 = var7.substring(var10001, var10001 + var13).toCharArray();

         do {
            int var16 = var14[var15];

            var16 = (char)(switch (var15 % 6) {
               default -> 92;
               case 1 -> 117;
               case 2 -> 205;
               case 3 -> 37;
               case 4 -> 239;
               case 5 -> 99;
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

      bb = var9;
      aaa = new Object[var9.length];
      byte var21 = 0;
      int var25 = 0;
      a = new int[8];
      byte[] var10002 = "2z6Ë\u008c<#Iæ]¼Îg0·\u008fó\tNüÝ>ª3ÀEC²¬aê\u0015".getBytes("ISO-8859-1");

      int var58;
      do {
         a[var21] = ((var10002[var25] & 255) << 24 | (var10002[var25 + 1] & 255) << 16 | (var10002[var25 + 2] & 255) << 8 | var10002[var25 + 3] & 255)
            ^ -1259455424;
         var21 += 1;
         var58 = var25 + 4;
         var25 += 4;
      } while (var58 < var10002.length);

      String[] var0 = new String[4];
      int var4 = 0;
      String var3;
      int var5 = (var3 = ab('ꠝ', -347081461, (short)-32177, -40296961, (short)-19864, (byte)14, 467171061)).length();
      int var2 = 5;
      int var19 = -1;

      label103:
      while (true) {
         String var22 = var3.substring(++var19, var19 + var2);
         var25 = (byte)-1;

         while (true) {
            label98: {
               char[] var30 = var22.toCharArray();
               var58 = var30.length;
               int var6 = 0;
               var45 = var30;
               var25 = var58;
               char[] var62;
               int var76;
               if (var58 <= 1) {
                  var62 = var30;
                  var76 = var6;
               } else {
                  var45 = var30;
                  var25 = var58;
                  if (var58 <= var6) {
                     break label98;
                  }

                  var62 = var30;
                  var76 = var6;
               }

               while (true) {
                  var62[var76] = (char)(var62[var76] ^ switch (var6 % a(163415924, var17 ^ -337639930)) {
                     case 0 -> a(163415927, var17 ^ -2122213030);
                     case 1 -> a(163415926, var17 ^ 15503926);
                     case 2 -> a(163415921, var17 ^ -1797952658);
                     case 3 -> 1;
                     case 4 -> a(163415920, var17 ^ -1159557243);
                     case 5 -> a(163415923, var17 ^ -1483119066);
                     default -> a(163415922, var17 ^ -876753050);
                  });
                  var6++;
                  if (var25 == 0) {
                     var76 = var25;
                     var62 = var45;
                  } else {
                     if (var25 <= var6) {
                        break;
                     }

                     var62 = var45;
                     var76 = var6;
                  }
               }
            }

            String var69 = new String(var45).intern();
            switch (var25) {
               case 0:
                  var0[var4++] = var69;
                  if ((var19 += var2) >= var5) {
                     ab = new abbbababa(aabbaaaba.aaab(var0[2]));
                     aa = new abbbababa(aabbaaaba.aaab(var0[1]));
                     ba = b();
                     return;
                  }

                  var2 = var3.charAt(var19);
                  break;
               default:
                  var0[var4++] = var69;
                  if ((var19 += var2) < var5) {
                     var2 = var3.charAt(var19);
                     continue label103;
                  }

                  var5 = (var3 = ab(2828, -347081462, 30733, -1217958345, 16842, (byte)-42, 1381923049)).length();
                  var2 = a(163415925, var17 ^ 1436947330);
                  var19 = -1;
            }

            var22 = var3.substring(++var19, var19 + var2);
            var25 = (byte)0;
         }
      }
   }

   @Override
   public String toString() {
      return this.b.abab();
   }

   private static int a(int var0, int var1) {
      int var2 = a[var0 ^ 163415925] ^ var1 ^ var0;
      var2 ^= 11011;
      var2 += 27790;
      var2 += 16454;
      var2 += 61239;
      var2 -= 21059;
      return var2 - 60954;
   }
}
