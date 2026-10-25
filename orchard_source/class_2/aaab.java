package nsc;

import java.awt.Color;
import net.fabricmc.api.EnvType;
import net.fabricmc.api.Environment;
import net.minecraft.class_12249;
import net.minecraft.class_1657;
import net.minecraft.class_243;
import net.minecraft.class_310;
import net.minecraft.class_4588;
import org.joml.Matrix4f;

@Environment(EnvType.CLIENT)
public final class aaab extends abbaabbaa {
   private static final double aa = 3.0;
   private static final int ab;
   private static final Object[] aaab;
   private static final long[] ba;
   private static final Integer[] bb;
   private static final double aaa = 0.05;
   private static final long[] aab;
   private static final String[] aba;
   private static final int[] bbb;
   private static String[] abb;
   private static final String[] aaaa;
   private static final String[] baa;
   private static final int bab;
   private static final Long[] bba;

   private class_243 aa(class_243 var1, double var2, int var4) {
      double var5 = (Math.PI * 2) * var4 / 72.0;
      return var1.method_1031(Math.cos(var5) * var2, 0.0, Math.sin(var5) * var2);
   }

   private void ab(aabbbbaaa var1, class_243 var2) {
      class_243 var4 = bbaabbaa.baaab(var1);
      int var10000 = baaabbaa.bba;
      Matrix4f var5 = var1.ba().method_23760().method_23761();
      int var3 = var10000;
      class_4588 var6 = bbaabbaa.ababab(var1).method_73477(class_12249.method_76023());
      int var7 = 0;

      while (var7 < bab(a(464146057, -1993712001 ^ 1659814503), 6134045542730090977L)) {
         double var8 = 3.0 * var7 / 8.0;
         double var10 = 3.0 * (var7 + 1) / 8.0;
         double var12 = 1.0 - var7 / 8.0;
         double var14 = 1.0 - (var7 + 1) / 8.0;
         Color var16 = this.bb(var12);
         aaab var36 = this;

         label41:
         while (true) {
            Color var17 = var36.bb(var14);
            float var18 = var16.getRed() / 255.0F;
            float var19 = var16.getGreen() / 255.0F;
            float var20 = var16.getBlue() / 255.0F;
            float var21 = (float)((24.0 + var12 * 126.0) / 255.0);
            float var22 = var17.getRed() / 255.0F;
            float var23 = var17.getGreen() / 255.0F;
            float var24 = var17.getBlue() / 255.0F;
            float var25 = (float)((24.0 + var14 * 126.0) / 255.0);
            int var26 = 0;

            while (var26 < bab(a(464146056, -1993712001 ^ 1909158761), 1405749116913103542L)) {
               var36 = this;
               if (var3 != 0) {
                  continue label41;
               }

               label35: {
                  class_243 var27 = this.aa(var2, var10, var26);
                  class_243 var28 = this.aa(var2, var10, var26 + 1);
                  if (var7 == 0) {
                     Color var29 = this.bb(1.0);
                     float var30 = var29.getRed() / 255.0F;
                     float var31 = var29.getGreen() / 255.0F;
                     float var32 = var29.getBlue() / 255.0F;
                     float var33 = 0.5882353F;
                     var6.method_22918(
                           var5,
                           (float)(var2.field_1352 - var4.field_1352),
                           (float)(var2.field_1351 - var4.field_1351),
                           (float)(var2.field_1350 - var4.field_1350)
                        )
                        .method_22915(var30, var31, var32, var33);
                     var6.method_22918(
                           var5,
                           (float)(var27.field_1352 - var4.field_1352),
                           (float)(var27.field_1351 - var4.field_1351),
                           (float)(var27.field_1350 - var4.field_1350)
                        )
                        .method_22915(var22, var23, var24, var25);
                     var6.method_22918(
                           var5,
                           (float)(var28.field_1352 - var4.field_1352),
                           (float)(var28.field_1351 - var4.field_1351),
                           (float)(var28.field_1350 - var4.field_1350)
                        )
                        .method_22915(var22, var23, var24, var25);
                     var6.method_22918(
                           var5,
                           (float)(var2.field_1352 - var4.field_1352),
                           (float)(var2.field_1351 - var4.field_1351),
                           (float)(var2.field_1350 - var4.field_1350)
                        )
                        .method_22915(var30, var31, var32, var33);
                     if (var3 == 0) {
                        break label35;
                     }
                  }

                  class_243 var34 = this.aa(var2, var8, var26);
                  class_243 var35 = this.aa(var2, var8, var26 + 1);
                  var6.method_22918(
                        var5,
                        (float)(var34.field_1352 - var4.field_1352),
                        (float)(var34.field_1351 - var4.field_1351),
                        (float)(var34.field_1350 - var4.field_1350)
                     )
                     .method_22915(var18, var19, var20, var21);
                  var6.method_22918(
                        var5,
                        (float)(var27.field_1352 - var4.field_1352),
                        (float)(var27.field_1351 - var4.field_1351),
                        (float)(var27.field_1350 - var4.field_1350)
                     )
                     .method_22915(var22, var23, var24, var25);
                  var6.method_22918(
                        var5,
                        (float)(var28.field_1352 - var4.field_1352),
                        (float)(var28.field_1351 - var4.field_1351),
                        (float)(var28.field_1350 - var4.field_1350)
                     )
                     .method_22915(var22, var23, var24, var25);
                  var6.method_22918(
                        var5,
                        (float)(var34.field_1352 - var4.field_1352),
                        (float)(var34.field_1351 - var4.field_1351),
                        (float)(var34.field_1350 - var4.field_1350)
                     )
                     .method_22915(var18, var19, var20, var21);
                  var6.method_22918(
                        var5,
                        (float)(var34.field_1352 - var4.field_1352),
                        (float)(var34.field_1351 - var4.field_1351),
                        (float)(var34.field_1350 - var4.field_1350)
                     )
                     .method_22915(var18, var19, var20, var21);
                  var6.method_22918(
                        var5,
                        (float)(var28.field_1352 - var4.field_1352),
                        (float)(var28.field_1351 - var4.field_1351),
                        (float)(var28.field_1350 - var4.field_1350)
                     )
                     .method_22915(var22, var23, var24, var25);
                  var6.method_22918(
                        var5,
                        (float)(var35.field_1352 - var4.field_1352),
                        (float)(var35.field_1351 - var4.field_1351),
                        (float)(var35.field_1350 - var4.field_1350)
                     )
                     .method_22915(var18, var19, var20, var21);
                  var6.method_22918(
                        var5,
                        (float)(var34.field_1352 - var4.field_1352),
                        (float)(var34.field_1351 - var4.field_1351),
                        (float)(var34.field_1350 - var4.field_1350)
                     )
                     .method_22915(var18, var19, var20, var21);
               }

               var26++;
               if (var3 != 0) {
                  break;
               }
            }

            var7++;
            if (var3 != 0) {
               return;
            }
            break;
         }
      }
   }

   private static void ba() {
      int var0 = 1714239524;
      abb[0] = aaa(
         aba(a(464146059, var0 ^ -750979028), a(464146058, var0 ^ -249030715)).toCharArray(),
         bba(a(464146061, var0 ^ 1545858495), 1897752139853132448L),
         bab(a(464146060, var0 ^ 921295710), 701118341363096606L)
      );
      abb[1] = aaa(
         aba(a(464146063, var0 ^ 1678187911), a(464146062, var0 ^ 1540528935)).toCharArray(),
         bba(a(464146049, var0 ^ -767846853), 2434340121148215407L),
         bab(a(464146048, var0 ^ -54580894), 3181794173037160122L)
      );
   }

