package nsc;

import net.fabricmc.api.EnvType;
import net.fabricmc.api.Environment;
import net.minecraft.class_1937;
import net.minecraft.class_238;
import net.minecraft.class_310;
import net.minecraft.class_746;

@Environment(EnvType.CLIENT)
final class aabbbbaba {
   private static final double aa = 0.05;
   private static final String[] aaab;
   static final double ab = 0.1;
   private static final double a = 0.42;
   private static final double ba = 0.65;
   private static final double bb = 0.15;
   private static final double aaa = 0.035;
   private static final Integer[] aab;
   private static final double aba = 0.05;
   private static final double abb = 0.02;
   private static final double baa = 1.15;
   private static final Object[] aaba;
   private static final long[] bab;
   private static final int[] aaaa;
   private static final int bba;
   private static final double bbb = 0.025;
   private static final double b = 0.74;

   private aabbbbaba() {
   }

   static abbbaabaa aa(class_310 param0, class_746 param1) {
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
      // 05: iload 2
      // 06: ifne 11
      // 09: ifnull 1f
      // 0c: goto 10
      // 0f: athrow
      // 10: aload 0
      // 11: getfield net/minecraft/class_310.field_1690 Lnet/minecraft/class_315;
      // 14: ifnull 1f
      // 17: aload 1
      // 18: ifnonnull 22
      // 1b: goto 1f
      // 1e: athrow
      // 1f: aconst_null
      // 20: areturn
      // 21: athrow
      // 22: fconst_0
      // 23: fstore 3
      // 24: fconst_0
      // 25: fstore 4
      // 27: aload 0
      // 28: iload 2
      // 29: ifne 41
      // 2c: getfield net/minecraft/class_310.field_1690 Lnet/minecraft/class_315;
      // 2f: getfield net/minecraft/class_315.field_1894 Lnet/minecraft/class_304;
      // 32: invokevirtual net/minecraft/class_304.method_1434 ()Z
      // 35: ifeq 40
      // 38: goto 3c
      // 3b: athrow
      // 3c: fload 3
      // 3d: fconst_1
      // 3e: fadd
      // 3f: fstore 3
      // 40: aload 0
      // 41: iload 2
      // 42: ifne 5a
      // 45: getfield net/minecraft/class_310.field_1690 Lnet/minecraft/class_315;
      // 48: getfield net/minecraft/class_315.field_1881 Lnet/minecraft/class_304;
      // 4b: invokevirtual net/minecraft/class_304.method_1434 ()Z
      // 4e: ifeq 59
      // 51: goto 55
      // 54: athrow
      // 55: fload 3
      // 56: fconst_1
      // 57: fsub
      // 58: fstore 3
      // 59: aload 0
      // 5a: getfield net/minecraft/class_310.field_1690 Lnet/minecraft/class_315;
      // 5d: iload 2
      // 5e: ifne 78
      // 61: getfield net/minecraft/class_315.field_1913 Lnet/minecraft/class_304;
      // 64: invokevirtual net/minecraft/class_304.method_1434 ()Z
      // 67: ifeq 74
      // 6a: goto 6e
      // 6d: athrow
      // 6e: fload 4
      // 70: fconst_1
      // 71: fadd
      // 72: fstore 4
      // 74: aload 0
      // 75: getfield net/minecraft/class_310.field_1690 Lnet/minecraft/class_315;
      // 78: getfield net/minecraft/class_315.field_1849 Lnet/minecraft/class_304;
      // 7b: invokevirtual net/minecraft/class_304.method_1434 ()Z
      // 7e: ifeq 87
      // 81: fload 4
      // 83: fconst_1
      // 84: fsub
      // 85: fstore 4
      // 87: aload 1
      // 88: fload 3
      // 89: fload 4
      // 8b: invokestatic qeaa361f143ee4a0894bd168fd9b30c66/qf4ccf8f5435d4a78bdca4d6a018b578e/aabbbbaba.bba (Lnet/minecraft/class_746;FF)Lqeaa361f143ee4a0894bd168fd9b30c66/qf4ccf8f5435d4a78bdca4d6a018b578e/abbbaabaa;
      // 8e: areturn
   }

   private static double ab(double var0, double var2, int var4, int var5) {
      try {
         if (var5 <= 1) {
            return (var0 + var2) * 0.5;
         }
      } catch (MatchException var6) {
         throw var6;
      }

      return var0 + (var2 - var0) * ((double)var4 / (var5 - 1));
   }

   static abbbaabbb ba(class_310 var0, class_746 var1) {
      return abb(var0, var1, 0.1);
   }

   private static int bb(int var0, long var1) {
      int var3 = var0 ^ (int)(var1 & 32767L) ^ a(1359877345, -1968134409 ^ -882178515);
      if (aab[var3] == null) {
         aab[var3] = (int)(bab[var3] ^ var1);
      }

      return aab[var3];
   }

   static double aaa(double var0, double var2, double var4, double var6, double var8) {
      double var10 = Math.max(0.0, var0 * var4 + var2 * var6);
      double var12 = var10 * 1.15 + 0.035;
      return Math.min(0.42, Math.max(Math.max(0.025, var8), var12));
   }

   private static boolean aab(class_1937 var0, class_746 var1, double var2, double var4) {
      class_238 var6 = var1.method_5829().method_989(var2, var1.field_6017 - var1.method_49476(), var4).method_35580(0.05, 0.0, 0.05);
      return var0.method_8587(var1, var6);
   }

