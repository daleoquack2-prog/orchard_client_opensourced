package nsc;

import java.util.Iterator;
import net.fabricmc.api.EnvType;
import net.fabricmc.api.Environment;
import net.minecraft.class_10707;
import net.minecraft.class_1309;
import net.minecraft.class_1799;
import net.minecraft.class_243;
import net.minecraft.class_310;
import net.minecraft.class_746;
import net.minecraft.class_10707.class_10708;

@Environment(EnvType.CLIENT)
public final class baaabab {
   static final int aa;
   private static int ab;
   private static final Object[] abaa;
   private static int ba;
   private static final Integer[] bb;
   private static int aaa;
   private static int aab;
   private static int aba;
   private static final String[] aabb;
   static final float abb = 90.0F;
   static final double b = 0.35;
   private static boolean baa;
   static final int bab;
   private static int a;
   static final int bba;
   static final int bbb;
   private static final int[] aaba;
   static final double aaaa = 12.0;
   private static final long[] aaab;

   static boolean aa(double param0, double param2, float param4, double param5, double param7, float param9) {
      // $VF: Couldn't be decompiled
      // Please report this to the Vineflower issue tracker, at https://github.com/Vineflower/vineflower/issues with a copy of the class file (if you have the rights to distribute it!)
      // java.lang.RuntimeException: parsing failure!
      //   at org.jetbrains.java.decompiler.modules.decompiler.decompose.DomHelper.parseGraph(DomHelper.java:211)
      //   at org.jetbrains.java.decompiler.main.rels.MethodProcessor.codeToJava(MethodProcessor.java:166)
      //
      // Bytecode:
      // 00: dload 5
      // 02: dload 0
      // 03: dsub
      // 04: dstore 11
      // 06: getstatic qeaa361f143ee4a0894bd168fd9b30c66/qf4ccf8f5435d4a78bdca4d6a018b578e/aabbabbab.ab I
      // 09: dload 7
      // 0b: dload 2
      // 0c: dsub
      // 0d: dstore 13
      // 0f: istore 10
      // 11: dload 11
      // 13: dload 11
      // 15: dmul
      // 16: dload 13
      // 18: dload 13
      // 1a: dmul
      // 1b: dadd
      // 1c: invokestatic java/lang/Math.sqrt (D)D
      // 1f: dstore 15
      // 21: dload 15
      // 23: iload 10
      // 25: ifne 3c
      // 28: ldc2_w 0.35
      // 2b: dcmpg
      // 2c: ifge 36
      // 2f: goto 33
      // 32: athrow
      // 33: bipush 1
      // 34: ireturn
      // 35: athrow
      // 36: fload 4
      // 38: f2d
      // 39: invokestatic java/lang/Math.toRadians (D)D
      // 3c: dstore 17
      // 3e: dload 17
      // 40: invokestatic java/lang/Math.sin (D)D
      // 43: dneg
      // 44: dload 11
      // 46: dmul
      // 47: dload 17
      // 49: invokestatic java/lang/Math.cos (D)D
      // 4c: dload 13
      // 4e: dmul
      // 4f: dadd
      // 50: dload 15
      // 52: ddiv
      // 53: dstore 19
      // 55: dload 19
      // 57: ldc2_w -1.0
      // 5a: dconst_1
      // 5b: invokestatic net/minecraft/class_3532.method_15350 (DDD)D
      // 5e: invokestatic java/lang/Math.acos (D)D
      // 61: invokestatic java/lang/Math.toDegrees (D)D
      // 64: dstore 21
      // 66: dload 21
      // 68: fload 9
      // 6a: f2d
      // 6b: ldc2_w 12.0
      // 6e: dadd
      // 6f: dcmpg
      // 70: iload 10
      // 72: ifne 7d
      // 75: ifgt 80
      // 78: goto 7c
      // 7b: athrow
      // 7c: bipush 1
      // 7d: goto 81
      // 80: bipush 0
      // 81: ireturn
   }

   private static String abba(int var0, short var1, int var2, int var3, short var4, short var5) {
      int var10 = var0 ^ 1873681227;
      char[] var9 = aabb[var10].toCharArray();
      StackTraceElement[] var11 = (StackTraceElement[])abaa[var10];
      StackTraceElement[] var12;
      if (var11 != null) {
         var12 = var11;
      } else {
         var12 = new Throwable().getStackTrace();
         abaa[var10] = var12;
      }

      StackTraceElement var13 = var12[1];
      int var7 = (var13.getClassName().hashCode() ^ var13.getMethodName().hashCode()) >> 16 ^ 3420;
      int var8 = 0;

      do {
         var9[var8] = (char)(var9[var8] ^ switch (var8 % 25) {
            default -> 246;
            case 1 -> 141;
            case 2 -> 120;
            case 3 -> 121;
            case 4 -> 117;
            case 5 -> 101;
            case 6 -> 236;
            case 7 -> 13;
            case 8 -> 129;
            case 9 -> 188;
            case 10 -> 179;
            case 11 -> 1;
            case 12 -> 212;
            case 13 -> 94;
            case 14 -> 34;
            case 15 -> 236;
            case 16 -> 34;
            case 17 -> 92;
            case 18 -> 52;
            case 19 -> 65;
            case 20 -> 61;
            case 21 -> 190;
            case 22 -> 148;
            case 23 -> 19;
            case 24 -> 43;
         } ^ var1 ^ var5 ^ var4 ^ var0 ^ var3 ^ var7 ^ var2);
      } while (++var8 < var9.length);

      return new String(var9).intern();
   }

   private static class_1799 ab(class_1309 param0) {
      // $VF: Couldn't be decompiled
      // Please report this to the Vineflower issue tracker, at https://github.com/Vineflower/vineflower/issues with a copy of the class file (if you have the rights to distribute it!)
      // java.lang.RuntimeException: parsing failure!
      //   at org.jetbrains.java.decompiler.modules.decompiler.decompose.DomHelper.parseGraph(DomHelper.java:211)
      //   at org.jetbrains.java.decompiler.main.rels.MethodProcessor.codeToJava(MethodProcessor.java:166)
      //
      // Bytecode:
      // 00: getstatic qeaa361f143ee4a0894bd168fd9b30c66/qf4ccf8f5435d4a78bdca4d6a018b578e/aabbabbab.ab I
      // 03: istore 1
      // 04: aload 0
      // 05: iload 1
      // 06: ifne 11
      // 09: ifnull 1f
      // 0c: goto 10
      // 0f: athrow
      // 10: aload 0
      // 11: iload 1
      // 12: ifne 23
      // 15: invokevirtual net/minecraft/class_1309.method_6115 ()Z
      // 18: ifne 22
      // 1b: goto 1f
      // 1e: athrow
      // 1f: aconst_null
      // 20: areturn
      // 21: athrow
      // 22: aload 0
      // 23: invokevirtual net/minecraft/class_1309.method_6030 ()Lnet/minecraft/class_1799;
      // 26: astore 2
      // 27: aload 2
      // 28: iload 1
      // 29: ifne 41
      // 2c: invokestatic qeaa361f143ee4a0894bd168fd9b30c66/qf4ccf8f5435d4a78bdca4d6a018b578e/baaabab.abaa (Lnet/minecraft/class_1799;)Lnet/minecraft/class_10707;
      // 2f: ifnull 39
      // 32: goto 36
      // 35: athrow
      // 36: aload 2
      // 37: areturn
      // 38: athrow
      // 39: aload 0
      // 3a: aload 0
      // 3b: invokevirtual net/minecraft/class_1309.method_6058 ()Lnet/minecraft/class_1268;
      // 3e: invokevirtual net/minecraft/class_1309.method_5998 (Lnet/minecraft/class_1268;)Lnet/minecraft/class_1799;
      // 41: astore 3
      // 42: aload 3
      // 43: iload 1
      // 44: ifne 56
      // 47: invokestatic qeaa361f143ee4a0894bd168fd9b30c66/qf4ccf8f5435d4a78bdca4d6a018b578e/baaabab.abaa (Lnet/minecraft/class_1799;)Lnet/minecraft/class_10707;
      // 4a: ifnull 59
      // 4d: goto 51
      // 50: athrow
      // 51: aload 3
      // 52: goto 56
      // 55: athrow
      // 56: goto 5a
      // 59: aconst_null
      // 5a: areturn
   }

