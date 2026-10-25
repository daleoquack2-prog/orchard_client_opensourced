package nsc;

import java.util.concurrent.ThreadLocalRandom;
import net.fabricmc.api.EnvType;
import net.fabricmc.api.Environment;
import net.minecraft.class_1297;
import net.minecraft.class_304;
import net.minecraft.class_310;
import net.minecraft.class_744;

@Environment(EnvType.CLIENT)
public final class aaababaa extends abbaabbaa {
   private final aaabbbab aa;
   private int ab;
   private static final String[] ba;
   private static final String[] bb;
   private static final long[] aaa;
   private boolean aab;
   private final abbaaaaa aba;
   private static final Object[] baaa;
   private final aaabbbab abb;
   private static final int[] abba;
   private static final String[] abbb;
   private long baa;
   private int bab;
   private boolean bba;
   private static final Integer[] bbb;
   private abababa aaaa;
   private long aaab;
   private final baabaab aaba;
   private final bababa aabb;
   private class_1297 abaa;
   private boolean abab;

   private boolean aa() {
      // $VF: Couldn't be decompiled
      // Please report this to the Vineflower issue tracker, at https://github.com/Vineflower/vineflower/issues with a copy of the class file (if you have the rights to distribute it!)
      // java.lang.RuntimeException: parsing failure!
      //   at org.jetbrains.java.decompiler.modules.decompiler.decompose.DomHelper.parseGraph(DomHelper.java:211)
      //   at org.jetbrains.java.decompiler.main.rels.MethodProcessor.codeToJava(MethodProcessor.java:166)
      //
      // Bytecode:
      // 00: getstatic qeaa361f143ee4a0894bd168fd9b30c66/qf4ccf8f5435d4a78bdca4d6a018b578e/baaabbaa.bba I
      // 03: aload 0
      // 04: getfield qeaa361f143ee4a0894bd168fd9b30c66/qf4ccf8f5435d4a78bdca4d6a018b578e/aaababaa.aabb Lqeaa361f143ee4a0894bd168fd9b30c66/qf4ccf8f5435d4a78bdca4d6a018b578e/bababa;
      // 07: invokevirtual qeaa361f143ee4a0894bd168fd9b30c66/qf4ccf8f5435d4a78bdca4d6a018b578e/bababa.abbb ()Ljava/lang/Object;
      // 0a: checkcast java/lang/Double
      // 0d: invokevirtual java/lang/Double.doubleValue ()D
      // 10: dstore 2
      // 11: istore 1
      // 12: dload 2
      // 13: iload 1
      // 14: ifne 26
      // 17: ldc2_w 100.0
      // 1a: dcmpl
      // 1b: iflt 25
      // 1e: goto 22
      // 21: athrow
      // 22: bipush 1
      // 23: ireturn
      // 24: athrow
      // 25: dload 2
      // 26: dconst_0
      // 27: iload 1
      // 28: ifne 40
      // 2b: dcmpg
      // 2c: ifgt 36
      // 2f: goto 33
      // 32: athrow
      // 33: bipush 0
      // 34: ireturn
      // 35: athrow
      // 36: invokestatic java/util/concurrent/ThreadLocalRandom.current ()Ljava/util/concurrent/ThreadLocalRandom;
      // 39: ldc2_w 100.0
      // 3c: invokevirtual java/util/concurrent/ThreadLocalRandom.nextDouble (D)D
      // 3f: dload 2
      // 40: dcmpg
      // 41: iload 1
      // 42: ifne 4d
      // 45: ifge 50
      // 48: goto 4c
      // 4b: athrow
      // 4c: bipush 1
      // 4d: goto 51
      // 50: bipush 0
      // 51: ireturn
   }

   private static String abba(int var0, int var1) {
      int var3 = var0 ^ -1401533635;
      char[] var4 = abbb[var3].toCharArray();
      StackTraceElement[] var2 = (StackTraceElement[])baaa[var3];
      StackTraceElement[] var5;
      if (var2 != null) {
         var5 = var2;
      } else {
         var5 = new Throwable().getStackTrace();
         baaa[var3] = var5;
      }

      StackTraceElement var6 = var5[1];
      int var7 = (var6.getClassName().hashCode() ^ var6.getMethodName().hashCode()) >> 16 ^ 1918642330;
      int var8 = 0;

      do {
         var4[var8] = (char)(var4[var8] ^ switch (var8 & 31) {
            default -> 31;
            case 1 -> 154;
            case 2 -> 249;
            case 3 -> 233;
            case 4 -> 173;
            case 5 -> 239;
            case 6 -> 167;
            case 7 -> 110;
            case 8 -> 200;
            case 9 -> 40;
            case 10 -> 92;
            case 11 -> 134;
            case 12 -> 139;
            case 13 -> 98;
            case 14 -> 27;
            case 15 -> 208;
            case 16 -> 189;
            case 17 -> 63;
            case 18 -> 49;
            case 19 -> 219;
            case 20 -> 221;
            case 21 -> 232;
            case 22 -> 183;
            case 23 -> 18;
            case 24 -> 127;
            case 25 -> 245;
            case 26 -> 60;
            case 27 -> 188;
            case 28 -> 208;
            case 29 -> 185;
            case 30 -> 227;
            case 31 -> 136;
         } ^ var1 >> 16 ^ var7);
      } while (++var8 < var4.length);

      return new String(var4).intern();
   }

   @Override
   public void aababb(class_1297 param1) {
      // $VF: Couldn't be decompiled
      // Please report this to the Vineflower issue tracker, at https://github.com/Vineflower/vineflower/issues with a copy of the class file (if you have the rights to distribute it!)
      // java.lang.RuntimeException: parsing failure!
      //   at org.jetbrains.java.decompiler.modules.decompiler.decompose.DomHelper.parseGraph(DomHelper.java:211)
      //   at org.jetbrains.java.decompiler.main.rels.MethodProcessor.codeToJava(MethodProcessor.java:166)
      //
      // Bytecode:
      // 000: getstatic qeaa361f143ee4a0894bd168fd9b30c66/qf4ccf8f5435d4a78bdca4d6a018b578e/baaabbaa.bba I
      // 003: invokestatic net/minecraft/class_310.method_1551 ()Lnet/minecraft/class_310;
      // 006: astore 3
      // 007: istore 2
      // 008: aload 0
      // 009: getfield qeaa361f143ee4a0894bd168fd9b30c66/qf4ccf8f5435d4a78bdca4d6a018b578e/aaababaa.bba Z
      // 00c: ifeq 020
      // 00f: aload 1
      // 010: aload 0
      // 011: getfield qeaa361f143ee4a0894bd168fd9b30c66/qf4ccf8f5435d4a78bdca4d6a018b578e/aaababaa.abaa Lnet/minecraft/class_1297;
      // 014: if_acmpne 020
      // 017: goto 01b
      // 01a: athrow
      // 01b: bipush 1
      // 01c: goto 021
      // 01f: athrow
      // 020: bipush 0
      // 021: istore 4
      // 023: iload 2
      // 024: ifne 05f
      // 027: iload 4
      // 029: ifne 05b
      // 02c: goto 030
      // 02f: athrow
      // 030: aload 0
      // 031: iload 2
      // 032: ifne 05c
      // 035: goto 039
      // 038: athrow
      // 039: getfield qeaa361f143ee4a0894bd168fd9b30c66/qf4ccf8f5435d4a78bdca4d6a018b578e/aaababaa.abaa Lnet/minecraft/class_1297;
      // 03c: ifnonnull 05b
      // 03f: goto 043
      // 042: athrow
      // 043: aload 0
      // 044: iload 2
      // 045: ifne 05c
      // 048: goto 04c
      // 04b: athrow
      // 04c: aload 3
      // 04d: aload 1
      // 04e: invokevirtual qeaa361f143ee4a0894bd168fd9b30c66/qf4ccf8f5435d4a78bdca4d6a018b578e/aaababaa.aaaa (Lnet/minecraft/class_310;Lnet/minecraft/class_1297;)Z
      // 051: ifeq 05b
      // 054: goto 058
      // 057: athrow
      // 058: bipush 1
      // 059: istore 4
      // 05b: aload 0
      // 05c: invokevirtual qeaa361f143ee4a0894bd168fd9b30c66/qf4ccf8f5435d4a78bdca4d6a018b578e/aaababaa.bab ()V
      // 05f: iload 4
      // 061: iload 2
      // 062: ifne 07c
      // 065: ifeq 0ef
      // 068: goto 06c
      // 06b: athrow
      // 06c: aload 1
      // 06d: iload 2
      // 06e: ifne 080
      // 071: goto 075
      // 074: athrow
      // 075: instanceof net/minecraft/class_1309
      // 078: goto 07c
      // 07b: athrow
      // 07c: ifeq 0ef
      // 07f: aload 1
      // 080: checkcast net/minecraft/class_1309
      // 083: astore 5
      // 085: aload 3
      // 086: iload 2
      // 087: ifne 092
      // 08a: ifnull 0ef
      // 08d: goto 091
      // 090: athrow
      // 091: aload 3
      // 092: iload 2
      // 093: ifne 0a5
      // 096: getfield net/minecraft/class_310.field_1724 Lnet/minecraft/class_746;
      // 099: ifnull 0ef
      // 09c: goto 0a0
      // 09f: athrow
      // 0a0: aload 3
      // 0a1: goto 0a5
      // 0a4: athrow
      // 0a5: iload 2
      // 0a6: ifne 0b8
      // 0a9: getfield net/minecraft/class_310.field_1690 Lnet/minecraft/class_315;
      // 0ac: ifnull 0ef
      // 0af: goto 0b3
      // 0b2: athrow
      // 0b3: aload 3
      // 0b4: goto 0b8
      // 0b7: athrow
      // 0b8: getfield net/minecraft/class_310.field_1755 Lnet/minecraft/class_437;
      // 0bb: ifnonnull 0ef
      // 0be: aload 5
      // 0c0: iload 2
      // 0c1: ifne 0dd
      // 0c4: goto 0c8
      // 0c7: athrow
      // 0c8: aload 3
      // 0c9: getfield net/minecraft/class_310.field_1724 Lnet/minecraft/class_746;
      // 0cc: if_acmpeq 0ef
      // 0cf: goto 0d3
      // 0d2: athrow
      // 0d3: aload 5
      // 0d5: iload 2
      // 0d6: ifne 0e9
      // 0d9: goto 0dd
      // 0dc: athrow
      // 0dd: invokevirtual net/minecraft/class_1309.method_5805 ()Z
      // 0e0: ifeq 0ef
      // 0e3: aload 5
      // 0e5: goto 0e9
      // 0e8: athrow
      // 0e9: invokevirtual net/minecraft/class_1309.method_31481 ()Z
      // 0ec: ifeq 0f1
      // 0ef: return
      // 0f0: athrow
      // 0f1: invokestatic java/lang/System.currentTimeMillis ()J
      // 0f4: lstore 6
      // 0f6: aload 0
      // 0f7: aload 0
      // 0f8: getfield qeaa361f143ee4a0894bd168fd9b30c66/qf4ccf8f5435d4a78bdca4d6a018b578e/aaababaa.aa Lqeaa361f143ee4a0894bd168fd9b30c66/qf4ccf8f5435d4a78bdca4d6a018b578e/aaabbbab;
      // 0fb: invokevirtual qeaa361f143ee4a0894bd168fd9b30c66/qf4ccf8f5435d4a78bdca4d6a018b578e/aaababaa.bbb (Lqeaa361f143ee4a0894bd168fd9b30c66/qf4ccf8f5435d4a78bdca4d6a018b578e/aaabbbab;)J
      // 0fe: lstore 8
      // 100: aload 0
      // 101: lload 6
      // 103: lload 8
      // 105: ladd
      // 106: putfield qeaa361f143ee4a0894bd168fd9b30c66/qf4ccf8f5435d4a78bdca4d6a018b578e/aaababaa.baa J
      // 109: aload 0
      // 10a: aload 3
      // 10b: getfield net/minecraft/class_310.field_1724 Lnet/minecraft/class_746;
      // 10e: getfield net/minecraft/class_746.field_6012 I
      // 111: lload 8
      // 113: iload 2
      // 114: ifne 127
      // 117: lconst_0
      // 118: lcmp
      // 119: ifgt 125
      // 11c: goto 120
      // 11f: athrow
      // 120: bipush 0
      // 121: goto 130
      // 124: athrow
      // 125: lload 8
      // 127: l2d
      // 128: ldc2_w 50.0
      // 12b: ddiv
      // 12c: invokestatic java/lang/Math.ceil (D)D
      // 12f: d2i
      // 130: iadd
      // 131: putfield qeaa361f143ee4a0894bd168fd9b30c66/qf4ccf8f5435d4a78bdca4d6a018b578e/aaababaa.bab I
      // 134: lconst_1
      // 135: aload 0
      // 136: aload 0
      // 137: getfield qeaa361f143ee4a0894bd168fd9b30c66/qf4ccf8f5435d4a78bdca4d6a018b578e/aaababaa.abb Lqeaa361f143ee4a0894bd168fd9b30c66/qf4ccf8f5435d4a78bdca4d6a018b578e/aaabbbab;
      // 13a: invokevirtual qeaa361f143ee4a0894bd168fd9b30c66/qf4ccf8f5435d4a78bdca4d6a018b578e/aaababaa.bbb (Lqeaa361f143ee4a0894bd168fd9b30c66/qf4ccf8f5435d4a78bdca4d6a018b578e/aaabbbab;)J
      // 13d: invokestatic java/lang/Math.max (JJ)J
      // 140: lstore 10
      // 142: aload 0
      // 143: aload 0
      // 144: getfield qeaa361f143ee4a0894bd168fd9b30c66/qf4ccf8f5435d4a78bdca4d6a018b578e/aaababaa.baa J
      // 147: lload 10
      // 149: ladd
      // 14a: putfield qeaa361f143ee4a0894bd168fd9b30c66/qf4ccf8f5435d4a78bdca4d6a018b578e/aaababaa.aaab J
      // 14d: aload 0
      // 14e: aload 0
      // 14f: getfield qeaa361f143ee4a0894bd168fd9b30c66/qf4ccf8f5435d4a78bdca4d6a018b578e/aaababaa.bab I
      // 152: bipush 2
      // 153: lload 10
      // 155: l2d
      // 156: ldc2_w 50.0
      // 159: ddiv
      // 15a: invokestatic java/lang/Math.ceil (D)D
      // 15d: d2i
      // 15e: invokestatic java/lang/Math.max (II)I
      // 161: iadd
      // 162: putfield qeaa361f143ee4a0894bd168fd9b30c66/qf4ccf8f5435d4a78bdca4d6a018b578e/aaababaa.ab I
      // 165: aload 0
      // 166: bipush 0
      // 167: putfield qeaa361f143ee4a0894bd168fd9b30c66/qf4ccf8f5435d4a78bdca4d6a018b578e/aaababaa.aab Z
      // 16a: aload 0
      // 16b: lload 8
      // 16d: lconst_0
      // 16e: lcmp
      // 16f: ifgt 179
      // 172: getstatic qeaa361f143ee4a0894bd168fd9b30c66/qf4ccf8f5435d4a78bdca4d6a018b578e/abababa.ab Lqeaa361f143ee4a0894bd168fd9b30c66/qf4ccf8f5435d4a78bdca4d6a018b578e/abababa;
      // 175: goto 17c
      // 178: athrow
      // 179: getstatic qeaa361f143ee4a0894bd168fd9b30c66/qf4ccf8f5435d4a78bdca4d6a018b578e/abababa.aa Lqeaa361f143ee4a0894bd168fd9b30c66/qf4ccf8f5435d4a78bdca4d6a018b578e/abababa;
      // 17c: putfield qeaa361f143ee4a0894bd168fd9b30c66/qf4ccf8f5435d4a78bdca4d6a018b578e/aaababaa.aaaa Lqeaa361f143ee4a0894bd168fd9b30c66/qf4ccf8f5435d4a78bdca4d6a018b578e/abababa;
      // 17f: aload 0
      // 180: getfield qeaa361f143ee4a0894bd168fd9b30c66/qf4ccf8f5435d4a78bdca4d6a018b578e/aaababaa.aaaa Lqeaa361f143ee4a0894bd168fd9b30c66/qf4ccf8f5435d4a78bdca4d6a018b578e/abababa;
      // 183: getstatic qeaa361f143ee4a0894bd168fd9b30c66/qf4ccf8f5435d4a78bdca4d6a018b578e/abababa.ab Lqeaa361f143ee4a0894bd168fd9b30c66/qf4ccf8f5435d4a78bdca4d6a018b578e/abababa;
      // 186: if_acmpne 1a9
      // 189: invokestatic qeaa361f143ee4a0894bd168fd9b30c66/qf4ccf8f5435d4a78bdca4d6a018b578e/bbabbbb.aaabb ()Z
      // 18c: ifne 1a4
      // 18f: goto 193
      // 192: athrow
      // 193: aload 3
      // 194: getfield net/minecraft/class_310.field_1724 Lnet/minecraft/class_746;
      // 197: bipush 0
      // 198: invokevirtual net/minecraft/class_746.method_5728 (Z)V
      // 19b: aload 0
      // 19c: bipush 1
      // 19d: putfield qeaa361f143ee4a0894bd168fd9b30c66/qf4ccf8f5435d4a78bdca4d6a018b578e/aaababaa.aab Z
      // 1a0: goto 1a4
      // 1a3: athrow
      // 1a4: aload 0
      // 1a5: aload 3
      // 1a6: invokevirtual qeaa361f143ee4a0894bd168fd9b30c66/qf4ccf8f5435d4a78bdca4d6a018b578e/aaababaa.aabb (Lnet/minecraft/class_310;)V
      // 1a9: return
   }

