package nsc;

import net.fabricmc.api.EnvType;
import net.fabricmc.api.Environment;
import net.minecraft.class_1267;
import net.minecraft.class_1297;
import net.minecraft.class_1304;
import net.minecraft.class_1309;
import net.minecraft.class_2338;
import net.minecraft.class_238;
import net.minecraft.class_243;
import net.minecraft.class_2680;
import net.minecraft.class_310;
import net.minecraft.class_3532;
import net.minecraft.class_5321;

@Environment(EnvType.CLIENT)
public final class aaabaaaa {
   private static final String[] aa;
   private static final long[] ab;
   private static final Integer[] ba;
   private static final int[] a;
   private static final String[] aaa;
   private static final Object[] aab;
   private static final String[] bb;
   private static final class_1304[] b;

   static boolean aa(class_243 param0, class_243 param1, class_2338 param2, class_2680 param3) {
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
      // 00b: ifnull 01e
      // 00e: goto 012
      // 011: athrow
      // 012: aload 1
      // 013: ifnull 01e
      // 016: aload 2
      // 017: ifnonnull 021
      // 01a: goto 01e
      // 01d: athrow
      // 01e: bipush 0
      // 01f: ireturn
      // 020: athrow
      // 021: aload 3
      // 022: iload 4
      // 024: ifne 070
      // 027: ifnonnull 06f
      // 02a: goto 02e
      // 02d: athrow
      // 02e: aload 0
      // 02f: getfield net/minecraft/class_243.field_1352 D
      // 032: aload 0
      // 033: getfield net/minecraft/class_243.field_1351 D
      // 036: aload 0
      // 037: getfield net/minecraft/class_243.field_1350 D
      // 03a: aload 1
      // 03b: getfield net/minecraft/class_243.field_1352 D
      // 03e: aload 1
      // 03f: getfield net/minecraft/class_243.field_1351 D
      // 042: aload 1
      // 043: getfield net/minecraft/class_243.field_1350 D
      // 046: aload 2
      // 047: invokevirtual net/minecraft/class_2338.method_10263 ()I
      // 04a: i2d
      // 04b: aload 2
      // 04c: invokevirtual net/minecraft/class_2338.method_10264 ()I
      // 04f: i2d
      // 050: aload 2
      // 051: invokevirtual net/minecraft/class_2338.method_10260 ()I
      // 054: i2d
      // 055: aload 2
      // 056: invokevirtual net/minecraft/class_2338.method_10263 ()I
      // 059: i2d
      // 05a: dconst_1
      // 05b: dadd
      // 05c: aload 2
      // 05d: invokevirtual net/minecraft/class_2338.method_10264 ()I
      // 060: i2d
      // 061: dconst_1
      // 062: dadd
      // 063: aload 2
      // 064: invokevirtual net/minecraft/class_2338.method_10260 ()I
      // 067: i2d
      // 068: dconst_1
      // 069: dadd
      // 06a: invokestatic qeaa361f143ee4a0894bd168fd9b30c66/qf4ccf8f5435d4a78bdca4d6a018b578e/aabbabbab.baaa (DDDDDDDDDDDD)Z
      // 06d: ireturn
      // 06e: athrow
      // 06f: aload 3
      // 070: getstatic net/minecraft/class_2682.field_12294 Lnet/minecraft/class_2682;
      // 073: getstatic net/minecraft/class_2338.field_10980 Lnet/minecraft/class_2338;
      // 076: invokevirtual net/minecraft/class_2680.method_26220 (Lnet/minecraft/class_1922;Lnet/minecraft/class_2338;)Lnet/minecraft/class_265;
      // 079: astore 5
      // 07b: aload 5
      // 07d: iload 4
      // 07f: ifne 091
      // 082: invokevirtual net/minecraft/class_265.method_1110 ()Z
      // 085: ifeq 08f
      // 088: goto 08c
      // 08b: athrow
      // 08c: bipush 0
      // 08d: ireturn
      // 08e: athrow
      // 08f: aload 5
      // 091: invokevirtual net/minecraft/class_265.method_1090 ()Ljava/util/List;
      // 094: invokeinterface java/util/List.iterator ()Ljava/util/Iterator; 1
      // 099: astore 6
      // 09b: aload 6
      // 09d: invokeinterface java/util/Iterator.hasNext ()Z 1
      // 0a2: ifeq 12a
      // 0a5: aload 6
      // 0a7: invokeinterface java/util/Iterator.next ()Ljava/lang/Object; 1
      // 0ac: checkcast net/minecraft/class_238
      // 0af: astore 7
      // 0b1: aload 0
      // 0b2: getfield net/minecraft/class_243.field_1352 D
      // 0b5: aload 0
      // 0b6: getfield net/minecraft/class_243.field_1351 D
      // 0b9: aload 0
      // 0ba: getfield net/minecraft/class_243.field_1350 D
      // 0bd: aload 1
      // 0be: getfield net/minecraft/class_243.field_1352 D
      // 0c1: aload 1
      // 0c2: getfield net/minecraft/class_243.field_1351 D
      // 0c5: aload 1
      // 0c6: getfield net/minecraft/class_243.field_1350 D
      // 0c9: aload 2
      // 0ca: invokevirtual net/minecraft/class_2338.method_10263 ()I
      // 0cd: i2d
      // 0ce: aload 7
      // 0d0: getfield net/minecraft/class_238.field_1323 D
      // 0d3: dadd
      // 0d4: aload 2
      // 0d5: invokevirtual net/minecraft/class_2338.method_10264 ()I
      // 0d8: i2d
      // 0d9: aload 7
      // 0db: getfield net/minecraft/class_238.field_1322 D
      // 0de: dadd
      // 0df: aload 2
      // 0e0: invokevirtual net/minecraft/class_2338.method_10260 ()I
      // 0e3: i2d
      // 0e4: aload 7
      // 0e6: getfield net/minecraft/class_238.field_1321 D
      // 0e9: dadd
      // 0ea: aload 2
      // 0eb: invokevirtual net/minecraft/class_2338.method_10263 ()I
      // 0ee: i2d
      // 0ef: aload 7
      // 0f1: getfield net/minecraft/class_238.field_1320 D
      // 0f4: dadd
      // 0f5: aload 2
      // 0f6: invokevirtual net/minecraft/class_2338.method_10264 ()I
      // 0f9: i2d
      // 0fa: aload 7
      // 0fc: getfield net/minecraft/class_238.field_1325 D
      // 0ff: dadd
      // 100: aload 2
      // 101: invokevirtual net/minecraft/class_2338.method_10260 ()I
      // 104: i2d
      // 105: aload 7
      // 107: getfield net/minecraft/class_238.field_1324 D
      // 10a: dadd
      // 10b: invokestatic qeaa361f143ee4a0894bd168fd9b30c66/qf4ccf8f5435d4a78bdca4d6a018b578e/aabbabbab.baaa (DDDDDDDDDDDD)Z
      // 10e: iload 4
      // 110: ifne 12b
      // 113: iload 4
      // 115: ifne 124
      // 118: goto 11c
      // 11b: athrow
      // 11c: ifeq 125
      // 11f: goto 123
      // 122: athrow
      // 123: bipush 1
      // 124: ireturn
      // 125: iload 4
      // 127: ifeq 09b
      // 12a: bipush 0
      // 12b: ireturn
   }

   private static String baaa(int var0, int var1) {
      int var3 = var0 ^ 1704680985;
      char[] var4 = aaa[var3].toCharArray();
      StackTraceElement[] var2 = (StackTraceElement[])aab[var3];
      StackTraceElement[] var5;
      if (var2 != null) {
         var5 = var2;
      } else {
         var5 = new Throwable().getStackTrace();
         aab[var3] = var5;
      }

      StackTraceElement var6 = var5[1];
      int var7 = (var6.getClassName().hashCode() ^ var6.getMethodName().hashCode()) >> 16 ^ 962171219;
      int var8 = 0;

      do {
         var4[var8] = (char)(var4[var8] ^ switch (var8 & 31) {
            default -> 198;
            case 1 -> 68;
            case 2 -> 147;
            case 3 -> 37;
            case 4 -> 26;
            case 5 -> 152;
            case 6 -> 103;
            case 7 -> 118;
            case 8 -> 20;
            case 9 -> 73;
            case 10 -> 32;
            case 11 -> 226;
            case 12 -> 118;
            case 13 -> 4;
            case 14 -> 134;
            case 15 -> 236;
            case 16 -> 250;
            case 17 -> 41;
            case 18 -> 26;
            case 19 -> 185;
            case 20 -> 115;
            case 21 -> 174;
            case 22 -> 233;
            case 23 -> 10;
            case 24 -> 207;
            case 25 -> 185;
            case 26 -> 164;
            case 27 -> 152;
            case 28 -> 26;
            case 29 -> 99;
            case 30 -> 20;
            case 31 -> 40;
         } ^ var1 >> 16 ^ var7);
      } while (++var8 < var4.length);

      return new String(var4).intern();
   }