   static double b(class_1937 param0, class_746 param1) {
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
      // 05: ifnull 18
      // 08: aload 1
      // 09: iload 2
      // 0a: ifne 1c
      // 0d: goto 11
      // 10: athrow
      // 11: ifnonnull 1b
      // 14: goto 18
      // 17: athrow
      // 18: dconst_1
      // 19: dreturn
      // 1a: athrow
      // 1b: aload 1
      // 1c: invokevirtual net/minecraft/class_746.method_5829 ()Lnet/minecraft/class_238;
      // 1f: astore 3
      // 20: ldc 1359877344
      // 22: ldc -980525190
      // 24: ldc 490601189
      // 26: ixor
      // 27: invokestatic qeaa361f143ee4a0894bd168fd9b30c66/qf4ccf8f5435d4a78bdca4d6a018b578e/aabbbbaba.a (II)I
      // 2a: aload 3
      // 2b: getfield net/minecraft/class_238.field_1322 D
      // 2e: ldc2_w 0.05
      // 31: dsub
      // 32: dstore 4
      // 34: ldc2_w 4864039854405632668
      // 37: aload 3
      // 38: getfield net/minecraft/class_238.field_1323 D
      // 3b: ldc2_w 0.02
      // 3e: dadd
      // 3f: dstore 6
      // 41: aload 3
      // 42: getfield net/minecraft/class_238.field_1320 D
      // 45: ldc2_w 0.02
      // 48: dsub
      // 49: dstore 8
      // 4b: aload 3
      // 4c: getfield net/minecraft/class_238.field_1321 D
      // 4f: ldc2_w 0.02
      // 52: dadd
      // 53: dstore 10
      // 55: aload 3
      // 56: getfield net/minecraft/class_238.field_1324 D
      // 59: ldc2_w 0.02
      // 5c: dsub
      // 5d: dstore 12
      // 5f: bipush 0
      // 60: istore 14
      // 62: invokestatic qeaa361f143ee4a0894bd168fd9b30c66/qf4ccf8f5435d4a78bdca4d6a018b578e/aabbbbaba.bb (IJ)I
      // 65: istore 15
      // 67: bipush 0
      // 68: istore 16
      // 6a: iload 16
      // 6c: bipush 5
      // 6d: if_icmpge c7
      // 70: dload 6
      // 72: dload 8
      // 74: iload 2
      // 75: ifne cd
      // 78: iload 16
      // 7a: bipush 5
      // 7b: invokestatic qeaa361f143ee4a0894bd168fd9b30c66/qf4ccf8f5435d4a78bdca4d6a018b578e/aabbbbaba.ab (DDII)D
      // 7e: dstore 17
      // 80: bipush 0
      // 81: istore 19
      // 83: iload 19
      // 85: bipush 5
      // 86: if_icmpge c0
      // 89: dload 10
      // 8b: dload 12
      // 8d: iload 2
      // 8e: ifne cd
      // 91: iload 19
      // 93: bipush 5
      // 94: invokestatic qeaa361f143ee4a0894bd168fd9b30c66/qf4ccf8f5435d4a78bdca4d6a018b578e/aabbbbaba.ab (DDII)D
      // 97: dstore 20
      // 99: iload 2
      // 9a: ifne bc
      // 9d: aload 0
      // 9e: dload 17
      // a0: dload 4
      // a2: dload 20
      // a4: aload 3
      // a5: getfield net/minecraft/class_238.field_1322 D
      // a8: invokestatic qeaa361f143ee4a0894bd168fd9b30c66/qf4ccf8f5435d4a78bdca4d6a018b578e/aabbbbaba.baa (Lnet/minecraft/class_1937;DDDD)Z
      // ab: ifeq b9
      // ae: goto b2
      // b1: athrow
      // b2: iinc 14 1
      // b5: goto b9
      // b8: athrow
      // b9: iinc 19 1
      // bc: iload 2
      // bd: ifeq 83
      // c0: iinc 16 1
      // c3: iload 2
      // c4: ifeq 6a
      // c7: iload 14
      // c9: i2d
      // ca: iload 15
      // cc: i2d
      // cd: ddiv
      // ce: dreturn
   }

