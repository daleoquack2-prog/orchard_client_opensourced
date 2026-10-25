package nsc;

import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;
import java.util.Set;
import java.util.concurrent.ThreadLocalRandom;
import net.fabricmc.api.EnvType;
import net.fabricmc.api.Environment;
import net.minecraft.class_1701;
import net.minecraft.class_1799;
import net.minecraft.class_2338;
import net.minecraft.class_2350;
import net.minecraft.class_2596;
import net.minecraft.class_310;

@Environment(EnvType.CLIENT)
public final class abbbaaabb extends abbaabbaa {
   private static final long[] ba;
   private int aaa;
   private int aab;
   private static final String[] aba;
   private static final long[] ab;
   private final aaabbbab abb;
   private static final Integer[] baa;
   private static final float bab = 0.25F;
   private final bababa bba;
   private final baabaab bbb;
   private static final String[] aaaa;
   private final Map bb;
   private final aaabbbab aaab;
   private final ababbbbba aaba;
   private long aabb;
   private static final float abaa = 11.5F;
   private final baabaab abab;
   private static final String[] aabaa;
   private static final int[] aaabb;
   private final bababa abba;
   private static final double abbb = 20.25;
   private final bababa baaa;
   private static final double baab = 10.0;
   private final Set baba;
   private static final int babb;
   private static final Long[] bbaa;
   private final baabaab bbab;
   private long bbba;
   private final Set aa;
   private static final Object[] aabab;
   private static final int bbbb;
   private long aaaaa;
   private boolean aaaab;
   private final Map aaaba;

   private boolean aa() {
      try {
         if (this.abab.abbb() == baaaabbb.b) {
            return true;
         }
      } catch (MatchException var1) {
         throw var1;
      }

      return false;
   }

   public abbbaaabb() {
      int var1 = -897267911;
      super(
         aabbaaaba.aaab(aaab(a(-74918305, var1 ^ 1583865840), a(-74918306, var1 ^ -1601562923))),
         bbaabbba.aa,
         aabbaaaba.aaab(aaab(a(-74918307, var1 ^ -106513094), a(-74918308, var1 ^ -608483995)))
      );
      this.bbb = (baabaab)this.abbbaaa(
         new baabaab(
            aabbaaaba.aaab(aaab(a(-74918309, var1 ^ 2037633100), a(-74918310, var1 ^ 1177329503))),
            abababab.class,
            abababab.b
         )
      );
      this.abba = (bababa)this.abbbaaa(
         new bababa(
               aabbaaaba.aaab(aaab(a(-74918311, var1 ^ 1492494558), a(-74918312, var1 ^ -913470687))), 100.0, 0.0, 100.0, 1.0
            )
            .bba(aabbaaaba.aaab(aaab(a(-74918313, var1 ^ 73302957), a(-74918314, var1 ^ -1210629949))))
      );
      this.abab = (baabaab)this.abbbaaa(
         new baabaab(
            aabbaaaba.aaab(aaab(a(-74918315, var1 ^ 1565889571), a(-74918316, var1 ^ -1169980549))),
            baaaabbb.class,
            baaaabbb.ab
         )
      );
      this.bba = (bababa)this.abbbaaa(
         (bababa)new bababa(
               aabbaaaba.aaab(aaab(a(-74918317, var1 ^ 1546525450), a(-74918318, var1 ^ -877337184))), 9.0, 1.0, 9.0, 1.0
            )
            .babb(this::aa)
      );
      this.aaab = (aaabbbab)this.abbbaaa(
         new aaabbbab(
               aabbaaaba.aaab(aaab(a(-74918319, var1 ^ 1363885516), a(-74918320, var1 ^ -903340958))),
               0.0,
               0.0,
               0.0,
               300.0,
               5.0
            )
            .bbb(aabbaaaba.aaab(aaab(a(-74918321, var1 ^ 346420432), a(-74918322, var1 ^ -1259973232))))
      );
      this.abb = (aaabbbab)this.abbbaaa(
         new aaabbbab(
               aabbaaaba.aaab(aaab(a(-74918323, var1 ^ 429855419), a(-74918324, var1 ^ 1889430778))),
               0.0,
               0.0,
               0.0,
               500.0,
               5.0
            )
            .bbb(aabbaaaba.aaab(aaab(a(-74918325, var1 ^ -849340010), a(-74918326, var1 ^ -17081849))))
      );
      this.bbab = (baabaab)this.abbbaaa(
         new baabaab(
            aabbaaaba.aaab(aaab(a(-74918327, var1 ^ -1047902703), a(-74918328, var1 ^ 294590684))),
            aaaabaaab.class,
            aaaabaaab.a
         )
      );
      this.baaa = (bababa)this.abbbaaa(
         (bababa)new bababa(
               aabbaaaba.aaab(aaab(a(-74918329, var1 ^ 1440527083), a(-74918330, var1 ^ -1190972957))), 50.0, 1.0, 100.0, 1.0
            )
            .babb(this::bbab)
      );
      this.aaba = new ababbbbba();
      this.bb = new HashMap();
      this.aa = new HashSet();
      this.baba = new HashSet();
      this.aaaba = new HashMap();
      this.aab = aaabb(a(-74918331, var1 ^ 2062684705), 5110402091455189138L);
      this.aaa = aaabb(a(-74918332, var1 ^ 749530280), 5110402091455189138L);
      this.aabb = bbb(a(-74918333, var1 ^ 216831678), 3848252472189630803L);
      this.bbba = bbb(a(-74918334, var1 ^ 1535709061), 3848252472189630803L);
   }

   private static boolean ab(class_1701 param0) {
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
      // 06: ifne 18
      // 09: invokevirtual net/minecraft/class_1701.method_5805 ()Z
      // 0c: ifeq 2a
      // 0f: goto 13
      // 12: athrow
      // 13: aload 0
      // 14: goto 18
      // 17: athrow
      // 18: invokevirtual net/minecraft/class_1701.method_31481 ()Z
      // 1b: iload 1
      // 1c: ifne 27
      // 1f: ifne 2a
      // 22: goto 26
      // 25: athrow
      // 26: bipush 1
      // 27: goto 2b
      // 2a: bipush 0
      // 2b: ireturn
   }

   private abaaaabaa ba(class_310 param1, class_1701 param2) {
      // $VF: Couldn't be decompiled
      // Please report this to the Vineflower issue tracker, at https://github.com/Vineflower/vineflower/issues with a copy of the class file (if you have the rights to distribute it!)
      // java.lang.RuntimeException: parsing failure!
      //   at org.jetbrains.java.decompiler.modules.decompiler.decompose.DomHelper.parseGraph(DomHelper.java:211)
      //   at org.jetbrains.java.decompiler.main.rels.MethodProcessor.codeToJava(MethodProcessor.java:166)
      //
      // Bytecode:
      // 000: getstatic qeaa361f143ee4a0894bd168fd9b30c66/qf4ccf8f5435d4a78bdca4d6a018b578e/aabbabbab.ab I
      // 003: aload 1
      // 004: getfield net/minecraft/class_310.field_1724 Lnet/minecraft/class_746;
      // 007: invokevirtual net/minecraft/class_746.method_24515 ()Lnet/minecraft/class_2338;
      // 00a: astore 4
      // 00c: aload 2
      // 00d: invokevirtual net/minecraft/class_1701.method_23317 ()D
      // 010: aload 1
      // 011: getfield net/minecraft/class_310.field_1724 Lnet/minecraft/class_746;
      // 014: invokevirtual net/minecraft/class_746.method_23317 ()D
      // 017: dsub
      // 018: aload 2
      // 019: invokevirtual net/minecraft/class_1701.method_23321 ()D
      // 01c: aload 1
      // 01d: getfield net/minecraft/class_310.field_1724 Lnet/minecraft/class_746;
      // 020: invokevirtual net/minecraft/class_746.method_23321 ()D
      // 023: dsub
      // 024: invokestatic qeaa361f143ee4a0894bd168fd9b30c66/qf4ccf8f5435d4a78bdca4d6a018b578e/abbbaaabb.baab (DD)Lnet/minecraft/class_2350;
      // 027: astore 5
      // 029: istore 3
      // 02a: aload 4
      // 02c: aload 5
      // 02e: invokevirtual net/minecraft/class_2338.method_10093 (Lnet/minecraft/class_2350;)Lnet/minecraft/class_2338;
      // 031: astore 6
      // 033: aconst_null
      // 034: astore 7
      // 036: ldc_w Infinity
      // 039: fstore 8
      // 03b: aload 0
      // 03c: aload 1
      // 03d: aload 2
      // 03e: aconst_null
      // 03f: invokevirtual qeaa361f143ee4a0894bd168fd9b30c66/qf4ccf8f5435d4a78bdca4d6a018b578e/abbbaaabb.abaaa (Lnet/minecraft/class_310;Lnet/minecraft/class_1701;Lnet/minecraft/class_2338;)F
      // 042: fstore 9
      // 044: bipush 0
      // 045: istore 10
      // 047: iload 10
      // 049: pop
      // 04a: aload 6
      // 04c: aload 6
      // 04e: invokevirtual net/minecraft/class_2338.method_10084 ()Lnet/minecraft/class_2338;
      // 051: invokestatic java/util/List.of (Ljava/lang/Object;Ljava/lang/Object;)Ljava/util/List;
      // 054: invokeinterface java/util/List.iterator ()Ljava/util/Iterator; 1
      // 059: astore 11
      // 05b: aload 11
      // 05d: invokeinterface java/util/Iterator.hasNext ()Z 1
      // 062: ifeq 10b
      // 065: aload 11
      // 067: invokeinterface java/util/Iterator.next ()Ljava/lang/Object; 1
      // 06c: checkcast net/minecraft/class_2338
      // 06f: astore 12
      // 071: aload 12
      // 073: invokestatic net/minecraft/class_243.method_24953 (Lnet/minecraft/class_2382;)Lnet/minecraft/class_243;
      // 076: astore 13
      // 078: aload 1
      // 079: getfield net/minecraft/class_310.field_1724 Lnet/minecraft/class_746;
      // 07c: invokevirtual net/minecraft/class_746.method_23317 ()D
      // 07f: aload 1
      // 080: getfield net/minecraft/class_310.field_1724 Lnet/minecraft/class_746;
      // 083: invokevirtual net/minecraft/class_746.method_23321 ()D
      // 086: aload 2
      // 087: invokevirtual net/minecraft/class_1701.method_23317 ()D
      // 08a: aload 2
      // 08b: invokevirtual net/minecraft/class_1701.method_23321 ()D
      // 08e: aload 13
      // 090: getfield net/minecraft/class_243.field_1352 D
      // 093: aload 13
      // 095: getfield net/minecraft/class_243.field_1350 D
      // 098: invokestatic qeaa361f143ee4a0894bd168fd9b30c66/qf4ccf8f5435d4a78bdca4d6a018b578e/abbbaaabb.aabba (DDDDDD)Z
      // 09b: ifne 0a6
      // 09e: iload 3
      // 09f: ifeq 05b
      // 0a2: goto 0a6
      // 0a5: athrow
      // 0a6: aload 0
      // 0a7: aload 1
      // 0a8: aload 12
      // 0aa: invokevirtual qeaa361f143ee4a0894bd168fd9b30c66/qf4ccf8f5435d4a78bdca4d6a018b578e/abbbaaabb.baaab (Lnet/minecraft/class_310;Lnet/minecraft/class_2338;)Lqeaa361f143ee4a0894bd168fd9b30c66/qf4ccf8f5435d4a78bdca4d6a018b578e/abaaaabaa;
      // 0ad: astore 14
      // 0af: iload 3
      // 0b0: ifne 0ca
      // 0b3: aload 14
      // 0b5: ifnonnull 0c4
      // 0b8: goto 0bc
      // 0bb: athrow
      // 0bc: iload 3
      // 0bd: ifeq 05b
      // 0c0: goto 0c4
      // 0c3: athrow
      // 0c4: bipush 1
      // 0c5: istore 10
      // 0c7: iload 10
      // 0c9: pop
      // 0ca: aload 0
      // 0cb: aload 1
      // 0cc: aload 2
      // 0cd: aload 12
      // 0cf: invokevirtual qeaa361f143ee4a0894bd168fd9b30c66/qf4ccf8f5435d4a78bdca4d6a018b578e/abbbaaabb.abaaa (Lnet/minecraft/class_310;Lnet/minecraft/class_1701;Lnet/minecraft/class_2338;)F
      // 0d2: fstore 15
      // 0d4: fload 9
      // 0d6: fload 15
      // 0d8: fsub
      // 0d9: iload 3
      // 0da: ifne 0ed
      // 0dd: ldc 0.25
      // 0df: fcmpl
      // 0e0: iflt 107
      // 0e3: goto 0e7
      // 0e6: athrow
      // 0e7: fload 15
      // 0e9: goto 0ed
      // 0ec: athrow
      // 0ed: iload 3
      // 0ee: ifne 101
      // 0f1: fload 8
      // 0f3: fcmpg
      // 0f4: ifge 107
      // 0f7: goto 0fb
      // 0fa: athrow
      // 0fb: fload 15
      // 0fd: goto 101
      // 100: athrow
      // 101: fstore 8
      // 103: aload 14
      // 105: astore 7
      // 107: iload 3
      // 108: ifeq 05b
      // 10b: aload 7
      // 10d: areturn
   }

   private static boolean bb(class_310 var0, Integer var1) {
      try {
         if (var0.field_1687.method_8469(var1) == null) {
            return true;
         }
      } catch (MatchException var2) {
         throw var2;
      }

      return false;
   }

   private boolean aaa(class_310 param1, class_1701 param2, int param3, abaaaabaa param4) {
      // $VF: Couldn't be decompiled
      // Please report this to the Vineflower issue tracker, at https://github.com/Vineflower/vineflower/issues with a copy of the class file (if you have the rights to distribute it!)
      // java.lang.RuntimeException: parsing failure!
      //   at org.jetbrains.java.decompiler.modules.decompiler.decompose.DomHelper.parseGraph(DomHelper.java:211)
      //   at org.jetbrains.java.decompiler.main.rels.MethodProcessor.codeToJava(MethodProcessor.java:166)
      //
      // Bytecode:
      // 00: getstatic qeaa361f143ee4a0894bd168fd9b30c66/qf4ccf8f5435d4a78bdca4d6a018b578e/aabbabbab.ab I
      // 03: aload 0
      // 04: dup
      // 05: getfield qeaa361f143ee4a0894bd168fd9b30c66/qf4ccf8f5435d4a78bdca4d6a018b578e/abbbaaabb.aaaaa J
      // 08: lconst_1
      // 09: ladd
      // 0a: dup2_x1
      // 0b: putfield qeaa361f143ee4a0894bd168fd9b30c66/qf4ccf8f5435d4a78bdca4d6a018b578e/abbbaaabb.aaaaa J
      // 0e: lstore 6
      // 10: aload 2
      // 11: invokevirtual net/minecraft/class_1701.method_5628 ()I
      // 14: istore 8
      // 16: istore 5
      // 18: aload 1
      // 19: aload 4
      // 1b: invokevirtual qeaa361f143ee4a0894bd168fd9b30c66/qf4ccf8f5435d4a78bdca4d6a018b578e/abaaaabaa.a ()Lnet/minecraft/class_243;
      // 1e: invokestatic qeaa361f143ee4a0894bd168fd9b30c66/qf4ccf8f5435d4a78bdca4d6a018b578e/bbabbbb.babaab (Lnet/minecraft/class_310;Lnet/minecraft/class_243;)[F
      // 21: astore 9
      // 23: iload 5
      // 25: ifne 44
      // 28: aload 9
      // 2a: ifnonnull 34
      // 2d: goto 31
      // 30: athrow
      // 31: bipush 0
      // 32: ireturn
      // 33: athrow
      // 34: aload 0
      // 35: bipush 1
      // 36: putfield qeaa361f143ee4a0894bd168fd9b30c66/qf4ccf8f5435d4a78bdca4d6a018b578e/abbbaaabb.aaaab Z
      // 39: aload 0
      // 3a: aload 1
      // 3b: getfield net/minecraft/class_310.field_1724 Lnet/minecraft/class_746;
      // 3e: getfield net/minecraft/class_746.field_6012 I
      // 41: putfield qeaa361f143ee4a0894bd168fd9b30c66/qf4ccf8f5435d4a78bdca4d6a018b578e/abbbaaabb.aab I
      // 44: aload 1
      // 45: ldc_w -74918335
      // 48: ldc_w -1410800385
      // 4b: ldc_w 2109353713
      // 4e: ixor
      // 4f: invokestatic qeaa361f143ee4a0894bd168fd9b30c66/qf4ccf8f5435d4a78bdca4d6a018b578e/abbbaaabb.a (II)I
      // 52: ldc2_w 9043748870966421585
      // 55: invokestatic qeaa361f143ee4a0894bd168fd9b30c66/qf4ccf8f5435d4a78bdca4d6a018b578e/abbbaaabb.aaabb (IJ)I
      // 58: aload 9
      // 5a: bipush 0
      // 5b: faload
      // 5c: aload 9
      // 5e: bipush 1
      // 5f: faload
      // 60: aload 0
      // 61: aload 1
      // 62: lload 6
      // 64: iload 8
      // 66: iload 3
      // 67: aload 4
      // 69: invokedynamic run (Lqeaa361f143ee4a0894bd168fd9b30c66/qf4ccf8f5435d4a78bdca4d6a018b578e/abbbaaabb;Lnet/minecraft/class_310;JIILqeaa361f143ee4a0894bd168fd9b30c66/qf4ccf8f5435d4a78bdca4d6a018b578e/abaaaabaa;)Lqeaa361f143ee4a0894bd168fd9b30c66/qf4ccf8f5435d4a78bdca4d6a018b578e/aabbaabbb; bsm=java/lang/invoke/LambdaMetafactory.metafactory (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;Ljava/lang/invoke/MethodType;Ljava/lang/invoke/MethodHandle;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[ ()Z, qeaa361f143ee4a0894bd168fd9b30c66/qf4ccf8f5435d4a78bdca4d6a018b578e/abbbaaabb.abaa (Lnet/minecraft/class_310;JIILqeaa361f143ee4a0894bd168fd9b30c66/qf4ccf8f5435d4a78bdca4d6a018b578e/abaaaabaa;)Z, ()Z ]
      // 6e: invokestatic qeaa361f143ee4a0894bd168fd9b30c66/qf4ccf8f5435d4a78bdca4d6a018b578e/bbabbbb.ba (Lnet/minecraft/class_310;IFFLqeaa361f143ee4a0894bd168fd9b30c66/qf4ccf8f5435d4a78bdca4d6a018b578e/aabbaabbb;)Z
      // 71: istore 10
      // 73: iload 10
      // 75: iload 5
      // 77: ifne bb
      // 7a: ifne ba
      // 7d: goto 81
      // 80: athrow
      // 81: lload 6
      // 83: aload 0
      // 84: getfield qeaa361f143ee4a0894bd168fd9b30c66/qf4ccf8f5435d4a78bdca4d6a018b578e/abbbaaabb.aaaaa J
      // 87: lcmp
      // 88: iload 5
      // 8a: ifne b9
      // 8d: goto 91
      // 90: athrow
      // 91: ifne b8
      // 94: goto 98
      // 97: athrow
      // 98: aload 0
      // 99: bipush 0
      // 9a: putfield qeaa361f143ee4a0894bd168fd9b30c66/qf4ccf8f5435d4a78bdca4d6a018b578e/abbbaaabb.aaaab Z
      // 9d: aload 0
      // 9e: ldc_w -74918336
      // a1: ldc_w -1410800385
      // a4: ldc_w -977908472
      // a7: ixor
      // a8: invokestatic qeaa361f143ee4a0894bd168fd9b30c66/qf4ccf8f5435d4a78bdca4d6a018b578e/abbbaaabb.a (II)I
      // ab: ldc2_w 9032607326538210055
      // ae: invokestatic qeaa361f143ee4a0894bd168fd9b30c66/qf4ccf8f5435d4a78bdca4d6a018b578e/abbbaaabb.aaabb (IJ)I
      // b1: putfield qeaa361f143ee4a0894bd168fd9b30c66/qf4ccf8f5435d4a78bdca4d6a018b578e/abbbaaabb.aab I
      // b4: goto b8
      // b7: athrow
      // b8: bipush 0
      // b9: ireturn
      // ba: bipush 1
      // bb: ireturn
   }

