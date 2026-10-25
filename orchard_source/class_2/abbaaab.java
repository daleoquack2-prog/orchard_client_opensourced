package nsc;

import net.fabricmc.api.EnvType;
import net.fabricmc.api.Environment;
import net.minecraft.class_243;
import net.minecraft.class_3532;

@Environment(EnvType.CLIENT)
public final class abbaaab {
   static final double aa = 0.03;
   static final double a = 0.15;
   static final double ab = 0.1625;
   static final double ba = 0.8;
   private static final double[][] bb;
   private static final String[] bba;
   private static final int[] bab;
   static final double aaa = 0.15625;
   static final double aab = 0.99;
   public static final double b = 1.5;
   private static final double aba = 0.00861375;
   private static final Object[] bbb;
   static final double abb = 0.0172275;
   private static final double baa = 0.0062500000000000056;

   static float[] aa(class_243 var0) {
      class_243 var1 = var0.method_1029();
      float var2 = (float)Math.toDegrees(Math.atan2(-var1.field_1352, var1.field_1350));
      float var3 = (float)(-Math.toDegrees(Math.asin(class_3532.method_15350(var1.field_1351, -1.0, 1.0))));
      return new float[]{class_3532.method_15393(var2), class_3532.method_15363(var3, -90.0F, 90.0F)};
   }

   static double ab(int var0) {
      return Math.max(0.0F, Math.min(0.3F, (var0 - 2) / 20.0F));
   }

   static class_243[] ba(class_243 param0, class_243 param1, int param2, aabaaaa param3) {
      // $VF: Couldn't be decompiled
      // Please report this to the Vineflower issue tracker, at https://github.com/Vineflower/vineflower/issues with a copy of the class file (if you have the rights to distribute it!)
      // java.lang.RuntimeException: parsing failure!
      //   at org.jetbrains.java.decompiler.modules.decompiler.decompose.DomHelper.parseGraph(DomHelper.java:211)
      //   at org.jetbrains.java.decompiler.main.rels.MethodProcessor.codeToJava(MethodProcessor.java:166)
      //
      // Bytecode:
      // 00: getstatic qeaa361f143ee4a0894bd168fd9b30c66/qf4ccf8f5435d4a78bdca4d6a018b578e/aabbabbab.ab I
      // 03: iload 2
      // 04: bipush 1
      // 05: iadd
      // 06: anewarray 55
      // 09: astore 5
      // 0b: istore 4
      // 0d: aload 5
      // 0f: bipush 0
      // 10: aload 0
      // 11: aastore
      // 12: aload 0
      // 13: astore 6
      // 15: aload 1
      // 16: astore 7
      // 18: bipush 1
      // 19: istore 8
      // 1b: iload 8
      // 1d: iload 2
      // 1e: if_icmpgt 83
      // 21: aload 6
      // 23: aload 7
      // 25: aload 3
      // 26: invokestatic qeaa361f143ee4a0894bd168fd9b30c66/qf4ccf8f5435d4a78bdca4d6a018b578e/abbaaab.aab (Lnet/minecraft/class_243;Lnet/minecraft/class_243;Lqeaa361f143ee4a0894bd168fd9b30c66/qf4ccf8f5435d4a78bdca4d6a018b578e/aabaaaa;)Lnet/minecraft/class_243;
      // 29: astore 7
      // 2b: iload 4
      // 2d: aload 6
      // 2f: aload 7
      // 31: invokevirtual net/minecraft/class_243.method_1019 (Lnet/minecraft/class_243;)Lnet/minecraft/class_243;
      // 34: astore 9
      // 36: ifne 7e
      // 39: aload 3
      // 3a: ifnull 70
      // 3d: goto 41
      // 40: athrow
      // 41: aload 3
      // 42: aload 6
      // 44: aload 9
      // 46: invokeinterface qeaa361f143ee4a0894bd168fd9b30c66/qf4ccf8f5435d4a78bdca4d6a018b578e/aabaaaa.aa (Lnet/minecraft/class_243;Lnet/minecraft/class_243;)Z 3
      // 4b: iload 4
      // 4d: ifne 5d
      // 50: goto 54
      // 53: athrow
      // 54: ifeq 70
      // 57: goto 5b
      // 5a: athrow
      // 5b: iload 8
      // 5d: anewarray 55
      // 60: astore 10
      // 62: aload 5
      // 64: bipush 0
      // 65: aload 10
      // 67: bipush 0
      // 68: iload 8
      // 6a: invokestatic java/lang/System.arraycopy (Ljava/lang/Object;ILjava/lang/Object;II)V
      // 6d: aload 10
      // 6f: areturn
      // 70: aload 5
      // 72: iload 8
      // 74: aload 9
      // 76: aastore
      // 77: aload 9
      // 79: astore 6
      // 7b: iinc 8 1
      // 7e: iload 4
      // 80: ifeq 1b
      // 83: aload 5
      // 85: areturn
   }