   @Override
   public void aabaa() {
      class_310 var1 = class_310.method_1551();
      this.ba(var1);
   }

   @Override
   public void bbaabb(class_310 param1) {
      // $VF: Couldn't be decompiled
      // Please report this to the Vineflower issue tracker, at https://github.com/Vineflower/vineflower/issues with a copy of the class file (if you have the rights to distribute it!)
      // java.lang.RuntimeException: parsing failure!
      //   at org.jetbrains.java.decompiler.modules.decompiler.decompose.DomHelper.parseGraph(DomHelper.java:211)
      //   at org.jetbrains.java.decompiler.main.rels.MethodProcessor.codeToJava(MethodProcessor.java:166)
      //
      // Bytecode:
      // 00: getstatic qeaa361f143ee4a0894bd168fd9b30c66/qf4ccf8f5435d4a78bdca4d6a018b578e/baaabbaa.bba I
      // 03: istore 2
      // 04: aload 1
      // 05: iload 2
      // 06: ifne 11
      // 09: ifnull 38
      // 0c: goto 10
      // 0f: athrow
      // 10: aload 1
      // 11: iload 2
      // 12: ifne 24
      // 15: getfield net/minecraft/class_310.field_1724 Lnet/minecraft/class_746;
      // 18: ifnull 38
      // 1b: goto 1f
      // 1e: athrow
      // 1f: aload 1
      // 20: goto 24
      // 23: athrow
      // 24: getfield net/minecraft/class_310.field_1690 Lnet/minecraft/class_315;
      // 27: ifnull 38
      // 2a: aload 0
      // 2b: getfield qeaa361f143ee4a0894bd168fd9b30c66/qf4ccf8f5435d4a78bdca4d6a018b578e/aaababaa.aaaa Lqeaa361f143ee4a0894bd168fd9b30c66/qf4ccf8f5435d4a78bdca4d6a018b578e/abababa;
      // 2e: getstatic qeaa361f143ee4a0894bd168fd9b30c66/qf4ccf8f5435d4a78bdca4d6a018b578e/abababa.a Lqeaa361f143ee4a0894bd168fd9b30c66/qf4ccf8f5435d4a78bdca4d6a018b578e/abababa;
      // 31: if_acmpne 3a
      // 34: goto 38
      // 37: athrow
      // 38: return
      // 39: athrow
      // 3a: invokestatic java/lang/System.currentTimeMillis ()J
      // 3d: lstore 3
      // 3e: aload 0
      // 3f: iload 2
      // 40: ifne 83
      // 43: getfield qeaa361f143ee4a0894bd168fd9b30c66/qf4ccf8f5435d4a78bdca4d6a018b578e/aaababaa.aaaa Lqeaa361f143ee4a0894bd168fd9b30c66/qf4ccf8f5435d4a78bdca4d6a018b578e/abababa;
      // 46: getstatic qeaa361f143ee4a0894bd168fd9b30c66/qf4ccf8f5435d4a78bdca4d6a018b578e/abababa.aa Lqeaa361f143ee4a0894bd168fd9b30c66/qf4ccf8f5435d4a78bdca4d6a018b578e/abababa;
      // 49: if_acmpne 7e
      // 4c: goto 50
      // 4f: athrow
      // 50: lload 3
      // 51: aload 0
      // 52: getfield qeaa361f143ee4a0894bd168fd9b30c66/qf4ccf8f5435d4a78bdca4d6a018b578e/aaababaa.baa J
      // 55: lcmp
      // 56: iflt d9
      // 59: goto 5d
      // 5c: athrow
      // 5d: aload 0
      // 5e: getstatic qeaa361f143ee4a0894bd168fd9b30c66/qf4ccf8f5435d4a78bdca4d6a018b578e/abababa.ab Lqeaa361f143ee4a0894bd168fd9b30c66/qf4ccf8f5435d4a78bdca4d6a018b578e/abababa;
      // 61: putfield qeaa361f143ee4a0894bd168fd9b30c66/qf4ccf8f5435d4a78bdca4d6a018b578e/aaababaa.aaaa Lqeaa361f143ee4a0894bd168fd9b30c66/qf4ccf8f5435d4a78bdca4d6a018b578e/abababa;
      // 64: iload 2
      // 65: aload 0
      // 66: bipush 0
      // 67: putfield qeaa361f143ee4a0894bd168fd9b30c66/qf4ccf8f5435d4a78bdca4d6a018b578e/aaababaa.aab Z
      // 6a: aload 1
      // 6b: getfield net/minecraft/class_310.field_1724 Lnet/minecraft/class_746;
      // 6e: bipush 0
      // 6f: invokevirtual net/minecraft/class_746.method_5728 (Z)V
      // 72: aload 0
      // 73: aload 1
      // 74: invokevirtual qeaa361f143ee4a0894bd168fd9b30c66/qf4ccf8f5435d4a78bdca4d6a018b578e/aaababaa.aabb (Lnet/minecraft/class_310;)V
      // 77: ifeq d9
      // 7a: goto 7e
      // 7d: athrow
      // 7e: aload 0
      // 7f: goto 83
      // 82: athrow
      // 83: getfield qeaa361f143ee4a0894bd168fd9b30c66/qf4ccf8f5435d4a78bdca4d6a018b578e/aaababaa.aaaa Lqeaa361f143ee4a0894bd168fd9b30c66/qf4ccf8f5435d4a78bdca4d6a018b578e/abababa;
      // 86: getstatic qeaa361f143ee4a0894bd168fd9b30c66/qf4ccf8f5435d4a78bdca4d6a018b578e/abababa.ab Lqeaa361f143ee4a0894bd168fd9b30c66/qf4ccf8f5435d4a78bdca4d6a018b578e/abababa;
      // 89: if_acmpne d9
      // 8c: lload 3
      // 8d: aload 0
      // 8e: getfield qeaa361f143ee4a0894bd168fd9b30c66/qf4ccf8f5435d4a78bdca4d6a018b578e/aaababaa.aaab J
      // 91: lcmp
      // 92: iload 2
      // 93: ifne b4
      // 96: goto 9a
      // 99: athrow
      // 9a: iflt c8
      // 9d: goto a1
      // a0: athrow
      // a1: aload 1
      // a2: iload 2
      // a3: ifne cd
      // a6: goto aa
      // a9: athrow
      // aa: getfield net/minecraft/class_310.field_1724 Lnet/minecraft/class_746;
      // ad: getfield net/minecraft/class_746.field_6012 I
      // b0: goto b4
      // b3: athrow
      // b4: aload 0
      // b5: getfield qeaa361f143ee4a0894bd168fd9b30c66/qf4ccf8f5435d4a78bdca4d6a018b578e/aaababaa.ab I
      // b8: if_icmplt c8
      // bb: aload 0
      // bc: aload 1
      // bd: invokevirtual qeaa361f143ee4a0894bd168fd9b30c66/qf4ccf8f5435d4a78bdca4d6a018b578e/aaababaa.ba (Lnet/minecraft/class_310;)V
      // c0: iload 2
      // c1: ifeq d9
      // c4: goto c8
      // c7: athrow
      // c8: aload 1
      // c9: goto cd
      // cc: athrow
      // cd: getfield net/minecraft/class_310.field_1724 Lnet/minecraft/class_746;
      // d0: bipush 0
      // d1: invokevirtual net/minecraft/class_746.method_5728 (Z)V
      // d4: aload 0
      // d5: aload 1
      // d6: invokevirtual qeaa361f143ee4a0894bd168fd9b30c66/qf4ccf8f5435d4a78bdca4d6a018b578e/aaababaa.aabb (Lnet/minecraft/class_310;)V
      // d9: return
   }

   private static int a(int var0, int var1) {
      int var2 = abba[var0 ^ 1260142433] ^ var1 ^ var0;
      var2 += 22173;
      var2 ^= 51557;
      var2 -= 48306;
      var2 -= 30562;
      var2 ^= 18276;
      var2 -= 32101;
      return var2 + 20157;
   }

   @Override
   public void abbabab(class_1297 param1) {
      // $VF: Couldn't be decompiled
      // Please report this to the Vineflower issue tracker, at https://github.com/Vineflower/vineflower/issues with a copy of the class file (if you have the rights to distribute it!)
      // java.lang.RuntimeException: parsing failure!
      //   at org.jetbrains.java.decompiler.modules.decompiler.decompose.DomHelper.parseGraph(DomHelper.java:211)
      //   at org.jetbrains.java.decompiler.main.rels.MethodProcessor.codeToJava(MethodProcessor.java:166)
      //
      // Bytecode:
      // 00: aload 0
      // 01: invokevirtual qeaa361f143ee4a0894bd168fd9b30c66/qf4ccf8f5435d4a78bdca4d6a018b578e/aaababaa.bab ()V
      // 04: getstatic qeaa361f143ee4a0894bd168fd9b30c66/qf4ccf8f5435d4a78bdca4d6a018b578e/baaabbaa.bba I
      // 07: invokestatic net/minecraft/class_310.method_1551 ()Lnet/minecraft/class_310;
      // 0a: astore 3
      // 0b: istore 2
      // 0c: aload 0
      // 0d: iload 2
      // 0e: ifne 27
      // 11: aload 1
      // 12: putfield qeaa361f143ee4a0894bd168fd9b30c66/qf4ccf8f5435d4a78bdca4d6a018b578e/aaababaa.abaa Lnet/minecraft/class_1297;
      // 15: aload 0
      // 16: aload 3
      // 17: aload 1
      // 18: invokevirtual qeaa361f143ee4a0894bd168fd9b30c66/qf4ccf8f5435d4a78bdca4d6a018b578e/aaababaa.aaaa (Lnet/minecraft/class_310;Lnet/minecraft/class_1297;)Z
      // 1b: ifeq 2b
      // 1e: goto 22
      // 21: athrow
      // 22: aload 0
      // 23: goto 27
      // 26: athrow
      // 27: bipush 1
      // 28: putfield qeaa361f143ee4a0894bd168fd9b30c66/qf4ccf8f5435d4a78bdca4d6a018b578e/aaababaa.bba Z
      // 2b: return
   }

