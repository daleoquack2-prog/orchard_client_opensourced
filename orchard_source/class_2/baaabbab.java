package nsc;

import java.io.DataInputStream;
import java.io.InputStream;
import java.net.InetAddress;
import java.nio.charset.StandardCharsets;
import java.security.MessageDigest;
import java.util.Arrays;
import java.util.Map;
import java.util.Set;
import java.util.UUID;
import java.util.concurrent.ConcurrentHashMap;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.atomic.AtomicInteger;
import java.util.function.Consumer;
import net.fabricmc.api.EnvType;
import net.fabricmc.api.Environment;
import net.minecraft.class_2596;

@Environment(EnvType.CLIENT)
public final class baaabbab {
   private static final long[] aa;
   private static final int ab;
   private static final long[] b;
   private static final String[] ba;
   private static final ExecutorService bb;
   private static final Integer[] aaa;
   private static final String[] aab;
   private static final byte[][] aba;
   private static final Map abb;
   private static final String[] abba;
   private static final ababbbbaa baa;
   private static final Long[] bab;
   private static final ababbbbaa bba;
   private static final long bbb;
   private static final Object[] abbb;
   private static final int aaaa;
   private static final ababbbbaa a;
   private static final ababbbbaa aaab;
   private static final Set aaba;
   private static final int[] abab;
   private static final int aabb;
   private static final AtomicInteger abaa;

   private static void aa(ababbbbaa var0, ababbbbaa var1) {
      int var10000 = aabbabbab.ab;
      abab var3 = abab.aa();
      int var2 = var10000;

      label20: {
         try {
            var5 = var3;
            if (var2 != 0) {
               break label20;
            }

            if (var3 == null) {
               return;
            }
         } catch (MatchException var4) {
            throw var4;
         }

         var5 = var3;
      }

      var5.abb(ababaaaaa.ab, var0, var1, abba(aabab(-1967603682, 2048623749 ^ -842191913), 4858720805902683609L));
   }

   private static boolean ab(String param0) {
      // $VF: Couldn't be decompiled
      // Please report this to the Vineflower issue tracker, at https://github.com/Vineflower/vineflower/issues with a copy of the class file (if you have the rights to distribute it!)
      // java.lang.RuntimeException: parsing failure!
      //   at org.jetbrains.java.decompiler.modules.decompiler.decompose.DomHelper.parseGraph(DomHelper.java:211)
      //   at org.jetbrains.java.decompiler.main.rels.MethodProcessor.codeToJava(MethodProcessor.java:166)
      //
      // Bytecode:
      // 00: getstatic qeaa361f143ee4a0894bd168fd9b30c66/qf4ccf8f5435d4a78bdca4d6a018b578e/aabbabbab.ab I
      // 03: invokestatic java/lang/System.currentTimeMillis ()J
      // 06: lstore 2
      // 07: istore 1
      // 08: getstatic qeaa361f143ee4a0894bd168fd9b30c66/qf4ccf8f5435d4a78bdca4d6a018b578e/baaabbab.abb Ljava/util/Map;
      // 0b: aload 0
      // 0c: invokeinterface java/util/Map.get (Ljava/lang/Object;)Ljava/lang/Object; 2
      // 11: checkcast java/lang/Long
      // 14: astore 4
      // 16: iload 1
      // 17: ifne 5b
      // 1a: aload 4
      // 1c: ifnull 4d
      // 1f: goto 23
      // 22: athrow
      // 23: lload 2
      // 24: aload 4
      // 26: invokevirtual java/lang/Long.longValue ()J
      // 29: lsub
      // 2a: ldc -1967603681
      // 2c: ldc 244969810
      // 2e: ldc -1301478939
      // 30: ixor
      // 31: invokestatic qeaa361f143ee4a0894bd168fd9b30c66/qf4ccf8f5435d4a78bdca4d6a018b578e/baaabbab.aabab (II)I
      // 34: ldc2_w 7787540674722307422
      // 37: invokestatic qeaa361f143ee4a0894bd168fd9b30c66/qf4ccf8f5435d4a78bdca4d6a018b578e/baaabbab.abba (IJ)J
      // 3a: lcmp
      // 3b: iload 1
      // 3c: ifne 5c
      // 3f: goto 43
      // 42: athrow
      // 43: ifge 4d
      // 46: goto 4a
      // 49: athrow
      // 4a: bipush 1
      // 4b: ireturn
      // 4c: athrow
      // 4d: getstatic qeaa361f143ee4a0894bd168fd9b30c66/qf4ccf8f5435d4a78bdca4d6a018b578e/baaabbab.abb Ljava/util/Map;
      // 50: aload 0
      // 51: lload 2
      // 52: invokestatic java/lang/Long.valueOf (J)Ljava/lang/Long;
      // 55: invokeinterface java/util/Map.put (Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object; 3
      // 5a: pop
      // 5b: bipush 0
      // 5c: ireturn
   }

   static boolean ba(class_2596 param0, boolean param1) {
      // $VF: Couldn't be decompiled
      // Please report this to the Vineflower issue tracker, at https://github.com/Vineflower/vineflower/issues with a copy of the class file (if you have the rights to distribute it!)
      // java.lang.RuntimeException: parsing failure!
      //   at org.jetbrains.java.decompiler.modules.decompiler.decompose.DomHelper.parseGraph(DomHelper.java:211)
      //   at org.jetbrains.java.decompiler.main.rels.MethodProcessor.codeToJava(MethodProcessor.java:166)
      //
      // Bytecode:
      // 000: ldc 1071402338
      // 002: istore 11
      // 004: getstatic qeaa361f143ee4a0894bd168fd9b30c66/qf4ccf8f5435d4a78bdca4d6a018b578e/aabbabbab.ab I
      // 007: istore 2
      // 008: iload 1
      // 009: iload 2
      // 00a: ifne 01b
      // 00d: ifne 017
      // 010: goto 014
      // 013: athrow
      // 014: bipush 0
      // 015: ireturn
      // 016: athrow
      // 017: aload 0
      // 018: instanceof net/minecraft/class_2817
      // 01b: iload 2
      // 01c: ifne 034
      // 01f: ifeq 02f
      // 022: goto 026
      // 025: athrow
      // 026: aload 0
      // 027: checkcast net/minecraft/class_2817
      // 02a: astore 3
      // 02b: iload 2
      // 02c: ifeq 035
      // 02f: bipush 0
      // 030: goto 034
      // 033: athrow
      // 034: ireturn
      // 035: aload 3
      // 036: invokevirtual net/minecraft/class_2817.comp_1647 ()Lnet/minecraft/class_8710;
      // 039: astore 4
      // 03b: aload 4
      // 03d: instanceof net/minecraft/class_8709
      // 040: iload 2
      // 041: ifne 089
      // 044: ifne 084
      // 047: goto 04b
      // 04a: athrow
      // 04b: aload 4
      // 04d: invokeinterface net/minecraft/class_8710.method_56479 ()Lnet/minecraft/class_8710$class_9154; 1
      // 052: invokevirtual net/minecraft/class_8710$class_9154.comp_2242 ()Lnet/minecraft/class_2960;
      // 055: iload 2
      // 056: ifne 094
      // 059: goto 05d
      // 05c: athrow
      // 05d: invokevirtual net/minecraft/class_2960.method_12832 ()Ljava/lang/String;
      // 060: ldc -1967603684
      // 062: iload 11
      // 064: ldc 277943126
      // 066: ixor
      // 067: invokestatic qeaa361f143ee4a0894bd168fd9b30c66/qf4ccf8f5435d4a78bdca4d6a018b578e/baaabbab.aabab (II)I
      // 06a: ldc -1967603683
      // 06c: iload 11
      // 06e: ldc 1505483844
      // 070: ixor
      // 071: invokestatic qeaa361f143ee4a0894bd168fd9b30c66/qf4ccf8f5435d4a78bdca4d6a018b578e/baaabbab.aabab (II)I
      // 074: invokestatic qeaa361f143ee4a0894bd168fd9b30c66/qf4ccf8f5435d4a78bdca4d6a018b578e/baaabbab.baab (II)Ljava/lang/String;
      // 077: invokestatic qeaa361f143ee4a0894bd168fd9b30c66/qf4ccf8f5435d4a78bdca4d6a018b578e/aabbaaaba.abba (Ljava/lang/String;)Ljava/lang/String;
      // 07a: invokevirtual java/lang/String.equals (Ljava/lang/Object;)Z
      // 07d: ifeq 08a
      // 080: goto 084
      // 083: athrow
      // 084: bipush 0
      // 085: goto 089
      // 088: athrow
      // 089: ireturn
      // 08a: aload 4
      // 08c: invokeinterface net/minecraft/class_8710.method_56479 ()Lnet/minecraft/class_8710$class_9154; 1
      // 091: invokevirtual net/minecraft/class_8710$class_9154.comp_2242 ()Lnet/minecraft/class_2960;
      // 094: invokevirtual net/minecraft/class_2960.toString ()Ljava/lang/String;
      // 097: astore 5
      // 099: invokestatic qeaa361f143ee4a0894bd168fd9b30c66/qf4ccf8f5435d4a78bdca4d6a018b578e/bbbaaba.aaaaa ()Z
      // 09c: iload 2
      // 09d: ifne 0a8
      // 0a0: ifeq 0a9
      // 0a3: goto 0a7
      // 0a6: athrow
      // 0a7: bipush 0
      // 0a8: ireturn
      // 0a9: invokestatic qeaa361f143ee4a0894bd168fd9b30c66/qf4ccf8f5435d4a78bdca4d6a018b578e/abaaaaaba.aaaaa ()Lqeaa361f143ee4a0894bd168fd9b30c66/qf4ccf8f5435d4a78bdca4d6a018b578e/abaaaaaba;
      // 0ac: astore 6
      // 0ae: iload 2
      // 0af: ifne 1b3
      // 0b2: aload 6
      // 0b4: ifnull 177
      // 0b7: goto 0bb
      // 0ba: athrow
      // 0bb: aload 6
      // 0bd: iload 2
      // 0be: ifne 0d5
      // 0c1: goto 0c5
      // 0c4: athrow
      // 0c5: invokevirtual qeaa361f143ee4a0894bd168fd9b30c66/qf4ccf8f5435d4a78bdca4d6a018b578e/abaaaaaba.aaba ()Lqeaa361f143ee4a0894bd168fd9b30c66/qf4ccf8f5435d4a78bdca4d6a018b578e/babbaba;
      // 0c8: ifnull 177
      // 0cb: goto 0cf
      // 0ce: athrow
      // 0cf: aload 6
      // 0d1: goto 0d5
      // 0d4: athrow
      // 0d5: invokevirtual qeaa361f143ee4a0894bd168fd9b30c66/qf4ccf8f5435d4a78bdca4d6a018b578e/abaaaaaba.aaba ()Lqeaa361f143ee4a0894bd168fd9b30c66/qf4ccf8f5435d4a78bdca4d6a018b578e/babbaba;
      // 0d8: invokevirtual qeaa361f143ee4a0894bd168fd9b30c66/qf4ccf8f5435d4a78bdca4d6a018b578e/babbaba.abbbbb ()Lqeaa361f143ee4a0894bd168fd9b30c66/qf4ccf8f5435d4a78bdca4d6a018b578e/bbbaaba;
      // 0db: astore 7
      // 0dd: iload 2
      // 0de: ifne 1b3
      // 0e1: aload 7
      // 0e3: ifnull 177
      // 0e6: goto 0ea
      // 0e9: athrow
      // 0ea: aload 7
      // 0ec: invokevirtual qeaa361f143ee4a0894bd168fd9b30c66/qf4ccf8f5435d4a78bdca4d6a018b578e/bbbaaba.babbb ()Z
      // 0ef: iload 2
      // 0f0: ifne 1b4
      // 0f3: goto 0f7
      // 0f6: athrow
      // 0f7: ifeq 177
      // 0fa: goto 0fe
      // 0fd: athrow
      // 0fe: aload 7
      // 100: invokevirtual qeaa361f143ee4a0894bd168fd9b30c66/qf4ccf8f5435d4a78bdca4d6a018b578e/bbbaaba.bba ()Z
      // 103: iload 2
      // 104: ifne 1b4
      // 107: goto 10b
      // 10a: athrow
      // 10b: ifeq 177
      // 10e: goto 112
      // 111: athrow
      // 112: aload 7
      // 114: iload 2
      // 115: ifne 164
      // 118: goto 11c
      // 11b: athrow
      // 11c: aload 5
      // 11e: invokevirtual qeaa361f143ee4a0894bd168fd9b30c66/qf4ccf8f5435d4a78bdca4d6a018b578e/bbbaaba.baabb (Ljava/lang/String;)Z
      // 121: ifeq 162
      // 124: goto 128
      // 127: athrow
      // 128: ldc -1967603686
      // 12a: iload 11
      // 12c: ldc -1303189244
      // 12e: ixor
      // 12f: invokestatic qeaa361f143ee4a0894bd168fd9b30c66/qf4ccf8f5435d4a78bdca4d6a018b578e/baaabbab.aabab (II)I
      // 132: ldc -1967603685
      // 134: iload 11
      // 136: ldc -1581096260
      // 138: ixor
      // 139: invokestatic qeaa361f143ee4a0894bd168fd9b30c66/qf4ccf8f5435d4a78bdca4d6a018b578e/baaabbab.aabab (II)I
      // 13c: invokestatic qeaa361f143ee4a0894bd168fd9b30c66/qf4ccf8f5435d4a78bdca4d6a018b578e/baaabbab.baab (II)Ljava/lang/String;
      // 13f: invokestatic qeaa361f143ee4a0894bd168fd9b30c66/qf4ccf8f5435d4a78bdca4d6a018b578e/aabbaaaba.abba (Ljava/lang/String;)Ljava/lang/String;
      // 142: aload 5
      // 144: astore 9
      // 146: astore 8
      // 148: new java/lang/StringBuilder
      // 14b: dup
      // 14c: invokespecial java/lang/StringBuilder.<init> ()V
      // 14f: aload 8
      // 151: invokevirtual java/lang/StringBuilder.append (Ljava/lang/Object;)Ljava/lang/StringBuilder;
      // 154: aload 9
      // 156: invokevirtual java/lang/StringBuilder.append (Ljava/lang/Object;)Ljava/lang/StringBuilder;
      // 159: invokevirtual java/lang/StringBuilder.toString ()Ljava/lang/String;
      // 15c: invokestatic qeaa361f143ee4a0894bd168fd9b30c66/qf4ccf8f5435d4a78bdca4d6a018b578e/bbbaaba.aaa (Ljava/lang/String;)V
      // 15f: bipush 1
      // 160: ireturn
      // 161: athrow
      // 162: aload 7
      // 164: aload 5
      // 166: invokevirtual qeaa361f143ee4a0894bd168fd9b30c66/qf4ccf8f5435d4a78bdca4d6a018b578e/bbbaaba.abaa (Ljava/lang/String;)Z
      // 169: iload 2
      // 16a: ifne 1b4
      // 16d: ifeq 177
      // 170: goto 174
      // 173: athrow
      // 174: bipush 0
      // 175: ireturn
      // 176: athrow
      // 177: ldc -1967603688
      // 179: iload 11
      // 17b: ldc 1369706735
      // 17d: ixor
      // 17e: invokestatic qeaa361f143ee4a0894bd168fd9b30c66/qf4ccf8f5435d4a78bdca4d6a018b578e/baaabbab.aabab (II)I
      // 181: ldc -1967603687
      // 183: iload 11
      // 185: ldc -1322836549
      // 187: ixor
      // 188: invokestatic qeaa361f143ee4a0894bd168fd9b30c66/qf4ccf8f5435d4a78bdca4d6a018b578e/baaabbab.aabab (II)I
      // 18b: invokestatic qeaa361f143ee4a0894bd168fd9b30c66/qf4ccf8f5435d4a78bdca4d6a018b578e/baaabbab.baab (II)Ljava/lang/String;
      // 18e: invokestatic qeaa361f143ee4a0894bd168fd9b30c66/qf4ccf8f5435d4a78bdca4d6a018b578e/aabbaaaba.abba (Ljava/lang/String;)Ljava/lang/String;
      // 191: aload 5
      // 193: astore 10
      // 195: astore 9
      // 197: new java/lang/StringBuilder
      // 19a: dup
      // 19b: invokespecial java/lang/StringBuilder.<init> ()V
      // 19e: aload 9
      // 1a0: invokevirtual java/lang/StringBuilder.append (Ljava/lang/Object;)Ljava/lang/StringBuilder;
      // 1a3: aload 10
      // 1a5: invokevirtual java/lang/StringBuilder.append (Ljava/lang/Object;)Ljava/lang/StringBuilder;
      // 1a8: invokevirtual java/lang/StringBuilder.toString ()Ljava/lang/String;
      // 1ab: invokestatic qeaa361f143ee4a0894bd168fd9b30c66/qf4ccf8f5435d4a78bdca4d6a018b578e/bbbaaba.aaa (Ljava/lang/String;)V
      // 1ae: aload 5
      // 1b0: invokestatic qeaa361f143ee4a0894bd168fd9b30c66/qf4ccf8f5435d4a78bdca4d6a018b578e/baaabbab.babb (Ljava/lang/String;)V
      // 1b3: bipush 1
      // 1b4: ireturn
   }

   public static boolean bb(String param0) {
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
      // 06: ifne 14
      // 09: ifnonnull 13
      // 0c: goto 10
      // 0f: athrow
      // 10: bipush 0
      // 11: ireturn
      // 12: athrow
      // 13: aload 0
      // 14: ldc -1967603690
      // 16: ldc -884360388
      // 18: ldc 1097537521
      // 1a: ixor
      // 1b: invokestatic qeaa361f143ee4a0894bd168fd9b30c66/qf4ccf8f5435d4a78bdca4d6a018b578e/baaabbab.aabab (II)I
      // 1e: ldc -1967603689
      // 20: ldc -884360388
      // 22: ldc -1972173469
      // 24: ixor
      // 25: invokestatic qeaa361f143ee4a0894bd168fd9b30c66/qf4ccf8f5435d4a78bdca4d6a018b578e/baaabbab.aabab (II)I
      // 28: invokestatic qeaa361f143ee4a0894bd168fd9b30c66/qf4ccf8f5435d4a78bdca4d6a018b578e/baaabbab.baab (II)Ljava/lang/String;
      // 2b: invokestatic qeaa361f143ee4a0894bd168fd9b30c66/qf4ccf8f5435d4a78bdca4d6a018b578e/aabbaaaba.abba (Ljava/lang/String;)Ljava/lang/String;
      // 2e: invokevirtual java/lang/String.startsWith (Ljava/lang/String;)Z
      // 31: iload 1
      // 32: ifne 43
      // 35: ifeq 3f
      // 38: goto 3c
      // 3b: athrow
      // 3c: bipush 1
      // 3d: ireturn
      // 3e: athrow
      // 3f: getstatic qeaa361f143ee4a0894bd168fd9b30c66/qf4ccf8f5435d4a78bdca4d6a018b578e/baaabbab.aba [[B
      // 42: arraylength
      // 43: iload 1
      // 44: ifne 4f
      // 47: ifne 50
      // 4a: goto 4e
      // 4d: athrow
      // 4e: bipush 0
      // 4f: ireturn
      // 50: aload 0
      // 51: invokestatic qeaa361f143ee4a0894bd168fd9b30c66/qf4ccf8f5435d4a78bdca4d6a018b578e/baaabbab.bbb (Ljava/lang/String;)[B
      // 54: astore 2
      // 55: aload 2
      // 56: ifnonnull 5c
      // 59: bipush 0
      // 5a: ireturn
      // 5b: athrow
      // 5c: bipush 0
      // 5d: istore 3
      // 5e: getstatic qeaa361f143ee4a0894bd168fd9b30c66/qf4ccf8f5435d4a78bdca4d6a018b578e/baaabbab.aba [[B
      // 61: arraylength
      // 62: bipush 1
      // 63: isub
      // 64: istore 4
      // 66: iload 3
      // 67: iload 4
      // 69: if_icmpgt b8
      // 6c: iload 3
      // 6d: iload 4
      // 6f: iadd
      // 70: bipush 1
      // 71: iushr
      // 72: istore 5
      // 74: getstatic qeaa361f143ee4a0894bd168fd9b30c66/qf4ccf8f5435d4a78bdca4d6a018b578e/baaabbab.aba [[B
      // 77: iload 5
      // 79: aaload
      // 7a: aload 2
      // 7b: invokestatic qeaa361f143ee4a0894bd168fd9b30c66/qf4ccf8f5435d4a78bdca4d6a018b578e/baaabbab.aaabb ([B[B)I
      // 7e: iload 1
      // 7f: ifne b9
      // 82: istore 6
      // 84: iload 6
      // 86: iload 1
      // 87: ifne 96
      // 8a: ifne 94
      // 8d: goto 91
      // 90: athrow
      // 91: bipush 1
      // 92: ireturn
      // 93: athrow
      // 94: iload 6
      // 96: iload 1
      // 97: ifne b2
      // 9a: ifge aa
      // 9d: goto a1
      // a0: athrow
      // a1: iload 5
      // a3: bipush 1
      // a4: iadd
      // a5: istore 3
      // a6: iload 1
      // a7: ifeq b4
      // aa: iload 5
      // ac: bipush 1
      // ad: isub
      // ae: goto b2
      // b1: athrow
      // b2: istore 4
      // b4: iload 1
      // b5: ifeq 66
      // b8: bipush 0
      // b9: ireturn
   }

   private static boolean aaa(byte param0, byte param1, byte param2, byte param3) {
      // $VF: Couldn't be decompiled
      // Please report this to the Vineflower issue tracker, at https://github.com/Vineflower/vineflower/issues with a copy of the class file (if you have the rights to distribute it!)
      // java.lang.RuntimeException: parsing failure!
      //   at org.jetbrains.java.decompiler.modules.decompiler.decompose.DomHelper.parseGraph(DomHelper.java:211)
      //   at org.jetbrains.java.decompiler.main.rels.MethodProcessor.codeToJava(MethodProcessor.java:166)
      //
      // Bytecode:
      // 000: ldc 569124423
      // 002: istore 7
      // 004: getstatic qeaa361f143ee4a0894bd168fd9b30c66/qf4ccf8f5435d4a78bdca4d6a018b578e/aabbabbab.ab I
      // 007: iload 0
      // 008: invokestatic java/lang/Byte.toUnsignedInt (B)I
      // 00b: istore 5
      // 00d: istore 4
      // 00f: iload 1
      // 010: invokestatic java/lang/Byte.toUnsignedInt (B)I
      // 013: istore 6
      // 015: iload 5
      // 017: iload 4
      // 019: ifne 16a
      // 01c: ifeq 165
      // 01f: goto 023
      // 022: athrow
      // 023: iload 5
      // 025: iload 4
      // 027: ifne 16a
      // 02a: goto 02e
      // 02d: athrow
      // 02e: ldc -1967603692
      // 030: iload 7
      // 032: ldc 1685893966
      // 034: ixor
      // 035: invokestatic qeaa361f143ee4a0894bd168fd9b30c66/qf4ccf8f5435d4a78bdca4d6a018b578e/baaabbab.aabab (II)I
      // 038: ldc2_w 3128984369015079355
      // 03b: invokestatic qeaa361f143ee4a0894bd168fd9b30c66/qf4ccf8f5435d4a78bdca4d6a018b578e/baaabbab.baa (IJ)I
      // 03e: if_icmpeq 165
      // 041: goto 045
      // 044: athrow
      // 045: iload 5
      // 047: iload 4
      // 049: ifne 16a
      // 04c: goto 050
      // 04f: athrow
      // 050: ldc_w -1967603691
      // 053: iload 7
      // 055: ldc_w -1854961606
      // 058: ixor
      // 059: invokestatic qeaa361f143ee4a0894bd168fd9b30c66/qf4ccf8f5435d4a78bdca4d6a018b578e/baaabbab.aabab (II)I
      // 05c: ldc2_w 2150485963425727167
      // 05f: invokestatic qeaa361f143ee4a0894bd168fd9b30c66/qf4ccf8f5435d4a78bdca4d6a018b578e/baaabbab.baa (IJ)I
      // 062: if_icmpeq 165
      // 065: goto 069
      // 068: athrow
      // 069: iload 5
      // 06b: iload 4
      // 06d: ifne 0b7
      // 070: goto 074
      // 073: athrow
      // 074: ldc_w -1967603694
      // 077: iload 7
      // 079: ldc_w -796233717
      // 07c: ixor
      // 07d: invokestatic qeaa361f143ee4a0894bd168fd9b30c66/qf4ccf8f5435d4a78bdca4d6a018b578e/baaabbab.aabab (II)I
      // 080: ldc2_w 6732482277841027484
      // 083: invokestatic qeaa361f143ee4a0894bd168fd9b30c66/qf4ccf8f5435d4a78bdca4d6a018b578e/baaabbab.baa (IJ)I
      // 086: if_icmpne 0b1
      // 089: goto 08d
      // 08c: athrow
      // 08d: iload 6
      // 08f: iload 4
      // 091: ifne 16a
      // 094: goto 098
      // 097: athrow
      // 098: ldc_w -1967603693
      // 09b: iload 7
      // 09d: ldc_w -693027196
      // 0a0: ixor
      // 0a1: invokestatic qeaa361f143ee4a0894bd168fd9b30c66/qf4ccf8f5435d4a78bdca4d6a018b578e/baaabbab.aabab (II)I
      // 0a4: ldc2_w 6316947202394579260
      // 0a7: invokestatic qeaa361f143ee4a0894bd168fd9b30c66/qf4ccf8f5435d4a78bdca4d6a018b578e/baaabbab.baa (IJ)I
      // 0aa: if_icmpeq 165
      // 0ad: goto 0b1
      // 0b0: athrow
      // 0b1: iload 5
      // 0b3: goto 0b7
      // 0b6: athrow
      // 0b7: iload 4
      // 0b9: ifne 123
      // 0bc: ldc_w -1967603696
      // 0bf: iload 7
      // 0c1: ldc_w 653292784
      // 0c4: ixor
      // 0c5: invokestatic qeaa361f143ee4a0894bd168fd9b30c66/qf4ccf8f5435d4a78bdca4d6a018b578e/baaabbab.aabab (II)I
      // 0c8: ldc2_w 8685143471837701856
      // 0cb: invokestatic qeaa361f143ee4a0894bd168fd9b30c66/qf4ccf8f5435d4a78bdca4d6a018b578e/baaabbab.baa (IJ)I
      // 0ce: if_icmpne 11d
      // 0d1: goto 0d5
      // 0d4: athrow
      // 0d5: iload 6
      // 0d7: iload 4
      // 0d9: ifne 123
      // 0dc: goto 0e0
      // 0df: athrow
      // 0e0: ldc_w -1967603695
      // 0e3: iload 7
      // 0e5: ldc_w -1329222939
      // 0e8: ixor
      // 0e9: invokestatic qeaa361f143ee4a0894bd168fd9b30c66/qf4ccf8f5435d4a78bdca4d6a018b578e/baaabbab.aabab (II)I
      // 0ec: ldc2_w 323908896753632580
      // 0ef: invokestatic qeaa361f143ee4a0894bd168fd9b30c66/qf4ccf8f5435d4a78bdca4d6a018b578e/baaabbab.baa (IJ)I
      // 0f2: if_icmplt 11d
      // 0f5: goto 0f9
      // 0f8: athrow
      // 0f9: iload 6
      // 0fb: iload 4
      // 0fd: ifne 16a
      // 100: goto 104
      // 103: athrow
      // 104: ldc_w -1967603698
      // 107: iload 7
      // 109: ldc_w 657844160
      // 10c: ixor
      // 10d: invokestatic qeaa361f143ee4a0894bd168fd9b30c66/qf4ccf8f5435d4a78bdca4d6a018b578e/baaabbab.aabab (II)I
      // 110: ldc2_w 7802348420605092402
      // 113: invokestatic qeaa361f143ee4a0894bd168fd9b30c66/qf4ccf8f5435d4a78bdca4d6a018b578e/baaabbab.baa (IJ)I
      // 116: if_icmple 165
      // 119: goto 11d
      // 11c: athrow
      // 11d: iload 5
      // 11f: goto 123
      // 122: athrow
      // 123: iload 4
      // 125: ifne 147
      // 128: ldc_w -1967603697
      // 12b: iload 7
      // 12d: ldc_w 1782568760
      // 130: ixor
      // 131: invokestatic qeaa361f143ee4a0894bd168fd9b30c66/qf4ccf8f5435d4a78bdca4d6a018b578e/baaabbab.aabab (II)I
      // 134: ldc2_w 4183054970270490536
      // 137: invokestatic qeaa361f143ee4a0894bd168fd9b30c66/qf4ccf8f5435d4a78bdca4d6a018b578e/baaabbab.baa (IJ)I
      // 13a: if_icmpne 16d
      // 13d: goto 141
      // 140: athrow
      // 141: iload 6
      // 143: goto 147
      // 146: athrow
      // 147: iload 4
      // 149: ifne 16a
      // 14c: ldc_w -1967603700
      // 14f: iload 7
      // 151: ldc_w 211073436
      // 154: ixor
      // 155: invokestatic qeaa361f143ee4a0894bd168fd9b30c66/qf4ccf8f5435d4a78bdca4d6a018b578e/baaabbab.aabab (II)I
      // 158: ldc2_w 2249460198057460570
      // 15b: invokestatic qeaa361f143ee4a0894bd168fd9b30c66/qf4ccf8f5435d4a78bdca4d6a018b578e/baaabbab.baa (IJ)I
      // 15e: if_icmpne 16d
      // 161: goto 165
      // 164: athrow
      // 165: bipush 1
      // 166: goto 16a
      // 169: athrow
      // 16a: goto 16e
      // 16d: bipush 0
      // 16e: ireturn
   }