   private Color bb(double param1) {
      // $VF: Couldn't be decompiled
      // Please report this to the Vineflower issue tracker, at https://github.com/Vineflower/vineflower/issues with a copy of the class file (if you have the rights to distribute it!)
      // java.lang.RuntimeException: parsing failure!
      //   at org.jetbrains.java.decompiler.modules.decompiler.decompose.DomHelper.parseGraph(DomHelper.java:211)
      //   at org.jetbrains.java.decompiler.main.rels.MethodProcessor.codeToJava(MethodProcessor.java:166)
      //
      // Bytecode:
      // 000: ldc -1233561268
      // 002: istore 6
      // 004: getstatic qeaa361f143ee4a0894bd168fd9b30c66/qf4ccf8f5435d4a78bdca4d6a018b578e/baaabbaa.bba I
      // 007: istore 3
      // 008: dload 1
      // 009: iload 3
      // 00a: ifne 025
      // 00d: ldc2_w 0.5
      // 010: dcmpl
      // 011: iflt 09c
      // 014: goto 018
      // 017: athrow
      // 018: dload 1
      // 019: ldc2_w 0.5
      // 01c: dsub
      // 01d: ldc2_w 2.0
      // 020: dmul
      // 021: goto 025
      // 024: athrow
      // 025: dstore 4
      // 027: aload 0
      // 028: new java/awt/Color
      // 02b: dup
      // 02c: ldc 464146051
      // 02e: iload 6
      // 030: ldc -1021477058
      // 032: ixor
      // 033: invokestatic qeaa361f143ee4a0894bd168fd9b30c66/qf4ccf8f5435d4a78bdca4d6a018b578e/aaab.a (II)I
      // 036: ldc2_w 7885892574538972962
      // 039: invokestatic qeaa361f143ee4a0894bd168fd9b30c66/qf4ccf8f5435d4a78bdca4d6a018b578e/aaab.bab (IJ)I
      // 03c: ldc 464146050
      // 03e: iload 6
      // 040: ldc 356893328
      // 042: ixor
      // 043: invokestatic qeaa361f143ee4a0894bd168fd9b30c66/qf4ccf8f5435d4a78bdca4d6a018b578e/aaab.a (II)I
      // 046: ldc2_w 6110042815922344121
      // 049: invokestatic qeaa361f143ee4a0894bd168fd9b30c66/qf4ccf8f5435d4a78bdca4d6a018b578e/aaab.bab (IJ)I
      // 04c: ldc 464146053
      // 04e: iload 6
      // 050: ldc 1218438446
      // 052: ixor
      // 053: invokestatic qeaa361f143ee4a0894bd168fd9b30c66/qf4ccf8f5435d4a78bdca4d6a018b578e/aaab.a (II)I
      // 056: ldc2_w 5081021609101417157
      // 059: invokestatic qeaa361f143ee4a0894bd168fd9b30c66/qf4ccf8f5435d4a78bdca4d6a018b578e/aaab.bab (IJ)I
      // 05c: invokespecial java/awt/Color.<init> (III)V
      // 05f: new java/awt/Color
      // 062: dup
      // 063: ldc 464146052
      // 065: iload 6
      // 067: ldc -1177344110
      // 069: ixor
      // 06a: invokestatic qeaa361f143ee4a0894bd168fd9b30c66/qf4ccf8f5435d4a78bdca4d6a018b578e/aaab.a (II)I
      // 06d: ldc2_w 7885892574538972962
      // 070: invokestatic qeaa361f143ee4a0894bd168fd9b30c66/qf4ccf8f5435d4a78bdca4d6a018b578e/aaab.bab (IJ)I
      // 073: ldc 464146055
      // 075: iload 6
      // 077: ldc -1463773788
      // 079: ixor
      // 07a: invokestatic qeaa361f143ee4a0894bd168fd9b30c66/qf4ccf8f5435d4a78bdca4d6a018b578e/aaab.a (II)I
      // 07d: ldc2_w 3628778157232146990
      // 080: invokestatic qeaa361f143ee4a0894bd168fd9b30c66/qf4ccf8f5435d4a78bdca4d6a018b578e/aaab.bab (IJ)I
      // 083: ldc 464146054
      // 085: iload 6
      // 087: ldc 1520291869
      // 089: ixor
      // 08a: invokestatic qeaa361f143ee4a0894bd168fd9b30c66/qf4ccf8f5435d4a78bdca4d6a018b578e/aaab.a (II)I
      // 08d: ldc2_w 7975533899708324798
      // 090: invokestatic qeaa361f143ee4a0894bd168fd9b30c66/qf4ccf8f5435d4a78bdca4d6a018b578e/aaab.bab (IJ)I
      // 093: invokespecial java/awt/Color.<init> (III)V
      // 096: dload 4
      // 098: invokevirtual qeaa361f143ee4a0894bd168fd9b30c66/qf4ccf8f5435d4a78bdca4d6a018b578e/aaab.abb (Ljava/awt/Color;Ljava/awt/Color;D)Ljava/awt/Color;
      // 09b: areturn
      // 09c: aload 0
      // 09d: new java/awt/Color
      // 0a0: dup
      // 0a1: ldc 464146073
      // 0a3: iload 6
      // 0a5: ldc 1846597790
      // 0a7: ixor
      // 0a8: invokestatic qeaa361f143ee4a0894bd168fd9b30c66/qf4ccf8f5435d4a78bdca4d6a018b578e/aaab.a (II)I
      // 0ab: ldc2_w 7885892574538972962
      // 0ae: invokestatic qeaa361f143ee4a0894bd168fd9b30c66/qf4ccf8f5435d4a78bdca4d6a018b578e/aaab.bab (IJ)I
      // 0b1: ldc 464146072
      // 0b3: iload 6
      // 0b5: ldc -1295708671
      // 0b7: ixor
      // 0b8: invokestatic qeaa361f143ee4a0894bd168fd9b30c66/qf4ccf8f5435d4a78bdca4d6a018b578e/aaab.a (II)I
      // 0bb: ldc2_w 8881138903351902240
      // 0be: invokestatic qeaa361f143ee4a0894bd168fd9b30c66/qf4ccf8f5435d4a78bdca4d6a018b578e/aaab.bab (IJ)I
      // 0c1: ldc 464146075
      // 0c3: iload 6
      // 0c5: ldc 666553095
      // 0c7: ixor
      // 0c8: invokestatic qeaa361f143ee4a0894bd168fd9b30c66/qf4ccf8f5435d4a78bdca4d6a018b578e/aaab.a (II)I
      // 0cb: ldc2_w 4783437503913977711
      // 0ce: invokestatic qeaa361f143ee4a0894bd168fd9b30c66/qf4ccf8f5435d4a78bdca4d6a018b578e/aaab.bab (IJ)I
      // 0d1: invokespecial java/awt/Color.<init> (III)V
      // 0d4: new java/awt/Color
      // 0d7: dup
      // 0d8: ldc 464146074
      // 0da: iload 6
      // 0dc: ldc_w 2093394678
      // 0df: ixor
      // 0e0: invokestatic qeaa361f143ee4a0894bd168fd9b30c66/qf4ccf8f5435d4a78bdca4d6a018b578e/aaab.a (II)I
      // 0e3: ldc2_w 7885892574538972962
      // 0e6: invokestatic qeaa361f143ee4a0894bd168fd9b30c66/qf4ccf8f5435d4a78bdca4d6a018b578e/aaab.bab (IJ)I
      // 0e9: ldc_w 464146077
      // 0ec: iload 6
      // 0ee: ldc_w 1935116301
      // 0f1: ixor
      // 0f2: invokestatic qeaa361f143ee4a0894bd168fd9b30c66/qf4ccf8f5435d4a78bdca4d6a018b578e/aaab.a (II)I
      // 0f5: ldc2_w 6707857770351297554
      // 0f8: invokestatic qeaa361f143ee4a0894bd168fd9b30c66/qf4ccf8f5435d4a78bdca4d6a018b578e/aaab.bab (IJ)I
      // 0fb: ldc_w 464146076
      // 0fe: iload 6
      // 100: ldc_w -170824769
      // 103: ixor
      // 104: invokestatic qeaa361f143ee4a0894bd168fd9b30c66/qf4ccf8f5435d4a78bdca4d6a018b578e/aaab.a (II)I
      // 107: ldc2_w 3595837685810137450
      // 10a: invokestatic qeaa361f143ee4a0894bd168fd9b30c66/qf4ccf8f5435d4a78bdca4d6a018b578e/aaab.bab (IJ)I
      // 10d: invokespecial java/awt/Color.<init> (III)V
      // 110: dload 1
      // 111: ldc2_w 2.0
      // 114: dmul
      // 115: invokevirtual qeaa361f143ee4a0894bd168fd9b30c66/qf4ccf8f5435d4a78bdca4d6a018b578e/aaab.abb (Ljava/awt/Color;Ljava/awt/Color;D)Ljava/awt/Color;
      // 118: areturn
   }

   private static int a(int var0, int var1) {
      int var2 = bbb[var0 ^ 464146057] ^ var1 ^ var0;
      var2 -= 37509;
      var2 += 24173;
      var2 -= 38560;
      var2 -= 26950;
      var2 -= 10890;
      var2 += 60556;
      var2 += 17178;
      return var2 ^ 4742;
   }