   private static String ab(int var0, int var1) {
      int var9 = -951744663;
      int var2 = (var0 ^ a(1260142433, var9 ^ -1762298339)) & a(1260142432, var9 ^ -298981193);
      if (bb[var2] == null) {
         char[] var3 = ba[var2].toCharArray();

         int var4 = switch (var3[0] & a(1260142435, var9 ^ -1312896225)) {
            case 0 -> a(1260142434, var9 ^ 1008150394);
            case 1 -> a(1260142437, var9 ^ 1646809660);
            case 2 -> a(1260142436, var9 ^ -330032848);
            case 3 -> a(1260142439, var9 ^ 1722923);
            case 4 -> a(1260142438, var9 ^ 1407863406);
            case 5 -> a(1260142441, var9 ^ -1943573521);
            case 6 -> a(1260142440, var9 ^ 1195982405);
            case 7 -> a(1260142443, var9 ^ 940849878);
            case 8 -> a(1260142442, var9 ^ 744482028);
            case 9 -> a(1260142445, var9 ^ 1933185906);
            case 10 -> a(1260142444, var9 ^ -675692396);
            case 11 -> a(1260142447, var9 ^ -133137970);
            case 12 -> a(1260142446, var9 ^ -250328127);
            case 13 -> a(1260142449, var9 ^ 887947489);
            case 14 -> a(1260142448, var9 ^ -1320762737);
            case 15 -> a(1260142451, var9 ^ 643054133);
            case 16 -> a(1260142450, var9 ^ 1427383808);
            case 17 -> a(1260142453, var9 ^ 2107012559);
            case 18 -> a(1260142452, var9 ^ 308107858);
            case 19 -> a(1260142455, var9 ^ 351455322);
            case 20 -> a(1260142454, var9 ^ 1167000631);
            case 21 -> a(1260142457, var9 ^ 136433221);
            case 22 -> a(1260142456, var9 ^ 1605631890);
            case 23 -> a(1260142459, var9 ^ 35581397);
            case 24 -> a(1260142458, var9 ^ 1220449034);
            case 25 -> a(1260142461, var9 ^ 1594858420);
            case 26 -> a(1260142460, var9 ^ -408375464);
            case 27 -> a(1260142463, var9 ^ -718159723);
            case 28 -> a(1260142462, var9 ^ 1912985817);
            case 29 -> a(1260142401, var9 ^ 595706681);
            case 30 -> a(1260142400, var9 ^ -76598442);
            case 31 -> a(1260142403, var9 ^ -1534902543);
            case 32 -> a(1260142402, var9 ^ 552743390);
            case 33 -> a(1260142405, var9 ^ -1044303550);
            case 34 -> a(1260142404, var9 ^ 1782872924);
            case 35 -> a(1260142407, var9 ^ -215556552);
            case 36 -> a(1260142406, var9 ^ -704042177);
            case 37 -> a(1260142409, var9 ^ -481505389);
            case 38 -> a(1260142408, var9 ^ 1721825655);
            case 39 -> a(1260142411, var9 ^ 990859021);
            case 40 -> a(1260142410, var9 ^ 373200253);
            case 41 -> a(1260142413, var9 ^ 1345919169);
            case 42 -> a(1260142412, var9 ^ -843738562);
            case 43 -> a(1260142415, var9 ^ -2141260687);
            case 44 -> a(1260142414, var9 ^ -755496438);
            case 45 -> a(1260142417, var9 ^ -1398030468);
            case 46 -> a(1260142416, var9 ^ -1479433410);
            case 47 -> a(1260142419, var9 ^ -1370113995);
            case 48 -> a(1260142418, var9 ^ 1163919797);
            case 49 -> a(1260142421, var9 ^ 1480791847);
            case 50 -> 0;
            case 51 -> a(1260142420, var9 ^ -333603172);
            case 52 -> a(1260142423, var9 ^ 1781484331);
            case 53 -> a(1260142422, var9 ^ -32917386);
            case 54 -> a(1260142425, var9 ^ 1316129960);
            case 55 -> a(1260142424, var9 ^ 1707190658);
            case 56 -> a(1260142427, var9 ^ -84984428);
            case 57 -> a(1260142426, var9 ^ -1344530311);
            case 58 -> a(1260142429, var9 ^ -1379698441);
            case 59 -> a(1260142428, var9 ^ 1642952986);
            case 60 -> a(1260142431, var9 ^ -908389990);
            case 61 -> a(1260142430, var9 ^ -450361476);
            case 62 -> a(1260142369, var9 ^ -824538047);
            case 63 -> a(1260142368, var9 ^ 473940821);
            case 64 -> a(1260142371, var9 ^ 1144292137);
            case 65 -> a(1260142370, var9 ^ 1372536931);
            case 66 -> a(1260142373, var9 ^ -699969959);
            case 67 -> a(1260142372, var9 ^ 1341080746);
            case 68 -> a(1260142375, var9 ^ 1203444659);
            case 69 -> a(1260142374, var9 ^ -537494585);
            case 70 -> a(1260142377, var9 ^ 1733362967);
            case 71 -> a(1260142376, var9 ^ 743415023);
            case 72 -> a(1260142379, var9 ^ -1453962496);
            case 73 -> a(1260142378, var9 ^ 2088982220);
            case 74 -> a(1260142381, var9 ^ -1067426985);
            case 75 -> a(1260142380, var9 ^ -253434306);
            case 76 -> a(1260142383, var9 ^ 2135853487);
            case 77 -> a(1260142382, var9 ^ 580882278);
            case 78 -> a(1260142385, var9 ^ 1002651347);
            case 79 -> a(1260142384, var9 ^ 1237211991);
            case 80 -> a(1260142387, var9 ^ -1952597828);
            case 81 -> a(1260142386, var9 ^ -1376749079);
            case 82 -> a(1260142389, var9 ^ 281794294);
            case 83 -> a(1260142388, var9 ^ -408576764);
            case 84 -> a(1260142391, var9 ^ 678246317);
            case 85 -> a(1260142390, var9 ^ -229139358);
            case 86 -> 5;
            case 87 -> a(1260142393, var9 ^ -1567022370);
            case 88 -> a(1260142392, var9 ^ -298183854);
            case 89 -> a(1260142395, var9 ^ -1068416370);
            case 90 -> a(1260142394, var9 ^ -1512119162);
            case 91 -> a(1260142397, var9 ^ 1510055117);
            case 92 -> a(1260142396, var9 ^ -903810);
            case 93 -> a(1260142399, var9 ^ 923826024);
            case 94 -> a(1260142398, var9 ^ -370565381);
            case 95 -> a(1260142337, var9 ^ -2074757251);
            case 96 -> a(1260142336, var9 ^ -93526475);
            case 97 -> a(1260142339, var9 ^ -2024407041);
            case 98 -> a(1260142338, var9 ^ 113495847);
            case 99 -> a(1260142341, var9 ^ -933387531);
            case 100 -> 3;
            case 101 -> a(1260142340, var9 ^ 1584219886);
            case 102 -> a(1260142343, var9 ^ 248509078);
            case 103 -> a(1260142342, var9 ^ 1571927084);
            case 104 -> a(1260142345, var9 ^ -722689621);
            case 105 -> a(1260142344, var9 ^ 278077142);
            case 106 -> a(1260142347, var9 ^ -1036974761);
            case 107 -> a(1260142346, var9 ^ 1843789686);
            case 108 -> a(1260142349, var9 ^ -168786402);
            case 109 -> a(1260142348, var9 ^ 415126856);
            case 110 -> a(1260142351, var9 ^ -1963951271);
            case 111 -> a(1260142350, var9 ^ 454802036);
            case 112 -> a(1260142353, var9 ^ 1759474596);
            case 113 -> a(1260142352, var9 ^ 419529546);
            case 114 -> a(1260142355, var9 ^ -806704866);
            case 115 -> a(1260142354, var9 ^ -924912550);
            case 116 -> a(1260142357, var9 ^ -1675611924);
            case 117 -> a(1260142356, var9 ^ -1145632845);
            case 118 -> a(1260142359, var9 ^ 225113544);
            case 119 -> a(1260142358, var9 ^ -1231786873);
            case 120 -> a(1260142361, var9 ^ -1330223844);
            case 121 -> a(1260142360, var9 ^ 1210696000);
            case 122 -> a(1260142363, var9 ^ -629586585);
            case 123 -> a(1260142362, var9 ^ -402810409);
            case 124 -> a(1260142365, var9 ^ -1168547311);
            case 125 -> a(1260142364, var9 ^ -392047141);
            case 126 -> a(1260142367, var9 ^ 1388008337);
            case 127 -> a(1260142366, var9 ^ -707408016);
            case 128 -> a(1260142561, var9 ^ 1485742981);
            case 129 -> a(1260142560, var9 ^ -1737922412);
            case 130 -> a(1260142563, var9 ^ 1743054246);
            case 131 -> 1;
            case 132 -> a(1260142562, var9 ^ -1538047537);
            case 133 -> a(1260142565, var9 ^ -950416222);
            case 134 -> a(1260142564, var9 ^ -550578624);
            case 135 -> a(1260142567, var9 ^ -1179771516);
            case 136 -> a(1260142566, var9 ^ -1506295147);
            case 137 -> a(1260142569, var9 ^ 320736008);
            case 138 -> a(1260142568, var9 ^ 768910779);
            case 139 -> a(1260142571, var9 ^ -1615343459);
            case 140 -> a(1260142570, var9 ^ -870452247);
            case 141 -> a(1260142573, var9 ^ -220256485);
            case 142 -> a(1260142572, var9 ^ -1270110362);
            case 143 -> a(1260142575, var9 ^ -1118920884);
            case 144 -> a(1260142574, var9 ^ -564439454);
            case 145 -> a(1260142577, var9 ^ 1166645149);
            case 146 -> a(1260142576, var9 ^ -475119691);
            case 147 -> a(1260142579, var9 ^ 1351032411);
            case 148 -> a(1260142578, var9 ^ -817879245);
            case 149 -> a(1260142581, var9 ^ -881988219);
            case 150 -> a(1260142580, var9 ^ 1285814724);
            case 151 -> a(1260142583, var9 ^ -2109663223);
            case 152 -> a(1260142582, var9 ^ 1750704576);
            case 153 -> a(1260142585, var9 ^ 1078320737);
            case 154 -> a(1260142584, var9 ^ 1816264248);
            case 155 -> a(1260142587, var9 ^ -925716900);
            case 156 -> a(1260142586, var9 ^ 1503313063);
            case 157 -> a(1260142589, var9 ^ 1370640022);
            case 158 -> a(1260142588, var9 ^ -682673345);
            case 159 -> a(1260142591, var9 ^ -1527021992);
            case 160 -> a(1260142590, var9 ^ 1062215308);
            case 161 -> a(1260142529, var9 ^ 477925545);
            case 162 -> a(1260142528, var9 ^ -1164327749);
            case 163 -> a(1260142531, var9 ^ -1751581048);
            case 164 -> a(1260142530, var9 ^ -134889444);
            case 165 -> a(1260142533, var9 ^ 1856763843);
            case 166 -> a(1260142532, var9 ^ 1095418301);
            case 167 -> a(1260142535, var9 ^ 598415188);
            case 168 -> a(1260142534, var9 ^ -1288189404);
            case 169 -> a(1260142537, var9 ^ 250085917);
            case 170 -> a(1260142536, var9 ^ 736187460);
            case 171 -> a(1260142539, var9 ^ 1782821503);
            case 172 -> a(1260142538, var9 ^ 1634341758);
            case 173 -> a(1260142541, var9 ^ 1123499166);
            case 174 -> a(1260142540, var9 ^ 1194107202);
            case 175 -> a(1260142543, var9 ^ 759047392);
            case 176 -> a(1260142542, var9 ^ -1549640393);
            case 177 -> a(1260142545, var9 ^ -2035652783);
            case 178 -> 2;
            case 179 -> a(1260142544, var9 ^ -1761613832);
            case 180 -> a(1260142547, var9 ^ 1884602488);
            case 181 -> a(1260142546, var9 ^ -871831207);
            case 182 -> a(1260142549, var9 ^ 330869737);
            case 183 -> a(1260142548, var9 ^ -1636919725);
            case 184 -> a(1260142551, var9 ^ -1641991135);
            case 185 -> a(1260142550, var9 ^ -1447789281);
            case 186 -> a(1260142553, var9 ^ 1207687259);
            case 187 -> a(1260142552, var9 ^ -959294377);
            case 188 -> a(1260142555, var9 ^ 254969578);
            case 189 -> a(1260142554, var9 ^ 1102126815);
            case 190 -> a(1260142557, var9 ^ -519220758);
            case 191 -> a(1260142556, var9 ^ 1740724686);
            case 192 -> a(1260142559, var9 ^ -494952301);
            case 193 -> a(1260142558, var9 ^ 761736320);
            case 194 -> a(1260142497, var9 ^ -258546643);
            case 195 -> 4;
            case 196 -> a(1260142496, var9 ^ -371228276);
            case 197 -> a(1260142499, var9 ^ 1639575398);
            case 198 -> a(1260142498, var9 ^ -1627433324);
            case 199 -> a(1260142501, var9 ^ -1488678319);
            case 200 -> a(1260142500, var9 ^ 563104412);
            case 201 -> a(1260142503, var9 ^ 902053666);
            case 202 -> a(1260142502, var9 ^ -1133259906);
            case 203 -> a(1260142505, var9 ^ 504836592);
            case 204 -> a(1260142504, var9 ^ -40988495);
            case 205 -> a(1260142507, var9 ^ -1319101142);
            case 206 -> a(1260142506, var9 ^ 1356509984);
            case 207 -> a(1260142509, var9 ^ -1945941217);
            case 208 -> a(1260142508, var9 ^ -573269495);
            case 209 -> a(1260142511, var9 ^ -1257205282);
            case 210 -> a(1260142510, var9 ^ 1726221648);
            case 211 -> a(1260142513, var9 ^ -517777690);
            case 212 -> a(1260142512, var9 ^ -1735970794);
            case 213 -> a(1260142515, var9 ^ 704931176);
            case 214 -> a(1260142514, var9 ^ 1093617903);
            case 215 -> a(1260142517, var9 ^ -1758893733);
            case 216 -> a(1260142516, var9 ^ -1583827953);
            case 217 -> a(1260142519, var9 ^ 822656516);
            case 218 -> a(1260142518, var9 ^ 1347156304);
            case 219 -> a(1260142521, var9 ^ -632425635);
            case 220 -> a(1260142520, var9 ^ -1025701045);
            case 221 -> a(1260142523, var9 ^ 135110587);
            case 222 -> a(1260142522, var9 ^ 944818539);
            case 223 -> a(1260142525, var9 ^ 622700398);
            case 224 -> a(1260142524, var9 ^ -565275162);
            case 225 -> a(1260142527, var9 ^ -433405733);
            case 226 -> a(1260142526, var9 ^ -263262618);
            case 227 -> a(1260142465, var9 ^ 304417591);
            case 228 -> a(1260142464, var9 ^ 568813866);
            case 229 -> a(1260142467, var9 ^ 980940023);
            case 230 -> a(1260142466, var9 ^ -846665058);
            case 231 -> a(1260142469, var9 ^ -398814701);
            case 232 -> a(1260142468, var9 ^ 1867995847);
            case 233 -> a(1260142471, var9 ^ 509909092);
            case 234 -> a(1260142470, var9 ^ 1047366440);
            case 235 -> a(1260142473, var9 ^ 405758063);
            case 236 -> a(1260142472, var9 ^ 40647861);
            case 237 -> a(1260142475, var9 ^ -2100358920);
            case 238 -> a(1260142474, var9 ^ -500909548);
            case 239 -> a(1260142477, var9 ^ 928669018);
            case 240 -> a(1260142476, var9 ^ 155176335);
            case 241 -> a(1260142479, var9 ^ -986152771);
            case 242 -> a(1260142478, var9 ^ -1967541335);
            case 243 -> a(1260142481, var9 ^ 156623165);
            case 244 -> a(1260142480, var9 ^ -1710400055);
            case 245 -> a(1260142483, var9 ^ 624625341);
            case 246 -> a(1260142482, var9 ^ -1396982989);
            case 247 -> a(1260142485, var9 ^ -906194832);
            case 248 -> a(1260142484, var9 ^ 1797070764);
            case 249 -> a(1260142487, var9 ^ 884244390);
            case 250 -> a(1260142486, var9 ^ 1098416045);
            case 251 -> a(1260142489, var9 ^ -1323577220);
            case 252 -> a(1260142488, var9 ^ 1109816119);
            case 253 -> a(1260142491, var9 ^ -278239246);
            case 254 -> a(1260142490, var9 ^ 971312542);
            default -> a(1260142493, var9 ^ 2000370562);
         };
         int var5 = (var1 & a(1260142492, var9 ^ 1304256464)) - var4;
         if (var5 < 0) {
            var5 += 256;
         }

         int var6 = ((var1 & a(1260142495, var9 ^ -1403348138)) >>> a(1260142494, var9 ^ 1230689318)) - var4;
         if (var6 < 0) {
            var6 += 256;
         }

         for (int var7 = 0; var7 < var3.length; var7++) {
            int var8 = var7 % 2;
            char var10002 = var3[var7];
            if (var8 == 0) {
               var3[var7] = (char)(var10002 ^ var5);
               var5 = ((var5 >>> 3 | var5 << 5) ^ var3[var7]) & a(1260142177, var9 ^ 1749371454);
            } else {
               var3[var7] = (char)(var10002 ^ var6);
               var6 = ((var6 >>> 3 | var6 << 5) ^ var3[var7]) & a(1260142176, var9 ^ -383522808);
            }
         }

         bb[var2] = new String(var3).intern();
      }

      return bb[var2];
   }