   static class_2596 aab(class_2596 param0, boolean param1) {
      // $VF: Couldn't be decompiled
      // Please report this to the Vineflower issue tracker, at https://github.com/Vineflower/vineflower/issues with a copy of the class file (if you have the rights to distribute it!)
      // java.lang.RuntimeException: parsing failure!
      //   at org.jetbrains.java.decompiler.modules.decompiler.decompose.DomHelper.parseGraph(DomHelper.java:211)
      //   at org.jetbrains.java.decompiler.main.rels.MethodProcessor.codeToJava(MethodProcessor.java:166)
      //
      // Bytecode:
      // 000: ldc_w 1445587213
      // 003: istore 10
      // 005: getstatic qeaa361f143ee4a0894bd168fd9b30c66/qf4ccf8f5435d4a78bdca4d6a018b578e/aabbabbab.ab I
      // 008: istore 2
      // 009: iload 1
      // 00a: iload 2
      // 00b: ifne 024
      // 00e: ifne 018
      // 011: goto 015
      // 014: athrow
      // 015: aload 0
      // 016: areturn
      // 017: athrow
      // 018: aload 0
      // 019: iload 2
      // 01a: ifne 0d7
      // 01d: instanceof net/minecraft/class_9091
      // 020: goto 024
      // 023: athrow
      // 024: ifeq 0d6
      // 027: aload 0
      // 028: checkcast net/minecraft/class_9091
      // 02b: astore 3
      // 02c: invokestatic qeaa361f143ee4a0894bd168fd9b30c66/qf4ccf8f5435d4a78bdca4d6a018b578e/bbbaaba.abba ()Z
      // 02f: iload 2
      // 030: ifne 04d
      // 033: ifeq 0d4
      // 036: goto 03a
      // 039: athrow
      // 03a: aload 3
      // 03b: iload 2
      // 03c: ifne 0d5
      // 03f: goto 043
      // 042: athrow
      // 043: invokevirtual net/minecraft/class_9091.comp_2195 ()Lnet/minecraft/class_2960;
      // 046: invokestatic qeaa361f143ee4a0894bd168fd9b30c66/qf4ccf8f5435d4a78bdca4d6a018b578e/bbbaaba.babaa (Lnet/minecraft/class_2960;)Z
      // 049: goto 04d
      // 04c: athrow
      // 04d: ifeq 0d4
      // 050: invokestatic qeaa361f143ee4a0894bd168fd9b30c66/qf4ccf8f5435d4a78bdca4d6a018b578e/bbbaaba.aabba ()[B
      // 053: astore 4
      // 055: ldc_w -1967603699
      // 058: iload 10
      // 05a: ldc_w -557419239
      // 05d: ixor
      // 05e: invokestatic qeaa361f143ee4a0894bd168fd9b30c66/qf4ccf8f5435d4a78bdca4d6a018b578e/baaabbab.aabab (II)I
      // 061: ldc_w -1967603702
      // 064: iload 10
      // 066: ldc_w 1451619926
      // 069: ixor
      // 06a: invokestatic qeaa361f143ee4a0894bd168fd9b30c66/qf4ccf8f5435d4a78bdca4d6a018b578e/baaabbab.aabab (II)I
      // 06d: invokestatic qeaa361f143ee4a0894bd168fd9b30c66/qf4ccf8f5435d4a78bdca4d6a018b578e/baaabbab.baab (II)Ljava/lang/String;
      // 070: invokestatic qeaa361f143ee4a0894bd168fd9b30c66/qf4ccf8f5435d4a78bdca4d6a018b578e/aabbaaaba.abba (Ljava/lang/String;)Ljava/lang/String;
      // 073: aload 3
      // 074: invokevirtual net/minecraft/class_9091.comp_2195 ()Lnet/minecraft/class_2960;
      // 077: invokestatic java/lang/String.valueOf (Ljava/lang/Object;)Ljava/lang/String;
      // 07a: ldc_w -1967603701
      // 07d: iload 10
      // 07f: ldc_w 255451352
      // 082: ixor
      // 083: invokestatic qeaa361f143ee4a0894bd168fd9b30c66/qf4ccf8f5435d4a78bdca4d6a018b578e/baaabbab.aabab (II)I
      // 086: ldc_w -1967603704
      // 089: iload 10
      // 08b: ldc_w -1574018972
      // 08e: ixor
      // 08f: invokestatic qeaa361f143ee4a0894bd168fd9b30c66/qf4ccf8f5435d4a78bdca4d6a018b578e/baaabbab.aabab (II)I
      // 092: invokestatic qeaa361f143ee4a0894bd168fd9b30c66/qf4ccf8f5435d4a78bdca4d6a018b578e/baaabbab.baab (II)Ljava/lang/String;
      // 095: invokestatic qeaa361f143ee4a0894bd168fd9b30c66/qf4ccf8f5435d4a78bdca4d6a018b578e/aabbaaaba.abba (Ljava/lang/String;)Ljava/lang/String;
      // 098: aload 4
      // 09a: invokestatic qeaa361f143ee4a0894bd168fd9b30c66/qf4ccf8f5435d4a78bdca4d6a018b578e/bbbaaba.aa ([B)Ljava/lang/String;
      // 09d: astore 9
      // 09f: astore 8
      // 0a1: astore 7
      // 0a3: astore 6
      // 0a5: new java/lang/StringBuilder
      // 0a8: dup
      // 0a9: invokespecial java/lang/StringBuilder.<init> ()V
      // 0ac: aload 6
      // 0ae: invokevirtual java/lang/StringBuilder.append (Ljava/lang/Object;)Ljava/lang/StringBuilder;
      // 0b1: aload 7
      // 0b3: invokevirtual java/lang/StringBuilder.append (Ljava/lang/Object;)Ljava/lang/StringBuilder;
      // 0b6: aload 8
      // 0b8: invokevirtual java/lang/StringBuilder.append (Ljava/lang/Object;)Ljava/lang/StringBuilder;
      // 0bb: aload 9
      // 0bd: invokevirtual java/lang/StringBuilder.append (Ljava/lang/Object;)Ljava/lang/StringBuilder;
      // 0c0: invokevirtual java/lang/StringBuilder.toString ()Ljava/lang/String;
      // 0c3: invokestatic qeaa361f143ee4a0894bd168fd9b30c66/qf4ccf8f5435d4a78bdca4d6a018b578e/bbbaaba.aaa (Ljava/lang/String;)V
      // 0c6: new net/minecraft/class_9091
      // 0c9: dup
      // 0ca: aload 3
      // 0cb: invokevirtual net/minecraft/class_9091.comp_2195 ()Lnet/minecraft/class_2960;
      // 0ce: aload 4
      // 0d0: invokespecial net/minecraft/class_9091.<init> (Lnet/minecraft/class_2960;[B)V
      // 0d3: areturn
      // 0d4: aload 0
      // 0d5: areturn
      // 0d6: aload 0
      // 0d7: iload 2
      // 0d8: ifne 0f3
      // 0db: instanceof net/minecraft/class_2817
      // 0de: ifeq 0ee
      // 0e1: goto 0e5
      // 0e4: athrow
      // 0e5: aload 0
      // 0e6: checkcast net/minecraft/class_2817
      // 0e9: astore 3
      // 0ea: iload 2
      // 0eb: ifeq 0f4
      // 0ee: aload 0
      // 0ef: goto 0f3
      // 0f2: athrow
      // 0f3: areturn
      // 0f4: aload 3
      // 0f5: invokevirtual net/minecraft/class_2817.comp_1647 ()Lnet/minecraft/class_8710;
      // 0f8: astore 4
      // 0fa: aload 4
      // 0fc: instanceof net/minecraft/class_8709
      // 0ff: ifne 105
      // 102: aload 0
      // 103: areturn
      // 104: athrow
      // 105: invokestatic qeaa361f143ee4a0894bd168fd9b30c66/qf4ccf8f5435d4a78bdca4d6a018b578e/baaabbab.bbaa ()Ljava/lang/String;
      // 108: astore 5
      // 10a: ldc_w -1967603703
      // 10d: iload 10
      // 10f: ldc_w 1322042276
      // 112: ixor
      // 113: invokestatic qeaa361f143ee4a0894bd168fd9b30c66/qf4ccf8f5435d4a78bdca4d6a018b578e/baaabbab.aabab (II)I
      // 116: ldc_w -1967603706
      // 119: iload 10
      // 11b: ldc_w -184834223
      // 11e: ixor
      // 11f: invokestatic qeaa361f143ee4a0894bd168fd9b30c66/qf4ccf8f5435d4a78bdca4d6a018b578e/baaabbab.aabab (II)I
      // 122: invokestatic qeaa361f143ee4a0894bd168fd9b30c66/qf4ccf8f5435d4a78bdca4d6a018b578e/baaabbab.baab (II)Ljava/lang/String;
      // 125: invokestatic qeaa361f143ee4a0894bd168fd9b30c66/qf4ccf8f5435d4a78bdca4d6a018b578e/aabbaaaba.abba (Ljava/lang/String;)Ljava/lang/String;
      // 128: aload 5
      // 12a: ldc_w -1967603705
      // 12d: iload 10
      // 12f: ldc_w -172244503
      // 132: ixor
      // 133: invokestatic qeaa361f143ee4a0894bd168fd9b30c66/qf4ccf8f5435d4a78bdca4d6a018b578e/baaabbab.aabab (II)I
      // 136: ldc_w -1967603708
      // 139: iload 10
      // 13b: ldc_w -646892542
      // 13e: ixor
      // 13f: invokestatic qeaa361f143ee4a0894bd168fd9b30c66/qf4ccf8f5435d4a78bdca4d6a018b578e/baaabbab.aabab (II)I
      // 142: invokestatic qeaa361f143ee4a0894bd168fd9b30c66/qf4ccf8f5435d4a78bdca4d6a018b578e/baaabbab.baab (II)Ljava/lang/String;
      // 145: invokestatic qeaa361f143ee4a0894bd168fd9b30c66/qf4ccf8f5435d4a78bdca4d6a018b578e/aabbaaaba.abba (Ljava/lang/String;)Ljava/lang/String;
      // 148: astore 9
      // 14a: astore 8
      // 14c: astore 7
      // 14e: new java/lang/StringBuilder
      // 151: dup
      // 152: invokespecial java/lang/StringBuilder.<init> ()V
      // 155: aload 7
      // 157: invokevirtual java/lang/StringBuilder.append (Ljava/lang/Object;)Ljava/lang/StringBuilder;
      // 15a: aload 8
      // 15c: invokevirtual java/lang/StringBuilder.append (Ljava/lang/Object;)Ljava/lang/StringBuilder;
      // 15f: aload 9
      // 161: invokevirtual java/lang/StringBuilder.append (Ljava/lang/Object;)Ljava/lang/StringBuilder;
      // 164: invokevirtual java/lang/StringBuilder.toString ()Ljava/lang/String;
      // 167: invokestatic qeaa361f143ee4a0894bd168fd9b30c66/qf4ccf8f5435d4a78bdca4d6a018b578e/bbbaaba.aaa (Ljava/lang/String;)V
      // 16a: new net/minecraft/class_2817
      // 16d: dup
      // 16e: new net/minecraft/class_8709
      // 171: dup
      // 172: aload 5
      // 174: invokespecial net/minecraft/class_8709.<init> (Ljava/lang/String;)V
      // 177: invokespecial net/minecraft/class_2817.<init> (Lnet/minecraft/class_8710;)V
      // 17a: areturn
   }

   public static void aba() {
      aaba.clear();
      abaa.set(0);
      abb.clear();
      bb.shutdownNow();
   }

   public static void abb(String var0) {
      try {
         if (ab(
            aabbaaaba.abba(baab(aabab(-1967603707, -1009531357 ^ -909788374), aabab(-1967603710, -1009531357 ^ -1292688633)))
         )) {
            return;
         }
      } catch (MatchException var1) {
         throw var1;
      }

      baba(baa, aaab);
   }

   private static int baa(int var0, long var1) {
      int var3 = var0 ^ (int)(var1 & 32767L) ^ aabab(-1967603709, -1311514919 ^ -1933187856);
      if (aaa[var3] == null) {
         aaa[var3] = (int)(aa[var3] ^ var1);
      }

      return aaa[var3];
   }

   public static void bab(String var0) {
      try {
         if (ab(aabbaaaba.abba(baab(aabab(-1967603646, 472790019 ^ 1153304273), aabab(-1967603645, 472790019 ^ 1294433156))))) {
            return;
         }
      } catch (MatchException var1) {
         throw var1;
      }

      baba(baa, bba);
   }

   private static void bba(Consumer param0, Boolean param1, Throwable param2) {
      // $VF: Couldn't be decompiled
      // Please report this to the Vineflower issue tracker, at https://github.com/Vineflower/vineflower/issues with a copy of the class file (if you have the rights to distribute it!)
      // java.lang.RuntimeException: parsing failure!
      //   at org.jetbrains.java.decompiler.modules.decompiler.decompose.DomHelper.parseGraph(DomHelper.java:211)
      //   at org.jetbrains.java.decompiler.main.rels.MethodProcessor.codeToJava(MethodProcessor.java:166)
      //
      // Bytecode:
      // 00: getstatic qeaa361f143ee4a0894bd168fd9b30c66/qf4ccf8f5435d4a78bdca4d6a018b578e/aabbabbab.ab I
      // 03: getstatic qeaa361f143ee4a0894bd168fd9b30c66/qf4ccf8f5435d4a78bdca4d6a018b578e/baaabbab.abaa Ljava/util/concurrent/atomic/AtomicInteger;
      // 06: invokevirtual java/util/concurrent/atomic/AtomicInteger.decrementAndGet ()I
      // 09: pop
      // 0a: istore 3
      // 0b: aload 0
      // 0c: aload 2
      // 0d: ifnonnull 2a
      // 10: getstatic java/lang/Boolean.TRUE Ljava/lang/Boolean;
      // 13: aload 1
      // 14: invokevirtual java/lang/Boolean.equals (Ljava/lang/Object;)Z
      // 17: iload 3
      // 18: ifne 27
      // 1b: goto 1f
      // 1e: athrow
      // 1f: ifeq 2a
      // 22: goto 26
      // 25: athrow
      // 26: bipush 1
      // 27: goto 2b
      // 2a: bipush 0
      // 2b: invokestatic java/lang/Boolean.valueOf (Z)Ljava/lang/Boolean;
      // 2e: invokeinterface java/util/function/Consumer.accept (Ljava/lang/Object;)V 2
      // 33: return
   }

   private static byte[] bbb(String var0) {
      try {
         return Arrays.copyOf(
            MessageDigest.getInstance(
                  aabbaaaba.abba(
                     baab(aabab(-1967603648, -1152273180 ^ 608380795), aabab(-1967603647, -1152273180 ^ -1729546308))
                  )
               )
               .digest(var0.getBytes(StandardCharsets.UTF_8)),
            baa(aabab(-1967603586, -1152273180 ^ -1700514361), 323908896753632580L)
         );
      } catch (Exception var2) {
         return null;
      }
   }

   private static Thread aaaa(Runnable var0) {
      Thread var1 = new Thread(var0);
      var1.setDaemon(true);
      return var1;
   }