   private static int bb(
      float param0,
      float param1,
      class_243 param2,
      class_243 param3,
      int param4,
      class_243 param5,
      class_243 param6,
      int param7,
      aabaaaa param8
   ) {
      // $VF: Couldn't be decompiled
      // Please report this to the Vineflower issue tracker, at https://github.com/Vineflower/vineflower/issues with a copy of the class file (if you have the rights to distribute it!)
      // java.lang.RuntimeException: parsing failure!
      //   at org.jetbrains.java.decompiler.modules.decompiler.decompose.DomHelper.parseGraph(DomHelper.java:211)
      //   at org.jetbrains.java.decompiler.main.rels.MethodProcessor.codeToJava(MethodProcessor.java:166)
      //
      // Bytecode:
      // 00: fload 0
      // 01: fload 1
      // 02: invokestatic qeaa361f143ee4a0894bd168fd9b30c66/qf4ccf8f5435d4a78bdca4d6a018b578e/abbaaab.b (FF)Lnet/minecraft/class_243;
      // 05: astore 10
      // 07: getstatic qeaa361f143ee4a0894bd168fd9b30c66/qf4ccf8f5435d4a78bdca4d6a018b578e/aabbabbab.ab I
      // 0a: bipush 0
      // 0b: istore 11
      // 0d: getstatic qeaa361f143ee4a0894bd168fd9b30c66/qf4ccf8f5435d4a78bdca4d6a018b578e/abbaaab.bb [[D
      // 10: astore 12
      // 12: istore 9
      // 14: aload 12
      // 16: arraylength
      // 17: istore 13
      // 19: bipush 0
      // 1a: istore 14
      // 1c: iload 14
      // 1e: iload 13
      // 20: if_icmpge be
      // 23: aload 12
      // 25: iload 14
      // 27: aaload
      // 28: astore 15
      // 2a: aload 10
      // 2c: aload 15
      // 2e: bipush 0
      // 2f: daload
      // 30: aload 15
      // 32: bipush 1
      // 33: daload
      // 34: aload 15
      // 36: bipush 2
      // 37: daload
      // 38: invokevirtual net/minecraft/class_243.method_1031 (DDD)Lnet/minecraft/class_243;
      // 3b: ldc2_w 1.5
      // 3e: invokevirtual net/minecraft/class_243.method_1021 (D)Lnet/minecraft/class_243;
      // 41: aload 6
      // 43: invokevirtual net/minecraft/class_243.method_1019 (Lnet/minecraft/class_243;)Lnet/minecraft/class_243;
      // 46: astore 16
      // 48: getstatic qeaa361f143ee4a0894bd168fd9b30c66/qf4ccf8f5435d4a78bdca4d6a018b578e/abbaaab.bb [[D
      // 4b: astore 17
      // 4d: aload 17
      // 4f: arraylength
      // 50: iload 9
      // 52: ifne c0
      // 55: istore 18
      // 57: bipush 0
      // 58: istore 19
      // 5a: iload 19
      // 5c: iload 18
      // 5e: if_icmpge b6
      // 61: aload 17
      // 63: iload 19
      // 65: aaload
      // 66: astore 20
      // 68: aload 3
      // 69: aload 20
      // 6b: bipush 0
      // 6c: daload
      // 6d: ldc2_w 1.5
      // 70: dmul
      // 71: aload 20
      // 73: bipush 1
      // 74: daload
      // 75: ldc2_w 1.5
      // 78: dmul
      // 79: aload 20
      // 7b: bipush 2
      // 7c: iload 9
      // 7e: ifne 37
      // 81: daload
      // 82: ldc2_w 1.5
      // 85: dmul
      // 86: invokevirtual net/minecraft/class_243.method_1031 (DDD)Lnet/minecraft/class_243;
      // 89: astore 21
      // 8b: iload 9
      // 8d: ifne b1
      // 90: aload 2
      // 91: aload 21
      // 93: iload 4
      // 95: aload 5
      // 97: aload 16
      // 99: iload 7
      // 9b: aload 8
      // 9d: invokestatic qeaa361f143ee4a0894bd168fd9b30c66/qf4ccf8f5435d4a78bdca4d6a018b578e/abbaaab.baa (Lnet/minecraft/class_243;Lnet/minecraft/class_243;ILnet/minecraft/class_243;Lnet/minecraft/class_243;ILqeaa361f143ee4a0894bd168fd9b30c66/qf4ccf8f5435d4a78bdca4d6a018b578e/aabaaaa;)I
      // a0: iflt ae
      // a3: goto a7
      // a6: athrow
      // a7: iinc 11 1
      // aa: goto ae
      // ad: athrow
      // ae: iinc 19 1
      // b1: iload 9
      // b3: ifeq 5a
      // b6: iinc 14 1
      // b9: iload 9
      // bb: ifeq 1c
      // be: iload 11
      // c0: ireturn
   }

   private static int a(int var0, int var1) {
      int var2 = bab[var0 ^ -349921571] ^ var1 ^ var0;
      var2 -= 33757;
      var2 ^= 47841;
      var2 ^= 6200;
      var2 ^= 60103;
      var2 -= 41138;
      return var2 - 14011;
   }