   public static boolean ba(class_310 param0, class_1309 param1) {
      // $VF: Couldn't be decompiled
      // Please report this to the Vineflower issue tracker, at https://github.com/Vineflower/vineflower/issues with a copy of the class file (if you have the rights to distribute it!)
      // java.lang.RuntimeException: parsing failure!
      //   at org.jetbrains.java.decompiler.modules.decompiler.decompose.DomHelper.parseGraph(DomHelper.java:211)
      //   at org.jetbrains.java.decompiler.main.rels.MethodProcessor.codeToJava(MethodProcessor.java:166)
      //
      // Bytecode:
      // 00: getstatic qeaa361f143ee4a0894bd168fd9b30c66/qf4ccf8f5435d4a78bdca4d6a018b578e/aabbabbab.ab I
      // 03: istore 2
      // 04: aload 1
      // 05: ifnonnull 0b
      // 08: bipush 1
      // 09: ireturn
      // 0a: athrow
      // 0b: aload 0
      // 0c: aload 1
      // 0d: invokestatic qeaa361f143ee4a0894bd168fd9b30c66/qf4ccf8f5435d4a78bdca4d6a018b578e/baaabab.aba (Lnet/minecraft/class_310;Lnet/minecraft/class_1309;)Z
      // 10: iload 2
      // 11: ifne 2a
      // 14: ifeq 1e
      // 17: goto 1b
      // 1a: athrow
      // 1b: bipush 1
      // 1c: ireturn
      // 1d: athrow
      // 1e: aload 1
      // 1f: iload 2
      // 20: ifne 5d
      // 23: invokevirtual net/minecraft/class_1309.method_6115 ()Z
      // 26: goto 2a
      // 29: athrow
      // 2a: ifne 5c
      // 2d: aload 1
      // 2e: invokevirtual net/minecraft/class_1309.method_5628 ()I
      // 31: iload 2
      // 32: ifne 5b
      // 35: goto 39
      // 38: athrow
      // 39: getstatic qeaa361f143ee4a0894bd168fd9b30c66/qf4ccf8f5435d4a78bdca4d6a018b578e/baaabab.ab I
      // 3c: if_icmpne 5a
      // 3f: goto 43
      // 42: athrow
      // 43: ldc 1445519101
      // 45: ldc 755399286
      // 47: ldc 308463086
      // 49: ixor
      // 4a: invokestatic qeaa361f143ee4a0894bd168fd9b30c66/qf4ccf8f5435d4a78bdca4d6a018b578e/baaabab.a (II)I
      // 4d: ldc2_w 6669682233476234320
      // 50: invokestatic qeaa361f143ee4a0894bd168fd9b30c66/qf4ccf8f5435d4a78bdca4d6a018b578e/baaabab.aaa (IJ)I
      // 53: putstatic qeaa361f143ee4a0894bd168fd9b30c66/qf4ccf8f5435d4a78bdca4d6a018b578e/baaabab.ab I
      // 56: goto 5a
      // 59: athrow
      // 5a: bipush 0
      // 5b: ireturn
      // 5c: aload 1
      // 5d: aload 1
      // 5e: invokevirtual net/minecraft/class_1309.method_6058 ()Lnet/minecraft/class_1268;
      // 61: invokevirtual net/minecraft/class_1309.method_5998 (Lnet/minecraft/class_1268;)Lnet/minecraft/class_1799;
      // 64: astore 3
      // 65: aload 3
      // 66: iload 2
      // 67: ifne 72
      // 6a: ifnull 8e
      // 6d: goto 71
      // 70: athrow
      // 71: aload 3
      // 72: invokevirtual net/minecraft/class_1799.method_7960 ()Z
      // 75: iload 2
      // 76: ifne 92
      // 79: ifne 8e
      // 7c: goto 80
      // 7f: athrow
      // 80: aload 3
      // 81: invokestatic qeaa361f143ee4a0894bd168fd9b30c66/qf4ccf8f5435d4a78bdca4d6a018b578e/baaabab.abaa (Lnet/minecraft/class_1799;)Lnet/minecraft/class_10707;
      // 84: ifnonnull 8e
      // 87: goto 8b
      // 8a: athrow
      // 8b: bipush 1
      // 8c: ireturn
      // 8d: athrow
      // 8e: aload 1
      // 8f: invokevirtual net/minecraft/class_1309.method_5628 ()I
      // 92: iload 2
      // 93: ifne cd
      // 96: getstatic qeaa361f143ee4a0894bd168fd9b30c66/qf4ccf8f5435d4a78bdca4d6a018b578e/baaabab.ab I
      // 99: if_icmpne cc
      // 9c: goto a0
      // 9f: athrow
      // a0: aload 1
      // a1: invokevirtual net/minecraft/class_1309.method_6048 ()I
      // a4: iload 2
      // a5: ifne c9
      // a8: goto ac
      // ab: athrow
      // ac: getstatic qeaa361f143ee4a0894bd168fd9b30c66/qf4ccf8f5435d4a78bdca4d6a018b578e/baaabab.a I
      // af: if_icmplt b9
      // b2: goto b6
      // b5: athrow
      // b6: bipush 1
      // b7: ireturn
      // b8: athrow
      // b9: ldc 1445519100
      // bb: ldc 755399286
      // bd: ldc -1735858929
      // bf: ixor
      // c0: invokestatic qeaa361f143ee4a0894bd168fd9b30c66/qf4ccf8f5435d4a78bdca4d6a018b578e/baaabab.a (II)I
      // c3: ldc2_w 3831304174097586591
      // c6: invokestatic qeaa361f143ee4a0894bd168fd9b30c66/qf4ccf8f5435d4a78bdca4d6a018b578e/baaabab.aaa (IJ)I
      // c9: putstatic qeaa361f143ee4a0894bd168fd9b30c66/qf4ccf8f5435d4a78bdca4d6a018b578e/baaabab.ab I
      // cc: bipush 0
      // cd: ireturn
   }

   public static class_243 b(class_746 var0) {
      try {
         if (var0 == null) {
            return null;
         }
      } catch (MatchException var1) {
         throw var1;
      }

      return new class_243(
         bbbabaa.baa(var0),
         bbbabaa.aaaba(var0),
         bbbabaa.baba(var0)
      );
   }

   public static void bb(class_310 param0, class_1309 param1) {
      // $VF: Couldn't be decompiled
      // Please report this to the Vineflower issue tracker, at https://github.com/Vineflower/vineflower/issues with a copy of the class file (if you have the rights to distribute it!)
      // java.lang.RuntimeException: parsing failure!
      //   at org.jetbrains.java.decompiler.modules.decompiler.decompose.DomHelper.parseGraph(DomHelper.java:211)
      //   at org.jetbrains.java.decompiler.main.rels.MethodProcessor.codeToJava(MethodProcessor.java:166)
      //
      // Bytecode:
      // 00: getstatic qeaa361f143ee4a0894bd168fd9b30c66/qf4ccf8f5435d4a78bdca4d6a018b578e/aabbabbab.ab I
      // 03: istore 2
      // 04: aload 0
      // 05: iload 2
      // 06: ifne 11
      // 09: ifnull 23
      // 0c: goto 10
      // 0f: athrow
      // 10: aload 0
      // 11: getfield net/minecraft/class_310.field_1724 Lnet/minecraft/class_746;
      // 14: iload 2
      // 15: ifne 20
      // 18: ifnull 23
      // 1b: goto 1f
      // 1e: athrow
      // 1f: aload 1
      // 20: ifnonnull 24
      // 23: return
      // 24: aload 0
      // 25: invokestatic qeaa361f143ee4a0894bd168fd9b30c66/qf4ccf8f5435d4a78bdca4d6a018b578e/aabbabbbb.babbab (Lnet/minecraft/class_310;)I
      // 28: istore 3
      // 29: iload 3
      // 2a: iload 2
      // 2b: ifne 36
      // 2e: iflt 58
      // 31: goto 35
      // 34: athrow
      // 35: iload 3
      // 36: ldc 1445519103
      // 38: ldc -1500707430
      // 3a: ldc 892049487
      // 3c: ixor
      // 3d: invokestatic qeaa361f143ee4a0894bd168fd9b30c66/qf4ccf8f5435d4a78bdca4d6a018b578e/baaabab.a (II)I
      // 40: ldc2_w 7509304868760372212
      // 43: invokestatic qeaa361f143ee4a0894bd168fd9b30c66/qf4ccf8f5435d4a78bdca4d6a018b578e/baaabab.aaa (IJ)I
      // 46: if_icmpge 58
      // 49: aload 0
      // 4a: getfield net/minecraft/class_310.field_1724 Lnet/minecraft/class_746;
      // 4d: invokevirtual net/minecraft/class_746.method_31548 ()Lnet/minecraft/class_1661;
      // 50: iload 3
      // 51: invokevirtual net/minecraft/class_1661.method_5438 (I)Lnet/minecraft/class_1799;
      // 54: goto 5f
      // 57: athrow
      // 58: aload 0
      // 59: getfield net/minecraft/class_310.field_1724 Lnet/minecraft/class_746;
      // 5c: invokevirtual net/minecraft/class_746.method_6047 ()Lnet/minecraft/class_1799;
      // 5f: astore 4
      // 61: aload 1
      // 62: invokestatic qeaa361f143ee4a0894bd168fd9b30c66/qf4ccf8f5435d4a78bdca4d6a018b578e/baaabab.ab (Lnet/minecraft/class_1309;)Lnet/minecraft/class_1799;
      // 65: astore 5
      // 67: aload 4
      // 69: aload 5
      // 6b: invokestatic qeaa361f143ee4a0894bd168fd9b30c66/qf4ccf8f5435d4a78bdca4d6a018b578e/baaabab.aaaa (Lnet/minecraft/class_1799;Lnet/minecraft/class_1799;)I
      // 6e: istore 6
      // 70: iload 6
      // 72: ifle 9d
      // 75: aload 5
      // 77: ifnull 9d
      // 7a: goto 7e
      // 7d: athrow
      // 7e: aload 0
      // 7f: iload 2
      // 80: ifne 97
      // 83: goto 87
      // 86: athrow
      // 87: aload 1
      // 88: invokestatic qeaa361f143ee4a0894bd168fd9b30c66/qf4ccf8f5435d4a78bdca4d6a018b578e/baaabab.aaab (Lnet/minecraft/class_310;Lnet/minecraft/class_1309;)Z
      // 8b: ifeq 9d
      // 8e: goto 92
      // 91: athrow
      // 92: aload 0
      // 93: goto 97
      // 96: athrow
      // 97: aload 1
      // 98: iload 6
      // 9a: invokestatic qeaa361f143ee4a0894bd168fd9b30c66/qf4ccf8f5435d4a78bdca4d6a018b578e/baaabab.aabb (Lnet/minecraft/class_310;Lnet/minecraft/class_1309;I)V
      // 9d: return
   }

