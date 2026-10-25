package nsc;

import net.fabricmc.api.EnvType;
import net.fabricmc.api.Environment;

@Environment(EnvType.CLIENT)
enum aabababaa {
   public static final aabababaa b;
   private static final aabababaa[] aa;
   private static final Object[] aaa;
   public static final aabababaa a;
   private static final int[] ba;
   public static final aabababaa ab;
   private static final String[] bb;

   private static int a(int var0, int var1) {
      int var2 = ba[var0 ^ 1801549547] ^ var1 ^ var0;
      var2 ^= 13017;
      var2 ^= 18682;
      var2 ^= 48644;
      var2 ^= 23146;
      var2 += 26396;
      var2 ^= 50228;
      var2 ^= 48401;
      var2 += 48298;
      return var2 + 28154;
   }

   // $VF: Irreducible bytecode was duplicated to produce valid code
   static {
      int var23 = -2084727559;
      short var18 = 25574;
      int var10001 = "\r흨쵹활쵸흸൫햴䵵힌䵵힀൛흈".length();
      int var16 = 0;
      int var17 = 0;
      String[] var15 = new String[1];
      int var14 = var10001;
      String var13 = "\r흨쵹활쵸흸൫햴䵵힌䵵힀൛흈";

      do {
         char var19 = var13.charAt(var17);
         var10001 = var17 + 1;
         int var10002 = var17 + 1 + var19;
         int var21 = 0;
         char[] var20 = var13.substring(var10001, var10002).toCharArray();

         do {
            char var22 = var20[var21];
            if (var21 % 2 == 0) {
               var20[var21] = (char)((var22 >>> 2 | var22 << 14) & 65535 ^ var18);
            } else {
               var20[var21] = (char)((var22 << 2 | var22 >>> 14) & 65535 ^ var18);
            }
         } while (++var21 < var20.length);

         var15[var16] = new String(var20);
         var16++;
         var17 = var17 + var19 + 1;
      } while (var17 < var14);

      bb = var15;
      aaa = new Object[var15.length];
      int var9 = 849579354;
      byte[] var7 = "}õO\u008bÏ\u000b\u001aÞ¬³3FÜ¼úO\u0094\f~xðã×8\u008a¼[X\u0001Pv\u0001".getBytes("ISO-8859-1");
      int var8 = var7.length / 4;
      ba = new int[var8];
      byte var10 = 0;
      int var11 = 0;

      do {
         int var12 = (var7[var10] & 255) << 24 | (var7[var10 + 1] & 255) << 16 | (var7[var10 + 2] & 255) << 8 | var7[var10 + 3] & 255;
         var12 ^= var9;
         ba[var11] = var12;
         var10 += 4;
      } while (++var11 < var8);

      String[] var0 = new String[3];
      int var4 = 0;
      String var3;
      int var5 = (var3 = aa(var23 ^ -768155943, 11869, '\uf206')).length();
      char var2 = 3;
      int var1 = -1;

      while (true) {
         char[] var37;
         label70: {
            char[] var27 = var3.substring(++var1, var1 + var2).toCharArray();
            int var10003 = var27.length;
            int var6 = 0;
            var37 = var27;
            var10001 = var10003;
            char[] var44;
            int var10004;
            if (var10003 <= 1) {
               var44 = var27;
               var10004 = var6;
            } else {
               var37 = var27;
               var10001 = var10003;
               if (var10003 <= var6) {
                  break label70;
               }

               var44 = var27;
               var10004 = var6;
            }

            while (true) {
               var44[var10004] = (char)(var44[var10004] ^ switch (var6 % a(1801549547, var23 ^ 1484061604)) {
                  case 0 -> a(1801549546, var23 ^ -360010119);
                  case 1 -> a(1801549545, var23 ^ -1993177124);
                  case 2 -> a(1801549544, var23 ^ -113422727);
                  case 3 -> a(1801549551, var23 ^ -1316107529);
                  case 4 -> a(1801549550, var23 ^ -714972344);
                  case 5 -> a(1801549549, var23 ^ -1354895589);
                  default -> a(1801549548, var23 ^ 617726572);
               });
               var6++;
               if (var10001 == 0) {
                  var10004 = var10001;
                  var44 = var37;
               } else {
                  if (var10001 <= var6) {
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
            ab = new aabababaa();
            a = new aabababaa();
            b = new aabababaa();
            aa = b();
            return;
         }

         var2 = var3.charAt(var1);
      }
   }

   private static aabababaa[] b() {
      return new aabababaa[]{ab, a, b};
   }

   private static String aa(int var0, int var1, char var2) {
      int var3 = var2 ^ '\uf206';
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
      int var8 = (var7.getClassName().hashCode() ^ var7.getMethodName().hashCode()) >> 16 ^ 21326;
      int var9 = 0;

      do {
         int var10 = var4[var9] ^ '诩';
         var10 ^= 7310;
         var10 ^= 18403;
         var10 ^= 20340;
         var10 += 18473;
         var10 -= 33979;
         var10 -= 31660;
         var10 -= 64377;
         var10 ^= 24545;
         var10 += 29780;
         var4[var9] = (char)(var10 ^ var8 ^ var1 ^ var0 >> 16);
      } while (++var9 < var4.length);

      return new String(var4).intern();
   }
}
