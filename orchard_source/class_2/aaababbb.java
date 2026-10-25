package nsc;

import com.mojang.blaze3d.pipeline.BlendFunction;
import com.mojang.blaze3d.pipeline.RenderPipeline;
import com.mojang.blaze3d.pipeline.RenderPipeline.Snippet;
import com.mojang.blaze3d.platform.DepthTestFunction;
import com.mojang.blaze3d.vertex.VertexFormat.class_5596;
import net.fabricmc.api.EnvType;
import net.fabricmc.api.Environment;
import net.minecraft.class_10799;
import net.minecraft.class_11231;
import net.minecraft.class_290;
import net.minecraft.class_2960;
import net.minecraft.class_332;
import net.minecraft.class_4588;
import net.minecraft.class_8030;
import org.joml.Matrix3x2f;
import org.joml.Matrix3x2fc;
import org.jspecify.annotations.Nullable;

@Environment(EnvType.CLIENT)
final class aaababbb {
   private static final float aa = 2.0F;
   private static final class_11231 ab;
   private static final Object[] abaab;
   private static final int ba;
   private static final RenderPipeline bb;
   private static final ababbbbaa aaa;
   private static final int aab;
   private static final ababbbbaa aba;
   private static final int abb = 1;
   private static final ababbbbaa baa;
   private static final RenderPipeline bab;
   private static final int bba;
   private static final int bbb = 0;
   private static final int aaaa;
   private static final RenderPipeline aaab;
   private static final ababbbbaa aaba;
   private static final RenderPipeline b;
   private static final float aabb = 12.0F;
   private static final long[] abaa;
   private static final float abab = 8.0F;
   private static final int[] aabbb;
   private static final ababbbbaa abba;
   private static final int abbb;
   private static final int baaa;
   private static final ababbbbaa baab;
   private static final ababbbbaa baba;
   private static final int babb;
   private static final RenderPipeline bbaa;
   private static final String[] abaaa;
   private static final ababbbbaa bbab;
   private static final int bbba;
   private static final float bbbb = 1.25F;
   private static final ababbbbaa aaaaa;
   private static final ababbbbaa aaaab;
   private static final int a;
   private static final float aaaba = 8.0F;
   private static final ababbbbaa aaabb;
   private static final Integer[] aabaa;
   private static final ababbbbaa aabab;
   private static final RenderPipeline aabba;

   private static void aa(class_4588 param0, Matrix3x2fc param1, float param2, float param3, float param4, float param5, int param6) {
      // $VF: Couldn't be decompiled
      // Please report this to the Vineflower issue tracker, at https://github.com/Vineflower/vineflower/issues with a copy of the class file (if you have the rights to distribute it!)
      // java.lang.RuntimeException: parsing failure!
      //   at org.jetbrains.java.decompiler.modules.decompiler.decompose.DomHelper.parseGraph(DomHelper.java:211)
      //   at org.jetbrains.java.decompiler.main.rels.MethodProcessor.codeToJava(MethodProcessor.java:166)
      //
      // Bytecode:
      // 000: getstatic qeaa361f143ee4a0894bd168fd9b30c66/qf4ccf8f5435d4a78bdca4d6a018b578e/baaabbaa.bba I
      // 003: fload 4
      // 005: fload 5
      // 007: ldc 0.5
      // 009: fmul
      // 00a: fadd
      // 00b: fstore 8
      // 00d: istore 7
      // 00f: fconst_0
      // 010: fload 4
      // 012: fload 5
      // 014: ldc 0.5
      // 016: fmul
      // 017: fsub
      // 018: invokestatic java/lang/Math.max (FF)F
      // 01b: fstore 9
      // 01d: fload 9
      // 01f: iload 7
      // 021: ifne 03c
      // 024: fconst_0
      // 025: fcmpg
      // 026: ifgt 03a
      // 029: goto 02d
      // 02c: athrow
      // 02d: aload 0
      // 02e: aload 1
      // 02f: fload 2
      // 030: fload 3
      // 031: fload 8
      // 033: iload 6
      // 035: invokestatic qeaa361f143ee4a0894bd168fd9b30c66/qf4ccf8f5435d4a78bdca4d6a018b578e/aaababbb.aaaaaa (Lnet/minecraft/class_4588;Lorg/joml/Matrix3x2fc;FFFI)V
      // 038: return
      // 039: athrow
      // 03a: fload 8
      // 03c: invokestatic qeaa361f143ee4a0894bd168fd9b30c66/qf4ccf8f5435d4a78bdca4d6a018b578e/aaababbb.abbba (F)I
      // 03f: istore 10
      // 041: bipush 0
      // 042: istore 11
      // 044: iload 11
      // 046: iload 10
      // 048: if_icmpge 119
      // 04b: ldc2_w 6.283185307179586
      // 04e: iload 11
      // 050: i2d
      // 051: dmul
      // 052: iload 10
      // 054: i2d
      // 055: ddiv
      // 056: dstore 12
      // 058: iload 7
      // 05a: ldc2_w 6.283185307179586
      // 05d: iload 11
      // 05f: bipush 1
      // 060: iadd
      // 061: i2d
      // 062: dmul
      // 063: iload 10
      // 065: i2d
      // 066: ddiv
      // 067: dstore 14
      // 069: fload 2
      // 06a: dload 12
      // 06c: invokestatic java/lang/Math.cos (D)D
      // 06f: d2f
      // 070: fload 8
      // 072: fmul
      // 073: fadd
      // 074: fstore 16
      // 076: fload 3
      // 077: dload 12
      // 079: invokestatic java/lang/Math.sin (D)D
      // 07c: d2f
      // 07d: fload 8
      // 07f: fmul
      // 080: fadd
      // 081: fstore 17
      // 083: fload 2
      // 084: dload 14
      // 086: invokestatic java/lang/Math.cos (D)D
      // 089: d2f
      // 08a: fload 8
      // 08c: fmul
      // 08d: fadd
      // 08e: fstore 18
      // 090: fload 3
      // 091: dload 14
      // 093: invokestatic java/lang/Math.sin (D)D
      // 096: d2f
      // 097: fload 8
      // 099: fmul
      // 09a: fadd
      // 09b: fstore 19
      // 09d: fload 2
      // 09e: dload 12
      // 0a0: invokestatic java/lang/Math.cos (D)D
      // 0a3: d2f
      // 0a4: fload 9
      // 0a6: fmul
      // 0a7: fadd
      // 0a8: fstore 20
      // 0aa: fload 3
      // 0ab: dload 12
      // 0ad: invokestatic java/lang/Math.sin (D)D
      // 0b0: d2f
      // 0b1: fload 9
      // 0b3: fmul
      // 0b4: fadd
      // 0b5: fstore 21
      // 0b7: fload 2
      // 0b8: dload 14
      // 0ba: invokestatic java/lang/Math.cos (D)D
      // 0bd: d2f
      // 0be: fload 9
      // 0c0: fmul
      // 0c1: fadd
      // 0c2: fstore 22
      // 0c4: fload 3
      // 0c5: dload 14
      // 0c7: invokestatic java/lang/Math.sin (D)D
      // 0ca: d2f
      // 0cb: fload 9
      // 0cd: fmul
      // 0ce: fadd
      // 0cf: fstore 23
      // 0d1: aload 0
      // 0d2: aload 1
      // 0d3: fload 16
      // 0d5: fload 17
      // 0d7: iload 6
      // 0d9: invokestatic qeaa361f143ee4a0894bd168fd9b30c66/qf4ccf8f5435d4a78bdca4d6a018b578e/aaababbb.babaa (Lnet/minecraft/class_4588;Lorg/joml/Matrix3x2fc;FFI)V
      // 0dc: aload 0
      // 0dd: aload 1
      // 0de: fload 18
      // 0e0: fload 19
      // 0e2: iload 6
      // 0e4: invokestatic qeaa361f143ee4a0894bd168fd9b30c66/qf4ccf8f5435d4a78bdca4d6a018b578e/aaababbb.babaa (Lnet/minecraft/class_4588;Lorg/joml/Matrix3x2fc;FFI)V
      // 0e7: aload 0
      // 0e8: aload 1
      // 0e9: fload 22
      // 0eb: fload 23
      // 0ed: iload 6
      // 0ef: invokestatic qeaa361f143ee4a0894bd168fd9b30c66/qf4ccf8f5435d4a78bdca4d6a018b578e/aaababbb.babaa (Lnet/minecraft/class_4588;Lorg/joml/Matrix3x2fc;FFI)V
      // 0f2: aload 0
      // 0f3: aload 1
      // 0f4: fload 16
      // 0f6: fload 17
      // 0f8: iload 6
      // 0fa: invokestatic qeaa361f143ee4a0894bd168fd9b30c66/qf4ccf8f5435d4a78bdca4d6a018b578e/aaababbb.babaa (Lnet/minecraft/class_4588;Lorg/joml/Matrix3x2fc;FFI)V
      // 0fd: aload 0
      // 0fe: aload 1
      // 0ff: fload 22
      // 101: fload 23
      // 103: iload 6
      // 105: invokestatic qeaa361f143ee4a0894bd168fd9b30c66/qf4ccf8f5435d4a78bdca4d6a018b578e/aaababbb.babaa (Lnet/minecraft/class_4588;Lorg/joml/Matrix3x2fc;FFI)V
      // 108: aload 0
      // 109: aload 1
      // 10a: fload 20
      // 10c: fload 21
      // 10e: iload 6
      // 110: invokestatic qeaa361f143ee4a0894bd168fd9b30c66/qf4ccf8f5435d4a78bdca4d6a018b578e/aaababbb.babaa (Lnet/minecraft/class_4588;Lorg/joml/Matrix3x2fc;FFI)V
      // 113: iinc 11 1
      // 116: ifeq 044
      // 119: return
   }

   private aaababbb() {
   }

   static boolean ab(class_332 param0, double param1, double param3, double param5, double param7, double param9, int param11) {
      // $VF: Couldn't be decompiled
      // Please report this to the Vineflower issue tracker, at https://github.com/Vineflower/vineflower/issues with a copy of the class file (if you have the rights to distribute it!)
      // java.lang.RuntimeException: parsing failure!
      //   at org.jetbrains.java.decompiler.modules.decompiler.decompose.DomHelper.parseGraph(DomHelper.java:211)
      //   at org.jetbrains.java.decompiler.main.rels.MethodProcessor.codeToJava(MethodProcessor.java:166)
      //
      // Bytecode:
      // 00: getstatic qeaa361f143ee4a0894bd168fd9b30c66/qf4ccf8f5435d4a78bdca4d6a018b578e/baaabbaa.bba I
      // 03: istore 12
      // 05: dload 5
      // 07: dconst_0
      // 08: dcmpg
      // 09: iload 12
      // 0b: ifne 76
      // 0e: ifle 71
      // 11: goto 15
      // 14: athrow
      // 15: dload 7
      // 17: dconst_0
      // 18: dcmpg
      // 19: iload 12
      // 1b: ifne 76
      // 1e: goto 22
      // 21: athrow
      // 22: ifle 71
      // 25: goto 29
      // 28: athrow
      // 29: dload 9
      // 2b: dconst_0
      // 2c: dcmpg
      // 2d: iload 12
      // 2f: ifne 76
      // 32: goto 36
      // 35: athrow
      // 36: ifle 71
      // 39: goto 3d
      // 3c: athrow
      // 3d: iload 11
      // 3f: ldc 1171217852
      // 41: ldc 1046564282
      // 43: ldc -1222348813
      // 45: ixor
      // 46: invokestatic qeaa361f143ee4a0894bd168fd9b30c66/qf4ccf8f5435d4a78bdca4d6a018b578e/aaababbb.a (II)I
      // 49: ldc2_w 6485509548550546198
      // 4c: invokestatic qeaa361f143ee4a0894bd168fd9b30c66/qf4ccf8f5435d4a78bdca4d6a018b578e/aaababbb.abbbb (IJ)I
      // 4f: iushr
      // 50: iload 12
      // 52: ifne 76
      // 55: goto 59
      // 58: athrow
      // 59: ldc 1171217853
      // 5b: ldc 1046564282
      // 5d: ldc 87877535
      // 5f: ixor
      // 60: invokestatic qeaa361f143ee4a0894bd168fd9b30c66/qf4ccf8f5435d4a78bdca4d6a018b578e/aaababbb.a (II)I
      // 63: ldc2_w 5562011275870078093
      // 66: invokestatic qeaa361f143ee4a0894bd168fd9b30c66/qf4ccf8f5435d4a78bdca4d6a018b578e/aaababbb.abbbb (IJ)I
      // 69: iand
      // 6a: ifgt 77
      // 6d: goto 71
      // 70: athrow
      // 71: bipush 1
      // 72: goto 76
      // 75: athrow
      // 76: ireturn
      // 77: dconst_0
      // 78: dload 5
      // 7a: invokestatic java/lang/Math.max (DD)D
      // 7d: d2f
      // 7e: fstore 13
      // 80: ldc2_w 0.25
      // 83: dload 7
      // 85: invokestatic java/lang/Math.max (DD)D
      // 88: d2f
      // 89: fstore 14
      // 8b: fload 13
      // 8d: fload 14
      // 8f: ldc 0.5
      // 91: fmul
      // 92: fadd
      // 93: fconst_2
      // 94: fadd
      // 95: fstore 15
      // 97: aload 0
      // 98: getfield net/minecraft/class_332.field_59826 Lnet/minecraft/class_11246;
      // 9b: new qeaa361f143ee4a0894bd168fd9b30c66/qf4ccf8f5435d4a78bdca4d6a018b578e/aaabbba
      // 9e: dup
      // 9f: new org/joml/Matrix3x2f
      // a2: dup
      // a3: aload 0
      // a4: invokevirtual net/minecraft/class_332.method_51448 ()Lorg/joml/Matrix3x2fStack;
      // a7: invokespecial org/joml/Matrix3x2f.<init> (Lorg/joml/Matrix3x2fc;)V
      // aa: dload 1
      // ab: d2f
      // ac: dload 3
      // ad: d2f
      // ae: fload 15
      // b0: fload 13
      // b2: fload 14
      // b4: dload 9
      // b6: d2f
      // b7: invokestatic qeaa361f143ee4a0894bd168fd9b30c66/qf4ccf8f5435d4a78bdca4d6a018b578e/aaababbb.babb (F)F
      // ba: iload 11
      // bc: aload 0
      // bd: getfield net/minecraft/class_332.field_44659 Lnet/minecraft/class_332$class_8214;
      // c0: invokevirtual net/minecraft/class_332$class_8214.method_70863 ()Lnet/minecraft/class_8030;
      // c3: invokespecial qeaa361f143ee4a0894bd168fd9b30c66/qf4ccf8f5435d4a78bdca4d6a018b578e/aaabbba.<init> (Lorg/joml/Matrix3x2fc;FFFFFFILnet/minecraft/class_8030;)V
      // c6: invokevirtual net/minecraft/class_11246.method_70919 (Lnet/minecraft/class_11244;)V
      // c9: bipush 1
      // ca: ireturn
   }

   static boolean ba(
      class_332 var0, class_2960 var1, double var2, double var4, double var6, double var8, float var10, float var11, float var12, float var13, int var14
   ) {
      return bbbb(var0, var1, var2, var4, var6, var8, var10, var11, var12, var13, var14, 12.0F);
   }

   static boolean bb(class_332 param0, double param1, double param3, double param5, double param7, double param9, double param11, int param13) {
      // $VF: Couldn't be decompiled
      // Please report this to the Vineflower issue tracker, at https://github.com/Vineflower/vineflower/issues with a copy of the class file (if you have the rights to distribute it!)
      // java.lang.RuntimeException: parsing failure!
      //   at org.jetbrains.java.decompiler.modules.decompiler.decompose.DomHelper.parseGraph(DomHelper.java:211)
      //   at org.jetbrains.java.decompiler.main.rels.MethodProcessor.codeToJava(MethodProcessor.java:166)
      //
      // Bytecode:
      // 000: getstatic qeaa361f143ee4a0894bd168fd9b30c66/qf4ccf8f5435d4a78bdca4d6a018b578e/baaabbaa.bba I
      // 003: istore 14
      // 005: dload 5
      // 007: dconst_0
      // 008: dcmpg
      // 009: iload 14
      // 00b: ifne 076
      // 00e: ifle 071
      // 011: goto 015
      // 014: athrow
      // 015: dload 7
      // 017: dconst_0
      // 018: dcmpg
      // 019: iload 14
      // 01b: ifne 076
      // 01e: goto 022
      // 021: athrow
      // 022: ifle 071
      // 025: goto 029
      // 028: athrow
      // 029: dload 11
      // 02b: dconst_0
      // 02c: dcmpg
      // 02d: iload 14
      // 02f: ifne 076
      // 032: goto 036
      // 035: athrow
      // 036: ifle 071
      // 039: goto 03d
      // 03c: athrow
      // 03d: iload 13
      // 03f: ldc 1171217854
      // 041: ldc -532582420
      // 043: ldc 70623654
      // 045: ixor
      // 046: invokestatic qeaa361f143ee4a0894bd168fd9b30c66/qf4ccf8f5435d4a78bdca4d6a018b578e/aaababbb.a (II)I
      // 049: ldc2_w 6485509548550546198
      // 04c: invokestatic qeaa361f143ee4a0894bd168fd9b30c66/qf4ccf8f5435d4a78bdca4d6a018b578e/aaababbb.abbbb (IJ)I
      // 04f: iushr
      // 050: iload 14
      // 052: ifne 076
      // 055: goto 059
      // 058: athrow
      // 059: ldc 1171217855
      // 05b: ldc -532582420
      // 05d: ldc -153085814
      // 05f: ixor
      // 060: invokestatic qeaa361f143ee4a0894bd168fd9b30c66/qf4ccf8f5435d4a78bdca4d6a018b578e/aaababbb.a (II)I
      // 063: ldc2_w 5562011275870078093
      // 066: invokestatic qeaa361f143ee4a0894bd168fd9b30c66/qf4ccf8f5435d4a78bdca4d6a018b578e/aaababbb.abbbb (IJ)I
      // 069: iand
      // 06a: ifgt 077
      // 06d: goto 071
      // 070: athrow
      // 071: bipush 1
      // 072: goto 076
      // 075: athrow
      // 076: ireturn
      // 077: dload 5
      // 079: dload 7
      // 07b: dload 9
      // 07d: invokestatic qeaa361f143ee4a0894bd168fd9b30c66/qf4ccf8f5435d4a78bdca4d6a018b578e/aaababbb.bbba (DDD)D
      // 080: dstore 15
      // 082: ldc2_w 0.25
      // 085: dload 11
      // 087: invokestatic java/lang/Math.max (DD)D
      // 08a: d2f
      // 08b: fstore 17
      // 08d: dload 1
      // 08e: fload 17
      // 090: f2d
      // 091: dsub
      // 092: d2f
      // 093: fstore 18
      // 095: dload 3
      // 096: fload 17
      // 098: f2d
      // 099: dsub
      // 09a: d2f
      // 09b: fstore 19
      // 09d: dload 5
      // 09f: fload 17
      // 0a1: fconst_2
      // 0a2: fmul
      // 0a3: f2d
      // 0a4: dadd
      // 0a5: d2f
      // 0a6: fstore 20
      // 0a8: dload 7
      // 0aa: fload 17
      // 0ac: fconst_2
      // 0ad: fmul
      // 0ae: f2d
      // 0af: dadd
      // 0b0: d2f
      // 0b1: fstore 21
      // 0b3: dload 15
      // 0b5: fload 17
      // 0b7: f2d
      // 0b8: dadd
      // 0b9: d2f
      // 0ba: fstore 22
      // 0bc: aload 0
      // 0bd: getfield net/minecraft/class_332.field_59826 Lnet/minecraft/class_11246;
      // 0c0: new qeaa361f143ee4a0894bd168fd9b30c66/qf4ccf8f5435d4a78bdca4d6a018b578e/bbababba
      // 0c3: dup
      // 0c4: new org/joml/Matrix3x2f
      // 0c7: dup
      // 0c8: aload 0
      // 0c9: invokevirtual net/minecraft/class_332.method_51448 ()Lorg/joml/Matrix3x2fStack;
      // 0cc: invokespecial org/joml/Matrix3x2f.<init> (Lorg/joml/Matrix3x2fc;)V
      // 0cf: fload 18
      // 0d1: fload 19
      // 0d3: fload 20
      // 0d5: fload 21
      // 0d7: fload 22
      // 0d9: fload 17
      // 0db: ldc 1171217848
      // 0dd: ldc -532582420
      // 0df: ldc -187976317
      // 0e1: ixor
      // 0e2: invokestatic qeaa361f143ee4a0894bd168fd9b30c66/qf4ccf8f5435d4a78bdca4d6a018b578e/aaababbb.a (II)I
      // 0e5: ldc2_w 4156860643223983289
      // 0e8: invokestatic qeaa361f143ee4a0894bd168fd9b30c66/qf4ccf8f5435d4a78bdca4d6a018b578e/aaababbb.abbbb (IJ)I
      // 0eb: iload 13
      // 0ed: iload 13
      // 0ef: iload 13
      // 0f1: iload 13
      // 0f3: aload 0
      // 0f4: getfield net/minecraft/class_332.field_44659 Lnet/minecraft/class_332$class_8214;
      // 0f7: invokevirtual net/minecraft/class_332$class_8214.method_70863 ()Lnet/minecraft/class_8030;
      // 0fa: invokespecial qeaa361f143ee4a0894bd168fd9b30c66/qf4ccf8f5435d4a78bdca4d6a018b578e/bbababba.<init> (Lorg/joml/Matrix3x2fc;FFFFFFIIIIILnet/minecraft/class_8030;)V
      // 0fd: invokevirtual net/minecraft/class_11246.method_70919 (Lnet/minecraft/class_11244;)V
      // 100: bipush 1
      // 101: ireturn
   }

   static void aaa(class_332 var0, double var1) {
      var0.method_51448().rotate((float)Math.toRadians(var1));
   }