   private static double[] aaa(class_243 param0, class_243 param1, class_243 param2, class_243 param3, int param4) {
      // $VF: Couldn't be decompiled
      // Please report this to the Vineflower issue tracker, at https://github.com/Vineflower/vineflower/issues with a copy of the class file (if you have the rights to distribute it!)
      // java.lang.RuntimeException: parsing failure!
      //   at org.jetbrains.java.decompiler.modules.decompiler.decompose.DomHelper.parseGraph(DomHelper.java:211)
      //   at org.jetbrains.java.decompiler.main.rels.MethodProcessor.codeToJava(MethodProcessor.java:166)
      //
      // Bytecode:
      // 000: getstatic qeaa361f143ee4a0894bd168fd9b30c66/qf4ccf8f5435d4a78bdca4d6a018b578e/aabbabbab.ab I
      // 003: aload 0
      // 004: dconst_0
      // 005: ldc2_w 0.0062500000000000056
      // 008: dconst_0
      // 009: invokevirtual net/minecraft/class_243.method_1023 (DDD)Lnet/minecraft/class_243;
      // 00c: aload 2
      // 00d: invokevirtual net/minecraft/class_243.method_1020 (Lnet/minecraft/class_243;)Lnet/minecraft/class_243;
      // 010: aload 3
      // 011: iload 4
      // 013: i2d
      // 014: invokevirtual net/minecraft/class_243.method_1021 (D)Lnet/minecraft/class_243;
      // 017: invokevirtual net/minecraft/class_243.method_1020 (Lnet/minecraft/class_243;)Lnet/minecraft/class_243;
      // 01a: astore 6
      // 01c: aload 1
      // 01d: aload 0
      // 01e: invokevirtual net/minecraft/class_243.method_1020 (Lnet/minecraft/class_243;)Lnet/minecraft/class_243;
      // 021: astore 7
      // 023: istore 5
      // 025: ldc2_w 1.5
      // 028: iload 4
      // 02a: i2d
      // 02b: dmul
      // 02c: dstore 8
      // 02e: aload 7
      // 030: invokevirtual net/minecraft/class_243.method_1027 ()D
      // 033: dstore 10
      // 035: ldc2_w 2.0
      // 038: aload 6
      // 03a: aload 7
      // 03c: invokevirtual net/minecraft/class_243.method_1026 (Lnet/minecraft/class_243;)D
      // 03f: dmul
      // 040: dstore 12
      // 042: aload 6
      // 044: invokevirtual net/minecraft/class_243.method_1027 ()D
      // 047: dload 8
      // 049: dload 8
      // 04b: dmul
      // 04c: dsub
      // 04d: dstore 14
      // 04f: dload 10
      // 051: iload 5
      // 053: ifne 098
      // 056: ldc2_w 1.0E-12
      // 059: dcmpg
      // 05a: ifge 089
      // 05d: goto 061
      // 060: athrow
      // 061: dload 14
      // 063: invokestatic java/lang/Math.abs (D)D
      // 066: ldc2_w 1.0E-6
      // 069: dcmpg
      // 06a: iload 5
      // 06c: ifne 086
      // 06f: goto 073
      // 072: athrow
      // 073: ifge 085
      // 076: goto 07a
      // 079: athrow
      // 07a: bipush 1
      // 07b: newarray 7
      // 07d: dup
      // 07e: bipush 0
      // 07f: dconst_0
      // 080: dastore
      // 081: goto 088
      // 084: athrow
      // 085: bipush 0
      // 086: newarray 7
      // 088: areturn
      // 089: dload 12
      // 08b: dload 12
      // 08d: dmul
      // 08e: ldc2_w 4.0
      // 091: dload 10
      // 093: dmul
      // 094: dload 14
      // 096: dmul
      // 097: dsub
      // 098: dstore 16
      // 09a: dload 16
      // 09c: iload 5
      // 09e: ifne 0b4
      // 0a1: dconst_0
      // 0a2: dcmpg
      // 0a3: ifge 0af
      // 0a6: goto 0aa
      // 0a9: athrow
      // 0aa: bipush 0
      // 0ab: newarray 7
      // 0ad: areturn
      // 0ae: athrow
      // 0af: dload 16
      // 0b1: invokestatic java/lang/Math.sqrt (D)D
      // 0b4: dstore 18
      // 0b6: dload 12
      // 0b8: dneg
      // 0b9: dload 18
      // 0bb: dsub
      // 0bc: ldc2_w 2.0
      // 0bf: dload 10
      // 0c1: dmul
      // 0c2: ddiv
      // 0c3: dstore 20
      // 0c5: dload 12
      // 0c7: dneg
      // 0c8: dload 18
      // 0ca: dadd
      // 0cb: ldc2_w 2.0
      // 0ce: dload 10
      // 0d0: dmul
      // 0d1: ddiv
      // 0d2: dstore 22
      // 0d4: dload 20
      // 0d6: iload 5
      // 0d8: ifne 0ea
      // 0db: dconst_0
      // 0dc: dcmpl
      // 0dd: iflt 0fc
      // 0e0: goto 0e4
      // 0e3: athrow
      // 0e4: dload 20
      // 0e6: goto 0ea
      // 0e9: athrow
      // 0ea: dconst_1
      // 0eb: dcmpg
      // 0ec: iload 5
      // 0ee: ifne 0f9
      // 0f1: ifgt 0fc
      // 0f4: goto 0f8
      // 0f7: athrow
      // 0f8: bipush 1
      // 0f9: goto 0fd
      // 0fc: bipush 0
      // 0fd: istore 24
      // 0ff: dload 22
      // 101: dconst_0
      // 102: iload 5
      // 104: ifne 116
      // 107: dcmpl
      // 108: iflt 143
      // 10b: goto 10f
      // 10e: athrow
      // 10f: dload 22
      // 111: dconst_1
      // 112: goto 116
      // 115: athrow
      // 116: iload 5
      // 118: ifne 132
      // 11b: dcmpg
      // 11c: ifgt 143
      // 11f: goto 123
      // 122: athrow
      // 123: dload 22
      // 125: dload 20
      // 127: dsub
      // 128: invokestatic java/lang/Math.abs (D)D
      // 12b: ldc2_w 1.0E-9
      // 12e: goto 132
      // 131: athrow
      // 132: dcmpl
      // 133: iload 5
      // 135: ifne 140
      // 138: ifle 143
      // 13b: goto 13f
      // 13e: athrow
      // 13f: bipush 1
      // 140: goto 144
      // 143: bipush 0
      // 144: istore 25
      // 146: iload 24
      // 148: iload 5
      // 14a: ifne 1aa
      // 14d: ifeq 1a8
      // 150: goto 154
      // 153: athrow
      // 154: iload 25
      // 156: iload 5
      // 158: ifne 1aa
      // 15b: goto 15f
      // 15e: athrow
      // 15f: ifeq 1a8
      // 162: goto 166
      // 165: athrow
      // 166: dload 20
      // 168: ldc2_w 0.5
      // 16b: dsub
      // 16c: invokestatic java/lang/Math.abs (D)D
      // 16f: dload 22
      // 171: ldc2_w 0.5
      // 174: dsub
      // 175: invokestatic java/lang/Math.abs (D)D
      // 178: dcmpg
      // 179: iload 5
      // 17b: ifne 19b
      // 17e: goto 182
      // 181: athrow
      // 182: ifgt 19a
      // 185: goto 189
      // 188: athrow
      // 189: bipush 2
      // 18a: newarray 7
      // 18c: dup
      // 18d: bipush 0
      // 18e: dload 20
      // 190: dastore
      // 191: dup
      // 192: bipush 1
      // 193: dload 22
      // 195: dastore
      // 196: goto 1a7
      // 199: athrow
      // 19a: bipush 2
      // 19b: newarray 7
      // 19d: dup
      // 19e: bipush 0
      // 19f: dload 22
      // 1a1: dastore
      // 1a2: dup
      // 1a3: bipush 1
      // 1a4: dload 20
      // 1a6: dastore
      // 1a7: areturn
      // 1a8: iload 24
      // 1aa: iload 5
      // 1ac: ifne 1c4
      // 1af: ifeq 1c2
      // 1b2: goto 1b6
      // 1b5: athrow
      // 1b6: bipush 1
      // 1b7: newarray 7
      // 1b9: dup
      // 1ba: bipush 0
      // 1bb: dload 20
      // 1bd: dastore
      // 1be: goto 1df
      // 1c1: athrow
      // 1c2: iload 25
      // 1c4: iload 5
      // 1c6: ifne 1dd
      // 1c9: ifeq 1dc
      // 1cc: goto 1d0
      // 1cf: athrow
      // 1d0: bipush 1
      // 1d1: newarray 7
      // 1d3: dup
      // 1d4: bipush 0
      // 1d5: dload 22
      // 1d7: dastore
      // 1d8: goto 1df
      // 1db: athrow
      // 1dc: bipush 0
      // 1dd: newarray 7
      // 1df: areturn
   }

