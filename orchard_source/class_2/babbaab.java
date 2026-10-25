package nsc;

import net.fabricmc.api.EnvType;
import net.fabricmc.api.Environment;

@Environment(EnvType.CLIENT)
enum babbaab {
   public static final babbaab aa;
   private static final int[] aba;
   private final ababbbbaa ab;
   private static final Object[] baa;
   private static final String[] abb;
   public static final babbaab b;
   public static final babbaab ba;
   private final ababbbbaa bb;
   public static final babbaab a;
   public static final babbaab aaa;
   private static final babbaab[] aab;

   @Override
   public String toString() {
      return this.bb.abab();
   }

   private static String aa(byte var0, int var1, int var2, char var3, char var4, int var5) {
      int var10 = var2 ^ -1774494648;
      char[] var9 = abb[var10].toCharArray();
      StackTraceElement[] var11 = (StackTraceElement[])baa[var10];
      StackTraceElement[] var12;
      if (var11 != null) {
         var12 = var11;
      } else {
         var12 = new Throwable().getStackTrace();
         baa[var10] = var12;
      }

      StackTraceElement var13 = var12[1];
      int var7 = (var13.getClassName().hashCode() ^ var13.getMethodName().hashCode()) >> 16 ^ 31030;

      for (int var8 = 0; var8 < var9.length; var8++) {
         var9[var8] = (char)(var9[var8] ^ var8 ^ var4 ^ var0 ^ var2 ^ var3 ^ var7 ^ var1 ^ var5);
      }

      return new String(var9).intern();
   }

