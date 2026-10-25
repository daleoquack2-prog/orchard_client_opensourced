package nsc;

import java.io.InputStream;
import java.nio.file.Path;
import java.util.Random;
import java.util.concurrent.CompletableFuture;
import javax.sound.sampled.Clip;
import net.fabricmc.api.EnvType;
import net.fabricmc.api.Environment;
import net.minecraft.class_1297;
import net.minecraft.class_1657;

@Environment(EnvType.CLIENT)
public final class aaabbbbbb extends abbaabbaa {
   private static final ababbbbaa ba;
   private static final int[] ab;
   private static final long[] aaa;
   private static final double aab = 484.0;
   private long aba;
   private static final ababbbbaa abb;
   private int baa;
   private static final ababbbbaa bab;
   private static final long bba;
   private static final long bbb;
   private long aaaa;
   private static final Integer[] aaab;
   private static final ababbbbaa aaba;
   private long aabb;
   private final baabaab abaa;
   private final bababa abab;
   private static final ababbbbaa abba;
   private static final long abbb;
   private final baabaab baaa;
   private int baab;
   private static final ababbbbaa baba;
   private final baaaabaa babb;
   private static final ababbbbaa bbaa;
   private static final String[] abaaa;
   private static final ababbbbaa bbab;
   private static final ababbbbaa bbba;
   private static final ababbbbaa bbbb;
   private class_1657 aaaaa;
   private static final Object[] abaab;
   private static final ababbbbaa aa;
   private final Random aaaab;
   private static final long[] aaaba;
   private static final Long[] bb;
   private static final ababbbbaa aaabb;
   private final Clip[] aabaa;
   private static final ababbbbaa aabab;
   private final Clip[] aabba;
   private int aabbb;

   private Path aa(int param1) {
      // $VF: Couldn't be decompiled
      // Please report this to the Vineflower issue tracker, at https://github.com/Vineflower/vineflower/issues with a copy of the class file (if you have the rights to distribute it!)
      // java.lang.RuntimeException: parsing failure!
      //   at org.jetbrains.java.decompiler.modules.decompiler.decompose.DomHelper.parseGraph(DomHelper.java:211)
      //   at org.jetbrains.java.decompiler.main.rels.MethodProcessor.codeToJava(MethodProcessor.java:166)
      //
      // Bytecode:
      // 00: getstatic qeaa361f143ee4a0894bd168fd9b30c66/qf4ccf8f5435d4a78bdca4d6a018b578e/aabbabbab.ab I
      // 03: istore 2
      // 04: invokestatic qeaa361f143ee4a0894bd168fd9b30c66/qf4ccf8f5435d4a78bdca4d6a018b578e/abaaaaaba.aaaaa ()Lqeaa361f143ee4a0894bd168fd9b30c66/qf4ccf8f5435d4a78bdca4d6a018b578e/abaaaaaba;
      // 07: astore 3
      // 08: aload 3
      // 09: iload 2
      // 0a: ifne 15
      // 0d: ifnull 31
      // 10: goto 14
      // 13: athrow
      // 14: aload 3
      // 15: iload 2
      // 16: ifne 28
      // 19: invokevirtual qeaa361f143ee4a0894bd168fd9b30c66/qf4ccf8f5435d4a78bdca4d6a018b578e/abaaaaaba.aba ()Lqeaa361f143ee4a0894bd168fd9b30c66/qf4ccf8f5435d4a78bdca4d6a018b578e/babaaaa;
      // 1c: ifnull 31
      // 1f: goto 23
      // 22: athrow
      // 23: aload 3
      // 24: goto 28
      // 27: athrow
      // 28: invokevirtual qeaa361f143ee4a0894bd168fd9b30c66/qf4ccf8f5435d4a78bdca4d6a018b578e/abaaaaaba.aba ()Lqeaa361f143ee4a0894bd168fd9b30c66/qf4ccf8f5435d4a78bdca4d6a018b578e/babaaaa;
      // 2b: invokevirtual qeaa361f143ee4a0894bd168fd9b30c66/qf4ccf8f5435d4a78bdca4d6a018b578e/babaaaa.babaa ()Ljava/nio/file/Path;
      // 2e: goto 32
      // 31: aconst_null
      // 32: astore 4
      // 34: aload 4
      // 36: iload 2
      // 37: ifne 54
      // 3a: ifnull a1
      // 3d: goto 41
      // 40: athrow
      // 41: aload 4
      // 43: iload 2
      // 44: ifne a0
      // 47: goto 4b
      // 4a: athrow
      // 4b: invokeinterface java/nio/file/Path.getParent ()Ljava/nio/file/Path; 1
      // 50: goto 54
      // 53: athrow
      // 54: ifnull a1
      // 57: aload 4
      // 59: invokeinterface java/nio/file/Path.getParent ()Ljava/nio/file/Path; 1
      // 5e: getstatic qeaa361f143ee4a0894bd168fd9b30c66/qf4ccf8f5435d4a78bdca4d6a018b578e/aaabbbbbb.bab Lqeaa361f143ee4a0894bd168fd9b30c66/qf4ccf8f5435d4a78bdca4d6a018b578e/ababbbbaa;
      // 61: invokevirtual qeaa361f143ee4a0894bd168fd9b30c66/qf4ccf8f5435d4a78bdca4d6a018b578e/ababbbbaa.abab ()Ljava/lang/String;
      // 64: invokeinterface java/nio/file/Path.resolve (Ljava/lang/String;)Ljava/nio/file/Path; 2
      // 69: getstatic qeaa361f143ee4a0894bd168fd9b30c66/qf4ccf8f5435d4a78bdca4d6a018b578e/aaabbbbbb.aaba Lqeaa361f143ee4a0894bd168fd9b30c66/qf4ccf8f5435d4a78bdca4d6a018b578e/ababbbbaa;
      // 6c: invokevirtual qeaa361f143ee4a0894bd168fd9b30c66/qf4ccf8f5435d4a78bdca4d6a018b578e/ababbbbaa.abab ()Ljava/lang/String;
      // 6f: iload 1
      // 70: bipush 1
      // 71: iadd
      // 72: getstatic qeaa361f143ee4a0894bd168fd9b30c66/qf4ccf8f5435d4a78bdca4d6a018b578e/aaabbbbbb.bbaa Lqeaa361f143ee4a0894bd168fd9b30c66/qf4ccf8f5435d4a78bdca4d6a018b578e/ababbbbaa;
      // 75: invokevirtual qeaa361f143ee4a0894bd168fd9b30c66/qf4ccf8f5435d4a78bdca4d6a018b578e/ababbbbaa.abab ()Ljava/lang/String;
      // 78: astore 7
      // 7a: istore 6
      // 7c: astore 5
      // 7e: new java/lang/StringBuilder
      // 81: dup
      // 82: invokespecial java/lang/StringBuilder.<init> ()V
      // 85: aload 5
      // 87: invokevirtual java/lang/StringBuilder.append (Ljava/lang/Object;)Ljava/lang/StringBuilder;
      // 8a: iload 6
      // 8c: invokevirtual java/lang/StringBuilder.append (I)Ljava/lang/StringBuilder;
      // 8f: aload 7
      // 91: invokevirtual java/lang/StringBuilder.append (Ljava/lang/Object;)Ljava/lang/StringBuilder;
      // 94: invokevirtual java/lang/StringBuilder.toString ()Ljava/lang/String;
      // 97: invokeinterface java/nio/file/Path.resolve (Ljava/lang/String;)Ljava/nio/file/Path; 2
      // 9c: goto a0
      // 9f: athrow
      // a0: areturn
      // a1: goto a5
      // a4: astore 3
      // a5: aconst_null
      // a6: areturn
   }

   private void ab(int param1, double param2) {
      // $VF: Couldn't be decompiled
      // Please report this to the Vineflower issue tracker, at https://github.com/Vineflower/vineflower/issues with a copy of the class file (if you have the rights to distribute it!)
      // java.lang.RuntimeException: parsing failure!
      //   at org.jetbrains.java.decompiler.modules.decompiler.decompose.DomHelper.parseGraph(DomHelper.java:211)
      //   at org.jetbrains.java.decompiler.main.rels.MethodProcessor.codeToJava(MethodProcessor.java:166)
      //
      // Bytecode:
      // 000: getstatic qeaa361f143ee4a0894bd168fd9b30c66/qf4ccf8f5435d4a78bdca4d6a018b578e/aabbabbab.ab I
      // 003: istore 4
      // 005: aload 0
      // 006: getfield qeaa361f143ee4a0894bd168fd9b30c66/qf4ccf8f5435d4a78bdca4d6a018b578e/aaabbbbbb.aabaa [Ljavax/sound/sampled/Clip;
      // 009: iload 1
      // 00a: aaload
      // 00b: astore 5
      // 00d: aload 5
      // 00f: iload 4
      // 011: ifne 01d
      // 014: ifnull 02e
      // 017: goto 01b
      // 01a: athrow
      // 01b: aload 5
      // 01d: iload 4
      // 01f: ifne 0f4
      // 022: invokeinterface javax/sound/sampled/Clip.isOpen ()Z 1
      // 027: ifne 0f2
      // 02a: goto 02e
      // 02d: athrow
      // 02e: aload 0
      // 02f: iload 1
      // 030: invokevirtual qeaa361f143ee4a0894bd168fd9b30c66/qf4ccf8f5435d4a78bdca4d6a018b578e/aaabbbbbb.abb (I)Ljava/io/InputStream;
      // 033: astore 6
      // 035: aload 6
      // 037: iload 4
      // 039: ifne 0ba
      // 03c: ifnull 0b8
      // 03f: goto 043
      // 042: athrow
      // 043: new java/io/BufferedInputStream
      // 046: dup
      // 047: aload 6
      // 049: invokespecial java/io/BufferedInputStream.<init> (Ljava/io/InputStream;)V
      // 04c: invokestatic javax/sound/sampled/AudioSystem.getAudioInputStream (Ljava/io/InputStream;)Ljavax/sound/sampled/AudioInputStream;
      // 04f: astore 7
      // 051: invokestatic javax/sound/sampled/AudioSystem.getClip ()Ljavax/sound/sampled/Clip;
      // 054: astore 5
      // 056: aload 5
      // 058: aload 7
      // 05a: invokeinterface javax/sound/sampled/Clip.open (Ljavax/sound/sampled/AudioInputStream;)V 2
      // 05f: aload 0
      // 060: getfield qeaa361f143ee4a0894bd168fd9b30c66/qf4ccf8f5435d4a78bdca4d6a018b578e/aaabbbbbb.aabaa [Ljavax/sound/sampled/Clip;
      // 063: dup
      // 064: astore 8
      // 066: monitorenter
      // 067: aload 0
      // 068: getfield qeaa361f143ee4a0894bd168fd9b30c66/qf4ccf8f5435d4a78bdca4d6a018b578e/aaabbbbbb.aabaa [Ljavax/sound/sampled/Clip;
      // 06b: iload 1
      // 06c: aload 5
      // 06e: aastore
      // 06f: aload 8
      // 071: monitorexit
      // 072: goto 07d
      // 075: astore 9
      // 077: aload 8
      // 079: monitorexit
      // 07a: aload 9
      // 07c: athrow
      // 07d: aload 7
      // 07f: iload 4
      // 081: ifne 0ba
      // 084: ifnull 0b8
      // 087: goto 08b
      // 08a: athrow
      // 08b: aload 7
      // 08d: invokevirtual javax/sound/sampled/AudioInputStream.close ()V
      // 090: goto 0b8
      // 093: athrow
      // 094: astore 8
      // 096: iload 4
      // 098: ifne 0a9
      // 09b: aload 7
      // 09d: ifnull 0b5
      // 0a0: goto 0a4
      // 0a3: athrow
      // 0a4: aload 7
      // 0a6: invokevirtual javax/sound/sampled/AudioInputStream.close ()V
      // 0a9: goto 0b5
      // 0ac: astore 9
      // 0ae: aload 8
      // 0b0: aload 9
      // 0b2: invokevirtual java/lang/Throwable.addSuppressed (Ljava/lang/Throwable;)V
      // 0b5: aload 8
      // 0b7: athrow
      // 0b8: aload 6
      // 0ba: iload 4
      // 0bc: ifne 0c8
      // 0bf: ifnull 0f2
      // 0c2: goto 0c6
      // 0c5: athrow
      // 0c6: aload 6
      // 0c8: invokevirtual java/io/InputStream.close ()V
      // 0cb: goto 0f2
      // 0ce: astore 7
      // 0d0: iload 4
      // 0d2: ifne 0e3
      // 0d5: aload 6
      // 0d7: ifnull 0ef
      // 0da: goto 0de
      // 0dd: athrow
      // 0de: aload 6
      // 0e0: invokevirtual java/io/InputStream.close ()V
      // 0e3: goto 0ef
      // 0e6: astore 8
      // 0e8: aload 7
      // 0ea: aload 8
      // 0ec: invokevirtual java/lang/Throwable.addSuppressed (Ljava/lang/Throwable;)V
      // 0ef: aload 7
      // 0f1: athrow
      // 0f2: aload 5
      // 0f4: iload 4
      // 0f6: ifne 102
      // 0f9: ifnull 19b
      // 0fc: goto 100
      // 0ff: athrow
      // 100: aload 5
      // 102: iload 4
      // 104: ifne 119
      // 107: invokeinterface javax/sound/sampled/Clip.isOpen ()Z 1
      // 10c: ifeq 19b
      // 10f: goto 113
      // 112: athrow
      // 113: aload 5
      // 115: goto 119
      // 118: athrow
      // 119: iload 4
      // 11b: ifne 148
      // 11e: invokeinterface javax/sound/sampled/Clip.isRunning ()Z 1
      // 123: ifeq 135
      // 126: goto 12a
      // 129: athrow
      // 12a: aload 5
      // 12c: invokeinterface javax/sound/sampled/Clip.stop ()V 1
      // 131: goto 135
      // 134: athrow
      // 135: aload 5
      // 137: iload 4
      // 139: ifne 196
      // 13c: bipush 0
      // 13d: invokeinterface javax/sound/sampled/Clip.setFramePosition (I)V 2
      // 142: aload 5
      // 144: goto 148
      // 147: athrow
      // 148: getstatic javax/sound/sampled/FloatControl$Type.MASTER_GAIN Ljavax/sound/sampled/FloatControl$Type;
      // 14b: invokeinterface javax/sound/sampled/Clip.isControlSupported (Ljavax/sound/sampled/Control$Type;)Z 2
      // 150: ifeq 194
      // 153: aload 5
      // 155: getstatic javax/sound/sampled/FloatControl$Type.MASTER_GAIN Ljavax/sound/sampled/FloatControl$Type;
      // 158: invokeinterface javax/sound/sampled/Clip.getControl (Ljavax/sound/sampled/Control$Type;)Ljavax/sound/sampled/Control; 2
      // 15d: checkcast javax/sound/sampled/FloatControl
      // 160: astore 6
      // 162: ldc2_w 1.0E-4
      // 165: dload 2
      // 166: ldc2_w 100.0
      // 169: ddiv
      // 16a: invokestatic java/lang/Math.max (DD)D
      // 16d: d2f
      // 16e: fstore 7
      // 170: fload 7
      // 172: f2d
      // 173: invokestatic java/lang/Math.log10 (D)D
      // 176: ldc2_w 20.0
      // 179: dmul
      // 17a: d2f
      // 17b: fstore 8
      // 17d: aload 6
      // 17f: aload 6
      // 181: invokevirtual javax/sound/sampled/FloatControl.getMinimum ()F
      // 184: aload 6
      // 186: invokevirtual javax/sound/sampled/FloatControl.getMaximum ()F
      // 189: fload 8
      // 18b: invokestatic java/lang/Math.min (FF)F
      // 18e: invokestatic java/lang/Math.max (FF)F
      // 191: invokevirtual javax/sound/sampled/FloatControl.setValue (F)V
      // 194: aload 5
      // 196: invokeinterface javax/sound/sampled/Clip.start ()V 1
      // 19b: goto 1a0
      // 19e: astore 5
      // 1a0: return
   }