   static class_243 aab(class_243 var0, class_243 var1, aabaaaa var2) {
      int var3 = aabbabbab.ab;

      double var8;
      label29: {
         label28: {
            label27: {
               try {
                  var10000 = var2;
                  if (var3 != 0) {
                     break label27;
                  }

                  if (var2 == null) {
                     break label28;
                  }
               } catch (MatchException var7) {
                  throw var7;
               }

               var10000 = var2;
            }

            try {
               if (var10000.b(var0)) {
                  var8 = 0.8;
                  break label29;
               }
            } catch (MatchException var6) {
               throw var6;
            }
         }

         var8 = 0.99;
      }

      double var4 = var8;
      return var1.method_1023(0.0, 0.03, 0.0).method_1021(var4);
   }

   private abbaaab() {
   }

   private static String bab(int var0, int var1, short var2) {
      int var3 = var1 ^ 6580;
      char[] var4 = bba[var3].toCharArray();
      StackTraceElement[] var5 = (StackTraceElement[])bbb[var3];
      StackTraceElement[] var6;
      if (var5 != null) {
         var6 = var5;
      } else {
         var6 = new Throwable().getStackTrace();
         bbb[var3] = var6;
      }

      StackTraceElement var7 = var6[1];
      int var8 = (var7.getClassName().hashCode() ^ var7.getMethodName().hashCode()) >> 16 ^ 2706;
      int var9 = 0;

      do {
         int var10 = var4[var9] ^ 9742;
         var10 ^= 162;
         var10 ^= 14671;
         var10 -= 40667;
         var4[var9] = (char)(var10 ^ var8 ^ var2 ^ var0 >> 16);
      } while (++var9 < var4.length);

      return new String(var4).intern();
   }

