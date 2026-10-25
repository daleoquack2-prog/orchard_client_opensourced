package nsc;

import java.nio.charset.StandardCharsets;
import java.security.SecureRandom;
import java.util.Arrays;
import java.util.Base64;
import java.util.Collections;
import java.util.Set;
import java.util.WeakHashMap;
import java.util.function.IntConsumer;
import net.fabricmc.api.EnvType;
import net.fabricmc.api.Environment;

@Environment(EnvType.CLIENT)
public final class aabbaaaba {
   private static final SecureRandom aa;
   private static volatile boolean b;
   private static final Long[] ab;
   private static final long[] ba;
   private static final int[] a;
   private static final Set bb;
   private static final Integer[] aaa;
   public static int aab;
   private static final String[] baa;
   private static final long[] aba;
   private static final Object[] bab;
   private static final byte[] abb;

   public static ababbbbaa aa(String var0) {
      return ababbbbaa.bbbb(var0);
   }

   private static int ab(byte[] param0, int param1, int param2) {
      // $VF: Couldn't be decompiled
      // Please report this to the Vineflower issue tracker, at https://github.com/Vineflower/vineflower/issues with a copy of the class file (if you have the rights to distribute it!)
      // java.lang.NullPointerException: Cannot invoke "org.jetbrains.java.decompiler.code.cfg.ExceptionRangeCFG.isCircular()" because "range" is null
      //   at org.jetbrains.java.decompiler.modules.decompiler.decompose.DomHelper.graphToStatement(DomHelper.java:84)
      //   at org.jetbrains.java.decompiler.modules.decompiler.decompose.DomHelper.parseGraph(DomHelper.java:203)
      //   at org.jetbrains.java.decompiler.main.rels.MethodProcessor.codeToJava(MethodProcessor.java:166)
      //
      // Bytecode:
      // 000: ldc 1007741062
      // 002: istore 5
      // 004: aload 0
      // 005: iload 1
      // 006: baload
      // 007: ldc 147218489
      // 009: iload 5
      // 00b: ldc -466627494
      // 00d: ixor
      // 00e: invokestatic qeaa361f143ee4a0894bd168fd9b30c66/qf4ccf8f5435d4a78bdca4d6a018b578e/aabbaaaba.babb (II)I
      // 011: ldc2_w 5055097085126610182
      // 014: invokestatic qeaa361f143ee4a0894bd168fd9b30c66/qf4ccf8f5435d4a78bdca4d6a018b578e/aabbaaaba.bbb (IJ)I
      // 017: iand
      // 018: istore 3
      // 019: iload 3
      // 01a: ldc 147218488
      // 01c: iload 5
      // 01e: ldc 845680342
      // 020: ixor
      // 021: invokestatic qeaa361f143ee4a0894bd168fd9b30c66/qf4ccf8f5435d4a78bdca4d6a018b578e/aabbaaaba.babb (II)I
      // 024: ldc2_w 7959522766413556902
      // 027: invokestatic qeaa361f143ee4a0894bd168fd9b30c66/qf4ccf8f5435d4a78bdca4d6a018b578e/aabbaaaba.bbb (IJ)I
      // 02a: if_icmpge 030
      // 02d: bipush 1
      // 02e: ireturn
      // 02f: athrow
      // 030: iload 3
      // 031: ldc 147218491
      // 033: iload 5
      // 035: ldc -993371249
      // 037: ixor
      // 038: invokestatic qeaa361f143ee4a0894bd168fd9b30c66/qf4ccf8f5435d4a78bdca4d6a018b578e/aabbaaaba.babb (II)I
      // 03b: ldc2_w 209889806652613622
      // 03e: invokestatic qeaa361f143ee4a0894bd168fd9b30c66/qf4ccf8f5435d4a78bdca4d6a018b578e/aabbaaaba.bbb (IJ)I
      // 041: if_icmplt 079
      // 044: iload 3
      // 045: ldc 147218490
      // 047: iload 5
      // 049: ldc -646675931
      // 04b: ixor
      // 04c: invokestatic qeaa361f143ee4a0894bd168fd9b30c66/qf4ccf8f5435d4a78bdca4d6a018b578e/aabbaaaba.babb (II)I
      // 04f: ldc2_w 8035512480350130267
      // 052: invokestatic qeaa361f143ee4a0894bd168fd9b30c66/qf4ccf8f5435d4a78bdca4d6a018b578e/aabbaaaba.bbb (IJ)I
      // 055: if_icmpgt 079
      // 058: goto 05c
      // 05b: athrow
      // 05c: iload 1
      // 05d: bipush 1
      // 05e: iadd
      // 05f: iload 2
      // 060: if_icmpge 079
      // 063: goto 067
      // 066: athrow
      // 067: aload 0
      // 068: iload 1
      // 069: bipush 1
      // 06a: iadd
      // 06b: baload
      // 06c: invokestatic qeaa361f143ee4a0894bd168fd9b30c66/qf4ccf8f5435d4a78bdca4d6a018b578e/aabbaaaba.aba (B)Z
      // 06f: ifeq 079
      // 072: goto 076
      // 075: athrow
      // 076: bipush 2
      // 077: ireturn
      // 078: athrow
      // 079: iload 3
      // 07a: ldc 147218493
      // 07c: iload 5
      // 07e: ldc -1985368918
      // 080: ixor
      // 081: invokestatic qeaa361f143ee4a0894bd168fd9b30c66/qf4ccf8f5435d4a78bdca4d6a018b578e/aabbaaaba.babb (II)I
      // 084: ldc2_w 532418984353242919
      // 087: invokestatic qeaa361f143ee4a0894bd168fd9b30c66/qf4ccf8f5435d4a78bdca4d6a018b578e/aabbaaaba.bbb (IJ)I
      // 08a: if_icmplt 147
      // 08d: iload 3
      // 08e: ldc 147218492
      // 090: iload 5
      // 092: ldc -1144452558
      // 094: ixor
      // 095: invokestatic qeaa361f143ee4a0894bd168fd9b30c66/qf4ccf8f5435d4a78bdca4d6a018b578e/aabbaaaba.babb (II)I
      // 098: ldc2_w 7944573388742986817
      // 09b: invokestatic qeaa361f143ee4a0894bd168fd9b30c66/qf4ccf8f5435d4a78bdca4d6a018b578e/aabbaaaba.bbb (IJ)I
      // 09e: if_icmpgt 147
      // 0a1: goto 0a5
      // 0a4: athrow
      // 0a5: iload 1
      // 0a6: bipush 2
      // 0a7: iadd
      // 0a8: iload 2
      // 0a9: if_icmpge 147
      // 0ac: goto 0b0
      // 0af: athrow
      // 0b0: aload 0
      // 0b1: iload 1
      // 0b2: bipush 1
      // 0b3: iadd
      // 0b4: baload
      // 0b5: invokestatic qeaa361f143ee4a0894bd168fd9b30c66/qf4ccf8f5435d4a78bdca4d6a018b578e/aabbaaaba.aba (B)Z
      // 0b8: ifeq 147
      // 0bb: goto 0bf
      // 0be: athrow
      // 0bf: aload 0
      // 0c0: iload 1
      // 0c1: bipush 2
      // 0c2: iadd
      // 0c3: baload
      // 0c4: invokestatic qeaa361f143ee4a0894bd168fd9b30c66/qf4ccf8f5435d4a78bdca4d6a018b578e/aabbaaaba.aba (B)Z
      // 0c7: ifeq 147
      // 0ca: goto 0ce
      // 0cd: athrow
      // 0ce: aload 0
      // 0cf: iload 1
      // 0d0: bipush 1
      // 0d1: iadd
      // 0d2: baload
      // 0d3: ldc 147218495
      // 0d5: iload 5
      // 0d7: ldc -998136440
      // 0d9: ixor
      // 0da: invokestatic qeaa361f143ee4a0894bd168fd9b30c66/qf4ccf8f5435d4a78bdca4d6a018b578e/aabbaaaba.babb (II)I
      // 0dd: ldc2_w 5404293092202304124
      // 0e0: invokestatic qeaa361f143ee4a0894bd168fd9b30c66/qf4ccf8f5435d4a78bdca4d6a018b578e/aabbaaaba.bbb (IJ)I
      // 0e3: iand
      // 0e4: istore 4
      // 0e6: iload 3
      // 0e7: ldc 147218494
      // 0e9: iload 5
      // 0eb: ldc -611575998
      // 0ed: ixor
      // 0ee: invokestatic qeaa361f143ee4a0894bd168fd9b30c66/qf4ccf8f5435d4a78bdca4d6a018b578e/aabbaaaba.babb (II)I
      // 0f1: ldc2_w 1978748547016893301
      // 0f4: invokestatic qeaa361f143ee4a0894bd168fd9b30c66/qf4ccf8f5435d4a78bdca4d6a018b578e/aabbaaaba.bbb (IJ)I
      // 0f7: if_icmpne 113
      // 0fa: iload 4
      // 0fc: ldc 147218481
      // 0fe: iload 5
      // 100: ldc -1266330674
      // 102: ixor
      // 103: invokestatic qeaa361f143ee4a0894bd168fd9b30c66/qf4ccf8f5435d4a78bdca4d6a018b578e/aabbaaaba.babb (II)I
      // 106: ldc2_w 7671125170456973735
      // 109: invokestatic qeaa361f143ee4a0894bd168fd9b30c66/qf4ccf8f5435d4a78bdca4d6a018b578e/aabbaaaba.bbb (IJ)I
      // 10c: if_icmplt 147
      // 10f: goto 113
      // 112: athrow
      // 113: iload 3
      // 114: ldc 147218480
      // 116: iload 5
      // 118: ldc -1363731633
      // 11a: ixor
      // 11b: invokestatic qeaa361f143ee4a0894bd168fd9b30c66/qf4ccf8f5435d4a78bdca4d6a018b578e/aabbaaaba.babb (II)I
      // 11e: ldc2_w 2107554345831098238
      // 121: invokestatic qeaa361f143ee4a0894bd168fd9b30c66/qf4ccf8f5435d4a78bdca4d6a018b578e/aabbaaaba.bbb (IJ)I
      // 124: if_icmpne 144
      // 127: goto 12b
      // 12a: athrow
      // 12b: iload 4
      // 12d: ldc 147218483
      // 12f: iload 5
      // 131: ldc -2106962235
      // 133: ixor
      // 134: invokestatic qeaa361f143ee4a0894bd168fd9b30c66/qf4ccf8f5435d4a78bdca4d6a018b578e/aabbaaaba.babb (II)I
      // 137: ldc2_w 1862933529014320642
      // 13a: invokestatic qeaa361f143ee4a0894bd168fd9b30c66/qf4ccf8f5435d4a78bdca4d6a018b578e/aabbaaaba.bbb (IJ)I
      // 13d: if_icmpgt 147
      // 140: goto 144
      // 143: athrow
      // 144: bipush 3
      // 145: ireturn
      // 146: athrow
      // 147: iload 3
      // 148: ldc 147218482
      // 14a: iload 5
      // 14c: ldc -305601220
      // 14e: ixor
      // 14f: invokestatic qeaa361f143ee4a0894bd168fd9b30c66/qf4ccf8f5435d4a78bdca4d6a018b578e/aabbaaaba.babb (II)I
      // 152: ldc2_w 8464314254577694267
      // 155: invokestatic qeaa361f143ee4a0894bd168fd9b30c66/qf4ccf8f5435d4a78bdca4d6a018b578e/aabbaaaba.bbb (IJ)I
      // 158: if_icmplt 224
      // 15b: iload 3
      // 15c: ldc 147218485
      // 15e: iload 5
      // 160: ldc -1530987028
      // 162: ixor
      // 163: invokestatic qeaa361f143ee4a0894bd168fd9b30c66/qf4ccf8f5435d4a78bdca4d6a018b578e/aabbaaaba.babb (II)I
      // 166: ldc2_w 1924358298110070893
      // 169: invokestatic qeaa361f143ee4a0894bd168fd9b30c66/qf4ccf8f5435d4a78bdca4d6a018b578e/aabbaaaba.bbb (IJ)I
      // 16c: if_icmpgt 224
      // 16f: goto 173
      // 172: athrow
      // 173: iload 1
      // 174: bipush 3
      // 175: iadd
      // 176: iload 2
      // 177: if_icmpge 224
      // 17a: goto 17e
      // 17d: athrow
      // 17e: aload 0
      // 17f: iload 1
      // 180: bipush 1
      // 181: iadd
      // 182: baload
      // 183: invokestatic qeaa361f143ee4a0894bd168fd9b30c66/qf4ccf8f5435d4a78bdca4d6a018b578e/aabbaaaba.aba (B)Z
      // 186: ifeq 224
      // 189: goto 18d
      // 18c: athrow
      // 18d: aload 0
      // 18e: iload 1
      // 18f: bipush 2
      // 190: iadd
      // 191: baload
      // 192: invokestatic qeaa361f143ee4a0894bd168fd9b30c66/qf4ccf8f5435d4a78bdca4d6a018b578e/aabbaaaba.aba (B)Z
      // 195: ifeq 224
      // 198: goto 19c
      // 19b: athrow
      // 19c: aload 0
      // 19d: iload 1
      // 19e: bipush 3
      // 19f: iadd
      // 1a0: baload
      // 1a1: invokestatic qeaa361f143ee4a0894bd168fd9b30c66/qf4ccf8f5435d4a78bdca4d6a018b578e/aabbaaaba.aba (B)Z
      // 1a4: ifeq 224
      // 1a7: goto 1ab
      // 1aa: athrow
      // 1ab: aload 0
      // 1ac: iload 1
      // 1ad: bipush 1
      // 1ae: iadd
      // 1af: baload
      // 1b0: ldc 147218484
      // 1b2: iload 5
      // 1b4: ldc 2008041444
      // 1b6: ixor
      // 1b7: invokestatic qeaa361f143ee4a0894bd168fd9b30c66/qf4ccf8f5435d4a78bdca4d6a018b578e/aabbaaaba.babb (II)I
      // 1ba: ldc2_w 5404293092202304124
      // 1bd: invokestatic qeaa361f143ee4a0894bd168fd9b30c66/qf4ccf8f5435d4a78bdca4d6a018b578e/aabbaaaba.bbb (IJ)I
      // 1c0: iand
      // 1c1: istore 4
      // 1c3: iload 3
      // 1c4: ldc 147218487
      // 1c6: iload 5
      // 1c8: ldc 1691892363
      // 1ca: ixor
      // 1cb: invokestatic qeaa361f143ee4a0894bd168fd9b30c66/qf4ccf8f5435d4a78bdca4d6a018b578e/aabbaaaba.babb (II)I
      // 1ce: ldc2_w 5774392829092032375
      // 1d1: invokestatic qeaa361f143ee4a0894bd168fd9b30c66/qf4ccf8f5435d4a78bdca4d6a018b578e/aabbaaaba.bbb (IJ)I
      // 1d4: if_icmpne 1f0
      // 1d7: iload 4
      // 1d9: ldc 147218486
      // 1db: iload 5
      // 1dd: ldc -2093241768
      // 1df: ixor
      // 1e0: invokestatic qeaa361f143ee4a0894bd168fd9b30c66/qf4ccf8f5435d4a78bdca4d6a018b578e/aabbaaaba.babb (II)I
      // 1e3: ldc2_w 4154227004981989517
      // 1e6: invokestatic qeaa361f143ee4a0894bd168fd9b30c66/qf4ccf8f5435d4a78bdca4d6a018b578e/aabbaaaba.bbb (IJ)I
      // 1e9: if_icmplt 224
      // 1ec: goto 1f0
      // 1ef: athrow
      // 1f0: iload 3
      // 1f1: ldc 147218473
      // 1f3: iload 5
      // 1f5: ldc 375683799
      // 1f7: ixor
      // 1f8: invokestatic qeaa361f143ee4a0894bd168fd9b30c66/qf4ccf8f5435d4a78bdca4d6a018b578e/aabbaaaba.babb (II)I
      // 1fb: ldc2_w 8800454379515819941
      // 1fe: invokestatic qeaa361f143ee4a0894bd168fd9b30c66/qf4ccf8f5435d4a78bdca4d6a018b578e/aabbaaaba.bbb (IJ)I
      // 201: if_icmpne 221
      // 204: goto 208
      // 207: athrow
      // 208: iload 4
      // 20a: ldc 147218472
      // 20c: iload 5
      // 20e: ldc -1805606086
      // 210: ixor
      // 211: invokestatic qeaa361f143ee4a0894bd168fd9b30c66/qf4ccf8f5435d4a78bdca4d6a018b578e/aabbaaaba.babb (II)I
      // 214: ldc2_w 6681973159682621513
      // 217: invokestatic qeaa361f143ee4a0894bd168fd9b30c66/qf4ccf8f5435d4a78bdca4d6a018b578e/aabbaaaba.bbb (IJ)I
      // 21a: if_icmpgt 224
      // 21d: goto 221
      // 220: athrow
      // 221: bipush 4
      // 222: ireturn
      // 223: athrow
      // 224: bipush 1
      // 225: ireturn
   }

