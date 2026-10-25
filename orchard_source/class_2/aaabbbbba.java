package nsc;

import com.google.gson.JsonObject;
import java.util.ArrayList;
import java.util.Comparator;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Map.Entry;
import java.util.concurrent.ThreadLocalRandom;
import net.fabricmc.api.EnvType;
import net.fabricmc.api.Environment;
import net.minecraft.class_1703;
import net.minecraft.class_1735;
import net.minecraft.class_1799;
import net.minecraft.class_2338;
import net.minecraft.class_2350;
import net.minecraft.class_238;
import net.minecraft.class_243;
import net.minecraft.class_310;
import net.minecraft.class_3965;
import net.minecraft.class_465;
import net.minecraft.class_5321;
import net.minecraft.class_5537;
import net.minecraft.class_6880;
import net.minecraft.class_746;
import net.minecraft.class_9304;
import net.minecraft.class_9334;

@Environment(EnvType.CLIENT)
public final class aaabbbbba extends abbaabbaa {
   private final aaabbbab ba;
   private class_2338 aaa;
   private final ababbbbba aab;
   private final abaabbbb aba;
   private boolean aa;
   private long abb;
   private static final int baa;
   private final bababa bab;
   private static final int bba;
   private boolean bbb;
   private boolean aaaa;
   private final abbaaaaa aaab;
   private boolean aaba;
   private static final String[] aabb;
   private int abaa;
   private static final int[] baaba;
   private static final long[] abab;
   private int abba;
   private final abbaaaaa abbb;
   private class_2338 baaa;
   private abbabbbbb baab;
   private bbbbaaaa baba;
   private final baabaab babb;
   private final abbaaaaa bbaa;
   private static final Object[] babaa;
   private final aaabbbab bbab;
   private int bbba;
   private static final long[] bbbb;
   private static final int aaaaa;
   private static final int aaaab;
   private static final int aaaba;
   private int aaabb;
   private int aabaa;
   private int aabab;
   private final aaabbbab aabba;
   private static final int aabbb;
   private boolean abaaa;
   private static final String[] abaab;
   private final Map bb;
   private long ab;
   private static final Integer[] ababa;
   private static final double ababb = 20.25;
   private static final int abbaa;
   private static final Long[] abbab;
   private class_2338 abbba;
   private static final String[] baabb;
   private static final ababbbbaa abbbb;
   private static final double baaaa = 0.0625;
   private long baaab;

   @Override
   public void abbbab(JsonObject param1) {
      // $VF: Couldn't be decompiled
      // Please report this to the Vineflower issue tracker, at https://github.com/Vineflower/vineflower/issues with a copy of the class file (if you have the rights to distribute it!)
      // java.lang.RuntimeException: parsing failure!
      //   at org.jetbrains.java.decompiler.modules.decompiler.decompose.DomHelper.parseGraph(DomHelper.java:211)
      //   at org.jetbrains.java.decompiler.main.rels.MethodProcessor.codeToJava(MethodProcessor.java:166)
      //
      // Bytecode:
      // 000: getstatic qeaa361f143ee4a0894bd168fd9b30c66/qf4ccf8f5435d4a78bdca4d6a018b578e/baaabbaa.bba I
      // 003: aload 0
      // 004: aload 1
      // 005: invokespecial qeaa361f143ee4a0894bd168fd9b30c66/qf4ccf8f5435d4a78bdca4d6a018b578e/abbaabbaa.abbbab (Lcom/google/gson/JsonObject;)V
      // 008: istore 2
      // 009: aload 1
      // 00a: iload 2
      // 00b: ifne 016
      // 00e: ifnull 042
      // 011: goto 015
      // 014: athrow
      // 015: aload 1
      // 016: getstatic qeaa361f143ee4a0894bd168fd9b30c66/qf4ccf8f5435d4a78bdca4d6a018b578e/aaabbbbba.abbbb Lqeaa361f143ee4a0894bd168fd9b30c66/qf4ccf8f5435d4a78bdca4d6a018b578e/ababbbbaa;
      // 019: iload 2
      // 01a: ifne 036
      // 01d: invokevirtual qeaa361f143ee4a0894bd168fd9b30c66/qf4ccf8f5435d4a78bdca4d6a018b578e/ababbbbaa.abab ()Ljava/lang/String;
      // 020: invokevirtual com/google/gson/JsonObject.has (Ljava/lang/String;)Z
      // 023: ifeq 042
      // 026: goto 02a
      // 029: athrow
      // 02a: aload 1
      // 02b: getstatic qeaa361f143ee4a0894bd168fd9b30c66/qf4ccf8f5435d4a78bdca4d6a018b578e/aaabbbbba.abbbb Lqeaa361f143ee4a0894bd168fd9b30c66/qf4ccf8f5435d4a78bdca4d6a018b578e/ababbbbaa;
      // 02e: iload 2
      // 02f: ifne 048
      // 032: goto 036
      // 035: athrow
      // 036: invokevirtual qeaa361f143ee4a0894bd168fd9b30c66/qf4ccf8f5435d4a78bdca4d6a018b578e/ababbbbaa.abab ()Ljava/lang/String;
      // 039: invokevirtual com/google/gson/JsonObject.get (Ljava/lang/String;)Lcom/google/gson/JsonElement;
      // 03c: invokevirtual com/google/gson/JsonElement.isJsonObject ()Z
      // 03f: ifne 044
      // 042: return
      // 043: athrow
      // 044: aload 1
      // 045: getstatic qeaa361f143ee4a0894bd168fd9b30c66/qf4ccf8f5435d4a78bdca4d6a018b578e/aaabbbbba.abbbb Lqeaa361f143ee4a0894bd168fd9b30c66/qf4ccf8f5435d4a78bdca4d6a018b578e/ababbbbaa;
      // 048: invokevirtual qeaa361f143ee4a0894bd168fd9b30c66/qf4ccf8f5435d4a78bdca4d6a018b578e/ababbbbaa.abab ()Ljava/lang/String;
      // 04b: invokevirtual com/google/gson/JsonObject.getAsJsonObject (Ljava/lang/String;)Lcom/google/gson/JsonObject;
      // 04e: astore 3
      // 04f: aload 3
      // 050: aload 0
      // 051: getfield qeaa361f143ee4a0894bd168fd9b30c66/qf4ccf8f5435d4a78bdca4d6a018b578e/aaabbbbba.aba Lqeaa361f143ee4a0894bd168fd9b30c66/qf4ccf8f5435d4a78bdca4d6a018b578e/abaabbbb;
      // 054: invokevirtual qeaa361f143ee4a0894bd168fd9b30c66/qf4ccf8f5435d4a78bdca4d6a018b578e/abaabbbb.baab ()J
      // 057: invokestatic qeaa361f143ee4a0894bd168fd9b30c66/qf4ccf8f5435d4a78bdca4d6a018b578e/aaabbbbba.abbbbab (Lcom/google/gson/JsonObject;J)Lcom/google/gson/JsonElement;
      // 05a: ifnull 05f
      // 05d: return
      // 05e: athrow
      // 05f: invokestatic qeaa361f143ee4a0894bd168fd9b30c66/qf4ccf8f5435d4a78bdca4d6a018b578e/ababbaa.values ()[Lqeaa361f143ee4a0894bd168fd9b30c66/qf4ccf8f5435d4a78bdca4d6a018b578e/ababbaa;
      // 062: astore 4
      // 064: aload 4
      // 066: arraylength
      // 067: istore 5
      // 069: bipush 0
      // 06a: istore 6
      // 06c: iload 6
      // 06e: iload 5
      // 070: if_icmpge 120
      // 073: aload 4
      // 075: iload 6
      // 077: aaload
      // 078: astore 7
      // 07a: aload 7
      // 07c: getfield qeaa361f143ee4a0894bd168fd9b30c66/qf4ccf8f5435d4a78bdca4d6a018b578e/ababbaa.abaa Lqeaa361f143ee4a0894bd168fd9b30c66/qf4ccf8f5435d4a78bdca4d6a018b578e/ababbbbaa;
      // 07f: ifnonnull 08a
      // 082: iload 2
      // 083: ifeq 119
      // 086: goto 08a
      // 089: athrow
      // 08a: aload 3
      // 08b: aload 7
      // 08d: getfield qeaa361f143ee4a0894bd168fd9b30c66/qf4ccf8f5435d4a78bdca4d6a018b578e/ababbaa.abaa Lqeaa361f143ee4a0894bd168fd9b30c66/qf4ccf8f5435d4a78bdca4d6a018b578e/ababbbbaa;
      // 090: invokevirtual qeaa361f143ee4a0894bd168fd9b30c66/qf4ccf8f5435d4a78bdca4d6a018b578e/ababbbbaa.bbb ()J
      // 093: invokestatic qeaa361f143ee4a0894bd168fd9b30c66/qf4ccf8f5435d4a78bdca4d6a018b578e/aaabbbbba.abbbbab (Lcom/google/gson/JsonObject;J)Lcom/google/gson/JsonElement;
      // 096: astore 8
      // 098: aload 8
      // 09a: iload 2
      // 09b: ifne 0a7
      // 09e: ifnull 0e4
      // 0a1: goto 0a5
      // 0a4: athrow
      // 0a5: aload 8
      // 0a7: iload 2
      // 0a8: ifne 0bb
      // 0ab: invokevirtual com/google/gson/JsonElement.isJsonPrimitive ()Z
      // 0ae: ifeq 0e4
      // 0b1: goto 0b5
      // 0b4: athrow
      // 0b5: aload 8
      // 0b7: goto 0bb
      // 0ba: athrow
      // 0bb: invokevirtual com/google/gson/JsonElement.getAsJsonPrimitive ()Lcom/google/gson/JsonPrimitive;
      // 0be: iload 2
      // 0bf: ifne 0d2
      // 0c2: invokevirtual com/google/gson/JsonPrimitive.isBoolean ()Z
      // 0c5: ifeq 0e4
      // 0c8: goto 0cc
      // 0cb: athrow
      // 0cc: aload 8
      // 0ce: goto 0d2
      // 0d1: athrow
      // 0d2: invokevirtual com/google/gson/JsonElement.getAsBoolean ()Z
      // 0d5: iload 2
      // 0d6: ifne 0e1
      // 0d9: ifne 0e4
      // 0dc: goto 0e0
      // 0df: athrow
      // 0e0: bipush 1
      // 0e1: goto 0e5
      // 0e4: bipush 0
      // 0e5: istore 9
      // 0e7: iload 2
      // 0e8: ifne 11c
      // 0eb: iload 9
      // 0ed: ifeq 119
      // 0f0: goto 0f4
      // 0f3: athrow
      // 0f4: aload 0
      // 0f5: iload 2
      // 0f6: ifne 10e
      // 0f9: goto 0fd
      // 0fc: athrow
      // 0fd: aload 7
      // 0ff: invokevirtual qeaa361f143ee4a0894bd168fd9b30c66/qf4ccf8f5435d4a78bdca4d6a018b578e/aaabbbbba.abaa (Lqeaa361f143ee4a0894bd168fd9b30c66/qf4ccf8f5435d4a78bdca4d6a018b578e/ababbaa;)Z
      // 102: ifeq 119
      // 105: goto 109
      // 108: athrow
      // 109: aload 0
      // 10a: goto 10e
      // 10d: athrow
      // 10e: getfield qeaa361f143ee4a0894bd168fd9b30c66/qf4ccf8f5435d4a78bdca4d6a018b578e/aaabbbbba.aba Lqeaa361f143ee4a0894bd168fd9b30c66/qf4ccf8f5435d4a78bdca4d6a018b578e/abaabbbb;
      // 111: aload 7
      // 113: getfield qeaa361f143ee4a0894bd168fd9b30c66/qf4ccf8f5435d4a78bdca4d6a018b578e/ababbaa.aa Lqeaa361f143ee4a0894bd168fd9b30c66/qf4ccf8f5435d4a78bdca4d6a018b578e/aaaa;
      // 116: invokevirtual qeaa361f143ee4a0894bd168fd9b30c66/qf4ccf8f5435d4a78bdca4d6a018b578e/abaabbbb.ba (Lqeaa361f143ee4a0894bd168fd9b30c66/qf4ccf8f5435d4a78bdca4d6a018b578e/aaaa;)V
      // 119: iinc 6 1
      // 11c: iload 2
      // 11d: ifeq 06c
      // 120: return
   }

   private void aa(class_310 param1, class_2338 param2) {
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
      // 006: ifne 01a
      // 009: aload 1
      // 00a: aload 2
      // 00b: invokevirtual qeaa361f143ee4a0894bd168fd9b30c66/qf4ccf8f5435d4a78bdca4d6a018b578e/aaabbbbba.aaaabb (Lnet/minecraft/class_310;Lnet/minecraft/class_2338;)Z
      // 00e: ifne 01f
      // 011: goto 015
      // 014: athrow
      // 015: aload 0
      // 016: goto 01a
      // 019: athrow
      // 01a: aconst_null
      // 01b: putfield qeaa361f143ee4a0894bd168fd9b30c66/qf4ccf8f5435d4a78bdca4d6a018b578e/aaabbbbba.baaa Lnet/minecraft/class_2338;
      // 01e: return
      // 01f: aload 2
      // 020: invokestatic net/minecraft/class_243.method_24953 (Lnet/minecraft/class_2382;)Lnet/minecraft/class_243;
      // 023: astore 4
      // 025: aload 1
      // 026: aload 4
      // 028: invokestatic qeaa361f143ee4a0894bd168fd9b30c66/qf4ccf8f5435d4a78bdca4d6a018b578e/bbabbbb.babaab (Lnet/minecraft/class_310;Lnet/minecraft/class_243;)[F
      // 02b: astore 5
      // 02d: aload 5
      // 02f: iload 3
      // 030: ifne 042
      // 033: ifnonnull 03b
      // 036: goto 03a
      // 039: athrow
      // 03a: return
      // 03b: aload 0
      // 03c: getfield qeaa361f143ee4a0894bd168fd9b30c66/qf4ccf8f5435d4a78bdca4d6a018b578e/aaabbbbba.babb Lqeaa361f143ee4a0894bd168fd9b30c66/qf4ccf8f5435d4a78bdca4d6a018b578e/baabaab;
      // 03f: invokevirtual qeaa361f143ee4a0894bd168fd9b30c66/qf4ccf8f5435d4a78bdca4d6a018b578e/baabaab.abbb ()Ljava/lang/Object;
      // 042: iload 3
      // 043: ifne 0a1
      // 046: getstatic qeaa361f143ee4a0894bd168fd9b30c66/qf4ccf8f5435d4a78bdca4d6a018b578e/aabaaaba.a Lqeaa361f143ee4a0894bd168fd9b30c66/qf4ccf8f5435d4a78bdca4d6a018b578e/aabaaaba;
      // 049: if_acmpne 08e
      // 04c: goto 050
      // 04f: athrow
      // 050: aload 0
      // 051: bipush 1
      // 052: putfield qeaa361f143ee4a0894bd168fd9b30c66/qf4ccf8f5435d4a78bdca4d6a018b578e/aaabbbbba.aaaa Z
      // 055: iload 3
      // 056: aload 0
      // 057: aload 1
      // 058: getfield net/minecraft/class_310.field_1724 Lnet/minecraft/class_746;
      // 05b: getfield net/minecraft/class_746.field_6012 I
      // 05e: bipush 2
      // 05f: iadd
      // 060: putfield qeaa361f143ee4a0894bd168fd9b30c66/qf4ccf8f5435d4a78bdca4d6a018b578e/aaabbbbba.abba I
      // 063: aload 1
      // 064: ldc 308654568
      // 066: ldc 394476475
      // 068: ldc 1808701076
      // 06a: ixor
      // 06b: invokestatic qeaa361f143ee4a0894bd168fd9b30c66/qf4ccf8f5435d4a78bdca4d6a018b578e/aaabbbbba.a (II)I
      // 06e: ldc2_w 1019507826327477097
      // 071: invokestatic qeaa361f143ee4a0894bd168fd9b30c66/qf4ccf8f5435d4a78bdca4d6a018b578e/aaabbbbba.baaa (IJ)I
      // 074: aload 5
      // 076: bipush 0
      // 077: faload
      // 078: aload 5
      // 07a: bipush 1
      // 07b: faload
      // 07c: aload 0
      // 07d: aload 1
      // 07e: aload 2
      // 07f: aload 4
      // 081: invokedynamic run (Lqeaa361f143ee4a0894bd168fd9b30c66/qf4ccf8f5435d4a78bdca4d6a018b578e/aaabbbbba;Lnet/minecraft/class_310;Lnet/minecraft/class_2338;Lnet/minecraft/class_243;)Lqeaa361f143ee4a0894bd168fd9b30c66/qf4ccf8f5435d4a78bdca4d6a018b578e/aabbaabbb; bsm=java/lang/invoke/LambdaMetafactory.metafactory (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;Ljava/lang/invoke/MethodType;Ljava/lang/invoke/MethodHandle;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[ ()Z, qeaa361f143ee4a0894bd168fd9b30c66/qf4ccf8f5435d4a78bdca4d6a018b578e/aaabbbbba.baba (Lnet/minecraft/class_310;Lnet/minecraft/class_2338;Lnet/minecraft/class_243;)Z, ()Z ]
      // 086: invokestatic qeaa361f143ee4a0894bd168fd9b30c66/qf4ccf8f5435d4a78bdca4d6a018b578e/bbabbbb.ba (Lnet/minecraft/class_310;IFFLqeaa361f143ee4a0894bd168fd9b30c66/qf4ccf8f5435d4a78bdca4d6a018b578e/aabbaabbb;)Z
      // 089: istore 6
      // 08b: ifeq 104
      // 08e: aload 0
      // 08f: iload 3
      // 090: ifne 0ce
      // 093: goto 097
      // 096: athrow
      // 097: getfield qeaa361f143ee4a0894bd168fd9b30c66/qf4ccf8f5435d4a78bdca4d6a018b578e/aaabbbbba.babb Lqeaa361f143ee4a0894bd168fd9b30c66/qf4ccf8f5435d4a78bdca4d6a018b578e/baabaab;
      // 09a: invokevirtual qeaa361f143ee4a0894bd168fd9b30c66/qf4ccf8f5435d4a78bdca4d6a018b578e/baabaab.abbb ()Ljava/lang/Object;
      // 09d: goto 0a1
      // 0a0: athrow
      // 0a1: getstatic qeaa361f143ee4a0894bd168fd9b30c66/qf4ccf8f5435d4a78bdca4d6a018b578e/aabaaaba.ab Lqeaa361f143ee4a0894bd168fd9b30c66/qf4ccf8f5435d4a78bdca4d6a018b578e/aabaaaba;
      // 0a4: if_acmpne 0c4
      // 0a7: aload 0
      // 0a8: aload 2
      // 0a9: putfield qeaa361f143ee4a0894bd168fd9b30c66/qf4ccf8f5435d4a78bdca4d6a018b578e/aaabbbbba.aaa Lnet/minecraft/class_2338;
      // 0ac: iload 3
      // 0ad: aload 0
      // 0ae: bipush 1
      // 0af: putfield qeaa361f143ee4a0894bd168fd9b30c66/qf4ccf8f5435d4a78bdca4d6a018b578e/aaabbbbba.aa Z
      // 0b2: aload 0
      // 0b3: bipush 1
      // 0b4: putfield qeaa361f143ee4a0894bd168fd9b30c66/qf4ccf8f5435d4a78bdca4d6a018b578e/aaabbbbba.bbb Z
      // 0b7: aload 0
      // 0b8: invokestatic java/lang/System.currentTimeMillis ()J
      // 0bb: putfield qeaa361f143ee4a0894bd168fd9b30c66/qf4ccf8f5435d4a78bdca4d6a018b578e/aaabbbbba.ab J
      // 0be: bipush 1
      // 0bf: istore 6
      // 0c1: ifeq 104
      // 0c4: aload 0
      // 0c5: bipush 1
      // 0c6: putfield qeaa361f143ee4a0894bd168fd9b30c66/qf4ccf8f5435d4a78bdca4d6a018b578e/aaabbbbba.aaaa Z
      // 0c9: aload 0
      // 0ca: goto 0ce
      // 0cd: athrow
      // 0ce: aload 1
      // 0cf: getfield net/minecraft/class_310.field_1724 Lnet/minecraft/class_746;
      // 0d2: getfield net/minecraft/class_746.field_6012 I
      // 0d5: bipush 2
      // 0d6: iadd
      // 0d7: putfield qeaa361f143ee4a0894bd168fd9b30c66/qf4ccf8f5435d4a78bdca4d6a018b578e/aaabbbbba.abba I
      // 0da: aload 1
      // 0db: ldc_w 308654569
      // 0de: ldc 394476475
      // 0e0: ldc_w 1479574495
      // 0e3: ixor
      // 0e4: invokestatic qeaa361f143ee4a0894bd168fd9b30c66/qf4ccf8f5435d4a78bdca4d6a018b578e/aaabbbbba.a (II)I
      // 0e7: ldc2_w 5032345564490509807
      // 0ea: invokestatic qeaa361f143ee4a0894bd168fd9b30c66/qf4ccf8f5435d4a78bdca4d6a018b578e/aaabbbbba.baaa (IJ)I
      // 0ed: aload 5
      // 0ef: bipush 0
      // 0f0: faload
      // 0f1: aload 5
      // 0f3: bipush 1
      // 0f4: faload
      // 0f5: aload 0
      // 0f6: aload 1
      // 0f7: aload 2
      // 0f8: aload 4
      // 0fa: invokedynamic run (Lqeaa361f143ee4a0894bd168fd9b30c66/qf4ccf8f5435d4a78bdca4d6a018b578e/aaabbbbba;Lnet/minecraft/class_310;Lnet/minecraft/class_2338;Lnet/minecraft/class_243;)Lqeaa361f143ee4a0894bd168fd9b30c66/qf4ccf8f5435d4a78bdca4d6a018b578e/aabbaabbb; bsm=java/lang/invoke/LambdaMetafactory.metafactory (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;Ljava/lang/invoke/MethodType;Ljava/lang/invoke/MethodHandle;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[ ()Z, qeaa361f143ee4a0894bd168fd9b30c66/qf4ccf8f5435d4a78bdca4d6a018b578e/aaabbbbba.bbbbb (Lnet/minecraft/class_310;Lnet/minecraft/class_2338;Lnet/minecraft/class_243;)Z, ()Z ]
      // 0ff: invokestatic qeaa361f143ee4a0894bd168fd9b30c66/qf4ccf8f5435d4a78bdca4d6a018b578e/bbabbbb.ba (Lnet/minecraft/class_310;IFFLqeaa361f143ee4a0894bd168fd9b30c66/qf4ccf8f5435d4a78bdca4d6a018b578e/aabbaabbb;)Z
      // 102: istore 6
      // 104: iload 6
      // 106: ifne 128
      // 109: aload 0
      // 10a: bipush 0
      // 10b: putfield qeaa361f143ee4a0894bd168fd9b30c66/qf4ccf8f5435d4a78bdca4d6a018b578e/aaabbbbba.aaaa Z
      // 10e: aload 0
      // 10f: ldc_w 308654570
      // 112: ldc 394476475
      // 114: ldc_w -1491509918
      // 117: ixor
      // 118: invokestatic qeaa361f143ee4a0894bd168fd9b30c66/qf4ccf8f5435d4a78bdca4d6a018b578e/aaabbbbba.a (II)I
      // 11b: ldc2_w 1848905881191263389
      // 11e: invokestatic qeaa361f143ee4a0894bd168fd9b30c66/qf4ccf8f5435d4a78bdca4d6a018b578e/aaabbbbba.baaa (IJ)I
      // 121: putfield qeaa361f143ee4a0894bd168fd9b30c66/qf4ccf8f5435d4a78bdca4d6a018b578e/aaabbbbba.abba I
      // 124: goto 128
      // 127: athrow
      // 128: return
   }

   // $VF: Irreducible bytecode was duplicated to produce valid code
   static {
      int var33 = -1289768645;
      int var24 = "ϲ铃苛\uaacaȹꮄ剓\ua636스铆䈖굁숗陥\ue285갓ˠ酪ሆꬄ扔ꨖ銠镆鈓锱툫醅犽锳ዥ\ua9da∻ꣴꉫ鏶报ꦦ㈓ꪱሗꛕʆ霣勥閺눿途牗ꯦ튝ꭖ\uf22dꠡ鈐꣕ʽ꿃닙镪\uf239銴ቐ굶ꊧ鏖㈕金눪겅튾꽣틥鈚\ue207귤ꉗꙖʚ鄖鈨꼡ȩ깥\u12bf鄣䋚궊숸ꭄ\uf26fꩶ䊠긆爔鏁숪鍥ꊾ굳틠鍺刂ꢔ≔ꡆʤ굦\ue214鎱戔铥튼鑣\uf2dc\uab1a刁ꥤ퉗集芛ꩦ爬酁\uf212ꩵ芅銳䋤꺺刿깤ቩꙖ㊝꧖利铑䈕锥劸隳˚鉪\ue23b铤牭ꦆ犞꼆ꈨ鄁爮ꯕኄ錳˛鄪㈂꾤뉭鎖튙ꭖ숐週ሗ閥劻铓ዜ邪숄괔ꉪ阦㊛꾶\uf216꠱鈔鏅銅釣ዥ閺\ue23f鐴퉩酆ꊟ遆\uf22dꨁ舕鍥튅閃\uf2e7陊\uf207ꡤ扒꠆犗ꩆꈨ겱Ȩ鄕튼ꡳ⋜鞚鈿귔\uf256鐆䊚ꭆ\ue215鄱ሗ镅芹ꭃ䋚ꡊ숀鍔艩鞶늚꾶∪꩑\uf213ꤥ\ue284鄣㋦ꯪ\uf23c걔扭걦튜鎖䈯ꠑ툓꽅\uf2b8꺣싙锺ሂ醤㉐鄦銣굶刖\uaad1划镥犿銳狛銺눇釄㉐釆슞鏶ȕꛑ㈨鉵튼ꠃ狥\ua95a숆ꡤ퉖꩖늢韖\uf217ꢁ∔鏅\uf281괓⋠鏊爂醔牗醦犦ꬆ∞ꪡ舫ꨵ犽괣拤꺊爿꩔牬ꮶ튠걦ሓ꯱눨邅슸鞓ዜ깚눂阤剨酆⊝鞦\ue210ꡱ\uf210鑥劃钓ዧ꽺∻铴ɒ郆劢ꭖ爨걁㈨雵銅꼃틦겊爹ꛔ扪깖ʝ酦툩꿁舩꡵ኲꠃ\ue2e1鋊鈆陴퉓韦抣铆\uf229铑ሖ겅劻곳ꋢ钚숿附艑ꥦ⊟钆∨鏑Ȩ굅㊇ꤣ拜鎪∻ꭔ㉩鄶犝ꭆ숖귱툩깕\ue2bc걳닜酪\ue23a궴ꉐ겖䊘꿦成鏡\ue210ꮕʲ귣틥겚\uf23f鞴ቖ霦\ue29c귆舔靁鈬靅ꊇ酣苧陪㈃ꠤɓꙦ䊞ꯆ툪긑숮깕늾\uaad3勒鏚爿꾄ɨ겶አ锶툓ꭁ䈓ꤕ⊻꙳狧ꭊሾ釔䉬ꨦ튙鎶∑酁∭겵芄괳⋟镺刹ꦄ艨ꨆ抛꘦ሩ邁툯꣥⊲ꙓ\ue2dfꚚꈼꮴ쉨곖䊞꩖舖鄁∠醕㊾閣ˤ錚ꈽ靤鉖韖芢ꪖር꣱눪ꬵʃꩳ鋜\ua8ca舾鏤鉖釦劚鏦\uf216깁툗鋵ኅ釣닝遊戂鞴뉓醖늝Ꙗ∩ꛡ爗긥튅꼣\uf2e4鍪\uf23e靔䉩邖抠꫶투铱∬釕抺醃틛굪爺ꧤ䉬깦ኝꨆ或괡\uf215갵ኻ釳틥閺ሄ鑔艓銆芘郆刬ꢁ㈨郕튻釣鋜\ua8caȻ郴쉕ꭶ슥궆㈭錁눫ꚅ銄ꥃ\uf2e2꺺舆갤뉗꽦犡镆爐鎁划酵ꊸ鞳拚郪\ue23cꮄ뉓ꩆ銤ꪦ\ue210酁别铥⊹鎃鋤铊刹鈴牮ꪶ加ꤖ툩ꪁ눨靕⊹꺃\uf2e0銊툇遤\uf252곦折酦爪锁划鞕튇醓䋞ꤚ숽껄쉭釶芜逦∫ꚁሒꤵꊁ鞃勣锺䈃郴鉔酦芙霦䈔ꠡ숬ꤕꊻ霣鋣閊刵ꮔ\uf252霆芚鋆\uf216꿁ሕ곥劻鏓拙郚∻ꭄ䉗걖\ue2a6굖∐鎑爩鈥\ue2b8ꫣ䋛ꬊꈇ궄쉑鍶犣ꣶ−긑툖ꦥ늄逳닟갪戀鉴ꉓ钆늠굖舯꛱숖ꡕ劄굓若걊\uf23f꼤牬ꢖ芛꾖∖鏱ꈬ铅늼껓狦隊㈾鑄剡鑶銤깖䈒酁∑鐥劲곓苤锺舀钄扐鑶㊤銖ሩꧡ鈒钕늂鉃狒궺\ue201깴䉔锆⊝鋦戯겑爠鄕늸霓싡霺爺ꠔ剐鍖\uf29a鎶舫锑鈖鞕늂걳틘逪\uf204鋴퉩逖抢꺦툫邁鈔꾵㊹鞣님鉪爼鍔扐걖ኛ醦戨鐱ꈑ钥\ue2b8ꬳ닡靚刾ꭔቭ雖銠꧖\uf215꺁戕韥ꊁ铣ዞ醪눹꺤쉯굖\uf299ꯖ숑귑刑鉅䊼靓㋞깪ሽ遤ቖ釦抡零ꈮ깱爯괅\uf2b9꠳狜邺눹꽔牗鑶አ鄦툯ꬑ㈒꩕ʽ\uaad3䋧깊∹건ꉫꯆ스갆爯궑鈐ꮵ⊇鈳鋥锪\ue23b钔쉫꽶銚邶刞酁㈮铕\uf2bcꮣ닛鏺ሿꥴ扗꠶튢钆ሩ锁ꈪꨕ\uf2b8ꠓ싢꺚ሄꩴ\u1257鑆ʙ镶䈞逡눬酕튀闣ˤ겊鈂酴ቐ銦加錖∕꽡\uf215闅늹ꥣዠ꾺䈹逴\ue255鍶劙鈶戒꿁ꈔ霅㊽釣勠鋺䈻ꡤ퉓꠆\ue298鍦刨각舨陕ኅ镳拦\uabfa舂钔\uf26a깶ʟꬶꈐ鋁ꈨ际튁鈓拥\u0015祛㨒捂⫪撜થ愮ᩇ惞꫞晙竾磍婳礻ᨋ穲髰掬窣緎\u0098ꗾￒ몷켮롹罾뿫뾌ꋻ뼅ꆬ뼧ꕈ\uefb6ꗞ迗ꁧ켪ꂙཹ뵫龉ꚛ⼀\ua62c弻뫈쾮ꕮ쿌멷㼱ꞙ\uef63똻꾏ꂻ꼂뢬\uef3b뿈㾬멮\udfca빗㼶멹ὠꅻ羑\ua7eb弁뵌缤ꎘ澫ꗾ㿒믧༭뫹齡뫫㾉ꃋ켇뾼弽꜈㾯몾࿐ꀧ缷ꔉ齧뷋쾗뤻\udf19뺼꼺빸侭ꑾ忌ꙷ伷붩轧ꎋ辍ꛫἄ뭼⼿ꐸ澫ꁎ\uefcaꟇ弬뚩潾ꅫ澒ꏛ켃ꈌ\udf38묘ླ꜎Ὴꁇ\udf35밹影뙛辖뵋뼁ꃼ鼠븈⾨뽞⿑ꝷ꼩륩⽼뷻龑ꕋ鼝리Ἱꕈ澢\ua7de俊봇弶ꎉ齦ꃛ⾒뻛켚뼌뼣\n\ue8a1炒\ue888큽\uef26ꀨ\uec44郞\ueea4ၔ\u0010呖\uf719泏㟃嗱➖关ݟ厳韑咔߬氀\uf77f儶圦\nꬖ蟟\uabff朾ꪑ\u176d귳➛괓꜕\u0010ᙎ佳ᶗ\udf95ṩ俜ԫ켴ᥫ龢྆͜¸\udf14᭮\uef6c\n\ud84d鲮\ud8e4뱎\udd8aచ\udc28糬\uddc8ﱤ"
         .length();
      int var26 = 0;
      short var28 = 18660;
      int var27 = 0;
      String[] var25 = new String[8];
      String var23 = "ϲ铃苛\uaacaȹꮄ剓\ua636스铆䈖굁숗陥\ue285갓ˠ酪ሆꬄ扔ꨖ銠镆鈓锱툫醅犽锳ዥ\ua9da∻ꣴꉫ鏶报ꦦ㈓ꪱሗꛕʆ霣勥閺눿途牗ꯦ튝ꭖ\uf22dꠡ鈐꣕ʽ꿃닙镪\uf239銴ቐ굶ꊧ鏖㈕金눪겅튾꽣틥鈚\ue207귤ꉗꙖʚ鄖鈨꼡ȩ깥\u12bf鄣䋚궊숸ꭄ\uf26fꩶ䊠긆爔鏁숪鍥ꊾ굳틠鍺刂ꢔ≔ꡆʤ굦\ue214鎱戔铥튼鑣\uf2dc\uab1a刁ꥤ퉗集芛ꩦ爬酁\uf212ꩵ芅銳䋤꺺刿깤ቩꙖ㊝꧖利铑䈕锥劸隳˚鉪\ue23b铤牭ꦆ犞꼆ꈨ鄁爮ꯕኄ錳˛鄪㈂꾤뉭鎖튙ꭖ숐週ሗ閥劻铓ዜ邪숄괔ꉪ阦㊛꾶\uf216꠱鈔鏅銅釣ዥ閺\ue23f鐴퉩酆ꊟ遆\uf22dꨁ舕鍥튅閃\uf2e7陊\uf207ꡤ扒꠆犗ꩆꈨ겱Ȩ鄕튼ꡳ⋜鞚鈿귔\uf256鐆䊚ꭆ\ue215鄱ሗ镅芹ꭃ䋚ꡊ숀鍔艩鞶늚꾶∪꩑\uf213ꤥ\ue284鄣㋦ꯪ\uf23c걔扭걦튜鎖䈯ꠑ툓꽅\uf2b8꺣싙锺ሂ醤㉐鄦銣굶刖\uaad1划镥犿銳狛銺눇釄㉐釆슞鏶ȕꛑ㈨鉵튼ꠃ狥\ua95a숆ꡤ퉖꩖늢韖\uf217ꢁ∔鏅\uf281괓⋠鏊爂醔牗醦犦ꬆ∞ꪡ舫ꨵ犽괣拤꺊爿꩔牬ꮶ튠걦ሓ꯱눨邅슸鞓ዜ깚눂阤剨酆⊝鞦\ue210ꡱ\uf210鑥劃钓ዧ꽺∻铴ɒ郆劢ꭖ爨걁㈨雵銅꼃틦겊爹ꛔ扪깖ʝ酦툩꿁舩꡵ኲꠃ\ue2e1鋊鈆陴퉓韦抣铆\uf229铑ሖ겅劻곳ꋢ钚숿附艑ꥦ⊟钆∨鏑Ȩ굅㊇ꤣ拜鎪∻ꭔ㉩鄶犝ꭆ숖귱툩깕\ue2bc걳닜酪\ue23a궴ꉐ겖䊘꿦成鏡\ue210ꮕʲ귣틥겚\uf23f鞴ቖ霦\ue29c귆舔靁鈬靅ꊇ酣苧陪㈃ꠤɓꙦ䊞ꯆ툪긑숮깕늾\uaad3勒鏚爿꾄ɨ겶አ锶툓ꭁ䈓ꤕ⊻꙳狧ꭊሾ釔䉬ꨦ튙鎶∑酁∭겵芄괳⋟镺刹ꦄ艨ꨆ抛꘦ሩ邁툯꣥⊲ꙓ\ue2dfꚚꈼꮴ쉨곖䊞꩖舖鄁∠醕㊾閣ˤ錚ꈽ靤鉖韖芢ꪖር꣱눪ꬵʃꩳ鋜\ua8ca舾鏤鉖釦劚鏦\uf216깁툗鋵ኅ釣닝遊戂鞴뉓醖늝Ꙗ∩ꛡ爗긥튅꼣\uf2e4鍪\uf23e靔䉩邖抠꫶투铱∬釕抺醃틛굪爺ꧤ䉬깦ኝꨆ或괡\uf215갵ኻ釳틥閺ሄ鑔艓銆芘郆刬ꢁ㈨郕튻釣鋜\ua8caȻ郴쉕ꭶ슥궆㈭錁눫ꚅ銄ꥃ\uf2e2꺺舆갤뉗꽦犡镆爐鎁划酵ꊸ鞳拚郪\ue23cꮄ뉓ꩆ銤ꪦ\ue210酁别铥⊹鎃鋤铊刹鈴牮ꪶ加ꤖ툩ꪁ눨靕⊹꺃\uf2e0銊툇遤\uf252곦折酦爪锁划鞕튇醓䋞ꤚ숽껄쉭釶芜逦∫ꚁሒꤵꊁ鞃勣锺䈃郴鉔酦芙霦䈔ꠡ숬ꤕꊻ霣鋣閊刵ꮔ\uf252霆芚鋆\uf216꿁ሕ곥劻鏓拙郚∻ꭄ䉗걖\ue2a6굖∐鎑爩鈥\ue2b8ꫣ䋛ꬊꈇ궄쉑鍶犣ꣶ−긑툖ꦥ늄逳닟갪戀鉴ꉓ钆늠굖舯꛱숖ꡕ劄굓若걊\uf23f꼤牬ꢖ芛꾖∖鏱ꈬ铅늼껓狦隊㈾鑄剡鑶銤깖䈒酁∑鐥劲곓苤锺舀钄扐鑶㊤銖ሩꧡ鈒钕늂鉃狒궺\ue201깴䉔锆⊝鋦戯겑爠鄕늸霓싡霺爺ꠔ剐鍖\uf29a鎶舫锑鈖鞕늂걳틘逪\uf204鋴퉩逖抢꺦툫邁鈔꾵㊹鞣님鉪爼鍔扐걖ኛ醦戨鐱ꈑ钥\ue2b8ꬳ닡靚刾ꭔቭ雖銠꧖\uf215꺁戕韥ꊁ铣ዞ醪눹꺤쉯굖\uf299ꯖ숑귑刑鉅䊼靓㋞깪ሽ遤ቖ釦抡零ꈮ깱爯괅\uf2b9꠳狜邺눹꽔牗鑶አ鄦툯ꬑ㈒꩕ʽ\uaad3䋧깊∹건ꉫꯆ스갆爯궑鈐ꮵ⊇鈳鋥锪\ue23b钔쉫꽶銚邶刞酁㈮铕\uf2bcꮣ닛鏺ሿꥴ扗꠶튢钆ሩ锁ꈪꨕ\uf2b8ꠓ싢꺚ሄꩴ\u1257鑆ʙ镶䈞逡눬酕튀闣ˤ겊鈂酴ቐ銦加錖∕꽡\uf215闅늹ꥣዠ꾺䈹逴\ue255鍶劙鈶戒꿁ꈔ霅㊽釣勠鋺䈻ꡤ퉓꠆\ue298鍦刨각舨陕ኅ镳拦\uabfa舂钔\uf26a깶ʟꬶꈐ鋁ꈨ际튁鈓拥\u0015祛㨒捂⫪撜થ愮ᩇ惞꫞晙竾磍婳礻ᨋ穲髰掬窣緎\u0098ꗾￒ몷켮롹罾뿫뾌ꋻ뼅ꆬ뼧ꕈ\uefb6ꗞ迗ꁧ켪ꂙཹ뵫龉ꚛ⼀\ua62c弻뫈쾮ꕮ쿌멷㼱ꞙ\uef63똻꾏ꂻ꼂뢬\uef3b뿈㾬멮\udfca빗㼶멹ὠꅻ羑\ua7eb弁뵌缤ꎘ澫ꗾ㿒믧༭뫹齡뫫㾉ꃋ켇뾼弽꜈㾯몾࿐ꀧ缷ꔉ齧뷋쾗뤻\udf19뺼꼺빸侭ꑾ忌ꙷ伷붩轧ꎋ辍ꛫἄ뭼⼿ꐸ澫ꁎ\uefcaꟇ弬뚩潾ꅫ澒ꏛ켃ꈌ\udf38묘ླ꜎Ὴꁇ\udf35밹影뙛辖뵋뼁ꃼ鼠븈⾨뽞⿑ꝷ꼩륩⽼뷻龑ꕋ鼝리Ἱꕈ澢\ua7de俊봇弶ꎉ齦ꃛ⾒뻛켚뼌뼣\n\ue8a1炒\ue888큽\uef26ꀨ\uec44郞\ueea4ၔ\u0010呖\uf719泏㟃嗱➖关ݟ厳韑咔߬氀\uf77f儶圦\nꬖ蟟\uabff朾ꪑ\u176d귳➛괓꜕\u0010ᙎ佳ᶗ\udf95ṩ俜ԫ켴ᥫ龢྆͜¸\udf14᭮\uef6c\n\ud84d鲮\ud8e4뱎\udd8aచ\udc28糬\uddc8ﱤ";

      do {
         char var29 = var23.charAt(var27);
         int var10001 = var27 + 1;
         int var10002 = var27 + 1 + var29;
         int var31 = 0;
         char[] var30 = var23.substring(var10001, var10002).toCharArray();

         do {
            int var32 = var30[var31];

            var32 = (char)(switch (var31 % 7) {
               default -> 49;
               case 1 -> 116;
               case 2 -> 184;
               case 3 -> 147;
               case 4 -> 134;
               case 5 -> 199;
               case 6 -> 20;
            }) ^ var32;
            if (var31 % 2 == 0) {
               var30[var31] = (char)((var32 >>> 4 | var32 << 12) & 65535 ^ var28);
            } else {
               var30[var31] = (char)((var32 << 4 | var32 >>> 12) & 65535 ^ var28);
            }
         } while (++var31 < var30.length);

         var25[var26] = new String(var30);
         var26++;
         var27 = var27 + var29 + 1;
      } while (var27 < var24);

      baabb = var25;
      babaa = new Object[var25.length];
      byte var38 = 0;
      int var45 = 0;
      byte[] var65 = "a¨Ê4RVÎê\u00ad\u007f\u0017ðüµj5\u008cÃ\u008cÒ\u001egø#V\u0012Hã¤ío«\u008dÊÔ¯8\u0081\u008f\u0091-=_K\u0083»©DÏf\n;\u0088Ä\u0091\t)â>$:ÿzâñúlèw\u001ca\u008e\u0012\u007föf\u0097\u0014Ú\u009f2LZ(Ê;2\u009b\u009a6§\u0096\u0099u?Â\u0011þ·\u0016Äè'\u009fµ*ÜPd\u001eôÖ\u0001Ð\"ÝÏÆ,ðËoT\u0000ñÛrÊùOÃè\rU\u007fâÝ\u0085²\tÄ\u0092®Y)_f±'\f\u001f/\u0017LgVf\u001c\u001d£áT\u00063eq\\±ÜæÄ7¢\n\u0010ÞGAÝ@)':è Ø~í/ëg¸÷ÝÆEÀ\u0082\\s´\"]\u009e\u008aÈ\tS\u009bS:8LxÑ·±¼ÓuÕàv;.Èøx¥RíÖ|ërÎ.v\u009b@\u009cËD\u0082\u0090\u009a[mÓ\u0007ý¾\u0084TÂ\u00957iÍ×ÐÎ\u001a©\u0017âÑûµ\u0090,~oy\u009c\"\u0019\u008fxnAL\u0013Þ¸\u0012É\u0015Ëë;\u0082Sp&\u007fÙ7ú0_\u0007\u0017\u0011K\u0007\u009bs&E\u0017@\u0088\u009e£¸\u009bK\u0088;\u0005ÑµT2\u0007ÔB&\t\u001f\u0091t®ã¥n6¿5±Pp÷\u00850SÈòP%þàº\u0011\u000f@\u009d\u0015\u0011\u0013\u009fz\u0001îÐ£ \u0007?ì\u001f\u0003m\u0089p\u00144\u0004«ad\u0095L¥\u008f\u0087/2Ú&\u0010¸3\u0089C\u00ad\u0018YÄ\u0084_E\u0097¿þ¾«¼¬àÐ7\u001dÆèõú\u001e22ËÂ)®\u0089èWf\u0014§[~Eh~z\u0019ï$N<ñ¡Û\u008cT§ÛÐå,.ÎñWeì{z2©{\u0014Lk§ìÌ`\u00923¦\u0081/nî-\u0093û\u0006ÌÓg(K\u00ad!@7\u0095 \u000e´µµÛ7bÙÄ\u008ag¨ûkÒã\u0014Ö\u009c¿¯/°Â3¥\u0089\u0080ÄFt%By\u0000\u0093»p\u008aF=\r\u0083ÔaÅÿ¶Í¬\u0092Úâ\u008c^AÂ§úÛÕU\u001c,fÆµ\u009cÄâY@^i>\r\tÒ\u008fÉ¬hØQ\u0011-¸U±U GHb[\u00990\u0002R\u0002x^¾°Q\u0083ÖÌ%o\u0099r,(G5x3»cÇKiÆ\u009dà\u0019¸ZÑ\u0019Ü¦W7\u001dØ¿¢Å\u001c2õçiWFÂ\u0083{©¹\u00806\u00963Þ\u0084ËÃ \u007f]}ì\u0091\f\u0015Oñ\u0095\u000bP1Ô\u001ddt¶\u009a]z\u0087éCç]wy\u0001é\u00ad1\u0099+â@þ\u0018R»\u009c\u00024_aõ±9-V{$B©\rÆaaÓ\u0013¾·ÿ\u0016\u0085`3A¡ÁGø\u0091¥ÞÂ*KÌ\u001e\u001fïsEX¶y<\u001f\u0002\u009a8l\tÎêq\r:¼\u009a¿Üjï_T\u0006½þþa.ö\u0006ü4\u001d\u009aK\u009c)\u001cÑ\u0081mV\u0091'²A=Ñ\u008eZç.øf=A]±K\u0082i\u0004%£P\u001aV`¢u×2\u0083 ÕQr\u0094\u0081\u0099Ü\u0011²D?}¹D\u0096¦zJ\u0013 4I\u008fKk\u0089|¿¥ ¸ÿÌ\u0094w?\u0007ú\u0085\u001d\u0095lf\u000fEÛP\u0082\u009c\u0001Qq»\u009d\u0010L\u0082\u009enÀ\u008d\u009eO`9u\u009f_\u001f\u001eX\u0018\u00913\u001b\u0093ÆeÚ'µ*Õe×ÇaHj^\u0004ÅÉµ\u009a$ò»ðGs®6p¸^¶\fC²\u008c©n¬S\u0016\u0096ïj5 o9¥Uº\u0085}\r\u0001G(<@\u0000\u0084¡iâq\u007féúÔðcíò²\u0086\u0019A¾QÃ@§4Ö(Hs,\u0016àEµKÚÖéØ\u0018Mé\u009f~\u0019øêf\b+ê%¸¹\rDõ\u009c\fÒ$[\u008b\u0095\u009e\rºe\u0098~\u0094\u0081\u008dÎ\u001b^\u0092¹\u0005\u0085ÃúóLÅiO\u0092+«I\u009dÀa\u0097\u001bQ=!~\"\u0081rØÐk\u0099Ð\u0081²w#\u00adÁI\u0082\u0087\u008c\u0095ÿýÙ$s«^×h\u000eo\\\u0086\u001e¼Wt\u0090\u0000+O\fm¶\u0094{H\b\n\u001d\u0011üÇß!eß[Öd\fPÝ¸Ô{rë{%£\u0083ýí¿,`>X\u0007\bð\u0095¢d\u0001¹x¥F:q¹\u0002°\u0007Ì\tÉ±c0\u001bnK3\u008bïVº\u0007û\u00963ë\u0090-À©/ð\u009f\u0084\u0094t\"·[\u0007\u0012° Ø®¨;ªMwÊ\nh¹\u0088\u009eÈÅüQÊHð6D\u0006\u0014\u0019|ø¾l1\u0018\fò|¿m\u0097lÀ\u0012\u000bÁ³eßl\u000fT\u0010¢cd¡\u001c·\u0000µTMPÕ\u0081?ù'c_\u0011\u0095´'í\b\u0011\u0092ÀDm\u0015Æ\u0003H°`PM¦bpj\r\u000bðÉpi£µ\u0015\u001c\u0016\u0003ß#0\f?¯1ÀþÆ+!\u0010\u008ag\u0097Ëï\u008ckú±\u007f\u008eØH´±¢¡7\n\u0002©þô-n~Juõ \u0083¶õUø(\u00821°R\b\u0003:iA¿\u008eW\u0013\u0004ö\u001f>\u00adDÀîÕÊ-a\u0099ëo¸¸[\u008d]¯LH\u0095wÓÌ×2¹Áo®øÌØ¢\u008euß~\u0087\u009dæUCæ3\u000f\u008e`\u000få\u000bðö¸å{ÍÅµ¤hn\u0001ç®#N×òOE\u0006ïd$=\u0001Ø«hý[cð¼\u0013HÆ²E\\õª nØ\"\u001eè~è\u0093\u0091¨\u0016`Y0c ^l\u0017¡\f\u008c\u0094\u008f\u008d\u0012ûÈ> ÄdôÀ¸#µ\u0017º\u0014ªÌI4Þ\"ÄÚ3\u008cm\u0090Â?\u008bàÅ\u0001ÄÜþl\u0086\u0093-áyxs0{H®?«Ï´\u007fÄ\u0088Ã\u0007\u0001tÙ\u008f\u008e7^\u0003ë2\u0093m¾\u0085\u001c«o\u0095]ÿ<iÉ\u0094\u0016r3ÚÜì\u001c\u0088áË\u0090§ º\u0010\u0083\u00817\u000eË\u0013\u0001\u009b±2\u0006ª\u009f\u001fo\u0083ô¦²Zïí\u0004÷LBçS\t£\u0000\u009525-6´²U\u0014\u001ae\u0010\u00120³\u0096%}\u0080Âj-KïÒKØ\n5¸\u0085yq\u0015\u0091Ã\u001a-Q½kÉQ&\u0089³+\u0084EõÍ\u0082Ò¿ÕK¤Uøu¿¡ç?\u001f²\u008d\"\u0015jX\u0006\u0080\u0005½FÆAÖZ~\u0094Ýfî¯\u0004)O¢ÿ4ß\u001b¹\u008aë\u0094\u0086¾\u0000\r \u009d-\u001eì¡\u000f®|Ve\u0005ÍH}H¶i×â$\u0013¹\u009eyÏ\u0007Ó\u0011HKJH\u001fÇfæ_ÑE¾¼W\u0006\u0010Éñ=ô!\"$b\u0001Dº\u0000nO@õ\u0002¡aaug<¤%»ÒCN\f¨\u0090íËd©P?hª.å\u000fÂ@@\u008fÖä\u0083ýÔZª\u009b\u001bË®=K;µ6.«\u008dí$L(\u0004´ÕÏ\f\u0016oÔ\u000e\u000fW¦ú^\u008b\u0087¾ÞãpS¤.\u009dFï/\u0085m¸ìjìYZÏ$\u009dK\\\u0018\"ÔËÓ:Ô\u00965\u0013ö\u0002¿\u009b\u0012|Ê597¼6\u0006Í¬´&\\Ý@|´r \u001chêìúÿ¹\u0095«È\u0005Þ³G\u001d¯*i#R\u0099¤\n\u0089³¾_·X¼Ó\u0011 \u009c\"\u001e9·±tÑ\u0003¬\u009a\u0085ü!\u009aE\u009f³ó\u0000=ðÂüüè\u0011e\u009c]#HüCZOXòa"
         .getBytes("ISO-8859-1");
      baaba = new int[488];

      int var92;
      do {
         baaba[var38] = ((var65[var45] & 255) << 24 | (var65[var45 + 1] & 255) << 16 | (var65[var45 + 2] & 255) << 8 | var65[var45 + 3] & 255) ^ 260105236;
         var38 += 1;
         var92 = var45 + 4;
         var45 += 4;
      } while (var92 < var65.length);

      String[] var21 = new String[a(308654223, var33 ^ 244594596)];
      int var19 = 0;
      String var18;
      int var20 = (var18 = b(22350, var33 ^ -1751594532, '脍')).length();
      int var17 = a(308654208, var33 ^ -1340960066);
      int var36 = -1;

      label131:
      while (true) {
         String var39 = var18.substring(++var36, var36 + var17);
         var45 = (byte)-1;

         while (true) {
            label126: {
               char[] var50 = var39.toCharArray();
               var92 = var50.length;
               int var22 = 0;
               var74 = var50;
               var45 = var92;
               char[] var96;
               int var116;
               if (var92 <= 1) {
                  var96 = var50;
                  var116 = var22;
               } else {
                  var74 = var50;
                  var45 = var92;
                  if (var92 <= var22) {
                     break label126;
                  }

                  var96 = var50;
                  var116 = var22;
               }

               while (true) {
                  var96[var116] = (char)(var96[var116] ^ switch (var22 % a(308654211, var33 ^ 245661779)) {
                     case 0 -> a(308654212, var33 ^ 267805469);
                     case 1 -> a(308654213, var33 ^ 561512205);
                     case 2 -> a(308654214, var33 ^ 1724174187);
                     case 3 -> a(308654215, var33 ^ -905040657);
                     case 4 -> a(308654232, var33 ^ -1924138961);
                     case 5 -> a(308654233, var33 ^ -1169153098);
                     default -> a(308654234, var33 ^ -1708864163);
                  });
                  var22++;
                  if (var45 == 0) {
                     var116 = var45;
                     var96 = var74;
                  } else {
                     if (var45 <= var22) {
                        break;
                     }

                     var96 = var74;
                     var116 = var22;
                  }
               }
            }

            String var103 = new String(var74).intern();
            switch (var45) {
               case 0:
                  var21[var19++] = var103;
                  if ((var36 += var17) >= var20) {
                     abaab = var21;
                     aabb = new String[a(308654210, var33 ^ -828121112)];
                     long var8 = 8486847536742999645L;
                     long[] var14 = new long[a(308654235, var33 ^ 1959354407)];
                     int var11 = 0;
                     String var12;
                     int var13 = (var12 = b(22348, var33 ^ -72757547, 'Ẍ')).length();
                     byte var10 = 0;

                     label105:
                     while (true) {
                        int var57 = var10;
                        var10 += 8;
                        String var41 = var12.substring(var57, var10);
                        var57 = (short)22349;
                        int var80 = var33 ^ -1379556320;
                        char var104 = 'ꞁ';
                        byte[] var15 = var41.getBytes("ISO-8859-1");
                        long[] var42 = var14;
                        var57 = var11++;
                        long var81 = (var15[0] & 255L) << a(308654236, var33 ^ 1043910681)
                           | (var15[1] & 255L) << a(308654237, var33 ^ 1312812655)
                           | (var15[2] & 255L) << a(308654238, var33 ^ 1912898342)
                           | (var15[3] & 255L) << a(308654239, var33 ^ 1037504192)
                           | (var15[4] & 255L) << a(308654224, var33 ^ -695607355)
                           | (var15[5] & 255L) << a(308654225, var33 ^ -430648340)
                           | (var15[a(308654226, var33 ^ 1632539550)] & 255L) << a(308654227, var33 ^ 641329996)
                           | var15[a(308654228, var33 ^ -635214883)] & 255L;
                        byte var105 = -1;

                        while (true) {
                           long var118 = var81 ^ var8;
                           switch (var105) {
                              case 0:
                                 var42[var57] = var118;
                                 if (var10 >= var13) {
                                    abab = var14;
                                    ababa = new Integer[a(308654190, var33 ^ -1712052308)];
                                    baa = baaa(a(308654191, var33 ^ -1352573979), 1123573325043870171L);
                                    bba = baaa(a(308654176, var33 ^ 1471100315), 6943125728219359630L);
                                    aaaaa = baaa(a(308654177, var33 ^ 1049028171), 2909474690802323874L);
                                    abbaa = baaa(a(308654178, var33 ^ 480249143), 1123573325043870171L);
                                    aaaba = baaa(a(308654179, var33 ^ -1441953207), 1676955808736422684L);
                                    aabbb = baaa(a(308654180, var33 ^ 1235875515), 5838764569807659546L);
                                    aaaab = baaa(a(308654181, var33 ^ -1368404692), 5838764569807659546L);
                                    long var0 = 2760293883515920004L;
                                    long[] var6 = new long[2];
                                    int var3 = 0;
                                    String var4;
                                    int var5 = (var4 = b(22344, var33 ^ 525510080, '\ue024')).length();
                                    byte var2 = 0;

                                    do {
                                       int var62 = var2;
                                       var2 += 8;
                                       String var44 = var4.substring(var62, var2);
                                       var62 = (short)22345;
                                       int var84 = var33 ^ 1251996113;
                                       var104 = '臡';
                                       byte[] var7 = var44.getBytes("ISO-8859-1");
                                       var62 = var3++;
                                       var118 = (
                                             (var7[0] & 255L) << a(308654182, var33 ^ -2083759142)
                                                | (var7[1] & 255L) << a(308654183, var33 ^ -68225740)
                                                | (var7[2] & 255L) << a(308654200, var33 ^ -1092034571)
                                                | (var7[3] & 255L) << a(308654201, var33 ^ 954176223)
                                                | (var7[4] & 255L) << a(308654202, var33 ^ 1821426207)
                                                | (var7[5] & 255L) << a(308654203, var33 ^ 1093183349)
                                                | (var7[a(308654204, var33 ^ -1529916367)] & 255L) << a(308654205, var33 ^ -678692558)
                                                | var7[a(308654206, var33 ^ 1843446248)] & 255L
                                          )
                                          ^ var0;
                                       byte var109 = -1;
                                       var6[var62] = var118;
                                    } while (var2 < var5);

                                    bbbb = var6;
                                    abbab = new Long[2];
                                    abbbb = aabbaaaba.aaab(
                                       aaaa(a(308654207, var33 ^ 328276851), a(308654192, var33 ^ -2005705492))
                                    );
                                    return;
                                 }
                                 break;
                              default:
                                 var42[var57] = var118;
                                 if (var10 < var13) {
                                    continue label105;
                                 }

                                 var13 = (var12 = b(22346, var33 ^ -1207255729, '쪁')).length();
                                 var10 = 0;
                           }

                           short var60 = var10;
                           var10 += 8;
                           String var43 = var12.substring(var60, var10);
                           var60 = 22347;
                           int var83 = var33 ^ -642322144;
                           var104 = '뿛';
                           var15 = var43.getBytes("ISO-8859-1");
                           var42 = var14;
                           var57 = var11++;
                           var81 = (var15[0] & 255L) << a(308654229, var33 ^ -1717244816)
                              | (var15[1] & 255L) << a(308654230, var33 ^ -1670807010)
                              | (var15[2] & 255L) << a(308654231, var33 ^ 736511174)
                              | (var15[3] & 255L) << a(308654184, var33 ^ 1000804466)
                              | (var15[4] & 255L) << a(308654185, var33 ^ -952927407)
                              | (var15[5] & 255L) << a(308654186, var33 ^ -590793120)
                              | (var15[a(308654187, var33 ^ 1122395202)] & 255L) << a(308654188, var33 ^ 1701464850)
                              | var15[a(308654189, var33 ^ 350908203)] & 255L;
                           var105 = 0;
                        }
                     }
                  }

                  var17 = var18.charAt(var36);
                  break;
               default:
                  var21[var19++] = var103;
                  if ((var36 += var17) < var20) {
                     var17 = var18.charAt(var36);
                     continue label131;
                  }

                  var20 = (var18 = b(22351, var33 ^ -177101733, '哱')).length();
                  var17 = a(308654209, var33 ^ 1030440009);
                  var36 = -1;
            }

            var39 = var18.substring(++var36, var36 + var17);
            var45 = (byte)0;
         }
      }
   }

   private void ab(class_310 var1, class_1703 var2) {
      int var3 = var1.field_1724.field_6012;
      this.bb.entrySet().removeIf(this::abaaaa);
   }

   private boolean ba(class_310 param1, int param2) {
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
      // 30: ldc_w 308654571
      // 33: ldc_w 371556148
      // 36: ldc_w 143307482
      // 39: ixor
      // 3a: invokestatic qeaa361f143ee4a0894bd168fd9b30c66/qf4ccf8f5435d4a78bdca4d6a018b578e/aaabbbbba.a (II)I
      // 3d: ldc2_w 6884738495261050921
      // 40: invokestatic qeaa361f143ee4a0894bd168fd9b30c66/qf4ccf8f5435d4a78bdca4d6a018b578e/aaabbbbba.baaa (IJ)I
      // 43: if_icmplt 50
      // 46: goto 4a
      // 49: athrow
      // 4a: bipush 0
      // 4b: goto 4f
      // 4e: athrow
      // 4f: ireturn
      // 50: aload 0
      // 51: iload 3
      // 52: ifne 64
      // 55: getfield qeaa361f143ee4a0894bd168fd9b30c66/qf4ccf8f5435d4a78bdca4d6a018b578e/aaabbbbba.baba Lqeaa361f143ee4a0894bd168fd9b30c66/qf4ccf8f5435d4a78bdca4d6a018b578e/bbbbaaaa;
      // 58: ifnull a3
      // 5b: goto 5f
      // 5e: athrow
      // 5f: aload 0
      // 60: goto 64
      // 63: athrow
      // 64: getfield qeaa361f143ee4a0894bd168fd9b30c66/qf4ccf8f5435d4a78bdca4d6a018b578e/aaabbbbba.baba Lqeaa361f143ee4a0894bd168fd9b30c66/qf4ccf8f5435d4a78bdca4d6a018b578e/bbbbaaaa;
      // 67: invokevirtual qeaa361f143ee4a0894bd168fd9b30c66/qf4ccf8f5435d4a78bdca4d6a018b578e/bbbbaaaa.b ()Z
      // 6a: iload 3
      // 6b: ifne ab
      // 6e: ifeq a3
      // 71: goto 75
      // 74: athrow
      // 75: aload 0
      // 76: getfield qeaa361f143ee4a0894bd168fd9b30c66/qf4ccf8f5435d4a78bdca4d6a018b578e/aaabbbbba.baba Lqeaa361f143ee4a0894bd168fd9b30c66/qf4ccf8f5435d4a78bdca4d6a018b578e/bbbbaaaa;
      // 79: invokevirtual qeaa361f143ee4a0894bd168fd9b30c66/qf4ccf8f5435d4a78bdca4d6a018b578e/bbbbaaaa.aa ()I
      // 7c: iload 3
      // 7d: ifne ab
      // 80: goto 84
      // 83: athrow
      // 84: iload 2
      // 85: if_icmpne a3
      // 88: goto 8c
      // 8b: athrow
      // 8c: aload 1
      // 8d: aload 0
      // 8e: getfield qeaa361f143ee4a0894bd168fd9b30c66/qf4ccf8f5435d4a78bdca4d6a018b578e/aaabbbbba.baba Lqeaa361f143ee4a0894bd168fd9b30c66/qf4ccf8f5435d4a78bdca4d6a018b578e/bbbbaaaa;
      // 91: iload 3
      // 92: ifne f3
      // 95: goto 99
      // 98: athrow
      // 99: invokestatic qeaa361f143ee4a0894bd168fd9b30c66/qf4ccf8f5435d4a78bdca4d6a018b578e/aabbabbbb.ababbab (Lnet/minecraft/class_310;Lqeaa361f143ee4a0894bd168fd9b30c66/qf4ccf8f5435d4a78bdca4d6a018b578e/bbbbaaaa;)Z
      // 9c: ifne ee
      // 9f: goto a3
      // a2: athrow
      // a3: aload 1
      // a4: invokestatic qeaa361f143ee4a0894bd168fd9b30c66/qf4ccf8f5435d4a78bdca4d6a018b578e/aabbabbbb.baabaab (Lnet/minecraft/class_310;)I
      // a7: goto ab
      // aa: athrow
      // ab: iload 3
      // ac: ifne bc
      // af: iload 2
      // b0: if_icmpeq bf
      // b3: goto b7
      // b6: athrow
      // b7: bipush 1
      // b8: goto bc
      // bb: athrow
      // bc: goto c0
      // bf: bipush 0
      // c0: istore 4
      // c2: iload 4
      // c4: iload 3
      // c5: ifne db
      // c8: ifeq de
      // cb: goto cf
      // ce: athrow
      // cf: aload 0
      // d0: aload 0
      // d1: getfield qeaa361f143ee4a0894bd168fd9b30c66/qf4ccf8f5435d4a78bdca4d6a018b578e/aaabbbbba.aabba Lqeaa361f143ee4a0894bd168fd9b30c66/qf4ccf8f5435d4a78bdca4d6a018b578e/aaabbbab;
      // d4: invokevirtual qeaa361f143ee4a0894bd168fd9b30c66/qf4ccf8f5435d4a78bdca4d6a018b578e/aaabbbbba.aaa (Lqeaa361f143ee4a0894bd168fd9b30c66/qf4ccf8f5435d4a78bdca4d6a018b578e/aaabbbab;)I
      // d7: goto db
      // da: athrow
      // db: goto df
      // de: bipush 0
      // df: istore 5
      // e1: aload 0
      // e2: aload 1
      // e3: aload 0
      // e4: iload 2
      // e5: iload 5
      // e7: bipush 1
      // e8: invokestatic qeaa361f143ee4a0894bd168fd9b30c66/qf4ccf8f5435d4a78bdca4d6a018b578e/aabbabbbb.aaabaa (Lnet/minecraft/class_310;Ljava/lang/Object;IIZ)Lqeaa361f143ee4a0894bd168fd9b30c66/qf4ccf8f5435d4a78bdca4d6a018b578e/bbbbaaaa;
      // eb: putfield qeaa361f143ee4a0894bd168fd9b30c66/qf4ccf8f5435d4a78bdca4d6a018b578e/aaabbbbba.baba Lqeaa361f143ee4a0894bd168fd9b30c66/qf4ccf8f5435d4a78bdca4d6a018b578e/bbbbaaaa;
      // ee: aload 1
      // ef: aload 0
      // f0: getfield qeaa361f143ee4a0894bd168fd9b30c66/qf4ccf8f5435d4a78bdca4d6a018b578e/aaabbbbba.baba Lqeaa361f143ee4a0894bd168fd9b30c66/qf4ccf8f5435d4a78bdca4d6a018b578e/bbbbaaaa;
      // f3: invokestatic qeaa361f143ee4a0894bd168fd9b30c66/qf4ccf8f5435d4a78bdca4d6a018b578e/aabbabbbb.abbbba (Lnet/minecraft/class_310;Lqeaa361f143ee4a0894bd168fd9b30c66/qf4ccf8f5435d4a78bdca4d6a018b578e/bbbbaaaa;)Z
      // f6: ireturn
   }

   private static String b(int var0, int var1, char var2) {
      int var3 = var0 ^ 22350;
      char[] var4 = baabb[var3].toCharArray();
      StackTraceElement[] var5 = (StackTraceElement[])babaa[var3];
      StackTraceElement[] var6;
      if (var5 != null) {
         var6 = var5;
      } else {
         var6 = new Throwable().getStackTrace();
         babaa[var3] = var6;
      }

      StackTraceElement var7 = var6[1];
      int var8 = (var7.getClassName().hashCode() ^ var7.getMethodName().hashCode()) >> 16 ^ 8042;
      int var9 = 0;

      do {
         int var10 = var4[var9] + 7028;
         var10 += 37557;
         var10 -= 17057;
         var10 -= 33292;
         var10 -= 10998;
         var10 -= 4933;
         var10 -= 63384;
         var10 -= 14384;
         var4[var9] = (char)(var10 ^ var8 ^ var2 ^ var1 >> 16);
      } while (++var9 < var4.length);

      return new String(var4).intern();
   }

   private static int bb(babbab param0, babbab param1) {
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
      // 06: ifne 1b
      // 09: invokevirtual qeaa361f143ee4a0894bd168fd9b30c66/qf4ccf8f5435d4a78bdca4d6a018b578e/babbab.ba ()Lqeaa361f143ee4a0894bd168fd9b30c66/qf4ccf8f5435d4a78bdca4d6a018b578e/ababbaa;
      // 0c: getfield qeaa361f143ee4a0894bd168fd9b30c66/qf4ccf8f5435d4a78bdca4d6a018b578e/ababbaa.abb Z
      // 0f: ifeq 28
      // 12: goto 16
      // 15: athrow
      // 16: aload 1
      // 17: goto 1b
      // 1a: athrow
      // 1b: invokevirtual qeaa361f143ee4a0894bd168fd9b30c66/qf4ccf8f5435d4a78bdca4d6a018b578e/babbab.ab ()D
      // 1e: aload 0
      // 1f: invokevirtual qeaa361f143ee4a0894bd168fd9b30c66/qf4ccf8f5435d4a78bdca4d6a018b578e/babbab.ab ()D
      // 22: invokestatic java/lang/Double.compare (DD)I
      // 25: goto 29
      // 28: bipush 0
      // 29: ireturn
   }

   private int aaa(aaabbbab var1) {
      return Math.max(0, (int)Math.ceil(this.abaaa(var1) / 50.0));
   }

   private static boolean aab() {
      return false;
   }

   private boolean aba(class_1799 param1) {
      // $VF: Couldn't be decompiled
      // Please report this to the Vineflower issue tracker, at https://github.com/Vineflower/vineflower/issues with a copy of the class file (if you have the rights to distribute it!)
      // java.lang.RuntimeException: parsing failure!
      //   at org.jetbrains.java.decompiler.modules.decompiler.decompose.DomHelper.parseGraph(DomHelper.java:211)
      //   at org.jetbrains.java.decompiler.main.rels.MethodProcessor.codeToJava(MethodProcessor.java:166)
      //
      // Bytecode:
      // 000: ldc_w 521950021
      // 003: istore 4
      // 005: getstatic qeaa361f143ee4a0894bd168fd9b30c66/qf4ccf8f5435d4a78bdca4d6a018b578e/baaabbaa.bba I
      // 008: getstatic net/minecraft/class_7923.field_41178 Lnet/minecraft/class_7922;
      // 00b: aload 1
      // 00c: invokevirtual net/minecraft/class_1799.method_7909 ()Lnet/minecraft/class_1792;
      // 00f: invokeinterface net/minecraft/class_7922.method_10221 (Ljava/lang/Object;)Lnet/minecraft/class_2960; 2
      // 014: invokevirtual net/minecraft/class_2960.method_12832 ()Ljava/lang/String;
      // 017: astore 3
      // 018: istore 2
      // 019: aload 3
      // 01a: ldc_w 308654572
      // 01d: iload 4
      // 01f: ldc_w -1908753132
      // 022: ixor
      // 023: invokestatic qeaa361f143ee4a0894bd168fd9b30c66/qf4ccf8f5435d4a78bdca4d6a018b578e/aaabbbbba.a (II)I
      // 026: ldc_w 308654573
      // 029: iload 4
      // 02b: ldc_w 480175289
      // 02e: ixor
      // 02f: invokestatic qeaa361f143ee4a0894bd168fd9b30c66/qf4ccf8f5435d4a78bdca4d6a018b578e/aaabbbbba.a (II)I
      // 032: invokestatic qeaa361f143ee4a0894bd168fd9b30c66/qf4ccf8f5435d4a78bdca4d6a018b578e/aaabbbbba.aaaa (II)Ljava/lang/String;
      // 035: invokestatic qeaa361f143ee4a0894bd168fd9b30c66/qf4ccf8f5435d4a78bdca4d6a018b578e/aabbaaaba.abba (Ljava/lang/String;)Ljava/lang/String;
      // 038: invokevirtual java/lang/String.endsWith (Ljava/lang/String;)Z
      // 03b: iload 2
      // 03c: ifne 10b
      // 03f: ifne 10a
      // 042: goto 046
      // 045: athrow
      // 046: aload 3
      // 047: ldc_w 308654574
      // 04a: iload 4
      // 04c: ldc_w 1424718124
      // 04f: ixor
      // 050: invokestatic qeaa361f143ee4a0894bd168fd9b30c66/qf4ccf8f5435d4a78bdca4d6a018b578e/aaabbbbba.a (II)I
      // 053: ldc_w 308654575
      // 056: iload 4
      // 058: ldc_w 1508616984
      // 05b: ixor
      // 05c: invokestatic qeaa361f143ee4a0894bd168fd9b30c66/qf4ccf8f5435d4a78bdca4d6a018b578e/aaabbbbba.a (II)I
      // 05f: invokestatic qeaa361f143ee4a0894bd168fd9b30c66/qf4ccf8f5435d4a78bdca4d6a018b578e/aaabbbbba.aaaa (II)Ljava/lang/String;
      // 062: invokestatic qeaa361f143ee4a0894bd168fd9b30c66/qf4ccf8f5435d4a78bdca4d6a018b578e/aabbaaaba.abba (Ljava/lang/String;)Ljava/lang/String;
      // 065: invokevirtual java/lang/String.endsWith (Ljava/lang/String;)Z
      // 068: iload 2
      // 069: ifne 10b
      // 06c: goto 070
      // 06f: athrow
      // 070: ifne 10a
      // 073: goto 077
      // 076: athrow
      // 077: aload 3
      // 078: ldc_w 308654560
      // 07b: iload 4
      // 07d: ldc_w -1892424330
      // 080: ixor
      // 081: invokestatic qeaa361f143ee4a0894bd168fd9b30c66/qf4ccf8f5435d4a78bdca4d6a018b578e/aaabbbbba.a (II)I
      // 084: ldc_w 308654561
      // 087: iload 4
      // 089: ldc_w -981001057
      // 08c: ixor
      // 08d: invokestatic qeaa361f143ee4a0894bd168fd9b30c66/qf4ccf8f5435d4a78bdca4d6a018b578e/aaabbbbba.a (II)I
      // 090: invokestatic qeaa361f143ee4a0894bd168fd9b30c66/qf4ccf8f5435d4a78bdca4d6a018b578e/aaabbbbba.aaaa (II)Ljava/lang/String;
      // 093: invokestatic qeaa361f143ee4a0894bd168fd9b30c66/qf4ccf8f5435d4a78bdca4d6a018b578e/aabbaaaba.abba (Ljava/lang/String;)Ljava/lang/String;
      // 096: invokevirtual java/lang/String.endsWith (Ljava/lang/String;)Z
      // 099: iload 2
      // 09a: ifne 10b
      // 09d: goto 0a1
      // 0a0: athrow
      // 0a1: ifne 10a
      // 0a4: goto 0a8
      // 0a7: athrow
      // 0a8: aload 3
      // 0a9: ldc_w 308654562
      // 0ac: iload 4
      // 0ae: ldc_w 801402508
      // 0b1: ixor
      // 0b2: invokestatic qeaa361f143ee4a0894bd168fd9b30c66/qf4ccf8f5435d4a78bdca4d6a018b578e/aaabbbbba.a (II)I
      // 0b5: ldc_w 308654563
      // 0b8: iload 4
      // 0ba: ldc_w 2126279706
      // 0bd: ixor
      // 0be: invokestatic qeaa361f143ee4a0894bd168fd9b30c66/qf4ccf8f5435d4a78bdca4d6a018b578e/aaabbbbba.a (II)I
      // 0c1: invokestatic qeaa361f143ee4a0894bd168fd9b30c66/qf4ccf8f5435d4a78bdca4d6a018b578e/aaabbbbba.aaaa (II)Ljava/lang/String;
      // 0c4: invokestatic qeaa361f143ee4a0894bd168fd9b30c66/qf4ccf8f5435d4a78bdca4d6a018b578e/aabbaaaba.abba (Ljava/lang/String;)Ljava/lang/String;
      // 0c7: invokevirtual java/lang/String.endsWith (Ljava/lang/String;)Z
      // 0ca: iload 2
      // 0cb: ifne 10b
      // 0ce: goto 0d2
      // 0d1: athrow
      // 0d2: ifne 10a
      // 0d5: goto 0d9
      // 0d8: athrow
      // 0d9: aload 3
      // 0da: ldc_w 308654564
      // 0dd: iload 4
      // 0df: ldc_w -845202437
      // 0e2: ixor
      // 0e3: invokestatic qeaa361f143ee4a0894bd168fd9b30c66/qf4ccf8f5435d4a78bdca4d6a018b578e/aaabbbbba.a (II)I
      // 0e6: ldc_w 308654565
      // 0e9: iload 4
      // 0eb: ldc_w 1975672902
      // 0ee: ixor
      // 0ef: invokestatic qeaa361f143ee4a0894bd168fd9b30c66/qf4ccf8f5435d4a78bdca4d6a018b578e/aaabbbbba.a (II)I
      // 0f2: invokestatic qeaa361f143ee4a0894bd168fd9b30c66/qf4ccf8f5435d4a78bdca4d6a018b578e/aaabbbbba.aaaa (II)Ljava/lang/String;
      // 0f5: invokestatic qeaa361f143ee4a0894bd168fd9b30c66/qf4ccf8f5435d4a78bdca4d6a018b578e/aabbaaaba.abba (Ljava/lang/String;)Ljava/lang/String;
      // 0f8: invokevirtual java/lang/String.equals (Ljava/lang/Object;)Z
      // 0fb: iload 2
      // 0fc: ifne 10b
      // 0ff: goto 103
      // 102: athrow
      // 103: ifeq 10e
      // 106: goto 10a
      // 109: athrow
      // 10a: bipush 1
      // 10b: goto 10f
      // 10e: bipush 0
      // 10f: ireturn
   }

   private boolean abb() {
      try {
         if (this.babb.abbb() == aabaaaba.ab) {
            return true;
         }
      } catch (MatchException var1) {
         throw var1;
      }

      return false;
   }

   private void bab() {
      // $VF: Couldn't be decompiled
      // Please report this to the Vineflower issue tracker, at https://github.com/Vineflower/vineflower/issues with a copy of the class file (if you have the rights to distribute it!)
      // java.lang.RuntimeException: parsing failure!
      //   at org.jetbrains.java.decompiler.modules.decompiler.decompose.DomHelper.parseGraph(DomHelper.java:211)
      //   at org.jetbrains.java.decompiler.main.rels.MethodProcessor.codeToJava(MethodProcessor.java:166)
      //
      // Bytecode:
      // 00: getstatic qeaa361f143ee4a0894bd168fd9b30c66/qf4ccf8f5435d4a78bdca4d6a018b578e/baaabbaa.bba I
      // 03: istore 1
      // 04: iload 1
      // 05: invokestatic net/minecraft/class_310.method_1551 ()Lnet/minecraft/class_310;
      // 08: astore 2
      // 09: ifne a4
      // 0c: aload 2
      // 0d: ifnull 33
      // 10: goto 14
      // 13: athrow
      // 14: aload 2
      // 15: iload 1
      // 16: ifne 2c
      // 19: goto 1d
      // 1c: athrow
      // 1d: getfield net/minecraft/class_310.field_1724 Lnet/minecraft/class_746;
      // 20: ifnull 33
      // 23: goto 27
      // 26: athrow
      // 27: aload 2
      // 28: goto 2c
      // 2b: athrow
      // 2c: aload 0
      // 2d: getstatic qeaa361f143ee4a0894bd168fd9b30c66/qf4ccf8f5435d4a78bdca4d6a018b578e/abbaaabba.aba Lqeaa361f143ee4a0894bd168fd9b30c66/qf4ccf8f5435d4a78bdca4d6a018b578e/abbaaabba;
      // 30: invokestatic qeaa361f143ee4a0894bd168fd9b30c66/qf4ccf8f5435d4a78bdca4d6a018b578e/aabbabbbb.bbaaabb (Lnet/minecraft/class_310;Ljava/lang/Object;Lqeaa361f143ee4a0894bd168fd9b30c66/qf4ccf8f5435d4a78bdca4d6a018b578e/abbaaabba;)V
      // 33: aload 0
      // 34: invokevirtual qeaa361f143ee4a0894bd168fd9b30c66/qf4ccf8f5435d4a78bdca4d6a018b578e/aaabbbbba.aabaaa ()V
      // 37: aload 0
      // 38: aconst_null
      // 39: putfield qeaa361f143ee4a0894bd168fd9b30c66/qf4ccf8f5435d4a78bdca4d6a018b578e/aaabbbbba.baaa Lnet/minecraft/class_2338;
      // 3c: aload 0
      // 3d: aconst_null
      // 3e: putfield qeaa361f143ee4a0894bd168fd9b30c66/qf4ccf8f5435d4a78bdca4d6a018b578e/aaabbbbba.abbba Lnet/minecraft/class_2338;
      // 41: aload 0
      // 42: lconst_0
      // 43: putfield qeaa361f143ee4a0894bd168fd9b30c66/qf4ccf8f5435d4a78bdca4d6a018b578e/aaabbbbba.baaab J
      // 46: aload 0
      // 47: ldc_w 308654566
      // 4a: ldc_w -1293449808
      // 4d: ldc_w -2032088399
      // 50: ixor
      // 51: invokestatic qeaa361f143ee4a0894bd168fd9b30c66/qf4ccf8f5435d4a78bdca4d6a018b578e/aaabbbbba.a (II)I
      // 54: ldc2_w 1848905881191263389
      // 57: invokestatic qeaa361f143ee4a0894bd168fd9b30c66/qf4ccf8f5435d4a78bdca4d6a018b578e/aaabbbbba.baaa (IJ)I
      // 5a: putfield qeaa361f143ee4a0894bd168fd9b30c66/qf4ccf8f5435d4a78bdca4d6a018b578e/aaabbbbba.abaa I
      // 5d: aload 0
      // 5e: bipush 0
      // 5f: putfield qeaa361f143ee4a0894bd168fd9b30c66/qf4ccf8f5435d4a78bdca4d6a018b578e/aaabbbbba.aaba Z
      // 62: aload 0
      // 63: ldc_w 308654567
      // 66: ldc_w -1293449808
      // 69: ldc_w -1778545034
      // 6c: ixor
      // 6d: invokestatic qeaa361f143ee4a0894bd168fd9b30c66/qf4ccf8f5435d4a78bdca4d6a018b578e/aaabbbbba.a (II)I
      // 70: ldc2_w 1848905881191263389
      // 73: invokestatic qeaa361f143ee4a0894bd168fd9b30c66/qf4ccf8f5435d4a78bdca4d6a018b578e/aaabbbbba.baaa (IJ)I
      // 76: putfield qeaa361f143ee4a0894bd168fd9b30c66/qf4ccf8f5435d4a78bdca4d6a018b578e/aaabbbbba.aaabb I
      // 79: aload 0
      // 7a: bipush 0
      // 7b: putfield qeaa361f143ee4a0894bd168fd9b30c66/qf4ccf8f5435d4a78bdca4d6a018b578e/aaabbbbba.aaaa Z
      // 7e: aload 0
      // 7f: ldc_w 308654584
      // 82: ldc_w -1293449808
      // 85: ldc_w 1593350243
      // 88: ixor
      // 89: invokestatic qeaa361f143ee4a0894bd168fd9b30c66/qf4ccf8f5435d4a78bdca4d6a018b578e/aaabbbbba.a (II)I
      // 8c: ldc2_w 1848905881191263389
      // 8f: invokestatic qeaa361f143ee4a0894bd168fd9b30c66/qf4ccf8f5435d4a78bdca4d6a018b578e/aaabbbbba.baaa (IJ)I
      // 92: putfield qeaa361f143ee4a0894bd168fd9b30c66/qf4ccf8f5435d4a78bdca4d6a018b578e/aaabbbbba.abba I
      // 95: aload 0
      // 96: bipush 0
      // 97: putfield qeaa361f143ee4a0894bd168fd9b30c66/qf4ccf8f5435d4a78bdca4d6a018b578e/aaabbbbba.abaaa Z
      // 9a: aload 0
      // 9b: bipush 0
      // 9c: putfield qeaa361f143ee4a0894bd168fd9b30c66/qf4ccf8f5435d4a78bdca4d6a018b578e/aaabbbbba.bbb Z
      // 9f: aload 0
      // a0: aconst_null
      // a1: putfield qeaa361f143ee4a0894bd168fd9b30c66/qf4ccf8f5435d4a78bdca4d6a018b578e/aaabbbbba.baba Lqeaa361f143ee4a0894bd168fd9b30c66/qf4ccf8f5435d4a78bdca4d6a018b578e/bbbbaaaa;
      // a4: return
   }

   private ababbaa bba(class_1799 param1) {
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
      // 006: ifne 01c
      // 009: getstatic net/minecraft/class_1802.field_8288 Lnet/minecraft/class_1792;
      // 00c: invokevirtual net/minecraft/class_1799.method_31574 (Lnet/minecraft/class_1792;)Z
      // 00f: ifeq 01b
      // 012: goto 016
      // 015: athrow
      // 016: getstatic qeaa361f143ee4a0894bd168fd9b30c66/qf4ccf8f5435d4a78bdca4d6a018b578e/ababbaa.baba Lqeaa361f143ee4a0894bd168fd9b30c66/qf4ccf8f5435d4a78bdca4d6a018b578e/ababbaa;
      // 019: areturn
      // 01a: athrow
      // 01b: aload 1
      // 01c: iload 2
      // 01d: ifne 033
      // 020: getstatic net/minecraft/class_1802.field_8634 Lnet/minecraft/class_1792;
      // 023: invokevirtual net/minecraft/class_1799.method_31574 (Lnet/minecraft/class_1792;)Z
      // 026: ifeq 032
      // 029: goto 02d
      // 02c: athrow
      // 02d: getstatic qeaa361f143ee4a0894bd168fd9b30c66/qf4ccf8f5435d4a78bdca4d6a018b578e/ababbaa.abba Lqeaa361f143ee4a0894bd168fd9b30c66/qf4ccf8f5435d4a78bdca4d6a018b578e/ababbaa;
      // 030: areturn
      // 031: athrow
      // 032: aload 1
      // 033: getstatic net/minecraft/class_1802.field_8463 Lnet/minecraft/class_1792;
      // 036: iload 2
      // 037: ifne 04c
      // 03a: invokevirtual net/minecraft/class_1799.method_31574 (Lnet/minecraft/class_1792;)Z
      // 03d: ifne 05a
      // 040: goto 044
      // 043: athrow
      // 044: aload 1
      // 045: getstatic net/minecraft/class_1802.field_8367 Lnet/minecraft/class_1792;
      // 048: goto 04c
      // 04b: athrow
      // 04c: iload 2
      // 04d: ifne 06b
      // 050: invokevirtual net/minecraft/class_1799.method_31574 (Lnet/minecraft/class_1792;)Z
      // 053: ifeq 05f
      // 056: goto 05a
      // 059: athrow
      // 05a: getstatic qeaa361f143ee4a0894bd168fd9b30c66/qf4ccf8f5435d4a78bdca4d6a018b578e/ababbaa.a Lqeaa361f143ee4a0894bd168fd9b30c66/qf4ccf8f5435d4a78bdca4d6a018b578e/ababbaa;
      // 05d: areturn
      // 05e: athrow
      // 05f: aload 1
      // 060: iload 2
      // 061: ifne 076
      // 064: getstatic net/minecraft/class_1802.field_8574 Lnet/minecraft/class_1792;
      // 067: goto 06b
      // 06a: athrow
      // 06b: invokevirtual net/minecraft/class_1799.method_31574 (Lnet/minecraft/class_1792;)Z
      // 06e: ifne 09d
      // 071: aload 1
      // 072: goto 076
      // 075: athrow
      // 076: getstatic net/minecraft/class_1802.field_8436 Lnet/minecraft/class_1792;
      // 079: iload 2
      // 07a: ifne 097
      // 07d: invokevirtual net/minecraft/class_1799.method_31574 (Lnet/minecraft/class_1792;)Z
      // 080: ifne 09d
      // 083: goto 087
      // 086: athrow
      // 087: aload 1
      // 088: iload 2
      // 089: ifne 0a3
      // 08c: goto 090
      // 08f: athrow
      // 090: getstatic net/minecraft/class_1802.field_8150 Lnet/minecraft/class_1792;
      // 093: goto 097
      // 096: athrow
      // 097: invokevirtual net/minecraft/class_1799.method_31574 (Lnet/minecraft/class_1792;)Z
      // 09a: ifeq 0a2
      // 09d: getstatic qeaa361f143ee4a0894bd168fd9b30c66/qf4ccf8f5435d4a78bdca4d6a018b578e/ababbaa.aabb Lqeaa361f143ee4a0894bd168fd9b30c66/qf4ccf8f5435d4a78bdca4d6a018b578e/ababbaa;
      // 0a0: areturn
      // 0a1: athrow
      // 0a2: aload 1
      // 0a3: iload 2
      // 0a4: ifne 0ba
      // 0a7: getstatic net/minecraft/class_1802.field_8301 Lnet/minecraft/class_1792;
      // 0aa: invokevirtual net/minecraft/class_1799.method_31574 (Lnet/minecraft/class_1792;)Z
      // 0ad: ifeq 0b9
      // 0b0: goto 0b4
      // 0b3: athrow
      // 0b4: getstatic qeaa361f143ee4a0894bd168fd9b30c66/qf4ccf8f5435d4a78bdca4d6a018b578e/ababbaa.bab Lqeaa361f143ee4a0894bd168fd9b30c66/qf4ccf8f5435d4a78bdca4d6a018b578e/ababbaa;
      // 0b7: areturn
      // 0b8: athrow
      // 0b9: aload 1
      // 0ba: getstatic net/minecraft/class_1802.field_23141 Lnet/minecraft/class_1792;
      // 0bd: iload 2
      // 0be: ifne 0d3
      // 0c1: invokevirtual net/minecraft/class_1799.method_31574 (Lnet/minecraft/class_1792;)Z
      // 0c4: ifne 0e1
      // 0c7: goto 0cb
      // 0ca: athrow
      // 0cb: aload 1
      // 0cc: getstatic net/minecraft/class_1802.field_8801 Lnet/minecraft/class_1792;
      // 0cf: goto 0d3
      // 0d2: athrow
      // 0d3: iload 2
      // 0d4: ifne 0ea
      // 0d7: invokevirtual net/minecraft/class_1799.method_31574 (Lnet/minecraft/class_1792;)Z
      // 0da: ifeq 0e6
      // 0dd: goto 0e1
      // 0e0: athrow
      // 0e1: getstatic qeaa361f143ee4a0894bd168fd9b30c66/qf4ccf8f5435d4a78bdca4d6a018b578e/ababbaa.aaaa Lqeaa361f143ee4a0894bd168fd9b30c66/qf4ccf8f5435d4a78bdca4d6a018b578e/ababbaa;
      // 0e4: areturn
      // 0e5: athrow
      // 0e6: aload 1
      // 0e7: getstatic net/minecraft/class_1802.field_8281 Lnet/minecraft/class_1792;
      // 0ea: iload 2
      // 0eb: ifne 109
      // 0ee: invokevirtual net/minecraft/class_1799.method_31574 (Lnet/minecraft/class_1792;)Z
      // 0f1: ifeq 0fd
      // 0f4: goto 0f8
      // 0f7: athrow
      // 0f8: getstatic qeaa361f143ee4a0894bd168fd9b30c66/qf4ccf8f5435d4a78bdca4d6a018b578e/ababbaa.bba Lqeaa361f143ee4a0894bd168fd9b30c66/qf4ccf8f5435d4a78bdca4d6a018b578e/ababbaa;
      // 0fb: areturn
      // 0fc: athrow
      // 0fd: aload 1
      // 0fe: iload 2
      // 0ff: ifne 115
      // 102: getstatic net/minecraft/class_1802.field_8287 Lnet/minecraft/class_1792;
      // 105: goto 109
      // 108: athrow
      // 109: invokevirtual net/minecraft/class_1799.method_31574 (Lnet/minecraft/class_1792;)Z
      // 10c: ifeq 114
      // 10f: getstatic qeaa361f143ee4a0894bd168fd9b30c66/qf4ccf8f5435d4a78bdca4d6a018b578e/ababbaa.baab Lqeaa361f143ee4a0894bd168fd9b30c66/qf4ccf8f5435d4a78bdca4d6a018b578e/ababbaa;
      // 112: areturn
      // 113: athrow
      // 114: aload 1
      // 115: getstatic net/minecraft/class_1802.field_8107 Lnet/minecraft/class_1792;
      // 118: iload 2
      // 119: ifne 12e
      // 11c: invokevirtual net/minecraft/class_1799.method_31574 (Lnet/minecraft/class_1792;)Z
      // 11f: ifne 152
      // 122: goto 126
      // 125: athrow
      // 126: aload 1
      // 127: getstatic net/minecraft/class_1802.field_8236 Lnet/minecraft/class_1792;
      // 12a: goto 12e
      // 12d: athrow
      // 12e: iload 2
      // 12f: ifne 144
      // 132: invokevirtual net/minecraft/class_1799.method_31574 (Lnet/minecraft/class_1792;)Z
      // 135: ifne 152
      // 138: goto 13c
      // 13b: athrow
      // 13c: aload 1
      // 13d: getstatic net/minecraft/class_1802.field_8087 Lnet/minecraft/class_1792;
      // 140: goto 144
      // 143: athrow
      // 144: iload 2
      // 145: ifne 163
      // 148: invokevirtual net/minecraft/class_1799.method_31574 (Lnet/minecraft/class_1792;)Z
      // 14b: ifeq 157
      // 14e: goto 152
      // 151: athrow
      // 152: getstatic qeaa361f143ee4a0894bd168fd9b30c66/qf4ccf8f5435d4a78bdca4d6a018b578e/ababbaa.aba Lqeaa361f143ee4a0894bd168fd9b30c66/qf4ccf8f5435d4a78bdca4d6a018b578e/ababbaa;
      // 155: areturn
      // 156: athrow
      // 157: aload 1
      // 158: iload 2
      // 159: ifne 16f
      // 15c: getstatic net/minecraft/class_1802.field_8786 Lnet/minecraft/class_1792;
      // 15f: goto 163
      // 162: athrow
      // 163: invokevirtual net/minecraft/class_1799.method_31574 (Lnet/minecraft/class_1792;)Z
      // 166: ifeq 16e
      // 169: getstatic qeaa361f143ee4a0894bd168fd9b30c66/qf4ccf8f5435d4a78bdca4d6a018b578e/ababbaa.aaab Lqeaa361f143ee4a0894bd168fd9b30c66/qf4ccf8f5435d4a78bdca4d6a018b578e/ababbaa;
      // 16c: areturn
      // 16d: athrow
      // 16e: aload 1
      // 16f: iload 2
      // 170: ifne 194
      // 173: getstatic net/minecraft/class_1802.field_49098 Lnet/minecraft/class_1792;
      // 176: invokevirtual net/minecraft/class_1799.method_31574 (Lnet/minecraft/class_1792;)Z
      // 179: ifeq 185
      // 17c: goto 180
      // 17f: athrow
      // 180: getstatic qeaa361f143ee4a0894bd168fd9b30c66/qf4ccf8f5435d4a78bdca4d6a018b578e/ababbaa.baaa Lqeaa361f143ee4a0894bd168fd9b30c66/qf4ccf8f5435d4a78bdca4d6a018b578e/ababbaa;
      // 183: areturn
      // 184: athrow
      // 185: aload 1
      // 186: iload 2
      // 187: ifne 19d
      // 18a: getstatic net/minecraft/class_9334.field_50075 Lnet/minecraft/class_9331;
      // 18d: invokevirtual net/minecraft/class_1799.method_58694 (Lnet/minecraft/class_9331;)Ljava/lang/Object;
      // 190: goto 194
      // 193: athrow
      // 194: ifnull 19c
      // 197: getstatic qeaa361f143ee4a0894bd168fd9b30c66/qf4ccf8f5435d4a78bdca4d6a018b578e/ababbaa.bbb Lqeaa361f143ee4a0894bd168fd9b30c66/qf4ccf8f5435d4a78bdca4d6a018b578e/ababbaa;
      // 19a: areturn
      // 19b: athrow
      // 19c: aload 1
      // 19d: iload 2
      // 19e: ifne 1b3
      // 1a1: invokevirtual net/minecraft/class_1799.method_7909 ()Lnet/minecraft/class_1792;
      // 1a4: instanceof net/minecraft/class_1747
      // 1a7: ifeq 1c1
      // 1aa: goto 1ae
      // 1ad: athrow
      // 1ae: aload 1
      // 1af: goto 1b3
      // 1b2: athrow
      // 1b3: getstatic net/minecraft/class_1802.field_8466 Lnet/minecraft/class_1792;
      // 1b6: invokevirtual net/minecraft/class_1799.method_31574 (Lnet/minecraft/class_1792;)Z
      // 1b9: ifne 1c1
      // 1bc: getstatic qeaa361f143ee4a0894bd168fd9b30c66/qf4ccf8f5435d4a78bdca4d6a018b578e/ababbaa.abbb Lqeaa361f143ee4a0894bd168fd9b30c66/qf4ccf8f5435d4a78bdca4d6a018b578e/ababbaa;
      // 1bf: areturn
      // 1c0: athrow
      // 1c1: aconst_null
      // 1c2: areturn
   }

   private static int a(int var0, int var1) {
      int var2 = baaba[var0 ^ 308654568] ^ var1 ^ var0;
      var2 -= 30977;
      var2 -= 46209;
      var2 += 58163;
      var2 ^= 30467;
      var2 += 40298;
      return var2 ^ 26115;
   }

   private boolean bbb(class_310 param1) {
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
      // 06: invokevirtual qeaa361f143ee4a0894bd168fd9b30c66/qf4ccf8f5435d4a78bdca4d6a018b578e/aaabbbbba.abbaa (Lnet/minecraft/class_310;)Z
      // 09: iload 2
      // 0a: ifne 1f
      // 0d: ifeq 2e
      // 10: goto 14
      // 13: athrow
      // 14: aload 1
      // 15: getfield net/minecraft/class_310.field_1724 Lnet/minecraft/class_746;
      // 18: invokevirtual net/minecraft/class_746.method_5805 ()Z
      // 1b: goto 1f
      // 1e: athrow
      // 1f: iload 2
      // 20: ifne 2b
      // 23: ifeq 2e
      // 26: goto 2a
      // 29: athrow
      // 2a: bipush 1
      // 2b: goto 2f
      // 2e: bipush 0
      // 2f: ireturn
   }

   private static String aaaa(int var0, int var1) {
      int var9 = -1226909201;
      int var2 = (var0 ^ a(308654585, var9 ^ -601367836)) & a(308654586, var9 ^ 1186705287);
      if (aabb[var2] == null) {
         char[] var3 = abaab[var2].toCharArray();

         int var4 = switch (var3[0] & a(308654587, var9 ^ 1009737343)) {
            case 0 -> a(308654588, var9 ^ -1720197516);
            case 1 -> a(308654589, var9 ^ 1627436195);
            case 2 -> a(308654590, var9 ^ 822944587);
            case 3 -> a(308654591, var9 ^ 844020653);
            case 4 -> a(308654576, var9 ^ -1161481260);
            case 5 -> a(308654577, var9 ^ 1876141044);
            case 6 -> a(308654578, var9 ^ 504453308);
            case 7 -> a(308654579, var9 ^ -819630055);
            case 8 -> a(308654580, var9 ^ -1427397036);
            case 9 -> 3;
            case 10 -> a(308654581, var9 ^ 1694345247);
            case 11 -> a(308654582, var9 ^ 1616171535);
            case 12 -> a(308654583, var9 ^ 1524692663);
            case 13 -> a(308654536, var9 ^ 1383352064);
            case 14 -> a(308654537, var9 ^ -1502676058);
            case 15 -> a(308654538, var9 ^ 1992177313);
            case 16 -> a(308654539, var9 ^ 1873357544);
            case 17 -> a(308654540, var9 ^ -2107317390);
            case 18 -> a(308654541, var9 ^ -1942512753);
            case 19 -> a(308654542, var9 ^ -1132993558);
            case 20 -> a(308654543, var9 ^ -853042718);
            case 21 -> a(308654528, var9 ^ 1248821844);
            case 22 -> a(308654529, var9 ^ -833955837);
            case 23 -> a(308654530, var9 ^ 2010989124);
            case 24 -> a(308654531, var9 ^ 154244102);
            case 25 -> a(308654532, var9 ^ -327525968);
            case 26 -> a(308654533, var9 ^ -2112045393);
            case 27 -> a(308654534, var9 ^ 199490066);
            case 28 -> a(308654535, var9 ^ -2066685538);
            case 29 -> a(308654552, var9 ^ 1558594289);
            case 30 -> a(308654553, var9 ^ 1807341619);
            case 31 -> a(308654554, var9 ^ 521787873);
            case 32 -> a(308654555, var9 ^ 569609724);
            case 33 -> a(308654556, var9 ^ 812171244);
            case 34 -> a(308654557, var9 ^ -415017048);
            case 35 -> a(308654558, var9 ^ 445076849);
            case 36 -> a(308654559, var9 ^ 2128343057);
            case 37 -> a(308654544, var9 ^ -2047640150);
            case 38 -> a(308654545, var9 ^ 241789316);
            case 39 -> 1;
            case 40 -> a(308654546, var9 ^ -674171331);
            case 41 -> a(308654547, var9 ^ -2058543140);
            case 42 -> a(308654548, var9 ^ 938524687);
            case 43 -> a(308654549, var9 ^ 1000463630);
            case 44 -> a(308654550, var9 ^ 2017229696);
            case 45 -> a(308654551, var9 ^ 795821766);
            case 46 -> a(308654504, var9 ^ -1672328750);
            case 47 -> 2;
            case 48 -> a(308654505, var9 ^ 2079694439);
            case 49 -> a(308654506, var9 ^ -1126606877);
            case 50 -> a(308654507, var9 ^ 514566257);
            case 51 -> a(308654508, var9 ^ -1002301418);
            case 52 -> a(308654509, var9 ^ -1296761284);
            case 53 -> a(308654510, var9 ^ -361261086);
            case 54 -> a(308654511, var9 ^ 321474390);
            case 55 -> a(308654496, var9 ^ 1624292842);
            case 56 -> a(308654497, var9 ^ -129260814);
            case 57 -> a(308654498, var9 ^ 1913421513);
            case 58 -> a(308654499, var9 ^ -197356764);
            case 59 -> a(308654500, var9 ^ -532931278);
            case 60 -> a(308654501, var9 ^ -1921085137);
            case 61 -> a(308654502, var9 ^ 598026112);
            case 62 -> a(308654503, var9 ^ 812650066);
            case 63 -> a(308654520, var9 ^ -1360383143);
            case 64 -> a(308654521, var9 ^ -1724100386);
            case 65 -> a(308654522, var9 ^ -1926063627);
            case 66 -> a(308654523, var9 ^ -543856831);
            case 67 -> a(308654524, var9 ^ -988989111);
            case 68 -> a(308654525, var9 ^ 443283118);
            case 69 -> a(308654526, var9 ^ 772527492);
            case 70 -> a(308654527, var9 ^ 1500226012);
            case 71 -> a(308654512, var9 ^ 1266783623);
            case 72 -> a(308654513, var9 ^ -341405425);
            case 73 -> a(308654514, var9 ^ -1197146410);
            case 74 -> a(308654515, var9 ^ 1173038866);
            case 75 -> a(308654516, var9 ^ -1408996745);
            case 76 -> a(308654517, var9 ^ -1470755038);
            case 77 -> a(308654518, var9 ^ -1089502495);
            case 78 -> a(308654519, var9 ^ -899738838);
            case 79 -> a(308654472, var9 ^ 246678424);
            case 80 -> a(308654473, var9 ^ -1713266652);
            case 81 -> a(308654474, var9 ^ 319294856);
            case 82 -> a(308654475, var9 ^ 103013679);
            case 83 -> a(308654476, var9 ^ 795132880);
            case 84 -> a(308654477, var9 ^ 348469481);
            case 85 -> a(308654478, var9 ^ 395797603);
            case 86 -> a(308654479, var9 ^ -1675214302);
            case 87 -> a(308654464, var9 ^ 1589745781);
            case 88 -> a(308654465, var9 ^ -1712307134);
            case 89 -> a(308654466, var9 ^ 95579601);
            case 90 -> a(308654467, var9 ^ -852548788);
            case 91 -> a(308654468, var9 ^ -713101750);
            case 92 -> a(308654469, var9 ^ -786273290);
            case 93 -> a(308654470, var9 ^ -452496023);
            case 94 -> a(308654471, var9 ^ 1891094537);
            case 95 -> a(308654488, var9 ^ 1894474215);
            case 96 -> a(308654489, var9 ^ -2047511126);
            case 97 -> a(308654490, var9 ^ -824705781);
            case 98 -> a(308654491, var9 ^ -1718420148);
            case 99 -> a(308654492, var9 ^ -414178503);
            case 100 -> a(308654493, var9 ^ 1734022804);
            case 101 -> a(308654494, var9 ^ 230336840);
            case 102 -> a(308654495, var9 ^ 1159075427);
            case 103 -> a(308654480, var9 ^ -1376299197);
            case 104 -> a(308654481, var9 ^ -2089800951);
            case 105 -> a(308654482, var9 ^ -351530619);
            case 106 -> a(308654483, var9 ^ -1517341743);
            case 107 -> a(308654484, var9 ^ 1879893121);
            case 108 -> a(308654485, var9 ^ 1873928578);
            case 109 -> a(308654486, var9 ^ 1347442181);
            case 110 -> a(308654487, var9 ^ -1074980811);
            case 111 -> a(308654440, var9 ^ 68432897);
            case 112 -> a(308654441, var9 ^ -1734472274);
            case 113 -> a(308654442, var9 ^ 1870524441);
            case 114 -> a(308654443, var9 ^ -381516710);
            case 115 -> a(308654444, var9 ^ 273354305);
            case 116 -> a(308654445, var9 ^ -1774844599);
            case 117 -> a(308654446, var9 ^ -889292510);
            case 118 -> a(308654447, var9 ^ 1721177660);
            case 119 -> a(308654432, var9 ^ 1236785360);
            case 120 -> a(308654433, var9 ^ 1771863715);
            case 121 -> a(308654434, var9 ^ 2121177735);
            case 122 -> a(308654435, var9 ^ -839044343);
            case 123 -> a(308654436, var9 ^ 1876548935);
            case 124 -> a(308654437, var9 ^ -179127801);
            case 125 -> a(308654438, var9 ^ -1561785365);
            case 126 -> a(308654439, var9 ^ 122903670);
            case 127 -> a(308654456, var9 ^ -1172947780);
            case 128 -> a(308654457, var9 ^ 443426539);
            case 129 -> a(308654458, var9 ^ -480649360);
            case 130 -> a(308654459, var9 ^ -1690708112);
            case 131 -> a(308654460, var9 ^ -748340647);
            case 132 -> a(308654461, var9 ^ -88583552);
            case 133 -> a(308654462, var9 ^ -1907090048);
            case 134 -> a(308654463, var9 ^ -2028748405);
            case 135 -> a(308654448, var9 ^ -754434248);
            case 136 -> a(308654449, var9 ^ 1819340072);
            case 137 -> a(308654450, var9 ^ 920362376);
            case 138 -> a(308654451, var9 ^ -236282371);
            case 139 -> a(308654452, var9 ^ 225227765);
            case 140 -> a(308654453, var9 ^ 1938040470);
            case 141 -> a(308654454, var9 ^ -1224117776);
            case 142 -> a(308654455, var9 ^ -1033059812);
            case 143 -> a(308654408, var9 ^ 675295017);
            case 144 -> a(308654409, var9 ^ 722276500);
            case 145 -> a(308654410, var9 ^ 1975471890);
            case 146 -> a(308654411, var9 ^ -1958422269);
            case 147 -> a(308654412, var9 ^ 1202358327);
            case 148 -> a(308654413, var9 ^ -456518755);
            case 149 -> a(308654414, var9 ^ -83210127);
            case 150 -> a(308654415, var9 ^ -816893192);
            case 151 -> a(308654400, var9 ^ -163511506);
            case 152 -> a(308654401, var9 ^ -388179914);
            case 153 -> a(308654402, var9 ^ -767922340);
            case 154 -> a(308654403, var9 ^ -1700614183);
            case 155 -> a(308654404, var9 ^ -339370968);
            case 156 -> a(308654405, var9 ^ 279413918);
            case 157 -> a(308654406, var9 ^ -195399335);
            case 158 -> a(308654407, var9 ^ -1843998122);
            case 159 -> a(308654424, var9 ^ -1887883777);
            case 160 -> a(308654425, var9 ^ 1834673452);
            case 161 -> a(308654426, var9 ^ -1199229969);
            case 162 -> a(308654427, var9 ^ -1111562888);
            case 163 -> a(308654428, var9 ^ -358988512);
            case 164 -> a(308654429, var9 ^ 1403658528);
            case 165 -> a(308654430, var9 ^ 1762774341);
            case 166 -> a(308654431, var9 ^ -1255904406);
            case 167 -> a(308654416, var9 ^ -295488733);
            case 168 -> a(308654417, var9 ^ -1759213851);
            case 169 -> a(308654418, var9 ^ -1822978270);
            case 170 -> a(308654419, var9 ^ 1095403800);
            case 171 -> a(308654420, var9 ^ 396442246);
            case 172 -> a(308654421, var9 ^ -1043014790);
            case 173 -> a(308654422, var9 ^ -1383695863);
            case 174 -> a(308654423, var9 ^ -904564107);
            case 175 -> a(308654376, var9 ^ 1460640238);
            case 176 -> a(308654377, var9 ^ -525882316);
            case 177 -> a(308654378, var9 ^ 2059070369);
            case 178 -> a(308654379, var9 ^ 974927721);
            case 179 -> a(308654380, var9 ^ -1763047274);
            case 180 -> a(308654381, var9 ^ 1276476622);
            case 181 -> a(308654382, var9 ^ -1770333363);
            case 182 -> a(308654383, var9 ^ -524686290);
            case 183 -> a(308654368, var9 ^ -1902586141);
            case 184 -> a(308654369, var9 ^ -44358020);
            case 185 -> a(308654370, var9 ^ 2080966607);
            case 186 -> a(308654371, var9 ^ 2120938575);
            case 187 -> a(308654372, var9 ^ 715283159);
            case 188 -> a(308654373, var9 ^ 427801448);
            case 189 -> a(308654374, var9 ^ 310317820);
            case 190 -> a(308654375, var9 ^ -781084913);
            case 191 -> a(308654392, var9 ^ -1619915989);
            case 192 -> a(308654393, var9 ^ -1062012330);
            case 193 -> a(308654394, var9 ^ 236666307);
            case 194 -> 0;
            case 195 -> a(308654395, var9 ^ 1739583999);
            case 196 -> a(308654396, var9 ^ -1396636728);
            case 197 -> a(308654397, var9 ^ 1045946949);
            case 198 -> a(308654398, var9 ^ -287255494);
            case 199 -> a(308654399, var9 ^ 926602309);
            case 200 -> a(308654384, var9 ^ 279352688);
            case 201 -> a(308654385, var9 ^ 698739352);
            case 202 -> a(308654386, var9 ^ 648399438);
            case 203 -> a(308654387, var9 ^ -1840374848);
            case 204 -> a(308654388, var9 ^ -1272587196);
            case 205 -> a(308654389, var9 ^ 973643664);
            case 206 -> a(308654390, var9 ^ 1834900674);
            case 207 -> a(308654391, var9 ^ 504452001);
            case 208 -> a(308654344, var9 ^ 2096949151);
            case 209 -> a(308654345, var9 ^ -1050312633);
            case 210 -> a(308654346, var9 ^ 1653481274);
            case 211 -> a(308654347, var9 ^ 1501590579);
            case 212 -> a(308654348, var9 ^ -661278575);
            case 213 -> a(308654349, var9 ^ 325399114);
            case 214 -> a(308654350, var9 ^ -393672124);
            case 215 -> a(308654351, var9 ^ -979905075);
            case 216 -> a(308654336, var9 ^ 1037364847);
            case 217 -> a(308654337, var9 ^ -1957380256);
            case 218 -> a(308654338, var9 ^ -25099985);
            case 219 -> a(308654339, var9 ^ -1506098310);
            case 220 -> a(308654340, var9 ^ -1753512715);
            case 221 -> a(308654341, var9 ^ 173172279);
            case 222 -> a(308654342, var9 ^ -724402440);
            case 223 -> a(308654343, var9 ^ 1532520835);
            case 224 -> a(308654360, var9 ^ 431857102);
            case 225 -> a(308654361, var9 ^ 359286180);
            case 226 -> a(308654362, var9 ^ 202330700);
            case 227 -> a(308654363, var9 ^ -481777622);
            case 228 -> a(308654364, var9 ^ 1266561088);
            case 229 -> a(308654365, var9 ^ 1911385489);
            case 230 -> a(308654366, var9 ^ -1284084306);
            case 231 -> a(308654367, var9 ^ -719160173);
            case 232 -> a(308654352, var9 ^ -852251378);
            case 233 -> a(308654353, var9 ^ -1904001726);
            case 234 -> 4;
            case 235 -> a(308654354, var9 ^ -271706045);
            case 236 -> a(308654355, var9 ^ 2032131864);
            case 237 -> 5;
            case 238 -> a(308654356, var9 ^ 1051036155);
            case 239 -> a(308654357, var9 ^ -828114890);
            case 240 -> a(308654358, var9 ^ 716589684);
            case 241 -> a(308654359, var9 ^ -173458019);
            case 242 -> a(308654312, var9 ^ 788037463);
            case 243 -> a(308654313, var9 ^ -402723602);
            case 244 -> a(308654314, var9 ^ 957361675);
            case 245 -> a(308654315, var9 ^ 922478210);
            case 246 -> a(308654316, var9 ^ -1335182730);
            case 247 -> a(308654317, var9 ^ -719780270);
            case 248 -> a(308654318, var9 ^ 1944841361);
            case 249 -> a(308654319, var9 ^ 2075801515);
            case 250 -> a(308654304, var9 ^ -2003417581);
            case 251 -> a(308654305, var9 ^ 700189640);
            case 252 -> a(308654306, var9 ^ 1422286336);
            case 253 -> a(308654307, var9 ^ -661595591);
            case 254 -> a(308654308, var9 ^ -1019877266);
            default -> a(308654309, var9 ^ 757414049);
         };
         int var5 = (var1 & a(308654310, var9 ^ -542407210)) - var4;
         if (var5 < 0) {
            var5 += 256;
         }

         int var6 = ((var1 & a(308654311, var9 ^ 466105674)) >>> a(308654328, var9 ^ 1061211386)) - var4;
         if (var6 < 0) {
            var6 += 256;
         }

         for (int var7 = 0; var7 < var3.length; var7++) {
            int var8 = var7 % 2;
            char var10002 = var3[var7];
            if (var8 == 0) {
               var3[var7] = (char)(var10002 ^ var5);
               var5 = ((var5 >>> 3 | var5 << 5) ^ var3[var7]) & a(308654329, var9 ^ -1591307234);
            } else {
               var3[var7] = (char)(var10002 ^ var6);
               var6 = ((var6 >>> 3 | var6 << 5) ^ var3[var7]) & a(308654330, var9 ^ 1826923652);
            }
         }

         aabb[var2] = new String(var3).intern();
      }

      return aabb[var2];
   }

   private void aaab(class_310 param1) {
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
      // 06: ifne 32
      // 09: getfield qeaa361f143ee4a0894bd168fd9b30c66/qf4ccf8f5435d4a78bdca4d6a018b578e/aaabbbbba.bb Ljava/util/Map;
      // 0c: invokeinterface java/util/Map.isEmpty ()Z 1
      // 11: ifne 31
      // 14: goto 18
      // 17: athrow
      // 18: aload 0
      // 19: ldc_w 308654331
      // 1c: ldc_w 1684492472
      // 1f: ldc_w -1495664924
      // 22: ixor
      // 23: invokestatic qeaa361f143ee4a0894bd168fd9b30c66/qf4ccf8f5435d4a78bdca4d6a018b578e/aaabbbbba.a (II)I
      // 26: ldc2_w 1848905881191263389
      // 29: invokestatic qeaa361f143ee4a0894bd168fd9b30c66/qf4ccf8f5435d4a78bdca4d6a018b578e/aaabbbbba.baaa (IJ)I
      // 2c: putfield qeaa361f143ee4a0894bd168fd9b30c66/qf4ccf8f5435d4a78bdca4d6a018b578e/aaabbbbba.aabaa I
      // 2f: return
      // 30: athrow
      // 31: aload 0
      // 32: getfield qeaa361f143ee4a0894bd168fd9b30c66/qf4ccf8f5435d4a78bdca4d6a018b578e/aaabbbbba.aabaa I
      // 35: iload 2
      // 36: ifne 74
      // 39: ldc_w 308654332
      // 3c: ldc_w 1684492472
      // 3f: ldc_w 1976761663
      // 42: ixor
      // 43: invokestatic qeaa361f143ee4a0894bd168fd9b30c66/qf4ccf8f5435d4a78bdca4d6a018b578e/aaabbbbba.a (II)I
      // 46: ldc2_w 1848905881191263389
      // 49: invokestatic qeaa361f143ee4a0894bd168fd9b30c66/qf4ccf8f5435d4a78bdca4d6a018b578e/aaabbbbba.baaa (IJ)I
      // 4c: if_icmpne 60
      // 4f: goto 53
      // 52: athrow
      // 53: aload 0
      // 54: aload 1
      // 55: getfield net/minecraft/class_310.field_1724 Lnet/minecraft/class_746;
      // 58: getfield net/minecraft/class_746.field_6012 I
      // 5b: putfield qeaa361f143ee4a0894bd168fd9b30c66/qf4ccf8f5435d4a78bdca4d6a018b578e/aaabbbbba.aabaa I
      // 5e: return
      // 5f: athrow
      // 60: aload 1
      // 61: iload 2
      // 62: ifne 84
      // 65: getfield net/minecraft/class_310.field_1724 Lnet/minecraft/class_746;
      // 68: getfield net/minecraft/class_746.field_6012 I
      // 6b: aload 0
      // 6c: getfield qeaa361f143ee4a0894bd168fd9b30c66/qf4ccf8f5435d4a78bdca4d6a018b578e/aaabbbbba.aabaa I
      // 6f: isub
      // 70: goto 74
      // 73: athrow
      // 74: bipush 2
      // 75: if_icmplt 8c
      // 78: aload 1
      // 79: getfield net/minecraft/class_310.field_1724 Lnet/minecraft/class_746;
      // 7c: invokevirtual net/minecraft/class_746.method_7346 ()V
      // 7f: aload 1
      // 80: goto 84
      // 83: athrow
      // 84: aconst_null
      // 85: invokevirtual net/minecraft/class_310.method_1507 (Lnet/minecraft/class_437;)V
      // 88: aload 0
      // 89: invokevirtual qeaa361f143ee4a0894bd168fd9b30c66/qf4ccf8f5435d4a78bdca4d6a018b578e/aaabbbbba.aabaaa ()V
      // 8c: return
   }

   private double aaba(String param1) {
      // $VF: Couldn't be decompiled
      // Please report this to the Vineflower issue tracker, at https://github.com/Vineflower/vineflower/issues with a copy of the class file (if you have the rights to distribute it!)
      // java.lang.RuntimeException: parsing failure!
      //   at org.jetbrains.java.decompiler.modules.decompiler.decompose.DomHelper.parseGraph(DomHelper.java:211)
      //   at org.jetbrains.java.decompiler.main.rels.MethodProcessor.codeToJava(MethodProcessor.java:166)
      //
      // Bytecode:
      // 000: ldc_w 1324181767
      // 003: istore 3
      // 004: getstatic qeaa361f143ee4a0894bd168fd9b30c66/qf4ccf8f5435d4a78bdca4d6a018b578e/baaabbaa.bba I
      // 007: istore 2
      // 008: aload 1
      // 009: ldc_w 308654333
      // 00c: iload 3
      // 00d: ldc_w -2022475654
      // 010: ixor
      // 011: invokestatic qeaa361f143ee4a0894bd168fd9b30c66/qf4ccf8f5435d4a78bdca4d6a018b578e/aaabbbbba.a (II)I
      // 014: ldc_w 308654334
      // 017: iload 3
      // 018: ldc_w -674050778
      // 01b: ixor
      // 01c: invokestatic qeaa361f143ee4a0894bd168fd9b30c66/qf4ccf8f5435d4a78bdca4d6a018b578e/aaabbbbba.a (II)I
      // 01f: invokestatic qeaa361f143ee4a0894bd168fd9b30c66/qf4ccf8f5435d4a78bdca4d6a018b578e/aaabbbbba.aaaa (II)Ljava/lang/String;
      // 022: invokestatic qeaa361f143ee4a0894bd168fd9b30c66/qf4ccf8f5435d4a78bdca4d6a018b578e/aabbaaaba.abba (Ljava/lang/String;)Ljava/lang/String;
      // 025: iload 2
      // 026: ifne 055
      // 029: invokevirtual java/lang/String.equals (Ljava/lang/Object;)Z
      // 02c: ifeq 038
      // 02f: goto 033
      // 032: athrow
      // 033: ldc2_w 36.0
      // 036: dreturn
      // 037: athrow
      // 038: aload 1
      // 039: ldc_w 308654335
      // 03c: iload 3
      // 03d: ldc_w -1360677450
      // 040: ixor
      // 041: invokestatic qeaa361f143ee4a0894bd168fd9b30c66/qf4ccf8f5435d4a78bdca4d6a018b578e/aaabbbbba.a (II)I
      // 044: ldc_w 308654320
      // 047: iload 3
      // 048: ldc_w 859185761
      // 04b: ixor
      // 04c: invokestatic qeaa361f143ee4a0894bd168fd9b30c66/qf4ccf8f5435d4a78bdca4d6a018b578e/aaabbbbba.a (II)I
      // 04f: invokestatic qeaa361f143ee4a0894bd168fd9b30c66/qf4ccf8f5435d4a78bdca4d6a018b578e/aaabbbbba.aaaa (II)Ljava/lang/String;
      // 052: invokestatic qeaa361f143ee4a0894bd168fd9b30c66/qf4ccf8f5435d4a78bdca4d6a018b578e/aabbaaaba.abba (Ljava/lang/String;)Ljava/lang/String;
      // 055: iload 2
      // 056: ifne 08d
      // 059: invokevirtual java/lang/String.equals (Ljava/lang/Object;)Z
      // 05c: ifeq 068
      // 05f: goto 063
      // 062: athrow
      // 063: ldc2_w 22.0
      // 066: dreturn
      // 067: athrow
      // 068: aload 1
      // 069: iload 2
      // 06a: ifne 099
      // 06d: ldc_w 308654321
      // 070: iload 3
      // 071: ldc_w 1543020503
      // 074: ixor
      // 075: invokestatic qeaa361f143ee4a0894bd168fd9b30c66/qf4ccf8f5435d4a78bdca4d6a018b578e/aaabbbbba.a (II)I
      // 078: ldc_w 308654322
      // 07b: iload 3
      // 07c: ldc_w -923341895
      // 07f: ixor
      // 080: invokestatic qeaa361f143ee4a0894bd168fd9b30c66/qf4ccf8f5435d4a78bdca4d6a018b578e/aaabbbbba.a (II)I
      // 083: invokestatic qeaa361f143ee4a0894bd168fd9b30c66/qf4ccf8f5435d4a78bdca4d6a018b578e/aaabbbbba.aaaa (II)Ljava/lang/String;
      // 086: invokestatic qeaa361f143ee4a0894bd168fd9b30c66/qf4ccf8f5435d4a78bdca4d6a018b578e/aabbaaaba.abba (Ljava/lang/String;)Ljava/lang/String;
      // 089: goto 08d
      // 08c: athrow
      // 08d: invokevirtual java/lang/String.equals (Ljava/lang/Object;)Z
      // 090: ifeq 098
      // 093: ldc2_w 26.0
      // 096: dreturn
      // 097: athrow
      // 098: aload 1
      // 099: iload 2
      // 09a: ifne 0c8
      // 09d: ldc_w 308654323
      // 0a0: iload 3
      // 0a1: ldc_w -162647832
      // 0a4: ixor
      // 0a5: invokestatic qeaa361f143ee4a0894bd168fd9b30c66/qf4ccf8f5435d4a78bdca4d6a018b578e/aaabbbbba.a (II)I
      // 0a8: ldc_w 308654324
      // 0ab: iload 3
      // 0ac: ldc_w -368403651
      // 0af: ixor
      // 0b0: invokestatic qeaa361f143ee4a0894bd168fd9b30c66/qf4ccf8f5435d4a78bdca4d6a018b578e/aaabbbbba.a (II)I
      // 0b3: invokestatic qeaa361f143ee4a0894bd168fd9b30c66/qf4ccf8f5435d4a78bdca4d6a018b578e/aaabbbbba.aaaa (II)Ljava/lang/String;
      // 0b6: invokestatic qeaa361f143ee4a0894bd168fd9b30c66/qf4ccf8f5435d4a78bdca4d6a018b578e/aabbaaaba.abba (Ljava/lang/String;)Ljava/lang/String;
      // 0b9: invokevirtual java/lang/String.equals (Ljava/lang/Object;)Z
      // 0bc: ifne 121
      // 0bf: goto 0c3
      // 0c2: athrow
      // 0c3: aload 1
      // 0c4: goto 0c8
      // 0c7: athrow
      // 0c8: ldc_w 308654325
      // 0cb: iload 3
      // 0cc: ldc_w -1627274283
      // 0cf: ixor
      // 0d0: invokestatic qeaa361f143ee4a0894bd168fd9b30c66/qf4ccf8f5435d4a78bdca4d6a018b578e/aaabbbbba.a (II)I
      // 0d3: ldc_w 308654326
      // 0d6: iload 3
      // 0d7: ldc_w -808993385
      // 0da: ixor
      // 0db: invokestatic qeaa361f143ee4a0894bd168fd9b30c66/qf4ccf8f5435d4a78bdca4d6a018b578e/aaabbbbba.a (II)I
      // 0de: invokestatic qeaa361f143ee4a0894bd168fd9b30c66/qf4ccf8f5435d4a78bdca4d6a018b578e/aaabbbbba.aaaa (II)Ljava/lang/String;
      // 0e1: iload 2
      // 0e2: ifne 11b
      // 0e5: invokestatic qeaa361f143ee4a0894bd168fd9b30c66/qf4ccf8f5435d4a78bdca4d6a018b578e/aabbaaaba.abba (Ljava/lang/String;)Ljava/lang/String;
      // 0e8: invokevirtual java/lang/String.equals (Ljava/lang/Object;)Z
      // 0eb: ifne 121
      // 0ee: goto 0f2
      // 0f1: athrow
      // 0f2: aload 1
      // 0f3: ldc_w 308654327
      // 0f6: iload 3
      // 0f7: ldc_w 406552928
      // 0fa: ixor
      // 0fb: invokestatic qeaa361f143ee4a0894bd168fd9b30c66/qf4ccf8f5435d4a78bdca4d6a018b578e/aaabbbbba.a (II)I
      // 0fe: ldc_w 308654280
      // 101: iload 3
      // 102: ldc_w -95624952
      // 105: ixor
      // 106: invokestatic qeaa361f143ee4a0894bd168fd9b30c66/qf4ccf8f5435d4a78bdca4d6a018b578e/aaabbbbba.a (II)I
      // 109: invokestatic qeaa361f143ee4a0894bd168fd9b30c66/qf4ccf8f5435d4a78bdca4d6a018b578e/aaabbbbba.aaaa (II)Ljava/lang/String;
      // 10c: iload 2
      // 10d: ifne 143
      // 110: goto 114
      // 113: athrow
      // 114: invokestatic qeaa361f143ee4a0894bd168fd9b30c66/qf4ccf8f5435d4a78bdca4d6a018b578e/aabbaaaba.abba (Ljava/lang/String;)Ljava/lang/String;
      // 117: goto 11b
      // 11a: athrow
      // 11b: invokevirtual java/lang/String.equals (Ljava/lang/Object;)Z
      // 11e: ifeq 126
      // 121: ldc2_w 24.0
      // 124: dreturn
      // 125: athrow
      // 126: aload 1
      // 127: ldc_w 308654281
      // 12a: iload 3
      // 12b: ldc_w -985931325
      // 12e: ixor
      // 12f: invokestatic qeaa361f143ee4a0894bd168fd9b30c66/qf4ccf8f5435d4a78bdca4d6a018b578e/aaabbbbba.a (II)I
      // 132: ldc_w 308654282
      // 135: iload 3
      // 136: ldc_w 2127085427
      // 139: ixor
      // 13a: invokestatic qeaa361f143ee4a0894bd168fd9b30c66/qf4ccf8f5435d4a78bdca4d6a018b578e/aaabbbbba.a (II)I
      // 13d: invokestatic qeaa361f143ee4a0894bd168fd9b30c66/qf4ccf8f5435d4a78bdca4d6a018b578e/aaabbbbba.aaaa (II)Ljava/lang/String;
      // 140: invokestatic qeaa361f143ee4a0894bd168fd9b30c66/qf4ccf8f5435d4a78bdca4d6a018b578e/aabbaaaba.abba (Ljava/lang/String;)Ljava/lang/String;
      // 143: iload 2
      // 144: ifne 17a
      // 147: invokevirtual java/lang/String.equals (Ljava/lang/Object;)Z
      // 14a: ifne 1de
      // 14d: goto 151
      // 150: athrow
      // 151: aload 1
      // 152: iload 2
      // 153: ifne 185
      // 156: goto 15a
      // 159: athrow
      // 15a: ldc_w 308654283
      // 15d: iload 3
      // 15e: ldc_w -1550348757
      // 161: ixor
      // 162: invokestatic qeaa361f143ee4a0894bd168fd9b30c66/qf4ccf8f5435d4a78bdca4d6a018b578e/aaabbbbba.a (II)I
      // 165: ldc_w 308654284
      // 168: iload 3
      // 169: ldc_w -657109590
      // 16c: ixor
      // 16d: invokestatic qeaa361f143ee4a0894bd168fd9b30c66/qf4ccf8f5435d4a78bdca4d6a018b578e/aaabbbbba.a (II)I
      // 170: invokestatic qeaa361f143ee4a0894bd168fd9b30c66/qf4ccf8f5435d4a78bdca4d6a018b578e/aaabbbbba.aaaa (II)Ljava/lang/String;
      // 173: invokestatic qeaa361f143ee4a0894bd168fd9b30c66/qf4ccf8f5435d4a78bdca4d6a018b578e/aabbaaaba.abba (Ljava/lang/String;)Ljava/lang/String;
      // 176: goto 17a
      // 179: athrow
      // 17a: invokevirtual java/lang/String.equals (Ljava/lang/Object;)Z
      // 17d: ifne 1de
      // 180: aload 1
      // 181: goto 185
      // 184: athrow
      // 185: iload 2
      // 186: ifne 1b4
      // 189: ldc_w 308654285
      // 18c: iload 3
      // 18d: ldc_w 1411037698
      // 190: ixor
      // 191: invokestatic qeaa361f143ee4a0894bd168fd9b30c66/qf4ccf8f5435d4a78bdca4d6a018b578e/aaabbbbba.a (II)I
      // 194: ldc_w 308654286
      // 197: iload 3
      // 198: ldc_w 1951997948
      // 19b: ixor
      // 19c: invokestatic qeaa361f143ee4a0894bd168fd9b30c66/qf4ccf8f5435d4a78bdca4d6a018b578e/aaabbbbba.a (II)I
      // 19f: invokestatic qeaa361f143ee4a0894bd168fd9b30c66/qf4ccf8f5435d4a78bdca4d6a018b578e/aaabbbbba.aaaa (II)Ljava/lang/String;
      // 1a2: invokestatic qeaa361f143ee4a0894bd168fd9b30c66/qf4ccf8f5435d4a78bdca4d6a018b578e/aabbaaaba.abba (Ljava/lang/String;)Ljava/lang/String;
      // 1a5: invokevirtual java/lang/String.equals (Ljava/lang/Object;)Z
      // 1a8: ifne 1de
      // 1ab: goto 1af
      // 1ae: athrow
      // 1af: aload 1
      // 1b0: goto 1b4
      // 1b3: athrow
      // 1b4: ldc_w 308654287
      // 1b7: iload 3
      // 1b8: ldc_w -112886388
      // 1bb: ixor
      // 1bc: invokestatic qeaa361f143ee4a0894bd168fd9b30c66/qf4ccf8f5435d4a78bdca4d6a018b578e/aaabbbbba.a (II)I
      // 1bf: ldc_w 308654272
      // 1c2: iload 3
      // 1c3: ldc_w -1499524118
      // 1c6: ixor
      // 1c7: invokestatic qeaa361f143ee4a0894bd168fd9b30c66/qf4ccf8f5435d4a78bdca4d6a018b578e/aaabbbbba.a (II)I
      // 1ca: invokestatic qeaa361f143ee4a0894bd168fd9b30c66/qf4ccf8f5435d4a78bdca4d6a018b578e/aaabbbbba.aaaa (II)Ljava/lang/String;
      // 1cd: invokestatic qeaa361f143ee4a0894bd168fd9b30c66/qf4ccf8f5435d4a78bdca4d6a018b578e/aabbaaaba.abba (Ljava/lang/String;)Ljava/lang/String;
      // 1d0: iload 2
      // 1d1: ifne 208
      // 1d4: invokevirtual java/lang/String.equals (Ljava/lang/Object;)Z
      // 1d7: ifeq 1e3
      // 1da: goto 1de
      // 1dd: athrow
      // 1de: ldc2_w 20.0
      // 1e1: dreturn
      // 1e2: athrow
      // 1e3: aload 1
      // 1e4: ldc_w 308654273
      // 1e7: iload 3
      // 1e8: ldc_w -843002044
      // 1eb: ixor
      // 1ec: invokestatic qeaa361f143ee4a0894bd168fd9b30c66/qf4ccf8f5435d4a78bdca4d6a018b578e/aaabbbbba.a (II)I
      // 1ef: ldc_w 308654274
      // 1f2: iload 3
      // 1f3: ldc_w -46358780
      // 1f6: ixor
      // 1f7: invokestatic qeaa361f143ee4a0894bd168fd9b30c66/qf4ccf8f5435d4a78bdca4d6a018b578e/aaabbbbba.a (II)I
      // 1fa: invokestatic qeaa361f143ee4a0894bd168fd9b30c66/qf4ccf8f5435d4a78bdca4d6a018b578e/aaabbbbba.aaaa (II)Ljava/lang/String;
      // 1fd: iload 2
      // 1fe: ifne 237
      // 201: invokestatic qeaa361f143ee4a0894bd168fd9b30c66/qf4ccf8f5435d4a78bdca4d6a018b578e/aabbaaaba.abba (Ljava/lang/String;)Ljava/lang/String;
      // 204: goto 208
      // 207: athrow
      // 208: invokevirtual java/lang/String.equals (Ljava/lang/Object;)Z
      // 20b: ifne 34f
      // 20e: aload 1
      // 20f: iload 2
      // 210: ifne 242
      // 213: goto 217
      // 216: athrow
      // 217: ldc_w 308654275
      // 21a: iload 3
      // 21b: ldc_w 1699482690
      // 21e: ixor
      // 21f: invokestatic qeaa361f143ee4a0894bd168fd9b30c66/qf4ccf8f5435d4a78bdca4d6a018b578e/aaabbbbba.a (II)I
      // 222: ldc_w 308654276
      // 225: iload 3
      // 226: ldc_w -1249135027
      // 229: ixor
      // 22a: invokestatic qeaa361f143ee4a0894bd168fd9b30c66/qf4ccf8f5435d4a78bdca4d6a018b578e/aaabbbbba.a (II)I
      // 22d: invokestatic qeaa361f143ee4a0894bd168fd9b30c66/qf4ccf8f5435d4a78bdca4d6a018b578e/aaabbbbba.aaaa (II)Ljava/lang/String;
      // 230: invokestatic qeaa361f143ee4a0894bd168fd9b30c66/qf4ccf8f5435d4a78bdca4d6a018b578e/aabbaaaba.abba (Ljava/lang/String;)Ljava/lang/String;
      // 233: goto 237
      // 236: athrow
      // 237: invokevirtual java/lang/String.equals (Ljava/lang/Object;)Z
      // 23a: ifne 34f
      // 23d: aload 1
      // 23e: goto 242
      // 241: athrow
      // 242: iload 2
      // 243: ifne 271
      // 246: ldc_w 308654277
      // 249: iload 3
      // 24a: ldc_w 1060704958
      // 24d: ixor
      // 24e: invokestatic qeaa361f143ee4a0894bd168fd9b30c66/qf4ccf8f5435d4a78bdca4d6a018b578e/aaabbbbba.a (II)I
      // 251: ldc_w 308654278
      // 254: iload 3
      // 255: ldc_w 1586168584
      // 258: ixor
      // 259: invokestatic qeaa361f143ee4a0894bd168fd9b30c66/qf4ccf8f5435d4a78bdca4d6a018b578e/aaabbbbba.a (II)I
      // 25c: invokestatic qeaa361f143ee4a0894bd168fd9b30c66/qf4ccf8f5435d4a78bdca4d6a018b578e/aaabbbbba.aaaa (II)Ljava/lang/String;
      // 25f: invokestatic qeaa361f143ee4a0894bd168fd9b30c66/qf4ccf8f5435d4a78bdca4d6a018b578e/aabbaaaba.abba (Ljava/lang/String;)Ljava/lang/String;
      // 262: invokevirtual java/lang/String.equals (Ljava/lang/Object;)Z
      // 265: ifne 34f
      // 268: goto 26c
      // 26b: athrow
      // 26c: aload 1
      // 26d: goto 271
      // 270: athrow
      // 271: iload 2
      // 272: ifne 2a0
      // 275: ldc_w 308654279
      // 278: iload 3
      // 279: ldc_w -1000027575
      // 27c: ixor
      // 27d: invokestatic qeaa361f143ee4a0894bd168fd9b30c66/qf4ccf8f5435d4a78bdca4d6a018b578e/aaabbbbba.a (II)I
      // 280: ldc_w 308654296
      // 283: iload 3
      // 284: ldc_w -1489600954
      // 287: ixor
      // 288: invokestatic qeaa361f143ee4a0894bd168fd9b30c66/qf4ccf8f5435d4a78bdca4d6a018b578e/aaabbbbba.a (II)I
      // 28b: invokestatic qeaa361f143ee4a0894bd168fd9b30c66/qf4ccf8f5435d4a78bdca4d6a018b578e/aaabbbbba.aaaa (II)Ljava/lang/String;
      // 28e: invokestatic qeaa361f143ee4a0894bd168fd9b30c66/qf4ccf8f5435d4a78bdca4d6a018b578e/aabbaaaba.abba (Ljava/lang/String;)Ljava/lang/String;
      // 291: invokevirtual java/lang/String.equals (Ljava/lang/Object;)Z
      // 294: ifne 34f
      // 297: goto 29b
      // 29a: athrow
      // 29b: aload 1
      // 29c: goto 2a0
      // 29f: athrow
      // 2a0: ldc_w 308654297
      // 2a3: iload 3
      // 2a4: ldc_w -1939602114
      // 2a7: ixor
      // 2a8: invokestatic qeaa361f143ee4a0894bd168fd9b30c66/qf4ccf8f5435d4a78bdca4d6a018b578e/aaabbbbba.a (II)I
      // 2ab: ldc_w 308654298
      // 2ae: iload 3
      // 2af: ldc_w -1135225238
      // 2b2: ixor
      // 2b3: invokestatic qeaa361f143ee4a0894bd168fd9b30c66/qf4ccf8f5435d4a78bdca4d6a018b578e/aaabbbbba.a (II)I
      // 2b6: invokestatic qeaa361f143ee4a0894bd168fd9b30c66/qf4ccf8f5435d4a78bdca4d6a018b578e/aaabbbbba.aaaa (II)Ljava/lang/String;
      // 2b9: invokestatic qeaa361f143ee4a0894bd168fd9b30c66/qf4ccf8f5435d4a78bdca4d6a018b578e/aabbaaaba.abba (Ljava/lang/String;)Ljava/lang/String;
      // 2bc: iload 2
      // 2bd: ifne 2f3
      // 2c0: invokevirtual java/lang/String.equals (Ljava/lang/Object;)Z
      // 2c3: ifne 34f
      // 2c6: goto 2ca
      // 2c9: athrow
      // 2ca: aload 1
      // 2cb: iload 2
      // 2cc: ifne 2fe
      // 2cf: goto 2d3
      // 2d2: athrow
      // 2d3: ldc_w 308654299
      // 2d6: iload 3
      // 2d7: ldc_w -233521833
      // 2da: ixor
      // 2db: invokestatic qeaa361f143ee4a0894bd168fd9b30c66/qf4ccf8f5435d4a78bdca4d6a018b578e/aaabbbbba.a (II)I
      // 2de: ldc_w 308654300
      // 2e1: iload 3
      // 2e2: ldc_w -430153947
      // 2e5: ixor
      // 2e6: invokestatic qeaa361f143ee4a0894bd168fd9b30c66/qf4ccf8f5435d4a78bdca4d6a018b578e/aaabbbbba.a (II)I
      // 2e9: invokestatic qeaa361f143ee4a0894bd168fd9b30c66/qf4ccf8f5435d4a78bdca4d6a018b578e/aaabbbbba.aaaa (II)Ljava/lang/String;
      // 2ec: invokestatic qeaa361f143ee4a0894bd168fd9b30c66/qf4ccf8f5435d4a78bdca4d6a018b578e/aabbaaaba.abba (Ljava/lang/String;)Ljava/lang/String;
      // 2ef: goto 2f3
      // 2f2: athrow
      // 2f3: invokevirtual java/lang/String.equals (Ljava/lang/Object;)Z
      // 2f6: ifne 34f
      // 2f9: aload 1
      // 2fa: goto 2fe
      // 2fd: athrow
      // 2fe: ldc_w 308654301
      // 301: iload 3
      // 302: ldc_w -2037828186
      // 305: ixor
      // 306: invokestatic qeaa361f143ee4a0894bd168fd9b30c66/qf4ccf8f5435d4a78bdca4d6a018b578e/aaabbbbba.a (II)I
      // 309: ldc_w 308654302
      // 30c: iload 3
      // 30d: ldc_w -1953169792
      // 310: ixor
      // 311: invokestatic qeaa361f143ee4a0894bd168fd9b30c66/qf4ccf8f5435d4a78bdca4d6a018b578e/aaabbbbba.a (II)I
      // 314: invokestatic qeaa361f143ee4a0894bd168fd9b30c66/qf4ccf8f5435d4a78bdca4d6a018b578e/aaabbbbba.aaaa (II)Ljava/lang/String;
      // 317: invokestatic qeaa361f143ee4a0894bd168fd9b30c66/qf4ccf8f5435d4a78bdca4d6a018b578e/aabbaaaba.abba (Ljava/lang/String;)Ljava/lang/String;
      // 31a: iload 2
      // 31b: ifne 349
      // 31e: invokevirtual java/lang/String.equals (Ljava/lang/Object;)Z
      // 321: ifne 34f
      // 324: goto 328
      // 327: athrow
      // 328: aload 1
      // 329: ldc_w 308654303
      // 32c: iload 3
      // 32d: ldc_w -960746174
      // 330: ixor
      // 331: invokestatic qeaa361f143ee4a0894bd168fd9b30c66/qf4ccf8f5435d4a78bdca4d6a018b578e/aaabbbbba.a (II)I
      // 334: ldc_w 308654288
      // 337: iload 3
      // 338: ldc_w -1528409943
      // 33b: ixor
      // 33c: invokestatic qeaa361f143ee4a0894bd168fd9b30c66/qf4ccf8f5435d4a78bdca4d6a018b578e/aaabbbbba.a (II)I
      // 33f: invokestatic qeaa361f143ee4a0894bd168fd9b30c66/qf4ccf8f5435d4a78bdca4d6a018b578e/aaabbbbba.aaaa (II)Ljava/lang/String;
      // 342: invokestatic qeaa361f143ee4a0894bd168fd9b30c66/qf4ccf8f5435d4a78bdca4d6a018b578e/aabbaaaba.abba (Ljava/lang/String;)Ljava/lang/String;
      // 345: goto 349
      // 348: athrow
      // 349: invokevirtual java/lang/String.equals (Ljava/lang/Object;)Z
      // 34c: ifeq 354
      // 34f: ldc2_w 14.0
      // 352: dreturn
      // 353: athrow
      // 354: ldc2_w 8.0
      // 357: dreturn
   }

   private static List aabb() {
      int var10000 = baaabbaa.bba;
      ArrayList var1 = new ArrayList();
      int var0 = var10000;
      ababbaa[] var2 = ababbaa.values();
      int var3 = var2.length;
      int var4 = 0;

      while (true) {
         if (var4 < var3) {
            ababbaa var5 = var2[var4];

            try {
               var7 = var1;
               if (var0 != 0) {
                  break;
               }

               var1.add(var5.aa);
               var4++;
               if (var0 == 0) {
                  continue;
               }
            } catch (MatchException var6) {
               throw var6;
            }
         }

         var7 = var1;
         break;
      }

      return var7;
   }

   private boolean abaa(ababbaa var1) {
      return this.aba.aaba(var1.aa);
   }

   private static boolean abab() {
      return false;
   }

   private void abba(class_310 param1, class_465 param2) {
      // $VF: Couldn't be decompiled
      // Please report this to the Vineflower issue tracker, at https://github.com/Vineflower/vineflower/issues with a copy of the class file (if you have the rights to distribute it!)
      // java.lang.RuntimeException: parsing failure!
      //   at org.jetbrains.java.decompiler.modules.decompiler.decompose.DomHelper.parseGraph(DomHelper.java:211)
      //   at org.jetbrains.java.decompiler.main.rels.MethodProcessor.codeToJava(MethodProcessor.java:166)
      //
      // Bytecode:
      // 000: getstatic qeaa361f143ee4a0894bd168fd9b30c66/qf4ccf8f5435d4a78bdca4d6a018b578e/baaabbaa.bba I
      // 003: aload 2
      // 004: invokevirtual net/minecraft/class_465.method_17577 ()Lnet/minecraft/class_1703;
      // 007: astore 4
      // 009: istore 3
      // 00a: aload 4
      // 00c: iload 3
      // 00d: ifne 020
      // 010: instanceof net/minecraft/class_1707
      // 013: ifeq 059
      // 016: goto 01a
      // 019: athrow
      // 01a: aload 4
      // 01c: goto 020
      // 01f: athrow
      // 020: checkcast net/minecraft/class_1707
      // 023: astore 5
      // 025: aload 5
      // 027: iload 3
      // 028: ifne 040
      // 02b: invokevirtual net/minecraft/class_1707.method_17388 ()I
      // 02e: bipush 3
      // 02f: if_icmpne 059
      // 032: goto 036
      // 035: athrow
      // 036: aload 4
      // 038: iload 3
      // 039: ifne 050
      // 03c: goto 040
      // 03f: athrow
      // 040: invokevirtual net/minecraft/class_1703.method_34255 ()Lnet/minecraft/class_1799;
      // 043: ifnull 059
      // 046: aload 4
      // 048: iload 3
      // 049: ifne 05d
      // 04c: goto 050
      // 04f: athrow
      // 050: invokevirtual net/minecraft/class_1703.method_34255 ()Lnet/minecraft/class_1799;
      // 053: invokevirtual net/minecraft/class_1799.method_7960 ()Z
      // 056: ifne 05b
      // 059: return
      // 05a: athrow
      // 05b: aload 4
      // 05d: getfield net/minecraft/class_1703.field_7763 I
      // 060: aload 0
      // 061: getfield qeaa361f143ee4a0894bd168fd9b30c66/qf4ccf8f5435d4a78bdca4d6a018b578e/aaabbbbba.bbba I
      // 064: if_icmpeq 094
      // 067: aload 0
      // 068: aload 4
      // 06a: getfield net/minecraft/class_1703.field_7763 I
      // 06d: putfield qeaa361f143ee4a0894bd168fd9b30c66/qf4ccf8f5435d4a78bdca4d6a018b578e/aaabbbbba.bbba I
      // 070: aload 0
      // 071: ldc_w 308654289
      // 074: ldc_w 614797678
      // 077: ldc_w 2100131002
      // 07a: ixor
      // 07b: invokestatic qeaa361f143ee4a0894bd168fd9b30c66/qf4ccf8f5435d4a78bdca4d6a018b578e/aaabbbbba.a (II)I
      // 07e: ldc2_w 1848905881191263389
      // 081: invokestatic qeaa361f143ee4a0894bd168fd9b30c66/qf4ccf8f5435d4a78bdca4d6a018b578e/aaabbbbba.baaa (IJ)I
      // 084: putfield qeaa361f143ee4a0894bd168fd9b30c66/qf4ccf8f5435d4a78bdca4d6a018b578e/aaabbbbba.aabaa I
      // 087: aload 0
      // 088: getfield qeaa361f143ee4a0894bd168fd9b30c66/qf4ccf8f5435d4a78bdca4d6a018b578e/aaabbbbba.bb Ljava/util/Map;
      // 08b: invokeinterface java/util/Map.clear ()V 1
      // 090: goto 094
      // 093: athrow
      // 094: aload 0
      // 095: aload 1
      // 096: aload 4
      // 098: invokevirtual qeaa361f143ee4a0894bd168fd9b30c66/qf4ccf8f5435d4a78bdca4d6a018b578e/aaabbbbba.ab (Lnet/minecraft/class_310;Lnet/minecraft/class_1703;)V
      // 09b: iload 3
      // 09c: new java/util/ArrayList
      // 09f: dup
      // 0a0: invokespecial java/util/ArrayList.<init> ()V
      // 0a3: astore 6
      // 0a5: aload 0
      // 0a6: aload 4
      // 0a8: aload 6
      // 0aa: invokevirtual qeaa361f143ee4a0894bd168fd9b30c66/qf4ccf8f5435d4a78bdca4d6a018b578e/aaabbbbba.aaaaaa (Lnet/minecraft/class_1703;Ljava/util/List;)I
      // 0ad: istore 7
      // 0af: ifne 0d9
      // 0b2: iload 7
      // 0b4: ifne 0c2
      // 0b7: goto 0bb
      // 0ba: athrow
      // 0bb: aload 0
      // 0bc: aload 1
      // 0bd: invokevirtual qeaa361f143ee4a0894bd168fd9b30c66/qf4ccf8f5435d4a78bdca4d6a018b578e/aaabbbbba.aaab (Lnet/minecraft/class_310;)V
      // 0c0: return
      // 0c1: athrow
      // 0c2: aload 0
      // 0c3: ldc_w 308654290
      // 0c6: ldc_w 614797678
      // 0c9: ldc_w 973656351
      // 0cc: ixor
      // 0cd: invokestatic qeaa361f143ee4a0894bd168fd9b30c66/qf4ccf8f5435d4a78bdca4d6a018b578e/aaabbbbba.a (II)I
      // 0d0: ldc2_w 1848905881191263389
      // 0d3: invokestatic qeaa361f143ee4a0894bd168fd9b30c66/qf4ccf8f5435d4a78bdca4d6a018b578e/aaabbbbba.baaa (IJ)I
      // 0d6: putfield qeaa361f143ee4a0894bd168fd9b30c66/qf4ccf8f5435d4a78bdca4d6a018b578e/aaabbbbba.aabaa I
      // 0d9: invokestatic java/lang/System.currentTimeMillis ()J
      // 0dc: lstore 8
      // 0de: lload 8
      // 0e0: aload 0
      // 0e1: getfield qeaa361f143ee4a0894bd168fd9b30c66/qf4ccf8f5435d4a78bdca4d6a018b578e/aaabbbbba.abb J
      // 0e4: lsub
      // 0e5: aload 0
      // 0e6: aload 0
      // 0e7: getfield qeaa361f143ee4a0894bd168fd9b30c66/qf4ccf8f5435d4a78bdca4d6a018b578e/aaabbbbba.aabba Lqeaa361f143ee4a0894bd168fd9b30c66/qf4ccf8f5435d4a78bdca4d6a018b578e/aaabbbab;
      // 0ea: invokevirtual qeaa361f143ee4a0894bd168fd9b30c66/qf4ccf8f5435d4a78bdca4d6a018b578e/aaabbbbba.abaaa (Lqeaa361f143ee4a0894bd168fd9b30c66/qf4ccf8f5435d4a78bdca4d6a018b578e/aaabbbab;)J
      // 0ed: lcmp
      // 0ee: iload 3
      // 0ef: ifne 101
      // 0f2: ifge 0fa
      // 0f5: goto 0f9
      // 0f8: athrow
      // 0f9: return
      // 0fa: aload 6
      // 0fc: invokeinterface java/util/List.isEmpty ()Z 1
      // 101: iload 3
      // 102: ifne 114
      // 105: ifne 11f
      // 108: goto 10c
      // 10b: athrow
      // 10c: aload 1
      // 10d: invokestatic qeaa361f143ee4a0894bd168fd9b30c66/qf4ccf8f5435d4a78bdca4d6a018b578e/bbbbbbaa.baa (Lnet/minecraft/class_310;)Z
      // 110: goto 114
      // 113: athrow
      // 114: iload 3
      // 115: ifne 14e
      // 118: ifne 120
      // 11b: goto 11f
      // 11e: athrow
      // 11f: return
      // 120: aload 0
      // 121: lload 8
      // 123: putfield qeaa361f143ee4a0894bd168fd9b30c66/qf4ccf8f5435d4a78bdca4d6a018b578e/aaabbbbba.abb J
      // 126: ldc_w 308654291
      // 129: ldc_w 614797678
      // 12c: ldc_w 1762508802
      // 12f: ixor
      // 130: invokestatic qeaa361f143ee4a0894bd168fd9b30c66/qf4ccf8f5435d4a78bdca4d6a018b578e/aaabbbbba.a (II)I
      // 133: aload 6
      // 135: aload 0
      // 136: invokevirtual qeaa361f143ee4a0894bd168fd9b30c66/qf4ccf8f5435d4a78bdca4d6a018b578e/aaabbbbba.baaaa ()Ljava/util/Comparator;
      // 139: invokeinterface java/util/List.sort (Ljava/util/Comparator;)V 2
      // 13e: ldc2_w 7387827797527965062
      // 141: invokestatic qeaa361f143ee4a0894bd168fd9b30c66/qf4ccf8f5435d4a78bdca4d6a018b578e/aaabbbbba.baaa (IJ)I
      // 144: aload 6
      // 146: invokeinterface java/util/List.size ()I 1
      // 14b: invokestatic java/lang/Math.min (II)I
      // 14e: istore 10
      // 150: bipush 0
      // 151: istore 11
      // 153: iload 11
      // 155: iload 10
      // 157: if_icmpge 19f
      // 15a: aload 6
      // 15c: iload 11
      // 15e: invokeinterface java/util/List.get (I)Ljava/lang/Object; 2
      // 163: checkcast qeaa361f143ee4a0894bd168fd9b30c66/qf4ccf8f5435d4a78bdca4d6a018b578e/babbab
      // 166: invokevirtual qeaa361f143ee4a0894bd168fd9b30c66/qf4ccf8f5435d4a78bdca4d6a018b578e/babbab.aa ()I
      // 169: istore 12
      // 16b: iload 3
      // 16c: aload 0
      // 16d: aload 4
      // 16f: iload 12
      // 171: aload 1
      // 172: getfield net/minecraft/class_310.field_1724 Lnet/minecraft/class_746;
      // 175: getfield net/minecraft/class_746.field_6012 I
      // 178: invokevirtual qeaa361f143ee4a0894bd168fd9b30c66/qf4ccf8f5435d4a78bdca4d6a018b578e/aaabbbbba.aabaab (Lnet/minecraft/class_1703;II)V
      // 17b: ifne 1a3
      // 17e: aload 1
      // 17f: getfield net/minecraft/class_310.field_1761 Lnet/minecraft/class_636;
      // 182: aload 4
      // 184: getfield net/minecraft/class_1703.field_7763 I
      // 187: iload 12
      // 189: bipush 0
      // 18a: getstatic net/minecraft/class_1713.field_7794 Lnet/minecraft/class_1713;
      // 18d: aload 1
      // 18e: getfield net/minecraft/class_310.field_1724 Lnet/minecraft/class_746;
      // 191: invokevirtual net/minecraft/class_636.method_2906 (IIILnet/minecraft/class_1713;Lnet/minecraft/class_1657;)V
      // 194: iload 3
      // 195: iinc 11 1
      // 198: ifeq 153
      // 19b: goto 19f
      // 19e: athrow
      // 19f: aload 1
      // 1a0: invokestatic qeaa361f143ee4a0894bd168fd9b30c66/qf4ccf8f5435d4a78bdca4d6a018b578e/bbbbbbaa.baab (Lnet/minecraft/class_310;)V
      // 1a3: return
   }

   private void abbb(class_310 param1) {
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
      // 12: ifne 22
      // 15: getfield net/minecraft/class_310.field_1724 Lnet/minecraft/class_746;
      // 18: ifnonnull 21
      // 1b: goto 1f
      // 1e: athrow
      // 1f: return
      // 20: athrow
      // 21: aload 1
      // 22: getfield net/minecraft/class_310.field_1724 Lnet/minecraft/class_746;
      // 25: getfield net/minecraft/class_746.field_6012 I
      // 28: istore 3
      // 29: aload 0
      // 2a: iload 2
      // 2b: ifne 93
      // 2e: getfield qeaa361f143ee4a0894bd168fd9b30c66/qf4ccf8f5435d4a78bdca4d6a018b578e/aaabbbbba.aaba Z
      // 31: ifeq 92
      // 34: goto 38
      // 37: athrow
      // 38: aload 0
      // 39: iload 2
      // 3a: ifne 93
      // 3d: goto 41
      // 40: athrow
      // 41: getfield qeaa361f143ee4a0894bd168fd9b30c66/qf4ccf8f5435d4a78bdca4d6a018b578e/aaabbbbba.aaabb I
      // 44: ldc_w 308654292
      // 47: ldc_w -1218702902
      // 4a: ldc_w -623682841
      // 4d: ixor
      // 4e: invokestatic qeaa361f143ee4a0894bd168fd9b30c66/qf4ccf8f5435d4a78bdca4d6a018b578e/aaabbbbba.a (II)I
      // 51: ldc2_w 8097095949299169950
      // 54: invokestatic qeaa361f143ee4a0894bd168fd9b30c66/qf4ccf8f5435d4a78bdca4d6a018b578e/aaabbbbba.baaa (IJ)I
      // 57: if_icmpeq 92
      // 5a: goto 5e
      // 5d: athrow
      // 5e: iload 3
      // 5f: iload 2
      // 60: ifne 9e
      // 63: goto 67
      // 66: athrow
      // 67: aload 0
      // 68: getfield qeaa361f143ee4a0894bd168fd9b30c66/qf4ccf8f5435d4a78bdca4d6a018b578e/aaabbbbba.aaabb I
      // 6b: if_icmplt 92
      // 6e: goto 72
      // 71: athrow
      // 72: aload 0
      // 73: bipush 0
      // 74: putfield qeaa361f143ee4a0894bd168fd9b30c66/qf4ccf8f5435d4a78bdca4d6a018b578e/aaabbbbba.aaba Z
      // 77: aload 0
      // 78: ldc_w 308654293
      // 7b: ldc_w -1218702902
      // 7e: ldc_w 1517294005
      // 81: ixor
      // 82: invokestatic qeaa361f143ee4a0894bd168fd9b30c66/qf4ccf8f5435d4a78bdca4d6a018b578e/aaabbbbba.a (II)I
      // 85: ldc2_w 1848905881191263389
      // 88: invokestatic qeaa361f143ee4a0894bd168fd9b30c66/qf4ccf8f5435d4a78bdca4d6a018b578e/aaabbbbba.baaa (IJ)I
      // 8b: putfield qeaa361f143ee4a0894bd168fd9b30c66/qf4ccf8f5435d4a78bdca4d6a018b578e/aaabbbbba.aaabb I
      // 8e: goto 92
      // 91: athrow
      // 92: aload 0
      // 93: iload 2
      // 94: ifne a2
      // 97: getfield qeaa361f143ee4a0894bd168fd9b30c66/qf4ccf8f5435d4a78bdca4d6a018b578e/aaabbbbba.aaaa Z
      // 9a: goto 9e
      // 9d: athrow
      // 9e: ifeq ef
      // a1: aload 0
      // a2: getfield qeaa361f143ee4a0894bd168fd9b30c66/qf4ccf8f5435d4a78bdca4d6a018b578e/aaabbbbba.abba I
      // a5: iload 2
      // a6: ifne c8
      // a9: ldc_w 308654294
      // ac: ldc_w -1218702902
      // af: ldc_w 151811267
      // b2: ixor
      // b3: invokestatic qeaa361f143ee4a0894bd168fd9b30c66/qf4ccf8f5435d4a78bdca4d6a018b578e/aaabbbbba.a (II)I
      // b6: ldc2_w 1848905881191263389
      // b9: invokestatic qeaa361f143ee4a0894bd168fd9b30c66/qf4ccf8f5435d4a78bdca4d6a018b578e/aaabbbbba.baaa (IJ)I
      // bc: if_icmpeq ef
      // bf: goto c3
      // c2: athrow
      // c3: iload 3
      // c4: goto c8
      // c7: athrow
      // c8: aload 0
      // c9: getfield qeaa361f143ee4a0894bd168fd9b30c66/qf4ccf8f5435d4a78bdca4d6a018b578e/aaabbbbba.abba I
      // cc: if_icmplt ef
      // cf: aload 0
      // d0: bipush 0
      // d1: putfield qeaa361f143ee4a0894bd168fd9b30c66/qf4ccf8f5435d4a78bdca4d6a018b578e/aaabbbbba.aaaa Z
      // d4: aload 0
      // d5: ldc_w 308654295
      // d8: ldc_w -1218702902
      // db: ldc_w -1128612099
      // de: ixor
      // df: invokestatic qeaa361f143ee4a0894bd168fd9b30c66/qf4ccf8f5435d4a78bdca4d6a018b578e/aaabbbbba.a (II)I
      // e2: ldc2_w 1848905881191263389
      // e5: invokestatic qeaa361f143ee4a0894bd168fd9b30c66/qf4ccf8f5435d4a78bdca4d6a018b578e/aaabbbbba.baaa (IJ)I
      // e8: putfield qeaa361f143ee4a0894bd168fd9b30c66/qf4ccf8f5435d4a78bdca4d6a018b578e/aaabbbbba.abba I
      // eb: goto ef
      // ee: athrow
      // ef: return
   }

   private static int baaa(int var0, long var1) {
      int var3 = var0 ^ (int)(var1 & 32767L) ^ a(308654248, -979119684 ^ -397757728);
      if (ababa[var3] == null) {
         ababa[var3] = (int)(abab[var3] ^ var1);
      }

      return ababa[var3];
   }

   private class_2338 baab(class_310 var1) {
      class_2338 var3 = var1.field_1724.method_24515();
      class_2338 var4 = null;
      double var5 = Double.MAX_VALUE;
      int var10000 = baaabbaa.bba;
      int var7 = baaa(a(308654249, 1384264274 ^ 2124908327), 3537344900731250523L);
      int var2 = var10000;

      while (var7 <= 2) {
         int var8 = baaa(a(308654250, 1384264274 ^ -1682364767), 9164468908391721092L);

         while (true) {
            if (var8 <= 4) {
               if (var2 != 0) {
                  break;
               }

               int var9 = baaa(a(308654251, 1384264274 ^ 686859278), 2387122083324199255L);

               label68: {
                  while (var9 <= 4) {
                     if (var2 != 0) {
                        break label68;
                     }

                     class_2338 var10 = var3.method_10069(var8, var7, var9);

                     label64: {
                        label83: {
                           try {
                              if (!this.aaaabb(var1, var10) && var2 == 0) {
                                 break label83;
                              }
                           } catch (MatchException var14) {
                              throw var14;
                           }

                           double var11 = var1.field_1724.method_33571().method_1025(class_243.method_24953(var10));

                           try {
                              if (var2 != 0) {
                                 break label64;
                              }

                              if (!(var11 < var5)) {
                                 break label83;
                              }
                           } catch (MatchException var13) {
                              throw var13;
                           }

                           var5 = var11;
                           var4 = var10.method_10062();
                        }

                        var9++;
                     }

                     if (var2 != 0) {
                        break;
                     }
                  }

                  var8++;
               }

               if (var2 == 0) {
                  continue;
               }
            }

            var7++;
            break;
         }

         if (var2 != 0) {
            break;
         }
      }

      return var4;
   }

   public aaabbbbba() {
      int var1 = -1032804988;
      super(
         aabbaaaba.aaab(aaaa(a(308654252, var1 ^ 1409170686), a(308654253, var1 ^ -1608831701))),
         bbaabbba.bba,
         aabbaaaba.aaab(aaaa(a(308654254, var1 ^ 1797547017), a(308654255, var1 ^ 392196152)))
      );
      this.aaab = (abbaaaaa)this.abbbaaa(
         new abbaaaaa(
            aabbaaaba.aaab(aaaa(a(308654240, var1 ^ 560065331), a(308654241, var1 ^ 1579207459))), false
         )
      );
      this.babb = (baabaab)this.abbbaaa(
         new baabaab(
            aabbaaaba.aaab(aaaa(a(308654242, var1 ^ -15306658), a(308654243, var1 ^ 1972510405))),
            aabaaaba.class,
            aabaaaba.a
         )
      );
      this.bab = (bababa)this.abbbaaa(
         (bababa)new bababa(
               aabbaaaba.aaab(aaaa(a(308654244, var1 ^ -299527006), a(308654245, var1 ^ 592505746))), 50.0, 1.0, 100.0, 1.0
            )
            .babb(this::abb)
      );
      this.aab = new ababbbbba();
      this.aabab = -1;
      this.abbb = (abbaaaaa)this.abbbaaa(
         new abbaaaaa(
            aabbaaaba.aaab(aaaa(a(308654246, var1 ^ 1612419459), a(308654247, var1 ^ -614226356))), true
         )
      );
      this.aabba = (aaabbbab)this.abbbaaa(
         new aaabbbab(
               aabbaaaba.aaab(aaaa(a(308654264, var1 ^ 1926301361), a(308654265, var1 ^ -174020282))),
               25.0,
               50.0,
               0.0,
               300.0,
               5.0
            )
            .bbb(aabbaaaba.aaab(aaaa(a(308654266, var1 ^ 1182705926), a(308654267, var1 ^ -1741617517))))
      );
      this.bbab = (aaabbbab)this.abbbaaa(
         (aaabbbab)new aaabbbab(
               aabbaaaba.aaab(aaaa(a(308654268, var1 ^ 1893305912), a(308654269, var1 ^ -1471807382))),
               55.0,
               60.0,
               0.0,
               300.0,
               5.0
            )
            .bbb(aabbaaaba.aaab(aaaa(a(308654270, var1 ^ -315881527), a(308654271, var1 ^ -1902976494))))
            .babb(aaabbbbba::aab)
      );
      this.ba = (aaabbbab)this.abbbaaa(
         (aaabbbab)new aaabbbab(
               aabbaaaba.aaab(aaaa(a(308654256, var1 ^ 2098967418), a(308654257, var1 ^ 1592558624))),
               10.0,
               25.0,
               0.0,
               300.0,
               5.0
            )
            .bbb(aabbaaaba.aaab(aaaa(a(308654258, var1 ^ -1965678439), a(308654259, var1 ^ 803491529))))
            .babb(aaabbbbba::abab)
      );
      this.bbaa = (abbaaaaa)this.abbbaaa(
         new abbaaaaa(
            aabbaaaba.aaab(aaaa(a(308654260, var1 ^ 983447104), a(308654261, var1 ^ -1735403037))), false
         )
      );
      this.aba = (abaabbbb)this.abbbaaa(
         new abaabbbb(
            aabbaaaba.aaab(aaaa(a(308654262, var1 ^ 438330075), a(308654263, var1 ^ 1315679232))), aabb(), bbbaa()
         )
      );
      this.bb = new HashMap();
      this.bbba = baaa(a(308654216, var1 ^ -52755907), 1848905881191263389L);
      this.aabaa = baaa(a(308654217, var1 ^ -1865362655), 1848905881191263389L);
      this.abaa = baaa(a(308654218, var1 ^ -1145968436), 1848905881191263389L);
      this.aaabb = baaa(a(308654219, var1 ^ 121552177), 1848905881191263389L);
      this.abba = baaa(a(308654220, var1 ^ -2064243337), 1848905881191263389L);
      this.babb.babb(this.aaab::abbb);
      this.abbb.babb(this.aaab::abbb);
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
      // 000: getstatic qeaa361f143ee4a0894bd168fd9b30c66/qf4ccf8f5435d4a78bdca4d6a018b578e/baaabbaa.bba I
      // 003: invokestatic net/minecraft/class_310.method_1551 ()Lnet/minecraft/class_310;
      // 006: astore 2
      // 007: istore 1
      // 008: aload 0
      // 009: iload 1
      // 00a: ifne 01f
      // 00d: aload 2
      // 00e: invokevirtual qeaa361f143ee4a0894bd168fd9b30c66/qf4ccf8f5435d4a78bdca4d6a018b578e/aaabbbbba.bbb (Lnet/minecraft/class_310;)Z
      // 011: ifne 01e
      // 014: goto 018
      // 017: athrow
      // 018: aload 0
      // 019: invokevirtual qeaa361f143ee4a0894bd168fd9b30c66/qf4ccf8f5435d4a78bdca4d6a018b578e/aaabbbbba.bab ()V
      // 01c: return
      // 01d: athrow
      // 01e: aload 0
      // 01f: iload 1
      // 020: ifne 0f1
      // 023: aload 2
      // 024: invokevirtual qeaa361f143ee4a0894bd168fd9b30c66/qf4ccf8f5435d4a78bdca4d6a018b578e/aaabbbbba.aaaab (Lnet/minecraft/class_310;)Z
      // 027: ifeq 0f0
      // 02a: goto 02e
      // 02d: athrow
      // 02e: aload 0
      // 02f: bipush 0
      // 030: putfield qeaa361f143ee4a0894bd168fd9b30c66/qf4ccf8f5435d4a78bdca4d6a018b578e/aaabbbbba.aaba Z
      // 033: aload 0
      // 034: ldc_w 308654221
      // 037: ldc_w -2044194307
      // 03a: ldc_w -2004506879
      // 03d: ixor
      // 03e: invokestatic qeaa361f143ee4a0894bd168fd9b30c66/qf4ccf8f5435d4a78bdca4d6a018b578e/aaabbbbba.a (II)I
      // 041: ldc2_w 1848905881191263389
      // 044: invokestatic qeaa361f143ee4a0894bd168fd9b30c66/qf4ccf8f5435d4a78bdca4d6a018b578e/aaabbbbba.baaa (IJ)I
      // 047: iload 1
      // 048: ifne 0e0
      // 04b: goto 04f
      // 04e: athrow
      // 04f: putfield qeaa361f143ee4a0894bd168fd9b30c66/qf4ccf8f5435d4a78bdca4d6a018b578e/aaabbbbba.aaabb I
      // 052: aload 0
      // 053: bipush 0
      // 054: putfield qeaa361f143ee4a0894bd168fd9b30c66/qf4ccf8f5435d4a78bdca4d6a018b578e/aaabbbbba.aaaa Z
      // 057: aload 0
      // 058: ldc_w 308654222
      // 05b: ldc_w -2044194307
      // 05e: ldc_w -560884710
      // 061: ixor
      // 062: invokestatic qeaa361f143ee4a0894bd168fd9b30c66/qf4ccf8f5435d4a78bdca4d6a018b578e/aaabbbbba.a (II)I
      // 065: ldc2_w 1848905881191263389
      // 068: invokestatic qeaa361f143ee4a0894bd168fd9b30c66/qf4ccf8f5435d4a78bdca4d6a018b578e/aaabbbbba.baaa (IJ)I
      // 06b: putfield qeaa361f143ee4a0894bd168fd9b30c66/qf4ccf8f5435d4a78bdca4d6a018b578e/aaabbbbba.abba I
      // 06e: aload 0
      // 06f: getfield qeaa361f143ee4a0894bd168fd9b30c66/qf4ccf8f5435d4a78bdca4d6a018b578e/aaabbbbba.bbaa Lqeaa361f143ee4a0894bd168fd9b30c66/qf4ccf8f5435d4a78bdca4d6a018b578e/abbaaaaa;
      // 072: invokevirtual qeaa361f143ee4a0894bd168fd9b30c66/qf4ccf8f5435d4a78bdca4d6a018b578e/abbaaaaa.abbb ()Ljava/lang/Object;
      // 075: checkcast java/lang/Boolean
      // 078: invokevirtual java/lang/Boolean.booleanValue ()Z
      // 07b: ifeq 0de
      // 07e: goto 082
      // 081: athrow
      // 082: aload 0
      // 083: iload 1
      // 084: ifne 0e4
      // 087: goto 08b
      // 08a: athrow
      // 08b: aload 2
      // 08c: getfield net/minecraft/class_310.field_1724 Lnet/minecraft/class_746;
      // 08f: invokevirtual qeaa361f143ee4a0894bd168fd9b30c66/qf4ccf8f5435d4a78bdca4d6a018b578e/aaabbbbba.aababa (Lnet/minecraft/class_746;)Z
      // 092: ifeq 0de
      // 095: goto 099
      // 098: athrow
      // 099: aload 0
      // 09a: iload 1
      // 09b: ifne 0e4
      // 09e: goto 0a2
      // 0a1: athrow
      // 0a2: aload 2
      // 0a3: invokevirtual qeaa361f143ee4a0894bd168fd9b30c66/qf4ccf8f5435d4a78bdca4d6a018b578e/aaabbbbba.baab (Lnet/minecraft/class_310;)Lnet/minecraft/class_2338;
      // 0a6: astore 3
      // 0a7: aload 3
      // 0a8: ifnull 0de
      // 0ab: aload 0
      // 0ac: iload 1
      // 0ad: ifne 0e4
      // 0b0: goto 0b4
      // 0b3: athrow
      // 0b4: aload 2
      // 0b5: getfield net/minecraft/class_310.field_1724 Lnet/minecraft/class_746;
      // 0b8: invokevirtual qeaa361f143ee4a0894bd168fd9b30c66/qf4ccf8f5435d4a78bdca4d6a018b578e/aaabbbbba.bbaba (Lnet/minecraft/class_746;)Z
      // 0bb: ifeq 0de
      // 0be: goto 0c2
      // 0c1: athrow
      // 0c2: aload 0
      // 0c3: aload 3
      // 0c4: putfield qeaa361f143ee4a0894bd168fd9b30c66/qf4ccf8f5435d4a78bdca4d6a018b578e/aaabbbbba.baaa Lnet/minecraft/class_2338;
      // 0c7: aload 0
      // 0c8: bipush 1
      // 0c9: putfield qeaa361f143ee4a0894bd168fd9b30c66/qf4ccf8f5435d4a78bdca4d6a018b578e/aaabbbbba.abaaa Z
      // 0cc: aload 2
      // 0cd: getfield net/minecraft/class_310.field_1724 Lnet/minecraft/class_746;
      // 0d0: invokevirtual net/minecraft/class_746.method_7346 ()V
      // 0d3: aload 2
      // 0d4: aconst_null
      // 0d5: invokevirtual net/minecraft/class_310.method_1507 (Lnet/minecraft/class_437;)V
      // 0d8: aload 0
      // 0d9: invokevirtual qeaa361f143ee4a0894bd168fd9b30c66/qf4ccf8f5435d4a78bdca4d6a018b578e/aaabbbbba.aabaaa ()V
      // 0dc: return
      // 0dd: athrow
      // 0de: aload 0
      // 0df: bipush 0
      // 0e0: putfield qeaa361f143ee4a0894bd168fd9b30c66/qf4ccf8f5435d4a78bdca4d6a018b578e/aaabbbbba.abaaa Z
      // 0e3: aload 0
      // 0e4: aload 2
      // 0e5: aload 2
      // 0e6: getfield net/minecraft/class_310.field_1755 Lnet/minecraft/class_437;
      // 0e9: checkcast net/minecraft/class_465
      // 0ec: invokevirtual qeaa361f143ee4a0894bd168fd9b30c66/qf4ccf8f5435d4a78bdca4d6a018b578e/aaabbbbba.abba (Lnet/minecraft/class_310;Lnet/minecraft/class_465;)V
      // 0ef: return
      // 0f0: aload 0
      // 0f1: invokevirtual qeaa361f143ee4a0894bd168fd9b30c66/qf4ccf8f5435d4a78bdca4d6a018b578e/aaabbbbba.aabaaa ()V
      // 0f4: aload 2
      // 0f5: iload 1
      // 0f6: ifne 10c
      // 0f9: getfield net/minecraft/class_310.field_1755 Lnet/minecraft/class_437;
      // 0fc: ifnonnull 12c
      // 0ff: goto 103
      // 102: athrow
      // 103: aload 2
      // 104: iload 1
      // 105: ifne 117
      // 108: goto 10c
      // 10b: athrow
      // 10c: invokestatic qeaa361f143ee4a0894bd168fd9b30c66/qf4ccf8f5435d4a78bdca4d6a018b578e/bbbbbbaa.aabb (Lnet/minecraft/class_310;)Z
      // 10f: ifne 12c
      // 112: aload 2
      // 113: goto 117
      // 116: athrow
      // 117: iload 1
      // 118: ifne 135
      // 11b: getfield net/minecraft/class_310.field_1724 Lnet/minecraft/class_746;
      // 11e: getfield net/minecraft/class_746.field_6012 I
      // 121: aload 0
      // 122: getfield qeaa361f143ee4a0894bd168fd9b30c66/qf4ccf8f5435d4a78bdca4d6a018b578e/aaabbbbba.abaa I
      // 125: if_icmpge 12e
      // 128: goto 12c
      // 12b: athrow
      // 12c: return
      // 12d: athrow
      // 12e: aload 0
      // 12f: getfield qeaa361f143ee4a0894bd168fd9b30c66/qf4ccf8f5435d4a78bdca4d6a018b578e/aaabbbbba.aaab Lqeaa361f143ee4a0894bd168fd9b30c66/qf4ccf8f5435d4a78bdca4d6a018b578e/abbaaaaa;
      // 132: invokevirtual qeaa361f143ee4a0894bd168fd9b30c66/qf4ccf8f5435d4a78bdca4d6a018b578e/abbaaaaa.abbb ()Ljava/lang/Object;
      // 135: iload 1
      // 136: ifne 16c
      // 139: checkcast java/lang/Boolean
      // 13c: invokevirtual java/lang/Boolean.booleanValue ()Z
      // 13f: ifne 159
      // 142: goto 146
      // 145: athrow
      // 146: aload 0
      // 147: iload 1
      // 148: ifne 1ba
      // 14b: goto 14f
      // 14e: athrow
      // 14f: getfield qeaa361f143ee4a0894bd168fd9b30c66/qf4ccf8f5435d4a78bdca4d6a018b578e/aaabbbbba.abaaa Z
      // 152: ifeq 1b9
      // 155: goto 159
      // 158: athrow
      // 159: aload 0
      // 15a: iload 1
      // 15b: ifne 1ba
      // 15e: goto 162
      // 161: athrow
      // 162: getfield qeaa361f143ee4a0894bd168fd9b30c66/qf4ccf8f5435d4a78bdca4d6a018b578e/aaabbbbba.bbaa Lqeaa361f143ee4a0894bd168fd9b30c66/qf4ccf8f5435d4a78bdca4d6a018b578e/abbaaaaa;
      // 165: invokevirtual qeaa361f143ee4a0894bd168fd9b30c66/qf4ccf8f5435d4a78bdca4d6a018b578e/abbaaaaa.abbb ()Ljava/lang/Object;
      // 168: goto 16c
      // 16b: athrow
      // 16c: checkcast java/lang/Boolean
      // 16f: invokevirtual java/lang/Boolean.booleanValue ()Z
      // 172: ifeq 1b9
      // 175: aload 0
      // 176: aload 2
      // 177: getfield net/minecraft/class_310.field_1724 Lnet/minecraft/class_746;
      // 17a: iload 1
      // 17b: ifne 1c6
      // 17e: goto 182
      // 181: athrow
      // 182: invokevirtual qeaa361f143ee4a0894bd168fd9b30c66/qf4ccf8f5435d4a78bdca4d6a018b578e/aaabbbbba.aababa (Lnet/minecraft/class_746;)Z
      // 185: ifeq 1b9
      // 188: goto 18c
      // 18b: athrow
      // 18c: aload 0
      // 18d: aload 2
      // 18e: getfield net/minecraft/class_310.field_1724 Lnet/minecraft/class_746;
      // 191: iload 1
      // 192: ifne 1c6
      // 195: goto 199
      // 198: athrow
      // 199: invokevirtual qeaa361f143ee4a0894bd168fd9b30c66/qf4ccf8f5435d4a78bdca4d6a018b578e/aaabbbbba.bbaba (Lnet/minecraft/class_746;)Z
      // 19c: ifeq 1b9
      // 19f: goto 1a3
      // 1a2: athrow
      // 1a3: aload 0
      // 1a4: iload 1
      // 1a5: ifne 1ba
      // 1a8: goto 1ac
      // 1ab: athrow
      // 1ac: aload 2
      // 1ad: invokevirtual qeaa361f143ee4a0894bd168fd9b30c66/qf4ccf8f5435d4a78bdca4d6a018b578e/aaabbbbba.aabbab (Lnet/minecraft/class_310;)Z
      // 1b0: ifeq 1b9
      // 1b3: goto 1b7
      // 1b6: athrow
      // 1b7: return
      // 1b8: athrow
      // 1b9: aload 0
      // 1ba: iload 1
      // 1bb: ifne 1dd
      // 1be: aload 2
      // 1bf: getfield net/minecraft/class_310.field_1724 Lnet/minecraft/class_746;
      // 1c2: goto 1c6
      // 1c5: athrow
      // 1c6: invokevirtual qeaa361f143ee4a0894bd168fd9b30c66/qf4ccf8f5435d4a78bdca4d6a018b578e/aaabbbbba.bbab (Lnet/minecraft/class_746;)Z
      // 1c9: ifne 1ce
      // 1cc: return
      // 1cd: athrow
      // 1ce: aload 0
      // 1cf: iload 1
      // 1d0: ifne 1fc
      // 1d3: getfield qeaa361f143ee4a0894bd168fd9b30c66/qf4ccf8f5435d4a78bdca4d6a018b578e/aaabbbbba.aaab Lqeaa361f143ee4a0894bd168fd9b30c66/qf4ccf8f5435d4a78bdca4d6a018b578e/abbaaaaa;
      // 1d6: invokevirtual qeaa361f143ee4a0894bd168fd9b30c66/qf4ccf8f5435d4a78bdca4d6a018b578e/abbaaaaa.abbb ()Ljava/lang/Object;
      // 1d9: goto 1dd
      // 1dc: athrow
      // 1dd: checkcast java/lang/Boolean
      // 1e0: invokevirtual java/lang/Boolean.booleanValue ()Z
      // 1e3: ifne 1fb
      // 1e6: aload 0
      // 1e7: iload 1
      // 1e8: ifne 1fc
      // 1eb: goto 1ef
      // 1ee: athrow
      // 1ef: getfield qeaa361f143ee4a0894bd168fd9b30c66/qf4ccf8f5435d4a78bdca4d6a018b578e/aaabbbbba.abaaa Z
      // 1f2: ifne 1fb
      // 1f5: goto 1f9
      // 1f8: athrow
      // 1f9: return
      // 1fa: athrow
      // 1fb: aload 0
      // 1fc: aload 2
      // 1fd: invokevirtual qeaa361f143ee4a0894bd168fd9b30c66/qf4ccf8f5435d4a78bdca4d6a018b578e/aaabbbbba.bbbb (Lnet/minecraft/class_310;)V
      // 200: return
   }

   private boolean baba(class_310 var1, class_2338 var2, class_243 var3) {
      return this.aaaaa(var1, var2, var3);
   }

   private double babb(class_1799 param1) {
      // $VF: Couldn't be decompiled
      // Please report this to the Vineflower issue tracker, at https://github.com/Vineflower/vineflower/issues with a copy of the class file (if you have the rights to distribute it!)
      // java.lang.RuntimeException: parsing failure!
      //   at org.jetbrains.java.decompiler.modules.decompiler.decompose.DomHelper.parseGraph(DomHelper.java:211)
      //   at org.jetbrains.java.decompiler.main.rels.MethodProcessor.codeToJava(MethodProcessor.java:166)
      //
      // Bytecode:
      // 000: ldc_w 1904890742
      // 003: istore 4
      // 005: getstatic qeaa361f143ee4a0894bd168fd9b30c66/qf4ccf8f5435d4a78bdca4d6a018b578e/baaabbaa.bba I
      // 008: getstatic net/minecraft/class_7923.field_41178 Lnet/minecraft/class_7922;
      // 00b: aload 1
      // 00c: invokevirtual net/minecraft/class_1799.method_7909 ()Lnet/minecraft/class_1792;
      // 00f: invokeinterface net/minecraft/class_7922.method_10221 (Ljava/lang/Object;)Lnet/minecraft/class_2960; 2
      // 014: invokevirtual net/minecraft/class_2960.method_12832 ()Ljava/lang/String;
      // 017: astore 3
      // 018: istore 2
      // 019: aload 3
      // 01a: iload 2
      // 01b: ifne 04c
      // 01e: ldc_w 308654193
      // 021: iload 4
      // 023: ldc_w -399850158
      // 026: ixor
      // 027: invokestatic qeaa361f143ee4a0894bd168fd9b30c66/qf4ccf8f5435d4a78bdca4d6a018b578e/aaabbbbba.a (II)I
      // 02a: ldc_w 308654194
      // 02d: iload 4
      // 02f: ldc_w 289598722
      // 032: ixor
      // 033: invokestatic qeaa361f143ee4a0894bd168fd9b30c66/qf4ccf8f5435d4a78bdca4d6a018b578e/aaabbbbba.a (II)I
      // 036: invokestatic qeaa361f143ee4a0894bd168fd9b30c66/qf4ccf8f5435d4a78bdca4d6a018b578e/aaabbbbba.aaaa (II)Ljava/lang/String;
      // 039: invokestatic qeaa361f143ee4a0894bd168fd9b30c66/qf4ccf8f5435d4a78bdca4d6a018b578e/aabbaaaba.abba (Ljava/lang/String;)Ljava/lang/String;
      // 03c: invokevirtual java/lang/String.startsWith (Ljava/lang/String;)Z
      // 03f: ifeq 04b
      // 042: goto 046
      // 045: athrow
      // 046: ldc2_w 700.0
      // 049: dreturn
      // 04a: athrow
      // 04b: aload 3
      // 04c: ldc_w 308654195
      // 04f: iload 4
      // 051: ldc_w 667641233
      // 054: ixor
      // 055: invokestatic qeaa361f143ee4a0894bd168fd9b30c66/qf4ccf8f5435d4a78bdca4d6a018b578e/aaabbbbba.a (II)I
      // 058: ldc_w 308654196
      // 05b: iload 4
      // 05d: ldc_w -433067613
      // 060: ixor
      // 061: invokestatic qeaa361f143ee4a0894bd168fd9b30c66/qf4ccf8f5435d4a78bdca4d6a018b578e/aaabbbbba.a (II)I
      // 064: invokestatic qeaa361f143ee4a0894bd168fd9b30c66/qf4ccf8f5435d4a78bdca4d6a018b578e/aaabbbbba.aaaa (II)Ljava/lang/String;
      // 067: iload 2
      // 068: ifne 0a4
      // 06b: invokestatic qeaa361f143ee4a0894bd168fd9b30c66/qf4ccf8f5435d4a78bdca4d6a018b578e/aabbaaaba.abba (Ljava/lang/String;)Ljava/lang/String;
      // 06e: invokevirtual java/lang/String.startsWith (Ljava/lang/String;)Z
      // 071: ifeq 07d
      // 074: goto 078
      // 077: athrow
      // 078: ldc2_w 600.0
      // 07b: dreturn
      // 07c: athrow
      // 07d: aload 3
      // 07e: iload 2
      // 07f: ifne 0b0
      // 082: ldc_w 308654197
      // 085: iload 4
      // 087: ldc_w 1399882250
      // 08a: ixor
      // 08b: invokestatic qeaa361f143ee4a0894bd168fd9b30c66/qf4ccf8f5435d4a78bdca4d6a018b578e/aaabbbbba.a (II)I
      // 08e: ldc_w 308654198
      // 091: iload 4
      // 093: ldc_w -1316629700
      // 096: ixor
      // 097: invokestatic qeaa361f143ee4a0894bd168fd9b30c66/qf4ccf8f5435d4a78bdca4d6a018b578e/aaabbbbba.a (II)I
      // 09a: invokestatic qeaa361f143ee4a0894bd168fd9b30c66/qf4ccf8f5435d4a78bdca4d6a018b578e/aaabbbbba.aaaa (II)Ljava/lang/String;
      // 09d: invokestatic qeaa361f143ee4a0894bd168fd9b30c66/qf4ccf8f5435d4a78bdca4d6a018b578e/aabbaaaba.abba (Ljava/lang/String;)Ljava/lang/String;
      // 0a0: goto 0a4
      // 0a3: athrow
      // 0a4: invokevirtual java/lang/String.startsWith (Ljava/lang/String;)Z
      // 0a7: ifeq 0af
      // 0aa: ldc2_w 500.0
      // 0ad: dreturn
      // 0ae: athrow
      // 0af: aload 3
      // 0b0: iload 2
      // 0b1: ifne 0e2
      // 0b4: ldc_w 308654199
      // 0b7: iload 4
      // 0b9: ldc_w 1794061781
      // 0bc: ixor
      // 0bd: invokestatic qeaa361f143ee4a0894bd168fd9b30c66/qf4ccf8f5435d4a78bdca4d6a018b578e/aaabbbbba.a (II)I
      // 0c0: ldc_w 308654152
      // 0c3: iload 4
      // 0c5: ldc_w 715736792
      // 0c8: ixor
      // 0c9: invokestatic qeaa361f143ee4a0894bd168fd9b30c66/qf4ccf8f5435d4a78bdca4d6a018b578e/aaabbbbba.a (II)I
      // 0cc: invokestatic qeaa361f143ee4a0894bd168fd9b30c66/qf4ccf8f5435d4a78bdca4d6a018b578e/aaabbbbba.aaaa (II)Ljava/lang/String;
      // 0cf: invokestatic qeaa361f143ee4a0894bd168fd9b30c66/qf4ccf8f5435d4a78bdca4d6a018b578e/aabbaaaba.abba (Ljava/lang/String;)Ljava/lang/String;
      // 0d2: invokevirtual java/lang/String.startsWith (Ljava/lang/String;)Z
      // 0d5: ifeq 0e1
      // 0d8: goto 0dc
      // 0db: athrow
      // 0dc: ldc2_w 440.0
      // 0df: dreturn
      // 0e0: athrow
      // 0e1: aload 3
      // 0e2: ldc_w 308654153
      // 0e5: iload 4
      // 0e7: ldc_w 907125885
      // 0ea: ixor
      // 0eb: invokestatic qeaa361f143ee4a0894bd168fd9b30c66/qf4ccf8f5435d4a78bdca4d6a018b578e/aaabbbbba.a (II)I
      // 0ee: ldc_w 308654154
      // 0f1: iload 4
      // 0f3: ldc_w -176283918
      // 0f6: ixor
      // 0f7: invokestatic qeaa361f143ee4a0894bd168fd9b30c66/qf4ccf8f5435d4a78bdca4d6a018b578e/aaabbbbba.a (II)I
      // 0fa: invokestatic qeaa361f143ee4a0894bd168fd9b30c66/qf4ccf8f5435d4a78bdca4d6a018b578e/aaabbbbba.aaaa (II)Ljava/lang/String;
      // 0fd: invokestatic qeaa361f143ee4a0894bd168fd9b30c66/qf4ccf8f5435d4a78bdca4d6a018b578e/aabbaaaba.abba (Ljava/lang/String;)Ljava/lang/String;
      // 100: iload 2
      // 101: ifne 13a
      // 104: invokevirtual java/lang/String.startsWith (Ljava/lang/String;)Z
      // 107: ifeq 113
      // 10a: goto 10e
      // 10d: athrow
      // 10e: ldc2_w 420.0
      // 111: dreturn
      // 112: athrow
      // 113: aload 3
      // 114: iload 2
      // 115: ifne 146
      // 118: ldc_w 308654155
      // 11b: iload 4
      // 11d: ldc_w 1159762501
      // 120: ixor
      // 121: invokestatic qeaa361f143ee4a0894bd168fd9b30c66/qf4ccf8f5435d4a78bdca4d6a018b578e/aaabbbbba.a (II)I
      // 124: ldc_w 308654156
      // 127: iload 4
      // 129: ldc_w -1487974583
      // 12c: ixor
      // 12d: invokestatic qeaa361f143ee4a0894bd168fd9b30c66/qf4ccf8f5435d4a78bdca4d6a018b578e/aaabbbbba.a (II)I
      // 130: invokestatic qeaa361f143ee4a0894bd168fd9b30c66/qf4ccf8f5435d4a78bdca4d6a018b578e/aaabbbbba.aaaa (II)Ljava/lang/String;
      // 133: invokestatic qeaa361f143ee4a0894bd168fd9b30c66/qf4ccf8f5435d4a78bdca4d6a018b578e/aabbaaaba.abba (Ljava/lang/String;)Ljava/lang/String;
      // 136: goto 13a
      // 139: athrow
      // 13a: invokevirtual java/lang/String.startsWith (Ljava/lang/String;)Z
      // 13d: ifeq 145
      // 140: ldc2_w 350.0
      // 143: dreturn
      // 144: athrow
      // 145: aload 3
      // 146: ldc_w 308654157
      // 149: iload 4
      // 14b: ldc_w -427514838
      // 14e: ixor
      // 14f: invokestatic qeaa361f143ee4a0894bd168fd9b30c66/qf4ccf8f5435d4a78bdca4d6a018b578e/aaabbbbba.a (II)I
      // 152: ldc_w 308654158
      // 155: iload 4
      // 157: ldc_w 764444818
      // 15a: ixor
      // 15b: invokestatic qeaa361f143ee4a0894bd168fd9b30c66/qf4ccf8f5435d4a78bdca4d6a018b578e/aaabbbbba.a (II)I
      // 15e: invokestatic qeaa361f143ee4a0894bd168fd9b30c66/qf4ccf8f5435d4a78bdca4d6a018b578e/aaabbbbba.aaaa (II)Ljava/lang/String;
      // 161: iload 2
      // 162: ifne 19e
      // 165: invokestatic qeaa361f143ee4a0894bd168fd9b30c66/qf4ccf8f5435d4a78bdca4d6a018b578e/aabbaaaba.abba (Ljava/lang/String;)Ljava/lang/String;
      // 168: invokevirtual java/lang/String.startsWith (Ljava/lang/String;)Z
      // 16b: ifeq 177
      // 16e: goto 172
      // 171: athrow
      // 172: ldc2_w 310.0
      // 175: dreturn
      // 176: athrow
      // 177: aload 3
      // 178: iload 2
      // 179: ifne 1aa
      // 17c: ldc_w 308654159
      // 17f: iload 4
      // 181: ldc_w -247320915
      // 184: ixor
      // 185: invokestatic qeaa361f143ee4a0894bd168fd9b30c66/qf4ccf8f5435d4a78bdca4d6a018b578e/aaabbbbba.a (II)I
      // 188: ldc_w 308654144
      // 18b: iload 4
      // 18d: ldc_w 849332452
      // 190: ixor
      // 191: invokestatic qeaa361f143ee4a0894bd168fd9b30c66/qf4ccf8f5435d4a78bdca4d6a018b578e/aaabbbbba.a (II)I
      // 194: invokestatic qeaa361f143ee4a0894bd168fd9b30c66/qf4ccf8f5435d4a78bdca4d6a018b578e/aaabbbbba.aaaa (II)Ljava/lang/String;
      // 197: invokestatic qeaa361f143ee4a0894bd168fd9b30c66/qf4ccf8f5435d4a78bdca4d6a018b578e/aabbaaaba.abba (Ljava/lang/String;)Ljava/lang/String;
      // 19a: goto 19e
      // 19d: athrow
      // 19e: invokevirtual java/lang/String.startsWith (Ljava/lang/String;)Z
      // 1a1: ifeq 1a9
      // 1a4: ldc2_w 220.0
      // 1a7: dreturn
      // 1a8: athrow
      // 1a9: aload 3
      // 1aa: ldc_w 308654145
      // 1ad: iload 4
      // 1af: ldc_w 973747615
      // 1b2: ixor
      // 1b3: invokestatic qeaa361f143ee4a0894bd168fd9b30c66/qf4ccf8f5435d4a78bdca4d6a018b578e/aaabbbbba.a (II)I
      // 1b6: ldc_w 308654146
      // 1b9: iload 4
      // 1bb: ldc_w -605171099
      // 1be: ixor
      // 1bf: invokestatic qeaa361f143ee4a0894bd168fd9b30c66/qf4ccf8f5435d4a78bdca4d6a018b578e/aaabbbbba.a (II)I
      // 1c2: invokestatic qeaa361f143ee4a0894bd168fd9b30c66/qf4ccf8f5435d4a78bdca4d6a018b578e/aaabbbbba.aaaa (II)Ljava/lang/String;
      // 1c5: invokestatic qeaa361f143ee4a0894bd168fd9b30c66/qf4ccf8f5435d4a78bdca4d6a018b578e/aabbaaaba.abba (Ljava/lang/String;)Ljava/lang/String;
      // 1c8: invokevirtual java/lang/String.startsWith (Ljava/lang/String;)Z
      // 1cb: ifeq 1d3
      // 1ce: ldc2_w 180.0
      // 1d1: dreturn
      // 1d2: athrow
      // 1d3: ldc2_w 300.0
      // 1d6: dreturn
   }

   private boolean bbab(class_746 param1) {
      // $VF: Couldn't be decompiled
      // Please report this to the Vineflower issue tracker, at https://github.com/Vineflower/vineflower/issues with a copy of the class file (if you have the rights to distribute it!)
      // java.lang.RuntimeException: parsing failure!
      //   at org.jetbrains.java.decompiler.modules.decompiler.decompose.DomHelper.parseGraph(DomHelper.java:211)
      //   at org.jetbrains.java.decompiler.main.rels.MethodProcessor.codeToJava(MethodProcessor.java:166)
      //
      // Bytecode:
      // 00: getstatic qeaa361f143ee4a0894bd168fd9b30c66/qf4ccf8f5435d4a78bdca4d6a018b578e/baaabbaa.bba I
      // 03: ldc_w 308654147
      // 06: ldc_w 1187371787
      // 09: ldc_w 855080542
      // 0c: ixor
      // 0d: invokestatic qeaa361f143ee4a0894bd168fd9b30c66/qf4ccf8f5435d4a78bdca4d6a018b578e/aaabbbbba.a (II)I
      // 10: ldc2_w 7529117296768793432
      // 13: invokestatic qeaa361f143ee4a0894bd168fd9b30c66/qf4ccf8f5435d4a78bdca4d6a018b578e/aaabbbbba.baaa (IJ)I
      // 16: aload 1
      // 17: invokevirtual net/minecraft/class_746.method_31548 ()Lnet/minecraft/class_1661;
      // 1a: invokevirtual net/minecraft/class_1661.method_5439 ()I
      // 1d: invokestatic java/lang/Math.min (II)I
      // 20: istore 3
      // 21: istore 2
      // 22: bipush 0
      // 23: istore 4
      // 25: iload 4
      // 27: iload 3
      // 28: if_icmpge 54
      // 2b: aload 0
      // 2c: aload 1
      // 2d: invokevirtual net/minecraft/class_746.method_31548 ()Lnet/minecraft/class_1661;
      // 30: iload 4
      // 32: invokevirtual net/minecraft/class_1661.method_5438 (I)Lnet/minecraft/class_1799;
      // 35: invokevirtual qeaa361f143ee4a0894bd168fd9b30c66/qf4ccf8f5435d4a78bdca4d6a018b578e/aaabbbbba.bbabb (Lnet/minecraft/class_1799;)Z
      // 38: iload 2
      // 39: ifne 55
      // 3c: iload 2
      // 3d: ifne 4c
      // 40: goto 44
      // 43: athrow
      // 44: ifeq 4d
      // 47: goto 4b
      // 4a: athrow
      // 4b: bipush 1
      // 4c: ireturn
      // 4d: iinc 4 1
      // 50: iload 2
      // 51: ifeq 25
      // 54: bipush 0
      // 55: ireturn
   }

   private int bbba(class_746 param1) {
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
      // 05: istore 2
      // 06: iload 3
      // 07: ldc_w 308654148
      // 0a: ldc_w -237282307
      // 0d: ldc_w 7889904
      // 10: ixor
      // 11: invokestatic qeaa361f143ee4a0894bd168fd9b30c66/qf4ccf8f5435d4a78bdca4d6a018b578e/aaabbbbba.a (II)I
      // 14: ldc2_w 6884738495261050921
      // 17: invokestatic qeaa361f143ee4a0894bd168fd9b30c66/qf4ccf8f5435d4a78bdca4d6a018b578e/aaabbbbba.baaa (IJ)I
      // 1a: if_icmpge 47
      // 1d: aload 1
      // 1e: invokevirtual net/minecraft/class_746.method_31548 ()Lnet/minecraft/class_1661;
      // 21: iload 3
      // 22: invokevirtual net/minecraft/class_1661.method_5438 (I)Lnet/minecraft/class_1799;
      // 25: getstatic net/minecraft/class_1802.field_8466 Lnet/minecraft/class_1792;
      // 28: invokevirtual net/minecraft/class_1799.method_31574 (Lnet/minecraft/class_1792;)Z
      // 2b: iload 2
      // 2c: ifne 48
      // 2f: iload 2
      // 30: ifne 3f
      // 33: goto 37
      // 36: athrow
      // 37: ifeq 40
      // 3a: goto 3e
      // 3d: athrow
      // 3e: iload 3
      // 3f: ireturn
      // 40: iinc 3 1
      // 43: iload 2
      // 44: ifeq 06
      // 47: bipush -1
      // 48: ireturn
   }

   private void bbbb(class_310 param1) {
      // $VF: Couldn't be decompiled
      // Please report this to the Vineflower issue tracker, at https://github.com/Vineflower/vineflower/issues with a copy of the class file (if you have the rights to distribute it!)
      // java.lang.NullPointerException: Cannot invoke "org.jetbrains.java.decompiler.code.cfg.ExceptionRangeCFG.isCircular()" because "range" is null
      //   at org.jetbrains.java.decompiler.modules.decompiler.decompose.DomHelper.graphToStatement(DomHelper.java:84)
      //   at org.jetbrains.java.decompiler.modules.decompiler.decompose.DomHelper.parseGraph(DomHelper.java:203)
      //   at org.jetbrains.java.decompiler.main.rels.MethodProcessor.codeToJava(MethodProcessor.java:166)
      //
      // Bytecode:
      // 000: ldc_w 1993939771
      // 003: istore 9
      // 005: getstatic qeaa361f143ee4a0894bd168fd9b30c66/qf4ccf8f5435d4a78bdca4d6a018b578e/baaabbaa.bba I
      // 008: istore 2
      // 009: aload 0
      // 00a: iload 2
      // 00b: ifne 2bd
      // 00e: aload 1
      // 00f: invokevirtual qeaa361f143ee4a0894bd168fd9b30c66/qf4ccf8f5435d4a78bdca4d6a018b578e/aaabbbbba.abbb (Lnet/minecraft/class_310;)V
      // 012: aload 0
      // 013: getfield qeaa361f143ee4a0894bd168fd9b30c66/qf4ccf8f5435d4a78bdca4d6a018b578e/aaabbbbba.bbb Z
      // 016: ifeq 2bc
      // 019: goto 01d
      // 01c: athrow
      // 01d: aload 0
      // 01e: iload 2
      // 01f: ifne 17c
      // 022: goto 026
      // 025: athrow
      // 026: getfield qeaa361f143ee4a0894bd168fd9b30c66/qf4ccf8f5435d4a78bdca4d6a018b578e/aaabbbbba.aa Z
      // 029: ifeq 177
      // 02c: goto 030
      // 02f: athrow
      // 030: aload 0
      // 031: iload 2
      // 032: ifne 04b
      // 035: goto 039
      // 038: athrow
      // 039: getfield qeaa361f143ee4a0894bd168fd9b30c66/qf4ccf8f5435d4a78bdca4d6a018b578e/aaabbbbba.aaa Lnet/minecraft/class_2338;
      // 03c: ifnonnull 04a
      // 03f: goto 043
      // 042: athrow
      // 043: aload 0
      // 044: bipush 0
      // 045: putfield qeaa361f143ee4a0894bd168fd9b30c66/qf4ccf8f5435d4a78bdca4d6a018b578e/aaabbbbba.bbb Z
      // 048: return
      // 049: athrow
      // 04a: aload 0
      // 04b: aload 1
      // 04c: aload 0
      // 04d: getfield qeaa361f143ee4a0894bd168fd9b30c66/qf4ccf8f5435d4a78bdca4d6a018b578e/aaabbbbba.aaa Lnet/minecraft/class_2338;
      // 050: invokevirtual qeaa361f143ee4a0894bd168fd9b30c66/qf4ccf8f5435d4a78bdca4d6a018b578e/aaabbbbba.aaaba (Lnet/minecraft/class_310;Lnet/minecraft/class_2338;)Z
      // 053: istore 3
      // 054: iload 3
      // 055: ifeq 05d
      // 058: fconst_0
      // 059: goto 079
      // 05c: athrow
      // 05d: aload 0
      // 05e: getfield qeaa361f143ee4a0894bd168fd9b30c66/qf4ccf8f5435d4a78bdca4d6a018b578e/aaabbbbba.aab Lqeaa361f143ee4a0894bd168fd9b30c66/qf4ccf8f5435d4a78bdca4d6a018b578e/ababbbbba;
      // 061: aload 1
      // 062: aload 0
      // 063: getfield qeaa361f143ee4a0894bd168fd9b30c66/qf4ccf8f5435d4a78bdca4d6a018b578e/aaabbbbba.aaa Lnet/minecraft/class_2338;
      // 066: invokestatic net/minecraft/class_243.method_24953 (Lnet/minecraft/class_2382;)Lnet/minecraft/class_243;
      // 069: aload 0
      // 06a: getfield qeaa361f143ee4a0894bd168fd9b30c66/qf4ccf8f5435d4a78bdca4d6a018b578e/aaabbbbba.bab Lqeaa361f143ee4a0894bd168fd9b30c66/qf4ccf8f5435d4a78bdca4d6a018b578e/bababa;
      // 06d: invokevirtual qeaa361f143ee4a0894bd168fd9b30c66/qf4ccf8f5435d4a78bdca4d6a018b578e/bababa.abbb ()Ljava/lang/Object;
      // 070: checkcast java/lang/Double
      // 073: invokevirtual java/lang/Double.floatValue ()F
      // 076: invokevirtual qeaa361f143ee4a0894bd168fd9b30c66/qf4ccf8f5435d4a78bdca4d6a018b578e/ababbbbba.baaaa (Lnet/minecraft/class_310;Lnet/minecraft/class_243;F)F
      // 079: fstore 4
      // 07b: iload 2
      // 07c: ifne 0cf
      // 07f: iload 3
      // 080: ifne 0c6
      // 083: goto 087
      // 086: athrow
      // 087: fload 4
      // 089: ldc_w 0.5
      // 08c: fcmpg
      // 08d: iload 2
      // 08e: ifne 0d0
      // 091: goto 095
      // 094: athrow
      // 095: ifle 0c6
      // 098: goto 09c
      // 09b: athrow
      // 09c: invokestatic java/lang/System.currentTimeMillis ()J
      // 09f: aload 0
      // 0a0: getfield qeaa361f143ee4a0894bd168fd9b30c66/qf4ccf8f5435d4a78bdca4d6a018b578e/aaabbbbba.ab J
      // 0a3: lsub
      // 0a4: ldc_w 308654149
      // 0a7: iload 9
      // 0a9: ldc_w -1539600948
      // 0ac: ixor
      // 0ad: invokestatic qeaa361f143ee4a0894bd168fd9b30c66/qf4ccf8f5435d4a78bdca4d6a018b578e/aaabbbbba.a (II)I
      // 0b0: ldc2_w 6130881686895397926
      // 0b3: invokestatic qeaa361f143ee4a0894bd168fd9b30c66/qf4ccf8f5435d4a78bdca4d6a018b578e/aaabbbbba.aabbbb (IJ)J
      // 0b6: lcmp
      // 0b7: iload 2
      // 0b8: ifne 0d0
      // 0bb: goto 0bf
      // 0be: athrow
      // 0bf: iflt 173
      // 0c2: goto 0c6
      // 0c5: athrow
      // 0c6: aload 0
      // 0c7: bipush 0
      // 0c8: putfield qeaa361f143ee4a0894bd168fd9b30c66/qf4ccf8f5435d4a78bdca4d6a018b578e/aaabbbbba.bbb Z
      // 0cb: goto 0cf
      // 0ce: athrow
      // 0cf: iload 3
      // 0d0: iload 2
      // 0d1: ifne 0dc
      // 0d4: ifeq 0f5
      // 0d7: goto 0db
      // 0da: athrow
      // 0db: bipush 2
      // 0dc: newarray 6
      // 0de: dup
      // 0df: bipush 0
      // 0e0: aload 1
      // 0e1: getfield net/minecraft/class_310.field_1724 Lnet/minecraft/class_746;
      // 0e4: invokevirtual net/minecraft/class_746.method_36454 ()F
      // 0e7: fastore
      // 0e8: dup
      // 0e9: bipush 1
      // 0ea: aload 1
      // 0eb: getfield net/minecraft/class_310.field_1724 Lnet/minecraft/class_746;
      // 0ee: invokevirtual net/minecraft/class_746.method_36455 ()F
      // 0f1: fastore
      // 0f2: goto 100
      // 0f5: aload 1
      // 0f6: aload 0
      // 0f7: getfield qeaa361f143ee4a0894bd168fd9b30c66/qf4ccf8f5435d4a78bdca4d6a018b578e/aaabbbbba.aaa Lnet/minecraft/class_2338;
      // 0fa: invokestatic net/minecraft/class_243.method_24953 (Lnet/minecraft/class_2382;)Lnet/minecraft/class_243;
      // 0fd: invokestatic qeaa361f143ee4a0894bd168fd9b30c66/qf4ccf8f5435d4a78bdca4d6a018b578e/bbabbbb.babaab (Lnet/minecraft/class_310;Lnet/minecraft/class_243;)[F
      // 100: astore 5
      // 102: iload 2
      // 103: bipush 0
      // 104: istore 6
      // 106: ifne 128
      // 109: aload 5
      // 10b: ifnull 14f
      // 10e: goto 112
      // 111: athrow
      // 112: aload 0
      // 113: bipush 1
      // 114: putfield qeaa361f143ee4a0894bd168fd9b30c66/qf4ccf8f5435d4a78bdca4d6a018b578e/aaabbbbba.aaaa Z
      // 117: aload 0
      // 118: aload 1
      // 119: getfield net/minecraft/class_310.field_1724 Lnet/minecraft/class_746;
      // 11c: getfield net/minecraft/class_746.field_6012 I
      // 11f: bipush 2
      // 120: iadd
      // 121: putfield qeaa361f143ee4a0894bd168fd9b30c66/qf4ccf8f5435d4a78bdca4d6a018b578e/aaabbbbba.abba I
      // 124: goto 128
      // 127: athrow
      // 128: aload 1
      // 129: ldc_w 308654150
      // 12c: iload 9
      // 12e: ldc_w 595011154
      // 131: ixor
      // 132: invokestatic qeaa361f143ee4a0894bd168fd9b30c66/qf4ccf8f5435d4a78bdca4d6a018b578e/aaabbbbba.a (II)I
      // 135: ldc2_w 5032345564490509807
      // 138: invokestatic qeaa361f143ee4a0894bd168fd9b30c66/qf4ccf8f5435d4a78bdca4d6a018b578e/aaabbbbba.baaa (IJ)I
      // 13b: aload 5
      // 13d: bipush 0
      // 13e: faload
      // 13f: aload 5
      // 141: bipush 1
      // 142: faload
      // 143: aload 0
      // 144: aload 1
      // 145: invokedynamic run (Lqeaa361f143ee4a0894bd168fd9b30c66/qf4ccf8f5435d4a78bdca4d6a018b578e/aaabbbbba;Lnet/minecraft/class_310;)Lqeaa361f143ee4a0894bd168fd9b30c66/qf4ccf8f5435d4a78bdca4d6a018b578e/aabbaabbb; bsm=java/lang/invoke/LambdaMetafactory.metafactory (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;Ljava/lang/invoke/MethodType;Ljava/lang/invoke/MethodHandle;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[ ()Z, qeaa361f143ee4a0894bd168fd9b30c66/qf4ccf8f5435d4a78bdca4d6a018b578e/aaabbbbba.babbb (Lnet/minecraft/class_310;)Z, ()Z ]
      // 14a: invokestatic qeaa361f143ee4a0894bd168fd9b30c66/qf4ccf8f5435d4a78bdca4d6a018b578e/bbabbbb.ba (Lnet/minecraft/class_310;IFFLqeaa361f143ee4a0894bd168fd9b30c66/qf4ccf8f5435d4a78bdca4d6a018b578e/aabbaabbb;)Z
      // 14d: istore 6
      // 14f: iload 6
      // 151: ifne 173
      // 154: aload 0
      // 155: bipush 0
      // 156: putfield qeaa361f143ee4a0894bd168fd9b30c66/qf4ccf8f5435d4a78bdca4d6a018b578e/aaabbbbba.aaaa Z
      // 159: aload 0
      // 15a: ldc_w 308654151
      // 15d: iload 9
      // 15f: ldc_w 1962610009
      // 162: ixor
      // 163: invokestatic qeaa361f143ee4a0894bd168fd9b30c66/qf4ccf8f5435d4a78bdca4d6a018b578e/aaabbbbba.a (II)I
      // 166: ldc2_w 1848905881191263389
      // 169: invokestatic qeaa361f143ee4a0894bd168fd9b30c66/qf4ccf8f5435d4a78bdca4d6a018b578e/aaabbbbba.baaa (IJ)I
      // 16c: putfield qeaa361f143ee4a0894bd168fd9b30c66/qf4ccf8f5435d4a78bdca4d6a018b578e/aaabbbbba.abba I
      // 16f: goto 173
      // 172: athrow
      // 173: iload 2
      // 174: ifeq 2bb
      // 177: aload 0
      // 178: goto 17c
      // 17b: athrow
      // 17c: iload 2
      // 17d: ifne 192
      // 180: getfield qeaa361f143ee4a0894bd168fd9b30c66/qf4ccf8f5435d4a78bdca4d6a018b578e/aaabbbbba.baab Lqeaa361f143ee4a0894bd168fd9b30c66/qf4ccf8f5435d4a78bdca4d6a018b578e/abbabbbbb;
      // 183: ifnonnull 191
      // 186: goto 18a
      // 189: athrow
      // 18a: aload 0
      // 18b: bipush 0
      // 18c: putfield qeaa361f143ee4a0894bd168fd9b30c66/qf4ccf8f5435d4a78bdca4d6a018b578e/aaabbbbba.bbb Z
      // 18f: return
      // 190: athrow
      // 191: aload 0
      // 192: aload 1
      // 193: aload 0
      // 194: getfield qeaa361f143ee4a0894bd168fd9b30c66/qf4ccf8f5435d4a78bdca4d6a018b578e/aaabbbbba.baab Lqeaa361f143ee4a0894bd168fd9b30c66/qf4ccf8f5435d4a78bdca4d6a018b578e/abbabbbbb;
      // 197: invokevirtual qeaa361f143ee4a0894bd168fd9b30c66/qf4ccf8f5435d4a78bdca4d6a018b578e/aaabbbbba.aabba (Lnet/minecraft/class_310;Lqeaa361f143ee4a0894bd168fd9b30c66/qf4ccf8f5435d4a78bdca4d6a018b578e/abbabbbbb;)Z
      // 19a: istore 3
      // 19b: iload 3
      // 19c: ifeq 1a4
      // 19f: fconst_0
      // 1a0: goto 1c1
      // 1a3: athrow
      // 1a4: aload 0
      // 1a5: getfield qeaa361f143ee4a0894bd168fd9b30c66/qf4ccf8f5435d4a78bdca4d6a018b578e/aaabbbbba.aab Lqeaa361f143ee4a0894bd168fd9b30c66/qf4ccf8f5435d4a78bdca4d6a018b578e/ababbbbba;
      // 1a8: aload 1
      // 1a9: aload 0
      // 1aa: aload 0
      // 1ab: getfield qeaa361f143ee4a0894bd168fd9b30c66/qf4ccf8f5435d4a78bdca4d6a018b578e/aaabbbbba.baab Lqeaa361f143ee4a0894bd168fd9b30c66/qf4ccf8f5435d4a78bdca4d6a018b578e/abbabbbbb;
      // 1ae: invokevirtual qeaa361f143ee4a0894bd168fd9b30c66/qf4ccf8f5435d4a78bdca4d6a018b578e/aaabbbbba.aabab (Lqeaa361f143ee4a0894bd168fd9b30c66/qf4ccf8f5435d4a78bdca4d6a018b578e/abbabbbbb;)Lnet/minecraft/class_3965;
      // 1b1: aload 0
      // 1b2: getfield qeaa361f143ee4a0894bd168fd9b30c66/qf4ccf8f5435d4a78bdca4d6a018b578e/aaabbbbba.bab Lqeaa361f143ee4a0894bd168fd9b30c66/qf4ccf8f5435d4a78bdca4d6a018b578e/bababa;
      // 1b5: invokevirtual qeaa361f143ee4a0894bd168fd9b30c66/qf4ccf8f5435d4a78bdca4d6a018b578e/bababa.abbb ()Ljava/lang/Object;
      // 1b8: checkcast java/lang/Double
      // 1bb: invokevirtual java/lang/Double.floatValue ()F
      // 1be: invokevirtual qeaa361f143ee4a0894bd168fd9b30c66/qf4ccf8f5435d4a78bdca4d6a018b578e/ababbbbba.bbaba (Lnet/minecraft/class_310;Lnet/minecraft/class_3965;F)F
      // 1c1: fstore 4
      // 1c3: iload 2
      // 1c4: ifne 217
      // 1c7: iload 3
      // 1c8: ifne 20e
      // 1cb: goto 1cf
      // 1ce: athrow
      // 1cf: fload 4
      // 1d1: ldc_w 0.5
      // 1d4: fcmpg
      // 1d5: iload 2
      // 1d6: ifne 218
      // 1d9: goto 1dd
      // 1dc: athrow
      // 1dd: ifle 20e
      // 1e0: goto 1e4
      // 1e3: athrow
      // 1e4: invokestatic java/lang/System.currentTimeMillis ()J
      // 1e7: aload 0
      // 1e8: getfield qeaa361f143ee4a0894bd168fd9b30c66/qf4ccf8f5435d4a78bdca4d6a018b578e/aaabbbbba.ab J
      // 1eb: lsub
      // 1ec: ldc_w 308654168
      // 1ef: iload 9
      // 1f1: ldc_w 887960103
      // 1f4: ixor
      // 1f5: invokestatic qeaa361f143ee4a0894bd168fd9b30c66/qf4ccf8f5435d4a78bdca4d6a018b578e/aaabbbbba.a (II)I
      // 1f8: ldc2_w 5177655465071539956
      // 1fb: invokestatic qeaa361f143ee4a0894bd168fd9b30c66/qf4ccf8f5435d4a78bdca4d6a018b578e/aaabbbbba.aabbbb (IJ)J
      // 1fe: lcmp
      // 1ff: iload 2
      // 200: ifne 218
      // 203: goto 207
      // 206: athrow
      // 207: iflt 2bb
      // 20a: goto 20e
      // 20d: athrow
      // 20e: aload 0
      // 20f: bipush 0
      // 210: putfield qeaa361f143ee4a0894bd168fd9b30c66/qf4ccf8f5435d4a78bdca4d6a018b578e/aaabbbbba.bbb Z
      // 213: goto 217
      // 216: athrow
      // 217: iload 3
      // 218: iload 2
      // 219: ifne 224
      // 21c: ifeq 23d
      // 21f: goto 223
      // 222: athrow
      // 223: bipush 2
      // 224: newarray 6
      // 226: dup
      // 227: bipush 0
      // 228: aload 1
      // 229: getfield net/minecraft/class_310.field_1724 Lnet/minecraft/class_746;
      // 22c: invokevirtual net/minecraft/class_746.method_36454 ()F
      // 22f: fastore
      // 230: dup
      // 231: bipush 1
      // 232: aload 1
      // 233: getfield net/minecraft/class_310.field_1724 Lnet/minecraft/class_746;
      // 236: invokevirtual net/minecraft/class_746.method_36455 ()F
      // 239: fastore
      // 23a: goto 248
      // 23d: aload 1
      // 23e: aload 0
      // 23f: getfield qeaa361f143ee4a0894bd168fd9b30c66/qf4ccf8f5435d4a78bdca4d6a018b578e/aaabbbbba.baab Lqeaa361f143ee4a0894bd168fd9b30c66/qf4ccf8f5435d4a78bdca4d6a018b578e/abbabbbbb;
      // 242: invokevirtual qeaa361f143ee4a0894bd168fd9b30c66/qf4ccf8f5435d4a78bdca4d6a018b578e/abbabbbbb.aa ()Lnet/minecraft/class_243;
      // 245: invokestatic qeaa361f143ee4a0894bd168fd9b30c66/qf4ccf8f5435d4a78bdca4d6a018b578e/bbabbbb.babaab (Lnet/minecraft/class_310;Lnet/minecraft/class_243;)[F
      // 248: astore 5
      // 24a: iload 2
      // 24b: bipush 0
      // 24c: istore 6
      // 24e: ifne 270
      // 251: aload 5
      // 253: ifnull 297
      // 256: goto 25a
      // 259: athrow
      // 25a: aload 0
      // 25b: bipush 1
      // 25c: putfield qeaa361f143ee4a0894bd168fd9b30c66/qf4ccf8f5435d4a78bdca4d6a018b578e/aaabbbbba.aaba Z
      // 25f: aload 0
      // 260: aload 1
      // 261: getfield net/minecraft/class_310.field_1724 Lnet/minecraft/class_746;
      // 264: getfield net/minecraft/class_746.field_6012 I
      // 267: bipush 2
      // 268: iadd
      // 269: putfield qeaa361f143ee4a0894bd168fd9b30c66/qf4ccf8f5435d4a78bdca4d6a018b578e/aaabbbbba.aaabb I
      // 26c: goto 270
      // 26f: athrow
      // 270: aload 1
      // 271: ldc_w 308654169
      // 274: iload 9
      // 276: ldc_w -680826347
      // 279: ixor
      // 27a: invokestatic qeaa361f143ee4a0894bd168fd9b30c66/qf4ccf8f5435d4a78bdca4d6a018b578e/aaabbbbba.a (II)I
      // 27d: ldc2_w 5032345564490509807
      // 280: invokestatic qeaa361f143ee4a0894bd168fd9b30c66/qf4ccf8f5435d4a78bdca4d6a018b578e/aaabbbbba.baaa (IJ)I
      // 283: aload 5
      // 285: bipush 0
      // 286: faload
      // 287: aload 5
      // 289: bipush 1
      // 28a: faload
      // 28b: aload 0
      // 28c: aload 1
      // 28d: invokedynamic run (Lqeaa361f143ee4a0894bd168fd9b30c66/qf4ccf8f5435d4a78bdca4d6a018b578e/aaabbbbba;Lnet/minecraft/class_310;)Lqeaa361f143ee4a0894bd168fd9b30c66/qf4ccf8f5435d4a78bdca4d6a018b578e/aabbaabbb; bsm=java/lang/invoke/LambdaMetafactory.metafactory (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;Ljava/lang/invoke/MethodType;Ljava/lang/invoke/MethodHandle;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[ ()Z, qeaa361f143ee4a0894bd168fd9b30c66/qf4ccf8f5435d4a78bdca4d6a018b578e/aaabbbbba.aaabba (Lnet/minecraft/class_310;)Z, ()Z ]
      // 292: invokestatic qeaa361f143ee4a0894bd168fd9b30c66/qf4ccf8f5435d4a78bdca4d6a018b578e/bbabbbb.ba (Lnet/minecraft/class_310;IFFLqeaa361f143ee4a0894bd168fd9b30c66/qf4ccf8f5435d4a78bdca4d6a018b578e/aabbaabbb;)Z
      // 295: istore 6
      // 297: iload 6
      // 299: ifne 2bb
      // 29c: aload 0
      // 29d: bipush 0
      // 29e: putfield qeaa361f143ee4a0894bd168fd9b30c66/qf4ccf8f5435d4a78bdca4d6a018b578e/aaabbbbba.aaba Z
      // 2a1: aload 0
      // 2a2: ldc_w 308654170
      // 2a5: iload 9
      // 2a7: ldc_w -1563601322
      // 2aa: ixor
      // 2ab: invokestatic qeaa361f143ee4a0894bd168fd9b30c66/qf4ccf8f5435d4a78bdca4d6a018b578e/aaabbbbba.a (II)I
      // 2ae: ldc2_w 1848905881191263389
      // 2b1: invokestatic qeaa361f143ee4a0894bd168fd9b30c66/qf4ccf8f5435d4a78bdca4d6a018b578e/aaabbbbba.baaa (IJ)I
      // 2b4: putfield qeaa361f143ee4a0894bd168fd9b30c66/qf4ccf8f5435d4a78bdca4d6a018b578e/aaabbbbba.aaabb I
      // 2b7: goto 2bb
      // 2ba: athrow
      // 2bb: return
      // 2bc: aload 0
      // 2bd: iload 2
      // 2be: ifne 2d0
      // 2c1: getfield qeaa361f143ee4a0894bd168fd9b30c66/qf4ccf8f5435d4a78bdca4d6a018b578e/aaabbbbba.aaba Z
      // 2c4: ifne 2de
      // 2c7: goto 2cb
      // 2ca: athrow
      // 2cb: aload 0
      // 2cc: goto 2d0
      // 2cf: athrow
      // 2d0: iload 2
      // 2d1: ifne 2e1
      // 2d4: getfield qeaa361f143ee4a0894bd168fd9b30c66/qf4ccf8f5435d4a78bdca4d6a018b578e/aaabbbbba.aaaa Z
      // 2d7: ifeq 2e0
      // 2da: goto 2de
      // 2dd: athrow
      // 2de: return
      // 2df: athrow
      // 2e0: aload 0
      // 2e1: iload 2
      // 2e2: ifne 341
      // 2e5: getfield qeaa361f143ee4a0894bd168fd9b30c66/qf4ccf8f5435d4a78bdca4d6a018b578e/aaabbbbba.baaa Lnet/minecraft/class_2338;
      // 2e8: ifnull 340
      // 2eb: goto 2ef
      // 2ee: athrow
      // 2ef: aload 1
      // 2f0: getfield net/minecraft/class_310.field_1687 Lnet/minecraft/class_638;
      // 2f3: aload 0
      // 2f4: getfield qeaa361f143ee4a0894bd168fd9b30c66/qf4ccf8f5435d4a78bdca4d6a018b578e/aaabbbbba.baaa Lnet/minecraft/class_2338;
      // 2f7: invokevirtual net/minecraft/class_638.method_8320 (Lnet/minecraft/class_2338;)Lnet/minecraft/class_2680;
      // 2fa: getstatic net/minecraft/class_2246.field_10443 Lnet/minecraft/class_2248;
      // 2fd: invokevirtual net/minecraft/class_2680.method_27852 (Lnet/minecraft/class_2248;)Z
      // 300: iload 2
      // 301: ifne 323
      // 304: goto 308
      // 307: athrow
      // 308: ifeq 331
      // 30b: goto 30f
      // 30e: athrow
      // 30f: aload 0
      // 310: iload 2
      // 311: ifne 328
      // 314: goto 318
      // 317: athrow
      // 318: aload 0
      // 319: getfield qeaa361f143ee4a0894bd168fd9b30c66/qf4ccf8f5435d4a78bdca4d6a018b578e/aaabbbbba.baaa Lnet/minecraft/class_2338;
      // 31c: invokevirtual qeaa361f143ee4a0894bd168fd9b30c66/qf4ccf8f5435d4a78bdca4d6a018b578e/aaabbbbba.babba (Lnet/minecraft/class_2338;)Z
      // 31f: goto 323
      // 322: athrow
      // 323: ifne 327
      // 326: return
      // 327: aload 0
      // 328: aload 1
      // 329: aload 0
      // 32a: getfield qeaa361f143ee4a0894bd168fd9b30c66/qf4ccf8f5435d4a78bdca4d6a018b578e/aaabbbbba.baaa Lnet/minecraft/class_2338;
      // 32d: invokevirtual qeaa361f143ee4a0894bd168fd9b30c66/qf4ccf8f5435d4a78bdca4d6a018b578e/aaabbbbba.aa (Lnet/minecraft/class_310;Lnet/minecraft/class_2338;)V
      // 330: return
      // 331: aload 0
      // 332: aconst_null
      // 333: putfield qeaa361f143ee4a0894bd168fd9b30c66/qf4ccf8f5435d4a78bdca4d6a018b578e/aaabbbbba.baaa Lnet/minecraft/class_2338;
      // 336: aload 0
      // 337: aconst_null
      // 338: putfield qeaa361f143ee4a0894bd168fd9b30c66/qf4ccf8f5435d4a78bdca4d6a018b578e/aaabbbbba.abbba Lnet/minecraft/class_2338;
      // 33b: aload 0
      // 33c: lconst_0
      // 33d: putfield qeaa361f143ee4a0894bd168fd9b30c66/qf4ccf8f5435d4a78bdca4d6a018b578e/aaabbbbba.baaab J
      // 340: aload 0
      // 341: aload 1
      // 342: invokevirtual qeaa361f143ee4a0894bd168fd9b30c66/qf4ccf8f5435d4a78bdca4d6a018b578e/aaabbbbba.baab (Lnet/minecraft/class_310;)Lnet/minecraft/class_2338;
      // 345: astore 3
      // 346: aload 3
      // 347: iload 2
      // 348: ifne 383
      // 34b: ifnull 374
      // 34e: goto 352
      // 351: athrow
      // 352: aload 0
      // 353: aload 3
      // 354: putfield qeaa361f143ee4a0894bd168fd9b30c66/qf4ccf8f5435d4a78bdca4d6a018b578e/aaabbbbba.baaa Lnet/minecraft/class_2338;
      // 357: iload 2
      // 358: ifne 373
      // 35b: goto 35f
      // 35e: athrow
      // 35f: aload 0
      // 360: aload 3
      // 361: invokevirtual qeaa361f143ee4a0894bd168fd9b30c66/qf4ccf8f5435d4a78bdca4d6a018b578e/aaabbbbba.babba (Lnet/minecraft/class_2338;)Z
      // 364: ifne 36d
      // 367: goto 36b
      // 36a: athrow
      // 36b: return
      // 36c: athrow
      // 36d: aload 0
      // 36e: aload 1
      // 36f: aload 3
      // 370: invokevirtual qeaa361f143ee4a0894bd168fd9b30c66/qf4ccf8f5435d4a78bdca4d6a018b578e/aaabbbbba.aa (Lnet/minecraft/class_310;Lnet/minecraft/class_2338;)V
      // 373: return
      // 374: aload 0
      // 375: iload 2
      // 376: ifne 38f
      // 379: getfield qeaa361f143ee4a0894bd168fd9b30c66/qf4ccf8f5435d4a78bdca4d6a018b578e/aaabbbbba.abbb Lqeaa361f143ee4a0894bd168fd9b30c66/qf4ccf8f5435d4a78bdca4d6a018b578e/abbaaaaa;
      // 37c: invokevirtual qeaa361f143ee4a0894bd168fd9b30c66/qf4ccf8f5435d4a78bdca4d6a018b578e/abbaaaaa.abbb ()Ljava/lang/Object;
      // 37f: goto 383
      // 382: athrow
      // 383: checkcast java/lang/Boolean
      // 386: invokevirtual java/lang/Boolean.booleanValue ()Z
      // 389: ifne 38e
      // 38c: return
      // 38d: athrow
      // 38e: aload 0
      // 38f: aload 1
      // 390: getfield net/minecraft/class_310.field_1724 Lnet/minecraft/class_746;
      // 393: invokevirtual qeaa361f143ee4a0894bd168fd9b30c66/qf4ccf8f5435d4a78bdca4d6a018b578e/aaabbbbba.bbba (Lnet/minecraft/class_746;)I
      // 396: istore 4
      // 398: aload 0
      // 399: aload 1
      // 39a: invokevirtual qeaa361f143ee4a0894bd168fd9b30c66/qf4ccf8f5435d4a78bdca4d6a018b578e/aaabbbbba.aabbaa (Lnet/minecraft/class_310;)Lqeaa361f143ee4a0894bd168fd9b30c66/qf4ccf8f5435d4a78bdca4d6a018b578e/abbabbbbb;
      // 39d: astore 5
      // 39f: iload 4
      // 3a1: iflt 3ad
      // 3a4: aload 5
      // 3a6: ifnonnull 3af
      // 3a9: goto 3ad
      // 3ac: athrow
      // 3ad: return
      // 3ae: athrow
      // 3af: aload 0
      // 3b0: iload 2
      // 3b1: ifne 3c3
      // 3b4: getfield qeaa361f143ee4a0894bd168fd9b30c66/qf4ccf8f5435d4a78bdca4d6a018b578e/aaabbbbba.baba Lqeaa361f143ee4a0894bd168fd9b30c66/qf4ccf8f5435d4a78bdca4d6a018b578e/bbbbaaaa;
      // 3b7: ifnull 3e2
      // 3ba: goto 3be
      // 3bd: athrow
      // 3be: aload 0
      // 3bf: goto 3c3
      // 3c2: athrow
      // 3c3: iload 2
      // 3c4: ifne 3d9
      // 3c7: getfield qeaa361f143ee4a0894bd168fd9b30c66/qf4ccf8f5435d4a78bdca4d6a018b578e/aaabbbbba.baba Lqeaa361f143ee4a0894bd168fd9b30c66/qf4ccf8f5435d4a78bdca4d6a018b578e/bbbbaaaa;
      // 3ca: invokevirtual qeaa361f143ee4a0894bd168fd9b30c66/qf4ccf8f5435d4a78bdca4d6a018b578e/bbbbaaaa.b ()Z
      // 3cd: ifeq 3e2
      // 3d0: goto 3d4
      // 3d3: athrow
      // 3d4: aload 0
      // 3d5: goto 3d9
      // 3d8: athrow
      // 3d9: getfield qeaa361f143ee4a0894bd168fd9b30c66/qf4ccf8f5435d4a78bdca4d6a018b578e/aaabbbbba.baba Lqeaa361f143ee4a0894bd168fd9b30c66/qf4ccf8f5435d4a78bdca4d6a018b578e/bbbbaaaa;
      // 3dc: invokevirtual qeaa361f143ee4a0894bd168fd9b30c66/qf4ccf8f5435d4a78bdca4d6a018b578e/bbbbaaaa.aab ()I
      // 3df: goto 3ec
      // 3e2: aload 1
      // 3e3: getfield net/minecraft/class_310.field_1724 Lnet/minecraft/class_746;
      // 3e6: invokevirtual net/minecraft/class_746.method_31548 ()Lnet/minecraft/class_1661;
      // 3e9: invokestatic qeaa361f143ee4a0894bd168fd9b30c66/qf4ccf8f5435d4a78bdca4d6a018b578e/aabbabbbb.abaabaa (Lnet/minecraft/class_1661;)I
      // 3ec: istore 6
      // 3ee: aload 0
      // 3ef: iload 2
      // 3f0: ifne 403
      // 3f3: aload 1
      // 3f4: iload 4
      // 3f6: invokevirtual qeaa361f143ee4a0894bd168fd9b30c66/qf4ccf8f5435d4a78bdca4d6a018b578e/aaabbbbba.ba (Lnet/minecraft/class_310;I)Z
      // 3f9: ifne 402
      // 3fc: goto 400
      // 3ff: athrow
      // 400: return
      // 401: athrow
      // 402: aload 0
      // 403: aload 5
      // 405: invokevirtual qeaa361f143ee4a0894bd168fd9b30c66/qf4ccf8f5435d4a78bdca4d6a018b578e/abbabbbbb.ab ()Lnet/minecraft/class_2338;
      // 408: invokevirtual qeaa361f143ee4a0894bd168fd9b30c66/qf4ccf8f5435d4a78bdca4d6a018b578e/aaabbbbba.babba (Lnet/minecraft/class_2338;)Z
      // 40b: ifne 410
      // 40e: return
      // 40f: athrow
      // 410: aload 1
      // 411: aload 5
      // 413: invokevirtual qeaa361f143ee4a0894bd168fd9b30c66/qf4ccf8f5435d4a78bdca4d6a018b578e/abbabbbbb.aa ()Lnet/minecraft/class_243;
      // 416: invokestatic qeaa361f143ee4a0894bd168fd9b30c66/qf4ccf8f5435d4a78bdca4d6a018b578e/bbabbbb.babaab (Lnet/minecraft/class_310;Lnet/minecraft/class_243;)[F
      // 419: astore 7
      // 41b: aload 7
      // 41d: iload 2
      // 41e: ifne 440
      // 421: ifnonnull 431
      // 424: goto 428
      // 427: athrow
      // 428: aload 0
      // 429: aload 1
      // 42a: iload 6
      // 42c: invokevirtual qeaa361f143ee4a0894bd168fd9b30c66/qf4ccf8f5435d4a78bdca4d6a018b578e/aaabbbbba.aaaaab (Lnet/minecraft/class_310;I)V
      // 42f: return
      // 430: athrow
      // 431: aload 0
      // 432: getfield qeaa361f143ee4a0894bd168fd9b30c66/qf4ccf8f5435d4a78bdca4d6a018b578e/aaabbbbba.babb Lqeaa361f143ee4a0894bd168fd9b30c66/qf4ccf8f5435d4a78bdca4d6a018b578e/baabaab;
      // 435: iload 2
      // 436: ifne 49a
      // 439: invokevirtual qeaa361f143ee4a0894bd168fd9b30c66/qf4ccf8f5435d4a78bdca4d6a018b578e/baabaab.abbb ()Ljava/lang/Object;
      // 43c: goto 440
      // 43f: athrow
      // 440: getstatic qeaa361f143ee4a0894bd168fd9b30c66/qf4ccf8f5435d4a78bdca4d6a018b578e/aabaaaba.a Lqeaa361f143ee4a0894bd168fd9b30c66/qf4ccf8f5435d4a78bdca4d6a018b578e/aabaaaba;
      // 443: if_acmpne 487
      // 446: aload 0
      // 447: bipush 1
      // 448: putfield qeaa361f143ee4a0894bd168fd9b30c66/qf4ccf8f5435d4a78bdca4d6a018b578e/aaabbbbba.aaba Z
      // 44b: iload 2
      // 44c: aload 0
      // 44d: aload 1
      // 44e: getfield net/minecraft/class_310.field_1724 Lnet/minecraft/class_746;
      // 451: getfield net/minecraft/class_746.field_6012 I
      // 454: bipush 2
      // 455: iadd
      // 456: putfield qeaa361f143ee4a0894bd168fd9b30c66/qf4ccf8f5435d4a78bdca4d6a018b578e/aaabbbbba.aaabb I
      // 459: aload 1
      // 45a: ldc_w 308654171
      // 45d: iload 9
      // 45f: ldc_w 1243498597
      // 462: ixor
      // 463: invokestatic qeaa361f143ee4a0894bd168fd9b30c66/qf4ccf8f5435d4a78bdca4d6a018b578e/aaabbbbba.a (II)I
      // 466: ldc2_w 5032345564490509807
      // 469: invokestatic qeaa361f143ee4a0894bd168fd9b30c66/qf4ccf8f5435d4a78bdca4d6a018b578e/aaabbbbba.baaa (IJ)I
      // 46c: aload 7
      // 46e: bipush 0
      // 46f: faload
      // 470: aload 7
      // 472: bipush 1
      // 473: faload
      // 474: aload 0
      // 475: aload 1
      // 476: aload 5
      // 478: iload 6
      // 47a: invokedynamic run (Lqeaa361f143ee4a0894bd168fd9b30c66/qf4ccf8f5435d4a78bdca4d6a018b578e/aaabbbbba;Lnet/minecraft/class_310;Lqeaa361f143ee4a0894bd168fd9b30c66/qf4ccf8f5435d4a78bdca4d6a018b578e/abbabbbbb;I)Lqeaa361f143ee4a0894bd168fd9b30c66/qf4ccf8f5435d4a78bdca4d6a018b578e/aabbaabbb; bsm=java/lang/invoke/LambdaMetafactory.metafactory (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;Ljava/lang/invoke/MethodType;Ljava/lang/invoke/MethodHandle;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[ ()Z, qeaa361f143ee4a0894bd168fd9b30c66/qf4ccf8f5435d4a78bdca4d6a018b578e/aaabbbbba.baaab (Lnet/minecraft/class_310;Lqeaa361f143ee4a0894bd168fd9b30c66/qf4ccf8f5435d4a78bdca4d6a018b578e/abbabbbbb;I)Z, ()Z ]
      // 47f: invokestatic qeaa361f143ee4a0894bd168fd9b30c66/qf4ccf8f5435d4a78bdca4d6a018b578e/bbabbbb.ba (Lnet/minecraft/class_310;IFFLqeaa361f143ee4a0894bd168fd9b30c66/qf4ccf8f5435d4a78bdca4d6a018b578e/aabbaabbb;)Z
      // 482: istore 8
      // 484: ifeq 505
      // 487: aload 0
      // 488: iload 2
      // 489: ifne 4ce
      // 48c: goto 490
      // 48f: athrow
      // 490: getfield qeaa361f143ee4a0894bd168fd9b30c66/qf4ccf8f5435d4a78bdca4d6a018b578e/aaabbbbba.babb Lqeaa361f143ee4a0894bd168fd9b30c66/qf4ccf8f5435d4a78bdca4d6a018b578e/baabaab;
      // 493: invokevirtual qeaa361f143ee4a0894bd168fd9b30c66/qf4ccf8f5435d4a78bdca4d6a018b578e/baabaab.abbb ()Ljava/lang/Object;
      // 496: goto 49a
      // 499: athrow
      // 49a: getstatic qeaa361f143ee4a0894bd168fd9b30c66/qf4ccf8f5435d4a78bdca4d6a018b578e/aabaaaba.ab Lqeaa361f143ee4a0894bd168fd9b30c66/qf4ccf8f5435d4a78bdca4d6a018b578e/aabaaaba;
      // 49d: if_acmpne 4c4
      // 4a0: aload 0
      // 4a1: aload 5
      // 4a3: putfield qeaa361f143ee4a0894bd168fd9b30c66/qf4ccf8f5435d4a78bdca4d6a018b578e/aaabbbbba.baab Lqeaa361f143ee4a0894bd168fd9b30c66/qf4ccf8f5435d4a78bdca4d6a018b578e/abbabbbbb;
      // 4a6: iload 2
      // 4a7: aload 0
      // 4a8: iload 6
      // 4aa: putfield qeaa361f143ee4a0894bd168fd9b30c66/qf4ccf8f5435d4a78bdca4d6a018b578e/aaabbbbba.aabab I
      // 4ad: aload 0
      // 4ae: bipush 0
      // 4af: putfield qeaa361f143ee4a0894bd168fd9b30c66/qf4ccf8f5435d4a78bdca4d6a018b578e/aaabbbbba.aa Z
      // 4b2: aload 0
      // 4b3: bipush 1
      // 4b4: putfield qeaa361f143ee4a0894bd168fd9b30c66/qf4ccf8f5435d4a78bdca4d6a018b578e/aaabbbbba.bbb Z
      // 4b7: aload 0
      // 4b8: invokestatic java/lang/System.currentTimeMillis ()J
      // 4bb: putfield qeaa361f143ee4a0894bd168fd9b30c66/qf4ccf8f5435d4a78bdca4d6a018b578e/aaabbbbba.ab J
      // 4be: bipush 1
      // 4bf: istore 8
      // 4c1: ifeq 505
      // 4c4: aload 0
      // 4c5: bipush 1
      // 4c6: putfield qeaa361f143ee4a0894bd168fd9b30c66/qf4ccf8f5435d4a78bdca4d6a018b578e/aaabbbbba.aaba Z
      // 4c9: aload 0
      // 4ca: goto 4ce
      // 4cd: athrow
      // 4ce: aload 1
      // 4cf: getfield net/minecraft/class_310.field_1724 Lnet/minecraft/class_746;
      // 4d2: getfield net/minecraft/class_746.field_6012 I
      // 4d5: bipush 2
      // 4d6: iadd
      // 4d7: putfield qeaa361f143ee4a0894bd168fd9b30c66/qf4ccf8f5435d4a78bdca4d6a018b578e/aaabbbbba.aaabb I
      // 4da: aload 1
      // 4db: ldc_w 308654172
      // 4de: iload 9
      // 4e0: ldc_w 1786304000
      // 4e3: ixor
      // 4e4: invokestatic qeaa361f143ee4a0894bd168fd9b30c66/qf4ccf8f5435d4a78bdca4d6a018b578e/aaabbbbba.a (II)I
      // 4e7: ldc2_w 5032345564490509807
      // 4ea: invokestatic qeaa361f143ee4a0894bd168fd9b30c66/qf4ccf8f5435d4a78bdca4d6a018b578e/aaabbbbba.baaa (IJ)I
      // 4ed: aload 7
      // 4ef: bipush 0
      // 4f0: faload
      // 4f1: aload 7
      // 4f3: bipush 1
      // 4f4: faload
      // 4f5: aload 0
      // 4f6: aload 1
      // 4f7: aload 5
      // 4f9: iload 6
      // 4fb: invokedynamic run (Lqeaa361f143ee4a0894bd168fd9b30c66/qf4ccf8f5435d4a78bdca4d6a018b578e/aaabbbbba;Lnet/minecraft/class_310;Lqeaa361f143ee4a0894bd168fd9b30c66/qf4ccf8f5435d4a78bdca4d6a018b578e/abbabbbbb;I)Lqeaa361f143ee4a0894bd168fd9b30c66/qf4ccf8f5435d4a78bdca4d6a018b578e/aabbaabbb; bsm=java/lang/invoke/LambdaMetafactory.metafactory (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;Ljava/lang/invoke/MethodType;Ljava/lang/invoke/MethodHandle;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[ ()Z, qeaa361f143ee4a0894bd168fd9b30c66/qf4ccf8f5435d4a78bdca4d6a018b578e/aaabbbbba.babaa (Lnet/minecraft/class_310;Lqeaa361f143ee4a0894bd168fd9b30c66/qf4ccf8f5435d4a78bdca4d6a018b578e/abbabbbbb;I)Z, ()Z ]
      // 500: invokestatic qeaa361f143ee4a0894bd168fd9b30c66/qf4ccf8f5435d4a78bdca4d6a018b578e/bbabbbb.ba (Lnet/minecraft/class_310;IFFLqeaa361f143ee4a0894bd168fd9b30c66/qf4ccf8f5435d4a78bdca4d6a018b578e/aabbaabbb;)Z
      // 503: istore 8
      // 505: iload 8
      // 507: ifne 529
      // 50a: aload 0
      // 50b: bipush 0
      // 50c: putfield qeaa361f143ee4a0894bd168fd9b30c66/qf4ccf8f5435d4a78bdca4d6a018b578e/aaabbbbba.aaba Z
      // 50f: aload 0
      // 510: ldc_w 308654173
      // 513: iload 9
      // 515: ldc_w 91433808
      // 518: ixor
      // 519: invokestatic qeaa361f143ee4a0894bd168fd9b30c66/qf4ccf8f5435d4a78bdca4d6a018b578e/aaabbbbba.a (II)I
      // 51c: ldc2_w 1848905881191263389
      // 51f: invokestatic qeaa361f143ee4a0894bd168fd9b30c66/qf4ccf8f5435d4a78bdca4d6a018b578e/aaabbbbba.baaa (IJ)I
      // 522: putfield qeaa361f143ee4a0894bd168fd9b30c66/qf4ccf8f5435d4a78bdca4d6a018b578e/aaabbbbba.aaabb I
      // 525: goto 529
      // 528: athrow
      // 529: return
   }

   private boolean aaaaa(class_310 param1, class_2338 param2, class_243 param3) {
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
      // 0d: invokevirtual qeaa361f143ee4a0894bd168fd9b30c66/qf4ccf8f5435d4a78bdca4d6a018b578e/aaabbbbba.aaaabb (Lnet/minecraft/class_310;Lnet/minecraft/class_2338;)Z
      // 10: ifne 46
      // 13: goto 17
      // 16: athrow
      // 17: aload 0
      // 18: goto 1c
      // 1b: athrow
      // 1c: aconst_null
      // 1d: putfield qeaa361f143ee4a0894bd168fd9b30c66/qf4ccf8f5435d4a78bdca4d6a018b578e/aaabbbbba.baaa Lnet/minecraft/class_2338;
      // 20: bipush 0
      // 21: istore 5
      // 23: aload 0
      // 24: bipush 0
      // 25: putfield qeaa361f143ee4a0894bd168fd9b30c66/qf4ccf8f5435d4a78bdca4d6a018b578e/aaabbbbba.aaaa Z
      // 28: aload 0
      // 29: ldc_w 308654174
      // 2c: ldc_w -826431303
      // 2f: ldc_w -772163259
      // 32: ixor
      // 33: invokestatic qeaa361f143ee4a0894bd168fd9b30c66/qf4ccf8f5435d4a78bdca4d6a018b578e/aaabbbbba.a (II)I
      // 36: ldc2_w 1848905881191263389
      // 39: invokestatic qeaa361f143ee4a0894bd168fd9b30c66/qf4ccf8f5435d4a78bdca4d6a018b578e/aaabbbbba.baaa (IJ)I
      // 3c: putfield qeaa361f143ee4a0894bd168fd9b30c66/qf4ccf8f5435d4a78bdca4d6a018b578e/aaabbbbba.abba I
      // 3f: aload 0
      // 40: invokevirtual qeaa361f143ee4a0894bd168fd9b30c66/qf4ccf8f5435d4a78bdca4d6a018b578e/aaabbbbba.bbbba ()V
      // 43: iload 5
      // 45: ireturn
      // 46: aload 1
      // 47: invokestatic qeaa361f143ee4a0894bd168fd9b30c66/qf4ccf8f5435d4a78bdca4d6a018b578e/aabbabbbb.ababbbb (Lnet/minecraft/class_310;)V
      // 4a: new net/minecraft/class_3965
      // 4d: dup
      // 4e: aload 3
      // 4f: getstatic net/minecraft/class_2350.field_11036 Lnet/minecraft/class_2350;
      // 52: aload 2
      // 53: bipush 0
      // 54: invokespecial net/minecraft/class_3965.<init> (Lnet/minecraft/class_243;Lnet/minecraft/class_2350;Lnet/minecraft/class_2338;Z)V
      // 57: astore 5
      // 59: aload 1
      // 5a: getstatic net/minecraft/class_1268.field_5808 Lnet/minecraft/class_1268;
      // 5d: aload 5
      // 5f: invokestatic qeaa361f143ee4a0894bd168fd9b30c66/qf4ccf8f5435d4a78bdca4d6a018b578e/aabbabbbb.babbbaa (Lnet/minecraft/class_310;Lnet/minecraft/class_1268;Lnet/minecraft/class_3965;)Lnet/minecraft/class_1269;
      // 62: astore 6
      // 64: aload 6
      // 66: iload 4
      // 68: ifne 74
      // 6b: ifnull 89
      // 6e: goto 72
      // 71: athrow
      // 72: aload 6
      // 74: invokeinterface net/minecraft/class_1269.method_23665 ()Z 1
      // 79: iload 4
      // 7b: ifne 86
      // 7e: ifeq 89
      // 81: goto 85
      // 84: athrow
      // 85: bipush 1
      // 86: goto 8a
      // 89: bipush 0
      // 8a: istore 7
      // 8c: iload 7
      // 8e: iload 4
      // 90: ifne b2
      // 93: ifeq b0
      // 96: goto 9a
      // 99: athrow
      // 9a: aload 0
      // 9b: aload 1
      // 9c: getfield net/minecraft/class_310.field_1724 Lnet/minecraft/class_746;
      // 9f: getfield net/minecraft/class_746.field_6012 I
      // a2: bipush 4
      // a3: iadd
      // a4: putfield qeaa361f143ee4a0894bd168fd9b30c66/qf4ccf8f5435d4a78bdca4d6a018b578e/aaabbbbba.abaa I
      // a7: aload 0
      // a8: bipush 0
      // a9: putfield qeaa361f143ee4a0894bd168fd9b30c66/qf4ccf8f5435d4a78bdca4d6a018b578e/aaabbbbba.abaaa Z
      // ac: goto b0
      // af: athrow
      // b0: iload 7
      // b2: istore 8
      // b4: aload 0
      // b5: bipush 0
      // b6: putfield qeaa361f143ee4a0894bd168fd9b30c66/qf4ccf8f5435d4a78bdca4d6a018b578e/aaabbbbba.aaaa Z
      // b9: aload 0
      // ba: ldc_w 308654175
      // bd: ldc_w -826431303
      // c0: ldc_w -1505762175
      // c3: ixor
      // c4: invokestatic qeaa361f143ee4a0894bd168fd9b30c66/qf4ccf8f5435d4a78bdca4d6a018b578e/aaabbbbba.a (II)I
      // c7: ldc2_w 1848905881191263389
      // ca: invokestatic qeaa361f143ee4a0894bd168fd9b30c66/qf4ccf8f5435d4a78bdca4d6a018b578e/aaabbbbba.baaa (IJ)I
      // cd: putfield qeaa361f143ee4a0894bd168fd9b30c66/qf4ccf8f5435d4a78bdca4d6a018b578e/aaabbbbba.abba I
      // d0: aload 0
      // d1: invokevirtual qeaa361f143ee4a0894bd168fd9b30c66/qf4ccf8f5435d4a78bdca4d6a018b578e/aaabbbbba.bbbba ()V
      // d4: iload 8
      // d6: ireturn
      // d7: astore 9
      // d9: aload 0
      // da: bipush 0
      // db: putfield qeaa361f143ee4a0894bd168fd9b30c66/qf4ccf8f5435d4a78bdca4d6a018b578e/aaabbbbba.aaaa Z
      // de: aload 0
      // df: ldc_w 308654160
      // e2: ldc_w -826431303
      // e5: ldc_w -152892823
      // e8: ixor
      // e9: invokestatic qeaa361f143ee4a0894bd168fd9b30c66/qf4ccf8f5435d4a78bdca4d6a018b578e/aaabbbbba.a (II)I
      // ec: ldc2_w 1848905881191263389
      // ef: invokestatic qeaa361f143ee4a0894bd168fd9b30c66/qf4ccf8f5435d4a78bdca4d6a018b578e/aaabbbbba.baaa (IJ)I
      // f2: putfield qeaa361f143ee4a0894bd168fd9b30c66/qf4ccf8f5435d4a78bdca4d6a018b578e/aaabbbbba.abba I
      // f5: aload 0
      // f6: invokevirtual qeaa361f143ee4a0894bd168fd9b30c66/qf4ccf8f5435d4a78bdca4d6a018b578e/aaabbbbba.bbbba ()V
      // f9: aload 9
      // fb: athrow
   }

   private boolean aaaab(class_310 param1) {
      // $VF: Couldn't be decompiled
      // Please report this to the Vineflower issue tracker, at https://github.com/Vineflower/vineflower/issues with a copy of the class file (if you have the rights to distribute it!)
      // java.lang.RuntimeException: parsing failure!
      //   at org.jetbrains.java.decompiler.modules.decompiler.decompose.DomHelper.parseGraph(DomHelper.java:211)
      //   at org.jetbrains.java.decompiler.main.rels.MethodProcessor.codeToJava(MethodProcessor.java:166)
      //
      // Bytecode:
      // 00: getstatic qeaa361f143ee4a0894bd168fd9b30c66/qf4ccf8f5435d4a78bdca4d6a018b578e/baaabbaa.bba I
      // 03: aload 1
      // 04: getfield net/minecraft/class_310.field_1755 Lnet/minecraft/class_437;
      // 07: astore 5
      // 09: istore 2
      // 0a: aload 5
      // 0c: instanceof net/minecraft/class_465
      // 0f: iload 2
      // 10: ifne 53
      // 13: ifeq 4e
      // 16: goto 1a
      // 19: athrow
      // 1a: aload 5
      // 1c: checkcast net/minecraft/class_465
      // 1f: astore 3
      // 20: aload 3
      // 21: invokevirtual net/minecraft/class_465.method_17577 ()Lnet/minecraft/class_1703;
      // 24: astore 5
      // 26: aload 5
      // 28: instanceof net/minecraft/class_1707
      // 2b: iload 2
      // 2c: ifne 53
      // 2f: ifeq 4e
      // 32: goto 36
      // 35: athrow
      // 36: aload 5
      // 38: checkcast net/minecraft/class_1707
      // 3b: astore 4
      // 3d: aload 4
      // 3f: invokevirtual net/minecraft/class_1707.method_17388 ()I
      // 42: iload 2
      // 43: ifne 53
      // 46: bipush 3
      // 47: if_icmpeq 54
      // 4a: goto 4e
      // 4d: athrow
      // 4e: bipush 0
      // 4f: goto 53
      // 52: athrow
      // 53: ireturn
      // 54: aload 3
      // 55: invokevirtual net/minecraft/class_465.method_25440 ()Lnet/minecraft/class_2561;
      // 58: invokeinterface net/minecraft/class_2561.method_10851 ()Lnet/minecraft/class_7417; 1
      // 5d: astore 6
      // 5f: aload 6
      // 61: iload 2
      // 62: ifne 75
      // 65: instanceof net/minecraft/class_2588
      // 68: ifeq b1
      // 6b: goto 6f
      // 6e: athrow
      // 6f: aload 6
      // 71: goto 75
      // 74: athrow
      // 75: checkcast net/minecraft/class_2588
      // 78: astore 5
      // 7a: ldc_w 308654161
      // 7d: ldc_w 1975180018
      // 80: ldc_w 642978215
      // 83: ixor
      // 84: invokestatic qeaa361f143ee4a0894bd168fd9b30c66/qf4ccf8f5435d4a78bdca4d6a018b578e/aaabbbbba.a (II)I
      // 87: ldc_w 308654162
      // 8a: ldc_w 1975180018
      // 8d: ldc_w 2053861962
      // 90: ixor
      // 91: invokestatic qeaa361f143ee4a0894bd168fd9b30c66/qf4ccf8f5435d4a78bdca4d6a018b578e/aaabbbbba.a (II)I
      // 94: invokestatic qeaa361f143ee4a0894bd168fd9b30c66/qf4ccf8f5435d4a78bdca4d6a018b578e/aaabbbbba.aaaa (II)Ljava/lang/String;
      // 97: invokestatic qeaa361f143ee4a0894bd168fd9b30c66/qf4ccf8f5435d4a78bdca4d6a018b578e/aabbaaaba.abba (Ljava/lang/String;)Ljava/lang/String;
      // 9a: aload 5
      // 9c: invokevirtual net/minecraft/class_2588.method_11022 ()Ljava/lang/String;
      // 9f: invokevirtual java/lang/String.equals (Ljava/lang/Object;)Z
      // a2: iload 2
      // a3: ifne ae
      // a6: ifeq b1
      // a9: goto ad
      // ac: athrow
      // ad: bipush 1
      // ae: goto b2
      // b1: bipush 0
      // b2: ireturn
   }

   private boolean aaaba(class_310 param1, class_2338 param2) {
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
      // 05: ifnull 30
      // 08: aload 1
      // 09: new net/minecraft/class_3965
      // 0c: dup
      // 0d: aload 2
      // 0e: invokestatic net/minecraft/class_243.method_24953 (Lnet/minecraft/class_2382;)Lnet/minecraft/class_243;
      // 11: getstatic net/minecraft/class_2350.field_11036 Lnet/minecraft/class_2350;
      // 14: aload 2
      // 15: bipush 0
      // 16: invokespecial net/minecraft/class_3965.<init> (Lnet/minecraft/class_243;Lnet/minecraft/class_2350;Lnet/minecraft/class_2338;Z)V
      // 19: bipush 0
      // 1a: invokestatic qeaa361f143ee4a0894bd168fd9b30c66/qf4ccf8f5435d4a78bdca4d6a018b578e/bbabbbb.abbbaa (Lnet/minecraft/class_310;Lnet/minecraft/class_3965;Z)Z
      // 1d: iload 3
      // 1e: ifne 2d
      // 21: goto 25
      // 24: athrow
      // 25: ifeq 30
      // 28: goto 2c
      // 2b: athrow
      // 2c: bipush 1
      // 2d: goto 31
      // 30: bipush 0
      // 31: ireturn
   }

   private boolean aaabb(class_310 param1, class_243 param2, class_2338 param3) {
      // $VF: Couldn't be decompiled
      // Please report this to the Vineflower issue tracker, at https://github.com/Vineflower/vineflower/issues with a copy of the class file (if you have the rights to distribute it!)
      // java.lang.RuntimeException: parsing failure!
      //   at org.jetbrains.java.decompiler.modules.decompiler.decompose.DomHelper.parseGraph(DomHelper.java:211)
      //   at org.jetbrains.java.decompiler.main.rels.MethodProcessor.codeToJava(MethodProcessor.java:166)
      //
      // Bytecode:
      // 00: getstatic qeaa361f143ee4a0894bd168fd9b30c66/qf4ccf8f5435d4a78bdca4d6a018b578e/baaabbaa.bba I
      // 03: aload 1
      // 04: getfield net/minecraft/class_310.field_1687 Lnet/minecraft/class_638;
      // 07: new net/minecraft/class_3959
      // 0a: dup
      // 0b: aload 1
      // 0c: getfield net/minecraft/class_310.field_1724 Lnet/minecraft/class_746;
      // 0f: invokevirtual net/minecraft/class_746.method_33571 ()Lnet/minecraft/class_243;
      // 12: aload 2
      // 13: getstatic net/minecraft/class_3959$class_3960.field_17559 Lnet/minecraft/class_3959$class_3960;
      // 16: getstatic net/minecraft/class_3959$class_242.field_1348 Lnet/minecraft/class_3959$class_242;
      // 19: aload 1
      // 1a: getfield net/minecraft/class_310.field_1724 Lnet/minecraft/class_746;
      // 1d: invokespecial net/minecraft/class_3959.<init> (Lnet/minecraft/class_243;Lnet/minecraft/class_243;Lnet/minecraft/class_3959$class_3960;Lnet/minecraft/class_3959$class_242;Lnet/minecraft/class_1297;)V
      // 20: invokevirtual net/minecraft/class_638.method_17742 (Lnet/minecraft/class_3959;)Lnet/minecraft/class_3965;
      // 23: astore 5
      // 25: istore 4
      // 27: aload 5
      // 29: iload 4
      // 2b: ifne 40
      // 2e: ifnull 66
      // 31: goto 35
      // 34: athrow
      // 35: aload 5
      // 37: iload 4
      // 39: ifne 4f
      // 3c: goto 40
      // 3f: athrow
      // 40: invokevirtual net/minecraft/class_3965.method_17783 ()Lnet/minecraft/class_239$class_240;
      // 43: getstatic net/minecraft/class_239$class_240.field_1333 Lnet/minecraft/class_239$class_240;
      // 46: if_acmpeq 66
      // 49: aload 5
      // 4b: goto 4f
      // 4e: athrow
      // 4f: invokevirtual net/minecraft/class_3965.method_17777 ()Lnet/minecraft/class_2338;
      // 52: aload 3
      // 53: invokevirtual net/minecraft/class_2338.equals (Ljava/lang/Object;)Z
      // 56: iload 4
      // 58: ifne 63
      // 5b: ifeq 66
      // 5e: goto 62
      // 61: athrow
      // 62: bipush 1
      // 63: goto 67
      // 66: bipush 0
      // 67: ireturn
   }

   private class_3965 aabab(abbabbbbb var1) {
      try {
         if (var1 == null) {
            return null;
         }
      } catch (MatchException var2) {
         throw var2;
      }

      return new class_3965(var1.aa(), class_2350.field_11036, var1.a(), false);
   }

   private boolean aabba(class_310 var1, abbabbbbb var2) {
      return bbabbbb.bbbaab(var1, this.aabab(var2));
   }

   private long abaaa(aaabbbab var1) {
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

   @Override
   public void aabaa() {
      this.bab();
      this.aab.aaaa();
   }

   public boolean ababb(class_310 param1) {
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
      // 06: ifne 18
      // 09: invokevirtual qeaa361f143ee4a0894bd168fd9b30c66/qf4ccf8f5435d4a78bdca4d6a018b578e/aaabbbbba.babbaab ()Z
      // 0c: ifeq 2b
      // 0f: goto 13
      // 12: athrow
      // 13: aload 0
      // 14: goto 18
      // 17: athrow
      // 18: aload 1
      // 19: invokevirtual qeaa361f143ee4a0894bd168fd9b30c66/qf4ccf8f5435d4a78bdca4d6a018b578e/aaabbbbba.aaaab (Lnet/minecraft/class_310;)Z
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

   private boolean abbaa(class_310 param1) {
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
      // 09: ifnull 42
      // 0c: goto 10
      // 0f: athrow
      // 10: aload 1
      // 11: iload 2
      // 12: ifne 24
      // 15: getfield net/minecraft/class_310.field_1724 Lnet/minecraft/class_746;
      // 18: ifnull 42
      // 1b: goto 1f
      // 1e: athrow
      // 1f: aload 1
      // 20: goto 24
      // 23: athrow
      // 24: iload 2
      // 25: ifne 37
      // 28: getfield net/minecraft/class_310.field_1687 Lnet/minecraft/class_638;
      // 2b: ifnull 42
      // 2e: goto 32
      // 31: athrow
      // 32: aload 1
      // 33: goto 37
      // 36: athrow
      // 37: getfield net/minecraft/class_310.field_1761 Lnet/minecraft/class_636;
      // 3a: ifnull 42
      // 3d: bipush 1
      // 3e: goto 43
      // 41: athrow
      // 42: bipush 0
      // 43: ireturn
   }

   private boolean abbab(class_746 param1, class_243 param2) {
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
      // 05: ifnull 37
      // 08: aload 2
      // 09: iload 3
      // 0a: ifne 20
      // 0d: goto 11
      // 10: athrow
      // 11: ifnull 37
      // 14: goto 18
      // 17: athrow
      // 18: aload 1
      // 19: invokevirtual net/minecraft/class_746.method_33571 ()Lnet/minecraft/class_243;
      // 1c: goto 20
      // 1f: athrow
      // 20: aload 2
      // 21: invokevirtual net/minecraft/class_243.method_1025 (Lnet/minecraft/class_243;)D
      // 24: ldc2_w 20.25
      // 27: dcmpg
      // 28: iload 3
      // 29: ifne 34
      // 2c: ifgt 37
      // 2f: goto 33
      // 32: athrow
      // 33: bipush 1
      // 34: goto 38
      // 37: bipush 0
      // 38: ireturn
   }

   private boolean abbba(class_1799 param1) {
      // $VF: Couldn't be decompiled
      // Please report this to the Vineflower issue tracker, at https://github.com/Vineflower/vineflower/issues with a copy of the class file (if you have the rights to distribute it!)
      // java.lang.RuntimeException: parsing failure!
      //   at org.jetbrains.java.decompiler.modules.decompiler.decompose.DomHelper.parseGraph(DomHelper.java:211)
      //   at org.jetbrains.java.decompiler.main.rels.MethodProcessor.codeToJava(MethodProcessor.java:166)
      //
      // Bytecode:
      // 000: ldc_w 1485788150
      // 003: istore 4
      // 005: getstatic qeaa361f143ee4a0894bd168fd9b30c66/qf4ccf8f5435d4a78bdca4d6a018b578e/baaabbaa.bba I
      // 008: getstatic net/minecraft/class_7923.field_41178 Lnet/minecraft/class_7922;
      // 00b: aload 1
      // 00c: invokevirtual net/minecraft/class_1799.method_7909 ()Lnet/minecraft/class_1792;
      // 00f: invokeinterface net/minecraft/class_7922.method_10221 (Ljava/lang/Object;)Lnet/minecraft/class_2960; 2
      // 014: invokevirtual net/minecraft/class_2960.method_12832 ()Ljava/lang/String;
      // 017: astore 3
      // 018: istore 2
      // 019: aload 3
      // 01a: ldc_w 308654163
      // 01d: iload 4
      // 01f: ldc_w 357914738
      // 022: ixor
      // 023: invokestatic qeaa361f143ee4a0894bd168fd9b30c66/qf4ccf8f5435d4a78bdca4d6a018b578e/aaabbbbba.a (II)I
      // 026: ldc_w 308654164
      // 029: iload 4
      // 02b: ldc_w -1804581681
      // 02e: ixor
      // 02f: invokestatic qeaa361f143ee4a0894bd168fd9b30c66/qf4ccf8f5435d4a78bdca4d6a018b578e/aaabbbbba.a (II)I
      // 032: invokestatic qeaa361f143ee4a0894bd168fd9b30c66/qf4ccf8f5435d4a78bdca4d6a018b578e/aaabbbbba.aaaa (II)Ljava/lang/String;
      // 035: invokestatic qeaa361f143ee4a0894bd168fd9b30c66/qf4ccf8f5435d4a78bdca4d6a018b578e/aabbaaaba.abba (Ljava/lang/String;)Ljava/lang/String;
      // 038: invokevirtual java/lang/String.endsWith (Ljava/lang/String;)Z
      // 03b: iload 2
      // 03c: ifne 2c4
      // 03f: ifne 2c3
      // 042: goto 046
      // 045: athrow
      // 046: aload 3
      // 047: ldc_w 308654165
      // 04a: iload 4
      // 04c: ldc_w 86687724
      // 04f: ixor
      // 050: invokestatic qeaa361f143ee4a0894bd168fd9b30c66/qf4ccf8f5435d4a78bdca4d6a018b578e/aaabbbbba.a (II)I
      // 053: ldc_w 308654166
      // 056: iload 4
      // 058: ldc_w 1578547191
      // 05b: ixor
      // 05c: invokestatic qeaa361f143ee4a0894bd168fd9b30c66/qf4ccf8f5435d4a78bdca4d6a018b578e/aaabbbbba.a (II)I
      // 05f: invokestatic qeaa361f143ee4a0894bd168fd9b30c66/qf4ccf8f5435d4a78bdca4d6a018b578e/aaabbbbba.aaaa (II)Ljava/lang/String;
      // 062: invokestatic qeaa361f143ee4a0894bd168fd9b30c66/qf4ccf8f5435d4a78bdca4d6a018b578e/aabbaaaba.abba (Ljava/lang/String;)Ljava/lang/String;
      // 065: invokevirtual java/lang/String.endsWith (Ljava/lang/String;)Z
      // 068: iload 2
      // 069: ifne 2c4
      // 06c: goto 070
      // 06f: athrow
      // 070: ifne 2c3
      // 073: goto 077
      // 076: athrow
      // 077: aload 3
      // 078: ldc_w 308654167
      // 07b: iload 4
      // 07d: ldc_w 532720438
      // 080: ixor
      // 081: invokestatic qeaa361f143ee4a0894bd168fd9b30c66/qf4ccf8f5435d4a78bdca4d6a018b578e/aaabbbbba.a (II)I
      // 084: ldc_w 308654120
      // 087: iload 4
      // 089: ldc_w 1899728131
      // 08c: ixor
      // 08d: invokestatic qeaa361f143ee4a0894bd168fd9b30c66/qf4ccf8f5435d4a78bdca4d6a018b578e/aaabbbbba.a (II)I
      // 090: invokestatic qeaa361f143ee4a0894bd168fd9b30c66/qf4ccf8f5435d4a78bdca4d6a018b578e/aaabbbbba.aaaa (II)Ljava/lang/String;
      // 093: invokestatic qeaa361f143ee4a0894bd168fd9b30c66/qf4ccf8f5435d4a78bdca4d6a018b578e/aabbaaaba.abba (Ljava/lang/String;)Ljava/lang/String;
      // 096: invokevirtual java/lang/String.endsWith (Ljava/lang/String;)Z
      // 099: iload 2
      // 09a: ifne 2c4
      // 09d: goto 0a1
      // 0a0: athrow
      // 0a1: ifne 2c3
      // 0a4: goto 0a8
      // 0a7: athrow
      // 0a8: aload 3
      // 0a9: ldc_w 308654121
      // 0ac: iload 4
      // 0ae: ldc_w 2128545377
      // 0b1: ixor
      // 0b2: invokestatic qeaa361f143ee4a0894bd168fd9b30c66/qf4ccf8f5435d4a78bdca4d6a018b578e/aaabbbbba.a (II)I
      // 0b5: ldc_w 308654122
      // 0b8: iload 4
      // 0ba: ldc_w 286804723
      // 0bd: ixor
      // 0be: invokestatic qeaa361f143ee4a0894bd168fd9b30c66/qf4ccf8f5435d4a78bdca4d6a018b578e/aaabbbbba.a (II)I
      // 0c1: invokestatic qeaa361f143ee4a0894bd168fd9b30c66/qf4ccf8f5435d4a78bdca4d6a018b578e/aaabbbbba.aaaa (II)Ljava/lang/String;
      // 0c4: invokestatic qeaa361f143ee4a0894bd168fd9b30c66/qf4ccf8f5435d4a78bdca4d6a018b578e/aabbaaaba.abba (Ljava/lang/String;)Ljava/lang/String;
      // 0c7: invokevirtual java/lang/String.endsWith (Ljava/lang/String;)Z
      // 0ca: iload 2
      // 0cb: ifne 2c4
      // 0ce: goto 0d2
      // 0d1: athrow
      // 0d2: ifne 2c3
      // 0d5: goto 0d9
      // 0d8: athrow
      // 0d9: aload 3
      // 0da: ldc_w 308654123
      // 0dd: iload 4
      // 0df: ldc_w 155333848
      // 0e2: ixor
      // 0e3: invokestatic qeaa361f143ee4a0894bd168fd9b30c66/qf4ccf8f5435d4a78bdca4d6a018b578e/aaabbbbba.a (II)I
      // 0e6: ldc_w 308654124
      // 0e9: iload 4
      // 0eb: ldc_w -1868227417
      // 0ee: ixor
      // 0ef: invokestatic qeaa361f143ee4a0894bd168fd9b30c66/qf4ccf8f5435d4a78bdca4d6a018b578e/aaabbbbba.a (II)I
      // 0f2: invokestatic qeaa361f143ee4a0894bd168fd9b30c66/qf4ccf8f5435d4a78bdca4d6a018b578e/aaabbbbba.aaaa (II)Ljava/lang/String;
      // 0f5: invokestatic qeaa361f143ee4a0894bd168fd9b30c66/qf4ccf8f5435d4a78bdca4d6a018b578e/aabbaaaba.abba (Ljava/lang/String;)Ljava/lang/String;
      // 0f8: invokevirtual java/lang/String.endsWith (Ljava/lang/String;)Z
      // 0fb: iload 2
      // 0fc: ifne 2c4
      // 0ff: goto 103
      // 102: athrow
      // 103: ifne 2c3
      // 106: goto 10a
      // 109: athrow
      // 10a: aload 3
      // 10b: ldc_w 308654125
      // 10e: iload 4
      // 110: ldc_w 717110855
      // 113: ixor
      // 114: invokestatic qeaa361f143ee4a0894bd168fd9b30c66/qf4ccf8f5435d4a78bdca4d6a018b578e/aaabbbbba.a (II)I
      // 117: ldc_w 308654126
      // 11a: iload 4
      // 11c: ldc_w -315410162
      // 11f: ixor
      // 120: invokestatic qeaa361f143ee4a0894bd168fd9b30c66/qf4ccf8f5435d4a78bdca4d6a018b578e/aaabbbbba.a (II)I
      // 123: invokestatic qeaa361f143ee4a0894bd168fd9b30c66/qf4ccf8f5435d4a78bdca4d6a018b578e/aaabbbbba.aaaa (II)Ljava/lang/String;
      // 126: invokestatic qeaa361f143ee4a0894bd168fd9b30c66/qf4ccf8f5435d4a78bdca4d6a018b578e/aabbaaaba.abba (Ljava/lang/String;)Ljava/lang/String;
      // 129: invokevirtual java/lang/String.endsWith (Ljava/lang/String;)Z
      // 12c: iload 2
      // 12d: ifne 2c4
      // 130: goto 134
      // 133: athrow
      // 134: ifne 2c3
      // 137: goto 13b
      // 13a: athrow
      // 13b: aload 3
      // 13c: ldc_w 308654127
      // 13f: iload 4
      // 141: ldc_w -823292273
      // 144: ixor
      // 145: invokestatic qeaa361f143ee4a0894bd168fd9b30c66/qf4ccf8f5435d4a78bdca4d6a018b578e/aaabbbbba.a (II)I
      // 148: ldc_w 308654112
      // 14b: iload 4
      // 14d: ldc_w -1508228163
      // 150: ixor
      // 151: invokestatic qeaa361f143ee4a0894bd168fd9b30c66/qf4ccf8f5435d4a78bdca4d6a018b578e/aaabbbbba.a (II)I
      // 154: invokestatic qeaa361f143ee4a0894bd168fd9b30c66/qf4ccf8f5435d4a78bdca4d6a018b578e/aaabbbbba.aaaa (II)Ljava/lang/String;
      // 157: invokestatic qeaa361f143ee4a0894bd168fd9b30c66/qf4ccf8f5435d4a78bdca4d6a018b578e/aabbaaaba.abba (Ljava/lang/String;)Ljava/lang/String;
      // 15a: invokevirtual java/lang/String.equals (Ljava/lang/Object;)Z
      // 15d: iload 2
      // 15e: ifne 2c4
      // 161: goto 165
      // 164: athrow
      // 165: ifne 2c3
      // 168: goto 16c
      // 16b: athrow
      // 16c: aload 3
      // 16d: ldc_w 308654113
      // 170: iload 4
      // 172: ldc_w 1811379889
      // 175: ixor
      // 176: invokestatic qeaa361f143ee4a0894bd168fd9b30c66/qf4ccf8f5435d4a78bdca4d6a018b578e/aaabbbbba.a (II)I
      // 179: ldc_w 308654114
      // 17c: iload 4
      // 17e: ldc_w -1794105183
      // 181: ixor
      // 182: invokestatic qeaa361f143ee4a0894bd168fd9b30c66/qf4ccf8f5435d4a78bdca4d6a018b578e/aaabbbbba.a (II)I
      // 185: invokestatic qeaa361f143ee4a0894bd168fd9b30c66/qf4ccf8f5435d4a78bdca4d6a018b578e/aaabbbbba.aaaa (II)Ljava/lang/String;
      // 188: invokestatic qeaa361f143ee4a0894bd168fd9b30c66/qf4ccf8f5435d4a78bdca4d6a018b578e/aabbaaaba.abba (Ljava/lang/String;)Ljava/lang/String;
      // 18b: invokevirtual java/lang/String.equals (Ljava/lang/Object;)Z
      // 18e: iload 2
      // 18f: ifne 2c4
      // 192: goto 196
      // 195: athrow
      // 196: ifne 2c3
      // 199: goto 19d
      // 19c: athrow
      // 19d: aload 3
      // 19e: ldc_w 308654115
      // 1a1: iload 4
      // 1a3: ldc_w -1459561454
      // 1a6: ixor
      // 1a7: invokestatic qeaa361f143ee4a0894bd168fd9b30c66/qf4ccf8f5435d4a78bdca4d6a018b578e/aaabbbbba.a (II)I
      // 1aa: ldc_w 308654116
      // 1ad: iload 4
      // 1af: ldc_w 530909325
      // 1b2: ixor
      // 1b3: invokestatic qeaa361f143ee4a0894bd168fd9b30c66/qf4ccf8f5435d4a78bdca4d6a018b578e/aaabbbbba.a (II)I
      // 1b6: invokestatic qeaa361f143ee4a0894bd168fd9b30c66/qf4ccf8f5435d4a78bdca4d6a018b578e/aaabbbbba.aaaa (II)Ljava/lang/String;
      // 1b9: invokestatic qeaa361f143ee4a0894bd168fd9b30c66/qf4ccf8f5435d4a78bdca4d6a018b578e/aabbaaaba.abba (Ljava/lang/String;)Ljava/lang/String;
      // 1bc: invokevirtual java/lang/String.equals (Ljava/lang/Object;)Z
      // 1bf: iload 2
      // 1c0: ifne 2c4
      // 1c3: goto 1c7
      // 1c6: athrow
      // 1c7: ifne 2c3
      // 1ca: goto 1ce
      // 1cd: athrow
      // 1ce: aload 3
      // 1cf: ldc_w 308654117
      // 1d2: iload 4
      // 1d4: ldc_w 238430363
      // 1d7: ixor
      // 1d8: invokestatic qeaa361f143ee4a0894bd168fd9b30c66/qf4ccf8f5435d4a78bdca4d6a018b578e/aaabbbbba.a (II)I
      // 1db: ldc_w 308654118
      // 1de: iload 4
      // 1e0: ldc_w -1851660984
      // 1e3: ixor
      // 1e4: invokestatic qeaa361f143ee4a0894bd168fd9b30c66/qf4ccf8f5435d4a78bdca4d6a018b578e/aaabbbbba.a (II)I
      // 1e7: invokestatic qeaa361f143ee4a0894bd168fd9b30c66/qf4ccf8f5435d4a78bdca4d6a018b578e/aaabbbbba.aaaa (II)Ljava/lang/String;
      // 1ea: invokestatic qeaa361f143ee4a0894bd168fd9b30c66/qf4ccf8f5435d4a78bdca4d6a018b578e/aabbaaaba.abba (Ljava/lang/String;)Ljava/lang/String;
      // 1ed: invokevirtual java/lang/String.equals (Ljava/lang/Object;)Z
      // 1f0: iload 2
      // 1f1: ifne 2c4
      // 1f4: goto 1f8
      // 1f7: athrow
      // 1f8: ifne 2c3
      // 1fb: goto 1ff
      // 1fe: athrow
      // 1ff: aload 3
      // 200: ldc_w 308654119
      // 203: iload 4
      // 205: ldc_w -1845754452
      // 208: ixor
      // 209: invokestatic qeaa361f143ee4a0894bd168fd9b30c66/qf4ccf8f5435d4a78bdca4d6a018b578e/aaabbbbba.a (II)I
      // 20c: ldc_w 308654136
      // 20f: iload 4
      // 211: ldc_w 1285025186
      // 214: ixor
      // 215: invokestatic qeaa361f143ee4a0894bd168fd9b30c66/qf4ccf8f5435d4a78bdca4d6a018b578e/aaabbbbba.a (II)I
      // 218: invokestatic qeaa361f143ee4a0894bd168fd9b30c66/qf4ccf8f5435d4a78bdca4d6a018b578e/aaabbbbba.aaaa (II)Ljava/lang/String;
      // 21b: invokestatic qeaa361f143ee4a0894bd168fd9b30c66/qf4ccf8f5435d4a78bdca4d6a018b578e/aabbaaaba.abba (Ljava/lang/String;)Ljava/lang/String;
      // 21e: invokevirtual java/lang/String.equals (Ljava/lang/Object;)Z
      // 221: iload 2
      // 222: ifne 2c4
      // 225: goto 229
      // 228: athrow
      // 229: ifne 2c3
      // 22c: goto 230
      // 22f: athrow
      // 230: aload 3
      // 231: ldc_w 308654137
      // 234: iload 4
      // 236: ldc_w 1461123680
      // 239: ixor
      // 23a: invokestatic qeaa361f143ee4a0894bd168fd9b30c66/qf4ccf8f5435d4a78bdca4d6a018b578e/aaabbbbba.a (II)I
      // 23d: ldc_w 308654138
      // 240: iload 4
      // 242: ldc_w -2086505524
      // 245: ixor
      // 246: invokestatic qeaa361f143ee4a0894bd168fd9b30c66/qf4ccf8f5435d4a78bdca4d6a018b578e/aaabbbbba.a (II)I
      // 249: invokestatic qeaa361f143ee4a0894bd168fd9b30c66/qf4ccf8f5435d4a78bdca4d6a018b578e/aaabbbbba.aaaa (II)Ljava/lang/String;
      // 24c: invokestatic qeaa361f143ee4a0894bd168fd9b30c66/qf4ccf8f5435d4a78bdca4d6a018b578e/aabbaaaba.abba (Ljava/lang/String;)Ljava/lang/String;
      // 24f: invokevirtual java/lang/String.equals (Ljava/lang/Object;)Z
      // 252: iload 2
      // 253: ifne 2c4
      // 256: goto 25a
      // 259: athrow
      // 25a: ifne 2c3
      // 25d: goto 261
      // 260: athrow
      // 261: aload 3
      // 262: ldc_w 308654139
      // 265: iload 4
      // 267: ldc_w 1135057922
      // 26a: ixor
      // 26b: invokestatic qeaa361f143ee4a0894bd168fd9b30c66/qf4ccf8f5435d4a78bdca4d6a018b578e/aaabbbbba.a (II)I
      // 26e: ldc_w 308654140
      // 271: iload 4
      // 273: ldc_w 1664538937
      // 276: ixor
      // 277: invokestatic qeaa361f143ee4a0894bd168fd9b30c66/qf4ccf8f5435d4a78bdca4d6a018b578e/aaabbbbba.a (II)I
      // 27a: invokestatic qeaa361f143ee4a0894bd168fd9b30c66/qf4ccf8f5435d4a78bdca4d6a018b578e/aaabbbbba.aaaa (II)Ljava/lang/String;
      // 27d: invokestatic qeaa361f143ee4a0894bd168fd9b30c66/qf4ccf8f5435d4a78bdca4d6a018b578e/aabbaaaba.abba (Ljava/lang/String;)Ljava/lang/String;
      // 280: invokevirtual java/lang/String.equals (Ljava/lang/Object;)Z
      // 283: iload 2
      // 284: ifne 2c4
      // 287: goto 28b
      // 28a: athrow
      // 28b: ifne 2c3
      // 28e: goto 292
      // 291: athrow
      // 292: aload 3
      // 293: ldc_w 308654141
      // 296: iload 4
      // 298: ldc_w 970867345
      // 29b: ixor
      // 29c: invokestatic qeaa361f143ee4a0894bd168fd9b30c66/qf4ccf8f5435d4a78bdca4d6a018b578e/aaabbbbba.a (II)I
      // 29f: ldc_w 308654142
      // 2a2: iload 4
      // 2a4: ldc_w 1493347183
      // 2a7: ixor
      // 2a8: invokestatic qeaa361f143ee4a0894bd168fd9b30c66/qf4ccf8f5435d4a78bdca4d6a018b578e/aaabbbbba.a (II)I
      // 2ab: invokestatic qeaa361f143ee4a0894bd168fd9b30c66/qf4ccf8f5435d4a78bdca4d6a018b578e/aaabbbbba.aaaa (II)Ljava/lang/String;
      // 2ae: invokestatic qeaa361f143ee4a0894bd168fd9b30c66/qf4ccf8f5435d4a78bdca4d6a018b578e/aabbaaaba.abba (Ljava/lang/String;)Ljava/lang/String;
      // 2b1: invokevirtual java/lang/String.equals (Ljava/lang/Object;)Z
      // 2b4: iload 2
      // 2b5: ifne 2c4
      // 2b8: goto 2bc
      // 2bb: athrow
      // 2bc: ifeq 2c7
      // 2bf: goto 2c3
      // 2c2: athrow
      // 2c3: bipush 1
      // 2c4: goto 2c8
      // 2c7: bipush 0
      // 2c8: ireturn
   }

   private static String abbbb(class_5321 var0) {
      return var0.method_29177().method_12832();
   }

   private Comparator baaaa() {
      return Comparator.comparingInt(aaabbbbba::baabb)
         .thenComparing(aaabbbbba::bb)
         .thenComparingInt(babbab::a);
   }

   private boolean baaab(class_310 var1, abbabbbbb var2, int var3) {
      return this.aaabaa(var1, var2, var3);
   }

   private ababbaa baaba(class_1799 param1) {
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
      // 009: ifnull 01f
      // 00c: goto 010
      // 00f: athrow
      // 010: aload 1
      // 011: invokevirtual net/minecraft/class_1799.method_7960 ()Z
      // 014: iload 2
      // 015: ifne 031
      // 018: ifeq 022
      // 01b: goto 01f
      // 01e: athrow
      // 01f: aconst_null
      // 020: areturn
      // 021: athrow
      // 022: aload 0
      // 023: iload 2
      // 024: ifne 035
      // 027: getstatic qeaa361f143ee4a0894bd168fd9b30c66/qf4ccf8f5435d4a78bdca4d6a018b578e/ababbaa.baa Lqeaa361f143ee4a0894bd168fd9b30c66/qf4ccf8f5435d4a78bdca4d6a018b578e/ababbaa;
      // 02a: invokevirtual qeaa361f143ee4a0894bd168fd9b30c66/qf4ccf8f5435d4a78bdca4d6a018b578e/aaabbbbba.abaa (Lqeaa361f143ee4a0894bd168fd9b30c66/qf4ccf8f5435d4a78bdca4d6a018b578e/ababbaa;)Z
      // 02d: goto 031
      // 030: athrow
      // 031: ifeq 048
      // 034: aload 0
      // 035: aload 1
      // 036: invokevirtual qeaa361f143ee4a0894bd168fd9b30c66/qf4ccf8f5435d4a78bdca4d6a018b578e/aaabbbbba.aaabbb (Lnet/minecraft/class_1799;)Z
      // 039: iload 2
      // 03a: ifne 045
      // 03d: ifeq 048
      // 040: goto 044
      // 043: athrow
      // 044: bipush 1
      // 045: goto 049
      // 048: bipush 0
      // 049: istore 3
      // 04a: aload 0
      // 04b: iload 2
      // 04c: ifne 07e
      // 04f: aload 1
      // 050: invokevirtual qeaa361f143ee4a0894bd168fd9b30c66/qf4ccf8f5435d4a78bdca4d6a018b578e/aaabbbbba.aaabab (Lnet/minecraft/class_1799;)Z
      // 053: ifeq 07d
      // 056: goto 05a
      // 059: athrow
      // 05a: aload 0
      // 05b: getstatic qeaa361f143ee4a0894bd168fd9b30c66/qf4ccf8f5435d4a78bdca4d6a018b578e/ababbaa.ba Lqeaa361f143ee4a0894bd168fd9b30c66/qf4ccf8f5435d4a78bdca4d6a018b578e/ababbaa;
      // 05e: invokevirtual qeaa361f143ee4a0894bd168fd9b30c66/qf4ccf8f5435d4a78bdca4d6a018b578e/aaabbbbba.abaa (Lqeaa361f143ee4a0894bd168fd9b30c66/qf4ccf8f5435d4a78bdca4d6a018b578e/ababbaa;)Z
      // 061: iload 2
      // 062: ifne 071
      // 065: goto 069
      // 068: athrow
      // 069: ifne 074
      // 06c: goto 070
      // 06f: athrow
      // 070: iload 3
      // 071: ifeq 07b
      // 074: getstatic qeaa361f143ee4a0894bd168fd9b30c66/qf4ccf8f5435d4a78bdca4d6a018b578e/ababbaa.ba Lqeaa361f143ee4a0894bd168fd9b30c66/qf4ccf8f5435d4a78bdca4d6a018b578e/ababbaa;
      // 077: goto 07c
      // 07a: athrow
      // 07b: aconst_null
      // 07c: areturn
      // 07d: aload 0
      // 07e: iload 2
      // 07f: ifne 0b1
      // 082: aload 1
      // 083: invokevirtual qeaa361f143ee4a0894bd168fd9b30c66/qf4ccf8f5435d4a78bdca4d6a018b578e/aaabbbbba.bbaaa (Lnet/minecraft/class_1799;)Z
      // 086: ifeq 0b0
      // 089: goto 08d
      // 08c: athrow
      // 08d: aload 0
      // 08e: getstatic qeaa361f143ee4a0894bd168fd9b30c66/qf4ccf8f5435d4a78bdca4d6a018b578e/ababbaa.bb Lqeaa361f143ee4a0894bd168fd9b30c66/qf4ccf8f5435d4a78bdca4d6a018b578e/ababbaa;
      // 091: invokevirtual qeaa361f143ee4a0894bd168fd9b30c66/qf4ccf8f5435d4a78bdca4d6a018b578e/aaabbbbba.abaa (Lqeaa361f143ee4a0894bd168fd9b30c66/qf4ccf8f5435d4a78bdca4d6a018b578e/ababbaa;)Z
      // 094: iload 2
      // 095: ifne 0a4
      // 098: goto 09c
      // 09b: athrow
      // 09c: ifne 0a7
      // 09f: goto 0a3
      // 0a2: athrow
      // 0a3: iload 3
      // 0a4: ifeq 0ae
      // 0a7: getstatic qeaa361f143ee4a0894bd168fd9b30c66/qf4ccf8f5435d4a78bdca4d6a018b578e/ababbaa.bb Lqeaa361f143ee4a0894bd168fd9b30c66/qf4ccf8f5435d4a78bdca4d6a018b578e/ababbaa;
      // 0aa: goto 0af
      // 0ad: athrow
      // 0ae: aconst_null
      // 0af: areturn
      // 0b0: aload 0
      // 0b1: iload 2
      // 0b2: ifne 107
      // 0b5: aload 1
      // 0b6: invokevirtual qeaa361f143ee4a0894bd168fd9b30c66/qf4ccf8f5435d4a78bdca4d6a018b578e/aaabbbbba.aba (Lnet/minecraft/class_1799;)Z
      // 0b9: ifeq 106
      // 0bc: goto 0c0
      // 0bf: athrow
      // 0c0: aload 0
      // 0c1: iload 2
      // 0c2: ifne 0e1
      // 0c5: goto 0c9
      // 0c8: athrow
      // 0c9: getstatic qeaa361f143ee4a0894bd168fd9b30c66/qf4ccf8f5435d4a78bdca4d6a018b578e/ababbaa.b Lqeaa361f143ee4a0894bd168fd9b30c66/qf4ccf8f5435d4a78bdca4d6a018b578e/ababbaa;
      // 0cc: invokevirtual qeaa361f143ee4a0894bd168fd9b30c66/qf4ccf8f5435d4a78bdca4d6a018b578e/aaabbbbba.abaa (Lqeaa361f143ee4a0894bd168fd9b30c66/qf4ccf8f5435d4a78bdca4d6a018b578e/ababbaa;)Z
      // 0cf: ifne 0f2
      // 0d2: goto 0d6
      // 0d5: athrow
      // 0d6: aload 0
      // 0d7: getfield qeaa361f143ee4a0894bd168fd9b30c66/qf4ccf8f5435d4a78bdca4d6a018b578e/aaabbbbba.bbaa Lqeaa361f143ee4a0894bd168fd9b30c66/qf4ccf8f5435d4a78bdca4d6a018b578e/abbaaaaa;
      // 0da: invokevirtual qeaa361f143ee4a0894bd168fd9b30c66/qf4ccf8f5435d4a78bdca4d6a018b578e/abbaaaaa.abbb ()Ljava/lang/Object;
      // 0dd: goto 0e1
      // 0e0: athrow
      // 0e1: checkcast java/lang/Boolean
      // 0e4: invokevirtual java/lang/Boolean.booleanValue ()Z
      // 0e7: iload 2
      // 0e8: ifne 0fa
      // 0eb: ifeq 0f9
      // 0ee: goto 0f2
      // 0f1: athrow
      // 0f2: getstatic qeaa361f143ee4a0894bd168fd9b30c66/qf4ccf8f5435d4a78bdca4d6a018b578e/ababbaa.b Lqeaa361f143ee4a0894bd168fd9b30c66/qf4ccf8f5435d4a78bdca4d6a018b578e/ababbaa;
      // 0f5: goto 105
      // 0f8: athrow
      // 0f9: iload 3
      // 0fa: ifeq 104
      // 0fd: getstatic qeaa361f143ee4a0894bd168fd9b30c66/qf4ccf8f5435d4a78bdca4d6a018b578e/ababbaa.baa Lqeaa361f143ee4a0894bd168fd9b30c66/qf4ccf8f5435d4a78bdca4d6a018b578e/ababbaa;
      // 100: goto 105
      // 103: athrow
      // 104: aconst_null
      // 105: areturn
      // 106: aload 0
      // 107: aload 1
      // 108: invokevirtual qeaa361f143ee4a0894bd168fd9b30c66/qf4ccf8f5435d4a78bdca4d6a018b578e/aaabbbbba.abbba (Lnet/minecraft/class_1799;)Z
      // 10b: iload 2
      // 10c: ifne 141
      // 10f: ifeq 140
      // 112: goto 116
      // 115: athrow
      // 116: aload 0
      // 117: getstatic qeaa361f143ee4a0894bd168fd9b30c66/qf4ccf8f5435d4a78bdca4d6a018b578e/ababbaa.aab Lqeaa361f143ee4a0894bd168fd9b30c66/qf4ccf8f5435d4a78bdca4d6a018b578e/ababbaa;
      // 11a: invokevirtual qeaa361f143ee4a0894bd168fd9b30c66/qf4ccf8f5435d4a78bdca4d6a018b578e/aaabbbbba.abaa (Lqeaa361f143ee4a0894bd168fd9b30c66/qf4ccf8f5435d4a78bdca4d6a018b578e/ababbaa;)Z
      // 11d: iload 2
      // 11e: ifne 134
      // 121: goto 125
      // 124: athrow
      // 125: ifeq 133
      // 128: goto 12c
      // 12b: athrow
      // 12c: getstatic qeaa361f143ee4a0894bd168fd9b30c66/qf4ccf8f5435d4a78bdca4d6a018b578e/ababbaa.aab Lqeaa361f143ee4a0894bd168fd9b30c66/qf4ccf8f5435d4a78bdca4d6a018b578e/ababbaa;
      // 12f: goto 13f
      // 132: athrow
      // 133: iload 3
      // 134: ifeq 13e
      // 137: getstatic qeaa361f143ee4a0894bd168fd9b30c66/qf4ccf8f5435d4a78bdca4d6a018b578e/ababbaa.baa Lqeaa361f143ee4a0894bd168fd9b30c66/qf4ccf8f5435d4a78bdca4d6a018b578e/ababbaa;
      // 13a: goto 13f
      // 13d: athrow
      // 13e: aconst_null
      // 13f: areturn
      // 140: iload 3
      // 141: ifeq 149
      // 144: getstatic qeaa361f143ee4a0894bd168fd9b30c66/qf4ccf8f5435d4a78bdca4d6a018b578e/ababbaa.baa Lqeaa361f143ee4a0894bd168fd9b30c66/qf4ccf8f5435d4a78bdca4d6a018b578e/ababbaa;
      // 147: areturn
      // 148: athrow
      // 149: aload 0
      // 14a: aload 1
      // 14b: invokevirtual qeaa361f143ee4a0894bd168fd9b30c66/qf4ccf8f5435d4a78bdca4d6a018b578e/aaabbbbba.bba (Lnet/minecraft/class_1799;)Lqeaa361f143ee4a0894bd168fd9b30c66/qf4ccf8f5435d4a78bdca4d6a018b578e/ababbaa;
      // 14e: astore 4
      // 150: aload 4
      // 152: ifnull 168
      // 155: aload 0
      // 156: aload 4
      // 158: invokevirtual qeaa361f143ee4a0894bd168fd9b30c66/qf4ccf8f5435d4a78bdca4d6a018b578e/aaabbbbba.abaa (Lqeaa361f143ee4a0894bd168fd9b30c66/qf4ccf8f5435d4a78bdca4d6a018b578e/ababbaa;)Z
      // 15b: ifeq 168
      // 15e: goto 162
      // 161: athrow
      // 162: aload 4
      // 164: goto 169
      // 167: athrow
      // 168: aconst_null
      // 169: areturn
   }

   private static int baabb(babbab var0) {
      return var0.ba().ab;
   }

   private boolean babaa(class_310 var1, abbabbbbb var2, int var3) {
      return this.aaabaa(var1, var2, var3);
   }

   private double babab(class_1799 param1, ababbaa param2) {
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
      // 05: getfield qeaa361f143ee4a0894bd168fd9b30c66/qf4ccf8f5435d4a78bdca4d6a018b578e/ababbaa.abb Z
      // 08: ifne 0e
      // 0b: dconst_0
      // 0c: dreturn
      // 0d: athrow
      // 0e: aload 0
      // 0f: aload 1
      // 10: invokevirtual qeaa361f143ee4a0894bd168fd9b30c66/qf4ccf8f5435d4a78bdca4d6a018b578e/aaabbbbba.babb (Lnet/minecraft/class_1799;)D
      // 13: aload 0
      // 14: aload 1
      // 15: invokevirtual qeaa361f143ee4a0894bd168fd9b30c66/qf4ccf8f5435d4a78bdca4d6a018b578e/aaabbbbba.ababaa (Lnet/minecraft/class_1799;)D
      // 18: dadd
      // 19: aload 0
      // 1a: aload 1
      // 1b: invokevirtual qeaa361f143ee4a0894bd168fd9b30c66/qf4ccf8f5435d4a78bdca4d6a018b578e/aaabbbbba.abaabb (Lnet/minecraft/class_1799;)D
      // 1e: dadd
      // 1f: aload 0
      // 20: aload 1
      // 21: invokevirtual qeaa361f143ee4a0894bd168fd9b30c66/qf4ccf8f5435d4a78bdca4d6a018b578e/aaabbbbba.abaaba (Lnet/minecraft/class_1799;)D
      // 24: dadd
      // 25: dstore 4
      // 27: aload 2
      // 28: getstatic qeaa361f143ee4a0894bd168fd9b30c66/qf4ccf8f5435d4a78bdca4d6a018b578e/ababbaa.baa Lqeaa361f143ee4a0894bd168fd9b30c66/qf4ccf8f5435d4a78bdca4d6a018b578e/ababbaa;
      // 2b: if_acmpne 84
      // 2e: aload 1
      // 2f: iload 3
      // 30: ifne 50
      // 33: goto 37
      // 36: athrow
      // 37: invokevirtual net/minecraft/class_1799.method_57380 ()Lnet/minecraft/class_9326;
      // 3a: getstatic net/minecraft/class_9334.field_49637 Lnet/minecraft/class_9331;
      // 3d: invokevirtual net/minecraft/class_9326.method_57845 (Lnet/minecraft/class_9331;)Ljava/util/Optional;
      // 40: ifnull 4f
      // 43: goto 47
      // 46: athrow
      // 47: dload 4
      // 49: ldc2_w 180.0
      // 4c: dadd
      // 4d: dstore 4
      // 4f: aload 1
      // 50: invokevirtual net/minecraft/class_1799.method_57380 ()Lnet/minecraft/class_9326;
      // 53: getstatic net/minecraft/class_9334.field_54199 Lnet/minecraft/class_9331;
      // 56: invokevirtual net/minecraft/class_9326.method_57845 (Lnet/minecraft/class_9331;)Ljava/util/Optional;
      // 59: ifnull 64
      // 5c: dload 4
      // 5e: ldc2_w 140.0
      // 61: dadd
      // 62: dstore 4
      // 64: dload 4
      // 66: ldc_w 308654143
      // 69: ldc_w 1354082820
      // 6c: ldc_w -1213243007
      // 6f: ixor
      // 70: invokestatic qeaa361f143ee4a0894bd168fd9b30c66/qf4ccf8f5435d4a78bdca4d6a018b578e/aaabbbbba.a (II)I
      // 73: ldc2_w 368458526470646835
      // 76: invokestatic qeaa361f143ee4a0894bd168fd9b30c66/qf4ccf8f5435d4a78bdca4d6a018b578e/aaabbbbba.baaa (IJ)I
      // 79: aload 1
      // 7a: invokevirtual net/minecraft/class_1799.method_7947 ()I
      // 7d: invokestatic java/lang/Math.min (II)I
      // 80: i2d
      // 81: dadd
      // 82: dstore 4
      // 84: dload 4
      // 86: dreturn
   }

   private boolean babba(class_2338 param1) {
      // $VF: Couldn't be decompiled
      // Please report this to the Vineflower issue tracker, at https://github.com/Vineflower/vineflower/issues with a copy of the class file (if you have the rights to distribute it!)
      // java.lang.RuntimeException: parsing failure!
      //   at org.jetbrains.java.decompiler.modules.decompiler.decompose.DomHelper.parseGraph(DomHelper.java:211)
      //   at org.jetbrains.java.decompiler.main.rels.MethodProcessor.codeToJava(MethodProcessor.java:166)
      //
      // Bytecode:
      // 00: getstatic qeaa361f143ee4a0894bd168fd9b30c66/qf4ccf8f5435d4a78bdca4d6a018b578e/baaabbaa.bba I
      // 03: invokestatic java/lang/System.currentTimeMillis ()J
      // 06: lstore 3
      // 07: istore 2
      // 08: aload 1
      // 09: iload 2
      // 0a: ifne 2d
      // 0d: ifnonnull 21
      // 10: goto 14
      // 13: athrow
      // 14: aload 0
      // 15: aconst_null
      // 16: putfield qeaa361f143ee4a0894bd168fd9b30c66/qf4ccf8f5435d4a78bdca4d6a018b578e/aaabbbbba.abbba Lnet/minecraft/class_2338;
      // 19: aload 0
      // 1a: lconst_0
      // 1b: putfield qeaa361f143ee4a0894bd168fd9b30c66/qf4ccf8f5435d4a78bdca4d6a018b578e/aaabbbbba.baaab J
      // 1e: bipush 1
      // 1f: ireturn
      // 20: athrow
      // 21: aload 0
      // 22: iload 2
      // 23: ifne 54
      // 26: getfield qeaa361f143ee4a0894bd168fd9b30c66/qf4ccf8f5435d4a78bdca4d6a018b578e/aaabbbbba.abbba Lnet/minecraft/class_2338;
      // 29: goto 2d
      // 2c: athrow
      // 2d: ifnull 47
      // 30: aload 0
      // 31: getfield qeaa361f143ee4a0894bd168fd9b30c66/qf4ccf8f5435d4a78bdca4d6a018b578e/aaabbbbba.abbba Lnet/minecraft/class_2338;
      // 34: aload 1
      // 35: invokevirtual net/minecraft/class_2338.equals (Ljava/lang/Object;)Z
      // 38: iload 2
      // 39: ifne 7e
      // 3c: goto 40
      // 3f: athrow
      // 40: ifne 78
      // 43: goto 47
      // 46: athrow
      // 47: aload 0
      // 48: aload 1
      // 49: invokevirtual net/minecraft/class_2338.method_10062 ()Lnet/minecraft/class_2338;
      // 4c: putfield qeaa361f143ee4a0894bd168fd9b30c66/qf4ccf8f5435d4a78bdca4d6a018b578e/aaabbbbba.abbba Lnet/minecraft/class_2338;
      // 4f: aload 0
      // 50: goto 54
      // 53: athrow
      // 54: lload 3
      // 55: aload 0
      // 56: aload 0
      // 57: getfield qeaa361f143ee4a0894bd168fd9b30c66/qf4ccf8f5435d4a78bdca4d6a018b578e/aaabbbbba.aabba Lqeaa361f143ee4a0894bd168fd9b30c66/qf4ccf8f5435d4a78bdca4d6a018b578e/aaabbbab;
      // 5a: invokevirtual qeaa361f143ee4a0894bd168fd9b30c66/qf4ccf8f5435d4a78bdca4d6a018b578e/aaabbbbba.abaaa (Lqeaa361f143ee4a0894bd168fd9b30c66/qf4ccf8f5435d4a78bdca4d6a018b578e/aaabbbab;)J
      // 5d: ladd
      // 5e: putfield qeaa361f143ee4a0894bd168fd9b30c66/qf4ccf8f5435d4a78bdca4d6a018b578e/aaabbbbba.baaab J
      // 61: lload 3
      // 62: aload 0
      // 63: getfield qeaa361f143ee4a0894bd168fd9b30c66/qf4ccf8f5435d4a78bdca4d6a018b578e/aaabbbbba.baaab J
      // 66: lcmp
      // 67: iload 2
      // 68: ifne 73
      // 6b: iflt 76
      // 6e: goto 72
      // 71: athrow
      // 72: bipush 1
      // 73: goto 77
      // 76: bipush 0
      // 77: ireturn
      // 78: lload 3
      // 79: aload 0
      // 7a: getfield qeaa361f143ee4a0894bd168fd9b30c66/qf4ccf8f5435d4a78bdca4d6a018b578e/aaabbbbba.baaab J
      // 7d: lcmp
      // 7e: iload 2
      // 7f: ifne 8d
      // 82: ifge 8c
      // 85: goto 89
      // 88: athrow
      // 89: bipush 0
      // 8a: ireturn
      // 8b: athrow
      // 8c: bipush 1
      // 8d: ireturn
   }

   private boolean babbb(class_310 var1) {
      return this.aaaaa(var1, this.aaa, class_243.method_24953(this.aaa));
   }

   private boolean bbaaa(class_1799 var1) {
      int var2 = baaabbaa.bba;

      class_1799 var10000;
      label33: {
         try {
            var10000 = var1;
            if (var2 != 0) {
               break label33;
            }

            if (var1 == null) {
               return false;
            }
         } catch (MatchException var4) {
            throw var4;
         }

         var10000 = var1;
      }

      try {
         boolean var5 = var10000.method_7909() instanceof class_5537;
         if (var2 != 0) {
            return var5;
         }

         if (var5) {
            return true;
         }
      } catch (MatchException var3) {
         throw var3;
      }

      return false;
   }

   private static double bbaab(class_310 var0, class_2338 var1) {
      return var0.field_1724.method_33571().method_1025(class_243.method_24953(var1));
   }

   private boolean bbaba(class_746 param1) {
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
      // 05: ifnonnull 0b
      // 08: bipush 0
      // 09: ireturn
      // 0a: athrow
      // 0b: bipush 0
      // 0c: istore 3
      // 0d: iload 3
      // 0e: ldc_w 308654128
      // 11: ldc_w -363047978
      // 14: ldc_w -1550953370
      // 17: ixor
      // 18: invokestatic qeaa361f143ee4a0894bd168fd9b30c66/qf4ccf8f5435d4a78bdca4d6a018b578e/aaabbbbba.a (II)I
      // 1b: ldc2_w 9184733577849699343
      // 1e: invokestatic qeaa361f143ee4a0894bd168fd9b30c66/qf4ccf8f5435d4a78bdca4d6a018b578e/aaabbbbba.baaa (IJ)I
      // 21: if_icmpge 4b
      // 24: aload 1
      // 25: invokevirtual net/minecraft/class_746.method_31548 ()Lnet/minecraft/class_1661;
      // 28: iload 3
      // 29: invokevirtual net/minecraft/class_1661.method_5438 (I)Lnet/minecraft/class_1799;
      // 2c: invokevirtual net/minecraft/class_1799.method_7960 ()Z
      // 2f: iload 2
      // 30: ifne 4c
      // 33: iload 2
      // 34: ifne 43
      // 37: goto 3b
      // 3a: athrow
      // 3b: ifeq 44
      // 3e: goto 42
      // 41: athrow
      // 42: bipush 1
      // 43: ireturn
      // 44: iinc 3 1
      // 47: iload 2
      // 48: ifeq 0d
      // 4b: bipush 0
      // 4c: ireturn
   }

   private boolean bbabb(class_1799 var1) {
      try {
         if (this.baaba(var1) != null) {
            return true;
         }
      } catch (MatchException var2) {
         throw var2;
      }

      return false;
   }

   private static List bbbaa() {
      // $VF: Couldn't be decompiled
      // Please report this to the Vineflower issue tracker, at https://github.com/Vineflower/vineflower/issues with a copy of the class file (if you have the rights to distribute it!)
      // java.lang.RuntimeException: parsing failure!
      //   at org.jetbrains.java.decompiler.modules.decompiler.decompose.DomHelper.parseGraph(DomHelper.java:211)
      //   at org.jetbrains.java.decompiler.main.rels.MethodProcessor.codeToJava(MethodProcessor.java:166)
      //
      // Bytecode:
      // 00: new java/util/ArrayList
      // 03: dup
      // 04: invokespecial java/util/ArrayList.<init> ()V
      // 07: astore 1
      // 08: getstatic qeaa361f143ee4a0894bd168fd9b30c66/qf4ccf8f5435d4a78bdca4d6a018b578e/baaabbaa.bba I
      // 0b: invokestatic qeaa361f143ee4a0894bd168fd9b30c66/qf4ccf8f5435d4a78bdca4d6a018b578e/ababbaa.values ()[Lqeaa361f143ee4a0894bd168fd9b30c66/qf4ccf8f5435d4a78bdca4d6a018b578e/ababbaa;
      // 0e: astore 2
      // 0f: istore 0
      // 10: aload 2
      // 11: arraylength
      // 12: istore 3
      // 13: bipush 0
      // 14: istore 4
      // 16: iload 4
      // 18: iload 3
      // 19: if_icmpge 4c
      // 1c: aload 2
      // 1d: iload 4
      // 1f: aaload
      // 20: astore 5
      // 22: iload 0
      // 23: ifne 48
      // 26: aload 5
      // 28: getfield qeaa361f143ee4a0894bd168fd9b30c66/qf4ccf8f5435d4a78bdca4d6a018b578e/ababbaa.abaa Lqeaa361f143ee4a0894bd168fd9b30c66/qf4ccf8f5435d4a78bdca4d6a018b578e/ababbbbaa;
      // 2b: ifnull 45
      // 2e: goto 32
      // 31: athrow
      // 32: aload 1
      // 33: aload 5
      // 35: getfield qeaa361f143ee4a0894bd168fd9b30c66/qf4ccf8f5435d4a78bdca4d6a018b578e/ababbaa.aa Lqeaa361f143ee4a0894bd168fd9b30c66/qf4ccf8f5435d4a78bdca4d6a018b578e/aaaa;
      // 38: invokevirtual qeaa361f143ee4a0894bd168fd9b30c66/qf4ccf8f5435d4a78bdca4d6a018b578e/aaaa.abb ()Lqeaa361f143ee4a0894bd168fd9b30c66/qf4ccf8f5435d4a78bdca4d6a018b578e/ababbbbaa;
      // 3b: invokeinterface java/util/List.add (Ljava/lang/Object;)Z 2
      // 40: pop
      // 41: goto 45
      // 44: athrow
      // 45: iinc 4 1
      // 48: iload 0
      // 49: ifeq 16
      // 4c: aload 1
      // 4d: areturn
   }

   private boolean bbbab(class_746 var1, class_2338 var2) {
      int var3 = baaabbaa.bba;

      class_746 var10000;
      label33: {
         try {
            var10000 = var1;
            if (var3 != 0) {
               break label33;
            }

            if (var1 == null) {
               return false;
            }
         } catch (MatchException var5) {
            throw var5;
         }

         var10000 = var1;
      }

      try {
         boolean var6 = var10000.method_5829().method_994(class_238.method_29968(class_243.method_24954(var2)).method_989(0.5, 0.5, 0.5).method_1014(0.49));
         if (var3 != 0) {
            return var6;
         }

         if (var6) {
            return true;
         }
      } catch (MatchException var4) {
         throw var4;
      }

      return false;
   }

   private void bbbba() {
      this.abbba = null;
      this.baaab = 0L;
      this.baba = null;
   }

   private boolean bbbbb(class_310 var1, class_2338 var2, class_243 var3) {
      return this.aaaaa(var1, var2, var3);
   }

   @Override
   public void abaab() {
      this.bab();
      this.aab.babbbb();
   }

   private int aaaaaa(class_1703 param1, List param2) {
      // $VF: Couldn't be decompiled
      // Please report this to the Vineflower issue tracker, at https://github.com/Vineflower/vineflower/issues with a copy of the class file (if you have the rights to distribute it!)
      // java.lang.RuntimeException: parsing failure!
      //   at org.jetbrains.java.decompiler.modules.decompiler.decompose.DomHelper.parseGraph(DomHelper.java:211)
      //   at org.jetbrains.java.decompiler.main.rels.MethodProcessor.codeToJava(MethodProcessor.java:166)
      //
      // Bytecode:
      // 00: getstatic qeaa361f143ee4a0894bd168fd9b30c66/qf4ccf8f5435d4a78bdca4d6a018b578e/baaabbaa.bba I
      // 03: bipush 0
      // 04: istore 4
      // 06: istore 3
      // 07: ldc_w 308654129
      // 0a: ldc_w 135649188
      // 0d: ldc_w -1497917016
      // 10: ixor
      // 11: invokestatic qeaa361f143ee4a0894bd168fd9b30c66/qf4ccf8f5435d4a78bdca4d6a018b578e/aaabbbbba.a (II)I
      // 14: bipush 0
      // 15: istore 5
      // 17: ldc2_w 5055919454839898618
      // 1a: invokestatic qeaa361f143ee4a0894bd168fd9b30c66/qf4ccf8f5435d4a78bdca4d6a018b578e/aaabbbbba.baaa (IJ)I
      // 1d: istore 6
      // 1f: iload 6
      // 21: aload 1
      // 22: getfield net/minecraft/class_1703.field_7761 Lnet/minecraft/class_2371;
      // 25: invokevirtual net/minecraft/class_2371.size ()I
      // 28: if_icmpge ee
      // 2b: aload 1
      // 2c: getfield net/minecraft/class_1703.field_7761 Lnet/minecraft/class_2371;
      // 2f: iload 6
      // 31: invokevirtual net/minecraft/class_2371.get (I)Ljava/lang/Object;
      // 34: checkcast net/minecraft/class_1735
      // 37: astore 7
      // 39: iload 3
      // 3a: ifne ea
      // 3d: aload 7
      // 3f: ifnull e7
      // 42: goto 46
      // 45: athrow
      // 46: aload 7
      // 48: iload 3
      // 49: ifne 60
      // 4c: goto 50
      // 4f: athrow
      // 50: getfield net/minecraft/class_1735.field_7874 I
      // 53: iflt e7
      // 56: goto 5a
      // 59: athrow
      // 5a: aload 7
      // 5c: goto 60
      // 5f: athrow
      // 60: iload 3
      // 61: ifne 7c
      // 64: invokevirtual net/minecraft/class_1735.method_7681 ()Z
      // 67: ifne 76
      // 6a: goto 6e
      // 6d: athrow
      // 6e: iload 3
      // 6f: ifeq e7
      // 72: goto 76
      // 75: athrow
      // 76: aload 7
      // 78: goto 7c
      // 7b: athrow
      // 7c: invokevirtual net/minecraft/class_1735.method_7677 ()Lnet/minecraft/class_1799;
      // 7f: astore 8
      // 81: iload 3
      // 82: aload 0
      // 83: aload 8
      // 85: invokevirtual qeaa361f143ee4a0894bd168fd9b30c66/qf4ccf8f5435d4a78bdca4d6a018b578e/aaabbbbba.baaba (Lnet/minecraft/class_1799;)Lqeaa361f143ee4a0894bd168fd9b30c66/qf4ccf8f5435d4a78bdca4d6a018b578e/ababbaa;
      // 88: astore 9
      // 8a: ifne a5
      // 8d: aload 9
      // 8f: ifnonnull 9e
      // 92: goto 96
      // 95: athrow
      // 96: iload 3
      // 97: ifeq e7
      // 9a: goto 9e
      // 9d: athrow
      // 9e: iinc 4 1
      // a1: goto a5
      // a4: athrow
      // a5: aload 0
      // a6: getfield qeaa361f143ee4a0894bd168fd9b30c66/qf4ccf8f5435d4a78bdca4d6a018b578e/aaabbbbba.bb Ljava/util/Map;
      // a9: aload 7
      // ab: getfield net/minecraft/class_1735.field_7874 I
      // ae: invokestatic java/lang/Integer.valueOf (I)Ljava/lang/Integer;
      // b1: invokeinterface java/util/Map.containsKey (Ljava/lang/Object;)Z 2
      // b6: iload 3
      // b7: ifne e3
      // ba: ifne e4
      // bd: goto c1
      // c0: athrow
      // c1: aload 2
      // c2: new qeaa361f143ee4a0894bd168fd9b30c66/qf4ccf8f5435d4a78bdca4d6a018b578e/babbab
      // c5: dup
      // c6: aload 7
      // c8: getfield net/minecraft/class_1735.field_7874 I
      // cb: aload 9
      // cd: aload 0
      // ce: aload 8
      // d0: aload 9
      // d2: invokevirtual qeaa361f143ee4a0894bd168fd9b30c66/qf4ccf8f5435d4a78bdca4d6a018b578e/aaabbbbba.babab (Lnet/minecraft/class_1799;Lqeaa361f143ee4a0894bd168fd9b30c66/qf4ccf8f5435d4a78bdca4d6a018b578e/ababbaa;)D
      // d5: iload 5
      // d7: invokespecial qeaa361f143ee4a0894bd168fd9b30c66/qf4ccf8f5435d4a78bdca4d6a018b578e/babbab.<init> (ILqeaa361f143ee4a0894bd168fd9b30c66/qf4ccf8f5435d4a78bdca4d6a018b578e/ababbaa;DI)V
      // da: invokeinterface java/util/List.add (Ljava/lang/Object;)Z 2
      // df: goto e3
      // e2: athrow
      // e3: pop
      // e4: iinc 5 1
      // e7: iinc 6 1
      // ea: iload 3
      // eb: ifeq 1f
      // ee: iload 4
      // f0: ireturn
   }

   private void aaaaab(class_310 param1, int param2) {
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
      // 06: ifne 46
      // 09: aload 1
      // 0a: invokevirtual qeaa361f143ee4a0894bd168fd9b30c66/qf4ccf8f5435d4a78bdca4d6a018b578e/aaabbbbba.abbaa (Lnet/minecraft/class_310;)Z
      // 0d: ifeq 45
      // 10: goto 14
      // 13: athrow
      // 14: iload 2
      // 15: iload 3
      // 16: ifne 25
      // 19: goto 1d
      // 1c: athrow
      // 1d: iflt 45
      // 20: goto 24
      // 23: athrow
      // 24: iload 2
      // 25: ldc_w 308654130
      // 28: ldc_w 1721333880
      // 2b: ldc_w 1360345020
      // 2e: ixor
      // 2f: invokestatic qeaa361f143ee4a0894bd168fd9b30c66/qf4ccf8f5435d4a78bdca4d6a018b578e/aaabbbbba.a (II)I
      // 32: ldc2_w 3056964015310786736
      // 35: invokestatic qeaa361f143ee4a0894bd168fd9b30c66/qf4ccf8f5435d4a78bdca4d6a018b578e/aaabbbbba.baaa (IJ)I
      // 38: if_icmpge 45
      // 3b: aload 1
      // 3c: aload 0
      // 3d: iload 2
      // 3e: invokestatic qeaa361f143ee4a0894bd168fd9b30c66/qf4ccf8f5435d4a78bdca4d6a018b578e/aabbabbbb.aaaabaa (Lnet/minecraft/class_310;Ljava/lang/Object;I)V
      // 41: goto 45
      // 44: athrow
      // 45: aload 0
      // 46: aconst_null
      // 47: putfield qeaa361f143ee4a0894bd168fd9b30c66/qf4ccf8f5435d4a78bdca4d6a018b578e/aaabbbbba.baba Lqeaa361f143ee4a0894bd168fd9b30c66/qf4ccf8f5435d4a78bdca4d6a018b578e/bbbbaaaa;
      // 4a: return
   }

   private boolean aaaaba(class_310 param1, class_2338 param2) {
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
      // 06: invokevirtual qeaa361f143ee4a0894bd168fd9b30c66/qf4ccf8f5435d4a78bdca4d6a018b578e/aaabbbbba.abbaa (Lnet/minecraft/class_310;)Z
      // 09: iload 3
      // 0a: ifne 21
      // 0d: ifeq 1c
      // 10: goto 14
      // 13: athrow
      // 14: aload 2
      // 15: ifnonnull 22
      // 18: goto 1c
      // 1b: athrow
      // 1c: bipush 0
      // 1d: goto 21
      // 20: athrow
      // 21: ireturn
      // 22: aload 1
      // 23: getfield net/minecraft/class_310.field_1687 Lnet/minecraft/class_638;
      // 26: aload 2
      // 27: invokevirtual net/minecraft/class_638.method_8320 (Lnet/minecraft/class_2338;)Lnet/minecraft/class_2680;
      // 2a: astore 4
      // 2c: aload 2
      // 2d: invokevirtual net/minecraft/class_2338.method_10074 ()Lnet/minecraft/class_2338;
      // 30: astore 5
      // 32: aload 1
      // 33: getfield net/minecraft/class_310.field_1687 Lnet/minecraft/class_638;
      // 36: aload 5
      // 38: invokevirtual net/minecraft/class_638.method_8320 (Lnet/minecraft/class_2338;)Lnet/minecraft/class_2680;
      // 3b: astore 6
      // 3d: aload 4
      // 3f: invokevirtual net/minecraft/class_2680.method_26215 ()Z
      // 42: iload 3
      // 43: ifne 6e
      // 46: ifne 61
      // 49: goto 4d
      // 4c: athrow
      // 4d: aload 4
      // 4f: invokevirtual net/minecraft/class_2680.method_45474 ()Z
      // 52: iload 3
      // 53: ifne 6e
      // 56: goto 5a
      // 59: athrow
      // 5a: ifeq c6
      // 5d: goto 61
      // 60: athrow
      // 61: aload 0
      // 62: aload 1
      // 63: getfield net/minecraft/class_310.field_1724 Lnet/minecraft/class_746;
      // 66: aload 2
      // 67: invokevirtual qeaa361f143ee4a0894bd168fd9b30c66/qf4ccf8f5435d4a78bdca4d6a018b578e/aaabbbbba.bbbab (Lnet/minecraft/class_746;Lnet/minecraft/class_2338;)Z
      // 6a: goto 6e
      // 6d: athrow
      // 6e: ifne c6
      // 71: aload 6
      // 73: iload 3
      // 74: ifne 8c
      // 77: goto 7b
      // 7a: athrow
      // 7b: ifnull c6
      // 7e: goto 82
      // 81: athrow
      // 82: aload 6
      // 84: iload 3
      // 85: ifne 9c
      // 88: goto 8c
      // 8b: athrow
      // 8c: invokevirtual net/minecraft/class_2680.method_26215 ()Z
      // 8f: ifne c6
      // 92: aload 6
      // 94: iload 3
      // 95: ifne ab
      // 98: goto 9c
      // 9b: athrow
      // 9c: invokevirtual net/minecraft/class_2680.method_26227 ()Lnet/minecraft/class_3610;
      // 9f: invokevirtual net/minecraft/class_3610.method_15769 ()Z
      // a2: ifeq c6
      // a5: aload 6
      // a7: goto ab
      // aa: athrow
      // ab: aload 1
      // ac: getfield net/minecraft/class_310.field_1687 Lnet/minecraft/class_638;
      // af: aload 5
      // b1: invokevirtual net/minecraft/class_2680.method_26220 (Lnet/minecraft/class_1922;Lnet/minecraft/class_2338;)Lnet/minecraft/class_265;
      // b4: invokevirtual net/minecraft/class_265.method_1110 ()Z
      // b7: iload 3
      // b8: ifne c3
      // bb: ifne c6
      // be: goto c2
      // c1: athrow
      // c2: bipush 1
      // c3: goto c7
      // c6: bipush 0
      // c7: ireturn
   }

   private boolean aaaabb(class_310 param1, class_2338 param2) {
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
      // 06: invokevirtual qeaa361f143ee4a0894bd168fd9b30c66/qf4ccf8f5435d4a78bdca4d6a018b578e/aaabbbbba.abbaa (Lnet/minecraft/class_310;)Z
      // 09: iload 3
      // 0a: ifne 3a
      // 0d: ifeq 39
      // 10: goto 14
      // 13: athrow
      // 14: aload 2
      // 15: ifnull 39
      // 18: goto 1c
      // 1b: athrow
      // 1c: aload 1
      // 1d: getfield net/minecraft/class_310.field_1687 Lnet/minecraft/class_638;
      // 20: aload 2
      // 21: invokevirtual net/minecraft/class_638.method_8320 (Lnet/minecraft/class_2338;)Lnet/minecraft/class_2680;
      // 24: getstatic net/minecraft/class_2246.field_10443 Lnet/minecraft/class_2248;
      // 27: invokevirtual net/minecraft/class_2680.method_27852 (Lnet/minecraft/class_2248;)Z
      // 2a: iload 3
      // 2b: ifne 3a
      // 2e: goto 32
      // 31: athrow
      // 32: ifne 3b
      // 35: goto 39
      // 38: athrow
      // 39: bipush 0
      // 3a: ireturn
      // 3b: aload 2
      // 3c: invokestatic net/minecraft/class_243.method_24953 (Lnet/minecraft/class_2382;)Lnet/minecraft/class_243;
      // 3f: astore 4
      // 41: aload 0
      // 42: iload 3
      // 43: ifne 5b
      // 46: aload 1
      // 47: getfield net/minecraft/class_310.field_1724 Lnet/minecraft/class_746;
      // 4a: aload 4
      // 4c: invokevirtual qeaa361f143ee4a0894bd168fd9b30c66/qf4ccf8f5435d4a78bdca4d6a018b578e/aaabbbbba.abbab (Lnet/minecraft/class_746;Lnet/minecraft/class_243;)Z
      // 4f: ifeq 71
      // 52: goto 56
      // 55: athrow
      // 56: aload 0
      // 57: goto 5b
      // 5a: athrow
      // 5b: aload 1
      // 5c: aload 4
      // 5e: aload 2
      // 5f: invokevirtual qeaa361f143ee4a0894bd168fd9b30c66/qf4ccf8f5435d4a78bdca4d6a018b578e/aaabbbbba.aaabb (Lnet/minecraft/class_310;Lnet/minecraft/class_243;Lnet/minecraft/class_2338;)Z
      // 62: iload 3
      // 63: ifne 6e
      // 66: ifeq 71
      // 69: goto 6d
      // 6c: athrow
      // 6d: bipush 1
      // 6e: goto 72
      // 71: bipush 0
      // 72: ireturn
   }

   private boolean aaabaa(class_310 param1, abbabbbbb param2, int param3) {
      // $VF: Couldn't be decompiled
      // Please report this to the Vineflower issue tracker, at https://github.com/Vineflower/vineflower/issues with a copy of the class file (if you have the rights to distribute it!)
      // java.lang.RuntimeException: parsing failure!
      //   at org.jetbrains.java.decompiler.modules.decompiler.decompose.DomHelper.parseGraph(DomHelper.java:211)
      //   at org.jetbrains.java.decompiler.main.rels.MethodProcessor.codeToJava(MethodProcessor.java:166)
      //
      // Bytecode:
      // 000: getstatic qeaa361f143ee4a0894bd168fd9b30c66/qf4ccf8f5435d4a78bdca4d6a018b578e/baaabbaa.bba I
      // 003: bipush 0
      // 004: istore 5
      // 006: istore 4
      // 008: aload 0
      // 009: aload 1
      // 00a: invokevirtual qeaa361f143ee4a0894bd168fd9b30c66/qf4ccf8f5435d4a78bdca4d6a018b578e/aaabbbbba.abbaa (Lnet/minecraft/class_310;)Z
      // 00d: iload 4
      // 00f: ifne 033
      // 012: ifeq 032
      // 015: goto 019
      // 018: athrow
      // 019: aload 0
      // 01a: aload 1
      // 01b: aload 2
      // 01c: invokevirtual qeaa361f143ee4a0894bd168fd9b30c66/qf4ccf8f5435d4a78bdca4d6a018b578e/abbabbbbb.ab ()Lnet/minecraft/class_2338;
      // 01f: invokevirtual qeaa361f143ee4a0894bd168fd9b30c66/qf4ccf8f5435d4a78bdca4d6a018b578e/aaabbbbba.aaaaba (Lnet/minecraft/class_310;Lnet/minecraft/class_2338;)Z
      // 022: iload 4
      // 024: ifne 033
      // 027: goto 02b
      // 02a: athrow
      // 02b: ifne 05e
      // 02e: goto 032
      // 031: athrow
      // 032: bipush 0
      // 033: istore 6
      // 035: aload 0
      // 036: bipush 0
      // 037: putfield qeaa361f143ee4a0894bd168fd9b30c66/qf4ccf8f5435d4a78bdca4d6a018b578e/aaabbbbba.aaba Z
      // 03a: aload 0
      // 03b: ldc_w 308654131
      // 03e: ldc_w 1693944433
      // 041: ldc_w -524881912
      // 044: ixor
      // 045: invokestatic qeaa361f143ee4a0894bd168fd9b30c66/qf4ccf8f5435d4a78bdca4d6a018b578e/aaabbbbba.a (II)I
      // 048: ldc2_w 1848905881191263389
      // 04b: invokestatic qeaa361f143ee4a0894bd168fd9b30c66/qf4ccf8f5435d4a78bdca4d6a018b578e/aaabbbbba.baaa (IJ)I
      // 04e: putfield qeaa361f143ee4a0894bd168fd9b30c66/qf4ccf8f5435d4a78bdca4d6a018b578e/aaabbbbba.aaabb I
      // 051: aload 0
      // 052: invokevirtual qeaa361f143ee4a0894bd168fd9b30c66/qf4ccf8f5435d4a78bdca4d6a018b578e/aaabbbbba.bbbba ()V
      // 055: aload 0
      // 056: aload 1
      // 057: iload 3
      // 058: invokevirtual qeaa361f143ee4a0894bd168fd9b30c66/qf4ccf8f5435d4a78bdca4d6a018b578e/aaabbbbba.aaaaab (Lnet/minecraft/class_310;I)V
      // 05b: iload 6
      // 05d: ireturn
      // 05e: aload 1
      // 05f: invokestatic qeaa361f143ee4a0894bd168fd9b30c66/qf4ccf8f5435d4a78bdca4d6a018b578e/aabbabbbb.ababbbb (Lnet/minecraft/class_310;)V
      // 062: aload 1
      // 063: getstatic net/minecraft/class_1268.field_5808 Lnet/minecraft/class_1268;
      // 066: aload 0
      // 067: aload 2
      // 068: invokevirtual qeaa361f143ee4a0894bd168fd9b30c66/qf4ccf8f5435d4a78bdca4d6a018b578e/aaabbbbba.aabab (Lqeaa361f143ee4a0894bd168fd9b30c66/qf4ccf8f5435d4a78bdca4d6a018b578e/abbabbbbb;)Lnet/minecraft/class_3965;
      // 06b: invokestatic qeaa361f143ee4a0894bd168fd9b30c66/qf4ccf8f5435d4a78bdca4d6a018b578e/aabbabbbb.babbbaa (Lnet/minecraft/class_310;Lnet/minecraft/class_1268;Lnet/minecraft/class_3965;)Lnet/minecraft/class_1269;
      // 06e: astore 6
      // 070: aload 6
      // 072: iload 4
      // 074: ifne 080
      // 077: ifnull 095
      // 07a: goto 07e
      // 07d: athrow
      // 07e: aload 6
      // 080: invokeinterface net/minecraft/class_1269.method_23665 ()Z 1
      // 085: iload 4
      // 087: ifne 092
      // 08a: ifeq 095
      // 08d: goto 091
      // 090: athrow
      // 091: bipush 1
      // 092: goto 096
      // 095: bipush 0
      // 096: istore 5
      // 098: iload 5
      // 09a: iload 4
      // 09c: ifne 0e8
      // 09f: ifeq 0e7
      // 0a2: goto 0a6
      // 0a5: athrow
      // 0a6: aload 0
      // 0a7: aload 2
      // 0a8: invokevirtual qeaa361f143ee4a0894bd168fd9b30c66/qf4ccf8f5435d4a78bdca4d6a018b578e/abbabbbbb.ab ()Lnet/minecraft/class_2338;
      // 0ab: putfield qeaa361f143ee4a0894bd168fd9b30c66/qf4ccf8f5435d4a78bdca4d6a018b578e/aaabbbbba.baaa Lnet/minecraft/class_2338;
      // 0ae: aload 0
      // 0af: aload 1
      // 0b0: getfield net/minecraft/class_310.field_1724 Lnet/minecraft/class_746;
      // 0b3: getfield net/minecraft/class_746.field_6012 I
      // 0b6: bipush 2
      // 0b7: iadd
      // 0b8: putfield qeaa361f143ee4a0894bd168fd9b30c66/qf4ccf8f5435d4a78bdca4d6a018b578e/aaabbbbba.abaa I
      // 0bb: bipush 1
      // 0bc: istore 7
      // 0be: aload 0
      // 0bf: bipush 0
      // 0c0: putfield qeaa361f143ee4a0894bd168fd9b30c66/qf4ccf8f5435d4a78bdca4d6a018b578e/aaabbbbba.aaba Z
      // 0c3: aload 0
      // 0c4: ldc_w 308654132
      // 0c7: ldc_w 1693944433
      // 0ca: ldc_w -894655183
      // 0cd: ixor
      // 0ce: invokestatic qeaa361f143ee4a0894bd168fd9b30c66/qf4ccf8f5435d4a78bdca4d6a018b578e/aaabbbbba.a (II)I
      // 0d1: ldc2_w 1848905881191263389
      // 0d4: invokestatic qeaa361f143ee4a0894bd168fd9b30c66/qf4ccf8f5435d4a78bdca4d6a018b578e/aaabbbbba.baaa (IJ)I
      // 0d7: putfield qeaa361f143ee4a0894bd168fd9b30c66/qf4ccf8f5435d4a78bdca4d6a018b578e/aaabbbbba.aaabb I
      // 0da: aload 0
      // 0db: invokevirtual qeaa361f143ee4a0894bd168fd9b30c66/qf4ccf8f5435d4a78bdca4d6a018b578e/aaabbbbba.bbbba ()V
      // 0de: aload 0
      // 0df: aload 1
      // 0e0: iload 3
      // 0e1: invokevirtual qeaa361f143ee4a0894bd168fd9b30c66/qf4ccf8f5435d4a78bdca4d6a018b578e/aaabbbbba.aaaaab (Lnet/minecraft/class_310;I)V
      // 0e4: iload 7
      // 0e6: ireturn
      // 0e7: bipush 0
      // 0e8: istore 7
      // 0ea: aload 0
      // 0eb: bipush 0
      // 0ec: putfield qeaa361f143ee4a0894bd168fd9b30c66/qf4ccf8f5435d4a78bdca4d6a018b578e/aaabbbbba.aaba Z
      // 0ef: aload 0
      // 0f0: ldc_w 308654133
      // 0f3: ldc_w 1693944433
      // 0f6: ldc_w 565062038
      // 0f9: ixor
      // 0fa: invokestatic qeaa361f143ee4a0894bd168fd9b30c66/qf4ccf8f5435d4a78bdca4d6a018b578e/aaabbbbba.a (II)I
      // 0fd: ldc2_w 1848905881191263389
      // 100: invokestatic qeaa361f143ee4a0894bd168fd9b30c66/qf4ccf8f5435d4a78bdca4d6a018b578e/aaabbbbba.baaa (IJ)I
      // 103: putfield qeaa361f143ee4a0894bd168fd9b30c66/qf4ccf8f5435d4a78bdca4d6a018b578e/aaabbbbba.aaabb I
      // 106: aload 0
      // 107: invokevirtual qeaa361f143ee4a0894bd168fd9b30c66/qf4ccf8f5435d4a78bdca4d6a018b578e/aaabbbbba.bbbba ()V
      // 10a: aload 0
      // 10b: aload 1
      // 10c: iload 3
      // 10d: invokevirtual qeaa361f143ee4a0894bd168fd9b30c66/qf4ccf8f5435d4a78bdca4d6a018b578e/aaabbbbba.aaaaab (Lnet/minecraft/class_310;I)V
      // 110: iload 7
      // 112: ireturn
      // 113: astore 8
      // 115: aload 0
      // 116: bipush 0
      // 117: putfield qeaa361f143ee4a0894bd168fd9b30c66/qf4ccf8f5435d4a78bdca4d6a018b578e/aaabbbbba.aaba Z
      // 11a: aload 0
      // 11b: ldc_w 308654134
      // 11e: ldc_w 1693944433
      // 121: ldc_w 1502533786
      // 124: ixor
      // 125: invokestatic qeaa361f143ee4a0894bd168fd9b30c66/qf4ccf8f5435d4a78bdca4d6a018b578e/aaabbbbba.a (II)I
      // 128: ldc2_w 1848905881191263389
      // 12b: invokestatic qeaa361f143ee4a0894bd168fd9b30c66/qf4ccf8f5435d4a78bdca4d6a018b578e/aaabbbbba.baaa (IJ)I
      // 12e: putfield qeaa361f143ee4a0894bd168fd9b30c66/qf4ccf8f5435d4a78bdca4d6a018b578e/aaabbbbba.aaabb I
      // 131: aload 0
      // 132: invokevirtual qeaa361f143ee4a0894bd168fd9b30c66/qf4ccf8f5435d4a78bdca4d6a018b578e/aaabbbbba.bbbba ()V
      // 135: aload 0
      // 136: aload 1
      // 137: iload 3
      // 138: invokevirtual qeaa361f143ee4a0894bd168fd9b30c66/qf4ccf8f5435d4a78bdca4d6a018b578e/aaabbbbba.aaaaab (Lnet/minecraft/class_310;I)V
      // 13b: aload 8
      // 13d: athrow
   }

   private boolean aaabab(class_1799 param1) {
      // $VF: Couldn't be decompiled
      // Please report this to the Vineflower issue tracker, at https://github.com/Vineflower/vineflower/issues with a copy of the class file (if you have the rights to distribute it!)
      // java.lang.RuntimeException: parsing failure!
      //   at org.jetbrains.java.decompiler.modules.decompiler.decompose.DomHelper.parseGraph(DomHelper.java:211)
      //   at org.jetbrains.java.decompiler.main.rels.MethodProcessor.codeToJava(MethodProcessor.java:166)
      //
      // Bytecode:
      // 00: getstatic qeaa361f143ee4a0894bd168fd9b30c66/qf4ccf8f5435d4a78bdca4d6a018b578e/baaabbaa.bba I
      // 03: aload 1
      // 04: invokevirtual net/minecraft/class_1799.method_7909 ()Lnet/minecraft/class_1792;
      // 07: astore 4
      // 09: istore 2
      // 0a: aload 4
      // 0c: iload 2
      // 0d: ifne 20
      // 10: instanceof net/minecraft/class_1747
      // 13: ifeq 3a
      // 16: goto 1a
      // 19: athrow
      // 1a: aload 4
      // 1c: goto 20
      // 1f: athrow
      // 20: checkcast net/minecraft/class_1747
      // 23: astore 3
      // 24: aload 3
      // 25: invokevirtual net/minecraft/class_1747.method_7711 ()Lnet/minecraft/class_2248;
      // 28: instanceof net/minecraft/class_2480
      // 2b: iload 2
      // 2c: ifne 37
      // 2f: ifeq 3a
      // 32: goto 36
      // 35: athrow
      // 36: bipush 1
      // 37: goto 3b
      // 3a: bipush 0
      // 3b: ireturn
   }

   private boolean aaabba(class_310 var1) {
      return this.aaabaa(var1, this.baab, this.aabab);
   }

   private boolean aaabbb(class_1799 param1) {
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
      // 05: invokevirtual net/minecraft/class_1799.method_57380 ()Lnet/minecraft/class_9326;
      // 08: getstatic net/minecraft/class_9334.field_49637 Lnet/minecraft/class_9331;
      // 0b: iload 2
      // 0c: ifne 24
      // 0f: invokevirtual net/minecraft/class_9326.method_57845 (Lnet/minecraft/class_9331;)Ljava/util/Optional;
      // 12: ifnonnull 2a
      // 15: goto 19
      // 18: athrow
      // 19: aload 1
      // 1a: invokevirtual net/minecraft/class_1799.method_57380 ()Lnet/minecraft/class_9326;
      // 1d: getstatic net/minecraft/class_9334.field_54199 Lnet/minecraft/class_9331;
      // 20: goto 24
      // 23: athrow
      // 24: invokevirtual net/minecraft/class_9326.method_57845 (Lnet/minecraft/class_9331;)Ljava/util/Optional;
      // 27: ifnull 2f
      // 2a: bipush 1
      // 2b: goto 30
      // 2e: athrow
      // 2f: bipush 0
      // 30: ireturn
   }

   private void aabaaa() {
      this.bbba = baaa(a(308654135, 1233959954 ^ 1843297682), 1848905881191263389L);
      this.aabaa = baaa(a(308654088, 1233959954 ^ -2056626109), 1848905881191263389L);
      this.bb.clear();
   }

   private void aabaab(class_1703 param1, int param2, int param3) {
      // $VF: Couldn't be decompiled
      // Please report this to the Vineflower issue tracker, at https://github.com/Vineflower/vineflower/issues with a copy of the class file (if you have the rights to distribute it!)
      // java.lang.RuntimeException: parsing failure!
      //   at org.jetbrains.java.decompiler.modules.decompiler.decompose.DomHelper.parseGraph(DomHelper.java:211)
      //   at org.jetbrains.java.decompiler.main.rels.MethodProcessor.codeToJava(MethodProcessor.java:166)
      //
      // Bytecode:
      // 00: getstatic qeaa361f143ee4a0894bd168fd9b30c66/qf4ccf8f5435d4a78bdca4d6a018b578e/baaabbaa.bba I
      // 03: aload 0
      // 04: aload 1
      // 05: iload 2
      // 06: invokevirtual qeaa361f143ee4a0894bd168fd9b30c66/qf4ccf8f5435d4a78bdca4d6a018b578e/aaabbbbba.abaaab (Lnet/minecraft/class_1703;I)Lnet/minecraft/class_1735;
      // 09: astore 5
      // 0b: istore 4
      // 0d: aload 5
      // 0f: iload 4
      // 11: ifne 1d
      // 14: ifnull 2c
      // 17: goto 1b
      // 1a: athrow
      // 1b: aload 5
      // 1d: iload 4
      // 1f: ifne 30
      // 22: invokevirtual net/minecraft/class_1735.method_7681 ()Z
      // 25: ifne 2e
      // 28: goto 2c
      // 2b: athrow
      // 2c: return
      // 2d: athrow
      // 2e: aload 5
      // 30: invokevirtual net/minecraft/class_1735.method_7677 ()Lnet/minecraft/class_1799;
      // 33: astore 6
      // 35: aload 6
      // 37: iload 4
      // 39: ifne 45
      // 3c: ifnull 7b
      // 3f: goto 43
      // 42: athrow
      // 43: aload 6
      // 45: iload 4
      // 47: ifne 7a
      // 4a: invokevirtual net/minecraft/class_1799.method_7960 ()Z
      // 4d: ifne 7b
      // 50: goto 54
      // 53: athrow
      // 54: aload 0
      // 55: getfield qeaa361f143ee4a0894bd168fd9b30c66/qf4ccf8f5435d4a78bdca4d6a018b578e/aaabbbbba.bb Ljava/util/Map;
      // 58: iload 2
      // 59: invokestatic java/lang/Integer.valueOf (I)Ljava/lang/Integer;
      // 5c: new qeaa361f143ee4a0894bd168fd9b30c66/qf4ccf8f5435d4a78bdca4d6a018b578e/bbbbaba
      // 5f: dup
      // 60: aload 6
      // 62: invokevirtual net/minecraft/class_1799.method_7909 ()Lnet/minecraft/class_1792;
      // 65: invokevirtual net/minecraft/class_1792.toString ()Ljava/lang/String;
      // 68: aload 6
      // 6a: invokevirtual net/minecraft/class_1799.method_7947 ()I
      // 6d: iload 3
      // 6e: invokespecial qeaa361f143ee4a0894bd168fd9b30c66/qf4ccf8f5435d4a78bdca4d6a018b578e/bbbbaba.<init> (Ljava/lang/String;II)V
      // 71: invokeinterface java/util/Map.put (Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object; 3
      // 76: goto 7a
      // 79: athrow
      // 7a: pop
      // 7b: return
   }

   private boolean aababa(class_746 param1) {
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
      // 11: getfield net/minecraft/class_746.field_7498 Lnet/minecraft/class_1723;
      // 14: ifnonnull 1a
      // 17: bipush 0
      // 18: ireturn
      // 19: athrow
      // 1a: bipush 5
      // 1b: istore 3
      // 1c: iload 3
      // 1d: ldc_w 308654089
      // 20: ldc_w 36647618
      // 23: ldc_w 1707680852
      // 26: ixor
      // 27: invokestatic qeaa361f143ee4a0894bd168fd9b30c66/qf4ccf8f5435d4a78bdca4d6a018b578e/aaabbbbba.a (II)I
      // 2a: ldc2_w 7516037135302912836
      // 2d: invokestatic qeaa361f143ee4a0894bd168fd9b30c66/qf4ccf8f5435d4a78bdca4d6a018b578e/aaabbbbba.baaa (IJ)I
      // 30: if_icmpgt 6d
      // 33: aload 1
      // 34: getfield net/minecraft/class_746.field_7498 Lnet/minecraft/class_1723;
      // 37: getfield net/minecraft/class_1723.field_7761 Lnet/minecraft/class_2371;
      // 3a: iload 3
      // 3b: invokevirtual net/minecraft/class_2371.get (I)Ljava/lang/Object;
      // 3e: checkcast net/minecraft/class_1735
      // 41: astore 4
      // 43: iload 2
      // 44: ifne 69
      // 47: aload 4
      // 49: ifnull 66
      // 4c: goto 50
      // 4f: athrow
      // 50: aload 4
      // 52: invokevirtual net/minecraft/class_1735.method_7681 ()Z
      // 55: iload 2
      // 56: ifne 65
      // 59: goto 5d
      // 5c: athrow
      // 5d: ifeq 66
      // 60: goto 64
      // 63: athrow
      // 64: bipush 1
      // 65: ireturn
      // 66: iinc 3 1
      // 69: iload 2
      // 6a: ifeq 1c
      // 6d: bipush 0
      // 6e: ireturn
   }

   private abbabbbbb aabbaa(class_310 param1) {
      // $VF: Couldn't be decompiled
      // Please report this to the Vineflower issue tracker, at https://github.com/Vineflower/vineflower/issues with a copy of the class file (if you have the rights to distribute it!)
      // java.lang.RuntimeException: parsing failure!
      //   at org.jetbrains.java.decompiler.modules.decompiler.decompose.DomHelper.parseGraph(DomHelper.java:211)
      //   at org.jetbrains.java.decompiler.main.rels.MethodProcessor.codeToJava(MethodProcessor.java:166)
      //
      // Bytecode:
      // 000: getstatic qeaa361f143ee4a0894bd168fd9b30c66/qf4ccf8f5435d4a78bdca4d6a018b578e/baaabbaa.bba I
      // 003: aload 1
      // 004: getfield net/minecraft/class_310.field_1724 Lnet/minecraft/class_746;
      // 007: invokevirtual net/minecraft/class_746.method_24515 ()Lnet/minecraft/class_2338;
      // 00a: astore 3
      // 00b: istore 2
      // 00c: new java/util/ArrayList
      // 00f: dup
      // 010: invokespecial java/util/ArrayList.<init> ()V
      // 013: astore 4
      // 015: bipush -1
      // 016: istore 5
      // 018: iload 5
      // 01a: bipush 1
      // 01b: if_icmpgt 0b5
      // 01e: iload 2
      // 01f: ifne 0c5
      // 022: ldc_w 308654090
      // 025: ldc_w 165126769
      // 028: ldc_w -1370311784
      // 02b: ixor
      // 02c: invokestatic qeaa361f143ee4a0894bd168fd9b30c66/qf4ccf8f5435d4a78bdca4d6a018b578e/aaabbbbba.a (II)I
      // 02f: ldc2_w 5565214972572179522
      // 032: invokestatic qeaa361f143ee4a0894bd168fd9b30c66/qf4ccf8f5435d4a78bdca4d6a018b578e/aaabbbbba.baaa (IJ)I
      // 035: istore 6
      // 037: iload 6
      // 039: bipush 2
      // 03a: if_icmpgt 0ae
      // 03d: iload 2
      // 03e: ifne 0b1
      // 041: ldc_w 308654091
      // 044: ldc_w 165126769
      // 047: ldc_w 336533922
      // 04a: ixor
      // 04b: invokestatic qeaa361f143ee4a0894bd168fd9b30c66/qf4ccf8f5435d4a78bdca4d6a018b578e/aaabbbbba.a (II)I
      // 04e: ldc2_w 3537344900731250523
      // 051: invokestatic qeaa361f143ee4a0894bd168fd9b30c66/qf4ccf8f5435d4a78bdca4d6a018b578e/aaabbbbba.baaa (IJ)I
      // 054: istore 7
      // 056: iload 7
      // 058: bipush 2
      // 059: if_icmpgt 0a7
      // 05c: iload 2
      // 05d: ifne 0aa
      // 060: iload 6
      // 062: iload 2
      // 063: ifne 09f
      // 066: goto 06a
      // 069: athrow
      // 06a: ifne 08a
      // 06d: goto 071
      // 070: athrow
      // 071: iload 7
      // 073: iload 2
      // 074: ifne 09f
      // 077: goto 07b
      // 07a: athrow
      // 07b: ifne 08a
      // 07e: goto 082
      // 081: athrow
      // 082: iload 2
      // 083: ifeq 0a0
      // 086: goto 08a
      // 089: athrow
      // 08a: aload 4
      // 08c: aload 3
      // 08d: iload 6
      // 08f: iload 5
      // 091: iload 7
      // 093: invokevirtual net/minecraft/class_2338.method_10069 (III)Lnet/minecraft/class_2338;
      // 096: invokeinterface java/util/List.add (Ljava/lang/Object;)Z 2
      // 09b: goto 09f
      // 09e: athrow
      // 09f: pop
      // 0a0: iinc 7 1
      // 0a3: iload 2
      // 0a4: ifeq 056
      // 0a7: iinc 6 1
      // 0aa: iload 2
      // 0ab: ifeq 037
      // 0ae: iinc 5 1
      // 0b1: iload 2
      // 0b2: ifeq 018
      // 0b5: aload 4
      // 0b7: aload 1
      // 0b8: invokedynamic applyAsDouble (Lnet/minecraft/class_310;)Ljava/util/function/ToDoubleFunction; bsm=java/lang/invoke/LambdaMetafactory.metafactory (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;Ljava/lang/invoke/MethodType;Ljava/lang/invoke/MethodHandle;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[ (Ljava/lang/Object;)D, qeaa361f143ee4a0894bd168fd9b30c66/qf4ccf8f5435d4a78bdca4d6a018b578e/aaabbbbba.bbaab (Lnet/minecraft/class_310;Lnet/minecraft/class_2338;)D, (Lnet/minecraft/class_2338;)D ]
      // 0bd: invokestatic java/util/Comparator.comparingDouble (Ljava/util/function/ToDoubleFunction;)Ljava/util/Comparator;
      // 0c0: invokeinterface java/util/List.sort (Ljava/util/Comparator;)V 2
      // 0c5: aload 4
      // 0c7: invokeinterface java/util/List.iterator ()Ljava/util/Iterator; 1
      // 0cc: astore 5
      // 0ce: aload 5
      // 0d0: invokeinterface java/util/Iterator.hasNext ()Z 1
      // 0d5: ifeq 14a
      // 0d8: aload 5
      // 0da: invokeinterface java/util/Iterator.next ()Ljava/lang/Object; 1
      // 0df: checkcast net/minecraft/class_2338
      // 0e2: astore 6
      // 0e4: aload 0
      // 0e5: aload 1
      // 0e6: aload 6
      // 0e8: invokevirtual qeaa361f143ee4a0894bd168fd9b30c66/qf4ccf8f5435d4a78bdca4d6a018b578e/aaabbbbba.aaaaba (Lnet/minecraft/class_310;Lnet/minecraft/class_2338;)Z
      // 0eb: ifne 0f6
      // 0ee: iload 2
      // 0ef: ifeq 0ce
      // 0f2: goto 0f6
      // 0f5: athrow
      // 0f6: aload 6
      // 0f8: invokevirtual net/minecraft/class_2338.method_10074 ()Lnet/minecraft/class_2338;
      // 0fb: astore 7
      // 0fd: aload 7
      // 0ff: invokestatic net/minecraft/class_243.method_24953 (Lnet/minecraft/class_2382;)Lnet/minecraft/class_243;
      // 102: dconst_0
      // 103: ldc2_w 0.4375
      // 106: dconst_0
      // 107: invokevirtual net/minecraft/class_243.method_1031 (DDD)Lnet/minecraft/class_243;
      // 10a: astore 8
      // 10c: aload 0
      // 10d: aload 1
      // 10e: iload 2
      // 10f: ifne 127
      // 112: getfield net/minecraft/class_310.field_1724 Lnet/minecraft/class_746;
      // 115: aload 8
      // 117: invokevirtual qeaa361f143ee4a0894bd168fd9b30c66/qf4ccf8f5435d4a78bdca4d6a018b578e/aaabbbbba.abbab (Lnet/minecraft/class_746;Lnet/minecraft/class_243;)Z
      // 11a: ifeq 146
      // 11d: goto 121
      // 120: athrow
      // 121: aload 0
      // 122: aload 1
      // 123: goto 127
      // 126: athrow
      // 127: aload 8
      // 129: aload 7
      // 12b: invokevirtual qeaa361f143ee4a0894bd168fd9b30c66/qf4ccf8f5435d4a78bdca4d6a018b578e/aaabbbbba.aaabb (Lnet/minecraft/class_310;Lnet/minecraft/class_243;Lnet/minecraft/class_2338;)Z
      // 12e: ifeq 146
      // 131: new qeaa361f143ee4a0894bd168fd9b30c66/qf4ccf8f5435d4a78bdca4d6a018b578e/abbabbbbb
      // 134: dup
      // 135: aload 6
      // 137: invokevirtual net/minecraft/class_2338.method_10062 ()Lnet/minecraft/class_2338;
      // 13a: aload 7
      // 13c: invokevirtual net/minecraft/class_2338.method_10062 ()Lnet/minecraft/class_2338;
      // 13f: aload 8
      // 141: invokespecial qeaa361f143ee4a0894bd168fd9b30c66/qf4ccf8f5435d4a78bdca4d6a018b578e/abbabbbbb.<init> (Lnet/minecraft/class_2338;Lnet/minecraft/class_2338;Lnet/minecraft/class_243;)V
      // 144: areturn
      // 145: athrow
      // 146: iload 2
      // 147: ifeq 0ce
      // 14a: aconst_null
      // 14b: areturn
   }

   private boolean aabbab(class_310 param1) {
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
      // 06: getfield net/minecraft/class_310.field_1724 Lnet/minecraft/class_746;
      // 09: invokevirtual qeaa361f143ee4a0894bd168fd9b30c66/qf4ccf8f5435d4a78bdca4d6a018b578e/aaabbbbba.bbaba (Lnet/minecraft/class_746;)Z
      // 0c: iload 2
      // 0d: ifne 2b
      // 10: ifeq 2a
      // 13: goto 17
      // 16: athrow
      // 17: aload 1
      // 18: invokestatic qeaa361f143ee4a0894bd168fd9b30c66/qf4ccf8f5435d4a78bdca4d6a018b578e/bbbbbbaa.baa (Lnet/minecraft/class_310;)Z
      // 1b: iload 2
      // 1c: ifne 2d
      // 1f: goto 23
      // 22: athrow
      // 23: ifne 2c
      // 26: goto 2a
      // 29: athrow
      // 2a: bipush 0
      // 2b: ireturn
      // 2c: bipush 5
      // 2d: istore 3
      // 2e: iload 3
      // 2f: ldc_w 308654092
      // 32: ldc_w -1445336301
      // 35: ldc_w -1220594677
      // 38: ixor
      // 39: invokestatic qeaa361f143ee4a0894bd168fd9b30c66/qf4ccf8f5435d4a78bdca4d6a018b578e/aaabbbbba.a (II)I
      // 3c: ldc2_w 7516037135302912836
      // 3f: invokestatic qeaa361f143ee4a0894bd168fd9b30c66/qf4ccf8f5435d4a78bdca4d6a018b578e/aaabbbbba.baaa (IJ)I
      // 42: if_icmpgt c4
      // 45: aload 1
      // 46: getfield net/minecraft/class_310.field_1724 Lnet/minecraft/class_746;
      // 49: getfield net/minecraft/class_746.field_7498 Lnet/minecraft/class_1723;
      // 4c: getfield net/minecraft/class_1723.field_7761 Lnet/minecraft/class_2371;
      // 4f: iload 3
      // 50: invokevirtual net/minecraft/class_2371.get (I)Ljava/lang/Object;
      // 53: checkcast net/minecraft/class_1735
      // 56: astore 4
      // 58: iload 2
      // 59: ifne c0
      // 5c: aload 4
      // 5e: ifnull bd
      // 61: goto 65
      // 64: athrow
      // 65: aload 4
      // 67: iload 2
      // 68: ifne 7f
      // 6b: goto 6f
      // 6e: athrow
      // 6f: invokevirtual net/minecraft/class_1735.method_7681 ()Z
      // 72: ifeq bd
      // 75: goto 79
      // 78: athrow
      // 79: aload 4
      // 7b: goto 7f
      // 7e: athrow
      // 7f: aload 1
      // 80: getfield net/minecraft/class_310.field_1724 Lnet/minecraft/class_746;
      // 83: invokevirtual net/minecraft/class_1735.method_7674 (Lnet/minecraft/class_1657;)Z
      // 86: iload 2
      // 87: ifne bc
      // 8a: ifne 99
      // 8d: goto 91
      // 90: athrow
      // 91: iload 2
      // 92: ifeq bd
      // 95: goto 99
      // 98: athrow
      // 99: aload 1
      // 9a: getfield net/minecraft/class_310.field_1761 Lnet/minecraft/class_636;
      // 9d: aload 1
      // 9e: getfield net/minecraft/class_310.field_1724 Lnet/minecraft/class_746;
      // a1: getfield net/minecraft/class_746.field_7498 Lnet/minecraft/class_1723;
      // a4: getfield net/minecraft/class_1723.field_7763 I
      // a7: iload 3
      // a8: bipush 0
      // a9: getstatic net/minecraft/class_1713.field_7794 Lnet/minecraft/class_1713;
      // ac: aload 1
      // ad: getfield net/minecraft/class_310.field_1724 Lnet/minecraft/class_746;
      // b0: invokevirtual net/minecraft/class_636.method_2906 (IIILnet/minecraft/class_1713;Lnet/minecraft/class_1657;)V
      // b3: aload 1
      // b4: invokestatic qeaa361f143ee4a0894bd168fd9b30c66/qf4ccf8f5435d4a78bdca4d6a018b578e/bbbbbbaa.baab (Lnet/minecraft/class_310;)V
      // b7: bipush 1
      // b8: goto bc
      // bb: athrow
      // bc: ireturn
      // bd: iinc 3 1
      // c0: iload 2
      // c1: ifeq 2e
      // c4: bipush 0
      // c5: ireturn
   }

   private static long aabbbb(int var0, long var1) {
      int var3 = (var0 ^ (int)var1 ^ a(308654093, 1214300245 ^ 806999221)) & a(308654094, 1214300245 ^ -494501131);
      if (abbab[var3] == null) {
         abbab[var3] = bbbb[var3] ^ var1;
      }

      return abbab[var3];
   }

   private boolean abaaaa(int param1, class_1703 param2, Entry param3) {
      // $VF: Couldn't be decompiled
      // Please report this to the Vineflower issue tracker, at https://github.com/Vineflower/vineflower/issues with a copy of the class file (if you have the rights to distribute it!)
      // java.lang.RuntimeException: parsing failure!
      //   at org.jetbrains.java.decompiler.modules.decompiler.decompose.DomHelper.parseGraph(DomHelper.java:211)
      //   at org.jetbrains.java.decompiler.main.rels.MethodProcessor.codeToJava(MethodProcessor.java:166)
      //
      // Bytecode:
      // 00: getstatic qeaa361f143ee4a0894bd168fd9b30c66/qf4ccf8f5435d4a78bdca4d6a018b578e/baaabbaa.bba I
      // 03: istore 4
      // 05: iload 1
      // 06: iload 4
      // 08: ifne 37
      // 0b: aload 3
      // 0c: invokeinterface java/util/Map$Entry.getValue ()Ljava/lang/Object; 1
      // 11: checkcast qeaa361f143ee4a0894bd168fd9b30c66/qf4ccf8f5435d4a78bdca4d6a018b578e/bbbbaba
      // 14: invokevirtual qeaa361f143ee4a0894bd168fd9b30c66/qf4ccf8f5435d4a78bdca4d6a018b578e/bbbbaba.b ()I
      // 17: isub
      // 18: ldc_w 308654095
      // 1b: ldc_w 403700716
      // 1e: ldc_w -1253228921
      // 21: ixor
      // 22: invokestatic qeaa361f143ee4a0894bd168fd9b30c66/qf4ccf8f5435d4a78bdca4d6a018b578e/aaabbbbba.a (II)I
      // 25: ldc2_w 7516037135302912836
      // 28: invokestatic qeaa361f143ee4a0894bd168fd9b30c66/qf4ccf8f5435d4a78bdca4d6a018b578e/aaabbbbba.baaa (IJ)I
      // 2b: if_icmplt 38
      // 2e: goto 32
      // 31: athrow
      // 32: bipush 1
      // 33: goto 37
      // 36: athrow
      // 37: ireturn
      // 38: aload 0
      // 39: aload 2
      // 3a: aload 3
      // 3b: invokeinterface java/util/Map$Entry.getKey ()Ljava/lang/Object; 1
      // 40: checkcast java/lang/Integer
      // 43: invokevirtual java/lang/Integer.intValue ()I
      // 46: invokevirtual qeaa361f143ee4a0894bd168fd9b30c66/qf4ccf8f5435d4a78bdca4d6a018b578e/aaabbbbba.abaaab (Lnet/minecraft/class_1703;I)Lnet/minecraft/class_1735;
      // 49: astore 5
      // 4b: aload 5
      // 4d: iload 4
      // 4f: ifne 5b
      // 52: ifnull 6a
      // 55: goto 59
      // 58: athrow
      // 59: aload 5
      // 5b: iload 4
      // 5d: ifne 6f
      // 60: invokevirtual net/minecraft/class_1735.method_7681 ()Z
      // 63: ifne 6d
      // 66: goto 6a
      // 69: athrow
      // 6a: bipush 1
      // 6b: ireturn
      // 6c: athrow
      // 6d: aload 5
      // 6f: invokevirtual net/minecraft/class_1735.method_7677 ()Lnet/minecraft/class_1799;
      // 72: astore 6
      // 74: aload 6
      // 76: iload 4
      // 78: ifne 84
      // 7b: ifnull b1
      // 7e: goto 82
      // 81: athrow
      // 82: aload 6
      // 84: invokevirtual net/minecraft/class_1799.method_7960 ()Z
      // 87: iload 4
      // 89: ifne b2
      // 8c: ifne b1
      // 8f: goto 93
      // 92: athrow
      // 93: aload 3
      // 94: invokeinterface java/util/Map$Entry.getValue ()Ljava/lang/Object; 1
      // 99: checkcast qeaa361f143ee4a0894bd168fd9b30c66/qf4ccf8f5435d4a78bdca4d6a018b578e/bbbbaba
      // 9c: aload 6
      // 9e: invokevirtual qeaa361f143ee4a0894bd168fd9b30c66/qf4ccf8f5435d4a78bdca4d6a018b578e/bbbbaba.ab (Lnet/minecraft/class_1799;)Z
      // a1: iload 4
      // a3: ifne b2
      // a6: goto aa
      // a9: athrow
      // aa: ifne b5
      // ad: goto b1
      // b0: athrow
      // b1: bipush 1
      // b2: goto b6
      // b5: bipush 0
      // b6: ireturn
   }

   private class_1735 abaaab(class_1703 param1, int param2) {
      // $VF: Couldn't be decompiled
      // Please report this to the Vineflower issue tracker, at https://github.com/Vineflower/vineflower/issues with a copy of the class file (if you have the rights to distribute it!)
      // java.lang.RuntimeException: parsing failure!
      //   at org.jetbrains.java.decompiler.modules.decompiler.decompose.DomHelper.parseGraph(DomHelper.java:211)
      //   at org.jetbrains.java.decompiler.main.rels.MethodProcessor.codeToJava(MethodProcessor.java:166)
      //
      // Bytecode:
      // 00: getstatic qeaa361f143ee4a0894bd168fd9b30c66/qf4ccf8f5435d4a78bdca4d6a018b578e/baaabbaa.bba I
      // 03: aload 1
      // 04: getfield net/minecraft/class_1703.field_7761 Lnet/minecraft/class_2371;
      // 07: invokevirtual net/minecraft/class_2371.iterator ()Ljava/util/Iterator;
      // 0a: astore 4
      // 0c: istore 3
      // 0d: aload 4
      // 0f: invokeinterface java/util/Iterator.hasNext ()Z 1
      // 14: ifeq 4c
      // 17: aload 4
      // 19: invokeinterface java/util/Iterator.next ()Ljava/lang/Object; 1
      // 1e: checkcast net/minecraft/class_1735
      // 21: astore 5
      // 23: aload 5
      // 25: iload 3
      // 26: ifne 32
      // 29: ifnull 48
      // 2c: goto 30
      // 2f: athrow
      // 30: aload 5
      // 32: iload 3
      // 33: ifne 47
      // 36: getfield net/minecraft/class_1735.field_7874 I
      // 39: iload 2
      // 3a: if_icmpne 48
      // 3d: goto 41
      // 40: athrow
      // 41: aload 5
      // 43: goto 47
      // 46: athrow
      // 47: areturn
      // 48: iload 3
      // 49: ifeq 0d
      // 4c: aconst_null
      // 4d: areturn
   }

   private double abaaba(class_1799 param1) {
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
      // 09: invokevirtual net/minecraft/class_1799.method_7963 ()Z
      // 0c: ifeq 1e
      // 0f: goto 13
      // 12: athrow
      // 13: aload 1
      // 14: goto 18
      // 17: athrow
      // 18: invokevirtual net/minecraft/class_1799.method_7936 ()I
      // 1b: ifgt 23
      // 1e: ldc2_w 100.0
      // 21: dreturn
      // 22: athrow
      // 23: ldc2_w 100.0
      // 26: aload 1
      // 27: invokevirtual net/minecraft/class_1799.method_7936 ()I
      // 2a: aload 1
      // 2b: invokevirtual net/minecraft/class_1799.method_7919 ()I
      // 2e: isub
      // 2f: i2d
      // 30: dmul
      // 31: aload 1
      // 32: invokevirtual net/minecraft/class_1799.method_7936 ()I
      // 35: i2d
      // 36: ddiv
      // 37: dreturn
   }

   private double abaabb(class_1799 var1) {
      class_9304 var3 = (class_9304)var1.method_58695(class_9334.field_49633, class_9304.field_49385);
      int var10000 = baaabbaa.bba;
      double var4 = 0.0;
      Iterator var6 = var3.method_57534().iterator();
      int var2 = var10000;

      while (true) {
         if (var6.hasNext()) {
            class_6880 var7 = (class_6880)var6.next();
            String var8 = var7.method_40230().map(aaabbbbba::abbbb).orElse("");
            int var9 = var3.method_57536(var7);
            var10 = var4;
            if (var2 != 0) {
               break;
            }

            var4 += var9 * this.aaba(var8);
            if (var2 == 0) {
               continue;
            }
         }

         var10 = var4;
         break;
      }

      return var10;
   }

   private double ababaa(class_1799 param1) {
      // $VF: Couldn't be decompiled
      // Please report this to the Vineflower issue tracker, at https://github.com/Vineflower/vineflower/issues with a copy of the class file (if you have the rights to distribute it!)
      // java.lang.NullPointerException: Cannot invoke "org.jetbrains.java.decompiler.code.cfg.ExceptionRangeCFG.isCircular()" because "range" is null
      //   at org.jetbrains.java.decompiler.modules.decompiler.decompose.DomHelper.graphToStatement(DomHelper.java:84)
      //   at org.jetbrains.java.decompiler.modules.decompiler.decompose.DomHelper.parseGraph(DomHelper.java:203)
      //   at org.jetbrains.java.decompiler.main.rels.MethodProcessor.codeToJava(MethodProcessor.java:166)
      //
      // Bytecode:
      // 00: getstatic qeaa361f143ee4a0894bd168fd9b30c66/qf4ccf8f5435d4a78bdca4d6a018b578e/baaabbaa.bba I
      // 03: dconst_0
      // 04: dstore 3
      // 05: istore 2
      // 06: aload 1
      // 07: getstatic net/minecraft/class_9334.field_49636 Lnet/minecraft/class_9331;
      // 0a: getstatic net/minecraft/class_9285.field_49326 Lnet/minecraft/class_9285;
      // 0d: invokevirtual net/minecraft/class_1799.method_58695 (Lnet/minecraft/class_9331;Ljava/lang/Object;)Ljava/lang/Object;
      // 10: checkcast net/minecraft/class_9285
      // 13: astore 5
      // 15: aload 5
      // 17: invokevirtual net/minecraft/class_9285.comp_2393 ()Ljava/util/List;
      // 1a: invokeinterface java/util/List.iterator ()Ljava/util/Iterator; 1
      // 1f: astore 6
      // 21: aload 6
      // 23: invokeinterface java/util/Iterator.hasNext ()Z 1
      // 28: ifeq e7
      // 2b: aload 6
      // 2d: invokeinterface java/util/Iterator.next ()Ljava/lang/Object; 1
      // 32: checkcast net/minecraft/class_9285$class_9287
      // 35: astore 7
      // 37: aload 7
      // 39: invokevirtual net/minecraft/class_9285$class_9287.comp_2395 ()Lnet/minecraft/class_6880;
      // 3c: iload 2
      // 3d: ifne 73
      // 40: getstatic net/minecraft/class_5134.field_23724 Lnet/minecraft/class_6880;
      // 43: invokeinterface net/minecraft/class_6880.equals (Ljava/lang/Object;)Z 2
      // 48: ifeq 62
      // 4b: goto 4f
      // 4e: athrow
      // 4f: dload 3
      // 50: aload 7
      // 52: invokevirtual net/minecraft/class_9285$class_9287.comp_2396 ()Lnet/minecraft/class_1322;
      // 55: invokevirtual net/minecraft/class_1322.comp_2449 ()D
      // 58: ldc2_w 80.0
      // 5b: dmul
      // 5c: dadd
      // 5d: dstore 3
      // 5e: iload 2
      // 5f: ifeq e3
      // 62: aload 7
      // 64: iload 2
      // 65: ifne 97
      // 68: goto 6c
      // 6b: athrow
      // 6c: invokevirtual net/minecraft/class_9285$class_9287.comp_2395 ()Lnet/minecraft/class_6880;
      // 6f: goto 73
      // 72: athrow
      // 73: getstatic net/minecraft/class_5134.field_23725 Lnet/minecraft/class_6880;
      // 76: invokeinterface net/minecraft/class_6880.equals (Ljava/lang/Object;)Z 2
      // 7b: ifeq 91
      // 7e: dload 3
      // 7f: aload 7
      // 81: invokevirtual net/minecraft/class_9285$class_9287.comp_2396 ()Lnet/minecraft/class_1322;
      // 84: invokevirtual net/minecraft/class_1322.comp_2449 ()D
      // 87: ldc2_w 45.0
      // 8a: dmul
      // 8b: dadd
      // 8c: dstore 3
      // 8d: iload 2
      // 8e: ifeq e3
      // 91: aload 7
      // 93: goto 97
      // 96: athrow
      // 97: invokevirtual net/minecraft/class_9285$class_9287.comp_2395 ()Lnet/minecraft/class_6880;
      // 9a: iload 2
      // 9b: ifne c9
      // 9e: getstatic net/minecraft/class_5134.field_23721 Lnet/minecraft/class_6880;
      // a1: invokeinterface net/minecraft/class_6880.equals (Ljava/lang/Object;)Z 2
      // a6: ifeq c0
      // a9: goto ad
      // ac: athrow
      // ad: dload 3
      // ae: aload 7
      // b0: invokevirtual net/minecraft/class_9285$class_9287.comp_2396 ()Lnet/minecraft/class_1322;
      // b3: invokevirtual net/minecraft/class_1322.comp_2449 ()D
      // b6: ldc2_w 65.0
      // b9: dmul
      // ba: dadd
      // bb: dstore 3
      // bc: iload 2
      // bd: ifeq e3
      // c0: aload 7
      // c2: invokevirtual net/minecraft/class_9285$class_9287.comp_2395 ()Lnet/minecraft/class_6880;
      // c5: goto c9
      // c8: athrow
      // c9: getstatic net/minecraft/class_5134.field_23723 Lnet/minecraft/class_6880;
      // cc: invokeinterface net/minecraft/class_6880.equals (Ljava/lang/Object;)Z 2
      // d1: ifeq e3
      // d4: dload 3
      // d5: aload 7
      // d7: invokevirtual net/minecraft/class_9285$class_9287.comp_2396 ()Lnet/minecraft/class_1322;
      // da: invokevirtual net/minecraft/class_1322.comp_2449 ()D
      // dd: ldc2_w 10.0
      // e0: dmul
      // e1: dadd
      // e2: dstore 3
      // e3: iload 2
      // e4: ifeq 21
      // e7: dload 3
      // e8: dreturn
   }
}