   public static ba aba(
      class_243 param0, class_243 param1, int param2, class_243 param3, class_243 param4, int param5, aabaaaa param6
   ) {
      // $VF: Couldn't be decompiled
      // Please report this to the Vineflower issue tracker, at https://github.com/Vineflower/vineflower/issues with a copy of the class file (if you have the rights to distribute it!)
      // java.lang.RuntimeException: parsing failure!
      //   at org.jetbrains.java.decompiler.modules.decompiler.decompose.DomHelper.parseGraph(DomHelper.java:211)
      //   at org.jetbrains.java.decompiler.main.rels.MethodProcessor.codeToJava(MethodProcessor.java:166)
      //
      // Bytecode:
      // 000: getstatic qeaa361f143ee4a0894bd168fd9b30c66/qf4ccf8f5435d4a78bdca4d6a018b578e/aabbabbab.ab I
      // 003: istore 7
      // 005: aload 0
      // 006: iload 7
      // 008: ifne 013
      // 00b: ifnull 051
      // 00e: goto 012
      // 011: athrow
      // 012: aload 1
      // 013: iload 7
      // 015: ifne 020
      // 018: ifnull 051
      // 01b: goto 01f
      // 01e: athrow
      // 01f: aload 3
      // 020: iload 7
      // 022: ifne 02e
      // 025: ifnull 051
      // 028: goto 02c
      // 02b: athrow
      // 02c: aload 4
      // 02e: ifnull 051
      // 031: iload 2
      // 032: iload 7
      // 034: ifne 044
      // 037: goto 03b
      // 03a: athrow
      // 03b: iflt 051
      // 03e: goto 042
      // 041: athrow
      // 042: iload 5
      // 044: iload 7
      // 046: ifne 05a
      // 049: bipush 1
      // 04a: if_icmpge 054
      // 04d: goto 051
      // 050: athrow
      // 051: aconst_null
      // 052: areturn
      // 053: athrow
      // 054: iload 2
      // 055: bipush 1
      // 056: iadd
      // 057: iload 5
      // 059: iadd
      // 05a: istore 8
      // 05c: aload 0
      // 05d: aload 1
      // 05e: iload 8
      // 060: aload 6
      // 062: invokestatic qeaa361f143ee4a0894bd168fd9b30c66/qf4ccf8f5435d4a78bdca4d6a018b578e/abbaaab.ba (Lnet/minecraft/class_243;Lnet/minecraft/class_243;ILqeaa361f143ee4a0894bd168fd9b30c66/qf4ccf8f5435d4a78bdca4d6a018b578e/aabaaaa;)[Lnet/minecraft/class_243;
      // 065: astore 9
      // 067: aconst_null
      // 068: astore 10
      // 06a: bipush 1
      // 06b: istore 11
      // 06d: iload 11
      // 06f: iload 5
      // 071: if_icmpgt 1a6
      // 074: iload 2
      // 075: bipush 1
      // 076: iadd
      // 077: iload 11
      // 079: iadd
      // 07a: istore 12
      // 07c: iload 12
      // 07e: aload 9
      // 080: arraylength
      // 081: if_icmplt 08d
      // 084: iload 7
      // 086: ifeq 1a6
      // 089: goto 08d
      // 08c: athrow
      // 08d: aload 9
      // 08f: iload 12
      // 091: bipush 1
      // 092: isub
      // 093: aaload
      // 094: astore 13
      // 096: aload 9
      // 098: iload 12
      // 09a: aaload
      // 09b: astore 14
      // 09d: aload 13
      // 09f: aload 14
      // 0a1: aload 3
      // 0a2: aload 4
      // 0a4: iload 11
      // 0a6: invokestatic qeaa361f143ee4a0894bd168fd9b30c66/qf4ccf8f5435d4a78bdca4d6a018b578e/abbaaab.aaa (Lnet/minecraft/class_243;Lnet/minecraft/class_243;Lnet/minecraft/class_243;Lnet/minecraft/class_243;I)[D
      // 0a9: astore 15
      // 0ab: aload 15
      // 0ad: arraylength
      // 0ae: istore 16
      // 0b0: bipush 0
      // 0b1: istore 17
      // 0b3: iload 17
      // 0b5: iload 16
      // 0b7: if_icmpge 176
      // 0ba: aload 15
      // 0bc: iload 17
      // 0be: daload
      // 0bf: dstore 18
      // 0c1: iload 7
      // 0c3: aload 13
      // 0c5: aload 14
      // 0c7: aload 13
      // 0c9: invokevirtual net/minecraft/class_243.method_1020 (Lnet/minecraft/class_243;)Lnet/minecraft/class_243;
      // 0cc: dload 18
      // 0ce: invokevirtual net/minecraft/class_243.method_1021 (D)Lnet/minecraft/class_243;
      // 0d1: invokevirtual net/minecraft/class_243.method_1019 (Lnet/minecraft/class_243;)Lnet/minecraft/class_243;
      // 0d4: astore 20
      // 0d6: aload 20
      // 0d8: dconst_0
      // 0d9: ldc2_w 0.0062500000000000056
      // 0dc: dconst_0
      // 0dd: invokevirtual net/minecraft/class_243.method_1023 (DDD)Lnet/minecraft/class_243;
      // 0e0: aload 3
      // 0e1: invokevirtual net/minecraft/class_243.method_1020 (Lnet/minecraft/class_243;)Lnet/minecraft/class_243;
      // 0e4: aload 4
      // 0e6: iload 11
      // 0e8: i2d
      // 0e9: invokevirtual net/minecraft/class_243.method_1021 (D)Lnet/minecraft/class_243;
      // 0ec: invokevirtual net/minecraft/class_243.method_1020 (Lnet/minecraft/class_243;)Lnet/minecraft/class_243;
      // 0ef: dconst_1
      // 0f0: ldc2_w 1.5
      // 0f3: iload 11
      // 0f5: i2d
      // 0f6: dmul
      // 0f7: ddiv
      // 0f8: invokevirtual net/minecraft/class_243.method_1021 (D)Lnet/minecraft/class_243;
      // 0fb: astore 21
      // 0fd: ifne 1a1
      // 100: aload 21
      // 102: invokestatic qeaa361f143ee4a0894bd168fd9b30c66/qf4ccf8f5435d4a78bdca4d6a018b578e/abbaaab.aa (Lnet/minecraft/class_243;)[F
      // 105: astore 22
      // 107: iload 7
      // 109: aload 22
      // 10b: bipush 0
      // 10c: faload
      // 10d: aload 22
      // 10f: bipush 1
      // 110: faload
      // 111: aload 0
      // 112: aload 1
      // 113: iload 2
      // 114: aload 3
      // 115: aload 4
      // 117: iload 5
      // 119: aload 6
      // 11b: invokestatic qeaa361f143ee4a0894bd168fd9b30c66/qf4ccf8f5435d4a78bdca4d6a018b578e/abbaaab.bb (FFLnet/minecraft/class_243;Lnet/minecraft/class_243;ILnet/minecraft/class_243;Lnet/minecraft/class_243;ILqeaa361f143ee4a0894bd168fd9b30c66/qf4ccf8f5435d4a78bdca4d6a018b578e/aabaaaa;)I
      // 11e: istore 23
      // 120: ifne 171
      // 123: iload 23
      // 125: ifle 16e
      // 128: goto 12c
      // 12b: athrow
      // 12c: aload 10
      // 12e: iload 7
      // 130: ifne 16c
      // 133: goto 137
      // 136: athrow
      // 137: ifnull 14c
      // 13a: goto 13e
      // 13d: athrow
      // 13e: iload 23
      // 140: aload 10
      // 142: invokevirtual qeaa361f143ee4a0894bd168fd9b30c66/qf4ccf8f5435d4a78bdca4d6a018b578e/ba.a ()I
      // 145: if_icmple 16e
      // 148: goto 14c
      // 14b: athrow
      // 14c: new qeaa361f143ee4a0894bd168fd9b30c66/qf4ccf8f5435d4a78bdca4d6a018b578e/ba
      // 14f: dup
      // 150: aload 22
      // 152: bipush 0
      // 153: faload
      // 154: aload 22
      // 156: bipush 1
      // 157: faload
      // 158: iload 11
      // 15a: iload 23
      // 15c: getstatic qeaa361f143ee4a0894bd168fd9b30c66/qf4ccf8f5435d4a78bdca4d6a018b578e/abbaaab.bb [[D
      // 15f: arraylength
      // 160: getstatic qeaa361f143ee4a0894bd168fd9b30c66/qf4ccf8f5435d4a78bdca4d6a018b578e/abbaaab.bb [[D
      // 163: arraylength
      // 164: imul
      // 165: invokespecial qeaa361f143ee4a0894bd168fd9b30c66/qf4ccf8f5435d4a78bdca4d6a018b578e/ba.<init> (FFIII)V
      // 168: goto 16c
      // 16b: athrow
      // 16c: astore 10
      // 16e: iinc 17 1
      // 171: iload 7
      // 173: ifeq 0b3
      // 176: aload 10
      // 178: iload 7
      // 17a: ifne 186
      // 17d: ifnull 19a
      // 180: goto 184
      // 183: athrow
      // 184: aload 10
      // 186: invokevirtual qeaa361f143ee4a0894bd168fd9b30c66/qf4ccf8f5435d4a78bdca4d6a018b578e/ba.a ()I
      // 189: aload 10
      // 18b: invokevirtual qeaa361f143ee4a0894bd168fd9b30c66/qf4ccf8f5435d4a78bdca4d6a018b578e/ba.ba ()I
      // 18e: if_icmpne 19a
      // 191: iload 7
      // 193: ifeq 1a6
      // 196: goto 19a
      // 199: athrow
      // 19a: iinc 11 1
      // 19d: goto 1a1
      // 1a0: athrow
      // 1a1: iload 7
      // 1a3: ifeq 06d
      // 1a6: aload 10
      // 1a8: areturn
   }

