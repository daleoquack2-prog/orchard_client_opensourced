package nsc;

import net.fabricmc.api.EnvType;
import net.fabricmc.api.Environment;

@Environment(EnvType.CLIENT)
public enum aaabababb {
   private static final Object[] aaa;
   private final ababbbbaa aa;
   private static final String[] bb;
   private static final int[] ba;
   private static final aaabababb[] a;
   public static final aaabababb b;
   public static final aaabababb ab;

   private static aaabababb[] b() {
      return new aaabababb[]{b, ab};
   }

   @Override
   public String toString() {
      return this.aa.abab();
   }

   // $VF: Irreducible bytecode was duplicated to produce valid code
   static {
      int var17 = 1217312662;
      short var12 = 17896;
      int var10 = 0;
      int var8 = "%釳ᛪ靫\uf68e铮ᘲ郗\uf62c鞙혹逛뛫釳隇雞嘳铷㘲邩\uf637阫図鞛隁雾阩邧嘫隁㘫阻훸鐫嚜鄦\uf62a霧\u0010ᱦ怣⌶삭⍛ꀇᶲ䃿ᶄ\ue01e≆ꃚ⃖肪⊛怃".length();
      String var7 = "%釳ᛪ靫\uf68e铮ᘲ郗\uf62c鞙혹逛뛫釳隇雞嘳铷㘲邩\uf637阫図鞛隁雾阩邧嘫隁㘫阻훸鐫嚜鄦\uf62a霧\u0010ᱦ怣⌶삭⍛ꀇᶲ䃿ᶄ\ue01e≆ꃚ⃖肪⊛怃";
      int var11 = 0;
      String[] var9 = new String[2];

      do {
         char var13 = var7.charAt(var11);
         int var10001 = var11 + 1;
         int var10002 = var11 + 1 + var13;
         int var15 = 0;
         char[] var14 = var7.substring(var10001, var10002).toCharArray();

         do {
            int var16 = var14[var15];

            var16 = (char)(switch (var15 % 5) {
               default -> 118;
               case 1 -> 170;
               case 2 -> 118;
               case 3 -> 220;
               case 4 -> 107;
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
      int var24 = 0;
      ba = new int[10];
      byte[] var36 = ":\u0013\u0014ÄëåÉ\u0080¤ÇU\u0017Æ]g+l0\u0099V{\u0081.\u0093P\u0017ï:\u0086º#\f\u0006îr\u0080\u001cµÉå".getBytes("ISO-8859-1");

      int var58;
      do {
         ba[var21] = ((var36[var24] & 255) << 24 | (var36[var24 + 1] & 255) << 16 | (var36[var24 + 2] & 255) << 8 | var36[var24 + 3] & 255) ^ -29168837;
         var21 += 1;
         var58 = var24 + 4;
         var24 += 4;
      } while (var58 < var36.length);

      String[] var0 = new String[4];
      int var4 = 0;
      String var3;
      int var5 = (var3 = aa(var17 ^ 252507932, (short)14492, '茗')).length();
      int var2 = a(764244784, var17 ^ 1588444322);
      int var19 = -1;

      label101:
      while (true) {
         String var22 = var3.substring(++var19, var19 + var2);
         var24 = (byte)-1;

         while (true) {
            label96: {
               char[] var29 = var22.toCharArray();
               var58 = var29.length;
               int var6 = 0;
               var45 = var29;
               var24 = var58;
               char[] var62;
               int var76;
               if (var58 <= 1) {
                  var62 = var29;
                  var76 = var6;
               } else {
                  var45 = var29;
                  var24 = var58;
                  if (var58 <= var6) {
                     break label96;
                  }

                  var62 = var29;
                  var76 = var6;
               }

               while (true) {
                  var62[var76] = (char)(var62[var76] ^ switch (var6 % a(764244786, var17 ^ -1065749864)) {
                     case 0 -> a(764244787, var17 ^ -1562128597);
                     case 1 -> a(764244788, var17 ^ 143536415);
                     case 2 -> a(764244789, var17 ^ 524256981);
                     case 3 -> a(764244790, var17 ^ 883509014);
                     case 4 -> a(764244791, var17 ^ -503018652);
                     case 5 -> a(764244792, var17 ^ 1649465995);
                     default -> a(764244793, var17 ^ 2014011835);
                  });
                  var6++;
                  if (var24 == 0) {
                     var76 = var24;
                     var62 = var45;
                  } else {
                     if (var24 <= var6) {
                        break;
                     }

                     var62 = var45;
                     var76 = var6;
                  }
               }
            }

            String var69 = new String(var45).intern();
            switch (var24) {
               case 0:
                  var0[var4++] = var69;
                  if ((var19 += var2) >= var5) {
                     b = new aaabababb(aabbaaaba.aaab(var0[0]));
                     ab = new aaabababb(aabbaaaba.aaab(var0[1]));
                     a = b();
                     return;
                  }

                  var2 = var3.charAt(var19);
                  break;
               default:
                  var0[var4++] = var69;
                  if ((var19 += var2) < var5) {
                     var2 = var3.charAt(var19);
                     continue label101;
                  }

                  var5 = (var3 = aa(var17 ^ 255445706, (short)'褰', '茖')).length();
                  var2 = a(764244785, var17 ^ -1889833460);
                  var19 = -1;
            }

            var22 = var3.substring(++var19, var19 + var2);
            var24 = (byte)0;
         }
      }
   }

   private static String aa(int var0, short var1, char var2) {
      int var3 = var2 ^ '茗';
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
      int var8 = (var7.getClassName().hashCode() ^ var7.getMethodName().hashCode()) >> 16 ^ 27834;
      int var9 = 0;

      do {
         int var10 = var4[var9] ^ '퉏';
         var10 -= 56565;
         var10 += 24457;
         var10 += 31481;
         var10 -= 64825;
         var10 ^= 20760;
         var4[var9] = (char)(var10 ^ var8 ^ var1 ^ var0 >> 16);
      } while (++var9 < var4.length);

      return new String(var4).intern();
   }

   private static int a(int var0, int var1) {
      int var2 = ba[var0 ^ 764244784] ^ var1 ^ var0;
      var2 += 52463;
      var2 ^= 29783;
      var2 ^= 25105;
      var2 ^= 4852;
      var2 ^= 47433;
      return var2 - 59645;
   }

   private aaabababb(ababbbbaa var3) {
      this.aa = var3;
   }
}
