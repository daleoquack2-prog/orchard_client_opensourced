package nsc;

import net.fabricmc.api.EnvType;
import net.fabricmc.api.Environment;

@Environment(EnvType.CLIENT)
public enum babbaaa {
   public static final babbaaa aa;
   private static final babbaaa[] ab;
   private static final Object[] aab;
   private static final int[] bb;
   private static final String[] aaa;
   private final ababbbbaa b;
   public static final babbaaa a;
   public static final babbaaa ba;

   private static int b(int var0, int var1) {
      int var2 = bb[var0 ^ 1424358995] ^ var1 ^ var0;
      var2 ^= 32501;
      var2 -= 30579;
      var2 += 28409;
      var2 += 62618;
      var2 ^= 17339;
      return var2 ^ 30348;
   }

   public ababbbbaa aa() {
      return this.b;
   }

   private babbaaa(ababbbbaa var3) {
      this.b = var3;
   }

   public static babbaaa ab(String var0) {
      return Enum.valueOf(babbaaa.class, var0);
   }

   @Override
   public String toString() {
      return this.b.abab();
   }

   // $VF: Irreducible bytecode was duplicated to produce valid code
   static {
      int var17 = -1298432637;
      int var8 = "=䐴焂䘄\uf10d䒌ㄊ䒬儃䛔\uf10d䑜ᄍ䝤ㄕ䏴儞䂬ㄊ䈴鄍䕜焜䑜\u3101䊌ᄀ䂔儛䝔턖䘔焏䛬儌䙄턄䜼儌䞔ᄆ䝜턅䚄\uf10b䙴鄜䎌ㄖ䏔鄆䁜ᄅ䒼\uf113䙄儌䈄ᄈ䇌ᄛ䙔\u001d䍶爛䉦餔䎞餗䌖亂䂖ᤑ䃎㤚䀾餎䛾뤃䝮\ud912䑦뤘䉮車䎾餜䔮뤜䝦夆䏶".length();
      short var12 = 16105;
      String[] var10001 = new String[2];
      int var11 = 0;
      String[] var9 = var10001;
      int var10 = 0;
      String var7 = "=䐴焂䘄\uf10d䒌ㄊ䒬儃䛔\uf10d䑜ᄍ䝤ㄕ䏴儞䂬ㄊ䈴鄍䕜焜䑜\u3101䊌ᄀ䂔儛䝔턖䘔焏䛬儌䙄턄䜼儌䞔ᄆ䝜턅䚄\uf10b䙴鄜䎌ㄖ䏔鄆䁜ᄅ䒼\uf113䙄儌䈄ᄈ䇌ᄛ䙔\u001d䍶爛䉦餔䎞餗䌖亂䂖ᤑ䃎㤚䀾餎䛾뤃䝮\ud912䑦뤘䉮車䎾餜䔮뤜䝦夆䏶";

      do {
         char var13 = var7.charAt(var11);
         int var22 = var11 + 1;
         int var10002 = var11 + 1;
         int var15 = 0;
         char[] var14 = var7.substring(var22, var10002 + var13).toCharArray();

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

      aaa = var9;
      aab = new Object[var9.length];
      byte var10000 = 0;
      byte var23 = 0;
      bb = new int[11];
      byte[] var35 = "\u00017\u0085X?e\u0081Pì ]ð\u000eøM\u0003¸ù£z²\u008dp¬5ÎãFVÃ\u0002M\u009aÜ\u0088\u009f\u0019\t\u0000åk+5ä".getBytes("ISO-8859-1");

      int var57;
      do {
         bb[var10000] = ((var35[var23] & 255) << 24 | (var35[var23 + 1] & 255) << 16 | (var35[var23 + 2] & 255) << 8 | var35[var23 + 3] & 255) ^ 627259638;
         var10000 += 1;
         var57 = var23 + 4;
         var23 += 4;
      } while (var57 < var35.length);

      String[] var0 = new String[b(1424358995, var17 ^ 1037371802)];
      int var4 = 0;
      String var3;
      int var5 = (var3 = ba(-162471238, var17 ^ -706001122)).length();
      int var2 = b(1424358994, var17 ^ 59182465);
      int var19 = -1;

      label92:
      while (true) {
         String var20 = var3.substring(++var19, var19 + var2);
         byte var26 = -1;

         while (true) {
            label87: {
               char[] var28 = var20.toCharArray();
               var57 = var28.length;
               int var6 = 0;
               var44 = var28;
               int var31 = var57;
               char[] var61;
               int var75;
               if (var57 <= 1) {
                  var61 = var28;
                  var75 = var6;
               } else {
                  var44 = var28;
                  var31 = var57;
                  if (var57 <= var6) {
                     break label87;
                  }

                  var61 = var28;
                  var75 = var6;
               }

               while (true) {
                  var61[var75] = (char)(var61[var75] ^ switch (var6 % b(1424358992, var17 ^ 840614339)) {
                     case 0 -> b(1424358999, var17 ^ -2078593460);
                     case 1 -> b(1424358998, var17 ^ -1905263528);
                     case 2 -> b(1424358997, var17 ^ 153907074);
                     case 3 -> b(1424358996, var17 ^ 1780584081);
                     case 4 -> b(1424359003, var17 ^ -1505885158);
                     case 5 -> b(1424359002, var17 ^ 636193803);
                     default -> b(1424359001, var17 ^ 1472837905);
                  });
                  var6++;
                  if (var31 == 0) {
                     var75 = var31;
                     var61 = var44;
                  } else {
                     if (var31 <= var6) {
                        break;
                     }

                     var61 = var44;
                     var75 = var6;
                  }
               }
            }

            String var68 = new String(var44).intern();
            switch (var26) {
               case 0:
                  var0[var4++] = var68;
                  if ((var19 += var2) >= var5) {
                     ba = new babbaaa(aabbaaaba.aaab(var0[4]));
                     aa = new babbaaa(aabbaaaba.aaab(var0[2]));
                     a = new babbaaa(aabbaaaba.aaab(var0[0]));
                     ab = a();
                     return;
                  }

                  var2 = var3.charAt(var19);
                  break;
               default:
                  var0[var4++] = var68;
                  if ((var19 += var2) < var5) {
                     var2 = var3.charAt(var19);
                     continue label92;
                  }

                  var5 = (var3 = ba(-162471237, var17 ^ -1795006991)).length();
                  var2 = b(1424358993, var17 ^ -800927454);
                  var19 = -1;
            }

            var20 = var3.substring(++var19, var19 + var2);
            var26 = 0;
         }
      }
   }

   private static String ba(int var0, int var1) {
      int var3 = var0 ^ -162471238;
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
      int var7 = (var6.getClassName().hashCode() ^ var6.getMethodName().hashCode()) >> 16 ^ 77589628;
      int var8 = 0;

      do {
         var4[var8] = (char)(var4[var8] ^ switch (var8 & 31) {
            default -> 196;
            case 1 -> 49;
            case 2 -> 192;
            case 3 -> 56;
            case 4 -> 154;
            case 5 -> 107;
            case 6 -> 154;
            case 7 -> 110;
            case 8 -> 225;
            case 9 -> 14;
            case 10 -> 247;
            case 11 -> 52;
            case 12 -> 196;
            case 13 -> 136;
            case 14 -> 6;
            case 15 -> 153;
            case 16 -> 118;
            case 17 -> 21;
            case 18 -> 119;
            case 19 -> 77;
            case 20 -> 129;
            case 21 -> 181;
            case 22 -> 144;
            case 23 -> 118;
            case 24 -> 42;
            case 25 -> 33;
            case 26 -> 14;
            case 27 -> 223;
            case 28 -> 223;
            case 29 -> 245;
            case 30 -> 253;
            case 31 -> 27;
         } ^ var1 >> 16 ^ var7);
      } while (++var8 < var4.length);

      return new String(var4).intern();
   }

   private static babbaaa[] a() {
      return new babbaaa[]{ba, aa, a};
   }
}