   private static int a(int var0, int var1) {
      int var2 = ab[var0 ^ -1715322246] ^ var1 ^ var0;
      var2 ^= 32418;
      var2 += 28968;
      var2 += 42646;
      var2 -= 30141;
      var2 -= 62118;
      return var2 - 26194;
   }

   private void ba(int var1, double var2) {
      CompletableFuture.runAsync(this::aab);
   }

   private void bb(int param1) {
      // $VF: Couldn't be decompiled
      // Please report this to the Vineflower issue tracker, at https://github.com/Vineflower/vineflower/issues with a copy of the class file (if you have the rights to distribute it!)
      // java.lang.RuntimeException: parsing failure!
      //   at org.jetbrains.java.decompiler.modules.decompiler.decompose.DomHelper.parseGraph(DomHelper.java:211)
      //   at org.jetbrains.java.decompiler.main.rels.MethodProcessor.codeToJava(MethodProcessor.java:166)
      //
      // Bytecode:
      // 000: getstatic qeaa361f143ee4a0894bd168fd9b30c66/qf4ccf8f5435d4a78bdca4d6a018b578e/aabbabbab.ab I
      // 003: invokestatic java/lang/System.currentTimeMillis ()J
      // 006: lstore 3
      // 007: istore 2
      // 008: iload 1
      // 009: iload 2
      // 00a: ifne 07f
      // 00d: ldc -1715322246
      // 00f: ldc_w 1342571063
      // 012: ldc_w -1950453303
      // 015: ixor
      // 016: invokestatic qeaa361f143ee4a0894bd168fd9b30c66/qf4ccf8f5435d4a78bdca4d6a018b578e/aaabbbbbb.a (II)I
      // 019: ldc2_w 4480347028943553863
      // 01c: invokestatic qeaa361f143ee4a0894bd168fd9b30c66/qf4ccf8f5435d4a78bdca4d6a018b578e/aaabbbbbb.bab (IJ)I
      // 01f: if_icmpeq 065
      // 022: goto 026
      // 025: athrow
      // 026: aload 0
      // 027: getfield qeaa361f143ee4a0894bd168fd9b30c66/qf4ccf8f5435d4a78bdca4d6a018b578e/aaabbbbbb.baa I
      // 02a: iload 2
      // 02b: ifne 07f
      // 02e: goto 032
      // 031: athrow
      // 032: iload 1
      // 033: if_icmpne 065
      // 036: goto 03a
      // 039: athrow
      // 03a: lload 3
      // 03b: aload 0
      // 03c: getfield qeaa361f143ee4a0894bd168fd9b30c66/qf4ccf8f5435d4a78bdca4d6a018b578e/aaabbbbbb.aaaa J
      // 03f: iload 2
      // 040: ifne 07e
      // 043: goto 047
      // 046: athrow
      // 047: lsub
      // 048: ldc_w -1715322245
      // 04b: ldc_w 1342571063
      // 04e: ldc_w 270869030
      // 051: ixor
      // 052: invokestatic qeaa361f143ee4a0894bd168fd9b30c66/qf4ccf8f5435d4a78bdca4d6a018b578e/aaabbbbbb.a (II)I
      // 055: ldc2_w 1821877852122087292
      // 058: invokestatic qeaa361f143ee4a0894bd168fd9b30c66/qf4ccf8f5435d4a78bdca4d6a018b578e/aaabbbbbb.bbb (IJ)J
      // 05b: lcmp
      // 05c: ifge 065
      // 05f: goto 063
      // 062: athrow
      // 063: return
      // 064: athrow
      // 065: lload 3
      // 066: aload 0
      // 067: getfield qeaa361f143ee4a0894bd168fd9b30c66/qf4ccf8f5435d4a78bdca4d6a018b578e/aaabbbbbb.aabb J
      // 06a: lsub
      // 06b: ldc_w -1715322248
      // 06e: ldc_w 1342571063
      // 071: ldc_w 1631164151
      // 074: ixor
      // 075: invokestatic qeaa361f143ee4a0894bd168fd9b30c66/qf4ccf8f5435d4a78bdca4d6a018b578e/aaabbbbbb.a (II)I
      // 078: ldc2_w 5142343625598992052
      // 07b: invokestatic qeaa361f143ee4a0894bd168fd9b30c66/qf4ccf8f5435d4a78bdca4d6a018b578e/aaabbbbbb.bbb (IJ)J
      // 07e: lcmp
      // 07f: ifge 083
      // 082: return
      // 083: aload 0
      // 084: iload 1
      // 085: putfield qeaa361f143ee4a0894bd168fd9b30c66/qf4ccf8f5435d4a78bdca4d6a018b578e/aaabbbbbb.baa I
      // 088: aload 0
      // 089: lload 3
      // 08a: putfield qeaa361f143ee4a0894bd168fd9b30c66/qf4ccf8f5435d4a78bdca4d6a018b578e/aaabbbbbb.aaaa J
      // 08d: aload 0
      // 08e: lload 3
      // 08f: putfield qeaa361f143ee4a0894bd168fd9b30c66/qf4ccf8f5435d4a78bdca4d6a018b578e/aaabbbbbb.aabb J
      // 092: aload 0
      // 093: getfield qeaa361f143ee4a0894bd168fd9b30c66/qf4ccf8f5435d4a78bdca4d6a018b578e/aaabbbbbb.abab Lqeaa361f143ee4a0894bd168fd9b30c66/qf4ccf8f5435d4a78bdca4d6a018b578e/bababa;
      // 096: invokevirtual qeaa361f143ee4a0894bd168fd9b30c66/qf4ccf8f5435d4a78bdca4d6a018b578e/bababa.abbb ()Ljava/lang/Object;
      // 099: checkcast java/lang/Double
      // 09c: invokevirtual java/lang/Double.doubleValue ()D
      // 09f: dstore 5
      // 0a1: dload 5
      // 0a3: dconst_0
      // 0a4: dcmpg
      // 0a5: ifgt 0aa
      // 0a8: return
      // 0a9: athrow
      // 0aa: aload 0
      // 0ab: getfield qeaa361f143ee4a0894bd168fd9b30c66/qf4ccf8f5435d4a78bdca4d6a018b578e/aaabbbbbb.baaa Lqeaa361f143ee4a0894bd168fd9b30c66/qf4ccf8f5435d4a78bdca4d6a018b578e/baabaab;
      // 0ae: invokevirtual qeaa361f143ee4a0894bd168fd9b30c66/qf4ccf8f5435d4a78bdca4d6a018b578e/baabaab.abbb ()Ljava/lang/Object;
      // 0b1: checkcast qeaa361f143ee4a0894bd168fd9b30c66/qf4ccf8f5435d4a78bdca4d6a018b578e/ababbaba
      // 0b4: astore 7
      // 0b6: aload 0
      // 0b7: getfield qeaa361f143ee4a0894bd168fd9b30c66/qf4ccf8f5435d4a78bdca4d6a018b578e/aaabbbbbb.abaa Lqeaa361f143ee4a0894bd168fd9b30c66/qf4ccf8f5435d4a78bdca4d6a018b578e/baabaab;
      // 0ba: invokevirtual qeaa361f143ee4a0894bd168fd9b30c66/qf4ccf8f5435d4a78bdca4d6a018b578e/baabaab.abbb ()Ljava/lang/Object;
      // 0bd: checkcast qeaa361f143ee4a0894bd168fd9b30c66/qf4ccf8f5435d4a78bdca4d6a018b578e/aabbbbba
      // 0c0: astore 8
      // 0c2: aload 7
      // 0c4: getstatic qeaa361f143ee4a0894bd168fd9b30c66/qf4ccf8f5435d4a78bdca4d6a018b578e/ababbaba.aa Lqeaa361f143ee4a0894bd168fd9b30c66/qf4ccf8f5435d4a78bdca4d6a018b578e/ababbaba;
      // 0c7: if_acmpne 11f
      // 0ca: aload 8
      // 0cc: invokevirtual qeaa361f143ee4a0894bd168fd9b30c66/qf4ccf8f5435d4a78bdca4d6a018b578e/aabbbbba.ordinal ()I
      // 0cf: tableswitch 34 0 4 61 45 49 53 57
      // 0f0: athrow
      // 0f1: new java/lang/MatchException
      // 0f4: dup
      // 0f5: aconst_null
      // 0f6: aconst_null
      // 0f7: invokespecial java/lang/MatchException.<init> (Ljava/lang/String;Ljava/lang/Throwable;)V
      // 0fa: athrow
      // 0fb: athrow
      // 0fc: bipush 0
      // 0fd: goto 114
      // 100: bipush 1
      // 101: goto 114
      // 104: bipush 0
      // 105: goto 114
      // 108: bipush 1
      // 109: goto 114
      // 10c: aload 0
      // 10d: getfield qeaa361f143ee4a0894bd168fd9b30c66/qf4ccf8f5435d4a78bdca4d6a018b578e/aaabbbbbb.aaaab Ljava/util/Random;
      // 110: bipush 2
      // 111: invokevirtual java/util/Random.nextInt (I)I
      // 114: istore 9
      // 116: aload 0
      // 117: iload 9
      // 119: dload 5
      // 11b: invokevirtual qeaa361f143ee4a0894bd168fd9b30c66/qf4ccf8f5435d4a78bdca4d6a018b578e/aaabbbbbb.ba (ID)V
      // 11e: return
      // 11f: aload 8
      // 121: invokevirtual qeaa361f143ee4a0894bd168fd9b30c66/qf4ccf8f5435d4a78bdca4d6a018b578e/aabbbbba.ordinal ()I
      // 124: tableswitch 36 0 4 63 47 51 55 59
      // 148: new java/lang/MatchException
      // 14b: dup
      // 14c: aconst_null
      // 14d: aconst_null
      // 14e: invokespecial java/lang/MatchException.<init> (Ljava/lang/String;Ljava/lang/Throwable;)V
      // 151: athrow
      // 152: athrow
      // 153: bipush 0
      // 154: goto 16b
      // 157: bipush 1
      // 158: goto 16b
      // 15b: bipush 2
      // 15c: goto 16b
      // 15f: bipush 3
      // 160: goto 16b
      // 163: aload 0
      // 164: getfield qeaa361f143ee4a0894bd168fd9b30c66/qf4ccf8f5435d4a78bdca4d6a018b578e/aaabbbbbb.aaaab Ljava/util/Random;
      // 167: bipush 4
      // 168: invokevirtual java/util/Random.nextInt (I)I
      // 16b: istore 9
      // 16d: aload 0
      // 16e: iload 9
      // 170: dload 5
      // 172: invokevirtual qeaa361f143ee4a0894bd168fd9b30c66/qf4ccf8f5435d4a78bdca4d6a018b578e/aaabbbbbb.aaba (ID)V
      // 175: return
   }

