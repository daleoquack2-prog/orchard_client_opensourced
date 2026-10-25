package nsc;

import net.fabricmc.api.EnvType;
import net.fabricmc.api.Environment;

@Environment(EnvType.CLIENT)
enum bababab {
   public static final bababab b;
   private static final Object[] aba;
   private static final bababab[] aa;
   private static final String[] aab;
   private static final int[] aaa;
   public static final bababab a;
   public static final bababab ab;
   public static final bababab ba;
   public static final bababab bb;

   private static bababab[] b() {
      return new bababab[]{ab, b, bb, ba, a};
   }

   // $VF: Irreducible bytecode was duplicated to produce valid code
   static {
      int var23 = -1432722096;
      int var17 = 0;
      int var14 = "$퍣ﴼ퍿㴱틫㴬튫봱폟봶퍓봮튃紫팋㴼퍧紣팛봽퍫紵툓㴶폏ﴷ팓봮틛㴫퍳봾퍿紵튧ﴩ\u0019搤虈搸䙅斬왜斜虂撈ف搨䙕搤虈搸䙅斬٘旘䙃撬虃搐ٞ旘".length();
      short var18 = 13031;
      int var16 = 0;
      String[] var15 = new String[2];
      String var13 = "$퍣ﴼ퍿㴱틫㴬튫봱폟봶퍓봮튃紫팋㴼퍧紣팛봽퍫紵툓㴶폏ﴷ팓봮틛㴫퍳봾퍿紵튧ﴩ\u0019搤虈搸䙅斬왜斜虂撈ف搨䙕搤虈搸䙅斬٘旘䙃撬虃搐ٞ旘";

      do {
         int var21 = 0;
         char var19 = var13.charAt(var17);
         char[] var20 = var13.substring(var17 + 1, var17 + 1 + var19).toCharArray();

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

      aab = var15;
      aba = new Object[var15.length];
      int var9 = 1684872169;
      byte[] var7 = "Ô¨\u000b\u009e\u0088Í\u001f¨\u0004ì{\u0083Ä_\u0012)ôV,¹ú5Ú²Ïz×(\u001fîáPÈ\u0088Ì²LU¿ð".getBytes("ISO-8859-1");
      int var8 = var7.length / 4;
      aaa = new int[var8];
      byte var10 = 0;
      int var11 = 0;

      do {
         int var12 = (var7[var10] & 255) << 24 | (var7[var10 + 1] & 255) << 16 | (var7[var10 + 2] & 255) << 8 | var7[var10 + 3] & 255;
         var12 ^= var9;
         aaa[var11] = var12;
         var10 += 4;
      } while (++var11 < var8);

      String[] var0 = new String[5];
      int var4 = 0;
      String var3;
      int var5 = (var3 = ab(16687, -241482435, (byte)80, '䐩')).length();
      int var2 = a(1831443145, var23 ^ 2004319506);
      int var25 = -1;

      label87:
      while (true) {
         String var10000 = var3.substring(++var25, var25 + var2);
         int var10001 = -1;

         while (true) {
            char[] var38;
            label82: {
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
                     break label82;
                  }

                  var46 = var29;
                  var10004 = var6;
               }

               while (true) {
                  var46[var10004] = (char)(var46[var10004] ^ switch (var6 % a(1831443147, var23 ^ -1489826901)) {
                     case 0 -> a(1831443146, var23 ^ 1736467667);
                     case 1 -> a(1831443149, var23 ^ 1468619355);
                     case 2 -> a(1831443148, var23 ^ 1508551749);
                     case 3 -> a(1831443151, var23 ^ 1822794154);
                     case 4 -> a(1831443150, var23 ^ -1137602232);
                     case 5 -> a(1831443137, var23 ^ 1800912047);
                     default -> a(1831443136, var23 ^ -276115473);
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
                     ab = new bababab();
                     b = new bababab();
                     bb = new bababab();
                     ba = new bababab();
                     a = new bababab();
                     aa = b();
                     return;
                  }

                  var2 = var3.charAt(var25);
                  break;
               default:
                  var0[var4++] = var53;
                  if ((var25 += var2) < var5) {
                     var2 = var3.charAt(var25);
                     continue label87;
                  }

                  var5 = (var3 = ab(9692, -241482436, (byte)-20, '㊶')).length();
                  var2 = a(1831443144, var23 ^ 722626911);
                  var25 = -1;
            }

            var10000 = var3.substring(++var25, var25 + var2);
            var10001 = 0;
         }
      }
   }

   private static String ab(char var0, int var1, byte var2, char var3) {
      int var8 = var1 ^ -241482435;
      char[] var7 = aab[var8].toCharArray();
      StackTraceElement[] var9 = (StackTraceElement[])aba[var8];
      StackTraceElement[] var10;
      if (var9 != null) {
         var10 = var9;
      } else {
         var10 = new Throwable().getStackTrace();
         aba[var8] = var10;
      }

      StackTraceElement var11 = var10[1];
      int var5 = (var11.getClassName().hashCode() ^ var11.getMethodName().hashCode()) >> 16 ^ 59740;

      for (int var6 = 0; var6 < var7.length; var6++) {
         var7[var6] = (char)(var7[var6] ^ 21137 ^ var0 ^ var3 ^ var2 ^ var5 ^ var1);
      }

      return new String(var7).intern();
   }

   private static int a(int var0, int var1) {
      int var2 = aaa[var0 ^ 1831443145] ^ var1 ^ var0;
      var2 += 13187;
      var2 ^= 16574;
      var2 += 16501;
      var2 ^= 32935;
      var2 += 7900;
      var2 -= 50585;
      return var2 ^ 41157;
   }

   public static bababab aa(String var0) {
      return Enum.valueOf(bababab.class, var0);
   }
}
