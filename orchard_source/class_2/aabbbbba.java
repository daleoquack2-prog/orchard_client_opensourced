package nsc;

import net.fabricmc.api.EnvType;
import net.fabricmc.api.Environment;

@Environment(EnvType.CLIENT)
public enum aabbbbba implements bbaabba {
   public static final aabbbbba aa;
   public static final aabbbbba ab;
   private static final String[] aba;
   private static final aabbbbba[] ba;
   private static final Object[] abb;
   private static final int[] a;
   public static final aabbbbba b;
   public static final aabbbbba bb;
   public static final aabbbbba aaa;
   private final ababbbbaa aab;

   private static int b(int var0, int var1) {
      int var2 = a[var0 ^ 2136976060] ^ var1 ^ var0;
      var2 ^= 61556;
      var2 -= 30772;
      var2 += 17880;
      var2 += 62539;
      var2 ^= 39668;
      var2 -= 62060;
      return var2 + 26907;
   }

   // $VF: Irreducible bytecode was duplicated to produce valid code
   static {
      int var17 = 919769445;
      int var10001 = "Wꉢ쪕ꗂ誁ꛒઅꐢ⪗ꏚ⪞\ua632\uea89Ꝛ⪉Ꝛꪐꀂ\u0a92꓂⪍Ꚋ쪍ꖚ⪒ꉒ誐Ꜳઉꗊꪈꔺઔꏂકꕊ⪈ꟲ檆ꐚ誑ꋺ檚ꝺ쪆ꓢ⪀ꐚ誑ꋺ檚ꝺ쪆ꓢ쪀ꐒꪑꊊઙꜪꪇꑲ쪈ꔊઘꌲ䪓ꔺ⪍ꛢ檍ꕚ誐ꏒ쪕ꚲ䪇ꚢ檅ꖢ檘ꄒ䪐ꛪ\uea81\ua632⪋\ua7ea\u000f鳒䩮鮢䩿飲詸駂⩨鳒䩮鮢䩿飲詸駚"
         .length();
      short var12 = 7528;
      int var8 = var10001;
      int var10 = 0;
      String var7 = "Wꉢ쪕ꗂ誁ꛒઅꐢ⪗ꏚ⪞\ua632\uea89Ꝛ⪉Ꝛꪐꀂ\u0a92꓂⪍Ꚋ쪍ꖚ⪒ꉒ誐Ꜳઉꗊꪈꔺઔꏂકꕊ⪈ꟲ檆ꐚ誑ꋺ檚ꝺ쪆ꓢ⪀ꐚ誑ꋺ檚ꝺ쪆ꓢ쪀ꐒꪑꊊઙꜪꪇꑲ쪈ꔊઘꌲ䪓ꔺ⪍ꛢ檍ꕚ誐ꏒ쪕ꚲ䪇ꚢ檅ꖢ檘ꄒ䪐ꛪ\uea81\ua632⪋\ua7ea\u000f鳒䩮鮢䩿飲詸駂⩨鳒䩮鮢䩿飲詸駚";
      String[] var10000 = new String[2];
      int var11 = 0;
      String[] var9 = var10000;

      do {
         char var13 = var7.charAt(var11);
         var10001 = var11 + 1;
         int var10002 = var11 + 1 + var13;
         int var15 = 0;
         char[] var14 = var7.substring(var10001, var10002).toCharArray();

         do {
            char var16 = var14[var15];
            if (var15 % 2 == 0) {
               var14[var15] = (char)((var16 >>> 3 | var16 << '\r') & 65535 ^ var12);
            } else {
               var14[var15] = (char)((var16 << 3 | var16 >>> '\r') & 65535 ^ var12);
            }
         } while (++var15 < var14.length);

         var9[var10] = new String(var14);
         var10++;
         var11 = var11 + var13 + 1;
      } while (var11 < var8);

      aba = var9;
      abb = new Object[var9.length];
      a = new int[15];
      byte var20 = 0;
      int var24 = 0;
      byte[] var36 = "L# \u001e\u008dc¦>\u0013¶áÙPÆã\u0017Tò\u0014ºÞ\u0099×Ä\u001aJ Bi1\u001bR4¿Cô\u0017C¥È'¯Y\u009f×Îx\u009cõªöÂ,\u0001=¯0ç p"
         .getBytes("ISO-8859-1");

      int var58;
      do {
         a[var20] = ((var36[var24] & 255) << 24 | (var36[var24 + 1] & 255) << 16 | (var36[var24 + 2] & 255) << 8 | var36[var24 + 3] & 255) ^ -2032718514;
         var20 += 1;
         var58 = var24 + 4;
         var24 += 4;
      } while (var58 < var36.length);

      String[] var0 = new String[b(2136976060, var17 ^ 2089195325)];
      int var4 = 0;
      String var3;
      int var5 = (var3 = aa((short)-30021, -871781860, (byte)-32, (short)-16256)).length();
      int var2 = b(2136976061, var17 ^ -1111092890);
      int var19 = -1;

      label92:
      while (true) {
         String var21 = var3.substring(++var19, var19 + var2);
         var24 = (byte)-1;

         while (true) {
            label87: {
               char[] var29 = var21.toCharArray();
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
                     break label87;
                  }

                  var62 = var29;
                  var76 = var6;
               }

               while (true) {
                  var62[var76] = (char)(var62[var76] ^ switch (var6 % b(2136976063, var17 ^ 1617122378)) {
                     case 0 -> b(2136976056, var17 ^ 1683464967);
                     case 1 -> b(2136976057, var17 ^ -298033068);
                     case 2 -> b(2136976058, var17 ^ 720344859);
                     case 3 -> b(2136976059, var17 ^ 1502915839);
                     case 4 -> b(2136976052, var17 ^ 68875361);
                     case 5 -> b(2136976053, var17 ^ 669389488);
                     default -> b(2136976054, var17 ^ 386592312);
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
                     aaa = new aabbbbba(aabbaaaba.aaab(var0[0]));
                     ab = new aabbbbba(
                        aabbaaaba.aaab(var0[b(2136976048, var17 ^ -988855920)])
                     );
                     b = new aabbbbba(aabbaaaba.aaab(var0[1]));
                     bb = new aabbbbba(aabbaaaba.aaab(var0[2]));
                     aa = new aabbbbba(aabbaaaba.aaab(var0[b(2136976050, var17 ^ 4364073)]));
                     ba = a();
                     return;
                  }

                  var2 = var3.charAt(var19);
                  break;
               default:
                  var0[var4++] = var69;
                  if ((var19 += var2) < var5) {
                     var2 = var3.charAt(var19);
                     continue label92;
                  }

                  var5 = (var3 = aa(13490, -871781859, 104, (short)-30987)).length();
                  var2 = b(2136976062, var17 ^ 588469893);
                  var19 = -1;
            }

            var21 = var3.substring(++var19, var19 + var2);
            var24 = (byte)0;
         }
      }
   }

