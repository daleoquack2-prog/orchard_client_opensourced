package nsc;

import net.fabricmc.api.EnvType;
import net.fabricmc.api.Environment;

@Environment(EnvType.CLIENT)
public enum aaabababa implements bbaabba {
   public static final aaabababa aa;
   public static final aaabababa ab;
   public static final aaabababa ba;
   private static final int[] a;
   private static final String[] aaa;
   private static final Object[] aab;
   private static final aaabababa[] bb;
   private final ababbbbaa b;

   @Override
   public Enum ba() {
      // $VF: Couldn't be decompiled
      // Please report this to the Vineflower issue tracker, at https://github.com/Vineflower/vineflower/issues with a copy of the class file (if you have the rights to distribute it!)
      // java.lang.RuntimeException: parsing failure!
      //   at org.jetbrains.java.decompiler.modules.decompiler.decompose.DomHelper.parseGraph(DomHelper.java:211)
      //   at org.jetbrains.java.decompiler.main.rels.MethodProcessor.codeToJava(MethodProcessor.java:166)
      //
      // Bytecode:
      // 00: getstatic qeaa361f143ee4a0894bd168fd9b30c66/qf4ccf8f5435d4a78bdca4d6a018b578e/baaabbaa.bba I
      // 03: istore 1
      // 04: aload 0
      // 05: iload 1
      // 06: ifne 1a
      // 09: getstatic qeaa361f143ee4a0894bd168fd9b30c66/qf4ccf8f5435d4a78bdca4d6a018b578e/aaabababa.ba Lqeaa361f143ee4a0894bd168fd9b30c66/qf4ccf8f5435d4a78bdca4d6a018b578e/aaabababa;
      // 0c: if_acmpne 1d
      // 0f: goto 13
      // 12: athrow
      // 13: getstatic qeaa361f143ee4a0894bd168fd9b30c66/qf4ccf8f5435d4a78bdca4d6a018b578e/aaabababa.ab Lqeaa361f143ee4a0894bd168fd9b30c66/qf4ccf8f5435d4a78bdca4d6a018b578e/aaabababa;
      // 16: goto 1a
      // 19: athrow
      // 1a: goto 1e
      // 1d: aload 0
      // 1e: areturn
   }

   private aaabababa(ababbbbaa var3) {
      this.b = var3;
   }

   public static aaabababa b(String var0) {
      return Enum.valueOf(aaabababa.class, var0);
   }

   private static aaabababa[] a() {
      return new aaabababa[]{ba, ab, aa};
   }

   private static int aa(int var0, int var1) {
      int var2 = a[var0 ^ -2072788489] ^ var1 ^ var0;
      var2 += 50723;
      var2 ^= 30420;
      var2 -= 63071;
      var2 += 18294;
      var2 ^= 61125;
      return var2 ^ 35961;
   }

   private static String ab(char var0, int var1, int var2) {
      int var3 = var0 ^ 18918;
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
      int var8 = (var7.getClassName().hashCode() ^ var7.getMethodName().hashCode()) >> 16 ^ 21993;
      int var9 = 0;

      do {
         int var10 = var4[var9] + '襧';
         var10 ^= 28175;
         var10 -= 60759;
         var10 += 23686;
         var10 -= 44906;
         var10 ^= 46797;
         var10 -= 35787;
         var10 += 3853;
         var10 -= 43240;
         var10 -= 51632;
         var4[var9] = (char)(var10 ^ var8 ^ var1 ^ var2 >> 16);
      } while (++var9 < var4.length);

      return new String(var4).intern();
   }

   @Override
   public boolean bb() {
      try {
         if (this != ba) {
            return true;
         }
      } catch (MatchException var1) {
         throw var1;
      }

      return false;
   }