   private static String aaa(char[] var0, long var1, int var3) {
      int var4 = bab(a(464146079, 2144413593 ^ -1113837320), 1601591208694722432L) ^ var3;

      for (int var5 = 0; var5 < var0.length; var5++) {
         int var7 = var4 ^ (int)var1 ^ ~var5;
         int var8 = var7 ^ var3 - var5 * var0.length;
         var4 = -var8 * var3 | var5;
         var0[var5] = (char)(var0[var5] ^ var4);
         int var6 = var5 & bab(a(464146078, 2144413593 ^ -994910276), 1269940198491794951L);
         var3 = var3 << var6 | var3 >>> -var6;
         var1 ^= var6;
      }

      return new String(var0);
   }

   private class_243 aab(class_310 param1, class_1657 param2, class_243 param3) {
      // $VF: Couldn't be decompiled
      // Please report this to the Vineflower issue tracker, at https://github.com/Vineflower/vineflower/issues with a copy of the class file (if you have the rights to distribute it!)
      // java.lang.RuntimeException: parsing failure!
      //   at org.jetbrains.java.decompiler.modules.decompiler.decompose.DomHelper.parseGraph(DomHelper.java:211)
      //   at org.jetbrains.java.decompiler.main.rels.MethodProcessor.codeToJava(MethodProcessor.java:166)
      //
      // Bytecode:
      // 00: aload 3
      // 01: dconst_0
      // 02: dconst_1
      // 03: dconst_0
      // 04: invokevirtual net/minecraft/class_243.method_1031 (DDD)Lnet/minecraft/class_243;
      // 07: astore 5
      // 09: getstatic qeaa361f143ee4a0894bd168fd9b30c66/qf4ccf8f5435d4a78bdca4d6a018b578e/baaabbaa.bba I
      // 0c: new net/minecraft/class_243
      // 0f: dup
      // 10: aload 3
      // 11: getfield net/minecraft/class_243.field_1352 D
      // 14: aload 1
      // 15: getfield net/minecraft/class_310.field_1687 Lnet/minecraft/class_638;
      // 18: invokevirtual net/minecraft/class_638.method_31607 ()I
      // 1b: i2d
      // 1c: dconst_1
      // 1d: dsub
      // 1e: aload 3
      // 1f: getfield net/minecraft/class_243.field_1350 D
      // 22: invokespecial net/minecraft/class_243.<init> (DDD)V
      // 25: astore 6
      // 27: istore 4
      // 29: aload 1
      // 2a: getfield net/minecraft/class_310.field_1687 Lnet/minecraft/class_638;
      // 2d: new net/minecraft/class_3959
      // 30: dup
      // 31: aload 5
      // 33: aload 6
      // 35: getstatic net/minecraft/class_3959$class_3960.field_17558 Lnet/minecraft/class_3959$class_3960;
      // 38: getstatic net/minecraft/class_3959$class_242.field_1348 Lnet/minecraft/class_3959$class_242;
      // 3b: aload 2
      // 3c: invokespecial net/minecraft/class_3959.<init> (Lnet/minecraft/class_243;Lnet/minecraft/class_243;Lnet/minecraft/class_3959$class_3960;Lnet/minecraft/class_3959$class_242;Lnet/minecraft/class_1297;)V
      // 3f: invokevirtual net/minecraft/class_638.method_17742 (Lnet/minecraft/class_3959;)Lnet/minecraft/class_3965;
      // 42: astore 7
      // 44: aload 7
      // 46: iload 4
      // 48: ifne 54
      // 4b: ifnull 66
      // 4e: goto 52
      // 51: athrow
      // 52: aload 7
      // 54: iload 4
      // 56: ifne 6b
      // 59: invokevirtual net/minecraft/class_3965.method_17783 ()Lnet/minecraft/class_239$class_240;
      // 5c: getstatic net/minecraft/class_239$class_240.field_1332 Lnet/minecraft/class_239$class_240;
      // 5f: if_acmpeq 69
      // 62: goto 66
      // 65: athrow
      // 66: aconst_null
      // 67: areturn
      // 68: athrow
      // 69: aload 7
      // 6b: invokevirtual net/minecraft/class_3965.method_17784 ()Lnet/minecraft/class_243;
      // 6e: astore 8
      // 70: new net/minecraft/class_243
      // 73: dup
      // 74: aload 3
      // 75: getfield net/minecraft/class_243.field_1352 D
      // 78: aload 8
      // 7a: getfield net/minecraft/class_243.field_1351 D
      // 7d: ldc2_w 0.05
      // 80: dadd
      // 81: aload 3
      // 82: getfield net/minecraft/class_243.field_1350 D
      // 85: invokespecial net/minecraft/class_243.<init> (DDD)V
      // 88: areturn
   }