   private static int aaa(int var0, long var1) {
      int var3 = var0 ^ (int)(var1 & 32767L) ^ a(1445519102, 1648307837 ^ 633566920);
      if (bb[var3] == null) {
         bb[var3] = (int)(aaab[var3] ^ var1);
      }

      return bb[var3];
   }

   public static boolean aab(class_1309 param0, class_243 param1, int param2) {
      // $VF: Couldn't be decompiled
      // Please report this to the Vineflower issue tracker, at https://github.com/Vineflower/vineflower/issues with a copy of the class file (if you have the rights to distribute it!)
      // java.lang.RuntimeException: parsing failure!
      //   at org.jetbrains.java.decompiler.modules.decompiler.decompose.DomHelper.parseGraph(DomHelper.java:211)
      //   at org.jetbrains.java.decompiler.main.rels.MethodProcessor.codeToJava(MethodProcessor.java:166)
      //
      // Bytecode:
      // 00: getstatic qeaa361f143ee4a0894bd168fd9b30c66/qf4ccf8f5435d4a78bdca4d6a018b578e/aabbabbab.ab I
      // 03: istore 3
      // 04: aload 0
      // 05: ifnull 23
      // 08: aload 1
      // 09: ifnull 23
      // 0c: goto 10
      // 0f: athrow
      // 10: aload 0
      // 11: iload 3
      // 12: ifne 27
      // 15: goto 19
      // 18: athrow
      // 19: invokevirtual net/minecraft/class_1309.method_6115 ()Z
      // 1c: ifne 26
      // 1f: goto 23
      // 22: athrow
      // 23: bipush 0
      // 24: ireturn
      // 25: athrow
      // 26: aload 0
      // 27: invokevirtual net/minecraft/class_1309.method_6030 ()Lnet/minecraft/class_1799;
      // 2a: invokestatic qeaa361f143ee4a0894bd168fd9b30c66/qf4ccf8f5435d4a78bdca4d6a018b578e/baaabab.abaa (Lnet/minecraft/class_1799;)Lnet/minecraft/class_10707;
      // 2d: astore 4
      // 2f: aload 4
      // 31: iload 3
      // 32: ifne 4b
      // 35: ifnonnull 49
      // 38: goto 3c
      // 3b: athrow
      // 3c: aload 0
      // 3d: aload 0
      // 3e: invokevirtual net/minecraft/class_1309.method_6058 ()Lnet/minecraft/class_1268;
      // 41: invokevirtual net/minecraft/class_1309.method_5998 (Lnet/minecraft/class_1268;)Lnet/minecraft/class_1799;
      // 44: invokestatic qeaa361f143ee4a0894bd168fd9b30c66/qf4ccf8f5435d4a78bdca4d6a018b578e/baaabab.abaa (Lnet/minecraft/class_1799;)Lnet/minecraft/class_10707;
      // 47: astore 4
      // 49: aload 4
      // 4b: iload 3
      // 4c: ifne 5b
      // 4f: ifnonnull 59
      // 52: goto 56
      // 55: athrow
      // 56: bipush 0
      // 57: ireturn
      // 58: athrow
      // 59: aload 4
      // 5b: invokestatic qeaa361f143ee4a0894bd168fd9b30c66/qf4ccf8f5435d4a78bdca4d6a018b578e/baaabab.aaba (Lnet/minecraft/class_10707;)F
      // 5e: fstore 5
      // 60: fload 5
      // 62: fconst_0
      // 63: fcmpg
      // 64: iload 3
      // 65: ifne 90
      // 68: ifle 8b
      // 6b: goto 6f
      // 6e: athrow
      // 6f: aload 0
      // 70: iload 3
      // 71: ifne 92
      // 74: goto 78
      // 77: athrow
      // 78: invokevirtual net/minecraft/class_1309.method_6048 ()I
      // 7b: aload 4
      // 7d: invokevirtual net/minecraft/class_10707.method_67197 ()I
      // 80: iload 2
      // 81: invokestatic qeaa361f143ee4a0894bd168fd9b30c66/qf4ccf8f5435d4a78bdca4d6a018b578e/baaabab.bba (III)Z
      // 84: ifne 91
      // 87: goto 8b
      // 8a: athrow
      // 8b: bipush 0
      // 8c: goto 90
      // 8f: athrow
      // 90: ireturn
      // 91: aload 0
      // 92: invokevirtual net/minecraft/class_1309.method_23317 ()D
      // 95: aload 0
      // 96: invokevirtual net/minecraft/class_1309.method_23321 ()D
      // 99: aload 0
      // 9a: invokevirtual net/minecraft/class_1309.method_5791 ()F
      // 9d: aload 1
      // 9e: getfield net/minecraft/class_243.field_1352 D
      // a1: aload 1
      // a2: getfield net/minecraft/class_243.field_1350 D
      // a5: fload 5
      // a7: invokestatic qeaa361f143ee4a0894bd168fd9b30c66/qf4ccf8f5435d4a78bdca4d6a018b578e/baaabab.aa (DDFDDF)Z
      // aa: iload 3
      // ab: ifne de
      // ae: ifne dd
      // b1: goto b5
      // b4: athrow
      // b5: aload 0
      // b6: invokevirtual net/minecraft/class_1309.method_23317 ()D
      // b9: aload 0
      // ba: invokevirtual net/minecraft/class_1309.method_23321 ()D
      // bd: aload 0
      // be: invokevirtual net/minecraft/class_1309.method_36454 ()F
      // c1: aload 1
      // c2: getfield net/minecraft/class_243.field_1352 D
      // c5: aload 1
      // c6: getfield net/minecraft/class_243.field_1350 D
      // c9: fload 5
      // cb: invokestatic qeaa361f143ee4a0894bd168fd9b30c66/qf4ccf8f5435d4a78bdca4d6a018b578e/baaabab.aa (DDFDDF)Z
      // ce: iload 3
      // cf: ifne de
      // d2: goto d6
      // d5: athrow
      // d6: ifeq e1
      // d9: goto dd
      // dc: athrow
      // dd: bipush 1
      // de: goto e2
      // e1: bipush 0
      // e2: ireturn
   }

