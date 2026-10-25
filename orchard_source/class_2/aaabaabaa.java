package nsc;

import net.fabricmc.api.EnvType;
import net.fabricmc.api.Environment;

@Environment(EnvType.CLIENT)
public enum aaabaabaa {
   private static final Object[] aab;
   private static final aaabaabaa[] b;
   public static final aaabaabaa a;
   public static final aaabaabaa aa;
   public static final aaabaabaa ab;
   private static final int[] bb;
   private static final String[] aaa;
   public static final aaabaabaa ba;

   private static int a(int var0, int var1) {
      int var2 = bb[var0 ^ 727134436] ^ var1 ^ var0;
      var2 += 16691;
      var2 ^= 28642;
      var2 -= 30772;
      var2 += 9807;
      var2 += 44627;
      var2 -= 36488;
      var2 ^= 45470;
      var2 ^= 8274;
      var2 ^= 38382;
      return var2 + 56103;
   }

   private static String ab(int var0, int var1) {
      int var3 = var0 ^ 1735175226;
      char[] var4 = aaa[var3].toCharArray();
      StackTraceElement[] var2 = (StackTraceElement[])aab[var3];
      StackTraceElement[] var5;
      if (var2 != null) {
         var5 = var2;
      } else {
         var5 = new Throwable().getStackTrace();
         aab[var3] = var5;
      }

      StackTraceElement var6 = var5[1];
      int var7 = (var6.getClassName().hashCode() ^ var6.getMethodName().hashCode()) >> 16 ^ -2113232258;
      int var8 = 0;

      do {
         var4[var8] = (char)(var4[var8] ^ switch (var8 & 31) {
            default -> 242;
            case 1 -> 144;
            case 2 -> 206;
            case 3 -> 24;
            case 4 -> 144;
            case 5 -> 7;
            case 6 -> 119;
            case 7 -> 7;
            case 8 -> 85;
            case 9 -> 79;
            case 10 -> 15;
            case 11 -> 195;
            case 12 -> 243;
            case 13 -> 204;
            case 14 -> 243;
            case 15 -> 190;
            case 16 -> 68;
            case 17 -> 167;
            case 18 -> 40;
            case 19 -> 138;
            case 20 -> 38;
            case 21 -> 237;
            case 22 -> 171;
            case 23 -> 166;
            case 24 -> 131;
            case 25 -> 58;
            case 26 -> 87;
            case 27 -> 63;
            case 28 -> 110;
            case 29 -> 80;
            case 30 -> 31;
            case 31 -> 105;
         } ^ var1 >> 16 ^ var7);
      } while (++var8 < var4.length);

      return new String(var4).intern();
   }

   // $VF: Irreducible bytecode was duplicated to produce valid code
   static {
      int var17 = -2126938239;
      short var12 = 16010;
      String[] var10002 = new String[2];
      int var11 = 0;
      String[] var9 = var10002;
      int var10 = 0;
      int var8 = " ꙝ驰ꝁ\u1a5fꟽ婊ꐩ\u1a5fꐉ婕ꖙ婨꜁ᩩ\ua639婬꒵᩻꒡\uda7bꔭ婱ꝙᩱꝕ\uda4aꓑ驗ꕩ驊ꗉᩋ\u001a壦ꖜ妖斴奲斡嫢斲嫒斸嬞▁姞\ue59c壆斔寒▝宾斄寒█夆▀太▿".length();
      String var7 = " ꙝ驰ꝁ\u1a5fꟽ婊ꐩ\u1a5fꐉ婕ꖙ婨꜁ᩩ\ua639婬꒵᩻꒡\uda7bꔭ婱ꝙᩱꝕ\uda4aꓑ驗ꕩ驊ꗉᩋ\u001a壦ꖜ妖斴奲斡嫢斲嫒斸嬞▁姞\ue59c壆斔寒▝宾斄寒█夆▀太▿";

      do {
         char var13 = var7.charAt(var11);
         String var10000 = var7.substring(var11 + 1, var11 + 1 + var13);
         int var15 = 0;
         char[] var14 = var10000.toCharArray();

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
      byte var20 = 0;
      int var10001 = 0;
      bb = new int[10];
      byte[] var34 = "\u008e¼>3íFÊ\u0089Ìîï]ðe«\\ç\u001eò{ùü¯)\u0087\u009e\u009bö\u0095\u009dò2ÓÊ×®+rSµ".getBytes("ISO-8859-1");

      int var56;
      do {
         bb[var20] = ((var34[var10001] & 255) << 24 | (var34[var10001 + 1] & 255) << 16 | (var34[var10001 + 2] & 255) << 8 | var34[var10001 + 3] & 255)
            ^ 803390945;
         var20 += 1;
         var56 = var10001 + 4;
         var10001 += 4;
      } while (var56 < var34.length);

      String[] var0 = new String[4];
      int var4 = 0;
      String var3;
      int var5 = (var3 = ab(1735175226, var17 ^ 331161902)).length();
      int var2 = a(727134436, var17 ^ -187805852);
      int var19 = -1;

      label92:
      while (true) {
         String var21 = var3.substring(++var19, var19 + var2);
         var10001 = (byte)-1;

         while (true) {
            label87: {
               char[] var27 = var21.toCharArray();
               var56 = var27.length;
               int var6 = 0;
               var43 = var27;
               var10001 = var56;
               char[] var60;
               int var74;
               if (var56 <= 1) {
                  var60 = var27;
                  var74 = var6;
               } else {
                  var43 = var27;
                  var10001 = var56;
                  if (var56 <= var6) {
                     break label87;
                  }

                  var60 = var27;
                  var74 = var6;
               }

               while (true) {
                  var60[var74] = (char)(var60[var74] ^ switch (var6 % a(727134438, var17 ^ -1231250992)) {
                     case 0 -> a(727134439, var17 ^ -1978148188);
                     case 1 -> a(727134432, var17 ^ -1653832926);
                     case 2 -> a(727134433, var17 ^ -2087789019);
                     case 3 -> a(727134434, var17 ^ -34805001);
                     case 4 -> a(727134435, var17 ^ -269515812);
                     case 5 -> a(727134444, var17 ^ -1447516541);
                     default -> a(727134445, var17 ^ 1358963423);
                  });
                  var6++;
                  if (var10001 == 0) {
                     var74 = var10001;
                     var60 = var43;
                  } else {
                     if (var10001 <= var6) {
                        break;
                     }

                     var60 = var43;
                     var74 = var6;
                  }
               }
            }

            String var67 = new String(var43).intern();
            switch (var10001) {
               case 0:
                  var0[var4++] = var67;
                  if ((var19 += var2) >= var5) {
                     a = new aaabaabaa();
                     ba = new aaabaabaa();
                     ab = new aaabaabaa();
                     aa = new aaabaabaa();
                     b = aa();
                     return;
                  }

                  var2 = var3.charAt(var19);
                  break;
               default:
                  var0[var4++] = var67;
                  if ((var19 += var2) < var5) {
                     var2 = var3.charAt(var19);
                     continue label92;
                  }

                  var5 = (var3 = ab(1735175227, var17 ^ -334401174)).length();
                  var2 = a(727134437, var17 ^ -1758151675);
                  var19 = -1;
            }

            var21 = var3.substring(++var19, var19 + var2);
            var10001 = (byte)0;
         }
      }
   }

   public static aaabaabaa b(String var0) {
      return Enum.valueOf(aaabaabaa.class, var0);
   }

   private static aaabaabaa[] aa() {
      return new aaabaabaa[]{a, ba, ab, aa};
   }
}