   private aabbaaaba() {
   }

   public static boolean ba() {
      return b;
   }

   private static int bb(byte[] var0, int var1, int var2) {
      int var3 = 0;

      for (int var4 = var1; var4 < var2; var3++) {
         var4 += ab(var0, var4, var2);
      }

      return var3;
   }

   private static long aaa(int var0, long var1) {
      int var3 = (var0 ^ (int)var1 ^ babb(147218433, -1684887476 ^ 1537890984)) & babb(147218432, -1684887476 ^ 496982962);
      if (ab[var3] == null) {
         ab[var3] = aba[var3] ^ var1;
      }

      return ab[var3];
   }

   public static long aab(String var0) {
      int var10000 = baaabbaa.bba;
      long var2 = aaa(babb(147218435, -1574080561 ^ 482942244), 7266475261002394338L);
      int var1 = var10000;

      try {
         if (var0 == null) {
            return var2;
         }
      } catch (MatchException var6) {
         throw var6;
      }

      int var4 = 0;

      while (true) {
         if (var4 < var0.length()) {
            int var5 = var0.codePointAt(var4);
            var8 = var2 ^ Character.toLowerCase(var5);
            if (var1 != 0) {
               break;
            }

            var2 = var8;
            var2 *= aaa(babb(147218434, -1574080561 ^ -495231408), 8667381138658748185L);
            var4 += Character.charCount(var5);
            if (var1 == 0) {
               continue;
            }
         }

         var8 = var2;
         break;
      }

      return var8;
   }

   private static boolean aba(byte var0) {
      try {
         if ((var0 & bbb(babb(147218437, -996128276 ^ -404566510), 5483423998549065444L)) == bbb(babb(147218436, -996128276 ^ 223748809), 3058947039271797569L)
            )
          {
            return true;
         }
      } catch (MatchException var1) {
         throw var1;
      }

      return false;
   }

   public static void abb() {
      // $VF: Couldn't be decompiled
      // Please report this to the Vineflower issue tracker, at https://github.com/Vineflower/vineflower/issues with a copy of the class file (if you have the rights to distribute it!)
      // java.lang.RuntimeException: parsing failure!
      //   at org.jetbrains.java.decompiler.modules.decompiler.decompose.DomHelper.parseGraph(DomHelper.java:211)
      //   at org.jetbrains.java.decompiler.main.rels.MethodProcessor.codeToJava(MethodProcessor.java:166)
      //
      // Bytecode:
      // 00: getstatic qeaa361f143ee4a0894bd168fd9b30c66/qf4ccf8f5435d4a78bdca4d6a018b578e/baaabbaa.bba I
      // 03: istore 0
      // 04: getstatic qeaa361f143ee4a0894bd168fd9b30c66/qf4ccf8f5435d4a78bdca4d6a018b578e/aabbaaaba.b Z
      // 07: ifeq 0c
      // 0a: return
      // 0b: athrow
      // 0c: getstatic qeaa361f143ee4a0894bd168fd9b30c66/qf4ccf8f5435d4a78bdca4d6a018b578e/aabbaaaba.bb Ljava/util/Set;
      // 0f: dup
      // 10: astore 1
      // 11: monitorenter
      // 12: getstatic qeaa361f143ee4a0894bd168fd9b30c66/qf4ccf8f5435d4a78bdca4d6a018b578e/aabbaaaba.bb Ljava/util/Set;
      // 15: invokeinterface java/util/Set.iterator ()Ljava/util/Iterator; 1
      // 1a: astore 2
      // 1b: aload 2
      // 1c: invokeinterface java/util/Iterator.hasNext ()Z 1
      // 21: ifeq 4a
      // 24: aload 2
      // 25: invokeinterface java/util/Iterator.next ()Ljava/lang/Object; 1
      // 2a: checkcast qeaa361f143ee4a0894bd168fd9b30c66/qf4ccf8f5435d4a78bdca4d6a018b578e/aaaaabbaa
      // 2d: astore 3
      // 2e: iload 0
      // 2f: ifne 4c
      // 32: aload 3
      // 33: iload 0
      // 34: ifne 43
      // 37: goto 3b
      // 3a: athrow
      // 3b: ifnull 46
      // 3e: goto 42
      // 41: athrow
      // 42: aload 3
      // 43: invokevirtual qeaa361f143ee4a0894bd168fd9b30c66/qf4ccf8f5435d4a78bdca4d6a018b578e/aaaaabbaa.aa ()V
      // 46: iload 0
      // 47: ifeq 1b
      // 4a: aload 1
      // 4b: monitorexit
      // 4c: goto 56
      // 4f: astore 4
      // 51: aload 1
      // 52: monitorexit
      // 53: aload 4
      // 55: athrow
      // 56: return
   }

   public static void baa() {
      // $VF: Couldn't be decompiled
      // Please report this to the Vineflower issue tracker, at https://github.com/Vineflower/vineflower/issues with a copy of the class file (if you have the rights to distribute it!)
      // java.lang.RuntimeException: parsing failure!
      //   at org.jetbrains.java.decompiler.modules.decompiler.decompose.DomHelper.parseGraph(DomHelper.java:211)
      //   at org.jetbrains.java.decompiler.main.rels.MethodProcessor.codeToJava(MethodProcessor.java:166)
      //
      // Bytecode:
      // 00: getstatic qeaa361f143ee4a0894bd168fd9b30c66/qf4ccf8f5435d4a78bdca4d6a018b578e/baaabbaa.bba I
      // 03: bipush 1
      // 04: putstatic qeaa361f143ee4a0894bd168fd9b30c66/qf4ccf8f5435d4a78bdca4d6a018b578e/aabbaaaba.b Z
      // 07: getstatic qeaa361f143ee4a0894bd168fd9b30c66/qf4ccf8f5435d4a78bdca4d6a018b578e/aabbaaaba.bb Ljava/util/Set;
      // 0a: dup
      // 0b: astore 1
      // 0c: monitorenter
      // 0d: istore 0
      // 0e: getstatic qeaa361f143ee4a0894bd168fd9b30c66/qf4ccf8f5435d4a78bdca4d6a018b578e/aabbaaaba.bb Ljava/util/Set;
      // 11: invokeinterface java/util/Set.iterator ()Ljava/util/Iterator; 1
      // 16: astore 2
      // 17: aload 2
      // 18: invokeinterface java/util/Iterator.hasNext ()Z 1
      // 1d: ifeq 46
      // 20: aload 2
      // 21: invokeinterface java/util/Iterator.next ()Ljava/lang/Object; 1
      // 26: checkcast qeaa361f143ee4a0894bd168fd9b30c66/qf4ccf8f5435d4a78bdca4d6a018b578e/aaaaabbaa
      // 29: astore 3
      // 2a: iload 0
      // 2b: ifne 50
      // 2e: aload 3
      // 2f: iload 0
      // 30: ifne 3f
      // 33: goto 37
      // 36: athrow
      // 37: ifnull 42
      // 3a: goto 3e
      // 3d: athrow
      // 3e: aload 3
      // 3f: invokevirtual qeaa361f143ee4a0894bd168fd9b30c66/qf4ccf8f5435d4a78bdca4d6a018b578e/aaaaabbaa.aab ()V
      // 42: iload 0
      // 43: ifeq 17
      // 46: getstatic qeaa361f143ee4a0894bd168fd9b30c66/qf4ccf8f5435d4a78bdca4d6a018b578e/aabbaaaba.bb Ljava/util/Set;
      // 49: invokeinterface java/util/Set.clear ()V 1
      // 4e: aload 1
      // 4f: monitorexit
      // 50: goto 5a
      // 53: astore 4
      // 55: aload 1
      // 56: monitorexit
      // 57: aload 4
      // 59: athrow
      // 5a: getstatic qeaa361f143ee4a0894bd168fd9b30c66/qf4ccf8f5435d4a78bdca4d6a018b578e/aabbaaaba.abb [B
      // 5d: bipush 0
      // 5e: invokestatic java/util/Arrays.fill ([BB)V
      // 61: return
   }

