package nsc;

import java.util.List;
import java.util.Objects;
import net.fabricmc.api.EnvType;
import net.fabricmc.api.Environment;

@Environment(EnvType.CLIENT)
public final class aabbabbab {
   private static final String[] aa;
   public static int ab;
   private static final double ba = 382.0;
   private static final int[] bba;
   public static final double bb = 0.01;
   private static final double b = 64.0;
   private static final String[] bbb;
   private static final Object[] aaaa;
   private static final double aaa = 3.0;
   public static final boolean aab = true;
   public static final double aba = 0.01;
   private static final double a = 620.0;
   private static final String[] abb;
   public static final double baa = 0.1;
   private static final double bab = 32.0;

   public static boolean aa(boolean var0, boolean var1) {
      int var2 = ab;

      boolean var10000;
      label33: {
         try {
            var10000 = var0;
            if (var2 != 0) {
               break label33;
            }

            if (!var0) {
               return false;
            }
         } catch (MatchException var4) {
            throw var4;
         }

         var10000 = var1;
      }

      try {
         if (var2 != 0) {
            return var10000;
         }

         if (var10000) {
            return true;
         }
      } catch (MatchException var3) {
         throw var3;
      }

      return false;
   }

   public static aaababba ab(boolean param0, boolean param1, boolean param2, boolean param3, float param4, float param5) {
      // $VF: Couldn't be decompiled
      // Please report this to the Vineflower issue tracker, at https://github.com/Vineflower/vineflower/issues with a copy of the class file (if you have the rights to distribute it!)
      // java.lang.RuntimeException: parsing failure!
      //   at org.jetbrains.java.decompiler.modules.decompiler.decompose.DomHelper.parseGraph(DomHelper.java:211)
      //   at org.jetbrains.java.decompiler.main.rels.MethodProcessor.codeToJava(MethodProcessor.java:166)
      //
      // Bytecode:
      // 000: getstatic qeaa361f143ee4a0894bd168fd9b30c66/qf4ccf8f5435d4a78bdca4d6a018b578e/aabbabbab.ab I
      // 003: istore 6
      // 005: iload 0
      // 006: ifeq 00e
      // 009: fconst_1
      // 00a: goto 00f
      // 00d: athrow
      // 00e: fconst_0
      // 00f: iload 1
      // 010: ifeq 018
      // 013: fconst_1
      // 014: goto 019
      // 017: athrow
      // 018: fconst_0
      // 019: fsub
      // 01a: fstore 7
      // 01c: iload 2
      // 01d: ifeq 025
      // 020: fconst_1
      // 021: goto 026
      // 024: athrow
      // 025: fconst_0
      // 026: iload 3
      // 027: ifeq 02f
      // 02a: fconst_1
      // 02b: goto 030
      // 02e: athrow
      // 02f: fconst_0
      // 030: fsub
      // 031: fstore 8
      // 033: fload 7
      // 035: fload 7
      // 037: fmul
      // 038: fload 8
      // 03a: fload 8
      // 03c: fmul
      // 03d: fadd
      // 03e: f2d
      // 03f: invokestatic java/lang/Math.sqrt (D)D
      // 042: d2f
      // 043: fstore 9
      // 045: fload 9
      // 047: iload 6
      // 049: ifne 077
      // 04c: ldc 1.0E-4
      // 04e: fcmpg
      // 04f: ifgt 061
      // 052: goto 056
      // 055: athrow
      // 056: new qeaa361f143ee4a0894bd168fd9b30c66/qf4ccf8f5435d4a78bdca4d6a018b578e/aaababba
      // 059: dup
      // 05a: fconst_0
      // 05b: fconst_0
      // 05c: invokespecial qeaa361f143ee4a0894bd168fd9b30c66/qf4ccf8f5435d4a78bdca4d6a018b578e/aaababba.<init> (FF)V
      // 05f: areturn
      // 060: athrow
      // 061: fload 7
      // 063: fload 9
      // 065: fdiv
      // 066: fstore 7
      // 068: fload 8
      // 06a: fload 9
      // 06c: fdiv
      // 06d: fstore 8
      // 06f: fload 5
      // 071: fload 4
      // 073: fsub
      // 074: invokestatic qeaa361f143ee4a0894bd168fd9b30c66/qf4ccf8f5435d4a78bdca4d6a018b578e/aabbabbab.aabaa (F)F
      // 077: fstore 10
      // 079: fload 10
      // 07b: f2d
      // 07c: invokestatic java/lang/Math.toRadians (D)D
      // 07f: dstore 11
      // 081: dload 11
      // 083: invokestatic java/lang/Math.sin (D)D
      // 086: d2f
      // 087: fstore 13
      // 089: dload 11
      // 08b: invokestatic java/lang/Math.cos (D)D
      // 08e: d2f
      // 08f: fstore 14
      // 091: fload 8
      // 093: fload 14
      // 095: fmul
      // 096: fload 7
      // 098: fload 13
      // 09a: fmul
      // 09b: fsub
      // 09c: invokestatic qeaa361f143ee4a0894bd168fd9b30c66/qf4ccf8f5435d4a78bdca4d6a018b578e/aabbabbab.abab (F)F
      // 09f: fstore 15
      // 0a1: fload 7
      // 0a3: fload 14
      // 0a5: fmul
      // 0a6: fload 8
      // 0a8: fload 13
      // 0aa: fmul
      // 0ab: fadd
      // 0ac: invokestatic qeaa361f143ee4a0894bd168fd9b30c66/qf4ccf8f5435d4a78bdca4d6a018b578e/aabbabbab.abab (F)F
      // 0af: fstore 16
      // 0b1: fload 16
      // 0b3: fload 16
      // 0b5: fmul
      // 0b6: fload 15
      // 0b8: fload 15
      // 0ba: fmul
      // 0bb: fadd
      // 0bc: f2d
      // 0bd: invokestatic java/lang/Math.sqrt (D)D
      // 0c0: d2f
      // 0c1: fstore 17
      // 0c3: fload 17
      // 0c5: iload 6
      // 0c7: ifne 0f6
      // 0ca: ldc 1.0E-4
      // 0cc: fcmpl
      // 0cd: ifle 0e7
      // 0d0: goto 0d4
      // 0d3: athrow
      // 0d4: fload 16
      // 0d6: fload 17
      // 0d8: fdiv
      // 0d9: fstore 18
      // 0db: iload 6
      // 0dd: fload 15
      // 0df: fload 17
      // 0e1: fdiv
      // 0e2: fstore 19
      // 0e4: ifeq 136
      // 0e7: fload 8
      // 0e9: fload 14
      // 0eb: fmul
      // 0ec: fload 7
      // 0ee: fload 13
      // 0f0: fmul
      // 0f1: fsub
      // 0f2: goto 0f6
      // 0f5: athrow
      // 0f6: fstore 19
      // 0f8: iload 6
      // 0fa: fload 7
      // 0fc: fload 14
      // 0fe: fmul
      // 0ff: fload 8
      // 101: fload 13
      // 103: fmul
      // 104: fadd
      // 105: fstore 18
      // 107: fload 18
      // 109: fload 18
      // 10b: fmul
      // 10c: fload 19
      // 10e: fload 19
      // 110: fmul
      // 111: fadd
      // 112: f2d
      // 113: invokestatic java/lang/Math.sqrt (D)D
      // 116: d2f
      // 117: fstore 20
      // 119: ifne 12f
      // 11c: fload 20
      // 11e: ldc 1.0E-4
      // 120: fcmpl
      // 121: ifle 136
      // 124: goto 128
      // 127: athrow
      // 128: fload 18
      // 12a: fload 20
      // 12c: fdiv
      // 12d: fstore 18
      // 12f: fload 19
      // 131: fload 20
      // 133: fdiv
      // 134: fstore 19
      // 136: new qeaa361f143ee4a0894bd168fd9b30c66/qf4ccf8f5435d4a78bdca4d6a018b578e/aaababba
      // 139: dup
      // 13a: fload 18
      // 13c: fload 19
      // 13e: invokespecial qeaa361f143ee4a0894bd168fd9b30c66/qf4ccf8f5435d4a78bdca4d6a018b578e/aaababba.<init> (FF)V
      // 141: areturn
   }

   public static String ba(long var0, long var2) {
      return Long.toString(var0 + Math.max(1L, var2));
   }

   private static int a(int var0, int var1) {
      int var2 = bba[var0 ^ 1386777743] ^ var1 ^ var0;
      var2 -= 61770;
      var2 += 41387;
      var2 += 59852;
      var2 -= 61136;
      var2 -= 53002;
      var2 ^= 19816;
      return var2 - 60108;
   }

