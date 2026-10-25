package nsc;

import net.fabricmc.api.EnvType;
import net.fabricmc.api.Environment;

@Environment(EnvType.CLIENT)
enum baaaaa {
   private static final Object[] aab;
   public static final baaaaa b;
   private static final String[] aaa;
   public static final baaaaa aa;
   private static final baaaaa[] ab;
   public static final baaaaa a;
   private static final int[] bb;
   public static final baaaaa ba;

   private static String ab(int var0, char var1, int var2) {
      int var3 = var0 ^ 11648;
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
      int var8 = (var7.getClassName().hashCode() ^ var7.getMethodName().hashCode()) >> 16 ^ 18566;
      int var9 = 0;

      do {
         int var10 = var4[var9] - 20558;
         var10 -= 50096;
         var10 -= 35119;
         var10 ^= 44997;
         var10 -= 53161;
         var10 += 25367;
         var10 -= 31869;
         var4[var9] = (char)(var10 ^ var8 ^ var1 ^ var2 >> 16);
      } while (++var9 < var4.length);

      return new String(var4).intern();
   }

   private static int a(int var0, int var1) {
      int var2 = bb[var0 ^ 1573653577] ^ var1 ^ var0;
      var2 ^= 53271;
      var2 ^= 2670;
      var2 ^= 7896;
      var2 += 3829;
      var2 ^= 13106;
      var2 += 29797;
      var2 += 23504;
      return var2 + 22822;
   }

   // $VF: Irreducible bytecode was duplicated to produce valid code
   static {
      int var17 = 1004400287;
      int var11 = 0;
      int var10001 = "\u0011郓뤤邯뤭鉏㤜鉏㤮鉃喇郗礤釻勞鋧뤦郓\u0011\ue4e2⹆\ue4e6⦨\ue432깅\ue412깇骢\ue9a8\ue442榾\ue4fa\ue9aa\ue442\ue9ab骚".length();
      int var10 = 0;
      int var8 = var10001;
      String var7 = "\u0011郓뤤邯뤭鉏㤜鉏㤮鉃喇郗礤釻勞鋧뤦郓\u0011\ue4e2⹆\ue4e6⦨\ue432깅\ue412깇骢\ue9a8\ue442榾\ue4fa\ue9aa\ue442\ue9ab骚";
      String[] var9 = new String[2];
      short var12 = 18714;

      do {
         char var13 = var7.charAt(var11);
         var10001 = var11 + 1;
         int var15 = 0;
         char[] var14 = var7.substring(var10001, var10001 + var13).toCharArray();

         do {
            char var16 = var14[var15];
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
      byte var10000 = 0;
      int var23 = 0;
      byte[] var10002 = "UýU<§ku¿\u0012¦®#V\u0010:\u00adPpþ\u0014%T1¼çC\u0005XI8\u0015\u0000$Ppf".getBytes("ISO-8859-1");
      bb = new int[9];

      int var56;
      do {
         bb[var10000] = ((var10002[var23] & 255) << 24 | (var10002[var23 + 1] & 255) << 16 | (var10002[var23 + 2] & 255) << 8 | var10002[var23 + 3] & 255)
            ^ 266473607;
         var10000 += 1;
         var56 = var23 + 4;
         var23 += 4;
      } while (var56 < var10002.length);

      String[] var0 = new String[4];
      int var4 = 0;
      String var3;
      int var5 = (var3 = ab(11648, '꺠', var17 ^ -1192777912)).length();
      int var2 = a(1573653577, var17 ^ -1007635096);
      int var19 = -1;

      label91:
      while (true) {
         String var20 = var3.substring(++var19, var19 + var2);
         var23 = (byte)-1;

         while (true) {
            label86: {
               char[] var28 = var20.toCharArray();
               var56 = var28.length;
               int var6 = 0;
               var43 = var28;
               var23 = var56;
               char[] var60;
               int var74;
               if (var56 <= 1) {
                  var60 = var28;
                  var74 = var6;
               } else {
                  var43 = var28;
                  var23 = var56;
                  if (var56 <= var6) {
                     break label86;
                  }

                  var60 = var28;
                  var74 = var6;
               }

               while (true) {
                  var60[var74] = (char)(var60[var74] ^ switch (var6 % a(1573653576, var17 ^ 828806631)) {
                     case 0 -> a(1573653579, var17 ^ -2069148187);
                     case 1 -> a(1573653578, var17 ^ -1071785284);
                     case 2 -> a(1573653581, var17 ^ -964878894);
                     case 3 -> a(1573653580, var17 ^ -1285959081);
                     case 4 -> a(1573653583, var17 ^ 1900995967);
                     case 5 -> a(1573653582, var17 ^ -550111974);
                     default -> a(1573653569, var17 ^ -1302490193);
                  });
                  var6++;
                  if (var23 == 0) {
                     var74 = var23;
                     var60 = var43;
                  } else {
                     if (var23 <= var6) {
                        break;
                     }

                     var60 = var43;
                     var74 = var6;
                  }
               }
            }

            String var67 = new String(var43).intern();
            switch (var23) {
               case 0:
                  var0[var4++] = var67;
                  if ((var19 += var2) >= var5) {
                     b = new baaaaa();
                     a = new baaaaa();
                     ba = new baaaaa();
                     aa = new baaaaa();
                     ab = aa();
                     return;
                  }

                  var2 = var3.charAt(var19);
                  break;
               default:
                  var0[var4++] = var67;
                  if ((var19 += var2) < var5) {
                     var2 = var3.charAt(var19);
                     continue label91;
                  }

                  var5 = (var3 = ab(11649, 'ᖿ', var17 ^ -1049048536)).length();
                  var2 = 5;
                  var19 = -1;
            }

            var20 = var3.substring(++var19, var19 + var2);
            var23 = (byte)0;
         }
      }
   }

   public static baaaaa b(String var0) {
      return Enum.valueOf(baaaaa.class, var0);
   }

   private static baaaaa[] aa() {
      return new baaaaa[]{b, a, ba, aa};
   }
}