   private static byte[] bab(byte[] var0) {
      int var6 = 1944338998;

      try {
         if (var0.length < 3) {
            return null;
         }
      } catch (MatchException var14) {
         throw var14;
      }

      int var1 = var0[0] & bbb(babb(147218439, var6 ^ 1167065351), 5404293092202304124L);

      try {
         if ((var0[1] & bbb(babb(147218438, var6 ^ 1215129492), 5404293092202304124L))
            != ((var1 ^ bbb(babb(147218553, var6 ^ -1791608868), 7875227826327008412L)) & bbb(babb(147218552, var6 ^ -1517588549), 5404293092202304124L))) {
            return null;
         }
      } catch (MatchException var13) {
         throw var13;
      }

      byte[] var2 = abbb(var1);
      byte[] var3 = new byte[var0.length - 2];

      Object var15;
      try {
         int var4 = 0;

         try {
            while (var4 < var3.length) {
               var3[var4] = (byte)(
                  var0[var4 + 2]
                     ^ var2[var4 + (var1 & bbb(babb(147218555, var6 ^ 1220272987), 7986222699824761852L))
                        & bbb(babb(147218554, var6 ^ 709459178), 7986222699824761852L)]
                     ^ var4 * var1 & bbb(babb(147218557, var6 ^ 1161287300), 5404293092202304124L)
               );
               var4++;
            }
         } catch (MatchException var11) {
            throw var11;
         }

         if (abab(var3)) {
            return var3;
         }

         Arrays.fill(var3, (byte)0);
         var15 = null;
      } finally {
         Arrays.fill(var2, (byte)0);
      }

      return (byte[])var15;
   }

   private static byte[] bba() {
      int var0 = bbb(babb(147218556, 286439542 ^ 1444991834), 8931082459959568425L);
      byte[] var1 = new byte[bbb(babb(147218559, 286439542 ^ -1861777581), 7773654900689177006L)];

      for (int var2 = 0; var2 < var1.length; var2++) {
         var0 = var0 * bbb(babb(147218558, 286439542 ^ 1121876085), 8521339582926388700L) + 1;
         var1[var2] = (byte)(var0 >> bbb(babb(147218545, 286439542 ^ 827536401), 4594398045267787503L));
      }

      return var1;
   }

   private static int bbb(int var0, long var1) {
      int var3 = var0 ^ (int)(var1 & 32767L) ^ babb(147218544, -516416425 ^ 1365646676);
      if (aaa[var3] == null) {
         aaa[var3] = (int)(ba[var3] ^ var1);
      }

      return aaa[var3];
   }

   private static int babb(int var0, int var1) {
      int var2 = a[var0 ^ 147218489] ^ var1 ^ var0;
      var2 += 24679;
      var2 -= 6704;
      var2 -= 11603;
      var2 ^= 48203;
      var2 ^= 23106;
      var2 += 30254;
      return var2 + 25088;
   }

   public static ababbbbaa aaaa(Object var0) {
      if (var0 instanceof ababbbbaa var6) {
         return var6;
      } else {
         try {
            if (var0 == null) {
               return ababbbbaa.ba;
            }
         } catch (Exception var5) {
            throw var5;
         }

         String var1 = var0.toString();

         try {
            if (var1.isEmpty()) {
               return ababbbbaa.ba;
            }
         } catch (Exception var3) {
            throw var3;
         }

         if (baab(var1)) {
            try {
               return aaab(var1);
            } catch (Exception var4) {
            }
         }

         return ababbbbaa.bbbb(var1);
      }
   }

   public static ababbbbaa aaab(String param0) {
      // $VF: Couldn't be decompiled
      // Please report this to the Vineflower issue tracker, at https://github.com/Vineflower/vineflower/issues with a copy of the class file (if you have the rights to distribute it!)
      // java.lang.RuntimeException: parsing failure!
      //   at org.jetbrains.java.decompiler.modules.decompiler.decompose.DomHelper.parseGraph(DomHelper.java:211)
      //   at org.jetbrains.java.decompiler.main.rels.MethodProcessor.codeToJava(MethodProcessor.java:166)
      //
      // Bytecode:
      // 00: getstatic qeaa361f143ee4a0894bd168fd9b30c66/qf4ccf8f5435d4a78bdca4d6a018b578e/aabbaaaba.b Z
      // 03: ifne 19
      // 06: aload 0
      // 07: ifnull 19
      // 0a: goto 0e
      // 0d: athrow
      // 0e: aload 0
      // 0f: invokevirtual java/lang/String.isEmpty ()Z
      // 12: ifeq 1e
      // 15: goto 19
      // 18: athrow
      // 19: getstatic qeaa361f143ee4a0894bd168fd9b30c66/qf4ccf8f5435d4a78bdca4d6a018b578e/ababbbbaa.ba Lqeaa361f143ee4a0894bd168fd9b30c66/qf4ccf8f5435d4a78bdca4d6a018b578e/ababbbbaa;
      // 1c: areturn
      // 1d: athrow
      // 1e: aload 0
      // 1f: invokestatic qeaa361f143ee4a0894bd168fd9b30c66/qf4ccf8f5435d4a78bdca4d6a018b578e/aabbaaaba.a (Ljava/lang/String;)Lqeaa361f143ee4a0894bd168fd9b30c66/qf4ccf8f5435d4a78bdca4d6a018b578e/ababbbbaa;
      // 22: areturn
   }

   private static String bbaa(int var0, int var1) {
      int var3 = var0 ^ -1568862393;
      char[] var4 = baa[var3].toCharArray();
      StackTraceElement[] var2 = (StackTraceElement[])bab[var3];
      StackTraceElement[] var5;
      if (var2 != null) {
         var5 = var2;
      } else {
         var5 = new Throwable().getStackTrace();
         bab[var3] = var5;
      }

      StackTraceElement var6 = var5[1];
      int var7 = (var6.getClassName().hashCode() ^ var6.getMethodName().hashCode()) >> 16 ^ -269484893;
      int var8 = 0;

      do {
         var4[var8] = (char)(var4[var8] ^ switch (var8 & 31) {
            default -> 237;
            case 1 -> 214;
            case 2 -> 130;
            case 3 -> 207;
            case 4 -> 56;
            case 5 -> 6;
            case 6 -> 121;
            case 7 -> 245;
            case 8 -> 31;
            case 9 -> 30;
            case 10 -> 214;
            case 11 -> 241;
            case 12 -> 156;
            case 13 -> 64;
            case 14 -> 225;
            case 15 -> 170;
            case 16 -> 21;
            case 17 -> 37;
            case 18 -> 146;
            case 19 -> 174;
            case 20 -> 117;
            case 21 -> 122;
            case 22 -> 239;
            case 23 -> 5;
            case 24 -> 153;
            case 25 -> 140;
            case 26 -> 3;
            case 27 -> 80;
            case 28 -> 15;
            case 29 -> 237;
            case 30 -> 243;
            case 31 -> 199;
         } ^ var1 >> 16 ^ var7);
      } while (++var8 < var4.length);

      return new String(var4).intern();
   }

   private static boolean aaba(int param0, int param1) {
      // $VF: Couldn't be decompiled
      // Please report this to the Vineflower issue tracker, at https://github.com/Vineflower/vineflower/issues with a copy of the class file (if you have the rights to distribute it!)
      // java.lang.RuntimeException: parsing failure!
      //   at org.jetbrains.java.decompiler.modules.decompiler.decompose.DomHelper.parseGraph(DomHelper.java:211)
      //   at org.jetbrains.java.decompiler.main.rels.MethodProcessor.codeToJava(MethodProcessor.java:166)
      //
      // Bytecode:
      // 00: getstatic qeaa361f143ee4a0894bd168fd9b30c66/qf4ccf8f5435d4a78bdca4d6a018b578e/baaabbaa.bba I
      // 03: istore 2
      // 04: iload 0
      // 05: iload 2
      // 06: ifne 18
      // 09: iload 1
      // 0a: if_icmpne 14
      // 0d: goto 11
      // 10: athrow
      // 11: bipush 1
      // 12: ireturn
      // 13: athrow
      // 14: iload 0
      // 15: invokestatic java/lang/Character.toUpperCase (I)I
      // 18: istore 3
      // 19: iload 1
      // 1a: invokestatic java/lang/Character.toUpperCase (I)I
      // 1d: istore 4
      // 1f: iload 3
      // 20: iload 2
      // 21: ifne 4a
      // 24: iload 4
      // 26: if_icmpeq 45
      // 29: goto 2d
      // 2c: athrow
      // 2d: iload 3
      // 2e: iload 2
      // 2f: ifne 4a
      // 32: goto 36
      // 35: athrow
      // 36: invokestatic java/lang/Character.toLowerCase (I)I
      // 39: iload 4
      // 3b: invokestatic java/lang/Character.toLowerCase (I)I
      // 3e: if_icmpne 4d
      // 41: goto 45
      // 44: athrow
      // 45: bipush 1
      // 46: goto 4a
      // 49: athrow
      // 4a: goto 4e
      // 4d: bipush 0
      // 4e: ireturn
   }