   private static String aa(short var0, int var1, byte var2, short var3) {
      int var8 = var1 ^ -871781860;
      char[] var7 = aba[var8].toCharArray();
      StackTraceElement[] var9 = (StackTraceElement[])abb[var8];
      StackTraceElement[] var10;
      if (var9 != null) {
         var10 = var9;
      } else {
         var10 = new Throwable().getStackTrace();
         abb[var8] = var10;
      }

      StackTraceElement var11 = var10[1];
      int var5 = (var11.getClassName().hashCode() ^ var11.getMethodName().hashCode()) >> 16 ^ 46692;

      for (int var6 = 0; var6 < var7.length; var6++) {
         var7[var6] = (char)(var7[var6] ^ switch (var6 % 8) {
            default -> 221;
            case 1 -> 5;
            case 2 -> 87;
            case 3 -> 183;
            case 4 -> 106;
            case 5 -> 199;
            case 6 -> 9;
            case 7 -> 62;
         } ^ 20036 ^ var1 ^ var5 ^ var2 ^ var0 ^ var3);
      }

      return new String(var7).intern();
   }

   private static aabbbbba[] a() {
      return new aabbbbba[]{aaa, ab, b, bb, aa};
   }

   @Override
   public String toString() {
      return this.aab.abab();
   }

   private aabbbbba(ababbbbaa var3) {
      this.aab = var3;
   }
}