   public static double bb(double param0, double param2, double param4) {
      // $VF: Couldn't be decompiled
      // Please report this to the Vineflower issue tracker, at https://github.com/Vineflower/vineflower/issues with a copy of the class file (if you have the rights to distribute it!)
      // java.lang.RuntimeException: parsing failure!
      //   at org.jetbrains.java.decompiler.modules.decompiler.decompose.DomHelper.parseGraph(DomHelper.java:211)
      //   at org.jetbrains.java.decompiler.main.rels.MethodProcessor.codeToJava(MethodProcessor.java:166)
      //
      // Bytecode:
      // 00: getstatic qeaa361f143ee4a0894bd168fd9b30c66/qf4ccf8f5435d4a78bdca4d6a018b578e/aabbabbab.ab I
      // 03: istore 6
      // 05: dload 0
      // 06: iload 6
      // 08: ifne 1a
      // 0b: invokestatic java/lang/Double.isFinite (D)Z
      // 0e: ifeq 1d
      // 11: goto 15
      // 14: athrow
      // 15: dload 0
      // 16: goto 1a
      // 19: athrow
      // 1a: goto 1e
      // 1d: dconst_0
      // 1e: dstore 7
      // 20: dload 2
      // 21: iload 6
      // 23: ifne 35
      // 26: invokestatic java/lang/Double.isFinite (D)Z
      // 29: ifeq 38
      // 2c: goto 30
      // 2f: athrow
      // 30: dload 2
      // 31: goto 35
      // 34: athrow
      // 35: goto 39
      // 38: dconst_0
      // 39: dstore 9
      // 3b: dload 4
      // 3d: iload 6
      // 3f: ifne 56
      // 42: invokestatic java/lang/Double.isFinite (D)Z
      // 45: ifeq 59
      // 48: goto 4c
      // 4b: athrow
      // 4c: dconst_0
      // 4d: dload 4
      // 4f: invokestatic java/lang/Math.max (DD)D
      // 52: goto 56
      // 55: athrow
      // 56: goto 5a
      // 59: dconst_0
      // 5a: dstore 11
      // 5c: dload 7
      // 5e: dload 11
      // 60: dsub
      // 61: dload 7
      // 63: dload 11
      // 65: dadd
      // 66: dload 9
      // 68: invokestatic java/lang/Math.min (DD)D
      // 6b: invokestatic java/lang/Math.max (DD)D
      // 6e: dreturn
   }

   private static double aaa(double var0) {
      return Math.max(0.0, Math.min(100.0, var0));
   }

   public static double aab(double var0) {
      return abbb(var0, 0.85);
   }

   public static boolean aba(long var0, long var2) {
      int var4 = ab;

      try {
         long var6;
         int var10000 = (var6 = var0 - var2) == 0L ? 0 : (var6 < 0L ? -1 : 1);
         if (var4 != 0) {
            return (boolean)var10000;
         }

         if (var10000 < 0) {
            return (boolean)1;
         }
      } catch (MatchException var5) {
         throw var5;
      }

      return (boolean)0;
   }

   public static List abb(String param0, String param1) {
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
      // 12: ifne 25
      // 15: invokevirtual java/lang/String.isBlank ()Z
      // 18: ifeq 24
      // 1b: goto 1f
      // 1e: athrow
      // 1f: invokestatic java/util/List.of ()Ljava/util/List;
      // 22: areturn
      // 23: athrow
      // 24: aload 1
      // 25: iload 2
      // 26: ifne 61
      // 29: ifnull 43
      // 2c: goto 30
      // 2f: athrow
      // 30: aload 1
      // 31: iload 2
      // 32: ifne 61
      // 35: goto 39
      // 38: athrow
      // 39: invokevirtual java/lang/String.isBlank ()Z
      // 3c: ifeq 64
      // 3f: goto 43
      // 42: athrow
      // 43: ldc 1386777743
      // 45: ldc 1000825043
      // 47: ldc -1693981894
      // 49: ixor
      // 4a: invokestatic qeaa361f143ee4a0894bd168fd9b30c66/qf4ccf8f5435d4a78bdca4d6a018b578e/aabbabbab.a (II)I
      // 4d: ldc 1386777742
      // 4f: ldc 1000825043
      // 51: ldc 1515815276
      // 53: ixor
      // 54: invokestatic qeaa361f143ee4a0894bd168fd9b30c66/qf4ccf8f5435d4a78bdca4d6a018b578e/aabbabbab.a (II)I
      // 57: invokestatic qeaa361f143ee4a0894bd168fd9b30c66/qf4ccf8f5435d4a78bdca4d6a018b578e/aabbabbab.aaab (II)Ljava/lang/String;
      // 5a: invokestatic qeaa361f143ee4a0894bd168fd9b30c66/qf4ccf8f5435d4a78bdca4d6a018b578e/aabbaaaba.abba (Ljava/lang/String;)Ljava/lang/String;
      // 5d: goto 61
      // 60: athrow
      // 61: goto 65
      // 64: aload 1
      // 65: astore 3
      // 66: aload 0
      // 67: aload 3
      // 68: invokevirtual java/lang/String.split (Ljava/lang/String;)[Ljava/lang/String;
      // 6b: astore 4
      // 6d: new java/util/ArrayList
      // 70: dup
      // 71: invokespecial java/util/ArrayList.<init> ()V
      // 74: astore 5
      // 76: aload 4
      // 78: astore 6
      // 7a: aload 6
      // 7c: arraylength
      // 7d: istore 7
      // 7f: bipush 0
      // 80: istore 8
      // 82: iload 8
      // 84: iload 7
      // 86: if_icmpge d5
      // 89: aload 6
      // 8b: iload 8
      // 8d: aaload
      // 8e: astore 9
      // 90: aload 9
      // 92: iload 2
      // 93: ifne ae
      // 96: ifnonnull a5
      // 99: goto 9d
      // 9c: athrow
      // 9d: iload 2
      // 9e: ifeq ce
      // a1: goto a5
      // a4: athrow
      // a5: aload 9
      // a7: invokevirtual java/lang/String.trim ()Ljava/lang/String;
      // aa: goto ae
      // ad: athrow
      // ae: astore 10
      // b0: iload 2
      // b1: ifne d1
      // b4: aload 10
      // b6: invokevirtual java/lang/String.isEmpty ()Z
      // b9: ifne ce
      // bc: goto c0
      // bf: athrow
      // c0: aload 5
      // c2: aload 10
      // c4: invokeinterface java/util/List.add (Ljava/lang/Object;)Z 2
      // c9: pop
      // ca: goto ce
      // cd: athrow
      // ce: iinc 8 1
      // d1: iload 2
      // d2: ifeq 82
      // d5: aload 5
      // d7: invokestatic java/util/List.copyOf (Ljava/util/Collection;)Ljava/util/List;
      // da: areturn
   }

   public static double baa(double param0) {
      // $VF: Couldn't be decompiled
      // Please report this to the Vineflower issue tracker, at https://github.com/Vineflower/vineflower/issues with a copy of the class file (if you have the rights to distribute it!)
      // java.lang.RuntimeException: parsing failure!
      //   at org.jetbrains.java.decompiler.modules.decompiler.decompose.DomHelper.parseGraph(DomHelper.java:211)
      //   at org.jetbrains.java.decompiler.main.rels.MethodProcessor.codeToJava(MethodProcessor.java:166)
      //
      // Bytecode:
      // 00: getstatic qeaa361f143ee4a0894bd168fd9b30c66/qf4ccf8f5435d4a78bdca4d6a018b578e/aabbabbab.ab I
      // 03: istore 2
      // 04: dload 0
      // 05: iload 2
      // 06: ifne 1c
      // 09: invokestatic java/lang/Double.isFinite (D)Z
      // 0c: ifeq 1f
      // 0f: goto 13
      // 12: athrow
      // 13: dconst_0
      // 14: dload 0
      // 15: invokestatic java/lang/Math.max (DD)D
      // 18: goto 1c
      // 1b: athrow
      // 1c: goto 20
      // 1f: dconst_0
      // 20: dstore 3
      // 21: dconst_1
      // 22: dload 3
      // 23: ldc2_w 30.0
      // 26: ddiv
      // 27: invokestatic java/lang/Math.min (DD)D
      // 2a: dstore 5
      // 2c: dload 5
      // 2e: dload 5
      // 30: dmul
      // 31: ldc2_w 3.0
      // 34: ldc2_w 2.0
      // 37: dload 5
      // 39: dmul
      // 3a: dsub
      // 3b: dmul
      // 3c: dstore 7
      // 3e: ldc2_w 0.14
      // 41: dload 7
      // 43: ldc2_w 0.86
      // 46: dmul
      // 47: dadd
      // 48: dreturn
   }

   public static boolean bab(double var0, double var2) {
      int var4 = ab;

      try {
         double var6;
         int var10000 = (var6 = var0 - aaa(var2)) == 0.0 ? 0 : (var6 < 0.0 ? -1 : 1);
         if (var4 != 0) {
            return (boolean)var10000;
         }

         if (var10000 < 0) {
            return (boolean)1;
         }
      } catch (MatchException var5) {
         throw var5;
      }

      return (boolean)0;
   }