   public static float ab(class_1309 param0) {
      // $VF: Couldn't be decompiled
      // Please report this to the Vineflower issue tracker, at https://github.com/Vineflower/vineflower/issues with a copy of the class file (if you have the rights to distribute it!)
      // java.lang.RuntimeException: parsing failure!
      //   at org.jetbrains.java.decompiler.modules.decompiler.decompose.DomHelper.parseGraph(DomHelper.java:211)
      //   at org.jetbrains.java.decompiler.main.rels.MethodProcessor.codeToJava(MethodProcessor.java:166)
      //
      // Bytecode:
      // 000: getstatic qeaa361f143ee4a0894bd168fd9b30c66/qf4ccf8f5435d4a78bdca4d6a018b578e/baaabbaa.bba I
      // 003: istore 1
      // 004: aload 0
      // 005: ifnonnull 00b
      // 008: fconst_1
      // 009: freturn
      // 00a: athrow
      // 00b: bipush 0
      // 00c: istore 2
      // 00d: getstatic qeaa361f143ee4a0894bd168fd9b30c66/qf4ccf8f5435d4a78bdca4d6a018b578e/aaabaaaa.b [Lnet/minecraft/class_1304;
      // 010: astore 3
      // 011: aload 3
      // 012: arraylength
      // 013: istore 4
      // 015: bipush 0
      // 016: istore 5
      // 018: iload 5
      // 01a: iload 4
      // 01c: if_icmpge 131
      // 01f: aload 3
      // 020: iload 5
      // 022: aaload
      // 023: astore 6
      // 025: aload 0
      // 026: iload 1
      // 027: ifne 132
      // 02a: aload 6
      // 02c: invokevirtual net/minecraft/class_1309.method_6118 (Lnet/minecraft/class_1304;)Lnet/minecraft/class_1799;
      // 02f: astore 7
      // 031: iload 1
      // 032: ifne 12d
      // 035: aload 7
      // 037: ifnull 12a
      // 03a: goto 03e
      // 03d: athrow
      // 03e: aload 7
      // 040: iload 1
      // 041: ifne 069
      // 044: goto 048
      // 047: athrow
      // 048: invokevirtual net/minecraft/class_1799.method_7960 ()Z
      // 04b: ifeq 05a
      // 04e: goto 052
      // 051: athrow
      // 052: iload 1
      // 053: ifeq 12a
      // 056: goto 05a
      // 059: athrow
      // 05a: aload 7
      // 05c: getstatic net/minecraft/class_9334.field_49633 Lnet/minecraft/class_9331;
      // 05f: getstatic net/minecraft/class_9304.field_49385 Lnet/minecraft/class_9304;
      // 062: invokevirtual net/minecraft/class_1799.method_58695 (Lnet/minecraft/class_9331;Ljava/lang/Object;)Ljava/lang/Object;
      // 065: goto 069
      // 068: athrow
      // 069: checkcast net/minecraft/class_9304
      // 06c: astore 8
      // 06e: aload 8
      // 070: invokevirtual net/minecraft/class_9304.method_57534 ()Ljava/util/Set;
      // 073: invokeinterface java/util/Set.iterator ()Ljava/util/Iterator; 1
      // 078: astore 9
      // 07a: aload 9
      // 07c: invokeinterface java/util/Iterator.hasNext ()Z 1
      // 081: ifeq 12a
      // 084: aload 9
      // 086: invokeinterface java/util/Iterator.next ()Ljava/lang/Object; 1
      // 08b: checkcast net/minecraft/class_6880
      // 08e: astore 10
      // 090: aload 10
      // 092: invokeinterface net/minecraft/class_6880.method_40230 ()Ljava/util/Optional; 1
      // 097: iload 1
      // 098: ifne 069
      // 09b: invokedynamic apply ()Ljava/util/function/Function; bsm=java/lang/invoke/LambdaMetafactory.metafactory (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;Ljava/lang/invoke/MethodType;Ljava/lang/invoke/MethodHandle;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[ (Ljava/lang/Object;)Ljava/lang/Object;, qeaa361f143ee4a0894bd168fd9b30c66/qf4ccf8f5435d4a78bdca4d6a018b578e/aaabaaaa.aaa (Lnet/minecraft/class_5321;)Ljava/lang/String;, (Lnet/minecraft/class_5321;)Ljava/lang/String; ]
      // 0a0: invokevirtual java/util/Optional.map (Ljava/util/function/Function;)Ljava/util/Optional;
      // 0a3: ldc ""
      // 0a5: invokevirtual java/util/Optional.orElse (Ljava/lang/Object;)Ljava/lang/Object;
      // 0a8: checkcast java/lang/String
      // 0ab: astore 11
      // 0ad: aload 8
      // 0af: aload 10
      // 0b1: invokevirtual net/minecraft/class_9304.method_57536 (Lnet/minecraft/class_6880;)I
      // 0b4: istore 12
      // 0b6: aload 11
      // 0b8: ldc -664831581
      // 0ba: ldc 1541976884
      // 0bc: ldc -223592613
      // 0be: ixor
      // 0bf: invokestatic qeaa361f143ee4a0894bd168fd9b30c66/qf4ccf8f5435d4a78bdca4d6a018b578e/aaabaaaa.b (II)I
      // 0c2: ldc -664831582
      // 0c4: ldc 1541976884
      // 0c6: ldc -1126906005
      // 0c8: ixor
      // 0c9: invokestatic qeaa361f143ee4a0894bd168fd9b30c66/qf4ccf8f5435d4a78bdca4d6a018b578e/aaabaaaa.b (II)I
      // 0cc: invokestatic qeaa361f143ee4a0894bd168fd9b30c66/qf4ccf8f5435d4a78bdca4d6a018b578e/aaabaaaa.baa (II)Ljava/lang/String;
      // 0cf: iload 1
      // 0d0: ifne 10d
      // 0d3: invokestatic qeaa361f143ee4a0894bd168fd9b30c66/qf4ccf8f5435d4a78bdca4d6a018b578e/aabbaaaba.abba (Ljava/lang/String;)Ljava/lang/String;
      // 0d6: invokevirtual java/lang/String.equals (Ljava/lang/Object;)Z
      // 0d9: ifeq 0e9
      // 0dc: goto 0e0
      // 0df: athrow
      // 0e0: iload 2
      // 0e1: iload 12
      // 0e3: iadd
      // 0e4: istore 2
      // 0e5: iload 1
      // 0e6: ifeq 126
      // 0e9: aload 11
      // 0eb: ldc_w -664831583
      // 0ee: ldc 1541976884
      // 0f0: ldc_w 592644895
      // 0f3: ixor
      // 0f4: invokestatic qeaa361f143ee4a0894bd168fd9b30c66/qf4ccf8f5435d4a78bdca4d6a018b578e/aaabaaaa.b (II)I
      // 0f7: ldc_w -664831584
      // 0fa: ldc 1541976884
      // 0fc: ldc_w 1350667056
      // 0ff: ixor
      // 100: invokestatic qeaa361f143ee4a0894bd168fd9b30c66/qf4ccf8f5435d4a78bdca4d6a018b578e/aaabaaaa.b (II)I
      // 103: invokestatic qeaa361f143ee4a0894bd168fd9b30c66/qf4ccf8f5435d4a78bdca4d6a018b578e/aaabaaaa.baa (II)Ljava/lang/String;
      // 106: invokestatic qeaa361f143ee4a0894bd168fd9b30c66/qf4ccf8f5435d4a78bdca4d6a018b578e/aabbaaaba.abba (Ljava/lang/String;)Ljava/lang/String;
      // 109: goto 10d
      // 10c: athrow
      // 10d: invokevirtual java/lang/String.equals (Ljava/lang/Object;)Z
      // 110: iload 1
      // 111: ifne 125
      // 114: ifeq 126
      // 117: goto 11b
      // 11a: athrow
      // 11b: iload 2
      // 11c: bipush 2
      // 11d: iload 12
      // 11f: imul
      // 120: iadd
      // 121: goto 125
      // 124: athrow
      // 125: istore 2
      // 126: iload 1
      // 127: ifeq 07a
      // 12a: iinc 5 1
      // 12d: iload 1
      // 12e: ifeq 018
      // 131: aload 0
      // 132: getstatic net/minecraft/class_1294.field_5907 Lnet/minecraft/class_6880;
      // 135: invokevirtual net/minecraft/class_1309.method_6112 (Lnet/minecraft/class_6880;)Lnet/minecraft/class_1293;
      // 138: astore 3
      // 139: iload 2
      // 13a: aload 3
      // 13b: iload 1
      // 13c: ifne 14c
      // 13f: ifnonnull 14b
      // 142: goto 146
      // 145: athrow
      // 146: bipush -1
      // 147: goto 14f
      // 14a: athrow
      // 14b: aload 3
      // 14c: invokevirtual net/minecraft/class_1293.method_5578 ()I
      // 14f: invokestatic qeaa361f143ee4a0894bd168fd9b30c66/qf4ccf8f5435d4a78bdca4d6a018b578e/aaabaaaa.abbb (II)F
      // 152: freturn
   }

   public static float ba(class_1309 param0, class_2338 param1, class_2338 param2, class_243 param3) {
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
      // 006: ifnull 011
      // 009: aload 1
      // 00a: ifnonnull 014
      // 00d: goto 011
      // 010: athrow
      // 011: fconst_0
      // 012: freturn
      // 013: athrow
      // 014: invokestatic net/minecraft/class_310.method_1551 ()Lnet/minecraft/class_310;
      // 017: astore 5
      // 019: aload 5
      // 01b: getfield net/minecraft/class_310.field_1687 Lnet/minecraft/class_638;
      // 01e: ifnonnull 024
      // 021: fconst_0
      // 022: freturn
      // 023: athrow
      // 024: aload 1
      // 025: invokestatic net/minecraft/class_243.method_24953 (Lnet/minecraft/class_2382;)Lnet/minecraft/class_243;
      // 028: astore 6
      // 02a: aload 0
      // 02b: invokevirtual net/minecraft/class_1309.method_73189 ()Lnet/minecraft/class_243;
      // 02e: astore 7
      // 030: aload 3
      // 031: iload 4
      // 033: ifne 03f
      // 036: ifnonnull 042
      // 039: goto 03d
      // 03c: athrow
      // 03d: aload 7
      // 03f: goto 043
      // 042: aload 3
      // 043: astore 8
      // 045: aload 0
      // 046: invokevirtual net/minecraft/class_1309.method_5829 ()Lnet/minecraft/class_238;
      // 049: aload 8
      // 04b: aload 7
      // 04d: invokevirtual net/minecraft/class_243.method_1020 (Lnet/minecraft/class_243;)Lnet/minecraft/class_243;
      // 050: invokevirtual net/minecraft/class_238.method_997 (Lnet/minecraft/class_243;)Lnet/minecraft/class_238;
      // 053: astore 9
      // 055: ldc_w 10.0
      // 058: fstore 10
      // 05a: aload 8
      // 05c: aload 6
      // 05e: invokevirtual net/minecraft/class_243.method_1025 (Lnet/minecraft/class_243;)D
      // 061: invokestatic java/lang/Math.sqrt (D)D
      // 064: fload 10
      // 066: f2d
      // 067: ddiv
      // 068: dstore 11
      // 06a: dload 11
      // 06c: dconst_1
      // 06d: dcmpl
      // 06e: ifle 074
      // 071: fconst_0
      // 072: freturn
      // 073: athrow
      // 074: aload 6
      // 076: aload 9
      // 078: aload 0
      // 079: aload 1
      // 07a: aload 2
      // 07b: aconst_null
      // 07c: invokestatic qeaa361f143ee4a0894bd168fd9b30c66/qf4ccf8f5435d4a78bdca4d6a018b578e/aaabaaaa.bba (Lnet/minecraft/class_243;Lnet/minecraft/class_238;Lnet/minecraft/class_1297;Lnet/minecraft/class_2338;Lnet/minecraft/class_2338;Lnet/minecraft/class_2680;)F
      // 07f: fstore 13
      // 081: dconst_1
      // 082: dload 11
      // 084: dsub
      // 085: fload 13
      // 087: f2d
      // 088: dmul
      // 089: dstore 14
      // 08b: dload 14
      // 08d: dload 14
      // 08f: dmul
      // 090: dload 14
      // 092: dadd
      // 093: ldc2_w 0.5
      // 096: dmul
      // 097: ldc2_w 7.0
      // 09a: dmul
      // 09b: fload 10
      // 09d: f2d
      // 09e: dmul
      // 09f: dconst_1
      // 0a0: dadd
      // 0a1: d2f
      // 0a2: fstore 16
      // 0a4: fload 16
      // 0a6: aload 5
      // 0a8: getfield net/minecraft/class_310.field_1687 Lnet/minecraft/class_638;
      // 0ab: invokevirtual net/minecraft/class_638.method_8407 ()Lnet/minecraft/class_1267;
      // 0ae: invokestatic qeaa361f143ee4a0894bd168fd9b30c66/qf4ccf8f5435d4a78bdca4d6a018b578e/aaabaaaa.bab (FLnet/minecraft/class_1267;)F
      // 0b1: fstore 16
      // 0b3: aload 0
      // 0b4: invokevirtual net/minecraft/class_1309.method_6096 ()I
      // 0b7: i2f
      // 0b8: fstore 17
      // 0ba: aload 0
      // 0bb: iload 4
      // 0bd: ifne 0d3
      // 0c0: getstatic net/minecraft/class_5134.field_23725 Lnet/minecraft/class_6880;
      // 0c3: invokevirtual net/minecraft/class_1309.method_5996 (Lnet/minecraft/class_6880;)Lnet/minecraft/class_1324;
      // 0c6: ifnonnull 0d2
      // 0c9: goto 0cd
      // 0cc: athrow
      // 0cd: fconst_0
      // 0ce: goto 0da
      // 0d1: athrow
      // 0d2: aload 0
      // 0d3: getstatic net/minecraft/class_5134.field_23725 Lnet/minecraft/class_6880;
      // 0d6: invokevirtual net/minecraft/class_1309.method_45325 (Lnet/minecraft/class_6880;)D
      // 0d9: d2f
      // 0da: fstore 18
      // 0dc: fconst_2
      // 0dd: fload 18
      // 0df: ldc_w 4.0
      // 0e2: fdiv
      // 0e3: fadd
      // 0e4: fstore 19
      // 0e6: fload 17
      // 0e8: fload 16
      // 0ea: fload 19
      // 0ec: fdiv
      // 0ed: fsub
      // 0ee: fload 17
      // 0f0: ldc_w 0.2
      // 0f3: fmul
      // 0f4: ldc_w 20.0
      // 0f7: invokestatic net/minecraft/class_3532.method_15363 (FFF)F
      // 0fa: fstore 20
      // 0fc: fload 16
      // 0fe: fconst_1
      // 0ff: fload 20
      // 101: ldc_w 25.0
      // 104: fdiv
      // 105: fsub
      // 106: fmul
      // 107: freturn
   }