   private static abaabab aba(class_1937 param0, class_746 param1, double param2, double param4, double param6) {
      // $VF: Couldn't be decompiled
      // Please report this to the Vineflower issue tracker, at https://github.com/Vineflower/vineflower/issues with a copy of the class file (if you have the rights to distribute it!)
      // java.lang.RuntimeException: parsing failure!
      //   at org.jetbrains.java.decompiler.modules.decompiler.decompose.DomHelper.parseGraph(DomHelper.java:211)
      //   at org.jetbrains.java.decompiler.main.rels.MethodProcessor.codeToJava(MethodProcessor.java:166)
      //
      // Bytecode:
      // 000: aload 1
      // 001: invokevirtual net/minecraft/class_746.method_5829 ()Lnet/minecraft/class_238;
      // 004: astore 9
      // 006: aload 9
      // 008: getfield net/minecraft/class_238.field_1322 D
      // 00b: ldc2_w 0.05
      // 00e: dsub
      // 00f: dstore 10
      // 011: aload 9
      // 013: getfield net/minecraft/class_238.field_1323 D
      // 016: ldc2_w 0.02
      // 019: dadd
      // 01a: dstore 12
      // 01c: getstatic qeaa361f143ee4a0894bd168fd9b30c66/qf4ccf8f5435d4a78bdca4d6a018b578e/baaabbaa.bba I
      // 01f: aload 9
      // 021: getfield net/minecraft/class_238.field_1320 D
      // 024: ldc2_w 0.02
      // 027: dsub
      // 028: dstore 14
      // 02a: aload 9
      // 02c: getfield net/minecraft/class_238.field_1321 D
      // 02f: ldc2_w 0.02
      // 032: dadd
      // 033: dstore 16
      // 035: aload 9
      // 037: getfield net/minecraft/class_238.field_1324 D
      // 03a: ldc2_w 0.02
      // 03d: dsub
      // 03e: dstore 18
      // 040: dload 12
      // 042: dload 14
      // 044: dadd
      // 045: ldc2_w 0.5
      // 048: dmul
      // 049: dstore 20
      // 04b: dload 16
      // 04d: dload 18
      // 04f: dadd
      // 050: ldc2_w 0.5
      // 053: dmul
      // 054: dstore 22
      // 056: dload 4
      // 058: dneg
      // 059: dstore 24
      // 05b: dload 2
      // 05c: dstore 26
      // 05e: dconst_0
      // 05f: dstore 28
      // 061: istore 8
      // 063: dconst_0
      // 064: dstore 30
      // 066: bipush 2
      // 067: newarray 7
      // 069: dup
      // 06a: bipush 0
      // 06b: dload 12
      // 06d: dastore
      // 06e: dup
      // 06f: bipush 1
      // 070: dload 14
      // 072: dastore
      // 073: astore 32
      // 075: aload 32
      // 077: arraylength
      // 078: istore 33
      // 07a: bipush 0
      // 07b: istore 34
      // 07d: iload 34
      // 07f: iload 33
      // 081: if_icmpge 0fe
      // 084: aload 32
      // 086: iload 34
      // 088: daload
      // 089: dstore 35
      // 08b: bipush 2
      // 08c: newarray 7
      // 08e: dup
      // 08f: bipush 0
      // 090: dload 16
      // 092: dastore
      // 093: dup
      // 094: bipush 1
      // 095: dload 18
      // 097: dastore
      // 098: astore 37
      // 09a: aload 37
      // 09c: arraylength
      // 09d: iload 8
      // 09f: ifne 0ff
      // 0a2: istore 38
      // 0a4: bipush 0
      // 0a5: istore 39
      // 0a7: iload 39
      // 0a9: iload 38
      // 0ab: if_icmpge 0f6
      // 0ae: aload 37
      // 0b0: iload 39
      // 0b2: daload
      // 0b3: dstore 40
      // 0b5: dload 35
      // 0b7: dload 20
      // 0b9: dsub
      // 0ba: dstore 42
      // 0bc: dload 40
      // 0be: dload 22
      // 0c0: dsub
      // 0c1: dstore 44
      // 0c3: dload 28
      // 0c5: dload 42
      // 0c7: dload 2
      // 0c8: dmul
      // 0c9: dload 44
      // 0cb: dload 4
      // 0cd: dmul
      // 0ce: dadd
      // 0cf: invokestatic java/lang/Math.max (DD)D
      // 0d2: dstore 28
      // 0d4: dload 30
      // 0d6: iload 8
      // 0d8: ifne 089
      // 0db: dload 42
      // 0dd: dload 24
      // 0df: dmul
      // 0e0: dload 44
      // 0e2: dload 26
      // 0e4: dmul
      // 0e5: dadd
      // 0e6: invokestatic java/lang/Math.abs (D)D
      // 0e9: invokestatic java/lang/Math.max (DD)D
      // 0ec: dstore 30
      // 0ee: iload 8
      // 0f0: iinc 39 1
      // 0f3: ifeq 0a7
      // 0f6: iinc 34 1
      // 0f9: iload 8
      // 0fb: ifeq 07d
      // 0fe: bipush 0
      // 0ff: istore 32
      // 101: ldc 1359877347
      // 103: ldc -1798972534
      // 105: ldc -235931825
      // 107: ixor
      // 108: invokestatic qeaa361f143ee4a0894bd168fd9b30c66/qf4ccf8f5435d4a78bdca4d6a018b578e/aabbbbaba.a (II)I
      // 10b: ldc2_w 1438539289864167323
      // 10e: invokestatic qeaa361f143ee4a0894bd168fd9b30c66/qf4ccf8f5435d4a78bdca4d6a018b578e/aabbbbaba.bb (IJ)I
      // 111: istore 33
      // 113: bipush 0
      // 114: istore 34
      // 116: iload 34
      // 118: bipush 5
      // 119: if_icmpge 179
      // 11c: dload 12
      // 11e: dload 14
      // 120: iload 8
      // 122: ifne 180
      // 125: iload 34
      // 127: bipush 5
      // 128: invokestatic qeaa361f143ee4a0894bd168fd9b30c66/qf4ccf8f5435d4a78bdca4d6a018b578e/aabbbbaba.ab (DDII)D
      // 12b: dstore 35
      // 12d: bipush 0
      // 12e: istore 37
      // 130: iload 37
      // 132: bipush 5
      // 133: if_icmpge 171
      // 136: dload 16
      // 138: dload 18
      // 13a: iload 8
      // 13c: ifne 180
      // 13f: iload 37
      // 141: bipush 5
      // 142: invokestatic qeaa361f143ee4a0894bd168fd9b30c66/qf4ccf8f5435d4a78bdca4d6a018b578e/aabbbbaba.ab (DDII)D
      // 145: dstore 38
      // 147: iload 8
      // 149: ifne 16c
      // 14c: aload 0
      // 14d: dload 35
      // 14f: dload 10
      // 151: dload 38
      // 153: aload 9
      // 155: getfield net/minecraft/class_238.field_1322 D
      // 158: invokestatic qeaa361f143ee4a0894bd168fd9b30c66/qf4ccf8f5435d4a78bdca4d6a018b578e/aabbbbaba.baa (Lnet/minecraft/class_1937;DDDD)Z
      // 15b: ifeq 169
      // 15e: goto 162
      // 161: athrow
      // 162: iinc 32 1
      // 165: goto 169
      // 168: athrow
      // 169: iinc 37 1
      // 16c: iload 8
      // 16e: ifeq 130
      // 171: iinc 34 1
      // 174: iload 8
      // 176: ifeq 116
      // 179: bipush 0
      // 17a: istore 34
      // 17c: dload 28
      // 17e: dload 6
      // 180: dadd
      // 181: dstore 35
      // 183: bipush 0
      // 184: istore 37
      // 186: iload 37
      // 188: bipush 5
      // 189: if_icmpge 1eb
      // 18c: dload 30
      // 18e: dneg
      // 18f: dload 30
      // 191: iload 37
      // 193: bipush 5
      // 194: invokestatic qeaa361f143ee4a0894bd168fd9b30c66/qf4ccf8f5435d4a78bdca4d6a018b578e/aabbbbaba.ab (DDII)D
      // 197: dstore 38
      // 199: iload 8
      // 19b: dload 20
      // 19d: dload 2
      // 19e: dload 35
      // 1a0: dmul
      // 1a1: dadd
      // 1a2: dload 24
      // 1a4: dload 38
      // 1a6: dmul
      // 1a7: dadd
      // 1a8: dstore 40
      // 1aa: dload 22
      // 1ac: dload 4
      // 1ae: dload 35
      // 1b0: dmul
      // 1b1: dadd
      // 1b2: dload 26
      // 1b4: dload 38
      // 1b6: dmul
      // 1b7: dadd
      // 1b8: dstore 42
      // 1ba: ifne 1e6
      // 1bd: aload 0
      // 1be: dload 40
      // 1c0: dload 10
      // 1c2: iload 8
      // 1c4: ifne 1f0
      // 1c7: goto 1cb
      // 1ca: athrow
      // 1cb: dload 42
      // 1cd: aload 9
      // 1cf: getfield net/minecraft/class_238.field_1322 D
      // 1d2: invokestatic qeaa361f143ee4a0894bd168fd9b30c66/qf4ccf8f5435d4a78bdca4d6a018b578e/aabbbbaba.baa (Lnet/minecraft/class_1937;DDDD)Z
      // 1d5: ifeq 1e3
      // 1d8: goto 1dc
      // 1db: athrow
      // 1dc: iinc 34 1
      // 1df: goto 1e3
      // 1e2: athrow
      // 1e3: iinc 37 1
      // 1e6: iload 8
      // 1e8: ifeq 186
      // 1eb: aload 0
      // 1ec: dload 20
      // 1ee: dload 10
      // 1f0: dload 22
      // 1f2: aload 9
      // 1f4: getfield net/minecraft/class_238.field_1322 D
      // 1f7: invokestatic qeaa361f143ee4a0894bd168fd9b30c66/qf4ccf8f5435d4a78bdca4d6a018b578e/aabbbbaba.baa (Lnet/minecraft/class_1937;DDDD)Z
      // 1fa: istore 37
      // 1fc: new qeaa361f143ee4a0894bd168fd9b30c66/qf4ccf8f5435d4a78bdca4d6a018b578e/abaabab
      // 1ff: dup
      // 200: iload 37
      // 202: iload 32
      // 204: i2d
      // 205: iload 33
      // 207: i2d
      // 208: ddiv
      // 209: iload 34
      // 20b: i2d
      // 20c: ldc2_w 5.0
      // 20f: ddiv
      // 210: invokespecial qeaa361f143ee4a0894bd168fd9b30c66/qf4ccf8f5435d4a78bdca4d6a018b578e/abaabab.<init> (ZDD)V
      // 213: areturn
   }