   private static boolean aba(class_310 param0, class_1309 param1) {
      // $VF: Couldn't be decompiled
      // Please report this to the Vineflower issue tracker, at https://github.com/Vineflower/vineflower/issues with a copy of the class file (if you have the rights to distribute it!)
      // java.lang.RuntimeException: parsing failure!
      //   at org.jetbrains.java.decompiler.modules.decompiler.decompose.DomHelper.parseGraph(DomHelper.java:211)
      //   at org.jetbrains.java.decompiler.main.rels.MethodProcessor.codeToJava(MethodProcessor.java:166)
      //
      // Bytecode:
      // 00: getstatic qeaa361f143ee4a0894bd168fd9b30c66/qf4ccf8f5435d4a78bdca4d6a018b578e/aabbabbab.ab I
      // 03: istore 2
      // 04: aload 0
      // 05: iload 2
      // 06: ifne 11
      // 09: ifnull 31
      // 0c: goto 10
      // 0f: athrow
      // 10: aload 0
      // 11: getfield net/minecraft/class_310.field_1724 Lnet/minecraft/class_746;
      // 14: iload 2
      // 15: ifne 20
      // 18: ifnull 31
      // 1b: goto 1f
      // 1e: athrow
      // 1f: aload 1
      // 20: invokevirtual net/minecraft/class_1309.method_5628 ()I
      // 23: iload 2
      // 24: ifne 3f
      // 27: getstatic qeaa361f143ee4a0894bd168fd9b30c66/qf4ccf8f5435d4a78bdca4d6a018b578e/baaabab.aab I
      // 2a: if_icmpeq 34
      // 2d: goto 31
      // 30: athrow
      // 31: bipush 0
      // 32: ireturn
      // 33: athrow
      // 34: aload 0
      // 35: getfield net/minecraft/class_310.field_1724 Lnet/minecraft/class_746;
      // 38: getfield net/minecraft/class_746.field_6012 I
      // 3b: getstatic qeaa361f143ee4a0894bd168fd9b30c66/qf4ccf8f5435d4a78bdca4d6a018b578e/baaabab.aba I
      // 3e: isub
      // 3f: istore 3
      // 40: iload 2
      // 41: ifne 7b
      // 44: iload 3
      // 45: iflt 61
      // 48: goto 4c
      // 4b: athrow
      // 4c: iload 3
      // 4d: iload 2
      // 4e: ifne 80
      // 51: goto 55
      // 54: athrow
      // 55: getstatic qeaa361f143ee4a0894bd168fd9b30c66/qf4ccf8f5435d4a78bdca4d6a018b578e/baaabab.aaa I
      // 58: bipush 1
      // 59: isub
      // 5a: if_icmplt 7d
      // 5d: goto 61
      // 60: athrow
      // 61: ldc_w 1445519069
      // 64: ldc_w 1665555713
      // 67: ldc_w 1009837775
      // 6a: ixor
      // 6b: invokestatic qeaa361f143ee4a0894bd168fd9b30c66/qf4ccf8f5435d4a78bdca4d6a018b578e/baaabab.a (II)I
      // 6e: ldc2_w 3831304174097586591
      // 71: invokestatic qeaa361f143ee4a0894bd168fd9b30c66/qf4ccf8f5435d4a78bdca4d6a018b578e/baaabab.aaa (IJ)I
      // 74: putstatic qeaa361f143ee4a0894bd168fd9b30c66/qf4ccf8f5435d4a78bdca4d6a018b578e/baaabab.aab I
      // 77: goto 7b
      // 7a: athrow
      // 7b: bipush 0
      // 7c: ireturn
      // 7d: getstatic qeaa361f143ee4a0894bd168fd9b30c66/qf4ccf8f5435d4a78bdca4d6a018b578e/baaabab.baa Z
      // 80: iload 2
      // 81: ifne f4
      // 84: ifne f3
      // 87: goto 8b
      // 8a: athrow
      // 8b: aload 1
      // 8c: iload 2
      // 8d: ifne af
      // 90: goto 94
      // 93: athrow
      // 94: invokevirtual net/minecraft/class_1309.method_6115 ()Z
      // 97: ifne aa
      // 9a: goto 9e
      // 9d: athrow
      // 9e: bipush 1
      // 9f: putstatic qeaa361f143ee4a0894bd168fd9b30c66/qf4ccf8f5435d4a78bdca4d6a018b578e/baaabab.baa Z
      // a2: iload 2
      // a3: ifeq f3
      // a6: goto aa
      // a9: athrow
      // aa: aload 1
      // ab: goto af
      // ae: athrow
      // af: invokevirtual net/minecraft/class_1309.method_6048 ()I
      // b2: iload 2
      // b3: ifne f2
      // b6: getstatic qeaa361f143ee4a0894bd168fd9b30c66/qf4ccf8f5435d4a78bdca4d6a018b578e/baaabab.ba I
      // b9: if_icmplt d7
      // bc: goto c0
      // bf: athrow
      // c0: iload 3
      // c1: iload 2
      // c2: ifne f4
      // c5: goto c9
      // c8: athrow
      // c9: aload 0
      // ca: invokestatic qeaa361f143ee4a0894bd168fd9b30c66/qf4ccf8f5435d4a78bdca4d6a018b578e/baaabab.abab (Lnet/minecraft/class_310;)I
      // cd: invokestatic qeaa361f143ee4a0894bd168fd9b30c66/qf4ccf8f5435d4a78bdca4d6a018b578e/baaabab.abb (II)Z
      // d0: ifeq f3
      // d3: goto d7
      // d6: athrow
      // d7: ldc_w 1445519068
      // da: ldc_w 1665555713
      // dd: ldc_w 215289883
      // e0: ixor
      // e1: invokestatic qeaa361f143ee4a0894bd168fd9b30c66/qf4ccf8f5435d4a78bdca4d6a018b578e/baaabab.a (II)I
      // e4: ldc2_w 3831304174097586591
      // e7: invokestatic qeaa361f143ee4a0894bd168fd9b30c66/qf4ccf8f5435d4a78bdca4d6a018b578e/baaabab.aaa (IJ)I
      // ea: putstatic qeaa361f143ee4a0894bd168fd9b30c66/qf4ccf8f5435d4a78bdca4d6a018b578e/baaabab.aab I
      // ed: bipush 0
      // ee: goto f2
      // f1: athrow
      // f2: ireturn
      // f3: bipush 1
      // f4: ireturn
   }

   static boolean abb(int param0, int param1) {
      // $VF: Couldn't be decompiled
      // Please report this to the Vineflower issue tracker, at https://github.com/Vineflower/vineflower/issues with a copy of the class file (if you have the rights to distribute it!)
      // java.lang.RuntimeException: parsing failure!
      //   at org.jetbrains.java.decompiler.modules.decompiler.decompose.DomHelper.parseGraph(DomHelper.java:211)
      //   at org.jetbrains.java.decompiler.main.rels.MethodProcessor.codeToJava(MethodProcessor.java:166)
      //
      // Bytecode:
      // 00: getstatic qeaa361f143ee4a0894bd168fd9b30c66/qf4ccf8f5435d4a78bdca4d6a018b578e/aabbabbab.ab I
      // 03: istore 2
      // 04: iload 0
      // 05: iload 2
      // 06: ifne 2f
      // 09: iload 1
      // 0a: bipush 0
      // 0b: ldc_w 1445519071
      // 0e: ldc_w 1881123557
      // 11: ldc_w -247663730
      // 14: ixor
      // 15: invokestatic qeaa361f143ee4a0894bd168fd9b30c66/qf4ccf8f5435d4a78bdca4d6a018b578e/baaabab.a (II)I
      // 18: ldc2_w 5572221016596317741
      // 1b: invokestatic qeaa361f143ee4a0894bd168fd9b30c66/qf4ccf8f5435d4a78bdca4d6a018b578e/baaabab.aaa (IJ)I
      // 1e: invokestatic net/minecraft/class_3532.method_15340 (III)I
      // 21: bipush 3
      // 22: iadd
      // 23: if_icmple 32
      // 26: goto 2a
      // 29: athrow
      // 2a: bipush 1
      // 2b: goto 2f
      // 2e: athrow
      // 2f: goto 33
      // 32: bipush 0
      // 33: ireturn
   }