   private static String aba(int var0, int var1) {
      int var9 = -766217780;
      int var2 = (var0 ^ a(464146065, var9 ^ 1946977459)) & a(464146064, var9 ^ 1369757213);
      if (baa[var2] == null) {
         char[] var3 = aba[var2].toCharArray();

         int var4 = switch (var3[0] & a(464146067, var9 ^ 218201990)) {
            case 0 -> a(464146066, var9 ^ 1789456445);
            case 1 -> 2;
            case 2 -> a(464146069, var9 ^ -76127632);
            case 3 -> a(464146068, var9 ^ -474891103);
            case 4 -> a(464146071, var9 ^ -2050579145);
            case 5 -> a(464146070, var9 ^ 996175699);
            case 6 -> a(464146089, var9 ^ 1332946452);
            case 7 -> a(464146088, var9 ^ 338403851);
            case 8 -> a(464146091, var9 ^ 1753933638);
            case 9 -> a(464146090, var9 ^ -988292746);
            case 10 -> a(464146093, var9 ^ 1778427185);
            case 11 -> a(464146092, var9 ^ -1071542977);
            case 12 -> a(464146095, var9 ^ -1020196414);
            case 13 -> a(464146094, var9 ^ -563274184);
            case 14 -> a(464146081, var9 ^ 709104442);
            case 15 -> a(464146080, var9 ^ 1287723228);
            case 16 -> a(464146083, var9 ^ 908218928);
            case 17 -> a(464146082, var9 ^ -1891089259);
            case 18 -> a(464146085, var9 ^ 804846521);
            case 19 -> a(464146084, var9 ^ 1161642873);
            case 20 -> a(464146087, var9 ^ 1485659291);
            case 21 -> a(464146086, var9 ^ 1046999495);
            case 22 -> a(464146105, var9 ^ 1549837926);
            case 23 -> a(464146104, var9 ^ -1366512803);
            case 24 -> a(464146107, var9 ^ 1441362509);
            case 25 -> a(464146106, var9 ^ 844655023);
            case 26 -> a(464146109, var9 ^ 480988930);
            case 27 -> a(464146108, var9 ^ -1440526455);
            case 28 -> a(464146111, var9 ^ -353768429);
            case 29 -> a(464146110, var9 ^ -1130566171);
            case 30 -> a(464146097, var9 ^ -540822475);
            case 31 -> a(464146096, var9 ^ 1832307624);
            case 32 -> a(464146099, var9 ^ 1841510163);
            case 33 -> a(464146098, var9 ^ -730310056);
            case 34 -> a(464146101, var9 ^ 283609084);
            case 35 -> a(464146100, var9 ^ 1606232649);
            case 36 -> a(464146103, var9 ^ 2146934335);
            case 37 -> a(464146102, var9 ^ 1402414521);
            case 38 -> a(464146121, var9 ^ 1839143797);
            case 39 -> a(464146120, var9 ^ -1686046955);
            case 40 -> a(464146123, var9 ^ 1577435789);
            case 41 -> a(464146122, var9 ^ -787290127);
            case 42 -> a(464146125, var9 ^ -1518042941);
            case 43 -> a(464146124, var9 ^ 1143655161);
            case 44 -> a(464146127, var9 ^ -1996216973);
            case 45 -> a(464146126, var9 ^ -668224794);
            case 46 -> a(464146113, var9 ^ 110560381);
            case 47 -> a(464146112, var9 ^ 1112333530);
            case 48 -> a(464146115, var9 ^ 326061853);
            case 49 -> 4;
            case 50 -> a(464146114, var9 ^ 809501948);
            case 51 -> a(464146117, var9 ^ -411907666);
            case 52 -> a(464146116, var9 ^ 731197587);
            case 53 -> a(464146119, var9 ^ -2126687777);
            case 54 -> a(464146118, var9 ^ -1846943786);
            case 55 -> a(464146137, var9 ^ -1316260295);
            case 56 -> a(464146136, var9 ^ -801700008);
            case 57 -> a(464146139, var9 ^ 227638005);
            case 58 -> a(464146138, var9 ^ -379587611);
            case 59 -> a(464146141, var9 ^ -1193788703);
            case 60 -> a(464146140, var9 ^ -677718586);
            case 61 -> a(464146143, var9 ^ -2099233447);
            case 62 -> a(464146142, var9 ^ -911226013);
            case 63 -> a(464146129, var9 ^ -1644180503);
            case 64 -> a(464146128, var9 ^ 1757125261);
            case 65 -> a(464146131, var9 ^ 1715606684);
            case 66 -> a(464146130, var9 ^ 427756036);
            case 67 -> a(464146133, var9 ^ -285395703);
            case 68 -> a(464146132, var9 ^ -1861891204);
            case 69 -> a(464146135, var9 ^ 1170267047);
            case 70 -> a(464146134, var9 ^ -1526087522);
            case 71 -> a(464146153, var9 ^ -845376336);
            case 72 -> a(464146152, var9 ^ -1578589691);
            case 73 -> a(464146155, var9 ^ 328760746);
            case 74 -> a(464146154, var9 ^ 479601714);
            case 75 -> a(464146157, var9 ^ 259852326);
            case 76 -> a(464146156, var9 ^ 1421506897);
            case 77 -> a(464146159, var9 ^ 1520575742);
            case 78 -> a(464146158, var9 ^ -1982735597);
            case 79 -> a(464146145, var9 ^ -574111090);
            case 80 -> a(464146144, var9 ^ -1819745854);
            case 81 -> a(464146147, var9 ^ 1692063731);
            case 82 -> a(464146146, var9 ^ 9930275);
            case 83 -> a(464146149, var9 ^ 274160862);
            case 84 -> a(464146148, var9 ^ -615922479);
            case 85 -> a(464146151, var9 ^ -1556992653);
            case 86 -> a(464146150, var9 ^ -1566191349);
            case 87 -> a(464146169, var9 ^ -1480983101);
            case 88 -> a(464146168, var9 ^ -834423498);
            case 89 -> a(464146171, var9 ^ 1934392574);
            case 90 -> a(464146170, var9 ^ 113447896);
            case 91 -> a(464146173, var9 ^ 287530028);
            case 92 -> a(464146172, var9 ^ 1468735009);
            case 93 -> a(464146175, var9 ^ -329863092);
            case 94 -> a(464146174, var9 ^ -1153160504);
            case 95 -> a(464146161, var9 ^ -2147270146);
            case 96 -> a(464146160, var9 ^ -888917487);
            case 97 -> a(464146163, var9 ^ 1365426023);
            case 98 -> a(464146162, var9 ^ 747474419);
            case 99 -> a(464146165, var9 ^ -1506422792);
            case 100 -> a(464146164, var9 ^ -760078644);
            case 101 -> a(464146167, var9 ^ 1730979563);
            case 102 -> a(464146166, var9 ^ 824942442);
            case 103 -> a(464145929, var9 ^ -984291386);
            case 104 -> a(464145928, var9 ^ -548961936);
            case 105 -> a(464145931, var9 ^ 1217343394);
            case 106 -> a(464145930, var9 ^ 1152788239);
            case 107 -> a(464145933, var9 ^ -405261692);
            case 108 -> a(464145932, var9 ^ 628823862);
            case 109 -> a(464145935, var9 ^ 1856319963);
            case 110 -> a(464145934, var9 ^ 860827468);
            case 111 -> a(464145921, var9 ^ 103401430);
            case 112 -> a(464145920, var9 ^ -1473727920);
            case 113 -> a(464145923, var9 ^ -2043630951);
            case 114 -> a(464145922, var9 ^ 1008659522);
            case 115 -> a(464145925, var9 ^ 1133913593);
            case 116 -> a(464145924, var9 ^ -2059603236);
            case 117 -> a(464145927, var9 ^ 1752803181);
            case 118 -> a(464145926, var9 ^ -475407951);
            case 119 -> a(464145945, var9 ^ 2088449599);
            case 120 -> a(464145944, var9 ^ 1232807941);
            case 121 -> a(464145947, var9 ^ -1061014117);
            case 122 -> a(464145946, var9 ^ -1899609692);
            case 123 -> a(464145949, var9 ^ -1994107784);
            case 124 -> a(464145948, var9 ^ 1806563860);
            case 125 -> a(464145951, var9 ^ 1867339657);
            case 126 -> a(464145950, var9 ^ 123620963);
            case 127 -> a(464145937, var9 ^ -1464808345);
            case 128 -> a(464145936, var9 ^ 1357114757);
            case 129 -> a(464145939, var9 ^ 1123358308);
            case 130 -> a(464145938, var9 ^ -1283009178);
            case 131 -> a(464145941, var9 ^ -1966159621);
            case 132 -> a(464145940, var9 ^ -2052256991);
            case 133 -> a(464145943, var9 ^ -847057063);
            case 134 -> 5;
            case 135 -> a(464145942, var9 ^ -829246727);
            case 136 -> a(464145961, var9 ^ -1822312537);
            case 137 -> a(464145960, var9 ^ -7410414);
            case 138 -> a(464145963, var9 ^ 31472759);
            case 139 -> a(464145962, var9 ^ -717883563);
            case 140 -> a(464145965, var9 ^ 1909999398);
            case 141 -> a(464145964, var9 ^ -1112387658);
            case 142 -> a(464145967, var9 ^ -355609625);
            case 143 -> a(464145966, var9 ^ -1959601737);
            case 144 -> a(464145953, var9 ^ 1819456753);
            case 145 -> a(464145952, var9 ^ 1601246219);
            case 146 -> a(464145955, var9 ^ -969114014);
            case 147 -> a(464145954, var9 ^ -1784992287);
            case 148 -> a(464145957, var9 ^ 2095622304);
            case 149 -> a(464145956, var9 ^ 2143621904);
            case 150 -> a(464145959, var9 ^ -1756297127);
            case 151 -> a(464145958, var9 ^ -1152151209);
            case 152 -> a(464145977, var9 ^ -187585387);
            case 153 -> a(464145976, var9 ^ -1356859978);
            case 154 -> a(464145979, var9 ^ 1818611102);
            case 155 -> a(464145978, var9 ^ -382069877);
            case 156 -> a(464145981, var9 ^ -2125535902);
            case 157 -> a(464145980, var9 ^ -2117292305);
            case 158 -> a(464145983, var9 ^ 465133949);
            case 159 -> 1;
            case 160 -> a(464145982, var9 ^ -1120691917);
            case 161 -> a(464145969, var9 ^ -1810235047);
            case 162 -> a(464145968, var9 ^ -2146382181);
            case 163 -> a(464145971, var9 ^ -1837630026);
            case 164 -> a(464145970, var9 ^ 467895060);
            case 165 -> a(464145973, var9 ^ -2014766416);
            case 166 -> a(464145972, var9 ^ 873177822);
            case 167 -> a(464145975, var9 ^ -2092717919);
            case 168 -> a(464145974, var9 ^ -827817189);
            case 169 -> a(464145993, var9 ^ -1501563453);
            case 170 -> a(464145992, var9 ^ 1197502357);
            case 171 -> a(464145995, var9 ^ 269112590);
            case 172 -> a(464145994, var9 ^ -522699189);
            case 173 -> a(464145997, var9 ^ 315220058);
            case 174 -> a(464145996, var9 ^ 406152853);
            case 175 -> a(464145999, var9 ^ -1771191738);
            case 176 -> a(464145998, var9 ^ 80041207);
            case 177 -> a(464145985, var9 ^ -935838680);
            case 178 -> a(464145984, var9 ^ 182153909);
            case 179 -> a(464145987, var9 ^ -1377609444);
            case 180 -> a(464145986, var9 ^ 14631983);
            case 181 -> a(464145989, var9 ^ -1429304433);
            case 182 -> a(464145988, var9 ^ 1362026861);
            case 183 -> a(464145991, var9 ^ -960673816);
            case 184 -> a(464145990, var9 ^ 885474871);
            case 185 -> a(464146009, var9 ^ -2093993732);
            case 186 -> a(464146008, var9 ^ -446109371);
            case 187 -> a(464146011, var9 ^ -700266997);
            case 188 -> a(464146010, var9 ^ -710129162);
            case 189 -> a(464146013, var9 ^ 1828207776);
            case 190 -> a(464146012, var9 ^ 76711060);
            case 191 -> a(464146015, var9 ^ -1446600747);
            case 192 -> a(464146014, var9 ^ -756384719);
            case 193 -> a(464146001, var9 ^ 1822606015);
            case 194 -> a(464146000, var9 ^ 1740740168);
            case 195 -> a(464146003, var9 ^ 2001441380);
            case 196 -> a(464146002, var9 ^ 1792216176);
            case 197 -> a(464146005, var9 ^ -2108551959);
            case 198 -> a(464146004, var9 ^ 1597523505);
            case 199 -> a(464146007, var9 ^ -1680733932);
            case 200 -> a(464146006, var9 ^ -302473680);
            case 201 -> a(464146025, var9 ^ -707073028);
            case 202 -> a(464146024, var9 ^ -1158354720);
            case 203 -> a(464146027, var9 ^ -796998786);
            case 204 -> a(464146026, var9 ^ -706560806);
            case 205 -> a(464146029, var9 ^ 721187829);
            case 206 -> a(464146028, var9 ^ -1643359165);
            case 207 -> a(464146031, var9 ^ 1252551608);
            case 208 -> a(464146030, var9 ^ -296998706);
            case 209 -> a(464146017, var9 ^ -661034682);
            case 210 -> a(464146016, var9 ^ -1397066059);
            case 211 -> a(464146019, var9 ^ 1308694005);
            case 212 -> a(464146018, var9 ^ -2018450867);
            case 213 -> a(464146021, var9 ^ -1655958010);
            case 214 -> 0;
            case 215 -> a(464146020, var9 ^ -1195532);
            case 216 -> a(464146023, var9 ^ 7716243);
            case 217 -> a(464146022, var9 ^ 591776968);
            case 218 -> a(464146041, var9 ^ -842806554);
            case 219 -> a(464146040, var9 ^ 1857983864);
            case 220 -> a(464146043, var9 ^ -1058240660);
            case 221 -> a(464146042, var9 ^ -1593390045);
            case 222 -> 3;
            case 223 -> a(464146045, var9 ^ -1604618021);
            case 224 -> a(464146044, var9 ^ 667202877);
            case 225 -> a(464146047, var9 ^ 935954665);
            case 226 -> a(464146046, var9 ^ -2097050938);
            case 227 -> a(464146033, var9 ^ -2024590068);
            case 228 -> a(464146032, var9 ^ -1243962047);
            case 229 -> a(464146035, var9 ^ -1012417599);
            case 230 -> a(464146034, var9 ^ 386894259);
            case 231 -> a(464146037, var9 ^ -1775522622);
            case 232 -> a(464146036, var9 ^ -828669542);
            case 233 -> a(464146039, var9 ^ 695892584);
            case 234 -> a(464146038, var9 ^ -1969784888);
            case 235 -> a(464146313, var9 ^ -1900723467);
            case 236 -> a(464146312, var9 ^ 1935395096);
            case 237 -> a(464146315, var9 ^ 1346639437);
            case 238 -> a(464146314, var9 ^ 2060212688);
            case 239 -> a(464146317, var9 ^ -761119785);
            case 240 -> a(464146316, var9 ^ 1187367701);
            case 241 -> a(464146319, var9 ^ 1524417380);
            case 242 -> a(464146318, var9 ^ 1682585322);
            case 243 -> a(464146305, var9 ^ 684787615);
            case 244 -> a(464146304, var9 ^ 909431967);
            case 245 -> a(464146307, var9 ^ 587531045);
            case 246 -> a(464146306, var9 ^ 1977710323);
            case 247 -> a(464146309, var9 ^ -1308956091);
            case 248 -> a(464146308, var9 ^ 257381731);
            case 249 -> a(464146311, var9 ^ -1481896592);
            case 250 -> a(464146310, var9 ^ -1939435083);
            case 251 -> a(464146329, var9 ^ -187772329);
            case 252 -> a(464146328, var9 ^ -1993410919);
            case 253 -> a(464146331, var9 ^ -313990082);
            case 254 -> a(464146330, var9 ^ -1321403832);
            default -> a(464146333, var9 ^ -1426144551);
         };
         int var5 = (var1 & a(464146332, var9 ^ -685767775)) - var4;
         if (var5 < 0) {
            var5 += 256;
         }

         int var6 = ((var1 & a(464146335, var9 ^ -1265896169)) >>> a(464146334, var9 ^ 722474256)) - var4;
         if (var6 < 0) {
            var6 += 256;
         }

         for (int var7 = 0; var7 < var3.length; var7++) {
            int var8 = var7 % 2;
            char var10002 = var3[var7];
            if (var8 == 0) {
               var3[var7] = (char)(var10002 ^ var5);
               var5 = ((var5 >>> 3 | var5 << 5) ^ var3[var7]) & a(464146321, var9 ^ -198060009);
            } else {
               var3[var7] = (char)(var10002 ^ var6);
               var6 = ((var6 >>> 3 | var6 << 5) ^ var3[var7]) & a(464146320, var9 ^ -274102748);
            }
         }

         baa[var2] = new String(var3).intern();
      }

      return baa[var2];
   }