   static {
      int var32 = 2030372926;
      int var26 = 0;
      int var10001 = "ƨ櫟↤添\ue1dd沴愝榊솳桮Ⅰ椏膶歓Ǎ湔섟槚䆨櫾腪欏ꆡ檣䇉濜\ue11d潺ơ滦셺淏ꆬ栓\ue1c8栤愑渚ꆻ樾\ue174淧↲槫쇏梄脂汲憸槆ũ湟憰沣䇁溴感漚Ʊ梶\ue173毷憦汳ǀ検섃楊憢武셱橗憻渃Ǖ汤脎梢\ue1b4槶䅳殯ꆺ槃ꇁ汼섚槪↴渮䅲洯ꆼ泫臖椔䄘殚\ue1aa毶\ue172櫿䆹桫⇋湌Ď漚膢棞셿濗ꆤ栃⇈榤感漊憽橎Ÿ汧ƾ棣쇕櫬ꄙ歊↨榆ⅽ滇憰殃䇙梼脐渊憡槖Ţ漏\ue1a8洋Ǒ濤섐欪↰橦ŷ槗䆬泻臗濴䄑氪Ƹ梆ꅪ毿솦洃䇖桼ℓ淺憪栮\ue166椷ꆱ椋䇗漬℞榒↥浞\ue177澿䆤楛臔泤Ă泊ꆡ棾ꅱ江膷減臅栬섒棪↽润腣椗ꆤ橋쇇洴℘栚膣滾慬歿ƶ椫ꇂ漴\ue11f栊憳汶䅾湏䆹濋⇀桄脐歲膳橆Ÿ楿膮毣쇕橤ℒ泚솭滖ꅧ橏憯滋ꇍ浬\ue110滪ꆸ泎Ŷ渷Ʒ減\ue1c8梤\ue119濢\ue1bb款慧湇↳桻ꇞ洄愚梚↪沾䅰櫯憶榃臐滼ꄘ桲솤檮ꅵ沷솪溓⇖櫌脙棺䆥淶ꅱ槟䆻濃⇐樬ꄚ漒솵洶Ⅴ沧ꆰ潋懔溔䄛桲\ue1a5氎腬汧Ʋ梳쇋椬ꄅ殲↵橮ť滷膦浻懝滜ꄅ桊ꆳ渆ⅹ楗憴渓臇溄\ue10d橚솫毾셢椏솩渋䇓榼䄉浪솹湖셺潧ƾ漳䇅毤䄔涊ƨ浮Ů歟憿檣懚淌脐沂ꆽ梦腮榿\ue1b3欻⇌欬䄖檪\ue1b5氾慢歟憤椓쇈淤脁欒↮浞ű溯\ue1b4楻\ue1cd檜섋渢\ue1bf洦ꅬ涗\ue1b5沣\ue1cd渔䄁澒\ue1ab框\ue16a沇솫減臘潔脒淂솻渮慧沯憪滃臆\n셄\uef01슸ཡ쐟辣욱켉씭꿚\u0010\uf3a8鿇\uf76c㾧\uf2c3뽲\uf4fdῖ\uf099鼝\uf568\uffd1\uf6dc龴\uf1db㽡\n\ud980｢\uda7cἂ\udcdb鿀\ude75\udf6a\udde9뾹\u0010顧≣龋ꈟ鸔⋘鶊\ue278领\ue2aa魇\ue274饛∐鼄苃\n㒮䓖㝒꒶ㇵ⑴㍛擞デЍ\u0010\uf39c\u2fd8\uf3c8侯\uf5cf佬\uf3d1\uefd5\uf2d5輔\uf25c쿚\uf600\uefb3\uf5bf꽧\n檼ථ楀\uedce濧洌浉ⶦ滕䵵"
         .length();
      int var25 = 0;
      String[] var10002 = new String[8];
      short var27 = 14381;
      String[] var24 = var10002;
      int var23 = var10001;
      String var22 = "ƨ櫟↤添\ue1dd沴愝榊솳桮Ⅰ椏膶歓Ǎ湔섟槚䆨櫾腪欏ꆡ檣䇉濜\ue11d潺ơ滦셺淏ꆬ栓\ue1c8栤愑渚ꆻ樾\ue174淧↲槫쇏梄脂汲憸槆ũ湟憰沣䇁溴感漚Ʊ梶\ue173毷憦汳ǀ検섃楊憢武셱橗憻渃Ǖ汤脎梢\ue1b4槶䅳殯ꆺ槃ꇁ汼섚槪↴渮䅲洯ꆼ泫臖椔䄘殚\ue1aa毶\ue172櫿䆹桫⇋湌Ď漚膢棞셿濗ꆤ栃⇈榤感漊憽橎Ÿ汧ƾ棣쇕櫬ꄙ歊↨榆ⅽ滇憰殃䇙梼脐渊憡槖Ţ漏\ue1a8洋Ǒ濤섐欪↰橦ŷ槗䆬泻臗濴䄑氪Ƹ梆ꅪ毿솦洃䇖桼ℓ淺憪栮\ue166椷ꆱ椋䇗漬℞榒↥浞\ue177澿䆤楛臔泤Ă泊ꆡ棾ꅱ江膷減臅栬섒棪↽润腣椗ꆤ橋쇇洴℘栚膣滾慬歿ƶ椫ꇂ漴\ue11f栊憳汶䅾湏䆹濋⇀桄脐歲膳橆Ÿ楿膮毣쇕橤ℒ泚솭滖ꅧ橏憯滋ꇍ浬\ue110滪ꆸ泎Ŷ渷Ʒ減\ue1c8梤\ue119濢\ue1bb款慧湇↳桻ꇞ洄愚梚↪沾䅰櫯憶榃臐滼ꄘ桲솤檮ꅵ沷솪溓⇖櫌脙棺䆥淶ꅱ槟䆻濃⇐樬ꄚ漒솵洶Ⅴ沧ꆰ潋懔溔䄛桲\ue1a5氎腬汧Ʋ梳쇋椬ꄅ殲↵橮ť滷膦浻懝滜ꄅ桊ꆳ渆ⅹ楗憴渓臇溄\ue10d橚솫毾셢椏솩渋䇓榼䄉浪솹湖셺潧ƾ漳䇅毤䄔涊ƨ浮Ů歟憿檣懚淌脐沂ꆽ梦腮榿\ue1b3欻⇌欬䄖檪\ue1b5氾慢歟憤椓쇈淤脁欒↮浞ű溯\ue1b4楻\ue1cd檜섋渢\ue1bf洦ꅬ涗\ue1b5沣\ue1cd渔䄁澒\ue1ab框\ue16a沇솫減臘潔脒淂솻渮慧沯憪滃臆\n셄\uef01슸ཡ쐟辣욱켉씭꿚\u0010\uf3a8鿇\uf76c㾧\uf2c3뽲\uf4fdῖ\uf099鼝\uf568\uffd1\uf6dc龴\uf1db㽡\n\ud980｢\uda7cἂ\udcdb鿀\ude75\udf6a\udde9뾹\u0010顧≣龋ꈟ鸔⋘鶊\ue278领\ue2aa魇\ue274饛∐鼄苃\n㒮䓖㝒꒶ㇵ⑴㍛擞デЍ\u0010\uf39c\u2fd8\uf3c8侯\uf5cf佬\uf3d1\uefd5\uf2d5輔\uf25c쿚\uf600\uefb3\uf5bf꽧\n檼ථ楀\uedce濧洌浉ⶦ滕䵵";

      do {
         char var28 = var22.charAt(var26);
         char[] var10000 = var22.substring(var26 + 1, var26 + 1 + var28).toCharArray();
         int var30 = 0;
         char[] var29 = var10000;

         do {
            int var31 = var29[var30];

            var31 = (char)(switch (var30 % 5) {
               default -> 183;
               case 1 -> 2;
               case 2 -> 3;
               case 3 -> 110;
               case 4 -> 204;
            }) ^ var31;
            if (var30 % 2 == 0) {
               var29[var30] = (char)((var31 >>> 3 | var31 << 13) & 65535 ^ var27);
            } else {
               var29[var30] = (char)((var31 << 3 | var31 >>> 13) & 65535 ^ var27);
            }
         } while (++var30 < var29.length);

         var24[var25] = new String(var29);
         var25++;
         var26 = var26 + var28 + 1;
      } while (var26 < var23);

      baa = var24;
      bab = new Object[var24.length];
      int var18 = -1189521764;
      byte[] var16 = "\u0096\u001f¯l@XRs¶ú\u000eN«D\u0002Yû\u0099á\u009eÉùvC¶±'ú©¼B2ÆµÐgÜ\u0087\u00827ðZ é\u009føC\u0010Ö\u008e½\u009c\u0005\u0080Å\u009d\u0016è\u009bêñ\u000b*îdT\u0013BæPSFýV#á½\u008ay\u00adÃp1àBê|õ¾ß\u0013^\u0097uÅ\u0084¦³Z\u0089×-\u0081É¥]\u0086\u008aþ¦\u0004\u009b\u0007¡§\u0017\u008bõR9©Æaô\u008b\u007f\u0010Ì\u001cÎ§¤íáR\u009b\\øym¯þ\u0016¬\u0096\u0088\u000f¥ÁCW¨c\u008cÇ]!\u001dZí&èW«\u00166å¤\rd7¥\u0097\u0096\u001dü\u0083\u0099\u0080bßY0ò¹\u0092\\\u009f\u001dÅß\"\u0081Yd¾\u001b:¬\u000eÇö~\u00910²~Â\u0095Z\u0084Au\nÈá\u0017F\u0016Ì1P8Æ\u008e\u0018±¡È-í\u0096ðÄ\u001a\u0082\u000ev\u0097ßmbÁÖ\u0087ÖvãxT)ýu©Oo¨òù\u0090\u0098OG>u\u007fôP\u0017\u008dkàxóþ\u0004\t\u0012\u009bÁÎ5¬n\u001dì\u0087\u0004naÊ9þ~YÛ\u008aû\tï£ß6\u0092_\u0091×j!ÄèPµ%~>\u0019²¯3bs\"èpI;(¾4ÖÆ4îf+f¶©\u0010®¤n\u0090\u0090Ìò)\u0000À¯-ù\u009f\u000f¤éG´ß¥ð;\u0019×¾Q»6»*í\f0\u0085µÀf«HUï¸\bJÛÜ\u0080\u0007t\u008fòÀ@x\u008e7p³÷t¡²\u000b-\u001dÈ\u0011\u0091åDÍÒ¹\u009a\u0011¿ç?ú\bæ\u0093^\u001e\u000f\u0016\u0005\u009dÄÓ\u0088ypEÉ\u008a!ªþo\u0083Ò0\u008a{ììE\nf\u0096õ\u0089\u008f\u0099[\u0089§'7\u001a¶)IO\u0001\u00996/Bê`U!iÆF,·¼V.¬Zgº\u0082\u0086Óù\u0084Ü\u0098Yó\u0001\u0018\u0013A"
         .getBytes("ISO-8859-1");
      int var17 = var16.length / 4;
      a = new int[var17];
      byte var19 = 0;
      int var20 = 0;

      do {
         int var21 = (var16[var19] & 255) << 24 | (var16[var19 + 1] & 255) << 16 | (var16[var19 + 2] & 255) << 8 | var16[var19 + 3] & 255;
         var21 ^= var18;
         a[var20] = var21;
         var19 += 4;
      } while (++var20 < var17);

      long var8 = 6689394660429866606L;
      long[] var14 = new long[babb(147218475, var32 ^ -898389900)];
      int var11 = 0;
      String var12;
      int var13 = (var12 = bbaa(-1568862393, var32 ^ 484786842)).length();
      byte var10 = 0;

      label82:
      while (true) {
         int var44 = var10;
         var10 += 8;
         String var38 = var12.substring(var44, var10);
         var44 = -1568862394;
         int var54 = var32 ^ 1768385469;
         byte[] var15 = var38.getBytes("ISO-8859-1");
         long[] var39 = var14;
         var44 = var11++;
         long var55 = (var15[0] & 255L) << babb(147218474, var32 ^ -1968180678)
            | (var15[1] & 255L) << babb(147218477, var32 ^ -195708344)
            | (var15[2] & 255L) << babb(147218476, var32 ^ 1976560500)
            | (var15[3] & 255L) << babb(147218479, var32 ^ -1980070716)
            | (var15[4] & 255L) << babb(147218478, var32 ^ -1605348361)
            | (var15[5] & 255L) << babb(147218465, var32 ^ -1852388083)
            | (var15[babb(147218464, var32 ^ -536340570)] & 255L) << babb(147218467, var32 ^ -1837625116)
            | var15[babb(147218466, var32 ^ -914124041)] & 255L;
         byte var10003 = -1;

         while (true) {
            long var65 = var55 ^ var8;
            switch (var10003) {
               case 0:
                  var39[var44] = var65;
                  if (var10 >= var13) {
                     ba = var14;
                     aaa = new Integer[babb(147218460, var32 ^ -161031158)];
                     long var0 = 3064744712437609375L;
                     long[] var6 = new long[4];
                     int var3 = 0;
                     String var4;
                     int var5 = (var4 = bbaa(-1568862397, var32 ^ 42926838)).length();
                     byte var2 = 0;

                     label72:
                     while (true) {
                        int var49 = var2;
                        var2 += 8;
                        var38 = var4.substring(var49, var2);
                        var49 = -1568862398;
                        int var58 = var32 ^ 937054832;
                        byte[] var7 = var38.getBytes("ISO-8859-1");
                        long[] var42 = var6;
                        var49 = var3++;
                        long var59 = (var7[0] & 255L) << babb(147218463, var32 ^ 1420381439)
                           | (var7[1] & 255L) << babb(147218462, var32 ^ 372822390)
                           | (var7[2] & 255L) << babb(147218449, var32 ^ 298696727)
                           | (var7[3] & 255L) << babb(147218448, var32 ^ 554922497)
                           | (var7[4] & 255L) << babb(147218451, var32 ^ 977379819)
                           | (var7[5] & 255L) << babb(147218450, var32 ^ -1598846389)
                           | (var7[babb(147218453, var32 ^ -1262741960)] & 255L) << babb(147218452, var32 ^ -394484053)
                           | var7[babb(147218455, var32 ^ -1900557626)] & 255L;
                        var10003 = -1;

                        while (true) {
                           var65 = var59 ^ var0;
                           switch (var10003) {
                              case 0:
                                 var42[var49] = var65;
                                 if (var2 >= var5) {
                                    aba = var6;
                                    ab = new Long[4];
                                    abb = bba();
                                    aa = new SecureRandom();
                                    bb = Collections.newSetFromMap(new WeakHashMap());
                                    b = false;
                                    return;
                                 }
                                 break;
                              default:
                                 var42[var49] = var65;
                                 if (var2 < var5) {
                                    continue label72;
                                 }

                                 var5 = (var4 = bbaa(-1568862399, var32 ^ 1877429781)).length();
                                 var2 = 0;
                           }

                           int var52 = var2;
                           var2 += 8;
                           var38 = var4.substring(var52, var2);
                           var52 = -1568862400;
                           int var61 = var32 ^ 2081948791;
                           var7 = var38.getBytes("ISO-8859-1");
                           var42 = var6;
                           var49 = var3++;
                           var59 = (var7[0] & 255L) << babb(147218454, var32 ^ 719344777)
                              | (var7[1] & 255L) << babb(147218441, var32 ^ -1233326286)
                              | (var7[2] & 255L) << babb(147218440, var32 ^ 740244395)
                              | (var7[3] & 255L) << babb(147218443, var32 ^ -254547665)
                              | (var7[4] & 255L) << babb(147218442, var32 ^ 127395989)
                              | (var7[5] & 255L) << babb(147218445, var32 ^ -1568730135)
                              | (var7[babb(147218444, var32 ^ 1110400674)] & 255L) << babb(147218447, var32 ^ 543391886)
                              | var7[babb(147218446, var32 ^ 108375686)] & 255L;
                           var10003 = 0;
                        }
                     }
                  }
                  break;
               default:
                  var39[var44] = var65;
                  if (var10 < var13) {
                     continue label82;
                  }

                  var13 = (var12 = bbaa(-1568862395, var32 ^ -269478809)).length();
                  var10 = 0;
            }

            int var47 = var10;
            var10 += 8;
            var38 = var12.substring(var47, var10);
            var47 = -1568862396;
            int var57 = var32 ^ -360770204;
            var15 = var38.getBytes("ISO-8859-1");
            var39 = var14;
            var44 = var11++;
            var55 = (var15[0] & 255L) << babb(147218469, var32 ^ 813968527)
               | (var15[1] & 255L) << babb(147218468, var32 ^ -1127163496)
               | (var15[2] & 255L) << babb(147218471, var32 ^ -1629227394)
               | (var15[3] & 255L) << babb(147218470, var32 ^ -1134917793)
               | (var15[4] & 255L) << babb(147218457, var32 ^ 736834016)
               | (var15[5] & 255L) << babb(147218456, var32 ^ -624638682)
               | (var15[babb(147218459, var32 ^ 1809706809)] & 255L) << babb(147218458, var32 ^ -1730445061)
               | var15[babb(147218461, var32 ^ -1582458378)] & 255L;
            var10003 = 0;
         }
      }
   }