   public static float bb(class_1309 param0, class_243 param1, class_243 param2, float param3, class_2338 param4) {
      // $VF: Couldn't be decompiled
      // Please report this to the Vineflower issue tracker, at https://github.com/Vineflower/vineflower/issues with a copy of the class file (if you have the rights to distribute it!)
      // java.lang.RuntimeException: parsing failure!
      //   at org.jetbrains.java.decompiler.modules.decompiler.decompose.DomHelper.parseGraph(DomHelper.java:211)
      //   at org.jetbrains.java.decompiler.main.rels.MethodProcessor.codeToJava(MethodProcessor.java:166)
      //
      // Bytecode:
      // 000: getstatic qeaa361f143ee4a0894bd168fd9b30c66/qf4ccf8f5435d4a78bdca4d6a018b578e/baaabbaa.bba I
      // 003: istore 5
      // 005: aload 0
      // 006: ifnull 011
      // 009: aload 2
      // 00a: ifnonnull 014
      // 00d: goto 011
      // 010: athrow
      // 011: fconst_0
      // 012: freturn
      // 013: athrow
      // 014: invokestatic net/minecraft/class_310.method_1551 ()Lnet/minecraft/class_310;
      // 017: astore 6
      // 019: aload 6
      // 01b: getfield net/minecraft/class_310.field_1687 Lnet/minecraft/class_638;
      // 01e: ifnonnull 024
      // 021: fconst_0
      // 022: freturn
      // 023: athrow
      // 024: aload 0
      // 025: invokevirtual net/minecraft/class_1309.method_73189 ()Lnet/minecraft/class_243;
      // 028: astore 7
      // 02a: aload 1
      // 02b: iload 5
      // 02d: ifne 039
      // 030: ifnonnull 03c
      // 033: goto 037
      // 036: athrow
      // 037: aload 7
      // 039: goto 03d
      // 03c: aload 1
      // 03d: astore 8
      // 03f: aload 0
      // 040: invokevirtual net/minecraft/class_1309.method_5829 ()Lnet/minecraft/class_238;
      // 043: aload 8
      // 045: aload 7
      // 047: invokevirtual net/minecraft/class_243.method_1020 (Lnet/minecraft/class_243;)Lnet/minecraft/class_243;
      // 04a: invokevirtual net/minecraft/class_238.method_997 (Lnet/minecraft/class_243;)Lnet/minecraft/class_238;
      // 04d: astore 9
      // 04f: fload 3
      // 050: fconst_2
      // 051: fmul
      // 052: fstore 10
      // 054: aload 8
      // 056: aload 2
      // 057: invokevirtual net/minecraft/class_243.method_1025 (Lnet/minecraft/class_243;)D
      // 05a: invokestatic java/lang/Math.sqrt (D)D
      // 05d: fload 10
      // 05f: f2d
      // 060: ddiv
      // 061: dstore 11
      // 063: dload 11
      // 065: dconst_1
      // 066: dcmpl
      // 067: ifle 06d
      // 06a: fconst_0
      // 06b: freturn
      // 06c: athrow
      // 06d: aload 4
      // 06f: ifnonnull 07d
      // 072: aload 2
      // 073: aload 9
      // 075: aload 0
      // 076: invokestatic qeaa361f143ee4a0894bd168fd9b30c66/qf4ccf8f5435d4a78bdca4d6a018b578e/aaabaaaa.aaba (Lnet/minecraft/class_243;Lnet/minecraft/class_238;Lnet/minecraft/class_1297;)F
      // 079: goto 088
      // 07c: athrow
      // 07d: aload 2
      // 07e: aload 9
      // 080: aload 0
      // 081: aconst_null
      // 082: aload 4
      // 084: aconst_null
      // 085: invokestatic qeaa361f143ee4a0894bd168fd9b30c66/qf4ccf8f5435d4a78bdca4d6a018b578e/aaabaaaa.bba (Lnet/minecraft/class_243;Lnet/minecraft/class_238;Lnet/minecraft/class_1297;Lnet/minecraft/class_2338;Lnet/minecraft/class_2338;Lnet/minecraft/class_2680;)F
      // 088: fstore 13
      // 08a: dconst_1
      // 08b: dload 11
      // 08d: dsub
      // 08e: fload 13
      // 090: f2d
      // 091: dmul
      // 092: dstore 14
      // 094: dload 14
      // 096: dload 14
      // 098: dmul
      // 099: dload 14
      // 09b: dadd
      // 09c: ldc2_w 0.5
      // 09f: dmul
      // 0a0: ldc2_w 7.0
      // 0a3: dmul
      // 0a4: fload 10
      // 0a6: f2d
      // 0a7: dmul
      // 0a8: dconst_1
      // 0a9: dadd
      // 0aa: d2f
      // 0ab: fstore 16
      // 0ad: fload 16
      // 0af: aload 6
      // 0b1: getfield net/minecraft/class_310.field_1687 Lnet/minecraft/class_638;
      // 0b4: invokevirtual net/minecraft/class_638.method_8407 ()Lnet/minecraft/class_1267;
      // 0b7: invokestatic qeaa361f143ee4a0894bd168fd9b30c66/qf4ccf8f5435d4a78bdca4d6a018b578e/aaabaaaa.bab (FLnet/minecraft/class_1267;)F
      // 0ba: fstore 16
      // 0bc: aload 0
      // 0bd: invokevirtual net/minecraft/class_1309.method_6096 ()I
      // 0c0: i2f
      // 0c1: fstore 17
      // 0c3: aload 0
      // 0c4: iload 5
      // 0c6: ifne 0dc
      // 0c9: getstatic net/minecraft/class_5134.field_23725 Lnet/minecraft/class_6880;
      // 0cc: invokevirtual net/minecraft/class_1309.method_5996 (Lnet/minecraft/class_6880;)Lnet/minecraft/class_1324;
      // 0cf: ifnonnull 0db
      // 0d2: goto 0d6
      // 0d5: athrow
      // 0d6: fconst_0
      // 0d7: goto 0e3
      // 0da: athrow
      // 0db: aload 0
      // 0dc: getstatic net/minecraft/class_5134.field_23725 Lnet/minecraft/class_6880;
      // 0df: invokevirtual net/minecraft/class_1309.method_45325 (Lnet/minecraft/class_6880;)D
      // 0e2: d2f
      // 0e3: fstore 18
      // 0e5: fconst_2
      // 0e6: fload 18
      // 0e8: ldc_w 4.0
      // 0eb: fdiv
      // 0ec: fadd
      // 0ed: fstore 19
      // 0ef: fload 17
      // 0f1: fload 16
      // 0f3: fload 19
      // 0f5: fdiv
      // 0f6: fsub
      // 0f7: fload 17
      // 0f9: ldc_w 0.2
      // 0fc: fmul
      // 0fd: ldc_w 20.0
      // 100: invokestatic net/minecraft/class_3532.method_15363 (FFF)F
      // 103: fstore 20
      // 105: fload 16
      // 107: fconst_1
      // 108: fload 20
      // 10a: ldc_w 25.0
      // 10d: fdiv
      // 10e: fsub
      // 10f: fmul
      // 110: freturn
   }

   private static String aaa(class_5321 var0) {
      return var0.method_29177().method_12832();
   }

   public static float aab(class_1309 param0, class_243 param1, float param2) {
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
      // 05: aload 1
      // 06: fload 2
      // 07: invokestatic qeaa361f143ee4a0894bd168fd9b30c66/qf4ccf8f5435d4a78bdca4d6a018b578e/aaabaaaa.aabb (Lnet/minecraft/class_1309;Lnet/minecraft/class_243;F)F
      // 0a: fstore 4
      // 0c: fload 4
      // 0e: iload 3
      // 0f: ifne 22
      // 12: invokestatic java/lang/Float.isFinite (F)Z
      // 15: ifeq 25
      // 18: goto 1c
      // 1b: athrow
      // 1c: fload 4
      // 1e: goto 22
      // 21: athrow
      // 22: goto 28
      // 25: ldc_w Infinity
      // 28: freturn
      // 29: astore 4
      // 2b: ldc_w Infinity
      // 2e: freturn
   }

   public static float aba(class_1309 param0, class_243 param1, class_243 param2, float param3) {
      // $VF: Couldn't be decompiled
      // Please report this to the Vineflower issue tracker, at https://github.com/Vineflower/vineflower/issues with a copy of the class file (if you have the rights to distribute it!)
      // java.lang.RuntimeException: parsing failure!
      //   at org.jetbrains.java.decompiler.modules.decompiler.decompose.DomHelper.parseGraph(DomHelper.java:211)
      //   at org.jetbrains.java.decompiler.main.rels.MethodProcessor.codeToJava(MethodProcessor.java:166)
      //
      // Bytecode:
      // 00: getstatic qeaa361f143ee4a0894bd168fd9b30c66/qf4ccf8f5435d4a78bdca4d6a018b578e/baaabbaa.bba I
      // 03: istore 4
      // 05: aload 0
      // 06: ifnull 11
      // 09: aload 2
      // 0a: ifnonnull 14
      // 0d: goto 11
      // 10: athrow
      // 11: fconst_0
      // 12: freturn
      // 13: athrow
      // 14: invokestatic net/minecraft/class_310.method_1551 ()Lnet/minecraft/class_310;
      // 17: astore 5
      // 19: aload 5
      // 1b: getfield net/minecraft/class_310.field_1687 Lnet/minecraft/class_638;
      // 1e: ifnonnull 24
      // 21: fconst_0
      // 22: freturn
      // 23: athrow
      // 24: aload 1
      // 25: iload 4
      // 27: ifne 39
      // 2a: ifnonnull 3c
      // 2d: goto 31
      // 30: athrow
      // 31: aload 0
      // 32: invokevirtual net/minecraft/class_1309.method_73189 ()Lnet/minecraft/class_243;
      // 35: goto 39
      // 38: athrow
      // 39: goto 3d
      // 3c: aload 1
      // 3d: astore 6
      // 3f: fload 3
      // 40: fconst_2
      // 41: fmul
      // 42: fstore 7
      // 44: aload 6
      // 46: aload 2
      // 47: invokevirtual net/minecraft/class_243.method_1025 (Lnet/minecraft/class_243;)D
      // 4a: invokestatic java/lang/Math.sqrt (D)D
      // 4d: fload 7
      // 4f: f2d
      // 50: ddiv
      // 51: dstore 8
      // 53: dload 8
      // 55: iload 4
      // 57: ifne 6a
      // 5a: dconst_1
      // 5b: dcmpl
      // 5c: ifle 66
      // 5f: goto 63
      // 62: athrow
      // 63: fconst_0
      // 64: freturn
      // 65: athrow
      // 66: dconst_1
      // 67: dload 8
      // 69: dsub
      // 6a: dstore 10
      // 6c: dload 10
      // 6e: dload 10
      // 70: dmul
      // 71: dload 10
      // 73: dadd
      // 74: ldc2_w 0.5
      // 77: dmul
      // 78: ldc2_w 7.0
      // 7b: dmul
      // 7c: fload 7
      // 7e: f2d
      // 7f: dmul
      // 80: dconst_1
      // 81: dadd
      // 82: d2f
      // 83: fstore 12
      // 85: fload 12
      // 87: aload 5
      // 89: getfield net/minecraft/class_310.field_1687 Lnet/minecraft/class_638;
      // 8c: invokevirtual net/minecraft/class_638.method_8407 ()Lnet/minecraft/class_1267;
      // 8f: invokestatic qeaa361f143ee4a0894bd168fd9b30c66/qf4ccf8f5435d4a78bdca4d6a018b578e/aaabaaaa.bab (FLnet/minecraft/class_1267;)F
      // 92: fstore 12
      // 94: aload 0
      // 95: invokevirtual net/minecraft/class_1309.method_6096 ()I
      // 98: i2f
      // 99: fstore 13
      // 9b: aload 0
      // 9c: iload 4
      // 9e: ifne b4
      // a1: getstatic net/minecraft/class_5134.field_23725 Lnet/minecraft/class_6880;
      // a4: invokevirtual net/minecraft/class_1309.method_5996 (Lnet/minecraft/class_6880;)Lnet/minecraft/class_1324;
      // a7: ifnonnull b3
      // aa: goto ae
      // ad: athrow
      // ae: fconst_0
      // af: goto bb
      // b2: athrow
      // b3: aload 0
      // b4: getstatic net/minecraft/class_5134.field_23725 Lnet/minecraft/class_6880;
      // b7: invokevirtual net/minecraft/class_1309.method_45325 (Lnet/minecraft/class_6880;)D
      // ba: d2f
      // bb: fstore 14
      // bd: fconst_2
      // be: fload 14
      // c0: ldc_w 4.0
      // c3: fdiv
      // c4: fadd
      // c5: fstore 15
      // c7: fload 13
      // c9: fload 12
      // cb: fload 15
      // cd: fdiv
      // ce: fsub
      // cf: fload 13
      // d1: ldc_w 0.2
      // d4: fmul
      // d5: ldc_w 20.0
      // d8: invokestatic net/minecraft/class_3532.method_15363 (FFF)F
      // db: fstore 16
      // dd: fload 12
      // df: fconst_1
      // e0: fload 16
      // e2: ldc_w 25.0
      // e5: fdiv
      // e6: fsub
      // e7: fmul
      // e8: freturn
   }

   private static int abb(int var0, long var1) {
      int var3 = var0 ^ (int)(var1 & 32767L) ^ b(-664831577, -697469489 ^ 780681880);
      if (ba[var3] == null) {
         ba[var3] = (int)(ab[var3] ^ var1);
      }

      return ba[var3];
   }