   private void ba(class_310 param1) {
      // $VF: Couldn't be decompiled
      // Please report this to the Vineflower issue tracker, at https://github.com/Vineflower/vineflower/issues with a copy of the class file (if you have the rights to distribute it!)
      // java.lang.RuntimeException: parsing failure!
      //   at org.jetbrains.java.decompiler.modules.decompiler.decompose.DomHelper.parseGraph(DomHelper.java:211)
      //   at org.jetbrains.java.decompiler.main.rels.MethodProcessor.codeToJava(MethodProcessor.java:166)
      //
      // Bytecode:
      // 00: getstatic qeaa361f143ee4a0894bd168fd9b30c66/qf4ccf8f5435d4a78bdca4d6a018b578e/baaabbaa.bba I
      // 03: aload 0
      // 04: aload 1
      // 05: invokevirtual qeaa361f143ee4a0894bd168fd9b30c66/qf4ccf8f5435d4a78bdca4d6a018b578e/aaababaa.aaa (Lnet/minecraft/class_310;)V
      // 08: istore 2
      // 09: bipush 0
      // 0a: istore 3
      // 0b: iload 2
      // 0c: ifne 39
      // 0f: aload 0
      // 10: getfield qeaa361f143ee4a0894bd168fd9b30c66/qf4ccf8f5435d4a78bdca4d6a018b578e/aaababaa.aab Z
      // 13: ifeq 30
      // 16: goto 1a
      // 19: athrow
      // 1a: aload 0
      // 1b: iload 2
      // 1c: ifne 35
      // 1f: goto 23
      // 22: athrow
      // 23: aload 1
      // 24: invokevirtual qeaa361f143ee4a0894bd168fd9b30c66/qf4ccf8f5435d4a78bdca4d6a018b578e/aaababaa.bb (Lnet/minecraft/class_310;)Z
      // 27: ifeq 30
      // 2a: goto 2e
      // 2d: athrow
      // 2e: bipush 1
      // 2f: istore 3
      // 30: aload 0
      // 31: invokevirtual qeaa361f143ee4a0894bd168fd9b30c66/qf4ccf8f5435d4a78bdca4d6a018b578e/aaababaa.aab ()V
      // 34: aload 0
      // 35: iload 3
      // 36: putfield qeaa361f143ee4a0894bd168fd9b30c66/qf4ccf8f5435d4a78bdca4d6a018b578e/aaababaa.abab Z
      // 39: return
   }

   private boolean bb(class_310 param1) {
      // $VF: Couldn't be decompiled
      // Please report this to the Vineflower issue tracker, at https://github.com/Vineflower/vineflower/issues with a copy of the class file (if you have the rights to distribute it!)
      // java.lang.RuntimeException: parsing failure!
      //   at org.jetbrains.java.decompiler.modules.decompiler.decompose.DomHelper.parseGraph(DomHelper.java:211)
      //   at org.jetbrains.java.decompiler.main.rels.MethodProcessor.codeToJava(MethodProcessor.java:166)
      //
      // Bytecode:
      // 00: getstatic qeaa361f143ee4a0894bd168fd9b30c66/qf4ccf8f5435d4a78bdca4d6a018b578e/baaabbaa.bba I
      // 03: istore 2
      // 04: aload 1
      // 05: iload 2
      // 06: ifne 11
      // 09: ifnull c2
      // 0c: goto 10
      // 0f: athrow
      // 10: aload 1
      // 11: iload 2
      // 12: ifne 24
      // 15: getfield net/minecraft/class_310.field_1724 Lnet/minecraft/class_746;
      // 18: ifnull c2
      // 1b: goto 1f
      // 1e: athrow
      // 1f: aload 1
      // 20: goto 24
      // 23: athrow
      // 24: iload 2
      // 25: ifne 37
      // 28: getfield net/minecraft/class_310.field_1690 Lnet/minecraft/class_315;
      // 2b: ifnull c2
      // 2e: goto 32
      // 31: athrow
      // 32: aload 1
      // 33: goto 37
      // 36: athrow
      // 37: iload 2
      // 38: ifne 4a
      // 3b: getfield net/minecraft/class_310.field_1755 Lnet/minecraft/class_437;
      // 3e: ifnonnull c2
      // 41: goto 45
      // 44: athrow
      // 45: aload 1
      // 46: goto 4a
      // 49: athrow
      // 4a: aload 1
      // 4b: iload 2
      // 4c: ifne 86
      // 4f: getfield net/minecraft/class_310.field_1690 Lnet/minecraft/class_315;
      // 52: getfield net/minecraft/class_315.field_1894 Lnet/minecraft/class_304;
      // 55: invokestatic qeaa361f143ee4a0894bd168fd9b30c66/qf4ccf8f5435d4a78bdca4d6a018b578e/aabbabbbb.aaab (Lnet/minecraft/class_310;Lnet/minecraft/class_304;)Z
      // 58: ifne 78
      // 5b: goto 5f
      // 5e: athrow
      // 5f: aload 1
      // 60: iload 2
      // 61: ifne 7d
      // 64: goto 68
      // 67: athrow
      // 68: getfield net/minecraft/class_310.field_1690 Lnet/minecraft/class_315;
      // 6b: getfield net/minecraft/class_315.field_1894 Lnet/minecraft/class_304;
      // 6e: invokevirtual net/minecraft/class_304.method_1434 ()Z
      // 71: ifeq c2
      // 74: goto 78
      // 77: athrow
      // 78: aload 1
      // 79: goto 7d
      // 7c: athrow
      // 7d: iload 2
      // 7e: ifne 97
      // 81: aload 1
      // 82: goto 86
      // 85: athrow
      // 86: getfield net/minecraft/class_310.field_1690 Lnet/minecraft/class_315;
      // 89: getfield net/minecraft/class_315.field_1881 Lnet/minecraft/class_304;
      // 8c: invokestatic qeaa361f143ee4a0894bd168fd9b30c66/qf4ccf8f5435d4a78bdca4d6a018b578e/aabbabbbb.aaab (Lnet/minecraft/class_310;Lnet/minecraft/class_304;)Z
      // 8f: ifne c2
      // 92: aload 1
      // 93: goto 97
      // 96: athrow
      // 97: getfield net/minecraft/class_310.field_1724 Lnet/minecraft/class_746;
      // 9a: iload 2
      // 9b: ifne b0
      // 9e: invokevirtual net/minecraft/class_746.method_5715 ()Z
      // a1: ifne c2
      // a4: goto a8
      // a7: athrow
      // a8: aload 1
      // a9: getfield net/minecraft/class_310.field_1724 Lnet/minecraft/class_746;
      // ac: goto b0
      // af: athrow
      // b0: invokevirtual net/minecraft/class_746.method_6115 ()Z
      // b3: iload 2
      // b4: ifne bf
      // b7: ifne c2
      // ba: goto be
      // bd: athrow
      // be: bipush 1
      // bf: goto c3
      // c2: bipush 0
      // c3: ireturn
   }