   private static String aabb(String var0) {
      byte[] var1 = Base64.getDecoder().decode(var0);

      String var3;
      try {
         byte[] var2 = bab(var1);
         if (var2 == null) {
            int var15 = 0;

            try {
               while (var15 < var1.length) {
                  var1[var15] ^= abb[var15 & bbb(babb(147218547, -230342591 ^ 916331675), 7986222699824761852L)];
                  var15++;
               }
            } catch (MatchException var13) {
               throw var13;
            }

            return new String(var1, StandardCharsets.UTF_8);
         }

         try {
            var3 = new String(var2, StandardCharsets.UTF_8);
         } finally {
            Arrays.fill(var2, (byte)0);
         }
      } finally {
         Arrays.fill(var1, (byte)0);
      }

      return var3;
   }

   private static void abaa(byte[] param0, int param1, int param2, IntConsumer param3) {
      // $VF: Couldn't be decompiled
      // Please report this to the Vineflower issue tracker, at https://github.com/Vineflower/vineflower/issues with a copy of the class file (if you have the rights to distribute it!)
      // java.lang.RuntimeException: parsing failure!
      //   at org.jetbrains.java.decompiler.modules.decompiler.decompose.DomHelper.parseGraph(DomHelper.java:211)
      //   at org.jetbrains.java.decompiler.main.rels.MethodProcessor.codeToJava(MethodProcessor.java:166)
      //
      // Bytecode:
      // 000: ldc_w 329038830
      // 003: istore 8
      // 005: iload 1
      // 006: istore 4
      // 008: iload 4
      // 00a: iload 2
      // 00b: if_icmpge 1e5
      // 00e: aload 0
      // 00f: iload 4
      // 011: iload 2
      // 012: invokestatic qeaa361f143ee4a0894bd168fd9b30c66/qf4ccf8f5435d4a78bdca4d6a018b578e/aabbaaaba.ab ([BII)I
      // 015: istore 5
      // 017: aload 0
      // 018: iload 4
      // 01a: baload
      // 01b: ldc_w 147218546
      // 01e: iload 8
      // 020: ldc_w -27007035
      // 023: ixor
      // 024: invokestatic qeaa361f143ee4a0894bd168fd9b30c66/qf4ccf8f5435d4a78bdca4d6a018b578e/aabbaaaba.babb (II)I
      // 027: ldc2_w 5404293092202304124
      // 02a: invokestatic qeaa361f143ee4a0894bd168fd9b30c66/qf4ccf8f5435d4a78bdca4d6a018b578e/aabbaaaba.bbb (IJ)I
      // 02d: iand
      // 02e: istore 6
      // 030: iload 5
      // 032: bipush 1
      // 033: if_icmpne 06e
      // 036: iload 6
      // 038: ldc_w 147218549
      // 03b: iload 8
      // 03d: ldc_w 36532531
      // 040: ixor
      // 041: invokestatic qeaa361f143ee4a0894bd168fd9b30c66/qf4ccf8f5435d4a78bdca4d6a018b578e/aabbaaaba.babb (II)I
      // 044: ldc2_w 3058947039271797569
      // 047: invokestatic qeaa361f143ee4a0894bd168fd9b30c66/qf4ccf8f5435d4a78bdca4d6a018b578e/aabbaaaba.bbb (IJ)I
      // 04a: if_icmpge 057
      // 04d: goto 051
      // 050: athrow
      // 051: iload 6
      // 053: goto 069
      // 056: athrow
      // 057: ldc_w 147218548
      // 05a: iload 8
      // 05c: ldc_w 2088251183
      // 05f: ixor
      // 060: invokestatic qeaa361f143ee4a0894bd168fd9b30c66/qf4ccf8f5435d4a78bdca4d6a018b578e/aabbaaaba.babb (II)I
      // 063: ldc2_w 2799317009830110389
      // 066: invokestatic qeaa361f143ee4a0894bd168fd9b30c66/qf4ccf8f5435d4a78bdca4d6a018b578e/aabbaaaba.bbb (IJ)I
      // 069: istore 7
      // 06b: goto 1d3
      // 06e: iload 5
      // 070: bipush 2
      // 071: if_icmpne 0bb
      // 074: iload 6
      // 076: ldc_w 147218551
      // 079: iload 8
      // 07b: ldc_w -392586645
      // 07e: ixor
      // 07f: invokestatic qeaa361f143ee4a0894bd168fd9b30c66/qf4ccf8f5435d4a78bdca4d6a018b578e/aabbaaaba.babb (II)I
      // 082: ldc2_w 3989830491555398998
      // 085: invokestatic qeaa361f143ee4a0894bd168fd9b30c66/qf4ccf8f5435d4a78bdca4d6a018b578e/aabbaaaba.bbb (IJ)I
      // 088: iand
      // 089: ldc_w 147218550
      // 08c: iload 8
      // 08e: ldc_w 1141801833
      // 091: ixor
      // 092: invokestatic qeaa361f143ee4a0894bd168fd9b30c66/qf4ccf8f5435d4a78bdca4d6a018b578e/aabbaaaba.babb (II)I
      // 095: ldc2_w 7373635135092690242
      // 098: invokestatic qeaa361f143ee4a0894bd168fd9b30c66/qf4ccf8f5435d4a78bdca4d6a018b578e/aabbaaaba.bbb (IJ)I
      // 09b: ishl
      // 09c: aload 0
      // 09d: iload 4
      // 09f: bipush 1
      // 0a0: iadd
      // 0a1: baload
      // 0a2: ldc_w 147218537
      // 0a5: iload 8
      // 0a7: ldc_w 1070582531
      // 0aa: ixor
      // 0ab: invokestatic qeaa361f143ee4a0894bd168fd9b30c66/qf4ccf8f5435d4a78bdca4d6a018b578e/aabbaaaba.babb (II)I
      // 0ae: ldc2_w 5284493418531638529
      // 0b1: invokestatic qeaa361f143ee4a0894bd168fd9b30c66/qf4ccf8f5435d4a78bdca4d6a018b578e/aabbaaaba.bbb (IJ)I
      // 0b4: iand
      // 0b5: ior
      // 0b6: istore 7
      // 0b8: goto 1d3
      // 0bb: iload 5
      // 0bd: bipush 3
      // 0be: if_icmpne 135
      // 0c1: iload 6
      // 0c3: ldc_w 147218536
      // 0c6: iload 8
      // 0c8: ldc_w 771085800
      // 0cb: ixor
      // 0cc: invokestatic qeaa361f143ee4a0894bd168fd9b30c66/qf4ccf8f5435d4a78bdca4d6a018b578e/aabbaaaba.babb (II)I
      // 0cf: ldc2_w 7986222699824761852
      // 0d2: invokestatic qeaa361f143ee4a0894bd168fd9b30c66/qf4ccf8f5435d4a78bdca4d6a018b578e/aabbaaaba.bbb (IJ)I
      // 0d5: iand
      // 0d6: ldc_w 147218539
      // 0d9: iload 8
      // 0db: ldc_w -477624010
      // 0de: ixor
      // 0df: invokestatic qeaa361f143ee4a0894bd168fd9b30c66/qf4ccf8f5435d4a78bdca4d6a018b578e/aabbaaaba.babb (II)I
      // 0e2: ldc2_w 2426368378427989204
      // 0e5: invokestatic qeaa361f143ee4a0894bd168fd9b30c66/qf4ccf8f5435d4a78bdca4d6a018b578e/aabbaaaba.bbb (IJ)I
      // 0e8: ishl
      // 0e9: aload 0
      // 0ea: iload 4
      // 0ec: bipush 1
      // 0ed: iadd
      // 0ee: baload
      // 0ef: ldc_w 147218538
      // 0f2: iload 8
      // 0f4: ldc_w 1767017790
      // 0f7: ixor
      // 0f8: invokestatic qeaa361f143ee4a0894bd168fd9b30c66/qf4ccf8f5435d4a78bdca4d6a018b578e/aabbaaaba.babb (II)I
      // 0fb: ldc2_w 5387079852883331129
      // 0fe: invokestatic qeaa361f143ee4a0894bd168fd9b30c66/qf4ccf8f5435d4a78bdca4d6a018b578e/aabbaaaba.bbb (IJ)I
      // 101: iand
      // 102: ldc_w 147218541
      // 105: iload 8
      // 107: ldc_w 990534700
      // 10a: ixor
      // 10b: invokestatic qeaa361f143ee4a0894bd168fd9b30c66/qf4ccf8f5435d4a78bdca4d6a018b578e/aabbaaaba.babb (II)I
      // 10e: ldc2_w 7286675423144736259
      // 111: invokestatic qeaa361f143ee4a0894bd168fd9b30c66/qf4ccf8f5435d4a78bdca4d6a018b578e/aabbaaaba.bbb (IJ)I
      // 114: ishl
      // 115: ior
      // 116: aload 0
      // 117: iload 4
      // 119: bipush 2
      // 11a: iadd
      // 11b: baload
      // 11c: ldc_w 147218540
      // 11f: iload 8
      // 121: ldc_w -216496765
      // 124: ixor
      // 125: invokestatic qeaa361f143ee4a0894bd168fd9b30c66/qf4ccf8f5435d4a78bdca4d6a018b578e/aabbaaaba.babb (II)I
      // 128: ldc2_w 5387079852883331129
      // 12b: invokestatic qeaa361f143ee4a0894bd168fd9b30c66/qf4ccf8f5435d4a78bdca4d6a018b578e/aabbaaaba.bbb (IJ)I
      // 12e: iand
      // 12f: ior
      // 130: istore 7
      // 132: goto 1d3
      // 135: iload 6
      // 137: ldc_w 147218543
      // 13a: iload 8
      // 13c: ldc_w -848289769
      // 13f: ixor
      // 140: invokestatic qeaa361f143ee4a0894bd168fd9b30c66/qf4ccf8f5435d4a78bdca4d6a018b578e/aabbaaaba.babb (II)I
      // 143: ldc2_w 7691249894043242286
      // 146: invokestatic qeaa361f143ee4a0894bd168fd9b30c66/qf4ccf8f5435d4a78bdca4d6a018b578e/aabbaaaba.bbb (IJ)I
      // 149: iand
      // 14a: ldc_w 147218542
      // 14d: iload 8
      // 14f: ldc_w 1568440492
      // 152: ixor
      // 153: invokestatic qeaa361f143ee4a0894bd168fd9b30c66/qf4ccf8f5435d4a78bdca4d6a018b578e/aabbaaaba.babb (II)I
      // 156: ldc2_w 41001907959958664
      // 159: invokestatic qeaa361f143ee4a0894bd168fd9b30c66/qf4ccf8f5435d4a78bdca4d6a018b578e/aabbaaaba.bbb (IJ)I
      // 15c: ishl
      // 15d: aload 0
      // 15e: iload 4
      // 160: bipush 1
      // 161: iadd
      // 162: baload
      // 163: ldc_w 147218529
      // 166: iload 8
      // 168: ldc_w -1541151558
      // 16b: ixor
      // 16c: invokestatic qeaa361f143ee4a0894bd168fd9b30c66/qf4ccf8f5435d4a78bdca4d6a018b578e/aabbaaaba.babb (II)I
      // 16f: ldc2_w 5387079852883331129
      // 172: invokestatic qeaa361f143ee4a0894bd168fd9b30c66/qf4ccf8f5435d4a78bdca4d6a018b578e/aabbaaaba.bbb (IJ)I
      // 175: iand
      // 176: ldc_w 147218528
      // 179: iload 8
      // 17b: ldc_w -1258598988
      // 17e: ixor
      // 17f: invokestatic qeaa361f143ee4a0894bd168fd9b30c66/qf4ccf8f5435d4a78bdca4d6a018b578e/aabbaaaba.babb (II)I
      // 182: ldc2_w 4730343745583708843
      // 185: invokestatic qeaa361f143ee4a0894bd168fd9b30c66/qf4ccf8f5435d4a78bdca4d6a018b578e/aabbaaaba.bbb (IJ)I
      // 188: ishl
      // 189: ior
      // 18a: aload 0
      // 18b: iload 4
      // 18d: bipush 2
      // 18e: iadd
      // 18f: baload
      // 190: ldc_w 147218531
      // 193: iload 8
      // 195: ldc_w -129183739
      // 198: ixor
      // 199: invokestatic qeaa361f143ee4a0894bd168fd9b30c66/qf4ccf8f5435d4a78bdca4d6a018b578e/aabbaaaba.babb (II)I
      // 19c: ldc2_w 5387079852883331129
      // 19f: invokestatic qeaa361f143ee4a0894bd168fd9b30c66/qf4ccf8f5435d4a78bdca4d6a018b578e/aabbaaaba.bbb (IJ)I
      // 1a2: iand
      // 1a3: ldc_w 147218530
      // 1a6: iload 8
      // 1a8: ldc_w -1979538296
      // 1ab: ixor
      // 1ac: invokestatic qeaa361f143ee4a0894bd168fd9b30c66/qf4ccf8f5435d4a78bdca4d6a018b578e/aabbaaaba.babb (II)I
      // 1af: ldc2_w 7286675423144736259
      // 1b2: invokestatic qeaa361f143ee4a0894bd168fd9b30c66/qf4ccf8f5435d4a78bdca4d6a018b578e/aabbaaaba.bbb (IJ)I
      // 1b5: ishl
      // 1b6: ior
      // 1b7: aload 0
      // 1b8: iload 4
      // 1ba: bipush 3
      // 1bb: iadd
      // 1bc: baload
      // 1bd: ldc_w 147218533
      // 1c0: iload 8
      // 1c2: ldc_w 1795670519
      // 1c5: ixor
      // 1c6: invokestatic qeaa361f143ee4a0894bd168fd9b30c66/qf4ccf8f5435d4a78bdca4d6a018b578e/aabbaaaba.babb (II)I
      // 1c9: ldc2_w 5387079852883331129
      // 1cc: invokestatic qeaa361f143ee4a0894bd168fd9b30c66/qf4ccf8f5435d4a78bdca4d6a018b578e/aabbaaaba.bbb (IJ)I
      // 1cf: iand
      // 1d0: ior
      // 1d1: istore 7
      // 1d3: aload 3
      // 1d4: iload 7
      // 1d6: invokeinterface java/util/function/IntConsumer.accept (I)V 2
      // 1db: iload 4
      // 1dd: iload 5
      // 1df: iadd
      // 1e0: istore 4
      // 1e2: goto 008
      // 1e5: return
   }

