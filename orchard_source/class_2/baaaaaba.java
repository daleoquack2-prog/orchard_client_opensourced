package nsc;

import net.fabricmc.api.EnvType;
import net.fabricmc.api.Environment;

@Environment(EnvType.CLIENT)
enum baaaaaba {
   private final ababbbbaa aa;
   public static final baaaaaba a;
   private static final int[] b;
   public static final baaaaaba ab;
   private static final baaaaaba[] ba;
   private static final Object[] aaa;
   private static final String[] bb;

   private static String ab(int var0, int var1) {
      int var3 = var0 ^ -1285872801;
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
      int var7 = (var6.getClassName().hashCode() ^ var6.getMethodName().hashCode()) >> 16 ^ 1285125614;
      int var8 = 0;

      do {
         var4[var8] = (char)(var4[var8] ^ switch (var8 & 31) {
            default -> 242;
            case 1 -> 177;
            case 2 -> 248;
            case 3 -> 99;
            case 4 -> 44;
            case 5 -> 171;
            case 6 -> 80;
            case 7 -> 139;
            case 8 -> 100;
            case 9 -> 156;
            case 10 -> 43;
            case 11 -> 25;
            case 12 -> 10;
            case 13 -> 215;
            case 14 -> 108;
            case 15 -> 50;
            case 16 -> 254;
            case 17 -> 222;
            case 18 -> 128;
            case 19 -> 224;
            case 20 -> 77;
            case 21 -> 42;
            case 22 -> 21;
            case 23 -> 158;
            case 24 -> 148;
            case 25 -> 143;
            case 26 -> 235;
            case 27 -> 65;
            case 28 -> 3;
            case 29 -> 250;
            case 30 -> 182;
            case 31 -> 87;
         } ^ var1 >> 16 ^ var7);
      } while (++var8 < var4.length);

      return new String(var4).intern();
   }

   // $VF: Irreducible bytecode was duplicated to produce valid code
   static {
      int var23 = 1444105208;
      int var16 = 0;
      int var17 = 0;
      int var14 = "\f\u0e7c\udc09\u0e7c鰆ڜ對۬䰍Ŝ찊\f\uec03\f\uef8b篭\uea9b믧\ue44b\udbef\ue42b\udbe8\ue4cb믮\ue59b篦".length();
      short var18 = 17116;
      String var13 = "\f\u0e7c\udc09\u0e7c鰆ڜ對۬䰍Ŝ찊\f\uec03\f\uef8b篭\uea9b믧\ue44b\udbef\ue42b\udbe8\ue4cb믮\ue59b篦";
      String[] var15 = new String[2];

      do {
         int var21 = 0;
         char var19 = var13.charAt(var17);
         char[] var20 = var13.substring(var17 + 1, var17 + 1 + var19).toCharArray();

         do {
            char var22 = var20[var21];
            if (var21 % 2 == 0) {
               var20[var21] = (char)((var22 >>> 4 | var22 << '\f') & 65535 ^ var18);
            } else {
               var20[var21] = (char)((var22 << 4 | var22 >>> '\f') & 65535 ^ var18);
            }
         } while (++var21 < var20.length);

         var15[var16] = new String(var20);
         var16++;
         var17 = var17 + var19 + 1;
      } while (var17 < var14);

      bb = var15;
      aaa = new Object[var15.length];
      int var9 = 1043998862;
      byte[] var7 = "\u0004¿\u0088,kÐî\u009f&»\u0096·\u001d-bc#Ïç}M\u0096\u0090j\u009eÜÔÈô'¼\u0099\u009bìl¥".getBytes("ISO-8859-1");
      int var8 = var7.length / 4;
      b = new int[var8];
      byte var10 = 0;
      int var11 = 0;

      do {
         int var12 = (var7[var10] & 255) << 24 | (var7[var10 + 1] & 255) << 16 | (var7[var10 + 2] & 255) << 8 | var7[var10 + 3] & 255;
         var12 ^= var9;
         b[var11] = var12;
         var10 += 4;
      } while (++var11 < var8);

      String[] var0 = new String[4];
      int var4 = 0;
      String var3;
      int var5 = (var3 = ab(-1285872801, var23 ^ -1519104677)).length();
      int var2 = a(-1362983509, var23 ^ 1034617018);
      int var25 = -1;

      label90:
      while (true) {
         String var10000 = var3.substring(++var25, var25 + var2);
         int var10001 = -1;

         while (true) {
            char[] var38;
            label85: {
               char[] var29 = var10000.toCharArray();
               int var10003 = var29.length;
               int var6 = 0;
               var38 = var29;
               var10001 = var10003;
               char[] var46;
               int var10004;
               if (var10003 <= 1) {
                  var46 = var29;
                  var10004 = var6;
               } else {
                  var38 = var29;
                  var10001 = var10003;
                  if (var10003 <= var6) {
                     break label85;
                  }

                  var46 = var29;
                  var10004 = var6;
               }

               while (true) {
                  var46[var10004] = (char)(var46[var10004] ^ switch (var6 % a(-1362983511, var23 ^ 531570208)) {
                     case 0 -> a(-1362983512, var23 ^ 607775390);
                     case 1 -> a(-1362983505, var23 ^ 450588595);
                     case 2 -> a(-1362983506, var23 ^ 1954683050);
                     case 3 -> 2;
                     case 4 -> a(-1362983507, var23 ^ -1480041391);
                     case 5 -> a(-1362983508, var23 ^ -852281539);
                     default -> a(-1362983517, var23 ^ -1560746977);
                  });
                  var6++;
                  if (var10001 == 0) {
                     var10004 = var10001;
                     var46 = var38;
                  } else {
                     if (var10001 <= var6) {
                        break;
                     }

                     var46 = var38;
                     var10004 = var6;
                  }
               }
            }

            String var53 = new String(var38).intern();
            switch (var10001) {
               case 0:
                  var0[var4++] = var53;
                  if ((var25 += var2) >= var5) {
                     ab = new baaaaaba(aabbaaaba.aaab(var0[0]));
                     a = new baaaaaba(aabbaaaba.aaab(var0[2]));
                     ba = b();
                     return;
                  }

                  var2 = var3.charAt(var25);
                  break;
               default:
                  var0[var4++] = var53;
                  if ((var25 += var2) < var5) {
                     var2 = var3.charAt(var25);
                     continue label90;
                  }

                  var5 = (var3 = ab(-1285872802, var23 ^ -617779503)).length();
                  var2 = a(-1362983510, var23 ^ 1388602888);
                  var25 = -1;
            }

            var10000 = var3.substring(++var25, var25 + var2);
            var10001 = 0;
         }
      }
   }

   private static int a(int var0, int var1) {
      int var2 = b[var0 ^ -1362983509] ^ var1 ^ var0;
      var2 += 28418;
      var2 -= 60746;
      var2 += 61368;
      var2 ^= 36509;
      var2 += 37540;
      var2 ^= 40836;
      var2 += 64106;
      return var2 ^ 30384;
   }

   private static baaaaaba[] b() {
      return new baaaaaba[]{ab, a};
   }

   public static baaaaaba aa(String var0) {
      return Enum.valueOf(baaaaaba.class, var0);
   }

   private baaaaaba(ababbbbaa var3) {
      this.aa = var3;
   }

   @Override
   public String toString() {
      return this.aa.abab();
   }
}