   private boolean aab(class_310 param1, int param2, int param3) {
      // $VF: Couldn't be decompiled
      // Please report this to the Vineflower issue tracker, at https://github.com/Vineflower/vineflower/issues with a copy of the class file (if you have the rights to distribute it!)
      // java.lang.RuntimeException: parsing failure!
      //   at org.jetbrains.java.decompiler.modules.decompiler.decompose.DomHelper.parseGraph(DomHelper.java:211)
      //   at org.jetbrains.java.decompiler.main.rels.MethodProcessor.codeToJava(MethodProcessor.java:166)
      //
      // Bytecode:
      // 00: getstatic qeaa361f143ee4a0894bd168fd9b30c66/qf4ccf8f5435d4a78bdca4d6a018b578e/aabbabbab.ab I
      // 03: invokestatic java/lang/System.currentTimeMillis ()J
      // 06: lstore 5
      // 08: istore 4
      // 0a: aload 0
      // 0b: getfield qeaa361f143ee4a0894bd168fd9b30c66/qf4ccf8f5435d4a78bdca4d6a018b578e/abbbaaabb.aaa I
      // 0e: iload 4
      // 10: ifne 80
      // 13: iload 2
      // 14: if_icmpeq 70
      // 17: goto 1b
      // 1a: athrow
      // 1b: aload 0
      // 1c: iload 2
      // 1d: putfield qeaa361f143ee4a0894bd168fd9b30c66/qf4ccf8f5435d4a78bdca4d6a018b578e/abbbaaabb.aaa I
      // 20: aload 1
      // 21: invokestatic qeaa361f143ee4a0894bd168fd9b30c66/qf4ccf8f5435d4a78bdca4d6a018b578e/aabbabbbb.baabaab (Lnet/minecraft/class_310;)I
      // 24: iload 4
      // 26: ifne 3a
      // 29: goto 2d
      // 2c: athrow
      // 2d: iload 3
      // 2e: if_icmpeq 3d
      // 31: goto 35
      // 34: athrow
      // 35: bipush 1
      // 36: goto 3a
      // 39: athrow
      // 3a: goto 3e
      // 3d: bipush 0
      // 3e: istore 7
      // 40: aload 0
      // 41: lload 5
      // 43: iload 7
      // 45: ifeq 54
      // 48: aload 0
      // 49: aload 0
      // 4a: getfield qeaa361f143ee4a0894bd168fd9b30c66/qf4ccf8f5435d4a78bdca4d6a018b578e/abbbaaabb.aaab Lqeaa361f143ee4a0894bd168fd9b30c66/qf4ccf8f5435d4a78bdca4d6a018b578e/aaabbbab;
      // 4d: invokevirtual qeaa361f143ee4a0894bd168fd9b30c66/qf4ccf8f5435d4a78bdca4d6a018b578e/abbbaaabb.bab (Lqeaa361f143ee4a0894bd168fd9b30c66/qf4ccf8f5435d4a78bdca4d6a018b578e/aaabbbab;)J
      // 50: goto 55
      // 53: athrow
      // 54: lconst_0
      // 55: ladd
      // 56: putfield qeaa361f143ee4a0894bd168fd9b30c66/qf4ccf8f5435d4a78bdca4d6a018b578e/abbbaaabb.aabb J
      // 59: aload 0
      // 5a: ldc_w -74918273
      // 5d: ldc_w -1908687123
      // 60: ldc_w -1432667861
      // 63: ixor
      // 64: invokestatic qeaa361f143ee4a0894bd168fd9b30c66/qf4ccf8f5435d4a78bdca4d6a018b578e/abbbaaabb.a (II)I
      // 67: ldc2_w 3159556606398944802
      // 6a: invokestatic qeaa361f143ee4a0894bd168fd9b30c66/qf4ccf8f5435d4a78bdca4d6a018b578e/abbbaaabb.bbb (IJ)J
      // 6d: putfield qeaa361f143ee4a0894bd168fd9b30c66/qf4ccf8f5435d4a78bdca4d6a018b578e/abbbaaabb.bbba J
      // 70: lload 5
      // 72: iload 4
      // 74: ifne 8a
      // 77: aload 0
      // 78: getfield qeaa361f143ee4a0894bd168fd9b30c66/qf4ccf8f5435d4a78bdca4d6a018b578e/abbbaaabb.aabb J
      // 7b: lcmp
      // 7c: goto 80
      // 7f: athrow
      // 80: ifge 86
      // 83: bipush 0
      // 84: ireturn
      // 85: athrow
      // 86: aload 0
      // 87: getfield qeaa361f143ee4a0894bd168fd9b30c66/qf4ccf8f5435d4a78bdca4d6a018b578e/abbbaaabb.bbba J
      // 8a: ldc_w -74918274
      // 8d: ldc_w -1908687123
      // 90: ldc_w 2027461362
      // 93: ixor
      // 94: invokestatic qeaa361f143ee4a0894bd168fd9b30c66/qf4ccf8f5435d4a78bdca4d6a018b578e/abbbaaabb.a (II)I
      // 97: ldc2_w 3848252472189630803
      // 9a: invokestatic qeaa361f143ee4a0894bd168fd9b30c66/qf4ccf8f5435d4a78bdca4d6a018b578e/abbbaaabb.bbb (IJ)J
      // 9d: iload 4
      // 9f: ifne c3
      // a2: lcmp
      // a3: ifne bd
      // a6: goto aa
      // a9: athrow
      // aa: aload 0
      // ab: lload 5
      // ad: aload 0
      // ae: aload 0
      // af: getfield qeaa361f143ee4a0894bd168fd9b30c66/qf4ccf8f5435d4a78bdca4d6a018b578e/abbbaaabb.abb Lqeaa361f143ee4a0894bd168fd9b30c66/qf4ccf8f5435d4a78bdca4d6a018b578e/aaabbbab;
      // b2: invokevirtual qeaa361f143ee4a0894bd168fd9b30c66/qf4ccf8f5435d4a78bdca4d6a018b578e/abbbaaabb.bab (Lqeaa361f143ee4a0894bd168fd9b30c66/qf4ccf8f5435d4a78bdca4d6a018b578e/aaabbbab;)J
      // b5: ladd
      // b6: putfield qeaa361f143ee4a0894bd168fd9b30c66/qf4ccf8f5435d4a78bdca4d6a018b578e/abbbaaabb.bbba J
      // b9: goto bd
      // bc: athrow
      // bd: lload 5
      // bf: aload 0
      // c0: getfield qeaa361f143ee4a0894bd168fd9b30c66/qf4ccf8f5435d4a78bdca4d6a018b578e/abbbaaabb.bbba J
      // c3: lcmp
      // c4: iload 4
      // c6: ifne d1
      // c9: iflt d4
      // cc: goto d0
      // cf: athrow
      // d0: bipush 1
      // d1: goto d5
      // d4: bipush 0
      // d5: ireturn
   }

   private float aba(class_1701 var1) {
      double var2 = var1.method_18798().method_37267();
      return (float)(4.0 + 1.5 * Math.min(var2, 5.0));
   }