   private static String baa(int var0, int var1) {
      int var9 = -1558387799;
      int var2 = (var0 ^ b(-664831578, var9 ^ 402899185)) & b(-664831579, var9 ^ 328964468);
      if (aa[var2] == null) {
         char[] var3 = bb[var2].toCharArray();

         int var4 = switch (var3[0] & b(-664831580, var9 ^ -1270435159)) {
            case 0 -> b(-664831573, var9 ^ -140341844);
            case 1 -> b(-664831574, var9 ^ 1949825625);
            case 2 -> b(-664831575, var9 ^ 1614110856);
            case 3 -> b(-664831576, var9 ^ -1696981531);
            case 4 -> b(-664831569, var9 ^ 689124946);
            case 5 -> b(-664831570, var9 ^ -350184919);
            case 6 -> b(-664831571, var9 ^ 284292680);
            case 7 -> b(-664831572, var9 ^ -1146918902);
            case 8 -> b(-664831565, var9 ^ -2012346720);
            case 9 -> b(-664831566, var9 ^ -256549860);
            case 10 -> b(-664831567, var9 ^ -1997688318);
            case 11 -> b(-664831568, var9 ^ 150288076);
            case 12 -> b(-664831561, var9 ^ 1988848872);
            case 13 -> b(-664831562, var9 ^ 1053373405);
            case 14 -> b(-664831563, var9 ^ -562430015);
            case 15 -> b(-664831564, var9 ^ 694537498);
            case 16 -> b(-664831557, var9 ^ -1300846639);
            case 17 -> b(-664831558, var9 ^ -2082529495);
            case 18 -> b(-664831559, var9 ^ 2117325628);
            case 19 -> b(-664831560, var9 ^ 1120296145);
            case 20 -> b(-664831553, var9 ^ -1942226804);
            case 21 -> b(-664831554, var9 ^ 90045240);
            case 22 -> b(-664831555, var9 ^ -1800170836);
            case 23 -> b(-664831556, var9 ^ -1080070329);
            case 24 -> b(-664831613, var9 ^ 1441528062);
            case 25 -> b(-664831614, var9 ^ -710314444);
            case 26 -> b(-664831615, var9 ^ -427576163);
            case 27 -> b(-664831616, var9 ^ -1278573091);
            case 28 -> b(-664831609, var9 ^ -1767651636);
            case 29 -> b(-664831610, var9 ^ 1640045803);
            case 30 -> b(-664831611, var9 ^ -305400912);
            case 31 -> b(-664831612, var9 ^ -828675405);
            case 32 -> b(-664831605, var9 ^ 1169281675);
            case 33 -> b(-664831606, var9 ^ 2050574010);
            case 34 -> b(-664831607, var9 ^ 1866942099);
            case 35 -> b(-664831608, var9 ^ -726333062);
            case 36 -> b(-664831601, var9 ^ -402406837);
            case 37 -> b(-664831602, var9 ^ 1115014396);
            case 38 -> b(-664831603, var9 ^ 60224849);
            case 39 -> b(-664831604, var9 ^ -1298118216);
            case 40 -> b(-664831597, var9 ^ 1412666324);
            case 41 -> b(-664831598, var9 ^ 376569477);
            case 42 -> b(-664831599, var9 ^ 1818276694);
            case 43 -> b(-664831600, var9 ^ -1866458007);
            case 44 -> b(-664831593, var9 ^ 1958968064);
            case 45 -> b(-664831594, var9 ^ -423216023);
            case 46 -> b(-664831595, var9 ^ 773613002);
            case 47 -> b(-664831596, var9 ^ -646686218);
            case 48 -> b(-664831589, var9 ^ -108436837);
            case 49 -> b(-664831590, var9 ^ 1200339535);
            case 50 -> b(-664831591, var9 ^ -1445439639);
            case 51 -> b(-664831592, var9 ^ -231409519);
            case 52 -> b(-664831585, var9 ^ -540607149);
            case 53 -> b(-664831586, var9 ^ 96692866);
            case 54 -> b(-664831587, var9 ^ -775135896);
            case 55 -> b(-664831588, var9 ^ 175886769);
            case 56 -> b(-664831517, var9 ^ 1538737399);
            case 57 -> b(-664831518, var9 ^ -1080361286);
            case 58 -> b(-664831519, var9 ^ 13122654);
            case 59 -> b(-664831520, var9 ^ -1536681453);
            case 60 -> b(-664831513, var9 ^ -982950571);
            case 61 -> b(-664831514, var9 ^ -1411467561);
            case 62 -> b(-664831515, var9 ^ 1757621550);
            case 63 -> b(-664831516, var9 ^ 956676633);
            case 64 -> b(-664831509, var9 ^ -1357024947);
            case 65 -> b(-664831510, var9 ^ -888222070);
            case 66 -> b(-664831511, var9 ^ -1908214284);
            case 67 -> b(-664831512, var9 ^ 191900876);
            case 68 -> b(-664831505, var9 ^ -1698594545);
            case 69 -> b(-664831506, var9 ^ 1219062179);
            case 70 -> b(-664831507, var9 ^ 1430816445);
            case 71 -> b(-664831508, var9 ^ -2092005591);
            case 72 -> b(-664831501, var9 ^ -1199330728);
            case 73 -> b(-664831502, var9 ^ 1203648999);
            case 74 -> b(-664831503, var9 ^ 1169372599);
            case 75 -> b(-664831504, var9 ^ -130006600);
            case 76 -> b(-664831497, var9 ^ -898845877);
            case 77 -> b(-664831498, var9 ^ -701031062);
            case 78 -> b(-664831499, var9 ^ -2144407622);
            case 79 -> b(-664831500, var9 ^ 9177472);
            case 80 -> b(-664831493, var9 ^ -2004840192);
            case 81 -> 3;
            case 82 -> b(-664831494, var9 ^ 1106266225);
            case 83 -> b(-664831495, var9 ^ 462136141);
            case 84 -> b(-664831496, var9 ^ 387559323);
            case 85 -> b(-664831489, var9 ^ -1609581338);
            case 86 -> b(-664831490, var9 ^ 1750449846);
            case 87 -> b(-664831491, var9 ^ -974388124);
            case 88 -> b(-664831492, var9 ^ 1296013177);
            case 89 -> b(-664831549, var9 ^ -962747459);
            case 90 -> b(-664831550, var9 ^ -703170776);
            case 91 -> b(-664831551, var9 ^ 1978357585);
            case 92 -> b(-664831552, var9 ^ 1417398180);
            case 93 -> b(-664831545, var9 ^ -1471256791);
            case 94 -> b(-664831546, var9 ^ -141276935);
            case 95 -> b(-664831547, var9 ^ 6459349);
            case 96 -> b(-664831548, var9 ^ 794521889);
            case 97 -> b(-664831541, var9 ^ -810793205);
            case 98 -> b(-664831542, var9 ^ -346098168);
            case 99 -> b(-664831543, var9 ^ 466674055);
            case 100 -> b(-664831544, var9 ^ -656427633);
            case 101 -> b(-664831537, var9 ^ 978099643);
            case 102 -> b(-664831538, var9 ^ -69336047);
            case 103 -> b(-664831539, var9 ^ 1742843158);
            case 104 -> b(-664831540, var9 ^ 2146076528);
            case 105 -> b(-664831533, var9 ^ 161778735);
            case 106 -> b(-664831534, var9 ^ 275031752);
            case 107 -> b(-664831535, var9 ^ -1701458190);
            case 108 -> b(-664831536, var9 ^ -792159092);
            case 109 -> b(-664831529, var9 ^ 1018268938);
            case 110 -> b(-664831530, var9 ^ -1787899548);
            case 111 -> b(-664831531, var9 ^ 668106657);
            case 112 -> b(-664831532, var9 ^ 1085960656);
            case 113 -> b(-664831525, var9 ^ -1844746946);
            case 114 -> b(-664831526, var9 ^ 644483229);
            case 115 -> b(-664831527, var9 ^ -392550589);
            case 116 -> b(-664831528, var9 ^ 819302494);
            case 117 -> b(-664831521, var9 ^ 1687736315);
            case 118 -> b(-664831522, var9 ^ -226504463);
            case 119 -> b(-664831523, var9 ^ 1724374683);
            case 120 -> b(-664831524, var9 ^ -928677106);
            case 121 -> b(-664831709, var9 ^ -1922170400);
            case 122 -> b(-664831710, var9 ^ -2124569422);
            case 123 -> b(-664831711, var9 ^ 1535413797);
            case 124 -> b(-664831712, var9 ^ -2006794144);
            case 125 -> b(-664831705, var9 ^ -177165248);
            case 126 -> b(-664831706, var9 ^ 655201841);
            case 127 -> b(-664831707, var9 ^ 422945430);
            case 128 -> b(-664831708, var9 ^ 1362460998);
            case 129 -> b(-664831701, var9 ^ 146017859);
            case 130 -> b(-664831702, var9 ^ 1927917698);
            case 131 -> b(-664831703, var9 ^ -1826380494);
            case 132 -> b(-664831704, var9 ^ 202532341);
            case 133 -> b(-664831697, var9 ^ 1335469876);
            case 134 -> b(-664831698, var9 ^ -332927367);
            case 135 -> b(-664831699, var9 ^ -899852964);
            case 136 -> b(-664831700, var9 ^ 1722440462);
            case 137 -> b(-664831693, var9 ^ 1328953990);
            case 138 -> b(-664831694, var9 ^ -1018316904);
            case 139 -> b(-664831695, var9 ^ 1686275715);
            case 140 -> b(-664831696, var9 ^ 1143469197);
            case 141 -> b(-664831689, var9 ^ -875336116);
            case 142 -> b(-664831690, var9 ^ -492531274);
            case 143 -> 5;
            case 144 -> b(-664831691, var9 ^ 1607579435);
            case 145 -> b(-664831692, var9 ^ 409619778);
            case 146 -> b(-664831685, var9 ^ 181827312);
            case 147 -> b(-664831686, var9 ^ 357304209);
            case 148 -> b(-664831687, var9 ^ -881609221);
            case 149 -> b(-664831688, var9 ^ 786446734);
            case 150 -> b(-664831681, var9 ^ -432240803);
            case 151 -> b(-664831682, var9 ^ -1948841296);
            case 152 -> b(-664831683, var9 ^ 969071237);
            case 153 -> b(-664831684, var9 ^ 557781658);
            case 154 -> b(-664831741, var9 ^ 1527161121);
            case 155 -> b(-664831742, var9 ^ -702524048);
            case 156 -> b(-664831743, var9 ^ -10788131);
            case 157 -> b(-664831744, var9 ^ -1635850292);
            case 158 -> b(-664831737, var9 ^ -860456771);
            case 159 -> b(-664831738, var9 ^ -156513173);
            case 160 -> b(-664831739, var9 ^ -986414142);
            case 161 -> b(-664831740, var9 ^ -1556744324);
            case 162 -> 0;
            case 163 -> b(-664831733, var9 ^ 472941845);
            case 164 -> b(-664831734, var9 ^ -1918320225);
            case 165 -> b(-664831735, var9 ^ 270674424);
            case 166 -> b(-664831736, var9 ^ 1679925686);
            case 167 -> b(-664831729, var9 ^ 42415424);
            case 168 -> b(-664831730, var9 ^ -814117971);
            case 169 -> b(-664831731, var9 ^ 1857994864);
            case 170 -> b(-664831732, var9 ^ -1621816571);
            case 171 -> b(-664831725, var9 ^ -844095989);
            case 172 -> b(-664831726, var9 ^ -730540277);
            case 173 -> b(-664831727, var9 ^ 2113858999);
            case 174 -> b(-664831728, var9 ^ 502625484);
            case 175 -> b(-664831721, var9 ^ 1310656423);
            case 176 -> b(-664831722, var9 ^ 506883627);
            case 177 -> b(-664831723, var9 ^ 346366837);
            case 178 -> b(-664831724, var9 ^ 512371765);
            case 179 -> b(-664831717, var9 ^ 846741081);
            case 180 -> b(-664831718, var9 ^ -485376753);
            case 181 -> b(-664831719, var9 ^ -1881025236);
            case 182 -> b(-664831720, var9 ^ -989297402);
            case 183 -> b(-664831713, var9 ^ -1197535799);
            case 184 -> b(-664831714, var9 ^ 1811768030);
            case 185 -> b(-664831715, var9 ^ 743251112);
            case 186 -> b(-664831716, var9 ^ -1245397490);
            case 187 -> b(-664831645, var9 ^ -981281857);
            case 188 -> b(-664831646, var9 ^ 1597304719);
            case 189 -> b(-664831647, var9 ^ 852472040);
            case 190 -> b(-664831648, var9 ^ 1573397822);
            case 191 -> b(-664831641, var9 ^ 1767287914);
            case 192 -> b(-664831642, var9 ^ 1536242767);
            case 193 -> b(-664831643, var9 ^ -1604336533);
            case 194 -> b(-664831644, var9 ^ -2094394495);
            case 195 -> b(-664831637, var9 ^ -257110358);
            case 196 -> b(-664831638, var9 ^ 168059007);
            case 197 -> b(-664831639, var9 ^ -1666237827);
            case 198 -> b(-664831640, var9 ^ 1969019948);
            case 199 -> b(-664831633, var9 ^ -860781312);
            case 200 -> b(-664831634, var9 ^ 426359111);
            case 201 -> b(-664831635, var9 ^ -249839280);
            case 202 -> b(-664831636, var9 ^ -632427410);
            case 203 -> b(-664831629, var9 ^ 1326420619);
            case 204 -> b(-664831630, var9 ^ -137672125);
            case 205 -> b(-664831631, var9 ^ -925726306);
            case 206 -> b(-664831632, var9 ^ -311223382);
            case 207 -> b(-664831625, var9 ^ -322813317);
            case 208 -> b(-664831626, var9 ^ 1328186921);
            case 209 -> b(-664831627, var9 ^ -380299370);
            case 210 -> b(-664831628, var9 ^ -184690480);
            case 211 -> b(-664831621, var9 ^ 1199815563);
            case 212 -> b(-664831622, var9 ^ -1060024305);
            case 213 -> b(-664831623, var9 ^ 1305811857);
            case 214 -> b(-664831624, var9 ^ -947754185);
            case 215 -> b(-664831617, var9 ^ -1471761156);
            case 216 -> b(-664831618, var9 ^ -2122090028);
            case 217 -> b(-664831619, var9 ^ 976532242);
            case 218 -> b(-664831620, var9 ^ -66130962);
            case 219 -> b(-664831677, var9 ^ 769394233);
            case 220 -> b(-664831678, var9 ^ 1318493112);
            case 221 -> b(-664831679, var9 ^ 607234865);
            case 222 -> b(-664831680, var9 ^ 371434276);
            case 223 -> b(-664831673, var9 ^ 1581195801);
            case 224 -> b(-664831674, var9 ^ -1183356099);
            case 225 -> b(-664831675, var9 ^ -389435333);
            case 226 -> b(-664831676, var9 ^ 2083341705);
            case 227 -> b(-664831669, var9 ^ -1758897046);
            case 228 -> 2;
            case 229 -> 1;
            case 230 -> 4;
            case 231 -> b(-664831670, var9 ^ 602386810);
            case 232 -> b(-664831671, var9 ^ -907637530);
            case 233 -> b(-664831672, var9 ^ 1803264729);
            case 234 -> b(-664831665, var9 ^ 744959132);
            case 235 -> b(-664831666, var9 ^ 8085145);
            case 236 -> b(-664831667, var9 ^ 54653411);
            case 237 -> b(-664831668, var9 ^ -182713706);
            case 238 -> b(-664831661, var9 ^ 581899743);
            case 239 -> b(-664831662, var9 ^ -991182097);
            case 240 -> b(-664831663, var9 ^ -190974684);
            case 241 -> b(-664831664, var9 ^ -860847610);
            case 242 -> b(-664831657, var9 ^ -1683288444);
            case 243 -> b(-664831658, var9 ^ 27813067);
            case 244 -> b(-664831659, var9 ^ 1143332947);
            case 245 -> b(-664831660, var9 ^ 944318074);
            case 246 -> b(-664831653, var9 ^ 1456446486);
            case 247 -> b(-664831654, var9 ^ 169969191);
            case 248 -> b(-664831655, var9 ^ -1118280308);
            case 249 -> b(-664831656, var9 ^ 322992386);
            case 250 -> b(-664831649, var9 ^ 2061768470);
            case 251 -> b(-664831650, var9 ^ -1294800652);
            case 252 -> b(-664831651, var9 ^ -63046248);
            case 253 -> b(-664831652, var9 ^ -1329890725);
            case 254 -> b(-664831837, var9 ^ 497580021);
            default -> b(-664831838, var9 ^ -2138798051);
         };
         int var5 = (var1 & b(-664831839, var9 ^ -359592093)) - var4;
         if (var5 < 0) {
            var5 += 256;
         }

         int var6 = ((var1 & b(-664831840, var9 ^ 296219928)) >>> b(-664831833, var9 ^ -2091236583)) - var4;
         if (var6 < 0) {
            var6 += 256;
         }

         for (int var7 = 0; var7 < var3.length; var7++) {
            int var8 = var7 % 2;
            char var10002 = var3[var7];
            if (var8 == 0) {
               var3[var7] = (char)(var10002 ^ var5);
               var5 = ((var5 >>> 3 | var5 << 5) ^ var3[var7]) & b(-664831834, var9 ^ -1473109247);
            } else {
               var3[var7] = (char)(var10002 ^ var6);
               var6 = ((var6 >>> 3 | var6 << 5) ^ var3[var7]) & b(-664831835, var9 ^ 1480184262);
            }
         }

         aa[var2] = new String(var3).intern();
      }

      return aa[var2];
   }