   private static boolean bba(double param0, double param2, double param4, double param6, double[] param8) {
      // $VF: Couldn't be decompiled
      // Please report this to the Vineflower issue tracker, at https://github.com/Vineflower/vineflower/issues with a copy of the class file (if you have the rights to distribute it!)
      // java.lang.RuntimeException: parsing failure!
      //   at org.jetbrains.java.decompiler.modules.decompiler.decompose.DomHelper.parseGraph(DomHelper.java:211)
      //   at org.jetbrains.java.decompiler.main.rels.MethodProcessor.codeToJava(MethodProcessor.java:166)
      //
      // Bytecode:
      // 00: getstatic qeaa361f143ee4a0894bd168fd9b30c66/qf4ccf8f5435d4a78bdca4d6a018b578e/aabbabbab.ab I
      // 03: istore 9
      // 05: dload 2
      // 06: iload 9
      // 08: ifne 4d
      // 0b: invokestatic java/lang/Math.abs (D)D
      // 0e: ldc2_w 1.0E-9
      // 11: dcmpg
      // 12: ifge 47
      // 15: goto 19
      // 18: athrow
      // 19: dload 0
      // 1a: iload 9
      // 1c: ifne 32
      // 1f: goto 23
      // 22: athrow
      // 23: dload 4
      // 25: dcmpl
      // 26: iflt 45
      // 29: goto 2d
      // 2c: athrow
      // 2d: dload 0
      // 2e: goto 32
      // 31: athrow
      // 32: dload 6
      // 34: dcmpg
      // 35: iload 9
      // 37: ifne 42
      // 3a: ifgt 45
      // 3d: goto 41
      // 40: athrow
      // 41: bipush 1
      // 42: goto 46
      // 45: bipush 0
      // 46: ireturn
      // 47: dload 4
      // 49: dload 0
      // 4a: dsub
      // 4b: dload 2
      // 4c: ddiv
      // 4d: dstore 10
      // 4f: iload 9
      // 51: dload 6
      // 53: dload 0
      // 54: dsub
      // 55: dload 2
      // 56: ddiv
      // 57: dstore 12
      // 59: ifne 8e
      // 5c: dload 10
      // 5e: dload 12
      // 60: dcmpl
      // 61: ifle 74
      // 64: goto 68
      // 67: athrow
      // 68: dload 10
      // 6a: dstore 14
      // 6c: dload 12
      // 6e: dstore 10
      // 70: dload 14
      // 72: dstore 12
      // 74: aload 8
      // 76: bipush 0
      // 77: aload 8
      // 79: bipush 0
      // 7a: daload
      // 7b: dload 10
      // 7d: invokestatic java/lang/Math.max (DD)D
      // 80: dastore
      // 81: aload 8
      // 83: bipush 1
      // 84: aload 8
      // 86: bipush 1
      // 87: daload
      // 88: dload 12
      // 8a: invokestatic java/lang/Math.min (DD)D
      // 8d: dastore
      // 8e: aload 8
      // 90: bipush 0
      // 91: daload
      // 92: aload 8
      // 94: bipush 1
      // 95: daload
      // 96: dcmpg
      // 97: iload 9
      // 99: ifne a4
      // 9c: ifgt a7
      // 9f: goto a3
      // a2: athrow
      // a3: bipush 1
      // a4: goto a8
      // a7: bipush 0
      // a8: ireturn
   }

   public static boolean bbb(double var0, double var2) {
      int var4 = ab;

      try {
         double var6;
         int var10000 = (var6 = var0 - aaa(var2)) == 0.0 ? 0 : (var6 < 0.0 ? -1 : 1);
         if (var4 != 0) {
            return (boolean)var10000;
         }

         if (var10000 >= 0) {
            return (boolean)1;
         }
      } catch (MatchException var5) {
         throw var5;
      }

      return (boolean)0;
   }

   public static double aaaa(double param0) {
      // $VF: Couldn't be decompiled
      // Please report this to the Vineflower issue tracker, at https://github.com/Vineflower/vineflower/issues with a copy of the class file (if you have the rights to distribute it!)
      // java.lang.RuntimeException: parsing failure!
      //   at org.jetbrains.java.decompiler.modules.decompiler.decompose.DomHelper.parseGraph(DomHelper.java:211)
      //   at org.jetbrains.java.decompiler.main.rels.MethodProcessor.codeToJava(MethodProcessor.java:166)
      //
      // Bytecode:
      // 00: getstatic qeaa361f143ee4a0894bd168fd9b30c66/qf4ccf8f5435d4a78bdca4d6a018b578e/aabbabbab.ab I
      // 03: istore 2
      // 04: dload 0
      // 05: iload 2
      // 06: ifne 1c
      // 09: invokestatic java/lang/Double.isFinite (D)Z
      // 0c: ifeq 1f
      // 0f: goto 13
      // 12: athrow
      // 13: dconst_0
      // 14: dload 0
      // 15: invokestatic java/lang/Math.max (DD)D
      // 18: goto 1c
      // 1b: athrow
      // 1c: goto 20
      // 1f: dconst_0
      // 20: dstore 3
      // 21: dconst_0
      // 22: dconst_1
      // 23: dload 3
      // 24: ldc2_w 0.5
      // 27: dsub
      // 28: ldc2_w 11.5
      // 2b: ddiv
      // 2c: invokestatic java/lang/Math.min (DD)D
      // 2f: invokestatic java/lang/Math.max (DD)D
      // 32: dstore 5
      // 34: dload 5
      // 36: dload 5
      // 38: dmul
      // 39: ldc2_w 3.0
      // 3c: ldc2_w 2.0
      // 3f: dload 5
      // 41: dmul
      // 42: dsub
      // 43: dmul
      // 44: dreturn
   }