   @Override
   public void aabaa() {
      this.aaaaa = null;
      this.aabbb = bab(a(-1715322247, 934012717 ^ 1785651912), 4861292494678514042L);
      this.baab = bab(a(-1715322242, 934012717 ^ 410601866), 4861292494678514042L);
      this.aba = 0L;
      this.baa = bab(a(-1715322241, 934012717 ^ 1561343097), 4861292494678514042L);
      this.aaaa = 0L;
      this.aabb = 0L;
      this.aaab();
      this.aaa();
   }

   private void aaa() {
      // $VF: Couldn't be decompiled
      // Please report this to the Vineflower issue tracker, at https://github.com/Vineflower/vineflower/issues with a copy of the class file (if you have the rights to distribute it!)
      // java.lang.RuntimeException: parsing failure!
      //   at org.jetbrains.java.decompiler.modules.decompiler.decompose.DomHelper.parseGraph(DomHelper.java:211)
      //   at org.jetbrains.java.decompiler.main.rels.MethodProcessor.codeToJava(MethodProcessor.java:166)
      //
      // Bytecode:
      // 00: getstatic qeaa361f143ee4a0894bd168fd9b30c66/qf4ccf8f5435d4a78bdca4d6a018b578e/aabbabbab.ab I
      // 03: aload 0
      // 04: getfield qeaa361f143ee4a0894bd168fd9b30c66/qf4ccf8f5435d4a78bdca4d6a018b578e/aaabbbbbb.aabba [Ljavax/sound/sampled/Clip;
      // 07: dup
      // 08: astore 2
      // 09: monitorenter
      // 0a: istore 1
      // 0b: bipush 0
      // 0c: istore 3
      // 0d: iload 3
      // 0e: aload 0
      // 0f: getfield qeaa361f143ee4a0894bd168fd9b30c66/qf4ccf8f5435d4a78bdca4d6a018b578e/aaabbbbbb.aabba [Ljavax/sound/sampled/Clip;
      // 12: arraylength
      // 13: if_icmpge 6d
      // 16: aload 0
      // 17: getfield qeaa361f143ee4a0894bd168fd9b30c66/qf4ccf8f5435d4a78bdca4d6a018b578e/aaabbbbbb.aabba [Ljavax/sound/sampled/Clip;
      // 1a: iload 3
      // 1b: aaload
      // 1c: astore 4
      // 1e: iload 1
      // 1f: ifne 6f
      // 22: iload 1
      // 23: ifne 69
      // 26: goto 2a
      // 29: athrow
      // 2a: aload 4
      // 2c: ifnull 66
      // 2f: goto 33
      // 32: athrow
      // 33: aload 4
      // 35: iload 1
      // 36: ifne 52
      // 39: invokeinterface javax/sound/sampled/Clip.isRunning ()Z 1
      // 3e: ifeq 50
      // 41: goto 45
      // 44: athrow
      // 45: aload 4
      // 47: invokeinterface javax/sound/sampled/Clip.stop ()V 1
      // 4c: goto 50
      // 4f: athrow
      // 50: aload 4
      // 52: invokeinterface javax/sound/sampled/Clip.close ()V 1
      // 57: goto 5f
      // 5a: astore 5
      // 5c: aload 5
      // 5e: pop
      // 5f: aload 0
      // 60: getfield qeaa361f143ee4a0894bd168fd9b30c66/qf4ccf8f5435d4a78bdca4d6a018b578e/aaabbbbbb.aabba [Ljavax/sound/sampled/Clip;
      // 63: iload 3
      // 64: aconst_null
      // 65: aastore
      // 66: iinc 3 1
      // 69: iload 1
      // 6a: ifeq 0d
      // 6d: aload 2
      // 6e: monitorexit
      // 6f: goto 79
      // 72: astore 6
      // 74: aload 2
      // 75: monitorexit
      // 76: aload 6
      // 78: athrow
      // 79: return
   }

   @Override
   public String ababa() {
      return ((ababbaba)this.baaa.abbb()).toString();
   }

   @Override
   public void bbaa() {
      // $VF: Couldn't be decompiled
      // Please report this to the Vineflower issue tracker, at https://github.com/Vineflower/vineflower/issues with a copy of the class file (if you have the rights to distribute it!)
      // java.lang.NullPointerException: Cannot invoke "org.jetbrains.java.decompiler.code.cfg.ExceptionRangeCFG.isCircular()" because "range" is null
      //   at org.jetbrains.java.decompiler.modules.decompiler.decompose.DomHelper.graphToStatement(DomHelper.java:84)
      //   at org.jetbrains.java.decompiler.modules.decompiler.decompose.DomHelper.parseGraph(DomHelper.java:203)
      //   at org.jetbrains.java.decompiler.main.rels.MethodProcessor.codeToJava(MethodProcessor.java:166)
      //
      // Bytecode:
      // 000: getstatic qeaa361f143ee4a0894bd168fd9b30c66/qf4ccf8f5435d4a78bdca4d6a018b578e/aabbabbab.ab I
      // 003: istore 1
      // 004: aload 0
      // 005: invokevirtual qeaa361f143ee4a0894bd168fd9b30c66/qf4ccf8f5435d4a78bdca4d6a018b578e/aaabbbbbb.babbaab ()Z
      // 008: ifne 00d
      // 00b: return
      // 00c: athrow
      // 00d: invokestatic net/minecraft/class_310.method_1551 ()Lnet/minecraft/class_310;
      // 010: astore 2
      // 011: aload 2
      // 012: iload 1
      // 013: ifne 01e
      // 016: ifnull 068
      // 019: goto 01d
      // 01c: athrow
      // 01d: aload 2
      // 01e: iload 1
      // 01f: ifne 031
      // 022: getfield net/minecraft/class_310.field_1724 Lnet/minecraft/class_746;
      // 025: ifnull 068
      // 028: goto 02c
      // 02b: athrow
      // 02c: aload 2
      // 02d: goto 031
      // 030: athrow
      // 031: getfield net/minecraft/class_310.field_1724 Lnet/minecraft/class_746;
      // 034: iload 1
      // 035: ifne 052
      // 038: invokevirtual net/minecraft/class_746.method_5805 ()Z
      // 03b: ifeq 068
      // 03e: goto 042
      // 041: athrow
      // 042: aload 2
      // 043: iload 1
      // 044: ifne 05d
      // 047: goto 04b
      // 04a: athrow
      // 04b: getfield net/minecraft/class_310.field_1724 Lnet/minecraft/class_746;
      // 04e: goto 052
      // 051: athrow
      // 052: invokevirtual net/minecraft/class_746.method_29504 ()Z
      // 055: ifne 068
      // 058: aload 2
      // 059: goto 05d
      // 05c: athrow
      // 05d: getfield net/minecraft/class_310.field_1724 Lnet/minecraft/class_746;
      // 060: invokevirtual net/minecraft/class_746.method_6032 ()F
      // 063: fconst_0
      // 064: fcmpg
      // 065: ifgt 06a
      // 068: return
      // 069: athrow
      // 06a: aload 0
      // 06b: iload 1
      // 06c: ifne 07f
      // 06f: getfield qeaa361f143ee4a0894bd168fd9b30c66/qf4ccf8f5435d4a78bdca4d6a018b578e/aaabbbbbb.babb Lqeaa361f143ee4a0894bd168fd9b30c66/qf4ccf8f5435d4a78bdca4d6a018b578e/baaaabaa;
      // 072: ifnonnull 07e
      // 075: goto 079
      // 078: athrow
      // 079: aconst_null
      // 07a: goto 085
      // 07d: athrow
      // 07e: aload 0
      // 07f: getfield qeaa361f143ee4a0894bd168fd9b30c66/qf4ccf8f5435d4a78bdca4d6a018b578e/aaabbbbbb.babb Lqeaa361f143ee4a0894bd168fd9b30c66/qf4ccf8f5435d4a78bdca4d6a018b578e/baaaabaa;
      // 082: invokevirtual qeaa361f143ee4a0894bd168fd9b30c66/qf4ccf8f5435d4a78bdca4d6a018b578e/baaaabaa.bba ()Lnet/minecraft/class_1309;
      // 085: astore 3
      // 086: aload 3
      // 087: iload 1
      // 088: ifne 09a
      // 08b: instanceof net/minecraft/class_1657
      // 08e: ifeq 0c3
      // 091: goto 095
      // 094: athrow
      // 095: aload 3
      // 096: goto 09a
      // 099: athrow
      // 09a: checkcast net/minecraft/class_1657
      // 09d: iload 1
      // 09e: ifne 0d3
      // 0a1: astore 4
      // 0a3: aload 0
      // 0a4: aload 4
      // 0a6: invokevirtual qeaa361f143ee4a0894bd168fd9b30c66/qf4ccf8f5435d4a78bdca4d6a018b578e/aaabbbbbb.aba (Lnet/minecraft/class_1657;)Z
      // 0a9: ifne 0c3
      // 0ac: aload 0
      // 0ad: aload 4
      // 0af: putfield qeaa361f143ee4a0894bd168fd9b30c66/qf4ccf8f5435d4a78bdca4d6a018b578e/aaabbbbbb.aaaaa Lnet/minecraft/class_1657;
      // 0b2: iload 1
      // 0b3: aload 0
      // 0b4: aload 4
      // 0b6: invokevirtual net/minecraft/class_1657.method_5628 ()I
      // 0b9: putfield qeaa361f143ee4a0894bd168fd9b30c66/qf4ccf8f5435d4a78bdca4d6a018b578e/aaabbbbbb.aabbb I
      // 0bc: ifeq 141
      // 0bf: goto 0c3
      // 0c2: athrow
      // 0c3: aload 0
      // 0c4: iload 1
      // 0c5: ifne 142
      // 0c8: goto 0cc
      // 0cb: athrow
      // 0cc: getfield qeaa361f143ee4a0894bd168fd9b30c66/qf4ccf8f5435d4a78bdca4d6a018b578e/aaabbbbbb.aaaaa Lnet/minecraft/class_1657;
      // 0cf: goto 0d3
      // 0d2: athrow
      // 0d3: ifnull 141
      // 0d6: aload 0
      // 0d7: getfield qeaa361f143ee4a0894bd168fd9b30c66/qf4ccf8f5435d4a78bdca4d6a018b578e/aaabbbbbb.aaaaa Lnet/minecraft/class_1657;
      // 0da: invokevirtual net/minecraft/class_1657.method_5805 ()Z
      // 0dd: iload 1
      // 0de: ifne 12d
      // 0e1: goto 0e5
      // 0e4: athrow
      // 0e5: ifeq 11a
      // 0e8: goto 0ec
      // 0eb: athrow
      // 0ec: aload 0
      // 0ed: getfield qeaa361f143ee4a0894bd168fd9b30c66/qf4ccf8f5435d4a78bdca4d6a018b578e/aaabbbbbb.aaaaa Lnet/minecraft/class_1657;
      // 0f0: invokevirtual net/minecraft/class_1657.method_29504 ()Z
      // 0f3: iload 1
      // 0f4: ifne 12d
      // 0f7: goto 0fb
      // 0fa: athrow
      // 0fb: ifne 11a
      // 0fe: goto 102
      // 101: athrow
      // 102: aload 0
      // 103: iload 1
      // 104: ifne 13d
      // 107: goto 10b
      // 10a: athrow
      // 10b: getfield qeaa361f143ee4a0894bd168fd9b30c66/qf4ccf8f5435d4a78bdca4d6a018b578e/aaabbbbbb.aaaaa Lnet/minecraft/class_1657;
      // 10e: invokevirtual net/minecraft/class_1657.method_6032 ()F
      // 111: fconst_0
      // 112: fcmpg
      // 113: ifgt 13c
      // 116: goto 11a
      // 119: athrow
      // 11a: aload 2
      // 11b: getfield net/minecraft/class_310.field_1724 Lnet/minecraft/class_746;
      // 11e: aload 0
      // 11f: getfield qeaa361f143ee4a0894bd168fd9b30c66/qf4ccf8f5435d4a78bdca4d6a018b578e/aaabbbbbb.aaaaa Lnet/minecraft/class_1657;
      // 122: invokevirtual net/minecraft/class_746.method_5858 (Lnet/minecraft/class_1297;)D
      // 125: ldc2_w 484.0
      // 128: dcmpg
      // 129: goto 12d
      // 12c: athrow
      // 12d: ifgt 13c
      // 130: aload 0
      // 131: aload 0
      // 132: getfield qeaa361f143ee4a0894bd168fd9b30c66/qf4ccf8f5435d4a78bdca4d6a018b578e/aaabbbbbb.aabbb I
      // 135: invokevirtual qeaa361f143ee4a0894bd168fd9b30c66/qf4ccf8f5435d4a78bdca4d6a018b578e/aaabbbbbb.bb (I)V
      // 138: goto 13c
      // 13b: athrow
      // 13c: aload 0
      // 13d: aconst_null
      // 13e: putfield qeaa361f143ee4a0894bd168fd9b30c66/qf4ccf8f5435d4a78bdca4d6a018b578e/aaabbbbbb.aaaaa Lnet/minecraft/class_1657;
      // 141: aload 0
      // 142: iload 1
      // 143: ifne 156
      // 146: getfield qeaa361f143ee4a0894bd168fd9b30c66/qf4ccf8f5435d4a78bdca4d6a018b578e/aaabbbbbb.babb Lqeaa361f143ee4a0894bd168fd9b30c66/qf4ccf8f5435d4a78bdca4d6a018b578e/baaaabaa;
      // 149: ifnonnull 155
      // 14c: goto 150
      // 14f: athrow
      // 150: aconst_null
      // 151: goto 15c
      // 154: athrow
      // 155: aload 0
      // 156: getfield qeaa361f143ee4a0894bd168fd9b30c66/qf4ccf8f5435d4a78bdca4d6a018b578e/aaabbbbbb.babb Lqeaa361f143ee4a0894bd168fd9b30c66/qf4ccf8f5435d4a78bdca4d6a018b578e/baaaabaa;
      // 159: invokevirtual qeaa361f143ee4a0894bd168fd9b30c66/qf4ccf8f5435d4a78bdca4d6a018b578e/baaaabaa.bbb ()Lnet/minecraft/class_1309;
      // 15c: astore 4
      // 15e: aload 4
      // 160: iload 1
      // 161: ifne 174
      // 164: instanceof net/minecraft/class_1657
      // 167: ifeq 208
      // 16a: goto 16e
      // 16d: athrow
      // 16e: aload 4
      // 170: goto 174
      // 173: athrow
      // 174: checkcast net/minecraft/class_1657
      // 177: astore 5
      // 179: aload 0
      // 17a: aload 5
      // 17c: invokevirtual qeaa361f143ee4a0894bd168fd9b30c66/qf4ccf8f5435d4a78bdca4d6a018b578e/aaabbbbbb.aba (Lnet/minecraft/class_1657;)Z
      // 17f: iload 1
      // 180: ifne 19b
      // 183: ifne 208
      // 186: goto 18a
      // 189: athrow
      // 18a: aload 5
      // 18c: iload 1
      // 18d: ifne 1a0
      // 190: goto 194
      // 193: athrow
      // 194: invokevirtual net/minecraft/class_1657.method_5805 ()Z
      // 197: goto 19b
      // 19a: athrow
      // 19b: ifeq 1bc
      // 19e: aload 5
      // 1a0: iload 1
      // 1a1: ifne 1b4
      // 1a4: invokevirtual net/minecraft/class_1657.method_29504 ()Z
      // 1a7: ifne 1bc
      // 1aa: goto 1ae
      // 1ad: athrow
      // 1ae: aload 5
      // 1b0: goto 1b4
      // 1b3: athrow
      // 1b4: invokevirtual net/minecraft/class_1657.method_6032 ()F
      // 1b7: fconst_0
      // 1b8: fcmpg
      // 1b9: ifgt 208
      // 1bc: invokestatic java/lang/System.currentTimeMillis ()J
      // 1bf: lstore 6
      // 1c1: lload 6
      // 1c3: aload 0
      // 1c4: getfield qeaa361f143ee4a0894bd168fd9b30c66/qf4ccf8f5435d4a78bdca4d6a018b578e/aaabbbbbb.aba J
      // 1c7: lsub
      // 1c8: ldc_w -1715322244
      // 1cb: ldc_w 1106506582
      // 1ce: ldc_w -1261618779
      // 1d1: ixor
      // 1d2: invokestatic qeaa361f143ee4a0894bd168fd9b30c66/qf4ccf8f5435d4a78bdca4d6a018b578e/aaabbbbbb.a (II)I
      // 1d5: ldc2_w 7681439354511511792
      // 1d8: invokestatic qeaa361f143ee4a0894bd168fd9b30c66/qf4ccf8f5435d4a78bdca4d6a018b578e/aaabbbbbb.bbb (IJ)J
      // 1db: lcmp
      // 1dc: iload 1
      // 1dd: ifne 1f8
      // 1e0: ifge 208
      // 1e3: goto 1e7
      // 1e6: athrow
      // 1e7: aload 2
      // 1e8: getfield net/minecraft/class_310.field_1724 Lnet/minecraft/class_746;
      // 1eb: aload 5
      // 1ed: invokevirtual net/minecraft/class_746.method_5858 (Lnet/minecraft/class_1297;)D
      // 1f0: ldc2_w 484.0
      // 1f3: dcmpg
      // 1f4: goto 1f8
      // 1f7: athrow
      // 1f8: ifgt 208
      // 1fb: aload 0
      // 1fc: aload 5
      // 1fe: invokevirtual net/minecraft/class_1657.method_5628 ()I
      // 201: invokevirtual qeaa361f143ee4a0894bd168fd9b30c66/qf4ccf8f5435d4a78bdca4d6a018b578e/aaabbbbbb.bb (I)V
      // 204: goto 208
      // 207: athrow
      // 208: return
   }