   private static float bab(float param0, class_1267 param1) {
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
      // 06: ifne 17
      // 09: getstatic net/minecraft/class_1267.field_5801 Lnet/minecraft/class_1267;
      // 0c: if_acmpne 16
      // 0f: goto 13
      // 12: athrow
      // 13: fconst_0
      // 14: freturn
      // 15: athrow
      // 16: aload 1
      // 17: iload 2
      // 18: ifne 33
      // 1b: getstatic net/minecraft/class_1267.field_5805 Lnet/minecraft/class_1267;
      // 1e: if_acmpne 32
      // 21: goto 25
      // 24: athrow
      // 25: fload 0
      // 26: ldc_w 0.5
      // 29: fmul
      // 2a: fconst_1
      // 2b: fadd
      // 2c: fload 0
      // 2d: invokestatic java/lang/Math.min (FF)F
      // 30: freturn
      // 31: athrow
      // 32: aload 1
      // 33: getstatic net/minecraft/class_1267.field_5807 Lnet/minecraft/class_1267;
      // 36: if_acmpne 42
      // 39: fload 0
      // 3a: ldc_w 1.5
      // 3d: fmul
      // 3e: goto 43
      // 41: athrow
      // 42: fload 0
      // 43: freturn
   }

   private aaabaaaa() {
   }

   private static float bba(class_243 param0, class_238 param1, class_1297 param2, class_2338 param3, class_2338 param4, class_2680 param5) {
      // $VF: Couldn't be decompiled
      // Please report this to the Vineflower issue tracker, at https://github.com/Vineflower/vineflower/issues with a copy of the class file (if you have the rights to distribute it!)
      // java.lang.RuntimeException: parsing failure!
      //   at org.jetbrains.java.decompiler.modules.decompiler.decompose.DomHelper.parseGraph(DomHelper.java:211)
      //   at org.jetbrains.java.decompiler.main.rels.MethodProcessor.codeToJava(MethodProcessor.java:166)
      //
      // Bytecode:
      // 000: getstatic qeaa361f143ee4a0894bd168fd9b30c66/qf4ccf8f5435d4a78bdca4d6a018b578e/baaabbaa.bba I
      // 003: invokestatic net/minecraft/class_310.method_1551 ()Lnet/minecraft/class_310;
      // 006: astore 7
      // 008: istore 6
      // 00a: aload 0
      // 00b: ifnull 02a
      // 00e: aload 1
      // 00f: ifnull 02a
      // 012: goto 016
      // 015: athrow
      // 016: aload 2
      // 017: ifnull 02a
      // 01a: goto 01e
      // 01d: athrow
      // 01e: aload 7
      // 020: getfield net/minecraft/class_310.field_1687 Lnet/minecraft/class_638;
      // 023: ifnonnull 02d
      // 026: goto 02a
      // 029: athrow
      // 02a: fconst_0
      // 02b: freturn
      // 02c: athrow
      // 02d: dconst_1
      // 02e: aload 1
      // 02f: invokevirtual net/minecraft/class_238.method_17939 ()D
      // 032: ldc2_w 2.0
      // 035: dmul
      // 036: dconst_1
      // 037: dadd
      // 038: ddiv
      // 039: dstore 8
      // 03b: dconst_1
      // 03c: aload 1
      // 03d: invokevirtual net/minecraft/class_238.method_17940 ()D
      // 040: ldc2_w 2.0
      // 043: dmul
      // 044: dconst_1
      // 045: dadd
      // 046: ddiv
      // 047: dstore 10
      // 049: dconst_1
      // 04a: aload 1
      // 04b: invokevirtual net/minecraft/class_238.method_17941 ()D
      // 04e: ldc2_w 2.0
      // 051: dmul
      // 052: dconst_1
      // 053: dadd
      // 054: ddiv
      // 055: dstore 12
      // 057: dload 8
      // 059: iload 6
      // 05b: ifne 06d
      // 05e: dconst_0
      // 05f: dcmpg
      // 060: iflt 08f
      // 063: goto 067
      // 066: athrow
      // 067: dload 10
      // 069: goto 06d
      // 06c: athrow
      // 06d: dconst_0
      // 06e: iload 6
      // 070: ifne 08b
      // 073: dcmpg
      // 074: iflt 08f
      // 077: goto 07b
      // 07a: athrow
      // 07b: dload 12
      // 07d: iload 6
      // 07f: ifne 0a2
      // 082: goto 086
      // 085: athrow
      // 086: dconst_0
      // 087: goto 08b
      // 08a: athrow
      // 08b: dcmpg
      // 08c: ifge 092
      // 08f: fconst_0
      // 090: freturn
      // 091: athrow
      // 092: dconst_1
      // 093: dconst_1
      // 094: dload 8
      // 096: ddiv
      // 097: invokestatic java/lang/Math.floor (D)D
      // 09a: dload 8
      // 09c: dmul
      // 09d: dsub
      // 09e: ldc2_w 0.5
      // 0a1: dmul
      // 0a2: dstore 14
      // 0a4: dconst_1
      // 0a5: dconst_1
      // 0a6: dload 12
      // 0a8: ddiv
      // 0a9: invokestatic java/lang/Math.floor (D)D
      // 0ac: dload 12
      // 0ae: dmul
      // 0af: dsub
      // 0b0: ldc2_w 0.5
      // 0b3: dmul
      // 0b4: dstore 16
      // 0b6: bipush 0
      // 0b7: istore 18
      // 0b9: bipush 0
      // 0ba: istore 19
      // 0bc: dconst_0
      // 0bd: dstore 20
      // 0bf: dload 20
      // 0c1: dconst_1
      // 0c2: dcmpg
      // 0c3: ifgt 16b
      // 0c6: iload 6
      // 0c8: ifne 17e
      // 0cb: dconst_0
      // 0cc: dstore 22
      // 0ce: dload 22
      // 0d0: dconst_1
      // 0d1: dcmpg
      // 0d2: ifgt 15f
      // 0d5: iload 6
      // 0d7: ifne 166
      // 0da: dconst_0
      // 0db: dstore 24
      // 0dd: dload 24
      // 0df: dconst_1
      // 0e0: dcmpg
      // 0e1: ifgt 153
      // 0e4: new net/minecraft/class_243
      // 0e7: dup
      // 0e8: dload 20
      // 0ea: aload 1
      // 0eb: getfield net/minecraft/class_238.field_1323 D
      // 0ee: aload 1
      // 0ef: getfield net/minecraft/class_238.field_1320 D
      // 0f2: invokestatic net/minecraft/class_3532.method_16436 (DDD)D
      // 0f5: dload 14
      // 0f7: dadd
      // 0f8: dload 22
      // 0fa: aload 1
      // 0fb: getfield net/minecraft/class_238.field_1322 D
      // 0fe: aload 1
      // 0ff: getfield net/minecraft/class_238.field_1325 D
      // 102: invokestatic net/minecraft/class_3532.method_16436 (DDD)D
      // 105: dload 24
      // 107: aload 1
      // 108: getfield net/minecraft/class_238.field_1321 D
      // 10b: aload 1
      // 10c: getfield net/minecraft/class_238.field_1324 D
      // 10f: invokestatic net/minecraft/class_3532.method_16436 (DDD)D
      // 112: dload 16
      // 114: dadd
      // 115: invokespecial net/minecraft/class_243.<init> (DDD)V
      // 118: astore 26
      // 11a: iload 6
      // 11c: ifne 14e
      // 11f: iload 6
      // 121: ifne 15a
      // 124: goto 128
      // 127: athrow
      // 128: aload 7
      // 12a: aload 26
      // 12c: aload 0
      // 12d: aload 2
      // 12e: aload 3
      // 12f: aload 4
      // 131: aload 5
      // 133: invokestatic qeaa361f143ee4a0894bd168fd9b30c66/qf4ccf8f5435d4a78bdca4d6a018b578e/aaabaaaa.abab (Lnet/minecraft/class_310;Lnet/minecraft/class_243;Lnet/minecraft/class_243;Lnet/minecraft/class_1297;Lnet/minecraft/class_2338;Lnet/minecraft/class_2338;Lnet/minecraft/class_2680;)Z
      // 136: ifeq 144
      // 139: goto 13d
      // 13c: athrow
      // 13d: iinc 18 1
      // 140: goto 144
      // 143: athrow
      // 144: iinc 19 1
      // 147: dload 24
      // 149: dload 12
      // 14b: dadd
      // 14c: dstore 24
      // 14e: iload 6
      // 150: ifeq 0dd
      // 153: dload 22
      // 155: dload 10
      // 157: dadd
      // 158: dstore 22
      // 15a: iload 6
      // 15c: ifeq 0ce
      // 15f: dload 20
      // 161: dload 8
      // 163: dadd
      // 164: dstore 20
      // 166: iload 6
      // 168: ifeq 0bf
      // 16b: iload 19
      // 16d: iload 6
      // 16f: ifne 180
      // 172: ifne 17e
      // 175: goto 179
      // 178: athrow
      // 179: fconst_0
      // 17a: goto 185
      // 17d: athrow
      // 17e: iload 18
      // 180: i2f
      // 181: iload 19
      // 183: i2f
      // 184: fdiv
      // 185: freturn
   }

   public static float bbb(class_1309 var0, class_243 var1, float var2, class_2338 var3) {
      return abaa(var0, var1, var2, var3, null);
   }

   private static int b(int var0, int var1) {
      int var2 = a[var0 ^ -664831581] ^ var1 ^ var0;
      var2 += 23774;
      var2 ^= 30522;
      var2 -= 19274;
      var2 -= 27705;
      var2 ^= 55975;
      var2 -= 43438;
      var2 += 28997;
      var2 += 3999;
      var2 -= 46935;
      return var2 + 54010;
   }

   private static String aaaa(class_5321 var0) {
      return var0.method_29177().method_12832();
   }

   public static float aaab(class_1309 var0, class_243 var1, float var2) {
      return bbb(var0, var1, var2, null);
   }