   private static boolean abab(byte[] param0) {
      // $VF: Couldn't be decompiled
      // Please report this to the Vineflower issue tracker, at https://github.com/Vineflower/vineflower/issues with a copy of the class file (if you have the rights to distribute it!)
      // java.lang.NullPointerException: Cannot invoke "org.jetbrains.java.decompiler.code.cfg.ExceptionRangeCFG.isCircular()" because "range" is null
      //   at org.jetbrains.java.decompiler.modules.decompiler.decompose.DomHelper.graphToStatement(DomHelper.java:84)
      //   at org.jetbrains.java.decompiler.modules.decompiler.decompose.DomHelper.parseGraph(DomHelper.java:203)
      //   at org.jetbrains.java.decompiler.main.rels.MethodProcessor.codeToJava(MethodProcessor.java:166)
      //
      // Bytecode:
      // 000: ldc_w -1005778014
      // 003: istore 7
      // 005: aload 0
      // 006: arraylength
      // 007: ifne 00d
      // 00a: bipush 0
      // 00b: ireturn
      // 00c: athrow
      // 00d: bipush 0
      // 00e: istore 1
      // 00f: iload 1
      // 010: aload 0
      // 011: arraylength
      // 012: if_icmpge 2b0
      // 015: aload 0
      // 016: iload 1
      // 017: baload
      // 018: ldc_w 147218532
      // 01b: iload 7
      // 01d: ldc_w -2044861256
      // 020: ixor
      // 021: invokestatic qeaa361f143ee4a0894bd168fd9b30c66/qf4ccf8f5435d4a78bdca4d6a018b578e/aabbaaaba.babb (II)I
      // 024: ldc2_w 5404293092202304124
      // 027: invokestatic qeaa361f143ee4a0894bd168fd9b30c66/qf4ccf8f5435d4a78bdca4d6a018b578e/aabbaaaba.bbb (IJ)I
      // 02a: iand
      // 02b: istore 2
      // 02c: iload 2
      // 02d: ldc_w 147218535
      // 030: iload 7
      // 032: ldc_w 1246477647
      // 035: ixor
      // 036: invokestatic qeaa361f143ee4a0894bd168fd9b30c66/qf4ccf8f5435d4a78bdca4d6a018b578e/aabbaaaba.babb (II)I
      // 039: ldc2_w 3058947039271797569
      // 03c: invokestatic qeaa361f143ee4a0894bd168fd9b30c66/qf4ccf8f5435d4a78bdca4d6a018b578e/aabbaaaba.bbb (IJ)I
      // 03f: if_icmpge 047
      // 042: bipush 1
      // 043: istore 3
      // 044: goto 0e8
      // 047: iload 2
      // 048: ldc_w 147218534
      // 04b: iload 7
      // 04d: ldc_w -540875368
      // 050: ixor
      // 051: invokestatic qeaa361f143ee4a0894bd168fd9b30c66/qf4ccf8f5435d4a78bdca4d6a018b578e/aabbaaaba.babb (II)I
      // 054: ldc2_w 9118319269578952388
      // 057: invokestatic qeaa361f143ee4a0894bd168fd9b30c66/qf4ccf8f5435d4a78bdca4d6a018b578e/aabbaaaba.bbb (IJ)I
      // 05a: if_icmplt 07c
      // 05d: iload 2
      // 05e: ldc_w 147218521
      // 061: iload 7
      // 063: ldc_w -1057581116
      // 066: ixor
      // 067: invokestatic qeaa361f143ee4a0894bd168fd9b30c66/qf4ccf8f5435d4a78bdca4d6a018b578e/aabbaaaba.babb (II)I
      // 06a: ldc2_w 3822858363103803415
      // 06d: invokestatic qeaa361f143ee4a0894bd168fd9b30c66/qf4ccf8f5435d4a78bdca4d6a018b578e/aabbaaaba.bbb (IJ)I
      // 070: if_icmpgt 07c
      // 073: goto 077
      // 076: athrow
      // 077: bipush 2
      // 078: istore 3
      // 079: goto 0e8
      // 07c: iload 2
      // 07d: ldc_w 147218520
      // 080: iload 7
      // 082: ldc_w -1923532352
      // 085: ixor
      // 086: invokestatic qeaa361f143ee4a0894bd168fd9b30c66/qf4ccf8f5435d4a78bdca4d6a018b578e/aabbaaaba.babb (II)I
      // 089: ldc2_w 1978748547016893301
      // 08c: invokestatic qeaa361f143ee4a0894bd168fd9b30c66/qf4ccf8f5435d4a78bdca4d6a018b578e/aabbaaaba.bbb (IJ)I
      // 08f: if_icmplt 0b1
      // 092: iload 2
      // 093: ldc_w 147218523
      // 096: iload 7
      // 098: ldc_w 1248666038
      // 09b: ixor
      // 09c: invokestatic qeaa361f143ee4a0894bd168fd9b30c66/qf4ccf8f5435d4a78bdca4d6a018b578e/aabbaaaba.babb (II)I
      // 09f: ldc2_w 183590357459880517
      // 0a2: invokestatic qeaa361f143ee4a0894bd168fd9b30c66/qf4ccf8f5435d4a78bdca4d6a018b578e/aabbaaaba.bbb (IJ)I
      // 0a5: if_icmpgt 0b1
      // 0a8: goto 0ac
      // 0ab: athrow
      // 0ac: bipush 3
      // 0ad: istore 3
      // 0ae: goto 0e8
      // 0b1: iload 2
      // 0b2: ldc_w 147218522
      // 0b5: iload 7
      // 0b7: ldc_w -1117916705
      // 0ba: ixor
      // 0bb: invokestatic qeaa361f143ee4a0894bd168fd9b30c66/qf4ccf8f5435d4a78bdca4d6a018b578e/aabbaaaba.babb (II)I
      // 0be: ldc2_w 5774392829092032375
      // 0c1: invokestatic qeaa361f143ee4a0894bd168fd9b30c66/qf4ccf8f5435d4a78bdca4d6a018b578e/aabbaaaba.bbb (IJ)I
      // 0c4: if_icmplt 0e6
      // 0c7: iload 2
      // 0c8: ldc_w 147218525
      // 0cb: iload 7
      // 0cd: ldc_w -24364850
      // 0d0: ixor
      // 0d1: invokestatic qeaa361f143ee4a0894bd168fd9b30c66/qf4ccf8f5435d4a78bdca4d6a018b578e/aabbaaaba.babb (II)I
      // 0d4: ldc2_w 8800454379515819941
      // 0d7: invokestatic qeaa361f143ee4a0894bd168fd9b30c66/qf4ccf8f5435d4a78bdca4d6a018b578e/aabbaaaba.bbb (IJ)I
      // 0da: if_icmpgt 0e6
      // 0dd: goto 0e1
      // 0e0: athrow
      // 0e1: bipush 4
      // 0e2: istore 3
      // 0e3: goto 0e8
      // 0e6: bipush 0
      // 0e7: ireturn
      // 0e8: iload 1
      // 0e9: iload 3
      // 0ea: iadd
      // 0eb: aload 0
      // 0ec: arraylength
      // 0ed: if_icmple 0f3
      // 0f0: bipush 0
      // 0f1: ireturn
      // 0f2: athrow
      // 0f3: iload 3
      // 0f4: bipush 1
      // 0f5: if_icmpne 0fd
      // 0f8: iload 2
      // 0f9: goto 113
      // 0fc: athrow
      // 0fd: iload 2
      // 0fe: ldc_w 147218524
      // 101: iload 7
      // 103: ldc_w -1489992645
      // 106: ixor
      // 107: invokestatic qeaa361f143ee4a0894bd168fd9b30c66/qf4ccf8f5435d4a78bdca4d6a018b578e/aabbaaaba.babb (II)I
      // 10a: ldc2_w 7122154284949175678
      // 10d: invokestatic qeaa361f143ee4a0894bd168fd9b30c66/qf4ccf8f5435d4a78bdca4d6a018b578e/aabbaaaba.bbb (IJ)I
      // 110: iload 3
      // 111: ishr
      // 112: iand
      // 113: istore 4
      // 115: bipush 1
      // 116: istore 5
      // 118: iload 5
      // 11a: iload 3
      // 11b: if_icmpge 199
      // 11e: aload 0
      // 11f: iload 1
      // 120: iload 5
      // 122: iadd
      // 123: baload
      // 124: ldc_w 147218527
      // 127: iload 7
      // 129: ldc_w 466101755
      // 12c: ixor
      // 12d: invokestatic qeaa361f143ee4a0894bd168fd9b30c66/qf4ccf8f5435d4a78bdca4d6a018b578e/aabbaaaba.babb (II)I
      // 130: ldc2_w 5404293092202304124
      // 133: invokestatic qeaa361f143ee4a0894bd168fd9b30c66/qf4ccf8f5435d4a78bdca4d6a018b578e/aabbaaaba.bbb (IJ)I
      // 136: iand
      // 137: istore 6
      // 139: iload 6
      // 13b: ldc_w 147218526
      // 13e: iload 7
      // 140: ldc_w 1486109288
      // 143: ixor
      // 144: invokestatic qeaa361f143ee4a0894bd168fd9b30c66/qf4ccf8f5435d4a78bdca4d6a018b578e/aabbaaaba.babb (II)I
      // 147: ldc2_w 7780630983799248147
      // 14a: invokestatic qeaa361f143ee4a0894bd168fd9b30c66/qf4ccf8f5435d4a78bdca4d6a018b578e/aabbaaaba.bbb (IJ)I
      // 14d: iand
      // 14e: ldc_w 147218513
      // 151: iload 7
      // 153: ldc_w 902441419
      // 156: ixor
      // 157: invokestatic qeaa361f143ee4a0894bd168fd9b30c66/qf4ccf8f5435d4a78bdca4d6a018b578e/aabbaaaba.babb (II)I
      // 15a: ldc2_w 3058947039271797569
      // 15d: invokestatic qeaa361f143ee4a0894bd168fd9b30c66/qf4ccf8f5435d4a78bdca4d6a018b578e/aabbaaaba.bbb (IJ)I
      // 160: if_icmpeq 166
      // 163: bipush 0
      // 164: ireturn
      // 165: athrow
      // 166: iload 4
      // 168: ldc_w 147218512
      // 16b: iload 7
      // 16d: ldc_w -2100570605
      // 170: ixor
      // 171: invokestatic qeaa361f143ee4a0894bd168fd9b30c66/qf4ccf8f5435d4a78bdca4d6a018b578e/aabbaaaba.babb (II)I
      // 174: ldc2_w 7286675423144736259
      // 177: invokestatic qeaa361f143ee4a0894bd168fd9b30c66/qf4ccf8f5435d4a78bdca4d6a018b578e/aabbaaaba.bbb (IJ)I
      // 17a: ishl
      // 17b: iload 6
      // 17d: ldc_w 147218515
      // 180: iload 7
      // 182: ldc_w -1809691291
      // 185: ixor
      // 186: invokestatic qeaa361f143ee4a0894bd168fd9b30c66/qf4ccf8f5435d4a78bdca4d6a018b578e/aabbaaaba.babb (II)I
      // 189: ldc2_w 5387079852883331129
      // 18c: invokestatic qeaa361f143ee4a0894bd168fd9b30c66/qf4ccf8f5435d4a78bdca4d6a018b578e/aabbaaaba.bbb (IJ)I
      // 18f: iand
      // 190: ior
      // 191: istore 4
      // 193: iinc 5 1
      // 196: goto 118
      // 199: iload 3
      // 19a: bipush 3
      // 19b: if_icmpne 1b9
      // 19e: iload 4
      // 1a0: ldc_w 147218514
      // 1a3: iload 7
      // 1a5: ldc_w 401186392
      // 1a8: ixor
      // 1a9: invokestatic qeaa361f143ee4a0894bd168fd9b30c66/qf4ccf8f5435d4a78bdca4d6a018b578e/aabbaaaba.babb (II)I
      // 1ac: ldc2_w 2748462599907475161
      // 1af: invokestatic qeaa361f143ee4a0894bd168fd9b30c66/qf4ccf8f5435d4a78bdca4d6a018b578e/aabbaaaba.bbb (IJ)I
      // 1b2: if_icmplt 2a6
      // 1b5: goto 1b9
      // 1b8: athrow
      // 1b9: iload 3
      // 1ba: bipush 4
      // 1bb: if_icmpne 1dd
      // 1be: goto 1c2
      // 1c1: athrow
      // 1c2: iload 4
      // 1c4: ldc_w 147218517
      // 1c7: iload 7
      // 1c9: ldc_w -211948728
      // 1cc: ixor
      // 1cd: invokestatic qeaa361f143ee4a0894bd168fd9b30c66/qf4ccf8f5435d4a78bdca4d6a018b578e/aabbaaaba.babb (II)I
      // 1d0: ldc2_w 1558438481158413294
      // 1d3: invokestatic qeaa361f143ee4a0894bd168fd9b30c66/qf4ccf8f5435d4a78bdca4d6a018b578e/aabbaaaba.bbb (IJ)I
      // 1d6: if_icmplt 2a6
      // 1d9: goto 1dd
      // 1dc: athrow
      // 1dd: iload 4
      // 1df: ldc_w 147218516
      // 1e2: iload 7
      // 1e4: ldc_w 787320
      // 1e7: ixor
      // 1e8: invokestatic qeaa361f143ee4a0894bd168fd9b30c66/qf4ccf8f5435d4a78bdca4d6a018b578e/aabbaaaba.babb (II)I
      // 1eb: ldc2_w 4770045992596839739
      // 1ee: invokestatic qeaa361f143ee4a0894bd168fd9b30c66/qf4ccf8f5435d4a78bdca4d6a018b578e/aabbaaaba.bbb (IJ)I
      // 1f1: if_icmpgt 2a6
      // 1f4: goto 1f8
      // 1f7: athrow
      // 1f8: iload 4
      // 1fa: ldc_w 147218519
      // 1fd: iload 7
      // 1ff: ldc_w -441545457
      // 202: ixor
      // 203: invokestatic qeaa361f143ee4a0894bd168fd9b30c66/qf4ccf8f5435d4a78bdca4d6a018b578e/aabbaaaba.babb (II)I
      // 206: ldc2_w 6254746547031592063
      // 209: invokestatic qeaa361f143ee4a0894bd168fd9b30c66/qf4ccf8f5435d4a78bdca4d6a018b578e/aabbaaaba.bbb (IJ)I
      // 20c: if_icmplt 22e
      // 20f: goto 213
      // 212: athrow
      // 213: iload 4
      // 215: ldc_w 147218518
      // 218: iload 7
      // 21a: ldc_w 5655008
      // 21d: ixor
      // 21e: invokestatic qeaa361f143ee4a0894bd168fd9b30c66/qf4ccf8f5435d4a78bdca4d6a018b578e/aabbaaaba.babb (II)I
      // 221: ldc2_w 6614700023860270656
      // 224: invokestatic qeaa361f143ee4a0894bd168fd9b30c66/qf4ccf8f5435d4a78bdca4d6a018b578e/aabbaaaba.bbb (IJ)I
      // 227: if_icmple 2a6
      // 22a: goto 22e
      // 22d: athrow
      // 22e: iload 4
      // 230: ldc_w 147218505
      // 233: iload 7
      // 235: ldc_w -819477224
      // 238: ixor
      // 239: invokestatic qeaa361f143ee4a0894bd168fd9b30c66/qf4ccf8f5435d4a78bdca4d6a018b578e/aabbaaaba.babb (II)I
      // 23c: ldc2_w 134883699360338743
      // 23f: invokestatic qeaa361f143ee4a0894bd168fd9b30c66/qf4ccf8f5435d4a78bdca4d6a018b578e/aabbaaaba.bbb (IJ)I
      // 242: if_icmpeq 2a6
      // 245: goto 249
      // 248: athrow
      // 249: iload 4
      // 24b: invokestatic java/lang/Character.isISOControl (I)Z
      // 24e: ifeq 2a9
      // 251: goto 255
      // 254: athrow
      // 255: iload 4
      // 257: ldc_w 147218504
      // 25a: iload 7
      // 25c: ldc_w 2141467791
      // 25f: ixor
      // 260: invokestatic qeaa361f143ee4a0894bd168fd9b30c66/qf4ccf8f5435d4a78bdca4d6a018b578e/aabbaaaba.babb (II)I
      // 263: ldc2_w 1956653600592160882
      // 266: invokestatic qeaa361f143ee4a0894bd168fd9b30c66/qf4ccf8f5435d4a78bdca4d6a018b578e/aabbaaaba.bbb (IJ)I
      // 269: if_icmpeq 2a9
      // 26c: goto 270
      // 26f: athrow
      // 270: iload 4
      // 272: ldc_w 147218507
      // 275: iload 7
      // 277: ldc_w -777777000
      // 27a: ixor
      // 27b: invokestatic qeaa361f143ee4a0894bd168fd9b30c66/qf4ccf8f5435d4a78bdca4d6a018b578e/aabbaaaba.babb (II)I
      // 27e: ldc2_w 5091404020247012581
      // 281: invokestatic qeaa361f143ee4a0894bd168fd9b30c66/qf4ccf8f5435d4a78bdca4d6a018b578e/aabbaaaba.bbb (IJ)I
      // 284: if_icmpeq 2a9
      // 287: goto 28b
      // 28a: athrow
      // 28b: iload 4
      // 28d: ldc_w 147218506
      // 290: iload 7
      // 292: ldc_w -1120455842
      // 295: ixor
      // 296: invokestatic qeaa361f143ee4a0894bd168fd9b30c66/qf4ccf8f5435d4a78bdca4d6a018b578e/aabbaaaba.babb (II)I
      // 299: ldc2_w 411207755838010886
      // 29c: invokestatic qeaa361f143ee4a0894bd168fd9b30c66/qf4ccf8f5435d4a78bdca4d6a018b578e/aabbaaaba.bbb (IJ)I
      // 29f: if_icmpeq 2a9
      // 2a2: goto 2a6
      // 2a5: athrow
      // 2a6: bipush 0
      // 2a7: ireturn
      // 2a8: athrow
      // 2a9: iload 1
      // 2aa: iload 3
      // 2ab: iadd
      // 2ac: istore 1
      // 2ad: goto 00f
      // 2b0: bipush 1
      // 2b1: ireturn
   }

