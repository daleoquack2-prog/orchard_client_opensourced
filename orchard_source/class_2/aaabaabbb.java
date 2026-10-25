package nsc;

import net.fabricmc.api.EnvType;
import net.fabricmc.api.Environment;

@Environment(EnvType.CLIENT)
public enum aaabaabbb {
   private static final String[] aaa;
   public static final aaabaabbb aa;
   private static final Object[] aab;
   private static final aaabaabbb[] ab;
   private static final int[] bb;
   private final ababbbbaa b;
   public static final aaabaabbb a;
   public static final aaabaabbb ba;

   @Override
   public String toString() {
      return this.b.abab();
   }

   // $VF: Irreducible bytecode was duplicated to produce valid code
   static {
      int var17 = -258152381;
      int var10 = 0;
      short var12 = 32688;
      String[] var10001 = new String[2];
      int var11 = 0;
      String[] var9 = var10001;
      int var8 = "(ϟ恡ϩ\ue0cdł\u202e͒\u2061®ꂳΘ悜d惏ﵠꁙ奄\ue0c3Ŏꀡκ忇ƞ悻°\ue09dǸ惾ϟ鿵́\ue0c0v\u202eþ恝.\ue087θ\ue080\u0012䖓\ue47f䔁ꓠ䞊\ue45b䖚\ue448䗦⓪䕨ⓐ䈄\ue4a4䈋␂䋵\ue49d"
         .length();
      String var7 = "(ϟ恡ϩ\ue0cdł\u202e͒\u2061®ꂳΘ悜d惏ﵠꁙ奄\ue0c3Ŏꀡκ忇ƞ悻°\ue09dǸ惾ϟ鿵́\ue0c0v\u202eþ恝.\ue087θ\ue080\u0012䖓\ue47f䔁ꓠ䞊\ue45b䖚\ue448䗦⓪䕨ⓐ䈄\ue4a4䈋␂䋵\ue49d";

      do {
         char var13 = var7.charAt(var11);
         int var24 = var11 + 1;
         int var10002 = var11 + 1 + var13;
         int var15 = 0;
         char[] var14 = var7.substring(var24, var10002).toCharArray();

         do {
            int var16 = var14[var15];

            var16 = (char)(switch (var15 % 7) {
               default -> 105;
               case 1 -> 88;
               case 2 -> 179;
               case 3 -> 198;
               case 4 -> 128;
               case 5 -> 42;
               case 6 -> 244;
            }) ^ var16;
            if (var15 % 2 == 0) {
               var14[var15] = (char)((var16 >>> 2 | var16 << 14) & 65535 ^ var12);
            } else {
               var14[var15] = (char)((var16 << 2 | var16 >>> 14) & 65535 ^ var12);
            }
         } while (++var15 < var14.length);

         var9[var10] = new String(var14);
         var10++;
         var11 = var11 + var13 + 1;
      } while (var11 < var8);

      aaa = var9;
      aab = new Object[var9.length];
      bb = new int[9];
      byte var21 = 0;
      byte var25 = 0;
      byte[] var37 = "\u0094K&W9®S\u0092Ç\u009e\u0083ÔN?+6\u009bD\u0083(î8\u0087BYëótD\u009crvÁÝ×\r".getBytes("ISO-8859-1");

      int var59;
      do {
         bb[var21] = ((var37[var25] & 255) << 24 | (var37[var25 + 1] & 255) << 16 | (var37[var25 + 2] & 255) << 8 | var37[var25 + 3] & 255) ^ 1891909657;
         var21 += 1;
         var59 = var25 + 4;
         var25 += 4;
      } while (var59 < var37.length);

      String[] var0 = new String[a(-97485939, var17 ^ -299691281)];
      int var4 = 0;
      String var3;
      int var5 = (var3 = aa('ᢟ', '\uf6f2', var17 ^ -704267084)).length();
      int var2 = a(-97485940, var17 ^ 1137075857);
      int var19 = -1;

      label102:
      while (true) {
         String var22 = var3.substring(++var19, var19 + var2);
         byte var28 = -1;

         while (true) {
            label97: {
               char[] var30 = var22.toCharArray();
               var59 = var30.length;
               int var6 = 0;
               var46 = var30;
               int var33 = var59;
               char[] var63;
               int var77;
               if (var59 <= 1) {
                  var63 = var30;
                  var77 = var6;
               } else {
                  var46 = var30;
                  var33 = var59;
                  if (var59 <= var6) {
                     break label97;
                  }

                  var63 = var30;
                  var77 = var6;
               }

               while (true) {
                  var63[var77] = (char)(var63[var77] ^ switch (var6 % a(-97485937, var17 ^ -1107904657)) {
                     case 0 -> 2;
                     case 1 -> a(-97485938, var17 ^ 878124730);
                     case 2 -> a(-97485943, var17 ^ -517163472);
                     case 3 -> a(-97485944, var17 ^ -1806650850);
                     case 4 -> a(-97485941, var17 ^ 595838685);
                     case 5 -> a(-97485942, var17 ^ 1056196369);
                     default -> a(-97485947, var17 ^ -1145705193);
                  });
                  var6++;
                  if (var33 == 0) {
                     var77 = var33;
                     var63 = var46;
                  } else {
                     if (var33 <= var6) {
                        break;
                     }

                     var63 = var46;
                     var77 = var6;
                  }
               }
            }

            String var70 = new String(var46).intern();
            switch (var28) {
               case 0:
                  var0[var4++] = var70;
                  if ((var19 += var2) >= var5) {
                     a = new aaabaabbb(aabbaaaba.aaab(var0[0]));
                     ba = new aaabaabbb(aabbaaaba.aaab(var0[3]));
                     aa = new aaabaabbb(aabbaaaba.aaab(var0[5]));
                     ab = b();
                     return;
                  }

                  var2 = var3.charAt(var19);
                  break;
               default:
                  var0[var4++] = var70;
                  if ((var19 += var2) < var5) {
                     var2 = var3.charAt(var19);
                     continue label102;
                  }

                  var5 = (var3 = aa('\ue9af', '\uf6f3', var17 ^ 764652066)).length();
                  var2 = 5;
                  var19 = -1;
            }

            var22 = var3.substring(++var19, var19 + var2);
            var28 = 0;
         }
      }
   }