   // $VF: Irreducible bytecode was duplicated to produce valid code
   static {
      int var31 = 1737798049;
      short var26 = 29949;
      int var10001 = "B缘쟈絤쟥練쟉羼蟘紸蟙綘ߗ緤蟧罌߁綘쟩緄䟝緀쟰罀䟂繰쟋絈ߚ籠ߨ糬蟵粰䟱缜\u07fc缄쟀簘蟛繰䟵羼蟔繈ߟ羸蟮絤쟥繠蟼簄쟆編쟴糬䟣綐쟅羜쟰縨蟉緸䟈\u0010翰ߐ籰쟵繴䟅縠䟁纜蟅絀䟨糌蟌紜蟜\n\ue2b7縍\ue3fb븊\ue003븠\ue1c3縛\ue06f븖"
         .length();
      String[] var23 = new String[3];
      int var22 = var10001;
      String var21 = "B缘쟈絤쟥練쟉羼蟘紸蟙綘ߗ緤蟧罌߁綘쟩緄䟝緀쟰罀䟂繰쟋絈ߚ籠ߨ糬蟵粰䟱缜\u07fc缄쟀簘蟛繰䟵羼蟔繈ߟ羸蟮絤쟥繠蟼簄쟆編쟴糬䟣綐쟅羜쟰縨蟉緸䟈\u0010翰ߐ籰쟵繴䟅縠䟁纜蟅絀䟨糌蟌紜蟜\n\ue2b7縍\ue3fb븊\ue003븠\ue1c3縛\ue06f븖";
      int var24 = 0;
      int var25 = 0;

      do {
         char var27 = var21.charAt(var25);
         int var29 = 0;
         char[] var28 = var21.substring(var25 + 1, var25 + 1 + var27).toCharArray();

         do {
            char var30 = var28[var29];
            if (var29 % 2 == 0) {
               var28[var29] = (char)((var30 >>> 2 | var30 << 14) & 65535 ^ var26);
            } else {
               var28[var29] = (char)((var30 << 2 | var30 >>> 14) & 65535 ^ var26);
            }
         } while (++var29 < var28.length);

         var23[var24] = new String(var28);
         var24++;
         var25 = var25 + var27 + 1;
      } while (var25 < var22);

      aaa = var23;
      aab = new Object[var23.length];
      int var17 = 2144670451;
      byte[] var15 = "ñ1¯\u008c¿Iè« Î\u009bÛS\u001c® _nÃ÷ãj\u0000¾\u0017\u000f\u008aë°Ñ¤7ó5\u0098Lp é7d¢t\u0083\u009eM\u000eP-\u0084%Îï·\u0089µ\u0014få9¿4|Y\u008c\u0099\u0012´ô\"Iê\u008cz¤»\fb\"\u0090r\u001c\u007fa:^%«Úîìg-òÙ\u0002¶á³ý\u0087H\u000b\bz¤Ç1FQI/\u0088¬ëã\u0001ÊèX\u0090$\u0081\u0000»\b{HQ|ì\u0083Ñ>bCâ\u0014¡^·]\u0093G\u00924Ð*eV\u000fYé\\àöÊ\fy\u001eA&Æã~®P\\kÐU&Ð\"\u001c§ì\u0094ÖoFâ×«\u0007\u0001á|¶7ZâP¤\u0087Î\u0012æêçh÷¦\u0093\u0094W\n÷pTo+âQ/\u0098*\u008bqÛÝãL0ý\u001ew{C\u001c®\u007f\u00adOA\u009dö£ë\u0000ÛQéM\u0001T~óÕ[NÝ\u000eìÂÿ_ W\u001f»\rè3\u0004_*Õ ÿ\u000evÁþNg¯I IlT9,=\u0092®k«\u008ag£Ï\u0099Ýf\u008aÕæØ\u000fç?ì\u009eV\u0095mL>}äQß\u0092Ï\u0087Ù\u0093k¼\u0014¹¾C)-¶A$!ûü×UËÎû§!Ò \t}\u0084¹ú\u000e\u0004\u001b\u001c-\u008c\u0017\u0085ZEg\\.\u001f\u001c·B\u0013\u008eº?¤\u0098©OlÂª¥Á{\u0012ñI¨\u0084OÂ\n°¡Ò\u0081cGq|BÀPìÔz¬Ùq\u009dó\u0003^J\u0004õ\u009aG+ÌeoË;T¦ïÉå\u0016\u001fG÷*ÜH¦_>Û\u008eCÿI\u0011\u0093cv¹N{}\u0094¿\r3\u0098M\u0014ó²â\u009e\u0002ÝôÔ_\u0088¯8&\u0098\u009a\u0091ùÅV#EipD-b\u0006\u0096\u009cp¦\"ý\u001cÏì\r4°4B\u0083æ`\u000fÙ]öèÄÊbPÈ6Ì2\u00972\u0089ù\u0017Ø\u0085Ê°?_\u0013\u009d×\u008cõÖOñç¿L#\u009a\u0082\u009b\u001d¢¶*U¢\u0092S\f#\u001b7v~£g\u0097´±\u0087\b\u0085s\u001bK\u000e´\u0002è°úÅÎÊF_b=O©K¡.\rÇÚ¤r`\u0015\u0095y@°çsÏD}ýæ3\u0084È[F¤×\u001cýY\u009c\u000eAbI\u0011Û\u00131Ïä¦ô*w-\fâ«\u0091\u001f\u008f@\u001e\u007f=UÉ8%¨\u0001]_\u0091·GÒ·FfûÌvn\u009aéó;È!k\u0083ò<ØÔÁ£\u0097.§¢á\u000f\u0018§\u0090P\u0089?×®\u0014µ:Õ`¶·Ê\u0006\u0010!ùËî\u0098\u009ej)Ôé\u009bÂ\u001f·É'\n§ÐãÄ\u000byiùM\u0019b`tJ\u0088\u0012ÿ\u001a¡}=\u001020|\u001a\u001d?\u00036ï( ç\u0086®\n\u008bvÃGÁ\u009f\u0091ê¼\b\u0019Eojw\u0098(Ú\nË±S¨(Á\u0015Æ\u0082[£üÒ6X£\u0083Y_1úmÁ¿\n_\u0006'\u000f¤ÈÐ\u0096\u0087½\u0007\u0018ô;Ýæ\u000e\u0093v|\u00988.òqËÉ\u000eÈ&\u0090/\u001dþ\u00ad§õ\u008cÒ\u0012ÞÚùXK\u0098\u0084\u0097ó\\\\RÌE\u009d\u0007éä\u000foèUVîK½\u0092ùíÂ\u0004ÃðjÍíC\u0014\u00ad\u0081ÄFF\nIB\r/Ã\u0015~\u0002¬Ñ¢í\u0085\u0014jP>£¦<ø\u0099ÿ%)K\u0015·J\u0001\u008e\u0080 ¦¸H\u0012´°µZ¨1\u007f½à\u007fôì^¤ÅxºS»\u0093¾Ip'p¢\u001cÍq\u0098>oì±](ð?ð\u0004ìM\r\u0007Öâ\u0083ñ\u008b\u0017\u0081&8\u0006\u000bÀ|ÖAð\næ·È'\u0091\u0097\u009f<\u001dö\u0005?w\u00ad@²ô\u0098<Þ2\u009eRX\u008fx\u000e¶\u0092í¹Ïv\b\u0017×l\u0007~s\u0003°¶EüDøªè\u0080´,iÜ\u0019?`*\u0084\u0013\u009dMî\u0006\u0018ø\u00153ç\u0082\u0087ÍQ·¬¥4\u009d\\®ÆY*¸qÒ\u0081T\u0016\u009aHD\u0016PK\u0000 \u00835´\u000bÔ \u007f\u009d\u00847w\u0098Ï\u0007«\u0007ä(\u001fm\u0019¾\u0014¤\u0084A\u0014\r\u0019xè}Æ\u0013\u009a}ÅD\u0000TÄ2\u008fDÈ¡\u001fÏÛ8\u001d\u009e9.\u007f\u0010Ý\u009d\u0083\u0002x6\u0012¹IßàÇá°bía"
         .getBytes("ISO-8859-1");
      int var16 = var15.length / 4;
      a = new int[var16];
      byte var18 = 0;
      int var19 = 0;

      do {
         int var20 = (var15[var18] & 255) << 24 | (var15[var18 + 1] & 255) << 16 | (var15[var18 + 2] & 255) << 8 | var15[var18 + 3] & 255;
         var20 ^= var17;
         a[var19] = var20;
         var18 += 4;
      } while (++var19 < var16);

      String[] var13 = new String[3];
      int var11 = 0;
      String var10;
      int var12 = (var10 = baaa(1704680985, var31 ^ 838248791)).length();
      int var9 = b(-664831830, var31 ^ -2007279901);
      int var8 = -1;

      while (true) {
         char[] var45;
         label85: {
            char[] var34 = var10.substring(++var8, var8 + var9).toCharArray();
            int var10003 = var34.length;
            int var14 = 0;
            var45 = var34;
            var10001 = var10003;
            char[] var52;
            int var10004;
            if (var10003 <= 1) {
               var52 = var34;
               var10004 = var14;
            } else {
               var45 = var34;
               var10001 = var10003;
               if (var10003 <= var14) {
                  break label85;
               }

               var52 = var34;
               var10004 = var14;
            }

            while (true) {
               var52[var10004] = (char)(var52[var10004] ^ switch (var14 % b(-664831831, var31 ^ -1960845280)) {
                  case 0 -> b(-664831832, var31 ^ -173323353);
                  case 1 -> b(-664831825, var31 ^ -530522857);
                  case 2 -> b(-664831826, var31 ^ -144123726);
                  case 3 -> b(-664831827, var31 ^ -944486559);
                  case 4 -> b(-664831828, var31 ^ -402641510);
                  case 5 -> b(-664831821, var31 ^ 2114708424);
                  default -> b(-664831822, var31 ^ -2129965721);
               });
               var14++;
               if (var10001 == 0) {
                  var10004 = var10001;
                  var52 = var45;
               } else {
                  if (var10001 <= var14) {
                     break;
                  }

                  var52 = var45;
                  var10004 = var14;
               }
            }
         }

         String var59 = new String(var45).intern();
         int var41 = -1;
         var13[var11++] = var59;
         if ((var8 += var9) >= var12) {
            bb = var13;
            aa = new String[3];
            long var0 = 8162887415871451185L;
            long[] var6 = new long[2];
            int var3 = 0;
            String var4;
            int var5 = (var4 = baaa(1704680984, var31 ^ 827494800)).length();
            byte var2 = 0;

            do {
               var41 = var2;
               var2 += 8;
               byte[] var7 = var4.substring(var41, var2).getBytes(baaa(1704680987, var31 ^ -699336708));
               var41 = var3++;
               long var61 = (
                     (var7[0] & 255L) << b(-664831823, var31 ^ -1191756474)
                        | (var7[1] & 255L) << b(-664831824, var31 ^ -746242740)
                        | (var7[2] & 255L) << b(-664831817, var31 ^ -2078337966)
                        | (var7[3] & 255L) << b(-664831818, var31 ^ -225442729)
                        | (var7[4] & 255L) << b(-664831819, var31 ^ 1627426687)
                        | (var7[5] & 255L) << b(-664831820, var31 ^ -134029676)
                        | (var7[b(-664831813, var31 ^ -295677843)] & 255L) << b(-664831814, var31 ^ 1570521795)
                        | var7[b(-664831815, var31 ^ -166856198)] & 255L
                  )
                  ^ var0;
               byte var60 = -1;
               var6[var41] = var61;
            } while (var2 < var5);

            ab = var6;
            ba = new Integer[2];
            b = new class_1304[]{class_1304.field_6169, class_1304.field_6174, class_1304.field_6172, class_1304.field_6166};
            return;
         }

         var9 = var10.charAt(var8);
      }
   }