   private void aab(int param1, double param2) {
      // $VF: Couldn't be decompiled
      // Please report this to the Vineflower issue tracker, at https://github.com/Vineflower/vineflower/issues with a copy of the class file (if you have the rights to distribute it!)
      // java.lang.RuntimeException: parsing failure!
      //   at org.jetbrains.java.decompiler.modules.decompiler.decompose.DomHelper.parseGraph(DomHelper.java:211)
      //   at org.jetbrains.java.decompiler.main.rels.MethodProcessor.codeToJava(MethodProcessor.java:166)
      //
      // Bytecode:
      // 000: getstatic qeaa361f143ee4a0894bd168fd9b30c66/qf4ccf8f5435d4a78bdca4d6a018b578e/aabbabbab.ab I
      // 003: istore 4
      // 005: aload 0
      // 006: getfield qeaa361f143ee4a0894bd168fd9b30c66/qf4ccf8f5435d4a78bdca4d6a018b578e/aaabbbbbb.aabba [Ljavax/sound/sampled/Clip;
      // 009: iload 1
      // 00a: aaload
      // 00b: astore 5
      // 00d: aload 5
      // 00f: iload 4
      // 011: ifne 01d
      // 014: ifnull 02e
      // 017: goto 01b
      // 01a: athrow
      // 01b: aload 5
      // 01d: iload 4
      // 01f: ifne 0f4
      // 022: invokeinterface javax/sound/sampled/Clip.isOpen ()Z 1
      // 027: ifne 0f2
      // 02a: goto 02e
      // 02d: athrow
      // 02e: aload 0
      // 02f: iload 1
      // 030: invokevirtual qeaa361f143ee4a0894bd168fd9b30c66/qf4ccf8f5435d4a78bdca4d6a018b578e/aaabbbbbb.bba (I)Ljava/io/InputStream;
      // 033: astore 6
      // 035: aload 6
      // 037: iload 4
      // 039: ifne 0ba
      // 03c: ifnull 0b8
      // 03f: goto 043
      // 042: athrow
      // 043: new java/io/BufferedInputStream
      // 046: dup
      // 047: aload 6
      // 049: invokespecial java/io/BufferedInputStream.<init> (Ljava/io/InputStream;)V
      // 04c: invokestatic javax/sound/sampled/AudioSystem.getAudioInputStream (Ljava/io/InputStream;)Ljavax/sound/sampled/AudioInputStream;
      // 04f: astore 7
      // 051: invokestatic javax/sound/sampled/AudioSystem.getClip ()Ljavax/sound/sampled/Clip;
      // 054: astore 5
      // 056: aload 5
      // 058: aload 7
      // 05a: invokeinterface javax/sound/sampled/Clip.open (Ljavax/sound/sampled/AudioInputStream;)V 2
      // 05f: aload 0
      // 060: getfield qeaa361f143ee4a0894bd168fd9b30c66/qf4ccf8f5435d4a78bdca4d6a018b578e/aaabbbbbb.aabba [Ljavax/sound/sampled/Clip;
      // 063: dup
      // 064: astore 8
      // 066: monitorenter
      // 067: aload 0
      // 068: getfield qeaa361f143ee4a0894bd168fd9b30c66/qf4ccf8f5435d4a78bdca4d6a018b578e/aaabbbbbb.aabba [Ljavax/sound/sampled/Clip;
      // 06b: iload 1
      // 06c: aload 5
      // 06e: aastore
      // 06f: aload 8
      // 071: monitorexit
      // 072: goto 07d
      // 075: astore 9
      // 077: aload 8
      // 079: monitorexit
      // 07a: aload 9
      // 07c: athrow
      // 07d: aload 7
      // 07f: iload 4
      // 081: ifne 0ba
      // 084: ifnull 0b8
      // 087: goto 08b
      // 08a: athrow
      // 08b: aload 7
      // 08d: invokevirtual javax/sound/sampled/AudioInputStream.close ()V
      // 090: goto 0b8
      // 093: athrow
      // 094: astore 8
      // 096: iload 4
      // 098: ifne 0a9
      // 09b: aload 7
      // 09d: ifnull 0b5
      // 0a0: goto 0a4
      // 0a3: athrow
      // 0a4: aload 7
      // 0a6: invokevirtual javax/sound/sampled/AudioInputStream.close ()V
      // 0a9: goto 0b5
      // 0ac: astore 9
      // 0ae: aload 8
      // 0b0: aload 9
      // 0b2: invokevirtual java/lang/Throwable.addSuppressed (Ljava/lang/Throwable;)V
      // 0b5: aload 8
      // 0b7: athrow
      // 0b8: aload 6
      // 0ba: iload 4
      // 0bc: ifne 0c8
      // 0bf: ifnull 0f2
      // 0c2: goto 0c6
      // 0c5: athrow
      // 0c6: aload 6
      // 0c8: invokevirtual java/io/InputStream.close ()V
      // 0cb: goto 0f2
      // 0ce: astore 7
      // 0d0: iload 4
      // 0d2: ifne 0e3
      // 0d5: aload 6
      // 0d7: ifnull 0ef
      // 0da: goto 0de
      // 0dd: athrow
      // 0de: aload 6
      // 0e0: invokevirtual java/io/InputStream.close ()V
      // 0e3: goto 0ef
      // 0e6: astore 8
      // 0e8: aload 7
      // 0ea: aload 8
      // 0ec: invokevirtual java/lang/Throwable.addSuppressed (Ljava/lang/Throwable;)V
      // 0ef: aload 7
      // 0f1: athrow
      // 0f2: aload 5
      // 0f4: iload 4
      // 0f6: ifne 102
      // 0f9: ifnull 19b
      // 0fc: goto 100
      // 0ff: athrow
      // 100: aload 5
      // 102: iload 4
      // 104: ifne 119
      // 107: invokeinterface javax/sound/sampled/Clip.isOpen ()Z 1
      // 10c: ifeq 19b
      // 10f: goto 113
      // 112: athrow
      // 113: aload 5
      // 115: goto 119
      // 118: athrow
      // 119: iload 4
      // 11b: ifne 148
      // 11e: invokeinterface javax/sound/sampled/Clip.isRunning ()Z 1
      // 123: ifeq 135
      // 126: goto 12a
      // 129: athrow
      // 12a: aload 5
      // 12c: invokeinterface javax/sound/sampled/Clip.stop ()V 1
      // 131: goto 135
      // 134: athrow
      // 135: aload 5
      // 137: iload 4
      // 139: ifne 196
      // 13c: bipush 0
      // 13d: invokeinterface javax/sound/sampled/Clip.setFramePosition (I)V 2
      // 142: aload 5
      // 144: goto 148
      // 147: athrow
      // 148: getstatic javax/sound/sampled/FloatControl$Type.MASTER_GAIN Ljavax/sound/sampled/FloatControl$Type;
      // 14b: invokeinterface javax/sound/sampled/Clip.isControlSupported (Ljavax/sound/sampled/Control$Type;)Z 2
      // 150: ifeq 194
      // 153: aload 5
      // 155: getstatic javax/sound/sampled/FloatControl$Type.MASTER_GAIN Ljavax/sound/sampled/FloatControl$Type;
      // 158: invokeinterface javax/sound/sampled/Clip.getControl (Ljavax/sound/sampled/Control$Type;)Ljavax/sound/sampled/Control; 2
      // 15d: checkcast javax/sound/sampled/FloatControl
      // 160: astore 6
      // 162: ldc2_w 1.0E-4
      // 165: dload 2
      // 166: ldc2_w 100.0
      // 169: ddiv
      // 16a: invokestatic java/lang/Math.max (DD)D
      // 16d: d2f
      // 16e: fstore 7
      // 170: fload 7
      // 172: f2d
      // 173: invokestatic java/lang/Math.log10 (D)D
      // 176: ldc2_w 20.0
      // 179: dmul
      // 17a: d2f
      // 17b: fstore 8
      // 17d: aload 6
      // 17f: aload 6
      // 181: invokevirtual javax/sound/sampled/FloatControl.getMinimum ()F
      // 184: aload 6
      // 186: invokevirtual javax/sound/sampled/FloatControl.getMaximum ()F
      // 189: fload 8
      // 18b: invokestatic java/lang/Math.min (FF)F
      // 18e: invokestatic java/lang/Math.max (FF)F
      // 191: invokevirtual javax/sound/sampled/FloatControl.setValue (F)V
      // 194: aload 5
      // 196: invokeinterface javax/sound/sampled/Clip.start ()V 1
      // 19b: goto 1a0
      // 19e: astore 5
      // 1a0: return
   }