   // $VF: Irreducible bytecode was duplicated to produce valid code
   static {
      int var40 = -1339752223;
      char[] var10002 = "痋甘甁画甡画甡画".toCharArray();
      byte var36 = -1;
      char[] var31 = var10002;
      String var30 = "븬븹빥븕븼뺡븺빺뺹뺰빶븿븥뺁뻹븘뻲뻒빺뺧뻵뻫뻳빜븳뺃뺻뺅뻮뻆뻋뺓뺠뻆빉빠뻐뺕뻑빞븉뻾븣뻍뻮빚븟뺼뻨빒뻋뻾뺵뻍븇븪뻏븿븶븖븯뻾븥뺠빘뻦뻴븄뺤뺹뻉뺶뻺뻶뻘빓브븒븥빤뺶빬븶뺤븒뺦뺅빸빑빃뻃뻁븝빇븩븷븉뻢뻐빒빸뺇뺵빈뻳뺆빷뻷뺊빅뻍빛빣빭븄븜빢빥뻿뻑뺃뺸뺝뺉븢뺸블뻓빜빧뺘븷븄빠븬뺳뺏븘빔빫뻓뻟뺴뻨빗븝븕빗뻬뺋뻦빋뻔빂뺟빈뺽뺛븽븬븾빁뻌빧뺞븜뺊빲뻇빻븦뺈뺎뻙빕뺆뺙뻮뺀뻰뻩뺄뻟빚빍뻆빏뺙뺠빷뺗뻯빌븧븛븄뺝븐븝뺅뺻빼뻦뺹븻뻔뺜뺰뺤뻳뺌빞뺁뻓뻃뻋뺘빋븳뻹빔븥뻃뻋뻬빕빏븍븘빖빈븚빰뻎븙븬뻓뻀뺀뻻뻗뺢뻂빚뻆뻙븞빬븷븄\ue2ae\ue2b5\ue2c8\ue2e6\ue29e\ue27f\ue248\ue212\ue234\ue2d3\ue2fc\ue20f\ue21e\ue276\ue24b\ue2e1\ue29c\ue2a9\ue27b\ue2f5\ue269\ue2bc\ue28f\ue25a\ue2f7\ue27c\ue216\ue29b\ue29f\ue226\ue21d\ue22d\ue28e\ue2f8\ue25a\ue2f8\ue26e\ue265\ue276\ue27c\ue26c炼炓炰热烳瀥烫烕点瀅烄瀹灬炬烌為灰炸烸烹灰瀌烟瀨烟炧灥炆烩炎灿炪炫炎瀸烞瀱炜瀯炜炙烌烤瀞災烎瀎烚\udaf6\uda77\uda9f\udab2\udae1\udaf7\uda03\uda8e\uda3b\udac6忨弆彦忼弦彃弒彘德弇弛彝彮忲弯微葇蓆萮萃葐葆蒲萿蒊葷凫儀兒儍兔優儔儧兜公冥出冸冓儇凮쓷쑶쒞쒳쓠쓶쐂쒏쐺쓇";
      short var29 = 30001;
      String[] var32 = new String[var31.length];

      while (true) {
         int var33 = 0;
         int var34 = 0;
         int var35 = 0;
         if (var36 == 0) {
            aabaa = var32;
            aabab = new Object[var32.length];
            int var25 = 1388764865;
            byte[] var23 = "ÂR*ó<¿D°e\u0093H=G\u008e\u0013ôåF%qÚ\u0019\u0084eÄÀ]ÜU¸p,\u0098kv¢+â¥¤Á`a\u0017&v[\u001bÀ\u001bî\u0004W\u0081UKÍ~ÈýV\u001d6û\u0088\u0090\u0001Æ(ÓÂO\u0085ªç\u0094ì«üKQUì\u0083bÎ\"1]¿³\u0007\u008dº\u0089ªÉéGÏ%6\u009a\u001dæÇ(\u0002°\u0099Ö\u008a\u0090Ù\u008fvÇ¼\u0016L\u0080ã\u001fV8ïN^r\u0011&û RúÓ\u008b¯îC²ÿ?TYÄÇxÖYµü$£BÒ©:¬tZ\n\u0016À°ô\u0013;\u0093£\u0084\u0098#7®}ÀWªq ¤\u0015\u008e¹\u007f\u0003\u008d¶BE\u0002\u0004EeÆ{©¾<RÁ\u0090!8äÛÄk]\u0089ü\u0083KÖß\u0095\u009c\u0016V\u0015xu{\u000fCY¦ÀyÝ\u00041âM\u0080y\u00997½k\u009c{!/A_`æ ÀgF²(B\u0082þhÅ¹\u008aÌ\u0006\u008c®,\u0090î.ð)TuÂëðB\u001dvKw/\u0091EÛjß}\u0098I\u0087\u009d\u0083Ý-\u0099íW¿\u0002Kn\u00aduË¯$¨Þ~\u009a\u0092\roïI6KbP%`¢K\u0092\u0081¹ñe^ÜzkT\"2»°\u0083éP\u001a\u0018½ÀÑÓgE\u0013\bà$f¿6\u0083§&\u001eµÝ1Ò¨¨+\u0082\u008a\u0083L)Ü\r\u001cmQ#·Ð\u0085s\u0006]Y\u001cóði\u0012Ê}Wkêó\u000bg?Ë÷¤\u0005Êu+\u007f\u0082\bÏg3\u0095\u0085«tQOÀ\u0090íG?6»wµ|\u001f*Ýw$¢\u008e\u0018\u000f.³èì%Ö¢ý1\u0093\u000bÎ\u001eÔäÐbì\u0002_\u00ad¥÷ÆcéeÛf$ãÄ\u0019Ç\u001c>\u0086·ØTQÐöW\u0004Ý\u008dJÝ(ÝÀ\u0089zY¬(%¸M±\u0086%ã\u008d\u001eû\u0019cÖK\u0019ÁQî³\u000e\\\bv\u001awÅ\u0001\u0096\u0080ü/\u0097H\u001dn\u008dqþþ\u001a\u00ad\u000b\u001b«³\u0083_q\u0003¼wÕ«ÄÕ\u0015\u0086süCJ\u0081#á}â\u0012/ý\u009a\u001d*\u0010\u0088Ù\u0085ØõÈÏqJ\u0080\u0085i\u008bâ\u0001(\"É±\u0017\u0010qDõðËñÅ=7pU!lAÛ\u009dÁ\u000b#Òû¬/éH\u0000\u0015\u0001×¬oÉdõ»0\u0010\u00ad@\u009c/$üQ\u009cöÄÛ\b\büa\r#\b\u0088\u009cMÿû«»!\u009c \u001cùu|{WGr»5\u0019\u0002°S' \u0012«wÁÒSrd\u0019\u0087Ô»¤o\u0084¼\u0094\u0017×úk1Ø\u0096\u0097\u001c¶1¤\u0012Ðo:Ø;C\u0095@W©\u0095°ÏÕß¢\u0085r%µl\u0011$\u0081d\u0019\u0081ç6fåÿ¢ª\u0015Rj8â´\u008b\u0090Wæ\u0086\u0096ÈÕ\u0093Ä£3l,ë¬\u00955C`Àf\u0088öyÆ-¶\u0087¾\u001eU5Ü\u008aî)\u0081-gó0^\u0018:Ð#ÞJ1\bG\tfx\u001c\u000bäñ(Ê62|\u0002÷>\u0007\r78\u0099q\u008aç3\u0087fý¤óË:T\u008d¨YÐK½\u0087]?\u0099\u001c\u000f\rÜÙÙ\ró7=ôL\u001dZkºæØÞ³\u0004Ö\u008bä+»ÃØ\u009f\u0081IiÉôòs$¥\u0091MÊ«\u0012·Ìð\u0017ný]¸Ë¡Èux\u0084À\u0010\u0087Y.ê@!W\t¹\u0019¹ØÂ>]\u0018B\u0086Qq\u008b®ÐÇ[G»QAnS«ýSÇ\u0004ýPi\u001e\u008a:§'3\u00ad!üª7!\u0012w\u0094V\u0011Ú_ïÊ\fE¯\rùÉ\u0081`\u0099üGêJîÏ+b\u009c ý\u008fv\u0096ðÖI\nTøphjaÀb)U(\u0013gèéá\u0003vaÉ\u0097\u0004\u0011\u001dnÈàÌ\u0007¢j$ú²ã\u009b/\u0017)\u0093(TU{Z\u00adî¥\u009b'½\u0019T\u0082P \u0085A6A¯ËWtHÌó\u009f\\ßÇ¢\b¯|o\n\u00ad\u001e=\u0006Voí\u0087¬²ÏÂo\u0001%¢$õN\u0019øcf·\u009am½\"mRh©y\u009fâ\u001bî3Ý\u0018^g\u0001ª\u008b\u0089B4Z\u0080\u008béÐ\u0087ÜÝ\u0092>\u0089\u0081ã¦\u0094\u001f ôx\u0097Ô\b¼û´T\u0089«\u00ada\"éò\u0017\u0002øâ\u0000×,aE³8\r\u0018Ö\u000fÁb\u009f7×U\u007f\u008e\u001e\u0007\r£;\u0002üu\u0088Íèe[ôÖÞÚ üÙ÷6U\u009aYþQ\u0090h\\ÐJÄmÌ½\u001fé\u009bAg:à\u0083¯¶Ê\u0091¿\u000b\"sFj\u0085-Ã%Ìyf1\u0000J÷°i,× 0]Þy¼fµ\u0018î\\\u008eBu\u000eÉÚER\u0012@¸¼~\u008b^\u0012O\u00855p¥»ß;×íÌPJ \u001d·\u0091 ïag<ú0!´õKËË\u001cáX,\u0015`<&§ÅÉb\f\u0010yw\u0013âC\u0012a´¹7£o\u0010þW\u0089`à¶\u0088K=÷\u0013S\u009c\u001aÂU\u0000½oTnT\u009c\u0095\u00965\bÜ\u0091sHøa`3\u0002\u0084-\nÀ3C¸\u0085\u008eÚy}aB\u0019\u0095wÐb`\u0083ww\u008b%N"
               .getBytes("ISO-8859-1");
            int var24 = var23.length / 4;
            aaabb = new int[var24];
            byte var26 = 0;
            int var27 = 0;

            do {
               int var28 = (var23[var26] & 255) << 24 | (var23[var26 + 1] & 255) << 16 | (var23[var26 + 2] & 255) << 8 | var23[var26 + 3] & 255;
               var28 ^= var25;
               aaabb[var27] = var28;
               var26 += 4;
            } while (++var27 < var24);

            String[] var21 = new String[a(-74918027, var40 ^ -1403998801)];
            int var19 = 0;
            String var18;
            int var20 = (var18 = b(491729509, var40 ^ -2045573306)).length();
            int var17 = a(-74918028, var40 ^ 1535846400);
            int var43 = -1;

            label128:
            while (true) {
               String var46 = var18.substring(++var43, var43 + var17);
               int var10001 = -1;

               while (true) {
                  label123: {
                     char[] var53 = var46.toCharArray();
                     int var10003 = var53.length;
                     int var22 = 0;
                     var10002 = var53;
                     var10001 = var10003;
                     char[] var84;
                     int var10004;
                     if (var10003 <= 1) {
                        var84 = var53;
                        var10004 = var22;
                     } else {
                        var10002 = var53;
                        var10001 = var10003;
                        if (var10003 <= var22) {
                           break label123;
                        }

                        var84 = var53;
                        var10004 = var22;
                     }

                     while (true) {
                        var84[var10004] = (char)(var84[var10004] ^ switch (var22 % a(-74918031, var40 ^ 1999358815)) {
                           case 0 -> a(-74918032, var40 ^ -1781355805);
                           case 1 -> a(-74918033, var40 ^ -883432385);
                           case 2 -> a(-74918034, var40 ^ -1611468464);
                           case 3 -> a(-74918035, var40 ^ -1402768904);
                           case 4 -> a(-74918036, var40 ^ -901553727);
                           case 5 -> 4;
                           default -> a(-74918037, var40 ^ -1152730682);
                        });
                        var22++;
                        if (var10001 == 0) {
                           var10004 = var10001;
                           var84 = var10002;
                        } else {
                           if (var10001 <= var22) {
                              break;
                           }

                           var84 = var10002;
                           var10004 = var22;
                        }
                     }
                  }

                  String var91 = new String(var10002).intern();
                  switch (var10001) {
                     case 0:
                        var21[var19++] = var91;
                        if ((var43 += var17) >= var20) {
                           aba = var21;
                           aaaa = new String[a(-74918030, var40 ^ 1698395822)];
                           long var8 = 2553223189980758677L;
                           long[] var14 = new long[a(-74918038, var40 ^ -2145265513)];
                           int var11 = 0;
                           String var12;
                           int var13 = (var12 = b(491729511, var40 ^ 1216893314)).length();
                           byte var10 = 0;

                           label102:
                           while (true) {
                              int var60 = var10;
                              var10 += 8;
                              var46 = var12.substring(var60, var10);
                              var60 = 491729510;
                              int var77 = var40 ^ -490852639;
                              byte[] var15 = var46.getBytes("ISO-8859-1");
                              long[] var49 = var14;
                              var60 = var11++;
                              long var78 = (var15[0] & 255L) << a(-74918039, var40 ^ -1172667841)
                                 | (var15[1] & 255L) << a(-74918040, var40 ^ -396551178)
                                 | (var15[2] & 255L) << a(-74918041, var40 ^ -1266253588)
                                 | (var15[3] & 255L) << a(-74918042, var40 ^ 1525304083)
                                 | (var15[4] & 255L) << a(-74918043, var40 ^ -186956461)
                                 | (var15[5] & 255L) << a(-74918044, var40 ^ -1775142016)
                                 | (var15[a(-74918045, var40 ^ -582799966)] & 255L) << a(-74918046, var40 ^ -1226907540)
                                 | var15[a(-74918047, var40 ^ 1359306882)] & 255L;
                              byte var92 = -1;

                              while (true) {
                                 long var96 = var78 ^ var8;
                                 switch (var92) {
                                    case 0:
                                       var49[var60] = var96;
                                       if (var10 >= var13) {
                                          ab = var14;
                                          baa = new Integer[a(-74918121, var40 ^ -1987821997)];
                                          babb = aaabb(a(-74918122, var40 ^ 1878290842), 4788079605971907090L);
                                          bbbb = aaabb(a(-74918123, var40 ^ 1860149742), 8460479208789012743L);
                                          long var0 = 1925504712149262392L;
                                          long[] var6 = new long[2];
                                          int var3 = 0;
                                          String var4;
                                          int var5 = (var4 = b(491729507, var40 ^ 1766142414)).length();
                                          byte var2 = 0;

                                          do {
                                             int var65 = var2;
                                             var2 += 8;
                                             var46 = var4.substring(var65, var2);
                                             var65 = 491729506;
                                             int var81 = var40 ^ -54559629;
                                             byte[] var7 = var46.getBytes("ISO-8859-1");
                                             var65 = var3++;
                                             var96 = (
                                                   (var7[0] & 255L) << a(-74918124, var40 ^ -171484115)
                                                      | (var7[1] & 255L) << a(-74918125, var40 ^ 616677749)
                                                      | (var7[2] & 255L) << a(-74918126, var40 ^ -1983861131)
                                                      | (var7[3] & 255L) << a(-74918127, var40 ^ 2046907919)
                                                      | (var7[4] & 255L) << a(-74918128, var40 ^ -297250464)
                                                      | (var7[5] & 255L) << a(-74918129, var40 ^ -1368612524)
                                                      | (var7[a(-74918130, var40 ^ -711572434)] & 255L) << a(-74918131, var40 ^ -329976995)
                                                      | var7[a(-74918132, var40 ^ 1578192602)] & 255L
                                                )
                                                ^ var0;
                                             byte var94 = -1;
                                             var6[var65] = var96;
                                          } while (var2 < var5);

                                          ba = var6;
                                          bbaa = new Long[2];
                                          return;
                                       }
                                       break;
                                    default:
                                       var49[var60] = var96;
                                       if (var10 < var13) {
                                          continue label102;
                                       }

                                       var13 = (var12 = b(491729505, var40 ^ 1740838226)).length();
                                       var10 = 0;
                                 }

                                 int var63 = var10;
                                 var10 += 8;
                                 var46 = var12.substring(var63, var10);
                                 var63 = 491729504;
                                 int var80 = var40 ^ -1139835699;
                                 var15 = var46.getBytes("ISO-8859-1");
                                 var49 = var14;
                                 var60 = var11++;
                                 var78 = (var15[0] & 255L) << a(-74918048, var40 ^ -2014053191)
                                    | (var15[1] & 255L) << a(-74918113, var40 ^ -692751055)
                                    | (var15[2] & 255L) << a(-74918114, var40 ^ -1386280143)
                                    | (var15[3] & 255L) << a(-74918115, var40 ^ 130870307)
                                    | (var15[4] & 255L) << a(-74918116, var40 ^ -2035751240)
                                    | (var15[5] & 255L) << a(-74918117, var40 ^ 593338924)
                                    | (var15[a(-74918118, var40 ^ -152193276)] & 255L) << a(-74918119, var40 ^ 81252971)
                                    | var15[a(-74918120, var40 ^ 1378744247)] & 255L;
                                 var92 = 0;
                              }
                           }
                        }

                        var17 = var18.charAt(var43);
                        break;
                     default:
                        var21[var19++] = var91;
                        if ((var43 += var17) < var20) {
                           var17 = var18.charAt(var43);
                           continue label128;
                        }

                        var20 = (var18 = b(491729508, var40 ^ -634755698)).length();
                        var17 = a(-74918029, var40 ^ -1477182808);
                        var43 = -1;
                  }

                  var46 = var18.substring(++var43, var43 + var17);
                  var10001 = 0;
               }
            }
         }

         do {
            var35 = var31[var33] ^ var29;
            char[] var37 = var30.substring(var34, var34 + var35).toCharArray();
            int var38 = 0;

            do {
               short var39 = switch (var38 % 6) {
                  default -> 175;
                  case 1 -> 175;
                  case 2 -> 240;
                  case 3 -> 107;
                  case 4 -> 208;
                  case 5 -> 143;
               };
               var37[var38] = (char)(var37[var38] ^ var39);
            } while (++var38 < var37.length);

            var32[var33] = new String(var37).intern();
            var34 += var35;
         } while (++var33 < var31.length);

         var36 = 0;
      }
   }

   private Boolean abb(Integer var1) {
      return this.aaaba();
   }

   @Override
   public void aabaa() {
      this.aaaaa++;
      this.babb();
      this.aaba.aaaa();
      this.aaba.aaaabba();
      aabbabbbb.bbaaabb(class_310.method_1551(), this, abbaaabba.aba);
   }

   private long bab(aaabbbab var1) {
      double var2 = var1.bab();
      double var4 = var1.abb();

      try {
         if (var2 == var4) {
            return Math.max(0L, Math.round(var2));
         }
      } catch (MatchException var6) {
         throw var6;
      }

      return Math.max(0L, Math.round(ThreadLocalRandom.current().nextDouble(var2, var4)));
   }

   private void bba(class_310 param1, class_1701 param2, int param3, abaaaabaa param4) {
      // $VF: Couldn't be decompiled
      // Please report this to the Vineflower issue tracker, at https://github.com/Vineflower/vineflower/issues with a copy of the class file (if you have the rights to distribute it!)
      // java.lang.RuntimeException: parsing failure!
      //   at org.jetbrains.java.decompiler.modules.decompiler.decompose.DomHelper.parseGraph(DomHelper.java:211)
      //   at org.jetbrains.java.decompiler.main.rels.MethodProcessor.codeToJava(MethodProcessor.java:166)
      //
      // Bytecode:
      // 00: getstatic qeaa361f143ee4a0894bd168fd9b30c66/qf4ccf8f5435d4a78bdca4d6a018b578e/aabbabbab.ab I
      // 03: aload 0
      // 04: getfield qeaa361f143ee4a0894bd168fd9b30c66/qf4ccf8f5435d4a78bdca4d6a018b578e/abbbaaabb.aaba Lqeaa361f143ee4a0894bd168fd9b30c66/qf4ccf8f5435d4a78bdca4d6a018b578e/ababbbbba;
      // 07: aload 1
      // 08: aload 4
      // 0a: invokevirtual qeaa361f143ee4a0894bd168fd9b30c66/qf4ccf8f5435d4a78bdca4d6a018b578e/abaaaabaa.b ()Lnet/minecraft/class_3965;
      // 0d: aload 0
      // 0e: getfield qeaa361f143ee4a0894bd168fd9b30c66/qf4ccf8f5435d4a78bdca4d6a018b578e/abbbaaabb.baaa Lqeaa361f143ee4a0894bd168fd9b30c66/qf4ccf8f5435d4a78bdca4d6a018b578e/bababa;
      // 11: invokevirtual qeaa361f143ee4a0894bd168fd9b30c66/qf4ccf8f5435d4a78bdca4d6a018b578e/bababa.abbb ()Ljava/lang/Object;
      // 14: checkcast java/lang/Double
      // 17: invokevirtual java/lang/Double.floatValue ()F
      // 1a: invokevirtual qeaa361f143ee4a0894bd168fd9b30c66/qf4ccf8f5435d4a78bdca4d6a018b578e/ababbbbba.bbaba (Lnet/minecraft/class_310;Lnet/minecraft/class_3965;F)F
      // 1d: fstore 6
      // 1f: istore 5
      // 21: fload 6
      // 23: fconst_1
      // 24: fcmpg
      // 25: iload 5
      // 27: ifne 88
      // 2a: ifle 83
      // 2d: goto 31
      // 30: athrow
      // 31: aload 1
      // 32: getfield net/minecraft/class_310.field_1765 Lnet/minecraft/class_239;
      // 35: astore 9
      // 37: aload 9
      // 39: iload 5
      // 3b: ifne 4e
      // 3e: instanceof net/minecraft/class_3965
      // 41: ifeq 8b
      // 44: goto 48
      // 47: athrow
      // 48: aload 9
      // 4a: goto 4e
      // 4d: athrow
      // 4e: checkcast net/minecraft/class_3965
      // 51: astore 8
      // 53: aload 8
      // 55: iload 5
      // 57: ifne 75
      // 5a: invokevirtual net/minecraft/class_3965.method_17777 ()Lnet/minecraft/class_2338;
      // 5d: aload 4
      // 5f: invokevirtual qeaa361f143ee4a0894bd168fd9b30c66/qf4ccf8f5435d4a78bdca4d6a018b578e/abaaaabaa.b ()Lnet/minecraft/class_3965;
      // 62: invokevirtual net/minecraft/class_3965.method_17777 ()Lnet/minecraft/class_2338;
      // 65: invokevirtual net/minecraft/class_2338.equals (Ljava/lang/Object;)Z
      // 68: ifeq 8b
      // 6b: goto 6f
      // 6e: athrow
      // 6f: aload 8
      // 71: goto 75
      // 74: athrow
      // 75: invokevirtual net/minecraft/class_3965.method_17780 ()Lnet/minecraft/class_2350;
      // 78: aload 4
      // 7a: invokevirtual qeaa361f143ee4a0894bd168fd9b30c66/qf4ccf8f5435d4a78bdca4d6a018b578e/abaaaabaa.b ()Lnet/minecraft/class_3965;
      // 7d: invokevirtual net/minecraft/class_3965.method_17780 ()Lnet/minecraft/class_2350;
      // 80: if_acmpne 8b
      // 83: bipush 1
      // 84: goto 88
      // 87: athrow
      // 88: goto 8c
      // 8b: bipush 0
      // 8c: istore 7
      // 8e: iload 5
      // 90: ifne aa
      // 93: iload 7
      // 95: ifne 9e
      // 98: goto 9c
      // 9b: athrow
      // 9c: return
      // 9d: athrow
      // 9e: aload 0
      // 9f: getfield qeaa361f143ee4a0894bd168fd9b30c66/qf4ccf8f5435d4a78bdca4d6a018b578e/abbbaaabb.aaba Lqeaa361f143ee4a0894bd168fd9b30c66/qf4ccf8f5435d4a78bdca4d6a018b578e/ababbbbba;
      // a2: invokevirtual qeaa361f143ee4a0894bd168fd9b30c66/qf4ccf8f5435d4a78bdca4d6a018b578e/ababbbbba.aaaabba ()V
      // a5: iload 5
      // a7: ifne ce
      // aa: aload 0
      // ab: aload 1
      // ac: aload 2
      // ad: invokevirtual net/minecraft/class_1701.method_5628 ()I
      // b0: iload 3
      // b1: aload 4
      // b3: invokevirtual qeaa361f143ee4a0894bd168fd9b30c66/qf4ccf8f5435d4a78bdca4d6a018b578e/abbbaaabb.bbbb (Lnet/minecraft/class_310;IILqeaa361f143ee4a0894bd168fd9b30c66/qf4ccf8f5435d4a78bdca4d6a018b578e/abaaaabaa;)Z
      // b6: ifeq d2
      // b9: aload 0
      // ba: getfield qeaa361f143ee4a0894bd168fd9b30c66/qf4ccf8f5435d4a78bdca4d6a018b578e/abbbaaabb.baba Ljava/util/Set;
      // bd: aload 2
      // be: invokevirtual net/minecraft/class_1701.method_5628 ()I
      // c1: invokestatic java/lang/Integer.valueOf (I)Ljava/lang/Integer;
      // c4: invokeinterface java/util/Set.add (Ljava/lang/Object;)Z 2
      // c9: pop
      // ca: goto ce
      // cd: athrow
      // ce: aload 0
      // cf: invokevirtual qeaa361f143ee4a0894bd168fd9b30c66/qf4ccf8f5435d4a78bdca4d6a018b578e/abbbaaabb.aaaa ()V
      // d2: return
   }

   private static long bbb(int var0, long var1) {
      int var3 = (var0 ^ (int)var1 ^ a(-74918275, 1506812788 ^ -2066859477)) & a(-74918276, 1506812788 ^ -1113664551);
      if (bbaa[var3] == null) {
         bbaa[var3] = ba[var3] ^ var1;
      }

      return bbaa[var3];
   }