   static boolean aab(class_332 param0, double param1, double param3, double param5, double param7, int param9) {
      // $VF: Couldn't be decompiled
      // Please report this to the Vineflower issue tracker, at https://github.com/Vineflower/vineflower/issues with a copy of the class file (if you have the rights to distribute it!)
      // java.lang.RuntimeException: parsing failure!
      //   at org.jetbrains.java.decompiler.modules.decompiler.decompose.DomHelper.parseGraph(DomHelper.java:211)
      //   at org.jetbrains.java.decompiler.main.rels.MethodProcessor.codeToJava(MethodProcessor.java:166)
      //
      // Bytecode:
      // 00: getstatic qeaa361f143ee4a0894bd168fd9b30c66/qf4ccf8f5435d4a78bdca4d6a018b578e/baaabbaa.bba I
      // 03: istore 10
      // 05: dload 5
      // 07: dconst_0
      // 08: dcmpg
      // 09: iload 10
      // 0b: ifne 62
      // 0e: ifle 5d
      // 11: goto 15
      // 14: athrow
      // 15: dload 7
      // 17: dconst_0
      // 18: dcmpg
      // 19: iload 10
      // 1b: ifne 62
      // 1e: goto 22
      // 21: athrow
      // 22: ifle 5d
      // 25: goto 29
      // 28: athrow
      // 29: iload 9
      // 2b: iload 10
      // 2d: ifne 62
      // 30: goto 34
      // 33: athrow
      // 34: ldc 1171217849
      // 36: ldc -457534861
      // 38: ldc -690453844
      // 3a: ixor
      // 3b: invokestatic qeaa361f143ee4a0894bd168fd9b30c66/qf4ccf8f5435d4a78bdca4d6a018b578e/aaababbb.a (II)I
      // 3e: ldc2_w 6485509548550546198
      // 41: invokestatic qeaa361f143ee4a0894bd168fd9b30c66/qf4ccf8f5435d4a78bdca4d6a018b578e/aaababbb.abbbb (IJ)I
      // 44: iushr
      // 45: ldc 1171217850
      // 47: ldc -457534861
      // 49: ldc 52463757
      // 4b: ixor
      // 4c: invokestatic qeaa361f143ee4a0894bd168fd9b30c66/qf4ccf8f5435d4a78bdca4d6a018b578e/aaababbb.a (II)I
      // 4f: ldc2_w 5562011275870078093
      // 52: invokestatic qeaa361f143ee4a0894bd168fd9b30c66/qf4ccf8f5435d4a78bdca4d6a018b578e/aaababbb.abbbb (IJ)I
      // 55: iand
      // 56: ifgt 63
      // 59: goto 5d
      // 5c: athrow
      // 5d: bipush 1
      // 5e: goto 62
      // 61: athrow
      // 62: ireturn
      // 63: dconst_0
      // 64: dload 5
      // 66: invokestatic java/lang/Math.max (DD)D
      // 69: d2f
      // 6a: fstore 11
      // 6c: ldc2_w 0.25
      // 6f: dload 7
      // 71: invokestatic java/lang/Math.max (DD)D
      // 74: d2f
      // 75: fstore 12
      // 77: fload 11
      // 79: fload 12
      // 7b: ldc 0.5
      // 7d: fmul
      // 7e: fadd
      // 7f: fconst_2
      // 80: fadd
      // 81: fstore 13
      // 83: aload 0
      // 84: getfield net/minecraft/class_332.field_59826 Lnet/minecraft/class_11246;
      // 87: new qeaa361f143ee4a0894bd168fd9b30c66/qf4ccf8f5435d4a78bdca4d6a018b578e/ababbaaa
      // 8a: dup
      // 8b: new org/joml/Matrix3x2f
      // 8e: dup
      // 8f: aload 0
      // 90: invokevirtual net/minecraft/class_332.method_51448 ()Lorg/joml/Matrix3x2fStack;
      // 93: invokespecial org/joml/Matrix3x2f.<init> (Lorg/joml/Matrix3x2fc;)V
      // 96: dload 1
      // 97: d2f
      // 98: dload 3
      // 99: d2f
      // 9a: fload 13
      // 9c: fload 11
      // 9e: fload 12
      // a0: ldc 1171217851
      // a2: ldc -457534861
      // a4: ldc 1107496864
      // a6: ixor
      // a7: invokestatic qeaa361f143ee4a0894bd168fd9b30c66/qf4ccf8f5435d4a78bdca4d6a018b578e/aaababbb.a (II)I
      // aa: ldc2_w 6429761860204925159
      // ad: invokestatic qeaa361f143ee4a0894bd168fd9b30c66/qf4ccf8f5435d4a78bdca4d6a018b578e/aaababbb.abbbb (IJ)I
      // b0: iload 9
      // b2: aload 0
      // b3: getfield net/minecraft/class_332.field_44659 Lnet/minecraft/class_332$class_8214;
      // b6: invokevirtual net/minecraft/class_332$class_8214.method_70863 ()Lnet/minecraft/class_8030;
      // b9: invokespecial qeaa361f143ee4a0894bd168fd9b30c66/qf4ccf8f5435d4a78bdca4d6a018b578e/ababbaaa.<init> (Lorg/joml/Matrix3x2fc;FFFFFIILnet/minecraft/class_8030;)V
      // bc: invokevirtual net/minecraft/class_11246.method_70919 (Lnet/minecraft/class_11244;)V
      // bf: bipush 1
      // c0: ireturn
   }

   private static void aba(
      class_4588 param0, Matrix3x2fc param1, float param2, float param3, float param4, float param5, float param6, float param7, float param8, int param9
   ) {
      // $VF: Couldn't be decompiled
      // Please report this to the Vineflower issue tracker, at https://github.com/Vineflower/vineflower/issues with a copy of the class file (if you have the rights to distribute it!)
      // java.lang.RuntimeException: parsing failure!
      //   at org.jetbrains.java.decompiler.modules.decompiler.decompose.DomHelper.parseGraph(DomHelper.java:211)
      //   at org.jetbrains.java.decompiler.main.rels.MethodProcessor.codeToJava(MethodProcessor.java:166)
      //
      // Bytecode:
      // 00: getstatic qeaa361f143ee4a0894bd168fd9b30c66/qf4ccf8f5435d4a78bdca4d6a018b578e/baaabbaa.bba I
      // 03: istore 10
      // 05: fload 4
      // 07: iload 10
      // 09: ifne 1b
      // 0c: fconst_0
      // 0d: fcmpg
      // 0e: ifle 29
      // 11: goto 15
      // 14: athrow
      // 15: fload 5
      // 17: goto 1b
      // 1a: athrow
      // 1b: iload 10
      // 1d: ifne 2d
      // 20: fconst_0
      // 21: fcmpg
      // 22: ifgt 2b
      // 25: goto 29
      // 28: athrow
      // 29: return
      // 2a: athrow
      // 2b: fload 4
      // 2d: invokestatic qeaa361f143ee4a0894bd168fd9b30c66/qf4ccf8f5435d4a78bdca4d6a018b578e/aaababbb.b (F)I
      // 30: istore 11
      // 32: fload 5
      // 34: invokestatic qeaa361f143ee4a0894bd168fd9b30c66/qf4ccf8f5435d4a78bdca4d6a018b578e/aaababbb.b (F)I
      // 37: istore 12
      // 39: ldc 1.0E-4
      // 3b: fload 4
      // 3d: fload 5
      // 3f: invokestatic java/lang/Math.min (FF)F
      // 42: invokestatic java/lang/Math.max (FF)F
      // 45: fstore 13
      // 47: fload 6
      // 49: fload 13
      // 4b: fdiv
      // 4c: invokestatic qeaa361f143ee4a0894bd168fd9b30c66/qf4ccf8f5435d4a78bdca4d6a018b578e/aaababbb.babb (F)F
      // 4f: invokestatic qeaa361f143ee4a0894bd168fd9b30c66/qf4ccf8f5435d4a78bdca4d6a018b578e/aaababbb.baaaa (F)F
      // 52: fstore 14
      // 54: fload 7
      // 56: fload 13
      // 58: fdiv
      // 59: invokestatic qeaa361f143ee4a0894bd168fd9b30c66/qf4ccf8f5435d4a78bdca4d6a018b578e/aaababbb.babb (F)F
      // 5c: invokestatic qeaa361f143ee4a0894bd168fd9b30c66/qf4ccf8f5435d4a78bdca4d6a018b578e/aaababbb.baaaa (F)F
      // 5f: fstore 15
      // 61: fload 8
      // 63: invokestatic qeaa361f143ee4a0894bd168fd9b30c66/qf4ccf8f5435d4a78bdca4d6a018b578e/aaababbb.babb (F)F
      // 66: fstore 16
      // 68: aload 0
      // 69: aload 1
      // 6a: fload 2
      // 6b: fload 3
      // 6c: fconst_0
      // 6d: fconst_0
      // 6e: iload 11
      // 70: iload 12
      // 72: fload 14
      // 74: fload 15
      // 76: fload 16
      // 78: iload 9
      // 7a: invokestatic qeaa361f143ee4a0894bd168fd9b30c66/qf4ccf8f5435d4a78bdca4d6a018b578e/aaababbb.abba (Lnet/minecraft/class_4588;Lorg/joml/Matrix3x2fc;FFFFIIFFFI)V
      // 7d: aload 0
      // 7e: aload 1
      // 7f: fload 2
      // 80: fload 3
      // 81: fload 5
      // 83: fadd
      // 84: fconst_0
      // 85: fconst_1
      // 86: iload 11
      // 88: iload 12
      // 8a: fload 14
      // 8c: fload 15
      // 8e: fload 16
      // 90: iload 9
      // 92: invokestatic qeaa361f143ee4a0894bd168fd9b30c66/qf4ccf8f5435d4a78bdca4d6a018b578e/aaababbb.abba (Lnet/minecraft/class_4588;Lorg/joml/Matrix3x2fc;FFFFIIFFFI)V
      // 95: aload 0
      // 96: aload 1
      // 97: fload 2
      // 98: fload 4
      // 9a: fadd
      // 9b: fload 3
      // 9c: fload 5
      // 9e: fadd
      // 9f: fconst_1
      // a0: fconst_1
      // a1: iload 11
      // a3: iload 12
      // a5: fload 14
      // a7: fload 15
      // a9: fload 16
      // ab: iload 9
      // ad: invokestatic qeaa361f143ee4a0894bd168fd9b30c66/qf4ccf8f5435d4a78bdca4d6a018b578e/aaababbb.abba (Lnet/minecraft/class_4588;Lorg/joml/Matrix3x2fc;FFFFIIFFFI)V
      // b0: aload 0
      // b1: aload 1
      // b2: fload 2
      // b3: fload 4
      // b5: fadd
      // b6: fload 3
      // b7: fconst_1
      // b8: fconst_0
      // b9: iload 11
      // bb: iload 12
      // bd: fload 14
      // bf: fload 15
      // c1: fload 16
      // c3: iload 9
      // c5: invokestatic qeaa361f143ee4a0894bd168fd9b30c66/qf4ccf8f5435d4a78bdca4d6a018b578e/aaababbb.abba (Lnet/minecraft/class_4588;Lorg/joml/Matrix3x2fc;FFFFIIFFFI)V
      // c8: return
   }

   private static void abb(class_4588 param0, Matrix3x2fc param1, float param2, float param3, float param4, float param5, float param6, int param7) {
      // $VF: Couldn't be decompiled
      // Please report this to the Vineflower issue tracker, at https://github.com/Vineflower/vineflower/issues with a copy of the class file (if you have the rights to distribute it!)
      // java.lang.RuntimeException: parsing failure!
      //   at org.jetbrains.java.decompiler.modules.decompiler.decompose.DomHelper.parseGraph(DomHelper.java:211)
      //   at org.jetbrains.java.decompiler.main.rels.MethodProcessor.codeToJava(MethodProcessor.java:166)
      //
      // Bytecode:
      // 000: ldc 1171217844
      // 002: ldc 2017538264
      // 004: ldc -76900972
      // 006: ixor
      // 007: invokestatic qeaa361f143ee4a0894bd168fd9b30c66/qf4ccf8f5435d4a78bdca4d6a018b578e/aaababbb.a (II)I
      // 00a: fload 6
      // 00c: invokestatic qeaa361f143ee4a0894bd168fd9b30c66/qf4ccf8f5435d4a78bdca4d6a018b578e/aaababbb.abaab (F)I
      // 00f: istore 9
      // 011: ldc2_w 5592888340436613844
      // 014: invokestatic qeaa361f143ee4a0894bd168fd9b30c66/qf4ccf8f5435d4a78bdca4d6a018b578e/aaababbb.abbbb (IJ)I
      // 017: newarray 6
      // 019: astore 10
      // 01b: getstatic qeaa361f143ee4a0894bd168fd9b30c66/qf4ccf8f5435d4a78bdca4d6a018b578e/baaabbaa.bba I
      // 01e: ldc 1171217845
      // 020: ldc 2017538264
      // 022: ldc 1951435251
      // 024: ixor
      // 025: invokestatic qeaa361f143ee4a0894bd168fd9b30c66/qf4ccf8f5435d4a78bdca4d6a018b578e/aaababbb.a (II)I
      // 028: ldc2_w 5592888340436613844
      // 02b: invokestatic qeaa361f143ee4a0894bd168fd9b30c66/qf4ccf8f5435d4a78bdca4d6a018b578e/aaababbb.abbbb (IJ)I
      // 02e: newarray 6
      // 030: astore 11
      // 032: aload 10
      // 034: aload 11
      // 036: fload 2
      // 037: fload 3
      // 038: fload 4
      // 03a: fload 5
      // 03c: fload 6
      // 03e: iload 9
      // 040: invokestatic qeaa361f143ee4a0894bd168fd9b30c66/qf4ccf8f5435d4a78bdca4d6a018b578e/aaababbb.bbbaa ([F[FFFFFFI)I
      // 043: istore 12
      // 045: istore 8
      // 047: iload 12
      // 049: iload 8
      // 04b: ifne 05a
      // 04e: bipush 3
      // 04f: if_icmpge 058
      // 052: goto 056
      // 055: athrow
      // 056: return
      // 057: athrow
      // 058: iload 12
      // 05a: newarray 6
      // 05c: astore 13
      // 05e: bipush 0
      // 05f: istore 14
      // 061: bipush 0
      // 062: istore 15
      // 064: iload 15
      // 066: iload 12
      // 068: if_icmpge 0d6
      // 06b: bipush 0
      // 06c: istore 16
      // 06e: iload 8
      // 070: ifne 0d9
      // 073: bipush 0
      // 074: istore 17
      // 076: iload 17
      // 078: iload 14
      // 07a: if_icmpge 0b8
      // 07d: iload 8
      // 07f: ifne 0d1
      // 082: aload 13
      // 084: iload 17
      // 086: faload
      // 087: aload 11
      // 089: iload 15
      // 08b: faload
      // 08c: fsub
      // 08d: invokestatic java/lang/Math.abs (F)F
      // 090: ldc_w 0.001
      // 093: fcmpg
      // 094: iload 8
      // 096: ifne 0a5
      // 099: goto 09d
      // 09c: athrow
      // 09d: ifge 0ac
      // 0a0: goto 0a4
      // 0a3: athrow
      // 0a4: bipush 1
      // 0a5: istore 16
      // 0a7: iload 8
      // 0a9: ifeq 0b8
      // 0ac: iinc 17 1
      // 0af: iload 8
      // 0b1: ifeq 076
      // 0b4: goto 0b8
      // 0b7: athrow
      // 0b8: iload 16
      // 0ba: ifne 0ce
      // 0bd: aload 13
      // 0bf: iload 14
      // 0c1: iinc 14 1
      // 0c4: aload 11
      // 0c6: iload 15
      // 0c8: faload
      // 0c9: fastore
      // 0ca: goto 0ce
      // 0cd: athrow
      // 0ce: iinc 15 1
      // 0d1: iload 8
      // 0d3: ifeq 064
      // 0d6: bipush 0
      // 0d7: istore 15
      // 0d9: iload 15
      // 0db: iload 14
      // 0dd: bipush 1
      // 0de: isub
      // 0df: if_icmpge 144
      // 0e2: iload 15
      // 0e4: iload 8
      // 0e6: ifne 145
      // 0e9: goto 0ed
      // 0ec: athrow
      // 0ed: bipush 1
      // 0ee: iadd
      // 0ef: istore 16
      // 0f1: iload 16
      // 0f3: iload 14
      // 0f5: if_icmpge 13c
      // 0f8: aload 13
      // 0fa: iload 8
      // 0fc: ifne 11e
      // 0ff: iload 16
      // 101: faload
      // 102: iload 8
      // 104: ifne 155
      // 107: goto 10b
      // 10a: athrow
      // 10b: aload 13
      // 10d: iload 15
      // 10f: faload
      // 110: fcmpg
      // 111: ifge 134
      // 114: goto 118
      // 117: athrow
      // 118: aload 13
      // 11a: goto 11e
      // 11d: athrow
      // 11e: iload 15
      // 120: faload
      // 121: fstore 17
      // 123: aload 13
      // 125: iload 15
      // 127: aload 13
      // 129: iload 16
      // 12b: faload
      // 12c: fastore
      // 12d: aload 13
      // 12f: iload 16
      // 131: fload 17
      // 133: fastore
      // 134: iinc 16 1
      // 137: iload 8
      // 139: ifeq 0f1
      // 13c: iinc 15 1
      // 13f: iload 8
      // 141: ifeq 0d9
      // 144: bipush 0
      // 145: istore 15
      // 147: iload 15
      // 149: iload 14
      // 14b: bipush 1
      // 14c: isub
      // 14d: if_icmpge 337
      // 150: aload 13
      // 152: iload 15
      // 154: faload
      // 155: fstore 16
      // 157: aload 13
      // 159: iload 15
      // 15b: bipush 1
      // 15c: iadd
      // 15d: faload
      // 15e: fstore 17
      // 160: fload 2
      // 161: fload 4
      // 163: fadd
      // 164: fstore 18
      // 166: fload 2
      // 167: fstore 19
      // 169: fload 2
      // 16a: fload 4
      // 16c: fadd
      // 16d: fstore 20
      // 16f: fload 2
      // 170: fstore 21
      // 172: bipush 0
      // 173: istore 22
      // 175: iload 22
      // 177: iload 12
      // 179: if_icmpge 212
      // 17c: iload 22
      // 17e: bipush 1
      // 17f: iadd
      // 180: iload 12
      // 182: irem
      // 183: istore 23
      // 185: aload 11
      // 187: iload 22
      // 189: faload
      // 18a: fstore 24
      // 18c: aload 11
      // 18e: iload 23
      // 190: faload
      // 191: fstore 25
      // 193: aload 10
      // 195: iload 22
      // 197: faload
      // 198: fstore 26
      // 19a: aload 10
      // 19c: iload 23
      // 19e: faload
      // 19f: fstore 27
      // 1a1: fload 26
      // 1a3: fload 24
      // 1a5: fload 27
      // 1a7: fload 25
      // 1a9: fload 16
      // 1ab: invokestatic qeaa361f143ee4a0894bd168fd9b30c66/qf4ccf8f5435d4a78bdca4d6a018b578e/aaababbb.babab (FFFFF)F
      // 1ae: iload 8
      // 1b0: ifne 297
      // 1b3: fstore 28
      // 1b5: fload 28
      // 1b7: iload 8
      // 1b9: ifne 1f2
      // 1bc: invokestatic java/lang/Float.isNaN (F)Z
      // 1bf: ifne 1d8
      // 1c2: goto 1c6
      // 1c5: athrow
      // 1c6: fload 18
      // 1c8: fload 28
      // 1ca: invokestatic java/lang/Math.min (FF)F
      // 1cd: fstore 18
      // 1cf: fload 19
      // 1d1: fload 28
      // 1d3: invokestatic java/lang/Math.max (FF)F
      // 1d6: fstore 19
      // 1d8: fload 26
      // 1da: fload 24
      // 1dc: fload 27
      // 1de: fload 25
      // 1e0: fload 17
      // 1e2: invokestatic qeaa361f143ee4a0894bd168fd9b30c66/qf4ccf8f5435d4a78bdca4d6a018b578e/aaababbb.babab (FFFFF)F
      // 1e5: fstore 28
      // 1e7: iload 8
      // 1e9: ifne 20d
      // 1ec: fload 28
      // 1ee: goto 1f2
      // 1f1: athrow
      // 1f2: invokestatic java/lang/Float.isNaN (F)Z
      // 1f5: ifne 20a
      // 1f8: fload 20
      // 1fa: fload 28
      // 1fc: invokestatic java/lang/Math.min (FF)F
      // 1ff: fstore 20
      // 201: fload 21
      // 203: fload 28
      // 205: invokestatic java/lang/Math.max (FF)F
      // 208: fstore 21
      // 20a: iinc 22 1
      // 20d: iload 8
      // 20f: ifeq 175
      // 212: bipush 0
      // 213: istore 22
      // 215: iload 22
      // 217: iload 12
      // 219: if_icmpge 293
      // 21c: aload 11
      // 21e: iload 22
      // 220: faload
      // 221: fload 16
      // 223: fsub
      // 224: invokestatic java/lang/Math.abs (F)F
      // 227: iload 8
      // 229: ifne 263
      // 22c: ldc_w 0.001
      // 22f: iload 8
      // 231: ifne 296
      // 234: goto 238
      // 237: athrow
      // 238: fcmpg
      // 239: ifge 258
      // 23c: goto 240
      // 23f: athrow
      // 240: fload 18
      // 242: aload 10
      // 244: iload 22
      // 246: faload
      // 247: invokestatic java/lang/Math.min (FF)F
      // 24a: fstore 18
      // 24c: fload 19
      // 24e: aload 10
      // 250: iload 22
      // 252: faload
      // 253: invokestatic java/lang/Math.max (FF)F
      // 256: fstore 19
      // 258: aload 11
      // 25a: iload 22
      // 25c: faload
      // 25d: fload 17
      // 25f: fsub
      // 260: invokestatic java/lang/Math.abs (F)F
      // 263: iload 8
      // 265: ifne 289
      // 268: ldc_w 0.001
      // 26b: fcmpg
      // 26c: ifge 28b
      // 26f: goto 273
      // 272: athrow
      // 273: fload 20
      // 275: aload 10
      // 277: iload 22
      // 279: faload
      // 27a: invokestatic java/lang/Math.min (FF)F
      // 27d: fstore 20
      // 27f: fload 21
      // 281: aload 10
      // 283: iload 22
      // 285: faload
      // 286: invokestatic java/lang/Math.max (FF)F
      // 289: fstore 21
      // 28b: iinc 22 1
      // 28e: iload 8
      // 290: ifeq 215
      // 293: fconst_1
      // 294: fload 4
      // 296: fdiv
      // 297: fstore 22
      // 299: iload 8
      // 29b: fconst_1
      // 29c: fload 5
      // 29e: fdiv
      // 29f: fstore 23
      // 2a1: fload 18
      // 2a3: fload 2
      // 2a4: fsub
      // 2a5: fload 22
      // 2a7: fmul
      // 2a8: fstore 24
      // 2aa: fload 16
      // 2ac: fload 3
      // 2ad: fsub
      // 2ae: fload 23
      // 2b0: fmul
      // 2b1: fstore 25
      // 2b3: fload 19
      // 2b5: fload 2
      // 2b6: fsub
      // 2b7: fload 22
      // 2b9: fmul
      // 2ba: fstore 26
      // 2bc: fload 20
      // 2be: fload 2
      // 2bf: fsub
      // 2c0: fload 22
      // 2c2: fmul
      // 2c3: fstore 27
      // 2c5: fload 17
      // 2c7: fload 3
      // 2c8: fsub
      // 2c9: fload 23
      // 2cb: fmul
      // 2cc: fstore 28
      // 2ce: fload 21
      // 2d0: fload 2
      // 2d1: fsub
      // 2d2: fload 22
      // 2d4: fmul
      // 2d5: fstore 29
      // 2d7: aload 0
      // 2d8: aload 1
      // 2d9: fload 18
      // 2db: fload 16
      // 2dd: fload 24
      // 2df: fload 25
      // 2e1: iload 7
      // 2e3: invokestatic qeaa361f143ee4a0894bd168fd9b30c66/qf4ccf8f5435d4a78bdca4d6a018b578e/aaababbb.bbabb (Lnet/minecraft/class_4588;Lorg/joml/Matrix3x2fc;FFFFI)V
      // 2e6: aload 0
      // 2e7: aload 1
      // 2e8: fload 19
      // 2ea: fload 16
      // 2ec: fload 26
      // 2ee: fload 25
      // 2f0: iload 7
      // 2f2: invokestatic qeaa361f143ee4a0894bd168fd9b30c66/qf4ccf8f5435d4a78bdca4d6a018b578e/aaababbb.bbabb (Lnet/minecraft/class_4588;Lorg/joml/Matrix3x2fc;FFFFI)V
      // 2f5: aload 0
      // 2f6: aload 1
      // 2f7: fload 21
      // 2f9: fload 17
      // 2fb: fload 29
      // 2fd: fload 28
      // 2ff: iload 7
      // 301: invokestatic qeaa361f143ee4a0894bd168fd9b30c66/qf4ccf8f5435d4a78bdca4d6a018b578e/aaababbb.bbabb (Lnet/minecraft/class_4588;Lorg/joml/Matrix3x2fc;FFFFI)V
      // 304: aload 0
      // 305: aload 1
      // 306: fload 18
      // 308: fload 16
      // 30a: fload 24
      // 30c: fload 25
      // 30e: iload 7
      // 310: invokestatic qeaa361f143ee4a0894bd168fd9b30c66/qf4ccf8f5435d4a78bdca4d6a018b578e/aaababbb.bbabb (Lnet/minecraft/class_4588;Lorg/joml/Matrix3x2fc;FFFFI)V
      // 313: aload 0
      // 314: aload 1
      // 315: fload 21
      // 317: fload 17
      // 319: fload 29
      // 31b: fload 28
      // 31d: iload 7
      // 31f: invokestatic qeaa361f143ee4a0894bd168fd9b30c66/qf4ccf8f5435d4a78bdca4d6a018b578e/aaababbb.bbabb (Lnet/minecraft/class_4588;Lorg/joml/Matrix3x2fc;FFFFI)V
      // 322: aload 0
      // 323: aload 1
      // 324: fload 20
      // 326: fload 17
      // 328: fload 27
      // 32a: fload 28
      // 32c: iload 7
      // 32e: invokestatic qeaa361f143ee4a0894bd168fd9b30c66/qf4ccf8f5435d4a78bdca4d6a018b578e/aaababbb.bbabb (Lnet/minecraft/class_4588;Lorg/joml/Matrix3x2fc;FFFFI)V
      // 331: iinc 15 1
      // 334: ifeq 147
      // 337: return
   }

