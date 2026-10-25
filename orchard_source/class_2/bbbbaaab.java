package nsc;

import net.fabricmc.api.EnvType;
import net.fabricmc.api.Environment;

@Environment(EnvType.CLIENT)
public enum bbbbaaab implements bbaabba {
   private static final bbbbaaab[] aa;
   private static final int[] baa;
   private static final long ab;
   public static final bbbbaaab ba;
   public static final bbbbaaab bb;
   public static final bbbbaaab aaa;
   public static final bbbbaaab aab;
   public static final bbbbaaab aba;
   private static final String[] bab;
   private final int abb;
   private static final Object[] bba;
   private final ababbbbaa b;
   public static final bbbbaaab a;

   private bbbbaaab(ababbbbaa var3, int var4) {
      this.b = var3;
      this.abb = var4;
   }

   private static bbbbaaab[] a() {
      bbbbaaab[] var10000 = new bbbbaaab[(int)ab];
      var10000[0] = aab;
      var10000[1] = ba;
      var10000[2] = bb;
      var10000[3] = a;
      var10000[4] = aaa;
      var10000[5] = aba;
      return var10000;
   }

   @Override
   public boolean bb() {
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
      // 09: getstatic qeaa361f143ee4a0894bd168fd9b30c66/qf4ccf8f5435d4a78bdca4d6a018b578e/bbbbaaab.aab Lqeaa361f143ee4a0894bd168fd9b30c66/qf4ccf8f5435d4a78bdca4d6a018b578e/bbbbaaab;
      // 0c: if_acmpeq 1e
      // 0f: goto 13
      // 12: athrow
      // 13: aload 0
      // 14: goto 18
      // 17: athrow
      // 18: getstatic qeaa361f143ee4a0894bd168fd9b30c66/qf4ccf8f5435d4a78bdca4d6a018b578e/bbbbaaab.aba Lqeaa361f143ee4a0894bd168fd9b30c66/qf4ccf8f5435d4a78bdca4d6a018b578e/bbbbaaab;
      // 1b: if_acmpne 23
      // 1e: bipush 1
      // 1f: goto 24
      // 22: athrow
      // 23: bipush 0
      // 24: ireturn
   }

   private static String ab(char var0, short var1, int var2) {
      int var3 = var0 ^ 18625;
      char[] var4 = bab[var3].toCharArray();
      StackTraceElement[] var5 = (StackTraceElement[])bba[var3];
      StackTraceElement[] var6;
      if (var5 != null) {
         var6 = var5;
      } else {
         var6 = new Throwable().getStackTrace();
         bba[var3] = var6;
      }

      StackTraceElement var7 = var6[1];
      int var8 = (var7.getClassName().hashCode() ^ var7.getMethodName().hashCode()) >> 16 ^ 12580;
      int var9 = 0;

      do {
         int var10 = var4[var9] + 31708;
         var10 -= 50575;
         var10 += 47708;
         var10 ^= 26405;
         var10 -= 29631;
         var10 += 35833;
         var10 -= 46270;
         var10 ^= 1339;
         var4[var9] = (char)(var10 ^ var8 ^ var1 ^ var2 >> 16);
      } while (++var9 < var4.length);

      return new String(var4).intern();
   }