   private void aaaa() {
      this.aaa = aaabb(a(-74918277, 414658703 ^ 398592723), 5110402091455189138L);
      this.aabb = bbb(a(-74918278, 414658703 ^ -1738581061), 3848252472189630803L);
      this.bbba = bbb(a(-74918279, 414658703 ^ 1789242518), 3848252472189630803L);
   }

   private static String aaab(int var0, int var1) {
      int var9 = -850891183;
      int var2 = (var0 ^ a(-74918280, var9 ^ 851701822)) & a(-74918281, var9 ^ 1040988003);
      if (aaaa[var2] == null) {
         char[] var3 = aba[var2].toCharArray();

         int var4 = switch (var3[0] & a(-74918282, var9 ^ 722320793)) {
            case 0 -> a(-74918283, var9 ^ 140126964);
            case 1 -> a(-74918284, var9 ^ -1194458919);
            case 2 -> a(-74918285, var9 ^ 1538130977);
            case 3 -> a(-74918286, var9 ^ 995998608);
            case 4 -> a(-74918287, var9 ^ 579251317);
            case 5 -> a(-74918288, var9 ^ 767290330);
            case 6 -> 2;
            case 7 -> a(-74918289, var9 ^ -1615017068);
            case 8 -> a(-74918290, var9 ^ -531623841);
            case 9 -> a(-74918291, var9 ^ -919060908);
            case 10 -> a(-74918292, var9 ^ -1558350518);
            case 11 -> a(-74918293, var9 ^ -257677815);
            case 12 -> a(-74918294, var9 ^ 414349545);
            case 13 -> a(-74918295, var9 ^ 241547298);
            case 14 -> a(-74918296, var9 ^ -1904092544);
            case 15 -> a(-74918297, var9 ^ -1799686385);
            case 16 -> a(-74918298, var9 ^ 1535144790);
            case 17 -> a(-74918299, var9 ^ -1441012963);
            case 18 -> a(-74918300, var9 ^ -496985668);
            case 19 -> a(-74918301, var9 ^ -261761719);
            case 20 -> a(-74918302, var9 ^ -1262947845);
            case 21 -> a(-74918303, var9 ^ 2103012934);
            case 22 -> 0;
            case 23 -> a(-74918304, var9 ^ -582252966);
            case 24 -> a(-74918369, var9 ^ 419940027);
            case 25 -> a(-74918370, var9 ^ 577987269);
            case 26 -> a(-74918371, var9 ^ 391611079);
            case 27 -> a(-74918372, var9 ^ 1977048701);
            case 28 -> a(-74918373, var9 ^ -812880719);
            case 29 -> a(-74918374, var9 ^ 1807463195);
            case 30 -> a(-74918375, var9 ^ -795967124);
            case 31 -> a(-74918376, var9 ^ -568146718);
            case 32 -> a(-74918377, var9 ^ -429791423);
            case 33 -> a(-74918378, var9 ^ 108688128);
            case 34 -> a(-74918379, var9 ^ 34929067);
            case 35 -> a(-74918380, var9 ^ -1716338545);
            case 36 -> a(-74918381, var9 ^ -298712680);
            case 37 -> a(-74918382, var9 ^ 858247378);
            case 38 -> a(-74918383, var9 ^ 167034958);
            case 39 -> a(-74918384, var9 ^ -758127234);
            case 40 -> a(-74918385, var9 ^ -874721699);
            case 41 -> a(-74918386, var9 ^ -798281902);
            case 42 -> a(-74918387, var9 ^ 1788670187);
            case 43 -> a(-74918388, var9 ^ -510461417);
            case 44 -> a(-74918389, var9 ^ -1455284554);
            case 45 -> a(-74918390, var9 ^ 1923724490);
            case 46 -> a(-74918391, var9 ^ 641302458);
            case 47 -> a(-74918392, var9 ^ -54739840);
            case 48 -> a(-74918393, var9 ^ 2078132308);
            case 49 -> a(-74918394, var9 ^ -1384511017);
            case 50 -> a(-74918395, var9 ^ -2058587467);
            case 51 -> a(-74918396, var9 ^ 1230046777);
            case 52 -> a(-74918397, var9 ^ 426978722);
            case 53 -> a(-74918398, var9 ^ -1306156048);
            case 54 -> a(-74918399, var9 ^ -156725852);
            case 55 -> a(-74918400, var9 ^ 1266474328);
            case 56 -> a(-74918337, var9 ^ -962546880);
            case 57 -> a(-74918338, var9 ^ 1804647652);
            case 58 -> a(-74918339, var9 ^ -424753795);
            case 59 -> a(-74918340, var9 ^ 1760741638);
            case 60 -> a(-74918341, var9 ^ 1343097434);
            case 61 -> a(-74918342, var9 ^ 1368163546);
            case 62 -> a(-74918343, var9 ^ 435249403);
            case 63 -> a(-74918344, var9 ^ -1469305980);
            case 64 -> a(-74918345, var9 ^ -274144868);
            case 65 -> a(-74918346, var9 ^ 185919999);
            case 66 -> a(-74918347, var9 ^ -1388127841);
            case 67 -> a(-74918348, var9 ^ -404323106);
            case 68 -> a(-74918349, var9 ^ -321057614);
            case 69 -> a(-74918350, var9 ^ -2080997186);
            case 70 -> a(-74918351, var9 ^ 1930791543);
            case 71 -> a(-74918352, var9 ^ 956604396);
            case 72 -> a(-74918353, var9 ^ -1875398302);
            case 73 -> a(-74918354, var9 ^ 2133445975);
            case 74 -> a(-74918355, var9 ^ -1717173332);
            case 75 -> a(-74918356, var9 ^ 1816120783);
            case 76 -> a(-74918357, var9 ^ -31274926);
            case 77 -> a(-74918358, var9 ^ 2017310470);
            case 78 -> a(-74918359, var9 ^ -2016991060);
            case 79 -> a(-74918360, var9 ^ 1135476695);
            case 80 -> a(-74918361, var9 ^ 1840163411);
            case 81 -> a(-74918362, var9 ^ 380859224);
            case 82 -> a(-74918363, var9 ^ 1178150616);
            case 83 -> a(-74918364, var9 ^ -1034582135);
            case 84 -> a(-74918365, var9 ^ 599007055);
            case 85 -> a(-74918366, var9 ^ -1105583166);
            case 86 -> a(-74918367, var9 ^ 1625345447);
            case 87 -> a(-74918368, var9 ^ -790597884);
            case 88 -> a(-74918177, var9 ^ 1967825183);
            case 89 -> a(-74918178, var9 ^ -1819298688);
            case 90 -> a(-74918179, var9 ^ 1593325663);
            case 91 -> a(-74918180, var9 ^ 1742092755);
            case 92 -> a(-74918181, var9 ^ -2036915237);
            case 93 -> a(-74918182, var9 ^ 1695003778);
            case 94 -> a(-74918183, var9 ^ -1864235791);
            case 95 -> a(-74918184, var9 ^ 413589071);
            case 96 -> a(-74918185, var9 ^ 663649190);
            case 97 -> a(-74918186, var9 ^ 1596767126);
            case 98 -> a(-74918187, var9 ^ -402264651);
            case 99 -> a(-74918188, var9 ^ 450514894);
            case 100 -> a(-74918189, var9 ^ 2045477170);
            case 101 -> a(-74918190, var9 ^ 31753557);
            case 102 -> a(-74918191, var9 ^ 320875474);
            case 103 -> a(-74918192, var9 ^ 1848730032);
            case 104 -> a(-74918193, var9 ^ -780588503);
            case 105 -> a(-74918194, var9 ^ 270249559);
            case 106 -> a(-74918195, var9 ^ -1188028666);
            case 107 -> a(-74918196, var9 ^ -1953961272);
            case 108 -> a(-74918197, var9 ^ 1798463394);
            case 109 -> a(-74918198, var9 ^ -1496392119);
            case 110 -> a(-74918199, var9 ^ -1164579066);
            case 111 -> a(-74918200, var9 ^ 104375417);
            case 112 -> a(-74918201, var9 ^ 1224868366);
            case 113 -> a(-74918202, var9 ^ 1924247072);
            case 114 -> a(-74918203, var9 ^ -1708260798);
            case 115 -> a(-74918204, var9 ^ 1386044217);
            case 116 -> a(-74918205, var9 ^ -1410792612);
            case 117 -> a(-74918206, var9 ^ 131500959);
            case 118 -> a(-74918207, var9 ^ -899327560);
            case 119 -> a(-74918208, var9 ^ 1089578943);
            case 120 -> a(-74918145, var9 ^ -84636229);
            case 121 -> a(-74918146, var9 ^ 325444566);
            case 122 -> a(-74918147, var9 ^ 1615992263);
            case 123 -> a(-74918148, var9 ^ 131707494);
            case 124 -> a(-74918149, var9 ^ -293218839);
            case 125 -> a(-74918150, var9 ^ -594864746);
            case 126 -> a(-74918151, var9 ^ -2097471996);
            case 127 -> a(-74918152, var9 ^ -1126581203);
            case 128 -> a(-74918153, var9 ^ -331842426);
            case 129 -> a(-74918154, var9 ^ -375539954);
            case 130 -> a(-74918155, var9 ^ 1329728146);
            case 131 -> a(-74918156, var9 ^ 524630666);
            case 132 -> a(-74918157, var9 ^ 1275315457);
            case 133 -> a(-74918158, var9 ^ 1131362561);
            case 134 -> a(-74918159, var9 ^ 768084620);
            case 135 -> a(-74918160, var9 ^ 1268159681);
            case 136 -> a(-74918161, var9 ^ -1598407777);
            case 137 -> a(-74918162, var9 ^ -867157168);
            case 138 -> a(-74918163, var9 ^ 1412198845);
            case 139 -> a(-74918164, var9 ^ 512461731);
            case 140 -> a(-74918165, var9 ^ -135755238);
            case 141 -> a(-74918166, var9 ^ -2084922);
            case 142 -> a(-74918167, var9 ^ -1382069439);
            case 143 -> a(-74918168, var9 ^ 961788798);
            case 144 -> a(-74918169, var9 ^ -238990310);
            case 145 -> a(-74918170, var9 ^ 275380365);
            case 146 -> a(-74918171, var9 ^ 493840260);
            case 147 -> a(-74918172, var9 ^ 138218778);
            case 148 -> a(-74918173, var9 ^ -137018051);
            case 149 -> a(-74918174, var9 ^ 248311210);
            case 150 -> a(-74918175, var9 ^ 1537156612);
            case 151 -> a(-74918176, var9 ^ -499154152);
            case 152 -> a(-74918241, var9 ^ 474460534);
            case 153 -> a(-74918242, var9 ^ -1373297653);
            case 154 -> a(-74918243, var9 ^ -1300725136);
            case 155 -> a(-74918244, var9 ^ 1758064847);
            case 156 -> a(-74918245, var9 ^ -1591112341);
            case 157 -> a(-74918246, var9 ^ -775379210);
            case 158 -> a(-74918247, var9 ^ -1835018525);
            case 159 -> a(-74918248, var9 ^ -1877123544);
            case 160 -> a(-74918249, var9 ^ 1372560394);
            case 161 -> a(-74918250, var9 ^ -1727098670);
            case 162 -> a(-74918251, var9 ^ -1764846070);
            case 163 -> 1;
            case 164 -> a(-74918252, var9 ^ -361543309);
            case 165 -> 3;
            case 166 -> a(-74918253, var9 ^ 480203392);
            case 167 -> a(-74918254, var9 ^ 1748145310);
            case 168 -> a(-74918255, var9 ^ 374470525);
            case 169 -> a(-74918256, var9 ^ -800839189);
            case 170 -> a(-74918257, var9 ^ -1537166669);
            case 171 -> a(-74918258, var9 ^ -1775929527);
            case 172 -> a(-74918259, var9 ^ -1777690618);
            case 173 -> a(-74918260, var9 ^ 1874178971);
            case 174 -> a(-74918261, var9 ^ -264025937);
            case 175 -> a(-74918262, var9 ^ 1162521121);
            case 176 -> a(-74918263, var9 ^ 270369956);
            case 177 -> a(-74918264, var9 ^ 1478570326);
            case 178 -> a(-74918265, var9 ^ -762288244);
            case 179 -> a(-74918266, var9 ^ 1770687393);
            case 180 -> a(-74918267, var9 ^ 179594632);
            case 181 -> a(-74918268, var9 ^ -1991351800);
            case 182 -> a(-74918269, var9 ^ -1936240060);
            case 183 -> a(-74918270, var9 ^ 590483331);
            case 184 -> a(-74918271, var9 ^ -293524895);
            case 185 -> a(-74918272, var9 ^ -1954613345);
            case 186 -> a(-74918209, var9 ^ 1907986195);
            case 187 -> a(-74918210, var9 ^ -1841252405);
            case 188 -> a(-74918211, var9 ^ 1127977017);
            case 189 -> a(-74918212, var9 ^ -2084886294);
            case 190 -> a(-74918213, var9 ^ -361627175);
            case 191 -> a(-74918214, var9 ^ 1554180460);
            case 192 -> a(-74918215, var9 ^ -893861559);
            case 193 -> a(-74918216, var9 ^ 805633292);
            case 194 -> a(-74918217, var9 ^ -1627062602);
            case 195 -> a(-74918218, var9 ^ -2056022794);
            case 196 -> a(-74918219, var9 ^ -1127611519);
            case 197 -> a(-74918220, var9 ^ 1733531665);
            case 198 -> a(-74918221, var9 ^ -1987167689);
            case 199 -> a(-74918222, var9 ^ -1977355931);
            case 200 -> a(-74918223, var9 ^ 1375070999);
            case 201 -> a(-74918224, var9 ^ -1778358413);
            case 202 -> a(-74918225, var9 ^ -77573453);
            case 203 -> a(-74918226, var9 ^ 1907573223);
            case 204 -> a(-74918227, var9 ^ -1332006249);
            case 205 -> 5;
            case 206 -> a(-74918228, var9 ^ 1719064721);
            case 207 -> a(-74918229, var9 ^ 1798301537);
            case 208 -> a(-74918230, var9 ^ -821961216);
            case 209 -> a(-74918231, var9 ^ -241668419);
            case 210 -> a(-74918232, var9 ^ -1297316168);
            case 211 -> a(-74918233, var9 ^ -65976540);
            case 212 -> a(-74918234, var9 ^ -1735405669);
            case 213 -> a(-74918235, var9 ^ 217956198);
            case 214 -> a(-74918236, var9 ^ -181317971);
            case 215 -> a(-74918237, var9 ^ -1671707394);
            case 216 -> a(-74918238, var9 ^ 1632324885);
            case 217 -> a(-74918239, var9 ^ -1259436238);
            case 218 -> a(-74918240, var9 ^ -1280443620);
            case 219 -> a(-74918049, var9 ^ -1051442723);
            case 220 -> a(-74918050, var9 ^ 14553645);
            case 221 -> a(-74918051, var9 ^ -813957537);
            case 222 -> a(-74918052, var9 ^ 515414312);
            case 223 -> a(-74918053, var9 ^ 875755758);
            case 224 -> a(-74918054, var9 ^ -751477745);
            case 225 -> a(-74918055, var9 ^ -953783992);
            case 226 -> a(-74918056, var9 ^ -1823026510);
            case 227 -> 4;
            case 228 -> a(-74918057, var9 ^ -1856720584);
            case 229 -> a(-74918058, var9 ^ -1649426225);
            case 230 -> a(-74918059, var9 ^ 475340215);
            case 231 -> a(-74918060, var9 ^ 1503047248);
            case 232 -> a(-74918061, var9 ^ 970808061);
            case 233 -> a(-74918062, var9 ^ -2113811053);
            case 234 -> a(-74918063, var9 ^ 744735464);
            case 235 -> a(-74918064, var9 ^ -1181418003);
            case 236 -> a(-74918065, var9 ^ 847261948);
            case 237 -> a(-74918066, var9 ^ -2145936169);
            case 238 -> a(-74918067, var9 ^ -2086156257);
            case 239 -> a(-74918068, var9 ^ 829564609);
            case 240 -> a(-74918069, var9 ^ -1348260256);
            case 241 -> a(-74918070, var9 ^ 1915300120);
            case 242 -> a(-74918071, var9 ^ 1181454611);
            case 243 -> a(-74918072, var9 ^ 437913876);
            case 244 -> a(-74918073, var9 ^ -2066130277);
            case 245 -> a(-74918074, var9 ^ 204318311);
            case 246 -> a(-74918075, var9 ^ 1615723313);
            case 247 -> a(-74918076, var9 ^ 810864156);
            case 248 -> a(-74918077, var9 ^ 1913370860);
            case 249 -> a(-74918078, var9 ^ 1662758404);
            case 250 -> a(-74918079, var9 ^ -1214715225);
            case 251 -> a(-74918080, var9 ^ -1544243683);
            case 252 -> a(-74918017, var9 ^ -1808216829);
            case 253 -> a(-74918018, var9 ^ -1406207403);
            case 254 -> a(-74918019, var9 ^ 367503813);
            default -> a(-74918020, var9 ^ 952282606);
         };
         int var5 = (var1 & a(-74918021, var9 ^ -294559161)) - var4;
         if (var5 < 0) {
            var5 += 256;
         }

         int var6 = ((var1 & a(-74918022, var9 ^ 22926456)) >>> a(-74918023, var9 ^ 1159925286)) - var4;
         if (var6 < 0) {
            var6 += 256;
         }

         for (int var7 = 0; var7 < var3.length; var7++) {
            int var8 = var7 % 2;
            char var10002 = var3[var7];
            if (var8 == 0) {
               var3[var7] = (char)(var10002 ^ var5);
               var5 = ((var5 >>> 3 | var5 << 5) ^ var3[var7]) & a(-74918024, var9 ^ 1108253177);
            } else {
               var3[var7] = (char)(var10002 ^ var6);
               var6 = ((var6 >>> 3 | var6 << 5) ^ var3[var7]) & a(-74918025, var9 ^ 27283954);
            }
         }

         aaaa[var2] = new String(var3).intern();
      }

      return aaaa[var2];
   }