   // $VF: Irreducible bytecode was duplicated to produce valid code
   static {
      int var31 = -554474629;
      int var25 = 0;
      short var26 = 25779;
      String[] var23 = new String[6];
      int var10001 = "ũ寝\udd5b孍൙嗝൚塍浘嫭뵔塝赟寽嵟壍赙姍浕唝絘夝赕吝뵙孽ﵔ孝浛奝赛墽䵛娍굛夭\ued58媽赙堭ⵚ啍쵘姍ﵔ妭뵛嫽굘庭嵘忝굘命鵚娝\udd58奝\ued5a堽赚妍쵞娝ⵛ孍赛帝뵛忝ൔ嬝絛夝浞媭嵙墝쵙吭ﵞ帝ᵟ彭뵕唽絕幭赘哭嵙妍뵚嬝\ued55嬭뵞喍\udd5f孝絕妍뵘名뵕弽ﵛ寝鵕墝쵟喽굞嗽뵔孽䵟啭\ued54弽絚呭뵕堭赞唽浙妭㵛娭\udd5b唭쵙吽㵕宍絛彝굕姭赕姝䵕彝뵙寭뵚宍浙寭嵞彽浔娍嵛娭浘墍굞忝ᵙ嬽ᵕ堭絛忭鵕夝浘唭嵛席ⵞ寽絟嗭赙妍൚婽뵔彽ᵞ弝ᵟ唽\udd5a塭굙壭굟婝浕嬝൛孽굟寍浙呭浛咽䵞徍\udd54墭鵛奍絚夽赟婭뵞墍䵛嬭\udd5b唭쵙宝൚嬭굞墽\ued5a墽嵘奭\ued5b奝굞忍뵙塍쵛啝嵟啽굔妽\udd55唭쵛廽㵞忽嵙寝嵕孝䵞堝ﵚ堭浚娝浕宝嵙喽ﵟ孍赙复ᵔ吽ﵕ彭赕哽ᵟ孝ﵕ孝嵘忭ﵛ徝䵘咝\udd5b壭㵘呝ᵙ咝ൔ嗝嵞帽ﵛ堽㵘媝ⵚ寝൙吭\ued58姍赘塍\ued5f塝䵘寍鵕廍\ued5e寭嵞堝絔墽嵙姭浞妍嵛哝絘弽쵙喽൙命䵚婭\udd5b复鵚婍ᵛ徭絕媭浚墍赔呭ⵟ墝쵛庽൛寽浛塭鵘徽絚唍絛塍ﵞ帍ൕ姭㵔寍赕寝Q\ue481ᇥ\ue431懨\uefd1釫\uef21䇯\ueba1뇯\ue401쇯\ue8d1懥\ue511⇫\ue4e1\u31e8\uefd1ꇫ\uee91ᇤ\uea31懤\ue9e1뇮\ue8f1뇯\uea61\ue1e5\ue581䇮\uef01釥\uee81䇤\ue4c1凪\ue4c1\u31ea\uee91ǯ\ue5d1凫\ue411ꇨ\ue4e1ᇨ\uef21釫\ue541懮\ue991뇨\ue481燥\ueb81ꇥ\ue401ᇩ\uebe1ǩ\ue551\u31ee\ueac1뇮\ue8b1쇪\ue841ǫ\ue4d1ǥ\uef91\uf1ea\ue4c1䇯\ueb71뇫\ue431쇤\uea31\u0098罆릂砆\uf67a蝉噾砆\uf67d砖㙾畆\uf678蘙䦇箖噵草ꦆ礦ٴ絖ꙺ虙꙼笖\ue675策晵蘉\ue679苉즂箆陻縶즆簖噺肹즂窦\uf67c芩榇箖\ud980翆왵祖虻瓖䙿緶\uf674纖䦂苹홽竆\ud980聩陸蛩噴胙ᦆ羆홹緖㦆菙♿茙ᦁ菩\ue675虉㙺蘩\uf67c篦䦂艩ᦂ蘙\uf679蛉䙸緶ꦇ苙噵舙晾磦\ue981礖㦇礆虼细妆稆陻璦禆箶♾腩ᦁ糶㦇莹\ue982耉閭蘹♼稆ᙾ繆噽羶虸碖\ue674砆妀腹虼篆虵筶ꙴ緆㦆瑖\uf679蝙왵粦㙿莩概船뙿蟉陹符榃蝙ᙸ\n\ue314듢\ue374員\ue004Ӡ\ue0d4ᓠ\ue154铠\u0010ᆯ鼏ᆿ弒\u0a4f伊၏３Ⴟ漌ጿ\udf11ѿ鼗ᇏ⼈\n㖕㔴㗵픿㺅蔾㹕锾㿕ᔾ"
         .length();
      int var24 = 0;
      int var22 = var10001;
      String var21 = "ũ寝\udd5b孍൙嗝൚塍浘嫭뵔塝赟寽嵟壍赙姍浕唝絘夝赕吝뵙孽ﵔ孝浛奝赛墽䵛娍굛夭\ued58媽赙堭ⵚ啍쵘姍ﵔ妭뵛嫽굘庭嵘忝굘命鵚娝\udd58奝\ued5a堽赚妍쵞娝ⵛ孍赛帝뵛忝ൔ嬝絛夝浞媭嵙墝쵙吭ﵞ帝ᵟ彭뵕唽絕幭赘哭嵙妍뵚嬝\ued55嬭뵞喍\udd5f孝絕妍뵘名뵕弽ﵛ寝鵕墝쵟喽굞嗽뵔孽䵟啭\ued54弽絚呭뵕堭赞唽浙妭㵛娭\udd5b唭쵙吽㵕宍絛彝굕姭赕姝䵕彝뵙寭뵚宍浙寭嵞彽浔娍嵛娭浘墍굞忝ᵙ嬽ᵕ堭絛忭鵕夝浘唭嵛席ⵞ寽絟嗭赙妍൚婽뵔彽ᵞ弝ᵟ唽\udd5a塭굙壭굟婝浕嬝൛孽굟寍浙呭浛咽䵞徍\udd54墭鵛奍絚夽赟婭뵞墍䵛嬭\udd5b唭쵙宝൚嬭굞墽\ued5a墽嵘奭\ued5b奝굞忍뵙塍쵛啝嵟啽굔妽\udd55唭쵛廽㵞忽嵙寝嵕孝䵞堝ﵚ堭浚娝浕宝嵙喽ﵟ孍赙复ᵔ吽ﵕ彭赕哽ᵟ孝ﵕ孝嵘忭ﵛ徝䵘咝\udd5b壭㵘呝ᵙ咝ൔ嗝嵞帽ﵛ堽㵘媝ⵚ寝൙吭\ued58姍赘塍\ued5f塝䵘寍鵕廍\ued5e寭嵞堝絔墽嵙姭浞妍嵛哝絘弽쵙喽൙命䵚婭\udd5b复鵚婍ᵛ徭絕媭浚墍赔呭ⵟ墝쵛庽൛寽浛塭鵘徽絚唍絛塍ﵞ帍ൕ姭㵔寍赕寝Q\ue481ᇥ\ue431懨\uefd1釫\uef21䇯\ueba1뇯\ue401쇯\ue8d1懥\ue511⇫\ue4e1\u31e8\uefd1ꇫ\uee91ᇤ\uea31懤\ue9e1뇮\ue8f1뇯\uea61\ue1e5\ue581䇮\uef01釥\uee81䇤\ue4c1凪\ue4c1\u31ea\uee91ǯ\ue5d1凫\ue411ꇨ\ue4e1ᇨ\uef21釫\ue541懮\ue991뇨\ue481燥\ueb81ꇥ\ue401ᇩ\uebe1ǩ\ue551\u31ee\ueac1뇮\ue8b1쇪\ue841ǫ\ue4d1ǥ\uef91\uf1ea\ue4c1䇯\ueb71뇫\ue431쇤\uea31\u0098罆릂砆\uf67a蝉噾砆\uf67d砖㙾畆\uf678蘙䦇箖噵草ꦆ礦ٴ絖ꙺ虙꙼笖\ue675策晵蘉\ue679苉즂箆陻縶즆簖噺肹즂窦\uf67c芩榇箖\ud980翆왵祖虻瓖䙿緶\uf674纖䦂苹홽竆\ud980聩陸蛩噴胙ᦆ羆홹緖㦆菙♿茙ᦁ菩\ue675虉㙺蘩\uf67c篦䦂艩ᦂ蘙\uf679蛉䙸緶ꦇ苙噵舙晾磦\ue981礖㦇礆虼细妆稆陻璦禆箶♾腩ᦁ糶㦇莹\ue982耉閭蘹♼稆ᙾ繆噽羶虸碖\ue674砆妀腹虼篆虵筶ꙴ緆㦆瑖\uf679蝙왵粦㙿莩概船뙿蟉陹符榃蝙ᙸ\n\ue314듢\ue374員\ue004Ӡ\ue0d4ᓠ\ue154铠\u0010ᆯ鼏ᆿ弒\u0a4f伊၏３Ⴟ漌ጿ\udf11ѿ鼗ᇏ⼈\n㖕㔴㗵픿㺅蔾㹕锾㿕ᔾ";

      do {
         char var27 = var21.charAt(var25);
         char[] var10000 = var21.substring(var25 + 1, var25 + 1 + var27).toCharArray();
         int var29 = 0;
         char[] var28 = var10000;

         do {
            char var30 = var28[var29];
            if (var29 % 2 == 0) {
               var28[var29] = (char)((var30 >>> 4 | var30 << '\f') & 65535 ^ var26);
            } else {
               var28[var29] = (char)((var30 << 4 | var30 >>> '\f') & 65535 ^ var26);
            }
         } while (++var29 < var28.length);

         var23[var24] = new String(var28);
         var24++;
         var25 = var25 + var27 + 1;
      } while (var25 < var22);

      abaaa = var23;
      abaab = new Object[var23.length];
      int var17 = -1106600417;
      byte[] var15 = "\u008d\u007fÀU?gâÛàN,T\u0012\u009b?\u009a\u0010°\"ñ6XòÆã R\u0007¢\u0083°\u009f\u0087\u0011Oã\b+S\u00859þp\u0012+ÉâÆ\u0087\u007ftÀÖXÃ0Æ%\u001dù(70Ì\u0016sm\u001dr\u0081\u0007Ùªl\u008dµÊ\u0082m°¬®ù\u009eª-OöÐwû!\u0090¡\u0085h½R\n\u001b[Ã\u0082\u008bMæw5~g\u001dã\u0082Á©»´W\u009eK¨yÈÝ\u0086\u008d\u0011¹J\u0005ÇúÀ\u0004ç»9½gÅ\u0083\u0095Á}Øa,O;å/MÀÕtç¯Søº\u0094\u0003\nkuö\\\u0090Û ø¥\"ç i\u007f\u0018\u0018n7\u001fñ^OC-j'r\nwÒ®ê9^[\u0084/Âl-â®\u0082·àC\u0082<\u008bN\u0080s\u0012\u0084.\u0096\u000b,\u0087j/z>\u001230Þ\u0096pó3(»\u0006lH\u0084K\u009aH\u0087\u008dæ¸®1_«b\u009e\t~4û[\u007f\u00ad\u000eW\u0096\u009c \u0000q¤9hðÝÇ¾³\u0085lF9®\u0016øs¤/Å\u0087Ò<ã\u001f.c\u0093Æ$\u0085\u000f\u0003ëøç¹\t\u0002\u0095$[«Ù®\u0088m\u009fC%q!ø¶ä\u0018(ø\u0099Æ\u0085P\u0017\u000f\u0003ù\u0096/\u008dÌÜ´göåî\u009fAý}ý[¥\\p\u0016)î\r\u0084\u0080\u0095E|©\u0016,¯¦ã®\tC\u0002!\u008aÔ\u0080Ñ è\u008a\u0003\u0002\u008b¹âx\r\u00ad·$²;]£óÅ\u00adì\u0095Â®(sÜhk)Øç\u0001ñ\tª«+\u001b\u0094J\u0082¦7e\nà\u0005À1g\"]=dúpp GA"
         .getBytes("ISO-8859-1");
      int var16 = var15.length / 4;
      aabbb = new int[var16];
      byte var18 = 0;
      int var19 = 0;

      do {
         int var20 = (var15[var18] & 255) << 24 | (var15[var18 + 1] & 255) << 16 | (var15[var18 + 2] & 255) << 8 | var15[var18 + 3] & 255;
         var20 ^= var17;
         aabbb[var19] = var20;
         var18 += 4;
      } while (++var19 < var16);

      String[] var8 = new String[a(1171217826, var31 ^ 1924199025)];
      int var12 = 0;
      String var11;
      int var13 = (var11 = aaaaab('鷩', (short)24302, var31 ^ -1771494966)).length();
      int var10 = a(1171217827, var31 ^ 1547971360);
      int var34 = -1;

      label110:
      while (true) {
         String var36 = var11.substring(++var34, var34 + var10);
         int var41 = -1;

         while (true) {
            char[] var57;
            label105: {
               char[] var43 = var36.toCharArray();
               int var10003 = var43.length;
               int var14 = 0;
               var57 = var43;
               var41 = var10003;
               char[] var69;
               int var10004;
               if (var10003 <= 1) {
                  var69 = var43;
                  var10004 = var14;
               } else {
                  var57 = var43;
                  var41 = var10003;
                  if (var10003 <= var14) {
                     break label105;
                  }

                  var69 = var43;
                  var10004 = var14;
               }

               while (true) {
                  var69[var10004] = (char)(var69[var10004] ^ switch (var14 % a(1171217821, var31 ^ 449699281)) {
                     case 0 -> 1;
                     case 1 -> a(1171217822, var31 ^ -478913186);
                     case 2 -> 3;
                     case 3 -> a(1171217823, var31 ^ 1499265848);
                     case 4 -> a(1171217816, var31 ^ 44570120);
                     case 5 -> a(1171217817, var31 ^ -517204635);
                     default -> a(1171217818, var31 ^ 438062697);
                  });
                  var14++;
                  if (var41 == 0) {
                     var10004 = var41;
                     var69 = var57;
                  } else {
                     if (var41 <= var14) {
                        break;
                     }

                     var69 = var57;
                     var10004 = var14;
                  }
               }
            }

            String var76 = new String(var57).intern();
            switch (var41) {
               case 0:
                  var8[var12++] = var76;
                  if ((var34 += var10) >= var13) {
                     long var0 = 7584994813247799501L;
                     long[] var6 = new long[a(1171217819, var31 ^ 1973076516)];
                     int var3 = 0;
                     String var4;
                     int var5 = (var4 = aaaaab('鷫', (short)'\uf161', var31 ^ -884403211)).length();
                     byte var2 = 0;

                     label84:
                     while (true) {
                        int var50 = var2;
                        var2 += 8;
                        var36 = var4.substring(var50, var2);
                        char var51 = '鷪';
                        char var63 = '衎';
                        int var77 = var31 ^ -935255787;
                        byte[] var7 = var36.getBytes("ISO-8859-1");
                        long[] var39 = var6;
                        var50 = var3++;
                        long var64 = (var7[0] & 255L) << a(1171217812, var31 ^ 1321873485)
                           | (var7[1] & 255L) << a(1171217813, var31 ^ -1354799585)
                           | (var7[2] & 255L) << a(1171217814, var31 ^ 23708369)
                           | (var7[3] & 255L) << a(1171217815, var31 ^ -131162700)
                           | (var7[4] & 255L) << a(1171217808, var31 ^ -1513019988)
                           | (var7[5] & 255L) << a(1171217809, var31 ^ -304690187)
                           | (var7[a(1171217810, var31 ^ -1786112248)] & 255L) << a(1171217811, var31 ^ -38063898)
                           | var7[a(1171217804, var31 ^ 141021250)] & 255L;
                        byte var78 = -1;

                        while (true) {
                           long var82 = var64 ^ var0;
                           switch (var78) {
                              case 0:
                                 var39[var50] = var82;
                                 if (var2 >= var5) {
                                    abaa = var6;
                                    aabaa = new Integer[a(1171217798, var31 ^ 704254520)];
                                    aab = abbbb(a(1171217799, var31 ^ -593162981), 1667813128811659120L);
                                    bbba = abbbb(a(1171217792, var31 ^ -1856767449), 6895954214005833119L);
                                    babb = abbbb(a(1171217793, var31 ^ 1462721603), 3277932208341475269L);
                                    bba = abbbb(a(1171217794, var31 ^ -342440836), 7851270707254244281L);
                                    aaaa = abbbb(a(1171217795, var31 ^ 1153448732), 2959172435278708527L);
                                    a = abbbb(a(1171217916, var31 ^ 563227756), 2712881537311382665L);
                                    abbb = abbbb(a(1171217917, var31 ^ -727839616), 8352090197730126427L);
                                    baaa = abbbb(a(1171217918, var31 ^ 87478572), 7659827824131671028L);
                                    ba = abbbb(a(1171217919, var31 ^ -475946209), 2712881537311382665L);
                                    aaaab = aabbaaaba.aaab(var8[a(1171217912, var31 ^ 494373244)]);
                                    aaba = aabbaaaba.aaab(var8[a(1171217913, var31 ^ -1232141401)]);
                                    baba = aabbaaaba.aaab(var8[a(1171217914, var31 ^ -869185187)]);
                                    baab = aabbaaaba.aaab(var8[a(1171217915, var31 ^ -183714338)]);
                                    aaabb = aabbaaaba.aaab(var8[a(1171217908, var31 ^ -433445418)]);
                                    aabab = aabbaaaba.aaab(var8[1]);
                                    abba = aabbaaaba.aaab(var8[2]);
                                    baa = aabbaaaba.aaab(var8[4]);
                                    aaa = aabbaaaba.aaab(var8[3]);
                                    aaaaa = aabbaaaba.aaab(var8[a(1171217909, var31 ^ -1185219373)]);
                                    bbab = aabbaaaba.aaab(var8[5]);
                                    aba = aabbaaaba.aaab(var8[0]);
                                    bb = babbb();
                                    aabba = abbaa();
                                    bbaa = aabab();
                                    bab = aaba();
                                    aaab = abaa();
                                    b = aaab();
                                    ab = class_11231.method_70899();
                                    return;
                                 }
                                 break;
                              default:
                                 var39[var50] = var82;
                                 if (var2 < var5) {
                                    continue label84;
                                 }

                                 var5 = (var4 = aaaaab('鷭', (short)'뿮', var31 ^ 303631651)).length();
                                 var2 = 0;
                           }

                           byte var53 = var2;
                           var2 += 8;
                           var36 = var4.substring(var53, var2);
                           var51 = '鷬';
                           char var66 = '鋗';
                           int var80 = var31 ^ -596636770;
                           var7 = var36.getBytes("ISO-8859-1");
                           var39 = var6;
                           var50 = var3++;
                           var64 = (var7[0] & 255L) << a(1171217805, var31 ^ -2070757872)
                              | (var7[1] & 255L) << a(1171217806, var31 ^ 413472630)
                              | (var7[2] & 255L) << a(1171217807, var31 ^ 1951108493)
                              | (var7[3] & 255L) << a(1171217800, var31 ^ -1723137719)
                              | (var7[4] & 255L) << a(1171217801, var31 ^ -1807135031)
                              | (var7[5] & 255L) << a(1171217802, var31 ^ 1592241339)
                              | (var7[a(1171217803, var31 ^ -162639788)] & 255L) << a(1171217796, var31 ^ -1594414923)
                              | var7[a(1171217797, var31 ^ -367547390)] & 255L;
                           var78 = 0;
                        }
                     }
                  }

                  var10 = var11.charAt(var34);
                  break;
               default:
                  var8[var12++] = var76;
                  if ((var34 += var10) < var13) {
                     var10 = var11.charAt(var34);
                     continue label110;
                  }

                  var13 = (var11 = aaaaab('鷨', (short)20131, var31 ^ -48950109)).length();
                  var10 = a(1171217820, var31 ^ -1865613948);
                  var34 = -1;
            }

            var36 = var11.substring(++var34, var34 + var10);
            var41 = 0;
         }
      }
   }

   static boolean baa(class_332 param0, double param1, double param3, double param5, double param7, double param9, double param11, int param13) {
      // $VF: Couldn't be decompiled
      // Please report this to the Vineflower issue tracker, at https://github.com/Vineflower/vineflower/issues with a copy of the class file (if you have the rights to distribute it!)
      // java.lang.RuntimeException: parsing failure!
      //   at org.jetbrains.java.decompiler.modules.decompiler.decompose.DomHelper.parseGraph(DomHelper.java:211)
      //   at org.jetbrains.java.decompiler.main.rels.MethodProcessor.codeToJava(MethodProcessor.java:166)
      //
      // Bytecode:
      // 00: getstatic qeaa361f143ee4a0894bd168fd9b30c66/qf4ccf8f5435d4a78bdca4d6a018b578e/baaabbaa.bba I
      // 03: istore 14
      // 05: dload 5
      // 07: dconst_0
      // 08: dcmpg
      // 09: iload 14
      // 0b: ifne 7c
      // 0e: ifle 77
      // 11: goto 15
      // 14: athrow
      // 15: dload 7
      // 17: dconst_0
      // 18: dcmpg
      // 19: iload 14
      // 1b: ifne 7c
      // 1e: goto 22
      // 21: athrow
      // 22: ifle 77
      // 25: goto 29
      // 28: athrow
      // 29: dload 11
      // 2b: dconst_0
      // 2c: dcmpg
      // 2d: iload 14
      // 2f: ifne 7c
      // 32: goto 36
      // 35: athrow
      // 36: ifle 77
      // 39: goto 3d
      // 3c: athrow
      // 3d: iload 13
      // 3f: iload 14
      // 41: ifne 7c
      // 44: goto 48
      // 47: athrow
      // 48: ldc_w 1171217846
      // 4b: ldc_w 1595685073
      // 4e: ldc_w 1658366677
      // 51: ixor
      // 52: invokestatic qeaa361f143ee4a0894bd168fd9b30c66/qf4ccf8f5435d4a78bdca4d6a018b578e/aaababbb.a (II)I
      // 55: ldc2_w 6485509548550546198
      // 58: invokestatic qeaa361f143ee4a0894bd168fd9b30c66/qf4ccf8f5435d4a78bdca4d6a018b578e/aaababbb.abbbb (IJ)I
      // 5b: iushr
      // 5c: ldc_w 1171217847
      // 5f: ldc_w 1595685073
      // 62: ldc_w 1894748899
      // 65: ixor
      // 66: invokestatic qeaa361f143ee4a0894bd168fd9b30c66/qf4ccf8f5435d4a78bdca4d6a018b578e/aaababbb.a (II)I
      // 69: ldc2_w 5562011275870078093
      // 6c: invokestatic qeaa361f143ee4a0894bd168fd9b30c66/qf4ccf8f5435d4a78bdca4d6a018b578e/aaababbb.abbbb (IJ)I
      // 6f: iand
      // 70: ifgt 7d
      // 73: goto 77
      // 76: athrow
      // 77: bipush 1
      // 78: goto 7c
      // 7b: athrow
      // 7c: ireturn
      // 7d: dload 5
      // 7f: dload 7
      // 81: dload 9
      // 83: invokestatic qeaa361f143ee4a0894bd168fd9b30c66/qf4ccf8f5435d4a78bdca4d6a018b578e/aaababbb.bbba (DDD)D
      // 86: dstore 15
      // 88: ldc2_w 0.25
      // 8b: dload 11
      // 8d: invokestatic java/lang/Math.max (DD)D
      // 90: d2f
      // 91: fstore 17
      // 93: dload 1
      // 94: fload 17
      // 96: f2d
      // 97: dsub
      // 98: d2f
      // 99: fstore 18
      // 9b: dload 3
      // 9c: fload 17
      // 9e: f2d
      // 9f: dsub
      // a0: d2f
      // a1: fstore 19
      // a3: dload 5
      // a5: fload 17
      // a7: fconst_2
      // a8: fmul
      // a9: f2d
      // aa: dadd
      // ab: d2f
      // ac: fstore 20
      // ae: dload 7
      // b0: fload 17
      // b2: fconst_2
      // b3: fmul
      // b4: f2d
      // b5: dadd
      // b6: d2f
      // b7: fstore 21
      // b9: dload 15
      // bb: fload 17
      // bd: f2d
      // be: dadd
      // bf: d2f
      // c0: fstore 22
      // c2: aload 0
      // c3: getfield net/minecraft/class_332.field_59826 Lnet/minecraft/class_11246;
      // c6: new qeaa361f143ee4a0894bd168fd9b30c66/qf4ccf8f5435d4a78bdca4d6a018b578e/bbababba
      // c9: dup
      // ca: new org/joml/Matrix3x2f
      // cd: dup
      // ce: aload 0
      // cf: invokevirtual net/minecraft/class_332.method_51448 ()Lorg/joml/Matrix3x2fStack;
      // d2: invokespecial org/joml/Matrix3x2f.<init> (Lorg/joml/Matrix3x2fc;)V
      // d5: fload 18
      // d7: fload 19
      // d9: fload 20
      // db: fload 21
      // dd: fload 22
      // df: fload 17
      // e1: bipush 4
      // e2: iload 13
      // e4: iload 13
      // e6: iload 13
      // e8: iload 13
      // ea: aload 0
      // eb: getfield net/minecraft/class_332.field_44659 Lnet/minecraft/class_332$class_8214;
      // ee: invokevirtual net/minecraft/class_332$class_8214.method_70863 ()Lnet/minecraft/class_8030;
      // f1: invokespecial qeaa361f143ee4a0894bd168fd9b30c66/qf4ccf8f5435d4a78bdca4d6a018b578e/bbababba.<init> (Lorg/joml/Matrix3x2fc;FFFFFFIIIIILnet/minecraft/class_8030;)V
      // f4: invokevirtual net/minecraft/class_11246.method_70919 (Lnet/minecraft/class_11244;)V
      // f7: bipush 1
      // f8: ireturn
   }