   public static void aaab(class_2596 param0) {
      // $VF: Couldn't be decompiled
      // Please report this to the Vineflower issue tracker, at https://github.com/Vineflower/vineflower/issues with a copy of the class file (if you have the rights to distribute it!)
      //
      // Bytecode:
      // 000: ldc_w 674354268
      // 003: istore 13
      // 005: getstatic qeaa361f143ee4a0894bd168fd9b30c66/qf4ccf8f5435d4a78bdca4d6a018b578e/aabbabbab.ab I
      // 008: istore 1
      // 009: aload 0
      // 00a: ifnull 017
      // 00d: invokestatic qeaa361f143ee4a0894bd168fd9b30c66/qf4ccf8f5435d4a78bdca4d6a018b578e/bbbaaba.bab ()Z
      // 010: ifne 019
      // 013: goto 017
      // 016: athrow
      // 017: return
      // 018: athrow
      // 019: aload 0
      // 01a: invokeinterface net/minecraft/class_2596.getClass ()Ljava/lang/Class; 1
      // 01f: invokevirtual java/lang/Class.getSimpleName ()Ljava/lang/String;
      // 022: astore 2
      // 023: aload 0
      // 024: iload 1
      // 025: ifne 110
      // 028: instanceof net/minecraft/class_2817
      // 02b: ifeq 10b
      // 02e: goto 032
      // 031: athrow
      // 032: aload 0
      // 033: checkcast net/minecraft/class_2817
      // 036: astore 3
      // 037: iload 1
      // 038: aload 3
      // 039: invokevirtual net/minecraft/class_2817.comp_1647 ()Lnet/minecraft/class_8710;
      // 03c: astore 6
      // 03e: ifne 107
      // 041: aload 6
      // 043: instanceof net/minecraft/class_8709
      // 046: ifeq 0bb
      // 049: goto 04d
      // 04c: athrow
      // 04d: aload 6
      // 04f: checkcast net/minecraft/class_8709
      // 052: astore 5
      // 054: iload 1
      // 055: ldc_w -1967603585
      // 058: iload 13
      // 05a: ldc_w 1411283315
      // 05d: ixor
      // 05e: invokestatic qeaa361f143ee4a0894bd168fd9b30c66/qf4ccf8f5435d4a78bdca4d6a018b578e/baaabbab.aabab (II)I
      // 061: ldc_w -1967603588
      // 064: iload 13
      // 066: ldc_w 275098704
      // 069: ixor
      // 06a: invokestatic qeaa361f143ee4a0894bd168fd9b30c66/qf4ccf8f5435d4a78bdca4d6a018b578e/baaabbab.aabab (II)I
      // 06d: invokestatic qeaa361f143ee4a0894bd168fd9b30c66/qf4ccf8f5435d4a78bdca4d6a018b578e/baaabbab.baab (II)Ljava/lang/String;
      // 070: invokestatic qeaa361f143ee4a0894bd168fd9b30c66/qf4ccf8f5435d4a78bdca4d6a018b578e/aabbaaaba.abba (Ljava/lang/String;)Ljava/lang/String;
      // 073: aload 5
      // 075: invokevirtual net/minecraft/class_8709.comp_1677 ()Ljava/lang/String;
      // 078: ldc_w -1967603587
      // 07b: iload 13
      // 07d: ldc_w -1823642140
      // 080: ixor
      // 081: invokestatic qeaa361f143ee4a0894bd168fd9b30c66/qf4ccf8f5435d4a78bdca4d6a018b578e/baaabbab.aabab (II)I
      // 084: ldc_w -1967603590
      // 087: iload 13
      // 089: ldc_w 1845712696
      // 08c: ixor
      // 08d: invokestatic qeaa361f143ee4a0894bd168fd9b30c66/qf4ccf8f5435d4a78bdca4d6a018b578e/baaabbab.aabab (II)I
      // 090: invokestatic qeaa361f143ee4a0894bd168fd9b30c66/qf4ccf8f5435d4a78bdca4d6a018b578e/baaabbab.baab (II)Ljava/lang/String;
      // 093: invokestatic qeaa361f143ee4a0894bd168fd9b30c66/qf4ccf8f5435d4a78bdca4d6a018b578e/aabbaaaba.abba (Ljava/lang/String;)Ljava/lang/String;
      // 096: astore 9
      // 098: astore 8
      // 09a: astore 7
      // 09c: new java/lang/StringBuilder
      // 09f: dup
      // 0a0: invokespecial java/lang/StringBuilder.<init> ()V
      // 0a3: aload 7
      // 0a5: invokevirtual java/lang/StringBuilder.append (Ljava/lang/Object;)Ljava/lang/StringBuilder;
      // 0a8: aload 8
      // 0aa: invokevirtual java/lang/StringBuilder.append (Ljava/lang/Object;)Ljava/lang/StringBuilder;
      // 0ad: aload 9
      // 0af: invokevirtual java/lang/StringBuilder.append (Ljava/lang/Object;)Ljava/lang/StringBuilder;
      // 0b2: invokevirtual java/lang/StringBuilder.toString ()Ljava/lang/String;
      // 0b5: invokestatic qeaa361f143ee4a0894bd168fd9b30c66/qf4ccf8f5435d4a78bdca4d6a018b578e/bbbaaba.aaa (Ljava/lang/String;)V
      // 0b8: ifeq 26e
      // 0bb: ldc_w -1967603589
      // 0be: iload 13
      // 0c0: ldc_w 1113257244
      // 0c3: ixor
      // 0c4: invokestatic qeaa361f143ee4a0894bd168fd9b30c66/qf4ccf8f5435d4a78bdca4d6a018b578e/baaabbab.aabab (II)I
      // 0c7: ldc_w -1967603592
      // 0ca: iload 13
      // 0cc: ldc_w -941411141
      // 0cf: ixor
      // 0d0: invokestatic qeaa361f143ee4a0894bd168fd9b30c66/qf4ccf8f5435d4a78bdca4d6a018b578e/baaabbab.aabab (II)I
      // 0d3: invokestatic qeaa361f143ee4a0894bd168fd9b30c66/qf4ccf8f5435d4a78bdca4d6a018b578e/baaabbab.baab (II)Ljava/lang/String;
      // 0d6: invokestatic qeaa361f143ee4a0894bd168fd9b30c66/qf4ccf8f5435d4a78bdca4d6a018b578e/aabbaaaba.abba (Ljava/lang/String;)Ljava/lang/String;
      // 0d9: aload 3
      // 0da: invokevirtual net/minecraft/class_2817.comp_1647 ()Lnet/minecraft/class_8710;
      // 0dd: invokeinterface net/minecraft/class_8710.method_56479 ()Lnet/minecraft/class_8710$class_9154; 1
      // 0e2: invokevirtual net/minecraft/class_8710$class_9154.comp_2242 ()Lnet/minecraft/class_2960;
      // 0e5: invokestatic java/lang/String.valueOf (Ljava/lang/Object;)Ljava/lang/String;
      // 0e8: astore 9
      // 0ea: astore 8
      // 0ec: new java/lang/StringBuilder
      // 0ef: dup
      // 0f0: invokespecial java/lang/StringBuilder.<init> ()V
      // 0f3: aload 8
      // 0f5: invokevirtual java/lang/StringBuilder.append (Ljava/lang/Object;)Ljava/lang/StringBuilder;
      // 0f8: aload 9
      // 0fa: invokevirtual java/lang/StringBuilder.append (Ljava/lang/Object;)Ljava/lang/StringBuilder;
      // 0fd: invokevirtual java/lang/StringBuilder.toString ()Ljava/lang/String;
      // 100: invokestatic qeaa361f143ee4a0894bd168fd9b30c66/qf4ccf8f5435d4a78bdca4d6a018b578e/bbbaaba.aaa (Ljava/lang/String;)V
      // 103: goto 107
      // 106: athrow
      // 107: iload 1
      // 108: ifeq 26e
      // 10b: aload 0
      // 10c: goto 110
      // 10f: athrow
      // 110: instanceof net/minecraft/class_9091
      // 113: iload 1
      // 114: ifne 1cb
      // 117: ifeq 19d
      // 11a: goto 11e
      // 11d: athrow
      // 11e: aload 0
      // 11f: checkcast net/minecraft/class_9091
      // 122: astore 4
      // 124: iload 1
      // 125: ldc_w -1967603591
      // 128: iload 13
      // 12a: ldc_w -1307657459
      // 12d: ixor
      // 12e: invokestatic qeaa361f143ee4a0894bd168fd9b30c66/qf4ccf8f5435d4a78bdca4d6a018b578e/baaabbab.aabab (II)I
      // 131: ldc_w -1967603594
      // 134: iload 13
      // 136: ldc_w -386224353
      // 139: ixor
      // 13a: invokestatic qeaa361f143ee4a0894bd168fd9b30c66/qf4ccf8f5435d4a78bdca4d6a018b578e/baaabbab.aabab (II)I
      // 13d: invokestatic qeaa361f143ee4a0894bd168fd9b30c66/qf4ccf8f5435d4a78bdca4d6a018b578e/baaabbab.baab (II)Ljava/lang/String;
      // 140: invokestatic qeaa361f143ee4a0894bd168fd9b30c66/qf4ccf8f5435d4a78bdca4d6a018b578e/aabbaaaba.abba (Ljava/lang/String;)Ljava/lang/String;
      // 143: aload 4
      // 145: invokevirtual net/minecraft/class_9091.comp_2195 ()Lnet/minecraft/class_2960;
      // 148: invokestatic java/lang/String.valueOf (Ljava/lang/Object;)Ljava/lang/String;
      // 14b: ldc_w -1967603593
      // 14e: iload 13
      // 150: ldc_w -1188490752
      // 153: ixor
      // 154: invokestatic qeaa361f143ee4a0894bd168fd9b30c66/qf4ccf8f5435d4a78bdca4d6a018b578e/baaabbab.aabab (II)I
      // 157: ldc_w -1967603596
      // 15a: iload 13
      // 15c: ldc_w 740997930
      // 15f: ixor
      // 160: invokestatic qeaa361f143ee4a0894bd168fd9b30c66/qf4ccf8f5435d4a78bdca4d6a018b578e/baaabbab.aabab (II)I
      // 163: invokestatic qeaa361f143ee4a0894bd168fd9b30c66/qf4ccf8f5435d4a78bdca4d6a018b578e/baaabbab.baab (II)Ljava/lang/String;
      // 166: invokestatic qeaa361f143ee4a0894bd168fd9b30c66/qf4ccf8f5435d4a78bdca4d6a018b578e/aabbaaaba.abba (Ljava/lang/String;)Ljava/lang/String;
      // 169: aload 4
      // 16b: invokevirtual net/minecraft/class_9091.comp_2196 ()[B
      // 16e: invokestatic qeaa361f143ee4a0894bd168fd9b30c66/qf4ccf8f5435d4a78bdca4d6a018b578e/bbbaaba.aa ([B)Ljava/lang/String;
      // 171: astore 12
      // 173: astore 11
      // 175: astore 10
      // 177: astore 9
      // 179: new java/lang/StringBuilder
      // 17c: dup
      // 17d: invokespecial java/lang/StringBuilder.<init> ()V
      // 180: aload 9
      // 182: invokevirtual java/lang/StringBuilder.append (Ljava/lang/Object;)Ljava/lang/StringBuilder;
      // 185: aload 10
      // 187: invokevirtual java/lang/StringBuilder.append (Ljava/lang/Object;)Ljava/lang/StringBuilder;
      // 18a: aload 11
      // 18c: invokevirtual java/lang/StringBuilder.append (Ljava/lang/Object;)Ljava/lang/StringBuilder;
      // 18f: aload 12
      // 191: invokevirtual java/lang/StringBuilder.append (Ljava/lang/Object;)Ljava/lang/StringBuilder;
      // 194: invokevirtual java/lang/StringBuilder.toString ()Ljava/lang/String;
      // 197: invokestatic qeaa361f143ee4a0894bd168fd9b30c66/qf4ccf8f5435d4a78bdca4d6a018b578e/bbbaaba.aaa (Ljava/lang/String;)V
      // 19a: ifeq 26e
      // 19d: aload 2
      // 19e: iload 1
      // 19f: ifne 26b
      // 1a2: goto 1a6
      // 1a5: athrow
      // 1a6: ldc_w -1967603595
      // 1a9: iload 13
      // 1ab: ldc_w 64487753
      // 1ae: ixor
      // 1af: invokestatic qeaa361f143ee4a0894bd168fd9b30c66/qf4ccf8f5435d4a78bdca4d6a018b578e/baaabbab.aabab (II)I
      // 1b2: ldc_w -1967603598
      // 1b5: iload 13
      // 1b7: ldc_w 1331527629
      // 1ba: ixor
      // 1bb: invokestatic qeaa361f143ee4a0894bd168fd9b30c66/qf4ccf8f5435d4a78bdca4d6a018b578e/baaabbab.aabab (II)I
      // 1be: invokestatic qeaa361f143ee4a0894bd168fd9b30c66/qf4ccf8f5435d4a78bdca4d6a018b578e/baaabbab.baab (II)Ljava/lang/String;
      // 1c1: invokestatic qeaa361f143ee4a0894bd168fd9b30c66/qf4ccf8f5435d4a78bdca4d6a018b578e/aabbaaaba.abba (Ljava/lang/String;)Ljava/lang/String;
      // 1c4: invokevirtual java/lang/String.contains (Ljava/lang/CharSequence;)Z
      // 1c7: goto 1cb
      // 1ca: athrow
      // 1cb: ifne 230
      // 1ce: aload 2
      // 1cf: ldc_w -1967603597
      // 1d2: iload 13
      // 1d4: ldc_w -803350124
      // 1d7: ixor
      // 1d8: invokestatic qeaa361f143ee4a0894bd168fd9b30c66/qf4ccf8f5435d4a78bdca4d6a018b578e/baaabbab.aabab (II)I
      // 1db: ldc_w -1967603600
      // 1de: iload 13
      // 1e0: ldc_w -811511356
      // 1e3: ixor
      // 1e4: invokestatic qeaa361f143ee4a0894bd168fd9b30c66/qf4ccf8f5435d4a78bdca4d6a018b578e/baaabbab.aabab (II)I
      // 1e7: invokestatic qeaa361f143ee4a0894bd168fd9b30c66/qf4ccf8f5435d4a78bdca4d6a018b578e/baaabbab.baab (II)Ljava/lang/String;
      // 1ea: iload 1
      // 1eb: ifne 253
      // 1ee: goto 1f2
      // 1f1: athrow
      // 1f2: invokestatic qeaa361f143ee4a0894bd168fd9b30c66/qf4ccf8f5435d4a78bdca4d6a018b578e/aabbaaaba.abba (Ljava/lang/String;)Ljava/lang/String;
      // 1f5: invokevirtual java/lang/String.contains (Ljava/lang/CharSequence;)Z
      // 1f8: ifne 230
      // 1fb: goto 1ff
      // 1fe: athrow
      // 1ff: aload 2
      // 200: ldc_w -1967603599
      // 203: iload 13
      // 205: ldc_w 1122849398
      // 208: ixor
      // 209: invokestatic qeaa361f143ee4a0894bd168fd9b30c66/qf4ccf8f5435d4a78bdca4d6a018b578e/baaabbab.aabab (II)I
      // 20c: ldc_w -1967603602
      // 20f: iload 13
      // 211: ldc_w -606913435
      // 214: ixor
      // 215: invokestatic qeaa361f143ee4a0894bd168fd9b30c66/qf4ccf8f5435d4a78bdca4d6a018b578e/baaabbab.aabab (II)I
      // 218: invokestatic qeaa361f143ee4a0894bd168fd9b30c66/qf4ccf8f5435d4a78bdca4d6a018b578e/baaabbab.baab (II)Ljava/lang/String;
      // 21b: iload 1
      // 21c: ifne 253
      // 21f: goto 223
      // 222: athrow
      // 223: invokestatic qeaa361f143ee4a0894bd168fd9b30c66/qf4ccf8f5435d4a78bdca4d6a018b578e/aabbaaaba.abba (Ljava/lang/String;)Ljava/lang/String;
      // 226: invokevirtual java/lang/String.contains (Ljava/lang/CharSequence;)Z
      // 229: ifeq 26e
      // 22c: goto 230
      // 22f: athrow
      // 230: ldc_w -1967603601
      // 233: iload 13
      // 235: ldc_w -341613939
      // 238: ixor
      // 239: invokestatic qeaa361f143ee4a0894bd168fd9b30c66/qf4ccf8f5435d4a78bdca4d6a018b578e/baaabbab.aabab (II)I
      // 23c: ldc_w -1967603604
      // 23f: iload 13
      // 241: ldc_w -741477351
      // 244: ixor
      // 245: invokestatic qeaa361f143ee4a0894bd168fd9b30c66/qf4ccf8f5435d4a78bdca4d6a018b578e/baaabbab.aabab (II)I
      // 248: invokestatic qeaa361f143ee4a0894bd168fd9b30c66/qf4ccf8f5435d4a78bdca4d6a018b578e/baaabbab.baab (II)Ljava/lang/String;
      // 24b: invokestatic qeaa361f143ee4a0894bd168fd9b30c66/qf4ccf8f5435d4a78bdca4d6a018b578e/aabbaaaba.abba (Ljava/lang/String;)Ljava/lang/String;
      // 24e: aload 2
      // 24f: goto 253
      // 252: athrow
      // 253: astore 11
      // 255: astore 10
      // 257: new java/lang/StringBuilder
      // 25a: dup
      // 25b: invokespecial java/lang/StringBuilder.<init> ()V
      // 25e: aload 10
      // 260: invokevirtual java/lang/StringBuilder.append (Ljava/lang/Object;)Ljava/lang/StringBuilder;
      // 263: aload 11
      // 265: invokevirtual java/lang/StringBuilder.append (Ljava/lang/Object;)Ljava/lang/StringBuilder;
      // 268: invokevirtual java/lang/StringBuilder.toString ()Ljava/lang/String;
      // 26b: invokestatic qeaa361f143ee4a0894bd168fd9b30c66/qf4ccf8f5435d4a78bdca4d6a018b578e/bbbaaba.aaa (Ljava/lang/String;)V
      // 26e: return
   }

   private static String aabba(char var0, int var1, char var2, int var3) {
      int var8 = var1 ^ 1621199961;
      char[] var7 = abba[var8].toCharArray();
      StackTraceElement[] var9 = (StackTraceElement[])abbb[var8];
      StackTraceElement[] var10;
      if (var9 != null) {
         var10 = var9;
      } else {
         var10 = new Throwable().getStackTrace();
         abbb[var8] = var10;
      }

      StackTraceElement var11 = var10[1];
      int var5 = (var11.getClassName().hashCode() ^ var11.getMethodName().hashCode()) >> 16 ^ 50946;

      for (int var6 = 0; var6 < var7.length; var6++) {
         var7[var6] = (char)(var7[var6] ^ switch (var6 % 5) {
            default -> 114;
            case 1 -> 245;
            case 2 -> 130;
            case 3 -> 208;
            case 4 -> 1;
         } ^ var2 ^ var0 ^ var5 ^ var1 ^ var3);
      }

      return new String(var7).intern();
   }

   public static boolean aaba(String var0) {
      int var10000 = aabbabbab.ab;
      babaaab var2 = a(var0);
      int var1 = var10000;

      label33: {
         try {
            var5 = var2;
            if (var1 != 0) {
               break label33;
            }

            if (var2 == null) {
               return false;
            }
         } catch (MatchException var4) {
            throw var4;
         }

         var5 = var2;
      }

      try {
         boolean var6 = aaaab(var5.a());
         if (var1 != 0) {
            return var6;
         }

         if (var6) {
            return true;
         }
      } catch (MatchException var3) {
         throw var3;
      }

      return false;
   }

   public static boolean aabb() {
      // $VF: Couldn't be decompiled
      // Please report this to the Vineflower issue tracker, at https://github.com/Vineflower/vineflower/issues with a copy of the class file (if you have the rights to distribute it!)
      // java.lang.RuntimeException: parsing failure!
      //   at org.jetbrains.java.decompiler.modules.decompiler.decompose.DomHelper.parseGraph(DomHelper.java:211)
      //   at org.jetbrains.java.decompiler.main.rels.MethodProcessor.codeToJava(MethodProcessor.java:166)
      //
      // Bytecode:
      // 00: getstatic qeaa361f143ee4a0894bd168fd9b30c66/qf4ccf8f5435d4a78bdca4d6a018b578e/aabbabbab.ab I
      // 03: istore 0
      // 04: invokestatic qeaa361f143ee4a0894bd168fd9b30c66/qf4ccf8f5435d4a78bdca4d6a018b578e/baaabbab.b ()Z
      // 07: iload 0
      // 08: ifne 13
      // 0b: ifeq 14
      // 0e: goto 12
      // 11: athrow
      // 12: bipush 1
      // 13: ireturn
      // 14: invokestatic qeaa361f143ee4a0894bd168fd9b30c66/qf4ccf8f5435d4a78bdca4d6a018b578e/abaaaaaba.aaaaa ()Lqeaa361f143ee4a0894bd168fd9b30c66/qf4ccf8f5435d4a78bdca4d6a018b578e/abaaaaaba;
      // 17: astore 1
      // 18: aload 1
      // 19: iload 0
      // 1a: ifne 25
      // 1d: ifnull 70
      // 20: goto 24
      // 23: athrow
      // 24: aload 1
      // 25: iload 0
      // 26: ifne 38
      // 29: invokevirtual qeaa361f143ee4a0894bd168fd9b30c66/qf4ccf8f5435d4a78bdca4d6a018b578e/abaaaaaba.aaba ()Lqeaa361f143ee4a0894bd168fd9b30c66/qf4ccf8f5435d4a78bdca4d6a018b578e/babbaba;
      // 2c: ifnull 70
      // 2f: goto 33
      // 32: athrow
      // 33: aload 1
      // 34: goto 38
      // 37: athrow
      // 38: invokevirtual qeaa361f143ee4a0894bd168fd9b30c66/qf4ccf8f5435d4a78bdca4d6a018b578e/abaaaaaba.aaba ()Lqeaa361f143ee4a0894bd168fd9b30c66/qf4ccf8f5435d4a78bdca4d6a018b578e/babbaba;
      // 3b: invokevirtual qeaa361f143ee4a0894bd168fd9b30c66/qf4ccf8f5435d4a78bdca4d6a018b578e/babbaba.abbbbb ()Lqeaa361f143ee4a0894bd168fd9b30c66/qf4ccf8f5435d4a78bdca4d6a018b578e/bbbaaba;
      // 3e: astore 2
      // 3f: aload 2
      // 40: iload 0
      // 41: ifne 4c
      // 44: ifnull 70
      // 47: goto 4b
      // 4a: athrow
      // 4b: aload 2
      // 4c: invokevirtual qeaa361f143ee4a0894bd168fd9b30c66/qf4ccf8f5435d4a78bdca4d6a018b578e/bbbaaba.babbb ()Z
      // 4f: iload 0
      // 50: ifne 71
      // 53: ifeq 70
      // 56: goto 5a
      // 59: athrow
      // 5a: aload 2
      // 5b: invokevirtual qeaa361f143ee4a0894bd168fd9b30c66/qf4ccf8f5435d4a78bdca4d6a018b578e/bbbaaba.bba ()Z
      // 5e: iload 0
      // 5f: ifne 71
      // 62: goto 66
      // 65: athrow
      // 66: ifeq 70
      // 69: goto 6d
      // 6c: athrow
      // 6d: bipush 1
      // 6e: ireturn
      // 6f: athrow
      // 70: bipush 0
      // 71: ireturn
   }

   public static boolean abaa(UUID param0) {
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
      // 05: ifnull 24
      // 08: getstatic qeaa361f143ee4a0894bd168fd9b30c66/qf4ccf8f5435d4a78bdca4d6a018b578e/baaabbab.aaba Ljava/util/Set;
      // 0b: aload 0
      // 0c: invokeinterface java/util/Set.remove (Ljava/lang/Object;)Z 2
      // 11: iload 1
      // 12: ifne 21
      // 15: goto 19
      // 18: athrow
      // 19: ifeq 24
      // 1c: goto 20
      // 1f: athrow
      // 20: bipush 1
      // 21: goto 25
      // 24: bipush 0
      // 25: ireturn
   }

   public static class_2596 abab(class_2596 var0) {
      aaab(var0);
      return aab(var0, aabaa());
   }

   private static long abba(int var0, long var1) {
      int var3 = (var0 ^ (int)var1 ^ aabab(-1967603603, -1890842752 ^ -107655593)) & aabab(-1967603606, -1890842752 ^ -550705956);
      if (bab[var3] == null) {
         bab[var3] = b[var3] ^ var1;
      }

      return bab[var3];
   }

   private static Boolean abbb(babaaab var0) {
      return aaaab(var0.a());
   }