   private boolean aaba(class_310 param1, long param2, int param4, int param5, abaaaabaa param6) {
      // $VF: Couldn't be decompiled
      // Please report this to the Vineflower issue tracker, at https://github.com/Vineflower/vineflower/issues with a copy of the class file (if you have the rights to distribute it!)
      // java.lang.RuntimeException: parsing failure!
      //   at org.jetbrains.java.decompiler.modules.decompiler.decompose.DomHelper.parseGraph(DomHelper.java:211)
      //   at org.jetbrains.java.decompiler.main.rels.MethodProcessor.codeToJava(MethodProcessor.java:166)
      //
      // Bytecode:
      // 00: getstatic qeaa361f143ee4a0894bd168fd9b30c66/qf4ccf8f5435d4a78bdca4d6a018b578e/aabbabbab.ab I
      // 03: istore 7
      // 05: lload 2
      // 06: aload 0
      // 07: getfield qeaa361f143ee4a0894bd168fd9b30c66/qf4ccf8f5435d4a78bdca4d6a018b578e/abbbaaabb.aaaaa J
      // 0a: lcmp
      // 0b: iload 7
      // 0d: ifne 45
      // 10: ifne 40
      // 13: goto 17
      // 16: athrow
      // 17: aload 0
      // 18: getfield qeaa361f143ee4a0894bd168fd9b30c66/qf4ccf8f5435d4a78bdca4d6a018b578e/abbbaaabb.aaaab Z
      // 1b: iload 7
      // 1d: ifne 45
      // 20: goto 24
      // 23: athrow
      // 24: ifeq 40
      // 27: goto 2b
      // 2a: athrow
      // 2b: aload 0
      // 2c: iload 7
      // 2e: ifne 4c
      // 31: goto 35
      // 34: athrow
      // 35: aload 1
      // 36: invokevirtual qeaa361f143ee4a0894bd168fd9b30c66/qf4ccf8f5435d4a78bdca4d6a018b578e/abbbaaabb.abbaa (Lnet/minecraft/class_310;)Z
      // 39: ifne 46
      // 3c: goto 40
      // 3f: athrow
      // 40: bipush 0
      // 41: goto 45
      // 44: athrow
      // 45: ireturn
      // 46: aload 0
      // 47: bipush 0
      // 48: putfield qeaa361f143ee4a0894bd168fd9b30c66/qf4ccf8f5435d4a78bdca4d6a018b578e/abbbaaabb.aaaab Z
      // 4b: aload 0
      // 4c: aload 1
      // 4d: iload 4
      // 4f: iload 5
      // 51: aload 6
      // 53: invokevirtual qeaa361f143ee4a0894bd168fd9b30c66/qf4ccf8f5435d4a78bdca4d6a018b578e/abbbaaabb.bbbb (Lnet/minecraft/class_310;IILqeaa361f143ee4a0894bd168fd9b30c66/qf4ccf8f5435d4a78bdca4d6a018b578e/abaaaabaa;)Z
      // 56: istore 8
      // 58: iload 8
      // 5a: iload 7
      // 5c: ifne 7b
      // 5f: ifeq 79
      // 62: goto 66
      // 65: athrow
      // 66: aload 0
      // 67: getfield qeaa361f143ee4a0894bd168fd9b30c66/qf4ccf8f5435d4a78bdca4d6a018b578e/abbbaaabb.baba Ljava/util/Set;
      // 6a: iload 4
      // 6c: invokestatic java/lang/Integer.valueOf (I)Ljava/lang/Integer;
      // 6f: invokeinterface java/util/Set.add (Ljava/lang/Object;)Z 2
      // 74: pop
      // 75: goto 79
      // 78: athrow
      // 79: iload 8
      // 7b: ireturn
   }

   private void aabb(class_310 param1) {
      // $VF: Couldn't be decompiled
      // Please report this to the Vineflower issue tracker, at https://github.com/Vineflower/vineflower/issues with a copy of the class file (if you have the rights to distribute it!)
      // java.lang.RuntimeException: parsing failure!
      //   at org.jetbrains.java.decompiler.modules.decompiler.decompose.DomHelper.parseGraph(DomHelper.java:211)
      //   at org.jetbrains.java.decompiler.main.rels.MethodProcessor.codeToJava(MethodProcessor.java:166)
      //
      // Bytecode:
      // 00: getstatic qeaa361f143ee4a0894bd168fd9b30c66/qf4ccf8f5435d4a78bdca4d6a018b578e/aabbabbab.ab I
      // 03: aload 0
      // 04: getfield qeaa361f143ee4a0894bd168fd9b30c66/qf4ccf8f5435d4a78bdca4d6a018b578e/abbbaaabb.bb Ljava/util/Map;
      // 07: invokeinterface java/util/Map.entrySet ()Ljava/util/Set; 1
      // 0c: invokeinterface java/util/Set.iterator ()Ljava/util/Iterator; 1
      // 11: astore 3
      // 12: istore 2
      // 13: aload 3
      // 14: invokeinterface java/util/Iterator.hasNext ()Z 1
      // 19: ifeq d0
      // 1c: aload 3
      // 1d: invokeinterface java/util/Iterator.next ()Ljava/lang/Object; 1
      // 22: checkcast java/util/Map$Entry
      // 25: astore 4
      // 27: iload 2
      // 28: ifne 64
      // 2b: aload 1
      // 2c: getfield net/minecraft/class_310.field_1724 Lnet/minecraft/class_746;
      // 2f: getfield net/minecraft/class_746.field_6012 I
      // 32: aload 4
      // 34: invokeinterface java/util/Map$Entry.getValue ()Ljava/lang/Object; 1
      // 39: checkcast java/lang/Integer
      // 3c: invokevirtual java/lang/Integer.intValue ()I
      // 3f: isub
      // 40: ldc_w -74918026
      // 43: ldc_w 140416171
      // 46: ldc_w -830002929
      // 49: ixor
      // 4a: invokestatic qeaa361f143ee4a0894bd168fd9b30c66/qf4ccf8f5435d4a78bdca4d6a018b578e/abbbaaabb.a (II)I
      // 4d: ldc2_w 7312816453653208441
      // 50: invokestatic qeaa361f143ee4a0894bd168fd9b30c66/qf4ccf8f5435d4a78bdca4d6a018b578e/abbbaaabb.aaabb (IJ)I
      // 53: if_icmple 68
      // 56: goto 5a
      // 59: athrow
      // 5a: aload 3
      // 5b: invokeinterface java/util/Iterator.remove ()V 1
      // 60: goto 64
      // 63: athrow
      // 64: iload 2
      // 65: ifeq 13
      // 68: new net/minecraft/class_238
      // 6b: dup
      // 6c: aload 4
      // 6e: invokeinterface java/util/Map$Entry.getKey ()Ljava/lang/Object; 1
      // 73: checkcast net/minecraft/class_2338
      // 76: invokespecial net/minecraft/class_238.<init> (Lnet/minecraft/class_2338;)V
      // 79: ldc2_w 1.5
      // 7c: invokevirtual net/minecraft/class_238.method_1014 (D)Lnet/minecraft/class_238;
      // 7f: astore 5
      // 81: iload 2
      // 82: aload 1
      // 83: getfield net/minecraft/class_310.field_1687 Lnet/minecraft/class_638;
      // 86: ldc_w net/minecraft/class_1701
      // 89: aload 5
      // 8b: aload 0
      // 8c: invokedynamic test (Lqeaa361f143ee4a0894bd168fd9b30c66/qf4ccf8f5435d4a78bdca4d6a018b578e/abbbaaabb;)Ljava/util/function/Predicate; bsm=java/lang/invoke/LambdaMetafactory.metafactory (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;Ljava/lang/invoke/MethodType;Ljava/lang/invoke/MethodHandle;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[ (Ljava/lang/Object;)Z, qeaa361f143ee4a0894bd168fd9b30c66/qf4ccf8f5435d4a78bdca4d6a018b578e/abbbaaabb.aabab (Lnet/minecraft/class_1701;)Z, (Lnet/minecraft/class_1701;)Z ]
      // 91: invokevirtual net/minecraft/class_638.method_8390 (Ljava/lang/Class;Lnet/minecraft/class_238;Ljava/util/function/Predicate;)Ljava/util/List;
      // 94: astore 6
      // 96: ifne c6
      // 99: aload 6
      // 9b: invokeinterface java/util/List.isEmpty ()Z 1
      // a0: ifne cc
      // a3: goto a7
      // a6: athrow
      // a7: aload 0
      // a8: getfield qeaa361f143ee4a0894bd168fd9b30c66/qf4ccf8f5435d4a78bdca4d6a018b578e/abbbaaabb.aa Ljava/util/Set;
      // ab: aload 6
      // ad: bipush 0
      // ae: invokeinterface java/util/List.get (I)Ljava/lang/Object; 2
      // b3: checkcast net/minecraft/class_1701
      // b6: invokevirtual net/minecraft/class_1701.method_5628 ()I
      // b9: invokestatic java/lang/Integer.valueOf (I)Ljava/lang/Integer;
      // bc: invokeinterface java/util/Set.add (Ljava/lang/Object;)Z 2
      // c1: pop
      // c2: goto c6
      // c5: athrow
      // c6: aload 3
      // c7: invokeinterface java/util/Iterator.remove ()V 1
      // cc: iload 2
      // cd: ifeq 13
      // d0: return
   }

   private boolean abaa(class_310 var1, long var2, int var4, int var5, abaaaabaa var6) {
      return this.aaba(var1, var2, var4, var5, var6);
   }

   private static int a(int var0, int var1) {
      int var2 = aaabb[var0 ^ -74918305] ^ var1 ^ var0;
      var2 -= 41721;
      var2 += 10623;
      var2 += 11882;
      var2 += 29850;
      var2 -= 20595;
      var2 += 40625;
      return var2 ^ 16627;
   }

   private float abab(class_1701 var1) {
      return Math.max(11.5F, this.aba(var1));
   }

   static boolean abba(float param0, float param1, float param2) {
      // $VF: Couldn't be decompiled
      // Please report this to the Vineflower issue tracker, at https://github.com/Vineflower/vineflower/issues with a copy of the class file (if you have the rights to distribute it!)
      // java.lang.RuntimeException: parsing failure!
      //   at org.jetbrains.java.decompiler.modules.decompiler.decompose.DomHelper.parseGraph(DomHelper.java:211)
      //   at org.jetbrains.java.decompiler.main.rels.MethodProcessor.codeToJava(MethodProcessor.java:166)
      //
      // Bytecode:
      // 00: getstatic qeaa361f143ee4a0894bd168fd9b30c66/qf4ccf8f5435d4a78bdca4d6a018b578e/aabbabbab.ab I
      // 03: istore 3
      // 04: fload 0
      // 05: iload 3
      // 06: ifne 18
      // 09: invokestatic java/lang/Float.isFinite (F)Z
      // 0c: ifeq 33
      // 0f: goto 13
      // 12: athrow
      // 13: fload 0
      // 14: goto 18
      // 17: athrow
      // 18: fconst_0
      // 19: fload 1
      // 1a: invokestatic java/lang/Math.max (FF)F
      // 1d: fconst_0
      // 1e: fload 2
      // 1f: invokestatic java/lang/Math.max (FF)F
      // 22: fadd
      // 23: fcmpl
      // 24: iload 3
      // 25: ifne 30
      // 28: iflt 33
      // 2b: goto 2f
      // 2e: athrow
      // 2f: bipush 1
      // 30: goto 34
      // 33: bipush 0
      // 34: ireturn
   }

   private static boolean abbb(class_310 var0, Integer var1) {
      try {
         if (var0.field_1687.method_8469(var1) == null) {
            return true;
         }
      } catch (MatchException var2) {
         throw var2;
      }

      return false;
   }

   private int baaa(class_310 param1) {
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
      // 05: iload 2
      // 06: ifne 11
      // 09: ifnull 1f
      // 0c: goto 10
      // 0f: athrow
      // 10: aload 1
      // 11: iload 2
      // 12: ifne 31
      // 15: getfield net/minecraft/class_310.field_1724 Lnet/minecraft/class_746;
      // 18: ifnonnull 22
      // 1b: goto 1f
      // 1e: athrow
      // 1f: bipush -1
      // 20: ireturn
      // 21: athrow
      // 22: aload 0
      // 23: iload 2
      // 24: ifne 4b
      // 27: getfield qeaa361f143ee4a0894bd168fd9b30c66/qf4ccf8f5435d4a78bdca4d6a018b578e/abbbaaabb.abab Lqeaa361f143ee4a0894bd168fd9b30c66/qf4ccf8f5435d4a78bdca4d6a018b578e/baabaab;
      // 2a: invokevirtual qeaa361f143ee4a0894bd168fd9b30c66/qf4ccf8f5435d4a78bdca4d6a018b578e/baabaab.abbb ()Ljava/lang/Object;
      // 2d: goto 31
      // 30: athrow
      // 31: getstatic qeaa361f143ee4a0894bd168fd9b30c66/qf4ccf8f5435d4a78bdca4d6a018b578e/baaaabbb.ab Lqeaa361f143ee4a0894bd168fd9b30c66/qf4ccf8f5435d4a78bdca4d6a018b578e/baaaabbb;
      // 34: if_acmpne 44
      // 37: aload 1
      // 38: getfield net/minecraft/class_310.field_1724 Lnet/minecraft/class_746;
      // 3b: aload 1
      // 3c: getfield net/minecraft/class_310.field_1687 Lnet/minecraft/class_638;
      // 3f: invokestatic qeaa361f143ee4a0894bd168fd9b30c66/qf4ccf8f5435d4a78bdca4d6a018b578e/aabbabbbb.baabbaa (Lnet/minecraft/class_746;Lnet/minecraft/class_638;)I
      // 42: ireturn
      // 43: athrow
      // 44: aload 0
      // 45: getfield qeaa361f143ee4a0894bd168fd9b30c66/qf4ccf8f5435d4a78bdca4d6a018b578e/abbbaaabb.bba Lqeaa361f143ee4a0894bd168fd9b30c66/qf4ccf8f5435d4a78bdca4d6a018b578e/bababa;
      // 48: invokevirtual qeaa361f143ee4a0894bd168fd9b30c66/qf4ccf8f5435d4a78bdca4d6a018b578e/bababa.abbb ()Ljava/lang/Object;
      // 4b: checkcast java/lang/Double
      // 4e: invokevirtual java/lang/Double.doubleValue ()D
      // 51: invokestatic java/lang/Math.round (D)J
      // 54: l2i
      // 55: bipush 1
      // 56: isub
      // 57: istore 3
      // 58: aload 0
      // 59: aload 1
      // 5a: iload 3
      // 5b: invokevirtual qeaa361f143ee4a0894bd168fd9b30c66/qf4ccf8f5435d4a78bdca4d6a018b578e/abbbaaabb.bbba (Lnet/minecraft/class_310;I)Z
      // 5e: iload 2
      // 5f: ifne 6a
      // 62: ifeq 6d
      // 65: goto 69
      // 68: athrow
      // 69: iload 3
      // 6a: goto 6e
      // 6d: bipush -1
      // 6e: ireturn
   }

   private static class_2350 baab(double param0, double param2) {
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
      // 06: invokestatic java/lang/Math.abs (D)D
      // 09: iload 4
      // 0b: ifne 30
      // 0e: dload 2
      // 0f: invokestatic java/lang/Math.abs (D)D
      // 12: dcmpl
      // 13: iflt 2f
      // 16: goto 1a
      // 19: athrow
      // 1a: dload 0
      // 1b: dconst_0
      // 1c: dcmpl
      // 1d: iflt 2b
      // 20: goto 24
      // 23: athrow
      // 24: getstatic net/minecraft/class_2350.field_11034 Lnet/minecraft/class_2350;
      // 27: goto 2e
      // 2a: athrow
      // 2b: getstatic net/minecraft/class_2350.field_11039 Lnet/minecraft/class_2350;
      // 2e: areturn
      // 2f: dload 2
      // 30: dconst_0
      // 31: dcmpl
      // 32: iflt 3c
      // 35: getstatic net/minecraft/class_2350.field_11035 Lnet/minecraft/class_2350;
      // 38: goto 3f
      // 3b: athrow
      // 3c: getstatic net/minecraft/class_2350.field_11043 Lnet/minecraft/class_2350;
      // 3f: areturn
   }

   static boolean baba(double param0, double param2) {
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
      // 08: ifne 1a
      // 0b: ldc2_w 100.0
      // 0e: dcmpl
      // 0f: iflt 19
      // 12: goto 16
      // 15: athrow
      // 16: bipush 1
      // 17: ireturn
      // 18: athrow
      // 19: dload 0
      // 1a: iload 4
      // 1c: ifne 2c
      // 1f: dconst_0
      // 20: dcmpg
      // 21: ifgt 2b
      // 24: goto 28
      // 27: athrow
      // 28: bipush 0
      // 29: ireturn
      // 2a: athrow
      // 2b: dload 2
      // 2c: dload 0
      // 2d: dcmpg
      // 2e: iload 4
      // 30: ifne 3b
      // 33: ifge 3e
      // 36: goto 3a
      // 39: athrow
      // 3a: bipush 1
      // 3b: goto 3f
      // 3e: bipush 0
      // 3f: ireturn
   }

   private void babb() {
      this.bb.clear();
      this.aa.clear();
      this.baba.clear();
      this.aaaba.clear();
      this.aaaab = false;
      this.aab = aaabb(a(-74918133, 2019921826 ^ 1470698164), 5110402091455189138L);
      this.aaaa();
      this.aaba.aaaabba();
   }