   private Color abb(Color var1, Color var2, double var3) {
      double var5 = Math.max(0.0, Math.min(1.0, var3));
      int var7 = (int)Math.round(var1.getRed() + (var2.getRed() - var1.getRed()) * var5);
      int var8 = (int)Math.round(var1.getGreen() + (var2.getGreen() - var1.getGreen()) * var5);
      int var9 = (int)Math.round(var1.getBlue() + (var2.getBlue() - var1.getBlue()) * var5);
      return new Color(var7, var8, var9);
   }

   // $VF: Irreducible bytecode was duplicated to produce valid code
   static {
      int var33 = -420994170;
      int var26 = 0;
      short var28 = 30010;
      int var27 = 0;
      String[] var25 = new String[7];
      int var24 = "eﭷ摵\ude5aﮔ뛙籛팚䩐饕\ue1f7믥\uf10d\ue8f1⣜镏쎻\uf458ῷ뭱\uf436噙摣Ҏ綕\uf8ce邩㧴釽쓗ࠔ췩ま韃㬖㻎瑖쐹阘篐ྃ㾖\uf389䳁鳇ផ铍薆哈ᐵ\uf381澴ꍕ曊鮹ᶨ畊㶋踭仹ꟷ⊼朗\uf7de븮ꖬ쓳석裉滽\uf3f9\udad7좡㩈㙀塡冁賖\udacd瀼㱇ᚓ\u0a45呷ڇ푖\ud98f牢\uf0a4䊜降桘ꀨℬ鎤위\uec09탤゠⼉慏쩋x\ue71d쉷\ue77f抟\ue47d툊\uebc4披\ueebfꊲ\ue5b5\uf232\ue614\ue256\ueabdቶ\ue82f⊕\ue0cdȂ\ue814抬\ue29fኼ\ued55∾\ue1d4艔\ue37d扺\ue2dfʐ\ue67d鈅\ue3f4犦\ue78f花\uef95戱\uee64ɚ\uee3d퉶\uebdfኚ\ue47d㈉\uebc4\ue2ae\ue64f抹\ue0b5舵\ue7c4\ue25b\ue55dꉴ\ue0cf튕\uefed∃\ue8a4⊡\ued6f䊼\uee15숳\ue914\ue258\ue14d\uf270\ue76fኙ\uec9dሎ\ued24ʪ\ue1ef効\ue0d5∻\ue1e4艜\ue3ed뉺\ueb7f銓\uec4dꈈ\uefe4努\uee4f슿\ueee5툳\uea34뉛\ued0d쉷\ue4ff択\ue62d㈊\ue334튣\ue0ef抺\ue555Ȼ\uee64ɘ\ue69d≴\ue4ff力\uec2d鈎\uef34ꊤ\n鼀弅録쿧龐罼陹俗錂翈\u0010醫合雹⓯闻\uf47c陒瓑頉㓄遃ꑁ鍒␤鲻\ue403\n弱滅匃︧御亼噈縗匳丈\u0010̹暘༫虿ஹ曣Րꙅો虚ơ蛔ठ皻ྉ㚑\nᮐ쾁អ彣ᬀ\ueff8ዩ\udf53ធ\uef4c"
         .length();
      String var23 = "eﭷ摵\ude5aﮔ뛙籛팚䩐饕\ue1f7믥\uf10d\ue8f1⣜镏쎻\uf458ῷ뭱\uf436噙摣Ҏ綕\uf8ce邩㧴釽쓗ࠔ췩ま韃㬖㻎瑖쐹阘篐ྃ㾖\uf389䳁鳇ផ铍薆哈ᐵ\uf381澴ꍕ曊鮹ᶨ畊㶋踭仹ꟷ⊼朗\uf7de븮ꖬ쓳석裉滽\uf3f9\udad7좡㩈㙀塡冁賖\udacd瀼㱇ᚓ\u0a45呷ڇ푖\ud98f牢\uf0a4䊜降桘ꀨℬ鎤위\uec09탤゠⼉慏쩋x\ue71d쉷\ue77f抟\ue47d툊\uebc4披\ueebfꊲ\ue5b5\uf232\ue614\ue256\ueabdቶ\ue82f⊕\ue0cdȂ\ue814抬\ue29fኼ\ued55∾\ue1d4艔\ue37d扺\ue2dfʐ\ue67d鈅\ue3f4犦\ue78f花\uef95戱\uee64ɚ\uee3d퉶\uebdfኚ\ue47d㈉\uebc4\ue2ae\ue64f抹\ue0b5舵\ue7c4\ue25b\ue55dꉴ\ue0cf튕\uefed∃\ue8a4⊡\ued6f䊼\uee15숳\ue914\ue258\ue14d\uf270\ue76fኙ\uec9dሎ\ued24ʪ\ue1ef効\ue0d5∻\ue1e4艜\ue3ed뉺\ueb7f銓\uec4dꈈ\uefe4努\uee4f슿\ueee5툳\uea34뉛\ued0d쉷\ue4ff択\ue62d㈊\ue334튣\ue0ef抺\ue555Ȼ\uee64ɘ\ue69d≴\ue4ff力\uec2d鈎\uef34ꊤ\n鼀弅録쿧龐罼陹俗錂翈\u0010醫合雹⓯闻\uf47c陒瓑頉㓄遃ꑁ鍒␤鲻\ue403\n弱滅匃︧御亼噈縗匳丈\u0010̹暘༫虿ஹ曣Րꙅો虚ơ蛔ठ皻ྉ㚑\nᮐ쾁អ彣ᬀ\ueff8ዩ\udf53ធ\uef4c";

      do {
         char var29 = var23.charAt(var27);
         int var31 = 0;
         char[] var30 = var23.substring(var27 + 1, var27 + 1 + var29).toCharArray();

         do {
            int var32 = var30[var31];

            var32 = (char)(switch (var31 % 7) {
               default -> 79;
               case 1 -> 157;
               case 2 -> 93;
               case 3 -> 119;
               case 4 -> 223;
               case 5 -> 230;
               case 6 -> 182;
            }) ^ var32;
            if (var31 % 2 == 0) {
               var30[var31] = (char)((var32 >>> 4 | var32 << 12) & 65535 ^ var28);
            } else {
               var30[var31] = (char)((var32 << 4 | var32 >>> 12) & 65535 ^ var28);
            }
         } while (++var31 < var30.length);

         var25[var26] = new String(var30);
         var26++;
         var27 = var27 + var29 + 1;
      } while (var27 < var24);

      aaaa = var25;
      aaab = new Object[var25.length];
      byte var37 = 0;
      int var10001 = 0;
      byte[] var10002 = "z\u0001\u007f\u0001i$\u0016ÜÛ+\u0001/ù?£E«ËÖÇÁ\u0001\u000bÒl\u0010ä\u0081¬:Ê\u000e%ÓO\u0005\u000bW^\u0080ä¡\u0013Ü2ù\u0086\u0019o#n\u001e\u009eoKw\u008f|.±}![\u0094I¬´f\u0095y»\u0002\u0000\u0006\u009f¼[zÆ\rTëñåÒm\u0011|S\u0088Rs*¦¾\u0083Èb4B\u00124Ì·N\u00908/)9·M¸ç%5  û\u0005ÆWâÞxñ(1\fâa\u0098Wºå|+\u001b \n\u0086\u0086\u009e+)\u0091â0\u0083°Êe\u0080 N_\u009düYÆiÕTÂ\u000fP_·u³\u0015¤ÌÙ\u0003Éli¼¬\u0006¬\u0004ß\u001b\u001c\u001b\u001b}ö¶·\u001fñá\u0007í\u001dí|\u0016x5JqÉ.D_:\b¬é²\bö©xª<ÿ\rªN\u009cRò\u0010.§\u008c¢.Rp\u001b\u0097é\u001dkSvÀ¹\u001c,mÁ<fÙÔ\u0010\u0006bP.\u000e\\uØ\u0011°â\u001d\u0094\u0085\u009f\u0092\u0083 ûæ\u0015Çö\u0007»\u008c§Ê\u0095b\u0016\u009bºõUE\u0006C\u0018\u0001Ý\u009b\fPþ\b\u0011sÑCö¤ã\u008féh\u0004w\u001eÂ¬\u0016_Òx\u0098×ò\u001a1ô\u0093¦@¹N\u0000=\u0097ªÎ´&ûI}7\u0094\u000b\u0092WÁq{\u0019\u008a>\u008c Þn\u008d¼+*Ý2%ÓSäZîM?\u00adlrÍÒ\u0094\u008cN\u0006Q\u009c\u0015æ\u0098\u0087¨\u008e\rÓ\u001bâyå\u0081P\t:\u0087_\u0007cyLìO\u0017\u0017+>ü\u00193c±Ê@\u009cý\u009eV\u0084âÐ\u0019¦\u0096'K\u0090ËC\u0006ÁlSÆ\u001b\u0085\u0098Ø\u0083Ðà£j\u007fá4\u0096Áä(º\u0092\u008dÒóK0Ý;SERTÐR²\u001bà\u0014\u001aY2¯Çö9øÕl®Ã\u0092\u00061\u0088\u0095u\r\u0012óù\u0002o\u001cÊ®å¤\u0088¾\u0091#Y\f$½á¤rºÙ\u0017\u0086Å Ð\u009cÖÇä\u000b\u001ehé\u0007'`²¤IuÚfêP\u0099-4v:pÞh=E¸\u0081Më¹õòÅ¡íT\u007f\u008f«ÿ\u0000\u0007b\u0088Æ\u00adµõ+èà? 8\u009eò?êqF\nêo«\u0083SrËÍW\u0006ÚÊµ\u0013^(<½*,Ü\u0010KDÏ\tcë!\u008að\u0013rª}\u0001dQXð\u0017\u0092;É_\u008f@Æ<Lq\u008e\u0013¨\u0082\u008d\u0003õýÐðð»¼\u001f«§Bq{\u0004\u0096¤°\u00182I\u0000ïþ#\bí©\\\u0094\u0019È£\u009ex/ãó=\u001càSc\u0085\u00ad9ðÖ\njÏ?yïQ<TT\u0092ÔÀODøÂ×ä·@ëPì\u008e²u/ô\u008aëª«T°Âß¢\u0092Â]éSX(&\u0019þ¢Þw×\u008bFgÃ\u0081\u0089ÝÑæºÛXrÄÌÄx\\\u0016w\u009aåËÀÒï¾\u008d9Ä=åî³\r\u0004ñ(ÞS\u009b\u0012\u0096£Iy*QX§u[¤!(Õü\u0085ôGT\u0013Ì\u008b©{\u0007IJ5\"îr\u001e9CN\u0002ãé_Ì¢\u0012¿¦J\u0085,\u0000ZwV\u0001iÀ¡w¯¦ù®\u0006\u0095Ó\u0081£\u0096=\u000e»/i{#G\u0003Ã\fêWÙ\u0011\u0091{;Ý/3\u0085ò$PÑÒ4ÚÔ»)BK\u0087ÁÃKy\u001c©\u0001#ØCNY®iÙ;\u0096K¬\u0098ùe¯Ä\u0093ï\u0084²\u0096sûÚim4áÝ\u009d\u0013\u001c\t9,¼\u00adÝo\u0084\u009b\b/¨ï+1\u0081\r\u0090S\u001eÄ!¥lÞÝQ\u0013¼|\u0086âCäúÂ`Ô\u008bù\u008eR\u008d|-/Ò½\u0083}Àzâ\u0097\u008b8ãÊ?ÞdUò\u0080tXÎ\u0001À\u0090ÍêÄÂsôöKâ\u0098\u00806üÁT\u009eÎùÕºê)\u008d\nÆ¤jë=?É\u00060AÍ$\u0005ÿ0Ê\u008f%\u0013ÕQW9]\u001f\u0080\u00913}\u0000\u0005T\u008d`\u0019M\u0085)'ÛpGk@A8u¥\u0092d`\u0094E\u008c6p0_òk¬¼LÆ\u00135ä=KùÏ÷×Z·_\u00944Ê¿°p®Ù¢pò\u00ad¼ïéo\u0084m\u0094±E\u0007÷\u001bî²h\u0081S\u009f· \u009e¼¬8À\u008eÌ§h¦\u0003á\u008c¯\u0098-Nå\u0087½Ó2ú\u008c\"\u001f)\u0012CwlJ\u0093hq\u0016xS8XþÞ\u001bËòþ)òÑ$B\t°÷\u0085\u0098¸ãáQ\u0002\u008cb?Í\u0090«\u000fµ\u0014%IÂ\u0085\fñ¦%Õæ®;¡ª\u009c½G¸#\u009d®@s\u000e}vø¤\u0095\u009f\u008a¶ð\u008f}\u0088\u0083\b\u008c\f+à\u0010õóÇP8þÙ3²Vá´rÃ¡ù\u001d\u0004\u00808º.®\u009d\u001bØ°Lh¶\u0018\u008eLTvùZ\u001fÿAgkÉçÌJ7\u0088ºÃ\u000e0c¹%Aä·£\u0005¿ÉÎ1\u0015"
         .getBytes("ISO-8859-1");
      bbb = new int[325];

      int var84;
      do {
         bbb[var37] = (
               (var10002[var10001] & 255) << 24 | (var10002[var10001 + 1] & 255) << 16 | (var10002[var10001 + 2] & 255) << 8 | var10002[var10001 + 3] & 255
            )
            ^ -1972422227;
         var37 += 1;
         var84 = var10001 + 4;
         var10001 += 4;
      } while (var84 < var10002.length);

      String[] var21 = new String[2];
      int var19 = 0;
      String var18;
      int var20 = (var18 = b(2066578254, var33 ^ -674221727)).length();
      int var17 = a(464146324, var33 ^ -258947271);
      int var16 = -1;

      while (true) {
         label120: {
            char[] var44 = var18.substring(++var16, var16 + var17).toCharArray();
            var84 = var44.length;
            int var22 = 0;
            var67 = var44;
            var10001 = var84;
            char[] var88;
            int var105;
            if (var84 <= 1) {
               var88 = var44;
               var105 = var22;
            } else {
               var67 = var44;
               var10001 = var84;
               if (var84 <= var22) {
                  break label120;
               }

               var88 = var44;
               var105 = var22;
            }

            while (true) {
               var88[var105] = (char)(var88[var105] ^ switch (var22 % a(464146327, var33 ^ -1918814528)) {
                  case 0 -> a(464146326, var33 ^ 1581209450);
                  case 1 -> a(464146345, var33 ^ 459769725);
                  case 2 -> a(464146344, var33 ^ 104557645);
                  case 3 -> a(464146347, var33 ^ 1333127920);
                  case 4 -> a(464146346, var33 ^ 1827071671);
                  case 5 -> a(464146349, var33 ^ 1591723372);
                  default -> a(464146348, var33 ^ 891593755);
               });
               var22++;
               if (var10001 == 0) {
                  var105 = var10001;
                  var88 = var67;
               } else {
                  if (var10001 <= var22) {
                     break;
                  }

                  var88 = var67;
                  var105 = var22;
               }
            }
         }

         String var95 = new String(var67).intern();
         int var51 = -1;
         var21[var19++] = var95;
         if ((var16 += var17) >= var20) {
            aba = var21;
            baa = new String[2];
            long var8 = 3801565264172366998L;
            long[] var14 = new long[a(464146351, var33 ^ -222974946)];
            int var11 = 0;
            String var12;
            int var13 = (var12 = b(2066578255, var33 ^ 1678253198)).length();
            byte var10 = 0;

            label104:
            while (true) {
               var51 = var10;
               var10 += 8;
               String var38 = var12.substring(var51, var10);
               var51 = 2066578252;
               int var72 = var33 ^ -1287834431;
               byte[] var15 = var38.getBytes("ISO-8859-1");
               long[] var39 = var14;
               var51 = var11++;
               long var73 = (var15[0] & 255L) << a(464146350, var33 ^ -1770252631)
                  | (var15[1] & 255L) << a(464146337, var33 ^ 353556866)
                  | (var15[2] & 255L) << a(464146336, var33 ^ -601710321)
                  | (var15[3] & 255L) << a(464146339, var33 ^ 1382340229)
                  | (var15[4] & 255L) << a(464146338, var33 ^ 2078061100)
                  | (var15[5] & 255L) << a(464146341, var33 ^ -1563706675)
                  | (var15[a(464146340, var33 ^ -695760816)] & 255L) << a(464146343, var33 ^ 815085409)
                  | var15[a(464146342, var33 ^ -647141408)] & 255L;
               byte var96 = -1;

               while (true) {
                  long var107 = var73 ^ var8;
                  switch (var96) {
                     case 0:
                        var39[var51] = var107;
                        if (var10 >= var13) {
                           aab = var14;
                           bb = new Integer[a(464146352, var33 ^ 1940728920)];
                           ab = bab(a(464146355, var33 ^ 1501782765), 4284689850104600369L);
                           bab = bab(a(464146354, var33 ^ -1348628152), 7004140630580753762L);
                           long var0 = 1320724226787065421L;
                           long[] var6 = new long[2];
                           int var3 = 0;
                           String var4;
                           int var5 = (var4 = b(2066578251, var33 ^ 717164593)).length();
                           byte var2 = 0;

                           do {
                              int var57 = var2;
                              var2 += 8;
                              String var41 = var4.substring(var57, var2);
                              var57 = 2066578248;
                              int var76 = var33 ^ -1149995611;
                              byte[] var7 = var41.getBytes("ISO-8859-1");
                              var57 = var3++;
                              var107 = (
                                    (var7[0] & 255L) << a(464146357, var33 ^ -1053451662)
                                       | (var7[1] & 255L) << a(464146356, var33 ^ 593227101)
                                       | (var7[2] & 255L) << a(464146359, var33 ^ 1758614891)
                                       | (var7[3] & 255L) << a(464146358, var33 ^ 484766681)
                                       | (var7[4] & 255L) << a(464146377, var33 ^ 1025154264)
                                       | (var7[5] & 255L) << a(464146376, var33 ^ -1272765192)
                                       | (var7[a(464146379, var33 ^ -838314650)] & 255L) << a(464146378, var33 ^ -1064431314)
                                       | var7[a(464146381, var33 ^ -1092409968)] & 255L
                                 )
                                 ^ var0;
                              var96 = -1;
                              var6[var57] = var107;
                           } while (var2 < var5);

                           ba = var6;
                           bba = new Long[2];
                           abb = new String[2];
                           ba();
                           return;
                        }
                        break;
                     default:
                        var39[var51] = var107;
                        if (var10 < var13) {
                           continue label104;
                        }

                        var13 = (var12 = b(2066578253, var33 ^ 66868479)).length();
                        var10 = 0;
                  }

                  int var55 = var10;
                  var10 += 8;
                  String var40 = var12.substring(var55, var10);
                  var55 = 2066578250;
                  int var75 = var33 ^ -1354875218;
                  var15 = var40.getBytes("ISO-8859-1");
                  var39 = var14;
                  var51 = var11++;
                  var73 = (var15[0] & 255L) << a(464146361, var33 ^ 173796502)
                     | (var15[1] & 255L) << a(464146360, var33 ^ -491610435)
                     | (var15[2] & 255L) << a(464146363, var33 ^ -2019399288)
                     | (var15[3] & 255L) << a(464146362, var33 ^ -198862827)
                     | (var15[4] & 255L) << a(464146365, var33 ^ 1556940003)
                     | (var15[5] & 255L) << a(464146364, var33 ^ -2065021737)
                     | (var15[a(464146367, var33 ^ -1980487868)] & 255L) << a(464146366, var33 ^ 567058583)
                     | var15[a(464146353, var33 ^ -1265832476)] & 255L;
                  var96 = 0;
               }
            }
         }

         var17 = var18.charAt(var16);
      }
   }