   private static int a(int var0, int var1) {
      int var2 = aaaa[var0 ^ 1359877345] ^ var1 ^ var0;
      var2 -= 37428;
      var2 ^= 56611;
      var2 += 24157;
      var2 ^= 62083;
      var2 -= 40658;
      var2 -= 53095;
      var2 ^= 33489;
      var2 += 56201;
      return var2 + 36758;
   }

   static abbbaabbb abb(class_310 param0, class_746 param1, double param2) {
      // $VF: Couldn't be decompiled
      // Please report this to the Vineflower issue tracker, at https://github.com/Vineflower/vineflower/issues with a copy of the class file (if you have the rights to distribute it!)
      // java.lang.RuntimeException: parsing failure!
      //   at org.jetbrains.java.decompiler.modules.decompiler.decompose.DomHelper.parseGraph(DomHelper.java:211)
      //   at org.jetbrains.java.decompiler.main.rels.MethodProcessor.codeToJava(MethodProcessor.java:166)
      //
      // Bytecode:
      // 000: getstatic qeaa361f143ee4a0894bd168fd9b30c66/qf4ccf8f5435d4a78bdca4d6a018b578e/baaabbaa.bba I
      // 003: istore 4
      // 005: aload 0
      // 006: iload 4
      // 008: ifne 013
      // 00b: ifnull 035
      // 00e: goto 012
      // 011: athrow
      // 012: aload 0
      // 013: iload 4
      // 015: ifne 027
      // 018: getfield net/minecraft/class_310.field_1690 Lnet/minecraft/class_315;
      // 01b: ifnull 035
      // 01e: goto 022
      // 021: athrow
      // 022: aload 0
      // 023: goto 027
      // 026: athrow
      // 027: getfield net/minecraft/class_310.field_1687 Lnet/minecraft/class_638;
      // 02a: ifnull 035
      // 02d: aload 1
      // 02e: ifnonnull 03a
      // 031: goto 035
      // 034: athrow
      // 035: invokestatic qeaa361f143ee4a0894bd168fd9b30c66/qf4ccf8f5435d4a78bdca4d6a018b578e/abbbaabbb.b ()Lqeaa361f143ee4a0894bd168fd9b30c66/qf4ccf8f5435d4a78bdca4d6a018b578e/abbbaabbb;
      // 038: areturn
      // 039: athrow
      // 03a: aload 0
      // 03b: aload 1
      // 03c: invokestatic qeaa361f143ee4a0894bd168fd9b30c66/qf4ccf8f5435d4a78bdca4d6a018b578e/aabbbbaba.aa (Lnet/minecraft/class_310;Lnet/minecraft/class_746;)Lqeaa361f143ee4a0894bd168fd9b30c66/qf4ccf8f5435d4a78bdca4d6a018b578e/abbbaabaa;
      // 03f: astore 5
      // 041: aload 5
      // 043: ifnonnull 04b
      // 046: invokestatic qeaa361f143ee4a0894bd168fd9b30c66/qf4ccf8f5435d4a78bdca4d6a018b578e/abbbaabbb.b ()Lqeaa361f143ee4a0894bd168fd9b30c66/qf4ccf8f5435d4a78bdca4d6a018b578e/abbbaabbb;
      // 049: areturn
      // 04a: athrow
      // 04b: aload 1
      // 04c: invokevirtual net/minecraft/class_746.method_18798 ()Lnet/minecraft/class_243;
      // 04f: getfield net/minecraft/class_243.field_1352 D
      // 052: aload 1
      // 053: invokevirtual net/minecraft/class_746.method_18798 ()Lnet/minecraft/class_243;
      // 056: getfield net/minecraft/class_243.field_1350 D
      // 059: aload 5
      // 05b: invokevirtual qeaa361f143ee4a0894bd168fd9b30c66/qf4ccf8f5435d4a78bdca4d6a018b578e/abbbaabaa.aa ()D
      // 05e: aload 5
      // 060: invokevirtual qeaa361f143ee4a0894bd168fd9b30c66/qf4ccf8f5435d4a78bdca4d6a018b578e/abbbaabaa.a ()D
      // 063: dload 2
      // 064: invokestatic qeaa361f143ee4a0894bd168fd9b30c66/qf4ccf8f5435d4a78bdca4d6a018b578e/aabbbbaba.aaa (DDDDD)D
      // 067: dstore 6
      // 069: aload 0
      // 06a: getfield net/minecraft/class_310.field_1687 Lnet/minecraft/class_638;
      // 06d: aload 1
      // 06e: aload 5
      // 070: invokevirtual qeaa361f143ee4a0894bd168fd9b30c66/qf4ccf8f5435d4a78bdca4d6a018b578e/abbbaabaa.aa ()D
      // 073: aload 5
      // 075: invokevirtual qeaa361f143ee4a0894bd168fd9b30c66/qf4ccf8f5435d4a78bdca4d6a018b578e/abbbaabaa.a ()D
      // 078: dload 6
      // 07a: invokestatic qeaa361f143ee4a0894bd168fd9b30c66/qf4ccf8f5435d4a78bdca4d6a018b578e/aabbbbaba.aba (Lnet/minecraft/class_1937;Lnet/minecraft/class_746;DDD)Lqeaa361f143ee4a0894bd168fd9b30c66/qf4ccf8f5435d4a78bdca4d6a018b578e/abaabab;
      // 07d: astore 8
      // 07f: aload 0
      // 080: getfield net/minecraft/class_310.field_1687 Lnet/minecraft/class_638;
      // 083: aload 1
      // 084: dconst_0
      // 085: dconst_0
      // 086: invokestatic qeaa361f143ee4a0894bd168fd9b30c66/qf4ccf8f5435d4a78bdca4d6a018b578e/aabbbbaba.aab (Lnet/minecraft/class_1937;Lnet/minecraft/class_746;DD)Z
      // 089: iload 4
      // 08b: ifne 096
      // 08e: ifne 099
      // 091: goto 095
      // 094: athrow
      // 095: bipush 1
      // 096: goto 09a
      // 099: bipush 0
      // 09a: istore 9
      // 09c: aload 0
      // 09d: getfield net/minecraft/class_310.field_1687 Lnet/minecraft/class_638;
      // 0a0: aload 1
      // 0a1: aload 5
      // 0a3: invokevirtual qeaa361f143ee4a0894bd168fd9b30c66/qf4ccf8f5435d4a78bdca4d6a018b578e/abbbaabaa.aa ()D
      // 0a6: dload 6
      // 0a8: dmul
      // 0a9: aload 5
      // 0ab: invokevirtual qeaa361f143ee4a0894bd168fd9b30c66/qf4ccf8f5435d4a78bdca4d6a018b578e/abbbaabaa.a ()D
      // 0ae: dload 6
      // 0b0: dmul
      // 0b1: invokestatic qeaa361f143ee4a0894bd168fd9b30c66/qf4ccf8f5435d4a78bdca4d6a018b578e/aabbbbaba.aab (Lnet/minecraft/class_1937;Lnet/minecraft/class_746;DD)Z
      // 0b4: istore 10
      // 0b6: iload 9
      // 0b8: iload 4
      // 0ba: ifne 0c6
      // 0bd: ifeq 0d6
      // 0c0: goto 0c4
      // 0c3: athrow
      // 0c4: iload 10
      // 0c6: iload 4
      // 0c8: ifne 0d3
      // 0cb: ifeq 0d6
      // 0ce: goto 0d2
      // 0d1: athrow
      // 0d2: bipush 1
      // 0d3: goto 0d7
      // 0d6: bipush 0
      // 0d7: istore 11
      // 0d9: aload 0
      // 0da: getfield net/minecraft/class_310.field_1690 Lnet/minecraft/class_315;
      // 0dd: getfield net/minecraft/class_315.field_1894 Lnet/minecraft/class_304;
      // 0e0: invokevirtual net/minecraft/class_304.method_1434 ()Z
      // 0e3: iload 4
      // 0e5: ifne 13e
      // 0e8: ifne 13d
      // 0eb: goto 0ef
      // 0ee: athrow
      // 0ef: aload 0
      // 0f0: getfield net/minecraft/class_310.field_1690 Lnet/minecraft/class_315;
      // 0f3: getfield net/minecraft/class_315.field_1881 Lnet/minecraft/class_304;
      // 0f6: invokevirtual net/minecraft/class_304.method_1434 ()Z
      // 0f9: iload 4
      // 0fb: ifne 13e
      // 0fe: goto 102
      // 101: athrow
      // 102: ifne 13d
      // 105: goto 109
      // 108: athrow
      // 109: aload 0
      // 10a: getfield net/minecraft/class_310.field_1690 Lnet/minecraft/class_315;
      // 10d: getfield net/minecraft/class_315.field_1913 Lnet/minecraft/class_304;
      // 110: invokevirtual net/minecraft/class_304.method_1434 ()Z
      // 113: iload 4
      // 115: ifne 13e
      // 118: goto 11c
      // 11b: athrow
      // 11c: ifne 13d
      // 11f: goto 123
      // 122: athrow
      // 123: aload 0
      // 124: getfield net/minecraft/class_310.field_1690 Lnet/minecraft/class_315;
      // 127: getfield net/minecraft/class_315.field_1849 Lnet/minecraft/class_304;
      // 12a: invokevirtual net/minecraft/class_304.method_1434 ()Z
      // 12d: iload 4
      // 12f: ifne 13e
      // 132: goto 136
      // 135: athrow
      // 136: ifeq 141
      // 139: goto 13d
      // 13c: athrow
      // 13d: bipush 1
      // 13e: goto 142
      // 141: bipush 0
      // 142: istore 12
      // 144: new qeaa361f143ee4a0894bd168fd9b30c66/qf4ccf8f5435d4a78bdca4d6a018b578e/abbbaabbb
      // 147: dup
      // 148: iload 12
      // 14a: iload 11
      // 14c: aload 8
      // 14e: invokevirtual qeaa361f143ee4a0894bd168fd9b30c66/qf4ccf8f5435d4a78bdca4d6a018b578e/abaabab.ab ()Z
      // 151: aload 5
      // 153: invokevirtual qeaa361f143ee4a0894bd168fd9b30c66/qf4ccf8f5435d4a78bdca4d6a018b578e/abbbaabaa.aa ()D
      // 156: aload 5
      // 158: invokevirtual qeaa361f143ee4a0894bd168fd9b30c66/qf4ccf8f5435d4a78bdca4d6a018b578e/abbbaabaa.a ()D
      // 15b: dload 6
      // 15d: invokespecial qeaa361f143ee4a0894bd168fd9b30c66/qf4ccf8f5435d4a78bdca4d6a018b578e/abbbaabbb.<init> (ZZZDDD)V
      // 160: areturn
   }