   private static String aa(char var0, char var1, int var2) {
      int var3 = var1 ^ '\uf6f2';
      char[] var4 = aaa[var3].toCharArray();
      StackTraceElement[] var5 = (StackTraceElement[])aab[var3];
      StackTraceElement[] var6;
      if (var5 != null) {
         var6 = var5;
      } else {
         var6 = new Throwable().getStackTrace();
         aab[var3] = var6;
      }

      StackTraceElement var7 = var6[1];
      int var8 = (var7.getClassName().hashCode() ^ var7.getMethodName().hashCode()) >> 16 ^ 32194;
      int var9 = 0;

      do {
         int var10 = var4[var9] - '\udb4d';
         var10 ^= 518;
         var10 ^= 45380;
         var10 -= 7525;
         var10 -= 23316;
         var10 += 58390;
         var10 += 8700;
         var4[var9] = (char)(var10 ^ var8 ^ var0 ^ var2 >> 16);
      } while (++var9 < var4.length);

      return new String(var4).intern();
   }

   private static aaabaabbb[] b() {
      return new aaabaabbb[]{a, ba, aa};
   }

   private static int a(int var0, int var1) {
      int var2 = bb[var0 ^ -97485939] ^ var1 ^ var0;
      var2 -= 13304;
      var2 ^= 38455;
      var2 -= 44488;
      var2 ^= 10933;
      var2 -= 528;
      var2 ^= 38759;
      var2 -= 21904;
      var2 -= 14024;
      var2 += 49643;
      return var2 - 615;
   }

   private aaabaabbb(ababbbbaa var3) {
      this.b = var3;
   }
}