   static {
      int var19 = -1684116731;
      short var8 = 148;
      char[] var10 = "\u0010\n".toCharArray();
      String var9 = "⽆⼬⿏〔⽦⼂⾉⼜⽵⼇⼄⼻\u2ffd⽿⾂⼵뀟낇뀻끾낱뀌낭뀩끾낪";
      byte var15 = -1;
      String[] var11 = new String[var10.length];

      while (true) {
         int var12 = 0;
         char var13 = 0;
         char var14 = '\u0000';
         if (var15 == 0) {
            bba = var11;
            bbb = new Object[var11.length];
            byte var21 = 0;
            int var10001 = 0;
            bab = new int[9];
            byte[] var10002 = "9È÷~J\u009fÔ«Î]ÿ3\u0091\u0014Ë3/O¾z\"\u007f\u008fË\u0001\u008c!ózdé\u008b×¼ðM".getBytes("ISO-8859-1");

            int var39;
            do {
               bab[var21] = (
                     (var10002[var10001] & 255) << 24
                        | (var10002[var10001 + 1] & 255) << 16
                        | (var10002[var10001 + 2] & 255) << 8
                        | var10002[var10001 + 3] & 255
                  )
                  ^ 1609272829;
               var21 += 1;
               var39 = var10001 + 4;
               var10001 += 4;
            } while (var39 < var10002.length);

            long var1 = 5249169105321979093L;
            long[] var0 = new long[2];
            int var4 = 0;
            String var5;
            int var6 = (var5 = bab(var19 ^ 695493304, 6580, (short)'\udbcc')).length();
            byte var3 = 0;

            do {
               var10001 = var3;
               var3 += 8;
               byte[] var7 = var5.substring(var10001, var3).getBytes(bab(var19 ^ 578649931, 6581, (short)20800));
               var10001 = var4++;
               long var47 = (
                     (var7[0] & 255L) << a(-349921571, var19 ^ 379104451)
                        | (var7[1] & 255L) << a(-349921572, var19 ^ 1708101615)
                        | (var7[2] & 255L) << a(-349921569, var19 ^ -519199620)
                        | (var7[3] & 255L) << a(-349921570, var19 ^ -1102802843)
                        | (var7[4] & 255L) << a(-349921575, var19 ^ 2090275)
                        | (var7[5] & 255L) << a(-349921576, var19 ^ 221238443)
                        | (var7[a(-349921573, var19 ^ 786201242)] & 255L) << a(-349921574, var19 ^ 1429517025)
                        | var7[a(-349921579, var19 ^ -118707417)] & 255L
                  )
                  ^ var1;
               byte var40 = -1;
               var0[var10001] = var47;
            } while (var3 < var6);

            double[][] var22 = new double[(int)var0[1]][];
            var22[0] = new double[]{0.0, 0.0, 0.0};
            var22[1] = new double[]{0.00861375, 0.0, 0.0};
            var22[2] = new double[]{-0.00861375, 0.0, 0.0};
            var22[3] = new double[]{0.0, 0.00861375, 0.0};
            var22[4] = new double[]{0.0, -0.00861375, 0.0};
            var22[5] = new double[]{0.0, 0.0, 0.00861375};
            var22[(int)var0[0]] = new double[]{0.0, 0.0, -0.00861375};
            bb = var22;
            return;
         }

         do {
            var14 = var10[var12];
            char[] var16 = var9.substring(var13, var13 + var14).toCharArray();
            int var17 = 0;

            do {
               short var18 = switch (var17 % 5) {
                  default -> 245;
                  case 1 -> 67;
                  case 2 -> 211;
                  case 3 -> 136;
                  case 4 -> 72;
               };
               var16[var17] = (char)(var16[var17] ^ var18 ^ var8);
            } while (++var17 < var16.length);

            var11[var12] = new String(var16).intern();
            var13 += var14;
         } while (++var12 < var10.length);

         var15 = 0;
      }
   }

