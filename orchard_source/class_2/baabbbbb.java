package nsc;

import net.fabricmc.api.EnvType;
import net.fabricmc.api.Environment;

@Environment(EnvType.CLIENT)
enum baabbbbb implements bbaabba {
   private final boolean aa;
   public static final baabbbbb b;
   public static final baabbbbb ab;
   private final ababbbbaa ba;
   private static final baabbbbb[] a;
   private static final Object[] aba;
   private static final String[] aab;
   private static final int[] aaa;
   public static final baabbbbb bb;

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
      // 06: ifne 18
      // 09: getstatic qeaa361f143ee4a0894bd168fd9b30c66/qf4ccf8f5435d4a78bdca4d6a018b578e/baabbbbb.bb Lqeaa361f143ee4a0894bd168fd9b30c66/qf4ccf8f5435d4a78bdca4d6a018b578e/baabbbbb;
      // 0c: if_acmpne 1b
      // 0f: goto 13
      // 12: athrow
      // 13: aload 0
      // 14: goto 18
      // 17: athrow
      // 18: goto 1e
      // 1b: getstatic qeaa361f143ee4a0894bd168fd9b30c66/qf4ccf8f5435d4a78bdca4d6a018b578e/baabbbbb.bb Lqeaa361f143ee4a0894bd168fd9b30c66/qf4ccf8f5435d4a78bdca4d6a018b578e/baabbbbb;
      // 1e: areturn
   }

   private static String ab(short var0, int var1, char var2) {
      int var3 = var2 ^ '꾄';
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
      int var8 = (var7.getClassName().hashCode() ^ var7.getMethodName().hashCode()) >> 16 ^ 27190;
      int var9 = 0;

      do {
         int var10 = var4[var9] - '\uf1d9';
         var10 += 15518;
         var10 += 58957;
         var10 ^= 38967;
         var10 += 19280;
         var10 += 63975;
         var10 ^= 42614;
         var10 += 5873;
         var4[var9] = (char)(var10 ^ var8 ^ var0 ^ var1 >> 16);
      } while (++var9 < var4.length);

      return new String(var4).intern();
   }

   private baabbbbb(ababbbbaa var3, boolean var4) {
      this.ba = var3;
      this.aa = var4;
   }

   @Override
   public boolean bb() {
      return this.aa;
   }

   private static int aa(int var0, int var1) {
      int var2 = aaa[var0 ^ -826018456] ^ var1 ^ var0;
      var2 += 26869;
      var2 += 25025;
      var2 += 59830;
      var2 ^= 63027;
      var2 ^= 15925;
      var2 ^= 38875;
      var2 -= 42706;
      var2 ^= 53028;
      var2 += 58635;
      return var2 - 18547;
   }

   // $VF: Irreducible bytecode was duplicated to produce valid code
   static {
      int var24 = -1032225717;
      char[] var15 = "☢☚".toCharArray();
      String var14 = "쬆찖쬫챃쬭쭃쭷쬞첁쯻찼쬴쬄쬌쬨챌쬊쭓쭤쬔쭕챃쬱챢쳏쬂쬧쮈쬰쳼쭡쬡쭏괛괓괳궁긎괩굥괥괶그괪꺗괋꺾괸긓긇꺓꺼긭괬긟괢굆꺤";
      short var13 = 9731;
      byte var20 = -1;
      String[] var16 = new String[var15.length];

      while (true) {
         int var17 = 0;
         int var18 = 0;
         int var19 = 0;
         if (var20 == 0) {
            aab = var16;
            aba = new Object[var16.length];
            int var9 = -35428515;
            byte[] var7 = "É\u0099\u0082è\u0006,àUJP>\u0087\u00890Á\u0080o\u0000\u0098\u001aE\u0091!\u0090(\u008eO_\u0081\u0080£®\u0010yª÷MútX\u0088\u008en "
               .getBytes("ISO-8859-1");
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

            String[] var0 = new String[aa(-826018456, var24 ^ -952224573)];
            int var4 = 0;
            String var3;
            int var5 = (var3 = ab((short)'ꐼ', var24 ^ 726233019, '꾄')).length();
            int var2 = aa(-826018455, var24 ^ 143349375);
            int var26 = -1;

            label99:
            while (true) {
               String var29 = var3.substring(++var26, var26 + var2);
               int var10001 = -1;

               while (true) {
                  char[] var41;
                  label94: {
                     char[] var32 = var29.toCharArray();
                     int var10003 = var32.length;
                     int var6 = 0;
                     var41 = var32;
                     var10001 = var10003;
                     char[] var49;
                     int var10004;
                     if (var10003 <= 1) {
                        var49 = var32;
                        var10004 = var6;
                     } else {
                        var41 = var32;
                        var10001 = var10003;
                        if (var10003 <= var6) {
                           break label94;
                        }

                        var49 = var32;
                        var10004 = var6;
                     }

                     while (true) {
                        var49[var10004] = (char)(var49[var10004] ^ switch (var6 % aa(-826018453, var24 ^ -2020116567)) {
                           case 0 -> aa(-826018452, var24 ^ 1638343122);
                           case 1 -> aa(-826018451, var24 ^ 1261868961);
                           case 2 -> aa(-826018450, var24 ^ 640284989);
                           case 3 -> aa(-826018449, var24 ^ -1893262801);
                           case 4 -> aa(-826018464, var24 ^ 517872788);
                           case 5 -> aa(-826018463, var24 ^ 1130220934);
                           default -> aa(-826018462, var24 ^ -2044077925);
                        });
                        var6++;
                        if (var10001 == 0) {
                           var10004 = var10001;
                           var49 = var41;
                        } else {
                           if (var10001 <= var6) {
                              break;
                           }

                           var49 = var41;
                           var10004 = var6;
                        }
                     }
                  }

                  String var56 = new String(var41).intern();
                  switch (var10001) {
                     case 0:
                        var0[var4++] = var56;
                        if ((var26 += var2) >= var5) {
                           bb = new baabbbbb(aabbaaaba.aaab(var0[4]));
                           ab = new baabbbbb(aabbaaaba.aaab(var0[5]), false);
                           b = new baabbbbb(aabbaaaba.aaab(var0[1]), false);
                           a = a();
                           return;
                        }

                        var2 = var3.charAt(var26);
                        break;
                     default:
                        var0[var4++] = var56;
                        if ((var26 += var2) < var5) {
                           var2 = var3.charAt(var26);
                           continue label99;
                        }

                        var5 = (var3 = ab((short)'馝', var24 ^ 1960054749, '꾅')).length();
                        var2 = aa(-826018454, var24 ^ 1157073000);
                        var26 = -1;
                  }

                  var29 = var3.substring(++var26, var26 + var2);
                  var10001 = 0;
               }
            }
         }

         do {
            var19 = var15[var17] ^ var13;
            char[] var21 = var14.substring(var18, var18 + var19).toCharArray();
            int var22 = 0;

            do {
               short var23 = switch (var22 % 6) {
                  default -> 180;
                  case 1 -> 201;
                  case 2 -> 250;
                  case 3 -> 58;
                  case 4 -> 227;
                  case 5 -> 135;
               };
               var21[var22] = (char)(var21[var22] ^ var23);
            } while (++var22 < var21.length);

            var16[var17] = new String(var21).intern();
            var18 += var19;
         } while (++var17 < var15.length);

         var20 = 0;
      }
   }

   private baabbbbb(ababbbbaa var3) {
      this(var3, true);
   }

   public static baabbbbb b(String var0) {
      return Enum.valueOf(baabbbbb.class, var0);
   }

   private static baabbbbb[] a() {
      return new baabbbbb[]{bb, ab, b};
   }

   @Override
   public String toString() {
      return this.ba.abab();
   }
}