   private static int a(int var0, int var1) {
      int var2 = aabbb[var0 ^ 1171217852] ^ var1 ^ var0;
      var2 += 30981;
      var2 -= 32990;
      var2 ^= 48801;
      var2 += 1036;
      var2 ^= 2472;
      return var2 + 50808;
   }

   private static String aaaaab(char var0, short var1, int var2) {
      int var3 = var0 ^ '鷩';
      char[] var4 = abaaa[var3].toCharArray();
      StackTraceElement[] var5 = (StackTraceElement[])abaab[var3];
      StackTraceElement[] var6;
      if (var5 != null) {
         var6 = var5;
      } else {
         var6 = new Throwable().getStackTrace();
         abaab[var3] = var6;
      }

      StackTraceElement var7 = var6[1];
      int var8 = (var7.getClassName().hashCode() ^ var7.getMethodName().hashCode()) >> 16 ^ 6728;
      int var9 = 0;

      do {
         int var10 = var4[var9] ^ 31883;
         var10 += 48699;
         var10 -= 15180;
         var10 += 60369;
         var10 += 50301;
         var10 += 17900;
         var10 -= 8585;
         var10 ^= 34076;
         var4[var9] = (char)(var10 ^ var8 ^ var1 ^ var2 >> 16);
      } while (++var9 < var4.length);

      return new String(var4).intern();
   }

   static void bab(
      class_332 param0,
      class_2960 param1,
      int param2,
      int param3,
      int param4,
      int param5,
      int param6,
      int param7,
      int param8,
      int param9,
      int param10,
      int param11,
      int param12
   ) {
      // $VF: Couldn't be decompiled
      // Please report this to the Vineflower issue tracker, at https://github.com/Vineflower/vineflower/issues with a copy of the class file (if you have the rights to distribute it!)
      // java.lang.RuntimeException: parsing failure!
      //   at org.jetbrains.java.decompiler.modules.decompiler.decompose.DomHelper.parseGraph(DomHelper.java:211)
      //   at org.jetbrains.java.decompiler.main.rels.MethodProcessor.codeToJava(MethodProcessor.java:166)
      //
      // Bytecode:
      // 00: getstatic qeaa361f143ee4a0894bd168fd9b30c66/qf4ccf8f5435d4a78bdca4d6a018b578e/baaabbaa.bba I
      // 03: istore 13
      // 05: iload 12
      // 07: ldc_w 1171217840
      // 0a: ldc_w 1100963370
      // 0d: ldc_w -1025849094
      // 10: ixor
      // 11: invokestatic qeaa361f143ee4a0894bd168fd9b30c66/qf4ccf8f5435d4a78bdca4d6a018b578e/aaababbb.a (II)I
      // 14: ldc2_w 6485509548550546198
      // 17: invokestatic qeaa361f143ee4a0894bd168fd9b30c66/qf4ccf8f5435d4a78bdca4d6a018b578e/aaababbb.abbbb (IJ)I
      // 1a: iushr
      // 1b: iload 13
      // 1d: ifne 41
      // 20: ldc_w 1171217841
      // 23: ldc_w 1100963370
      // 26: ldc_w -1812081176
      // 29: ixor
      // 2a: invokestatic qeaa361f143ee4a0894bd168fd9b30c66/qf4ccf8f5435d4a78bdca4d6a018b578e/aaababbb.a (II)I
      // 2d: ldc2_w 5562011275870078093
      // 30: invokestatic qeaa361f143ee4a0894bd168fd9b30c66/qf4ccf8f5435d4a78bdca4d6a018b578e/aaababbb.abbbb (IJ)I
      // 33: iand
      // 34: ifle 8a
      // 37: goto 3b
      // 3a: athrow
      // 3b: iload 4
      // 3d: goto 41
      // 40: athrow
      // 41: iload 13
      // 43: ifne 4f
      // 46: ifle 8a
      // 49: goto 4d
      // 4c: athrow
      // 4d: iload 5
      // 4f: iload 13
      // 51: ifne 5d
      // 54: ifle 8a
      // 57: goto 5b
      // 5a: athrow
      // 5b: iload 8
      // 5d: iload 13
      // 5f: ifne 6b
      // 62: ifle 8a
      // 65: goto 69
      // 68: athrow
      // 69: iload 9
      // 6b: iload 13
      // 6d: ifne 79
      // 70: ifle 8a
      // 73: goto 77
      // 76: athrow
      // 77: iload 10
      // 79: iload 13
      // 7b: ifne 87
      // 7e: ifle 8a
      // 81: goto 85
      // 84: athrow
      // 85: iload 11
      // 87: ifgt 8b
      // 8a: return
      // 8b: aload 0
      // 8c: getstatic net/minecraft/class_10799.field_56883 Lcom/mojang/blaze3d/pipeline/RenderPipeline;
      // 8f: aload 1
      // 90: iload 2
      // 91: iload 3
      // 92: iload 6
      // 94: i2f
      // 95: iload 7
      // 97: i2f
      // 98: iload 4
      // 9a: iload 5
      // 9c: iload 8
      // 9e: iload 9
      // a0: iload 10
      // a2: iload 11
      // a4: iload 12
      // a6: invokevirtual net/minecraft/class_332.method_25293 (Lcom/mojang/blaze3d/pipeline/RenderPipeline;Lnet/minecraft/class_2960;IIFFIIIIIII)V
      // a9: return
   }

   static boolean bba(class_332 param0, double param1, double param3, double param5, double param7, double param9, int param11) {
      // $VF: Couldn't be decompiled
      // Please report this to the Vineflower issue tracker, at https://github.com/Vineflower/vineflower/issues with a copy of the class file (if you have the rights to distribute it!)
      // java.lang.RuntimeException: parsing failure!
      //   at org.jetbrains.java.decompiler.modules.decompiler.decompose.DomHelper.parseGraph(DomHelper.java:211)
      //   at org.jetbrains.java.decompiler.main.rels.MethodProcessor.codeToJava(MethodProcessor.java:166)
      //
      // Bytecode:
      // 00: getstatic qeaa361f143ee4a0894bd168fd9b30c66/qf4ccf8f5435d4a78bdca4d6a018b578e/baaabbaa.bba I
      // 03: istore 12
      // 05: dload 5
      // 07: dconst_0
      // 08: dcmpg
      // 09: iload 12
      // 0b: ifne 68
      // 0e: ifle 63
      // 11: goto 15
      // 14: athrow
      // 15: dload 7
      // 17: dconst_0
      // 18: dcmpg
      // 19: iload 12
      // 1b: ifne 68
      // 1e: goto 22
      // 21: athrow
      // 22: ifle 63
      // 25: goto 29
      // 28: athrow
      // 29: iload 11
      // 2b: ldc_w 1171217842
      // 2e: ldc_w 1375224279
      // 31: ldc_w -1813529028
      // 34: ixor
      // 35: invokestatic qeaa361f143ee4a0894bd168fd9b30c66/qf4ccf8f5435d4a78bdca4d6a018b578e/aaababbb.a (II)I
      // 38: ldc2_w 6485509548550546198
      // 3b: invokestatic qeaa361f143ee4a0894bd168fd9b30c66/qf4ccf8f5435d4a78bdca4d6a018b578e/aaababbb.abbbb (IJ)I
      // 3e: iushr
      // 3f: iload 12
      // 41: ifne 68
      // 44: goto 48
      // 47: athrow
      // 48: ldc_w 1171217843
      // 4b: ldc_w 1375224279
      // 4e: ldc_w 2113223147
      // 51: ixor
      // 52: invokestatic qeaa361f143ee4a0894bd168fd9b30c66/qf4ccf8f5435d4a78bdca4d6a018b578e/aaababbb.a (II)I
      // 55: ldc2_w 5562011275870078093
      // 58: invokestatic qeaa361f143ee4a0894bd168fd9b30c66/qf4ccf8f5435d4a78bdca4d6a018b578e/aaababbb.abbbb (IJ)I
      // 5b: iand
      // 5c: ifgt 69
      // 5f: goto 63
      // 62: athrow
      // 63: bipush 1
      // 64: goto 68
      // 67: athrow
      // 68: ireturn
      // 69: dload 5
      // 6b: dload 7
      // 6d: dload 9
      // 6f: invokestatic qeaa361f143ee4a0894bd168fd9b30c66/qf4ccf8f5435d4a78bdca4d6a018b578e/aaababbb.bbba (DDD)D
      // 72: dstore 13
      // 74: aload 0
      // 75: getfield net/minecraft/class_332.field_59826 Lnet/minecraft/class_11246;
      // 78: new qeaa361f143ee4a0894bd168fd9b30c66/qf4ccf8f5435d4a78bdca4d6a018b578e/bbababba
      // 7b: dup
      // 7c: new org/joml/Matrix3x2f
      // 7f: dup
      // 80: aload 0
      // 81: invokevirtual net/minecraft/class_332.method_51448 ()Lorg/joml/Matrix3x2fStack;
      // 84: invokespecial org/joml/Matrix3x2f.<init> (Lorg/joml/Matrix3x2fc;)V
      // 87: dload 1
      // 88: d2f
      // 89: dload 3
      // 8a: d2f
      // 8b: dload 5
      // 8d: d2f
      // 8e: dload 7
      // 90: d2f
      // 91: dload 13
      // 93: d2f
      // 94: fconst_0
      // 95: bipush 0
      // 96: iload 11
      // 98: iload 11
      // 9a: iload 11
      // 9c: iload 11
      // 9e: aload 0
      // 9f: getfield net/minecraft/class_332.field_44659 Lnet/minecraft/class_332$class_8214;
      // a2: invokevirtual net/minecraft/class_332$class_8214.method_70863 ()Lnet/minecraft/class_8030;
      // a5: invokespecial qeaa361f143ee4a0894bd168fd9b30c66/qf4ccf8f5435d4a78bdca4d6a018b578e/bbababba.<init> (Lorg/joml/Matrix3x2fc;FFFFFFIIIIILnet/minecraft/class_8030;)V
      // a8: invokevirtual net/minecraft/class_11246.method_70919 (Lnet/minecraft/class_11244;)V
      // ab: bipush 1
      // ac: ireturn
   }

   static boolean bbb(class_332 var0, double var1, double var3, double var5, double var7, double var9, int var11) {
      return baab(var0, var1, var3, var5, var7, var9, 1.0, var11);
   }

   static boolean aaaa(class_332 param0, double param1, double param3, double param5, double param7, double param9, int param11) {
      // $VF: Couldn't be decompiled
      // Please report this to the Vineflower issue tracker, at https://github.com/Vineflower/vineflower/issues with a copy of the class file (if you have the rights to distribute it!)
      // java.lang.RuntimeException: parsing failure!
      //   at org.jetbrains.java.decompiler.modules.decompiler.decompose.DomHelper.parseGraph(DomHelper.java:211)
      //   at org.jetbrains.java.decompiler.main.rels.MethodProcessor.codeToJava(MethodProcessor.java:166)
      //
      // Bytecode:
      // 00: getstatic qeaa361f143ee4a0894bd168fd9b30c66/qf4ccf8f5435d4a78bdca4d6a018b578e/baaabbaa.bba I
      // 03: istore 12
      // 05: dload 5
      // 07: dconst_0
      // 08: dcmpg
      // 09: iload 12
      // 0b: ifne 68
      // 0e: ifle 63
      // 11: goto 15
      // 14: athrow
      // 15: dload 7
      // 17: dconst_0
      // 18: dcmpg
      // 19: iload 12
      // 1b: ifne 68
      // 1e: goto 22
      // 21: athrow
      // 22: ifle 63
      // 25: goto 29
      // 28: athrow
      // 29: iload 11
      // 2b: iload 12
      // 2d: ifne a2
      // 30: goto 34
      // 33: athrow
      // 34: ldc_w 1171217836
      // 37: ldc_w 275313986
      // 3a: ldc_w 35748435
      // 3d: ixor
      // 3e: invokestatic qeaa361f143ee4a0894bd168fd9b30c66/qf4ccf8f5435d4a78bdca4d6a018b578e/aaababbb.a (II)I
      // 41: ldc2_w 6485509548550546198
      // 44: invokestatic qeaa361f143ee4a0894bd168fd9b30c66/qf4ccf8f5435d4a78bdca4d6a018b578e/aaababbb.abbbb (IJ)I
      // 47: iushr
      // 48: ldc_w 1171217837
      // 4b: ldc_w 275313986
      // 4e: ldc_w 1725151861
      // 51: ixor
      // 52: invokestatic qeaa361f143ee4a0894bd168fd9b30c66/qf4ccf8f5435d4a78bdca4d6a018b578e/aaababbb.a (II)I
      // 55: ldc2_w 5562011275870078093
      // 58: invokestatic qeaa361f143ee4a0894bd168fd9b30c66/qf4ccf8f5435d4a78bdca4d6a018b578e/aaababbb.abbbb (IJ)I
      // 5b: iand
      // 5c: ifgt 69
      // 5f: goto 63
      // 62: athrow
      // 63: bipush 1
      // 64: goto 68
      // 67: athrow
      // 68: ireturn
      // 69: aload 0
      // 6a: getfield net/minecraft/class_332.field_59826 Lnet/minecraft/class_11246;
      // 6d: new qeaa361f143ee4a0894bd168fd9b30c66/qf4ccf8f5435d4a78bdca4d6a018b578e/ababbabaa
      // 70: dup
      // 71: new org/joml/Matrix3x2f
      // 74: dup
      // 75: aload 0
      // 76: invokevirtual net/minecraft/class_332.method_51448 ()Lorg/joml/Matrix3x2fStack;
      // 79: invokespecial org/joml/Matrix3x2f.<init> (Lorg/joml/Matrix3x2fc;)V
      // 7c: dload 1
      // 7d: d2f
      // 7e: dload 3
      // 7f: d2f
      // 80: dload 5
      // 82: d2f
      // 83: dload 7
      // 85: d2f
      // 86: dload 5
      // 88: dload 7
      // 8a: dload 9
      // 8c: invokestatic qeaa361f143ee4a0894bd168fd9b30c66/qf4ccf8f5435d4a78bdca4d6a018b578e/aaababbb.bbba (DDD)D
      // 8f: d2f
      // 90: fconst_0
      // 91: iload 11
      // 93: bipush 0
      // 94: aload 0
      // 95: getfield net/minecraft/class_332.field_44659 Lnet/minecraft/class_332$class_8214;
      // 98: invokevirtual net/minecraft/class_332$class_8214.method_70863 ()Lnet/minecraft/class_8030;
      // 9b: invokespecial qeaa361f143ee4a0894bd168fd9b30c66/qf4ccf8f5435d4a78bdca4d6a018b578e/ababbabaa.<init> (Lorg/joml/Matrix3x2fc;FFFFFFIZLnet/minecraft/class_8030;)V
      // 9e: invokevirtual net/minecraft/class_11246.method_70919 (Lnet/minecraft/class_11244;)V
      // a1: bipush 1
      // a2: ireturn
   }

   private static RenderPipeline aaab() {
      return class_10799.method_67887(
         RenderPipeline.builder(new Snippet[]{class_10799.field_60125})
            .withLocation(aabba(aaaaa))
            .withVertexShader(aabba(bbab))
            .withFragmentShader(aabba(bbab))
            .withBlend(BlendFunction.TRANSLUCENT)
            .withDepthTestFunction(DepthTestFunction.NO_DEPTH_TEST)
            .withDepthWrite(false)
            .withCull(false)
            .withVertexFormat(class_290.field_1575, class_5596.field_27379)
            .build()
      );
   }

   private static RenderPipeline aaba() {
      return class_10799.method_67887(
         RenderPipeline.builder(new Snippet[]{class_10799.field_60125})
            .withLocation(aabba(baab))
            .withVertexShader(aabba(baba))
            .withFragmentShader(aabba(aaabb))
            .withBlend(BlendFunction.TRANSLUCENT)
            .withDepthTestFunction(DepthTestFunction.NO_DEPTH_TEST)
            .withDepthWrite(false)
            .withCull(false)
            .withVertexFormat(class_290.field_1590, class_5596.field_27382)
            .build()
      );
   }

   private static void aabb(
      class_4588 param0,
      Matrix3x2fc param1,
      float param2,
      float param3,
      float param4,
      float param5,
      float param6,
      float param7,
      int param8,
      int param9,
      int param10,
      int param11,
      int param12
   ) {
      // $VF: Couldn't be decompiled
      // Please report this to the Vineflower issue tracker, at https://github.com/Vineflower/vineflower/issues with a copy of the class file (if you have the rights to distribute it!)
      // java.lang.RuntimeException: parsing failure!
      //   at org.jetbrains.java.decompiler.modules.decompiler.decompose.DomHelper.parseGraph(DomHelper.java:211)
      //   at org.jetbrains.java.decompiler.main.rels.MethodProcessor.codeToJava(MethodProcessor.java:166)
      //
      // Bytecode:
      // 00: getstatic qeaa361f143ee4a0894bd168fd9b30c66/qf4ccf8f5435d4a78bdca4d6a018b578e/baaabbaa.bba I
      // 03: istore 13
      // 05: fload 4
      // 07: iload 13
      // 09: ifne 1b
      // 0c: fconst_0
      // 0d: fcmpg
      // 0e: ifle 29
      // 11: goto 15
      // 14: athrow
      // 15: fload 5
      // 17: goto 1b
      // 1a: athrow
      // 1b: iload 13
      // 1d: ifne 2d
      // 20: fconst_0
      // 21: fcmpg
      // 22: ifgt 2b
      // 25: goto 29
      // 28: athrow
      // 29: return
      // 2a: athrow
      // 2b: fload 4
      // 2d: invokestatic qeaa361f143ee4a0894bd168fd9b30c66/qf4ccf8f5435d4a78bdca4d6a018b578e/aaababbb.b (F)I
      // 30: istore 14
      // 32: fload 5
      // 34: invokestatic qeaa361f143ee4a0894bd168fd9b30c66/qf4ccf8f5435d4a78bdca4d6a018b578e/aaababbb.b (F)I
      // 37: istore 15
      // 39: ldc 1.0E-4
      // 3b: fload 4
      // 3d: fload 5
      // 3f: invokestatic java/lang/Math.min (FF)F
      // 42: invokestatic java/lang/Math.max (FF)F
      // 45: fstore 16
      // 47: fload 6
      // 49: fload 16
      // 4b: fdiv
      // 4c: invokestatic qeaa361f143ee4a0894bd168fd9b30c66/qf4ccf8f5435d4a78bdca4d6a018b578e/aaababbb.babb (F)F
      // 4f: fstore 17
      // 51: fload 7
      // 53: fload 16
      // 55: fdiv
      // 56: invokestatic qeaa361f143ee4a0894bd168fd9b30c66/qf4ccf8f5435d4a78bdca4d6a018b578e/aaababbb.babb (F)F
      // 59: fstore 18
      // 5b: fload 17
      // 5d: invokestatic qeaa361f143ee4a0894bd168fd9b30c66/qf4ccf8f5435d4a78bdca4d6a018b578e/aaababbb.baaaa (F)F
      // 60: fstore 19
      // 62: fload 18
      // 64: invokestatic qeaa361f143ee4a0894bd168fd9b30c66/qf4ccf8f5435d4a78bdca4d6a018b578e/aaababbb.baaaa (F)F
      // 67: fstore 20
      // 69: iload 8
      // 6b: invokestatic qeaa361f143ee4a0894bd168fd9b30c66/qf4ccf8f5435d4a78bdca4d6a018b578e/aaababbb.aabaa (I)F
      // 6e: fstore 21
      // 70: aload 0
      // 71: aload 1
      // 72: fload 2
      // 73: fload 3
      // 74: fconst_0
      // 75: fconst_0
      // 76: iload 14
      // 78: iload 15
      // 7a: fload 19
      // 7c: fload 20
      // 7e: fload 21
      // 80: iload 9
      // 82: invokestatic qeaa361f143ee4a0894bd168fd9b30c66/qf4ccf8f5435d4a78bdca4d6a018b578e/aaababbb.abba (Lnet/minecraft/class_4588;Lorg/joml/Matrix3x2fc;FFFFIIFFFI)V
      // 85: aload 0
      // 86: aload 1
      // 87: fload 2
      // 88: fload 3
      // 89: fload 5
      // 8b: fadd
      // 8c: fconst_0
      // 8d: fconst_1
      // 8e: iload 14
      // 90: iload 15
      // 92: fload 19
      // 94: fload 20
      // 96: fload 21
      // 98: iload 12
      // 9a: invokestatic qeaa361f143ee4a0894bd168fd9b30c66/qf4ccf8f5435d4a78bdca4d6a018b578e/aaababbb.abba (Lnet/minecraft/class_4588;Lorg/joml/Matrix3x2fc;FFFFIIFFFI)V
      // 9d: aload 0
      // 9e: aload 1
      // 9f: fload 2
      // a0: fload 4
      // a2: fadd
      // a3: fload 3
      // a4: fload 5
      // a6: fadd
      // a7: fconst_1
      // a8: fconst_1
      // a9: iload 14
      // ab: iload 15
      // ad: fload 19
      // af: fload 20
      // b1: fload 21
      // b3: iload 11
      // b5: invokestatic qeaa361f143ee4a0894bd168fd9b30c66/qf4ccf8f5435d4a78bdca4d6a018b578e/aaababbb.abba (Lnet/minecraft/class_4588;Lorg/joml/Matrix3x2fc;FFFFIIFFFI)V
      // b8: aload 0
      // b9: aload 1
      // ba: fload 2
      // bb: fload 4
      // bd: fadd
      // be: fload 3
      // bf: fconst_1
      // c0: fconst_0
      // c1: iload 14
      // c3: iload 15
      // c5: fload 19
      // c7: fload 20
      // c9: fload 21
      // cb: iload 10
      // cd: invokestatic qeaa361f143ee4a0894bd168fd9b30c66/qf4ccf8f5435d4a78bdca4d6a018b578e/aaababbb.abba (Lnet/minecraft/class_4588;Lorg/joml/Matrix3x2fc;FFFFIIFFFI)V
      // d0: return
   }

   private static RenderPipeline abaa() {
      return class_10799.method_67887(
         RenderPipeline.builder(new Snippet[]{class_10799.field_60125})
            .withLocation(aabba(baa))
            .withVertexShader(aabba(baba))
            .withFragmentShader(aabba(aaa))
            .withSampler(aba.abab())
            .withBlend(BlendFunction.TRANSLUCENT)
            .withDepthTestFunction(DepthTestFunction.NO_DEPTH_TEST)
            .withDepthWrite(false)
            .withCull(false)
            .withVertexFormat(class_290.field_1590, class_5596.field_27382)
            .build()
      );
   }

