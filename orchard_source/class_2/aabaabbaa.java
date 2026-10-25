package nsc;

import net.fabricmc.api.EnvType;
import net.fabricmc.api.Environment;

@Environment(EnvType.CLIENT)
enum aabaabbaa {
   private static final aabaabbaa[] b;
   public static final aabaabbaa a;
   private static final int[] aaa;
   private static final String[] aab;
   public static final aabaabbaa aa;
   public static final aabaabbaa ab;
   public static final aabaabbaa ba;
   private static final Object[] aba;
   public static final aabaabbaa bb;

   private static int a(int var0, int var1) {
      int var2 = aaa[var0 ^ 316330029] ^ var1 ^ var0;
      var2 += 8082;
      var2 ^= 48985;
      var2 ^= 22222;
      var2 += 4235;
      var2 -= 4074;
      return var2 ^ 60363;
   }

   public static aabaabbaa b(String var0) {
      return Enum.valueOf(aabaabbaa.class, var0);
   }

   private static String ab(int var0, short var1, byte var2, byte var3, short var4, char var5, int var6) {
      int var11 = var6 ^ -238756713;
      char[] var10 = aab[var11].toCharArray();
      StackTraceElement[] var12 = (StackTraceElement[])aba[var11];
      StackTraceElement[] var13;
      if (var12 != null) {
         var13 = var12;
      } else {
         var13 = new Throwable().getStackTrace();
         aba[var11] = var13;
      }

      StackTraceElement var14 = var13[1];
      int var8 = (var14.getClassName().hashCode() ^ var14.getMethodName().hashCode()) >> 16 ^ 4044;
      int var9 = 0;

      do {
         var10[var9] = (char)(var10[var9] ^ switch (var9 % 24) {
            default -> 70;
            case 1 -> 105;
            case 2 -> 74;
            case 3 -> 178;
            case 4 -> 142;
            case 5 -> 124;
            case 6 -> 211;
            case 7 -> 164;
            case 8 -> 217;
            case 9 -> 92;
            case 10 -> 180;
            case 11 -> 135;
            case 12 -> 185;
            case 13 -> 143;
            case 14 -> 169;
            case 15 -> 229;
            case 16 -> 214;
            case 17 -> 230;
            case 18 -> 112;
            case 19 -> 37;
            case 20 -> 107;
            case 21 -> 229;
            case 22 -> 68;
            case 23 -> 148;
         } ^ 3879 ^ var3 ^ var4 ^ var2 ^ var6 ^ var5 ^ var8 ^ var0 ^ var1);
      } while (++var9 < var10.length);

      return new String(var10).intern();
   }