   @Override
   public void abaab() {
      this.babb();
      this.aaba.babbbb();
   }

   private boolean bbab() {
      try {
         if (this.bbab.abbb() == aaaabaaab.b) {
            return true;
         }
      } catch (MatchException var1) {
         throw var1;
      }

      return false;
   }

   private boolean bbba(class_310 param1, int param2) {
      // $VF: Couldn't be decompiled
      // Please report this to the Vineflower issue tracker, at https://github.com/Vineflower/vineflower/issues with a copy of the class file (if you have the rights to distribute it!)
      // java.lang.RuntimeException: parsing failure!
      //   at org.jetbrains.java.decompiler.modules.decompiler.decompose.DomHelper.parseGraph(DomHelper.java:211)
      //   at org.jetbrains.java.decompiler.main.rels.MethodProcessor.codeToJava(MethodProcessor.java:166)
      //
      // Bytecode:
      // 00: getstatic qeaa361f143ee4a0894bd168fd9b30c66/qf4ccf8f5435d4a78bdca4d6a018b578e/aabbabbab.ab I
      // 03: istore 3
      // 04: aload 1
      // 05: iload 3
      // 06: ifne 11
      // 09: ifnull 4a
      // 0c: goto 10
      // 0f: athrow
      // 10: aload 1
      // 11: getfield net/minecraft/class_310.field_1724 Lnet/minecraft/class_746;
      // 14: ifnull 4a
      // 17: iload 2
      // 18: iload 3
      // 19: ifne 4f
      // 1c: goto 20
      // 1f: athrow
      // 20: iflt 4a
      // 23: goto 27
      // 26: athrow
      // 27: iload 2
      // 28: iload 3
      // 29: ifne 4f
      // 2c: goto 30
      // 2f: athrow
      // 30: ldc_w -74918134
      // 33: ldc_w 2025937347
      // 36: ldc_w 937789494
      // 39: ixor
      // 3a: invokestatic qeaa361f143ee4a0894bd168fd9b30c66/qf4ccf8f5435d4a78bdca4d6a018b578e/abbbaaabb.a (II)I
      // 3d: ldc2_w 8838208594519972416
      // 40: invokestatic qeaa361f143ee4a0894bd168fd9b30c66/qf4ccf8f5435d4a78bdca4d6a018b578e/abbbaaabb.aaabb (IJ)I
      // 43: if_icmplt 50
      // 46: goto 4a
      // 49: athrow
      // 4a: bipush 0
      // 4b: goto 4f
      // 4e: athrow
      // 4f: ireturn
      // 50: aload 1
      // 51: getfield net/minecraft/class_310.field_1724 Lnet/minecraft/class_746;
      // 54: invokevirtual net/minecraft/class_746.method_31548 ()Lnet/minecraft/class_1661;
      // 57: iload 2
      // 58: invokevirtual net/minecraft/class_1661.method_5438 (I)Lnet/minecraft/class_1799;
      // 5b: astore 4
      // 5d: aload 4
      // 5f: iload 3
      // 60: ifne 6c
      // 63: ifnull ad
      // 66: goto 6a
      // 69: athrow
      // 6a: aload 4
      // 6c: iload 3
      // 6d: ifne 80
      // 70: invokevirtual net/minecraft/class_1799.method_7960 ()Z
      // 73: ifne ad
      // 76: goto 7a
      // 79: athrow
      // 7a: aload 4
      // 7c: goto 80
      // 7f: athrow
      // 80: iload 3
      // 81: ifne 97
      // 84: invokevirtual net/minecraft/class_1799.method_7909 ()Lnet/minecraft/class_1792;
      // 87: instanceof net/minecraft/class_1747
      // 8a: ifeq ad
      // 8d: goto 91
      // 90: athrow
      // 91: aload 4
      // 93: goto 97
      // 96: athrow
      // 97: aload 1
      // 98: getfield net/minecraft/class_310.field_1687 Lnet/minecraft/class_638;
      // 9b: invokestatic qeaa361f143ee4a0894bd168fd9b30c66/qf4ccf8f5435d4a78bdca4d6a018b578e/aabbabbbb.abaabab (Lnet/minecraft/class_1799;Lnet/minecraft/class_638;)Z
      // 9e: iload 3
      // 9f: ifne aa
      // a2: ifeq ad
      // a5: goto a9
      // a8: athrow
      // a9: bipush 1
      // aa: goto ae
      // ad: bipush 0
      // ae: ireturn
   }

   private boolean bbbb(class_310 param1, int param2, int param3, abaaaabaa param4) {
      // $VF: Couldn't be decompiled
      // Please report this to the Vineflower issue tracker, at https://github.com/Vineflower/vineflower/issues with a copy of the class file (if you have the rights to distribute it!)
      // java.lang.RuntimeException: parsing failure!
      //   at org.jetbrains.java.decompiler.modules.decompiler.decompose.DomHelper.parseGraph(DomHelper.java:211)
      //   at org.jetbrains.java.decompiler.main.rels.MethodProcessor.codeToJava(MethodProcessor.java:166)
      //
      // Bytecode:
      // 00: getstatic qeaa361f143ee4a0894bd168fd9b30c66/qf4ccf8f5435d4a78bdca4d6a018b578e/aabbabbab.ab I
      // 03: aload 1
      // 04: getfield net/minecraft/class_310.field_1687 Lnet/minecraft/class_638;
      // 07: iload 2
      // 08: invokevirtual net/minecraft/class_638.method_8469 (I)Lnet/minecraft/class_1297;
      // 0b: astore 6
      // 0d: istore 5
      // 0f: aload 6
      // 11: instanceof net/minecraft/class_1701
      // 14: iload 5
      // 16: ifne 86
      // 19: ifeq 85
      // 1c: goto 20
      // 1f: athrow
      // 20: aload 6
      // 22: checkcast net/minecraft/class_1701
      // 25: astore 7
      // 27: aload 7
      // 29: invokevirtual net/minecraft/class_1701.method_31481 ()Z
      // 2c: iload 5
      // 2e: ifne 86
      // 31: ifne 85
      // 34: goto 38
      // 37: athrow
      // 38: aload 0
      // 39: getfield qeaa361f143ee4a0894bd168fd9b30c66/qf4ccf8f5435d4a78bdca4d6a018b578e/abbbaaabb.aa Ljava/util/Set;
      // 3c: iload 2
      // 3d: invokestatic java/lang/Integer.valueOf (I)Ljava/lang/Integer;
      // 40: invokeinterface java/util/Set.contains (Ljava/lang/Object;)Z 2
      // 45: iload 5
      // 47: ifne 86
      // 4a: goto 4e
      // 4d: athrow
      // 4e: ifne 85
      // 51: goto 55
      // 54: athrow
      // 55: aload 0
      // 56: aload 1
      // 57: iload 3
      // 58: invokevirtual qeaa361f143ee4a0894bd168fd9b30c66/qf4ccf8f5435d4a78bdca4d6a018b578e/abbbaaabb.bbba (Lnet/minecraft/class_310;I)Z
      // 5b: iload 5
      // 5d: ifne 86
      // 60: goto 64
      // 63: athrow
      // 64: ifeq 85
      // 67: goto 6b
      // 6a: athrow
      // 6b: aload 0
      // 6c: aload 1
      // 6d: aload 4
      // 6f: invokevirtual qeaa361f143ee4a0894bd168fd9b30c66/qf4ccf8f5435d4a78bdca4d6a018b578e/abaaaabaa.aa ()Lnet/minecraft/class_2338;
      // 72: invokevirtual qeaa361f143ee4a0894bd168fd9b30c66/qf4ccf8f5435d4a78bdca4d6a018b578e/abbbaaabb.abbba (Lnet/minecraft/class_310;Lnet/minecraft/class_2338;)Z
      // 75: iload 5
      // 77: ifne 94
      // 7a: goto 7e
      // 7d: athrow
      // 7e: ifne 87
      // 81: goto 85
      // 84: athrow
      // 85: bipush 0
      // 86: ireturn
      // 87: aload 1
      // 88: iload 5
      // 8a: ifne b7
      // 8d: invokestatic qeaa361f143ee4a0894bd168fd9b30c66/qf4ccf8f5435d4a78bdca4d6a018b578e/aabbabbbb.baabaab (Lnet/minecraft/class_310;)I
      // 90: goto 94
      // 93: athrow
      // 94: iload 3
      // 95: if_icmpne b6
      // 98: aload 1
      // 99: iload 5
      // 9b: ifne b7
      // 9e: goto a2
      // a1: athrow
      // a2: iload 3
      // a3: invokestatic qeaa361f143ee4a0894bd168fd9b30c66/qf4ccf8f5435d4a78bdca4d6a018b578e/aabbabbbb.abaaa (Lnet/minecraft/class_310;I)Z
      // a6: ifeq b6
      // a9: goto ad
      // ac: athrow
      // ad: aload 0
      // ae: aload 1
      // af: aload 4
      // b1: invokevirtual qeaa361f143ee4a0894bd168fd9b30c66/qf4ccf8f5435d4a78bdca4d6a018b578e/abbbaaabb.ababb (Lnet/minecraft/class_310;Lqeaa361f143ee4a0894bd168fd9b30c66/qf4ccf8f5435d4a78bdca4d6a018b578e/abaaaabaa;)Z
      // b4: ireturn
      // b5: athrow
      // b6: aload 1
      // b7: aload 0
      // b8: iload 3
      // b9: aload 0
      // ba: aload 1
      // bb: aload 4
      // bd: invokedynamic getAsBoolean (Lqeaa361f143ee4a0894bd168fd9b30c66/qf4ccf8f5435d4a78bdca4d6a018b578e/abbbaaabb;Lnet/minecraft/class_310;Lqeaa361f143ee4a0894bd168fd9b30c66/qf4ccf8f5435d4a78bdca4d6a018b578e/abaaaabaa;)Ljava/util/function/BooleanSupplier; bsm=java/lang/invoke/LambdaMetafactory.metafactory (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;Ljava/lang/invoke/MethodType;Ljava/lang/invoke/MethodHandle;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[ ()Z, qeaa361f143ee4a0894bd168fd9b30c66/qf4ccf8f5435d4a78bdca4d6a018b578e/abbbaaabb.aaaaa (Lnet/minecraft/class_310;Lqeaa361f143ee4a0894bd168fd9b30c66/qf4ccf8f5435d4a78bdca4d6a018b578e/abaaaabaa;)Z, ()Z ]
      // c2: invokestatic qeaa361f143ee4a0894bd168fd9b30c66/qf4ccf8f5435d4a78bdca4d6a018b578e/aabbabbbb.abbbbaa (Lnet/minecraft/class_310;Ljava/lang/Object;ILjava/util/function/BooleanSupplier;)Z
      // c5: ireturn
   }

   private boolean aaaaa(class_310 var1, abaaaabaa var2) {
      return this.ababb(var1, var2);
   }

   private static boolean aaaab(class_310 var0, Integer var1) {
      try {
         if (var0.field_1687.method_8469(var1) == null) {
            return true;
         }
      } catch (MatchException var2) {
         throw var2;
      }

      return false;
   }

   private boolean aaaba() {
      return baba((Double)this.abba.abbb(), ThreadLocalRandom.current().nextDouble(100.0));
   }

   private static int aaabb(int var0, long var1) {
      int var3 = var0 ^ (int)(var1 & 32767L) ^ a(-74918135, -617052183 ^ 269880191);
      if (baa[var3] == null) {
         baa[var3] = (int)(ab[var3] ^ var1);
      }

      return baa[var3];
   }

   private boolean aabab(class_1701 param1) {
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
      // 05: iload 2
      // 06: ifne 18
      // 09: invokevirtual net/minecraft/class_1701.method_5805 ()Z
      // 0c: ifeq 49
      // 0f: goto 13
      // 12: athrow
      // 13: aload 1
      // 14: goto 18
      // 17: athrow
      // 18: invokevirtual net/minecraft/class_1701.method_31481 ()Z
      // 1b: iload 2
      // 1c: ifne 3a
      // 1f: ifne 49
      // 22: goto 26
      // 25: athrow
      // 26: aload 0
      // 27: getfield qeaa361f143ee4a0894bd168fd9b30c66/qf4ccf8f5435d4a78bdca4d6a018b578e/abbbaaabb.aa Ljava/util/Set;
      // 2a: aload 1
      // 2b: invokevirtual net/minecraft/class_1701.method_5628 ()I
      // 2e: invokestatic java/lang/Integer.valueOf (I)Ljava/lang/Integer;
      // 31: invokeinterface java/util/Set.contains (Ljava/lang/Object;)Z 2
      // 36: goto 3a
      // 39: athrow
      // 3a: iload 2
      // 3b: ifne 46
      // 3e: ifne 49
      // 41: goto 45
      // 44: athrow
      // 45: bipush 1
      // 46: goto 4a
      // 49: bipush 0
      // 4a: ireturn
   }

   private static String b(int var0, int var1) {
      int var3 = var0 ^ 491729509;
      char[] var4 = aabaa[var3].toCharArray();
      StackTraceElement[] var2 = (StackTraceElement[])aabab[var3];
      StackTraceElement[] var5;
      if (var2 != null) {
         var5 = var2;
      } else {
         var5 = new Throwable().getStackTrace();
         aabab[var3] = var5;
      }

      StackTraceElement var6 = var5[1];
      int var7 = (var6.getClassName().hashCode() ^ var6.getMethodName().hashCode()) >> 16 ^ 1868663836;
      int var8 = 0;

      do {
         var4[var8] = (char)(var4[var8] ^ switch (var8 & 31) {
            default -> 192;
            case 1 -> 91;
            case 2 -> 240;
            case 3 -> 36;
            case 4 -> 217;
            case 5 -> 144;
            case 6 -> 73;
            case 7 -> 200;
            case 8 -> 54;
            case 9 -> 76;
            case 10 -> 101;
            case 11 -> 245;
            case 12 -> 20;
            case 13 -> 205;
            case 14 -> 106;
            case 15 -> 180;
            case 16 -> 16;
            case 17 -> 155;
            case 18 -> 124;
            case 19 -> 135;
            case 20 -> 28;
            case 21 -> 228;
            case 22 -> 90;
            case 23 -> 213;
            case 24 -> 254;
            case 25 -> 83;
            case 26 -> 65;
            case 27 -> 15;
            case 28 -> 187;
            case 29 -> 81;
            case 30 -> 105;
            case 31 -> 9;
         } ^ var1 >> 16 ^ var7);
      } while (++var8 < var4.length);

      return new String(var4).intern();
   }

