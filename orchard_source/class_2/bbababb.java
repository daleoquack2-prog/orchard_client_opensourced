package nsc;

import net.fabricmc.api.EnvType;
import net.fabricmc.api.Environment;

@Environment(EnvType.CLIENT)
public enum bbababb {
   private static final String[] bb;
   private static final int[] b;
   public static final bbababb aa;
   public static final bbababb ab;
   private final ababbbbaa ba;
   private static final Object[] aaa;
   private static final bbababb[] a;

   private static bbababb[] b() {
      return new bbababb[]{aa, ab};
   }

   private bbababb(ababbbbaa var3) {
      this.ba = var3;
   }

   private static int a(int var0, int var1) {
      int var2 = b[var0 ^ 1532559115] ^ var1 ^ var0;
      var2 ^= 14387;
      var2 -= 48223;
      var2 += 20893;
      var2 ^= 11850;
      var2 -= 17580;
      var2 -= 14007;
      var2 ^= 3938;
      var2 -= 18424;
      var2 -= 9981;
      return var2 - 40779;
   }

   // $VF: Irreducible bytecode was duplicated to produce valid code
   static {
      int var23 = 710164533;
      int var16 = 0;
      int var14 = "\u0012쟥煷옥㥶\ud825腷\uda85具숥셶\ud885녶쟥\ud971\udf25奰왥具\u0019宽坖娝㽑䏽⽑䛽ｖ嶝\ue756喽䝐䈽Ꝑ䄝꽐墽ݕ娽⽑䓝佐䌽䝐䏝".length();
      int var17 = 0;
      String var13 = "\u0012쟥煷옥㥶\ud825腷\uda85具숥셶\ud885녶쟥\ud971\udf25奰왥具\u0019宽坖娝㽑䏽⽑䛽ｖ嶝\ue756喽䝐䈽Ꝑ䄝꽐墽ݕ娽⽑䓝佐䌽䝐䏝";
      short var18 = 919;
      String[] var15 = new String[2];

      do {
         char var19 = var13.charAt(var17);
         int var21 = 0;
         char[] var20 = var13.substring(var17 + 1, var17 + 1 + var19).toCharArray();

         do {
            char var22 = var20[var21];
            if (var21 % 2 == 0) {
               var20[var21] = (char)((var22 >>> 5 | var22 << 11) & 65535 ^ var18);
            } else {
               var20[var21] = (char)((var22 << 5 | var22 >>> 11) & 65535 ^ var18);
            }
         } while (++var21 < var20.length);

         var15[var16] = new String(var20);
         var16++;
         var17 = var17 + var19 + 1;
      } while (var17 < var14);

      bb = var15;
      aaa = new Object[var15.length];
      int var9 = -1594483840;
      byte[] var7 = "\u001aÌã\u0081DÆv\u009ce{7%þ\u0011mf\bù\u008eG\u00862pJÊÿù¼¬\t\u001fÁ".getBytes("ISO-8859-1");
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
      int var5 = (var3 = aa(50973, 52167, var23 ^ 74211700)).length();
      int var2 = 5;
      int var25 = -1;

      label88:
      while (true) {
         String var10000 = var3.substring(++var25, var25 + var2);
         int var10001 = -1;

         while (true) {
            char[] var38;
            label83: {
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
                     break label83;
                  }

                  var46 = var29;
                  var10004 = var6;
               }

               while (true) {
                  var46[var10004] = (char)(var46[var10004] ^ switch (var6 % a(1532559114, var23 ^ -1791141996)) {
                     case 0 -> 1;
                     case 1 -> a(1532559113, var23 ^ -1266674138);
                     case 2 -> a(1532559112, var23 ^ 803884129);
                     case 3 -> a(1532559119, var23 ^ -654136077);
                     case 4 -> a(1532559118, var23 ^ 1472811274);
                     case 5 -> a(1532559117, var23 ^ 453303070);
                     default -> a(1532559116, var23 ^ 2113027442);
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
                     aa = new bbababb(aabbaaaba.aaab(var0[1]));
                     ab = new bbababb(aabbaaaba.aaab(var0[3]));
                     a = b();
                     return;
                  }

                  var2 = var3.charAt(var25);
                  break;
               default:
                  var0[var4++] = var53;
                  if ((var25 += var2) < var5) {
                     var2 = var3.charAt(var25);
                     continue label88;
                  }

                  var5 = (var3 = aa(57054, 52166, var23 ^ 1506241500)).length();
                  var2 = a(1532559115, var23 ^ -885538171);
                  var25 = -1;
            }

            var10000 = var3.substring(++var25, var25 + var2);
            var10001 = 0;
         }
      }
   }

   private static String aa(int var0, int var1, int var2) {
      int var3 = var1 ^ 52167;
      char[] var4 = bb[var3].toCharArray();
      StackTraceElement[] var5 = (StackTraceElement[])aaa[var3];
      StackTraceElement[] var6;
      if (var5 != null) {
         var6 = var5;
      } else {
         var6 = new Throwable().getStackTrace();
         aaa[var3] = var6;
      }

      StackTraceElement var7 = var6[1];
      int var8 = (var7.getClassName().hashCode() ^ var7.getMethodName().hashCode()) >> 16 ^ 12680;
      int var9 = 0;

      do {
         int var10 = var4[var9] + '鑑';
         var10 -= 29288;
         var10 -= 26294;
         var10 -= 360;
         var4[var9] = (char)(var10 ^ var8 ^ var0 ^ var2 >> 16);
      } while (++var9 < var4.length);

      return new String(var4).intern();
   }

   @Override
   public String toString() {
      return this.ba.abab();
   }
}