   private boolean aba(class_1657 param1) {
      // $VF: Couldn't be decompiled
      // Please report this to the Vineflower issue tracker, at https://github.com/Vineflower/vineflower/issues with a copy of the class file (if you have the rights to distribute it!)
      // java.lang.RuntimeException: parsing failure!
      //   at org.jetbrains.java.decompiler.modules.decompiler.decompose.DomHelper.parseGraph(DomHelper.java:211)
      //   at org.jetbrains.java.decompiler.main.rels.MethodProcessor.codeToJava(MethodProcessor.java:166)
      //
      // Bytecode:
      // 00: getstatic qeaa361f143ee4a0894bd168fd9b30c66/qf4ccf8f5435d4a78bdca4d6a018b578e/aabbabbab.ab I
      // 03: invokestatic net/minecraft/class_310.method_1551 ()Lnet/minecraft/class_310;
      // 06: astore 3
      // 07: istore 2
      // 08: aload 3
      // 09: iload 2
      // 0a: ifne 15
      // 0d: ifnull 2f
      // 10: goto 14
      // 13: athrow
      // 14: aload 3
      // 15: getfield net/minecraft/class_310.field_1724 Lnet/minecraft/class_746;
      // 18: iload 2
      // 19: ifne 24
      // 1c: ifnull 2f
      // 1f: goto 23
      // 22: athrow
      // 23: aload 1
      // 24: iload 2
      // 25: ifne 33
      // 28: ifnonnull 32
      // 2b: goto 2f
      // 2e: athrow
      // 2f: bipush 1
      // 30: ireturn
      // 31: athrow
      // 32: aload 1
      // 33: iload 2
      // 34: ifne 47
      // 37: aload 3
      // 38: getfield net/minecraft/class_310.field_1724 Lnet/minecraft/class_746;
      // 3b: if_acmpeq 5c
      // 3e: goto 42
      // 41: athrow
      // 42: aload 1
      // 43: goto 47
      // 46: athrow
      // 47: iload 2
      // 48: ifne 60
      // 4b: invokevirtual net/minecraft/class_1657.method_5628 ()I
      // 4e: aload 3
      // 4f: getfield net/minecraft/class_310.field_1724 Lnet/minecraft/class_746;
      // 52: invokevirtual net/minecraft/class_746.method_5628 ()I
      // 55: if_icmpne 5f
      // 58: goto 5c
      // 5b: athrow
      // 5c: bipush 1
      // 5d: ireturn
      // 5e: athrow
      // 5f: aload 1
      // 60: invokestatic qeaa361f143ee4a0894bd168fd9b30c66/qf4ccf8f5435d4a78bdca4d6a018b578e/abaabbbba.ab (Lnet/minecraft/class_1657;)Z
      // 63: ireturn
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
      // 00: getstatic qeaa361f143ee4a0894bd168fd9b30c66/qf4ccf8f5435d4a78bdca4d6a018b578e/aabbabbab.ab I
      // 03: istore 2
      // 04: aload 0
      // 05: invokevirtual qeaa361f143ee4a0894bd168fd9b30c66/qf4ccf8f5435d4a78bdca4d6a018b578e/aaabbbbbb.babbaab ()Z
      // 08: iload 2
      // 09: ifne 20
      // 0c: ifne 14
      // 0f: goto 13
      // 12: athrow
      // 13: return
      // 14: aload 1
      // 15: iload 2
      // 16: ifne 24
      // 19: instanceof net/minecraft/class_1657
      // 1c: goto 20
      // 1f: athrow
      // 20: ifeq 4b
      // 23: aload 1
      // 24: checkcast net/minecraft/class_1657
      // 27: astore 3
      // 28: iload 2
      // 29: ifne 44
      // 2c: aload 0
      // 2d: aload 3
      // 2e: invokevirtual qeaa361f143ee4a0894bd168fd9b30c66/qf4ccf8f5435d4a78bdca4d6a018b578e/aaabbbbbb.aba (Lnet/minecraft/class_1657;)Z
      // 31: ifne 4b
      // 34: goto 38
      // 37: athrow
      // 38: aload 0
      // 39: aload 3
      // 3a: invokevirtual net/minecraft/class_1657.method_5628 ()I
      // 3d: putfield qeaa361f143ee4a0894bd168fd9b30c66/qf4ccf8f5435d4a78bdca4d6a018b578e/aaabbbbbb.baab I
      // 40: goto 44
      // 43: athrow
      // 44: aload 0
      // 45: invokestatic java/lang/System.currentTimeMillis ()J
      // 48: putfield qeaa361f143ee4a0894bd168fd9b30c66/qf4ccf8f5435d4a78bdca4d6a018b578e/aaabbbbbb.aba J
      // 4b: return
   }

   private InputStream abb(int param1) {
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
      // 05: iload 1
      // 06: invokevirtual qeaa361f143ee4a0894bd168fd9b30c66/qf4ccf8f5435d4a78bdca4d6a018b578e/aaabbbbbb.aaaa (I)Ljava/nio/file/Path;
      // 09: astore 3
      // 0a: aload 3
      // 0b: iload 2
      // 0c: ifne 17
      // 0f: ifnull 36
      // 12: goto 16
      // 15: athrow
      // 16: aload 3
      // 17: iload 2
      // 18: ifne 2e
      // 1b: bipush 0
      // 1c: anewarray 436
      // 1f: invokestatic java/nio/file/Files.isRegularFile (Ljava/nio/file/Path;[Ljava/nio/file/LinkOption;)Z
      // 22: ifeq 36
      // 25: goto 29
      // 28: athrow
      // 29: aload 3
      // 2a: goto 2e
      // 2d: athrow
      // 2e: bipush 0
      // 2f: anewarray 444
      // 32: invokestatic java/nio/file/Files.newInputStream (Ljava/nio/file/Path;[Ljava/nio/file/OpenOption;)Ljava/io/InputStream;
      // 35: areturn
      // 36: goto 3a
      // 39: astore 3
      // 3a: ldc qeaa361f143ee4a0894bd168fd9b30c66/qf4ccf8f5435d4a78bdca4d6a018b578e/aaabbbbbb
      // 3c: invokevirtual java/lang/Class.getClassLoader ()Ljava/lang/ClassLoader;
      // 3f: getstatic qeaa361f143ee4a0894bd168fd9b30c66/qf4ccf8f5435d4a78bdca4d6a018b578e/aaabbbbbb.abba Lqeaa361f143ee4a0894bd168fd9b30c66/qf4ccf8f5435d4a78bdca4d6a018b578e/ababbbbaa;
      // 42: invokevirtual qeaa361f143ee4a0894bd168fd9b30c66/qf4ccf8f5435d4a78bdca4d6a018b578e/ababbbbaa.abab ()Ljava/lang/String;
      // 45: iload 1
      // 46: bipush 1
      // 47: iadd
      // 48: getstatic qeaa361f143ee4a0894bd168fd9b30c66/qf4ccf8f5435d4a78bdca4d6a018b578e/aaabbbbbb.aa Lqeaa361f143ee4a0894bd168fd9b30c66/qf4ccf8f5435d4a78bdca4d6a018b578e/ababbbbaa;
      // 4b: invokevirtual qeaa361f143ee4a0894bd168fd9b30c66/qf4ccf8f5435d4a78bdca4d6a018b578e/ababbbbaa.abab ()Ljava/lang/String;
      // 4e: astore 6
      // 50: istore 5
      // 52: astore 4
      // 54: new java/lang/StringBuilder
      // 57: dup
      // 58: invokespecial java/lang/StringBuilder.<init> ()V
      // 5b: aload 4
      // 5d: invokevirtual java/lang/StringBuilder.append (Ljava/lang/Object;)Ljava/lang/StringBuilder;
      // 60: iload 5
      // 62: invokevirtual java/lang/StringBuilder.append (I)Ljava/lang/StringBuilder;
      // 65: aload 6
      // 67: invokevirtual java/lang/StringBuilder.append (Ljava/lang/Object;)Ljava/lang/StringBuilder;
      // 6a: invokevirtual java/lang/StringBuilder.toString ()Ljava/lang/String;
      // 6d: invokevirtual java/lang/ClassLoader.getResourceAsStream (Ljava/lang/String;)Ljava/io/InputStream;
      // 70: areturn
   }

   private static int bab(int var0, long var1) {
      int var3 = var0 ^ (int)(var1 & 32767L) ^ a(-1715322301, -2144236945 ^ 1022590987);
      if (aaab[var3] == null) {
         aaab[var3] = (int)(aaaba[var3] ^ var1);
      }

      return aaab[var3];
   }

   private InputStream bba(int param1) {
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
      // 05: iload 1
      // 06: invokevirtual qeaa361f143ee4a0894bd168fd9b30c66/qf4ccf8f5435d4a78bdca4d6a018b578e/aaabbbbbb.aa (I)Ljava/nio/file/Path;
      // 09: astore 3
      // 0a: aload 3
      // 0b: iload 2
      // 0c: ifne 17
      // 0f: ifnull 36
      // 12: goto 16
      // 15: athrow
      // 16: aload 3
      // 17: iload 2
      // 18: ifne 2e
      // 1b: bipush 0
      // 1c: anewarray 436
      // 1f: invokestatic java/nio/file/Files.isRegularFile (Ljava/nio/file/Path;[Ljava/nio/file/LinkOption;)Z
      // 22: ifeq 36
      // 25: goto 29
      // 28: athrow
      // 29: aload 3
      // 2a: goto 2e
      // 2d: athrow
      // 2e: bipush 0
      // 2f: anewarray 444
      // 32: invokestatic java/nio/file/Files.newInputStream (Ljava/nio/file/Path;[Ljava/nio/file/OpenOption;)Ljava/io/InputStream;
      // 35: areturn
      // 36: goto 3a
      // 39: astore 3
      // 3a: ldc qeaa361f143ee4a0894bd168fd9b30c66/qf4ccf8f5435d4a78bdca4d6a018b578e/aaabbbbbb
      // 3c: invokevirtual java/lang/Class.getClassLoader ()Ljava/lang/ClassLoader;
      // 3f: getstatic qeaa361f143ee4a0894bd168fd9b30c66/qf4ccf8f5435d4a78bdca4d6a018b578e/aaabbbbbb.aabab Lqeaa361f143ee4a0894bd168fd9b30c66/qf4ccf8f5435d4a78bdca4d6a018b578e/ababbbbaa;
      // 42: invokevirtual qeaa361f143ee4a0894bd168fd9b30c66/qf4ccf8f5435d4a78bdca4d6a018b578e/ababbbbaa.abab ()Ljava/lang/String;
      // 45: iload 1
      // 46: bipush 1
      // 47: iadd
      // 48: getstatic qeaa361f143ee4a0894bd168fd9b30c66/qf4ccf8f5435d4a78bdca4d6a018b578e/aaabbbbbb.aa Lqeaa361f143ee4a0894bd168fd9b30c66/qf4ccf8f5435d4a78bdca4d6a018b578e/ababbbbaa;
      // 4b: invokevirtual qeaa361f143ee4a0894bd168fd9b30c66/qf4ccf8f5435d4a78bdca4d6a018b578e/ababbbbaa.abab ()Ljava/lang/String;
      // 4e: astore 6
      // 50: istore 5
      // 52: astore 4
      // 54: new java/lang/StringBuilder
      // 57: dup
      // 58: invokespecial java/lang/StringBuilder.<init> ()V
      // 5b: aload 4
      // 5d: invokevirtual java/lang/StringBuilder.append (Ljava/lang/Object;)Ljava/lang/StringBuilder;
      // 60: iload 5
      // 62: invokevirtual java/lang/StringBuilder.append (I)Ljava/lang/StringBuilder;
      // 65: aload 6
      // 67: invokevirtual java/lang/StringBuilder.append (Ljava/lang/Object;)Ljava/lang/StringBuilder;
      // 6a: invokevirtual java/lang/StringBuilder.toString ()Ljava/lang/String;
      // 6d: invokevirtual java/lang/ClassLoader.getResourceAsStream (Ljava/lang/String;)Ljava/io/InputStream;
      // 70: areturn
   }