   private static String aaab(int var0, int var1) {
      int var9 = -1355971296;
      int var2 = (var0 ^ a(1386777741, var9 ^ 1287594877)) & a(1386777740, var9 ^ -572157124);
      if (aa[var2] == null) {
         char[] var3 = abb[var2].toCharArray();

         int var4 = switch (var3[0] & a(1386777739, var9 ^ -1789986146)) {
            case 0 -> a(1386777738, var9 ^ 1093047859);
            case 1 -> a(1386777737, var9 ^ -824300415);
            case 2 -> a(1386777736, var9 ^ 798188971);
            case 3 -> a(1386777735, var9 ^ -937710099);
            case 4 -> a(1386777734, var9 ^ 1205869775);
            case 5 -> a(1386777733, var9 ^ -2094411375);
            case 6 -> a(1386777732, var9 ^ 864513619);
            case 7 -> a(1386777731, var9 ^ -1489547206);
            case 8 -> a(1386777730, var9 ^ -424457371);
            case 9 -> a(1386777729, var9 ^ 160474272);
            case 10 -> a(1386777728, var9 ^ -419123380);
            case 11 -> a(1386777759, var9 ^ -2010556043);
            case 12 -> a(1386777758, var9 ^ -2001084812);
            case 13 -> a(1386777757, var9 ^ 2122929654);
            case 14 -> a(1386777756, var9 ^ -128345937);
            case 15 -> a(1386777755, var9 ^ 1776014018);
            case 16 -> a(1386777754, var9 ^ 1928923331);
            case 17 -> a(1386777753, var9 ^ -197763059);
            case 18 -> a(1386777752, var9 ^ 575241546);
            case 19 -> a(1386777751, var9 ^ 1107825909);
            case 20 -> a(1386777750, var9 ^ -1360675730);
            case 21 -> a(1386777749, var9 ^ 1752099533);
            case 22 -> a(1386777748, var9 ^ 1388132016);
            case 23 -> a(1386777747, var9 ^ 548084296);
            case 24 -> a(1386777746, var9 ^ 370515295);
            case 25 -> a(1386777745, var9 ^ -131617896);
            case 26 -> a(1386777744, var9 ^ -71120149);
            case 27 -> a(1386777775, var9 ^ -96781178);
            case 28 -> a(1386777774, var9 ^ -993083354);
            case 29 -> a(1386777773, var9 ^ 167748014);
            case 30 -> a(1386777772, var9 ^ 65650434);
            case 31 -> a(1386777771, var9 ^ 784764100);
            case 32 -> a(1386777770, var9 ^ 2048908625);
            case 33 -> a(1386777769, var9 ^ -209747154);
            case 34 -> a(1386777768, var9 ^ -848103585);
            case 35 -> a(1386777767, var9 ^ -606256150);
            case 36 -> a(1386777766, var9 ^ -436652194);
            case 37 -> a(1386777765, var9 ^ -1342944028);
            case 38 -> a(1386777764, var9 ^ -552828416);
            case 39 -> a(1386777763, var9 ^ 774764963);
            case 40 -> a(1386777762, var9 ^ -1725835663);
            case 41 -> a(1386777761, var9 ^ 435110345);
            case 42 -> a(1386777760, var9 ^ -1261988888);
            case 43 -> a(1386777791, var9 ^ -1451846664);
            case 44 -> a(1386777790, var9 ^ 1220786067);
            case 45 -> a(1386777789, var9 ^ 1691665914);
            case 46 -> a(1386777788, var9 ^ 879280983);
            case 47 -> a(1386777787, var9 ^ -1271503938);
            case 48 -> a(1386777786, var9 ^ 724691084);
            case 49 -> a(1386777785, var9 ^ 869509202);
            case 50 -> a(1386777784, var9 ^ -209978587);
            case 51 -> a(1386777783, var9 ^ -1986531636);
            case 52 -> a(1386777782, var9 ^ -1225333250);
            case 53 -> a(1386777781, var9 ^ -727192493);
            case 54 -> a(1386777780, var9 ^ -781233067);
            case 55 -> a(1386777779, var9 ^ -390085410);
            case 56 -> a(1386777778, var9 ^ 628018545);
            case 57 -> a(1386777777, var9 ^ 1804723164);
            case 58 -> a(1386777776, var9 ^ -708978534);
            case 59 -> a(1386777807, var9 ^ -1784204767);
            case 60 -> a(1386777806, var9 ^ 632458131);
            case 61 -> a(1386777805, var9 ^ -1582270988);
            case 62 -> a(1386777804, var9 ^ 1010943161);
            case 63 -> a(1386777803, var9 ^ -1172364529);
            case 64 -> a(1386777802, var9 ^ -1816063094);
            case 65 -> a(1386777801, var9 ^ -831166622);
            case 66 -> a(1386777800, var9 ^ 661337443);
            case 67 -> a(1386777799, var9 ^ -1988158784);
            case 68 -> a(1386777798, var9 ^ 799020063);
            case 69 -> a(1386777797, var9 ^ -539624079);
            case 70 -> a(1386777796, var9 ^ -1483052750);
            case 71 -> a(1386777795, var9 ^ 222515262);
            case 72 -> a(1386777794, var9 ^ -238119396);
            case 73 -> a(1386777793, var9 ^ 339386182);
            case 74 -> a(1386777792, var9 ^ -1358289623);
            case 75 -> a(1386777823, var9 ^ 1368225377);
            case 76 -> a(1386777822, var9 ^ 2146385739);
            case 77 -> a(1386777821, var9 ^ -864078915);
            case 78 -> a(1386777820, var9 ^ 1825339295);
            case 79 -> a(1386777819, var9 ^ -1917462824);
            case 80 -> a(1386777818, var9 ^ -1592665787);
            case 81 -> a(1386777817, var9 ^ 1028956253);
            case 82 -> a(1386777816, var9 ^ -1790865088);
            case 83 -> a(1386777815, var9 ^ -1455832870);
            case 84 -> a(1386777814, var9 ^ 256792129);
            case 85 -> a(1386777813, var9 ^ -1664869193);
            case 86 -> a(1386777812, var9 ^ 1271714828);
            case 87 -> a(1386777811, var9 ^ 524963737);
            case 88 -> a(1386777810, var9 ^ 1288241721);
            case 89 -> a(1386777809, var9 ^ 297800227);
            case 90 -> a(1386777808, var9 ^ 2106480584);
            case 91 -> a(1386777839, var9 ^ 1750680101);
            case 92 -> a(1386777838, var9 ^ -13201264);
            case 93 -> a(1386777837, var9 ^ -1393770129);
            case 94 -> a(1386777836, var9 ^ -803087006);
            case 95 -> a(1386777835, var9 ^ -1380407858);
            case 96 -> a(1386777834, var9 ^ -2077455073);
            case 97 -> a(1386777833, var9 ^ -2015544489);
            case 98 -> a(1386777832, var9 ^ -1092115526);
            case 99 -> a(1386777831, var9 ^ -2091531767);
            case 100 -> a(1386777830, var9 ^ -824273362);
            case 101 -> a(1386777829, var9 ^ 1791262161);
            case 102 -> a(1386777828, var9 ^ -1319268990);
            case 103 -> a(1386777827, var9 ^ -1737579759);
            case 104 -> a(1386777826, var9 ^ -545972259);
            case 105 -> a(1386777825, var9 ^ 1162045190);
            case 106 -> a(1386777824, var9 ^ 793871150);
            case 107 -> a(1386777855, var9 ^ -1833315905);
            case 108 -> a(1386777854, var9 ^ -1889659541);
            case 109 -> a(1386777853, var9 ^ 413835046);
            case 110 -> 3;
            case 111 -> a(1386777852, var9 ^ -467590740);
            case 112 -> a(1386777851, var9 ^ -186153375);
            case 113 -> a(1386777850, var9 ^ -2141156269);
            case 114 -> a(1386777849, var9 ^ -951928051);
            case 115 -> a(1386777848, var9 ^ -533963908);
            case 116 -> a(1386777847, var9 ^ -1677192848);
            case 117 -> a(1386777846, var9 ^ -620909805);
            case 118 -> a(1386777845, var9 ^ -722936560);
            case 119 -> a(1386777844, var9 ^ -933597459);
            case 120 -> a(1386777843, var9 ^ -1632509990);
            case 121 -> a(1386777842, var9 ^ -311493379);
            case 122 -> a(1386777841, var9 ^ 1898438304);
            case 123 -> a(1386777840, var9 ^ 1708181820);
            case 124 -> a(1386777615, var9 ^ 439521927);
            case 125 -> a(1386777614, var9 ^ 510299708);
            case 126 -> a(1386777613, var9 ^ 260711073);
            case 127 -> a(1386777612, var9 ^ -1238247591);
            case 128 -> a(1386777611, var9 ^ -851290096);
            case 129 -> a(1386777610, var9 ^ -599588332);
            case 130 -> a(1386777609, var9 ^ -654143317);
            case 131 -> a(1386777608, var9 ^ 1471465225);
            case 132 -> a(1386777607, var9 ^ 805006317);
            case 133 -> a(1386777606, var9 ^ 1799537180);
            case 134 -> a(1386777605, var9 ^ 1891779802);
            case 135 -> a(1386777604, var9 ^ 1049472149);
            case 136 -> a(1386777603, var9 ^ -753980454);
            case 137 -> a(1386777602, var9 ^ 1596957575);
            case 138 -> a(1386777601, var9 ^ -171495004);
            case 139 -> a(1386777600, var9 ^ 763044845);
            case 140 -> a(1386777631, var9 ^ 1463777874);
            case 141 -> a(1386777630, var9 ^ -1878431057);
            case 142 -> a(1386777629, var9 ^ -835413875);
            case 143 -> a(1386777628, var9 ^ -1090549963);
            case 144 -> a(1386777627, var9 ^ 1451823869);
            case 145 -> a(1386777626, var9 ^ -1689991149);
            case 146 -> a(1386777625, var9 ^ -243193163);
            case 147 -> a(1386777624, var9 ^ -1156155194);
            case 148 -> a(1386777623, var9 ^ 715696078);
            case 149 -> a(1386777622, var9 ^ -1759520021);
            case 150 -> a(1386777621, var9 ^ -2100595138);
            case 151 -> a(1386777620, var9 ^ 509168878);
            case 152 -> a(1386777619, var9 ^ 1987015766);
            case 153 -> a(1386777618, var9 ^ -638088877);
            case 154 -> a(1386777617, var9 ^ -1281580354);
            case 155 -> a(1386777616, var9 ^ -138001024);
            case 156 -> a(1386777647, var9 ^ 1916279297);
            case 157 -> a(1386777646, var9 ^ 1888107541);
            case 158 -> a(1386777645, var9 ^ 1855745629);
            case 159 -> a(1386777644, var9 ^ -155918306);
            case 160 -> a(1386777643, var9 ^ 1140020099);
            case 161 -> a(1386777642, var9 ^ 296591077);
            case 162 -> a(1386777641, var9 ^ 50088559);
            case 163 -> 0;
            case 164 -> a(1386777640, var9 ^ -235649799);
            case 165 -> a(1386777639, var9 ^ -1134485555);
            case 166 -> a(1386777638, var9 ^ -1281773144);
            case 167 -> a(1386777637, var9 ^ -2034451548);
            case 168 -> a(1386777636, var9 ^ -1090751400);
            case 169 -> 1;
            case 170 -> a(1386777635, var9 ^ -1806643638);
            case 171 -> a(1386777634, var9 ^ 168403591);
            case 172 -> a(1386777633, var9 ^ 1195262442);
            case 173 -> a(1386777632, var9 ^ 1788568681);
            case 174 -> a(1386777663, var9 ^ -1612925559);
            case 175 -> a(1386777662, var9 ^ 1087713619);
            case 176 -> a(1386777661, var9 ^ -1569779951);
            case 177 -> a(1386777660, var9 ^ 555016957);
            case 178 -> a(1386777659, var9 ^ -349762536);
            case 179 -> a(1386777658, var9 ^ 1428195632);
            case 180 -> a(1386777657, var9 ^ 478457937);
            case 181 -> a(1386777656, var9 ^ -583493514);
            case 182 -> a(1386777655, var9 ^ -1280776332);
            case 183 -> a(1386777654, var9 ^ -1620838456);
            case 184 -> a(1386777653, var9 ^ 1885868626);
            case 185 -> a(1386777652, var9 ^ -922850579);
            case 186 -> a(1386777651, var9 ^ -636710497);
            case 187 -> a(1386777650, var9 ^ 966373016);
            case 188 -> a(1386777649, var9 ^ -715175130);
            case 189 -> a(1386777648, var9 ^ 1144201857);
            case 190 -> a(1386777679, var9 ^ 1474939114);
            case 191 -> a(1386777678, var9 ^ -311042733);
            case 192 -> a(1386777677, var9 ^ -694724571);
            case 193 -> a(1386777676, var9 ^ -688941048);
            case 194 -> a(1386777675, var9 ^ 1048679699);
            case 195 -> a(1386777674, var9 ^ 882501207);
            case 196 -> a(1386777673, var9 ^ 2053319251);
            case 197 -> a(1386777672, var9 ^ 538686735);
            case 198 -> a(1386777671, var9 ^ 1945378120);
            case 199 -> a(1386777670, var9 ^ 295798847);
            case 200 -> a(1386777669, var9 ^ 703401756);
            case 201 -> a(1386777668, var9 ^ 210594348);
            case 202 -> a(1386777667, var9 ^ 1020293277);
            case 203 -> a(1386777666, var9 ^ -1215698433);
            case 204 -> a(1386777665, var9 ^ -969897924);
            case 205 -> a(1386777664, var9 ^ 1783427157);
            case 206 -> a(1386777695, var9 ^ -311707102);
            case 207 -> a(1386777694, var9 ^ -367945899);
            case 208 -> a(1386777693, var9 ^ -1996529877);
            case 209 -> 2;
            case 210 -> a(1386777692, var9 ^ -169831243);
            case 211 -> a(1386777691, var9 ^ 988338541);
            case 212 -> a(1386777690, var9 ^ 1287223942);
            case 213 -> a(1386777689, var9 ^ 1897421729);
            case 214 -> a(1386777688, var9 ^ -1176581849);
            case 215 -> a(1386777687, var9 ^ 741914114);
            case 216 -> a(1386777686, var9 ^ -1809487616);
            case 217 -> a(1386777685, var9 ^ -2023321210);
            case 218 -> a(1386777684, var9 ^ -1945435513);
            case 219 -> a(1386777683, var9 ^ 1655823444);
            case 220 -> a(1386777682, var9 ^ -1096645558);
            case 221 -> a(1386777681, var9 ^ 27991597);
            case 222 -> a(1386777680, var9 ^ -83962032);
            case 223 -> a(1386777711, var9 ^ -1968977315);
            case 224 -> a(1386777710, var9 ^ 628203405);
            case 225 -> a(1386777709, var9 ^ -1168195883);
            case 226 -> 4;
            case 227 -> a(1386777708, var9 ^ 422385179);
            case 228 -> a(1386777707, var9 ^ 1715585463);
            case 229 -> a(1386777706, var9 ^ 180106955);
            case 230 -> a(1386777705, var9 ^ 1440329470);
            case 231 -> a(1386777704, var9 ^ -396460247);
            case 232 -> a(1386777703, var9 ^ -1898408225);
            case 233 -> a(1386777702, var9 ^ -523103771);
            case 234 -> a(1386777701, var9 ^ -1143418821);
            case 235 -> a(1386777700, var9 ^ 1525525879);
            case 236 -> a(1386777699, var9 ^ 1953248239);
            case 237 -> a(1386777698, var9 ^ -232095511);
            case 238 -> a(1386777697, var9 ^ -871563839);
            case 239 -> a(1386777696, var9 ^ -1200305165);
            case 240 -> a(1386777727, var9 ^ -456451855);
            case 241 -> a(1386777726, var9 ^ 230577820);
            case 242 -> a(1386777725, var9 ^ 468602027);
            case 243 -> a(1386777724, var9 ^ 1111965990);
            case 244 -> 5;
            case 245 -> a(1386777723, var9 ^ -2135334690);
            case 246 -> a(1386777722, var9 ^ 1207733508);
            case 247 -> a(1386777721, var9 ^ 852740609);
            case 248 -> a(1386777720, var9 ^ 430687665);
            case 249 -> a(1386777719, var9 ^ 419341147);
            case 250 -> a(1386777718, var9 ^ -322694331);
            case 251 -> a(1386777717, var9 ^ 562094319);
            case 252 -> a(1386777716, var9 ^ -1635907905);
            case 253 -> a(1386777715, var9 ^ -793012425);
            case 254 -> a(1386777714, var9 ^ 1396038494);
            default -> a(1386777713, var9 ^ 1331991544);
         };
         int var5 = (var1 & a(1386777712, var9 ^ -1671898443)) - var4;
         if (var5 < 0) {
            var5 += 256;
         }

         int var6 = ((var1 & a(1386777999, var9 ^ 1110385524)) >>> a(1386777998, var9 ^ -639434405)) - var4;
         if (var6 < 0) {
            var6 += 256;
         }

         for (int var7 = 0; var7 < var3.length; var7++) {
            int var8 = var7 % 2;
            char var10002 = var3[var7];
            if (var8 == 0) {
               var3[var7] = (char)(var10002 ^ var5);
               var5 = ((var5 >>> 3 | var5 << 5) ^ var3[var7]) & a(1386777997, var9 ^ 352398133);
            } else {
               var3[var7] = (char)(var10002 ^ var6);
               var6 = ((var6 >>> 3 | var6 << 5) ^ var3[var7]) & a(1386777996, var9 ^ 1893125228);
            }
         }

         aa[var2] = new String(var3).intern();
      }

      return aa[var2];
   }