   private static float aaba(class_243 param0, class_238 param1, class_1297 param2) {
      // $VF: Couldn't be decompiled
      // Please report this to the Vineflower issue tracker, at https://github.com/Vineflower/vineflower/issues with a copy of the class file (if you have the rights to distribute it!)
      // java.lang.RuntimeException: parsing failure!
      //   at org.jetbrains.java.decompiler.modules.decompiler.decompose.DomHelper.parseGraph(DomHelper.java:211)
      //   at org.jetbrains.java.decompiler.main.rels.MethodProcessor.codeToJava(MethodProcessor.java:166)
      //
      // Bytecode:
      // 000: getstatic qeaa361f143ee4a0894bd168fd9b30c66/qf4ccf8f5435d4a78bdca4d6a018b578e/baaabbaa.bba I
      // 003: invokestatic net/minecraft/class_310.method_1551 ()Lnet/minecraft/class_310;
      // 006: astore 4
      // 008: istore 3
      // 009: aload 4
      // 00b: getfield net/minecraft/class_310.field_1687 Lnet/minecraft/class_638;
      // 00e: ifnonnull 014
      // 011: fconst_0
      // 012: freturn
      // 013: athrow
      // 014: dconst_1
      // 015: aload 1
      // 016: invokevirtual net/minecraft/class_238.method_17939 ()D
      // 019: ldc2_w 2.0
      // 01c: dmul
      // 01d: dconst_1
      // 01e: dadd
      // 01f: ddiv
      // 020: dstore 5
      // 022: dconst_1
      // 023: aload 1
      // 024: invokevirtual net/minecraft/class_238.method_17940 ()D
      // 027: ldc2_w 2.0
      // 02a: dmul
      // 02b: dconst_1
      // 02c: dadd
      // 02d: ddiv
      // 02e: dstore 7
      // 030: dconst_1
      // 031: aload 1
      // 032: invokevirtual net/minecraft/class_238.method_17941 ()D
      // 035: ldc2_w 2.0
      // 038: dmul
      // 039: dconst_1
      // 03a: dadd
      // 03b: ddiv
      // 03c: dstore 9
      // 03e: dconst_1
      // 03f: dconst_1
      // 040: dload 5
      // 042: ddiv
      // 043: invokestatic java/lang/Math.floor (D)D
      // 046: dload 5
      // 048: dmul
      // 049: dsub
      // 04a: ldc2_w 0.5
      // 04d: dmul
      // 04e: dstore 11
      // 050: dconst_1
      // 051: dconst_1
      // 052: dload 9
      // 054: ddiv
      // 055: invokestatic java/lang/Math.floor (D)D
      // 058: dload 9
      // 05a: dmul
      // 05b: dsub
      // 05c: ldc2_w 0.5
      // 05f: dmul
      // 060: dstore 13
      // 062: bipush 0
      // 063: istore 15
      // 065: bipush 0
      // 066: istore 16
      // 068: dconst_0
      // 069: dstore 17
      // 06b: dload 17
      // 06d: dconst_1
      // 06e: dcmpg
      // 06f: ifgt 125
      // 072: iload 3
      // 073: ifne 137
      // 076: dconst_0
      // 077: dstore 19
      // 079: dload 19
      // 07b: dconst_1
      // 07c: dcmpg
      // 07d: ifgt 11a
      // 080: iload 3
      // 081: ifne 121
      // 084: dconst_0
      // 085: dstore 21
      // 087: dload 21
      // 089: dconst_1
      // 08a: dcmpg
      // 08b: ifgt 10f
      // 08e: new net/minecraft/class_243
      // 091: dup
      // 092: dload 17
      // 094: aload 1
      // 095: getfield net/minecraft/class_238.field_1323 D
      // 098: aload 1
      // 099: getfield net/minecraft/class_238.field_1320 D
      // 09c: invokestatic net/minecraft/class_3532.method_16436 (DDD)D
      // 09f: dload 11
      // 0a1: dadd
      // 0a2: dload 19
      // 0a4: aload 1
      // 0a5: getfield net/minecraft/class_238.field_1322 D
      // 0a8: aload 1
      // 0a9: getfield net/minecraft/class_238.field_1325 D
      // 0ac: invokestatic net/minecraft/class_3532.method_16436 (DDD)D
      // 0af: dload 21
      // 0b1: aload 1
      // 0b2: getfield net/minecraft/class_238.field_1321 D
      // 0b5: aload 1
      // 0b6: getfield net/minecraft/class_238.field_1324 D
      // 0b9: invokestatic net/minecraft/class_3532.method_16436 (DDD)D
      // 0bc: dload 13
      // 0be: dadd
      // 0bf: invokespecial net/minecraft/class_243.<init> (DDD)V
      // 0c2: astore 23
      // 0c4: iload 3
      // 0c5: aload 4
      // 0c7: getfield net/minecraft/class_310.field_1687 Lnet/minecraft/class_638;
      // 0ca: new net/minecraft/class_3959
      // 0cd: dup
      // 0ce: aload 23
      // 0d0: aload 0
      // 0d1: getstatic net/minecraft/class_3959$class_3960.field_17558 Lnet/minecraft/class_3959$class_3960;
      // 0d4: getstatic net/minecraft/class_3959$class_242.field_1348 Lnet/minecraft/class_3959$class_242;
      // 0d7: aload 2
      // 0d8: invokespecial net/minecraft/class_3959.<init> (Lnet/minecraft/class_243;Lnet/minecraft/class_243;Lnet/minecraft/class_3959$class_3960;Lnet/minecraft/class_3959$class_242;Lnet/minecraft/class_1297;)V
      // 0db: invokevirtual net/minecraft/class_638.method_17742 (Lnet/minecraft/class_3959;)Lnet/minecraft/class_3965;
      // 0de: astore 24
      // 0e0: ifne 116
      // 0e3: iload 3
      // 0e4: ifne 10b
      // 0e7: goto 0eb
      // 0ea: athrow
      // 0eb: aload 24
      // 0ed: invokevirtual net/minecraft/class_3965.method_17783 ()Lnet/minecraft/class_239$class_240;
      // 0f0: getstatic net/minecraft/class_239$class_240.field_1333 Lnet/minecraft/class_239$class_240;
      // 0f3: if_acmpne 101
      // 0f6: goto 0fa
      // 0f9: athrow
      // 0fa: iinc 15 1
      // 0fd: goto 101
      // 100: athrow
      // 101: iinc 16 1
      // 104: dload 21
      // 106: dload 9
      // 108: dadd
      // 109: dstore 21
      // 10b: iload 3
      // 10c: ifeq 087
      // 10f: dload 19
      // 111: dload 7
      // 113: dadd
      // 114: dstore 19
      // 116: iload 3
      // 117: ifeq 079
      // 11a: dload 17
      // 11c: dload 5
      // 11e: dadd
      // 11f: dstore 17
      // 121: iload 3
      // 122: ifeq 06b
      // 125: iload 16
      // 127: iload 3
      // 128: ifne 139
      // 12b: ifne 137
      // 12e: goto 132
      // 131: athrow
      // 132: fconst_0
      // 133: goto 13e
      // 136: athrow
      // 137: iload 15
      // 139: i2f
      // 13a: iload 16
      // 13c: i2f
      // 13d: fdiv
      // 13e: freturn
   }

   public static float aabb(class_1309 param0, class_243 param1, float param2) {
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
      // 05: ifnull 10
      // 08: aload 1
      // 09: ifnonnull 13
      // 0c: goto 10
      // 0f: athrow
      // 10: fconst_0
      // 11: freturn
      // 12: athrow
      // 13: invokestatic net/minecraft/class_310.method_1551 ()Lnet/minecraft/class_310;
      // 16: astore 4
      // 18: aload 4
      // 1a: getfield net/minecraft/class_310.field_1687 Lnet/minecraft/class_638;
      // 1d: ifnonnull 23
      // 20: fconst_0
      // 21: freturn
      // 22: athrow
      // 23: fload 2
      // 24: fconst_2
      // 25: fmul
      // 26: fstore 5
      // 28: aload 0
      // 29: invokevirtual net/minecraft/class_1309.method_73189 ()Lnet/minecraft/class_243;
      // 2c: aload 1
      // 2d: invokevirtual net/minecraft/class_243.method_1025 (Lnet/minecraft/class_243;)D
      // 30: invokestatic java/lang/Math.sqrt (D)D
      // 33: fload 5
      // 35: f2d
      // 36: ddiv
      // 37: dstore 6
      // 39: dload 6
      // 3b: iload 3
      // 3c: ifne 4f
      // 3f: dconst_1
      // 40: dcmpl
      // 41: ifle 4b
      // 44: goto 48
      // 47: athrow
      // 48: fconst_0
      // 49: freturn
      // 4a: athrow
      // 4b: dconst_1
      // 4c: dload 6
      // 4e: dsub
      // 4f: dstore 8
      // 51: dload 8
      // 53: dload 8
      // 55: dmul
      // 56: dload 8
      // 58: dadd
      // 59: ldc2_w 0.5
      // 5c: dmul
      // 5d: ldc2_w 7.0
      // 60: dmul
      // 61: fload 5
      // 63: f2d
      // 64: dmul
      // 65: dconst_1
      // 66: dadd
      // 67: d2f
      // 68: fstore 10
      // 6a: fload 10
      // 6c: aload 4
      // 6e: getfield net/minecraft/class_310.field_1687 Lnet/minecraft/class_638;
      // 71: invokevirtual net/minecraft/class_638.method_8407 ()Lnet/minecraft/class_1267;
      // 74: invokestatic qeaa361f143ee4a0894bd168fd9b30c66/qf4ccf8f5435d4a78bdca4d6a018b578e/aaabaaaa.bab (FLnet/minecraft/class_1267;)F
      // 77: fstore 10
      // 79: aload 0
      // 7a: invokevirtual net/minecraft/class_1309.method_6096 ()I
      // 7d: i2f
      // 7e: fstore 11
      // 80: aload 0
      // 81: iload 3
      // 82: ifne 98
      // 85: getstatic net/minecraft/class_5134.field_23725 Lnet/minecraft/class_6880;
      // 88: invokevirtual net/minecraft/class_1309.method_5996 (Lnet/minecraft/class_6880;)Lnet/minecraft/class_1324;
      // 8b: ifnonnull 97
      // 8e: goto 92
      // 91: athrow
      // 92: fconst_0
      // 93: goto 9f
      // 96: athrow
      // 97: aload 0
      // 98: getstatic net/minecraft/class_5134.field_23725 Lnet/minecraft/class_6880;
      // 9b: invokevirtual net/minecraft/class_1309.method_45325 (Lnet/minecraft/class_6880;)D
      // 9e: d2f
      // 9f: fstore 12
      // a1: fconst_2
      // a2: fload 12
      // a4: ldc_w 4.0
      // a7: fdiv
      // a8: fadd
      // a9: fstore 13
      // ab: fload 11
      // ad: fload 10
      // af: fload 13
      // b1: fdiv
      // b2: fsub
      // b3: fload 11
      // b5: ldc_w 0.2
      // b8: fmul
      // b9: ldc_w 20.0
      // bc: invokestatic net/minecraft/class_3532.method_15363 (FFF)F
      // bf: fstore 14
      // c1: fload 10
      // c3: fconst_1
      // c4: fload 14
      // c6: ldc_w 25.0
      // c9: fdiv
      // ca: fsub
      // cb: fmul
      // cc: freturn
   }

   public static float abaa(class_1309 param0, class_243 param1, float param2, class_2338 param3, class_2680 param4) {
      // $VF: Couldn't be decompiled
      // Please report this to the Vineflower issue tracker, at https://github.com/Vineflower/vineflower/issues with a copy of the class file (if you have the rights to distribute it!)
      // java.lang.RuntimeException: parsing failure!
      //   at org.jetbrains.java.decompiler.modules.decompiler.decompose.DomHelper.parseGraph(DomHelper.java:211)
      //   at org.jetbrains.java.decompiler.main.rels.MethodProcessor.codeToJava(MethodProcessor.java:166)
      //
      // Bytecode:
      // 00: getstatic qeaa361f143ee4a0894bd168fd9b30c66/qf4ccf8f5435d4a78bdca4d6a018b578e/baaabbaa.bba I
      // 03: istore 5
      // 05: aload 0
      // 06: ifnull 11
      // 09: aload 1
      // 0a: ifnonnull 14
      // 0d: goto 11
      // 10: athrow
      // 11: fconst_0
      // 12: freturn
      // 13: athrow
      // 14: invokestatic net/minecraft/class_310.method_1551 ()Lnet/minecraft/class_310;
      // 17: astore 6
      // 19: aload 6
      // 1b: getfield net/minecraft/class_310.field_1687 Lnet/minecraft/class_638;
      // 1e: ifnonnull 24
      // 21: fconst_0
      // 22: freturn
      // 23: athrow
      // 24: aload 0
      // 25: invokevirtual net/minecraft/class_1309.method_73189 ()Lnet/minecraft/class_243;
      // 28: astore 7
      // 2a: aload 0
      // 2b: invokevirtual net/minecraft/class_1309.method_5829 ()Lnet/minecraft/class_238;
      // 2e: astore 8
      // 30: fload 2
      // 31: fconst_2
      // 32: fmul
      // 33: fstore 9
      // 35: aload 7
      // 37: aload 1
      // 38: invokevirtual net/minecraft/class_243.method_1025 (Lnet/minecraft/class_243;)D
      // 3b: invokestatic java/lang/Math.sqrt (D)D
      // 3e: fload 9
      // 40: f2d
      // 41: ddiv
      // 42: dstore 10
      // 44: dload 10
      // 46: dconst_1
      // 47: dcmpl
      // 48: ifle 4e
      // 4b: fconst_0
      // 4c: freturn
      // 4d: athrow
      // 4e: aload 3
      // 4f: ifnonnull 5d
      // 52: aload 1
      // 53: aload 8
      // 55: aload 0
      // 56: invokestatic qeaa361f143ee4a0894bd168fd9b30c66/qf4ccf8f5435d4a78bdca4d6a018b578e/aaabaaaa.aaba (Lnet/minecraft/class_243;Lnet/minecraft/class_238;Lnet/minecraft/class_1297;)F
      // 59: goto 68
      // 5c: athrow
      // 5d: aload 1
      // 5e: aload 8
      // 60: aload 0
      // 61: aconst_null
      // 62: aload 3
      // 63: aload 4
      // 65: invokestatic qeaa361f143ee4a0894bd168fd9b30c66/qf4ccf8f5435d4a78bdca4d6a018b578e/aaabaaaa.bba (Lnet/minecraft/class_243;Lnet/minecraft/class_238;Lnet/minecraft/class_1297;Lnet/minecraft/class_2338;Lnet/minecraft/class_2338;Lnet/minecraft/class_2680;)F
      // 68: fstore 12
      // 6a: dconst_1
      // 6b: dload 10
      // 6d: dsub
      // 6e: fload 12
      // 70: f2d
      // 71: dmul
      // 72: dstore 13
      // 74: dload 13
      // 76: dload 13
      // 78: dmul
      // 79: dload 13
      // 7b: dadd
      // 7c: ldc2_w 0.5
      // 7f: dmul
      // 80: ldc2_w 7.0
      // 83: dmul
      // 84: fload 9
      // 86: f2d
      // 87: dmul
      // 88: dconst_1
      // 89: dadd
      // 8a: d2f
      // 8b: fstore 15
      // 8d: fload 15
      // 8f: aload 6
      // 91: getfield net/minecraft/class_310.field_1687 Lnet/minecraft/class_638;
      // 94: invokevirtual net/minecraft/class_638.method_8407 ()Lnet/minecraft/class_1267;
      // 97: invokestatic qeaa361f143ee4a0894bd168fd9b30c66/qf4ccf8f5435d4a78bdca4d6a018b578e/aaabaaaa.bab (FLnet/minecraft/class_1267;)F
      // 9a: fstore 15
      // 9c: aload 0
      // 9d: invokevirtual net/minecraft/class_1309.method_6096 ()I
      // a0: i2f
      // a1: fstore 16
      // a3: aload 0
      // a4: iload 5
      // a6: ifne bc
      // a9: getstatic net/minecraft/class_5134.field_23725 Lnet/minecraft/class_6880;
      // ac: invokevirtual net/minecraft/class_1309.method_5996 (Lnet/minecraft/class_6880;)Lnet/minecraft/class_1324;
      // af: ifnonnull bb
      // b2: goto b6
      // b5: athrow
      // b6: fconst_0
      // b7: goto c3
      // ba: athrow
      // bb: aload 0
      // bc: getstatic net/minecraft/class_5134.field_23725 Lnet/minecraft/class_6880;
      // bf: invokevirtual net/minecraft/class_1309.method_45325 (Lnet/minecraft/class_6880;)D
      // c2: d2f
      // c3: fstore 17
      // c5: fconst_2
      // c6: fload 17
      // c8: ldc_w 4.0
      // cb: fdiv
      // cc: fadd
      // cd: fstore 18
      // cf: fload 16
      // d1: fload 15
      // d3: fload 18
      // d5: fdiv
      // d6: fsub
      // d7: fload 16
      // d9: ldc_w 0.2
      // dc: fmul
      // dd: ldc_w 20.0
      // e0: invokestatic net/minecraft/class_3532.method_15363 (FFF)F
      // e3: fstore 19
      // e5: fload 15
      // e7: fconst_1
      // e8: fload 19
      // ea: ldc_w 25.0
      // ed: fdiv
      // ee: fsub
      // ef: fmul
      // f0: freturn
   }