   // $VF: Irreducible bytecode was duplicated to produce valid code
   static {
      int var23 = 1804714644;
      short var18 = 10294;
      int var16 = 0;
      int var14 = "(鷁ꈠ黡숃駢䈋顆⊒顮\ue27b駉ꈹ鮡∏鯢\ue211馾ꊜ鲦ɿ龉ꈱ鼙舁鳒䈊鱾⊟騆艸餡䈱駉숟馚숐颖슗鬦艡\u0018\ue067鯔\ue317鯷\ue44c믾\ue5a0魥\ue540鮍\ue7f7寉\ue48f㯰\ue5c4ᯬ\ue518孯\ue0c8箂\ue037ᯉ\ue0d7鯱"
         .length();
      String var13 = "(鷁ꈠ黡숃駢䈋顆⊒顮\ue27b駉ꈹ鮡∏鯢\ue211馾ꊜ鲦ɿ龉ꈱ鼙舁鳒䈊鱾⊟騆艸餡䈱駉숟馚숐颖슗鬦艡\u0018\ue067鯔\ue317鯷\ue44c믾\ue5a0魥\ue540鮍\ue7f7寉\ue48f㯰\ue5c4ᯬ\ue518孯\ue0c8箂\ue037ᯉ\ue0d7鯱";
      String[] var15 = new String[2];
      int var17 = 0;

      do {
         char var19 = var13.charAt(var17);
         int var21 = 0;
         char[] var20 = var13.substring(var17 + 1, var17 + 1 + var19).toCharArray();

         do {
            int var22 = var20[var21];

            var22 = (char)(switch (var21 % 5) {
               default -> 121;
               case 1 -> 86;
               case 2 -> 249;
               case 3 -> 110;
               case 4 -> 2;
            }) ^ var22;
            if (var21 % 2 == 0) {
               var20[var21] = (char)((var22 >>> 3 | var22 << 13) & 65535 ^ var18);
            } else {
               var20[var21] = (char)((var22 << 3 | var22 >>> 13) & 65535 ^ var18);
            }
         } while (++var21 < var20.length);

         var15[var16] = new String(var20);
         var16++;
         var17 = var17 + var19 + 1;
      } while (var17 < var14);

      aab = var15;
      aba = new Object[var15.length];
      int var9 = -1016040059;
      byte[] var7 = "îÝ\u0091ÅqÆëÍ\u00ad%©ÆÈÂÞþ\u008crK[RÄRôV3\u0005W\u0090¨\u0091l½Z[K".getBytes("ISO-8859-1");
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
      int var5 = (var3 = ab(-1554150906, (short)-7242, (byte)-111, (byte)-109, (short)27952, '燣', -238756713)).length();
      int var2 = a(316330029, var23 ^ -1424419364);
      int var25 = -1;

      label98:
      while (true) {
         String var28 = var3.substring(++var25, var25 + var2);
         int var10001 = -1;

         while (true) {
            char[] var40;
            label93: {
               char[] var31 = var28.toCharArray();
               int var10003 = var31.length;
               int var6 = 0;
               var40 = var31;
               var10001 = var10003;
               char[] var48;
               int var10004;
               if (var10003 <= 1) {
                  var48 = var31;
                  var10004 = var6;
               } else {
                  var40 = var31;
                  var10001 = var10003;
                  if (var10003 <= var6) {
                     break label93;
                  }

                  var48 = var31;
                  var10004 = var6;
               }

               while (true) {
                  var48[var10004] = (char)(var48[var10004] ^ switch (var6 % a(316330031, var23 ^ -387895854)) {
                     case 0 -> a(316330030, var23 ^ -1928963452);
                     case 1 -> a(316330025, var23 ^ -910766443);
                     case 2 -> a(316330024, var23 ^ 385930754);
                     case 3 -> a(316330027, var23 ^ 334987599);
                     case 4 -> a(316330026, var23 ^ -714336943);
                     case 5 -> a(316330021, var23 ^ -123805894);
                     default -> 2;
                  });
                  var6++;
                  if (var10001 == 0) {
                     var10004 = var10001;
                     var48 = var40;
                  } else {
                     if (var10001 <= var6) {
                        break;
                     }

                     var48 = var40;
                     var10004 = var6;
                  }
               }
            }

            String var55 = new String(var40).intern();
            switch (var10001) {
               case 0:
                  var0[var4++] = var55;
                  if ((var25 += var2) >= var5) {
                     ba = new aabaabbaa();
                     bb = new aabaabbaa();
                     a = new aabaabbaa();
                     ab = new aabaabbaa();
                     aa = new aabaabbaa();
                     b = aa();
                     return;
                  }

                  var2 = var3.charAt(var25);
                  break;
               default:
                  var0[var4++] = var55;
                  if ((var25 += var2) < var5) {
                     var2 = var3.charAt(var25);
                     continue label98;
                  }

                  var5 = (var3 = ab(1222427915, (short)-15894, (byte)-27, (byte)-106, 9714, (char)'鮸', -238756714)).length();
                  var2 = a(316330028, var23 ^ 872574932);
                  var25 = -1;
            }

            var28 = var3.substring(++var25, var25 + var2);
            var10001 = 0;
         }
      }
   }

   private static aabaabbaa[] aa() {
      return new aabaabbaa[]{ba, bb, a, ab, aa};
   }
}