   static boolean abb(class_243 param0, class_243 param1, double param2, double param4, double param6, double param8, double param10, double param12) {
      // $VF: Couldn't be decompiled
      // Please report this to the Vineflower issue tracker, at https://github.com/Vineflower/vineflower/issues with a copy of the class file (if you have the rights to distribute it!)
      // java.lang.RuntimeException: parsing failure!
      //   at org.jetbrains.java.decompiler.modules.decompiler.decompose.DomHelper.parseGraph(DomHelper.java:211)
      //   at org.jetbrains.java.decompiler.main.rels.MethodProcessor.codeToJava(MethodProcessor.java:166)
      //
      // Bytecode:
      // 000: dconst_0
      // 001: dstore 15
      // 003: dconst_1
      // 004: dstore 17
      // 006: getstatic qeaa361f143ee4a0894bd168fd9b30c66/qf4ccf8f5435d4a78bdca4d6a018b578e/aabbabbab.ab I
      // 009: bipush 3
      // 00a: newarray 7
      // 00c: dup
      // 00d: bipush 0
      // 00e: aload 0
      // 00f: getfield net/minecraft/class_243.field_1352 D
      // 012: dastore
      // 013: dup
      // 014: bipush 1
      // 015: aload 0
      // 016: getfield net/minecraft/class_243.field_1351 D
      // 019: dastore
      // 01a: dup
      // 01b: bipush 2
      // 01c: aload 0
      // 01d: getfield net/minecraft/class_243.field_1350 D
      // 020: dastore
      // 021: astore 19
      // 023: istore 14
      // 025: bipush 3
      // 026: newarray 7
      // 028: dup
      // 029: bipush 0
      // 02a: aload 1
      // 02b: getfield net/minecraft/class_243.field_1352 D
      // 02e: aload 0
      // 02f: getfield net/minecraft/class_243.field_1352 D
      // 032: dsub
      // 033: dastore
      // 034: dup
      // 035: bipush 1
      // 036: aload 1
      // 037: getfield net/minecraft/class_243.field_1351 D
      // 03a: aload 0
      // 03b: getfield net/minecraft/class_243.field_1351 D
      // 03e: dsub
      // 03f: dastore
      // 040: dup
      // 041: bipush 2
      // 042: aload 1
      // 043: getfield net/minecraft/class_243.field_1350 D
      // 046: aload 0
      // 047: getfield net/minecraft/class_243.field_1350 D
      // 04a: dsub
      // 04b: dastore
      // 04c: astore 20
      // 04e: bipush 3
      // 04f: newarray 7
      // 051: dup
      // 052: bipush 0
      // 053: dload 2
      // 054: dastore
      // 055: dup
      // 056: bipush 1
      // 057: dload 4
      // 059: dastore
      // 05a: dup
      // 05b: bipush 2
      // 05c: dload 6
      // 05e: dastore
      // 05f: astore 21
      // 061: bipush 3
      // 062: newarray 7
      // 064: dup
      // 065: bipush 0
      // 066: dload 8
      // 068: dastore
      // 069: dup
      // 06a: bipush 1
      // 06b: dload 10
      // 06d: dastore
      // 06e: dup
      // 06f: bipush 2
      // 070: dload 12
      // 072: dastore
      // 073: astore 22
      // 075: bipush 0
      // 076: istore 23
      // 078: iload 23
      // 07a: bipush 3
      // 07b: if_icmpge 147
      // 07e: aload 20
      // 080: iload 23
      // 082: daload
      // 083: invokestatic java/lang/Math.abs (D)D
      // 086: iload 14
      // 088: ifne 0de
      // 08b: ldc2_w 1.0E-12
      // 08e: dcmpg
      // 08f: iload 14
      // 091: ifne 148
      // 094: goto 098
      // 097: athrow
      // 098: ifge 0d7
      // 09b: goto 09f
      // 09e: athrow
      // 09f: aload 19
      // 0a1: iload 23
      // 0a3: daload
      // 0a4: aload 21
      // 0a6: iload 23
      // 0a8: daload
      // 0a9: dcmpg
      // 0aa: iload 14
      // 0ac: ifne 0d6
      // 0af: goto 0b3
      // 0b2: athrow
      // 0b3: iflt 0d5
      // 0b6: goto 0ba
      // 0b9: athrow
      // 0ba: aload 19
      // 0bc: iload 23
      // 0be: daload
      // 0bf: aload 22
      // 0c1: iload 23
      // 0c3: daload
      // 0c4: dcmpl
      // 0c5: iload 14
      // 0c7: ifne 0d6
      // 0ca: goto 0ce
      // 0cd: athrow
      // 0ce: ifle 13f
      // 0d1: goto 0d5
      // 0d4: athrow
      // 0d5: bipush 0
      // 0d6: ireturn
      // 0d7: dconst_1
      // 0d8: aload 20
      // 0da: iload 23
      // 0dc: daload
      // 0dd: ddiv
      // 0de: dstore 24
      // 0e0: aload 21
      // 0e2: iload 23
      // 0e4: daload
      // 0e5: aload 19
      // 0e7: iload 23
      // 0e9: daload
      // 0ea: dsub
      // 0eb: dload 24
      // 0ed: dmul
      // 0ee: dstore 26
      // 0f0: aload 22
      // 0f2: iload 23
      // 0f4: daload
      // 0f5: aload 19
      // 0f7: iload 23
      // 0f9: daload
      // 0fa: dsub
      // 0fb: dload 24
      // 0fd: dmul
      // 0fe: dstore 28
      // 100: dload 26
      // 102: dload 28
      // 104: iload 14
      // 106: ifne 138
      // 109: dcmpl
      // 10a: ifle 11d
      // 10d: goto 111
      // 110: athrow
      // 111: dload 26
      // 113: dstore 30
      // 115: dload 28
      // 117: dstore 26
      // 119: dload 30
      // 11b: dstore 28
      // 11d: dload 15
      // 11f: dload 26
      // 121: invokestatic java/lang/Math.max (DD)D
      // 124: dstore 15
      // 126: iload 14
      // 128: ifne 142
      // 12b: dload 17
      // 12d: dload 28
      // 12f: invokestatic java/lang/Math.min (DD)D
      // 132: dstore 17
      // 134: dload 15
      // 136: dload 17
      // 138: dcmpl
      // 139: ifle 13f
      // 13c: bipush 0
      // 13d: ireturn
      // 13e: athrow
      // 13f: iinc 23 1
      // 142: iload 14
      // 144: ifeq 078
      // 147: bipush 1
      // 148: ireturn
   }