   public static void baa(class_310 param0, class_1309 param1, byte param2) {
      // $VF: Couldn't be decompiled
      // Please report this to the Vineflower issue tracker, at https://github.com/Vineflower/vineflower/issues with a copy of the class file (if you have the rights to distribute it!)
      // java.lang.RuntimeException: parsing failure!
      //   at org.jetbrains.java.decompiler.modules.decompiler.decompose.DomHelper.parseGraph(DomHelper.java:211)
      //   at org.jetbrains.java.decompiler.main.rels.MethodProcessor.codeToJava(MethodProcessor.java:166)
      //
      // Bytecode:
      // 00: ldc_w -123125789
      // 03: istore 4
      // 05: getstatic qeaa361f143ee4a0894bd168fd9b30c66/qf4ccf8f5435d4a78bdca4d6a018b578e/aabbabbab.ab I
      // 08: istore 3
      // 09: aload 1
      // 0a: ifnonnull 0f
      // 0d: return
      // 0e: athrow
      // 0f: iload 2
      // 10: iload 3
      // 11: ifne 52
      // 14: ldc_w 1445519070
      // 17: iload 4
      // 19: ldc_w 1743131242
      // 1c: ixor
      // 1d: invokestatic qeaa361f143ee4a0894bd168fd9b30c66/qf4ccf8f5435d4a78bdca4d6a018b578e/baaabab.a (II)I
      // 20: ldc2_w 2941143709953167346
      // 23: invokestatic qeaa361f143ee4a0894bd168fd9b30c66/qf4ccf8f5435d4a78bdca4d6a018b578e/baaabab.aaa (IJ)I
      // 26: if_icmpne 4d
      // 29: goto 2d
      // 2c: athrow
      // 2d: aload 0
      // 2e: aload 1
      // 2f: ldc_w 1445519065
      // 32: iload 4
      // 34: ldc_w 419701006
      // 37: ixor
      // 38: invokestatic qeaa361f143ee4a0894bd168fd9b30c66/qf4ccf8f5435d4a78bdca4d6a018b578e/baaabab.a (II)I
      // 3b: ldc2_w 1404041744761380408
      // 3e: invokestatic qeaa361f143ee4a0894bd168fd9b30c66/qf4ccf8f5435d4a78bdca4d6a018b578e/baaabab.aaa (IJ)I
      // 41: bipush 1
      // 42: invokestatic qeaa361f143ee4a0894bd168fd9b30c66/qf4ccf8f5435d4a78bdca4d6a018b578e/baaabab.bab (Lnet/minecraft/class_310;Lnet/minecraft/class_1309;IZ)V
      // 45: iload 3
      // 46: ifeq c9
      // 49: goto 4d
      // 4c: athrow
      // 4d: iload 2
      // 4e: goto 52
      // 51: athrow
      // 52: iload 3
      // 53: ifne 7f
      // 56: ldc_w 1445519064
      // 59: iload 4
      // 5b: ldc_w 1056380128
      // 5e: ixor
      // 5f: invokestatic qeaa361f143ee4a0894bd168fd9b30c66/qf4ccf8f5435d4a78bdca4d6a018b578e/baaabab.a (II)I
      // 62: ldc2_w 5133420344306413285
      // 65: invokestatic qeaa361f143ee4a0894bd168fd9b30c66/qf4ccf8f5435d4a78bdca4d6a018b578e/baaabab.aaa (IJ)I
      // 68: if_icmpne c9
      // 6b: goto 6f
      // 6e: athrow
      // 6f: aload 1
      // 70: iload 3
      // 71: ifne 9f
      // 74: goto 78
      // 77: athrow
      // 78: invokevirtual net/minecraft/class_1309.method_5628 ()I
      // 7b: goto 7f
      // 7e: athrow
      // 7f: getstatic qeaa361f143ee4a0894bd168fd9b30c66/qf4ccf8f5435d4a78bdca4d6a018b578e/baaabab.aab I
      // 82: if_icmpne 9e
      // 85: ldc_w 1445519067
      // 88: iload 4
      // 8a: ldc_w 874267691
      // 8d: ixor
      // 8e: invokestatic qeaa361f143ee4a0894bd168fd9b30c66/qf4ccf8f5435d4a78bdca4d6a018b578e/baaabab.a (II)I
      // 91: ldc2_w 3831304174097586591
      // 94: invokestatic qeaa361f143ee4a0894bd168fd9b30c66/qf4ccf8f5435d4a78bdca4d6a018b578e/baaabab.aaa (IJ)I
      // 97: putstatic qeaa361f143ee4a0894bd168fd9b30c66/qf4ccf8f5435d4a78bdca4d6a018b578e/baaabab.aab I
      // 9a: goto 9e
      // 9d: athrow
      // 9e: aload 1
      // 9f: invokevirtual net/minecraft/class_1309.method_5628 ()I
      // a2: iload 3
      // a3: ifne c6
      // a6: getstatic qeaa361f143ee4a0894bd168fd9b30c66/qf4ccf8f5435d4a78bdca4d6a018b578e/baaabab.ab I
      // a9: if_icmpne c9
      // ac: goto b0
      // af: athrow
      // b0: ldc_w 1445519066
      // b3: iload 4
      // b5: ldc_w -104774849
      // b8: ixor
      // b9: invokestatic qeaa361f143ee4a0894bd168fd9b30c66/qf4ccf8f5435d4a78bdca4d6a018b578e/baaabab.a (II)I
      // bc: ldc2_w 3831304174097586591
      // bf: invokestatic qeaa361f143ee4a0894bd168fd9b30c66/qf4ccf8f5435d4a78bdca4d6a018b578e/baaabab.aaa (IJ)I
      // c2: goto c6
      // c5: athrow
      // c6: putstatic qeaa361f143ee4a0894bd168fd9b30c66/qf4ccf8f5435d4a78bdca4d6a018b578e/baaabab.ab I
      // c9: return
   }

   private static void bab(class_310 param0, class_1309 param1, int param2, boolean param3) {
      // $VF: Couldn't be decompiled
      // Please report this to the Vineflower issue tracker, at https://github.com/Vineflower/vineflower/issues with a copy of the class file (if you have the rights to distribute it!)
      // java.lang.RuntimeException: parsing failure!
      //   at org.jetbrains.java.decompiler.modules.decompiler.decompose.DomHelper.parseGraph(DomHelper.java:211)
      //   at org.jetbrains.java.decompiler.main.rels.MethodProcessor.codeToJava(MethodProcessor.java:166)
      //
      // Bytecode:
      // 00: getstatic qeaa361f143ee4a0894bd168fd9b30c66/qf4ccf8f5435d4a78bdca4d6a018b578e/aabbabbab.ab I
      // 03: istore 4
      // 05: aload 0
      // 06: iload 4
      // 08: ifne 13
      // 0b: ifnull 37
      // 0e: goto 12
      // 11: athrow
      // 12: aload 0
      // 13: getfield net/minecraft/class_310.field_1724 Lnet/minecraft/class_746;
      // 16: iload 4
      // 18: ifne 23
      // 1b: ifnull 37
      // 1e: goto 22
      // 21: athrow
      // 22: aload 1
      // 23: ifnull 37
      // 26: iload 2
      // 27: iload 4
      // 29: ifne 62
      // 2c: goto 30
      // 2f: athrow
      // 30: ifgt 38
      // 33: goto 37
      // 36: athrow
      // 37: return
      // 38: aload 1
      // 39: invokevirtual net/minecraft/class_1309.method_5628 ()I
      // 3c: putstatic qeaa361f143ee4a0894bd168fd9b30c66/qf4ccf8f5435d4a78bdca4d6a018b578e/baaabab.aab I
      // 3f: aload 0
      // 40: getfield net/minecraft/class_310.field_1724 Lnet/minecraft/class_746;
      // 43: getfield net/minecraft/class_746.field_6012 I
      // 46: putstatic qeaa361f143ee4a0894bd168fd9b30c66/qf4ccf8f5435d4a78bdca4d6a018b578e/baaabab.aba I
      // 49: iload 2
      // 4a: putstatic qeaa361f143ee4a0894bd168fd9b30c66/qf4ccf8f5435d4a78bdca4d6a018b578e/baaabab.aaa I
      // 4d: bipush 0
      // 4e: iload 4
      // 50: ifne 7a
      // 53: aload 1
      // 54: invokevirtual net/minecraft/class_1309.method_6048 ()I
      // 57: invokestatic java/lang/Math.max (II)I
      // 5a: putstatic qeaa361f143ee4a0894bd168fd9b30c66/qf4ccf8f5435d4a78bdca4d6a018b578e/baaabab.ba I
      // 5d: iload 3
      // 5e: goto 62
      // 61: athrow
      // 62: ifne 79
      // 65: aload 1
      // 66: invokevirtual net/minecraft/class_1309.method_6115 ()Z
      // 69: iload 4
      // 6b: ifne 7a
      // 6e: goto 72
      // 71: athrow
      // 72: ifne 7d
      // 75: goto 79
      // 78: athrow
      // 79: bipush 1
      // 7a: goto 7e
      // 7d: bipush 0
      // 7e: putstatic qeaa361f143ee4a0894bd168fd9b30c66/qf4ccf8f5435d4a78bdca4d6a018b578e/baaabab.baa Z
      // 81: return
   }