   private static int b(byte[] param0, int param1) {
      // $VF: Couldn't be decompiled
      // Please report this to the Vineflower issue tracker, at https://github.com/Vineflower/vineflower/issues with a copy of the class file (if you have the rights to distribute it!)
      // java.lang.RuntimeException: parsing failure!
      //   at org.jetbrains.java.decompiler.modules.decompiler.decompose.DomHelper.parseGraph(DomHelper.java:211)
      //   at org.jetbrains.java.decompiler.main.rels.MethodProcessor.codeToJava(MethodProcessor.java:166)
      //
      // Bytecode:
      // 00: getstatic qeaa361f143ee4a0894bd168fd9b30c66/qf4ccf8f5435d4a78bdca4d6a018b578e/baaabbaa.bba I
      // 03: bipush 0
      // 04: istore 3
      // 05: iload 1
      // 06: istore 4
      // 08: istore 2
      // 09: iload 3
      // 0a: aload 0
      // 0b: arraylength
      // 0c: if_icmpge 35
      // 0f: iload 4
      // 11: iload 2
      // 12: ifne 36
      // 15: iload 2
      // 16: ifne 36
      // 19: goto 1d
      // 1c: athrow
      // 1d: ifle 35
      // 20: goto 24
      // 23: athrow
      // 24: iload 3
      // 25: aload 0
      // 26: iload 3
      // 27: aload 0
      // 28: arraylength
      // 29: invokestatic qeaa361f143ee4a0894bd168fd9b30c66/qf4ccf8f5435d4a78bdca4d6a018b578e/aabbaaaba.ab ([BII)I
      // 2c: iadd
      // 2d: istore 3
      // 2e: iload 2
      // 2f: iinc 4 -1
      // 32: ifeq 09
      // 35: iload 3
      // 36: ireturn
   }