   public static boolean aaba(double var0) {
      int var2 = ab;

      try {
         double var4;
         int var10000 = (var4 = var0 - 0.1) == 0.0 ? 0 : (var4 < 0.0 ? -1 : 1);
         if (var2 != 0) {
            return (boolean)var10000;
         }

         if (var10000 >= 0) {
            return (boolean)1;
         }
      } catch (MatchException var3) {
         throw var3;
      }

      return (boolean)0;
   }

   public static boolean aabb(boolean param0, String param1) {
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
      // 05: ifeq 2b
      // 08: aload 1
      // 09: iload 2
      // 0a: ifne 19
      // 0d: goto 11
      // 10: athrow
      // 11: ifnull 2b
      // 14: goto 18
      // 17: athrow
      // 18: aload 1
      // 19: invokevirtual java/lang/String.isBlank ()Z
      // 1c: iload 2
      // 1d: ifne 28
      // 20: ifne 2b
      // 23: goto 27
      // 26: athrow
      // 27: bipush 1
      // 28: goto 2c
      // 2b: bipush 0
      // 2c: ireturn
   }

   private static String aabab(short var0, int var1, char var2) {
      int var3 = var2 ^ '\ueb49';
      char[] var4 = bbb[var3].toCharArray();
      StackTraceElement[] var5 = (StackTraceElement[])aaaa[var3];
      StackTraceElement[] var6;
      if (var5 != null) {
         var6 = var5;
      } else {
         var6 = new Throwable().getStackTrace();
         aaaa[var3] = var6;
      }

      StackTraceElement var7 = var6[1];
      int var8 = (var7.getClassName().hashCode() ^ var7.getMethodName().hashCode()) >> 16 ^ 15816;
      int var9 = 0;

      do {
         int var10 = var4[var9] ^ '해';
         var10 += 12630;
         var10 += 17074;
         var10 += 18988;
         var10 += 64756;
         var10 += 27887;
         var10 ^= 47290;
         var10 ^= 30185;
         var10 += 222;
         var4[var9] = (char)(var10 ^ var8 ^ var0 ^ var1 >> 16);
      } while (++var9 < var4.length);

      return new String(var4).intern();
   }

   public static long abaa(long var0, long var2, long var4) {
      return Math.max(var0, var2 + Math.max(0L, var4));
   }

   private static float abab(float param0) {
      // $VF: Couldn't be decompiled
      // Please report this to the Vineflower issue tracker, at https://github.com/Vineflower/vineflower/issues with a copy of the class file (if you have the rights to distribute it!)
      // java.lang.RuntimeException: parsing failure!
      //   at org.jetbrains.java.decompiler.modules.decompiler.decompose.DomHelper.parseGraph(DomHelper.java:211)
      //   at org.jetbrains.java.decompiler.main.rels.MethodProcessor.codeToJava(MethodProcessor.java:166)
      //
      // Bytecode:
      // 00: getstatic qeaa361f143ee4a0894bd168fd9b30c66/qf4ccf8f5435d4a78bdca4d6a018b578e/aabbabbab.ab I
      // 03: fload 0
      // 04: invokestatic java/lang/Math.abs (F)F
      // 07: fstore 2
      // 08: istore 1
      // 09: fload 2
      // 0a: iload 1
      // 0b: ifne 1f
      // 0e: ldc_w 0.5
      // 11: fcmpg
      // 12: ifge 1e
      // 15: goto 19
      // 18: athrow
      // 19: fconst_0
      // 1a: goto 23
      // 1d: athrow
      // 1e: fconst_1
      // 1f: fload 0
      // 20: invokestatic java/lang/Math.copySign (FF)F
      // 23: freturn
   }

   public static boolean abba(boolean param0, int param1, boolean param2) {
      // $VF: Couldn't be decompiled
      // Please report this to the Vineflower issue tracker, at https://github.com/Vineflower/vineflower/issues with a copy of the class file (if you have the rights to distribute it!)
      // java.lang.RuntimeException: parsing failure!
      //   at org.jetbrains.java.decompiler.modules.decompiler.decompose.DomHelper.parseGraph(DomHelper.java:211)
      //   at org.jetbrains.java.decompiler.main.rels.MethodProcessor.codeToJava(MethodProcessor.java:166)
      //
      // Bytecode:
      // 00: getstatic qeaa361f143ee4a0894bd168fd9b30c66/qf4ccf8f5435d4a78bdca4d6a018b578e/aabbabbab.ab I
      // 03: istore 3
      // 04: iload 2
      // 05: iload 3
      // 06: ifne 11
      // 09: ifne 30
      // 0c: goto 10
      // 0f: athrow
      // 10: iload 0
      // 11: iload 3
      // 12: ifne 2d
      // 15: ifne 2c
      // 18: goto 1c
      // 1b: athrow
      // 1c: iload 1
      // 1d: iload 3
      // 1e: ifne 2d
      // 21: goto 25
      // 24: athrow
      // 25: ifle 30
      // 28: goto 2c
      // 2b: athrow
      // 2c: bipush 1
      // 2d: goto 31
      // 30: bipush 0
      // 31: ireturn
   }

   public static double abbb(double param0, double param2) {
      // $VF: Couldn't be decompiled
      // Please report this to the Vineflower issue tracker, at https://github.com/Vineflower/vineflower/issues with a copy of the class file (if you have the rights to distribute it!)
      // java.lang.RuntimeException: parsing failure!
      //   at org.jetbrains.java.decompiler.modules.decompiler.decompose.DomHelper.parseGraph(DomHelper.java:211)
      //   at org.jetbrains.java.decompiler.main.rels.MethodProcessor.codeToJava(MethodProcessor.java:166)
      //
      // Bytecode:
      // 00: getstatic qeaa361f143ee4a0894bd168fd9b30c66/qf4ccf8f5435d4a78bdca4d6a018b578e/aabbabbab.ab I
      // 03: istore 4
      // 05: dload 0
      // 06: iload 4
      // 08: ifne 24
      // 0b: invokestatic java/lang/Double.isFinite (D)Z
      // 0e: ifeq 27
      // 11: goto 15
      // 14: athrow
      // 15: dconst_0
      // 16: dload 0
      // 17: ldc2_w 0.1
      // 1a: invokestatic java/lang/Math.min (DD)D
      // 1d: invokestatic java/lang/Math.max (DD)D
      // 20: goto 24
      // 23: athrow
      // 24: goto 28
      // 27: dconst_0
      // 28: dstore 5
      // 2a: dload 2
      // 2b: iload 4
      // 2d: ifne 47
      // 30: invokestatic java/lang/Double.isFinite (D)Z
      // 33: ifeq 4a
      // 36: goto 3a
      // 39: athrow
      // 3a: dconst_0
      // 3b: dload 2
      // 3c: dconst_1
      // 3d: invokestatic java/lang/Math.min (DD)D
      // 40: invokestatic java/lang/Math.max (DD)D
      // 43: goto 47
      // 46: athrow
      // 47: goto 4d
      // 4a: ldc2_w 0.85
      // 4d: dstore 7
      // 4f: ldc2_w 12.0
      // 52: dload 7
      // 54: ldc2_w 9.5
      // 57: dmul
      // 58: dsub
      // 59: dstore 9
      // 5b: dconst_1
      // 5c: dload 5
      // 5e: dneg
      // 5f: dload 9
      // 61: dmul
      // 62: invokestatic java/lang/Math.exp (D)D
      // 65: dsub
      // 66: dreturn
   }