   @Override
   public void abbaaba(class_1297 param1, byte param2) {
      // $VF: Couldn't be decompiled
      // Please report this to the Vineflower issue tracker, at https://github.com/Vineflower/vineflower/issues with a copy of the class file (if you have the rights to distribute it!)
      // java.lang.RuntimeException: parsing failure!
      //   at org.jetbrains.java.decompiler.modules.decompiler.decompose.DomHelper.parseGraph(DomHelper.java:211)
      //   at org.jetbrains.java.decompiler.main.rels.MethodProcessor.codeToJava(MethodProcessor.java:166)
      //
      // Bytecode:
      // 000: getstatic qeaa361f143ee4a0894bd168fd9b30c66/qf4ccf8f5435d4a78bdca4d6a018b578e/aabbabbab.ab I
      // 003: istore 3
      // 004: aload 0
      // 005: invokevirtual qeaa361f143ee4a0894bd168fd9b30c66/qf4ccf8f5435d4a78bdca4d6a018b578e/aaabbbbbb.babbaab ()Z
      // 008: iload 3
      // 009: ifne 015
      // 00c: ifne 014
      // 00f: goto 013
      // 012: athrow
      // 013: return
      // 014: iload 2
      // 015: iload 3
      // 016: ifne 026
      // 019: bipush 3
      // 01a: if_icmpeq 03e
      // 01d: goto 021
      // 020: athrow
      // 021: iload 2
      // 022: goto 026
      // 025: athrow
      // 026: ldc_w -1715322304
      // 029: ldc_w -1527310575
      // 02c: ldc_w 1987007959
      // 02f: ixor
      // 030: invokestatic qeaa361f143ee4a0894bd168fd9b30c66/qf4ccf8f5435d4a78bdca4d6a018b578e/aaabbbbbb.a (II)I
      // 033: ldc2_w 1505299193178828749
      // 036: invokestatic qeaa361f143ee4a0894bd168fd9b30c66/qf4ccf8f5435d4a78bdca4d6a018b578e/aaabbbbbb.bab (IJ)I
      // 039: if_icmpeq 03e
      // 03c: return
      // 03d: athrow
      // 03e: invokestatic net/minecraft/class_310.method_1551 ()Lnet/minecraft/class_310;
      // 041: astore 4
      // 043: aload 4
      // 045: iload 3
      // 046: ifne 052
      // 049: ifnull 0a7
      // 04c: goto 050
      // 04f: athrow
      // 050: aload 4
      // 052: iload 3
      // 053: ifne 066
      // 056: getfield net/minecraft/class_310.field_1724 Lnet/minecraft/class_746;
      // 059: ifnull 0a7
      // 05c: goto 060
      // 05f: athrow
      // 060: aload 4
      // 062: goto 066
      // 065: athrow
      // 066: getfield net/minecraft/class_310.field_1724 Lnet/minecraft/class_746;
      // 069: iload 3
      // 06a: ifne 088
      // 06d: invokevirtual net/minecraft/class_746.method_5805 ()Z
      // 070: ifeq 0a7
      // 073: goto 077
      // 076: athrow
      // 077: aload 4
      // 079: iload 3
      // 07a: ifne 094
      // 07d: goto 081
      // 080: athrow
      // 081: getfield net/minecraft/class_310.field_1724 Lnet/minecraft/class_746;
      // 084: goto 088
      // 087: athrow
      // 088: invokevirtual net/minecraft/class_746.method_29504 ()Z
      // 08b: ifne 0a7
      // 08e: aload 4
      // 090: goto 094
      // 093: athrow
      // 094: getfield net/minecraft/class_310.field_1724 Lnet/minecraft/class_746;
      // 097: iload 3
      // 098: ifne 0aa
      // 09b: invokevirtual net/minecraft/class_746.method_6032 ()F
      // 09e: fconst_0
      // 09f: fcmpg
      // 0a0: ifgt 0a9
      // 0a3: goto 0a7
      // 0a6: athrow
      // 0a7: return
      // 0a8: athrow
      // 0a9: aload 1
      // 0aa: iload 3
      // 0ab: ifne 0bd
      // 0ae: instanceof net/minecraft/class_1657
      // 0b1: ifeq 184
      // 0b4: goto 0b8
      // 0b7: athrow
      // 0b8: aload 1
      // 0b9: goto 0bd
      // 0bc: athrow
      // 0bd: checkcast net/minecraft/class_1657
      // 0c0: astore 5
      // 0c2: aload 0
      // 0c3: aload 5
      // 0c5: invokevirtual qeaa361f143ee4a0894bd168fd9b30c66/qf4ccf8f5435d4a78bdca4d6a018b578e/aaabbbbbb.aba (Lnet/minecraft/class_1657;)Z
      // 0c8: ifne 184
      // 0cb: invokestatic java/lang/System.currentTimeMillis ()J
      // 0ce: lstore 6
      // 0d0: aload 5
      // 0d2: invokevirtual net/minecraft/class_1657.method_5628 ()I
      // 0d5: iload 3
      // 0d6: ifne 103
      // 0d9: aload 0
      // 0da: getfield qeaa361f143ee4a0894bd168fd9b30c66/qf4ccf8f5435d4a78bdca4d6a018b578e/aaabbbbbb.baab I
      // 0dd: if_icmpne 112
      // 0e0: goto 0e4
      // 0e3: athrow
      // 0e4: lload 6
      // 0e6: aload 0
      // 0e7: getfield qeaa361f143ee4a0894bd168fd9b30c66/qf4ccf8f5435d4a78bdca4d6a018b578e/aaabbbbbb.aba J
      // 0ea: lsub
      // 0eb: ldc_w -1715322303
      // 0ee: ldc_w -1527310575
      // 0f1: ldc_w -809760112
      // 0f4: ixor
      // 0f5: invokestatic qeaa361f143ee4a0894bd168fd9b30c66/qf4ccf8f5435d4a78bdca4d6a018b578e/aaabbbbbb.a (II)I
      // 0f8: ldc2_w 4518153179071983459
      // 0fb: invokestatic qeaa361f143ee4a0894bd168fd9b30c66/qf4ccf8f5435d4a78bdca4d6a018b578e/aaabbbbbb.bbb (IJ)J
      // 0fe: lcmp
      // 0ff: goto 103
      // 102: athrow
      // 103: iload 3
      // 104: ifne 10f
      // 107: ifge 112
      // 10a: goto 10e
      // 10d: athrow
      // 10e: bipush 1
      // 10f: goto 113
      // 112: bipush 0
      // 113: istore 8
      // 115: aload 5
      // 117: invokevirtual net/minecraft/class_1657.method_5628 ()I
      // 11a: iload 3
      // 11b: ifne 12e
      // 11e: aload 0
      // 11f: getfield qeaa361f143ee4a0894bd168fd9b30c66/qf4ccf8f5435d4a78bdca4d6a018b578e/aaabbbbbb.aabbb I
      // 122: if_icmpne 131
      // 125: goto 129
      // 128: athrow
      // 129: bipush 1
      // 12a: goto 12e
      // 12d: athrow
      // 12e: goto 132
      // 131: bipush 0
      // 132: istore 9
      // 134: aload 4
      // 136: getfield net/minecraft/class_310.field_1724 Lnet/minecraft/class_746;
      // 139: aload 5
      // 13b: invokevirtual net/minecraft/class_746.method_5858 (Lnet/minecraft/class_1297;)D
      // 13e: ldc2_w 484.0
      // 141: dcmpg
      // 142: iload 3
      // 143: ifne 14e
      // 146: ifgt 151
      // 149: goto 14d
      // 14c: athrow
      // 14d: bipush 1
      // 14e: goto 152
      // 151: bipush 0
      // 152: istore 10
      // 154: iload 8
      // 156: iload 3
      // 157: ifne 174
      // 15a: ifne 172
      // 15d: goto 161
      // 160: athrow
      // 161: iload 9
      // 163: iload 3
      // 164: ifne 174
      // 167: goto 16b
      // 16a: athrow
      // 16b: ifeq 184
      // 16e: goto 172
      // 171: athrow
      // 172: iload 10
      // 174: ifeq 184
      // 177: aload 0
      // 178: aload 5
      // 17a: invokevirtual net/minecraft/class_1657.method_5628 ()I
      // 17d: invokevirtual qeaa361f143ee4a0894bd168fd9b30c66/qf4ccf8f5435d4a78bdca4d6a018b578e/aaabbbbbb.bb (I)V
      // 180: goto 184
      // 183: athrow
      // 184: return
   }

   private static String b(char var0, int var1, char var2) {
      int var7 = var1 ^ -1891804706;
      char[] var6 = abaaa[var7].toCharArray();
      StackTraceElement[] var8 = (StackTraceElement[])abaab[var7];
      StackTraceElement[] var9;
      if (var8 != null) {
         var9 = var8;
      } else {
         var9 = new Throwable().getStackTrace();
         abaab[var7] = var9;
      }

      StackTraceElement var10 = var9[1];
      int var4 = (var10.getClassName().hashCode() ^ var10.getMethodName().hashCode()) >> 16 ^ 21988;

      for (int var5 = 0; var5 < var6.length; var5++) {
         var6[var5] = (char)(var6[var5] ^ switch (var5 % 30) {
            default -> 16;
            case 1 -> 192;
            case 2 -> 118;
            case 3 -> 99;
            case 4 -> 207;
            case 5 -> 22;
            case 6 -> 229;
            case 7 -> 24;
            case 8 -> 69;
            case 9 -> 237;
            case 10 -> 185;
            case 11 -> 40;
            case 12 -> 233;
            case 13 -> 51;
            case 14 -> 255;
            case 15 -> 17;
            case 16 -> 0;
            case 17 -> 174;
            case 18 -> 128;
            case 19 -> 133;
            case 20 -> 47;
            case 21 -> 199;
            case 22 -> 213;
            case 23 -> 104;
            case 24 -> 197;
            case 25 -> 176;
            case 26 -> 38;
            case 27 -> 50;
            case 28 -> 108;
            case 29 -> 80;
         } ^ 31798 ^ var0 ^ var4 ^ var1 ^ var2);
      }

      return new String(var6).intern();
   }

   private static long bbb(int var0, long var1) {
      int var3 = (var0 ^ (int)var1 ^ a(-1715322298, 97901602 ^ -959986715)) & a(-1715322297, 97901602 ^ -125691718);
      if (bb[var3] == null) {
         bb[var3] = aaa[var3] ^ var1;
      }

      return bb[var3];
   }