   static boolean bba(int param0, int param1, int param2) {
      // $VF: Couldn't be decompiled
      // Please report this to the Vineflower issue tracker, at https://github.com/Vineflower/vineflower/issues with a copy of the class file (if you have the rights to distribute it!)
      // java.lang.RuntimeException: parsing failure!
      //   at org.jetbrains.java.decompiler.modules.decompiler.decompose.DomHelper.parseGraph(DomHelper.java:211)
      //   at org.jetbrains.java.decompiler.main.rels.MethodProcessor.codeToJava(MethodProcessor.java:166)
      //
      // Bytecode:
      // 00: getstatic qeaa361f143ee4a0894bd168fd9b30c66/qf4ccf8f5435d4a78bdca4d6a018b578e/aabbabbab.ab I
      // 03: istore 3
      // 04: iload 1
      // 05: iload 3
      // 06: ifne 3b
      // 09: ifgt 13
      // 0c: goto 10
      // 0f: athrow
      // 10: bipush 1
      // 11: ireturn
      // 12: athrow
      // 13: bipush 0
      // 14: iload 0
      // 15: invokestatic java/lang/Math.max (II)I
      // 18: iload 3
      // 19: ifne 44
      // 1c: iload 2
      // 1d: bipush 0
      // 1e: ldc_w 1445519061
      // 21: ldc_w 66492366
      // 24: ldc_w -1851352783
      // 27: ixor
      // 28: invokestatic qeaa361f143ee4a0894bd168fd9b30c66/qf4ccf8f5435d4a78bdca4d6a018b578e/baaabab.a (II)I
      // 2b: ldc2_w 965814603174916233
      // 2e: invokestatic qeaa361f143ee4a0894bd168fd9b30c66/qf4ccf8f5435d4a78bdca4d6a018b578e/baaabab.aaa (IJ)I
      // 31: invokestatic net/minecraft/class_3532.method_15340 (III)I
      // 34: iadd
      // 35: bipush 1
      // 36: iadd
      // 37: goto 3b
      // 3a: athrow
      // 3b: iload 1
      // 3c: if_icmplt 47
      // 3f: bipush 1
      // 40: goto 44
      // 43: athrow
      // 44: goto 48
      // 47: bipush 0
      // 48: ireturn
   }

   private static int a(int var0, int var1) {
      int var2 = aaba[var0 ^ 1445519101] ^ var1 ^ var0;
      var2 -= 22002;
      var2 ^= 12350;
      var2 -= 57773;
      var2 -= 35864;
      var2 += 45664;
      var2 ^= 19490;
      return var2 ^ 63378;
   }

   public static void bbb(class_1309 param0, int param1) {
      // $VF: Couldn't be decompiled
      // Please report this to the Vineflower issue tracker, at https://github.com/Vineflower/vineflower/issues with a copy of the class file (if you have the rights to distribute it!)
      // java.lang.RuntimeException: parsing failure!
      //   at org.jetbrains.java.decompiler.modules.decompiler.decompose.DomHelper.parseGraph(DomHelper.java:211)
      //   at org.jetbrains.java.decompiler.main.rels.MethodProcessor.codeToJava(MethodProcessor.java:166)
      //
      // Bytecode:
      // 00: getstatic qeaa361f143ee4a0894bd168fd9b30c66/qf4ccf8f5435d4a78bdca4d6a018b578e/aabbabbab.ab I
      // 03: istore 2
      // 04: aload 0
      // 05: ifnull 29
      // 08: iload 1
      // 09: iload 2
      // 0a: ifne 37
      // 0d: goto 11
      // 10: athrow
      // 11: ifeq 2b
      // 14: goto 18
      // 17: athrow
      // 18: iload 1
      // 19: iload 2
      // 1a: ifne 37
      // 1d: goto 21
      // 20: athrow
      // 21: bipush 3
      // 22: if_icmpeq 2b
      // 25: goto 29
      // 28: athrow
      // 29: return
      // 2a: athrow
      // 2b: aload 0
      // 2c: iload 2
      // 2d: ifne 3b
      // 30: invokevirtual net/minecraft/class_1309.method_6115 ()Z
      // 33: goto 37
      // 36: athrow
      // 37: ifeq 5c
      // 3a: aload 0
      // 3b: iload 2
      // 3c: ifne 56
      // 3f: invokevirtual net/minecraft/class_1309.method_6048 ()I
      // 42: bipush 1
      // 43: if_icmple 5c
      // 46: goto 4a
      // 49: athrow
      // 4a: aload 0
      // 4b: invokevirtual net/minecraft/class_1309.method_5628 ()I
      // 4e: putstatic qeaa361f143ee4a0894bd168fd9b30c66/qf4ccf8f5435d4a78bdca4d6a018b578e/baaabab.ab I
      // 51: aload 0
      // 52: goto 56
      // 55: athrow
      // 56: invokevirtual net/minecraft/class_1309.method_6048 ()I
      // 59: putstatic qeaa361f143ee4a0894bd168fd9b30c66/qf4ccf8f5435d4a78bdca4d6a018b578e/baaabab.a I
      // 5c: return
   }

   private baaabab() {
   }

   public static int aaaa(class_1799 param0, class_1799 param1) {
      // $VF: Couldn't be decompiled
      // Please report this to the Vineflower issue tracker, at https://github.com/Vineflower/vineflower/issues with a copy of the class file (if you have the rights to distribute it!)
      // java.lang.RuntimeException: parsing failure!
      //   at org.jetbrains.java.decompiler.modules.decompiler.decompose.DomHelper.parseGraph(DomHelper.java:211)
      //   at org.jetbrains.java.decompiler.main.rels.MethodProcessor.codeToJava(MethodProcessor.java:166)
      //
      // Bytecode:
      // 00: getstatic qeaa361f143ee4a0894bd168fd9b30c66/qf4ccf8f5435d4a78bdca4d6a018b578e/aabbabbab.ab I
      // 03: istore 2
      // 04: aload 0
      // 05: iload 2
      // 06: ifne 11
      // 09: ifnull 1f
      // 0c: goto 10
      // 0f: athrow
      // 10: aload 0
      // 11: iload 2
      // 12: ifne 2b
      // 15: invokevirtual net/minecraft/class_1799.method_7960 ()Z
      // 18: ifeq 24
      // 1b: goto 1f
      // 1e: athrow
      // 1f: aconst_null
      // 20: goto 2e
      // 23: athrow
      // 24: aload 0
      // 25: getstatic net/minecraft/class_9334.field_55878 Lnet/minecraft/class_9331;
      // 28: invokevirtual net/minecraft/class_1799.method_58694 (Lnet/minecraft/class_9331;)Ljava/lang/Object;
      // 2b: checkcast net/minecraft/class_10590
      // 2e: astore 3
      // 2f: aload 3
      // 30: iload 2
      // 31: ifne 3c
      // 34: ifnull 4c
      // 37: goto 3b
      // 3a: athrow
      // 3b: aload 3
      // 3c: invokevirtual net/minecraft/class_10590.comp_3602 ()F
      // 3f: fconst_0
      // 40: fcmpg
      // 41: iload 2
      // 42: ifne 4d
      // 45: ifgt 4e
      // 48: goto 4c
      // 4b: athrow
      // 4c: bipush 0
      // 4d: ireturn
      // 4e: aload 1
      // 4f: invokestatic qeaa361f143ee4a0894bd168fd9b30c66/qf4ccf8f5435d4a78bdca4d6a018b578e/baaabab.abaa (Lnet/minecraft/class_1799;)Lnet/minecraft/class_10707;
      // 52: astore 4
      // 54: aload 4
      // 56: iload 2
      // 57: ifne 68
      // 5a: ifnonnull 66
      // 5d: goto 61
      // 60: athrow
      // 61: fconst_1
      // 62: goto 6b
      // 65: athrow
      // 66: aload 4
      // 68: invokevirtual net/minecraft/class_10707.comp_3587 ()F
      // 6b: fstore 5
      // 6d: aload 3
      // 6e: invokevirtual net/minecraft/class_10590.comp_3602 ()F
      // 71: fload 5
      // 73: fmul
      // 74: fstore 6
      // 76: fload 6
      // 78: fconst_0
      // 79: iload 2
      // 7a: ifne 8e
      // 7d: fcmpl
      // 7e: ifle 95
      // 81: goto 85
      // 84: athrow
      // 85: fload 6
      // 87: ldc_w 20.0
      // 8a: goto 8e
      // 8d: athrow
      // 8e: fmul
      // 8f: invokestatic java/lang/Math.round (F)I
      // 92: goto 96
      // 95: bipush 0
      // 96: ireturn
   }