   // $VF: Irreducible bytecode was duplicated to produce valid code
   static {
      int var23 = -945825192;
      int var17 = 0;
      int var14 = "\u001f쨃ﳗ쳏볍쵣糗촳ﳗ촫㳊쪷볞쳿㳓쿗㳟촻㳓쿛糓춳糈쨓볇쵣糗쵇糊쳛糉쪷\u0015繭靬瞱\u177f繕ퟧ熝흱燕坻縹埤眭革縹霘瓥៣繑坻睅".length();
      String var13 = "\u001f쨃ﳗ쳏볍쵣糗촳ﳗ촫㳊쪷볞쳿㳓쿗㳟촻㳓쿛糓춳糈쨓볇쵣糗쵇糊쳛糉쪷\u0015繭靬瞱\u177f繕ퟧ熝흱燕坻縹埤眭革縹霘瓥៣繑坻睅";
      String[] var15 = new String[2];
      short var18 = 32359;
      int var16 = 0;

      do {
         char var19 = var13.charAt(var17);
         String var10000 = var13.substring(var17 + 1, var17 + 1 + var19);
         int var21 = 0;
         char[] var20 = var10000.toCharArray();

         do {
            char var22 = var20[var21];
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

      aaa = var15;
      aab = new Object[var15.length];
      int var9 = 441838303;
      byte[] var7 = "Hâèªj¶5\u009f ÔÚ¬j¹\u0012\u0003\u0095\u008a\u0081\f\u0080i~AXul\u0019CÃ\u0092Ðc\u001fÛý(ò\u0085 ".getBytes("ISO-8859-1");
      int var8 = var7.length / 4;
      a = new int[var8];
      byte var10 = 0;
      int var11 = 0;

      do {
         int var12 = (var7[var10] & 255) << 24 | (var7[var10 + 1] & 255) << 16 | (var7[var10 + 2] & 255) << 8 | var7[var10 + 3] & 255;
         var12 ^= var9;
         a[var11] = var12;
         var10 += 4;
      } while (++var11 < var8);

      String[] var0 = new String[aa(-2072788489, var23 ^ 291223694)];
      int var4 = 0;
      String var3;
      int var5 = (var3 = ab('䧦', 21884, var23 ^ 1059956773)).length();
      int var2 = 4;
      int var25 = -1;

      label89:
      while (true) {
         String var27 = var3.substring(++var25, var25 + var2);
         int var10001 = -1;

         while (true) {
            char[] var39;
            label84: {
               char[] var30 = var27.toCharArray();
               int var10003 = var30.length;
               int var6 = 0;
               var39 = var30;
               var10001 = var10003;
               char[] var47;
               int var10004;
               if (var10003 <= 1) {
                  var47 = var30;
                  var10004 = var6;
               } else {
                  var39 = var30;
                  var10001 = var10003;
                  if (var10003 <= var6) {
                     break label84;
                  }

                  var47 = var30;
                  var10004 = var6;
               }

               while (true) {
                  var47[var10004] = (char)(var47[var10004] ^ switch (var6 % aa(-2072788491, var23 ^ -110261613)) {
                     case 0 -> aa(-2072788492, var23 ^ 855654990);
                     case 1 -> aa(-2072788493, var23 ^ -869019284);
                     case 2 -> aa(-2072788494, var23 ^ -640667691);
                     case 3 -> aa(-2072788495, var23 ^ 30162316);
                     case 4 -> aa(-2072788496, var23 ^ 444252996);
                     case 5 -> aa(-2072788481, var23 ^ 983992936);
                     default -> aa(-2072788482, var23 ^ 1900795051);
                  });
                  var6++;
                  if (var10001 == 0) {
                     var10004 = var10001;
                     var47 = var39;
                  } else {
                     if (var10001 <= var6) {
                        break;
                     }

                     var47 = var39;
                     var10004 = var6;
                  }
               }
            }

            String var54 = new String(var39).intern();
            switch (var10001) {
               case 0:
                  var0[var4++] = var54;
                  if ((var25 += var2) >= var5) {
                     ba = new aaabababa(aabbaaaba.aaab(var0[4]));
                     ab = new aaabababa(aabbaaaba.aaab(var0[2]));
                     aa = new aaabababa(aabbaaaba.aaab(var0[5]));
                     bb = a();
                     return;
                  }

                  var2 = var3.charAt(var25);
                  break;
               default:
                  var0[var4++] = var54;
                  if ((var25 += var2) < var5) {
                     var2 = var3.charAt(var25);
                     continue label89;
                  }

                  var5 = (var3 = ab('䧧', 9178, var23 ^ -1838355349)).length();
                  var2 = aa(-2072788490, var23 ^ 856647112);
                  var25 = -1;
            }

            var27 = var3.substring(++var25, var25 + var2);
            var10001 = 0;
         }
      }
   }

   @Override
   public String toString() {
      return this.b.abab();
   }
}