   private static String bbb(int var0, int var1, short var2, char var3) {
      int var8 = var0 ^ -933433692;
      char[] var7 = aaab[var8].toCharArray();
      StackTraceElement[] var9 = (StackTraceElement[])aaba[var8];
      StackTraceElement[] var10;
      if (var9 != null) {
         var10 = var9;
      } else {
         var10 = new Throwable().getStackTrace();
         aaba[var8] = var10;
      }

      StackTraceElement var11 = var10[1];
      int var5 = (var11.getClassName().hashCode() ^ var11.getMethodName().hashCode()) >> 16 ^ 13023;
      int var6 = 0;

      do {
         var7[var6] = (char)(var7[var6] ^ switch (var6 % 5) {
            default -> 3;
            case 1 -> 26;
            case 2 -> 114;
            case 3 -> 226;
            case 4 -> 91;
         } ^ var6 ^ var5 ^ var1 ^ var3 ^ var2 ^ var0);
      } while (++var6 < var7.length);

      return new String(var7).intern();
   }

   static {
      int var19 = 229903857;
      byte var15 = -1;
      char[] var10 = "剙剋".toCharArray();
      String var9 = "镗镚闔镐闠镛閏閜闕锅镭镡锕镐锦锋闊镆锆锫镪锂锉閛觤襍襬褠觕褢覇襉覔規";
      short var8 = 21057;
      String[] var11 = new String[var10.length];

      while (true) {
         int var12 = 0;
         int var13 = 0;
         int var14 = 0;
         if (var15 == 0) {
            aaab = var11;
            aaba = new Object[var11.length];
            byte var21 = 0;
            int var10001 = 0;
            aaaa = new int[13];
            byte[] var10002 = "®§\u0098\u001c7Ï\u0080§u¨áðÀxÞÙ»íÙÆ\u0094µ8»\u0003[\u0003\u0085Ã#\u0082¼w·¤\u0012'j\u0085\u001e[\u009d{q\u0097º\u0091Ô=é\u0084\u0016"
               .getBytes("ISO-8859-1");

            int var38;
            do {
               aaaa[var21] = (
                     (var10002[var10001] & 255) << 24
                        | (var10002[var10001 + 1] & 255) << 16
                        | (var10002[var10001 + 2] & 255) << 8
                        | var10002[var10001 + 3] & 255
                  )
                  ^ 1099729647;
               var21 += 1;
               var38 = var10001 + 4;
               var10001 += 4;
            } while (var38 < var10002.length);

            long var0 = 5446908349224318843L;
            long[] var6 = new long[3];
            int var3 = 0;
            String var4;
            int var5 = (var4 = bbb(-933433692, 474168976, (short)-31466, '幗')).length();
            byte var2 = 0;

            do {
               var10001 = var2;
               var2 += 8;
               byte[] var7 = var4.substring(var10001, var2).getBytes(bbb(-933433691, -585848457, 15736, '淊'));
               var10001 = var3++;
               long var46 = (
                     (var7[0] & 255L) << a(1359877346, var19 ^ -582086625)
                        | (var7[1] & 255L) << a(1359877349, var19 ^ -1495589809)
                        | (var7[2] & 255L) << a(1359877348, var19 ^ -1987840501)
                        | (var7[3] & 255L) << a(1359877351, var19 ^ 510512446)
                        | (var7[4] & 255L) << a(1359877350, var19 ^ -569031010)
                        | (var7[5] & 255L) << a(1359877353, var19 ^ 1786863735)
                        | (var7[a(1359877352, var19 ^ 979124488)] & 255L) << a(1359877355, var19 ^ 1185660782)
                        | var7[a(1359877354, var19 ^ -1970514485)] & 255L
                  )
                  ^ var0;
               byte var39 = -1;
               var6[var10001] = var46;
            } while (var2 < var5);

            bab = var6;
            aab = new Integer[3];
            bba = bb(a(1359877357, var19 ^ -551426980), 2451765149697785113L);
            return;
         }

         do {
            var14 = var10[var12] ^ var8;
            char[] var16 = var9.substring(var13, var13 + var14).toCharArray();
            int var17 = 0;

            do {
               short var18 = switch (var17 % 6) {
                  default -> 105;
                  case 1 -> 194;
                  case 2 -> 148;
                  case 3 -> 43;
                  case 4 -> 117;
                  case 5 -> 219;
               };
               var16[var17] = (char)(var16[var17] ^ var18);
            } while (++var17 < var16.length);

            var11[var12] = new String(var16).intern();
            var13 += var14;
         } while (++var12 < var10.length);

         var15 = 0;
      }
   }