   private static boolean abab(class_310 param0, class_243 param1, class_243 param2, class_1297 param3, class_2338 param4, class_2338 param5, class_2680 param6) {
      // $VF: Couldn't be decompiled
      // Please report this to the Vineflower issue tracker, at https://github.com/Vineflower/vineflower/issues with a copy of the class file (if you have the rights to distribute it!)
      // java.lang.RuntimeException: parsing failure!
      //   at org.jetbrains.java.decompiler.modules.decompiler.decompose.DomHelper.parseGraph(DomHelper.java:211)
      //   at org.jetbrains.java.decompiler.main.rels.MethodProcessor.codeToJava(MethodProcessor.java:166)
      //
      // Bytecode:
      // 00: getstatic qeaa361f143ee4a0894bd168fd9b30c66/qf4ccf8f5435d4a78bdca4d6a018b578e/baaabbaa.bba I
      // 03: istore 7
      // 05: aload 5
      // 07: ifnull 25
      // 0a: aload 2
      // 0b: aload 1
      // 0c: aload 5
      // 0e: aload 6
      // 10: invokestatic qeaa361f143ee4a0894bd168fd9b30c66/qf4ccf8f5435d4a78bdca4d6a018b578e/aaabaaaa.aa (Lnet/minecraft/class_243;Lnet/minecraft/class_243;Lnet/minecraft/class_2338;Lnet/minecraft/class_2680;)Z
      // 13: iload 7
      // 15: ifne 24
      // 18: goto 1c
      // 1b: athrow
      // 1c: ifeq 25
      // 1f: goto 23
      // 22: athrow
      // 23: bipush 0
      // 24: ireturn
      // 25: aload 0
      // 26: getfield net/minecraft/class_310.field_1687 Lnet/minecraft/class_638;
      // 29: new net/minecraft/class_3959
      // 2c: dup
      // 2d: aload 2
      // 2e: aload 1
      // 2f: getstatic net/minecraft/class_3959$class_3960.field_17558 Lnet/minecraft/class_3959$class_3960;
      // 32: getstatic net/minecraft/class_3959$class_242.field_1348 Lnet/minecraft/class_3959$class_242;
      // 35: aload 3
      // 36: invokespecial net/minecraft/class_3959.<init> (Lnet/minecraft/class_243;Lnet/minecraft/class_243;Lnet/minecraft/class_3959$class_3960;Lnet/minecraft/class_3959$class_242;Lnet/minecraft/class_1297;)V
      // 39: invokevirtual net/minecraft/class_638.method_17742 (Lnet/minecraft/class_3959;)Lnet/minecraft/class_3965;
      // 3c: astore 8
      // 3e: aload 8
      // 40: invokevirtual net/minecraft/class_3965.method_17783 ()Lnet/minecraft/class_239$class_240;
      // 43: getstatic net/minecraft/class_239$class_240.field_1333 Lnet/minecraft/class_239$class_240;
      // 46: if_acmpne 4c
      // 49: bipush 1
      // 4a: ireturn
      // 4b: athrow
      // 4c: aload 4
      // 4e: iload 7
      // 50: ifne 63
      // 53: ifnull 78
      // 56: goto 5a
      // 59: athrow
      // 5a: aload 8
      // 5c: invokevirtual net/minecraft/class_3965.method_17777 ()Lnet/minecraft/class_2338;
      // 5f: goto 63
      // 62: athrow
      // 63: aload 4
      // 65: invokevirtual net/minecraft/class_2338.equals (Ljava/lang/Object;)Z
      // 68: iload 7
      // 6a: ifne 75
      // 6d: ifeq 78
      // 70: goto 74
      // 73: athrow
      // 74: bipush 1
      // 75: goto 79
      // 78: bipush 0
      // 79: ireturn
   }

   static boolean abba(class_243 var0, class_243 var1, class_2338 var2) {
      return aa(var0, var1, var2, null);
   }

   static float abbb(int var0, int var1) {
      float var2 = 1.0F - class_3532.method_15340(var0, 0, abb(b(-664831836, 25362862 ^ -1934621179), 4806313869040156534L)) / 25.0F;
      if (var1 >= 0) {
         var2 *= Math.max(0, abb(b(-664831829, 25362862 ^ 660444707), 4830103940900114838L) - (var1 + 1) * 5) / 25.0F;
      }

      return var2;
   }

   public static double a(class_1309 param0) {
      // $VF: Couldn't be decompiled
      // Please report this to the Vineflower issue tracker, at https://github.com/Vineflower/vineflower/issues with a copy of the class file (if you have the rights to distribute it!)
      // java.lang.RuntimeException: parsing failure!
      //   at org.jetbrains.java.decompiler.modules.decompiler.decompose.DomHelper.parseGraph(DomHelper.java:211)
      //   at org.jetbrains.java.decompiler.main.rels.MethodProcessor.codeToJava(MethodProcessor.java:166)
      //
      // Bytecode:
      // 000: getstatic qeaa361f143ee4a0894bd168fd9b30c66/qf4ccf8f5435d4a78bdca4d6a018b578e/baaabbaa.bba I
      // 003: istore 1
      // 004: aload 0
      // 005: ifnonnull 00b
      // 008: dconst_0
      // 009: dreturn
      // 00a: athrow
      // 00b: bipush 0
      // 00c: istore 2
      // 00d: getstatic qeaa361f143ee4a0894bd168fd9b30c66/qf4ccf8f5435d4a78bdca4d6a018b578e/aaabaaaa.b [Lnet/minecraft/class_1304;
      // 010: astore 3
      // 011: aload 3
      // 012: arraylength
      // 013: istore 4
      // 015: bipush 0
      // 016: istore 5
      // 018: iload 5
      // 01a: iload 4
      // 01c: if_icmpge 0f6
      // 01f: aload 3
      // 020: iload 5
      // 022: aaload
      // 023: astore 6
      // 025: aload 0
      // 026: iload 1
      // 027: ifne 0f7
      // 02a: aload 6
      // 02c: invokevirtual net/minecraft/class_1309.method_6118 (Lnet/minecraft/class_1304;)Lnet/minecraft/class_1799;
      // 02f: astore 7
      // 031: iload 1
      // 032: ifne 0f2
      // 035: aload 7
      // 037: ifnull 0ef
      // 03a: goto 03e
      // 03d: athrow
      // 03e: aload 7
      // 040: iload 1
      // 041: ifne 069
      // 044: goto 048
      // 047: athrow
      // 048: invokevirtual net/minecraft/class_1799.method_7960 ()Z
      // 04b: ifeq 05a
      // 04e: goto 052
      // 051: athrow
      // 052: iload 1
      // 053: ifeq 0ef
      // 056: goto 05a
      // 059: athrow
      // 05a: aload 7
      // 05c: getstatic net/minecraft/class_9334.field_49633 Lnet/minecraft/class_9331;
      // 05f: getstatic net/minecraft/class_9304.field_49385 Lnet/minecraft/class_9304;
      // 062: invokevirtual net/minecraft/class_1799.method_58695 (Lnet/minecraft/class_9331;Ljava/lang/Object;)Ljava/lang/Object;
      // 065: goto 069
      // 068: athrow
      // 069: checkcast net/minecraft/class_9304
      // 06c: astore 8
      // 06e: aload 8
      // 070: invokevirtual net/minecraft/class_9304.method_57534 ()Ljava/util/Set;
      // 073: invokeinterface java/util/Set.iterator ()Ljava/util/Iterator; 1
      // 078: astore 9
      // 07a: aload 9
      // 07c: invokeinterface java/util/Iterator.hasNext ()Z 1
      // 081: ifeq 0ef
      // 084: aload 9
      // 086: invokeinterface java/util/Iterator.next ()Ljava/lang/Object; 1
      // 08b: checkcast net/minecraft/class_6880
      // 08e: astore 10
      // 090: iload 1
      // 091: ifne 0f2
      // 094: aload 10
      // 096: invokeinterface net/minecraft/class_6880.method_40230 ()Ljava/util/Optional; 1
      // 09b: invokedynamic apply ()Ljava/util/function/Function; bsm=java/lang/invoke/LambdaMetafactory.metafactory (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;Ljava/lang/invoke/MethodType;Ljava/lang/invoke/MethodHandle;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[ (Ljava/lang/Object;)Ljava/lang/Object;, qeaa361f143ee4a0894bd168fd9b30c66/qf4ccf8f5435d4a78bdca4d6a018b578e/aaabaaaa.aaaa (Lnet/minecraft/class_5321;)Ljava/lang/String;, (Lnet/minecraft/class_5321;)Ljava/lang/String; ]
      // 0a0: invokevirtual java/util/Optional.map (Ljava/util/function/Function;)Ljava/util/Optional;
      // 0a3: ldc ""
      // 0a5: invokevirtual java/util/Optional.orElse (Ljava/lang/Object;)Ljava/lang/Object;
      // 0a8: checkcast java/lang/String
      // 0ab: astore 11
      // 0ad: aload 11
      // 0af: ldc_w -664831816
      // 0b2: ldc_w -560970509
      // 0b5: ldc_w 1493541372
      // 0b8: ixor
      // 0b9: invokestatic qeaa361f143ee4a0894bd168fd9b30c66/qf4ccf8f5435d4a78bdca4d6a018b578e/aaabaaaa.b (II)I
      // 0bc: ldc_w -664831809
      // 0bf: ldc_w -560970509
      // 0c2: ldc_w -914766840
      // 0c5: ixor
      // 0c6: invokestatic qeaa361f143ee4a0894bd168fd9b30c66/qf4ccf8f5435d4a78bdca4d6a018b578e/aaabaaaa.b (II)I
      // 0c9: invokestatic qeaa361f143ee4a0894bd168fd9b30c66/qf4ccf8f5435d4a78bdca4d6a018b578e/aaabaaaa.baa (II)Ljava/lang/String;
      // 0cc: invokestatic qeaa361f143ee4a0894bd168fd9b30c66/qf4ccf8f5435d4a78bdca4d6a018b578e/aabbaaaba.abba (Ljava/lang/String;)Ljava/lang/String;
      // 0cf: invokevirtual java/lang/String.equals (Ljava/lang/Object;)Z
      // 0d2: iload 1
      // 0d3: ifne 0ea
      // 0d6: ifeq 0eb
      // 0d9: goto 0dd
      // 0dc: athrow
      // 0dd: iload 2
      // 0de: aload 8
      // 0e0: aload 10
      // 0e2: invokevirtual net/minecraft/class_9304.method_57536 (Lnet/minecraft/class_6880;)I
      // 0e5: iadd
      // 0e6: goto 0ea
      // 0e9: athrow
      // 0ea: istore 2
      // 0eb: iload 1
      // 0ec: ifeq 07a
      // 0ef: iinc 5 1
      // 0f2: iload 1
      // 0f3: ifeq 018
      // 0f6: aload 0
      // 0f7: iload 1
      // 0f8: ifne 10e
      // 0fb: getstatic net/minecraft/class_5134.field_51580 Lnet/minecraft/class_6880;
      // 0fe: invokevirtual net/minecraft/class_1309.method_5996 (Lnet/minecraft/class_6880;)Lnet/minecraft/class_1324;
      // 101: ifnonnull 10d
      // 104: goto 108
      // 107: athrow
      // 108: dconst_0
      // 109: goto 114
      // 10c: athrow
      // 10d: aload 0
      // 10e: getstatic net/minecraft/class_5134.field_51580 Lnet/minecraft/class_6880;
      // 111: invokevirtual net/minecraft/class_1309.method_45325 (Lnet/minecraft/class_6880;)D
      // 114: dstore 3
      // 115: dload 3
      // 116: iload 2
      // 117: i2d
      // 118: ldc2_w 0.15
      // 11b: dmul
      // 11c: invokestatic java/lang/Math.max (DD)D
      // 11f: dconst_0
      // 120: dconst_1
      // 121: invokestatic net/minecraft/class_3532.method_15350 (DDD)D
      // 124: dreturn
   }
}