   private static int bab(int var0, long var1) {
      int var3 = var0 ^ (int)(var1 & 32767L) ^ a(464146323, -1019592175 ^ -1638398181);
      if (bb[var3] == null) {
         bb[var3] = (int)(aab[var3] ^ var1);
      }

      return bb[var3];
   }

   private static long bba(int var0, long var1) {
      int var3 = (var0 ^ (int)var1 ^ a(464146322, 789490129 ^ -1121307299)) & a(464146325, 789490129 ^ 652610903);
      if (bba[var3] == null) {
         bba[var3] = ba[var3] ^ var1;
      }

      return bba[var3];
   }

   @Override
   public void baa(aabbbbaaa param1) {
      // $VF: Couldn't be decompiled
      // Please report this to the Vineflower issue tracker, at https://github.com/Vineflower/vineflower/issues with a copy of the class file (if you have the rights to distribute it!)
      // java.lang.RuntimeException: parsing failure!
      //   at org.jetbrains.java.decompiler.modules.decompiler.decompose.DomHelper.parseGraph(DomHelper.java:211)
      //   at org.jetbrains.java.decompiler.main.rels.MethodProcessor.codeToJava(MethodProcessor.java:166)
      //
      // Bytecode:
      // 00: getstatic qeaa361f143ee4a0894bd168fd9b30c66/qf4ccf8f5435d4a78bdca4d6a018b578e/baaabbaa.bba I
      // 03: istore 2
      // 04: aload 0
      // 05: invokevirtual qeaa361f143ee4a0894bd168fd9b30c66/qf4ccf8f5435d4a78bdca4d6a018b578e/aaab.babbaab ()Z
      // 08: iload 2
      // 09: ifne 1b
      // 0c: ifeq 1e
      // 0f: goto 13
      // 12: athrow
      // 13: aload 1
      // 14: invokestatic qeaa361f143ee4a0894bd168fd9b30c66/qf4ccf8f5435d4a78bdca4d6a018b578e/bbaabbaa.bba (Ljava/lang/Object;)Z
      // 17: goto 1b
      // 1a: athrow
      // 1b: ifne 1f
      // 1e: return
      // 1f: invokestatic net/minecraft/class_310.method_1551 ()Lnet/minecraft/class_310;
      // 22: astore 3
      // 23: aload 3
      // 24: iload 2
      // 25: ifne 30
      // 28: ifnull 51
      // 2b: goto 2f
      // 2e: athrow
      // 2f: aload 3
      // 30: iload 2
      // 31: ifne 43
      // 34: getfield net/minecraft/class_310.field_1687 Lnet/minecraft/class_638;
      // 37: ifnull 51
      // 3a: goto 3e
      // 3d: athrow
      // 3e: aload 3
      // 3f: goto 43
      // 42: athrow
      // 43: iload 2
      // 44: ifne 54
      // 47: getfield net/minecraft/class_310.field_1724 Lnet/minecraft/class_746;
      // 4a: ifnonnull 53
      // 4d: goto 51
      // 50: athrow
      // 51: return
      // 52: athrow
      // 53: aload 3
      // 54: invokestatic qeaa361f143ee4a0894bd168fd9b30c66/qf4ccf8f5435d4a78bdca4d6a018b578e/aabbabbbb.abbaa (Lnet/minecraft/class_310;)F
      // 57: fstore 4
      // 59: aload 3
      // 5a: getfield net/minecraft/class_310.field_1687 Lnet/minecraft/class_638;
      // 5d: invokevirtual net/minecraft/class_638.method_18456 ()Ljava/util/List;
      // 60: invokeinterface java/util/List.iterator ()Ljava/util/Iterator; 1
      // 65: astore 5
      // 67: aload 5
      // 69: invokeinterface java/util/Iterator.hasNext ()Z 1
      // 6e: ifeq fb
      // 71: aload 5
      // 73: invokeinterface java/util/Iterator.next ()Ljava/lang/Object; 1
      // 78: checkcast net/minecraft/class_1657
      // 7b: astore 6
      // 7d: aload 6
      // 7f: iload 2
      // 80: ifne 8c
      // 83: ifnull 67
      // 86: goto 8a
      // 89: athrow
      // 8a: aload 6
      // 8c: iload 2
      // 8d: ifne 9c
      // 90: invokevirtual net/minecraft/class_1657.method_5805 ()Z
      // 93: ifeq 67
      // 96: goto 9a
      // 99: athrow
      // 9a: aload 6
      // 9c: iload 2
      // 9d: ifne ac
      // a0: invokevirtual net/minecraft/class_1657.method_31481 ()Z
      // a3: ifne 67
      // a6: goto aa
      // a9: athrow
      // aa: aload 6
      // ac: iload 2
      // ad: ifne c0
      // b0: invokevirtual net/minecraft/class_1657.method_7325 ()Z
      // b3: ifeq be
      // b6: goto ba
      // b9: athrow
      // ba: goto 67
      // bd: athrow
      // be: aload 6
      // c0: iload 2
      // c1: ifne d5
      // c4: aload 3
      // c5: getfield net/minecraft/class_310.field_1724 Lnet/minecraft/class_746;
      // c8: if_acmpne d3
      // cb: goto cf
      // ce: athrow
      // cf: goto 67
      // d2: athrow
      // d3: aload 6
      // d5: fload 4
      // d7: invokestatic qeaa361f143ee4a0894bd168fd9b30c66/qf4ccf8f5435d4a78bdca4d6a018b578e/bbaabbaa.aa (Lnet/minecraft/class_1297;F)Lnet/minecraft/class_243;
      // da: astore 7
      // dc: aload 0
      // dd: aload 3
      // de: aload 6
      // e0: aload 7
      // e2: invokevirtual qeaa361f143ee4a0894bd168fd9b30c66/qf4ccf8f5435d4a78bdca4d6a018b578e/aaab.aab (Lnet/minecraft/class_310;Lnet/minecraft/class_1657;Lnet/minecraft/class_243;)Lnet/minecraft/class_243;
      // e5: astore 8
      // e7: aload 8
      // e9: ifnull f7
      // ec: aload 0
      // ed: aload 1
      // ee: aload 8
      // f0: invokevirtual qeaa361f143ee4a0894bd168fd9b30c66/qf4ccf8f5435d4a78bdca4d6a018b578e/aaab.ab (Lqeaa361f143ee4a0894bd168fd9b30c66/qf4ccf8f5435d4a78bdca4d6a018b578e/aabbbbaaa;Lnet/minecraft/class_243;)V
      // f3: goto f7
      // f6: athrow
      // f7: iload 2
      // f8: ifeq 67
      // fb: return
   }

