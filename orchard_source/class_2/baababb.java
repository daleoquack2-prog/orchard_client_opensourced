package nsc;

import net.fabricmc.api.EnvType;
import net.fabricmc.api.Environment;

@Environment(EnvType.CLIENT)
public enum baababb {
   public static final baababb aa;
   public static final baababb ab;
   private static final String[] aab;
   public static final baababb ba;
   private static final int[] b;
   private static final Object[] aba;
   public static final baababb bb;
   private final ababbbbaa aaa;
   private static final baababb[] a;

   public String aa() {
      return this.aaa.abab();
   }

   public ababbbbaa a() {
      return this.aaa;
   }

   // $VF: Irreducible bytecode was duplicated to produce valid code
   static {
      int var23 = -490206065;
      short var18 = 17461;
      int var17 = 0;
      int var10001 = "@웅ꚪ쇷蛤쎯⚅쐔욲쏊䚵슀ꚽ쏡陕웵ꚭ앇훢쎿뚀운隳슺䚳쏐ھ씑ِ엕\uf6ad쟷뛤싿皂실ڵ쟪ꚰ쑀ڽ싁뙓쎥隮솇웥웿ᚄ읔隱썺횰쟐\ue6be쀱虒쁵ꚨ섷ᛣ얏ꚅ쁤횳\u0014ᔬｹጎ缰ᙖὖᒝ罡ቓ佤ჩ彬ᛨ羁ኌｹᙾ弱Ꮖ뽑".length();
      String[] var15 = new String[2];
      int var14 = var10001;
      String var13 = "@웅ꚪ쇷蛤쎯⚅쐔욲쏊䚵슀ꚽ쏡陕웵ꚭ앇훢쎿뚀운隳슺䚳쏐ھ씑ِ엕\uf6ad쟷뛤싿皂실ڵ쟪ꚰ쑀ڽ싁뙓쎥隮솇웥웿ᚄ읔隱썺횰쟐\ue6be쀱虒쁵ꚨ섷ᛣ얏ꚅ쁤횳\u0014ᔬｹጎ缰ᙖὖᒝ罡ቓ佤ჩ彬ᛨ羁ኌｹᙾ弱Ꮖ뽑";
      int var16 = 0;

      do {
         char var19 = var13.charAt(var17);
         var10001 = var17 + 1;
         int var10002 = var17 + 1;
         int var21 = 0;
         char[] var20 = var13.substring(var10001, var10002 + var19).toCharArray();

         do {
            int var22 = var20[var21];

            var22 = (char)(switch (var21 % 7) {
               default -> 115;
               case 1 -> 108;
               case 2 -> 113;
               case 3 -> 38;
               case 4 -> 121;
               case 5 -> 71;
               case 6 -> 146;
            }) ^ var22;
            if (var21 % 2 == 0) {
               var20[var21] = (char)((var22 >>> 4 | var22 << 12) & 65535 ^ var18);
            } else {
               var20[var21] = (char)((var22 << 4 | var22 >>> 12) & 65535 ^ var18);
            }
         } while (++var21 < var20.length);

         var15[var16] = new String(var20);
         var16++;
         var17 = var17 + var19 + 1;
      } while (var17 < var14);

      aab = var15;
      aba = new Object[var15.length];
      int var9 = -1443608915;
      byte[] var7 = "|þpb\u001a£SÝ\u0016uj6«\tïÇ\u0099Jo\u008fÈ\u0092Øm÷(\u0095ÿ0wGç\u009eÍ\u007fnJ@\u001ev\u0001³ù\u008eìÔf8".getBytes("ISO-8859-1");
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

      String[] var0 = new String[ab(-1353321972, var23 ^ -1734891725)];
      int var4 = 0;
      String var3;
      int var5 = (var3 = ba(-2059719556, -847512431, (byte)-70)).length();
      int var2 = 5;
      int var25 = -1;

      label100:
      while (true) {
         String var28 = var3.substring(++var25, var25 + var2);
         int var31 = -1;

         while (true) {
            char[] var43;
            label95: {
               char[] var33 = var28.toCharArray();
               int var10003 = var33.length;
               int var6 = 0;
               var43 = var33;
               var31 = var10003;
               char[] var51;
               int var10004;
               if (var10003 <= 1) {
                  var51 = var33;
                  var10004 = var6;
               } else {
                  var43 = var33;
                  var31 = var10003;
                  if (var10003 <= var6) {
                     break label95;
                  }

                  var51 = var33;
                  var10004 = var6;
               }

               while (true) {
                  var51[var10004] = (char)(var51[var10004] ^ switch (var6 % ab(-1353321970, var23 ^ -232997530)) {
                     case 0 -> ab(-1353321969, var23 ^ 1331706009);
                     case 1 -> ab(-1353321976, var23 ^ 2099493083);
                     case 2 -> ab(-1353321975, var23 ^ 754650690);
                     case 3 -> ab(-1353321974, var23 ^ 323043453);
                     case 4 -> ab(-1353321973, var23 ^ -736194033);
                     case 5 -> ab(-1353321980, var23 ^ 2057611308);
                     default -> ab(-1353321979, var23 ^ -1372992624);
                  });
                  var6++;
                  if (var31 == 0) {
                     var10004 = var31;
                     var51 = var43;
                  } else {
                     if (var31 <= var6) {
                        break;
                     }

                     var51 = var43;
                     var10004 = var6;
                  }
               }
            }

            String var58 = new String(var43).intern();
            switch (var31) {
               case 0:
                  var0[var4++] = var58;
                  if ((var25 += var2) >= var5) {
                     ab = new baababb(
                        aabbaaaba.aaab(var0[ab(-1353321977, var23 ^ 146649440)])
                     );
                     bb = new baababb(aabbaaaba.aaab(var0[3]));
                     aa = new baababb(aabbaaaba.aaab(var0[1]));
                     ba = new baababb(aabbaaaba.aaab(var0[4]));
                     a = b();
                     return;
                  }

                  var2 = var3.charAt(var25);
                  break;
               default:
                  var0[var4++] = var58;
                  if ((var25 += var2) < var5) {
                     var2 = var3.charAt(var25);
                     continue label100;
                  }

                  var5 = (var3 = ba(-91836096, -847512432, (byte)-51)).length();
                  var2 = ab(-1353321971, var23 ^ -20282239);
                  var25 = -1;
            }

            var28 = var3.substring(++var25, var25 + var2);
            var31 = 0;
         }
      }
   }