   static aaababb abab(class_332 param0, class_2960 param1) {
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
      // 05: ifnull 10
      // 08: aload 1
      // 09: ifnonnull 13
      // 0c: goto 10
      // 0f: athrow
      // 10: aconst_null
      // 11: areturn
      // 12: athrow
      // 13: invokestatic net/minecraft/class_310.method_1551 ()Lnet/minecraft/class_310;
      // 16: invokevirtual net/minecraft/class_310.method_1531 ()Lnet/minecraft/class_1060;
      // 19: aload 1
      // 1a: invokevirtual net/minecraft/class_1060.method_4619 (Lnet/minecraft/class_2960;)Lnet/minecraft/class_1044;
      // 1d: astore 3
      // 1e: invokestatic com/mojang/blaze3d/systems/RenderSystem.getSamplerCache ()Lnet/minecraft/class_12136;
      // 21: iload 2
      // 22: ifne 2f
      // 25: ifnull 38
      // 28: goto 2c
      // 2b: athrow
      // 2c: invokestatic com/mojang/blaze3d/systems/RenderSystem.getSamplerCache ()Lnet/minecraft/class_12136;
      // 2f: getstatic com/mojang/blaze3d/textures/FilterMode.LINEAR Lcom/mojang/blaze3d/textures/FilterMode;
      // 32: invokevirtual net/minecraft/class_12136.method_75294 (Lcom/mojang/blaze3d/textures/FilterMode;)Lnet/minecraft/class_12137;
      // 35: goto 3c
      // 38: aload 3
      // 39: invokevirtual net/minecraft/class_1044.method_75484 ()Lnet/minecraft/class_12137;
      // 3c: astore 4
      // 3e: new qeaa361f143ee4a0894bd168fd9b30c66/qf4ccf8f5435d4a78bdca4d6a018b578e/aaababb
      // 41: dup
      // 42: new org/joml/Matrix3x2f
      // 45: dup
      // 46: aload 0
      // 47: invokevirtual net/minecraft/class_332.method_51448 ()Lorg/joml/Matrix3x2fStack;
      // 4a: invokespecial org/joml/Matrix3x2f.<init> (Lorg/joml/Matrix3x2fc;)V
      // 4d: aload 3
      // 4e: invokevirtual net/minecraft/class_1044.method_71659 ()Lcom/mojang/blaze3d/textures/GpuTextureView;
      // 51: aload 4
      // 53: invokestatic net/minecraft/class_11231.method_70900 (Lcom/mojang/blaze3d/textures/GpuTextureView;Lnet/minecraft/class_12137;)Lnet/minecraft/class_11231;
      // 56: invokespecial qeaa361f143ee4a0894bd168fd9b30c66/qf4ccf8f5435d4a78bdca4d6a018b578e/aaababb.<init> (Lorg/joml/Matrix3x2f;Lnet/minecraft/class_11231;)V
      // 59: areturn
   }

   private static void abba(
      class_4588 var0, Matrix3x2fc var1, float var2, float var3, float var4, float var5, int var6, int var7, float var8, float var9, float var10, int var11
   ) {
      var0.method_70815(var1, var2, var3).method_39415(var11).method_22913(var4, var5).method_22921(var6, var7).method_22914(var8, var9, var10);
   }

   static void abbb(class_332 param0, class_2960 param1, double param2, double param4, double param6, double param8, double param10, int param12) {
      // $VF: Couldn't be decompiled
      // Please report this to the Vineflower issue tracker, at https://github.com/Vineflower/vineflower/issues with a copy of the class file (if you have the rights to distribute it!)
      // java.lang.RuntimeException: parsing failure!
      //   at org.jetbrains.java.decompiler.modules.decompiler.decompose.DomHelper.parseGraph(DomHelper.java:211)
      //   at org.jetbrains.java.decompiler.main.rels.MethodProcessor.codeToJava(MethodProcessor.java:166)
      //
      // Bytecode:
      // 00: getstatic qeaa361f143ee4a0894bd168fd9b30c66/qf4ccf8f5435d4a78bdca4d6a018b578e/baaabbaa.bba I
      // 03: istore 13
      // 05: iload 12
      // 07: iload 13
      // 09: ifne 4c
      // 0c: ldc_w 1171217838
      // 0f: ldc_w 834630956
      // 12: ldc_w -1612113257
      // 15: ixor
      // 16: invokestatic qeaa361f143ee4a0894bd168fd9b30c66/qf4ccf8f5435d4a78bdca4d6a018b578e/aaababbb.a (II)I
      // 19: ldc2_w 6485509548550546198
      // 1c: invokestatic qeaa361f143ee4a0894bd168fd9b30c66/qf4ccf8f5435d4a78bdca4d6a018b578e/aaababbb.abbbb (IJ)I
      // 1f: iushr
      // 20: ldc_w 1171217839
      // 23: ldc_w 834630956
      // 26: ldc_w -16297872
      // 29: ixor
      // 2a: invokestatic qeaa361f143ee4a0894bd168fd9b30c66/qf4ccf8f5435d4a78bdca4d6a018b578e/aaababbb.a (II)I
      // 2d: ldc2_w 5562011275870078093
      // 30: invokestatic qeaa361f143ee4a0894bd168fd9b30c66/qf4ccf8f5435d4a78bdca4d6a018b578e/aaababbb.abbbb (IJ)I
      // 33: iand
      // 34: ifle 5f
      // 37: goto 3b
      // 3a: athrow
      // 3b: dload 6
      // 3d: iload 13
      // 3f: ifne 51
      // 42: goto 46
      // 45: athrow
      // 46: dconst_0
      // 47: dcmpg
      // 48: goto 4c
      // 4b: athrow
      // 4c: ifle 5f
      // 4f: dload 8
      // 51: iload 13
      // 53: ifne 6a
      // 56: dconst_0
      // 57: dcmpg
      // 58: ifgt 61
      // 5b: goto 5f
      // 5e: athrow
      // 5f: return
      // 60: athrow
      // 61: dload 6
      // 63: dload 8
      // 65: dload 10
      // 67: invokestatic qeaa361f143ee4a0894bd168fd9b30c66/qf4ccf8f5435d4a78bdca4d6a018b578e/aaababbb.bbba (DDD)D
      // 6a: dstore 14
      // 6c: iload 13
      // 6e: ifne a0
      // 71: dload 14
      // 73: ldc2_w 0.01
      // 76: dcmpg
      // 77: ifgt a1
      // 7a: goto 7e
      // 7d: athrow
      // 7e: aload 0
      // 7f: aload 1
      // 80: dload 2
      // 81: invokestatic java/lang/Math.round (D)J
      // 84: l2i
      // 85: dload 4
      // 87: invokestatic java/lang/Math.round (D)J
      // 8a: l2i
      // 8b: dload 6
      // 8d: invokestatic java/lang/Math.round (D)J
      // 90: l2i
      // 91: dload 8
      // 93: invokestatic java/lang/Math.round (D)J
      // 96: l2i
      // 97: iload 12
      // 99: invokestatic qeaa361f143ee4a0894bd168fd9b30c66/qf4ccf8f5435d4a78bdca4d6a018b578e/aaababbb.bbbba (Lnet/minecraft/class_332;Lnet/minecraft/class_2960;IIIII)V
      // 9c: goto a0
      // 9f: athrow
      // a0: return
      // a1: invokestatic net/minecraft/class_310.method_1551 ()Lnet/minecraft/class_310;
      // a4: invokevirtual net/minecraft/class_310.method_1531 ()Lnet/minecraft/class_1060;
      // a7: aload 1
      // a8: invokevirtual net/minecraft/class_1060.method_4619 (Lnet/minecraft/class_2960;)Lnet/minecraft/class_1044;
      // ab: astore 16
      // ad: aload 16
      // af: iload 13
      // b1: ifne be
      // b4: ifnonnull bc
      // b7: goto bb
      // ba: athrow
      // bb: return
      // bc: aload 16
      // be: invokevirtual net/minecraft/class_1044.method_71659 ()Lcom/mojang/blaze3d/textures/GpuTextureView;
      // c1: aload 16
      // c3: invokevirtual net/minecraft/class_1044.method_75484 ()Lnet/minecraft/class_12137;
      // c6: invokestatic net/minecraft/class_11231.method_70900 (Lcom/mojang/blaze3d/textures/GpuTextureView;Lnet/minecraft/class_12137;)Lnet/minecraft/class_11231;
      // c9: astore 17
      // cb: aload 0
      // cc: getfield net/minecraft/class_332.field_59826 Lnet/minecraft/class_11246;
      // cf: new qeaa361f143ee4a0894bd168fd9b30c66/qf4ccf8f5435d4a78bdca4d6a018b578e/bbbabbaa
      // d2: dup
      // d3: aload 17
      // d5: new org/joml/Matrix3x2f
      // d8: dup
      // d9: aload 0
      // da: invokevirtual net/minecraft/class_332.method_51448 ()Lorg/joml/Matrix3x2fStack;
      // dd: invokespecial org/joml/Matrix3x2f.<init> (Lorg/joml/Matrix3x2fc;)V
      // e0: dload 2
      // e1: d2f
      // e2: dload 4
      // e4: d2f
      // e5: dload 6
      // e7: d2f
      // e8: dload 8
      // ea: d2f
      // eb: dload 14
      // ed: d2f
      // ee: iload 12
      // f0: aload 0
      // f1: getfield net/minecraft/class_332.field_44659 Lnet/minecraft/class_332$class_8214;
      // f4: invokevirtual net/minecraft/class_332$class_8214.method_70863 ()Lnet/minecraft/class_8030;
      // f7: invokespecial qeaa361f143ee4a0894bd168fd9b30c66/qf4ccf8f5435d4a78bdca4d6a018b578e/bbbabbaa.<init> (Lnet/minecraft/class_11231;Lorg/joml/Matrix3x2fc;FFFFFILnet/minecraft/class_8030;)V
      // fa: invokevirtual net/minecraft/class_11246.method_70919 (Lnet/minecraft/class_11244;)V
      // fd: return
   }

   static void baaa(class_332 var0, double var1, double var3) {
      var0.method_51448().mul(new Matrix3x2f(1.0F, (float)var3, (float)var1, 1.0F, 0.0F, 0.0F));
   }

   static boolean baab(class_332 param0, double param1, double param3, double param5, double param7, double param9, double param11, int param13) {
      // $VF: Couldn't be decompiled
      // Please report this to the Vineflower issue tracker, at https://github.com/Vineflower/vineflower/issues with a copy of the class file (if you have the rights to distribute it!)
      // java.lang.RuntimeException: parsing failure!
      //   at org.jetbrains.java.decompiler.modules.decompiler.decompose.DomHelper.parseGraph(DomHelper.java:211)
      //   at org.jetbrains.java.decompiler.main.rels.MethodProcessor.codeToJava(MethodProcessor.java:166)
      //
      // Bytecode:
      // 00: getstatic qeaa361f143ee4a0894bd168fd9b30c66/qf4ccf8f5435d4a78bdca4d6a018b578e/baaabbaa.bba I
      // 03: istore 14
      // 05: dload 5
      // 07: dconst_0
      // 08: dcmpg
      // 09: iload 14
      // 0b: ifne 68
      // 0e: ifle 63
      // 11: goto 15
      // 14: athrow
      // 15: dload 7
      // 17: dconst_0
      // 18: dcmpg
      // 19: iload 14
      // 1b: ifne 68
      // 1e: goto 22
      // 21: athrow
      // 22: ifle 63
      // 25: goto 29
      // 28: athrow
      // 29: iload 13
      // 2b: iload 14
      // 2d: ifne 68
      // 30: goto 34
      // 33: athrow
      // 34: ldc_w 1171217832
      // 37: ldc_w 1280335173
      // 3a: ldc_w -456898861
      // 3d: ixor
      // 3e: invokestatic qeaa361f143ee4a0894bd168fd9b30c66/qf4ccf8f5435d4a78bdca4d6a018b578e/aaababbb.a (II)I
      // 41: ldc2_w 6485509548550546198
      // 44: invokestatic qeaa361f143ee4a0894bd168fd9b30c66/qf4ccf8f5435d4a78bdca4d6a018b578e/aaababbb.abbbb (IJ)I
      // 47: iushr
      // 48: ldc_w 1171217833
      // 4b: ldc_w 1280335173
      // 4e: ldc_w -498640295
      // 51: ixor
      // 52: invokestatic qeaa361f143ee4a0894bd168fd9b30c66/qf4ccf8f5435d4a78bdca4d6a018b578e/aaababbb.a (II)I
      // 55: ldc2_w 5562011275870078093
      // 58: invokestatic qeaa361f143ee4a0894bd168fd9b30c66/qf4ccf8f5435d4a78bdca4d6a018b578e/aaababbb.abbbb (IJ)I
      // 5b: iand
      // 5c: ifgt 69
      // 5f: goto 63
      // 62: athrow
      // 63: bipush 1
      // 64: goto 68
      // 67: athrow
      // 68: ireturn
      // 69: dload 5
      // 6b: dload 7
      // 6d: dload 9
      // 6f: invokestatic qeaa361f143ee4a0894bd168fd9b30c66/qf4ccf8f5435d4a78bdca4d6a018b578e/aaababbb.bbba (DDD)D
      // 72: dstore 15
      // 74: ldc2_w 0.25
      // 77: dload 11
      // 79: dload 5
      // 7b: dload 7
      // 7d: invokestatic java/lang/Math.min (DD)D
      // 80: ldc2_w 0.5
      // 83: dmul
      // 84: invokestatic java/lang/Math.min (DD)D
      // 87: invokestatic java/lang/Math.max (DD)D
      // 8a: dstore 17
      // 8c: aload 0
      // 8d: getfield net/minecraft/class_332.field_59826 Lnet/minecraft/class_11246;
      // 90: new qeaa361f143ee4a0894bd168fd9b30c66/qf4ccf8f5435d4a78bdca4d6a018b578e/bbababba
      // 93: dup
      // 94: new org/joml/Matrix3x2f
      // 97: dup
      // 98: aload 0
      // 99: invokevirtual net/minecraft/class_332.method_51448 ()Lorg/joml/Matrix3x2fStack;
      // 9c: invokespecial org/joml/Matrix3x2f.<init> (Lorg/joml/Matrix3x2fc;)V
      // 9f: dload 1
      // a0: d2f
      // a1: dload 3
      // a2: d2f
      // a3: dload 5
      // a5: d2f
      // a6: dload 7
      // a8: d2f
      // a9: dload 15
      // ab: d2f
      // ac: dload 17
      // ae: d2f
      // af: bipush 3
      // b0: iload 13
      // b2: iload 13
      // b4: iload 13
      // b6: iload 13
      // b8: aload 0
      // b9: getfield net/minecraft/class_332.field_44659 Lnet/minecraft/class_332$class_8214;
      // bc: invokevirtual net/minecraft/class_332$class_8214.method_70863 ()Lnet/minecraft/class_8030;
      // bf: invokespecial qeaa361f143ee4a0894bd168fd9b30c66/qf4ccf8f5435d4a78bdca4d6a018b578e/bbababba.<init> (Lorg/joml/Matrix3x2fc;FFFFFFIIIIILnet/minecraft/class_8030;)V
      // c2: invokevirtual net/minecraft/class_11246.method_70919 (Lnet/minecraft/class_11244;)V
      // c5: bipush 1
      // c6: ireturn
   }

   static void baba(class_332 var0) {
      var0.method_51448().pushMatrix();
   }

   private static float babb(float var0) {
      return Math.max(0.0F, Math.min(1.0F, var0));
   }

   private static void bbaa(class_4588 var0, Matrix3x2fc var1, float var2, float var3, float var4, float var5, float var6, int var7) {
      int var10000 = a(1171217834, 1075624518 ^ -1806594520);
      int var9 = abaab(var6);
      float[] var10 = new float[abbbb(var10000, 1332466351326918394L)];
      float[] var11 = new float[abbbb(a(1171217835, 1075624518 ^ -729295458), 5592888340436613844L)];
      int var12 = bbbaa(var10, var11, var2, var3, var4, var5, var6, var9);
      float var13 = var2 + var4 * 0.5F;
      float var14 = var3 + var5 * 0.5F;
      int var15 = 0;
      int var8 = baaabbaa.bba;

      while (var15 < var12) {
         int var16 = (var15 + 1) % var12;
         babaa(var0, var1, var13, var14, var7);
         babaa(var0, var1, var10[var15], var11[var15], var7);
         babaa(var0, var1, var10[var16], var11[var16], var7);
         var15++;
         if (var8 != 0) {
            break;
         }
      }
   }

   static void bbab(
      class_332 param0,
      aaababb param1,
      double param2,
      double param4,
      double param6,
      double param8,
      float param10,
      float param11,
      float param12,
      float param13,
      int param14,
      float param15,
      float param16
   ) {
      // $VF: Couldn't be decompiled
      // Please report this to the Vineflower issue tracker, at https://github.com/Vineflower/vineflower/issues with a copy of the class file (if you have the rights to distribute it!)
      // java.lang.RuntimeException: parsing failure!
      //   at org.jetbrains.java.decompiler.modules.decompiler.decompose.DomHelper.parseGraph(DomHelper.java:211)
      //   at org.jetbrains.java.decompiler.main.rels.MethodProcessor.codeToJava(MethodProcessor.java:166)
      //
      // Bytecode:
      // 00: getstatic qeaa361f143ee4a0894bd168fd9b30c66/qf4ccf8f5435d4a78bdca4d6a018b578e/baaabbaa.bba I
      // 03: istore 17
      // 05: aload 0
      // 06: ifnull 6a
      // 09: aload 1
      // 0a: ifnull 6a
      // 0d: goto 11
      // 10: athrow
      // 11: dload 6
      // 13: dconst_0
      // 14: iload 17
      // 16: ifne 2c
      // 19: goto 1d
      // 1c: athrow
      // 1d: dcmpg
      // 1e: ifle 6a
      // 21: goto 25
      // 24: athrow
      // 25: dload 8
      // 27: dconst_0
      // 28: goto 2c
      // 2b: athrow
      // 2c: dcmpg
      // 2d: iload 17
      // 2f: ifne 67
      // 32: ifle 6a
      // 35: goto 39
      // 38: athrow
      // 39: iload 14
      // 3b: ldc_w 1171217828
      // 3e: ldc_w -604375287
      // 41: ldc_w 1653677846
      // 44: ixor
      // 45: invokestatic qeaa361f143ee4a0894bd168fd9b30c66/qf4ccf8f5435d4a78bdca4d6a018b578e/aaababbb.a (II)I
      // 48: ldc2_w 6485509548550546198
      // 4b: invokestatic qeaa361f143ee4a0894bd168fd9b30c66/qf4ccf8f5435d4a78bdca4d6a018b578e/aaababbb.abbbb (IJ)I
      // 4e: iushr
      // 4f: ldc_w 1171217829
      // 52: ldc_w -604375287
      // 55: ldc_w -2080359068
      // 58: ixor
      // 59: invokestatic qeaa361f143ee4a0894bd168fd9b30c66/qf4ccf8f5435d4a78bdca4d6a018b578e/aaababbb.a (II)I
      // 5c: ldc2_w 5562011275870078093
      // 5f: invokestatic qeaa361f143ee4a0894bd168fd9b30c66/qf4ccf8f5435d4a78bdca4d6a018b578e/aaababbb.abbbb (IJ)I
      // 62: iand
      // 63: goto 67
      // 66: athrow
      // 67: ifgt 6b
      // 6a: return
      // 6b: aload 0
      // 6c: getfield net/minecraft/class_332.field_59826 Lnet/minecraft/class_11246;
      // 6f: new qeaa361f143ee4a0894bd168fd9b30c66/qf4ccf8f5435d4a78bdca4d6a018b578e/aaababab
      // 72: dup
      // 73: aload 1
      // 74: getfield qeaa361f143ee4a0894bd168fd9b30c66/qf4ccf8f5435d4a78bdca4d6a018b578e/aaababb.aa Lorg/joml/Matrix3x2f;
      // 77: dload 2
      // 78: d2f
      // 79: dload 4
      // 7b: d2f
      // 7c: dload 6
      // 7e: d2f
      // 7f: dload 8
      // 81: d2f
      // 82: fload 10
      // 84: fload 11
      // 86: fload 12
      // 88: fload 13
      // 8a: iload 14
      // 8c: fload 15
      // 8e: fload 16
      // 90: aload 1
      // 91: getfield qeaa361f143ee4a0894bd168fd9b30c66/qf4ccf8f5435d4a78bdca4d6a018b578e/aaababb.a Lnet/minecraft/class_11231;
      // 94: aload 0
      // 95: getfield net/minecraft/class_332.field_44659 Lnet/minecraft/class_332$class_8214;
      // 98: invokevirtual net/minecraft/class_332$class_8214.method_70863 ()Lnet/minecraft/class_8030;
      // 9b: invokespecial qeaa361f143ee4a0894bd168fd9b30c66/qf4ccf8f5435d4a78bdca4d6a018b578e/aaababab.<init> (Lorg/joml/Matrix3x2fc;FFFFFFFFIFFLnet/minecraft/class_11231;Lnet/minecraft/class_8030;)V
      // 9e: invokevirtual net/minecraft/class_11246.method_70919 (Lnet/minecraft/class_11244;)V
      // a1: return
   }

   private static double bbba(double var0, double var2, double var4) {
      return Math.min(Math.min(var0, var2) * 0.5, Math.max(0.0, var4));
   }

   static boolean bbbb(
      class_332 var0,
      class_2960 var1,
      double var2,
      double var4,
      double var6,
      double var8,
      float var10,
      float var11,
      float var12,
      float var13,
      int var14,
      float var15
   ) {
      return aaaba(var0, var1, var2, var4, var6, var8, var10, var11, var12, var13, var14, var15, 0.0F);
   }