   static boolean aabba(double param0, double param2, double param4, double param6, double param8, double param10) {
      // $VF: Couldn't be decompiled
      // Please report this to the Vineflower issue tracker, at https://github.com/Vineflower/vineflower/issues with a copy of the class file (if you have the rights to distribute it!)
      // java.lang.RuntimeException: parsing failure!
      //   at org.jetbrains.java.decompiler.modules.decompiler.decompose.DomHelper.parseGraph(DomHelper.java:211)
      //   at org.jetbrains.java.decompiler.main.rels.MethodProcessor.codeToJava(MethodProcessor.java:166)
      //
      // Bytecode:
      // 00: dload 4
      // 02: dload 0
      // 03: dsub
      // 04: dstore 13
      // 06: dload 6
      // 08: dload 2
      // 09: dsub
      // 0a: dstore 15
      // 0c: getstatic qeaa361f143ee4a0894bd168fd9b30c66/qf4ccf8f5435d4a78bdca4d6a018b578e/aabbabbab.ab I
      // 0f: dload 8
      // 11: dload 0
      // 12: dsub
      // 13: dstore 17
      // 15: dload 10
      // 17: dload 2
      // 18: dsub
      // 19: dstore 19
      // 1b: istore 12
      // 1d: dload 13
      // 1f: dload 13
      // 21: dmul
      // 22: dload 15
      // 24: dload 15
      // 26: dmul
      // 27: dadd
      // 28: dstore 21
      // 2a: dload 17
      // 2c: dload 13
      // 2e: dmul
      // 2f: dload 19
      // 31: dload 15
      // 33: dmul
      // 34: dadd
      // 35: dstore 23
      // 37: dload 21
      // 39: iload 12
      // 3b: ifne 4f
      // 3e: ldc2_w 1.0E-6
      // 41: dcmpl
      // 42: ifle 76
      // 45: goto 49
      // 48: athrow
      // 49: dload 23
      // 4b: goto 4f
      // 4e: athrow
      // 4f: iload 12
      // 51: ifne 63
      // 54: dconst_0
      // 55: dcmpl
      // 56: ifle 76
      // 59: goto 5d
      // 5c: athrow
      // 5d: dload 23
      // 5f: goto 63
      // 62: athrow
      // 63: dload 21
      // 65: dcmpg
      // 66: iload 12
      // 68: ifne 73
      // 6b: ifge 76
      // 6e: goto 72
      // 71: athrow
      // 72: bipush 1
      // 73: goto 77
      // 76: bipush 0
      // 77: ireturn
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
      // 000: getstatic qeaa361f143ee4a0894bd168fd9b30c66/qf4ccf8f5435d4a78bdca4d6a018b578e/aabbabbab.ab I
      // 003: invokestatic net/minecraft/class_310.method_1551 ()Lnet/minecraft/class_310;
      // 006: astore 2
      // 007: istore 1
      // 008: aload 0
      // 009: iload 1
      // 00a: ifne 025
      // 00d: aload 2
      // 00e: invokevirtual qeaa361f143ee4a0894bd168fd9b30c66/qf4ccf8f5435d4a78bdca4d6a018b578e/abbbaaabb.abbaa (Lnet/minecraft/class_310;)Z
      // 011: ifne 01a
      // 014: goto 018
      // 017: athrow
      // 018: return
      // 019: athrow
      // 01a: aload 0
      // 01b: aload 2
      // 01c: invokevirtual qeaa361f143ee4a0894bd168fd9b30c66/qf4ccf8f5435d4a78bdca4d6a018b578e/abbbaaabb.aabb (Lnet/minecraft/class_310;)V
      // 01f: aload 0
      // 020: aload 2
      // 021: invokevirtual qeaa361f143ee4a0894bd168fd9b30c66/qf4ccf8f5435d4a78bdca4d6a018b578e/abbbaaabb.abbbb (Lnet/minecraft/class_310;)V
      // 024: aload 0
      // 025: getfield qeaa361f143ee4a0894bd168fd9b30c66/qf4ccf8f5435d4a78bdca4d6a018b578e/abbbaaabb.aaaab Z
      // 028: iload 1
      // 029: ifne 064
      // 02c: ifeq 060
      // 02f: goto 033
      // 032: athrow
      // 033: aload 2
      // 034: getfield net/minecraft/class_310.field_1724 Lnet/minecraft/class_746;
      // 037: getfield net/minecraft/class_746.field_6012 I
      // 03a: aload 0
      // 03b: getfield qeaa361f143ee4a0894bd168fd9b30c66/qf4ccf8f5435d4a78bdca4d6a018b578e/abbbaaabb.aab I
      // 03e: isub
      // 03f: bipush 4
      // 040: if_icmple 05e
      // 043: goto 047
      // 046: athrow
      // 047: aload 0
      // 048: dup
      // 049: getfield qeaa361f143ee4a0894bd168fd9b30c66/qf4ccf8f5435d4a78bdca4d6a018b578e/abbbaaabb.aaaaa J
      // 04c: lconst_1
      // 04d: ladd
      // 04e: putfield qeaa361f143ee4a0894bd168fd9b30c66/qf4ccf8f5435d4a78bdca4d6a018b578e/abbbaaabb.aaaaa J
      // 051: iload 1
      // 052: aload 0
      // 053: bipush 0
      // 054: putfield qeaa361f143ee4a0894bd168fd9b30c66/qf4ccf8f5435d4a78bdca4d6a018b578e/abbbaaabb.aaaab Z
      // 057: ifeq 060
      // 05a: goto 05e
      // 05d: athrow
      // 05e: return
      // 05f: athrow
      // 060: aload 2
      // 061: invokestatic qeaa361f143ee4a0894bd168fd9b30c66/qf4ccf8f5435d4a78bdca4d6a018b578e/bbbbbbaa.aabb (Lnet/minecraft/class_310;)Z
      // 064: iload 1
      // 065: ifne 072
      // 068: ifne 07d
      // 06b: goto 06f
      // 06e: athrow
      // 06f: invokestatic qeaa361f143ee4a0894bd168fd9b30c66/qf4ccf8f5435d4a78bdca4d6a018b578e/aabbabbbb.aaaaaba ()Z
      // 072: iload 1
      // 073: ifne 084
      // 076: ifeq 083
      // 079: goto 07d
      // 07c: athrow
      // 07d: aload 0
      // 07e: invokevirtual qeaa361f143ee4a0894bd168fd9b30c66/qf4ccf8f5435d4a78bdca4d6a018b578e/abbbaaabb.aaaa ()V
      // 081: return
      // 082: athrow
      // 083: bipush 0
      // 084: istore 3
      // 085: aload 2
      // 086: getfield net/minecraft/class_310.field_1724 Lnet/minecraft/class_746;
      // 089: invokevirtual net/minecraft/class_746.method_5829 ()Lnet/minecraft/class_238;
      // 08c: ldc2_w 10.0
      // 08f: invokevirtual net/minecraft/class_238.method_1014 (D)Lnet/minecraft/class_238;
      // 092: astore 4
      // 094: aload 2
      // 095: getfield net/minecraft/class_310.field_1687 Lnet/minecraft/class_638;
      // 098: ldc_w net/minecraft/class_1701
      // 09b: aload 4
      // 09d: invokedynamic test ()Ljava/util/function/Predicate; bsm=java/lang/invoke/LambdaMetafactory.metafactory (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;Ljava/lang/invoke/MethodType;Ljava/lang/invoke/MethodHandle;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[ (Ljava/lang/Object;)Z, qeaa361f143ee4a0894bd168fd9b30c66/qf4ccf8f5435d4a78bdca4d6a018b578e/abbbaaabb.ab (Lnet/minecraft/class_1701;)Z, (Lnet/minecraft/class_1701;)Z ]
      // 0a2: invokevirtual net/minecraft/class_638.method_8390 (Ljava/lang/Class;Lnet/minecraft/class_238;Ljava/util/function/Predicate;)Ljava/util/List;
      // 0a5: astore 5
      // 0a7: aload 5
      // 0a9: invokeinterface java/util/List.iterator ()Ljava/util/Iterator; 1
      // 0ae: astore 6
      // 0b0: aload 6
      // 0b2: invokeinterface java/util/Iterator.hasNext ()Z 1
      // 0b7: ifeq 226
      // 0ba: aload 6
      // 0bc: invokeinterface java/util/Iterator.next ()Ljava/lang/Object; 1
      // 0c1: checkcast net/minecraft/class_1701
      // 0c4: astore 7
      // 0c6: aload 0
      // 0c7: iload 1
      // 0c8: ifne 233
      // 0cb: getfield qeaa361f143ee4a0894bd168fd9b30c66/qf4ccf8f5435d4a78bdca4d6a018b578e/abbbaaabb.aa Ljava/util/Set;
      // 0ce: aload 7
      // 0d0: iload 1
      // 0d1: ifne 100
      // 0d4: goto 0d8
      // 0d7: athrow
      // 0d8: invokevirtual net/minecraft/class_1701.method_5628 ()I
      // 0db: invokestatic java/lang/Integer.valueOf (I)Ljava/lang/Integer;
      // 0de: invokeinterface java/util/Set.contains (Ljava/lang/Object;)Z 2
      // 0e3: ifeq 0f2
      // 0e6: goto 0ea
      // 0e9: athrow
      // 0ea: iload 1
      // 0eb: ifeq 0b0
      // 0ee: goto 0f2
      // 0f1: athrow
      // 0f2: aload 0
      // 0f3: iload 1
      // 0f4: ifne 117
      // 0f7: getfield qeaa361f143ee4a0894bd168fd9b30c66/qf4ccf8f5435d4a78bdca4d6a018b578e/abbbaaabb.baba Ljava/util/Set;
      // 0fa: aload 7
      // 0fc: goto 100
      // 0ff: athrow
      // 100: invokevirtual net/minecraft/class_1701.method_5628 ()I
      // 103: invokestatic java/lang/Integer.valueOf (I)Ljava/lang/Integer;
      // 106: invokeinterface java/util/Set.contains (Ljava/lang/Object;)Z 2
      // 10b: ifeq 116
      // 10e: iload 1
      // 10f: ifeq 0b0
      // 112: goto 116
      // 115: athrow
      // 116: aload 0
      // 117: aload 2
      // 118: aload 7
      // 11a: aconst_null
      // 11b: invokevirtual qeaa361f143ee4a0894bd168fd9b30c66/qf4ccf8f5435d4a78bdca4d6a018b578e/abbbaaabb.abaaa (Lnet/minecraft/class_310;Lnet/minecraft/class_1701;Lnet/minecraft/class_2338;)F
      // 11e: aload 2
      // 11f: getfield net/minecraft/class_310.field_1724 Lnet/minecraft/class_746;
      // 122: aload 7
      // 124: invokevirtual net/minecraft/class_1701.method_73189 ()Lnet/minecraft/class_243;
      // 127: aload 0
      // 128: aload 7
      // 12a: invokevirtual qeaa361f143ee4a0894bd168fd9b30c66/qf4ccf8f5435d4a78bdca4d6a018b578e/abbbaaabb.abab (Lnet/minecraft/class_1701;)F
      // 12d: invokestatic qeaa361f143ee4a0894bd168fd9b30c66/qf4ccf8f5435d4a78bdca4d6a018b578e/aaabaaaa.aabb (Lnet/minecraft/class_1309;Lnet/minecraft/class_243;F)F
      // 130: invokestatic java/lang/Math.max (FF)F
      // 133: fstore 8
      // 135: aload 0
      // 136: iload 1
      // 137: ifne 18b
      // 13a: getfield qeaa361f143ee4a0894bd168fd9b30c66/qf4ccf8f5435d4a78bdca4d6a018b578e/abbbaaabb.bbb Lqeaa361f143ee4a0894bd168fd9b30c66/qf4ccf8f5435d4a78bdca4d6a018b578e/baabaab;
      // 13d: invokevirtual qeaa361f143ee4a0894bd168fd9b30c66/qf4ccf8f5435d4a78bdca4d6a018b578e/baabaab.abbb ()Ljava/lang/Object;
      // 140: getstatic qeaa361f143ee4a0894bd168fd9b30c66/qf4ccf8f5435d4a78bdca4d6a018b578e/abababab.b Lqeaa361f143ee4a0894bd168fd9b30c66/qf4ccf8f5435d4a78bdca4d6a018b578e/abababab;
      // 143: if_acmpne 174
      // 146: goto 14a
      // 149: athrow
      // 14a: fload 8
      // 14c: aload 2
      // 14d: getfield net/minecraft/class_310.field_1724 Lnet/minecraft/class_746;
      // 150: invokevirtual net/minecraft/class_746.method_6032 ()F
      // 153: aload 2
      // 154: getfield net/minecraft/class_310.field_1724 Lnet/minecraft/class_746;
      // 157: invokevirtual net/minecraft/class_746.method_6067 ()F
      // 15a: invokestatic qeaa361f143ee4a0894bd168fd9b30c66/qf4ccf8f5435d4a78bdca4d6a018b578e/abbbaaabb.abba (FFF)Z
      // 15d: iload 1
      // 15e: ifne 191
      // 161: goto 165
      // 164: athrow
      // 165: ifne 174
      // 168: goto 16c
      // 16b: athrow
      // 16c: iload 1
      // 16d: ifeq 0b0
      // 170: goto 174
      // 173: athrow
      // 174: aload 0
      // 175: getfield qeaa361f143ee4a0894bd168fd9b30c66/qf4ccf8f5435d4a78bdca4d6a018b578e/abbbaaabb.aaaba Ljava/util/Map;
      // 178: aload 7
      // 17a: invokevirtual net/minecraft/class_1701.method_5628 ()I
      // 17d: invokestatic java/lang/Integer.valueOf (I)Ljava/lang/Integer;
      // 180: aload 0
      // 181: invokedynamic apply (Lqeaa361f143ee4a0894bd168fd9b30c66/qf4ccf8f5435d4a78bdca4d6a018b578e/abbbaaabb;)Ljava/util/function/Function; bsm=java/lang/invoke/LambdaMetafactory.metafactory (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;Ljava/lang/invoke/MethodType;Ljava/lang/invoke/MethodHandle;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[ (Ljava/lang/Object;)Ljava/lang/Object;, qeaa361f143ee4a0894bd168fd9b30c66/qf4ccf8f5435d4a78bdca4d6a018b578e/abbbaaabb.abb (Ljava/lang/Integer;)Ljava/lang/Boolean;, (Ljava/lang/Integer;)Ljava/lang/Boolean; ]
      // 186: invokeinterface java/util/Map.computeIfAbsent (Ljava/lang/Object;Ljava/util/function/Function;)Ljava/lang/Object; 3
      // 18b: checkcast java/lang/Boolean
      // 18e: invokevirtual java/lang/Boolean.booleanValue ()Z
      // 191: istore 9
      // 193: iload 9
      // 195: ifne 1a0
      // 198: iload 1
      // 199: ifeq 0b0
      // 19c: goto 1a0
      // 19f: athrow
      // 1a0: aload 0
      // 1a1: aload 2
      // 1a2: aload 7
      // 1a4: invokevirtual qeaa361f143ee4a0894bd168fd9b30c66/qf4ccf8f5435d4a78bdca4d6a018b578e/abbbaaabb.ba (Lnet/minecraft/class_310;Lnet/minecraft/class_1701;)Lqeaa361f143ee4a0894bd168fd9b30c66/qf4ccf8f5435d4a78bdca4d6a018b578e/abaaaabaa;
      // 1a7: astore 10
      // 1a9: aload 0
      // 1aa: aload 2
      // 1ab: invokevirtual qeaa361f143ee4a0894bd168fd9b30c66/qf4ccf8f5435d4a78bdca4d6a018b578e/abbbaaabb.baaa (Lnet/minecraft/class_310;)I
      // 1ae: iload 1
      // 1af: ifne 0b7
      // 1b2: istore 11
      // 1b4: iload 11
      // 1b6: iflt 0b0
      // 1b9: aload 10
      // 1bb: ifnonnull 1c6
      // 1be: iload 1
      // 1bf: ifeq 0b0
      // 1c2: goto 1c6
      // 1c5: athrow
      // 1c6: bipush 1
      // 1c7: istore 3
      // 1c8: aload 0
      // 1c9: iload 1
      // 1ca: ifne 1f0
      // 1cd: aload 2
      // 1ce: aload 7
      // 1d0: invokevirtual net/minecraft/class_1701.method_5628 ()I
      // 1d3: iload 11
      // 1d5: invokevirtual qeaa361f143ee4a0894bd168fd9b30c66/qf4ccf8f5435d4a78bdca4d6a018b578e/abbbaaabb.aab (Lnet/minecraft/class_310;II)Z
      // 1d8: ifne 1e1
      // 1db: goto 1df
      // 1de: athrow
      // 1df: return
      // 1e0: athrow
      // 1e1: aload 0
      // 1e2: iload 1
      // 1e3: ifne 204
      // 1e6: getfield qeaa361f143ee4a0894bd168fd9b30c66/qf4ccf8f5435d4a78bdca4d6a018b578e/abbbaaabb.bbab Lqeaa361f143ee4a0894bd168fd9b30c66/qf4ccf8f5435d4a78bdca4d6a018b578e/baabaab;
      // 1e9: invokevirtual qeaa361f143ee4a0894bd168fd9b30c66/qf4ccf8f5435d4a78bdca4d6a018b578e/baabaab.abbb ()Ljava/lang/Object;
      // 1ec: goto 1f0
      // 1ef: athrow
      // 1f0: getstatic qeaa361f143ee4a0894bd168fd9b30c66/qf4ccf8f5435d4a78bdca4d6a018b578e/aaaabaaab.b Lqeaa361f143ee4a0894bd168fd9b30c66/qf4ccf8f5435d4a78bdca4d6a018b578e/aaaabaaab;
      // 1f3: if_acmpne 203
      // 1f6: aload 0
      // 1f7: aload 2
      // 1f8: aload 7
      // 1fa: iload 11
      // 1fc: aload 10
      // 1fe: invokevirtual qeaa361f143ee4a0894bd168fd9b30c66/qf4ccf8f5435d4a78bdca4d6a018b578e/abbbaaabb.bba (Lnet/minecraft/class_310;Lnet/minecraft/class_1701;ILqeaa361f143ee4a0894bd168fd9b30c66/qf4ccf8f5435d4a78bdca4d6a018b578e/abaaaabaa;)V
      // 201: return
      // 202: athrow
      // 203: aload 0
      // 204: iload 1
      // 205: ifne 21e
      // 208: aload 2
      // 209: aload 7
      // 20b: iload 11
      // 20d: aload 10
      // 20f: invokevirtual qeaa361f143ee4a0894bd168fd9b30c66/qf4ccf8f5435d4a78bdca4d6a018b578e/abbbaaabb.aaa (Lnet/minecraft/class_310;Lnet/minecraft/class_1701;ILqeaa361f143ee4a0894bd168fd9b30c66/qf4ccf8f5435d4a78bdca4d6a018b578e/abaaaabaa;)Z
      // 212: ifeq 222
      // 215: goto 219
      // 218: athrow
      // 219: aload 0
      // 21a: goto 21e
      // 21d: athrow
      // 21e: invokevirtual qeaa361f143ee4a0894bd168fd9b30c66/qf4ccf8f5435d4a78bdca4d6a018b578e/abbbaaabb.aaaa ()V
      // 221: return
      // 222: iload 1
      // 223: ifeq 0b0
      // 226: iload 3
      // 227: ifne 232
      // 22a: aload 0
      // 22b: invokevirtual qeaa361f143ee4a0894bd168fd9b30c66/qf4ccf8f5435d4a78bdca4d6a018b578e/abbbaaabb.aaaa ()V
      // 22e: goto 232
      // 231: athrow
      // 232: aload 0
      // 233: getfield qeaa361f143ee4a0894bd168fd9b30c66/qf4ccf8f5435d4a78bdca4d6a018b578e/abbbaaabb.aaba Lqeaa361f143ee4a0894bd168fd9b30c66/qf4ccf8f5435d4a78bdca4d6a018b578e/ababbbbba;
      // 236: invokevirtual qeaa361f143ee4a0894bd168fd9b30c66/qf4ccf8f5435d4a78bdca4d6a018b578e/ababbbbba.aaaabba ()V
      // 239: return
   }

   private float abaaa(class_310 var1, class_1701 var2, class_2338 var3) {
      return aaabaaaa.abaa(
         var1.field_1724,
         var2.method_73189(),
         this.abab(var2),
         var3,
         aabbabbbb.ababba(var1, aabbabbbb.baabbaa(var1.field_1724, var1.field_1687))
      );
   }

   private boolean ababb(class_310 var1, abaaaabaa var2) {
      return aabbabbbb.bbababa(var1, var2.b());
   }

