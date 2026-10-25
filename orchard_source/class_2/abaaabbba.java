package nsc;

import com.google.gson.JsonObject;
import java.util.Iterator;
import java.util.List;
import java.util.concurrent.ThreadLocalRandom;
import net.fabricmc.api.EnvType;
import net.fabricmc.api.Environment;
import net.minecraft.class_1309;
import net.minecraft.class_2338;
import net.minecraft.class_238;
import net.minecraft.class_243;
import net.minecraft.class_2596;
import net.minecraft.class_2680;
import net.minecraft.class_310;
import net.minecraft.class_3965;
import net.minecraft.class_3966;

@Environment(EnvType.CLIENT)
public final class abaaabbba extends abbaabbaa {
   private static final int ba;
   private class_243 aaa;
   private class_1309 aab;
   private static final long[] aba;
   private static final Object[] aaabab;
   private long abb;
   private final bababa baa;
   private class_3965 bab;
   private Object bba;
   private boolean bbb;
   private int aaaa;
   private final bababa aaab;
   private final abbaaaaa aaba;
   private int aabb;
   private float abaa;
   private final baabaab abab;
   private final aaabbbab abba;
   private boolean abbb;
   private static final Integer[] baaa;
   private long baab;
   private static final ababbbbaa baba;
   private long babb;
   private int bbaa;
   private bbbbaaaa bbab;
   private class_2338 bbba;
   private static final ababbbbaa bbbb;
   private float aaaaa;
   private final abbaaaaa aaaab;
   private final abbaaaaa aaaba;
   private static final String[] aaabaa;
   private int aaabb;
   private int aabaa;
   private static final String[] aabab;
   private static final ababbbbaa aabba;
   private static final String[] aabbb;
   private final abaabbbb bb;
   private static final ababbbbaa abaaa;
   private int abaab;
   private static final long[] ababa;
   private static final long ababb;
   private int abbaa;
   private long abbab;
   private int abbba;
   private static final Long[] abbbb;
   private int baaaa;
   private final aaabbbab baaab;
   private static final List baaba;
   private boolean baabb;
   private class_2338 babaa;
   private static final int babab;
   private final abbaaaaa babba;
   private long babbb;
   private static final int[] aaaabb;
   private static final long ab;
   private int bbaaa;
   private boolean bbaab;
   private final ababbbbba bbaba;
   private float bbabb;
   private final bababa bbbaa;
   private aaabaaaba bbbab;
   private static final long aa;
   private final baabaab bbbba;
   private boolean bbbbb;
   private final aaabbbab aaaaaa;
   private class_243 aaaaab;
   private boolean aaaaba;

   private static double aa(class_238 var0, class_2338 var1) {
      double var2 = Math.max(0.0, Math.min(var0.field_1320, var1.method_10263() + 1.0) - Math.max(var0.field_1323, (double)var1.method_10263()));
      double var4 = Math.max(0.0, Math.min(var0.field_1324, var1.method_10260() + 1.0) - Math.max(var0.field_1321, (double)var1.method_10260()));
      return var2 * var4;
   }

   private class_243 ab(class_310 param1, class_1309 param2) {
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
      // 05: ifnonnull 0d
      // 08: getstatic net/minecraft/class_243.field_1353 Lnet/minecraft/class_243;
      // 0b: areturn
      // 0c: athrow
      // 0d: aload 0
      // 0e: iload 3
      // 0f: ifne 25
      // 12: getfield qeaa361f143ee4a0894bd168fd9b30c66/qf4ccf8f5435d4a78bdca4d6a018b578e/abaaabbba.aaabb I
      // 15: aload 2
      // 16: invokevirtual net/minecraft/class_1309.method_5628 ()I
      // 19: if_icmpne 67
      // 1c: goto 20
      // 1f: athrow
      // 20: aload 0
      // 21: goto 25
      // 24: athrow
      // 25: getfield qeaa361f143ee4a0894bd168fd9b30c66/qf4ccf8f5435d4a78bdca4d6a018b578e/abaaabbba.baaaa I
      // 28: iload 3
      // 29: ifne 5b
      // 2c: ldc -439572985
      // 2e: ldc -972150552
      // 30: ldc 2015865102
      // 32: ixor
      // 33: invokestatic qeaa361f143ee4a0894bd168fd9b30c66/qf4ccf8f5435d4a78bdca4d6a018b578e/abaaabbba.a (II)I
      // 36: ldc2_w 7477281668697820497
      // 39: invokestatic qeaa361f143ee4a0894bd168fd9b30c66/qf4ccf8f5435d4a78bdca4d6a018b578e/abaaabbba.aaab (IJ)I
      // 3c: if_icmpeq 67
      // 3f: goto 43
      // 42: athrow
      // 43: aload 1
      // 44: getfield net/minecraft/class_310.field_1724 Lnet/minecraft/class_746;
      // 47: iload 3
      // 48: ifne 68
      // 4b: goto 4f
      // 4e: athrow
      // 4f: getfield net/minecraft/class_746.field_6012 I
      // 52: aload 0
      // 53: getfield qeaa361f143ee4a0894bd168fd9b30c66/qf4ccf8f5435d4a78bdca4d6a018b578e/abaaabbba.baaaa I
      // 56: isub
      // 57: goto 5b
      // 5a: athrow
      // 5b: bipush 3
      // 5c: if_icmpgt 67
      // 5f: aload 0
      // 60: getfield qeaa361f143ee4a0894bd168fd9b30c66/qf4ccf8f5435d4a78bdca4d6a018b578e/abaaabbba.aaa Lnet/minecraft/class_243;
      // 63: goto 6b
      // 66: athrow
      // 67: aload 2
      // 68: invokevirtual net/minecraft/class_1309.method_18798 ()Lnet/minecraft/class_243;
      // 6b: astore 4
      // 6d: aload 4
      // 6f: iload 3
      // 70: ifne 7d
      // 73: ifnonnull 80
      // 76: goto 7a
      // 79: athrow
      // 7a: getstatic net/minecraft/class_243.field_1353 Lnet/minecraft/class_243;
      // 7d: goto 92
      // 80: new net/minecraft/class_243
      // 83: dup
      // 84: aload 4
      // 86: getfield net/minecraft/class_243.field_1352 D
      // 89: dconst_0
      // 8a: aload 4
      // 8c: getfield net/minecraft/class_243.field_1350 D
      // 8f: invokespecial net/minecraft/class_243.<init> (DDD)V
      // 92: areturn
   }

   private static int a(int var0, int var1) {
      int var2 = aaaabb[var0 ^ -439572985] ^ var1 ^ var0;
      var2 -= 29714;
      var2 += 56518;
      var2 += 58892;
      var2 += 12688;
      var2 ^= 30090;
      var2 ^= 12714;
      var2 += 33514;
      return var2 ^ 35934;
   }

   private void ba() {
      this.bbaa = -1;
      this.babb = 0L;
      this.aaaaba = false;
   }

   private void bb(class_310 param1, class_2338 param2, class_2680 param3) {
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
      // 06: invokevirtual qeaa361f143ee4a0894bd168fd9b30c66/qf4ccf8f5435d4a78bdca4d6a018b578e/abaaabbba.babbaab ()Z
      // 09: ifeq 4b
      // 0c: aload 1
      // 0d: iload 4
      // 0f: ifne 1e
      // 12: goto 16
      // 15: athrow
      // 16: ifnull 4b
      // 19: goto 1d
      // 1c: athrow
      // 1d: aload 1
      // 1e: getfield net/minecraft/class_310.field_1687 Lnet/minecraft/class_638;
      // 21: aload 0
      // 22: getfield qeaa361f143ee4a0894bd168fd9b30c66/qf4ccf8f5435d4a78bdca4d6a018b578e/abaaabbba.bba Ljava/lang/Object;
      // 25: if_acmpne 4b
      // 28: aload 0
      // 29: getfield qeaa361f143ee4a0894bd168fd9b30c66/qf4ccf8f5435d4a78bdca4d6a018b578e/abaaabbba.bbba Lnet/minecraft/class_2338;
      // 2c: ifnull 4b
      // 2f: goto 33
      // 32: athrow
      // 33: aload 3
      // 34: ifnull 4b
      // 37: goto 3b
      // 3a: athrow
      // 3b: aload 0
      // 3c: aload 2
      // 3d: aload 3
      // 3e: getstatic net/minecraft/class_2246.field_10343 Lnet/minecraft/class_2248;
      // 41: invokevirtual net/minecraft/class_2680.method_27852 (Lnet/minecraft/class_2248;)Z
      // 44: invokevirtual qeaa361f143ee4a0894bd168fd9b30c66/qf4ccf8f5435d4a78bdca4d6a018b578e/abaaabbba.abbaa (Lnet/minecraft/class_2338;Z)V
      // 47: goto 4b
      // 4a: athrow
      // 4b: return
   }

   private boolean aaa(class_3965 var1, class_310 var2) {
      this.bbba = var1.method_17777().method_10093(var1.method_17780()).method_10062();
      this.bba = var2.field_1687;
      this.abbaa = var2.field_1724.field_6012 + 2;
      this.bbb = false;
      this.abbb = false;
      return aabbabbbb.bbababa(var2, var1);
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
      // 04: aload 0
      // 05: iload 2
      // 06: ifne 1c
      // 09: aload 1
      // 0a: invokevirtual qeaa361f143ee4a0894bd168fd9b30c66/qf4ccf8f5435d4a78bdca4d6a018b578e/abaaabbba.bbbbb (Lnet/minecraft/class_310;)Z
      // 0d: pop
      // 0e: aload 0
      // 0f: getfield qeaa361f143ee4a0894bd168fd9b30c66/qf4ccf8f5435d4a78bdca4d6a018b578e/abaaabbba.bbaab Z
      // 12: ifne 1b
      // 15: goto 19
      // 18: athrow
      // 19: return
      // 1a: athrow
      // 1b: aload 0
      // 1c: aload 1
      // 1d: invokevirtual qeaa361f143ee4a0894bd168fd9b30c66/qf4ccf8f5435d4a78bdca4d6a018b578e/abaaabbba.abaaaa (Lnet/minecraft/class_310;)Z
      // 20: iload 2
      // 21: ifne 3a
      // 24: ifne 32
      // 27: goto 2b
      // 2a: athrow
      // 2b: aload 0
      // 2c: aload 1
      // 2d: invokevirtual qeaa361f143ee4a0894bd168fd9b30c66/qf4ccf8f5435d4a78bdca4d6a018b578e/abaaabbba.baaaa (Lnet/minecraft/class_310;)V
      // 30: return
      // 31: athrow
      // 32: invokestatic java/lang/System.currentTimeMillis ()J
      // 35: aload 0
      // 36: getfield qeaa361f143ee4a0894bd168fd9b30c66/qf4ccf8f5435d4a78bdca4d6a018b578e/abaaabbba.abbab J
      // 39: lcmp
      // 3a: iflt 46
      // 3d: aload 0
      // 3e: aload 1
      // 3f: invokevirtual qeaa361f143ee4a0894bd168fd9b30c66/qf4ccf8f5435d4a78bdca4d6a018b578e/abaaabbba.bbbb (Lnet/minecraft/class_310;)V
      // 42: goto 46
      // 45: athrow
      // 46: return
   }

   private boolean aab(class_310 param1, class_2338 param2, class_243 param3) {
      // $VF: Couldn't be decompiled
      // Please report this to the Vineflower issue tracker, at https://github.com/Vineflower/vineflower/issues with a copy of the class file (if you have the rights to distribute it!)
      // java.lang.RuntimeException: parsing failure!
      //   at org.jetbrains.java.decompiler.modules.decompiler.decompose.DomHelper.parseGraph(DomHelper.java:211)
      //   at org.jetbrains.java.decompiler.main.rels.MethodProcessor.codeToJava(MethodProcessor.java:166)
      //
      // Bytecode:
      // 000: getstatic qeaa361f143ee4a0894bd168fd9b30c66/qf4ccf8f5435d4a78bdca4d6a018b578e/baaabbaa.bba I
      // 003: istore 4
      // 005: aload 1
      // 006: iload 4
      // 008: ifne 013
      // 00b: ifnull 03d
      // 00e: goto 012
      // 011: athrow
      // 012: aload 1
      // 013: iload 4
      // 015: ifne 027
      // 018: getfield net/minecraft/class_310.field_1724 Lnet/minecraft/class_746;
      // 01b: ifnull 03d
      // 01e: goto 022
      // 021: athrow
      // 022: aload 1
      // 023: goto 027
      // 026: athrow
      // 027: getfield net/minecraft/class_310.field_1761 Lnet/minecraft/class_636;
      // 02a: ifnull 03d
      // 02d: aload 2
      // 02e: ifnull 03d
      // 031: goto 035
      // 034: athrow
      // 035: aload 3
      // 036: ifnonnull 040
      // 039: goto 03d
      // 03c: athrow
      // 03d: bipush 0
      // 03e: ireturn
      // 03f: athrow
      // 040: aload 0
      // 041: iload 4
      // 043: ifne 059
      // 046: getfield qeaa361f143ee4a0894bd168fd9b30c66/qf4ccf8f5435d4a78bdca4d6a018b578e/abaaabbba.aabb I
      // 049: iflt 058
      // 04c: goto 050
      // 04f: athrow
      // 050: aload 0
      // 051: getfield qeaa361f143ee4a0894bd168fd9b30c66/qf4ccf8f5435d4a78bdca4d6a018b578e/abaaabbba.aabb I
      // 054: goto 05d
      // 057: athrow
      // 058: aload 0
      // 059: aload 1
      // 05a: invokevirtual qeaa361f143ee4a0894bd168fd9b30c66/qf4ccf8f5435d4a78bdca4d6a018b578e/abaaabbba.aabaab (Lnet/minecraft/class_310;)I
      // 05d: istore 5
      // 05f: iload 5
      // 061: iload 4
      // 063: ifne 06e
      // 066: ifge 06f
      // 069: goto 06d
      // 06c: athrow
      // 06d: bipush 0
      // 06e: ireturn
      // 06f: aload 0
      // 070: getfield qeaa361f143ee4a0894bd168fd9b30c66/qf4ccf8f5435d4a78bdca4d6a018b578e/abaaabbba.bab Lnet/minecraft/class_3965;
      // 073: astore 6
      // 075: aload 6
      // 077: ifnull 0aa
      // 07a: aload 2
      // 07b: aload 6
      // 07d: invokevirtual net/minecraft/class_3965.method_17777 ()Lnet/minecraft/class_2338;
      // 080: invokevirtual net/minecraft/class_2338.equals (Ljava/lang/Object;)Z
      // 083: iload 4
      // 085: ifne 0af
      // 088: goto 08c
      // 08b: athrow
      // 08c: ifeq 0aa
      // 08f: goto 093
      // 092: athrow
      // 093: aload 0
      // 094: iload 4
      // 096: ifne 0b7
      // 099: goto 09d
      // 09c: athrow
      // 09d: aload 1
      // 09e: aload 6
      // 0a0: invokevirtual qeaa361f143ee4a0894bd168fd9b30c66/qf4ccf8f5435d4a78bdca4d6a018b578e/abaaabbba.baabb (Lnet/minecraft/class_310;Lnet/minecraft/class_3965;)Z
      // 0a3: ifne 0b0
      // 0a6: goto 0aa
      // 0a9: athrow
      // 0aa: bipush 0
      // 0ab: goto 0af
      // 0ae: athrow
      // 0af: ireturn
      // 0b0: aload 0
      // 0b1: getfield qeaa361f143ee4a0894bd168fd9b30c66/qf4ccf8f5435d4a78bdca4d6a018b578e/abaaabbba.bbbba Lqeaa361f143ee4a0894bd168fd9b30c66/qf4ccf8f5435d4a78bdca4d6a018b578e/baabaab;
      // 0b4: invokevirtual qeaa361f143ee4a0894bd168fd9b30c66/qf4ccf8f5435d4a78bdca4d6a018b578e/baabaab.abbb ()Ljava/lang/Object;
      // 0b7: iload 4
      // 0b9: ifne 1ae
      // 0bc: getstatic qeaa361f143ee4a0894bd168fd9b30c66/qf4ccf8f5435d4a78bdca4d6a018b578e/aaabbbaba.a Lqeaa361f143ee4a0894bd168fd9b30c66/qf4ccf8f5435d4a78bdca4d6a018b578e/aaabbbaba;
      // 0bf: if_acmpne 1a7
      // 0c2: goto 0c6
      // 0c5: athrow
      // 0c6: aload 0
      // 0c7: getfield qeaa361f143ee4a0894bd168fd9b30c66/qf4ccf8f5435d4a78bdca4d6a018b578e/abaaabbba.bbaba Lqeaa361f143ee4a0894bd168fd9b30c66/qf4ccf8f5435d4a78bdca4d6a018b578e/ababbbbba;
      // 0ca: aload 1
      // 0cb: aload 6
      // 0cd: aload 0
      // 0ce: getfield qeaa361f143ee4a0894bd168fd9b30c66/qf4ccf8f5435d4a78bdca4d6a018b578e/abaaabbba.baa Lqeaa361f143ee4a0894bd168fd9b30c66/qf4ccf8f5435d4a78bdca4d6a018b578e/bababa;
      // 0d1: invokevirtual qeaa361f143ee4a0894bd168fd9b30c66/qf4ccf8f5435d4a78bdca4d6a018b578e/bababa.abbb ()Ljava/lang/Object;
      // 0d4: checkcast java/lang/Double
      // 0d7: invokevirtual java/lang/Double.floatValue ()F
      // 0da: invokevirtual qeaa361f143ee4a0894bd168fd9b30c66/qf4ccf8f5435d4a78bdca4d6a018b578e/ababbbbba.bbaba (Lnet/minecraft/class_310;Lnet/minecraft/class_3965;F)F
      // 0dd: fstore 7
      // 0df: fload 7
      // 0e1: ldc_w 3.4028235E38
      // 0e4: iload 4
      // 0e6: ifne 0f9
      // 0e9: fcmpl
      // 0ea: ifne 0f4
      // 0ed: goto 0f1
      // 0f0: athrow
      // 0f1: bipush 0
      // 0f2: ireturn
      // 0f3: athrow
      // 0f4: fload 7
      // 0f6: ldc_w 2.5
      // 0f9: fcmpg
      // 0fa: iload 4
      // 0fc: ifne 13c
      // 0ff: ifle 13b
      // 102: goto 106
      // 105: athrow
      // 106: aload 1
      // 107: getfield net/minecraft/class_310.field_1765 Lnet/minecraft/class_239;
      // 10a: astore 10
      // 10c: aload 10
      // 10e: iload 4
      // 110: ifne 123
      // 113: instanceof net/minecraft/class_3965
      // 116: ifeq 13f
      // 119: goto 11d
      // 11c: athrow
      // 11d: aload 10
      // 11f: goto 123
      // 122: athrow
      // 123: checkcast net/minecraft/class_3965
      // 126: astore 9
      // 128: aload 9
      // 12a: aload 6
      // 12c: invokestatic qeaa361f143ee4a0894bd168fd9b30c66/qf4ccf8f5435d4a78bdca4d6a018b578e/abaaabbba.aaaab (Lnet/minecraft/class_3965;Lnet/minecraft/class_3965;)Z
      // 12f: iload 4
      // 131: ifne 13c
      // 134: ifeq 13f
      // 137: goto 13b
      // 13a: athrow
      // 13b: bipush 1
      // 13c: goto 140
      // 13f: bipush 0
      // 140: istore 8
      // 142: iload 8
      // 144: iload 4
      // 146: ifne 1a6
      // 149: ifeq 1a5
      // 14c: goto 150
      // 14f: athrow
      // 150: aload 0
      // 151: getfield qeaa361f143ee4a0894bd168fd9b30c66/qf4ccf8f5435d4a78bdca4d6a018b578e/abaaabbba.bbaba Lqeaa361f143ee4a0894bd168fd9b30c66/qf4ccf8f5435d4a78bdca4d6a018b578e/ababbbbba;
      // 154: invokevirtual qeaa361f143ee4a0894bd168fd9b30c66/qf4ccf8f5435d4a78bdca4d6a018b578e/ababbbbba.aaaabba ()V
      // 157: aload 1
      // 158: getfield net/minecraft/class_310.field_1765 Lnet/minecraft/class_239;
      // 15b: astore 11
      // 15d: aload 11
      // 15f: iload 4
      // 161: ifne 174
      // 164: instanceof net/minecraft/class_3965
      // 167: ifeq 195
      // 16a: goto 16e
      // 16d: athrow
      // 16e: aload 11
      // 170: goto 174
      // 173: athrow
      // 174: checkcast net/minecraft/class_3965
      // 177: astore 10
      // 179: aload 10
      // 17b: iload 4
      // 17d: ifne 192
      // 180: aload 6
      // 182: invokestatic qeaa361f143ee4a0894bd168fd9b30c66/qf4ccf8f5435d4a78bdca4d6a018b578e/abaaabbba.aaaab (Lnet/minecraft/class_3965;Lnet/minecraft/class_3965;)Z
      // 185: ifeq 195
      // 188: goto 18c
      // 18b: athrow
      // 18c: aload 10
      // 18e: goto 192
      // 191: athrow
      // 192: goto 197
      // 195: aload 6
      // 197: astore 9
      // 199: aload 0
      // 19a: aload 1
      // 19b: iload 5
      // 19d: aload 6
      // 19f: aload 9
      // 1a1: invokevirtual qeaa361f143ee4a0894bd168fd9b30c66/qf4ccf8f5435d4a78bdca4d6a018b578e/abaaabbba.aabab (Lnet/minecraft/class_310;ILnet/minecraft/class_3965;Lnet/minecraft/class_3965;)Z
      // 1a4: ireturn
      // 1a5: bipush 0
      // 1a6: ireturn
      // 1a7: aload 0
      // 1a8: getfield qeaa361f143ee4a0894bd168fd9b30c66/qf4ccf8f5435d4a78bdca4d6a018b578e/abaaabbba.bbbba Lqeaa361f143ee4a0894bd168fd9b30c66/qf4ccf8f5435d4a78bdca4d6a018b578e/baabaab;
      // 1ab: invokevirtual qeaa361f143ee4a0894bd168fd9b30c66/qf4ccf8f5435d4a78bdca4d6a018b578e/baabaab.abbb ()Ljava/lang/Object;
      // 1ae: getstatic qeaa361f143ee4a0894bd168fd9b30c66/qf4ccf8f5435d4a78bdca4d6a018b578e/aaabbbaba.aa Lqeaa361f143ee4a0894bd168fd9b30c66/qf4ccf8f5435d4a78bdca4d6a018b578e/aaabbbaba;
      // 1b1: if_acmpne 1d9
      // 1b4: aload 1
      // 1b5: iload 4
      // 1b7: ifne 1da
      // 1ba: goto 1be
      // 1bd: athrow
      // 1be: aload 3
      // 1bf: invokestatic qeaa361f143ee4a0894bd168fd9b30c66/qf4ccf8f5435d4a78bdca4d6a018b578e/bbabbbb.babaab (Lnet/minecraft/class_310;Lnet/minecraft/class_243;)[F
      // 1c2: astore 7
      // 1c4: aload 7
      // 1c6: ifnull 1d9
      // 1c9: aload 1
      // 1ca: aload 7
      // 1cc: bipush 0
      // 1cd: faload
      // 1ce: aload 7
      // 1d0: bipush 1
      // 1d1: faload
      // 1d2: invokestatic qeaa361f143ee4a0894bd168fd9b30c66/qf4ccf8f5435d4a78bdca4d6a018b578e/aabbabbbb.bbabbab (Lnet/minecraft/class_310;FF)V
      // 1d5: goto 1d9
      // 1d8: athrow
      // 1d9: aload 1
      // 1da: getfield net/minecraft/class_310.field_1687 Lnet/minecraft/class_638;
      // 1dd: astore 7
      // 1df: aload 1
      // 1e0: aload 0
      // 1e1: ldc_w -439572986
      // 1e4: ldc_w 1583148307
      // 1e7: ldc_w 1643556961
      // 1ea: ixor
      // 1eb: invokestatic qeaa361f143ee4a0894bd168fd9b30c66/qf4ccf8f5435d4a78bdca4d6a018b578e/abaaabbba.a (II)I
      // 1ee: ldc2_w 5431131014917037370
      // 1f1: invokestatic qeaa361f143ee4a0894bd168fd9b30c66/qf4ccf8f5435d4a78bdca4d6a018b578e/abaaabbba.aaab (IJ)I
      // 1f4: aload 6
      // 1f6: invokevirtual net/minecraft/class_3965.method_17784 ()Lnet/minecraft/class_243;
      // 1f9: aload 0
      // 1fa: aload 1
      // 1fb: aload 7
      // 1fd: iload 5
      // 1ff: aload 6
      // 201: invokedynamic run (Lqeaa361f143ee4a0894bd168fd9b30c66/qf4ccf8f5435d4a78bdca4d6a018b578e/abaaabbba;Lnet/minecraft/class_310;Ljava/lang/Object;ILnet/minecraft/class_3965;)Lqeaa361f143ee4a0894bd168fd9b30c66/qf4ccf8f5435d4a78bdca4d6a018b578e/aabbaabbb; bsm=java/lang/invoke/LambdaMetafactory.metafactory (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;Ljava/lang/invoke/MethodType;Ljava/lang/invoke/MethodHandle;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[ ()Z, qeaa361f143ee4a0894bd168fd9b30c66/qf4ccf8f5435d4a78bdca4d6a018b578e/abaaabbba.ababaa (Lnet/minecraft/class_310;Ljava/lang/Object;ILnet/minecraft/class_3965;)Z, ()Z ]
      // 206: invokestatic qeaa361f143ee4a0894bd168fd9b30c66/qf4ccf8f5435d4a78bdca4d6a018b578e/bbabbbb.aaaaaab (Lnet/minecraft/class_310;Ljava/lang/Object;ILnet/minecraft/class_243;Lqeaa361f143ee4a0894bd168fd9b30c66/qf4ccf8f5435d4a78bdca4d6a018b578e/aabbaabbb;)Z
      // 209: ireturn
   }

   private static boolean aba() {
      return true;
   }

   public boolean abb(class_1309 param1) {
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
      // 06: ifne 20
      // 09: ifnull 4d
      // 0c: goto 10
      // 0f: athrow
      // 10: aload 0
      // 11: iload 2
      // 12: ifne 29
      // 15: goto 19
      // 18: athrow
      // 19: getfield qeaa361f143ee4a0894bd168fd9b30c66/qf4ccf8f5435d4a78bdca4d6a018b578e/abaaabbba.aab Lnet/minecraft/class_1309;
      // 1c: goto 20
      // 1f: athrow
      // 20: aload 1
      // 21: if_acmpne 4d
      // 24: aload 0
      // 25: goto 29
      // 28: athrow
      // 29: getfield qeaa361f143ee4a0894bd168fd9b30c66/qf4ccf8f5435d4a78bdca4d6a018b578e/abaaabbba.bbbab Lqeaa361f143ee4a0894bd168fd9b30c66/qf4ccf8f5435d4a78bdca4d6a018b578e/aaabaaaba;
      // 2c: iload 2
      // 2d: ifne 42
      // 30: getstatic qeaa361f143ee4a0894bd168fd9b30c66/qf4ccf8f5435d4a78bdca4d6a018b578e/aaabaaaba.abb Lqeaa361f143ee4a0894bd168fd9b30c66/qf4ccf8f5435d4a78bdca4d6a018b578e/aaabaaaba;
      // 33: if_acmpeq 4d
      // 36: goto 3a
      // 39: athrow
      // 3a: aload 0
      // 3b: getfield qeaa361f143ee4a0894bd168fd9b30c66/qf4ccf8f5435d4a78bdca4d6a018b578e/abaaabbba.bbbab Lqeaa361f143ee4a0894bd168fd9b30c66/qf4ccf8f5435d4a78bdca4d6a018b578e/aaabaaaba;
      // 3e: goto 42
      // 41: athrow
      // 42: getstatic qeaa361f143ee4a0894bd168fd9b30c66/qf4ccf8f5435d4a78bdca4d6a018b578e/aaabaaaba.b Lqeaa361f143ee4a0894bd168fd9b30c66/qf4ccf8f5435d4a78bdca4d6a018b578e/aaabaaaba;
      // 45: if_acmpeq 4d
      // 48: bipush 1
      // 49: goto 4e
      // 4c: athrow
      // 4d: bipush 0
      // 4e: ireturn
   }

   private void bab(class_310 var1, long var2) {
      this.bbbab = aaabaaaba.bb;
      this.babbb = var2;
      this.abb = var2 + this.bbaab(this.aaaaaa);
      this.aaaa(var1);
   }

   private boolean bba(class_310 param1, class_1309 param2) {
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
      // 06: invokevirtual qeaa361f143ee4a0894bd168fd9b30c66/qf4ccf8f5435d4a78bdca4d6a018b578e/abaaabbba.baaba (Lnet/minecraft/class_310;)Z
      // 09: iload 3
      // 0a: ifne 23
      // 0d: ifne 17
      // 10: goto 14
      // 13: athrow
      // 14: bipush 0
      // 15: ireturn
      // 16: athrow
      // 17: aload 2
      // 18: iload 3
      // 19: ifne 27
      // 1c: instanceof net/minecraft/class_1657
      // 1f: goto 23
      // 22: athrow
      // 23: ifeq 94
      // 26: aload 2
      // 27: iload 3
      // 28: ifne 3f
      // 2b: aload 1
      // 2c: getfield net/minecraft/class_310.field_1724 Lnet/minecraft/class_746;
      // 2f: if_acmpeq 94
      // 32: goto 36
      // 35: athrow
      // 36: aload 2
      // 37: iload 3
      // 38: ifne 4e
      // 3b: goto 3f
      // 3e: athrow
      // 3f: invokevirtual net/minecraft/class_1309.method_5805 ()Z
      // 42: ifeq 94
      // 45: aload 2
      // 46: iload 3
      // 47: ifne 59
      // 4a: goto 4e
      // 4d: athrow
      // 4e: invokevirtual net/minecraft/class_1309.method_6039 ()Z
      // 51: ifeq 94
      // 54: aload 2
      // 55: goto 59
      // 58: athrow
      // 59: aload 1
      // 5a: getfield net/minecraft/class_310.field_1724 Lnet/minecraft/class_746;
      // 5d: invokestatic qeaa361f143ee4a0894bd168fd9b30c66/qf4ccf8f5435d4a78bdca4d6a018b578e/aabbabbbb.aaa (Lnet/minecraft/class_1309;Lnet/minecraft/class_746;)Z
      // 60: iload 3
      // 61: ifne 7c
      // 64: ifeq 94
      // 67: goto 6b
      // 6a: athrow
      // 6b: aload 0
      // 6c: iload 3
      // 6d: ifne 80
      // 70: goto 74
      // 73: athrow
      // 74: aload 2
      // 75: invokevirtual qeaa361f143ee4a0894bd168fd9b30c66/qf4ccf8f5435d4a78bdca4d6a018b578e/abaaabbba.abbba (Lnet/minecraft/class_1309;)Z
      // 78: goto 7c
      // 7b: athrow
      // 7c: ifne 94
      // 7f: aload 0
      // 80: aload 1
      // 81: aload 2
      // 82: invokevirtual qeaa361f143ee4a0894bd168fd9b30c66/qf4ccf8f5435d4a78bdca4d6a018b578e/abaaabbba.abbb (Lnet/minecraft/class_310;Lnet/minecraft/class_1309;)Z
      // 85: iload 3
      // 86: ifne 91
      // 89: ifeq 94
      // 8c: goto 90
      // 8f: athrow
      // 90: bipush 1
      // 91: goto 95
      // 94: bipush 0
      // 95: ireturn
   }

   @Override
   public void aabaa() {
      this.abaaba(class_310.method_1551());
      this.bbaba.aaaa();
   }

   private void bbb() {
      this.baab();
      this.aabb = -1;
      this.abbbb();
      this.aaabb = -1;
      this.baaaa = aaab(a(-439572987, 680959474 ^ 737826618), 7477281668697820497L);
      this.bbabb = 0.0F;
      this.aaa = class_243.field_1353;
      this.baabb = false;
   }

   private void aaaa(class_310 param1) {
      // $VF: Couldn't be decompiled
      // Please report this to the Vineflower issue tracker, at https://github.com/Vineflower/vineflower/issues with a copy of the class file (if you have the rights to distribute it!)
      // java.lang.NullPointerException: Cannot invoke "org.jetbrains.java.decompiler.code.cfg.ExceptionRangeCFG.isCircular()" because "range" is null
      //   at org.jetbrains.java.decompiler.modules.decompiler.decompose.DomHelper.graphToStatement(DomHelper.java:84)
      //   at org.jetbrains.java.decompiler.modules.decompiler.decompose.DomHelper.parseGraph(DomHelper.java:203)
      //   at org.jetbrains.java.decompiler.main.rels.MethodProcessor.codeToJava(MethodProcessor.java:166)
      //
      // Bytecode:
      // 000: ldc_w 1925772966
      // 003: istore 9
      // 005: getstatic qeaa361f143ee4a0894bd168fd9b30c66/qf4ccf8f5435d4a78bdca4d6a018b578e/baaabbaa.bba I
      // 008: istore 2
      // 009: aload 0
      // 00a: getfield qeaa361f143ee4a0894bd168fd9b30c66/qf4ccf8f5435d4a78bdca4d6a018b578e/abaaabbba.bbbab Lqeaa361f143ee4a0894bd168fd9b30c66/qf4ccf8f5435d4a78bdca4d6a018b578e/aaabaaaba;
      // 00d: getstatic qeaa361f143ee4a0894bd168fd9b30c66/qf4ccf8f5435d4a78bdca4d6a018b578e/aaabaaaba.abb Lqeaa361f143ee4a0894bd168fd9b30c66/qf4ccf8f5435d4a78bdca4d6a018b578e/aaabaaaba;
      // 010: if_acmpne 015
      // 013: return
      // 014: athrow
      // 015: aload 1
      // 016: iload 2
      // 017: ifne 022
      // 01a: ifnull 028
      // 01d: goto 021
      // 020: athrow
      // 021: aload 1
      // 022: getfield net/minecraft/class_310.field_1724 Lnet/minecraft/class_746;
      // 025: ifnonnull 02e
      // 028: aload 0
      // 029: invokevirtual qeaa361f143ee4a0894bd168fd9b30c66/qf4ccf8f5435d4a78bdca4d6a018b578e/abaaabbba.abaaab ()V
      // 02c: return
      // 02d: athrow
      // 02e: invokestatic java/lang/System.currentTimeMillis ()J
      // 031: lstore 3
      // 032: aload 0
      // 033: getfield qeaa361f143ee4a0894bd168fd9b30c66/qf4ccf8f5435d4a78bdca4d6a018b578e/abaaabbba.bbbab Lqeaa361f143ee4a0894bd168fd9b30c66/qf4ccf8f5435d4a78bdca4d6a018b578e/aaabaaaba;
      // 036: iload 2
      // 037: ifne 0d9
      // 03a: getstatic qeaa361f143ee4a0894bd168fd9b30c66/qf4ccf8f5435d4a78bdca4d6a018b578e/aaabaaaba.ab Lqeaa361f143ee4a0894bd168fd9b30c66/qf4ccf8f5435d4a78bdca4d6a018b578e/aaabaaaba;
      // 03d: if_acmpne 0c9
      // 040: goto 044
      // 043: athrow
      // 044: aload 0
      // 045: aload 1
      // 046: iload 2
      // 047: ifne 065
      // 04a: goto 04e
      // 04d: athrow
      // 04e: aload 0
      // 04f: getfield qeaa361f143ee4a0894bd168fd9b30c66/qf4ccf8f5435d4a78bdca4d6a018b578e/abaaabbba.aab Lnet/minecraft/class_1309;
      // 052: invokevirtual qeaa361f143ee4a0894bd168fd9b30c66/qf4ccf8f5435d4a78bdca4d6a018b578e/abaaabbba.bba (Lnet/minecraft/class_310;Lnet/minecraft/class_1309;)Z
      // 055: ifne 063
      // 058: goto 05c
      // 05b: athrow
      // 05c: aload 0
      // 05d: lload 3
      // 05e: invokevirtual qeaa361f143ee4a0894bd168fd9b30c66/qf4ccf8f5435d4a78bdca4d6a018b578e/abaaabbba.aaaaaa (J)V
      // 061: return
      // 062: athrow
      // 063: aload 0
      // 064: aload 1
      // 065: aload 0
      // 066: getfield qeaa361f143ee4a0894bd168fd9b30c66/qf4ccf8f5435d4a78bdca4d6a018b578e/abaaabbba.aabaa I
      // 069: invokevirtual qeaa361f143ee4a0894bd168fd9b30c66/qf4ccf8f5435d4a78bdca4d6a018b578e/abaaabbba.bbabb (Lnet/minecraft/class_310;I)Z
      // 06c: iload 2
      // 06d: ifne 0a7
      // 070: ifne 0a1
      // 073: goto 077
      // 076: athrow
      // 077: lload 3
      // 078: aload 0
      // 079: getfield qeaa361f143ee4a0894bd168fd9b30c66/qf4ccf8f5435d4a78bdca4d6a018b578e/abaaabbba.babbb J
      // 07c: lsub
      // 07d: ldc_w -439572988
      // 080: iload 9
      // 082: ldc_w -2031609963
      // 085: ixor
      // 086: invokestatic qeaa361f143ee4a0894bd168fd9b30c66/qf4ccf8f5435d4a78bdca4d6a018b578e/abaaabbba.a (II)I
      // 089: ldc2_w 5338451693477871575
      // 08c: invokestatic qeaa361f143ee4a0894bd168fd9b30c66/qf4ccf8f5435d4a78bdca4d6a018b578e/abaaabbba.aabba (IJ)J
      // 08f: lcmp
      // 090: ifle 0a0
      // 093: goto 097
      // 096: athrow
      // 097: aload 0
      // 098: aload 1
      // 099: invokevirtual qeaa361f143ee4a0894bd168fd9b30c66/qf4ccf8f5435d4a78bdca4d6a018b578e/abaaabbba.baaaa (Lnet/minecraft/class_310;)V
      // 09c: goto 0a0
      // 09f: athrow
      // 0a0: return
      // 0a1: lload 3
      // 0a2: aload 0
      // 0a3: getfield qeaa361f143ee4a0894bd168fd9b30c66/qf4ccf8f5435d4a78bdca4d6a018b578e/abaaabbba.abb J
      // 0a6: lcmp
      // 0a7: iflt 512
      // 0aa: aload 0
      // 0ab: getstatic qeaa361f143ee4a0894bd168fd9b30c66/qf4ccf8f5435d4a78bdca4d6a018b578e/aaabaaaba.aba Lqeaa361f143ee4a0894bd168fd9b30c66/qf4ccf8f5435d4a78bdca4d6a018b578e/aaabaaaba;
      // 0ae: putfield qeaa361f143ee4a0894bd168fd9b30c66/qf4ccf8f5435d4a78bdca4d6a018b578e/abaaabbba.bbbab Lqeaa361f143ee4a0894bd168fd9b30c66/qf4ccf8f5435d4a78bdca4d6a018b578e/aaabaaaba;
      // 0b1: iload 2
      // 0b2: aload 0
      // 0b3: lload 3
      // 0b4: putfield qeaa361f143ee4a0894bd168fd9b30c66/qf4ccf8f5435d4a78bdca4d6a018b578e/abaaabbba.babbb J
      // 0b7: aload 0
      // 0b8: lload 3
      // 0b9: putfield qeaa361f143ee4a0894bd168fd9b30c66/qf4ccf8f5435d4a78bdca4d6a018b578e/abaaabbba.abb J
      // 0bc: aload 0
      // 0bd: aload 1
      // 0be: lload 3
      // 0bf: invokevirtual qeaa361f143ee4a0894bd168fd9b30c66/qf4ccf8f5435d4a78bdca4d6a018b578e/abaaabbba.aaabaa (Lnet/minecraft/class_310;J)V
      // 0c2: ifeq 512
      // 0c5: goto 0c9
      // 0c8: athrow
      // 0c9: aload 0
      // 0ca: iload 2
      // 0cb: ifne 0ff
      // 0ce: goto 0d2
      // 0d1: athrow
      // 0d2: getfield qeaa361f143ee4a0894bd168fd9b30c66/qf4ccf8f5435d4a78bdca4d6a018b578e/abaaabbba.bbbab Lqeaa361f143ee4a0894bd168fd9b30c66/qf4ccf8f5435d4a78bdca4d6a018b578e/aaabaaaba;
      // 0d5: goto 0d9
      // 0d8: athrow
      // 0d9: getstatic qeaa361f143ee4a0894bd168fd9b30c66/qf4ccf8f5435d4a78bdca4d6a018b578e/aaabaaaba.aba Lqeaa361f143ee4a0894bd168fd9b30c66/qf4ccf8f5435d4a78bdca4d6a018b578e/aaabaaaba;
      // 0dc: if_acmpne 0fa
      // 0df: lload 3
      // 0e0: aload 0
      // 0e1: getfield qeaa361f143ee4a0894bd168fd9b30c66/qf4ccf8f5435d4a78bdca4d6a018b578e/abaaabbba.abb J
      // 0e4: lcmp
      // 0e5: iflt 512
      // 0e8: goto 0ec
      // 0eb: athrow
      // 0ec: aload 0
      // 0ed: aload 1
      // 0ee: lload 3
      // 0ef: invokevirtual qeaa361f143ee4a0894bd168fd9b30c66/qf4ccf8f5435d4a78bdca4d6a018b578e/abaaabbba.aaabaa (Lnet/minecraft/class_310;J)V
      // 0f2: iload 2
      // 0f3: ifeq 512
      // 0f6: goto 0fa
      // 0f9: athrow
      // 0fa: aload 0
      // 0fb: goto 0ff
      // 0fe: athrow
      // 0ff: iload 2
      // 100: ifne 123
      // 103: getfield qeaa361f143ee4a0894bd168fd9b30c66/qf4ccf8f5435d4a78bdca4d6a018b578e/abaaabbba.bbbab Lqeaa361f143ee4a0894bd168fd9b30c66/qf4ccf8f5435d4a78bdca4d6a018b578e/aaabaaaba;
      // 106: getstatic qeaa361f143ee4a0894bd168fd9b30c66/qf4ccf8f5435d4a78bdca4d6a018b578e/aaabaaaba.baa Lqeaa361f143ee4a0894bd168fd9b30c66/qf4ccf8f5435d4a78bdca4d6a018b578e/aaabaaaba;
      // 109: if_acmpne 11e
      // 10c: goto 110
      // 10f: athrow
      // 110: aload 0
      // 111: aload 1
      // 112: lload 3
      // 113: invokevirtual qeaa361f143ee4a0894bd168fd9b30c66/qf4ccf8f5435d4a78bdca4d6a018b578e/abaaabbba.aaabaa (Lnet/minecraft/class_310;J)V
      // 116: iload 2
      // 117: ifeq 512
      // 11a: goto 11e
      // 11d: athrow
      // 11e: aload 0
      // 11f: goto 123
      // 122: athrow
      // 123: getfield qeaa361f143ee4a0894bd168fd9b30c66/qf4ccf8f5435d4a78bdca4d6a018b578e/abaaabbba.bbbab Lqeaa361f143ee4a0894bd168fd9b30c66/qf4ccf8f5435d4a78bdca4d6a018b578e/aaabaaaba;
      // 126: iload 2
      // 127: ifne 157
      // 12a: getstatic qeaa361f143ee4a0894bd168fd9b30c66/qf4ccf8f5435d4a78bdca4d6a018b578e/aaabaaaba.aa Lqeaa361f143ee4a0894bd168fd9b30c66/qf4ccf8f5435d4a78bdca4d6a018b578e/aaabaaaba;
      // 12d: if_acmpne 14f
      // 130: goto 134
      // 133: athrow
      // 134: lload 3
      // 135: aload 0
      // 136: getfield qeaa361f143ee4a0894bd168fd9b30c66/qf4ccf8f5435d4a78bdca4d6a018b578e/abaaabbba.abb J
      // 139: lcmp
      // 13a: iflt 512
      // 13d: goto 141
      // 140: athrow
      // 141: aload 0
      // 142: aload 1
      // 143: lload 3
      // 144: invokevirtual qeaa361f143ee4a0894bd168fd9b30c66/qf4ccf8f5435d4a78bdca4d6a018b578e/abaaabbba.aaaaa (Lnet/minecraft/class_310;J)V
      // 147: iload 2
      // 148: ifeq 512
      // 14b: goto 14f
      // 14e: athrow
      // 14f: aload 0
      // 150: getfield qeaa361f143ee4a0894bd168fd9b30c66/qf4ccf8f5435d4a78bdca4d6a018b578e/abaaabbba.bbbab Lqeaa361f143ee4a0894bd168fd9b30c66/qf4ccf8f5435d4a78bdca4d6a018b578e/aaabaaaba;
      // 153: goto 157
      // 156: athrow
      // 157: iload 2
      // 158: ifne 1de
      // 15b: getstatic qeaa361f143ee4a0894bd168fd9b30c66/qf4ccf8f5435d4a78bdca4d6a018b578e/aaabaaaba.ba Lqeaa361f143ee4a0894bd168fd9b30c66/qf4ccf8f5435d4a78bdca4d6a018b578e/aaabaaaba;
      // 15e: if_acmpne 1d2
      // 161: goto 165
      // 164: athrow
      // 165: lload 3
      // 166: aload 0
      // 167: getfield qeaa361f143ee4a0894bd168fd9b30c66/qf4ccf8f5435d4a78bdca4d6a018b578e/abaaabbba.abb J
      // 16a: lcmp
      // 16b: iload 2
      // 16c: ifne 18b
      // 16f: goto 173
      // 172: athrow
      // 173: iflt 512
      // 176: goto 17a
      // 179: athrow
      // 17a: aload 0
      // 17b: iload 2
      // 17c: ifne 1cd
      // 17f: goto 183
      // 182: athrow
      // 183: aload 1
      // 184: invokevirtual qeaa361f143ee4a0894bd168fd9b30c66/qf4ccf8f5435d4a78bdca4d6a018b578e/abaaabbba.aabaaa (Lnet/minecraft/class_310;)Z
      // 187: goto 18b
      // 18a: athrow
      // 18b: ifne 1bb
      // 18e: lload 3
      // 18f: aload 0
      // 190: getfield qeaa361f143ee4a0894bd168fd9b30c66/qf4ccf8f5435d4a78bdca4d6a018b578e/abaaabbba.babbb J
      // 193: lsub
      // 194: ldc_w -439572989
      // 197: iload 9
      // 199: ldc_w 1923028507
      // 19c: ixor
      // 19d: invokestatic qeaa361f143ee4a0894bd168fd9b30c66/qf4ccf8f5435d4a78bdca4d6a018b578e/abaaabbba.a (II)I
      // 1a0: ldc2_w 5338451693477871575
      // 1a3: invokestatic qeaa361f143ee4a0894bd168fd9b30c66/qf4ccf8f5435d4a78bdca4d6a018b578e/abaaabbba.aabba (IJ)J
      // 1a6: lcmp
      // 1a7: ifle 1b5
      // 1aa: goto 1ae
      // 1ad: athrow
      // 1ae: aload 0
      // 1af: lload 3
      // 1b0: invokevirtual qeaa361f143ee4a0894bd168fd9b30c66/qf4ccf8f5435d4a78bdca4d6a018b578e/abaaabbba.aaaaaa (J)V
      // 1b3: return
      // 1b4: athrow
      // 1b5: aload 0
      // 1b6: lload 3
      // 1b7: putfield qeaa361f143ee4a0894bd168fd9b30c66/qf4ccf8f5435d4a78bdca4d6a018b578e/abaaabbba.abb J
      // 1ba: return
      // 1bb: aload 0
      // 1bc: getstatic qeaa361f143ee4a0894bd168fd9b30c66/qf4ccf8f5435d4a78bdca4d6a018b578e/aaabaaaba.aaa Lqeaa361f143ee4a0894bd168fd9b30c66/qf4ccf8f5435d4a78bdca4d6a018b578e/aaabaaaba;
      // 1bf: putfield qeaa361f143ee4a0894bd168fd9b30c66/qf4ccf8f5435d4a78bdca4d6a018b578e/abaaabbba.bbbab Lqeaa361f143ee4a0894bd168fd9b30c66/qf4ccf8f5435d4a78bdca4d6a018b578e/aaabaaaba;
      // 1c2: aload 0
      // 1c3: lload 3
      // 1c4: putfield qeaa361f143ee4a0894bd168fd9b30c66/qf4ccf8f5435d4a78bdca4d6a018b578e/abaaabbba.babbb J
      // 1c7: aload 0
      // 1c8: lload 3
      // 1c9: putfield qeaa361f143ee4a0894bd168fd9b30c66/qf4ccf8f5435d4a78bdca4d6a018b578e/abaaabbba.abb J
      // 1cc: aload 0
      // 1cd: aload 1
      // 1ce: invokevirtual qeaa361f143ee4a0894bd168fd9b30c66/qf4ccf8f5435d4a78bdca4d6a018b578e/abaaabbba.aaaa (Lnet/minecraft/class_310;)V
      // 1d1: return
      // 1d2: aload 0
      // 1d3: iload 2
      // 1d4: ifne 331
      // 1d7: getfield qeaa361f143ee4a0894bd168fd9b30c66/qf4ccf8f5435d4a78bdca4d6a018b578e/abaaabbba.bbbab Lqeaa361f143ee4a0894bd168fd9b30c66/qf4ccf8f5435d4a78bdca4d6a018b578e/aaabaaaba;
      // 1da: goto 1de
      // 1dd: athrow
      // 1de: getstatic qeaa361f143ee4a0894bd168fd9b30c66/qf4ccf8f5435d4a78bdca4d6a018b578e/aaabaaaba.aaa Lqeaa361f143ee4a0894bd168fd9b30c66/qf4ccf8f5435d4a78bdca4d6a018b578e/aaabaaaba;
      // 1e1: if_acmpne 32c
      // 1e4: aload 1
      // 1e5: iload 2
      // 1e6: ifne 200
      // 1e9: goto 1ed
      // 1ec: athrow
      // 1ed: invokestatic qeaa361f143ee4a0894bd168fd9b30c66/qf4ccf8f5435d4a78bdca4d6a018b578e/aabbabbbb.baabaab (Lnet/minecraft/class_310;)I
      // 1f0: aload 0
      // 1f1: getfield qeaa361f143ee4a0894bd168fd9b30c66/qf4ccf8f5435d4a78bdca4d6a018b578e/abaaabbba.aabb I
      // 1f4: if_icmpne 212
      // 1f7: goto 1fb
      // 1fa: athrow
      // 1fb: aload 1
      // 1fc: goto 200
      // 1ff: athrow
      // 200: iload 2
      // 201: ifne 22c
      // 204: aload 0
      // 205: getfield qeaa361f143ee4a0894bd168fd9b30c66/qf4ccf8f5435d4a78bdca4d6a018b578e/abaaabbba.aabb I
      // 208: invokestatic qeaa361f143ee4a0894bd168fd9b30c66/qf4ccf8f5435d4a78bdca4d6a018b578e/aabbabbbb.abaaa (Lnet/minecraft/class_310;I)Z
      // 20b: ifne 225
      // 20e: goto 212
      // 211: athrow
      // 212: aload 0
      // 213: getstatic qeaa361f143ee4a0894bd168fd9b30c66/qf4ccf8f5435d4a78bdca4d6a018b578e/aaabaaaba.ba Lqeaa361f143ee4a0894bd168fd9b30c66/qf4ccf8f5435d4a78bdca4d6a018b578e/aaabaaaba;
      // 216: putfield qeaa361f143ee4a0894bd168fd9b30c66/qf4ccf8f5435d4a78bdca4d6a018b578e/abaaabbba.bbbab Lqeaa361f143ee4a0894bd168fd9b30c66/qf4ccf8f5435d4a78bdca4d6a018b578e/aaabaaaba;
      // 219: aload 0
      // 21a: lload 3
      // 21b: putfield qeaa361f143ee4a0894bd168fd9b30c66/qf4ccf8f5435d4a78bdca4d6a018b578e/abaaabbba.babbb J
      // 21e: aload 0
      // 21f: lload 3
      // 220: putfield qeaa361f143ee4a0894bd168fd9b30c66/qf4ccf8f5435d4a78bdca4d6a018b578e/abaaabbba.abb J
      // 223: return
      // 224: athrow
      // 225: aload 0
      // 226: getfield qeaa361f143ee4a0894bd168fd9b30c66/qf4ccf8f5435d4a78bdca4d6a018b578e/abaaabbba.bbbba Lqeaa361f143ee4a0894bd168fd9b30c66/qf4ccf8f5435d4a78bdca4d6a018b578e/baabaab;
      // 229: invokevirtual qeaa361f143ee4a0894bd168fd9b30c66/qf4ccf8f5435d4a78bdca4d6a018b578e/baabaab.abbb ()Ljava/lang/Object;
      // 22c: getstatic qeaa361f143ee4a0894bd168fd9b30c66/qf4ccf8f5435d4a78bdca4d6a018b578e/aaabbbaba.a Lqeaa361f143ee4a0894bd168fd9b30c66/qf4ccf8f5435d4a78bdca4d6a018b578e/aaabbbaba;
      // 22f: if_acmpne 2f2
      // 232: lload 3
      // 233: aload 0
      // 234: getfield qeaa361f143ee4a0894bd168fd9b30c66/qf4ccf8f5435d4a78bdca4d6a018b578e/abaaabbba.babbb J
      // 237: lsub
      // 238: ldc_w -439572990
      // 23b: iload 9
      // 23d: ldc_w -385502622
      // 240: ixor
      // 241: invokestatic qeaa361f143ee4a0894bd168fd9b30c66/qf4ccf8f5435d4a78bdca4d6a018b578e/abaaabbba.a (II)I
      // 244: ldc2_w 5338451693477871575
      // 247: invokestatic qeaa361f143ee4a0894bd168fd9b30c66/qf4ccf8f5435d4a78bdca4d6a018b578e/abaaabbba.aabba (IJ)J
      // 24a: lcmp
      // 24b: iflt 25a
      // 24e: goto 252
      // 251: athrow
      // 252: aload 0
      // 253: aload 1
      // 254: lload 3
      // 255: invokevirtual qeaa361f143ee4a0894bd168fd9b30c66/qf4ccf8f5435d4a78bdca4d6a018b578e/abaaabbba.bab (Lnet/minecraft/class_310;J)V
      // 258: return
      // 259: athrow
      // 25a: aload 0
      // 25b: getfield qeaa361f143ee4a0894bd168fd9b30c66/qf4ccf8f5435d4a78bdca4d6a018b578e/abaaabbba.bbaba Lqeaa361f143ee4a0894bd168fd9b30c66/qf4ccf8f5435d4a78bdca4d6a018b578e/ababbbbba;
      // 25e: aload 1
      // 25f: aload 0
      // 260: getfield qeaa361f143ee4a0894bd168fd9b30c66/qf4ccf8f5435d4a78bdca4d6a018b578e/abaaabbba.bab Lnet/minecraft/class_3965;
      // 263: aload 0
      // 264: getfield qeaa361f143ee4a0894bd168fd9b30c66/qf4ccf8f5435d4a78bdca4d6a018b578e/abaaabbba.baa Lqeaa361f143ee4a0894bd168fd9b30c66/qf4ccf8f5435d4a78bdca4d6a018b578e/bababa;
      // 267: invokevirtual qeaa361f143ee4a0894bd168fd9b30c66/qf4ccf8f5435d4a78bdca4d6a018b578e/bababa.abbb ()Ljava/lang/Object;
      // 26a: checkcast java/lang/Double
      // 26d: invokevirtual java/lang/Double.floatValue ()F
      // 270: invokevirtual qeaa361f143ee4a0894bd168fd9b30c66/qf4ccf8f5435d4a78bdca4d6a018b578e/ababbbbba.bbaba (Lnet/minecraft/class_310;Lnet/minecraft/class_3965;F)F
      // 273: fstore 5
      // 275: fload 5
      // 277: iload 2
      // 278: ifne 294
      // 27b: ldc_w 3.4028235E38
      // 27e: fcmpl
      // 27f: ifne 292
      // 282: goto 286
      // 285: athrow
      // 286: aload 0
      // 287: invokevirtual qeaa361f143ee4a0894bd168fd9b30c66/qf4ccf8f5435d4a78bdca4d6a018b578e/abaaabbba.abbbb ()V
      // 28a: aload 0
      // 28b: aload 1
      // 28c: lload 3
      // 28d: invokevirtual qeaa361f143ee4a0894bd168fd9b30c66/qf4ccf8f5435d4a78bdca4d6a018b578e/abaaabbba.bab (Lnet/minecraft/class_310;J)V
      // 290: return
      // 291: athrow
      // 292: fload 5
      // 294: ldc_w 2.5
      // 297: fcmpg
      // 298: iload 2
      // 299: ifne 2d9
      // 29c: ifle 2d8
      // 29f: goto 2a3
      // 2a2: athrow
      // 2a3: aload 1
      // 2a4: getfield net/minecraft/class_310.field_1765 Lnet/minecraft/class_239;
      // 2a7: astore 8
      // 2a9: aload 8
      // 2ab: iload 2
      // 2ac: ifne 2bf
      // 2af: instanceof net/minecraft/class_3965
      // 2b2: ifeq 2dc
      // 2b5: goto 2b9
      // 2b8: athrow
      // 2b9: aload 8
      // 2bb: goto 2bf
      // 2be: athrow
      // 2bf: checkcast net/minecraft/class_3965
      // 2c2: astore 7
      // 2c4: aload 7
      // 2c6: aload 0
      // 2c7: getfield qeaa361f143ee4a0894bd168fd9b30c66/qf4ccf8f5435d4a78bdca4d6a018b578e/abaaabbba.bab Lnet/minecraft/class_3965;
      // 2ca: invokestatic qeaa361f143ee4a0894bd168fd9b30c66/qf4ccf8f5435d4a78bdca4d6a018b578e/abaaabbba.aaaab (Lnet/minecraft/class_3965;Lnet/minecraft/class_3965;)Z
      // 2cd: iload 2
      // 2ce: ifne 2d9
      // 2d1: ifeq 2dc
      // 2d4: goto 2d8
      // 2d7: athrow
      // 2d8: bipush 1
      // 2d9: goto 2dd
      // 2dc: bipush 0
      // 2dd: istore 6
      // 2df: iload 6
      // 2e1: ifeq 2ee
      // 2e4: aload 0
      // 2e5: aload 1
      // 2e6: lload 3
      // 2e7: invokevirtual qeaa361f143ee4a0894bd168fd9b30c66/qf4ccf8f5435d4a78bdca4d6a018b578e/abaaabbba.bab (Lnet/minecraft/class_310;J)V
      // 2ea: goto 2ee
      // 2ed: athrow
      // 2ee: iload 2
      // 2ef: ifeq 512
      // 2f2: lload 3
      // 2f3: aload 0
      // 2f4: getfield qeaa361f143ee4a0894bd168fd9b30c66/qf4ccf8f5435d4a78bdca4d6a018b578e/abaaabbba.abb J
      // 2f7: lcmp
      // 2f8: iload 2
      // 2f9: ifne 318
      // 2fc: goto 300
      // 2ff: athrow
      // 300: iflt 512
      // 303: goto 307
      // 306: athrow
      // 307: aload 0
      // 308: iload 2
      // 309: ifne 323
      // 30c: goto 310
      // 30f: athrow
      // 310: aload 1
      // 311: invokevirtual qeaa361f143ee4a0894bd168fd9b30c66/qf4ccf8f5435d4a78bdca4d6a018b578e/abaaabbba.bbab (Lnet/minecraft/class_310;)Z
      // 314: goto 318
      // 317: athrow
      // 318: ifne 322
      // 31b: aload 0
      // 31c: lload 3
      // 31d: invokevirtual qeaa361f143ee4a0894bd168fd9b30c66/qf4ccf8f5435d4a78bdca4d6a018b578e/abaaabbba.aaaaaa (J)V
      // 320: return
      // 321: athrow
      // 322: aload 0
      // 323: aload 1
      // 324: lload 3
      // 325: invokevirtual qeaa361f143ee4a0894bd168fd9b30c66/qf4ccf8f5435d4a78bdca4d6a018b578e/abaaabbba.bab (Lnet/minecraft/class_310;J)V
      // 328: iload 2
      // 329: ifeq 512
      // 32c: aload 0
      // 32d: goto 331
      // 330: athrow
      // 331: getfield qeaa361f143ee4a0894bd168fd9b30c66/qf4ccf8f5435d4a78bdca4d6a018b578e/abaaabbba.bbbab Lqeaa361f143ee4a0894bd168fd9b30c66/qf4ccf8f5435d4a78bdca4d6a018b578e/aaabaaaba;
      // 334: iload 2
      // 335: ifne 481
      // 338: getstatic qeaa361f143ee4a0894bd168fd9b30c66/qf4ccf8f5435d4a78bdca4d6a018b578e/aaabaaaba.bb Lqeaa361f143ee4a0894bd168fd9b30c66/qf4ccf8f5435d4a78bdca4d6a018b578e/aaabaaaba;
      // 33b: if_acmpne 479
      // 33e: goto 342
      // 341: athrow
      // 342: aload 0
      // 343: iload 2
      // 344: ifne 3b4
      // 347: goto 34b
      // 34a: athrow
      // 34b: getfield qeaa361f143ee4a0894bd168fd9b30c66/qf4ccf8f5435d4a78bdca4d6a018b578e/abaaabbba.bbba Lnet/minecraft/class_2338;
      // 34e: ifnull 3b3
      // 351: goto 355
      // 354: athrow
      // 355: aload 1
      // 356: getfield net/minecraft/class_310.field_1687 Lnet/minecraft/class_638;
      // 359: aload 0
      // 35a: getfield qeaa361f143ee4a0894bd168fd9b30c66/qf4ccf8f5435d4a78bdca4d6a018b578e/abaaabbba.bba Ljava/lang/Object;
      // 35d: if_acmpne 3a9
      // 360: goto 364
      // 363: athrow
      // 364: aload 0
      // 365: iload 2
      // 366: ifne 3ae
      // 369: goto 36d
      // 36c: athrow
      // 36d: getfield qeaa361f143ee4a0894bd168fd9b30c66/qf4ccf8f5435d4a78bdca4d6a018b578e/abaaabbba.bbb Z
      // 370: ifne 3a9
      // 373: goto 377
      // 376: athrow
      // 377: aload 1
      // 378: iload 2
      // 379: ifne 39c
      // 37c: goto 380
      // 37f: athrow
      // 380: getfield net/minecraft/class_310.field_1687 Lnet/minecraft/class_638;
      // 383: aload 0
      // 384: getfield qeaa361f143ee4a0894bd168fd9b30c66/qf4ccf8f5435d4a78bdca4d6a018b578e/abaaabbba.bbba Lnet/minecraft/class_2338;
      // 387: invokevirtual net/minecraft/class_638.method_8320 (Lnet/minecraft/class_2338;)Lnet/minecraft/class_2680;
      // 38a: getstatic net/minecraft/class_2246.field_10343 Lnet/minecraft/class_2248;
      // 38d: invokevirtual net/minecraft/class_2680.method_27852 (Lnet/minecraft/class_2248;)Z
      // 390: ifne 3a9
      // 393: goto 397
      // 396: athrow
      // 397: aload 1
      // 398: goto 39c
      // 39b: athrow
      // 39c: getfield net/minecraft/class_310.field_1724 Lnet/minecraft/class_746;
      // 39f: getfield net/minecraft/class_746.field_6012 I
      // 3a2: aload 0
      // 3a3: getfield qeaa361f143ee4a0894bd168fd9b30c66/qf4ccf8f5435d4a78bdca4d6a018b578e/abaaabbba.abbaa I
      // 3a6: if_icmplt 3b2
      // 3a9: aload 0
      // 3aa: goto 3ae
      // 3ad: athrow
      // 3ae: lload 3
      // 3af: invokevirtual qeaa361f143ee4a0894bd168fd9b30c66/qf4ccf8f5435d4a78bdca4d6a018b578e/abaaabbba.aaaaaa (J)V
      // 3b2: return
      // 3b3: aload 0
      // 3b4: iload 2
      // 3b5: ifne 3cb
      // 3b8: aload 1
      // 3b9: invokevirtual qeaa361f143ee4a0894bd168fd9b30c66/qf4ccf8f5435d4a78bdca4d6a018b578e/abaaabbba.bbbbb (Lnet/minecraft/class_310;)Z
      // 3bc: ifeq 3ca
      // 3bf: goto 3c3
      // 3c2: athrow
      // 3c3: aload 0
      // 3c4: lload 3
      // 3c5: putfield qeaa361f143ee4a0894bd168fd9b30c66/qf4ccf8f5435d4a78bdca4d6a018b578e/abaaabbba.abb J
      // 3c8: return
      // 3c9: athrow
      // 3ca: aload 0
      // 3cb: getfield qeaa361f143ee4a0894bd168fd9b30c66/qf4ccf8f5435d4a78bdca4d6a018b578e/abaaabbba.baabb Z
      // 3ce: iload 2
      // 3cf: ifne 409
      // 3d2: ifeq 403
      // 3d5: goto 3d9
      // 3d8: athrow
      // 3d9: lload 3
      // 3da: aload 0
      // 3db: getfield qeaa361f143ee4a0894bd168fd9b30c66/qf4ccf8f5435d4a78bdca4d6a018b578e/abaaabbba.babbb J
      // 3de: lsub
      // 3df: ldc_w -439572991
      // 3e2: iload 9
      // 3e4: ldc_w -1393452424
      // 3e7: ixor
      // 3e8: invokestatic qeaa361f143ee4a0894bd168fd9b30c66/qf4ccf8f5435d4a78bdca4d6a018b578e/abaaabbba.a (II)I
      // 3eb: ldc2_w 5338451693477871575
      // 3ee: invokestatic qeaa361f143ee4a0894bd168fd9b30c66/qf4ccf8f5435d4a78bdca4d6a018b578e/abaaabbba.aabba (IJ)J
      // 3f1: lcmp
      // 3f2: ifle 402
      // 3f5: goto 3f9
      // 3f8: athrow
      // 3f9: aload 0
      // 3fa: lload 3
      // 3fb: invokevirtual qeaa361f143ee4a0894bd168fd9b30c66/qf4ccf8f5435d4a78bdca4d6a018b578e/abaaabbba.aaaaaa (J)V
      // 3fe: goto 402
      // 401: athrow
      // 402: return
      // 403: lload 3
      // 404: aload 0
      // 405: getfield qeaa361f143ee4a0894bd168fd9b30c66/qf4ccf8f5435d4a78bdca4d6a018b578e/abaaabbba.abb J
      // 408: lcmp
      // 409: iload 2
      // 40a: ifne 421
      // 40d: iflt 512
      // 410: goto 414
      // 413: athrow
      // 414: aload 0
      // 415: aload 1
      // 416: aload 0
      // 417: getfield qeaa361f143ee4a0894bd168fd9b30c66/qf4ccf8f5435d4a78bdca4d6a018b578e/abaaabbba.aab Lnet/minecraft/class_1309;
      // 41a: invokevirtual qeaa361f143ee4a0894bd168fd9b30c66/qf4ccf8f5435d4a78bdca4d6a018b578e/abaaabbba.aababa (Lnet/minecraft/class_310;Lnet/minecraft/class_1309;)Z
      // 41d: goto 421
      // 420: athrow
      // 421: iload 2
      // 422: ifne 449
      // 425: ifne 512
      // 428: goto 42c
      // 42b: athrow
      // 42c: lload 3
      // 42d: aload 0
      // 42e: getfield qeaa361f143ee4a0894bd168fd9b30c66/qf4ccf8f5435d4a78bdca4d6a018b578e/abaaabbba.babbb J
      // 431: lsub
      // 432: ldc_w -439572992
      // 435: iload 9
      // 437: ldc_w 697387560
      // 43a: ixor
      // 43b: invokestatic qeaa361f143ee4a0894bd168fd9b30c66/qf4ccf8f5435d4a78bdca4d6a018b578e/abaaabbba.a (II)I
      // 43e: ldc2_w 5338451693477871575
      // 441: invokestatic qeaa361f143ee4a0894bd168fd9b30c66/qf4ccf8f5435d4a78bdca4d6a018b578e/abaaabbba.aabba (IJ)J
      // 444: lcmp
      // 445: goto 449
      // 448: athrow
      // 449: ifgt 46c
      // 44c: aload 0
      // 44d: lload 3
      // 44e: ldc_w -439572977
      // 451: iload 9
      // 453: ldc_w 98472949
      // 456: ixor
      // 457: invokestatic qeaa361f143ee4a0894bd168fd9b30c66/qf4ccf8f5435d4a78bdca4d6a018b578e/abaaabbba.a (II)I
      // 45a: ldc2_w 402816679086992944
      // 45d: invokestatic qeaa361f143ee4a0894bd168fd9b30c66/qf4ccf8f5435d4a78bdca4d6a018b578e/abaaabbba.aabba (IJ)J
      // 460: ladd
      // 461: putfield qeaa361f143ee4a0894bd168fd9b30c66/qf4ccf8f5435d4a78bdca4d6a018b578e/abaaabbba.abb J
      // 464: iload 2
      // 465: ifeq 512
      // 468: goto 46c
      // 46b: athrow
      // 46c: aload 0
      // 46d: lload 3
      // 46e: invokevirtual qeaa361f143ee4a0894bd168fd9b30c66/qf4ccf8f5435d4a78bdca4d6a018b578e/abaaabbba.aaaaaa (J)V
      // 471: iload 2
      // 472: ifeq 512
      // 475: goto 479
      // 478: athrow
      // 479: aload 0
      // 47a: getfield qeaa361f143ee4a0894bd168fd9b30c66/qf4ccf8f5435d4a78bdca4d6a018b578e/abaaabbba.bbbab Lqeaa361f143ee4a0894bd168fd9b30c66/qf4ccf8f5435d4a78bdca4d6a018b578e/aaabaaaba;
      // 47d: goto 481
      // 480: athrow
      // 481: getstatic qeaa361f143ee4a0894bd168fd9b30c66/qf4ccf8f5435d4a78bdca4d6a018b578e/aaabaaaba.b Lqeaa361f143ee4a0894bd168fd9b30c66/qf4ccf8f5435d4a78bdca4d6a018b578e/aaabaaaba;
      // 484: if_acmpne 512
      // 487: lload 3
      // 488: aload 0
      // 489: getfield qeaa361f143ee4a0894bd168fd9b30c66/qf4ccf8f5435d4a78bdca4d6a018b578e/abaaabbba.abb J
      // 48c: lcmp
      // 48d: iload 2
      // 48e: ifne 4b5
      // 491: goto 495
      // 494: athrow
      // 495: iflt 512
      // 498: goto 49c
      // 49b: athrow
      // 49c: aload 0
      // 49d: iload 2
      // 49e: ifne 4d2
      // 4a1: goto 4a5
      // 4a4: athrow
      // 4a5: getfield qeaa361f143ee4a0894bd168fd9b30c66/qf4ccf8f5435d4a78bdca4d6a018b578e/abaaabbba.aaaab Lqeaa361f143ee4a0894bd168fd9b30c66/qf4ccf8f5435d4a78bdca4d6a018b578e/abbaaaaa;
      // 4a8: invokevirtual qeaa361f143ee4a0894bd168fd9b30c66/qf4ccf8f5435d4a78bdca4d6a018b578e/abbaaaaa.abbb ()Ljava/lang/Object;
      // 4ab: checkcast java/lang/Boolean
      // 4ae: invokevirtual java/lang/Boolean.booleanValue ()Z
      // 4b1: goto 4b5
      // 4b4: athrow
      // 4b5: ifeq 4c5
      // 4b8: aload 0
      // 4b9: lload 3
      // 4ba: invokevirtual qeaa361f143ee4a0894bd168fd9b30c66/qf4ccf8f5435d4a78bdca4d6a018b578e/abaaabbba.aaaabb (J)V
      // 4bd: iload 2
      // 4be: ifeq 4d6
      // 4c1: goto 4c5
      // 4c4: athrow
      // 4c5: aload 1
      // 4c6: aload 0
      // 4c7: getstatic qeaa361f143ee4a0894bd168fd9b30c66/qf4ccf8f5435d4a78bdca4d6a018b578e/abbaaabba.ab Lqeaa361f143ee4a0894bd168fd9b30c66/qf4ccf8f5435d4a78bdca4d6a018b578e/abbaaabba;
      // 4ca: invokestatic qeaa361f143ee4a0894bd168fd9b30c66/qf4ccf8f5435d4a78bdca4d6a018b578e/aabbabbbb.bbaaabb (Lnet/minecraft/class_310;Ljava/lang/Object;Lqeaa361f143ee4a0894bd168fd9b30c66/qf4ccf8f5435d4a78bdca4d6a018b578e/abbaaabba;)V
      // 4cd: aload 0
      // 4ce: goto 4d2
      // 4d1: athrow
      // 4d2: invokevirtual qeaa361f143ee4a0894bd168fd9b30c66/qf4ccf8f5435d4a78bdca4d6a018b578e/abaaabbba.abaaab ()V
      // 4d5: return
      // 4d6: aload 0
      // 4d7: iload 2
      // 4d8: ifne 50e
      // 4db: aload 1
      // 4dc: invokevirtual qeaa361f143ee4a0894bd168fd9b30c66/qf4ccf8f5435d4a78bdca4d6a018b578e/abaaabbba.bbbbb (Lnet/minecraft/class_310;)Z
      // 4df: ifeq 50d
      // 4e2: goto 4e6
      // 4e5: athrow
      // 4e6: lload 3
      // 4e7: aload 0
      // 4e8: getfield qeaa361f143ee4a0894bd168fd9b30c66/qf4ccf8f5435d4a78bdca4d6a018b578e/abaaabbba.babbb J
      // 4eb: lsub
      // 4ec: ldc_w -439572978
      // 4ef: iload 9
      // 4f1: ldc_w -2050255203
      // 4f4: ixor
      // 4f5: invokestatic qeaa361f143ee4a0894bd168fd9b30c66/qf4ccf8f5435d4a78bdca4d6a018b578e/abaaabbba.a (II)I
      // 4f8: ldc2_w 5338451693477871575
      // 4fb: invokestatic qeaa361f143ee4a0894bd168fd9b30c66/qf4ccf8f5435d4a78bdca4d6a018b578e/abaaabbba.aabba (IJ)J
      // 4fe: lcmp
      // 4ff: ifgt 50d
      // 502: goto 506
      // 505: athrow
      // 506: aload 0
      // 507: lload 3
      // 508: putfield qeaa361f143ee4a0894bd168fd9b30c66/qf4ccf8f5435d4a78bdca4d6a018b578e/abaaabbba.abb J
      // 50b: return
      // 50c: athrow
      // 50d: aload 0
      // 50e: aload 1
      // 50f: invokevirtual qeaa361f143ee4a0894bd168fd9b30c66/qf4ccf8f5435d4a78bdca4d6a018b578e/abaaabbba.baaaa (Lnet/minecraft/class_310;)V
      // 512: return
   }

   private static int aaab(int var0, long var1) {
      int var3 = var0 ^ (int)(var1 & 32767L) ^ a(-439572915, 1574036979 ^ -838685421);
      if (baaa[var3] == null) {
         baaa[var3] = (int)(ababa[var3] ^ var1);
      }

      return baaa[var3];
   }

   private aabaaabab aaba(class_310 param1, class_1309 param2) {
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
      // 06: ifne 3b
      // 09: getfield qeaa361f143ee4a0894bd168fd9b30c66/qf4ccf8f5435d4a78bdca4d6a018b578e/abaaabbba.aaba Lqeaa361f143ee4a0894bd168fd9b30c66/qf4ccf8f5435d4a78bdca4d6a018b578e/abbaaaaa;
      // 0c: invokevirtual qeaa361f143ee4a0894bd168fd9b30c66/qf4ccf8f5435d4a78bdca4d6a018b578e/abbaaaaa.abbb ()Ljava/lang/Object;
      // 0f: checkcast java/lang/Boolean
      // 12: invokevirtual java/lang/Boolean.booleanValue ()Z
      // 15: ifeq 3a
      // 18: goto 1c
      // 1b: athrow
      // 1c: aload 0
      // 1d: aload 1
      // 1e: aload 0
      // 1f: aload 1
      // 20: aload 2
      // 21: invokevirtual qeaa361f143ee4a0894bd168fd9b30c66/qf4ccf8f5435d4a78bdca4d6a018b578e/abaaabbba.abba (Lnet/minecraft/class_310;Lnet/minecraft/class_1309;)Ljava/util/List;
      // 24: iload 3
      // 25: ifne 43
      // 28: goto 2c
      // 2b: athrow
      // 2c: invokevirtual qeaa361f143ee4a0894bd168fd9b30c66/qf4ccf8f5435d4a78bdca4d6a018b578e/abaaabbba.aabbaa (Lnet/minecraft/class_310;Ljava/util/List;)Lqeaa361f143ee4a0894bd168fd9b30c66/qf4ccf8f5435d4a78bdca4d6a018b578e/aabaaabab;
      // 2f: astore 4
      // 31: aload 4
      // 33: ifnull 3a
      // 36: aload 4
      // 38: areturn
      // 39: athrow
      // 3a: aload 0
      // 3b: aload 1
      // 3c: aload 2
      // 3d: invokevirtual net/minecraft/class_1309.method_24515 ()Lnet/minecraft/class_2338;
      // 40: invokestatic java/util/List.of (Ljava/lang/Object;)Ljava/util/List;
      // 43: invokevirtual qeaa361f143ee4a0894bd168fd9b30c66/qf4ccf8f5435d4a78bdca4d6a018b578e/abaaabbba.aabbaa (Lnet/minecraft/class_310;Ljava/util/List;)Lqeaa361f143ee4a0894bd168fd9b30c66/qf4ccf8f5435d4a78bdca4d6a018b578e/aabaaabab;
      // 46: areturn
   }

   private boolean aabb(class_310 param1) {
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
      // 09: ifnull 1f
      // 0c: goto 10
      // 0f: athrow
      // 10: aload 1
      // 11: iload 2
      // 12: ifne 23
      // 15: getfield net/minecraft/class_310.field_1724 Lnet/minecraft/class_746;
      // 18: ifnonnull 22
      // 1b: goto 1f
      // 1e: athrow
      // 1f: bipush 1
      // 20: ireturn
      // 21: athrow
      // 22: aload 1
      // 23: getfield net/minecraft/class_310.field_1724 Lnet/minecraft/class_746;
      // 26: invokestatic qeaa361f143ee4a0894bd168fd9b30c66/qf4ccf8f5435d4a78bdca4d6a018b578e/aabbabbbb.abaabb (Lnet/minecraft/class_1309;)Z
      // 29: ireturn
   }

   private class_3966 abaa(class_310 param1, class_1309 param2) {
      // $VF: Couldn't be decompiled
      // Please report this to the Vineflower issue tracker, at https://github.com/Vineflower/vineflower/issues with a copy of the class file (if you have the rights to distribute it!)
      // java.lang.RuntimeException: parsing failure!
      //   at org.jetbrains.java.decompiler.modules.decompiler.decompose.DomHelper.parseGraph(DomHelper.java:211)
      //   at org.jetbrains.java.decompiler.main.rels.MethodProcessor.codeToJava(MethodProcessor.java:166)
      //
      // Bytecode:
      // 00: getstatic qeaa361f143ee4a0894bd168fd9b30c66/qf4ccf8f5435d4a78bdca4d6a018b578e/baaabbaa.bba I
      // 03: istore 3
      // 04: aload 1
      // 05: iload 3
      // 06: ifne 11
      // 09: ifnull 30
      // 0c: goto 10
      // 0f: athrow
      // 10: aload 1
      // 11: getfield net/minecraft/class_310.field_1724 Lnet/minecraft/class_746;
      // 14: iload 3
      // 15: ifne 20
      // 18: ifnull 30
      // 1b: goto 1f
      // 1e: athrow
      // 1f: aload 2
      // 20: ifnull 30
      // 23: aload 0
      // 24: aload 1
      // 25: aload 2
      // 26: invokevirtual qeaa361f143ee4a0894bd168fd9b30c66/qf4ccf8f5435d4a78bdca4d6a018b578e/abaaabbba.abbb (Lnet/minecraft/class_310;Lnet/minecraft/class_1309;)Z
      // 29: ifne 33
      // 2c: goto 30
      // 2f: athrow
      // 30: aconst_null
      // 31: areturn
      // 32: athrow
      // 33: aload 1
      // 34: getfield net/minecraft/class_310.field_1765 Lnet/minecraft/class_239;
      // 37: astore 6
      // 39: aload 6
      // 3b: iload 3
      // 3c: ifne 4f
      // 3f: instanceof net/minecraft/class_3966
      // 42: ifeq 5b
      // 45: goto 49
      // 48: athrow
      // 49: aload 6
      // 4b: goto 4f
      // 4e: athrow
      // 4f: checkcast net/minecraft/class_3966
      // 52: dup
      // 53: astore 4
      // 55: aload 4
      // 57: pop
      // 58: goto 5c
      // 5b: aconst_null
      // 5c: dup
      // 5d: astore 5
      // 5f: astore 7
      // 61: aload 7
      // 63: pop
      // 64: aload 0
      // 65: aload 1
      // 66: aload 5
      // 68: aload 2
      // 69: iload 3
      // 6a: ifne 85
      // 6d: invokevirtual qeaa361f143ee4a0894bd168fd9b30c66/qf4ccf8f5435d4a78bdca4d6a018b578e/abaaabbba.baba (Lnet/minecraft/class_310;Lnet/minecraft/class_3966;Lnet/minecraft/class_1309;)Z
      // 70: ifne 80
      // 73: goto 77
      // 76: athrow
      // 77: aload 1
      // 78: ldc2_w 3.0
      // 7b: invokestatic qeaa361f143ee4a0894bd168fd9b30c66/qf4ccf8f5435d4a78bdca4d6a018b578e/aabbabbbb.bbbaba (Lnet/minecraft/class_310;D)Lnet/minecraft/class_3966;
      // 7e: astore 5
      // 80: aload 0
      // 81: aload 1
      // 82: aload 5
      // 84: aload 2
      // 85: invokevirtual qeaa361f143ee4a0894bd168fd9b30c66/qf4ccf8f5435d4a78bdca4d6a018b578e/abaaabbba.baba (Lnet/minecraft/class_310;Lnet/minecraft/class_3966;Lnet/minecraft/class_1309;)Z
      // 88: ifeq 91
      // 8b: aload 5
      // 8d: goto 92
      // 90: athrow
      // 91: aconst_null
      // 92: areturn
   }

   private boolean abab(class_310 param1, class_1309 param2) {
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
      // 09: instanceof net/minecraft/class_1657
      // 0c: ifeq 53
      // 0f: goto 13
      // 12: athrow
      // 13: aload 2
      // 14: goto 18
      // 17: athrow
      // 18: iload 3
      // 19: ifne 2c
      // 1c: aload 1
      // 1d: getfield net/minecraft/class_310.field_1724 Lnet/minecraft/class_746;
      // 20: if_acmpeq 53
      // 23: goto 27
      // 26: athrow
      // 27: aload 2
      // 28: goto 2c
      // 2b: athrow
      // 2c: invokevirtual net/minecraft/class_1309.method_5805 ()Z
      // 2f: iload 3
      // 30: ifne 44
      // 33: ifeq 53
      // 36: goto 3a
      // 39: athrow
      // 3a: aload 0
      // 3b: aload 1
      // 3c: aload 2
      // 3d: invokevirtual qeaa361f143ee4a0894bd168fd9b30c66/qf4ccf8f5435d4a78bdca4d6a018b578e/abaaabbba.abbb (Lnet/minecraft/class_310;Lnet/minecraft/class_1309;)Z
      // 40: goto 44
      // 43: athrow
      // 44: iload 3
      // 45: ifne 50
      // 48: ifeq 53
      // 4b: goto 4f
      // 4e: athrow
      // 4f: bipush 1
      // 50: goto 54
      // 53: bipush 0
      // 54: ireturn
   }

   private List abba(class_310 param1, class_1309 param2) {
      // $VF: Couldn't be decompiled
      // Please report this to the Vineflower issue tracker, at https://github.com/Vineflower/vineflower/issues with a copy of the class file (if you have the rights to distribute it!)
      // java.lang.RuntimeException: parsing failure!
      //   at org.jetbrains.java.decompiler.modules.decompiler.decompose.DomHelper.parseGraph(DomHelper.java:211)
      //   at org.jetbrains.java.decompiler.main.rels.MethodProcessor.codeToJava(MethodProcessor.java:166)
      //
      // Bytecode:
      // 000: aload 2
      // 001: invokevirtual net/minecraft/class_1309.method_5829 ()Lnet/minecraft/class_238;
      // 004: astore 4
      // 006: getstatic qeaa361f143ee4a0894bd168fd9b30c66/qf4ccf8f5435d4a78bdca4d6a018b578e/baaabbaa.bba I
      // 009: aload 4
      // 00b: getfield net/minecraft/class_238.field_1322 D
      // 00e: ldc2_w 1.0E-4
      // 011: dadd
      // 012: invokestatic java/lang/Math.floor (D)D
      // 015: d2i
      // 016: istore 5
      // 018: istore 3
      // 019: aload 0
      // 01a: aload 1
      // 01b: aload 2
      // 01c: invokevirtual qeaa361f143ee4a0894bd168fd9b30c66/qf4ccf8f5435d4a78bdca4d6a018b578e/abaaabbba.bbbab (Lnet/minecraft/class_310;Lnet/minecraft/class_1309;)Lnet/minecraft/class_243;
      // 01f: astore 6
      // 021: aload 0
      // 022: aload 1
      // 023: aload 2
      // 024: invokevirtual qeaa361f143ee4a0894bd168fd9b30c66/qf4ccf8f5435d4a78bdca4d6a018b578e/abaaabbba.ab (Lnet/minecraft/class_310;Lnet/minecraft/class_1309;)Lnet/minecraft/class_243;
      // 027: astore 7
      // 029: aload 6
      // 02b: invokevirtual net/minecraft/class_243.method_1027 ()D
      // 02e: ldc2_w 1.0E-6
      // 031: dcmpg
      // 032: iload 3
      // 033: ifne 06a
      // 036: ifge 05e
      // 039: goto 03d
      // 03c: athrow
      // 03d: aload 7
      // 03f: invokevirtual net/minecraft/class_243.method_1027 ()D
      // 042: ldc2_w 1.0E-6
      // 045: dcmpg
      // 046: iload 3
      // 047: ifne 06a
      // 04a: goto 04e
      // 04d: athrow
      // 04e: ifge 05e
      // 051: goto 055
      // 054: athrow
      // 055: aload 2
      // 056: invokevirtual net/minecraft/class_1309.method_24515 ()Lnet/minecraft/class_2338;
      // 059: invokestatic java/util/List.of (Ljava/lang/Object;)Ljava/util/List;
      // 05c: areturn
      // 05d: athrow
      // 05e: aload 0
      // 05f: iload 3
      // 060: ifne 076
      // 063: getfield qeaa361f143ee4a0894bd168fd9b30c66/qf4ccf8f5435d4a78bdca4d6a018b578e/abaaabbba.aaabb I
      // 066: goto 06a
      // 069: athrow
      // 06a: aload 2
      // 06b: invokevirtual net/minecraft/class_1309.method_5628 ()I
      // 06e: if_icmpne 0bb
      // 071: aload 0
      // 072: goto 076
      // 075: athrow
      // 076: getfield qeaa361f143ee4a0894bd168fd9b30c66/qf4ccf8f5435d4a78bdca4d6a018b578e/abaaabbba.baaaa I
      // 079: iload 3
      // 07a: ifne 0af
      // 07d: ldc_w -439572916
      // 080: ldc_w 2054718287
      // 083: ldc_w -351921784
      // 086: ixor
      // 087: invokestatic qeaa361f143ee4a0894bd168fd9b30c66/qf4ccf8f5435d4a78bdca4d6a018b578e/abaaabbba.a (II)I
      // 08a: ldc2_w 7477281668697820497
      // 08d: invokestatic qeaa361f143ee4a0894bd168fd9b30c66/qf4ccf8f5435d4a78bdca4d6a018b578e/abaaabbba.aaab (IJ)I
      // 090: if_icmpeq 0bb
      // 093: goto 097
      // 096: athrow
      // 097: aload 1
      // 098: getfield net/minecraft/class_310.field_1724 Lnet/minecraft/class_746;
      // 09b: getfield net/minecraft/class_746.field_6012 I
      // 09e: iload 3
      // 09f: ifne 0b8
      // 0a2: goto 0a6
      // 0a5: athrow
      // 0a6: aload 0
      // 0a7: getfield qeaa361f143ee4a0894bd168fd9b30c66/qf4ccf8f5435d4a78bdca4d6a018b578e/abaaabbba.baaaa I
      // 0aa: isub
      // 0ab: goto 0af
      // 0ae: athrow
      // 0af: bipush 3
      // 0b0: if_icmpgt 0bb
      // 0b3: bipush 1
      // 0b4: goto 0b8
      // 0b7: athrow
      // 0b8: goto 0bc
      // 0bb: bipush 0
      // 0bc: istore 8
      // 0be: aload 1
      // 0bf: getfield net/minecraft/class_310.field_1724 Lnet/minecraft/class_746;
      // 0c2: invokevirtual net/minecraft/class_746.method_5624 ()Z
      // 0c5: ifeq 0cf
      // 0c8: ldc2_w 0.28
      // 0cb: goto 0d0
      // 0ce: athrow
      // 0cf: dconst_0
      // 0d0: dstore 9
      // 0d2: iload 8
      // 0d4: ifeq 0e3
      // 0d7: aload 7
      // 0d9: ldc2_w 1.8
      // 0dc: invokevirtual net/minecraft/class_243.method_1021 (D)Lnet/minecraft/class_243;
      // 0df: goto 0f9
      // 0e2: athrow
      // 0e3: aload 7
      // 0e5: ldc2_w 1.2
      // 0e8: invokevirtual net/minecraft/class_243.method_1021 (D)Lnet/minecraft/class_243;
      // 0eb: aload 6
      // 0ed: ldc2_w 0.65
      // 0f0: dload 9
      // 0f2: dadd
      // 0f3: invokevirtual net/minecraft/class_243.method_1021 (D)Lnet/minecraft/class_243;
      // 0f6: invokevirtual net/minecraft/class_243.method_1019 (Lnet/minecraft/class_243;)Lnet/minecraft/class_243;
      // 0f9: astore 11
      // 0fb: aload 11
      // 0fd: invokevirtual net/minecraft/class_243.method_1033 ()D
      // 100: dstore 12
      // 102: dload 12
      // 104: ldc2_w 2.2
      // 107: dcmpl
      // 108: ifle 118
      // 10b: aload 11
      // 10d: ldc2_w 2.2
      // 110: dload 12
      // 112: ddiv
      // 113: invokevirtual net/minecraft/class_243.method_1021 (D)Lnet/minecraft/class_243;
      // 116: astore 11
      // 118: aload 4
      // 11a: aload 11
      // 11c: getfield net/minecraft/class_243.field_1352 D
      // 11f: ldc2_w 0.5
      // 122: dmul
      // 123: dconst_0
      // 124: aload 11
      // 126: getfield net/minecraft/class_243.field_1350 D
      // 129: ldc2_w 0.5
      // 12c: dmul
      // 12d: invokevirtual net/minecraft/class_238.method_989 (DDD)Lnet/minecraft/class_238;
      // 130: astore 14
      // 132: aload 4
      // 134: aload 11
      // 136: getfield net/minecraft/class_243.field_1352 D
      // 139: dconst_0
      // 13a: aload 11
      // 13c: getfield net/minecraft/class_243.field_1350 D
      // 13f: invokevirtual net/minecraft/class_238.method_989 (DDD)Lnet/minecraft/class_238;
      // 142: astore 15
      // 144: new net/minecraft/class_243
      // 147: dup
      // 148: aload 2
      // 149: invokevirtual net/minecraft/class_1309.method_23317 ()D
      // 14c: iload 5
      // 14e: i2d
      // 14f: ldc2_w 0.5
      // 152: dadd
      // 153: aload 2
      // 154: invokevirtual net/minecraft/class_1309.method_23321 ()D
      // 157: invokespecial net/minecraft/class_243.<init> (DDD)V
      // 15a: aload 11
      // 15c: invokevirtual net/minecraft/class_243.method_1019 (Lnet/minecraft/class_243;)Lnet/minecraft/class_243;
      // 15f: astore 16
      // 161: aload 4
      // 163: getfield net/minecraft/class_238.field_1323 D
      // 166: aload 14
      // 168: getfield net/minecraft/class_238.field_1323 D
      // 16b: invokestatic java/lang/Math.min (DD)D
      // 16e: aload 15
      // 170: getfield net/minecraft/class_238.field_1323 D
      // 173: invokestatic java/lang/Math.min (DD)D
      // 176: invokestatic java/lang/Math.floor (D)D
      // 179: d2i
      // 17a: bipush 1
      // 17b: isub
      // 17c: istore 17
      // 17e: aload 4
      // 180: getfield net/minecraft/class_238.field_1320 D
      // 183: aload 14
      // 185: getfield net/minecraft/class_238.field_1320 D
      // 188: invokestatic java/lang/Math.max (DD)D
      // 18b: aload 15
      // 18d: getfield net/minecraft/class_238.field_1320 D
      // 190: invokestatic java/lang/Math.max (DD)D
      // 193: ldc2_w 1.0E-7
      // 196: dsub
      // 197: invokestatic java/lang/Math.floor (D)D
      // 19a: d2i
      // 19b: bipush 1
      // 19c: iadd
      // 19d: istore 18
      // 19f: aload 4
      // 1a1: getfield net/minecraft/class_238.field_1321 D
      // 1a4: aload 14
      // 1a6: getfield net/minecraft/class_238.field_1321 D
      // 1a9: invokestatic java/lang/Math.min (DD)D
      // 1ac: aload 15
      // 1ae: getfield net/minecraft/class_238.field_1321 D
      // 1b1: invokestatic java/lang/Math.min (DD)D
      // 1b4: invokestatic java/lang/Math.floor (D)D
      // 1b7: d2i
      // 1b8: bipush 1
      // 1b9: isub
      // 1ba: istore 19
      // 1bc: aload 4
      // 1be: getfield net/minecraft/class_238.field_1324 D
      // 1c1: aload 14
      // 1c3: getfield net/minecraft/class_238.field_1324 D
      // 1c6: invokestatic java/lang/Math.max (DD)D
      // 1c9: aload 15
      // 1cb: getfield net/minecraft/class_238.field_1324 D
      // 1ce: invokestatic java/lang/Math.max (DD)D
      // 1d1: ldc2_w 1.0E-7
      // 1d4: dsub
      // 1d5: invokestatic java/lang/Math.floor (D)D
      // 1d8: d2i
      // 1d9: bipush 1
      // 1da: iadd
      // 1db: istore 20
      // 1dd: new java/util/ArrayList
      // 1e0: dup
      // 1e1: invokespecial java/util/ArrayList.<init> ()V
      // 1e4: astore 21
      // 1e6: aload 2
      // 1e7: invokevirtual net/minecraft/class_1309.method_24828 ()Z
      // 1ea: iload 3
      // 1eb: ifne 213
      // 1ee: ifeq 212
      // 1f1: goto 1f5
      // 1f4: athrow
      // 1f5: aload 2
      // 1f6: invokevirtual net/minecraft/class_1309.method_18798 ()Lnet/minecraft/class_243;
      // 1f9: getfield net/minecraft/class_243.field_1351 D
      // 1fc: invokestatic java/lang/Math.abs (D)D
      // 1ff: ldc2_w 0.08
      // 202: dcmpl
      // 203: iload 3
      // 204: ifne 22c
      // 207: goto 20b
      // 20a: athrow
      // 20b: ifle 22b
      // 20e: goto 212
      // 211: athrow
      // 212: bipush 3
      // 213: newarray 10
      // 215: dup
      // 216: bipush 0
      // 217: iload 5
      // 219: iastore
      // 21a: dup
      // 21b: bipush 1
      // 21c: iload 5
      // 21e: bipush 1
      // 21f: isub
      // 220: iastore
      // 221: dup
      // 222: bipush 2
      // 223: iload 5
      // 225: bipush 1
      // 226: iadd
      // 227: iastore
      // 228: goto 233
      // 22b: bipush 1
      // 22c: newarray 10
      // 22e: dup
      // 22f: bipush 0
      // 230: iload 5
      // 232: iastore
      // 233: astore 22
      // 235: aload 22
      // 237: astore 23
      // 239: aload 23
      // 23b: arraylength
      // 23c: istore 24
      // 23e: bipush 0
      // 23f: istore 25
      // 241: iload 25
      // 243: iload 24
      // 245: if_icmpge 2ee
      // 248: aload 23
      // 24a: iload 25
      // 24c: iaload
      // 24d: istore 26
      // 24f: iload 3
      // 250: ifne 30c
      // 253: iload 17
      // 255: istore 27
      // 257: iload 27
      // 259: iload 18
      // 25b: if_icmpgt 2e7
      // 25e: iload 3
      // 25f: ifne 2ea
      // 262: iload 19
      // 264: istore 28
      // 266: iload 28
      // 268: iload 20
      // 26a: if_icmpgt 2e0
      // 26d: new net/minecraft/class_2338
      // 270: dup
      // 271: iload 27
      // 273: iload 26
      // 275: iload 28
      // 277: invokespecial net/minecraft/class_2338.<init> (III)V
      // 27a: astore 29
      // 27c: iload 3
      // 27d: aload 15
      // 27f: aload 29
      // 281: invokestatic qeaa361f143ee4a0894bd168fd9b30c66/qf4ccf8f5435d4a78bdca4d6a018b578e/abaaabbba.aa (Lnet/minecraft/class_238;Lnet/minecraft/class_2338;)D
      // 284: aload 14
      // 286: aload 29
      // 288: invokestatic qeaa361f143ee4a0894bd168fd9b30c66/qf4ccf8f5435d4a78bdca4d6a018b578e/abaaabbba.aa (Lnet/minecraft/class_238;Lnet/minecraft/class_2338;)D
      // 28b: ldc2_w 0.95
      // 28e: dmul
      // 28f: aload 4
      // 291: aload 29
      // 293: invokestatic qeaa361f143ee4a0894bd168fd9b30c66/qf4ccf8f5435d4a78bdca4d6a018b578e/abaaabbba.aa (Lnet/minecraft/class_238;Lnet/minecraft/class_2338;)D
      // 296: ldc2_w 0.85
      // 299: dmul
      // 29a: invokestatic java/lang/Math.max (DD)D
      // 29d: invokestatic java/lang/Math.max (DD)D
      // 2a0: dstore 30
      // 2a2: ifne 2dc
      // 2a5: iload 26
      // 2a7: iload 3
      // 2a8: ifne 259
      // 2ab: goto 2af
      // 2ae: athrow
      // 2af: iload 5
      // 2b1: if_icmpeq 2bc
      // 2b4: dload 30
      // 2b6: ldc2_w 0.8
      // 2b9: dmul
      // 2ba: dstore 30
      // 2bc: aload 21
      // 2be: new qeaa361f143ee4a0894bd168fd9b30c66/qf4ccf8f5435d4a78bdca4d6a018b578e/aabbbabbb
      // 2c1: dup
      // 2c2: aload 29
      // 2c4: dload 30
      // 2c6: aload 29
      // 2c8: invokestatic net/minecraft/class_243.method_24953 (Lnet/minecraft/class_2382;)Lnet/minecraft/class_243;
      // 2cb: aload 16
      // 2cd: invokevirtual net/minecraft/class_243.method_1025 (Lnet/minecraft/class_243;)D
      // 2d0: invokespecial qeaa361f143ee4a0894bd168fd9b30c66/qf4ccf8f5435d4a78bdca4d6a018b578e/aabbbabbb.<init> (Lnet/minecraft/class_2338;DD)V
      // 2d3: invokeinterface java/util/List.add (Ljava/lang/Object;)Z 2
      // 2d8: pop
      // 2d9: iinc 28 1
      // 2dc: iload 3
      // 2dd: ifeq 266
      // 2e0: iinc 27 1
      // 2e3: iload 3
      // 2e4: ifeq 257
      // 2e7: iinc 25 1
      // 2ea: iload 3
      // 2eb: ifeq 241
      // 2ee: aload 21
      // 2f0: invokedynamic applyAsDouble ()Ljava/util/function/ToDoubleFunction; bsm=java/lang/invoke/LambdaMetafactory.metafactory (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;Ljava/lang/invoke/MethodType;Ljava/lang/invoke/MethodHandle;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[ (Ljava/lang/Object;)D, qeaa361f143ee4a0894bd168fd9b30c66/qf4ccf8f5435d4a78bdca4d6a018b578e/aabbbabbb.ab ()D, (Lqeaa361f143ee4a0894bd168fd9b30c66/qf4ccf8f5435d4a78bdca4d6a018b578e/aabbbabbb;)D ]
      // 2f5: invokestatic java/util/Comparator.comparingDouble (Ljava/util/function/ToDoubleFunction;)Ljava/util/Comparator;
      // 2f8: invokeinterface java/util/Comparator.reversed ()Ljava/util/Comparator; 1
      // 2fd: invokedynamic applyAsDouble ()Ljava/util/function/ToDoubleFunction; bsm=java/lang/invoke/LambdaMetafactory.metafactory (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;Ljava/lang/invoke/MethodType;Ljava/lang/invoke/MethodHandle;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[ (Ljava/lang/Object;)D, qeaa361f143ee4a0894bd168fd9b30c66/qf4ccf8f5435d4a78bdca4d6a018b578e/aabbbabbb.aa ()D, (Lqeaa361f143ee4a0894bd168fd9b30c66/qf4ccf8f5435d4a78bdca4d6a018b578e/aabbbabbb;)D ]
      // 302: invokeinterface java/util/Comparator.thenComparingDouble (Ljava/util/function/ToDoubleFunction;)Ljava/util/Comparator; 2
      // 307: invokeinterface java/util/List.sort (Ljava/util/Comparator;)V 2
      // 30c: aload 21
      // 30e: invokeinterface java/util/List.stream ()Ljava/util/stream/Stream; 1
      // 313: invokedynamic apply ()Ljava/util/function/Function; bsm=java/lang/invoke/LambdaMetafactory.metafactory (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;Ljava/lang/invoke/MethodType;Ljava/lang/invoke/MethodHandle;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[ (Ljava/lang/Object;)Ljava/lang/Object;, qeaa361f143ee4a0894bd168fd9b30c66/qf4ccf8f5435d4a78bdca4d6a018b578e/aabbbabbb.b ()Lnet/minecraft/class_2338;, (Lqeaa361f143ee4a0894bd168fd9b30c66/qf4ccf8f5435d4a78bdca4d6a018b578e/aabbbabbb;)Lnet/minecraft/class_2338; ]
      // 318: invokeinterface java/util/stream/Stream.map (Ljava/util/function/Function;)Ljava/util/stream/Stream; 2
      // 31d: invokeinterface java/util/stream/Stream.toList ()Ljava/util/List; 1
      // 322: areturn
   }

   private boolean abbb(class_310 param1, class_1309 param2) {
      // $VF: Couldn't be decompiled
      // Please report this to the Vineflower issue tracker, at https://github.com/Vineflower/vineflower/issues with a copy of the class file (if you have the rights to distribute it!)
      // java.lang.RuntimeException: parsing failure!
      //   at org.jetbrains.java.decompiler.modules.decompiler.decompose.DomHelper.parseGraph(DomHelper.java:211)
      //   at org.jetbrains.java.decompiler.main.rels.MethodProcessor.codeToJava(MethodProcessor.java:166)
      //
      // Bytecode:
      // 000: getstatic qeaa361f143ee4a0894bd168fd9b30c66/qf4ccf8f5435d4a78bdca4d6a018b578e/baaabbaa.bba I
      // 003: istore 3
      // 004: aload 1
      // 005: iload 3
      // 006: ifne 011
      // 009: ifnull 023
      // 00c: goto 010
      // 00f: athrow
      // 010: aload 1
      // 011: getfield net/minecraft/class_310.field_1724 Lnet/minecraft/class_746;
      // 014: iload 3
      // 015: ifne 020
      // 018: ifnull 023
      // 01b: goto 01f
      // 01e: athrow
      // 01f: aload 2
      // 020: ifnonnull 026
      // 023: bipush 0
      // 024: ireturn
      // 025: athrow
      // 026: aload 1
      // 027: getfield net/minecraft/class_310.field_1724 Lnet/minecraft/class_746;
      // 02a: invokevirtual net/minecraft/class_746.method_33571 ()Lnet/minecraft/class_243;
      // 02d: astore 4
      // 02f: aload 2
      // 030: invokevirtual net/minecraft/class_1309.method_5829 ()Lnet/minecraft/class_238;
      // 033: astore 5
      // 035: aload 5
      // 037: getfield net/minecraft/class_238.field_1323 D
      // 03a: aload 4
      // 03c: getfield net/minecraft/class_243.field_1352 D
      // 03f: aload 5
      // 041: getfield net/minecraft/class_238.field_1320 D
      // 044: invokestatic java/lang/Math.min (DD)D
      // 047: invokestatic java/lang/Math.max (DD)D
      // 04a: dstore 6
      // 04c: aload 5
      // 04e: getfield net/minecraft/class_238.field_1322 D
      // 051: aload 4
      // 053: getfield net/minecraft/class_243.field_1351 D
      // 056: aload 5
      // 058: getfield net/minecraft/class_238.field_1325 D
      // 05b: invokestatic java/lang/Math.min (DD)D
      // 05e: invokestatic java/lang/Math.max (DD)D
      // 061: dstore 8
      // 063: aload 5
      // 065: getfield net/minecraft/class_238.field_1321 D
      // 068: aload 4
      // 06a: getfield net/minecraft/class_243.field_1350 D
      // 06d: aload 5
      // 06f: getfield net/minecraft/class_238.field_1324 D
      // 072: invokestatic java/lang/Math.min (DD)D
      // 075: invokestatic java/lang/Math.max (DD)D
      // 078: dstore 10
      // 07a: aload 4
      // 07c: dload 6
      // 07e: dload 8
      // 080: dload 10
      // 082: invokevirtual net/minecraft/class_243.method_1028 (DDD)D
      // 085: ldc2_w 9.0
      // 088: dcmpl
      // 089: iload 3
      // 08a: ifne 095
      // 08d: ifle 096
      // 090: goto 094
      // 093: athrow
      // 094: bipush 0
      // 095: ireturn
      // 096: aload 1
      // 097: getfield net/minecraft/class_310.field_1765 Lnet/minecraft/class_239;
      // 09a: astore 13
      // 09c: aload 13
      // 09e: iload 3
      // 09f: ifne 0b2
      // 0a2: instanceof net/minecraft/class_3966
      // 0a5: ifeq 0e7
      // 0a8: goto 0ac
      // 0ab: athrow
      // 0ac: aload 13
      // 0ae: goto 0b2
      // 0b1: athrow
      // 0b2: checkcast net/minecraft/class_3966
      // 0b5: astore 12
      // 0b7: iload 3
      // 0b8: ifne 0f0
      // 0bb: aload 12
      // 0bd: invokevirtual net/minecraft/class_3966.method_17782 ()Lnet/minecraft/class_1297;
      // 0c0: aload 2
      // 0c1: if_acmpne 0e7
      // 0c4: goto 0c8
      // 0c7: athrow
      // 0c8: aload 4
      // 0ca: aload 12
      // 0cc: invokevirtual net/minecraft/class_3966.method_17784 ()Lnet/minecraft/class_243;
      // 0cf: invokevirtual net/minecraft/class_243.method_1025 (Lnet/minecraft/class_243;)D
      // 0d2: ldc2_w 9.0
      // 0d5: dcmpg
      // 0d6: iload 3
      // 0d7: ifne 0e6
      // 0da: goto 0de
      // 0dd: athrow
      // 0de: ifgt 0e7
      // 0e1: goto 0e5
      // 0e4: athrow
      // 0e5: bipush 1
      // 0e6: ireturn
      // 0e7: aload 1
      // 0e8: ldc2_w 3.0
      // 0eb: invokestatic qeaa361f143ee4a0894bd168fd9b30c66/qf4ccf8f5435d4a78bdca4d6a018b578e/aabbabbbb.bbbaba (Lnet/minecraft/class_310;D)Lnet/minecraft/class_3966;
      // 0ee: astore 12
      // 0f0: aload 12
      // 0f2: iload 3
      // 0f3: ifne 0ff
      // 0f6: ifnull 126
      // 0f9: goto 0fd
      // 0fc: athrow
      // 0fd: aload 12
      // 0ff: invokevirtual net/minecraft/class_3966.method_17782 ()Lnet/minecraft/class_1297;
      // 102: aload 2
      // 103: if_acmpne 126
      // 106: aload 4
      // 108: aload 12
      // 10a: invokevirtual net/minecraft/class_3966.method_17784 ()Lnet/minecraft/class_243;
      // 10d: invokevirtual net/minecraft/class_243.method_1025 (Lnet/minecraft/class_243;)D
      // 110: ldc2_w 9.0
      // 113: dcmpg
      // 114: iload 3
      // 115: ifne 12e
      // 118: goto 11c
      // 11b: athrow
      // 11c: ifgt 126
      // 11f: goto 123
      // 122: athrow
      // 123: bipush 1
      // 124: ireturn
      // 125: athrow
      // 126: aload 1
      // 127: aload 2
      // 128: ldc2_w 3.0
      // 12b: invokestatic qeaa361f143ee4a0894bd168fd9b30c66/qf4ccf8f5435d4a78bdca4d6a018b578e/bbabbbb.baabbb (Lnet/minecraft/class_310;Lnet/minecraft/class_1297;D)Z
      // 12e: ireturn
   }

   private boolean baaa(class_310 param1, long param2) {
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
      // 06: getfield qeaa361f143ee4a0894bd168fd9b30c66/qf4ccf8f5435d4a78bdca4d6a018b578e/abaaabbba.aaaba Lqeaa361f143ee4a0894bd168fd9b30c66/qf4ccf8f5435d4a78bdca4d6a018b578e/abbaaaaa;
      // 09: invokevirtual qeaa361f143ee4a0894bd168fd9b30c66/qf4ccf8f5435d4a78bdca4d6a018b578e/abbaaaaa.abbb ()Ljava/lang/Object;
      // 0c: checkcast java/lang/Boolean
      // 0f: invokevirtual java/lang/Boolean.booleanValue ()Z
      // 12: iload 4
      // 14: ifne 3c
      // 17: ifeq 37
      // 1a: goto 1e
      // 1d: athrow
      // 1e: aload 0
      // 1f: iload 4
      // 21: ifne 3e
      // 24: goto 28
      // 27: athrow
      // 28: aload 1
      // 29: aload 0
      // 2a: getfield qeaa361f143ee4a0894bd168fd9b30c66/qf4ccf8f5435d4a78bdca4d6a018b578e/abaaabbba.aab Lnet/minecraft/class_1309;
      // 2d: invokevirtual qeaa361f143ee4a0894bd168fd9b30c66/qf4ccf8f5435d4a78bdca4d6a018b578e/abaaabbba.abab (Lnet/minecraft/class_310;Lnet/minecraft/class_1309;)Z
      // 30: ifne 3d
      // 33: goto 37
      // 36: athrow
      // 37: bipush 0
      // 38: goto 3c
      // 3b: athrow
      // 3c: ireturn
      // 3d: aload 0
      // 3e: iload 4
      // 40: ifne 65
      // 43: invokevirtual qeaa361f143ee4a0894bd168fd9b30c66/qf4ccf8f5435d4a78bdca4d6a018b578e/abaaabbba.aaabbb ()Z
      // 46: ifne 50
      // 49: goto 4d
      // 4c: athrow
      // 4d: bipush 0
      // 4e: ireturn
      // 4f: athrow
      // 50: aload 0
      // 51: aload 0
      // 52: getfield qeaa361f143ee4a0894bd168fd9b30c66/qf4ccf8f5435d4a78bdca4d6a018b578e/abaaabbba.aabaa I
      // 55: putfield qeaa361f143ee4a0894bd168fd9b30c66/qf4ccf8f5435d4a78bdca4d6a018b578e/abaaabbba.abbba I
      // 58: aload 0
      // 59: getstatic qeaa361f143ee4a0894bd168fd9b30c66/qf4ccf8f5435d4a78bdca4d6a018b578e/aaabaaaba.aa Lqeaa361f143ee4a0894bd168fd9b30c66/qf4ccf8f5435d4a78bdca4d6a018b578e/aaabaaaba;
      // 5c: putfield qeaa361f143ee4a0894bd168fd9b30c66/qf4ccf8f5435d4a78bdca4d6a018b578e/abaaabbba.bbbab Lqeaa361f143ee4a0894bd168fd9b30c66/qf4ccf8f5435d4a78bdca4d6a018b578e/aaabaaaba;
      // 5f: aload 0
      // 60: lload 2
      // 61: putfield qeaa361f143ee4a0894bd168fd9b30c66/qf4ccf8f5435d4a78bdca4d6a018b578e/abaaabbba.babbb J
      // 64: aload 0
      // 65: lload 2
      // 66: aload 0
      // 67: aload 0
      // 68: getfield qeaa361f143ee4a0894bd168fd9b30c66/qf4ccf8f5435d4a78bdca4d6a018b578e/abaaabbba.abba Lqeaa361f143ee4a0894bd168fd9b30c66/qf4ccf8f5435d4a78bdca4d6a018b578e/aaabbbab;
      // 6b: invokevirtual qeaa361f143ee4a0894bd168fd9b30c66/qf4ccf8f5435d4a78bdca4d6a018b578e/abaaabbba.bbaab (Lqeaa361f143ee4a0894bd168fd9b30c66/qf4ccf8f5435d4a78bdca4d6a018b578e/aaabbbab;)J
      // 6e: ladd
      // 6f: putfield qeaa361f143ee4a0894bd168fd9b30c66/qf4ccf8f5435d4a78bdca4d6a018b578e/abaaabbba.abb J
      // 72: bipush 1
      // 73: ireturn
   }

   private void baab() {
      this.bbba = null;
      this.bba = null;
      this.abbaa = aaab(a(-439572917, -903130121 ^ -1853614635), 7477281668697820497L);
      this.bbb = false;
      this.abbb = false;
   }

   private boolean baba(class_310 param1, class_3966 param2, class_1309 param3) {
      // $VF: Couldn't be decompiled
      // Please report this to the Vineflower issue tracker, at https://github.com/Vineflower/vineflower/issues with a copy of the class file (if you have the rights to distribute it!)
      // java.lang.RuntimeException: parsing failure!
      //   at org.jetbrains.java.decompiler.modules.decompiler.decompose.DomHelper.parseGraph(DomHelper.java:211)
      //   at org.jetbrains.java.decompiler.main.rels.MethodProcessor.codeToJava(MethodProcessor.java:166)
      //
      // Bytecode:
      // 00: getstatic qeaa361f143ee4a0894bd168fd9b30c66/qf4ccf8f5435d4a78bdca4d6a018b578e/baaabbaa.bba I
      // 03: istore 4
      // 05: aload 1
      // 06: iload 4
      // 08: ifne 13
      // 0b: ifnull 58
      // 0e: goto 12
      // 11: athrow
      // 12: aload 1
      // 13: getfield net/minecraft/class_310.field_1724 Lnet/minecraft/class_746;
      // 16: ifnull 58
      // 19: aload 2
      // 1a: iload 4
      // 1c: ifne 2b
      // 1f: goto 23
      // 22: athrow
      // 23: ifnull 58
      // 26: goto 2a
      // 29: athrow
      // 2a: aload 2
      // 2b: invokevirtual net/minecraft/class_3966.method_17782 ()Lnet/minecraft/class_1297;
      // 2e: aload 3
      // 2f: if_acmpne 58
      // 32: aload 1
      // 33: getfield net/minecraft/class_310.field_1724 Lnet/minecraft/class_746;
      // 36: invokevirtual net/minecraft/class_746.method_33571 ()Lnet/minecraft/class_243;
      // 39: aload 2
      // 3a: invokevirtual net/minecraft/class_3966.method_17784 ()Lnet/minecraft/class_243;
      // 3d: invokevirtual net/minecraft/class_243.method_1025 (Lnet/minecraft/class_243;)D
      // 40: ldc2_w 9.0
      // 43: dcmpg
      // 44: iload 4
      // 46: ifne 55
      // 49: goto 4d
      // 4c: athrow
      // 4d: ifgt 58
      // 50: goto 54
      // 53: athrow
      // 54: bipush 1
      // 55: goto 59
      // 58: bipush 0
      // 59: ireturn
   }

   @Override
   public void abbaabb(class_2596 param1) {
      // $VF: Couldn't be decompiled
      // Please report this to the Vineflower issue tracker, at https://github.com/Vineflower/vineflower/issues with a copy of the class file (if you have the rights to distribute it!)
      // java.lang.RuntimeException: parsing failure!
      //   at org.jetbrains.java.decompiler.modules.decompiler.decompose.DomHelper.parseGraph(DomHelper.java:211)
      //   at org.jetbrains.java.decompiler.main.rels.MethodProcessor.codeToJava(MethodProcessor.java:166)
      //
      // Bytecode:
      // 00: getstatic qeaa361f143ee4a0894bd168fd9b30c66/qf4ccf8f5435d4a78bdca4d6a018b578e/baaabbaa.bba I
      // 03: invokestatic net/minecraft/class_310.method_1551 ()Lnet/minecraft/class_310;
      // 06: astore 3
      // 07: istore 2
      // 08: aload 1
      // 09: iload 2
      // 0a: ifne 35
      // 0d: instanceof net/minecraft/class_2626
      // 10: ifeq 30
      // 13: goto 17
      // 16: athrow
      // 17: aload 1
      // 18: checkcast net/minecraft/class_2626
      // 1b: astore 4
      // 1d: iload 2
      // 1e: aload 0
      // 1f: aload 3
      // 20: aload 4
      // 22: invokevirtual net/minecraft/class_2626.method_11309 ()Lnet/minecraft/class_2338;
      // 25: aload 4
      // 27: invokevirtual net/minecraft/class_2626.method_11308 ()Lnet/minecraft/class_2680;
      // 2a: invokevirtual qeaa361f143ee4a0894bd168fd9b30c66/qf4ccf8f5435d4a78bdca4d6a018b578e/abaaabbba.bb (Lnet/minecraft/class_310;Lnet/minecraft/class_2338;Lnet/minecraft/class_2680;)V
      // 2d: ifeq 59
      // 30: aload 1
      // 31: goto 35
      // 34: athrow
      // 35: iload 2
      // 36: ifne 48
      // 39: instanceof net/minecraft/class_2637
      // 3c: ifeq 59
      // 3f: goto 43
      // 42: athrow
      // 43: aload 1
      // 44: goto 48
      // 47: athrow
      // 48: checkcast net/minecraft/class_2637
      // 4b: astore 5
      // 4d: aload 5
      // 4f: aload 0
      // 50: aload 3
      // 51: invokedynamic accept (Lqeaa361f143ee4a0894bd168fd9b30c66/qf4ccf8f5435d4a78bdca4d6a018b578e/abaaabbba;Lnet/minecraft/class_310;)Ljava/util/function/BiConsumer; bsm=java/lang/invoke/LambdaMetafactory.metafactory (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;Ljava/lang/invoke/MethodType;Ljava/lang/invoke/MethodHandle;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[ (Ljava/lang/Object;Ljava/lang/Object;)V, qeaa361f143ee4a0894bd168fd9b30c66/qf4ccf8f5435d4a78bdca4d6a018b578e/abaaabbba.bbba (Lnet/minecraft/class_310;Lnet/minecraft/class_2338;Lnet/minecraft/class_2680;)V, (Lnet/minecraft/class_2338;Lnet/minecraft/class_2680;)V ]
      // 56: invokevirtual net/minecraft/class_2637.method_30621 (Ljava/util/function/BiConsumer;)V
      // 59: aload 3
      // 5a: iload 2
      // 5b: ifne 66
      // 5e: ifnull ac
      // 61: goto 65
      // 64: athrow
      // 65: aload 3
      // 66: getfield net/minecraft/class_310.field_1724 Lnet/minecraft/class_746;
      // 69: ifnull ac
      // 6c: aload 0
      // 6d: getfield qeaa361f143ee4a0894bd168fd9b30c66/qf4ccf8f5435d4a78bdca4d6a018b578e/abaaabbba.aaabb I
      // 70: iload 2
      // 71: ifne 8f
      // 74: goto 78
      // 77: athrow
      // 78: iflt ac
      // 7b: goto 7f
      // 7e: athrow
      // 7f: aload 1
      // 80: iload 2
      // 81: ifne 93
      // 84: goto 88
      // 87: athrow
      // 88: instanceof net/minecraft/class_2743
      // 8b: goto 8f
      // 8e: athrow
      // 8f: ifeq ac
      // 92: aload 1
      // 93: checkcast net/minecraft/class_2743
      // 96: astore 4
      // 98: aload 4
      // 9a: iload 2
      // 9b: ifne b0
      // 9e: invokevirtual net/minecraft/class_2743.method_11818 ()I
      // a1: aload 0
      // a2: getfield qeaa361f143ee4a0894bd168fd9b30c66/qf4ccf8f5435d4a78bdca4d6a018b578e/abaaabbba.aaabb I
      // a5: if_icmpeq ae
      // a8: goto ac
      // ab: athrow
      // ac: return
      // ad: athrow
      // ae: aload 4
      // b0: invokevirtual net/minecraft/class_2743.method_73085 ()Lnet/minecraft/class_243;
      // b3: astore 5
      // b5: iload 2
      // b6: ifne cc
      // b9: aload 5
      // bb: ifnull d7
      // be: goto c2
      // c1: athrow
      // c2: aload 0
      // c3: aload 5
      // c5: putfield qeaa361f143ee4a0894bd168fd9b30c66/qf4ccf8f5435d4a78bdca4d6a018b578e/abaaabbba.aaa Lnet/minecraft/class_243;
      // c8: goto cc
      // cb: athrow
      // cc: aload 0
      // cd: aload 3
      // ce: getfield net/minecraft/class_310.field_1724 Lnet/minecraft/class_746;
      // d1: getfield net/minecraft/class_746.field_6012 I
      // d4: putfield qeaa361f143ee4a0894bd168fd9b30c66/qf4ccf8f5435d4a78bdca4d6a018b578e/abaaabbba.baaaa I
      // d7: return
   }

   public boolean babb(class_1309 param1) {
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
      // 06: ifne 20
      // 09: ifnull 4d
      // 0c: goto 10
      // 0f: athrow
      // 10: aload 0
      // 11: iload 2
      // 12: ifne 29
      // 15: goto 19
      // 18: athrow
      // 19: getfield qeaa361f143ee4a0894bd168fd9b30c66/qf4ccf8f5435d4a78bdca4d6a018b578e/abaaabbba.aab Lnet/minecraft/class_1309;
      // 1c: goto 20
      // 1f: athrow
      // 20: aload 1
      // 21: if_acmpne 4d
      // 24: aload 0
      // 25: goto 29
      // 28: athrow
      // 29: iload 2
      // 2a: ifne 3f
      // 2d: getfield qeaa361f143ee4a0894bd168fd9b30c66/qf4ccf8f5435d4a78bdca4d6a018b578e/abaaabbba.bbbab Lqeaa361f143ee4a0894bd168fd9b30c66/qf4ccf8f5435d4a78bdca4d6a018b578e/aaabaaaba;
      // 30: getstatic qeaa361f143ee4a0894bd168fd9b30c66/qf4ccf8f5435d4a78bdca4d6a018b578e/aaabaaaba.ab Lqeaa361f143ee4a0894bd168fd9b30c66/qf4ccf8f5435d4a78bdca4d6a018b578e/aaabaaaba;
      // 33: if_acmpeq 48
      // 36: goto 3a
      // 39: athrow
      // 3a: aload 0
      // 3b: goto 3f
      // 3e: athrow
      // 3f: getfield qeaa361f143ee4a0894bd168fd9b30c66/qf4ccf8f5435d4a78bdca4d6a018b578e/abaaabbba.bbbab Lqeaa361f143ee4a0894bd168fd9b30c66/qf4ccf8f5435d4a78bdca4d6a018b578e/aaabaaaba;
      // 42: getstatic qeaa361f143ee4a0894bd168fd9b30c66/qf4ccf8f5435d4a78bdca4d6a018b578e/aaabaaaba.aba Lqeaa361f143ee4a0894bd168fd9b30c66/qf4ccf8f5435d4a78bdca4d6a018b578e/aaabaaaba;
      // 45: if_acmpne 4d
      // 48: bipush 1
      // 49: goto 4e
      // 4c: athrow
      // 4d: bipush 0
      // 4e: ireturn
   }

   private boolean bbab(class_310 param1) {
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
      // 06: ifne 1e
      // 09: aload 1
      // 0a: invokevirtual qeaa361f143ee4a0894bd168fd9b30c66/qf4ccf8f5435d4a78bdca4d6a018b578e/abaaabbba.bbbaa (Lnet/minecraft/class_310;)Z
      // 0d: ifne 17
      // 10: goto 14
      // 13: athrow
      // 14: bipush 0
      // 15: ireturn
      // 16: athrow
      // 17: aload 0
      // 18: getfield qeaa361f143ee4a0894bd168fd9b30c66/qf4ccf8f5435d4a78bdca4d6a018b578e/abaaabbba.bbbba Lqeaa361f143ee4a0894bd168fd9b30c66/qf4ccf8f5435d4a78bdca4d6a018b578e/baabaab;
      // 1b: invokevirtual qeaa361f143ee4a0894bd168fd9b30c66/qf4ccf8f5435d4a78bdca4d6a018b578e/baabaab.abbb ()Ljava/lang/Object;
      // 1e: getstatic qeaa361f143ee4a0894bd168fd9b30c66/qf4ccf8f5435d4a78bdca4d6a018b578e/aaabbbaba.b Lqeaa361f143ee4a0894bd168fd9b30c66/qf4ccf8f5435d4a78bdca4d6a018b578e/aaabbbaba;
      // 21: if_acmpne 27
      // 24: bipush 1
      // 25: ireturn
      // 26: athrow
      // 27: aload 1
      // 28: aload 0
      // 29: getfield qeaa361f143ee4a0894bd168fd9b30c66/qf4ccf8f5435d4a78bdca4d6a018b578e/abaaabbba.abaa F
      // 2c: aload 0
      // 2d: getfield qeaa361f143ee4a0894bd168fd9b30c66/qf4ccf8f5435d4a78bdca4d6a018b578e/abaaabbba.aaaaa F
      // 30: invokestatic qeaa361f143ee4a0894bd168fd9b30c66/qf4ccf8f5435d4a78bdca4d6a018b578e/aabbabbbb.bbabbab (Lnet/minecraft/class_310;FF)V
      // 33: bipush 1
      // 34: ireturn
   }

   private void bbba(class_310 var1, class_2338 var2, class_2680 var3) {
      this.bb(var1, var2, var3);
   }

   private void bbbb(class_310 param1) {
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
      // 06: ifne 3d
      // 09: getfield qeaa361f143ee4a0894bd168fd9b30c66/qf4ccf8f5435d4a78bdca4d6a018b578e/abaaabbba.aaaab Lqeaa361f143ee4a0894bd168fd9b30c66/qf4ccf8f5435d4a78bdca4d6a018b578e/abbaaaaa;
      // 0c: invokevirtual qeaa361f143ee4a0894bd168fd9b30c66/qf4ccf8f5435d4a78bdca4d6a018b578e/abbaaaaa.abbb ()Ljava/lang/Object;
      // 0f: checkcast java/lang/Boolean
      // 12: invokevirtual java/lang/Boolean.booleanValue ()Z
      // 15: ifeq 27
      // 18: goto 1c
      // 1b: athrow
      // 1c: aload 0
      // 1d: invokestatic java/lang/System.currentTimeMillis ()J
      // 20: invokevirtual qeaa361f143ee4a0894bd168fd9b30c66/qf4ccf8f5435d4a78bdca4d6a018b578e/abaaabbba.aaaabb (J)V
      // 23: goto 27
      // 26: athrow
      // 27: aload 0
      // 28: aload 1
      // 29: invokevirtual qeaa361f143ee4a0894bd168fd9b30c66/qf4ccf8f5435d4a78bdca4d6a018b578e/abaaabbba.bbbbb (Lnet/minecraft/class_310;)Z
      // 2c: pop
      // 2d: aload 0
      // 2e: bipush 0
      // 2f: putfield qeaa361f143ee4a0894bd168fd9b30c66/qf4ccf8f5435d4a78bdca4d6a018b578e/abaaabbba.bbaab Z
      // 32: aload 0
      // 33: lconst_0
      // 34: putfield qeaa361f143ee4a0894bd168fd9b30c66/qf4ccf8f5435d4a78bdca4d6a018b578e/abaaabbba.abbab J
      // 37: aload 0
      // 38: aconst_null
      // 39: putfield qeaa361f143ee4a0894bd168fd9b30c66/qf4ccf8f5435d4a78bdca4d6a018b578e/abaaabbba.aab Lnet/minecraft/class_1309;
      // 3c: aload 0
      // 3d: getstatic qeaa361f143ee4a0894bd168fd9b30c66/qf4ccf8f5435d4a78bdca4d6a018b578e/aaabaaaba.abb Lqeaa361f143ee4a0894bd168fd9b30c66/qf4ccf8f5435d4a78bdca4d6a018b578e/aaabaaaba;
      // 40: putfield qeaa361f143ee4a0894bd168fd9b30c66/qf4ccf8f5435d4a78bdca4d6a018b578e/abaaabbba.bbbab Lqeaa361f143ee4a0894bd168fd9b30c66/qf4ccf8f5435d4a78bdca4d6a018b578e/aaabaaaba;
      // 43: return
   }

   private void aaaaa(class_310 param1, long param2) {
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
      // 06: aload 1
      // 07: aload 0
      // 08: getfield qeaa361f143ee4a0894bd168fd9b30c66/qf4ccf8f5435d4a78bdca4d6a018b578e/abaaabbba.aab Lnet/minecraft/class_1309;
      // 0b: invokevirtual qeaa361f143ee4a0894bd168fd9b30c66/qf4ccf8f5435d4a78bdca4d6a018b578e/abaaabbba.abab (Lnet/minecraft/class_310;Lnet/minecraft/class_1309;)Z
      // 0e: iload 4
      // 10: ifne 29
      // 13: ifne 21
      // 16: goto 1a
      // 19: athrow
      // 1a: aload 0
      // 1b: lload 2
      // 1c: invokevirtual qeaa361f143ee4a0894bd168fd9b30c66/qf4ccf8f5435d4a78bdca4d6a018b578e/abaaabbba.aaaaaa (J)V
      // 1f: return
      // 20: athrow
      // 21: aload 1
      // 22: aload 0
      // 23: getfield qeaa361f143ee4a0894bd168fd9b30c66/qf4ccf8f5435d4a78bdca4d6a018b578e/abaaabbba.aab Lnet/minecraft/class_1309;
      // 26: invokestatic qeaa361f143ee4a0894bd168fd9b30c66/qf4ccf8f5435d4a78bdca4d6a018b578e/aabbabbbb.bbaabb (Lnet/minecraft/class_310;Lnet/minecraft/class_1297;)Z
      // 29: iload 4
      // 2b: ifne 50
      // 2e: ifeq 36
      // 31: goto 35
      // 34: athrow
      // 35: return
      // 36: lload 2
      // 37: aload 0
      // 38: getfield qeaa361f143ee4a0894bd168fd9b30c66/qf4ccf8f5435d4a78bdca4d6a018b578e/abaaabbba.babbb J
      // 3b: lsub
      // 3c: ldc_w -439572918
      // 3f: ldc_w 1408625275
      // 42: ldc_w -287072403
      // 45: ixor
      // 46: invokestatic qeaa361f143ee4a0894bd168fd9b30c66/qf4ccf8f5435d4a78bdca4d6a018b578e/abaaabbba.a (II)I
      // 49: ldc2_w 6064603523984569836
      // 4c: invokestatic qeaa361f143ee4a0894bd168fd9b30c66/qf4ccf8f5435d4a78bdca4d6a018b578e/abaaabbba.aabba (IJ)J
      // 4f: lcmp
      // 50: iload 4
      // 52: ifne 75
      // 55: ifle 63
      // 58: goto 5c
      // 5b: athrow
      // 5c: aload 0
      // 5d: lload 2
      // 5e: invokevirtual qeaa361f143ee4a0894bd168fd9b30c66/qf4ccf8f5435d4a78bdca4d6a018b578e/abaaabbba.aaaaaa (J)V
      // 61: return
      // 62: athrow
      // 63: aload 0
      // 64: aload 1
      // 65: aload 0
      // 66: iload 4
      // 68: ifne 8b
      // 6b: getfield qeaa361f143ee4a0894bd168fd9b30c66/qf4ccf8f5435d4a78bdca4d6a018b578e/abaaabbba.aabaa I
      // 6e: invokevirtual qeaa361f143ee4a0894bd168fd9b30c66/qf4ccf8f5435d4a78bdca4d6a018b578e/abaaabbba.bbabb (Lnet/minecraft/class_310;I)Z
      // 71: goto 75
      // 74: athrow
      // 75: ifne 7f
      // 78: aload 0
      // 79: lload 2
      // 7a: putfield qeaa361f143ee4a0894bd168fd9b30c66/qf4ccf8f5435d4a78bdca4d6a018b578e/abaaabbba.abb J
      // 7d: return
      // 7e: athrow
      // 7f: aload 0
      // 80: iload 4
      // 82: ifne b6
      // 85: aload 1
      // 86: aload 0
      // 87: goto 8b
      // 8a: athrow
      // 8b: getfield qeaa361f143ee4a0894bd168fd9b30c66/qf4ccf8f5435d4a78bdca4d6a018b578e/abaaabbba.aab Lnet/minecraft/class_1309;
      // 8e: invokevirtual qeaa361f143ee4a0894bd168fd9b30c66/qf4ccf8f5435d4a78bdca4d6a018b578e/abaaabbba.abaabb (Lnet/minecraft/class_310;Lnet/minecraft/class_1309;)Z
      // 91: ifeq b5
      // 94: aload 1
      // 95: getfield net/minecraft/class_310.field_1724 Lnet/minecraft/class_746;
      // 98: ifnull ae
      // 9b: goto 9f
      // 9e: athrow
      // 9f: aload 0
      // a0: aload 1
      // a1: getfield net/minecraft/class_310.field_1724 Lnet/minecraft/class_746;
      // a4: getfield net/minecraft/class_746.field_6012 I
      // a7: putfield qeaa361f143ee4a0894bd168fd9b30c66/qf4ccf8f5435d4a78bdca4d6a018b578e/abaaabbba.aaaa I
      // aa: goto ae
      // ad: athrow
      // ae: aload 0
      // af: aload 1
      // b0: lload 2
      // b1: invokevirtual qeaa361f143ee4a0894bd168fd9b30c66/qf4ccf8f5435d4a78bdca4d6a018b578e/abaaabbba.aaabab (Lnet/minecraft/class_310;J)V
      // b4: return
      // b5: aload 0
      // b6: lload 2
      // b7: putfield qeaa361f143ee4a0894bd168fd9b30c66/qf4ccf8f5435d4a78bdca4d6a018b578e/abaaabbba.abb J
      // ba: return
   }

   static boolean aaaab(class_3965 param0, class_3965 param1) {
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
      // 09: ifnull 72
      // 0c: goto 10
      // 0f: athrow
      // 10: aload 1
      // 11: iload 2
      // 12: ifne 1d
      // 15: ifnull 72
      // 18: goto 1c
      // 1b: athrow
      // 1c: aload 0
      // 1d: invokevirtual net/minecraft/class_3965.method_17783 ()Lnet/minecraft/class_239$class_240;
      // 20: iload 2
      // 21: ifne 3e
      // 24: getstatic net/minecraft/class_239$class_240.field_1332 Lnet/minecraft/class_239$class_240;
      // 27: if_acmpne 72
      // 2a: goto 2e
      // 2d: athrow
      // 2e: aload 1
      // 2f: iload 2
      // 30: ifne 49
      // 33: goto 37
      // 36: athrow
      // 37: invokevirtual net/minecraft/class_3965.method_17783 ()Lnet/minecraft/class_239$class_240;
      // 3a: goto 3e
      // 3d: athrow
      // 3e: getstatic net/minecraft/class_239$class_240.field_1332 Lnet/minecraft/class_239$class_240;
      // 41: if_acmpne 72
      // 44: aload 0
      // 45: goto 49
      // 48: athrow
      // 49: iload 2
      // 4a: ifne 63
      // 4d: invokevirtual net/minecraft/class_3965.method_17777 ()Lnet/minecraft/class_2338;
      // 50: aload 1
      // 51: invokevirtual net/minecraft/class_3965.method_17777 ()Lnet/minecraft/class_2338;
      // 54: invokevirtual net/minecraft/class_2338.equals (Ljava/lang/Object;)Z
      // 57: ifeq 72
      // 5a: goto 5e
      // 5d: athrow
      // 5e: aload 0
      // 5f: goto 63
      // 62: athrow
      // 63: invokevirtual net/minecraft/class_3965.method_17780 ()Lnet/minecraft/class_2350;
      // 66: aload 1
      // 67: invokevirtual net/minecraft/class_3965.method_17780 ()Lnet/minecraft/class_2350;
      // 6a: if_acmpne 72
      // 6d: bipush 1
      // 6e: goto 73
      // 71: athrow
      // 72: bipush 0
      // 73: ireturn
   }

   public boolean aaaba(class_1309 param1) {
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
      // 06: ifne 20
      // 09: ifnull 37
      // 0c: goto 10
      // 0f: athrow
      // 10: aload 0
      // 11: iload 2
      // 12: ifne 29
      // 15: goto 19
      // 18: athrow
      // 19: getfield qeaa361f143ee4a0894bd168fd9b30c66/qf4ccf8f5435d4a78bdca4d6a018b578e/abaaabbba.aab Lnet/minecraft/class_1309;
      // 1c: goto 20
      // 1f: athrow
      // 20: aload 1
      // 21: if_acmpne 37
      // 24: aload 0
      // 25: goto 29
      // 28: athrow
      // 29: getfield qeaa361f143ee4a0894bd168fd9b30c66/qf4ccf8f5435d4a78bdca4d6a018b578e/abaaabbba.bbbab Lqeaa361f143ee4a0894bd168fd9b30c66/qf4ccf8f5435d4a78bdca4d6a018b578e/aaabaaaba;
      // 2c: getstatic qeaa361f143ee4a0894bd168fd9b30c66/qf4ccf8f5435d4a78bdca4d6a018b578e/aaabaaaba.abb Lqeaa361f143ee4a0894bd168fd9b30c66/qf4ccf8f5435d4a78bdca4d6a018b578e/aaabaaaba;
      // 2f: if_acmpeq 37
      // 32: bipush 1
      // 33: goto 38
      // 36: athrow
      // 37: bipush 0
      // 38: ireturn
   }

   private boolean aaabb() {
      // $VF: Couldn't be decompiled
      // Please report this to the Vineflower issue tracker, at https://github.com/Vineflower/vineflower/issues with a copy of the class file (if you have the rights to distribute it!)
      // java.lang.RuntimeException: parsing failure!
      //   at org.jetbrains.java.decompiler.modules.decompiler.decompose.DomHelper.parseGraph(DomHelper.java:211)
      //   at org.jetbrains.java.decompiler.main.rels.MethodProcessor.codeToJava(MethodProcessor.java:166)
      //
      // Bytecode:
      // 00: getstatic qeaa361f143ee4a0894bd168fd9b30c66/qf4ccf8f5435d4a78bdca4d6a018b578e/baaabbaa.bba I
      // 03: aload 0
      // 04: getfield qeaa361f143ee4a0894bd168fd9b30c66/qf4ccf8f5435d4a78bdca4d6a018b578e/abaaabbba.aaab Lqeaa361f143ee4a0894bd168fd9b30c66/qf4ccf8f5435d4a78bdca4d6a018b578e/bababa;
      // 07: invokevirtual qeaa361f143ee4a0894bd168fd9b30c66/qf4ccf8f5435d4a78bdca4d6a018b578e/bababa.abbb ()Ljava/lang/Object;
      // 0a: checkcast java/lang/Double
      // 0d: invokevirtual java/lang/Double.doubleValue ()D
      // 10: dstore 2
      // 11: istore 1
      // 12: dload 2
      // 13: ldc2_w 100.0
      // 16: iload 1
      // 17: ifne 27
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

   private boolean aabab(class_310 param1, int param2, class_3965 param3, class_3965 param4) {
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
      // 006: invokevirtual qeaa361f143ee4a0894bd168fd9b30c66/qf4ccf8f5435d4a78bdca4d6a018b578e/abaaabbba.babbaab ()Z
      // 009: iload 5
      // 00b: ifne 046
      // 00e: ifeq 041
      // 011: goto 015
      // 014: athrow
      // 015: aload 0
      // 016: iload 5
      // 018: ifne 031
      // 01b: goto 01f
      // 01e: athrow
      // 01f: getfield qeaa361f143ee4a0894bd168fd9b30c66/qf4ccf8f5435d4a78bdca4d6a018b578e/abaaabbba.bbbab Lqeaa361f143ee4a0894bd168fd9b30c66/qf4ccf8f5435d4a78bdca4d6a018b578e/aaabaaaba;
      // 022: getstatic qeaa361f143ee4a0894bd168fd9b30c66/qf4ccf8f5435d4a78bdca4d6a018b578e/aaabaaaba.bb Lqeaa361f143ee4a0894bd168fd9b30c66/qf4ccf8f5435d4a78bdca4d6a018b578e/aaabaaaba;
      // 025: if_acmpne 041
      // 028: goto 02c
      // 02b: athrow
      // 02c: aload 0
      // 02d: goto 031
      // 030: athrow
      // 031: iload 5
      // 033: ifne 048
      // 036: getfield qeaa361f143ee4a0894bd168fd9b30c66/qf4ccf8f5435d4a78bdca4d6a018b578e/abaaabbba.bab Lnet/minecraft/class_3965;
      // 039: aload 3
      // 03a: if_acmpeq 047
      // 03d: goto 041
      // 040: athrow
      // 041: bipush 0
      // 042: goto 046
      // 045: athrow
      // 046: ireturn
      // 047: aload 0
      // 048: iload 5
      // 04a: ifne 0b4
      // 04d: bipush 0
      // 04e: putfield qeaa361f143ee4a0894bd168fd9b30c66/qf4ccf8f5435d4a78bdca4d6a018b578e/abaaabbba.baabb Z
      // 051: aload 1
      // 052: ifnull 0af
      // 055: goto 059
      // 058: athrow
      // 059: aload 1
      // 05a: iload 5
      // 05c: ifne 072
      // 05f: goto 063
      // 062: athrow
      // 063: getfield net/minecraft/class_310.field_1724 Lnet/minecraft/class_746;
      // 066: ifnull 0af
      // 069: goto 06d
      // 06c: athrow
      // 06d: aload 1
      // 06e: goto 072
      // 071: athrow
      // 072: invokestatic qeaa361f143ee4a0894bd168fd9b30c66/qf4ccf8f5435d4a78bdca4d6a018b578e/aabbabbbb.abaaaab (Lnet/minecraft/class_310;)Z
      // 075: iload 5
      // 077: ifne 0cf
      // 07a: ifne 0af
      // 07d: goto 081
      // 080: athrow
      // 081: invokestatic qeaa361f143ee4a0894bd168fd9b30c66/qf4ccf8f5435d4a78bdca4d6a018b578e/aabbabbbb.abbbabb ()Z
      // 084: iload 5
      // 086: ifne 0cf
      // 089: goto 08d
      // 08c: athrow
      // 08d: ifne 0af
      // 090: goto 094
      // 093: athrow
      // 094: aload 1
      // 095: iload 5
      // 097: ifne 0d1
      // 09a: goto 09e
      // 09d: athrow
      // 09e: getfield net/minecraft/class_310.field_1724 Lnet/minecraft/class_746;
      // 0a1: getfield net/minecraft/class_746.field_6012 I
      // 0a4: aload 0
      // 0a5: getfield qeaa361f143ee4a0894bd168fd9b30c66/qf4ccf8f5435d4a78bdca4d6a018b578e/abaaabbba.aaaa I
      // 0a8: if_icmpgt 0d0
      // 0ab: goto 0af
      // 0ae: athrow
      // 0af: aload 0
      // 0b0: goto 0b4
      // 0b3: athrow
      // 0b4: invokestatic java/lang/System.currentTimeMillis ()J
      // 0b7: ldc_w -439572919
      // 0ba: ldc_w 301261289
      // 0bd: ldc_w -2018309790
      // 0c0: ixor
      // 0c1: invokestatic qeaa361f143ee4a0894bd168fd9b30c66/qf4ccf8f5435d4a78bdca4d6a018b578e/abaaabbba.a (II)I
      // 0c4: ldc2_w 2666728931564808548
      // 0c7: invokestatic qeaa361f143ee4a0894bd168fd9b30c66/qf4ccf8f5435d4a78bdca4d6a018b578e/abaaabbba.aabba (IJ)J
      // 0ca: ladd
      // 0cb: putfield qeaa361f143ee4a0894bd168fd9b30c66/qf4ccf8f5435d4a78bdca4d6a018b578e/abaaabbba.abb J
      // 0ce: bipush 0
      // 0cf: ireturn
      // 0d0: aload 1
      // 0d1: iload 2
      // 0d2: invokestatic qeaa361f143ee4a0894bd168fd9b30c66/qf4ccf8f5435d4a78bdca4d6a018b578e/aabbabbbb.abaaa (Lnet/minecraft/class_310;I)Z
      // 0d5: iload 5
      // 0d7: ifne 10f
      // 0da: ifne 0ff
      // 0dd: goto 0e1
      // 0e0: athrow
      // 0e1: aload 0
      // 0e2: invokestatic java/lang/System.currentTimeMillis ()J
      // 0e5: ldc_w -439572920
      // 0e8: ldc_w 301261289
      // 0eb: ldc_w 1405767581
      // 0ee: ixor
      // 0ef: invokestatic qeaa361f143ee4a0894bd168fd9b30c66/qf4ccf8f5435d4a78bdca4d6a018b578e/abaaabbba.a (II)I
      // 0f2: ldc2_w 2391002826149962468
      // 0f5: invokestatic qeaa361f143ee4a0894bd168fd9b30c66/qf4ccf8f5435d4a78bdca4d6a018b578e/abaaabbba.aabba (IJ)J
      // 0f8: ladd
      // 0f9: putfield qeaa361f143ee4a0894bd168fd9b30c66/qf4ccf8f5435d4a78bdca4d6a018b578e/abaaabbba.abb J
      // 0fc: bipush 0
      // 0fd: ireturn
      // 0fe: athrow
      // 0ff: aload 0
      // 100: iload 5
      // 102: ifne 14f
      // 105: aload 1
      // 106: aload 4
      // 108: invokevirtual qeaa361f143ee4a0894bd168fd9b30c66/qf4ccf8f5435d4a78bdca4d6a018b578e/abaaabbba.baabb (Lnet/minecraft/class_310;Lnet/minecraft/class_3965;)Z
      // 10b: goto 10f
      // 10e: athrow
      // 10f: ifeq 14a
      // 112: aload 1
      // 113: aload 4
      // 115: bipush 1
      // 116: invokestatic qeaa361f143ee4a0894bd168fd9b30c66/qf4ccf8f5435d4a78bdca4d6a018b578e/bbabbbb.aabaab (Lnet/minecraft/class_310;Lnet/minecraft/class_3965;Z)Z
      // 119: iload 5
      // 11b: ifne 16a
      // 11e: goto 122
      // 121: athrow
      // 122: ifeq 14a
      // 125: goto 129
      // 128: athrow
      // 129: aload 1
      // 12a: iload 5
      // 12c: ifne 16c
      // 12f: goto 133
      // 132: athrow
      // 133: getfield net/minecraft/class_310.field_1724 Lnet/minecraft/class_746;
      // 136: invokevirtual net/minecraft/class_746.method_31548 ()Lnet/minecraft/class_1661;
      // 139: iload 2
      // 13a: invokevirtual net/minecraft/class_1661.method_5438 (I)Lnet/minecraft/class_1799;
      // 13d: getstatic net/minecraft/class_1802.field_8786 Lnet/minecraft/class_1792;
      // 140: invokevirtual net/minecraft/class_1799.method_31574 (Lnet/minecraft/class_1792;)Z
      // 143: ifne 16b
      // 146: goto 14a
      // 149: athrow
      // 14a: aload 0
      // 14b: goto 14f
      // 14e: athrow
      // 14f: invokestatic java/lang/System.currentTimeMillis ()J
      // 152: ldc_w -439572905
      // 155: ldc_w 301261289
      // 158: ldc_w -856570875
      // 15b: ixor
      // 15c: invokestatic qeaa361f143ee4a0894bd168fd9b30c66/qf4ccf8f5435d4a78bdca4d6a018b578e/abaaabbba.a (II)I
      // 15f: ldc2_w 8894999396806556107
      // 162: invokestatic qeaa361f143ee4a0894bd168fd9b30c66/qf4ccf8f5435d4a78bdca4d6a018b578e/abaaabbba.aabba (IJ)J
      // 165: ladd
      // 166: putfield qeaa361f143ee4a0894bd168fd9b30c66/qf4ccf8f5435d4a78bdca4d6a018b578e/abaaabbba.abb J
      // 169: bipush 0
      // 16a: ireturn
      // 16b: aload 1
      // 16c: aload 4
      // 16e: bipush 1
      // 16f: invokestatic qeaa361f143ee4a0894bd168fd9b30c66/qf4ccf8f5435d4a78bdca4d6a018b578e/bbabbbb.babab (Lnet/minecraft/class_310;Lnet/minecraft/class_3965;Z)Lnet/minecraft/class_3965;
      // 172: astore 6
      // 174: aload 6
      // 176: iload 5
      // 178: ifne 184
      // 17b: ifnull 187
      // 17e: goto 182
      // 181: athrow
      // 182: aload 6
      // 184: goto 189
      // 187: aload 4
      // 189: astore 7
      // 18b: iload 5
      // 18d: aload 1
      // 18e: aload 0
      // 18f: iload 2
      // 190: aload 0
      // 191: aload 7
      // 193: aload 1
      // 194: invokedynamic getAsBoolean (Lqeaa361f143ee4a0894bd168fd9b30c66/qf4ccf8f5435d4a78bdca4d6a018b578e/abaaabbba;Lnet/minecraft/class_3965;Lnet/minecraft/class_310;)Ljava/util/function/BooleanSupplier; bsm=java/lang/invoke/LambdaMetafactory.metafactory (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;Ljava/lang/invoke/MethodType;Ljava/lang/invoke/MethodHandle;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[ ()Z, qeaa361f143ee4a0894bd168fd9b30c66/qf4ccf8f5435d4a78bdca4d6a018b578e/abaaabbba.aaa (Lnet/minecraft/class_3965;Lnet/minecraft/class_310;)Z, ()Z ]
      // 199: invokestatic qeaa361f143ee4a0894bd168fd9b30c66/qf4ccf8f5435d4a78bdca4d6a018b578e/aabbabbbb.abbbbaa (Lnet/minecraft/class_310;Ljava/lang/Object;ILjava/util/function/BooleanSupplier;)Z
      // 19c: istore 8
      // 19e: ifne 1c0
      // 1a1: iload 8
      // 1a3: ifeq 1b8
      // 1a6: goto 1aa
      // 1a9: athrow
      // 1aa: aload 0
      // 1ab: bipush 1
      // 1ac: putfield qeaa361f143ee4a0894bd168fd9b30c66/qf4ccf8f5435d4a78bdca4d6a018b578e/abaaabbba.baabb Z
      // 1af: iload 5
      // 1b1: ifeq 1db
      // 1b4: goto 1b8
      // 1b7: athrow
      // 1b8: aload 0
      // 1b9: invokevirtual qeaa361f143ee4a0894bd168fd9b30c66/qf4ccf8f5435d4a78bdca4d6a018b578e/abaaabbba.baab ()V
      // 1bc: goto 1c0
      // 1bf: athrow
      // 1c0: aload 0
      // 1c1: invokestatic java/lang/System.currentTimeMillis ()J
      // 1c4: ldc_w -439572906
      // 1c7: ldc_w 301261289
      // 1ca: ldc_w -2095579328
      // 1cd: ixor
      // 1ce: invokestatic qeaa361f143ee4a0894bd168fd9b30c66/qf4ccf8f5435d4a78bdca4d6a018b578e/abaaabbba.a (II)I
      // 1d1: ldc2_w 8894999396806556107
      // 1d4: invokestatic qeaa361f143ee4a0894bd168fd9b30c66/qf4ccf8f5435d4a78bdca4d6a018b578e/abaaabbba.aabba (IJ)J
      // 1d7: ladd
      // 1d8: putfield qeaa361f143ee4a0894bd168fd9b30c66/qf4ccf8f5435d4a78bdca4d6a018b578e/abaaabbba.abb J
      // 1db: iload 8
      // 1dd: ireturn
   }

   private static long aabba(int var0, long var1) {
      int var3 = (var0 ^ (int)var1 ^ a(-439572907, -645222021 ^ -2031368974)) & a(-439572908, -645222021 ^ 1609045148);
      if (abbbb[var3] == null) {
         abbbb[var3] = aba[var3] ^ var1;
      }

      return abbbb[var3];
   }

   private aabaaabab abaaa(class_310 param1, class_2338 param2) {
      // $VF: Couldn't be decompiled
      // Please report this to the Vineflower issue tracker, at https://github.com/Vineflower/vineflower/issues with a copy of the class file (if you have the rights to distribute it!)
      // java.lang.RuntimeException: parsing failure!
      //   at org.jetbrains.java.decompiler.modules.decompiler.decompose.DomHelper.parseGraph(DomHelper.java:211)
      //   at org.jetbrains.java.decompiler.main.rels.MethodProcessor.codeToJava(MethodProcessor.java:166)
      //
      // Bytecode:
      // 000: getstatic qeaa361f143ee4a0894bd168fd9b30c66/qf4ccf8f5435d4a78bdca4d6a018b578e/baaabbaa.bba I
      // 003: istore 3
      // 004: aload 1
      // 005: iload 3
      // 006: ifne 011
      // 009: ifnull 03f
      // 00c: goto 010
      // 00f: athrow
      // 010: aload 1
      // 011: iload 3
      // 012: ifne 024
      // 015: getfield net/minecraft/class_310.field_1724 Lnet/minecraft/class_746;
      // 018: ifnull 03f
      // 01b: goto 01f
      // 01e: athrow
      // 01f: aload 1
      // 020: goto 024
      // 023: athrow
      // 024: getfield net/minecraft/class_310.field_1687 Lnet/minecraft/class_638;
      // 027: ifnull 03f
      // 02a: aload 2
      // 02b: ifnull 03f
      // 02e: goto 032
      // 031: athrow
      // 032: aload 0
      // 033: aload 1
      // 034: aload 2
      // 035: invokevirtual qeaa361f143ee4a0894bd168fd9b30c66/qf4ccf8f5435d4a78bdca4d6a018b578e/abaaabbba.abbab (Lnet/minecraft/class_310;Lnet/minecraft/class_2338;)Z
      // 038: ifne 042
      // 03b: goto 03f
      // 03e: athrow
      // 03f: aconst_null
      // 040: areturn
      // 041: athrow
      // 042: dconst_0
      // 043: aload 1
      // 044: getfield net/minecraft/class_310.field_1724 Lnet/minecraft/class_746;
      // 047: invokevirtual net/minecraft/class_746.method_55754 ()D
      // 04a: ldc2_w 0.1
      // 04d: dsub
      // 04e: invokestatic java/lang/Math.max (DD)D
      // 051: dstore 4
      // 053: invokestatic net/minecraft/class_2350.values ()[Lnet/minecraft/class_2350;
      // 056: astore 6
      // 058: aload 6
      // 05a: arraylength
      // 05b: istore 7
      // 05d: bipush 0
      // 05e: istore 8
      // 060: iload 8
      // 062: iload 7
      // 064: if_icmpge 1bb
      // 067: aload 6
      // 069: iload 8
      // 06b: aaload
      // 06c: astore 9
      // 06e: aload 2
      // 06f: aload 9
      // 071: invokevirtual net/minecraft/class_2338.method_10093 (Lnet/minecraft/class_2350;)Lnet/minecraft/class_2338;
      // 074: astore 10
      // 076: aload 0
      // 077: aload 1
      // 078: aload 10
      // 07a: invokevirtual qeaa361f143ee4a0894bd168fd9b30c66/qf4ccf8f5435d4a78bdca4d6a018b578e/abaaabbba.aabbbb (Lnet/minecraft/class_310;Lnet/minecraft/class_2338;)Z
      // 07d: ifne 088
      // 080: iload 3
      // 081: ifeq 1b4
      // 084: goto 088
      // 087: athrow
      // 088: aload 9
      // 08a: invokevirtual net/minecraft/class_2350.method_10153 ()Lnet/minecraft/class_2350;
      // 08d: astore 11
      // 08f: aload 10
      // 091: invokestatic net/minecraft/class_243.method_24953 (Lnet/minecraft/class_2382;)Lnet/minecraft/class_243;
      // 094: aload 11
      // 096: invokevirtual net/minecraft/class_2350.method_62675 ()Lnet/minecraft/class_2382;
      // 099: invokestatic net/minecraft/class_243.method_24954 (Lnet/minecraft/class_2382;)Lnet/minecraft/class_243;
      // 09c: ldc2_w 0.5
      // 09f: invokevirtual net/minecraft/class_243.method_1021 (D)Lnet/minecraft/class_243;
      // 0a2: invokevirtual net/minecraft/class_243.method_1019 (Lnet/minecraft/class_243;)Lnet/minecraft/class_243;
      // 0a5: astore 12
      // 0a7: aload 1
      // 0a8: getfield net/minecraft/class_310.field_1724 Lnet/minecraft/class_746;
      // 0ab: invokevirtual net/minecraft/class_746.method_33571 ()Lnet/minecraft/class_243;
      // 0ae: iload 3
      // 0af: ifne 0e3
      // 0b2: aload 12
      // 0b4: invokevirtual net/minecraft/class_243.method_1025 (Lnet/minecraft/class_243;)D
      // 0b7: dload 4
      // 0b9: dload 4
      // 0bb: dmul
      // 0bc: dcmpl
      // 0bd: ifle 0cc
      // 0c0: goto 0c4
      // 0c3: athrow
      // 0c4: iload 3
      // 0c5: ifeq 1b4
      // 0c8: goto 0cc
      // 0cb: athrow
      // 0cc: aload 12
      // 0ce: aload 11
      // 0d0: invokevirtual net/minecraft/class_2350.method_62675 ()Lnet/minecraft/class_2382;
      // 0d3: invokestatic net/minecraft/class_243.method_24954 (Lnet/minecraft/class_2382;)Lnet/minecraft/class_243;
      // 0d6: ldc2_w 0.001
      // 0d9: invokevirtual net/minecraft/class_243.method_1021 (D)Lnet/minecraft/class_243;
      // 0dc: invokevirtual net/minecraft/class_243.method_1020 (Lnet/minecraft/class_243;)Lnet/minecraft/class_243;
      // 0df: goto 0e3
      // 0e2: athrow
      // 0e3: astore 13
      // 0e5: aload 1
      // 0e6: aload 1
      // 0e7: getfield net/minecraft/class_310.field_1724 Lnet/minecraft/class_746;
      // 0ea: aload 1
      // 0eb: getfield net/minecraft/class_310.field_1724 Lnet/minecraft/class_746;
      // 0ee: invokevirtual net/minecraft/class_746.method_33571 ()Lnet/minecraft/class_243;
      // 0f1: aload 13
      // 0f3: invokestatic qeaa361f143ee4a0894bd168fd9b30c66/qf4ccf8f5435d4a78bdca4d6a018b578e/aabbabbbb.abba (Lnet/minecraft/class_310;Lnet/minecraft/class_1297;Lnet/minecraft/class_243;Lnet/minecraft/class_243;)Lnet/minecraft/class_3965;
      // 0f6: astore 14
      // 0f8: aload 14
      // 0fa: iload 3
      // 0fb: ifne 141
      // 0fe: ifnull 11c
      // 101: goto 105
      // 104: athrow
      // 105: aload 14
      // 107: iload 3
      // 108: ifne 145
      // 10b: goto 10f
      // 10e: athrow
      // 10f: invokevirtual net/minecraft/class_3965.method_17783 ()Lnet/minecraft/class_239$class_240;
      // 112: getstatic net/minecraft/class_239$class_240.field_1332 Lnet/minecraft/class_239$class_240;
      // 115: if_acmpeq 143
      // 118: goto 11c
      // 11b: athrow
      // 11c: aload 1
      // 11d: getfield net/minecraft/class_310.field_1687 Lnet/minecraft/class_638;
      // 120: new net/minecraft/class_3959
      // 123: dup
      // 124: aload 1
      // 125: getfield net/minecraft/class_310.field_1724 Lnet/minecraft/class_746;
      // 128: invokevirtual net/minecraft/class_746.method_33571 ()Lnet/minecraft/class_243;
      // 12b: aload 13
      // 12d: getstatic net/minecraft/class_3959$class_3960.field_17559 Lnet/minecraft/class_3959$class_3960;
      // 130: getstatic net/minecraft/class_3959$class_242.field_1348 Lnet/minecraft/class_3959$class_242;
      // 133: aload 1
      // 134: getfield net/minecraft/class_310.field_1724 Lnet/minecraft/class_746;
      // 137: invokespecial net/minecraft/class_3959.<init> (Lnet/minecraft/class_243;Lnet/minecraft/class_243;Lnet/minecraft/class_3959$class_3960;Lnet/minecraft/class_3959$class_242;Lnet/minecraft/class_1297;)V
      // 13a: invokevirtual net/minecraft/class_638.method_17742 (Lnet/minecraft/class_3959;)Lnet/minecraft/class_3965;
      // 13d: goto 141
      // 140: athrow
      // 141: astore 14
      // 143: aload 14
      // 145: iload 3
      // 146: ifne 15a
      // 149: ifnull 1b4
      // 14c: goto 150
      // 14f: athrow
      // 150: aload 14
      // 152: iload 3
      // 153: ifne 16d
      // 156: goto 15a
      // 159: athrow
      // 15a: invokevirtual net/minecraft/class_3965.method_17783 ()Lnet/minecraft/class_239$class_240;
      // 15d: getstatic net/minecraft/class_239$class_240.field_1332 Lnet/minecraft/class_239$class_240;
      // 160: if_acmpne 1b4
      // 163: aload 14
      // 165: iload 3
      // 166: ifne 17e
      // 169: goto 16d
      // 16c: athrow
      // 16d: invokevirtual net/minecraft/class_3965.method_17777 ()Lnet/minecraft/class_2338;
      // 170: aload 10
      // 172: invokevirtual net/minecraft/class_2338.equals (Ljava/lang/Object;)Z
      // 175: ifeq 1b4
      // 178: aload 14
      // 17a: goto 17e
      // 17d: athrow
      // 17e: invokevirtual net/minecraft/class_3965.method_17780 ()Lnet/minecraft/class_2350;
      // 181: aload 11
      // 183: if_acmpne 1b4
      // 186: aload 2
      // 187: aload 10
      // 189: aload 14
      // 18b: invokevirtual net/minecraft/class_3965.method_17780 ()Lnet/minecraft/class_2350;
      // 18e: invokevirtual net/minecraft/class_2338.method_10093 (Lnet/minecraft/class_2350;)Lnet/minecraft/class_2338;
      // 191: invokevirtual net/minecraft/class_2338.equals (Ljava/lang/Object;)Z
      // 194: ifeq 1b4
      // 197: goto 19b
      // 19a: athrow
      // 19b: new qeaa361f143ee4a0894bd168fd9b30c66/qf4ccf8f5435d4a78bdca4d6a018b578e/aabaaabab
      // 19e: dup
      // 19f: aload 2
      // 1a0: invokevirtual net/minecraft/class_2338.method_10062 ()Lnet/minecraft/class_2338;
      // 1a3: aload 10
      // 1a5: invokevirtual net/minecraft/class_2338.method_10062 ()Lnet/minecraft/class_2338;
      // 1a8: aload 14
      // 1aa: invokevirtual net/minecraft/class_3965.method_17784 ()Lnet/minecraft/class_243;
      // 1ad: aload 14
      // 1af: invokespecial qeaa361f143ee4a0894bd168fd9b30c66/qf4ccf8f5435d4a78bdca4d6a018b578e/aabaaabab.<init> (Lnet/minecraft/class_2338;Lnet/minecraft/class_2338;Lnet/minecraft/class_243;Lnet/minecraft/class_3965;)V
      // 1b2: areturn
      // 1b3: athrow
      // 1b4: iinc 8 1
      // 1b7: iload 3
      // 1b8: ifeq 060
      // 1bb: aconst_null
      // 1bc: areturn
   }

   private boolean ababb() {
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
      // 05: getfield qeaa361f143ee4a0894bd168fd9b30c66/qf4ccf8f5435d4a78bdca4d6a018b578e/abaaabbba.aaaba Lqeaa361f143ee4a0894bd168fd9b30c66/qf4ccf8f5435d4a78bdca4d6a018b578e/abbaaaaa;
      // 08: iload 1
      // 09: ifne 2f
      // 0c: invokevirtual qeaa361f143ee4a0894bd168fd9b30c66/qf4ccf8f5435d4a78bdca4d6a018b578e/abbaaaaa.abbb ()Ljava/lang/Object;
      // 0f: checkcast java/lang/Boolean
      // 12: invokevirtual java/lang/Boolean.booleanValue ()Z
      // 15: ifeq 4e
      // 18: goto 1c
      // 1b: athrow
      // 1c: aload 0
      // 1d: getfield qeaa361f143ee4a0894bd168fd9b30c66/qf4ccf8f5435d4a78bdca4d6a018b578e/abaaabbba.babba Lqeaa361f143ee4a0894bd168fd9b30c66/qf4ccf8f5435d4a78bdca4d6a018b578e/abbaaaaa;
      // 20: iload 1
      // 21: ifne 43
      // 24: goto 28
      // 27: athrow
      // 28: invokevirtual qeaa361f143ee4a0894bd168fd9b30c66/qf4ccf8f5435d4a78bdca4d6a018b578e/abbaaaaa.abbb ()Ljava/lang/Object;
      // 2b: goto 2f
      // 2e: athrow
      // 2f: checkcast java/lang/Boolean
      // 32: invokevirtual java/lang/Boolean.booleanValue ()Z
      // 35: ifeq 4e
      // 38: aload 0
      // 39: getfield qeaa361f143ee4a0894bd168fd9b30c66/qf4ccf8f5435d4a78bdca4d6a018b578e/abaaabbba.bbbba Lqeaa361f143ee4a0894bd168fd9b30c66/qf4ccf8f5435d4a78bdca4d6a018b578e/baabaab;
      // 3c: invokevirtual qeaa361f143ee4a0894bd168fd9b30c66/qf4ccf8f5435d4a78bdca4d6a018b578e/baabaab.abbb ()Ljava/lang/Object;
      // 3f: goto 43
      // 42: athrow
      // 43: getstatic qeaa361f143ee4a0894bd168fd9b30c66/qf4ccf8f5435d4a78bdca4d6a018b578e/aaabbbaba.a Lqeaa361f143ee4a0894bd168fd9b30c66/qf4ccf8f5435d4a78bdca4d6a018b578e/aaabbbaba;
      // 46: if_acmpne 4e
      // 49: bipush 1
      // 4a: goto 4f
      // 4d: athrow
      // 4e: bipush 0
      // 4f: ireturn
   }

   @Override
   public void abbbab(JsonObject param1) {
      // $VF: Couldn't be decompiled
      // Please report this to the Vineflower issue tracker, at https://github.com/Vineflower/vineflower/issues with a copy of the class file (if you have the rights to distribute it!)
      // java.lang.RuntimeException: parsing failure!
      //   at org.jetbrains.java.decompiler.modules.decompiler.decompose.DomHelper.parseGraph(DomHelper.java:211)
      //   at org.jetbrains.java.decompiler.main.rels.MethodProcessor.codeToJava(MethodProcessor.java:166)
      //
      // Bytecode:
      // 000: ldc_w 811143109
      // 003: istore 3
      // 004: aload 0
      // 005: aload 1
      // 006: invokevirtual qeaa361f143ee4a0894bd168fd9b30c66/qf4ccf8f5435d4a78bdca4d6a018b578e/abaaabbba.aaaaab (Lcom/google/gson/JsonObject;)V
      // 009: getstatic qeaa361f143ee4a0894bd168fd9b30c66/qf4ccf8f5435d4a78bdca4d6a018b578e/baaabbaa.bba I
      // 00c: aload 0
      // 00d: aload 1
      // 00e: invokespecial qeaa361f143ee4a0894bd168fd9b30c66/qf4ccf8f5435d4a78bdca4d6a018b578e/abbaabbaa.abbbab (Lcom/google/gson/JsonObject;)V
      // 011: istore 2
      // 012: aload 0
      // 013: iload 2
      // 014: ifne 19b
      // 017: aload 1
      // 018: getstatic qeaa361f143ee4a0894bd168fd9b30c66/qf4ccf8f5435d4a78bdca4d6a018b578e/abaaabbba.abaaa Lqeaa361f143ee4a0894bd168fd9b30c66/qf4ccf8f5435d4a78bdca4d6a018b578e/ababbbbaa;
      // 01b: invokevirtual qeaa361f143ee4a0894bd168fd9b30c66/qf4ccf8f5435d4a78bdca4d6a018b578e/ababbbbaa.abab ()Ljava/lang/String;
      // 01e: bipush 2
      // 01f: anewarray 1056
      // 022: dup
      // 023: bipush 0
      // 024: aload 0
      // 025: getfield qeaa361f143ee4a0894bd168fd9b30c66/qf4ccf8f5435d4a78bdca4d6a018b578e/abaaabbba.baaab Lqeaa361f143ee4a0894bd168fd9b30c66/qf4ccf8f5435d4a78bdca4d6a018b578e/aaabbbab;
      // 028: aastore
      // 029: dup
      // 02a: bipush 1
      // 02b: aload 0
      // 02c: getfield qeaa361f143ee4a0894bd168fd9b30c66/qf4ccf8f5435d4a78bdca4d6a018b578e/abaaabbba.abba Lqeaa361f143ee4a0894bd168fd9b30c66/qf4ccf8f5435d4a78bdca4d6a018b578e/aaabbbab;
      // 02f: aastore
      // 030: invokevirtual qeaa361f143ee4a0894bd168fd9b30c66/qf4ccf8f5435d4a78bdca4d6a018b578e/abaaabbba.bbabaaa (Lcom/google/gson/JsonObject;Ljava/lang/String;[Lqeaa361f143ee4a0894bd168fd9b30c66/qf4ccf8f5435d4a78bdca4d6a018b578e/aaabbbab;)V
      // 033: aload 0
      // 034: aload 1
      // 035: getstatic qeaa361f143ee4a0894bd168fd9b30c66/qf4ccf8f5435d4a78bdca4d6a018b578e/abaaabbba.baba Lqeaa361f143ee4a0894bd168fd9b30c66/qf4ccf8f5435d4a78bdca4d6a018b578e/ababbbbaa;
      // 038: invokevirtual qeaa361f143ee4a0894bd168fd9b30c66/qf4ccf8f5435d4a78bdca4d6a018b578e/ababbbbaa.abab ()Ljava/lang/String;
      // 03b: bipush 2
      // 03c: anewarray 1056
      // 03f: dup
      // 040: bipush 0
      // 041: aload 0
      // 042: getfield qeaa361f143ee4a0894bd168fd9b30c66/qf4ccf8f5435d4a78bdca4d6a018b578e/abaaabbba.baaab Lqeaa361f143ee4a0894bd168fd9b30c66/qf4ccf8f5435d4a78bdca4d6a018b578e/aaabbbab;
      // 045: aastore
      // 046: dup
      // 047: bipush 1
      // 048: aload 0
      // 049: getfield qeaa361f143ee4a0894bd168fd9b30c66/qf4ccf8f5435d4a78bdca4d6a018b578e/abaaabbba.abba Lqeaa361f143ee4a0894bd168fd9b30c66/qf4ccf8f5435d4a78bdca4d6a018b578e/aaabbbab;
      // 04c: aastore
      // 04d: invokevirtual qeaa361f143ee4a0894bd168fd9b30c66/qf4ccf8f5435d4a78bdca4d6a018b578e/abaaabbba.bbabaaa (Lcom/google/gson/JsonObject;Ljava/lang/String;[Lqeaa361f143ee4a0894bd168fd9b30c66/qf4ccf8f5435d4a78bdca4d6a018b578e/aaabbbab;)V
      // 050: aload 0
      // 051: aload 1
      // 052: ldc_w -439572909
      // 055: iload 3
      // 056: ldc_w 1735402950
      // 059: ixor
      // 05a: invokestatic qeaa361f143ee4a0894bd168fd9b30c66/qf4ccf8f5435d4a78bdca4d6a018b578e/abaaabbba.a (II)I
      // 05d: ldc_w -439572910
      // 060: iload 3
      // 061: ldc_w 2121606613
      // 064: ixor
      // 065: invokestatic qeaa361f143ee4a0894bd168fd9b30c66/qf4ccf8f5435d4a78bdca4d6a018b578e/abaaabbba.a (II)I
      // 068: invokestatic qeaa361f143ee4a0894bd168fd9b30c66/qf4ccf8f5435d4a78bdca4d6a018b578e/abaaabbba.babab (II)Ljava/lang/String;
      // 06b: invokestatic qeaa361f143ee4a0894bd168fd9b30c66/qf4ccf8f5435d4a78bdca4d6a018b578e/aabbaaaba.abba (Ljava/lang/String;)Ljava/lang/String;
      // 06e: bipush 1
      // 06f: anewarray 1056
      // 072: dup
      // 073: bipush 0
      // 074: aload 0
      // 075: getfield qeaa361f143ee4a0894bd168fd9b30c66/qf4ccf8f5435d4a78bdca4d6a018b578e/abaaabbba.baaab Lqeaa361f143ee4a0894bd168fd9b30c66/qf4ccf8f5435d4a78bdca4d6a018b578e/aaabbbab;
      // 078: aastore
      // 079: invokevirtual qeaa361f143ee4a0894bd168fd9b30c66/qf4ccf8f5435d4a78bdca4d6a018b578e/abaaabbba.bbabaaa (Lcom/google/gson/JsonObject;Ljava/lang/String;[Lqeaa361f143ee4a0894bd168fd9b30c66/qf4ccf8f5435d4a78bdca4d6a018b578e/aaabbbab;)V
      // 07c: aload 0
      // 07d: aload 1
      // 07e: ldc_w -439572911
      // 081: iload 3
      // 082: ldc_w 16717512
      // 085: ixor
      // 086: invokestatic qeaa361f143ee4a0894bd168fd9b30c66/qf4ccf8f5435d4a78bdca4d6a018b578e/abaaabbba.a (II)I
      // 089: ldc_w -439572912
      // 08c: iload 3
      // 08d: ldc_w -1544375972
      // 090: ixor
      // 091: invokestatic qeaa361f143ee4a0894bd168fd9b30c66/qf4ccf8f5435d4a78bdca4d6a018b578e/abaaabbba.a (II)I
      // 094: invokestatic qeaa361f143ee4a0894bd168fd9b30c66/qf4ccf8f5435d4a78bdca4d6a018b578e/abaaabbba.babab (II)Ljava/lang/String;
      // 097: invokestatic qeaa361f143ee4a0894bd168fd9b30c66/qf4ccf8f5435d4a78bdca4d6a018b578e/aabbaaaba.abba (Ljava/lang/String;)Ljava/lang/String;
      // 09a: bipush 1
      // 09b: anewarray 1056
      // 09e: dup
      // 09f: bipush 0
      // 0a0: aload 0
      // 0a1: getfield qeaa361f143ee4a0894bd168fd9b30c66/qf4ccf8f5435d4a78bdca4d6a018b578e/abaaabbba.abba Lqeaa361f143ee4a0894bd168fd9b30c66/qf4ccf8f5435d4a78bdca4d6a018b578e/aaabbbab;
      // 0a4: aastore
      // 0a5: invokevirtual qeaa361f143ee4a0894bd168fd9b30c66/qf4ccf8f5435d4a78bdca4d6a018b578e/abaaabbba.bbabaaa (Lcom/google/gson/JsonObject;Ljava/lang/String;[Lqeaa361f143ee4a0894bd168fd9b30c66/qf4ccf8f5435d4a78bdca4d6a018b578e/aaabbbab;)V
      // 0a8: aload 0
      // 0a9: aload 1
      // 0aa: ldc_w -439572897
      // 0ad: iload 3
      // 0ae: ldc_w -1739581027
      // 0b1: ixor
      // 0b2: invokestatic qeaa361f143ee4a0894bd168fd9b30c66/qf4ccf8f5435d4a78bdca4d6a018b578e/abaaabbba.a (II)I
      // 0b5: ldc_w -439572898
      // 0b8: iload 3
      // 0b9: ldc_w 1869581133
      // 0bc: ixor
      // 0bd: invokestatic qeaa361f143ee4a0894bd168fd9b30c66/qf4ccf8f5435d4a78bdca4d6a018b578e/abaaabbba.a (II)I
      // 0c0: invokestatic qeaa361f143ee4a0894bd168fd9b30c66/qf4ccf8f5435d4a78bdca4d6a018b578e/abaaabbba.babab (II)Ljava/lang/String;
      // 0c3: invokestatic qeaa361f143ee4a0894bd168fd9b30c66/qf4ccf8f5435d4a78bdca4d6a018b578e/aabbaaaba.abba (Ljava/lang/String;)Ljava/lang/String;
      // 0c6: bipush 1
      // 0c7: anewarray 1056
      // 0ca: dup
      // 0cb: bipush 0
      // 0cc: aload 0
      // 0cd: getfield qeaa361f143ee4a0894bd168fd9b30c66/qf4ccf8f5435d4a78bdca4d6a018b578e/abaaabbba.abba Lqeaa361f143ee4a0894bd168fd9b30c66/qf4ccf8f5435d4a78bdca4d6a018b578e/aaabbbab;
      // 0d0: aastore
      // 0d1: invokevirtual qeaa361f143ee4a0894bd168fd9b30c66/qf4ccf8f5435d4a78bdca4d6a018b578e/abaaabbba.bbabaaa (Lcom/google/gson/JsonObject;Ljava/lang/String;[Lqeaa361f143ee4a0894bd168fd9b30c66/qf4ccf8f5435d4a78bdca4d6a018b578e/aaabbbab;)V
      // 0d4: aload 0
      // 0d5: aload 1
      // 0d6: ldc_w -439572899
      // 0d9: iload 3
      // 0da: ldc_w -810978676
      // 0dd: ixor
      // 0de: invokestatic qeaa361f143ee4a0894bd168fd9b30c66/qf4ccf8f5435d4a78bdca4d6a018b578e/abaaabbba.a (II)I
      // 0e1: ldc_w -439572900
      // 0e4: iload 3
      // 0e5: ldc_w -2045326357
      // 0e8: ixor
      // 0e9: invokestatic qeaa361f143ee4a0894bd168fd9b30c66/qf4ccf8f5435d4a78bdca4d6a018b578e/abaaabbba.a (II)I
      // 0ec: invokestatic qeaa361f143ee4a0894bd168fd9b30c66/qf4ccf8f5435d4a78bdca4d6a018b578e/abaaabbba.babab (II)Ljava/lang/String;
      // 0ef: invokestatic qeaa361f143ee4a0894bd168fd9b30c66/qf4ccf8f5435d4a78bdca4d6a018b578e/aabbaaaba.abba (Ljava/lang/String;)Ljava/lang/String;
      // 0f2: bipush 1
      // 0f3: anewarray 1056
      // 0f6: dup
      // 0f7: bipush 0
      // 0f8: aload 0
      // 0f9: getfield qeaa361f143ee4a0894bd168fd9b30c66/qf4ccf8f5435d4a78bdca4d6a018b578e/abaaabbba.baaab Lqeaa361f143ee4a0894bd168fd9b30c66/qf4ccf8f5435d4a78bdca4d6a018b578e/aaabbbab;
      // 0fc: aastore
      // 0fd: invokevirtual qeaa361f143ee4a0894bd168fd9b30c66/qf4ccf8f5435d4a78bdca4d6a018b578e/abaaabbba.bbabaaa (Lcom/google/gson/JsonObject;Ljava/lang/String;[Lqeaa361f143ee4a0894bd168fd9b30c66/qf4ccf8f5435d4a78bdca4d6a018b578e/aaabbbab;)V
      // 100: aload 0
      // 101: aload 1
      // 102: ldc_w -439572901
      // 105: iload 3
      // 106: ldc_w 1649480971
      // 109: ixor
      // 10a: invokestatic qeaa361f143ee4a0894bd168fd9b30c66/qf4ccf8f5435d4a78bdca4d6a018b578e/abaaabbba.a (II)I
      // 10d: ldc_w -439572902
      // 110: iload 3
      // 111: ldc_w -971596297
      // 114: ixor
      // 115: invokestatic qeaa361f143ee4a0894bd168fd9b30c66/qf4ccf8f5435d4a78bdca4d6a018b578e/abaaabbba.a (II)I
      // 118: invokestatic qeaa361f143ee4a0894bd168fd9b30c66/qf4ccf8f5435d4a78bdca4d6a018b578e/abaaabbba.babab (II)Ljava/lang/String;
      // 11b: invokestatic qeaa361f143ee4a0894bd168fd9b30c66/qf4ccf8f5435d4a78bdca4d6a018b578e/aabbaaaba.abba (Ljava/lang/String;)Ljava/lang/String;
      // 11e: bipush 1
      // 11f: anewarray 1056
      // 122: dup
      // 123: bipush 0
      // 124: aload 0
      // 125: getfield qeaa361f143ee4a0894bd168fd9b30c66/qf4ccf8f5435d4a78bdca4d6a018b578e/abaaabbba.abba Lqeaa361f143ee4a0894bd168fd9b30c66/qf4ccf8f5435d4a78bdca4d6a018b578e/aaabbbab;
      // 128: aastore
      // 129: invokevirtual qeaa361f143ee4a0894bd168fd9b30c66/qf4ccf8f5435d4a78bdca4d6a018b578e/abaaabbba.bbabaaa (Lcom/google/gson/JsonObject;Ljava/lang/String;[Lqeaa361f143ee4a0894bd168fd9b30c66/qf4ccf8f5435d4a78bdca4d6a018b578e/aaabbbab;)V
      // 12c: aload 0
      // 12d: aload 1
      // 12e: ldc_w -439572903
      // 131: iload 3
      // 132: ldc_w 831607256
      // 135: ixor
      // 136: invokestatic qeaa361f143ee4a0894bd168fd9b30c66/qf4ccf8f5435d4a78bdca4d6a018b578e/abaaabbba.a (II)I
      // 139: ldc_w -439572904
      // 13c: iload 3
      // 13d: ldc_w 317293921
      // 140: ixor
      // 141: invokestatic qeaa361f143ee4a0894bd168fd9b30c66/qf4ccf8f5435d4a78bdca4d6a018b578e/abaaabbba.a (II)I
      // 144: invokestatic qeaa361f143ee4a0894bd168fd9b30c66/qf4ccf8f5435d4a78bdca4d6a018b578e/abaaabbba.babab (II)Ljava/lang/String;
      // 147: invokestatic qeaa361f143ee4a0894bd168fd9b30c66/qf4ccf8f5435d4a78bdca4d6a018b578e/aabbaaaba.abba (Ljava/lang/String;)Ljava/lang/String;
      // 14a: bipush 1
      // 14b: anewarray 1056
      // 14e: dup
      // 14f: bipush 0
      // 150: aload 0
      // 151: getfield qeaa361f143ee4a0894bd168fd9b30c66/qf4ccf8f5435d4a78bdca4d6a018b578e/abaaabbba.abba Lqeaa361f143ee4a0894bd168fd9b30c66/qf4ccf8f5435d4a78bdca4d6a018b578e/aaabbbab;
      // 154: aastore
      // 155: invokevirtual qeaa361f143ee4a0894bd168fd9b30c66/qf4ccf8f5435d4a78bdca4d6a018b578e/abaaabbba.bbabaaa (Lcom/google/gson/JsonObject;Ljava/lang/String;[Lqeaa361f143ee4a0894bd168fd9b30c66/qf4ccf8f5435d4a78bdca4d6a018b578e/aaabbbab;)V
      // 158: aload 0
      // 159: getfield qeaa361f143ee4a0894bd168fd9b30c66/qf4ccf8f5435d4a78bdca4d6a018b578e/abaaabbba.baaab Lqeaa361f143ee4a0894bd168fd9b30c66/qf4ccf8f5435d4a78bdca4d6a018b578e/aaabbbab;
      // 15c: invokevirtual qeaa361f143ee4a0894bd168fd9b30c66/qf4ccf8f5435d4a78bdca4d6a018b578e/aaabbbab.bab ()D
      // 15f: ldc2_w 55.0
      // 162: dcmpl
      // 163: ifne 19a
      // 166: goto 16a
      // 169: athrow
      // 16a: aload 0
      // 16b: getfield qeaa361f143ee4a0894bd168fd9b30c66/qf4ccf8f5435d4a78bdca4d6a018b578e/abaaabbba.baaab Lqeaa361f143ee4a0894bd168fd9b30c66/qf4ccf8f5435d4a78bdca4d6a018b578e/aaabbbab;
      // 16e: iload 2
      // 16f: ifne 19e
      // 172: goto 176
      // 175: athrow
      // 176: invokevirtual qeaa361f143ee4a0894bd168fd9b30c66/qf4ccf8f5435d4a78bdca4d6a018b578e/aaabbbab.abb ()D
      // 179: ldc2_w 60.0
      // 17c: dcmpl
      // 17d: ifne 19a
      // 180: goto 184
      // 183: athrow
      // 184: aload 0
      // 185: getfield qeaa361f143ee4a0894bd168fd9b30c66/qf4ccf8f5435d4a78bdca4d6a018b578e/abaaabbba.baaab Lqeaa361f143ee4a0894bd168fd9b30c66/qf4ccf8f5435d4a78bdca4d6a018b578e/aaabbbab;
      // 188: bipush 2
      // 189: newarray 7
      // 18b: dup
      // 18c: bipush 0
      // 18d: dconst_0
      // 18e: dastore
      // 18f: dup
      // 190: bipush 1
      // 191: dconst_0
      // 192: dastore
      // 193: invokevirtual qeaa361f143ee4a0894bd168fd9b30c66/qf4ccf8f5435d4a78bdca4d6a018b578e/aaabbbab.a ([D)V
      // 196: goto 19a
      // 199: athrow
      // 19a: aload 0
      // 19b: getfield qeaa361f143ee4a0894bd168fd9b30c66/qf4ccf8f5435d4a78bdca4d6a018b578e/abaaabbba.abba Lqeaa361f143ee4a0894bd168fd9b30c66/qf4ccf8f5435d4a78bdca4d6a018b578e/aaabbbab;
      // 19e: invokevirtual qeaa361f143ee4a0894bd168fd9b30c66/qf4ccf8f5435d4a78bdca4d6a018b578e/aaabbbab.bab ()D
      // 1a1: iload 2
      // 1a2: ifne 1c3
      // 1a5: ldc2_w 10.0
      // 1a8: dcmpl
      // 1a9: ifne 1e0
      // 1ac: goto 1b0
      // 1af: athrow
      // 1b0: aload 0
      // 1b1: iload 2
      // 1b2: ifne 1cf
      // 1b5: goto 1b9
      // 1b8: athrow
      // 1b9: getfield qeaa361f143ee4a0894bd168fd9b30c66/qf4ccf8f5435d4a78bdca4d6a018b578e/abaaabbba.abba Lqeaa361f143ee4a0894bd168fd9b30c66/qf4ccf8f5435d4a78bdca4d6a018b578e/aaabbbab;
      // 1bc: invokevirtual qeaa361f143ee4a0894bd168fd9b30c66/qf4ccf8f5435d4a78bdca4d6a018b578e/aaabbbab.abb ()D
      // 1bf: goto 1c3
      // 1c2: athrow
      // 1c3: ldc2_w 25.0
      // 1c6: dcmpl
      // 1c7: ifne 1e0
      // 1ca: aload 0
      // 1cb: goto 1cf
      // 1ce: athrow
      // 1cf: getfield qeaa361f143ee4a0894bd168fd9b30c66/qf4ccf8f5435d4a78bdca4d6a018b578e/abaaabbba.abba Lqeaa361f143ee4a0894bd168fd9b30c66/qf4ccf8f5435d4a78bdca4d6a018b578e/aaabbbab;
      // 1d2: bipush 2
      // 1d3: newarray 7
      // 1d5: dup
      // 1d6: bipush 0
      // 1d7: dconst_0
      // 1d8: dastore
      // 1d9: dup
      // 1da: bipush 1
      // 1db: dconst_0
      // 1dc: dastore
      // 1dd: invokevirtual qeaa361f143ee4a0894bd168fd9b30c66/qf4ccf8f5435d4a78bdca4d6a018b578e/aaabbbab.a ([D)V
      // 1e0: return
   }

   private void abbaa(class_2338 param1, boolean param2) {
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
      // 06: ifne 18
      // 09: getfield qeaa361f143ee4a0894bd168fd9b30c66/qf4ccf8f5435d4a78bdca4d6a018b578e/abaaabbba.bbba Lnet/minecraft/class_2338;
      // 0c: ifnull 4c
      // 0f: goto 13
      // 12: athrow
      // 13: aload 0
      // 14: goto 18
      // 17: athrow
      // 18: iload 3
      // 19: ifne 3c
      // 1c: getfield qeaa361f143ee4a0894bd168fd9b30c66/qf4ccf8f5435d4a78bdca4d6a018b578e/abaaabbba.bbba Lnet/minecraft/class_2338;
      // 1f: aload 1
      // 20: invokevirtual net/minecraft/class_2338.equals (Ljava/lang/Object;)Z
      // 23: ifeq 4c
      // 26: goto 2a
      // 29: athrow
      // 2a: aload 0
      // 2b: iload 2
      // 2c: iload 3
      // 2d: ifne 45
      // 30: goto 34
      // 33: athrow
      // 34: putfield qeaa361f143ee4a0894bd168fd9b30c66/qf4ccf8f5435d4a78bdca4d6a018b578e/abaaabbba.bbb Z
      // 37: aload 0
      // 38: goto 3c
      // 3b: athrow
      // 3c: iload 2
      // 3d: ifne 48
      // 40: bipush 1
      // 41: goto 45
      // 44: athrow
      // 45: goto 49
      // 48: bipush 0
      // 49: putfield qeaa361f143ee4a0894bd168fd9b30c66/qf4ccf8f5435d4a78bdca4d6a018b578e/abaaabbba.abbb Z
      // 4c: return
   }

   private boolean abbab(class_310 param1, class_2338 param2) {
      // $VF: Couldn't be decompiled
      // Please report this to the Vineflower issue tracker, at https://github.com/Vineflower/vineflower/issues with a copy of the class file (if you have the rights to distribute it!)
      // java.lang.RuntimeException: parsing failure!
      //   at org.jetbrains.java.decompiler.modules.decompiler.decompose.DomHelper.parseGraph(DomHelper.java:211)
      //   at org.jetbrains.java.decompiler.main.rels.MethodProcessor.codeToJava(MethodProcessor.java:166)
      //
      // Bytecode:
      // 00: getstatic qeaa361f143ee4a0894bd168fd9b30c66/qf4ccf8f5435d4a78bdca4d6a018b578e/baaabbaa.bba I
      // 03: istore 3
      // 04: aload 1
      // 05: iload 3
      // 06: ifne 11
      // 09: ifnull 1f
      // 0c: goto 10
      // 0f: athrow
      // 10: aload 1
      // 11: getfield net/minecraft/class_310.field_1687 Lnet/minecraft/class_638;
      // 14: ifnull 1f
      // 17: aload 2
      // 18: ifnonnull 22
      // 1b: goto 1f
      // 1e: athrow
      // 1f: bipush 0
      // 20: ireturn
      // 21: athrow
      // 22: aload 1
      // 23: getfield net/minecraft/class_310.field_1687 Lnet/minecraft/class_638;
      // 26: aload 2
      // 27: invokevirtual net/minecraft/class_638.method_8320 (Lnet/minecraft/class_2338;)Lnet/minecraft/class_2680;
      // 2a: astore 4
      // 2c: aload 4
      // 2e: invokevirtual net/minecraft/class_2680.method_26227 ()Lnet/minecraft/class_3610;
      // 31: invokevirtual net/minecraft/class_3610.method_15769 ()Z
      // 34: iload 3
      // 35: ifne 72
      // 38: ifeq 6d
      // 3b: goto 3f
      // 3e: athrow
      // 3f: aload 4
      // 41: getstatic net/minecraft/class_2246.field_10382 Lnet/minecraft/class_2248;
      // 44: invokevirtual net/minecraft/class_2680.method_27852 (Lnet/minecraft/class_2248;)Z
      // 47: iload 3
      // 48: ifne 72
      // 4b: goto 4f
      // 4e: athrow
      // 4f: ifne 6d
      // 52: goto 56
      // 55: athrow
      // 56: aload 4
      // 58: iload 3
      // 59: ifne 75
      // 5c: goto 60
      // 5f: athrow
      // 60: getstatic net/minecraft/class_2246.field_10164 Lnet/minecraft/class_2248;
      // 63: invokevirtual net/minecraft/class_2680.method_27852 (Lnet/minecraft/class_2248;)Z
      // 66: ifeq 73
      // 69: goto 6d
      // 6c: athrow
      // 6d: bipush 0
      // 6e: goto 72
      // 71: athrow
      // 72: ireturn
      // 73: aload 4
      // 75: invokevirtual net/minecraft/class_2680.method_26215 ()Z
      // 78: iload 3
      // 79: ifne da
      // 7c: ifne d9
      // 7f: goto 83
      // 82: athrow
      // 83: aload 4
      // 85: invokevirtual net/minecraft/class_2680.method_45474 ()Z
      // 88: iload 3
      // 89: ifne da
      // 8c: goto 90
      // 8f: athrow
      // 90: ifne d9
      // 93: goto 97
      // 96: athrow
      // 97: aload 4
      // 99: invokestatic qeaa361f143ee4a0894bd168fd9b30c66/qf4ccf8f5435d4a78bdca4d6a018b578e/aabbabbbb.ababaa (Lnet/minecraft/class_2680;)Z
      // 9c: iload 3
      // 9d: ifne da
      // a0: goto a4
      // a3: athrow
      // a4: ifne d9
      // a7: goto ab
      // aa: athrow
      // ab: aload 4
      // ad: getstatic net/minecraft/class_2246.field_10036 Lnet/minecraft/class_2248;
      // b0: invokevirtual net/minecraft/class_2680.method_27852 (Lnet/minecraft/class_2248;)Z
      // b3: iload 3
      // b4: ifne da
      // b7: goto bb
      // ba: athrow
      // bb: ifne d9
      // be: goto c2
      // c1: athrow
      // c2: aload 4
      // c4: getstatic net/minecraft/class_2246.field_22089 Lnet/minecraft/class_2248;
      // c7: invokevirtual net/minecraft/class_2680.method_27852 (Lnet/minecraft/class_2248;)Z
      // ca: iload 3
      // cb: ifne da
      // ce: goto d2
      // d1: athrow
      // d2: ifeq dd
      // d5: goto d9
      // d8: athrow
      // d9: bipush 1
      // da: goto de
      // dd: bipush 0
      // de: ireturn
   }

   @Override
   public void abaab() {
      this.ba();
      this.abaaab();
      this.bbaba.babbbb();
   }

   private boolean abbba(class_1309 param1) {
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
      // 05: ifnull 4e
      // 08: aload 0
      // 09: getfield qeaa361f143ee4a0894bd168fd9b30c66/qf4ccf8f5435d4a78bdca4d6a018b578e/abaaabbba.bbaaa I
      // 0c: iload 2
      // 0d: ifne 3f
      // 10: goto 14
      // 13: athrow
      // 14: aload 1
      // 15: invokevirtual net/minecraft/class_1309.method_5628 ()I
      // 18: if_icmpne 4e
      // 1b: goto 1f
      // 1e: athrow
      // 1f: invokestatic java/lang/System.currentTimeMillis ()J
      // 22: aload 0
      // 23: getfield qeaa361f143ee4a0894bd168fd9b30c66/qf4ccf8f5435d4a78bdca4d6a018b578e/abaaabbba.baab J
      // 26: lsub
      // 27: ldc_w -439572889
      // 2a: ldc_w 1714113246
      // 2d: ldc_w -1582421763
      // 30: ixor
      // 31: invokestatic qeaa361f143ee4a0894bd168fd9b30c66/qf4ccf8f5435d4a78bdca4d6a018b578e/abaaabbba.a (II)I
      // 34: ldc2_w 5215105643721258619
      // 37: invokestatic qeaa361f143ee4a0894bd168fd9b30c66/qf4ccf8f5435d4a78bdca4d6a018b578e/abaaabbba.aabba (IJ)J
      // 3a: lcmp
      // 3b: goto 3f
      // 3e: athrow
      // 3f: iload 2
      // 40: ifne 4b
      // 43: ifge 4e
      // 46: goto 4a
      // 49: athrow
      // 4a: bipush 1
      // 4b: goto 4f
      // 4e: bipush 0
      // 4f: ireturn
   }

   private void abbbb() {
      this.babaa = null;
      this.aaaaab = null;
      this.bab = null;
      this.abaa = 0.0F;
      this.aaaaa = 0.0F;
   }

   private void baaaa(class_310 var1) {
      abbaaabba var10000;
      label16: {
         try {
            if ((Boolean)this.aaaab.abbb()) {
               var10000 = abbaaabba.aba;
               break label16;
            }
         } catch (MatchException var3) {
            throw var3;
         }

         var10000 = abbaaabba.ab;
      }

      abbaaabba var2 = var10000;
      aabbabbbb.bbaaabb(var1, this, var2);
      this.ba();
      this.bbab = null;
      this.abaaab();
   }

   private boolean baaab(class_310 param1, class_1309 param2) {
      // $VF: Couldn't be decompiled
      // Please report this to the Vineflower issue tracker, at https://github.com/Vineflower/vineflower/issues with a copy of the class file (if you have the rights to distribute it!)
      // java.lang.RuntimeException: parsing failure!
      //   at org.jetbrains.java.decompiler.modules.decompiler.decompose.DomHelper.parseGraph(DomHelper.java:211)
      //   at org.jetbrains.java.decompiler.main.rels.MethodProcessor.codeToJava(MethodProcessor.java:166)
      //
      // Bytecode:
      // 00: getstatic qeaa361f143ee4a0894bd168fd9b30c66/qf4ccf8f5435d4a78bdca4d6a018b578e/baaabbaa.bba I
      // 03: invokestatic qeaa361f143ee4a0894bd168fd9b30c66/qf4ccf8f5435d4a78bdca4d6a018b578e/abaaaaaba.aaaaa ()Lqeaa361f143ee4a0894bd168fd9b30c66/qf4ccf8f5435d4a78bdca4d6a018b578e/abaaaaaba;
      // 06: astore 4
      // 08: istore 3
      // 09: aload 4
      // 0b: iload 3
      // 0c: ifne 1b
      // 0f: ifnonnull 19
      // 12: goto 16
      // 15: athrow
      // 16: bipush 0
      // 17: ireturn
      // 18: athrow
      // 19: aload 4
      // 1b: invokevirtual qeaa361f143ee4a0894bd168fd9b30c66/qf4ccf8f5435d4a78bdca4d6a018b578e/abaaaaaba.aaba ()Lqeaa361f143ee4a0894bd168fd9b30c66/qf4ccf8f5435d4a78bdca4d6a018b578e/babbaba;
      // 1e: invokevirtual qeaa361f143ee4a0894bd168fd9b30c66/qf4ccf8f5435d4a78bdca4d6a018b578e/babbaba.baaabb ()Lqeaa361f143ee4a0894bd168fd9b30c66/qf4ccf8f5435d4a78bdca4d6a018b578e/aaaababa;
      // 21: astore 5
      // 23: aload 5
      // 25: iload 3
      // 26: ifne 32
      // 29: ifnull 6d
      // 2c: goto 30
      // 2f: athrow
      // 30: aload 5
      // 32: invokevirtual qeaa361f143ee4a0894bd168fd9b30c66/qf4ccf8f5435d4a78bdca4d6a018b578e/aaaababa.babbaab ()Z
      // 35: iload 3
      // 36: ifne 6e
      // 39: ifeq 6d
      // 3c: goto 40
      // 3f: athrow
      // 40: aload 5
      // 42: aload 2
      // 43: invokevirtual qeaa361f143ee4a0894bd168fd9b30c66/qf4ccf8f5435d4a78bdca4d6a018b578e/aaaababa.abaabb (Lnet/minecraft/class_1309;)Z
      // 46: iload 3
      // 47: ifne 6c
      // 4a: goto 4e
      // 4d: athrow
      // 4e: ifne 6b
      // 51: goto 55
      // 54: athrow
      // 55: aload 5
      // 57: aload 1
      // 58: aload 2
      // 59: invokevirtual qeaa361f143ee4a0894bd168fd9b30c66/qf4ccf8f5435d4a78bdca4d6a018b578e/aaaababa.bbab (Lnet/minecraft/class_310;Lnet/minecraft/class_1309;)Z
      // 5c: iload 3
      // 5d: ifne 6e
      // 60: goto 64
      // 63: athrow
      // 64: ifeq 6d
      // 67: goto 6b
      // 6a: athrow
      // 6b: bipush 1
      // 6c: ireturn
      // 6d: bipush 0
      // 6e: ireturn
   }

   private boolean baaba(class_310 param1) {
      // $VF: Couldn't be decompiled
      // Please report this to the Vineflower issue tracker, at https://github.com/Vineflower/vineflower/issues with a copy of the class file (if you have the rights to distribute it!)
      // java.lang.RuntimeException: parsing failure!
      //   at org.jetbrains.java.decompiler.modules.decompiler.decompose.DomHelper.parseGraph(DomHelper.java:211)
      //   at org.jetbrains.java.decompiler.main.rels.MethodProcessor.codeToJava(MethodProcessor.java:166)
      //
      // Bytecode:
      // 000: getstatic qeaa361f143ee4a0894bd168fd9b30c66/qf4ccf8f5435d4a78bdca4d6a018b578e/baaabbaa.bba I
      // 003: istore 2
      // 004: aload 1
      // 005: iload 2
      // 006: ifne 011
      // 009: ifnull 017
      // 00c: goto 010
      // 00f: athrow
      // 010: aload 1
      // 011: getfield net/minecraft/class_310.field_1724 Lnet/minecraft/class_746;
      // 014: ifnonnull 01a
      // 017: bipush 0
      // 018: ireturn
      // 019: athrow
      // 01a: aload 0
      // 01b: getfield qeaa361f143ee4a0894bd168fd9b30c66/qf4ccf8f5435d4a78bdca4d6a018b578e/abaaabbba.bb Lqeaa361f143ee4a0894bd168fd9b30c66/qf4ccf8f5435d4a78bdca4d6a018b578e/abaabbbb;
      // 01e: getstatic qeaa361f143ee4a0894bd168fd9b30c66/qf4ccf8f5435d4a78bdca4d6a018b578e/abaaabbba.aabba Lqeaa361f143ee4a0894bd168fd9b30c66/qf4ccf8f5435d4a78bdca4d6a018b578e/ababbbbaa;
      // 021: iload 2
      // 022: ifne 03a
      // 025: invokevirtual qeaa361f143ee4a0894bd168fd9b30c66/qf4ccf8f5435d4a78bdca4d6a018b578e/abaabbbb.aaab (Lqeaa361f143ee4a0894bd168fd9b30c66/qf4ccf8f5435d4a78bdca4d6a018b578e/ababbbbaa;)Z
      // 028: ifne 04a
      // 02b: goto 02f
      // 02e: athrow
      // 02f: aload 0
      // 030: getfield qeaa361f143ee4a0894bd168fd9b30c66/qf4ccf8f5435d4a78bdca4d6a018b578e/abaaabbba.bb Lqeaa361f143ee4a0894bd168fd9b30c66/qf4ccf8f5435d4a78bdca4d6a018b578e/abaabbbb;
      // 033: getstatic qeaa361f143ee4a0894bd168fd9b30c66/qf4ccf8f5435d4a78bdca4d6a018b578e/abaaabbba.bbbb Lqeaa361f143ee4a0894bd168fd9b30c66/qf4ccf8f5435d4a78bdca4d6a018b578e/ababbbbaa;
      // 036: goto 03a
      // 039: athrow
      // 03a: invokevirtual qeaa361f143ee4a0894bd168fd9b30c66/qf4ccf8f5435d4a78bdca4d6a018b578e/abaabbbb.aaab (Lqeaa361f143ee4a0894bd168fd9b30c66/qf4ccf8f5435d4a78bdca4d6a018b578e/ababbbbaa;)Z
      // 03d: iload 2
      // 03e: ifne 049
      // 041: ifne 04a
      // 044: goto 048
      // 047: athrow
      // 048: bipush 1
      // 049: ireturn
      // 04a: aload 1
      // 04b: getfield net/minecraft/class_310.field_1724 Lnet/minecraft/class_746;
      // 04e: invokevirtual net/minecraft/class_746.method_6047 ()Lnet/minecraft/class_1799;
      // 051: astore 3
      // 052: aload 3
      // 053: iload 2
      // 054: ifne 05f
      // 057: ifnull 06d
      // 05a: goto 05e
      // 05d: athrow
      // 05e: aload 3
      // 05f: iload 2
      // 060: ifne 071
      // 063: invokevirtual net/minecraft/class_1799.method_7960 ()Z
      // 066: ifeq 070
      // 069: goto 06d
      // 06c: athrow
      // 06d: bipush 0
      // 06e: ireturn
      // 06f: athrow
      // 070: aload 3
      // 071: getstatic net/minecraft/class_3489.field_42611 Lnet/minecraft/class_6862;
      // 074: invokevirtual net/minecraft/class_1799.method_31573 (Lnet/minecraft/class_6862;)Z
      // 077: iload 2
      // 078: ifne 0c4
      // 07b: ifne 0c3
      // 07e: goto 082
      // 081: athrow
      // 082: getstatic net/minecraft/class_7923.field_41178 Lnet/minecraft/class_7922;
      // 085: aload 3
      // 086: invokevirtual net/minecraft/class_1799.method_7909 ()Lnet/minecraft/class_1792;
      // 089: invokeinterface net/minecraft/class_7922.method_10221 (Ljava/lang/Object;)Lnet/minecraft/class_2960; 2
      // 08e: invokevirtual net/minecraft/class_2960.method_12832 ()Ljava/lang/String;
      // 091: ldc_w -439572890
      // 094: ldc_w -2120195262
      // 097: ldc_w 64388188
      // 09a: ixor
      // 09b: invokestatic qeaa361f143ee4a0894bd168fd9b30c66/qf4ccf8f5435d4a78bdca4d6a018b578e/abaaabbba.a (II)I
      // 09e: ldc_w -439572891
      // 0a1: ldc_w -2120195262
      // 0a4: ldc_w 2104000665
      // 0a7: ixor
      // 0a8: invokestatic qeaa361f143ee4a0894bd168fd9b30c66/qf4ccf8f5435d4a78bdca4d6a018b578e/abaaabbba.a (II)I
      // 0ab: invokestatic qeaa361f143ee4a0894bd168fd9b30c66/qf4ccf8f5435d4a78bdca4d6a018b578e/abaaabbba.babab (II)Ljava/lang/String;
      // 0ae: invokestatic qeaa361f143ee4a0894bd168fd9b30c66/qf4ccf8f5435d4a78bdca4d6a018b578e/aabbaaaba.abba (Ljava/lang/String;)Ljava/lang/String;
      // 0b1: invokevirtual java/lang/String.endsWith (Ljava/lang/String;)Z
      // 0b4: iload 2
      // 0b5: ifne 0c4
      // 0b8: goto 0bc
      // 0bb: athrow
      // 0bc: ifeq 0c7
      // 0bf: goto 0c3
      // 0c2: athrow
      // 0c3: bipush 1
      // 0c4: goto 0c8
      // 0c7: bipush 0
      // 0c8: istore 4
      // 0ca: aload 3
      // 0cb: invokevirtual net/minecraft/class_1799.method_7909 ()Lnet/minecraft/class_1792;
      // 0ce: instanceof net/minecraft/class_1743
      // 0d1: istore 5
      // 0d3: aload 0
      // 0d4: getfield qeaa361f143ee4a0894bd168fd9b30c66/qf4ccf8f5435d4a78bdca4d6a018b578e/abaaabbba.bb Lqeaa361f143ee4a0894bd168fd9b30c66/qf4ccf8f5435d4a78bdca4d6a018b578e/abaabbbb;
      // 0d7: iload 2
      // 0d8: ifne 101
      // 0db: getstatic qeaa361f143ee4a0894bd168fd9b30c66/qf4ccf8f5435d4a78bdca4d6a018b578e/abaaabbba.aabba Lqeaa361f143ee4a0894bd168fd9b30c66/qf4ccf8f5435d4a78bdca4d6a018b578e/ababbbbaa;
      // 0de: invokevirtual qeaa361f143ee4a0894bd168fd9b30c66/qf4ccf8f5435d4a78bdca4d6a018b578e/abaabbbb.aaab (Lqeaa361f143ee4a0894bd168fd9b30c66/qf4ccf8f5435d4a78bdca4d6a018b578e/ababbbbaa;)Z
      // 0e1: ifeq 0f9
      // 0e4: goto 0e8
      // 0e7: athrow
      // 0e8: iload 4
      // 0ea: iload 2
      // 0eb: ifne 120
      // 0ee: goto 0f2
      // 0f1: athrow
      // 0f2: ifne 11f
      // 0f5: goto 0f9
      // 0f8: athrow
      // 0f9: aload 0
      // 0fa: getfield qeaa361f143ee4a0894bd168fd9b30c66/qf4ccf8f5435d4a78bdca4d6a018b578e/abaaabbba.bb Lqeaa361f143ee4a0894bd168fd9b30c66/qf4ccf8f5435d4a78bdca4d6a018b578e/abaabbbb;
      // 0fd: goto 101
      // 100: athrow
      // 101: getstatic qeaa361f143ee4a0894bd168fd9b30c66/qf4ccf8f5435d4a78bdca4d6a018b578e/abaaabbba.bbbb Lqeaa361f143ee4a0894bd168fd9b30c66/qf4ccf8f5435d4a78bdca4d6a018b578e/ababbbbaa;
      // 104: invokevirtual qeaa361f143ee4a0894bd168fd9b30c66/qf4ccf8f5435d4a78bdca4d6a018b578e/abaabbbb.aaab (Lqeaa361f143ee4a0894bd168fd9b30c66/qf4ccf8f5435d4a78bdca4d6a018b578e/ababbbbaa;)Z
      // 107: iload 2
      // 108: ifne 114
      // 10b: ifeq 123
      // 10e: goto 112
      // 111: athrow
      // 112: iload 5
      // 114: iload 2
      // 115: ifne 120
      // 118: ifeq 123
      // 11b: goto 11f
      // 11e: athrow
      // 11f: bipush 1
      // 120: goto 124
      // 123: bipush 0
      // 124: ireturn
   }

   private boolean baabb(class_310 param1, class_3965 param2) {
      // $VF: Couldn't be decompiled
      // Please report this to the Vineflower issue tracker, at https://github.com/Vineflower/vineflower/issues with a copy of the class file (if you have the rights to distribute it!)
      // java.lang.RuntimeException: parsing failure!
      //   at org.jetbrains.java.decompiler.modules.decompiler.decompose.DomHelper.parseGraph(DomHelper.java:211)
      //   at org.jetbrains.java.decompiler.main.rels.MethodProcessor.codeToJava(MethodProcessor.java:166)
      //
      // Bytecode:
      // 000: getstatic qeaa361f143ee4a0894bd168fd9b30c66/qf4ccf8f5435d4a78bdca4d6a018b578e/baaabbaa.bba I
      // 003: istore 3
      // 004: aload 1
      // 005: iload 3
      // 006: ifne 011
      // 009: ifnull 07b
      // 00c: goto 010
      // 00f: athrow
      // 010: aload 1
      // 011: iload 3
      // 012: ifne 024
      // 015: getfield net/minecraft/class_310.field_1724 Lnet/minecraft/class_746;
      // 018: ifnull 07b
      // 01b: goto 01f
      // 01e: athrow
      // 01f: aload 1
      // 020: goto 024
      // 023: athrow
      // 024: getfield net/minecraft/class_310.field_1687 Lnet/minecraft/class_638;
      // 027: ifnull 07b
      // 02a: aload 2
      // 02b: iload 3
      // 02c: ifne 03b
      // 02f: goto 033
      // 032: athrow
      // 033: ifnull 07b
      // 036: goto 03a
      // 039: athrow
      // 03a: aload 2
      // 03b: invokevirtual net/minecraft/class_3965.method_17783 ()Lnet/minecraft/class_239$class_240;
      // 03e: getstatic net/minecraft/class_239$class_240.field_1332 Lnet/minecraft/class_239$class_240;
      // 041: if_acmpne 07b
      // 044: aload 0
      // 045: aload 1
      // 046: aload 2
      // 047: invokevirtual net/minecraft/class_3965.method_17777 ()Lnet/minecraft/class_2338;
      // 04a: invokevirtual qeaa361f143ee4a0894bd168fd9b30c66/qf4ccf8f5435d4a78bdca4d6a018b578e/abaaabbba.aabbbb (Lnet/minecraft/class_310;Lnet/minecraft/class_2338;)Z
      // 04d: iload 3
      // 04e: ifne 07c
      // 051: goto 055
      // 054: athrow
      // 055: ifeq 07b
      // 058: goto 05c
      // 05b: athrow
      // 05c: aload 0
      // 05d: aload 1
      // 05e: aload 2
      // 05f: invokevirtual net/minecraft/class_3965.method_17777 ()Lnet/minecraft/class_2338;
      // 062: aload 2
      // 063: invokevirtual net/minecraft/class_3965.method_17780 ()Lnet/minecraft/class_2350;
      // 066: invokevirtual net/minecraft/class_2338.method_10093 (Lnet/minecraft/class_2350;)Lnet/minecraft/class_2338;
      // 069: invokevirtual qeaa361f143ee4a0894bd168fd9b30c66/qf4ccf8f5435d4a78bdca4d6a018b578e/abaaabbba.abbab (Lnet/minecraft/class_310;Lnet/minecraft/class_2338;)Z
      // 06c: iload 3
      // 06d: ifne 07c
      // 070: goto 074
      // 073: athrow
      // 074: ifne 07d
      // 077: goto 07b
      // 07a: athrow
      // 07b: bipush 0
      // 07c: ireturn
      // 07d: dconst_0
      // 07e: aload 1
      // 07f: getfield net/minecraft/class_310.field_1724 Lnet/minecraft/class_746;
      // 082: invokevirtual net/minecraft/class_746.method_55754 ()D
      // 085: ldc2_w 0.1
      // 088: dsub
      // 089: invokestatic java/lang/Math.max (DD)D
      // 08c: dstore 4
      // 08e: aload 1
      // 08f: getfield net/minecraft/class_310.field_1724 Lnet/minecraft/class_746;
      // 092: invokevirtual net/minecraft/class_746.method_33571 ()Lnet/minecraft/class_243;
      // 095: astore 6
      // 097: aload 6
      // 099: iload 3
      // 09a: ifne 0cb
      // 09d: aload 2
      // 09e: invokevirtual net/minecraft/class_3965.method_17784 ()Lnet/minecraft/class_243;
      // 0a1: invokevirtual net/minecraft/class_243.method_1025 (Lnet/minecraft/class_243;)D
      // 0a4: dload 4
      // 0a6: dload 4
      // 0a8: dmul
      // 0a9: dcmpl
      // 0aa: ifle 0b4
      // 0ad: goto 0b1
      // 0b0: athrow
      // 0b1: bipush 0
      // 0b2: ireturn
      // 0b3: athrow
      // 0b4: aload 2
      // 0b5: invokevirtual net/minecraft/class_3965.method_17784 ()Lnet/minecraft/class_243;
      // 0b8: aload 2
      // 0b9: invokevirtual net/minecraft/class_3965.method_17780 ()Lnet/minecraft/class_2350;
      // 0bc: invokevirtual net/minecraft/class_2350.method_62675 ()Lnet/minecraft/class_2382;
      // 0bf: invokestatic net/minecraft/class_243.method_24954 (Lnet/minecraft/class_2382;)Lnet/minecraft/class_243;
      // 0c2: ldc2_w 0.01
      // 0c5: invokevirtual net/minecraft/class_243.method_1021 (D)Lnet/minecraft/class_243;
      // 0c8: invokevirtual net/minecraft/class_243.method_1020 (Lnet/minecraft/class_243;)Lnet/minecraft/class_243;
      // 0cb: astore 7
      // 0cd: aload 1
      // 0ce: aload 1
      // 0cf: getfield net/minecraft/class_310.field_1724 Lnet/minecraft/class_746;
      // 0d2: aload 6
      // 0d4: aload 7
      // 0d6: invokestatic qeaa361f143ee4a0894bd168fd9b30c66/qf4ccf8f5435d4a78bdca4d6a018b578e/aabbabbbb.abba (Lnet/minecraft/class_310;Lnet/minecraft/class_1297;Lnet/minecraft/class_243;Lnet/minecraft/class_243;)Lnet/minecraft/class_3965;
      // 0d9: astore 8
      // 0db: aload 8
      // 0dd: iload 3
      // 0de: ifne 11f
      // 0e1: ifnull 0ff
      // 0e4: goto 0e8
      // 0e7: athrow
      // 0e8: aload 8
      // 0ea: iload 3
      // 0eb: ifne 123
      // 0ee: goto 0f2
      // 0f1: athrow
      // 0f2: invokevirtual net/minecraft/class_3965.method_17783 ()Lnet/minecraft/class_239$class_240;
      // 0f5: getstatic net/minecraft/class_239$class_240.field_1332 Lnet/minecraft/class_239$class_240;
      // 0f8: if_acmpeq 121
      // 0fb: goto 0ff
      // 0fe: athrow
      // 0ff: aload 1
      // 100: getfield net/minecraft/class_310.field_1687 Lnet/minecraft/class_638;
      // 103: new net/minecraft/class_3959
      // 106: dup
      // 107: aload 6
      // 109: aload 7
      // 10b: getstatic net/minecraft/class_3959$class_3960.field_17559 Lnet/minecraft/class_3959$class_3960;
      // 10e: getstatic net/minecraft/class_3959$class_242.field_1348 Lnet/minecraft/class_3959$class_242;
      // 111: aload 1
      // 112: getfield net/minecraft/class_310.field_1724 Lnet/minecraft/class_746;
      // 115: invokespecial net/minecraft/class_3959.<init> (Lnet/minecraft/class_243;Lnet/minecraft/class_243;Lnet/minecraft/class_3959$class_3960;Lnet/minecraft/class_3959$class_242;Lnet/minecraft/class_1297;)V
      // 118: invokevirtual net/minecraft/class_638.method_17742 (Lnet/minecraft/class_3959;)Lnet/minecraft/class_3965;
      // 11b: goto 11f
      // 11e: athrow
      // 11f: astore 8
      // 121: aload 8
      // 123: aload 2
      // 124: invokestatic qeaa361f143ee4a0894bd168fd9b30c66/qf4ccf8f5435d4a78bdca4d6a018b578e/abaaabbba.aaaab (Lnet/minecraft/class_3965;Lnet/minecraft/class_3965;)Z
      // 127: ireturn
   }

   private boolean babaa(class_310 param1, class_1309 param2, int param3) {
      // $VF: Couldn't be decompiled
      // Please report this to the Vineflower issue tracker, at https://github.com/Vineflower/vineflower/issues with a copy of the class file (if you have the rights to distribute it!)
      // java.lang.RuntimeException: parsing failure!
      //   at org.jetbrains.java.decompiler.modules.decompiler.decompose.DomHelper.parseGraph(DomHelper.java:211)
      //   at org.jetbrains.java.decompiler.main.rels.MethodProcessor.codeToJava(MethodProcessor.java:166)
      //
      // Bytecode:
      // 00: getstatic qeaa361f143ee4a0894bd168fd9b30c66/qf4ccf8f5435d4a78bdca4d6a018b578e/baaabbaa.bba I
      // 03: istore 4
      // 05: aload 1
      // 06: iload 4
      // 08: ifne 13
      // 0b: ifnull 6a
      // 0e: goto 12
      // 11: athrow
      // 12: aload 1
      // 13: iload 4
      // 15: ifne 27
      // 18: getfield net/minecraft/class_310.field_1724 Lnet/minecraft/class_746;
      // 1b: ifnull 6a
      // 1e: goto 22
      // 21: athrow
      // 22: aload 1
      // 23: goto 27
      // 26: athrow
      // 27: invokevirtual net/minecraft/class_310.method_1562 ()Lnet/minecraft/class_634;
      // 2a: ifnull 6a
      // 2d: aload 2
      // 2e: ifnull 6a
      // 31: goto 35
      // 34: athrow
      // 35: iload 3
      // 36: iload 4
      // 38: ifne 6f
      // 3b: goto 3f
      // 3e: athrow
      // 3f: iflt 6a
      // 42: goto 46
      // 45: athrow
      // 46: iload 3
      // 47: iload 4
      // 49: ifne 6f
      // 4c: goto 50
      // 4f: athrow
      // 50: ldc_w -439572892
      // 53: ldc_w -2123340576
      // 56: ldc_w 332241093
      // 59: ixor
      // 5a: invokestatic qeaa361f143ee4a0894bd168fd9b30c66/qf4ccf8f5435d4a78bdca4d6a018b578e/abaaabbba.a (II)I
      // 5d: ldc2_w 715137804382549189
      // 60: invokestatic qeaa361f143ee4a0894bd168fd9b30c66/qf4ccf8f5435d4a78bdca4d6a018b578e/abaaabbba.aaab (IJ)I
      // 63: if_icmplt 70
      // 66: goto 6a
      // 69: athrow
      // 6a: bipush 0
      // 6b: goto 6f
      // 6e: athrow
      // 6f: ireturn
      // 70: aload 0
      // 71: aload 2
      // 72: putfield qeaa361f143ee4a0894bd168fd9b30c66/qf4ccf8f5435d4a78bdca4d6a018b578e/abaaabbba.aab Lnet/minecraft/class_1309;
      // 75: aload 0
      // 76: iload 3
      // 77: putfield qeaa361f143ee4a0894bd168fd9b30c66/qf4ccf8f5435d4a78bdca4d6a018b578e/abaaabbba.aabaa I
      // 7a: aload 0
      // 7b: aload 1
      // 7c: getfield net/minecraft/class_310.field_1724 Lnet/minecraft/class_746;
      // 7f: invokevirtual net/minecraft/class_746.method_31548 ()Lnet/minecraft/class_1661;
      // 82: invokestatic qeaa361f143ee4a0894bd168fd9b30c66/qf4ccf8f5435d4a78bdca4d6a018b578e/aabbabbbb.abaabaa (Lnet/minecraft/class_1661;)I
      // 85: putfield qeaa361f143ee4a0894bd168fd9b30c66/qf4ccf8f5435d4a78bdca4d6a018b578e/abaaabbba.abaab I
      // 88: invokestatic java/lang/System.currentTimeMillis ()J
      // 8b: lstore 5
      // 8d: aload 0
      // 8e: getstatic qeaa361f143ee4a0894bd168fd9b30c66/qf4ccf8f5435d4a78bdca4d6a018b578e/aaabaaaba.ab Lqeaa361f143ee4a0894bd168fd9b30c66/qf4ccf8f5435d4a78bdca4d6a018b578e/aaabaaaba;
      // 91: putfield qeaa361f143ee4a0894bd168fd9b30c66/qf4ccf8f5435d4a78bdca4d6a018b578e/abaaabbba.bbbab Lqeaa361f143ee4a0894bd168fd9b30c66/qf4ccf8f5435d4a78bdca4d6a018b578e/aaabaaaba;
      // 94: aload 0
      // 95: lload 5
      // 97: putfield qeaa361f143ee4a0894bd168fd9b30c66/qf4ccf8f5435d4a78bdca4d6a018b578e/abaaabbba.babbb J
      // 9a: aload 1
      // 9b: invokestatic qeaa361f143ee4a0894bd168fd9b30c66/qf4ccf8f5435d4a78bdca4d6a018b578e/aabbabbbb.baabaab (Lnet/minecraft/class_310;)I
      // 9e: iload 4
      // a0: ifne b0
      // a3: iload 3
      // a4: if_icmpeq b3
      // a7: goto ab
      // aa: athrow
      // ab: bipush 1
      // ac: goto b0
      // af: athrow
      // b0: goto b4
      // b3: bipush 0
      // b4: istore 7
      // b6: aload 0
      // b7: iload 7
      // b9: ifeq cb
      // bc: lload 5
      // be: aload 0
      // bf: aload 0
      // c0: getfield qeaa361f143ee4a0894bd168fd9b30c66/qf4ccf8f5435d4a78bdca4d6a018b578e/abaaabbba.baaab Lqeaa361f143ee4a0894bd168fd9b30c66/qf4ccf8f5435d4a78bdca4d6a018b578e/aaabbbab;
      // c3: invokevirtual qeaa361f143ee4a0894bd168fd9b30c66/qf4ccf8f5435d4a78bdca4d6a018b578e/abaaabbba.bbaab (Lqeaa361f143ee4a0894bd168fd9b30c66/qf4ccf8f5435d4a78bdca4d6a018b578e/aaabbbab;)J
      // c6: ladd
      // c7: goto cd
      // ca: athrow
      // cb: lload 5
      // cd: putfield qeaa361f143ee4a0894bd168fd9b30c66/qf4ccf8f5435d4a78bdca4d6a018b578e/abaaabbba.abb J
      // d0: bipush 1
      // d1: ireturn
   }

   private static String babab(int var0, int var1) {
      int var9 = -2070235507;
      int var2 = (var0 ^ a(-439572893, var9 ^ 1954881119)) & a(-439572894, var9 ^ 1507552205);
      if (aabab[var2] == null) {
         char[] var3 = aabbb[var2].toCharArray();

         int var4 = switch (var3[0] & a(-439572895, var9 ^ -608827247)) {
            case 0 -> a(-439572896, var9 ^ 2123262493);
            case 1 -> a(-439572881, var9 ^ 1614495395);
            case 2 -> a(-439572882, var9 ^ -1755592);
            case 3 -> a(-439572883, var9 ^ -352441228);
            case 4 -> a(-439572884, var9 ^ -1884075060);
            case 5 -> a(-439572885, var9 ^ -1125501320);
            case 6 -> a(-439572886, var9 ^ 1364374844);
            case 7 -> a(-439572887, var9 ^ -2031641985);
            case 8 -> a(-439572888, var9 ^ 1436430374);
            case 9 -> a(-439572873, var9 ^ 925673504);
            case 10 -> a(-439572874, var9 ^ -1334421065);
            case 11 -> a(-439572875, var9 ^ -768668687);
            case 12 -> a(-439572876, var9 ^ 2099016534);
            case 13 -> a(-439572877, var9 ^ -403111460);
            case 14 -> a(-439572878, var9 ^ -595296733);
            case 15 -> a(-439572879, var9 ^ 126569430);
            case 16 -> a(-439572880, var9 ^ 2022089283);
            case 17 -> a(-439572865, var9 ^ 1753531340);
            case 18 -> a(-439572866, var9 ^ 594624455);
            case 19 -> a(-439572867, var9 ^ -1315677875);
            case 20 -> a(-439572868, var9 ^ 1195273897);
            case 21 -> a(-439572869, var9 ^ -1840391030);
            case 22 -> a(-439572870, var9 ^ 65508760);
            case 23 -> a(-439572871, var9 ^ 1697873690);
            case 24 -> a(-439572872, var9 ^ -1603781667);
            case 25 -> a(-439572857, var9 ^ -475922016);
            case 26 -> a(-439572858, var9 ^ -703321284);
            case 27 -> a(-439572859, var9 ^ -1310853389);
            case 28 -> a(-439572860, var9 ^ 1987348615);
            case 29 -> a(-439572861, var9 ^ -1161294922);
            case 30 -> a(-439572862, var9 ^ -1839668747);
            case 31 -> a(-439572863, var9 ^ -1462687012);
            case 32 -> a(-439572864, var9 ^ 450818571);
            case 33 -> a(-439572849, var9 ^ 877466053);
            case 34 -> a(-439572850, var9 ^ 1472997898);
            case 35 -> a(-439572851, var9 ^ -335571889);
            case 36 -> a(-439572852, var9 ^ -1258163926);
            case 37 -> a(-439572853, var9 ^ -456622713);
            case 38 -> a(-439572854, var9 ^ 43576145);
            case 39 -> a(-439572855, var9 ^ 1967348885);
            case 40 -> a(-439572856, var9 ^ -1792799638);
            case 41 -> a(-439572841, var9 ^ 1761205718);
            case 42 -> a(-439572842, var9 ^ 1620190856);
            case 43 -> a(-439572843, var9 ^ 1277237882);
            case 44 -> a(-439572844, var9 ^ -644835271);
            case 45 -> a(-439572845, var9 ^ -1869671160);
            case 46 -> a(-439572846, var9 ^ 1871773746);
            case 47 -> a(-439572847, var9 ^ -1744546215);
            case 48 -> a(-439572848, var9 ^ -1300905811);
            case 49 -> a(-439572833, var9 ^ -270289895);
            case 50 -> a(-439572834, var9 ^ -528661615);
            case 51 -> a(-439572835, var9 ^ 1020035705);
            case 52 -> a(-439572836, var9 ^ 1622396118);
            case 53 -> a(-439572837, var9 ^ -1819138902);
            case 54 -> a(-439572838, var9 ^ 2057253346);
            case 55 -> a(-439572839, var9 ^ -213144162);
            case 56 -> a(-439572840, var9 ^ -798056238);
            case 57 -> a(-439572825, var9 ^ 1442622052);
            case 58 -> a(-439572826, var9 ^ 1052654752);
            case 59 -> a(-439572827, var9 ^ -1954541004);
            case 60 -> a(-439572828, var9 ^ -1476018670);
            case 61 -> a(-439572829, var9 ^ -1294368974);
            case 62 -> a(-439572830, var9 ^ -1403631031);
            case 63 -> a(-439572831, var9 ^ -2094593206);
            case 64 -> a(-439572832, var9 ^ 1264745348);
            case 65 -> a(-439572817, var9 ^ -32882886);
            case 66 -> a(-439572818, var9 ^ -1788991264);
            case 67 -> a(-439572819, var9 ^ -259330276);
            case 68 -> a(-439572820, var9 ^ -1201203128);
            case 69 -> a(-439572821, var9 ^ -1337803350);
            case 70 -> a(-439572822, var9 ^ 924601575);
            case 71 -> a(-439572823, var9 ^ 1247530081);
            case 72 -> a(-439572824, var9 ^ 829289672);
            case 73 -> a(-439572809, var9 ^ 1359987932);
            case 74 -> a(-439572810, var9 ^ -446775427);
            case 75 -> a(-439572811, var9 ^ 99733705);
            case 76 -> a(-439572812, var9 ^ -88807562);
            case 77 -> a(-439572813, var9 ^ 884523496);
            case 78 -> a(-439572814, var9 ^ 697779132);
            case 79 -> a(-439572815, var9 ^ -1353752656);
            case 80 -> a(-439572816, var9 ^ -1197125782);
            case 81 -> a(-439572801, var9 ^ 1660945876);
            case 82 -> a(-439572802, var9 ^ -34591812);
            case 83 -> a(-439572803, var9 ^ -2054383907);
            case 84 -> a(-439572804, var9 ^ -1387031631);
            case 85 -> a(-439572805, var9 ^ 1407542130);
            case 86 -> a(-439572806, var9 ^ 1655084081);
            case 87 -> a(-439572807, var9 ^ -126985654);
            case 88 -> a(-439572808, var9 ^ -1452399036);
            case 89 -> a(-439572793, var9 ^ -1905253130);
            case 90 -> a(-439572794, var9 ^ 1594480810);
            case 91 -> a(-439572795, var9 ^ 1210206719);
            case 92 -> a(-439572796, var9 ^ 335466928);
            case 93 -> 4;
            case 94 -> a(-439572797, var9 ^ 1154866387);
            case 95 -> a(-439572798, var9 ^ -1769120802);
            case 96 -> a(-439572799, var9 ^ -512120791);
            case 97 -> a(-439572800, var9 ^ 102409044);
            case 98 -> a(-439572785, var9 ^ -1128314774);
            case 99 -> a(-439572786, var9 ^ -1774689415);
            case 100 -> a(-439572787, var9 ^ -61522262);
            case 101 -> a(-439572788, var9 ^ -974046239);
            case 102 -> a(-439572789, var9 ^ 251189166);
            case 103 -> a(-439572790, var9 ^ -1003828199);
            case 104 -> a(-439572791, var9 ^ -1852624245);
            case 105 -> a(-439572792, var9 ^ 1905133601);
            case 106 -> a(-439572777, var9 ^ 435086169);
            case 107 -> a(-439572778, var9 ^ 1466446136);
            case 108 -> a(-439572779, var9 ^ -1404086191);
            case 109 -> a(-439572780, var9 ^ 1642027704);
            case 110 -> 1;
            case 111 -> a(-439572781, var9 ^ 963596584);
            case 112 -> a(-439572782, var9 ^ 1007976567);
            case 113 -> a(-439572783, var9 ^ 1945270705);
            case 114 -> a(-439572784, var9 ^ -568733750);
            case 115 -> a(-439572769, var9 ^ 377230927);
            case 116 -> a(-439572770, var9 ^ -498789584);
            case 117 -> a(-439572771, var9 ^ -1557792396);
            case 118 -> a(-439572772, var9 ^ 859442319);
            case 119 -> a(-439572773, var9 ^ 91910029);
            case 120 -> a(-439572774, var9 ^ 553878107);
            case 121 -> a(-439572775, var9 ^ 1194940229);
            case 122 -> a(-439572776, var9 ^ 1259669277);
            case 123 -> a(-439572761, var9 ^ 744773187);
            case 124 -> a(-439572762, var9 ^ -1151804056);
            case 125 -> a(-439572763, var9 ^ -263252407);
            case 126 -> a(-439572764, var9 ^ -1085230679);
            case 127 -> a(-439572765, var9 ^ -1778378988);
            case 128 -> a(-439572766, var9 ^ 86420923);
            case 129 -> a(-439572767, var9 ^ -1579169356);
            case 130 -> a(-439572768, var9 ^ 972367028);
            case 131 -> a(-439572753, var9 ^ -807532579);
            case 132 -> a(-439572754, var9 ^ 137962797);
            case 133 -> a(-439572755, var9 ^ 1299980113);
            case 134 -> a(-439572756, var9 ^ 1666602028);
            case 135 -> a(-439572757, var9 ^ 1256384119);
            case 136 -> a(-439572758, var9 ^ -925380054);
            case 137 -> 0;
            case 138 -> a(-439572759, var9 ^ 1415887749);
            case 139 -> a(-439572760, var9 ^ -1994020072);
            case 140 -> 3;
            case 141 -> a(-439572745, var9 ^ -628451790);
            case 142 -> a(-439572746, var9 ^ 1102402252);
            case 143 -> a(-439572747, var9 ^ 1075724127);
            case 144 -> a(-439572748, var9 ^ 782930813);
            case 145 -> a(-439572749, var9 ^ 136980171);
            case 146 -> a(-439572750, var9 ^ -328510679);
            case 147 -> a(-439572751, var9 ^ -2089159995);
            case 148 -> a(-439572752, var9 ^ -1554230063);
            case 149 -> a(-439572737, var9 ^ -1746071845);
            case 150 -> a(-439572738, var9 ^ 895798244);
            case 151 -> a(-439572739, var9 ^ 1611710166);
            case 152 -> a(-439572740, var9 ^ -1219623985);
            case 153 -> a(-439572741, var9 ^ 301017351);
            case 154 -> a(-439572742, var9 ^ -1681358147);
            case 155 -> a(-439572743, var9 ^ -1433701058);
            case 156 -> a(-439572744, var9 ^ 587392300);
            case 157 -> a(-439572729, var9 ^ -1301071770);
            case 158 -> a(-439572730, var9 ^ -349450104);
            case 159 -> a(-439572731, var9 ^ 145900007);
            case 160 -> a(-439572732, var9 ^ -1614057999);
            case 161 -> a(-439572733, var9 ^ -710330334);
            case 162 -> a(-439572734, var9 ^ -342600649);
            case 163 -> a(-439572735, var9 ^ -11784630);
            case 164 -> a(-439572736, var9 ^ 1337896597);
            case 165 -> a(-439572721, var9 ^ -493105890);
            case 166 -> a(-439572722, var9 ^ 1258558948);
            case 167 -> a(-439572723, var9 ^ -1709386597);
            case 168 -> a(-439572724, var9 ^ 1860557863);
            case 169 -> a(-439572725, var9 ^ -1832258697);
            case 170 -> a(-439572726, var9 ^ -1456523468);
            case 171 -> a(-439572727, var9 ^ -1404648138);
            case 172 -> a(-439572728, var9 ^ 601537295);
            case 173 -> a(-439572713, var9 ^ 1122559906);
            case 174 -> a(-439572714, var9 ^ -72206837);
            case 175 -> a(-439572715, var9 ^ -1723348077);
            case 176 -> a(-439572716, var9 ^ 2108092290);
            case 177 -> a(-439572717, var9 ^ 664070760);
            case 178 -> a(-439572718, var9 ^ 718293370);
            case 179 -> a(-439572719, var9 ^ 37810676);
            case 180 -> a(-439572720, var9 ^ 805660760);
            case 181 -> a(-439572705, var9 ^ 2133495915);
            case 182 -> a(-439572706, var9 ^ -403140998);
            case 183 -> a(-439572707, var9 ^ 99516774);
            case 184 -> a(-439572708, var9 ^ -716154701);
            case 185 -> a(-439572709, var9 ^ -1398509432);
            case 186 -> a(-439572710, var9 ^ -2101083336);
            case 187 -> a(-439572711, var9 ^ -1261430788);
            case 188 -> a(-439572712, var9 ^ -287090183);
            case 189 -> a(-439572697, var9 ^ -581204281);
            case 190 -> a(-439572698, var9 ^ 1844992201);
            case 191 -> a(-439572699, var9 ^ -640472520);
            case 192 -> a(-439572700, var9 ^ 503311598);
            case 193 -> a(-439572701, var9 ^ -1993061449);
            case 194 -> a(-439572702, var9 ^ -842512805);
            case 195 -> a(-439572703, var9 ^ -1539003853);
            case 196 -> a(-439572704, var9 ^ -1855565755);
            case 197 -> a(-439572689, var9 ^ -1476429753);
            case 198 -> a(-439572690, var9 ^ -965791354);
            case 199 -> a(-439572691, var9 ^ 82360767);
            case 200 -> a(-439572692, var9 ^ -1650774906);
            case 201 -> a(-439572693, var9 ^ 1876763687);
            case 202 -> a(-439572694, var9 ^ 1483488234);
            case 203 -> a(-439572695, var9 ^ 1389276698);
            case 204 -> a(-439572696, var9 ^ 96505995);
            case 205 -> a(-439572681, var9 ^ -2142170037);
            case 206 -> a(-439572682, var9 ^ 380492576);
            case 207 -> a(-439572683, var9 ^ -1341752866);
            case 208 -> a(-439572684, var9 ^ -357594036);
            case 209 -> a(-439572685, var9 ^ -982076909);
            case 210 -> a(-439572686, var9 ^ -1845520398);
            case 211 -> a(-439572687, var9 ^ -1575313699);
            case 212 -> a(-439572688, var9 ^ -1567892676);
            case 213 -> a(-439572673, var9 ^ 344699897);
            case 214 -> a(-439572674, var9 ^ -2046767979);
            case 215 -> a(-439572675, var9 ^ -509454181);
            case 216 -> a(-439572676, var9 ^ -1577694864);
            case 217 -> a(-439572677, var9 ^ -873532468);
            case 218 -> a(-439572678, var9 ^ 71641761);
            case 219 -> a(-439572679, var9 ^ 225672618);
            case 220 -> a(-439572680, var9 ^ 1727176785);
            case 221 -> a(-439572665, var9 ^ 81664359);
            case 222 -> a(-439572666, var9 ^ 1513956643);
            case 223 -> a(-439572667, var9 ^ 996889465);
            case 224 -> a(-439572668, var9 ^ 244388480);
            case 225 -> a(-439572669, var9 ^ -2011975272);
            case 226 -> a(-439572670, var9 ^ -160132753);
            case 227 -> a(-439572671, var9 ^ -1361076029);
            case 228 -> a(-439572672, var9 ^ 1356479968);
            case 229 -> a(-439572657, var9 ^ 1588266828);
            case 230 -> 5;
            case 231 -> a(-439572658, var9 ^ 929404872);
            case 232 -> a(-439572659, var9 ^ -1109265156);
            case 233 -> a(-439572660, var9 ^ 1346089590);
            case 234 -> a(-439572661, var9 ^ -1114566151);
            case 235 -> a(-439572662, var9 ^ 1808439787);
            case 236 -> a(-439572663, var9 ^ 1217654710);
            case 237 -> a(-439572664, var9 ^ 922758223);
            case 238 -> a(-439572649, var9 ^ -1422226401);
            case 239 -> a(-439572650, var9 ^ -1140381752);
            case 240 -> a(-439572651, var9 ^ 2117822159);
            case 241 -> a(-439572652, var9 ^ 1833778322);
            case 242 -> a(-439572653, var9 ^ 334677792);
            case 243 -> a(-439572654, var9 ^ -466206626);
            case 244 -> a(-439572655, var9 ^ -1707252513);
            case 245 -> a(-439572656, var9 ^ -1173661860);
            case 246 -> a(-439572641, var9 ^ -800000827);
            case 247 -> a(-439572642, var9 ^ -1711478932);
            case 248 -> a(-439572643, var9 ^ -1004142208);
            case 249 -> a(-439572644, var9 ^ 185024902);
            case 250 -> a(-439572645, var9 ^ 1427619365);
            case 251 -> a(-439572646, var9 ^ -1588654943);
            case 252 -> a(-439572647, var9 ^ -137508501);
            case 253 -> a(-439572648, var9 ^ -44633658);
            case 254 -> 2;
            default -> a(-439572633, var9 ^ -1801717359);
         };
         int var5 = (var1 & a(-439572634, var9 ^ 787757683)) - var4;
         if (var5 < 0) {
            var5 += 256;
         }

         int var6 = ((var1 & a(-439572635, var9 ^ 101116041)) >>> a(-439572636, var9 ^ 330262384)) - var4;
         if (var6 < 0) {
            var6 += 256;
         }

         for (int var7 = 0; var7 < var3.length; var7++) {
            int var8 = var7 % 2;
            char var10002 = var3[var7];
            if (var8 == 0) {
               var3[var7] = (char)(var10002 ^ var5);
               var5 = ((var5 >>> 3 | var5 << 5) ^ var3[var7]) & a(-439572637, var9 ^ 160909452);
            } else {
               var3[var7] = (char)(var10002 ^ var6);
               var6 = ((var6 >>> 3 | var6 << 5) ^ var3[var7]) & a(-439572638, var9 ^ -28607875);
            }
         }

         aabab[var2] = new String(var3).intern();
      }

      return aabab[var2];
   }

   public boolean babba() {
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
      // 06: ifne 1b
      // 09: getfield qeaa361f143ee4a0894bd168fd9b30c66/qf4ccf8f5435d4a78bdca4d6a018b578e/abaaabbba.bbbab Lqeaa361f143ee4a0894bd168fd9b30c66/qf4ccf8f5435d4a78bdca4d6a018b578e/aaabaaaba;
      // 0c: getstatic qeaa361f143ee4a0894bd168fd9b30c66/qf4ccf8f5435d4a78bdca4d6a018b578e/aaabaaaba.abb Lqeaa361f143ee4a0894bd168fd9b30c66/qf4ccf8f5435d4a78bdca4d6a018b578e/aaabaaaba;
      // 0f: if_acmpne 29
      // 12: goto 16
      // 15: athrow
      // 16: aload 0
      // 17: goto 1b
      // 1a: athrow
      // 1b: getfield qeaa361f143ee4a0894bd168fd9b30c66/qf4ccf8f5435d4a78bdca4d6a018b578e/abaaabbba.bbaab Z
      // 1e: iload 1
      // 1f: ifne 2a
      // 22: ifeq 2d
      // 25: goto 29
      // 28: athrow
      // 29: bipush 1
      // 2a: goto 2e
      // 2d: bipush 0
      // 2e: ireturn
   }

   private boolean babbb(class_310 param1, class_1309 param2, int param3) {
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
      // 06: iload 4
      // 08: ifne 1c
      // 0b: aload 1
      // 0c: aload 2
      // 0d: iload 3
      // 0e: invokevirtual qeaa361f143ee4a0894bd168fd9b30c66/qf4ccf8f5435d4a78bdca4d6a018b578e/abaaabbba.babaa (Lnet/minecraft/class_310;Lnet/minecraft/class_1309;I)Z
      // 11: ifne 1b
      // 14: goto 18
      // 17: athrow
      // 18: bipush 0
      // 19: ireturn
      // 1a: athrow
      // 1b: aload 0
      // 1c: aload 1
      // 1d: invokevirtual qeaa361f143ee4a0894bd168fd9b30c66/qf4ccf8f5435d4a78bdca4d6a018b578e/abaaabbba.aaaa (Lnet/minecraft/class_310;)V
      // 20: bipush 1
      // 21: ireturn
   }

   public boolean bbaaa() {
      return this.ababab();
   }

   private long bbaab(aaabbbab var1) {
      double var4 = var1.bab();
      double var10000 = var4;
      double var2;
      double var10001 = var2 = var1.abb();

      try {
         if (var10000 == var10001) {
            return Math.max(0L, Math.round(var4));
         }
      } catch (MatchException var6) {
         throw var6;
      }

      return Math.max(0L, Math.round(ThreadLocalRandom.current().nextDouble(var4, var2)));
   }

   private void bbaba(class_310 param1, class_1309 param2, long param3) {
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
      // 006: iload 5
      // 008: ifne 085
      // 00b: getfield qeaa361f143ee4a0894bd168fd9b30c66/qf4ccf8f5435d4a78bdca4d6a018b578e/abaaabbba.babba Lqeaa361f143ee4a0894bd168fd9b30c66/qf4ccf8f5435d4a78bdca4d6a018b578e/abbaaaaa;
      // 00e: invokevirtual qeaa361f143ee4a0894bd168fd9b30c66/qf4ccf8f5435d4a78bdca4d6a018b578e/abbaaaaa.abbb ()Ljava/lang/Object;
      // 011: checkcast java/lang/Boolean
      // 014: invokevirtual java/lang/Boolean.booleanValue ()Z
      // 017: ifeq 084
      // 01a: goto 01e
      // 01d: athrow
      // 01e: aload 1
      // 01f: iload 5
      // 021: ifne 030
      // 024: goto 028
      // 027: athrow
      // 028: ifnull 084
      // 02b: goto 02f
      // 02e: athrow
      // 02f: aload 1
      // 030: getfield net/minecraft/class_310.field_1724 Lnet/minecraft/class_746;
      // 033: iload 5
      // 035: ifne 040
      // 038: ifnull 084
      // 03b: goto 03f
      // 03e: athrow
      // 03f: aload 2
      // 040: iload 5
      // 042: ifne 056
      // 045: ifnull 084
      // 048: goto 04c
      // 04b: athrow
      // 04c: aload 2
      // 04d: iload 5
      // 04f: ifne 061
      // 052: goto 056
      // 055: athrow
      // 056: invokevirtual net/minecraft/class_1309.method_5805 ()Z
      // 059: ifeq 084
      // 05c: aload 2
      // 05d: goto 061
      // 060: athrow
      // 061: invokestatic qeaa361f143ee4a0894bd168fd9b30c66/qf4ccf8f5435d4a78bdca4d6a018b578e/aabbabbbb.baabaaa (Lnet/minecraft/class_1297;)Z
      // 064: iload 5
      // 066: ifne 081
      // 069: ifne 084
      // 06c: goto 070
      // 06f: athrow
      // 070: aload 0
      // 071: iload 5
      // 073: ifne 08b
      // 076: goto 07a
      // 079: athrow
      // 07a: invokevirtual qeaa361f143ee4a0894bd168fd9b30c66/qf4ccf8f5435d4a78bdca4d6a018b578e/abaaabbba.aaabb ()Z
      // 07d: goto 081
      // 080: athrow
      // 081: ifne 08a
      // 084: aload 0
      // 085: lload 3
      // 086: invokevirtual qeaa361f143ee4a0894bd168fd9b30c66/qf4ccf8f5435d4a78bdca4d6a018b578e/abaaabbba.aaaaaa (J)V
      // 089: return
      // 08a: aload 0
      // 08b: aload 1
      // 08c: invokevirtual qeaa361f143ee4a0894bd168fd9b30c66/qf4ccf8f5435d4a78bdca4d6a018b578e/abaaabbba.aabaab (Lnet/minecraft/class_310;)I
      // 08f: istore 6
      // 091: iload 5
      // 093: ifne 0e6
      // 096: iload 6
      // 098: ifge 0a6
      // 09b: goto 09f
      // 09e: athrow
      // 09f: aload 0
      // 0a0: lload 3
      // 0a1: invokevirtual qeaa361f143ee4a0894bd168fd9b30c66/qf4ccf8f5435d4a78bdca4d6a018b578e/abaaabbba.aaaaaa (J)V
      // 0a4: return
      // 0a5: athrow
      // 0a6: aload 0
      // 0a7: invokevirtual qeaa361f143ee4a0894bd168fd9b30c66/qf4ccf8f5435d4a78bdca4d6a018b578e/abaaabbba.bbb ()V
      // 0aa: aload 0
      // 0ab: aload 2
      // 0ac: putfield qeaa361f143ee4a0894bd168fd9b30c66/qf4ccf8f5435d4a78bdca4d6a018b578e/abaaabbba.aab Lnet/minecraft/class_1309;
      // 0af: aload 0
      // 0b0: iload 6
      // 0b2: putfield qeaa361f143ee4a0894bd168fd9b30c66/qf4ccf8f5435d4a78bdca4d6a018b578e/abaaabbba.aabb I
      // 0b5: aload 0
      // 0b6: aload 2
      // 0b7: invokevirtual net/minecraft/class_1309.method_5628 ()I
      // 0ba: putfield qeaa361f143ee4a0894bd168fd9b30c66/qf4ccf8f5435d4a78bdca4d6a018b578e/abaaabbba.aaabb I
      // 0bd: aload 0
      // 0be: aload 1
      // 0bf: getfield net/minecraft/class_310.field_1724 Lnet/minecraft/class_746;
      // 0c2: invokevirtual net/minecraft/class_746.method_36454 ()F
      // 0c5: putfield qeaa361f143ee4a0894bd168fd9b30c66/qf4ccf8f5435d4a78bdca4d6a018b578e/abaaabbba.bbabb F
      // 0c8: aload 0
      // 0c9: getstatic net/minecraft/class_243.field_1353 Lnet/minecraft/class_243;
      // 0cc: putfield qeaa361f143ee4a0894bd168fd9b30c66/qf4ccf8f5435d4a78bdca4d6a018b578e/abaaabbba.aaa Lnet/minecraft/class_243;
      // 0cf: aload 0
      // 0d0: ldc_w -439572639
      // 0d3: ldc_w 615188242
      // 0d6: ldc_w 1640474606
      // 0d9: ixor
      // 0da: invokestatic qeaa361f143ee4a0894bd168fd9b30c66/qf4ccf8f5435d4a78bdca4d6a018b578e/abaaabbba.a (II)I
      // 0dd: ldc2_w 8615054350502259678
      // 0e0: invokestatic qeaa361f143ee4a0894bd168fd9b30c66/qf4ccf8f5435d4a78bdca4d6a018b578e/abaaabbba.aaab (IJ)I
      // 0e3: putfield qeaa361f143ee4a0894bd168fd9b30c66/qf4ccf8f5435d4a78bdca4d6a018b578e/abaaabbba.baaaa I
      // 0e6: aload 0
      // 0e7: aload 1
      // 0e8: aload 2
      // 0e9: invokevirtual qeaa361f143ee4a0894bd168fd9b30c66/qf4ccf8f5435d4a78bdca4d6a018b578e/abaaabbba.aaba (Lnet/minecraft/class_310;Lnet/minecraft/class_1309;)Lqeaa361f143ee4a0894bd168fd9b30c66/qf4ccf8f5435d4a78bdca4d6a018b578e/aabaaabab;
      // 0ec: astore 7
      // 0ee: iload 5
      // 0f0: ifne 122
      // 0f3: aload 7
      // 0f5: ifnonnull 107
      // 0f8: goto 0fc
      // 0fb: athrow
      // 0fc: aload 0
      // 0fd: invokevirtual qeaa361f143ee4a0894bd168fd9b30c66/qf4ccf8f5435d4a78bdca4d6a018b578e/abaaabbba.abbbb ()V
      // 100: aload 0
      // 101: lload 3
      // 102: invokevirtual qeaa361f143ee4a0894bd168fd9b30c66/qf4ccf8f5435d4a78bdca4d6a018b578e/abaaabbba.aaaaaa (J)V
      // 105: return
      // 106: athrow
      // 107: aload 0
      // 108: aload 7
      // 10a: invokevirtual qeaa361f143ee4a0894bd168fd9b30c66/qf4ccf8f5435d4a78bdca4d6a018b578e/aabaaabab.ab ()Lnet/minecraft/class_2338;
      // 10d: putfield qeaa361f143ee4a0894bd168fd9b30c66/qf4ccf8f5435d4a78bdca4d6a018b578e/abaaabbba.babaa Lnet/minecraft/class_2338;
      // 110: aload 0
      // 111: aload 7
      // 113: invokevirtual qeaa361f143ee4a0894bd168fd9b30c66/qf4ccf8f5435d4a78bdca4d6a018b578e/aabaaabab.a ()Lnet/minecraft/class_243;
      // 116: putfield qeaa361f143ee4a0894bd168fd9b30c66/qf4ccf8f5435d4a78bdca4d6a018b578e/abaaabbba.aaaaab Lnet/minecraft/class_243;
      // 119: aload 0
      // 11a: aload 7
      // 11c: invokevirtual qeaa361f143ee4a0894bd168fd9b30c66/qf4ccf8f5435d4a78bdca4d6a018b578e/aabaaabab.b ()Lnet/minecraft/class_3965;
      // 11f: putfield qeaa361f143ee4a0894bd168fd9b30c66/qf4ccf8f5435d4a78bdca4d6a018b578e/abaaabbba.bab Lnet/minecraft/class_3965;
      // 122: aload 0
      // 123: iload 5
      // 125: ifne 148
      // 128: getfield qeaa361f143ee4a0894bd168fd9b30c66/qf4ccf8f5435d4a78bdca4d6a018b578e/abaaabbba.aaaab Lqeaa361f143ee4a0894bd168fd9b30c66/qf4ccf8f5435d4a78bdca4d6a018b578e/abbaaaaa;
      // 12b: invokevirtual qeaa361f143ee4a0894bd168fd9b30c66/qf4ccf8f5435d4a78bdca4d6a018b578e/abbaaaaa.abbb ()Ljava/lang/Object;
      // 12e: checkcast java/lang/Boolean
      // 131: invokevirtual java/lang/Boolean.booleanValue ()Z
      // 134: ifne 147
      // 137: goto 13b
      // 13a: athrow
      // 13b: aload 1
      // 13c: aload 0
      // 13d: getstatic qeaa361f143ee4a0894bd168fd9b30c66/qf4ccf8f5435d4a78bdca4d6a018b578e/abbaaabba.ab Lqeaa361f143ee4a0894bd168fd9b30c66/qf4ccf8f5435d4a78bdca4d6a018b578e/abbaaabba;
      // 140: invokestatic qeaa361f143ee4a0894bd168fd9b30c66/qf4ccf8f5435d4a78bdca4d6a018b578e/aabbabbbb.bbaaabb (Lnet/minecraft/class_310;Ljava/lang/Object;Lqeaa361f143ee4a0894bd168fd9b30c66/qf4ccf8f5435d4a78bdca4d6a018b578e/abbaaabba;)V
      // 143: goto 147
      // 146: athrow
      // 147: aload 0
      // 148: aconst_null
      // 149: putfield qeaa361f143ee4a0894bd168fd9b30c66/qf4ccf8f5435d4a78bdca4d6a018b578e/abaaabbba.bbab Lqeaa361f143ee4a0894bd168fd9b30c66/qf4ccf8f5435d4a78bdca4d6a018b578e/bbbbaaaa;
      // 14c: aload 1
      // 14d: invokestatic qeaa361f143ee4a0894bd168fd9b30c66/qf4ccf8f5435d4a78bdca4d6a018b578e/aabbabbbb.baabaab (Lnet/minecraft/class_310;)I
      // 150: iload 5
      // 152: ifne 163
      // 155: iload 6
      // 157: if_icmpeq 166
      // 15a: goto 15e
      // 15d: athrow
      // 15e: bipush 1
      // 15f: goto 163
      // 162: athrow
      // 163: goto 167
      // 166: bipush 0
      // 167: istore 8
      // 169: aload 0
      // 16a: iload 8
      // 16c: ifeq 176
      // 16f: getstatic qeaa361f143ee4a0894bd168fd9b30c66/qf4ccf8f5435d4a78bdca4d6a018b578e/aaabaaaba.ba Lqeaa361f143ee4a0894bd168fd9b30c66/qf4ccf8f5435d4a78bdca4d6a018b578e/aaabaaaba;
      // 172: goto 179
      // 175: athrow
      // 176: getstatic qeaa361f143ee4a0894bd168fd9b30c66/qf4ccf8f5435d4a78bdca4d6a018b578e/aaabaaaba.aaa Lqeaa361f143ee4a0894bd168fd9b30c66/qf4ccf8f5435d4a78bdca4d6a018b578e/aaabaaaba;
      // 179: putfield qeaa361f143ee4a0894bd168fd9b30c66/qf4ccf8f5435d4a78bdca4d6a018b578e/abaaabbba.bbbab Lqeaa361f143ee4a0894bd168fd9b30c66/qf4ccf8f5435d4a78bdca4d6a018b578e/aaabaaaba;
      // 17c: aload 0
      // 17d: iload 5
      // 17f: ifne 194
      // 182: lload 3
      // 183: putfield qeaa361f143ee4a0894bd168fd9b30c66/qf4ccf8f5435d4a78bdca4d6a018b578e/abaaabbba.babbb J
      // 186: iload 8
      // 188: ifeq 19e
      // 18b: goto 18f
      // 18e: athrow
      // 18f: aload 0
      // 190: goto 194
      // 193: athrow
      // 194: aload 0
      // 195: getfield qeaa361f143ee4a0894bd168fd9b30c66/qf4ccf8f5435d4a78bdca4d6a018b578e/abaaabbba.baaab Lqeaa361f143ee4a0894bd168fd9b30c66/qf4ccf8f5435d4a78bdca4d6a018b578e/aaabbbab;
      // 198: invokevirtual qeaa361f143ee4a0894bd168fd9b30c66/qf4ccf8f5435d4a78bdca4d6a018b578e/abaaabbba.bbaab (Lqeaa361f143ee4a0894bd168fd9b30c66/qf4ccf8f5435d4a78bdca4d6a018b578e/aaabbbab;)J
      // 19b: goto 19f
      // 19e: lconst_0
      // 19f: lstore 9
      // 1a1: aload 0
      // 1a2: iload 5
      // 1a4: ifne 1bc
      // 1a7: lload 3
      // 1a8: lload 9
      // 1aa: ladd
      // 1ab: putfield qeaa361f143ee4a0894bd168fd9b30c66/qf4ccf8f5435d4a78bdca4d6a018b578e/abaaabbba.abb J
      // 1ae: iload 8
      // 1b0: ifeq 1c8
      // 1b3: goto 1b7
      // 1b6: athrow
      // 1b7: aload 0
      // 1b8: goto 1bc
      // 1bb: athrow
      // 1bc: aload 1
      // 1bd: aload 0
      // 1be: iload 6
      // 1c0: bipush 0
      // 1c1: bipush 1
      // 1c2: invokestatic qeaa361f143ee4a0894bd168fd9b30c66/qf4ccf8f5435d4a78bdca4d6a018b578e/aabbabbbb.aaabaa (Lnet/minecraft/class_310;Ljava/lang/Object;IIZ)Lqeaa361f143ee4a0894bd168fd9b30c66/qf4ccf8f5435d4a78bdca4d6a018b578e/bbbbaaaa;
      // 1c5: putfield qeaa361f143ee4a0894bd168fd9b30c66/qf4ccf8f5435d4a78bdca4d6a018b578e/abaaabbba.bbab Lqeaa361f143ee4a0894bd168fd9b30c66/qf4ccf8f5435d4a78bdca4d6a018b578e/bbbbaaaa;
      // 1c8: return
   }

   private boolean bbabb(class_310 param1, int param2) {
      // $VF: Couldn't be decompiled
      // Please report this to the Vineflower issue tracker, at https://github.com/Vineflower/vineflower/issues with a copy of the class file (if you have the rights to distribute it!)
      // java.lang.RuntimeException: parsing failure!
      //   at org.jetbrains.java.decompiler.modules.decompiler.decompose.DomHelper.parseGraph(DomHelper.java:211)
      //   at org.jetbrains.java.decompiler.main.rels.MethodProcessor.codeToJava(MethodProcessor.java:166)
      //
      // Bytecode:
      // 000: getstatic qeaa361f143ee4a0894bd168fd9b30c66/qf4ccf8f5435d4a78bdca4d6a018b578e/baaabbaa.bba I
      // 003: istore 3
      // 004: aload 1
      // 005: iload 3
      // 006: ifne 011
      // 009: ifnull 04a
      // 00c: goto 010
      // 00f: athrow
      // 010: aload 1
      // 011: getfield net/minecraft/class_310.field_1724 Lnet/minecraft/class_746;
      // 014: ifnull 04a
      // 017: iload 2
      // 018: iload 3
      // 019: ifne 04f
      // 01c: goto 020
      // 01f: athrow
      // 020: iflt 04a
      // 023: goto 027
      // 026: athrow
      // 027: iload 2
      // 028: iload 3
      // 029: ifne 05c
      // 02c: goto 030
      // 02f: athrow
      // 030: ldc_w -439572640
      // 033: ldc_w -840706471
      // 036: ldc_w 305897242
      // 039: ixor
      // 03a: invokestatic qeaa361f143ee4a0894bd168fd9b30c66/qf4ccf8f5435d4a78bdca4d6a018b578e/abaaabbba.a (II)I
      // 03d: ldc2_w 6490852206258371771
      // 040: invokestatic qeaa361f143ee4a0894bd168fd9b30c66/qf4ccf8f5435d4a78bdca4d6a018b578e/abaaabbba.aaab (IJ)I
      // 043: if_icmplt 050
      // 046: goto 04a
      // 049: athrow
      // 04a: bipush 0
      // 04b: goto 04f
      // 04e: athrow
      // 04f: ireturn
      // 050: aload 1
      // 051: iload 3
      // 052: ifne 07d
      // 055: invokestatic qeaa361f143ee4a0894bd168fd9b30c66/qf4ccf8f5435d4a78bdca4d6a018b578e/aabbabbbb.baabaab (Lnet/minecraft/class_310;)I
      // 058: goto 05c
      // 05b: athrow
      // 05c: iload 2
      // 05d: if_icmpne 07c
      // 060: aload 1
      // 061: iload 3
      // 062: ifne 07d
      // 065: goto 069
      // 068: athrow
      // 069: iload 2
      // 06a: invokestatic qeaa361f143ee4a0894bd168fd9b30c66/qf4ccf8f5435d4a78bdca4d6a018b578e/aabbabbbb.abaaa (Lnet/minecraft/class_310;I)Z
      // 06d: ifeq 07c
      // 070: goto 074
      // 073: athrow
      // 074: aload 0
      // 075: aconst_null
      // 076: putfield qeaa361f143ee4a0894bd168fd9b30c66/qf4ccf8f5435d4a78bdca4d6a018b578e/abaaabbba.bbab Lqeaa361f143ee4a0894bd168fd9b30c66/qf4ccf8f5435d4a78bdca4d6a018b578e/bbbbaaaa;
      // 079: bipush 1
      // 07a: ireturn
      // 07b: athrow
      // 07c: aload 1
      // 07d: invokestatic qeaa361f143ee4a0894bd168fd9b30c66/qf4ccf8f5435d4a78bdca4d6a018b578e/aabbabbbb.abaaaab (Lnet/minecraft/class_310;)Z
      // 080: iload 3
      // 081: ifne 0bc
      // 084: ifne 0b7
      // 087: goto 08b
      // 08a: athrow
      // 08b: invokestatic qeaa361f143ee4a0894bd168fd9b30c66/qf4ccf8f5435d4a78bdca4d6a018b578e/aabbabbbb.abbbabb ()Z
      // 08e: iload 3
      // 08f: ifne 0bc
      // 092: goto 096
      // 095: athrow
      // 096: ifne 0b7
      // 099: goto 09d
      // 09c: athrow
      // 09d: aload 1
      // 09e: getfield net/minecraft/class_310.field_1724 Lnet/minecraft/class_746;
      // 0a1: getfield net/minecraft/class_746.field_6012 I
      // 0a4: iload 3
      // 0a5: ifne 0bc
      // 0a8: goto 0ac
      // 0ab: athrow
      // 0ac: aload 0
      // 0ad: getfield qeaa361f143ee4a0894bd168fd9b30c66/qf4ccf8f5435d4a78bdca4d6a018b578e/abaaabbba.aaaa I
      // 0b0: if_icmpgt 0bd
      // 0b3: goto 0b7
      // 0b6: athrow
      // 0b7: bipush 0
      // 0b8: goto 0bc
      // 0bb: athrow
      // 0bc: ireturn
      // 0bd: aload 0
      // 0be: iload 3
      // 0bf: ifne 0fa
      // 0c2: getfield qeaa361f143ee4a0894bd168fd9b30c66/qf4ccf8f5435d4a78bdca4d6a018b578e/abaaabbba.bbab Lqeaa361f143ee4a0894bd168fd9b30c66/qf4ccf8f5435d4a78bdca4d6a018b578e/bbbbaaaa;
      // 0c5: ifnull 0f9
      // 0c8: goto 0cc
      // 0cb: athrow
      // 0cc: aload 0
      // 0cd: iload 3
      // 0ce: ifne 0fa
      // 0d1: goto 0d5
      // 0d4: athrow
      // 0d5: getfield qeaa361f143ee4a0894bd168fd9b30c66/qf4ccf8f5435d4a78bdca4d6a018b578e/abaaabbba.bbab Lqeaa361f143ee4a0894bd168fd9b30c66/qf4ccf8f5435d4a78bdca4d6a018b578e/bbbbaaaa;
      // 0d8: invokevirtual qeaa361f143ee4a0894bd168fd9b30c66/qf4ccf8f5435d4a78bdca4d6a018b578e/bbbbaaaa.aa ()I
      // 0db: iload 2
      // 0dc: if_icmpne 0f9
      // 0df: goto 0e3
      // 0e2: athrow
      // 0e3: aload 0
      // 0e4: getfield qeaa361f143ee4a0894bd168fd9b30c66/qf4ccf8f5435d4a78bdca4d6a018b578e/abaaabbba.bbab Lqeaa361f143ee4a0894bd168fd9b30c66/qf4ccf8f5435d4a78bdca4d6a018b578e/bbbbaaaa;
      // 0e7: invokevirtual qeaa361f143ee4a0894bd168fd9b30c66/qf4ccf8f5435d4a78bdca4d6a018b578e/bbbbaaaa.b ()Z
      // 0ea: iload 3
      // 0eb: ifne 10d
      // 0ee: goto 0f2
      // 0f1: athrow
      // 0f2: ifne 105
      // 0f5: goto 0f9
      // 0f8: athrow
      // 0f9: aload 0
      // 0fa: aload 1
      // 0fb: aload 0
      // 0fc: iload 2
      // 0fd: bipush 0
      // 0fe: bipush 1
      // 0ff: invokestatic qeaa361f143ee4a0894bd168fd9b30c66/qf4ccf8f5435d4a78bdca4d6a018b578e/aabbabbbb.aaabaa (Lnet/minecraft/class_310;Ljava/lang/Object;IIZ)Lqeaa361f143ee4a0894bd168fd9b30c66/qf4ccf8f5435d4a78bdca4d6a018b578e/bbbbaaaa;
      // 102: putfield qeaa361f143ee4a0894bd168fd9b30c66/qf4ccf8f5435d4a78bdca4d6a018b578e/abaaabbba.bbab Lqeaa361f143ee4a0894bd168fd9b30c66/qf4ccf8f5435d4a78bdca4d6a018b578e/bbbbaaaa;
      // 105: aload 1
      // 106: aload 0
      // 107: getfield qeaa361f143ee4a0894bd168fd9b30c66/qf4ccf8f5435d4a78bdca4d6a018b578e/abaaabbba.bbab Lqeaa361f143ee4a0894bd168fd9b30c66/qf4ccf8f5435d4a78bdca4d6a018b578e/bbbbaaaa;
      // 10a: invokestatic qeaa361f143ee4a0894bd168fd9b30c66/qf4ccf8f5435d4a78bdca4d6a018b578e/aabbabbbb.abbbba (Lnet/minecraft/class_310;Lqeaa361f143ee4a0894bd168fd9b30c66/qf4ccf8f5435d4a78bdca4d6a018b578e/bbbbaaaa;)Z
      // 10d: iload 3
      // 10e: ifne 121
      // 111: ifne 11b
      // 114: goto 118
      // 117: athrow
      // 118: bipush 0
      // 119: ireturn
      // 11a: athrow
      // 11b: aload 0
      // 11c: aconst_null
      // 11d: putfield qeaa361f143ee4a0894bd168fd9b30c66/qf4ccf8f5435d4a78bdca4d6a018b578e/abaaabbba.bbab Lqeaa361f143ee4a0894bd168fd9b30c66/qf4ccf8f5435d4a78bdca4d6a018b578e/bbbbaaaa;
      // 120: bipush 1
      // 121: ireturn
   }

   private boolean bbbaa(class_310 param1) {
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
      // 05: getfield qeaa361f143ee4a0894bd168fd9b30c66/qf4ccf8f5435d4a78bdca4d6a018b578e/abaaabbba.babba Lqeaa361f143ee4a0894bd168fd9b30c66/qf4ccf8f5435d4a78bdca4d6a018b578e/abbaaaaa;
      // 08: invokevirtual qeaa361f143ee4a0894bd168fd9b30c66/qf4ccf8f5435d4a78bdca4d6a018b578e/abbaaaaa.abbb ()Ljava/lang/Object;
      // 0b: checkcast java/lang/Boolean
      // 0e: invokevirtual java/lang/Boolean.booleanValue ()Z
      // 11: ifeq ad
      // 14: aload 1
      // 15: iload 2
      // 16: ifne 25
      // 19: goto 1d
      // 1c: athrow
      // 1d: ifnull ad
      // 20: goto 24
      // 23: athrow
      // 24: aload 1
      // 25: iload 2
      // 26: ifne 38
      // 29: getfield net/minecraft/class_310.field_1724 Lnet/minecraft/class_746;
      // 2c: ifnull ad
      // 2f: goto 33
      // 32: athrow
      // 33: aload 1
      // 34: goto 38
      // 37: athrow
      // 38: iload 2
      // 39: ifne 4b
      // 3c: getfield net/minecraft/class_310.field_1687 Lnet/minecraft/class_638;
      // 3f: ifnull ad
      // 42: goto 46
      // 45: athrow
      // 46: aload 1
      // 47: goto 4b
      // 4a: athrow
      // 4b: getfield net/minecraft/class_310.field_1761 Lnet/minecraft/class_636;
      // 4e: ifnull ad
      // 51: aload 0
      // 52: iload 2
      // 53: ifne 69
      // 56: goto 5a
      // 59: athrow
      // 5a: getfield qeaa361f143ee4a0894bd168fd9b30c66/qf4ccf8f5435d4a78bdca4d6a018b578e/abaaabbba.aabb I
      // 5d: iflt ad
      // 60: goto 64
      // 63: athrow
      // 64: aload 0
      // 65: goto 69
      // 68: athrow
      // 69: iload 2
      // 6a: ifne 8f
      // 6d: getfield qeaa361f143ee4a0894bd168fd9b30c66/qf4ccf8f5435d4a78bdca4d6a018b578e/abaaabbba.aabb I
      // 70: ldc_w -439572625
      // 73: ldc_w 1242673318
      // 76: ldc_w 279880847
      // 79: ixor
      // 7a: invokestatic qeaa361f143ee4a0894bd168fd9b30c66/qf4ccf8f5435d4a78bdca4d6a018b578e/abaaabbba.a (II)I
      // 7d: ldc2_w 715137804382549189
      // 80: invokestatic qeaa361f143ee4a0894bd168fd9b30c66/qf4ccf8f5435d4a78bdca4d6a018b578e/abaaabbba.aaab (IJ)I
      // 83: if_icmpge ad
      // 86: goto 8a
      // 89: athrow
      // 8a: aload 0
      // 8b: goto 8f
      // 8e: athrow
      // 8f: iload 2
      // 90: ifne a2
      // 93: getfield qeaa361f143ee4a0894bd168fd9b30c66/qf4ccf8f5435d4a78bdca4d6a018b578e/abaaabbba.babaa Lnet/minecraft/class_2338;
      // 96: ifnull ad
      // 99: goto 9d
      // 9c: athrow
      // 9d: aload 0
      // 9e: goto a2
      // a1: athrow
      // a2: getfield qeaa361f143ee4a0894bd168fd9b30c66/qf4ccf8f5435d4a78bdca4d6a018b578e/abaaabbba.aaaaab Lnet/minecraft/class_243;
      // a5: ifnull ad
      // a8: bipush 1
      // a9: goto ae
      // ac: athrow
      // ad: bipush 0
      // ae: ireturn
   }

   private class_243 bbbab(class_310 param1, class_1309 param2) {
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
      // 06: ifne 1c
      // 09: getfield qeaa361f143ee4a0894bd168fd9b30c66/qf4ccf8f5435d4a78bdca4d6a018b578e/abaaabbba.aaabb I
      // 0c: aload 2
      // 0d: invokevirtual net/minecraft/class_1309.method_5628 ()I
      // 10: if_icmpne 22
      // 13: goto 17
      // 16: athrow
      // 17: aload 0
      // 18: goto 1c
      // 1b: athrow
      // 1c: getfield qeaa361f143ee4a0894bd168fd9b30c66/qf4ccf8f5435d4a78bdca4d6a018b578e/abaaabbba.bbabb F
      // 1f: goto 29
      // 22: aload 1
      // 23: getfield net/minecraft/class_310.field_1724 Lnet/minecraft/class_746;
      // 26: invokevirtual net/minecraft/class_746.method_36454 ()F
      // 29: fstore 4
      // 2b: fload 4
      // 2d: f2d
      // 2e: invokestatic java/lang/Math.toRadians (D)D
      // 31: d2f
      // 32: fstore 5
      // 34: new net/minecraft/class_243
      // 37: dup
      // 38: fload 5
      // 3a: f2d
      // 3b: invokestatic java/lang/Math.sin (D)D
      // 3e: dneg
      // 3f: dconst_0
      // 40: fload 5
      // 42: f2d
      // 43: invokestatic java/lang/Math.cos (D)D
      // 46: invokespecial net/minecraft/class_243.<init> (DDD)V
      // 49: astore 6
      // 4b: new net/minecraft/class_243
      // 4e: dup
      // 4f: aload 2
      // 50: invokevirtual net/minecraft/class_1309.method_23317 ()D
      // 53: aload 1
      // 54: getfield net/minecraft/class_310.field_1724 Lnet/minecraft/class_746;
      // 57: invokevirtual net/minecraft/class_746.method_23317 ()D
      // 5a: dsub
      // 5b: dconst_0
      // 5c: aload 2
      // 5d: invokevirtual net/minecraft/class_1309.method_23321 ()D
      // 60: aload 1
      // 61: getfield net/minecraft/class_310.field_1724 Lnet/minecraft/class_746;
      // 64: invokevirtual net/minecraft/class_746.method_23321 ()D
      // 67: dsub
      // 68: invokespecial net/minecraft/class_243.<init> (DDD)V
      // 6b: astore 7
      // 6d: aload 6
      // 6f: invokevirtual net/minecraft/class_243.method_1027 ()D
      // 72: iload 3
      // 73: ifne b6
      // 76: ldc2_w 1.0E-6
      // 79: dcmpg
      // 7a: ifge a6
      // 7d: goto 81
      // 80: athrow
      // 81: aload 7
      // 83: iload 3
      // 84: ifne a2
      // 87: goto 8b
      // 8a: athrow
      // 8b: invokevirtual net/minecraft/class_243.method_1027 ()D
      // 8e: ldc2_w 1.0E-6
      // 91: dcmpg
      // 92: ifge a0
      // 95: goto 99
      // 98: athrow
      // 99: getstatic net/minecraft/class_243.field_1353 Lnet/minecraft/class_243;
      // 9c: goto a5
      // 9f: athrow
      // a0: aload 7
      // a2: invokevirtual net/minecraft/class_243.method_1029 ()Lnet/minecraft/class_243;
      // a5: areturn
      // a6: aload 6
      // a8: iload 3
      // a9: ifne e1
      // ac: invokevirtual net/minecraft/class_243.method_1029 ()Lnet/minecraft/class_243;
      // af: astore 6
      // b1: aload 7
      // b3: invokevirtual net/minecraft/class_243.method_1027 ()D
      // b6: ldc2_w 1.0E-6
      // b9: dcmpl
      // ba: ifle df
      // bd: aload 6
      // bf: iload 3
      // c0: ifne e1
      // c3: goto c7
      // c6: athrow
      // c7: aload 7
      // c9: invokevirtual net/minecraft/class_243.method_1029 ()Lnet/minecraft/class_243;
      // cc: invokevirtual net/minecraft/class_243.method_1026 (Lnet/minecraft/class_243;)D
      // cf: dconst_0
      // d0: dcmpg
      // d1: ifgt df
      // d4: goto d8
      // d7: athrow
      // d8: aload 7
      // da: invokevirtual net/minecraft/class_243.method_1029 ()Lnet/minecraft/class_243;
      // dd: areturn
      // de: athrow
      // df: aload 6
      // e1: areturn
   }

   private int bbbba(class_310 param1) {
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
      // 11: getfield net/minecraft/class_310.field_1724 Lnet/minecraft/class_746;
      // 14: ifnonnull 1a
      // 17: bipush -1
      // 18: ireturn
      // 19: athrow
      // 1a: bipush 0
      // 1b: istore 3
      // 1c: iload 3
      // 1d: ldc_w -439572626
      // 20: ldc_w 1023164092
      // 23: ldc_w -1511439996
      // 26: ixor
      // 27: invokestatic qeaa361f143ee4a0894bd168fd9b30c66/qf4ccf8f5435d4a78bdca4d6a018b578e/abaaabbba.a (II)I
      // 2a: ldc2_w 715137804382549189
      // 2d: invokestatic qeaa361f143ee4a0894bd168fd9b30c66/qf4ccf8f5435d4a78bdca4d6a018b578e/abaaabbba.aaab (IJ)I
      // 30: if_icmpge 67
      // 33: aload 1
      // 34: getfield net/minecraft/class_310.field_1724 Lnet/minecraft/class_746;
      // 37: invokevirtual net/minecraft/class_746.method_31548 ()Lnet/minecraft/class_1661;
      // 3a: iload 3
      // 3b: invokevirtual net/minecraft/class_1661.method_5438 (I)Lnet/minecraft/class_1799;
      // 3e: astore 4
      // 40: aload 4
      // 42: invokevirtual net/minecraft/class_1799.method_7909 ()Lnet/minecraft/class_1792;
      // 45: instanceof net/minecraft/class_1743
      // 48: iload 2
      // 49: ifne 68
      // 4c: iload 2
      // 4d: ifne 5f
      // 50: goto 54
      // 53: athrow
      // 54: ifne 5e
      // 57: goto 5b
      // 5a: athrow
      // 5b: goto 60
      // 5e: iload 3
      // 5f: ireturn
      // 60: iinc 3 1
      // 63: iload 2
      // 64: ifeq 1c
      // 67: bipush -1
      // 68: ireturn
   }

   private boolean bbbbb(class_310 param1) {
      // $VF: Couldn't be decompiled
      // Please report this to the Vineflower issue tracker, at https://github.com/Vineflower/vineflower/issues with a copy of the class file (if you have the rights to distribute it!)
      // java.lang.RuntimeException: parsing failure!
      //   at org.jetbrains.java.decompiler.modules.decompiler.decompose.DomHelper.parseGraph(DomHelper.java:211)
      //   at org.jetbrains.java.decompiler.main.rels.MethodProcessor.codeToJava(MethodProcessor.java:166)
      //
      // Bytecode:
      // 000: getstatic qeaa361f143ee4a0894bd168fd9b30c66/qf4ccf8f5435d4a78bdca4d6a018b578e/baaabbaa.bba I
      // 003: istore 2
      // 004: aload 0
      // 005: getfield qeaa361f143ee4a0894bd168fd9b30c66/qf4ccf8f5435d4a78bdca4d6a018b578e/abaaabbba.bbaa I
      // 008: iload 2
      // 009: ifne 03e
      // 00c: iflt 039
      // 00f: goto 013
      // 012: athrow
      // 013: aload 0
      // 014: getfield qeaa361f143ee4a0894bd168fd9b30c66/qf4ccf8f5435d4a78bdca4d6a018b578e/abaaabbba.bbaa I
      // 017: iload 2
      // 018: ifne 03e
      // 01b: goto 01f
      // 01e: athrow
      // 01f: ldc_w -439572627
      // 022: ldc_w 1346873136
      // 025: ldc_w 547303273
      // 028: ixor
      // 029: invokestatic qeaa361f143ee4a0894bd168fd9b30c66/qf4ccf8f5435d4a78bdca4d6a018b578e/abaaabbba.a (II)I
      // 02c: ldc2_w 715137804382549189
      // 02f: invokestatic qeaa361f143ee4a0894bd168fd9b30c66/qf4ccf8f5435d4a78bdca4d6a018b578e/abaaabbba.aaab (IJ)I
      // 032: if_icmplt 03f
      // 035: goto 039
      // 038: athrow
      // 039: bipush 0
      // 03a: goto 03e
      // 03d: athrow
      // 03e: ireturn
      // 03f: aload 1
      // 040: iload 2
      // 041: ifne 04c
      // 044: ifnull 05a
      // 047: goto 04b
      // 04a: athrow
      // 04b: aload 1
      // 04c: iload 2
      // 04d: ifne 05e
      // 050: getfield net/minecraft/class_310.field_1724 Lnet/minecraft/class_746;
      // 053: ifnonnull 05d
      // 056: goto 05a
      // 059: athrow
      // 05a: bipush 1
      // 05b: ireturn
      // 05c: athrow
      // 05d: aload 1
      // 05e: getfield net/minecraft/class_310.field_1724 Lnet/minecraft/class_746;
      // 061: getfield net/minecraft/class_746.field_6012 I
      // 064: iload 2
      // 065: ifne 099
      // 068: aload 0
      // 069: getfield qeaa361f143ee4a0894bd168fd9b30c66/qf4ccf8f5435d4a78bdca4d6a018b578e/abaaabbba.aaaa I
      // 06c: if_icmple 098
      // 06f: goto 073
      // 072: athrow
      // 073: aload 1
      // 074: invokestatic qeaa361f143ee4a0894bd168fd9b30c66/qf4ccf8f5435d4a78bdca4d6a018b578e/aabbabbbb.abaaaab (Lnet/minecraft/class_310;)Z
      // 077: iload 2
      // 078: ifne 099
      // 07b: goto 07f
      // 07e: athrow
      // 07f: ifne 098
      // 082: goto 086
      // 085: athrow
      // 086: invokestatic qeaa361f143ee4a0894bd168fd9b30c66/qf4ccf8f5435d4a78bdca4d6a018b578e/aabbabbbb.abbbabb ()Z
      // 089: iload 2
      // 08a: ifne 0a4
      // 08d: goto 091
      // 090: athrow
      // 091: ifeq 09a
      // 094: goto 098
      // 097: athrow
      // 098: bipush 1
      // 099: ireturn
      // 09a: aload 1
      // 09b: getfield net/minecraft/class_310.field_1724 Lnet/minecraft/class_746;
      // 09e: invokevirtual net/minecraft/class_746.method_31548 ()Lnet/minecraft/class_1661;
      // 0a1: invokestatic qeaa361f143ee4a0894bd168fd9b30c66/qf4ccf8f5435d4a78bdca4d6a018b578e/aabbabbbb.abaabaa (Lnet/minecraft/class_1661;)I
      // 0a4: istore 3
      // 0a5: aload 0
      // 0a6: getfield qeaa361f143ee4a0894bd168fd9b30c66/qf4ccf8f5435d4a78bdca4d6a018b578e/abaaabbba.aaaaba Z
      // 0a9: iload 2
      // 0aa: ifne 0dc
      // 0ad: ifne 0db
      // 0b0: goto 0b4
      // 0b3: athrow
      // 0b4: iload 3
      // 0b5: iload 2
      // 0b6: ifne 0dc
      // 0b9: goto 0bd
      // 0bc: athrow
      // 0bd: aload 0
      // 0be: getfield qeaa361f143ee4a0894bd168fd9b30c66/qf4ccf8f5435d4a78bdca4d6a018b578e/abaaabbba.bbaa I
      // 0c1: if_icmpeq 0db
      // 0c4: goto 0c8
      // 0c7: athrow
      // 0c8: aload 1
      // 0c9: aload 0
      // 0ca: aload 0
      // 0cb: getfield qeaa361f143ee4a0894bd168fd9b30c66/qf4ccf8f5435d4a78bdca4d6a018b578e/abaaabbba.bbaa I
      // 0ce: bipush 1
      // 0cf: invokestatic qeaa361f143ee4a0894bd168fd9b30c66/qf4ccf8f5435d4a78bdca4d6a018b578e/aabbabbbb.aabbaab (Lnet/minecraft/class_310;Ljava/lang/Object;II)V
      // 0d2: aload 0
      // 0d3: bipush 1
      // 0d4: putfield qeaa361f143ee4a0894bd168fd9b30c66/qf4ccf8f5435d4a78bdca4d6a018b578e/abaaabbba.aaaaba Z
      // 0d7: goto 0db
      // 0da: athrow
      // 0db: iload 3
      // 0dc: iload 2
      // 0dd: ifne 102
      // 0e0: aload 0
      // 0e1: getfield qeaa361f143ee4a0894bd168fd9b30c66/qf4ccf8f5435d4a78bdca4d6a018b578e/abaaabbba.bbaa I
      // 0e4: if_icmpne 0fa
      // 0e7: goto 0eb
      // 0ea: athrow
      // 0eb: aload 1
      // 0ec: aload 0
      // 0ed: getstatic qeaa361f143ee4a0894bd168fd9b30c66/qf4ccf8f5435d4a78bdca4d6a018b578e/abbaaabba.aba Lqeaa361f143ee4a0894bd168fd9b30c66/qf4ccf8f5435d4a78bdca4d6a018b578e/abbaaabba;
      // 0f0: invokestatic qeaa361f143ee4a0894bd168fd9b30c66/qf4ccf8f5435d4a78bdca4d6a018b578e/aabbabbbb.bbaaabb (Lnet/minecraft/class_310;Ljava/lang/Object;Lqeaa361f143ee4a0894bd168fd9b30c66/qf4ccf8f5435d4a78bdca4d6a018b578e/abbaaabba;)V
      // 0f3: aload 0
      // 0f4: invokevirtual qeaa361f143ee4a0894bd168fd9b30c66/qf4ccf8f5435d4a78bdca4d6a018b578e/abaaabbba.ba ()V
      // 0f7: bipush 0
      // 0f8: ireturn
      // 0f9: athrow
      // 0fa: invokestatic java/lang/System.currentTimeMillis ()J
      // 0fd: aload 0
      // 0fe: getfield qeaa361f143ee4a0894bd168fd9b30c66/qf4ccf8f5435d4a78bdca4d6a018b578e/abaaabbba.babb J
      // 101: lcmp
      // 102: iload 2
      // 103: ifne 11d
      // 106: iflt 11c
      // 109: goto 10d
      // 10c: athrow
      // 10d: aload 1
      // 10e: aload 0
      // 10f: getstatic qeaa361f143ee4a0894bd168fd9b30c66/qf4ccf8f5435d4a78bdca4d6a018b578e/abbaaabba.aba Lqeaa361f143ee4a0894bd168fd9b30c66/qf4ccf8f5435d4a78bdca4d6a018b578e/abbaaabba;
      // 112: invokestatic qeaa361f143ee4a0894bd168fd9b30c66/qf4ccf8f5435d4a78bdca4d6a018b578e/aabbabbbb.bbaaabb (Lnet/minecraft/class_310;Ljava/lang/Object;Lqeaa361f143ee4a0894bd168fd9b30c66/qf4ccf8f5435d4a78bdca4d6a018b578e/abbaaabba;)V
      // 115: aload 0
      // 116: invokevirtual qeaa361f143ee4a0894bd168fd9b30c66/qf4ccf8f5435d4a78bdca4d6a018b578e/abaaabbba.ba ()V
      // 119: bipush 0
      // 11a: ireturn
      // 11b: athrow
      // 11c: bipush 1
      // 11d: ireturn
   }

   private void aaaaaa(long var1) {
      this.bbb();
      this.bbbab = aaabaaaba.b;
      this.babbb = var1;
      this.abb = var1 + this.bbaab(this.baaab);
      this.bbaa = this.abaab;
      this.bbab = null;
   }

   @Override
   public void abbbba(class_310 param1) {
      // $VF: Couldn't be decompiled
      // Please report this to the Vineflower issue tracker, at https://github.com/Vineflower/vineflower/issues with a copy of the class file (if you have the rights to distribute it!)
      // java.lang.RuntimeException: parsing failure!
      //   at org.jetbrains.java.decompiler.modules.decompiler.decompose.DomHelper.parseGraph(DomHelper.java:211)
      //   at org.jetbrains.java.decompiler.main.rels.MethodProcessor.codeToJava(MethodProcessor.java:166)
      //
      // Bytecode:
      // 000: getstatic qeaa361f143ee4a0894bd168fd9b30c66/qf4ccf8f5435d4a78bdca4d6a018b578e/baaabbaa.bba I
      // 003: istore 2
      // 004: aload 0
      // 005: iload 2
      // 006: ifne 042
      // 009: invokevirtual qeaa361f143ee4a0894bd168fd9b30c66/qf4ccf8f5435d4a78bdca4d6a018b578e/abaaabbba.babbaab ()Z
      // 00c: ifeq 03d
      // 00f: goto 013
      // 012: athrow
      // 013: aload 1
      // 014: iload 2
      // 015: ifne 024
      // 018: goto 01c
      // 01b: athrow
      // 01c: ifnull 03d
      // 01f: goto 023
      // 022: athrow
      // 023: aload 1
      // 024: iload 2
      // 025: ifne 037
      // 028: getfield net/minecraft/class_310.field_1724 Lnet/minecraft/class_746;
      // 02b: ifnull 03d
      // 02e: goto 032
      // 031: athrow
      // 032: aload 1
      // 033: goto 037
      // 036: athrow
      // 037: getfield net/minecraft/class_310.field_1690 Lnet/minecraft/class_315;
      // 03a: ifnonnull 047
      // 03d: aload 0
      // 03e: goto 042
      // 041: athrow
      // 042: bipush 0
      // 043: putfield qeaa361f143ee4a0894bd168fd9b30c66/qf4ccf8f5435d4a78bdca4d6a018b578e/abaaabbba.bbbbb Z
      // 046: return
      // 047: aload 0
      // 048: iload 2
      // 049: ifne 096
      // 04c: aload 1
      // 04d: invokevirtual qeaa361f143ee4a0894bd168fd9b30c66/qf4ccf8f5435d4a78bdca4d6a018b578e/abaaabbba.aabb (Lnet/minecraft/class_310;)Z
      // 050: ifeq 095
      // 053: goto 057
      // 056: athrow
      // 057: aload 0
      // 058: aload 1
      // 059: invokevirtual qeaa361f143ee4a0894bd168fd9b30c66/qf4ccf8f5435d4a78bdca4d6a018b578e/abaaabbba.abaaba (Lnet/minecraft/class_310;)V
      // 05c: aload 0
      // 05d: aload 1
      // 05e: getfield net/minecraft/class_310.field_1690 Lnet/minecraft/class_315;
      // 061: iload 2
      // 062: ifne 07b
      // 065: goto 069
      // 068: athrow
      // 069: getfield net/minecraft/class_315.field_1886 Lnet/minecraft/class_304;
      // 06c: ifnull 090
      // 06f: goto 073
      // 072: athrow
      // 073: aload 1
      // 074: getfield net/minecraft/class_310.field_1690 Lnet/minecraft/class_315;
      // 077: goto 07b
      // 07a: athrow
      // 07b: getfield net/minecraft/class_315.field_1886 Lnet/minecraft/class_304;
      // 07e: invokevirtual net/minecraft/class_304.method_1434 ()Z
      // 081: iload 2
      // 082: ifne 08d
      // 085: ifeq 090
      // 088: goto 08c
      // 08b: athrow
      // 08c: bipush 1
      // 08d: goto 091
      // 090: bipush 0
      // 091: putfield qeaa361f143ee4a0894bd168fd9b30c66/qf4ccf8f5435d4a78bdca4d6a018b578e/abaaabbba.bbbbb Z
      // 094: return
      // 095: aload 0
      // 096: iload 2
      // 097: ifne 0b9
      // 09a: getfield qeaa361f143ee4a0894bd168fd9b30c66/qf4ccf8f5435d4a78bdca4d6a018b578e/abaaabbba.bbbab Lqeaa361f143ee4a0894bd168fd9b30c66/qf4ccf8f5435d4a78bdca4d6a018b578e/aaabaaaba;
      // 09d: getstatic qeaa361f143ee4a0894bd168fd9b30c66/qf4ccf8f5435d4a78bdca4d6a018b578e/aaabaaaba.abb Lqeaa361f143ee4a0894bd168fd9b30c66/qf4ccf8f5435d4a78bdca4d6a018b578e/aaabaaaba;
      // 0a0: if_acmpeq 0b8
      // 0a3: goto 0a7
      // 0a6: athrow
      // 0a7: aload 0
      // 0a8: aload 1
      // 0a9: invokevirtual qeaa361f143ee4a0894bd168fd9b30c66/qf4ccf8f5435d4a78bdca4d6a018b578e/abaaabbba.aaaa (Lnet/minecraft/class_310;)V
      // 0ac: aload 1
      // 0ad: getfield net/minecraft/class_310.field_1690 Lnet/minecraft/class_315;
      // 0b0: getfield net/minecraft/class_315.field_1886 Lnet/minecraft/class_304;
      // 0b3: invokestatic qeaa361f143ee4a0894bd168fd9b30c66/qf4ccf8f5435d4a78bdca4d6a018b578e/aabbabbbb.bababaa (Lnet/minecraft/class_304;)V
      // 0b6: return
      // 0b7: athrow
      // 0b8: aload 0
      // 0b9: iload 2
      // 0ba: ifne 0cb
      // 0bd: aload 1
      // 0be: invokevirtual qeaa361f143ee4a0894bd168fd9b30c66/qf4ccf8f5435d4a78bdca4d6a018b578e/abaaabbba.bbbbb (Lnet/minecraft/class_310;)Z
      // 0c1: ifeq 0ca
      // 0c4: goto 0c8
      // 0c7: athrow
      // 0c8: return
      // 0c9: athrow
      // 0ca: aload 0
      // 0cb: iload 2
      // 0cc: ifne 0e2
      // 0cf: getfield qeaa361f143ee4a0894bd168fd9b30c66/qf4ccf8f5435d4a78bdca4d6a018b578e/abaaabbba.bbaab Z
      // 0d2: ifeq 0db
      // 0d5: goto 0d9
      // 0d8: athrow
      // 0d9: return
      // 0da: athrow
      // 0db: aload 0
      // 0dc: getfield qeaa361f143ee4a0894bd168fd9b30c66/qf4ccf8f5435d4a78bdca4d6a018b578e/abaaabbba.abab Lqeaa361f143ee4a0894bd168fd9b30c66/qf4ccf8f5435d4a78bdca4d6a018b578e/baabaab;
      // 0df: invokevirtual qeaa361f143ee4a0894bd168fd9b30c66/qf4ccf8f5435d4a78bdca4d6a018b578e/baabaab.abbb ()Ljava/lang/Object;
      // 0e2: getstatic qeaa361f143ee4a0894bd168fd9b30c66/qf4ccf8f5435d4a78bdca4d6a018b578e/bbbaaaab.aa Lqeaa361f143ee4a0894bd168fd9b30c66/qf4ccf8f5435d4a78bdca4d6a018b578e/bbbaaaab;
      // 0e5: if_acmpne 0ed
      // 0e8: bipush 1
      // 0e9: goto 0ee
      // 0ec: athrow
      // 0ed: bipush 0
      // 0ee: istore 5
      // 0f0: aload 1
      // 0f1: getfield net/minecraft/class_310.field_1690 Lnet/minecraft/class_315;
      // 0f4: getfield net/minecraft/class_315.field_1886 Lnet/minecraft/class_304;
      // 0f7: invokevirtual net/minecraft/class_304.method_1434 ()Z
      // 0fa: istore 6
      // 0fc: iload 6
      // 0fe: iload 2
      // 0ff: ifne 111
      // 102: ifeq 120
      // 105: goto 109
      // 108: athrow
      // 109: aload 0
      // 10a: getfield qeaa361f143ee4a0894bd168fd9b30c66/qf4ccf8f5435d4a78bdca4d6a018b578e/abaaabbba.bbbbb Z
      // 10d: goto 111
      // 110: athrow
      // 111: iload 2
      // 112: ifne 11d
      // 115: ifne 120
      // 118: goto 11c
      // 11b: athrow
      // 11c: bipush 1
      // 11d: goto 121
      // 120: bipush 0
      // 121: istore 7
      // 123: aload 0
      // 124: iload 2
      // 125: ifne 159
      // 128: iload 6
      // 12a: putfield qeaa361f143ee4a0894bd168fd9b30c66/qf4ccf8f5435d4a78bdca4d6a018b578e/abaaabbba.bbbbb Z
      // 12d: iload 5
      // 12f: ifne 158
      // 132: goto 136
      // 135: athrow
      // 136: iload 7
      // 138: iload 2
      // 139: ifne 155
      // 13c: goto 140
      // 13f: athrow
      // 140: ifne 158
      // 143: goto 147
      // 146: athrow
      // 147: aload 1
      // 148: getfield net/minecraft/class_310.field_1690 Lnet/minecraft/class_315;
      // 14b: getfield net/minecraft/class_315.field_1886 Lnet/minecraft/class_304;
      // 14e: invokestatic qeaa361f143ee4a0894bd168fd9b30c66/qf4ccf8f5435d4a78bdca4d6a018b578e/aabbabbbb.aabbbba (Lnet/minecraft/class_304;)I
      // 151: goto 155
      // 154: athrow
      // 155: ifle 1d2
      // 158: aload 0
      // 159: aload 1
      // 15a: aload 1
      // 15b: aload 1
      // 15c: ldc2_w 3.0
      // 15f: invokestatic qeaa361f143ee4a0894bd168fd9b30c66/qf4ccf8f5435d4a78bdca4d6a018b578e/aabbabbbb.bbbaba (Lnet/minecraft/class_310;D)Lnet/minecraft/class_3966;
      // 162: dup
      // 163: astore 3
      // 164: aload 3
      // 165: pop
      // 166: invokestatic qeaa361f143ee4a0894bd168fd9b30c66/qf4ccf8f5435d4a78bdca4d6a018b578e/aabbabbbb.aaaaaab (Lnet/minecraft/class_310;Lnet/minecraft/class_239;)Lnet/minecraft/class_1309;
      // 169: dup
      // 16a: astore 4
      // 16c: iload 2
      // 16d: ifne 18a
      // 170: invokevirtual qeaa361f143ee4a0894bd168fd9b30c66/qf4ccf8f5435d4a78bdca4d6a018b578e/abaaabbba.bba (Lnet/minecraft/class_310;Lnet/minecraft/class_1309;)Z
      // 173: ifeq 1d2
      // 176: goto 17a
      // 179: athrow
      // 17a: aload 0
      // 17b: aload 1
      // 17c: iload 2
      // 17d: ifne 194
      // 180: goto 184
      // 183: athrow
      // 184: aload 4
      // 186: goto 18a
      // 189: athrow
      // 18a: invokevirtual qeaa361f143ee4a0894bd168fd9b30c66/qf4ccf8f5435d4a78bdca4d6a018b578e/abaaabbba.baaab (Lnet/minecraft/class_310;Lnet/minecraft/class_1309;)Z
      // 18d: ifeq 192
      // 190: return
      // 191: athrow
      // 192: aload 0
      // 193: aload 1
      // 194: invokevirtual qeaa361f143ee4a0894bd168fd9b30c66/qf4ccf8f5435d4a78bdca4d6a018b578e/abaaabbba.bbbba (Lnet/minecraft/class_310;)I
      // 197: istore 8
      // 199: iload 8
      // 19b: iload 2
      // 19c: ifne 1b4
      // 19f: bipush -1
      // 1a0: if_icmpeq 1d2
      // 1a3: goto 1a7
      // 1a6: athrow
      // 1a7: aload 0
      // 1a8: aload 1
      // 1a9: aload 4
      // 1ab: iload 8
      // 1ad: invokevirtual qeaa361f143ee4a0894bd168fd9b30c66/qf4ccf8f5435d4a78bdca4d6a018b578e/abaaabbba.babbb (Lnet/minecraft/class_310;Lnet/minecraft/class_1309;I)Z
      // 1b0: goto 1b4
      // 1b3: athrow
      // 1b4: iload 2
      // 1b5: ifne 1c1
      // 1b8: ifeq 1d2
      // 1bb: goto 1bf
      // 1be: athrow
      // 1bf: iload 5
      // 1c1: ifne 1d2
      // 1c4: aload 1
      // 1c5: getfield net/minecraft/class_310.field_1690 Lnet/minecraft/class_315;
      // 1c8: getfield net/minecraft/class_315.field_1886 Lnet/minecraft/class_304;
      // 1cb: invokestatic qeaa361f143ee4a0894bd168fd9b30c66/qf4ccf8f5435d4a78bdca4d6a018b578e/aabbabbbb.bababaa (Lnet/minecraft/class_304;)V
      // 1ce: goto 1d2
      // 1d1: athrow
      // 1d2: return
   }

   // $VF: Irreducible bytecode was duplicated to produce valid code
   static {
      int var34 = 1959095824;
      byte var30 = -1;
      String var24 = "楱槮榻榑榗楐椱槵楉榁椲楑槭槙椺槙椧榃榟椟椇椏溱楊榿榣槉溰椣椅槥榨榟楡榦楃槵榘槁榒槛椕楖楑楚槪椢槦椎楋椼槌榙楱楶楒榃槧楡構楗楳榾椢楋椓楱楕椝槨槻楑槞椋渂椄楋榐榃槕槞榍椂楙榷椶槷楅榧槴榇榵椑椠椴榡椞溲椇槍槌椰楡槐椾榒植椤椰槻滐椕槭榡楝楔椐椈槕椬椁椏椚様楹槝榁椁楘榫槰榫楃湺椼楣槇槙楖検槷椤椻楐榆楍榭榒楟楱楢楩椻槃椤榾榱榽楷榆楛椣楣槏椢楣槧榌椷榾榉榱楎榓楸楱槕楗椣槫榾椧椁榘椣榒榨槔槫槷楞榓榍槜渁槰椠槖楡椫榬楳槺椓榓槀椃検槜楂楏楰楚榛楀槷椼楮槆槚楼楛楳楙楬槼榝椃湹椚楪楦椼楪楞楻榺椔楱榤槌楉楙榐榆椒楟楚椏椨榥槫槄榖楛楝概槠槀楩榠椋楼槬槽楆椛槜椲椵槲極槨楣槏槞槠椔榆楛楁槁楷楑榺椝椩榾榙槊槭椻榶極楄楹榇椛槡椝槟椃椋榦椑槰榸楙榲槹滓榥槕槷槚槴椘槅楃楸滓楻榒榭槒楺椝楅椲槗楢榳榞楰椌楐榹槺椥椞楪椾楁楃榅楯楽榞槧椷榃榇椐槧槼楊榿楁槫椤槰渆椶榋榾楘椎榵槺楰椐槚椩槑概槣椺榒槡榭槮椶槥椃槝椥椓槄槃榻楾榇槎榙椞榿榪楢槔榮榻椐椭椷榟椐榧榸槌槡榓楫榦椱椮槰椹榮楣榭楏楬楖楎椔槩楝椘椠楜槅渆榺槑椟楪榡榁椥楾椑椏椟椃様榨榽榶槦楖槌楬槪椪椄槯楃槻榫椭楻楀榯椶槇槏榡楲楄椥榱椧楲榟槕榼榧椑椨楂榦榁榙椔槿槩椗榦楥楐槈椩榢楕槵槕榯榶椎椥榹槶椲椎椓榍槆榍椈ϊξ͈ͅϲϩ̢ϋϭΚ̲̍μ͘Τ΄ΐΪͧϙέ̝ϰϮ͌ϱΌ̬̗̳ͱ͗ͬͿ·̵ςʹͽψ\u0380̱ϛyΚ̰͈ͫ͜΄γ̴͔͙̩̈́͡ύ̘ψ̟Ϳ̨̼οϦ̣̑ϓͯΔΞϷͮϥÐ̥͑Ϸ̎̃嵺崚崻嵁嵩嶫嶼嵪崮巻崇嶒嶙崄巕嵶崩崀崧崵崔巐励巾嵶嵻嶀嵟剻巍巍崗崉嶞崧崴崱嶇巴嶱䑄䒉䐨䒁䓧䐵䓷䑖䒁䓮\ue065\ue0b4\ue03a\ue088\ue046\ue034\ue062\ue0e6\ue046\ue091\ue088\ue035\ue0b6\ue0a6\ue0ef\ue0e2劌剁勐刹刯勽刯办刹刦\u0fdc༙ಲྖཫྀ\u0f48ར༸ཉ࿘༎༗ཷ༓\u0ffeཝྡྷག༽༄࿗༲༒ཥ\u0fe8ེྴྉ࿖ཱྎ\u0fe4༭\u0fe8ྋ\u0fe4࿅ྤ༧ྀཷཀྵའ࿏ཝ\u0fdeྖིཷ༗ཕྨ྆\u0fe7༧ནྫྷ\u0f98༥༫༏༦༚ས༇༬༾ྣ࿋༷༈\u0fffཌྷ࿗ཆ༪ಲྼྪ抍所拑戸戮拼戮抟戸戧\ue749\ue759\ue73a\ue787\ue71b\ue7ee\ue7c1\ue77d\ue7cc\ue7e5\ue7f3\ue745\ue7f4\ue74d\ue750\ue7f3魳鮎鬯鮆鯰鬢鯠魁鮆鯩";
      short var23 = 12157;
      char[] var25 = "⺀⼬⽕⽷⽭⽷⼭⽷⽭⽷".toCharArray();
      String[] var26 = new String[var25.length];

      while (true) {
         int var27 = 0;
         int var28 = 0;
         int var29 = 0;
         if (var30 == 0) {
            aaabaa = var26;
            aaabab = new Object[var26.length];
            byte var40 = 0;
            int var10001 = 0;
            aaaabb = new int[414];
            byte[] var10002 = "\r\u00189I\u008c\u009bõ\b°]reG\u0011\u007fÏ³f~F(üÚ>m\bò'èh\"vÄ'å\u009dD2þÍ\u0099\u008bà\u0080\f@ý\u0080R©ÚVå~\u008a\u0002_£Æ\u0002\u0003¾\u0004²\u0000\u007f¾!k\u0019\u009f×0\u0090\u001d0%\u008e\u0093&²^Zj\u0013i\u0081M«ooÝÉºá\u0012 \u009f\u0005#7u;asÚß!8\u001cp\u0018Þ\u0097\u00976\u007fÐ¿:¡\u0099\u0015\u0005\rjñ\u008aL\u000e^×~,ZØ\u0010L<\u008faè@\"s¥\u0087¨¯\u008a\u0083²ßuU\u0096ëM\u0005â_ñ\u0012ùâ\u0090·é\u0080ý\u008bH[\u0085$Ö~Ô\u0011Â$Ê\u0004CZ(\u0085ïûÏ³jçÈÓÃ{\n\u009eÑÏ\u00805Ã)Q6Î \u0005\u0087\u00adâ\u008a²»bÌ$\u001c<Ðð°#9\nÖ\u0084\u0088\u0085Mu\u001c?ÞÚs\u008e\u0087:Z\u0007ÅÜ\u0012ù\u001eá}oo£í£j\u0089õ\u001b\u000b¥±×ë°o\t´¢\r³\u00846\u001e\u0095\"\u0004\u0091\u0093bjÀ¾õÂm\u0082\u0003HhoP\u0098\u0081Sÿ âûs\"O\"#è\u009eþÁ\u000e'Ð\n%v)(ñ\u000f\"`n4õL!ÒÎ\bìPß\u00135S-¾ä\u001bt\u0006ý\u001e\nÜ\u0083\u0094G\u000f \u0099\u009b8\u001b;H]ì\u0004\u0087ûLÂ#F\u0005~\u000eýá:DþE~\u001ac²ú\u0000.\u0091\u0082ÚÂt´ºG1DBþOùyÚ!\u008cs_C-öänpÕ/ì\u001dOpI%-ZW\u0090xñÈNqDÝUkK¸\u0018\f\u0006\u008bApbfùò\u001a±LÝ\u0080b5w¾\u0000\u0087ï\u001a\u0087Ý\u001ejå\u0084L\u0094J·4FÐRF»ë/9§0 \f]O-åÌ_/\u0084!\u0014ÚxP\u0086?\u001e\u008ep\u0095)\u009d¥æ\u009bN4LÒlR\u00988&\u0097Ã|,Ô\tFlá¿m\u0097\u0086v°OAßÏ_\u008dcM6¥ó¦(\u009fzm\u0080-uµy\u0003æV\u008b`gmjÜTÓ\n\u0082ª¶ÇÓc;{53¬hBè\u001b\u009d¢\u008fK\u0087_R\u009a W9a¨{\u008a]~î;ßt§$RüX:Gã¯¯\u0010º\u0085Þ\u0087 ØHòþ×Ö\u0004\u0013\u000bgÅEW\u0018\u008a9¤9ceM4v\u001eÄàê¨çÅç)bWìÊ\t\u0015{\u008d¼+U*\u009f®ø\u0099\u0085r9\u0096\u009bý\rð´\u008cLO|É<¸É¡xZ¢õoîÇ!©Å\u008fÌ_q\u0087éú_\u0000·\u000b\u0093}ð\u008b\u009b\u0006Æ²Af¤\u0083sÒõøg2Z\u0097\u0011Í\u001f %\u0003\u0013\u0087!\u001e<\u0004\u0089\u0098ä\u0019z\u008f\u000e\b\u0080T«BäÊ[l\u001d²'Ñ\u008d\u009aøÔîdN$©U\rÒýÏÅ\u001dÐ\u009eÅ`Ê¹Ûc\u009bh¢\u009fÙ\u007f\u0089\u000f\u0000$U\u0096¨s~\u009bY¡&\u001cÖÖÒî×1±ä\u0087\u008b\u0014\u000e\u0090¡\u0093$¡ËþyøòZ|\u00999S\u0091\u001aó\u0081\u008aÜ¦8u\u0012F%O).E¤#`ÃwÅ\u009bä\u001fÙVt\u001c\u0010\u000eÄ\u00162\u000b¿ÇMDY>Ùé²\u0088¢!×QpÕîT¿\u0094\u008e¿¨\u0004\u0091K\u009f2Ñ(4\u0016¨Å\u009bp\u0092\u0010\u0010|¾@r\u001bÏ\u0011t\u008có\u009b¦ÇäP\u0094\u0088û÷v¡«Pg2\u008dêÍ\u0096t\u008f{\u000e^cîøu@v?\u0092b;z×X6Tý\u0013\u0082}I \u0090ÿ|\u0095DcÏü\u009b¾\u008eìîí!Ñ8v\u001e\u0015+wµx|\u0019\u0001Ô\u009e?\u0081aëÛÀ\u0014 ´Ò´\b\u0094÷\u0013Í FH\r\u0002Ï\u008d\u001eW»ùÄ\u0080åD|&Zn½¬cÄA\u009d 2,\u0014©¢L\u0085Ø~âÜ\u0080\u0097®?\u0019\u0007·¨`+\u001fâ\u0002~ôÜ?\u0012\u0017ÈçhÕx\u0015è\u0080Õ0\u008a\u001f|¯Sl\u00ad·\u0092[YN\u009aÒ¥bµç\u009e\u0084qi\u009bí\u0083à\u0014qýÉuC¡~Ì\u0019pq®ì\u008dÝJ\r¨ã\u0010?¬þ\u001d{\u000fË5ë·7\u0007®.¹H\u0081Ö4ÐSÈä2EÇ]âû\u001e\\\u009b\u000f6IµoD(\u0083{QYÙH\u001f¦êðÀ¸ZS\u001fÝîxlµ*Tª/¾\u009f\rÍúc\u0000\u0087\u0093ïìç¦Í\u0016è\u0090T>õñÄw\u00153Cÿ\u0010ª0jLXvbJoÇ}ªeeèy2k×Ú·úR\u0013!\u0006\u009dX\u0087\u00ad?qÝ\u0004Ê¯òÝõ\u0010¦TÑ<\u0095±ÙÀ\u0095 \u009d¼# ôÄ±«\u008a\fÖ\t\u001e?\u0096]\u000e<üE´Ã3îl\u0013:Ø;=QYæÀ3u_\u0085m\u0096c\r\fÀ\u0014\u000f9:Uõ¿¸÷HÁß×Ù\u0099tç\u0087gq{qi\u0000Aá\u0000ÎÑ4\u008aJ²\u0094g\u0090ôá\u008a:V\u0098\\aÞ\u0096\u007f8©h\u0000«ky\u009c\u0091Ê\u0090\u008b¬aðI\u0090 NZæzâ$Y\u0080~Ó\u009d\u0007\f\u00ad\u0096\"j\u008d \u00102çû²ó®W¡\u0083ó\u008dG\u008b<¬\u0006§b¼ø\u0015\u0096äKðÀf\u008e:Êý·\u0087£0¿T\u0019_|\u00951\u00adWl$\u0004 /><\u000eoÉà<\u009fö]{\u008fléÞÐé\u008e\u009aX*$ñHÃé\u0006*í^\u0013?Ù:e\u0001\u0083\u0004\u001d\u000f6êÁª\u0019\u009dÓ\n\u008d{í\u001dâ¥ª\u0082f\u0091TöYEe¡]\r+ëÐárbîÁQ~W J\u0016)£*u\u0012¡,b\u000b¤\u0013\u0098Æ\u0094¢´µ\u0001\u0084!Z¥Ïy\u001a¢\u0006åî#$w¯ÇR·>\u00ad÷Kð\u0089Ð\u001ceÄá\u0089Â\u008fXB6!\u0013a¸\r\u00adíËõ\u0007\u0014Dwì°ëðzL\u0080\u001aÁzT!sïáÀÈM\u0016Ì\u0003é\u0091wÀ\u00008ª\u0095Ô\u0014\u001b¤\u009c\u0093\u009d\u0017\\Ç×áã.î9X}F?ã\u0001\u0006µM´oµpfõ\u0013÷\"Jø\u0010¬\u0005\u0091À\u0081\u00adÜ]2\u00815\u008b²\u008cºiI8½º"
               .getBytes("ISO-8859-1");

            int var99;
            do {
               aaaabb[var40] = (
                     (var10002[var10001] & 255) << 24
                        | (var10002[var10001 + 1] & 255) << 16
                        | (var10002[var10001 + 2] & 255) << 8
                        | var10002[var10001 + 3] & 255
                  )
                  ^ -1459381686;
               var40 += 1;
               var99 = var10001 + 4;
               var10001 += 4;
            } while (var99 < var10002.length);

            String[] var21 = new String[a(-439572979, var34 ^ 1585414067)];
            int var19 = 0;
            String var18;
            int var20 = (var18 = b((short)'롐', var34 ^ 1015111734, 30026)).length();
            int var17 = a(-439572980, var34 ^ -877370590);
            int var38 = -1;

            label141:
            while (true) {
               String var41 = var18.substring(++var38, var38 + var17);
               var10001 = (byte)-1;

               while (true) {
                  label136: {
                     char[] var53 = var41.toCharArray();
                     var99 = var53.length;
                     int var22 = 0;
                     var78 = var53;
                     var10001 = var99;
                     char[] var103;
                     int var125;
                     if (var99 <= 1) {
                        var103 = var53;
                        var125 = var22;
                     } else {
                        var78 = var53;
                        var10001 = var99;
                        if (var99 <= var22) {
                           break label136;
                        }

                        var103 = var53;
                        var125 = var22;
                     }

                     while (true) {
                        var103[var125] = (char)(var103[var125] ^ switch (var22 % a(-439572983, var34 ^ -1739106130)) {
                           case 0 -> a(-439572984, var34 ^ -1001743853);
                           case 1 -> a(-439572969, var34 ^ -947183455);
                           case 2 -> a(-439572970, var34 ^ -1393753732);
                           case 3 -> 5;
                           case 4 -> a(-439572971, var34 ^ -144407966);
                           case 5 -> a(-439572972, var34 ^ -495317541);
                           default -> a(-439572973, var34 ^ 1974125895);
                        });
                        var22++;
                        if (var10001 == 0) {
                           var125 = var10001;
                           var103 = var78;
                        } else {
                           if (var10001 <= var22) {
                              break;
                           }

                           var103 = var78;
                           var125 = var22;
                        }
                     }
                  }

                  String var110 = new String(var78).intern();
                  switch (var10001) {
                     case 0:
                        var21[var19++] = var110;
                        if ((var38 += var17) >= var20) {
                           aabbb = var21;
                           aabab = new String[a(-439572982, var34 ^ 579474742)];
                           long var8 = 3894274573145321721L;
                           long[] var14 = new long[a(-439572974, var34 ^ -727900166)];
                           int var11 = 0;
                           String var12;
                           int var13 = (var12 = b((short)32265, var34 ^ -1368361451, 30024)).length();
                           byte var10 = 0;

                           label115:
                           while (true) {
                              int var60 = var10;
                              var10 += 8;
                              String var43 = var12.substring(var60, var10);
                              int var61 = 59713;
                              int var84 = var34 ^ 809837829;
                              short var111 = 30025;
                              byte[] var15 = var43.getBytes("ISO-8859-1");
                              long[] var44 = var14;
                              var60 = var11++;
                              long var85 = (var15[0] & 255L) << a(-439572975, var34 ^ 1822159002)
                                 | (var15[1] & 255L) << a(-439572976, var34 ^ 240025100)
                                 | (var15[2] & 255L) << a(-439572961, var34 ^ -412378566)
                                 | (var15[3] & 255L) << a(-439572962, var34 ^ -259939263)
                                 | (var15[4] & 255L) << a(-439572963, var34 ^ -1272037302)
                                 | (var15[5] & 255L) << a(-439572964, var34 ^ -1511766)
                                 | (var15[a(-439572965, var34 ^ 425920905)] & 255L) << a(-439572966, var34 ^ -1205591674)
                                 | var15[a(-439572967, var34 ^ 1718455225)] & 255L;
                              short var112 = -1;

                              while (true) {
                                 long var127 = var85 ^ var8;
                                 switch (var112) {
                                    case 0:
                                       var44[var60] = var127;
                                       if (var10 >= var13) {
                                          ababa = var14;
                                          baaa = new Integer[a(-439572945, var34 ^ -1744466829)];
                                          babab = aaab(a(-439572946, var34 ^ 627329110), 4264462916469302155L);
                                          ba = aaab(a(-439572947, var34 ^ 1191778496), 5253091383227762678L);
                                          long var0 = 8370353033313978384L;
                                          long[] var6 = new long[a(-439572948, var34 ^ -1670268328)];
                                          int var3 = 0;
                                          String var4;
                                          int var5 = (var4 = b((short)167, var34 ^ -501868001, 30028)).length();
                                          byte var2 = 0;

                                          label105:
                                          while (true) {
                                             short var65 = var2;
                                             var2 += 8;
                                             String var46 = var4.substring(var65, var2);
                                             var61 = (char)60303;
                                             int var88 = var34 ^ 1413614828;
                                             var112 = 30029;
                                             byte[] var7 = var46.getBytes("ISO-8859-1");
                                             long[] var47 = var6;
                                             var61 = var3++;
                                             long var89 = (var7[0] & 255L) << a(-439572949, var34 ^ -1189048641)
                                                | (var7[1] & 255L) << a(-439572950, var34 ^ -482436249)
                                                | (var7[2] & 255L) << a(-439572951, var34 ^ -1646519616)
                                                | (var7[3] & 255L) << a(-439572952, var34 ^ 1010510972)
                                                | (var7[4] & 255L) << a(-439572937, var34 ^ 540822658)
                                                | (var7[5] & 255L) << a(-439572938, var34 ^ -1124204471)
                                                | (var7[a(-439572939, var34 ^ 141863762)] & 255L) << a(-439572940, var34 ^ -291133348)
                                                | var7[a(-439572941, var34 ^ 1743853883)] & 255L;
                                             short var116 = -1;

                                             while (true) {
                                                var127 = var89 ^ var0;
                                                switch (var116) {
                                                   case 0:
                                                      var47[var61] = var127;
                                                      if (var2 >= var5) {
                                                         aba = var6;
                                                         abbbb = new Long[a(-439572935, var34 ^ 646574580)];
                                                         ab = aabba(a(-439572936, var34 ^ 1679383540), 5869820074681673600L);
                                                         aa = aabba(a(-439572921, var34 ^ 1308752535), 1179915869366202116L);
                                                         ababb = aabba(a(-439572922, var34 ^ 1648692853), 2248660287649253125L);
                                                         abaaa = aabbaaaba.aaab(
                                                            babab(a(-439572923, var34 ^ 2006465125), a(-439572924, var34 ^ 1710926159))
                                                         );
                                                         baba = aabbaaaba.aaab(
                                                            babab(a(-439572925, var34 ^ -236346068), a(-439572926, var34 ^ -1016681816))
                                                         );
                                                         aabba = aabbaaaba.aaab(
                                                            babab(a(-439572927, var34 ^ -1388867843), a(-439572928, var34 ^ 94013464))
                                                         );
                                                         bbbb = aabbaaaba.aaab(
                                                            babab(a(-439572913, var34 ^ -1885380769), a(-439572914, var34 ^ 1601587434))
                                                         );
                                                         baaba = List.of(
                                                            new aaaa(aabba, aabba),
                                                            new aaaa(bbbb, bbbb)
                                                         );
                                                         return;
                                                      }
                                                      break;
                                                   default:
                                                      var47[var61] = var127;
                                                      if (var2 < var5) {
                                                         continue label105;
                                                      }

                                                      var5 = (var4 = b((short)11967, var34 ^ 344350795, 30018)).length();
                                                      var2 = 0;
                                                }

                                                var65 = var2;
                                                var2 += 8;
                                                String var48 = var4.substring(var65, var2);
                                                var65 = 11946;
                                                int var91 = var34 ^ -1197401432;
                                                var116 = 30019;
                                                var7 = var48.getBytes("ISO-8859-1");
                                                var47 = var6;
                                                var61 = var3++;
                                                var89 = (var7[0] & 255L) << a(-439572942, var34 ^ 629026271)
                                                   | (var7[1] & 255L) << a(-439572943, var34 ^ -1523008733)
                                                   | (var7[2] & 255L) << a(-439572944, var34 ^ -81498234)
                                                   | (var7[3] & 255L) << a(-439572929, var34 ^ -456288809)
                                                   | (var7[4] & 255L) << a(-439572930, var34 ^ 1132206597)
                                                   | (var7[5] & 255L) << a(-439572931, var34 ^ -1293377203)
                                                   | (var7[a(-439572932, var34 ^ 495390751)] & 255L) << a(-439572933, var34 ^ -38889128)
                                                   | var7[a(-439572934, var34 ^ 468084609)] & 255L;
                                                var116 = 0;
                                             }
                                          }
                                       }
                                       break;
                                    default:
                                       var44[var60] = var127;
                                       if (var10 < var13) {
                                          continue label115;
                                       }

                                       var13 = (var12 = b((short)'\udf7d', var34 ^ -490385813, 30030)).length();
                                       var10 = 0;
                                 }

                                 byte var63 = var10;
                                 var10 += 8;
                                 String var45 = var12.substring(var63, var10);
                                 char var64 = '鲉';
                                 int var87 = var34 ^ 1397031213;
                                 var112 = 30031;
                                 var15 = var45.getBytes("ISO-8859-1");
                                 var44 = var14;
                                 var60 = var11++;
                                 var85 = (var15[0] & 255L) << a(-439572968, var34 ^ -895586620)
                                    | (var15[1] & 255L) << a(-439572953, var34 ^ -1946500610)
                                    | (var15[2] & 255L) << a(-439572954, var34 ^ -1176975880)
                                    | (var15[3] & 255L) << a(-439572955, var34 ^ -675765356)
                                    | (var15[4] & 255L) << a(-439572956, var34 ^ -1508057232)
                                    | (var15[5] & 255L) << a(-439572957, var34 ^ -1269753563)
                                    | (var15[a(-439572958, var34 ^ 1753095476)] & 255L) << a(-439572959, var34 ^ 411159313)
                                    | var15[a(-439572960, var34 ^ 750361447)] & 255L;
                                 var112 = 0;
                              }
                           }
                        }

                        var17 = var18.charAt(var38);
                        break;
                     default:
                        var21[var19++] = var110;
                        if ((var38 += var17) < var20) {
                           var17 = var18.charAt(var38);
                           continue label141;
                        }

                        var20 = (var18 = b((short)'鞋', var34 ^ -1979954309, 30027)).length();
                        var17 = a(-439572981, var34 ^ -1789049657);
                        var38 = -1;
                  }

                  var41 = var18.substring(++var38, var38 + var17);
                  var10001 = (byte)0;
               }
            }
         }

         do {
            var29 = var25[var27] ^ var23;
            char[] var31 = var24.substring(var28, var28 + var29).toCharArray();
            int var32 = 0;

            do {
               short var33 = switch (var32 % 5) {
                  default -> 200;
                  case 1 -> 31;
                  case 2 -> 170;
                  case 3 -> 97;
                  case 4 -> 26;
               };
               var31[var32] = (char)(var31[var32] ^ var33);
            } while (++var32 < var31.length);

            var26[var27] = new String(var31).intern();
            var28 += var29;
         } while (++var27 < var25.length);

         var30 = 0;
      }
   }

   private void aaaaab(JsonObject param1) {
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
      // 09: ifnull 3f
      // 0c: goto 10
      // 0f: athrow
      // 10: aload 1
      // 11: iload 2
      // 12: ifne 65
      // 15: ldc_w -439572628
      // 18: ldc_w 855460280
      // 1b: ldc_w 1821443686
      // 1e: ixor
      // 1f: invokestatic qeaa361f143ee4a0894bd168fd9b30c66/qf4ccf8f5435d4a78bdca4d6a018b578e/abaaabbba.a (II)I
      // 22: ldc_w -439572629
      // 25: ldc_w 855460280
      // 28: ldc_w 1492560312
      // 2b: ixor
      // 2c: invokestatic qeaa361f143ee4a0894bd168fd9b30c66/qf4ccf8f5435d4a78bdca4d6a018b578e/abaaabbba.a (II)I
      // 2f: invokestatic qeaa361f143ee4a0894bd168fd9b30c66/qf4ccf8f5435d4a78bdca4d6a018b578e/abaaabbba.babab (II)Ljava/lang/String;
      // 32: invokestatic qeaa361f143ee4a0894bd168fd9b30c66/qf4ccf8f5435d4a78bdca4d6a018b578e/aabbaaaba.abba (Ljava/lang/String;)Ljava/lang/String;
      // 35: invokevirtual com/google/gson/JsonObject.has (Ljava/lang/String;)Z
      // 38: ifne 41
      // 3b: goto 3f
      // 3e: athrow
      // 3f: return
      // 40: athrow
      // 41: aload 1
      // 42: ldc_w -439572630
      // 45: ldc_w 855460280
      // 48: ldc_w 46861189
      // 4b: ixor
      // 4c: invokestatic qeaa361f143ee4a0894bd168fd9b30c66/qf4ccf8f5435d4a78bdca4d6a018b578e/abaaabbba.a (II)I
      // 4f: ldc_w -439572631
      // 52: ldc_w 855460280
      // 55: ldc_w -1222231317
      // 58: ixor
      // 59: invokestatic qeaa361f143ee4a0894bd168fd9b30c66/qf4ccf8f5435d4a78bdca4d6a018b578e/abaaabbba.a (II)I
      // 5c: invokestatic qeaa361f143ee4a0894bd168fd9b30c66/qf4ccf8f5435d4a78bdca4d6a018b578e/abaaabbba.babab (II)Ljava/lang/String;
      // 5f: invokestatic qeaa361f143ee4a0894bd168fd9b30c66/qf4ccf8f5435d4a78bdca4d6a018b578e/aabbaaaba.abba (Ljava/lang/String;)Ljava/lang/String;
      // 62: invokevirtual com/google/gson/JsonObject.getAsJsonObject (Ljava/lang/String;)Lcom/google/gson/JsonObject;
      // 65: astore 3
      // 66: aload 3
      // 67: iload 2
      // 68: ifne 7e
      // 6b: ifnonnull 73
      // 6e: goto 72
      // 71: athrow
      // 72: return
      // 73: aload 3
      // 74: aload 0
      // 75: getfield qeaa361f143ee4a0894bd168fd9b30c66/qf4ccf8f5435d4a78bdca4d6a018b578e/abaaabbba.bb Lqeaa361f143ee4a0894bd168fd9b30c66/qf4ccf8f5435d4a78bdca4d6a018b578e/abaabbbb;
      // 78: invokevirtual qeaa361f143ee4a0894bd168fd9b30c66/qf4ccf8f5435d4a78bdca4d6a018b578e/abaabbbb.baab ()J
      // 7b: invokestatic qeaa361f143ee4a0894bd168fd9b30c66/qf4ccf8f5435d4a78bdca4d6a018b578e/abaaabbba.abbbbab (Lcom/google/gson/JsonObject;J)Lcom/google/gson/JsonElement;
      // 7e: astore 4
      // 80: aload 4
      // 82: iload 2
      // 83: ifne 8f
      // 86: ifnull bb
      // 89: goto 8d
      // 8c: athrow
      // 8d: aload 4
      // 8f: iload 2
      // 90: ifne a3
      // 93: invokevirtual com/google/gson/JsonElement.isJsonPrimitive ()Z
      // 96: ifeq bb
      // 99: goto 9d
      // 9c: athrow
      // 9d: aload 4
      // 9f: goto a3
      // a2: athrow
      // a3: invokevirtual com/google/gson/JsonElement.getAsJsonPrimitive ()Lcom/google/gson/JsonPrimitive;
      // a6: invokevirtual com/google/gson/JsonPrimitive.isBoolean ()Z
      // a9: ifeq bb
      // ac: aload 3
      // ad: aload 0
      // ae: getfield qeaa361f143ee4a0894bd168fd9b30c66/qf4ccf8f5435d4a78bdca4d6a018b578e/abaaabbba.bb Lqeaa361f143ee4a0894bd168fd9b30c66/qf4ccf8f5435d4a78bdca4d6a018b578e/abaabbbb;
      // b1: invokevirtual qeaa361f143ee4a0894bd168fd9b30c66/qf4ccf8f5435d4a78bdca4d6a018b578e/abaabbbb.baab ()J
      // b4: invokestatic qeaa361f143ee4a0894bd168fd9b30c66/qf4ccf8f5435d4a78bdca4d6a018b578e/abaaabbba.baaabaa (Lcom/google/gson/JsonObject;J)V
      // b7: goto bb
      // ba: athrow
      // bb: return
   }

   public boolean aaaaba(class_1309 var1) {
      return aabbabbbb.abaabb(var1);
   }

   private void aaaabb(long param1) {
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
      // 06: ifne 18
      // 09: getfield qeaa361f143ee4a0894bd168fd9b30c66/qf4ccf8f5435d4a78bdca4d6a018b578e/abaaabbba.abaab I
      // 0c: iflt 39
      // 0f: goto 13
      // 12: athrow
      // 13: aload 0
      // 14: goto 18
      // 17: athrow
      // 18: getfield qeaa361f143ee4a0894bd168fd9b30c66/qf4ccf8f5435d4a78bdca4d6a018b578e/abaaabbba.abaab I
      // 1b: iload 3
      // 1c: ifne 47
      // 1f: ldc_w -439572632
      // 22: ldc_w -1952405574
      // 25: ldc_w 554498758
      // 28: ixor
      // 29: invokestatic qeaa361f143ee4a0894bd168fd9b30c66/qf4ccf8f5435d4a78bdca4d6a018b578e/abaaabbba.a (II)I
      // 2c: ldc2_w 715137804382549189
      // 2f: invokestatic qeaa361f143ee4a0894bd168fd9b30c66/qf4ccf8f5435d4a78bdca4d6a018b578e/abaaabbba.aaab (IJ)I
      // 32: if_icmplt 3b
      // 35: goto 39
      // 38: athrow
      // 39: return
      // 3a: athrow
      // 3b: aload 0
      // 3c: iload 3
      // 3d: ifne 72
      // 40: getfield qeaa361f143ee4a0894bd168fd9b30c66/qf4ccf8f5435d4a78bdca4d6a018b578e/abaaabbba.bbaa I
      // 43: goto 47
      // 46: athrow
      // 47: aload 0
      // 48: getfield qeaa361f143ee4a0894bd168fd9b30c66/qf4ccf8f5435d4a78bdca4d6a018b578e/abaaabbba.abaab I
      // 4b: if_icmpne 50
      // 4e: return
      // 4f: athrow
      // 50: aload 0
      // 51: aload 0
      // 52: getfield qeaa361f143ee4a0894bd168fd9b30c66/qf4ccf8f5435d4a78bdca4d6a018b578e/abaaabbba.abaab I
      // 55: putfield qeaa361f143ee4a0894bd168fd9b30c66/qf4ccf8f5435d4a78bdca4d6a018b578e/abaaabbba.bbaa I
      // 58: aload 0
      // 59: lload 1
      // 5a: ldc_w -439572617
      // 5d: ldc_w -1952405574
      // 60: ldc_w -1242891838
      // 63: ixor
      // 64: invokestatic qeaa361f143ee4a0894bd168fd9b30c66/qf4ccf8f5435d4a78bdca4d6a018b578e/abaaabbba.a (II)I
      // 67: ldc2_w 5641089399978137775
      // 6a: invokestatic qeaa361f143ee4a0894bd168fd9b30c66/qf4ccf8f5435d4a78bdca4d6a018b578e/abaaabbba.aabba (IJ)J
      // 6d: ladd
      // 6e: putfield qeaa361f143ee4a0894bd168fd9b30c66/qf4ccf8f5435d4a78bdca4d6a018b578e/abaaabbba.babb J
      // 71: aload 0
      // 72: bipush 0
      // 73: putfield qeaa361f143ee4a0894bd168fd9b30c66/qf4ccf8f5435d4a78bdca4d6a018b578e/abaaabbba.aaaaba Z
      // 76: return
   }

   private void aaabaa(class_310 param1, long param2) {
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
      // 006: aload 1
      // 007: aload 0
      // 008: getfield qeaa361f143ee4a0894bd168fd9b30c66/qf4ccf8f5435d4a78bdca4d6a018b578e/abaaabbba.aab Lnet/minecraft/class_1309;
      // 00b: invokevirtual qeaa361f143ee4a0894bd168fd9b30c66/qf4ccf8f5435d4a78bdca4d6a018b578e/abaaabbba.bba (Lnet/minecraft/class_310;Lnet/minecraft/class_1309;)Z
      // 00e: iload 4
      // 010: ifne 029
      // 013: ifne 021
      // 016: goto 01a
      // 019: athrow
      // 01a: aload 0
      // 01b: lload 2
      // 01c: invokevirtual qeaa361f143ee4a0894bd168fd9b30c66/qf4ccf8f5435d4a78bdca4d6a018b578e/abaaabbba.aaaaaa (J)V
      // 01f: return
      // 020: athrow
      // 021: aload 1
      // 022: aload 0
      // 023: getfield qeaa361f143ee4a0894bd168fd9b30c66/qf4ccf8f5435d4a78bdca4d6a018b578e/abaaabbba.aab Lnet/minecraft/class_1309;
      // 026: invokestatic qeaa361f143ee4a0894bd168fd9b30c66/qf4ccf8f5435d4a78bdca4d6a018b578e/aabbabbbb.bbaabb (Lnet/minecraft/class_310;Lnet/minecraft/class_1297;)Z
      // 029: iload 4
      // 02b: ifne 048
      // 02e: ifeq 036
      // 031: goto 035
      // 034: athrow
      // 035: return
      // 036: aload 0
      // 037: iload 4
      // 039: ifne 085
      // 03c: aload 1
      // 03d: aload 0
      // 03e: getfield qeaa361f143ee4a0894bd168fd9b30c66/qf4ccf8f5435d4a78bdca4d6a018b578e/abaaabbba.aabaa I
      // 041: invokevirtual qeaa361f143ee4a0894bd168fd9b30c66/qf4ccf8f5435d4a78bdca4d6a018b578e/abaaabbba.bbabb (Lnet/minecraft/class_310;I)Z
      // 044: goto 048
      // 047: athrow
      // 048: ifne 084
      // 04b: lload 2
      // 04c: aload 0
      // 04d: getfield qeaa361f143ee4a0894bd168fd9b30c66/qf4ccf8f5435d4a78bdca4d6a018b578e/abaaabbba.babbb J
      // 050: lsub
      // 051: ldc_w -439572618
      // 054: ldc_w 1950183107
      // 057: ldc_w 631861357
      // 05a: ixor
      // 05b: invokestatic qeaa361f143ee4a0894bd168fd9b30c66/qf4ccf8f5435d4a78bdca4d6a018b578e/abaaabbba.a (II)I
      // 05e: ldc2_w 8689198883502458365
      // 061: invokestatic qeaa361f143ee4a0894bd168fd9b30c66/qf4ccf8f5435d4a78bdca4d6a018b578e/abaaabbba.aabba (IJ)J
      // 064: lcmp
      // 065: ifle 07a
      // 068: goto 06c
      // 06b: athrow
      // 06c: aload 0
      // 06d: lload 2
      // 06e: invokevirtual qeaa361f143ee4a0894bd168fd9b30c66/qf4ccf8f5435d4a78bdca4d6a018b578e/abaaabbba.aaaaaa (J)V
      // 071: iload 4
      // 073: ifeq 083
      // 076: goto 07a
      // 079: athrow
      // 07a: aload 0
      // 07b: lload 2
      // 07c: putfield qeaa361f143ee4a0894bd168fd9b30c66/qf4ccf8f5435d4a78bdca4d6a018b578e/abaaabbba.abb J
      // 07f: goto 083
      // 082: athrow
      // 083: return
      // 084: aload 0
      // 085: aload 1
      // 086: aload 0
      // 087: getfield qeaa361f143ee4a0894bd168fd9b30c66/qf4ccf8f5435d4a78bdca4d6a018b578e/abaaabbba.aab Lnet/minecraft/class_1309;
      // 08a: invokevirtual qeaa361f143ee4a0894bd168fd9b30c66/qf4ccf8f5435d4a78bdca4d6a018b578e/abaaabbba.abaabb (Lnet/minecraft/class_310;Lnet/minecraft/class_1309;)Z
      // 08d: istore 5
      // 08f: iload 5
      // 091: iload 4
      // 093: ifne 0b9
      // 096: ifeq 0b7
      // 099: goto 09d
      // 09c: athrow
      // 09d: aload 1
      // 09e: getfield net/minecraft/class_310.field_1724 Lnet/minecraft/class_746;
      // 0a1: ifnull 0b7
      // 0a4: goto 0a8
      // 0a7: athrow
      // 0a8: aload 0
      // 0a9: aload 1
      // 0aa: getfield net/minecraft/class_310.field_1724 Lnet/minecraft/class_746;
      // 0ad: getfield net/minecraft/class_746.field_6012 I
      // 0b0: putfield qeaa361f143ee4a0894bd168fd9b30c66/qf4ccf8f5435d4a78bdca4d6a018b578e/abaaabbba.aaaa I
      // 0b3: goto 0b7
      // 0b6: athrow
      // 0b7: iload 5
      // 0b9: iload 4
      // 0bb: ifne 0d8
      // 0be: ifeq 118
      // 0c1: goto 0c5
      // 0c4: athrow
      // 0c5: aload 0
      // 0c6: iload 4
      // 0c8: ifne 103
      // 0cb: goto 0cf
      // 0ce: athrow
      // 0cf: aload 1
      // 0d0: lload 2
      // 0d1: invokevirtual qeaa361f143ee4a0894bd168fd9b30c66/qf4ccf8f5435d4a78bdca4d6a018b578e/abaaabbba.baaa (Lnet/minecraft/class_310;J)Z
      // 0d4: goto 0d8
      // 0d7: athrow
      // 0d8: ifeq 0f3
      // 0db: lload 2
      // 0dc: aload 0
      // 0dd: getfield qeaa361f143ee4a0894bd168fd9b30c66/qf4ccf8f5435d4a78bdca4d6a018b578e/abaaabbba.abb J
      // 0e0: lcmp
      // 0e1: iflt 0f2
      // 0e4: goto 0e8
      // 0e7: athrow
      // 0e8: aload 0
      // 0e9: aload 1
      // 0ea: lload 2
      // 0eb: invokevirtual qeaa361f143ee4a0894bd168fd9b30c66/qf4ccf8f5435d4a78bdca4d6a018b578e/abaaabbba.aaaaa (Lnet/minecraft/class_310;J)V
      // 0ee: goto 0f2
      // 0f1: athrow
      // 0f2: return
      // 0f3: aload 0
      // 0f4: iload 4
      // 0f6: ifne 119
      // 0f9: getfield qeaa361f143ee4a0894bd168fd9b30c66/qf4ccf8f5435d4a78bdca4d6a018b578e/abaaabbba.babba Lqeaa361f143ee4a0894bd168fd9b30c66/qf4ccf8f5435d4a78bdca4d6a018b578e/abbaaaaa;
      // 0fc: invokevirtual qeaa361f143ee4a0894bd168fd9b30c66/qf4ccf8f5435d4a78bdca4d6a018b578e/abbaaaaa.abbb ()Ljava/lang/Object;
      // 0ff: goto 103
      // 102: athrow
      // 103: checkcast java/lang/Boolean
      // 106: invokevirtual java/lang/Boolean.booleanValue ()Z
      // 109: ifeq 118
      // 10c: aload 0
      // 10d: aload 1
      // 10e: aload 0
      // 10f: getfield qeaa361f143ee4a0894bd168fd9b30c66/qf4ccf8f5435d4a78bdca4d6a018b578e/abaaabbba.aab Lnet/minecraft/class_1309;
      // 112: lload 2
      // 113: invokevirtual qeaa361f143ee4a0894bd168fd9b30c66/qf4ccf8f5435d4a78bdca4d6a018b578e/abaaabbba.bbaba (Lnet/minecraft/class_310;Lnet/minecraft/class_1309;J)V
      // 116: return
      // 117: athrow
      // 118: aload 0
      // 119: lload 2
      // 11a: invokevirtual qeaa361f143ee4a0894bd168fd9b30c66/qf4ccf8f5435d4a78bdca4d6a018b578e/abaaabbba.aaaaaa (J)V
      // 11d: return
   }

   private void aaabab(class_310 param1, long param2) {
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
      // 06: iload 4
      // 08: ifne 2b
      // 0b: getfield qeaa361f143ee4a0894bd168fd9b30c66/qf4ccf8f5435d4a78bdca4d6a018b578e/abaaabbba.babba Lqeaa361f143ee4a0894bd168fd9b30c66/qf4ccf8f5435d4a78bdca4d6a018b578e/abbaaaaa;
      // 0e: invokevirtual qeaa361f143ee4a0894bd168fd9b30c66/qf4ccf8f5435d4a78bdca4d6a018b578e/abbaaaaa.abbb ()Ljava/lang/Object;
      // 11: checkcast java/lang/Boolean
      // 14: invokevirtual java/lang/Boolean.booleanValue ()Z
      // 17: ifeq 2a
      // 1a: goto 1e
      // 1d: athrow
      // 1e: aload 0
      // 1f: aload 1
      // 20: aload 0
      // 21: getfield qeaa361f143ee4a0894bd168fd9b30c66/qf4ccf8f5435d4a78bdca4d6a018b578e/abaaabbba.aab Lnet/minecraft/class_1309;
      // 24: lload 2
      // 25: invokevirtual qeaa361f143ee4a0894bd168fd9b30c66/qf4ccf8f5435d4a78bdca4d6a018b578e/abaaabbba.bbaba (Lnet/minecraft/class_310;Lnet/minecraft/class_1309;J)V
      // 28: return
      // 29: athrow
      // 2a: aload 0
      // 2b: lload 2
      // 2c: invokevirtual qeaa361f143ee4a0894bd168fd9b30c66/qf4ccf8f5435d4a78bdca4d6a018b578e/abaaabbba.aaaaaa (J)V
      // 2f: return
   }

   private boolean aaabba(class_310 param1) {
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
      // 05: invokevirtual qeaa361f143ee4a0894bd168fd9b30c66/qf4ccf8f5435d4a78bdca4d6a018b578e/abaaabbba.babbaab ()Z
      // 08: iload 2
      // 09: ifne ad
      // 0c: ifeq a8
      // 0f: goto 13
      // 12: athrow
      // 13: aload 1
      // 14: iload 2
      // 15: ifne 24
      // 18: goto 1c
      // 1b: athrow
      // 1c: ifnull a8
      // 1f: goto 23
      // 22: athrow
      // 23: aload 1
      // 24: iload 2
      // 25: ifne 37
      // 28: getfield net/minecraft/class_310.field_1724 Lnet/minecraft/class_746;
      // 2b: ifnull a8
      // 2e: goto 32
      // 31: athrow
      // 32: aload 1
      // 33: goto 37
      // 36: athrow
      // 37: iload 2
      // 38: ifne 4a
      // 3b: getfield net/minecraft/class_310.field_1687 Lnet/minecraft/class_638;
      // 3e: ifnull a8
      // 41: goto 45
      // 44: athrow
      // 45: aload 1
      // 46: goto 4a
      // 49: athrow
      // 4a: iload 2
      // 4b: ifne 5d
      // 4e: getfield net/minecraft/class_310.field_1761 Lnet/minecraft/class_636;
      // 51: ifnull a8
      // 54: goto 58
      // 57: athrow
      // 58: aload 1
      // 59: goto 5d
      // 5c: athrow
      // 5d: iload 2
      // 5e: ifne 70
      // 61: getfield net/minecraft/class_310.field_1690 Lnet/minecraft/class_315;
      // 64: ifnull a8
      // 67: goto 6b
      // 6a: athrow
      // 6b: aload 1
      // 6c: goto 70
      // 6f: athrow
      // 70: iload 2
      // 71: ifne 83
      // 74: getfield net/minecraft/class_310.field_1755 Lnet/minecraft/class_437;
      // 77: ifnonnull a8
      // 7a: goto 7e
      // 7d: athrow
      // 7e: aload 1
      // 7f: goto 83
      // 82: athrow
      // 83: getfield net/minecraft/class_310.field_1724 Lnet/minecraft/class_746;
      // 86: invokevirtual net/minecraft/class_746.method_5805 ()Z
      // 89: iload 2
      // 8a: ifne ad
      // 8d: ifeq a8
      // 90: goto 94
      // 93: athrow
      // 94: aload 0
      // 95: iload 2
      // 96: ifne af
      // 99: goto 9d
      // 9c: athrow
      // 9d: aload 1
      // 9e: invokevirtual qeaa361f143ee4a0894bd168fd9b30c66/qf4ccf8f5435d4a78bdca4d6a018b578e/abaaabbba.aabb (Lnet/minecraft/class_310;)Z
      // a1: ifeq ae
      // a4: goto a8
      // a7: athrow
      // a8: bipush 0
      // a9: goto ad
      // ac: athrow
      // ad: ireturn
      // ae: aload 0
      // af: aload 1
      // b0: invokevirtual qeaa361f143ee4a0894bd168fd9b30c66/qf4ccf8f5435d4a78bdca4d6a018b578e/abaaabbba.baaba (Lnet/minecraft/class_310;)Z
      // b3: iload 2
      // b4: ifne c2
      // b7: ifne c1
      // ba: goto be
      // bd: athrow
      // be: bipush 0
      // bf: ireturn
      // c0: athrow
      // c1: bipush 1
      // c2: ireturn
   }

   private boolean aaabbb() {
      // $VF: Couldn't be decompiled
      // Please report this to the Vineflower issue tracker, at https://github.com/Vineflower/vineflower/issues with a copy of the class file (if you have the rights to distribute it!)
      // java.lang.RuntimeException: parsing failure!
      //   at org.jetbrains.java.decompiler.modules.decompiler.decompose.DomHelper.parseGraph(DomHelper.java:211)
      //   at org.jetbrains.java.decompiler.main.rels.MethodProcessor.codeToJava(MethodProcessor.java:166)
      //
      // Bytecode:
      // 00: getstatic qeaa361f143ee4a0894bd168fd9b30c66/qf4ccf8f5435d4a78bdca4d6a018b578e/baaabbaa.bba I
      // 03: aload 0
      // 04: getfield qeaa361f143ee4a0894bd168fd9b30c66/qf4ccf8f5435d4a78bdca4d6a018b578e/abaaabbba.bbbaa Lqeaa361f143ee4a0894bd168fd9b30c66/qf4ccf8f5435d4a78bdca4d6a018b578e/bababa;
      // 07: invokevirtual qeaa361f143ee4a0894bd168fd9b30c66/qf4ccf8f5435d4a78bdca4d6a018b578e/bababa.abbb ()Ljava/lang/Object;
      // 0a: checkcast java/lang/Double
      // 0d: invokevirtual java/lang/Double.doubleValue ()D
      // 10: dstore 2
      // 11: istore 1
      // 12: dload 2
      // 13: ldc2_w 100.0
      // 16: iload 1
      // 17: ifne 27
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

   private boolean aabaaa(class_310 param1) {
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
      // 05: aload 1
      // 06: iload 2
      // 07: ifne 19
      // 0a: invokevirtual qeaa361f143ee4a0894bd168fd9b30c66/qf4ccf8f5435d4a78bdca4d6a018b578e/abaaabbba.bbbaa (Lnet/minecraft/class_310;)Z
      // 0d: ifne 17
      // 10: goto 14
      // 13: athrow
      // 14: bipush 0
      // 15: ireturn
      // 16: athrow
      // 17: aload 0
      // 18: aload 1
      // 19: aload 0
      // 1a: getfield qeaa361f143ee4a0894bd168fd9b30c66/qf4ccf8f5435d4a78bdca4d6a018b578e/abaaabbba.aabb I
      // 1d: invokevirtual qeaa361f143ee4a0894bd168fd9b30c66/qf4ccf8f5435d4a78bdca4d6a018b578e/abaaabbba.bbabb (Lnet/minecraft/class_310;I)Z
      // 20: ireturn
   }

   private int aabaab(class_310 param1) {
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
      // 11: getfield net/minecraft/class_310.field_1724 Lnet/minecraft/class_746;
      // 14: ifnonnull 1a
      // 17: bipush -1
      // 18: ireturn
      // 19: athrow
      // 1a: bipush 0
      // 1b: istore 3
      // 1c: iload 3
      // 1d: ldc_w -439572619
      // 20: ldc_w -1807310929
      // 23: ldc_w 1105610034
      // 26: ixor
      // 27: invokestatic qeaa361f143ee4a0894bd168fd9b30c66/qf4ccf8f5435d4a78bdca4d6a018b578e/abaaabbba.a (II)I
      // 2a: ldc2_w 715137804382549189
      // 2d: invokestatic qeaa361f143ee4a0894bd168fd9b30c66/qf4ccf8f5435d4a78bdca4d6a018b578e/abaaabbba.aaab (IJ)I
      // 30: if_icmpge 70
      // 33: aload 1
      // 34: getfield net/minecraft/class_310.field_1724 Lnet/minecraft/class_746;
      // 37: invokevirtual net/minecraft/class_746.method_31548 ()Lnet/minecraft/class_1661;
      // 3a: iload 3
      // 3b: invokevirtual net/minecraft/class_1661.method_5438 (I)Lnet/minecraft/class_1799;
      // 3e: astore 4
      // 40: iload 2
      // 41: ifne 6c
      // 44: aload 4
      // 46: ifnull 69
      // 49: goto 4d
      // 4c: athrow
      // 4d: aload 4
      // 4f: getstatic net/minecraft/class_1802.field_8786 Lnet/minecraft/class_1792;
      // 52: invokevirtual net/minecraft/class_1799.method_31574 (Lnet/minecraft/class_1792;)Z
      // 55: iload 2
      // 56: ifne 68
      // 59: goto 5d
      // 5c: athrow
      // 5d: ifne 67
      // 60: goto 64
      // 63: athrow
      // 64: goto 69
      // 67: iload 3
      // 68: ireturn
      // 69: iinc 3 1
      // 6c: iload 2
      // 6d: ifeq 1c
      // 70: bipush -1
      // 71: ireturn
   }

   private boolean aababa(class_310 param1, class_1309 param2) {
      // $VF: Couldn't be decompiled
      // Please report this to the Vineflower issue tracker, at https://github.com/Vineflower/vineflower/issues with a copy of the class file (if you have the rights to distribute it!)
      // java.lang.NullPointerException: Cannot invoke "org.jetbrains.java.decompiler.code.cfg.ExceptionRangeCFG.isCircular()" because "range" is null
      //   at org.jetbrains.java.decompiler.modules.decompiler.decompose.DomHelper.graphToStatement(DomHelper.java:84)
      //   at org.jetbrains.java.decompiler.modules.decompiler.decompose.DomHelper.parseGraph(DomHelper.java:203)
      //   at org.jetbrains.java.decompiler.main.rels.MethodProcessor.codeToJava(MethodProcessor.java:166)
      //
      // Bytecode:
      // 000: getstatic qeaa361f143ee4a0894bd168fd9b30c66/qf4ccf8f5435d4a78bdca4d6a018b578e/baaabbaa.bba I
      // 003: istore 3
      // 004: aload 2
      // 005: ifnull 032
      // 008: aload 1
      // 009: iload 3
      // 00a: ifne 019
      // 00d: goto 011
      // 010: athrow
      // 011: ifnull 032
      // 014: goto 018
      // 017: athrow
      // 018: aload 1
      // 019: iload 3
      // 01a: ifne 02c
      // 01d: getfield net/minecraft/class_310.field_1724 Lnet/minecraft/class_746;
      // 020: ifnull 032
      // 023: goto 027
      // 026: athrow
      // 027: aload 1
      // 028: goto 02c
      // 02b: athrow
      // 02c: getfield net/minecraft/class_310.field_1761 Lnet/minecraft/class_636;
      // 02f: ifnonnull 035
      // 032: bipush 0
      // 033: ireturn
      // 034: athrow
      // 035: aload 2
      // 036: invokevirtual net/minecraft/class_1309.method_5805 ()Z
      // 039: iload 3
      // 03a: ifne 063
      // 03d: ifeq 057
      // 040: goto 044
      // 043: athrow
      // 044: aload 2
      // 045: invokestatic qeaa361f143ee4a0894bd168fd9b30c66/qf4ccf8f5435d4a78bdca4d6a018b578e/aabbabbbb.baabaaa (Lnet/minecraft/class_1297;)Z
      // 048: iload 3
      // 049: ifne 070
      // 04c: goto 050
      // 04f: athrow
      // 050: ifeq 064
      // 053: goto 057
      // 056: athrow
      // 057: aload 0
      // 058: invokestatic java/lang/System.currentTimeMillis ()J
      // 05b: invokevirtual qeaa361f143ee4a0894bd168fd9b30c66/qf4ccf8f5435d4a78bdca4d6a018b578e/abaaabbba.aaaaaa (J)V
      // 05e: bipush 1
      // 05f: goto 063
      // 062: athrow
      // 063: ireturn
      // 064: aload 0
      // 065: iload 3
      // 066: ifne 0b7
      // 069: getfield qeaa361f143ee4a0894bd168fd9b30c66/qf4ccf8f5435d4a78bdca4d6a018b578e/abaaabbba.aabb I
      // 06c: goto 070
      // 06f: athrow
      // 070: iflt 0a1
      // 073: aload 1
      // 074: invokestatic qeaa361f143ee4a0894bd168fd9b30c66/qf4ccf8f5435d4a78bdca4d6a018b578e/aabbabbbb.baabaab (Lnet/minecraft/class_310;)I
      // 077: iload 3
      // 078: ifne 0ba
      // 07b: goto 07f
      // 07e: athrow
      // 07f: aload 0
      // 080: getfield qeaa361f143ee4a0894bd168fd9b30c66/qf4ccf8f5435d4a78bdca4d6a018b578e/abaaabbba.aabb I
      // 083: if_icmpne 0a1
      // 086: goto 08a
      // 089: athrow
      // 08a: aload 1
      // 08b: aload 0
      // 08c: getfield qeaa361f143ee4a0894bd168fd9b30c66/qf4ccf8f5435d4a78bdca4d6a018b578e/abaaabbba.aabb I
      // 08f: invokestatic qeaa361f143ee4a0894bd168fd9b30c66/qf4ccf8f5435d4a78bdca4d6a018b578e/aabbabbbb.abaaa (Lnet/minecraft/class_310;I)Z
      // 092: iload 3
      // 093: ifne 0ba
      // 096: goto 09a
      // 099: athrow
      // 09a: ifne 0d7
      // 09d: goto 0a1
      // 0a0: athrow
      // 0a1: aload 0
      // 0a2: iload 3
      // 0a3: ifne 0c1
      // 0a6: goto 0aa
      // 0a9: athrow
      // 0aa: aload 0
      // 0ab: aload 1
      // 0ac: invokevirtual qeaa361f143ee4a0894bd168fd9b30c66/qf4ccf8f5435d4a78bdca4d6a018b578e/abaaabbba.aabaab (Lnet/minecraft/class_310;)I
      // 0af: putfield qeaa361f143ee4a0894bd168fd9b30c66/qf4ccf8f5435d4a78bdca4d6a018b578e/abaaabbba.aabb I
      // 0b2: aload 0
      // 0b3: goto 0b7
      // 0b6: athrow
      // 0b7: getfield qeaa361f143ee4a0894bd168fd9b30c66/qf4ccf8f5435d4a78bdca4d6a018b578e/abaaabbba.aabb I
      // 0ba: ifge 0c0
      // 0bd: bipush 0
      // 0be: ireturn
      // 0bf: athrow
      // 0c0: aload 0
      // 0c1: iload 3
      // 0c2: ifne 0d8
      // 0c5: aload 1
      // 0c6: aload 0
      // 0c7: getfield qeaa361f143ee4a0894bd168fd9b30c66/qf4ccf8f5435d4a78bdca4d6a018b578e/abaaabbba.aabb I
      // 0ca: invokevirtual qeaa361f143ee4a0894bd168fd9b30c66/qf4ccf8f5435d4a78bdca4d6a018b578e/abaaabbba.bbabb (Lnet/minecraft/class_310;I)Z
      // 0cd: ifne 0d7
      // 0d0: goto 0d4
      // 0d3: athrow
      // 0d4: bipush 0
      // 0d5: ireturn
      // 0d6: athrow
      // 0d7: aload 0
      // 0d8: aload 1
      // 0d9: aload 2
      // 0da: invokevirtual qeaa361f143ee4a0894bd168fd9b30c66/qf4ccf8f5435d4a78bdca4d6a018b578e/abaaabbba.aaba (Lnet/minecraft/class_310;Lnet/minecraft/class_1309;)Lqeaa361f143ee4a0894bd168fd9b30c66/qf4ccf8f5435d4a78bdca4d6a018b578e/aabaaabab;
      // 0dd: astore 4
      // 0df: iload 3
      // 0e0: ifne 11f
      // 0e3: aload 4
      // 0e5: ifnonnull 0f3
      // 0e8: goto 0ec
      // 0eb: athrow
      // 0ec: aload 0
      // 0ed: invokevirtual qeaa361f143ee4a0894bd168fd9b30c66/qf4ccf8f5435d4a78bdca4d6a018b578e/abaaabbba.abbbb ()V
      // 0f0: bipush 0
      // 0f1: ireturn
      // 0f2: athrow
      // 0f3: aload 0
      // 0f4: aload 4
      // 0f6: invokevirtual qeaa361f143ee4a0894bd168fd9b30c66/qf4ccf8f5435d4a78bdca4d6a018b578e/aabaaabab.ab ()Lnet/minecraft/class_2338;
      // 0f9: putfield qeaa361f143ee4a0894bd168fd9b30c66/qf4ccf8f5435d4a78bdca4d6a018b578e/abaaabbba.babaa Lnet/minecraft/class_2338;
      // 0fc: aload 0
      // 0fd: aload 4
      // 0ff: invokevirtual qeaa361f143ee4a0894bd168fd9b30c66/qf4ccf8f5435d4a78bdca4d6a018b578e/aabaaabab.a ()Lnet/minecraft/class_243;
      // 102: putfield qeaa361f143ee4a0894bd168fd9b30c66/qf4ccf8f5435d4a78bdca4d6a018b578e/abaaabbba.aaaaab Lnet/minecraft/class_243;
      // 105: aload 0
      // 106: aload 4
      // 108: invokevirtual qeaa361f143ee4a0894bd168fd9b30c66/qf4ccf8f5435d4a78bdca4d6a018b578e/aabaaabab.b ()Lnet/minecraft/class_3965;
      // 10b: putfield qeaa361f143ee4a0894bd168fd9b30c66/qf4ccf8f5435d4a78bdca4d6a018b578e/abaaabbba.bab Lnet/minecraft/class_3965;
      // 10e: aload 0
      // 10f: aload 0
      // 110: aload 1
      // 111: aload 0
      // 112: getfield qeaa361f143ee4a0894bd168fd9b30c66/qf4ccf8f5435d4a78bdca4d6a018b578e/abaaabbba.babaa Lnet/minecraft/class_2338;
      // 115: aload 0
      // 116: getfield qeaa361f143ee4a0894bd168fd9b30c66/qf4ccf8f5435d4a78bdca4d6a018b578e/abaaabbba.aaaaab Lnet/minecraft/class_243;
      // 119: invokevirtual qeaa361f143ee4a0894bd168fd9b30c66/qf4ccf8f5435d4a78bdca4d6a018b578e/abaaabbba.aab (Lnet/minecraft/class_310;Lnet/minecraft/class_2338;Lnet/minecraft/class_243;)Z
      // 11c: putfield qeaa361f143ee4a0894bd168fd9b30c66/qf4ccf8f5435d4a78bdca4d6a018b578e/abaaabbba.baabb Z
      // 11f: aload 0
      // 120: getfield qeaa361f143ee4a0894bd168fd9b30c66/qf4ccf8f5435d4a78bdca4d6a018b578e/abaaabbba.baabb Z
      // 123: ireturn
   }

   private static String b(short var0, int var1, int var2) {
      int var3 = var2 ^ 30026;
      char[] var4 = aaabaa[var3].toCharArray();
      StackTraceElement[] var5 = (StackTraceElement[])aaabab[var3];
      StackTraceElement[] var6;
      if (var5 != null) {
         var6 = var5;
      } else {
         var6 = new Throwable().getStackTrace();
         aaabab[var3] = var6;
      }

      StackTraceElement var7 = var6[1];
      int var8 = (var7.getClassName().hashCode() ^ var7.getMethodName().hashCode()) >> 16 ^ 13497;
      int var9 = 0;

      do {
         int var10 = var4[var9] ^ 5604;
         var10 -= 54058;
         var10 -= 2721;
         var10 -= 12166;
         var10 -= 2731;
         var10 ^= 27473;
         var10 ^= 5820;
         var4[var9] = (char)(var10 ^ var8 ^ var0 ^ var1 >> 16);
      } while (++var9 < var4.length);

      return new String(var4).intern();
   }

   private aabaaabab aabbaa(class_310 var1, List var2) {
      int var10000 = baaabbaa.bba;
      Iterator var4 = var2.iterator();
      int var3 = var10000;

      while (var4.hasNext()) {
         class_2338 var5 = (class_2338)var4.next();
         aabaaabab var6 = this.abaaa(var1, var5);

         try {
            if (var3 != 0) {
               return var6;
            }

            if (var6 != null) {
               return var6;
            }
         } catch (MatchException var7) {
            throw var7;
         }

         if (var3 != 0) {
            break;
         }
      }

      return null;
   }

   public void aabbab(class_310 var1) {
   }

   private boolean aabbbb(class_310 param1, class_2338 param2) {
      // $VF: Couldn't be decompiled
      // Please report this to the Vineflower issue tracker, at https://github.com/Vineflower/vineflower/issues with a copy of the class file (if you have the rights to distribute it!)
      // java.lang.RuntimeException: parsing failure!
      //   at org.jetbrains.java.decompiler.modules.decompiler.decompose.DomHelper.parseGraph(DomHelper.java:211)
      //   at org.jetbrains.java.decompiler.main.rels.MethodProcessor.codeToJava(MethodProcessor.java:166)
      //
      // Bytecode:
      // 00: getstatic qeaa361f143ee4a0894bd168fd9b30c66/qf4ccf8f5435d4a78bdca4d6a018b578e/baaabbaa.bba I
      // 03: istore 3
      // 04: aload 1
      // 05: iload 3
      // 06: ifne 11
      // 09: ifnull 1f
      // 0c: goto 10
      // 0f: athrow
      // 10: aload 1
      // 11: getfield net/minecraft/class_310.field_1687 Lnet/minecraft/class_638;
      // 14: ifnull 1f
      // 17: aload 2
      // 18: ifnonnull 22
      // 1b: goto 1f
      // 1e: athrow
      // 1f: bipush 0
      // 20: ireturn
      // 21: athrow
      // 22: aload 1
      // 23: getfield net/minecraft/class_310.field_1687 Lnet/minecraft/class_638;
      // 26: aload 2
      // 27: invokevirtual net/minecraft/class_638.method_8320 (Lnet/minecraft/class_2338;)Lnet/minecraft/class_2680;
      // 2a: astore 4
      // 2c: aload 4
      // 2e: iload 3
      // 2f: ifne 43
      // 32: ifnull c1
      // 35: goto 39
      // 38: athrow
      // 39: aload 4
      // 3b: iload 3
      // 3c: ifne 53
      // 3f: goto 43
      // 42: athrow
      // 43: invokevirtual net/minecraft/class_2680.method_26215 ()Z
      // 46: ifne c1
      // 49: aload 4
      // 4b: iload 3
      // 4c: ifne 62
      // 4f: goto 53
      // 52: athrow
      // 53: invokevirtual net/minecraft/class_2680.method_26227 ()Lnet/minecraft/class_3610;
      // 56: invokevirtual net/minecraft/class_3610.method_15769 ()Z
      // 59: ifeq c1
      // 5c: aload 4
      // 5e: goto 62
      // 61: athrow
      // 62: getstatic net/minecraft/class_2246.field_10382 Lnet/minecraft/class_2248;
      // 65: iload 3
      // 66: ifne 84
      // 69: invokevirtual net/minecraft/class_2680.method_27852 (Lnet/minecraft/class_2248;)Z
      // 6c: ifne c1
      // 6f: goto 73
      // 72: athrow
      // 73: aload 4
      // 75: iload 3
      // 76: ifne 90
      // 79: goto 7d
      // 7c: athrow
      // 7d: getstatic net/minecraft/class_2246.field_10164 Lnet/minecraft/class_2248;
      // 80: goto 84
      // 83: athrow
      // 84: invokevirtual net/minecraft/class_2680.method_27852 (Lnet/minecraft/class_2248;)Z
      // 87: ifne c1
      // 8a: aload 4
      // 8c: goto 90
      // 8f: athrow
      // 90: aload 1
      // 91: getfield net/minecraft/class_310.field_1687 Lnet/minecraft/class_638;
      // 94: aload 2
      // 95: invokevirtual net/minecraft/class_2680.method_26220 (Lnet/minecraft/class_1922;Lnet/minecraft/class_2338;)Lnet/minecraft/class_265;
      // 98: invokevirtual net/minecraft/class_265.method_1110 ()Z
      // 9b: iload 3
      // 9c: ifne be
      // 9f: ifeq bd
      // a2: goto a6
      // a5: athrow
      // a6: aload 4
      // a8: getstatic net/minecraft/class_2246.field_10343 Lnet/minecraft/class_2248;
      // ab: invokevirtual net/minecraft/class_2680.method_27852 (Lnet/minecraft/class_2248;)Z
      // ae: iload 3
      // af: ifne be
      // b2: goto b6
      // b5: athrow
      // b6: ifeq c1
      // b9: goto bd
      // bc: athrow
      // bd: bipush 1
      // be: goto c2
      // c1: bipush 0
      // c2: ireturn
   }

   private boolean abaaaa(class_310 param1) {
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
      // 09: ifnull 72
      // 0c: goto 10
      // 0f: athrow
      // 10: aload 1
      // 11: iload 2
      // 12: ifne 24
      // 15: getfield net/minecraft/class_310.field_1724 Lnet/minecraft/class_746;
      // 18: ifnull 72
      // 1b: goto 1f
      // 1e: athrow
      // 1f: aload 1
      // 20: goto 24
      // 23: athrow
      // 24: iload 2
      // 25: ifne 37
      // 28: getfield net/minecraft/class_310.field_1687 Lnet/minecraft/class_638;
      // 2b: ifnull 72
      // 2e: goto 32
      // 31: athrow
      // 32: aload 1
      // 33: goto 37
      // 36: athrow
      // 37: iload 2
      // 38: ifne 4a
      // 3b: getfield net/minecraft/class_310.field_1690 Lnet/minecraft/class_315;
      // 3e: ifnull 72
      // 41: goto 45
      // 44: athrow
      // 45: aload 1
      // 46: goto 4a
      // 49: athrow
      // 4a: iload 2
      // 4b: ifne 5d
      // 4e: getfield net/minecraft/class_310.field_1755 Lnet/minecraft/class_437;
      // 51: ifnonnull 72
      // 54: goto 58
      // 57: athrow
      // 58: aload 1
      // 59: goto 5d
      // 5c: athrow
      // 5d: getfield net/minecraft/class_310.field_1724 Lnet/minecraft/class_746;
      // 60: invokevirtual net/minecraft/class_746.method_5805 ()Z
      // 63: iload 2
      // 64: ifne 6f
      // 67: ifeq 72
      // 6a: goto 6e
      // 6d: athrow
      // 6e: bipush 1
      // 6f: goto 73
      // 72: bipush 0
      // 73: ireturn
   }

   private void abaaab() {
      this.bbbab = aaabaaaba.abb;
      this.babbb = 0L;
      this.abb = 0L;
      this.aab = null;
      this.aabaa = -1;
      this.abbba = -1;
      this.abaab = -1;
      this.bbb();
      this.bbaab = false;
      this.abbab = 0L;
      this.aaaa = aaab(a(-439572620, -1508371749 ^ 1282199206), 7477281668697820497L);
      this.bbab = null;
   }

   private void abaaba(class_310 var1) {
      this.baaaa(var1);
   }

   private boolean abaabb(class_310 param1, class_1309 param2) {
      // $VF: Couldn't be decompiled
      // Please report this to the Vineflower issue tracker, at https://github.com/Vineflower/vineflower/issues with a copy of the class file (if you have the rights to distribute it!)
      // java.lang.RuntimeException: parsing failure!
      //   at org.jetbrains.java.decompiler.modules.decompiler.decompose.DomHelper.parseGraph(DomHelper.java:211)
      //   at org.jetbrains.java.decompiler.main.rels.MethodProcessor.codeToJava(MethodProcessor.java:166)
      //
      // Bytecode:
      // 00: getstatic qeaa361f143ee4a0894bd168fd9b30c66/qf4ccf8f5435d4a78bdca4d6a018b578e/baaabbaa.bba I
      // 03: istore 3
      // 04: aload 1
      // 05: iload 3
      // 06: ifne 11
      // 09: ifnull 45
      // 0c: goto 10
      // 0f: athrow
      // 10: aload 1
      // 11: iload 3
      // 12: ifne 24
      // 15: getfield net/minecraft/class_310.field_1724 Lnet/minecraft/class_746;
      // 18: ifnull 45
      // 1b: goto 1f
      // 1e: athrow
      // 1f: aload 1
      // 20: goto 24
      // 23: athrow
      // 24: iload 3
      // 25: ifne 37
      // 28: getfield net/minecraft/class_310.field_1761 Lnet/minecraft/class_636;
      // 2b: ifnull 45
      // 2e: goto 32
      // 31: athrow
      // 32: aload 1
      // 33: goto 37
      // 36: athrow
      // 37: invokevirtual net/minecraft/class_310.method_1562 ()Lnet/minecraft/class_634;
      // 3a: ifnull 45
      // 3d: aload 2
      // 3e: ifnonnull 48
      // 41: goto 45
      // 44: athrow
      // 45: bipush 0
      // 46: ireturn
      // 47: athrow
      // 48: invokestatic qeaa361f143ee4a0894bd168fd9b30c66/qf4ccf8f5435d4a78bdca4d6a018b578e/aabbabbbb.babbbb ()Z
      // 4b: iload 3
      // 4c: ifne 6e
      // 4f: ifne 69
      // 52: goto 56
      // 55: athrow
      // 56: aload 1
      // 57: iload 3
      // 58: ifne 70
      // 5b: goto 5f
      // 5e: athrow
      // 5f: invokestatic qeaa361f143ee4a0894bd168fd9b30c66/qf4ccf8f5435d4a78bdca4d6a018b578e/bbbbbbaa.aabb (Lnet/minecraft/class_310;)Z
      // 62: ifeq 6f
      // 65: goto 69
      // 68: athrow
      // 69: bipush 0
      // 6a: goto 6e
      // 6d: athrow
      // 6e: ireturn
      // 6f: aload 1
      // 70: aload 2
      // 71: invokestatic qeaa361f143ee4a0894bd168fd9b30c66/qf4ccf8f5435d4a78bdca4d6a018b578e/aabbabbbb.bbaabb (Lnet/minecraft/class_310;Lnet/minecraft/class_1297;)Z
      // 74: iload 3
      // 75: ifne 80
      // 78: ifeq 81
      // 7b: goto 7f
      // 7e: athrow
      // 7f: bipush 0
      // 80: ireturn
      // 81: aload 0
      // 82: aload 1
      // 83: aload 2
      // 84: invokevirtual qeaa361f143ee4a0894bd168fd9b30c66/qf4ccf8f5435d4a78bdca4d6a018b578e/abaaabbba.abaa (Lnet/minecraft/class_310;Lnet/minecraft/class_1309;)Lnet/minecraft/class_3966;
      // 87: astore 4
      // 89: iload 3
      // 8a: ifne a5
      // 8d: aload 4
      // 8f: ifnonnull 99
      // 92: goto 96
      // 95: athrow
      // 96: bipush 0
      // 97: ireturn
      // 98: athrow
      // 99: bipush 1
      // 9a: invokestatic qeaa361f143ee4a0894bd168fd9b30c66/qf4ccf8f5435d4a78bdca4d6a018b578e/aabbabbbb.bbaaa (Z)V
      // 9d: invokestatic qeaa361f143ee4a0894bd168fd9b30c66/qf4ccf8f5435d4a78bdca4d6a018b578e/aabbabbbb.bbbbaa ()Z
      // a0: pop
      // a1: aload 1
      // a2: invokestatic qeaa361f143ee4a0894bd168fd9b30c66/qf4ccf8f5435d4a78bdca4d6a018b578e/aabbabbbb.bbbaaba (Lnet/minecraft/class_310;)V
      // a5: aload 1
      // a6: aload 4
      // a8: invokestatic qeaa361f143ee4a0894bd168fd9b30c66/qf4ccf8f5435d4a78bdca4d6a018b578e/aabbabbbb.bbabbb (Lnet/minecraft/class_310;Lnet/minecraft/class_3966;)Z
      // ab: istore 5
      // ad: iload 5
      // af: iload 3
      // b0: ifne cf
      // b3: ifeq cd
      // b6: goto ba
      // b9: athrow
      // ba: aload 0
      // bb: invokestatic java/lang/System.currentTimeMillis ()J
      // be: putfield qeaa361f143ee4a0894bd168fd9b30c66/qf4ccf8f5435d4a78bdca4d6a018b578e/abaaabbba.baab J
      // c1: aload 0
      // c2: aload 2
      // c3: invokevirtual net/minecraft/class_1309.method_5628 ()I
      // c6: putfield qeaa361f143ee4a0894bd168fd9b30c66/qf4ccf8f5435d4a78bdca4d6a018b578e/abaaabbba.bbaaa I
      // c9: goto cd
      // cc: athrow
      // cd: iload 5
      // cf: istore 6
      // d1: invokestatic qeaa361f143ee4a0894bd168fd9b30c66/qf4ccf8f5435d4a78bdca4d6a018b578e/aabbabbbb.baaaa ()V
      // d4: bipush 0
      // d5: invokestatic qeaa361f143ee4a0894bd168fd9b30c66/qf4ccf8f5435d4a78bdca4d6a018b578e/aabbabbbb.bbaaa (Z)V
      // d8: iload 6
      // da: ireturn
      // db: astore 7
      // dd: invokestatic qeaa361f143ee4a0894bd168fd9b30c66/qf4ccf8f5435d4a78bdca4d6a018b578e/aabbabbbb.baaaa ()V
      // e0: bipush 0
      // e1: invokestatic qeaa361f143ee4a0894bd168fd9b30c66/qf4ccf8f5435d4a78bdca4d6a018b578e/aabbabbbb.bbaaa (Z)V
      // e4: aload 7
      // e6: athrow
   }

   private boolean ababaa(class_310 param1, Object param2, int param3, class_3965 param4) {
      // $VF: Couldn't be decompiled
      // Please report this to the Vineflower issue tracker, at https://github.com/Vineflower/vineflower/issues with a copy of the class file (if you have the rights to distribute it!)
      // java.lang.RuntimeException: parsing failure!
      //   at org.jetbrains.java.decompiler.modules.decompiler.decompose.DomHelper.parseGraph(DomHelper.java:211)
      //   at org.jetbrains.java.decompiler.main.rels.MethodProcessor.codeToJava(MethodProcessor.java:166)
      //
      // Bytecode:
      // 00: getstatic qeaa361f143ee4a0894bd168fd9b30c66/qf4ccf8f5435d4a78bdca4d6a018b578e/baaabbaa.bba I
      // 03: istore 5
      // 05: aload 1
      // 06: getfield net/minecraft/class_310.field_1687 Lnet/minecraft/class_638;
      // 09: aload 2
      // 0a: if_acmpne 2b
      // 0d: aload 0
      // 0e: aload 1
      // 0f: iload 3
      // 10: aload 4
      // 12: aload 4
      // 14: invokevirtual qeaa361f143ee4a0894bd168fd9b30c66/qf4ccf8f5435d4a78bdca4d6a018b578e/abaaabbba.aabab (Lnet/minecraft/class_310;ILnet/minecraft/class_3965;Lnet/minecraft/class_3965;)Z
      // 17: iload 5
      // 19: ifne 28
      // 1c: goto 20
      // 1f: athrow
      // 20: ifeq 2b
      // 23: goto 27
      // 26: athrow
      // 27: bipush 1
      // 28: goto 2c
      // 2b: bipush 0
      // 2c: ireturn
   }

   public boolean ababab() {
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
      // 06: ifne 26
      // 09: invokevirtual qeaa361f143ee4a0894bd168fd9b30c66/qf4ccf8f5435d4a78bdca4d6a018b578e/abaaabbba.babbaab ()Z
      // 0c: ifeq 6e
      // 0f: goto 13
      // 12: athrow
      // 13: aload 0
      // 14: iload 1
      // 15: ifne 34
      // 18: goto 1c
      // 1b: athrow
      // 1c: getfield qeaa361f143ee4a0894bd168fd9b30c66/qf4ccf8f5435d4a78bdca4d6a018b578e/abaaabbba.babba Lqeaa361f143ee4a0894bd168fd9b30c66/qf4ccf8f5435d4a78bdca4d6a018b578e/abbaaaaa;
      // 1f: invokevirtual qeaa361f143ee4a0894bd168fd9b30c66/qf4ccf8f5435d4a78bdca4d6a018b578e/abbaaaaa.abbb ()Ljava/lang/Object;
      // 22: goto 26
      // 25: athrow
      // 26: checkcast java/lang/Boolean
      // 29: invokevirtual java/lang/Boolean.booleanValue ()Z
      // 2c: ifeq 6e
      // 2f: aload 0
      // 30: goto 34
      // 33: athrow
      // 34: iload 1
      // 35: ifne 4a
      // 38: getfield qeaa361f143ee4a0894bd168fd9b30c66/qf4ccf8f5435d4a78bdca4d6a018b578e/abaaabbba.bbbab Lqeaa361f143ee4a0894bd168fd9b30c66/qf4ccf8f5435d4a78bdca4d6a018b578e/aaabaaaba;
      // 3b: getstatic qeaa361f143ee4a0894bd168fd9b30c66/qf4ccf8f5435d4a78bdca4d6a018b578e/aaabaaaba.ba Lqeaa361f143ee4a0894bd168fd9b30c66/qf4ccf8f5435d4a78bdca4d6a018b578e/aaabaaaba;
      // 3e: if_acmpeq 69
      // 41: goto 45
      // 44: athrow
      // 45: aload 0
      // 46: goto 4a
      // 49: athrow
      // 4a: getfield qeaa361f143ee4a0894bd168fd9b30c66/qf4ccf8f5435d4a78bdca4d6a018b578e/abaaabbba.bbbab Lqeaa361f143ee4a0894bd168fd9b30c66/qf4ccf8f5435d4a78bdca4d6a018b578e/aaabaaaba;
      // 4d: iload 1
      // 4e: ifne 63
      // 51: getstatic qeaa361f143ee4a0894bd168fd9b30c66/qf4ccf8f5435d4a78bdca4d6a018b578e/aaabaaaba.aaa Lqeaa361f143ee4a0894bd168fd9b30c66/qf4ccf8f5435d4a78bdca4d6a018b578e/aaabaaaba;
      // 54: if_acmpeq 69
      // 57: goto 5b
      // 5a: athrow
      // 5b: aload 0
      // 5c: getfield qeaa361f143ee4a0894bd168fd9b30c66/qf4ccf8f5435d4a78bdca4d6a018b578e/abaaabbba.bbbab Lqeaa361f143ee4a0894bd168fd9b30c66/qf4ccf8f5435d4a78bdca4d6a018b578e/aaabaaaba;
      // 5f: goto 63
      // 62: athrow
      // 63: getstatic qeaa361f143ee4a0894bd168fd9b30c66/qf4ccf8f5435d4a78bdca4d6a018b578e/aaabaaaba.bb Lqeaa361f143ee4a0894bd168fd9b30c66/qf4ccf8f5435d4a78bdca4d6a018b578e/aaabaaaba;
      // 66: if_acmpne 6e
      // 69: bipush 1
      // 6a: goto 6f
      // 6d: athrow
      // 6e: bipush 0
      // 6f: ireturn
   }

   public abaaabbba() {
      int var1 = -1148522525;
      super(
         aabbaaaba.aaab(babab(a(-439572621, var1 ^ 1437965075), a(-439572622, var1 ^ -665178766))),
         bbaabbba.aa,
         aabbaaaba.aaab(babab(a(-439572623, var1 ^ -428219797), a(-439572624, var1 ^ 1595628650)))
      );
      this.abab = (baabaab)this.abbbaaa(
         new baabaab(
            aabbaaaba.aaab(babab(a(-439572609, var1 ^ 555456869), a(-439572610, var1 ^ 437894527))),
            bbbaaaab.class,
            bbbaaaab.ab
         )
      );
      this.bb = (abaabbbb)this.abbbaaa(
         new abaabbbb(
            aabbaaaba.aaab(babab(a(-439572611, var1 ^ 52208473), a(-439572612, var1 ^ -835726363))),
            baaba,
            List.of(aabba, bbbb)
         )
      );
      this.aaaab = (abbaaaaa)this.abbbaaa(
         new abbaaaaa(
            aabbaaaba.aaab(babab(a(-439572613, var1 ^ -1111935175), a(-439572614, var1 ^ 1377758298))), true
         )
      );
      this.aaaba = (abbaaaaa)this.abbbaaa(
         new abbaaaaa(
            aabbaaaba.aaab(babab(a(-439572615, var1 ^ 303740414), a(-439572616, var1 ^ -426232859))), false
         )
      );
      this.abba = (aaabbbab)this.abbbaaa(
         new aaabbbab(
               aabbaaaba.aaab(babab(a(-439572601, var1 ^ -1484791161), a(-439572602, var1 ^ 907377194))),
               0.0,
               0.0,
               0.0,
               300.0,
               5.0
            )
            .bbb(aabbaaaba.aaab(babab(a(-439572603, var1 ^ -130981867), a(-439572604, var1 ^ 1837096045))))
      );
      this.bbbaa = (bababa)this.abbbaaa(
         new bababa(
               aabbaaaba.aaab(babab(a(-439572605, var1 ^ -902305668), a(-439572606, var1 ^ 1050247520))),
               100.0,
               0.0,
               100.0,
               1.0
            )
            .bba(aabbaaaba.aaab(babab(a(-439572607, var1 ^ -1330307624), a(-439572608, var1 ^ -1018300917))))
      );
      this.babba = (abbaaaaa)this.abbbaaa(
         new abbaaaaa(
            aabbaaaba.aaab(babab(a(-439572593, var1 ^ 1288658101), a(-439572594, var1 ^ -481755196))), false
         )
      );
      this.aaaaaa = (aaabbbab)this.abbbaaa(
         new aaabbbab(
               aabbaaaba.aaab(babab(a(-439572595, var1 ^ -2002620038), a(-439572596, var1 ^ 1553589175))),
               0.0,
               0.0,
               0.0,
               300.0,
               5.0
            )
            .bbb(aabbaaaba.aaab(babab(a(-439572597, var1 ^ -377979994), a(-439572598, var1 ^ 511133324))))
      );
      this.aaab = (bababa)this.abbbaaa(
         new bababa(
               aabbaaaba.aaab(babab(a(-439572599, var1 ^ -1714458570), a(-439572600, var1 ^ 806510901))),
               100.0,
               0.0,
               100.0,
               1.0
            )
            .bba(aabbaaaba.aaab(babab(a(-439572585, var1 ^ 480450413), a(-439572586, var1 ^ -1692022150))))
      );
      this.baaab = (aaabbbab)this.abbbaaa(
         new aaabbbab(
               aabbaaaba.aaab(babab(a(-439572587, var1 ^ -814788156), a(-439572588, var1 ^ 643216364))),
               0.0,
               0.0,
               0.0,
               300.0,
               5.0
            )
            .bbb(aabbaaaba.aaab(babab(a(-439572589, var1 ^ 1979616272), a(-439572590, var1 ^ 163442736))))
      );
      this.aaba = (abbaaaaa)this.abbbaaa(
         new abbaaaaa(
            aabbaaaba.aaab(babab(a(-439572591, var1 ^ -1126759081), a(-439572592, var1 ^ 1850630662))), true
         )
      );
      this.bbbba = (baabaab)this.abbbaaa(
         new baabaab(
            aabbaaaba.aaab(babab(a(-439572577, var1 ^ 720522222), a(-439572578, var1 ^ -1531097734))),
            aaabbbaba.class,
            aaabbbaba.b
         )
      );
      this.baa = (bababa)this.abbbaaa(
         (bababa)new bababa(
               aabbaaaba.aaab(babab(a(-439572579, var1 ^ -1995084680), a(-439572580, var1 ^ 976855320))),
               50.0,
               1.0,
               100.0,
               1.0
            )
            .babb(this::ababb)
      );
      this.bbaba = new ababbbbba();
      this.bbbab = aaabaaaba.abb;
      this.aabaa = -1;
      this.abbba = -1;
      this.aabb = -1;
      this.abaab = -1;
      this.babaa = null;
      this.aaaaab = null;
      this.bab = null;
      this.aaabb = -1;
      this.baaaa = aaab(a(-439572581, var1 ^ -1170740039), 7477281668697820497L);
      this.aaa = class_243.field_1353;
      this.aab = null;
      this.bbbbb = false;
      this.bbaa = -1;
      this.aaaa = aaab(a(-439572582, var1 ^ 1099164523), 7477281668697820497L);
      this.bbaaa = -1;
      this.abba.babb(this.aaaba::abbb);
      this.bbbaa.babb(this.aaaba::abbb);
      this.babba.babb(abaaabbba::aba);
      this.aaaaaa.babb(this.babba::abbb);
      this.aaba.babb(this.babba::abbb);
      this.bbbba.babb(this.babba::abbb);
      this.aaab.babb(this.babba::abbb);
   }

   public boolean ababba(class_310 param1, class_1309 param2) {
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
      // 06: invokevirtual qeaa361f143ee4a0894bd168fd9b30c66/qf4ccf8f5435d4a78bdca4d6a018b578e/abaaabbba.aaabba (Lnet/minecraft/class_310;)Z
      // 09: iload 3
      // 0a: ifne 2e
      // 0d: ifeq 29
      // 10: goto 14
      // 13: athrow
      // 14: aload 0
      // 15: aload 1
      // 16: aload 2
      // 17: iload 3
      // 18: ifne 3a
      // 1b: goto 1f
      // 1e: athrow
      // 1f: invokevirtual qeaa361f143ee4a0894bd168fd9b30c66/qf4ccf8f5435d4a78bdca4d6a018b578e/abaaabbba.bba (Lnet/minecraft/class_310;Lnet/minecraft/class_1309;)Z
      // 22: ifne 2f
      // 25: goto 29
      // 28: athrow
      // 29: bipush 0
      // 2a: goto 2e
      // 2d: athrow
      // 2e: ireturn
      // 2f: aload 0
      // 30: aload 1
      // 31: iload 3
      // 32: ifne 45
      // 35: aload 2
      // 36: goto 3a
      // 39: athrow
      // 3a: invokevirtual qeaa361f143ee4a0894bd168fd9b30c66/qf4ccf8f5435d4a78bdca4d6a018b578e/abaaabbba.baaab (Lnet/minecraft/class_310;Lnet/minecraft/class_1309;)Z
      // 3d: ifeq 43
      // 40: bipush 0
      // 41: ireturn
      // 42: athrow
      // 43: aload 0
      // 44: aload 1
      // 45: invokevirtual qeaa361f143ee4a0894bd168fd9b30c66/qf4ccf8f5435d4a78bdca4d6a018b578e/abaaabbba.bbbba (Lnet/minecraft/class_310;)I
      // 48: istore 4
      // 4a: iload 4
      // 4c: iload 3
      // 4d: ifne 63
      // 50: bipush -1
      // 51: if_icmpeq 62
      // 54: goto 58
      // 57: athrow
      // 58: aload 0
      // 59: aload 1
      // 5a: aload 2
      // 5b: iload 4
      // 5d: invokevirtual qeaa361f143ee4a0894bd168fd9b30c66/qf4ccf8f5435d4a78bdca4d6a018b578e/abaaabbba.babbb (Lnet/minecraft/class_310;Lnet/minecraft/class_1309;I)Z
      // 60: ireturn
      // 61: athrow
      // 62: bipush 0
      // 63: ireturn
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
      // 000: getstatic qeaa361f143ee4a0894bd168fd9b30c66/qf4ccf8f5435d4a78bdca4d6a018b578e/baaabbaa.bba I
      // 003: invokestatic net/minecraft/class_310.method_1551 ()Lnet/minecraft/class_310;
      // 006: astore 2
      // 007: aload 0
      // 008: aload 2
      // 009: invokevirtual qeaa361f143ee4a0894bd168fd9b30c66/qf4ccf8f5435d4a78bdca4d6a018b578e/abaaabbba.bbbbb (Lnet/minecraft/class_310;)Z
      // 00c: pop
      // 00d: istore 1
      // 00e: aload 0
      // 00f: iload 1
      // 010: ifne 036
      // 013: getfield qeaa361f143ee4a0894bd168fd9b30c66/qf4ccf8f5435d4a78bdca4d6a018b578e/abaaabbba.bbbab Lqeaa361f143ee4a0894bd168fd9b30c66/qf4ccf8f5435d4a78bdca4d6a018b578e/aaabaaaba;
      // 016: getstatic qeaa361f143ee4a0894bd168fd9b30c66/qf4ccf8f5435d4a78bdca4d6a018b578e/aaabaaaba.abb Lqeaa361f143ee4a0894bd168fd9b30c66/qf4ccf8f5435d4a78bdca4d6a018b578e/aaabaaaba;
      // 019: if_acmpeq 027
      // 01c: goto 020
      // 01f: athrow
      // 020: aload 0
      // 021: aload 2
      // 022: invokevirtual qeaa361f143ee4a0894bd168fd9b30c66/qf4ccf8f5435d4a78bdca4d6a018b578e/abaaabbba.aaaa (Lnet/minecraft/class_310;)V
      // 025: return
      // 026: athrow
      // 027: aload 0
      // 028: iload 1
      // 029: ifne 0d4
      // 02c: getfield qeaa361f143ee4a0894bd168fd9b30c66/qf4ccf8f5435d4a78bdca4d6a018b578e/abaaabbba.abab Lqeaa361f143ee4a0894bd168fd9b30c66/qf4ccf8f5435d4a78bdca4d6a018b578e/baabaab;
      // 02f: invokevirtual qeaa361f143ee4a0894bd168fd9b30c66/qf4ccf8f5435d4a78bdca4d6a018b578e/baabaab.abbb ()Ljava/lang/Object;
      // 032: goto 036
      // 035: athrow
      // 036: getstatic qeaa361f143ee4a0894bd168fd9b30c66/qf4ccf8f5435d4a78bdca4d6a018b578e/bbbaaaab.aa Lqeaa361f143ee4a0894bd168fd9b30c66/qf4ccf8f5435d4a78bdca4d6a018b578e/bbbaaaab;
      // 039: if_acmpne 0d3
      // 03c: aload 0
      // 03d: iload 1
      // 03e: ifne 0d4
      // 041: goto 045
      // 044: athrow
      // 045: getfield qeaa361f143ee4a0894bd168fd9b30c66/qf4ccf8f5435d4a78bdca4d6a018b578e/abaaabbba.bbbab Lqeaa361f143ee4a0894bd168fd9b30c66/qf4ccf8f5435d4a78bdca4d6a018b578e/aaabaaaba;
      // 048: getstatic qeaa361f143ee4a0894bd168fd9b30c66/qf4ccf8f5435d4a78bdca4d6a018b578e/aaabaaaba.abb Lqeaa361f143ee4a0894bd168fd9b30c66/qf4ccf8f5435d4a78bdca4d6a018b578e/aaabaaaba;
      // 04b: if_acmpne 0d3
      // 04e: goto 052
      // 051: athrow
      // 052: aload 0
      // 053: iload 1
      // 054: ifne 0d4
      // 057: goto 05b
      // 05a: athrow
      // 05b: getfield qeaa361f143ee4a0894bd168fd9b30c66/qf4ccf8f5435d4a78bdca4d6a018b578e/abaaabbba.bbaab Z
      // 05e: ifne 0d3
      // 061: goto 065
      // 064: athrow
      // 065: aload 0
      // 066: iload 1
      // 067: ifne 0d4
      // 06a: goto 06e
      // 06d: athrow
      // 06e: aload 2
      // 06f: invokevirtual qeaa361f143ee4a0894bd168fd9b30c66/qf4ccf8f5435d4a78bdca4d6a018b578e/abaaabbba.aaabba (Lnet/minecraft/class_310;)Z
      // 072: ifeq 0d3
      // 075: goto 079
      // 078: athrow
      // 079: aload 2
      // 07a: ldc2_w 3.0
      // 07d: invokestatic qeaa361f143ee4a0894bd168fd9b30c66/qf4ccf8f5435d4a78bdca4d6a018b578e/aabbabbbb.bbbaba (Lnet/minecraft/class_310;D)Lnet/minecraft/class_3966;
      // 080: astore 3
      // 081: aload 2
      // 082: aload 3
      // 083: invokestatic qeaa361f143ee4a0894bd168fd9b30c66/qf4ccf8f5435d4a78bdca4d6a018b578e/aabbabbbb.aaaaaab (Lnet/minecraft/class_310;Lnet/minecraft/class_239;)Lnet/minecraft/class_1309;
      // 086: astore 4
      // 088: aload 0
      // 089: iload 1
      // 08a: ifne 0d4
      // 08d: aload 2
      // 08e: aload 4
      // 090: invokevirtual qeaa361f143ee4a0894bd168fd9b30c66/qf4ccf8f5435d4a78bdca4d6a018b578e/abaaabbba.bba (Lnet/minecraft/class_310;Lnet/minecraft/class_1309;)Z
      // 093: ifeq 0d3
      // 096: goto 09a
      // 099: athrow
      // 09a: aload 0
      // 09b: iload 1
      // 09c: ifne 0d4
      // 09f: goto 0a3
      // 0a2: athrow
      // 0a3: aload 2
      // 0a4: aload 4
      // 0a6: invokevirtual qeaa361f143ee4a0894bd168fd9b30c66/qf4ccf8f5435d4a78bdca4d6a018b578e/abaaabbba.baaab (Lnet/minecraft/class_310;Lnet/minecraft/class_1309;)Z
      // 0a9: ifne 0d3
      // 0ac: goto 0b0
      // 0af: athrow
      // 0b0: aload 0
      // 0b1: iload 1
      // 0b2: ifne 0d4
      // 0b5: goto 0b9
      // 0b8: athrow
      // 0b9: aload 2
      // 0ba: invokevirtual qeaa361f143ee4a0894bd168fd9b30c66/qf4ccf8f5435d4a78bdca4d6a018b578e/abaaabbba.bbbba (Lnet/minecraft/class_310;)I
      // 0bd: istore 5
      // 0bf: iload 5
      // 0c1: bipush -1
      // 0c2: if_icmpeq 0d3
      // 0c5: aload 0
      // 0c6: aload 2
      // 0c7: aload 4
      // 0c9: iload 5
      // 0cb: invokevirtual qeaa361f143ee4a0894bd168fd9b30c66/qf4ccf8f5435d4a78bdca4d6a018b578e/abaaabbba.babbb (Lnet/minecraft/class_310;Lnet/minecraft/class_1309;I)Z
      // 0ce: pop
      // 0cf: goto 0d3
      // 0d2: athrow
      // 0d3: aload 0
      // 0d4: iload 1
      // 0d5: ifne 0e5
      // 0d8: getfield qeaa361f143ee4a0894bd168fd9b30c66/qf4ccf8f5435d4a78bdca4d6a018b578e/abaaabbba.bbaab Z
      // 0db: ifne 0e4
      // 0de: goto 0e2
      // 0e1: athrow
      // 0e2: return
      // 0e3: athrow
      // 0e4: aload 0
      // 0e5: aload 2
      // 0e6: invokevirtual qeaa361f143ee4a0894bd168fd9b30c66/qf4ccf8f5435d4a78bdca4d6a018b578e/abaaabbba.abaaaa (Lnet/minecraft/class_310;)Z
      // 0e9: iload 1
      // 0ea: ifne 103
      // 0ed: ifne 0fb
      // 0f0: goto 0f4
      // 0f3: athrow
      // 0f4: aload 0
      // 0f5: aload 2
      // 0f6: invokevirtual qeaa361f143ee4a0894bd168fd9b30c66/qf4ccf8f5435d4a78bdca4d6a018b578e/abaaabbba.baaaa (Lnet/minecraft/class_310;)V
      // 0f9: return
      // 0fa: athrow
      // 0fb: invokestatic java/lang/System.currentTimeMillis ()J
      // 0fe: aload 0
      // 0ff: getfield qeaa361f143ee4a0894bd168fd9b30c66/qf4ccf8f5435d4a78bdca4d6a018b578e/abaaabbba.abbab J
      // 102: lcmp
      // 103: iflt 10f
      // 106: aload 0
      // 107: aload 2
      // 108: invokevirtual qeaa361f143ee4a0894bd168fd9b30c66/qf4ccf8f5435d4a78bdca4d6a018b578e/abaaabbba.bbbb (Lnet/minecraft/class_310;)V
      // 10b: goto 10f
      // 10e: athrow
      // 10f: return
   }
}