   public static String abba(String param0) {
      // $VF: Couldn't be decompiled
      // Please report this to the Vineflower issue tracker, at https://github.com/Vineflower/vineflower/issues with a copy of the class file (if you have the rights to distribute it!)
      // java.lang.RuntimeException: parsing failure!
      //   at org.jetbrains.java.decompiler.modules.decompiler.decompose.DomHelper.parseGraph(DomHelper.java:211)
      //   at org.jetbrains.java.decompiler.main.rels.MethodProcessor.codeToJava(MethodProcessor.java:166)
      //
      // Bytecode:
      // 00: getstatic qeaa361f143ee4a0894bd168fd9b30c66/qf4ccf8f5435d4a78bdca4d6a018b578e/aabbaaaba.b Z
      // 03: ifne 19
      // 06: aload 0
      // 07: ifnull 19
      // 0a: goto 0e
      // 0d: athrow
      // 0e: aload 0
      // 0f: invokevirtual java/lang/String.isEmpty ()Z
      // 12: ifeq 1e
      // 15: goto 19
      // 18: athrow
      // 19: ldc_w ""
      // 1c: areturn
      // 1d: athrow
      // 1e: aload 0
      // 1f: invokestatic qeaa361f143ee4a0894bd168fd9b30c66/qf4ccf8f5435d4a78bdca4d6a018b578e/aabbaaaba.aabb (Ljava/lang/String;)Ljava/lang/String;
      // 22: areturn
   }

   private static byte[] abbb(int var0) {
      int var4 = 1300654148;
      int var1 = var0 * bbb(babb(147218509, var4 ^ 1256786051), 3869034266782422925L) ^ bbb(babb(147218508, var4 ^ 898209483), 1331592162177197212L);
      byte[] var2 = new byte[bbb(babb(147218511, var4 ^ 1676918433), 2402348705922592105L)];

      for (int var3 = 0; var3 < var2.length; var3++) {
         var1 = var1 * bbb(babb(147218510, var4 ^ -975164414), 3246792774662705157L) + 1;
         var2[var3] = (byte)(var1 >> bbb(babb(147218497, var4 ^ -1074730945), 840817338919228931L));
      }

      return var2;
   }

   private static int baaa(CharSequence var0) {
      int var2 = 0;
      int var1 = baaabbaa.bba;
      int var3 = 0;

      int var10000;
      while (true) {
         if (var3 < var0.length()) {
            int var4 = Character.codePointAt(var0, var3);
            var10000 = var3;
            if (var1 != 0) {
               break;
            }

            var3 += Character.charCount(var4);
            var2++;
            if (var1 == 0) {
               continue;
            }
         }

         var10000 = var2;
         break;
      }

      return var10000;
   }

   private static ababbbbaa a(String var0) {
      byte[] var1 = Base64.getDecoder().decode(var0);

      ababbbbaa var3;
      try {
         byte[] var2 = bab(var1);
         if (var2 == null) {
            int var15 = 0;

            try {
               while (var15 < var1.length) {
                  var1[var15] ^= abb[var15 & bbb(babb(147218496, 277540251 ^ 80544287), 7986222699824761852L)];
                  var15++;
               }
            } catch (MatchException var13) {
               throw var13;
            }

            return ababbbbaa.bba(var1);
         }

         try {
            var3 = ababbbbaa.bba(var2);
         } finally {
            Arrays.fill(var2, (byte)0);
         }
      } finally {
         Arrays.fill(var1, (byte)0);
      }

      return var3;
   }

   public static boolean baab(String param0) {
      // $VF: Couldn't be decompiled
      // Please report this to the Vineflower issue tracker, at https://github.com/Vineflower/vineflower/issues with a copy of the class file (if you have the rights to distribute it!)
      // java.lang.NullPointerException: Cannot invoke "org.jetbrains.java.decompiler.code.cfg.ExceptionRangeCFG.isCircular()" because "range" is null
      //   at org.jetbrains.java.decompiler.modules.decompiler.decompose.DomHelper.graphToStatement(DomHelper.java:84)
      //   at org.jetbrains.java.decompiler.modules.decompiler.decompose.DomHelper.parseGraph(DomHelper.java:203)
      //   at org.jetbrains.java.decompiler.main.rels.MethodProcessor.codeToJava(MethodProcessor.java:166)
      //
      // Bytecode:
      // 00: getstatic qeaa361f143ee4a0894bd168fd9b30c66/qf4ccf8f5435d4a78bdca4d6a018b578e/aabbaaaba.b Z
      // 03: ifne 19
      // 06: aload 0
      // 07: ifnull 19
      // 0a: goto 0e
      // 0d: athrow
      // 0e: aload 0
      // 0f: invokevirtual java/lang/String.isEmpty ()Z
      // 12: ifeq 1c
      // 15: goto 19
      // 18: athrow
      // 19: bipush 0
      // 1a: ireturn
      // 1b: athrow
      // 1c: invokestatic java/util/Base64.getDecoder ()Ljava/util/Base64$Decoder;
      // 1f: aload 0
      // 20: invokevirtual java/util/Base64$Decoder.decode (Ljava/lang/String;)[B
      // 23: astore 1
      // 24: aload 1
      // 25: arraylength
      // 26: ifne 32
      // 29: bipush 0
      // 2a: istore 2
      // 2b: aload 1
      // 2c: bipush 0
      // 2d: invokestatic java/util/Arrays.fill ([BB)V
      // 30: iload 2
      // 31: ireturn
      // 32: aload 1
      // 33: invokestatic qeaa361f143ee4a0894bd168fd9b30c66/qf4ccf8f5435d4a78bdca4d6a018b578e/aabbaaaba.bab ([B)[B
      // 36: astore 2
      // 37: aload 2
      // 38: ifnull 49
      // 3b: aload 2
      // 3c: bipush 0
      // 3d: invokestatic java/util/Arrays.fill ([BB)V
      // 40: bipush 1
      // 41: istore 3
      // 42: aload 1
      // 43: bipush 0
      // 44: invokestatic java/util/Arrays.fill ([BB)V
      // 47: iload 3
      // 48: ireturn
      // 49: bipush 0
      // 4a: istore 3
      // 4b: iload 3
      // 4c: aload 1
      // 4d: arraylength
      // 4e: if_icmpge 78
      // 51: aload 1
      // 52: iload 3
      // 53: dup2
      // 54: baload
      // 55: getstatic qeaa361f143ee4a0894bd168fd9b30c66/qf4ccf8f5435d4a78bdca4d6a018b578e/aabbaaaba.abb [B
      // 58: iload 3
      // 59: ldc_w 147218499
      // 5c: ldc_w 1005827711
      // 5f: ldc_w -218101352
      // 62: ixor
      // 63: invokestatic qeaa361f143ee4a0894bd168fd9b30c66/qf4ccf8f5435d4a78bdca4d6a018b578e/aabbaaaba.babb (II)I
      // 66: ldc2_w 2881015195306491632
      // 69: invokestatic qeaa361f143ee4a0894bd168fd9b30c66/qf4ccf8f5435d4a78bdca4d6a018b578e/aabbaaaba.bbb (IJ)I
      // 6c: iand
      // 6d: baload
      // 6e: ixor
      // 6f: i2b
      // 70: bastore
      // 71: iinc 3 1
      // 74: goto 4b
      // 77: athrow
      // 78: aload 1
      // 79: invokestatic qeaa361f143ee4a0894bd168fd9b30c66/qf4ccf8f5435d4a78bdca4d6a018b578e/aabbaaaba.abab ([B)Z
      // 7c: istore 3
      // 7d: aload 1
      // 7e: bipush 0
      // 7f: invokestatic java/util/Arrays.fill ([BB)V
      // 82: iload 3
      // 83: ireturn
      // 84: astore 4
      // 86: aload 1
      // 87: bipush 0
      // 88: invokestatic java/util/Arrays.fill ([BB)V
      // 8b: aload 4
      // 8d: athrow
      // 8e: astore 1
      // 8f: bipush 0
      // 90: ireturn
   }

   public static long baba(String var0) {
      int var10000 = baaabbaa.bba;
      long var2 = aaa(babb(147218498, 1929645040 ^ -507766491), 8315707798054603234L);
      int var1 = var10000;

      try {
         if (var0 == null) {
            return var2;
         }
      } catch (MatchException var6) {
         throw var6;
      }

      int var4 = 0;

      while (true) {
         if (var4 < var0.length()) {
            int var5 = var0.codePointAt(var4);
            var8 = var2;
            if (var1 != 0) {
               break;
            }

            var2 ^= var5;
            var2 *= aaa(babb(147218501, 1929645040 ^ 1010607041), 6544840906206009424L);
            var4 += Character.charCount(var5);
            if (var1 == 0) {
               continue;
            }
         }

         var8 = var2;
         break;
      }

      return var8;
   }
}