   private static String b(int var0, int var1) {
      int var3 = var0 ^ 2066578254;
      char[] var4 = aaaa[var3].toCharArray();
      StackTraceElement[] var2 = (StackTraceElement[])aaab[var3];
      StackTraceElement[] var5;
      if (var2 != null) {
         var5 = var2;
      } else {
         var5 = new Throwable().getStackTrace();
         aaab[var3] = var5;
      }

      StackTraceElement var6 = var5[1];
      int var7 = (var6.getClassName().hashCode() ^ var6.getMethodName().hashCode()) >> 16 ^ -2032505313;
      int var8 = 0;

      do {
         var4[var8] = (char)(var4[var8] ^ switch (var8 & 31) {
            default -> 104;
            case 1 -> 3;
            case 2 -> 172;
            case 3 -> 244;
            case 4 -> 25;
            case 5 -> 74;
            case 6 -> 140;
            case 7 -> 104;
            case 8 -> 193;
            case 9 -> 179;
            case 10 -> 238;
            case 11 -> 49;
            case 12 -> 67;
            case 13 -> 225;
            case 14 -> 227;
            case 15 -> 239;
            case 16 -> 30;
            case 17 -> 134;
            case 18 -> 181;
            case 19 -> 150;
            case 20 -> 105;
            case 21 -> 144;
            case 22 -> 167;
            case 23 -> 214;
            case 24 -> 23;
            case 25 -> 132;
            case 26 -> 188;
            case 27 -> 241;
            case 28 -> 224;
            case 29 -> 85;
            case 30 -> 135;
            case 31 -> 69;
         } ^ var1 >> 16 ^ var7);
      } while (++var8 < var4.length);

      return new String(var4).intern();
   }

   public aaab() {
      super(
         aabbaaaba.aaab(abb[1]),
         bbaabbba.bab,
         aabbaaaba.aaab(abb[0])
      );
   }
}