   private static boolean baa(class_1937 param0, double param1, double param3, double param5, double param7) {
      // $VF: Couldn't be decompiled
      // Please report this to the Vineflower issue tracker, at https://github.com/Vineflower/vineflower/issues with a copy of the class file (if you have the rights to distribute it!)
      // java.lang.RuntimeException: parsing failure!
      //   at org.jetbrains.java.decompiler.modules.decompiler.decompose.DomHelper.parseGraph(DomHelper.java:211)
      //   at org.jetbrains.java.decompiler.main.rels.MethodProcessor.codeToJava(MethodProcessor.java:166)
      //
      // Bytecode:
      // 00: dload 1
      // 01: dload 3
      // 02: dload 5
      // 04: invokestatic net/minecraft/class_2338.method_49637 (DDD)Lnet/minecraft/class_2338;
      // 07: astore 10
      // 09: getstatic qeaa361f143ee4a0894bd168fd9b30c66/qf4ccf8f5435d4a78bdca4d6a018b578e/baaabbaa.bba I
      // 0c: aload 0
      // 0d: aload 10
      // 0f: invokevirtual net/minecraft/class_1937.method_8320 (Lnet/minecraft/class_2338;)Lnet/minecraft/class_2680;
      // 12: astore 11
      // 14: istore 9
      // 16: aload 11
      // 18: invokevirtual net/minecraft/class_2680.method_26215 ()Z
      // 1b: iload 9
      // 1d: ifne 44
      // 20: ifne 3f
      // 23: goto 27
      // 26: athrow
      // 27: aload 11
      // 29: iload 9
      // 2b: ifne 47
      // 2e: goto 32
      // 31: athrow
      // 32: invokevirtual net/minecraft/class_2680.method_26227 ()Lnet/minecraft/class_3610;
      // 35: invokevirtual net/minecraft/class_3610.method_15769 ()Z
      // 38: ifne 45
      // 3b: goto 3f
      // 3e: athrow
      // 3f: bipush 0
      // 40: goto 44
      // 43: athrow
      // 44: ireturn
      // 45: aload 11
      // 47: aload 0
      // 48: aload 10
      // 4a: invokevirtual net/minecraft/class_2680.method_26220 (Lnet/minecraft/class_1922;Lnet/minecraft/class_2338;)Lnet/minecraft/class_265;
      // 4d: astore 12
      // 4f: aload 12
      // 51: invokevirtual net/minecraft/class_265.method_1110 ()Z
      // 54: iload 9
      // 56: ifne 68
      // 59: ifeq 63
      // 5c: goto 60
      // 5f: athrow
      // 60: bipush 0
      // 61: ireturn
      // 62: athrow
      // 63: aload 10
      // 65: invokevirtual net/minecraft/class_2338.method_10264 ()I
      // 68: i2d
      // 69: aload 12
      // 6b: getstatic net/minecraft/class_2350$class_2351.field_11052 Lnet/minecraft/class_2350$class_2351;
      // 6e: invokevirtual net/minecraft/class_265.method_1105 (Lnet/minecraft/class_2350$class_2351;)D
      // 71: dadd
      // 72: dstore 13
      // 74: dload 13
      // 76: dload 7
      // 78: ldc2_w 0.15
      // 7b: dsub
      // 7c: dcmpl
      // 7d: iload 9
      // 7f: ifne 8a
      // 82: iflt 8d
      // 85: goto 89
      // 88: athrow
      // 89: bipush 1
      // 8a: goto 8e
      // 8d: bipush 0
      // 8e: ireturn
   }