   public static boolean baaa(
      double param0,
      double param2,
      double param4,
      double param6,
      double param8,
      double param10,
      double param12,
      double param14,
      double param16,
      double param18,
      double param20,
      double param22
   ) {
      // $VF: Couldn't be decompiled
      // Please report this to the Vineflower issue tracker, at https://github.com/Vineflower/vineflower/issues with a copy of the class file (if you have the rights to distribute it!)
      // java.lang.RuntimeException: parsing failure!
      //   at org.jetbrains.java.decompiler.modules.decompiler.decompose.DomHelper.parseGraph(DomHelper.java:211)
      //   at org.jetbrains.java.decompiler.main.rels.MethodProcessor.codeToJava(MethodProcessor.java:166)
      //
      // Bytecode:
      // 00: getstatic qeaa361f143ee4a0894bd168fd9b30c66/qf4ccf8f5435d4a78bdca4d6a018b578e/aabbabbab.ab I
      // 03: bipush 2
      // 04: newarray 7
      // 06: dup
      // 07: bipush 0
      // 08: dconst_0
      // 09: dastore
      // 0a: dup
      // 0b: bipush 1
      // 0c: dconst_1
      // 0d: dastore
      // 0e: astore 25
      // 10: istore 24
      // 12: dload 0
      // 13: dload 6
      // 15: dload 0
      // 16: dsub
      // 17: dload 12
      // 19: dload 18
      // 1b: invokestatic java/lang/Math.min (DD)D
      // 1e: dload 12
      // 20: dload 18
      // 22: invokestatic java/lang/Math.max (DD)D
      // 25: aload 25
      // 27: invokestatic qeaa361f143ee4a0894bd168fd9b30c66/qf4ccf8f5435d4a78bdca4d6a018b578e/aabbabbab.bba (DDDD[D)Z
      // 2a: iload 24
      // 2c: ifne 8d
      // 2f: ifeq 88
      // 32: goto 36
      // 35: athrow
      // 36: dload 2
      // 37: dload 8
      // 39: dload 2
      // 3a: dsub
      // 3b: dload 14
      // 3d: dload 20
      // 3f: invokestatic java/lang/Math.min (DD)D
      // 42: dload 14
      // 44: dload 20
      // 46: invokestatic java/lang/Math.max (DD)D
      // 49: aload 25
      // 4b: invokestatic qeaa361f143ee4a0894bd168fd9b30c66/qf4ccf8f5435d4a78bdca4d6a018b578e/aabbabbab.bba (DDDD[D)Z
      // 4e: iload 24
      // 50: ifne 8d
      // 53: goto 57
      // 56: athrow
      // 57: ifeq 88
      // 5a: goto 5e
      // 5d: athrow
      // 5e: dload 4
      // 60: iload 24
      // 62: ifne 9b
      // 65: goto 69
      // 68: athrow
      // 69: dload 10
      // 6b: dload 4
      // 6d: dsub
      // 6e: dload 16
      // 70: dload 22
      // 72: invokestatic java/lang/Math.min (DD)D
      // 75: dload 16
      // 77: dload 22
      // 79: invokestatic java/lang/Math.max (DD)D
      // 7c: aload 25
      // 7e: invokestatic qeaa361f143ee4a0894bd168fd9b30c66/qf4ccf8f5435d4a78bdca4d6a018b578e/aabbabbab.bba (DDDD[D)Z
      // 81: ifne 8e
      // 84: goto 88
      // 87: athrow
      // 88: bipush 0
      // 89: goto 8d
      // 8c: athrow
      // 8d: ireturn
      // 8e: aload 25
      // 90: bipush 0
      // 91: iload 24
      // 93: ifne a9
      // 96: daload
      // 97: goto 9b
      // 9a: athrow
      // 9b: ldc2_w 0.999999
      // 9e: dcmpg
      // 9f: ifge bc
      // a2: aload 25
      // a4: bipush 1
      // a5: goto a9
      // a8: athrow
      // a9: daload
      // aa: dconst_0
      // ab: dcmpl
      // ac: iload 24
      // ae: ifne b9
      // b1: iflt bc
      // b4: goto b8
      // b7: athrow
      // b8: bipush 1
      // b9: goto bd
      // bc: bipush 0
      // bd: ireturn
   }

   public static boolean baab(double param0, float param2, double param3) {
      // $VF: Couldn't be decompiled
      // Please report this to the Vineflower issue tracker, at https://github.com/Vineflower/vineflower/issues with a copy of the class file (if you have the rights to distribute it!)
      // java.lang.RuntimeException: parsing failure!
      //   at org.jetbrains.java.decompiler.modules.decompiler.decompose.DomHelper.parseGraph(DomHelper.java:211)
      //   at org.jetbrains.java.decompiler.main.rels.MethodProcessor.codeToJava(MethodProcessor.java:166)
      //
      // Bytecode:
      // 00: getstatic qeaa361f143ee4a0894bd168fd9b30c66/qf4ccf8f5435d4a78bdca4d6a018b578e/aabbabbab.ab I
      // 03: istore 5
      // 05: dload 0
      // 06: iload 5
      // 08: ifne 1a
      // 0b: invokestatic java/lang/Double.isFinite (D)Z
      // 0e: ifeq 65
      // 11: goto 15
      // 14: athrow
      // 15: dload 0
      // 16: goto 1a
      // 19: athrow
      // 1a: dconst_0
      // 1b: dcmpg
      // 1c: iload 5
      // 1e: ifne 39
      // 21: ifge 65
      // 24: goto 28
      // 27: athrow
      // 28: fload 2
      // 29: iload 5
      // 2b: ifne 3d
      // 2e: goto 32
      // 31: athrow
      // 32: invokestatic java/lang/Float.isFinite (F)Z
      // 35: goto 39
      // 38: athrow
      // 39: ifeq 65
      // 3c: fload 2
      // 3d: iload 5
      // 3f: ifne 52
      // 42: ldc_w 0.9
      // 45: fcmpl
      // 46: ifle 65
      // 49: goto 4d
      // 4c: athrow
      // 4d: fload 2
      // 4e: goto 52
      // 51: athrow
      // 52: f2d
      // 53: dload 3
      // 54: dcmpl
      // 55: iload 5
      // 57: ifne 62
      // 5a: iflt 65
      // 5d: goto 61
      // 60: athrow
      // 61: bipush 1
      // 62: goto 66
      // 65: bipush 0
      // 66: ireturn
   }

   public static boolean baba(double var0, double var2, double var4, double var6, double var8) {
      int var10000 = ab;
      double var11 = Math.max(0.0, var4);
      double var13 = var6 - var0;
      double var15 = var8 - var2;
      int var10 = var10000;

      try {
         double var19;
         var10000 = (var19 = var13 * var13 + var15 * var15 - var11 * var11) == 0.0 ? 0 : (var19 < 0.0 ? -1 : 1);
         if (var10 != 0) {
            return (boolean)var10000;
         }

         if (var10000 <= 0) {
            return (boolean)1;
         }
      } catch (MatchException var17) {
         throw var17;
      }

      return (boolean)0;
   }

   public static double babb(boolean param0, boolean param1) {
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
      // 06: ifne 26
      // 09: ifeq 25
      // 0c: goto 10
      // 0f: athrow
      // 10: iload 1
      // 11: iload 2
      // 12: ifne 26
      // 15: goto 19
      // 18: athrow
      // 19: ifne 25
      // 1c: goto 20
      // 1f: athrow
      // 20: ldc2_w 0.86
      // 23: dreturn
      // 24: athrow
      // 25: iload 1
      // 26: iload 2
      // 27: ifne 32
      // 2a: ifeq 3a
      // 2d: goto 31
      // 30: athrow
      // 31: iload 0
      // 32: ifne 3a
      // 35: ldc2_w 0.58
      // 38: dreturn
      // 39: athrow
      // 3a: ldc2_w 0.73
      // 3d: dreturn
   }

   public static double bbaa(double param0, int param2, int param3) {
      // $VF: Couldn't be decompiled
      // Please report this to the Vineflower issue tracker, at https://github.com/Vineflower/vineflower/issues with a copy of the class file (if you have the rights to distribute it!)
      // java.lang.RuntimeException: parsing failure!
      //   at org.jetbrains.java.decompiler.modules.decompiler.decompose.DomHelper.parseGraph(DomHelper.java:211)
      //   at org.jetbrains.java.decompiler.main.rels.MethodProcessor.codeToJava(MethodProcessor.java:166)
      //
      // Bytecode:
      // 00: getstatic qeaa361f143ee4a0894bd168fd9b30c66/qf4ccf8f5435d4a78bdca4d6a018b578e/aabbabbab.ab I
      // 03: istore 4
      // 05: dload 0
      // 06: iload 4
      // 08: ifne 1e
      // 0b: invokestatic java/lang/Double.isFinite (D)Z
      // 0e: ifeq 21
      // 11: goto 15
      // 14: athrow
      // 15: dconst_1
      // 16: dload 0
      // 17: invokestatic java/lang/Math.max (DD)D
      // 1a: goto 1e
      // 1d: athrow
      // 1e: goto 22
      // 21: dconst_1
      // 22: dstore 5
      // 24: bipush 1
      // 25: iload 2
      // 26: invokestatic java/lang/Math.max (II)I
      // 29: i2d
      // 2a: ldc2_w 652.0
      // 2d: ddiv
      // 2e: dstore 7
      // 30: bipush 1
      // 31: iload 3
      // 32: invokestatic java/lang/Math.max (II)I
      // 35: i2d
      // 36: ldc2_w 446.0
      // 39: ddiv
      // 3a: dstore 9
      // 3c: dconst_1
      // 3d: dload 7
      // 3f: dload 9
      // 41: invokestatic java/lang/Math.min (DD)D
      // 44: invokestatic java/lang/Math.max (DD)D
      // 47: dstore 11
      // 49: dload 5
      // 4b: ldc2_w 3.0
      // 4e: dload 11
      // 50: invokestatic java/lang/Math.min (DD)D
      // 53: invokestatic java/lang/Math.min (DD)D
      // 56: dreturn
   }

