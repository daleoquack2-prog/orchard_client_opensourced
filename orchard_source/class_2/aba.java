package nsc;

import net.fabricmc.api.EnvType;
import net.fabricmc.api.Environment;

@Environment(EnvType.CLIENT)
public enum aba {
   public static final aba aa;
   public static final aba ab;
   private static final Object[] aba;
   private final double ba;
   private static final String[] aab;
   private static final int[] b;
   private final ababbbbaa bb;
   private static final aba[] a;
   private final long aaa;

   public double aa() {
      return this.ba;
   }

   public long b() {
      return this.aaa;
   }

   @Override
   public String toString() {
      return this.bb.abab();
   }

   private static aba[] ab() {
      return new aba[]{aa, ab};
   }

   // $VF: Irreducible bytecode was duplicated to produce valid code
   static {
      int var25 = -1657864405;
      String[] var17 = new String[4];
      int var18 = 0;
      int var19 = 0;
      short var20 = 32169;
      int var16 = "\u0018懹\ue91a撩䥯揉ꥯ怉\ud963應饭漉॥慙\ud965惹ॡ潩䥡掉륯暉礚漉\ue964\u0016存졞볨⢲ꑸ좲Ꝙᢲ妸\uf8b2뉸衛寸\ue8a7ꐈ\uf85b눈顙夈梲寨롙\u0010\udc78壓흨\ua8c9쨨㣋훘\ud8d3\udc78壓흨\ua8c9쨨㣋훘磕\n꿥֯걅ꖥꐕᖤꔥ\ue5a4ꖥ斥"
         .length();
      String var15 = "\u0018懹\ue91a撩䥯揉ꥯ怉\ud963應饭漉॥慙\ud965惹ॡ潩䥡掉륯暉礚漉\ue964\u0016存졞볨⢲ꑸ좲Ꝙᢲ妸\uf8b2뉸衛寸\ue8a7ꐈ\uf85b눈顙夈梲寨롙\u0010\udc78壓흨\ua8c9쨨㣋훘\ud8d3\udc78壓흨\ua8c9쨨㣋훘磕\n꿥֯걅ꖥꐕᖤꔥ\ue5a4ꖥ斥";

      do {
         int var23 = 0;
         char var21 = var15.charAt(var19);
         char[] var22 = var15.substring(var19 + 1, var19 + 1 + var21).toCharArray();

         do {
            char var24 = var22[var23];
            if (var23 % 2 == 0) {
               var22[var23] = (char)((var24 >>> 4 | var24 << '\f') & 65535 ^ var20);
            } else {
               var22[var23] = (char)((var24 << 4 | var24 >>> '\f') & 65535 ^ var20);
            }
         } while (++var23 < var22.length);

         var17[var18] = new String(var22);
         var18++;
         var19 = var19 + var21 + 1;
      } while (var19 < var16);

      aab = var17;
      aba = new Object[var17.length];
      byte var10000 = 0;
      b = new int[19];
      int var10001 = 0;
      byte[] var10002 = "\u001b\u00ad\u0015FÊdgéÖ|ú=õ\u00878³\u0010\u009e\u009b¢&\u001a&ÛEçíÃ\u009a\tdQÒ\t¨Kòv+ÿG7Ù+t\u0019\r\u0001*.ÀX\u0095=\u008eàèúÍf-\u0002÷Éâéá^\u00870\u001b!\u0018\u0084×\u008f"
         .getBytes("ISO-8859-1");

      int var64;
      do {
         b[var10000] = (
               (var10002[var10001] & 255) << 24 | (var10002[var10001 + 1] & 255) << 16 | (var10002[var10001 + 2] & 255) << 8 | var10002[var10001 + 3] & 255
            )
            ^ -1694963304;
         var10000 += 1;
         var64 = var10001 + 4;
         var10001 += 4;
      } while (var64 < var10002.length);

      String[] var8 = new String[4];
      int var12 = 0;
      String var11;
      int var13 = (var11 = bb(21364, var25 ^ -1807167982, (short)'둞')).length();
      int var10 = a(1523215461, var25 ^ -1186002289);
      int var27 = -1;

      label102:
      while (true) {
         String var28 = var11.substring(++var27, var27 + var10);
         var10001 = (byte)-1;

         while (true) {
            label97: {
               char[] var34 = var28.toCharArray();
               var64 = var34.length;
               int var14 = 0;
               var51 = var34;
               var10001 = var64;
               char[] var68;
               int var83;
               if (var64 <= 1) {
                  var68 = var34;
                  var83 = var14;
               } else {
                  var51 = var34;
                  var10001 = var64;
                  if (var64 <= var14) {
                     break label97;
                  }

                  var68 = var34;
                  var83 = var14;
               }

               while (true) {
                  var68[var83] = (char)(var68[var83] ^ switch (var14 % a(1523215463, var25 ^ 1956570705)) {
                     case 0 -> a(1523215462, var25 ^ 1466244408);
                     case 1 -> a(1523215457, var25 ^ -1300462185);
                     case 2 -> a(1523215456, var25 ^ -2064121055);
                     case 3 -> a(1523215459, var25 ^ -419040280);
                     case 4 -> a(1523215458, var25 ^ 954956702);
                     case 5 -> a(1523215469, var25 ^ 1894495855);
                     default -> a(1523215468, var25 ^ 1351890028);
                  });
                  var14++;
                  if (var10001 == 0) {
                     var83 = var10001;
                     var68 = var51;
                  } else {
                     if (var10001 <= var14) {
                        break;
                     }

                     var68 = var51;
                     var83 = var14;
                  }
               }
            }

            String var75 = new String(var51).intern();
            switch (var10001) {
               case 0:
                  var8[var12++] = var75;
                  if ((var27 += var10) >= var13) {
                     long var1 = 2773295452743414942L;
                     long[] var0 = new long[2];
                     int var4 = 0;
                     String var5;
                     int var6 = (var5 = bb(21366, var25 ^ 1739165099, (short)26241)).length();
                     byte var3 = 0;

                     do {
                        int var41 = var3;
                        var3 += 8;
                        byte[] var7 = var5.substring(var41, var3).getBytes(bb(21367, var25 ^ 1802088119, (short)3881));
                        var41 = var4++;
                        long var84 = (
                              (var7[0] & 255L) << a(1523215471, var25 ^ -438974800)
                                 | (var7[1] & 255L) << a(1523215470, var25 ^ -688188637)
                                 | (var7[2] & 255L) << a(1523215465, var25 ^ -1999839339)
                                 | (var7[3] & 255L) << a(1523215464, var25 ^ 937398580)
                                 | (var7[4] & 255L) << a(1523215467, var25 ^ 1243140953)
                                 | (var7[5] & 255L) << a(1523215466, var25 ^ -1881085937)
                                 | (var7[a(1523215477, var25 ^ 1074527533)] & 255L) << a(1523215476, var25 ^ 634521425)
                                 | var7[a(1523215479, var25 ^ -1167668237)] & 255L
                           )
                           ^ var1;
                        byte var76 = -1;
                        var0[var41] = var84;
                     } while (var3 < var6);

                     aa = new aba(aabbaaaba.aaab(var8[3]), var0[0], 2.0);
                     ab = new aba(aabbaaaba.aaab(var8[0]), var0[1], 2.0);
                     a = ab();
                     return;
                  }

                  var10 = var11.charAt(var27);
                  break;
               default:
                  var8[var12++] = var75;
                  if ((var27 += var10) < var13) {
                     var10 = var11.charAt(var27);
                     continue label102;
                  }

                  var13 = (var11 = bb(21365, var25 ^ 22985023, (short)13748)).length();
                  var10 = a(1523215460, var25 ^ 1753643908);
                  var27 = -1;
            }

            var28 = var11.substring(++var27, var27 + var10);
            var10001 = (byte)0;
         }
      }
   }