   // $VF: Irreducible bytecode was duplicated to produce valid code
   static {
      int var26 = -376714255;
      short var15 = 1202;
      char[] var17 = "ЉҫҢҸ".toCharArray();
      String var16 = "顮飄頶顴颺飖颶飭颧飉飮颮飮飢顇颅顠類飆顎颺食頼飤飚顃頳颳頱頀頑飭颗飿顏飿顄飹飑颉顲飸飅顒顪頷飨飫飣飽頥飡頡颬颗频飥飤飭頩飊飰頫頛颉飸飙顿須飨飈顁颮颯頂飋頝颙頮颶頶顕颲頡顤飳頾颾頺飞顣颬颤顎頺飃颭颔飩风顛飵頷频顆顥頼頹頥顕顼飏飪頫頏顢頓颁飬飚顀领頮飔顱顨飮順颚頤顊飂颸颫頫頼飫飀飧顙颺颜顖飛颹颂颥顝飻頟顒頇頲顭飌顡颳飫頙颏飪飿颶頪飓顣飚飅顛飡颖页颣頫顉飔颉頩顤頁领飠颖颏颎颢頿酥酧酨酨釥釟釒醈釓鄥釵釆釄酔醽釷醞鄎醯酻酖鄮醴酥醏됱됺뒃뒧듳됷됕둀둻됉둤됶듂듕듋뒽\ue940\ue947\ue921\ue968\ue977\ue9c1\ue91c\ue9c0\ue949\ue9fb";
      byte var22 = -1;
      String[] var18 = new String[var17.length];

      while (true) {
         int var19 = 0;
         int var20 = 0;
         int var21 = 0;
         if (var22 == 0) {
            abbb = var18;
            baaa = new Object[var18.length];
            byte var30 = 0;
            int var10001 = 0;
            abba = new int[303];
            byte[] var10002 = "\u0088\u009a;BðC½\u001c¯Ñ\u009f·\"xrÂ|G\u0007.ò;L\u0086\u001eu\u001fNM\u0085\u001f¯\u0092H>öY&kÏ&{o\u009620±ÓmUFúÉÖ\u00956æ\u007f,Ìï{\u001fd*\u0082TZ¯)\u0096h8;o³K{sÔcù ë\f2\u000f\u008d\n\u009d\u009d®[àQ;\u0016N\u009bÇAÜª=\u001cq¸öVÑÆ¶A`ÍÔùÇúOË^\u0095®lj\u008d¯=î\u0096\u001bå\u0000f7ºìk]>\u009deTß®dMt+.£íI\u008bUÈf}lý#\u0099éxÏ¬M%`\u001aX\bQÀXNVMmÓÚÇ5\u009e1¡×Ì\u0097_\u0019²Äë¸¹¾öº°:íÏ[\u000fWõF,CôòrÈÒt@\u001e\u0000àfí\u0097P\u001dØ\u007f{®üÿä\u0080hJ±³MÒ³¬-B\u007f\u0082,\u0005×´GâûGRjÐµÙ\u0002\u0002P\u0096øZ[Ö¯O \u0015\u0091È(\u001bâQ\u0080\u0011ðYÔN\u0091Á\u0099.Ly>S'2 É\u0014·9\u001e bì\u0003JÞ\u000f\u000eÃî\u008b³ra!ÜÖ<ðÚÉ%¬hæWÑ\rt\u0095òí!³\u009f,\u0080\u000e¤\u0083\u0094ùÊÈA6\u0002bðì8ÈÎ¼öw\u001eðUF+Þ>\u0017Ð»±±ÄDnÉÎá\u009da\u009e)\u007f\"\u0007÷\u0086Èì\u009a:âÖä\u0003³\u0091\u0099:ªÜ\u0018¬\u009aVÖ2÷\r@\u0002\u0013¾\u0010 ¤\u009fCÞáÆÊ\u0083ôÖ\u000eüJRÜ^Pãs\u008a©lë\u009fÓ\u0091\u0006Ñ\u0000÷\u0094\u009f-B\u0005tï\u008av°&þ\u0007nÕhÑ\u0085ü\u0012Ö±¡\u0014\u0082Oe·¥ØS3\u0013\u0005¡F¨û:\u0080®Ù0åVF\u0095ÑÄ\u0016\u0010Âù\u0092Ìï¤67\u0006öÎ\u0080\u0088LÔ\u0006dËº\u009a\u008aFá÷º\u0086\u0006=\u00ady\u008b³~º<\u0017\tÙ6\u009aaÁA\u0083Ù§ÁH¬¸X\u0096ã\rq^%3»ð^\u0081Ø\u0085\u0017Òr¦Ïì°rGª$ò0£!Ê\u0016À4\u0003\u0006[æÃ÷ýÁj3NèH\u0090Ñ/rþÕ\u0002¸\u001eRÌ¬}\u009c.M\u0019v6ôP^*\u0088\u00adr.ª\u0001Ö½ûôGõèÏOÝ\u001a¦É n\nº\u0094+\u0013!?K\u0086\u0002\u0013Å³¤ö\u0091\u00ad\u0089÷«4é\u009a\u0095¥pÄ¢\u0007_%\u0094Z=ÄB~\u00adX\u009f\u0004\u0010\u0087V\u000b5\u008e\u0001\u0004t,ç\u0002\u007f\u0005FN\\\u0098i:YCô²3Qp¾½Í\bù\u0098Å2Ù\u0088\u0090²Dn;\u0095ÏÒg¼S\r×ý\u0012\u0080\u0001Ãà\u0080Na\u0083·Û(VY\u0094\u008d Ø½\u0001R\u0011]ÓH_ÞKîÿb\u0004«y®\u000f\u0005ü\u0010õã3\byãîù±{÷°×\u001c\u007fÖºm\u0080\u0090\u0000-¹+Äì?ÿ\u001f~+«j%¢\u001c\u00866\u0000xdtãáÅC¯\u000fH3Nµå\u009c\u0092l\u001eÚÃ»Ï\u0015«\u007fÇ]x\u008b[ÏÿL\u0003¤\u0086èe\u001a4k0\u009e_@\u001du\u0089F<-¿÷áù/gëìN$¯àÄ\"§wÜ²]Î\u0016bÊø&?\u009fØ;rò\u008dÀ!Á¦øE\u0095Çî!¸Ô\fJ^U?\u0088<æ$\u0018¡³Óç¾\u009böUÆiq8\u000fâ\u0000\u000bÍ# \u0002Þ\u00ad\u0006@4b\u001c\u0003h¥\u009c DîüKïÌ)5\b\u009e\u0017P\u009b\fÛWÔÌ\u0094Öæg\u0017:´y\u0084b\tÏ;TS2²Ôí\u008e×\u0093ÆßurI?*Û*±_\u0017*°¯t\u00854\\I&\u0017ñ\u00053æ'\u008aXöiTnéSÒ\u000b\u0087²4Î\u0002W5\u0082\u0096v*\u001f\u0094÷L½£~Z¡9\u001f)³dEÂx\rÔ\u0086®±¤\u009eØ%¶ò25^ÓZpâ\u0012Ì°E\u0010\u001b4Þ\u0099¶÷\u0092m¿\n\u0001)Ï1ô\tÍíï\u0010yQïÝ2×tñ/ðÿ>g\u00831Z\b(L\u0098U\u0000\u0007\n\u0091çÅtG*Å \u001a\u001a\u007f+\u0007½\u0014\u0010i7\u0018V\\\u008elÚÅ\rD¬^\u0096@Çé\u0014$´+\rYbMrW\u0093r\u0004\"¯Ò.Ù\u00153¥åÏ\u0001\u0085\u0086jA\u008d\u0083Ê-OðåÈ\u00831»±\u0089~â&p*(aYV[L/û\u0017Ë\u0082Q\u001e\u0018Ã5ßéÖ´+W¼"
               .getBytes("ISO-8859-1");

            int var67;
            do {
               abba[var30] = (
                     (var10002[var10001] & 255) << 24
                        | (var10002[var10001 + 1] & 255) << 16
                        | (var10002[var10001 + 2] & 255) << 8
                        | var10002[var10001 + 3] & 255
                  )
                  ^ -1841949769;
               var30 += 1;
               var67 = var10001 + 4;
               var10001 += 4;
            } while (var67 < var10002.length);

            String[] var13 = new String[a(1260142181, var26 ^ 1969447900)];
            int var11 = 0;
            String var10;
            int var12 = (var10 = abba(-1401533635, var26 ^ -179779285)).length();
            int var9 = a(1260142180, var26 ^ -467159341);
            int var28 = -1;

            label114:
            while (true) {
               String var31 = var10.substring(++var28, var28 + var9);
               var10001 = (byte)-1;

               while (true) {
                  label109: {
                     char[] var37 = var31.toCharArray();
                     var67 = var37.length;
                     int var14 = 0;
                     var54 = var37;
                     var10001 = var67;
                     char[] var71;
                     int var86;
                     if (var67 <= 1) {
                        var71 = var37;
                        var86 = var14;
                     } else {
                        var54 = var37;
                        var10001 = var67;
                        if (var67 <= var14) {
                           break label109;
                        }

                        var71 = var37;
                        var86 = var14;
                     }

                     while (true) {
                        var71[var86] = (char)(var71[var86] ^ switch (var14 % a(1260142182, var26 ^ -2041370104)) {
                           case 0 -> a(1260142185, var26 ^ 1852981963);
                           case 1 -> a(1260142184, var26 ^ -759966554);
                           case 2 -> a(1260142187, var26 ^ 1974535052);
                           case 3 -> a(1260142186, var26 ^ -298275098);
                           case 4 -> a(1260142189, var26 ^ -1563646112);
                           case 5 -> a(1260142188, var26 ^ 831051620);
                           default -> a(1260142191, var26 ^ -995568164);
                        });
                        var14++;
                        if (var10001 == 0) {
                           var86 = var10001;
                           var71 = var54;
                        } else {
                           if (var10001 <= var14) {
                              break;
                           }

                           var71 = var54;
                           var86 = var14;
                        }
                     }
                  }

                  String var78 = new String(var54).intern();
                  switch (var10001) {
                     case 0:
                        var13[var11++] = var78;
                        if ((var28 += var9) >= var12) {
                           ba = var13;
                           bb = new String[a(1260142183, var26 ^ -1807760394)];
                           long var0 = 4939924711261191847L;
                           long[] var6 = new long[2];
                           int var3 = 0;
                           String var4;
                           int var5 = (var4 = abba(-1401533633, var26 ^ -642199647)).length();
                           byte var2 = 0;

                           do {
                              int var44 = var2;
                              var2 += 8;
                              byte[] var7 = var4.substring(var44, var2).getBytes(abba(-1401533634, var26 ^ -2078555777));
                              var44 = var3++;
                              long var87 = (
                                    (var7[0] & 255L) << a(1260142190, var26 ^ -542023399)
                                       | (var7[1] & 255L) << a(1260142193, var26 ^ -545510664)
                                       | (var7[2] & 255L) << a(1260142192, var26 ^ 1146107862)
                                       | (var7[3] & 255L) << a(1260142195, var26 ^ -811630658)
                                       | (var7[4] & 255L) << a(1260142194, var26 ^ 33230940)
                                       | (var7[5] & 255L) << a(1260142197, var26 ^ 2084130507)
                                       | (var7[a(1260142196, var26 ^ 933988811)] & 255L) << a(1260142199, var26 ^ -170566421)
                                       | var7[a(1260142198, var26 ^ -184483273)] & 255L
                                 )
                                 ^ var0;
                              byte var79 = -1;
                              var6[var44] = var87;
                           } while (var2 < var5);

                           aaa = var6;
                           bbb = new Integer[2];
                           return;
                        }

                        var9 = var10.charAt(var28);
                        break;
                     default:
                        var13[var11++] = var78;
                        if ((var28 += var9) < var12) {
                           var9 = var10.charAt(var28);
                           continue label114;
                        }

                        var12 = (var10 = abba(-1401533636, var26 ^ -56234250)).length();
                        var9 = 4;
                        var28 = -1;
                  }

                  var31 = var10.substring(++var28, var28 + var9);
                  var10001 = (byte)0;
               }
            }
         }

         do {
            var21 = var17[var19] ^ var15;
            char[] var23 = var16.substring(var20, var20 + var21).toCharArray();
            int var24 = 0;

            do {
               short var25 = switch (var24 % 5) {
                  default -> 84;
                  case 1 -> 204;
                  case 2 -> 213;
                  case 3 -> 238;
                  case 4 -> 160;
               };
               var23[var24] = (char)(var23[var24] ^ var25);
            } while (++var24 < var23.length);

            var18[var19] = new String(var23).intern();
            var20 += var21;
         } while (++var19 < var17.length);

         var22 = 0;
      }
   }

   private void aaa(class_310 param1) {
      // $VF: Couldn't be decompiled
      // Please report this to the Vineflower issue tracker, at https://github.com/Vineflower/vineflower/issues with a copy of the class file (if you have the rights to distribute it!)
      // java.lang.RuntimeException: parsing failure!
      //   at org.jetbrains.java.decompiler.modules.decompiler.decompose.DomHelper.parseGraph(DomHelper.java:211)
      //   at org.jetbrains.java.decompiler.main.rels.MethodProcessor.codeToJava(MethodProcessor.java:166)
      //
      // Bytecode:
      // 00: getstatic qeaa361f143ee4a0894bd168fd9b30c66/qf4ccf8f5435d4a78bdca4d6a018b578e/baaabbaa.bba I
      // 03: istore 2
      // 04: aload 1
      // 05: iload 2
      // 06: ifne 11
      // 09: ifnull 17
      // 0c: goto 10
      // 0f: athrow
      // 10: aload 1
      // 11: getfield net/minecraft/class_310.field_1690 Lnet/minecraft/class_315;
      // 14: ifnonnull 19
      // 17: return
      // 18: athrow
      // 19: invokestatic qeaa361f143ee4a0894bd168fd9b30c66/qf4ccf8f5435d4a78bdca4d6a018b578e/aabbaabb.bab ()Lqeaa361f143ee4a0894bd168fd9b30c66/qf4ccf8f5435d4a78bdca4d6a018b578e/aabbaabb;
      // 1c: astore 3
      // 1d: iload 2
      // 1e: ifne 48
      // 21: aload 3
      // 22: ifnull 37
      // 25: goto 29
      // 28: athrow
      // 29: aload 3
      // 2a: aload 0
      // 2b: aload 1
      // 2c: invokevirtual qeaa361f143ee4a0894bd168fd9b30c66/qf4ccf8f5435d4a78bdca4d6a018b578e/aabbaabb.bba (Ljava/lang/Object;Lnet/minecraft/class_310;)V
      // 2f: iload 2
      // 30: ifeq 55
      // 33: goto 37
      // 36: athrow
      // 37: aload 0
      // 38: aload 1
      // 39: aconst_null
      // 3a: aload 1
      // 3b: getfield net/minecraft/class_310.field_1690 Lnet/minecraft/class_315;
      // 3e: getfield net/minecraft/class_315.field_1894 Lnet/minecraft/class_304;
      // 41: invokevirtual qeaa361f143ee4a0894bd168fd9b30c66/qf4ccf8f5435d4a78bdca4d6a018b578e/aaababaa.aba (Lnet/minecraft/class_310;Lqeaa361f143ee4a0894bd168fd9b30c66/qf4ccf8f5435d4a78bdca4d6a018b578e/aabbaabb;Lnet/minecraft/class_304;)V
      // 44: goto 48
      // 47: athrow
      // 48: aload 0
      // 49: aload 1
      // 4a: aconst_null
      // 4b: aload 1
      // 4c: getfield net/minecraft/class_310.field_1690 Lnet/minecraft/class_315;
      // 4f: getfield net/minecraft/class_315.field_1881 Lnet/minecraft/class_304;
      // 52: invokevirtual qeaa361f143ee4a0894bd168fd9b30c66/qf4ccf8f5435d4a78bdca4d6a018b578e/aaababaa.aba (Lnet/minecraft/class_310;Lqeaa361f143ee4a0894bd168fd9b30c66/qf4ccf8f5435d4a78bdca4d6a018b578e/aabbaabb;Lnet/minecraft/class_304;)V
      // 55: return
   }

   private void aab() {
      this.abab = false;
      this.aaaa = abababa.a;
      this.baa = 0L;
      this.aaab = 0L;
      this.bab = abaa(a(1260142179, -1104924586 ^ 425063543), 519640421834239871L);
      this.ab = abaa(a(1260142178, -1104924586 ^ 2015815211), 519640421834239871L);
      this.aab = false;
      this.bab();
   }

   private void aba(class_310 param1, aabbaabb param2, class_304 param3) {
      // $VF: Couldn't be decompiled
      // Please report this to the Vineflower issue tracker, at https://github.com/Vineflower/vineflower/issues with a copy of the class file (if you have the rights to distribute it!)
      // java.lang.NullPointerException: Cannot invoke "org.jetbrains.java.decompiler.code.cfg.ExceptionRangeCFG.isCircular()" because "range" is null
      //   at org.jetbrains.java.decompiler.modules.decompiler.decompose.DomHelper.graphToStatement(DomHelper.java:84)
      //   at org.jetbrains.java.decompiler.modules.decompiler.decompose.DomHelper.parseGraph(DomHelper.java:203)
      //   at org.jetbrains.java.decompiler.main.rels.MethodProcessor.codeToJava(MethodProcessor.java:166)
      //
      // Bytecode:
      // 00: getstatic qeaa361f143ee4a0894bd168fd9b30c66/qf4ccf8f5435d4a78bdca4d6a018b578e/baaabbaa.bba I
      // 03: istore 4
      // 05: aload 3
      // 06: ifnonnull 0b
      // 09: return
      // 0a: athrow
      // 0b: aload 2
      // 0c: iload 4
      // 0e: ifne 19
      // 11: ifnull 24
      // 14: goto 18
      // 17: athrow
      // 18: aload 2
      // 19: aload 0
      // 1a: aload 1
      // 1b: aload 3
      // 1c: invokevirtual qeaa361f143ee4a0894bd168fd9b30c66/qf4ccf8f5435d4a78bdca4d6a018b578e/aabbaabb.baa (Ljava/lang/Object;Lnet/minecraft/class_310;Lnet/minecraft/class_304;)V
      // 1f: iload 4
      // 21: ifeq 4f
      // 24: aload 3
      // 25: aload 1
      // 26: iload 4
      // 28: ifne 37
      // 2b: goto 2f
      // 2e: athrow
      // 2f: ifnull 4b
      // 32: goto 36
      // 35: athrow
      // 36: aload 1
      // 37: aload 3
      // 38: invokestatic qeaa361f143ee4a0894bd168fd9b30c66/qf4ccf8f5435d4a78bdca4d6a018b578e/aabbabbbb.aaab (Lnet/minecraft/class_310;Lnet/minecraft/class_304;)Z
      // 3b: iload 4
      // 3d: ifne 48
      // 40: ifeq 4b
      // 43: goto 47
      // 46: athrow
      // 47: bipush 1
      // 48: goto 4c
      // 4b: bipush 0
      // 4c: invokevirtual net/minecraft/class_304.method_23481 (Z)V
      // 4f: return
   }