   private boolean abbaa(class_310 param1) {
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
      // 05: invokevirtual qeaa361f143ee4a0894bd168fd9b30c66/qf4ccf8f5435d4a78bdca4d6a018b578e/abbbaaabb.babbaab ()Z
      // 08: ifeq 7d
      // 0b: aload 1
      // 0c: iload 2
      // 0d: ifne 1c
      // 10: goto 14
      // 13: athrow
      // 14: ifnull 7d
      // 17: goto 1b
      // 1a: athrow
      // 1b: aload 1
      // 1c: iload 2
      // 1d: ifne 2f
      // 20: getfield net/minecraft/class_310.field_1724 Lnet/minecraft/class_746;
      // 23: ifnull 7d
      // 26: goto 2a
      // 29: athrow
      // 2a: aload 1
      // 2b: goto 2f
      // 2e: athrow
      // 2f: iload 2
      // 30: ifne 42
      // 33: getfield net/minecraft/class_310.field_1687 Lnet/minecraft/class_638;
      // 36: ifnull 7d
      // 39: goto 3d
      // 3c: athrow
      // 3d: aload 1
      // 3e: goto 42
      // 41: athrow
      // 42: iload 2
      // 43: ifne 55
      // 46: getfield net/minecraft/class_310.field_1761 Lnet/minecraft/class_636;
      // 49: ifnull 7d
      // 4c: goto 50
      // 4f: athrow
      // 50: aload 1
      // 51: goto 55
      // 54: athrow
      // 55: iload 2
      // 56: ifne 68
      // 59: getfield net/minecraft/class_310.field_1755 Lnet/minecraft/class_437;
      // 5c: ifnonnull 7d
      // 5f: goto 63
      // 62: athrow
      // 63: aload 1
      // 64: goto 68
      // 67: athrow
      // 68: getfield net/minecraft/class_310.field_1724 Lnet/minecraft/class_746;
      // 6b: invokevirtual net/minecraft/class_746.method_5805 ()Z
      // 6e: iload 2
      // 6f: ifne 7a
      // 72: ifeq 7d
      // 75: goto 79
      // 78: athrow
      // 79: bipush 1
      // 7a: goto 7e
      // 7d: bipush 0
      // 7e: ireturn
   }

   private class_1799 abbab(class_310 var1) {
      int var10000 = aabbabbab.ab;
      int var3 = aabbabbbb.baabaab(var1);
      int var2 = var10000;

      label27: {
         try {
            var10000 = var3;
            if (var2 != 0) {
               break label27;
            }

            if (var3 < 0) {
               return class_1799.field_8037;
            }
         } catch (MatchException var5) {
            throw var5;
         }

         var10000 = var3;
      }

      try {
         if (var10000 < aaabb(a(-74918136, -1335154625 ^ -1856908464), 1185955421304828485L)) {
            return var1.field_1724.method_31548().method_5438(var3);
         }
      } catch (MatchException var4) {
         throw var4;
      }

      return class_1799.field_8037;
   }

   private boolean abbba(class_310 param1, class_2338 param2) {
      // $VF: Couldn't be decompiled
      // Please report this to the Vineflower issue tracker, at https://github.com/Vineflower/vineflower/issues with a copy of the class file (if you have the rights to distribute it!)
      // java.lang.RuntimeException: parsing failure!
      //   at org.jetbrains.java.decompiler.modules.decompiler.decompose.DomHelper.parseGraph(DomHelper.java:211)
      //   at org.jetbrains.java.decompiler.main.rels.MethodProcessor.codeToJava(MethodProcessor.java:166)
      //
      // Bytecode:
      // 00: getstatic qeaa361f143ee4a0894bd168fd9b30c66/qf4ccf8f5435d4a78bdca4d6a018b578e/aabbabbab.ab I
      // 03: istore 3
      // 04: aload 1
      // 05: iload 3
      // 06: ifne 11
      // 09: ifnull 71
      // 0c: goto 10
      // 0f: athrow
      // 10: aload 1
      // 11: getfield net/minecraft/class_310.field_1687 Lnet/minecraft/class_638;
      // 14: ifnull 71
      // 17: aload 2
      // 18: ifnull 71
      // 1b: goto 1f
      // 1e: athrow
      // 1f: aload 1
      // 20: getfield net/minecraft/class_310.field_1687 Lnet/minecraft/class_638;
      // 23: aload 2
      // 24: invokevirtual net/minecraft/class_638.method_8320 (Lnet/minecraft/class_2338;)Lnet/minecraft/class_2680;
      // 27: invokevirtual net/minecraft/class_2680.method_26215 ()Z
      // 2a: iload 3
      // 2b: ifne 6e
      // 2e: goto 32
      // 31: athrow
      // 32: ifne 6d
      // 35: goto 39
      // 38: athrow
      // 39: aload 1
      // 3a: getfield net/minecraft/class_310.field_1687 Lnet/minecraft/class_638;
      // 3d: aload 2
      // 3e: invokevirtual net/minecraft/class_638.method_8320 (Lnet/minecraft/class_2338;)Lnet/minecraft/class_2680;
      // 41: invokevirtual net/minecraft/class_2680.method_45474 ()Z
      // 44: iload 3
      // 45: ifne 6e
      // 48: goto 4c
      // 4b: athrow
      // 4c: ifne 6d
      // 4f: goto 53
      // 52: athrow
      // 53: aload 1
      // 54: getfield net/minecraft/class_310.field_1687 Lnet/minecraft/class_638;
      // 57: aload 2
      // 58: invokevirtual net/minecraft/class_638.method_8320 (Lnet/minecraft/class_2338;)Lnet/minecraft/class_2680;
      // 5b: invokestatic qeaa361f143ee4a0894bd168fd9b30c66/qf4ccf8f5435d4a78bdca4d6a018b578e/aabbabbbb.ababaa (Lnet/minecraft/class_2680;)Z
      // 5e: iload 3
      // 5f: ifne 6e
      // 62: goto 66
      // 65: athrow
      // 66: ifeq 71
      // 69: goto 6d
      // 6c: athrow
      // 6d: bipush 1
      // 6e: goto 72
      // 71: bipush 0
      // 72: ireturn
   }

   private void abbbb(class_310 var1) {
      this.aa.removeIf(abbbaaabb::aaaab);
      this.baba.removeIf(abbbaaabb::abbb);
      this.aaaba.keySet().removeIf(abbbaaabb::bb);
   }

   public void baaaa(class_2596 param1) {
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
      // 05: iload 2
      // 06: ifne 18
      // 09: instanceof net/minecraft/class_2885
      // 0c: ifeq 20
      // 0f: goto 13
      // 12: athrow
      // 13: aload 1
      // 14: goto 18
      // 17: athrow
      // 18: checkcast net/minecraft/class_2885
      // 1b: astore 3
      // 1c: iload 2
      // 1d: ifeq 22
      // 20: return
      // 21: athrow
      // 22: invokestatic net/minecraft/class_310.method_1551 ()Lnet/minecraft/class_310;
      // 25: astore 4
      // 27: aload 0
      // 28: invokevirtual qeaa361f143ee4a0894bd168fd9b30c66/qf4ccf8f5435d4a78bdca4d6a018b578e/abbbaaabb.babbaab ()Z
      // 2b: ifeq 47
      // 2e: aload 4
      // 30: iload 2
      // 31: ifne 41
      // 34: goto 38
      // 37: athrow
      // 38: ifnull 47
      // 3b: goto 3f
      // 3e: athrow
      // 3f: aload 4
      // 41: getfield net/minecraft/class_310.field_1724 Lnet/minecraft/class_746;
      // 44: ifnonnull 49
      // 47: return
      // 48: athrow
      // 49: aload 3
      // 4a: invokevirtual net/minecraft/class_2885.method_12546 ()Lnet/minecraft/class_1268;
      // 4d: getstatic net/minecraft/class_1268.field_5810 Lnet/minecraft/class_1268;
      // 50: if_acmpne 5f
      // 53: aload 4
      // 55: getfield net/minecraft/class_310.field_1724 Lnet/minecraft/class_746;
      // 58: invokevirtual net/minecraft/class_746.method_6079 ()Lnet/minecraft/class_1799;
      // 5b: goto 65
      // 5e: athrow
      // 5f: aload 0
      // 60: aload 4
      // 62: invokevirtual qeaa361f143ee4a0894bd168fd9b30c66/qf4ccf8f5435d4a78bdca4d6a018b578e/abbbaaabb.abbab (Lnet/minecraft/class_310;)Lnet/minecraft/class_1799;
      // 65: astore 5
      // 67: aload 5
      // 69: iload 2
      // 6a: ifne 76
      // 6d: ifnull aa
      // 70: goto 74
      // 73: athrow
      // 74: aload 5
      // 76: iload 2
      // 77: ifne a9
      // 7a: getstatic net/minecraft/class_1802.field_8069 Lnet/minecraft/class_1792;
      // 7d: invokevirtual net/minecraft/class_1799.method_31574 (Lnet/minecraft/class_1792;)Z
      // 80: ifeq aa
      // 83: goto 87
      // 86: athrow
      // 87: aload 0
      // 88: getfield qeaa361f143ee4a0894bd168fd9b30c66/qf4ccf8f5435d4a78bdca4d6a018b578e/abbbaaabb.bb Ljava/util/Map;
      // 8b: aload 3
      // 8c: invokevirtual net/minecraft/class_2885.method_12543 ()Lnet/minecraft/class_3965;
      // 8f: invokevirtual net/minecraft/class_3965.method_17777 ()Lnet/minecraft/class_2338;
      // 92: invokevirtual net/minecraft/class_2338.method_10062 ()Lnet/minecraft/class_2338;
      // 95: aload 4
      // 97: getfield net/minecraft/class_310.field_1724 Lnet/minecraft/class_746;
      // 9a: getfield net/minecraft/class_746.field_6012 I
      // 9d: invokestatic java/lang/Integer.valueOf (I)Ljava/lang/Integer;
      // a0: invokeinterface java/util/Map.put (Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object; 3
      // a5: goto a9
      // a8: athrow
      // a9: pop
      // aa: return
   }

   private abaaaabaa baaab(class_310 param1, class_2338 param2) {
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
      // 005: aload 1
      // 006: aload 2
      // 007: invokevirtual qeaa361f143ee4a0894bd168fd9b30c66/qf4ccf8f5435d4a78bdca4d6a018b578e/abbbaaabb.abbba (Lnet/minecraft/class_310;Lnet/minecraft/class_2338;)Z
      // 00a: iload 3
      // 00b: ifne 036
      // 00e: ifeq 039
      // 011: goto 015
      // 014: athrow
      // 015: aload 1
      // 016: iload 3
      // 017: ifne 03d
      // 01a: goto 01e
      // 01d: athrow
      // 01e: getfield net/minecraft/class_310.field_1687 Lnet/minecraft/class_638;
      // 021: aconst_null
      // 022: new net/minecraft/class_238
      // 025: dup
      // 026: aload 2
      // 027: invokespecial net/minecraft/class_238.<init> (Lnet/minecraft/class_2338;)V
      // 02a: invokevirtual net/minecraft/class_638.method_8335 (Lnet/minecraft/class_1297;Lnet/minecraft/class_238;)Ljava/util/List;
      // 02d: invokeinterface java/util/List.isEmpty ()Z 1
      // 032: goto 036
      // 035: athrow
      // 036: ifne 03c
      // 039: aconst_null
      // 03a: areturn
      // 03b: athrow
      // 03c: aload 1
      // 03d: getfield net/minecraft/class_310.field_1724 Lnet/minecraft/class_746;
      // 040: invokevirtual net/minecraft/class_746.method_33571 ()Lnet/minecraft/class_243;
      // 043: astore 4
      // 045: aload 1
      // 046: getfield net/minecraft/class_310.field_1687 Lnet/minecraft/class_638;
      // 049: aload 4
      // 04b: aload 2
      // 04c: invokestatic qeaa361f143ee4a0894bd168fd9b30c66/qf4ccf8f5435d4a78bdca4d6a018b578e/abababbbb.babb (Lnet/minecraft/class_1937;Lnet/minecraft/class_243;Lnet/minecraft/class_2338;)Lnet/minecraft/class_3965;
      // 04f: astore 5
      // 051: aload 5
      // 053: ifnull 07f
      // 056: aload 4
      // 058: aload 5
      // 05a: invokevirtual net/minecraft/class_3965.method_17784 ()Lnet/minecraft/class_243;
      // 05d: invokevirtual net/minecraft/class_243.method_1025 (Lnet/minecraft/class_243;)D
      // 060: ldc2_w 20.25
      // 063: dcmpg
      // 064: ifgt 07f
      // 067: goto 06b
      // 06a: athrow
      // 06b: new qeaa361f143ee4a0894bd168fd9b30c66/qf4ccf8f5435d4a78bdca4d6a018b578e/abaaaabaa
      // 06e: dup
      // 06f: aload 2
      // 070: invokevirtual net/minecraft/class_2338.method_10062 ()Lnet/minecraft/class_2338;
      // 073: aload 5
      // 075: invokevirtual net/minecraft/class_3965.method_17784 ()Lnet/minecraft/class_243;
      // 078: aload 5
      // 07a: invokespecial qeaa361f143ee4a0894bd168fd9b30c66/qf4ccf8f5435d4a78bdca4d6a018b578e/abaaaabaa.<init> (Lnet/minecraft/class_2338;Lnet/minecraft/class_243;Lnet/minecraft/class_3965;)V
      // 07d: areturn
      // 07e: athrow
      // 07f: invokestatic net/minecraft/class_2350.values ()[Lnet/minecraft/class_2350;
      // 082: astore 6
      // 084: aload 6
      // 086: arraylength
      // 087: istore 7
      // 089: bipush 0
      // 08a: istore 8
      // 08c: iload 8
      // 08e: iload 7
      // 090: if_icmpge 13b
      // 093: aload 6
      // 095: iload 8
      // 097: aaload
      // 098: astore 9
      // 09a: iload 3
      // 09b: aload 2
      // 09c: aload 9
      // 09e: invokevirtual net/minecraft/class_2338.method_10093 (Lnet/minecraft/class_2350;)Lnet/minecraft/class_2338;
      // 0a1: astore 10
      // 0a3: aload 1
      // 0a4: getfield net/minecraft/class_310.field_1687 Lnet/minecraft/class_638;
      // 0a7: aload 10
      // 0a9: invokevirtual net/minecraft/class_638.method_8320 (Lnet/minecraft/class_2338;)Lnet/minecraft/class_2680;
      // 0ac: astore 11
      // 0ae: ifne 137
      // 0b1: aload 11
      // 0b3: invokevirtual net/minecraft/class_2680.method_26215 ()Z
      // 0b6: ifne 134
      // 0b9: goto 0bd
      // 0bc: athrow
      // 0bd: aload 11
      // 0bf: aload 1
      // 0c0: getfield net/minecraft/class_310.field_1687 Lnet/minecraft/class_638;
      // 0c3: aload 10
      // 0c5: invokevirtual net/minecraft/class_2680.method_26220 (Lnet/minecraft/class_1922;Lnet/minecraft/class_2338;)Lnet/minecraft/class_265;
      // 0c8: invokevirtual net/minecraft/class_265.method_1110 ()Z
      // 0cb: ifeq 0da
      // 0ce: goto 0d2
      // 0d1: athrow
      // 0d2: iload 3
      // 0d3: ifeq 134
      // 0d6: goto 0da
      // 0d9: athrow
      // 0da: aload 9
      // 0dc: invokevirtual net/minecraft/class_2350.method_10153 ()Lnet/minecraft/class_2350;
      // 0df: astore 12
      // 0e1: aload 10
      // 0e3: invokestatic net/minecraft/class_243.method_24953 (Lnet/minecraft/class_2382;)Lnet/minecraft/class_243;
      // 0e6: aload 12
      // 0e8: invokevirtual net/minecraft/class_2350.method_62675 ()Lnet/minecraft/class_2382;
      // 0eb: invokestatic net/minecraft/class_243.method_24954 (Lnet/minecraft/class_2382;)Lnet/minecraft/class_243;
      // 0ee: ldc2_w 0.5
      // 0f1: invokevirtual net/minecraft/class_243.method_1021 (D)Lnet/minecraft/class_243;
      // 0f4: invokevirtual net/minecraft/class_243.method_1019 (Lnet/minecraft/class_243;)Lnet/minecraft/class_243;
      // 0f7: astore 13
      // 0f9: aload 1
      // 0fa: getfield net/minecraft/class_310.field_1724 Lnet/minecraft/class_746;
      // 0fd: invokevirtual net/minecraft/class_746.method_33571 ()Lnet/minecraft/class_243;
      // 100: aload 13
      // 102: invokevirtual net/minecraft/class_243.method_1025 (Lnet/minecraft/class_243;)D
      // 105: ldc2_w 20.25
      // 108: dcmpl
      // 109: ifle 114
      // 10c: iload 3
      // 10d: ifeq 134
      // 110: goto 114
      // 113: athrow
      // 114: new qeaa361f143ee4a0894bd168fd9b30c66/qf4ccf8f5435d4a78bdca4d6a018b578e/abaaaabaa
      // 117: dup
      // 118: aload 2
      // 119: invokevirtual net/minecraft/class_2338.method_10062 ()Lnet/minecraft/class_2338;
      // 11c: aload 13
      // 11e: new net/minecraft/class_3965
      // 121: dup
      // 122: aload 13
      // 124: aload 12
      // 126: aload 10
      // 128: invokevirtual net/minecraft/class_2338.method_10062 ()Lnet/minecraft/class_2338;
      // 12b: bipush 0
      // 12c: invokespecial net/minecraft/class_3965.<init> (Lnet/minecraft/class_243;Lnet/minecraft/class_2350;Lnet/minecraft/class_2338;Z)V
      // 12f: invokespecial qeaa361f143ee4a0894bd168fd9b30c66/qf4ccf8f5435d4a78bdca4d6a018b578e/abaaaabaa.<init> (Lnet/minecraft/class_2338;Lnet/minecraft/class_243;Lnet/minecraft/class_3965;)V
      // 132: areturn
      // 133: athrow
      // 134: iinc 8 1
      // 137: iload 3
      // 138: ifeq 08c
      // 13b: aconst_null
      // 13c: areturn
   }
}