   static {
      int var18 = -806117446;
      String[] var10 = new String[4];
      int var11 = 0;
      int var10001 = "Pũ骢ڒ苄ᨥ\ue27dሸ訢ދዼ៌㈍ᔴ㨶ᡉ誢ೲ鋅စ艻ຸ먣Ы\uf2f9બ눏པ\u0a31\u0ee9报ݲˀὅ㩼Ὸਤᴫ\ufafb\u1aecȌ᪴侮᭩檢ྲ싇ᬅ剸ᤸ刢Ꭻ\ue2fdᣌሉ৴ᨶᮩ劢ῒ櫂ą喙\u1ad8稥ᳫ櫿\u074c戍\u1774ꨱὉ抡߲\u0ac6ๅ詹មꈦΎ竻\nᴋ䈧\u0cd0ቄͧ嫼ᇚኢῩ\uda7c\u0010썻䘑퓠晲쩗黋쩊⚓잙湌싞麿\udda6\ude81휻\uf613\nﮖ\ue55e\uea4d딽\ue5faﶅ\uf747뗛若紅"
         .length();
      short var13 = 7464;
      int var12 = 0;
      int var9 = var10001;
      String var8 = "Pũ骢ڒ苄ᨥ\ue27dሸ訢ދዼ៌㈍ᔴ㨶ᡉ誢ೲ鋅စ艻ຸ먣Ы\uf2f9બ눏པ\u0a31\u0ee9报ݲˀὅ㩼Ὸਤᴫ\ufafb\u1aecȌ᪴侮᭩檢ྲ싇ᬅ剸ᤸ刢Ꭻ\ue2fdᣌሉ৴ᨶᮩ劢ῒ櫂ą喙\u1ad8稥ᳫ櫿\u074c戍\u1774ꨱὉ抡߲\u0ac6ๅ詹មꈦΎ竻\nᴋ䈧\u0cd0ቄͧ嫼ᇚኢῩ\uda7c\u0010썻䘑퓠晲쩗黋쩊⚓잙湌싞麿\udda6\ude81휻\uf613\nﮖ\ue55e\uea4d딽\ue5faﶅ\uf747뗛若紅";

      do {
         char var14 = var8.charAt(var12);
         String var10000 = var8.substring(var12 + 1, var12 + 1 + var14);
         int var16 = 0;
         char[] var15 = var10000.toCharArray();

         do {
            int var17 = var15[var16];

            var17 = (char)(switch (var16 % 7) {
               default -> 33;
               case 1 -> 163;
               case 2 -> 250;
               case 3 -> 196;
               case 4 -> 13;
               case 5 -> 124;
               case 6 -> 48;
            }) ^ var17;
            if (var16 % 2 == 0) {
               var15[var16] = (char)((var17 >>> 5 | var17 << 11) & 65535 ^ var13);
            } else {
               var15[var16] = (char)((var17 << 5 | var17 >>> 11) & 65535 ^ var13);
            }
         } while (++var16 < var15.length);

         var10[var11] = new String(var15);
         var11++;
         var12 = var12 + var14 + 1;
      } while (var12 < var9);

      aabb = var10;
      abaa = new Object[var10.length];
      byte var22 = 0;
      int var24 = 0;
      aaba = new int[42];
      byte[] var10002 = "þ\u009anÁtp\tvRX\u0011¯\u0086\u0002\u0095Ò(\u0014shÊ2_H®ê\u001f\u000bOå\u001bWªß\u0083Õóx0ÕÒ\\\u0082\u0014Êä=¬>r2\r5°$Ç±úr8\u0082\u0081\u0085ÀÈ¾;\u0096Î¦«ã¯)ð¤\u0085*´5hÉÓ\u008bQ\u0016B\u000f\u0086U[F\tÎ\u0093L).ÀÛ\u0010¦7y*ÛºO\u0082O\u0098Vbá·\u0006Uì\\ÿêSk>\u0082wÙ¯\u009e\u0088-à®mÛ5@Ý\u008fô^±íÞ S z\u0007£\u0004d\rKíàÀ\u0096êõS®Ó0¡æd,"
         .getBytes("ISO-8859-1");

      int var44;
      do {
         aaba[var22] = ((var10002[var24] & 255) << 24 | (var10002[var24 + 1] & 255) << 16 | (var10002[var24 + 2] & 255) << 8 | var10002[var24 + 3] & 255)
            ^ -1747453601;
         var22 += 1;
         var44 = var24 + 4;
         var24 += 4;
      } while (var44 < var10002.length);

      long var0 = 5618818405470047282L;
      long[] var6 = new long[a(1445519097, var18 ^ 639194725)];
      int var3 = 0;
      String var4;
      int var5 = (var4 = abba(1873681227, (short)-10684, 558037101, 2081630574, 27979, 7238)).length();
      byte var2 = 0;

      label67:
      while (true) {
         var24 = var2;
         var2 += 8;
         byte[] var7 = var4.substring(var24, var2).getBytes(abba(1873681226, (short)-22549, 1515195948, 110438437, (short)-21477, 19287));
         long[] var23 = var6;
         var24 = var3++;
         long var35 = (var7[0] & 255L) << a(1445519096, var18 ^ -1002472560)
            | (var7[1] & 255L) << a(1445519099, var18 ^ -1595458600)
            | (var7[2] & 255L) << a(1445519098, var18 ^ 1105739773)
            | (var7[3] & 255L) << a(1445519093, var18 ^ -1529698440)
            | (var7[4] & 255L) << a(1445519092, var18 ^ -42658335)
            | (var7[5] & 255L) << a(1445519095, var18 ^ -598628565)
            | (var7[a(1445519094, var18 ^ -991356760)] & 255L) << a(1445519089, var18 ^ 813635340)
            | var7[a(1445519088, var18 ^ 1002242502)] & 255L;
         byte var45 = -1;

         while (true) {
            long var54 = var35 ^ var0;
            switch (var45) {
               case 0:
                  var23[var24] = var54;
                  if (var2 >= var5) {
                     aaab = var6;
                     bb = new Integer[a(1445519082, var18 ^ 130266706)];
                     aa = aaa(a(1445519077, var18 ^ 656648552), 7699798113757657367L);
                     bbb = aaa(a(1445519076, var18 ^ 514547613), 5439142749715752686L);
                     bba = aaa(a(1445519079, var18 ^ 617940554), 4747380536385112905L);
                     bab = aaa(a(1445519078, var18 ^ -1941776850), 7423071182918204638L);
                     aab = aaa(a(1445519073, var18 ^ 1827454638), 3831304174097586591L);
                     aba = aaa(a(1445519072, var18 ^ 1541494102), 3831304174097586591L);
                     ab = aaa(a(1445519075, var18 ^ -463576428), 3831304174097586591L);
                     a = aaa(a(1445519074, var18 ^ -1938108412), 3831304174097586591L);
                     return;
                  }
                  break;
               default:
                  var23[var24] = var54;
                  if (var2 < var5) {
                     continue label67;
                  }

                  var5 = (var4 = abba(1873681225, 14405, 497830259, -94660000, 6920, 4253)).length();
                  var2 = 0;
            }

            byte var29 = var2;
            var2 += 8;
            var7 = var4.substring(var29, var2).getBytes(abba(1873681224, (short)-24976, 1482809126, -699898983, 24359, (short)-2960));
            var23 = var6;
            var24 = var3++;
            var35 = (var7[0] & 255L) << a(1445519091, var18 ^ -1074309397)
               | (var7[1] & 255L) << a(1445519090, var18 ^ -1936940774)
               | (var7[2] & 255L) << a(1445519085, var18 ^ -961339605)
               | (var7[3] & 255L) << a(1445519084, var18 ^ -1062498473)
               | (var7[4] & 255L) << a(1445519087, var18 ^ -1591421557)
               | (var7[5] & 255L) << a(1445519086, var18 ^ -1960341229)
               | (var7[a(1445519081, var18 ^ 1724184208)] & 255L) << a(1445519080, var18 ^ 1595631383)
               | var7[a(1445519083, var18 ^ -2007466404)] & 255L;
            var45 = 0;
         }
      }
   }