   static int baa(
      class_243 param0, class_243 param1, int param2, class_243 param3, class_243 param4, int param5, aabaaaa param6
   ) {
      // $VF: Couldn't be decompiled
      // Please report this to the Vineflower issue tracker, at https://github.com/Vineflower/vineflower/issues with a copy of the class file (if you have the rights to distribute it!)
      // java.lang.RuntimeException: parsing failure!
      //   at org.jetbrains.java.decompiler.modules.decompiler.decompose.DomHelper.parseGraph(DomHelper.java:211)
      //   at org.jetbrains.java.decompiler.main.rels.MethodProcessor.codeToJava(MethodProcessor.java:166)
      //
      // Bytecode:
      // 000: getstatic qeaa361f143ee4a0894bd168fd9b30c66/qf4ccf8f5435d4a78bdca4d6a018b578e/aabbabbab.ab I
      // 003: aload 0
      // 004: astore 8
      // 006: aload 1
      // 007: astore 9
      // 009: aload 3
      // 00a: astore 10
      // 00c: istore 7
      // 00e: iload 2
      // 00f: bipush 1
      // 010: iadd
      // 011: iload 5
      // 013: iadd
      // 014: istore 11
      // 016: bipush 1
      // 017: istore 12
      // 019: iload 12
      // 01b: iload 11
      // 01d: if_icmpgt 11f
      // 020: aload 8
      // 022: aload 9
      // 024: aload 6
      // 026: invokestatic qeaa361f143ee4a0894bd168fd9b30c66/qf4ccf8f5435d4a78bdca4d6a018b578e/abbaaab.aab (Lnet/minecraft/class_243;Lnet/minecraft/class_243;Lqeaa361f143ee4a0894bd168fd9b30c66/qf4ccf8f5435d4a78bdca4d6a018b578e/aabaaaa;)Lnet/minecraft/class_243;
      // 029: astore 9
      // 02b: aload 8
      // 02d: aload 9
      // 02f: invokevirtual net/minecraft/class_243.method_1019 (Lnet/minecraft/class_243;)Lnet/minecraft/class_243;
      // 032: astore 13
      // 034: aload 6
      // 036: iload 7
      // 038: ifne 044
      // 03b: ifnull 05c
      // 03e: goto 042
      // 041: athrow
      // 042: aload 6
      // 044: aload 8
      // 046: aload 13
      // 048: invokeinterface qeaa361f143ee4a0894bd168fd9b30c66/qf4ccf8f5435d4a78bdca4d6a018b578e/aabaaaa.aa (Lnet/minecraft/class_243;Lnet/minecraft/class_243;)Z 3
      // 04d: iload 7
      // 04f: ifne 05e
      // 052: ifeq 05c
      // 055: goto 059
      // 058: athrow
      // 059: bipush -1
      // 05a: ireturn
      // 05b: athrow
      // 05c: iload 12
      // 05e: iload 7
      // 060: ifne 075
      // 063: iload 2
      // 064: if_icmple 113
      // 067: goto 06b
      // 06a: athrow
      // 06b: iload 12
      // 06d: iload 2
      // 06e: isub
      // 06f: bipush 1
      // 070: isub
      // 071: goto 075
      // 074: athrow
      // 075: istore 14
      // 077: iload 12
      // 079: bipush 1
      // 07a: isub
      // 07b: invokestatic qeaa361f143ee4a0894bd168fd9b30c66/qf4ccf8f5435d4a78bdca4d6a018b578e/abbaaab.ab (I)D
      // 07e: dstore 15
      // 080: aload 8
      // 082: iload 7
      // 084: ifne 0e6
      // 087: aload 13
      // 089: aload 10
      // 08b: getfield net/minecraft/class_243.field_1352 D
      // 08e: ldc2_w 0.15625
      // 091: dsub
      // 092: dload 15
      // 094: dsub
      // 095: aload 10
      // 097: getfield net/minecraft/class_243.field_1351 D
      // 09a: ldc2_w 0.15
      // 09d: dsub
      // 09e: dload 15
      // 0a0: dsub
      // 0a1: aload 10
      // 0a3: getfield net/minecraft/class_243.field_1350 D
      // 0a6: ldc2_w 0.15625
      // 0a9: dsub
      // 0aa: dload 15
      // 0ac: dsub
      // 0ad: aload 10
      // 0af: getfield net/minecraft/class_243.field_1352 D
      // 0b2: ldc2_w 0.15625
      // 0b5: dadd
      // 0b6: dload 15
      // 0b8: dadd
      // 0b9: aload 10
      // 0bb: getfield net/minecraft/class_243.field_1351 D
      // 0be: ldc2_w 0.1625
      // 0c1: dadd
      // 0c2: dload 15
      // 0c4: dadd
      // 0c5: aload 10
      // 0c7: getfield net/minecraft/class_243.field_1350 D
      // 0ca: ldc2_w 0.15625
      // 0cd: dadd
      // 0ce: dload 15
      // 0d0: dadd
      // 0d1: invokestatic qeaa361f143ee4a0894bd168fd9b30c66/qf4ccf8f5435d4a78bdca4d6a018b578e/abbaaab.abb (Lnet/minecraft/class_243;Lnet/minecraft/class_243;DDDDDD)Z
      // 0d4: ifeq 0df
      // 0d7: goto 0db
      // 0da: athrow
      // 0db: iload 14
      // 0dd: ireturn
      // 0de: athrow
      // 0df: aload 10
      // 0e1: aload 4
      // 0e3: invokevirtual net/minecraft/class_243.method_1019 (Lnet/minecraft/class_243;)Lnet/minecraft/class_243;
      // 0e6: astore 17
      // 0e8: aload 6
      // 0ea: iload 7
      // 0ec: ifne 0f8
      // 0ef: ifnull 10f
      // 0f2: goto 0f6
      // 0f5: athrow
      // 0f6: aload 6
      // 0f8: aload 10
      // 0fa: aload 17
      // 0fc: invokeinterface qeaa361f143ee4a0894bd168fd9b30c66/qf4ccf8f5435d4a78bdca4d6a018b578e/aabaaaa.aa (Lnet/minecraft/class_243;Lnet/minecraft/class_243;)Z 3
      // 101: iload 7
      // 103: ifne 10e
      // 106: ifeq 10f
      // 109: goto 10d
      // 10c: athrow
      // 10d: bipush -1
      // 10e: ireturn
      // 10f: aload 17
      // 111: astore 10
      // 113: aload 13
      // 115: astore 8
      // 117: iload 7
      // 119: iinc 12 1
      // 11c: ifeq 019
      // 11f: bipush -1
      // 120: ireturn
   }

   public static class_243 b(float var0, float var1) {
      float var2 = (float) (Math.PI / 180.0);
      float var3 = -class_3532.method_15374(var0 * var2) * class_3532.method_15362(var1 * var2);
      float var4 = -class_3532.method_15374(var1 * var2);
      float var5 = class_3532.method_15362(var0 * var2) * class_3532.method_15362(var1 * var2);
      return new class_243(var3, var4, var5).method_1029();
   }
}
