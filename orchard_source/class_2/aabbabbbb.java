package nsc;

import com.google.gson.JsonElement;
import java.awt.image.BufferedImage;
import java.lang.reflect.Field;
import java.lang.reflect.Method;
import java.util.Arrays;
import java.util.Set;
import java.util.concurrent.ConcurrentLinkedQueue;
import java.util.function.BooleanSupplier;
import net.fabricmc.api.EnvType;
import net.fabricmc.api.Environment;
import net.minecraft.class_1011;
import net.minecraft.class_11908;
import net.minecraft.class_1268;
import net.minecraft.class_1269;
import net.minecraft.class_1297;
import net.minecraft.class_1309;
import net.minecraft.class_1661;
import net.minecraft.class_1799;
import net.minecraft.class_1839;
import net.minecraft.class_2248;
import net.minecraft.class_2338;
import net.minecraft.class_239;
import net.minecraft.class_243;
import net.minecraft.class_2596;
import net.minecraft.class_2680;
import net.minecraft.class_2777;
import net.minecraft.class_304;
import net.minecraft.class_310;
import net.minecraft.class_3532;
import net.minecraft.class_3675;
import net.minecraft.class_3965;
import net.minecraft.class_3966;
import net.minecraft.class_638;
import net.minecraft.class_744;
import net.minecraft.class_746;
import net.minecraft.class_9331;
import net.minecraft.class_9334;
import net.minecraft.class_9779;
import net.minecraft.class_3675.class_306;
import net.minecraft.class_3675.class_307;

@Environment(EnvType.CLIENT)
public final class aabbabbbb {
   private static boolean ba;
   private static long aaa;
   private static final int[] aabbab;
   private static final Method aab;
   private static final abaaabaa aba;
   private static final long[] abb;
   private static final Field baa;
   private static volatile boolean bab;
   private static final Field bba;
   private static volatile Field bbb;
   private static int aaaa;
   private static final Method aaab;
   private static final Method aaba;
   private static int aabb;
   private static final Method abaa;
   private static final Field abab;
   private static final int abba;
   private static final Method abbb;
   private static int baaa;
   private static bbaaba baab;
   private static volatile boolean baba;
   private static int babb;
   private static final Method bbaa;
   private static final ConcurrentLinkedQueue bbab;
   private static final Field b;
   private static final String[] bbba;
   private static int bbbb;
   private static long aaaaa;
   private static int aaaab;
   private static boolean aaaba;
   private static final Field aaabb;
   private static boolean aabaa;
   private static int aabab;
   private static final Integer[] aabba;
   private static int aabbb;
   private static int abaaa;
   private static boolean abaab;
   private static long a;
   private static Object ababa;
   private static long ababb;
   private static int abbaa;
   private static final Object[] aabbbb;
   private static long abbab;
   private static int abbba;
   private static final Field abbbb;
   private static int baaaa;
   private static float baaab;
   private static boolean baaba;
   private static final Long[] baabb;
   private static final String[] aabbba;
   private static boolean babaa;
   private static long babab;
   private static int babba;
   private static final Method babbb;
   private static final Method aa;
   private static long ab;
   private static volatile int bbaaa;
   private static final boolean[] bbaab;
   private static final long[] bbaba;
   private static int bbabb;
   private static int bbbaa;
   private static final Field bbbab;
   private static final Field bbbba;
   private static final boolean[] bbbbb;
   private static boolean aaaaaa;
   private static final Set aaaaab;
   private static final bbbabbab aaaaba;
   private static long aaaabb;
   private static final String[] aaabaa;
   private static long bb;
   private static final Field aaabab;
   private static long aaabba;
   private static volatile class_9331 aaabbb;
   private static int aabaaa;
   private static boolean aabaab;
   private static final Method aababa;
   private static final Method aababb;
   public static final double aabbaa = 0.9;

   private static void aa(int[] var0) {
      int var8 = -1710377303;
      int var1 = baaabbaa.bba;

      try {
         if (var0 == null) {
            return;
         }
      } catch (MatchException var9) {
         throw var9;
      }

      int var2 = 0;

      while (var2 < var0.length) {
         int var3 = var0[var2];
         int var4 = var3 >> aaaaa(b(604047337, var8 ^ 1847094281), 6284279312986410046L) & aaaaa(b(604047336, var8 ^ -795361194), 8934768507328332238L);
         int var5 = var3 >> aaaaa(b(604047339, var8 ^ -826704007), 4370743180115493301L) & aaaaa(b(604047338, var8 ^ 1231179656), 7575677724327980757L);
         int var6 = var3 >> aaaaa(b(604047341, var8 ^ 1339365719), 6146930655705273313L) & aaaaa(b(604047340, var8 ^ -638326281), 7575677724327980757L);
         int var7 = var3 & aaaaa(b(604047343, var8 ^ 1601407213), 7575677724327980757L);
         var0[var2] = var4 << aaaaa(b(604047342, var8 ^ 94871212), 6939825434395854827L)
            | var7 << aaaaa(b(604047329, var8 ^ -2057218871), 2443687684195785770L)
            | var6 << aaaaa(b(604047328, var8 ^ -1996564464), 6146930655705273313L)
            | var5;
         var2++;
         if (var1 != 0) {
            break;
         }
      }
   }

   public static class_306 ab(JsonElement param0) {
      // $VF: Couldn't be decompiled
      // Please report this to the Vineflower issue tracker, at https://github.com/Vineflower/vineflower/issues with a copy of the class file (if you have the rights to distribute it!)
      // java.lang.NullPointerException: Cannot invoke "org.jetbrains.java.decompiler.code.cfg.ExceptionRangeCFG.isCircular()" because "range" is null
      //   at org.jetbrains.java.decompiler.modules.decompiler.decompose.DomHelper.graphToStatement(DomHelper.java:84)
      //   at org.jetbrains.java.decompiler.modules.decompiler.decompose.DomHelper.parseGraph(DomHelper.java:203)
      //   at org.jetbrains.java.decompiler.main.rels.MethodProcessor.codeToJava(MethodProcessor.java:166)
      //
      // Bytecode:
      // 000: ldc -817252733
      // 002: istore 5
      // 004: getstatic qeaa361f143ee4a0894bd168fd9b30c66/qf4ccf8f5435d4a78bdca4d6a018b578e/baaabbaa.bba I
      // 007: istore 1
      // 008: aload 0
      // 009: iload 1
      // 00a: ifne 015
      // 00d: ifnull 023
      // 010: goto 014
      // 013: athrow
      // 014: aload 0
      // 015: iload 1
      // 016: ifne 029
      // 019: invokevirtual com/google/gson/JsonElement.isJsonNull ()Z
      // 01c: ifeq 028
      // 01f: goto 023
      // 022: athrow
      // 023: getstatic net/minecraft/class_3675.field_16237 Lnet/minecraft/class_3675$class_306;
      // 026: areturn
      // 027: athrow
      // 028: aload 0
      // 029: iload 1
      // 02a: ifne 040
      // 02d: invokevirtual com/google/gson/JsonElement.isJsonPrimitive ()Z
      // 030: ifeq 03f
      // 033: goto 037
      // 036: athrow
      // 037: aload 0
      // 038: invokevirtual com/google/gson/JsonElement.getAsInt ()I
      // 03b: invokestatic qeaa361f143ee4a0894bd168fd9b30c66/qf4ccf8f5435d4a78bdca4d6a018b578e/aabbabbbb.babaabb (I)Lnet/minecraft/class_3675$class_306;
      // 03e: areturn
      // 03f: aload 0
      // 040: invokevirtual com/google/gson/JsonElement.getAsJsonObject ()Lcom/google/gson/JsonObject;
      // 043: astore 2
      // 044: aload 2
      // 045: iload 1
      // 046: ifne 072
      // 049: ldc 604047331
      // 04b: iload 5
      // 04d: ldc -1947626717
      // 04f: ixor
      // 050: invokestatic qeaa361f143ee4a0894bd168fd9b30c66/qf4ccf8f5435d4a78bdca4d6a018b578e/aabbabbbb.b (II)I
      // 053: ldc 604047330
      // 055: iload 5
      // 057: ldc 1482347051
      // 059: ixor
      // 05a: invokestatic qeaa361f143ee4a0894bd168fd9b30c66/qf4ccf8f5435d4a78bdca4d6a018b578e/aabbabbbb.b (II)I
      // 05d: invokestatic qeaa361f143ee4a0894bd168fd9b30c66/qf4ccf8f5435d4a78bdca4d6a018b578e/aabbabbbb.bbaabaa (II)Ljava/lang/String;
      // 060: invokestatic qeaa361f143ee4a0894bd168fd9b30c66/qf4ccf8f5435d4a78bdca4d6a018b578e/aabbaaaba.abba (Ljava/lang/String;)Ljava/lang/String;
      // 063: invokevirtual com/google/gson/JsonObject.has (Ljava/lang/String;)Z
      // 066: ifeq 09a
      // 069: goto 06d
      // 06c: athrow
      // 06d: aload 2
      // 06e: goto 072
      // 071: athrow
      // 072: ldc 604047333
      // 074: iload 5
      // 076: ldc -1500325066
      // 078: ixor
      // 079: invokestatic qeaa361f143ee4a0894bd168fd9b30c66/qf4ccf8f5435d4a78bdca4d6a018b578e/aabbabbbb.b (II)I
      // 07c: ldc 604047332
      // 07e: iload 5
      // 080: ldc -1578737166
      // 082: ixor
      // 083: invokestatic qeaa361f143ee4a0894bd168fd9b30c66/qf4ccf8f5435d4a78bdca4d6a018b578e/aabbabbbb.b (II)I
      // 086: invokestatic qeaa361f143ee4a0894bd168fd9b30c66/qf4ccf8f5435d4a78bdca4d6a018b578e/aabbabbbb.bbaabaa (II)Ljava/lang/String;
      // 089: iload 1
      // 08a: ifne 0b9
      // 08d: invokestatic qeaa361f143ee4a0894bd168fd9b30c66/qf4ccf8f5435d4a78bdca4d6a018b578e/aabbaaaba.abba (Ljava/lang/String;)Ljava/lang/String;
      // 090: invokevirtual com/google/gson/JsonObject.has (Ljava/lang/String;)Z
      // 093: ifne 09e
      // 096: goto 09a
      // 099: athrow
      // 09a: getstatic net/minecraft/class_3675.field_16237 Lnet/minecraft/class_3675$class_306;
      // 09d: areturn
      // 09e: aload 2
      // 09f: ldc 604047335
      // 0a1: iload 5
      // 0a3: ldc 1740835245
      // 0a5: ixor
      // 0a6: invokestatic qeaa361f143ee4a0894bd168fd9b30c66/qf4ccf8f5435d4a78bdca4d6a018b578e/aabbabbbb.b (II)I
      // 0a9: ldc 604047334
      // 0ab: iload 5
      // 0ad: ldc 1175120778
      // 0af: ixor
      // 0b0: invokestatic qeaa361f143ee4a0894bd168fd9b30c66/qf4ccf8f5435d4a78bdca4d6a018b578e/aabbabbbb.b (II)I
      // 0b3: invokestatic qeaa361f143ee4a0894bd168fd9b30c66/qf4ccf8f5435d4a78bdca4d6a018b578e/aabbabbbb.bbaabaa (II)Ljava/lang/String;
      // 0b6: invokestatic qeaa361f143ee4a0894bd168fd9b30c66/qf4ccf8f5435d4a78bdca4d6a018b578e/aabbaaaba.abba (Ljava/lang/String;)Ljava/lang/String;
      // 0b9: invokevirtual com/google/gson/JsonObject.get (Ljava/lang/String;)Lcom/google/gson/JsonElement;
      // 0bc: astore 3
      // 0bd: aload 3
      // 0be: iload 1
      // 0bf: ifne 11a
      // 0c2: invokevirtual com/google/gson/JsonElement.isJsonPrimitive ()Z
      // 0c5: ifeq 115
      // 0c8: goto 0cc
      // 0cb: athrow
      // 0cc: aload 3
      // 0cd: iload 1
      // 0ce: ifne 11a
      // 0d1: goto 0d5
      // 0d4: athrow
      // 0d5: invokevirtual com/google/gson/JsonElement.getAsJsonPrimitive ()Lcom/google/gson/JsonPrimitive;
      // 0d8: invokevirtual com/google/gson/JsonPrimitive.isNumber ()Z
      // 0db: ifeq 115
      // 0de: goto 0e2
      // 0e1: athrow
      // 0e2: aload 3
      // 0e3: iload 1
      // 0e4: ifne 0fe
      // 0e7: goto 0eb
      // 0ea: athrow
      // 0eb: invokevirtual com/google/gson/JsonElement.getAsInt ()I
      // 0ee: bipush 1
      // 0ef: if_icmpne 0fd
      // 0f2: goto 0f6
      // 0f5: athrow
      // 0f6: getstatic net/minecraft/class_3675$class_307.field_1672 Lnet/minecraft/class_3675$class_307;
      // 0f9: goto 10f
      // 0fc: athrow
      // 0fd: aload 3
      // 0fe: invokevirtual com/google/gson/JsonElement.getAsInt ()I
      // 101: bipush 2
      // 102: if_icmpne 10c
      // 105: getstatic net/minecraft/class_3675$class_307.field_1671 Lnet/minecraft/class_3675$class_307;
      // 108: goto 10f
      // 10b: athrow
      // 10c: getstatic net/minecraft/class_3675$class_307.field_1668 Lnet/minecraft/class_3675$class_307;
      // 10f: astore 4
      // 111: iload 1
      // 112: ifeq 122
      // 115: aload 3
      // 116: goto 11a
      // 119: athrow
      // 11a: invokevirtual com/google/gson/JsonElement.getAsString ()Ljava/lang/String;
      // 11d: invokestatic net/minecraft/class_3675$class_307.valueOf (Ljava/lang/String;)Lnet/minecraft/class_3675$class_307;
      // 120: astore 4
      // 122: aload 4
      // 124: aload 2
      // 125: ldc_w 604047353
      // 128: iload 5
      // 12a: ldc_w -450763968
      // 12d: ixor
      // 12e: invokestatic qeaa361f143ee4a0894bd168fd9b30c66/qf4ccf8f5435d4a78bdca4d6a018b578e/aabbabbbb.b (II)I
      // 131: ldc_w 604047352
      // 134: iload 5
      // 136: ldc_w -1640048072
      // 139: ixor
      // 13a: invokestatic qeaa361f143ee4a0894bd168fd9b30c66/qf4ccf8f5435d4a78bdca4d6a018b578e/aabbabbbb.b (II)I
      // 13d: invokestatic qeaa361f143ee4a0894bd168fd9b30c66/qf4ccf8f5435d4a78bdca4d6a018b578e/aabbabbbb.bbaabaa (II)Ljava/lang/String;
      // 140: invokestatic qeaa361f143ee4a0894bd168fd9b30c66/qf4ccf8f5435d4a78bdca4d6a018b578e/aabbaaaba.abba (Ljava/lang/String;)Ljava/lang/String;
      // 143: invokevirtual com/google/gson/JsonObject.get (Ljava/lang/String;)Lcom/google/gson/JsonElement;
      // 146: invokevirtual com/google/gson/JsonElement.getAsInt ()I
      // 149: invokevirtual net/minecraft/class_3675$class_307.method_1447 (I)Lnet/minecraft/class_3675$class_306;
      // 14c: areturn
      // 14d: astore 2
      // 14e: getstatic net/minecraft/class_3675.field_16237 Lnet/minecraft/class_3675$class_306;
      // 151: areturn
   }

   public static boolean ba(class_310 param0) {
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
      // 06: ifne 11
      // 09: ifnull 32
      // 0c: goto 10
      // 0f: athrow
      // 10: aload 0
      // 11: iload 1
      // 12: ifne 24
      // 15: getfield net/minecraft/class_310.field_1724 Lnet/minecraft/class_746;
      // 18: ifnull 32
      // 1b: goto 1f
      // 1e: athrow
      // 1f: aload 0
      // 20: goto 24
      // 23: athrow
      // 24: iload 1
      // 25: ifne 36
      // 28: invokevirtual net/minecraft/class_310.method_1562 ()Lnet/minecraft/class_634;
      // 2b: ifnonnull 35
      // 2e: goto 32
      // 31: athrow
      // 32: bipush 0
      // 33: ireturn
      // 34: athrow
      // 35: aload 0
      // 36: invokevirtual net/minecraft/class_310.method_1562 ()Lnet/minecraft/class_634;
      // 39: new net/minecraft/class_2846
      // 3c: dup
      // 3d: getstatic net/minecraft/class_2846$class_2847.field_12974 Lnet/minecraft/class_2846$class_2847;
      // 40: getstatic net/minecraft/class_2338.field_10980 Lnet/minecraft/class_2338;
      // 43: getstatic net/minecraft/class_2350.field_11033 Lnet/minecraft/class_2350;
      // 46: invokespecial net/minecraft/class_2846.<init> (Lnet/minecraft/class_2846$class_2847;Lnet/minecraft/class_2338;Lnet/minecraft/class_2350;)V
      // 49: invokevirtual net/minecraft/class_634.method_52787 (Lnet/minecraft/class_2596;)V
      // 4c: bipush 1
      // 4d: ireturn
   }

   public static boolean bb(class_310 param0, class_306 param1) {
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
      // 09: ifnull 40
      // 0c: goto 10
      // 0f: athrow
      // 10: aload 0
      // 11: getfield net/minecraft/class_310.field_1690 Lnet/minecraft/class_315;
      // 14: ifnull 40
      // 17: aload 1
      // 18: invokestatic qeaa361f143ee4a0894bd168fd9b30c66/qf4ccf8f5435d4a78bdca4d6a018b578e/aabbabbbb.bbaaaaa (Lnet/minecraft/class_3675$class_306;)Z
      // 1b: iload 2
      // 1c: ifne 45
      // 1f: goto 23
      // 22: athrow
      // 23: ifne 40
      // 26: goto 2a
      // 29: athrow
      // 2a: aload 0
      // 2b: getfield net/minecraft/class_310.field_1690 Lnet/minecraft/class_315;
      // 2e: iload 2
      // 2f: ifne 4a
      // 32: goto 36
      // 35: athrow
      // 36: getfield net/minecraft/class_315.field_1852 [Lnet/minecraft/class_304;
      // 39: ifnonnull 46
      // 3c: goto 40
      // 3f: athrow
      // 40: bipush 0
      // 41: goto 45
      // 44: athrow
      // 45: ireturn
      // 46: aload 0
      // 47: getfield net/minecraft/class_310.field_1690 Lnet/minecraft/class_315;
      // 4a: getfield net/minecraft/class_315.field_1852 [Lnet/minecraft/class_304;
      // 4d: astore 3
      // 4e: aload 3
      // 4f: arraylength
      // 50: istore 4
      // 52: bipush 0
      // 53: istore 5
      // 55: iload 5
      // 57: iload 4
      // 59: if_icmpge 90
      // 5c: aload 3
      // 5d: iload 5
      // 5f: aaload
      // 60: astore 6
      // 62: iload 2
      // 63: ifne 8c
      // 66: aload 6
      // 68: ifnull 89
      // 6b: goto 6f
      // 6e: athrow
      // 6f: aload 1
      // 70: aload 6
      // 72: invokestatic qeaa361f143ee4a0894bd168fd9b30c66/qf4ccf8f5435d4a78bdca4d6a018b578e/aabbabbbb.abbaabb (Lnet/minecraft/class_304;)Lnet/minecraft/class_3675$class_306;
      // 75: invokevirtual net/minecraft/class_3675$class_306.equals (Ljava/lang/Object;)Z
      // 78: iload 2
      // 79: ifne 88
      // 7c: goto 80
      // 7f: athrow
      // 80: ifeq 89
      // 83: goto 87
      // 86: athrow
      // 87: bipush 1
      // 88: ireturn
      // 89: iinc 5 1
      // 8c: iload 2
      // 8d: ifeq 55
      // 90: bipush 0
      // 91: ireturn
   }

   public static boolean aaa(class_1309 param0, class_746 param1) {
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
      // 05: ifnull 3d
      // 08: aload 1
      // 09: iload 2
      // 0a: ifne 19
      // 0d: goto 11
      // 10: athrow
      // 11: ifnull 3d
      // 14: goto 18
      // 17: athrow
      // 18: aload 0
      // 19: invokestatic qeaa361f143ee4a0894bd168fd9b30c66/qf4ccf8f5435d4a78bdca4d6a018b578e/aabbabbbb.abaabb (Lnet/minecraft/class_1309;)Z
      // 1c: iload 2
      // 1d: ifne 3e
      // 20: ifeq 3d
      // 23: goto 27
      // 26: athrow
      // 27: invokestatic net/minecraft/class_310.method_1551 ()Lnet/minecraft/class_310;
      // 2a: aload 0
      // 2b: invokestatic qeaa361f143ee4a0894bd168fd9b30c66/qf4ccf8f5435d4a78bdca4d6a018b578e/baaabab.ba (Lnet/minecraft/class_310;Lnet/minecraft/class_1309;)Z
      // 2e: iload 2
      // 2f: ifne 3e
      // 32: goto 36
      // 35: athrow
      // 36: ifeq 3f
      // 39: goto 3d
      // 3c: athrow
      // 3d: bipush 0
      // 3e: ireturn
      // 3f: aload 1
      // 40: invokevirtual net/minecraft/class_746.method_23317 ()D
      // 43: aload 0
      // 44: invokevirtual net/minecraft/class_1309.method_23317 ()D
      // 47: dsub
      // 48: dstore 3
      // 49: aload 1
      // 4a: invokevirtual net/minecraft/class_746.method_23321 ()D
      // 4d: aload 0
      // 4e: invokevirtual net/minecraft/class_1309.method_23321 ()D
      // 51: dsub
      // 52: dstore 5
      // 54: dload 3
      // 55: dload 3
      // 56: dmul
      // 57: dload 5
      // 59: dload 5
      // 5b: dmul
      // 5c: dadd
      // 5d: dstore 7
      // 5f: dload 7
      // 61: iload 2
      // 62: ifne 7a
      // 65: ldc2_w 1.0E-5
      // 68: dcmpg
      // 69: ifge 73
      // 6c: goto 70
      // 6f: athrow
      // 70: bipush 1
      // 71: ireturn
      // 72: athrow
      // 73: dconst_1
      // 74: dload 7
      // 76: invokestatic java/lang/Math.sqrt (D)D
      // 79: ddiv
      // 7a: dstore 9
      // 7c: dload 3
      // 7d: dload 9
      // 7f: dmul
      // 80: dstore 11
      // 82: dload 5
      // 84: dload 9
      // 86: dmul
      // 87: dstore 13
      // 89: aload 0
      // 8a: fconst_1
      // 8b: invokevirtual net/minecraft/class_1309.method_5705 (F)F
      // 8e: fstore 15
      // 90: fload 15
      // 92: fneg
      // 93: ldc_w 0.017453292
      // 96: fmul
      // 97: fstore 16
      // 99: fload 16
      // 9b: f2d
      // 9c: invokestatic java/lang/Math.sin (D)D
      // 9f: dstore 17
      // a1: fload 16
      // a3: f2d
      // a4: invokestatic java/lang/Math.cos (D)D
      // a7: dstore 19
      // a9: dload 17
      // ab: dload 11
      // ad: dmul
      // ae: dload 19
      // b0: dload 13
      // b2: dmul
      // b3: dadd
      // b4: dconst_0
      // b5: dcmpl
      // b6: iload 2
      // b7: ifne c2
      // ba: ifle c5
      // bd: goto c1
      // c0: athrow
      // c1: bipush 1
      // c2: goto c6
      // c5: bipush 0
      // c6: ireturn
   }

   public static long aab() {
      return aaaabb;
   }

   public static int aba(class_310 param0) {
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
      // 005: iload 1
      // 006: ifne 011
      // 009: ifnull 01f
      // 00c: goto 010
      // 00f: athrow
      // 010: aload 0
      // 011: iload 1
      // 012: ifne 035
      // 015: getfield net/minecraft/class_310.field_1724 Lnet/minecraft/class_746;
      // 018: ifnonnull 034
      // 01b: goto 01f
      // 01e: athrow
      // 01f: ldc_w 604047355
      // 022: ldc_w 1125820025
      // 025: ldc_w 608277906
      // 028: ixor
      // 029: invokestatic qeaa361f143ee4a0894bd168fd9b30c66/qf4ccf8f5435d4a78bdca4d6a018b578e/aabbabbbb.b (II)I
      // 02c: ldc2_w 178147395960060319
      // 02f: invokestatic qeaa361f143ee4a0894bd168fd9b30c66/qf4ccf8f5435d4a78bdca4d6a018b578e/aabbabbbb.aaaaa (IJ)I
      // 032: ireturn
      // 033: athrow
      // 034: aload 0
      // 035: iload 1
      // 036: ifne 048
      // 039: getfield net/minecraft/class_310.field_1690 Lnet/minecraft/class_315;
      // 03c: ifnull 09d
      // 03f: goto 043
      // 042: athrow
      // 043: aload 0
      // 044: goto 048
      // 047: athrow
      // 048: iload 1
      // 049: ifne 073
      // 04c: getfield net/minecraft/class_310.field_1690 Lnet/minecraft/class_315;
      // 04f: getfield net/minecraft/class_315.field_1886 Lnet/minecraft/class_304;
      // 052: ifnull 072
      // 055: goto 059
      // 058: athrow
      // 059: aload 0
      // 05a: getfield net/minecraft/class_310.field_1690 Lnet/minecraft/class_315;
      // 05d: getfield net/minecraft/class_315.field_1886 Lnet/minecraft/class_304;
      // 060: invokestatic qeaa361f143ee4a0894bd168fd9b30c66/qf4ccf8f5435d4a78bdca4d6a018b578e/aabbabbbb.bababaa (Lnet/minecraft/class_304;)V
      // 063: aload 0
      // 064: getfield net/minecraft/class_310.field_1690 Lnet/minecraft/class_315;
      // 067: getfield net/minecraft/class_315.field_1886 Lnet/minecraft/class_304;
      // 06a: bipush 0
      // 06b: invokevirtual net/minecraft/class_304.method_23481 (Z)V
      // 06e: goto 072
      // 071: athrow
      // 072: aload 0
      // 073: iload 1
      // 074: ifne 093
      // 077: getfield net/minecraft/class_310.field_1690 Lnet/minecraft/class_315;
      // 07a: getfield net/minecraft/class_315.field_1904 Lnet/minecraft/class_304;
      // 07d: ifnull 09d
      // 080: goto 084
      // 083: athrow
      // 084: aload 0
      // 085: getfield net/minecraft/class_310.field_1690 Lnet/minecraft/class_315;
      // 088: getfield net/minecraft/class_315.field_1904 Lnet/minecraft/class_304;
      // 08b: invokestatic qeaa361f143ee4a0894bd168fd9b30c66/qf4ccf8f5435d4a78bdca4d6a018b578e/aabbabbbb.bababaa (Lnet/minecraft/class_304;)V
      // 08e: aload 0
      // 08f: goto 093
      // 092: athrow
      // 093: getfield net/minecraft/class_310.field_1690 Lnet/minecraft/class_315;
      // 096: getfield net/minecraft/class_315.field_1904 Lnet/minecraft/class_304;
      // 099: bipush 0
      // 09a: invokevirtual net/minecraft/class_304.method_23481 (Z)V
      // 09d: bipush 0
      // 09e: istore 2
      // 09f: aload 0
      // 0a0: iload 1
      // 0a1: ifne 0b3
      // 0a4: getfield net/minecraft/class_310.field_1761 Lnet/minecraft/class_636;
      // 0a7: ifnull 0ec
      // 0aa: goto 0ae
      // 0ad: athrow
      // 0ae: aload 0
      // 0af: goto 0b3
      // 0b2: athrow
      // 0b3: iload 1
      // 0b4: ifne 0ce
      // 0b7: getfield net/minecraft/class_310.field_1761 Lnet/minecraft/class_636;
      // 0ba: invokestatic qeaa361f143ee4a0894bd168fd9b30c66/qf4ccf8f5435d4a78bdca4d6a018b578e/bbbabaa.babb (Lnet/minecraft/class_636;)Z
      // 0bd: ifeq 0cd
      // 0c0: goto 0c4
      // 0c3: athrow
      // 0c4: aload 0
      // 0c5: getfield net/minecraft/class_310.field_1761 Lnet/minecraft/class_636;
      // 0c8: invokevirtual net/minecraft/class_636.method_2925 ()V
      // 0cb: bipush 1
      // 0cc: istore 2
      // 0cd: aload 0
      // 0ce: getfield net/minecraft/class_310.field_1724 Lnet/minecraft/class_746;
      // 0d1: invokevirtual net/minecraft/class_746.method_6115 ()Z
      // 0d4: iload 1
      // 0d5: ifne 0ed
      // 0d8: ifeq 0ec
      // 0db: goto 0df
      // 0de: athrow
      // 0df: aload 0
      // 0e0: getfield net/minecraft/class_310.field_1761 Lnet/minecraft/class_636;
      // 0e3: aload 0
      // 0e4: getfield net/minecraft/class_310.field_1724 Lnet/minecraft/class_746;
      // 0e7: invokevirtual net/minecraft/class_636.method_2897 (Lnet/minecraft/class_1657;)V
      // 0ea: bipush 1
      // 0eb: istore 2
      // 0ec: iload 2
      // 0ed: iload 1
      // 0ee: ifne 105
      // 0f1: ifeq 108
      // 0f4: goto 0f8
      // 0f7: athrow
      // 0f8: aload 0
      // 0f9: getfield net/minecraft/class_310.field_1724 Lnet/minecraft/class_746;
      // 0fc: getfield net/minecraft/class_746.field_6012 I
      // 0ff: bipush 1
      // 100: iadd
      // 101: goto 105
      // 104: athrow
      // 105: goto 10f
      // 108: aload 0
      // 109: getfield net/minecraft/class_310.field_1724 Lnet/minecraft/class_746;
      // 10c: getfield net/minecraft/class_746.field_6012 I
      // 10f: ireturn
   }

   private static class_243 abb(Object param0) {
      // $VF: Couldn't be decompiled
      // Please report this to the Vineflower issue tracker, at https://github.com/Vineflower/vineflower/issues with a copy of the class file (if you have the rights to distribute it!)
      // java.lang.RuntimeException: parsing failure!
      //   at org.jetbrains.java.decompiler.modules.decompiler.decompose.DomHelper.parseGraph(DomHelper.java:211)
      //   at org.jetbrains.java.decompiler.main.rels.MethodProcessor.codeToJava(MethodProcessor.java:166)
      //
      // Bytecode:
      // 000: ldc_w -1389238784
      // 003: istore 5
      // 005: getstatic qeaa361f143ee4a0894bd168fd9b30c66/qf4ccf8f5435d4a78bdca4d6a018b578e/baaabbaa.bba I
      // 008: istore 1
      // 009: aload 0
      // 00a: iload 1
      // 00b: ifne 019
      // 00e: ifnonnull 018
      // 011: goto 015
      // 014: athrow
      // 015: aconst_null
      // 016: areturn
      // 017: athrow
      // 018: aload 0
      // 019: iload 1
      // 01a: ifne 02f
      // 01d: instanceof net/minecraft/class_243
      // 020: ifeq 02e
      // 023: goto 027
      // 026: athrow
      // 027: aload 0
      // 028: checkcast net/minecraft/class_243
      // 02b: astore 2
      // 02c: aload 2
      // 02d: areturn
      // 02e: aload 0
      // 02f: ldc_w 604047354
      // 032: iload 5
      // 034: ldc_w -1211141753
      // 037: ixor
      // 038: invokestatic qeaa361f143ee4a0894bd168fd9b30c66/qf4ccf8f5435d4a78bdca4d6a018b578e/aabbabbbb.b (II)I
      // 03b: ldc_w 604047357
      // 03e: iload 5
      // 040: ldc_w -1403908077
      // 043: ixor
      // 044: invokestatic qeaa361f143ee4a0894bd168fd9b30c66/qf4ccf8f5435d4a78bdca4d6a018b578e/aabbabbbb.b (II)I
      // 047: invokestatic qeaa361f143ee4a0894bd168fd9b30c66/qf4ccf8f5435d4a78bdca4d6a018b578e/aabbabbbb.bbaabaa (II)Ljava/lang/String;
      // 04a: invokestatic qeaa361f143ee4a0894bd168fd9b30c66/qf4ccf8f5435d4a78bdca4d6a018b578e/aabbaaaba.abba (Ljava/lang/String;)Ljava/lang/String;
      // 04d: ldc_w 604047356
      // 050: iload 5
      // 052: ldc_w -778604933
      // 055: ixor
      // 056: invokestatic qeaa361f143ee4a0894bd168fd9b30c66/qf4ccf8f5435d4a78bdca4d6a018b578e/aabbabbbb.b (II)I
      // 059: ldc_w 604047359
      // 05c: iload 5
      // 05e: ldc_w 2054140403
      // 061: ixor
      // 062: invokestatic qeaa361f143ee4a0894bd168fd9b30c66/qf4ccf8f5435d4a78bdca4d6a018b578e/aabbabbbb.b (II)I
      // 065: invokestatic qeaa361f143ee4a0894bd168fd9b30c66/qf4ccf8f5435d4a78bdca4d6a018b578e/aabbabbbb.bbaabaa (II)Ljava/lang/String;
      // 068: invokestatic qeaa361f143ee4a0894bd168fd9b30c66/qf4ccf8f5435d4a78bdca4d6a018b578e/aabbaaaba.abba (Ljava/lang/String;)Ljava/lang/String;
      // 06b: invokestatic qeaa361f143ee4a0894bd168fd9b30c66/qf4ccf8f5435d4a78bdca4d6a018b578e/aabbabbbb.abbb (Ljava/lang/Object;Ljava/lang/String;Ljava/lang/String;)Ljava/lang/Double;
      // 06e: astore 2
      // 06f: aload 0
      // 070: ldc_w 604047358
      // 073: iload 5
      // 075: ldc_w -939460823
      // 078: ixor
      // 079: invokestatic qeaa361f143ee4a0894bd168fd9b30c66/qf4ccf8f5435d4a78bdca4d6a018b578e/aabbabbbb.b (II)I
      // 07c: ldc_w 604047345
      // 07f: iload 5
      // 081: ldc_w 844195129
      // 084: ixor
      // 085: invokestatic qeaa361f143ee4a0894bd168fd9b30c66/qf4ccf8f5435d4a78bdca4d6a018b578e/aabbabbbb.b (II)I
      // 088: invokestatic qeaa361f143ee4a0894bd168fd9b30c66/qf4ccf8f5435d4a78bdca4d6a018b578e/aabbabbbb.bbaabaa (II)Ljava/lang/String;
      // 08b: invokestatic qeaa361f143ee4a0894bd168fd9b30c66/qf4ccf8f5435d4a78bdca4d6a018b578e/aabbaaaba.abba (Ljava/lang/String;)Ljava/lang/String;
      // 08e: ldc_w 604047344
      // 091: iload 5
      // 093: ldc_w -675595536
      // 096: ixor
      // 097: invokestatic qeaa361f143ee4a0894bd168fd9b30c66/qf4ccf8f5435d4a78bdca4d6a018b578e/aabbabbbb.b (II)I
      // 09a: ldc_w 604047347
      // 09d: iload 5
      // 09f: ldc_w -1497272873
      // 0a2: ixor
      // 0a3: invokestatic qeaa361f143ee4a0894bd168fd9b30c66/qf4ccf8f5435d4a78bdca4d6a018b578e/aabbabbbb.b (II)I
      // 0a6: invokestatic qeaa361f143ee4a0894bd168fd9b30c66/qf4ccf8f5435d4a78bdca4d6a018b578e/aabbabbbb.bbaabaa (II)Ljava/lang/String;
      // 0a9: invokestatic qeaa361f143ee4a0894bd168fd9b30c66/qf4ccf8f5435d4a78bdca4d6a018b578e/aabbaaaba.abba (Ljava/lang/String;)Ljava/lang/String;
      // 0ac: invokestatic qeaa361f143ee4a0894bd168fd9b30c66/qf4ccf8f5435d4a78bdca4d6a018b578e/aabbabbbb.abbb (Ljava/lang/Object;Ljava/lang/String;Ljava/lang/String;)Ljava/lang/Double;
      // 0af: astore 3
      // 0b0: aload 0
      // 0b1: ldc_w 604047346
      // 0b4: iload 5
      // 0b6: ldc_w -1837439868
      // 0b9: ixor
      // 0ba: invokestatic qeaa361f143ee4a0894bd168fd9b30c66/qf4ccf8f5435d4a78bdca4d6a018b578e/aabbabbbb.b (II)I
      // 0bd: ldc_w 604047349
      // 0c0: iload 5
      // 0c2: ldc_w -156118304
      // 0c5: ixor
      // 0c6: invokestatic qeaa361f143ee4a0894bd168fd9b30c66/qf4ccf8f5435d4a78bdca4d6a018b578e/aabbabbbb.b (II)I
      // 0c9: invokestatic qeaa361f143ee4a0894bd168fd9b30c66/qf4ccf8f5435d4a78bdca4d6a018b578e/aabbabbbb.bbaabaa (II)Ljava/lang/String;
      // 0cc: invokestatic qeaa361f143ee4a0894bd168fd9b30c66/qf4ccf8f5435d4a78bdca4d6a018b578e/aabbaaaba.abba (Ljava/lang/String;)Ljava/lang/String;
      // 0cf: ldc_w 604047348
      // 0d2: iload 5
      // 0d4: ldc_w 913075990
      // 0d7: ixor
      // 0d8: invokestatic qeaa361f143ee4a0894bd168fd9b30c66/qf4ccf8f5435d4a78bdca4d6a018b578e/aabbabbbb.b (II)I
      // 0db: ldc_w 604047351
      // 0de: iload 5
      // 0e0: ldc_w -1659615902
      // 0e3: ixor
      // 0e4: invokestatic qeaa361f143ee4a0894bd168fd9b30c66/qf4ccf8f5435d4a78bdca4d6a018b578e/aabbabbbb.b (II)I
      // 0e7: invokestatic qeaa361f143ee4a0894bd168fd9b30c66/qf4ccf8f5435d4a78bdca4d6a018b578e/aabbabbbb.bbaabaa (II)Ljava/lang/String;
      // 0ea: invokestatic qeaa361f143ee4a0894bd168fd9b30c66/qf4ccf8f5435d4a78bdca4d6a018b578e/aabbaaaba.abba (Ljava/lang/String;)Ljava/lang/String;
      // 0ed: invokestatic qeaa361f143ee4a0894bd168fd9b30c66/qf4ccf8f5435d4a78bdca4d6a018b578e/aabbabbbb.abbb (Ljava/lang/Object;Ljava/lang/String;Ljava/lang/String;)Ljava/lang/Double;
      // 0f0: astore 4
      // 0f2: aload 2
      // 0f3: iload 1
      // 0f4: ifne 0ff
      // 0f7: ifnull 125
      // 0fa: goto 0fe
      // 0fd: athrow
      // 0fe: aload 3
      // 0ff: iload 1
      // 100: ifne 10c
      // 103: ifnull 125
      // 106: goto 10a
      // 109: athrow
      // 10a: aload 4
      // 10c: ifnull 125
      // 10f: new net/minecraft/class_243
      // 112: dup
      // 113: aload 2
      // 114: invokevirtual java/lang/Double.doubleValue ()D
      // 117: aload 3
      // 118: invokevirtual java/lang/Double.doubleValue ()D
      // 11b: aload 4
      // 11d: invokevirtual java/lang/Double.doubleValue ()D
      // 120: invokespecial net/minecraft/class_243.<init> (DDD)V
      // 123: areturn
      // 124: athrow
      // 125: aconst_null
      // 126: areturn
   }

   public static void baa(class_310 param0) {
      // $VF: Couldn't be decompiled
      // Please report this to the Vineflower issue tracker, at https://github.com/Vineflower/vineflower/issues with a copy of the class file (if you have the rights to distribute it!)
      // java.lang.NullPointerException: Cannot invoke "org.jetbrains.java.decompiler.code.cfg.ExceptionRangeCFG.isCircular()" because "range" is null
      //   at org.jetbrains.java.decompiler.modules.decompiler.decompose.DomHelper.graphToStatement(DomHelper.java:84)
      //   at org.jetbrains.java.decompiler.modules.decompiler.decompose.DomHelper.parseGraph(DomHelper.java:203)
      //   at org.jetbrains.java.decompiler.main.rels.MethodProcessor.codeToJava(MethodProcessor.java:166)
      //
      // Bytecode:
      // 00: getstatic qeaa361f143ee4a0894bd168fd9b30c66/qf4ccf8f5435d4a78bdca4d6a018b578e/baaabbaa.bba I
      // 03: invokestatic qeaa361f143ee4a0894bd168fd9b30c66/qf4ccf8f5435d4a78bdca4d6a018b578e/bbbbbbba.ba ()I
      // 06: istore 2
      // 07: istore 1
      // 08: iload 2
      // 09: iload 1
      // 0a: ifne 4a
      // 0d: iflt 43
      // 10: goto 14
      // 13: athrow
      // 14: iload 2
      // 15: iload 1
      // 16: ifne 4a
      // 19: goto 1d
      // 1c: athrow
      // 1d: ldc_w 604047350
      // 20: ldc_w 1287377973
      // 23: ldc_w -799490118
      // 26: ixor
      // 27: invokestatic qeaa361f143ee4a0894bd168fd9b30c66/qf4ccf8f5435d4a78bdca4d6a018b578e/aabbabbbb.b (II)I
      // 2a: ldc2_w 1131576471880749436
      // 2d: invokestatic qeaa361f143ee4a0894bd168fd9b30c66/qf4ccf8f5435d4a78bdca4d6a018b578e/aabbabbbb.aaaaa (IJ)I
      // 30: if_icmpge 43
      // 33: goto 37
      // 36: athrow
      // 37: iload 2
      // 38: putstatic qeaa361f143ee4a0894bd168fd9b30c66/qf4ccf8f5435d4a78bdca4d6a018b578e/aabbabbbb.bbaaa I
      // 3b: iload 1
      // 3c: ifeq b5
      // 3f: goto 43
      // 42: athrow
      // 43: getstatic qeaa361f143ee4a0894bd168fd9b30c66/qf4ccf8f5435d4a78bdca4d6a018b578e/aabbabbbb.abbba I
      // 46: goto 4a
      // 49: athrow
      // 4a: iload 1
      // 4b: ifne 58
      // 4e: iflt 84
      // 51: goto 55
      // 54: athrow
      // 55: getstatic qeaa361f143ee4a0894bd168fd9b30c66/qf4ccf8f5435d4a78bdca4d6a018b578e/aabbabbbb.abbba I
      // 58: iload 1
      // 59: ifne 7d
      // 5c: ldc_w 604047305
      // 5f: ldc_w 1287377973
      // 62: ldc_w 1088882302
      // 65: ixor
      // 66: invokestatic qeaa361f143ee4a0894bd168fd9b30c66/qf4ccf8f5435d4a78bdca4d6a018b578e/aabbabbbb.b (II)I
      // 69: ldc2_w 1131576471880749436
      // 6c: invokestatic qeaa361f143ee4a0894bd168fd9b30c66/qf4ccf8f5435d4a78bdca4d6a018b578e/aabbabbbb.aaaaa (IJ)I
      // 6f: if_icmpge 84
      // 72: goto 76
      // 75: athrow
      // 76: getstatic qeaa361f143ee4a0894bd168fd9b30c66/qf4ccf8f5435d4a78bdca4d6a018b578e/aabbabbbb.abbba I
      // 79: goto 7d
      // 7c: athrow
      // 7d: putstatic qeaa361f143ee4a0894bd168fd9b30c66/qf4ccf8f5435d4a78bdca4d6a018b578e/aabbabbbb.bbaaa I
      // 80: iload 1
      // 81: ifeq b5
      // 84: aload 0
      // 85: iload 1
      // 86: ifne 95
      // 89: goto 8d
      // 8c: athrow
      // 8d: ifnull a3
      // 90: goto 94
      // 93: athrow
      // 94: aload 0
      // 95: iload 1
      // 96: ifne a9
      // 99: getfield net/minecraft/class_310.field_1724 Lnet/minecraft/class_746;
      // 9c: ifnonnull a8
      // 9f: goto a3
      // a2: athrow
      // a3: bipush -1
      // a4: goto b2
      // a7: athrow
      // a8: aload 0
      // a9: getfield net/minecraft/class_310.field_1724 Lnet/minecraft/class_746;
      // ac: invokevirtual net/minecraft/class_746.method_31548 ()Lnet/minecraft/class_1661;
      // af: invokestatic qeaa361f143ee4a0894bd168fd9b30c66/qf4ccf8f5435d4a78bdca4d6a018b578e/bbbabaa.aaaab (Lnet/minecraft/class_1661;)I
      // b2: putstatic qeaa361f143ee4a0894bd168fd9b30c66/qf4ccf8f5435d4a78bdca4d6a018b578e/aabbabbbb.bbaaa I
      // b5: return
   }

   private static boolean bab(class_310 param0, aaaababaa param1, int param2) {
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
      // 06: ifne 20
      // 09: iload 2
      // 0a: invokestatic qeaa361f143ee4a0894bd168fd9b30c66/qf4ccf8f5435d4a78bdca4d6a018b578e/aabbabbbb.abaaa (Lnet/minecraft/class_310;I)Z
      // 0d: ifeq 17
      // 10: goto 14
      // 13: athrow
      // 14: bipush 1
      // 15: ireturn
      // 16: athrow
      // 17: aload 1
      // 18: getstatic qeaa361f143ee4a0894bd168fd9b30c66/qf4ccf8f5435d4a78bdca4d6a018b578e/bbbabbab.b Lqeaa361f143ee4a0894bd168fd9b30c66/qf4ccf8f5435d4a78bdca4d6a018b578e/bbbabbab;
      // 1b: iload 2
      // 1c: invokevirtual qeaa361f143ee4a0894bd168fd9b30c66/qf4ccf8f5435d4a78bdca4d6a018b578e/aaaababaa.ba (Lqeaa361f143ee4a0894bd168fd9b30c66/qf4ccf8f5435d4a78bdca4d6a018b578e/bbbabbab;I)V
      // 1f: aload 0
      // 20: iload 2
      // 21: invokestatic qeaa361f143ee4a0894bd168fd9b30c66/qf4ccf8f5435d4a78bdca4d6a018b578e/aabbabbbb.abaaa (Lnet/minecraft/class_310;I)Z
      // 24: ireturn
   }

   private static void bba() {
      aabaab = aabaab | aba.ab();
      baab = null;
      aabaa = false;
      ababa = null;
      bbbaa = 0;
      aabbb = 0;
      baaa = 0;
      aaaaaa = false;
      aba.aaabb();
      bbabbbb.aab();
   }

   public static int bbb() {
      return bbaaa;
   }

   public static boolean aaaa(class_310 param0, class_1297 param1, double param2) {
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
      // 00b: ifnull 048
      // 00e: goto 012
      // 011: athrow
      // 012: aload 0
      // 013: iload 4
      // 015: ifne 027
      // 018: getfield net/minecraft/class_310.field_1724 Lnet/minecraft/class_746;
      // 01b: ifnull 048
      // 01e: goto 022
      // 021: athrow
      // 022: aload 0
      // 023: goto 027
      // 026: athrow
      // 027: getfield net/minecraft/class_310.field_1687 Lnet/minecraft/class_638;
      // 02a: ifnull 048
      // 02d: aload 1
      // 02e: ifnull 048
      // 031: goto 035
      // 034: athrow
      // 035: dload 2
      // 036: dconst_0
      // 037: dcmpl
      // 038: iload 4
      // 03a: ifne 049
      // 03d: goto 041
      // 040: athrow
      // 041: ifgt 04a
      // 044: goto 048
      // 047: athrow
      // 048: bipush 0
      // 049: ireturn
      // 04a: aload 0
      // 04b: getfield net/minecraft/class_310.field_1724 Lnet/minecraft/class_746;
      // 04e: astore 5
      // 050: aload 5
      // 052: invokevirtual net/minecraft/class_746.method_18798 ()Lnet/minecraft/class_243;
      // 055: astore 6
      // 057: aload 6
      // 059: iload 4
      // 05b: ifne 09e
      // 05e: getfield net/minecraft/class_243.field_1351 D
      // 061: dconst_0
      // 062: dcmpg
      // 063: ifge 094
      // 066: goto 06a
      // 069: athrow
      // 06a: aload 0
      // 06b: getfield net/minecraft/class_310.field_1687 Lnet/minecraft/class_638;
      // 06e: aload 5
      // 070: aload 5
      // 072: invokevirtual net/minecraft/class_746.method_5829 ()Lnet/minecraft/class_238;
      // 075: dconst_0
      // 076: aload 6
      // 078: getfield net/minecraft/class_243.field_1351 D
      // 07b: dconst_0
      // 07c: invokevirtual net/minecraft/class_238.method_1012 (DDD)Lnet/minecraft/class_238;
      // 07f: invokevirtual net/minecraft/class_638.method_8587 (Lnet/minecraft/class_1297;Lnet/minecraft/class_238;)Z
      // 082: iload 4
      // 084: ifne 093
      // 087: goto 08b
      // 08a: athrow
      // 08b: ifne 094
      // 08e: goto 092
      // 091: athrow
      // 092: bipush 1
      // 093: ireturn
      // 094: aload 5
      // 096: invokevirtual net/minecraft/class_746.method_33571 ()Lnet/minecraft/class_243;
      // 099: aload 6
      // 09b: invokevirtual net/minecraft/class_243.method_1019 (Lnet/minecraft/class_243;)Lnet/minecraft/class_243;
      // 09e: astore 7
      // 0a0: aload 1
      // 0a1: invokevirtual net/minecraft/class_1297.method_5829 ()Lnet/minecraft/class_238;
      // 0a4: aload 1
      // 0a5: invokevirtual net/minecraft/class_1297.method_23317 ()D
      // 0a8: aload 1
      // 0a9: getfield net/minecraft/class_1297.field_6014 D
      // 0ac: dsub
      // 0ad: aload 1
      // 0ae: invokevirtual net/minecraft/class_1297.method_23318 ()D
      // 0b1: aload 1
      // 0b2: getfield net/minecraft/class_1297.field_6036 D
      // 0b5: dsub
      // 0b6: aload 1
      // 0b7: invokevirtual net/minecraft/class_1297.method_23321 ()D
      // 0ba: aload 1
      // 0bb: getfield net/minecraft/class_1297.field_5969 D
      // 0be: dsub
      // 0bf: invokevirtual net/minecraft/class_238.method_989 (DDD)Lnet/minecraft/class_238;
      // 0c2: astore 8
      // 0c4: aload 7
      // 0c6: getfield net/minecraft/class_243.field_1352 D
      // 0c9: aload 8
      // 0cb: getfield net/minecraft/class_238.field_1323 D
      // 0ce: aload 8
      // 0d0: getfield net/minecraft/class_238.field_1320 D
      // 0d3: invokestatic net/minecraft/class_3532.method_15350 (DDD)D
      // 0d6: aload 7
      // 0d8: getfield net/minecraft/class_243.field_1352 D
      // 0db: dsub
      // 0dc: dstore 9
      // 0de: aload 7
      // 0e0: getfield net/minecraft/class_243.field_1351 D
      // 0e3: aload 8
      // 0e5: getfield net/minecraft/class_238.field_1322 D
      // 0e8: aload 8
      // 0ea: getfield net/minecraft/class_238.field_1325 D
      // 0ed: invokestatic net/minecraft/class_3532.method_15350 (DDD)D
      // 0f0: aload 7
      // 0f2: getfield net/minecraft/class_243.field_1351 D
      // 0f5: dsub
      // 0f6: dstore 11
      // 0f8: aload 7
      // 0fa: getfield net/minecraft/class_243.field_1350 D
      // 0fd: aload 8
      // 0ff: getfield net/minecraft/class_238.field_1321 D
      // 102: aload 8
      // 104: getfield net/minecraft/class_238.field_1324 D
      // 107: invokestatic net/minecraft/class_3532.method_15350 (DDD)D
      // 10a: aload 7
      // 10c: getfield net/minecraft/class_243.field_1350 D
      // 10f: dsub
      // 110: dstore 13
      // 112: dload 9
      // 114: dload 9
      // 116: dmul
      // 117: dload 11
      // 119: dload 11
      // 11b: dmul
      // 11c: dadd
      // 11d: dload 13
      // 11f: dload 13
      // 121: dmul
      // 122: dadd
      // 123: dload 2
      // 124: dload 2
      // 125: dmul
      // 126: dcmpl
      // 127: iload 4
      // 129: ifne 134
      // 12c: ifle 137
      // 12f: goto 133
      // 132: athrow
      // 133: bipush 1
      // 134: goto 138
      // 137: bipush 0
      // 138: ireturn
   }

   public static boolean aaab(class_310 param0, class_304 param1) {
      // $VF: Couldn't be decompiled
      // Please report this to the Vineflower issue tracker, at https://github.com/Vineflower/vineflower/issues with a copy of the class file (if you have the rights to distribute it!)
      // java.lang.RuntimeException: parsing failure!
      //   at org.jetbrains.java.decompiler.modules.decompiler.decompose.DomHelper.parseGraph(DomHelper.java:211)
      //   at org.jetbrains.java.decompiler.main.rels.MethodProcessor.codeToJava(MethodProcessor.java:166)
      //
      // Bytecode:
      // 00: aload 0
      // 01: ifnull 17
      // 04: aload 1
      // 05: ifnull 17
      // 08: goto 0c
      // 0b: athrow
      // 0c: aload 0
      // 0d: invokevirtual net/minecraft/class_310.method_22683 ()Lnet/minecraft/class_1041;
      // 10: ifnonnull 1a
      // 13: goto 17
      // 16: athrow
      // 17: bipush 0
      // 18: ireturn
      // 19: athrow
      // 1a: aload 1
      // 1b: invokestatic qeaa361f143ee4a0894bd168fd9b30c66/qf4ccf8f5435d4a78bdca4d6a018b578e/bbbabaa.aaa (Lnet/minecraft/class_304;)Lnet/minecraft/class_3675$class_306;
      // 1e: astore 2
      // 1f: aload 2
      // 20: ifnonnull 29
      // 23: aload 1
      // 24: invokevirtual net/minecraft/class_304.method_1434 ()Z
      // 27: ireturn
      // 28: athrow
      // 29: aload 0
      // 2a: aload 2
      // 2b: invokestatic qeaa361f143ee4a0894bd168fd9b30c66/qf4ccf8f5435d4a78bdca4d6a018b578e/aabbabbbb.abbbbab (Lnet/minecraft/class_310;Lnet/minecraft/class_3675$class_306;)Z
      // 2e: ireturn
   }

   private static String bbbabab(int var0, short var1, char var2) {
      int var7 = var0 ^ 794953165;
      char[] var6 = aabbba[var7].toCharArray();
      StackTraceElement[] var8 = (StackTraceElement[])aabbbb[var7];
      StackTraceElement[] var9;
      if (var8 != null) {
         var9 = var8;
      } else {
         var9 = new Throwable().getStackTrace();
         aabbbb[var7] = var9;
      }

      StackTraceElement var10 = var9[1];
      int var4 = (var10.getClassName().hashCode() ^ var10.getMethodName().hashCode()) >> 16 ^ 56046;
      int var5 = 0;

      do {
         var6[var5] = (char)(var6[var5] ^ '되' ^ switch (var5 % 27) {
            default -> 137;
            case 1 -> 176;
            case 2 -> 218;
            case 3 -> 253;
            case 4 -> 157;
            case 5 -> 248;
            case 6 -> 89;
            case 7 -> 27;
            case 8 -> 158;
            case 9 -> 115;
            case 10 -> 176;
            case 11 -> 226;
            case 12 -> 0;
            case 13 -> 74;
            case 14 -> 19;
            case 15 -> 205;
            case 16 -> 8;
            case 17 -> 77;
            case 18 -> 19;
            case 19 -> 162;
            case 20 -> 201;
            case 21 -> 97;
            case 22 -> 45;
            case 23 -> 253;
            case 24 -> 236;
            case 25 -> 1;
            case 26 -> 176;
         } ^ var5 ^ var4 ^ var2 ^ var0 ^ var1);
      } while (++var5 < var6.length);

      return new String(var6).intern();
   }

   public static void aaba() {
      bab = false;
   }

   public static void aabb(class_310 param0, int param1, boolean param2) {
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
      // 06: ifne 11
      // 09: ifnull 51
      // 0c: goto 10
      // 0f: athrow
      // 10: aload 0
      // 11: iload 3
      // 12: ifne 24
      // 15: getfield net/minecraft/class_310.field_1724 Lnet/minecraft/class_746;
      // 18: ifnull 51
      // 1b: goto 1f
      // 1e: athrow
      // 1f: aload 0
      // 20: goto 24
      // 23: athrow
      // 24: getfield net/minecraft/class_310.field_1690 Lnet/minecraft/class_315;
      // 27: ifnull 51
      // 2a: iload 1
      // 2b: iload 3
      // 2c: ifne 3b
      // 2f: goto 33
      // 32: athrow
      // 33: iflt 51
      // 36: goto 3a
      // 39: athrow
      // 3a: iload 1
      // 3b: ldc_w 604047304
      // 3e: ldc_w 777934795
      // 41: ldc_w 1055702687
      // 44: ixor
      // 45: invokestatic qeaa361f143ee4a0894bd168fd9b30c66/qf4ccf8f5435d4a78bdca4d6a018b578e/aabbabbbb.b (II)I
      // 48: ldc2_w 6146930655705273313
      // 4b: invokestatic qeaa361f143ee4a0894bd168fd9b30c66/qf4ccf8f5435d4a78bdca4d6a018b578e/aabbabbbb.aaaaa (IJ)I
      // 4e: if_icmple 53
      // 51: return
      // 52: athrow
      // 53: aload 0
      // 54: getfield net/minecraft/class_310.field_1690 Lnet/minecraft/class_315;
      // 57: getfield net/minecraft/class_315.field_1852 [Lnet/minecraft/class_304;
      // 5a: astore 4
      // 5c: aconst_null
      // 5d: astore 5
      // 5f: aload 4
      // 61: ifnull 75
      // 64: iload 1
      // 65: aload 4
      // 67: arraylength
      // 68: if_icmpge 75
      // 6b: goto 6f
      // 6e: athrow
      // 6f: aload 4
      // 71: iload 1
      // 72: aaload
      // 73: astore 5
      // 75: aload 5
      // 77: iload 3
      // 78: ifne 84
      // 7b: ifnull a4
      // 7e: goto 82
      // 81: athrow
      // 82: aload 5
      // 84: invokestatic qeaa361f143ee4a0894bd168fd9b30c66/qf4ccf8f5435d4a78bdca4d6a018b578e/aabbabbbb.abbaabb (Lnet/minecraft/class_304;)Lnet/minecraft/class_3675$class_306;
      // 87: astore 6
      // 89: iload 3
      // 8a: ifne aa
      // 8d: aload 6
      // 8f: invokestatic qeaa361f143ee4a0894bd168fd9b30c66/qf4ccf8f5435d4a78bdca4d6a018b578e/aabbabbbb.bbaaaaa (Lnet/minecraft/class_3675$class_306;)Z
      // 92: ifne a4
      // 95: goto 99
      // 98: athrow
      // 99: aload 5
      // 9b: aload 6
      // 9d: invokestatic qeaa361f143ee4a0894bd168fd9b30c66/qf4ccf8f5435d4a78bdca4d6a018b578e/aabbabbbb.baaa (Lnet/minecraft/class_304;Lnet/minecraft/class_3675$class_306;)V
      // a0: goto a4
      // a3: athrow
      // a4: aload 0
      // a5: iload 1
      // a6: iload 2
      // a7: invokestatic qeaa361f143ee4a0894bd168fd9b30c66/qf4ccf8f5435d4a78bdca4d6a018b578e/aabbabbbb.ababaaa (Lnet/minecraft/class_310;IZ)V
      // aa: return
   }

   public static void abaa(class_2596 param0) {
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
      // 06: ifne 18
      // 09: instanceof net/minecraft/class_2868
      // 0c: ifeq 30
      // 0f: goto 13
      // 12: athrow
      // 13: aload 0
      // 14: goto 18
      // 17: athrow
      // 18: checkcast net/minecraft/class_2868
      // 1b: astore 2
      // 1c: aload 2
      // 1d: invokevirtual net/minecraft/class_2868.method_12442 ()I
      // 20: invokestatic qeaa361f143ee4a0894bd168fd9b30c66/qf4ccf8f5435d4a78bdca4d6a018b578e/bbbbbbba.aaa (I)V
      // 23: getstatic qeaa361f143ee4a0894bd168fd9b30c66/qf4ccf8f5435d4a78bdca4d6a018b578e/aabbabbbb.baaaa I
      // 26: ifne 30
      // 29: invokestatic qeaa361f143ee4a0894bd168fd9b30c66/qf4ccf8f5435d4a78bdca4d6a018b578e/aabbabbbb.bba ()V
      // 2c: goto 30
      // 2f: athrow
      // 30: return
   }

   public static void abab(class_310 var0, int var1) {
      bbab(var0, var1, 1);
   }

   public static class_3965 abba(class_310 param0, class_1297 param1, class_243 param2, class_243 param3) {
      // $VF: Couldn't be decompiled
      // Please report this to the Vineflower issue tracker, at https://github.com/Vineflower/vineflower/issues with a copy of the class file (if you have the rights to distribute it!)
      // java.lang.NullPointerException: Cannot invoke "org.jetbrains.java.decompiler.code.cfg.ExceptionRangeCFG.isCircular()" because "range" is null
      //   at org.jetbrains.java.decompiler.modules.decompiler.decompose.DomHelper.graphToStatement(DomHelper.java:84)
      //   at org.jetbrains.java.decompiler.modules.decompiler.decompose.DomHelper.parseGraph(DomHelper.java:203)
      //   at org.jetbrains.java.decompiler.main.rels.MethodProcessor.codeToJava(MethodProcessor.java:166)
      //
      // Bytecode:
      // 000: getstatic qeaa361f143ee4a0894bd168fd9b30c66/qf4ccf8f5435d4a78bdca4d6a018b578e/baaabbaa.bba I
      // 003: istore 4
      // 005: aload 0
      // 006: iload 4
      // 008: ifne 013
      // 00b: ifnull 021
      // 00e: goto 012
      // 011: athrow
      // 012: aload 0
      // 013: getfield net/minecraft/class_310.field_1687 Lnet/minecraft/class_638;
      // 016: ifnull 021
      // 019: aload 1
      // 01a: ifnonnull 024
      // 01d: goto 021
      // 020: athrow
      // 021: aconst_null
      // 022: areturn
      // 023: athrow
      // 024: aload 2
      // 025: astore 5
      // 027: ldc_w 604047307
      // 02a: ldc_w -1716676983
      // 02d: ldc_w 457351016
      // 030: ixor
      // 031: invokestatic qeaa361f143ee4a0894bd168fd9b30c66/qf4ccf8f5435d4a78bdca4d6a018b578e/aabbabbbb.b (II)I
      // 034: ldc2_w 6146930655705273313
      // 037: invokestatic qeaa361f143ee4a0894bd168fd9b30c66/qf4ccf8f5435d4a78bdca4d6a018b578e/aabbabbbb.aaaaa (IJ)I
      // 03a: istore 6
      // 03c: iload 6
      // 03e: iinc 6 -1
      // 041: ifle 146
      // 044: aload 0
      // 045: getfield net/minecraft/class_310.field_1687 Lnet/minecraft/class_638;
      // 048: new net/minecraft/class_3959
      // 04b: dup
      // 04c: aload 5
      // 04e: aload 3
      // 04f: getstatic net/minecraft/class_3959$class_3960.field_17558 Lnet/minecraft/class_3959$class_3960;
      // 052: getstatic net/minecraft/class_3959$class_242.field_1348 Lnet/minecraft/class_3959$class_242;
      // 055: aload 1
      // 056: invokespecial net/minecraft/class_3959.<init> (Lnet/minecraft/class_243;Lnet/minecraft/class_243;Lnet/minecraft/class_3959$class_3960;Lnet/minecraft/class_3959$class_242;Lnet/minecraft/class_1297;)V
      // 059: invokevirtual net/minecraft/class_638.method_17742 (Lnet/minecraft/class_3959;)Lnet/minecraft/class_3965;
      // 05c: astore 7
      // 05e: aload 7
      // 060: iload 4
      // 062: ifne 08a
      // 065: ifnull 084
      // 068: goto 06c
      // 06b: athrow
      // 06c: aload 7
      // 06e: iload 4
      // 070: ifne 08a
      // 073: goto 077
      // 076: athrow
      // 077: invokevirtual net/minecraft/class_3965.method_17783 ()Lnet/minecraft/class_239$class_240;
      // 07a: getstatic net/minecraft/class_239$class_240.field_1333 Lnet/minecraft/class_239$class_240;
      // 07d: if_acmpne 08b
      // 080: goto 084
      // 083: athrow
      // 084: aload 7
      // 086: goto 08a
      // 089: athrow
      // 08a: areturn
      // 08b: aload 0
      // 08c: getfield net/minecraft/class_310.field_1687 Lnet/minecraft/class_638;
      // 08f: aload 7
      // 091: invokevirtual net/minecraft/class_3965.method_17777 ()Lnet/minecraft/class_2338;
      // 094: invokevirtual net/minecraft/class_638.method_8320 (Lnet/minecraft/class_2338;)Lnet/minecraft/class_2680;
      // 097: astore 8
      // 099: aload 8
      // 09b: iload 4
      // 09d: ifne 0b3
      // 0a0: getstatic net/minecraft/class_2246.field_10343 Lnet/minecraft/class_2248;
      // 0a3: invokevirtual net/minecraft/class_2680.method_27852 (Lnet/minecraft/class_2248;)Z
      // 0a6: ifne 0ff
      // 0a9: goto 0ad
      // 0ac: athrow
      // 0ad: aload 8
      // 0af: goto 0b3
      // 0b2: athrow
      // 0b3: iload 4
      // 0b5: ifne 0d0
      // 0b8: getstatic net/minecraft/class_2246.field_10382 Lnet/minecraft/class_2248;
      // 0bb: invokevirtual net/minecraft/class_2680.method_27852 (Lnet/minecraft/class_2248;)Z
      // 0be: ifne 0ff
      // 0c1: goto 0c5
      // 0c4: athrow
      // 0c5: aload 8
      // 0c7: iload 4
      // 0c9: ifne 0e1
      // 0cc: goto 0d0
      // 0cf: athrow
      // 0d0: invokevirtual net/minecraft/class_2680.method_26215 ()Z
      // 0d3: ifne 0ff
      // 0d6: aload 8
      // 0d8: iload 4
      // 0da: ifne 0ed
      // 0dd: goto 0e1
      // 0e0: athrow
      // 0e1: invokevirtual net/minecraft/class_2680.method_45474 ()Z
      // 0e4: ifne 0ff
      // 0e7: aload 8
      // 0e9: goto 0ed
      // 0ec: athrow
      // 0ed: aload 0
      // 0ee: getfield net/minecraft/class_310.field_1687 Lnet/minecraft/class_638;
      // 0f1: aload 7
      // 0f3: invokevirtual net/minecraft/class_3965.method_17777 ()Lnet/minecraft/class_2338;
      // 0f6: invokevirtual net/minecraft/class_2680.method_26220 (Lnet/minecraft/class_1922;Lnet/minecraft/class_2338;)Lnet/minecraft/class_265;
      // 0f9: invokevirtual net/minecraft/class_265.method_1110 ()Z
      // 0fc: ifeq 13d
      // 0ff: aload 3
      // 100: aload 5
      // 102: invokevirtual net/minecraft/class_243.method_1020 (Lnet/minecraft/class_243;)Lnet/minecraft/class_243;
      // 105: invokevirtual net/minecraft/class_243.method_1029 ()Lnet/minecraft/class_243;
      // 108: astore 9
      // 10a: aload 7
      // 10c: invokevirtual net/minecraft/class_3965.method_17784 ()Lnet/minecraft/class_243;
      // 10f: aload 9
      // 111: ldc2_w 0.01
      // 114: invokevirtual net/minecraft/class_243.method_1021 (D)Lnet/minecraft/class_243;
      // 117: invokevirtual net/minecraft/class_243.method_1019 (Lnet/minecraft/class_243;)Lnet/minecraft/class_243;
      // 11a: astore 5
      // 11c: aload 5
      // 11e: aload 2
      // 11f: invokevirtual net/minecraft/class_243.method_1025 (Lnet/minecraft/class_243;)D
      // 122: aload 3
      // 123: aload 2
      // 124: invokevirtual net/minecraft/class_243.method_1025 (Lnet/minecraft/class_243;)D
      // 127: dcmpl
      // 128: iflt 134
      // 12b: iload 4
      // 12d: ifeq 146
      // 130: goto 134
      // 133: athrow
      // 134: iload 4
      // 136: ifeq 141
      // 139: goto 13d
      // 13c: athrow
      // 13d: aload 7
      // 13f: areturn
      // 140: athrow
      // 141: iload 4
      // 143: ifeq 03c
      // 146: aconst_null
      // 147: areturn
   }

   private static Double abbb(Object var0, String var1, String var2) {
      try {
         return ((Number)var0.getClass().getMethod(var1).invoke(var0)).doubleValue();
      } catch (ReflectiveOperationException var6) {
         try {
            return ((Number)var0.getClass().getMethod(var2).invoke(var0)).doubleValue();
         } catch (ReflectiveOperationException var5) {
            try {
               Field var3 = var0.getClass().getDeclaredField(var2);
               var3.setAccessible(true);
               return ((Number)var3.get(var0)).doubleValue();
            } catch (ReflectiveOperationException var4) {
               return null;
            }
         }
      }
   }

   private static void baaa(class_304 param0, class_306 param1) {
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
      // 005: ifnull 013
      // 008: aload 1
      // 009: invokestatic qeaa361f143ee4a0894bd168fd9b30c66/qf4ccf8f5435d4a78bdca4d6a018b578e/aabbabbbb.bbaaaaa (Lnet/minecraft/class_3675$class_306;)Z
      // 00c: ifeq 015
      // 00f: goto 013
      // 012: athrow
      // 013: return
      // 014: athrow
      // 015: aload 0
      // 016: bipush 1
      // 017: invokevirtual net/minecraft/class_304.method_23481 (Z)V
      // 01a: getstatic qeaa361f143ee4a0894bd168fd9b30c66/qf4ccf8f5435d4a78bdca4d6a018b578e/aabbabbbb.aa Ljava/lang/reflect/Method;
      // 01d: iload 2
      // 01e: ifne 046
      // 021: ifnull 043
      // 024: goto 028
      // 027: athrow
      // 028: getstatic qeaa361f143ee4a0894bd168fd9b30c66/qf4ccf8f5435d4a78bdca4d6a018b578e/aabbabbbb.aa Ljava/lang/reflect/Method;
      // 02b: aconst_null
      // 02c: bipush 2
      // 02d: anewarray 4
      // 030: dup
      // 031: bipush 0
      // 032: aload 1
      // 033: aastore
      // 034: dup
      // 035: bipush 1
      // 036: bipush 1
      // 037: invokestatic java/lang/Boolean.valueOf (Z)Ljava/lang/Boolean;
      // 03a: aastore
      // 03b: invokevirtual java/lang/reflect/Method.invoke (Ljava/lang/Object;[Ljava/lang/Object;)Ljava/lang/Object;
      // 03e: pop
      // 03f: goto 043
      // 042: athrow
      // 043: getstatic qeaa361f143ee4a0894bd168fd9b30c66/qf4ccf8f5435d4a78bdca4d6a018b578e/aabbabbbb.babbb Ljava/lang/reflect/Method;
      // 046: iload 2
      // 047: ifne 075
      // 04a: ifnull 065
      // 04d: goto 051
      // 050: athrow
      // 051: getstatic qeaa361f143ee4a0894bd168fd9b30c66/qf4ccf8f5435d4a78bdca4d6a018b578e/aabbabbbb.babbb Ljava/lang/reflect/Method;
      // 054: aconst_null
      // 055: bipush 1
      // 056: anewarray 4
      // 059: dup
      // 05a: bipush 0
      // 05b: aload 1
      // 05c: aastore
      // 05d: invokevirtual java/lang/reflect/Method.invoke (Ljava/lang/Object;[Ljava/lang/Object;)Ljava/lang/Object;
      // 060: pop
      // 061: goto 065
      // 064: athrow
      // 065: aload 0
      // 066: bipush 0
      // 067: invokevirtual net/minecraft/class_304.method_23481 (Z)V
      // 06a: iload 2
      // 06b: ifne 08f
      // 06e: getstatic qeaa361f143ee4a0894bd168fd9b30c66/qf4ccf8f5435d4a78bdca4d6a018b578e/aabbabbbb.aa Ljava/lang/reflect/Method;
      // 071: goto 075
      // 074: athrow
      // 075: ifnull 105
      // 078: getstatic qeaa361f143ee4a0894bd168fd9b30c66/qf4ccf8f5435d4a78bdca4d6a018b578e/aabbabbbb.aa Ljava/lang/reflect/Method;
      // 07b: aconst_null
      // 07c: bipush 2
      // 07d: anewarray 4
      // 080: dup
      // 081: bipush 0
      // 082: aload 1
      // 083: aastore
      // 084: dup
      // 085: bipush 1
      // 086: bipush 0
      // 087: invokestatic java/lang/Boolean.valueOf (Z)Ljava/lang/Boolean;
      // 08a: aastore
      // 08b: invokevirtual java/lang/reflect/Method.invoke (Ljava/lang/Object;[Ljava/lang/Object;)Ljava/lang/Object;
      // 08e: pop
      // 08f: goto 105
      // 092: astore 3
      // 093: aload 3
      // 094: pop
      // 095: goto 105
      // 098: astore 3
      // 099: aload 3
      // 09a: pop
      // 09b: iload 2
      // 09c: ifne 0c5
      // 09f: aload 0
      // 0a0: bipush 0
      // 0a1: invokevirtual net/minecraft/class_304.method_23481 (Z)V
      // 0a4: getstatic qeaa361f143ee4a0894bd168fd9b30c66/qf4ccf8f5435d4a78bdca4d6a018b578e/aabbabbbb.aa Ljava/lang/reflect/Method;
      // 0a7: ifnull 105
      // 0aa: goto 0ae
      // 0ad: athrow
      // 0ae: getstatic qeaa361f143ee4a0894bd168fd9b30c66/qf4ccf8f5435d4a78bdca4d6a018b578e/aabbabbbb.aa Ljava/lang/reflect/Method;
      // 0b1: aconst_null
      // 0b2: bipush 2
      // 0b3: anewarray 4
      // 0b6: dup
      // 0b7: bipush 0
      // 0b8: aload 1
      // 0b9: aastore
      // 0ba: dup
      // 0bb: bipush 1
      // 0bc: bipush 0
      // 0bd: invokestatic java/lang/Boolean.valueOf (Z)Ljava/lang/Boolean;
      // 0c0: aastore
      // 0c1: invokevirtual java/lang/reflect/Method.invoke (Ljava/lang/Object;[Ljava/lang/Object;)Ljava/lang/Object;
      // 0c4: pop
      // 0c5: goto 105
      // 0c8: astore 3
      // 0c9: aload 3
      // 0ca: pop
      // 0cb: goto 105
      // 0ce: astore 4
      // 0d0: aload 0
      // 0d1: iload 2
      // 0d2: ifne 0f9
      // 0d5: bipush 0
      // 0d6: invokevirtual net/minecraft/class_304.method_23481 (Z)V
      // 0d9: getstatic qeaa361f143ee4a0894bd168fd9b30c66/qf4ccf8f5435d4a78bdca4d6a018b578e/aabbabbbb.aa Ljava/lang/reflect/Method;
      // 0dc: ifnull 102
      // 0df: goto 0e3
      // 0e2: athrow
      // 0e3: getstatic qeaa361f143ee4a0894bd168fd9b30c66/qf4ccf8f5435d4a78bdca4d6a018b578e/aabbabbbb.aa Ljava/lang/reflect/Method;
      // 0e6: aconst_null
      // 0e7: bipush 2
      // 0e8: anewarray 4
      // 0eb: dup
      // 0ec: bipush 0
      // 0ed: aload 1
      // 0ee: aastore
      // 0ef: dup
      // 0f0: bipush 1
      // 0f1: bipush 0
      // 0f2: invokestatic java/lang/Boolean.valueOf (Z)Ljava/lang/Boolean;
      // 0f5: aastore
      // 0f6: invokevirtual java/lang/reflect/Method.invoke (Ljava/lang/Object;[Ljava/lang/Object;)Ljava/lang/Object;
      // 0f9: pop
      // 0fa: goto 102
      // 0fd: astore 5
      // 0ff: aload 5
      // 101: pop
      // 102: aload 4
      // 104: athrow
      // 105: return
   }

   public static long baab() {
      return bb;
   }

   public static class_1297 baba(class_310 param0) {
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
      // 05: ifnull 1a
      // 08: getstatic qeaa361f143ee4a0894bd168fd9b30c66/qf4ccf8f5435d4a78bdca4d6a018b578e/aabbabbbb.aababa Ljava/lang/reflect/Method;
      // 0b: iload 1
      // 0c: ifne 28
      // 0f: goto 13
      // 12: athrow
      // 13: ifnonnull 1d
      // 16: goto 1a
      // 19: athrow
      // 1a: aconst_null
      // 1b: areturn
      // 1c: athrow
      // 1d: getstatic qeaa361f143ee4a0894bd168fd9b30c66/qf4ccf8f5435d4a78bdca4d6a018b578e/aabbabbbb.aababa Ljava/lang/reflect/Method;
      // 20: aload 0
      // 21: bipush 0
      // 22: anewarray 4
      // 25: invokevirtual java/lang/reflect/Method.invoke (Ljava/lang/Object;[Ljava/lang/Object;)Ljava/lang/Object;
      // 28: checkcast net/minecraft/class_1297
      // 2b: areturn
      // 2c: astore 2
      // 2d: aload 2
      // 2e: pop
      // 2f: aconst_null
      // 30: areturn
   }

   public static boolean babb(int param0) {
      // $VF: Couldn't be decompiled
      // Please report this to the Vineflower issue tracker, at https://github.com/Vineflower/vineflower/issues with a copy of the class file (if you have the rights to distribute it!)
      // java.lang.RuntimeException: parsing failure!
      //   at org.jetbrains.java.decompiler.modules.decompiler.decompose.DomHelper.parseGraph(DomHelper.java:211)
      //   at org.jetbrains.java.decompiler.main.rels.MethodProcessor.codeToJava(MethodProcessor.java:166)
      //
      // Bytecode:
      // 00: getstatic qeaa361f143ee4a0894bd168fd9b30c66/qf4ccf8f5435d4a78bdca4d6a018b578e/baaabbaa.bba I
      // 03: istore 1
      // 04: iload 0
      // 05: iload 1
      // 06: ifne 11
      // 09: iflt 38
      // 0c: goto 10
      // 0f: athrow
      // 10: iload 0
      // 11: iload 1
      // 12: ifne 29
      // 15: getstatic qeaa361f143ee4a0894bd168fd9b30c66/qf4ccf8f5435d4a78bdca4d6a018b578e/aabbabbbb.bbbbb [Z
      // 18: arraylength
      // 19: if_icmpge 38
      // 1c: goto 20
      // 1f: athrow
      // 20: getstatic qeaa361f143ee4a0894bd168fd9b30c66/qf4ccf8f5435d4a78bdca4d6a018b578e/aabbabbbb.bbbbb [Z
      // 23: iload 0
      // 24: baload
      // 25: goto 29
      // 28: athrow
      // 29: iload 1
      // 2a: ifne 35
      // 2d: ifeq 38
      // 30: goto 34
      // 33: athrow
      // 34: bipush 1
      // 35: goto 39
      // 38: bipush 0
      // 39: ireturn
   }

   private static boolean bbaa(class_310 param0) {
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
      // 06: ifne 11
      // 09: ifnull 4e
      // 0c: goto 10
      // 0f: athrow
      // 10: aload 0
      // 11: getfield net/minecraft/class_310.field_1724 Lnet/minecraft/class_746;
      // 14: ifnull 4e
      // 17: getstatic qeaa361f143ee4a0894bd168fd9b30c66/qf4ccf8f5435d4a78bdca4d6a018b578e/aabbabbbb.babab J
      // 1a: getstatic qeaa361f143ee4a0894bd168fd9b30c66/qf4ccf8f5435d4a78bdca4d6a018b578e/aabbabbbb.abbab J
      // 1d: lcmp
      // 1e: iload 1
      // 1f: ifne 38
      // 22: goto 26
      // 25: athrow
      // 26: ifne 4e
      // 29: goto 2d
      // 2c: athrow
      // 2d: aload 0
      // 2e: getfield net/minecraft/class_310.field_1724 Lnet/minecraft/class_746;
      // 31: invokestatic java/lang/System.identityHashCode (Ljava/lang/Object;)I
      // 34: goto 38
      // 37: athrow
      // 38: iload 1
      // 39: ifne 4b
      // 3c: getstatic qeaa361f143ee4a0894bd168fd9b30c66/qf4ccf8f5435d4a78bdca4d6a018b578e/aabbabbbb.aabaaa I
      // 3f: if_icmpne 4e
      // 42: goto 46
      // 45: athrow
      // 46: bipush 1
      // 47: goto 4b
      // 4a: athrow
      // 4b: goto 4f
      // 4e: bipush 0
      // 4f: ireturn
   }

   public static void bbab(class_310 param0, int param1, int param2) {
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
      // 06: ifne 11
      // 09: ifnull 46
      // 0c: goto 10
      // 0f: athrow
      // 10: aload 0
      // 11: getfield net/minecraft/class_310.field_1724 Lnet/minecraft/class_746;
      // 14: ifnull 46
      // 17: iload 1
      // 18: iload 3
      // 19: ifne 28
      // 1c: goto 20
      // 1f: athrow
      // 20: iflt 46
      // 23: goto 27
      // 26: athrow
      // 27: iload 1
      // 28: iload 3
      // 29: ifne 52
      // 2c: ldc_w 604047306
      // 2f: ldc_w -1729374902
      // 32: ldc_w -1959452875
      // 35: ixor
      // 36: invokestatic qeaa361f143ee4a0894bd168fd9b30c66/qf4ccf8f5435d4a78bdca4d6a018b578e/aabbabbbb.b (II)I
      // 39: ldc2_w 6146930655705273313
      // 3c: invokestatic qeaa361f143ee4a0894bd168fd9b30c66/qf4ccf8f5435d4a78bdca4d6a018b578e/aabbabbbb.aaaaa (IJ)I
      // 3f: if_icmple 48
      // 42: goto 46
      // 45: athrow
      // 46: return
      // 47: athrow
      // 48: aload 0
      // 49: getfield net/minecraft/class_310.field_1724 Lnet/minecraft/class_746;
      // 4c: invokevirtual net/minecraft/class_746.method_31548 ()Lnet/minecraft/class_1661;
      // 4f: invokestatic qeaa361f143ee4a0894bd168fd9b30c66/qf4ccf8f5435d4a78bdca4d6a018b578e/aabbabbbb.abaabaa (Lnet/minecraft/class_1661;)I
      // 52: istore 4
      // 54: iload 3
      // 55: ifne 86
      // 58: iload 4
      // 5a: iload 1
      // 5b: if_icmpne 64
      // 5e: goto 62
      // 61: athrow
      // 62: return
      // 63: athrow
      // 64: getstatic qeaa361f143ee4a0894bd168fd9b30c66/qf4ccf8f5435d4a78bdca4d6a018b578e/aabbabbbb.bbab Ljava/util/concurrent/ConcurrentLinkedQueue;
      // 67: new qeaa361f143ee4a0894bd168fd9b30c66/qf4ccf8f5435d4a78bdca4d6a018b578e/abaaaba
      // 6a: dup
      // 6b: aload 0
      // 6c: getfield net/minecraft/class_310.field_1724 Lnet/minecraft/class_746;
      // 6f: iload 1
      // 70: iload 4
      // 72: aload 0
      // 73: getfield net/minecraft/class_310.field_1724 Lnet/minecraft/class_746;
      // 76: getfield net/minecraft/class_746.field_6012 I
      // 79: bipush 1
      // 7a: iload 2
      // 7b: invokestatic java/lang/Math.max (II)I
      // 7e: iadd
      // 7f: invokespecial qeaa361f143ee4a0894bd168fd9b30c66/qf4ccf8f5435d4a78bdca4d6a018b578e/abaaaba.<init> (Lnet/minecraft/class_746;III)V
      // 82: invokevirtual java/util/concurrent/ConcurrentLinkedQueue.add (Ljava/lang/Object;)Z
      // 85: pop
      // 86: return
   }

   private static void bbba(class_310 param0) {
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
      // 06: ifne 11
      // 09: ifnull 1f
      // 0c: goto 10
      // 0f: athrow
      // 10: aload 0
      // 11: iload 1
      // 12: ifne 2c
      // 15: getfield net/minecraft/class_310.field_1724 Lnet/minecraft/class_746;
      // 18: ifnonnull 21
      // 1b: goto 1f
      // 1e: athrow
      // 1f: return
      // 20: athrow
      // 21: aload 0
      // 22: getfield net/minecraft/class_310.field_1724 Lnet/minecraft/class_746;
      // 25: invokestatic java/lang/System.identityHashCode (Ljava/lang/Object;)I
      // 28: putstatic qeaa361f143ee4a0894bd168fd9b30c66/qf4ccf8f5435d4a78bdca4d6a018b578e/aabbabbbb.aaaa I
      // 2b: aload 0
      // 2c: getfield net/minecraft/class_310.field_1724 Lnet/minecraft/class_746;
      // 2f: getfield net/minecraft/class_746.field_6012 I
      // 32: putstatic qeaa361f143ee4a0894bd168fd9b30c66/qf4ccf8f5435d4a78bdca4d6a018b578e/aabbabbbb.abbaa I
      // 35: return
   }

   public static boolean bbbb(class_310 param0, class_1297 param1) {
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
      // 11: getfield net/minecraft/class_310.field_1724 Lnet/minecraft/class_746;
      // 14: iload 2
      // 15: ifne 23
      // 18: ifnonnull 22
      // 1b: goto 1f
      // 1e: athrow
      // 1f: bipush 0
      // 20: ireturn
      // 21: athrow
      // 22: aload 1
      // 23: ifnonnull 2b
      // 26: aconst_null
      // 27: goto 33
      // 2a: athrow
      // 2b: new net/minecraft/class_3966
      // 2e: dup
      // 2f: aload 1
      // 30: invokespecial net/minecraft/class_3966.<init> (Lnet/minecraft/class_1297;)V
      // 33: astore 3
      // 34: aload 0
      // 35: invokestatic qeaa361f143ee4a0894bd168fd9b30c66/qf4ccf8f5435d4a78bdca4d6a018b578e/aabbabbbb.aabbaba (Lnet/minecraft/class_310;)V
      // 38: aload 0
      // 39: getfield net/minecraft/class_310.field_1765 Lnet/minecraft/class_239;
      // 3c: astore 4
      // 3e: aload 1
      // 3f: ifnull 4b
      // 42: aload 0
      // 43: aload 3
      // 44: putfield net/minecraft/class_310.field_1765 Lnet/minecraft/class_239;
      // 47: goto 4b
      // 4a: athrow
      // 4b: aload 0
      // 4c: invokestatic qeaa361f143ee4a0894bd168fd9b30c66/qf4ccf8f5435d4a78bdca4d6a018b578e/aabbabbbb.babbaab (Lnet/minecraft/class_310;)Z
      // 4f: istore 5
      // 51: aload 0
      // 52: aload 4
      // 54: putfield net/minecraft/class_310.field_1765 Lnet/minecraft/class_239;
      // 57: iload 5
      // 59: ireturn
      // 5a: astore 6
      // 5c: aload 0
      // 5d: aload 4
      // 5f: putfield net/minecraft/class_310.field_1765 Lnet/minecraft/class_239;
      // 62: aload 6
      // 64: athrow
   }

   private static int aaaaa(int var0, long var1) {
      int var3 = var0 ^ (int)(var1 & 32767L) ^ b(604047309, -1891831411 ^ 346380706);
      if (aabba[var3] == null) {
         aabba[var3] = (int)(bbaba[var3] ^ var1);
      }

      return aabba[var3];
   }

   private static boolean aaaab(class_310 param0) {
      // $VF: Couldn't be decompiled
      // Please report this to the Vineflower issue tracker, at https://github.com/Vineflower/vineflower/issues with a copy of the class file (if you have the rights to distribute it!)
      // java.lang.RuntimeException: parsing failure!
      //   at org.jetbrains.java.decompiler.modules.decompiler.decompose.DomHelper.parseGraph(DomHelper.java:211)
      //   at org.jetbrains.java.decompiler.main.rels.MethodProcessor.codeToJava(MethodProcessor.java:166)
      //
      // Bytecode:
      // 000: getstatic qeaa361f143ee4a0894bd168fd9b30c66/qf4ccf8f5435d4a78bdca4d6a018b578e/aabbabbbb.bb J
      // 003: lstore 2
      // 004: getstatic qeaa361f143ee4a0894bd168fd9b30c66/qf4ccf8f5435d4a78bdca4d6a018b578e/baaabbaa.bba I
      // 007: aload 0
      // 008: getfield net/minecraft/class_310.field_1765 Lnet/minecraft/class_239;
      // 00b: astore 5
      // 00d: istore 1
      // 00e: aload 5
      // 010: iload 1
      // 011: ifne 024
      // 014: instanceof net/minecraft/class_3966
      // 017: ifeq 03c
      // 01a: goto 01e
      // 01d: athrow
      // 01e: aload 5
      // 020: goto 024
      // 023: athrow
      // 024: checkcast net/minecraft/class_3966
      // 027: astore 4
      // 029: aload 4
      // 02b: invokevirtual net/minecraft/class_3966.method_17782 ()Lnet/minecraft/class_1297;
      // 02e: instanceof net/minecraft/class_1511
      // 031: ifeq 03c
      // 034: aload 0
      // 035: invokestatic qeaa361f143ee4a0894bd168fd9b30c66/qf4ccf8f5435d4a78bdca4d6a018b578e/aabbabbbb.bbba (Lnet/minecraft/class_310;)V
      // 038: goto 03c
      // 03b: athrow
      // 03c: aload 0
      // 03d: getfield net/minecraft/class_310.field_1724 Lnet/minecraft/class_746;
      // 040: astore 4
      // 042: getstatic qeaa361f143ee4a0894bd168fd9b30c66/qf4ccf8f5435d4a78bdca4d6a018b578e/aabbabbbb.babb I
      // 045: iload 1
      // 046: ifne 058
      // 049: ifle 067
      // 04c: goto 050
      // 04f: athrow
      // 050: aload 0
      // 051: invokestatic qeaa361f143ee4a0894bd168fd9b30c66/qf4ccf8f5435d4a78bdca4d6a018b578e/aabbabbbb.abaaaab (Lnet/minecraft/class_310;)Z
      // 054: goto 058
      // 057: athrow
      // 058: iload 1
      // 059: ifne 064
      // 05c: ifeq 067
      // 05f: goto 063
      // 062: athrow
      // 063: bipush 1
      // 064: goto 068
      // 067: bipush 0
      // 068: istore 5
      // 06a: aload 4
      // 06c: ifnull 0ab
      // 06f: iload 5
      // 071: iload 1
      // 072: ifne 091
      // 075: goto 079
      // 078: athrow
      // 079: ifne 0ab
      // 07c: goto 080
      // 07f: athrow
      // 080: aload 4
      // 082: iload 1
      // 083: ifne 096
      // 086: goto 08a
      // 089: athrow
      // 08a: invokevirtual net/minecraft/class_746.method_5624 ()Z
      // 08d: goto 091
      // 090: athrow
      // 091: ifne 0ab
      // 094: aload 4
      // 096: checkcast qeaa361f143ee4a0894bd168fd9b30c66/q9fca77a8c4f94f01ae294010b0bee919/aabbbabaa
      // 099: invokeinterface qeaa361f143ee4a0894bd168fd9b30c66/q9fca77a8c4f94f01ae294010b0bee919/aabbbabaa.yj$getLastSprinting ()Z 1
      // 09e: iload 1
      // 09f: ifne 0aa
      // 0a2: ifeq 0ab
      // 0a5: goto 0a9
      // 0a8: athrow
      // 0a9: bipush 0
      // 0aa: ireturn
      // 0ab: aload 0
      // 0ac: iload 1
      // 0ad: ifne 0e0
      // 0b0: getfield net/minecraft/class_310.field_1761 Lnet/minecraft/class_636;
      // 0b3: ifnull 0db
      // 0b6: goto 0ba
      // 0b9: athrow
      // 0ba: aload 0
      // 0bb: iload 1
      // 0bc: ifne 0e0
      // 0bf: goto 0c3
      // 0c2: athrow
      // 0c3: getfield net/minecraft/class_310.field_1761 Lnet/minecraft/class_636;
      // 0c6: invokestatic qeaa361f143ee4a0894bd168fd9b30c66/qf4ccf8f5435d4a78bdca4d6a018b578e/bbbabaa.babb (Lnet/minecraft/class_636;)Z
      // 0c9: ifeq 0db
      // 0cc: goto 0d0
      // 0cf: athrow
      // 0d0: aload 0
      // 0d1: getfield net/minecraft/class_310.field_1761 Lnet/minecraft/class_636;
      // 0d4: invokevirtual net/minecraft/class_636.method_2925 ()V
      // 0d7: goto 0db
      // 0da: athrow
      // 0db: aload 0
      // 0dc: invokestatic qeaa361f143ee4a0894bd168fd9b30c66/qf4ccf8f5435d4a78bdca4d6a018b578e/aabbabbbb.aabbbb (Lnet/minecraft/class_310;)V
      // 0df: aload 0
      // 0e0: invokestatic qeaa361f143ee4a0894bd168fd9b30c66/qf4ccf8f5435d4a78bdca4d6a018b578e/bbbabaa.bba (Lnet/minecraft/class_310;)Z
      // 0e3: istore 6
      // 0e5: getstatic qeaa361f143ee4a0894bd168fd9b30c66/qf4ccf8f5435d4a78bdca4d6a018b578e/aabbabbbb.bb J
      // 0e8: lload 2
      // 0e9: lcmp
      // 0ea: iload 1
      // 0eb: ifne 0f6
      // 0ee: ifeq 0f9
      // 0f1: goto 0f5
      // 0f4: athrow
      // 0f5: bipush 1
      // 0f6: goto 0fa
      // 0f9: bipush 0
      // 0fa: istore 7
      // 0fc: iload 7
      // 0fe: ifeq 109
      // 101: aload 0
      // 102: invokestatic qeaa361f143ee4a0894bd168fd9b30c66/qf4ccf8f5435d4a78bdca4d6a018b578e/aabbabbbb.aaabbab (Lnet/minecraft/class_310;)V
      // 105: goto 109
      // 108: athrow
      // 109: aload 0
      // 10a: getfield net/minecraft/class_310.field_1765 Lnet/minecraft/class_239;
      // 10d: astore 10
      // 10f: aload 10
      // 111: iload 1
      // 112: ifne 125
      // 115: instanceof net/minecraft/class_3966
      // 118: ifeq 149
      // 11b: goto 11f
      // 11e: athrow
      // 11f: aload 10
      // 121: goto 125
      // 124: athrow
      // 125: checkcast net/minecraft/class_3966
      // 128: astore 9
      // 12a: aload 9
      // 12c: iload 1
      // 12d: ifne 140
      // 130: invokevirtual net/minecraft/class_3966.method_17782 ()Lnet/minecraft/class_1297;
      // 133: ifnull 149
      // 136: goto 13a
      // 139: athrow
      // 13a: aload 9
      // 13c: goto 140
      // 13f: athrow
      // 140: invokevirtual net/minecraft/class_3966.method_17782 ()Lnet/minecraft/class_1297;
      // 143: invokevirtual net/minecraft/class_1297.method_5628 ()I
      // 146: goto 14a
      // 149: bipush -1
      // 14a: istore 8
      // 14c: aload 0
      // 14d: iload 7
      // 14f: iload 8
      // 151: invokestatic qeaa361f143ee4a0894bd168fd9b30c66/qf4ccf8f5435d4a78bdca4d6a018b578e/aaababaaa.bb (Lnet/minecraft/class_310;ZI)V
      // 154: iload 6
      // 156: iload 1
      // 157: ifne 173
      // 15a: ifne 172
      // 15d: goto 161
      // 160: athrow
      // 161: iload 7
      // 163: iload 1
      // 164: ifne 173
      // 167: goto 16b
      // 16a: athrow
      // 16b: ifeq 176
      // 16e: goto 172
      // 171: athrow
      // 172: bipush 1
      // 173: goto 177
      // 176: bipush 0
      // 177: ireturn
   }

   // $VF: Handled exception range with multiple entry points by splitting it
   // $VF: Duplicated exception handlers to handle obfuscated exceptions
   public static abaabbba aaaba(
      class_310 var0, Object var1, int var2, bbbabbab var3, int var4, boolean var5, Runnable var6
   ) {
      int var7 = baaabbaa.bba;

      label30: {
         class_310 var10000;
         label29: {
            try {
               var10000 = var0;
               if (var7 != 0) {
                  break label29;
               }

               if (var0 == null) {
                  break label30;
               }
            } catch (MatchException var10) {
               throw var10;
            }

            var10000 = var0;
         }

         try {
            if (var10000.field_1724 != null) {
               return aba.bbba(new aaaababaa(var0), var1, var2, var3, var4, var5, var6);
            }
         } catch (MatchException var9) {
            throw var9;
         }
      }

      try {
         return new abaabbba(0L, var1);
      } catch (MatchException var8) {
         throw var8;
      }
   }

   public static void aaabb(class_310 var0, int var1) {
      ababaaa(var0, var1, false);
   }

   public static void aabaa(class_310 param0) {
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
      // 06: ifne 11
      // 09: ifnull 2a
      // 0c: goto 10
      // 0f: athrow
      // 10: aload 0
      // 11: iload 1
      // 12: ifne 24
      // 15: getfield net/minecraft/class_310.field_1724 Lnet/minecraft/class_746;
      // 18: ifnull 2a
      // 1b: goto 1f
      // 1e: athrow
      // 1f: aload 0
      // 20: goto 24
      // 23: athrow
      // 24: getfield net/minecraft/class_310.field_1761 Lnet/minecraft/class_636;
      // 27: ifnonnull 34
      // 2a: bipush -1
      // 2b: putstatic qeaa361f143ee4a0894bd168fd9b30c66/qf4ccf8f5435d4a78bdca4d6a018b578e/aabbabbbb.aaaab I
      // 2e: bipush 0
      // 2f: putstatic qeaa361f143ee4a0894bd168fd9b30c66/qf4ccf8f5435d4a78bdca4d6a018b578e/aabbabbbb.baaba Z
      // 32: return
      // 33: athrow
      // 34: getstatic qeaa361f143ee4a0894bd168fd9b30c66/qf4ccf8f5435d4a78bdca4d6a018b578e/aabbabbbb.babaa Z
      // 37: iload 1
      // 38: ifne 45
      // 3b: ifeq 62
      // 3e: goto 42
      // 41: athrow
      // 42: getstatic qeaa361f143ee4a0894bd168fd9b30c66/qf4ccf8f5435d4a78bdca4d6a018b578e/aabbabbbb.aaaab I
      // 45: iload 1
      // 46: ifne 67
      // 49: ifge 63
      // 4c: goto 50
      // 4f: athrow
      // 50: getstatic qeaa361f143ee4a0894bd168fd9b30c66/qf4ccf8f5435d4a78bdca4d6a018b578e/aabbabbbb.baaba Z
      // 53: iload 1
      // 54: ifne 67
      // 57: goto 5b
      // 5a: athrow
      // 5b: ifne 63
      // 5e: goto 62
      // 61: athrow
      // 62: return
      // 63: aload 0
      // 64: invokestatic qeaa361f143ee4a0894bd168fd9b30c66/qf4ccf8f5435d4a78bdca4d6a018b578e/aabbabbbb.abaaaab (Lnet/minecraft/class_310;)Z
      // 67: iload 1
      // 68: ifne 75
      // 6b: ifne 8e
      // 6e: goto 72
      // 71: athrow
      // 72: invokestatic qeaa361f143ee4a0894bd168fd9b30c66/qf4ccf8f5435d4a78bdca4d6a018b578e/aabbabbbb.abbbabb ()Z
      // 75: iload 1
      // 76: ifne 83
      // 79: ifne 8e
      // 7c: goto 80
      // 7f: athrow
      // 80: invokestatic qeaa361f143ee4a0894bd168fd9b30c66/qf4ccf8f5435d4a78bdca4d6a018b578e/aabbabbbb.babbbb ()Z
      // 83: iload 1
      // 84: ifne 9b
      // 87: ifeq 8f
      // 8a: goto 8e
      // 8d: athrow
      // 8e: return
      // 8f: aload 0
      // 90: getfield net/minecraft/class_310.field_1761 Lnet/minecraft/class_636;
      // 93: invokestatic qeaa361f143ee4a0894bd168fd9b30c66/qf4ccf8f5435d4a78bdca4d6a018b578e/bbbabaa.abba (Lnet/minecraft/class_636;)V
      // 96: bipush -1
      // 97: putstatic qeaa361f143ee4a0894bd168fd9b30c66/qf4ccf8f5435d4a78bdca4d6a018b578e/aabbabbbb.aaaab I
      // 9a: bipush 0
      // 9b: putstatic qeaa361f143ee4a0894bd168fd9b30c66/qf4ccf8f5435d4a78bdca4d6a018b578e/aabbabbbb.baaba Z
      // 9e: return
   }

   public static boolean aabab(class_310 var0, class_1268 var1) {
      return abaaba(var0, var1);
   }

   public static void aabba(class_310 param0, class_1297 param1) {
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
      // 09: ifnull 32
      // 0c: goto 10
      // 0f: athrow
      // 10: aload 0
      // 11: iload 2
      // 12: ifne 24
      // 15: getfield net/minecraft/class_310.field_1724 Lnet/minecraft/class_746;
      // 18: ifnull 32
      // 1b: goto 1f
      // 1e: athrow
      // 1f: aload 0
      // 20: goto 24
      // 23: athrow
      // 24: getfield net/minecraft/class_310.field_1761 Lnet/minecraft/class_636;
      // 27: ifnull 32
      // 2a: aload 1
      // 2b: ifnonnull 34
      // 2e: goto 32
      // 31: athrow
      // 32: return
      // 33: athrow
      // 34: aload 0
      // 35: aload 1
      // 36: invokestatic qeaa361f143ee4a0894bd168fd9b30c66/qf4ccf8f5435d4a78bdca4d6a018b578e/aabbabbbb.bbbb (Lnet/minecraft/class_310;Lnet/minecraft/class_1297;)Z
      // 39: pop
      // 3a: return
   }

   public static void aabbb(class_2596 param0) {
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
      // 06: ifne 18
      // 09: instanceof net/minecraft/class_2885
      // 0c: ifne 26
      // 0f: goto 13
      // 12: athrow
      // 13: aload 0
      // 14: goto 18
      // 17: athrow
      // 18: iload 1
      // 19: ifne 5a
      // 1c: instanceof net/minecraft/class_2886
      // 1f: ifeq 59
      // 22: goto 26
      // 25: athrow
      // 26: invokestatic net/minecraft/class_310.method_1551 ()Lnet/minecraft/class_310;
      // 29: astore 2
      // 2a: aload 2
      // 2b: iload 1
      // 2c: ifne 37
      // 2f: ifnull 59
      // 32: goto 36
      // 35: athrow
      // 36: aload 2
      // 37: iload 1
      // 38: ifne 50
      // 3b: getfield net/minecraft/class_310.field_1724 Lnet/minecraft/class_746;
      // 3e: ifnull 59
      // 41: goto 45
      // 44: athrow
      // 45: getstatic qeaa361f143ee4a0894bd168fd9b30c66/qf4ccf8f5435d4a78bdca4d6a018b578e/aabbabbbb.babab J
      // 48: putstatic qeaa361f143ee4a0894bd168fd9b30c66/qf4ccf8f5435d4a78bdca4d6a018b578e/aabbabbbb.ab J
      // 4b: aload 2
      // 4c: goto 50
      // 4f: athrow
      // 50: getfield net/minecraft/class_310.field_1724 Lnet/minecraft/class_746;
      // 53: invokestatic java/lang/System.identityHashCode (Ljava/lang/Object;)I
      // 56: putstatic qeaa361f143ee4a0894bd168fd9b30c66/qf4ccf8f5435d4a78bdca4d6a018b578e/aabbabbbb.babba I
      // 59: aload 0
      // 5a: iload 1
      // 5b: ifne 7d
      // 5e: instanceof net/minecraft/class_2885
      // 61: ifeq 78
      // 64: goto 68
      // 67: athrow
      // 68: getstatic qeaa361f143ee4a0894bd168fd9b30c66/qf4ccf8f5435d4a78bdca4d6a018b578e/aabbabbbb.a J
      // 6b: lconst_1
      // 6c: ladd
      // 6d: putstatic qeaa361f143ee4a0894bd168fd9b30c66/qf4ccf8f5435d4a78bdca4d6a018b578e/aabbabbbb.a J
      // 70: iload 1
      // 71: ifeq c2
      // 74: goto 78
      // 77: athrow
      // 78: aload 0
      // 79: goto 7d
      // 7c: athrow
      // 7d: iload 1
      // 7e: ifne a0
      // 81: instanceof net/minecraft/class_2886
      // 84: ifeq 9b
      // 87: goto 8b
      // 8a: athrow
      // 8b: getstatic qeaa361f143ee4a0894bd168fd9b30c66/qf4ccf8f5435d4a78bdca4d6a018b578e/aabbabbbb.aaaabb J
      // 8e: lconst_1
      // 8f: ladd
      // 90: putstatic qeaa361f143ee4a0894bd168fd9b30c66/qf4ccf8f5435d4a78bdca4d6a018b578e/aabbabbbb.aaaabb J
      // 93: iload 1
      // 94: ifeq c2
      // 97: goto 9b
      // 9a: athrow
      // 9b: aload 0
      // 9c: goto a0
      // 9f: athrow
      // a0: iload 1
      // a1: ifne b3
      // a4: instanceof net/minecraft/class_2824
      // a7: ifeq c2
      // aa: goto ae
      // ad: athrow
      // ae: aload 0
      // af: goto b3
      // b2: athrow
      // b3: checkcast net/minecraft/class_2824
      // b6: astore 2
      // b7: aload 2
      // b8: new qeaa361f143ee4a0894bd168fd9b30c66/qf4ccf8f5435d4a78bdca4d6a018b578e/bbbbbaaa
      // bb: dup
      // bc: invokespecial qeaa361f143ee4a0894bd168fd9b30c66/qf4ccf8f5435d4a78bdca4d6a018b578e/bbbbbaaa.<init> ()V
      // bf: invokevirtual net/minecraft/class_2824.method_34209 (Lnet/minecraft/class_2824$class_5908;)V
      // c2: return
   }

   public static boolean abaaa(class_310 param0, int param1) {
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
      // 05: iload 1
      // 06: invokestatic qeaa361f143ee4a0894bd168fd9b30c66/qf4ccf8f5435d4a78bdca4d6a018b578e/aabbabbbb.bababa (Lnet/minecraft/class_310;I)Z
      // 09: iload 2
      // 0a: ifne 43
      // 0d: ifne 3e
      // 10: goto 14
      // 13: athrow
      // 14: aload 0
      // 15: iload 2
      // 16: ifne 25
      // 19: goto 1d
      // 1c: athrow
      // 1d: ifnull 46
      // 20: goto 24
      // 23: athrow
      // 24: aload 0
      // 25: getfield net/minecraft/class_310.field_1724 Lnet/minecraft/class_746;
      // 28: ifnull 46
      // 2b: invokestatic qeaa361f143ee4a0894bd168fd9b30c66/qf4ccf8f5435d4a78bdca4d6a018b578e/bbbbbbba.ba ()I
      // 2e: iload 2
      // 2f: ifne 43
      // 32: goto 36
      // 35: athrow
      // 36: iload 1
      // 37: if_icmpne 46
      // 3a: goto 3e
      // 3d: athrow
      // 3e: bipush 1
      // 3f: goto 43
      // 42: athrow
      // 43: goto 47
      // 46: bipush 0
      // 47: ireturn
   }

   public static boolean abaab(class_1839 param0) {
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
      // 06: ifne 18
      // 09: getstatic net/minecraft/class_1839.field_8950 Lnet/minecraft/class_1839;
      // 0c: if_acmpeq 1e
      // 0f: goto 13
      // 12: athrow
      // 13: aload 0
      // 14: goto 18
      // 17: athrow
      // 18: getstatic net/minecraft/class_1839.field_8946 Lnet/minecraft/class_1839;
      // 1b: if_acmpne 23
      // 1e: bipush 1
      // 1f: goto 24
      // 22: athrow
      // 23: bipush 0
      // 24: ireturn
   }

   public static boolean ababa(class_310 param0) {
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
      // 06: ifne 11
      // 09: ifnull 45
      // 0c: goto 10
      // 0f: athrow
      // 10: aload 0
      // 11: iload 1
      // 12: ifne 24
      // 15: getfield net/minecraft/class_310.field_1690 Lnet/minecraft/class_315;
      // 18: ifnull 45
      // 1b: goto 1f
      // 1e: athrow
      // 1f: aload 0
      // 20: goto 24
      // 23: athrow
      // 24: iload 1
      // 25: ifne 37
      // 28: getfield net/minecraft/class_310.field_1755 Lnet/minecraft/class_437;
      // 2b: ifnonnull 45
      // 2e: goto 32
      // 31: athrow
      // 32: aload 0
      // 33: goto 37
      // 36: athrow
      // 37: iload 1
      // 38: ifne 49
      // 3b: invokevirtual net/minecraft/class_310.method_1569 ()Z
      // 3e: ifne 48
      // 41: goto 45
      // 44: athrow
      // 45: bipush 0
      // 46: ireturn
      // 47: athrow
      // 48: aload 0
      // 49: aload 0
      // 4a: getfield net/minecraft/class_310.field_1690 Lnet/minecraft/class_315;
      // 4d: getfield net/minecraft/class_315.field_1886 Lnet/minecraft/class_304;
      // 50: invokestatic qeaa361f143ee4a0894bd168fd9b30c66/qf4ccf8f5435d4a78bdca4d6a018b578e/aabbabbbb.bbbbb (Lnet/minecraft/class_310;Lnet/minecraft/class_304;)Z
      // 53: iload 1
      // 54: ifne 79
      // 57: ifne 78
      // 5a: goto 5e
      // 5d: athrow
      // 5e: aload 0
      // 5f: aload 0
      // 60: getfield net/minecraft/class_310.field_1690 Lnet/minecraft/class_315;
      // 63: getfield net/minecraft/class_315.field_1904 Lnet/minecraft/class_304;
      // 66: invokestatic qeaa361f143ee4a0894bd168fd9b30c66/qf4ccf8f5435d4a78bdca4d6a018b578e/aabbabbbb.bbbbb (Lnet/minecraft/class_310;Lnet/minecraft/class_304;)Z
      // 69: iload 1
      // 6a: ifne 79
      // 6d: goto 71
      // 70: athrow
      // 71: ifeq 7c
      // 74: goto 78
      // 77: athrow
      // 78: bipush 1
      // 79: goto 7d
      // 7c: bipush 0
      // 7d: ireturn
   }

   public static boolean ababb() {
      return babaa;
   }

   public static float abbaa(class_310 var0) {
      return baababa(var0.method_61966(), true);
   }

   public static void abbab(Object param0) {
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
      // 05: ifnull 3b
      // 08: getstatic qeaa361f143ee4a0894bd168fd9b30c66/qf4ccf8f5435d4a78bdca4d6a018b578e/aabbabbbb.baab Lqeaa361f143ee4a0894bd168fd9b30c66/qf4ccf8f5435d4a78bdca4d6a018b578e/bbaaba;
      // 0b: iload 1
      // 0c: ifne 2f
      // 0f: goto 13
      // 12: athrow
      // 13: ifnull 3b
      // 16: goto 1a
      // 19: athrow
      // 1a: getstatic qeaa361f143ee4a0894bd168fd9b30c66/qf4ccf8f5435d4a78bdca4d6a018b578e/aabbabbbb.baab Lqeaa361f143ee4a0894bd168fd9b30c66/qf4ccf8f5435d4a78bdca4d6a018b578e/bbaaba;
      // 1d: invokevirtual qeaa361f143ee4a0894bd168fd9b30c66/qf4ccf8f5435d4a78bdca4d6a018b578e/bbaaba.aa ()Lqeaa361f143ee4a0894bd168fd9b30c66/qf4ccf8f5435d4a78bdca4d6a018b578e/abaabbba;
      // 20: iload 1
      // 21: ifne 38
      // 24: goto 28
      // 27: athrow
      // 28: invokevirtual qeaa361f143ee4a0894bd168fd9b30c66/qf4ccf8f5435d4a78bdca4d6a018b578e/abaabbba.a ()Ljava/lang/Object;
      // 2b: goto 2f
      // 2e: athrow
      // 2f: aload 0
      // 30: if_acmpne 3b
      // 33: aload 0
      // 34: goto 38
      // 37: athrow
      // 38: putstatic qeaa361f143ee4a0894bd168fd9b30c66/qf4ccf8f5435d4a78bdca4d6a018b578e/aabbabbbb.ababa Ljava/lang/Object;
      // 3b: return
   }

   public static bbbbaaaa abbba(
      class_310 param0, Object param1, int param2, bbbabbab param3, int param4, boolean param5
   ) {
      // $VF: Couldn't be decompiled
      // Please report this to the Vineflower issue tracker, at https://github.com/Vineflower/vineflower/issues with a copy of the class file (if you have the rights to distribute it!)
      // java.lang.RuntimeException: parsing failure!
      //   at org.jetbrains.java.decompiler.modules.decompiler.decompose.DomHelper.parseGraph(DomHelper.java:211)
      //   at org.jetbrains.java.decompiler.main.rels.MethodProcessor.codeToJava(MethodProcessor.java:166)
      //
      // Bytecode:
      // 000: getstatic qeaa361f143ee4a0894bd168fd9b30c66/qf4ccf8f5435d4a78bdca4d6a018b578e/baaabbaa.bba I
      // 003: istore 6
      // 005: aload 0
      // 006: iload 6
      // 008: ifne 013
      // 00b: ifnull 07c
      // 00e: goto 012
      // 011: athrow
      // 012: aload 0
      // 013: iload 6
      // 015: ifne 027
      // 018: getfield net/minecraft/class_310.field_1724 Lnet/minecraft/class_746;
      // 01b: ifnull 07c
      // 01e: goto 022
      // 021: athrow
      // 022: aload 1
      // 023: goto 027
      // 026: athrow
      // 027: ifnull 07c
      // 02a: iload 2
      // 02b: iload 6
      // 02d: ifne 07d
      // 030: goto 034
      // 033: athrow
      // 034: iflt 07c
      // 037: goto 03b
      // 03a: athrow
      // 03b: iload 2
      // 03c: iload 6
      // 03e: ifne 07d
      // 041: goto 045
      // 044: athrow
      // 045: ldc_w 604047308
      // 048: ldc_w -263648790
      // 04b: ldc_w 1904253559
      // 04e: ixor
      // 04f: invokestatic qeaa361f143ee4a0894bd168fd9b30c66/qf4ccf8f5435d4a78bdca4d6a018b578e/aabbabbbb.b (II)I
      // 052: ldc2_w 7503931893258398086
      // 055: invokestatic qeaa361f143ee4a0894bd168fd9b30c66/qf4ccf8f5435d4a78bdca4d6a018b578e/aabbabbbb.aaaaa (IJ)I
      // 058: if_icmpgt 07c
      // 05b: goto 05f
      // 05e: athrow
      // 05f: getstatic qeaa361f143ee4a0894bd168fd9b30c66/qf4ccf8f5435d4a78bdca4d6a018b578e/aabbabbbb.baab Lqeaa361f143ee4a0894bd168fd9b30c66/qf4ccf8f5435d4a78bdca4d6a018b578e/bbaaba;
      // 062: ifnonnull 07c
      // 065: goto 069
      // 068: athrow
      // 069: getstatic qeaa361f143ee4a0894bd168fd9b30c66/qf4ccf8f5435d4a78bdca4d6a018b578e/aabbabbbb.aaaba Z
      // 06c: iload 6
      // 06e: ifne 088
      // 071: goto 075
      // 074: athrow
      // 075: ifeq 081
      // 078: goto 07c
      // 07b: athrow
      // 07c: iload 2
      // 07d: invokestatic qeaa361f143ee4a0894bd168fd9b30c66/qf4ccf8f5435d4a78bdca4d6a018b578e/bbbbaaaa.aba (I)Lqeaa361f143ee4a0894bd168fd9b30c66/qf4ccf8f5435d4a78bdca4d6a018b578e/bbbbaaaa;
      // 080: areturn
      // 081: aload 0
      // 082: getfield net/minecraft/class_310.field_1724 Lnet/minecraft/class_746;
      // 085: getfield net/minecraft/class_746.field_6012 I
      // 088: istore 7
      // 08a: getstatic qeaa361f143ee4a0894bd168fd9b30c66/qf4ccf8f5435d4a78bdca4d6a018b578e/aabbabbbb.aba Lqeaa361f143ee4a0894bd168fd9b30c66/qf4ccf8f5435d4a78bdca4d6a018b578e/abaaabaa;
      // 08d: new qeaa361f143ee4a0894bd168fd9b30c66/qf4ccf8f5435d4a78bdca4d6a018b578e/aaaababaa
      // 090: dup
      // 091: aload 0
      // 092: invokespecial qeaa361f143ee4a0894bd168fd9b30c66/qf4ccf8f5435d4a78bdca4d6a018b578e/aaaababaa.<init> (Lnet/minecraft/class_310;)V
      // 095: invokevirtual qeaa361f143ee4a0894bd168fd9b30c66/qf4ccf8f5435d4a78bdca4d6a018b578e/abaaabaa.baba (Lqeaa361f143ee4a0894bd168fd9b30c66/qf4ccf8f5435d4a78bdca4d6a018b578e/abbbaaa;)I
      // 098: istore 8
      // 09a: iload 8
      // 09c: iload 6
      // 09e: ifne 0ae
      // 0a1: iload 2
      // 0a2: if_icmpeq 0b1
      // 0a5: goto 0a9
      // 0a8: athrow
      // 0a9: bipush 1
      // 0aa: goto 0ae
      // 0ad: athrow
      // 0ae: goto 0b2
      // 0b1: bipush 0
      // 0b2: istore 9
      // 0b4: getstatic qeaa361f143ee4a0894bd168fd9b30c66/qf4ccf8f5435d4a78bdca4d6a018b578e/aabbabbbb.aba Lqeaa361f143ee4a0894bd168fd9b30c66/qf4ccf8f5435d4a78bdca4d6a018b578e/abaaabaa;
      // 0b7: new qeaa361f143ee4a0894bd168fd9b30c66/qf4ccf8f5435d4a78bdca4d6a018b578e/aaaababaa
      // 0ba: dup
      // 0bb: aload 0
      // 0bc: invokespecial qeaa361f143ee4a0894bd168fd9b30c66/qf4ccf8f5435d4a78bdca4d6a018b578e/aaaababaa.<init> (Lnet/minecraft/class_310;)V
      // 0bf: aload 1
      // 0c0: iload 2
      // 0c1: aload 3
      // 0c2: bipush -1
      // 0c3: bipush 1
      // 0c4: aconst_null
      // 0c5: invokevirtual qeaa361f143ee4a0894bd168fd9b30c66/qf4ccf8f5435d4a78bdca4d6a018b578e/abaaabaa.bbba (Lqeaa361f143ee4a0894bd168fd9b30c66/qf4ccf8f5435d4a78bdca4d6a018b578e/abbbaaa;Ljava/lang/Object;ILqeaa361f143ee4a0894bd168fd9b30c66/qf4ccf8f5435d4a78bdca4d6a018b578e/bbbabbab;IZLjava/lang/Runnable;)Lqeaa361f143ee4a0894bd168fd9b30c66/qf4ccf8f5435d4a78bdca4d6a018b578e/abaabbba;
      // 0c8: astore 10
      // 0ca: aload 10
      // 0cc: invokevirtual qeaa361f143ee4a0894bd168fd9b30c66/qf4ccf8f5435d4a78bdca4d6a018b578e/abaabbba.ab ()J
      // 0cf: lconst_0
      // 0d0: lcmp
      // 0d1: iload 6
      // 0d3: ifne 0e5
      // 0d6: ifne 0e3
      // 0d9: goto 0dd
      // 0dc: athrow
      // 0dd: iload 2
      // 0de: invokestatic qeaa361f143ee4a0894bd168fd9b30c66/qf4ccf8f5435d4a78bdca4d6a018b578e/bbbbaaaa.aba (I)Lqeaa361f143ee4a0894bd168fd9b30c66/qf4ccf8f5435d4a78bdca4d6a018b578e/bbbbaaaa;
      // 0e1: areturn
      // 0e2: athrow
      // 0e3: iload 5
      // 0e5: iload 6
      // 0e7: ifne 10d
      // 0ea: ifeq 10b
      // 0ed: goto 0f1
      // 0f0: athrow
      // 0f1: iload 4
      // 0f3: iload 6
      // 0f5: ifne 10d
      // 0f8: goto 0fc
      // 0fb: athrow
      // 0fc: ifgt 10b
      // 0ff: goto 103
      // 102: athrow
      // 103: aload 0
      // 104: invokestatic qeaa361f143ee4a0894bd168fd9b30c66/qf4ccf8f5435d4a78bdca4d6a018b578e/aabbabbbb.aabaa (Lnet/minecraft/class_310;)V
      // 107: goto 10b
      // 10a: athrow
      // 10b: iload 9
      // 10d: iload 6
      // 10f: ifne 126
      // 112: ifeq 129
      // 115: goto 119
      // 118: athrow
      // 119: iload 7
      // 11b: bipush 0
      // 11c: iload 4
      // 11e: invokestatic java/lang/Math.max (II)I
      // 121: iadd
      // 122: goto 126
      // 125: athrow
      // 126: goto 12b
      // 129: iload 7
      // 12b: istore 11
      // 12d: new qeaa361f143ee4a0894bd168fd9b30c66/qf4ccf8f5435d4a78bdca4d6a018b578e/bbbbaaaa
      // 130: dup
      // 131: iload 8
      // 133: iload 2
      // 134: iload 7
      // 136: iload 11
      // 138: iload 9
      // 13a: bipush 1
      // 13b: aload 10
      // 13d: invokespecial qeaa361f143ee4a0894bd168fd9b30c66/qf4ccf8f5435d4a78bdca4d6a018b578e/bbbbaaaa.<init> (IIIIZZLqeaa361f143ee4a0894bd168fd9b30c66/qf4ccf8f5435d4a78bdca4d6a018b578e/abaabbba;)V
      // 140: areturn
   }

   public static boolean abbbb(class_310 param0, class_3966 param1) {
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
      // 09: ifnull 3a
      // 0c: goto 10
      // 0f: athrow
      // 10: aload 0
      // 11: iload 2
      // 12: ifne 24
      // 15: getfield net/minecraft/class_310.field_1724 Lnet/minecraft/class_746;
      // 18: ifnull 3a
      // 1b: goto 1f
      // 1e: athrow
      // 1f: aload 0
      // 20: goto 24
      // 23: athrow
      // 24: getfield net/minecraft/class_310.field_1761 Lnet/minecraft/class_636;
      // 27: ifnull 3a
      // 2a: aload 1
      // 2b: iload 2
      // 2c: ifne 3e
      // 2f: goto 33
      // 32: athrow
      // 33: ifnonnull 3d
      // 36: goto 3a
      // 39: athrow
      // 3a: bipush 0
      // 3b: ireturn
      // 3c: athrow
      // 3d: aload 1
      // 3e: invokevirtual net/minecraft/class_3966.method_17782 ()Lnet/minecraft/class_1297;
      // 41: astore 3
      // 42: aload 3
      // 43: ifnonnull 49
      // 46: bipush 0
      // 47: ireturn
      // 48: athrow
      // 49: aload 0
      // 4a: iload 2
      // 4b: ifne 68
      // 4e: invokestatic qeaa361f143ee4a0894bd168fd9b30c66/qf4ccf8f5435d4a78bdca4d6a018b578e/aabbabbbb.bbaa (Lnet/minecraft/class_310;)Z
      // 51: ifeq 5b
      // 54: goto 58
      // 57: athrow
      // 58: bipush 0
      // 59: ireturn
      // 5a: athrow
      // 5b: aload 0
      // 5c: invokestatic qeaa361f143ee4a0894bd168fd9b30c66/qf4ccf8f5435d4a78bdca4d6a018b578e/aabbabbbb.aabbaba (Lnet/minecraft/class_310;)V
      // 5f: iload 2
      // 60: ifne 7e
      // 63: aload 0
      // 64: goto 68
      // 67: athrow
      // 68: aload 3
      // 69: invokestatic qeaa361f143ee4a0894bd168fd9b30c66/qf4ccf8f5435d4a78bdca4d6a018b578e/aabbabbbb.bbaabb (Lnet/minecraft/class_310;Lnet/minecraft/class_1297;)Z
      // 6c: ifeq 72
      // 6f: bipush 0
      // 70: ireturn
      // 71: athrow
      // 72: getstatic qeaa361f143ee4a0894bd168fd9b30c66/qf4ccf8f5435d4a78bdca4d6a018b578e/aabbabbbb.bbbb I
      // 75: bipush 1
      // 76: iadd
      // 77: putstatic qeaa361f143ee4a0894bd168fd9b30c66/qf4ccf8f5435d4a78bdca4d6a018b578e/aabbabbbb.bbbb I
      // 7a: aload 0
      // 7b: invokestatic qeaa361f143ee4a0894bd168fd9b30c66/qf4ccf8f5435d4a78bdca4d6a018b578e/aabbabbbb.bbaba (Lnet/minecraft/class_310;)V
      // 7e: aload 0
      // 7f: getfield net/minecraft/class_310.field_1724 Lnet/minecraft/class_746;
      // 82: astore 4
      // 84: aload 4
      // 86: getstatic net/minecraft/class_1268.field_5808 Lnet/minecraft/class_1268;
      // 89: invokevirtual net/minecraft/class_746.method_6104 (Lnet/minecraft/class_1268;)V
      // 8c: aload 0
      // 8d: getfield net/minecraft/class_310.field_1761 Lnet/minecraft/class_636;
      // 90: aload 4
      // 92: aload 3
      // 93: invokevirtual net/minecraft/class_636.method_2918 (Lnet/minecraft/class_1657;Lnet/minecraft/class_1297;)V
      // 96: bipush 1
      // 97: istore 5
      // 99: bipush 0
      // 9a: getstatic qeaa361f143ee4a0894bd168fd9b30c66/qf4ccf8f5435d4a78bdca4d6a018b578e/aabbabbbb.bbbb I
      // 9d: bipush 1
      // 9e: isub
      // 9f: invokestatic java/lang/Math.max (II)I
      // a2: putstatic qeaa361f143ee4a0894bd168fd9b30c66/qf4ccf8f5435d4a78bdca4d6a018b578e/aabbabbbb.bbbb I
      // a5: iload 5
      // a7: ireturn
      // a8: astore 6
      // aa: bipush 0
      // ab: getstatic qeaa361f143ee4a0894bd168fd9b30c66/qf4ccf8f5435d4a78bdca4d6a018b578e/aabbabbbb.bbbb I
      // ae: bipush 1
      // af: isub
      // b0: invokestatic java/lang/Math.max (II)I
      // b3: putstatic qeaa361f143ee4a0894bd168fd9b30c66/qf4ccf8f5435d4a78bdca4d6a018b578e/aabbabbbb.bbbb I
      // b6: aload 6
      // b8: athrow
   }

   public static void baaaa() {
      abbaab();
   }

   public static class_243 baaab(class_2777 var0) {
      return aaaabab(var0);
   }

   private static boolean baaba(class_1297 param0) {
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
      // 06: ifne 18
      // 09: invokevirtual net/minecraft/class_1297.method_7325 ()Z
      // 0c: ifne 3d
      // 0f: goto 13
      // 12: athrow
      // 13: aload 0
      // 14: goto 18
      // 17: athrow
      // 18: iload 1
      // 19: ifne 2b
      // 1c: instanceof net/minecraft/class_1309
      // 1f: ifeq 3d
      // 22: goto 26
      // 25: athrow
      // 26: aload 0
      // 27: goto 2b
      // 2a: athrow
      // 2b: invokestatic qeaa361f143ee4a0894bd168fd9b30c66/qf4ccf8f5435d4a78bdca4d6a018b578e/abaabbbba.b (Lnet/minecraft/class_1297;)Z
      // 2e: iload 1
      // 2f: ifne 3a
      // 32: ifne 3d
      // 35: goto 39
      // 38: athrow
      // 39: bipush 1
      // 3a: goto 3e
      // 3d: bipush 0
      // 3e: ireturn
   }

   private static long baabb(int var0, long var1) {
      int var3 = (var0 ^ (int)var1 ^ b(604047311, 1813093188 ^ 1059874996)) & b(604047310, 1813093188 ^ -1723232381);
      if (baabb[var3] == null) {
         baabb[var3] = abb[var3] ^ var1;
      }

      return baabb[var3];
   }

   // $VF: Handled exception range with multiple entry points by splitting it
   // $VF: Duplicated exception handlers to handle obfuscated exceptions
   private static BufferedImage babaa(class_1011 var0) {
      BufferedImage var2 = new BufferedImage(var0.method_4307(), var0.method_4323(), 2);
      int var10000 = baaabbaa.bba;
      int[] var3 = aaaaabb(var0);
      int var1 = var10000;

      label31: {
         label30: {
            label29: {
               try {
                  var7 = var3;
                  if (var1 != 0) {
                     break label29;
                  }

                  if (var3 == null) {
                     break label30;
                  }
               } catch (MatchException var6) {
                  throw var6;
               }

               var7 = var3;
            }

            try {
               if (var7.length >= var0.method_4307() * var0.method_4323()) {
                  break label31;
               }
            } catch (MatchException var5) {
               throw var5;
            }
         }

         try {
            return var2;
         } catch (MatchException var4) {
            throw var4;
         }
      }

      var2.setRGB(0, 0, var0.method_4307(), var0.method_4323(), var3, 0, var0.method_4307());
      return var2;
   }

   public static class_1269 babab(class_310 param0, class_1268 param1, class_3965 param2) {
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
      // 06: ifne 11
      // 09: ifnull 3a
      // 0c: goto 10
      // 0f: athrow
      // 10: aload 0
      // 11: iload 3
      // 12: ifne 24
      // 15: getfield net/minecraft/class_310.field_1724 Lnet/minecraft/class_746;
      // 18: ifnull 3a
      // 1b: goto 1f
      // 1e: athrow
      // 1f: aload 0
      // 20: goto 24
      // 23: athrow
      // 24: getfield net/minecraft/class_310.field_1761 Lnet/minecraft/class_636;
      // 27: ifnull 3a
      // 2a: aload 1
      // 2b: ifnull 3a
      // 2e: goto 32
      // 31: athrow
      // 32: aload 2
      // 33: ifnonnull 3f
      // 36: goto 3a
      // 39: athrow
      // 3a: getstatic net/minecraft/class_1269.field_5814 Lnet/minecraft/class_1269$class_9857;
      // 3d: areturn
      // 3e: athrow
      // 3f: aload 0
      // 40: iload 3
      // 41: ifne 5a
      // 44: aload 1
      // 45: aload 2
      // 46: invokestatic qeaa361f143ee4a0894bd168fd9b30c66/qf4ccf8f5435d4a78bdca4d6a018b578e/aabbabbbb.babbb (Lnet/minecraft/class_310;Lnet/minecraft/class_1268;Lnet/minecraft/class_3965;)Z
      // 49: ifeq 55
      // 4c: goto 50
      // 4f: athrow
      // 50: getstatic net/minecraft/class_1269.field_5814 Lnet/minecraft/class_1269$class_9857;
      // 53: areturn
      // 54: athrow
      // 55: aload 0
      // 56: invokestatic qeaa361f143ee4a0894bd168fd9b30c66/qf4ccf8f5435d4a78bdca4d6a018b578e/aabbabbbb.bbaabbb (Lnet/minecraft/class_310;)V
      // 59: aload 0
      // 5a: getfield net/minecraft/class_310.field_1761 Lnet/minecraft/class_636;
      // 5d: aload 0
      // 5e: getfield net/minecraft/class_310.field_1724 Lnet/minecraft/class_746;
      // 61: aload 1
      // 62: aload 2
      // 63: invokevirtual net/minecraft/class_636.method_2896 (Lnet/minecraft/class_746;Lnet/minecraft/class_1268;Lnet/minecraft/class_3965;)Lnet/minecraft/class_1269;
      // 66: areturn
   }

   public static boolean babba() {
      // $VF: Couldn't be decompiled
      // Please report this to the Vineflower issue tracker, at https://github.com/Vineflower/vineflower/issues with a copy of the class file (if you have the rights to distribute it!)
      // java.lang.RuntimeException: parsing failure!
      //   at org.jetbrains.java.decompiler.modules.decompiler.decompose.DomHelper.parseGraph(DomHelper.java:211)
      //   at org.jetbrains.java.decompiler.main.rels.MethodProcessor.codeToJava(MethodProcessor.java:166)
      //
      // Bytecode:
      // 00: getstatic qeaa361f143ee4a0894bd168fd9b30c66/qf4ccf8f5435d4a78bdca4d6a018b578e/baaabbaa.bba I
      // 03: istore 0
      // 04: getstatic qeaa361f143ee4a0894bd168fd9b30c66/qf4ccf8f5435d4a78bdca4d6a018b578e/aabbabbbb.aabbb I
      // 07: iload 0
      // 08: ifne 2e
      // 0b: ifgt 24
      // 0e: goto 12
      // 11: athrow
      // 12: getstatic qeaa361f143ee4a0894bd168fd9b30c66/qf4ccf8f5435d4a78bdca4d6a018b578e/aabbabbbb.aaaaaa Z
      // 15: iload 0
      // 16: ifne 2e
      // 19: goto 1d
      // 1c: athrow
      // 1d: ifeq 3d
      // 20: goto 24
      // 23: athrow
      // 24: getstatic qeaa361f143ee4a0894bd168fd9b30c66/qf4ccf8f5435d4a78bdca4d6a018b578e/aabbabbbb.aba Lqeaa361f143ee4a0894bd168fd9b30c66/qf4ccf8f5435d4a78bdca4d6a018b578e/abaaabaa;
      // 27: invokevirtual qeaa361f143ee4a0894bd168fd9b30c66/qf4ccf8f5435d4a78bdca4d6a018b578e/abaaabaa.ab ()Z
      // 2a: goto 2e
      // 2d: athrow
      // 2e: iload 0
      // 2f: ifne 3a
      // 32: ifeq 3d
      // 35: goto 39
      // 38: athrow
      // 39: bipush 1
      // 3a: goto 3e
      // 3d: bipush 0
      // 3e: ireturn
   }

   public static boolean babbb(class_310 param0, class_1268 param1, class_3965 param2) {
      // $VF: Couldn't be decompiled
      // Please report this to the Vineflower issue tracker, at https://github.com/Vineflower/vineflower/issues with a copy of the class file (if you have the rights to distribute it!)
      // java.lang.RuntimeException: parsing failure!
      //   at org.jetbrains.java.decompiler.modules.decompiler.decompose.DomHelper.parseGraph(DomHelper.java:211)
      //   at org.jetbrains.java.decompiler.main.rels.MethodProcessor.codeToJava(MethodProcessor.java:166)
      //
      // Bytecode:
      // 000: getstatic qeaa361f143ee4a0894bd168fd9b30c66/qf4ccf8f5435d4a78bdca4d6a018b578e/baaabbaa.bba I
      // 003: istore 3
      // 004: aload 0
      // 005: iload 3
      // 006: ifne 011
      // 009: ifnull 04c
      // 00c: goto 010
      // 00f: athrow
      // 010: aload 0
      // 011: iload 3
      // 012: ifne 024
      // 015: getfield net/minecraft/class_310.field_1724 Lnet/minecraft/class_746;
      // 018: ifnull 04c
      // 01b: goto 01f
      // 01e: athrow
      // 01f: aload 0
      // 020: goto 024
      // 023: athrow
      // 024: getfield net/minecraft/class_310.field_1687 Lnet/minecraft/class_638;
      // 027: ifnull 04c
      // 02a: aload 1
      // 02b: ifnull 04c
      // 02e: goto 032
      // 031: athrow
      // 032: aload 2
      // 033: iload 3
      // 034: ifne 043
      // 037: goto 03b
      // 03a: athrow
      // 03b: ifnull 04c
      // 03e: goto 042
      // 041: athrow
      // 042: aload 2
      // 043: invokevirtual net/minecraft/class_3965.method_17783 ()Lnet/minecraft/class_239$class_240;
      // 046: getstatic net/minecraft/class_239$class_240.field_1332 Lnet/minecraft/class_239$class_240;
      // 049: if_acmpeq 04f
      // 04c: bipush 0
      // 04d: ireturn
      // 04e: athrow
      // 04f: aload 1
      // 050: getstatic net/minecraft/class_1268.field_5810 Lnet/minecraft/class_1268;
      // 053: if_acmpne 061
      // 056: aload 0
      // 057: getfield net/minecraft/class_310.field_1724 Lnet/minecraft/class_746;
      // 05a: invokevirtual net/minecraft/class_746.method_6079 ()Lnet/minecraft/class_1799;
      // 05d: goto 064
      // 060: athrow
      // 061: getstatic net/minecraft/class_1799.field_8037 Lnet/minecraft/class_1799;
      // 064: astore 4
      // 066: aload 1
      // 067: getstatic net/minecraft/class_1268.field_5808 Lnet/minecraft/class_1268;
      // 06a: if_acmpne 0ad
      // 06d: aload 0
      // 06e: invokestatic qeaa361f143ee4a0894bd168fd9b30c66/qf4ccf8f5435d4a78bdca4d6a018b578e/aabbabbbb.baabaab (Lnet/minecraft/class_310;)I
      // 071: istore 5
      // 073: iload 5
      // 075: iload 3
      // 076: ifne 082
      // 079: iflt 0a8
      // 07c: goto 080
      // 07f: athrow
      // 080: iload 5
      // 082: ldc_w 604047297
      // 085: ldc_w 849822958
      // 088: ldc_w 201263407
      // 08b: ixor
      // 08c: invokestatic qeaa361f143ee4a0894bd168fd9b30c66/qf4ccf8f5435d4a78bdca4d6a018b578e/aabbabbbb.b (II)I
      // 08f: ldc2_w 1131576471880749436
      // 092: invokestatic qeaa361f143ee4a0894bd168fd9b30c66/qf4ccf8f5435d4a78bdca4d6a018b578e/aabbabbbb.aaaaa (IJ)I
      // 095: if_icmpge 0a8
      // 098: aload 0
      // 099: getfield net/minecraft/class_310.field_1724 Lnet/minecraft/class_746;
      // 09c: invokevirtual net/minecraft/class_746.method_31548 ()Lnet/minecraft/class_1661;
      // 09f: iload 5
      // 0a1: invokevirtual net/minecraft/class_1661.method_5438 (I)Lnet/minecraft/class_1799;
      // 0a4: goto 0ab
      // 0a7: athrow
      // 0a8: getstatic net/minecraft/class_1799.field_8037 Lnet/minecraft/class_1799;
      // 0ab: astore 4
      // 0ad: aload 4
      // 0af: iload 3
      // 0b0: ifne 0bc
      // 0b3: ifnull 0ec
      // 0b6: goto 0ba
      // 0b9: athrow
      // 0ba: aload 4
      // 0bc: invokevirtual net/minecraft/class_1799.method_7960 ()Z
      // 0bf: iload 3
      // 0c0: ifne 0f1
      // 0c3: ifne 0ec
      // 0c6: goto 0ca
      // 0c9: athrow
      // 0ca: aload 4
      // 0cc: invokevirtual net/minecraft/class_1799.method_7909 ()Lnet/minecraft/class_1792;
      // 0cf: astore 6
      // 0d1: aload 6
      // 0d3: instanceof net/minecraft/class_1747
      // 0d6: iload 3
      // 0d7: ifne 0f1
      // 0da: ifeq 0ec
      // 0dd: goto 0e1
      // 0e0: athrow
      // 0e1: aload 6
      // 0e3: checkcast net/minecraft/class_1747
      // 0e6: astore 5
      // 0e8: iload 3
      // 0e9: ifeq 0f2
      // 0ec: bipush 0
      // 0ed: goto 0f1
      // 0f0: athrow
      // 0f1: ireturn
      // 0f2: aload 2
      // 0f3: invokevirtual net/minecraft/class_3965.method_17777 ()Lnet/minecraft/class_2338;
      // 0f6: astore 6
      // 0f8: aload 0
      // 0f9: getfield net/minecraft/class_310.field_1687 Lnet/minecraft/class_638;
      // 0fc: aload 6
      // 0fe: invokevirtual net/minecraft/class_638.method_8320 (Lnet/minecraft/class_2338;)Lnet/minecraft/class_2680;
      // 101: astore 7
      // 103: aload 0
      // 104: aload 7
      // 106: aload 6
      // 108: aload 4
      // 10a: invokestatic qeaa361f143ee4a0894bd168fd9b30c66/qf4ccf8f5435d4a78bdca4d6a018b578e/aabbabbbb.bbbbab (Lnet/minecraft/class_310;Lnet/minecraft/class_2680;Lnet/minecraft/class_2338;Lnet/minecraft/class_1799;)Z
      // 10d: iload 3
      // 10e: ifne 120
      // 111: ifeq 11b
      // 114: goto 118
      // 117: athrow
      // 118: bipush 0
      // 119: ireturn
      // 11a: athrow
      // 11b: aload 7
      // 11d: invokevirtual net/minecraft/class_2680.method_45474 ()Z
      // 120: ifeq 129
      // 123: aload 6
      // 125: goto 132
      // 128: athrow
      // 129: aload 6
      // 12b: aload 2
      // 12c: invokevirtual net/minecraft/class_3965.method_17780 ()Lnet/minecraft/class_2350;
      // 12f: invokevirtual net/minecraft/class_2338.method_10093 (Lnet/minecraft/class_2350;)Lnet/minecraft/class_2338;
      // 132: astore 8
      // 134: aload 5
      // 136: invokevirtual net/minecraft/class_1747.method_7711 ()Lnet/minecraft/class_2248;
      // 139: invokevirtual net/minecraft/class_2248.method_9564 ()Lnet/minecraft/class_2680;
      // 13c: astore 9
      // 13e: aload 0
      // 13f: getfield net/minecraft/class_310.field_1687 Lnet/minecraft/class_638;
      // 142: aload 9
      // 144: aload 8
      // 146: invokestatic net/minecraft/class_3726.method_16194 ()Lnet/minecraft/class_3726;
      // 149: invokevirtual net/minecraft/class_638.method_8628 (Lnet/minecraft/class_2680;Lnet/minecraft/class_2338;Lnet/minecraft/class_3726;)Z
      // 14c: iload 3
      // 14d: ifne 158
      // 150: ifne 15b
      // 153: goto 157
      // 156: athrow
      // 157: bipush 1
      // 158: goto 15c
      // 15b: bipush 0
      // 15c: ireturn
   }

   public static void bbaaa(boolean var0) {
      abaab = var0;
   }

   static boolean bbaab(class_2248 param0) {
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
      // 05: instanceof net/minecraft/class_2482
      // 08: iload 1
      // 09: ifne 4d
      // 0c: ifne 4c
      // 0f: goto 13
      // 12: athrow
      // 13: aload 0
      // 14: instanceof net/minecraft/class_2510
      // 17: iload 1
      // 18: ifne 4d
      // 1b: goto 1f
      // 1e: athrow
      // 1f: ifne 4c
      // 22: goto 26
      // 25: athrow
      // 26: aload 0
      // 27: instanceof net/minecraft/class_2354
      // 2a: iload 1
      // 2b: ifne 4d
      // 2e: goto 32
      // 31: athrow
      // 32: ifne 4c
      // 35: goto 39
      // 38: athrow
      // 39: aload 0
      // 3a: instanceof net/minecraft/class_2544
      // 3d: iload 1
      // 3e: ifne 4d
      // 41: goto 45
      // 44: athrow
      // 45: ifeq 50
      // 48: goto 4c
      // 4b: athrow
      // 4c: bipush 1
      // 4d: goto 51
      // 50: bipush 0
      // 51: ireturn
   }

   public static void bbaba(class_310 param0) {
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
      // 06: ifne 11
      // 09: ifnull 1f
      // 0c: goto 10
      // 0f: athrow
      // 10: aload 0
      // 11: iload 1
      // 12: ifne 2a
      // 15: getfield net/minecraft/class_310.field_1761 Lnet/minecraft/class_636;
      // 18: ifnonnull 21
      // 1b: goto 1f
      // 1e: athrow
      // 1f: return
      // 20: athrow
      // 21: aload 0
      // 22: getfield net/minecraft/class_310.field_1761 Lnet/minecraft/class_636;
      // 25: bipush 0
      // 26: invokestatic qeaa361f143ee4a0894bd168fd9b30c66/qf4ccf8f5435d4a78bdca4d6a018b578e/bbbabaa.abaa (Lnet/minecraft/class_636;I)V
      // 29: aload 0
      // 2a: bipush 0
      // 2b: invokestatic qeaa361f143ee4a0894bd168fd9b30c66/qf4ccf8f5435d4a78bdca4d6a018b578e/bbbabaa.a (Lnet/minecraft/class_310;I)V
      // 2e: return
   }

   public static boolean bbabb(class_310 param0, bbbbaaaa param1) {
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
      // 06: ifne 19
      // 09: aload 1
      // 0a: invokestatic qeaa361f143ee4a0894bd168fd9b30c66/qf4ccf8f5435d4a78bdca4d6a018b578e/aabbabbbb.abbbba (Lnet/minecraft/class_310;Lqeaa361f143ee4a0894bd168fd9b30c66/qf4ccf8f5435d4a78bdca4d6a018b578e/bbbbaaaa;)Z
      // 0d: ifeq 2b
      // 10: goto 14
      // 13: athrow
      // 14: aload 0
      // 15: goto 19
      // 18: athrow
      // 19: invokestatic qeaa361f143ee4a0894bd168fd9b30c66/qf4ccf8f5435d4a78bdca4d6a018b578e/aabbabbbb.aaabab (Lnet/minecraft/class_310;)Z
      // 1c: iload 2
      // 1d: ifne 28
      // 20: ifeq 2b
      // 23: goto 27
      // 26: athrow
      // 27: bipush 1
      // 28: goto 2c
      // 2b: bipush 0
      // 2c: ireturn
   }

   public static long bbbaa() {
      return a;
   }

   public static void bbbab() {
      bbaaaba();
   }

   public static boolean bbbba(class_1309 param0) {
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
      // 06: ifne 46
      // 09: ifnonnull 13
      // 0c: goto 10
      // 0f: athrow
      // 10: bipush 0
      // 11: ireturn
      // 12: athrow
      // 13: aload 0
      // 14: invokevirtual java/lang/Object.getClass ()Ljava/lang/Class;
      // 17: ldc_w 604047296
      // 1a: ldc_w -1572566883
      // 1d: ldc_w 654475109
      // 20: ixor
      // 21: invokestatic qeaa361f143ee4a0894bd168fd9b30c66/qf4ccf8f5435d4a78bdca4d6a018b578e/aabbabbbb.b (II)I
      // 24: ldc_w 604047299
      // 27: ldc_w -1572566883
      // 2a: ldc_w 749454351
      // 2d: ixor
      // 2e: invokestatic qeaa361f143ee4a0894bd168fd9b30c66/qf4ccf8f5435d4a78bdca4d6a018b578e/aabbabbbb.b (II)I
      // 31: invokestatic qeaa361f143ee4a0894bd168fd9b30c66/qf4ccf8f5435d4a78bdca4d6a018b578e/aabbabbbb.bbaabaa (II)Ljava/lang/String;
      // 34: invokestatic qeaa361f143ee4a0894bd168fd9b30c66/qf4ccf8f5435d4a78bdca4d6a018b578e/aabbaaaba.abba (Ljava/lang/String;)Ljava/lang/String;
      // 37: bipush 0
      // 38: anewarray 810
      // 3b: invokevirtual java/lang/Class.getMethod (Ljava/lang/String;[Ljava/lang/Class;)Ljava/lang/reflect/Method;
      // 3e: aload 0
      // 3f: bipush 0
      // 40: anewarray 4
      // 43: invokevirtual java/lang/reflect/Method.invoke (Ljava/lang/Object;[Ljava/lang/Object;)Ljava/lang/Object;
      // 46: checkcast java/lang/Boolean
      // 49: invokevirtual java/lang/Boolean.booleanValue ()Z
      // 4c: ireturn
      // 4d: astore 2
      // 4e: aload 2
      // 4f: pop
      // 50: aload 0
      // 51: invokevirtual java/lang/Object.getClass ()Ljava/lang/Class;
      // 54: ldc_w 604047298
      // 57: ldc_w -1572566883
      // 5a: ldc_w -1198509888
      // 5d: ixor
      // 5e: invokestatic qeaa361f143ee4a0894bd168fd9b30c66/qf4ccf8f5435d4a78bdca4d6a018b578e/aabbabbbb.b (II)I
      // 61: ldc_w 604047301
      // 64: ldc_w -1572566883
      // 67: ldc_w 1264076290
      // 6a: ixor
      // 6b: invokestatic qeaa361f143ee4a0894bd168fd9b30c66/qf4ccf8f5435d4a78bdca4d6a018b578e/aabbabbbb.b (II)I
      // 6e: invokestatic qeaa361f143ee4a0894bd168fd9b30c66/qf4ccf8f5435d4a78bdca4d6a018b578e/aabbabbbb.bbaabaa (II)Ljava/lang/String;
      // 71: invokestatic qeaa361f143ee4a0894bd168fd9b30c66/qf4ccf8f5435d4a78bdca4d6a018b578e/aabbaaaba.abba (Ljava/lang/String;)Ljava/lang/String;
      // 74: bipush 0
      // 75: anewarray 810
      // 78: invokevirtual java/lang/Class.getMethod (Ljava/lang/String;[Ljava/lang/Class;)Ljava/lang/reflect/Method;
      // 7b: aload 0
      // 7c: bipush 0
      // 7d: anewarray 4
      // 80: invokevirtual java/lang/reflect/Method.invoke (Ljava/lang/Object;[Ljava/lang/Object;)Ljava/lang/Object;
      // 83: checkcast java/lang/Boolean
      // 86: invokevirtual java/lang/Boolean.booleanValue ()Z
      // 89: ireturn
      // 8a: astore 2
      // 8b: aload 2
      // 8c: pop
      // 8d: bipush 0
      // 8e: ireturn
   }

   private static boolean bbbbb(class_310 param0, class_304 param1) {
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
      // 06: ifne 14
      // 09: ifnonnull 13
      // 0c: goto 10
      // 0f: athrow
      // 10: bipush 0
      // 11: ireturn
      // 12: athrow
      // 13: aload 1
      // 14: invokestatic qeaa361f143ee4a0894bd168fd9b30c66/qf4ccf8f5435d4a78bdca4d6a018b578e/aabbabbbb.abbaabb (Lnet/minecraft/class_304;)Lnet/minecraft/class_3675$class_306;
      // 17: astore 3
      // 18: invokestatic qeaa361f143ee4a0894bd168fd9b30c66/qf4ccf8f5435d4a78bdca4d6a018b578e/aabbaabb.bab ()Lqeaa361f143ee4a0894bd168fd9b30c66/qf4ccf8f5435d4a78bdca4d6a018b578e/aabbaabb;
      // 1b: aload 3
      // 1c: invokevirtual qeaa361f143ee4a0894bd168fd9b30c66/qf4ccf8f5435d4a78bdca4d6a018b578e/aabbaabb.aa (Lnet/minecraft/class_3675$class_306;)Z
      // 1f: iload 2
      // 20: ifne 2b
      // 23: ifeq 2c
      // 26: goto 2a
      // 29: athrow
      // 2a: bipush 0
      // 2b: ireturn
      // 2c: invokestatic qeaa361f143ee4a0894bd168fd9b30c66/qf4ccf8f5435d4a78bdca4d6a018b578e/abaaaaaba.aaaaa ()Lqeaa361f143ee4a0894bd168fd9b30c66/qf4ccf8f5435d4a78bdca4d6a018b578e/abaaaaaba;
      // 2f: astore 4
      // 31: aload 4
      // 33: iload 2
      // 34: ifne 40
      // 37: ifnull 4e
      // 3a: goto 3e
      // 3d: athrow
      // 3e: aload 4
      // 40: iload 2
      // 41: ifne 55
      // 44: invokevirtual qeaa361f143ee4a0894bd168fd9b30c66/qf4ccf8f5435d4a78bdca4d6a018b578e/abaaaaaba.aaba ()Lqeaa361f143ee4a0894bd168fd9b30c66/qf4ccf8f5435d4a78bdca4d6a018b578e/babbaba;
      // 47: ifnonnull 53
      // 4a: goto 4e
      // 4d: athrow
      // 4e: aconst_null
      // 4f: goto 5b
      // 52: athrow
      // 53: aload 4
      // 55: invokevirtual qeaa361f143ee4a0894bd168fd9b30c66/qf4ccf8f5435d4a78bdca4d6a018b578e/abaaaaaba.aaba ()Lqeaa361f143ee4a0894bd168fd9b30c66/qf4ccf8f5435d4a78bdca4d6a018b578e/babbaba;
      // 58: invokevirtual qeaa361f143ee4a0894bd168fd9b30c66/qf4ccf8f5435d4a78bdca4d6a018b578e/babbaba.bbbbb ()Lqeaa361f143ee4a0894bd168fd9b30c66/qf4ccf8f5435d4a78bdca4d6a018b578e/baaabbb;
      // 5b: astore 5
      // 5d: aload 5
      // 5f: iload 2
      // 60: ifne 6c
      // 63: ifnull 7e
      // 66: goto 6a
      // 69: athrow
      // 6a: aload 5
      // 6c: aload 3
      // 6d: invokevirtual qeaa361f143ee4a0894bd168fd9b30c66/qf4ccf8f5435d4a78bdca4d6a018b578e/baaabbb.abaa (Lnet/minecraft/class_3675$class_306;)Z
      // 70: iload 2
      // 71: ifne 83
      // 74: ifeq 7e
      // 77: goto 7b
      // 7a: athrow
      // 7b: bipush 0
      // 7c: ireturn
      // 7d: athrow
      // 7e: aload 0
      // 7f: aload 1
      // 80: invokestatic qeaa361f143ee4a0894bd168fd9b30c66/qf4ccf8f5435d4a78bdca4d6a018b578e/aabbabbbb.aaab (Lnet/minecraft/class_310;Lnet/minecraft/class_304;)Z
      // 83: iload 2
      // 84: ifne b5
      // 87: ifne b4
      // 8a: goto 8e
      // 8d: athrow
      // 8e: aload 1
      // 8f: invokevirtual net/minecraft/class_304.method_1434 ()Z
      // 92: iload 2
      // 93: ifne b5
      // 96: goto 9a
      // 99: athrow
      // 9a: ifne b4
      // 9d: goto a1
      // a0: athrow
      // a1: aload 1
      // a2: invokestatic qeaa361f143ee4a0894bd168fd9b30c66/qf4ccf8f5435d4a78bdca4d6a018b578e/aabbabbbb.aabbbba (Lnet/minecraft/class_304;)I
      // a5: iload 2
      // a6: ifne b5
      // a9: goto ad
      // ac: athrow
      // ad: ifle b8
      // b0: goto b4
      // b3: athrow
      // b4: bipush 1
      // b5: goto b9
      // b8: bipush 0
      // b9: ireturn
   }

   private static Field aaaaaa(Class var0, String var1) {
      for (Class var2 = var0; var2 != null; var2 = var2.getSuperclass()) {
         try {
            Field var3 = var2.getDeclaredField(var1);
            var3.setAccessible(true);
            return var3;
         } catch (NoSuchFieldException var4) {
         }
      }

      return null;
   }

   private static Float aaaaab(Object param0, String param1, String param2) {
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
      // 06: ifne 27
      // 09: ifnonnull 13
      // 0c: goto 10
      // 0f: athrow
      // 10: aconst_null
      // 11: areturn
      // 12: athrow
      // 13: aload 0
      // 14: invokevirtual java/lang/Object.getClass ()Ljava/lang/Class;
      // 17: aload 1
      // 18: bipush 0
      // 19: anewarray 810
      // 1c: invokevirtual java/lang/Class.getMethod (Ljava/lang/String;[Ljava/lang/Class;)Ljava/lang/reflect/Method;
      // 1f: aload 0
      // 20: bipush 0
      // 21: anewarray 4
      // 24: invokevirtual java/lang/reflect/Method.invoke (Ljava/lang/Object;[Ljava/lang/Object;)Ljava/lang/Object;
      // 27: checkcast java/lang/Number
      // 2a: invokevirtual java/lang/Number.floatValue ()F
      // 2d: invokestatic java/lang/Float.valueOf (F)Ljava/lang/Float;
      // 30: areturn
      // 31: astore 4
      // 33: aload 0
      // 34: invokevirtual java/lang/Object.getClass ()Ljava/lang/Class;
      // 37: aload 2
      // 38: bipush 0
      // 39: anewarray 810
      // 3c: invokevirtual java/lang/Class.getMethod (Ljava/lang/String;[Ljava/lang/Class;)Ljava/lang/reflect/Method;
      // 3f: aload 0
      // 40: bipush 0
      // 41: anewarray 4
      // 44: invokevirtual java/lang/reflect/Method.invoke (Ljava/lang/Object;[Ljava/lang/Object;)Ljava/lang/Object;
      // 47: checkcast java/lang/Number
      // 4a: invokevirtual java/lang/Number.floatValue ()F
      // 4d: invokestatic java/lang/Float.valueOf (F)Ljava/lang/Float;
      // 50: areturn
      // 51: astore 4
      // 53: aload 0
      // 54: invokevirtual java/lang/Object.getClass ()Ljava/lang/Class;
      // 57: aload 2
      // 58: invokevirtual java/lang/Class.getDeclaredField (Ljava/lang/String;)Ljava/lang/reflect/Field;
      // 5b: astore 4
      // 5d: aload 4
      // 5f: bipush 1
      // 60: invokevirtual java/lang/reflect/Field.setAccessible (Z)V
      // 63: aload 4
      // 65: aload 0
      // 66: invokevirtual java/lang/reflect/Field.get (Ljava/lang/Object;)Ljava/lang/Object;
      // 69: checkcast java/lang/Number
      // 6c: invokevirtual java/lang/Number.floatValue ()F
      // 6f: invokestatic java/lang/Float.valueOf (F)Ljava/lang/Float;
      // 72: areturn
      // 73: astore 4
      // 75: aconst_null
      // 76: areturn
   }

   private static boolean aaaaba(class_310 param0) {
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
      // 06: ifne 11
      // 09: ifnull 41
      // 0c: goto 10
      // 0f: athrow
      // 10: aload 0
      // 11: iload 1
      // 12: ifne 28
      // 15: getfield net/minecraft/class_310.field_1724 Lnet/minecraft/class_746;
      // 18: ifnull 41
      // 1b: goto 1f
      // 1e: athrow
      // 1f: aload 0
      // 20: iload 1
      // 21: ifne 33
      // 24: goto 28
      // 27: athrow
      // 28: invokestatic qeaa361f143ee4a0894bd168fd9b30c66/qf4ccf8f5435d4a78bdca4d6a018b578e/aabbabbbb.bbaa (Lnet/minecraft/class_310;)Z
      // 2b: ifne 45
      // 2e: aload 0
      // 2f: goto 33
      // 32: athrow
      // 33: invokestatic qeaa361f143ee4a0894bd168fd9b30c66/qf4ccf8f5435d4a78bdca4d6a018b578e/aabbabbbb.aabbbab (Lnet/minecraft/class_310;)Z
      // 36: iload 1
      // 37: ifne 42
      // 3a: ifne 45
      // 3d: goto 41
      // 40: athrow
      // 41: bipush 1
      // 42: goto 46
      // 45: bipush 0
      // 46: ireturn
   }

   public static void aaaabb(class_310 param0, int param1) {
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
      // 09: ifnull 3e
      // 0c: goto 10
      // 0f: athrow
      // 10: aload 0
      // 11: getfield net/minecraft/class_310.field_1690 Lnet/minecraft/class_315;
      // 14: ifnull 3e
      // 17: iload 1
      // 18: iload 2
      // 19: ifne 28
      // 1c: goto 20
      // 1f: athrow
      // 20: iflt 3e
      // 23: goto 27
      // 26: athrow
      // 27: iload 1
      // 28: ldc_w 604047300
      // 2b: ldc_w -1557671195
      // 2e: ldc_w -36545687
      // 31: ixor
      // 32: invokestatic qeaa361f143ee4a0894bd168fd9b30c66/qf4ccf8f5435d4a78bdca4d6a018b578e/aabbabbbb.b (II)I
      // 35: ldc2_w 6146930655705273313
      // 38: invokestatic qeaa361f143ee4a0894bd168fd9b30c66/qf4ccf8f5435d4a78bdca4d6a018b578e/aabbabbbb.aaaaa (IJ)I
      // 3b: if_icmple 40
      // 3e: return
      // 3f: athrow
      // 40: aload 0
      // 41: getfield net/minecraft/class_310.field_1690 Lnet/minecraft/class_315;
      // 44: getfield net/minecraft/class_315.field_1852 [Lnet/minecraft/class_304;
      // 47: astore 3
      // 48: iload 2
      // 49: ifne 9a
      // 4c: aload 3
      // 4d: ifnull 94
      // 50: goto 54
      // 53: athrow
      // 54: iload 1
      // 55: aload 3
      // 56: arraylength
      // 57: if_icmpge 94
      // 5a: goto 5e
      // 5d: athrow
      // 5e: aload 3
      // 5f: iload 1
      // 60: iload 2
      // 61: ifne 76
      // 64: goto 68
      // 67: athrow
      // 68: aaload
      // 69: ifnull 94
      // 6c: goto 70
      // 6f: athrow
      // 70: aload 3
      // 71: iload 1
      // 72: goto 76
      // 75: athrow
      // 76: aaload
      // 77: invokestatic qeaa361f143ee4a0894bd168fd9b30c66/qf4ccf8f5435d4a78bdca4d6a018b578e/aabbabbbb.abbaabb (Lnet/minecraft/class_304;)Lnet/minecraft/class_3675$class_306;
      // 7a: astore 4
      // 7c: iload 2
      // 7d: ifne 9a
      // 80: aload 4
      // 82: invokestatic qeaa361f143ee4a0894bd168fd9b30c66/qf4ccf8f5435d4a78bdca4d6a018b578e/aabbabbbb.bbaaaaa (Lnet/minecraft/class_3675$class_306;)Z
      // 85: ifne 94
      // 88: goto 8c
      // 8b: athrow
      // 8c: aload 3
      // 8d: iload 1
      // 8e: aaload
      // 8f: invokestatic qeaa361f143ee4a0894bd168fd9b30c66/qf4ccf8f5435d4a78bdca4d6a018b578e/aabbabbbb.aababab (Lnet/minecraft/class_304;)V
      // 92: return
      // 93: athrow
      // 94: aload 0
      // 95: iload 1
      // 96: bipush 1
      // 97: invokestatic qeaa361f143ee4a0894bd168fd9b30c66/qf4ccf8f5435d4a78bdca4d6a018b578e/aabbabbbb.ababaaa (Lnet/minecraft/class_310;IZ)V
      // 9a: return
   }

   public static bbbbaaaa aaabaa(class_310 param0, Object param1, int param2, int param3, boolean param4) {
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
      // 008: ifne 013
      // 00b: ifnull 07c
      // 00e: goto 012
      // 011: athrow
      // 012: aload 0
      // 013: iload 5
      // 015: ifne 027
      // 018: getfield net/minecraft/class_310.field_1724 Lnet/minecraft/class_746;
      // 01b: ifnull 07c
      // 01e: goto 022
      // 021: athrow
      // 022: aload 1
      // 023: goto 027
      // 026: athrow
      // 027: ifnull 07c
      // 02a: iload 2
      // 02b: iload 5
      // 02d: ifne 07d
      // 030: goto 034
      // 033: athrow
      // 034: iflt 07c
      // 037: goto 03b
      // 03a: athrow
      // 03b: iload 2
      // 03c: iload 5
      // 03e: ifne 07d
      // 041: goto 045
      // 044: athrow
      // 045: ldc_w 604047303
      // 048: ldc_w 631546591
      // 04b: ldc_w -508347702
      // 04e: ixor
      // 04f: invokestatic qeaa361f143ee4a0894bd168fd9b30c66/qf4ccf8f5435d4a78bdca4d6a018b578e/aabbabbbb.b (II)I
      // 052: ldc2_w 6146930655705273313
      // 055: invokestatic qeaa361f143ee4a0894bd168fd9b30c66/qf4ccf8f5435d4a78bdca4d6a018b578e/aabbabbbb.aaaaa (IJ)I
      // 058: if_icmpgt 07c
      // 05b: goto 05f
      // 05e: athrow
      // 05f: getstatic qeaa361f143ee4a0894bd168fd9b30c66/qf4ccf8f5435d4a78bdca4d6a018b578e/aabbabbbb.baab Lqeaa361f143ee4a0894bd168fd9b30c66/qf4ccf8f5435d4a78bdca4d6a018b578e/bbaaba;
      // 062: ifnonnull 07c
      // 065: goto 069
      // 068: athrow
      // 069: getstatic qeaa361f143ee4a0894bd168fd9b30c66/qf4ccf8f5435d4a78bdca4d6a018b578e/aabbabbbb.aaaba Z
      // 06c: iload 5
      // 06e: ifne 088
      // 071: goto 075
      // 074: athrow
      // 075: ifeq 081
      // 078: goto 07c
      // 07b: athrow
      // 07c: iload 2
      // 07d: invokestatic qeaa361f143ee4a0894bd168fd9b30c66/qf4ccf8f5435d4a78bdca4d6a018b578e/bbbbaaaa.aba (I)Lqeaa361f143ee4a0894bd168fd9b30c66/qf4ccf8f5435d4a78bdca4d6a018b578e/bbbbaaaa;
      // 080: areturn
      // 081: aload 0
      // 082: getfield net/minecraft/class_310.field_1724 Lnet/minecraft/class_746;
      // 085: getfield net/minecraft/class_746.field_6012 I
      // 088: istore 6
      // 08a: getstatic qeaa361f143ee4a0894bd168fd9b30c66/qf4ccf8f5435d4a78bdca4d6a018b578e/aabbabbbb.aba Lqeaa361f143ee4a0894bd168fd9b30c66/qf4ccf8f5435d4a78bdca4d6a018b578e/abaaabaa;
      // 08d: new qeaa361f143ee4a0894bd168fd9b30c66/qf4ccf8f5435d4a78bdca4d6a018b578e/aaaababaa
      // 090: dup
      // 091: aload 0
      // 092: invokespecial qeaa361f143ee4a0894bd168fd9b30c66/qf4ccf8f5435d4a78bdca4d6a018b578e/aaaababaa.<init> (Lnet/minecraft/class_310;)V
      // 095: invokevirtual qeaa361f143ee4a0894bd168fd9b30c66/qf4ccf8f5435d4a78bdca4d6a018b578e/abaaabaa.baba (Lqeaa361f143ee4a0894bd168fd9b30c66/qf4ccf8f5435d4a78bdca4d6a018b578e/abbbaaa;)I
      // 098: istore 7
      // 09a: iload 7
      // 09c: iload 5
      // 09e: ifne 0ae
      // 0a1: iload 2
      // 0a2: if_icmpeq 0b1
      // 0a5: goto 0a9
      // 0a8: athrow
      // 0a9: bipush 1
      // 0aa: goto 0ae
      // 0ad: athrow
      // 0ae: goto 0b2
      // 0b1: bipush 0
      // 0b2: istore 8
      // 0b4: getstatic qeaa361f143ee4a0894bd168fd9b30c66/qf4ccf8f5435d4a78bdca4d6a018b578e/aabbabbbb.aaaaba Lqeaa361f143ee4a0894bd168fd9b30c66/qf4ccf8f5435d4a78bdca4d6a018b578e/bbbabbab;
      // 0b7: astore 9
      // 0b9: getstatic qeaa361f143ee4a0894bd168fd9b30c66/qf4ccf8f5435d4a78bdca4d6a018b578e/aabbabbbb.aba Lqeaa361f143ee4a0894bd168fd9b30c66/qf4ccf8f5435d4a78bdca4d6a018b578e/abaaabaa;
      // 0bc: new qeaa361f143ee4a0894bd168fd9b30c66/qf4ccf8f5435d4a78bdca4d6a018b578e/aaaababaa
      // 0bf: dup
      // 0c0: aload 0
      // 0c1: invokespecial qeaa361f143ee4a0894bd168fd9b30c66/qf4ccf8f5435d4a78bdca4d6a018b578e/aaaababaa.<init> (Lnet/minecraft/class_310;)V
      // 0c4: aload 1
      // 0c5: iload 2
      // 0c6: aload 9
      // 0c8: bipush -1
      // 0c9: bipush 1
      // 0ca: aconst_null
      // 0cb: invokevirtual qeaa361f143ee4a0894bd168fd9b30c66/qf4ccf8f5435d4a78bdca4d6a018b578e/abaaabaa.bba (Lqeaa361f143ee4a0894bd168fd9b30c66/qf4ccf8f5435d4a78bdca4d6a018b578e/abbbaaa;Ljava/lang/Object;ILqeaa361f143ee4a0894bd168fd9b30c66/qf4ccf8f5435d4a78bdca4d6a018b578e/bbbabbab;IZLjava/lang/Runnable;)Lqeaa361f143ee4a0894bd168fd9b30c66/qf4ccf8f5435d4a78bdca4d6a018b578e/abaabbba;
      // 0ce: astore 10
      // 0d0: aload 10
      // 0d2: invokevirtual qeaa361f143ee4a0894bd168fd9b30c66/qf4ccf8f5435d4a78bdca4d6a018b578e/abaabbba.ab ()J
      // 0d5: lconst_0
      // 0d6: lcmp
      // 0d7: iload 5
      // 0d9: ifne 0eb
      // 0dc: ifne 0e9
      // 0df: goto 0e3
      // 0e2: athrow
      // 0e3: iload 2
      // 0e4: invokestatic qeaa361f143ee4a0894bd168fd9b30c66/qf4ccf8f5435d4a78bdca4d6a018b578e/bbbbaaaa.aba (I)Lqeaa361f143ee4a0894bd168fd9b30c66/qf4ccf8f5435d4a78bdca4d6a018b578e/bbbbaaaa;
      // 0e7: areturn
      // 0e8: athrow
      // 0e9: iload 4
      // 0eb: iload 5
      // 0ed: ifne 11e
      // 0f0: ifeq 11c
      // 0f3: goto 0f7
      // 0f6: athrow
      // 0f7: iload 3
      // 0f8: iload 5
      // 0fa: ifne 11e
      // 0fd: goto 101
      // 100: athrow
      // 101: ifgt 11c
      // 104: goto 108
      // 107: athrow
      // 108: aload 9
      // 10a: getstatic qeaa361f143ee4a0894bd168fd9b30c66/qf4ccf8f5435d4a78bdca4d6a018b578e/bbbabbab.b Lqeaa361f143ee4a0894bd168fd9b30c66/qf4ccf8f5435d4a78bdca4d6a018b578e/bbbabbab;
      // 10d: if_acmpne 11c
      // 110: goto 114
      // 113: athrow
      // 114: aload 0
      // 115: invokestatic qeaa361f143ee4a0894bd168fd9b30c66/qf4ccf8f5435d4a78bdca4d6a018b578e/aabbabbbb.aabaa (Lnet/minecraft/class_310;)V
      // 118: goto 11c
      // 11b: athrow
      // 11c: iload 8
      // 11e: iload 5
      // 120: ifne 136
      // 123: ifeq 139
      // 126: goto 12a
      // 129: athrow
      // 12a: iload 6
      // 12c: bipush 0
      // 12d: iload 3
      // 12e: invokestatic java/lang/Math.max (II)I
      // 131: iadd
      // 132: goto 136
      // 135: athrow
      // 136: goto 13b
      // 139: iload 6
      // 13b: istore 11
      // 13d: new qeaa361f143ee4a0894bd168fd9b30c66/qf4ccf8f5435d4a78bdca4d6a018b578e/bbbbaaaa
      // 140: dup
      // 141: iload 7
      // 143: iload 2
      // 144: iload 6
      // 146: iload 11
      // 148: iload 8
      // 14a: bipush 1
      // 14b: aload 10
      // 14d: invokespecial qeaa361f143ee4a0894bd168fd9b30c66/qf4ccf8f5435d4a78bdca4d6a018b578e/bbbbaaaa.<init> (IIIIZZLqeaa361f143ee4a0894bd168fd9b30c66/qf4ccf8f5435d4a78bdca4d6a018b578e/abaabbba;)V
      // 150: areturn
   }

   public static boolean aaabab(class_310 param0) {
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
      // 06: ifne 11
      // 09: ifnull 5b
      // 0c: goto 10
      // 0f: athrow
      // 10: aload 0
      // 11: iload 1
      // 12: ifne 24
      // 15: getfield net/minecraft/class_310.field_1724 Lnet/minecraft/class_746;
      // 18: ifnull 5b
      // 1b: goto 1f
      // 1e: athrow
      // 1f: aload 0
      // 20: goto 24
      // 23: athrow
      // 24: iload 1
      // 25: ifne 37
      // 28: getfield net/minecraft/class_310.field_1761 Lnet/minecraft/class_636;
      // 2b: ifnull 5b
      // 2e: goto 32
      // 31: athrow
      // 32: aload 0
      // 33: goto 37
      // 36: athrow
      // 37: iload 1
      // 38: ifne 4a
      // 3b: getfield net/minecraft/class_310.field_1690 Lnet/minecraft/class_315;
      // 3e: ifnull 5b
      // 41: goto 45
      // 44: athrow
      // 45: aload 0
      // 46: goto 4a
      // 49: athrow
      // 4a: getfield net/minecraft/class_310.field_1690 Lnet/minecraft/class_315;
      // 4d: iload 1
      // 4e: ifne 6a
      // 51: getfield net/minecraft/class_315.field_1886 Lnet/minecraft/class_304;
      // 54: ifnonnull 5e
      // 57: goto 5b
      // 5a: athrow
      // 5b: bipush 0
      // 5c: ireturn
      // 5d: athrow
      // 5e: aload 0
      // 5f: iload 1
      // 60: ifne 7e
      // 63: getfield net/minecraft/class_310.field_1690 Lnet/minecraft/class_315;
      // 66: goto 6a
      // 69: athrow
      // 6a: getfield net/minecraft/class_315.field_1886 Lnet/minecraft/class_304;
      // 6d: invokestatic qeaa361f143ee4a0894bd168fd9b30c66/qf4ccf8f5435d4a78bdca4d6a018b578e/aabbabbbb.abbaabb (Lnet/minecraft/class_304;)Lnet/minecraft/class_3675$class_306;
      // 70: invokestatic qeaa361f143ee4a0894bd168fd9b30c66/qf4ccf8f5435d4a78bdca4d6a018b578e/aabbabbbb.bbaaaaa (Lnet/minecraft/class_3675$class_306;)Z
      // 73: ifeq 79
      // 76: bipush 0
      // 77: ireturn
      // 78: athrow
      // 79: aload 0
      // 7a: invokestatic qeaa361f143ee4a0894bd168fd9b30c66/qf4ccf8f5435d4a78bdca4d6a018b578e/aabbabbbb.bbbaaba (Lnet/minecraft/class_310;)V
      // 7d: aload 0
      // 7e: invokestatic qeaa361f143ee4a0894bd168fd9b30c66/qf4ccf8f5435d4a78bdca4d6a018b578e/aabbabbbb.bbababb (Lnet/minecraft/class_310;)Z
      // 81: ireturn
   }

   public static boolean aaabba(class_310 param0, int param1) {
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
      // 09: ifnull 4a
      // 0c: goto 10
      // 0f: athrow
      // 10: aload 0
      // 11: getfield net/minecraft/class_310.field_1724 Lnet/minecraft/class_746;
      // 14: ifnull 4a
      // 17: iload 1
      // 18: iload 2
      // 19: ifne 4f
      // 1c: goto 20
      // 1f: athrow
      // 20: iflt 4a
      // 23: goto 27
      // 26: athrow
      // 27: iload 1
      // 28: iload 2
      // 29: ifne 55
      // 2c: goto 30
      // 2f: athrow
      // 30: ldc_w 604047302
      // 33: ldc_w 1297418628
      // 36: ldc_w 2032845715
      // 39: ixor
      // 3a: invokestatic qeaa361f143ee4a0894bd168fd9b30c66/qf4ccf8f5435d4a78bdca4d6a018b578e/aabbabbbb.b (II)I
      // 3d: ldc2_w 6146930655705273313
      // 40: invokestatic qeaa361f143ee4a0894bd168fd9b30c66/qf4ccf8f5435d4a78bdca4d6a018b578e/aabbabbbb.aaaaa (IJ)I
      // 43: if_icmple 50
      // 46: goto 4a
      // 49: athrow
      // 4a: bipush 0
      // 4b: goto 4f
      // 4e: athrow
      // 4f: ireturn
      // 50: aload 0
      // 51: iload 1
      // 52: invokestatic qeaa361f143ee4a0894bd168fd9b30c66/qf4ccf8f5435d4a78bdca4d6a018b578e/aabbabbbb.abaaa (Lnet/minecraft/class_310;I)Z
      // 55: iload 2
      // 56: ifne 61
      // 59: ifeq 62
      // 5c: goto 60
      // 5f: athrow
      // 60: bipush 1
      // 61: ireturn
      // 62: new qeaa361f143ee4a0894bd168fd9b30c66/qf4ccf8f5435d4a78bdca4d6a018b578e/aaaababaa
      // 65: dup
      // 66: aload 0
      // 67: invokespecial qeaa361f143ee4a0894bd168fd9b30c66/qf4ccf8f5435d4a78bdca4d6a018b578e/aaaababaa.<init> (Lnet/minecraft/class_310;)V
      // 6a: astore 3
      // 6b: getstatic qeaa361f143ee4a0894bd168fd9b30c66/qf4ccf8f5435d4a78bdca4d6a018b578e/aabbabbbb.aba Lqeaa361f143ee4a0894bd168fd9b30c66/qf4ccf8f5435d4a78bdca4d6a018b578e/abaaabaa;
      // 6e: invokevirtual qeaa361f143ee4a0894bd168fd9b30c66/qf4ccf8f5435d4a78bdca4d6a018b578e/abaaabaa.ab ()Z
      // 71: iload 2
      // 72: ifne a5
      // 75: ifeq a0
      // 78: goto 7c
      // 7b: athrow
      // 7c: getstatic qeaa361f143ee4a0894bd168fd9b30c66/qf4ccf8f5435d4a78bdca4d6a018b578e/aabbabbbb.aba Lqeaa361f143ee4a0894bd168fd9b30c66/qf4ccf8f5435d4a78bdca4d6a018b578e/abaaabaa;
      // 7f: aload 3
      // 80: invokevirtual qeaa361f143ee4a0894bd168fd9b30c66/qf4ccf8f5435d4a78bdca4d6a018b578e/abaaabaa.baba (Lqeaa361f143ee4a0894bd168fd9b30c66/qf4ccf8f5435d4a78bdca4d6a018b578e/abbbaaa;)I
      // 83: iload 2
      // 84: ifne a5
      // 87: goto 8b
      // 8a: athrow
      // 8b: iload 1
      // 8c: if_icmpne a0
      // 8f: goto 93
      // 92: athrow
      // 93: aload 3
      // 94: getstatic qeaa361f143ee4a0894bd168fd9b30c66/qf4ccf8f5435d4a78bdca4d6a018b578e/bbbabbab.b Lqeaa361f143ee4a0894bd168fd9b30c66/qf4ccf8f5435d4a78bdca4d6a018b578e/bbbabbab;
      // 97: iload 1
      // 98: invokevirtual qeaa361f143ee4a0894bd168fd9b30c66/qf4ccf8f5435d4a78bdca4d6a018b578e/aaaababaa.ab (Lqeaa361f143ee4a0894bd168fd9b30c66/qf4ccf8f5435d4a78bdca4d6a018b578e/bbbabbab;I)Z
      // 9b: pop
      // 9c: goto a0
      // 9f: athrow
      // a0: aload 0
      // a1: iload 1
      // a2: invokestatic qeaa361f143ee4a0894bd168fd9b30c66/qf4ccf8f5435d4a78bdca4d6a018b578e/aabbabbbb.abaaa (Lnet/minecraft/class_310;I)Z
      // a5: ireturn
   }

   public static boolean aaabbb(BooleanSupplier var0) {
      int var1 = aabbb;
      babaaba();

      boolean var2;
      try {
         var2 = var0.getAsBoolean();
      } finally {
         aabbb = var1;
      }

      return var2;
   }

   public static boolean aabaaa() {
      int var0 = baaabbaa.bba;

      try {
         if (var0 != 0) {
            return (boolean)bbbb;
         }

         if (bbbb > 0) {
            return (boolean)1;
         }
      } catch (MatchException var1) {
         throw var1;
      }

      return (boolean)0;
   }

   public static class_1269 aabaab(class_310 param0, class_1268 param1) {
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
      // 09: ifnull 32
      // 0c: goto 10
      // 0f: athrow
      // 10: aload 0
      // 11: iload 2
      // 12: ifne 24
      // 15: getfield net/minecraft/class_310.field_1724 Lnet/minecraft/class_746;
      // 18: ifnull 32
      // 1b: goto 1f
      // 1e: athrow
      // 1f: aload 0
      // 20: goto 24
      // 23: athrow
      // 24: getfield net/minecraft/class_310.field_1761 Lnet/minecraft/class_636;
      // 27: ifnull 32
      // 2a: aload 1
      // 2b: ifnonnull 37
      // 2e: goto 32
      // 31: athrow
      // 32: getstatic net/minecraft/class_1269.field_5814 Lnet/minecraft/class_1269$class_9857;
      // 35: areturn
      // 36: athrow
      // 37: aload 0
      // 38: invokestatic qeaa361f143ee4a0894bd168fd9b30c66/qf4ccf8f5435d4a78bdca4d6a018b578e/aabbabbbb.bbaabbb (Lnet/minecraft/class_310;)V
      // 3b: aload 0
      // 3c: getfield net/minecraft/class_310.field_1761 Lnet/minecraft/class_636;
      // 3f: aload 0
      // 40: getfield net/minecraft/class_310.field_1724 Lnet/minecraft/class_746;
      // 43: aload 1
      // 44: invokevirtual net/minecraft/class_636.method_2919 (Lnet/minecraft/class_1657;Lnet/minecraft/class_1268;)Lnet/minecraft/class_1269;
      // 47: areturn
   }

   public static boolean aababa(class_310 var0, int var1) {
      bbbbaaaa var2 = ababab(var0, var1, 0, true);
      return bbaaaab(var0, var2);
   }

   public static float aababb(class_1309 var0, float var1) {
      try {
         if (var0 == null) {
            return 0.0F;
         }
      } catch (MatchException var4) {
         throw var4;
      }

      float var2 = babaaa(bbbba, var0, var0.method_36454());
      float var3 = babaaa(abab, var0, var2);
      return class_3532.method_17821(var1, var3, var2);
   }

   public static boolean aabbaa(class_306 param0) {
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
      // 06: ifne 11
      // 09: ifnull 39
      // 0c: goto 10
      // 0f: athrow
      // 10: aload 0
      // 11: iload 1
      // 12: ifne 27
      // 15: invokevirtual net/minecraft/class_3675$class_306.method_1442 ()Lnet/minecraft/class_3675$class_307;
      // 18: getstatic net/minecraft/class_3675$class_307.field_1672 Lnet/minecraft/class_3675$class_307;
      // 1b: if_acmpne 39
      // 1e: goto 22
      // 21: athrow
      // 22: aload 0
      // 23: goto 27
      // 26: athrow
      // 27: invokestatic qeaa361f143ee4a0894bd168fd9b30c66/qf4ccf8f5435d4a78bdca4d6a018b578e/aabbabbbb.bbaaaaa (Lnet/minecraft/class_3675$class_306;)Z
      // 2a: iload 1
      // 2b: ifne 36
      // 2e: ifne 39
      // 31: goto 35
      // 34: athrow
      // 35: bipush 1
      // 36: goto 3a
      // 39: bipush 0
      // 3a: ireturn
   }

   private static void aabbab(class_310 param0, int param1) {
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
      // 09: ifnull 59
      // 0c: goto 10
      // 0f: athrow
      // 10: aload 0
      // 11: iload 2
      // 12: ifne 24
      // 15: getfield net/minecraft/class_310.field_1724 Lnet/minecraft/class_746;
      // 18: ifnull 59
      // 1b: goto 1f
      // 1e: athrow
      // 1f: aload 0
      // 20: goto 24
      // 23: athrow
      // 24: getfield net/minecraft/class_310.field_1761 Lnet/minecraft/class_636;
      // 27: ifnull 59
      // 2a: iload 1
      // 2b: iload 2
      // 2c: ifne 3b
      // 2f: goto 33
      // 32: athrow
      // 33: iflt 59
      // 36: goto 3a
      // 39: athrow
      // 3a: iload 1
      // 3b: iload 2
      // 3c: ifne 5e
      // 3f: ldc_w 604047321
      // 42: ldc_w -893001556
      // 45: ldc_w 1583538617
      // 48: ixor
      // 49: invokestatic qeaa361f143ee4a0894bd168fd9b30c66/qf4ccf8f5435d4a78bdca4d6a018b578e/aabbabbbb.b (II)I
      // 4c: ldc2_w 6146930655705273313
      // 4f: invokestatic qeaa361f143ee4a0894bd168fd9b30c66/qf4ccf8f5435d4a78bdca4d6a018b578e/aabbabbbb.aaaaa (IJ)I
      // 52: if_icmple 5b
      // 55: goto 59
      // 58: athrow
      // 59: return
      // 5a: athrow
      // 5b: getstatic qeaa361f143ee4a0894bd168fd9b30c66/qf4ccf8f5435d4a78bdca4d6a018b578e/aabbabbbb.babaa Z
      // 5e: iload 2
      // 5f: ifne b6
      // 62: ifeq b1
      // 65: goto 69
      // 68: athrow
      // 69: aload 0
      // 6a: invokestatic qeaa361f143ee4a0894bd168fd9b30c66/qf4ccf8f5435d4a78bdca4d6a018b578e/aabbabbbb.abaaaab (Lnet/minecraft/class_310;)Z
      // 6d: iload 2
      // 6e: ifne b6
      // 71: goto 75
      // 74: athrow
      // 75: ifne b1
      // 78: goto 7c
      // 7b: athrow
      // 7c: invokestatic qeaa361f143ee4a0894bd168fd9b30c66/qf4ccf8f5435d4a78bdca4d6a018b578e/aabbabbbb.abbbabb ()Z
      // 7f: iload 2
      // 80: ifne b6
      // 83: goto 87
      // 86: athrow
      // 87: ifne b1
      // 8a: goto 8e
      // 8d: athrow
      // 8e: invokestatic qeaa361f143ee4a0894bd168fd9b30c66/qf4ccf8f5435d4a78bdca4d6a018b578e/aabbabbbb.babbbb ()Z
      // 91: iload 2
      // 92: ifne b6
      // 95: goto 99
      // 98: athrow
      // 99: ifne b1
      // 9c: goto a0
      // 9f: athrow
      // a0: aload 0
      // a1: getfield net/minecraft/class_310.field_1761 Lnet/minecraft/class_636;
      // a4: invokestatic qeaa361f143ee4a0894bd168fd9b30c66/qf4ccf8f5435d4a78bdca4d6a018b578e/bbbabaa.abba (Lnet/minecraft/class_636;)V
      // a7: bipush -1
      // a8: putstatic qeaa361f143ee4a0894bd168fd9b30c66/qf4ccf8f5435d4a78bdca4d6a018b578e/aabbabbbb.aaaab I
      // ab: bipush 0
      // ac: putstatic qeaa361f143ee4a0894bd168fd9b30c66/qf4ccf8f5435d4a78bdca4d6a018b578e/aabbabbbb.baaba Z
      // af: return
      // b0: athrow
      // b1: iload 1
      // b2: putstatic qeaa361f143ee4a0894bd168fd9b30c66/qf4ccf8f5435d4a78bdca4d6a018b578e/aabbabbbb.aaaab I
      // b5: bipush 1
      // b6: putstatic qeaa361f143ee4a0894bd168fd9b30c66/qf4ccf8f5435d4a78bdca4d6a018b578e/aabbabbbb.baaba Z
      // b9: return
   }

   public static boolean aabbba() {
      // $VF: Couldn't be decompiled
      // Please report this to the Vineflower issue tracker, at https://github.com/Vineflower/vineflower/issues with a copy of the class file (if you have the rights to distribute it!)
      // java.lang.RuntimeException: parsing failure!
      //   at org.jetbrains.java.decompiler.modules.decompiler.decompose.DomHelper.parseGraph(DomHelper.java:211)
      //   at org.jetbrains.java.decompiler.main.rels.MethodProcessor.codeToJava(MethodProcessor.java:166)
      //
      // Bytecode:
      // 00: getstatic qeaa361f143ee4a0894bd168fd9b30c66/qf4ccf8f5435d4a78bdca4d6a018b578e/baaabbaa.bba I
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
      // 2a: invokevirtual qeaa361f143ee4a0894bd168fd9b30c66/qf4ccf8f5435d4a78bdca4d6a018b578e/babbaba.abaaabb ()Lqeaa361f143ee4a0894bd168fd9b30c66/qf4ccf8f5435d4a78bdca4d6a018b578e/baabbbaa;
      // 2d: astore 2
      // 2e: aload 2
      // 2f: iload 0
      // 30: ifne 3b
      // 33: ifnull 50
      // 36: goto 3a
      // 39: athrow
      // 3a: aload 2
      // 3b: invokestatic net/minecraft/class_310.method_1551 ()Lnet/minecraft/class_310;
      // 3e: invokevirtual qeaa361f143ee4a0894bd168fd9b30c66/qf4ccf8f5435d4a78bdca4d6a018b578e/baabbbaa.aabba (Lnet/minecraft/class_310;)Z
      // 41: iload 0
      // 42: ifne 4d
      // 45: ifeq 50
      // 48: goto 4c
      // 4b: athrow
      // 4c: bipush 1
      // 4d: goto 51
      // 50: bipush 0
      // 51: ireturn
   }

   private static void aabbbb(class_310 param0) {
      // $VF: Couldn't be decompiled
      // Please report this to the Vineflower issue tracker, at https://github.com/Vineflower/vineflower/issues with a copy of the class file (if you have the rights to distribute it!)
      // java.lang.RuntimeException: parsing failure!
      //   at org.jetbrains.java.decompiler.modules.decompiler.decompose.DomHelper.parseGraph(DomHelper.java:211)
      //   at org.jetbrains.java.decompiler.main.rels.MethodProcessor.codeToJava(MethodProcessor.java:166)
      //
      // Bytecode:
      // 00: getstatic qeaa361f143ee4a0894bd168fd9b30c66/qf4ccf8f5435d4a78bdca4d6a018b578e/baaabbaa.bba I
      // 03: aload 0
      // 04: getfield net/minecraft/class_310.field_1724 Lnet/minecraft/class_746;
      // 07: astore 2
      // 08: istore 1
      // 09: aload 2
      // 0a: iload 1
      // 0b: ifne 17
      // 0e: ifnonnull 16
      // 11: goto 15
      // 14: athrow
      // 15: return
      // 16: aload 2
      // 17: checkcast qeaa361f143ee4a0894bd168fd9b30c66/q9fca77a8c4f94f01ae294010b0bee919/abbaabbb
      // 1a: astore 3
      // 1b: iload 1
      // 1c: ifne 37
      // 1f: aload 3
      // 20: invokeinterface qeaa361f143ee4a0894bd168fd9b30c66/q9fca77a8c4f94f01ae294010b0bee919/abbaabbb.yj$isHandSwinging ()Z 1
      // 25: ifeq 3e
      // 28: goto 2c
      // 2b: athrow
      // 2c: aload 3
      // 2d: bipush 0
      // 2e: invokeinterface qeaa361f143ee4a0894bd168fd9b30c66/q9fca77a8c4f94f01ae294010b0bee919/abbaabbb.yj$setHandSwinging (Z)V 2
      // 33: goto 37
      // 36: athrow
      // 37: aload 3
      // 38: bipush 0
      // 39: invokeinterface qeaa361f143ee4a0894bd168fd9b30c66/q9fca77a8c4f94f01ae294010b0bee919/abbaabbb.yj$setHandSwingTicks (I)V 2
      // 3e: return
   }

   public static void abaaaa(class_310 param0) {
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
      // 06: ifne 11
      // 09: ifnull 4a
      // 0c: goto 10
      // 0f: athrow
      // 10: aload 0
      // 11: iload 1
      // 12: ifne 28
      // 15: getfield net/minecraft/class_310.field_1755 Lnet/minecraft/class_437;
      // 18: ifnonnull 4a
      // 1b: goto 1f
      // 1e: athrow
      // 1f: aload 0
      // 20: iload 1
      // 21: ifne 46
      // 24: goto 28
      // 27: athrow
      // 28: invokestatic qeaa361f143ee4a0894bd168fd9b30c66/qf4ccf8f5435d4a78bdca4d6a018b578e/bbbabaa.abb (Lnet/minecraft/class_310;)I
      // 2b: ldc_w 604047320
      // 2e: ldc_w 449217445
      // 31: ldc_w -84779405
      // 34: ixor
      // 35: invokestatic qeaa361f143ee4a0894bd168fd9b30c66/qf4ccf8f5435d4a78bdca4d6a018b578e/aabbabbbb.b (II)I
      // 38: ldc2_w 2833374295577266169
      // 3b: invokestatic qeaa361f143ee4a0894bd168fd9b30c66/qf4ccf8f5435d4a78bdca4d6a018b578e/aabbabbbb.aaaaa (IJ)I
      // 3e: if_icmple 4a
      // 41: aload 0
      // 42: goto 46
      // 45: athrow
      // 46: bipush 0
      // 47: invokestatic qeaa361f143ee4a0894bd168fd9b30c66/qf4ccf8f5435d4a78bdca4d6a018b578e/bbbabaa.a (Lnet/minecraft/class_310;I)V
      // 4a: return
   }

   public static class_3966 abaaab(class_310 param0, double param1, boolean param3) {
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
      // 08: ifne 13
      // 0b: ifnull 36
      // 0e: goto 12
      // 11: athrow
      // 12: aload 0
      // 13: iload 4
      // 15: ifne 27
      // 18: getfield net/minecraft/class_310.field_1724 Lnet/minecraft/class_746;
      // 1b: ifnull 36
      // 1e: goto 22
      // 21: athrow
      // 22: aload 0
      // 23: goto 27
      // 26: athrow
      // 27: iload 4
      // 29: ifne 3a
      // 2c: getfield net/minecraft/class_310.field_1687 Lnet/minecraft/class_638;
      // 2f: ifnonnull 39
      // 32: goto 36
      // 35: athrow
      // 36: aconst_null
      // 37: areturn
      // 38: athrow
      // 39: aload 0
      // 3a: iload 4
      // 3c: ifne 52
      // 3f: invokevirtual net/minecraft/class_310.method_1560 ()Lnet/minecraft/class_1297;
      // 42: ifnull 51
      // 45: goto 49
      // 48: athrow
      // 49: aload 0
      // 4a: invokevirtual net/minecraft/class_310.method_1560 ()Lnet/minecraft/class_1297;
      // 4d: goto 55
      // 50: athrow
      // 51: aload 0
      // 52: getfield net/minecraft/class_310.field_1724 Lnet/minecraft/class_746;
      // 55: astore 5
      // 57: aload 5
      // 59: fconst_1
      // 5a: invokevirtual net/minecraft/class_1297.method_5836 (F)Lnet/minecraft/class_243;
      // 5d: astore 6
      // 5f: aload 5
      // 61: fconst_1
      // 62: invokevirtual net/minecraft/class_1297.method_5828 (F)Lnet/minecraft/class_243;
      // 65: astore 7
      // 67: aload 6
      // 69: aload 7
      // 6b: dload 1
      // 6c: invokevirtual net/minecraft/class_243.method_1021 (D)Lnet/minecraft/class_243;
      // 6f: invokevirtual net/minecraft/class_243.method_1019 (Lnet/minecraft/class_243;)Lnet/minecraft/class_243;
      // 72: astore 8
      // 74: aload 5
      // 76: invokevirtual net/minecraft/class_1297.method_5829 ()Lnet/minecraft/class_238;
      // 79: aload 7
      // 7b: dload 1
      // 7c: invokevirtual net/minecraft/class_243.method_1021 (D)Lnet/minecraft/class_243;
      // 7f: invokevirtual net/minecraft/class_238.method_18804 (Lnet/minecraft/class_243;)Lnet/minecraft/class_238;
      // 82: dconst_1
      // 83: dconst_1
      // 84: dconst_1
      // 85: invokevirtual net/minecraft/class_238.method_1009 (DDD)Lnet/minecraft/class_238;
      // 88: astore 9
      // 8a: aload 5
      // 8c: aload 6
      // 8e: aload 8
      // 90: aload 9
      // 92: invokedynamic test ()Ljava/util/function/Predicate; bsm=java/lang/invoke/LambdaMetafactory.metafactory (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;Ljava/lang/invoke/MethodType;Ljava/lang/invoke/MethodHandle;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[ (Ljava/lang/Object;)Z, qeaa361f143ee4a0894bd168fd9b30c66/qf4ccf8f5435d4a78bdca4d6a018b578e/aabbabbbb.baaba (Lnet/minecraft/class_1297;)Z, (Lnet/minecraft/class_1297;)Z ]
      // 97: dload 1
      // 98: dload 1
      // 99: dmul
      // 9a: invokestatic net/minecraft/class_1675.method_18075 (Lnet/minecraft/class_1297;Lnet/minecraft/class_243;Lnet/minecraft/class_243;Lnet/minecraft/class_238;Ljava/util/function/Predicate;D)Lnet/minecraft/class_3966;
      // 9d: astore 10
      // 9f: iload 3
      // a0: ifne cc
      // a3: aload 10
      // a5: iload 4
      // a7: ifne ce
      // aa: goto ae
      // ad: athrow
      // ae: ifnull cc
      // b1: goto b5
      // b4: athrow
      // b5: aload 0
      // b6: aload 5
      // b8: aload 6
      // ba: aload 10
      // bc: invokevirtual net/minecraft/class_3966.method_17784 ()Lnet/minecraft/class_243;
      // bf: invokestatic qeaa361f143ee4a0894bd168fd9b30c66/qf4ccf8f5435d4a78bdca4d6a018b578e/aabbabbbb.aaabaab (Lnet/minecraft/class_310;Lnet/minecraft/class_1297;Lnet/minecraft/class_243;Lnet/minecraft/class_243;)Z
      // c2: ifeq cc
      // c5: goto c9
      // c8: athrow
      // c9: aconst_null
      // ca: astore 10
      // cc: aload 10
      // ce: areturn
   }

   public static boolean abaaba(class_310 param0, class_1268 param1) {
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
      // 09: ifnull 32
      // 0c: goto 10
      // 0f: athrow
      // 10: aload 0
      // 11: iload 2
      // 12: ifne 24
      // 15: getfield net/minecraft/class_310.field_1724 Lnet/minecraft/class_746;
      // 18: ifnull 32
      // 1b: goto 1f
      // 1e: athrow
      // 1f: aload 0
      // 20: goto 24
      // 23: athrow
      // 24: getfield net/minecraft/class_310.field_1761 Lnet/minecraft/class_636;
      // 27: ifnull 32
      // 2a: aload 1
      // 2b: ifnonnull 35
      // 2e: goto 32
      // 31: athrow
      // 32: bipush 0
      // 33: ireturn
      // 34: athrow
      // 35: aload 0
      // 36: iload 2
      // 37: ifne 48
      // 3a: invokestatic qeaa361f143ee4a0894bd168fd9b30c66/qf4ccf8f5435d4a78bdca4d6a018b578e/aabbabbbb.aaaaba (Lnet/minecraft/class_310;)Z
      // 3d: ifne 47
      // 40: goto 44
      // 43: athrow
      // 44: bipush 0
      // 45: ireturn
      // 46: athrow
      // 47: aload 0
      // 48: invokestatic qeaa361f143ee4a0894bd168fd9b30c66/qf4ccf8f5435d4a78bdca4d6a018b578e/aabbabbbb.bbbaaab (Lnet/minecraft/class_310;)I
      // 4b: istore 3
      // 4c: aload 0
      // 4d: aload 1
      // 4e: invokestatic qeaa361f143ee4a0894bd168fd9b30c66/qf4ccf8f5435d4a78bdca4d6a018b578e/aabbabbbb.aabaaaa (Lnet/minecraft/class_310;Lnet/minecraft/class_1268;)Lnet/minecraft/class_1269;
      // 51: astore 4
      // 53: aload 4
      // 55: iload 2
      // 56: ifne 62
      // 59: ifnull 76
      // 5c: goto 60
      // 5f: athrow
      // 60: aload 4
      // 62: invokeinterface net/minecraft/class_1269.method_23665 ()Z 1
      // 67: iload 2
      // 68: ifne 73
      // 6b: ifeq 76
      // 6e: goto 72
      // 71: athrow
      // 72: bipush 1
      // 73: goto 77
      // 76: bipush 0
      // 77: istore 5
      // 79: iload 5
      // 7b: iload 2
      // 7c: ifne 90
      // 7f: ifeq 8e
      // 82: goto 86
      // 85: athrow
      // 86: aload 0
      // 87: invokestatic qeaa361f143ee4a0894bd168fd9b30c66/qf4ccf8f5435d4a78bdca4d6a018b578e/aabbabbbb.baaaaba (Lnet/minecraft/class_310;)V
      // 8a: goto 8e
      // 8d: athrow
      // 8e: iload 5
      // 90: istore 6
      // 92: iload 3
      // 93: iload 2
      // 94: ifne a9
      // 97: ifle a7
      // 9a: goto 9e
      // 9d: athrow
      // 9e: aload 0
      // 9f: iload 3
      // a0: invokestatic qeaa361f143ee4a0894bd168fd9b30c66/qf4ccf8f5435d4a78bdca4d6a018b578e/bbbabaa.aaaa (Lnet/minecraft/class_310;I)V
      // a3: goto a7
      // a6: athrow
      // a7: iload 6
      // a9: ireturn
      // aa: astore 7
      // ac: iload 3
      // ad: ifle b9
      // b0: aload 0
      // b1: iload 3
      // b2: invokestatic qeaa361f143ee4a0894bd168fd9b30c66/qf4ccf8f5435d4a78bdca4d6a018b578e/bbbabaa.aaaa (Lnet/minecraft/class_310;I)V
      // b5: goto b9
      // b8: athrow
      // b9: aload 7
      // bb: athrow
   }

   public static boolean abaabb(class_1309 param0) {
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
      // 06: ifne 14
      // 09: ifnonnull 13
      // 0c: goto 10
      // 0f: athrow
      // 10: bipush 0
      // 11: ireturn
      // 12: athrow
      // 13: aload 0
      // 14: iload 1
      // 15: ifne 26
      // 18: invokevirtual net/minecraft/class_1309.method_6039 ()Z
      // 1b: ifeq 25
      // 1e: goto 22
      // 21: athrow
      // 22: bipush 1
      // 23: ireturn
      // 24: athrow
      // 25: aload 0
      // 26: iload 1
      // 27: ifne 39
      // 2a: invokevirtual net/minecraft/class_1309.method_6115 ()Z
      // 2d: ifeq 4e
      // 30: goto 34
      // 33: athrow
      // 34: aload 0
      // 35: goto 39
      // 38: athrow
      // 39: invokevirtual net/minecraft/class_1309.method_6030 ()Lnet/minecraft/class_1799;
      // 3c: invokestatic qeaa361f143ee4a0894bd168fd9b30c66/qf4ccf8f5435d4a78bdca4d6a018b578e/aabbabbbb.abababb (Lnet/minecraft/class_1799;)Z
      // 3f: iload 1
      // 40: ifne 4b
      // 43: ifeq 4e
      // 46: goto 4a
      // 49: athrow
      // 4a: bipush 1
      // 4b: goto 4f
      // 4e: bipush 0
      // 4f: ireturn
   }

   public static boolean ababaa(class_2680 param0) {
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
      // 06: ifne 11
      // 09: ifnull 4b
      // 0c: goto 10
      // 0f: athrow
      // 10: aload 0
      // 11: invokevirtual net/minecraft/class_2680.method_26215 ()Z
      // 14: iload 1
      // 15: ifne 4c
      // 18: ifne 4b
      // 1b: goto 1f
      // 1e: athrow
      // 1f: aload 0
      // 20: getstatic net/minecraft/class_2246.field_10036 Lnet/minecraft/class_2248;
      // 23: invokevirtual net/minecraft/class_2680.method_27852 (Lnet/minecraft/class_2248;)Z
      // 26: iload 1
      // 27: ifne 4c
      // 2a: goto 2e
      // 2d: athrow
      // 2e: ifne 4b
      // 31: goto 35
      // 34: athrow
      // 35: aload 0
      // 36: getstatic net/minecraft/class_2246.field_22089 Lnet/minecraft/class_2248;
      // 39: invokevirtual net/minecraft/class_2680.method_27852 (Lnet/minecraft/class_2248;)Z
      // 3c: iload 1
      // 3d: ifne 4c
      // 40: goto 44
      // 43: athrow
      // 44: ifeq 4f
      // 47: goto 4b
      // 4a: athrow
      // 4b: bipush 1
      // 4c: goto 50
      // 4f: bipush 0
      // 50: ireturn
   }

   public static bbbbaaaa ababab(class_310 param0, int param1, int param2, boolean param3) {
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
      // 00b: ifnull 04e
      // 00e: goto 012
      // 011: athrow
      // 012: aload 0
      // 013: getfield net/minecraft/class_310.field_1724 Lnet/minecraft/class_746;
      // 016: ifnull 04e
      // 019: iload 1
      // 01a: iload 4
      // 01c: ifne 053
      // 01f: goto 023
      // 022: athrow
      // 023: iflt 04e
      // 026: goto 02a
      // 029: athrow
      // 02a: iload 1
      // 02b: iload 4
      // 02d: ifne 05e
      // 030: goto 034
      // 033: athrow
      // 034: ldc_w 604047323
      // 037: ldc_w 931966424
      // 03a: ldc_w 1336171360
      // 03d: ixor
      // 03e: invokestatic qeaa361f143ee4a0894bd168fd9b30c66/qf4ccf8f5435d4a78bdca4d6a018b578e/aabbabbbb.b (II)I
      // 041: ldc2_w 6146930655705273313
      // 044: invokestatic qeaa361f143ee4a0894bd168fd9b30c66/qf4ccf8f5435d4a78bdca4d6a018b578e/aabbabbbb.aaaaa (IJ)I
      // 047: if_icmple 057
      // 04a: goto 04e
      // 04d: athrow
      // 04e: iload 1
      // 04f: goto 053
      // 052: athrow
      // 053: invokestatic qeaa361f143ee4a0894bd168fd9b30c66/qf4ccf8f5435d4a78bdca4d6a018b578e/bbbbaaaa.aba (I)Lqeaa361f143ee4a0894bd168fd9b30c66/qf4ccf8f5435d4a78bdca4d6a018b578e/bbbbaaaa;
      // 056: areturn
      // 057: aload 0
      // 058: getfield net/minecraft/class_310.field_1724 Lnet/minecraft/class_746;
      // 05b: getfield net/minecraft/class_746.field_6012 I
      // 05e: istore 5
      // 060: aload 0
      // 061: getfield net/minecraft/class_310.field_1724 Lnet/minecraft/class_746;
      // 064: invokevirtual net/minecraft/class_746.method_31548 ()Lnet/minecraft/class_1661;
      // 067: astore 6
      // 069: aload 6
      // 06b: invokestatic qeaa361f143ee4a0894bd168fd9b30c66/qf4ccf8f5435d4a78bdca4d6a018b578e/aabbabbbb.abaabaa (Lnet/minecraft/class_1661;)I
      // 06e: istore 7
      // 070: iload 7
      // 072: iload 4
      // 074: ifne 084
      // 077: iload 1
      // 078: if_icmpeq 087
      // 07b: goto 07f
      // 07e: athrow
      // 07f: bipush 1
      // 080: goto 084
      // 083: athrow
      // 084: goto 088
      // 087: bipush 0
      // 088: istore 8
      // 08a: aload 0
      // 08b: iload 1
      // 08c: iload 3
      // 08d: invokestatic qeaa361f143ee4a0894bd168fd9b30c66/qf4ccf8f5435d4a78bdca4d6a018b578e/aabbabbbb.ababaaa (Lnet/minecraft/class_310;IZ)V
      // 090: iload 3
      // 091: iload 4
      // 093: ifne 0bb
      // 096: ifeq 0b6
      // 099: goto 09d
      // 09c: athrow
      // 09d: iload 2
      // 09e: iload 4
      // 0a0: ifne 0bb
      // 0a3: goto 0a7
      // 0a6: athrow
      // 0a7: ifgt 0b6
      // 0aa: goto 0ae
      // 0ad: athrow
      // 0ae: aload 0
      // 0af: invokestatic qeaa361f143ee4a0894bd168fd9b30c66/qf4ccf8f5435d4a78bdca4d6a018b578e/aabbabbbb.aabaa (Lnet/minecraft/class_310;)V
      // 0b2: goto 0b6
      // 0b5: athrow
      // 0b6: aload 6
      // 0b8: invokestatic qeaa361f143ee4a0894bd168fd9b30c66/qf4ccf8f5435d4a78bdca4d6a018b578e/aabbabbbb.abaabaa (Lnet/minecraft/class_1661;)I
      // 0bb: istore 9
      // 0bd: iload 9
      // 0bf: iload 4
      // 0c1: ifne 0d4
      // 0c4: iload 1
      // 0c5: if_icmpeq 0d2
      // 0c8: goto 0cc
      // 0cb: athrow
      // 0cc: iload 1
      // 0cd: invokestatic qeaa361f143ee4a0894bd168fd9b30c66/qf4ccf8f5435d4a78bdca4d6a018b578e/bbbbaaaa.aba (I)Lqeaa361f143ee4a0894bd168fd9b30c66/qf4ccf8f5435d4a78bdca4d6a018b578e/bbbbaaaa;
      // 0d0: areturn
      // 0d1: athrow
      // 0d2: iload 8
      // 0d4: iload 4
      // 0d6: ifne 0ec
      // 0d9: ifeq 0ef
      // 0dc: goto 0e0
      // 0df: athrow
      // 0e0: iload 5
      // 0e2: bipush 0
      // 0e3: iload 2
      // 0e4: invokestatic java/lang/Math.max (II)I
      // 0e7: iadd
      // 0e8: goto 0ec
      // 0eb: athrow
      // 0ec: goto 0f1
      // 0ef: iload 5
      // 0f1: istore 10
      // 0f3: new qeaa361f143ee4a0894bd168fd9b30c66/qf4ccf8f5435d4a78bdca4d6a018b578e/bbbbaaaa
      // 0f6: dup
      // 0f7: iload 7
      // 0f9: iload 1
      // 0fa: iload 5
      // 0fc: iload 10
      // 0fe: iload 8
      // 100: bipush 1
      // 101: aconst_null
      // 102: invokespecial qeaa361f143ee4a0894bd168fd9b30c66/qf4ccf8f5435d4a78bdca4d6a018b578e/bbbbaaaa.<init> (IIIIZZLqeaa361f143ee4a0894bd168fd9b30c66/qf4ccf8f5435d4a78bdca4d6a018b578e/abaabbba;)V
      // 105: areturn
   }

   public static class_2680 ababba(class_310 param0, int param1) {
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
      // 09: ifnull 3e
      // 0c: goto 10
      // 0f: athrow
      // 10: aload 0
      // 11: getfield net/minecraft/class_310.field_1724 Lnet/minecraft/class_746;
      // 14: ifnull 3e
      // 17: iload 1
      // 18: iload 2
      // 19: ifne 28
      // 1c: goto 20
      // 1f: athrow
      // 20: iflt 3e
      // 23: goto 27
      // 26: athrow
      // 27: iload 1
      // 28: ldc_w 604047322
      // 2b: ldc_w 1964387350
      // 2e: ldc_w 274284862
      // 31: ixor
      // 32: invokestatic qeaa361f143ee4a0894bd168fd9b30c66/qf4ccf8f5435d4a78bdca4d6a018b578e/aabbabbbb.b (II)I
      // 35: ldc2_w 6146930655705273313
      // 38: invokestatic qeaa361f143ee4a0894bd168fd9b30c66/qf4ccf8f5435d4a78bdca4d6a018b578e/aabbabbbb.aaaaa (IJ)I
      // 3b: if_icmple 41
      // 3e: aconst_null
      // 3f: areturn
      // 40: athrow
      // 41: aload 0
      // 42: getfield net/minecraft/class_310.field_1724 Lnet/minecraft/class_746;
      // 45: invokevirtual net/minecraft/class_746.method_31548 ()Lnet/minecraft/class_1661;
      // 48: iload 1
      // 49: invokevirtual net/minecraft/class_1661.method_5438 (I)Lnet/minecraft/class_1799;
      // 4c: astore 3
      // 4d: aload 3
      // 4e: iload 2
      // 4f: ifne 5a
      // 52: ifnull 7e
      // 55: goto 59
      // 58: athrow
      // 59: aload 3
      // 5a: invokevirtual net/minecraft/class_1799.method_7909 ()Lnet/minecraft/class_1792;
      // 5d: astore 5
      // 5f: aload 5
      // 61: iload 2
      // 62: ifne 75
      // 65: instanceof net/minecraft/class_1747
      // 68: ifeq 7e
      // 6b: goto 6f
      // 6e: athrow
      // 6f: aload 5
      // 71: goto 75
      // 74: athrow
      // 75: checkcast net/minecraft/class_1747
      // 78: astore 4
      // 7a: iload 2
      // 7b: ifeq 81
      // 7e: aconst_null
      // 7f: areturn
      // 80: athrow
      // 81: aload 4
      // 83: invokevirtual net/minecraft/class_1747.method_7711 ()Lnet/minecraft/class_2248;
      // 86: invokevirtual net/minecraft/class_2248.method_9564 ()Lnet/minecraft/class_2680;
      // 89: astore 5
      // 8b: aload 5
      // 8d: iload 2
      // 8e: ifne 9a
      // 91: ifnull a0
      // 94: goto 98
      // 97: athrow
      // 98: aload 5
      // 9a: invokevirtual net/minecraft/class_2680.method_26215 ()Z
      // 9d: ifeq a5
      // a0: aconst_null
      // a1: goto a7
      // a4: athrow
      // a5: aload 5
      // a7: areturn
   }

   // $VF: Handled exception range with multiple entry points by splitting it
   // $VF: Duplicated exception handlers to handle obfuscated exceptions
   public static boolean ababbb(class_310 var0, Object var1, int var2, bbbabbab var3, int var4, boolean var5, Runnable var6) {
      int var7 = baaabbaa.bba;

      label60: {
         class_310 var10000;
         label48: {
            try {
               var10000 = var0;
               if (var7 != 0) {
                  break label48;
               }

               if (var0 == null) {
                  break label60;
               }
            } catch (MatchException var12) {
               throw var12;
            }

            var10000 = var0;
         }

         try {
            if (var10000.field_1724 == null) {
               break label60;
            }
         } catch (MatchException var11) {
            throw var11;
         }

         abaabbba var8 = aba.bba(new aaaababaa(var0), var1, var2, var3, var4, var5, var6);

         try {
            long var14;
            int var13 = (var14 = var8.ab() - 0L) == 0L ? 0 : (var14 < 0L ? -1 : 1);
            if (var7 != 0) {
               return (boolean)var13;
            }

            if (var13) {
               return (boolean)1;
            }
         } catch (MatchException var10) {
            throw var10;
         }

         return (boolean)0;
      }

      try {
         return false;
      } catch (MatchException var9) {
         throw var9;
      }
   }

   public static boolean abbaaa(Object var0) {
      return aba.abbb(var0);
   }

   public static void abbaab() {
      aabbb = Math.max(0, aabbb - 1);
   }

   public static void abbaba(class_310 param0, class_1297 param1) {
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
      // 05: ifnull 1a
      // 08: getstatic qeaa361f143ee4a0894bd168fd9b30c66/qf4ccf8f5435d4a78bdca4d6a018b578e/aabbabbbb.abaa Ljava/lang/reflect/Method;
      // 0b: iload 2
      // 0c: ifne 2a
      // 0f: goto 13
      // 12: athrow
      // 13: ifnonnull 1b
      // 16: goto 1a
      // 19: athrow
      // 1a: return
      // 1b: getstatic qeaa361f143ee4a0894bd168fd9b30c66/qf4ccf8f5435d4a78bdca4d6a018b578e/aabbabbbb.abaa Ljava/lang/reflect/Method;
      // 1e: aload 0
      // 1f: bipush 1
      // 20: anewarray 4
      // 23: dup
      // 24: bipush 0
      // 25: aload 1
      // 26: aastore
      // 27: invokevirtual java/lang/reflect/Method.invoke (Ljava/lang/Object;[Ljava/lang/Object;)Ljava/lang/Object;
      // 2a: pop
      // 2b: goto 31
      // 2e: astore 3
      // 2f: aload 3
      // 30: pop
      // 31: return
   }

   public static void abbabb(class_310 param0) {
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
      // 06: ifne 11
      // 09: ifnull 1f
      // 0c: goto 10
      // 0f: athrow
      // 10: aload 0
      // 11: iload 1
      // 12: ifne 2a
      // 15: getfield net/minecraft/class_310.field_1724 Lnet/minecraft/class_746;
      // 18: ifnonnull 24
      // 1b: goto 1f
      // 1e: athrow
      // 1f: invokestatic qeaa361f143ee4a0894bd168fd9b30c66/qf4ccf8f5435d4a78bdca4d6a018b578e/aabbabbbb.aaabbbb ()V
      // 22: return
      // 23: athrow
      // 24: getstatic qeaa361f143ee4a0894bd168fd9b30c66/qf4ccf8f5435d4a78bdca4d6a018b578e/aabbabbbb.bbab Ljava/util/concurrent/ConcurrentLinkedQueue;
      // 27: invokevirtual java/util/concurrent/ConcurrentLinkedQueue.peek ()Ljava/lang/Object;
      // 2a: checkcast qeaa361f143ee4a0894bd168fd9b30c66/qf4ccf8f5435d4a78bdca4d6a018b578e/abaaaba
      // 2d: astore 2
      // 2e: aload 2
      // 2f: ifnull 4c
      // 32: aload 0
      // 33: iload 1
      // 34: ifne 54
      // 37: goto 3b
      // 3a: athrow
      // 3b: getfield net/minecraft/class_310.field_1724 Lnet/minecraft/class_746;
      // 3e: getfield net/minecraft/class_746.field_6012 I
      // 41: aload 2
      // 42: invokevirtual qeaa361f143ee4a0894bd168fd9b30c66/qf4ccf8f5435d4a78bdca4d6a018b578e/abaaaba.a ()I
      // 45: if_icmpge 4e
      // 48: goto 4c
      // 4b: athrow
      // 4c: return
      // 4d: athrow
      // 4e: getstatic qeaa361f143ee4a0894bd168fd9b30c66/qf4ccf8f5435d4a78bdca4d6a018b578e/aabbabbbb.bbab Ljava/util/concurrent/ConcurrentLinkedQueue;
      // 51: invokevirtual java/util/concurrent/ConcurrentLinkedQueue.poll ()Ljava/lang/Object;
      // 54: pop
      // 55: aload 2
      // 56: invokevirtual qeaa361f143ee4a0894bd168fd9b30c66/qf4ccf8f5435d4a78bdca4d6a018b578e/abaaaba.aa ()Lnet/minecraft/class_746;
      // 59: iload 1
      // 5a: ifne 74
      // 5d: aload 0
      // 5e: getfield net/minecraft/class_310.field_1724 Lnet/minecraft/class_746;
      // 61: if_acmpeq 70
      // 64: goto 68
      // 67: athrow
      // 68: iload 1
      // 69: ifeq 24
      // 6c: goto 70
      // 6f: athrow
      // 70: aload 0
      // 71: getfield net/minecraft/class_310.field_1724 Lnet/minecraft/class_746;
      // 74: invokevirtual net/minecraft/class_746.method_31548 ()Lnet/minecraft/class_1661;
      // 77: invokestatic qeaa361f143ee4a0894bd168fd9b30c66/qf4ccf8f5435d4a78bdca4d6a018b578e/aabbabbbb.abaabaa (Lnet/minecraft/class_1661;)I
      // 7a: istore 3
      // 7b: iload 3
      // 7c: iload 1
      // 7d: ifne a9
      // 80: aload 2
      // 81: invokevirtual qeaa361f143ee4a0894bd168fd9b30c66/qf4ccf8f5435d4a78bdca4d6a018b578e/abaaaba.ab ()I
      // 84: if_icmpeq a8
      // 87: goto 8b
      // 8a: athrow
      // 8b: aload 2
      // 8c: iload 3
      // 8d: invokestatic qeaa361f143ee4a0894bd168fd9b30c66/qf4ccf8f5435d4a78bdca4d6a018b578e/aabbabbbb.abbaaaa (Lqeaa361f143ee4a0894bd168fd9b30c66/qf4ccf8f5435d4a78bdca4d6a018b578e/abaaaba;I)Z
      // 90: iload 1
      // 91: ifne a6
      // 94: goto 98
      // 97: athrow
      // 98: ifeq 24
      // 9b: goto 9f
      // 9e: athrow
      // 9f: getstatic qeaa361f143ee4a0894bd168fd9b30c66/qf4ccf8f5435d4a78bdca4d6a018b578e/aabbabbbb.bbab Ljava/util/concurrent/ConcurrentLinkedQueue;
      // a2: aload 2
      // a3: invokevirtual java/util/concurrent/ConcurrentLinkedQueue.offer (Ljava/lang/Object;)Z
      // a6: pop
      // a7: return
      // a8: iload 3
      // a9: aload 2
      // aa: invokevirtual qeaa361f143ee4a0894bd168fd9b30c66/qf4ccf8f5435d4a78bdca4d6a018b578e/abaaaba.ba ()I
      // ad: if_icmpeq bd
      // b0: aload 0
      // b1: aload 2
      // b2: invokevirtual qeaa361f143ee4a0894bd168fd9b30c66/qf4ccf8f5435d4a78bdca4d6a018b578e/abaaaba.ba ()I
      // b5: bipush 0
      // b6: invokestatic qeaa361f143ee4a0894bd168fd9b30c66/qf4ccf8f5435d4a78bdca4d6a018b578e/aabbabbbb.ababaaa (Lnet/minecraft/class_310;IZ)V
      // b9: goto bd
      // bc: athrow
      // bd: goto 24
   }

   private static void abbbaa(Field var0, Object var1, float var2) {
      int var3 = baaabbaa.bba;

      Object var10000;
      label28: {
         try {
            var10000 = var0;
            if (var3 != 0) {
               break label28;
            }

            if (var0 == null) {
               return;
            }
         } catch (ReflectiveOperationException var6) {
            throw var6;
         }

         var10000 = var1;
      }

      if (var10000 != null) {
         try {
            var0.setFloat(var1, var2);
         } catch (ReflectiveOperationException var5) {
         }
      }
   }

   public static void abbbab() {
      babaa = false;
   }

   public static boolean abbbba(class_310 param0, bbbbaaaa param1) {
      // $VF: Couldn't be decompiled
      // Please report this to the Vineflower issue tracker, at https://github.com/Vineflower/vineflower/issues with a copy of the class file (if you have the rights to distribute it!)
      // java.lang.NullPointerException: Cannot invoke "org.jetbrains.java.decompiler.code.cfg.ExceptionRangeCFG.isCircular()" because "range" is null
      //   at org.jetbrains.java.decompiler.modules.decompiler.decompose.DomHelper.graphToStatement(DomHelper.java:84)
      //   at org.jetbrains.java.decompiler.modules.decompiler.decompose.DomHelper.parseGraph(DomHelper.java:203)
      //   at org.jetbrains.java.decompiler.main.rels.MethodProcessor.codeToJava(MethodProcessor.java:166)
      //
      // Bytecode:
      // 000: getstatic qeaa361f143ee4a0894bd168fd9b30c66/qf4ccf8f5435d4a78bdca4d6a018b578e/baaabbaa.bba I
      // 003: istore 2
      // 004: aload 0
      // 005: iload 2
      // 006: ifne 011
      // 009: ifnull 036
      // 00c: goto 010
      // 00f: athrow
      // 010: aload 0
      // 011: getfield net/minecraft/class_310.field_1724 Lnet/minecraft/class_746;
      // 014: ifnull 036
      // 017: aload 1
      // 018: iload 2
      // 019: ifne 028
      // 01c: goto 020
      // 01f: athrow
      // 020: ifnull 036
      // 023: goto 027
      // 026: athrow
      // 027: aload 1
      // 028: iload 2
      // 029: ifne 03a
      // 02c: invokevirtual qeaa361f143ee4a0894bd168fd9b30c66/qf4ccf8f5435d4a78bdca4d6a018b578e/bbbbaaaa.b ()Z
      // 02f: ifne 039
      // 032: goto 036
      // 035: athrow
      // 036: bipush 0
      // 037: ireturn
      // 038: athrow
      // 039: aload 1
      // 03a: iload 2
      // 03b: ifne 04d
      // 03e: invokevirtual qeaa361f143ee4a0894bd168fd9b30c66/qf4ccf8f5435d4a78bdca4d6a018b578e/bbbbaaaa.a ()Lqeaa361f143ee4a0894bd168fd9b30c66/qf4ccf8f5435d4a78bdca4d6a018b578e/abaabbba;
      // 041: ifnull 201
      // 044: goto 048
      // 047: athrow
      // 048: aload 1
      // 049: goto 04d
      // 04c: athrow
      // 04d: invokevirtual qeaa361f143ee4a0894bd168fd9b30c66/qf4ccf8f5435d4a78bdca4d6a018b578e/bbbbaaaa.a ()Lqeaa361f143ee4a0894bd168fd9b30c66/qf4ccf8f5435d4a78bdca4d6a018b578e/abaabbba;
      // 050: invokevirtual qeaa361f143ee4a0894bd168fd9b30c66/qf4ccf8f5435d4a78bdca4d6a018b578e/abaabbba.ab ()J
      // 053: lconst_0
      // 054: lcmp
      // 055: ifeq 201
      // 058: new qeaa361f143ee4a0894bd168fd9b30c66/qf4ccf8f5435d4a78bdca4d6a018b578e/aaaababaa
      // 05b: dup
      // 05c: aload 0
      // 05d: invokespecial qeaa361f143ee4a0894bd168fd9b30c66/qf4ccf8f5435d4a78bdca4d6a018b578e/aaaababaa.<init> (Lnet/minecraft/class_310;)V
      // 060: astore 3
      // 061: getstatic qeaa361f143ee4a0894bd168fd9b30c66/qf4ccf8f5435d4a78bdca4d6a018b578e/aabbabbbb.aba Lqeaa361f143ee4a0894bd168fd9b30c66/qf4ccf8f5435d4a78bdca4d6a018b578e/abaaabaa;
      // 064: aload 1
      // 065: invokevirtual qeaa361f143ee4a0894bd168fd9b30c66/qf4ccf8f5435d4a78bdca4d6a018b578e/bbbbaaaa.a ()Lqeaa361f143ee4a0894bd168fd9b30c66/qf4ccf8f5435d4a78bdca4d6a018b578e/abaabbba;
      // 068: invokevirtual qeaa361f143ee4a0894bd168fd9b30c66/qf4ccf8f5435d4a78bdca4d6a018b578e/abaabbba.a ()Ljava/lang/Object;
      // 06b: invokevirtual qeaa361f143ee4a0894bd168fd9b30c66/qf4ccf8f5435d4a78bdca4d6a018b578e/abaaabaa.abb (Ljava/lang/Object;)Lqeaa361f143ee4a0894bd168fd9b30c66/qf4ccf8f5435d4a78bdca4d6a018b578e/bbbabbab;
      // 06e: astore 4
      // 070: aload 4
      // 072: iload 2
      // 073: ifne 084
      // 076: ifnonnull 082
      // 079: goto 07d
      // 07c: athrow
      // 07d: getstatic qeaa361f143ee4a0894bd168fd9b30c66/qf4ccf8f5435d4a78bdca4d6a018b578e/aabbabbbb.aaaaba Lqeaa361f143ee4a0894bd168fd9b30c66/qf4ccf8f5435d4a78bdca4d6a018b578e/bbbabbab;
      // 080: astore 4
      // 082: aload 4
      // 084: iload 2
      // 085: ifne 098
      // 088: getstatic qeaa361f143ee4a0894bd168fd9b30c66/qf4ccf8f5435d4a78bdca4d6a018b578e/bbbabbab.aa Lqeaa361f143ee4a0894bd168fd9b30c66/qf4ccf8f5435d4a78bdca4d6a018b578e/bbbabbab;
      // 08b: if_acmpeq 09e
      // 08e: goto 092
      // 091: athrow
      // 092: aload 4
      // 094: goto 098
      // 097: athrow
      // 098: getstatic qeaa361f143ee4a0894bd168fd9b30c66/qf4ccf8f5435d4a78bdca4d6a018b578e/bbbabbab.abb Lqeaa361f143ee4a0894bd168fd9b30c66/qf4ccf8f5435d4a78bdca4d6a018b578e/bbbabbab;
      // 09b: if_acmpne 102
      // 09e: getstatic qeaa361f143ee4a0894bd168fd9b30c66/qf4ccf8f5435d4a78bdca4d6a018b578e/aabbabbbb.aba Lqeaa361f143ee4a0894bd168fd9b30c66/qf4ccf8f5435d4a78bdca4d6a018b578e/abaaabaa;
      // 0a1: aload 3
      // 0a2: aload 1
      // 0a3: invokevirtual qeaa361f143ee4a0894bd168fd9b30c66/qf4ccf8f5435d4a78bdca4d6a018b578e/bbbbaaaa.a ()Lqeaa361f143ee4a0894bd168fd9b30c66/qf4ccf8f5435d4a78bdca4d6a018b578e/abaabbba;
      // 0a6: aload 1
      // 0a7: invokevirtual qeaa361f143ee4a0894bd168fd9b30c66/qf4ccf8f5435d4a78bdca4d6a018b578e/bbbbaaaa.aa ()I
      // 0aa: aload 4
      // 0ac: aload 1
      // 0ad: invokevirtual qeaa361f143ee4a0894bd168fd9b30c66/qf4ccf8f5435d4a78bdca4d6a018b578e/bbbbaaaa.ba ()I
      // 0b0: invokevirtual qeaa361f143ee4a0894bd168fd9b30c66/qf4ccf8f5435d4a78bdca4d6a018b578e/abaaabaa.aa (Lqeaa361f143ee4a0894bd168fd9b30c66/qf4ccf8f5435d4a78bdca4d6a018b578e/abbbaaa;Lqeaa361f143ee4a0894bd168fd9b30c66/qf4ccf8f5435d4a78bdca4d6a018b578e/abaabbba;ILqeaa361f143ee4a0894bd168fd9b30c66/qf4ccf8f5435d4a78bdca4d6a018b578e/bbbabbab;I)Z
      // 0b3: iload 2
      // 0b4: ifne 0cc
      // 0b7: goto 0bb
      // 0ba: athrow
      // 0bb: ifne 0c5
      // 0be: goto 0c2
      // 0c1: athrow
      // 0c2: bipush 0
      // 0c3: ireturn
      // 0c4: athrow
      // 0c5: aload 0
      // 0c6: getfield net/minecraft/class_310.field_1724 Lnet/minecraft/class_746;
      // 0c9: getfield net/minecraft/class_746.field_6012 I
      // 0cc: iload 2
      // 0cd: ifne 0e9
      // 0d0: aload 1
      // 0d1: invokevirtual qeaa361f143ee4a0894bd168fd9b30c66/qf4ccf8f5435d4a78bdca4d6a018b578e/bbbbaaaa.ba ()I
      // 0d4: if_icmplt 100
      // 0d7: goto 0db
      // 0da: athrow
      // 0db: aload 0
      // 0dc: getfield net/minecraft/class_310.field_1724 Lnet/minecraft/class_746;
      // 0df: invokevirtual net/minecraft/class_746.method_31548 ()Lnet/minecraft/class_1661;
      // 0e2: invokestatic qeaa361f143ee4a0894bd168fd9b30c66/qf4ccf8f5435d4a78bdca4d6a018b578e/aabbabbbb.abaabaa (Lnet/minecraft/class_1661;)I
      // 0e5: goto 0e9
      // 0e8: athrow
      // 0e9: iload 2
      // 0ea: ifne 0fd
      // 0ed: aload 1
      // 0ee: invokevirtual qeaa361f143ee4a0894bd168fd9b30c66/qf4ccf8f5435d4a78bdca4d6a018b578e/bbbbaaaa.aa ()I
      // 0f1: if_icmpne 100
      // 0f4: goto 0f8
      // 0f7: athrow
      // 0f8: bipush 1
      // 0f9: goto 0fd
      // 0fc: athrow
      // 0fd: goto 101
      // 100: bipush 0
      // 101: ireturn
      // 102: getstatic qeaa361f143ee4a0894bd168fd9b30c66/qf4ccf8f5435d4a78bdca4d6a018b578e/aabbabbbb.aba Lqeaa361f143ee4a0894bd168fd9b30c66/qf4ccf8f5435d4a78bdca4d6a018b578e/abaaabaa;
      // 105: aload 3
      // 106: aload 1
      // 107: invokevirtual qeaa361f143ee4a0894bd168fd9b30c66/qf4ccf8f5435d4a78bdca4d6a018b578e/bbbbaaaa.a ()Lqeaa361f143ee4a0894bd168fd9b30c66/qf4ccf8f5435d4a78bdca4d6a018b578e/abaabbba;
      // 10a: aload 1
      // 10b: invokevirtual qeaa361f143ee4a0894bd168fd9b30c66/qf4ccf8f5435d4a78bdca4d6a018b578e/bbbbaaaa.aa ()I
      // 10e: getstatic qeaa361f143ee4a0894bd168fd9b30c66/qf4ccf8f5435d4a78bdca4d6a018b578e/bbbabbab.b Lqeaa361f143ee4a0894bd168fd9b30c66/qf4ccf8f5435d4a78bdca4d6a018b578e/bbbabbab;
      // 111: aload 1
      // 112: invokevirtual qeaa361f143ee4a0894bd168fd9b30c66/qf4ccf8f5435d4a78bdca4d6a018b578e/bbbbaaaa.ba ()I
      // 115: invokevirtual qeaa361f143ee4a0894bd168fd9b30c66/qf4ccf8f5435d4a78bdca4d6a018b578e/abaaabaa.aa (Lqeaa361f143ee4a0894bd168fd9b30c66/qf4ccf8f5435d4a78bdca4d6a018b578e/abbbaaa;Lqeaa361f143ee4a0894bd168fd9b30c66/qf4ccf8f5435d4a78bdca4d6a018b578e/abaabbba;ILqeaa361f143ee4a0894bd168fd9b30c66/qf4ccf8f5435d4a78bdca4d6a018b578e/bbbabbab;I)Z
      // 118: iload 2
      // 119: ifne 12d
      // 11c: ifne 126
      // 11f: goto 123
      // 122: athrow
      // 123: bipush 0
      // 124: ireturn
      // 125: athrow
      // 126: aload 1
      // 127: invokevirtual qeaa361f143ee4a0894bd168fd9b30c66/qf4ccf8f5435d4a78bdca4d6a018b578e/bbbbaaaa.a ()Lqeaa361f143ee4a0894bd168fd9b30c66/qf4ccf8f5435d4a78bdca4d6a018b578e/abaabbba;
      // 12a: invokevirtual qeaa361f143ee4a0894bd168fd9b30c66/qf4ccf8f5435d4a78bdca4d6a018b578e/abaabbba.aa ()Z
      // 12d: iload 2
      // 12e: ifne 148
      // 131: ifne 13b
      // 134: goto 138
      // 137: athrow
      // 138: bipush 1
      // 139: ireturn
      // 13a: athrow
      // 13b: bipush 0
      // 13c: aload 1
      // 13d: invokevirtual qeaa361f143ee4a0894bd168fd9b30c66/qf4ccf8f5435d4a78bdca4d6a018b578e/bbbbaaaa.ba ()I
      // 140: aload 1
      // 141: invokevirtual qeaa361f143ee4a0894bd168fd9b30c66/qf4ccf8f5435d4a78bdca4d6a018b578e/bbbbaaaa.ab ()I
      // 144: isub
      // 145: invokestatic java/lang/Math.max (II)I
      // 148: istore 5
      // 14a: getstatic qeaa361f143ee4a0894bd168fd9b30c66/qf4ccf8f5435d4a78bdca4d6a018b578e/aabbabbbb.abbba I
      // 14d: iload 2
      // 14e: ifne 161
      // 151: aload 1
      // 152: invokevirtual qeaa361f143ee4a0894bd168fd9b30c66/qf4ccf8f5435d4a78bdca4d6a018b578e/bbbbaaaa.aa ()I
      // 155: if_icmpne 164
      // 158: goto 15c
      // 15b: athrow
      // 15c: bipush 1
      // 15d: goto 161
      // 160: athrow
      // 161: goto 165
      // 164: bipush 0
      // 165: istore 6
      // 167: invokestatic qeaa361f143ee4a0894bd168fd9b30c66/qf4ccf8f5435d4a78bdca4d6a018b578e/bbbbbbba.ba ()I
      // 16a: iload 2
      // 16b: ifne 17e
      // 16e: aload 1
      // 16f: invokevirtual qeaa361f143ee4a0894bd168fd9b30c66/qf4ccf8f5435d4a78bdca4d6a018b578e/bbbbaaaa.aa ()I
      // 172: if_icmpne 181
      // 175: goto 179
      // 178: athrow
      // 179: bipush 1
      // 17a: goto 17e
      // 17d: athrow
      // 17e: goto 182
      // 181: bipush 0
      // 182: istore 7
      // 184: iload 6
      // 186: iload 2
      // 187: ifne 1b7
      // 18a: ifne 1b5
      // 18d: goto 191
      // 190: athrow
      // 191: iload 5
      // 193: iload 2
      // 194: ifne 1b4
      // 197: goto 19b
      // 19a: athrow
      // 19b: ifne 1b3
      // 19e: goto 1a2
      // 1a1: athrow
      // 1a2: iload 7
      // 1a4: iload 2
      // 1a5: ifne 1b7
      // 1a8: goto 1ac
      // 1ab: athrow
      // 1ac: ifne 1b5
      // 1af: goto 1b3
      // 1b2: athrow
      // 1b3: bipush 0
      // 1b4: ireturn
      // 1b5: iload 6
      // 1b7: iload 2
      // 1b8: ifne 1ce
      // 1bb: ifeq 1ca
      // 1be: goto 1c2
      // 1c1: athrow
      // 1c2: getstatic qeaa361f143ee4a0894bd168fd9b30c66/qf4ccf8f5435d4a78bdca4d6a018b578e/aabbabbbb.bbabb I
      // 1c5: i2l
      // 1c6: goto 1cf
      // 1c9: athrow
      // 1ca: aload 1
      // 1cb: invokevirtual qeaa361f143ee4a0894bd168fd9b30c66/qf4ccf8f5435d4a78bdca4d6a018b578e/bbbbaaaa.ab ()I
      // 1ce: i2l
      // 1cf: lstore 8
      // 1d1: lload 8
      // 1d3: iload 5
      // 1d5: i2l
      // 1d6: ladd
      // 1d7: lstore 10
      // 1d9: aload 0
      // 1da: getfield net/minecraft/class_310.field_1724 Lnet/minecraft/class_746;
      // 1dd: getfield net/minecraft/class_746.field_6012 I
      // 1e0: iload 2
      // 1e1: ifne 1fc
      // 1e4: i2l
      // 1e5: aload 1
      // 1e6: invokevirtual qeaa361f143ee4a0894bd168fd9b30c66/qf4ccf8f5435d4a78bdca4d6a018b578e/bbbbaaaa.ba ()I
      // 1e9: i2l
      // 1ea: lload 10
      // 1ec: invokestatic java/lang/Math.max (JJ)J
      // 1ef: lcmp
      // 1f0: iflt 1ff
      // 1f3: goto 1f7
      // 1f6: athrow
      // 1f7: bipush 1
      // 1f8: goto 1fc
      // 1fb: athrow
      // 1fc: goto 200
      // 1ff: bipush 0
      // 200: ireturn
      // 201: getstatic qeaa361f143ee4a0894bd168fd9b30c66/qf4ccf8f5435d4a78bdca4d6a018b578e/aabbabbbb.aaaaba Lqeaa361f143ee4a0894bd168fd9b30c66/qf4ccf8f5435d4a78bdca4d6a018b578e/bbbabbab;
      // 204: getstatic qeaa361f143ee4a0894bd168fd9b30c66/qf4ccf8f5435d4a78bdca4d6a018b578e/bbbabbab.aa Lqeaa361f143ee4a0894bd168fd9b30c66/qf4ccf8f5435d4a78bdca4d6a018b578e/bbbabbab;
      // 207: if_acmpeq 230
      // 20a: getstatic qeaa361f143ee4a0894bd168fd9b30c66/qf4ccf8f5435d4a78bdca4d6a018b578e/aabbabbbb.aaaab I
      // 20d: iload 2
      // 20e: ifne 22f
      // 211: goto 215
      // 214: athrow
      // 215: ifge 22e
      // 218: goto 21c
      // 21b: athrow
      // 21c: getstatic qeaa361f143ee4a0894bd168fd9b30c66/qf4ccf8f5435d4a78bdca4d6a018b578e/aabbabbbb.baaba Z
      // 21f: iload 2
      // 220: ifne 23f
      // 223: goto 227
      // 226: athrow
      // 227: ifeq 230
      // 22a: goto 22e
      // 22d: athrow
      // 22e: bipush 0
      // 22f: ireturn
      // 230: aload 0
      // 231: iload 2
      // 232: ifne 24b
      // 235: getfield net/minecraft/class_310.field_1724 Lnet/minecraft/class_746;
      // 238: getfield net/minecraft/class_746.field_6012 I
      // 23b: goto 23f
      // 23e: athrow
      // 23f: aload 1
      // 240: invokevirtual qeaa361f143ee4a0894bd168fd9b30c66/qf4ccf8f5435d4a78bdca4d6a018b578e/bbbbaaaa.ba ()I
      // 243: if_icmplt 26b
      // 246: aload 0
      // 247: goto 24b
      // 24a: athrow
      // 24b: getfield net/minecraft/class_310.field_1724 Lnet/minecraft/class_746;
      // 24e: invokevirtual net/minecraft/class_746.method_31548 ()Lnet/minecraft/class_1661;
      // 251: invokestatic qeaa361f143ee4a0894bd168fd9b30c66/qf4ccf8f5435d4a78bdca4d6a018b578e/aabbabbbb.abaabaa (Lnet/minecraft/class_1661;)I
      // 254: iload 2
      // 255: ifne 268
      // 258: aload 1
      // 259: invokevirtual qeaa361f143ee4a0894bd168fd9b30c66/qf4ccf8f5435d4a78bdca4d6a018b578e/bbbbaaaa.aa ()I
      // 25c: if_icmpne 26b
      // 25f: goto 263
      // 262: athrow
      // 263: bipush 1
      // 264: goto 268
      // 267: athrow
      // 268: goto 26c
      // 26b: bipush 0
      // 26c: ireturn
   }

   public static String abbbbb(class_306 param0) {
      // $VF: Couldn't be decompiled
      // Please report this to the Vineflower issue tracker, at https://github.com/Vineflower/vineflower/issues with a copy of the class file (if you have the rights to distribute it!)
      // java.lang.RuntimeException: parsing failure!
      //   at org.jetbrains.java.decompiler.modules.decompiler.decompose.DomHelper.parseGraph(DomHelper.java:211)
      //   at org.jetbrains.java.decompiler.main.rels.MethodProcessor.codeToJava(MethodProcessor.java:166)
      //
      // Bytecode:
      // 000: ldc_w 1407930603
      // 003: istore 7
      // 005: getstatic qeaa361f143ee4a0894bd168fd9b30c66/qf4ccf8f5435d4a78bdca4d6a018b578e/baaabbaa.bba I
      // 008: istore 1
      // 009: aload 0
      // 00a: iload 1
      // 00b: ifne 039
      // 00e: invokestatic qeaa361f143ee4a0894bd168fd9b30c66/qf4ccf8f5435d4a78bdca4d6a018b578e/aabbabbbb.bbaaaaa (Lnet/minecraft/class_3675$class_306;)Z
      // 011: ifeq 038
      // 014: goto 018
      // 017: athrow
      // 018: ldc_w 604047325
      // 01b: iload 7
      // 01d: ldc_w 1037190973
      // 020: ixor
      // 021: invokestatic qeaa361f143ee4a0894bd168fd9b30c66/qf4ccf8f5435d4a78bdca4d6a018b578e/aabbabbbb.b (II)I
      // 024: ldc_w 604047324
      // 027: iload 7
      // 029: ldc_w 881468073
      // 02c: ixor
      // 02d: invokestatic qeaa361f143ee4a0894bd168fd9b30c66/qf4ccf8f5435d4a78bdca4d6a018b578e/aabbabbbb.b (II)I
      // 030: invokestatic qeaa361f143ee4a0894bd168fd9b30c66/qf4ccf8f5435d4a78bdca4d6a018b578e/aabbabbbb.bbaabaa (II)Ljava/lang/String;
      // 033: invokestatic qeaa361f143ee4a0894bd168fd9b30c66/qf4ccf8f5435d4a78bdca4d6a018b578e/aabbaaaba.abba (Ljava/lang/String;)Ljava/lang/String;
      // 036: areturn
      // 037: athrow
      // 038: aload 0
      // 039: invokevirtual net/minecraft/class_3675$class_306.method_27445 ()Lnet/minecraft/class_2561;
      // 03c: invokeinterface net/minecraft/class_2561.getString ()Ljava/lang/String; 1
      // 041: astore 2
      // 042: aload 2
      // 043: iload 1
      // 044: ifne 04f
      // 047: ifnull 069
      // 04a: goto 04e
      // 04d: athrow
      // 04e: aload 2
      // 04f: iload 1
      // 050: ifne 068
      // 053: invokevirtual java/lang/String.isBlank ()Z
      // 056: ifne 069
      // 059: goto 05d
      // 05c: athrow
      // 05d: aload 2
      // 05e: getstatic java/util/Locale.ROOT Ljava/util/Locale;
      // 061: invokevirtual java/lang/String.toUpperCase (Ljava/util/Locale;)Ljava/lang/String;
      // 064: goto 068
      // 067: athrow
      // 068: areturn
      // 069: aload 0
      // 06a: invokevirtual net/minecraft/class_3675$class_306.method_1442 ()Lnet/minecraft/class_3675$class_307;
      // 06d: iload 1
      // 06e: ifne 146
      // 071: getstatic net/minecraft/class_3675$class_307.field_1672 Lnet/minecraft/class_3675$class_307;
      // 074: if_acmpne 13a
      // 077: goto 07b
      // 07a: athrow
      // 07b: aload 0
      // 07c: invokevirtual net/minecraft/class_3675$class_306.method_1444 ()I
      // 07f: tableswitch 126 0 2 26 60 93
      // 098: athrow
      // 099: ldc_w 604047327
      // 09c: iload 7
      // 09e: ldc_w -760168831
      // 0a1: ixor
      // 0a2: invokestatic qeaa361f143ee4a0894bd168fd9b30c66/qf4ccf8f5435d4a78bdca4d6a018b578e/aabbabbbb.b (II)I
      // 0a5: ldc_w 604047326
      // 0a8: iload 7
      // 0aa: ldc_w -1001757155
      // 0ad: ixor
      // 0ae: invokestatic qeaa361f143ee4a0894bd168fd9b30c66/qf4ccf8f5435d4a78bdca4d6a018b578e/aabbabbbb.b (II)I
      // 0b1: invokestatic qeaa361f143ee4a0894bd168fd9b30c66/qf4ccf8f5435d4a78bdca4d6a018b578e/aabbabbbb.bbaabaa (II)Ljava/lang/String;
      // 0b4: invokestatic qeaa361f143ee4a0894bd168fd9b30c66/qf4ccf8f5435d4a78bdca4d6a018b578e/aabbaaaba.abba (Ljava/lang/String;)Ljava/lang/String;
      // 0b7: goto 139
      // 0ba: athrow
      // 0bb: ldc_w 604047313
      // 0be: iload 7
      // 0c0: ldc_w -863422019
      // 0c3: ixor
      // 0c4: invokestatic qeaa361f143ee4a0894bd168fd9b30c66/qf4ccf8f5435d4a78bdca4d6a018b578e/aabbabbbb.b (II)I
      // 0c7: ldc_w 604047312
      // 0ca: iload 7
      // 0cc: ldc_w -96892125
      // 0cf: ixor
      // 0d0: invokestatic qeaa361f143ee4a0894bd168fd9b30c66/qf4ccf8f5435d4a78bdca4d6a018b578e/aabbabbbb.b (II)I
      // 0d3: invokestatic qeaa361f143ee4a0894bd168fd9b30c66/qf4ccf8f5435d4a78bdca4d6a018b578e/aabbabbbb.bbaabaa (II)Ljava/lang/String;
      // 0d6: invokestatic qeaa361f143ee4a0894bd168fd9b30c66/qf4ccf8f5435d4a78bdca4d6a018b578e/aabbaaaba.abba (Ljava/lang/String;)Ljava/lang/String;
      // 0d9: goto 139
      // 0dc: ldc_w 604047315
      // 0df: iload 7
      // 0e1: ldc_w 1203427425
      // 0e4: ixor
      // 0e5: invokestatic qeaa361f143ee4a0894bd168fd9b30c66/qf4ccf8f5435d4a78bdca4d6a018b578e/aabbabbbb.b (II)I
      // 0e8: ldc_w 604047314
      // 0eb: iload 7
      // 0ed: ldc_w -621550186
      // 0f0: ixor
      // 0f1: invokestatic qeaa361f143ee4a0894bd168fd9b30c66/qf4ccf8f5435d4a78bdca4d6a018b578e/aabbabbbb.b (II)I
      // 0f4: invokestatic qeaa361f143ee4a0894bd168fd9b30c66/qf4ccf8f5435d4a78bdca4d6a018b578e/aabbabbbb.bbaabaa (II)Ljava/lang/String;
      // 0f7: invokestatic qeaa361f143ee4a0894bd168fd9b30c66/qf4ccf8f5435d4a78bdca4d6a018b578e/aabbaaaba.abba (Ljava/lang/String;)Ljava/lang/String;
      // 0fa: goto 139
      // 0fd: ldc_w 604047317
      // 100: iload 7
      // 102: ldc_w 1297245020
      // 105: ixor
      // 106: invokestatic qeaa361f143ee4a0894bd168fd9b30c66/qf4ccf8f5435d4a78bdca4d6a018b578e/aabbabbbb.b (II)I
      // 109: ldc_w 604047316
      // 10c: iload 7
      // 10e: ldc_w -729570374
      // 111: ixor
      // 112: invokestatic qeaa361f143ee4a0894bd168fd9b30c66/qf4ccf8f5435d4a78bdca4d6a018b578e/aabbabbbb.b (II)I
      // 115: invokestatic qeaa361f143ee4a0894bd168fd9b30c66/qf4ccf8f5435d4a78bdca4d6a018b578e/aabbabbbb.bbaabaa (II)Ljava/lang/String;
      // 118: invokestatic qeaa361f143ee4a0894bd168fd9b30c66/qf4ccf8f5435d4a78bdca4d6a018b578e/aabbaaaba.abba (Ljava/lang/String;)Ljava/lang/String;
      // 11b: aload 0
      // 11c: invokevirtual net/minecraft/class_3675$class_306.method_1444 ()I
      // 11f: bipush 1
      // 120: iadd
      // 121: istore 5
      // 123: astore 4
      // 125: new java/lang/StringBuilder
      // 128: dup
      // 129: invokespecial java/lang/StringBuilder.<init> ()V
      // 12c: aload 4
      // 12e: invokevirtual java/lang/StringBuilder.append (Ljava/lang/Object;)Ljava/lang/StringBuilder;
      // 131: iload 5
      // 133: invokevirtual java/lang/StringBuilder.append (I)Ljava/lang/StringBuilder;
      // 136: invokevirtual java/lang/StringBuilder.toString ()Ljava/lang/String;
      // 139: areturn
      // 13a: aload 0
      // 13b: iload 1
      // 13c: ifne 159
      // 13f: invokevirtual net/minecraft/class_3675$class_306.method_1442 ()Lnet/minecraft/class_3675$class_307;
      // 142: goto 146
      // 145: athrow
      // 146: getstatic net/minecraft/class_3675$class_307.field_1671 Lnet/minecraft/class_3675$class_307;
      // 149: if_acmpne 158
      // 14c: bipush -1
      // 14d: aload 0
      // 14e: invokevirtual net/minecraft/class_3675$class_306.method_1444 ()I
      // 151: invokestatic org/lwjgl/glfw/GLFW.glfwGetKeyName (II)Ljava/lang/String;
      // 154: goto 160
      // 157: athrow
      // 158: aload 0
      // 159: invokevirtual net/minecraft/class_3675$class_306.method_1444 ()I
      // 15c: bipush 0
      // 15d: invokestatic org/lwjgl/glfw/GLFW.glfwGetKeyName (II)Ljava/lang/String;
      // 160: astore 3
      // 161: aload 3
      // 162: iload 1
      // 163: ifne 196
      // 166: ifnull 178
      // 169: goto 16d
      // 16c: athrow
      // 16d: aload 3
      // 16e: getstatic java/util/Locale.ROOT Ljava/util/Locale;
      // 171: invokevirtual java/lang/String.toUpperCase (Ljava/util/Locale;)Ljava/lang/String;
      // 174: goto 1b2
      // 177: athrow
      // 178: ldc_w 604047319
      // 17b: iload 7
      // 17d: ldc_w -998033068
      // 180: ixor
      // 181: invokestatic qeaa361f143ee4a0894bd168fd9b30c66/qf4ccf8f5435d4a78bdca4d6a018b578e/aabbabbbb.b (II)I
      // 184: ldc_w 604047318
      // 187: iload 7
      // 189: ldc_w -2015220630
      // 18c: ixor
      // 18d: invokestatic qeaa361f143ee4a0894bd168fd9b30c66/qf4ccf8f5435d4a78bdca4d6a018b578e/aabbabbbb.b (II)I
      // 190: invokestatic qeaa361f143ee4a0894bd168fd9b30c66/qf4ccf8f5435d4a78bdca4d6a018b578e/aabbabbbb.bbaabaa (II)Ljava/lang/String;
      // 193: invokestatic qeaa361f143ee4a0894bd168fd9b30c66/qf4ccf8f5435d4a78bdca4d6a018b578e/aabbaaaba.abba (Ljava/lang/String;)Ljava/lang/String;
      // 196: aload 0
      // 197: invokevirtual net/minecraft/class_3675$class_306.method_1444 ()I
      // 19a: istore 6
      // 19c: astore 5
      // 19e: new java/lang/StringBuilder
      // 1a1: dup
      // 1a2: invokespecial java/lang/StringBuilder.<init> ()V
      // 1a5: aload 5
      // 1a7: invokevirtual java/lang/StringBuilder.append (Ljava/lang/Object;)Ljava/lang/StringBuilder;
      // 1aa: iload 6
      // 1ac: invokevirtual java/lang/StringBuilder.append (I)Ljava/lang/StringBuilder;
      // 1af: invokevirtual java/lang/StringBuilder.toString ()Ljava/lang/String;
      // 1b2: areturn
   }

   public static void baaaaa(class_310 param0) {
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
      // 06: ifne 11
      // 09: ifnull 83
      // 0c: goto 10
      // 0f: athrow
      // 10: aload 0
      // 11: iload 1
      // 12: ifne 24
      // 15: getfield net/minecraft/class_310.field_1690 Lnet/minecraft/class_315;
      // 18: ifnull 83
      // 1b: goto 1f
      // 1e: athrow
      // 1f: aload 0
      // 20: goto 24
      // 23: athrow
      // 24: iload 1
      // 25: ifne 3a
      // 28: getfield net/minecraft/class_310.field_1690 Lnet/minecraft/class_315;
      // 2b: getfield net/minecraft/class_315.field_1886 Lnet/minecraft/class_304;
      // 2e: ifnull 83
      // 31: goto 35
      // 34: athrow
      // 35: aload 0
      // 36: goto 3a
      // 39: athrow
      // 3a: iload 1
      // 3b: ifne 50
      // 3e: getfield net/minecraft/class_310.field_1690 Lnet/minecraft/class_315;
      // 41: getfield net/minecraft/class_315.field_1904 Lnet/minecraft/class_304;
      // 44: ifnull 83
      // 47: goto 4b
      // 4a: athrow
      // 4b: aload 0
      // 4c: goto 50
      // 4f: athrow
      // 50: iload 1
      // 51: ifne 6a
      // 54: aload 0
      // 55: getfield net/minecraft/class_310.field_1690 Lnet/minecraft/class_315;
      // 58: getfield net/minecraft/class_315.field_1886 Lnet/minecraft/class_304;
      // 5b: invokestatic qeaa361f143ee4a0894bd168fd9b30c66/qf4ccf8f5435d4a78bdca4d6a018b578e/aabbabbbb.aaab (Lnet/minecraft/class_310;Lnet/minecraft/class_304;)Z
      // 5e: ifeq 83
      // 61: goto 65
      // 64: athrow
      // 65: aload 0
      // 66: goto 6a
      // 69: athrow
      // 6a: aload 0
      // 6b: getfield net/minecraft/class_310.field_1690 Lnet/minecraft/class_315;
      // 6e: getfield net/minecraft/class_315.field_1904 Lnet/minecraft/class_304;
      // 71: invokestatic qeaa361f143ee4a0894bd168fd9b30c66/qf4ccf8f5435d4a78bdca4d6a018b578e/aabbabbbb.aaab (Lnet/minecraft/class_310;Lnet/minecraft/class_304;)Z
      // 74: iload 1
      // 75: ifne 80
      // 78: ifeq 83
      // 7b: goto 7f
      // 7e: athrow
      // 7f: bipush 1
      // 80: goto 84
      // 83: bipush 0
      // 84: putstatic qeaa361f143ee4a0894bd168fd9b30c66/qf4ccf8f5435d4a78bdca4d6a018b578e/aabbabbbb.ba Z
      // 87: return
   }

   public static boolean baaaab(class_1799 param0) {
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
      // 06: ifne 11
      // 09: ifnull 1f
      // 0c: goto 10
      // 0f: athrow
      // 10: aload 0
      // 11: invokevirtual net/minecraft/class_1799.method_7960 ()Z
      // 14: iload 1
      // 15: ifne 20
      // 18: ifeq 21
      // 1b: goto 1f
      // 1e: athrow
      // 1f: bipush 0
      // 20: ireturn
      // 21: invokestatic qeaa361f143ee4a0894bd168fd9b30c66/qf4ccf8f5435d4a78bdca4d6a018b578e/aabbabbbb.aababba ()Lnet/minecraft/class_9331;
      // 24: astore 2
      // 25: aload 2
      // 26: iload 1
      // 27: ifne 35
      // 2a: ifnonnull 34
      // 2d: goto 31
      // 30: athrow
      // 31: bipush 0
      // 32: ireturn
      // 33: athrow
      // 34: aload 2
      // 35: astore 3
      // 36: aload 0
      // 37: aload 3
      // 38: invokevirtual net/minecraft/class_1799.method_58694 (Lnet/minecraft/class_9331;)Ljava/lang/Object;
      // 3b: checkcast net/minecraft/class_10590
      // 3e: astore 4
      // 40: aload 4
      // 42: iload 1
      // 43: ifne 4f
      // 46: ifnull 63
      // 49: goto 4d
      // 4c: athrow
      // 4d: aload 4
      // 4f: invokevirtual net/minecraft/class_10590.comp_3602 ()F
      // 52: fconst_0
      // 53: fcmpl
      // 54: iload 1
      // 55: ifne 60
      // 58: ifle 63
      // 5b: goto 5f
      // 5e: athrow
      // 5f: bipush 1
      // 60: goto 64
      // 63: bipush 0
      // 64: ireturn
   }

   private static boolean baaaba(class_310 param0) {
      // $VF: Couldn't be decompiled
      // Please report this to the Vineflower issue tracker, at https://github.com/Vineflower/vineflower/issues with a copy of the class file (if you have the rights to distribute it!)
      // java.lang.NullPointerException: Cannot invoke "org.jetbrains.java.decompiler.code.cfg.ExceptionRangeCFG.isCircular()" because "range" is null
      //   at org.jetbrains.java.decompiler.modules.decompiler.decompose.DomHelper.graphToStatement(DomHelper.java:84)
      //   at org.jetbrains.java.decompiler.modules.decompiler.decompose.DomHelper.parseGraph(DomHelper.java:203)
      //   at org.jetbrains.java.decompiler.main.rels.MethodProcessor.codeToJava(MethodProcessor.java:166)
      //
      // Bytecode:
      // 00: getstatic qeaa361f143ee4a0894bd168fd9b30c66/qf4ccf8f5435d4a78bdca4d6a018b578e/baaabbaa.bba I
      // 03: istore 1
      // 04: aload 0
      // 05: iload 1
      // 06: ifne 11
      // 09: ifnull 2d
      // 0c: goto 10
      // 0f: athrow
      // 10: aload 0
      // 11: iload 1
      // 12: ifne 24
      // 15: getfield net/minecraft/class_310.field_1690 Lnet/minecraft/class_315;
      // 18: ifnull 2d
      // 1b: goto 1f
      // 1e: athrow
      // 1f: aload 0
      // 20: goto 24
      // 23: athrow
      // 24: getfield net/minecraft/class_310.field_1690 Lnet/minecraft/class_315;
      // 27: getfield net/minecraft/class_315.field_1852 [Lnet/minecraft/class_304;
      // 2a: ifnonnull 30
      // 2d: bipush 0
      // 2e: ireturn
      // 2f: athrow
      // 30: invokestatic qeaa361f143ee4a0894bd168fd9b30c66/qf4ccf8f5435d4a78bdca4d6a018b578e/abaaaaaba.aaaaa ()Lqeaa361f143ee4a0894bd168fd9b30c66/qf4ccf8f5435d4a78bdca4d6a018b578e/abaaaaaba;
      // 33: astore 2
      // 34: aload 0
      // 35: getfield net/minecraft/class_310.field_1690 Lnet/minecraft/class_315;
      // 38: getfield net/minecraft/class_315.field_1852 [Lnet/minecraft/class_304;
      // 3b: astore 3
      // 3c: aload 3
      // 3d: arraylength
      // 3e: istore 4
      // 40: bipush 0
      // 41: istore 5
      // 43: iload 5
      // 45: iload 4
      // 47: if_icmpge f1
      // 4a: aload 3
      // 4b: iload 5
      // 4d: aaload
      // 4e: astore 6
      // 50: iload 1
      // 51: ifne ed
      // 54: aload 6
      // 56: ifnull ea
      // 59: goto 5d
      // 5c: athrow
      // 5d: aload 6
      // 5f: iload 1
      // 60: ifne 77
      // 63: goto 67
      // 66: athrow
      // 67: invokevirtual net/minecraft/class_304.method_1434 ()Z
      // 6a: ifne a2
      // 6d: goto 71
      // 70: athrow
      // 71: aload 6
      // 73: goto 77
      // 76: athrow
      // 77: iload 1
      // 78: ifne 8b
      // 7b: instanceof qeaa361f143ee4a0894bd168fd9b30c66/q9fca77a8c4f94f01ae294010b0bee919/abbaababb
      // 7e: ifeq ea
      // 81: goto 85
      // 84: athrow
      // 85: aload 6
      // 87: goto 8b
      // 8a: athrow
      // 8b: checkcast qeaa361f143ee4a0894bd168fd9b30c66/q9fca77a8c4f94f01ae294010b0bee919/abbaababb
      // 8e: astore 7
      // 90: iload 1
      // 91: ifne ed
      // 94: aload 7
      // 96: invokeinterface qeaa361f143ee4a0894bd168fd9b30c66/q9fca77a8c4f94f01ae294010b0bee919/abbaababb.yj$getTimesPressed ()I 1
      // 9b: ifle ea
      // 9e: goto a2
      // a1: athrow
      // a2: aload 2
      // a3: iload 1
      // a4: ifne b3
      // a7: goto ab
      // aa: athrow
      // ab: ifnull e4
      // ae: goto b2
      // b1: athrow
      // b2: aload 2
      // b3: iload 1
      // b4: ifne c6
      // b7: invokevirtual qeaa361f143ee4a0894bd168fd9b30c66/qf4ccf8f5435d4a78bdca4d6a018b578e/abaaaaaba.aaba ()Lqeaa361f143ee4a0894bd168fd9b30c66/qf4ccf8f5435d4a78bdca4d6a018b578e/babbaba;
      // ba: ifnull e4
      // bd: goto c1
      // c0: athrow
      // c1: aload 2
      // c2: goto c6
      // c5: athrow
      // c6: invokevirtual qeaa361f143ee4a0894bd168fd9b30c66/qf4ccf8f5435d4a78bdca4d6a018b578e/abaaaaaba.aaba ()Lqeaa361f143ee4a0894bd168fd9b30c66/qf4ccf8f5435d4a78bdca4d6a018b578e/babbaba;
      // c9: aload 6
      // cb: invokestatic qeaa361f143ee4a0894bd168fd9b30c66/qf4ccf8f5435d4a78bdca4d6a018b578e/aabbabbbb.abbaabb (Lnet/minecraft/class_304;)Lnet/minecraft/class_3675$class_306;
      // ce: invokevirtual qeaa361f143ee4a0894bd168fd9b30c66/qf4ccf8f5435d4a78bdca4d6a018b578e/babbaba.abbaaaa (Lnet/minecraft/class_3675$class_306;)Z
      // d1: iload 1
      // d2: ifne e9
      // d5: ifeq e4
      // d8: goto dc
      // db: athrow
      // dc: iload 1
      // dd: ifeq ea
      // e0: goto e4
      // e3: athrow
      // e4: bipush 1
      // e5: goto e9
      // e8: athrow
      // e9: ireturn
      // ea: iinc 5 1
      // ed: iload 1
      // ee: ifeq 43
      // f1: bipush 0
      // f2: ireturn
   }

   public static boolean baaabb(class_310 var0) {
      aabbaba(var0);
      return babbaab(var0);
   }

   public static boolean baabaa() {
      // $VF: Couldn't be decompiled
      // Please report this to the Vineflower issue tracker, at https://github.com/Vineflower/vineflower/issues with a copy of the class file (if you have the rights to distribute it!)
      // java.lang.RuntimeException: parsing failure!
      //   at org.jetbrains.java.decompiler.modules.decompiler.decompose.DomHelper.parseGraph(DomHelper.java:211)
      //   at org.jetbrains.java.decompiler.main.rels.MethodProcessor.codeToJava(MethodProcessor.java:166)
      //
      // Bytecode:
      // 00: getstatic qeaa361f143ee4a0894bd168fd9b30c66/qf4ccf8f5435d4a78bdca4d6a018b578e/baaabbaa.bba I
      // 03: istore 0
      // 04: getstatic qeaa361f143ee4a0894bd168fd9b30c66/qf4ccf8f5435d4a78bdca4d6a018b578e/aabbabbbb.bbbaa I
      // 07: iload 0
      // 08: ifne 21
      // 0b: ifgt 1c
      // 0e: goto 12
      // 11: athrow
      // 12: getstatic qeaa361f143ee4a0894bd168fd9b30c66/qf4ccf8f5435d4a78bdca4d6a018b578e/aabbabbbb.baab Lqeaa361f143ee4a0894bd168fd9b30c66/qf4ccf8f5435d4a78bdca4d6a018b578e/bbaaba;
      // 15: ifnull 24
      // 18: goto 1c
      // 1b: athrow
      // 1c: bipush 1
      // 1d: goto 21
      // 20: athrow
      // 21: goto 25
      // 24: bipush 0
      // 25: ireturn
   }

   public static void baabab(class_2596 param0) {
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
      // 06: ifne 18
      // 09: instanceof net/minecraft/class_2868
      // 0c: ifeq e0
      // 0f: goto 13
      // 12: athrow
      // 13: aload 0
      // 14: goto 18
      // 17: athrow
      // 18: checkcast net/minecraft/class_2868
      // 1b: astore 2
      // 1c: aload 2
      // 1d: invokevirtual net/minecraft/class_2868.method_12442 ()I
      // 20: istore 3
      // 21: iload 3
      // 22: putstatic qeaa361f143ee4a0894bd168fd9b30c66/qf4ccf8f5435d4a78bdca4d6a018b578e/aabbabbbb.abbba I
      // 25: invokestatic net/minecraft/class_310.method_1551 ()Lnet/minecraft/class_310;
      // 28: astore 4
      // 2a: aload 4
      // 2c: iload 1
      // 2d: ifne 39
      // 30: ifnull e0
      // 33: goto 37
      // 36: athrow
      // 37: aload 4
      // 39: iload 1
      // 3a: ifne 4d
      // 3d: getfield net/minecraft/class_310.field_1724 Lnet/minecraft/class_746;
      // 40: ifnull e0
      // 43: goto 47
      // 46: athrow
      // 47: aload 4
      // 49: goto 4d
      // 4c: athrow
      // 4d: getfield net/minecraft/class_310.field_1724 Lnet/minecraft/class_746;
      // 50: getfield net/minecraft/class_746.field_6012 I
      // 53: putstatic qeaa361f143ee4a0894bd168fd9b30c66/qf4ccf8f5435d4a78bdca4d6a018b578e/aabbabbbb.bbabb I
      // 56: invokestatic java/lang/System.nanoTime ()J
      // 59: putstatic qeaa361f143ee4a0894bd168fd9b30c66/qf4ccf8f5435d4a78bdca4d6a018b578e/aabbabbbb.aaaaa J
      // 5c: invokestatic qeaa361f143ee4a0894bd168fd9b30c66/qf4ccf8f5435d4a78bdca4d6a018b578e/abaaaaaba.aaaaa ()Lqeaa361f143ee4a0894bd168fd9b30c66/qf4ccf8f5435d4a78bdca4d6a018b578e/abaaaaaba;
      // 5f: astore 5
      // 61: invokestatic qeaa361f143ee4a0894bd168fd9b30c66/qf4ccf8f5435d4a78bdca4d6a018b578e/aabbabbbb.a ()Z
      // 64: ifeq e0
      // 67: aload 5
      // 69: iload 1
      // 6a: ifne 82
      // 6d: goto 71
      // 70: athrow
      // 71: ifnull e0
      // 74: goto 78
      // 77: athrow
      // 78: aload 5
      // 7a: iload 1
      // 7b: ifne 8e
      // 7e: goto 82
      // 81: athrow
      // 82: invokevirtual qeaa361f143ee4a0894bd168fd9b30c66/qf4ccf8f5435d4a78bdca4d6a018b578e/abaaaaaba.aaba ()Lqeaa361f143ee4a0894bd168fd9b30c66/qf4ccf8f5435d4a78bdca4d6a018b578e/babbaba;
      // 85: ifnull e0
      // 88: aload 5
      // 8a: goto 8e
      // 8d: athrow
      // 8e: invokevirtual qeaa361f143ee4a0894bd168fd9b30c66/qf4ccf8f5435d4a78bdca4d6a018b578e/abaaaaaba.aaba ()Lqeaa361f143ee4a0894bd168fd9b30c66/qf4ccf8f5435d4a78bdca4d6a018b578e/babbaba;
      // 91: iload 1
      // 92: ifne a8
      // 95: invokevirtual qeaa361f143ee4a0894bd168fd9b30c66/qf4ccf8f5435d4a78bdca4d6a018b578e/babbaba.babba ()Lqeaa361f143ee4a0894bd168fd9b30c66/qf4ccf8f5435d4a78bdca4d6a018b578e/abbbabbaa;
      // 98: ifnull e0
      // 9b: goto 9f
      // 9e: athrow
      // 9f: aload 5
      // a1: invokevirtual qeaa361f143ee4a0894bd168fd9b30c66/qf4ccf8f5435d4a78bdca4d6a018b578e/abaaaaaba.aaba ()Lqeaa361f143ee4a0894bd168fd9b30c66/qf4ccf8f5435d4a78bdca4d6a018b578e/babbaba;
      // a4: goto a8
      // a7: athrow
      // a8: invokevirtual qeaa361f143ee4a0894bd168fd9b30c66/qf4ccf8f5435d4a78bdca4d6a018b578e/babbaba.babba ()Lqeaa361f143ee4a0894bd168fd9b30c66/qf4ccf8f5435d4a78bdca4d6a018b578e/abbbabbaa;
      // ab: invokevirtual qeaa361f143ee4a0894bd168fd9b30c66/qf4ccf8f5435d4a78bdca4d6a018b578e/abbbabbaa.abb ()Z
      // ae: iload 1
      // af: ifne c8
      // b2: ifeq e0
      // b5: goto b9
      // b8: athrow
      // b9: aload 4
      // bb: getfield net/minecraft/class_310.field_1724 Lnet/minecraft/class_746;
      // be: invokevirtual net/minecraft/class_746.method_31548 ()Lnet/minecraft/class_1661;
      // c1: invokestatic qeaa361f143ee4a0894bd168fd9b30c66/qf4ccf8f5435d4a78bdca4d6a018b578e/bbbabaa.aaaab (Lnet/minecraft/class_1661;)I
      // c4: goto c8
      // c7: athrow
      // c8: istore 6
      // ca: iload 3
      // cb: iload 6
      // cd: if_icmpeq e0
      // d0: aload 5
      // d2: invokevirtual qeaa361f143ee4a0894bd168fd9b30c66/qf4ccf8f5435d4a78bdca4d6a018b578e/abaaaaaba.aaba ()Lqeaa361f143ee4a0894bd168fd9b30c66/qf4ccf8f5435d4a78bdca4d6a018b578e/babbaba;
      // d5: invokevirtual qeaa361f143ee4a0894bd168fd9b30c66/qf4ccf8f5435d4a78bdca4d6a018b578e/babbaba.babba ()Lqeaa361f143ee4a0894bd168fd9b30c66/qf4ccf8f5435d4a78bdca4d6a018b578e/abbbabbaa;
      // d8: iload 3
      // d9: invokevirtual qeaa361f143ee4a0894bd168fd9b30c66/qf4ccf8f5435d4a78bdca4d6a018b578e/abbbabbaa.bb (I)V
      // dc: goto e0
      // df: athrow
      // e0: return
   }

   public static int baabba(class_310 param0) {
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
      // 06: ifne 16
      // 09: ifnonnull 15
      // 0c: goto 10
      // 0f: athrow
      // 10: bipush 0
      // 11: goto 19
      // 14: athrow
      // 15: aload 0
      // 16: invokestatic qeaa361f143ee4a0894bd168fd9b30c66/qf4ccf8f5435d4a78bdca4d6a018b578e/bbbabaa.abb (Lnet/minecraft/class_310;)I
      // 19: ireturn
   }

   public static boolean baabbb(class_310 param0, Object param1, int param2, class_3966 param3, aaaaabbb param4) {
      // $VF: Couldn't be decompiled
      // Please report this to the Vineflower issue tracker, at https://github.com/Vineflower/vineflower/issues with a copy of the class file (if you have the rights to distribute it!)
      // java.lang.RuntimeException: parsing failure!
      //   at org.jetbrains.java.decompiler.modules.decompiler.decompose.DomHelper.parseGraph(DomHelper.java:211)
      //   at org.jetbrains.java.decompiler.main.rels.MethodProcessor.codeToJava(MethodProcessor.java:166)
      //
      // Bytecode:
      // 000: getstatic qeaa361f143ee4a0894bd168fd9b30c66/qf4ccf8f5435d4a78bdca4d6a018b578e/baaabbaa.bba I
      // 003: istore 5
      // 005: aload 4
      // 007: iload 5
      // 009: ifne 015
      // 00c: ifnull 0fb
      // 00f: goto 013
      // 012: athrow
      // 013: aload 4
      // 015: getstatic qeaa361f143ee4a0894bd168fd9b30c66/qf4ccf8f5435d4a78bdca4d6a018b578e/aaaaabbb.a Lqeaa361f143ee4a0894bd168fd9b30c66/qf4ccf8f5435d4a78bdca4d6a018b578e/aaaaabbb;
      // 018: if_acmpeq 0fb
      // 01b: aload 0
      // 01c: iload 5
      // 01e: ifne 02d
      // 021: goto 025
      // 024: athrow
      // 025: ifnull 0fb
      // 028: goto 02c
      // 02b: athrow
      // 02c: aload 0
      // 02d: getfield net/minecraft/class_310.field_1724 Lnet/minecraft/class_746;
      // 030: ifnull 0fb
      // 033: aload 3
      // 034: iload 5
      // 036: ifne 045
      // 039: goto 03d
      // 03c: athrow
      // 03d: ifnull 0fb
      // 040: goto 044
      // 043: athrow
      // 044: aload 3
      // 045: invokevirtual net/minecraft/class_3966.method_17782 ()Lnet/minecraft/class_1297;
      // 048: ifnull 0fb
      // 04b: iload 2
      // 04c: iload 5
      // 04e: ifne 0fc
      // 051: goto 055
      // 054: athrow
      // 055: iflt 0fb
      // 058: goto 05c
      // 05b: athrow
      // 05c: iload 2
      // 05d: iload 5
      // 05f: ifne 0fc
      // 062: goto 066
      // 065: athrow
      // 066: ldc_w 604047273
      // 069: ldc_w -2106606225
      // 06c: ldc_w -1835061395
      // 06f: ixor
      // 070: invokestatic qeaa361f143ee4a0894bd168fd9b30c66/qf4ccf8f5435d4a78bdca4d6a018b578e/aabbabbbb.b (II)I
      // 073: ldc2_w 6146930655705273313
      // 076: invokestatic qeaa361f143ee4a0894bd168fd9b30c66/qf4ccf8f5435d4a78bdca4d6a018b578e/aabbabbbb.aaaaa (IJ)I
      // 079: if_icmpgt 0fb
      // 07c: goto 080
      // 07f: athrow
      // 080: aload 0
      // 081: getfield net/minecraft/class_310.field_1724 Lnet/minecraft/class_746;
      // 084: invokevirtual net/minecraft/class_746.method_31548 ()Lnet/minecraft/class_1661;
      // 087: iload 2
      // 088: invokevirtual net/minecraft/class_1661.method_5438 (I)Lnet/minecraft/class_1799;
      // 08b: invokevirtual net/minecraft/class_1799.method_7909 ()Lnet/minecraft/class_1792;
      // 08e: instanceof net/minecraft/class_9362
      // 091: iload 5
      // 093: ifne 0fc
      // 096: goto 09a
      // 099: athrow
      // 09a: ifeq 0fb
      // 09d: goto 0a1
      // 0a0: athrow
      // 0a1: aload 0
      // 0a2: getfield net/minecraft/class_310.field_1724 Lnet/minecraft/class_746;
      // 0a5: getfield net/minecraft/class_746.field_6017 D
      // 0a8: ldc2_w 1.5
      // 0ab: dcmpl
      // 0ac: iload 5
      // 0ae: ifne 0fc
      // 0b1: goto 0b5
      // 0b4: athrow
      // 0b5: ifle 0fb
      // 0b8: goto 0bc
      // 0bb: athrow
      // 0bc: aload 0
      // 0bd: getfield net/minecraft/class_310.field_1724 Lnet/minecraft/class_746;
      // 0c0: invokevirtual net/minecraft/class_746.method_6128 ()Z
      // 0c3: iload 5
      // 0c5: ifne 0fc
      // 0c8: goto 0cc
      // 0cb: athrow
      // 0cc: ifne 0fb
      // 0cf: goto 0d3
      // 0d2: athrow
      // 0d3: aload 4
      // 0d5: aload 0
      // 0d6: aload 3
      // 0d7: invokevirtual net/minecraft/class_3966.method_17782 ()Lnet/minecraft/class_1297;
      // 0da: aload 0
      // 0db: ldc2_w 3.0
      // 0de: invokestatic qeaa361f143ee4a0894bd168fd9b30c66/qf4ccf8f5435d4a78bdca4d6a018b578e/ababaabab.aaa (Lnet/minecraft/class_310;D)D
      // 0e1: ldc2_w 0.01
      // 0e4: dsub
      // 0e5: invokestatic qeaa361f143ee4a0894bd168fd9b30c66/qf4ccf8f5435d4a78bdca4d6a018b578e/aabbabbbb.aaaa (Lnet/minecraft/class_310;Lnet/minecraft/class_1297;D)Z
      // 0e8: invokevirtual qeaa361f143ee4a0894bd168fd9b30c66/qf4ccf8f5435d4a78bdca4d6a018b578e/aaaaabbb.aa (Z)Z
      // 0eb: iload 5
      // 0ed: ifne 10b
      // 0f0: goto 0f4
      // 0f3: athrow
      // 0f4: ifne 0fd
      // 0f7: goto 0fb
      // 0fa: athrow
      // 0fb: bipush 0
      // 0fc: ireturn
      // 0fd: aload 0
      // 0fe: aload 1
      // 0ff: iload 2
      // 100: aload 0
      // 101: aload 3
      // 102: aload 1
      // 103: invokedynamic getAsBoolean (Lnet/minecraft/class_310;Lnet/minecraft/class_3966;Ljava/lang/Object;)Ljava/util/function/BooleanSupplier; bsm=java/lang/invoke/LambdaMetafactory.metafactory (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;Ljava/lang/invoke/MethodType;Ljava/lang/invoke/MethodHandle;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[ ()Z, qeaa361f143ee4a0894bd168fd9b30c66/qf4ccf8f5435d4a78bdca4d6a018b578e/aabbabbbb.babaaab (Lnet/minecraft/class_310;Lnet/minecraft/class_3966;Ljava/lang/Object;)Z, ()Z ]
      // 108: invokestatic qeaa361f143ee4a0894bd168fd9b30c66/qf4ccf8f5435d4a78bdca4d6a018b578e/aabbabbbb.abbbaba (Lnet/minecraft/class_310;Ljava/lang/Object;ILjava/util/function/BooleanSupplier;)Z
      // 10b: ireturn
   }

   // $VF: Handled exception range with multiple entry points by splitting it
   // $VF: Duplicated exception handlers to handle obfuscated exceptions
   private static float babaaa(Field var0, Object var1, float var2) {
      int var3 = baaabbaa.bba;

      label38: {
         Object var10000;
         label33: {
            try {
               var10000 = var0;
               if (var3 != 0) {
                  break label33;
               }

               if (var0 == null) {
                  break label38;
               }
            } catch (ReflectiveOperationException var8) {
               throw var8;
            }

            var10000 = var1;
         }

         try {
            if (var10000 == null) {
               break label38;
            }
         } catch (ReflectiveOperationException var7) {
            throw var7;
         }

         try {
            return var0.getFloat(var1);
         } catch (ReflectiveOperationException var6) {
            return var2;
         }
      }

      try {
         return var2;
      } catch (ReflectiveOperationException var5) {
         throw var5;
      }
   }

   public static boolean babaab(class_310 param0) {
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
      // 06: ifne 11
      // 09: ifnull 40
      // 0c: goto 10
      // 0f: athrow
      // 10: aload 0
      // 11: iload 1
      // 12: ifne 24
      // 15: getfield net/minecraft/class_310.field_1724 Lnet/minecraft/class_746;
      // 18: ifnull 40
      // 1b: goto 1f
      // 1e: athrow
      // 1f: aload 0
      // 20: goto 24
      // 23: athrow
      // 24: getfield net/minecraft/class_310.field_1724 Lnet/minecraft/class_746;
      // 27: getfield net/minecraft/class_746.field_6012 I
      // 2a: iload 1
      // 2b: ifne 3d
      // 2e: getstatic qeaa361f143ee4a0894bd168fd9b30c66/qf4ccf8f5435d4a78bdca4d6a018b578e/aabbabbbb.aabb I
      // 31: if_icmpgt 40
      // 34: goto 38
      // 37: athrow
      // 38: bipush 1
      // 39: goto 3d
      // 3c: athrow
      // 3d: goto 41
      // 40: bipush 0
      // 41: ireturn
   }

   public static boolean bababa(class_310 param0, int param1) {
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
      // 09: ifnull 4a
      // 0c: goto 10
      // 0f: athrow
      // 10: aload 0
      // 11: getfield net/minecraft/class_310.field_1724 Lnet/minecraft/class_746;
      // 14: ifnull 4a
      // 17: iload 1
      // 18: iload 2
      // 19: ifne 4f
      // 1c: goto 20
      // 1f: athrow
      // 20: iflt 4a
      // 23: goto 27
      // 26: athrow
      // 27: iload 1
      // 28: iload 2
      // 29: ifne 53
      // 2c: goto 30
      // 2f: athrow
      // 30: ldc_w 604047272
      // 33: ldc_w 1329911234
      // 36: ldc_w -624094585
      // 39: ixor
      // 3a: invokestatic qeaa361f143ee4a0894bd168fd9b30c66/qf4ccf8f5435d4a78bdca4d6a018b578e/aabbabbbb.b (II)I
      // 3d: ldc2_w 1131576471880749436
      // 40: invokestatic qeaa361f143ee4a0894bd168fd9b30c66/qf4ccf8f5435d4a78bdca4d6a018b578e/aabbabbbb.aaaaa (IJ)I
      // 43: if_icmplt 50
      // 46: goto 4a
      // 49: athrow
      // 4a: bipush 0
      // 4b: goto 4f
      // 4e: athrow
      // 4f: ireturn
      // 50: getstatic qeaa361f143ee4a0894bd168fd9b30c66/qf4ccf8f5435d4a78bdca4d6a018b578e/aabbabbbb.abbba I
      // 53: iload 2
      // 54: ifne 7e
      // 57: iflt 7b
      // 5a: goto 5e
      // 5d: athrow
      // 5e: getstatic qeaa361f143ee4a0894bd168fd9b30c66/qf4ccf8f5435d4a78bdca4d6a018b578e/aabbabbbb.abbba I
      // 61: iload 2
      // 62: ifne 76
      // 65: goto 69
      // 68: athrow
      // 69: iload 1
      // 6a: if_icmpne 79
      // 6d: goto 71
      // 70: athrow
      // 71: bipush 1
      // 72: goto 76
      // 75: athrow
      // 76: goto 7a
      // 79: bipush 0
      // 7a: ireturn
      // 7b: invokestatic qeaa361f143ee4a0894bd168fd9b30c66/qf4ccf8f5435d4a78bdca4d6a018b578e/bbbbbbba.ba ()I
      // 7e: iload 2
      // 7f: ifne 97
      // 82: ifge c7
      // 85: goto 89
      // 88: athrow
      // 89: aload 0
      // 8a: getfield net/minecraft/class_310.field_1724 Lnet/minecraft/class_746;
      // 8d: invokevirtual net/minecraft/class_746.method_31548 ()Lnet/minecraft/class_1661;
      // 90: invokestatic qeaa361f143ee4a0894bd168fd9b30c66/qf4ccf8f5435d4a78bdca4d6a018b578e/bbbabaa.aaaab (Lnet/minecraft/class_1661;)I
      // 93: goto 97
      // 96: athrow
      // 97: iload 2
      // 98: ifne aa
      // 9b: iload 1
      // 9c: if_icmpne c7
      // 9f: goto a3
      // a2: athrow
      // a3: getstatic qeaa361f143ee4a0894bd168fd9b30c66/qf4ccf8f5435d4a78bdca4d6a018b578e/aabbabbbb.aaaab I
      // a6: goto aa
      // a9: athrow
      // aa: iload 2
      // ab: ifne b8
      // ae: ifge c7
      // b1: goto b5
      // b4: athrow
      // b5: getstatic qeaa361f143ee4a0894bd168fd9b30c66/qf4ccf8f5435d4a78bdca4d6a018b578e/aabbabbbb.baaba Z
      // b8: iload 2
      // b9: ifne c4
      // bc: ifne c7
      // bf: goto c3
      // c2: athrow
      // c3: bipush 1
      // c4: goto c8
      // c7: bipush 0
      // c8: ireturn
   }

   public static void bababb(class_310 param0) {
      // $VF: Couldn't be decompiled
      // Please report this to the Vineflower issue tracker, at https://github.com/Vineflower/vineflower/issues with a copy of the class file (if you have the rights to distribute it!)
      // java.lang.RuntimeException: parsing failure!
      //   at org.jetbrains.java.decompiler.modules.decompiler.decompose.DomHelper.parseGraph(DomHelper.java:211)
      //   at org.jetbrains.java.decompiler.main.rels.MethodProcessor.codeToJava(MethodProcessor.java:166)
      //
      // Bytecode:
      // 00: getstatic qeaa361f143ee4a0894bd168fd9b30c66/qf4ccf8f5435d4a78bdca4d6a018b578e/baaabbaa.bba I
      // 03: getstatic qeaa361f143ee4a0894bd168fd9b30c66/qf4ccf8f5435d4a78bdca4d6a018b578e/aabbabbbb.baab Lqeaa361f143ee4a0894bd168fd9b30c66/qf4ccf8f5435d4a78bdca4d6a018b578e/bbaaba;
      // 06: astore 2
      // 07: istore 1
      // 08: aload 2
      // 09: ifnull 35
      // 0c: getstatic qeaa361f143ee4a0894bd168fd9b30c66/qf4ccf8f5435d4a78bdca4d6a018b578e/aabbabbbb.aabaa Z
      // 0f: ifeq 35
      // 12: goto 16
      // 15: athrow
      // 16: aload 0
      // 17: iload 1
      // 18: ifne 27
      // 1b: goto 1f
      // 1e: athrow
      // 1f: ifnull 35
      // 22: goto 26
      // 25: athrow
      // 26: aload 0
      // 27: iload 1
      // 28: ifne 3a
      // 2b: getfield net/minecraft/class_310.field_1724 Lnet/minecraft/class_746;
      // 2e: ifnonnull 37
      // 31: goto 35
      // 34: athrow
      // 35: return
      // 36: athrow
      // 37: getstatic qeaa361f143ee4a0894bd168fd9b30c66/qf4ccf8f5435d4a78bdca4d6a018b578e/aabbabbbb.ababa Ljava/lang/Object;
      // 3a: iload 1
      // 3b: ifne 48
      // 3e: ifnull 66
      // 41: goto 45
      // 44: athrow
      // 45: getstatic qeaa361f143ee4a0894bd168fd9b30c66/qf4ccf8f5435d4a78bdca4d6a018b578e/aabbabbbb.ababa Ljava/lang/Object;
      // 48: aload 2
      // 49: invokevirtual qeaa361f143ee4a0894bd168fd9b30c66/qf4ccf8f5435d4a78bdca4d6a018b578e/bbaaba.aa ()Lqeaa361f143ee4a0894bd168fd9b30c66/qf4ccf8f5435d4a78bdca4d6a018b578e/abaabbba;
      // 4c: invokevirtual qeaa361f143ee4a0894bd168fd9b30c66/qf4ccf8f5435d4a78bdca4d6a018b578e/abaabbba.a ()Ljava/lang/Object;
      // 4f: if_acmpne 66
      // 52: aconst_null
      // 53: putstatic qeaa361f143ee4a0894bd168fd9b30c66/qf4ccf8f5435d4a78bdca4d6a018b578e/aabbabbbb.ababa Ljava/lang/Object;
      // 56: aload 0
      // 57: aload 2
      // 58: invokevirtual qeaa361f143ee4a0894bd168fd9b30c66/qf4ccf8f5435d4a78bdca4d6a018b578e/bbaaba.aa ()Lqeaa361f143ee4a0894bd168fd9b30c66/qf4ccf8f5435d4a78bdca4d6a018b578e/abaabbba;
      // 5b: invokevirtual qeaa361f143ee4a0894bd168fd9b30c66/qf4ccf8f5435d4a78bdca4d6a018b578e/abaabbba.a ()Ljava/lang/Object;
      // 5e: getstatic qeaa361f143ee4a0894bd168fd9b30c66/qf4ccf8f5435d4a78bdca4d6a018b578e/abbaaabba.ab Lqeaa361f143ee4a0894bd168fd9b30c66/qf4ccf8f5435d4a78bdca4d6a018b578e/abbaaabba;
      // 61: invokestatic qeaa361f143ee4a0894bd168fd9b30c66/qf4ccf8f5435d4a78bdca4d6a018b578e/aabbabbbb.bbaaabb (Lnet/minecraft/class_310;Ljava/lang/Object;Lqeaa361f143ee4a0894bd168fd9b30c66/qf4ccf8f5435d4a78bdca4d6a018b578e/abbaaabba;)V
      // 64: return
      // 65: athrow
      // 66: aconst_null
      // 67: putstatic qeaa361f143ee4a0894bd168fd9b30c66/qf4ccf8f5435d4a78bdca4d6a018b578e/aabbabbbb.baab Lqeaa361f143ee4a0894bd168fd9b30c66/qf4ccf8f5435d4a78bdca4d6a018b578e/bbaaba;
      // 6a: iload 1
      // 6b: ifne 98
      // 6e: bipush 0
      // 6f: putstatic qeaa361f143ee4a0894bd168fd9b30c66/qf4ccf8f5435d4a78bdca4d6a018b578e/aabbabbbb.aabaa Z
      // 72: aload 2
      // 73: invokevirtual qeaa361f143ee4a0894bd168fd9b30c66/qf4ccf8f5435d4a78bdca4d6a018b578e/bbaaba.b ()Lnet/minecraft/class_746;
      // 76: aload 0
      // 77: getfield net/minecraft/class_310.field_1724 Lnet/minecraft/class_746;
      // 7a: if_acmpeq 83
      // 7d: goto 81
      // 80: athrow
      // 81: return
      // 82: athrow
      // 83: getstatic qeaa361f143ee4a0894bd168fd9b30c66/qf4ccf8f5435d4a78bdca4d6a018b578e/aabbabbbb.aba Lqeaa361f143ee4a0894bd168fd9b30c66/qf4ccf8f5435d4a78bdca4d6a018b578e/abaaabaa;
      // 86: new qeaa361f143ee4a0894bd168fd9b30c66/qf4ccf8f5435d4a78bdca4d6a018b578e/aaaababaa
      // 89: dup
      // 8a: aload 0
      // 8b: invokespecial qeaa361f143ee4a0894bd168fd9b30c66/qf4ccf8f5435d4a78bdca4d6a018b578e/aaaababaa.<init> (Lnet/minecraft/class_310;)V
      // 8e: aload 2
      // 8f: invokevirtual qeaa361f143ee4a0894bd168fd9b30c66/qf4ccf8f5435d4a78bdca4d6a018b578e/bbaaba.aa ()Lqeaa361f143ee4a0894bd168fd9b30c66/qf4ccf8f5435d4a78bdca4d6a018b578e/abaabbba;
      // 92: getstatic qeaa361f143ee4a0894bd168fd9b30c66/qf4ccf8f5435d4a78bdca4d6a018b578e/abbaaabba.aba Lqeaa361f143ee4a0894bd168fd9b30c66/qf4ccf8f5435d4a78bdca4d6a018b578e/abbaaabba;
      // 95: invokevirtual qeaa361f143ee4a0894bd168fd9b30c66/qf4ccf8f5435d4a78bdca4d6a018b578e/abaaabaa.aaa (Lqeaa361f143ee4a0894bd168fd9b30c66/qf4ccf8f5435d4a78bdca4d6a018b578e/abbbaaa;Lqeaa361f143ee4a0894bd168fd9b30c66/qf4ccf8f5435d4a78bdca4d6a018b578e/abaabbba;Lqeaa361f143ee4a0894bd168fd9b30c66/qf4ccf8f5435d4a78bdca4d6a018b578e/abbaaabba;)V
      // 98: return
   }

   public static boolean babbaa(class_2596 var0) {
      return var0.getClass()
         .getName()
         .contains(aabbaaaba.abba(bbaabaa(b(604047275, -1821253373 ^ -2052361809), b(604047274, -1821253373 ^ -1798615573))));
   }

   public static int babbab(class_310 param0) {
      // $VF: Couldn't be decompiled
      // Please report this to the Vineflower issue tracker, at https://github.com/Vineflower/vineflower/issues with a copy of the class file (if you have the rights to distribute it!)
      // java.lang.RuntimeException: parsing failure!
      //   at org.jetbrains.java.decompiler.modules.decompiler.decompose.DomHelper.parseGraph(DomHelper.java:211)
      //   at org.jetbrains.java.decompiler.main.rels.MethodProcessor.codeToJava(MethodProcessor.java:166)
      //
      // Bytecode:
      // 00: getstatic qeaa361f143ee4a0894bd168fd9b30c66/qf4ccf8f5435d4a78bdca4d6a018b578e/baaabbaa.bba I
      // 03: invokestatic qeaa361f143ee4a0894bd168fd9b30c66/qf4ccf8f5435d4a78bdca4d6a018b578e/bbbbbbba.ba ()I
      // 06: istore 2
      // 07: istore 1
      // 08: iload 2
      // 09: iload 1
      // 0a: ifne 3d
      // 0d: iflt 3a
      // 10: goto 14
      // 13: athrow
      // 14: iload 2
      // 15: iload 1
      // 16: ifne 3d
      // 19: goto 1d
      // 1c: athrow
      // 1d: ldc_w 604047277
      // 20: ldc_w 39544388
      // 23: ldc_w -998771081
      // 26: ixor
      // 27: invokestatic qeaa361f143ee4a0894bd168fd9b30c66/qf4ccf8f5435d4a78bdca4d6a018b578e/aabbabbbb.b (II)I
      // 2a: ldc2_w 1131576471880749436
      // 2d: invokestatic qeaa361f143ee4a0894bd168fd9b30c66/qf4ccf8f5435d4a78bdca4d6a018b578e/aabbabbbb.aaaaa (IJ)I
      // 30: if_icmpge 3a
      // 33: goto 37
      // 36: athrow
      // 37: iload 2
      // 38: ireturn
      // 39: athrow
      // 3a: getstatic qeaa361f143ee4a0894bd168fd9b30c66/qf4ccf8f5435d4a78bdca4d6a018b578e/aabbabbbb.abbba I
      // 3d: iload 1
      // 3e: ifne 4b
      // 41: iflt 71
      // 44: goto 48
      // 47: athrow
      // 48: getstatic qeaa361f143ee4a0894bd168fd9b30c66/qf4ccf8f5435d4a78bdca4d6a018b578e/aabbabbbb.abbba I
      // 4b: iload 1
      // 4c: ifne 70
      // 4f: ldc_w 604047276
      // 52: ldc_w 39544388
      // 55: ldc_w 274233122
      // 58: ixor
      // 59: invokestatic qeaa361f143ee4a0894bd168fd9b30c66/qf4ccf8f5435d4a78bdca4d6a018b578e/aabbabbbb.b (II)I
      // 5c: ldc2_w 1131576471880749436
      // 5f: invokestatic qeaa361f143ee4a0894bd168fd9b30c66/qf4ccf8f5435d4a78bdca4d6a018b578e/aabbabbbb.aaaaa (IJ)I
      // 62: if_icmpge 71
      // 65: goto 69
      // 68: athrow
      // 69: getstatic qeaa361f143ee4a0894bd168fd9b30c66/qf4ccf8f5435d4a78bdca4d6a018b578e/aabbabbbb.abbba I
      // 6c: goto 70
      // 6f: athrow
      // 70: ireturn
      // 71: aload 0
      // 72: iload 1
      // 73: ifne 7e
      // 76: ifnull 8c
      // 79: goto 7d
      // 7c: athrow
      // 7d: aload 0
      // 7e: iload 1
      // 7f: ifne 92
      // 82: getfield net/minecraft/class_310.field_1724 Lnet/minecraft/class_746;
      // 85: ifnonnull 91
      // 88: goto 8c
      // 8b: athrow
      // 8c: bipush -1
      // 8d: goto 9b
      // 90: athrow
      // 91: aload 0
      // 92: getfield net/minecraft/class_310.field_1724 Lnet/minecraft/class_746;
      // 95: invokevirtual net/minecraft/class_746.method_31548 ()Lnet/minecraft/class_1661;
      // 98: invokestatic qeaa361f143ee4a0894bd168fd9b30c66/qf4ccf8f5435d4a78bdca4d6a018b578e/bbbabaa.aaaab (Lnet/minecraft/class_1661;)I
      // 9b: ireturn
   }

   public static class_1799 babbba(class_746 param0) {
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
      // 06: ifne 16
      // 09: ifnonnull 15
      // 0c: goto 10
      // 0f: athrow
      // 10: getstatic net/minecraft/class_1799.field_8037 Lnet/minecraft/class_1799;
      // 13: areturn
      // 14: athrow
      // 15: aload 0
      // 16: invokevirtual net/minecraft/class_746.method_31548 ()Lnet/minecraft/class_1661;
      // 19: astore 2
      // 1a: invokestatic net/minecraft/class_310.method_1551 ()Lnet/minecraft/class_310;
      // 1d: astore 3
      // 1e: aload 3
      // 1f: ifnull 36
      // 22: aload 0
      // 23: aload 3
      // 24: getfield net/minecraft/class_310.field_1724 Lnet/minecraft/class_746;
      // 27: if_acmpne 36
      // 2a: goto 2e
      // 2d: athrow
      // 2e: aload 2
      // 2f: invokestatic qeaa361f143ee4a0894bd168fd9b30c66/qf4ccf8f5435d4a78bdca4d6a018b578e/aabbabbbb.bbaaba (Lnet/minecraft/class_1661;)I
      // 32: goto 3a
      // 35: athrow
      // 36: aload 2
      // 37: invokestatic qeaa361f143ee4a0894bd168fd9b30c66/qf4ccf8f5435d4a78bdca4d6a018b578e/bbbabaa.aaaab (Lnet/minecraft/class_1661;)I
      // 3a: istore 4
      // 3c: iload 4
      // 3e: iload 1
      // 3f: ifne 4b
      // 42: iflt 6b
      // 45: goto 49
      // 48: athrow
      // 49: iload 4
      // 4b: ldc_w 604047279
      // 4e: ldc_w -1934779317
      // 51: ldc_w -806335949
      // 54: ixor
      // 55: invokestatic qeaa361f143ee4a0894bd168fd9b30c66/qf4ccf8f5435d4a78bdca4d6a018b578e/aabbabbbb.b (II)I
      // 58: ldc2_w 1131576471880749436
      // 5b: invokestatic qeaa361f143ee4a0894bd168fd9b30c66/qf4ccf8f5435d4a78bdca4d6a018b578e/aabbabbbb.aaaaa (IJ)I
      // 5e: if_icmpge 6b
      // 61: aload 2
      // 62: iload 4
      // 64: invokevirtual net/minecraft/class_1661.method_5438 (I)Lnet/minecraft/class_1799;
      // 67: goto 6e
      // 6a: athrow
      // 6b: getstatic net/minecraft/class_1799.field_8037 Lnet/minecraft/class_1799;
      // 6e: areturn
   }

   public static boolean babbbb() {
      return bab;
   }

   public static boolean bbaaaa(class_310 param0) {
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
      // 06: ifne 11
      // 09: ifnull 5b
      // 0c: goto 10
      // 0f: athrow
      // 10: aload 0
      // 11: iload 1
      // 12: ifne 24
      // 15: getfield net/minecraft/class_310.field_1724 Lnet/minecraft/class_746;
      // 18: ifnull 5b
      // 1b: goto 1f
      // 1e: athrow
      // 1f: aload 0
      // 20: goto 24
      // 23: athrow
      // 24: iload 1
      // 25: ifne 37
      // 28: getfield net/minecraft/class_310.field_1761 Lnet/minecraft/class_636;
      // 2b: ifnull 5b
      // 2e: goto 32
      // 31: athrow
      // 32: aload 0
      // 33: goto 37
      // 36: athrow
      // 37: iload 1
      // 38: ifne 4a
      // 3b: getfield net/minecraft/class_310.field_1690 Lnet/minecraft/class_315;
      // 3e: ifnull 5b
      // 41: goto 45
      // 44: athrow
      // 45: aload 0
      // 46: goto 4a
      // 49: athrow
      // 4a: iload 1
      // 4b: ifne 5f
      // 4e: getfield net/minecraft/class_310.field_1690 Lnet/minecraft/class_315;
      // 51: getfield net/minecraft/class_315.field_1904 Lnet/minecraft/class_304;
      // 54: ifnonnull 5e
      // 57: goto 5b
      // 5a: athrow
      // 5b: bipush 0
      // 5c: ireturn
      // 5d: athrow
      // 5e: aload 0
      // 5f: iload 1
      // 60: ifne 7e
      // 63: getfield net/minecraft/class_310.field_1690 Lnet/minecraft/class_315;
      // 66: getfield net/minecraft/class_315.field_1904 Lnet/minecraft/class_304;
      // 69: invokestatic qeaa361f143ee4a0894bd168fd9b30c66/qf4ccf8f5435d4a78bdca4d6a018b578e/aabbabbbb.abbaabb (Lnet/minecraft/class_304;)Lnet/minecraft/class_3675$class_306;
      // 6c: invokestatic qeaa361f143ee4a0894bd168fd9b30c66/qf4ccf8f5435d4a78bdca4d6a018b578e/aabbabbbb.bbaaaaa (Lnet/minecraft/class_3675$class_306;)Z
      // 6f: ifeq 79
      // 72: goto 76
      // 75: athrow
      // 76: bipush 0
      // 77: ireturn
      // 78: athrow
      // 79: aload 0
      // 7a: invokestatic qeaa361f143ee4a0894bd168fd9b30c66/qf4ccf8f5435d4a78bdca4d6a018b578e/aabbabbbb.ababbbb (Lnet/minecraft/class_310;)V
      // 7d: aload 0
      // 7e: invokestatic qeaa361f143ee4a0894bd168fd9b30c66/qf4ccf8f5435d4a78bdca4d6a018b578e/aabbabbbb.bbbbba (Lnet/minecraft/class_310;)Z
      // 81: pop
      // 82: bipush 1
      // 83: ireturn
   }

   public static int bbaaab(class_2596 var0) {
      int var2 = 2009014437;

      try {
         return (Integer)var0.getClass()
            .getMethod(aabbaaaba.abba(bbaabaa(b(604047278, var2 ^ -1673957730), b(604047265, var2 ^ -1984745853))))
            .invoke(var0);
      } catch (Exception var5) {
         try {
            return (Integer)var0.getClass()
               .getMethod(aabbaaaba.abba(bbaabaa(b(604047264, var2 ^ -1494598299), b(604047267, var2 ^ 1177897748))))
               .invoke(var0);
         } catch (Exception var4) {
            try {
               return (Integer)var0.getClass()
                  .getMethod(aabbaaaba.abba(bbaabaa(b(604047266, var2 ^ -2009081230), b(604047269, var2 ^ -708676347))))
                  .invoke(var0);
            } catch (Exception var3) {
               return -1;
            }
         }
      }
   }

   public static int bbaaba(class_1661 param0) {
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
      // 05: ifnonnull 0b
      // 08: bipush 0
      // 09: ireturn
      // 0a: athrow
      // 0b: invokestatic net/minecraft/class_310.method_1551 ()Lnet/minecraft/class_310;
      // 0e: astore 2
      // 0f: aload 2
      // 10: iload 1
      // 11: ifne 1c
      // 14: ifnull f8
      // 17: goto 1b
      // 1a: athrow
      // 1b: aload 2
      // 1c: iload 1
      // 1d: ifne 2f
      // 20: getfield net/minecraft/class_310.field_1724 Lnet/minecraft/class_746;
      // 23: ifnull f8
      // 26: goto 2a
      // 29: athrow
      // 2a: aload 2
      // 2b: goto 2f
      // 2e: athrow
      // 2f: getfield net/minecraft/class_310.field_1724 Lnet/minecraft/class_746;
      // 32: invokevirtual net/minecraft/class_746.method_31548 ()Lnet/minecraft/class_1661;
      // 35: iload 1
      // 36: ifne f9
      // 39: aload 0
      // 3a: if_acmpne f8
      // 3d: goto 41
      // 40: athrow
      // 41: invokestatic qeaa361f143ee4a0894bd168fd9b30c66/qf4ccf8f5435d4a78bdca4d6a018b578e/abaaaaaba.aaaaa ()Lqeaa361f143ee4a0894bd168fd9b30c66/qf4ccf8f5435d4a78bdca4d6a018b578e/abaaaaaba;
      // 44: astore 3
      // 45: aload 3
      // 46: iload 1
      // 47: ifne 52
      // 4a: ifnull f8
      // 4d: goto 51
      // 50: athrow
      // 51: aload 3
      // 52: iload 1
      // 53: ifne 65
      // 56: invokevirtual qeaa361f143ee4a0894bd168fd9b30c66/qf4ccf8f5435d4a78bdca4d6a018b578e/abaaaaaba.aaba ()Lqeaa361f143ee4a0894bd168fd9b30c66/qf4ccf8f5435d4a78bdca4d6a018b578e/babbaba;
      // 59: ifnull f8
      // 5c: goto 60
      // 5f: athrow
      // 60: aload 3
      // 61: goto 65
      // 64: athrow
      // 65: invokevirtual qeaa361f143ee4a0894bd168fd9b30c66/qf4ccf8f5435d4a78bdca4d6a018b578e/abaaaaaba.aaba ()Lqeaa361f143ee4a0894bd168fd9b30c66/qf4ccf8f5435d4a78bdca4d6a018b578e/babbaba;
      // 68: iload 1
      // 69: ifne 7e
      // 6c: invokevirtual qeaa361f143ee4a0894bd168fd9b30c66/qf4ccf8f5435d4a78bdca4d6a018b578e/babbaba.babba ()Lqeaa361f143ee4a0894bd168fd9b30c66/qf4ccf8f5435d4a78bdca4d6a018b578e/abbbabbaa;
      // 6f: ifnull f8
      // 72: goto 76
      // 75: athrow
      // 76: aload 3
      // 77: invokevirtual qeaa361f143ee4a0894bd168fd9b30c66/qf4ccf8f5435d4a78bdca4d6a018b578e/abaaaaaba.aaba ()Lqeaa361f143ee4a0894bd168fd9b30c66/qf4ccf8f5435d4a78bdca4d6a018b578e/babbaba;
      // 7a: goto 7e
      // 7d: athrow
      // 7e: invokevirtual qeaa361f143ee4a0894bd168fd9b30c66/qf4ccf8f5435d4a78bdca4d6a018b578e/babbaba.babba ()Lqeaa361f143ee4a0894bd168fd9b30c66/qf4ccf8f5435d4a78bdca4d6a018b578e/abbbabbaa;
      // 81: invokevirtual qeaa361f143ee4a0894bd168fd9b30c66/qf4ccf8f5435d4a78bdca4d6a018b578e/abbbabbaa.abb ()Z
      // 84: iload 1
      // 85: ifne fc
      // 88: ifeq f8
      // 8b: goto 8f
      // 8e: athrow
      // 8f: getstatic qeaa361f143ee4a0894bd168fd9b30c66/qf4ccf8f5435d4a78bdca4d6a018b578e/aabbabbbb.aba Lqeaa361f143ee4a0894bd168fd9b30c66/qf4ccf8f5435d4a78bdca4d6a018b578e/abaaabaa;
      // 92: invokevirtual qeaa361f143ee4a0894bd168fd9b30c66/qf4ccf8f5435d4a78bdca4d6a018b578e/abaaabaa.bb ()Z
      // 95: iload 1
      // 96: ifne c5
      // 99: goto 9d
      // 9c: athrow
      // 9d: ifeq b4
      // a0: goto a4
      // a3: athrow
      // a4: getstatic qeaa361f143ee4a0894bd168fd9b30c66/qf4ccf8f5435d4a78bdca4d6a018b578e/aabbabbbb.aba Lqeaa361f143ee4a0894bd168fd9b30c66/qf4ccf8f5435d4a78bdca4d6a018b578e/abaaabaa;
      // a7: new qeaa361f143ee4a0894bd168fd9b30c66/qf4ccf8f5435d4a78bdca4d6a018b578e/aaaababaa
      // aa: dup
      // ab: aload 2
      // ac: invokespecial qeaa361f143ee4a0894bd168fd9b30c66/qf4ccf8f5435d4a78bdca4d6a018b578e/aaaababaa.<init> (Lnet/minecraft/class_310;)V
      // af: invokevirtual qeaa361f143ee4a0894bd168fd9b30c66/qf4ccf8f5435d4a78bdca4d6a018b578e/abaaabaa.baba (Lqeaa361f143ee4a0894bd168fd9b30c66/qf4ccf8f5435d4a78bdca4d6a018b578e/abbbaaa;)I
      // b2: ireturn
      // b3: athrow
      // b4: aload 3
      // b5: invokevirtual qeaa361f143ee4a0894bd168fd9b30c66/qf4ccf8f5435d4a78bdca4d6a018b578e/abaaaaaba.aaba ()Lqeaa361f143ee4a0894bd168fd9b30c66/qf4ccf8f5435d4a78bdca4d6a018b578e/babbaba;
      // b8: invokevirtual qeaa361f143ee4a0894bd168fd9b30c66/qf4ccf8f5435d4a78bdca4d6a018b578e/babbaba.babba ()Lqeaa361f143ee4a0894bd168fd9b30c66/qf4ccf8f5435d4a78bdca4d6a018b578e/abbbabbaa;
      // bb: aload 2
      // bc: getfield net/minecraft/class_310.field_1724 Lnet/minecraft/class_746;
      // bf: getfield net/minecraft/class_746.field_6012 I
      // c2: invokevirtual qeaa361f143ee4a0894bd168fd9b30c66/qf4ccf8f5435d4a78bdca4d6a018b578e/abbbabbaa.ab (I)I
      // c5: iload 1
      // c6: ifne fc
      // c9: istore 4
      // cb: iload 4
      // cd: iflt f8
      // d0: iload 4
      // d2: iload 1
      // d3: ifne fc
      // d6: goto da
      // d9: athrow
      // da: ldc_w 604047268
      // dd: ldc_w -35291241
      // e0: ldc_w -1248618576
      // e3: ixor
      // e4: invokestatic qeaa361f143ee4a0894bd168fd9b30c66/qf4ccf8f5435d4a78bdca4d6a018b578e/aabbabbbb.b (II)I
      // e7: ldc2_w 482739652961912117
      // ea: invokestatic qeaa361f143ee4a0894bd168fd9b30c66/qf4ccf8f5435d4a78bdca4d6a018b578e/aabbabbbb.aaaaa (IJ)I
      // ed: if_icmpge f8
      // f0: goto f4
      // f3: athrow
      // f4: iload 4
      // f6: ireturn
      // f7: athrow
      // f8: aload 0
      // f9: invokestatic qeaa361f143ee4a0894bd168fd9b30c66/qf4ccf8f5435d4a78bdca4d6a018b578e/bbbabaa.aaaab (Lnet/minecraft/class_1661;)I
      // fc: ireturn
   }

   public static boolean bbaabb(class_310 param0, class_1297 param1) {
      // $VF: Couldn't be decompiled
      // Please report this to the Vineflower issue tracker, at https://github.com/Vineflower/vineflower/issues with a copy of the class file (if you have the rights to distribute it!)
      // java.lang.RuntimeException: parsing failure!
      //   at org.jetbrains.java.decompiler.modules.decompiler.decompose.DomHelper.parseGraph(DomHelper.java:211)
      //   at org.jetbrains.java.decompiler.main.rels.MethodProcessor.codeToJava(MethodProcessor.java:166)
      //
      // Bytecode:
      // 00: getstatic qeaa361f143ee4a0894bd168fd9b30c66/qf4ccf8f5435d4a78bdca4d6a018b578e/baaabbaa.bba I
      // 03: invokestatic qeaa361f143ee4a0894bd168fd9b30c66/qf4ccf8f5435d4a78bdca4d6a018b578e/abaaaaaba.aaaaa ()Lqeaa361f143ee4a0894bd168fd9b30c66/qf4ccf8f5435d4a78bdca4d6a018b578e/abaaaaaba;
      // 06: astore 3
      // 07: istore 2
      // 08: aload 3
      // 09: iload 2
      // 0a: ifne 1d
      // 0d: ifnull 58
      // 10: goto 14
      // 13: athrow
      // 14: aload 3
      // 15: iload 2
      // 16: ifne 28
      // 19: goto 1d
      // 1c: athrow
      // 1d: invokevirtual qeaa361f143ee4a0894bd168fd9b30c66/qf4ccf8f5435d4a78bdca4d6a018b578e/abaaaaaba.aaba ()Lqeaa361f143ee4a0894bd168fd9b30c66/qf4ccf8f5435d4a78bdca4d6a018b578e/babbaba;
      // 20: ifnull 58
      // 23: aload 3
      // 24: goto 28
      // 27: athrow
      // 28: invokevirtual qeaa361f143ee4a0894bd168fd9b30c66/qf4ccf8f5435d4a78bdca4d6a018b578e/abaaaaaba.aaba ()Lqeaa361f143ee4a0894bd168fd9b30c66/qf4ccf8f5435d4a78bdca4d6a018b578e/babbaba;
      // 2b: iload 2
      // 2c: ifne 41
      // 2f: invokevirtual qeaa361f143ee4a0894bd168fd9b30c66/qf4ccf8f5435d4a78bdca4d6a018b578e/babbaba.baabbb ()Lqeaa361f143ee4a0894bd168fd9b30c66/qf4ccf8f5435d4a78bdca4d6a018b578e/ababbabb;
      // 32: ifnull 58
      // 35: goto 39
      // 38: athrow
      // 39: aload 3
      // 3a: invokevirtual qeaa361f143ee4a0894bd168fd9b30c66/qf4ccf8f5435d4a78bdca4d6a018b578e/abaaaaaba.aaba ()Lqeaa361f143ee4a0894bd168fd9b30c66/qf4ccf8f5435d4a78bdca4d6a018b578e/babbaba;
      // 3d: goto 41
      // 40: athrow
      // 41: invokevirtual qeaa361f143ee4a0894bd168fd9b30c66/qf4ccf8f5435d4a78bdca4d6a018b578e/babbaba.baabbb ()Lqeaa361f143ee4a0894bd168fd9b30c66/qf4ccf8f5435d4a78bdca4d6a018b578e/ababbabb;
      // 44: aload 0
      // 45: aload 1
      // 46: invokevirtual qeaa361f143ee4a0894bd168fd9b30c66/qf4ccf8f5435d4a78bdca4d6a018b578e/ababbabb.bbb (Lnet/minecraft/class_310;Lnet/minecraft/class_1297;)Z
      // 49: iload 2
      // 4a: ifne 55
      // 4d: ifeq 58
      // 50: goto 54
      // 53: athrow
      // 54: bipush 1
      // 55: goto 59
      // 58: bipush 0
      // 59: ireturn
   }

   public static BufferedImage bbabaa(class_310 param0) {
      // $VF: Couldn't be decompiled
      // Please report this to the Vineflower issue tracker, at https://github.com/Vineflower/vineflower/issues with a copy of the class file (if you have the rights to distribute it!)
      // java.lang.NullPointerException: Cannot invoke "org.jetbrains.java.decompiler.code.cfg.ExceptionRangeCFG.isCircular()" because "range" is null
      //   at org.jetbrains.java.decompiler.modules.decompiler.decompose.DomHelper.graphToStatement(DomHelper.java:84)
      //   at org.jetbrains.java.decompiler.modules.decompiler.decompose.DomHelper.parseGraph(DomHelper.java:203)
      //   at org.jetbrains.java.decompiler.main.rels.MethodProcessor.codeToJava(MethodProcessor.java:166)
      //
      // Bytecode:
      // 000: getstatic qeaa361f143ee4a0894bd168fd9b30c66/qf4ccf8f5435d4a78bdca4d6a018b578e/baaabbaa.bba I
      // 003: istore 1
      // 004: aload 0
      // 005: iload 1
      // 006: ifne 014
      // 009: ifnonnull 013
      // 00c: goto 010
      // 00f: athrow
      // 010: aconst_null
      // 011: areturn
      // 012: athrow
      // 013: aload 0
      // 014: invokevirtual net/minecraft/class_310.method_1522 ()Lnet/minecraft/class_276;
      // 017: astore 2
      // 018: aload 2
      // 019: ifnonnull 01f
      // 01c: aconst_null
      // 01d: areturn
      // 01e: athrow
      // 01f: aconst_null
      // 020: astore 3
      // 021: getstatic qeaa361f143ee4a0894bd168fd9b30c66/qf4ccf8f5435d4a78bdca4d6a018b578e/aabbabbbb.bbaa Ljava/lang/reflect/Method;
      // 024: iload 1
      // 025: ifne 042
      // 028: ifnull 065
      // 02b: goto 02f
      // 02e: athrow
      // 02f: getstatic qeaa361f143ee4a0894bd168fd9b30c66/qf4ccf8f5435d4a78bdca4d6a018b578e/aabbabbbb.bbaa Ljava/lang/reflect/Method;
      // 032: aconst_null
      // 033: bipush 1
      // 034: anewarray 4
      // 037: dup
      // 038: bipush 0
      // 039: aload 2
      // 03a: aastore
      // 03b: invokevirtual java/lang/reflect/Method.invoke (Ljava/lang/Object;[Ljava/lang/Object;)Ljava/lang/Object;
      // 03e: goto 042
      // 041: athrow
      // 042: astore 4
      // 044: aload 4
      // 046: iload 1
      // 047: ifne 05a
      // 04a: instanceof net/minecraft/class_1011
      // 04d: ifeq 062
      // 050: goto 054
      // 053: athrow
      // 054: aload 4
      // 056: goto 05a
      // 059: athrow
      // 05a: checkcast net/minecraft/class_1011
      // 05d: astore 5
      // 05f: aload 5
      // 061: astore 3
      // 062: goto 0e2
      // 065: new java/util/concurrent/atomic/AtomicReference
      // 068: dup
      // 069: invokespecial java/util/concurrent/atomic/AtomicReference.<init> ()V
      // 06c: astore 4
      // 06e: aload 4
      // 070: dup
      // 071: invokestatic java/util/Objects.requireNonNull (Ljava/lang/Object;)Ljava/lang/Object;
      // 074: pop
      // 075: invokedynamic accept (Ljava/util/concurrent/atomic/AtomicReference;)Ljava/util/function/Consumer; bsm=java/lang/invoke/LambdaMetafactory.metafactory (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;Ljava/lang/invoke/MethodType;Ljava/lang/invoke/MethodHandle;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[ (Ljava/lang/Object;)V, java/util/concurrent/atomic/AtomicReference.set (Ljava/lang/Object;)V, (Lnet/minecraft/class_1011;)V ]
      // 07a: astore 5
      // 07c: getstatic qeaa361f143ee4a0894bd168fd9b30c66/qf4ccf8f5435d4a78bdca4d6a018b578e/aabbabbbb.aaab Ljava/lang/reflect/Method;
      // 07f: iload 1
      // 080: ifne 0ae
      // 083: ifnull 0a7
      // 086: goto 08a
      // 089: athrow
      // 08a: getstatic qeaa361f143ee4a0894bd168fd9b30c66/qf4ccf8f5435d4a78bdca4d6a018b578e/aabbabbbb.aaab Ljava/lang/reflect/Method;
      // 08d: aconst_null
      // 08e: bipush 2
      // 08f: anewarray 4
      // 092: dup
      // 093: bipush 0
      // 094: aload 2
      // 095: aastore
      // 096: dup
      // 097: bipush 1
      // 098: aload 5
      // 09a: aastore
      // 09b: invokevirtual java/lang/reflect/Method.invoke (Ljava/lang/Object;[Ljava/lang/Object;)Ljava/lang/Object;
      // 09e: pop
      // 09f: iload 1
      // 0a0: ifeq 0d9
      // 0a3: goto 0a7
      // 0a6: athrow
      // 0a7: getstatic qeaa361f143ee4a0894bd168fd9b30c66/qf4ccf8f5435d4a78bdca4d6a018b578e/aabbabbbb.abbb Ljava/lang/reflect/Method;
      // 0aa: goto 0ae
      // 0ad: athrow
      // 0ae: iload 1
      // 0af: ifne 0de
      // 0b2: ifnull 0d9
      // 0b5: goto 0b9
      // 0b8: athrow
      // 0b9: getstatic qeaa361f143ee4a0894bd168fd9b30c66/qf4ccf8f5435d4a78bdca4d6a018b578e/aabbabbbb.abbb Ljava/lang/reflect/Method;
      // 0bc: aconst_null
      // 0bd: bipush 3
      // 0be: anewarray 4
      // 0c1: dup
      // 0c2: bipush 0
      // 0c3: aload 2
      // 0c4: aastore
      // 0c5: dup
      // 0c6: bipush 1
      // 0c7: bipush 1
      // 0c8: invokestatic java/lang/Integer.valueOf (I)Ljava/lang/Integer;
      // 0cb: aastore
      // 0cc: dup
      // 0cd: bipush 2
      // 0ce: aload 5
      // 0d0: aastore
      // 0d1: invokevirtual java/lang/reflect/Method.invoke (Ljava/lang/Object;[Ljava/lang/Object;)Ljava/lang/Object;
      // 0d4: pop
      // 0d5: goto 0d9
      // 0d8: athrow
      // 0d9: aload 4
      // 0db: invokevirtual java/util/concurrent/atomic/AtomicReference.get ()Ljava/lang/Object;
      // 0de: checkcast net/minecraft/class_1011
      // 0e1: astore 3
      // 0e2: aload 3
      // 0e3: iload 1
      // 0e4: ifne 105
      // 0e7: ifnonnull 104
      // 0ea: goto 0ee
      // 0ed: athrow
      // 0ee: aconst_null
      // 0ef: astore 4
      // 0f1: aload 3
      // 0f2: iload 1
      // 0f3: ifne 0fe
      // 0f6: ifnull 101
      // 0f9: goto 0fd
      // 0fc: athrow
      // 0fd: aload 3
      // 0fe: invokevirtual net/minecraft/class_1011.close ()V
      // 101: aload 4
      // 103: areturn
      // 104: aload 3
      // 105: invokestatic qeaa361f143ee4a0894bd168fd9b30c66/qf4ccf8f5435d4a78bdca4d6a018b578e/aabbabbbb.babaa (Lnet/minecraft/class_1011;)Ljava/awt/image/BufferedImage;
      // 108: astore 4
      // 10a: aload 3
      // 10b: iload 1
      // 10c: ifne 117
      // 10f: ifnull 11a
      // 112: goto 116
      // 115: athrow
      // 116: aload 3
      // 117: invokevirtual net/minecraft/class_1011.close ()V
      // 11a: aload 4
      // 11c: areturn
      // 11d: astore 4
      // 11f: aconst_null
      // 120: astore 5
      // 122: aload 3
      // 123: iload 1
      // 124: ifne 12f
      // 127: ifnull 132
      // 12a: goto 12e
      // 12d: athrow
      // 12e: aload 3
      // 12f: invokevirtual net/minecraft/class_1011.close ()V
      // 132: aload 5
      // 134: areturn
      // 135: astore 6
      // 137: aload 3
      // 138: iload 1
      // 139: ifne 144
      // 13c: ifnull 147
      // 13f: goto 143
      // 142: athrow
      // 143: aload 3
      // 144: invokevirtual net/minecraft/class_1011.close ()V
      // 147: aload 6
      // 149: athrow
   }

   public static boolean bbabab(class_310 param0, Object param1, int param2) {
      // $VF: Couldn't be decompiled
      // Please report this to the Vineflower issue tracker, at https://github.com/Vineflower/vineflower/issues with a copy of the class file (if you have the rights to distribute it!)
      // java.lang.RuntimeException: parsing failure!
      //   at org.jetbrains.java.decompiler.modules.decompiler.decompose.DomHelper.parseGraph(DomHelper.java:211)
      //   at org.jetbrains.java.decompiler.main.rels.MethodProcessor.codeToJava(MethodProcessor.java:166)
      //
      // Bytecode:
      // 000: getstatic qeaa361f143ee4a0894bd168fd9b30c66/qf4ccf8f5435d4a78bdca4d6a018b578e/baaabbaa.bba I
      // 003: istore 3
      // 004: aload 0
      // 005: iload 3
      // 006: ifne 011
      // 009: ifnull 076
      // 00c: goto 010
      // 00f: athrow
      // 010: aload 0
      // 011: iload 3
      // 012: ifne 024
      // 015: getfield net/minecraft/class_310.field_1724 Lnet/minecraft/class_746;
      // 018: ifnull 076
      // 01b: goto 01f
      // 01e: athrow
      // 01f: aload 1
      // 020: goto 024
      // 023: athrow
      // 024: ifnull 076
      // 027: iload 2
      // 028: iload 3
      // 029: ifne 077
      // 02c: goto 030
      // 02f: athrow
      // 030: iflt 076
      // 033: goto 037
      // 036: athrow
      // 037: iload 2
      // 038: iload 3
      // 039: ifne 077
      // 03c: goto 040
      // 03f: athrow
      // 040: ldc_w 604047271
      // 043: ldc_w -1956317110
      // 046: ldc_w -43894907
      // 049: ixor
      // 04a: invokestatic qeaa361f143ee4a0894bd168fd9b30c66/qf4ccf8f5435d4a78bdca4d6a018b578e/aabbabbbb.b (II)I
      // 04d: ldc2_w 6146930655705273313
      // 050: invokestatic qeaa361f143ee4a0894bd168fd9b30c66/qf4ccf8f5435d4a78bdca4d6a018b578e/aabbabbbb.aaaaa (IJ)I
      // 053: if_icmpgt 076
      // 056: goto 05a
      // 059: athrow
      // 05a: getstatic qeaa361f143ee4a0894bd168fd9b30c66/qf4ccf8f5435d4a78bdca4d6a018b578e/aabbabbbb.baab Lqeaa361f143ee4a0894bd168fd9b30c66/qf4ccf8f5435d4a78bdca4d6a018b578e/bbaaba;
      // 05d: ifnonnull 076
      // 060: goto 064
      // 063: athrow
      // 064: getstatic qeaa361f143ee4a0894bd168fd9b30c66/qf4ccf8f5435d4a78bdca4d6a018b578e/aabbabbbb.aaaba Z
      // 067: iload 3
      // 068: ifne 077
      // 06b: goto 06f
      // 06e: athrow
      // 06f: ifeq 078
      // 072: goto 076
      // 075: athrow
      // 076: bipush 0
      // 077: ireturn
      // 078: new qeaa361f143ee4a0894bd168fd9b30c66/qf4ccf8f5435d4a78bdca4d6a018b578e/aaaababaa
      // 07b: dup
      // 07c: aload 0
      // 07d: invokespecial qeaa361f143ee4a0894bd168fd9b30c66/qf4ccf8f5435d4a78bdca4d6a018b578e/aaaababaa.<init> (Lnet/minecraft/class_310;)V
      // 080: astore 4
      // 082: getstatic qeaa361f143ee4a0894bd168fd9b30c66/qf4ccf8f5435d4a78bdca4d6a018b578e/aabbabbbb.aaaaba Lqeaa361f143ee4a0894bd168fd9b30c66/qf4ccf8f5435d4a78bdca4d6a018b578e/bbbabbab;
      // 085: astore 5
      // 087: getstatic qeaa361f143ee4a0894bd168fd9b30c66/qf4ccf8f5435d4a78bdca4d6a018b578e/aabbabbbb.aba Lqeaa361f143ee4a0894bd168fd9b30c66/qf4ccf8f5435d4a78bdca4d6a018b578e/abaaabaa;
      // 08a: aload 4
      // 08c: aload 1
      // 08d: iload 2
      // 08e: aload 5
      // 090: bipush -1
      // 091: bipush 1
      // 092: aconst_null
      // 093: invokevirtual qeaa361f143ee4a0894bd168fd9b30c66/qf4ccf8f5435d4a78bdca4d6a018b578e/abaaabaa.bba (Lqeaa361f143ee4a0894bd168fd9b30c66/qf4ccf8f5435d4a78bdca4d6a018b578e/abbbaaa;Ljava/lang/Object;ILqeaa361f143ee4a0894bd168fd9b30c66/qf4ccf8f5435d4a78bdca4d6a018b578e/bbbabbab;IZLjava/lang/Runnable;)Lqeaa361f143ee4a0894bd168fd9b30c66/qf4ccf8f5435d4a78bdca4d6a018b578e/abaabbba;
      // 096: astore 6
      // 098: aload 6
      // 09a: invokevirtual qeaa361f143ee4a0894bd168fd9b30c66/qf4ccf8f5435d4a78bdca4d6a018b578e/abaabbba.ab ()J
      // 09d: lconst_0
      // 09e: lcmp
      // 09f: iload 3
      // 0a0: ifne 0ab
      // 0a3: ifne 0ac
      // 0a6: goto 0aa
      // 0a9: athrow
      // 0aa: bipush 0
      // 0ab: ireturn
      // 0ac: aload 5
      // 0ae: getstatic qeaa361f143ee4a0894bd168fd9b30c66/qf4ccf8f5435d4a78bdca4d6a018b578e/bbbabbab.b Lqeaa361f143ee4a0894bd168fd9b30c66/qf4ccf8f5435d4a78bdca4d6a018b578e/bbbabbab;
      // 0b1: if_acmpne 0bc
      // 0b4: aload 0
      // 0b5: invokestatic qeaa361f143ee4a0894bd168fd9b30c66/qf4ccf8f5435d4a78bdca4d6a018b578e/aabbabbbb.aabaa (Lnet/minecraft/class_310;)V
      // 0b8: goto 0bc
      // 0bb: athrow
      // 0bc: aload 6
      // 0be: invokevirtual qeaa361f143ee4a0894bd168fd9b30c66/qf4ccf8f5435d4a78bdca4d6a018b578e/abaabbba.ab ()J
      // 0c1: lconst_0
      // 0c2: lcmp
      // 0c3: iload 3
      // 0c4: ifne 0da
      // 0c7: ifge 0dd
      // 0ca: goto 0ce
      // 0cd: athrow
      // 0ce: aload 4
      // 0d0: aload 5
      // 0d2: iload 2
      // 0d3: invokevirtual qeaa361f143ee4a0894bd168fd9b30c66/qf4ccf8f5435d4a78bdca4d6a018b578e/aaaababaa.ab (Lqeaa361f143ee4a0894bd168fd9b30c66/qf4ccf8f5435d4a78bdca4d6a018b578e/bbbabbab;I)Z
      // 0d6: goto 0da
      // 0d9: athrow
      // 0da: goto 0ee
      // 0dd: getstatic qeaa361f143ee4a0894bd168fd9b30c66/qf4ccf8f5435d4a78bdca4d6a018b578e/aabbabbbb.aba Lqeaa361f143ee4a0894bd168fd9b30c66/qf4ccf8f5435d4a78bdca4d6a018b578e/abaaabaa;
      // 0e0: aload 4
      // 0e2: aload 6
      // 0e4: aload 0
      // 0e5: getfield net/minecraft/class_310.field_1724 Lnet/minecraft/class_746;
      // 0e8: getfield net/minecraft/class_746.field_6012 I
      // 0eb: invokevirtual qeaa361f143ee4a0894bd168fd9b30c66/qf4ccf8f5435d4a78bdca4d6a018b578e/abaaabaa.baaa (Lqeaa361f143ee4a0894bd168fd9b30c66/qf4ccf8f5435d4a78bdca4d6a018b578e/abbbaaa;Lqeaa361f143ee4a0894bd168fd9b30c66/qf4ccf8f5435d4a78bdca4d6a018b578e/abaabbba;I)Z
      // 0ee: istore 7
      // 0f0: iload 7
      // 0f2: iload 3
      // 0f3: ifne 125
      // 0f6: ifeq 123
      // 0f9: goto 0fd
      // 0fc: athrow
      // 0fd: getstatic qeaa361f143ee4a0894bd168fd9b30c66/qf4ccf8f5435d4a78bdca4d6a018b578e/aabbabbbb.babaa Z
      // 100: iload 3
      // 101: ifne 125
      // 104: goto 108
      // 107: athrow
      // 108: ifeq 123
      // 10b: goto 10f
      // 10e: athrow
      // 10f: aload 5
      // 111: getstatic qeaa361f143ee4a0894bd168fd9b30c66/qf4ccf8f5435d4a78bdca4d6a018b578e/bbbabbab.b Lqeaa361f143ee4a0894bd168fd9b30c66/qf4ccf8f5435d4a78bdca4d6a018b578e/bbbabbab;
      // 114: if_acmpne 123
      // 117: goto 11b
      // 11a: athrow
      // 11b: bipush 1
      // 11c: putstatic qeaa361f143ee4a0894bd168fd9b30c66/qf4ccf8f5435d4a78bdca4d6a018b578e/aabbabbbb.aaaaaa Z
      // 11f: goto 123
      // 122: athrow
      // 123: iload 7
      // 125: ireturn
   }

   public static int bbabba(class_1661 param0) {
      // $VF: Couldn't be decompiled
      // Please report this to the Vineflower issue tracker, at https://github.com/Vineflower/vineflower/issues with a copy of the class file (if you have the rights to distribute it!)
      // java.lang.RuntimeException: parsing failure!
      //   at org.jetbrains.java.decompiler.modules.decompiler.decompose.DomHelper.parseGraph(DomHelper.java:211)
      //   at org.jetbrains.java.decompiler.main.rels.MethodProcessor.codeToJava(MethodProcessor.java:166)
      //
      // Bytecode:
      // 00: getstatic qeaa361f143ee4a0894bd168fd9b30c66/qf4ccf8f5435d4a78bdca4d6a018b578e/baaabbaa.bba I
      // 03: istore 1
      // 04: getstatic qeaa361f143ee4a0894bd168fd9b30c66/qf4ccf8f5435d4a78bdca4d6a018b578e/aabbabbbb.aba Lqeaa361f143ee4a0894bd168fd9b30c66/qf4ccf8f5435d4a78bdca4d6a018b578e/abaaabaa;
      // 07: invokevirtual qeaa361f143ee4a0894bd168fd9b30c66/qf4ccf8f5435d4a78bdca4d6a018b578e/abaaabaa.ab ()Z
      // 0a: iload 1
      // 0b: ifne 3e
      // 0e: ifeq 3d
      // 11: goto 15
      // 14: athrow
      // 15: aload 0
      // 16: ifnull 3d
      // 19: goto 1d
      // 1c: athrow
      // 1d: getstatic qeaa361f143ee4a0894bd168fd9b30c66/qf4ccf8f5435d4a78bdca4d6a018b578e/aabbabbbb.aabbb I
      // 20: iload 1
      // 21: ifne 32
      // 24: goto 28
      // 27: athrow
      // 28: ifgt 3f
      // 2b: goto 2f
      // 2e: athrow
      // 2f: getstatic qeaa361f143ee4a0894bd168fd9b30c66/qf4ccf8f5435d4a78bdca4d6a018b578e/aabbabbbb.aaaaaa Z
      // 32: iload 1
      // 33: ifne 3e
      // 36: ifne 3f
      // 39: goto 3d
      // 3c: athrow
      // 3d: bipush -1
      // 3e: ireturn
      // 3f: invokestatic net/minecraft/class_310.method_1551 ()Lnet/minecraft/class_310;
      // 42: astore 2
      // 43: aload 2
      // 44: iload 1
      // 45: ifne 50
      // 48: ifnull 6d
      // 4b: goto 4f
      // 4e: athrow
      // 4f: aload 2
      // 50: iload 1
      // 51: ifne 63
      // 54: getfield net/minecraft/class_310.field_1724 Lnet/minecraft/class_746;
      // 57: ifnull 6d
      // 5a: goto 5e
      // 5d: athrow
      // 5e: aload 2
      // 5f: goto 63
      // 62: athrow
      // 63: getfield net/minecraft/class_310.field_1724 Lnet/minecraft/class_746;
      // 66: invokevirtual net/minecraft/class_746.method_31548 ()Lnet/minecraft/class_1661;
      // 69: aload 0
      // 6a: if_acmpeq 70
      // 6d: bipush -1
      // 6e: ireturn
      // 6f: athrow
      // 70: getstatic qeaa361f143ee4a0894bd168fd9b30c66/qf4ccf8f5435d4a78bdca4d6a018b578e/aabbabbbb.aba Lqeaa361f143ee4a0894bd168fd9b30c66/qf4ccf8f5435d4a78bdca4d6a018b578e/abaaabaa;
      // 73: new qeaa361f143ee4a0894bd168fd9b30c66/qf4ccf8f5435d4a78bdca4d6a018b578e/aaaababaa
      // 76: dup
      // 77: aload 2
      // 78: invokespecial qeaa361f143ee4a0894bd168fd9b30c66/qf4ccf8f5435d4a78bdca4d6a018b578e/aaaababaa.<init> (Lnet/minecraft/class_310;)V
      // 7b: invokevirtual qeaa361f143ee4a0894bd168fd9b30c66/qf4ccf8f5435d4a78bdca4d6a018b578e/abaaabaa.baba (Lqeaa361f143ee4a0894bd168fd9b30c66/qf4ccf8f5435d4a78bdca4d6a018b578e/abbbaaa;)I
      // 7e: ireturn
   }

   public static boolean bbabbb(class_310 param0, class_3966 param1) {
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
      // 09: ifnull 27
      // 0c: goto 10
      // 0f: athrow
      // 10: aload 0
      // 11: getfield net/minecraft/class_310.field_1724 Lnet/minecraft/class_746;
      // 14: ifnull 27
      // 17: aload 1
      // 18: iload 2
      // 19: ifne 2b
      // 1c: goto 20
      // 1f: athrow
      // 20: ifnonnull 2a
      // 23: goto 27
      // 26: athrow
      // 27: bipush 0
      // 28: ireturn
      // 29: athrow
      // 2a: aload 1
      // 2b: iload 2
      // 2c: ifne 5d
      // 2f: invokevirtual net/minecraft/class_3966.method_17782 ()Lnet/minecraft/class_1297;
      // 32: instanceof net/minecraft/class_1511
      // 35: ifeq 55
      // 38: goto 3c
      // 3b: athrow
      // 3c: aload 0
      // 3d: iload 2
      // 3e: ifne 5a
      // 41: goto 45
      // 44: athrow
      // 45: getfield net/minecraft/class_310.field_1724 Lnet/minecraft/class_746;
      // 48: invokevirtual net/minecraft/class_746.method_6115 ()Z
      // 4b: ifeq 55
      // 4e: goto 52
      // 51: athrow
      // 52: bipush 0
      // 53: ireturn
      // 54: athrow
      // 55: aload 0
      // 56: invokestatic qeaa361f143ee4a0894bd168fd9b30c66/qf4ccf8f5435d4a78bdca4d6a018b578e/aabbabbbb.aabbaba (Lnet/minecraft/class_310;)V
      // 59: aload 0
      // 5a: getfield net/minecraft/class_310.field_1765 Lnet/minecraft/class_239;
      // 5d: astore 3
      // 5e: aload 0
      // 5f: aload 1
      // 60: putfield net/minecraft/class_310.field_1765 Lnet/minecraft/class_239;
      // 63: aload 0
      // 64: invokestatic qeaa361f143ee4a0894bd168fd9b30c66/qf4ccf8f5435d4a78bdca4d6a018b578e/aabbabbbb.babbaab (Lnet/minecraft/class_310;)Z
      // 67: istore 4
      // 69: aload 0
      // 6a: aload 3
      // 6b: putfield net/minecraft/class_310.field_1765 Lnet/minecraft/class_239;
      // 6e: iload 4
      // 70: ireturn
      // 71: astore 5
      // 73: aload 0
      // 74: aload 3
      // 75: putfield net/minecraft/class_310.field_1765 Lnet/minecraft/class_239;
      // 78: aload 5
      // 7a: athrow
   }

   public static void bbbaaa(class_310 param0) {
      // $VF: Couldn't be decompiled
      // Please report this to the Vineflower issue tracker, at https://github.com/Vineflower/vineflower/issues with a copy of the class file (if you have the rights to distribute it!)
      // java.lang.RuntimeException: parsing failure!
      //   at org.jetbrains.java.decompiler.modules.decompiler.decompose.DomHelper.parseGraph(DomHelper.java:211)
      //   at org.jetbrains.java.decompiler.main.rels.MethodProcessor.codeToJava(MethodProcessor.java:166)
      //
      // Bytecode:
      // 00: getstatic qeaa361f143ee4a0894bd168fd9b30c66/qf4ccf8f5435d4a78bdca4d6a018b578e/baaabbaa.bba I
      // 03: istore 1
      // 04: getstatic qeaa361f143ee4a0894bd168fd9b30c66/qf4ccf8f5435d4a78bdca4d6a018b578e/aabbabbbb.aabaab Z
      // 07: iload 1
      // 08: ifne 14
      // 0b: ifne 13
      // 0e: goto 12
      // 11: athrow
      // 12: return
      // 13: bipush 0
      // 14: putstatic qeaa361f143ee4a0894bd168fd9b30c66/qf4ccf8f5435d4a78bdca4d6a018b578e/aabbabbbb.aabaab Z
      // 17: aload 0
      // 18: iload 1
      // 19: ifne 24
      // 1c: ifnull 45
      // 1f: goto 23
      // 22: athrow
      // 23: aload 0
      // 24: iload 1
      // 25: ifne 37
      // 28: getfield net/minecraft/class_310.field_1724 Lnet/minecraft/class_746;
      // 2b: ifnull 45
      // 2e: goto 32
      // 31: athrow
      // 32: aload 0
      // 33: goto 37
      // 36: athrow
      // 37: iload 1
      // 38: ifne 48
      // 3b: invokevirtual net/minecraft/class_310.method_1562 ()Lnet/minecraft/class_634;
      // 3e: ifnonnull 47
      // 41: goto 45
      // 44: athrow
      // 45: return
      // 46: athrow
      // 47: aload 0
      // 48: getfield net/minecraft/class_310.field_1724 Lnet/minecraft/class_746;
      // 4b: invokevirtual net/minecraft/class_746.method_31548 ()Lnet/minecraft/class_1661;
      // 4e: invokestatic qeaa361f143ee4a0894bd168fd9b30c66/qf4ccf8f5435d4a78bdca4d6a018b578e/bbbabaa.aaaab (Lnet/minecraft/class_1661;)I
      // 51: istore 2
      // 52: iload 2
      // 53: iload 1
      // 54: ifne 5f
      // 57: iflt 75
      // 5a: goto 5e
      // 5d: athrow
      // 5e: iload 2
      // 5f: ldc_w 604047270
      // 62: ldc_w -902620917
      // 65: ldc_w -1078331986
      // 68: ixor
      // 69: invokestatic qeaa361f143ee4a0894bd168fd9b30c66/qf4ccf8f5435d4a78bdca4d6a018b578e/aabbabbbb.b (II)I
      // 6c: ldc2_w 6146930655705273313
      // 6f: invokestatic qeaa361f143ee4a0894bd168fd9b30c66/qf4ccf8f5435d4a78bdca4d6a018b578e/aabbabbbb.aaaaa (IJ)I
      // 72: if_icmple 77
      // 75: return
      // 76: athrow
      // 77: new qeaa361f143ee4a0894bd168fd9b30c66/qf4ccf8f5435d4a78bdca4d6a018b578e/aaaababaa
      // 7a: dup
      // 7b: aload 0
      // 7c: invokespecial qeaa361f143ee4a0894bd168fd9b30c66/qf4ccf8f5435d4a78bdca4d6a018b578e/aaaababaa.<init> (Lnet/minecraft/class_310;)V
      // 7f: getstatic qeaa361f143ee4a0894bd168fd9b30c66/qf4ccf8f5435d4a78bdca4d6a018b578e/bbbabbab.b Lqeaa361f143ee4a0894bd168fd9b30c66/qf4ccf8f5435d4a78bdca4d6a018b578e/bbbabbab;
      // 82: iload 2
      // 83: invokevirtual qeaa361f143ee4a0894bd168fd9b30c66/qf4ccf8f5435d4a78bdca4d6a018b578e/aaaababaa.ba (Lqeaa361f143ee4a0894bd168fd9b30c66/qf4ccf8f5435d4a78bdca4d6a018b578e/bbbabbab;I)V
      // 86: return
   }

   public static boolean bbbaab(class_310 param0, Object param1, int param2, boolean param3, BooleanSupplier param4) {
      // $VF: Couldn't be decompiled
      // Please report this to the Vineflower issue tracker, at https://github.com/Vineflower/vineflower/issues with a copy of the class file (if you have the rights to distribute it!)
      // java.lang.NullPointerException: Cannot invoke "org.jetbrains.java.decompiler.code.cfg.ExceptionRangeCFG.isCircular()" because "range" is null
      //   at org.jetbrains.java.decompiler.modules.decompiler.decompose.DomHelper.graphToStatement(DomHelper.java:84)
      //   at org.jetbrains.java.decompiler.modules.decompiler.decompose.DomHelper.parseGraph(DomHelper.java:203)
      //   at org.jetbrains.java.decompiler.main.rels.MethodProcessor.codeToJava(MethodProcessor.java:166)
      //
      // Bytecode:
      // 000: getstatic qeaa361f143ee4a0894bd168fd9b30c66/qf4ccf8f5435d4a78bdca4d6a018b578e/baaabbaa.bba I
      // 003: istore 5
      // 005: aload 0
      // 006: iload 5
      // 008: ifne 013
      // 00b: ifnull 08f
      // 00e: goto 012
      // 011: athrow
      // 012: aload 0
      // 013: iload 5
      // 015: ifne 027
      // 018: getfield net/minecraft/class_310.field_1724 Lnet/minecraft/class_746;
      // 01b: ifnull 08f
      // 01e: goto 022
      // 021: athrow
      // 022: aload 0
      // 023: goto 027
      // 026: athrow
      // 027: iload 5
      // 029: ifne 03b
      // 02c: invokevirtual net/minecraft/class_310.method_1562 ()Lnet/minecraft/class_634;
      // 02f: ifnull 08f
      // 032: goto 036
      // 035: athrow
      // 036: aload 1
      // 037: goto 03b
      // 03a: athrow
      // 03b: ifnull 08f
      // 03e: aload 4
      // 040: ifnull 08f
      // 043: goto 047
      // 046: athrow
      // 047: iload 2
      // 048: iload 5
      // 04a: ifne 090
      // 04d: goto 051
      // 050: athrow
      // 051: iflt 08f
      // 054: goto 058
      // 057: athrow
      // 058: iload 2
      // 059: iload 5
      // 05b: ifne 090
      // 05e: goto 062
      // 061: athrow
      // 062: ldc_w 604047289
      // 065: ldc_w 566361583
      // 068: ldc_w -343948791
      // 06b: ixor
      // 06c: invokestatic qeaa361f143ee4a0894bd168fd9b30c66/qf4ccf8f5435d4a78bdca4d6a018b578e/aabbabbbb.b (II)I
      // 06f: ldc2_w 6146930655705273313
      // 072: invokestatic qeaa361f143ee4a0894bd168fd9b30c66/qf4ccf8f5435d4a78bdca4d6a018b578e/aabbabbbb.aaaaa (IJ)I
      // 075: if_icmpgt 08f
      // 078: goto 07c
      // 07b: athrow
      // 07c: getstatic qeaa361f143ee4a0894bd168fd9b30c66/qf4ccf8f5435d4a78bdca4d6a018b578e/aabbabbbb.aaaba Z
      // 07f: iload 5
      // 081: ifne 095
      // 084: goto 088
      // 087: athrow
      // 088: ifeq 091
      // 08b: goto 08f
      // 08e: athrow
      // 08f: bipush 0
      // 090: ireturn
      // 091: aload 0
      // 092: invokevirtual net/minecraft/class_310.method_18854 ()Z
      // 095: ifne 0c1
      // 098: new java/lang/IllegalStateException
      // 09b: dup
      // 09c: ldc_w 604047288
      // 09f: ldc_w 566361583
      // 0a2: ldc_w -21946962
      // 0a5: ixor
      // 0a6: invokestatic qeaa361f143ee4a0894bd168fd9b30c66/qf4ccf8f5435d4a78bdca4d6a018b578e/aabbabbbb.b (II)I
      // 0a9: ldc_w 604047291
      // 0ac: ldc_w 566361583
      // 0af: ldc_w 684075894
      // 0b2: ixor
      // 0b3: invokestatic qeaa361f143ee4a0894bd168fd9b30c66/qf4ccf8f5435d4a78bdca4d6a018b578e/aabbabbbb.b (II)I
      // 0b6: invokestatic qeaa361f143ee4a0894bd168fd9b30c66/qf4ccf8f5435d4a78bdca4d6a018b578e/aabbabbbb.bbaabaa (II)Ljava/lang/String;
      // 0b9: invokestatic qeaa361f143ee4a0894bd168fd9b30c66/qf4ccf8f5435d4a78bdca4d6a018b578e/aabbaaaba.abba (Ljava/lang/String;)Ljava/lang/String;
      // 0bc: invokespecial java/lang/IllegalStateException.<init> (Ljava/lang/String;)V
      // 0bf: athrow
      // 0c0: athrow
      // 0c1: getstatic qeaa361f143ee4a0894bd168fd9b30c66/qf4ccf8f5435d4a78bdca4d6a018b578e/aabbabbbb.baab Lqeaa361f143ee4a0894bd168fd9b30c66/qf4ccf8f5435d4a78bdca4d6a018b578e/bbaaba;
      // 0c4: astore 6
      // 0c6: getstatic qeaa361f143ee4a0894bd168fd9b30c66/qf4ccf8f5435d4a78bdca4d6a018b578e/aabbabbbb.aabaa Z
      // 0c9: istore 7
      // 0cb: aload 6
      // 0cd: iload 5
      // 0cf: ifne 0db
      // 0d2: ifnull 120
      // 0d5: goto 0d9
      // 0d8: athrow
      // 0d9: aload 6
      // 0db: iload 5
      // 0dd: ifne 0fa
      // 0e0: invokevirtual qeaa361f143ee4a0894bd168fd9b30c66/qf4ccf8f5435d4a78bdca4d6a018b578e/bbaaba.b ()Lnet/minecraft/class_746;
      // 0e3: aload 0
      // 0e4: getfield net/minecraft/class_310.field_1724 Lnet/minecraft/class_746;
      // 0e7: if_acmpne 115
      // 0ea: goto 0ee
      // 0ed: athrow
      // 0ee: aload 6
      // 0f0: invokevirtual qeaa361f143ee4a0894bd168fd9b30c66/qf4ccf8f5435d4a78bdca4d6a018b578e/bbaaba.aa ()Lqeaa361f143ee4a0894bd168fd9b30c66/qf4ccf8f5435d4a78bdca4d6a018b578e/abaabbba;
      // 0f3: invokevirtual qeaa361f143ee4a0894bd168fd9b30c66/qf4ccf8f5435d4a78bdca4d6a018b578e/abaabbba.a ()Ljava/lang/Object;
      // 0f6: goto 0fa
      // 0f9: athrow
      // 0fa: aload 1
      // 0fb: if_acmpne 115
      // 0fe: getstatic qeaa361f143ee4a0894bd168fd9b30c66/qf4ccf8f5435d4a78bdca4d6a018b578e/aabbabbbb.aba Lqeaa361f143ee4a0894bd168fd9b30c66/qf4ccf8f5435d4a78bdca4d6a018b578e/abaaabaa;
      // 101: aload 1
      // 102: invokevirtual qeaa361f143ee4a0894bd168fd9b30c66/qf4ccf8f5435d4a78bdca4d6a018b578e/abaaabaa.abbb (Ljava/lang/Object;)Z
      // 105: iload 5
      // 107: ifne 11d
      // 10a: goto 10e
      // 10d: athrow
      // 10e: ifne 118
      // 111: goto 115
      // 114: athrow
      // 115: bipush 0
      // 116: ireturn
      // 117: athrow
      // 118: aconst_null
      // 119: putstatic qeaa361f143ee4a0894bd168fd9b30c66/qf4ccf8f5435d4a78bdca4d6a018b578e/aabbabbbb.baab Lqeaa361f143ee4a0894bd168fd9b30c66/qf4ccf8f5435d4a78bdca4d6a018b578e/bbaaba;
      // 11c: bipush 0
      // 11d: putstatic qeaa361f143ee4a0894bd168fd9b30c66/qf4ccf8f5435d4a78bdca4d6a018b578e/aabbabbbb.aabaa Z
      // 120: getstatic qeaa361f143ee4a0894bd168fd9b30c66/qf4ccf8f5435d4a78bdca4d6a018b578e/aabbabbbb.aba Lqeaa361f143ee4a0894bd168fd9b30c66/qf4ccf8f5435d4a78bdca4d6a018b578e/abaaabaa;
      // 123: aload 1
      // 124: invokevirtual qeaa361f143ee4a0894bd168fd9b30c66/qf4ccf8f5435d4a78bdca4d6a018b578e/abaaabaa.bbb (Ljava/lang/Object;)Z
      // 127: istore 8
      // 129: new qeaa361f143ee4a0894bd168fd9b30c66/qf4ccf8f5435d4a78bdca4d6a018b578e/aaaababaa
      // 12c: dup
      // 12d: aload 0
      // 12e: invokespecial qeaa361f143ee4a0894bd168fd9b30c66/qf4ccf8f5435d4a78bdca4d6a018b578e/aaaababaa.<init> (Lnet/minecraft/class_310;)V
      // 131: astore 9
      // 133: getstatic qeaa361f143ee4a0894bd168fd9b30c66/qf4ccf8f5435d4a78bdca4d6a018b578e/aabbabbbb.aba Lqeaa361f143ee4a0894bd168fd9b30c66/qf4ccf8f5435d4a78bdca4d6a018b578e/abaaabaa;
      // 136: aload 9
      // 138: aload 1
      // 139: iload 2
      // 13a: getstatic qeaa361f143ee4a0894bd168fd9b30c66/qf4ccf8f5435d4a78bdca4d6a018b578e/bbbabbab.b Lqeaa361f143ee4a0894bd168fd9b30c66/qf4ccf8f5435d4a78bdca4d6a018b578e/bbbabbab;
      // 13d: bipush -1
      // 13e: iload 3
      // 13f: aconst_null
      // 140: invokevirtual qeaa361f143ee4a0894bd168fd9b30c66/qf4ccf8f5435d4a78bdca4d6a018b578e/abaaabaa.bba (Lqeaa361f143ee4a0894bd168fd9b30c66/qf4ccf8f5435d4a78bdca4d6a018b578e/abbbaaa;Ljava/lang/Object;ILqeaa361f143ee4a0894bd168fd9b30c66/qf4ccf8f5435d4a78bdca4d6a018b578e/bbbabbab;IZLjava/lang/Runnable;)Lqeaa361f143ee4a0894bd168fd9b30c66/qf4ccf8f5435d4a78bdca4d6a018b578e/abaabbba;
      // 143: astore 10
      // 145: aload 10
      // 147: iload 5
      // 149: ifne 15d
      // 14c: invokevirtual qeaa361f143ee4a0894bd168fd9b30c66/qf4ccf8f5435d4a78bdca4d6a018b578e/abaabbba.ab ()J
      // 14f: lconst_0
      // 150: lcmp
      // 151: ifne 15b
      // 154: goto 158
      // 157: athrow
      // 158: bipush 0
      // 159: ireturn
      // 15a: athrow
      // 15b: aload 10
      // 15d: invokevirtual qeaa361f143ee4a0894bd168fd9b30c66/qf4ccf8f5435d4a78bdca4d6a018b578e/abaabbba.aa ()Z
      // 160: iload 5
      // 162: ifne 1ea
      // 165: ifeq 1c4
      // 168: goto 16c
      // 16b: athrow
      // 16c: aload 0
      // 16d: iload 5
      // 16f: ifne 1da
      // 172: goto 176
      // 175: athrow
      // 176: aload 9
      // 178: iload 2
      // 179: invokestatic qeaa361f143ee4a0894bd168fd9b30c66/qf4ccf8f5435d4a78bdca4d6a018b578e/aabbabbbb.bab (Lnet/minecraft/class_310;Lqeaa361f143ee4a0894bd168fd9b30c66/qf4ccf8f5435d4a78bdca4d6a018b578e/aaaababaa;I)Z
      // 17c: ifne 1c4
      // 17f: goto 183
      // 182: athrow
      // 183: iload 8
      // 185: iload 5
      // 187: ifne 1a0
      // 18a: goto 18e
      // 18d: athrow
      // 18e: ifne 1a6
      // 191: goto 195
      // 194: athrow
      // 195: getstatic qeaa361f143ee4a0894bd168fd9b30c66/qf4ccf8f5435d4a78bdca4d6a018b578e/aabbabbbb.aba Lqeaa361f143ee4a0894bd168fd9b30c66/qf4ccf8f5435d4a78bdca4d6a018b578e/abaaabaa;
      // 198: aload 1
      // 199: invokevirtual qeaa361f143ee4a0894bd168fd9b30c66/qf4ccf8f5435d4a78bdca4d6a018b578e/abaaabaa.aab (Ljava/lang/Object;)Z
      // 19c: goto 1a0
      // 19f: athrow
      // 1a0: pop
      // 1a1: iload 5
      // 1a3: ifeq 1c2
      // 1a6: aload 6
      // 1a8: iload 5
      // 1aa: ifne 1ba
      // 1ad: goto 1b1
      // 1b0: athrow
      // 1b1: ifnull 1c2
      // 1b4: goto 1b8
      // 1b7: athrow
      // 1b8: aload 6
      // 1ba: putstatic qeaa361f143ee4a0894bd168fd9b30c66/qf4ccf8f5435d4a78bdca4d6a018b578e/aabbabbbb.baab Lqeaa361f143ee4a0894bd168fd9b30c66/qf4ccf8f5435d4a78bdca4d6a018b578e/bbaaba;
      // 1bd: iload 7
      // 1bf: putstatic qeaa361f143ee4a0894bd168fd9b30c66/qf4ccf8f5435d4a78bdca4d6a018b578e/aabbabbbb.aabaa Z
      // 1c2: bipush 0
      // 1c3: ireturn
      // 1c4: getstatic qeaa361f143ee4a0894bd168fd9b30c66/qf4ccf8f5435d4a78bdca4d6a018b578e/aabbabbbb.bbbaa I
      // 1c7: bipush 1
      // 1c8: iadd
      // 1c9: putstatic qeaa361f143ee4a0894bd168fd9b30c66/qf4ccf8f5435d4a78bdca4d6a018b578e/aabbabbbb.bbbaa I
      // 1cc: getstatic qeaa361f143ee4a0894bd168fd9b30c66/qf4ccf8f5435d4a78bdca4d6a018b578e/aabbabbbb.aabbb I
      // 1cf: iload 5
      // 1d1: ifne 1fc
      // 1d4: bipush 1
      // 1d5: iadd
      // 1d6: putstatic qeaa361f143ee4a0894bd168fd9b30c66/qf4ccf8f5435d4a78bdca4d6a018b578e/aabbabbbb.aabbb I
      // 1d9: aload 0
      // 1da: getfield net/minecraft/class_310.field_1724 Lnet/minecraft/class_746;
      // 1dd: invokevirtual net/minecraft/class_746.method_31548 ()Lnet/minecraft/class_1661;
      // 1e0: iload 2
      // 1e1: invokevirtual net/minecraft/class_1661.method_5438 (I)Lnet/minecraft/class_1799;
      // 1e4: getstatic net/minecraft/class_1802.field_8301 Lnet/minecraft/class_1792;
      // 1e7: invokevirtual net/minecraft/class_1799.method_31574 (Lnet/minecraft/class_1792;)Z
      // 1ea: ifeq 1f5
      // 1ed: aload 0
      // 1ee: invokestatic qeaa361f143ee4a0894bd168fd9b30c66/qf4ccf8f5435d4a78bdca4d6a018b578e/aabbabbbb.bbba (Lnet/minecraft/class_310;)V
      // 1f1: goto 1f5
      // 1f4: athrow
      // 1f5: aload 4
      // 1f7: invokeinterface java/util/function/BooleanSupplier.getAsBoolean ()Z 1
      // 1fc: istore 11
      // 1fe: bipush 0
      // 1ff: getstatic qeaa361f143ee4a0894bd168fd9b30c66/qf4ccf8f5435d4a78bdca4d6a018b578e/aabbabbbb.aabbb I
      // 202: bipush 1
      // 203: isub
      // 204: invokestatic java/lang/Math.max (II)I
      // 207: iload 5
      // 209: ifne 252
      // 20c: putstatic qeaa361f143ee4a0894bd168fd9b30c66/qf4ccf8f5435d4a78bdca4d6a018b578e/aabbabbbb.aabbb I
      // 20f: bipush 0
      // 210: getstatic qeaa361f143ee4a0894bd168fd9b30c66/qf4ccf8f5435d4a78bdca4d6a018b578e/aabbabbbb.bbbaa I
      // 213: bipush 1
      // 214: isub
      // 215: invokestatic java/lang/Math.max (II)I
      // 218: putstatic qeaa361f143ee4a0894bd168fd9b30c66/qf4ccf8f5435d4a78bdca4d6a018b578e/aabbabbbb.bbbaa I
      // 21b: iload 3
      // 21c: ifeq 250
      // 21f: goto 223
      // 222: athrow
      // 223: aload 10
      // 225: invokevirtual qeaa361f143ee4a0894bd168fd9b30c66/qf4ccf8f5435d4a78bdca4d6a018b578e/abaabbba.aa ()Z
      // 228: iload 5
      // 22a: ifne 252
      // 22d: goto 231
      // 230: athrow
      // 231: ifeq 250
      // 234: goto 238
      // 237: athrow
      // 238: new qeaa361f143ee4a0894bd168fd9b30c66/qf4ccf8f5435d4a78bdca4d6a018b578e/bbaaba
      // 23b: dup
      // 23c: aload 0
      // 23d: getfield net/minecraft/class_310.field_1724 Lnet/minecraft/class_746;
      // 240: aload 10
      // 242: invokespecial qeaa361f143ee4a0894bd168fd9b30c66/qf4ccf8f5435d4a78bdca4d6a018b578e/bbaaba.<init> (Lnet/minecraft/class_746;Lqeaa361f143ee4a0894bd168fd9b30c66/qf4ccf8f5435d4a78bdca4d6a018b578e/abaabbba;)V
      // 245: putstatic qeaa361f143ee4a0894bd168fd9b30c66/qf4ccf8f5435d4a78bdca4d6a018b578e/aabbabbbb.baab Lqeaa361f143ee4a0894bd168fd9b30c66/qf4ccf8f5435d4a78bdca4d6a018b578e/bbaaba;
      // 248: bipush 0
      // 249: putstatic qeaa361f143ee4a0894bd168fd9b30c66/qf4ccf8f5435d4a78bdca4d6a018b578e/aabbabbbb.aabaa Z
      // 24c: goto 250
      // 24f: athrow
      // 250: iload 11
      // 252: ireturn
      // 253: astore 12
      // 255: bipush 0
      // 256: getstatic qeaa361f143ee4a0894bd168fd9b30c66/qf4ccf8f5435d4a78bdca4d6a018b578e/aabbabbbb.aabbb I
      // 259: bipush 1
      // 25a: isub
      // 25b: invokestatic java/lang/Math.max (II)I
      // 25e: iload 5
      // 260: ifne 283
      // 263: putstatic qeaa361f143ee4a0894bd168fd9b30c66/qf4ccf8f5435d4a78bdca4d6a018b578e/aabbabbbb.aabbb I
      // 266: bipush 0
      // 267: getstatic qeaa361f143ee4a0894bd168fd9b30c66/qf4ccf8f5435d4a78bdca4d6a018b578e/aabbabbbb.bbbaa I
      // 26a: bipush 1
      // 26b: isub
      // 26c: invokestatic java/lang/Math.max (II)I
      // 26f: putstatic qeaa361f143ee4a0894bd168fd9b30c66/qf4ccf8f5435d4a78bdca4d6a018b578e/aabbabbbb.bbbaa I
      // 272: iload 3
      // 273: ifeq 2a7
      // 276: goto 27a
      // 279: athrow
      // 27a: aload 10
      // 27c: invokevirtual qeaa361f143ee4a0894bd168fd9b30c66/qf4ccf8f5435d4a78bdca4d6a018b578e/abaabbba.aa ()Z
      // 27f: goto 283
      // 282: athrow
      // 283: iload 5
      // 285: ifne 2a4
      // 288: ifeq 2a7
      // 28b: goto 28f
      // 28e: athrow
      // 28f: new qeaa361f143ee4a0894bd168fd9b30c66/qf4ccf8f5435d4a78bdca4d6a018b578e/bbaaba
      // 292: dup
      // 293: aload 0
      // 294: getfield net/minecraft/class_310.field_1724 Lnet/minecraft/class_746;
      // 297: aload 10
      // 299: invokespecial qeaa361f143ee4a0894bd168fd9b30c66/qf4ccf8f5435d4a78bdca4d6a018b578e/bbaaba.<init> (Lnet/minecraft/class_746;Lqeaa361f143ee4a0894bd168fd9b30c66/qf4ccf8f5435d4a78bdca4d6a018b578e/abaabbba;)V
      // 29c: putstatic qeaa361f143ee4a0894bd168fd9b30c66/qf4ccf8f5435d4a78bdca4d6a018b578e/aabbabbbb.baab Lqeaa361f143ee4a0894bd168fd9b30c66/qf4ccf8f5435d4a78bdca4d6a018b578e/bbaaba;
      // 29f: bipush 0
      // 2a0: goto 2a4
      // 2a3: athrow
      // 2a4: putstatic qeaa361f143ee4a0894bd168fd9b30c66/qf4ccf8f5435d4a78bdca4d6a018b578e/aabbabbbb.aabaa Z
      // 2a7: aload 12
      // 2a9: athrow
   }

   public static class_3966 bbbaba(class_310 var0, double var1) {
      return abaaab(var0, var1, false);
   }

   public static void bbbabb() {
      try {
         if (baab != null) {
            aabaa = true;
         }
      } catch (MatchException var0) {
         throw var0;
      }
   }

   public static boolean bbbbaa() {
      babaaba();
      return true;
   }

   private static boolean bbbbab(class_310 param0, class_2680 param1, class_2338 param2, class_1799 param3) {
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
      // 06: getfield net/minecraft/class_310.field_1724 Lnet/minecraft/class_746;
      // 09: invokevirtual net/minecraft/class_746.method_5715 ()Z
      // 0c: iload 4
      // 0e: ifne 2b
      // 11: ifeq 1b
      // 14: goto 18
      // 17: athrow
      // 18: bipush 0
      // 19: ireturn
      // 1a: athrow
      // 1b: aload 1
      // 1c: iload 4
      // 1e: ifne 69
      // 21: getstatic net/minecraft/class_2246.field_23152 Lnet/minecraft/class_2248;
      // 24: invokevirtual net/minecraft/class_2680.method_27852 (Lnet/minecraft/class_2248;)Z
      // 27: goto 2b
      // 2a: athrow
      // 2b: ifeq 68
      // 2e: aload 1
      // 2f: getstatic net/minecraft/class_4969.field_23153 Lnet/minecraft/class_2758;
      // 32: invokevirtual net/minecraft/class_2680.method_11654 (Lnet/minecraft/class_2769;)Ljava/lang/Comparable;
      // 35: checkcast java/lang/Integer
      // 38: invokevirtual java/lang/Integer.intValue ()I
      // 3b: istore 5
      // 3d: iload 5
      // 3f: iload 4
      // 41: ifne 63
      // 44: ifgt 62
      // 47: goto 4b
      // 4a: athrow
      // 4b: aload 3
      // 4c: getstatic net/minecraft/class_1802.field_8801 Lnet/minecraft/class_1792;
      // 4f: invokevirtual net/minecraft/class_1799.method_31574 (Lnet/minecraft/class_1792;)Z
      // 52: iload 4
      // 54: ifne 63
      // 57: goto 5b
      // 5a: athrow
      // 5b: ifeq 66
      // 5e: goto 62
      // 61: athrow
      // 62: bipush 1
      // 63: goto 67
      // 66: bipush 0
      // 67: ireturn
      // 68: aload 1
      // 69: invokevirtual net/minecraft/class_2680.method_31709 ()Z
      // 6c: iload 4
      // 6e: ifne 8d
      // 71: ifne 88
      // 74: goto 78
      // 77: athrow
      // 78: aload 1
      // 79: aload 0
      // 7a: getfield net/minecraft/class_310.field_1687 Lnet/minecraft/class_638;
      // 7d: aload 2
      // 7e: invokevirtual net/minecraft/class_2680.method_26196 (Lnet/minecraft/class_1937;Lnet/minecraft/class_2338;)Lnet/minecraft/class_3908;
      // 81: ifnull 90
      // 84: goto 88
      // 87: athrow
      // 88: bipush 1
      // 89: goto 8d
      // 8c: athrow
      // 8d: goto 91
      // 90: bipush 0
      // 91: ireturn
   }

   public static boolean bbbbba(class_310 param0) {
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
      // 06: ifne 11
      // 09: ifnull 32
      // 0c: goto 10
      // 0f: athrow
      // 10: aload 0
      // 11: iload 1
      // 12: ifne 24
      // 15: getfield net/minecraft/class_310.field_1724 Lnet/minecraft/class_746;
      // 18: ifnull 32
      // 1b: goto 1f
      // 1e: athrow
      // 1f: aload 0
      // 20: goto 24
      // 23: athrow
      // 24: iload 1
      // 25: ifne 36
      // 28: getfield net/minecraft/class_310.field_1761 Lnet/minecraft/class_636;
      // 2b: ifnonnull 35
      // 2e: goto 32
      // 31: athrow
      // 32: bipush 0
      // 33: ireturn
      // 34: athrow
      // 35: aload 0
      // 36: aload 0
      // 37: getfield net/minecraft/class_310.field_1765 Lnet/minecraft/class_239;
      // 3a: invokestatic qeaa361f143ee4a0894bd168fd9b30c66/qf4ccf8f5435d4a78bdca4d6a018b578e/aabbabbbb.bababab (Lnet/minecraft/class_310;Lnet/minecraft/class_239;)Z
      // 3d: ireturn
   }

   public static float bbbbbb(class_2596 var0) {
      int var10000 = baaabbaa.bba;
      Float var2 = abbbaab(
         var0,
         aabbaaaba.abba(bbaabaa(b(604047290, 2072133597 ^ 462771104), b(604047293, 2072133597 ^ 1575660790))),
         aabbaaaba.abba(bbaabaa(b(604047292, 2072133597 ^ -1241564454), b(604047295, 2072133597 ^ 2000843750)))
      );
      int var1 = var10000;

      try {
         if (var1 != 0) {
            return var2;
         }

         if (var2 == null) {
            return Float.NaN;
         }
      } catch (MatchException var3) {
         throw var3;
      }

      return var2;
   }

   public static boolean aaaaaaa(class_310 var0, class_1297 var1) {
      return false;
   }

   public static class_1309 aaaaaab(class_310 param0, class_239 param1) {
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
      // 06: ifne 18
      // 09: instanceof net/minecraft/class_3966
      // 0c: ifeq 53
      // 0f: goto 13
      // 12: athrow
      // 13: aload 1
      // 14: goto 18
      // 17: athrow
      // 18: checkcast net/minecraft/class_3966
      // 1b: astore 3
      // 1c: aload 3
      // 1d: invokevirtual net/minecraft/class_3966.method_17782 ()Lnet/minecraft/class_1297;
      // 20: astore 5
      // 22: aload 5
      // 24: iload 2
      // 25: ifne 38
      // 28: instanceof net/minecraft/class_1309
      // 2b: ifeq 53
      // 2e: goto 32
      // 31: athrow
      // 32: aload 5
      // 34: goto 38
      // 37: athrow
      // 38: checkcast net/minecraft/class_1309
      // 3b: astore 4
      // 3d: aload 4
      // 3f: iload 2
      // 40: ifne 52
      // 43: invokestatic qeaa361f143ee4a0894bd168fd9b30c66/qf4ccf8f5435d4a78bdca4d6a018b578e/abaabbbba.aa (Lnet/minecraft/class_1309;)Z
      // 46: ifeq 50
      // 49: goto 4d
      // 4c: athrow
      // 4d: aconst_null
      // 4e: areturn
      // 4f: athrow
      // 50: aload 4
      // 52: areturn
      // 53: aconst_null
      // 54: areturn
   }

   public static boolean aaaaaba() {
      // $VF: Couldn't be decompiled
      // Please report this to the Vineflower issue tracker, at https://github.com/Vineflower/vineflower/issues with a copy of the class file (if you have the rights to distribute it!)
      // java.lang.RuntimeException: parsing failure!
      //   at org.jetbrains.java.decompiler.modules.decompiler.decompose.DomHelper.parseGraph(DomHelper.java:211)
      //   at org.jetbrains.java.decompiler.main.rels.MethodProcessor.codeToJava(MethodProcessor.java:166)
      //
      // Bytecode:
      // 00: getstatic qeaa361f143ee4a0894bd168fd9b30c66/qf4ccf8f5435d4a78bdca4d6a018b578e/baaabbaa.bba I
      // 03: istore 0
      // 04: getstatic qeaa361f143ee4a0894bd168fd9b30c66/qf4ccf8f5435d4a78bdca4d6a018b578e/aabbabbbb.aaaab I
      // 07: iload 0
      // 08: ifne 68
      // 0b: ifge 67
      // 0e: goto 12
      // 11: athrow
      // 12: getstatic qeaa361f143ee4a0894bd168fd9b30c66/qf4ccf8f5435d4a78bdca4d6a018b578e/aabbabbbb.baaba Z
      // 15: iload 0
      // 16: ifne 68
      // 19: goto 1d
      // 1c: athrow
      // 1d: ifne 67
      // 20: goto 24
      // 23: athrow
      // 24: getstatic qeaa361f143ee4a0894bd168fd9b30c66/qf4ccf8f5435d4a78bdca4d6a018b578e/aabbabbbb.aba Lqeaa361f143ee4a0894bd168fd9b30c66/qf4ccf8f5435d4a78bdca4d6a018b578e/abaaabaa;
      // 27: invokevirtual qeaa361f143ee4a0894bd168fd9b30c66/qf4ccf8f5435d4a78bdca4d6a018b578e/abaaabaa.ab ()Z
      // 2a: iload 0
      // 2b: ifne 68
      // 2e: goto 32
      // 31: athrow
      // 32: ifne 67
      // 35: goto 39
      // 38: athrow
      // 39: getstatic qeaa361f143ee4a0894bd168fd9b30c66/qf4ccf8f5435d4a78bdca4d6a018b578e/aabbabbbb.baab Lqeaa361f143ee4a0894bd168fd9b30c66/qf4ccf8f5435d4a78bdca4d6a018b578e/bbaaba;
      // 3c: ifnonnull 67
      // 3f: goto 43
      // 42: athrow
      // 43: getstatic qeaa361f143ee4a0894bd168fd9b30c66/qf4ccf8f5435d4a78bdca4d6a018b578e/aabbabbbb.bbbaa I
      // 46: iload 0
      // 47: ifne 68
      // 4a: goto 4e
      // 4d: athrow
      // 4e: ifgt 67
      // 51: goto 55
      // 54: athrow
      // 55: getstatic qeaa361f143ee4a0894bd168fd9b30c66/qf4ccf8f5435d4a78bdca4d6a018b578e/aabbabbbb.aabbb I
      // 58: iload 0
      // 59: ifne 68
      // 5c: goto 60
      // 5f: athrow
      // 60: ifle 6b
      // 63: goto 67
      // 66: athrow
      // 67: bipush 1
      // 68: goto 6c
      // 6b: bipush 0
      // 6c: ireturn
   }

   private static int[] aaaaabb(class_1011 var0) {
      int var8 = 574973259;
      int var10000 = baaabbaa.bba;
      String[] var2 = new String[]{
         aabbaaaba.abba(bbaabaa(b(604047294, var8 ^ 955506975), b(604047281, var8 ^ -2117572731))),
         aabbaaaba.abba(bbaabaa(b(604047280, var8 ^ 943648792), b(604047283, var8 ^ -698524730))),
         aabbaaaba.abba(bbaabaa(b(604047282, var8 ^ 692979429), b(604047285, var8 ^ 1232799359)))
      };
      int var3 = var2.length;
      int var1 = var10000;
      int var4 = 0;

      while (true) {
         if (var4 < var3) {
            String var5 = var2[var4];

            try {
               Method var6 = var0.getClass().getDeclaredMethod(var5);
               var6.setAccessible(true);
               int[] var7 = (int[])var6.invoke(var0);

               try {
                  if (aabbaaaba.abba(bbaabaa(b(604047284, var8 ^ -1805684787), b(604047287, var8 ^ 1449006769))).equals(var5)) {
                     aa(var7);
                  }
               } catch (ReflectiveOperationException var11) {
                  throw var11;
               }

               return var7;
            } catch (ReflectiveOperationException var12) {
               var4++;
               if (var1 == 0) {
                  continue;
               }
            }
         }

         try {
            Method var13 = var0.getClass()
               .getDeclaredMethod(
                  aabbaaaba.abba(bbaabaa(b(604047286, var8 ^ -1998249330), b(604047241, var8 ^ -609492276))),
                  int.class,
                  int.class
               );
            var13.setAccessible(true);
            int[] var14 = new int[var0.method_4307() * var0.method_4323()];
            var4 = 0;

            while (var4 < var0.method_4323()) {
               int var16 = 0;

               while (true) {
                  if (var16 < var0.method_4307()) {
                     try {
                        if (var1 != 0) {
                           break;
                        }

                        var14[var4 * var0.method_4307() + var16] = (Integer)var13.invoke(var0, var16, var4);
                        var16++;
                        if (var1 == 0) {
                           continue;
                        }
                     } catch (ReflectiveOperationException var9) {
                        throw var9;
                     }
                  }

                  var4++;
                  break;
               }

               if (var1 != 0) {
                  break;
               }
            }

            return var14;
         } catch (ReflectiveOperationException var10) {
            return null;
         }
      }
   }

   public static void aaaabaa(class_310 var0, Object var1, int var2) {
      aabbaab(var0, var1, var2, 1);
   }

   private static class_243 aaaabab(Object param0) {
      // $VF: Couldn't be decompiled
      // Please report this to the Vineflower issue tracker, at https://github.com/Vineflower/vineflower/issues with a copy of the class file (if you have the rights to distribute it!)
      // java.lang.RuntimeException: parsing failure!
      //   at org.jetbrains.java.decompiler.modules.decompiler.decompose.DomHelper.parseGraph(DomHelper.java:211)
      //   at org.jetbrains.java.decompiler.main.rels.MethodProcessor.codeToJava(MethodProcessor.java:166)
      //
      // Bytecode:
      // 000: ldc_w 112698791
      // 003: istore 9
      // 005: getstatic qeaa361f143ee4a0894bd168fd9b30c66/qf4ccf8f5435d4a78bdca4d6a018b578e/baaabbaa.bba I
      // 008: istore 1
      // 009: aload 0
      // 00a: iload 1
      // 00b: ifne 019
      // 00e: ifnonnull 018
      // 011: goto 015
      // 014: athrow
      // 015: aconst_null
      // 016: areturn
      // 017: athrow
      // 018: aload 0
      // 019: invokestatic qeaa361f143ee4a0894bd168fd9b30c66/qf4ccf8f5435d4a78bdca4d6a018b578e/aabbabbbb.abb (Ljava/lang/Object;)Lnet/minecraft/class_243;
      // 01c: astore 2
      // 01d: aload 2
      // 01e: iload 1
      // 01f: ifne 02a
      // 022: ifnull 02b
      // 025: goto 029
      // 028: athrow
      // 029: aload 2
      // 02a: areturn
      // 02b: bipush 5
      // 02c: anewarray 231
      // 02f: dup
      // 030: bipush 0
      // 031: ldc_w 604047240
      // 034: iload 9
      // 036: ldc_w -1308703705
      // 039: ixor
      // 03a: invokestatic qeaa361f143ee4a0894bd168fd9b30c66/qf4ccf8f5435d4a78bdca4d6a018b578e/aabbabbbb.b (II)I
      // 03d: ldc_w 604047243
      // 040: iload 9
      // 042: ldc_w 556458636
      // 045: ixor
      // 046: invokestatic qeaa361f143ee4a0894bd168fd9b30c66/qf4ccf8f5435d4a78bdca4d6a018b578e/aabbabbbb.b (II)I
      // 049: invokestatic qeaa361f143ee4a0894bd168fd9b30c66/qf4ccf8f5435d4a78bdca4d6a018b578e/aabbabbbb.bbaabaa (II)Ljava/lang/String;
      // 04c: invokestatic qeaa361f143ee4a0894bd168fd9b30c66/qf4ccf8f5435d4a78bdca4d6a018b578e/aabbaaaba.abba (Ljava/lang/String;)Ljava/lang/String;
      // 04f: aastore
      // 050: dup
      // 051: bipush 1
      // 052: ldc_w 604047242
      // 055: iload 9
      // 057: ldc_w -1562498031
      // 05a: ixor
      // 05b: invokestatic qeaa361f143ee4a0894bd168fd9b30c66/qf4ccf8f5435d4a78bdca4d6a018b578e/aabbabbbb.b (II)I
      // 05e: ldc_w 604047245
      // 061: iload 9
      // 063: ldc_w -80368818
      // 066: ixor
      // 067: invokestatic qeaa361f143ee4a0894bd168fd9b30c66/qf4ccf8f5435d4a78bdca4d6a018b578e/aabbabbbb.b (II)I
      // 06a: invokestatic qeaa361f143ee4a0894bd168fd9b30c66/qf4ccf8f5435d4a78bdca4d6a018b578e/aabbabbbb.bbaabaa (II)Ljava/lang/String;
      // 06d: invokestatic qeaa361f143ee4a0894bd168fd9b30c66/qf4ccf8f5435d4a78bdca4d6a018b578e/aabbaaaba.abba (Ljava/lang/String;)Ljava/lang/String;
      // 070: aastore
      // 071: dup
      // 072: bipush 2
      // 073: ldc_w 604047244
      // 076: iload 9
      // 078: ldc_w -1081727837
      // 07b: ixor
      // 07c: invokestatic qeaa361f143ee4a0894bd168fd9b30c66/qf4ccf8f5435d4a78bdca4d6a018b578e/aabbabbbb.b (II)I
      // 07f: ldc_w 604047247
      // 082: iload 9
      // 084: ldc_w -1138382315
      // 087: ixor
      // 088: invokestatic qeaa361f143ee4a0894bd168fd9b30c66/qf4ccf8f5435d4a78bdca4d6a018b578e/aabbabbbb.b (II)I
      // 08b: invokestatic qeaa361f143ee4a0894bd168fd9b30c66/qf4ccf8f5435d4a78bdca4d6a018b578e/aabbabbbb.bbaabaa (II)Ljava/lang/String;
      // 08e: invokestatic qeaa361f143ee4a0894bd168fd9b30c66/qf4ccf8f5435d4a78bdca4d6a018b578e/aabbaaaba.abba (Ljava/lang/String;)Ljava/lang/String;
      // 091: aastore
      // 092: dup
      // 093: bipush 3
      // 094: ldc_w 604047246
      // 097: iload 9
      // 099: ldc_w -1889266374
      // 09c: ixor
      // 09d: invokestatic qeaa361f143ee4a0894bd168fd9b30c66/qf4ccf8f5435d4a78bdca4d6a018b578e/aabbabbbb.b (II)I
      // 0a0: ldc_w 604047233
      // 0a3: iload 9
      // 0a5: ldc_w -613334360
      // 0a8: ixor
      // 0a9: invokestatic qeaa361f143ee4a0894bd168fd9b30c66/qf4ccf8f5435d4a78bdca4d6a018b578e/aabbabbbb.b (II)I
      // 0ac: invokestatic qeaa361f143ee4a0894bd168fd9b30c66/qf4ccf8f5435d4a78bdca4d6a018b578e/aabbabbbb.bbaabaa (II)Ljava/lang/String;
      // 0af: invokestatic qeaa361f143ee4a0894bd168fd9b30c66/qf4ccf8f5435d4a78bdca4d6a018b578e/aabbaaaba.abba (Ljava/lang/String;)Ljava/lang/String;
      // 0b2: aastore
      // 0b3: dup
      // 0b4: bipush 4
      // 0b5: ldc_w 604047232
      // 0b8: iload 9
      // 0ba: ldc_w 978863498
      // 0bd: ixor
      // 0be: invokestatic qeaa361f143ee4a0894bd168fd9b30c66/qf4ccf8f5435d4a78bdca4d6a018b578e/aabbabbbb.b (II)I
      // 0c1: ldc_w 604047235
      // 0c4: iload 9
      // 0c6: ldc_w -1503994130
      // 0c9: ixor
      // 0ca: invokestatic qeaa361f143ee4a0894bd168fd9b30c66/qf4ccf8f5435d4a78bdca4d6a018b578e/aabbabbbb.b (II)I
      // 0cd: invokestatic qeaa361f143ee4a0894bd168fd9b30c66/qf4ccf8f5435d4a78bdca4d6a018b578e/aabbabbbb.bbaabaa (II)Ljava/lang/String;
      // 0d0: invokestatic qeaa361f143ee4a0894bd168fd9b30c66/qf4ccf8f5435d4a78bdca4d6a018b578e/aabbaaaba.abba (Ljava/lang/String;)Ljava/lang/String;
      // 0d3: aastore
      // 0d4: astore 3
      // 0d5: aload 3
      // 0d6: arraylength
      // 0d7: istore 4
      // 0d9: bipush 0
      // 0da: istore 5
      // 0dc: iload 5
      // 0de: iload 4
      // 0e0: if_icmpge 123
      // 0e3: aload 3
      // 0e4: iload 5
      // 0e6: aaload
      // 0e7: astore 6
      // 0e9: aload 0
      // 0ea: invokevirtual java/lang/Object.getClass ()Ljava/lang/Class;
      // 0ed: aload 6
      // 0ef: bipush 0
      // 0f0: anewarray 810
      // 0f3: invokevirtual java/lang/Class.getMethod (Ljava/lang/String;[Ljava/lang/Class;)Ljava/lang/reflect/Method;
      // 0f6: aload 0
      // 0f7: bipush 0
      // 0f8: anewarray 4
      // 0fb: invokevirtual java/lang/reflect/Method.invoke (Ljava/lang/Object;[Ljava/lang/Object;)Ljava/lang/Object;
      // 0fe: astore 7
      // 100: aload 7
      // 102: invokestatic qeaa361f143ee4a0894bd168fd9b30c66/qf4ccf8f5435d4a78bdca4d6a018b578e/aabbabbbb.abb (Ljava/lang/Object;)Lnet/minecraft/class_243;
      // 105: astore 8
      // 107: aload 8
      // 109: iload 1
      // 10a: ifne 116
      // 10d: ifnull 117
      // 110: goto 114
      // 113: athrow
      // 114: aload 8
      // 116: areturn
      // 117: goto 11c
      // 11a: astore 7
      // 11c: iinc 5 1
      // 11f: iload 1
      // 120: ifeq 0dc
      // 123: aconst_null
      // 124: areturn
   }

   public static boolean aaaabba(class_310 param0, int param1) {
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
      // 11: iload 2
      // 12: ifne 23
      // 15: getfield net/minecraft/class_310.field_1724 Lnet/minecraft/class_746;
      // 18: ifnonnull 22
      // 1b: goto 1f
      // 1e: athrow
      // 1f: bipush 0
      // 20: ireturn
      // 21: athrow
      // 22: aload 0
      // 23: iload 2
      // 24: ifne 44
      // 27: getfield net/minecraft/class_310.field_1724 Lnet/minecraft/class_746;
      // 2a: invokevirtual net/minecraft/class_746.method_6115 ()Z
      // 2d: ifeq 43
      // 30: goto 34
      // 33: athrow
      // 34: aload 0
      // 35: getfield net/minecraft/class_310.field_1724 Lnet/minecraft/class_746;
      // 38: invokevirtual net/minecraft/class_746.method_6030 ()Lnet/minecraft/class_1799;
      // 3b: invokevirtual net/minecraft/class_1799.method_7976 ()Lnet/minecraft/class_1839;
      // 3e: invokestatic qeaa361f143ee4a0894bd168fd9b30c66/qf4ccf8f5435d4a78bdca4d6a018b578e/aabbabbbb.abaab (Lnet/minecraft/class_1839;)Z
      // 41: ireturn
      // 42: athrow
      // 43: aload 0
      // 44: iload 2
      // 45: ifne 56
      // 48: invokestatic qeaa361f143ee4a0894bd168fd9b30c66/qf4ccf8f5435d4a78bdca4d6a018b578e/aabbabbbb.ababbba (Lnet/minecraft/class_310;)Z
      // 4b: ifne 55
      // 4e: goto 52
      // 51: athrow
      // 52: bipush 0
      // 53: ireturn
      // 54: athrow
      // 55: aload 0
      // 56: getfield net/minecraft/class_310.field_1724 Lnet/minecraft/class_746;
      // 59: invokevirtual net/minecraft/class_746.method_6047 ()Lnet/minecraft/class_1799;
      // 5c: astore 3
      // 5d: aload 3
      // 5e: invokevirtual net/minecraft/class_1799.method_7976 ()Lnet/minecraft/class_1839;
      // 61: invokestatic qeaa361f143ee4a0894bd168fd9b30c66/qf4ccf8f5435d4a78bdca4d6a018b578e/aabbabbbb.abaab (Lnet/minecraft/class_1839;)Z
      // 64: iload 2
      // 65: ifne 73
      // 68: ifeq 72
      // 6b: goto 6f
      // 6e: athrow
      // 6f: bipush 1
      // 70: ireturn
      // 71: athrow
      // 72: iload 1
      // 73: iload 2
      // 74: ifne 7f
      // 77: iflt c0
      // 7a: goto 7e
      // 7d: athrow
      // 7e: iload 1
      // 7f: iload 2
      // 80: ifne ba
      // 83: ldc_w 604047234
      // 86: ldc_w -683853105
      // 89: ldc_w -2081309542
      // 8c: ixor
      // 8d: invokestatic qeaa361f143ee4a0894bd168fd9b30c66/qf4ccf8f5435d4a78bdca4d6a018b578e/aabbabbbb.b (II)I
      // 90: ldc2_w 1131576471880749436
      // 93: invokestatic qeaa361f143ee4a0894bd168fd9b30c66/qf4ccf8f5435d4a78bdca4d6a018b578e/aabbabbbb.aaaaa (IJ)I
      // 96: if_icmpge c0
      // 99: goto 9d
      // 9c: athrow
      // 9d: aload 0
      // 9e: getfield net/minecraft/class_310.field_1724 Lnet/minecraft/class_746;
      // a1: invokevirtual net/minecraft/class_746.method_31548 ()Lnet/minecraft/class_1661;
      // a4: iload 1
      // a5: invokevirtual net/minecraft/class_1661.method_5438 (I)Lnet/minecraft/class_1799;
      // a8: iload 2
      // a9: ifne c1
      // ac: goto b0
      // af: athrow
      // b0: invokevirtual net/minecraft/class_1799.method_7976 ()Lnet/minecraft/class_1839;
      // b3: invokestatic qeaa361f143ee4a0894bd168fd9b30c66/qf4ccf8f5435d4a78bdca4d6a018b578e/aabbabbbb.abaab (Lnet/minecraft/class_1839;)Z
      // b6: goto ba
      // b9: athrow
      // ba: ifeq c0
      // bd: bipush 1
      // be: ireturn
      // bf: athrow
      // c0: aload 3
      // c1: iload 2
      // c2: ifne dd
      // c5: invokevirtual net/minecraft/class_1799.method_7976 ()Lnet/minecraft/class_1839;
      // c8: getstatic net/minecraft/class_1839.field_8952 Lnet/minecraft/class_1839;
      // cb: if_acmpne f2
      // ce: goto d2
      // d1: athrow
      // d2: aload 0
      // d3: getfield net/minecraft/class_310.field_1724 Lnet/minecraft/class_746;
      // d6: invokevirtual net/minecraft/class_746.method_6079 ()Lnet/minecraft/class_1799;
      // d9: goto dd
      // dc: athrow
      // dd: invokevirtual net/minecraft/class_1799.method_7976 ()Lnet/minecraft/class_1839;
      // e0: invokestatic qeaa361f143ee4a0894bd168fd9b30c66/qf4ccf8f5435d4a78bdca4d6a018b578e/aabbabbbb.abaab (Lnet/minecraft/class_1839;)Z
      // e3: iload 2
      // e4: ifne ef
      // e7: ifeq f2
      // ea: goto ee
      // ed: athrow
      // ee: bipush 1
      // ef: goto f3
      // f2: bipush 0
      // f3: ireturn
   }

   public static JsonElement aaaabbb(class_306 param0) {
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
      // 05: invokestatic qeaa361f143ee4a0894bd168fd9b30c66/qf4ccf8f5435d4a78bdca4d6a018b578e/aabbabbbb.bbaaaaa (Lnet/minecraft/class_3675$class_306;)Z
      // 08: ifeq 0e
      // 0b: aconst_null
      // 0c: areturn
      // 0d: athrow
      // 0e: new com/google/gson/JsonObject
      // 11: dup
      // 12: invokespecial com/google/gson/JsonObject.<init> ()V
      // 15: astore 2
      // 16: aload 2
      // 17: ldc_w 604047237
      // 1a: ldc_w -2135408164
      // 1d: ldc_w -1301690887
      // 20: ixor
      // 21: invokestatic qeaa361f143ee4a0894bd168fd9b30c66/qf4ccf8f5435d4a78bdca4d6a018b578e/aabbabbbb.b (II)I
      // 24: ldc_w 604047236
      // 27: ldc_w -2135408164
      // 2a: ldc_w -1923892097
      // 2d: ixor
      // 2e: invokestatic qeaa361f143ee4a0894bd168fd9b30c66/qf4ccf8f5435d4a78bdca4d6a018b578e/aabbabbbb.b (II)I
      // 31: invokestatic qeaa361f143ee4a0894bd168fd9b30c66/qf4ccf8f5435d4a78bdca4d6a018b578e/aabbabbbb.bbaabaa (II)Ljava/lang/String;
      // 34: invokestatic qeaa361f143ee4a0894bd168fd9b30c66/qf4ccf8f5435d4a78bdca4d6a018b578e/aabbaaaba.abba (Ljava/lang/String;)Ljava/lang/String;
      // 37: aload 0
      // 38: iload 1
      // 39: ifne 4f
      // 3c: invokevirtual net/minecraft/class_3675$class_306.method_1442 ()Lnet/minecraft/class_3675$class_307;
      // 3f: getstatic net/minecraft/class_3675$class_307.field_1672 Lnet/minecraft/class_3675$class_307;
      // 42: if_acmpne 4e
      // 45: goto 49
      // 48: athrow
      // 49: bipush 1
      // 4a: goto 5e
      // 4d: athrow
      // 4e: aload 0
      // 4f: invokevirtual net/minecraft/class_3675$class_306.method_1442 ()Lnet/minecraft/class_3675$class_307;
      // 52: getstatic net/minecraft/class_3675$class_307.field_1671 Lnet/minecraft/class_3675$class_307;
      // 55: if_acmpne 5d
      // 58: bipush 2
      // 59: goto 5e
      // 5c: athrow
      // 5d: bipush 0
      // 5e: invokestatic java/lang/Integer.valueOf (I)Ljava/lang/Integer;
      // 61: invokevirtual com/google/gson/JsonObject.addProperty (Ljava/lang/String;Ljava/lang/Number;)V
      // 64: aload 2
      // 65: ldc_w 604047239
      // 68: ldc_w -2135408164
      // 6b: ldc_w -2005888926
      // 6e: ixor
      // 6f: invokestatic qeaa361f143ee4a0894bd168fd9b30c66/qf4ccf8f5435d4a78bdca4d6a018b578e/aabbabbbb.b (II)I
      // 72: ldc_w 604047238
      // 75: ldc_w -2135408164
      // 78: ldc_w 202343409
      // 7b: ixor
      // 7c: invokestatic qeaa361f143ee4a0894bd168fd9b30c66/qf4ccf8f5435d4a78bdca4d6a018b578e/aabbabbbb.b (II)I
      // 7f: invokestatic qeaa361f143ee4a0894bd168fd9b30c66/qf4ccf8f5435d4a78bdca4d6a018b578e/aabbabbbb.bbaabaa (II)Ljava/lang/String;
      // 82: invokestatic qeaa361f143ee4a0894bd168fd9b30c66/qf4ccf8f5435d4a78bdca4d6a018b578e/aabbaaaba.abba (Ljava/lang/String;)Ljava/lang/String;
      // 85: aload 0
      // 86: invokevirtual net/minecraft/class_3675$class_306.method_1444 ()I
      // 89: invokestatic java/lang/Integer.valueOf (I)Ljava/lang/Integer;
      // 8c: invokevirtual com/google/gson/JsonObject.addProperty (Ljava/lang/String;Ljava/lang/Number;)V
      // 8f: aload 2
      // 90: areturn
   }

   public static void aaabaaa(class_1661 var0, int var1) {
      int var2 = baaabbaa.bba;

      class_1661 var10000;
      label22: {
         try {
            var10000 = var0;
            if (var2 != 0) {
               break label22;
            }

            if (var0 == null) {
               return;
            }
         } catch (MatchException var3) {
            throw var3;
         }

         var10000 = var0;
      }

      bbbabaa.aba(var10000, var1);
   }

   public static boolean aaabaab(class_310 param0, class_1297 param1, class_243 param2, class_243 param3) {
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
      // 08: ifne 13
      // 0b: ifnull 36
      // 0e: goto 12
      // 11: athrow
      // 12: aload 0
      // 13: getfield net/minecraft/class_310.field_1687 Lnet/minecraft/class_638;
      // 16: ifnull 36
      // 19: aload 1
      // 1a: ifnull 36
      // 1d: goto 21
      // 20: athrow
      // 21: aload 2
      // 22: iload 4
      // 24: ifne 33
      // 27: goto 2b
      // 2a: athrow
      // 2b: ifnull 36
      // 2e: goto 32
      // 31: athrow
      // 32: aload 3
      // 33: ifnonnull 39
      // 36: bipush 1
      // 37: ireturn
      // 38: athrow
      // 39: aload 0
      // 3a: getfield net/minecraft/class_310.field_1687 Lnet/minecraft/class_638;
      // 3d: new net/minecraft/class_3959
      // 40: dup
      // 41: aload 2
      // 42: aload 3
      // 43: getstatic net/minecraft/class_3959$class_3960.field_17559 Lnet/minecraft/class_3959$class_3960;
      // 46: getstatic net/minecraft/class_3959$class_242.field_1348 Lnet/minecraft/class_3959$class_242;
      // 49: aload 1
      // 4a: invokespecial net/minecraft/class_3959.<init> (Lnet/minecraft/class_243;Lnet/minecraft/class_243;Lnet/minecraft/class_3959$class_3960;Lnet/minecraft/class_3959$class_242;Lnet/minecraft/class_1297;)V
      // 4d: invokevirtual net/minecraft/class_638.method_17742 (Lnet/minecraft/class_3959;)Lnet/minecraft/class_3965;
      // 50: astore 5
      // 52: aload 5
      // 54: iload 4
      // 56: ifne 62
      // 59: ifnull 91
      // 5c: goto 60
      // 5f: athrow
      // 60: aload 5
      // 62: invokevirtual net/minecraft/class_3965.method_17783 ()Lnet/minecraft/class_239$class_240;
      // 65: getstatic net/minecraft/class_239$class_240.field_1332 Lnet/minecraft/class_239$class_240;
      // 68: if_acmpne 91
      // 6b: aload 2
      // 6c: aload 5
      // 6e: invokevirtual net/minecraft/class_3965.method_17784 ()Lnet/minecraft/class_243;
      // 71: invokevirtual net/minecraft/class_243.method_1025 (Lnet/minecraft/class_243;)D
      // 74: ldc2_w 1.0E-4
      // 77: dadd
      // 78: aload 2
      // 79: aload 3
      // 7a: invokevirtual net/minecraft/class_243.method_1025 (Lnet/minecraft/class_243;)D
      // 7d: dcmpg
      // 7e: iload 4
      // 80: ifne 9a
      // 83: goto 87
      // 86: athrow
      // 87: ifge 91
      // 8a: goto 8e
      // 8d: athrow
      // 8e: bipush 1
      // 8f: ireturn
      // 90: athrow
      // 91: aload 0
      // 92: getfield net/minecraft/class_310.field_1687 Lnet/minecraft/class_638;
      // 95: aload 2
      // 96: aload 3
      // 97: invokestatic qeaa361f143ee4a0894bd168fd9b30c66/qf4ccf8f5435d4a78bdca4d6a018b578e/aabbabbbb.bababbb (Lnet/minecraft/class_638;Lnet/minecraft/class_243;Lnet/minecraft/class_243;)Z
      // 9a: ireturn
   }

   public static void aaababa(class_310 param0, double param1, double param3, double param5, boolean param7) {
      // $VF: Couldn't be decompiled
      // Please report this to the Vineflower issue tracker, at https://github.com/Vineflower/vineflower/issues with a copy of the class file (if you have the rights to distribute it!)
      // java.lang.RuntimeException: parsing failure!
      //   at org.jetbrains.java.decompiler.modules.decompiler.decompose.DomHelper.parseGraph(DomHelper.java:211)
      //   at org.jetbrains.java.decompiler.main.rels.MethodProcessor.codeToJava(MethodProcessor.java:166)
      //
      // Bytecode:
      // 00: getstatic qeaa361f143ee4a0894bd168fd9b30c66/qf4ccf8f5435d4a78bdca4d6a018b578e/baaabbaa.bba I
      // 03: istore 8
      // 05: aload 0
      // 06: iload 8
      // 08: ifne 13
      // 0b: ifnull 19
      // 0e: goto 12
      // 11: athrow
      // 12: aload 0
      // 13: invokevirtual net/minecraft/class_310.method_1562 ()Lnet/minecraft/class_634;
      // 16: ifnonnull 1b
      // 19: return
      // 1a: athrow
      // 1b: ldc_w net/minecraft/class_2828$class_2829
      // 1e: astore 9
      // 20: aload 9
      // 22: bipush 5
      // 23: anewarray 810
      // 26: dup
      // 27: bipush 0
      // 28: getstatic java/lang/Double.TYPE Ljava/lang/Class;
      // 2b: aastore
      // 2c: dup
      // 2d: bipush 1
      // 2e: getstatic java/lang/Double.TYPE Ljava/lang/Class;
      // 31: aastore
      // 32: dup
      // 33: bipush 2
      // 34: getstatic java/lang/Double.TYPE Ljava/lang/Class;
      // 37: aastore
      // 38: dup
      // 39: bipush 3
      // 3a: getstatic java/lang/Boolean.TYPE Ljava/lang/Class;
      // 3d: aastore
      // 3e: dup
      // 3f: bipush 4
      // 40: getstatic java/lang/Boolean.TYPE Ljava/lang/Class;
      // 43: aastore
      // 44: invokevirtual java/lang/Class.getConstructor ([Ljava/lang/Class;)Ljava/lang/reflect/Constructor;
      // 47: astore 10
      // 49: aload 0
      // 4a: invokevirtual net/minecraft/class_310.method_1562 ()Lnet/minecraft/class_634;
      // 4d: aload 10
      // 4f: bipush 5
      // 50: anewarray 4
      // 53: dup
      // 54: bipush 0
      // 55: dload 1
      // 56: invokestatic java/lang/Double.valueOf (D)Ljava/lang/Double;
      // 59: aastore
      // 5a: dup
      // 5b: bipush 1
      // 5c: dload 3
      // 5d: invokestatic java/lang/Double.valueOf (D)Ljava/lang/Double;
      // 60: aastore
      // 61: dup
      // 62: bipush 2
      // 63: dload 5
      // 65: invokestatic java/lang/Double.valueOf (D)Ljava/lang/Double;
      // 68: aastore
      // 69: dup
      // 6a: bipush 3
      // 6b: iload 7
      // 6d: invokestatic java/lang/Boolean.valueOf (Z)Ljava/lang/Boolean;
      // 70: aastore
      // 71: dup
      // 72: bipush 4
      // 73: bipush 0
      // 74: invokestatic java/lang/Boolean.valueOf (Z)Ljava/lang/Boolean;
      // 77: aastore
      // 78: invokevirtual java/lang/reflect/Constructor.newInstance ([Ljava/lang/Object;)Ljava/lang/Object;
      // 7b: checkcast net/minecraft/class_2596
      // 7e: invokevirtual net/minecraft/class_634.method_52787 (Lnet/minecraft/class_2596;)V
      // 81: return
      // 82: astore 10
      // 84: aload 9
      // 86: bipush 4
      // 87: anewarray 810
      // 8a: dup
      // 8b: bipush 0
      // 8c: getstatic java/lang/Double.TYPE Ljava/lang/Class;
      // 8f: aastore
      // 90: dup
      // 91: bipush 1
      // 92: getstatic java/lang/Double.TYPE Ljava/lang/Class;
      // 95: aastore
      // 96: dup
      // 97: bipush 2
      // 98: getstatic java/lang/Double.TYPE Ljava/lang/Class;
      // 9b: aastore
      // 9c: dup
      // 9d: bipush 3
      // 9e: getstatic java/lang/Boolean.TYPE Ljava/lang/Class;
      // a1: aastore
      // a2: invokevirtual java/lang/Class.getConstructor ([Ljava/lang/Class;)Ljava/lang/reflect/Constructor;
      // a5: astore 10
      // a7: aload 0
      // a8: invokevirtual net/minecraft/class_310.method_1562 ()Lnet/minecraft/class_634;
      // ab: aload 10
      // ad: bipush 4
      // ae: anewarray 4
      // b1: dup
      // b2: bipush 0
      // b3: dload 1
      // b4: invokestatic java/lang/Double.valueOf (D)Ljava/lang/Double;
      // b7: aastore
      // b8: dup
      // b9: bipush 1
      // ba: dload 3
      // bb: invokestatic java/lang/Double.valueOf (D)Ljava/lang/Double;
      // be: aastore
      // bf: dup
      // c0: bipush 2
      // c1: dload 5
      // c3: invokestatic java/lang/Double.valueOf (D)Ljava/lang/Double;
      // c6: aastore
      // c7: dup
      // c8: bipush 3
      // c9: iload 7
      // cb: invokestatic java/lang/Boolean.valueOf (Z)Ljava/lang/Boolean;
      // ce: aastore
      // cf: invokevirtual java/lang/reflect/Constructor.newInstance ([Ljava/lang/Object;)Ljava/lang/Object;
      // d2: checkcast net/minecraft/class_2596
      // d5: invokevirtual net/minecraft/class_634.method_52787 (Lnet/minecraft/class_2596;)V
      // d8: goto dd
      // db: astore 9
      // dd: return
   }

   public static boolean aaababb(class_310 param0, int param1) {
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
      // 09: ifnull 4a
      // 0c: goto 10
      // 0f: athrow
      // 10: aload 0
      // 11: getfield net/minecraft/class_310.field_1690 Lnet/minecraft/class_315;
      // 14: ifnull 4a
      // 17: iload 1
      // 18: iload 2
      // 19: ifne 4f
      // 1c: goto 20
      // 1f: athrow
      // 20: iflt 4a
      // 23: goto 27
      // 26: athrow
      // 27: iload 1
      // 28: iload 2
      // 29: ifne 4f
      // 2c: goto 30
      // 2f: athrow
      // 30: ldc_w 604047257
      // 33: ldc_w 2075197695
      // 36: ldc_w -758184204
      // 39: ixor
      // 3a: invokestatic qeaa361f143ee4a0894bd168fd9b30c66/qf4ccf8f5435d4a78bdca4d6a018b578e/aabbabbbb.b (II)I
      // 3d: ldc2_w 6146930655705273313
      // 40: invokestatic qeaa361f143ee4a0894bd168fd9b30c66/qf4ccf8f5435d4a78bdca4d6a018b578e/aabbabbbb.aaaaa (IJ)I
      // 43: if_icmple 50
      // 46: goto 4a
      // 49: athrow
      // 4a: bipush 0
      // 4b: goto 4f
      // 4e: athrow
      // 4f: ireturn
      // 50: aload 0
      // 51: getfield net/minecraft/class_310.field_1690 Lnet/minecraft/class_315;
      // 54: getfield net/minecraft/class_315.field_1852 [Lnet/minecraft/class_304;
      // 57: astore 3
      // 58: aload 3
      // 59: ifnull 6e
      // 5c: iload 1
      // 5d: iload 2
      // 5e: ifne 73
      // 61: goto 65
      // 64: athrow
      // 65: aload 3
      // 66: arraylength
      // 67: if_icmplt 74
      // 6a: goto 6e
      // 6d: athrow
      // 6e: bipush 0
      // 6f: goto 73
      // 72: athrow
      // 73: ireturn
      // 74: aload 3
      // 75: iload 1
      // 76: aaload
      // 77: astore 4
      // 79: aload 4
      // 7b: iload 2
      // 7c: ifne 8b
      // 7f: ifnonnull 89
      // 82: goto 86
      // 85: athrow
      // 86: bipush 0
      // 87: ireturn
      // 88: athrow
      // 89: aload 4
      // 8b: invokestatic qeaa361f143ee4a0894bd168fd9b30c66/qf4ccf8f5435d4a78bdca4d6a018b578e/aabbabbbb.abbaabb (Lnet/minecraft/class_304;)Lnet/minecraft/class_3675$class_306;
      // 8e: astore 5
      // 90: iload 2
      // 91: ifne a8
      // 94: aload 5
      // 96: invokestatic qeaa361f143ee4a0894bd168fd9b30c66/qf4ccf8f5435d4a78bdca4d6a018b578e/aabbabbbb.bbaaaaa (Lnet/minecraft/class_3675$class_306;)Z
      // 99: ifeq a3
      // 9c: goto a0
      // 9f: athrow
      // a0: bipush 0
      // a1: ireturn
      // a2: athrow
      // a3: aload 4
      // a5: invokestatic qeaa361f143ee4a0894bd168fd9b30c66/qf4ccf8f5435d4a78bdca4d6a018b578e/aabbabbbb.aababab (Lnet/minecraft/class_304;)V
      // a8: bipush 1
      // a9: ireturn
   }

   public static void aaabbaa(class_310 param0, float param1, float param2) {
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
      // 06: ifne 11
      // 09: ifnull 1f
      // 0c: goto 10
      // 0f: athrow
      // 10: aload 0
      // 11: iload 3
      // 12: ifne 22
      // 15: getfield net/minecraft/class_310.field_1724 Lnet/minecraft/class_746;
      // 18: ifnonnull 21
      // 1b: goto 1f
      // 1e: athrow
      // 1f: return
      // 20: athrow
      // 21: aload 0
      // 22: fload 1
      // 23: fload 2
      // 24: invokestatic qeaa361f143ee4a0894bd168fd9b30c66/qf4ccf8f5435d4a78bdca4d6a018b578e/bbabbbb.aaaba (Lnet/minecraft/class_310;FF)[F
      // 27: astore 4
      // 29: iload 3
      // 2a: ifne 9f
      // 2d: aload 4
      // 2f: ifnonnull 38
      // 32: goto 36
      // 35: athrow
      // 36: return
      // 37: athrow
      // 38: aload 4
      // 3a: bipush 0
      // 3b: faload
      // 3c: fstore 1
      // 3d: aload 0
      // 3e: getfield net/minecraft/class_310.field_1724 Lnet/minecraft/class_746;
      // 41: fload 1
      // 42: invokevirtual net/minecraft/class_746.method_36456 (F)V
      // 45: aload 0
      // 46: getfield net/minecraft/class_310.field_1724 Lnet/minecraft/class_746;
      // 49: aload 4
      // 4b: bipush 1
      // 4c: faload
      // 4d: invokevirtual net/minecraft/class_746.method_36457 (F)V
      // 50: aload 0
      // 51: getfield net/minecraft/class_310.field_1724 Lnet/minecraft/class_746;
      // 54: fload 1
      // 55: invokevirtual net/minecraft/class_746.method_5847 (F)V
      // 58: aload 0
      // 59: getfield net/minecraft/class_310.field_1724 Lnet/minecraft/class_746;
      // 5c: invokevirtual java/lang/Object.getClass ()Ljava/lang/Class;
      // 5f: ldc_w 604047256
      // 62: ldc_w 29236725
      // 65: ldc_w 1202133057
      // 68: ixor
      // 69: invokestatic qeaa361f143ee4a0894bd168fd9b30c66/qf4ccf8f5435d4a78bdca4d6a018b578e/aabbabbbb.b (II)I
      // 6c: ldc_w 604047259
      // 6f: ldc_w 29236725
      // 72: ldc_w 1937005025
      // 75: ixor
      // 76: invokestatic qeaa361f143ee4a0894bd168fd9b30c66/qf4ccf8f5435d4a78bdca4d6a018b578e/aabbabbbb.b (II)I
      // 79: invokestatic qeaa361f143ee4a0894bd168fd9b30c66/qf4ccf8f5435d4a78bdca4d6a018b578e/aabbabbbb.bbaabaa (II)Ljava/lang/String;
      // 7c: invokestatic qeaa361f143ee4a0894bd168fd9b30c66/qf4ccf8f5435d4a78bdca4d6a018b578e/aabbaaaba.abba (Ljava/lang/String;)Ljava/lang/String;
      // 7f: bipush 1
      // 80: anewarray 810
      // 83: dup
      // 84: bipush 0
      // 85: getstatic java/lang/Float.TYPE Ljava/lang/Class;
      // 88: aastore
      // 89: invokevirtual java/lang/Class.getMethod (Ljava/lang/String;[Ljava/lang/Class;)Ljava/lang/reflect/Method;
      // 8c: aload 0
      // 8d: getfield net/minecraft/class_310.field_1724 Lnet/minecraft/class_746;
      // 90: bipush 1
      // 91: anewarray 4
      // 94: dup
      // 95: bipush 0
      // 96: fload 1
      // 97: invokestatic java/lang/Float.valueOf (F)Ljava/lang/Float;
      // 9a: aastore
      // 9b: invokevirtual java/lang/reflect/Method.invoke (Ljava/lang/Object;[Ljava/lang/Object;)Ljava/lang/Object;
      // 9e: pop
      // 9f: goto b2
      // a2: astore 5
      // a4: aload 5
      // a6: pop
      // a7: getstatic qeaa361f143ee4a0894bd168fd9b30c66/qf4ccf8f5435d4a78bdca4d6a018b578e/aabbabbbb.aaabb Ljava/lang/reflect/Field;
      // aa: aload 0
      // ab: getfield net/minecraft/class_310.field_1724 Lnet/minecraft/class_746;
      // ae: fload 1
      // af: invokestatic qeaa361f143ee4a0894bd168fd9b30c66/qf4ccf8f5435d4a78bdca4d6a018b578e/aabbabbbb.abbbaa (Ljava/lang/reflect/Field;Ljava/lang/Object;F)V
      // b2: return
   }

   private static void aaabbab(class_310 param0) {
      // $VF: Couldn't be decompiled
      // Please report this to the Vineflower issue tracker, at https://github.com/Vineflower/vineflower/issues with a copy of the class file (if you have the rights to distribute it!)
      // java.lang.RuntimeException: parsing failure!
      //   at org.jetbrains.java.decompiler.modules.decompiler.decompose.DomHelper.parseGraph(DomHelper.java:211)
      //   at org.jetbrains.java.decompiler.main.rels.MethodProcessor.codeToJava(MethodProcessor.java:166)
      //
      // Bytecode:
      // 00: getstatic qeaa361f143ee4a0894bd168fd9b30c66/qf4ccf8f5435d4a78bdca4d6a018b578e/baaabbaa.bba I
      // 03: aload 0
      // 04: getfield net/minecraft/class_310.field_1724 Lnet/minecraft/class_746;
      // 07: astore 2
      // 08: istore 1
      // 09: aload 2
      // 0a: iload 1
      // 0b: ifne 16
      // 0e: ifnull 29
      // 11: goto 15
      // 14: athrow
      // 15: aload 2
      // 16: iload 1
      // 17: ifne 2c
      // 1a: checkcast qeaa361f143ee4a0894bd168fd9b30c66/q9fca77a8c4f94f01ae294010b0bee919/abbaabbb
      // 1d: invokeinterface qeaa361f143ee4a0894bd168fd9b30c66/q9fca77a8c4f94f01ae294010b0bee919/abbaabbb.yj$isHandSwinging ()Z 1
      // 22: ifne 2b
      // 25: goto 29
      // 28: athrow
      // 29: return
      // 2a: athrow
      // 2b: aload 2
      // 2c: checkcast qeaa361f143ee4a0894bd168fd9b30c66/q9fca77a8c4f94f01ae294010b0bee919/abbaabbb
      // 2f: bipush -1
      // 30: invokeinterface qeaa361f143ee4a0894bd168fd9b30c66/q9fca77a8c4f94f01ae294010b0bee919/abbaabbb.yj$setHandSwingTicks (I)V 2
      // 35: return
   }

   public static boolean aaabbba(class_310 param0) {
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
      // 06: ifne 11
      // 09: ifnull 1f
      // 0c: goto 10
      // 0f: athrow
      // 10: aload 0
      // 11: iload 1
      // 12: ifne 23
      // 15: getfield net/minecraft/class_310.field_1690 Lnet/minecraft/class_315;
      // 18: ifnonnull 22
      // 1b: goto 1f
      // 1e: athrow
      // 1f: bipush 0
      // 20: ireturn
      // 21: athrow
      // 22: aload 0
      // 23: iload 1
      // 24: ifne 6d
      // 27: getfield net/minecraft/class_310.field_1690 Lnet/minecraft/class_315;
      // 2a: getfield net/minecraft/class_315.field_1904 Lnet/minecraft/class_304;
      // 2d: ifnull 6c
      // 30: goto 34
      // 33: athrow
      // 34: aload 0
      // 35: getfield net/minecraft/class_310.field_1690 Lnet/minecraft/class_315;
      // 38: getfield net/minecraft/class_315.field_1904 Lnet/minecraft/class_304;
      // 3b: invokevirtual net/minecraft/class_304.method_1434 ()Z
      // 3e: iload 1
      // 3f: ifne 6b
      // 42: goto 46
      // 45: athrow
      // 46: ifne 66
      // 49: goto 4d
      // 4c: athrow
      // 4d: aload 0
      // 4e: iload 1
      // 4f: ifne 6d
      // 52: goto 56
      // 55: athrow
      // 56: getfield net/minecraft/class_310.field_1690 Lnet/minecraft/class_315;
      // 59: getfield net/minecraft/class_315.field_1904 Lnet/minecraft/class_304;
      // 5c: invokestatic qeaa361f143ee4a0894bd168fd9b30c66/qf4ccf8f5435d4a78bdca4d6a018b578e/aabbabbbb.aabbbba (Lnet/minecraft/class_304;)I
      // 5f: ifle 6c
      // 62: goto 66
      // 65: athrow
      // 66: bipush 1
      // 67: goto 6b
      // 6a: athrow
      // 6b: ireturn
      // 6c: aload 0
      // 6d: iload 1
      // 6e: ifne 83
      // 71: getfield net/minecraft/class_310.field_1690 Lnet/minecraft/class_315;
      // 74: getfield net/minecraft/class_315.field_1886 Lnet/minecraft/class_304;
      // 77: ifnull b4
      // 7a: goto 7e
      // 7d: athrow
      // 7e: aload 0
      // 7f: goto 83
      // 82: athrow
      // 83: getfield net/minecraft/class_310.field_1690 Lnet/minecraft/class_315;
      // 86: getfield net/minecraft/class_315.field_1886 Lnet/minecraft/class_304;
      // 89: invokevirtual net/minecraft/class_304.method_1434 ()Z
      // 8c: iload 1
      // 8d: ifne b1
      // 90: ifne b0
      // 93: goto 97
      // 96: athrow
      // 97: aload 0
      // 98: getfield net/minecraft/class_310.field_1690 Lnet/minecraft/class_315;
      // 9b: getfield net/minecraft/class_315.field_1886 Lnet/minecraft/class_304;
      // 9e: invokestatic qeaa361f143ee4a0894bd168fd9b30c66/qf4ccf8f5435d4a78bdca4d6a018b578e/aabbabbbb.aabbbba (Lnet/minecraft/class_304;)I
      // a1: iload 1
      // a2: ifne b1
      // a5: goto a9
      // a8: athrow
      // a9: ifle b4
      // ac: goto b0
      // af: athrow
      // b0: bipush 1
      // b1: goto b5
      // b4: bipush 0
      // b5: ireturn
   }

   public static void aaabbbb() {
      int var10000 = b(604047258, -734241178 ^ 846803013);
      int var10001 = b(604047261, -734241178 ^ -1641456630);
      aabaab = false;
      bbab.clear();
      aba.aaabb();
      abbba = -1;
      bbabb = aaaaa(var10001, 8360211825956479750L);
      aaaaa = baabb(var10000, 534081000846442569L);
      bbbbbbba.baa();
      bbbaa = 0;
      baaaa = 0;
      aabab = 0;
      babb = 0;
      aabbb = 0;
      baaa = 0;
      aaaaaa = false;
      aaaba = false;
      baab = null;
      aabaa = false;
      ababa = null;
      aaaab = -1;
      baaba = false;
      babaa = false;
      Arrays.fill(bbaab, false);
      Arrays.fill(bbbbb, false);
   }

   public static class_1269 aabaaaa(class_310 param0, class_1268 param1) {
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
      // 09: ifnull 32
      // 0c: goto 10
      // 0f: athrow
      // 10: aload 0
      // 11: iload 2
      // 12: ifne 24
      // 15: getfield net/minecraft/class_310.field_1724 Lnet/minecraft/class_746;
      // 18: ifnull 32
      // 1b: goto 1f
      // 1e: athrow
      // 1f: aload 0
      // 20: goto 24
      // 23: athrow
      // 24: getfield net/minecraft/class_310.field_1761 Lnet/minecraft/class_636;
      // 27: ifnull 32
      // 2a: aload 1
      // 2b: ifnonnull 37
      // 2e: goto 32
      // 31: athrow
      // 32: getstatic net/minecraft/class_1269.field_5814 Lnet/minecraft/class_1269$class_9857;
      // 35: areturn
      // 36: athrow
      // 37: aload 0
      // 38: iload 2
      // 39: ifne 50
      // 3c: invokestatic qeaa361f143ee4a0894bd168fd9b30c66/qf4ccf8f5435d4a78bdca4d6a018b578e/aabbabbbb.aaaaba (Lnet/minecraft/class_310;)Z
      // 3f: ifne 4b
      // 42: goto 46
      // 45: athrow
      // 46: getstatic net/minecraft/class_1269.field_5814 Lnet/minecraft/class_1269$class_9857;
      // 49: areturn
      // 4a: athrow
      // 4b: aload 0
      // 4c: invokestatic qeaa361f143ee4a0894bd168fd9b30c66/qf4ccf8f5435d4a78bdca4d6a018b578e/aabbabbbb.bbaabbb (Lnet/minecraft/class_310;)V
      // 4f: aload 0
      // 50: getfield net/minecraft/class_310.field_1761 Lnet/minecraft/class_636;
      // 53: aload 0
      // 54: getfield net/minecraft/class_310.field_1724 Lnet/minecraft/class_746;
      // 57: aload 1
      // 58: invokevirtual net/minecraft/class_636.method_2919 (Lnet/minecraft/class_1657;Lnet/minecraft/class_1268;)Lnet/minecraft/class_1269;
      // 5b: astore 3
      // 5c: aload 3
      // 5d: iload 2
      // 5e: ifne 86
      // 61: ifnull 85
      // 64: goto 68
      // 67: athrow
      // 68: aload 3
      // 69: iload 2
      // 6a: ifne 86
      // 6d: goto 71
      // 70: athrow
      // 71: invokeinterface net/minecraft/class_1269.method_23665 ()Z 1
      // 76: ifeq 85
      // 79: goto 7d
      // 7c: athrow
      // 7d: aload 0
      // 7e: invokestatic qeaa361f143ee4a0894bd168fd9b30c66/qf4ccf8f5435d4a78bdca4d6a018b578e/aabbabbbb.baaaaba (Lnet/minecraft/class_310;)V
      // 81: goto 85
      // 84: athrow
      // 85: aload 3
      // 86: areturn
   }

   public static void aabaaab() {
      babab++;
   }

   public static boolean aabaaba(class_310 param0, class_3966 param1) {
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
      // 09: ifnull 44
      // 0c: goto 10
      // 0f: athrow
      // 10: aload 0
      // 11: iload 2
      // 12: ifne 24
      // 15: getfield net/minecraft/class_310.field_1724 Lnet/minecraft/class_746;
      // 18: ifnull 44
      // 1b: goto 1f
      // 1e: athrow
      // 1f: aload 0
      // 20: goto 24
      // 23: athrow
      // 24: getfield net/minecraft/class_310.field_1761 Lnet/minecraft/class_636;
      // 27: ifnull 44
      // 2a: aload 1
      // 2b: ifnull 44
      // 2e: goto 32
      // 31: athrow
      // 32: invokestatic qeaa361f143ee4a0894bd168fd9b30c66/qf4ccf8f5435d4a78bdca4d6a018b578e/bbabbbb.aaabb ()Z
      // 35: iload 2
      // 36: ifne 45
      // 39: goto 3d
      // 3c: athrow
      // 3d: ifne 46
      // 40: goto 44
      // 43: athrow
      // 44: bipush 0
      // 45: ireturn
      // 46: aload 1
      // 47: invokevirtual net/minecraft/class_3966.method_17782 ()Lnet/minecraft/class_1297;
      // 4a: astore 3
      // 4b: aload 3
      // 4c: ifnull 63
      // 4f: aload 0
      // 50: iload 2
      // 51: ifne 6b
      // 54: goto 58
      // 57: athrow
      // 58: aload 3
      // 59: invokestatic qeaa361f143ee4a0894bd168fd9b30c66/qf4ccf8f5435d4a78bdca4d6a018b578e/aabbabbbb.bbaabb (Lnet/minecraft/class_310;Lnet/minecraft/class_1297;)Z
      // 5c: ifeq 66
      // 5f: goto 63
      // 62: athrow
      // 63: bipush 0
      // 64: ireturn
      // 65: athrow
      // 66: aload 0
      // 67: invokestatic qeaa361f143ee4a0894bd168fd9b30c66/qf4ccf8f5435d4a78bdca4d6a018b578e/aabbabbbb.aabbaba (Lnet/minecraft/class_310;)V
      // 6a: aload 0
      // 6b: getfield net/minecraft/class_310.field_1765 Lnet/minecraft/class_239;
      // 6e: astore 4
      // 70: aload 0
      // 71: aload 1
      // 72: putfield net/minecraft/class_310.field_1765 Lnet/minecraft/class_239;
      // 75: getstatic qeaa361f143ee4a0894bd168fd9b30c66/qf4ccf8f5435d4a78bdca4d6a018b578e/aabbabbbb.bbbb I
      // 78: bipush 1
      // 79: iadd
      // 7a: putstatic qeaa361f143ee4a0894bd168fd9b30c66/qf4ccf8f5435d4a78bdca4d6a018b578e/aabbabbbb.bbbb I
      // 7d: aload 0
      // 7e: invokestatic qeaa361f143ee4a0894bd168fd9b30c66/qf4ccf8f5435d4a78bdca4d6a018b578e/aabbabbbb.aaaab (Lnet/minecraft/class_310;)Z
      // 81: istore 5
      // 83: bipush 0
      // 84: getstatic qeaa361f143ee4a0894bd168fd9b30c66/qf4ccf8f5435d4a78bdca4d6a018b578e/aabbabbbb.bbbb I
      // 87: bipush 1
      // 88: isub
      // 89: invokestatic java/lang/Math.max (II)I
      // 8c: putstatic qeaa361f143ee4a0894bd168fd9b30c66/qf4ccf8f5435d4a78bdca4d6a018b578e/aabbabbbb.bbbb I
      // 8f: aload 0
      // 90: aload 4
      // 92: putfield net/minecraft/class_310.field_1765 Lnet/minecraft/class_239;
      // 95: iload 5
      // 97: ireturn
      // 98: astore 6
      // 9a: bipush 0
      // 9b: getstatic qeaa361f143ee4a0894bd168fd9b30c66/qf4ccf8f5435d4a78bdca4d6a018b578e/aabbabbbb.bbbb I
      // 9e: bipush 1
      // 9f: isub
      // a0: invokestatic java/lang/Math.max (II)I
      // a3: putstatic qeaa361f143ee4a0894bd168fd9b30c66/qf4ccf8f5435d4a78bdca4d6a018b578e/aabbabbbb.bbbb I
      // a6: aload 0
      // a7: aload 4
      // a9: putfield net/minecraft/class_310.field_1765 Lnet/minecraft/class_239;
      // ac: aload 6
      // ae: athrow
   }

   public static boolean aabaabb(class_310 param0) {
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
      // 06: ifne 11
      // 09: ifnull 35
      // 0c: goto 10
      // 0f: athrow
      // 10: aload 0
      // 11: iload 1
      // 12: ifne 24
      // 15: getfield net/minecraft/class_310.field_1690 Lnet/minecraft/class_315;
      // 18: ifnull 35
      // 1b: goto 1f
      // 1e: athrow
      // 1f: aload 0
      // 20: goto 24
      // 23: athrow
      // 24: iload 1
      // 25: ifne 43
      // 28: getfield net/minecraft/class_310.field_1690 Lnet/minecraft/class_315;
      // 2b: getfield net/minecraft/class_315.field_1886 Lnet/minecraft/class_304;
      // 2e: ifnonnull 38
      // 31: goto 35
      // 34: athrow
      // 35: bipush 0
      // 36: ireturn
      // 37: athrow
      // 38: aload 0
      // 39: getfield net/minecraft/class_310.field_1690 Lnet/minecraft/class_315;
      // 3c: getfield net/minecraft/class_315.field_1886 Lnet/minecraft/class_304;
      // 3f: invokestatic qeaa361f143ee4a0894bd168fd9b30c66/qf4ccf8f5435d4a78bdca4d6a018b578e/aabbabbbb.bababaa (Lnet/minecraft/class_304;)V
      // 42: aload 0
      // 43: getfield net/minecraft/class_310.field_1690 Lnet/minecraft/class_315;
      // 46: getfield net/minecraft/class_315.field_1886 Lnet/minecraft/class_304;
      // 49: astore 2
      // 4a: aload 2
      // 4b: aload 2
      // 4c: invokestatic qeaa361f143ee4a0894bd168fd9b30c66/qf4ccf8f5435d4a78bdca4d6a018b578e/bbbabaa.aabb (Lnet/minecraft/class_304;)I
      // 4f: bipush 1
      // 50: iadd
      // 51: invokestatic qeaa361f143ee4a0894bd168fd9b30c66/qf4ccf8f5435d4a78bdca4d6a018b578e/bbbabaa.bbaa (Lnet/minecraft/class_304;I)V
      // 54: bipush 1
      // 55: ireturn
   }

   public static boolean aababaa(class_310 param0) {
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
      // 06: ifne 11
      // 09: ifnull 32
      // 0c: goto 10
      // 0f: athrow
      // 10: aload 0
      // 11: iload 1
      // 12: ifne 24
      // 15: getfield net/minecraft/class_310.field_1724 Lnet/minecraft/class_746;
      // 18: ifnull 32
      // 1b: goto 1f
      // 1e: athrow
      // 1f: aload 0
      // 20: goto 24
      // 23: athrow
      // 24: iload 1
      // 25: ifne 36
      // 28: getfield net/minecraft/class_310.field_1761 Lnet/minecraft/class_636;
      // 2b: ifnonnull 35
      // 2e: goto 32
      // 31: athrow
      // 32: bipush 0
      // 33: ireturn
      // 34: athrow
      // 35: aload 0
      // 36: iload 1
      // 37: ifne 4b
      // 3a: getfield net/minecraft/class_310.field_1724 Lnet/minecraft/class_746;
      // 3d: invokevirtual net/minecraft/class_746.method_6115 ()Z
      // 40: ifeq 4a
      // 43: goto 47
      // 46: athrow
      // 47: bipush 1
      // 48: ireturn
      // 49: athrow
      // 4a: aload 0
      // 4b: invokestatic qeaa361f143ee4a0894bd168fd9b30c66/qf4ccf8f5435d4a78bdca4d6a018b578e/bbbabaa.aaaaa (Lnet/minecraft/class_310;)I
      // 4e: iload 1
      // 4f: ifne 5a
      // 52: ifle 5d
      // 55: goto 59
      // 58: athrow
      // 59: bipush 1
      // 5a: goto 5e
      // 5d: bipush 0
      // 5e: ireturn
   }

   public static void aababab(class_304 param0) {
      // $VF: Couldn't be decompiled
      // Please report this to the Vineflower issue tracker, at https://github.com/Vineflower/vineflower/issues with a copy of the class file (if you have the rights to distribute it!)
      // java.lang.RuntimeException: parsing failure!
      //   at org.jetbrains.java.decompiler.modules.decompiler.decompose.DomHelper.parseGraph(DomHelper.java:211)
      //   at org.jetbrains.java.decompiler.main.rels.MethodProcessor.codeToJava(MethodProcessor.java:166)
      //
      // Bytecode:
      // 00: getstatic qeaa361f143ee4a0894bd168fd9b30c66/qf4ccf8f5435d4a78bdca4d6a018b578e/baaabbaa.bba I
      // 03: aload 0
      // 04: invokestatic qeaa361f143ee4a0894bd168fd9b30c66/qf4ccf8f5435d4a78bdca4d6a018b578e/aabbabbbb.abbaabb (Lnet/minecraft/class_304;)Lnet/minecraft/class_3675$class_306;
      // 07: astore 2
      // 08: istore 1
      // 09: aload 0
      // 0a: ifnull 18
      // 0d: aload 2
      // 0e: invokestatic qeaa361f143ee4a0894bd168fd9b30c66/qf4ccf8f5435d4a78bdca4d6a018b578e/aabbabbbb.bbaaaaa (Lnet/minecraft/class_3675$class_306;)Z
      // 11: ifeq 1a
      // 14: goto 18
      // 17: athrow
      // 18: return
      // 19: athrow
      // 1a: getstatic qeaa361f143ee4a0894bd168fd9b30c66/qf4ccf8f5435d4a78bdca4d6a018b578e/aabbabbbb.babbb Ljava/lang/reflect/Method;
      // 1d: iload 1
      // 1e: ifne 3b
      // 21: ifnull 3d
      // 24: goto 28
      // 27: athrow
      // 28: getstatic qeaa361f143ee4a0894bd168fd9b30c66/qf4ccf8f5435d4a78bdca4d6a018b578e/aabbabbbb.babbb Ljava/lang/reflect/Method;
      // 2b: aconst_null
      // 2c: bipush 1
      // 2d: anewarray 4
      // 30: dup
      // 31: bipush 0
      // 32: aload 2
      // 33: aastore
      // 34: invokevirtual java/lang/reflect/Method.invoke (Ljava/lang/Object;[Ljava/lang/Object;)Ljava/lang/Object;
      // 37: goto 3b
      // 3a: athrow
      // 3b: pop
      // 3c: return
      // 3d: goto 43
      // 40: astore 3
      // 41: aload 3
      // 42: pop
      // 43: aload 2
      // 44: invokestatic net/minecraft/class_304.method_1420 (Lnet/minecraft/class_3675$class_306;)V
      // 47: return
   }

   private static class_9331 aababba() {
      try {
         return class_9334.field_55878;
      } catch (Throwable var1) {
         return null;
      }
   }

   public static void aababbb(class_310 param0, aaaaab param1) {
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
      // 09: ifnull 59
      // 0c: goto 10
      // 0f: athrow
      // 10: aload 0
      // 11: getfield net/minecraft/class_310.field_1724 Lnet/minecraft/class_746;
      // 14: ifnull 59
      // 17: aload 1
      // 18: getstatic qeaa361f143ee4a0894bd168fd9b30c66/qf4ccf8f5435d4a78bdca4d6a018b578e/aaaaab.abb Lqeaa361f143ee4a0894bd168fd9b30c66/qf4ccf8f5435d4a78bdca4d6a018b578e/aaaaab;
      // 1b: if_acmpne 4a
      // 1e: goto 22
      // 21: athrow
      // 22: aload 0
      // 23: invokestatic qeaa361f143ee4a0894bd168fd9b30c66/qf4ccf8f5435d4a78bdca4d6a018b578e/aabbabbbb.abaaaab (Lnet/minecraft/class_310;)Z
      // 26: iload 2
      // 27: ifne 38
      // 2a: goto 2e
      // 2d: athrow
      // 2e: ifne 49
      // 31: goto 35
      // 34: athrow
      // 35: invokestatic qeaa361f143ee4a0894bd168fd9b30c66/qf4ccf8f5435d4a78bdca4d6a018b578e/aabbabbbb.abbbabb ()Z
      // 38: iload 2
      // 39: ifne 46
      // 3c: ifne 49
      // 3f: goto 43
      // 42: athrow
      // 43: invokestatic qeaa361f143ee4a0894bd168fd9b30c66/qf4ccf8f5435d4a78bdca4d6a018b578e/aabbabbbb.babbbb ()Z
      // 46: ifeq 4a
      // 49: return
      // 4a: getstatic qeaa361f143ee4a0894bd168fd9b30c66/qf4ccf8f5435d4a78bdca4d6a018b578e/aabbabbbb.aba Lqeaa361f143ee4a0894bd168fd9b30c66/qf4ccf8f5435d4a78bdca4d6a018b578e/abaaabaa;
      // 4d: new qeaa361f143ee4a0894bd168fd9b30c66/qf4ccf8f5435d4a78bdca4d6a018b578e/aaaababaa
      // 50: dup
      // 51: aload 0
      // 52: invokespecial qeaa361f143ee4a0894bd168fd9b30c66/qf4ccf8f5435d4a78bdca4d6a018b578e/aaaababaa.<init> (Lnet/minecraft/class_310;)V
      // 55: aload 1
      // 56: invokevirtual qeaa361f143ee4a0894bd168fd9b30c66/qf4ccf8f5435d4a78bdca4d6a018b578e/abaaabaa.baab (Lqeaa361f143ee4a0894bd168fd9b30c66/qf4ccf8f5435d4a78bdca4d6a018b578e/abbbaaa;Lqeaa361f143ee4a0894bd168fd9b30c66/qf4ccf8f5435d4a78bdca4d6a018b578e/aaaaab;)V
      // 59: return
   }

   public static boolean aabbaaa(class_310 var0, class_3966 var1) {
      aabbaba(var0);
      return babbaab(var0);
   }

   public static void aabbaab(class_310 param0, Object param1, int param2, int param3) {
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
      // 08: ifne 13
      // 0b: ifnull 2a
      // 0e: goto 12
      // 11: athrow
      // 12: aload 0
      // 13: iload 4
      // 15: ifne 27
      // 18: getfield net/minecraft/class_310.field_1724 Lnet/minecraft/class_746;
      // 1b: ifnull 2a
      // 1e: goto 22
      // 21: athrow
      // 22: aload 1
      // 23: goto 27
      // 26: athrow
      // 27: ifnonnull 2b
      // 2a: return
      // 2b: getstatic qeaa361f143ee4a0894bd168fd9b30c66/qf4ccf8f5435d4a78bdca4d6a018b578e/aabbabbbb.aba Lqeaa361f143ee4a0894bd168fd9b30c66/qf4ccf8f5435d4a78bdca4d6a018b578e/abaaabaa;
      // 2e: aload 1
      // 2f: aload 0
      // 30: getfield net/minecraft/class_310.field_1724 Lnet/minecraft/class_746;
      // 33: getfield net/minecraft/class_746.field_6012 I
      // 36: iload 3
      // 37: aconst_null
      // 38: invokevirtual qeaa361f143ee4a0894bd168fd9b30c66/qf4ccf8f5435d4a78bdca4d6a018b578e/abaaabaa.aabb (Ljava/lang/Object;IILqeaa361f143ee4a0894bd168fd9b30c66/qf4ccf8f5435d4a78bdca4d6a018b578e/aaaaab;)Z
      // 3b: iload 4
      // 3d: ifne 4f
      // 40: ifne 6a
      // 43: goto 47
      // 46: athrow
      // 47: aload 0
      // 48: invokestatic qeaa361f143ee4a0894bd168fd9b30c66/qf4ccf8f5435d4a78bdca4d6a018b578e/aabbabbbb.abaaaab (Lnet/minecraft/class_310;)Z
      // 4b: goto 4f
      // 4e: athrow
      // 4f: iload 4
      // 51: ifne 5e
      // 54: ifne 61
      // 57: goto 5b
      // 5a: athrow
      // 5b: invokestatic qeaa361f143ee4a0894bd168fd9b30c66/qf4ccf8f5435d4a78bdca4d6a018b578e/aabbabbbb.abbbabb ()Z
      // 5e: ifeq 62
      // 61: return
      // 62: aload 0
      // 63: aload 1
      // 64: getstatic qeaa361f143ee4a0894bd168fd9b30c66/qf4ccf8f5435d4a78bdca4d6a018b578e/abbaaabba.aba Lqeaa361f143ee4a0894bd168fd9b30c66/qf4ccf8f5435d4a78bdca4d6a018b578e/abbaaabba;
      // 67: invokestatic qeaa361f143ee4a0894bd168fd9b30c66/qf4ccf8f5435d4a78bdca4d6a018b578e/aabbabbbb.bbaaabb (Lnet/minecraft/class_310;Ljava/lang/Object;Lqeaa361f143ee4a0894bd168fd9b30c66/qf4ccf8f5435d4a78bdca4d6a018b578e/abbaaabba;)V
      // 6a: return
   }

   public static void aabbaba(class_310 param0) {
      // $VF: Couldn't be decompiled
      // Please report this to the Vineflower issue tracker, at https://github.com/Vineflower/vineflower/issues with a copy of the class file (if you have the rights to distribute it!)
      // java.lang.RuntimeException: parsing failure!
      //   at org.jetbrains.java.decompiler.modules.decompiler.decompose.DomHelper.parseGraph(DomHelper.java:211)
      //   at org.jetbrains.java.decompiler.main.rels.MethodProcessor.codeToJava(MethodProcessor.java:166)
      //
      // Bytecode:
      // 00: getstatic qeaa361f143ee4a0894bd168fd9b30c66/qf4ccf8f5435d4a78bdca4d6a018b578e/baaabbaa.bba I
      // 03: invokestatic qeaa361f143ee4a0894bd168fd9b30c66/qf4ccf8f5435d4a78bdca4d6a018b578e/abaaaaaba.aaaaa ()Lqeaa361f143ee4a0894bd168fd9b30c66/qf4ccf8f5435d4a78bdca4d6a018b578e/abaaaaaba;
      // 06: astore 2
      // 07: istore 1
      // 08: aload 2
      // 09: iload 1
      // 0a: ifne 15
      // 0d: ifnull 23
      // 10: goto 14
      // 13: athrow
      // 14: aload 2
      // 15: iload 1
      // 16: ifne 26
      // 19: invokevirtual qeaa361f143ee4a0894bd168fd9b30c66/qf4ccf8f5435d4a78bdca4d6a018b578e/abaaaaaba.aaba ()Lqeaa361f143ee4a0894bd168fd9b30c66/qf4ccf8f5435d4a78bdca4d6a018b578e/babbaba;
      // 1c: ifnonnull 25
      // 1f: goto 23
      // 22: athrow
      // 23: return
      // 24: athrow
      // 25: aload 2
      // 26: invokevirtual qeaa361f143ee4a0894bd168fd9b30c66/qf4ccf8f5435d4a78bdca4d6a018b578e/abaaaaaba.aaba ()Lqeaa361f143ee4a0894bd168fd9b30c66/qf4ccf8f5435d4a78bdca4d6a018b578e/babbaba;
      // 29: invokevirtual qeaa361f143ee4a0894bd168fd9b30c66/qf4ccf8f5435d4a78bdca4d6a018b578e/babbaba.bbbbb ()Lqeaa361f143ee4a0894bd168fd9b30c66/qf4ccf8f5435d4a78bdca4d6a018b578e/baaabbb;
      // 2c: astore 3
      // 2d: aload 3
      // 2e: iload 1
      // 2f: ifne 3a
      // 32: ifnull 65
      // 35: goto 39
      // 38: athrow
      // 39: aload 3
      // 3a: iload 1
      // 3b: ifne 4d
      // 3e: invokevirtual qeaa361f143ee4a0894bd168fd9b30c66/qf4ccf8f5435d4a78bdca4d6a018b578e/baaabbb.babbaab ()Z
      // 41: ifeq 65
      // 44: goto 48
      // 47: athrow
      // 48: aload 3
      // 49: goto 4d
      // 4c: athrow
      // 4d: iload 1
      // 4e: ifne 60
      // 51: invokevirtual qeaa361f143ee4a0894bd168fd9b30c66/qf4ccf8f5435d4a78bdca4d6a018b578e/baaabbb.baaaaba ()Z
      // 54: ifeq 65
      // 57: goto 5b
      // 5a: athrow
      // 5b: aload 3
      // 5c: goto 60
      // 5f: athrow
      // 60: aload 0
      // 61: invokevirtual qeaa361f143ee4a0894bd168fd9b30c66/qf4ccf8f5435d4a78bdca4d6a018b578e/baaabbb.aaaa (Lnet/minecraft/class_310;)Z
      // 64: pop
      // 65: return
   }

   public static void aabbabb(class_310 param0, int param1) {
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
      // 09: ifnull 3d
      // 0c: goto 10
      // 0f: athrow
      // 10: aload 0
      // 11: getfield net/minecraft/class_310.field_1724 Lnet/minecraft/class_746;
      // 14: ifnull 3d
      // 17: iload 1
      // 18: iload 2
      // 19: ifne 3a
      // 1c: goto 20
      // 1f: athrow
      // 20: ifle 3d
      // 23: goto 27
      // 26: athrow
      // 27: getstatic qeaa361f143ee4a0894bd168fd9b30c66/qf4ccf8f5435d4a78bdca4d6a018b578e/aabbabbbb.aabb I
      // 2a: aload 0
      // 2b: getfield net/minecraft/class_310.field_1724 Lnet/minecraft/class_746;
      // 2e: getfield net/minecraft/class_746.field_6012 I
      // 31: iload 1
      // 32: iadd
      // 33: invokestatic java/lang/Math.max (II)I
      // 36: goto 3a
      // 39: athrow
      // 3a: putstatic qeaa361f143ee4a0894bd168fd9b30c66/qf4ccf8f5435d4a78bdca4d6a018b578e/aabbabbbb.aabb I
      // 3d: return
   }

   private static int b(int var0, int var1) {
      int var2 = aabbab[var0 ^ 604047337] ^ var1 ^ var0;
      var2 += 15681;
      var2 ^= 11625;
      var2 -= 61538;
      var2 ^= 41350;
      var2 -= 6137;
      var2 -= 36958;
      return var2 - 37141;
   }

   public static int aabbbaa(class_2777 var0) {
      try {
         return (Integer)var0.getClass()
            .getMethod(aabbaaaba.abba(bbaabaa(b(604047260, -155693972 ^ 52905724), b(604047263, -155693972 ^ 1547914658))))
            .invoke(var0);
      } catch (Exception var4) {
         try {
            return (Integer)var0.getClass()
               .getMethod(aabbaaaba.abba(bbaabaa(b(604047262, -155693972 ^ 727130608), b(604047249, -155693972 ^ 2014660102))))
               .invoke(var0);
         } catch (Exception var3) {
            return 0;
         }
      }
   }

   public static boolean aabbbab(class_310 param0) {
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
      // 06: ifne 11
      // 09: ifnull 4e
      // 0c: goto 10
      // 0f: athrow
      // 10: aload 0
      // 11: getfield net/minecraft/class_310.field_1724 Lnet/minecraft/class_746;
      // 14: ifnull 4e
      // 17: getstatic qeaa361f143ee4a0894bd168fd9b30c66/qf4ccf8f5435d4a78bdca4d6a018b578e/aabbabbbb.babab J
      // 1a: getstatic qeaa361f143ee4a0894bd168fd9b30c66/qf4ccf8f5435d4a78bdca4d6a018b578e/aabbabbbb.ababb J
      // 1d: lcmp
      // 1e: iload 1
      // 1f: ifne 38
      // 22: goto 26
      // 25: athrow
      // 26: ifne 4e
      // 29: goto 2d
      // 2c: athrow
      // 2d: aload 0
      // 2e: getfield net/minecraft/class_310.field_1724 Lnet/minecraft/class_746;
      // 31: invokestatic java/lang/System.identityHashCode (Ljava/lang/Object;)I
      // 34: goto 38
      // 37: athrow
      // 38: iload 1
      // 39: ifne 4b
      // 3c: getstatic qeaa361f143ee4a0894bd168fd9b30c66/qf4ccf8f5435d4a78bdca4d6a018b578e/aabbabbbb.abaaa I
      // 3f: if_icmpne 4e
      // 42: goto 46
      // 45: athrow
      // 46: bipush 1
      // 47: goto 4b
      // 4a: athrow
      // 4b: goto 4f
      // 4e: bipush 0
      // 4f: ireturn
   }

   public static int aabbbba(class_304 var0) {
      try {
         if (var0 == null) {
            return 0;
         }
      } catch (MatchException var1) {
         throw var1;
      }

      return Math.max(0, bbbabaa.aabb(var0));
   }

   public static boolean aabbbbb(int param0) {
      // $VF: Couldn't be decompiled
      // Please report this to the Vineflower issue tracker, at https://github.com/Vineflower/vineflower/issues with a copy of the class file (if you have the rights to distribute it!)
      // java.lang.RuntimeException: parsing failure!
      //   at org.jetbrains.java.decompiler.modules.decompiler.decompose.DomHelper.parseGraph(DomHelper.java:211)
      //   at org.jetbrains.java.decompiler.main.rels.MethodProcessor.codeToJava(MethodProcessor.java:166)
      //
      // Bytecode:
      // 00: getstatic qeaa361f143ee4a0894bd168fd9b30c66/qf4ccf8f5435d4a78bdca4d6a018b578e/baaabbaa.bba I
      // 03: istore 1
      // 04: iload 0
      // 05: iload 1
      // 06: ifne 11
      // 09: iflt 38
      // 0c: goto 10
      // 0f: athrow
      // 10: iload 0
      // 11: iload 1
      // 12: ifne 29
      // 15: getstatic qeaa361f143ee4a0894bd168fd9b30c66/qf4ccf8f5435d4a78bdca4d6a018b578e/aabbabbbb.bbaab [Z
      // 18: arraylength
      // 19: if_icmpge 38
      // 1c: goto 20
      // 1f: athrow
      // 20: getstatic qeaa361f143ee4a0894bd168fd9b30c66/qf4ccf8f5435d4a78bdca4d6a018b578e/aabbabbbb.bbaab [Z
      // 23: iload 0
      // 24: baload
      // 25: goto 29
      // 28: athrow
      // 29: iload 1
      // 2a: ifne 35
      // 2d: ifeq 38
      // 30: goto 34
      // 33: athrow
      // 34: bipush 1
      // 35: goto 39
      // 38: bipush 0
      // 39: ireturn
   }

   public static void abaaaaa() {
      baba = false;
   }

   public static boolean abaaaab(class_310 param0) {
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
      // 06: ifne 11
      // 09: ifnull 60
      // 0c: goto 10
      // 0f: athrow
      // 10: aload 0
      // 11: getfield net/minecraft/class_310.field_1724 Lnet/minecraft/class_746;
      // 14: ifnull 60
      // 17: getstatic qeaa361f143ee4a0894bd168fd9b30c66/qf4ccf8f5435d4a78bdca4d6a018b578e/aabbabbbb.aaa J
      // 1a: invokestatic qeaa361f143ee4a0894bd168fd9b30c66/qf4ccf8f5435d4a78bdca4d6a018b578e/aabaaa.abbbaa ()J
      // 1d: lcmp
      // 1e: iload 1
      // 1f: ifne 4a
      // 22: goto 26
      // 25: athrow
      // 26: ifeq 3f
      // 29: goto 2d
      // 2c: athrow
      // 2d: getstatic qeaa361f143ee4a0894bd168fd9b30c66/qf4ccf8f5435d4a78bdca4d6a018b578e/aabbabbbb.baba Z
      // 30: iload 1
      // 31: ifne 4a
      // 34: goto 38
      // 37: athrow
      // 38: ifeq 60
      // 3b: goto 3f
      // 3e: athrow
      // 3f: aload 0
      // 40: getfield net/minecraft/class_310.field_1724 Lnet/minecraft/class_746;
      // 43: invokestatic java/lang/System.identityHashCode (Ljava/lang/Object;)I
      // 46: goto 4a
      // 49: athrow
      // 4a: iload 1
      // 4b: ifne 5d
      // 4e: getstatic qeaa361f143ee4a0894bd168fd9b30c66/qf4ccf8f5435d4a78bdca4d6a018b578e/aabbabbbb.abaaa I
      // 51: if_icmpne 60
      // 54: goto 58
      // 57: athrow
      // 58: bipush 1
      // 59: goto 5d
      // 5c: athrow
      // 5d: goto 61
      // 60: bipush 0
      // 61: ireturn
   }

   public static boolean abaaaba() {
      // $VF: Couldn't be decompiled
      // Please report this to the Vineflower issue tracker, at https://github.com/Vineflower/vineflower/issues with a copy of the class file (if you have the rights to distribute it!)
      // java.lang.RuntimeException: parsing failure!
      //   at org.jetbrains.java.decompiler.modules.decompiler.decompose.DomHelper.parseGraph(DomHelper.java:211)
      //   at org.jetbrains.java.decompiler.main.rels.MethodProcessor.codeToJava(MethodProcessor.java:166)
      //
      // Bytecode:
      // 00: getstatic qeaa361f143ee4a0894bd168fd9b30c66/qf4ccf8f5435d4a78bdca4d6a018b578e/baaabbaa.bba I
      // 03: istore 0
      // 04: getstatic qeaa361f143ee4a0894bd168fd9b30c66/qf4ccf8f5435d4a78bdca4d6a018b578e/aabbabbbb.babaa Z
      // 07: iload 0
      // 08: ifne 1c
      // 0b: ifeq 2b
      // 0e: goto 12
      // 11: athrow
      // 12: getstatic qeaa361f143ee4a0894bd168fd9b30c66/qf4ccf8f5435d4a78bdca4d6a018b578e/aabbabbbb.aaabba J
      // 15: invokestatic qeaa361f143ee4a0894bd168fd9b30c66/qf4ccf8f5435d4a78bdca4d6a018b578e/bbbbbbba.bba (J)Z
      // 18: goto 1c
      // 1b: athrow
      // 1c: iload 0
      // 1d: ifne 28
      // 20: ifeq 2b
      // 23: goto 27
      // 26: athrow
      // 27: bipush 1
      // 28: goto 2c
      // 2b: bipush 0
      // 2c: ireturn
   }

   public static float abaaabb(class_1309 var0, float var1) {
      try {
         if (var0 == null) {
            return 0.0F;
         }
      } catch (MatchException var4) {
         throw var4;
      }

      float var2 = babaaa(aaabb, var0, var0.method_36454());
      float var3 = babaaa(abbbb, var0, var2);
      return class_3532.method_17821(var1, var3, var2);
   }

   public static int abaabaa(class_1661 param0) {
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
      // 05: ifnonnull 0b
      // 08: bipush 0
      // 09: ireturn
      // 0a: athrow
      // 0b: invokestatic net/minecraft/class_310.method_1551 ()Lnet/minecraft/class_310;
      // 0e: astore 2
      // 0f: aload 2
      // 10: iload 1
      // 11: ifne 1c
      // 14: ifnull 66
      // 17: goto 1b
      // 1a: athrow
      // 1b: aload 2
      // 1c: iload 1
      // 1d: ifne 2f
      // 20: getfield net/minecraft/class_310.field_1724 Lnet/minecraft/class_746;
      // 23: ifnull 66
      // 26: goto 2a
      // 29: athrow
      // 2a: aload 2
      // 2b: goto 2f
      // 2e: athrow
      // 2f: getfield net/minecraft/class_310.field_1724 Lnet/minecraft/class_746;
      // 32: invokevirtual net/minecraft/class_746.method_31548 ()Lnet/minecraft/class_1661;
      // 35: iload 1
      // 36: ifne 67
      // 39: aload 0
      // 3a: if_acmpne 66
      // 3d: goto 41
      // 40: athrow
      // 41: getstatic qeaa361f143ee4a0894bd168fd9b30c66/qf4ccf8f5435d4a78bdca4d6a018b578e/aabbabbbb.aba Lqeaa361f143ee4a0894bd168fd9b30c66/qf4ccf8f5435d4a78bdca4d6a018b578e/abaaabaa;
      // 44: invokevirtual qeaa361f143ee4a0894bd168fd9b30c66/qf4ccf8f5435d4a78bdca4d6a018b578e/abaaabaa.bb ()Z
      // 47: iload 1
      // 48: ifne 6a
      // 4b: goto 4f
      // 4e: athrow
      // 4f: ifeq 66
      // 52: goto 56
      // 55: athrow
      // 56: getstatic qeaa361f143ee4a0894bd168fd9b30c66/qf4ccf8f5435d4a78bdca4d6a018b578e/aabbabbbb.aba Lqeaa361f143ee4a0894bd168fd9b30c66/qf4ccf8f5435d4a78bdca4d6a018b578e/abaaabaa;
      // 59: new qeaa361f143ee4a0894bd168fd9b30c66/qf4ccf8f5435d4a78bdca4d6a018b578e/aaaababaa
      // 5c: dup
      // 5d: aload 2
      // 5e: invokespecial qeaa361f143ee4a0894bd168fd9b30c66/qf4ccf8f5435d4a78bdca4d6a018b578e/aaaababaa.<init> (Lnet/minecraft/class_310;)V
      // 61: invokevirtual qeaa361f143ee4a0894bd168fd9b30c66/qf4ccf8f5435d4a78bdca4d6a018b578e/abaaabaa.baba (Lqeaa361f143ee4a0894bd168fd9b30c66/qf4ccf8f5435d4a78bdca4d6a018b578e/abbbaaa;)I
      // 64: ireturn
      // 65: athrow
      // 66: aload 0
      // 67: invokestatic qeaa361f143ee4a0894bd168fd9b30c66/qf4ccf8f5435d4a78bdca4d6a018b578e/bbbabaa.aaaab (Lnet/minecraft/class_1661;)I
      // 6a: ireturn
   }

   public static boolean abaabab(class_1799 param0, class_638 param1) {
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
      // 006: ifne 011
      // 009: ifnull 03f
      // 00c: goto 010
      // 00f: athrow
      // 010: aload 0
      // 011: invokevirtual net/minecraft/class_1799.method_7960 ()Z
      // 014: iload 2
      // 015: ifne 044
      // 018: ifne 03f
      // 01b: goto 01f
      // 01e: athrow
      // 01f: aload 0
      // 020: invokevirtual net/minecraft/class_1799.method_7909 ()Lnet/minecraft/class_1792;
      // 023: astore 4
      // 025: aload 4
      // 027: instanceof net/minecraft/class_1747
      // 02a: iload 2
      // 02b: ifne 044
      // 02e: ifeq 03f
      // 031: goto 035
      // 034: athrow
      // 035: aload 4
      // 037: checkcast net/minecraft/class_1747
      // 03a: astore 3
      // 03b: iload 2
      // 03c: ifeq 045
      // 03f: bipush 0
      // 040: goto 044
      // 043: athrow
      // 044: ireturn
      // 045: aload 3
      // 046: invokevirtual net/minecraft/class_1747.method_7711 ()Lnet/minecraft/class_2248;
      // 049: astore 4
      // 04b: aload 4
      // 04d: iload 2
      // 04e: ifne 05d
      // 051: ifnonnull 05b
      // 054: goto 058
      // 057: athrow
      // 058: bipush 0
      // 059: ireturn
      // 05a: athrow
      // 05b: aload 4
      // 05d: invokevirtual net/minecraft/class_2248.method_9564 ()Lnet/minecraft/class_2680;
      // 060: astore 5
      // 062: aload 5
      // 064: iload 2
      // 065: ifne 071
      // 068: ifnull 07f
      // 06b: goto 06f
      // 06e: athrow
      // 06f: aload 5
      // 071: iload 2
      // 072: ifne 084
      // 075: invokevirtual net/minecraft/class_2680.method_26215 ()Z
      // 078: ifeq 082
      // 07b: goto 07f
      // 07e: athrow
      // 07f: bipush 0
      // 080: ireturn
      // 081: athrow
      // 082: aload 5
      // 084: getstatic net/minecraft/class_2246.field_10343 Lnet/minecraft/class_2248;
      // 087: invokevirtual net/minecraft/class_2680.method_27852 (Lnet/minecraft/class_2248;)Z
      // 08a: iload 2
      // 08b: ifne 14e
      // 08e: ifne 14d
      // 091: goto 095
      // 094: athrow
      // 095: aload 5
      // 097: getstatic net/minecraft/class_2246.field_16492 Lnet/minecraft/class_2248;
      // 09a: invokevirtual net/minecraft/class_2680.method_27852 (Lnet/minecraft/class_2248;)Z
      // 09d: iload 2
      // 09e: ifne 14e
      // 0a1: goto 0a5
      // 0a4: athrow
      // 0a5: ifne 14d
      // 0a8: goto 0ac
      // 0ab: athrow
      // 0ac: aload 5
      // 0ae: getstatic net/minecraft/class_2246.field_10030 Lnet/minecraft/class_2248;
      // 0b1: invokevirtual net/minecraft/class_2680.method_27852 (Lnet/minecraft/class_2248;)Z
      // 0b4: iload 2
      // 0b5: ifne 14e
      // 0b8: goto 0bc
      // 0bb: athrow
      // 0bc: ifne 14d
      // 0bf: goto 0c3
      // 0c2: athrow
      // 0c3: aload 5
      // 0c5: getstatic net/minecraft/class_2246.field_21211 Lnet/minecraft/class_2248;
      // 0c8: invokevirtual net/minecraft/class_2680.method_27852 (Lnet/minecraft/class_2248;)Z
      // 0cb: iload 2
      // 0cc: ifne 14e
      // 0cf: goto 0d3
      // 0d2: athrow
      // 0d3: ifne 14d
      // 0d6: goto 0da
      // 0d9: athrow
      // 0da: aload 5
      // 0dc: getstatic net/minecraft/class_2246.field_10375 Lnet/minecraft/class_2248;
      // 0df: invokevirtual net/minecraft/class_2680.method_27852 (Lnet/minecraft/class_2248;)Z
      // 0e2: iload 2
      // 0e3: ifne 14e
      // 0e6: goto 0ea
      // 0e9: athrow
      // 0ea: ifne 14d
      // 0ed: goto 0f1
      // 0f0: athrow
      // 0f1: aload 5
      // 0f3: getstatic net/minecraft/class_2246.field_23152 Lnet/minecraft/class_2248;
      // 0f6: invokevirtual net/minecraft/class_2680.method_27852 (Lnet/minecraft/class_2248;)Z
      // 0f9: iload 2
      // 0fa: ifne 14e
      // 0fd: goto 101
      // 100: athrow
      // 101: ifne 14d
      // 104: goto 108
      // 107: athrow
      // 108: aload 5
      // 10a: getstatic net/minecraft/class_2246.field_10029 Lnet/minecraft/class_2248;
      // 10d: invokevirtual net/minecraft/class_2680.method_27852 (Lnet/minecraft/class_2248;)Z
      // 110: iload 2
      // 111: ifne 14e
      // 114: goto 118
      // 117: athrow
      // 118: ifne 14d
      // 11b: goto 11f
      // 11e: athrow
      // 11f: aload 5
      // 121: getstatic net/minecraft/class_2246.field_27879 Lnet/minecraft/class_2248;
      // 124: invokevirtual net/minecraft/class_2680.method_27852 (Lnet/minecraft/class_2248;)Z
      // 127: iload 2
      // 128: ifne 14e
      // 12b: goto 12f
      // 12e: athrow
      // 12f: ifne 14d
      // 132: goto 136
      // 135: athrow
      // 136: aload 5
      // 138: getstatic net/minecraft/class_2246.field_10606 Lnet/minecraft/class_2248;
      // 13b: invokevirtual net/minecraft/class_2680.method_27852 (Lnet/minecraft/class_2248;)Z
      // 13e: iload 2
      // 13f: ifne 15c
      // 142: goto 146
      // 145: athrow
      // 146: ifeq 14f
      // 149: goto 14d
      // 14c: athrow
      // 14d: bipush 0
      // 14e: ireturn
      // 14f: aload 4
      // 151: iload 2
      // 152: ifne 164
      // 155: instanceof net/minecraft/class_2346
      // 158: goto 15c
      // 15b: athrow
      // 15c: ifeq 162
      // 15f: bipush 0
      // 160: ireturn
      // 161: athrow
      // 162: aload 4
      // 164: iload 2
      // 165: ifne 178
      // 168: invokestatic qeaa361f143ee4a0894bd168fd9b30c66/qf4ccf8f5435d4a78bdca4d6a018b578e/aabbabbbb.bbaab (Lnet/minecraft/class_2248;)Z
      // 16b: ifeq 176
      // 16e: goto 172
      // 171: athrow
      // 172: goto 3a8
      // 175: athrow
      // 176: aload 4
      // 178: instanceof net/minecraft/class_2349
      // 17b: iload 2
      // 17c: ifne 3a7
      // 17f: ifne 3a2
      // 182: goto 186
      // 185: athrow
      // 186: aload 4
      // 188: instanceof net/minecraft/class_2389
      // 18b: iload 2
      // 18c: ifne 3a7
      // 18f: goto 193
      // 192: athrow
      // 193: ifne 3a2
      // 196: goto 19a
      // 199: athrow
      // 19a: aload 4
      // 19c: instanceof net/minecraft/class_2397
      // 19f: iload 2
      // 1a0: ifne 3a7
      // 1a3: goto 1a7
      // 1a6: athrow
      // 1a7: ifne 3a2
      // 1aa: goto 1ae
      // 1ad: athrow
      // 1ae: aload 4
      // 1b0: instanceof net/minecraft/class_2323
      // 1b3: iload 2
      // 1b4: ifne 3a7
      // 1b7: goto 1bb
      // 1ba: athrow
      // 1bb: ifne 3a2
      // 1be: goto 1c2
      // 1c1: athrow
      // 1c2: aload 4
      // 1c4: instanceof net/minecraft/class_2533
      // 1c7: iload 2
      // 1c8: ifne 3a7
      // 1cb: goto 1cf
      // 1ce: athrow
      // 1cf: ifne 3a2
      // 1d2: goto 1d6
      // 1d5: athrow
      // 1d6: aload 4
      // 1d8: instanceof net/minecraft/class_2577
      // 1db: iload 2
      // 1dc: ifne 3a7
      // 1df: goto 1e3
      // 1e2: athrow
      // 1e3: ifne 3a2
      // 1e6: goto 1ea
      // 1e9: athrow
      // 1ea: aload 4
      // 1ec: instanceof net/minecraft/class_2215
      // 1ef: iload 2
      // 1f0: ifne 3a7
      // 1f3: goto 1f7
      // 1f6: athrow
      // 1f7: ifne 3a2
      // 1fa: goto 1fe
      // 1fd: athrow
      // 1fe: aload 4
      // 200: instanceof net/minecraft/class_2508
      // 203: iload 2
      // 204: ifne 3a7
      // 207: goto 20b
      // 20a: athrow
      // 20b: ifne 3a2
      // 20e: goto 212
      // 211: athrow
      // 212: aload 4
      // 214: instanceof net/minecraft/class_2478
      // 217: iload 2
      // 218: ifne 3a7
      // 21b: goto 21f
      // 21e: athrow
      // 21f: ifne 3a2
      // 222: goto 226
      // 225: athrow
      // 226: aload 4
      // 228: instanceof net/minecraft/class_2261
      // 22b: iload 2
      // 22c: ifne 3a7
      // 22f: goto 233
      // 232: athrow
      // 233: ifne 3a2
      // 236: goto 23a
      // 239: athrow
      // 23a: aload 4
      // 23c: instanceof net/minecraft/class_2356
      // 23f: iload 2
      // 240: ifne 3a7
      // 243: goto 247
      // 246: athrow
      // 247: ifne 3a2
      // 24a: goto 24e
      // 24d: athrow
      // 24e: aload 4
      // 250: instanceof net/minecraft/class_2527
      // 253: iload 2
      // 254: ifne 3a7
      // 257: goto 25b
      // 25a: athrow
      // 25b: ifne 3a2
      // 25e: goto 262
      // 261: athrow
      // 262: aload 4
      // 264: instanceof net/minecraft/class_3749
      // 267: iload 2
      // 268: ifne 3a7
      // 26b: goto 26f
      // 26e: athrow
      // 26f: ifne 3a2
      // 272: goto 276
      // 275: athrow
      // 276: aload 4
      // 278: instanceof net/minecraft/class_5172
      // 27b: iload 2
      // 27c: ifne 3a7
      // 27f: goto 283
      // 282: athrow
      // 283: ifne 3a2
      // 286: goto 28a
      // 289: athrow
      // 28a: aload 4
      // 28c: instanceof net/minecraft/class_3922
      // 28f: iload 2
      // 290: ifne 3a7
      // 293: goto 297
      // 296: athrow
      // 297: ifne 3a2
      // 29a: goto 29e
      // 29d: athrow
      // 29e: aload 4
      // 2a0: instanceof net/minecraft/class_2312
      // 2a3: iload 2
      // 2a4: ifne 3a7
      // 2a7: goto 2ab
      // 2aa: athrow
      // 2ab: ifne 3a2
      // 2ae: goto 2b2
      // 2b1: athrow
      // 2b2: aload 4
      // 2b4: instanceof net/minecraft/class_2269
      // 2b7: iload 2
      // 2b8: ifne 3a7
      // 2bb: goto 2bf
      // 2be: athrow
      // 2bf: ifne 3a2
      // 2c2: goto 2c6
      // 2c5: athrow
      // 2c6: aload 4
      // 2c8: instanceof net/minecraft/class_2401
      // 2cb: iload 2
      // 2cc: ifne 3a7
      // 2cf: goto 2d3
      // 2d2: athrow
      // 2d3: ifne 3a2
      // 2d6: goto 2da
      // 2d9: athrow
      // 2da: aload 4
      // 2dc: instanceof net/minecraft/class_2440
      // 2df: iload 2
      // 2e0: ifne 3a7
      // 2e3: goto 2e7
      // 2e6: athrow
      // 2e7: ifne 3a2
      // 2ea: goto 2ee
      // 2ed: athrow
      // 2ee: aload 4
      // 2f0: instanceof net/minecraft/class_2537
      // 2f3: iload 2
      // 2f4: ifne 3a7
      // 2f7: goto 2fb
      // 2fa: athrow
      // 2fb: ifne 3a2
      // 2fe: goto 302
      // 301: athrow
      // 302: aload 4
      // 304: instanceof net/minecraft/class_2457
      // 307: iload 2
      // 308: ifne 3a7
      // 30b: goto 30f
      // 30e: athrow
      // 30f: ifne 3a2
      // 312: goto 316
      // 315: athrow
      // 316: aload 4
      // 318: instanceof net/minecraft/class_2309
      // 31b: iload 2
      // 31c: ifne 3a7
      // 31f: goto 323
      // 322: athrow
      // 323: ifne 3a2
      // 326: goto 32a
      // 329: athrow
      // 32a: aload 4
      // 32c: instanceof net/minecraft/class_3709
      // 32f: iload 2
      // 330: ifne 3a7
      // 333: goto 337
      // 336: athrow
      // 337: ifne 3a2
      // 33a: goto 33e
      // 33d: athrow
      // 33e: aload 4
      // 340: instanceof net/minecraft/class_8168
      // 343: iload 2
      // 344: ifne 3a7
      // 347: goto 34b
      // 34a: athrow
      // 34b: ifne 3a2
      // 34e: goto 352
      // 351: athrow
      // 352: aload 4
      // 354: instanceof net/minecraft/class_5551
      // 357: iload 2
      // 358: ifne 3a7
      // 35b: goto 35f
      // 35e: athrow
      // 35f: ifne 3a2
      // 362: goto 366
      // 365: athrow
      // 366: aload 4
      // 368: instanceof net/minecraft/class_5554
      // 36b: iload 2
      // 36c: ifne 3a7
      // 36f: goto 373
      // 372: athrow
      // 373: ifne 3a2
      // 376: goto 37a
      // 379: athrow
      // 37a: aload 4
      // 37c: instanceof net/minecraft/class_5544
      // 37f: iload 2
      // 380: ifne 3a7
      // 383: goto 387
      // 386: athrow
      // 387: ifne 3a2
      // 38a: goto 38e
      // 38d: athrow
      // 38e: aload 4
      // 390: iload 2
      // 391: ifne 3aa
      // 394: goto 398
      // 397: athrow
      // 398: instanceof net/minecraft/class_5542
      // 39b: ifeq 3a8
      // 39e: goto 3a2
      // 3a1: athrow
      // 3a2: bipush 0
      // 3a3: goto 3a7
      // 3a6: athrow
      // 3a7: ireturn
      // 3a8: aload 4
      // 3aa: instanceof net/minecraft/class_2237
      // 3ad: iload 2
      // 3ae: ifne 45d
      // 3b1: ifne 458
      // 3b4: goto 3b8
      // 3b7: athrow
      // 3b8: aload 4
      // 3ba: instanceof net/minecraft/class_2304
      // 3bd: iload 2
      // 3be: ifne 45d
      // 3c1: goto 3c5
      // 3c4: athrow
      // 3c5: ifne 458
      // 3c8: goto 3cc
      // 3cb: athrow
      // 3cc: aload 4
      // 3ce: instanceof net/minecraft/class_2199
      // 3d1: iload 2
      // 3d2: ifne 45d
      // 3d5: goto 3d9
      // 3d8: athrow
      // 3d9: ifne 458
      // 3dc: goto 3e0
      // 3df: athrow
      // 3e0: aload 4
      // 3e2: instanceof net/minecraft/class_3713
      // 3e5: iload 2
      // 3e6: ifne 45d
      // 3e9: goto 3ed
      // 3ec: athrow
      // 3ed: ifne 458
      // 3f0: goto 3f4
      // 3f3: athrow
      // 3f4: aload 4
      // 3f6: instanceof net/minecraft/class_3718
      // 3f9: iload 2
      // 3fa: ifne 45d
      // 3fd: goto 401
      // 400: athrow
      // 401: ifne 458
      // 404: goto 408
      // 407: athrow
      // 408: aload 4
      // 40a: instanceof net/minecraft/class_2406
      // 40d: iload 2
      // 40e: ifne 45d
      // 411: goto 415
      // 414: athrow
      // 415: ifne 458
      // 418: goto 41c
      // 41b: athrow
      // 41c: aload 4
      // 41e: instanceof net/minecraft/class_3711
      // 421: iload 2
      // 422: ifne 45d
      // 425: goto 429
      // 428: athrow
      // 429: ifne 458
      // 42c: goto 430
      // 42f: athrow
      // 430: aload 4
      // 432: instanceof net/minecraft/class_3717
      // 435: iload 2
      // 436: ifne 45d
      // 439: goto 43d
      // 43c: athrow
      // 43d: ifne 458
      // 440: goto 444
      // 443: athrow
      // 444: aload 4
      // 446: iload 2
      // 447: ifne 460
      // 44a: goto 44e
      // 44d: athrow
      // 44e: instanceof net/minecraft/class_2331
      // 451: ifeq 45e
      // 454: goto 458
      // 457: athrow
      // 458: bipush 0
      // 459: goto 45d
      // 45c: athrow
      // 45d: ireturn
      // 45e: aload 4
      // 460: invokestatic qeaa361f143ee4a0894bd168fd9b30c66/qf4ccf8f5435d4a78bdca4d6a018b578e/aabbabbbb.bbaab (Lnet/minecraft/class_2248;)Z
      // 463: iload 2
      // 464: ifne 4c1
      // 467: ifne 4b3
      // 46a: goto 46e
      // 46d: athrow
      // 46e: aload 5
      // 470: iload 2
      // 471: ifne 4b5
      // 474: goto 478
      // 477: athrow
      // 478: invokevirtual net/minecraft/class_2680.method_26216 ()Z
      // 47b: ifne 4b3
      // 47e: goto 482
      // 481: athrow
      // 482: aload 5
      // 484: iload 2
      // 485: ifne 4b5
      // 488: goto 48c
      // 48b: athrow
      // 48c: invokevirtual net/minecraft/class_2680.method_26225 ()Z
      // 48f: ifne 4b3
      // 492: goto 496
      // 495: athrow
      // 496: aload 5
      // 498: getstatic net/minecraft/class_2682.field_12294 Lnet/minecraft/class_2682;
      // 49b: getstatic net/minecraft/class_2338.field_10980 Lnet/minecraft/class_2338;
      // 49e: iload 2
      // 49f: ifne 4bb
      // 4a2: goto 4a6
      // 4a5: athrow
      // 4a6: invokevirtual net/minecraft/class_2680.method_26234 (Lnet/minecraft/class_1922;Lnet/minecraft/class_2338;)Z
      // 4a9: ifne 4b3
      // 4ac: goto 4b0
      // 4af: athrow
      // 4b0: bipush 0
      // 4b1: ireturn
      // 4b2: athrow
      // 4b3: aload 5
      // 4b5: getstatic net/minecraft/class_2682.field_12294 Lnet/minecraft/class_2682;
      // 4b8: getstatic net/minecraft/class_2338.field_10980 Lnet/minecraft/class_2338;
      // 4bb: invokevirtual net/minecraft/class_2680.method_26220 (Lnet/minecraft/class_1922;Lnet/minecraft/class_2338;)Lnet/minecraft/class_265;
      // 4be: invokevirtual net/minecraft/class_265.method_1110 ()Z
      // 4c1: iload 2
      // 4c2: ifne 4d0
      // 4c5: ifeq 4cf
      // 4c8: goto 4cc
      // 4cb: athrow
      // 4cc: bipush 0
      // 4cd: ireturn
      // 4ce: athrow
      // 4cf: bipush 1
      // 4d0: ireturn
   }

   public static float abaabba(class_2596 var0) {
      int var10000 = baaabbaa.bba;
      Float var2 = abbbaab(
         var0,
         aabbaaaba.abba(bbaabaa(b(604047248, -801336950 ^ 169965221), b(604047251, -801336950 ^ 1109063879))),
         aabbaaaba.abba(bbaabaa(b(604047250, -801336950 ^ -393790740), b(604047253, -801336950 ^ 2124382096)))
      );
      int var1 = var10000;

      try {
         if (var1 != 0) {
            return var2;
         }

         if (var2 == null) {
            return Float.NaN;
         }
      } catch (MatchException var3) {
         throw var3;
      }

      return var2;
   }

   public static boolean abaabbb(class_310 param0) {
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
      // 06: ifne 11
      // 09: ifnull 1f
      // 0c: goto 10
      // 0f: athrow
      // 10: aload 0
      // 11: iload 1
      // 12: ifne 23
      // 15: getfield net/minecraft/class_310.field_1761 Lnet/minecraft/class_636;
      // 18: ifnonnull 22
      // 1b: goto 1f
      // 1e: athrow
      // 1f: bipush 0
      // 20: ireturn
      // 21: athrow
      // 22: aload 0
      // 23: invokestatic qeaa361f143ee4a0894bd168fd9b30c66/qf4ccf8f5435d4a78bdca4d6a018b578e/aabbabbbb.abaaaab (Lnet/minecraft/class_310;)Z
      // 26: iload 1
      // 27: ifne 56
      // 2a: ifne 55
      // 2d: goto 31
      // 30: athrow
      // 31: invokestatic qeaa361f143ee4a0894bd168fd9b30c66/qf4ccf8f5435d4a78bdca4d6a018b578e/aabbabbbb.abbbabb ()Z
      // 34: iload 1
      // 35: ifne 56
      // 38: goto 3c
      // 3b: athrow
      // 3c: ifne 55
      // 3f: goto 43
      // 42: athrow
      // 43: invokestatic qeaa361f143ee4a0894bd168fd9b30c66/qf4ccf8f5435d4a78bdca4d6a018b578e/aabbabbbb.babbbb ()Z
      // 46: iload 1
      // 47: ifne 5f
      // 4a: goto 4e
      // 4d: athrow
      // 4e: ifeq 57
      // 51: goto 55
      // 54: athrow
      // 55: bipush 0
      // 56: ireturn
      // 57: aload 0
      // 58: getfield net/minecraft/class_310.field_1761 Lnet/minecraft/class_636;
      // 5b: invokestatic qeaa361f143ee4a0894bd168fd9b30c66/qf4ccf8f5435d4a78bdca4d6a018b578e/bbbabaa.abba (Lnet/minecraft/class_636;)V
      // 5e: bipush 1
      // 5f: ireturn
   }

   public static void ababaaa(class_310 param0, int param1, boolean param2) {
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
      // 06: ifne 11
      // 09: ifnull 3e
      // 0c: goto 10
      // 0f: athrow
      // 10: aload 0
      // 11: getfield net/minecraft/class_310.field_1724 Lnet/minecraft/class_746;
      // 14: ifnull 3e
      // 17: iload 1
      // 18: iload 3
      // 19: ifne 28
      // 1c: goto 20
      // 1f: athrow
      // 20: iflt 3e
      // 23: goto 27
      // 26: athrow
      // 27: iload 1
      // 28: ldc_w 604047252
      // 2b: ldc_w -1334585230
      // 2e: ldc_w 841277933
      // 31: ixor
      // 32: invokestatic qeaa361f143ee4a0894bd168fd9b30c66/qf4ccf8f5435d4a78bdca4d6a018b578e/aabbabbbb.b (II)I
      // 35: ldc2_w 6146930655705273313
      // 38: invokestatic qeaa361f143ee4a0894bd168fd9b30c66/qf4ccf8f5435d4a78bdca4d6a018b578e/aabbabbbb.aaaaa (IJ)I
      // 3b: if_icmple 40
      // 3e: return
      // 3f: athrow
      // 40: aload 0
      // 41: getfield net/minecraft/class_310.field_1724 Lnet/minecraft/class_746;
      // 44: invokevirtual net/minecraft/class_746.method_31548 ()Lnet/minecraft/class_1661;
      // 47: astore 4
      // 49: aload 4
      // 4b: invokestatic qeaa361f143ee4a0894bd168fd9b30c66/qf4ccf8f5435d4a78bdca4d6a018b578e/bbbabaa.aaaab (Lnet/minecraft/class_1661;)I
      // 4e: istore 5
      // 50: iload 5
      // 52: iload 3
      // 53: ifne 63
      // 56: iload 1
      // 57: if_icmpeq 66
      // 5a: goto 5e
      // 5d: athrow
      // 5e: bipush 1
      // 5f: goto 63
      // 62: athrow
      // 63: goto 67
      // 66: bipush 0
      // 67: istore 6
      // 69: iload 3
      // 6a: ifne a0
      // 6d: iload 6
      // 6f: ifne 96
      // 72: goto 76
      // 75: athrow
      // 76: iload 2
      // 77: iload 3
      // 78: ifne 89
      // 7b: goto 7f
      // 7e: athrow
      // 7f: ifeq 95
      // 82: goto 86
      // 85: athrow
      // 86: getstatic qeaa361f143ee4a0894bd168fd9b30c66/qf4ccf8f5435d4a78bdca4d6a018b578e/aabbabbbb.baaba Z
      // 89: ifeq 95
      // 8c: aload 0
      // 8d: iload 1
      // 8e: invokestatic qeaa361f143ee4a0894bd168fd9b30c66/qf4ccf8f5435d4a78bdca4d6a018b578e/aabbabbbb.aabbab (Lnet/minecraft/class_310;I)V
      // 91: goto 95
      // 94: athrow
      // 95: return
      // 96: aload 4
      // 98: iload 1
      // 99: invokestatic qeaa361f143ee4a0894bd168fd9b30c66/qf4ccf8f5435d4a78bdca4d6a018b578e/aabbabbbb.aaabaaa (Lnet/minecraft/class_1661;I)V
      // 9c: iload 3
      // 9d: ifne b9
      // a0: iload 2
      // a1: ifeq b1
      // a4: aload 0
      // a5: iload 1
      // a6: invokestatic qeaa361f143ee4a0894bd168fd9b30c66/qf4ccf8f5435d4a78bdca4d6a018b578e/aabbabbbb.aabbab (Lnet/minecraft/class_310;I)V
      // a9: iload 3
      // aa: ifeq bd
      // ad: goto b1
      // b0: athrow
      // b1: bipush -1
      // b2: putstatic qeaa361f143ee4a0894bd168fd9b30c66/qf4ccf8f5435d4a78bdca4d6a018b578e/aabbabbbb.aaaab I
      // b5: goto b9
      // b8: athrow
      // b9: bipush 1
      // ba: putstatic qeaa361f143ee4a0894bd168fd9b30c66/qf4ccf8f5435d4a78bdca4d6a018b578e/aabbabbbb.baaba Z
      // bd: return
   }

   public static boolean ababaab(class_1309 var0) {
      return baaabab.aaab(class_310.method_1551(), var0);
   }

   public static boolean abababa(class_310 param0) {
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
      // 06: ifne 11
      // 09: ifnull 1f
      // 0c: goto 10
      // 0f: athrow
      // 10: aload 0
      // 11: iload 1
      // 12: ifne 27
      // 15: getfield net/minecraft/class_310.field_1724 Lnet/minecraft/class_746;
      // 18: ifnonnull 22
      // 1b: goto 1f
      // 1e: athrow
      // 1f: bipush 0
      // 20: ireturn
      // 21: athrow
      // 22: aload 0
      // 23: invokestatic qeaa361f143ee4a0894bd168fd9b30c66/qf4ccf8f5435d4a78bdca4d6a018b578e/aabbabbbb.aabbaba (Lnet/minecraft/class_310;)V
      // 26: aload 0
      // 27: getfield net/minecraft/class_310.field_1765 Lnet/minecraft/class_239;
      // 2a: astore 2
      // 2b: aload 0
      // 2c: getfield net/minecraft/class_310.field_1724 Lnet/minecraft/class_746;
      // 2f: invokevirtual net/minecraft/class_746.method_33571 ()Lnet/minecraft/class_243;
      // 32: astore 3
      // 33: aload 0
      // 34: getfield net/minecraft/class_310.field_1724 Lnet/minecraft/class_746;
      // 37: fconst_1
      // 38: invokevirtual net/minecraft/class_746.method_5828 (F)Lnet/minecraft/class_243;
      // 3b: astore 4
      // 3d: aload 3
      // 3e: aload 4
      // 40: ldc2_w 3.0
      // 43: invokevirtual net/minecraft/class_243.method_1021 (D)Lnet/minecraft/class_243;
      // 46: invokevirtual net/minecraft/class_243.method_1019 (Lnet/minecraft/class_243;)Lnet/minecraft/class_243;
      // 49: astore 5
      // 4b: aload 0
      // 4c: aload 5
      // 4e: getstatic net/minecraft/class_2350.field_11036 Lnet/minecraft/class_2350;
      // 51: getstatic net/minecraft/class_2338.field_10980 Lnet/minecraft/class_2338;
      // 54: invokestatic net/minecraft/class_3965.method_17778 (Lnet/minecraft/class_243;Lnet/minecraft/class_2350;Lnet/minecraft/class_2338;)Lnet/minecraft/class_3965;
      // 57: putfield net/minecraft/class_310.field_1765 Lnet/minecraft/class_239;
      // 5a: aload 0
      // 5b: invokestatic qeaa361f143ee4a0894bd168fd9b30c66/qf4ccf8f5435d4a78bdca4d6a018b578e/aabbabbbb.babbaab (Lnet/minecraft/class_310;)Z
      // 5e: istore 6
      // 60: aload 0
      // 61: aload 2
      // 62: putfield net/minecraft/class_310.field_1765 Lnet/minecraft/class_239;
      // 65: iload 6
      // 67: ireturn
      // 68: astore 7
      // 6a: aload 0
      // 6b: aload 2
      // 6c: putfield net/minecraft/class_310.field_1765 Lnet/minecraft/class_239;
      // 6f: aload 7
      // 71: athrow
   }

   public static boolean abababb(class_1799 param0) {
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
      // 06: ifne 11
      // 09: ifnull 1f
      // 0c: goto 10
      // 0f: athrow
      // 10: aload 0
      // 11: invokevirtual net/minecraft/class_1799.method_7960 ()Z
      // 14: iload 1
      // 15: ifne 20
      // 18: ifeq 21
      // 1b: goto 1f
      // 1e: athrow
      // 1f: bipush 0
      // 20: ireturn
      // 21: invokestatic qeaa361f143ee4a0894bd168fd9b30c66/qf4ccf8f5435d4a78bdca4d6a018b578e/aabbabbbb.babbbbb ()Lnet/minecraft/class_9331;
      // 24: astore 2
      // 25: aload 2
      // 26: ifnull 3f
      // 29: aload 0
      // 2a: aload 2
      // 2b: invokevirtual net/minecraft/class_1799.method_57826 (Lnet/minecraft/class_9331;)Z
      // 2e: iload 1
      // 2f: ifne 3e
      // 32: goto 36
      // 35: athrow
      // 36: ifeq 3f
      // 39: goto 3d
      // 3c: athrow
      // 3d: bipush 1
      // 3e: ireturn
      // 3f: getstatic net/minecraft/class_7923.field_41178 Lnet/minecraft/class_7922;
      // 42: aload 0
      // 43: invokevirtual net/minecraft/class_1799.method_7909 ()Lnet/minecraft/class_1792;
      // 46: invokeinterface net/minecraft/class_7922.method_10221 (Ljava/lang/Object;)Lnet/minecraft/class_2960; 2
      // 4b: invokevirtual net/minecraft/class_2960.method_12832 ()Ljava/lang/String;
      // 4e: astore 3
      // 4f: aload 3
      // 50: ldc_w 604047255
      // 53: ldc_w -722262534
      // 56: ldc_w 1501151216
      // 59: ixor
      // 5a: invokestatic qeaa361f143ee4a0894bd168fd9b30c66/qf4ccf8f5435d4a78bdca4d6a018b578e/aabbabbbb.b (II)I
      // 5d: ldc_w 604047254
      // 60: ldc_w -722262534
      // 63: ldc_w 454632306
      // 66: ixor
      // 67: invokestatic qeaa361f143ee4a0894bd168fd9b30c66/qf4ccf8f5435d4a78bdca4d6a018b578e/aabbabbbb.b (II)I
      // 6a: invokestatic qeaa361f143ee4a0894bd168fd9b30c66/qf4ccf8f5435d4a78bdca4d6a018b578e/aabbabbbb.bbaabaa (II)Ljava/lang/String;
      // 6d: invokestatic qeaa361f143ee4a0894bd168fd9b30c66/qf4ccf8f5435d4a78bdca4d6a018b578e/aabbaaaba.abba (Ljava/lang/String;)Ljava/lang/String;
      // 70: invokevirtual java/lang/String.equals (Ljava/lang/Object;)Z
      // 73: ireturn
   }

   public static boolean ababbaa(class_310 param0) {
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
      // 005: iload 1
      // 006: ifne 011
      // 009: ifnull 01f
      // 00c: goto 010
      // 00f: athrow
      // 010: aload 0
      // 011: iload 1
      // 012: ifne 023
      // 015: getfield net/minecraft/class_310.field_1724 Lnet/minecraft/class_746;
      // 018: ifnonnull 022
      // 01b: goto 01f
      // 01e: athrow
      // 01f: bipush 0
      // 020: ireturn
      // 021: athrow
      // 022: aload 0
      // 023: getfield net/minecraft/class_310.field_1724 Lnet/minecraft/class_746;
      // 026: iload 1
      // 027: ifne 03f
      // 02a: getfield net/minecraft/class_746.field_6012 I
      // 02d: getstatic qeaa361f143ee4a0894bd168fd9b30c66/qf4ccf8f5435d4a78bdca4d6a018b578e/aabbabbbb.abbaa I
      // 030: if_icmpne 056
      // 033: goto 037
      // 036: athrow
      // 037: aload 0
      // 038: getfield net/minecraft/class_310.field_1724 Lnet/minecraft/class_746;
      // 03b: goto 03f
      // 03e: athrow
      // 03f: invokestatic java/lang/System.identityHashCode (Ljava/lang/Object;)I
      // 042: iload 1
      // 043: ifne 055
      // 046: getstatic qeaa361f143ee4a0894bd168fd9b30c66/qf4ccf8f5435d4a78bdca4d6a018b578e/aabbabbbb.aaaa I
      // 049: if_icmpne 056
      // 04c: goto 050
      // 04f: athrow
      // 050: bipush 1
      // 051: goto 055
      // 054: athrow
      // 055: ireturn
      // 056: invokestatic qeaa361f143ee4a0894bd168fd9b30c66/qf4ccf8f5435d4a78bdca4d6a018b578e/abaaaaaba.aaaaa ()Lqeaa361f143ee4a0894bd168fd9b30c66/qf4ccf8f5435d4a78bdca4d6a018b578e/abaaaaaba;
      // 059: astore 2
      // 05a: aload 2
      // 05b: iload 1
      // 05c: ifne 067
      // 05f: ifnull 096
      // 062: goto 066
      // 065: athrow
      // 066: aload 2
      // 067: invokevirtual qeaa361f143ee4a0894bd168fd9b30c66/qf4ccf8f5435d4a78bdca4d6a018b578e/abaaaaaba.aaba ()Lqeaa361f143ee4a0894bd168fd9b30c66/qf4ccf8f5435d4a78bdca4d6a018b578e/babbaba;
      // 06a: ifnull 096
      // 06d: aload 0
      // 06e: iload 1
      // 06f: ifne 085
      // 072: goto 076
      // 075: athrow
      // 076: getfield net/minecraft/class_310.field_1755 Lnet/minecraft/class_437;
      // 079: ifnonnull 096
      // 07c: goto 080
      // 07f: athrow
      // 080: aload 0
      // 081: goto 085
      // 084: athrow
      // 085: getfield net/minecraft/class_310.field_1724 Lnet/minecraft/class_746;
      // 088: invokevirtual net/minecraft/class_746.method_5805 ()Z
      // 08b: iload 1
      // 08c: ifne 097
      // 08f: ifne 098
      // 092: goto 096
      // 095: athrow
      // 096: bipush 0
      // 097: ireturn
      // 098: aload 2
      // 099: invokevirtual qeaa361f143ee4a0894bd168fd9b30c66/qf4ccf8f5435d4a78bdca4d6a018b578e/abaaaaaba.aaba ()Lqeaa361f143ee4a0894bd168fd9b30c66/qf4ccf8f5435d4a78bdca4d6a018b578e/babbaba;
      // 09c: invokevirtual qeaa361f143ee4a0894bd168fd9b30c66/qf4ccf8f5435d4a78bdca4d6a018b578e/babbaba.abaaabb ()Lqeaa361f143ee4a0894bd168fd9b30c66/qf4ccf8f5435d4a78bdca4d6a018b578e/baabbbaa;
      // 09f: astore 3
      // 0a0: aload 3
      // 0a1: iload 1
      // 0a2: ifne 0ad
      // 0a5: ifnull 0be
      // 0a8: goto 0ac
      // 0ab: athrow
      // 0ac: aload 3
      // 0ad: aload 0
      // 0ae: invokevirtual qeaa361f143ee4a0894bd168fd9b30c66/qf4ccf8f5435d4a78bdca4d6a018b578e/baabbbaa.aabba (Lnet/minecraft/class_310;)Z
      // 0b1: iload 1
      // 0b2: ifne 0bd
      // 0b5: ifeq 0be
      // 0b8: goto 0bc
      // 0bb: athrow
      // 0bc: bipush 1
      // 0bd: ireturn
      // 0be: aload 2
      // 0bf: invokevirtual qeaa361f143ee4a0894bd168fd9b30c66/qf4ccf8f5435d4a78bdca4d6a018b578e/abaaaaaba.aaba ()Lqeaa361f143ee4a0894bd168fd9b30c66/qf4ccf8f5435d4a78bdca4d6a018b578e/babbaba;
      // 0c2: invokevirtual qeaa361f143ee4a0894bd168fd9b30c66/qf4ccf8f5435d4a78bdca4d6a018b578e/babbaba.abbbab ()Lqeaa361f143ee4a0894bd168fd9b30c66/qf4ccf8f5435d4a78bdca4d6a018b578e/baabb;
      // 0c5: astore 4
      // 0c7: aload 4
      // 0c9: iload 1
      // 0ca: ifne 0d6
      // 0cd: ifnull 0e4
      // 0d0: goto 0d4
      // 0d3: athrow
      // 0d4: aload 4
      // 0d6: invokevirtual qeaa361f143ee4a0894bd168fd9b30c66/qf4ccf8f5435d4a78bdca4d6a018b578e/baabb.babbaab ()Z
      // 0d9: iload 1
      // 0da: ifne 0e5
      // 0dd: ifne 0e6
      // 0e0: goto 0e4
      // 0e3: athrow
      // 0e4: bipush 0
      // 0e5: ireturn
      // 0e6: aload 0
      // 0e7: getfield net/minecraft/class_310.field_1765 Lnet/minecraft/class_239;
      // 0ea: astore 7
      // 0ec: aload 7
      // 0ee: iload 1
      // 0ef: ifne 102
      // 0f2: instanceof net/minecraft/class_3966
      // 0f5: ifeq 13d
      // 0f8: goto 0fc
      // 0fb: athrow
      // 0fc: aload 7
      // 0fe: goto 102
      // 101: athrow
      // 102: checkcast net/minecraft/class_3966
      // 105: astore 6
      // 107: aload 6
      // 109: invokevirtual net/minecraft/class_3966.method_17782 ()Lnet/minecraft/class_1297;
      // 10c: astore 7
      // 10e: aload 7
      // 110: iload 1
      // 111: ifne 124
      // 114: instanceof net/minecraft/class_1511
      // 117: ifeq 13d
      // 11a: goto 11e
      // 11d: athrow
      // 11e: aload 7
      // 120: goto 124
      // 123: athrow
      // 124: checkcast net/minecraft/class_1511
      // 127: astore 5
      // 129: aload 5
      // 12b: invokevirtual net/minecraft/class_1511.method_31481 ()Z
      // 12e: iload 1
      // 12f: ifne 13a
      // 132: ifne 13d
      // 135: goto 139
      // 138: athrow
      // 139: bipush 1
      // 13a: goto 13e
      // 13d: bipush 0
      // 13e: ireturn
   }

   public static boolean ababbab(class_310 param0, bbbbaaaa param1) {
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
      // 09: ifnull 36
      // 0c: goto 10
      // 0f: athrow
      // 10: aload 0
      // 11: getfield net/minecraft/class_310.field_1724 Lnet/minecraft/class_746;
      // 14: ifnull 36
      // 17: aload 1
      // 18: iload 2
      // 19: ifne 28
      // 1c: goto 20
      // 1f: athrow
      // 20: ifnull 36
      // 23: goto 27
      // 26: athrow
      // 27: aload 1
      // 28: iload 2
      // 29: ifne 3a
      // 2c: invokevirtual qeaa361f143ee4a0894bd168fd9b30c66/qf4ccf8f5435d4a78bdca4d6a018b578e/bbbbaaaa.b ()Z
      // 2f: ifne 39
      // 32: goto 36
      // 35: athrow
      // 36: bipush 0
      // 37: ireturn
      // 38: athrow
      // 39: aload 1
      // 3a: invokevirtual qeaa361f143ee4a0894bd168fd9b30c66/qf4ccf8f5435d4a78bdca4d6a018b578e/bbbbaaaa.a ()Lqeaa361f143ee4a0894bd168fd9b30c66/qf4ccf8f5435d4a78bdca4d6a018b578e/abaabbba;
      // 3d: astore 3
      // 3e: aload 3
      // 3f: iload 2
      // 40: ifne 72
      // 43: ifnonnull 71
      // 46: goto 4a
      // 49: athrow
      // 4a: aload 0
      // 4b: getfield net/minecraft/class_310.field_1724 Lnet/minecraft/class_746;
      // 4e: invokevirtual net/minecraft/class_746.method_31548 ()Lnet/minecraft/class_1661;
      // 51: invokestatic qeaa361f143ee4a0894bd168fd9b30c66/qf4ccf8f5435d4a78bdca4d6a018b578e/aabbabbbb.abaabaa (Lnet/minecraft/class_1661;)I
      // 54: iload 2
      // 55: ifne 6c
      // 58: goto 5c
      // 5b: athrow
      // 5c: aload 1
      // 5d: invokevirtual qeaa361f143ee4a0894bd168fd9b30c66/qf4ccf8f5435d4a78bdca4d6a018b578e/bbbbaaaa.aa ()I
      // 60: if_icmpne 6f
      // 63: goto 67
      // 66: athrow
      // 67: bipush 1
      // 68: goto 6c
      // 6b: athrow
      // 6c: goto 70
      // 6f: bipush 0
      // 70: ireturn
      // 71: aload 3
      // 72: invokevirtual qeaa361f143ee4a0894bd168fd9b30c66/qf4ccf8f5435d4a78bdca4d6a018b578e/abaabbba.ab ()J
      // 75: lconst_0
      // 76: lcmp
      // 77: iload 2
      // 78: ifne 9d
      // 7b: ifge 96
      // 7e: goto 82
      // 81: athrow
      // 82: new qeaa361f143ee4a0894bd168fd9b30c66/qf4ccf8f5435d4a78bdca4d6a018b578e/aaaababaa
      // 85: dup
      // 86: aload 0
      // 87: invokespecial qeaa361f143ee4a0894bd168fd9b30c66/qf4ccf8f5435d4a78bdca4d6a018b578e/aaaababaa.<init> (Lnet/minecraft/class_310;)V
      // 8a: getstatic qeaa361f143ee4a0894bd168fd9b30c66/qf4ccf8f5435d4a78bdca4d6a018b578e/bbbabbab.b Lqeaa361f143ee4a0894bd168fd9b30c66/qf4ccf8f5435d4a78bdca4d6a018b578e/bbbabbab;
      // 8d: aload 1
      // 8e: invokevirtual qeaa361f143ee4a0894bd168fd9b30c66/qf4ccf8f5435d4a78bdca4d6a018b578e/bbbbaaaa.aa ()I
      // 91: invokevirtual qeaa361f143ee4a0894bd168fd9b30c66/qf4ccf8f5435d4a78bdca4d6a018b578e/aaaababaa.ab (Lqeaa361f143ee4a0894bd168fd9b30c66/qf4ccf8f5435d4a78bdca4d6a018b578e/bbbabbab;I)Z
      // 94: ireturn
      // 95: athrow
      // 96: getstatic qeaa361f143ee4a0894bd168fd9b30c66/qf4ccf8f5435d4a78bdca4d6a018b578e/aabbabbbb.aba Lqeaa361f143ee4a0894bd168fd9b30c66/qf4ccf8f5435d4a78bdca4d6a018b578e/abaaabaa;
      // 99: aload 3
      // 9a: invokevirtual qeaa361f143ee4a0894bd168fd9b30c66/qf4ccf8f5435d4a78bdca4d6a018b578e/abaaabaa.baa (Lqeaa361f143ee4a0894bd168fd9b30c66/qf4ccf8f5435d4a78bdca4d6a018b578e/abaabbba;)Z
      // 9d: ireturn
   }

   public static boolean ababbba(class_310 param0) {
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
      // 06: ifne 11
      // 09: ifnull 45
      // 0c: goto 10
      // 0f: athrow
      // 10: aload 0
      // 11: iload 1
      // 12: ifne 24
      // 15: getfield net/minecraft/class_310.field_1690 Lnet/minecraft/class_315;
      // 18: ifnull 45
      // 1b: goto 1f
      // 1e: athrow
      // 1f: aload 0
      // 20: goto 24
      // 23: athrow
      // 24: iload 1
      // 25: ifne 37
      // 28: getfield net/minecraft/class_310.field_1755 Lnet/minecraft/class_437;
      // 2b: ifnonnull 45
      // 2e: goto 32
      // 31: athrow
      // 32: aload 0
      // 33: goto 37
      // 36: athrow
      // 37: iload 1
      // 38: ifne 49
      // 3b: invokevirtual net/minecraft/class_310.method_1569 ()Z
      // 3e: ifne 48
      // 41: goto 45
      // 44: athrow
      // 45: bipush 0
      // 46: ireturn
      // 47: athrow
      // 48: aload 0
      // 49: aload 0
      // 4a: getfield net/minecraft/class_310.field_1690 Lnet/minecraft/class_315;
      // 4d: getfield net/minecraft/class_315.field_1904 Lnet/minecraft/class_304;
      // 50: invokestatic qeaa361f143ee4a0894bd168fd9b30c66/qf4ccf8f5435d4a78bdca4d6a018b578e/aabbabbbb.bbbbb (Lnet/minecraft/class_310;Lnet/minecraft/class_304;)Z
      // 53: ireturn
   }

   public static void ababbbb(class_310 var0) {
      bbbabaa.aaaa(var0, 0);
   }

   private static boolean abbaaaa(abaaaba param0, int param1) {
      // $VF: Couldn't be decompiled
      // Please report this to the Vineflower issue tracker, at https://github.com/Vineflower/vineflower/issues with a copy of the class file (if you have the rights to distribute it!)
      // java.lang.RuntimeException: parsing failure!
      //   at org.jetbrains.java.decompiler.modules.decompiler.decompose.DomHelper.parseGraph(DomHelper.java:211)
      //   at org.jetbrains.java.decompiler.main.rels.MethodProcessor.codeToJava(MethodProcessor.java:166)
      //
      // Bytecode:
      // 00: getstatic qeaa361f143ee4a0894bd168fd9b30c66/qf4ccf8f5435d4a78bdca4d6a018b578e/baaabbaa.bba I
      // 03: getstatic qeaa361f143ee4a0894bd168fd9b30c66/qf4ccf8f5435d4a78bdca4d6a018b578e/aabbabbbb.bbab Ljava/util/concurrent/ConcurrentLinkedQueue;
      // 06: invokevirtual java/util/concurrent/ConcurrentLinkedQueue.iterator ()Ljava/util/Iterator;
      // 09: astore 3
      // 0a: istore 2
      // 0b: aload 3
      // 0c: invokeinterface java/util/Iterator.hasNext ()Z 1
      // 11: ifeq 6a
      // 14: aload 3
      // 15: invokeinterface java/util/Iterator.next ()Ljava/lang/Object; 1
      // 1a: checkcast qeaa361f143ee4a0894bd168fd9b30c66/qf4ccf8f5435d4a78bdca4d6a018b578e/abaaaba
      // 1d: astore 4
      // 1f: aload 4
      // 21: iload 2
      // 22: ifne 39
      // 25: invokevirtual qeaa361f143ee4a0894bd168fd9b30c66/qf4ccf8f5435d4a78bdca4d6a018b578e/abaaaba.aa ()Lnet/minecraft/class_746;
      // 28: aload 0
      // 29: invokevirtual qeaa361f143ee4a0894bd168fd9b30c66/qf4ccf8f5435d4a78bdca4d6a018b578e/abaaaba.aa ()Lnet/minecraft/class_746;
      // 2c: if_acmpne 66
      // 2f: goto 33
      // 32: athrow
      // 33: aload 4
      // 35: goto 39
      // 38: athrow
      // 39: invokevirtual qeaa361f143ee4a0894bd168fd9b30c66/qf4ccf8f5435d4a78bdca4d6a018b578e/abaaaba.ab ()I
      // 3c: iload 2
      // 3d: ifne 51
      // 40: iload 1
      // 41: if_icmpne 66
      // 44: goto 48
      // 47: athrow
      // 48: aload 4
      // 4a: invokevirtual qeaa361f143ee4a0894bd168fd9b30c66/qf4ccf8f5435d4a78bdca4d6a018b578e/abaaaba.ba ()I
      // 4d: goto 51
      // 50: athrow
      // 51: iload 2
      // 52: ifne 65
      // 55: aload 0
      // 56: invokevirtual qeaa361f143ee4a0894bd168fd9b30c66/qf4ccf8f5435d4a78bdca4d6a018b578e/abaaaba.ab ()I
      // 59: if_icmpne 66
      // 5c: goto 60
      // 5f: athrow
      // 60: bipush 1
      // 61: goto 65
      // 64: athrow
      // 65: ireturn
      // 66: iload 2
      // 67: ifeq 0b
      // 6a: bipush 0
      // 6b: ireturn
   }

   public static void abbaaab() {
      int var10000 = b(604047209, 2107501454 ^ -1531561452);
      int var10001 = b(604047208, 2107501454 ^ 1980400403);
      aaabbbb();
      abbba = -1;
      bbabb = aaaaa(var10001, 1202197698883163417L);
      aaaaa = baabb(var10000, 2691101086531350617L);
      bbaaa = -1;
   }

   public static void abbaaba() {
      bab = true;
   }

   public static class_306 abbaabb(class_304 param0) {
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
      // 05: ifnonnull 0d
      // 08: getstatic net/minecraft/class_3675.field_16237 Lnet/minecraft/class_3675$class_306;
      // 0b: areturn
      // 0c: athrow
      // 0d: getstatic qeaa361f143ee4a0894bd168fd9b30c66/qf4ccf8f5435d4a78bdca4d6a018b578e/aabbabbbb.bba Ljava/lang/reflect/Field;
      // 10: iload 1
      // 11: ifne 22
      // 14: ifnull 54
      // 17: goto 1b
      // 1a: athrow
      // 1b: getstatic qeaa361f143ee4a0894bd168fd9b30c66/qf4ccf8f5435d4a78bdca4d6a018b578e/aabbabbbb.bba Ljava/lang/reflect/Field;
      // 1e: aload 0
      // 1f: invokevirtual java/lang/reflect/Field.get (Ljava/lang/Object;)Ljava/lang/Object;
      // 22: astore 2
      // 23: aload 2
      // 24: iload 1
      // 25: ifne 37
      // 28: instanceof net/minecraft/class_3675$class_306
      // 2b: ifeq 50
      // 2e: goto 32
      // 31: athrow
      // 32: aload 2
      // 33: goto 37
      // 36: athrow
      // 37: checkcast net/minecraft/class_3675$class_306
      // 3a: astore 3
      // 3b: aload 3
      // 3c: iload 1
      // 3d: ifne 4f
      // 40: invokestatic qeaa361f143ee4a0894bd168fd9b30c66/qf4ccf8f5435d4a78bdca4d6a018b578e/aabbabbbb.bbaaaaa (Lnet/minecraft/class_3675$class_306;)Z
      // 43: ifne 50
      // 46: goto 4a
      // 49: athrow
      // 4a: aload 3
      // 4b: goto 4f
      // 4e: athrow
      // 4f: areturn
      // 50: goto 54
      // 53: astore 2
      // 54: aload 0
      // 55: invokevirtual net/minecraft/class_304.method_1428 ()Ljava/lang/String;
      // 58: astore 2
      // 59: aload 2
      // 5a: iload 1
      // 5b: ifne 66
      // 5e: ifnull 92
      // 61: goto 65
      // 64: athrow
      // 65: aload 2
      // 66: iload 1
      // 67: ifne 79
      // 6a: invokevirtual java/lang/String.isBlank ()Z
      // 6d: ifne 92
      // 70: goto 74
      // 73: athrow
      // 74: aload 2
      // 75: goto 79
      // 78: athrow
      // 79: invokestatic net/minecraft/class_3675.method_15981 (Ljava/lang/String;)Lnet/minecraft/class_3675$class_306;
      // 7c: astore 3
      // 7d: aload 3
      // 7e: iload 1
      // 7f: ifne 91
      // 82: invokestatic qeaa361f143ee4a0894bd168fd9b30c66/qf4ccf8f5435d4a78bdca4d6a018b578e/aabbabbbb.bbaaaaa (Lnet/minecraft/class_3675$class_306;)Z
      // 85: ifne 92
      // 88: goto 8c
      // 8b: athrow
      // 8c: aload 3
      // 8d: goto 91
      // 90: athrow
      // 91: areturn
      // 92: goto 96
      // 95: astore 2
      // 96: getstatic net/minecraft/class_3675.field_16237 Lnet/minecraft/class_3675$class_306;
      // 99: areturn
   }

   public static boolean abbabaa(class_310 var0, Object var1, int var2, class_3966 var3) {
      return baabbb(var0, var1, var2, var3, aaaaabbb.ba);
   }

   public static boolean abbabab(class_310 param0) {
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
      // 06: ifne 11
      // 09: ifnull 4e
      // 0c: goto 10
      // 0f: athrow
      // 10: aload 0
      // 11: getfield net/minecraft/class_310.field_1724 Lnet/minecraft/class_746;
      // 14: ifnull 4e
      // 17: getstatic qeaa361f143ee4a0894bd168fd9b30c66/qf4ccf8f5435d4a78bdca4d6a018b578e/aabbabbbb.babab J
      // 1a: getstatic qeaa361f143ee4a0894bd168fd9b30c66/qf4ccf8f5435d4a78bdca4d6a018b578e/aabbabbbb.ab J
      // 1d: lcmp
      // 1e: iload 1
      // 1f: ifne 38
      // 22: goto 26
      // 25: athrow
      // 26: ifne 4e
      // 29: goto 2d
      // 2c: athrow
      // 2d: aload 0
      // 2e: getfield net/minecraft/class_310.field_1724 Lnet/minecraft/class_746;
      // 31: invokestatic java/lang/System.identityHashCode (Ljava/lang/Object;)I
      // 34: goto 38
      // 37: athrow
      // 38: iload 1
      // 39: ifne 4b
      // 3c: getstatic qeaa361f143ee4a0894bd168fd9b30c66/qf4ccf8f5435d4a78bdca4d6a018b578e/aabbabbbb.babba I
      // 3f: if_icmpne 4e
      // 42: goto 46
      // 45: athrow
      // 46: bipush 1
      // 47: goto 4b
      // 4a: athrow
      // 4b: goto 4f
      // 4e: bipush 0
      // 4f: ireturn
   }

   public static class_1297 abbabba(class_310 param0) {
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
      // 06: ifne 14
      // 09: ifnonnull 13
      // 0c: goto 10
      // 0f: athrow
      // 10: aconst_null
      // 11: areturn
      // 12: athrow
      // 13: aload 0
      // 14: getfield net/minecraft/class_310.field_1765 Lnet/minecraft/class_239;
      // 17: astore 3
      // 18: aload 3
      // 19: iload 1
      // 1a: ifne 2c
      // 1d: instanceof net/minecraft/class_3966
      // 20: ifeq 35
      // 23: goto 27
      // 26: athrow
      // 27: aload 3
      // 28: goto 2c
      // 2b: athrow
      // 2c: checkcast net/minecraft/class_3966
      // 2f: astore 2
      // 30: aload 2
      // 31: invokevirtual net/minecraft/class_3966.method_17782 ()Lnet/minecraft/class_1297;
      // 34: areturn
      // 35: aload 0
      // 36: ldc2_w 3.0
      // 39: invokestatic qeaa361f143ee4a0894bd168fd9b30c66/qf4ccf8f5435d4a78bdca4d6a018b578e/aabbabbbb.bbbaba (Lnet/minecraft/class_310;D)Lnet/minecraft/class_3966;
      // 3c: astore 2
      // 3d: aload 2
      // 3e: iload 1
      // 3f: ifne 4a
      // 42: ifnull 50
      // 45: goto 49
      // 48: athrow
      // 49: aload 2
      // 4a: invokevirtual net/minecraft/class_3966.method_17782 ()Lnet/minecraft/class_1297;
      // 4d: goto 51
      // 50: aconst_null
      // 51: areturn
   }

   public static class_3966 abbabbb(class_310 param0, class_1309 param1, double param2, boolean param4) {
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
      // 06: iload 5
      // 08: ifne 13
      // 0b: ifnull 26
      // 0e: goto 12
      // 11: athrow
      // 12: aload 0
      // 13: getfield net/minecraft/class_310.field_1724 Lnet/minecraft/class_746;
      // 16: iload 5
      // 18: ifne 23
      // 1b: ifnull 26
      // 1e: goto 22
      // 21: athrow
      // 22: aload 1
      // 23: ifnonnull 29
      // 26: aconst_null
      // 27: areturn
      // 28: athrow
      // 29: aload 0
      // 2a: iload 5
      // 2c: ifne 85
      // 2f: getfield net/minecraft/class_310.field_1765 Lnet/minecraft/class_239;
      // 32: astore 7
      // 34: aload 7
      // 36: instanceof net/minecraft/class_3966
      // 39: ifeq 84
      // 3c: aload 7
      // 3e: checkcast net/minecraft/class_3966
      // 41: astore 6
      // 43: iload 5
      // 45: ifne 8b
      // 48: aload 6
      // 4a: invokevirtual net/minecraft/class_3966.method_17782 ()Lnet/minecraft/class_1297;
      // 4d: aload 1
      // 4e: if_acmpne 84
      // 51: goto 55
      // 54: athrow
      // 55: dload 2
      // 56: ldc2_w 1.0E-4
      // 59: dadd
      // 5a: dload 2
      // 5b: ldc2_w 1.0E-4
      // 5e: dadd
      // 5f: dmul
      // 60: dstore 7
      // 62: iload 5
      // 64: ifne 8b
      // 67: aload 0
      // 68: getfield net/minecraft/class_310.field_1724 Lnet/minecraft/class_746;
      // 6b: invokevirtual net/minecraft/class_746.method_33571 ()Lnet/minecraft/class_243;
      // 6e: aload 6
      // 70: invokevirtual net/minecraft/class_3966.method_17784 ()Lnet/minecraft/class_243;
      // 73: invokevirtual net/minecraft/class_243.method_1025 (Lnet/minecraft/class_243;)D
      // 76: dload 7
      // 78: dcmpg
      // 79: ifgt 84
      // 7c: goto 80
      // 7f: athrow
      // 80: aload 6
      // 82: areturn
      // 83: athrow
      // 84: aload 0
      // 85: dload 2
      // 86: invokestatic qeaa361f143ee4a0894bd168fd9b30c66/qf4ccf8f5435d4a78bdca4d6a018b578e/aabbabbbb.bbbaba (Lnet/minecraft/class_310;D)Lnet/minecraft/class_3966;
      // 89: astore 6
      // 8b: aload 6
      // 8d: iload 5
      // 8f: ifne 9b
      // 92: ifnull b2
      // 95: goto 99
      // 98: athrow
      // 99: aload 6
      // 9b: iload 5
      // 9d: ifne b1
      // a0: invokevirtual net/minecraft/class_3966.method_17782 ()Lnet/minecraft/class_1297;
      // a3: aload 1
      // a4: if_acmpne b2
      // a7: goto ab
      // aa: athrow
      // ab: aload 6
      // ad: goto b1
      // b0: athrow
      // b1: areturn
      // b2: aconst_null
      // b3: areturn
   }

   public static boolean abbbaaa(class_310 param0, class_1309 param1) {
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
      // 006: ifne 011
      // 009: ifnull 032
      // 00c: goto 010
      // 00f: athrow
      // 010: aload 0
      // 011: iload 2
      // 012: ifne 024
      // 015: getfield net/minecraft/class_310.field_1724 Lnet/minecraft/class_746;
      // 018: ifnull 032
      // 01b: goto 01f
      // 01e: athrow
      // 01f: aload 0
      // 020: goto 024
      // 023: athrow
      // 024: getfield net/minecraft/class_310.field_1687 Lnet/minecraft/class_638;
      // 027: ifnull 032
      // 02a: aload 1
      // 02b: ifnonnull 035
      // 02e: goto 032
      // 031: athrow
      // 032: bipush 0
      // 033: ireturn
      // 034: athrow
      // 035: aload 0
      // 036: getfield net/minecraft/class_310.field_1724 Lnet/minecraft/class_746;
      // 039: invokevirtual net/minecraft/class_746.method_33571 ()Lnet/minecraft/class_243;
      // 03c: astore 3
      // 03d: aload 1
      // 03e: invokevirtual net/minecraft/class_1309.method_5829 ()Lnet/minecraft/class_238;
      // 041: astore 4
      // 043: ldc2_w 0.05
      // 046: dstore 5
      // 048: bipush 3
      // 049: newarray 7
      // 04b: dup
      // 04c: bipush 0
      // 04d: aload 4
      // 04f: getfield net/minecraft/class_238.field_1323 D
      // 052: dload 5
      // 054: dadd
      // 055: dastore
      // 056: dup
      // 057: bipush 1
      // 058: aload 4
      // 05a: getfield net/minecraft/class_238.field_1323 D
      // 05d: aload 4
      // 05f: getfield net/minecraft/class_238.field_1320 D
      // 062: dadd
      // 063: ldc2_w 0.5
      // 066: dmul
      // 067: dastore
      // 068: dup
      // 069: bipush 2
      // 06a: aload 4
      // 06c: getfield net/minecraft/class_238.field_1320 D
      // 06f: dload 5
      // 071: dsub
      // 072: dastore
      // 073: astore 7
      // 075: bipush 3
      // 076: newarray 7
      // 078: dup
      // 079: bipush 0
      // 07a: aload 4
      // 07c: getfield net/minecraft/class_238.field_1322 D
      // 07f: dload 5
      // 081: dadd
      // 082: dastore
      // 083: dup
      // 084: bipush 1
      // 085: aload 4
      // 087: getfield net/minecraft/class_238.field_1322 D
      // 08a: aload 4
      // 08c: getfield net/minecraft/class_238.field_1325 D
      // 08f: dadd
      // 090: ldc2_w 0.5
      // 093: dmul
      // 094: dastore
      // 095: dup
      // 096: bipush 2
      // 097: aload 4
      // 099: getfield net/minecraft/class_238.field_1325 D
      // 09c: dload 5
      // 09e: dsub
      // 09f: dastore
      // 0a0: astore 8
      // 0a2: bipush 3
      // 0a3: newarray 7
      // 0a5: dup
      // 0a6: bipush 0
      // 0a7: aload 4
      // 0a9: getfield net/minecraft/class_238.field_1321 D
      // 0ac: dload 5
      // 0ae: dadd
      // 0af: dastore
      // 0b0: dup
      // 0b1: bipush 1
      // 0b2: aload 4
      // 0b4: getfield net/minecraft/class_238.field_1321 D
      // 0b7: aload 4
      // 0b9: getfield net/minecraft/class_238.field_1324 D
      // 0bc: dadd
      // 0bd: ldc2_w 0.5
      // 0c0: dmul
      // 0c1: dastore
      // 0c2: dup
      // 0c3: bipush 2
      // 0c4: aload 4
      // 0c6: getfield net/minecraft/class_238.field_1324 D
      // 0c9: dload 5
      // 0cb: dsub
      // 0cc: dastore
      // 0cd: astore 9
      // 0cf: aload 7
      // 0d1: astore 10
      // 0d3: aload 10
      // 0d5: arraylength
      // 0d6: istore 11
      // 0d8: bipush 0
      // 0d9: istore 12
      // 0db: iload 12
      // 0dd: iload 11
      // 0df: if_icmpge 16a
      // 0e2: aload 10
      // 0e4: iload 12
      // 0e6: daload
      // 0e7: dstore 13
      // 0e9: aload 8
      // 0eb: astore 15
      // 0ed: aload 15
      // 0ef: arraylength
      // 0f0: iload 2
      // 0f1: ifne 16b
      // 0f4: istore 16
      // 0f6: bipush 0
      // 0f7: istore 17
      // 0f9: iload 17
      // 0fb: iload 16
      // 0fd: if_icmpge 163
      // 100: aload 15
      // 102: iload 17
      // 104: iload 2
      // 105: ifne 0e6
      // 108: daload
      // 109: dstore 18
      // 10b: aload 9
      // 10d: astore 20
      // 10f: aload 20
      // 111: arraylength
      // 112: istore 21
      // 114: bipush 0
      // 115: istore 22
      // 117: iload 22
      // 119: iload 21
      // 11b: if_icmpge 15c
      // 11e: aload 20
      // 120: iload 22
      // 122: daload
      // 123: dstore 23
      // 125: iload 2
      // 126: new net/minecraft/class_243
      // 129: dup
      // 12a: dload 13
      // 12c: dload 18
      // 12e: dload 23
      // 130: invokespecial net/minecraft/class_243.<init> (DDD)V
      // 133: astore 25
      // 135: ifne 15f
      // 138: iload 2
      // 139: ifne 158
      // 13c: goto 140
      // 13f: athrow
      // 140: aload 0
      // 141: aload 0
      // 142: getfield net/minecraft/class_310.field_1724 Lnet/minecraft/class_746;
      // 145: aload 3
      // 146: aload 25
      // 148: invokestatic qeaa361f143ee4a0894bd168fd9b30c66/qf4ccf8f5435d4a78bdca4d6a018b578e/aabbabbbb.aaabaab (Lnet/minecraft/class_310;Lnet/minecraft/class_1297;Lnet/minecraft/class_243;Lnet/minecraft/class_243;)Z
      // 14b: ifne 155
      // 14e: goto 152
      // 151: athrow
      // 152: bipush 0
      // 153: ireturn
      // 154: athrow
      // 155: iinc 22 1
      // 158: iload 2
      // 159: ifeq 117
      // 15c: iinc 17 1
      // 15f: iload 2
      // 160: ifeq 0f9
      // 163: iinc 12 1
      // 166: iload 2
      // 167: ifeq 0db
      // 16a: bipush 1
      // 16b: ireturn
   }

   private static Float abbbaab(Object param0, String param1, String param2) {
      // $VF: Couldn't be decompiled
      // Please report this to the Vineflower issue tracker, at https://github.com/Vineflower/vineflower/issues with a copy of the class file (if you have the rights to distribute it!)
      // java.lang.RuntimeException: parsing failure!
      //   at org.jetbrains.java.decompiler.modules.decompiler.decompose.DomHelper.parseGraph(DomHelper.java:211)
      //   at org.jetbrains.java.decompiler.main.rels.MethodProcessor.codeToJava(MethodProcessor.java:166)
      //
      // Bytecode:
      // 000: ldc_w -1928280839
      // 003: istore 11
      // 005: getstatic qeaa361f143ee4a0894bd168fd9b30c66/qf4ccf8f5435d4a78bdca4d6a018b578e/baaabbaa.bba I
      // 008: istore 3
      // 009: aload 0
      // 00a: iload 3
      // 00b: ifne 019
      // 00e: ifnonnull 018
      // 011: goto 015
      // 014: athrow
      // 015: aconst_null
      // 016: areturn
      // 017: athrow
      // 018: aload 0
      // 019: aload 1
      // 01a: aload 2
      // 01b: invokestatic qeaa361f143ee4a0894bd168fd9b30c66/qf4ccf8f5435d4a78bdca4d6a018b578e/aabbabbbb.aaaaab (Ljava/lang/Object;Ljava/lang/String;Ljava/lang/String;)Ljava/lang/Float;
      // 01e: astore 4
      // 020: aload 4
      // 022: iload 3
      // 023: ifne 02f
      // 026: ifnull 030
      // 029: goto 02d
      // 02c: athrow
      // 02d: aload 4
      // 02f: areturn
      // 030: bipush 5
      // 031: anewarray 231
      // 034: dup
      // 035: bipush 0
      // 036: ldc_w 604047211
      // 039: iload 11
      // 03b: ldc_w -905446922
      // 03e: ixor
      // 03f: invokestatic qeaa361f143ee4a0894bd168fd9b30c66/qf4ccf8f5435d4a78bdca4d6a018b578e/aabbabbbb.b (II)I
      // 042: ldc_w 604047210
      // 045: iload 11
      // 047: ldc_w 2063270238
      // 04a: ixor
      // 04b: invokestatic qeaa361f143ee4a0894bd168fd9b30c66/qf4ccf8f5435d4a78bdca4d6a018b578e/aabbabbbb.b (II)I
      // 04e: invokestatic qeaa361f143ee4a0894bd168fd9b30c66/qf4ccf8f5435d4a78bdca4d6a018b578e/aabbabbbb.bbaabaa (II)Ljava/lang/String;
      // 051: invokestatic qeaa361f143ee4a0894bd168fd9b30c66/qf4ccf8f5435d4a78bdca4d6a018b578e/aabbaaaba.abba (Ljava/lang/String;)Ljava/lang/String;
      // 054: aastore
      // 055: dup
      // 056: bipush 1
      // 057: ldc_w 604047213
      // 05a: iload 11
      // 05c: ldc_w -1359139338
      // 05f: ixor
      // 060: invokestatic qeaa361f143ee4a0894bd168fd9b30c66/qf4ccf8f5435d4a78bdca4d6a018b578e/aabbabbbb.b (II)I
      // 063: ldc_w 604047212
      // 066: iload 11
      // 068: ldc_w -1442848830
      // 06b: ixor
      // 06c: invokestatic qeaa361f143ee4a0894bd168fd9b30c66/qf4ccf8f5435d4a78bdca4d6a018b578e/aabbabbbb.b (II)I
      // 06f: invokestatic qeaa361f143ee4a0894bd168fd9b30c66/qf4ccf8f5435d4a78bdca4d6a018b578e/aabbabbbb.bbaabaa (II)Ljava/lang/String;
      // 072: invokestatic qeaa361f143ee4a0894bd168fd9b30c66/qf4ccf8f5435d4a78bdca4d6a018b578e/aabbaaaba.abba (Ljava/lang/String;)Ljava/lang/String;
      // 075: aastore
      // 076: dup
      // 077: bipush 2
      // 078: ldc_w 604047215
      // 07b: iload 11
      // 07d: ldc_w 253500561
      // 080: ixor
      // 081: invokestatic qeaa361f143ee4a0894bd168fd9b30c66/qf4ccf8f5435d4a78bdca4d6a018b578e/aabbabbbb.b (II)I
      // 084: ldc_w 604047214
      // 087: iload 11
      // 089: ldc_w -633168800
      // 08c: ixor
      // 08d: invokestatic qeaa361f143ee4a0894bd168fd9b30c66/qf4ccf8f5435d4a78bdca4d6a018b578e/aabbabbbb.b (II)I
      // 090: invokestatic qeaa361f143ee4a0894bd168fd9b30c66/qf4ccf8f5435d4a78bdca4d6a018b578e/aabbabbbb.bbaabaa (II)Ljava/lang/String;
      // 093: invokestatic qeaa361f143ee4a0894bd168fd9b30c66/qf4ccf8f5435d4a78bdca4d6a018b578e/aabbaaaba.abba (Ljava/lang/String;)Ljava/lang/String;
      // 096: aastore
      // 097: dup
      // 098: bipush 3
      // 099: ldc_w 604047201
      // 09c: iload 11
      // 09e: ldc_w -1829118275
      // 0a1: ixor
      // 0a2: invokestatic qeaa361f143ee4a0894bd168fd9b30c66/qf4ccf8f5435d4a78bdca4d6a018b578e/aabbabbbb.b (II)I
      // 0a5: ldc_w 604047200
      // 0a8: iload 11
      // 0aa: ldc_w -1576316645
      // 0ad: ixor
      // 0ae: invokestatic qeaa361f143ee4a0894bd168fd9b30c66/qf4ccf8f5435d4a78bdca4d6a018b578e/aabbabbbb.b (II)I
      // 0b1: invokestatic qeaa361f143ee4a0894bd168fd9b30c66/qf4ccf8f5435d4a78bdca4d6a018b578e/aabbabbbb.bbaabaa (II)Ljava/lang/String;
      // 0b4: invokestatic qeaa361f143ee4a0894bd168fd9b30c66/qf4ccf8f5435d4a78bdca4d6a018b578e/aabbaaaba.abba (Ljava/lang/String;)Ljava/lang/String;
      // 0b7: aastore
      // 0b8: dup
      // 0b9: bipush 4
      // 0ba: ldc_w 604047203
      // 0bd: iload 11
      // 0bf: ldc_w -478944523
      // 0c2: ixor
      // 0c3: invokestatic qeaa361f143ee4a0894bd168fd9b30c66/qf4ccf8f5435d4a78bdca4d6a018b578e/aabbabbbb.b (II)I
      // 0c6: ldc_w 604047202
      // 0c9: iload 11
      // 0cb: ldc_w 253126608
      // 0ce: ixor
      // 0cf: invokestatic qeaa361f143ee4a0894bd168fd9b30c66/qf4ccf8f5435d4a78bdca4d6a018b578e/aabbabbbb.b (II)I
      // 0d2: invokestatic qeaa361f143ee4a0894bd168fd9b30c66/qf4ccf8f5435d4a78bdca4d6a018b578e/aabbabbbb.bbaabaa (II)Ljava/lang/String;
      // 0d5: invokestatic qeaa361f143ee4a0894bd168fd9b30c66/qf4ccf8f5435d4a78bdca4d6a018b578e/aabbaaaba.abba (Ljava/lang/String;)Ljava/lang/String;
      // 0d8: aastore
      // 0d9: astore 5
      // 0db: aload 5
      // 0dd: arraylength
      // 0de: istore 6
      // 0e0: bipush 0
      // 0e1: istore 7
      // 0e3: iload 7
      // 0e5: iload 6
      // 0e7: if_icmpge 12d
      // 0ea: aload 5
      // 0ec: iload 7
      // 0ee: aaload
      // 0ef: astore 8
      // 0f1: aload 0
      // 0f2: invokevirtual java/lang/Object.getClass ()Ljava/lang/Class;
      // 0f5: aload 8
      // 0f7: bipush 0
      // 0f8: anewarray 810
      // 0fb: invokevirtual java/lang/Class.getMethod (Ljava/lang/String;[Ljava/lang/Class;)Ljava/lang/reflect/Method;
      // 0fe: aload 0
      // 0ff: bipush 0
      // 100: anewarray 4
      // 103: invokevirtual java/lang/reflect/Method.invoke (Ljava/lang/Object;[Ljava/lang/Object;)Ljava/lang/Object;
      // 106: astore 9
      // 108: aload 9
      // 10a: aload 1
      // 10b: aload 2
      // 10c: invokestatic qeaa361f143ee4a0894bd168fd9b30c66/qf4ccf8f5435d4a78bdca4d6a018b578e/aabbabbbb.aaaaab (Ljava/lang/Object;Ljava/lang/String;Ljava/lang/String;)Ljava/lang/Float;
      // 10f: astore 10
      // 111: aload 10
      // 113: iload 3
      // 114: ifne 120
      // 117: ifnull 121
      // 11a: goto 11e
      // 11d: athrow
      // 11e: aload 10
      // 120: areturn
      // 121: goto 126
      // 124: astore 9
      // 126: iinc 7 1
      // 129: iload 3
      // 12a: ifeq 0e3
      // 12d: aconst_null
      // 12e: areturn
   }

   public static boolean abbbaba(class_310 param0, Object param1, int param2, BooleanSupplier param3) {
      // $VF: Couldn't be decompiled
      // Please report this to the Vineflower issue tracker, at https://github.com/Vineflower/vineflower/issues with a copy of the class file (if you have the rights to distribute it!)
      // java.lang.NullPointerException: Cannot invoke "org.jetbrains.java.decompiler.code.cfg.ExceptionRangeCFG.isCircular()" because "range" is null
      //   at org.jetbrains.java.decompiler.modules.decompiler.decompose.DomHelper.graphToStatement(DomHelper.java:84)
      //   at org.jetbrains.java.decompiler.modules.decompiler.decompose.DomHelper.parseGraph(DomHelper.java:203)
      //   at org.jetbrains.java.decompiler.main.rels.MethodProcessor.codeToJava(MethodProcessor.java:166)
      //
      // Bytecode:
      // 000: getstatic qeaa361f143ee4a0894bd168fd9b30c66/qf4ccf8f5435d4a78bdca4d6a018b578e/baaabbaa.bba I
      // 003: istore 4
      // 005: aload 0
      // 006: iload 4
      // 008: ifne 013
      // 00b: ifnull 0eb
      // 00e: goto 012
      // 011: athrow
      // 012: aload 0
      // 013: iload 4
      // 015: ifne 027
      // 018: getfield net/minecraft/class_310.field_1724 Lnet/minecraft/class_746;
      // 01b: ifnull 0eb
      // 01e: goto 022
      // 021: athrow
      // 022: aload 0
      // 023: goto 027
      // 026: athrow
      // 027: iload 4
      // 029: ifne 03b
      // 02c: invokevirtual net/minecraft/class_310.method_1562 ()Lnet/minecraft/class_634;
      // 02f: ifnull 0eb
      // 032: goto 036
      // 035: athrow
      // 036: aload 1
      // 037: goto 03b
      // 03a: athrow
      // 03b: ifnull 0eb
      // 03e: iload 2
      // 03f: iload 4
      // 041: ifne 0ec
      // 044: goto 048
      // 047: athrow
      // 048: iflt 0eb
      // 04b: goto 04f
      // 04e: athrow
      // 04f: iload 2
      // 050: iload 4
      // 052: ifne 0ec
      // 055: goto 059
      // 058: athrow
      // 059: ldc_w 604047111
      // 05c: ldc_w 75995483
      // 05f: ldc_w -1253402989
      // 062: ixor
      // 063: invokestatic qeaa361f143ee4a0894bd168fd9b30c66/qf4ccf8f5435d4a78bdca4d6a018b578e/aabbabbbb.b (II)I
      // 066: ldc2_w 6146930655705273313
      // 069: invokestatic qeaa361f143ee4a0894bd168fd9b30c66/qf4ccf8f5435d4a78bdca4d6a018b578e/aabbabbbb.aaaaa (IJ)I
      // 06c: if_icmpgt 0eb
      // 06f: goto 073
      // 072: athrow
      // 073: aload 3
      // 074: ifnull 0eb
      // 077: goto 07b
      // 07a: athrow
      // 07b: getstatic qeaa361f143ee4a0894bd168fd9b30c66/qf4ccf8f5435d4a78bdca4d6a018b578e/aabbabbbb.aba Lqeaa361f143ee4a0894bd168fd9b30c66/qf4ccf8f5435d4a78bdca4d6a018b578e/abaaabaa;
      // 07e: iload 4
      // 080: ifne 099
      // 083: goto 087
      // 086: athrow
      // 087: aload 1
      // 088: invokevirtual qeaa361f143ee4a0894bd168fd9b30c66/qf4ccf8f5435d4a78bdca4d6a018b578e/abaaabaa.abbb (Ljava/lang/Object;)Z
      // 08b: ifne 0a8
      // 08e: goto 092
      // 091: athrow
      // 092: getstatic qeaa361f143ee4a0894bd168fd9b30c66/qf4ccf8f5435d4a78bdca4d6a018b578e/aabbabbbb.aba Lqeaa361f143ee4a0894bd168fd9b30c66/qf4ccf8f5435d4a78bdca4d6a018b578e/abaaabaa;
      // 095: goto 099
      // 098: athrow
      // 099: invokevirtual qeaa361f143ee4a0894bd168fd9b30c66/qf4ccf8f5435d4a78bdca4d6a018b578e/abaaabaa.bb ()Z
      // 09c: iload 4
      // 09e: ifne 0ec
      // 0a1: ifne 0eb
      // 0a4: goto 0a8
      // 0a7: athrow
      // 0a8: getstatic qeaa361f143ee4a0894bd168fd9b30c66/qf4ccf8f5435d4a78bdca4d6a018b578e/aabbabbbb.baab Lqeaa361f143ee4a0894bd168fd9b30c66/qf4ccf8f5435d4a78bdca4d6a018b578e/bbaaba;
      // 0ab: ifnonnull 0eb
      // 0ae: goto 0b2
      // 0b1: athrow
      // 0b2: getstatic qeaa361f143ee4a0894bd168fd9b30c66/qf4ccf8f5435d4a78bdca4d6a018b578e/aabbabbbb.aaaba Z
      // 0b5: iload 4
      // 0b7: ifne 0ec
      // 0ba: goto 0be
      // 0bd: athrow
      // 0be: ifne 0eb
      // 0c1: goto 0c5
      // 0c4: athrow
      // 0c5: invokestatic qeaa361f143ee4a0894bd168fd9b30c66/qf4ccf8f5435d4a78bdca4d6a018b578e/aabbabbbb.babbbb ()Z
      // 0c8: iload 4
      // 0ca: ifne 0ec
      // 0cd: goto 0d1
      // 0d0: athrow
      // 0d1: ifne 0eb
      // 0d4: goto 0d8
      // 0d7: athrow
      // 0d8: invokestatic qeaa361f143ee4a0894bd168fd9b30c66/qf4ccf8f5435d4a78bdca4d6a018b578e/aabaaa.aabbaba ()Z
      // 0db: iload 4
      // 0dd: ifne 0fa
      // 0e0: goto 0e4
      // 0e3: athrow
      // 0e4: ifne 0ed
      // 0e7: goto 0eb
      // 0ea: athrow
      // 0eb: bipush 0
      // 0ec: ireturn
      // 0ed: aload 0
      // 0ee: iload 4
      // 0f0: ifne 109
      // 0f3: invokestatic qeaa361f143ee4a0894bd168fd9b30c66/qf4ccf8f5435d4a78bdca4d6a018b578e/aabbabbbb.bbaa (Lnet/minecraft/class_310;)Z
      // 0f6: goto 0fa
      // 0f9: athrow
      // 0fa: ifeq 100
      // 0fd: bipush 0
      // 0fe: ireturn
      // 0ff: athrow
      // 100: getstatic qeaa361f143ee4a0894bd168fd9b30c66/qf4ccf8f5435d4a78bdca4d6a018b578e/aabbabbbb.aabab I
      // 103: bipush 1
      // 104: iadd
      // 105: putstatic qeaa361f143ee4a0894bd168fd9b30c66/qf4ccf8f5435d4a78bdca4d6a018b578e/aabbabbbb.aabab I
      // 108: aload 0
      // 109: aload 1
      // 10a: iload 2
      // 10b: bipush 0
      // 10c: bipush 1
      // 10d: invokestatic qeaa361f143ee4a0894bd168fd9b30c66/qf4ccf8f5435d4a78bdca4d6a018b578e/aabbabbbb.aaabaa (Lnet/minecraft/class_310;Ljava/lang/Object;IIZ)Lqeaa361f143ee4a0894bd168fd9b30c66/qf4ccf8f5435d4a78bdca4d6a018b578e/bbbbaaaa;
      // 110: astore 5
      // 112: aload 5
      // 114: iload 4
      // 116: ifne 122
      // 119: ifnull 145
      // 11c: goto 120
      // 11f: athrow
      // 120: aload 5
      // 122: invokevirtual qeaa361f143ee4a0894bd168fd9b30c66/qf4ccf8f5435d4a78bdca4d6a018b578e/bbbbaaaa.b ()Z
      // 125: iload 4
      // 127: ifne 14a
      // 12a: ifeq 145
      // 12d: goto 131
      // 130: athrow
      // 131: invokestatic qeaa361f143ee4a0894bd168fd9b30c66/qf4ccf8f5435d4a78bdca4d6a018b578e/bbbbbbba.ba ()I
      // 134: iload 4
      // 136: ifne 164
      // 139: goto 13d
      // 13c: athrow
      // 13d: iload 2
      // 13e: if_icmpeq 15b
      // 141: goto 145
      // 144: athrow
      // 145: bipush 0
      // 146: goto 14a
      // 149: athrow
      // 14a: istore 6
      // 14c: bipush 0
      // 14d: getstatic qeaa361f143ee4a0894bd168fd9b30c66/qf4ccf8f5435d4a78bdca4d6a018b578e/aabbabbbb.aabab I
      // 150: bipush 1
      // 151: isub
      // 152: invokestatic java/lang/Math.max (II)I
      // 155: putstatic qeaa361f143ee4a0894bd168fd9b30c66/qf4ccf8f5435d4a78bdca4d6a018b578e/aabbabbbb.aabab I
      // 158: iload 6
      // 15a: ireturn
      // 15b: bipush 0
      // 15c: getstatic qeaa361f143ee4a0894bd168fd9b30c66/qf4ccf8f5435d4a78bdca4d6a018b578e/aabbabbbb.aabab I
      // 15f: bipush 1
      // 160: isub
      // 161: invokestatic java/lang/Math.max (II)I
      // 164: putstatic qeaa361f143ee4a0894bd168fd9b30c66/qf4ccf8f5435d4a78bdca4d6a018b578e/aabbabbbb.aabab I
      // 167: goto 17b
      // 16a: astore 7
      // 16c: bipush 0
      // 16d: getstatic qeaa361f143ee4a0894bd168fd9b30c66/qf4ccf8f5435d4a78bdca4d6a018b578e/aabbabbbb.aabab I
      // 170: bipush 1
      // 171: isub
      // 172: invokestatic java/lang/Math.max (II)I
      // 175: putstatic qeaa361f143ee4a0894bd168fd9b30c66/qf4ccf8f5435d4a78bdca4d6a018b578e/aabbabbbb.aabab I
      // 178: aload 7
      // 17a: athrow
      // 17b: getstatic qeaa361f143ee4a0894bd168fd9b30c66/qf4ccf8f5435d4a78bdca4d6a018b578e/aabbabbbb.babb I
      // 17e: bipush 1
      // 17f: iadd
      // 180: putstatic qeaa361f143ee4a0894bd168fd9b30c66/qf4ccf8f5435d4a78bdca4d6a018b578e/aabbabbbb.babb I
      // 183: aload 3
      // 184: invokeinterface java/util/function/BooleanSupplier.getAsBoolean ()Z 1
      // 189: istore 5
      // 18b: bipush 0
      // 18c: getstatic qeaa361f143ee4a0894bd168fd9b30c66/qf4ccf8f5435d4a78bdca4d6a018b578e/aabbabbbb.babb I
      // 18f: bipush 1
      // 190: isub
      // 191: invokestatic java/lang/Math.max (II)I
      // 194: putstatic qeaa361f143ee4a0894bd168fd9b30c66/qf4ccf8f5435d4a78bdca4d6a018b578e/aabbabbbb.babb I
      // 197: iload 5
      // 199: ireturn
      // 19a: astore 8
      // 19c: bipush 0
      // 19d: getstatic qeaa361f143ee4a0894bd168fd9b30c66/qf4ccf8f5435d4a78bdca4d6a018b578e/aabbabbbb.babb I
      // 1a0: bipush 1
      // 1a1: isub
      // 1a2: invokestatic java/lang/Math.max (II)I
      // 1a5: putstatic qeaa361f143ee4a0894bd168fd9b30c66/qf4ccf8f5435d4a78bdca4d6a018b578e/aabbabbbb.babb I
      // 1a8: aload 8
      // 1aa: athrow
   }

   public static boolean abbbabb() {
      return baba;
   }

   public static boolean abbbbaa(class_310 var0, Object var1, int var2, BooleanSupplier var3) {
      return bbbaab(var0, var1, var2, true, var3);
   }

   public static boolean abbbbab(class_310 param0, class_306 param1) {
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
      // 09: ifnull 2a
      // 0c: goto 10
      // 0f: athrow
      // 10: aload 0
      // 11: invokevirtual net/minecraft/class_310.method_22683 ()Lnet/minecraft/class_1041;
      // 14: ifnull 2a
      // 17: aload 1
      // 18: invokestatic qeaa361f143ee4a0894bd168fd9b30c66/qf4ccf8f5435d4a78bdca4d6a018b578e/aabbabbbb.bbaaaaa (Lnet/minecraft/class_3675$class_306;)Z
      // 1b: iload 2
      // 1c: ifne 2b
      // 1f: goto 23
      // 22: athrow
      // 23: ifeq 2c
      // 26: goto 2a
      // 29: athrow
      // 2a: bipush 0
      // 2b: ireturn
      // 2c: aload 0
      // 2d: invokevirtual net/minecraft/class_310.method_22683 ()Lnet/minecraft/class_1041;
      // 30: invokevirtual net/minecraft/class_1041.method_4490 ()J
      // 33: lstore 3
      // 34: getstatic qeaa361f143ee4a0894bd168fd9b30c66/qf4ccf8f5435d4a78bdca4d6a018b578e/aaaaaba.b [I
      // 37: aload 1
      // 38: invokevirtual net/minecraft/class_3675$class_306.method_1442 ()Lnet/minecraft/class_3675$class_307;
      // 3b: invokevirtual net/minecraft/class_3675$class_307.ordinal ()I
      // 3e: iaload
      // 3f: tableswitch 25 1 3 36 122 133
      // 58: new java/lang/MatchException
      // 5b: dup
      // 5c: aconst_null
      // 5d: aconst_null
      // 5e: invokespecial java/lang/MatchException.<init> (Ljava/lang/String;Ljava/lang/Throwable;)V
      // 61: athrow
      // 62: athrow
      // 63: aload 1
      // 64: invokevirtual net/minecraft/class_3675$class_306.method_1444 ()I
      // 67: istore 5
      // 69: iload 5
      // 6b: iload 2
      // 6c: ifne b6
      // 6f: iflt b5
      // 72: goto 76
      // 75: athrow
      // 76: iload 5
      // 78: iload 2
      // 79: ifne b6
      // 7c: goto 80
      // 7f: athrow
      // 80: ldc_w 604047110
      // 83: ldc_w 847472175
      // 86: ldc_w -1891698390
      // 89: ixor
      // 8a: invokestatic qeaa361f143ee4a0894bd168fd9b30c66/qf4ccf8f5435d4a78bdca4d6a018b578e/aabbabbbb.b (II)I
      // 8d: ldc2_w 3313797448042677094
      // 90: invokestatic qeaa361f143ee4a0894bd168fd9b30c66/qf4ccf8f5435d4a78bdca4d6a018b578e/aabbabbbb.aaaaa (IJ)I
      // 93: if_icmpgt b5
      // 96: goto 9a
      // 99: athrow
      // 9a: lload 3
      // 9b: iload 5
      // 9d: invokestatic org/lwjgl/glfw/GLFW.glfwGetMouseButton (JI)I
      // a0: iload 2
      // a1: ifne b6
      // a4: goto a8
      // a7: athrow
      // a8: bipush 1
      // a9: if_icmpne b5
      // ac: goto b0
      // af: athrow
      // b0: bipush 1
      // b1: goto d3
      // b4: athrow
      // b5: bipush 0
      // b6: goto d3
      // b9: aload 0
      // ba: aload 1
      // bb: invokevirtual net/minecraft/class_3675$class_306.method_1444 ()I
      // be: invokestatic qeaa361f143ee4a0894bd168fd9b30c66/qf4ccf8f5435d4a78bdca4d6a018b578e/aabbabbbb.bbaabba (Lnet/minecraft/class_310;I)Z
      // c1: goto d3
      // c4: getstatic qeaa361f143ee4a0894bd168fd9b30c66/qf4ccf8f5435d4a78bdca4d6a018b578e/aabbabbbb.aaaaab Ljava/util/Set;
      // c7: aload 1
      // c8: invokevirtual net/minecraft/class_3675$class_306.method_1444 ()I
      // cb: invokestatic java/lang/Integer.valueOf (I)Ljava/lang/Integer;
      // ce: invokeinterface java/util/Set.contains (Ljava/lang/Object;)Z 2
      // d3: ireturn
   }

   public static void abbbbba(Object param0) {
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
      // 05: ifnonnull 0a
      // 08: return
      // 09: athrow
      // 0a: getstatic qeaa361f143ee4a0894bd168fd9b30c66/qf4ccf8f5435d4a78bdca4d6a018b578e/aabbabbbb.baab Lqeaa361f143ee4a0894bd168fd9b30c66/qf4ccf8f5435d4a78bdca4d6a018b578e/bbaaba;
      // 0d: astore 2
      // 0e: aload 2
      // 0f: iload 1
      // 10: ifne 40
      // 13: ifnull 3d
      // 16: goto 1a
      // 19: athrow
      // 1a: aload 2
      // 1b: invokevirtual qeaa361f143ee4a0894bd168fd9b30c66/qf4ccf8f5435d4a78bdca4d6a018b578e/bbaaba.aa ()Lqeaa361f143ee4a0894bd168fd9b30c66/qf4ccf8f5435d4a78bdca4d6a018b578e/abaabbba;
      // 1e: invokevirtual qeaa361f143ee4a0894bd168fd9b30c66/qf4ccf8f5435d4a78bdca4d6a018b578e/abaabbba.a ()Ljava/lang/Object;
      // 21: iload 1
      // 22: ifne 40
      // 25: goto 29
      // 28: athrow
      // 29: aload 0
      // 2a: if_acmpne 3d
      // 2d: goto 31
      // 30: athrow
      // 31: aconst_null
      // 32: putstatic qeaa361f143ee4a0894bd168fd9b30c66/qf4ccf8f5435d4a78bdca4d6a018b578e/aabbabbbb.baab Lqeaa361f143ee4a0894bd168fd9b30c66/qf4ccf8f5435d4a78bdca4d6a018b578e/bbaaba;
      // 35: bipush 0
      // 36: putstatic qeaa361f143ee4a0894bd168fd9b30c66/qf4ccf8f5435d4a78bdca4d6a018b578e/aabbabbbb.aabaa Z
      // 39: goto 3d
      // 3c: athrow
      // 3d: getstatic qeaa361f143ee4a0894bd168fd9b30c66/qf4ccf8f5435d4a78bdca4d6a018b578e/aabbabbbb.ababa Ljava/lang/Object;
      // 40: aload 0
      // 41: if_acmpne 4c
      // 44: aconst_null
      // 45: putstatic qeaa361f143ee4a0894bd168fd9b30c66/qf4ccf8f5435d4a78bdca4d6a018b578e/aabbabbbb.ababa Ljava/lang/Object;
      // 48: goto 4c
      // 4b: athrow
      // 4c: getstatic qeaa361f143ee4a0894bd168fd9b30c66/qf4ccf8f5435d4a78bdca4d6a018b578e/aabbabbbb.aba Lqeaa361f143ee4a0894bd168fd9b30c66/qf4ccf8f5435d4a78bdca4d6a018b578e/abaaabaa;
      // 4f: aload 0
      // 50: invokevirtual qeaa361f143ee4a0894bd168fd9b30c66/qf4ccf8f5435d4a78bdca4d6a018b578e/abaaabaa.aab (Ljava/lang/Object;)Z
      // 53: pop
      // 54: return
   }

   public static class_306 abbbbbb(class_11908 param0) {
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
      // 06: ifne 16
      // 09: ifnonnull 15
      // 0c: goto 10
      // 0f: athrow
      // 10: getstatic net/minecraft/class_3675.field_16237 Lnet/minecraft/class_3675$class_306;
      // 13: areturn
      // 14: athrow
      // 15: aload 0
      // 16: iload 1
      // 17: ifne 2a
      // 1a: invokevirtual net/minecraft/class_11908.comp_4795 ()I
      // 1d: bipush -1
      // 1e: if_icmpne 42
      // 21: goto 25
      // 24: athrow
      // 25: aload 0
      // 26: goto 2a
      // 29: athrow
      // 2a: invokevirtual net/minecraft/class_11908.comp_4796 ()I
      // 2d: ifne 37
      // 30: getstatic net/minecraft/class_3675.field_16237 Lnet/minecraft/class_3675$class_306;
      // 33: goto 41
      // 36: athrow
      // 37: getstatic net/minecraft/class_3675$class_307.field_1671 Lnet/minecraft/class_3675$class_307;
      // 3a: aload 0
      // 3b: invokevirtual net/minecraft/class_11908.comp_4796 ()I
      // 3e: invokevirtual net/minecraft/class_3675$class_307.method_1447 (I)Lnet/minecraft/class_3675$class_306;
      // 41: areturn
      // 42: getstatic net/minecraft/class_3675$class_307.field_1668 Lnet/minecraft/class_3675$class_307;
      // 45: aload 0
      // 46: invokevirtual net/minecraft/class_11908.comp_4795 ()I
      // 49: invokevirtual net/minecraft/class_3675$class_307.method_1447 (I)Lnet/minecraft/class_3675$class_306;
      // 4c: areturn
   }

   public static boolean baaaaaa(class_310 var0, int var1) {
      bbbbaaaa var2 = ababab(var0, var1, 0, true);
      return bbabb(var0, var2);
   }

   public static class_306 baaaaab(int var0) {
      try {
         if (var0 < 0) {
            return class_3675.field_16237;
         }
      } catch (MatchException var1) {
         throw var1;
      }

      return class_307.field_1672.method_1447(var0);
   }

   private static void baaaaba(class_310 param0) {
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
      // 06: ifne 11
      // 09: ifnull 33
      // 0c: goto 10
      // 0f: athrow
      // 10: aload 0
      // 11: iload 1
      // 12: ifne 2a
      // 15: getfield net/minecraft/class_310.field_1724 Lnet/minecraft/class_746;
      // 18: ifnull 33
      // 1b: goto 1f
      // 1e: athrow
      // 1f: getstatic qeaa361f143ee4a0894bd168fd9b30c66/qf4ccf8f5435d4a78bdca4d6a018b578e/aabbabbbb.babab J
      // 22: putstatic qeaa361f143ee4a0894bd168fd9b30c66/qf4ccf8f5435d4a78bdca4d6a018b578e/aabbabbbb.abbab J
      // 25: aload 0
      // 26: goto 2a
      // 29: athrow
      // 2a: getfield net/minecraft/class_310.field_1724 Lnet/minecraft/class_746;
      // 2d: invokestatic java/lang/System.identityHashCode (Ljava/lang/Object;)I
      // 30: putstatic qeaa361f143ee4a0894bd168fd9b30c66/qf4ccf8f5435d4a78bdca4d6a018b578e/aabbabbbb.aabaaa I
      // 33: return
   }

   public static bbbbaaaa baaaabb(class_310 var0, int var1) {
      return ababab(var0, var1, 0, true);
   }

   public static void baaabaa(class_744 param0, float param1, float param2) {
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
      // 004: aload 0
      // 005: ifnonnull 00a
      // 008: return
      // 009: athrow
      // 00a: fload 1
      // 00b: fstore 4
      // 00d: fload 2
      // 00e: fstore 5
      // 010: fload 4
      // 012: fload 4
      // 014: fmul
      // 015: fload 5
      // 017: fload 5
      // 019: fmul
      // 01a: fadd
      // 01b: fstore 6
      // 01d: fload 6
      // 01f: iload 3
      // 020: ifne 039
      // 023: ldc_w 1.0001
      // 026: fcmpl
      // 027: ifle 049
      // 02a: goto 02e
      // 02d: athrow
      // 02e: fload 6
      // 030: f2d
      // 031: invokestatic java/lang/Math.sqrt (D)D
      // 034: d2f
      // 035: goto 039
      // 038: athrow
      // 039: fstore 7
      // 03b: fload 4
      // 03d: fload 7
      // 03f: fdiv
      // 040: fstore 4
      // 042: fload 5
      // 044: fload 7
      // 046: fdiv
      // 047: fstore 5
      // 049: new net/minecraft/class_241
      // 04c: dup
      // 04d: fload 5
      // 04f: fload 4
      // 051: invokespecial net/minecraft/class_241.<init> (FF)V
      // 054: astore 7
      // 056: aload 0
      // 057: invokestatic qeaa361f143ee4a0894bd168fd9b30c66/qf4ccf8f5435d4a78bdca4d6a018b578e/aabbabbbb.bbabbbb (Lnet/minecraft/class_744;)Ljava/lang/reflect/Field;
      // 05a: astore 8
      // 05c: aload 8
      // 05e: iload 3
      // 05f: ifne 080
      // 062: ifnull 079
      // 065: goto 069
      // 068: athrow
      // 069: aload 8
      // 06b: aload 0
      // 06c: aload 7
      // 06e: invokevirtual java/lang/reflect/Field.set (Ljava/lang/Object;Ljava/lang/Object;)V
      // 071: iload 3
      // 072: ifeq 0d0
      // 075: goto 079
      // 078: athrow
      // 079: getstatic qeaa361f143ee4a0894bd168fd9b30c66/qf4ccf8f5435d4a78bdca4d6a018b578e/aabbabbbb.aaabab Ljava/lang/reflect/Field;
      // 07c: goto 080
      // 07f: athrow
      // 080: iload 3
      // 081: ifne 0bc
      // 084: ifnull 0b5
      // 087: goto 08b
      // 08a: athrow
      // 08b: getstatic qeaa361f143ee4a0894bd168fd9b30c66/qf4ccf8f5435d4a78bdca4d6a018b578e/aabbabbbb.bbbab Ljava/lang/reflect/Field;
      // 08e: iload 3
      // 08f: ifne 0bc
      // 092: goto 096
      // 095: athrow
      // 096: ifnull 0b5
      // 099: goto 09d
      // 09c: athrow
      // 09d: getstatic qeaa361f143ee4a0894bd168fd9b30c66/qf4ccf8f5435d4a78bdca4d6a018b578e/aabbabbbb.aaabab Ljava/lang/reflect/Field;
      // 0a0: aload 0
      // 0a1: fload 1
      // 0a2: invokevirtual java/lang/reflect/Field.setFloat (Ljava/lang/Object;F)V
      // 0a5: iload 3
      // 0a6: getstatic qeaa361f143ee4a0894bd168fd9b30c66/qf4ccf8f5435d4a78bdca4d6a018b578e/aabbabbbb.bbbab Ljava/lang/reflect/Field;
      // 0a9: aload 0
      // 0aa: fload 2
      // 0ab: invokevirtual java/lang/reflect/Field.setFloat (Ljava/lang/Object;F)V
      // 0ae: ifeq 0d0
      // 0b1: goto 0b5
      // 0b4: athrow
      // 0b5: getstatic qeaa361f143ee4a0894bd168fd9b30c66/qf4ccf8f5435d4a78bdca4d6a018b578e/aabbabbbb.baa Ljava/lang/reflect/Field;
      // 0b8: goto 0bc
      // 0bb: athrow
      // 0bc: iload 3
      // 0bd: ifne 0ca
      // 0c0: ifnull 0d0
      // 0c3: goto 0c7
      // 0c6: athrow
      // 0c7: getstatic qeaa361f143ee4a0894bd168fd9b30c66/qf4ccf8f5435d4a78bdca4d6a018b578e/aabbabbbb.baa Ljava/lang/reflect/Field;
      // 0ca: aload 0
      // 0cb: aload 7
      // 0cd: invokevirtual java/lang/reflect/Field.set (Ljava/lang/Object;Ljava/lang/Object;)V
      // 0d0: goto 0d5
      // 0d3: astore 8
      // 0d5: aload 0
      // 0d6: getfield net/minecraft/class_744.field_54155 Lnet/minecraft/class_10185;
      // 0d9: ifnull 181
      // 0dc: fload 1
      // 0dd: fconst_0
      // 0de: fcmpl
      // 0df: iload 3
      // 0e0: ifne 0ef
      // 0e3: goto 0e7
      // 0e6: athrow
      // 0e7: ifle 0f2
      // 0ea: goto 0ee
      // 0ed: athrow
      // 0ee: bipush 1
      // 0ef: goto 0f3
      // 0f2: bipush 0
      // 0f3: istore 8
      // 0f5: fload 1
      // 0f6: fconst_0
      // 0f7: fcmpg
      // 0f8: iload 3
      // 0f9: ifne 104
      // 0fc: ifge 107
      // 0ff: goto 103
      // 102: athrow
      // 103: bipush 1
      // 104: goto 108
      // 107: bipush 0
      // 108: istore 9
      // 10a: fload 2
      // 10b: fconst_0
      // 10c: fcmpl
      // 10d: iload 3
      // 10e: ifne 119
      // 111: ifle 11c
      // 114: goto 118
      // 117: athrow
      // 118: bipush 1
      // 119: goto 11d
      // 11c: bipush 0
      // 11d: istore 10
      // 11f: fload 2
      // 120: fconst_0
      // 121: fcmpg
      // 122: iload 3
      // 123: ifne 12e
      // 126: ifge 131
      // 129: goto 12d
      // 12c: athrow
      // 12d: bipush 1
      // 12e: goto 132
      // 131: bipush 0
      // 132: istore 11
      // 134: iload 8
      // 136: iload 3
      // 137: ifne 14c
      // 13a: ifeq 15b
      // 13d: goto 141
      // 140: athrow
      // 141: aload 0
      // 142: getfield net/minecraft/class_744.field_54155 Lnet/minecraft/class_10185;
      // 145: invokevirtual net/minecraft/class_10185.comp_3165 ()Z
      // 148: goto 14c
      // 14b: athrow
      // 14c: iload 3
      // 14d: ifne 158
      // 150: ifeq 15b
      // 153: goto 157
      // 156: athrow
      // 157: bipush 1
      // 158: goto 15c
      // 15b: bipush 0
      // 15c: istore 12
      // 15e: aload 0
      // 15f: new net/minecraft/class_10185
      // 162: dup
      // 163: iload 8
      // 165: iload 9
      // 167: iload 10
      // 169: iload 11
      // 16b: aload 0
      // 16c: getfield net/minecraft/class_744.field_54155 Lnet/minecraft/class_10185;
      // 16f: invokevirtual net/minecraft/class_10185.comp_3163 ()Z
      // 172: aload 0
      // 173: getfield net/minecraft/class_744.field_54155 Lnet/minecraft/class_10185;
      // 176: invokevirtual net/minecraft/class_10185.comp_3164 ()Z
      // 179: iload 12
      // 17b: invokespecial net/minecraft/class_10185.<init> (ZZZZZZZ)V
      // 17e: putfield net/minecraft/class_744.field_54155 Lnet/minecraft/class_10185;
      // 181: return
   }

   public static void baaabab(class_2596 param0) {
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
      // 06: ifne 18
      // 09: instanceof net/minecraft/class_2868
      // 0c: ifeq 23
      // 0f: goto 13
      // 12: athrow
      // 13: aload 0
      // 14: goto 18
      // 17: athrow
      // 18: checkcast net/minecraft/class_2868
      // 1b: astore 2
      // 1c: aload 2
      // 1d: invokevirtual net/minecraft/class_2868.method_12442 ()I
      // 20: invokestatic qeaa361f143ee4a0894bd168fd9b30c66/qf4ccf8f5435d4a78bdca4d6a018b578e/bbbbbbba.aba (I)V
      // 23: return
   }

   public static int baaabba(class_1799 param0, class_638 param1) {
      // $VF: Couldn't be decompiled
      // Please report this to the Vineflower issue tracker, at https://github.com/Vineflower/vineflower/issues with a copy of the class file (if you have the rights to distribute it!)
      // java.lang.RuntimeException: parsing failure!
      //   at org.jetbrains.java.decompiler.modules.decompiler.decompose.DomHelper.parseGraph(DomHelper.java:211)
      //   at org.jetbrains.java.decompiler.main.rels.MethodProcessor.codeToJava(MethodProcessor.java:166)
      //
      // Bytecode:
      // 000: ldc_w -139530489
      // 003: istore 5
      // 005: getstatic qeaa361f143ee4a0894bd168fd9b30c66/qf4ccf8f5435d4a78bdca4d6a018b578e/baaabbaa.bba I
      // 008: istore 2
      // 009: aload 0
      // 00a: iload 2
      // 00b: ifne 01d
      // 00e: aload 1
      // 00f: invokestatic qeaa361f143ee4a0894bd168fd9b30c66/qf4ccf8f5435d4a78bdca4d6a018b578e/aabbabbbb.abaabab (Lnet/minecraft/class_1799;Lnet/minecraft/class_638;)Z
      // 012: ifne 01c
      // 015: goto 019
      // 018: athrow
      // 019: bipush -1
      // 01a: ireturn
      // 01b: athrow
      // 01c: aload 0
      // 01d: invokevirtual net/minecraft/class_1799.method_7909 ()Lnet/minecraft/class_1792;
      // 020: checkcast net/minecraft/class_1747
      // 023: invokevirtual net/minecraft/class_1747.method_7711 ()Lnet/minecraft/class_2248;
      // 026: astore 3
      // 027: aload 3
      // 028: invokevirtual net/minecraft/class_2248.method_9564 ()Lnet/minecraft/class_2680;
      // 02b: astore 4
      // 02d: aload 3
      // 02e: invokestatic qeaa361f143ee4a0894bd168fd9b30c66/qf4ccf8f5435d4a78bdca4d6a018b578e/aabbabbbb.bbaab (Lnet/minecraft/class_2248;)Z
      // 031: iload 2
      // 032: ifne 07f
      // 035: ifeq 077
      // 038: goto 03c
      // 03b: athrow
      // 03c: aload 3
      // 03d: instanceof net/minecraft/class_2482
      // 040: iload 2
      // 041: ifne 061
      // 044: goto 048
      // 047: athrow
      // 048: ifeq 064
      // 04b: goto 04f
      // 04e: athrow
      // 04f: ldc_w 604047129
      // 052: iload 5
      // 054: ldc_w 1111801769
      // 057: ixor
      // 058: invokestatic qeaa361f143ee4a0894bd168fd9b30c66/qf4ccf8f5435d4a78bdca4d6a018b578e/aabbabbbb.b (II)I
      // 05b: ldc2_w 4283178762248888921
      // 05e: invokestatic qeaa361f143ee4a0894bd168fd9b30c66/qf4ccf8f5435d4a78bdca4d6a018b578e/aabbabbbb.aaaaa (IJ)I
      // 061: goto 076
      // 064: ldc_w 604047128
      // 067: iload 5
      // 069: ldc_w 771607260
      // 06c: ixor
      // 06d: invokestatic qeaa361f143ee4a0894bd168fd9b30c66/qf4ccf8f5435d4a78bdca4d6a018b578e/aabbabbbb.b (II)I
      // 070: ldc2_w 8305456726380486339
      // 073: invokestatic qeaa361f143ee4a0894bd168fd9b30c66/qf4ccf8f5435d4a78bdca4d6a018b578e/aabbabbbb.aaaaa (IJ)I
      // 076: ireturn
      // 077: aload 4
      // 079: getstatic net/minecraft/class_2246.field_10540 Lnet/minecraft/class_2248;
      // 07c: invokevirtual net/minecraft/class_2680.method_27852 (Lnet/minecraft/class_2248;)Z
      // 07f: iload 2
      // 080: ifne 0e5
      // 083: ifne 0cf
      // 086: goto 08a
      // 089: athrow
      // 08a: aload 4
      // 08c: getstatic net/minecraft/class_2246.field_22423 Lnet/minecraft/class_2248;
      // 08f: invokevirtual net/minecraft/class_2680.method_27852 (Lnet/minecraft/class_2248;)Z
      // 092: iload 2
      // 093: ifne 0e5
      // 096: goto 09a
      // 099: athrow
      // 09a: ifne 0cf
      // 09d: goto 0a1
      // 0a0: athrow
      // 0a1: aload 4
      // 0a3: getstatic net/minecraft/class_2246.field_22109 Lnet/minecraft/class_2248;
      // 0a6: invokevirtual net/minecraft/class_2680.method_27852 (Lnet/minecraft/class_2248;)Z
      // 0a9: iload 2
      // 0aa: ifne 0e5
      // 0ad: goto 0b1
      // 0b0: athrow
      // 0b1: ifne 0cf
      // 0b4: goto 0b8
      // 0b7: athrow
      // 0b8: aload 4
      // 0ba: iload 2
      // 0bb: ifne 0e8
      // 0be: goto 0c2
      // 0c1: athrow
      // 0c2: getstatic net/minecraft/class_2246.field_22108 Lnet/minecraft/class_2248;
      // 0c5: invokevirtual net/minecraft/class_2680.method_27852 (Lnet/minecraft/class_2248;)Z
      // 0c8: ifeq 0e6
      // 0cb: goto 0cf
      // 0ce: athrow
      // 0cf: ldc_w 604047131
      // 0d2: iload 5
      // 0d4: ldc_w 85745388
      // 0d7: ixor
      // 0d8: invokestatic qeaa361f143ee4a0894bd168fd9b30c66/qf4ccf8f5435d4a78bdca4d6a018b578e/aabbabbbb.b (II)I
      // 0db: ldc2_w 1890789207413837495
      // 0de: invokestatic qeaa361f143ee4a0894bd168fd9b30c66/qf4ccf8f5435d4a78bdca4d6a018b578e/aabbabbbb.aaaaa (IJ)I
      // 0e1: goto 0e5
      // 0e4: athrow
      // 0e5: ireturn
      // 0e6: aload 4
      // 0e8: getstatic net/minecraft/class_2246.field_10471 Lnet/minecraft/class_2248;
      // 0eb: invokevirtual net/minecraft/class_2680.method_27852 (Lnet/minecraft/class_2248;)Z
      // 0ee: iload 2
      // 0ef: ifne 126
      // 0f2: ifne 110
      // 0f5: goto 0f9
      // 0f8: athrow
      // 0f9: aload 4
      // 0fb: iload 2
      // 0fc: ifne 129
      // 0ff: goto 103
      // 102: athrow
      // 103: getstatic net/minecraft/class_2246.field_10462 Lnet/minecraft/class_2248;
      // 106: invokevirtual net/minecraft/class_2680.method_27852 (Lnet/minecraft/class_2248;)Z
      // 109: ifeq 127
      // 10c: goto 110
      // 10f: athrow
      // 110: ldc_w 604047130
      // 113: iload 5
      // 115: ldc_w 1950566797
      // 118: ixor
      // 119: invokestatic qeaa361f143ee4a0894bd168fd9b30c66/qf4ccf8f5435d4a78bdca4d6a018b578e/aabbabbbb.b (II)I
      // 11c: ldc2_w 1198699760836462074
      // 11f: invokestatic qeaa361f143ee4a0894bd168fd9b30c66/qf4ccf8f5435d4a78bdca4d6a018b578e/aabbabbbb.aaaaa (IJ)I
      // 122: goto 126
      // 125: athrow
      // 126: ireturn
      // 127: aload 4
      // 129: getstatic net/minecraft/class_2246.field_10445 Lnet/minecraft/class_2248;
      // 12c: invokevirtual net/minecraft/class_2680.method_27852 (Lnet/minecraft/class_2248;)Z
      // 12f: iload 2
      // 130: ifne 2d7
      // 133: ifne 2c1
      // 136: goto 13a
      // 139: athrow
      // 13a: aload 4
      // 13c: getstatic net/minecraft/class_2246.field_29031 Lnet/minecraft/class_2248;
      // 13f: invokevirtual net/minecraft/class_2680.method_27852 (Lnet/minecraft/class_2248;)Z
      // 142: iload 2
      // 143: ifne 2d7
      // 146: goto 14a
      // 149: athrow
      // 14a: ifne 2c1
      // 14d: goto 151
      // 150: athrow
      // 151: aload 4
      // 153: getstatic net/minecraft/class_2246.field_28888 Lnet/minecraft/class_2248;
      // 156: invokevirtual net/minecraft/class_2680.method_27852 (Lnet/minecraft/class_2248;)Z
      // 159: iload 2
      // 15a: ifne 2d7
      // 15d: goto 161
      // 160: athrow
      // 161: ifne 2c1
      // 164: goto 168
      // 167: athrow
      // 168: aload 4
      // 16a: getstatic net/minecraft/class_2246.field_10340 Lnet/minecraft/class_2248;
      // 16d: invokevirtual net/minecraft/class_2680.method_27852 (Lnet/minecraft/class_2248;)Z
      // 170: iload 2
      // 171: ifne 2d7
      // 174: goto 178
      // 177: athrow
      // 178: ifne 2c1
      // 17b: goto 17f
      // 17e: athrow
      // 17f: aload 4
      // 181: getstatic net/minecraft/class_2246.field_10056 Lnet/minecraft/class_2248;
      // 184: invokevirtual net/minecraft/class_2680.method_27852 (Lnet/minecraft/class_2248;)Z
      // 187: iload 2
      // 188: ifne 2d7
      // 18b: goto 18f
      // 18e: athrow
      // 18f: ifne 2c1
      // 192: goto 196
      // 195: athrow
      // 196: aload 4
      // 198: getstatic net/minecraft/class_2246.field_23869 Lnet/minecraft/class_2248;
      // 19b: invokevirtual net/minecraft/class_2680.method_27852 (Lnet/minecraft/class_2248;)Z
      // 19e: iload 2
      // 19f: ifne 2d7
      // 1a2: goto 1a6
      // 1a5: athrow
      // 1a6: ifne 2c1
      // 1a9: goto 1ad
      // 1ac: athrow
      // 1ad: aload 4
      // 1af: getstatic net/minecraft/class_2246.field_23873 Lnet/minecraft/class_2248;
      // 1b2: invokevirtual net/minecraft/class_2680.method_27852 (Lnet/minecraft/class_2248;)Z
      // 1b5: iload 2
      // 1b6: ifne 2d7
      // 1b9: goto 1bd
      // 1bc: athrow
      // 1bd: ifne 2c1
      // 1c0: goto 1c4
      // 1c3: athrow
      // 1c4: aload 4
      // 1c6: getstatic net/minecraft/class_2246.field_23874 Lnet/minecraft/class_2248;
      // 1c9: invokevirtual net/minecraft/class_2680.method_27852 (Lnet/minecraft/class_2248;)Z
      // 1cc: iload 2
      // 1cd: ifne 2d7
      // 1d0: goto 1d4
      // 1d3: athrow
      // 1d4: ifne 2c1
      // 1d7: goto 1db
      // 1da: athrow
      // 1db: aload 4
      // 1dd: getstatic net/minecraft/class_2246.field_10266 Lnet/minecraft/class_2248;
      // 1e0: invokevirtual net/minecraft/class_2680.method_27852 (Lnet/minecraft/class_2248;)Z
      // 1e3: iload 2
      // 1e4: ifne 2d7
      // 1e7: goto 1eb
      // 1ea: athrow
      // 1eb: ifne 2c1
      // 1ee: goto 1f2
      // 1f1: athrow
      // 1f2: aload 4
      // 1f4: getstatic net/minecraft/class_2246.field_10104 Lnet/minecraft/class_2248;
      // 1f7: invokevirtual net/minecraft/class_2680.method_27852 (Lnet/minecraft/class_2248;)Z
      // 1fa: iload 2
      // 1fb: ifne 2d7
      // 1fe: goto 202
      // 201: athrow
      // 202: ifne 2c1
      // 205: goto 209
      // 208: athrow
      // 209: aload 4
      // 20b: getstatic net/minecraft/class_2246.field_37557 Lnet/minecraft/class_2248;
      // 20e: invokevirtual net/minecraft/class_2680.method_27852 (Lnet/minecraft/class_2248;)Z
      // 211: iload 2
      // 212: ifne 2d7
      // 215: goto 219
      // 218: athrow
      // 219: ifne 2c1
      // 21c: goto 220
      // 21f: athrow
      // 220: aload 4
      // 222: getstatic net/minecraft/class_2246.field_22091 Lnet/minecraft/class_2248;
      // 225: invokevirtual net/minecraft/class_2680.method_27852 (Lnet/minecraft/class_2248;)Z
      // 228: iload 2
      // 229: ifne 2d7
      // 22c: goto 230
      // 22f: athrow
      // 230: ifne 2c1
      // 233: goto 237
      // 236: athrow
      // 237: aload 4
      // 239: getstatic net/minecraft/class_2246.field_23151 Lnet/minecraft/class_2248;
      // 23c: invokevirtual net/minecraft/class_2680.method_27852 (Lnet/minecraft/class_2248;)Z
      // 23f: iload 2
      // 240: ifne 2d7
      // 243: goto 247
      // 246: athrow
      // 247: ifne 2c1
      // 24a: goto 24e
      // 24d: athrow
      // 24e: aload 4
      // 250: getstatic net/minecraft/class_2246.field_10085 Lnet/minecraft/class_2248;
      // 253: invokevirtual net/minecraft/class_2680.method_27852 (Lnet/minecraft/class_2248;)Z
      // 256: iload 2
      // 257: ifne 2d7
      // 25a: goto 25e
      // 25d: athrow
      // 25e: ifne 2c1
      // 261: goto 265
      // 264: athrow
      // 265: aload 4
      // 267: getstatic net/minecraft/class_2246.field_10205 Lnet/minecraft/class_2248;
      // 26a: invokevirtual net/minecraft/class_2680.method_27852 (Lnet/minecraft/class_2248;)Z
      // 26d: iload 2
      // 26e: ifne 2d7
      // 271: goto 275
      // 274: athrow
      // 275: ifne 2c1
      // 278: goto 27c
      // 27b: athrow
      // 27c: aload 4
      // 27e: getstatic net/minecraft/class_2246.field_10201 Lnet/minecraft/class_2248;
      // 281: invokevirtual net/minecraft/class_2680.method_27852 (Lnet/minecraft/class_2248;)Z
      // 284: iload 2
      // 285: ifne 2d7
      // 288: goto 28c
      // 28b: athrow
      // 28c: ifne 2c1
      // 28f: goto 293
      // 292: athrow
      // 293: aload 4
      // 295: getstatic net/minecraft/class_2246.field_10234 Lnet/minecraft/class_2248;
      // 298: invokevirtual net/minecraft/class_2680.method_27852 (Lnet/minecraft/class_2248;)Z
      // 29b: iload 2
      // 29c: ifne 2d7
      // 29f: goto 2a3
      // 2a2: athrow
      // 2a3: ifne 2c1
      // 2a6: goto 2aa
      // 2a9: athrow
      // 2aa: aload 4
      // 2ac: iload 2
      // 2ad: ifne 2da
      // 2b0: goto 2b4
      // 2b3: athrow
      // 2b4: getstatic net/minecraft/class_2246.field_27119 Lnet/minecraft/class_2248;
      // 2b7: invokevirtual net/minecraft/class_2680.method_27852 (Lnet/minecraft/class_2248;)Z
      // 2ba: ifeq 2d8
      // 2bd: goto 2c1
      // 2c0: athrow
      // 2c1: ldc_w 604047133
      // 2c4: iload 5
      // 2c6: ldc_w 1443267777
      // 2c9: ixor
      // 2ca: invokestatic qeaa361f143ee4a0894bd168fd9b30c66/qf4ccf8f5435d4a78bdca4d6a018b578e/aabbabbbb.b (II)I
      // 2cd: ldc2_w 4684396259303496803
      // 2d0: invokestatic qeaa361f143ee4a0894bd168fd9b30c66/qf4ccf8f5435d4a78bdca4d6a018b578e/aabbabbbb.aaaaa (IJ)I
      // 2d3: goto 2d7
      // 2d6: athrow
      // 2d7: ireturn
      // 2d8: aload 4
      // 2da: getstatic net/minecraft/class_2246.field_10415 Lnet/minecraft/class_2248;
      // 2dd: invokevirtual net/minecraft/class_2680.method_27852 (Lnet/minecraft/class_2248;)Z
      // 2e0: iload 2
      // 2e1: ifne 5e1
      // 2e4: ifne 5cb
      // 2e7: goto 2eb
      // 2ea: athrow
      // 2eb: aload 4
      // 2ed: getstatic net/minecraft/class_2246.field_10611 Lnet/minecraft/class_2248;
      // 2f0: invokevirtual net/minecraft/class_2680.method_27852 (Lnet/minecraft/class_2248;)Z
      // 2f3: iload 2
      // 2f4: ifne 5e1
      // 2f7: goto 2fb
      // 2fa: athrow
      // 2fb: ifne 5cb
      // 2fe: goto 302
      // 301: athrow
      // 302: aload 4
      // 304: getstatic net/minecraft/class_2246.field_10184 Lnet/minecraft/class_2248;
      // 307: invokevirtual net/minecraft/class_2680.method_27852 (Lnet/minecraft/class_2248;)Z
      // 30a: iload 2
      // 30b: ifne 5e1
      // 30e: goto 312
      // 311: athrow
      // 312: ifne 5cb
      // 315: goto 319
      // 318: athrow
      // 319: aload 4
      // 31b: getstatic net/minecraft/class_2246.field_10015 Lnet/minecraft/class_2248;
      // 31e: invokevirtual net/minecraft/class_2680.method_27852 (Lnet/minecraft/class_2248;)Z
      // 321: iload 2
      // 322: ifne 5e1
      // 325: goto 329
      // 328: athrow
      // 329: ifne 5cb
      // 32c: goto 330
      // 32f: athrow
      // 330: aload 4
      // 332: getstatic net/minecraft/class_2246.field_10325 Lnet/minecraft/class_2248;
      // 335: invokevirtual net/minecraft/class_2680.method_27852 (Lnet/minecraft/class_2248;)Z
      // 338: iload 2
      // 339: ifne 5e1
      // 33c: goto 340
      // 33f: athrow
      // 340: ifne 5cb
      // 343: goto 347
      // 346: athrow
      // 347: aload 4
      // 349: getstatic net/minecraft/class_2246.field_10143 Lnet/minecraft/class_2248;
      // 34c: invokevirtual net/minecraft/class_2680.method_27852 (Lnet/minecraft/class_2248;)Z
      // 34f: iload 2
      // 350: ifne 5e1
      // 353: goto 357
      // 356: athrow
      // 357: ifne 5cb
      // 35a: goto 35e
      // 35d: athrow
      // 35e: aload 4
      // 360: getstatic net/minecraft/class_2246.field_10014 Lnet/minecraft/class_2248;
      // 363: invokevirtual net/minecraft/class_2680.method_27852 (Lnet/minecraft/class_2248;)Z
      // 366: iload 2
      // 367: ifne 5e1
      // 36a: goto 36e
      // 36d: athrow
      // 36e: ifne 5cb
      // 371: goto 375
      // 374: athrow
      // 375: aload 4
      // 377: getstatic net/minecraft/class_2246.field_10444 Lnet/minecraft/class_2248;
      // 37a: invokevirtual net/minecraft/class_2680.method_27852 (Lnet/minecraft/class_2248;)Z
      // 37d: iload 2
      // 37e: ifne 5e1
      // 381: goto 385
      // 384: athrow
      // 385: ifne 5cb
      // 388: goto 38c
      // 38b: athrow
      // 38c: aload 4
      // 38e: getstatic net/minecraft/class_2246.field_10349 Lnet/minecraft/class_2248;
      // 391: invokevirtual net/minecraft/class_2680.method_27852 (Lnet/minecraft/class_2248;)Z
      // 394: iload 2
      // 395: ifne 5e1
      // 398: goto 39c
      // 39b: athrow
      // 39c: ifne 5cb
      // 39f: goto 3a3
      // 3a2: athrow
      // 3a3: aload 4
      // 3a5: getstatic net/minecraft/class_2246.field_10590 Lnet/minecraft/class_2248;
      // 3a8: invokevirtual net/minecraft/class_2680.method_27852 (Lnet/minecraft/class_2248;)Z
      // 3ab: iload 2
      // 3ac: ifne 5e1
      // 3af: goto 3b3
      // 3b2: athrow
      // 3b3: ifne 5cb
      // 3b6: goto 3ba
      // 3b9: athrow
      // 3ba: aload 4
      // 3bc: getstatic net/minecraft/class_2246.field_10235 Lnet/minecraft/class_2248;
      // 3bf: invokevirtual net/minecraft/class_2680.method_27852 (Lnet/minecraft/class_2248;)Z
      // 3c2: iload 2
      // 3c3: ifne 5e1
      // 3c6: goto 3ca
      // 3c9: athrow
      // 3ca: ifne 5cb
      // 3cd: goto 3d1
      // 3d0: athrow
      // 3d1: aload 4
      // 3d3: getstatic net/minecraft/class_2246.field_10570 Lnet/minecraft/class_2248;
      // 3d6: invokevirtual net/minecraft/class_2680.method_27852 (Lnet/minecraft/class_2248;)Z
      // 3d9: iload 2
      // 3da: ifne 5e1
      // 3dd: goto 3e1
      // 3e0: athrow
      // 3e1: ifne 5cb
      // 3e4: goto 3e8
      // 3e7: athrow
      // 3e8: aload 4
      // 3ea: getstatic net/minecraft/class_2246.field_10409 Lnet/minecraft/class_2248;
      // 3ed: invokevirtual net/minecraft/class_2680.method_27852 (Lnet/minecraft/class_2248;)Z
      // 3f0: iload 2
      // 3f1: ifne 5e1
      // 3f4: goto 3f8
      // 3f7: athrow
      // 3f8: ifne 5cb
      // 3fb: goto 3ff
      // 3fe: athrow
      // 3ff: aload 4
      // 401: getstatic net/minecraft/class_2246.field_10123 Lnet/minecraft/class_2248;
      // 404: invokevirtual net/minecraft/class_2680.method_27852 (Lnet/minecraft/class_2248;)Z
      // 407: iload 2
      // 408: ifne 5e1
      // 40b: goto 40f
      // 40e: athrow
      // 40f: ifne 5cb
      // 412: goto 416
      // 415: athrow
      // 416: aload 4
      // 418: getstatic net/minecraft/class_2246.field_10526 Lnet/minecraft/class_2248;
      // 41b: invokevirtual net/minecraft/class_2680.method_27852 (Lnet/minecraft/class_2248;)Z
      // 41e: iload 2
      // 41f: ifne 5e1
      // 422: goto 426
      // 425: athrow
      // 426: ifne 5cb
      // 429: goto 42d
      // 42c: athrow
      // 42d: aload 4
      // 42f: getstatic net/minecraft/class_2246.field_10328 Lnet/minecraft/class_2248;
      // 432: invokevirtual net/minecraft/class_2680.method_27852 (Lnet/minecraft/class_2248;)Z
      // 435: iload 2
      // 436: ifne 5e1
      // 439: goto 43d
      // 43c: athrow
      // 43d: ifne 5cb
      // 440: goto 444
      // 443: athrow
      // 444: aload 4
      // 446: getstatic net/minecraft/class_2246.field_10626 Lnet/minecraft/class_2248;
      // 449: invokevirtual net/minecraft/class_2680.method_27852 (Lnet/minecraft/class_2248;)Z
      // 44c: iload 2
      // 44d: ifne 5e1
      // 450: goto 454
      // 453: athrow
      // 454: ifne 5cb
      // 457: goto 45b
      // 45a: athrow
      // 45b: aload 4
      // 45d: getstatic net/minecraft/class_2246.field_10107 Lnet/minecraft/class_2248;
      // 460: invokevirtual net/minecraft/class_2680.method_27852 (Lnet/minecraft/class_2248;)Z
      // 463: iload 2
      // 464: ifne 5e1
      // 467: goto 46b
      // 46a: athrow
      // 46b: ifne 5cb
      // 46e: goto 472
      // 471: athrow
      // 472: aload 4
      // 474: getstatic net/minecraft/class_2246.field_10210 Lnet/minecraft/class_2248;
      // 477: invokevirtual net/minecraft/class_2680.method_27852 (Lnet/minecraft/class_2248;)Z
      // 47a: iload 2
      // 47b: ifne 5e1
      // 47e: goto 482
      // 481: athrow
      // 482: ifne 5cb
      // 485: goto 489
      // 488: athrow
      // 489: aload 4
      // 48b: getstatic net/minecraft/class_2246.field_10585 Lnet/minecraft/class_2248;
      // 48e: invokevirtual net/minecraft/class_2680.method_27852 (Lnet/minecraft/class_2248;)Z
      // 491: iload 2
      // 492: ifne 5e1
      // 495: goto 499
      // 498: athrow
      // 499: ifne 5cb
      // 49c: goto 4a0
      // 49f: athrow
      // 4a0: aload 4
      // 4a2: getstatic net/minecraft/class_2246.field_10242 Lnet/minecraft/class_2248;
      // 4a5: invokevirtual net/minecraft/class_2680.method_27852 (Lnet/minecraft/class_2248;)Z
      // 4a8: iload 2
      // 4a9: ifne 5e1
      // 4ac: goto 4b0
      // 4af: athrow
      // 4b0: ifne 5cb
      // 4b3: goto 4b7
      // 4b6: athrow
      // 4b7: aload 4
      // 4b9: getstatic net/minecraft/class_2246.field_10542 Lnet/minecraft/class_2248;
      // 4bc: invokevirtual net/minecraft/class_2680.method_27852 (Lnet/minecraft/class_2248;)Z
      // 4bf: iload 2
      // 4c0: ifne 5e1
      // 4c3: goto 4c7
      // 4c6: athrow
      // 4c7: ifne 5cb
      // 4ca: goto 4ce
      // 4cd: athrow
      // 4ce: aload 4
      // 4d0: getstatic net/minecraft/class_2246.field_10421 Lnet/minecraft/class_2248;
      // 4d3: invokevirtual net/minecraft/class_2680.method_27852 (Lnet/minecraft/class_2248;)Z
      // 4d6: iload 2
      // 4d7: ifne 5e1
      // 4da: goto 4de
      // 4dd: athrow
      // 4de: ifne 5cb
      // 4e1: goto 4e5
      // 4e4: athrow
      // 4e5: aload 4
      // 4e7: getstatic net/minecraft/class_2246.field_10434 Lnet/minecraft/class_2248;
      // 4ea: invokevirtual net/minecraft/class_2680.method_27852 (Lnet/minecraft/class_2248;)Z
      // 4ed: iload 2
      // 4ee: ifne 5e1
      // 4f1: goto 4f5
      // 4f4: athrow
      // 4f5: ifne 5cb
      // 4f8: goto 4fc
      // 4fb: athrow
      // 4fc: aload 4
      // 4fe: getstatic net/minecraft/class_2246.field_10038 Lnet/minecraft/class_2248;
      // 501: invokevirtual net/minecraft/class_2680.method_27852 (Lnet/minecraft/class_2248;)Z
      // 504: iload 2
      // 505: ifne 5e1
      // 508: goto 50c
      // 50b: athrow
      // 50c: ifne 5cb
      // 50f: goto 513
      // 512: athrow
      // 513: aload 4
      // 515: getstatic net/minecraft/class_2246.field_10172 Lnet/minecraft/class_2248;
      // 518: invokevirtual net/minecraft/class_2680.method_27852 (Lnet/minecraft/class_2248;)Z
      // 51b: iload 2
      // 51c: ifne 5e1
      // 51f: goto 523
      // 522: athrow
      // 523: ifne 5cb
      // 526: goto 52a
      // 529: athrow
      // 52a: aload 4
      // 52c: getstatic net/minecraft/class_2246.field_10308 Lnet/minecraft/class_2248;
      // 52f: invokevirtual net/minecraft/class_2680.method_27852 (Lnet/minecraft/class_2248;)Z
      // 532: iload 2
      // 533: ifne 5e1
      // 536: goto 53a
      // 539: athrow
      // 53a: ifne 5cb
      // 53d: goto 541
      // 540: athrow
      // 541: aload 4
      // 543: getstatic net/minecraft/class_2246.field_10206 Lnet/minecraft/class_2248;
      // 546: invokevirtual net/minecraft/class_2680.method_27852 (Lnet/minecraft/class_2248;)Z
      // 549: iload 2
      // 54a: ifne 5e1
      // 54d: goto 551
      // 550: athrow
      // 551: ifne 5cb
      // 554: goto 558
      // 557: athrow
      // 558: aload 4
      // 55a: getstatic net/minecraft/class_2246.field_10011 Lnet/minecraft/class_2248;
      // 55d: invokevirtual net/minecraft/class_2680.method_27852 (Lnet/minecraft/class_2248;)Z
      // 560: iload 2
      // 561: ifne 5e1
      // 564: goto 568
      // 567: athrow
      // 568: ifne 5cb
      // 56b: goto 56f
      // 56e: athrow
      // 56f: aload 4
      // 571: getstatic net/minecraft/class_2246.field_10439 Lnet/minecraft/class_2248;
      // 574: invokevirtual net/minecraft/class_2680.method_27852 (Lnet/minecraft/class_2248;)Z
      // 577: iload 2
      // 578: ifne 5e1
      // 57b: goto 57f
      // 57e: athrow
      // 57f: ifne 5cb
      // 582: goto 586
      // 585: athrow
      // 586: aload 4
      // 588: getstatic net/minecraft/class_2246.field_10367 Lnet/minecraft/class_2248;
      // 58b: invokevirtual net/minecraft/class_2680.method_27852 (Lnet/minecraft/class_2248;)Z
      // 58e: iload 2
      // 58f: ifne 5e1
      // 592: goto 596
      // 595: athrow
      // 596: ifne 5cb
      // 599: goto 59d
      // 59c: athrow
      // 59d: aload 4
      // 59f: getstatic net/minecraft/class_2246.field_10058 Lnet/minecraft/class_2248;
      // 5a2: invokevirtual net/minecraft/class_2680.method_27852 (Lnet/minecraft/class_2248;)Z
      // 5a5: iload 2
      // 5a6: ifne 5e1
      // 5a9: goto 5ad
      // 5ac: athrow
      // 5ad: ifne 5cb
      // 5b0: goto 5b4
      // 5b3: athrow
      // 5b4: aload 4
      // 5b6: getstatic net/minecraft/class_2246.field_10458 Lnet/minecraft/class_2248;
      // 5b9: iload 2
      // 5ba: ifne 5e7
      // 5bd: goto 5c1
      // 5c0: athrow
      // 5c1: invokevirtual net/minecraft/class_2680.method_27852 (Lnet/minecraft/class_2248;)Z
      // 5c4: ifeq 5e2
      // 5c7: goto 5cb
      // 5ca: athrow
      // 5cb: ldc_w 604047132
      // 5ce: iload 5
      // 5d0: ldc_w -751807705
      // 5d3: ixor
      // 5d4: invokestatic qeaa361f143ee4a0894bd168fd9b30c66/qf4ccf8f5435d4a78bdca4d6a018b578e/aabbabbbb.b (II)I
      // 5d7: ldc2_w 1529752356704821419
      // 5da: invokestatic qeaa361f143ee4a0894bd168fd9b30c66/qf4ccf8f5435d4a78bdca4d6a018b578e/aabbabbbb.aaaaa (IJ)I
      // 5dd: goto 5e1
      // 5e0: athrow
      // 5e1: ireturn
      // 5e2: aload 4
      // 5e4: getstatic net/minecraft/class_2246.field_10161 Lnet/minecraft/class_2248;
      // 5e7: invokevirtual net/minecraft/class_2680.method_27852 (Lnet/minecraft/class_2248;)Z
      // 5ea: iload 2
      // 5eb: ifne 8bd
      // 5ee: ifne 8a7
      // 5f1: goto 5f5
      // 5f4: athrow
      // 5f5: aload 4
      // 5f7: getstatic net/minecraft/class_2246.field_9975 Lnet/minecraft/class_2248;
      // 5fa: invokevirtual net/minecraft/class_2680.method_27852 (Lnet/minecraft/class_2248;)Z
      // 5fd: iload 2
      // 5fe: ifne 8bd
      // 601: goto 605
      // 604: athrow
      // 605: ifne 8a7
      // 608: goto 60c
      // 60b: athrow
      // 60c: aload 4
      // 60e: getstatic net/minecraft/class_2246.field_10148 Lnet/minecraft/class_2248;
      // 611: invokevirtual net/minecraft/class_2680.method_27852 (Lnet/minecraft/class_2248;)Z
      // 614: iload 2
      // 615: ifne 8bd
      // 618: goto 61c
      // 61b: athrow
      // 61c: ifne 8a7
      // 61f: goto 623
      // 622: athrow
      // 623: aload 4
      // 625: getstatic net/minecraft/class_2246.field_10334 Lnet/minecraft/class_2248;
      // 628: invokevirtual net/minecraft/class_2680.method_27852 (Lnet/minecraft/class_2248;)Z
      // 62b: iload 2
      // 62c: ifne 8bd
      // 62f: goto 633
      // 632: athrow
      // 633: ifne 8a7
      // 636: goto 63a
      // 639: athrow
      // 63a: aload 4
      // 63c: getstatic net/minecraft/class_2246.field_10218 Lnet/minecraft/class_2248;
      // 63f: invokevirtual net/minecraft/class_2680.method_27852 (Lnet/minecraft/class_2248;)Z
      // 642: iload 2
      // 643: ifne 8bd
      // 646: goto 64a
      // 649: athrow
      // 64a: ifne 8a7
      // 64d: goto 651
      // 650: athrow
      // 651: aload 4
      // 653: getstatic net/minecraft/class_2246.field_42751 Lnet/minecraft/class_2248;
      // 656: invokevirtual net/minecraft/class_2680.method_27852 (Lnet/minecraft/class_2248;)Z
      // 659: iload 2
      // 65a: ifne 8bd
      // 65d: goto 661
      // 660: athrow
      // 661: ifne 8a7
      // 664: goto 668
      // 667: athrow
      // 668: aload 4
      // 66a: getstatic net/minecraft/class_2246.field_10075 Lnet/minecraft/class_2248;
      // 66d: invokevirtual net/minecraft/class_2680.method_27852 (Lnet/minecraft/class_2248;)Z
      // 670: iload 2
      // 671: ifne 8bd
      // 674: goto 678
      // 677: athrow
      // 678: ifne 8a7
      // 67b: goto 67f
      // 67e: athrow
      // 67f: aload 4
      // 681: getstatic net/minecraft/class_2246.field_37577 Lnet/minecraft/class_2248;
      // 684: invokevirtual net/minecraft/class_2680.method_27852 (Lnet/minecraft/class_2248;)Z
      // 687: iload 2
      // 688: ifne 8bd
      // 68b: goto 68f
      // 68e: athrow
      // 68f: ifne 8a7
      // 692: goto 696
      // 695: athrow
      // 696: aload 4
      // 698: getstatic net/minecraft/class_2246.field_40294 Lnet/minecraft/class_2248;
      // 69b: invokevirtual net/minecraft/class_2680.method_27852 (Lnet/minecraft/class_2248;)Z
      // 69e: iload 2
      // 69f: ifne 8bd
      // 6a2: goto 6a6
      // 6a5: athrow
      // 6a6: ifne 8a7
      // 6a9: goto 6ad
      // 6ac: athrow
      // 6ad: aload 4
      // 6af: getstatic net/minecraft/class_2246.field_22126 Lnet/minecraft/class_2248;
      // 6b2: invokevirtual net/minecraft/class_2680.method_27852 (Lnet/minecraft/class_2248;)Z
      // 6b5: iload 2
      // 6b6: ifne 8bd
      // 6b9: goto 6bd
      // 6bc: athrow
      // 6bd: ifne 8a7
      // 6c0: goto 6c4
      // 6c3: athrow
      // 6c4: aload 4
      // 6c6: getstatic net/minecraft/class_2246.field_22127 Lnet/minecraft/class_2248;
      // 6c9: invokevirtual net/minecraft/class_2680.method_27852 (Lnet/minecraft/class_2248;)Z
      // 6cc: iload 2
      // 6cd: ifne 8bd
      // 6d0: goto 6d4
      // 6d3: athrow
      // 6d4: ifne 8a7
      // 6d7: goto 6db
      // 6da: athrow
      // 6db: aload 4
      // 6dd: getstatic net/minecraft/class_2246.field_10431 Lnet/minecraft/class_2248;
      // 6e0: invokevirtual net/minecraft/class_2680.method_27852 (Lnet/minecraft/class_2248;)Z
      // 6e3: iload 2
      // 6e4: ifne 8bd
      // 6e7: goto 6eb
      // 6ea: athrow
      // 6eb: ifne 8a7
      // 6ee: goto 6f2
      // 6f1: athrow
      // 6f2: aload 4
      // 6f4: getstatic net/minecraft/class_2246.field_10037 Lnet/minecraft/class_2248;
      // 6f7: invokevirtual net/minecraft/class_2680.method_27852 (Lnet/minecraft/class_2248;)Z
      // 6fa: iload 2
      // 6fb: ifne 8bd
      // 6fe: goto 702
      // 701: athrow
      // 702: ifne 8a7
      // 705: goto 709
      // 708: athrow
      // 709: aload 4
      // 70b: getstatic net/minecraft/class_2246.field_10511 Lnet/minecraft/class_2248;
      // 70e: invokevirtual net/minecraft/class_2680.method_27852 (Lnet/minecraft/class_2248;)Z
      // 711: iload 2
      // 712: ifne 8bd
      // 715: goto 719
      // 718: athrow
      // 719: ifne 8a7
      // 71c: goto 720
      // 71f: athrow
      // 720: aload 4
      // 722: getstatic net/minecraft/class_2246.field_10306 Lnet/minecraft/class_2248;
      // 725: invokevirtual net/minecraft/class_2680.method_27852 (Lnet/minecraft/class_2248;)Z
      // 728: iload 2
      // 729: ifne 8bd
      // 72c: goto 730
      // 72f: athrow
      // 730: ifne 8a7
      // 733: goto 737
      // 736: athrow
      // 737: aload 4
      // 739: getstatic net/minecraft/class_2246.field_10533 Lnet/minecraft/class_2248;
      // 73c: invokevirtual net/minecraft/class_2680.method_27852 (Lnet/minecraft/class_2248;)Z
      // 73f: iload 2
      // 740: ifne 8bd
      // 743: goto 747
      // 746: athrow
      // 747: ifne 8a7
      // 74a: goto 74e
      // 74d: athrow
      // 74e: aload 4
      // 750: getstatic net/minecraft/class_2246.field_42729 Lnet/minecraft/class_2248;
      // 753: invokevirtual net/minecraft/class_2680.method_27852 (Lnet/minecraft/class_2248;)Z
      // 756: iload 2
      // 757: ifne 8bd
      // 75a: goto 75e
      // 75d: athrow
      // 75e: ifne 8a7
      // 761: goto 765
      // 764: athrow
      // 765: aload 4
      // 767: getstatic net/minecraft/class_2246.field_10010 Lnet/minecraft/class_2248;
      // 76a: invokevirtual net/minecraft/class_2680.method_27852 (Lnet/minecraft/class_2248;)Z
      // 76d: iload 2
      // 76e: ifne 8bd
      // 771: goto 775
      // 774: athrow
      // 775: ifne 8a7
      // 778: goto 77c
      // 77b: athrow
      // 77c: aload 4
      // 77e: getstatic net/minecraft/class_2246.field_37545 Lnet/minecraft/class_2248;
      // 781: invokevirtual net/minecraft/class_2680.method_27852 (Lnet/minecraft/class_2248;)Z
      // 784: iload 2
      // 785: ifne 8bd
      // 788: goto 78c
      // 78b: athrow
      // 78c: ifne 8a7
      // 78f: goto 793
      // 792: athrow
      // 793: aload 4
      // 795: getstatic net/minecraft/class_2246.field_22118 Lnet/minecraft/class_2248;
      // 798: invokevirtual net/minecraft/class_2680.method_27852 (Lnet/minecraft/class_2248;)Z
      // 79b: iload 2
      // 79c: ifne 8bd
      // 79f: goto 7a3
      // 7a2: athrow
      // 7a3: ifne 8a7
      // 7a6: goto 7aa
      // 7a9: athrow
      // 7aa: aload 4
      // 7ac: getstatic net/minecraft/class_2246.field_22111 Lnet/minecraft/class_2248;
      // 7af: invokevirtual net/minecraft/class_2680.method_27852 (Lnet/minecraft/class_2248;)Z
      // 7b2: iload 2
      // 7b3: ifne 8bd
      // 7b6: goto 7ba
      // 7b9: athrow
      // 7ba: ifne 8a7
      // 7bd: goto 7c1
      // 7c0: athrow
      // 7c1: aload 4
      // 7c3: getstatic net/minecraft/class_2246.field_10126 Lnet/minecraft/class_2248;
      // 7c6: invokevirtual net/minecraft/class_2680.method_27852 (Lnet/minecraft/class_2248;)Z
      // 7c9: iload 2
      // 7ca: ifne 8bd
      // 7cd: goto 7d1
      // 7d0: athrow
      // 7d1: ifne 8a7
      // 7d4: goto 7d8
      // 7d7: athrow
      // 7d8: aload 4
      // 7da: getstatic net/minecraft/class_2246.field_10155 Lnet/minecraft/class_2248;
      // 7dd: invokevirtual net/minecraft/class_2680.method_27852 (Lnet/minecraft/class_2248;)Z
      // 7e0: iload 2
      // 7e1: ifne 8bd
      // 7e4: goto 7e8
      // 7e7: athrow
      // 7e8: ifne 8a7
      // 7eb: goto 7ef
      // 7ee: athrow
      // 7ef: aload 4
      // 7f1: getstatic net/minecraft/class_2246.field_10307 Lnet/minecraft/class_2248;
      // 7f4: invokevirtual net/minecraft/class_2680.method_27852 (Lnet/minecraft/class_2248;)Z
      // 7f7: iload 2
      // 7f8: ifne 8bd
      // 7fb: goto 7ff
      // 7fe: athrow
      // 7ff: ifne 8a7
      // 802: goto 806
      // 805: athrow
      // 806: aload 4
      // 808: getstatic net/minecraft/class_2246.field_10303 Lnet/minecraft/class_2248;
      // 80b: invokevirtual net/minecraft/class_2680.method_27852 (Lnet/minecraft/class_2248;)Z
      // 80e: iload 2
      // 80f: ifne 8bd
      // 812: goto 816
      // 815: athrow
      // 816: ifne 8a7
      // 819: goto 81d
      // 81c: athrow
      // 81d: aload 4
      // 81f: getstatic net/minecraft/class_2246.field_9999 Lnet/minecraft/class_2248;
      // 822: invokevirtual net/minecraft/class_2680.method_27852 (Lnet/minecraft/class_2248;)Z
      // 825: iload 2
      // 826: ifne 8bd
      // 829: goto 82d
      // 82c: athrow
      // 82d: ifne 8a7
      // 830: goto 834
      // 833: athrow
      // 834: aload 4
      // 836: getstatic net/minecraft/class_2246.field_42733 Lnet/minecraft/class_2248;
      // 839: invokevirtual net/minecraft/class_2680.method_27852 (Lnet/minecraft/class_2248;)Z
      // 83c: iload 2
      // 83d: ifne 8bd
      // 840: goto 844
      // 843: athrow
      // 844: ifne 8a7
      // 847: goto 84b
      // 84a: athrow
      // 84b: aload 4
      // 84d: getstatic net/minecraft/class_2246.field_10178 Lnet/minecraft/class_2248;
      // 850: invokevirtual net/minecraft/class_2680.method_27852 (Lnet/minecraft/class_2248;)Z
      // 853: iload 2
      // 854: ifne 8bd
      // 857: goto 85b
      // 85a: athrow
      // 85b: ifne 8a7
      // 85e: goto 862
      // 861: athrow
      // 862: aload 4
      // 864: getstatic net/minecraft/class_2246.field_37549 Lnet/minecraft/class_2248;
      // 867: invokevirtual net/minecraft/class_2680.method_27852 (Lnet/minecraft/class_2248;)Z
      // 86a: iload 2
      // 86b: ifne 8bd
      // 86e: goto 872
      // 871: athrow
      // 872: ifne 8a7
      // 875: goto 879
      // 878: athrow
      // 879: aload 4
      // 87b: getstatic net/minecraft/class_2246.field_22505 Lnet/minecraft/class_2248;
      // 87e: invokevirtual net/minecraft/class_2680.method_27852 (Lnet/minecraft/class_2248;)Z
      // 881: iload 2
      // 882: ifne 8bd
      // 885: goto 889
      // 888: athrow
      // 889: ifne 8a7
      // 88c: goto 890
      // 88f: athrow
      // 890: aload 4
      // 892: iload 2
      // 893: ifne 8c0
      // 896: goto 89a
      // 899: athrow
      // 89a: getstatic net/minecraft/class_2246.field_22503 Lnet/minecraft/class_2248;
      // 89d: invokevirtual net/minecraft/class_2680.method_27852 (Lnet/minecraft/class_2248;)Z
      // 8a0: ifeq 8be
      // 8a3: goto 8a7
      // 8a6: athrow
      // 8a7: ldc_w 604047135
      // 8aa: iload 5
      // 8ac: ldc_w 1831064182
      // 8af: ixor
      // 8b0: invokestatic qeaa361f143ee4a0894bd168fd9b30c66/qf4ccf8f5435d4a78bdca4d6a018b578e/aabbabbbb.b (II)I
      // 8b3: ldc2_w 7536954144766650686
      // 8b6: invokestatic qeaa361f143ee4a0894bd168fd9b30c66/qf4ccf8f5435d4a78bdca4d6a018b578e/aabbabbbb.aaaaa (IJ)I
      // 8b9: goto 8bd
      // 8bc: athrow
      // 8bd: ireturn
      // 8be: aload 4
      // 8c0: getstatic net/minecraft/class_2246.field_10566 Lnet/minecraft/class_2248;
      // 8c3: invokevirtual net/minecraft/class_2680.method_27852 (Lnet/minecraft/class_2248;)Z
      // 8c6: iload 2
      // 8c7: ifne 956
      // 8ca: ifne 944
      // 8cd: goto 8d1
      // 8d0: athrow
      // 8d1: aload 4
      // 8d3: getstatic net/minecraft/class_2246.field_10253 Lnet/minecraft/class_2248;
      // 8d6: invokevirtual net/minecraft/class_2680.method_27852 (Lnet/minecraft/class_2248;)Z
      // 8d9: iload 2
      // 8da: ifne 956
      // 8dd: goto 8e1
      // 8e0: athrow
      // 8e1: ifne 944
      // 8e4: goto 8e8
      // 8e7: athrow
      // 8e8: aload 4
      // 8ea: getstatic net/minecraft/class_2246.field_28685 Lnet/minecraft/class_2248;
      // 8ed: invokevirtual net/minecraft/class_2680.method_27852 (Lnet/minecraft/class_2248;)Z
      // 8f0: iload 2
      // 8f1: ifne 956
      // 8f4: goto 8f8
      // 8f7: athrow
      // 8f8: ifne 944
      // 8fb: goto 8ff
      // 8fe: athrow
      // 8ff: aload 4
      // 901: getstatic net/minecraft/class_2246.field_37576 Lnet/minecraft/class_2248;
      // 904: invokevirtual net/minecraft/class_2680.method_27852 (Lnet/minecraft/class_2248;)Z
      // 907: iload 2
      // 908: ifne 956
      // 90b: goto 90f
      // 90e: athrow
      // 90f: ifne 944
      // 912: goto 916
      // 915: athrow
      // 916: aload 4
      // 918: getstatic net/minecraft/class_2246.field_10460 Lnet/minecraft/class_2248;
      // 91b: invokevirtual net/minecraft/class_2680.method_27852 (Lnet/minecraft/class_2248;)Z
      // 91e: iload 2
      // 91f: ifne 956
      // 922: goto 926
      // 925: athrow
      // 926: ifne 944
      // 929: goto 92d
      // 92c: athrow
      // 92d: aload 4
      // 92f: getstatic net/minecraft/class_2246.field_28681 Lnet/minecraft/class_2248;
      // 932: invokevirtual net/minecraft/class_2680.method_27852 (Lnet/minecraft/class_2248;)Z
      // 935: iload 2
      // 936: ifne 969
      // 939: goto 93d
      // 93c: athrow
      // 93d: ifeq 957
      // 940: goto 944
      // 943: athrow
      // 944: ldc_w 604047134
      // 947: iload 5
      // 949: ldc_w -1278120113
      // 94c: ixor
      // 94d: invokestatic qeaa361f143ee4a0894bd168fd9b30c66/qf4ccf8f5435d4a78bdca4d6a018b578e/aabbabbbb.b (II)I
      // 950: ldc2_w 5291572711810986307
      // 953: invokestatic qeaa361f143ee4a0894bd168fd9b30c66/qf4ccf8f5435d4a78bdca4d6a018b578e/aabbabbbb.aaaaa (IJ)I
      // 956: ireturn
      // 957: ldc_w 604047121
      // 95a: iload 5
      // 95c: ldc_w 1562740320
      // 95f: ixor
      // 960: invokestatic qeaa361f143ee4a0894bd168fd9b30c66/qf4ccf8f5435d4a78bdca4d6a018b578e/aabbabbbb.b (II)I
      // 963: ldc2_w 5678895025371821084
      // 966: invokestatic qeaa361f143ee4a0894bd168fd9b30c66/qf4ccf8f5435d4a78bdca4d6a018b578e/aabbabbbb.aaaaa (IJ)I
      // 969: ireturn
   }

   public static boolean baaabbb(class_310 param0, Object param1, int param2, BooleanSupplier param3) {
      // $VF: Couldn't be decompiled
      // Please report this to the Vineflower issue tracker, at https://github.com/Vineflower/vineflower/issues with a copy of the class file (if you have the rights to distribute it!)
      // java.lang.RuntimeException: parsing failure!
      //   at org.jetbrains.java.decompiler.modules.decompiler.decompose.DomHelper.parseGraph(DomHelper.java:211)
      //   at org.jetbrains.java.decompiler.main.rels.MethodProcessor.codeToJava(MethodProcessor.java:166)
      //
      // Bytecode:
      // 00: getstatic qeaa361f143ee4a0894bd168fd9b30c66/qf4ccf8f5435d4a78bdca4d6a018b578e/baaabbaa.bba I
      // 03: getstatic qeaa361f143ee4a0894bd168fd9b30c66/qf4ccf8f5435d4a78bdca4d6a018b578e/aabbabbbb.baaa I
      // 06: bipush 1
      // 07: iadd
      // 08: putstatic qeaa361f143ee4a0894bd168fd9b30c66/qf4ccf8f5435d4a78bdca4d6a018b578e/aabbabbbb.baaa I
      // 0b: istore 4
      // 0d: aload 0
      // 0e: aload 1
      // 0f: iload 2
      // 10: aload 3
      // 11: invokestatic qeaa361f143ee4a0894bd168fd9b30c66/qf4ccf8f5435d4a78bdca4d6a018b578e/aabbabbbb.abbbbaa (Lnet/minecraft/class_310;Ljava/lang/Object;ILjava/util/function/BooleanSupplier;)Z
      // 14: istore 5
      // 16: bipush 0
      // 17: getstatic qeaa361f143ee4a0894bd168fd9b30c66/qf4ccf8f5435d4a78bdca4d6a018b578e/aabbabbbb.baaa I
      // 1a: bipush 1
      // 1b: isub
      // 1c: invokestatic java/lang/Math.max (II)I
      // 1f: putstatic qeaa361f143ee4a0894bd168fd9b30c66/qf4ccf8f5435d4a78bdca4d6a018b578e/aabbabbbb.baaa I
      // 22: invokestatic qeaa361f143ee4a0894bd168fd9b30c66/qf4ccf8f5435d4a78bdca4d6a018b578e/abaaaaaba.aaaaa ()Lqeaa361f143ee4a0894bd168fd9b30c66/qf4ccf8f5435d4a78bdca4d6a018b578e/abaaaaaba;
      // 25: astore 6
      // 27: aload 6
      // 29: iload 4
      // 2b: ifne 37
      // 2e: ifnull 6d
      // 31: goto 35
      // 34: athrow
      // 35: aload 6
      // 37: iload 4
      // 39: ifne 4c
      // 3c: invokevirtual qeaa361f143ee4a0894bd168fd9b30c66/qf4ccf8f5435d4a78bdca4d6a018b578e/abaaaaaba.aaba ()Lqeaa361f143ee4a0894bd168fd9b30c66/qf4ccf8f5435d4a78bdca4d6a018b578e/babbaba;
      // 3f: ifnull 6d
      // 42: goto 46
      // 45: athrow
      // 46: aload 6
      // 48: goto 4c
      // 4b: athrow
      // 4c: iload 4
      // 4e: ifne 64
      // 51: invokevirtual qeaa361f143ee4a0894bd168fd9b30c66/qf4ccf8f5435d4a78bdca4d6a018b578e/abaaaaaba.aaba ()Lqeaa361f143ee4a0894bd168fd9b30c66/qf4ccf8f5435d4a78bdca4d6a018b578e/babbaba;
      // 54: invokevirtual qeaa361f143ee4a0894bd168fd9b30c66/qf4ccf8f5435d4a78bdca4d6a018b578e/babbaba.babba ()Lqeaa361f143ee4a0894bd168fd9b30c66/qf4ccf8f5435d4a78bdca4d6a018b578e/abbbabbaa;
      // 57: ifnull 6d
      // 5a: goto 5e
      // 5d: athrow
      // 5e: aload 6
      // 60: goto 64
      // 63: athrow
      // 64: invokevirtual qeaa361f143ee4a0894bd168fd9b30c66/qf4ccf8f5435d4a78bdca4d6a018b578e/abaaaaaba.aaba ()Lqeaa361f143ee4a0894bd168fd9b30c66/qf4ccf8f5435d4a78bdca4d6a018b578e/babbaba;
      // 67: invokevirtual qeaa361f143ee4a0894bd168fd9b30c66/qf4ccf8f5435d4a78bdca4d6a018b578e/babbaba.babba ()Lqeaa361f143ee4a0894bd168fd9b30c66/qf4ccf8f5435d4a78bdca4d6a018b578e/abbbabbaa;
      // 6a: invokevirtual qeaa361f143ee4a0894bd168fd9b30c66/qf4ccf8f5435d4a78bdca4d6a018b578e/abbbabbaa.aaa ()V
      // 6d: iload 5
      // 6f: ireturn
      // 70: astore 7
      // 72: bipush 0
      // 73: getstatic qeaa361f143ee4a0894bd168fd9b30c66/qf4ccf8f5435d4a78bdca4d6a018b578e/aabbabbbb.baaa I
      // 76: bipush 1
      // 77: isub
      // 78: invokestatic java/lang/Math.max (II)I
      // 7b: putstatic qeaa361f143ee4a0894bd168fd9b30c66/qf4ccf8f5435d4a78bdca4d6a018b578e/aabbabbbb.baaa I
      // 7e: invokestatic qeaa361f143ee4a0894bd168fd9b30c66/qf4ccf8f5435d4a78bdca4d6a018b578e/abaaaaaba.aaaaa ()Lqeaa361f143ee4a0894bd168fd9b30c66/qf4ccf8f5435d4a78bdca4d6a018b578e/abaaaaaba;
      // 81: astore 8
      // 83: aload 8
      // 85: iload 4
      // 87: ifne 93
      // 8a: ifnull c9
      // 8d: goto 91
      // 90: athrow
      // 91: aload 8
      // 93: iload 4
      // 95: ifne a8
      // 98: invokevirtual qeaa361f143ee4a0894bd168fd9b30c66/qf4ccf8f5435d4a78bdca4d6a018b578e/abaaaaaba.aaba ()Lqeaa361f143ee4a0894bd168fd9b30c66/qf4ccf8f5435d4a78bdca4d6a018b578e/babbaba;
      // 9b: ifnull c9
      // 9e: goto a2
      // a1: athrow
      // a2: aload 8
      // a4: goto a8
      // a7: athrow
      // a8: invokevirtual qeaa361f143ee4a0894bd168fd9b30c66/qf4ccf8f5435d4a78bdca4d6a018b578e/abaaaaaba.aaba ()Lqeaa361f143ee4a0894bd168fd9b30c66/qf4ccf8f5435d4a78bdca4d6a018b578e/babbaba;
      // ab: iload 4
      // ad: ifne c3
      // b0: invokevirtual qeaa361f143ee4a0894bd168fd9b30c66/qf4ccf8f5435d4a78bdca4d6a018b578e/babbaba.babba ()Lqeaa361f143ee4a0894bd168fd9b30c66/qf4ccf8f5435d4a78bdca4d6a018b578e/abbbabbaa;
      // b3: ifnull c9
      // b6: goto ba
      // b9: athrow
      // ba: aload 8
      // bc: invokevirtual qeaa361f143ee4a0894bd168fd9b30c66/qf4ccf8f5435d4a78bdca4d6a018b578e/abaaaaaba.aaba ()Lqeaa361f143ee4a0894bd168fd9b30c66/qf4ccf8f5435d4a78bdca4d6a018b578e/babbaba;
      // bf: goto c3
      // c2: athrow
      // c3: invokevirtual qeaa361f143ee4a0894bd168fd9b30c66/qf4ccf8f5435d4a78bdca4d6a018b578e/babbaba.babba ()Lqeaa361f143ee4a0894bd168fd9b30c66/qf4ccf8f5435d4a78bdca4d6a018b578e/abbbabbaa;
      // c6: invokevirtual qeaa361f143ee4a0894bd168fd9b30c66/qf4ccf8f5435d4a78bdca4d6a018b578e/abbbabbaa.aaa ()V
      // c9: aload 7
      // cb: athrow
   }

   public static boolean baabaaa(class_1297 param0) {
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
      // 06: ifne 11
      // 09: ifnull 1f
      // 0c: goto 10
      // 0f: athrow
      // 10: aload 0
      // 11: iload 1
      // 12: ifne 23
      // 15: invokevirtual net/minecraft/class_1297.method_73183 ()Lnet/minecraft/class_1937;
      // 18: ifnonnull 22
      // 1b: goto 1f
      // 1e: athrow
      // 1f: bipush 0
      // 20: ireturn
      // 21: athrow
      // 22: aload 0
      // 23: invokevirtual net/minecraft/class_1297.method_5829 ()Lnet/minecraft/class_238;
      // 26: astore 2
      // 27: aload 2
      // 28: getfield net/minecraft/class_238.field_1323 D
      // 2b: aload 2
      // 2c: getfield net/minecraft/class_238.field_1322 D
      // 2f: aload 2
      // 30: getfield net/minecraft/class_238.field_1321 D
      // 33: invokestatic net/minecraft/class_2338.method_49637 (DDD)Lnet/minecraft/class_2338;
      // 36: astore 3
      // 37: aload 2
      // 38: getfield net/minecraft/class_238.field_1320 D
      // 3b: ldc2_w 1.0E-7
      // 3e: dsub
      // 3f: aload 2
      // 40: getfield net/minecraft/class_238.field_1325 D
      // 43: ldc2_w 1.0E-7
      // 46: dsub
      // 47: aload 2
      // 48: getfield net/minecraft/class_238.field_1324 D
      // 4b: ldc2_w 1.0E-7
      // 4e: dsub
      // 4f: invokestatic net/minecraft/class_2338.method_49637 (DDD)Lnet/minecraft/class_2338;
      // 52: astore 4
      // 54: aload 3
      // 55: aload 4
      // 57: invokestatic net/minecraft/class_2338.method_10097 (Lnet/minecraft/class_2338;Lnet/minecraft/class_2338;)Ljava/lang/Iterable;
      // 5a: invokeinterface java/lang/Iterable.iterator ()Ljava/util/Iterator; 1
      // 5f: astore 5
      // 61: aload 5
      // 63: invokeinterface java/util/Iterator.hasNext ()Z 1
      // 68: ifeq 9f
      // 6b: aload 5
      // 6d: invokeinterface java/util/Iterator.next ()Ljava/lang/Object; 1
      // 72: checkcast net/minecraft/class_2338
      // 75: astore 6
      // 77: aload 0
      // 78: invokevirtual net/minecraft/class_1297.method_73183 ()Lnet/minecraft/class_1937;
      // 7b: aload 6
      // 7d: invokevirtual net/minecraft/class_1937.method_8320 (Lnet/minecraft/class_2338;)Lnet/minecraft/class_2680;
      // 80: getstatic net/minecraft/class_2246.field_10343 Lnet/minecraft/class_2248;
      // 83: invokevirtual net/minecraft/class_2680.method_27852 (Lnet/minecraft/class_2248;)Z
      // 86: iload 1
      // 87: ifne a0
      // 8a: iload 1
      // 8b: ifne 9a
      // 8e: goto 92
      // 91: athrow
      // 92: ifeq 9b
      // 95: goto 99
      // 98: athrow
      // 99: bipush 1
      // 9a: ireturn
      // 9b: iload 1
      // 9c: ifeq 61
      // 9f: bipush 0
      // a0: ireturn
   }

   // $VF: Handled exception range with multiple entry points by splitting it
   // $VF: Duplicated exception handlers to handle obfuscated exceptions
   public static int baabaab(class_310 var0) {
      int var1 = baaabbaa.bba;

      label30: {
         class_310 var10000;
         label29: {
            try {
               var10000 = var0;
               if (var1 != 0) {
                  break label29;
               }

               if (var0 == null) {
                  break label30;
               }
            } catch (MatchException var4) {
               throw var4;
            }

            var10000 = var0;
         }

         try {
            if (var10000.field_1724 != null) {
               return aba.baba(new aaaababaa(var0));
            }
         } catch (MatchException var3) {
            throw var3;
         }
      }

      try {
         return 0;
      } catch (MatchException var2) {
         throw var2;
      }
   }

   public static float baababa(class_9779 param0, boolean param1) {
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
      // 06: ifne 14
      // 09: ifnonnull 13
      // 0c: goto 10
      // 0f: athrow
      // 10: fconst_0
      // 11: freturn
      // 12: athrow
      // 13: aload 0
      // 14: iload 1
      // 15: invokeinterface net/minecraft/class_9779.method_60637 (Z)F 2
      // 1a: freturn
   }

   public static void baababb() {
      // $VF: Couldn't be decompiled
      // Please report this to the Vineflower issue tracker, at https://github.com/Vineflower/vineflower/issues with a copy of the class file (if you have the rights to distribute it!)
      // java.lang.RuntimeException: parsing failure!
      //   at org.jetbrains.java.decompiler.modules.decompiler.decompose.DomHelper.parseGraph(DomHelper.java:211)
      //   at org.jetbrains.java.decompiler.main.rels.MethodProcessor.codeToJava(MethodProcessor.java:166)
      //
      // Bytecode:
      // 00: getstatic qeaa361f143ee4a0894bd168fd9b30c66/qf4ccf8f5435d4a78bdca4d6a018b578e/baaabbaa.bba I
      // 03: bipush 0
      // 04: putstatic qeaa361f143ee4a0894bd168fd9b30c66/qf4ccf8f5435d4a78bdca4d6a018b578e/aabbabbbb.babaa Z
      // 07: bipush 0
      // 08: putstatic qeaa361f143ee4a0894bd168fd9b30c66/qf4ccf8f5435d4a78bdca4d6a018b578e/aabbabbbb.aaaaaa Z
      // 0b: bipush 0
      // 0c: putstatic qeaa361f143ee4a0894bd168fd9b30c66/qf4ccf8f5435d4a78bdca4d6a018b578e/aabbabbbb.aaaba Z
      // 0f: istore 0
      // 10: bipush 0
      // 11: iload 0
      // 12: ifne 27
      // 15: putstatic qeaa361f143ee4a0894bd168fd9b30c66/qf4ccf8f5435d4a78bdca4d6a018b578e/aabbabbbb.ba Z
      // 18: getstatic qeaa361f143ee4a0894bd168fd9b30c66/qf4ccf8f5435d4a78bdca4d6a018b578e/aabbabbbb.bbbaa I
      // 1b: ifne 2a
      // 1e: goto 22
      // 21: athrow
      // 22: bipush 0
      // 23: goto 27
      // 26: athrow
      // 27: putstatic qeaa361f143ee4a0894bd168fd9b30c66/qf4ccf8f5435d4a78bdca4d6a018b578e/aabbabbbb.aabbb I
      // 2a: return
   }

   public static int baabbaa(class_746 var0, class_638 var1) {
      int var2 = baaabbaa.bba;

      try {
         if (var0 == null) {
            return -1;
         }
      } catch (MatchException var9) {
         throw var9;
      }

      int var3 = -1;
      int var4 = -1;
      int var5 = 0;

      int var10000;
      while (true) {
         if (var5 < aaaaa(b(604047120, -581152709 ^ -1110864769), 1131576471880749436L)) {
            class_1799 var6 = var0.method_31548().method_5438(var5);
            var10000 = baaabba(var6, var1);
            if (var2 != 0) {
               break;
            }

            int var7 = var10000;

            label35: {
               label34: {
                  try {
                     if (var2 != 0) {
                        break label35;
                     }

                     if (var7 <= var4) {
                        break label34;
                     }
                  } catch (MatchException var8) {
                     throw var8;
                  }

                  var4 = var7;
                  var3 = var5;
               }

               var5++;
            }

            if (var2 == 0) {
               continue;
            }
         }

         var10000 = var3;
         break;
      }

      return var10000;
   }

   public static class_3966 baabbab(class_310 var0, class_1309 var1, double var2) {
      return abbabbb(var0, var1, var2, true);
   }

   public static bbbbaaaa baabbba(class_310 var0, Object var1, int var2) {
      return aaabaa(var0, var1, var2, 0, true);
   }

   public static void baabbbb(long param0, int param2, int param3) {
      // $VF: Couldn't be decompiled
      // Please report this to the Vineflower issue tracker, at https://github.com/Vineflower/vineflower/issues with a copy of the class file (if you have the rights to distribute it!)
      // java.lang.RuntimeException: parsing failure!
      //   at org.jetbrains.java.decompiler.modules.decompiler.decompose.DomHelper.parseGraph(DomHelper.java:211)
      //   at org.jetbrains.java.decompiler.main.rels.MethodProcessor.codeToJava(MethodProcessor.java:166)
      //
      // Bytecode:
      // 00: getstatic qeaa361f143ee4a0894bd168fd9b30c66/qf4ccf8f5435d4a78bdca4d6a018b578e/baaabbaa.bba I
      // 03: istore 4
      // 05: invokestatic qeaa361f143ee4a0894bd168fd9b30c66/qf4ccf8f5435d4a78bdca4d6a018b578e/abbabaa.aa ()Z
      // 08: iload 4
      // 0a: ifne 15
      // 0d: ifne 32
      // 10: goto 14
      // 13: athrow
      // 14: iload 2
      // 15: iload 4
      // 17: ifne 22
      // 1a: iflt 32
      // 1d: goto 21
      // 20: athrow
      // 21: iload 2
      // 22: iload 4
      // 24: ifne 35
      // 27: getstatic qeaa361f143ee4a0894bd168fd9b30c66/qf4ccf8f5435d4a78bdca4d6a018b578e/aabbabbbb.bbaab [Z
      // 2a: arraylength
      // 2b: if_icmplt 34
      // 2e: goto 32
      // 31: athrow
      // 32: return
      // 33: athrow
      // 34: iload 3
      // 35: iload 4
      // 37: ifne 5c
      // 3a: bipush 1
      // 3b: if_icmpne 57
      // 3e: goto 42
      // 41: athrow
      // 42: getstatic qeaa361f143ee4a0894bd168fd9b30c66/qf4ccf8f5435d4a78bdca4d6a018b578e/aabbabbbb.bbaab [Z
      // 45: iload 2
      // 46: bipush 1
      // 47: bastore
      // 48: iload 4
      // 4a: getstatic qeaa361f143ee4a0894bd168fd9b30c66/qf4ccf8f5435d4a78bdca4d6a018b578e/aabbabbbb.bbbbb [Z
      // 4d: iload 2
      // 4e: bipush 1
      // 4f: bastore
      // 50: ifeq 69
      // 53: goto 57
      // 56: athrow
      // 57: iload 3
      // 58: goto 5c
      // 5b: athrow
      // 5c: ifne 69
      // 5f: getstatic qeaa361f143ee4a0894bd168fd9b30c66/qf4ccf8f5435d4a78bdca4d6a018b578e/aabbabbbb.bbaab [Z
      // 62: iload 2
      // 63: bipush 0
      // 64: bastore
      // 65: goto 69
      // 68: athrow
      // 69: return
   }

   public static void babaaaa() {
      aaaaab.clear();
   }

   private static boolean babaaab(class_310 param0, class_3966 param1, Object param2) {
      // $VF: Couldn't be decompiled
      // Please report this to the Vineflower issue tracker, at https://github.com/Vineflower/vineflower/issues with a copy of the class file (if you have the rights to distribute it!)
      // java.lang.RuntimeException: parsing failure!
      //   at org.jetbrains.java.decompiler.modules.decompiler.decompose.DomHelper.parseGraph(DomHelper.java:211)
      //   at org.jetbrains.java.decompiler.main.rels.MethodProcessor.codeToJava(MethodProcessor.java:166)
      //
      // Bytecode:
      // 00: getstatic qeaa361f143ee4a0894bd168fd9b30c66/qf4ccf8f5435d4a78bdca4d6a018b578e/baaabbaa.bba I
      // 03: invokestatic qeaa361f143ee4a0894bd168fd9b30c66/qf4ccf8f5435d4a78bdca4d6a018b578e/aabbabbbb.bbbbaa ()Z
      // 06: istore 4
      // 08: bipush 1
      // 09: invokestatic qeaa361f143ee4a0894bd168fd9b30c66/qf4ccf8f5435d4a78bdca4d6a018b578e/aabbabbbb.bbaaa (Z)V
      // 0c: istore 3
      // 0d: aload 0
      // 0e: invokestatic qeaa361f143ee4a0894bd168fd9b30c66/qf4ccf8f5435d4a78bdca4d6a018b578e/aabbabbbb.bbbaaba (Lnet/minecraft/class_310;)V
      // 11: aload 0
      // 12: aload 1
      // 13: aload 2
      // 14: invokestatic qeaa361f143ee4a0894bd168fd9b30c66/qf4ccf8f5435d4a78bdca4d6a018b578e/ababaabab.abab (Lnet/minecraft/class_310;Lnet/minecraft/class_3966;Ljava/lang/Object;)Z
      // 17: istore 5
      // 19: bipush 0
      // 1a: iload 3
      // 1b: ifne 33
      // 1e: invokestatic qeaa361f143ee4a0894bd168fd9b30c66/qf4ccf8f5435d4a78bdca4d6a018b578e/aabbabbbb.bbaaa (Z)V
      // 21: iload 4
      // 23: ifeq 31
      // 26: goto 2a
      // 29: athrow
      // 2a: invokestatic qeaa361f143ee4a0894bd168fd9b30c66/qf4ccf8f5435d4a78bdca4d6a018b578e/aabbabbbb.baaaa ()V
      // 2d: goto 31
      // 30: athrow
      // 31: iload 5
      // 33: ireturn
      // 34: astore 6
      // 36: bipush 0
      // 37: invokestatic qeaa361f143ee4a0894bd168fd9b30c66/qf4ccf8f5435d4a78bdca4d6a018b578e/aabbabbbb.bbaaa (Z)V
      // 3a: iload 4
      // 3c: ifeq 46
      // 3f: invokestatic qeaa361f143ee4a0894bd168fd9b30c66/qf4ccf8f5435d4a78bdca4d6a018b578e/aabbabbbb.baaaa ()V
      // 42: goto 46
      // 45: athrow
      // 46: aload 6
      // 48: athrow
   }

   public static void babaaba() {
      aabbb++;
   }

   public static class_306 babaabb(int var0) {
      try {
         if (var0 == -1) {
            return class_3675.field_16237;
         }
      } catch (MatchException var1) {
         throw var1;
      }

      return class_307.field_1668.method_1447(var0);
   }

   public static void bababaa(class_304 var0) {
      int var1 = baaabbaa.bba;

      class_304 var10000;
      label20: {
         try {
            var10000 = var0;
            if (var1 != 0) {
               break label20;
            }

            if (var0 == null) {
               return;
            }
         } catch (MatchException var2) {
            throw var2;
         }

         var10000 = var0;
      }

      bbbabaa.bbaa(var10000, 0);
   }

   public static boolean bababab(class_310 param0, class_239 param1) {
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
      // 09: ifnull 32
      // 0c: goto 10
      // 0f: athrow
      // 10: aload 0
      // 11: iload 2
      // 12: ifne 24
      // 15: getfield net/minecraft/class_310.field_1724 Lnet/minecraft/class_746;
      // 18: ifnull 32
      // 1b: goto 1f
      // 1e: athrow
      // 1f: aload 0
      // 20: goto 24
      // 23: athrow
      // 24: iload 2
      // 25: ifne 3a
      // 28: getfield net/minecraft/class_310.field_1761 Lnet/minecraft/class_636;
      // 2b: ifnonnull 35
      // 2e: goto 32
      // 31: athrow
      // 32: bipush 0
      // 33: ireturn
      // 34: athrow
      // 35: aload 0
      // 36: invokestatic qeaa361f143ee4a0894bd168fd9b30c66/qf4ccf8f5435d4a78bdca4d6a018b578e/aabbabbbb.bbaabbb (Lnet/minecraft/class_310;)V
      // 39: aload 0
      // 3a: getfield net/minecraft/class_310.field_1765 Lnet/minecraft/class_239;
      // 3d: astore 3
      // 3e: aload 0
      // 3f: aload 1
      // 40: putfield net/minecraft/class_310.field_1765 Lnet/minecraft/class_239;
      // 43: aload 0
      // 44: invokestatic qeaa361f143ee4a0894bd168fd9b30c66/qf4ccf8f5435d4a78bdca4d6a018b578e/bbbabaa.bbba (Lnet/minecraft/class_310;)V
      // 47: bipush 1
      // 48: istore 4
      // 4a: aload 0
      // 4b: aload 3
      // 4c: putfield net/minecraft/class_310.field_1765 Lnet/minecraft/class_239;
      // 4f: iload 4
      // 51: ireturn
      // 52: astore 5
      // 54: aload 0
      // 55: aload 3
      // 56: putfield net/minecraft/class_310.field_1765 Lnet/minecraft/class_239;
      // 59: aload 5
      // 5b: athrow
   }

   public static void bababba(int param0, int param1) {
      // $VF: Couldn't be decompiled
      // Please report this to the Vineflower issue tracker, at https://github.com/Vineflower/vineflower/issues with a copy of the class file (if you have the rights to distribute it!)
      // java.lang.RuntimeException: parsing failure!
      //   at org.jetbrains.java.decompiler.modules.decompiler.decompose.DomHelper.parseGraph(DomHelper.java:211)
      //   at org.jetbrains.java.decompiler.main.rels.MethodProcessor.codeToJava(MethodProcessor.java:166)
      //
      // Bytecode:
      // 00: getstatic qeaa361f143ee4a0894bd168fd9b30c66/qf4ccf8f5435d4a78bdca4d6a018b578e/baaabbaa.bba I
      // 03: istore 2
      // 04: iload 1
      // 05: iload 2
      // 06: ifne 12
      // 09: ifne 11
      // 0c: goto 10
      // 0f: athrow
      // 10: return
      // 11: iload 0
      // 12: iload 2
      // 13: ifne 3f
      // 16: bipush 1
      // 17: if_icmpeq 2f
      // 1a: goto 1e
      // 1d: athrow
      // 1e: iload 0
      // 1f: iload 2
      // 20: ifne 49
      // 23: goto 27
      // 26: athrow
      // 27: bipush 2
      // 28: if_icmpne 44
      // 2b: goto 2f
      // 2e: athrow
      // 2f: getstatic qeaa361f143ee4a0894bd168fd9b30c66/qf4ccf8f5435d4a78bdca4d6a018b578e/aabbabbbb.aaaaab Ljava/util/Set;
      // 32: iload 1
      // 33: invokestatic java/lang/Integer.valueOf (I)Ljava/lang/Integer;
      // 36: invokeinterface java/util/Set.add (Ljava/lang/Object;)Z 2
      // 3b: goto 3f
      // 3e: athrow
      // 3f: pop
      // 40: iload 2
      // 41: ifeq 65
      // 44: iload 0
      // 45: goto 49
      // 48: athrow
      // 49: iload 2
      // 4a: ifne 64
      // 4d: ifne 65
      // 50: goto 54
      // 53: athrow
      // 54: getstatic qeaa361f143ee4a0894bd168fd9b30c66/qf4ccf8f5435d4a78bdca4d6a018b578e/aabbabbbb.aaaaab Ljava/util/Set;
      // 57: iload 1
      // 58: invokestatic java/lang/Integer.valueOf (I)Ljava/lang/Integer;
      // 5b: invokeinterface java/util/Set.remove (Ljava/lang/Object;)Z 2
      // 60: goto 64
      // 63: athrow
      // 64: pop
      // 65: return
   }

   private static boolean bababbb(class_638 param0, class_243 param1, class_243 param2) {
      // $VF: Couldn't be decompiled
      // Please report this to the Vineflower issue tracker, at https://github.com/Vineflower/vineflower/issues with a copy of the class file (if you have the rights to distribute it!)
      // java.lang.RuntimeException: parsing failure!
      //   at org.jetbrains.java.decompiler.modules.decompiler.decompose.DomHelper.parseGraph(DomHelper.java:211)
      //   at org.jetbrains.java.decompiler.main.rels.MethodProcessor.codeToJava(MethodProcessor.java:166)
      //
      // Bytecode:
      // 000: aload 1
      // 001: invokestatic net/minecraft/class_2338.method_49638 (Lnet/minecraft/class_2374;)Lnet/minecraft/class_2338;
      // 004: astore 4
      // 006: aload 1
      // 007: getfield net/minecraft/class_243.field_1352 D
      // 00a: aload 2
      // 00b: getfield net/minecraft/class_243.field_1352 D
      // 00e: invokestatic java/lang/Math.min (DD)D
      // 011: aload 1
      // 012: getfield net/minecraft/class_243.field_1351 D
      // 015: aload 2
      // 016: getfield net/minecraft/class_243.field_1351 D
      // 019: invokestatic java/lang/Math.min (DD)D
      // 01c: aload 1
      // 01d: getfield net/minecraft/class_243.field_1350 D
      // 020: aload 2
      // 021: getfield net/minecraft/class_243.field_1350 D
      // 024: invokestatic java/lang/Math.min (DD)D
      // 027: invokestatic net/minecraft/class_2338.method_49637 (DDD)Lnet/minecraft/class_2338;
      // 02a: astore 5
      // 02c: getstatic qeaa361f143ee4a0894bd168fd9b30c66/qf4ccf8f5435d4a78bdca4d6a018b578e/baaabbaa.bba I
      // 02f: aload 1
      // 030: getfield net/minecraft/class_243.field_1352 D
      // 033: aload 2
      // 034: getfield net/minecraft/class_243.field_1352 D
      // 037: invokestatic java/lang/Math.max (DD)D
      // 03a: aload 1
      // 03b: getfield net/minecraft/class_243.field_1351 D
      // 03e: aload 2
      // 03f: getfield net/minecraft/class_243.field_1351 D
      // 042: invokestatic java/lang/Math.max (DD)D
      // 045: aload 1
      // 046: getfield net/minecraft/class_243.field_1350 D
      // 049: aload 2
      // 04a: getfield net/minecraft/class_243.field_1350 D
      // 04d: invokestatic java/lang/Math.max (DD)D
      // 050: invokestatic net/minecraft/class_2338.method_49637 (DDD)Lnet/minecraft/class_2338;
      // 053: astore 6
      // 055: aload 5
      // 057: aload 6
      // 059: invokestatic net/minecraft/class_2338.method_10097 (Lnet/minecraft/class_2338;Lnet/minecraft/class_2338;)Ljava/lang/Iterable;
      // 05c: invokeinterface java/lang/Iterable.iterator ()Ljava/util/Iterator; 1
      // 061: astore 7
      // 063: istore 3
      // 064: aload 7
      // 066: invokeinterface java/util/Iterator.hasNext ()Z 1
      // 06b: ifeq 109
      // 06e: aload 7
      // 070: invokeinterface java/util/Iterator.next ()Ljava/lang/Object; 1
      // 075: checkcast net/minecraft/class_2338
      // 078: astore 8
      // 07a: aload 8
      // 07c: aload 4
      // 07e: invokevirtual net/minecraft/class_2338.equals (Ljava/lang/Object;)Z
      // 081: iload 3
      // 082: ifne 10a
      // 085: iload 3
      // 086: ifne 0a0
      // 089: goto 08d
      // 08c: athrow
      // 08d: ifne 064
      // 090: goto 094
      // 093: athrow
      // 094: aload 0
      // 095: aload 8
      // 097: invokevirtual net/minecraft/class_638.method_8320 (Lnet/minecraft/class_2338;)Lnet/minecraft/class_2680;
      // 09a: getstatic net/minecraft/class_2246.field_10343 Lnet/minecraft/class_2248;
      // 09d: invokevirtual net/minecraft/class_2680.method_27852 (Lnet/minecraft/class_2248;)Z
      // 0a0: iload 3
      // 0a1: ifne 0f8
      // 0a4: ifne 0b3
      // 0a7: goto 0ab
      // 0aa: athrow
      // 0ab: iload 3
      // 0ac: ifeq 064
      // 0af: goto 0b3
      // 0b2: athrow
      // 0b3: aload 1
      // 0b4: getfield net/minecraft/class_243.field_1352 D
      // 0b7: aload 1
      // 0b8: getfield net/minecraft/class_243.field_1351 D
      // 0bb: aload 1
      // 0bc: getfield net/minecraft/class_243.field_1350 D
      // 0bf: aload 2
      // 0c0: getfield net/minecraft/class_243.field_1352 D
      // 0c3: aload 2
      // 0c4: getfield net/minecraft/class_243.field_1351 D
      // 0c7: aload 2
      // 0c8: getfield net/minecraft/class_243.field_1350 D
      // 0cb: aload 8
      // 0cd: invokevirtual net/minecraft/class_2338.method_10263 ()I
      // 0d0: i2d
      // 0d1: aload 8
      // 0d3: invokevirtual net/minecraft/class_2338.method_10264 ()I
      // 0d6: i2d
      // 0d7: aload 8
      // 0d9: invokevirtual net/minecraft/class_2338.method_10260 ()I
      // 0dc: i2d
      // 0dd: aload 8
      // 0df: invokevirtual net/minecraft/class_2338.method_10263 ()I
      // 0e2: i2d
      // 0e3: dconst_1
      // 0e4: dadd
      // 0e5: aload 8
      // 0e7: invokevirtual net/minecraft/class_2338.method_10264 ()I
      // 0ea: i2d
      // 0eb: dconst_1
      // 0ec: dadd
      // 0ed: aload 8
      // 0ef: invokevirtual net/minecraft/class_2338.method_10260 ()I
      // 0f2: i2d
      // 0f3: dconst_1
      // 0f4: dadd
      // 0f5: invokestatic qeaa361f143ee4a0894bd168fd9b30c66/qf4ccf8f5435d4a78bdca4d6a018b578e/aabbabbab.baaa (DDDDDDDDDDDD)Z
      // 0f8: iload 3
      // 0f9: ifne 104
      // 0fc: ifeq 105
      // 0ff: goto 103
      // 102: athrow
      // 103: bipush 1
      // 104: ireturn
      // 105: iload 3
      // 106: ifeq 064
      // 109: bipush 0
      // 10a: ireturn
   }

   public static boolean babbaaa() {
      return abaab;
   }

   private static boolean babbaab(class_310 param0) {
      // $VF: Couldn't be decompiled
      // Please report this to the Vineflower issue tracker, at https://github.com/Vineflower/vineflower/issues with a copy of the class file (if you have the rights to distribute it!)
      // java.lang.NullPointerException: Cannot invoke "org.jetbrains.java.decompiler.code.cfg.ExceptionRangeCFG.isCircular()" because "range" is null
      //   at org.jetbrains.java.decompiler.modules.decompiler.decompose.DomHelper.graphToStatement(DomHelper.java:84)
      //   at org.jetbrains.java.decompiler.modules.decompiler.decompose.DomHelper.parseGraph(DomHelper.java:203)
      //   at org.jetbrains.java.decompiler.main.rels.MethodProcessor.codeToJava(MethodProcessor.java:166)
      //
      // Bytecode:
      // 00: getstatic qeaa361f143ee4a0894bd168fd9b30c66/qf4ccf8f5435d4a78bdca4d6a018b578e/baaabbaa.bba I
      // 03: istore 1
      // 04: getstatic qeaa361f143ee4a0894bd168fd9b30c66/qf4ccf8f5435d4a78bdca4d6a018b578e/aabbabbbb.bbbb I
      // 07: iload 1
      // 08: ifne 3b
      // 0b: bipush 1
      // 0c: iadd
      // 0d: putstatic qeaa361f143ee4a0894bd168fd9b30c66/qf4ccf8f5435d4a78bdca4d6a018b578e/aabbabbbb.bbbb I
      // 10: aload 0
      // 11: ifnull 36
      // 14: aload 0
      // 15: iload 1
      // 16: ifne 28
      // 19: getfield net/minecraft/class_310.field_1724 Lnet/minecraft/class_746;
      // 1c: ifnull 36
      // 1f: goto 23
      // 22: athrow
      // 23: aload 0
      // 24: goto 28
      // 27: athrow
      // 28: iload 1
      // 29: ifne 4b
      // 2c: getfield net/minecraft/class_310.field_1761 Lnet/minecraft/class_636;
      // 2f: ifnonnull 4a
      // 32: goto 36
      // 35: athrow
      // 36: bipush 0
      // 37: goto 3b
      // 3a: athrow
      // 3b: istore 2
      // 3c: bipush 0
      // 3d: getstatic qeaa361f143ee4a0894bd168fd9b30c66/qf4ccf8f5435d4a78bdca4d6a018b578e/aabbabbbb.bbbb I
      // 40: bipush 1
      // 41: isub
      // 42: invokestatic java/lang/Math.max (II)I
      // 45: putstatic qeaa361f143ee4a0894bd168fd9b30c66/qf4ccf8f5435d4a78bdca4d6a018b578e/aabbabbbb.bbbb I
      // 48: iload 2
      // 49: ireturn
      // 4a: aload 0
      // 4b: iload 1
      // 4c: ifne 6a
      // 4f: invokestatic qeaa361f143ee4a0894bd168fd9b30c66/qf4ccf8f5435d4a78bdca4d6a018b578e/aabbabbbb.bbaa (Lnet/minecraft/class_310;)Z
      // 52: ifeq 69
      // 55: goto 59
      // 58: athrow
      // 59: bipush 0
      // 5a: istore 2
      // 5b: bipush 0
      // 5c: getstatic qeaa361f143ee4a0894bd168fd9b30c66/qf4ccf8f5435d4a78bdca4d6a018b578e/aabbabbbb.bbbb I
      // 5f: bipush 1
      // 60: isub
      // 61: invokestatic java/lang/Math.max (II)I
      // 64: putstatic qeaa361f143ee4a0894bd168fd9b30c66/qf4ccf8f5435d4a78bdca4d6a018b578e/aabbabbbb.bbbb I
      // 67: iload 2
      // 68: ireturn
      // 69: aload 0
      // 6a: invokestatic qeaa361f143ee4a0894bd168fd9b30c66/qf4ccf8f5435d4a78bdca4d6a018b578e/aabbabbbb.abbabba (Lnet/minecraft/class_310;)Lnet/minecraft/class_1297;
      // 6d: astore 2
      // 6e: aload 0
      // 6f: iload 1
      // 70: ifne 8f
      // 73: aload 2
      // 74: invokestatic qeaa361f143ee4a0894bd168fd9b30c66/qf4ccf8f5435d4a78bdca4d6a018b578e/aabbabbbb.bbaabb (Lnet/minecraft/class_310;Lnet/minecraft/class_1297;)Z
      // 77: ifeq 8e
      // 7a: goto 7e
      // 7d: athrow
      // 7e: bipush 0
      // 7f: istore 3
      // 80: bipush 0
      // 81: getstatic qeaa361f143ee4a0894bd168fd9b30c66/qf4ccf8f5435d4a78bdca4d6a018b578e/aabbabbbb.bbbb I
      // 84: bipush 1
      // 85: isub
      // 86: invokestatic java/lang/Math.max (II)I
      // 89: putstatic qeaa361f143ee4a0894bd168fd9b30c66/qf4ccf8f5435d4a78bdca4d6a018b578e/aabbabbbb.bbbb I
      // 8c: iload 3
      // 8d: ireturn
      // 8e: aload 0
      // 8f: invokestatic qeaa361f143ee4a0894bd168fd9b30c66/qf4ccf8f5435d4a78bdca4d6a018b578e/aabbabbbb.aaaab (Lnet/minecraft/class_310;)Z
      // 92: istore 3
      // 93: bipush 0
      // 94: getstatic qeaa361f143ee4a0894bd168fd9b30c66/qf4ccf8f5435d4a78bdca4d6a018b578e/aabbabbbb.bbbb I
      // 97: bipush 1
      // 98: isub
      // 99: invokestatic java/lang/Math.max (II)I
      // 9c: putstatic qeaa361f143ee4a0894bd168fd9b30c66/qf4ccf8f5435d4a78bdca4d6a018b578e/aabbabbbb.bbbb I
      // 9f: iload 3
      // a0: ireturn
      // a1: astore 4
      // a3: bipush 0
      // a4: getstatic qeaa361f143ee4a0894bd168fd9b30c66/qf4ccf8f5435d4a78bdca4d6a018b578e/aabbabbbb.bbbb I
      // a7: bipush 1
      // a8: isub
      // a9: invokestatic java/lang/Math.max (II)I
      // ac: putstatic qeaa361f143ee4a0894bd168fd9b30c66/qf4ccf8f5435d4a78bdca4d6a018b578e/aabbabbbb.bbbb I
      // af: aload 4
      // b1: athrow
   }

   public static void babbaba(class_310 var0, int var1) {
      bbbabaa.a(var0, Math.max(0, var1));
   }

   private static void babbabb(class_310 param0, class_1268 param1, class_1269 param2) {
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
      // 06: ifne 11
      // 09: ifnull 4b
      // 0c: goto 10
      // 0f: athrow
      // 10: aload 0
      // 11: getfield net/minecraft/class_310.field_1724 Lnet/minecraft/class_746;
      // 14: ifnull 4b
      // 17: aload 2
      // 18: iload 3
      // 19: ifne 2f
      // 1c: goto 20
      // 1f: athrow
      // 20: instanceof net/minecraft/class_1269$class_9860
      // 23: ifeq 4b
      // 26: goto 2a
      // 29: athrow
      // 2a: aload 2
      // 2b: goto 2f
      // 2e: athrow
      // 2f: checkcast net/minecraft/class_1269$class_9860
      // 32: astore 4
      // 34: aload 4
      // 36: invokevirtual net/minecraft/class_1269$class_9860.comp_2909 ()Lnet/minecraft/class_1269$class_9861;
      // 39: getstatic net/minecraft/class_1269$class_9861.field_52427 Lnet/minecraft/class_1269$class_9861;
      // 3c: if_acmpne 4b
      // 3f: aload 0
      // 40: getfield net/minecraft/class_310.field_1724 Lnet/minecraft/class_746;
      // 43: aload 1
      // 44: invokevirtual net/minecraft/class_746.method_6104 (Lnet/minecraft/class_1268;)V
      // 47: goto 4b
      // 4a: athrow
      // 4b: return
   }

   public static class_1269 babbbaa(class_310 param0, class_1268 param1, class_3965 param2) {
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
      // 004: aload 0
      // 005: iload 3
      // 006: ifne 011
      // 009: ifnull 03a
      // 00c: goto 010
      // 00f: athrow
      // 010: aload 0
      // 011: iload 3
      // 012: ifne 024
      // 015: getfield net/minecraft/class_310.field_1724 Lnet/minecraft/class_746;
      // 018: ifnull 03a
      // 01b: goto 01f
      // 01e: athrow
      // 01f: aload 0
      // 020: goto 024
      // 023: athrow
      // 024: getfield net/minecraft/class_310.field_1761 Lnet/minecraft/class_636;
      // 027: ifnull 03a
      // 02a: aload 1
      // 02b: ifnull 03a
      // 02e: goto 032
      // 031: athrow
      // 032: aload 2
      // 033: ifnonnull 03f
      // 036: goto 03a
      // 039: athrow
      // 03a: getstatic net/minecraft/class_1269.field_5814 Lnet/minecraft/class_1269$class_9857;
      // 03d: areturn
      // 03e: athrow
      // 03f: aload 0
      // 040: iload 3
      // 041: ifne 054
      // 044: invokestatic qeaa361f143ee4a0894bd168fd9b30c66/qf4ccf8f5435d4a78bdca4d6a018b578e/aabbabbbb.aaaaba (Lnet/minecraft/class_310;)Z
      // 047: ifne 053
      // 04a: goto 04e
      // 04d: athrow
      // 04e: getstatic net/minecraft/class_1269.field_5814 Lnet/minecraft/class_1269$class_9857;
      // 051: areturn
      // 052: athrow
      // 053: aload 0
      // 054: aload 1
      // 055: aload 2
      // 056: invokestatic qeaa361f143ee4a0894bd168fd9b30c66/qf4ccf8f5435d4a78bdca4d6a018b578e/aabbabbbb.babbb (Lnet/minecraft/class_310;Lnet/minecraft/class_1268;Lnet/minecraft/class_3965;)Z
      // 059: iload 3
      // 05a: ifne 06c
      // 05d: ifeq 069
      // 060: goto 064
      // 063: athrow
      // 064: getstatic net/minecraft/class_1269.field_5814 Lnet/minecraft/class_1269$class_9857;
      // 067: areturn
      // 068: athrow
      // 069: invokestatic qeaa361f143ee4a0894bd168fd9b30c66/qf4ccf8f5435d4a78bdca4d6a018b578e/abababbbb.abba ()Z
      // 06c: ifne 0bb
      // 06f: aload 0
      // 070: invokestatic qeaa361f143ee4a0894bd168fd9b30c66/qf4ccf8f5435d4a78bdca4d6a018b578e/bbabbbb.baaab (Lnet/minecraft/class_310;)F
      // 073: fstore 4
      // 075: fload 4
      // 077: iload 3
      // 078: ifne 08c
      // 07b: invokestatic java/lang/Float.isNaN (F)Z
      // 07e: ifne 0b7
      // 081: goto 085
      // 084: athrow
      // 085: getstatic qeaa361f143ee4a0894bd168fd9b30c66/qf4ccf8f5435d4a78bdca4d6a018b578e/aabbabbbb.baaab F
      // 088: goto 08c
      // 08b: athrow
      // 08c: iload 3
      // 08d: ifne 0a8
      // 090: invokestatic java/lang/Float.isNaN (F)Z
      // 093: ifeq 09f
      // 096: goto 09a
      // 099: athrow
      // 09a: fconst_0
      // 09b: goto 0ab
      // 09e: athrow
      // 09f: fload 4
      // 0a1: getstatic qeaa361f143ee4a0894bd168fd9b30c66/qf4ccf8f5435d4a78bdca4d6a018b578e/aabbabbbb.baaab F
      // 0a4: fsub
      // 0a5: invokestatic net/minecraft/class_3532.method_15393 (F)F
      // 0a8: invokestatic java/lang/Math.abs (F)F
      // 0ab: fstore 5
      // 0ad: fload 5
      // 0af: invokestatic qeaa361f143ee4a0894bd168fd9b30c66/qf4ccf8f5435d4a78bdca4d6a018b578e/abababbbb.bab (F)V
      // 0b2: fload 4
      // 0b4: putstatic qeaa361f143ee4a0894bd168fd9b30c66/qf4ccf8f5435d4a78bdca4d6a018b578e/aabbabbbb.baaab F
      // 0b7: iload 3
      // 0b8: ifeq 0da
      // 0bb: aload 0
      // 0bc: invokestatic qeaa361f143ee4a0894bd168fd9b30c66/qf4ccf8f5435d4a78bdca4d6a018b578e/bbabbbb.baaab (Lnet/minecraft/class_310;)F
      // 0bf: fstore 4
      // 0c1: fload 4
      // 0c3: invokestatic java/lang/Float.isNaN (F)Z
      // 0c6: iload 3
      // 0c7: ifne 0dd
      // 0ca: ifne 0da
      // 0cd: goto 0d1
      // 0d0: athrow
      // 0d1: fload 4
      // 0d3: putstatic qeaa361f143ee4a0894bd168fd9b30c66/qf4ccf8f5435d4a78bdca4d6a018b578e/aabbabbbb.baaab F
      // 0d6: goto 0da
      // 0d9: athrow
      // 0da: invokestatic qeaa361f143ee4a0894bd168fd9b30c66/qf4ccf8f5435d4a78bdca4d6a018b578e/abababbbb.b ()Z
      // 0dd: ifne 0e5
      // 0e0: getstatic net/minecraft/class_1269.field_5814 Lnet/minecraft/class_1269$class_9857;
      // 0e3: areturn
      // 0e4: athrow
      // 0e5: aload 0
      // 0e6: invokestatic qeaa361f143ee4a0894bd168fd9b30c66/qf4ccf8f5435d4a78bdca4d6a018b578e/aabbabbbb.bbaabbb (Lnet/minecraft/class_310;)V
      // 0e9: aload 0
      // 0ea: getfield net/minecraft/class_310.field_1761 Lnet/minecraft/class_636;
      // 0ed: aload 0
      // 0ee: getfield net/minecraft/class_310.field_1724 Lnet/minecraft/class_746;
      // 0f1: aload 1
      // 0f2: aload 2
      // 0f3: invokevirtual net/minecraft/class_636.method_2896 (Lnet/minecraft/class_746;Lnet/minecraft/class_1268;Lnet/minecraft/class_3965;)Lnet/minecraft/class_1269;
      // 0f6: astore 4
      // 0f8: aload 4
      // 0fa: iload 3
      // 0fb: ifne 19b
      // 0fe: ifnull 199
      // 101: goto 105
      // 104: athrow
      // 105: aload 4
      // 107: iload 3
      // 108: ifne 19b
      // 10b: goto 10f
      // 10e: athrow
      // 10f: invokeinterface net/minecraft/class_1269.method_23665 ()Z 1
      // 114: ifeq 199
      // 117: goto 11b
      // 11a: athrow
      // 11b: aload 0
      // 11c: aload 1
      // 11d: aload 4
      // 11f: invokestatic qeaa361f143ee4a0894bd168fd9b30c66/qf4ccf8f5435d4a78bdca4d6a018b578e/aabbabbbb.babbabb (Lnet/minecraft/class_310;Lnet/minecraft/class_1268;Lnet/minecraft/class_1269;)V
      // 122: aload 0
      // 123: invokestatic qeaa361f143ee4a0894bd168fd9b30c66/qf4ccf8f5435d4a78bdca4d6a018b578e/aabbabbbb.baaaaba (Lnet/minecraft/class_310;)V
      // 126: aload 0
      // 127: getfield net/minecraft/class_310.field_1724 Lnet/minecraft/class_746;
      // 12a: aload 1
      // 12b: invokevirtual net/minecraft/class_746.method_5998 (Lnet/minecraft/class_1268;)Lnet/minecraft/class_1799;
      // 12e: astore 5
      // 130: aload 5
      // 132: iload 3
      // 133: ifne 13f
      // 136: ifnull 14d
      // 139: goto 13d
      // 13c: athrow
      // 13d: aload 5
      // 13f: invokevirtual net/minecraft/class_1799.method_7960 ()Z
      // 142: iload 3
      // 143: ifne 15d
      // 146: ifeq 18e
      // 149: goto 14d
      // 14c: athrow
      // 14d: aload 0
      // 14e: iload 3
      // 14f: ifne 18f
      // 152: goto 156
      // 155: athrow
      // 156: invokestatic qeaa361f143ee4a0894bd168fd9b30c66/qf4ccf8f5435d4a78bdca4d6a018b578e/aabbabbbb.baabaab (Lnet/minecraft/class_310;)I
      // 159: goto 15d
      // 15c: athrow
      // 15d: istore 6
      // 15f: iload 6
      // 161: iflt 18e
      // 164: iload 6
      // 166: ldc_w 604047123
      // 169: ldc_w -184296796
      // 16c: ldc_w -723515202
      // 16f: ixor
      // 170: invokestatic qeaa361f143ee4a0894bd168fd9b30c66/qf4ccf8f5435d4a78bdca4d6a018b578e/aabbabbbb.b (II)I
      // 173: ldc2_w 1131576471880749436
      // 176: invokestatic qeaa361f143ee4a0894bd168fd9b30c66/qf4ccf8f5435d4a78bdca4d6a018b578e/aabbabbbb.aaaaa (IJ)I
      // 179: if_icmpge 18e
      // 17c: goto 180
      // 17f: athrow
      // 180: aload 0
      // 181: getfield net/minecraft/class_310.field_1724 Lnet/minecraft/class_746;
      // 184: invokevirtual net/minecraft/class_746.method_31548 ()Lnet/minecraft/class_1661;
      // 187: iload 6
      // 189: invokevirtual net/minecraft/class_1661.method_5438 (I)Lnet/minecraft/class_1799;
      // 18c: astore 5
      // 18e: aload 0
      // 18f: getfield net/minecraft/class_310.field_1724 Lnet/minecraft/class_746;
      // 192: aload 1
      // 193: aload 5
      // 195: aload 2
      // 196: invokestatic qeaa361f143ee4a0894bd168fd9b30c66/qf4ccf8f5435d4a78bdca4d6a018b578e/abababbbb.abbb (Lnet/minecraft/class_746;Lnet/minecraft/class_1268;Lnet/minecraft/class_1799;Lnet/minecraft/class_3965;)V
      // 199: aload 4
      // 19b: areturn
   }

   public static boolean babbbab(class_310 param0) {
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
      // 06: ifne 11
      // 09: ifnull 68
      // 0c: goto 10
      // 0f: athrow
      // 10: aload 0
      // 11: iload 1
      // 12: ifne 24
      // 15: getfield net/minecraft/class_310.field_1690 Lnet/minecraft/class_315;
      // 18: ifnull 68
      // 1b: goto 1f
      // 1e: athrow
      // 1f: aload 0
      // 20: goto 24
      // 23: athrow
      // 24: iload 1
      // 25: ifne 37
      // 28: getfield net/minecraft/class_310.field_1755 Lnet/minecraft/class_437;
      // 2b: ifnonnull 68
      // 2e: goto 32
      // 31: athrow
      // 32: aload 0
      // 33: goto 37
      // 36: athrow
      // 37: getfield net/minecraft/class_310.field_1690 Lnet/minecraft/class_315;
      // 3a: getfield net/minecraft/class_315.field_1869 Lnet/minecraft/class_304;
      // 3d: invokestatic qeaa361f143ee4a0894bd168fd9b30c66/qf4ccf8f5435d4a78bdca4d6a018b578e/aabbabbbb.aabbbba (Lnet/minecraft/class_304;)I
      // 40: iload 1
      // 41: ifne 65
      // 44: ifgt 64
      // 47: goto 4b
      // 4a: athrow
      // 4b: aload 0
      // 4c: getfield net/minecraft/class_310.field_1690 Lnet/minecraft/class_315;
      // 4f: getfield net/minecraft/class_315.field_1831 Lnet/minecraft/class_304;
      // 52: invokestatic qeaa361f143ee4a0894bd168fd9b30c66/qf4ccf8f5435d4a78bdca4d6a018b578e/aabbabbbb.aabbbba (Lnet/minecraft/class_304;)I
      // 55: iload 1
      // 56: ifne 65
      // 59: goto 5d
      // 5c: athrow
      // 5d: ifle 68
      // 60: goto 64
      // 63: athrow
      // 64: bipush 1
      // 65: goto 69
      // 68: bipush 0
      // 69: ireturn
   }

   public static boolean babbbba(class_310 param0, double param1, boolean param3) {
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
      // 08: ifne 13
      // 0b: ifnull 22
      // 0e: goto 12
      // 11: athrow
      // 12: aload 0
      // 13: iload 4
      // 15: ifne 26
      // 18: getfield net/minecraft/class_310.field_1724 Lnet/minecraft/class_746;
      // 1b: ifnonnull 25
      // 1e: goto 22
      // 21: athrow
      // 22: bipush 0
      // 23: ireturn
      // 24: athrow
      // 25: aload 0
      // 26: getfield net/minecraft/class_310.field_1724 Lnet/minecraft/class_746;
      // 29: fconst_0
      // 2a: invokevirtual net/minecraft/class_746.method_7261 (F)F
      // 2d: fstore 5
      // 2f: iload 3
      // 30: iload 4
      // 32: ifne 58
      // 35: ifeq 53
      // 38: goto 3c
      // 3b: athrow
      // 3c: fload 5
      // 3e: fconst_1
      // 3f: iload 4
      // 41: ifne 57
      // 44: goto 48
      // 47: athrow
      // 48: fcmpg
      // 49: ifge 53
      // 4c: goto 50
      // 4f: athrow
      // 50: bipush 0
      // 51: ireturn
      // 52: athrow
      // 53: fload 5
      // 55: dload 1
      // 56: d2f
      // 57: fcmpl
      // 58: iload 4
      // 5a: ifne 65
      // 5d: iflt 68
      // 60: goto 64
      // 63: athrow
      // 64: bipush 1
      // 65: goto 69
      // 68: bipush 0
      // 69: ireturn
   }

   private static class_9331 babbbbb() {
      class_9331 var1 = aaabbb;
      int var0 = baaabbaa.bba;

      label37: {
         try {
            if (var0 != 0) {
               return var1;
            }

            if (var1 == null) {
               break label37;
            }
         } catch (Throwable var4) {
            throw var4;
         }

         return var1;
      }

      try {
         Field var2 = class_9334.class
            .getField(aabbaaaba.abba(bbaabaa(b(604047122, -302879865 ^ -410276258), b(604047125, -302879865 ^ -439458681))));
         var1 = (class_9331)var2.get(null);
      } catch (Throwable var3) {
         var1 = null;
      }

      aaabbb = var1;
      return var1;
   }

   public static boolean bbaaaaa(class_306 param0) {
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
      // 06: ifne 11
      // 09: ifnull 35
      // 0c: goto 10
      // 0f: athrow
      // 10: aload 0
      // 11: getstatic net/minecraft/class_3675.field_16237 Lnet/minecraft/class_3675$class_306;
      // 14: invokevirtual net/minecraft/class_3675$class_306.equals (Ljava/lang/Object;)Z
      // 17: iload 1
      // 18: ifne 36
      // 1b: ifne 35
      // 1e: goto 22
      // 21: athrow
      // 22: aload 0
      // 23: invokevirtual net/minecraft/class_3675$class_306.method_1444 ()I
      // 26: iload 1
      // 27: ifne 36
      // 2a: goto 2e
      // 2d: athrow
      // 2e: ifge 39
      // 31: goto 35
      // 34: athrow
      // 35: bipush 1
      // 36: goto 3a
      // 39: bipush 0
      // 3a: ireturn
   }

   public static boolean bbaaaab(class_310 param0, bbbbaaaa param1) {
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
      // 06: ifne 19
      // 09: aload 1
      // 0a: invokestatic qeaa361f143ee4a0894bd168fd9b30c66/qf4ccf8f5435d4a78bdca4d6a018b578e/aabbabbbb.abbbba (Lnet/minecraft/class_310;Lqeaa361f143ee4a0894bd168fd9b30c66/qf4ccf8f5435d4a78bdca4d6a018b578e/bbbbaaaa;)Z
      // 0d: ifeq 2b
      // 10: goto 14
      // 13: athrow
      // 14: aload 0
      // 15: goto 19
      // 18: athrow
      // 19: invokestatic qeaa361f143ee4a0894bd168fd9b30c66/qf4ccf8f5435d4a78bdca4d6a018b578e/aabbabbbb.bbaaaa (Lnet/minecraft/class_310;)Z
      // 1c: iload 2
      // 1d: ifne 28
      // 20: ifeq 2b
      // 23: goto 27
      // 26: athrow
      // 27: bipush 1
      // 28: goto 2c
      // 2b: bipush 0
      // 2c: ireturn
   }

   private static void bbaaaba() {
      // $VF: Couldn't be decompiled
      // Please report this to the Vineflower issue tracker, at https://github.com/Vineflower/vineflower/issues with a copy of the class file (if you have the rights to distribute it!)
      // java.lang.RuntimeException: parsing failure!
      //   at org.jetbrains.java.decompiler.modules.decompiler.decompose.DomHelper.parseGraph(DomHelper.java:211)
      //   at org.jetbrains.java.decompiler.main.rels.MethodProcessor.codeToJava(MethodProcessor.java:166)
      //
      // Bytecode:
      // 00: getstatic qeaa361f143ee4a0894bd168fd9b30c66/qf4ccf8f5435d4a78bdca4d6a018b578e/aabbabbbb.bb J
      // 03: lconst_1
      // 04: ladd
      // 05: putstatic qeaa361f143ee4a0894bd168fd9b30c66/qf4ccf8f5435d4a78bdca4d6a018b578e/aabbabbbb.bb J
      // 08: getstatic qeaa361f143ee4a0894bd168fd9b30c66/qf4ccf8f5435d4a78bdca4d6a018b578e/baaabbaa.bba I
      // 0b: invokestatic qeaa361f143ee4a0894bd168fd9b30c66/qf4ccf8f5435d4a78bdca4d6a018b578e/aabaaa.abbbaa ()J
      // 0e: putstatic qeaa361f143ee4a0894bd168fd9b30c66/qf4ccf8f5435d4a78bdca4d6a018b578e/aabbabbbb.aaa J
      // 11: bipush 1
      // 12: putstatic qeaa361f143ee4a0894bd168fd9b30c66/qf4ccf8f5435d4a78bdca4d6a018b578e/aabbabbbb.baba Z
      // 15: istore 0
      // 16: invokestatic net/minecraft/class_310.method_1551 ()Lnet/minecraft/class_310;
      // 19: astore 1
      // 1a: aload 1
      // 1b: iload 0
      // 1c: ifne 27
      // 1f: ifnull 49
      // 22: goto 26
      // 25: athrow
      // 26: aload 1
      // 27: iload 0
      // 28: ifne 40
      // 2b: getfield net/minecraft/class_310.field_1724 Lnet/minecraft/class_746;
      // 2e: ifnull 49
      // 31: goto 35
      // 34: athrow
      // 35: getstatic qeaa361f143ee4a0894bd168fd9b30c66/qf4ccf8f5435d4a78bdca4d6a018b578e/aabbabbbb.babab J
      // 38: putstatic qeaa361f143ee4a0894bd168fd9b30c66/qf4ccf8f5435d4a78bdca4d6a018b578e/aabbabbbb.ababb J
      // 3b: aload 1
      // 3c: goto 40
      // 3f: athrow
      // 40: getfield net/minecraft/class_310.field_1724 Lnet/minecraft/class_746;
      // 43: invokestatic java/lang/System.identityHashCode (Ljava/lang/Object;)I
      // 46: putstatic qeaa361f143ee4a0894bd168fd9b30c66/qf4ccf8f5435d4a78bdca4d6a018b578e/aabbabbbb.abaaa I
      // 49: return
   }

   public static void bbaaabb(class_310 param0, Object param1, abbaaabba param2) {
      // $VF: Couldn't be decompiled
      // Please report this to the Vineflower issue tracker, at https://github.com/Vineflower/vineflower/issues with a copy of the class file (if you have the rights to distribute it!)
      // java.lang.RuntimeException: parsing failure!
      //   at org.jetbrains.java.decompiler.modules.decompiler.decompose.DomHelper.parseGraph(DomHelper.java:211)
      //   at org.jetbrains.java.decompiler.main.rels.MethodProcessor.codeToJava(MethodProcessor.java:166)
      //
      // Bytecode:
      // 000: getstatic qeaa361f143ee4a0894bd168fd9b30c66/qf4ccf8f5435d4a78bdca4d6a018b578e/baaabbaa.bba I
      // 003: istore 3
      // 004: aload 0
      // 005: iload 3
      // 006: ifne 011
      // 009: ifnull 11f
      // 00c: goto 010
      // 00f: athrow
      // 010: aload 0
      // 011: iload 3
      // 012: ifne 024
      // 015: getfield net/minecraft/class_310.field_1724 Lnet/minecraft/class_746;
      // 018: ifnull 11f
      // 01b: goto 01f
      // 01e: athrow
      // 01f: aload 1
      // 020: goto 024
      // 023: athrow
      // 024: iload 3
      // 025: ifne 032
      // 028: ifnull 11f
      // 02b: goto 02f
      // 02e: athrow
      // 02f: getstatic qeaa361f143ee4a0894bd168fd9b30c66/qf4ccf8f5435d4a78bdca4d6a018b578e/aabbabbbb.ababa Ljava/lang/Object;
      // 032: aload 1
      // 033: if_acmpne 03e
      // 036: aconst_null
      // 037: putstatic qeaa361f143ee4a0894bd168fd9b30c66/qf4ccf8f5435d4a78bdca4d6a018b578e/aabbabbbb.ababa Ljava/lang/Object;
      // 03a: goto 03e
      // 03d: athrow
      // 03e: aload 2
      // 03f: iload 3
      // 040: ifne 04d
      // 043: ifnonnull 050
      // 046: goto 04a
      // 049: athrow
      // 04a: getstatic qeaa361f143ee4a0894bd168fd9b30c66/qf4ccf8f5435d4a78bdca4d6a018b578e/abbaaabba.aba Lqeaa361f143ee4a0894bd168fd9b30c66/qf4ccf8f5435d4a78bdca4d6a018b578e/abbaaabba;
      // 04d: goto 051
      // 050: aload 2
      // 051: astore 4
      // 053: getstatic qeaa361f143ee4a0894bd168fd9b30c66/qf4ccf8f5435d4a78bdca4d6a018b578e/aabbabbbb.baab Lqeaa361f143ee4a0894bd168fd9b30c66/qf4ccf8f5435d4a78bdca4d6a018b578e/bbaaba;
      // 056: astore 5
      // 058: aload 5
      // 05a: iload 3
      // 05b: ifne 071
      // 05e: ifnull 08b
      // 061: goto 065
      // 064: athrow
      // 065: aload 5
      // 067: invokevirtual qeaa361f143ee4a0894bd168fd9b30c66/qf4ccf8f5435d4a78bdca4d6a018b578e/bbaaba.aa ()Lqeaa361f143ee4a0894bd168fd9b30c66/qf4ccf8f5435d4a78bdca4d6a018b578e/abaabbba;
      // 06a: invokevirtual qeaa361f143ee4a0894bd168fd9b30c66/qf4ccf8f5435d4a78bdca4d6a018b578e/abaabbba.a ()Ljava/lang/Object;
      // 06d: goto 071
      // 070: athrow
      // 071: aload 1
      // 072: if_acmpne 08b
      // 075: aload 4
      // 077: getstatic qeaa361f143ee4a0894bd168fd9b30c66/qf4ccf8f5435d4a78bdca4d6a018b578e/abbaaabba.aba Lqeaa361f143ee4a0894bd168fd9b30c66/qf4ccf8f5435d4a78bdca4d6a018b578e/abbaaabba;
      // 07a: if_acmpne 083
      // 07d: goto 081
      // 080: athrow
      // 081: return
      // 082: athrow
      // 083: aconst_null
      // 084: putstatic qeaa361f143ee4a0894bd168fd9b30c66/qf4ccf8f5435d4a78bdca4d6a018b578e/aabbabbbb.baab Lqeaa361f143ee4a0894bd168fd9b30c66/qf4ccf8f5435d4a78bdca4d6a018b578e/bbaaba;
      // 087: bipush 0
      // 088: putstatic qeaa361f143ee4a0894bd168fd9b30c66/qf4ccf8f5435d4a78bdca4d6a018b578e/aabbabbbb.aabaa Z
      // 08b: aload 4
      // 08d: getstatic qeaa361f143ee4a0894bd168fd9b30c66/qf4ccf8f5435d4a78bdca4d6a018b578e/abbaaabba.ab Lqeaa361f143ee4a0894bd168fd9b30c66/qf4ccf8f5435d4a78bdca4d6a018b578e/abbaaabba;
      // 090: if_acmpne 0ba
      // 093: getstatic qeaa361f143ee4a0894bd168fd9b30c66/qf4ccf8f5435d4a78bdca4d6a018b578e/aabbabbbb.aba Lqeaa361f143ee4a0894bd168fd9b30c66/qf4ccf8f5435d4a78bdca4d6a018b578e/abaaabaa;
      // 096: iload 3
      // 097: ifne 0b3
      // 09a: goto 09e
      // 09d: athrow
      // 09e: aload 1
      // 09f: invokevirtual qeaa361f143ee4a0894bd168fd9b30c66/qf4ccf8f5435d4a78bdca4d6a018b578e/abaaabaa.abb (Ljava/lang/Object;)Lqeaa361f143ee4a0894bd168fd9b30c66/qf4ccf8f5435d4a78bdca4d6a018b578e/bbbabbab;
      // 0a2: getstatic qeaa361f143ee4a0894bd168fd9b30c66/qf4ccf8f5435d4a78bdca4d6a018b578e/bbbabbab.b Lqeaa361f143ee4a0894bd168fd9b30c66/qf4ccf8f5435d4a78bdca4d6a018b578e/bbbabbab;
      // 0a5: if_acmpne 0ba
      // 0a8: goto 0ac
      // 0ab: athrow
      // 0ac: getstatic qeaa361f143ee4a0894bd168fd9b30c66/qf4ccf8f5435d4a78bdca4d6a018b578e/aabbabbbb.aba Lqeaa361f143ee4a0894bd168fd9b30c66/qf4ccf8f5435d4a78bdca4d6a018b578e/abaaabaa;
      // 0af: goto 0b3
      // 0b2: athrow
      // 0b3: aload 1
      // 0b4: invokevirtual qeaa361f143ee4a0894bd168fd9b30c66/qf4ccf8f5435d4a78bdca4d6a018b578e/abaaabaa.a (Ljava/lang/Object;)I
      // 0b7: goto 0bb
      // 0ba: bipush -1
      // 0bb: istore 6
      // 0bd: getstatic qeaa361f143ee4a0894bd168fd9b30c66/qf4ccf8f5435d4a78bdca4d6a018b578e/aabbabbbb.aba Lqeaa361f143ee4a0894bd168fd9b30c66/qf4ccf8f5435d4a78bdca4d6a018b578e/abaaabaa;
      // 0c0: new qeaa361f143ee4a0894bd168fd9b30c66/qf4ccf8f5435d4a78bdca4d6a018b578e/aaaababaa
      // 0c3: dup
      // 0c4: aload 0
      // 0c5: invokespecial qeaa361f143ee4a0894bd168fd9b30c66/qf4ccf8f5435d4a78bdca4d6a018b578e/aaaababaa.<init> (Lnet/minecraft/class_310;)V
      // 0c8: aload 1
      // 0c9: aload 4
      // 0cb: invokevirtual qeaa361f143ee4a0894bd168fd9b30c66/qf4ccf8f5435d4a78bdca4d6a018b578e/abaaabaa.aaaaa (Lqeaa361f143ee4a0894bd168fd9b30c66/qf4ccf8f5435d4a78bdca4d6a018b578e/abbbaaa;Ljava/lang/Object;Lqeaa361f143ee4a0894bd168fd9b30c66/qf4ccf8f5435d4a78bdca4d6a018b578e/abbaaabba;)V
      // 0ce: iload 6
      // 0d0: iload 3
      // 0d1: ifne 0dd
      // 0d4: iflt 11f
      // 0d7: goto 0db
      // 0da: athrow
      // 0db: iload 6
      // 0dd: ldc_w 604047124
      // 0e0: ldc_w 340851506
      // 0e3: ldc_w 11812054
      // 0e6: ixor
      // 0e7: invokestatic qeaa361f143ee4a0894bd168fd9b30c66/qf4ccf8f5435d4a78bdca4d6a018b578e/aabbabbbb.b (II)I
      // 0ea: ldc2_w 1131576471880749436
      // 0ed: invokestatic qeaa361f143ee4a0894bd168fd9b30c66/qf4ccf8f5435d4a78bdca4d6a018b578e/aabbabbbb.aaaaa (IJ)I
      // 0f0: if_icmpge 11f
      // 0f3: aload 0
      // 0f4: iload 3
      // 0f5: ifne 117
      // 0f8: goto 0fc
      // 0fb: athrow
      // 0fc: getfield net/minecraft/class_310.field_1724 Lnet/minecraft/class_746;
      // 0ff: invokevirtual net/minecraft/class_746.method_31548 ()Lnet/minecraft/class_1661;
      // 102: iload 6
      // 104: invokestatic qeaa361f143ee4a0894bd168fd9b30c66/qf4ccf8f5435d4a78bdca4d6a018b578e/bbbabaa.aba (Lnet/minecraft/class_1661;I)V
      // 107: aload 0
      // 108: getfield net/minecraft/class_310.field_1761 Lnet/minecraft/class_636;
      // 10b: ifnull 11f
      // 10e: goto 112
      // 111: athrow
      // 112: aload 0
      // 113: goto 117
      // 116: athrow
      // 117: getfield net/minecraft/class_310.field_1761 Lnet/minecraft/class_636;
      // 11a: iload 6
      // 11c: invokestatic qeaa361f143ee4a0894bd168fd9b30c66/qf4ccf8f5435d4a78bdca4d6a018b578e/bbbabaa.bbab (Lnet/minecraft/class_636;I)V
      // 11f: return
   }

   private static String bbaabaa(int var0, int var1) {
      int var9 = 138695503;
      int var2 = (var0 ^ b(604047127, var9 ^ 747663850)) & b(604047126, var9 ^ -760457685);
      if (bbba[var2] == null) {
         char[] var3 = aaabaa[var2].toCharArray();

         int var4 = switch (var3[0] & b(604047081, var9 ^ -779884073)) {
            case 0 -> b(604047080, var9 ^ 1559847877);
            case 1 -> b(604047083, var9 ^ -1329628634);
            case 2 -> b(604047082, var9 ^ -1586343505);
            case 3 -> b(604047085, var9 ^ 536182016);
            case 4 -> b(604047084, var9 ^ 371417685);
            case 5 -> b(604047087, var9 ^ 583207601);
            case 6 -> b(604047086, var9 ^ -34985066);
            case 7 -> b(604047073, var9 ^ 1294809490);
            case 8 -> b(604047072, var9 ^ 1000948493);
            case 9 -> b(604047075, var9 ^ 425774906);
            case 10 -> b(604047074, var9 ^ -431197336);
            case 11 -> b(604047077, var9 ^ 130565411);
            case 12 -> b(604047076, var9 ^ 2114462358);
            case 13 -> b(604047079, var9 ^ -1628218370);
            case 14 -> b(604047078, var9 ^ 500898509);
            case 15 -> b(604047097, var9 ^ 27741535);
            case 16 -> b(604047096, var9 ^ 968901726);
            case 17 -> b(604047099, var9 ^ -1851016864);
            case 18 -> b(604047098, var9 ^ 1629183858);
            case 19 -> b(604047101, var9 ^ 1739192951);
            case 20 -> b(604047100, var9 ^ -1364833621);
            case 21 -> b(604047103, var9 ^ 632351497);
            case 22 -> b(604047102, var9 ^ -1688610275);
            case 23 -> b(604047089, var9 ^ 765781849);
            case 24 -> b(604047088, var9 ^ 1935290427);
            case 25 -> b(604047091, var9 ^ -1557709654);
            case 26 -> b(604047090, var9 ^ 802835288);
            case 27 -> b(604047093, var9 ^ 1604616749);
            case 28 -> b(604047092, var9 ^ -1121054784);
            case 29 -> b(604047095, var9 ^ -587277717);
            case 30 -> 5;
            case 31 -> b(604047094, var9 ^ -453074262);
            case 32 -> b(604047049, var9 ^ -893730495);
            case 33 -> b(604047048, var9 ^ -883366952);
            case 34 -> b(604047051, var9 ^ -774627181);
            case 35 -> b(604047050, var9 ^ 779190519);
            case 36 -> b(604047053, var9 ^ 748051707);
            case 37 -> b(604047052, var9 ^ -728525281);
            case 38 -> b(604047055, var9 ^ 1282703396);
            case 39 -> b(604047054, var9 ^ 836857640);
            case 40 -> 3;
            case 41 -> b(604047041, var9 ^ -1143031242);
            case 42 -> b(604047040, var9 ^ 1614022609);
            case 43 -> b(604047043, var9 ^ -1357494246);
            case 44 -> b(604047042, var9 ^ -1460562156);
            case 45 -> b(604047045, var9 ^ -761927426);
            case 46 -> b(604047044, var9 ^ 594365709);
            case 47 -> b(604047047, var9 ^ 177364865);
            case 48 -> b(604047046, var9 ^ 550520258);
            case 49 -> b(604047065, var9 ^ -1430119178);
            case 50 -> b(604047064, var9 ^ -314532798);
            case 51 -> b(604047067, var9 ^ -1409703336);
            case 52 -> b(604047066, var9 ^ -1056396565);
            case 53 -> b(604047069, var9 ^ -2106062339);
            case 54 -> b(604047068, var9 ^ -605354282);
            case 55 -> 4;
            case 56 -> b(604047071, var9 ^ 932347302);
            case 57 -> b(604047070, var9 ^ 1482927096);
            case 58 -> b(604047057, var9 ^ -1339135168);
            case 59 -> b(604047056, var9 ^ 1767884847);
            case 60 -> b(604047059, var9 ^ -837524190);
            case 61 -> b(604047058, var9 ^ 439583893);
            case 62 -> b(604047061, var9 ^ 1025112374);
            case 63 -> b(604047060, var9 ^ 957445026);
            case 64 -> b(604047063, var9 ^ -158305729);
            case 65 -> b(604047062, var9 ^ -542404743);
            case 66 -> b(604047017, var9 ^ 2078219354);
            case 67 -> b(604047016, var9 ^ -56429965);
            case 68 -> b(604047019, var9 ^ 819816172);
            case 69 -> b(604047018, var9 ^ 1551775137);
            case 70 -> b(604047021, var9 ^ -1268001870);
            case 71 -> b(604047020, var9 ^ 1710564708);
            case 72 -> b(604047023, var9 ^ 1954965871);
            case 73 -> b(604047022, var9 ^ 1958622962);
            case 74 -> b(604047009, var9 ^ -1474325439);
            case 75 -> b(604047008, var9 ^ 671218628);
            case 76 -> b(604047011, var9 ^ 1470522623);
            case 77 -> b(604047010, var9 ^ 87539762);
            case 78 -> b(604047013, var9 ^ -1689426182);
            case 79 -> b(604047012, var9 ^ 2047104639);
            case 80 -> b(604047015, var9 ^ -1268575839);
            case 81 -> b(604047014, var9 ^ 2114905771);
            case 82 -> b(604047033, var9 ^ -1637707586);
            case 83 -> b(604047032, var9 ^ 324899124);
            case 84 -> b(604047035, var9 ^ -807443836);
            case 85 -> b(604047034, var9 ^ -299294233);
            case 86 -> b(604047037, var9 ^ 152137751);
            case 87 -> b(604047036, var9 ^ -947623741);
            case 88 -> b(604047039, var9 ^ 776221751);
            case 89 -> b(604047038, var9 ^ -1588671093);
            case 90 -> b(604047025, var9 ^ -1878093656);
            case 91 -> b(604047024, var9 ^ -374194282);
            case 92 -> b(604047027, var9 ^ -996313312);
            case 93 -> b(604047026, var9 ^ 683940925);
            case 94 -> b(604047029, var9 ^ 1058497380);
            case 95 -> b(604047028, var9 ^ -695336220);
            case 96 -> b(604047031, var9 ^ 625808800);
            case 97 -> b(604047030, var9 ^ 1131474139);
            case 98 -> b(604046985, var9 ^ -114692067);
            case 99 -> b(604046984, var9 ^ 1832077559);
            case 100 -> b(604046987, var9 ^ 441950394);
            case 101 -> b(604046986, var9 ^ 1099023190);
            case 102 -> b(604046989, var9 ^ 1532467275);
            case 103 -> 1;
            case 104 -> b(604046988, var9 ^ -434838301);
            case 105 -> b(604046991, var9 ^ 1406444521);
            case 106 -> b(604046990, var9 ^ -1603961201);
            case 107 -> b(604046977, var9 ^ 1592515714);
            case 108 -> b(604046976, var9 ^ -542865049);
            case 109 -> b(604046979, var9 ^ 866231123);
            case 110 -> b(604046978, var9 ^ 1823647005);
            case 111 -> b(604046981, var9 ^ 184914228);
            case 112 -> b(604046980, var9 ^ 101845033);
            case 113 -> b(604046983, var9 ^ 505391245);
            case 114 -> b(604046982, var9 ^ -132394157);
            case 115 -> b(604047001, var9 ^ -572307407);
            case 116 -> b(604047000, var9 ^ 1597992614);
            case 117 -> b(604047003, var9 ^ 1938295410);
            case 118 -> b(604047002, var9 ^ 1781955820);
            case 119 -> b(604047005, var9 ^ -1911136676);
            case 120 -> b(604047004, var9 ^ 1293999648);
            case 121 -> b(604047007, var9 ^ 440024916);
            case 122 -> b(604047006, var9 ^ -1436326150);
            case 123 -> b(604046993, var9 ^ -1189035376);
            case 124 -> b(604046992, var9 ^ -307975110);
            case 125 -> b(604046995, var9 ^ 266611262);
            case 126 -> b(604046994, var9 ^ -154235202);
            case 127 -> b(604046997, var9 ^ 1765261063);
            case 128 -> b(604046996, var9 ^ -1182096830);
            case 129 -> b(604046999, var9 ^ 2125255643);
            case 130 -> b(604046998, var9 ^ 930875844);
            case 131 -> b(604046953, var9 ^ 724492556);
            case 132 -> b(604046952, var9 ^ 229795142);
            case 133 -> b(604046955, var9 ^ 1086078241);
            case 134 -> b(604046954, var9 ^ -909114281);
            case 135 -> b(604046957, var9 ^ 1439282912);
            case 136 -> b(604046956, var9 ^ -2060893146);
            case 137 -> b(604046959, var9 ^ 1551743070);
            case 138 -> b(604046958, var9 ^ -1504091490);
            case 139 -> b(604046945, var9 ^ -1043678701);
            case 140 -> b(604046944, var9 ^ 1412008996);
            case 141 -> b(604046947, var9 ^ 1650462845);
            case 142 -> b(604046946, var9 ^ 2050278492);
            case 143 -> b(604046949, var9 ^ -1038273075);
            case 144 -> b(604046948, var9 ^ -233301485);
            case 145 -> b(604046951, var9 ^ 722252504);
            case 146 -> b(604046950, var9 ^ -1053584412);
            case 147 -> b(604046969, var9 ^ -102181429);
            case 148 -> b(604046968, var9 ^ -1362639457);
            case 149 -> b(604046971, var9 ^ -1958869959);
            case 150 -> b(604046970, var9 ^ 1898551289);
            case 151 -> b(604046973, var9 ^ -1731916170);
            case 152 -> b(604046972, var9 ^ -540415050);
            case 153 -> b(604046975, var9 ^ 682026925);
            case 154 -> b(604046974, var9 ^ 729478488);
            case 155 -> b(604046961, var9 ^ -361245406);
            case 156 -> b(604046960, var9 ^ -344496340);
            case 157 -> b(604046963, var9 ^ -498576656);
            case 158 -> b(604046962, var9 ^ 552451859);
            case 159 -> b(604046965, var9 ^ -1944311970);
            case 160 -> b(604046964, var9 ^ -1151875027);
            case 161 -> b(604046967, var9 ^ -376890407);
            case 162 -> b(604046966, var9 ^ 121456024);
            case 163 -> b(604046921, var9 ^ -1887218277);
            case 164 -> b(604046920, var9 ^ -1898883082);
            case 165 -> b(604046923, var9 ^ 1029104529);
            case 166 -> b(604046922, var9 ^ -2027655205);
            case 167 -> b(604046925, var9 ^ -2007590305);
            case 168 -> b(604046924, var9 ^ 2075743042);
            case 169 -> b(604046927, var9 ^ 1349176112);
            case 170 -> b(604046926, var9 ^ -963207812);
            case 171 -> b(604046913, var9 ^ 1998114707);
            case 172 -> b(604046912, var9 ^ 829213214);
            case 173 -> b(604046915, var9 ^ 561098823);
            case 174 -> b(604046914, var9 ^ 905031821);
            case 175 -> b(604046917, var9 ^ -554086438);
            case 176 -> b(604046916, var9 ^ -1591461483);
            case 177 -> b(604046919, var9 ^ 1005223438);
            case 178 -> b(604046918, var9 ^ -897465777);
            case 179 -> b(604046937, var9 ^ 1722419043);
            case 180 -> b(604046936, var9 ^ -470085598);
            case 181 -> b(604046939, var9 ^ 180699259);
            case 182 -> b(604046938, var9 ^ 873683533);
            case 183 -> b(604046941, var9 ^ -1352569222);
            case 184 -> b(604046940, var9 ^ 136859201);
            case 185 -> b(604046943, var9 ^ 1981718781);
            case 186 -> b(604046942, var9 ^ 584967694);
            case 187 -> b(604046929, var9 ^ -1760741245);
            case 188 -> b(604046928, var9 ^ 1033362647);
            case 189 -> b(604046931, var9 ^ -811676808);
            case 190 -> b(604046930, var9 ^ 491155456);
            case 191 -> b(604046933, var9 ^ -972510824);
            case 192 -> b(604046932, var9 ^ 529867641);
            case 193 -> b(604046935, var9 ^ -1417963196);
            case 194 -> b(604046934, var9 ^ 1842068778);
            case 195 -> b(604046889, var9 ^ -250081812);
            case 196 -> b(604046888, var9 ^ 2051209239);
            case 197 -> b(604046891, var9 ^ 1816043688);
            case 198 -> b(604046890, var9 ^ -615789199);
            case 199 -> b(604046893, var9 ^ -245779979);
            case 200 -> b(604046892, var9 ^ 568975503);
            case 201 -> b(604046895, var9 ^ -865187639);
            case 202 -> b(604046894, var9 ^ -726279834);
            case 203 -> b(604046881, var9 ^ -758410599);
            case 204 -> b(604046880, var9 ^ -241387233);
            case 205 -> b(604046883, var9 ^ 1036072513);
            case 206 -> b(604046882, var9 ^ -1956752889);
            case 207 -> b(604046885, var9 ^ 1251779053);
            case 208 -> b(604046884, var9 ^ -1825395201);
            case 209 -> b(604046887, var9 ^ -1521558774);
            case 210 -> b(604046886, var9 ^ -810931850);
            case 211 -> b(604046905, var9 ^ -1617225700);
            case 212 -> b(604046904, var9 ^ -1506118308);
            case 213 -> b(604046907, var9 ^ -1674870077);
            case 214 -> b(604046906, var9 ^ 86480307);
            case 215 -> b(604046909, var9 ^ -190871215);
            case 216 -> b(604046908, var9 ^ 1419701986);
            case 217 -> b(604046911, var9 ^ 2129998380);
            case 218 -> b(604046910, var9 ^ -1297834742);
            case 219 -> b(604046897, var9 ^ -788692962);
            case 220 -> b(604046896, var9 ^ 178024077);
            case 221 -> b(604046899, var9 ^ -2025169711);
            case 222 -> 0;
            case 223 -> b(604046898, var9 ^ -1825948406);
            case 224 -> b(604046901, var9 ^ -1319271959);
            case 225 -> b(604046900, var9 ^ 1586328242);
            case 226 -> b(604046903, var9 ^ -195236770);
            case 227 -> b(604046902, var9 ^ 254661594);
            case 228 -> b(604046857, var9 ^ 1024054576);
            case 229 -> b(604046856, var9 ^ 1919761422);
            case 230 -> b(604046859, var9 ^ -2143250874);
            case 231 -> b(604046858, var9 ^ 944810681);
            case 232 -> b(604046861, var9 ^ 1054314781);
            case 233 -> b(604046860, var9 ^ -150249164);
            case 234 -> b(604046863, var9 ^ 460309050);
            case 235 -> b(604046862, var9 ^ 1689006626);
            case 236 -> b(604046849, var9 ^ -1268475860);
            case 237 -> b(604046848, var9 ^ 604705380);
            case 238 -> b(604046851, var9 ^ 599120025);
            case 239 -> b(604046850, var9 ^ 674785171);
            case 240 -> b(604046853, var9 ^ 261525797);
            case 241 -> b(604046852, var9 ^ 1706409593);
            case 242 -> b(604046855, var9 ^ -290623427);
            case 243 -> b(604046854, var9 ^ -728673658);
            case 244 -> b(604046873, var9 ^ -147034146);
            case 245 -> b(604046872, var9 ^ 459519537);
            case 246 -> b(604046875, var9 ^ -534583886);
            case 247 -> b(604046874, var9 ^ 438953504);
            case 248 -> b(604046877, var9 ^ 2104948115);
            case 249 -> 2;
            case 250 -> b(604046876, var9 ^ -1625699594);
            case 251 -> b(604046879, var9 ^ 599457687);
            case 252 -> b(604046878, var9 ^ 572301638);
            case 253 -> b(604046865, var9 ^ 165375184);
            case 254 -> b(604046864, var9 ^ -938248361);
            default -> b(604046867, var9 ^ 1670180478);
         };
         int var5 = (var1 & b(604046866, var9 ^ 951704234)) - var4;
         if (var5 < 0) {
            var5 += 256;
         }

         int var6 = ((var1 & b(604046869, var9 ^ -2033771732)) >>> b(604046868, var9 ^ -85927259)) - var4;
         if (var6 < 0) {
            var6 += 256;
         }

         for (int var7 = 0; var7 < var3.length; var7++) {
            int var8 = var7 % 2;
            char var10002 = var3[var7];
            if (var8 == 0) {
               var3[var7] = (char)(var10002 ^ var5);
               var5 = ((var5 >>> 3 | var5 << 5) ^ var3[var7]) & b(604046871, var9 ^ 931406232);
            } else {
               var3[var7] = (char)(var10002 ^ var6);
               var6 = ((var6 >>> 3 | var6 << 5) ^ var3[var7]) & b(604046870, var9 ^ -698456022);
            }
         }

         bbba[var2] = new String(var3).intern();
      }

      return bbba[var2];
   }

   public static void bbaabab(class_310 param0) {
      // $VF: Couldn't be decompiled
      // Please report this to the Vineflower issue tracker, at https://github.com/Vineflower/vineflower/issues with a copy of the class file (if you have the rights to distribute it!)
      // java.lang.RuntimeException: parsing failure!
      //   at org.jetbrains.java.decompiler.modules.decompiler.decompose.DomHelper.parseGraph(DomHelper.java:211)
      //   at org.jetbrains.java.decompiler.main.rels.MethodProcessor.codeToJava(MethodProcessor.java:166)
      //
      // Bytecode:
      // 00: getstatic qeaa361f143ee4a0894bd168fd9b30c66/qf4ccf8f5435d4a78bdca4d6a018b578e/baaabbaa.bba I
      // 03: getstatic qeaa361f143ee4a0894bd168fd9b30c66/qf4ccf8f5435d4a78bdca4d6a018b578e/aabbabbbb.aaabba J
      // 06: lconst_1
      // 07: ladd
      // 08: putstatic qeaa361f143ee4a0894bd168fd9b30c66/qf4ccf8f5435d4a78bdca4d6a018b578e/aabbabbbb.aaabba J
      // 0b: istore 1
      // 0c: aload 0
      // 0d: invokestatic qeaa361f143ee4a0894bd168fd9b30c66/qf4ccf8f5435d4a78bdca4d6a018b578e/aabbabbbb.baaaba (Lnet/minecraft/class_310;)Z
      // 10: putstatic qeaa361f143ee4a0894bd168fd9b30c66/qf4ccf8f5435d4a78bdca4d6a018b578e/aabbabbbb.aaaba Z
      // 13: iload 1
      // 14: ifne 3f
      // 17: getstatic qeaa361f143ee4a0894bd168fd9b30c66/qf4ccf8f5435d4a78bdca4d6a018b578e/aabbabbbb.aaaba Z
      // 1a: ifeq 28
      // 1d: goto 21
      // 20: athrow
      // 21: invokestatic qeaa361f143ee4a0894bd168fd9b30c66/qf4ccf8f5435d4a78bdca4d6a018b578e/aabbabbbb.bba ()V
      // 24: goto 28
      // 27: athrow
      // 28: aload 0
      // 29: iload 1
      // 2a: ifne 4b
      // 2d: getstatic qeaa361f143ee4a0894bd168fd9b30c66/qf4ccf8f5435d4a78bdca4d6a018b578e/aaaaab.aba Lqeaa361f143ee4a0894bd168fd9b30c66/qf4ccf8f5435d4a78bdca4d6a018b578e/aaaaab;
      // 30: invokestatic qeaa361f143ee4a0894bd168fd9b30c66/qf4ccf8f5435d4a78bdca4d6a018b578e/aabbabbbb.aababbb (Lnet/minecraft/class_310;Lqeaa361f143ee4a0894bd168fd9b30c66/qf4ccf8f5435d4a78bdca4d6a018b578e/aaaaab;)V
      // 33: bipush 1
      // 34: putstatic qeaa361f143ee4a0894bd168fd9b30c66/qf4ccf8f5435d4a78bdca4d6a018b578e/aabbabbbb.babaa Z
      // 37: aload 0
      // 38: invokestatic qeaa361f143ee4a0894bd168fd9b30c66/qf4ccf8f5435d4a78bdca4d6a018b578e/aabbabbbb.aabaa (Lnet/minecraft/class_310;)V
      // 3b: goto 3f
      // 3e: athrow
      // 3f: aload 0
      // 40: invokestatic qeaa361f143ee4a0894bd168fd9b30c66/qf4ccf8f5435d4a78bdca4d6a018b578e/aabbabbbb.babbbab (Lnet/minecraft/class_310;)Z
      // 43: ifeq 4e
      // 46: aload 0
      // 47: goto 4b
      // 4a: athrow
      // 4b: invokestatic qeaa361f143ee4a0894bd168fd9b30c66/qf4ccf8f5435d4a78bdca4d6a018b578e/aabbabbbb.bababb (Lnet/minecraft/class_310;)V
      // 4e: return
   }

   private static boolean bbaabba(class_310 param0, int param1) {
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
      // 09: ifnull 4a
      // 0c: goto 10
      // 0f: athrow
      // 10: aload 0
      // 11: invokevirtual net/minecraft/class_310.method_22683 ()Lnet/minecraft/class_1041;
      // 14: ifnull 4a
      // 17: iload 1
      // 18: iload 2
      // 19: ifne 4f
      // 1c: goto 20
      // 1f: athrow
      // 20: iflt 4a
      // 23: goto 27
      // 26: athrow
      // 27: iload 1
      // 28: iload 2
      // 29: ifne 4f
      // 2c: goto 30
      // 2f: athrow
      // 30: ldc_w 604046825
      // 33: ldc_w -493966486
      // 36: ldc_w -1462113734
      // 39: ixor
      // 3a: invokestatic qeaa361f143ee4a0894bd168fd9b30c66/qf4ccf8f5435d4a78bdca4d6a018b578e/aabbabbbb.b (II)I
      // 3d: ldc2_w 3409951634026030513
      // 40: invokestatic qeaa361f143ee4a0894bd168fd9b30c66/qf4ccf8f5435d4a78bdca4d6a018b578e/aabbabbbb.aaaaa (IJ)I
      // 43: if_icmple 50
      // 46: goto 4a
      // 49: athrow
      // 4a: bipush 0
      // 4b: goto 4f
      // 4e: athrow
      // 4f: ireturn
      // 50: getstatic qeaa361f143ee4a0894bd168fd9b30c66/qf4ccf8f5435d4a78bdca4d6a018b578e/aabbabbbb.aababb Ljava/lang/reflect/Method;
      // 53: iload 2
      // 54: ifne 61
      // 57: ifnull a1
      // 5a: goto 5e
      // 5d: athrow
      // 5e: getstatic qeaa361f143ee4a0894bd168fd9b30c66/qf4ccf8f5435d4a78bdca4d6a018b578e/aabbabbbb.aababb Ljava/lang/reflect/Method;
      // 61: invokevirtual java/lang/reflect/Method.getParameterTypes ()[Ljava/lang/Class;
      // 64: bipush 0
      // 65: aaload
      // 66: astore 3
      // 67: aload 3
      // 68: getstatic java/lang/Long.TYPE Ljava/lang/Class;
      // 6b: if_acmpne 7c
      // 6e: aload 0
      // 6f: invokevirtual net/minecraft/class_310.method_22683 ()Lnet/minecraft/class_1041;
      // 72: invokevirtual net/minecraft/class_1041.method_4490 ()J
      // 75: invokestatic java/lang/Long.valueOf (J)Ljava/lang/Long;
      // 78: goto 80
      // 7b: athrow
      // 7c: aload 0
      // 7d: invokevirtual net/minecraft/class_310.method_22683 ()Lnet/minecraft/class_1041;
      // 80: astore 4
      // 82: getstatic qeaa361f143ee4a0894bd168fd9b30c66/qf4ccf8f5435d4a78bdca4d6a018b578e/aabbabbbb.aababb Ljava/lang/reflect/Method;
      // 85: aconst_null
      // 86: bipush 2
      // 87: anewarray 4
      // 8a: dup
      // 8b: bipush 0
      // 8c: aload 4
      // 8e: aastore
      // 8f: dup
      // 90: bipush 1
      // 91: iload 1
      // 92: invokestatic java/lang/Integer.valueOf (I)Ljava/lang/Integer;
      // 95: aastore
      // 96: invokevirtual java/lang/reflect/Method.invoke (Ljava/lang/Object;[Ljava/lang/Object;)Ljava/lang/Object;
      // 99: checkcast java/lang/Boolean
      // 9c: invokevirtual java/lang/Boolean.booleanValue ()Z
      // 9f: ireturn
      // a0: astore 3
      // a1: aload 0
      // a2: invokevirtual net/minecraft/class_310.method_22683 ()Lnet/minecraft/class_1041;
      // a5: invokevirtual net/minecraft/class_1041.method_4490 ()J
      // a8: iload 1
      // a9: invokestatic org/lwjgl/glfw/GLFW.glfwGetKey (JI)I
      // ac: iload 2
      // ad: ifne bd
      // b0: bipush 1
      // b1: if_icmpne c0
      // b4: goto b8
      // b7: athrow
      // b8: bipush 1
      // b9: goto bd
      // bc: athrow
      // bd: goto c1
      // c0: bipush 0
      // c1: ireturn
   }

   private static void bbaabbb(class_310 param0) {
      // $VF: Couldn't be decompiled
      // Please report this to the Vineflower issue tracker, at https://github.com/Vineflower/vineflower/issues with a copy of the class file (if you have the rights to distribute it!)
      // java.lang.RuntimeException: parsing failure!
      //   at org.jetbrains.java.decompiler.modules.decompiler.decompose.DomHelper.parseGraph(DomHelper.java:211)
      //   at org.jetbrains.java.decompiler.main.rels.MethodProcessor.codeToJava(MethodProcessor.java:166)
      //
      // Bytecode:
      // 00: getstatic qeaa361f143ee4a0894bd168fd9b30c66/qf4ccf8f5435d4a78bdca4d6a018b578e/baaabbaa.bba I
      // 03: invokestatic qeaa361f143ee4a0894bd168fd9b30c66/qf4ccf8f5435d4a78bdca4d6a018b578e/abaaaaaba.aaaaa ()Lqeaa361f143ee4a0894bd168fd9b30c66/qf4ccf8f5435d4a78bdca4d6a018b578e/abaaaaaba;
      // 06: astore 2
      // 07: istore 1
      // 08: aload 2
      // 09: iload 1
      // 0a: ifne 15
      // 0d: ifnull 23
      // 10: goto 14
      // 13: athrow
      // 14: aload 2
      // 15: iload 1
      // 16: ifne 26
      // 19: invokevirtual qeaa361f143ee4a0894bd168fd9b30c66/qf4ccf8f5435d4a78bdca4d6a018b578e/abaaaaaba.aaba ()Lqeaa361f143ee4a0894bd168fd9b30c66/qf4ccf8f5435d4a78bdca4d6a018b578e/babbaba;
      // 1c: ifnonnull 25
      // 1f: goto 23
      // 22: athrow
      // 23: return
      // 24: athrow
      // 25: aload 2
      // 26: invokevirtual qeaa361f143ee4a0894bd168fd9b30c66/qf4ccf8f5435d4a78bdca4d6a018b578e/abaaaaaba.aaba ()Lqeaa361f143ee4a0894bd168fd9b30c66/qf4ccf8f5435d4a78bdca4d6a018b578e/babbaba;
      // 29: invokevirtual qeaa361f143ee4a0894bd168fd9b30c66/qf4ccf8f5435d4a78bdca4d6a018b578e/babbaba.bbbbb ()Lqeaa361f143ee4a0894bd168fd9b30c66/qf4ccf8f5435d4a78bdca4d6a018b578e/baaabbb;
      // 2c: astore 3
      // 2d: aload 3
      // 2e: iload 1
      // 2f: ifne 3a
      // 32: ifnull 65
      // 35: goto 39
      // 38: athrow
      // 39: aload 3
      // 3a: iload 1
      // 3b: ifne 4d
      // 3e: invokevirtual qeaa361f143ee4a0894bd168fd9b30c66/qf4ccf8f5435d4a78bdca4d6a018b578e/baaabbb.babbaab ()Z
      // 41: ifeq 65
      // 44: goto 48
      // 47: athrow
      // 48: aload 3
      // 49: goto 4d
      // 4c: athrow
      // 4d: iload 1
      // 4e: ifne 60
      // 51: invokevirtual qeaa361f143ee4a0894bd168fd9b30c66/qf4ccf8f5435d4a78bdca4d6a018b578e/baaabbb.baaaaba ()Z
      // 54: ifeq 65
      // 57: goto 5b
      // 5a: athrow
      // 5b: aload 3
      // 5c: goto 60
      // 5f: athrow
      // 60: aload 0
      // 61: invokevirtual qeaa361f143ee4a0894bd168fd9b30c66/qf4ccf8f5435d4a78bdca4d6a018b578e/baaabbb.abbb (Lnet/minecraft/class_310;)Z
      // 64: pop
      // 65: return
   }

   public static void bbabaaa(class_310 var0, int var1) {
      aabb(var0, var1, false);
   }

   static {
      // $VF: Couldn't be decompiled
      // Please report this to the Vineflower issue tracker, at https://github.com/Vineflower/vineflower/issues with a copy of the class file (if you have the rights to distribute it!)
      // java.lang.RuntimeException: parsing failure!
      //   at org.jetbrains.java.decompiler.modules.decompiler.decompose.DomHelper.parseGraph(DomHelper.java:211)
      //   at org.jetbrains.java.decompiler.main.rels.MethodProcessor.codeToJava(MethodProcessor.java:166)
      //
      // Bytecode:
      // 000: ldc_w 1489377738
      // 003: istore 60
      // 005: ldc_w "ִ\u001dÐ\n\u0010\n\u0010\n"
      // 008: invokevirtual java/lang/String.toCharArray ()[C
      // 00b: astore 51
      // 00d: ldc_w "菹茳茾菣茸荑莈荤莏莃菅茻茻菽荺莇茉菵菣莎莎茆莽莨荆菊荥荝莇荳药茇菙茳荐菳荣菥菰荫菅莴莮莉莹荽莞荨莔莙菢茹菙莙莗茦荁莂莧莭茑荝莑菭莁茉菀荺莤華荫荆菦菒莮菡茊莧茺荶莁荮莫茡茊菖草菲茜菚菕荁菟茊茤莍荎茓茐荮茝茉莄荫荚荞菓荋茵菩荠茉莝茅茏茶茅菄茕莂華莑茉莁茎获菬茝菽菿莵菒茴菱菧草荺菗茥茩菀荤荣菔茘荓荿菶莍茕莧茭莝菐茚莪莘莵荂莮菕莟荆菴茉茪茹茤菶莭荱莊菟荄莽荦莞茹莗莁菵莄莋茏茊茱莚菼荞茺茵荸茭莿茸莑荺菐莧莽茱菣荺茱茊莊莿荥莛莮莥菞荂菳茫菅莙莍荂菬荀荆茽菧荠荿茂茲荩荌茏莯荲莺茄茂茂菭莐荜茾荀菜茦菱菥茵茉荱茦荗茕菈菧荘菮艤艢舀舳苈舵芪芕芔芢芈芦苯舱艕舐舑艃艼芊艘船艵舾苳舿芬舦舠艚芴苆苶芈艹芉苌若苐舵芗艃艤舵芹艴苎艽英芷艳舂芡芼苪舒苨艎苙苟芜苂苇苪苘苒舢艻艣苇艄艅艀艥苆舛舁苂舘艧芿芁艑舕芛艔芖芊芮舸芜艦芧艏苜艿芻苦舝舊苮苀舦苛芦芁艠苆苤與舍艱芇苢艔芬芌艕舼芸艒舁苴苣舤苔芖舩艽苑芤芉艮舰舺苜苉芆艨苂苄芟苛舛花與舣苞芚舤舵苮芮苫舵舳舸舢舱艆舮芴艣與节舉苞苻苲艪艮舠节芊芝艙苠苐芶芼芯舩舄芞舃苤艋芛艌英舄般苦艑芎艜艦艖苿芰苝舌芍艎芕舘芒舔苅舯舕芮芈艩节若舅芞色艏苫芄芫艕芀花舓舱舁舤芞芺舖苟苬舻艒芁苅苅舴艦芄芸艗艐节艨芀舜芜舵舾芿艶興腡膹脪臋脘臣膭脋膉膞膇膭臅臺腜腠膚臨膇腪脫脛膰臛脀腄脫臷膎臲膙膱腍脲臛膜膦脠臼脳膇脈腹膚腱脦膗脏膥臋膅腩腸腉腺脽臛臠腡膃膢腈膢腴膩臀脮臑臮膃腿脖脶脞脌腢臊脃腛膾脧膾臮臸腨臲臃脣臇膯臛腰脶腋臬膄臛膬臅膵腎臎膇膍臛膽臬臶膏腡臰腝脉腢脥臡腽臮脯腈脌膧膔膙臗膏臌腐腆臊膋脽脈腾腺脁膴膣膎臑臶脱臨腘膅臈膛膊臗脅腾臄腶膓脚臑脹脰膹臶腤腔腮脫腦脤脘臵臁脩膴膝膡脡臺腔腖脆臀膁膿脆膌腰腎臲臋脏膏腰腣脫脾腀膹膤膏膲膚脋腱腚脹膇腻脺臊脹腶臌自膌膼腷臶脻腰臒腧臙腙臰腖腄脗臱膶腖脣膚脟臞腧脜膉腙脄脾脕腒臠膣脩脜臙腂腝腮腙膵腓脴臩腯膹膬肿耐聞胭耔肣耯聚胯肅肚肈聎聊耫肰聅肌耑肢耛聯聘胈胝肨耣聆胥胇肌耘耾胭胯肬耰聤肜耆聼聫胒胝肃耋职肏肛肸聸聤耞聍聅聟聦聍耇能聙肬肑肊肍胴而聓聆肅胻耞胦肐肮胏肯肾耾胦肛胨耓胦聥肞股耯胇聰聂肇肗肧胉胤胊肂胬耸肅耪肕聻聜耟胭聤耮耦肚聤耽肵肀肚胝肪耧肝肎肛肙肶耇耽肏者聜胶胸聯耶肛胝耑胲肆耣耐胆肿耵肓耰聴耆耠肌耠肣胦胙耾肧耛職胁耤耝聖聉肙肃肅肩耖聄肕聏肰胨胼耑耾肓聯聣聏耯耯胗肯胀胇肴聝聢胄胀胶肀耽肏聬胷肯耮聄耛肊聭聱聍肊肐肭耶職耥肌胏胟胢肷胂胫耱胵胁肏耯肘肾聅聞聞耻胻胂耱胷肦胎能胺者胳聻聹肪胳耨职耨联胍肮聮耫耋肦耮肏肞胹蜍蜶蝀蝺蝚蟙蟵蟀蝳螝蟆螕蝽蝻蜨螜蟐蝭蟻蜙蝦蜸蝛蝤蜱蝆蟄螯蟆蜖蝮螥蟯螂蜭蝛蝏蟲蝽螂蟉螡蜑蟔蟢蝓蟓蟩螡蟩蟍螁蜭蜢蟋螛螙蝿蟰螱蜸蟦蜸螸蜌蝢蜊蟺螂蟪蝵螼蟉蟺蝉蜹螡蟸蝾蝅蟞蝉蟱蝫螱蜻蟶蟤蝣蜃蟮螱蝫蜙螡蟄蝭蟤蝚蜫蟡蝐蟐螶蜬螛螢蜰蜂螆蝚蝌蟐蜰螷蜉蜨蜩蜯蜧蟚螋螠蝫蝕蜫蜭蟻蟙蜀蜚蜳螅蜖螏蝊蟜蜏螪螿蝟螴螒蜱螹蟑蟬螸蟨螆蝒蝲螱螖蟑蟸蝥螻融螀蜤蜦蝝蜦螤螫蝖螅蜠蟻蟒螕蟕蜝蜉螶蜰螓蜴蟮螠蜳螝蜇螇蜬蝖蜴蟹蟜蜍蟢螆蝟蜝螏蜾螌蟟蟕蝃蜹蝿蟷蟏蟖螴蜶蜺蟖蝾蟣蝤螅蝸蜎蜙蜆蝞蜉蟹蜶蟓蜨蝽蟷蜁蜗蜠螛螑螈蜩蝐蝝螜蝁蝅蝔蟍蝱蜹蟰螕蝼蝥蜺蝔蟪蝶蟃蟘蝎螌螖蝹蛣蚗蚻虇蘤蚜蚎虡蚶虀虢蚮虫蛘蚫蘺蘾蚸虒蛦虾蘜蚶蛆蚮蘕蘳蘚蘕虽蘓蛔虲虞蚐蚼蛓虦蘮蚵蛄虘虢蛾蛵蛷蛂虽蘵蚈蚳蘘虋蘀蛠蛰蛱蛍蘡蛟蛗蘐蛁蛨虊虬蘁蘺蛋蘨蘃虿蘥蛸蘎蘏蚞蚃蚒蛞蘯蘦蘹虔蘮蘮虬虩蛞虫蘦蘒蚕虖蘩虂蚽蛘蚳蘶蘂蛾蘗蚿蘖虀虢蘸蚗蚯蛁蛾蚴蛪虨號蛤蘦蚺蘤蚼蘾蛣蘬蛎蛯蛳蚮虑蛸虠虽蛠虙蛝虸蛐蘠蛿蘇蛤蛳蚺蘆蚁蚭蚍蚇蛖蚄虪虧蚩蘆虆蛉蘊蛋蘚虤蚏蛬蘶蘋蛖蛏蚹虈蘣蛧虺蚈蘚蛿虴虏蛛蚹蘹虋夭姓妣姷妈夁妨奆姌奸天夬夦姐姖奃处奇姢妚女夸夋姂夫姄夢妯夌\ue70e\ue786\ue795\ue769\ue749\ue703\ue7df\ue714\ue722\ue783\ue739\ue78c\ue7ef\ue7bd\ue781\ue737\ue79f\ue7d4\ue7b6\ue78a\ue70e\ue765\ue714\ue7d4\ue70c\ue725\ue7b0\ue7dc\ue77c\ue78c\ue70b\ue75d\ue795\ue7f7\ue7bc\ue7c1\ue78c\ue708\ue7e9\ue7ef\ue765\ue755\ue75a\ue7d0\ue71e\ue765\ue799\ue77c\ue789\ue7e6\ue7d2\ue722\ue706\ue722\ue73a\ue74d\ue744\ue7e6\ue7c1\ue7f6\ue73b\ue7f1\ue7ba\ue7ea\ue759\ue7fb\ue7ad\ue727\ue79c\ue7d3\ue764\ue711\ue758\ue73f\ue7b1\ue7ce\ue77e\ue772\ue7d5\ue7dc\ue778\ue7d9\ue714\ue745\ue7db\ue71c\ue76d\ue741\ue7cd\ue710\ue75f\ue7cf\ue7f9\ue7d8\ue783\ue76c\ue73f\ue72d\ue7d7\ue781\ue779\ue7b7\ue7e2\ue7b3\ue775\ue747\ue70b\ue7ac\ue746\ue781\ue737\ue73e\ue771\ue728\ue7bd\ue760\ue7e6\ue71f\ue72c\ue70c\ue727\ue75a\ue76e\ue7ec\ue71e\ue709\ue708\ue7a8\ue7a5\ue77e\ue7ab\ue7c4\ue7dc\ue79f\ue792\ue7a5\ue79f\ue74c\ue7ce\ue777\ue7bd\ue7a7\ue718\ue718\ue7cc\ue7d3\ue716\ue76e\ue7d3\ue7b4\ue712\ue722\ue7c4\ue742\ue74e\ue7ff\ue7aa\ue7fa\ue796\ue7e0\ue7ba\ue7b3\ue7e8\ue7ad\ue7ad\ue724\ue77a\ue7df\ue798\ue7da\ue7ae\ue70e\ue73e\ue731\ue749\ue7e7\ue7c9\ue718\ue76f\ue778\ue717\ue700\ue71d\ue78b\ue79b\ue7bd\ue75a\ue733\ue735\ue75a\ue7a8\ue784\ue7ac\ue751\ue7df\ue7ea\ue7d7\ue7ac\ue7c0\ue749\ue766\ue74f\ue766\ue764\ue7b9\ue76e\ue724\ue7f0ꅱꄾꆆꅢꅫꅴꆶꄴꄊꆁ댮돓뎺덟댎덧덤돗덕덯뎗덟돏돤덥뎃絃紌綴結絙絆綄紆紸綳\ue4e6\ue43f\ue479\ue498\ue4f5\ue437\ue4d1\ue4fb\ue4db\ue4d3\ue462\ue41b\ue496\ue46f\ue435\ue495䁚䀕䂭䁉䁀䁟䂝䀟䀡䂪"
      // 010: astore 50
      // 012: sipush 13403
      // 015: istore 49
      // 017: aload 51
      // 019: arraylength
      // 01a: bipush -1
      // 01b: istore 56
      // 01d: anewarray 231
      // 020: astore 52
      // 022: goto 0c1
      // 025: aload 51
      // 027: iload 53
      // 029: caload
      // 02a: istore 55
      // 02c: aload 50
      // 02e: iload 54
      // 030: iload 54
      // 032: iload 55
      // 034: iadd
      // 035: invokevirtual java/lang/String.substring (II)Ljava/lang/String;
      // 038: invokevirtual java/lang/String.toCharArray ()[C
      // 03b: astore 57
      // 03d: bipush 0
      // 03e: istore 58
      // 040: iload 58
      // 042: bipush 5
      // 043: irem
      // 044: tableswitch 36 0 4 36 40 45 51 55
      // 068: bipush 2
      // 069: goto 080
      // 06c: bipush 111
      // 06e: goto 080
      // 071: sipush 162
      // 074: goto 080
      // 077: bipush 2
      // 078: goto 080
      // 07b: bipush 121
      // 07d: goto 080
      // 080: istore 59
      // 082: aload 57
      // 084: iload 58
      // 086: dup2
      // 087: caload
      // 088: iload 59
      // 08a: ixor
      // 08b: iload 49
      // 08d: ixor
      // 08e: i2c
      // 08f: castore
      // 090: iinc 58 1
      // 093: iload 58
      // 095: aload 57
      // 097: arraylength
      // 098: if_icmplt 040
      // 09b: aload 52
      // 09d: iload 53
      // 09f: new java/lang/String
      // 0a2: dup
      // 0a3: aload 57
      // 0a5: invokespecial java/lang/String.<init> ([C)V
      // 0a8: invokevirtual java/lang/String.intern ()Ljava/lang/String;
      // 0ab: aastore
      // 0ac: iload 54
      // 0ae: iload 55
      // 0b0: iadd
      // 0b1: istore 54
      // 0b3: iinc 53 1
      // 0b6: iload 53
      // 0b8: aload 51
      // 0ba: arraylength
      // 0bb: if_icmplt 025
      // 0be: bipush 0
      // 0bf: istore 56
      // 0c1: bipush 0
      // 0c2: istore 53
      // 0c4: bipush 0
      // 0c5: istore 54
      // 0c7: bipush 0
      // 0c8: istore 55
      // 0ca: iload 56
      // 0cc: ifne 025
      // 0cf: aload 52
      // 0d1: putstatic qeaa361f143ee4a0894bd168fd9b30c66/qf4ccf8f5435d4a78bdca4d6a018b578e/aabbabbbb.aabbba [Ljava/lang/String;
      // 0d4: aload 52
      // 0d6: arraylength
      // 0d7: anewarray 4
      // 0da: putstatic qeaa361f143ee4a0894bd168fd9b30c66/qf4ccf8f5435d4a78bdca4d6a018b578e/aabbabbbb.aabbbb [Ljava/lang/Object;
      // 0dd: ldc_w -255173454
      // 0e0: istore 45
      // 0e2: ldc_w " Ü=À\u009eSH\u000b\u0080}70\u0007¦Ã¬\u0001\u0011eS\u00977eÕ\u0011·\u0004ÌKcÖ¢Ë¥2ÌÆ:¤\u0019\u0090i\u0001ÔCÚOÇ½\u0012Ièºe·\u001d|C\u009bw]\u008a\u008b'þ¡q\u0097\u0085¾xÙ³\u0092ÅÅÎ7L\u008fÕª+Ê¨oS{\u0003\u0097G|±øÊ9K©o\u001a®Cø\u0081ß9[ëë\u0082&Ä\u008fIÙ¿O\u0094\u00adbäìàfH)Å\u008cØ\u0096|wÄ{#ÜV&ÃjÇ\u0017\u0000õOP\u008c¾U\u0000\u0095}\u0087÷C/!\u0092©^í\u0092ãõQ\u008fÓþZ&IÚÎ\u001dcy=Ö\\V\u008a<C\b\u0010ÞR\u0092à¶\u0000\u0091@nË\u008c4ýãL¬á<#±\u0086§²ºðÌè³¨v\u0093U\u00925]ChL®K«²z}\u0018k\"À\u0098S¹]ÑkkÊp\u0017¦S£I\u0097C¡M¯\u0000Ã7¡Ä9XëACi\u0018Â\u0013KãÓpl\u008d\u0012æ>kÆÉ¿?\u0097\u0097x\"?Oj\u0013*Å.F\u0005\u009cÆ\u008båCTn+IÞÎv´GÁ\u009c¿\u001a\n¢Ï\u0005(¡C&C\u001ewõ\u001f\u000b¹Ä(ÝÎL\u0015´ÞH]ò¡X*\u001a´!{Ø\n\u0014qÎ\u007f rwGµ\u0095Î²°® ÒioßÂGÓ¿÷&JbÓ.ó Ñ\u001fl~ic¥-'krc\u0080E¢óTr\u0017p \u00adÆ)Kß\u0093mø¥\u001dnXË\u009c]\u001a\u0094Ã\t\u000fäÛè&Äpt$y4\u0080\u0006(\"æ\u0018 \u001eÙ\"+ïÜ\u0001õ\u0094X~Ö1}·ÌÒ\u0092Ð!\u0098¦\u0003«\r2\u008c\u0098ñ\u009eßÇ¦!VÑà~2åB\t&IÊZgnu\u000eÔ<NFìØ\u0083ìr\u008f8zi\u009aMV\u009eóKYC¾8\u001b aN\râ0\u0088ß^\u008a\\\u0093Þæ\u0086# FÓ÷$Í\u0097ð%ÜdVÅü\u0093\u0083\u009b§\bË ÁÑûÒï\u0005ºªý\u0091VÏ®A¥¤x\u001e¿â\u0084înfð\u008a½A\u001dfM\u008e»»\u001bD\u0016©Ñ(\u009b\u000eæ\u009bÆÆèE¥;cuâ5@Q®ö|\u008c}\"Y\u0098×x\u000fæ\u008coµ\bñ\u0005·µH)Ý÷ÑÅ¨O\u008arÒ;{8\u001eªÁÐ?åÃàp#\u0096vø¥Ä¦GÇ-\u009e\u0000TmF¤°<\u0082qR÷\u0092U\u001aøñ\u0001Ùçð²wÈBwùCKHò>W\u0007\u0080)«øï\u000fêH\u0095\u000f\u008a\u0083µ4Ã\u009aÐk;1T·aê\\\u000et\u0017ËM3Ä BV\u0085fÁ\u0002ï\u000e~\f\u009fÙ\u0006%\u0091÷ßÔ\u009f°\u0094¡¼\u0016«6<wo(Væ\u0017Ð\u0087¾[µW\u000e\u0002Þ\u008cÜk¾\bç/\u001fõ\u001bo`WÃ\u0016ÞD\u0081R\u009b!äR¸øß2\u000b\u0005ÎÂ\u0087ÿÅ\u009fû]I\u001eÜý\u0082@\u0006ñ¯\"£<¼·£ÂÊü¹\u009e\u0080åh{NyuUÄ3ç\u0003ô_8ãxá};|(\\W\u0089<MG\n\u0001th>\u009fì9)b\u008fë²V7\u0014©ï2ø$ÕÍ\u000bíÓ\nz*\u0013\u000bbAõ^¸7©«\u0086*oE\u000fcÿ\u0088.\u0014\u0016¹Æ,\u000bY×\u000fªg\u0010ÆòS\u008a}ò\u008aG\u001aïÒ\u009d\u008cÎpaÚoI\u0096ó_\u0094T¨¥o\u009c-Þ_És y6 \u001aÙÞîD·e\u0004Å\u008fit{Àa#i2\u000e\u009aìÖ&{èÌW$Uõua \u0017ðWc>NGûó\u0090µM²~Ba.´_r¡õ)|üÞ°á\u0005Üöw£À.i\u0005ð\u001d\u0006t\u000e 8%\r\u000e\u0083&\u0080t\f\"l2\u001at}ÿ<¯Ãx\u001c\u0084Ê®\f\u009eþNg\u0095!gF\u0080\u0091 Vrç$-ÓÅí¯n:Á\u0012\u0005ÛE$°¢\u0085BÑB~:EÁVz\u0082Ý*'¾åM)nM&Ø\u0001½\u0096>ë»$\u0097Vr+*èù=\u008bYGÔ·\u000bñ)\u008as¯×]\u001a\u007fªR`óW*Ë\u0083)ã\u008ba£nR\u0000s»þ8sÃ\u000b\u00167 Á\u0017Õ\u008eù\rYA?òüá\u0088ð\u001b1À\b\u001e÷\u0092\u0090ùí\u0011íl\u0002?gSÕ÷¼¹j×s\u009b)\u0092t|öN\u000e\u0018\u0089Sÿà#êÖ\u001f2©ü]+,vOv?1Íö\u009fwtÌ¥\u001d\u0085Ë_^õc4\u0007fgNë\u001f\u0010\u0097\u0084îÆûl£\u0006}µÒ©\u009b\u0012\u0099\u0004¯Æ¾êhá\u0094\u0097ßå\u009c\u001cu*\u001d\u0013 \u0003&à¨§RrÞ /\u0093yìP\tr\u0080óT\u009fhæ²@¹xOÛ¨\u000b\u0006Ä¨3WÚt\u0092ûëô\u008c\u009aç\u008b+\u0005#Ùº¡áGÀ\u0007Â¦\u00899Òhîp\u0097¢\u0083\u0087\u009fBïñ}ÏÐû\u0099\u0013R\u000fÛ2¤L\u0083Õ\u009c\u0011/\u001b\t\u0005¶òÉZº}Ã\u00ad\u0084L\u0083ð©5?Rñ\u0018\u0010\u0016ùôIqnã\u009a\u0003|\n\u0003hAùÀt\u009d\u009fý\u0082L%¤\u009dQ±¾)áÆÚÎ\n\u009d\f\u00adê\u0087Úöâ:\u0099\u008aF\u008fYÃÌ|è\u001fT\u0082f½n\u0003)ä(ï,Â¨°?Å-×\u0088þ½Ú\u009ff\u0081Â\u0092ÉJ$\u0096²F\u0001n)ü\u0083²\u00044¯\u0005k\u009d¶»\u0013LR\u009b>j\u0091\u00ad°\u0099Æ·^\u0087vî\f~e\u00ad¬>1)ÍÖÓiKð*Cïzµºß,e\u0007Ã\u0086¢!³ëëñd°÷£\u0081ÅÑ?\u0004i\u009c1P\u0080\u0015]eN\u0089D×\nY¤$ü\u0080ðÙFzÔ\u0003{\u001dGÔY\u0088¤íÀ¾íq{¦¹ª\u0014\u001e\u0090_\u008a.\u0095{ö÷\u0081Ò\u000b\u001d¾ýµ%e¿¯rJ¨\fW³eÕ\u00ad¤ù°DHcú\u0003D\u0081Ñô+\u0086¢÷÷\u0094~6ú¸\u009d7ú\n\u008e>Å2?ü`Ò¡P\u0091FqgÚ©\"5\u0004{\u0006Û°+ÖS\u000e8\u001eR\\7|áÛ\u0082A[©\u000eÊTÛõ\u0014§4>Ø\u008cç¦\u0088\u001a\u001bðÂ«\u0095® íá«+ýüÐ¥é|Ý\u0010\u0002t\"b}©XMçg\u0014_\u0016\f¯Êº'ft?vq(ÖH-Ãè\u009e;\u009bsì\u000fdÔ¥.¸ª\u0093Ê þP\u008cGK\u0080V\u0090á\u001a½=\u0013\u0013ªGÁË\u001d\u0096\u001a\u0085Ä\u001dÃ\u0018B¯wöø\u008c±FÜê-\u0095l\u008a¦Ï\u0099·°³À>\u0007Æ \u0096-ÔÐQýd\u0081å\u0010ã%\u000b\b8¹ä\u000eFÿ]-\u0011Ù\u0099áL[·WÓ3«\u0096\u0011À¨O¿Ì°yÃºB\u0013'D¶C\u0016y¨z·\u001bD@¦ï\fÙªôØ(\u0012ä\u009e\u0088\u0013\u008f\u009b¢x_ôn)ðÈ\fpíèÖ\u0011\u0001µ[Ç=wO§PÁmÐì'\u0082\u0000\u0013ÿ(Ñ\u0081\u009aÓ ²¡á\u0084´`®àS\b\\Íû²äÝÊ\u0017âZÿ$+\u0086\fØÇâ¢\u008d¸!\\\u0002héø\u0096ø\u0086\u007f¾ÿ8µdôµ\u0006ïÓ\u001bñ\u0093¹8Ð@2 \u0011ª\b\u001c?S+±\u0002\u001fÇîÛÜ<¯\u0084ãÆ¤\u0087G¡û\u0098OC\u0094¤Ûÿ7\u009e\u0011þ\u0091ÏhÕV\fo\u0014\u009e\u0016Ç¿\u0001\u0083¹ä4° ZKt!&mµ°ë\tK\u0097\nÓ\u0002$\u009e\u009dÑ¤µþW¹Ø\u009bkÈ\u0080¶Î$Ú¸Q¹ZÂ µ=QúÅ?\u008b\u0083}\u0097\u0011\u0017íSB0®\u0099)Y\u009b\u008fp©ø\u0093áò\u0090%\u00ad\u0082\u0018\tr\u008eqºt\u001b\u0019_Æ£>ÂA>h\u00079«®þ\u0085¬\u0005n\u009c¥åp|\u008aÁ"
      // 0e5: ldc_w "ISO-8859-1"
      // 0e8: invokevirtual java/lang/String.getBytes (Ljava/lang/String;)[B
      // 0eb: astore 43
      // 0ed: aload 43
      // 0ef: arraylength
      // 0f0: bipush 4
      // 0f1: idiv
      // 0f2: istore 44
      // 0f4: iload 44
      // 0f6: newarray 10
      // 0f8: putstatic qeaa361f143ee4a0894bd168fd9b30c66/qf4ccf8f5435d4a78bdca4d6a018b578e/aabbabbbb.aabbab [I
      // 0fb: bipush 0
      // 0fc: istore 46
      // 0fe: bipush 0
      // 0ff: istore 47
      // 101: aload 43
      // 103: iload 46
      // 105: baload
      // 106: sipush 255
      // 109: iand
      // 10a: bipush 24
      // 10c: ishl
      // 10d: aload 43
      // 10f: iload 46
      // 111: bipush 1
      // 112: iadd
      // 113: baload
      // 114: sipush 255
      // 117: iand
      // 118: bipush 16
      // 11a: ishl
      // 11b: ior
      // 11c: aload 43
      // 11e: iload 46
      // 120: bipush 2
      // 121: iadd
      // 122: baload
      // 123: sipush 255
      // 126: iand
      // 127: bipush 8
      // 129: ishl
      // 12a: ior
      // 12b: aload 43
      // 12d: iload 46
      // 12f: bipush 3
      // 130: iadd
      // 131: baload
      // 132: sipush 255
      // 135: iand
      // 136: ior
      // 137: istore 48
      // 139: iload 48
      // 13b: iload 45
      // 13d: ixor
      // 13e: istore 48
      // 140: getstatic qeaa361f143ee4a0894bd168fd9b30c66/qf4ccf8f5435d4a78bdca4d6a018b578e/aabbabbbb.aabbab [I
      // 143: iload 47
      // 145: iload 48
      // 147: iastore
      // 148: iinc 46 4
      // 14b: iinc 47 1
      // 14e: iload 47
      // 150: iload 44
      // 152: if_icmplt 101
      // 155: ldc_w 604047205
      // 158: iload 60
      // 15a: ldc_w 699093686
      // 15d: ixor
      // 15e: invokestatic qeaa361f143ee4a0894bd168fd9b30c66/qf4ccf8f5435d4a78bdca4d6a018b578e/aabbabbbb.b (II)I
      // 161: anewarray 231
      // 164: astore 21
      // 166: bipush 0
      // 167: istore 19
      // 169: ldc_w 794953165
      // 16c: sipush -8035
      // 16f: ldc_w 37058
      // 172: invokestatic qeaa361f143ee4a0894bd168fd9b30c66/qf4ccf8f5435d4a78bdca4d6a018b578e/aabbabbbb.bbbabab (ISC)Ljava/lang/String;
      // 175: dup
      // 176: astore 18
      // 178: invokevirtual java/lang/String.length ()I
      // 17b: istore 20
      // 17d: ldc_w 604047204
      // 180: iload 60
      // 182: ldc_w 871211314
      // 185: ixor
      // 186: invokestatic qeaa361f143ee4a0894bd168fd9b30c66/qf4ccf8f5435d4a78bdca4d6a018b578e/aabbabbbb.b (II)I
      // 189: istore 17
      // 18b: bipush -1
      // 18c: istore 16
      // 18e: iinc 16 1
      // 191: aload 18
      // 193: iload 16
      // 195: dup
      // 196: iload 17
      // 198: iadd
      // 199: invokevirtual java/lang/String.substring (II)Ljava/lang/String;
      // 19c: bipush -1
      // 19d: goto 238
      // 1a0: aload 21
      // 1a2: swap
      // 1a3: iload 19
      // 1a5: iinc 19 1
      // 1a8: swap
      // 1a9: aastore
      // 1aa: iload 16
      // 1ac: iload 17
      // 1ae: iadd
      // 1af: dup
      // 1b0: istore 16
      // 1b2: iload 20
      // 1b4: if_icmpge 1c3
      // 1b7: aload 18
      // 1b9: iload 16
      // 1bb: invokevirtual java/lang/String.charAt (I)C
      // 1be: istore 17
      // 1c0: goto 18e
      // 1c3: ldc_w 794953164
      // 1c6: sipush -6173
      // 1c9: i2s
      // 1ca: sipush 19820
      // 1cd: invokestatic qeaa361f143ee4a0894bd168fd9b30c66/qf4ccf8f5435d4a78bdca4d6a018b578e/aabbabbbb.bbbabab (ISC)Ljava/lang/String;
      // 1d0: dup
      // 1d1: astore 18
      // 1d3: invokevirtual java/lang/String.length ()I
      // 1d6: istore 20
      // 1d8: ldc_w 604047207
      // 1db: iload 60
      // 1dd: ldc_w -496380835
      // 1e0: ixor
      // 1e1: invokestatic qeaa361f143ee4a0894bd168fd9b30c66/qf4ccf8f5435d4a78bdca4d6a018b578e/aabbabbbb.b (II)I
      // 1e4: istore 17
      // 1e6: bipush -1
      // 1e7: istore 16
      // 1e9: iinc 16 1
      // 1ec: aload 18
      // 1ee: iload 16
      // 1f0: dup
      // 1f1: iload 17
      // 1f3: iadd
      // 1f4: invokevirtual java/lang/String.substring (II)Ljava/lang/String;
      // 1f7: bipush 0
      // 1f8: goto 238
      // 1fb: aload 21
      // 1fd: swap
      // 1fe: iload 19
      // 200: iinc 19 1
      // 203: swap
      // 204: aastore
      // 205: iload 16
      // 207: iload 17
      // 209: iadd
      // 20a: dup
      // 20b: istore 16
      // 20d: iload 20
      // 20f: if_icmpge 21e
      // 212: aload 18
      // 214: iload 16
      // 216: invokevirtual java/lang/String.charAt (I)C
      // 219: istore 17
      // 21b: goto 1e9
      // 21e: aload 21
      // 220: putstatic qeaa361f143ee4a0894bd168fd9b30c66/qf4ccf8f5435d4a78bdca4d6a018b578e/aabbabbbb.aaabaa [Ljava/lang/String;
      // 223: ldc_w 604047206
      // 226: iload 60
      // 228: ldc_w 827209677
      // 22b: ixor
      // 22c: invokestatic qeaa361f143ee4a0894bd168fd9b30c66/qf4ccf8f5435d4a78bdca4d6a018b578e/aabbabbbb.b (II)I
      // 22f: anewarray 231
      // 232: putstatic qeaa361f143ee4a0894bd168fd9b30c66/qf4ccf8f5435d4a78bdca4d6a018b578e/aabbabbbb.bbba [Ljava/lang/String;
      // 235: goto 320
      // 238: swap
      // 239: invokevirtual java/lang/String.toCharArray ()[C
      // 23c: dup
      // 23d: arraylength
      // 23e: swap
      // 23f: bipush 0
      // 240: istore 22
      // 242: swap
      // 243: dup_x1
      // 244: bipush 1
      // 245: if_icmpgt 2fa
      // 248: dup
      // 249: iload 22
      // 24b: dup2
      // 24c: caload
      // 24d: iload 22
      // 24f: ldc_w 604047225
      // 252: iload 60
      // 254: ldc_w -1048469689
      // 257: ixor
      // 258: invokestatic qeaa361f143ee4a0894bd168fd9b30c66/qf4ccf8f5435d4a78bdca4d6a018b578e/aabbabbbb.b (II)I
      // 25b: irem
      // 25c: tableswitch 130 0 5 40 55 70 85 100 115
      // 284: ldc_w 604047224
      // 287: iload 60
      // 289: ldc_w -1756679326
      // 28c: ixor
      // 28d: invokestatic qeaa361f143ee4a0894bd168fd9b30c66/qf4ccf8f5435d4a78bdca4d6a018b578e/aabbabbbb.b (II)I
      // 290: goto 2ea
      // 293: ldc_w 604047227
      // 296: iload 60
      // 298: ldc_w 1562886129
      // 29b: ixor
      // 29c: invokestatic qeaa361f143ee4a0894bd168fd9b30c66/qf4ccf8f5435d4a78bdca4d6a018b578e/aabbabbbb.b (II)I
      // 29f: goto 2ea
      // 2a2: ldc_w 604047226
      // 2a5: iload 60
      // 2a7: ldc_w 1788144749
      // 2aa: ixor
      // 2ab: invokestatic qeaa361f143ee4a0894bd168fd9b30c66/qf4ccf8f5435d4a78bdca4d6a018b578e/aabbabbbb.b (II)I
      // 2ae: goto 2ea
      // 2b1: ldc_w 604047229
      // 2b4: iload 60
      // 2b6: ldc_w 1682608015
      // 2b9: ixor
      // 2ba: invokestatic qeaa361f143ee4a0894bd168fd9b30c66/qf4ccf8f5435d4a78bdca4d6a018b578e/aabbabbbb.b (II)I
      // 2bd: goto 2ea
      // 2c0: ldc_w 604047228
      // 2c3: iload 60
      // 2c5: ldc_w -277165909
      // 2c8: ixor
      // 2c9: invokestatic qeaa361f143ee4a0894bd168fd9b30c66/qf4ccf8f5435d4a78bdca4d6a018b578e/aabbabbbb.b (II)I
      // 2cc: goto 2ea
      // 2cf: ldc_w 604047231
      // 2d2: iload 60
      // 2d4: ldc_w -866219222
      // 2d7: ixor
      // 2d8: invokestatic qeaa361f143ee4a0894bd168fd9b30c66/qf4ccf8f5435d4a78bdca4d6a018b578e/aabbabbbb.b (II)I
      // 2db: goto 2ea
      // 2de: ldc_w 604047230
      // 2e1: iload 60
      // 2e3: ldc_w -259827890
      // 2e6: ixor
      // 2e7: invokestatic qeaa361f143ee4a0894bd168fd9b30c66/qf4ccf8f5435d4a78bdca4d6a018b578e/aabbabbbb.b (II)I
      // 2ea: ixor
      // 2eb: i2c
      // 2ec: castore
      // 2ed: iinc 22 1
      // 2f0: swap
      // 2f1: dup_x1
      // 2f2: ifne 2fa
      // 2f5: dup2
      // 2f6: swap
      // 2f7: goto 24b
      // 2fa: swap
      // 2fb: dup_x1
      // 2fc: iload 22
      // 2fe: if_icmpgt 248
      // 301: new java/lang/String
      // 304: dup_x1
      // 305: swap
      // 306: invokespecial java/lang/String.<init> ([C)V
      // 309: invokevirtual java/lang/String.intern ()Ljava/lang/String;
      // 30c: swap
      // 30d: pop
      // 30e: swap
      // 30f: tableswitch -367 0 0 -276
      // 320: ldc2_w 6620296498450208302
      // 323: lstore 8
      // 325: ldc_w 604047217
      // 328: iload 60
      // 32a: ldc_w -711462231
      // 32d: ixor
      // 32e: invokestatic qeaa361f143ee4a0894bd168fd9b30c66/qf4ccf8f5435d4a78bdca4d6a018b578e/aabbabbbb.b (II)I
      // 331: newarray 11
      // 333: astore 14
      // 335: bipush 0
      // 336: istore 11
      // 338: ldc_w 794953167
      // 33b: sipush 18887
      // 33e: sipush 23852
      // 341: invokestatic qeaa361f143ee4a0894bd168fd9b30c66/qf4ccf8f5435d4a78bdca4d6a018b578e/aabbabbbb.bbbabab (ISC)Ljava/lang/String;
      // 344: dup
      // 345: astore 12
      // 347: invokevirtual java/lang/String.length ()I
      // 34a: istore 13
      // 34c: bipush 0
      // 34d: istore 10
      // 34f: aload 12
      // 351: iload 10
      // 353: iinc 10 8
      // 356: iload 10
      // 358: invokevirtual java/lang/String.substring (II)Ljava/lang/String;
      // 35b: ldc_w 794953166
      // 35e: sipush -6340
      // 361: ldc_w 46490
      // 364: i2c
      // 365: invokestatic qeaa361f143ee4a0894bd168fd9b30c66/qf4ccf8f5435d4a78bdca4d6a018b578e/aabbabbbb.bbbabab (ISC)Ljava/lang/String;
      // 368: invokevirtual java/lang/String.getBytes (Ljava/lang/String;)[B
      // 36b: astore 15
      // 36d: aload 14
      // 36f: iload 11
      // 371: iinc 11 1
      // 374: aload 15
      // 376: bipush 0
      // 377: baload
      // 378: i2l
      // 379: ldc2_w 255
      // 37c: land
      // 37d: ldc_w 604047216
      // 380: iload 60
      // 382: ldc_w -2081839413
      // 385: ixor
      // 386: invokestatic qeaa361f143ee4a0894bd168fd9b30c66/qf4ccf8f5435d4a78bdca4d6a018b578e/aabbabbbb.b (II)I
      // 389: lshl
      // 38a: aload 15
      // 38c: bipush 1
      // 38d: baload
      // 38e: i2l
      // 38f: ldc2_w 255
      // 392: land
      // 393: ldc_w 604047219
      // 396: iload 60
      // 398: ldc_w 956814554
      // 39b: ixor
      // 39c: invokestatic qeaa361f143ee4a0894bd168fd9b30c66/qf4ccf8f5435d4a78bdca4d6a018b578e/aabbabbbb.b (II)I
      // 39f: lshl
      // 3a0: lor
      // 3a1: aload 15
      // 3a3: bipush 2
      // 3a4: baload
      // 3a5: i2l
      // 3a6: ldc2_w 255
      // 3a9: land
      // 3aa: ldc_w 604047218
      // 3ad: iload 60
      // 3af: ldc_w 1002073599
      // 3b2: ixor
      // 3b3: invokestatic qeaa361f143ee4a0894bd168fd9b30c66/qf4ccf8f5435d4a78bdca4d6a018b578e/aabbabbbb.b (II)I
      // 3b6: lshl
      // 3b7: lor
      // 3b8: aload 15
      // 3ba: bipush 3
      // 3bb: baload
      // 3bc: i2l
      // 3bd: ldc2_w 255
      // 3c0: land
      // 3c1: ldc_w 604047221
      // 3c4: iload 60
      // 3c6: ldc_w 1375269900
      // 3c9: ixor
      // 3ca: invokestatic qeaa361f143ee4a0894bd168fd9b30c66/qf4ccf8f5435d4a78bdca4d6a018b578e/aabbabbbb.b (II)I
      // 3cd: lshl
      // 3ce: lor
      // 3cf: aload 15
      // 3d1: bipush 4
      // 3d2: baload
      // 3d3: i2l
      // 3d4: ldc2_w 255
      // 3d7: land
      // 3d8: ldc_w 604047220
      // 3db: iload 60
      // 3dd: ldc_w 608219058
      // 3e0: ixor
      // 3e1: invokestatic qeaa361f143ee4a0894bd168fd9b30c66/qf4ccf8f5435d4a78bdca4d6a018b578e/aabbabbbb.b (II)I
      // 3e4: lshl
      // 3e5: lor
      // 3e6: aload 15
      // 3e8: bipush 5
      // 3e9: baload
      // 3ea: i2l
      // 3eb: ldc2_w 255
      // 3ee: land
      // 3ef: ldc_w 604047223
      // 3f2: iload 60
      // 3f4: ldc_w 1580490691
      // 3f7: ixor
      // 3f8: invokestatic qeaa361f143ee4a0894bd168fd9b30c66/qf4ccf8f5435d4a78bdca4d6a018b578e/aabbabbbb.b (II)I
      // 3fb: lshl
      // 3fc: lor
      // 3fd: aload 15
      // 3ff: ldc_w 604047222
      // 402: iload 60
      // 404: ldc_w -1834621664
      // 407: ixor
      // 408: invokestatic qeaa361f143ee4a0894bd168fd9b30c66/qf4ccf8f5435d4a78bdca4d6a018b578e/aabbabbbb.b (II)I
      // 40b: baload
      // 40c: i2l
      // 40d: ldc2_w 255
      // 410: land
      // 411: ldc_w 604047177
      // 414: iload 60
      // 416: ldc_w -1276451027
      // 419: ixor
      // 41a: invokestatic qeaa361f143ee4a0894bd168fd9b30c66/qf4ccf8f5435d4a78bdca4d6a018b578e/aabbabbbb.b (II)I
      // 41d: lshl
      // 41e: lor
      // 41f: aload 15
      // 421: ldc_w 604047176
      // 424: iload 60
      // 426: ldc_w -64179525
      // 429: ixor
      // 42a: invokestatic qeaa361f143ee4a0894bd168fd9b30c66/qf4ccf8f5435d4a78bdca4d6a018b578e/aabbabbbb.b (II)I
      // 42d: baload
      // 42e: i2l
      // 42f: ldc2_w 255
      // 432: land
      // 433: lor
      // 434: bipush -1
      // 435: goto 578
      // 438: lastore
      // 439: iload 10
      // 43b: iload 13
      // 43d: if_icmplt 34f
      // 440: ldc_w 794953161
      // 443: sipush 17031
      // 446: sipush 627
      // 449: invokestatic qeaa361f143ee4a0894bd168fd9b30c66/qf4ccf8f5435d4a78bdca4d6a018b578e/aabbabbbb.bbbabab (ISC)Ljava/lang/String;
      // 44c: dup
      // 44d: astore 12
      // 44f: invokevirtual java/lang/String.length ()I
      // 452: istore 13
      // 454: bipush 0
      // 455: istore 10
      // 457: aload 12
      // 459: iload 10
      // 45b: iinc 10 8
      // 45e: iload 10
      // 460: invokevirtual java/lang/String.substring (II)Ljava/lang/String;
      // 463: ldc_w 794953160
      // 466: sipush 32557
      // 469: i2s
      // 46a: ldc_w 61887
      // 46d: i2c
      // 46e: invokestatic qeaa361f143ee4a0894bd168fd9b30c66/qf4ccf8f5435d4a78bdca4d6a018b578e/aabbabbbb.bbbabab (ISC)Ljava/lang/String;
      // 471: invokevirtual java/lang/String.getBytes (Ljava/lang/String;)[B
      // 474: astore 15
      // 476: aload 14
      // 478: iload 11
      // 47a: iinc 11 1
      // 47d: aload 15
      // 47f: bipush 0
      // 480: baload
      // 481: i2l
      // 482: ldc2_w 255
      // 485: land
      // 486: ldc_w 604047179
      // 489: iload 60
      // 48b: ldc_w 1957359161
      // 48e: ixor
      // 48f: invokestatic qeaa361f143ee4a0894bd168fd9b30c66/qf4ccf8f5435d4a78bdca4d6a018b578e/aabbabbbb.b (II)I
      // 492: lshl
      // 493: aload 15
      // 495: bipush 1
      // 496: baload
      // 497: i2l
      // 498: ldc2_w 255
      // 49b: land
      // 49c: ldc_w 604047178
      // 49f: iload 60
      // 4a1: ldc_w -876083080
      // 4a4: ixor
      // 4a5: invokestatic qeaa361f143ee4a0894bd168fd9b30c66/qf4ccf8f5435d4a78bdca4d6a018b578e/aabbabbbb.b (II)I
      // 4a8: lshl
      // 4a9: lor
      // 4aa: aload 15
      // 4ac: bipush 2
      // 4ad: baload
      // 4ae: i2l
      // 4af: ldc2_w 255
      // 4b2: land
      // 4b3: ldc_w 604047181
      // 4b6: iload 60
      // 4b8: ldc_w -1940174673
      // 4bb: ixor
      // 4bc: invokestatic qeaa361f143ee4a0894bd168fd9b30c66/qf4ccf8f5435d4a78bdca4d6a018b578e/aabbabbbb.b (II)I
      // 4bf: lshl
      // 4c0: lor
      // 4c1: aload 15
      // 4c3: bipush 3
      // 4c4: baload
      // 4c5: i2l
      // 4c6: ldc2_w 255
      // 4c9: land
      // 4ca: ldc_w 604047180
      // 4cd: iload 60
      // 4cf: ldc_w 683612530
      // 4d2: ixor
      // 4d3: invokestatic qeaa361f143ee4a0894bd168fd9b30c66/qf4ccf8f5435d4a78bdca4d6a018b578e/aabbabbbb.b (II)I
      // 4d6: lshl
      // 4d7: lor
      // 4d8: aload 15
      // 4da: bipush 4
      // 4db: baload
      // 4dc: i2l
      // 4dd: ldc2_w 255
      // 4e0: land
      // 4e1: ldc_w 604047183
      // 4e4: iload 60
      // 4e6: ldc_w -44182935
      // 4e9: ixor
      // 4ea: invokestatic qeaa361f143ee4a0894bd168fd9b30c66/qf4ccf8f5435d4a78bdca4d6a018b578e/aabbabbbb.b (II)I
      // 4ed: lshl
      // 4ee: lor
      // 4ef: aload 15
      // 4f1: bipush 5
      // 4f2: baload
      // 4f3: i2l
      // 4f4: ldc2_w 255
      // 4f7: land
      // 4f8: ldc_w 604047182
      // 4fb: iload 60
      // 4fd: ldc_w -652878797
      // 500: ixor
      // 501: invokestatic qeaa361f143ee4a0894bd168fd9b30c66/qf4ccf8f5435d4a78bdca4d6a018b578e/aabbabbbb.b (II)I
      // 504: lshl
      // 505: lor
      // 506: aload 15
      // 508: ldc_w 604047169
      // 50b: iload 60
      // 50d: ldc_w -1915305161
      // 510: ixor
      // 511: invokestatic qeaa361f143ee4a0894bd168fd9b30c66/qf4ccf8f5435d4a78bdca4d6a018b578e/aabbabbbb.b (II)I
      // 514: baload
      // 515: i2l
      // 516: ldc2_w 255
      // 519: land
      // 51a: ldc_w 604047168
      // 51d: iload 60
      // 51f: ldc_w 1048112262
      // 522: ixor
      // 523: invokestatic qeaa361f143ee4a0894bd168fd9b30c66/qf4ccf8f5435d4a78bdca4d6a018b578e/aabbabbbb.b (II)I
      // 526: lshl
      // 527: lor
      // 528: aload 15
      // 52a: ldc_w 604047171
      // 52d: iload 60
      // 52f: ldc_w -67737715
      // 532: ixor
      // 533: invokestatic qeaa361f143ee4a0894bd168fd9b30c66/qf4ccf8f5435d4a78bdca4d6a018b578e/aabbabbbb.b (II)I
      // 536: baload
      // 537: i2l
      // 538: ldc2_w 255
      // 53b: land
      // 53c: lor
      // 53d: bipush 0
      // 53e: goto 578
      // 541: lastore
      // 542: iload 10
      // 544: iload 13
      // 546: if_icmplt 457
      // 549: aload 14
      // 54b: putstatic qeaa361f143ee4a0894bd168fd9b30c66/qf4ccf8f5435d4a78bdca4d6a018b578e/aabbabbbb.bbaba [J
      // 54e: ldc_w 604047170
      // 551: iload 60
      // 553: ldc_w -990045259
      // 556: ixor
      // 557: invokestatic qeaa361f143ee4a0894bd168fd9b30c66/qf4ccf8f5435d4a78bdca4d6a018b578e/aabbabbbb.b (II)I
      // 55a: anewarray 919
      // 55d: putstatic qeaa361f143ee4a0894bd168fd9b30c66/qf4ccf8f5435d4a78bdca4d6a018b578e/aabbabbbb.aabba [Ljava/lang/Integer;
      // 560: ldc_w 604047173
      // 563: iload 60
      // 565: ldc_w -1953695686
      // 568: ixor
      // 569: invokestatic qeaa361f143ee4a0894bd168fd9b30c66/qf4ccf8f5435d4a78bdca4d6a018b578e/aabbabbbb.b (II)I
      // 56c: ldc2_w 5066851790098560987
      // 56f: invokestatic qeaa361f143ee4a0894bd168fd9b30c66/qf4ccf8f5435d4a78bdca4d6a018b578e/aabbabbbb.aaaaa (IJ)I
      // 572: putstatic qeaa361f143ee4a0894bd168fd9b30c66/qf4ccf8f5435d4a78bdca4d6a018b578e/aabbabbbb.abba I
      // 575: goto 590
      // 578: dup_x2
      // 579: pop
      // 57a: lload 8
      // 57c: lxor
      // 57d: dup2_x1
      // 57e: pop2
      // 57f: tableswitch -327 0 0 -62
      // 590: ldc2_w 5845721603510306949
      // 593: lstore 0
      // 594: bipush 2
      // 595: newarray 11
      // 597: astore 6
      // 599: bipush 0
      // 59a: istore 3
      // 59b: ldc_w 794953163
      // 59e: sipush -21016
      // 5a1: ldc_w 47713
      // 5a4: i2c
      // 5a5: invokestatic qeaa361f143ee4a0894bd168fd9b30c66/qf4ccf8f5435d4a78bdca4d6a018b578e/aabbabbbb.bbbabab (ISC)Ljava/lang/String;
      // 5a8: dup
      // 5a9: astore 4
      // 5ab: invokevirtual java/lang/String.length ()I
      // 5ae: istore 5
      // 5b0: bipush 0
      // 5b1: istore 2
      // 5b2: aload 4
      // 5b4: iload 2
      // 5b5: iinc 2 8
      // 5b8: iload 2
      // 5b9: invokevirtual java/lang/String.substring (II)Ljava/lang/String;
      // 5bc: ldc_w 794953162
      // 5bf: sipush 17585
      // 5c2: ldc_w 63288
      // 5c5: i2c
      // 5c6: invokestatic qeaa361f143ee4a0894bd168fd9b30c66/qf4ccf8f5435d4a78bdca4d6a018b578e/aabbabbbb.bbbabab (ISC)Ljava/lang/String;
      // 5c9: invokevirtual java/lang/String.getBytes (Ljava/lang/String;)[B
      // 5cc: astore 7
      // 5ce: aload 6
      // 5d0: iload 3
      // 5d1: iinc 3 1
      // 5d4: aload 7
      // 5d6: bipush 0
      // 5d7: baload
      // 5d8: i2l
      // 5d9: ldc2_w 255
      // 5dc: land
      // 5dd: ldc_w 604047172
      // 5e0: iload 60
      // 5e2: ldc_w 1960846714
      // 5e5: ixor
      // 5e6: invokestatic qeaa361f143ee4a0894bd168fd9b30c66/qf4ccf8f5435d4a78bdca4d6a018b578e/aabbabbbb.b (II)I
      // 5e9: lshl
      // 5ea: aload 7
      // 5ec: bipush 1
      // 5ed: baload
      // 5ee: i2l
      // 5ef: ldc2_w 255
      // 5f2: land
      // 5f3: ldc_w 604047175
      // 5f6: iload 60
      // 5f8: ldc_w -996529567
      // 5fb: ixor
      // 5fc: invokestatic qeaa361f143ee4a0894bd168fd9b30c66/qf4ccf8f5435d4a78bdca4d6a018b578e/aabbabbbb.b (II)I
      // 5ff: lshl
      // 600: lor
      // 601: aload 7
      // 603: bipush 2
      // 604: baload
      // 605: i2l
      // 606: ldc2_w 255
      // 609: land
      // 60a: ldc_w 604047174
      // 60d: iload 60
      // 60f: ldc_w 263852321
      // 612: ixor
      // 613: invokestatic qeaa361f143ee4a0894bd168fd9b30c66/qf4ccf8f5435d4a78bdca4d6a018b578e/aabbabbbb.b (II)I
      // 616: lshl
      // 617: lor
      // 618: aload 7
      // 61a: bipush 3
      // 61b: baload
      // 61c: i2l
      // 61d: ldc2_w 255
      // 620: land
      // 621: ldc_w 604047193
      // 624: iload 60
      // 626: ldc_w 383733470
      // 629: ixor
      // 62a: invokestatic qeaa361f143ee4a0894bd168fd9b30c66/qf4ccf8f5435d4a78bdca4d6a018b578e/aabbabbbb.b (II)I
      // 62d: lshl
      // 62e: lor
      // 62f: aload 7
      // 631: bipush 4
      // 632: baload
      // 633: i2l
      // 634: ldc2_w 255
      // 637: land
      // 638: ldc_w 604047192
      // 63b: iload 60
      // 63d: ldc_w -1118072179
      // 640: ixor
      // 641: invokestatic qeaa361f143ee4a0894bd168fd9b30c66/qf4ccf8f5435d4a78bdca4d6a018b578e/aabbabbbb.b (II)I
      // 644: lshl
      // 645: lor
      // 646: aload 7
      // 648: bipush 5
      // 649: baload
      // 64a: i2l
      // 64b: ldc2_w 255
      // 64e: land
      // 64f: ldc_w 604047195
      // 652: iload 60
      // 654: ldc_w 1716726435
      // 657: ixor
      // 658: invokestatic qeaa361f143ee4a0894bd168fd9b30c66/qf4ccf8f5435d4a78bdca4d6a018b578e/aabbabbbb.b (II)I
      // 65b: lshl
      // 65c: lor
      // 65d: aload 7
      // 65f: ldc_w 604047194
      // 662: iload 60
      // 664: ldc_w -1681626641
      // 667: ixor
      // 668: invokestatic qeaa361f143ee4a0894bd168fd9b30c66/qf4ccf8f5435d4a78bdca4d6a018b578e/aabbabbbb.b (II)I
      // 66b: baload
      // 66c: i2l
      // 66d: ldc2_w 255
      // 670: land
      // 671: ldc_w 604047197
      // 674: iload 60
      // 676: ldc_w 1219454607
      // 679: ixor
      // 67a: invokestatic qeaa361f143ee4a0894bd168fd9b30c66/qf4ccf8f5435d4a78bdca4d6a018b578e/aabbabbbb.b (II)I
      // 67d: lshl
      // 67e: lor
      // 67f: aload 7
      // 681: ldc_w 604047196
      // 684: iload 60
      // 686: ldc_w 157935067
      // 689: ixor
      // 68a: invokestatic qeaa361f143ee4a0894bd168fd9b30c66/qf4ccf8f5435d4a78bdca4d6a018b578e/aabbabbbb.b (II)I
      // 68d: baload
      // 68e: i2l
      // 68f: ldc2_w 255
      // 692: land
      // 693: lor
      // 694: bipush -1
      // 695: goto 6ae
      // 698: lastore
      // 699: iload 2
      // 69a: iload 5
      // 69c: if_icmplt 5b2
      // 69f: aload 6
      // 6a1: putstatic qeaa361f143ee4a0894bd168fd9b30c66/qf4ccf8f5435d4a78bdca4d6a018b578e/aabbabbbb.abb [J
      // 6a4: bipush 2
      // 6a5: anewarray 1123
      // 6a8: putstatic qeaa361f143ee4a0894bd168fd9b30c66/qf4ccf8f5435d4a78bdca4d6a018b578e/aabbabbbb.baabb [Ljava/lang/Long;
      // 6ab: goto 6b8
      // 6ae: dup_x2
      // 6af: pop
      // 6b0: lload 0
      // 6b1: lxor
      // 6b2: dup2_x1
      // 6b3: pop2
      // 6b4: pop
      // 6b5: goto 698
      // 6b8: bipush 0
      // 6b9: putstatic qeaa361f143ee4a0894bd168fd9b30c66/qf4ccf8f5435d4a78bdca4d6a018b578e/aabbabbbb.abaab Z
      // 6bc: ldc_w 604047199
      // 6bf: iload 60
      // 6c1: ldc_w 1661117134
      // 6c4: ixor
      // 6c5: invokestatic qeaa361f143ee4a0894bd168fd9b30c66/qf4ccf8f5435d4a78bdca4d6a018b578e/aabbabbbb.b (II)I
      // 6c8: new java/util/concurrent/ConcurrentLinkedQueue
      // 6cb: dup
      // 6cc: invokespecial java/util/concurrent/ConcurrentLinkedQueue.<init> ()V
      // 6cf: putstatic qeaa361f143ee4a0894bd168fd9b30c66/qf4ccf8f5435d4a78bdca4d6a018b578e/aabbabbbb.bbab Ljava/util/concurrent/ConcurrentLinkedQueue;
      // 6d2: ldc2_w 8360211825956479750
      // 6d5: bipush 0
      // 6d6: putstatic qeaa361f143ee4a0894bd168fd9b30c66/qf4ccf8f5435d4a78bdca4d6a018b578e/aabbabbbb.babaa Z
      // 6d9: bipush 0
      // 6da: putstatic qeaa361f143ee4a0894bd168fd9b30c66/qf4ccf8f5435d4a78bdca4d6a018b578e/aabbabbbb.baaba Z
      // 6dd: bipush -1
      // 6de: putstatic qeaa361f143ee4a0894bd168fd9b30c66/qf4ccf8f5435d4a78bdca4d6a018b578e/aabbabbbb.aaaab I
      // 6e1: bipush 0
      // 6e2: putstatic qeaa361f143ee4a0894bd168fd9b30c66/qf4ccf8f5435d4a78bdca4d6a018b578e/aabbabbbb.bbbb I
      // 6e5: ldc_w 604047198
      // 6e8: iload 60
      // 6ea: ldc_w 332851705
      // 6ed: ixor
      // 6ee: invokestatic qeaa361f143ee4a0894bd168fd9b30c66/qf4ccf8f5435d4a78bdca4d6a018b578e/aabbabbbb.b (II)I
      // 6f1: ldc2_w 534081000846442569
      // 6f4: invokestatic qeaa361f143ee4a0894bd168fd9b30c66/qf4ccf8f5435d4a78bdca4d6a018b578e/aabbabbbb.baabb (IJ)J
      // 6f7: putstatic qeaa361f143ee4a0894bd168fd9b30c66/qf4ccf8f5435d4a78bdca4d6a018b578e/aabbabbbb.aaa J
      // 6fa: bipush 0
      // 6fb: putstatic qeaa361f143ee4a0894bd168fd9b30c66/qf4ccf8f5435d4a78bdca4d6a018b578e/aabbabbbb.baba Z
      // 6fe: ldc_w 604047185
      // 701: iload 60
      // 703: ldc_w 502804487
      // 706: ixor
      // 707: invokestatic qeaa361f143ee4a0894bd168fd9b30c66/qf4ccf8f5435d4a78bdca4d6a018b578e/aabbabbbb.b (II)I
      // 70a: ldc2_w 534081000846442569
      // 70d: invokestatic qeaa361f143ee4a0894bd168fd9b30c66/qf4ccf8f5435d4a78bdca4d6a018b578e/aabbabbbb.baabb (IJ)J
      // 710: putstatic qeaa361f143ee4a0894bd168fd9b30c66/qf4ccf8f5435d4a78bdca4d6a018b578e/aabbabbbb.ababb J
      // 713: ldc_w 604047184
      // 716: iload 60
      // 718: ldc_w 331316083
      // 71b: ixor
      // 71c: invokestatic qeaa361f143ee4a0894bd168fd9b30c66/qf4ccf8f5435d4a78bdca4d6a018b578e/aabbabbbb.b (II)I
      // 71f: ldc2_w 534081000846442569
      // 722: invokestatic qeaa361f143ee4a0894bd168fd9b30c66/qf4ccf8f5435d4a78bdca4d6a018b578e/aabbabbbb.baabb (IJ)J
      // 725: putstatic qeaa361f143ee4a0894bd168fd9b30c66/qf4ccf8f5435d4a78bdca4d6a018b578e/aabbabbbb.abbab J
      // 728: ldc_w NaN
      // 72b: putstatic qeaa361f143ee4a0894bd168fd9b30c66/qf4ccf8f5435d4a78bdca4d6a018b578e/aabbabbbb.baaab F
      // 72e: invokestatic qeaa361f143ee4a0894bd168fd9b30c66/qf4ccf8f5435d4a78bdca4d6a018b578e/aabbabbbb.aaaaa (IJ)I
      // 731: putstatic qeaa361f143ee4a0894bd168fd9b30c66/qf4ccf8f5435d4a78bdca4d6a018b578e/aabbabbbb.aabb I
      // 734: ldc_w 604047187
      // 737: iload 60
      // 739: ldc_w 806962407
      // 73c: ixor
      // 73d: invokestatic qeaa361f143ee4a0894bd168fd9b30c66/qf4ccf8f5435d4a78bdca4d6a018b578e/aabbabbbb.b (II)I
      // 740: ldc_w 604047186
      // 743: iload 60
      // 745: ldc_w -1334293755
      // 748: ixor
      // 749: invokestatic qeaa361f143ee4a0894bd168fd9b30c66/qf4ccf8f5435d4a78bdca4d6a018b578e/aabbabbbb.b (II)I
      // 74c: new qeaa361f143ee4a0894bd168fd9b30c66/qf4ccf8f5435d4a78bdca4d6a018b578e/abaaabaa
      // 74f: dup
      // 750: invokespecial qeaa361f143ee4a0894bd168fd9b30c66/qf4ccf8f5435d4a78bdca4d6a018b578e/abaaabaa.<init> ()V
      // 753: putstatic qeaa361f143ee4a0894bd168fd9b30c66/qf4ccf8f5435d4a78bdca4d6a018b578e/aabbabbbb.aba Lqeaa361f143ee4a0894bd168fd9b30c66/qf4ccf8f5435d4a78bdca4d6a018b578e/abaaabaa;
      // 756: ldc2_w 3247427863806215739
      // 759: invokestatic qeaa361f143ee4a0894bd168fd9b30c66/qf4ccf8f5435d4a78bdca4d6a018b578e/aabbabbbb.aaaaa (IJ)I
      // 75c: newarray 4
      // 75e: putstatic qeaa361f143ee4a0894bd168fd9b30c66/qf4ccf8f5435d4a78bdca4d6a018b578e/aabbabbbb.bbaab [Z
      // 761: ldc2_w 534081000846442569
      // 764: ldc_w 604047189
      // 767: iload 60
      // 769: ldc_w -622210246
      // 76c: ixor
      // 76d: invokestatic qeaa361f143ee4a0894bd168fd9b30c66/qf4ccf8f5435d4a78bdca4d6a018b578e/aabbabbbb.b (II)I
      // 770: ldc2_w 5354763695687574753
      // 773: invokestatic qeaa361f143ee4a0894bd168fd9b30c66/qf4ccf8f5435d4a78bdca4d6a018b578e/aabbabbbb.aaaaa (IJ)I
      // 776: newarray 4
      // 778: putstatic qeaa361f143ee4a0894bd168fd9b30c66/qf4ccf8f5435d4a78bdca4d6a018b578e/aabbabbbb.bbbbb [Z
      // 77b: ldc_w 604047188
      // 77e: iload 60
      // 780: ldc_w 196249468
      // 783: ixor
      // 784: invokestatic qeaa361f143ee4a0894bd168fd9b30c66/qf4ccf8f5435d4a78bdca4d6a018b578e/aabbabbbb.b (II)I
      // 787: ldc2_w 8360211825956479750
      // 78a: invokestatic qeaa361f143ee4a0894bd168fd9b30c66/qf4ccf8f5435d4a78bdca4d6a018b578e/aabbabbbb.aaaaa (IJ)I
      // 78d: putstatic qeaa361f143ee4a0894bd168fd9b30c66/qf4ccf8f5435d4a78bdca4d6a018b578e/aabbabbbb.abbaa I
      // 790: ldc_w 604047191
      // 793: iload 60
      // 795: ldc_w -620569068
      // 798: ixor
      // 799: invokestatic qeaa361f143ee4a0894bd168fd9b30c66/qf4ccf8f5435d4a78bdca4d6a018b578e/aabbabbbb.b (II)I
      // 79c: bipush 0
      // 79d: putstatic qeaa361f143ee4a0894bd168fd9b30c66/qf4ccf8f5435d4a78bdca4d6a018b578e/aabbabbbb.aaaa I
      // 7a0: ldc2_w 8360211825956479750
      // 7a3: bipush -1
      // 7a4: putstatic qeaa361f143ee4a0894bd168fd9b30c66/qf4ccf8f5435d4a78bdca4d6a018b578e/aabbabbbb.bbaaa I
      // 7a7: getstatic qeaa361f143ee4a0894bd168fd9b30c66/qf4ccf8f5435d4a78bdca4d6a018b578e/bbbabbab.b Lqeaa361f143ee4a0894bd168fd9b30c66/qf4ccf8f5435d4a78bdca4d6a018b578e/bbbabbab;
      // 7aa: putstatic qeaa361f143ee4a0894bd168fd9b30c66/qf4ccf8f5435d4a78bdca4d6a018b578e/aabbabbbb.aaaaba Lqeaa361f143ee4a0894bd168fd9b30c66/qf4ccf8f5435d4a78bdca4d6a018b578e/bbbabbab;
      // 7ad: bipush -1
      // 7ae: putstatic qeaa361f143ee4a0894bd168fd9b30c66/qf4ccf8f5435d4a78bdca4d6a018b578e/aabbabbbb.abbba I
      // 7b1: invokestatic qeaa361f143ee4a0894bd168fd9b30c66/qf4ccf8f5435d4a78bdca4d6a018b578e/aabbabbbb.aaaaa (IJ)I
      // 7b4: putstatic qeaa361f143ee4a0894bd168fd9b30c66/qf4ccf8f5435d4a78bdca4d6a018b578e/aabbabbbb.bbabb I
      // 7b7: invokestatic qeaa361f143ee4a0894bd168fd9b30c66/qf4ccf8f5435d4a78bdca4d6a018b578e/aabbabbbb.baabb (IJ)J
      // 7ba: putstatic qeaa361f143ee4a0894bd168fd9b30c66/qf4ccf8f5435d4a78bdca4d6a018b578e/aabbabbbb.aaaaa J
      // 7bd: bipush 0
      // 7be: putstatic qeaa361f143ee4a0894bd168fd9b30c66/qf4ccf8f5435d4a78bdca4d6a018b578e/aabbabbbb.bbbaa I
      // 7c1: bipush 0
      // 7c2: putstatic qeaa361f143ee4a0894bd168fd9b30c66/qf4ccf8f5435d4a78bdca4d6a018b578e/aabbabbbb.baaaa I
      // 7c5: bipush 0
      // 7c6: putstatic qeaa361f143ee4a0894bd168fd9b30c66/qf4ccf8f5435d4a78bdca4d6a018b578e/aabbabbbb.aabab I
      // 7c9: bipush 0
      // 7ca: putstatic qeaa361f143ee4a0894bd168fd9b30c66/qf4ccf8f5435d4a78bdca4d6a018b578e/aabbabbbb.babb I
      // 7cd: bipush 0
      // 7ce: putstatic qeaa361f143ee4a0894bd168fd9b30c66/qf4ccf8f5435d4a78bdca4d6a018b578e/aabbabbbb.aabbb I
      // 7d1: bipush 0
      // 7d2: putstatic qeaa361f143ee4a0894bd168fd9b30c66/qf4ccf8f5435d4a78bdca4d6a018b578e/aabbabbbb.baaa I
      // 7d5: aconst_null
      // 7d6: astore 23
      // 7d8: ldc_w net/minecraft/class_304
      // 7db: ldc_w 604047190
      // 7de: iload 60
      // 7e0: ldc_w 13871572
      // 7e3: ixor
      // 7e4: invokestatic qeaa361f143ee4a0894bd168fd9b30c66/qf4ccf8f5435d4a78bdca4d6a018b578e/aabbabbbb.b (II)I
      // 7e7: ldc_w 604047145
      // 7ea: iload 60
      // 7ec: ldc_w -2065137939
      // 7ef: ixor
      // 7f0: invokestatic qeaa361f143ee4a0894bd168fd9b30c66/qf4ccf8f5435d4a78bdca4d6a018b578e/aabbabbbb.b (II)I
      // 7f3: invokestatic qeaa361f143ee4a0894bd168fd9b30c66/qf4ccf8f5435d4a78bdca4d6a018b578e/aabbabbbb.bbaabaa (II)Ljava/lang/String;
      // 7f6: invokestatic qeaa361f143ee4a0894bd168fd9b30c66/qf4ccf8f5435d4a78bdca4d6a018b578e/aabbaaaba.abba (Ljava/lang/String;)Ljava/lang/String;
      // 7f9: invokevirtual java/lang/Class.getDeclaredField (Ljava/lang/String;)Ljava/lang/reflect/Field;
      // 7fc: astore 23
      // 7fe: aload 23
      // 800: bipush 1
      // 801: invokevirtual java/lang/reflect/Field.setAccessible (Z)V
      // 804: goto 809
      // 807: astore 24
      // 809: aload 23
      // 80b: putstatic qeaa361f143ee4a0894bd168fd9b30c66/qf4ccf8f5435d4a78bdca4d6a018b578e/aabbabbbb.bba Ljava/lang/reflect/Field;
      // 80e: aconst_null
      // 80f: astore 24
      // 811: aconst_null
      // 812: astore 25
      // 814: ldc_w net/minecraft/class_1661
      // 817: ldc_w 604047144
      // 81a: iload 60
      // 81c: ldc_w 2031398267
      // 81f: ixor
      // 820: invokestatic qeaa361f143ee4a0894bd168fd9b30c66/qf4ccf8f5435d4a78bdca4d6a018b578e/aabbabbbb.b (II)I
      // 823: ldc_w 604047147
      // 826: iload 60
      // 828: ldc_w -607185821
      // 82b: ixor
      // 82c: invokestatic qeaa361f143ee4a0894bd168fd9b30c66/qf4ccf8f5435d4a78bdca4d6a018b578e/aabbabbbb.b (II)I
      // 82f: invokestatic qeaa361f143ee4a0894bd168fd9b30c66/qf4ccf8f5435d4a78bdca4d6a018b578e/aabbabbbb.bbaabaa (II)Ljava/lang/String;
      // 832: invokestatic qeaa361f143ee4a0894bd168fd9b30c66/qf4ccf8f5435d4a78bdca4d6a018b578e/aabbaaaba.abba (Ljava/lang/String;)Ljava/lang/String;
      // 835: bipush 0
      // 836: anewarray 810
      // 839: invokevirtual java/lang/Class.getMethod (Ljava/lang/String;[Ljava/lang/Class;)Ljava/lang/reflect/Method;
      // 83c: astore 25
      // 83e: goto 843
      // 841: astore 26
      // 843: ldc_w net/minecraft/class_1661
      // 846: ldc_w 604047146
      // 849: iload 60
      // 84b: ldc_w -930189400
      // 84e: ixor
      // 84f: invokestatic qeaa361f143ee4a0894bd168fd9b30c66/qf4ccf8f5435d4a78bdca4d6a018b578e/aabbabbbb.b (II)I
      // 852: ldc_w 604047149
      // 855: iload 60
      // 857: ldc_w -1377295299
      // 85a: ixor
      // 85b: invokestatic qeaa361f143ee4a0894bd168fd9b30c66/qf4ccf8f5435d4a78bdca4d6a018b578e/aabbabbbb.b (II)I
      // 85e: invokestatic qeaa361f143ee4a0894bd168fd9b30c66/qf4ccf8f5435d4a78bdca4d6a018b578e/aabbabbbb.bbaabaa (II)Ljava/lang/String;
      // 861: invokestatic qeaa361f143ee4a0894bd168fd9b30c66/qf4ccf8f5435d4a78bdca4d6a018b578e/aabbaaaba.abba (Ljava/lang/String;)Ljava/lang/String;
      // 864: invokevirtual java/lang/Class.getField (Ljava/lang/String;)Ljava/lang/reflect/Field;
      // 867: astore 24
      // 869: goto 89f
      // 86c: astore 26
      // 86e: ldc_w net/minecraft/class_1661
      // 871: ldc_w 604047148
      // 874: iload 60
      // 876: ldc_w 1959792431
      // 879: ixor
      // 87a: invokestatic qeaa361f143ee4a0894bd168fd9b30c66/qf4ccf8f5435d4a78bdca4d6a018b578e/aabbabbbb.b (II)I
      // 87d: ldc_w 604047151
      // 880: iload 60
      // 882: ldc_w -1983829893
      // 885: ixor
      // 886: invokestatic qeaa361f143ee4a0894bd168fd9b30c66/qf4ccf8f5435d4a78bdca4d6a018b578e/aabbabbbb.b (II)I
      // 889: invokestatic qeaa361f143ee4a0894bd168fd9b30c66/qf4ccf8f5435d4a78bdca4d6a018b578e/aabbabbbb.bbaabaa (II)Ljava/lang/String;
      // 88c: invokestatic qeaa361f143ee4a0894bd168fd9b30c66/qf4ccf8f5435d4a78bdca4d6a018b578e/aabbaaaba.abba (Ljava/lang/String;)Ljava/lang/String;
      // 88f: invokevirtual java/lang/Class.getDeclaredField (Ljava/lang/String;)Ljava/lang/reflect/Field;
      // 892: astore 24
      // 894: aload 24
      // 896: bipush 1
      // 897: invokevirtual java/lang/reflect/Field.setAccessible (Z)V
      // 89a: goto 89f
      // 89d: astore 27
      // 89f: aload 24
      // 8a1: putstatic qeaa361f143ee4a0894bd168fd9b30c66/qf4ccf8f5435d4a78bdca4d6a018b578e/aabbabbbb.b Ljava/lang/reflect/Field;
      // 8a4: aload 25
      // 8a6: putstatic qeaa361f143ee4a0894bd168fd9b30c66/qf4ccf8f5435d4a78bdca4d6a018b578e/aabbabbbb.aab Ljava/lang/reflect/Method;
      // 8a9: aconst_null
      // 8aa: astore 26
      // 8ac: aconst_null
      // 8ad: astore 27
      // 8af: aconst_null
      // 8b0: astore 28
      // 8b2: ldc_w net/minecraft/class_744
      // 8b5: ldc_w 604047150
      // 8b8: iload 60
      // 8ba: ldc_w 1942659747
      // 8bd: ixor
      // 8be: invokestatic qeaa361f143ee4a0894bd168fd9b30c66/qf4ccf8f5435d4a78bdca4d6a018b578e/aabbabbbb.b (II)I
      // 8c1: ldc_w 604047137
      // 8c4: iload 60
      // 8c6: ldc_w -783879454
      // 8c9: ixor
      // 8ca: invokestatic qeaa361f143ee4a0894bd168fd9b30c66/qf4ccf8f5435d4a78bdca4d6a018b578e/aabbabbbb.b (II)I
      // 8cd: invokestatic qeaa361f143ee4a0894bd168fd9b30c66/qf4ccf8f5435d4a78bdca4d6a018b578e/aabbabbbb.bbaabaa (II)Ljava/lang/String;
      // 8d0: invokestatic qeaa361f143ee4a0894bd168fd9b30c66/qf4ccf8f5435d4a78bdca4d6a018b578e/aabbaaaba.abba (Ljava/lang/String;)Ljava/lang/String;
      // 8d3: invokevirtual java/lang/Class.getField (Ljava/lang/String;)Ljava/lang/reflect/Field;
      // 8d6: astore 26
      // 8d8: ldc_w net/minecraft/class_744
      // 8db: ldc_w 604047136
      // 8de: iload 60
      // 8e0: ldc_w 1905099295
      // 8e3: ixor
      // 8e4: invokestatic qeaa361f143ee4a0894bd168fd9b30c66/qf4ccf8f5435d4a78bdca4d6a018b578e/aabbabbbb.b (II)I
      // 8e7: ldc_w 604047139
      // 8ea: iload 60
      // 8ec: ldc_w 2107874910
      // 8ef: ixor
      // 8f0: invokestatic qeaa361f143ee4a0894bd168fd9b30c66/qf4ccf8f5435d4a78bdca4d6a018b578e/aabbabbbb.b (II)I
      // 8f3: invokestatic qeaa361f143ee4a0894bd168fd9b30c66/qf4ccf8f5435d4a78bdca4d6a018b578e/aabbabbbb.bbaabaa (II)Ljava/lang/String;
      // 8f6: invokestatic qeaa361f143ee4a0894bd168fd9b30c66/qf4ccf8f5435d4a78bdca4d6a018b578e/aabbaaaba.abba (Ljava/lang/String;)Ljava/lang/String;
      // 8f9: invokevirtual java/lang/Class.getField (Ljava/lang/String;)Ljava/lang/reflect/Field;
      // 8fc: astore 27
      // 8fe: goto 996
      // 901: astore 29
      // 903: ldc_w net/minecraft/class_744
      // 906: ldc_w 604047138
      // 909: iload 60
      // 90b: ldc_w -1330410798
      // 90e: ixor
      // 90f: invokestatic qeaa361f143ee4a0894bd168fd9b30c66/qf4ccf8f5435d4a78bdca4d6a018b578e/aabbabbbb.b (II)I
      // 912: ldc_w 604047141
      // 915: iload 60
      // 917: ldc_w 1321576288
      // 91a: ixor
      // 91b: invokestatic qeaa361f143ee4a0894bd168fd9b30c66/qf4ccf8f5435d4a78bdca4d6a018b578e/aabbabbbb.b (II)I
      // 91e: invokestatic qeaa361f143ee4a0894bd168fd9b30c66/qf4ccf8f5435d4a78bdca4d6a018b578e/aabbabbbb.bbaabaa (II)Ljava/lang/String;
      // 921: invokestatic qeaa361f143ee4a0894bd168fd9b30c66/qf4ccf8f5435d4a78bdca4d6a018b578e/aabbaaaba.abba (Ljava/lang/String;)Ljava/lang/String;
      // 924: invokevirtual java/lang/Class.getDeclaredField (Ljava/lang/String;)Ljava/lang/reflect/Field;
      // 927: astore 28
      // 929: aload 28
      // 92b: bipush 1
      // 92c: invokevirtual java/lang/reflect/Field.setAccessible (Z)V
      // 92f: goto 996
      // 932: astore 30
      // 934: ldc_w net/minecraft/class_744
      // 937: ldc_w 604047140
      // 93a: iload 60
      // 93c: ldc_w 311416909
      // 93f: ixor
      // 940: invokestatic qeaa361f143ee4a0894bd168fd9b30c66/qf4ccf8f5435d4a78bdca4d6a018b578e/aabbabbbb.b (II)I
      // 943: ldc_w 604047143
      // 946: iload 60
      // 948: ldc_w -146630316
      // 94b: ixor
      // 94c: invokestatic qeaa361f143ee4a0894bd168fd9b30c66/qf4ccf8f5435d4a78bdca4d6a018b578e/aabbabbbb.b (II)I
      // 94f: invokestatic qeaa361f143ee4a0894bd168fd9b30c66/qf4ccf8f5435d4a78bdca4d6a018b578e/aabbabbbb.bbaabaa (II)Ljava/lang/String;
      // 952: invokestatic qeaa361f143ee4a0894bd168fd9b30c66/qf4ccf8f5435d4a78bdca4d6a018b578e/aabbaaaba.abba (Ljava/lang/String;)Ljava/lang/String;
      // 955: invokevirtual java/lang/Class.getDeclaredField (Ljava/lang/String;)Ljava/lang/reflect/Field;
      // 958: astore 28
      // 95a: aload 28
      // 95c: bipush 1
      // 95d: invokevirtual java/lang/reflect/Field.setAccessible (Z)V
      // 960: goto 996
      // 963: astore 31
      // 965: ldc_w net/minecraft/class_744
      // 968: ldc_w 604047142
      // 96b: iload 60
      // 96d: ldc_w -640945682
      // 970: ixor
      // 971: invokestatic qeaa361f143ee4a0894bd168fd9b30c66/qf4ccf8f5435d4a78bdca4d6a018b578e/aabbabbbb.b (II)I
      // 974: ldc_w 604047161
      // 977: iload 60
      // 979: ldc_w -1879560491
      // 97c: ixor
      // 97d: invokestatic qeaa361f143ee4a0894bd168fd9b30c66/qf4ccf8f5435d4a78bdca4d6a018b578e/aabbabbbb.b (II)I
      // 980: invokestatic qeaa361f143ee4a0894bd168fd9b30c66/qf4ccf8f5435d4a78bdca4d6a018b578e/aabbabbbb.bbaabaa (II)Ljava/lang/String;
      // 983: invokestatic qeaa361f143ee4a0894bd168fd9b30c66/qf4ccf8f5435d4a78bdca4d6a018b578e/aabbaaaba.abba (Ljava/lang/String;)Ljava/lang/String;
      // 986: invokevirtual java/lang/Class.getDeclaredField (Ljava/lang/String;)Ljava/lang/reflect/Field;
      // 989: astore 28
      // 98b: aload 28
      // 98d: bipush 1
      // 98e: invokevirtual java/lang/reflect/Field.setAccessible (Z)V
      // 991: goto 996
      // 994: astore 32
      // 996: aload 26
      // 998: putstatic qeaa361f143ee4a0894bd168fd9b30c66/qf4ccf8f5435d4a78bdca4d6a018b578e/aabbabbbb.aaabab Ljava/lang/reflect/Field;
      // 99b: aload 27
      // 99d: putstatic qeaa361f143ee4a0894bd168fd9b30c66/qf4ccf8f5435d4a78bdca4d6a018b578e/aabbabbbb.bbbab Ljava/lang/reflect/Field;
      // 9a0: aload 28
      // 9a2: putstatic qeaa361f143ee4a0894bd168fd9b30c66/qf4ccf8f5435d4a78bdca4d6a018b578e/aabbabbbb.baa Ljava/lang/reflect/Field;
      // 9a5: aconst_null
      // 9a6: astore 29
      // 9a8: ldc_w net/minecraft/class_636
      // 9ab: ldc_w 604047160
      // 9ae: iload 60
      // 9b0: ldc_w 1870126100
      // 9b3: ixor
      // 9b4: invokestatic qeaa361f143ee4a0894bd168fd9b30c66/qf4ccf8f5435d4a78bdca4d6a018b578e/aabbabbbb.b (II)I
      // 9b7: ldc_w 604047163
      // 9ba: iload 60
      // 9bc: ldc_w -1217362292
      // 9bf: ixor
      // 9c0: invokestatic qeaa361f143ee4a0894bd168fd9b30c66/qf4ccf8f5435d4a78bdca4d6a018b578e/aabbabbbb.b (II)I
      // 9c3: invokestatic qeaa361f143ee4a0894bd168fd9b30c66/qf4ccf8f5435d4a78bdca4d6a018b578e/aabbabbbb.bbaabaa (II)Ljava/lang/String;
      // 9c6: invokestatic qeaa361f143ee4a0894bd168fd9b30c66/qf4ccf8f5435d4a78bdca4d6a018b578e/aabbaaaba.abba (Ljava/lang/String;)Ljava/lang/String;
      // 9c9: bipush 0
      // 9ca: anewarray 810
      // 9cd: invokevirtual java/lang/Class.getDeclaredMethod (Ljava/lang/String;[Ljava/lang/Class;)Ljava/lang/reflect/Method;
      // 9d0: astore 29
      // 9d2: aload 29
      // 9d4: bipush 1
      // 9d5: invokevirtual java/lang/reflect/Method.setAccessible (Z)V
      // 9d8: goto 9dd
      // 9db: astore 30
      // 9dd: aload 29
      // 9df: putstatic qeaa361f143ee4a0894bd168fd9b30c66/qf4ccf8f5435d4a78bdca4d6a018b578e/aabbabbbb.aaba Ljava/lang/reflect/Method;
      // 9e2: aconst_null
      // 9e3: astore 30
      // 9e5: aconst_null
      // 9e6: astore 31
      // 9e8: ldc_w net/minecraft/class_304
      // 9eb: ldc_w 604047162
      // 9ee: iload 60
      // 9f0: ldc_w -611910096
      // 9f3: ixor
      // 9f4: invokestatic qeaa361f143ee4a0894bd168fd9b30c66/qf4ccf8f5435d4a78bdca4d6a018b578e/aabbabbbb.b (II)I
      // 9f7: ldc_w 604047165
      // 9fa: iload 60
      // 9fc: ldc_w -888803835
      // 9ff: ixor
      // a00: invokestatic qeaa361f143ee4a0894bd168fd9b30c66/qf4ccf8f5435d4a78bdca4d6a018b578e/aabbabbbb.b (II)I
      // a03: invokestatic qeaa361f143ee4a0894bd168fd9b30c66/qf4ccf8f5435d4a78bdca4d6a018b578e/aabbabbbb.bbaabaa (II)Ljava/lang/String;
      // a06: invokestatic qeaa361f143ee4a0894bd168fd9b30c66/qf4ccf8f5435d4a78bdca4d6a018b578e/aabbaaaba.abba (Ljava/lang/String;)Ljava/lang/String;
      // a09: bipush 1
      // a0a: anewarray 810
      // a0d: dup
      // a0e: bipush 0
      // a0f: ldc_w net/minecraft/class_3675$class_306
      // a12: aastore
      // a13: invokevirtual java/lang/Class.getMethod (Ljava/lang/String;[Ljava/lang/Class;)Ljava/lang/reflect/Method;
      // a16: astore 30
      // a18: goto a1d
      // a1b: astore 32
      // a1d: ldc_w net/minecraft/class_304
      // a20: ldc_w 604047164
      // a23: iload 60
      // a25: ldc_w -466526725
      // a28: ixor
      // a29: invokestatic qeaa361f143ee4a0894bd168fd9b30c66/qf4ccf8f5435d4a78bdca4d6a018b578e/aabbabbbb.b (II)I
      // a2c: ldc_w 604047167
      // a2f: iload 60
      // a31: ldc_w -1255757388
      // a34: ixor
      // a35: invokestatic qeaa361f143ee4a0894bd168fd9b30c66/qf4ccf8f5435d4a78bdca4d6a018b578e/aabbabbbb.b (II)I
      // a38: invokestatic qeaa361f143ee4a0894bd168fd9b30c66/qf4ccf8f5435d4a78bdca4d6a018b578e/aabbabbbb.bbaabaa (II)Ljava/lang/String;
      // a3b: invokestatic qeaa361f143ee4a0894bd168fd9b30c66/qf4ccf8f5435d4a78bdca4d6a018b578e/aabbaaaba.abba (Ljava/lang/String;)Ljava/lang/String;
      // a3e: bipush 2
      // a3f: anewarray 810
      // a42: dup
      // a43: bipush 0
      // a44: ldc_w net/minecraft/class_3675$class_306
      // a47: aastore
      // a48: dup
      // a49: bipush 1
      // a4a: getstatic java/lang/Boolean.TYPE Ljava/lang/Class;
      // a4d: aastore
      // a4e: invokevirtual java/lang/Class.getMethod (Ljava/lang/String;[Ljava/lang/Class;)Ljava/lang/reflect/Method;
      // a51: astore 31
      // a53: goto a58
      // a56: astore 32
      // a58: aload 30
      // a5a: putstatic qeaa361f143ee4a0894bd168fd9b30c66/qf4ccf8f5435d4a78bdca4d6a018b578e/aabbabbbb.babbb Ljava/lang/reflect/Method;
      // a5d: aload 31
      // a5f: putstatic qeaa361f143ee4a0894bd168fd9b30c66/qf4ccf8f5435d4a78bdca4d6a018b578e/aabbabbbb.aa Ljava/lang/reflect/Method;
      // a62: aconst_null
      // a63: astore 32
      // a65: aconst_null
      // a66: astore 33
      // a68: ldc_w net/minecraft/class_310
      // a6b: ldc_w 604047166
      // a6e: iload 60
      // a70: ldc_w 1740466944
      // a73: ixor
      // a74: invokestatic qeaa361f143ee4a0894bd168fd9b30c66/qf4ccf8f5435d4a78bdca4d6a018b578e/aabbabbbb.b (II)I
      // a77: ldc_w 604047153
      // a7a: iload 60
      // a7c: ldc_w -1733977110
      // a7f: ixor
      // a80: invokestatic qeaa361f143ee4a0894bd168fd9b30c66/qf4ccf8f5435d4a78bdca4d6a018b578e/aabbabbbb.b (II)I
      // a83: invokestatic qeaa361f143ee4a0894bd168fd9b30c66/qf4ccf8f5435d4a78bdca4d6a018b578e/aabbabbbb.bbaabaa (II)Ljava/lang/String;
      // a86: invokestatic qeaa361f143ee4a0894bd168fd9b30c66/qf4ccf8f5435d4a78bdca4d6a018b578e/aabbaaaba.abba (Ljava/lang/String;)Ljava/lang/String;
      // a89: bipush 1
      // a8a: anewarray 810
      // a8d: dup
      // a8e: bipush 0
      // a8f: ldc_w net/minecraft/class_1297
      // a92: aastore
      // a93: invokevirtual java/lang/Class.getMethod (Ljava/lang/String;[Ljava/lang/Class;)Ljava/lang/reflect/Method;
      // a96: astore 32
      // a98: goto a9d
      // a9b: astore 34
      // a9d: ldc_w net/minecraft/class_310
      // aa0: ldc_w 604047152
      // aa3: iload 60
      // aa5: ldc_w 1948981200
      // aa8: ixor
      // aa9: invokestatic qeaa361f143ee4a0894bd168fd9b30c66/qf4ccf8f5435d4a78bdca4d6a018b578e/aabbabbbb.b (II)I
      // aac: ldc_w 604047155
      // aaf: iload 60
      // ab1: ldc_w -2015222959
      // ab4: ixor
      // ab5: invokestatic qeaa361f143ee4a0894bd168fd9b30c66/qf4ccf8f5435d4a78bdca4d6a018b578e/aabbabbbb.b (II)I
      // ab8: invokestatic qeaa361f143ee4a0894bd168fd9b30c66/qf4ccf8f5435d4a78bdca4d6a018b578e/aabbabbbb.bbaabaa (II)Ljava/lang/String;
      // abb: invokestatic qeaa361f143ee4a0894bd168fd9b30c66/qf4ccf8f5435d4a78bdca4d6a018b578e/aabbaaaba.abba (Ljava/lang/String;)Ljava/lang/String;
      // abe: bipush 0
      // abf: anewarray 810
      // ac2: invokevirtual java/lang/Class.getMethod (Ljava/lang/String;[Ljava/lang/Class;)Ljava/lang/reflect/Method;
      // ac5: astore 33
      // ac7: goto acc
      // aca: astore 34
      // acc: aload 32
      // ace: putstatic qeaa361f143ee4a0894bd168fd9b30c66/qf4ccf8f5435d4a78bdca4d6a018b578e/aabbabbbb.abaa Ljava/lang/reflect/Method;
      // ad1: aload 33
      // ad3: putstatic qeaa361f143ee4a0894bd168fd9b30c66/qf4ccf8f5435d4a78bdca4d6a018b578e/aabbabbbb.aababa Ljava/lang/reflect/Method;
      // ad6: ldc_w net/minecraft/class_1309
      // ad9: ldc_w 604047154
      // adc: iload 60
      // ade: ldc_w -165335441
      // ae1: ixor
      // ae2: invokestatic qeaa361f143ee4a0894bd168fd9b30c66/qf4ccf8f5435d4a78bdca4d6a018b578e/aabbabbbb.b (II)I
      // ae5: ldc_w 604047157
      // ae8: iload 60
      // aea: ldc_w -296870961
      // aed: ixor
      // aee: invokestatic qeaa361f143ee4a0894bd168fd9b30c66/qf4ccf8f5435d4a78bdca4d6a018b578e/aabbabbbb.b (II)I
      // af1: invokestatic qeaa361f143ee4a0894bd168fd9b30c66/qf4ccf8f5435d4a78bdca4d6a018b578e/aabbabbbb.bbaabaa (II)Ljava/lang/String;
      // af4: invokestatic qeaa361f143ee4a0894bd168fd9b30c66/qf4ccf8f5435d4a78bdca4d6a018b578e/aabbaaaba.abba (Ljava/lang/String;)Ljava/lang/String;
      // af7: invokestatic qeaa361f143ee4a0894bd168fd9b30c66/qf4ccf8f5435d4a78bdca4d6a018b578e/aabbabbbb.aaaaaa (Ljava/lang/Class;Ljava/lang/String;)Ljava/lang/reflect/Field;
      // afa: putstatic qeaa361f143ee4a0894bd168fd9b30c66/qf4ccf8f5435d4a78bdca4d6a018b578e/aabbabbbb.aaabb Ljava/lang/reflect/Field;
      // afd: ldc_w net/minecraft/class_1309
      // b00: ldc_w 604047156
      // b03: iload 60
      // b05: ldc_w 876123339
      // b08: ixor
      // b09: invokestatic qeaa361f143ee4a0894bd168fd9b30c66/qf4ccf8f5435d4a78bdca4d6a018b578e/aabbabbbb.b (II)I
      // b0c: ldc_w 604047159
      // b0f: iload 60
      // b11: ldc_w 170245606
      // b14: ixor
      // b15: invokestatic qeaa361f143ee4a0894bd168fd9b30c66/qf4ccf8f5435d4a78bdca4d6a018b578e/aabbabbbb.b (II)I
      // b18: invokestatic qeaa361f143ee4a0894bd168fd9b30c66/qf4ccf8f5435d4a78bdca4d6a018b578e/aabbabbbb.bbaabaa (II)Ljava/lang/String;
      // b1b: invokestatic qeaa361f143ee4a0894bd168fd9b30c66/qf4ccf8f5435d4a78bdca4d6a018b578e/aabbaaaba.abba (Ljava/lang/String;)Ljava/lang/String;
      // b1e: invokestatic qeaa361f143ee4a0894bd168fd9b30c66/qf4ccf8f5435d4a78bdca4d6a018b578e/aabbabbbb.aaaaaa (Ljava/lang/Class;Ljava/lang/String;)Ljava/lang/reflect/Field;
      // b21: putstatic qeaa361f143ee4a0894bd168fd9b30c66/qf4ccf8f5435d4a78bdca4d6a018b578e/aabbabbbb.abbbb Ljava/lang/reflect/Field;
      // b24: ldc_w net/minecraft/class_1309
      // b27: ldc_w 604047158
      // b2a: iload 60
      // b2c: ldc_w -2090058357
      // b2f: ixor
      // b30: invokestatic qeaa361f143ee4a0894bd168fd9b30c66/qf4ccf8f5435d4a78bdca4d6a018b578e/aabbabbbb.b (II)I
      // b33: ldc_w 604047113
      // b36: iload 60
      // b38: ldc_w -1575287026
      // b3b: ixor
      // b3c: invokestatic qeaa361f143ee4a0894bd168fd9b30c66/qf4ccf8f5435d4a78bdca4d6a018b578e/aabbabbbb.b (II)I
      // b3f: invokestatic qeaa361f143ee4a0894bd168fd9b30c66/qf4ccf8f5435d4a78bdca4d6a018b578e/aabbabbbb.bbaabaa (II)Ljava/lang/String;
      // b42: invokestatic qeaa361f143ee4a0894bd168fd9b30c66/qf4ccf8f5435d4a78bdca4d6a018b578e/aabbaaaba.abba (Ljava/lang/String;)Ljava/lang/String;
      // b45: invokestatic qeaa361f143ee4a0894bd168fd9b30c66/qf4ccf8f5435d4a78bdca4d6a018b578e/aabbabbbb.aaaaaa (Ljava/lang/Class;Ljava/lang/String;)Ljava/lang/reflect/Field;
      // b48: putstatic qeaa361f143ee4a0894bd168fd9b30c66/qf4ccf8f5435d4a78bdca4d6a018b578e/aabbabbbb.abab Ljava/lang/reflect/Field;
      // b4b: ldc_w net/minecraft/class_1309
      // b4e: ldc_w 604047112
      // b51: iload 60
      // b53: ldc_w 1243821602
      // b56: ixor
      // b57: invokestatic qeaa361f143ee4a0894bd168fd9b30c66/qf4ccf8f5435d4a78bdca4d6a018b578e/aabbabbbb.b (II)I
      // b5a: ldc_w 604047115
      // b5d: iload 60
      // b5f: ldc_w 1526773917
      // b62: ixor
      // b63: invokestatic qeaa361f143ee4a0894bd168fd9b30c66/qf4ccf8f5435d4a78bdca4d6a018b578e/aabbabbbb.b (II)I
      // b66: invokestatic qeaa361f143ee4a0894bd168fd9b30c66/qf4ccf8f5435d4a78bdca4d6a018b578e/aabbabbbb.bbaabaa (II)Ljava/lang/String;
      // b69: invokestatic qeaa361f143ee4a0894bd168fd9b30c66/qf4ccf8f5435d4a78bdca4d6a018b578e/aabbaaaba.abba (Ljava/lang/String;)Ljava/lang/String;
      // b6c: invokestatic qeaa361f143ee4a0894bd168fd9b30c66/qf4ccf8f5435d4a78bdca4d6a018b578e/aabbabbbb.aaaaaa (Ljava/lang/Class;Ljava/lang/String;)Ljava/lang/reflect/Field;
      // b6f: putstatic qeaa361f143ee4a0894bd168fd9b30c66/qf4ccf8f5435d4a78bdca4d6a018b578e/aabbabbbb.bbbba Ljava/lang/reflect/Field;
      // b72: aconst_null
      // b73: astore 34
      // b75: aconst_null
      // b76: astore 35
      // b78: aconst_null
      // b79: astore 36
      // b7b: ldc_w 604047114
      // b7e: iload 60
      // b80: ldc_w -1664536469
      // b83: ixor
      // b84: invokestatic qeaa361f143ee4a0894bd168fd9b30c66/qf4ccf8f5435d4a78bdca4d6a018b578e/aabbabbbb.b (II)I
      // b87: ldc_w 604047117
      // b8a: iload 60
      // b8c: ldc_w 108115225
      // b8f: ixor
      // b90: invokestatic qeaa361f143ee4a0894bd168fd9b30c66/qf4ccf8f5435d4a78bdca4d6a018b578e/aabbabbbb.b (II)I
      // b93: invokestatic qeaa361f143ee4a0894bd168fd9b30c66/qf4ccf8f5435d4a78bdca4d6a018b578e/aabbabbbb.bbaabaa (II)Ljava/lang/String;
      // b96: invokestatic qeaa361f143ee4a0894bd168fd9b30c66/qf4ccf8f5435d4a78bdca4d6a018b578e/aabbaaaba.abba (Ljava/lang/String;)Ljava/lang/String;
      // b99: invokestatic java/lang/Class.forName (Ljava/lang/String;)Ljava/lang/Class;
      // b9c: astore 37
      // b9e: aload 37
      // ba0: ldc_w 604047116
      // ba3: iload 60
      // ba5: ldc_w -887804433
      // ba8: ixor
      // ba9: invokestatic qeaa361f143ee4a0894bd168fd9b30c66/qf4ccf8f5435d4a78bdca4d6a018b578e/aabbabbbb.b (II)I
      // bac: ldc_w 604047119
      // baf: iload 60
      // bb1: ldc_w 293858699
      // bb4: ixor
      // bb5: invokestatic qeaa361f143ee4a0894bd168fd9b30c66/qf4ccf8f5435d4a78bdca4d6a018b578e/aabbabbbb.b (II)I
      // bb8: invokestatic qeaa361f143ee4a0894bd168fd9b30c66/qf4ccf8f5435d4a78bdca4d6a018b578e/aabbabbbb.bbaabaa (II)Ljava/lang/String;
      // bbb: invokestatic qeaa361f143ee4a0894bd168fd9b30c66/qf4ccf8f5435d4a78bdca4d6a018b578e/aabbaaaba.abba (Ljava/lang/String;)Ljava/lang/String;
      // bbe: bipush 1
      // bbf: anewarray 810
      // bc2: dup
      // bc3: bipush 0
      // bc4: ldc_w net/minecraft/class_276
      // bc7: aastore
      // bc8: invokevirtual java/lang/Class.getMethod (Ljava/lang/String;[Ljava/lang/Class;)Ljava/lang/reflect/Method;
      // bcb: astore 34
      // bcd: goto bd2
      // bd0: astore 38
      // bd2: aload 37
      // bd4: ldc_w 604047118
      // bd7: iload 60
      // bd9: ldc_w -304786930
      // bdc: ixor
      // bdd: invokestatic qeaa361f143ee4a0894bd168fd9b30c66/qf4ccf8f5435d4a78bdca4d6a018b578e/aabbabbbb.b (II)I
      // be0: ldc_w 604047105
      // be3: iload 60
      // be5: ldc_w 452967692
      // be8: ixor
      // be9: invokestatic qeaa361f143ee4a0894bd168fd9b30c66/qf4ccf8f5435d4a78bdca4d6a018b578e/aabbabbbb.b (II)I
      // bec: invokestatic qeaa361f143ee4a0894bd168fd9b30c66/qf4ccf8f5435d4a78bdca4d6a018b578e/aabbabbbb.bbaabaa (II)Ljava/lang/String;
      // bef: invokestatic qeaa361f143ee4a0894bd168fd9b30c66/qf4ccf8f5435d4a78bdca4d6a018b578e/aabbaaaba.abba (Ljava/lang/String;)Ljava/lang/String;
      // bf2: bipush 2
      // bf3: anewarray 810
      // bf6: dup
      // bf7: bipush 0
      // bf8: ldc_w net/minecraft/class_276
      // bfb: aastore
      // bfc: dup
      // bfd: bipush 1
      // bfe: ldc_w java/util/function/Consumer
      // c01: aastore
      // c02: invokevirtual java/lang/Class.getMethod (Ljava/lang/String;[Ljava/lang/Class;)Ljava/lang/reflect/Method;
      // c05: astore 35
      // c07: goto c0c
      // c0a: astore 38
      // c0c: aload 37
      // c0e: ldc_w 604047104
      // c11: iload 60
      // c13: ldc_w -660105178
      // c16: ixor
      // c17: invokestatic qeaa361f143ee4a0894bd168fd9b30c66/qf4ccf8f5435d4a78bdca4d6a018b578e/aabbabbbb.b (II)I
      // c1a: ldc_w 604047107
      // c1d: iload 60
      // c1f: ldc_w 270613701
      // c22: ixor
      // c23: invokestatic qeaa361f143ee4a0894bd168fd9b30c66/qf4ccf8f5435d4a78bdca4d6a018b578e/aabbabbbb.b (II)I
      // c26: invokestatic qeaa361f143ee4a0894bd168fd9b30c66/qf4ccf8f5435d4a78bdca4d6a018b578e/aabbabbbb.bbaabaa (II)Ljava/lang/String;
      // c29: invokestatic qeaa361f143ee4a0894bd168fd9b30c66/qf4ccf8f5435d4a78bdca4d6a018b578e/aabbaaaba.abba (Ljava/lang/String;)Ljava/lang/String;
      // c2c: bipush 3
      // c2d: anewarray 810
      // c30: dup
      // c31: bipush 0
      // c32: ldc_w net/minecraft/class_276
      // c35: aastore
      // c36: dup
      // c37: bipush 1
      // c38: getstatic java/lang/Integer.TYPE Ljava/lang/Class;
      // c3b: aastore
      // c3c: dup
      // c3d: bipush 2
      // c3e: ldc_w java/util/function/Consumer
      // c41: aastore
      // c42: invokevirtual java/lang/Class.getMethod (Ljava/lang/String;[Ljava/lang/Class;)Ljava/lang/reflect/Method;
      // c45: astore 36
      // c47: goto c4c
      // c4a: astore 38
      // c4c: goto c51
      // c4f: astore 37
      // c51: aload 34
      // c53: putstatic qeaa361f143ee4a0894bd168fd9b30c66/qf4ccf8f5435d4a78bdca4d6a018b578e/aabbabbbb.bbaa Ljava/lang/reflect/Method;
      // c56: aload 35
      // c58: putstatic qeaa361f143ee4a0894bd168fd9b30c66/qf4ccf8f5435d4a78bdca4d6a018b578e/aabbabbbb.aaab Ljava/lang/reflect/Method;
      // c5b: aload 36
      // c5d: putstatic qeaa361f143ee4a0894bd168fd9b30c66/qf4ccf8f5435d4a78bdca4d6a018b578e/aabbabbbb.abbb Ljava/lang/reflect/Method;
      // c60: aconst_null
      // c61: astore 37
      // c63: ldc net/minecraft/class_3675
      // c65: invokevirtual java/lang/Class.getMethods ()[Ljava/lang/reflect/Method;
      // c68: astore 38
      // c6a: aload 38
      // c6c: arraylength
      // c6d: istore 39
      // c6f: bipush 0
      // c70: istore 40
      // c72: iload 40
      // c74: iload 39
      // c76: if_icmpge cf2
      // c79: aload 38
      // c7b: iload 40
      // c7d: aaload
      // c7e: astore 41
      // c80: aload 41
      // c82: invokevirtual java/lang/reflect/Method.getParameterTypes ()[Ljava/lang/Class;
      // c85: astore 42
      // c87: aload 41
      // c89: invokevirtual java/lang/reflect/Method.getName ()Ljava/lang/String;
      // c8c: ldc_w 604047106
      // c8f: iload 60
      // c91: ldc_w 1165812294
      // c94: ixor
      // c95: invokestatic qeaa361f143ee4a0894bd168fd9b30c66/qf4ccf8f5435d4a78bdca4d6a018b578e/aabbabbbb.b (II)I
      // c98: ldc_w 604047109
      // c9b: iload 60
      // c9d: ldc_w -1163034591
      // ca0: ixor
      // ca1: invokestatic qeaa361f143ee4a0894bd168fd9b30c66/qf4ccf8f5435d4a78bdca4d6a018b578e/aabbabbbb.b (II)I
      // ca4: invokestatic qeaa361f143ee4a0894bd168fd9b30c66/qf4ccf8f5435d4a78bdca4d6a018b578e/aabbabbbb.bbaabaa (II)Ljava/lang/String;
      // ca7: invokestatic qeaa361f143ee4a0894bd168fd9b30c66/qf4ccf8f5435d4a78bdca4d6a018b578e/aabbaaaba.abba (Ljava/lang/String;)Ljava/lang/String;
      // caa: invokevirtual java/lang/String.equals (Ljava/lang/Object;)Z
      // cad: ifeq cec
      // cb0: aload 42
      // cb2: arraylength
      // cb3: bipush 2
      // cb4: if_icmpne cec
      // cb7: goto cbb
      // cba: athrow
      // cbb: aload 42
      // cbd: bipush 1
      // cbe: aaload
      // cbf: getstatic java/lang/Integer.TYPE Ljava/lang/Class;
      // cc2: if_acmpeq ccd
      // cc5: goto cc9
      // cc8: athrow
      // cc9: goto cec
      // ccc: athrow
      // ccd: aload 42
      // ccf: bipush 0
      // cd0: aaload
      // cd1: getstatic java/lang/Long.TYPE Ljava/lang/Class;
      // cd4: if_acmpeq ce5
      // cd7: aload 42
      // cd9: bipush 0
      // cda: aaload
      // cdb: invokevirtual java/lang/Class.isPrimitive ()Z
      // cde: ifne cec
      // ce1: goto ce5
      // ce4: athrow
      // ce5: aload 41
      // ce7: astore 37
      // ce9: goto cf2
      // cec: iinc 40 1
      // cef: goto c72
      // cf2: aload 37
      // cf4: putstatic qeaa361f143ee4a0894bd168fd9b30c66/qf4ccf8f5435d4a78bdca4d6a018b578e/aabbabbbb.aababb Ljava/lang/reflect/Method;
      // cf7: ldc_w 604047108
      // cfa: iload 60
      // cfc: ldc_w 1390521137
      // cff: ixor
      // d00: invokestatic qeaa361f143ee4a0894bd168fd9b30c66/qf4ccf8f5435d4a78bdca4d6a018b578e/aabbabbbb.b (II)I
      // d03: invokestatic java/util/concurrent/ConcurrentHashMap.newKeySet ()Ljava/util/concurrent/ConcurrentHashMap$KeySetView;
      // d06: putstatic qeaa361f143ee4a0894bd168fd9b30c66/qf4ccf8f5435d4a78bdca4d6a018b578e/aabbabbbb.aaaaab Ljava/util/Set;
      // d09: ldc2_w 534081000846442569
      // d0c: invokestatic qeaa361f143ee4a0894bd168fd9b30c66/qf4ccf8f5435d4a78bdca4d6a018b578e/aabbabbbb.baabb (IJ)J
      // d0f: putstatic qeaa361f143ee4a0894bd168fd9b30c66/qf4ccf8f5435d4a78bdca4d6a018b578e/aabbabbbb.ab J
      // d12: bipush 0
      // d13: putstatic qeaa361f143ee4a0894bd168fd9b30c66/qf4ccf8f5435d4a78bdca4d6a018b578e/aabbabbbb.babba I
      // d16: return
   }

   public static boolean bbabaab(class_310 param0) {
      // $VF: Couldn't be decompiled
      // Please report this to the Vineflower issue tracker, at https://github.com/Vineflower/vineflower/issues with a copy of the class file (if you have the rights to distribute it!)
      // java.lang.RuntimeException: parsing failure!
      //   at org.jetbrains.java.decompiler.modules.decompiler.decompose.DomHelper.parseGraph(DomHelper.java:211)
      //   at org.jetbrains.java.decompiler.main.rels.MethodProcessor.codeToJava(MethodProcessor.java:166)
      //
      // Bytecode:
      // 000: ldc_w 1012550567
      // 003: istore 4
      // 005: getstatic qeaa361f143ee4a0894bd168fd9b30c66/qf4ccf8f5435d4a78bdca4d6a018b578e/baaabbaa.bba I
      // 008: istore 1
      // 009: aload 0
      // 00a: iload 1
      // 00b: ifne 01d
      // 00e: getfield net/minecraft/class_310.field_1724 Lnet/minecraft/class_746;
      // 011: ifnull 02e
      // 014: goto 018
      // 017: athrow
      // 018: aload 0
      // 019: goto 01d
      // 01c: athrow
      // 01d: getfield net/minecraft/class_310.field_1724 Lnet/minecraft/class_746;
      // 020: iload 1
      // 021: ifne 035
      // 024: getfield net/minecraft/class_746.field_3913 Lnet/minecraft/class_744;
      // 027: ifnonnull 031
      // 02a: goto 02e
      // 02d: athrow
      // 02e: bipush 0
      // 02f: ireturn
      // 030: athrow
      // 031: aload 0
      // 032: getfield net/minecraft/class_310.field_1724 Lnet/minecraft/class_746;
      // 035: getfield net/minecraft/class_746.field_3913 Lnet/minecraft/class_744;
      // 038: invokevirtual java/lang/Object.getClass ()Ljava/lang/Class;
      // 03b: ldc_w 604046824
      // 03e: iload 4
      // 040: ldc_w 1567439465
      // 043: ixor
      // 044: invokestatic qeaa361f143ee4a0894bd168fd9b30c66/qf4ccf8f5435d4a78bdca4d6a018b578e/aabbabbbb.b (II)I
      // 047: ldc_w 604046827
      // 04a: iload 4
      // 04c: ldc_w 805841894
      // 04f: ixor
      // 050: invokestatic qeaa361f143ee4a0894bd168fd9b30c66/qf4ccf8f5435d4a78bdca4d6a018b578e/aabbabbbb.b (II)I
      // 053: invokestatic qeaa361f143ee4a0894bd168fd9b30c66/qf4ccf8f5435d4a78bdca4d6a018b578e/aabbabbbb.bbaabaa (II)Ljava/lang/String;
      // 056: invokestatic qeaa361f143ee4a0894bd168fd9b30c66/qf4ccf8f5435d4a78bdca4d6a018b578e/aabbaaaba.abba (Ljava/lang/String;)Ljava/lang/String;
      // 059: invokevirtual java/lang/Class.getField (Ljava/lang/String;)Ljava/lang/reflect/Field;
      // 05c: astore 2
      // 05d: aload 2
      // 05e: aload 0
      // 05f: getfield net/minecraft/class_310.field_1724 Lnet/minecraft/class_746;
      // 062: getfield net/minecraft/class_746.field_3913 Lnet/minecraft/class_744;
      // 065: invokevirtual java/lang/reflect/Field.get (Ljava/lang/Object;)Ljava/lang/Object;
      // 068: astore 3
      // 069: aload 3
      // 06a: invokevirtual java/lang/Object.getClass ()Ljava/lang/Class;
      // 06d: ldc_w 604046826
      // 070: iload 4
      // 072: ldc_w 1747279001
      // 075: ixor
      // 076: invokestatic qeaa361f143ee4a0894bd168fd9b30c66/qf4ccf8f5435d4a78bdca4d6a018b578e/aabbabbbb.b (II)I
      // 079: ldc_w 604046829
      // 07c: iload 4
      // 07e: ldc_w 841514817
      // 081: ixor
      // 082: invokestatic qeaa361f143ee4a0894bd168fd9b30c66/qf4ccf8f5435d4a78bdca4d6a018b578e/aabbabbbb.b (II)I
      // 085: invokestatic qeaa361f143ee4a0894bd168fd9b30c66/qf4ccf8f5435d4a78bdca4d6a018b578e/aabbabbbb.bbaabaa (II)Ljava/lang/String;
      // 088: invokestatic qeaa361f143ee4a0894bd168fd9b30c66/qf4ccf8f5435d4a78bdca4d6a018b578e/aabbaaaba.abba (Ljava/lang/String;)Ljava/lang/String;
      // 08b: bipush 0
      // 08c: anewarray 810
      // 08f: invokevirtual java/lang/Class.getMethod (Ljava/lang/String;[Ljava/lang/Class;)Ljava/lang/reflect/Method;
      // 092: aload 3
      // 093: bipush 0
      // 094: anewarray 4
      // 097: invokevirtual java/lang/reflect/Method.invoke (Ljava/lang/Object;[Ljava/lang/Object;)Ljava/lang/Object;
      // 09a: checkcast java/lang/Boolean
      // 09d: invokevirtual java/lang/Boolean.booleanValue ()Z
      // 0a0: iload 1
      // 0a1: ifne 17e
      // 0a4: ifne 17d
      // 0a7: goto 0ab
      // 0aa: athrow
      // 0ab: aload 3
      // 0ac: invokevirtual java/lang/Object.getClass ()Ljava/lang/Class;
      // 0af: ldc_w 604046828
      // 0b2: iload 4
      // 0b4: ldc_w -1303301612
      // 0b7: ixor
      // 0b8: invokestatic qeaa361f143ee4a0894bd168fd9b30c66/qf4ccf8f5435d4a78bdca4d6a018b578e/aabbabbbb.b (II)I
      // 0bb: ldc_w 604046831
      // 0be: iload 4
      // 0c0: ldc_w -708681708
      // 0c3: ixor
      // 0c4: invokestatic qeaa361f143ee4a0894bd168fd9b30c66/qf4ccf8f5435d4a78bdca4d6a018b578e/aabbabbbb.b (II)I
      // 0c7: invokestatic qeaa361f143ee4a0894bd168fd9b30c66/qf4ccf8f5435d4a78bdca4d6a018b578e/aabbabbbb.bbaabaa (II)Ljava/lang/String;
      // 0ca: invokestatic qeaa361f143ee4a0894bd168fd9b30c66/qf4ccf8f5435d4a78bdca4d6a018b578e/aabbaaaba.abba (Ljava/lang/String;)Ljava/lang/String;
      // 0cd: bipush 0
      // 0ce: anewarray 810
      // 0d1: invokevirtual java/lang/Class.getMethod (Ljava/lang/String;[Ljava/lang/Class;)Ljava/lang/reflect/Method;
      // 0d4: aload 3
      // 0d5: bipush 0
      // 0d6: anewarray 4
      // 0d9: invokevirtual java/lang/reflect/Method.invoke (Ljava/lang/Object;[Ljava/lang/Object;)Ljava/lang/Object;
      // 0dc: checkcast java/lang/Boolean
      // 0df: invokevirtual java/lang/Boolean.booleanValue ()Z
      // 0e2: iload 1
      // 0e3: ifne 17e
      // 0e6: goto 0ea
      // 0e9: athrow
      // 0ea: ifne 17d
      // 0ed: goto 0f1
      // 0f0: athrow
      // 0f1: aload 3
      // 0f2: invokevirtual java/lang/Object.getClass ()Ljava/lang/Class;
      // 0f5: ldc_w 604046830
      // 0f8: iload 4
      // 0fa: ldc_w -686231887
      // 0fd: ixor
      // 0fe: invokestatic qeaa361f143ee4a0894bd168fd9b30c66/qf4ccf8f5435d4a78bdca4d6a018b578e/aabbabbbb.b (II)I
      // 101: ldc_w 604046817
      // 104: iload 4
      // 106: ldc_w 2139175800
      // 109: ixor
      // 10a: invokestatic qeaa361f143ee4a0894bd168fd9b30c66/qf4ccf8f5435d4a78bdca4d6a018b578e/aabbabbbb.b (II)I
      // 10d: invokestatic qeaa361f143ee4a0894bd168fd9b30c66/qf4ccf8f5435d4a78bdca4d6a018b578e/aabbabbbb.bbaabaa (II)Ljava/lang/String;
      // 110: invokestatic qeaa361f143ee4a0894bd168fd9b30c66/qf4ccf8f5435d4a78bdca4d6a018b578e/aabbaaaba.abba (Ljava/lang/String;)Ljava/lang/String;
      // 113: bipush 0
      // 114: anewarray 810
      // 117: invokevirtual java/lang/Class.getMethod (Ljava/lang/String;[Ljava/lang/Class;)Ljava/lang/reflect/Method;
      // 11a: aload 3
      // 11b: bipush 0
      // 11c: anewarray 4
      // 11f: invokevirtual java/lang/reflect/Method.invoke (Ljava/lang/Object;[Ljava/lang/Object;)Ljava/lang/Object;
      // 122: checkcast java/lang/Boolean
      // 125: invokevirtual java/lang/Boolean.booleanValue ()Z
      // 128: iload 1
      // 129: ifne 17e
      // 12c: goto 130
      // 12f: athrow
      // 130: ifne 17d
      // 133: goto 137
      // 136: athrow
      // 137: aload 3
      // 138: invokevirtual java/lang/Object.getClass ()Ljava/lang/Class;
      // 13b: ldc_w 604046816
      // 13e: iload 4
      // 140: ldc_w -1143889408
      // 143: ixor
      // 144: invokestatic qeaa361f143ee4a0894bd168fd9b30c66/qf4ccf8f5435d4a78bdca4d6a018b578e/aabbabbbb.b (II)I
      // 147: ldc_w 604046819
      // 14a: iload 4
      // 14c: ldc_w 1908073527
      // 14f: ixor
      // 150: invokestatic qeaa361f143ee4a0894bd168fd9b30c66/qf4ccf8f5435d4a78bdca4d6a018b578e/aabbabbbb.b (II)I
      // 153: invokestatic qeaa361f143ee4a0894bd168fd9b30c66/qf4ccf8f5435d4a78bdca4d6a018b578e/aabbabbbb.bbaabaa (II)Ljava/lang/String;
      // 156: invokestatic qeaa361f143ee4a0894bd168fd9b30c66/qf4ccf8f5435d4a78bdca4d6a018b578e/aabbaaaba.abba (Ljava/lang/String;)Ljava/lang/String;
      // 159: bipush 0
      // 15a: anewarray 810
      // 15d: invokevirtual java/lang/Class.getMethod (Ljava/lang/String;[Ljava/lang/Class;)Ljava/lang/reflect/Method;
      // 160: aload 3
      // 161: bipush 0
      // 162: anewarray 4
      // 165: invokevirtual java/lang/reflect/Method.invoke (Ljava/lang/Object;[Ljava/lang/Object;)Ljava/lang/Object;
      // 168: checkcast java/lang/Boolean
      // 16b: invokevirtual java/lang/Boolean.booleanValue ()Z
      // 16e: iload 1
      // 16f: ifne 17e
      // 172: goto 176
      // 175: athrow
      // 176: ifeq 181
      // 179: goto 17d
      // 17c: athrow
      // 17d: bipush 1
      // 17e: goto 182
      // 181: bipush 0
      // 182: ireturn
      // 183: astore 2
      // 184: aload 0
      // 185: getfield net/minecraft/class_310.field_1724 Lnet/minecraft/class_746;
      // 188: getfield net/minecraft/class_746.field_3913 Lnet/minecraft/class_744;
      // 18b: invokevirtual java/lang/Object.getClass ()Ljava/lang/Class;
      // 18e: ldc_w 604046818
      // 191: iload 4
      // 193: ldc_w 1742980212
      // 196: ixor
      // 197: invokestatic qeaa361f143ee4a0894bd168fd9b30c66/qf4ccf8f5435d4a78bdca4d6a018b578e/aabbabbbb.b (II)I
      // 19a: ldc_w 604046821
      // 19d: iload 4
      // 19f: ldc_w 2071006627
      // 1a2: ixor
      // 1a3: invokestatic qeaa361f143ee4a0894bd168fd9b30c66/qf4ccf8f5435d4a78bdca4d6a018b578e/aabbabbbb.b (II)I
      // 1a6: invokestatic qeaa361f143ee4a0894bd168fd9b30c66/qf4ccf8f5435d4a78bdca4d6a018b578e/aabbabbbb.bbaabaa (II)Ljava/lang/String;
      // 1a9: invokestatic qeaa361f143ee4a0894bd168fd9b30c66/qf4ccf8f5435d4a78bdca4d6a018b578e/aabbaaaba.abba (Ljava/lang/String;)Ljava/lang/String;
      // 1ac: invokevirtual java/lang/Class.getField (Ljava/lang/String;)Ljava/lang/reflect/Field;
      // 1af: aload 0
      // 1b0: getfield net/minecraft/class_310.field_1724 Lnet/minecraft/class_746;
      // 1b3: getfield net/minecraft/class_746.field_3913 Lnet/minecraft/class_744;
      // 1b6: invokevirtual java/lang/reflect/Field.getBoolean (Ljava/lang/Object;)Z
      // 1b9: iload 1
      // 1ba: ifne 291
      // 1bd: ifne 290
      // 1c0: goto 1c4
      // 1c3: athrow
      // 1c4: aload 0
      // 1c5: getfield net/minecraft/class_310.field_1724 Lnet/minecraft/class_746;
      // 1c8: getfield net/minecraft/class_746.field_3913 Lnet/minecraft/class_744;
      // 1cb: invokevirtual java/lang/Object.getClass ()Ljava/lang/Class;
      // 1ce: ldc_w 604046820
      // 1d1: iload 4
      // 1d3: ldc_w -851513391
      // 1d6: ixor
      // 1d7: invokestatic qeaa361f143ee4a0894bd168fd9b30c66/qf4ccf8f5435d4a78bdca4d6a018b578e/aabbabbbb.b (II)I
      // 1da: ldc_w 604046823
      // 1dd: iload 4
      // 1df: ldc_w -505262550
      // 1e2: ixor
      // 1e3: invokestatic qeaa361f143ee4a0894bd168fd9b30c66/qf4ccf8f5435d4a78bdca4d6a018b578e/aabbabbbb.b (II)I
      // 1e6: invokestatic qeaa361f143ee4a0894bd168fd9b30c66/qf4ccf8f5435d4a78bdca4d6a018b578e/aabbabbbb.bbaabaa (II)Ljava/lang/String;
      // 1e9: invokestatic qeaa361f143ee4a0894bd168fd9b30c66/qf4ccf8f5435d4a78bdca4d6a018b578e/aabbaaaba.abba (Ljava/lang/String;)Ljava/lang/String;
      // 1ec: invokevirtual java/lang/Class.getField (Ljava/lang/String;)Ljava/lang/reflect/Field;
      // 1ef: aload 0
      // 1f0: getfield net/minecraft/class_310.field_1724 Lnet/minecraft/class_746;
      // 1f3: getfield net/minecraft/class_746.field_3913 Lnet/minecraft/class_744;
      // 1f6: invokevirtual java/lang/reflect/Field.getBoolean (Ljava/lang/Object;)Z
      // 1f9: iload 1
      // 1fa: ifne 291
      // 1fd: goto 201
      // 200: athrow
      // 201: ifne 290
      // 204: goto 208
      // 207: athrow
      // 208: aload 0
      // 209: getfield net/minecraft/class_310.field_1724 Lnet/minecraft/class_746;
      // 20c: getfield net/minecraft/class_746.field_3913 Lnet/minecraft/class_744;
      // 20f: invokevirtual java/lang/Object.getClass ()Ljava/lang/Class;
      // 212: ldc_w 604046822
      // 215: iload 4
      // 217: ldc_w 1390900938
      // 21a: ixor
      // 21b: invokestatic qeaa361f143ee4a0894bd168fd9b30c66/qf4ccf8f5435d4a78bdca4d6a018b578e/aabbabbbb.b (II)I
      // 21e: ldc_w 604046841
      // 221: iload 4
      // 223: ldc_w -1219075191
      // 226: ixor
      // 227: invokestatic qeaa361f143ee4a0894bd168fd9b30c66/qf4ccf8f5435d4a78bdca4d6a018b578e/aabbabbbb.b (II)I
      // 22a: invokestatic qeaa361f143ee4a0894bd168fd9b30c66/qf4ccf8f5435d4a78bdca4d6a018b578e/aabbabbbb.bbaabaa (II)Ljava/lang/String;
      // 22d: invokestatic qeaa361f143ee4a0894bd168fd9b30c66/qf4ccf8f5435d4a78bdca4d6a018b578e/aabbaaaba.abba (Ljava/lang/String;)Ljava/lang/String;
      // 230: invokevirtual java/lang/Class.getField (Ljava/lang/String;)Ljava/lang/reflect/Field;
      // 233: aload 0
      // 234: getfield net/minecraft/class_310.field_1724 Lnet/minecraft/class_746;
      // 237: getfield net/minecraft/class_746.field_3913 Lnet/minecraft/class_744;
      // 23a: invokevirtual java/lang/reflect/Field.getBoolean (Ljava/lang/Object;)Z
      // 23d: iload 1
      // 23e: ifne 291
      // 241: goto 245
      // 244: athrow
      // 245: ifne 290
      // 248: goto 24c
      // 24b: athrow
      // 24c: aload 0
      // 24d: getfield net/minecraft/class_310.field_1724 Lnet/minecraft/class_746;
      // 250: getfield net/minecraft/class_746.field_3913 Lnet/minecraft/class_744;
      // 253: invokevirtual java/lang/Object.getClass ()Ljava/lang/Class;
      // 256: ldc_w 604046840
      // 259: iload 4
      // 25b: ldc_w 718427016
      // 25e: ixor
      // 25f: invokestatic qeaa361f143ee4a0894bd168fd9b30c66/qf4ccf8f5435d4a78bdca4d6a018b578e/aabbabbbb.b (II)I
      // 262: ldc_w 604046843
      // 265: iload 4
      // 267: ldc_w -274065916
      // 26a: ixor
      // 26b: invokestatic qeaa361f143ee4a0894bd168fd9b30c66/qf4ccf8f5435d4a78bdca4d6a018b578e/aabbabbbb.b (II)I
      // 26e: invokestatic qeaa361f143ee4a0894bd168fd9b30c66/qf4ccf8f5435d4a78bdca4d6a018b578e/aabbabbbb.bbaabaa (II)Ljava/lang/String;
      // 271: invokestatic qeaa361f143ee4a0894bd168fd9b30c66/qf4ccf8f5435d4a78bdca4d6a018b578e/aabbaaaba.abba (Ljava/lang/String;)Ljava/lang/String;
      // 274: invokevirtual java/lang/Class.getField (Ljava/lang/String;)Ljava/lang/reflect/Field;
      // 277: aload 0
      // 278: getfield net/minecraft/class_310.field_1724 Lnet/minecraft/class_746;
      // 27b: getfield net/minecraft/class_746.field_3913 Lnet/minecraft/class_744;
      // 27e: invokevirtual java/lang/reflect/Field.getBoolean (Ljava/lang/Object;)Z
      // 281: iload 1
      // 282: ifne 291
      // 285: goto 289
      // 288: athrow
      // 289: ifeq 294
      // 28c: goto 290
      // 28f: athrow
      // 290: bipush 1
      // 291: goto 295
      // 294: bipush 0
      // 295: ireturn
      // 296: astore 3
      // 297: bipush 0
      // 298: ireturn
   }

   public static boolean bbababa(class_310 param0, class_3965 param1) {
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
      // 09: ifnull 32
      // 0c: goto 10
      // 0f: athrow
      // 10: aload 0
      // 11: iload 2
      // 12: ifne 24
      // 15: getfield net/minecraft/class_310.field_1724 Lnet/minecraft/class_746;
      // 18: ifnull 32
      // 1b: goto 1f
      // 1e: athrow
      // 1f: aload 0
      // 20: goto 24
      // 23: athrow
      // 24: getfield net/minecraft/class_310.field_1761 Lnet/minecraft/class_636;
      // 27: ifnull 32
      // 2a: aload 1
      // 2b: ifnonnull 35
      // 2e: goto 32
      // 31: athrow
      // 32: bipush 0
      // 33: ireturn
      // 34: athrow
      // 35: aload 0
      // 36: iload 2
      // 37: ifne 48
      // 3a: invokestatic qeaa361f143ee4a0894bd168fd9b30c66/qf4ccf8f5435d4a78bdca4d6a018b578e/aabbabbbb.aaaaba (Lnet/minecraft/class_310;)Z
      // 3d: ifne 47
      // 40: goto 44
      // 43: athrow
      // 44: bipush 0
      // 45: ireturn
      // 46: athrow
      // 47: aload 0
      // 48: invokestatic qeaa361f143ee4a0894bd168fd9b30c66/qf4ccf8f5435d4a78bdca4d6a018b578e/aabbabbbb.bbbaaab (Lnet/minecraft/class_310;)I
      // 4b: istore 3
      // 4c: aload 0
      // 4d: getstatic net/minecraft/class_1268.field_5808 Lnet/minecraft/class_1268;
      // 50: aload 1
      // 51: invokestatic qeaa361f143ee4a0894bd168fd9b30c66/qf4ccf8f5435d4a78bdca4d6a018b578e/aabbabbbb.babbbaa (Lnet/minecraft/class_310;Lnet/minecraft/class_1268;Lnet/minecraft/class_3965;)Lnet/minecraft/class_1269;
      // 54: astore 4
      // 56: aload 4
      // 58: iload 2
      // 59: ifne 65
      // 5c: ifnull 79
      // 5f: goto 63
      // 62: athrow
      // 63: aload 4
      // 65: invokeinterface net/minecraft/class_1269.method_23665 ()Z 1
      // 6a: iload 2
      // 6b: ifne 76
      // 6e: ifeq 79
      // 71: goto 75
      // 74: athrow
      // 75: bipush 1
      // 76: goto 7a
      // 79: bipush 0
      // 7a: istore 5
      // 7c: iload 5
      // 7e: iload 2
      // 7f: ifne 93
      // 82: ifeq 91
      // 85: goto 89
      // 88: athrow
      // 89: aload 0
      // 8a: invokestatic qeaa361f143ee4a0894bd168fd9b30c66/qf4ccf8f5435d4a78bdca4d6a018b578e/aabbabbbb.baaaaba (Lnet/minecraft/class_310;)V
      // 8d: goto 91
      // 90: athrow
      // 91: iload 5
      // 93: istore 6
      // 95: iload 3
      // 96: iload 2
      // 97: ifne ac
      // 9a: ifle aa
      // 9d: goto a1
      // a0: athrow
      // a1: aload 0
      // a2: iload 3
      // a3: invokestatic qeaa361f143ee4a0894bd168fd9b30c66/qf4ccf8f5435d4a78bdca4d6a018b578e/bbbabaa.aaaa (Lnet/minecraft/class_310;I)V
      // a6: goto aa
      // a9: athrow
      // aa: iload 6
      // ac: ireturn
      // ad: astore 7
      // af: iload 3
      // b0: ifle bc
      // b3: aload 0
      // b4: iload 3
      // b5: invokestatic qeaa361f143ee4a0894bd168fd9b30c66/qf4ccf8f5435d4a78bdca4d6a018b578e/bbbabaa.aaaa (Lnet/minecraft/class_310;I)V
      // b8: goto bc
      // bb: athrow
      // bc: aload 7
      // be: athrow
   }

   public static boolean bbababb(class_310 param0) {
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
      // 06: ifne 11
      // 09: ifnull 32
      // 0c: goto 10
      // 0f: athrow
      // 10: aload 0
      // 11: iload 1
      // 12: ifne 24
      // 15: getfield net/minecraft/class_310.field_1724 Lnet/minecraft/class_746;
      // 18: ifnull 32
      // 1b: goto 1f
      // 1e: athrow
      // 1f: aload 0
      // 20: goto 24
      // 23: athrow
      // 24: iload 1
      // 25: ifne 3a
      // 28: getfield net/minecraft/class_310.field_1761 Lnet/minecraft/class_636;
      // 2b: ifnonnull 35
      // 2e: goto 32
      // 31: athrow
      // 32: bipush 0
      // 33: ireturn
      // 34: athrow
      // 35: aload 0
      // 36: invokestatic qeaa361f143ee4a0894bd168fd9b30c66/qf4ccf8f5435d4a78bdca4d6a018b578e/aabbabbbb.aabbaba (Lnet/minecraft/class_310;)V
      // 39: aload 0
      // 3a: invokestatic qeaa361f143ee4a0894bd168fd9b30c66/qf4ccf8f5435d4a78bdca4d6a018b578e/aabbabbbb.abbabba (Lnet/minecraft/class_310;)Lnet/minecraft/class_1297;
      // 3d: astore 2
      // 3e: aload 0
      // 3f: iload 1
      // 40: ifne 52
      // 43: aload 2
      // 44: invokestatic qeaa361f143ee4a0894bd168fd9b30c66/qf4ccf8f5435d4a78bdca4d6a018b578e/aabbabbbb.bbaabb (Lnet/minecraft/class_310;Lnet/minecraft/class_1297;)Z
      // 47: ifeq 51
      // 4a: goto 4e
      // 4d: athrow
      // 4e: bipush 0
      // 4f: ireturn
      // 50: athrow
      // 51: aload 0
      // 52: invokestatic qeaa361f143ee4a0894bd168fd9b30c66/qf4ccf8f5435d4a78bdca4d6a018b578e/aabbabbbb.aaaab (Lnet/minecraft/class_310;)Z
      // 55: ireturn
   }

   public static boolean bbabbaa() {
      return ba;
   }

   public static void bbabbab(class_310 param0, float param1, float param2) {
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
      // 06: ifne 11
      // 09: ifnull 1f
      // 0c: goto 10
      // 0f: athrow
      // 10: aload 0
      // 11: iload 3
      // 12: ifne 22
      // 15: getfield net/minecraft/class_310.field_1724 Lnet/minecraft/class_746;
      // 18: ifnonnull 21
      // 1b: goto 1f
      // 1e: athrow
      // 1f: return
      // 20: athrow
      // 21: aload 0
      // 22: fload 1
      // 23: fload 2
      // 24: invokestatic qeaa361f143ee4a0894bd168fd9b30c66/qf4ccf8f5435d4a78bdca4d6a018b578e/bbabbbb.aaaba (Lnet/minecraft/class_310;FF)[F
      // 27: astore 4
      // 29: aload 4
      // 2b: ifnonnull 30
      // 2e: return
      // 2f: athrow
      // 30: aload 0
      // 31: getfield net/minecraft/class_310.field_1724 Lnet/minecraft/class_746;
      // 34: invokevirtual net/minecraft/class_746.method_36454 ()F
      // 37: fstore 5
      // 39: aload 0
      // 3a: getfield net/minecraft/class_310.field_1724 Lnet/minecraft/class_746;
      // 3d: invokevirtual net/minecraft/class_746.method_36455 ()F
      // 40: ldc_w -90.0
      // 43: ldc_w 90.0
      // 46: invokestatic net/minecraft/class_3532.method_15363 (FFF)F
      // 49: fstore 6
      // 4b: aload 4
      // 4d: bipush 0
      // 4e: faload
      // 4f: fload 5
      // 51: fsub
      // 52: invokestatic net/minecraft/class_3532.method_15393 (F)F
      // 55: fstore 7
      // 57: aload 4
      // 59: bipush 1
      // 5a: faload
      // 5b: fload 6
      // 5d: fsub
      // 5e: fstore 8
      // 60: fload 7
      // 62: iload 3
      // 63: ifne 76
      // 66: invokestatic java/lang/Float.isFinite (F)Z
      // 69: ifeq 84
      // 6c: goto 70
      // 6f: athrow
      // 70: fload 8
      // 72: goto 76
      // 75: athrow
      // 76: iload 3
      // 77: ifne 94
      // 7a: invokestatic java/lang/Float.isFinite (F)Z
      // 7d: ifne 86
      // 80: goto 84
      // 83: athrow
      // 84: return
      // 85: athrow
      // 86: fload 5
      // 88: fload 7
      // 8a: ldc_w -45.0
      // 8d: ldc_w 45.0
      // 90: invokestatic net/minecraft/class_3532.method_15363 (FFF)F
      // 93: fadd
      // 94: fstore 9
      // 96: fload 6
      // 98: fload 8
      // 9a: ldc_w -45.0
      // 9d: ldc_w 45.0
      // a0: invokestatic net/minecraft/class_3532.method_15363 (FFF)F
      // a3: fadd
      // a4: ldc_w -90.0
      // a7: ldc_w 90.0
      // aa: invokestatic net/minecraft/class_3532.method_15363 (FFF)F
      // ad: fstore 10
      // af: aload 0
      // b0: getfield net/minecraft/class_310.field_1724 Lnet/minecraft/class_746;
      // b3: fload 9
      // b5: invokevirtual net/minecraft/class_746.method_36456 (F)V
      // b8: aload 0
      // b9: getfield net/minecraft/class_310.field_1724 Lnet/minecraft/class_746;
      // bc: fload 10
      // be: invokevirtual net/minecraft/class_746.method_36457 (F)V
      // c1: aload 0
      // c2: fload 9
      // c4: invokestatic qeaa361f143ee4a0894bd168fd9b30c66/qf4ccf8f5435d4a78bdca4d6a018b578e/aabbabbbb.bbbaaaa (Lnet/minecraft/class_310;F)V
      // c7: return
   }

   public static boolean bbabbba(class_310 param0, int param1) {
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
      // 09: ifnull 4a
      // 0c: goto 10
      // 0f: athrow
      // 10: aload 0
      // 11: getfield net/minecraft/class_310.field_1724 Lnet/minecraft/class_746;
      // 14: ifnull 4a
      // 17: iload 1
      // 18: iload 2
      // 19: ifne 4f
      // 1c: goto 20
      // 1f: athrow
      // 20: iflt 4a
      // 23: goto 27
      // 26: athrow
      // 27: iload 1
      // 28: iload 2
      // 29: ifne 4f
      // 2c: goto 30
      // 2f: athrow
      // 30: ldc_w 604046842
      // 33: ldc_w 311863664
      // 36: ldc_w 953863631
      // 39: ixor
      // 3a: invokestatic qeaa361f143ee4a0894bd168fd9b30c66/qf4ccf8f5435d4a78bdca4d6a018b578e/aabbabbbb.b (II)I
      // 3d: ldc2_w 6146930655705273313
      // 40: invokestatic qeaa361f143ee4a0894bd168fd9b30c66/qf4ccf8f5435d4a78bdca4d6a018b578e/aabbabbbb.aaaaa (IJ)I
      // 43: if_icmple 50
      // 46: goto 4a
      // 49: athrow
      // 4a: bipush 0
      // 4b: goto 4f
      // 4e: athrow
      // 4f: ireturn
      // 50: aload 0
      // 51: getfield net/minecraft/class_310.field_1724 Lnet/minecraft/class_746;
      // 54: invokevirtual net/minecraft/class_746.method_31548 ()Lnet/minecraft/class_1661;
      // 57: astore 3
      // 58: aload 0
      // 59: iload 2
      // 5a: ifne 70
      // 5d: iload 1
      // 5e: bipush 1
      // 5f: invokestatic qeaa361f143ee4a0894bd168fd9b30c66/qf4ccf8f5435d4a78bdca4d6a018b578e/aabbabbbb.ababaaa (Lnet/minecraft/class_310;IZ)V
      // 62: getstatic qeaa361f143ee4a0894bd168fd9b30c66/qf4ccf8f5435d4a78bdca4d6a018b578e/aabbabbbb.babaa Z
      // 65: ifne 6f
      // 68: goto 6c
      // 6b: athrow
      // 6c: bipush 0
      // 6d: ireturn
      // 6e: athrow
      // 6f: aload 0
      // 70: invokestatic qeaa361f143ee4a0894bd168fd9b30c66/qf4ccf8f5435d4a78bdca4d6a018b578e/aabbabbbb.aabaa (Lnet/minecraft/class_310;)V
      // 73: aload 3
      // 74: invokestatic qeaa361f143ee4a0894bd168fd9b30c66/qf4ccf8f5435d4a78bdca4d6a018b578e/aabbabbbb.abaabaa (Lnet/minecraft/class_1661;)I
      // 77: iload 2
      // 78: ifne 8a
      // 7b: iload 1
      // 7c: if_icmpne a7
      // 7f: goto 83
      // 82: athrow
      // 83: getstatic qeaa361f143ee4a0894bd168fd9b30c66/qf4ccf8f5435d4a78bdca4d6a018b578e/aabbabbbb.aaaab I
      // 86: goto 8a
      // 89: athrow
      // 8a: iload 2
      // 8b: ifne 98
      // 8e: ifge a7
      // 91: goto 95
      // 94: athrow
      // 95: getstatic qeaa361f143ee4a0894bd168fd9b30c66/qf4ccf8f5435d4a78bdca4d6a018b578e/aabbabbbb.baaba Z
      // 98: iload 2
      // 99: ifne a4
      // 9c: ifne a7
      // 9f: goto a3
      // a2: athrow
      // a3: bipush 1
      // a4: goto a8
      // a7: bipush 0
      // a8: ireturn
   }

   private aabbabbbb() {
   }

   private static Field bbabbbb(class_744 param0) {
      // $VF: Couldn't be decompiled
      // Please report this to the Vineflower issue tracker, at https://github.com/Vineflower/vineflower/issues with a copy of the class file (if you have the rights to distribute it!)
      // java.lang.RuntimeException: parsing failure!
      //   at org.jetbrains.java.decompiler.modules.decompiler.decompose.DomHelper.parseGraph(DomHelper.java:211)
      //   at org.jetbrains.java.decompiler.main.rels.MethodProcessor.codeToJava(MethodProcessor.java:166)
      //
      // Bytecode:
      // 00: getstatic qeaa361f143ee4a0894bd168fd9b30c66/qf4ccf8f5435d4a78bdca4d6a018b578e/baaabbaa.bba I
      // 03: getstatic qeaa361f143ee4a0894bd168fd9b30c66/qf4ccf8f5435d4a78bdca4d6a018b578e/aabbabbbb.bbb Ljava/lang/reflect/Field;
      // 06: astore 2
      // 07: istore 1
      // 08: aload 2
      // 09: iload 1
      // 0a: ifne 15
      // 0d: ifnull 16
      // 10: goto 14
      // 13: athrow
      // 14: aload 2
      // 15: areturn
      // 16: aload 0
      // 17: invokevirtual java/lang/Object.getClass ()Ljava/lang/Class;
      // 1a: astore 3
      // 1b: aload 3
      // 1c: ifnull 9a
      // 1f: aload 3
      // 20: iload 1
      // 21: ifne 32
      // 24: ldc java/lang/Object
      // 26: if_acmpeq 9a
      // 29: goto 2d
      // 2c: athrow
      // 2d: aload 3
      // 2e: goto 32
      // 31: athrow
      // 32: invokevirtual java/lang/Class.getDeclaredFields ()[Ljava/lang/reflect/Field;
      // 35: astore 4
      // 37: aload 4
      // 39: arraylength
      // 3a: istore 5
      // 3c: bipush 0
      // 3d: istore 6
      // 3f: iload 6
      // 41: iload 5
      // 43: if_icmpge 91
      // 46: aload 4
      // 48: iload 1
      // 49: ifne 39
      // 4c: iload 6
      // 4e: aaload
      // 4f: astore 7
      // 51: iload 1
      // 52: ifne 8d
      // 55: aload 7
      // 57: invokevirtual java/lang/reflect/Field.isSynthetic ()Z
      // 5a: ifne 8a
      // 5d: goto 61
      // 60: athrow
      // 61: aload 7
      // 63: iload 1
      // 64: ifne 89
      // 67: goto 6b
      // 6a: athrow
      // 6b: invokevirtual java/lang/reflect/Field.getType ()Ljava/lang/Class;
      // 6e: ldc_w net/minecraft/class_241
      // 71: if_acmpne 8a
      // 74: goto 78
      // 77: athrow
      // 78: aload 7
      // 7a: bipush 1
      // 7b: invokevirtual java/lang/reflect/Field.setAccessible (Z)V
      // 7e: aload 7
      // 80: putstatic qeaa361f143ee4a0894bd168fd9b30c66/qf4ccf8f5435d4a78bdca4d6a018b578e/aabbabbbb.bbb Ljava/lang/reflect/Field;
      // 83: aload 7
      // 85: goto 89
      // 88: athrow
      // 89: areturn
      // 8a: iinc 6 1
      // 8d: iload 1
      // 8e: ifeq 3f
      // 91: aload 3
      // 92: invokevirtual java/lang/Class.getSuperclass ()Ljava/lang/Class;
      // 95: astore 3
      // 96: iload 1
      // 97: ifeq 1b
      // 9a: aconst_null
      // 9b: areturn
   }

   public static void bbbaaaa(class_310 param0, float param1) {
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
      // 11: iload 2
      // 12: ifne 85
      // 15: getfield net/minecraft/class_310.field_1724 Lnet/minecraft/class_746;
      // 18: ifnonnull 21
      // 1b: goto 1f
      // 1e: athrow
      // 1f: return
      // 20: athrow
      // 21: aload 0
      // 22: getfield net/minecraft/class_310.field_1724 Lnet/minecraft/class_746;
      // 25: fload 1
      // 26: invokevirtual net/minecraft/class_746.method_5847 (F)V
      // 29: getstatic qeaa361f143ee4a0894bd168fd9b30c66/qf4ccf8f5435d4a78bdca4d6a018b578e/aabbabbbb.abab Ljava/lang/reflect/Field;
      // 2c: aload 0
      // 2d: getfield net/minecraft/class_310.field_1724 Lnet/minecraft/class_746;
      // 30: fload 1
      // 31: invokestatic qeaa361f143ee4a0894bd168fd9b30c66/qf4ccf8f5435d4a78bdca4d6a018b578e/aabbabbbb.abbbaa (Ljava/lang/reflect/Field;Ljava/lang/Object;F)V
      // 34: getstatic qeaa361f143ee4a0894bd168fd9b30c66/qf4ccf8f5435d4a78bdca4d6a018b578e/aabbabbbb.bbbba Ljava/lang/reflect/Field;
      // 37: aload 0
      // 38: getfield net/minecraft/class_310.field_1724 Lnet/minecraft/class_746;
      // 3b: fload 1
      // 3c: invokestatic qeaa361f143ee4a0894bd168fd9b30c66/qf4ccf8f5435d4a78bdca4d6a018b578e/aabbabbbb.abbbaa (Ljava/lang/reflect/Field;Ljava/lang/Object;F)V
      // 3f: aload 0
      // 40: getfield net/minecraft/class_310.field_1724 Lnet/minecraft/class_746;
      // 43: invokevirtual java/lang/Object.getClass ()Ljava/lang/Class;
      // 46: ldc_w 604046845
      // 49: ldc_w 875970053
      // 4c: ldc_w -1906097422
      // 4f: ixor
      // 50: invokestatic qeaa361f143ee4a0894bd168fd9b30c66/qf4ccf8f5435d4a78bdca4d6a018b578e/aabbabbbb.b (II)I
      // 53: ldc_w 604046844
      // 56: ldc_w 875970053
      // 59: ldc_w -1870451682
      // 5c: ixor
      // 5d: invokestatic qeaa361f143ee4a0894bd168fd9b30c66/qf4ccf8f5435d4a78bdca4d6a018b578e/aabbabbbb.b (II)I
      // 60: invokestatic qeaa361f143ee4a0894bd168fd9b30c66/qf4ccf8f5435d4a78bdca4d6a018b578e/aabbabbbb.bbaabaa (II)Ljava/lang/String;
      // 63: invokestatic qeaa361f143ee4a0894bd168fd9b30c66/qf4ccf8f5435d4a78bdca4d6a018b578e/aabbaaaba.abba (Ljava/lang/String;)Ljava/lang/String;
      // 66: bipush 1
      // 67: anewarray 810
      // 6a: dup
      // 6b: bipush 0
      // 6c: getstatic java/lang/Float.TYPE Ljava/lang/Class;
      // 6f: aastore
      // 70: invokevirtual java/lang/Class.getMethod (Ljava/lang/String;[Ljava/lang/Class;)Ljava/lang/reflect/Method;
      // 73: aload 0
      // 74: getfield net/minecraft/class_310.field_1724 Lnet/minecraft/class_746;
      // 77: bipush 1
      // 78: anewarray 4
      // 7b: dup
      // 7c: bipush 0
      // 7d: fload 1
      // 7e: invokestatic java/lang/Float.valueOf (F)Ljava/lang/Float;
      // 81: aastore
      // 82: invokevirtual java/lang/reflect/Method.invoke (Ljava/lang/Object;[Ljava/lang/Object;)Ljava/lang/Object;
      // 85: pop
      // 86: goto 97
      // 89: astore 3
      // 8a: aload 3
      // 8b: pop
      // 8c: getstatic qeaa361f143ee4a0894bd168fd9b30c66/qf4ccf8f5435d4a78bdca4d6a018b578e/aabbabbbb.aaabb Ljava/lang/reflect/Field;
      // 8f: aload 0
      // 90: getfield net/minecraft/class_310.field_1724 Lnet/minecraft/class_746;
      // 93: fload 1
      // 94: invokestatic qeaa361f143ee4a0894bd168fd9b30c66/qf4ccf8f5435d4a78bdca4d6a018b578e/aabbabbbb.abbbaa (Ljava/lang/reflect/Field;Ljava/lang/Object;F)V
      // 97: getstatic qeaa361f143ee4a0894bd168fd9b30c66/qf4ccf8f5435d4a78bdca4d6a018b578e/aabbabbbb.abbbb Ljava/lang/reflect/Field;
      // 9a: aload 0
      // 9b: getfield net/minecraft/class_310.field_1724 Lnet/minecraft/class_746;
      // 9e: fload 1
      // 9f: invokestatic qeaa361f143ee4a0894bd168fd9b30c66/qf4ccf8f5435d4a78bdca4d6a018b578e/aabbabbbb.abbbaa (Ljava/lang/reflect/Field;Ljava/lang/Object;F)V
      // a2: return
   }

   private static boolean a() {
      int var0 = baaabbaa.bba;

      try {
         if (var0 != 0) {
            return (boolean)baaa;
         }

         if (baaa <= 0) {
            return (boolean)1;
         }
      } catch (MatchException var1) {
         throw var1;
      }

      return (boolean)0;
   }

   public static int bbbaaab(class_310 param0) {
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
      // 06: ifne 16
      // 09: ifnonnull 15
      // 0c: goto 10
      // 0f: athrow
      // 10: bipush 0
      // 11: goto 19
      // 14: athrow
      // 15: aload 0
      // 16: invokestatic qeaa361f143ee4a0894bd168fd9b30c66/qf4ccf8f5435d4a78bdca4d6a018b578e/bbbabaa.aaaaa (Lnet/minecraft/class_310;)I
      // 19: ireturn
   }

   public static void bbbaaba(class_310 var0) {
      bbbabaa.a(var0, 0);
   }

   public static class_243 bbbaabb(class_2596 var0) {
      return aaaabab(var0);
   }

   public static boolean bbbabaa(Object param0) {
      // $VF: Couldn't be decompiled
      // Please report this to the Vineflower issue tracker, at https://github.com/Vineflower/vineflower/issues with a copy of the class file (if you have the rights to distribute it!)
      // java.lang.RuntimeException: parsing failure!
      //   at org.jetbrains.java.decompiler.modules.decompiler.decompose.DomHelper.parseGraph(DomHelper.java:211)
      //   at org.jetbrains.java.decompiler.main.rels.MethodProcessor.codeToJava(MethodProcessor.java:166)
      //
      // Bytecode:
      // 00: getstatic qeaa361f143ee4a0894bd168fd9b30c66/qf4ccf8f5435d4a78bdca4d6a018b578e/baaabbaa.bba I
      // 03: istore 1
      // 04: getstatic qeaa361f143ee4a0894bd168fd9b30c66/qf4ccf8f5435d4a78bdca4d6a018b578e/aabbabbbb.aaaab I
      // 07: iload 1
      // 08: ifne 25
      // 0b: ifge 24
      // 0e: goto 12
      // 11: athrow
      // 12: getstatic qeaa361f143ee4a0894bd168fd9b30c66/qf4ccf8f5435d4a78bdca4d6a018b578e/aabbabbbb.baaba Z
      // 15: iload 1
      // 16: ifne 29
      // 19: goto 1d
      // 1c: athrow
      // 1d: ifeq 26
      // 20: goto 24
      // 23: athrow
      // 24: bipush 1
      // 25: ireturn
      // 26: getstatic qeaa361f143ee4a0894bd168fd9b30c66/qf4ccf8f5435d4a78bdca4d6a018b578e/aabbabbbb.bbbaa I
      // 29: iload 1
      // 2a: ifne 47
      // 2d: ifgt 46
      // 30: goto 34
      // 33: athrow
      // 34: getstatic qeaa361f143ee4a0894bd168fd9b30c66/qf4ccf8f5435d4a78bdca4d6a018b578e/aabbabbbb.aabbb I
      // 37: iload 1
      // 38: ifne 47
      // 3b: goto 3f
      // 3e: athrow
      // 3f: ifle 48
      // 42: goto 46
      // 45: athrow
      // 46: bipush 1
      // 47: ireturn
      // 48: getstatic qeaa361f143ee4a0894bd168fd9b30c66/qf4ccf8f5435d4a78bdca4d6a018b578e/aabbabbbb.baab Lqeaa361f143ee4a0894bd168fd9b30c66/qf4ccf8f5435d4a78bdca4d6a018b578e/bbaaba;
      // 4b: astore 2
      // 4c: aload 2
      // 4d: iload 1
      // 4e: ifne 59
      // 51: ifnull 76
      // 54: goto 58
      // 57: athrow
      // 58: aload 0
      // 59: iload 1
      // 5a: ifne 6f
      // 5d: ifnull 73
      // 60: goto 64
      // 63: athrow
      // 64: aload 2
      // 65: invokevirtual qeaa361f143ee4a0894bd168fd9b30c66/qf4ccf8f5435d4a78bdca4d6a018b578e/bbaaba.aa ()Lqeaa361f143ee4a0894bd168fd9b30c66/qf4ccf8f5435d4a78bdca4d6a018b578e/abaabbba;
      // 68: invokevirtual qeaa361f143ee4a0894bd168fd9b30c66/qf4ccf8f5435d4a78bdca4d6a018b578e/abaabbba.a ()Ljava/lang/Object;
      // 6b: goto 6f
      // 6e: athrow
      // 6f: aload 0
      // 70: if_acmpeq 76
      // 73: bipush 1
      // 74: ireturn
      // 75: athrow
      // 76: getstatic qeaa361f143ee4a0894bd168fd9b30c66/qf4ccf8f5435d4a78bdca4d6a018b578e/aabbabbbb.aba Lqeaa361f143ee4a0894bd168fd9b30c66/qf4ccf8f5435d4a78bdca4d6a018b578e/abaaabaa;
      // 79: invokevirtual qeaa361f143ee4a0894bd168fd9b30c66/qf4ccf8f5435d4a78bdca4d6a018b578e/abaaabaa.ab ()Z
      // 7c: iload 1
      // 7d: ifne ac
      // 80: ifeq ab
      // 83: goto 87
      // 86: athrow
      // 87: aload 0
      // 88: ifnull a5
      // 8b: goto 8f
      // 8e: athrow
      // 8f: getstatic qeaa361f143ee4a0894bd168fd9b30c66/qf4ccf8f5435d4a78bdca4d6a018b578e/aabbabbbb.aba Lqeaa361f143ee4a0894bd168fd9b30c66/qf4ccf8f5435d4a78bdca4d6a018b578e/abaaabaa;
      // 92: aload 0
      // 93: invokevirtual qeaa361f143ee4a0894bd168fd9b30c66/qf4ccf8f5435d4a78bdca4d6a018b578e/abaaabaa.abbb (Ljava/lang/Object;)Z
      // 96: iload 1
      // 97: ifne a6
      // 9a: goto 9e
      // 9d: athrow
      // 9e: ifne a9
      // a1: goto a5
      // a4: athrow
      // a5: bipush 1
      // a6: goto aa
      // a9: bipush 0
      // aa: ireturn
      // ab: bipush 0
      // ac: ireturn
   }
}