   static boolean bab(class_1937 param0, class_746 param1, double param2, double param4) {
      // $VF: Couldn't be decompiled
      // Please report this to the Vineflower issue tracker, at https://github.com/Vineflower/vineflower/issues with a copy of the class file (if you have the rights to distribute it!)
      // java.lang.RuntimeException: parsing failure!
      //   at org.jetbrains.java.decompiler.modules.decompiler.decompose.DomHelper.parseGraph(DomHelper.java:211)
      //   at org.jetbrains.java.decompiler.main.rels.MethodProcessor.codeToJava(MethodProcessor.java:166)
      //
      // Bytecode:
      // 00: getstatic qeaa361f143ee4a0894bd168fd9b30c66/qf4ccf8f5435d4a78bdca4d6a018b578e/baaabbaa.bba I
      // 03: istore 6
      // 05: aload 0
      // 06: ifnull 2d
      // 09: aload 1
      // 0a: ifnull 2d
      // 0d: goto 11
      // 10: athrow
      // 11: aload 0
      // 12: aload 1
      // 13: dload 2
      // 14: dload 4
      // 16: invokestatic qeaa361f143ee4a0894bd168fd9b30c66/qf4ccf8f5435d4a78bdca4d6a018b578e/aabbbbaba.aab (Lnet/minecraft/class_1937;Lnet/minecraft/class_746;DD)Z
      // 19: iload 6
      // 1b: ifne 2a
      // 1e: goto 22
      // 21: athrow
      // 22: ifne 2d
      // 25: goto 29
      // 28: athrow
      // 29: bipush 1
      // 2a: goto 2e
      // 2d: bipush 0
      // 2e: ireturn
   }