   private static int aa(int var0, int var1) {
      int var2 = baa[var0 ^ 1300017688] ^ var1 ^ var0;
      var2 += 62989;
      var2 ^= 41230;
      var2 += 19861;
      var2 += 63627;
      var2 ^= 28824;
      return var2 ^ 5052;
   }

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
      // 09: invokevirtual qeaa361f143ee4a0894bd168fd9b30c66/qf4ccf8f5435d4a78bdca4d6a018b578e/bbbbaaab.bb ()Z
      // 0c: ifeq 1b
      // 0f: goto 13
      // 12: athrow
      // 13: aload 0
      // 14: goto 18
      // 17: athrow
      // 18: goto 1e
      // 1b: getstatic qeaa361f143ee4a0894bd168fd9b30c66/qf4ccf8f5435d4a78bdca4d6a018b578e/bbbbaaab.aba Lqeaa361f143ee4a0894bd168fd9b30c66/qf4ccf8f5435d4a78bdca4d6a018b578e/bbbbaaab;
      // 1e: areturn
   }

   public int b() {
      return this.abb;
   }

   // $VF: Irreducible bytecode was duplicated to produce valid code
   static {
      int var25 = 1678919752;
      int var10001 = "n礁㝌磗瞃磭睫眫\uf7ce祒\uf72e砿㞷熽㞆瞹띖碗㝾矙㝲眫\uf738磶뜱瞏睋碍㞀矑띓睳띮磡㝧睳㜵磞뜭礓\uf745礝㞊磱\uf74b睯\uf77b碁睪磳\uf734砾眬祫띉砉랝碁\uf74a磿\uf769砅瞞磋㜲眊럜祻㝈砕랊碁㞹礯㝾碁\uf76b磷\uf72b碖\uf730砓\uf740祡瞈矙\uf741礃띾矽띫秿㜺砶眠碏睄砽띲燥㝎矇㞍碍㝫秳㟃熚㜪矻띝\u0018漑\uf62f湓\uf60b湹똹濣뙜淦뙗漗\uf62d滽\uf6d9湙㘝漓똭湝\uf614海\uf659洒㙐"
         .length();
      int var19 = 0;
      String[] var17 = new String[2];
      int var16 = var10001;
      String var15 = "n礁㝌磗瞃磭睫眫\uf7ce祒\uf72e砿㞷熽㞆瞹띖碗㝾矙㝲眫\uf738磶뜱瞏睋碍㞀矑띓睳띮磡㝧睳㜵磞뜭礓\uf745礝㞊磱\uf74b睯\uf77b碁睪磳\uf734砾眬祫띉砉랝碁\uf74a磿\uf769砅瞞磋㜲眊럜祻㝈砕랊碁㞹礯㝾碁\uf76b磷\uf72b碖\uf730砓\uf740祡瞈矙\uf741礃띾矽띫秿㜺砶眠碏睄砽띲燥㝎矇㞍碍㝫秳㟃熚㜪矻띝\u0018漑\uf62f湓\uf60b湹똹濣뙜淦뙗漗\uf62d滽\uf6d9湙㘝漓똭湝\uf614海\uf659洒㙐";
      int var18 = 0;
      short var20 = 20520;

      do {
         int var23 = 0;
         char var21 = var15.charAt(var19);
         char[] var22 = var15.substring(var19 + 1, var19 + 1 + var21).toCharArray();

         do {
            int var24 = var22[var23];

            var24 = (char)(switch (var23 % 7) {
               default -> 178;
               case 1 -> 205;
               case 2 -> 168;
               case 3 -> 240;
               case 4 -> 198;
               case 5 -> 234;
               case 6 -> 4;
            }) ^ var24;
            if (var23 % 2 == 0) {
               var22[var23] = (char)((var24 >>> 2 | var24 << 14) & 65535 ^ var20);
            } else {
               var22[var23] = (char)((var24 << 2 | var24 >>> 14) & 65535 ^ var20);
            }
         } while (++var23 < var22.length);

         var17[var18] = new String(var22);
         var18++;
         var19 = var19 + var21 + 1;
      } while (var19 < var16);

      bab = var17;
      bba = new Object[var17.length];
      int var11 = 726072030;
      byte[] var9 = "C\u008bk?\u0091¥=\u0012\u0097\u001eC1¶ddQpvZfóì\u009f¸ûi±íù\t\u008eíßq-\u009d\u008d\u0094\u0095Ê\u007fÙ©1ioa®\bÈóïË\u0092\u0086ÖÎ¬H{£By`Áõé\u000f"
         .getBytes("ISO-8859-1");
      int var10 = var9.length / 4;
      baa = new int[var10];
      byte var12 = 0;
      int var13 = 0;

      do {
         int var14 = (var9[var12] & 255) << 24 | (var9[var12 + 1] & 255) << 16 | (var9[var12 + 2] & 255) << 8 | var9[var12 + 3] & 255;
         var14 ^= var11;
         baa[var13] = var14;
         var12 += 4;
      } while (++var13 < var10);

      String[] var2 = new String[aa(1300017688, var25 ^ -1101156792)];
      int var6 = 0;
      String var5;
      int var7 = (var5 = ab('䣁', (short)1107, var25 ^ -1685635702)).length();
      int var4 = aa(1300017689, var25 ^ 1819540381);
      int var27 = -1;

      label100:
      while (true) {
         String var30 = var5.substring(++var27, var27 + var4);
         int var32 = -1;

         while (true) {
            char[] var44;
            label95: {
               char[] var34 = var30.toCharArray();
               int var10003 = var34.length;
               int var8 = 0;
               var44 = var34;
               var32 = var10003;
               char[] var53;
               int var10004;
               if (var10003 <= 1) {
                  var53 = var34;
                  var10004 = var8;
               } else {
                  var44 = var34;
                  var32 = var10003;
                  if (var10003 <= var8) {
                     break label95;
                  }

                  var53 = var34;
                  var10004 = var8;
               }

               while (true) {
                  var53[var10004] = (char)(var53[var10004] ^ switch (var8 % aa(1300017691, var25 ^ 1269998300)) {
                     case 0 -> aa(1300017692, var25 ^ -1918853910);
                     case 1 -> aa(1300017693, var25 ^ 238704860);
                     case 2 -> aa(1300017694, var25 ^ 113210522);
                     case 3 -> aa(1300017695, var25 ^ 81741892);
                     case 4 -> aa(1300017680, var25 ^ 581430003);
                     case 5 -> aa(1300017681, var25 ^ 1883394751);
                     default -> aa(1300017682, var25 ^ -2112917609);
                  });
                  var8++;
                  if (var32 == 0) {
                     var10004 = var32;
                     var53 = var44;
                  } else {
                     if (var32 <= var8) {
                        break;
                     }

                     var53 = var44;
                     var10004 = var8;
                  }
               }
            }

            String var60 = new String(var44).intern();
            switch (var32) {
               case 0:
                  var2[var6++] = var60;
                  if ((var27 += var4) >= var7) {
                     long var0 = 3507937891465790920L;
                     long var50 = 1180758506927785422L ^ var0;
                     byte var41 = -1;
                     ab = var50;
                     aab = new bbbbaaab(aabbaaaba.aaab(var2[2]), 1);
                     ba = new bbbbaaab(
                        aabbaaaba.aaab(var2[aa(1300017683, var25 ^ -1799772968)]), 2
                     );
                     bb = new bbbbaaab(
                        aabbaaaba.aaab(var2[aa(1300017685, var25 ^ 910443434)]), 3
                     );
                     a = new bbbbaaab(aabbaaaba.aaab(var2[5]), 0);
                     aaa = new bbbbaaab(
                        aabbaaaba.aaab(var2[aa(1300017672, var25 ^ 1008938897)]), 1
                     );
                     aba = new bbbbaaab(aabbaaaba.aaab(var2[4]), 0);
                     aa = a();
                     return;
                  }

                  var4 = var5.charAt(var27);
                  break;
               default:
                  var2[var6++] = var60;
                  if ((var27 += var4) < var7) {
                     var4 = var5.charAt(var27);
                     continue label100;
                  }

                  var7 = (var5 = ab('䣀', (short)'﮳', var25 ^ 1737980510)).length();
                  var4 = aa(1300017690, var25 ^ 1791526468);
                  var27 = -1;
            }

            var30 = var5.substring(++var27, var27 + var4);
            var32 = 0;
         }
      }
   }

   @Override
   public String toString() {
      return this.b.abab();
   }
}