   public static boolean aaab(class_310 param0, class_1309 param1) {
      // $VF: Couldn't be decompiled
      // Please report this to the Vineflower issue tracker, at https://github.com/Vineflower/vineflower/issues with a copy of the class file (if you have the rights to distribute it!)
      // java.lang.RuntimeException: parsing failure!
      //   at org.jetbrains.java.decompiler.modules.decompiler.decompose.DomHelper.parseGraph(DomHelper.java:211)
      //   at org.jetbrains.java.decompiler.main.rels.MethodProcessor.codeToJava(MethodProcessor.java:166)
      //
      // Bytecode:
      // 00: getstatic qeaa361f143ee4a0894bd168fd9b30c66/qf4ccf8f5435d4a78bdca4d6a018b578e/aabbabbab.ab I
      // 03: istore 2
      // 04: aload 0
      // 05: iload 2
      // 06: ifne 11
      // 09: ifnull 33
      // 0c: goto 10
      // 0f: athrow
      // 10: aload 0
      // 11: iload 2
      // 12: ifne 24
      // 15: getfield net/minecraft/class_310.field_1724 Lnet/minecraft/class_746;
      // 18: ifnull 33
      // 1b: goto 1f
      // 1e: athrow
      // 1f: aload 0
      // 20: goto 24
      // 23: athrow
      // 24: aload 1
      // 25: invokestatic qeaa361f143ee4a0894bd168fd9b30c66/qf4ccf8f5435d4a78bdca4d6a018b578e/baaabab.ba (Lnet/minecraft/class_310;Lnet/minecraft/class_1309;)Z
      // 28: iload 2
      // 29: ifne 4d
      // 2c: ifeq 36
      // 2f: goto 33
      // 32: athrow
      // 33: bipush 0
      // 34: ireturn
      // 35: athrow
      // 36: aload 1
      // 37: aload 0
      // 38: getfield net/minecraft/class_310.field_1724 Lnet/minecraft/class_746;
      // 3b: invokevirtual net/minecraft/class_746.method_73189 ()Lnet/minecraft/class_243;
      // 3e: iload 2
      // 3f: ifne 5b
      // 42: aload 0
      // 43: invokestatic qeaa361f143ee4a0894bd168fd9b30c66/qf4ccf8f5435d4a78bdca4d6a018b578e/baaabab.abab (Lnet/minecraft/class_310;)I
      // 46: invokestatic qeaa361f143ee4a0894bd168fd9b30c66/qf4ccf8f5435d4a78bdca4d6a018b578e/baaabab.aab (Lnet/minecraft/class_1309;Lnet/minecraft/class_243;I)Z
      // 49: goto 4d
      // 4c: athrow
      // 4d: ifeq 53
      // 50: bipush 1
      // 51: ireturn
      // 52: athrow
      // 53: aload 1
      // 54: aload 0
      // 55: getfield net/minecraft/class_310.field_1724 Lnet/minecraft/class_746;
      // 58: invokestatic qeaa361f143ee4a0894bd168fd9b30c66/qf4ccf8f5435d4a78bdca4d6a018b578e/baaabab.b (Lnet/minecraft/class_746;)Lnet/minecraft/class_243;
      // 5b: aload 0
      // 5c: invokestatic qeaa361f143ee4a0894bd168fd9b30c66/qf4ccf8f5435d4a78bdca4d6a018b578e/baaabab.abab (Lnet/minecraft/class_310;)I
      // 5f: invokestatic qeaa361f143ee4a0894bd168fd9b30c66/qf4ccf8f5435d4a78bdca4d6a018b578e/baaabab.aab (Lnet/minecraft/class_1309;Lnet/minecraft/class_243;I)Z
      // 62: ireturn
   }

   private static float aaba(class_10707 var0) {
      int var10000 = aabbabbab.ab;
      float var2 = 0.0F;
      Iterator var3 = var0.comp_3588().iterator();
      int var1 = var10000;

      while (true) {
         if (var3.hasNext()) {
            class_10708 var4 = (class_10708)var3.next();
            var5 = var2;
            if (var1 != 0) {
               break;
            }

            var2 = Math.max(var2, var4.comp_3638());
            if (var1 == 0) {
               continue;
            }
         }

         var5 = var2;
         break;
      }

      return var5;
   }

   public static void aabb(class_310 var0, class_1309 var1, int var2) {
      bab(var0, var1, var2, false);
   }

   private static class_10707 abaa(class_1799 param0) {
      // $VF: Couldn't be decompiled
      // Please report this to the Vineflower issue tracker, at https://github.com/Vineflower/vineflower/issues with a copy of the class file (if you have the rights to distribute it!)
      // java.lang.RuntimeException: parsing failure!
      //   at org.jetbrains.java.decompiler.modules.decompiler.decompose.DomHelper.parseGraph(DomHelper.java:211)
      //   at org.jetbrains.java.decompiler.main.rels.MethodProcessor.codeToJava(MethodProcessor.java:166)
      //
      // Bytecode:
      // 00: getstatic qeaa361f143ee4a0894bd168fd9b30c66/qf4ccf8f5435d4a78bdca4d6a018b578e/aabbabbab.ab I
      // 03: istore 1
      // 04: aload 0
      // 05: iload 1
      // 06: ifne 11
      // 09: ifnull 1f
      // 0c: goto 10
      // 0f: athrow
      // 10: aload 0
      // 11: iload 1
      // 12: ifne 2b
      // 15: invokevirtual net/minecraft/class_1799.method_7960 ()Z
      // 18: ifeq 24
      // 1b: goto 1f
      // 1e: athrow
      // 1f: aconst_null
      // 20: goto 2e
      // 23: athrow
      // 24: aload 0
      // 25: getstatic net/minecraft/class_9334.field_56396 Lnet/minecraft/class_9331;
      // 28: invokevirtual net/minecraft/class_1799.method_58694 (Lnet/minecraft/class_9331;)Ljava/lang/Object;
      // 2b: checkcast net/minecraft/class_10707
      // 2e: areturn
   }

   public static int abab(class_310 param0) {
      // $VF: Couldn't be decompiled
      // Please report this to the Vineflower issue tracker, at https://github.com/Vineflower/vineflower/issues with a copy of the class file (if you have the rights to distribute it!)
      // java.lang.RuntimeException: parsing failure!
      //   at org.jetbrains.java.decompiler.modules.decompiler.decompose.DomHelper.parseGraph(DomHelper.java:211)
      //   at org.jetbrains.java.decompiler.main.rels.MethodProcessor.codeToJava(MethodProcessor.java:166)
      //
      // Bytecode:
      // 00: getstatic qeaa361f143ee4a0894bd168fd9b30c66/qf4ccf8f5435d4a78bdca4d6a018b578e/aabbabbab.ab I
      // 03: istore 1
      // 04: aload 0
      // 05: iload 1
      // 06: ifne 11
      // 09: ifnull 1f
      // 0c: goto 10
      // 0f: athrow
      // 10: aload 0
      // 11: iload 1
      // 12: ifne 23
      // 15: getfield net/minecraft/class_310.field_1724 Lnet/minecraft/class_746;
      // 18: ifnonnull 22
      // 1b: goto 1f
      // 1e: athrow
      // 1f: bipush 0
      // 20: ireturn
      // 21: athrow
      // 22: aload 0
      // 23: iload 1
      // 24: ifne 35
      // 27: invokevirtual net/minecraft/class_310.method_1562 ()Lnet/minecraft/class_634;
      // 2a: ifnonnull 34
      // 2d: goto 31
      // 30: athrow
      // 31: bipush 4
      // 32: ireturn
      // 33: athrow
      // 34: aload 0
      // 35: invokevirtual net/minecraft/class_310.method_1562 ()Lnet/minecraft/class_634;
      // 38: aload 0
      // 39: getfield net/minecraft/class_310.field_1724 Lnet/minecraft/class_746;
      // 3c: invokevirtual net/minecraft/class_746.method_5667 ()Ljava/util/UUID;
      // 3f: invokevirtual net/minecraft/class_634.method_2871 (Ljava/util/UUID;)Lnet/minecraft/class_640;
      // 42: astore 2
      // 43: aload 2
      // 44: iload 1
      // 45: ifne 55
      // 48: ifnonnull 54
      // 4b: goto 4f
      // 4e: athrow
      // 4f: bipush 0
      // 50: goto 58
      // 53: athrow
      // 54: aload 2
      // 55: invokevirtual net/minecraft/class_640.method_2959 ()I
      // 58: istore 3
      // 59: iload 3
      // 5a: iload 1
      // 5b: ifne 6b
      // 5e: ifgt 6a
      // 61: goto 65
      // 64: athrow
      // 65: bipush 4
      // 66: goto 74
      // 69: athrow
      // 6a: iload 3
      // 6b: i2d
      // 6c: ldc2_w 50.0
      // 6f: ddiv
      // 70: invokestatic java/lang/Math.ceil (D)D
      // 73: d2i
      // 74: istore 4
      // 76: iload 4
      // 78: bipush 0
      // 79: ldc_w 1445519060
      // 7c: ldc_w 633327203
      // 7f: ldc_w 1168603009
      // 82: ixor
      // 83: invokestatic qeaa361f143ee4a0894bd168fd9b30c66/qf4ccf8f5435d4a78bdca4d6a018b578e/baaabab.a (II)I
      // 86: ldc2_w 965814603174916233
      // 89: invokestatic qeaa361f143ee4a0894bd168fd9b30c66/qf4ccf8f5435d4a78bdca4d6a018b578e/baaabab.aaa (IJ)I
      // 8c: invokestatic net/minecraft/class_3532.method_15340 (III)I
      // 8f: ireturn
   }
}