   private Path aaaa(int param1) {
      // $VF: Couldn't be decompiled
      // Please report this to the Vineflower issue tracker, at https://github.com/Vineflower/vineflower/issues with a copy of the class file (if you have the rights to distribute it!)
      // java.lang.RuntimeException: parsing failure!
      //   at org.jetbrains.java.decompiler.modules.decompiler.decompose.DomHelper.parseGraph(DomHelper.java:211)
      //   at org.jetbrains.java.decompiler.main.rels.MethodProcessor.codeToJava(MethodProcessor.java:166)
      //
      // Bytecode:
      // 00: getstatic qeaa361f143ee4a0894bd168fd9b30c66/qf4ccf8f5435d4a78bdca4d6a018b578e/aabbabbab.ab I
      // 03: istore 2
      // 04: invokestatic qeaa361f143ee4a0894bd168fd9b30c66/qf4ccf8f5435d4a78bdca4d6a018b578e/abaaaaaba.aaaaa ()Lqeaa361f143ee4a0894bd168fd9b30c66/qf4ccf8f5435d4a78bdca4d6a018b578e/abaaaaaba;
      // 07: astore 3
      // 08: aload 3
      // 09: iload 2
      // 0a: ifne 15
      // 0d: ifnull 31
      // 10: goto 14
      // 13: athrow
      // 14: aload 3
      // 15: iload 2
      // 16: ifne 28
      // 19: invokevirtual qeaa361f143ee4a0894bd168fd9b30c66/qf4ccf8f5435d4a78bdca4d6a018b578e/abaaaaaba.aba ()Lqeaa361f143ee4a0894bd168fd9b30c66/qf4ccf8f5435d4a78bdca4d6a018b578e/babaaaa;
      // 1c: ifnull 31
      // 1f: goto 23
      // 22: athrow
      // 23: aload 3
      // 24: goto 28
      // 27: athrow
      // 28: invokevirtual qeaa361f143ee4a0894bd168fd9b30c66/qf4ccf8f5435d4a78bdca4d6a018b578e/abaaaaaba.aba ()Lqeaa361f143ee4a0894bd168fd9b30c66/qf4ccf8f5435d4a78bdca4d6a018b578e/babaaaa;
      // 2b: invokevirtual qeaa361f143ee4a0894bd168fd9b30c66/qf4ccf8f5435d4a78bdca4d6a018b578e/babaaaa.babaa ()Ljava/nio/file/Path;
      // 2e: goto 32
      // 31: aconst_null
      // 32: astore 4
      // 34: aload 4
      // 36: iload 2
      // 37: ifne 54
      // 3a: ifnull a1
      // 3d: goto 41
      // 40: athrow
      // 41: aload 4
      // 43: iload 2
      // 44: ifne a0
      // 47: goto 4b
      // 4a: athrow
      // 4b: invokeinterface java/nio/file/Path.getParent ()Ljava/nio/file/Path; 1
      // 50: goto 54
      // 53: athrow
      // 54: ifnull a1
      // 57: aload 4
      // 59: invokeinterface java/nio/file/Path.getParent ()Ljava/nio/file/Path; 1
      // 5e: getstatic qeaa361f143ee4a0894bd168fd9b30c66/qf4ccf8f5435d4a78bdca4d6a018b578e/aaabbbbbb.bab Lqeaa361f143ee4a0894bd168fd9b30c66/qf4ccf8f5435d4a78bdca4d6a018b578e/ababbbbaa;
      // 61: invokevirtual qeaa361f143ee4a0894bd168fd9b30c66/qf4ccf8f5435d4a78bdca4d6a018b578e/ababbbbaa.abab ()Ljava/lang/String;
      // 64: invokeinterface java/nio/file/Path.resolve (Ljava/lang/String;)Ljava/nio/file/Path; 2
      // 69: getstatic qeaa361f143ee4a0894bd168fd9b30c66/qf4ccf8f5435d4a78bdca4d6a018b578e/aaabbbbbb.baba Lqeaa361f143ee4a0894bd168fd9b30c66/qf4ccf8f5435d4a78bdca4d6a018b578e/ababbbbaa;
      // 6c: invokevirtual qeaa361f143ee4a0894bd168fd9b30c66/qf4ccf8f5435d4a78bdca4d6a018b578e/ababbbbaa.abab ()Ljava/lang/String;
      // 6f: iload 1
      // 70: bipush 1
      // 71: iadd
      // 72: getstatic qeaa361f143ee4a0894bd168fd9b30c66/qf4ccf8f5435d4a78bdca4d6a018b578e/aaabbbbbb.bbaa Lqeaa361f143ee4a0894bd168fd9b30c66/qf4ccf8f5435d4a78bdca4d6a018b578e/ababbbbaa;
      // 75: invokevirtual qeaa361f143ee4a0894bd168fd9b30c66/qf4ccf8f5435d4a78bdca4d6a018b578e/ababbbbaa.abab ()Ljava/lang/String;
      // 78: astore 7
      // 7a: istore 6
      // 7c: astore 5
      // 7e: new java/lang/StringBuilder
      // 81: dup
      // 82: invokespecial java/lang/StringBuilder.<init> ()V
      // 85: aload 5
      // 87: invokevirtual java/lang/StringBuilder.append (Ljava/lang/Object;)Ljava/lang/StringBuilder;
      // 8a: iload 6
      // 8c: invokevirtual java/lang/StringBuilder.append (I)Ljava/lang/StringBuilder;
      // 8f: aload 7
      // 91: invokevirtual java/lang/StringBuilder.append (Ljava/lang/Object;)Ljava/lang/StringBuilder;
      // 94: invokevirtual java/lang/StringBuilder.toString ()Ljava/lang/String;
      // 97: invokeinterface java/nio/file/Path.resolve (Ljava/lang/String;)Ljava/nio/file/Path; 2
      // 9c: goto a0
      // 9f: athrow
      // a0: areturn
      // a1: goto a5
      // a4: astore 3
      // a5: aconst_null
      // a6: areturn
   }

   // $VF: Irreducible bytecode was duplicated to produce valid code
   static {
      int var39 = -919623811;
      int var33 = 0;
      int var32 = 0;
      int var30 = "ƞ넇笾뀟㬅덃笙눇\ufb07냳ﬡ눯㬏뎟ﬓ덻묝넳㬭덋מּ냟笳눟\ufb1a늫笢뇯㬒낧笒냿묮넓יִ늷묚뎻묜낷笠댛笗뉯笃닟ﬔ녧ﬥ눿묡뀧묷닿笂늷㬼냳묄낗\ufb1a녇符끇㬞덏笙늧㬞뀿第덣ﬀ늇묔늿ﬓ녓\ufb3d늓묱넛㬣눣ﬃ늣笥녧㬟뇋笀놳笪뇟\ufb08눯笜늣ﬅ끣וּ돧笛늳笕늫笐뀟\ufb3f댷㬿녻묰닿㬕덛㬾냳笜끓笇뀫㬣냿묋눋㬜눗\ufb0f녫第덧笞뎫\ufb08눯ﬡ놫묵덻묻냻묮뉏㬞댛שׂ놯\ufb0a뀗묀넯גּ끻묎닗묜늃笕놫笨눛笍뉃\ufb10늏笀놧㬲덃\ufb3f낧묫돃笉닯笽넧ﬕ냟ﬔ뇣묿냃묃닷笗돯笚낗묠덗笗뎻笊눋묉넯㬺덓מּ끿ﬣ뉗㬞닻㬬녯笎끓묙뇣שּׁ낳㬇덻笂뉋묗낷笥댧笉닗묃뉫묓녇묭닣㬲놇㬪늻㬚덷묪뇟\ufb1a끳笂녓﬩녧\ufb09늿笙닛묘뀓묷댣笕닛ﬗ눟笂낇笿뎣㬱뇻묰뉗ﬓ늷㬲넷יִ뀣笒뀷묮끇\ufb09눟笐돿\ufb0e녣ﬣ닏㬔댷㬕늗묝넻㬺뉯묿넳שׂ댇묟뉧무뇻묃낧묃넷笢뀣㬋뉏笞늳㬗녧㬸닏묐돛묝닏笀녋笫댃묭녗笽댇묘덿묥놳묅낣\ufb0a뇿笶뀛笇눧묀늯ײַ냻㬨덃㬝늻㬒닏\ufb0b녧물뉳זּ녳㬫돓㬁뉏笷뇯\ufb1a놯㬘녗笫뀳묗뉏\ufb11댫묚뀳ﬨ돣㬔눧묇눓묜넏묻돫㬽뀿笧닿笋늣בּ낗묒냃笂뇣묤낧㬙닏묟뉯笑끫笠댋\ufb08늻ﬂ뉷笟넻אָ뎛ﬡ녿דּ닿笂\u0011⼇㋐\u2e77닶ⱟ\uf2fbⳏ닱⼣㋏⳧\uf2f0ⵃ\uf2faⰛ\uf2f1⽻\u0018賩\ud8ce豑飻豩壎辝飅趩\ud8d6軉壖賱\ud8eb蹝壪踵\ud8e8赕飾这飙貅壻\n孯疄嫯㖳姗㖫奋\uf5a8宫떗(ꭱ媝꫁᪈ꫩ骟ꠁ媂ꭵ\udaacꦍ\udaa7ꮵ\uda82ꬅ\uda80\uab19媹ꨁ骎ꮁ骳ꮝ骱ꢹ\uda8f꩑᪨ꨙ骵\ua87d骺ꬥ骱ꣵ媠ꭥ᪨꣕᪕\n\ue920躠\ue8a0캗\ueb98캏\ueb04ຌ\ue9e4亳\u0010䇒搘䇾搷䎂搗䃮\ue40c䃦␊䂂搀䆶ꐺ䄦搲\n얾汩쐾ⱞ윆ⱆ잚\uec45앺걺"
         .length();
      String var29 = "ƞ넇笾뀟㬅덃笙눇\ufb07냳ﬡ눯㬏뎟ﬓ덻묝넳㬭덋מּ냟笳눟\ufb1a늫笢뇯㬒낧笒냿묮넓יִ늷묚뎻묜낷笠댛笗뉯笃닟ﬔ녧ﬥ눿묡뀧묷닿笂늷㬼냳묄낗\ufb1a녇符끇㬞덏笙늧㬞뀿第덣ﬀ늇묔늿ﬓ녓\ufb3d늓묱넛㬣눣ﬃ늣笥녧㬟뇋笀놳笪뇟\ufb08눯笜늣ﬅ끣וּ돧笛늳笕늫笐뀟\ufb3f댷㬿녻묰닿㬕덛㬾냳笜끓笇뀫㬣냿묋눋㬜눗\ufb0f녫第덧笞뎫\ufb08눯ﬡ놫묵덻묻냻묮뉏㬞댛שׂ놯\ufb0a뀗묀넯גּ끻묎닗묜늃笕놫笨눛笍뉃\ufb10늏笀놧㬲덃\ufb3f낧묫돃笉닯笽넧ﬕ냟ﬔ뇣묿냃묃닷笗돯笚낗묠덗笗뎻笊눋묉넯㬺덓מּ끿ﬣ뉗㬞닻㬬녯笎끓묙뇣שּׁ낳㬇덻笂뉋묗낷笥댧笉닗묃뉫묓녇묭닣㬲놇㬪늻㬚덷묪뇟\ufb1a끳笂녓﬩녧\ufb09늿笙닛묘뀓묷댣笕닛ﬗ눟笂낇笿뎣㬱뇻묰뉗ﬓ늷㬲넷יִ뀣笒뀷묮끇\ufb09눟笐돿\ufb0e녣ﬣ닏㬔댷㬕늗묝넻㬺뉯묿넳שׂ댇묟뉧무뇻묃낧묃넷笢뀣㬋뉏笞늳㬗녧㬸닏묐돛묝닏笀녋笫댃묭녗笽댇묘덿묥놳묅낣\ufb0a뇿笶뀛笇눧묀늯ײַ냻㬨덃㬝늻㬒닏\ufb0b녧물뉳זּ녳㬫돓㬁뉏笷뇯\ufb1a놯㬘녗笫뀳묗뉏\ufb11댫묚뀳ﬨ돣㬔눧묇눓묜넏묻돫㬽뀿笧닿笋늣בּ낗묒냃笂뇣묤낧㬙닏묟뉯笑끫笠댋\ufb08늻ﬂ뉷笟넻אָ뎛ﬡ녿דּ닿笂\u0011⼇㋐\u2e77닶ⱟ\uf2fbⳏ닱⼣㋏⳧\uf2f0ⵃ\uf2faⰛ\uf2f1⽻\u0018賩\ud8ce豑飻豩壎辝飅趩\ud8d6軉壖賱\ud8eb蹝壪踵\ud8e8赕飾这飙貅壻\n孯疄嫯㖳姗㖫奋\uf5a8宫떗(ꭱ媝꫁᪈ꫩ骟ꠁ媂ꭵ\udaacꦍ\udaa7ꮵ\uda82ꬅ\uda80\uab19媹ꨁ骎ꮁ骳ꮝ骱ꢹ\uda8f꩑᪨ꨙ骵\ua87d骺ꬥ骱ꣵ媠ꭥ᪨꣕᪕\n\ue920躠\ue8a0캗\ueb98캏\ueb04ຌ\ue9e4亳\u0010䇒搘䇾搷䎂搗䃮\ue40c䃦␊䂂搀䆶ꐺ䄦搲\n얾汩쐾ⱞ윆ⱆ잚\uec45앺걺";
      short var34 = 7722;
      String[] var31 = new String[8];

      do {
         char var35 = var29.charAt(var33);
         int var10001 = var33 + 1;
         int var10002 = var33 + 1 + var35;
         int var37 = 0;
         char[] var36 = var29.substring(var10001, var10002).toCharArray();

         do {
            char var38 = var36[var37];
            if (var37 % 2 == 0) {
               var36[var37] = (char)((var38 >>> 2 | var38 << 14) & 65535 ^ var34);
            } else {
               var36[var37] = (char)((var38 << 2 | var38 >>> 14) & 65535 ^ var34);
            }
         } while (++var37 < var36.length);

         var31[var32] = new String(var36);
         var32++;
         var33 = var33 + var35 + 1;
      } while (var33 < var30);

      abaaa = var31;
      abaab = new Object[var31.length];
      int var25 = -1416503449;
      byte[] var23 = "éëowrp\u0003¤\u0003lÈ«o\u0097ì¡\u001d\u0080GäXé:\u0016ÇmôÛç!\ffq×F¡fß}rWõ\u0083Ýbª'ºê\u009aI>ä\u009fcCHH\u0000PÏ#H¤ dpQ¤gü°\u001c\u0017\u001eî8\u0085p\u001e`÷OsÝE\u009b×Çë+\u0097'ù+\r³Ê8ðYò}+` Ýa>-µØ\u009b\u0088Éö%\u0098ðà\u0089U\u0012R\u0004\r¨Þ\u0088>\u0097ëE\u0000:F\u0088:V\u0000ø\u0013í\\ÿ¶8\n\u0002ÉBò0\u0004L\b\f\u008d@qec\u008a¢ãíÉ\bcY½\u0010m¹ýÈïÞëÚÕLô\u0096¢FÑ\u0080\u001eCó»Fdk11Ó\u009c'\u0088~o\u0019î¡LÞnÏ\u009eîÂ\u0010¼q:9\u007fCúa\u008c-üJ\\>\u008e\u0091-\u0092àËxèY\u0019î\u0000ñ@Ñ$Ï\u0005\u0011ì@ZÄéª\u000f\u001b°'ôYu"
         .getBytes("ISO-8859-1");
      int var24 = var23.length / 4;
      ab = new int[var24];
      byte var26 = 0;
      int var27 = 0;

      do {
         int var28 = (var23[var26] & 255) << 24 | (var23[var26 + 1] & 255) << 16 | (var23[var26 + 2] & 255) << 8 | var23[var26 + 3] & 255;
         var28 ^= var25;
         ab[var27] = var28;
         var26 += 4;
      } while (++var27 < var24);

      String[] var16 = new String[a(-1715322243, var39 ^ 475922343)];
      int var20 = 0;
      String var19;
      int var21 = (var19 = b(693, -1891804706, (char)'\ue70b')).length();
      int var18 = a(-1715322254, var39 ^ -1968458392);
      int var42 = -1;

      label121:
      while (true) {
         String var10000 = var19.substring(++var42, var42 + var18);
         int var46 = -1;

         while (true) {
            char[] var63;
            label116: {
               char[] var48 = var10000.toCharArray();
               int var10003 = var48.length;
               int var22 = 0;
               var63 = var48;
               var46 = var10003;
               char[] var73;
               int var10004;
               if (var10003 <= 1) {
                  var73 = var48;
                  var10004 = var22;
               } else {
                  var63 = var48;
                  var46 = var10003;
                  if (var10003 <= var22) {
                     break label116;
                  }

                  var73 = var48;
                  var10004 = var22;
               }

               while (true) {
                  var73[var10004] = (char)(var73[var10004] ^ switch (var22 % a(-1715322256, var39 ^ -1400278549)) {
                     case 0 -> a(-1715322255, var39 ^ -1713974186);
                     case 1 -> a(-1715322250, var39 ^ 300333750);
                     case 2 -> a(-1715322249, var39 ^ 535007400);
                     case 3 -> a(-1715322252, var39 ^ -1288375396);
                     case 4 -> a(-1715322251, var39 ^ 878689103);
                     case 5 -> a(-1715322262, var39 ^ 1528333191);
                     default -> a(-1715322261, var39 ^ 1595608900);
                  });
                  var22++;
                  if (var46 == 0) {
                     var10004 = var46;
                     var73 = var63;
                  } else {
                     if (var46 <= var22) {
                        break;
                     }

                     var73 = var63;
                     var10004 = var22;
                  }
               }
            }

            String var80 = new String(var63).intern();
            switch (var46) {
               case 0:
                  var16[var20++] = var80;
                  if ((var42 += var18) >= var21) {
                     long var8 = 8304689977092818070L;
                     long[] var14 = new long[3];
                     int var11 = 0;
                     String var12;
                     int var13 = (var12 = b('ቷ', -1891804708, 30884)).length();
                     byte var10 = 0;

                     do {
                        int var55 = var10;
                        var10 += 8;
                        byte[] var15 = var12.substring(var55, var10).getBytes(b('\uf5eb', -1891804707, 10962));
                        var55 = var11++;
                        long var84 = (
                              (var15[0] & 255L) << a(-1715322264, var39 ^ -412357359)
                                 | (var15[1] & 255L) << a(-1715322263, var39 ^ -1007057944)
                                 | (var15[2] & 255L) << a(-1715322258, var39 ^ -1685340998)
                                 | (var15[3] & 255L) << a(-1715322257, var39 ^ 641296407)
                                 | (var15[4] & 255L) << a(-1715322260, var39 ^ 1016584268)
                                 | (var15[5] & 255L) << a(-1715322259, var39 ^ -595207969)
                                 | (var15[a(-1715322270, var39 ^ 1219939031)] & 255L) << a(-1715322269, var39 ^ -1567715569)
                                 | var15[a(-1715322272, var39 ^ -1688457401)] & 255L
                           )
                           ^ var8;
                        byte var81 = -1;
                        var14[var55] = var84;
                     } while (var10 < var13);

                     aaaba = var14;
                     aaab = new Integer[3];
                     long var0 = 473372124583350061L;
                     long[] var6 = new long[a(-1715322271, var39 ^ -984528897)];
                     int var3 = 0;
                     String var4;
                     int var5 = (var4 = b('䵷', -1891804710, 11852)).length();
                     byte var2 = 0;

                     label90:
                     while (true) {
                        int var57 = var2;
                        var2 += 8;
                        byte[] var7 = var4.substring(var57, var2).getBytes(b((char)'\ud8d9', -1891804709, '\ueb75'));
                        long[] var45 = var6;
                        var57 = var3++;
                        long var69 = (var7[0] & 255L) << a(-1715322266, var39 ^ 1626618375)
                           | (var7[1] & 255L) << a(-1715322265, var39 ^ -555482344)
                           | (var7[2] & 255L) << a(-1715322268, var39 ^ 1915347345)
                           | (var7[3] & 255L) << a(-1715322267, var39 ^ -9348332)
                           | (var7[4] & 255L) << a(-1715322278, var39 ^ 1933730822)
                           | (var7[5] & 255L) << a(-1715322277, var39 ^ -1099118174)
                           | (var7[a(-1715322280, var39 ^ 1934009373)] & 255L) << a(-1715322279, var39 ^ 57614146)
                           | var7[a(-1715322274, var39 ^ 80398866)] & 255L;
                        byte var82 = -1;

                        while (true) {
                           long var86 = var69 ^ var0;
                           switch (var82) {
                              case 0:
                                 var45[var57] = var86;
                                 if (var2 >= var5) {
                                    aaa = var6;
                                    bb = new Long[a(-1715322284, var39 ^ 1496982418)];
                                    abbb = bbb(a(-1715322283, var39 ^ -448875313), 5594456674966682315L);
                                    bbb = bbb(a(-1715322294, var39 ^ -1122435598), 7657324748574387541L);
                                    bba = bbb(a(-1715322293, var39 ^ -894505631), 8223811368831617234L);
                                    bbab = aabbaaaba.aaab(var16[a(-1715322296, var39 ^ 1929551124)]);
                                    bbba = aabbaaaba.aaab(var16[4]);
                                    abb = aabbaaaba.aaab(var16[1]);
                                    aaabb = aabbaaaba.aaab(var16[a(-1715322295, var39 ^ 366853841)]);
                                    bbbb = aabbaaaba.aaab(var16[a(-1715322290, var39 ^ -1783403289)]);
                                    ba = aabbaaaba.aaab(var16[a(-1715322289, var39 ^ 963399559)]);
                                    bab = aabbaaaba.aaab(var16[5]);
                                    baba = aabbaaaba.aaab(var16[2]);
                                    bbaa = aabbaaaba.aaab(var16[a(-1715322292, var39 ^ -1052406604)]);
                                    abba = aabbaaaba.aaab(var16[3]);
                                    aa = aabbaaaba.aaab(var16[a(-1715322291, var39 ^ 18710490)]);
                                    aaba = aabbaaaba.aaab(var16[0]);
                                    aabab = aabbaaaba.aaab(var16[a(-1715322302, var39 ^ 121024452)]);
                                    return;
                                 }
                                 break;
                              default:
                                 var45[var57] = var86;
                                 if (var2 < var5) {
                                    continue label90;
                                 }

                                 var5 = (var4 = b((char)'釯', -1891804712, 2113)).length();
                                 var2 = 0;
                           }

                           byte var59 = var2;
                           var2 += 8;
                           var7 = var4.substring(var59, var2).getBytes(b((char)'뭍', -1891804711, 964));
                           var45 = var6;
                           var57 = var3++;
                           var69 = (var7[0] & 255L) << a(-1715322273, var39 ^ -105533126)
                              | (var7[1] & 255L) << a(-1715322276, var39 ^ -881279029)
                              | (var7[2] & 255L) << a(-1715322275, var39 ^ -135154805)
                              | (var7[3] & 255L) << a(-1715322286, var39 ^ -1642104481)
                              | (var7[4] & 255L) << a(-1715322285, var39 ^ 412170988)
                              | (var7[5] & 255L) << a(-1715322288, var39 ^ -1742385409)
                              | (var7[a(-1715322287, var39 ^ -1765470244)] & 255L) << a(-1715322282, var39 ^ 346167755)
                              | var7[a(-1715322281, var39 ^ 774899335)] & 255L;
                           var82 = 0;
                        }
                     }
                  }

                  var18 = var19.charAt(var42);
                  break;
               default:
                  var16[var20++] = var80;
                  if ((var42 += var18) < var21) {
                     var18 = var19.charAt(var42);
                     continue label121;
                  }

                  var21 = (var19 = b('퉎', -1891804705, 'ၲ')).length();
                  var18 = a(-1715322253, var39 ^ -1650225338);
                  var42 = -1;
            }

            var10000 = var19.substring(++var42, var42 + var18);
            var46 = 0;
         }
      }
   }