   public boolean abb() {
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
      // 09: invokevirtual qeaa361f143ee4a0894bd168fd9b30c66/qf4ccf8f5435d4a78bdca4d6a018b578e/aaababaa.babbaab ()Z
      // 0c: ifeq 26
      // 0f: goto 13
      // 12: athrow
      // 13: aload 0
      // 14: goto 18
      // 17: athrow
      // 18: getfield qeaa361f143ee4a0894bd168fd9b30c66/qf4ccf8f5435d4a78bdca4d6a018b578e/aaababaa.aaaa Lqeaa361f143ee4a0894bd168fd9b30c66/qf4ccf8f5435d4a78bdca4d6a018b578e/abababa;
      // 1b: getstatic qeaa361f143ee4a0894bd168fd9b30c66/qf4ccf8f5435d4a78bdca4d6a018b578e/abababa.ab Lqeaa361f143ee4a0894bd168fd9b30c66/qf4ccf8f5435d4a78bdca4d6a018b578e/abababa;
      // 1e: if_acmpne 26
      // 21: bipush 1
      // 22: goto 27
      // 25: athrow
      // 26: bipush 0
      // 27: ireturn
   }

   private void bab() {
      this.abaa = null;
      this.bba = false;
   }

   // $VF: Handled exception range with multiple entry points by splitting it
   // $VF: Duplicated exception handlers to handle obfuscated exceptions
   private void bba(class_310 var1, aabbaabb var2, class_304 var3, boolean var4) {
      int var5 = baaabbaa.bba;

      try {
         if (var3 == null) {
            return;
         }
      } catch (MatchException var8) {
         throw var8;
      }

      label40: {
         label39: {
            aabbaabb var10000;
            label38: {
               try {
                  var10000 = var2;
                  if (var5 != 0) {
                     break label38;
                  }

                  if (var2 == null) {
                     break label39;
                  }
               } catch (MatchException var10) {
                  throw var10;
               }

               var10000 = var2;
            }

            try {
               var10000.ba(this, var1, var3, var4);
               if (var5 == 0) {
                  break label40;
               }
            } catch (MatchException var9) {
               throw var9;
            }
         }

         try {
            var3.method_23481(var4);
         } catch (MatchException var7) {
            throw var7;
         }
      }

      try {
         ;
      } catch (MatchException var6) {
         throw var6;
      }
   }

   private long bbb(aaabbbab var1) {
      double var2 = Math.min(var1.bab(), var1.abb());
      double var4 = Math.max(var1.bab(), var1.abb());

      try {
         if (var4 <= var2) {
            return Math.max(0L, Math.round(var2));
         }
      } catch (MatchException var6) {
         throw var6;
      }

      return Math.max(0L, Math.round(ThreadLocalRandom.current().nextDouble(var2, var4)));
   }

   private boolean aaaa(class_310 param1, class_1297 param2) {
      // $VF: Couldn't be decompiled
      // Please report this to the Vineflower issue tracker, at https://github.com/Vineflower/vineflower/issues with a copy of the class file (if you have the rights to distribute it!)
      // java.lang.RuntimeException: parsing failure!
      //   at org.jetbrains.java.decompiler.modules.decompiler.decompose.DomHelper.parseGraph(DomHelper.java:211)
      //   at org.jetbrains.java.decompiler.main.rels.MethodProcessor.codeToJava(MethodProcessor.java:166)
      //
      // Bytecode:
      // 00: getstatic qeaa361f143ee4a0894bd168fd9b30c66/qf4ccf8f5435d4a78bdca4d6a018b578e/baaabbaa.bba I
      // 03: istore 3
      // 04: aload 2
      // 05: iload 3
      // 06: ifne 18
      // 09: instanceof net/minecraft/class_1309
      // 0c: ifeq e6
      // 0f: goto 13
      // 12: athrow
      // 13: aload 2
      // 14: goto 18
      // 17: athrow
      // 18: checkcast net/minecraft/class_1309
      // 1b: astore 4
      // 1d: aload 1
      // 1e: iload 3
      // 1f: ifne 2a
      // 22: ifnull e6
      // 25: goto 29
      // 28: athrow
      // 29: aload 1
      // 2a: iload 3
      // 2b: ifne 3d
      // 2e: getfield net/minecraft/class_310.field_1724 Lnet/minecraft/class_746;
      // 31: ifnull e6
      // 34: goto 38
      // 37: athrow
      // 38: aload 1
      // 39: goto 3d
      // 3c: athrow
      // 3d: iload 3
      // 3e: ifne 50
      // 41: getfield net/minecraft/class_310.field_1690 Lnet/minecraft/class_315;
      // 44: ifnull e6
      // 47: goto 4b
      // 4a: athrow
      // 4b: aload 1
      // 4c: goto 50
      // 4f: athrow
      // 50: iload 3
      // 51: ifne 69
      // 54: getfield net/minecraft/class_310.field_1755 Lnet/minecraft/class_437;
      // 57: ifnonnull e6
      // 5a: goto 5e
      // 5d: athrow
      // 5e: aload 0
      // 5f: getfield qeaa361f143ee4a0894bd168fd9b30c66/qf4ccf8f5435d4a78bdca4d6a018b578e/aaababaa.aba Lqeaa361f143ee4a0894bd168fd9b30c66/qf4ccf8f5435d4a78bdca4d6a018b578e/abbaaaaa;
      // 62: invokevirtual qeaa361f143ee4a0894bd168fd9b30c66/qf4ccf8f5435d4a78bdca4d6a018b578e/abbaaaaa.abbb ()Ljava/lang/Object;
      // 65: goto 69
      // 68: athrow
      // 69: checkcast java/lang/Boolean
      // 6c: invokevirtual java/lang/Boolean.booleanValue ()Z
      // 6f: iload 3
      // 70: ifne 8d
      // 73: ifne 90
      // 76: goto 7a
      // 79: athrow
      // 7a: aload 1
      // 7b: getfield net/minecraft/class_310.field_1724 Lnet/minecraft/class_746;
      // 7e: iload 3
      // 7f: ifne 92
      // 82: goto 86
      // 85: athrow
      // 86: invokevirtual net/minecraft/class_746.method_24828 ()Z
      // 89: goto 8d
      // 8c: athrow
      // 8d: ifeq e6
      // 90: aload 4
      // 92: iload 3
      // 93: ifne ab
      // 96: aload 1
      // 97: getfield net/minecraft/class_310.field_1724 Lnet/minecraft/class_746;
      // 9a: if_acmpeq e6
      // 9d: goto a1
      // a0: athrow
      // a1: aload 4
      // a3: iload 3
      // a4: ifne b7
      // a7: goto ab
      // aa: athrow
      // ab: invokevirtual net/minecraft/class_1309.method_5805 ()Z
      // ae: ifeq e6
      // b1: aload 4
      // b3: goto b7
      // b6: athrow
      // b7: invokevirtual net/minecraft/class_1309.method_31481 ()Z
      // ba: iload 3
      // bb: ifne d0
      // be: ifne e6
      // c1: goto c5
      // c4: athrow
      // c5: aload 1
      // c6: getfield net/minecraft/class_310.field_1724 Lnet/minecraft/class_746;
      // c9: invokevirtual net/minecraft/class_746.method_5624 ()Z
      // cc: goto d0
      // cf: athrow
      // d0: ifne d3
      // d3: aload 0
      // d4: invokevirtual qeaa361f143ee4a0894bd168fd9b30c66/qf4ccf8f5435d4a78bdca4d6a018b578e/aaababaa.aa ()Z
      // d7: iload 3
      // d8: ifne e3
      // db: ifeq e6
      // de: goto e2
      // e1: athrow
      // e2: bipush 1
      // e3: goto e7
      // e6: bipush 0
      // e7: ireturn
   }

   @Override
   public String ababa() {
      return ((aabbbbb)this.aaba.abbb()).toString();
   }

   @Override
   public void bbaa() {
      // $VF: Couldn't be decompiled
      // Please report this to the Vineflower issue tracker, at https://github.com/Vineflower/vineflower/issues with a copy of the class file (if you have the rights to distribute it!)
      // java.lang.RuntimeException: parsing failure!
      //   at org.jetbrains.java.decompiler.modules.decompiler.decompose.DomHelper.parseGraph(DomHelper.java:211)
      //   at org.jetbrains.java.decompiler.main.rels.MethodProcessor.codeToJava(MethodProcessor.java:166)
      //
      // Bytecode:
      // 00: getstatic qeaa361f143ee4a0894bd168fd9b30c66/qf4ccf8f5435d4a78bdca4d6a018b578e/baaabbaa.bba I
      // 03: invokestatic net/minecraft/class_310.method_1551 ()Lnet/minecraft/class_310;
      // 06: astore 2
      // 07: istore 1
      // 08: aload 2
      // 09: iload 1
      // 0a: ifne 15
      // 0d: ifnull 3c
      // 10: goto 14
      // 13: athrow
      // 14: aload 2
      // 15: iload 1
      // 16: ifne 28
      // 19: getfield net/minecraft/class_310.field_1724 Lnet/minecraft/class_746;
      // 1c: ifnull 3c
      // 1f: goto 23
      // 22: athrow
      // 23: aload 2
      // 24: goto 28
      // 27: athrow
      // 28: getfield net/minecraft/class_310.field_1690 Lnet/minecraft/class_315;
      // 2b: ifnull 3c
      // 2e: aload 0
      // 2f: getfield qeaa361f143ee4a0894bd168fd9b30c66/qf4ccf8f5435d4a78bdca4d6a018b578e/aaababaa.aaaa Lqeaa361f143ee4a0894bd168fd9b30c66/qf4ccf8f5435d4a78bdca4d6a018b578e/abababa;
      // 32: getstatic qeaa361f143ee4a0894bd168fd9b30c66/qf4ccf8f5435d4a78bdca4d6a018b578e/abababa.a Lqeaa361f143ee4a0894bd168fd9b30c66/qf4ccf8f5435d4a78bdca4d6a018b578e/abababa;
      // 35: if_acmpne 3e
      // 38: goto 3c
      // 3b: athrow
      // 3c: return
      // 3d: athrow
      // 3e: invokestatic java/lang/System.currentTimeMillis ()J
      // 41: lstore 3
      // 42: aload 0
      // 43: iload 1
      // 44: ifne a9
      // 47: getfield qeaa361f143ee4a0894bd168fd9b30c66/qf4ccf8f5435d4a78bdca4d6a018b578e/aaababaa.aaaa Lqeaa361f143ee4a0894bd168fd9b30c66/qf4ccf8f5435d4a78bdca4d6a018b578e/abababa;
      // 4a: getstatic qeaa361f143ee4a0894bd168fd9b30c66/qf4ccf8f5435d4a78bdca4d6a018b578e/abababa.aa Lqeaa361f143ee4a0894bd168fd9b30c66/qf4ccf8f5435d4a78bdca4d6a018b578e/abababa;
      // 4d: if_acmpne a4
      // 50: goto 54
      // 53: athrow
      // 54: lload 3
      // 55: aload 0
      // 56: getfield qeaa361f143ee4a0894bd168fd9b30c66/qf4ccf8f5435d4a78bdca4d6a018b578e/aaababaa.baa J
      // 59: lcmp
      // 5a: iload 1
      // 5b: ifne 7c
      // 5e: goto 62
      // 61: athrow
      // 62: iflt ff
      // 65: goto 69
      // 68: athrow
      // 69: aload 2
      // 6a: iload 1
      // 6b: ifne 94
      // 6e: goto 72
      // 71: athrow
      // 72: getfield net/minecraft/class_310.field_1724 Lnet/minecraft/class_746;
      // 75: getfield net/minecraft/class_746.field_6012 I
      // 78: goto 7c
      // 7b: athrow
      // 7c: aload 0
      // 7d: getfield qeaa361f143ee4a0894bd168fd9b30c66/qf4ccf8f5435d4a78bdca4d6a018b578e/aaababaa.bab I
      // 80: if_icmplt ff
      // 83: aload 0
      // 84: getstatic qeaa361f143ee4a0894bd168fd9b30c66/qf4ccf8f5435d4a78bdca4d6a018b578e/abababa.ab Lqeaa361f143ee4a0894bd168fd9b30c66/qf4ccf8f5435d4a78bdca4d6a018b578e/abababa;
      // 87: putfield qeaa361f143ee4a0894bd168fd9b30c66/qf4ccf8f5435d4a78bdca4d6a018b578e/aaababaa.aaaa Lqeaa361f143ee4a0894bd168fd9b30c66/qf4ccf8f5435d4a78bdca4d6a018b578e/abababa;
      // 8a: aload 0
      // 8b: bipush 0
      // 8c: putfield qeaa361f143ee4a0894bd168fd9b30c66/qf4ccf8f5435d4a78bdca4d6a018b578e/aaababaa.aab Z
      // 8f: aload 2
      // 90: goto 94
      // 93: athrow
      // 94: getfield net/minecraft/class_310.field_1724 Lnet/minecraft/class_746;
      // 97: bipush 0
      // 98: invokevirtual net/minecraft/class_746.method_5728 (Z)V
      // 9b: iload 1
      // 9c: aload 0
      // 9d: aload 2
      // 9e: invokevirtual qeaa361f143ee4a0894bd168fd9b30c66/qf4ccf8f5435d4a78bdca4d6a018b578e/aaababaa.aabb (Lnet/minecraft/class_310;)V
      // a1: ifeq ff
      // a4: aload 0
      // a5: goto a9
      // a8: athrow
      // a9: getfield qeaa361f143ee4a0894bd168fd9b30c66/qf4ccf8f5435d4a78bdca4d6a018b578e/aaababaa.aaaa Lqeaa361f143ee4a0894bd168fd9b30c66/qf4ccf8f5435d4a78bdca4d6a018b578e/abababa;
      // ac: getstatic qeaa361f143ee4a0894bd168fd9b30c66/qf4ccf8f5435d4a78bdca4d6a018b578e/abababa.ab Lqeaa361f143ee4a0894bd168fd9b30c66/qf4ccf8f5435d4a78bdca4d6a018b578e/abababa;
      // af: if_acmpne ff
      // b2: lload 3
      // b3: aload 0
      // b4: getfield qeaa361f143ee4a0894bd168fd9b30c66/qf4ccf8f5435d4a78bdca4d6a018b578e/aaababaa.aaab J
      // b7: lcmp
      // b8: iload 1
      // b9: ifne da
      // bc: goto c0
      // bf: athrow
      // c0: iflt ee
      // c3: goto c7
      // c6: athrow
      // c7: aload 2
      // c8: iload 1
      // c9: ifne f3
      // cc: goto d0
      // cf: athrow
      // d0: getfield net/minecraft/class_310.field_1724 Lnet/minecraft/class_746;
      // d3: getfield net/minecraft/class_746.field_6012 I
      // d6: goto da
      // d9: athrow
      // da: aload 0
      // db: getfield qeaa361f143ee4a0894bd168fd9b30c66/qf4ccf8f5435d4a78bdca4d6a018b578e/aaababaa.ab I
      // de: if_icmplt ee
      // e1: aload 0
      // e2: aload 2
      // e3: invokevirtual qeaa361f143ee4a0894bd168fd9b30c66/qf4ccf8f5435d4a78bdca4d6a018b578e/aaababaa.ba (Lnet/minecraft/class_310;)V
      // e6: iload 1
      // e7: ifeq ff
      // ea: goto ee
      // ed: athrow
      // ee: aload 2
      // ef: goto f3
      // f2: athrow
      // f3: getfield net/minecraft/class_310.field_1724 Lnet/minecraft/class_746;
      // f6: bipush 0
      // f7: invokevirtual net/minecraft/class_746.method_5728 (Z)V
      // fa: aload 0
      // fb: aload 2
      // fc: invokevirtual qeaa361f143ee4a0894bd168fd9b30c66/qf4ccf8f5435d4a78bdca4d6a018b578e/aaababaa.aabb (Lnet/minecraft/class_310;)V
      // ff: return
   }