   private aba(ababbbbaa var3, long var4, double var6) {
      this.bb = var3;
      this.aaa = var4;
      this.ba = var6;
   }

   private static int a(int var0, int var1) {
      int var2 = b[var0 ^ 1523215461] ^ var1 ^ var0;
      var2 -= 6887;
      var2 ^= 42122;
      var2 ^= 14250;
      var2 -= 53559;
      var2 += 23279;
      var2 ^= 56081;
      var2 += 61380;
      return var2 + 22155;
   }

   private static String bb(int var0, int var1, short var2) {
      int var3 = var0 ^ 21364;
      char[] var4 = aab[var3].toCharArray();
      StackTraceElement[] var5 = (StackTraceElement[])aba[var3];
      StackTraceElement[] var6;
      if (var5 != null) {
         var6 = var5;
      } else {
         var6 = new Throwable().getStackTrace();
         aba[var3] = var6;
      }

      StackTraceElement var7 = var6[1];
      int var8 = (var7.getClassName().hashCode() ^ var7.getMethodName().hashCode()) >> 16 ^ 24674;
      int var9 = 0;

      do {
         int var10 = var4[var9] - 3033;
         var10 -= 19429;
         var10 -= 50835;
         var10 ^= 11571;
         var10 += 60827;
         var10 -= 19649;
         var4[var9] = (char)(var10 ^ var8 ^ var2 ^ var1 >> 16);
      } while (++var9 < var4.length);

      return new String(var4).intern();
   }

   public static aba ba(String var0) {
      return Enum.valueOf(aba.class, var0);
   }
}