   public static boolean bbab(boolean param0, boolean param1, double param2, double param4) {
      // $VF: Couldn't be decompiled
      // Please report this to the Vineflower issue tracker, at https://github.com/Vineflower/vineflower/issues with a copy of the class file (if you have the rights to distribute it!)
      // java.lang.RuntimeException: parsing failure!
      //   at org.jetbrains.java.decompiler.modules.decompiler.decompose.DomHelper.parseGraph(DomHelper.java:211)
      //   at org.jetbrains.java.decompiler.main.rels.MethodProcessor.codeToJava(MethodProcessor.java:166)
      //
      // Bytecode:
      // 00: getstatic qeaa361f143ee4a0894bd168fd9b30c66/qf4ccf8f5435d4a78bdca4d6a018b578e/aabbabbab.ab I
      // 03: istore 6
      // 05: iload 0
      // 06: iload 6
      // 08: ifne 13
      // 0b: ifeq 4a
      // 0e: goto 12
      // 11: athrow
      // 12: iload 1
      // 13: iload 6
      // 15: ifne 26
      // 18: ifne 4a
      // 1b: goto 1f
      // 1e: athrow
      // 1f: dload 2
      // 20: dconst_0
      // 21: dcmpl
      // 22: goto 26
      // 25: athrow
      // 26: iload 6
      // 28: ifne 47
      // 2b: ifge 46
      // 2e: goto 32
      // 31: athrow
      // 32: dload 4
      // 34: dconst_0
      // 35: dcmpg
      // 36: iload 6
      // 38: ifne 47
      // 3b: goto 3f
      // 3e: athrow
      // 3f: ifgt 4a
      // 42: goto 46
      // 45: athrow
      // 46: bipush 1
      // 47: goto 4b
      // 4a: bipush 0
      // 4b: ireturn
   }

   public static boolean bbba(double var0, float var2, boolean var3, boolean var4) {
      int var5 = ab;

      boolean var10000;
      label47: {
         try {
            var10000 = baab(var0, var2, 0.0);
            if (var5 != 0) {
               break label47;
            }

            if (!var10000) {
               return false;
            }
         } catch (MatchException var8) {
            throw var8;
         }

         var10000 = var3;
      }

      label41: {
         try {
            if (var5 != 0) {
               break label41;
            }

            if (var10000) {
               return false;
            }
         } catch (MatchException var7) {
            throw var7;
         }

         var10000 = var4;
      }

      try {
         if (var5 != 0) {
            return var10000;
         }

         if (!var10000) {
            return true;
         }
      } catch (MatchException var6) {
         throw var6;
      }

      return false;
   }

   public static int bbbb(int var0, int var1) {
      return var0 + 1 + Math.max(0, var1);
   }

   private aabbabbab() {
   }

   public static String aaaaa(String param0, int param1) {
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
      // 06: ifne 47
      // 09: ifnull 23
      // 0c: goto 10
      // 0f: athrow
      // 10: aload 0
      // 11: iload 2
      // 12: ifne 4b
      // 15: goto 19
      // 18: athrow
      // 19: invokevirtual java/lang/String.isBlank ()Z
      // 1c: ifeq 4a
      // 1f: goto 23
      // 22: athrow
      // 23: ldc_w 1386777995
      // 26: ldc_w -234883802
      // 29: ldc_w 1414365906
      // 2c: ixor
      // 2d: invokestatic qeaa361f143ee4a0894bd168fd9b30c66/qf4ccf8f5435d4a78bdca4d6a018b578e/aabbabbab.a (II)I
      // 30: ldc_w 1386777994
      // 33: ldc_w -234883802
      // 36: ldc_w 715257678
      // 39: ixor
      // 3a: invokestatic qeaa361f143ee4a0894bd168fd9b30c66/qf4ccf8f5435d4a78bdca4d6a018b578e/aabbabbab.a (II)I
      // 3d: invokestatic qeaa361f143ee4a0894bd168fd9b30c66/qf4ccf8f5435d4a78bdca4d6a018b578e/aabbabbab.aaab (II)Ljava/lang/String;
      // 40: invokestatic qeaa361f143ee4a0894bd168fd9b30c66/qf4ccf8f5435d4a78bdca4d6a018b578e/aabbaaaba.abba (Ljava/lang/String;)Ljava/lang/String;
      // 43: goto 47
      // 46: athrow
      // 47: goto 4e
      // 4a: aload 0
      // 4b: invokevirtual java/lang/String.trim ()Ljava/lang/String;
      // 4e: astore 3
      // 4f: aload 3
      // 50: bipush 1
      // 51: iload 1
      // 52: invokestatic java/lang/Math.max (II)I
      // 55: istore 5
      // 57: astore 4
      // 59: new java/lang/StringBuilder
      // 5c: dup
      // 5d: invokespecial java/lang/StringBuilder.<init> ()V
      // 60: aload 4
      // 62: invokevirtual java/lang/StringBuilder.append (Ljava/lang/Object;)Ljava/lang/StringBuilder;
      // 65: iload 5
      // 67: invokevirtual java/lang/StringBuilder.append (I)Ljava/lang/StringBuilder;
      // 6a: invokevirtual java/lang/StringBuilder.toString ()Ljava/lang/String;
      // 6d: areturn
   }