   static abbbaabaa bba(class_746 var0, float var1, float var2) {
      int var3 = baaabbaa.bba;

      try {
         if (var0 == null) {
            return null;
         }
      } catch (MatchException var21) {
         throw var21;
      }

      double var4 = Math.sqrt(var1 * var1 + var2 * var2);

      label76: {
         double var10000;
         label77: {
            double var10001;
            label63: {
               try {
                  var10000 = var4;
                  var10001 = 0.001;
                  if (var3 != 0) {
                     break label63;
                  }

                  if (var4 < 0.001) {
                     break label76;
                  }
               } catch (MatchException var20) {
                  throw var20;
               }

               try {
                  var10000 = var4;
                  if (var3 != 0) {
                     break label77;
                  }

                  var10001 = 1.0;
               } catch (MatchException var19) {
                  throw var19;
               }
            }

            if (var10000 > var10001) {
               var1 /= (float)var4;
               var2 /= (float)var4;
            }

            var10000 = Math.toRadians(var0.method_36454());
         }

         float var22 = (float)var10000;
         double var23 = Math.sin(var22);
         double var24 = Math.cos(var22);
         double var25 = -var23 * var1 - var24 * var2;
         double var13 = var24 * var1 - var23 * var2;
         double var15 = Math.sqrt(var25 * var25 + var13 * var13);

         try {
            if (var15 < 0.001) {
               return null;
            }
         } catch (MatchException var18) {
            throw var18;
         }

         return new abbbaabaa(var25 / var15, var13 / var15);
      }

      float var6 = (float)Math.toRadians(var0.method_36454());
      double var7 = -Math.sin(var6);
      double var9 = Math.cos(var6);
      double var11 = Math.sqrt(var7 * var7 + var9 * var9);

      try {
         if (var11 < 0.001) {
            return null;
         }
      } catch (MatchException var17) {
         throw var17;
      }

      return new abbbaabaa(var7 / var11, var9 / var11);
   }
}