   public aaababaa() {
      int var1 = 1395341933;
      super(
         aabbaaaba.aaab(ab(a(1260142201, var1 ^ -181733751), a(1260142200, var1 ^ -1643099470))),
         bbaabbba.aaa,
         aabbaaaba.aaab(ab(a(1260142203, var1 ^ -1839747590), a(1260142202, var1 ^ -421861789)))
      );
      this.aaba = (baabaab)this.abbbaaa(
         new baabaab(
            aabbaaaba.aaab(ab(a(1260142205, var1 ^ -827478041), a(1260142204, var1 ^ -892865194))),
            aabbbbb.class,
            aabbbbb.b
         )
      );
      this.abb = (aaabbbab)this.abbbaaa(
         new aaabbbab(
               aabbaaaba.aaab(ab(a(1260142207, var1 ^ -1363813814), a(1260142206, var1 ^ -748604039))),
               100.0,
               150.0,
               20.0,
               500.0,
               5.0
            )
            .bbb(aabbaaaba.aaab(ab(a(1260142145, var1 ^ -577600692), a(1260142144, var1 ^ -1464875114))))
      );
      this.aa = (aaabbbab)this.abbbaaa(
         new aaabbbab(
               aabbaaaba.aaab(ab(a(1260142147, var1 ^ 1393869532), a(1260142146, var1 ^ 1875860226))),
               0.0,
               15.0,
               0.0,
               200.0,
               1.0
            )
            .bbb(aabbaaaba.aaab(ab(a(1260142149, var1 ^ 208384198), a(1260142148, var1 ^ 164235672))))
      );
      this.aba = (abbaaaaa)this.abbbaaa(
         new abbaaaaa(
            aabbaaaba.aaab(ab(a(1260142151, var1 ^ 2061777345), a(1260142150, var1 ^ -1145559484))), true
         )
      );
      this.aabb = (bababa)this.abbbaaa(
         new bababa(
               aabbaaaba.aaab(ab(a(1260142153, var1 ^ -186394878), a(1260142152, var1 ^ -1607898254))), 100.0, 0.0, 100.0, 1.0
            )
            .bba(aabbaaaba.aaab(ab(a(1260142155, var1 ^ -598033114), a(1260142154, var1 ^ 1897329802))))
      );
      this.aaaa = abababa.a;
      this.bab = abaa(a(1260142157, var1 ^ -618772391), 616328715370504637L);
      this.ab = abaa(a(1260142156, var1 ^ -1075857780), 519640421834239871L);
   }

   public aabbbbb aaab() {
      return (aabbbbb)this.aaba.abbb();
   }

   private void aaba(class_310 param1, class_744 param2) {
      // $VF: Couldn't be decompiled
      // Please report this to the Vineflower issue tracker, at https://github.com/Vineflower/vineflower/issues with a copy of the class file (if you have the rights to distribute it!)
      // java.lang.RuntimeException: parsing failure!
      //   at org.jetbrains.java.decompiler.modules.decompiler.decompose.DomHelper.parseGraph(DomHelper.java:211)
      //   at org.jetbrains.java.decompiler.main.rels.MethodProcessor.codeToJava(MethodProcessor.java:166)
      //
      // Bytecode:
      // 00: getstatic qeaa361f143ee4a0894bd168fd9b30c66/qf4ccf8f5435d4a78bdca4d6a018b578e/baaabbaa.bba I
      // 03: istore 3
      // 04: aload 0
      // 05: iload 3
      // 06: ifne 16
      // 09: getfield qeaa361f143ee4a0894bd168fd9b30c66/qf4ccf8f5435d4a78bdca4d6a018b578e/aaababaa.abab Z
      // 0c: ifne 15
      // 0f: goto 13
      // 12: athrow
      // 13: return
      // 14: athrow
      // 15: aload 0
      // 16: bipush 0
      // 17: putfield qeaa361f143ee4a0894bd168fd9b30c66/qf4ccf8f5435d4a78bdca4d6a018b578e/aaababaa.abab Z
      // 1a: aload 1
      // 1b: iload 3
      // 1c: ifne 27
      // 1f: ifnull 5a
      // 22: goto 26
      // 25: athrow
      // 26: aload 1
      // 27: getfield net/minecraft/class_310.field_1724 Lnet/minecraft/class_746;
      // 2a: ifnull 5a
      // 2d: aload 2
      // 2e: iload 3
      // 2f: ifne 3e
      // 32: goto 36
      // 35: athrow
      // 36: ifnull 5a
      // 39: goto 3d
      // 3c: athrow
      // 3d: aload 2
      // 3e: getfield net/minecraft/class_744.field_54155 Lnet/minecraft/class_10185;
      // 41: ifnull 5a
      // 44: aload 1
      // 45: getfield net/minecraft/class_310.field_1755 Lnet/minecraft/class_437;
      // 48: ifnonnull 5a
      // 4b: goto 4f
      // 4e: athrow
      // 4f: aload 0
      // 50: invokevirtual qeaa361f143ee4a0894bd168fd9b30c66/qf4ccf8f5435d4a78bdca4d6a018b578e/aaababaa.babbaab ()Z
      // 53: ifne 5c
      // 56: goto 5a
      // 59: athrow
      // 5a: return
      // 5b: athrow
      // 5c: aload 2
      // 5d: getfield net/minecraft/class_744.field_54155 Lnet/minecraft/class_10185;
      // 60: astore 4
      // 62: aload 4
      // 64: iload 3
      // 65: ifne 78
      // 68: invokevirtual net/minecraft/class_10185.comp_3159 ()Z
      // 6b: ifeq 92
      // 6e: goto 72
      // 71: athrow
      // 72: aload 4
      // 74: goto 78
      // 77: athrow
      // 78: iload 3
      // 79: ifne 8c
      // 7c: invokevirtual net/minecraft/class_10185.comp_3160 ()Z
      // 7f: ifne 92
      // 82: goto 86
      // 85: athrow
      // 86: aload 4
      // 88: goto 8c
      // 8b: athrow
      // 8c: invokevirtual net/minecraft/class_10185.comp_3165 ()Z
      // 8f: ifeq 94
      // 92: return
      // 93: athrow
      // 94: aload 2
      // 95: new net/minecraft/class_10185
      // 98: dup
      // 99: aload 4
      // 9b: invokevirtual net/minecraft/class_10185.comp_3159 ()Z
      // 9e: aload 4
      // a0: invokevirtual net/minecraft/class_10185.comp_3160 ()Z
      // a3: aload 4
      // a5: invokevirtual net/minecraft/class_10185.comp_3161 ()Z
      // a8: aload 4
      // aa: invokevirtual net/minecraft/class_10185.comp_3162 ()Z
      // ad: aload 4
      // af: invokevirtual net/minecraft/class_10185.comp_3163 ()Z
      // b2: aload 4
      // b4: invokevirtual net/minecraft/class_10185.comp_3164 ()Z
      // b7: bipush 1
      // b8: invokespecial net/minecraft/class_10185.<init> (ZZZZZZZ)V
      // bb: putfield net/minecraft/class_744.field_54155 Lnet/minecraft/class_10185;
      // be: return
   }

   private void aabb(class_310 param1) {
      // $VF: Couldn't be decompiled
      // Please report this to the Vineflower issue tracker, at https://github.com/Vineflower/vineflower/issues with a copy of the class file (if you have the rights to distribute it!)
      // java.lang.RuntimeException: parsing failure!
      //   at org.jetbrains.java.decompiler.modules.decompiler.decompose.DomHelper.parseGraph(DomHelper.java:211)
      //   at org.jetbrains.java.decompiler.main.rels.MethodProcessor.codeToJava(MethodProcessor.java:166)
      //
      // Bytecode:
      // 00: getstatic qeaa361f143ee4a0894bd168fd9b30c66/qf4ccf8f5435d4a78bdca4d6a018b578e/baaabbaa.bba I
      // 03: istore 2
      // 04: aload 1
      // 05: iload 2
      // 06: ifne 11
      // 09: ifnull 17
      // 0c: goto 10
      // 0f: athrow
      // 10: aload 1
      // 11: getfield net/minecraft/class_310.field_1690 Lnet/minecraft/class_315;
      // 14: ifnonnull 19
      // 17: return
      // 18: athrow
      // 19: invokestatic qeaa361f143ee4a0894bd168fd9b30c66/qf4ccf8f5435d4a78bdca4d6a018b578e/aabbaabb.bab ()Lqeaa361f143ee4a0894bd168fd9b30c66/qf4ccf8f5435d4a78bdca4d6a018b578e/aabbaabb;
      // 1c: astore 3
      // 1d: aload 0
      // 1e: aload 1
      // 1f: aload 3
      // 20: aload 1
      // 21: iload 2
      // 22: ifne 5e
      // 25: getfield net/minecraft/class_310.field_1690 Lnet/minecraft/class_315;
      // 28: getfield net/minecraft/class_315.field_1894 Lnet/minecraft/class_304;
      // 2b: bipush 0
      // 2c: invokevirtual qeaa361f143ee4a0894bd168fd9b30c66/qf4ccf8f5435d4a78bdca4d6a018b578e/aaababaa.bba (Lnet/minecraft/class_310;Lqeaa361f143ee4a0894bd168fd9b30c66/qf4ccf8f5435d4a78bdca4d6a018b578e/aabbaabb;Lnet/minecraft/class_304;Z)V
      // 2f: aload 0
      // 30: getfield qeaa361f143ee4a0894bd168fd9b30c66/qf4ccf8f5435d4a78bdca4d6a018b578e/aaababaa.aaba Lqeaa361f143ee4a0894bd168fd9b30c66/qf4ccf8f5435d4a78bdca4d6a018b578e/baabaab;
      // 33: invokevirtual qeaa361f143ee4a0894bd168fd9b30c66/qf4ccf8f5435d4a78bdca4d6a018b578e/baabaab.abbb ()Ljava/lang/Object;
      // 36: getstatic qeaa361f143ee4a0894bd168fd9b30c66/qf4ccf8f5435d4a78bdca4d6a018b578e/aabbbbb.aa Lqeaa361f143ee4a0894bd168fd9b30c66/qf4ccf8f5435d4a78bdca4d6a018b578e/aabbbbb;
      // 39: if_acmpne 56
      // 3c: goto 40
      // 3f: athrow
      // 40: aload 0
      // 41: aload 1
      // 42: aload 3
      // 43: aload 1
      // 44: getfield net/minecraft/class_310.field_1690 Lnet/minecraft/class_315;
      // 47: getfield net/minecraft/class_315.field_1881 Lnet/minecraft/class_304;
      // 4a: bipush 1
      // 4b: invokevirtual qeaa361f143ee4a0894bd168fd9b30c66/qf4ccf8f5435d4a78bdca4d6a018b578e/aaababaa.bba (Lnet/minecraft/class_310;Lqeaa361f143ee4a0894bd168fd9b30c66/qf4ccf8f5435d4a78bdca4d6a018b578e/aabbaabb;Lnet/minecraft/class_304;Z)V
      // 4e: iload 2
      // 4f: ifeq 67
      // 52: goto 56
      // 55: athrow
      // 56: aload 0
      // 57: aload 1
      // 58: aload 3
      // 59: aload 1
      // 5a: goto 5e
      // 5d: athrow
      // 5e: getfield net/minecraft/class_310.field_1690 Lnet/minecraft/class_315;
      // 61: getfield net/minecraft/class_315.field_1881 Lnet/minecraft/class_304;
      // 64: invokevirtual qeaa361f143ee4a0894bd168fd9b30c66/qf4ccf8f5435d4a78bdca4d6a018b578e/aaababaa.aba (Lnet/minecraft/class_310;Lqeaa361f143ee4a0894bd168fd9b30c66/qf4ccf8f5435d4a78bdca4d6a018b578e/aabbaabb;Lnet/minecraft/class_304;)V
      // 67: return
   }

   private static int abaa(int var0, long var1) {
      int var3 = var0 ^ (int)(var1 & 32767L) ^ a(1260142159, 73490761 ^ 1768013183);
      if (bbb[var3] == null) {
         bbb[var3] = (int)(aaa[var3] ^ var1);
      }

      return bbb[var3];
   }