   static boolean aaaaa(
      class_332 param0, double param1, double param3, double param5, double param7, double param9, int param11, int param12, boolean param13, boolean param14
   ) {
      // $VF: Couldn't be decompiled
      // Please report this to the Vineflower issue tracker, at https://github.com/Vineflower/vineflower/issues with a copy of the class file (if you have the rights to distribute it!)
      // java.lang.RuntimeException: parsing failure!
      //   at org.jetbrains.java.decompiler.modules.decompiler.decompose.DomHelper.parseGraph(DomHelper.java:211)
      //   at org.jetbrains.java.decompiler.main.rels.MethodProcessor.codeToJava(MethodProcessor.java:166)
      //
      // Bytecode:
      // 000: getstatic qeaa361f143ee4a0894bd168fd9b30c66/qf4ccf8f5435d4a78bdca4d6a018b578e/baaabbaa.bba I
      // 003: iload 11
      // 005: ldc_w 1171217830
      // 008: ldc_w -1407560986
      // 00b: ldc_w -439957547
      // 00e: ixor
      // 00f: invokestatic qeaa361f143ee4a0894bd168fd9b30c66/qf4ccf8f5435d4a78bdca4d6a018b578e/aaababbb.a (II)I
      // 012: ldc2_w 6485509548550546198
      // 015: invokestatic qeaa361f143ee4a0894bd168fd9b30c66/qf4ccf8f5435d4a78bdca4d6a018b578e/aaababbb.abbbb (IJ)I
      // 018: iushr
      // 019: ldc_w 1171217831
      // 01c: ldc_w -1407560986
      // 01f: ldc_w -699987999
      // 022: ixor
      // 023: invokestatic qeaa361f143ee4a0894bd168fd9b30c66/qf4ccf8f5435d4a78bdca4d6a018b578e/aaababbb.a (II)I
      // 026: ldc2_w 5562011275870078093
      // 029: invokestatic qeaa361f143ee4a0894bd168fd9b30c66/qf4ccf8f5435d4a78bdca4d6a018b578e/aaababbb.abbbb (IJ)I
      // 02c: iand
      // 02d: istore 16
      // 02f: istore 15
      // 031: iload 12
      // 033: ldc_w 1171217824
      // 036: ldc_w -1407560986
      // 039: ldc_w 719395165
      // 03c: ixor
      // 03d: invokestatic qeaa361f143ee4a0894bd168fd9b30c66/qf4ccf8f5435d4a78bdca4d6a018b578e/aaababbb.a (II)I
      // 040: ldc2_w 6485509548550546198
      // 043: invokestatic qeaa361f143ee4a0894bd168fd9b30c66/qf4ccf8f5435d4a78bdca4d6a018b578e/aaababbb.abbbb (IJ)I
      // 046: iushr
      // 047: ldc_w 1171217825
      // 04a: ldc_w -1407560986
      // 04d: ldc_w 477594703
      // 050: ixor
      // 051: invokestatic qeaa361f143ee4a0894bd168fd9b30c66/qf4ccf8f5435d4a78bdca4d6a018b578e/aaababbb.a (II)I
      // 054: ldc2_w 5562011275870078093
      // 057: invokestatic qeaa361f143ee4a0894bd168fd9b30c66/qf4ccf8f5435d4a78bdca4d6a018b578e/aaababbb.abbbb (IJ)I
      // 05a: iand
      // 05b: istore 17
      // 05d: iload 16
      // 05f: iload 15
      // 061: ifne 085
      // 064: ifgt 07d
      // 067: goto 06b
      // 06a: athrow
      // 06b: iload 17
      // 06d: iload 15
      // 06f: ifne 0aa
      // 072: goto 076
      // 075: athrow
      // 076: ifle 0a5
      // 079: goto 07d
      // 07c: athrow
      // 07d: dload 5
      // 07f: dconst_0
      // 080: dcmpg
      // 081: goto 085
      // 084: athrow
      // 085: iload 15
      // 087: ifne 0aa
      // 08a: ifle 0a5
      // 08d: goto 091
      // 090: athrow
      // 091: dload 7
      // 093: iload 15
      // 095: ifne 0b4
      // 098: goto 09c
      // 09b: athrow
      // 09c: dconst_0
      // 09d: dcmpg
      // 09e: ifgt 0ab
      // 0a1: goto 0a5
      // 0a4: athrow
      // 0a5: bipush 1
      // 0a6: goto 0aa
      // 0a9: athrow
      // 0aa: ireturn
      // 0ab: dload 5
      // 0ad: dload 7
      // 0af: dload 9
      // 0b1: invokestatic qeaa361f143ee4a0894bd168fd9b30c66/qf4ccf8f5435d4a78bdca4d6a018b578e/aaababbb.bbba (DDD)D
      // 0b4: dstore 18
      // 0b6: iload 15
      // 0b8: ifne 10e
      // 0bb: dload 18
      // 0bd: ldc2_w 0.01
      // 0c0: dcmpg
      // 0c1: ifle 0e8
      // 0c4: goto 0c8
      // 0c7: athrow
      // 0c8: iload 13
      // 0ca: iload 15
      // 0cc: ifne 0dc
      // 0cf: goto 0d3
      // 0d2: athrow
      // 0d3: ifne 110
      // 0d6: goto 0da
      // 0d9: athrow
      // 0da: iload 14
      // 0dc: iload 15
      // 0de: ifne 10f
      // 0e1: ifne 110
      // 0e4: goto 0e8
      // 0e7: athrow
      // 0e8: aload 0
      // 0e9: dload 1
      // 0ea: invokestatic java/lang/Math.floor (D)D
      // 0ed: d2i
      // 0ee: dload 3
      // 0ef: invokestatic java/lang/Math.floor (D)D
      // 0f2: d2i
      // 0f3: dload 1
      // 0f4: dload 5
      // 0f6: dadd
      // 0f7: invokestatic java/lang/Math.ceil (D)D
      // 0fa: d2i
      // 0fb: dload 3
      // 0fc: dload 7
      // 0fe: dadd
      // 0ff: invokestatic java/lang/Math.ceil (D)D
      // 102: d2i
      // 103: iload 11
      // 105: iload 12
      // 107: invokevirtual net/minecraft/class_332.method_25296 (IIIIII)V
      // 10a: goto 10e
      // 10d: athrow
      // 10e: bipush 1
      // 10f: ireturn
      // 110: aload 0
      // 111: getfield net/minecraft/class_332.field_59826 Lnet/minecraft/class_11246;
      // 114: new qeaa361f143ee4a0894bd168fd9b30c66/qf4ccf8f5435d4a78bdca4d6a018b578e/bbababba
      // 117: dup
      // 118: new org/joml/Matrix3x2f
      // 11b: dup
      // 11c: aload 0
      // 11d: invokevirtual net/minecraft/class_332.method_51448 ()Lorg/joml/Matrix3x2fStack;
      // 120: invokespecial org/joml/Matrix3x2f.<init> (Lorg/joml/Matrix3x2fc;)V
      // 123: dload 1
      // 124: d2f
      // 125: dload 3
      // 126: d2f
      // 127: dload 5
      // 129: d2f
      // 12a: dload 7
      // 12c: d2f
      // 12d: dload 18
      // 12f: d2f
      // 130: fconst_0
      // 131: iload 13
      // 133: ifeq 143
      // 136: iload 14
      // 138: ifeq 143
      // 13b: goto 13f
      // 13e: athrow
      // 13f: bipush 0
      // 140: goto 14d
      // 143: iload 13
      // 145: ifeq 14c
      // 148: bipush 1
      // 149: goto 14d
      // 14c: bipush 2
      // 14d: iload 11
      // 14f: iload 11
      // 151: iload 12
      // 153: iload 12
      // 155: aload 0
      // 156: getfield net/minecraft/class_332.field_44659 Lnet/minecraft/class_332$class_8214;
      // 159: invokevirtual net/minecraft/class_332$class_8214.method_70863 ()Lnet/minecraft/class_8030;
      // 15c: invokespecial qeaa361f143ee4a0894bd168fd9b30c66/qf4ccf8f5435d4a78bdca4d6a018b578e/bbababba.<init> (Lorg/joml/Matrix3x2fc;FFFFFFIIIIILnet/minecraft/class_8030;)V
      // 15f: invokevirtual net/minecraft/class_11246.method_70919 (Lnet/minecraft/class_11244;)V
      // 162: bipush 1
      // 163: ireturn
   }

   static void aaaab(class_332 var0, double var1, double var3, double var5) {
      var0.method_51448().translate((float)var1, (float)var3);
   }

   static boolean aaaba(
      class_332 param0,
      class_2960 param1,
      double param2,
      double param4,
      double param6,
      double param8,
      float param10,
      float param11,
      float param12,
      float param13,
      int param14,
      float param15,
      float param16
   ) {
      // $VF: Couldn't be decompiled
      // Please report this to the Vineflower issue tracker, at https://github.com/Vineflower/vineflower/issues with a copy of the class file (if you have the rights to distribute it!)
      // java.lang.RuntimeException: parsing failure!
      //   at org.jetbrains.java.decompiler.modules.decompiler.decompose.DomHelper.parseGraph(DomHelper.java:211)
      //   at org.jetbrains.java.decompiler.main.rels.MethodProcessor.codeToJava(MethodProcessor.java:166)
      //
      // Bytecode:
      // 00: getstatic qeaa361f143ee4a0894bd168fd9b30c66/qf4ccf8f5435d4a78bdca4d6a018b578e/baaabbaa.bba I
      // 03: istore 17
      // 05: aload 0
      // 06: ifnull 73
      // 09: aload 1
      // 0a: ifnull 73
      // 0d: goto 11
      // 10: athrow
      // 11: dload 6
      // 13: dconst_0
      // 14: dcmpg
      // 15: iload 17
      // 17: ifne 78
      // 1a: goto 1e
      // 1d: athrow
      // 1e: ifle 73
      // 21: goto 25
      // 24: athrow
      // 25: dload 8
      // 27: dconst_0
      // 28: dcmpg
      // 29: iload 17
      // 2b: ifne 78
      // 2e: goto 32
      // 31: athrow
      // 32: ifle 73
      // 35: goto 39
      // 38: athrow
      // 39: iload 14
      // 3b: iload 17
      // 3d: ifne 98
      // 40: goto 44
      // 43: athrow
      // 44: ldc_w 1171217910
      // 47: ldc_w 2060524684
      // 4a: ldc_w -68891460
      // 4d: ixor
      // 4e: invokestatic qeaa361f143ee4a0894bd168fd9b30c66/qf4ccf8f5435d4a78bdca4d6a018b578e/aaababbb.a (II)I
      // 51: ldc2_w 6897994967769215822
      // 54: invokestatic qeaa361f143ee4a0894bd168fd9b30c66/qf4ccf8f5435d4a78bdca4d6a018b578e/aaababbb.abbbb (IJ)I
      // 57: iushr
      // 58: ldc_w 1171217911
      // 5b: ldc_w 2060524684
      // 5e: ldc_w -2045985832
      // 61: ixor
      // 62: invokestatic qeaa361f143ee4a0894bd168fd9b30c66/qf4ccf8f5435d4a78bdca4d6a018b578e/aaababbb.a (II)I
      // 65: ldc2_w 3745914311717627640
      // 68: invokestatic qeaa361f143ee4a0894bd168fd9b30c66/qf4ccf8f5435d4a78bdca4d6a018b578e/aaababbb.abbbb (IJ)I
      // 6b: iand
      // 6c: ifgt 79
      // 6f: goto 73
      // 72: athrow
      // 73: bipush 1
      // 74: goto 78
      // 77: athrow
      // 78: ireturn
      // 79: aload 0
      // 7a: aload 0
      // 7b: aload 1
      // 7c: invokestatic qeaa361f143ee4a0894bd168fd9b30c66/qf4ccf8f5435d4a78bdca4d6a018b578e/aaababbb.abab (Lnet/minecraft/class_332;Lnet/minecraft/class_2960;)Lqeaa361f143ee4a0894bd168fd9b30c66/qf4ccf8f5435d4a78bdca4d6a018b578e/aaababb;
      // 7f: dload 2
      // 80: dload 4
      // 82: dload 6
      // 84: dload 8
      // 86: fload 10
      // 88: fload 11
      // 8a: fload 12
      // 8c: fload 13
      // 8e: iload 14
      // 90: fload 15
      // 92: fload 16
      // 94: invokestatic qeaa361f143ee4a0894bd168fd9b30c66/qf4ccf8f5435d4a78bdca4d6a018b578e/aaababbb.bbab (Lnet/minecraft/class_332;Lqeaa361f143ee4a0894bd168fd9b30c66/qf4ccf8f5435d4a78bdca4d6a018b578e/aaababb;DDDDFFFFIFF)V
      // 97: bipush 1
      // 98: ireturn
   }

   static void aaabb(class_332 var0, double var1, double var3) {
      var0.method_51448().translate((float)var1, (float)var3);
   }

   private static float aabaa(int var0) {
      return Math.max(-1.0F, Math.min(1.0F, -1.0F + var0 * 0.25F));
   }

   private static RenderPipeline aabab() {
      return class_10799.method_67887(
         RenderPipeline.builder(new Snippet[]{class_10799.field_60125})
            .withLocation(aabba(aaba))
            .withVertexShader(aabba(baba))
            .withFragmentShader(aabba(baba))
            .withBlend(BlendFunction.TRANSLUCENT)
            .withDepthTestFunction(DepthTestFunction.NO_DEPTH_TEST)
            .withDepthWrite(false)
            .withCull(false)
            .withVertexFormat(class_290.field_1590, class_5596.field_27382)
            .build()
      );
   }

   private static class_2960 aabba(ababbbbaa var0) {
      return class_2960.method_60655(aaaab.abab(), var0.abab());
   }

   static boolean aabbb(class_332 var0, class_2960 var1, double var2, double var4, double var6, double var8, int var10) {
      return ba(var0, var1, var2, var4, var6, var8, 0.0F, 0.0F, 1.0F, 1.0F, var10);
   }

   static void abaaa(class_332 param0, class_2960 param1, int param2, int param3, int param4, int param5, int param6, int param7, int param8) {
      // $VF: Couldn't be decompiled
      // Please report this to the Vineflower issue tracker, at https://github.com/Vineflower/vineflower/issues with a copy of the class file (if you have the rights to distribute it!)
      // java.lang.RuntimeException: parsing failure!
      //   at org.jetbrains.java.decompiler.modules.decompiler.decompose.DomHelper.parseGraph(DomHelper.java:211)
      //   at org.jetbrains.java.decompiler.main.rels.MethodProcessor.codeToJava(MethodProcessor.java:166)
      //
      // Bytecode:
      // 00: getstatic qeaa361f143ee4a0894bd168fd9b30c66/qf4ccf8f5435d4a78bdca4d6a018b578e/baaabbaa.bba I
      // 03: istore 9
      // 05: iload 8
      // 07: ldc_w 1171217904
      // 0a: ldc_w -1207452988
      // 0d: ldc_w -1096254257
      // 10: ixor
      // 11: invokestatic qeaa361f143ee4a0894bd168fd9b30c66/qf4ccf8f5435d4a78bdca4d6a018b578e/aaababbb.a (II)I
      // 14: ldc2_w 6485509548550546198
      // 17: invokestatic qeaa361f143ee4a0894bd168fd9b30c66/qf4ccf8f5435d4a78bdca4d6a018b578e/aaababbb.abbbb (IJ)I
      // 1a: iushr
      // 1b: iload 9
      // 1d: ifne 41
      // 20: ldc_w 1171217905
      // 23: ldc_w -1207452988
      // 26: ldc_w 400841982
      // 29: ixor
      // 2a: invokestatic qeaa361f143ee4a0894bd168fd9b30c66/qf4ccf8f5435d4a78bdca4d6a018b578e/aaababbb.a (II)I
      // 2d: ldc2_w 5562011275870078093
      // 30: invokestatic qeaa361f143ee4a0894bd168fd9b30c66/qf4ccf8f5435d4a78bdca4d6a018b578e/aaababbb.abbbb (IJ)I
      // 33: iand
      // 34: ifle 6e
      // 37: goto 3b
      // 3a: athrow
      // 3b: iload 4
      // 3d: goto 41
      // 40: athrow
      // 41: iload 9
      // 43: ifne 4f
      // 46: ifle 6e
      // 49: goto 4d
      // 4c: athrow
      // 4d: iload 5
      // 4f: iload 9
      // 51: ifne 5d
      // 54: ifle 6e
      // 57: goto 5b
      // 5a: athrow
      // 5b: iload 6
      // 5d: iload 9
      // 5f: ifne 6b
      // 62: ifle 6e
      // 65: goto 69
      // 68: athrow
      // 69: iload 7
      // 6b: ifgt 6f
      // 6e: return
      // 6f: aload 0
      // 70: getstatic net/minecraft/class_10799.field_56883 Lcom/mojang/blaze3d/pipeline/RenderPipeline;
      // 73: aload 1
      // 74: iload 2
      // 75: iload 3
      // 76: fconst_0
      // 77: fconst_0
      // 78: iload 4
      // 7a: iload 5
      // 7c: iload 6
      // 7e: iload 7
      // 80: iload 6
      // 82: iload 7
      // 84: iload 8
      // 86: invokevirtual net/minecraft/class_332.method_25293 (Lcom/mojang/blaze3d/pipeline/RenderPipeline;Lnet/minecraft/class_2960;IIFFIIIIIII)V
      // 89: return
   }

   private static int abaab(float var0) {
      return Math.max(
         abbbb(a(1171217906, 1224919527 ^ 547833579), 2529914684527014161L),
         Math.min(abbbb(a(1171217907, 1224919527 ^ 1008318182), 6370793968697499551L), (int)Math.ceil(var0))
      );
   }

   private static void ababa(
      class_4588 param0,
      Matrix3x2fc param1,
      float param2,
      float param3,
      float param4,
      float param5,
      float param6,
      float param7,
      float param8,
      float param9,
      int param10,
      float param11,
      float param12
   ) {
      // $VF: Couldn't be decompiled
      // Please report this to the Vineflower issue tracker, at https://github.com/Vineflower/vineflower/issues with a copy of the class file (if you have the rights to distribute it!)
      // java.lang.RuntimeException: parsing failure!
      //   at org.jetbrains.java.decompiler.modules.decompiler.decompose.DomHelper.parseGraph(DomHelper.java:211)
      //   at org.jetbrains.java.decompiler.main.rels.MethodProcessor.codeToJava(MethodProcessor.java:166)
      //
      // Bytecode:
      // 00: getstatic qeaa361f143ee4a0894bd168fd9b30c66/qf4ccf8f5435d4a78bdca4d6a018b578e/baaabbaa.bba I
      // 03: istore 13
      // 05: fload 4
      // 07: fconst_0
      // 08: iload 13
      // 0a: ifne 25
      // 0d: fcmpg
      // 0e: ifle 29
      // 11: goto 15
      // 14: athrow
      // 15: fload 5
      // 17: iload 13
      // 19: ifne 2d
      // 1c: goto 20
      // 1f: athrow
      // 20: fconst_0
      // 21: goto 25
      // 24: athrow
      // 25: fcmpg
      // 26: ifgt 2b
      // 29: return
      // 2a: athrow
      // 2b: fload 4
      // 2d: invokestatic qeaa361f143ee4a0894bd168fd9b30c66/qf4ccf8f5435d4a78bdca4d6a018b578e/aaababbb.b (F)I
      // 30: istore 14
      // 32: ldc_w 1171217900
      // 35: ldc_w -1372250193
      // 38: ldc_w 1310135850
      // 3b: ixor
      // 3c: invokestatic qeaa361f143ee4a0894bd168fd9b30c66/qf4ccf8f5435d4a78bdca4d6a018b578e/aaababbb.a (II)I
      // 3f: fload 5
      // 41: invokestatic qeaa361f143ee4a0894bd168fd9b30c66/qf4ccf8f5435d4a78bdca4d6a018b578e/aaababbb.b (F)I
      // 44: istore 15
      // 46: ldc2_w 3783115007540896360
      // 49: invokestatic qeaa361f143ee4a0894bd168fd9b30c66/qf4ccf8f5435d4a78bdca4d6a018b578e/aaababbb.abbbb (IJ)I
      // 4c: invokestatic qeaa361f143ee4a0894bd168fd9b30c66/qf4ccf8f5435d4a78bdca4d6a018b578e/aaababbb.aabaa (I)F
      // 4f: fstore 16
      // 51: aload 0
      // 52: aload 1
      // 53: fload 2
      // 54: fload 3
      // 55: fload 6
      // 57: fload 7
      // 59: iload 14
      // 5b: iload 15
      // 5d: fload 12
      // 5f: fload 11
      // 61: fload 16
      // 63: iload 10
      // 65: invokestatic qeaa361f143ee4a0894bd168fd9b30c66/qf4ccf8f5435d4a78bdca4d6a018b578e/aaababbb.abba (Lnet/minecraft/class_4588;Lorg/joml/Matrix3x2fc;FFFFIIFFFI)V
      // 68: aload 0
      // 69: aload 1
      // 6a: fload 2
      // 6b: fload 3
      // 6c: fload 5
      // 6e: fadd
      // 6f: fload 6
      // 71: fload 9
      // 73: iload 14
      // 75: iload 15
      // 77: fload 12
      // 79: fload 11
      // 7b: fload 16
      // 7d: iload 10
      // 7f: invokestatic qeaa361f143ee4a0894bd168fd9b30c66/qf4ccf8f5435d4a78bdca4d6a018b578e/aaababbb.abba (Lnet/minecraft/class_4588;Lorg/joml/Matrix3x2fc;FFFFIIFFFI)V
      // 82: aload 0
      // 83: aload 1
      // 84: fload 2
      // 85: fload 4
      // 87: fadd
      // 88: fload 3
      // 89: fload 5
      // 8b: fadd
      // 8c: fload 8
      // 8e: fload 9
      // 90: iload 14
      // 92: iload 15
      // 94: fload 12
      // 96: fload 11
      // 98: fload 16
      // 9a: iload 10
      // 9c: invokestatic qeaa361f143ee4a0894bd168fd9b30c66/qf4ccf8f5435d4a78bdca4d6a018b578e/aaababbb.abba (Lnet/minecraft/class_4588;Lorg/joml/Matrix3x2fc;FFFFIIFFFI)V
      // 9f: aload 0
      // a0: aload 1
      // a1: fload 2
      // a2: fload 4
      // a4: fadd
      // a5: fload 3
      // a6: fload 8
      // a8: fload 7
      // aa: iload 14
      // ac: iload 15
      // ae: fload 12
      // b0: fload 11
      // b2: fload 16
      // b4: iload 10
      // b6: invokestatic qeaa361f143ee4a0894bd168fd9b30c66/qf4ccf8f5435d4a78bdca4d6a018b578e/aaababbb.abba (Lnet/minecraft/class_4588;Lorg/joml/Matrix3x2fc;FFFFIIFFFI)V
      // b9: return
   }