   // $VF: Irreducible bytecode was duplicated to produce valid code
   static {
      int var23 = -1119721073;
      short var18 = 9706;
      int var17 = 0;
      int var10001 = "éᲾ솾ᱼǼᴸ䇣ᶂ膠ᵘ쇾ᰜǭᱲ䆴\u1cfc䇯\u1c38쇼\u1cca솫ᷰ䇻᳸ǶᵮƮ᱐Ǿᰴǿ\u1c4a솻Აǿᷜ䇨ᶂƭ᳜臺ᷘ쇼ᱶƳ᳐臰ᶸǿ\u1cca솱᳄臵ᷔ쇶᷂䆦Შ臵ᶐǫ᷒䆩ᷜ쇾ᵌ쇮ᶮ䆢Ჸǹᵠ쇥ᷖ膼\u1c4cǪ᱐䇿\u1cfe膱ᴈǱᵤ䇮ᰆ솨\u1cfc臶\u1cbcǹ᳂ƶᴰ쇬ᶴ臮ᶲ膪ᰌǼᰌ臲ᶖƹᲄ쇫ᲄǽᰪ膨᷐臿᷸ǳᲒ膲ᰈ臨᳴쇼ᴊ䆢ᵠǳᴼ臤ᵺ솴ᾜ쇝Ấ쇒ἦƃḬǃḼ臙Ṻ䆚Ḱǃ\u1f58ǆẖ䆚Ṑ쇃Ṱ臀Ỻ솚ῄǙἼ䇆ῊƇᾰǎẔ臗Ớ膐ḸǇἤ臀Ἶ솆ὔ䇜ᾔǂἢƑẜ䇂Ẩ䇎ὒ䆋Ẁ쇛Ḭ䇚ṦƆỈ臊Ṡ쇋Ḷ膆Ṙ쇊Ổ䇙ᾦƙᾤ䇘\u1fdc臇ᾶ솗ῄ쇇ẜ䇆Ắ솊Ḱǝἔ쇆ᾚƞṠ䇏Ạ䇜Ḛ膗ἐ䇝ὄǇ\u1f5eƊḸ臇ὠ\u001dṅ놖ῧ\uf1dc\u1f17\uf1c5ᾕㆍὫ㇜ḗ\uf1dfṝ熒῟뇔ῧ㇑ά熎ḻ燂ẛ뇚ḽ놀ᾛ\uf1deệ"
         .length();
      String[] var15 = new String[2];
      int var14 = var10001;
      int var16 = 0;
      String var13 = "éᲾ솾ᱼǼᴸ䇣ᶂ膠ᵘ쇾ᰜǭᱲ䆴\u1cfc䇯\u1c38쇼\u1cca솫ᷰ䇻᳸ǶᵮƮ᱐Ǿᰴǿ\u1c4a솻Აǿᷜ䇨ᶂƭ᳜臺ᷘ쇼ᱶƳ᳐臰ᶸǿ\u1cca솱᳄臵ᷔ쇶᷂䆦Შ臵ᶐǫ᷒䆩ᷜ쇾ᵌ쇮ᶮ䆢Ჸǹᵠ쇥ᷖ膼\u1c4cǪ᱐䇿\u1cfe膱ᴈǱᵤ䇮ᰆ솨\u1cfc臶\u1cbcǹ᳂ƶᴰ쇬ᶴ臮ᶲ膪ᰌǼᰌ臲ᶖƹᲄ쇫ᲄǽᰪ膨᷐臿᷸ǳᲒ膲ᰈ臨᳴쇼ᴊ䆢ᵠǳᴼ臤ᵺ솴ᾜ쇝Ấ쇒ἦƃḬǃḼ臙Ṻ䆚Ḱǃ\u1f58ǆẖ䆚Ṑ쇃Ṱ臀Ỻ솚ῄǙἼ䇆ῊƇᾰǎẔ臗Ớ膐ḸǇἤ臀Ἶ솆ὔ䇜ᾔǂἢƑẜ䇂Ẩ䇎ὒ䆋Ẁ쇛Ḭ䇚ṦƆỈ臊Ṡ쇋Ḷ膆Ṙ쇊Ổ䇙ᾦƙᾤ䇘\u1fdc臇ᾶ솗ῄ쇇ẜ䇆Ắ솊Ḱǝἔ쇆ᾚƞṠ䇏Ạ䇜Ḛ膗ἐ䇝ὄǇ\u1f5eƊḸ臇ὠ\u001dṅ놖ῧ\uf1dc\u1f17\uf1c5ᾕㆍὫ㇜ḗ\uf1dfṝ熒῟뇔ῧ㇑ά熎ḻ燂ẛ뇚ḽ놀ᾛ\uf1deệ";

      do {
         char var19 = var13.charAt(var17);
         var10001 = var17 + 1;
         int var21 = 0;
         char[] var20 = var13.substring(var10001, var10001 + var19).toCharArray();

         do {
            int var22 = var20[var21];

            var22 = (char)(switch (var21 % 6) {
               default -> 174;
               case 1 -> 97;
               case 2 -> 84;
               case 3 -> 51;
               case 4 -> 76;
               case 5 -> 45;
            }) ^ var22;
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

      abb = var15;
      baa = new Object[var15.length];
      int var9 = 248436732;
      byte[] var7 = "êå\u0017©ø\u0085\u0090\u0000´Â\u001bt\u0094Éx\u009d\")\u009a¼CÐV\u0096:\u0013\u0097x;nCr5¹\u0096ô JÔÁ¥\bæ¨*\u008dÀ'\u0099Î}º§\u0089;¸cé\u001fë5ãEXØ\u0006=Næ^P`®\u0083<)"
         .getBytes("ISO-8859-1");
      int var8 = var7.length / 4;
      aba = new int[var8];
      byte var10 = 0;
      int var11 = 0;

      do {
         int var12 = (var7[var10] & 255) << 24 | (var7[var10 + 1] & 255) << 16 | (var7[var10 + 2] & 255) << 8 | var7[var10 + 3] & 255;
         var12 ^= var9;
         aba[var11] = var12;
         var10 += 4;
      } while (++var11 < var8);

      String[] var0 = new String[a(-1526198641, var23 ^ -60811695)];
      int var4 = 0;
      String var3;
      int var5 = (var3 = aa((byte)41, -1672443414, -1774494648, 'ꓑ', 'ㅈ', 1081615981)).length();
      int var2 = a(-1526198642, var23 ^ -301952524);
      int var25 = -1;

      label100:
      while (true) {
         String var28 = var3.substring(++var25, var25 + var2);
         int var31 = -1;

         while (true) {
            char[] var42;
            label95: {
               char[] var33 = var28.toCharArray();
               int var10003 = var33.length;
               int var6 = 0;
               var42 = var33;
               var31 = var10003;
               char[] var50;
               int var10004;
               if (var10003 <= 1) {
                  var50 = var33;
                  var10004 = var6;
               } else {
                  var42 = var33;
                  var31 = var10003;
                  if (var10003 <= var6) {
                     break label95;
                  }

                  var50 = var33;
                  var10004 = var6;
               }

               while (true) {
                  var50[var10004] = (char)(var50[var10004] ^ switch (var6 % a(-1526198644, var23 ^ -2108917394)) {
                     case 0 -> a(-1526198645, var23 ^ 883727016);
                     case 1 -> a(-1526198646, var23 ^ 1431653564);
                     case 2 -> a(-1526198647, var23 ^ 748066662);
                     case 3 -> a(-1526198648, var23 ^ 770392937);
                     case 4 -> a(-1526198649, var23 ^ 591173370);
                     case 5 -> 5;
                     default -> a(-1526198650, var23 ^ 919590296);
                  });
                  var6++;
                  if (var31 == 0) {
                     var10004 = var31;
                     var50 = var42;
                  } else {
                     if (var31 <= var6) {
                        break;
                     }

                     var50 = var42;
                     var10004 = var6;
                  }
               }
            }

            String var57 = new String(var42).intern();
            switch (var31) {
               case 0:
                  var0[var4++] = var57;
                  if ((var25 += var2) >= var5) {
                     b = new babbaab(
                        aabbaaaba.aaab(var0[4]),
                        aabbaaaba.aaab(var0[a(-1526198652, var23 ^ 1007206879)])
                     );
                     aaa = new babbaab(
                        aabbaaaba.aaab(var0[a(-1526198653, var23 ^ -1890878393)]),
                        aabbaaaba.aaab(var0[1])
                     );
                     a = new babbaab(
                        aabbaaaba.aaab(var0[3]),
                        aabbaaaba.aaab(var0[a(-1526198654, var23 ^ -1324598715)])
                     );
                     aa = new babbaab(
                        aabbaaaba.aaab(var0[a(-1526198655, var23 ^ 1970019867)]),
                        aabbaaaba.aaab(var0[a(-1526198656, var23 ^ 593904808)])
                     );
                     ba = new babbaab(
                        aabbaaaba.aaab(var0[a(-1526198626, var23 ^ -254062198)]),
                        aabbaaaba.aaab(var0[a(-1526198627, var23 ^ -1207550514)])
                     );
                     aab = b();
                     return;
                  }

                  var2 = var3.charAt(var25);
                  break;
               default:
                  var0[var4++] = var57;
                  if ((var25 += var2) < var5) {
                     var2 = var3.charAt(var25);
                     continue label100;
                  }

                  var5 = (var3 = aa(110, 1118280574, -1774494647, 'Ᏸ', '\ue90c', 102079303)).length();
                  var2 = a(-1526198643, var23 ^ -1572398229);
                  var25 = -1;
            }

            var28 = var3.substring(++var25, var25 + var2);
            var31 = 0;
         }
      }
   }

   private static babbaab[] b() {
      return new babbaab[]{b, aaa, a, aa, ba};
   }

   private static int a(int var0, int var1) {
      int var2 = aba[var0 ^ -1526198641] ^ var1 ^ var0;
      var2 += 3390;
      var2 -= 46999;
      var2 ^= 60579;
      var2 ^= 24824;
      var2 += 26465;
      var2 ^= 16539;
      var2 ^= 59366;
      var2 -= 55019;
      return var2 ^ 32334;
   }

   private babbaab(ababbbbaa var3, ababbbbaa var4) {
      this.bb = var3;
      this.ab = var4;
   }
}
