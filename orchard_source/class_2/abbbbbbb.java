package nsc;

import net.fabricmc.api.EnvType;
import net.fabricmc.api.Environment;

@Environment(EnvType.CLIENT)
public enum abbbbbbb {
   private static final int[] ab;
   public static final abbbbbbb b;
   private static final Object[] bb;
   private static final abbbbbbb[] aa;
   private static final String[] ba;
   public static final abbbbbbb a;

   private static int a(int var0, int var1) {
      int var2 = ab[var0 ^ -1141605701] ^ var1 ^ var0;
      var2 ^= 13491;
      var2 -= 61143;
      var2 += 47609;
      var2 ^= 54270;
      var2 -= 14699;
      return var2 + 49304;
   }

   // $VF: Irreducible bytecode was duplicated to produce valid code
   static {
      int var23 = -323694650;
      int var14 = "\f숷歏쁡\ueb66싛䭀씗ꭞ슁쭴옓\u0b5a".length();
      String[] var10001 = new String[1];
      int var16 = 0;
      String[] var15 = var10001;
      String var13 = "\f숷歏쁡\ueb66싛䭀씗ꭞ슁쭴옓\u0b5a";
      short var18 = 22515;
      int var17 = 0;

      do {
         char var19 = var13.charAt(var17);
         char[] var20 = var13.substring(var17 + 1, var17 + 1 + var19).toCharArray();
         int var21 = 0;

         do {
            int var22 = var20[var21];

            var22 = (char)(switch (var21 % 6) {
               default -> 125;
               case 1 -> 92;
               case 2 -> 163;
               case 3 -> 116;
               case 4 -> 81;
               case 5 -> 70;
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
      int var9 = 1133442931;
      byte[] var7 = "}}£©~V#\u001aV@f¸Ð\u0002Îkë_ÿY%\u001bW\"Ô¢¤\u0003öZ/^".getBytes("ISO-8859-1");
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
      int var5 = (var3 = ab(-294232122, var23 ^ 42724845)).length();
      char var2 = 4;
      int var1 = -1;

      while (true) {
         char[] var36;
         label85: {
            char[] var27 = var3.substring(++var1, var1 + var2).toCharArray();
            int var10003 = var27.length;
            int var6 = 0;
            var36 = var27;
            int var30 = var10003;
            char[] var43;
            int var10004;
            if (var10003 <= 1) {
               var43 = var27;
               var10004 = var6;
            } else {
               var36 = var27;
               var30 = var10003;
               if (var10003 <= var6) {
                  break label85;
               }

               var43 = var27;
               var10004 = var6;
            }

            while (true) {
               var43[var10004] = (char)(var43[var10004] ^ switch (var6 % a(-1141605701, var23 ^ -1773390570)) {
                  case 0 -> a(-1141605702, var23 ^ -1788376575);
                  case 1 -> a(-1141605703, var23 ^ -1116614766);
                  case 2 -> a(-1141605704, var23 ^ 993224557);
                  case 3 -> a(-1141605697, var23 ^ 7231052);
                  case 4 -> a(-1141605698, var23 ^ -836043244);
                  case 5 -> a(-1141605699, var23 ^ 1066601755);
                  default -> a(-1141605700, var23 ^ 493585920);
               });
               var6++;
               if (var30 == 0) {
                  var10004 = var30;
                  var43 = var36;
               } else {
                  if (var30 <= var6) {
                     break;
                  }

                  var43 = var36;
                  var10004 = var6;
               }
            }
         }

         String var50 = new String(var36).intern();
         byte var34 = -1;
         var0[var4++] = var50;
         if ((var1 += var2) >= var5) {
            a = new abbbbbbb();
            b = new abbbbbbb();
            aa = aa();
            return;
         }

         var2 = var3.charAt(var1);
      }
   }

   public static abbbbbbb b(String var0) {
      return Enum.valueOf(abbbbbbb.class, var0);
   }

   private static String ab(int var0, int var1) {
      int var3 = var0 ^ -294232122;
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
      int var7 = (var6.getClassName().hashCode() ^ var6.getMethodName().hashCode()) >> 16 ^ 750664652;
      int var8 = 0;

      do {
         var4[var8] = (char)(var4[var8] ^ switch (var8 & 31) {
            default -> 135;
            case 1 -> 72;
            case 2 -> 227;
            case 3 -> 105;
            case 4 -> 186;
            case 5 -> 232;
            case 6 -> 114;
            case 7 -> 231;
            case 8 -> 167;
            case 9 -> 213;
            case 10 -> 9;
            case 11 -> 123;
            case 12 -> 216;
            case 13 -> 167;
            case 14 -> 250;
            case 15 -> 222;
            case 16 -> 34;
            case 17 -> 112;
            case 18 -> 39;
            case 19 -> 212;
            case 20 -> 242;
            case 21 -> 39;
            case 22 -> 138;
            case 23 -> 78;
            case 24 -> 77;
            case 25 -> 127;
            case 26 -> 175;
            case 27 -> 42;
            case 28 -> 6;
            case 29 -> 41;
            case 30 -> 48;
            case 31 -> 114;
         } ^ var1 >> 16 ^ var7);
      } while (++var8 < var4.length);

      return new String(var4).intern();
   }

   private static abbbbbbb[] aa() {
      return new abbbbbbb[]{a, b};
   }
}