   static boolean ababb(
      class_332 param0, double param1, double param3, double param5, double param7, double param9, int param11, int param12, int param13, int param14
   ) {
      // $VF: Couldn't be decompiled
      // Please report this to the Vineflower issue tracker, at https://github.com/Vineflower/vineflower/issues with a copy of the class file (if you have the rights to distribute it!)
      // java.lang.RuntimeException: parsing failure!
      //   at org.jetbrains.java.decompiler.modules.decompiler.decompose.DomHelper.parseGraph(DomHelper.java:211)
      //   at org.jetbrains.java.decompiler.main.rels.MethodProcessor.codeToJava(MethodProcessor.java:166)
      //
      // Bytecode:
      // 000: ldc_w 752756482
      // 003: istore 22
      // 005: iload 11
      // 007: ldc_w 1171217901
      // 00a: iload 22
      // 00c: ldc_w -1323155425
      // 00f: ixor
      // 010: invokestatic qeaa361f143ee4a0894bd168fd9b30c66/qf4ccf8f5435d4a78bdca4d6a018b578e/aaababbb.a (II)I
      // 013: ldc2_w 6485509548550546198
      // 016: invokestatic qeaa361f143ee4a0894bd168fd9b30c66/qf4ccf8f5435d4a78bdca4d6a018b578e/aaababbb.abbbb (IJ)I
      // 019: iushr
      // 01a: ldc_w 1171217902
      // 01d: iload 22
      // 01f: ldc_w 1072393302
      // 022: ixor
      // 023: invokestatic qeaa361f143ee4a0894bd168fd9b30c66/qf4ccf8f5435d4a78bdca4d6a018b578e/aaababbb.a (II)I
      // 026: ldc2_w 5562011275870078093
      // 029: invokestatic qeaa361f143ee4a0894bd168fd9b30c66/qf4ccf8f5435d4a78bdca4d6a018b578e/aaababbb.abbbb (IJ)I
      // 02c: iand
      // 02d: istore 16
      // 02f: iload 12
      // 031: ldc_w 1171217903
      // 034: iload 22
      // 036: ldc_w -1093973887
      // 039: ixor
      // 03a: invokestatic qeaa361f143ee4a0894bd168fd9b30c66/qf4ccf8f5435d4a78bdca4d6a018b578e/aaababbb.a (II)I
      // 03d: ldc2_w 6485509548550546198
      // 040: invokestatic qeaa361f143ee4a0894bd168fd9b30c66/qf4ccf8f5435d4a78bdca4d6a018b578e/aaababbb.abbbb (IJ)I
      // 043: iushr
      // 044: ldc_w 1171217896
      // 047: iload 22
      // 049: ldc_w -196081569
      // 04c: ixor
      // 04d: invokestatic qeaa361f143ee4a0894bd168fd9b30c66/qf4ccf8f5435d4a78bdca4d6a018b578e/aaababbb.a (II)I
      // 050: ldc2_w 5562011275870078093
      // 053: invokestatic qeaa361f143ee4a0894bd168fd9b30c66/qf4ccf8f5435d4a78bdca4d6a018b578e/aaababbb.abbbb (IJ)I
      // 056: iand
      // 057: istore 17
      // 059: iload 13
      // 05b: ldc_w 1171217897
      // 05e: iload 22
      // 060: ldc_w -854959606
      // 063: ixor
      // 064: invokestatic qeaa361f143ee4a0894bd168fd9b30c66/qf4ccf8f5435d4a78bdca4d6a018b578e/aaababbb.a (II)I
      // 067: ldc2_w 6485509548550546198
      // 06a: invokestatic qeaa361f143ee4a0894bd168fd9b30c66/qf4ccf8f5435d4a78bdca4d6a018b578e/aaababbb.abbbb (IJ)I
      // 06d: iushr
      // 06e: ldc_w 1171217898
      // 071: iload 22
      // 073: ldc_w -711355664
      // 076: ixor
      // 077: invokestatic qeaa361f143ee4a0894bd168fd9b30c66/qf4ccf8f5435d4a78bdca4d6a018b578e/aaababbb.a (II)I
      // 07a: ldc2_w 5562011275870078093
      // 07d: invokestatic qeaa361f143ee4a0894bd168fd9b30c66/qf4ccf8f5435d4a78bdca4d6a018b578e/aaababbb.abbbb (IJ)I
      // 080: iand
      // 081: istore 18
      // 083: getstatic qeaa361f143ee4a0894bd168fd9b30c66/qf4ccf8f5435d4a78bdca4d6a018b578e/baaabbaa.bba I
      // 086: iload 14
      // 088: ldc_w 1171217899
      // 08b: iload 22
      // 08d: ldc_w -1917274785
      // 090: ixor
      // 091: invokestatic qeaa361f143ee4a0894bd168fd9b30c66/qf4ccf8f5435d4a78bdca4d6a018b578e/aaababbb.a (II)I
      // 094: ldc2_w 6485509548550546198
      // 097: invokestatic qeaa361f143ee4a0894bd168fd9b30c66/qf4ccf8f5435d4a78bdca4d6a018b578e/aaababbb.abbbb (IJ)I
      // 09a: iushr
      // 09b: ldc_w 1171217892
      // 09e: iload 22
      // 0a0: ldc_w 17457697
      // 0a3: ixor
      // 0a4: invokestatic qeaa361f143ee4a0894bd168fd9b30c66/qf4ccf8f5435d4a78bdca4d6a018b578e/aaababbb.a (II)I
      // 0a7: ldc2_w 5562011275870078093
      // 0aa: invokestatic qeaa361f143ee4a0894bd168fd9b30c66/qf4ccf8f5435d4a78bdca4d6a018b578e/aaababbb.abbbb (IJ)I
      // 0ad: iand
      // 0ae: istore 19
      // 0b0: istore 15
      // 0b2: iload 16
      // 0b4: iload 15
      // 0b6: ifne 0fe
      // 0b9: ifgt 0f6
      // 0bc: goto 0c0
      // 0bf: athrow
      // 0c0: iload 17
      // 0c2: iload 15
      // 0c4: ifne 0fe
      // 0c7: goto 0cb
      // 0ca: athrow
      // 0cb: ifgt 0f6
      // 0ce: goto 0d2
      // 0d1: athrow
      // 0d2: iload 18
      // 0d4: iload 15
      // 0d6: ifne 0fe
      // 0d9: goto 0dd
      // 0dc: athrow
      // 0dd: ifgt 0f6
      // 0e0: goto 0e4
      // 0e3: athrow
      // 0e4: iload 19
      // 0e6: iload 15
      // 0e8: ifne 123
      // 0eb: goto 0ef
      // 0ee: athrow
      // 0ef: ifle 11e
      // 0f2: goto 0f6
      // 0f5: athrow
      // 0f6: dload 5
      // 0f8: dconst_0
      // 0f9: dcmpg
      // 0fa: goto 0fe
      // 0fd: athrow
      // 0fe: iload 15
      // 100: ifne 123
      // 103: ifle 11e
      // 106: goto 10a
      // 109: athrow
      // 10a: dload 7
      // 10c: iload 15
      // 10e: ifne 12d
      // 111: goto 115
      // 114: athrow
      // 115: dconst_0
      // 116: dcmpg
      // 117: ifgt 124
      // 11a: goto 11e
      // 11d: athrow
      // 11e: bipush 1
      // 11f: goto 123
      // 122: athrow
      // 123: ireturn
      // 124: dload 5
      // 126: dload 7
      // 128: dload 9
      // 12a: invokestatic qeaa361f143ee4a0894bd168fd9b30c66/qf4ccf8f5435d4a78bdca4d6a018b578e/aaababbb.bbba (DDD)D
      // 12d: dstore 20
      // 12f: aload 0
      // 130: getfield net/minecraft/class_332.field_59826 Lnet/minecraft/class_11246;
      // 133: new qeaa361f143ee4a0894bd168fd9b30c66/qf4ccf8f5435d4a78bdca4d6a018b578e/bbababba
      // 136: dup
      // 137: new org/joml/Matrix3x2f
      // 13a: dup
      // 13b: aload 0
      // 13c: invokevirtual net/minecraft/class_332.method_51448 ()Lorg/joml/Matrix3x2fStack;
      // 13f: invokespecial org/joml/Matrix3x2f.<init> (Lorg/joml/Matrix3x2fc;)V
      // 142: dload 1
      // 143: d2f
      // 144: dload 3
      // 145: d2f
      // 146: dload 5
      // 148: d2f
      // 149: dload 7
      // 14b: d2f
      // 14c: dload 20
      // 14e: d2f
      // 14f: fconst_0
      // 150: bipush 0
      // 151: iload 11
      // 153: iload 12
      // 155: iload 13
      // 157: iload 14
      // 159: aload 0
      // 15a: getfield net/minecraft/class_332.field_44659 Lnet/minecraft/class_332$class_8214;
      // 15d: invokevirtual net/minecraft/class_332$class_8214.method_70863 ()Lnet/minecraft/class_8030;
      // 160: invokespecial qeaa361f143ee4a0894bd168fd9b30c66/qf4ccf8f5435d4a78bdca4d6a018b578e/bbababba.<init> (Lorg/joml/Matrix3x2fc;FFFFFFIIIIILnet/minecraft/class_8030;)V
      // 163: invokevirtual net/minecraft/class_11246.method_70919 (Lnet/minecraft/class_11244;)V
      // 166: bipush 1
      // 167: ireturn
   }

   private static RenderPipeline abbaa() {
      return class_10799.method_67887(
         RenderPipeline.builder(new Snippet[]{class_10799.field_56864})
            .withLocation(aabba(abba))
            .withSampler(aba.abab())
            .withBlend(BlendFunction.TRANSLUCENT)
            .withDepthTestFunction(DepthTestFunction.NO_DEPTH_TEST)
            .withDepthWrite(false)
            .withCull(false)
            .withVertexFormat(class_290.field_1575, class_5596.field_27379)
            .build()
      );
   }

   @Nullable
   private static class_8030 abbab(float param0, float param1, float param2, float param3, Matrix3x2fc param4, @Nullable class_8030 param5) {
      // $VF: Couldn't be decompiled
      // Please report this to the Vineflower issue tracker, at https://github.com/Vineflower/vineflower/issues with a copy of the class file (if you have the rights to distribute it!)
      // java.lang.RuntimeException: parsing failure!
      //   at org.jetbrains.java.decompiler.modules.decompiler.decompose.DomHelper.parseGraph(DomHelper.java:211)
      //   at org.jetbrains.java.decompiler.main.rels.MethodProcessor.codeToJava(MethodProcessor.java:166)
      //
      // Bytecode:
      // 00: fload 0
      // 01: f2d
      // 02: invokestatic java/lang/Math.floor (D)D
      // 05: d2i
      // 06: istore 7
      // 08: getstatic qeaa361f143ee4a0894bd168fd9b30c66/qf4ccf8f5435d4a78bdca4d6a018b578e/baaabbaa.bba I
      // 0b: fload 1
      // 0c: f2d
      // 0d: invokestatic java/lang/Math.floor (D)D
      // 10: d2i
      // 11: istore 8
      // 13: fload 0
      // 14: fload 2
      // 15: fadd
      // 16: f2d
      // 17: invokestatic java/lang/Math.ceil (D)D
      // 1a: d2i
      // 1b: istore 9
      // 1d: istore 6
      // 1f: fload 1
      // 20: fload 3
      // 21: fadd
      // 22: f2d
      // 23: invokestatic java/lang/Math.ceil (D)D
      // 26: d2i
      // 27: istore 10
      // 29: new net/minecraft/class_8030
      // 2c: dup
      // 2d: iload 7
      // 2f: iload 8
      // 31: bipush 1
      // 32: iload 9
      // 34: iload 7
      // 36: isub
      // 37: invokestatic java/lang/Math.max (II)I
      // 3a: bipush 1
      // 3b: iload 10
      // 3d: iload 8
      // 3f: isub
      // 40: invokestatic java/lang/Math.max (II)I
      // 43: invokespecial net/minecraft/class_8030.<init> (IIII)V
      // 46: aload 4
      // 48: invokevirtual net/minecraft/class_8030.method_65185 (Lorg/joml/Matrix3x2fc;)Lnet/minecraft/class_8030;
      // 4b: astore 11
      // 4d: aload 5
      // 4f: iload 6
      // 51: ifne 66
      // 54: ifnull 69
      // 57: goto 5b
      // 5a: athrow
      // 5b: aload 5
      // 5d: aload 11
      // 5f: invokevirtual net/minecraft/class_8030.method_49701 (Lnet/minecraft/class_8030;)Lnet/minecraft/class_8030;
      // 62: goto 66
      // 65: athrow
      // 66: goto 6b
      // 69: aload 11
      // 6b: areturn
   }

   private static int abbba(float var0) {
      return Math.max(
         abbbb(a(1171217893, -2144662754 ^ 75803687), 6485509548550546198L),
         Math.min(abbbb(a(1171217894, -2144662754 ^ 755437305), 4397452801391502804L), (int)Math.ceil(var0 * 0.75F))
      );
   }

   private static int abbbb(int var0, long var1) {
      int var3 = var0 ^ (int)(var1 & 32767L) ^ a(1171217895, 1311664518 ^ 319292441);
      if (aabaa[var3] == null) {
         aabaa[var3] = (int)(abaa[var3] ^ var1);
      }

      return aabaa[var3];
   }

   private static float baaaa(float var0) {
      return babb(var0) * 2.0F - 1.0F;
   }

   static boolean baaab(class_332 param0, double param1, double param3, double param5, int param7) {
      // $VF: Couldn't be decompiled
      // Please report this to the Vineflower issue tracker, at https://github.com/Vineflower/vineflower/issues with a copy of the class file (if you have the rights to distribute it!)
      // java.lang.RuntimeException: parsing failure!
      //   at org.jetbrains.java.decompiler.modules.decompiler.decompose.DomHelper.parseGraph(DomHelper.java:211)
      //   at org.jetbrains.java.decompiler.main.rels.MethodProcessor.codeToJava(MethodProcessor.java:166)
      //
      // Bytecode:
      // 00: getstatic qeaa361f143ee4a0894bd168fd9b30c66/qf4ccf8f5435d4a78bdca4d6a018b578e/baaabbaa.bba I
      // 03: istore 8
      // 05: dload 5
      // 07: dconst_0
      // 08: dcmpg
      // 09: iload 8
      // 0b: ifne 54
      // 0e: ifle 4f
      // 11: goto 15
      // 14: athrow
      // 15: iload 7
      // 17: ldc_w 1171217888
      // 1a: ldc_w 1732889054
      // 1d: ldc_w 544279060
      // 20: ixor
      // 21: invokestatic qeaa361f143ee4a0894bd168fd9b30c66/qf4ccf8f5435d4a78bdca4d6a018b578e/aaababbb.a (II)I
      // 24: ldc2_w 6485509548550546198
      // 27: invokestatic qeaa361f143ee4a0894bd168fd9b30c66/qf4ccf8f5435d4a78bdca4d6a018b578e/aaababbb.abbbb (IJ)I
      // 2a: iushr
      // 2b: iload 8
      // 2d: ifne 54
      // 30: goto 34
      // 33: athrow
      // 34: ldc_w 1171217889
      // 37: ldc_w 1732889054
      // 3a: ldc_w -1208790820
      // 3d: ixor
      // 3e: invokestatic qeaa361f143ee4a0894bd168fd9b30c66/qf4ccf8f5435d4a78bdca4d6a018b578e/aaababbb.a (II)I
      // 41: ldc2_w 5562011275870078093
      // 44: invokestatic qeaa361f143ee4a0894bd168fd9b30c66/qf4ccf8f5435d4a78bdca4d6a018b578e/aaababbb.abbbb (IJ)I
      // 47: iand
      // 48: ifgt 55
      // 4b: goto 4f
      // 4e: athrow
      // 4f: bipush 1
      // 50: goto 54
      // 53: athrow
      // 54: ireturn
      // 55: dconst_0
      // 56: dload 5
      // 58: invokestatic java/lang/Math.max (DD)D
      // 5b: d2f
      // 5c: fstore 9
      // 5e: fload 9
      // 60: fconst_2
      // 61: fadd
      // 62: fstore 10
      // 64: aload 0
      // 65: getfield net/minecraft/class_332.field_59826 Lnet/minecraft/class_11246;
      // 68: new qeaa361f143ee4a0894bd168fd9b30c66/qf4ccf8f5435d4a78bdca4d6a018b578e/ababbaaa
      // 6b: dup
      // 6c: new org/joml/Matrix3x2f
      // 6f: dup
      // 70: aload 0
      // 71: invokevirtual net/minecraft/class_332.method_51448 ()Lorg/joml/Matrix3x2fStack;
      // 74: invokespecial org/joml/Matrix3x2f.<init> (Lorg/joml/Matrix3x2fc;)V
      // 77: dload 1
      // 78: d2f
      // 79: dload 3
      // 7a: d2f
      // 7b: fload 10
      // 7d: fload 9
      // 7f: fconst_0
      // 80: bipush 5
      // 81: iload 7
      // 83: aload 0
      // 84: getfield net/minecraft/class_332.field_44659 Lnet/minecraft/class_332$class_8214;
      // 87: invokevirtual net/minecraft/class_332$class_8214.method_70863 ()Lnet/minecraft/class_8030;
      // 8a: invokespecial qeaa361f143ee4a0894bd168fd9b30c66/qf4ccf8f5435d4a78bdca4d6a018b578e/ababbaaa.<init> (Lorg/joml/Matrix3x2fc;FFFFFIILnet/minecraft/class_8030;)V
      // 8d: invokevirtual net/minecraft/class_11246.method_70919 (Lnet/minecraft/class_11244;)V
      // 90: bipush 1
      // 91: ireturn
   }

   static void baaba(class_332 var0) {
      var0.method_51448().popMatrix();
   }

   private static void baabb(
      class_4588 var0, Matrix3x2fc var1, float var2, float var3, float var4, float var5, float var6, float var7, float var8, float var9, int var10, float var11
   ) {
      ababa(var0, var1, var2, var3, var4, var5, var6, var7, var8, var9, var10, var11, 0.0F);
   }

   private static void babaa(class_4588 var0, Matrix3x2fc var1, float var2, float var3, int var4) {
      var0.method_70815(var1, var2, var3).method_39415(var4);
   }

   private static float babab(float param0, float param1, float param2, float param3, float param4) {
      // $VF: Couldn't be decompiled
      // Please report this to the Vineflower issue tracker, at https://github.com/Vineflower/vineflower/issues with a copy of the class file (if you have the rights to distribute it!)
      // java.lang.RuntimeException: parsing failure!
      //   at org.jetbrains.java.decompiler.modules.decompiler.decompose.DomHelper.parseGraph(DomHelper.java:211)
      //   at org.jetbrains.java.decompiler.main.rels.MethodProcessor.codeToJava(MethodProcessor.java:166)
      //
      // Bytecode:
      // 00: fload 1
      // 01: fload 3
      // 02: invokestatic java/lang/Math.min (FF)F
      // 05: fstore 6
      // 07: getstatic qeaa361f143ee4a0894bd168fd9b30c66/qf4ccf8f5435d4a78bdca4d6a018b578e/baaabbaa.bba I
      // 0a: fload 1
      // 0b: fload 3
      // 0c: invokestatic java/lang/Math.max (FF)F
      // 0f: fstore 7
      // 11: istore 5
      // 13: fload 4
      // 15: iload 5
      // 17: ifne 48
      // 1a: fload 6
      // 1c: ldc_w 0.001
      // 1f: fsub
      // 20: fcmpg
      // 21: iflt 41
      // 24: goto 28
      // 27: athrow
      // 28: fload 4
      // 2a: fload 7
      // 2c: ldc_w 0.001
      // 2f: fadd
      // 30: iload 5
      // 32: ifne 5a
      // 35: goto 39
      // 38: athrow
      // 39: fcmpl
      // 3a: ifle 49
      // 3d: goto 41
      // 40: athrow
      // 41: ldc_w NaN
      // 44: goto 48
      // 47: athrow
      // 48: freturn
      // 49: fload 3
      // 4a: fload 1
      // 4b: iload 5
      // 4d: ifne 6a
      // 50: fsub
      // 51: invokestatic java/lang/Math.abs (F)F
      // 54: ldc 1.0E-4
      // 56: goto 5a
      // 59: athrow
      // 5a: fcmpg
      // 5b: ifge 63
      // 5e: ldc_w NaN
      // 61: freturn
      // 62: athrow
      // 63: fload 4
      // 65: fload 1
      // 66: fsub
      // 67: fload 3
      // 68: fload 1
      // 69: fsub
      // 6a: fdiv
      // 6b: fstore 8
      // 6d: fload 0
      // 6e: fload 8
      // 70: fload 2
      // 71: fload 0
      // 72: fsub
      // 73: fmul
      // 74: fadd
      // 75: freturn
   }

   static void babba(class_332 var0, double var1, double var3) {
      var0.method_51448().scale((float)var1, (float)var3);
   }

   private static int b(float var0) {
      return Math.max(1, Math.min(abbbb(a(1171217890, 753375305 ^ -1067995456), 2788667324145151539L), Math.round(var0 * 8.0F)));
   }

   private static RenderPipeline babbb() {
      return class_10799.method_67887(
         RenderPipeline.builder(new Snippet[]{class_10799.field_56863})
            .withLocation(aabba(aabab))
            .withCull(false)
            .withVertexFormat(class_290.field_1576, class_5596.field_27379)
            .build()
      );
   }

   static boolean bbaaa(class_332 param0, double param1, double param3, double param5, double param7, double param9, int param11, int param12) {
      // $VF: Couldn't be decompiled
      // Please report this to the Vineflower issue tracker, at https://github.com/Vineflower/vineflower/issues with a copy of the class file (if you have the rights to distribute it!)
      // java.lang.RuntimeException: parsing failure!
      //   at org.jetbrains.java.decompiler.modules.decompiler.decompose.DomHelper.parseGraph(DomHelper.java:211)
      //   at org.jetbrains.java.decompiler.main.rels.MethodProcessor.codeToJava(MethodProcessor.java:166)
      //
      // Bytecode:
      // 00: getstatic qeaa361f143ee4a0894bd168fd9b30c66/qf4ccf8f5435d4a78bdca4d6a018b578e/baaabbaa.bba I
      // 03: iload 11
      // 05: ldc_w 1171217891
      // 08: ldc_w -1589466490
      // 0b: ldc_w 784444093
      // 0e: ixor
      // 0f: invokestatic qeaa361f143ee4a0894bd168fd9b30c66/qf4ccf8f5435d4a78bdca4d6a018b578e/aaababbb.a (II)I
      // 12: ldc2_w 6485509548550546198
      // 15: invokestatic qeaa361f143ee4a0894bd168fd9b30c66/qf4ccf8f5435d4a78bdca4d6a018b578e/aaababbb.abbbb (IJ)I
      // 18: iushr
      // 19: ldc_w 1171217884
      // 1c: ldc_w -1589466490
      // 1f: ldc_w -1462414019
      // 22: ixor
      // 23: invokestatic qeaa361f143ee4a0894bd168fd9b30c66/qf4ccf8f5435d4a78bdca4d6a018b578e/aaababbb.a (II)I
      // 26: ldc2_w 5562011275870078093
      // 29: invokestatic qeaa361f143ee4a0894bd168fd9b30c66/qf4ccf8f5435d4a78bdca4d6a018b578e/aaababbb.abbbb (IJ)I
      // 2c: iand
      // 2d: istore 14
      // 2f: istore 13
      // 31: iload 12
      // 33: ldc_w 1171217885
      // 36: ldc_w -1589466490
      // 39: ldc_w 390272344
      // 3c: ixor
      // 3d: invokestatic qeaa361f143ee4a0894bd168fd9b30c66/qf4ccf8f5435d4a78bdca4d6a018b578e/aaababbb.a (II)I
      // 40: ldc2_w 6485509548550546198
      // 43: invokestatic qeaa361f143ee4a0894bd168fd9b30c66/qf4ccf8f5435d4a78bdca4d6a018b578e/aaababbb.abbbb (IJ)I
      // 46: iushr
      // 47: ldc_w 1171217886
      // 4a: ldc_w -1589466490
      // 4d: ldc_w 1455247351
      // 50: ixor
      // 51: invokestatic qeaa361f143ee4a0894bd168fd9b30c66/qf4ccf8f5435d4a78bdca4d6a018b578e/aaababbb.a (II)I
      // 54: ldc2_w 5562011275870078093
      // 57: invokestatic qeaa361f143ee4a0894bd168fd9b30c66/qf4ccf8f5435d4a78bdca4d6a018b578e/aaababbb.abbbb (IJ)I
      // 5a: iand
      // 5b: istore 15
      // 5d: iload 14
      // 5f: iload 13
      // 61: ifne 85
      // 64: ifgt 7d
      // 67: goto 6b
      // 6a: athrow
      // 6b: iload 15
      // 6d: iload 13
      // 6f: ifne aa
      // 72: goto 76
      // 75: athrow
      // 76: ifle a5
      // 79: goto 7d
      // 7c: athrow
      // 7d: dload 5
      // 7f: dconst_0
      // 80: dcmpg
      // 81: goto 85
      // 84: athrow
      // 85: iload 13
      // 87: ifne aa
      // 8a: ifle a5
      // 8d: goto 91
      // 90: athrow
      // 91: dload 7
      // 93: iload 13
      // 95: ifne b4
      // 98: goto 9c
      // 9b: athrow
      // 9c: dconst_0
      // 9d: dcmpg
      // 9e: ifgt ab
      // a1: goto a5
      // a4: athrow
      // a5: bipush 1
      // a6: goto aa
      // a9: athrow
      // aa: ireturn
      // ab: dload 5
      // ad: dload 7
      // af: dload 9
      // b1: invokestatic qeaa361f143ee4a0894bd168fd9b30c66/qf4ccf8f5435d4a78bdca4d6a018b578e/aaababbb.bbba (DDD)D
      // b4: dstore 16
      // b6: aload 0
      // b7: getfield net/minecraft/class_332.field_59826 Lnet/minecraft/class_11246;
      // ba: new qeaa361f143ee4a0894bd168fd9b30c66/qf4ccf8f5435d4a78bdca4d6a018b578e/bbababba
      // bd: dup
      // be: new org/joml/Matrix3x2f
      // c1: dup
      // c2: aload 0
      // c3: invokevirtual net/minecraft/class_332.method_51448 ()Lorg/joml/Matrix3x2fStack;
      // c6: invokespecial org/joml/Matrix3x2f.<init> (Lorg/joml/Matrix3x2fc;)V
      // c9: dload 1
      // ca: d2f
      // cb: dload 3
      // cc: d2f
      // cd: dload 5
      // cf: d2f
      // d0: dload 7
      // d2: d2f
      // d3: dload 16
      // d5: d2f
      // d6: fconst_0
      // d7: bipush 0
      // d8: iload 11
      // da: iload 12
      // dc: iload 12
      // de: iload 11
      // e0: aload 0
      // e1: getfield net/minecraft/class_332.field_44659 Lnet/minecraft/class_332$class_8214;
      // e4: invokevirtual net/minecraft/class_332$class_8214.method_70863 ()Lnet/minecraft/class_8030;
      // e7: invokespecial qeaa361f143ee4a0894bd168fd9b30c66/qf4ccf8f5435d4a78bdca4d6a018b578e/bbababba.<init> (Lorg/joml/Matrix3x2fc;FFFFFFIIIIILnet/minecraft/class_8030;)V
      // ea: invokevirtual net/minecraft/class_11246.method_70919 (Lnet/minecraft/class_11244;)V
      // ed: bipush 1
      // ee: ireturn
   }