   private void abab(class_310 param1, class_744 param2) {
      // $VF: Couldn't be decompiled
      // Please report this to the Vineflower issue tracker, at https://github.com/Vineflower/vineflower/issues with a copy of the class file (if you have the rights to distribute it!)
      // java.lang.RuntimeException: parsing failure!
      //   at org.jetbrains.java.decompiler.modules.decompiler.decompose.DomHelper.parseGraph(DomHelper.java:211)
      //   at org.jetbrains.java.decompiler.main.rels.MethodProcessor.codeToJava(MethodProcessor.java:166)
      //
      // Bytecode:
      // 00: getstatic qeaa361f143ee4a0894bd168fd9b30c66/qf4ccf8f5435d4a78bdca4d6a018b578e/baaabbaa.bba I
      // 03: aload 0
      // 04: aload 1
      // 05: invokevirtual qeaa361f143ee4a0894bd168fd9b30c66/qf4ccf8f5435d4a78bdca4d6a018b578e/aaababaa.aabb (Lnet/minecraft/class_310;)V
      // 08: istore 3
      // 09: aload 2
      // 0a: getfield net/minecraft/class_744.field_54155 Lnet/minecraft/class_10185;
      // 0d: astore 4
      // 0f: aload 0
      // 10: getfield qeaa361f143ee4a0894bd168fd9b30c66/qf4ccf8f5435d4a78bdca4d6a018b578e/aaababaa.aaba Lqeaa361f143ee4a0894bd168fd9b30c66/qf4ccf8f5435d4a78bdca4d6a018b578e/baabaab;
      // 13: invokevirtual qeaa361f143ee4a0894bd168fd9b30c66/qf4ccf8f5435d4a78bdca4d6a018b578e/baabaab.abbb ()Ljava/lang/Object;
      // 16: getstatic qeaa361f143ee4a0894bd168fd9b30c66/qf4ccf8f5435d4a78bdca4d6a018b578e/aabbbbb.aa Lqeaa361f143ee4a0894bd168fd9b30c66/qf4ccf8f5435d4a78bdca4d6a018b578e/aabbbbb;
      // 19: if_acmpne 21
      // 1c: bipush 1
      // 1d: goto 22
      // 20: athrow
      // 21: bipush 0
      // 22: istore 5
      // 24: bipush 0
      // 25: istore 6
      // 27: iload 5
      // 29: iload 3
      // 2a: ifne 35
      // 2d: ifeq 38
      // 30: goto 34
      // 33: athrow
      // 34: bipush 1
      // 35: goto 3d
      // 38: aload 4
      // 3a: invokevirtual net/minecraft/class_10185.comp_3160 ()Z
      // 3d: istore 7
      // 3f: aload 4
      // 41: invokevirtual net/minecraft/class_10185.comp_3161 ()Z
      // 44: istore 8
      // 46: aload 4
      // 48: invokevirtual net/minecraft/class_10185.comp_3162 ()Z
      // 4b: istore 9
      // 4d: aload 4
      // 4f: invokevirtual net/minecraft/class_10185.comp_3163 ()Z
      // 52: istore 10
      // 54: aload 4
      // 56: invokevirtual net/minecraft/class_10185.comp_3164 ()Z
      // 59: istore 11
      // 5b: aload 2
      // 5c: new net/minecraft/class_10185
      // 5f: dup
      // 60: iload 6
      // 62: iload 7
      // 64: iload 8
      // 66: iload 9
      // 68: iload 10
      // 6a: iload 11
      // 6c: bipush 0
      // 6d: invokespecial net/minecraft/class_10185.<init> (ZZZZZZZ)V
      // 70: putfield net/minecraft/class_744.field_54155 Lnet/minecraft/class_10185;
      // 73: iload 5
      // 75: iload 3
      // 76: ifne 89
      // 79: ifeq 87
      // 7c: goto 80
      // 7f: athrow
      // 80: ldc_w -1.0
      // 83: goto 94
      // 86: athrow
      // 87: iload 7
      // 89: ifeq 93
      // 8c: ldc_w -1.0
      // 8f: goto 94
      // 92: athrow
      // 93: fconst_0
      // 94: fstore 12
      // 96: iload 8
      // 98: iload 3
      // 99: ifne ac
      // 9c: iload 9
      // 9e: if_icmpne aa
      // a1: goto a5
      // a4: athrow
      // a5: fconst_0
      // a6: goto b7
      // a9: athrow
      // aa: iload 8
      // ac: ifeq b4
      // af: fconst_1
      // b0: goto b7
      // b3: athrow
      // b4: ldc_w -1.0
      // b7: fstore 13
      // b9: iload 3
      // ba: ifne fa
      // bd: fload 12
      // bf: fconst_0
      // c0: fcmpl
      // c1: ifeq f2
      // c4: goto c8
      // c7: athrow
      // c8: fload 13
      // ca: iload 3
      // cb: ifne e2
      // ce: goto d2
      // d1: athrow
      // d2: fconst_0
      // d3: fcmpl
      // d4: ifeq f2
      // d7: goto db
      // da: athrow
      // db: ldc_w 0.70710677
      // de: goto e2
      // e1: athrow
      // e2: fstore 14
      // e4: fload 12
      // e6: fload 14
      // e8: fmul
      // e9: fstore 12
      // eb: fload 13
      // ed: fload 14
      // ef: fmul
      // f0: fstore 13
      // f2: aload 2
      // f3: fload 12
      // f5: fload 13
      // f7: invokestatic qeaa361f143ee4a0894bd168fd9b30c66/qf4ccf8f5435d4a78bdca4d6a018b578e/aabbabbbb.baaabaa (Lnet/minecraft/class_744;FF)V
      // fa: return
   }

   public boolean b(class_310 param1, class_744 param2) {
      // $VF: Couldn't be decompiled
      // Please report this to the Vineflower issue tracker, at https://github.com/Vineflower/vineflower/issues with a copy of the class file (if you have the rights to distribute it!)
      // java.lang.RuntimeException: parsing failure!
      //   at org.jetbrains.java.decompiler.modules.decompiler.decompose.DomHelper.parseGraph(DomHelper.java:211)
      //   at org.jetbrains.java.decompiler.main.rels.MethodProcessor.codeToJava(MethodProcessor.java:166)
      //
      // Bytecode:
      // 000: getstatic qeaa361f143ee4a0894bd168fd9b30c66/qf4ccf8f5435d4a78bdca4d6a018b578e/baaabbaa.bba I
      // 003: istore 3
      // 004: aload 0
      // 005: iload 3
      // 006: ifne 020
      // 009: getfield qeaa361f143ee4a0894bd168fd9b30c66/qf4ccf8f5435d4a78bdca4d6a018b578e/aaababaa.aaaa Lqeaa361f143ee4a0894bd168fd9b30c66/qf4ccf8f5435d4a78bdca4d6a018b578e/abababa;
      // 00c: getstatic qeaa361f143ee4a0894bd168fd9b30c66/qf4ccf8f5435d4a78bdca4d6a018b578e/abababa.a Lqeaa361f143ee4a0894bd168fd9b30c66/qf4ccf8f5435d4a78bdca4d6a018b578e/abababa;
      // 00f: if_acmpne 01f
      // 012: goto 016
      // 015: athrow
      // 016: aload 0
      // 017: aload 1
      // 018: aload 2
      // 019: invokevirtual qeaa361f143ee4a0894bd168fd9b30c66/qf4ccf8f5435d4a78bdca4d6a018b578e/aaababaa.aaba (Lnet/minecraft/class_310;Lnet/minecraft/class_744;)V
      // 01c: bipush 0
      // 01d: ireturn
      // 01e: athrow
      // 01f: aload 0
      // 020: iload 3
      // 021: ifne 07f
      // 024: invokevirtual qeaa361f143ee4a0894bd168fd9b30c66/qf4ccf8f5435d4a78bdca4d6a018b578e/aaababaa.babbaab ()Z
      // 027: ifeq 07a
      // 02a: goto 02e
      // 02d: athrow
      // 02e: aload 1
      // 02f: iload 3
      // 030: ifne 03f
      // 033: goto 037
      // 036: athrow
      // 037: ifnull 07a
      // 03a: goto 03e
      // 03d: athrow
      // 03e: aload 1
      // 03f: iload 3
      // 040: ifne 052
      // 043: getfield net/minecraft/class_310.field_1724 Lnet/minecraft/class_746;
      // 046: ifnull 07a
      // 049: goto 04d
      // 04c: athrow
      // 04d: aload 1
      // 04e: goto 052
      // 051: athrow
      // 052: getfield net/minecraft/class_310.field_1690 Lnet/minecraft/class_315;
      // 055: ifnull 07a
      // 058: aload 2
      // 059: iload 3
      // 05a: ifne 069
      // 05d: goto 061
      // 060: athrow
      // 061: ifnull 07a
      // 064: goto 068
      // 067: athrow
      // 068: aload 2
      // 069: getfield net/minecraft/class_744.field_54155 Lnet/minecraft/class_10185;
      // 06c: ifnull 07a
      // 06f: aload 1
      // 070: getfield net/minecraft/class_310.field_1755 Lnet/minecraft/class_437;
      // 073: ifnull 085
      // 076: goto 07a
      // 079: athrow
      // 07a: aload 0
      // 07b: goto 07f
      // 07e: athrow
      // 07f: aload 1
      // 080: invokevirtual qeaa361f143ee4a0894bd168fd9b30c66/qf4ccf8f5435d4a78bdca4d6a018b578e/aaababaa.ba (Lnet/minecraft/class_310;)V
      // 083: bipush 0
      // 084: ireturn
      // 085: invokestatic java/lang/System.currentTimeMillis ()J
      // 088: lstore 4
      // 08a: aload 0
      // 08b: getfield qeaa361f143ee4a0894bd168fd9b30c66/qf4ccf8f5435d4a78bdca4d6a018b578e/aaababaa.aaaa Lqeaa361f143ee4a0894bd168fd9b30c66/qf4ccf8f5435d4a78bdca4d6a018b578e/abababa;
      // 08e: getstatic qeaa361f143ee4a0894bd168fd9b30c66/qf4ccf8f5435d4a78bdca4d6a018b578e/abababa.aa Lqeaa361f143ee4a0894bd168fd9b30c66/qf4ccf8f5435d4a78bdca4d6a018b578e/abababa;
      // 091: if_acmpne 0d6
      // 094: lload 4
      // 096: aload 0
      // 097: getfield qeaa361f143ee4a0894bd168fd9b30c66/qf4ccf8f5435d4a78bdca4d6a018b578e/aaababaa.baa J
      // 09a: lcmp
      // 09b: iload 3
      // 09c: ifne 0c9
      // 09f: goto 0a3
      // 0a2: athrow
      // 0a3: iflt 0c4
      // 0a6: goto 0aa
      // 0a9: athrow
      // 0aa: aload 1
      // 0ab: getfield net/minecraft/class_310.field_1724 Lnet/minecraft/class_746;
      // 0ae: getfield net/minecraft/class_746.field_6012 I
      // 0b1: iload 3
      // 0b2: ifne 0c9
      // 0b5: goto 0b9
      // 0b8: athrow
      // 0b9: aload 0
      // 0ba: getfield qeaa361f143ee4a0894bd168fd9b30c66/qf4ccf8f5435d4a78bdca4d6a018b578e/aaababaa.bab I
      // 0bd: if_icmpge 0ca
      // 0c0: goto 0c4
      // 0c3: athrow
      // 0c4: bipush 0
      // 0c5: goto 0c9
      // 0c8: athrow
      // 0c9: ireturn
      // 0ca: aload 0
      // 0cb: getstatic qeaa361f143ee4a0894bd168fd9b30c66/qf4ccf8f5435d4a78bdca4d6a018b578e/abababa.ab Lqeaa361f143ee4a0894bd168fd9b30c66/qf4ccf8f5435d4a78bdca4d6a018b578e/abababa;
      // 0ce: putfield qeaa361f143ee4a0894bd168fd9b30c66/qf4ccf8f5435d4a78bdca4d6a018b578e/aaababaa.aaaa Lqeaa361f143ee4a0894bd168fd9b30c66/qf4ccf8f5435d4a78bdca4d6a018b578e/abababa;
      // 0d1: aload 0
      // 0d2: bipush 0
      // 0d3: putfield qeaa361f143ee4a0894bd168fd9b30c66/qf4ccf8f5435d4a78bdca4d6a018b578e/aaababaa.aab Z
      // 0d6: lload 4
      // 0d8: aload 0
      // 0d9: getfield qeaa361f143ee4a0894bd168fd9b30c66/qf4ccf8f5435d4a78bdca4d6a018b578e/aaababaa.aaab J
      // 0dc: lcmp
      // 0dd: iload 3
      // 0de: ifne 124
      // 0e1: iflt 110
      // 0e4: goto 0e8
      // 0e7: athrow
      // 0e8: aload 1
      // 0e9: getfield net/minecraft/class_310.field_1724 Lnet/minecraft/class_746;
      // 0ec: iload 3
      // 0ed: ifne 114
      // 0f0: goto 0f4
      // 0f3: athrow
      // 0f4: getfield net/minecraft/class_746.field_6012 I
      // 0f7: aload 0
      // 0f8: getfield qeaa361f143ee4a0894bd168fd9b30c66/qf4ccf8f5435d4a78bdca4d6a018b578e/aaababaa.ab I
      // 0fb: if_icmplt 110
      // 0fe: goto 102
      // 101: athrow
      // 102: aload 0
      // 103: aload 1
      // 104: invokevirtual qeaa361f143ee4a0894bd168fd9b30c66/qf4ccf8f5435d4a78bdca4d6a018b578e/aaababaa.ba (Lnet/minecraft/class_310;)V
      // 107: aload 0
      // 108: aload 1
      // 109: aload 2
      // 10a: invokevirtual qeaa361f143ee4a0894bd168fd9b30c66/qf4ccf8f5435d4a78bdca4d6a018b578e/aaababaa.aaba (Lnet/minecraft/class_310;Lnet/minecraft/class_744;)V
      // 10d: bipush 0
      // 10e: ireturn
      // 10f: athrow
      // 110: aload 1
      // 111: getfield net/minecraft/class_310.field_1724 Lnet/minecraft/class_746;
      // 114: bipush 0
      // 115: invokevirtual net/minecraft/class_746.method_5728 (Z)V
      // 118: aload 0
      // 119: bipush 1
      // 11a: putfield qeaa361f143ee4a0894bd168fd9b30c66/qf4ccf8f5435d4a78bdca4d6a018b578e/aaababaa.aab Z
      // 11d: aload 0
      // 11e: aload 1
      // 11f: aload 2
      // 120: invokevirtual qeaa361f143ee4a0894bd168fd9b30c66/qf4ccf8f5435d4a78bdca4d6a018b578e/aaababaa.abab (Lnet/minecraft/class_310;Lnet/minecraft/class_744;)V
      // 123: bipush 1
      // 124: ireturn
   }
}