   // $VF: Irreducible bytecode was duplicated to produce valid code
   static {
      int var24 = -148013540;
      String var14 = "暸晋昬暟晜曠晾暷慃斲曭懔憉曫暽晒晫";
      short var13 = 25927;
      char[] var15 = "\u0011".toCharArray();
      byte var20 = -1;
      String[] var16 = new String[var15.length];

      while (true) {
         int var17 = 0;
         char var18 = 0;
         char var19 = '\u0000';
         if (var20 == 0) {
            bbb = var16;
            aaaa = new Object[var16.length];
            int var9 = 604569118;
            byte[] var7 = "Ö\u0002åß\u0017_Õ\u0090\u00950Ài\u0004j¯ÞLÂÇ{\u0098ª¨e\u0017R\u0012öö\u001fX\u008c\u0011\u0097\u0090\u0019\u009el 1Z¥íjê\u000bR\u008a~»n=??uvÐ\u001c\u009aù>\u0088\u0092zQ¥gkQ5ã®§\u0005hP!Õ¥\u000e°Wì\u008e«u5o-º]ñûÅC\\\u009b\u0084*\u0086wi\u0081Ç±â×Ì\u008b1\u000bTù'&ÙÏ\u0099£\u001e!«\u0096'\"Nôø#·\u0001\u001d\u001dBý-Ðs\u009c\u001cÚe\u0082\u0096÷J±O£\u0093àá*ó¿ç\u0014þÉ#\u0002Q~%<u\n\u009cvxqï\u0006\u0080¿\u0017÷¡ÇÒ@\u00adëgÀc}\u0015mK\u00ad¢pú\u00ad\u008e\u0091O\u008a¿½Xøäíäý/mº^»ò½Õ!ê_\u0094ä*÷Ç\u0095P\u001bÐ\u0088ozÛ\u009d\r+Ñ\u0088\bãiÌ13ù\u000füâðó²\u001dÝ°\f1å\u001bL+\u000fxü>µ±x<KÛåÍùïc\u0093\u001e\u0081JM/\u0019\u0017ùZ6þç\tÑPó'%ö,)@\u0006YÀ¯~\u0016W\u001bÔÏn{(B«\u0093Í¶¢öv\u0086\u001b\u001c\u0088\u0001Kô¦c\u0002°\u0015ó\r®µ@I\u008eT9èÂx\u009dçoäØ\u009cýLÍ¬8pµþÏÖÂh\u0018EH!Ï\u0092@ê]ÆÆrø\u0095E<\u000eÈL/¹¤\u0002j*±Õ\u007fa&º\u00adâu`ü(\t\u00adá\u0088t4\u0098²] °Ñ^Q\u0006\u0012gk\u009f\u000eZÙüb\u0017R¨>³HCÔhÑ°%Aâ\u009eg\u0006ù\"}\u009cÏYwöÝ¾ûK5ïÇVÒ+SÁ&¢²=\u00ad\u001dC-kºèYì²U\u001eÎ\u0087\u00959 f·E\u0084/h\u0003q\u0096\u00ad\rdã\r\u0011ÖR\u0013G=á÷4âÁ\u00ad¨«àÂ¼\\ôäÃ¾®ÚÇæ°ùÖ\u0006\u001e¼o½é\u0099\u0014ÎfË\u0005Ï?¦\u0000\u008e\u00ad·\u008e8ú¨öwVL²Îÿ\u0002©NyÃç\u0001\u0092z\n\u0083\u0016n\u0086£\u009dJ,K\u000f`ô÷\u001fã\u008e³D\u008eI\u0085W\u009b\u0017¸¤ëgs¹ò\u008f\u0005.ëBÈõ¼(\r\u0014kb\u009aEàó$\u009abN\u0093ä\u0014[GHòÇÕrx¯ãIb\u0000{µ>j\u0010\u009f\u000b.Jx¿«´$î©\u0006\u0002á·\u0010S×/8Þº\u009a\u007foßÈ! >Ûpwö(xz*eí\"uj\u0015\u008c\u0010_0\u0086\u001agpInMÜò\u001fÓ\u0085\u009f\u0004\u009e²}Ç³\u0017YbFP\u0088æ\u0099Y\rf{ã1Âø\u0098ÞÈ2«2õ\u008c¬µUÅ\b\u008d/\u0004´¦¼j$Ú\u0005FïÉt©ä,\u0084\u0011rWà\u0003\u0080¬¸à\u0015\u0090M\fÓuö\u009d¿\u001eµ\u008eeöo4ùãç\u000f\u001bf \u000fc¥\"ç\r©-í\u0015Û¬£ï\u0017<ù\u0097\u0089\u0013ªx 5È-µÅða2pÕ\u0001V2å\\Mgn\u0005ÕÁ\u001f¼¶\u0082³ÀÌC4ç\u0087k3\u009dªJQsbÌ,l©ôãdå7\u00955F¨¨\u0094f\u0093`R÷\u0099õ´\u008b\u0004M©WÝ^ê\u00adÂU\u0087?\u009f»=âðg.¸MØ' õ#rêgS/÷\u008düý£äcÒ\u0083\u0084À¡(÷¿ÍüðÓ0\u000bè\u008cU\u0090n1ÒC\"WT¨E9^, bTí\u0010\u0083a\u0090\n\u00adà\u000fÒ+¦½Ø\u0015\u0080À8aøöÓ=G$\u008bÔ2kJÂbr.\u009bË}ZY5]\u0092\u009ep³\u008aë_÷ÅÀ'ø\u0086Ár\u009f/5H-ìø\fÞ\u0017Gò;ê\t7ªZ\u008a¹åý\u0096è¯ÞEÔç«\u009b \u001e\u0095\u0000o<\u0082Ì\u008d\u0017Ö©Zð\u008eÓ\u0010\u0010É\u00adÿ\u0090Ê\u0093G\u0015p\u0093y¼ý\u0084ªåVeSöfÐ²:\u0094`.\u00ad\u0017Ô?\u0081\u008a"
               .getBytes("ISO-8859-1");
            int var8 = var7.length / 4;
            bba = new int[var8];
            byte var10 = 0;
            int var11 = 0;

            do {
               int var12 = (var7[var10] & 255) << 24 | (var7[var10 + 1] & 255) << 16 | (var7[var10 + 2] & 255) << 8 | var7[var10 + 3] & 255;
               var12 ^= var9;
               bba[var11] = var12;
               var10 += 4;
            } while (++var11 < var8);

            String[] var5 = new String[2];
            int var3 = 0;
            String var2;
            int var4 = (var2 = aabab((short)24253, var24 ^ 206659713, '\ueb49')).length();
            char var1 = 4;
            int var0 = -1;

            while (true) {
               char[] var36;
               label79: {
                  char[] var10001 = var2.substring(++var0, var0 + var1).toCharArray();
                  int var10003 = var10001.length;
                  int var6 = 0;
                  var36 = var10001;
                  int var30 = var10003;
                  char[] var43;
                  int var10004;
                  if (var10003 <= 1) {
                     var43 = var10001;
                     var10004 = var6;
                  } else {
                     var36 = var10001;
                     var30 = var10003;
                     if (var10003 <= var6) {
                        break label79;
                     }

                     var43 = var10001;
                     var10004 = var6;
                  }

                  while (true) {
                     var43[var10004] = (char)(var43[var10004] ^ switch (var6 % a(1386777993, var24 ^ 315347859)) {
                        case 0 -> 1;
                        case 1 -> a(1386777992, var24 ^ 318077064);
                        case 2 -> a(1386777991, var24 ^ 86385559);
                        case 3 -> a(1386777990, var24 ^ -455135103);
                        case 4 -> a(1386777989, var24 ^ 1363082976);
                        case 5 -> a(1386777988, var24 ^ -509449591);
                        default -> a(1386777987, var24 ^ 1437812535);
                     });
                     var6++;
                     if (var30 == 0) {
                        var10004 = var30;
                        var43 = var36;
                     } else {
                        if (var30 <= var6) {
                           break;
                        }

                        var43 = var36;
                        var10004 = var6;
                     }
                  }
               }

               String var50 = new String(var36).intern();
               byte var34 = -1;
               var5[var3++] = var50;
               if ((var0 += var1) >= var4) {
                  abb = var5;
                  aa = new String[2];
                  return;
               }

               var1 = var2.charAt(var0);
            }
         }

         do {
            var19 = var15[var17];
            char[] var21 = var14.substring(var18, var18 + var19).toCharArray();
            int var22 = 0;

            do {
               short var23 = switch (var22 % 6) {
                  default -> 248;
                  case 1 -> 25;
                  case 2 -> 73;
                  case 3 -> 110;
                  case 4 -> 192;
                  case 5 -> 203;
               };
               var21[var22] = (char)(var21[var22] ^ var23 ^ var13);
            } while (++var22 < var21.length);

            var16[var17] = new String(var21).intern();
            var18 += var19;
         } while (++var17 < var15.length);

         var20 = 0;
      }
   }

   public static boolean aaaab(long param0, long param2, long param4) {
      // $VF: Couldn't be decompiled
      // Please report this to the Vineflower issue tracker, at https://github.com/Vineflower/vineflower/issues with a copy of the class file (if you have the rights to distribute it!)
      // java.lang.RuntimeException: parsing failure!
      //   at org.jetbrains.java.decompiler.modules.decompiler.decompose.DomHelper.parseGraph(DomHelper.java:211)
      //   at org.jetbrains.java.decompiler.main.rels.MethodProcessor.codeToJava(MethodProcessor.java:166)
      //
      // Bytecode:
      // 00: getstatic qeaa361f143ee4a0894bd168fd9b30c66/qf4ccf8f5435d4a78bdca4d6a018b578e/aabbabbab.ab I
      // 03: istore 6
      // 05: lload 4
      // 07: lconst_0
      // 08: lcmp
      // 09: iload 6
      // 0b: ifne 29
      // 0e: ifle 28
      // 11: goto 15
      // 14: athrow
      // 15: lload 0
      // 16: lload 2
      // 17: lcmp
      // 18: iload 6
      // 1a: ifne 29
      // 1d: goto 21
      // 20: athrow
      // 21: iflt 2c
      // 24: goto 28
      // 27: athrow
      // 28: bipush 1
      // 29: goto 2d
      // 2c: bipush 0
      // 2d: ireturn
   }

   public static boolean aaaba(double var0, double var2, double var4, double var6, double var8, double var10, double var12) {
      int var10000 = ab;
      double var15 = Math.max(0.0, var4);
      int var14 = var10000;
      double var17 = Math.max(Math.min(var6, var10), Math.min(var0, Math.max(var6, var10)));
      double var19 = Math.max(Math.min(var8, var12), Math.min(var2, Math.max(var8, var12)));
      double var21 = var17 - var0;
      double var23 = var19 - var2;

      try {
         double var27;
         var10000 = (var27 = var21 * var21 + var23 * var23 - var15 * var15) == 0.0 ? 0 : (var27 < 0.0 ? -1 : 1);
         if (var14 != 0) {
            return (boolean)var10000;
         }

         if (var10000 <= 0) {
            return (boolean)1;
         }
      } catch (MatchException var25) {
         throw var25;
      }

      return (boolean)0;
   }

   public static boolean aaabb(Object var0, Object var1) {
      int var2 = ab;

      try {
         boolean var10000 = Objects.deepEquals(var0, var1);
         if (var2 != 0) {
            return var10000;
         }

         if (!var10000) {
            return true;
         }
      } catch (MatchException var3) {
         throw var3;
      }

      return false;
   }

   public static float aabaa(float var0) {
      float var2 = var0 % 360.0F;
      int var1 = ab;

      float var10000;
      label37: {
         label36: {
            try {
               var10000 = var2;
               if (var1 != 0) {
                  break label37;
               }

               if (!(var2 >= 180.0F)) {
                  break label36;
               }
            } catch (MatchException var4) {
               throw var4;
            }

            var2 -= 360.0F;
         }

         var10000 = var2;
      }

      try {
         if (var1 != 0) {
            return var10000;
         }

         if (!(var10000 < -180.0F)) {
            return var2;
         }
      } catch (MatchException var3) {
         throw var3;
      }

      var2 += 360.0F;
      return var2;
   }

   public static double b(int param0, int param1) {
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
      // 06: ifne 1e
      // 09: ifgt 15
      // 0c: goto 10
      // 0f: athrow
      // 10: ldc2_w 100.0
      // 13: dreturn
      // 14: athrow
      // 15: bipush 0
      // 16: iload 0
      // 17: iload 1
      // 18: invokestatic java/lang/Math.min (II)I
      // 1b: invokestatic java/lang/Math.max (II)I
      // 1e: istore 3
      // 1f: iload 0
      // 20: iload 3
      // 21: isub
      // 22: i2d
      // 23: ldc2_w 100.0
      // 26: dmul
      // 27: iload 0
      // 28: i2d
      // 29: ddiv
      // 2a: dreturn
   }
}