   private void aaab() {
      // $VF: Couldn't be decompiled
      // Please report this to the Vineflower issue tracker, at https://github.com/Vineflower/vineflower/issues with a copy of the class file (if you have the rights to distribute it!)
      // java.lang.RuntimeException: parsing failure!
      //   at org.jetbrains.java.decompiler.modules.decompiler.decompose.DomHelper.parseGraph(DomHelper.java:211)
      //   at org.jetbrains.java.decompiler.main.rels.MethodProcessor.codeToJava(MethodProcessor.java:166)
      //
      // Bytecode:
      // 00: getstatic qeaa361f143ee4a0894bd168fd9b30c66/qf4ccf8f5435d4a78bdca4d6a018b578e/aabbabbab.ab I
      // 03: aload 0
      // 04: getfield qeaa361f143ee4a0894bd168fd9b30c66/qf4ccf8f5435d4a78bdca4d6a018b578e/aaabbbbbb.aabaa [Ljavax/sound/sampled/Clip;
      // 07: dup
      // 08: astore 2
      // 09: monitorenter
      // 0a: istore 1
      // 0b: bipush 0
      // 0c: istore 3
      // 0d: iload 3
      // 0e: aload 0
      // 0f: getfield qeaa361f143ee4a0894bd168fd9b30c66/qf4ccf8f5435d4a78bdca4d6a018b578e/aaabbbbbb.aabaa [Ljavax/sound/sampled/Clip;
      // 12: arraylength
      // 13: if_icmpge 69
      // 16: iload 1
      // 17: ifne 6b
      // 1a: aload 0
      // 1b: getfield qeaa361f143ee4a0894bd168fd9b30c66/qf4ccf8f5435d4a78bdca4d6a018b578e/aaabbbbbb.aabaa [Ljavax/sound/sampled/Clip;
      // 1e: iload 3
      // 1f: aaload
      // 20: astore 4
      // 22: iload 1
      // 23: ifne 65
      // 26: aload 4
      // 28: ifnull 62
      // 2b: goto 2f
      // 2e: athrow
      // 2f: aload 4
      // 31: iload 1
      // 32: ifne 4e
      // 35: invokeinterface javax/sound/sampled/Clip.isRunning ()Z 1
      // 3a: ifeq 4c
      // 3d: goto 41
      // 40: athrow
      // 41: aload 4
      // 43: invokeinterface javax/sound/sampled/Clip.stop ()V 1
      // 48: goto 4c
      // 4b: athrow
      // 4c: aload 4
      // 4e: invokeinterface javax/sound/sampled/Clip.close ()V 1
      // 53: goto 5b
      // 56: astore 5
      // 58: aload 5
      // 5a: pop
      // 5b: aload 0
      // 5c: getfield qeaa361f143ee4a0894bd168fd9b30c66/qf4ccf8f5435d4a78bdca4d6a018b578e/aaabbbbbb.aabaa [Ljavax/sound/sampled/Clip;
      // 5f: iload 3
      // 60: aconst_null
      // 61: aastore
      // 62: iinc 3 1
      // 65: iload 1
      // 66: ifeq 0d
      // 69: aload 2
      // 6a: monitorexit
      // 6b: goto 75
      // 6e: astore 6
      // 70: aload 2
      // 71: monitorexit
      // 72: aload 6
      // 74: athrow
      // 75: return
   }

   private void aaba(int var1, double var2) {
      CompletableFuture.runAsync(this::ab);
   }

   public aaabbbbbb(baaaabaa var1) {
      super(bbab, bbaabbba.bba, bbba);
      this.baaa = (baabaab)this.abbbaaa(
         new baabaab(abb, ababbaba.class, ababbaba.b)
      );
      this.abaa = (baabaab)this.abbbaaa(
         new baabaab(aaabb, aabbbbba.class, aabbbbba.aaa)
      );
      this.abab = (bababa)this.abbbaaa(new bababa(bbbb, 100.0, 0.0, 100.0, 5.0).bba(ba));
      this.aaaab = new Random();
      this.aabaa = new Clip[4];
      this.aabba = new Clip[2];
      this.aabbb = bab(a(-1715322300, 1345121691 ^ 572833803), 4861292494678514042L);
      this.baab = bab(a(-1715322299, 1345121691 ^ -932110509), 4861292494678514042L);
      this.aba = 0L;
      this.baa = bab(a(-1715322310, 1345121691 ^ 1166695913), 4861292494678514042L);
      this.aaaa = 0L;
      this.aabb = 0L;
      this.babb = var1;
   }
}