   private static String ba(int var0, int var1, byte var2) {
      int var7 = var1 ^ -847512431;
      char[] var6 = aab[var7].toCharArray();
      StackTraceElement[] var8 = (StackTraceElement[])aba[var7];
      StackTraceElement[] var9;
      if (var8 != null) {
         var9 = var8;
      } else {
         var9 = new Throwable().getStackTrace();
         aba[var7] = var9;
      }

      StackTraceElement var10 = var9[1];
      int var4 = (var10.getClassName().hashCode() ^ var10.getMethodName().hashCode()) >> 16 ^ 37285;
      int var5 = 0;

      do {
         var6[var5] = (char)(var6[var5] ^ var5 ^ 43818 ^ var1 ^ var2 ^ var0 ^ var4);
      } while (++var5 < var6.length);

      return new String(var6).intern();
   }

   private static int ab(int var0, int var1) {
      int var2 = b[var0 ^ -1353321972] ^ var1 ^ var0;
      var2 += 48687;
      var2 += 1808;
      var2 -= 40153;
      var2 ^= 53561;
      var2 += 14541;
      var2 -= 27028;
      return var2 - 5645;
   }

   private baababb(ababbbbaa var3) {
      this.aaa = var3;
   }

   private static baababb[] b() {
      return new baababb[]{ab, bb, aa, ba};
   }
}