   private static void bbaab(
      class_4588 param0, Matrix3x2fc param1, float param2, float param3, float param4, float param5, float param6, float param7, int param8
   ) {
      // $VF: Couldn't be decompiled
      // Please report this to the Vineflower issue tracker, at https://github.com/Vineflower/vineflower/issues with a copy of the class file (if you have the rights to distribute it!)
      // java.lang.RuntimeException: parsing failure!
      //   at org.jetbrains.java.decompiler.modules.decompiler.decompose.DomHelper.parseGraph(DomHelper.java:211)
      //   at org.jetbrains.java.decompiler.main.rels.MethodProcessor.codeToJava(MethodProcessor.java:166)
      //
      // Bytecode:
      // 000: getstatic qeaa361f143ee4a0894bd168fd9b30c66/qf4ccf8f5435d4a78bdca4d6a018b578e/baaabbaa.bba I
      // 003: fload 7
      // 005: fload 4
      // 007: fload 5
      // 009: invokestatic java/lang/Math.min (FF)F
      // 00c: ldc 0.5
      // 00e: fmul
      // 00f: invokestatic java/lang/Math.min (FF)F
      // 012: fstore 10
      // 014: fload 4
      // 016: fload 10
      // 018: fconst_2
      // 019: fmul
      // 01a: fsub
      // 01b: fstore 11
      // 01d: istore 9
      // 01f: fload 5
      // 021: fload 10
      // 023: fconst_2
      // 024: fmul
      // 025: fsub
      // 026: fstore 12
      // 028: iload 9
      // 02a: ifne 05f
      // 02d: fload 11
      // 02f: fconst_0
      // 030: fcmpg
      // 031: ifle 04c
      // 034: goto 038
      // 037: athrow
      // 038: fload 12
      // 03a: iload 9
      // 03c: ifne 062
      // 03f: goto 043
      // 042: athrow
      // 043: fconst_0
      // 044: fcmpg
      // 045: ifgt 060
      // 048: goto 04c
      // 04b: athrow
      // 04c: aload 0
      // 04d: aload 1
      // 04e: fload 2
      // 04f: fload 3
      // 050: fload 4
      // 052: fload 5
      // 054: fload 6
      // 056: iload 8
      // 058: invokestatic qeaa361f143ee4a0894bd168fd9b30c66/qf4ccf8f5435d4a78bdca4d6a018b578e/aaababbb.bbaa (Lnet/minecraft/class_4588;Lorg/joml/Matrix3x2fc;FFFFFI)V
      // 05b: goto 05f
      // 05e: athrow
      // 05f: return
      // 060: fload 6
      // 062: invokestatic qeaa361f143ee4a0894bd168fd9b30c66/qf4ccf8f5435d4a78bdca4d6a018b578e/aaababbb.abaab (F)I
      // 065: istore 13
      // 067: ldc_w 1171217887
      // 06a: ldc_w 1489091671
      // 06d: ldc_w -918947653
      // 070: ixor
      // 071: invokestatic qeaa361f143ee4a0894bd168fd9b30c66/qf4ccf8f5435d4a78bdca4d6a018b578e/aaababbb.a (II)I
      // 074: ldc2_w 5592888340436613844
      // 077: invokestatic qeaa361f143ee4a0894bd168fd9b30c66/qf4ccf8f5435d4a78bdca4d6a018b578e/aaababbb.abbbb (IJ)I
      // 07a: newarray 6
      // 07c: astore 14
      // 07e: ldc_w 1171217880
      // 081: ldc_w 1489091671
      // 084: ldc_w 791101183
      // 087: ixor
      // 088: invokestatic qeaa361f143ee4a0894bd168fd9b30c66/qf4ccf8f5435d4a78bdca4d6a018b578e/aaababbb.a (II)I
      // 08b: ldc2_w 5592888340436613844
      // 08e: invokestatic qeaa361f143ee4a0894bd168fd9b30c66/qf4ccf8f5435d4a78bdca4d6a018b578e/aaababbb.abbbb (IJ)I
      // 091: newarray 6
      // 093: astore 15
      // 095: ldc_w 1171217881
      // 098: ldc_w 1489091671
      // 09b: ldc_w 1965273492
      // 09e: ixor
      // 09f: invokestatic qeaa361f143ee4a0894bd168fd9b30c66/qf4ccf8f5435d4a78bdca4d6a018b578e/aaababbb.a (II)I
      // 0a2: ldc2_w 5592888340436613844
      // 0a5: invokestatic qeaa361f143ee4a0894bd168fd9b30c66/qf4ccf8f5435d4a78bdca4d6a018b578e/aaababbb.abbbb (IJ)I
      // 0a8: newarray 6
      // 0aa: astore 16
      // 0ac: ldc_w 1171217882
      // 0af: ldc_w 1489091671
      // 0b2: ldc_w -1376584643
      // 0b5: ixor
      // 0b6: invokestatic qeaa361f143ee4a0894bd168fd9b30c66/qf4ccf8f5435d4a78bdca4d6a018b578e/aaababbb.a (II)I
      // 0b9: ldc2_w 5592888340436613844
      // 0bc: invokestatic qeaa361f143ee4a0894bd168fd9b30c66/qf4ccf8f5435d4a78bdca4d6a018b578e/aaababbb.abbbb (IJ)I
      // 0bf: newarray 6
      // 0c1: astore 17
      // 0c3: aload 14
      // 0c5: aload 15
      // 0c7: fload 2
      // 0c8: fload 3
      // 0c9: fload 4
      // 0cb: fload 5
      // 0cd: fload 6
      // 0cf: iload 13
      // 0d1: invokestatic qeaa361f143ee4a0894bd168fd9b30c66/qf4ccf8f5435d4a78bdca4d6a018b578e/aaababbb.bbbaa ([F[FFFFFFI)I
      // 0d4: istore 18
      // 0d6: aload 16
      // 0d8: aload 17
      // 0da: fload 2
      // 0db: fload 10
      // 0dd: fadd
      // 0de: fload 3
      // 0df: fload 10
      // 0e1: fadd
      // 0e2: fload 11
      // 0e4: fload 12
      // 0e6: fconst_0
      // 0e7: fload 6
      // 0e9: fload 10
      // 0eb: fsub
      // 0ec: invokestatic java/lang/Math.max (FF)F
      // 0ef: iload 13
      // 0f1: invokestatic qeaa361f143ee4a0894bd168fd9b30c66/qf4ccf8f5435d4a78bdca4d6a018b578e/aaababbb.bbbaa ([F[FFFFFFI)I
      // 0f4: istore 19
      // 0f6: iload 18
      // 0f8: iload 19
      // 0fa: invokestatic java/lang/Math.min (II)I
      // 0fd: istore 20
      // 0ff: bipush 0
      // 100: istore 21
      // 102: iload 21
      // 104: iload 20
      // 106: if_icmpge 180
      // 109: iload 21
      // 10b: bipush 1
      // 10c: iadd
      // 10d: iload 20
      // 10f: irem
      // 110: istore 22
      // 112: iload 9
      // 114: aload 0
      // 115: aload 1
      // 116: aload 14
      // 118: iload 21
      // 11a: faload
      // 11b: aload 15
      // 11d: iload 21
      // 11f: faload
      // 120: iload 8
      // 122: invokestatic qeaa361f143ee4a0894bd168fd9b30c66/qf4ccf8f5435d4a78bdca4d6a018b578e/aaababbb.babaa (Lnet/minecraft/class_4588;Lorg/joml/Matrix3x2fc;FFI)V
      // 125: aload 0
      // 126: aload 1
      // 127: aload 14
      // 129: iload 22
      // 12b: faload
      // 12c: aload 15
      // 12e: iload 22
      // 130: faload
      // 131: iload 8
      // 133: invokestatic qeaa361f143ee4a0894bd168fd9b30c66/qf4ccf8f5435d4a78bdca4d6a018b578e/aaababbb.babaa (Lnet/minecraft/class_4588;Lorg/joml/Matrix3x2fc;FFI)V
      // 136: aload 0
      // 137: aload 1
      // 138: aload 16
      // 13a: iload 22
      // 13c: faload
      // 13d: aload 17
      // 13f: iload 22
      // 141: faload
      // 142: iload 8
      // 144: invokestatic qeaa361f143ee4a0894bd168fd9b30c66/qf4ccf8f5435d4a78bdca4d6a018b578e/aaababbb.babaa (Lnet/minecraft/class_4588;Lorg/joml/Matrix3x2fc;FFI)V
      // 147: aload 0
      // 148: aload 1
      // 149: aload 14
      // 14b: iload 21
      // 14d: faload
      // 14e: aload 15
      // 150: iload 21
      // 152: faload
      // 153: iload 8
      // 155: invokestatic qeaa361f143ee4a0894bd168fd9b30c66/qf4ccf8f5435d4a78bdca4d6a018b578e/aaababbb.babaa (Lnet/minecraft/class_4588;Lorg/joml/Matrix3x2fc;FFI)V
      // 158: aload 0
      // 159: aload 1
      // 15a: aload 16
      // 15c: iload 22
      // 15e: faload
      // 15f: aload 17
      // 161: iload 22
      // 163: faload
      // 164: iload 8
      // 166: invokestatic qeaa361f143ee4a0894bd168fd9b30c66/qf4ccf8f5435d4a78bdca4d6a018b578e/aaababbb.babaa (Lnet/minecraft/class_4588;Lorg/joml/Matrix3x2fc;FFI)V
      // 169: aload 0
      // 16a: aload 1
      // 16b: aload 16
      // 16d: iload 21
      // 16f: faload
      // 170: aload 17
      // 172: iload 21
      // 174: faload
      // 175: iload 8
      // 177: invokestatic qeaa361f143ee4a0894bd168fd9b30c66/qf4ccf8f5435d4a78bdca4d6a018b578e/aaababbb.babaa (Lnet/minecraft/class_4588;Lorg/joml/Matrix3x2fc;FFI)V
      // 17a: iinc 21 1
      // 17d: ifeq 102
      // 180: return
   }

   static boolean bbaba(class_332 param0, double param1, double param3, double param5, double param7, double param9, int param11) {
      // $VF: Couldn't be decompiled
      // Please report this to the Vineflower issue tracker, at https://github.com/Vineflower/vineflower/issues with a copy of the class file (if you have the rights to distribute it!)
      // java.lang.RuntimeException: parsing failure!
      //   at org.jetbrains.java.decompiler.modules.decompiler.decompose.DomHelper.parseGraph(DomHelper.java:211)
      //   at org.jetbrains.java.decompiler.main.rels.MethodProcessor.codeToJava(MethodProcessor.java:166)
      //
      // Bytecode:
      // 00: getstatic qeaa361f143ee4a0894bd168fd9b30c66/qf4ccf8f5435d4a78bdca4d6a018b578e/baaabbaa.bba I
      // 03: istore 12
      // 05: dload 5
      // 07: dconst_0
      // 08: dcmpg
      // 09: iload 12
      // 0b: ifne 68
      // 0e: ifle 63
      // 11: goto 15
      // 14: athrow
      // 15: dload 7
      // 17: dconst_0
      // 18: dcmpg
      // 19: iload 12
      // 1b: ifne 68
      // 1e: goto 22
      // 21: athrow
      // 22: ifle 63
      // 25: goto 29
      // 28: athrow
      // 29: iload 11
      // 2b: ldc_w 1171217883
      // 2e: ldc_w 1140586703
      // 31: ldc_w 1826262782
      // 34: ixor
      // 35: invokestatic qeaa361f143ee4a0894bd168fd9b30c66/qf4ccf8f5435d4a78bdca4d6a018b578e/aaababbb.a (II)I
      // 38: ldc2_w 6485509548550546198
      // 3b: invokestatic qeaa361f143ee4a0894bd168fd9b30c66/qf4ccf8f5435d4a78bdca4d6a018b578e/aaababbb.abbbb (IJ)I
      // 3e: iushr
      // 3f: iload 12
      // 41: ifne 68
      // 44: goto 48
      // 47: athrow
      // 48: ldc_w 1171217876
      // 4b: ldc_w 1140586703
      // 4e: ldc_w -983070915
      // 51: ixor
      // 52: invokestatic qeaa361f143ee4a0894bd168fd9b30c66/qf4ccf8f5435d4a78bdca4d6a018b578e/aaababbb.a (II)I
      // 55: ldc2_w 5562011275870078093
      // 58: invokestatic qeaa361f143ee4a0894bd168fd9b30c66/qf4ccf8f5435d4a78bdca4d6a018b578e/aaababbb.abbbb (IJ)I
      // 5b: iand
      // 5c: ifgt 69
      // 5f: goto 63
      // 62: athrow
      // 63: bipush 1
      // 64: goto 68
      // 67: athrow
      // 68: ireturn
      // 69: dconst_0
      // 6a: dload 9
      // 6c: invokestatic java/lang/Math.max (DD)D
      // 6f: d2f
      // 70: fstore 13
      // 72: aload 0
      // 73: getfield net/minecraft/class_332.field_59826 Lnet/minecraft/class_11246;
      // 76: new qeaa361f143ee4a0894bd168fd9b30c66/qf4ccf8f5435d4a78bdca4d6a018b578e/abaababb
      // 79: dup
      // 7a: new org/joml/Matrix3x2f
      // 7d: dup
      // 7e: aload 0
      // 7f: invokevirtual net/minecraft/class_332.method_51448 ()Lorg/joml/Matrix3x2fStack;
      // 82: invokespecial org/joml/Matrix3x2f.<init> (Lorg/joml/Matrix3x2fc;)V
      // 85: dload 1
      // 86: d2f
      // 87: dload 3
      // 88: d2f
      // 89: dload 5
      // 8b: d2f
      // 8c: dload 7
      // 8e: d2f
      // 8f: fload 13
      // 91: iload 11
      // 93: aload 0
      // 94: getfield net/minecraft/class_332.field_44659 Lnet/minecraft/class_332$class_8214;
      // 97: invokevirtual net/minecraft/class_332$class_8214.method_70863 ()Lnet/minecraft/class_8030;
      // 9a: invokespecial qeaa361f143ee4a0894bd168fd9b30c66/qf4ccf8f5435d4a78bdca4d6a018b578e/abaababb.<init> (Lorg/joml/Matrix3x2fc;FFFFFILnet/minecraft/class_8030;)V
      // 9d: invokevirtual net/minecraft/class_11246.method_70919 (Lnet/minecraft/class_11244;)V
      // a0: bipush 1
      // a1: ireturn
   }

   private static void bbabb(class_4588 var0, Matrix3x2fc var1, float var2, float var3, float var4, float var5, int var6) {
      var0.method_70815(var1, var2, var3).method_22913(var4, var5).method_39415(var6);
   }

   private static int bbbaa(float[] var0, float[] var1, float var2, float var3, float var4, float var5, float var6, int var7) {
      float var8 = Math.min(Math.min(var4, var5) * 0.5F, Math.max(0.0F, var6));
      int var9 = 0;
      var9 = bbbbb(var0, var1, var9, var2 + var4 - var8, var3 + var8, var8, -90.0F, 0.0F, var7);
      var9 = bbbbb(var0, var1, var9, var2 + var4 - var8, var3 + var5 - var8, var8, 0.0F, 90.0F, var7);
      var9 = bbbbb(var0, var1, var9, var2 + var8, var3 + var5 - var8, var8, 90.0F, 180.0F, var7);
      return bbbbb(var0, var1, var9, var2 + var8, var3 + var8, var8, 180.0F, 270.0F, var7);
   }

   static boolean bbbab(class_332 param0, double param1, double param3, double param5, double param7, double param9, double param11, int param13) {
      // $VF: Couldn't be decompiled
      // Please report this to the Vineflower issue tracker, at https://github.com/Vineflower/vineflower/issues with a copy of the class file (if you have the rights to distribute it!)
      // java.lang.RuntimeException: parsing failure!
      //   at org.jetbrains.java.decompiler.modules.decompiler.decompose.DomHelper.parseGraph(DomHelper.java:211)
      //   at org.jetbrains.java.decompiler.main.rels.MethodProcessor.codeToJava(MethodProcessor.java:166)
      //
      // Bytecode:
      // 00: getstatic qeaa361f143ee4a0894bd168fd9b30c66/qf4ccf8f5435d4a78bdca4d6a018b578e/baaabbaa.bba I
      // 03: istore 14
      // 05: dload 5
      // 07: dconst_0
      // 08: dcmpg
      // 09: iload 14
      // 0b: ifne 7c
      // 0e: ifle 77
      // 11: goto 15
      // 14: athrow
      // 15: dload 7
      // 17: dconst_0
      // 18: dcmpg
      // 19: iload 14
      // 1b: ifne 7c
      // 1e: goto 22
      // 21: athrow
      // 22: ifle 77
      // 25: goto 29
      // 28: athrow
      // 29: dload 11
      // 2b: dconst_0
      // 2c: dcmpg
      // 2d: iload 14
      // 2f: ifne 7c
      // 32: goto 36
      // 35: athrow
      // 36: ifle 77
      // 39: goto 3d
      // 3c: athrow
      // 3d: iload 13
      // 3f: ldc_w 1171217877
      // 42: ldc_w 2141509952
      // 45: ldc_w 1904099061
      // 48: ixor
      // 49: invokestatic qeaa361f143ee4a0894bd168fd9b30c66/qf4ccf8f5435d4a78bdca4d6a018b578e/aaababbb.a (II)I
      // 4c: ldc2_w 6485509548550546198
      // 4f: invokestatic qeaa361f143ee4a0894bd168fd9b30c66/qf4ccf8f5435d4a78bdca4d6a018b578e/aaababbb.abbbb (IJ)I
      // 52: iushr
      // 53: iload 14
      // 55: ifne 7c
      // 58: goto 5c
      // 5b: athrow
      // 5c: ldc_w 1171217878
      // 5f: ldc_w 2141509952
      // 62: ldc_w 1257878408
      // 65: ixor
      // 66: invokestatic qeaa361f143ee4a0894bd168fd9b30c66/qf4ccf8f5435d4a78bdca4d6a018b578e/aaababbb.a (II)I
      // 69: ldc2_w 5562011275870078093
      // 6c: invokestatic qeaa361f143ee4a0894bd168fd9b30c66/qf4ccf8f5435d4a78bdca4d6a018b578e/aaababbb.abbbb (IJ)I
      // 6f: iand
      // 70: ifgt 7d
      // 73: goto 77
      // 76: athrow
      // 77: bipush 1
      // 78: goto 7c
      // 7b: athrow
      // 7c: ireturn
      // 7d: ldc2_w 0.5
      // 80: dload 11
      // 82: invokestatic java/lang/Math.max (DD)D
      // 85: dload 5
      // 87: dload 7
      // 89: invokestatic java/lang/Math.min (DD)D
      // 8c: ldc2_w 0.5
      // 8f: dmul
      // 90: invokestatic java/lang/Math.min (DD)D
      // 93: d2f
      // 94: fstore 15
      // 96: aload 0
      // 97: getfield net/minecraft/class_332.field_59826 Lnet/minecraft/class_11246;
      // 9a: new qeaa361f143ee4a0894bd168fd9b30c66/qf4ccf8f5435d4a78bdca4d6a018b578e/ababbabaa
      // 9d: dup
      // 9e: new org/joml/Matrix3x2f
      // a1: dup
      // a2: aload 0
      // a3: invokevirtual net/minecraft/class_332.method_51448 ()Lorg/joml/Matrix3x2fStack;
      // a6: invokespecial org/joml/Matrix3x2f.<init> (Lorg/joml/Matrix3x2fc;)V
      // a9: dload 1
      // aa: d2f
      // ab: dload 3
      // ac: d2f
      // ad: dload 5
      // af: d2f
      // b0: dload 7
      // b2: d2f
      // b3: dload 5
      // b5: dload 7
      // b7: dload 9
      // b9: invokestatic qeaa361f143ee4a0894bd168fd9b30c66/qf4ccf8f5435d4a78bdca4d6a018b578e/aaababbb.bbba (DDD)D
      // bc: d2f
      // bd: fload 15
      // bf: iload 13
      // c1: bipush 1
      // c2: aload 0
      // c3: getfield net/minecraft/class_332.field_44659 Lnet/minecraft/class_332$class_8214;
      // c6: invokevirtual net/minecraft/class_332$class_8214.method_70863 ()Lnet/minecraft/class_8030;
      // c9: invokespecial qeaa361f143ee4a0894bd168fd9b30c66/qf4ccf8f5435d4a78bdca4d6a018b578e/ababbabaa.<init> (Lorg/joml/Matrix3x2fc;FFFFFFIZLnet/minecraft/class_8030;)V
      // cc: invokevirtual net/minecraft/class_11246.method_70919 (Lnet/minecraft/class_11244;)V
      // cf: bipush 1
      // d0: ireturn
   }

   static void bbbba(class_332 param0, class_2960 param1, int param2, int param3, int param4, int param5, int param6) {
      // $VF: Couldn't be decompiled
      // Please report this to the Vineflower issue tracker, at https://github.com/Vineflower/vineflower/issues with a copy of the class file (if you have the rights to distribute it!)
      // java.lang.RuntimeException: parsing failure!
      //   at org.jetbrains.java.decompiler.modules.decompiler.decompose.DomHelper.parseGraph(DomHelper.java:211)
      //   at org.jetbrains.java.decompiler.main.rels.MethodProcessor.codeToJava(MethodProcessor.java:166)
      //
      // Bytecode:
      // 00: getstatic qeaa361f143ee4a0894bd168fd9b30c66/qf4ccf8f5435d4a78bdca4d6a018b578e/baaabbaa.bba I
      // 03: istore 7
      // 05: iload 6
      // 07: iload 7
      // 09: ifne 41
      // 0c: ldc_w 1171217879
      // 0f: ldc_w -922882484
      // 12: ldc_w -240912821
      // 15: ixor
      // 16: invokestatic qeaa361f143ee4a0894bd168fd9b30c66/qf4ccf8f5435d4a78bdca4d6a018b578e/aaababbb.a (II)I
      // 19: ldc2_w 6485509548550546198
      // 1c: invokestatic qeaa361f143ee4a0894bd168fd9b30c66/qf4ccf8f5435d4a78bdca4d6a018b578e/aaababbb.abbbb (IJ)I
      // 1f: iushr
      // 20: ldc_w 1171217872
      // 23: ldc_w -922882484
      // 26: ldc_w -1134042722
      // 29: ixor
      // 2a: invokestatic qeaa361f143ee4a0894bd168fd9b30c66/qf4ccf8f5435d4a78bdca4d6a018b578e/aaababbb.a (II)I
      // 2d: ldc2_w 5562011275870078093
      // 30: invokestatic qeaa361f143ee4a0894bd168fd9b30c66/qf4ccf8f5435d4a78bdca4d6a018b578e/aaababbb.abbbb (IJ)I
      // 33: iand
      // 34: ifle 52
      // 37: goto 3b
      // 3a: athrow
      // 3b: iload 4
      // 3d: goto 41
      // 40: athrow
      // 41: iload 7
      // 43: ifne 4f
      // 46: ifle 52
      // 49: goto 4d
      // 4c: athrow
      // 4d: iload 5
      // 4f: ifgt 53
      // 52: return
      // 53: aload 0
      // 54: getstatic net/minecraft/class_10799.field_56883 Lcom/mojang/blaze3d/pipeline/RenderPipeline;
      // 57: aload 1
      // 58: iload 2
      // 59: iload 3
      // 5a: fconst_0
      // 5b: fconst_0
      // 5c: iload 4
      // 5e: iload 5
      // 60: iload 4
      // 62: iload 5
      // 64: iload 6
      // 66: invokevirtual net/minecraft/class_332.method_25291 (Lcom/mojang/blaze3d/pipeline/RenderPipeline;Lnet/minecraft/class_2960;IIFFIIIII)V
      // 69: return
   }

   private static int bbbbb(float[] var0, float[] var1, int var2, float var3, float var4, float var5, float var6, float var7, int var8) {
      int var10 = 0;
      int var9 = baaabbaa.bba;

      int var10000;
      while (true) {
         if (var10 <= var8) {
            var10000 = var10;
            if (var9 != 0) {
               break;
            }

            float var11 = (float)var10 / var8;
            double var12 = Math.toRadians(var6 + (var7 - var6) * var11);
            var0[var2] = var3 + (float)Math.cos(var12) * var5;
            var1[var2] = var4 + (float)Math.sin(var12) * var5;
            var2++;
            var10++;
            if (var9 == 0) {
               continue;
            }
         }

         var10000 = var2;
         break;
      }

      return var10000;
   }

   private static void aaaaaa(class_4588 var0, Matrix3x2fc var1, float var2, float var3, float var4, int var5) {
      int var7 = abbba(var4);
      int var8 = 0;
      int var6 = baaabbaa.bba;

      while (var8 < var7) {
         double var9 = (Math.PI * 2) * var8 / var7;
         double var11 = (Math.PI * 2) * (var8 + 1) / var7;
         babaa(var0, var1, var2, var3, var5);
         babaa(var0, var1, var2 + (float)Math.cos(var9) * var4, var3 + (float)Math.sin(var9) * var4, var5);
         babaa(var0, var1, var2 + (float)Math.cos(var11) * var4, var3 + (float)Math.sin(var11) * var4, var5);
         var8++;
         if (var6 != 0) {
            break;
         }
      }
   }
}