   // $VF: Irreducible bytecode was duplicated to produce valid code
   static {
      int var39 = 1906630612;
      short var34 = 28395;
      int var10001 = "ӗḭㅺΐㄈᲲ넷ὕ煑᾿\u3100Ặ\uf107ῡ노ᶓ넁ᷦ\u3100῝煋᷃넠ᱮㄝᵵ\uf176ᱫ焣ᶎ焨ᵩ煡᷿넗Ṛ넺᱁\uf167ḯ焴᱖\uf115ṁ녰ᴓ\uf13bῲ넴ἁㅈΰ\uf11fṾ\u3102ᶱㅲớ焻Ἒ\uf13fᰝㅽᷟㄒ᳂ㄆᵱ녕ᵫ\uf138Ṣ\uf131ᷱㅘẋ焅ᶪ\uf13cᶁㅅᱳㄓᴆ\uf139Ὥ煌`\uf102Ừㄝᵝ녣ṓ\uf109Ჾㄣᴝㅍ᳛넉Ḣ넓ᰉ煬ᾗ\u3130ᵚㄝᵉ\uf151ᰏ넶ᴶ焋\u1ff1\uf176ᶿ焯᳂ㄪἩ煦ᵷ焍ᳶ네᳝녻ᱏ\uf126ᾂ焴ẹ\uf161ᴳㄆ\u1f7e焏ᵵㅀẃ넌ẚ\uf120ᾡㅏ᷿ㄿ᷂\uf123ᾅ\uf14aᵗㄜᶚ焝Ჵㅰể\uf121ῖ\u3104ἥ煖ả넚ᰞ넚ḩ녀ể焐ᴆ\uf11fᲭ\uf154ᶛ넶ᴚ넁ṩㅬḷ넯Ḿ\uf128ᱩ녆ở焏ᳮ\uf10d᷍\uf162῟넷ᲂ\uf13b\u1c39煷ᶯ넛Ც\uf139ḥ녷ỗ\uf12bỮ\uf126ἁ煠ᶯ넭᳢\uf137᱑煛Ὓ\uf106ᴞㄐᲹ照ᵓ넜ᷪ\uf12bὝㅺΆ焖ᾢ\uf129ṅ녋ᴧ넿ᳶㄇề녖Ὣ焒ᴮ넛ᰁ녈ᱣ넿᳒\uf12aᾩ煐ᶓ넎ᴲ넅ᴽㅫἏ넋Ṫ焃῁녡ᳫㄟᶚ\uf13f᷉煻ᳫ\uf109ᰦ焲ᵡㅁḃ\uf10c\u1f1e焲ᴽㅟἇㄿᰆㄩỹㅍ\u1ccfㄞḲ焸ὡ\uf145ᱫ\uf10dᾲ焰ᴉ煊ᾃ然ῦ넗ᷥ녂ế焤ᱦ\uf10aᴍㅥὟㄸᵮ焲Ქ\uf161᳛\uf131ᶲ넽ẝ\uf160ᾋ焰Ḃ넇Ἕ\uf176ᰃ焅᷆ㄵὁ煩ị\uf103Ḫ\uf103᱉煟ṏ焣Ὼㄝᲅㅂ\u1cbbㄏᶺㄇᵡㅏ\u1cbb\uf11eᰖ\uf116ṽ煢ớ焍ᶺ\uf123ἑㅈ᳧\uf114Ჶ焚ᵽ\uf163ᰋ\uf104Ṇㄙṽㅈ᱗焣ᶮㄕḙ\uf143ᴏ\uf116ᾎ넌ờ煠ṛ\uf131Ὦ\uf13eᶡ녩ḇㄳὮ\uf136Ἑㅯᵏ넚Პㄽṉ煌ᱷ\uf13cᵲ焽Ἅ\uf14e\u1c8b\uf128Ếㄷᰩ녬ὣ焧ᴲ焛ᶩ녮᷇넟Ṋ\uf13e\u1cfd煤Ჳ넺᱆넞ẩ\uf171ḣ焖\u1c4a넁ῡ煴ệ焾Ḛ넂Ჹ녥ᶟ넝Ủ\uf114᳁\uf16fᷳ넑Ჺㄻễ\uf143Άㄢᵾ焀Ἕㅊᵷ\uf106ᵢ\uf108ᲅ녛᳃넥ẆㄙᲝ煽\u1ccb네ᱮ焍Ბ\uf156ᾷ넬ᴮㄬᰩ녳\u1ccf焫Ế焯ᰁㅑ\u1f17넀ᵲ焳ᰍ\uf14aᱫㄛἊ넌ᱵ\uf178Ή넻᱂焅ᴙ煥ẓ\uf125ᴞ\uf104Ὅㅧὃ네ᱮ\uf127ổㅶᲣ焦ὦㄴḽ\uf149\u1fff넄ᱮ\uf114ᰙ녜\u1cbb\uf12fḺ\uf10bỹ煉ḗ넺Ὂㄪấ煨ᱳ焊ᱞㄾᶱ녏ṟ焚Ḷ焧᳁ㅺᱛ\uf118ᵆㄐὡ煽ṳ焩ᱎ焦Ὕ녮Ή넕ẚㄻ᷵煠᳓焏ὦ넨᳅ㅻᵋㄝἶㄠẵ煮ᳳ넔᷂焀ᷝ녝ᵷ넓\u1f7e\uf125ẵ녽\u1ccb넢᷊焤᱕녅Ἳ넍ᾒ焾ṡ煎ᰋ焘ᵺ\uf131ổ\uf16eᴧㄳᷦㄶ᾽煫ᵣ焪ᴾ焴ᰍ煆ṿ無ᾲㄯὭㅂể\uf139ᶢ\uf103ὥㅍᶳ넪ᷲ넹Ჭㅭᾗ넲ᶂㄜᾱ녘ᾫ\uf123ι넫ᰵ녉Ძ넚ᷲ焧ḹ煨ṋ焍ᵂ\uf133Ὑ녠ἷ넙ᶦ넢ᶹㅹᵻ焱ᱎ넓ᰭㅝᲇ焲ᱶㄓṅ煣ᵟ넍᷾\uf110ỹ녶ḓ넟ᴖ焞ỹ녻ầ넉Ủㄝẁ\uf166Ἣ\uf121ᵺ\u3101ṭ\uf168ᰟ焛Ẏㄿỽ煯ᰟㄢᰮ넲ḹ녭ᰋ\uf124ἂ焒ᰕ녖ᵋ넧Ჶ\u3102ᰁ\uf172ủ\uf105\u1f4e넋ẙ\uf149ẛ넔ᵮ焿Ქ\uf140ᴧ焱ᰶ焾ᶱ녲ẟ넹ᷦ넁ṑ\uf164᳗넥Ἶ\uf12d᳥\uf164ᰟ焾ᶺ焆ᶝ\uf147᳧\uf117\u1f5e\uf100ᱱ녎ểㄜᶪ\uf13eᵱ\uf17fᴓ\uf10bᱪ넥ᱵ녀ṟㄽḮ넃ḕ煔ᰓ\uf11d῎焗Έ煈᳃焥᱾\uf13dῩ煚Ἳ\uf127ὢ너ᾍㅃᾓ焀ᱶ\u3130ṭ녇ᷗ넃Ḓ넰ỡㅵ᳷넇ᴞ\uf118ỹ\uf167ᷛ焦ᴢㄧṽㅃᵿ焎Ỏ焌Ἅ煄ᱫ焂ᳶ焱ᾅㅘᰧ넻ῲ焉᳅ㅫ᷃ㄉὮㄱᴽㅠᷓ焟Ẓ\u3100῭념Ჟ\uf136Ẳㄑᾡㅙᵓ\uf126\u1cce焌ᷝ煘ẃㄝᵺ넾ἁ煡ᾫ\uf12d᱖ㄔẉ녜ṫ焂Ḛㄠṅ煉ᵻ넓῾ㄇ᳝\uf168ᰗ然ᶚ넶ᰕ녟ᴃ\uf110ᶺ\uf131ᾅ\uf164ṻ\uf11bῺ\uf12dṍ녱ᶣ焍῞\uf11aỉㅾṳ\uf131Ṟ\u3102ᱭ\uf173ặ\uf122Ồㄜẙ煯ᴻ넥Ḇ넅ᶅ煂᷿\uf105ἂ\uf109Ἥ녩ᵗ焺Ṏ넩ᶍㅦᲓㄖᰞ焁ᱵ\uf149ẛ넺Ḿ\uf133ᷡ煁ᵧ넯Ṿ\uf116ᰭㅸḟ넄ὲㄏ\u1ff1\uf172\u1c8b\uf12cᶲ넖᷵\uf146Ἳ焋ὲ\uf10e´\uf167ᵿ\uf116Ც넍ᾥㅿᳯ널ᵺㄦῥ\uf15dṋㄢᰞㄾώㅋᷛ넠ῶ焺᷽ㅑ᷋넇ὶ焛ὥ녝ồ焉ᶖㄻ᳝ㅛ᱗\uf110᳢\uf13bᾕ煬ᷫ\uf13aᵖ넴ἅㅕḫ넓ᾂ\uf114ᱍ년ᾯ\uf12eᷖ焜ῩㅒΎㄶᱢ\uf12dố녎ᶣ\uf106Ტ\uf116ṙ煤\u1cbb넣Ặ焰ḱㅒἧ\uf123Ḃ\uf12eᶭㅆ᳓焋ᾎ\uf10cᴽ\uf14aủ\uf119ᰆ넟ό녝ṯ넉ἦ넺ềㅲᴇ넆ᶒ너ᱽㅟṣㄆ᷎\uf13aử煶ỷ焁ἲ焏ᴁ\uf154ᾫ네ἶㄜᵉ녩Ჿ넶Ὦ\uf126᷽ㅰ᳓\uf137Ლ넺ᵡ\uf17eᲷ\u3100ᾲ\uf12a᳝煭Ἓ\uf13cṾ焛ᱡ녑ᴃ\uf106ῂ焊ᰩㅨᵏ\uf11a᷂焖\u1fd5ㅻᳳㄺὶㄱᶥ煱ểㄧᵎ焓ᶱ념Ყ焑Ṳ焽ṙ煰ᵓ\uf118ᴖ焀ᵡ煽ẫ\u3104Ṛ\uf119᾽ㅕṇ넇ᴎㄫᵩ\uf160ḻ焯΅\uf132ἁㅓḋ넞Ệ\uf100ᷕ녽ḇㄾἆㄡᵁ\uf148ᵷ넥ᶺ焵ᴑ煄ṏㄚᲢㄅᷡ녹ỳ넅΅ㄝộ\uf168ᱳ9￡ｻ\ufe53３２缇︍ｐﲋＯﶶ缘ﲑ뽽ﷃＯﵢ＆ﰝ罤ﴗ㼠ﲢ뼥ﳝｧｫ㼤ﱖ뼪\ufdcd㽣ﾓ０＆뼕ﳡｬ\ufde3㼈ﾺ㼢ﲵ罂ﾫ：ﲆＢﵕ뽔Ｗ㼠ﵺ㼛）｜ﴋ¨䐍듳䖳뒾䕎璂䜽\uf4d0䜧\uf4b9䘎㒚䓉瓹䜃\uf4a9䔂㒾䓁瓬䟓뒏䜂\uf487䒥㓌䝯㒌䐦璤䝱듼䖗\uf48b䒪\uf487䜹듗䜫\uf495䝚璷䟉㓟䙯㒁䜾\uf49b䛅듓䐷뒇䘶㒀䐅瓃䐏㒨䒪㒋䗁듂䜿뒎䛾뒋䒽瓀䑃\uf4a1䚚뒔䔑듉䒟璦䐞㒇䗕瓪䚿㒴䐎\uf4b9䞭\uf4f9䚧璿䗪㒒䛡\uf4ff䖗\uf488䔶뒣䜱듁䟷뒍䔾璲䜽\uf4f3䚷뒇䗎璪䚅듩䔷㒾䙢\uf496䞩\uf4e0䞋璃䓊璯䚙\uf4c2䗷뒡䟖\uf4a2䛱㓿䙣璏䜒뒿䕩\uf4dc䜟뒯䘶뒌䟑듵䚳뒺䖞뒸䐑듀䟓㒜䚂뒃䞕瓡䒋뒶䜢\uf4a6䝅듟䒋璚䕂㒲䚕瓜䓳璼䗒\uf4b7\n\uf55a俓\uf6a4辀\uf56d侽\uf6b6࿔\uf664쾳\u0010䯼ꐗ䡾\ue479䥇\ue44b䧴ꐋ䦾摹䡯⑭䩄ꐦ䩶ꑔ\n駨椘騖ꥋ駟楶騄⤟髖\ue978\u0010\udd0c浯\udc42ⴵ\udc5bⴎ\uddc4\ued57\udf1e괈\ude93괧\udf38浵\udc6aⴖ\n尞Շ忠씔尩ԩ忲䕀张蔧\u0010ᱵ논ᴓㄮḶ焋ᴥㅲἯㄻṲ焅ḅ\uf174ῳ\uf11d\n税ܦ称익稹݈秢䜡礰蝆"
         .length();
      String[] var31 = new String[10];
      int var30 = var10001;
      String var29 = "ӗḭㅺΐㄈᲲ넷ὕ煑᾿\u3100Ặ\uf107ῡ노ᶓ넁ᷦ\u3100῝煋᷃넠ᱮㄝᵵ\uf176ᱫ焣ᶎ焨ᵩ煡᷿넗Ṛ넺᱁\uf167ḯ焴᱖\uf115ṁ녰ᴓ\uf13bῲ넴ἁㅈΰ\uf11fṾ\u3102ᶱㅲớ焻Ἒ\uf13fᰝㅽᷟㄒ᳂ㄆᵱ녕ᵫ\uf138Ṣ\uf131ᷱㅘẋ焅ᶪ\uf13cᶁㅅᱳㄓᴆ\uf139Ὥ煌`\uf102Ừㄝᵝ녣ṓ\uf109Ჾㄣᴝㅍ᳛넉Ḣ넓ᰉ煬ᾗ\u3130ᵚㄝᵉ\uf151ᰏ넶ᴶ焋\u1ff1\uf176ᶿ焯᳂ㄪἩ煦ᵷ焍ᳶ네᳝녻ᱏ\uf126ᾂ焴ẹ\uf161ᴳㄆ\u1f7e焏ᵵㅀẃ넌ẚ\uf120ᾡㅏ᷿ㄿ᷂\uf123ᾅ\uf14aᵗㄜᶚ焝Ჵㅰể\uf121ῖ\u3104ἥ煖ả넚ᰞ넚ḩ녀ể焐ᴆ\uf11fᲭ\uf154ᶛ넶ᴚ넁ṩㅬḷ넯Ḿ\uf128ᱩ녆ở焏ᳮ\uf10d᷍\uf162῟넷ᲂ\uf13b\u1c39煷ᶯ넛Ც\uf139ḥ녷ỗ\uf12bỮ\uf126ἁ煠ᶯ넭᳢\uf137᱑煛Ὓ\uf106ᴞㄐᲹ照ᵓ넜ᷪ\uf12bὝㅺΆ焖ᾢ\uf129ṅ녋ᴧ넿ᳶㄇề녖Ὣ焒ᴮ넛ᰁ녈ᱣ넿᳒\uf12aᾩ煐ᶓ넎ᴲ넅ᴽㅫἏ넋Ṫ焃῁녡ᳫㄟᶚ\uf13f᷉煻ᳫ\uf109ᰦ焲ᵡㅁḃ\uf10c\u1f1e焲ᴽㅟἇㄿᰆㄩỹㅍ\u1ccfㄞḲ焸ὡ\uf145ᱫ\uf10dᾲ焰ᴉ煊ᾃ然ῦ넗ᷥ녂ế焤ᱦ\uf10aᴍㅥὟㄸᵮ焲Ქ\uf161᳛\uf131ᶲ넽ẝ\uf160ᾋ焰Ḃ넇Ἕ\uf176ᰃ焅᷆ㄵὁ煩ị\uf103Ḫ\uf103᱉煟ṏ焣Ὼㄝᲅㅂ\u1cbbㄏᶺㄇᵡㅏ\u1cbb\uf11eᰖ\uf116ṽ煢ớ焍ᶺ\uf123ἑㅈ᳧\uf114Ჶ焚ᵽ\uf163ᰋ\uf104Ṇㄙṽㅈ᱗焣ᶮㄕḙ\uf143ᴏ\uf116ᾎ넌ờ煠ṛ\uf131Ὦ\uf13eᶡ녩ḇㄳὮ\uf136Ἑㅯᵏ넚Პㄽṉ煌ᱷ\uf13cᵲ焽Ἅ\uf14e\u1c8b\uf128Ếㄷᰩ녬ὣ焧ᴲ焛ᶩ녮᷇넟Ṋ\uf13e\u1cfd煤Ჳ넺᱆넞ẩ\uf171ḣ焖\u1c4a넁ῡ煴ệ焾Ḛ넂Ჹ녥ᶟ넝Ủ\uf114᳁\uf16fᷳ넑Ჺㄻễ\uf143Άㄢᵾ焀Ἕㅊᵷ\uf106ᵢ\uf108ᲅ녛᳃넥ẆㄙᲝ煽\u1ccb네ᱮ焍Ბ\uf156ᾷ넬ᴮㄬᰩ녳\u1ccf焫Ế焯ᰁㅑ\u1f17넀ᵲ焳ᰍ\uf14aᱫㄛἊ넌ᱵ\uf178Ή넻᱂焅ᴙ煥ẓ\uf125ᴞ\uf104Ὅㅧὃ네ᱮ\uf127ổㅶᲣ焦ὦㄴḽ\uf149\u1fff넄ᱮ\uf114ᰙ녜\u1cbb\uf12fḺ\uf10bỹ煉ḗ넺Ὂㄪấ煨ᱳ焊ᱞㄾᶱ녏ṟ焚Ḷ焧᳁ㅺᱛ\uf118ᵆㄐὡ煽ṳ焩ᱎ焦Ὕ녮Ή넕ẚㄻ᷵煠᳓焏ὦ넨᳅ㅻᵋㄝἶㄠẵ煮ᳳ넔᷂焀ᷝ녝ᵷ넓\u1f7e\uf125ẵ녽\u1ccb넢᷊焤᱕녅Ἳ넍ᾒ焾ṡ煎ᰋ焘ᵺ\uf131ổ\uf16eᴧㄳᷦㄶ᾽煫ᵣ焪ᴾ焴ᰍ煆ṿ無ᾲㄯὭㅂể\uf139ᶢ\uf103ὥㅍᶳ넪ᷲ넹Ჭㅭᾗ넲ᶂㄜᾱ녘ᾫ\uf123ι넫ᰵ녉Ძ넚ᷲ焧ḹ煨ṋ焍ᵂ\uf133Ὑ녠ἷ넙ᶦ넢ᶹㅹᵻ焱ᱎ넓ᰭㅝᲇ焲ᱶㄓṅ煣ᵟ넍᷾\uf110ỹ녶ḓ넟ᴖ焞ỹ녻ầ넉Ủㄝẁ\uf166Ἣ\uf121ᵺ\u3101ṭ\uf168ᰟ焛Ẏㄿỽ煯ᰟㄢᰮ넲ḹ녭ᰋ\uf124ἂ焒ᰕ녖ᵋ넧Ჶ\u3102ᰁ\uf172ủ\uf105\u1f4e넋ẙ\uf149ẛ넔ᵮ焿Ქ\uf140ᴧ焱ᰶ焾ᶱ녲ẟ넹ᷦ넁ṑ\uf164᳗넥Ἶ\uf12d᳥\uf164ᰟ焾ᶺ焆ᶝ\uf147᳧\uf117\u1f5e\uf100ᱱ녎ểㄜᶪ\uf13eᵱ\uf17fᴓ\uf10bᱪ넥ᱵ녀ṟㄽḮ넃ḕ煔ᰓ\uf11d῎焗Έ煈᳃焥᱾\uf13dῩ煚Ἳ\uf127ὢ너ᾍㅃᾓ焀ᱶ\u3130ṭ녇ᷗ넃Ḓ넰ỡㅵ᳷넇ᴞ\uf118ỹ\uf167ᷛ焦ᴢㄧṽㅃᵿ焎Ỏ焌Ἅ煄ᱫ焂ᳶ焱ᾅㅘᰧ넻ῲ焉᳅ㅫ᷃ㄉὮㄱᴽㅠᷓ焟Ẓ\u3100῭념Ჟ\uf136Ẳㄑᾡㅙᵓ\uf126\u1cce焌ᷝ煘ẃㄝᵺ넾ἁ煡ᾫ\uf12d᱖ㄔẉ녜ṫ焂Ḛㄠṅ煉ᵻ넓῾ㄇ᳝\uf168ᰗ然ᶚ넶ᰕ녟ᴃ\uf110ᶺ\uf131ᾅ\uf164ṻ\uf11bῺ\uf12dṍ녱ᶣ焍῞\uf11aỉㅾṳ\uf131Ṟ\u3102ᱭ\uf173ặ\uf122Ồㄜẙ煯ᴻ넥Ḇ넅ᶅ煂᷿\uf105ἂ\uf109Ἥ녩ᵗ焺Ṏ넩ᶍㅦᲓㄖᰞ焁ᱵ\uf149ẛ넺Ḿ\uf133ᷡ煁ᵧ넯Ṿ\uf116ᰭㅸḟ넄ὲㄏ\u1ff1\uf172\u1c8b\uf12cᶲ넖᷵\uf146Ἳ焋ὲ\uf10e´\uf167ᵿ\uf116Ც넍ᾥㅿᳯ널ᵺㄦῥ\uf15dṋㄢᰞㄾώㅋᷛ넠ῶ焺᷽ㅑ᷋넇ὶ焛ὥ녝ồ焉ᶖㄻ᳝ㅛ᱗\uf110᳢\uf13bᾕ煬ᷫ\uf13aᵖ넴ἅㅕḫ넓ᾂ\uf114ᱍ년ᾯ\uf12eᷖ焜ῩㅒΎㄶᱢ\uf12dố녎ᶣ\uf106Ტ\uf116ṙ煤\u1cbb넣Ặ焰ḱㅒἧ\uf123Ḃ\uf12eᶭㅆ᳓焋ᾎ\uf10cᴽ\uf14aủ\uf119ᰆ넟ό녝ṯ넉ἦ넺ềㅲᴇ넆ᶒ너ᱽㅟṣㄆ᷎\uf13aử煶ỷ焁ἲ焏ᴁ\uf154ᾫ네ἶㄜᵉ녩Ჿ넶Ὦ\uf126᷽ㅰ᳓\uf137Ლ넺ᵡ\uf17eᲷ\u3100ᾲ\uf12a᳝煭Ἓ\uf13cṾ焛ᱡ녑ᴃ\uf106ῂ焊ᰩㅨᵏ\uf11a᷂焖\u1fd5ㅻᳳㄺὶㄱᶥ煱ểㄧᵎ焓ᶱ념Ყ焑Ṳ焽ṙ煰ᵓ\uf118ᴖ焀ᵡ煽ẫ\u3104Ṛ\uf119᾽ㅕṇ넇ᴎㄫᵩ\uf160ḻ焯΅\uf132ἁㅓḋ넞Ệ\uf100ᷕ녽ḇㄾἆㄡᵁ\uf148ᵷ넥ᶺ焵ᴑ煄ṏㄚᲢㄅᷡ녹ỳ넅΅ㄝộ\uf168ᱳ9￡ｻ\ufe53３２缇︍ｐﲋＯﶶ缘ﲑ뽽ﷃＯﵢ＆ﰝ罤ﴗ㼠ﲢ뼥ﳝｧｫ㼤ﱖ뼪\ufdcd㽣ﾓ０＆뼕ﳡｬ\ufde3㼈ﾺ㼢ﲵ罂ﾫ：ﲆＢﵕ뽔Ｗ㼠ﵺ㼛）｜ﴋ¨䐍듳䖳뒾䕎璂䜽\uf4d0䜧\uf4b9䘎㒚䓉瓹䜃\uf4a9䔂㒾䓁瓬䟓뒏䜂\uf487䒥㓌䝯㒌䐦璤䝱듼䖗\uf48b䒪\uf487䜹듗䜫\uf495䝚璷䟉㓟䙯㒁䜾\uf49b䛅듓䐷뒇䘶㒀䐅瓃䐏㒨䒪㒋䗁듂䜿뒎䛾뒋䒽瓀䑃\uf4a1䚚뒔䔑듉䒟璦䐞㒇䗕瓪䚿㒴䐎\uf4b9䞭\uf4f9䚧璿䗪㒒䛡\uf4ff䖗\uf488䔶뒣䜱듁䟷뒍䔾璲䜽\uf4f3䚷뒇䗎璪䚅듩䔷㒾䙢\uf496䞩\uf4e0䞋璃䓊璯䚙\uf4c2䗷뒡䟖\uf4a2䛱㓿䙣璏䜒뒿䕩\uf4dc䜟뒯䘶뒌䟑듵䚳뒺䖞뒸䐑듀䟓㒜䚂뒃䞕瓡䒋뒶䜢\uf4a6䝅듟䒋璚䕂㒲䚕瓜䓳璼䗒\uf4b7\n\uf55a俓\uf6a4辀\uf56d侽\uf6b6࿔\uf664쾳\u0010䯼ꐗ䡾\ue479䥇\ue44b䧴ꐋ䦾摹䡯⑭䩄ꐦ䩶ꑔ\n駨椘騖ꥋ駟楶騄⤟髖\ue978\u0010\udd0c浯\udc42ⴵ\udc5bⴎ\uddc4\ued57\udf1e괈\ude93괧\udf38浵\udc6aⴖ\n尞Շ忠씔尩ԩ忲䕀张蔧\u0010ᱵ논ᴓㄮḶ焋ᴥㅲἯㄻṲ焅ḅ\uf174ῳ\uf11d\n税ܦ称익稹݈秢䜡礰蝆";
      int var33 = 0;
      int var32 = 0;

      do {
         char var35 = var29.charAt(var33);
         int var37 = 0;
         char[] var36 = var29.substring(var33 + 1, var33 + 1 + var35).toCharArray();

         do {
            int var38 = var36[var37];

            var38 = (char)(switch (var37 % 6) {
               default -> 58;
               case 1 -> 162;
               case 2 -> 28;
               case 3 -> 231;
               case 4 -> 5;
               case 5 -> 247;
            }) ^ var38;
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

      abba = var31;
      abbb = new Object[var31.length];
      int var25 = 2021061383;
      byte[] var23 = "E\u001b\u0001îN9O\u008cÝ\u0082\u008eö\u0094¨uÎ\u007fAt\u0088lÑÁk\u009c·\u008d~|4\u0098Ëxí|\u001a³õY\u0099·]\u0016éBN+m\u0003«Õ\u0095\u0005\u0090»½õÑè\u008bcä\n]ô\u0014§å¹\u001e¡wßµ\u0003rz Lâòa².«ßÞÝ\u0006Ê\tÜê*úmP\u001f\u001buQ]ø1}\u0095l\u009bøÙ\u00adå\u0083í »ÏÛfqÌªgøB@\u0089DHÎf\u008c\u0081ï\u0000\u001c\u0002áX\u0001\u0013#\u009düSÇ\u00adîñ]\u009b_\tÕ©Å£Ërä\u009acw(À«\u009dÁ®>cR3\u00868Í°\u009b\u00adk>ÿ\u0090Q4\u001d¼ÁI\u001aå\u0098û/´\u0086þ\u0099¿éPÂüÍ\u008fÊ°·\u0003EV[\u009cåË->\fµùû,²w\u008fm¤\u0082QÍ{×\u009b\u0004&;5\u0015 |þZÑD\u009d\u0080û#[\u0094hy»<>àÇboÍ¬:Ú©6UVOmò`oSÖ\u0018©«Ä\u0016ë+\u000eX\u0019`?\u00038wCA\tbC>t\u009b\u0013u\u0098µÌ\u0016\u001d¬ÜÕ¦ßÍ3~\u0088D\u008fYÃ:\u008b)S\u0005Ùæí³ûC\u0006\u0000U|\u0081_>ÐÉ\u009e\u001d\b§\u009c]X)\b*-«\u0093Ì¾ Ddaý\u0090÷\u0087\u008cxì<ðmM¡ª_âY£Æ©5mÝC\u001fÑu\u001b\u001aÓ8\u0007³\u008eà}®Ê\u0098G\u0082I³nÃ´ÿ\u0006»\u0098¤ö9\u001d\u001f\u0084Êhð¿Ñ2\u0007Vëc×\u0016ãöÖ\u00079Ù&\u0005\u0091\u0095¡,Ñ\nãÝH\u0015_z\u001e\u0098\u0013V·\u0001.À»1]fk\t1TÌ\u0084\u0014õp¢\u00adOC¼ñ\"\u0098n\u0081\u001d\u008d:Ë\u001d¡R\t\u0087Ñé'\u008dZ$(\\_©+?¿\u0004C½\u0086°\u0006\u0088¿d»ÒLosA§\u0092}\bÏ\u0097\u000fyµ\u001bÇ/¥ºô\u0096;N\u0016áB¨Åö{Ö\u0081Ö¢Ù`q¾Ï¤ú(,ÇA®þ§$X?úzöÜÏ/0{Ì6{¤>Û¼Þ\u0007Ôè\u0001V?\fD\u0015i\u009c?\u001eQ®\u0006ur3Á\ró0îS\u0094õiÍRR\u0003\u008eó{&'ê\u0080ÁT|`æ_\u009a_@+P\\\u0096S\u0000©\u000eØdÌ]ì2Ð\u001f\u0087\u0007ÌM|ë@+aÃÖ\u000bJ¦úÿø|\u0080´(«H\u0094\u0012q\t\u009d\u0095-(°4F\u0019Z¨Ñãø\u0004\u000eÇÂ&g\u0085;°gíÛkTrÈ\u0017kÏS0\u0011º\u007fÛÇ\u0093~[µCAÆV\u0004dó@>\u000e\u00923\u001cyÂSaU&0õ\u0018m\u001eeÄ]\u0001\u009bp>>\u0096r½\u000b)cþ\u0081Ö\u001eð_ÛC\u0016Z±®\u008e\u0000ù\u0089\u0016\u009b3)\u001cl\u0091p¢!\u008d\u0085\u0089)\u009e_ö\u0099ñ*:t\u0091\u0018òß#õ\u0010õNIÒ\u0085°ò@q¤\u009e\f\u0096\u0016\u0094,.vèµH\u000e_\u00007æÊcì¥Ù>ïò\u008a;tZz.ª\\\u008b\u008cXÅ\u009f¶¯e3foù¦ÿ3\"çû\fÐ\u008d\u0015Cpe÷u\u001a[þàt\u0004\u0012:ÍÚB\u007fÔ\\\u0013Ú¨}o!c!_\u0082V÷W8\u0010':=<¾ÊÍk8\u007f°\u00adÊ\u009e6·zg'éÊL{\b{²\u0082Æ\u0087\u0007\u008e\u0088\u009c¿7óP¨Ë¡ø$Ìàõ\u0017î2êDÉ\u0099S¤c×ªK°R\u0013]\u008a¨J^ªÑÞÑp\u0002Ã!,\u0084\"êU?°\u009aù\u009e·pÅâíÇC\u009a¢\u0094\u009fi\u00ad|+³Î\b´Í\u008eÿÄ\nV{\u00196[Ðê\u0015ø\u0014Io\tÒ\u0080,p$\u001d½\u009aÎÒ~É2\u0088\u0012í·\\\u0000U\u001cÁ@\u00828&ÌZAèñ®WZ\u008aÇ\u008bZþ\u0001ª\u0016h·´áÜé\u0097\u0093ÑõÁPgBØ_î#xÖUO\u00901©Ø0`\u0080JìÉ¶\u007f¸ÒA©!Ê\u0098\u0095¨qþT¼¯\u0096¶ª\u008e\n\u001fåîî<*\u0092y=\u001fáÉ\u0011_Ì\u0080x·Ë\u0094OØ^eut\u0084Ö1yG§\u009b\u00916Ê¯Ml6\u0018²~Ã\u000e\u0002ñ}&É\u0082ÎìÃZÊa»Ku\u0081À\u000e\u0003Ü^ø\u0010\u009d0Ðñ\u001aÎÍ\u0093\u0001XG=l'9Q!\u0091y\u009bF0Ô\u008dç£Ö>\u0018\u008fY\u007fÆ\u0014²^\u0085!µT°êKÊ`>[ërîµÄ\u0086\u0097\u0089\u0092\u0090¾\u0099\u008c!cï\u0002x_ì9º\u0005¸+$ý8\u009c\u001bà\u0095åFo\u001fÉ\u0004\u0096®Õ\u0084dÁ<x\u001f=UlI¢\u0011\u0007\u0099mÐ\u001c\u0085X\u0018ÙÖ\u000eï\u008f¥\u009bÎT\u008eÈ©HÉ²¼6A\u000f§î\u009ed¬\u0096(é\\ëÊcfÂ9g\u0081Dä\u0019?å\u0099f)XW-\u00850ã\u0015\u00930wýtw\u001a´cÃñ5\"\u009a¿ç\u008còZ\r¶â\u0004r\u008a\u0092\b»¬mÏ~\u000e¾=ß\nÕ4a¯\u0018É^`RÝ!·l\u009a{Y\u0087Ç\u001cyË\u0017×q×\u0084\u0091Õ8\u0011h\u0006g²\u0000×Ì\u001bei\u0003_\u0013[¦\u008f\u0001\u001erÄÔ]\u001eà\u001bCêÆ\u0082ý\u00899\u00adKìè6\u007f¡\u008eÜ\u0007¢4\u0007Ù\u001eêý÷\u009d¦¾Ü.l ~»ð\u0012Õ£zGO\u00136Þ\u0016z\u0010Þ\u008b2;¹ý H¿\u0081ØxlK40É\u008dý¢wUYuÏ6\u0011Ì\u008d¶%~Àýß*`/'Óû}µ\u009c\u008e\u009b\tæÉÒ¼¦\u008a\u008d£ÍÁRF\u0015\u0087\f^4IJæ\u009dÔ¡K' D\u0089]ÑF\b\u0084ÙÃ\u00961º´\u0092¼Á\u0016ä\u000f\u0006\u008eÜ¸ê\u0095_Íu\u0016ð2dF\u001bÆ\u0003\u0092\u008d\u0092\u0018\u0010È\u0080ë\u0096]J\u008eñõ\u0012Ì½z\u0000¢§¿S\n1Z3qNÝk\u008d\u001d¡\u001bº\u007fµçâOþ\n\u0094Oÿ\u0091\u009bGðV÷÷\u0092\u009d\u0089Ç\u008fú \t¤è\u008dqÅW\u0001ç¶ò\u0013\u0094¶ú\u0086ä#\t]I\u0096eÂÖÃiå\u0011å\u001b\u0082\u0095`?\u0082\u0016^\u001d<\u0098\u0012>J\u001e\u0093G\u008fï:¦Pz \u0094\rkX6}*Æg át# |z`÷Í¡»\u009a\nr\u001b\u0004[d\u009b©tþÂªÉè\u008bÂ\u009aò+\u0087\u009f"
         .getBytes("ISO-8859-1");
      int var24 = var23.length / 4;
      abab = new int[var24];
      byte var26 = 0;
      int var27 = 0;

      do {
         int var28 = (var23[var26] & 255) << 24 | (var23[var26 + 1] & 255) << 16 | (var23[var26 + 2] & 255) << 8 | var23[var26 + 3] & 255;
         var28 ^= var25;
         abab[var27] = var28;
         var26 += 4;
      } while (++var27 < var24);

      String[] var21 = new String[aabab(-1967603712, var39 ^ 1338235170)];
      int var19 = 0;
      String var18;
      int var20 = (var18 = aabba('㢚', 1621199961, 18417, 1427151104)).length();
      int var17 = aabab(-1967603711, var39 ^ -1054263379);
      int var43 = -1;

      label139:
      while (true) {
         String var46 = var18.substring(++var43, var43 + var17);
         int var50 = -1;

         while (true) {
            char[] var67;
            label134: {
               char[] var52 = var46.toCharArray();
               int var10003 = var52.length;
               int var22 = 0;
               var67 = var52;
               var50 = var10003;
               char[] var79;
               int var10004;
               if (var10003 <= 1) {
                  var79 = var52;
                  var10004 = var22;
               } else {
                  var67 = var52;
                  var50 = var10003;
                  if (var10003 <= var22) {
                     break label134;
                  }

                  var79 = var52;
                  var10004 = var22;
               }

               while (true) {
                  var79[var10004] = (char)(var79[var10004] ^ switch (var22 % aabab(-1967603652, var39 ^ -2121734412)) {
                     case 0 -> aabab(-1967603651, var39 ^ -1874189808);
                     case 1 -> aabab(-1967603654, var39 ^ -793898211);
                     case 2 -> aabab(-1967603653, var39 ^ 1916020156);
                     case 3 -> aabab(-1967603656, var39 ^ -1967384806);
                     case 4 -> aabab(-1967603655, var39 ^ 547540006);
                     case 5 -> aabab(-1967603658, var39 ^ 420137469);
                     default -> aabab(-1967603657, var39 ^ 1136796446);
                  });
                  var22++;
                  if (var50 == 0) {
                     var10004 = var50;
                     var79 = var67;
                  } else {
                     if (var50 <= var22) {
                        break;
                     }

                     var79 = var67;
                     var10004 = var22;
                  }
               }
            }

            String var86 = new String(var67).intern();
            switch (var50) {
               case 0:
                  var21[var19++] = var86;
                  if ((var43 += var17) >= var20) {
                     ba = var21;
                     aab = new String[aabab(-1967603649, var39 ^ 42385145)];
                     long var8 = 3820250524658109998L;
                     long[] var14 = new long[aabab(-1967603660, var39 ^ 760733119)];
                     int var11 = 0;
                     String var12;
                     int var13 = (var12 = aabba('颂', 1621199963, 9410, 531123290)).length();
                     byte var10 = 0;

                     label113:
                     while (true) {
                        int var59 = var10;
                        var10 += 8;
                        byte[] var15 = var12.substring(var59, var10).getBytes(aabba(5519, 1621199962, (char)'\ue9f2', -1028792183));
                        long[] var48 = var14;
                        var59 = var11++;
                        long var73 = (var15[0] & 255L) << aabab(-1967603659, var39 ^ -1326479868)
                           | (var15[1] & 255L) << aabab(-1967603662, var39 ^ 871502765)
                           | (var15[2] & 255L) << aabab(-1967603661, var39 ^ -1114231154)
                           | (var15[3] & 255L) << aabab(-1967603664, var39 ^ -1217134059)
                           | (var15[4] & 255L) << aabab(-1967603663, var39 ^ -898409611)
                           | (var15[5] & 255L) << aabab(-1967603666, var39 ^ 2017856124)
                           | (var15[aabab(-1967603665, var39 ^ 2112880948)] & 255L) << aabab(-1967603668, var39 ^ -743751123)
                           | var15[aabab(-1967603667, var39 ^ 212012627)] & 255L;
                        byte var87 = -1;

                        while (true) {
                           long var92 = var73 ^ var8;
                           switch (var87) {
                              case 0:
                                 var48[var59] = var92;
                                 if (var10 >= var13) {
                                    aa = var14;
                                    aaa = new Integer[aabab(-1967603677, var39 ^ 518604249)];
                                    aaaa = baa(aabab(-1967603680, var39 ^ -654446089), 6376010489212437043L);
                                    ab = baa(aabab(-1967603679, var39 ^ 945143382), 2081232387741687290L);
                                    aabb = baa(aabab(-1967603618, var39 ^ 1141583998), 836835025542333679L);
                                    long var0 = 325706356084132248L;
                                    long[] var6 = new long[4];
                                    int var3 = 0;
                                    String var4;
                                    int var5 = (var4 = aabba('되', 1621199967, (char)'\ue64f', 1455932562)).length();
                                    byte var2 = 0;

                                    label103:
                                    while (true) {
                                       int var62 = var2;
                                       var2 += 8;
                                       byte[] var7 = var4.substring(var62, var2).getBytes(aabba('묎', 1621199966, '콩', -606256442));
                                       long[] var49 = var6;
                                       var62 = var3++;
                                       long var75 = (var7[0] & 255L) << aabab(-1967603617, var39 ^ 793994250)
                                          | (var7[1] & 255L) << aabab(-1967603620, var39 ^ -1254299417)
                                          | (var7[2] & 255L) << aabab(-1967603619, var39 ^ -291774754)
                                          | (var7[3] & 255L) << aabab(-1967603622, var39 ^ -792746473)
                                          | (var7[4] & 255L) << aabab(-1967603621, var39 ^ 682469484)
                                          | (var7[5] & 255L) << aabab(-1967603624, var39 ^ -1469585771)
                                          | (var7[aabab(-1967603623, var39 ^ -480854637)] & 255L) << aabab(-1967603626, var39 ^ -198508653)
                                          | var7[aabab(-1967603625, var39 ^ -517308182)] & 255L;
                                       byte var89 = -1;

                                       while (true) {
                                          var92 = var75 ^ var0;
                                          switch (var89) {
                                             case 0:
                                                var49[var62] = var92;
                                                if (var2 >= var5) {
                                                   b = var6;
                                                   bab = new Long[4];
                                                   bbb = abba(aabab(-1967603635, var39 ^ 37119966), 3629253237912085961L);
                                                   baa = aabbaaaba.aaab(
                                                      baab(aabab(-1967603638, var39 ^ 1257575022), aabab(-1967603637, var39 ^ 620195697))
                                                   );
                                                   bba = aabbaaaba.aaab(
                                                      baab(aabab(-1967603640, var39 ^ -1436342937), aabab(-1967603639, var39 ^ 687515940))
                                                   );
                                                   aaab = aabbaaaba.aaab(
                                                      baab(aabab(-1967603642, var39 ^ 590310647), aabab(-1967603641, var39 ^ 2130286034))
                                                   );
                                                   a = aabbaaaba.aaab(
                                                      baab(aabab(-1967603644, var39 ^ 252961634), aabab(-1967603643, var39 ^ 1929792651))
                                                   );
                                                   aaba = ConcurrentHashMap.newKeySet();
                                                   abb = new ConcurrentHashMap();
                                                   abaa = new AtomicInteger();
                                                   bb = Executors.newFixedThreadPool(2, baaabbab::aaaa);
                                                   aba = bbbb();
                                                   return;
                                                }
                                                break;
                                             default:
                                                var49[var62] = var92;
                                                if (var2 < var5) {
                                                   continue label103;
                                                }

                                                var5 = (var4 = aabba('\uf2bc', 1621199953, '끐', 1028039719)).length();
                                                var2 = 0;
                                          }

                                          byte var64 = var2;
                                          var2 += 8;
                                          var7 = var4.substring(var64, var2).getBytes(aabba((char)'酁', 1621199952, 6287, 590329573));
                                          var49 = var6;
                                          var62 = var3++;
                                          var75 = (var7[0] & 255L) << aabab(-1967603628, var39 ^ 410700592)
                                             | (var7[1] & 255L) << aabab(-1967603627, var39 ^ 916826300)
                                             | (var7[2] & 255L) << aabab(-1967603630, var39 ^ 800418584)
                                             | (var7[3] & 255L) << aabab(-1967603629, var39 ^ 1554288073)
                                             | (var7[4] & 255L) << aabab(-1967603632, var39 ^ 187511253)
                                             | (var7[5] & 255L) << aabab(-1967603631, var39 ^ 1079195052)
                                             | (var7[aabab(-1967603634, var39 ^ -798202022)] & 255L) << aabab(-1967603633, var39 ^ 1859798464)
                                             | var7[aabab(-1967603636, var39 ^ -2056655879)] & 255L;
                                          var89 = 0;
                                       }
                                    }
                                 }
                                 break;
                              default:
                                 var48[var59] = var92;
                                 if (var10 < var13) {
                                    continue label113;
                                 }

                                 var13 = (var12 = aabba(15162, 1621199965, '餹', -577367719)).length();
                                 var10 = 0;
                           }

                           byte var61 = var10;
                           var10 += 8;
                           var15 = var12.substring(var61, var10).getBytes(aabba((char)'肧', 1621199964, (char)'\uf031', 1692858184));
                           var48 = var14;
                           var59 = var11++;
                           var73 = (var15[0] & 255L) << aabab(-1967603670, var39 ^ -2144540531)
                              | (var15[1] & 255L) << aabab(-1967603669, var39 ^ 529298930)
                              | (var15[2] & 255L) << aabab(-1967603672, var39 ^ -1117451459)
                              | (var15[3] & 255L) << aabab(-1967603671, var39 ^ 2017791162)
                              | (var15[4] & 255L) << aabab(-1967603674, var39 ^ 201595512)
                              | (var15[5] & 255L) << aabab(-1967603673, var39 ^ -760953564)
                              | (var15[aabab(-1967603676, var39 ^ 409835757)] & 255L) << aabab(-1967603675, var39 ^ -1233379691)
                              | var15[aabab(-1967603678, var39 ^ 2100522927)] & 255L;
                           var87 = 0;
                        }
                     }
                  }

                  var17 = var18.charAt(var43);
                  break;
               default:
                  var21[var19++] = var86;
                  if ((var43 += var17) < var20) {
                     var17 = var18.charAt(var43);
                     continue label139;
                  }

                  var20 = (var18 = aabba(26916, 1621199960, 10933, -361652764)).length();
                  var17 = aabab(-1967603650, var39 ^ -878192606);
                  var43 = -1;
            }

            var46 = var18.substring(++var43, var43 + var17);
            var50 = 0;
         }
      }
   }

   public static void baaa(String param0, Consumer param1) {
      // $VF: Couldn't be decompiled
      // Please report this to the Vineflower issue tracker, at https://github.com/Vineflower/vineflower/issues with a copy of the class file (if you have the rights to distribute it!)
      // java.lang.RuntimeException: parsing failure!
      //   at org.jetbrains.java.decompiler.modules.decompiler.decompose.DomHelper.parseGraph(DomHelper.java:211)
      //   at org.jetbrains.java.decompiler.main.rels.MethodProcessor.codeToJava(MethodProcessor.java:166)
      //
      // Bytecode:
      // 00: getstatic qeaa361f143ee4a0894bd168fd9b30c66/qf4ccf8f5435d4a78bdca4d6a018b578e/aabbabbab.ab I
      // 03: istore 2
      // 04: iload 2
      // 05: aload 0
      // 06: invokestatic qeaa361f143ee4a0894bd168fd9b30c66/qf4ccf8f5435d4a78bdca4d6a018b578e/baaabbab.a (Ljava/lang/String;)Lqeaa361f143ee4a0894bd168fd9b30c66/qf4ccf8f5435d4a78bdca4d6a018b578e/babaaab;
      // 09: astore 3
      // 0a: ifne 23
      // 0d: aload 3
      // 0e: ifnonnull 24
      // 11: goto 15
      // 14: athrow
      // 15: aload 1
      // 16: bipush 0
      // 17: invokestatic java/lang/Boolean.valueOf (Z)Ljava/lang/Boolean;
      // 1a: invokeinterface java/util/function/Consumer.accept (Ljava/lang/Object;)V 2
      // 1f: goto 23
      // 22: athrow
      // 23: return
      // 24: getstatic qeaa361f143ee4a0894bd168fd9b30c66/qf4ccf8f5435d4a78bdca4d6a018b578e/baaabbab.abaa Ljava/util/concurrent/atomic/AtomicInteger;
      // 27: invokevirtual java/util/concurrent/atomic/AtomicInteger.incrementAndGet ()I
      // 2a: istore 4
      // 2c: iload 2
      // 2d: ifne 7c
      // 30: iload 4
      // 32: bipush 4
      // 33: if_icmple 4d
      // 36: goto 3a
      // 39: athrow
      // 3a: getstatic qeaa361f143ee4a0894bd168fd9b30c66/qf4ccf8f5435d4a78bdca4d6a018b578e/baaabbab.abaa Ljava/util/concurrent/atomic/AtomicInteger;
      // 3d: invokevirtual java/util/concurrent/atomic/AtomicInteger.decrementAndGet ()I
      // 40: pop
      // 41: aload 1
      // 42: bipush 0
      // 43: invokestatic java/lang/Boolean.valueOf (Z)Ljava/lang/Boolean;
      // 46: invokeinterface java/util/function/Consumer.accept (Ljava/lang/Object;)V 2
      // 4b: return
      // 4c: athrow
      // 4d: aload 3
      // 4e: invokedynamic get (Lqeaa361f143ee4a0894bd168fd9b30c66/qf4ccf8f5435d4a78bdca4d6a018b578e/babaaab;)Ljava/util/function/Supplier; bsm=java/lang/invoke/LambdaMetafactory.metafactory (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;Ljava/lang/invoke/MethodType;Ljava/lang/invoke/MethodHandle;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[ ()Ljava/lang/Object;, qeaa361f143ee4a0894bd168fd9b30c66/qf4ccf8f5435d4a78bdca4d6a018b578e/baaabbab.abbb (Lqeaa361f143ee4a0894bd168fd9b30c66/qf4ccf8f5435d4a78bdca4d6a018b578e/babaaab;)Ljava/lang/Boolean;, ()Ljava/lang/Boolean; ]
      // 53: getstatic qeaa361f143ee4a0894bd168fd9b30c66/qf4ccf8f5435d4a78bdca4d6a018b578e/baaabbab.bb Ljava/util/concurrent/ExecutorService;
      // 56: invokestatic java/util/concurrent/CompletableFuture.supplyAsync (Ljava/util/function/Supplier;Ljava/util/concurrent/Executor;)Ljava/util/concurrent/CompletableFuture;
      // 59: ldc_w -1967603605
      // 5c: ldc_w -1277126368
      // 5f: ldc_w -35849265
      // 62: ixor
      // 63: invokestatic qeaa361f143ee4a0894bd168fd9b30c66/qf4ccf8f5435d4a78bdca4d6a018b578e/baaabbab.aabab (II)I
      // 66: ldc2_w 5738602285754737749
      // 69: invokestatic qeaa361f143ee4a0894bd168fd9b30c66/qf4ccf8f5435d4a78bdca4d6a018b578e/baaabbab.abba (IJ)J
      // 6c: getstatic java/util/concurrent/TimeUnit.SECONDS Ljava/util/concurrent/TimeUnit;
      // 6f: invokevirtual java/util/concurrent/CompletableFuture.orTimeout (JLjava/util/concurrent/TimeUnit;)Ljava/util/concurrent/CompletableFuture;
      // 72: aload 1
      // 73: invokedynamic accept (Ljava/util/function/Consumer;)Ljava/util/function/BiConsumer; bsm=java/lang/invoke/LambdaMetafactory.metafactory (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;Ljava/lang/invoke/MethodType;Ljava/lang/invoke/MethodHandle;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[ (Ljava/lang/Object;Ljava/lang/Object;)V, qeaa361f143ee4a0894bd168fd9b30c66/qf4ccf8f5435d4a78bdca4d6a018b578e/baaabbab.bba (Ljava/util/function/Consumer;Ljava/lang/Boolean;Ljava/lang/Throwable;)V, (Ljava/lang/Boolean;Ljava/lang/Throwable;)V ]
      // 78: invokevirtual java/util/concurrent/CompletableFuture.whenComplete (Ljava/util/function/BiConsumer;)Ljava/util/concurrent/CompletableFuture;
      // 7b: pop
      // 7c: goto 95
      // 7f: astore 5
      // 81: aload 5
      // 83: pop
      // 84: getstatic qeaa361f143ee4a0894bd168fd9b30c66/qf4ccf8f5435d4a78bdca4d6a018b578e/baaabbab.abaa Ljava/util/concurrent/atomic/AtomicInteger;
      // 87: invokevirtual java/util/concurrent/atomic/AtomicInteger.decrementAndGet ()I
      // 8a: pop
      // 8b: aload 1
      // 8c: bipush 0
      // 8d: invokestatic java/lang/Boolean.valueOf (Z)Ljava/lang/Boolean;
      // 90: invokeinterface java/util/function/Consumer.accept (Ljava/lang/Object;)V 2
      // 95: return
   }

   private static String baab(int var0, int var1) {
      int var9 = -2122064916;
      int var2 = (var0 ^ aabab(-1967603608, var9 ^ 499980008)) & aabab(-1967603607, var9 ^ 1233513041);
      if (aab[var2] == null) {
         char[] var3 = ba[var2].toCharArray();

         int var4 = switch (var3[0] & aabab(-1967603610, var9 ^ 558316846)) {
            case 0 -> aabab(-1967603609, var9 ^ -1704380644);
            case 1 -> aabab(-1967603612, var9 ^ 1466361520);
            case 2 -> aabab(-1967603611, var9 ^ -630879072);
            case 3 -> aabab(-1967603614, var9 ^ 1997342556);
            case 4 -> aabab(-1967603613, var9 ^ -1018678673);
            case 5 -> aabab(-1967603616, var9 ^ 401959113);
            case 6 -> aabab(-1967603615, var9 ^ 473824226);
            case 7 -> aabab(-1967603554, var9 ^ -516705577);
            case 8 -> 2;
            case 9 -> aabab(-1967603553, var9 ^ -465452048);
            case 10 -> aabab(-1967603556, var9 ^ 1753847184);
            case 11 -> aabab(-1967603555, var9 ^ -910545846);
            case 12 -> aabab(-1967603558, var9 ^ 1029200731);
            case 13 -> aabab(-1967603557, var9 ^ -611627778);
            case 14 -> aabab(-1967603560, var9 ^ -1513134753);
            case 15 -> aabab(-1967603559, var9 ^ -1439773705);
            case 16 -> aabab(-1967603562, var9 ^ -1125498544);
            case 17 -> aabab(-1967603561, var9 ^ 1602875982);
            case 18 -> aabab(-1967603564, var9 ^ -1914071135);
            case 19 -> aabab(-1967603563, var9 ^ 1286914177);
            case 20 -> aabab(-1967603566, var9 ^ -1350462091);
            case 21 -> aabab(-1967603565, var9 ^ 142773302);
            case 22 -> aabab(-1967603568, var9 ^ -680500765);
            case 23 -> aabab(-1967603567, var9 ^ -1387698372);
            case 24 -> aabab(-1967603570, var9 ^ 1914209593);
            case 25 -> aabab(-1967603569, var9 ^ 928766573);
            case 26 -> aabab(-1967603572, var9 ^ 1280369230);
            case 27 -> aabab(-1967603571, var9 ^ 1966850452);
            case 28 -> aabab(-1967603574, var9 ^ -1304213200);
            case 29 -> aabab(-1967603573, var9 ^ -1659031833);
            case 30 -> aabab(-1967603576, var9 ^ 444852458);
            case 31 -> aabab(-1967603575, var9 ^ 1891647632);
            case 32 -> aabab(-1967603578, var9 ^ 1432965355);
            case 33 -> aabab(-1967603577, var9 ^ -1306865720);
            case 34 -> aabab(-1967603580, var9 ^ -1794039793);
            case 35 -> aabab(-1967603579, var9 ^ 862317270);
            case 36 -> aabab(-1967603582, var9 ^ -451036663);
            case 37 -> aabab(-1967603581, var9 ^ 2107037458);
            case 38 -> aabab(-1967603584, var9 ^ 782403732);
            case 39 -> aabab(-1967603583, var9 ^ 1825158149);
            case 40 -> aabab(-1967603522, var9 ^ 1043485034);
            case 41 -> aabab(-1967603521, var9 ^ 1479506352);
            case 42 -> 0;
            case 43 -> aabab(-1967603524, var9 ^ 2013533549);
            case 44 -> aabab(-1967603523, var9 ^ -1934176434);
            case 45 -> aabab(-1967603526, var9 ^ -949612075);
            case 46 -> aabab(-1967603525, var9 ^ -413349079);
            case 47 -> aabab(-1967603528, var9 ^ -287598761);
            case 48 -> 3;
            case 49 -> aabab(-1967603527, var9 ^ -1015350212);
            case 50 -> aabab(-1967603530, var9 ^ 702966589);
            case 51 -> aabab(-1967603529, var9 ^ -1958038422);
            case 52 -> aabab(-1967603532, var9 ^ -1318527542);
            case 53 -> aabab(-1967603531, var9 ^ 1224659987);
            case 54 -> aabab(-1967603534, var9 ^ -1473909248);
            case 55 -> aabab(-1967603533, var9 ^ -1151741600);
            case 56 -> aabab(-1967603536, var9 ^ 545170037);
            case 57 -> aabab(-1967603535, var9 ^ 211121163);
            case 58 -> aabab(-1967603538, var9 ^ 219481778);
            case 59 -> aabab(-1967603537, var9 ^ 847832570);
            case 60 -> aabab(-1967603540, var9 ^ 398326323);
            case 61 -> aabab(-1967603539, var9 ^ 2111602901);
            case 62 -> aabab(-1967603542, var9 ^ 177006956);
            case 63 -> aabab(-1967603541, var9 ^ 644385716);
            case 64 -> aabab(-1967603544, var9 ^ 1797500344);
            case 65 -> aabab(-1967603543, var9 ^ -1223443673);
            case 66 -> aabab(-1967603546, var9 ^ 57705527);
            case 67 -> aabab(-1967603545, var9 ^ 32747798);
            case 68 -> aabab(-1967603548, var9 ^ 279985045);
            case 69 -> aabab(-1967603547, var9 ^ 1841228810);
            case 70 -> aabab(-1967603550, var9 ^ 811131053);
            case 71 -> aabab(-1967603549, var9 ^ -574571786);
            case 72 -> aabab(-1967603552, var9 ^ -94887523);
            case 73 -> aabab(-1967603551, var9 ^ 1515378364);
            case 74 -> aabab(-1967603490, var9 ^ 65838005);
            case 75 -> aabab(-1967603489, var9 ^ -154692656);
            case 76 -> aabab(-1967603492, var9 ^ 750266990);
            case 77 -> aabab(-1967603491, var9 ^ 1500825387);
            case 78 -> aabab(-1967603494, var9 ^ 1807508960);
            case 79 -> aabab(-1967603493, var9 ^ -2040639596);
            case 80 -> aabab(-1967603496, var9 ^ 983318359);
            case 81 -> aabab(-1967603495, var9 ^ -2129736795);
            case 82 -> aabab(-1967603498, var9 ^ -314430348);
            case 83 -> aabab(-1967603497, var9 ^ -412967438);
            case 84 -> aabab(-1967603500, var9 ^ -1677987311);
            case 85 -> aabab(-1967603499, var9 ^ 743345416);
            case 86 -> aabab(-1967603502, var9 ^ -1188211085);
            case 87 -> aabab(-1967603501, var9 ^ -1435478652);
            case 88 -> aabab(-1967603504, var9 ^ -109719954);
            case 89 -> aabab(-1967603503, var9 ^ 157292992);
            case 90 -> aabab(-1967603506, var9 ^ -121445827);
            case 91 -> aabab(-1967603505, var9 ^ -319285861);
            case 92 -> aabab(-1967603508, var9 ^ 1076417949);
            case 93 -> aabab(-1967603507, var9 ^ -709785330);
            case 94 -> aabab(-1967603510, var9 ^ -1800030584);
            case 95 -> aabab(-1967603509, var9 ^ -27526777);
            case 96 -> aabab(-1967603512, var9 ^ 381275986);
            case 97 -> aabab(-1967603511, var9 ^ 682646124);
            case 98 -> 5;
            case 99 -> aabab(-1967603514, var9 ^ 2002550927);
            case 100 -> aabab(-1967603513, var9 ^ -1458780903);
            case 101 -> aabab(-1967603516, var9 ^ 794648719);
            case 102 -> aabab(-1967603515, var9 ^ 237081285);
            case 103 -> aabab(-1967603518, var9 ^ 1376860330);
            case 104 -> aabab(-1967603517, var9 ^ -2078700647);
            case 105 -> aabab(-1967603520, var9 ^ 1416922643);
            case 106 -> aabab(-1967603519, var9 ^ -846956742);
            case 107 -> aabab(-1967603458, var9 ^ 1261505191);
            case 108 -> aabab(-1967603457, var9 ^ -1177514806);
            case 109 -> aabab(-1967603460, var9 ^ 153722291);
            case 110 -> aabab(-1967603459, var9 ^ -1191001608);
            case 111 -> aabab(-1967603462, var9 ^ 150747196);
            case 112 -> aabab(-1967603461, var9 ^ -196529029);
            case 113 -> aabab(-1967603464, var9 ^ -269384630);
            case 114 -> aabab(-1967603463, var9 ^ 602304971);
            case 115 -> aabab(-1967603466, var9 ^ -1955957081);
            case 116 -> aabab(-1967603465, var9 ^ -2040966138);
            case 117 -> aabab(-1967603468, var9 ^ -1727368261);
            case 118 -> aabab(-1967603467, var9 ^ 552262028);
            case 119 -> aabab(-1967603470, var9 ^ -653981087);
            case 120 -> aabab(-1967603469, var9 ^ 1611870420);
            case 121 -> aabab(-1967603472, var9 ^ 957354062);
            case 122 -> aabab(-1967603471, var9 ^ -1382036954);
            case 123 -> aabab(-1967603474, var9 ^ -1334864310);
            case 124 -> aabab(-1967603473, var9 ^ 1369761528);
            case 125 -> aabab(-1967603476, var9 ^ -1009499195);
            case 126 -> aabab(-1967603475, var9 ^ -1002539404);
            case 127 -> aabab(-1967603478, var9 ^ -1635124856);
            case 128 -> aabab(-1967603477, var9 ^ -774232665);
            case 129 -> aabab(-1967603480, var9 ^ -567111184);
            case 130 -> aabab(-1967603479, var9 ^ -1119484071);
            case 131 -> aabab(-1967603482, var9 ^ -38699502);
            case 132 -> aabab(-1967603481, var9 ^ 624272236);
            case 133 -> aabab(-1967603484, var9 ^ 681463811);
            case 134 -> aabab(-1967603483, var9 ^ -1956973681);
            case 135 -> aabab(-1967603486, var9 ^ 2057057154);
            case 136 -> aabab(-1967603485, var9 ^ 57321460);
            case 137 -> aabab(-1967603488, var9 ^ -377460720);
            case 138 -> aabab(-1967603487, var9 ^ -1166263405);
            case 139 -> aabab(-1967603426, var9 ^ -1627787666);
            case 140 -> aabab(-1967603425, var9 ^ 642939626);
            case 141 -> 4;
            case 142 -> aabab(-1967603428, var9 ^ -243884771);
            case 143 -> aabab(-1967603427, var9 ^ 688872117);
            case 144 -> aabab(-1967603430, var9 ^ -585506419);
            case 145 -> aabab(-1967603429, var9 ^ -1262100193);
            case 146 -> aabab(-1967603432, var9 ^ 1927586860);
            case 147 -> aabab(-1967603431, var9 ^ -990225798);
            case 148 -> aabab(-1967603434, var9 ^ -1697044235);
            case 149 -> aabab(-1967603433, var9 ^ -2037390794);
            case 150 -> aabab(-1967603436, var9 ^ 831972551);
            case 151 -> aabab(-1967603435, var9 ^ 1345744204);
            case 152 -> aabab(-1967603438, var9 ^ 1021215687);
            case 153 -> aabab(-1967603437, var9 ^ -1417751849);
            case 154 -> aabab(-1967603440, var9 ^ 966947451);
            case 155 -> aabab(-1967603439, var9 ^ 217475558);
            case 156 -> aabab(-1967603442, var9 ^ -630230610);
            case 157 -> aabab(-1967603441, var9 ^ -421082542);
            case 158 -> aabab(-1967603444, var9 ^ 670176256);
            case 159 -> aabab(-1967603443, var9 ^ -974898087);
            case 160 -> aabab(-1967603446, var9 ^ 1823169714);
            case 161 -> aabab(-1967603445, var9 ^ 1331961894);
            case 162 -> aabab(-1967603448, var9 ^ 1313952688);
            case 163 -> aabab(-1967603447, var9 ^ 1645311968);
            case 164 -> aabab(-1967603450, var9 ^ 200896527);
            case 165 -> aabab(-1967603449, var9 ^ 1016521996);
            case 166 -> aabab(-1967603452, var9 ^ 104478338);
            case 167 -> aabab(-1967603451, var9 ^ 1110965335);
            case 168 -> aabab(-1967603454, var9 ^ -388002554);
            case 169 -> aabab(-1967603453, var9 ^ -603727926);
            case 170 -> aabab(-1967603456, var9 ^ 1811729645);
            case 171 -> aabab(-1967603455, var9 ^ 2102151807);
            case 172 -> aabab(-1967603394, var9 ^ 1434925547);
            case 173 -> aabab(-1967603393, var9 ^ -1618091562);
            case 174 -> aabab(-1967603396, var9 ^ 318108064);
            case 175 -> aabab(-1967603395, var9 ^ -225528416);
            case 176 -> aabab(-1967603398, var9 ^ -1357888618);
            case 177 -> aabab(-1967603397, var9 ^ -293707085);
            case 178 -> aabab(-1967603400, var9 ^ 1770026557);
            case 179 -> aabab(-1967603399, var9 ^ 1914109142);
            case 180 -> aabab(-1967603402, var9 ^ 527008427);
            case 181 -> aabab(-1967603401, var9 ^ 1390398455);
            case 182 -> aabab(-1967603404, var9 ^ 897478610);
            case 183 -> aabab(-1967603403, var9 ^ -1796381687);
            case 184 -> aabab(-1967603406, var9 ^ 1807868455);
            case 185 -> aabab(-1967603405, var9 ^ -1252392924);
            case 186 -> aabab(-1967603408, var9 ^ -160493859);
            case 187 -> aabab(-1967603407, var9 ^ -1012600599);
            case 188 -> aabab(-1967603410, var9 ^ 326164502);
            case 189 -> aabab(-1967603409, var9 ^ 27266586);
            case 190 -> aabab(-1967603412, var9 ^ -170314923);
            case 191 -> aabab(-1967603411, var9 ^ -470801737);
            case 192 -> aabab(-1967603414, var9 ^ 1378702525);
            case 193 -> aabab(-1967603413, var9 ^ 185685978);
            case 194 -> aabab(-1967603416, var9 ^ -917830884);
            case 195 -> aabab(-1967603415, var9 ^ 1471384311);
            case 196 -> aabab(-1967603418, var9 ^ 1756245614);
            case 197 -> aabab(-1967603417, var9 ^ 891397185);
            case 198 -> aabab(-1967603420, var9 ^ 2010649958);
            case 199 -> aabab(-1967603419, var9 ^ -148211015);
            case 200 -> aabab(-1967603422, var9 ^ 189894445);
            case 201 -> aabab(-1967603421, var9 ^ 520558900);
            case 202 -> aabab(-1967603424, var9 ^ 1960302133);
            case 203 -> aabab(-1967603423, var9 ^ 1875632942);
            case 204 -> aabab(-1967603362, var9 ^ -1432832653);
            case 205 -> aabab(-1967603361, var9 ^ -51697194);
            case 206 -> aabab(-1967603364, var9 ^ 666925755);
            case 207 -> aabab(-1967603363, var9 ^ 998703265);
            case 208 -> aabab(-1967603366, var9 ^ 1158659506);
            case 209 -> aabab(-1967603365, var9 ^ -1647255768);
            case 210 -> aabab(-1967603368, var9 ^ -446276746);
            case 211 -> aabab(-1967603367, var9 ^ -1736124171);
            case 212 -> aabab(-1967603370, var9 ^ -1317544719);
            case 213 -> aabab(-1967603369, var9 ^ 933929592);
            case 214 -> aabab(-1967603372, var9 ^ -1764238002);
            case 215 -> aabab(-1967603371, var9 ^ 723099560);
            case 216 -> aabab(-1967603374, var9 ^ 1135455989);
            case 217 -> aabab(-1967603373, var9 ^ 1127826990);
            case 218 -> aabab(-1967603376, var9 ^ 72617737);
            case 219 -> aabab(-1967603375, var9 ^ -1329623458);
            case 220 -> aabab(-1967603378, var9 ^ -370058173);
            case 221 -> aabab(-1967603377, var9 ^ -2129346644);
            case 222 -> aabab(-1967603380, var9 ^ -1857369777);
            case 223 -> aabab(-1967603379, var9 ^ -515505931);
            case 224 -> aabab(-1967603382, var9 ^ 511822867);
            case 225 -> aabab(-1967603381, var9 ^ -848075640);
            case 226 -> aabab(-1967603384, var9 ^ -1501898018);
            case 227 -> aabab(-1967603383, var9 ^ 1804068243);
            case 228 -> 1;
            case 229 -> aabab(-1967603386, var9 ^ 563321577);
            case 230 -> aabab(-1967603385, var9 ^ 534036530);
            case 231 -> aabab(-1967603388, var9 ^ -192303505);
            case 232 -> aabab(-1967603387, var9 ^ -1202099056);
            case 233 -> aabab(-1967603390, var9 ^ -1530254688);
            case 234 -> aabab(-1967603389, var9 ^ 1264572979);
            case 235 -> aabab(-1967603392, var9 ^ 352107396);
            case 236 -> aabab(-1967603391, var9 ^ -1084891473);
            case 237 -> aabab(-1967603330, var9 ^ 1880205566);
            case 238 -> aabab(-1967603329, var9 ^ -708723996);
            case 239 -> aabab(-1967603332, var9 ^ 25849648);
            case 240 -> aabab(-1967603331, var9 ^ 1840161016);
            case 241 -> aabab(-1967603334, var9 ^ -1719125669);
            case 242 -> aabab(-1967603333, var9 ^ -92856490);
            case 243 -> aabab(-1967603336, var9 ^ -1616474742);
            case 244 -> aabab(-1967603335, var9 ^ -759142762);
            case 245 -> aabab(-1967603338, var9 ^ -780485593);
            case 246 -> aabab(-1967603337, var9 ^ 1839484897);
            case 247 -> aabab(-1967603340, var9 ^ -286784093);
            case 248 -> aabab(-1967603339, var9 ^ 1562549177);
            case 249 -> aabab(-1967603342, var9 ^ -927028969);
            case 250 -> aabab(-1967603341, var9 ^ -801833787);
            case 251 -> aabab(-1967603344, var9 ^ 1618502995);
            case 252 -> aabab(-1967603343, var9 ^ 157183138);
            case 253 -> aabab(-1967603346, var9 ^ 1098187313);
            case 254 -> aabab(-1967603345, var9 ^ 1392903182);
            default -> aabab(-1967603348, var9 ^ -1422469192);
         };
         int var5 = (var1 & aabab(-1967603347, var9 ^ 1199469177)) - var4;
         if (var5 < 0) {
            var5 += 256;
         }

         int var6 = ((var1 & aabab(-1967603350, var9 ^ -1897102938)) >>> aabab(-1967603349, var9 ^ 708539561)) - var4;
         if (var6 < 0) {
            var6 += 256;
         }

         for (int var7 = 0; var7 < var3.length; var7++) {
            int var8 = var7 % 2;
            char var10002 = var3[var7];
            if (var8 == 0) {
               var3[var7] = (char)(var10002 ^ var5);
               var5 = ((var5 >>> 3 | var5 << 5) ^ var3[var7]) & aabab(-1967603352, var9 ^ 1652700743);
            } else {
               var3[var7] = (char)(var10002 ^ var6);
               var6 = ((var6 >>> 3 | var6 << 5) ^ var3[var7]) & aabab(-1967603351, var9 ^ 1446017805);
            }
         }

         aab[var2] = new String(var3).intern();
      }

      return aab[var2];
   }

   private static void baba(ababbbbaa param0, ababbbbaa param1) {
      // $VF: Couldn't be decompiled
      // Please report this to the Vineflower issue tracker, at https://github.com/Vineflower/vineflower/issues with a copy of the class file (if you have the rights to distribute it!)
      // java.lang.RuntimeException: parsing failure!
      //   at org.jetbrains.java.decompiler.modules.decompiler.decompose.DomHelper.parseGraph(DomHelper.java:211)
      //   at org.jetbrains.java.decompiler.main.rels.MethodProcessor.codeToJava(MethodProcessor.java:166)
      //
      // Bytecode:
      // 00: getstatic qeaa361f143ee4a0894bd168fd9b30c66/qf4ccf8f5435d4a78bdca4d6a018b578e/aabbabbab.ab I
      // 03: istore 2
      // 04: iload 2
      // 05: invokestatic net/minecraft/class_310.method_1551 ()Lnet/minecraft/class_310;
      // 08: astore 3
      // 09: ifne 21
      // 0c: aload 3
      // 0d: ifnonnull 16
      // 10: goto 14
      // 13: athrow
      // 14: return
      // 15: athrow
      // 16: aload 3
      // 17: aload 0
      // 18: aload 1
      // 19: invokedynamic run (Lqeaa361f143ee4a0894bd168fd9b30c66/qf4ccf8f5435d4a78bdca4d6a018b578e/ababbbbaa;Lqeaa361f143ee4a0894bd168fd9b30c66/qf4ccf8f5435d4a78bdca4d6a018b578e/ababbbbaa;)Ljava/lang/Runnable; bsm=java/lang/invoke/LambdaMetafactory.metafactory (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;Ljava/lang/invoke/MethodType;Ljava/lang/invoke/MethodHandle;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[ ()V, qeaa361f143ee4a0894bd168fd9b30c66/qf4ccf8f5435d4a78bdca4d6a018b578e/baaabbab.aa (Lqeaa361f143ee4a0894bd168fd9b30c66/qf4ccf8f5435d4a78bdca4d6a018b578e/ababbbbaa;Lqeaa361f143ee4a0894bd168fd9b30c66/qf4ccf8f5435d4a78bdca4d6a018b578e/ababbbbaa;)V, ()V ]
      // 1e: invokevirtual net/minecraft/class_310.execute (Ljava/lang/Runnable;)V
      // 21: return
   }

   public static void babb(String var0) {
      try {
         if (ab(
            aabbaaaba.abba(baab(aabab(-1967603354, -1354937837 ^ -2099709009), aabab(-1967603353, -1354937837 ^ 2049127300)))
         )) {
            return;
         }
      } catch (MatchException var1) {
         throw var1;
      }

      baba(baa, a);
   }

   public static String bbaa() {
      // $VF: Couldn't be decompiled
      // Please report this to the Vineflower issue tracker, at https://github.com/Vineflower/vineflower/issues with a copy of the class file (if you have the rights to distribute it!)
      // java.lang.RuntimeException: parsing failure!
      //   at org.jetbrains.java.decompiler.modules.decompiler.decompose.DomHelper.parseGraph(DomHelper.java:211)
      //   at org.jetbrains.java.decompiler.main.rels.MethodProcessor.codeToJava(MethodProcessor.java:166)
      //
      // Bytecode:
      // 000: ldc_w 769781747
      // 003: istore 4
      // 005: getstatic qeaa361f143ee4a0894bd168fd9b30c66/qf4ccf8f5435d4a78bdca4d6a018b578e/aabbabbab.ab I
      // 008: invokestatic qeaa361f143ee4a0894bd168fd9b30c66/qf4ccf8f5435d4a78bdca4d6a018b578e/abaaaaaba.aaaaa ()Lqeaa361f143ee4a0894bd168fd9b30c66/qf4ccf8f5435d4a78bdca4d6a018b578e/abaaaaaba;
      // 00b: astore 1
      // 00c: istore 0
      // 00d: aload 1
      // 00e: iload 0
      // 00f: ifne 01a
      // 012: ifnull 135
      // 015: goto 019
      // 018: athrow
      // 019: aload 1
      // 01a: iload 0
      // 01b: ifne 02d
      // 01e: invokevirtual qeaa361f143ee4a0894bd168fd9b30c66/qf4ccf8f5435d4a78bdca4d6a018b578e/abaaaaaba.aaba ()Lqeaa361f143ee4a0894bd168fd9b30c66/qf4ccf8f5435d4a78bdca4d6a018b578e/babbaba;
      // 021: ifnull 135
      // 024: goto 028
      // 027: athrow
      // 028: aload 1
      // 029: goto 02d
      // 02c: athrow
      // 02d: invokevirtual qeaa361f143ee4a0894bd168fd9b30c66/qf4ccf8f5435d4a78bdca4d6a018b578e/abaaaaaba.aaba ()Lqeaa361f143ee4a0894bd168fd9b30c66/qf4ccf8f5435d4a78bdca4d6a018b578e/babbaba;
      // 030: invokevirtual qeaa361f143ee4a0894bd168fd9b30c66/qf4ccf8f5435d4a78bdca4d6a018b578e/babbaba.abbbbb ()Lqeaa361f143ee4a0894bd168fd9b30c66/qf4ccf8f5435d4a78bdca4d6a018b578e/bbbaaba;
      // 033: astore 2
      // 034: aload 2
      // 035: iload 0
      // 036: ifne 041
      // 039: ifnull 058
      // 03c: goto 040
      // 03f: athrow
      // 040: aload 2
      // 041: iload 0
      // 042: ifne 054
      // 045: invokevirtual qeaa361f143ee4a0894bd168fd9b30c66/qf4ccf8f5435d4a78bdca4d6a018b578e/bbbaaba.babbb ()Z
      // 048: ifeq 058
      // 04b: goto 04f
      // 04e: athrow
      // 04f: aload 2
      // 050: goto 054
      // 053: athrow
      // 054: invokevirtual qeaa361f143ee4a0894bd168fd9b30c66/qf4ccf8f5435d4a78bdca4d6a018b578e/bbbaaba.baaaa ()Ljava/lang/String;
      // 057: areturn
      // 058: aload 1
      // 059: invokevirtual qeaa361f143ee4a0894bd168fd9b30c66/qf4ccf8f5435d4a78bdca4d6a018b578e/abaaaaaba.aaba ()Lqeaa361f143ee4a0894bd168fd9b30c66/qf4ccf8f5435d4a78bdca4d6a018b578e/babbaba;
      // 05c: invokevirtual qeaa361f143ee4a0894bd168fd9b30c66/qf4ccf8f5435d4a78bdca4d6a018b578e/babbaba.ab ()Lqeaa361f143ee4a0894bd168fd9b30c66/qf4ccf8f5435d4a78bdca4d6a018b578e/abaaaaba;
      // 05f: astore 3
      // 060: aload 3
      // 061: iload 0
      // 062: ifne 06d
      // 065: ifnull 135
      // 068: goto 06c
      // 06b: athrow
      // 06c: aload 3
      // 06d: invokevirtual qeaa361f143ee4a0894bd168fd9b30c66/qf4ccf8f5435d4a78bdca4d6a018b578e/abaaaaba.babbaab ()Z
      // 070: iload 0
      // 071: ifne 08a
      // 074: ifeq 135
      // 077: goto 07b
      // 07a: athrow
      // 07b: getstatic qeaa361f143ee4a0894bd168fd9b30c66/qf4ccf8f5435d4a78bdca4d6a018b578e/bbbbab.b [I
      // 07e: aload 3
      // 07f: invokevirtual qeaa361f143ee4a0894bd168fd9b30c66/qf4ccf8f5435d4a78bdca4d6a018b578e/abaaaaba.ab ()Lqeaa361f143ee4a0894bd168fd9b30c66/qf4ccf8f5435d4a78bdca4d6a018b578e/aabbabaab;
      // 082: invokevirtual qeaa361f143ee4a0894bd168fd9b30c66/qf4ccf8f5435d4a78bdca4d6a018b578e/aabbabaab.ordinal ()I
      // 085: iaload
      // 086: goto 08a
      // 089: athrow
      // 08a: tableswitch 30 1 4 41 74 107 140
      // 0a8: new java/lang/MatchException
      // 0ab: dup
      // 0ac: aconst_null
      // 0ad: aconst_null
      // 0ae: invokespecial java/lang/MatchException.<init> (Ljava/lang/String;Ljava/lang/Throwable;)V
      // 0b1: athrow
      // 0b2: athrow
      // 0b3: ldc_w -1967603356
      // 0b6: iload 4
      // 0b8: ldc_w 1790095601
      // 0bb: ixor
      // 0bc: invokestatic qeaa361f143ee4a0894bd168fd9b30c66/qf4ccf8f5435d4a78bdca4d6a018b578e/baaabbab.aabab (II)I
      // 0bf: ldc_w -1967603355
      // 0c2: iload 4
      // 0c4: ldc_w -691478595
      // 0c7: ixor
      // 0c8: invokestatic qeaa361f143ee4a0894bd168fd9b30c66/qf4ccf8f5435d4a78bdca4d6a018b578e/baaabbab.aabab (II)I
      // 0cb: invokestatic qeaa361f143ee4a0894bd168fd9b30c66/qf4ccf8f5435d4a78bdca4d6a018b578e/baaabbab.baab (II)Ljava/lang/String;
      // 0ce: invokestatic qeaa361f143ee4a0894bd168fd9b30c66/qf4ccf8f5435d4a78bdca4d6a018b578e/aabbaaaba.abba (Ljava/lang/String;)Ljava/lang/String;
      // 0d1: goto 134
      // 0d4: ldc_w -1967603358
      // 0d7: iload 4
      // 0d9: ldc_w 1669903129
      // 0dc: ixor
      // 0dd: invokestatic qeaa361f143ee4a0894bd168fd9b30c66/qf4ccf8f5435d4a78bdca4d6a018b578e/baaabbab.aabab (II)I
      // 0e0: ldc_w -1967603357
      // 0e3: iload 4
      // 0e5: ldc_w 2095316872
      // 0e8: ixor
      // 0e9: invokestatic qeaa361f143ee4a0894bd168fd9b30c66/qf4ccf8f5435d4a78bdca4d6a018b578e/baaabbab.aabab (II)I
      // 0ec: invokestatic qeaa361f143ee4a0894bd168fd9b30c66/qf4ccf8f5435d4a78bdca4d6a018b578e/baaabbab.baab (II)Ljava/lang/String;
      // 0ef: invokestatic qeaa361f143ee4a0894bd168fd9b30c66/qf4ccf8f5435d4a78bdca4d6a018b578e/aabbaaaba.abba (Ljava/lang/String;)Ljava/lang/String;
      // 0f2: goto 134
      // 0f5: ldc_w -1967603360
      // 0f8: iload 4
      // 0fa: ldc_w -1724139159
      // 0fd: ixor
      // 0fe: invokestatic qeaa361f143ee4a0894bd168fd9b30c66/qf4ccf8f5435d4a78bdca4d6a018b578e/baaabbab.aabab (II)I
      // 101: ldc_w -1967603359
      // 104: iload 4
      // 106: ldc_w -2128975194
      // 109: ixor
      // 10a: invokestatic qeaa361f143ee4a0894bd168fd9b30c66/qf4ccf8f5435d4a78bdca4d6a018b578e/baaabbab.aabab (II)I
      // 10d: invokestatic qeaa361f143ee4a0894bd168fd9b30c66/qf4ccf8f5435d4a78bdca4d6a018b578e/baaabbab.baab (II)Ljava/lang/String;
      // 110: invokestatic qeaa361f143ee4a0894bd168fd9b30c66/qf4ccf8f5435d4a78bdca4d6a018b578e/aabbaaaba.abba (Ljava/lang/String;)Ljava/lang/String;
      // 113: goto 134
      // 116: ldc_w -1967603298
      // 119: iload 4
      // 11b: ldc_w 968092198
      // 11e: ixor
      // 11f: invokestatic qeaa361f143ee4a0894bd168fd9b30c66/qf4ccf8f5435d4a78bdca4d6a018b578e/baaabbab.aabab (II)I
      // 122: ldc_w -1967603297
      // 125: iload 4
      // 127: ldc_w -1811200024
      // 12a: ixor
      // 12b: invokestatic qeaa361f143ee4a0894bd168fd9b30c66/qf4ccf8f5435d4a78bdca4d6a018b578e/baaabbab.aabab (II)I
      // 12e: invokestatic qeaa361f143ee4a0894bd168fd9b30c66/qf4ccf8f5435d4a78bdca4d6a018b578e/baaabbab.baab (II)Ljava/lang/String;
      // 131: invokestatic qeaa361f143ee4a0894bd168fd9b30c66/qf4ccf8f5435d4a78bdca4d6a018b578e/aabbaaaba.abba (Ljava/lang/String;)Ljava/lang/String;
      // 134: areturn
      // 135: ldc_w -1967603300
      // 138: iload 4
      // 13a: ldc_w 1450438627
      // 13d: ixor
      // 13e: invokestatic qeaa361f143ee4a0894bd168fd9b30c66/qf4ccf8f5435d4a78bdca4d6a018b578e/baaabbab.aabab (II)I
      // 141: ldc_w -1967603299
      // 144: iload 4
      // 146: ldc_w -676835338
      // 149: ixor
      // 14a: invokestatic qeaa361f143ee4a0894bd168fd9b30c66/qf4ccf8f5435d4a78bdca4d6a018b578e/baaabbab.aabab (II)I
      // 14d: invokestatic qeaa361f143ee4a0894bd168fd9b30c66/qf4ccf8f5435d4a78bdca4d6a018b578e/baaabbab.baab (II)Ljava/lang/String;
      // 150: invokestatic qeaa361f143ee4a0894bd168fd9b30c66/qf4ccf8f5435d4a78bdca4d6a018b578e/aabbaaaba.abba (Ljava/lang/String;)Ljava/lang/String;
      // 153: areturn
   }

   public static void bbab(UUID var0) {
      try {
         if (var0 != null) {
            aaba.add(var0);
         }
      } catch (MatchException var1) {
         throw var1;
      }
   }

   public static boolean bbba(class_2596 var0) {
      return ba(var0, aabb());
   }

   private static byte[][] bbbb() {
      try {
         InputStream var0 = baaabbab.class
            .getResourceAsStream(
               aabbaaaba.abba(baab(aabab(-1967603302, 1894491518 ^ 336973484), aabab(-1967603301, 1894491518 ^ 278619298)))
            );

         byte[][] var15;
         label107: {
            byte[][] var17;
            label108: {
               byte[][] var16;
               try {
                  if (var0 == null) {
                     var15 = new byte[0][];
                     break label107;
                  }

                  try (DataInputStream var1 = new DataInputStream(var0)) {
                     int var2 = var1.readInt();

                     label111: {
                        try {
                           if (var2 < 1 || var2 > baa(aabab(-1967603304, 1894491518 ^ 1714016646), 7147558371960631371L)) {
                              break label111;
                           }
                        } catch (Throwable var11) {
                           throw var11;
                        }

                        var16 = new byte[var2][baa(aabab(-1967603303, 1894491518 ^ 1587464348), 323908896753632580L)];

                        for (byte[] var7 : var16) {
                           var1.readFully(var7);
                        }

                        var17 = var16;
                        break label108;
                     }

                     var16 = new byte[0][];
                  }
               } catch (Throwable var13) {
                  if (var0 != null) {
                     try {
                        var0.close();
                     } catch (Throwable var8) {
                        var13.addSuppressed(var8);
                     }
                  }

                  throw var13;
               }

               if (var0 != null) {
                  var0.close();
               }

               return var16;
            }

            if (var0 != null) {
               var0.close();
            }

            return var17;
         }

         try {
            if (var0 != null) {
               var0.close();
            }

            return var15;
         } catch (Throwable var10) {
            throw var10;
         }
      } catch (Exception var14) {
         return new byte[0][];
      }
   }

   public static void aaaaa(class_2596 param0) {
      // $VF: Couldn't be decompiled
      // Please report this to the Vineflower issue tracker, at https://github.com/Vineflower/vineflower/issues with a copy of the class file (if you have the rights to distribute it!)
      //
      // Bytecode:
      // 000: ldc_w 2073944787
      // 003: istore 12
      // 005: getstatic qeaa361f143ee4a0894bd168fd9b30c66/qf4ccf8f5435d4a78bdca4d6a018b578e/aabbabbab.ab I
      // 008: istore 1
      // 009: aload 0
      // 00a: iload 1
      // 00b: ifne 017
      // 00e: ifnonnull 016
      // 011: goto 015
      // 014: athrow
      // 015: return
      // 016: aload 0
      // 017: iload 1
      // 018: ifne 0a3
      // 01b: instanceof net/minecraft/class_9088
      // 01e: ifeq 0a2
      // 021: goto 025
      // 024: athrow
      // 025: aload 0
      // 026: checkcast net/minecraft/class_9088
      // 029: astore 2
      // 02a: ldc_w -1967603306
      // 02d: iload 12
      // 02f: ldc_w -694204772
      // 032: ixor
      // 033: invokestatic qeaa361f143ee4a0894bd168fd9b30c66/qf4ccf8f5435d4a78bdca4d6a018b578e/baaabbab.aabab (II)I
      // 036: ldc_w -1967603305
      // 039: iload 12
      // 03b: ldc_w 2036572261
      // 03e: ixor
      // 03f: invokestatic qeaa361f143ee4a0894bd168fd9b30c66/qf4ccf8f5435d4a78bdca4d6a018b578e/baaabbab.aabab (II)I
      // 042: invokestatic qeaa361f143ee4a0894bd168fd9b30c66/qf4ccf8f5435d4a78bdca4d6a018b578e/baaabbab.baab (II)Ljava/lang/String;
      // 045: invokestatic qeaa361f143ee4a0894bd168fd9b30c66/qf4ccf8f5435d4a78bdca4d6a018b578e/aabbaaaba.abba (Ljava/lang/String;)Ljava/lang/String;
      // 048: iload 1
      // 049: ifne 09e
      // 04c: aload 2
      // 04d: invokevirtual net/minecraft/class_9088.comp_2194 ()Lnet/minecraft/class_2960;
      // 050: invokestatic java/lang/String.valueOf (Ljava/lang/Object;)Ljava/lang/String;
      // 053: astore 8
      // 055: astore 7
      // 057: new java/lang/StringBuilder
      // 05a: dup
      // 05b: invokespecial java/lang/StringBuilder.<init> ()V
      // 05e: aload 7
      // 060: invokevirtual java/lang/StringBuilder.append (Ljava/lang/Object;)Ljava/lang/StringBuilder;
      // 063: aload 8
      // 065: invokevirtual java/lang/StringBuilder.append (Ljava/lang/Object;)Ljava/lang/StringBuilder;
      // 068: invokevirtual java/lang/StringBuilder.toString ()Ljava/lang/String;
      // 06b: invokestatic qeaa361f143ee4a0894bd168fd9b30c66/qf4ccf8f5435d4a78bdca4d6a018b578e/bbbaaba.aaa (Ljava/lang/String;)V
      // 06e: aload 2
      // 06f: invokevirtual net/minecraft/class_9088.comp_2194 ()Lnet/minecraft/class_2960;
      // 072: invokestatic qeaa361f143ee4a0894bd168fd9b30c66/qf4ccf8f5435d4a78bdca4d6a018b578e/bbbaaba.babaa (Lnet/minecraft/class_2960;)Z
      // 075: ifeq 0a1
      // 078: goto 07c
      // 07b: athrow
      // 07c: ldc_w -1967603308
      // 07f: iload 12
      // 081: ldc_w -1835782110
      // 084: ixor
      // 085: invokestatic qeaa361f143ee4a0894bd168fd9b30c66/qf4ccf8f5435d4a78bdca4d6a018b578e/baaabbab.aabab (II)I
      // 088: ldc_w -1967603307
      // 08b: iload 12
      // 08d: ldc_w 79949352
      // 090: ixor
      // 091: invokestatic qeaa361f143ee4a0894bd168fd9b30c66/qf4ccf8f5435d4a78bdca4d6a018b578e/baaabbab.aabab (II)I
      // 094: invokestatic qeaa361f143ee4a0894bd168fd9b30c66/qf4ccf8f5435d4a78bdca4d6a018b578e/baaabbab.baab (II)Ljava/lang/String;
      // 097: invokestatic qeaa361f143ee4a0894bd168fd9b30c66/qf4ccf8f5435d4a78bdca4d6a018b578e/aabbaaaba.abba (Ljava/lang/String;)Ljava/lang/String;
      // 09a: goto 09e
      // 09d: athrow
      // 09e: invokestatic qeaa361f143ee4a0894bd168fd9b30c66/qf4ccf8f5435d4a78bdca4d6a018b578e/bbbaaba.aaa (Ljava/lang/String;)V
      // 0a1: return
      // 0a2: aload 0
      // 0a3: instanceof net/minecraft/class_2658
      // 0a6: iload 1
      // 0a7: ifne 293
      // 0aa: ifeq 28c
      // 0ad: goto 0b1
      // 0b0: athrow
      // 0b1: aload 0
      // 0b2: checkcast net/minecraft/class_2658
      // 0b5: astore 2
      // 0b6: aload 2
      // 0b7: invokevirtual net/minecraft/class_2658.comp_1646 ()Lnet/minecraft/class_8710;
      // 0ba: astore 3
      // 0bb: aload 3
      // 0bc: iload 1
      // 0bd: ifne 0de
      // 0c0: instanceof net/fabricmc/fabric/impl/networking/RegistrationPayload
      // 0c3: ifeq 0dd
      // 0c6: goto 0ca
      // 0c9: athrow
      // 0ca: aload 3
      // 0cb: checkcast net/fabricmc/fabric/impl/networking/RegistrationPayload
      // 0ce: astore 4
      // 0d0: aload 4
      // 0d2: invokevirtual net/fabricmc/fabric/impl/networking/RegistrationPayload.channels ()Ljava/util/List;
      // 0d5: astore 5
      // 0d7: aload 5
      // 0d9: invokestatic qeaa361f143ee4a0894bd168fd9b30c66/qf4ccf8f5435d4a78bdca4d6a018b578e/bbbaaba.aabb (Ljava/util/List;)V
      // 0dc: return
      // 0dd: aload 3
      // 0de: invokeinterface net/minecraft/class_8710.method_56479 ()Lnet/minecraft/class_8710$class_9154; 1
      // 0e3: invokevirtual net/minecraft/class_8710$class_9154.comp_2242 ()Lnet/minecraft/class_2960;
      // 0e6: invokevirtual net/minecraft/class_2960.toString ()Ljava/lang/String;
      // 0e9: astore 4
      // 0eb: ldc_w -1967603310
      // 0ee: iload 12
      // 0f0: ldc_w 1104336950
      // 0f3: ixor
      // 0f4: invokestatic qeaa361f143ee4a0894bd168fd9b30c66/qf4ccf8f5435d4a78bdca4d6a018b578e/baaabbab.aabab (II)I
      // 0f7: ldc_w -1967603309
      // 0fa: iload 12
      // 0fc: ldc_w -736428521
      // 0ff: ixor
      // 100: invokestatic qeaa361f143ee4a0894bd168fd9b30c66/qf4ccf8f5435d4a78bdca4d6a018b578e/baaabbab.aabab (II)I
      // 103: invokestatic qeaa361f143ee4a0894bd168fd9b30c66/qf4ccf8f5435d4a78bdca4d6a018b578e/baaabbab.baab (II)Ljava/lang/String;
      // 106: invokestatic qeaa361f143ee4a0894bd168fd9b30c66/qf4ccf8f5435d4a78bdca4d6a018b578e/aabbaaaba.abba (Ljava/lang/String;)Ljava/lang/String;
      // 109: aload 4
      // 10b: astore 9
      // 10d: astore 8
      // 10f: new java/lang/StringBuilder
      // 112: dup
      // 113: invokespecial java/lang/StringBuilder.<init> ()V
      // 116: aload 8
      // 118: invokevirtual java/lang/StringBuilder.append (Ljava/lang/Object;)Ljava/lang/StringBuilder;
      // 11b: aload 9
      // 11d: invokevirtual java/lang/StringBuilder.append (Ljava/lang/Object;)Ljava/lang/StringBuilder;
      // 120: invokevirtual java/lang/StringBuilder.toString ()Ljava/lang/String;
      // 123: invokestatic qeaa361f143ee4a0894bd168fd9b30c66/qf4ccf8f5435d4a78bdca4d6a018b578e/bbbaaba.aaa (Ljava/lang/String;)V
      // 126: invokestatic net/minecraft/class_310.method_1551 ()Lnet/minecraft/class_310;
      // 129: astore 5
      // 12b: invokestatic qeaa361f143ee4a0894bd168fd9b30c66/qf4ccf8f5435d4a78bdca4d6a018b578e/bbbaaba.aaab ()Z
      // 12e: iload 1
      // 12f: ifne 1d9
      // 132: ifeq 1d5
      // 135: goto 139
      // 138: athrow
      // 139: aload 4
      // 13b: ldc_w -1967603312
      // 13e: iload 12
      // 140: ldc_w 2084632825
      // 143: ixor
      // 144: invokestatic qeaa361f143ee4a0894bd168fd9b30c66/qf4ccf8f5435d4a78bdca4d6a018b578e/baaabbab.aabab (II)I
      // 147: ldc_w -1967603311
      // 14a: iload 12
      // 14c: ldc_w -212856116
      // 14f: ixor
      // 150: invokestatic qeaa361f143ee4a0894bd168fd9b30c66/qf4ccf8f5435d4a78bdca4d6a018b578e/baaabbab.aabab (II)I
      // 153: invokestatic qeaa361f143ee4a0894bd168fd9b30c66/qf4ccf8f5435d4a78bdca4d6a018b578e/baaabbab.baab (II)Ljava/lang/String;
      // 156: invokestatic qeaa361f143ee4a0894bd168fd9b30c66/qf4ccf8f5435d4a78bdca4d6a018b578e/aabbaaaba.abba (Ljava/lang/String;)Ljava/lang/String;
      // 159: invokevirtual java/lang/String.startsWith (Ljava/lang/String;)Z
      // 15c: iload 1
      // 15d: ifne 1d9
      // 160: goto 164
      // 163: athrow
      // 164: ifeq 1d5
      // 167: goto 16b
      // 16a: athrow
      // 16b: aload 3
      // 16c: invokestatic qeaa361f143ee4a0894bd168fd9b30c66/qf4ccf8f5435d4a78bdca4d6a018b578e/bbbaaba.bbba (Lnet/minecraft/class_8710;)[B
      // 16f: astore 6
      // 171: iload 1
      // 172: ifne 18b
      // 175: aload 6
      // 177: ifnull 18f
      // 17a: goto 17e
      // 17d: athrow
      // 17e: aload 4
      // 180: aload 6
      // 182: aload 5
      // 184: invokestatic qeaa361f143ee4a0894bd168fd9b30c66/qf4ccf8f5435d4a78bdca4d6a018b578e/bbbaaba.ab (Ljava/lang/String;[BLnet/minecraft/class_310;)V
      // 187: goto 18b
      // 18a: athrow
      // 18b: iload 1
      // 18c: ifeq 1d5
      // 18f: ldc_w -1967603314
      // 192: iload 12
      // 194: ldc_w 906049942
      // 197: ixor
      // 198: invokestatic qeaa361f143ee4a0894bd168fd9b30c66/qf4ccf8f5435d4a78bdca4d6a018b578e/baaabbab.aabab (II)I
      // 19b: ldc_w -1967603313
      // 19e: iload 12
      // 1a0: ldc_w -748515903
      // 1a3: ixor
      // 1a4: invokestatic qeaa361f143ee4a0894bd168fd9b30c66/qf4ccf8f5435d4a78bdca4d6a018b578e/baaabbab.aabab (II)I
      // 1a7: invokestatic qeaa361f143ee4a0894bd168fd9b30c66/qf4ccf8f5435d4a78bdca4d6a018b578e/baaabbab.baab (II)Ljava/lang/String;
      // 1aa: invokestatic qeaa361f143ee4a0894bd168fd9b30c66/qf4ccf8f5435d4a78bdca4d6a018b578e/aabbaaaba.abba (Ljava/lang/String;)Ljava/lang/String;
      // 1ad: aload 3
      // 1ae: invokeinterface net/minecraft/class_8710.getClass ()Ljava/lang/Class; 1
      // 1b3: invokevirtual java/lang/Class.getName ()Ljava/lang/String;
      // 1b6: astore 10
      // 1b8: astore 9
      // 1ba: new java/lang/StringBuilder
      // 1bd: dup
      // 1be: invokespecial java/lang/StringBuilder.<init> ()V
      // 1c1: aload 9
      // 1c3: invokevirtual java/lang/StringBuilder.append (Ljava/lang/Object;)Ljava/lang/StringBuilder;
      // 1c6: aload 10
      // 1c8: invokevirtual java/lang/StringBuilder.append (Ljava/lang/Object;)Ljava/lang/StringBuilder;
      // 1cb: invokevirtual java/lang/StringBuilder.toString ()Ljava/lang/String;
      // 1ce: invokestatic qeaa361f143ee4a0894bd168fd9b30c66/qf4ccf8f5435d4a78bdca4d6a018b578e/bbbaaba.aaa (Ljava/lang/String;)V
      // 1d1: goto 1d5
      // 1d4: athrow
      // 1d5: aload 3
      // 1d6: instanceof net/minecraft/class_8709
      // 1d9: iload 1
      // 1da: ifne 213
      // 1dd: ifne 24a
      // 1e0: goto 1e4
      // 1e3: athrow
      // 1e4: aload 4
      // 1e6: ldc_w -1967603316
      // 1e9: iload 12
      // 1eb: ldc_w 1413070485
      // 1ee: ixor
      // 1ef: invokestatic qeaa361f143ee4a0894bd168fd9b30c66/qf4ccf8f5435d4a78bdca4d6a018b578e/baaabbab.aabab (II)I
      // 1f2: ldc_w -1967603315
      // 1f5: iload 12
      // 1f7: ldc_w 675906384
      // 1fa: ixor
      // 1fb: invokestatic qeaa361f143ee4a0894bd168fd9b30c66/qf4ccf8f5435d4a78bdca4d6a018b578e/baaabbab.aabab (II)I
      // 1fe: invokestatic qeaa361f143ee4a0894bd168fd9b30c66/qf4ccf8f5435d4a78bdca4d6a018b578e/baaabbab.baab (II)Ljava/lang/String;
      // 201: iload 1
      // 202: ifne 244
      // 205: goto 209
      // 208: athrow
      // 209: invokestatic qeaa361f143ee4a0894bd168fd9b30c66/qf4ccf8f5435d4a78bdca4d6a018b578e/aabbaaaba.abba (Ljava/lang/String;)Ljava/lang/String;
      // 20c: invokevirtual java/lang/String.equals (Ljava/lang/Object;)Z
      // 20f: goto 213
      // 212: athrow
      // 213: ifne 24a
      // 216: aload 3
      // 217: invokeinterface net/minecraft/class_8710.method_56479 ()Lnet/minecraft/class_8710$class_9154; 1
      // 21c: invokevirtual net/minecraft/class_8710$class_9154.comp_2242 ()Lnet/minecraft/class_2960;
      // 21f: invokevirtual net/minecraft/class_2960.method_12832 ()Ljava/lang/String;
      // 222: ldc_w -1967603318
      // 225: iload 12
      // 227: ldc_w 1018548729
      // 22a: ixor
      // 22b: invokestatic qeaa361f143ee4a0894bd168fd9b30c66/qf4ccf8f5435d4a78bdca4d6a018b578e/baaabbab.aabab (II)I
      // 22e: ldc_w -1967603317
      // 231: iload 12
      // 233: ldc_w 2002517940
      // 236: ixor
      // 237: invokestatic qeaa361f143ee4a0894bd168fd9b30c66/qf4ccf8f5435d4a78bdca4d6a018b578e/baaabbab.aabab (II)I
      // 23a: invokestatic qeaa361f143ee4a0894bd168fd9b30c66/qf4ccf8f5435d4a78bdca4d6a018b578e/baaabbab.baab (II)Ljava/lang/String;
      // 23d: invokestatic qeaa361f143ee4a0894bd168fd9b30c66/qf4ccf8f5435d4a78bdca4d6a018b578e/aabbaaaba.abba (Ljava/lang/String;)Ljava/lang/String;
      // 240: goto 244
      // 243: athrow
      // 244: invokevirtual java/lang/String.equals (Ljava/lang/Object;)Z
      // 247: ifeq 288
      // 24a: aload 5
      // 24c: iload 1
      // 24d: ifne 25d
      // 250: goto 254
      // 253: athrow
      // 254: ifnull 288
      // 257: goto 25b
      // 25a: athrow
      // 25b: aload 5
      // 25d: iload 1
      // 25e: ifne 271
      // 261: invokevirtual net/minecraft/class_310.method_1562 ()Lnet/minecraft/class_634;
      // 264: ifnull 288
      // 267: goto 26b
      // 26a: athrow
      // 26b: aload 5
      // 26d: goto 271
      // 270: athrow
      // 271: invokevirtual net/minecraft/class_310.method_1562 ()Lnet/minecraft/class_634;
      // 274: new net/minecraft/class_2817
      // 277: dup
      // 278: new net/minecraft/class_8709
      // 27b: dup
      // 27c: invokestatic qeaa361f143ee4a0894bd168fd9b30c66/qf4ccf8f5435d4a78bdca4d6a018b578e/baaabbab.bbaa ()Ljava/lang/String;
      // 27f: invokespecial net/minecraft/class_8709.<init> (Ljava/lang/String;)V
      // 282: invokespecial net/minecraft/class_2817.<init> (Lnet/minecraft/class_8710;)V
      // 285: invokevirtual net/minecraft/class_634.method_52787 (Lnet/minecraft/class_2596;)V
      // 288: iload 1
      // 289: ifeq 36d
      // 28c: invokestatic qeaa361f143ee4a0894bd168fd9b30c66/qf4ccf8f5435d4a78bdca4d6a018b578e/bbbaaba.bab ()Z
      // 28f: goto 293
      // 292: athrow
      // 293: ifeq 36d
      // 296: aload 0
      // 297: invokeinterface net/minecraft/class_2596.getClass ()Ljava/lang/Class; 1
      // 29c: invokevirtual java/lang/Class.getSimpleName ()Ljava/lang/String;
      // 29f: astore 3
      // 2a0: aload 3
      // 2a1: iload 1
      // 2a2: ifne 36a
      // 2a5: ldc_w -1967603320
      // 2a8: iload 12
      // 2aa: ldc_w 1992534268
      // 2ad: ixor
      // 2ae: invokestatic qeaa361f143ee4a0894bd168fd9b30c66/qf4ccf8f5435d4a78bdca4d6a018b578e/baaabbab.aabab (II)I
      // 2b1: ldc_w -1967603319
      // 2b4: iload 12
      // 2b6: ldc_w 2030510563
      // 2b9: ixor
      // 2ba: invokestatic qeaa361f143ee4a0894bd168fd9b30c66/qf4ccf8f5435d4a78bdca4d6a018b578e/baaabbab.aabab (II)I
      // 2bd: invokestatic qeaa361f143ee4a0894bd168fd9b30c66/qf4ccf8f5435d4a78bdca4d6a018b578e/baaabbab.baab (II)Ljava/lang/String;
      // 2c0: invokestatic qeaa361f143ee4a0894bd168fd9b30c66/qf4ccf8f5435d4a78bdca4d6a018b578e/aabbaaaba.abba (Ljava/lang/String;)Ljava/lang/String;
      // 2c3: invokevirtual java/lang/String.contains (Ljava/lang/CharSequence;)Z
      // 2c6: ifne 32f
      // 2c9: goto 2cd
      // 2cc: athrow
      // 2cd: aload 3
      // 2ce: ldc_w -1967603322
      // 2d1: iload 12
      // 2d3: ldc_w 466598496
      // 2d6: ixor
      // 2d7: invokestatic qeaa361f143ee4a0894bd168fd9b30c66/qf4ccf8f5435d4a78bdca4d6a018b578e/baaabbab.aabab (II)I
      // 2da: ldc_w -1967603321
      // 2dd: iload 12
      // 2df: ldc_w 111931193
      // 2e2: ixor
      // 2e3: invokestatic qeaa361f143ee4a0894bd168fd9b30c66/qf4ccf8f5435d4a78bdca4d6a018b578e/baaabbab.aabab (II)I
      // 2e6: invokestatic qeaa361f143ee4a0894bd168fd9b30c66/qf4ccf8f5435d4a78bdca4d6a018b578e/baaabbab.baab (II)Ljava/lang/String;
      // 2e9: iload 1
      // 2ea: ifne 352
      // 2ed: goto 2f1
      // 2f0: athrow
      // 2f1: invokestatic qeaa361f143ee4a0894bd168fd9b30c66/qf4ccf8f5435d4a78bdca4d6a018b578e/aabbaaaba.abba (Ljava/lang/String;)Ljava/lang/String;
      // 2f4: invokevirtual java/lang/String.contains (Ljava/lang/CharSequence;)Z
      // 2f7: ifne 32f
      // 2fa: goto 2fe
      // 2fd: athrow
      // 2fe: aload 3
      // 2ff: iload 1
      // 300: ifne 36a
      // 303: goto 307
      // 306: athrow
      // 307: ldc_w -1967603324
      // 30a: iload 12
      // 30c: ldc_w 767213259
      // 30f: ixor
      // 310: invokestatic qeaa361f143ee4a0894bd168fd9b30c66/qf4ccf8f5435d4a78bdca4d6a018b578e/baaabbab.aabab (II)I
      // 313: ldc_w -1967603323
      // 316: iload 12
      // 318: ldc_w 1275567074
      // 31b: ixor
      // 31c: invokestatic qeaa361f143ee4a0894bd168fd9b30c66/qf4ccf8f5435d4a78bdca4d6a018b578e/baaabbab.aabab (II)I
      // 31f: invokestatic qeaa361f143ee4a0894bd168fd9b30c66/qf4ccf8f5435d4a78bdca4d6a018b578e/baaabbab.baab (II)Ljava/lang/String;
      // 322: invokestatic qeaa361f143ee4a0894bd168fd9b30c66/qf4ccf8f5435d4a78bdca4d6a018b578e/aabbaaaba.abba (Ljava/lang/String;)Ljava/lang/String;
      // 325: invokevirtual java/lang/String.contains (Ljava/lang/CharSequence;)Z
      // 328: ifeq 36d
      // 32b: goto 32f
      // 32e: athrow
      // 32f: ldc_w -1967603326
      // 332: iload 12
      // 334: ldc_w 1067458574
      // 337: ixor
      // 338: invokestatic qeaa361f143ee4a0894bd168fd9b30c66/qf4ccf8f5435d4a78bdca4d6a018b578e/baaabbab.aabab (II)I
      // 33b: ldc_w -1967603325
      // 33e: iload 12
      // 340: ldc_w 1068116507
      // 343: ixor
      // 344: invokestatic qeaa361f143ee4a0894bd168fd9b30c66/qf4ccf8f5435d4a78bdca4d6a018b578e/baaabbab.aabab (II)I
      // 347: invokestatic qeaa361f143ee4a0894bd168fd9b30c66/qf4ccf8f5435d4a78bdca4d6a018b578e/baaabbab.baab (II)Ljava/lang/String;
      // 34a: invokestatic qeaa361f143ee4a0894bd168fd9b30c66/qf4ccf8f5435d4a78bdca4d6a018b578e/aabbaaaba.abba (Ljava/lang/String;)Ljava/lang/String;
      // 34d: aload 3
      // 34e: goto 352
      // 351: athrow
      // 352: astore 11
      // 354: astore 10
      // 356: new java/lang/StringBuilder
      // 359: dup
      // 35a: invokespecial java/lang/StringBuilder.<init> ()V
      // 35d: aload 10
      // 35f: invokevirtual java/lang/StringBuilder.append (Ljava/lang/Object;)Ljava/lang/StringBuilder;
      // 362: aload 11
      // 364: invokevirtual java/lang/StringBuilder.append (Ljava/lang/Object;)Ljava/lang/StringBuilder;
      // 367: invokevirtual java/lang/StringBuilder.toString ()Ljava/lang/String;
      // 36a: invokestatic qeaa361f143ee4a0894bd168fd9b30c66/qf4ccf8f5435d4a78bdca4d6a018b578e/bbbaaba.aaa (Ljava/lang/String;)V
      // 36d: return
   }

   public static boolean b() {
      // $VF: Couldn't be decompiled
      // Please report this to the Vineflower issue tracker, at https://github.com/Vineflower/vineflower/issues with a copy of the class file (if you have the rights to distribute it!)
      // java.lang.RuntimeException: parsing failure!
      //   at org.jetbrains.java.decompiler.modules.decompiler.decompose.DomHelper.parseGraph(DomHelper.java:211)
      //   at org.jetbrains.java.decompiler.main.rels.MethodProcessor.codeToJava(MethodProcessor.java:166)
      //
      // Bytecode:
      // 00: getstatic qeaa361f143ee4a0894bd168fd9b30c66/qf4ccf8f5435d4a78bdca4d6a018b578e/aabbabbab.ab I
      // 03: invokestatic qeaa361f143ee4a0894bd168fd9b30c66/qf4ccf8f5435d4a78bdca4d6a018b578e/abaaaaaba.aaaaa ()Lqeaa361f143ee4a0894bd168fd9b30c66/qf4ccf8f5435d4a78bdca4d6a018b578e/abaaaaaba;
      // 06: astore 1
      // 07: istore 0
      // 08: aload 1
      // 09: iload 0
      // 0a: ifne 15
      // 0d: ifnull 23
      // 10: goto 14
      // 13: athrow
      // 14: aload 1
      // 15: iload 0
      // 16: ifne 27
      // 19: invokevirtual qeaa361f143ee4a0894bd168fd9b30c66/qf4ccf8f5435d4a78bdca4d6a018b578e/abaaaaaba.aaba ()Lqeaa361f143ee4a0894bd168fd9b30c66/qf4ccf8f5435d4a78bdca4d6a018b578e/babbaba;
      // 1c: ifnonnull 26
      // 1f: goto 23
      // 22: athrow
      // 23: bipush 0
      // 24: ireturn
      // 25: athrow
      // 26: aload 1
      // 27: invokevirtual qeaa361f143ee4a0894bd168fd9b30c66/qf4ccf8f5435d4a78bdca4d6a018b578e/abaaaaaba.aaba ()Lqeaa361f143ee4a0894bd168fd9b30c66/qf4ccf8f5435d4a78bdca4d6a018b578e/babbaba;
      // 2a: invokevirtual qeaa361f143ee4a0894bd168fd9b30c66/qf4ccf8f5435d4a78bdca4d6a018b578e/babbaba.ababba ()Lqeaa361f143ee4a0894bd168fd9b30c66/qf4ccf8f5435d4a78bdca4d6a018b578e/aaaab;
      // 2d: astore 2
      // 2e: aload 2
      // 2f: iload 0
      // 30: ifne 3b
      // 33: ifnull 4d
      // 36: goto 3a
      // 39: athrow
      // 3a: aload 2
      // 3b: invokevirtual qeaa361f143ee4a0894bd168fd9b30c66/qf4ccf8f5435d4a78bdca4d6a018b578e/aaaab.babbaab ()Z
      // 3e: iload 0
      // 3f: ifne 4a
      // 42: ifeq 4d
      // 45: goto 49
      // 48: athrow
      // 49: bipush 1
      // 4a: goto 4e
      // 4d: bipush 0
      // 4e: ireturn
   }

   private baaabbab() {
   }

   private static boolean aaaab(String param0) {
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
      // 05: invokestatic java/net/InetAddress.getAllByName (Ljava/lang/String;)[Ljava/net/InetAddress;
      // 08: astore 2
      // 09: aload 2
      // 0a: iload 1
      // 0b: ifne 19
      // 0e: arraylength
      // 0f: ifne 18
      // 12: goto 16
      // 15: athrow
      // 16: bipush 0
      // 17: ireturn
      // 18: aload 2
      // 19: astore 3
      // 1a: aload 3
      // 1b: arraylength
      // 1c: istore 4
      // 1e: bipush 0
      // 1f: istore 5
      // 21: iload 5
      // 23: iload 4
      // 25: if_icmpge 4f
      // 28: aload 3
      // 29: iload 5
      // 2b: aaload
      // 2c: astore 6
      // 2e: iload 1
      // 2f: ifne 4b
      // 32: aload 6
      // 34: invokestatic qeaa361f143ee4a0894bd168fd9b30c66/qf4ccf8f5435d4a78bdca4d6a018b578e/baaabbab.aaaba (Ljava/net/InetAddress;)Z
      // 37: iload 1
      // 38: ifne 50
      // 3b: goto 3f
      // 3e: athrow
      // 3f: ifeq 48
      // 42: goto 46
      // 45: athrow
      // 46: bipush 0
      // 47: ireturn
      // 48: iinc 5 1
      // 4b: iload 1
      // 4c: ifeq 21
      // 4f: bipush 1
      // 50: ireturn
      // 51: astore 2
      // 52: bipush 0
      // 53: ireturn
   }

   private static boolean aaaba(InetAddress param0) {
      // $VF: Couldn't be decompiled
      // Please report this to the Vineflower issue tracker, at https://github.com/Vineflower/vineflower/issues with a copy of the class file (if you have the rights to distribute it!)
      // java.lang.RuntimeException: parsing failure!
      //   at org.jetbrains.java.decompiler.modules.decompiler.decompose.DomHelper.parseGraph(DomHelper.java:211)
      //   at org.jetbrains.java.decompiler.main.rels.MethodProcessor.codeToJava(MethodProcessor.java:166)
      //
      // Bytecode:
      // 000: ldc_w -2008263386
      // 003: istore 5
      // 005: getstatic qeaa361f143ee4a0894bd168fd9b30c66/qf4ccf8f5435d4a78bdca4d6a018b578e/aabbabbab.ab I
      // 008: istore 1
      // 009: aload 0
      // 00a: iload 1
      // 00b: ifne 016
      // 00e: ifnull 070
      // 011: goto 015
      // 014: athrow
      // 015: aload 0
      // 016: invokevirtual java/net/InetAddress.isAnyLocalAddress ()Z
      // 019: iload 1
      // 01a: ifne 075
      // 01d: ifne 070
      // 020: goto 024
      // 023: athrow
      // 024: aload 0
      // 025: invokevirtual java/net/InetAddress.isLoopbackAddress ()Z
      // 028: iload 1
      // 029: ifne 075
      // 02c: goto 030
      // 02f: athrow
      // 030: ifne 070
      // 033: goto 037
      // 036: athrow
      // 037: aload 0
      // 038: invokevirtual java/net/InetAddress.isLinkLocalAddress ()Z
      // 03b: iload 1
      // 03c: ifne 075
      // 03f: goto 043
      // 042: athrow
      // 043: ifne 070
      // 046: goto 04a
      // 049: athrow
      // 04a: aload 0
      // 04b: invokevirtual java/net/InetAddress.isSiteLocalAddress ()Z
      // 04e: iload 1
      // 04f: ifne 075
      // 052: goto 056
      // 055: athrow
      // 056: ifne 070
      // 059: goto 05d
      // 05c: athrow
      // 05d: aload 0
      // 05e: iload 1
      // 05f: ifne 077
      // 062: goto 066
      // 065: athrow
      // 066: invokevirtual java/net/InetAddress.isMulticastAddress ()Z
      // 069: ifeq 076
      // 06c: goto 070
      // 06f: athrow
      // 070: bipush 1
      // 071: goto 075
      // 074: athrow
      // 075: ireturn
      // 076: aload 0
      // 077: invokevirtual java/net/InetAddress.getAddress ()[B
      // 07a: astore 2
      // 07b: aload 2
      // 07c: arraylength
      // 07d: iload 1
      // 07e: ifne 1c5
      // 081: ldc_w -1967603328
      // 084: iload 5
      // 086: ldc_w 1502110257
      // 089: ixor
      // 08a: invokestatic qeaa361f143ee4a0894bd168fd9b30c66/qf4ccf8f5435d4a78bdca4d6a018b578e/baaabbab.aabab (II)I
      // 08d: ldc2_w 6471845343371798930
      // 090: invokestatic qeaa361f143ee4a0894bd168fd9b30c66/qf4ccf8f5435d4a78bdca4d6a018b578e/baaabbab.baa (IJ)I
      // 093: if_icmpne 1c3
      // 096: goto 09a
      // 099: athrow
      // 09a: aload 2
      // 09b: bipush 0
      // 09c: baload
      // 09d: iload 1
      // 09e: ifne 0d5
      // 0a1: goto 0a5
      // 0a4: athrow
      // 0a5: ldc_w -1967603327
      // 0a8: iload 5
      // 0aa: ldc_w -320531959
      // 0ad: ixor
      // 0ae: invokestatic qeaa361f143ee4a0894bd168fd9b30c66/qf4ccf8f5435d4a78bdca4d6a018b578e/baaabbab.aabab (II)I
      // 0b1: ldc2_w 4411127182227982378
      // 0b4: invokestatic qeaa361f143ee4a0894bd168fd9b30c66/qf4ccf8f5435d4a78bdca4d6a018b578e/baaabbab.baa (IJ)I
      // 0b7: iand
      // 0b8: ldc_w -1967603266
      // 0bb: iload 5
      // 0bd: ldc_w -1175969692
      // 0c0: ixor
      // 0c1: invokestatic qeaa361f143ee4a0894bd168fd9b30c66/qf4ccf8f5435d4a78bdca4d6a018b578e/baaabbab.aabab (II)I
      // 0c4: ldc2_w 7080887727636832164
      // 0c7: invokestatic qeaa361f143ee4a0894bd168fd9b30c66/qf4ccf8f5435d4a78bdca4d6a018b578e/baaabbab.baa (IJ)I
      // 0ca: if_icmpne 0d4
      // 0cd: goto 0d1
      // 0d0: athrow
      // 0d1: bipush 1
      // 0d2: ireturn
      // 0d3: athrow
      // 0d4: bipush 1
      // 0d5: istore 3
      // 0d6: bipush 0
      // 0d7: istore 4
      // 0d9: iload 4
      // 0db: ldc_w -1967603265
      // 0de: iload 5
      // 0e0: ldc_w -1617252901
      // 0e3: ixor
      // 0e4: invokestatic qeaa361f143ee4a0894bd168fd9b30c66/qf4ccf8f5435d4a78bdca4d6a018b578e/baaabbab.aabab (II)I
      // 0e7: ldc2_w 8282959726625012121
      // 0ea: invokestatic qeaa361f143ee4a0894bd168fd9b30c66/qf4ccf8f5435d4a78bdca4d6a018b578e/baaabbab.baa (IJ)I
      // 0ed: if_icmpge 116
      // 0f0: iload 3
      // 0f1: aload 2
      // 0f2: iload 1
      // 0f3: ifne 118
      // 0f6: iload 4
      // 0f8: baload
      // 0f9: iload 1
      // 0fa: ifne 109
      // 0fd: goto 101
      // 100: athrow
      // 101: ifne 10c
      // 104: goto 108
      // 107: athrow
      // 108: bipush 1
      // 109: goto 10d
      // 10c: bipush 0
      // 10d: iand
      // 10e: istore 3
      // 10f: iload 1
      // 110: iinc 4 1
      // 113: ifeq 0d9
      // 116: iload 3
      // 117: aload 2
      // 118: ldc_w -1967603268
      // 11b: iload 5
      // 11d: ldc_w 448681336
      // 120: ixor
      // 121: invokestatic qeaa361f143ee4a0894bd168fd9b30c66/qf4ccf8f5435d4a78bdca4d6a018b578e/baaabbab.aabab (II)I
      // 124: ldc2_w 3128984369015079355
      // 127: invokestatic qeaa361f143ee4a0894bd168fd9b30c66/qf4ccf8f5435d4a78bdca4d6a018b578e/baaabbab.baa (IJ)I
      // 12a: iload 1
      // 12b: ifne 14e
      // 12e: baload
      // 12f: bipush -1
      // 130: if_icmpne 163
      // 133: goto 137
      // 136: athrow
      // 137: aload 2
      // 138: ldc_w -1967603267
      // 13b: iload 5
      // 13d: ldc_w 614213520
      // 140: ixor
      // 141: invokestatic qeaa361f143ee4a0894bd168fd9b30c66/qf4ccf8f5435d4a78bdca4d6a018b578e/baaabbab.aabab (II)I
      // 144: ldc2_w 2290116686109445214
      // 147: invokestatic qeaa361f143ee4a0894bd168fd9b30c66/qf4ccf8f5435d4a78bdca4d6a018b578e/baaabbab.baa (IJ)I
      // 14a: goto 14e
      // 14d: athrow
      // 14e: baload
      // 14f: iload 1
      // 150: ifne 160
      // 153: bipush -1
      // 154: if_icmpne 163
      // 157: goto 15b
      // 15a: athrow
      // 15b: bipush 1
      // 15c: goto 160
      // 15f: athrow
      // 160: goto 164
      // 163: bipush 0
      // 164: iand
      // 165: iload 1
      // 166: ifne 1c5
      // 169: istore 3
      // 16a: iload 3
      // 16b: ifeq 1c3
      // 16e: aload 2
      // 16f: ldc_w -1967603270
      // 172: iload 5
      // 174: ldc_w 1757372655
      // 177: ixor
      // 178: invokestatic qeaa361f143ee4a0894bd168fd9b30c66/qf4ccf8f5435d4a78bdca4d6a018b578e/baaabbab.aabab (II)I
      // 17b: ldc2_w 5851787303405271615
      // 17e: invokestatic qeaa361f143ee4a0894bd168fd9b30c66/qf4ccf8f5435d4a78bdca4d6a018b578e/baaabbab.baa (IJ)I
      // 181: baload
      // 182: aload 2
      // 183: ldc_w -1967603269
      // 186: iload 5
      // 188: ldc_w -372882973
      // 18b: ixor
      // 18c: invokestatic qeaa361f143ee4a0894bd168fd9b30c66/qf4ccf8f5435d4a78bdca4d6a018b578e/baaabbab.aabab (II)I
      // 18f: ldc2_w 7082022555563776332
      // 192: invokestatic qeaa361f143ee4a0894bd168fd9b30c66/qf4ccf8f5435d4a78bdca4d6a018b578e/baaabbab.baa (IJ)I
      // 195: baload
      // 196: aload 2
      // 197: ldc_w -1967603272
      // 19a: iload 5
      // 19c: ldc_w 1076342262
      // 19f: ixor
      // 1a0: invokestatic qeaa361f143ee4a0894bd168fd9b30c66/qf4ccf8f5435d4a78bdca4d6a018b578e/baaabbab.aabab (II)I
      // 1a3: ldc2_w 7038384025096509399
      // 1a6: invokestatic qeaa361f143ee4a0894bd168fd9b30c66/qf4ccf8f5435d4a78bdca4d6a018b578e/baaabbab.baa (IJ)I
      // 1a9: baload
      // 1aa: aload 2
      // 1ab: ldc_w -1967603271
      // 1ae: iload 5
      // 1b0: ldc_w -636102619
      // 1b3: ixor
      // 1b4: invokestatic qeaa361f143ee4a0894bd168fd9b30c66/qf4ccf8f5435d4a78bdca4d6a018b578e/baaabbab.aabab (II)I
      // 1b7: ldc2_w 7499393501635596173
      // 1ba: invokestatic qeaa361f143ee4a0894bd168fd9b30c66/qf4ccf8f5435d4a78bdca4d6a018b578e/baaabbab.baa (IJ)I
      // 1bd: baload
      // 1be: invokestatic qeaa361f143ee4a0894bd168fd9b30c66/qf4ccf8f5435d4a78bdca4d6a018b578e/baaabbab.aaa (BBBB)Z
      // 1c1: ireturn
      // 1c2: athrow
      // 1c3: aload 2
      // 1c4: arraylength
      // 1c5: iload 1
      // 1c6: ifne 1ec
      // 1c9: bipush 4
      // 1ca: if_icmpne 1f3
      // 1cd: goto 1d1
      // 1d0: athrow
      // 1d1: aload 2
      // 1d2: bipush 0
      // 1d3: baload
      // 1d4: iload 1
      // 1d5: ifne 1f0
      // 1d8: goto 1dc
      // 1db: athrow
      // 1dc: aload 2
      // 1dd: bipush 1
      // 1de: baload
      // 1df: aload 2
      // 1e0: bipush 2
      // 1e1: baload
      // 1e2: aload 2
      // 1e3: bipush 3
      // 1e4: baload
      // 1e5: invokestatic qeaa361f143ee4a0894bd168fd9b30c66/qf4ccf8f5435d4a78bdca4d6a018b578e/baaabbab.aaa (BBBB)Z
      // 1e8: goto 1ec
      // 1eb: athrow
      // 1ec: ifeq 1f3
      // 1ef: bipush 1
      // 1f0: goto 1f4
      // 1f3: bipush 0
      // 1f4: ireturn
   }

   private static int aaabb(byte[] param0, byte[] param1) {
      // $VF: Couldn't be decompiled
      // Please report this to the Vineflower issue tracker, at https://github.com/Vineflower/vineflower/issues with a copy of the class file (if you have the rights to distribute it!)
      // java.lang.RuntimeException: parsing failure!
      //   at org.jetbrains.java.decompiler.modules.decompiler.decompose.DomHelper.parseGraph(DomHelper.java:211)
      //   at org.jetbrains.java.decompiler.main.rels.MethodProcessor.codeToJava(MethodProcessor.java:166)
      //
      // Bytecode:
      // 00: getstatic qeaa361f143ee4a0894bd168fd9b30c66/qf4ccf8f5435d4a78bdca4d6a018b578e/aabbabbab.ab I
      // 03: bipush 0
      // 04: istore 3
      // 05: istore 2
      // 06: iload 3
      // 07: ldc_w -1967603274
      // 0a: ldc_w 2079477667
      // 0d: ldc_w -787892783
      // 10: ixor
      // 11: invokestatic qeaa361f143ee4a0894bd168fd9b30c66/qf4ccf8f5435d4a78bdca4d6a018b578e/baaabbab.aabab (II)I
      // 14: ldc2_w 323908896753632580
      // 17: invokestatic qeaa361f143ee4a0894bd168fd9b30c66/qf4ccf8f5435d4a78bdca4d6a018b578e/baaabbab.baa (IJ)I
      // 1a: if_icmpge 48
      // 1d: aload 0
      // 1e: iload 3
      // 1f: baload
      // 20: iload 2
      // 21: ifne 49
      // 24: invokestatic java/lang/Byte.toUnsignedInt (B)I
      // 27: aload 1
      // 28: iload 3
      // 29: baload
      // 2a: invokestatic java/lang/Byte.toUnsignedInt (B)I
      // 2d: isub
      // 2e: istore 4
      // 30: iload 2
      // 31: ifne 44
      // 34: iload 4
      // 36: ifeq 41
      // 39: goto 3d
      // 3c: athrow
      // 3d: iload 4
      // 3f: ireturn
      // 40: athrow
      // 41: iinc 3 1
      // 44: iload 2
      // 45: ifeq 06
      // 48: bipush 0
      // 49: ireturn
   }

   private static babaaab a(String param0) {
      // $VF: Couldn't be decompiled
      // Please report this to the Vineflower issue tracker, at https://github.com/Vineflower/vineflower/issues with a copy of the class file (if you have the rights to distribute it!)
      //
      // Bytecode:
      // 000: ldc_w -544344124
      // 003: istore 6
      // 005: getstatic qeaa361f143ee4a0894bd168fd9b30c66/qf4ccf8f5435d4a78bdca4d6a018b578e/aabbabbab.ab I
      // 008: istore 1
      // 009: aload 0
      // 00a: iload 1
      // 00b: ifne 016
      // 00e: ifnull 024
      // 011: goto 015
      // 014: athrow
      // 015: aload 0
      // 016: iload 1
      // 017: ifne 028
      // 01a: invokevirtual java/lang/String.isBlank ()Z
      // 01d: ifeq 027
      // 020: goto 024
      // 023: athrow
      // 024: aconst_null
      // 025: areturn
      // 026: athrow
      // 027: aload 0
      // 028: invokestatic java/net/URI.create (Ljava/lang/String;)Ljava/net/URI;
      // 02b: astore 2
      // 02c: aload 2
      // 02d: invokevirtual java/net/URI.getScheme ()Ljava/lang/String;
      // 030: astore 3
      // 031: aload 3
      // 032: iload 1
      // 033: ifne 03e
      // 036: ifnull 0de
      // 039: goto 03d
      // 03c: athrow
      // 03d: aload 3
      // 03e: iload 1
      // 03f: ifne 0ab
      // 042: ldc_w -1967603273
      // 045: iload 6
      // 047: ldc_w -349895046
      // 04a: ixor
      // 04b: invokestatic qeaa361f143ee4a0894bd168fd9b30c66/qf4ccf8f5435d4a78bdca4d6a018b578e/baaabbab.aabab (II)I
      // 04e: ldc_w -1967603276
      // 051: iload 6
      // 053: ldc_w 1499657625
      // 056: ixor
      // 057: invokestatic qeaa361f143ee4a0894bd168fd9b30c66/qf4ccf8f5435d4a78bdca4d6a018b578e/baaabbab.aabab (II)I
      // 05a: invokestatic qeaa361f143ee4a0894bd168fd9b30c66/qf4ccf8f5435d4a78bdca4d6a018b578e/baaabbab.baab (II)Ljava/lang/String;
      // 05d: invokestatic qeaa361f143ee4a0894bd168fd9b30c66/qf4ccf8f5435d4a78bdca4d6a018b578e/aabbaaaba.abba (Ljava/lang/String;)Ljava/lang/String;
      // 060: invokevirtual java/lang/String.equalsIgnoreCase (Ljava/lang/String;)Z
      // 063: ifne 09b
      // 066: goto 06a
      // 069: athrow
      // 06a: aload 3
      // 06b: iload 1
      // 06c: ifne 0ab
      // 06f: goto 073
      // 072: athrow
      // 073: ldc_w -1967603275
      // 076: iload 6
      // 078: ldc_w 1461899632
      // 07b: ixor
      // 07c: invokestatic qeaa361f143ee4a0894bd168fd9b30c66/qf4ccf8f5435d4a78bdca4d6a018b578e/baaabbab.aabab (II)I
      // 07f: ldc_w -1967603278
      // 082: iload 6
      // 084: ldc_w -1929801189
      // 087: ixor
      // 088: invokestatic qeaa361f143ee4a0894bd168fd9b30c66/qf4ccf8f5435d4a78bdca4d6a018b578e/baaabbab.aabab (II)I
      // 08b: invokestatic qeaa361f143ee4a0894bd168fd9b30c66/qf4ccf8f5435d4a78bdca4d6a018b578e/baaabbab.baab (II)Ljava/lang/String;
      // 08e: invokestatic qeaa361f143ee4a0894bd168fd9b30c66/qf4ccf8f5435d4a78bdca4d6a018b578e/aabbaaaba.abba (Ljava/lang/String;)Ljava/lang/String;
      // 091: invokevirtual java/lang/String.equalsIgnoreCase (Ljava/lang/String;)Z
      // 094: ifeq 0de
      // 097: goto 09b
      // 09a: athrow
      // 09b: aload 2
      // 09c: iload 1
      // 09d: ifne 0b7
      // 0a0: goto 0a4
      // 0a3: athrow
      // 0a4: invokevirtual java/net/URI.getRawUserInfo ()Ljava/lang/String;
      // 0a7: goto 0ab
      // 0aa: athrow
      // 0ab: ifnonnull 0de
      // 0ae: aload 2
      // 0af: iload 1
      // 0b0: ifne 0c6
      // 0b3: goto 0b7
      // 0b6: athrow
      // 0b7: invokevirtual java/net/URI.getPort ()I
      // 0ba: ifeq 0de
      // 0bd: aload 2
      // 0be: iload 1
      // 0bf: ifne 0e1
      // 0c2: goto 0c6
      // 0c5: athrow
      // 0c6: invokevirtual java/net/URI.getPort ()I
      // 0c9: ldc_w -1967603277
      // 0cc: iload 6
      // 0ce: ldc_w 1599846105
      // 0d1: ixor
      // 0d2: invokestatic qeaa361f143ee4a0894bd168fd9b30c66/qf4ccf8f5435d4a78bdca4d6a018b578e/baaabbab.aabab (II)I
      // 0d5: ldc2_w 1482920112196913321
      // 0d8: invokestatic qeaa361f143ee4a0894bd168fd9b30c66/qf4ccf8f5435d4a78bdca4d6a018b578e/baaabbab.baa (IJ)I
      // 0db: if_icmple 0e0
      // 0de: aconst_null
      // 0df: areturn
      // 0e0: aload 2
      // 0e1: invokevirtual java/net/URI.getHost ()Ljava/lang/String;
      // 0e4: astore 4
      // 0e6: aload 4
      // 0e8: iload 1
      // 0e9: ifne 0f5
      // 0ec: ifnull 103
      // 0ef: goto 0f3
      // 0f2: athrow
      // 0f3: aload 4
      // 0f5: iload 1
      // 0f6: ifne 110
      // 0f9: invokevirtual java/lang/String.isBlank ()Z
      // 0fc: ifeq 105
      // 0ff: goto 103
      // 102: athrow
      // 103: aconst_null
      // 104: areturn
      // 105: aload 4
      // 107: invokestatic java/net/IDN.toASCII (Ljava/lang/String;)Ljava/lang/String;
      // 10a: getstatic java/util/Locale.ROOT Ljava/util/Locale;
      // 10d: invokevirtual java/lang/String.toLowerCase (Ljava/util/Locale;)Ljava/lang/String;
      // 110: astore 5
      // 112: aload 5
      // 114: ldc_w -1967603280
      // 117: iload 6
      // 119: ldc_w 1238994943
      // 11c: ixor
      // 11d: invokestatic qeaa361f143ee4a0894bd168fd9b30c66/qf4ccf8f5435d4a78bdca4d6a018b578e/baaabbab.aabab (II)I
      // 120: ldc_w -1967603279
      // 123: iload 6
      // 125: ldc_w -746390591
      // 128: ixor
      // 129: invokestatic qeaa361f143ee4a0894bd168fd9b30c66/qf4ccf8f5435d4a78bdca4d6a018b578e/baaabbab.aabab (II)I
      // 12c: invokestatic qeaa361f143ee4a0894bd168fd9b30c66/qf4ccf8f5435d4a78bdca4d6a018b578e/baaabbab.baab (II)Ljava/lang/String;
      // 12f: iload 1
      // 130: ifne 164
      // 133: invokestatic qeaa361f143ee4a0894bd168fd9b30c66/qf4ccf8f5435d4a78bdca4d6a018b578e/aabbaaaba.abba (Ljava/lang/String;)Ljava/lang/String;
      // 136: invokevirtual java/lang/String.equals (Ljava/lang/Object;)Z
      // 139: ifne 16a
      // 13c: goto 140
      // 13f: athrow
      // 140: aload 5
      // 142: ldc_w -1967603282
      // 145: iload 6
      // 147: ldc_w -976624640
      // 14a: ixor
      // 14b: invokestatic qeaa361f143ee4a0894bd168fd9b30c66/qf4ccf8f5435d4a78bdca4d6a018b578e/baaabbab.aabab (II)I
      // 14e: ldc_w -1967603281
      // 151: iload 6
      // 153: ldc_w -546605045
      // 156: ixor
      // 157: invokestatic qeaa361f143ee4a0894bd168fd9b30c66/qf4ccf8f5435d4a78bdca4d6a018b578e/baaabbab.aabab (II)I
      // 15a: invokestatic qeaa361f143ee4a0894bd168fd9b30c66/qf4ccf8f5435d4a78bdca4d6a018b578e/baaabbab.baab (II)Ljava/lang/String;
      // 15d: invokestatic qeaa361f143ee4a0894bd168fd9b30c66/qf4ccf8f5435d4a78bdca4d6a018b578e/aabbaaaba.abba (Ljava/lang/String;)Ljava/lang/String;
      // 160: goto 164
      // 163: athrow
      // 164: invokevirtual java/lang/String.endsWith (Ljava/lang/String;)Z
      // 167: ifeq 16c
      // 16a: aconst_null
      // 16b: areturn
      // 16c: new qeaa361f143ee4a0894bd168fd9b30c66/qf4ccf8f5435d4a78bdca4d6a018b578e/babaaab
      // 16f: dup
      // 170: aload 5
      // 172: invokespecial qeaa361f143ee4a0894bd168fd9b30c66/qf4ccf8f5435d4a78bdca4d6a018b578e/babaaab.<init> (Ljava/lang/String;)V
      // 175: areturn
      // 176: astore 2
      // 177: aconst_null
      // 178: areturn
   }

   private static int aabab(int var0, int var1) {
      int var2 = abab[var0 ^ -1967603682] ^ var1 ^ var0;
      var2 += 24300;
      var2 -= 26953;
      var2 -= 44201;
      var2 ^= 33955;
      var2 -= 7329;
      var2 -= 58924;
      var2 -= 56211;
      var2 -= 10209;
      return var2 ^ 6513;
   }

   public static boolean aabaa() {
      // $VF: Couldn't be decompiled
      // Please report this to the Vineflower issue tracker, at https://github.com/Vineflower/vineflower/issues with a copy of the class file (if you have the rights to distribute it!)
      // java.lang.RuntimeException: parsing failure!
      //   at org.jetbrains.java.decompiler.modules.decompiler.decompose.DomHelper.parseGraph(DomHelper.java:211)
      //   at org.jetbrains.java.decompiler.main.rels.MethodProcessor.codeToJava(MethodProcessor.java:166)
      //
      // Bytecode:
      // 00: getstatic qeaa361f143ee4a0894bd168fd9b30c66/qf4ccf8f5435d4a78bdca4d6a018b578e/aabbabbab.ab I
      // 03: istore 0
      // 04: invokestatic qeaa361f143ee4a0894bd168fd9b30c66/qf4ccf8f5435d4a78bdca4d6a018b578e/baaabbab.b ()Z
      // 07: iload 0
      // 08: ifne 13
      // 0b: ifeq 14
      // 0e: goto 12
      // 11: athrow
      // 12: bipush 1
      // 13: ireturn
      // 14: invokestatic qeaa361f143ee4a0894bd168fd9b30c66/qf4ccf8f5435d4a78bdca4d6a018b578e/abaaaaaba.aaaaa ()Lqeaa361f143ee4a0894bd168fd9b30c66/qf4ccf8f5435d4a78bdca4d6a018b578e/abaaaaaba;
      // 17: astore 1
      // 18: aload 1
      // 19: iload 0
      // 1a: ifne 25
      // 1d: ifnull 82
      // 20: goto 24
      // 23: athrow
      // 24: aload 1
      // 25: iload 0
      // 26: ifne 38
      // 29: invokevirtual qeaa361f143ee4a0894bd168fd9b30c66/qf4ccf8f5435d4a78bdca4d6a018b578e/abaaaaaba.aaba ()Lqeaa361f143ee4a0894bd168fd9b30c66/qf4ccf8f5435d4a78bdca4d6a018b578e/babbaba;
      // 2c: ifnull 82
      // 2f: goto 33
      // 32: athrow
      // 33: aload 1
      // 34: goto 38
      // 37: athrow
      // 38: invokevirtual qeaa361f143ee4a0894bd168fd9b30c66/qf4ccf8f5435d4a78bdca4d6a018b578e/abaaaaaba.aaba ()Lqeaa361f143ee4a0894bd168fd9b30c66/qf4ccf8f5435d4a78bdca4d6a018b578e/babbaba;
      // 3b: invokevirtual qeaa361f143ee4a0894bd168fd9b30c66/qf4ccf8f5435d4a78bdca4d6a018b578e/babbaba.abbbbb ()Lqeaa361f143ee4a0894bd168fd9b30c66/qf4ccf8f5435d4a78bdca4d6a018b578e/bbbaaba;
      // 3e: astore 2
      // 3f: aload 2
      // 40: iload 0
      // 41: ifne 4c
      // 44: ifnull 5c
      // 47: goto 4b
      // 4a: athrow
      // 4b: aload 2
      // 4c: invokevirtual qeaa361f143ee4a0894bd168fd9b30c66/qf4ccf8f5435d4a78bdca4d6a018b578e/bbbaaba.babbb ()Z
      // 4f: iload 0
      // 50: ifne 5b
      // 53: ifeq 5c
      // 56: goto 5a
      // 59: athrow
      // 5a: bipush 1
      // 5b: ireturn
      // 5c: aload 1
      // 5d: invokevirtual qeaa361f143ee4a0894bd168fd9b30c66/qf4ccf8f5435d4a78bdca4d6a018b578e/abaaaaaba.aaba ()Lqeaa361f143ee4a0894bd168fd9b30c66/qf4ccf8f5435d4a78bdca4d6a018b578e/babbaba;
      // 60: invokevirtual qeaa361f143ee4a0894bd168fd9b30c66/qf4ccf8f5435d4a78bdca4d6a018b578e/babbaba.ab ()Lqeaa361f143ee4a0894bd168fd9b30c66/qf4ccf8f5435d4a78bdca4d6a018b578e/abaaaaba;
      // 63: astore 3
      // 64: aload 3
      // 65: iload 0
      // 66: ifne 71
      // 69: ifnull 82
      // 6c: goto 70
      // 6f: athrow
      // 70: aload 3
      // 71: invokevirtual qeaa361f143ee4a0894bd168fd9b30c66/qf4ccf8f5435d4a78bdca4d6a018b578e/abaaaaba.babbaab ()Z
      // 74: iload 0
      // 75: ifne 83
      // 78: ifeq 82
      // 7b: goto 7f
      // 7e: athrow
      // 7f: bipush 1
      // 80: ireturn
      // 81: athrow
      // 82: bipush 0
      // 83: ireturn
   }
}
