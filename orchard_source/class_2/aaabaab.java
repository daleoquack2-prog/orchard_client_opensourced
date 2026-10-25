package nsc;

import net.fabricmc.api.EnvType;
import net.fabricmc.api.Environment;

@Environment(EnvType.CLIENT)
enum aaabaab {
   private static final String[] bb;
   public static final aaabaab b;
   public static final aaabaab aa;
   private static final Object[] aaa;
   private static final aaabaab[] ab;
   private static final int[] ba;
   public static final aaabaab a;

   private static String aa(short var0, int var1, int var2) {
      int var3 = var2 ^ 60322;
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
      int var8 = (var7.getClassName().hashCode() ^ var7.getMethodName().hashCode()) >> 16 ^ 27926;
      int var9 = 0;

      do {
         int var10 = var4[var9] - 3203;
         var10 -= 35457;
         var10 -= 2710;
         var10 -= 325;
         var10 ^= 24333;
         var10 -= 3218;
         var10 += 18973;
         var10 += 15574;
         var4[var9] = (char)(var10 ^ var8 ^ var0 ^ var1 >> 16);
      } while (++var9 < var4.length);

      return new String(var4).intern();
   }

   private static int a(int var0, int var1) {
      int var2 = ba[var0 ^ 1199935037] ^ var1 ^ var0;
      var2 ^= 16611;
      var2 -= 23009;
      var2 += 15278;
      var2 ^= 20860;
      var2 -= 40771;
      var2 ^= 6148;
      var2 -= 47451;
      var2 ^= 24775;
      return var2 - 47684;
   }

   // $VF: Irreducible bytecode was duplicated to produce valid code
   static {
      int var23 = 1061851332;
      int var14 = "\u0015豺㺠耚暡蹺ả誺\udea3腚溠螚\ue6a2賚\ue6a0耚溡迺꺣襚욣膺".length();
      int var16 = 0;
      int var17 = 0;
      short var18 = 18248;
      String[] var15 = new String[1];
      String var13 = "\u0015豺㺠耚暡蹺ả誺\udea3腚溠螚\ue6a2賚\ue6a0耚溡迺꺣襚욣膺";

      do {
         char var19 = var13.charAt(var17);
         int var10001 = var17 + 1;
         int var10002 = var17 + 1;
         int var21 = 0;
         char[] var20 = var13.substring(var10001, var10002 + var19).toCharArray();

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
      int var9 = 1360603776;
      byte[] var7 = "!4qZËefÙÞJQ¾m\u0098\u0016À#gYömMÖ[{ª\u000661Ñäò=\u0096\u007fa".getBytes("ISO-8859-1");
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
      int var5 = (var3 = aa((short)29555, var23 ^ -129772212, 60322)).length();
      int var2 = a(1199935037, var23 ^ 148938054);
      int var1 = -1;

      while (true) {
         char[] var36;
         label74: {
            char[] var26 = var3.substring(++var1, var1 + var2).toCharArray();
            int var10003 = var26.length;
            int var6 = 0;
            var36 = var26;
            int var29 = var10003;
            char[] var43;
            int var10004;
            if (var10003 <= 1) {
               var43 = var26;
               var10004 = var6;
            } else {
               var36 = var26;
               var29 = var10003;
               if (var10003 <= var6) {
                  break label74;
               }

               var43 = var26;
               var10004 = var6;
            }

            while (true) {
               var43[var10004] = (char)(var43[var10004] ^ switch (var6 % a(1199935036, var23 ^ -491681073)) {
                  case 0 -> a(1199935039, var23 ^ -140591721);
                  case 1 -> a(1199935038, var23 ^ 1145895456);
                  case 2 -> a(1199935033, var23 ^ 179549676);
                  case 3 -> a(1199935032, var23 ^ 1150892700);
                  case 4 -> a(1199935035, var23 ^ 1384049159);
                  case 5 -> a(1199935034, var23 ^ 402983161);
                  default -> a(1199935029, var23 ^ 339907141);
               });
               var6++;
               if (var29 == 0) {
                  var10004 = var29;
                  var43 = var36;
               } else {
                  if (var29 <= var6) {
                     break;
                  }

                  var43 = var36;
                  var10004 = var6;
               }
            }
         }

         String var50 = new String(var36).intern();
         byte var33 = -1;
         var0[var4++] = var50;
         if ((var1 += var2) >= var5) {
            b = new aaabaab();
            a = new aaabaab();
            aa = new aaabaab();
            ab = b();
            return;
         }

         var2 = var3.charAt(var1);
      }
   }

   private static aaabaab[] b() {
      return new aaabaab[]{b, a, aa};
   }
}
