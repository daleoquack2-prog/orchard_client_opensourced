package nsc;

import java.awt.Color;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import net.fabricmc.api.EnvType;
import net.fabricmc.api.Environment;
import net.minecraft.class_1297;
import net.minecraft.class_1306;
import net.minecraft.class_1799;
import net.minecraft.class_1937;
import net.minecraft.class_238;
import net.minecraft.class_243;
import net.minecraft.class_310;
import net.minecraft.class_332;
import net.minecraft.class_3532;
import net.minecraft.class_4184;
import net.minecraft.class_638;
import net.minecraft.class_746;

@Environment(EnvType.CLIENT)
public final class aabaab extends abbaabbaa {
   private static final int[] aaaba;
   private final abaabaaab ba;
   private int aaa;
   private static final int aab;
   private static final double aba = 0.18;
   private static final Integer[] abb;
   private static final double baa = 0.012;
   private static final double bab = 0.05;
   private class_243 bba;
   private static final Object[] aabaa;
   private static final double aa = 0.6;
   private final abbaaaaa bbb;
   private final Map aaaa;
   private static final int aaab;
   private final abbaaaaa aaba;
   private static final double aabb = 0.28;
   private static final double abaa = 0.3;
   private static final double abab = 1.0E-6;
   private static final double abba = 0.22;
   private static final double abbb = 0.22;
   private static final String[] baaa;
   private static final double bb = 0.22;
   private final abaabaaab baab;
   private static final long[] baba;
   private class_243 babb;
   private static final double ab = 1.0E-4;
   private static final double bbaa = 0.1;
   private final bababa bbab;
   private static final String[] bbba;
   private static final String[] aaabb;
   private static final float bbbb = -20.0F;
   private static final float aaaaa = 2.0F;
   private static final double aaaab = 0.15;

   private boolean aa(class_1297 var1, class_1297 var2) {
      return this.abab(var1, var2);
   }

   private static int ab(int var0, long var1) {
      int var3 = var0 ^ (int)(var1 & 32767L) ^ a(-1871813149, -593560384 ^ 1121199551);
      if (abb[var3] == null) {
         abb[var3] = (int)(baba[var3] ^ var1);
      }

      return abb[var3];
   }

   static float ba(float var0) {
      float var1 = var0 / 20.0F;
      var1 = (var1 * var1 + var1 * 2.0F) / 3.0F;
      return Math.min(var1, 1.0F);
   }

   private static String bbab(short var0, int var1, short var2) {
      int var7 = var1 ^ -1530057783;
      char[] var6 = aaabb[var7].toCharArray();
      StackTraceElement[] var8 = (StackTraceElement[])aabaa[var7];
      StackTraceElement[] var9;
      if (var8 != null) {
         var9 = var8;
      } else {
         var9 = new Throwable().getStackTrace();
         aabaa[var7] = var9;
      }

      StackTraceElement var10 = var9[1];
      int var4 = (var10.getClassName().hashCode() ^ var10.getMethodName().hashCode()) >> 16 ^ 62111;
      int var5 = 0;

      do {
         var6[var5] = (char)(var6[var5] ^ var5 ^ 11684 ^ switch (var5 % 10) {
            default -> 245;
            case 1 -> 24;
            case 2 -> 60;
            case 3 -> 74;
            case 4 -> 49;
            case 5 -> 135;
            case 6 -> 213;
            case 7 -> 102;
            case 8 -> 209;
            case 9 -> 124;
         } ^ var1 ^ var2 ^ var4 ^ var0);
      } while (++var5 < var6.length);

      return new String(var6).intern();
   }

   @Override
   public void aabbb(class_332 var1, int var2, int var3, float var4) {
   }

   private int bb() {
      return (int)Math.round((Double)this.bbab.abbb());
   }

   static List aaa(List param0) {
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
      // 006: ifne 01b
      // 009: invokeinterface java/util/List.size ()I 1
      // 00e: bipush 3
      // 00f: if_icmpge 01c
      // 012: goto 016
      // 015: athrow
      // 016: aload 0
      // 017: goto 01b
      // 01a: athrow
      // 01b: areturn
      // 01c: new java/util/ArrayList
      // 01f: dup
      // 020: aload 0
      // 021: invokeinterface java/util/List.size ()I 1
      // 026: bipush 4
      // 027: imul
      // 028: invokespecial java/util/ArrayList.<init> (I)V
      // 02b: astore 2
      // 02c: aload 2
      // 02d: aload 0
      // 02e: bipush 0
      // 02f: invokeinterface java/util/List.get (I)Ljava/lang/Object; 2
      // 034: checkcast net/minecraft/class_243
      // 037: invokeinterface java/util/List.add (Ljava/lang/Object;)Z 2
      // 03c: pop
      // 03d: aload 0
      // 03e: invokeinterface java/util/List.size ()I 1
      // 043: bipush 1
      // 044: isub
      // 045: istore 3
      // 046: bipush 0
      // 047: istore 4
      // 049: iload 4
      // 04b: iload 3
      // 04c: if_icmpge 11a
      // 04f: iload 1
      // 050: ifne 133
      // 053: aload 0
      // 054: iload 4
      // 056: invokeinterface java/util/List.get (I)Ljava/lang/Object; 2
      // 05b: checkcast net/minecraft/class_243
      // 05e: astore 5
      // 060: aload 0
      // 061: iload 4
      // 063: bipush 1
      // 064: iadd
      // 065: invokeinterface java/util/List.get (I)Ljava/lang/Object; 2
      // 06a: checkcast net/minecraft/class_243
      // 06d: astore 6
      // 06f: iload 4
      // 071: ifle 085
      // 074: aload 0
      // 075: iload 4
      // 077: bipush 1
      // 078: isub
      // 079: invokeinterface java/util/List.get (I)Ljava/lang/Object; 2
      // 07e: checkcast net/minecraft/class_243
      // 081: goto 092
      // 084: athrow
      // 085: aload 5
      // 087: ldc2_w 2.0
      // 08a: invokevirtual net/minecraft/class_243.method_1021 (D)Lnet/minecraft/class_243;
      // 08d: aload 6
      // 08f: invokevirtual net/minecraft/class_243.method_1020 (Lnet/minecraft/class_243;)Lnet/minecraft/class_243;
      // 092: astore 7
      // 094: iload 4
      // 096: bipush 2
      // 097: iadd
      // 098: iload 3
      // 099: if_icmpgt 0ad
      // 09c: aload 0
      // 09d: iload 4
      // 09f: bipush 2
      // 0a0: iadd
      // 0a1: invokeinterface java/util/List.get (I)Ljava/lang/Object; 2
      // 0a6: checkcast net/minecraft/class_243
      // 0a9: goto 0ba
      // 0ac: athrow
      // 0ad: aload 6
      // 0af: ldc2_w 2.0
      // 0b2: invokevirtual net/minecraft/class_243.method_1021 (D)Lnet/minecraft/class_243;
      // 0b5: aload 5
      // 0b7: invokevirtual net/minecraft/class_243.method_1020 (Lnet/minecraft/class_243;)Lnet/minecraft/class_243;
      // 0ba: astore 8
      // 0bc: aload 5
      // 0be: aload 6
      // 0c0: invokevirtual net/minecraft/class_243.method_1022 (Lnet/minecraft/class_243;)D
      // 0c3: ldc2_w 0.18
      // 0c6: ddiv
      // 0c7: invokestatic java/lang/Math.ceil (D)D
      // 0ca: d2i
      // 0cb: bipush 2
      // 0cc: ldc -1871813150
      // 0ce: ldc -1324100970
      // 0d0: ldc -611470212
      // 0d2: ixor
      // 0d3: invokestatic qeaa361f143ee4a0894bd168fd9b30c66/qf4ccf8f5435d4a78bdca4d6a018b578e/aabaab.a (II)I
      // 0d6: ldc2_w 3288438662106965362
      // 0d9: invokestatic qeaa361f143ee4a0894bd168fd9b30c66/qf4ccf8f5435d4a78bdca4d6a018b578e/aabaab.ab (IJ)I
      // 0dc: invokestatic net/minecraft/class_3532.method_15340 (III)I
      // 0df: istore 9
      // 0e1: bipush 1
      // 0e2: istore 10
      // 0e4: iload 10
      // 0e6: iload 9
      // 0e8: if_icmpgt 113
      // 0eb: aload 2
      // 0ec: iload 1
      // 0ed: ifne 134
      // 0f0: aload 7
      // 0f2: aload 5
      // 0f4: aload 6
      // 0f6: aload 8
      // 0f8: iload 10
      // 0fa: i2d
      // 0fb: iload 9
      // 0fd: i2d
      // 0fe: ddiv
      // 0ff: invokestatic qeaa361f143ee4a0894bd168fd9b30c66/qf4ccf8f5435d4a78bdca4d6a018b578e/aabaab.abaa (Lnet/minecraft/class_243;Lnet/minecraft/class_243;Lnet/minecraft/class_243;Lnet/minecraft/class_243;D)Lnet/minecraft/class_243;
      // 102: invokeinterface java/util/List.add (Ljava/lang/Object;)Z 2
      // 107: pop
      // 108: iload 1
      // 109: iinc 10 1
      // 10c: ifeq 0e4
      // 10f: goto 113
      // 112: athrow
      // 113: iinc 4 1
      // 116: iload 1
      // 117: ifeq 049
      // 11a: aload 2
      // 11b: aload 2
      // 11c: invokeinterface java/util/List.size ()I 1
      // 121: bipush 1
      // 122: isub
      // 123: aload 0
      // 124: iload 3
      // 125: invokeinterface java/util/List.get (I)Ljava/lang/Object; 2
      // 12a: checkcast net/minecraft/class_243
      // 12d: invokeinterface java/util/List.set (ILjava/lang/Object;)Ljava/lang/Object; 3
      // 132: pop
      // 133: aload 2
      // 134: areturn
   }

   @Override
   public void aabaa() {
      this.aaaa.clear();
      this.aaa = ab(a(-1871813151, 1347573768 ^ 171394993), 4930094189148647409L);
   }

   @Override
   public void baa(aabbbbaaa param1) {
      // $VF: Couldn't be decompiled
      // Please report this to the Vineflower issue tracker, at https://github.com/Vineflower/vineflower/issues with a copy of the class file (if you have the rights to distribute it!)
      // java.lang.RuntimeException: parsing failure!
      //   at org.jetbrains.java.decompiler.modules.decompiler.decompose.DomHelper.parseGraph(DomHelper.java:211)
      //   at org.jetbrains.java.decompiler.main.rels.MethodProcessor.codeToJava(MethodProcessor.java:166)
      //
      // Bytecode:
      // 00: getstatic qeaa361f143ee4a0894bd168fd9b30c66/qf4ccf8f5435d4a78bdca4d6a018b578e/baaabbaa.bba I
      // 03: istore 2
      // 04: iload 2
      // 05: invokestatic net/minecraft/class_310.method_1551 ()Lnet/minecraft/class_310;
      // 08: astore 3
      // 09: ifne 55
      // 0c: aload 0
      // 0d: invokevirtual qeaa361f143ee4a0894bd168fd9b30c66/qf4ccf8f5435d4a78bdca4d6a018b578e/aabaab.babbaab ()Z
      // 10: ifeq 48
      // 13: goto 17
      // 16: athrow
      // 17: aload 1
      // 18: invokestatic qeaa361f143ee4a0894bd168fd9b30c66/qf4ccf8f5435d4a78bdca4d6a018b578e/bbaabbaa.bba (Ljava/lang/Object;)Z
      // 1b: ifeq 48
      // 1e: goto 22
      // 21: athrow
      // 22: aload 3
      // 23: iload 2
      // 24: ifne 3a
      // 27: goto 2b
      // 2a: athrow
      // 2b: getfield net/minecraft/class_310.field_1724 Lnet/minecraft/class_746;
      // 2e: ifnull 48
      // 31: goto 35
      // 34: athrow
      // 35: aload 3
      // 36: goto 3a
      // 39: athrow
      // 3a: iload 2
      // 3b: ifne 57
      // 3e: getfield net/minecraft/class_310.field_1687 Lnet/minecraft/class_638;
      // 41: ifnonnull 56
      // 44: goto 48
      // 47: athrow
      // 48: aload 0
      // 49: getfield qeaa361f143ee4a0894bd168fd9b30c66/qf4ccf8f5435d4a78bdca4d6a018b578e/aabaab.aaaa Ljava/util/Map;
      // 4c: invokeinterface java/util/Map.clear ()V 1
      // 51: goto 55
      // 54: athrow
      // 55: return
      // 56: aload 3
      // 57: invokestatic qeaa361f143ee4a0894bd168fd9b30c66/qf4ccf8f5435d4a78bdca4d6a018b578e/aabbabbbb.abbaa (Lnet/minecraft/class_310;)F
      // 5a: fstore 4
      // 5c: aload 0
      // 5d: iload 2
      // 5e: ifne 91
      // 61: aload 1
      // 62: aload 3
      // 63: fload 4
      // 65: invokevirtual qeaa361f143ee4a0894bd168fd9b30c66/qf4ccf8f5435d4a78bdca4d6a018b578e/aabaab.abbb (Lqeaa361f143ee4a0894bd168fd9b30c66/qf4ccf8f5435d4a78bdca4d6a018b578e/aabbbbaaa;Lnet/minecraft/class_310;F)V
      // 68: aload 0
      // 69: getfield qeaa361f143ee4a0894bd168fd9b30c66/qf4ccf8f5435d4a78bdca4d6a018b578e/aabaab.bbb Lqeaa361f143ee4a0894bd168fd9b30c66/qf4ccf8f5435d4a78bdca4d6a018b578e/abbaaaaa;
      // 6c: invokevirtual qeaa361f143ee4a0894bd168fd9b30c66/qf4ccf8f5435d4a78bdca4d6a018b578e/abbaaaaa.abbb ()Ljava/lang/Object;
      // 6f: checkcast java/lang/Boolean
      // 72: invokevirtual java/lang/Boolean.booleanValue ()Z
      // 75: ifeq 8c
      // 78: goto 7c
      // 7b: athrow
      // 7c: aload 0
      // 7d: aload 1
      // 7e: aload 3
      // 7f: fload 4
      // 81: invokevirtual qeaa361f143ee4a0894bd168fd9b30c66/qf4ccf8f5435d4a78bdca4d6a018b578e/aabaab.babb (Lqeaa361f143ee4a0894bd168fd9b30c66/qf4ccf8f5435d4a78bdca4d6a018b578e/aabbbbaaa;Lnet/minecraft/class_310;F)V
      // 84: iload 2
      // 85: ifeq 99
      // 88: goto 8c
      // 8b: athrow
      // 8c: aload 0
      // 8d: goto 91
      // 90: athrow
      // 91: getfield qeaa361f143ee4a0894bd168fd9b30c66/qf4ccf8f5435d4a78bdca4d6a018b578e/aabaab.aaaa Ljava/util/Map;
      // 94: invokeinterface java/util/Map.clear ()V 1
      // 99: return
   }

   static class_243 aab(float var0, float var1) {
      float var2 = (float) (Math.PI / 180.0);
      float var3 = class_3532.method_15362(-var1 * var2 - (float) Math.PI);
      float var4 = class_3532.method_15374(-var1 * var2 - (float) Math.PI);
      float var5 = -class_3532.method_15362(-var0 * var2);
      float var6 = class_3532.method_15374(-var0 * var2);
      class_243 var7 = new class_243(-var4, class_3532.method_15363(-(var6 / var5), -5.0F, 5.0F), -var3);
      double var8 = var7.method_1033();

      try {
         if (var8 > 1.0E-6) {
            return var7.method_1021(0.6 / var8 + 0.5);
         }
      } catch (MatchException var10) {
         throw var10;
      }

      return var7;
   }

   private aaaaba aba(class_1937 param1, class_1297 param2, class_243 param3, class_243 param4, double param5) {
      // $VF: Couldn't be decompiled
      // Please report this to the Vineflower issue tracker, at https://github.com/Vineflower/vineflower/issues with a copy of the class file (if you have the rights to distribute it!)
      // java.lang.RuntimeException: parsing failure!
      //   at org.jetbrains.java.decompiler.modules.decompiler.decompose.DomHelper.parseGraph(DomHelper.java:211)
      //   at org.jetbrains.java.decompiler.main.rels.MethodProcessor.codeToJava(MethodProcessor.java:166)
      //
      // Bytecode:
      // 00: aconst_null
      // 01: astore 8
      // 03: new net/minecraft/class_238
      // 06: dup
      // 07: aload 3
      // 08: aload 4
      // 0a: invokespecial net/minecraft/class_238.<init> (Lnet/minecraft/class_243;Lnet/minecraft/class_243;)V
      // 0d: dconst_1
      // 0e: invokevirtual net/minecraft/class_238.method_1014 (D)Lnet/minecraft/class_238;
      // 11: astore 9
      // 13: getstatic qeaa361f143ee4a0894bd168fd9b30c66/qf4ccf8f5435d4a78bdca4d6a018b578e/baaabbaa.bba I
      // 16: aload 1
      // 17: aload 2
      // 18: aload 9
      // 1a: aload 0
      // 1b: aload 2
      // 1c: invokedynamic test (Lqeaa361f143ee4a0894bd168fd9b30c66/qf4ccf8f5435d4a78bdca4d6a018b578e/aabaab;Lnet/minecraft/class_1297;)Ljava/util/function/Predicate; bsm=java/lang/invoke/LambdaMetafactory.metafactory (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;Ljava/lang/invoke/MethodType;Ljava/lang/invoke/MethodHandle;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[ (Ljava/lang/Object;)Z, qeaa361f143ee4a0894bd168fd9b30c66/qf4ccf8f5435d4a78bdca4d6a018b578e/aabaab.aa (Lnet/minecraft/class_1297;Lnet/minecraft/class_1297;)Z, (Lnet/minecraft/class_1297;)Z ]
      // 21: invokevirtual net/minecraft/class_1937.method_8333 (Lnet/minecraft/class_1297;Lnet/minecraft/class_238;Ljava/util/function/Predicate;)Ljava/util/List;
      // 24: invokeinterface java/util/List.iterator ()Ljava/util/Iterator; 1
      // 29: astore 10
      // 2b: istore 7
      // 2d: aload 10
      // 2f: invokeinterface java/util/Iterator.hasNext ()Z 1
      // 34: ifeq b0
      // 37: aload 10
      // 39: invokeinterface java/util/Iterator.next ()Ljava/lang/Object; 1
      // 3e: checkcast net/minecraft/class_1297
      // 41: astore 11
      // 43: aload 11
      // 45: invokevirtual net/minecraft/class_1297.method_5829 ()Lnet/minecraft/class_238;
      // 48: dload 5
      // 4a: invokevirtual net/minecraft/class_238.method_1014 (D)Lnet/minecraft/class_238;
      // 4d: aload 3
      // 4e: aload 4
      // 50: invokevirtual net/minecraft/class_238.method_992 (Lnet/minecraft/class_243;Lnet/minecraft/class_243;)Ljava/util/Optional;
      // 53: aconst_null
      // 54: invokevirtual java/util/Optional.orElse (Ljava/lang/Object;)Ljava/lang/Object;
      // 57: checkcast net/minecraft/class_243
      // 5a: astore 12
      // 5c: aload 12
      // 5e: iload 7
      // 60: ifne 74
      // 63: ifnonnull 73
      // 66: goto 6a
      // 69: athrow
      // 6a: iload 7
      // 6c: ifeq 2d
      // 6f: goto 73
      // 72: athrow
      // 73: aload 3
      // 74: aload 12
      // 76: invokevirtual net/minecraft/class_243.method_1025 (Lnet/minecraft/class_243;)D
      // 79: dstore 13
      // 7b: aload 8
      // 7d: iload 7
      // 7f: ifne a9
      // 82: ifnull 98
      // 85: goto 89
      // 88: athrow
      // 89: dload 13
      // 8b: aload 8
      // 8d: invokevirtual qeaa361f143ee4a0894bd168fd9b30c66/qf4ccf8f5435d4a78bdca4d6a018b578e/aaaaba.a ()D
      // 90: dcmpg
      // 91: ifge ab
      // 94: goto 98
      // 97: athrow
      // 98: new qeaa361f143ee4a0894bd168fd9b30c66/qf4ccf8f5435d4a78bdca4d6a018b578e/aaaaba
      // 9b: dup
      // 9c: aload 11
      // 9e: aload 12
      // a0: dload 13
      // a2: invokespecial qeaa361f143ee4a0894bd168fd9b30c66/qf4ccf8f5435d4a78bdca4d6a018b578e/aaaaba.<init> (Lnet/minecraft/class_1297;Lnet/minecraft/class_243;D)V
      // a5: goto a9
      // a8: athrow
      // a9: astore 8
      // ab: iload 7
      // ad: ifeq 2d
      // b0: aload 8
      // b2: areturn
   }

   private List abb(class_1799 param1, class_746 param2, float param3, float param4, float param5) {
      // $VF: Couldn't be decompiled
      // Please report this to the Vineflower issue tracker, at https://github.com/Vineflower/vineflower/issues with a copy of the class file (if you have the rights to distribute it!)
      // java.lang.RuntimeException: parsing failure!
      //   at org.jetbrains.java.decompiler.modules.decompiler.decompose.DomHelper.parseGraph(DomHelper.java:211)
      //   at org.jetbrains.java.decompiler.main.rels.MethodProcessor.codeToJava(MethodProcessor.java:166)
      //
      // Bytecode:
      // 000: aload 1
      // 001: invokevirtual net/minecraft/class_1799.method_7909 ()Lnet/minecraft/class_1792;
      // 004: astore 7
      // 006: getstatic qeaa361f143ee4a0894bd168fd9b30c66/qf4ccf8f5435d4a78bdca4d6a018b578e/baaabbaa.bba I
      // 009: new net/minecraft/class_243
      // 00c: dup
      // 00d: dconst_0
      // 00e: ldc2_w -0.1
      // 011: dconst_0
      // 012: invokespecial net/minecraft/class_243.<init> (DDD)V
      // 015: astore 8
      // 017: istore 6
      // 019: new java/util/ArrayList
      // 01c: dup
      // 01d: bipush 3
      // 01e: invokespecial java/util/ArrayList.<init> (I)V
      // 021: astore 9
      // 023: aload 7
      // 025: iload 6
      // 027: ifne 0a0
      // 02a: instanceof net/minecraft/class_1753
      // 02d: ifeq 09a
      // 030: goto 034
      // 033: athrow
      // 034: aload 2
      // 035: iload 6
      // 037: ifne 04d
      // 03a: goto 03e
      // 03d: athrow
      // 03e: invokevirtual net/minecraft/class_746.method_6115 ()Z
      // 041: ifeq 05a
      // 044: goto 048
      // 047: athrow
      // 048: aload 2
      // 049: goto 04d
      // 04c: athrow
      // 04d: invokevirtual net/minecraft/class_746.method_6048 ()I
      // 050: i2f
      // 051: fload 5
      // 053: fadd
      // 054: invokestatic qeaa361f143ee4a0894bd168fd9b30c66/qf4ccf8f5435d4a78bdca4d6a018b578e/aabaab.ba (F)F
      // 057: goto 05b
      // 05a: fconst_0
      // 05b: fstore 10
      // 05d: fload 10
      // 05f: ldc_w 0.1
      // 062: fcmpl
      // 063: iload 6
      // 065: ifne 094
      // 068: iflt 095
      // 06b: goto 06f
      // 06e: athrow
      // 06f: aload 9
      // 071: new qeaa361f143ee4a0894bd168fd9b30c66/qf4ccf8f5435d4a78bdca4d6a018b578e/aabb
      // 074: dup
      // 075: fload 3
      // 076: fload 4
      // 078: fconst_0
      // 079: ldc2_w 3.0
      // 07c: fload 10
      // 07e: f2d
      // 07f: dmul
      // 080: invokestatic qeaa361f143ee4a0894bd168fd9b30c66/qf4ccf8f5435d4a78bdca4d6a018b578e/aabaab.aaaa (FFFD)Lnet/minecraft/class_243;
      // 083: getstatic qeaa361f143ee4a0894bd168fd9b30c66/qf4ccf8f5435d4a78bdca4d6a018b578e/abaabb.b Lqeaa361f143ee4a0894bd168fd9b30c66/qf4ccf8f5435d4a78bdca4d6a018b578e/abaabb;
      // 086: aload 8
      // 088: invokespecial qeaa361f143ee4a0894bd168fd9b30c66/qf4ccf8f5435d4a78bdca4d6a018b578e/aabb.<init> (Lnet/minecraft/class_243;Lqeaa361f143ee4a0894bd168fd9b30c66/qf4ccf8f5435d4a78bdca4d6a018b578e/abaabb;Lnet/minecraft/class_243;)V
      // 08b: invokeinterface java/util/List.add (Ljava/lang/Object;)Z 2
      // 090: goto 094
      // 093: athrow
      // 094: pop
      // 095: iload 6
      // 097: ifeq 2a5
      // 09a: aload 7
      // 09c: goto 0a0
      // 09f: athrow
      // 0a0: iload 6
      // 0a2: ifne 0d8
      // 0a5: instanceof net/minecraft/class_1764
      // 0a8: ifeq 0d2
      // 0ab: goto 0af
      // 0ae: athrow
      // 0af: aload 1
      // 0b0: invokestatic net/minecraft/class_1764.method_7781 (Lnet/minecraft/class_1799;)Z
      // 0b3: ifeq 2a5
      // 0b6: goto 0ba
      // 0b9: athrow
      // 0ba: aload 0
      // 0bb: aload 1
      // 0bc: fload 3
      // 0bd: fload 4
      // 0bf: fconst_0
      // 0c0: dconst_1
      // 0c1: invokestatic qeaa361f143ee4a0894bd168fd9b30c66/qf4ccf8f5435d4a78bdca4d6a018b578e/aabaab.aaaa (FFFD)Lnet/minecraft/class_243;
      // 0c4: aload 9
      // 0c6: invokevirtual qeaa361f143ee4a0894bd168fd9b30c66/qf4ccf8f5435d4a78bdca4d6a018b578e/aabaab.baab (Lnet/minecraft/class_1799;Lnet/minecraft/class_243;Ljava/util/List;)V
      // 0c9: iload 6
      // 0cb: ifeq 2a5
      // 0ce: goto 0d2
      // 0d1: athrow
      // 0d2: aload 7
      // 0d4: goto 0d8
      // 0d7: athrow
      // 0d8: iload 6
      // 0da: ifne 14f
      // 0dd: instanceof net/minecraft/class_1835
      // 0e0: ifeq 149
      // 0e3: goto 0e7
      // 0e6: athrow
      // 0e7: aload 2
      // 0e8: iload 6
      // 0ea: ifne 100
      // 0ed: goto 0f1
      // 0f0: athrow
      // 0f1: invokevirtual net/minecraft/class_746.method_6115 ()Z
      // 0f4: ifeq 2a5
      // 0f7: goto 0fb
      // 0fa: athrow
      // 0fb: aload 2
      // 0fc: goto 100
      // 0ff: athrow
      // 100: invokevirtual net/minecraft/class_746.method_6048 ()I
      // 103: iload 6
      // 105: ifne 143
      // 108: ldc_w -1871813152
      // 10b: ldc_w -380805820
      // 10e: ldc_w -1309477311
      // 111: ixor
      // 112: invokestatic qeaa361f143ee4a0894bd168fd9b30c66/qf4ccf8f5435d4a78bdca4d6a018b578e/aabaab.a (II)I
      // 115: ldc2_w 1036028107607433685
      // 118: invokestatic qeaa361f143ee4a0894bd168fd9b30c66/qf4ccf8f5435d4a78bdca4d6a018b578e/aabaab.ab (IJ)I
      // 11b: if_icmplt 2a5
      // 11e: goto 122
      // 121: athrow
      // 122: aload 9
      // 124: new qeaa361f143ee4a0894bd168fd9b30c66/qf4ccf8f5435d4a78bdca4d6a018b578e/aabb
      // 127: dup
      // 128: fload 3
      // 129: fload 4
      // 12b: fconst_0
      // 12c: ldc2_w 2.5
      // 12f: invokestatic qeaa361f143ee4a0894bd168fd9b30c66/qf4ccf8f5435d4a78bdca4d6a018b578e/aabaab.aaaa (FFFD)Lnet/minecraft/class_243;
      // 132: getstatic qeaa361f143ee4a0894bd168fd9b30c66/qf4ccf8f5435d4a78bdca4d6a018b578e/abaabb.aaab Lqeaa361f143ee4a0894bd168fd9b30c66/qf4ccf8f5435d4a78bdca4d6a018b578e/abaabb;
      // 135: aload 8
      // 137: invokespecial qeaa361f143ee4a0894bd168fd9b30c66/qf4ccf8f5435d4a78bdca4d6a018b578e/aabb.<init> (Lnet/minecraft/class_243;Lqeaa361f143ee4a0894bd168fd9b30c66/qf4ccf8f5435d4a78bdca4d6a018b578e/abaabb;Lnet/minecraft/class_243;)V
      // 13a: invokeinterface java/util/List.add (Ljava/lang/Object;)Z 2
      // 13f: goto 143
      // 142: athrow
      // 143: pop
      // 144: iload 6
      // 146: ifeq 2a5
      // 149: aload 7
      // 14b: goto 14f
      // 14e: athrow
      // 14f: instanceof net/minecraft/class_1823
      // 152: iload 6
      // 154: ifne 1a9
      // 157: ifne 188
      // 15a: goto 15e
      // 15d: athrow
      // 15e: aload 7
      // 160: instanceof net/minecraft/class_1771
      // 163: iload 6
      // 165: ifne 1a9
      // 168: goto 16c
      // 16b: athrow
      // 16c: ifne 188
      // 16f: goto 173
      // 172: athrow
      // 173: aload 7
      // 175: iload 6
      // 177: ifne 1b5
      // 17a: goto 17e
      // 17d: athrow
      // 17e: instanceof net/minecraft/class_1776
      // 181: ifeq 1af
      // 184: goto 188
      // 187: athrow
      // 188: aload 9
      // 18a: new qeaa361f143ee4a0894bd168fd9b30c66/qf4ccf8f5435d4a78bdca4d6a018b578e/aabb
      // 18d: dup
      // 18e: fload 3
      // 18f: fload 4
      // 191: fconst_0
      // 192: ldc2_w 1.5
      // 195: invokestatic qeaa361f143ee4a0894bd168fd9b30c66/qf4ccf8f5435d4a78bdca4d6a018b578e/aabaab.aaaa (FFFD)Lnet/minecraft/class_243;
      // 198: getstatic qeaa361f143ee4a0894bd168fd9b30c66/qf4ccf8f5435d4a78bdca4d6a018b578e/abaabb.baa Lqeaa361f143ee4a0894bd168fd9b30c66/qf4ccf8f5435d4a78bdca4d6a018b578e/abaabb;
      // 19b: aload 8
      // 19d: invokespecial qeaa361f143ee4a0894bd168fd9b30c66/qf4ccf8f5435d4a78bdca4d6a018b578e/aabb.<init> (Lnet/minecraft/class_243;Lqeaa361f143ee4a0894bd168fd9b30c66/qf4ccf8f5435d4a78bdca4d6a018b578e/abaabb;Lnet/minecraft/class_243;)V
      // 1a0: invokeinterface java/util/List.add (Ljava/lang/Object;)Z 2
      // 1a5: goto 1a9
      // 1a8: athrow
      // 1a9: pop
      // 1aa: iload 6
      // 1ac: ifeq 2a5
      // 1af: aload 7
      // 1b1: goto 1b5
      // 1b4: athrow
      // 1b5: iload 6
      // 1b7: ifne 1f2
      // 1ba: instanceof net/minecraft/class_9239
      // 1bd: ifeq 1ec
      // 1c0: goto 1c4
      // 1c3: athrow
      // 1c4: aload 9
      // 1c6: new qeaa361f143ee4a0894bd168fd9b30c66/qf4ccf8f5435d4a78bdca4d6a018b578e/aabb
      // 1c9: dup
      // 1ca: fload 3
      // 1cb: fload 4
      // 1cd: fconst_0
      // 1ce: ldc2_w 1.5
      // 1d1: invokestatic qeaa361f143ee4a0894bd168fd9b30c66/qf4ccf8f5435d4a78bdca4d6a018b578e/aabaab.aaaa (FFFD)Lnet/minecraft/class_243;
      // 1d4: getstatic qeaa361f143ee4a0894bd168fd9b30c66/qf4ccf8f5435d4a78bdca4d6a018b578e/abaabb.ab Lqeaa361f143ee4a0894bd168fd9b30c66/qf4ccf8f5435d4a78bdca4d6a018b578e/abaabb;
      // 1d7: getstatic net/minecraft/class_243.field_1353 Lnet/minecraft/class_243;
      // 1da: invokespecial qeaa361f143ee4a0894bd168fd9b30c66/qf4ccf8f5435d4a78bdca4d6a018b578e/aabb.<init> (Lnet/minecraft/class_243;Lqeaa361f143ee4a0894bd168fd9b30c66/qf4ccf8f5435d4a78bdca4d6a018b578e/abaabb;Lnet/minecraft/class_243;)V
      // 1dd: invokeinterface java/util/List.add (Ljava/lang/Object;)Z 2
      // 1e2: pop
      // 1e3: iload 6
      // 1e5: ifeq 2a5
      // 1e8: goto 1ec
      // 1eb: athrow
      // 1ec: aload 7
      // 1ee: goto 1f2
      // 1f1: athrow
      // 1f2: iload 6
      // 1f4: ifne 22f
      // 1f7: instanceof net/minecraft/class_1828
      // 1fa: ifeq 229
      // 1fd: goto 201
      // 200: athrow
      // 201: aload 9
      // 203: new qeaa361f143ee4a0894bd168fd9b30c66/qf4ccf8f5435d4a78bdca4d6a018b578e/aabb
      // 206: dup
      // 207: fload 3
      // 208: fload 4
      // 20a: ldc -20.0
      // 20c: ldc2_w 0.5
      // 20f: invokestatic qeaa361f143ee4a0894bd168fd9b30c66/qf4ccf8f5435d4a78bdca4d6a018b578e/aabaab.aaaa (FFFD)Lnet/minecraft/class_243;
      // 212: getstatic qeaa361f143ee4a0894bd168fd9b30c66/qf4ccf8f5435d4a78bdca4d6a018b578e/abaabb.aaaa Lqeaa361f143ee4a0894bd168fd9b30c66/qf4ccf8f5435d4a78bdca4d6a018b578e/abaabb;
      // 215: aload 8
      // 217: invokespecial qeaa361f143ee4a0894bd168fd9b30c66/qf4ccf8f5435d4a78bdca4d6a018b578e/aabb.<init> (Lnet/minecraft/class_243;Lqeaa361f143ee4a0894bd168fd9b30c66/qf4ccf8f5435d4a78bdca4d6a018b578e/abaabb;Lnet/minecraft/class_243;)V
      // 21a: invokeinterface java/util/List.add (Ljava/lang/Object;)Z 2
      // 21f: pop
      // 220: iload 6
      // 222: ifeq 2a5
      // 225: goto 229
      // 228: athrow
      // 229: aload 7
      // 22b: goto 22f
      // 22e: athrow
      // 22f: iload 6
      // 231: ifne 26c
      // 234: instanceof net/minecraft/class_1779
      // 237: ifeq 266
      // 23a: goto 23e
      // 23d: athrow
      // 23e: aload 9
      // 240: new qeaa361f143ee4a0894bd168fd9b30c66/qf4ccf8f5435d4a78bdca4d6a018b578e/aabb
      // 243: dup
      // 244: fload 3
      // 245: fload 4
      // 247: ldc -20.0
      // 249: ldc2_w 0.7
      // 24c: invokestatic qeaa361f143ee4a0894bd168fd9b30c66/qf4ccf8f5435d4a78bdca4d6a018b578e/aabaab.aaaa (FFFD)Lnet/minecraft/class_243;
      // 24f: getstatic qeaa361f143ee4a0894bd168fd9b30c66/qf4ccf8f5435d4a78bdca4d6a018b578e/abaabb.abb Lqeaa361f143ee4a0894bd168fd9b30c66/qf4ccf8f5435d4a78bdca4d6a018b578e/abaabb;
      // 252: aload 8
      // 254: invokespecial qeaa361f143ee4a0894bd168fd9b30c66/qf4ccf8f5435d4a78bdca4d6a018b578e/aabb.<init> (Lnet/minecraft/class_243;Lqeaa361f143ee4a0894bd168fd9b30c66/qf4ccf8f5435d4a78bdca4d6a018b578e/abaabb;Lnet/minecraft/class_243;)V
      // 257: invokeinterface java/util/List.add (Ljava/lang/Object;)Z 2
      // 25c: pop
      // 25d: iload 6
      // 25f: ifeq 2a5
      // 262: goto 266
      // 265: athrow
      // 266: aload 7
      // 268: goto 26c
      // 26b: athrow
      // 26c: instanceof net/minecraft/class_1787
      // 26f: ifeq 2a5
      // 272: aload 2
      // 273: getfield net/minecraft/class_746.field_7513 Lnet/minecraft/class_1536;
      // 276: ifnonnull 2a5
      // 279: goto 27d
      // 27c: athrow
      // 27d: fconst_0
      // 27e: fload 4
      // 280: invokestatic net/minecraft/class_243.method_1030 (FF)Lnet/minecraft/class_243;
      // 283: ldc2_w 0.3
      // 286: invokevirtual net/minecraft/class_243.method_1021 (D)Lnet/minecraft/class_243;
      // 289: astore 10
      // 28b: aload 9
      // 28d: new qeaa361f143ee4a0894bd168fd9b30c66/qf4ccf8f5435d4a78bdca4d6a018b578e/aabb
      // 290: dup
      // 291: fload 3
      // 292: fload 4
      // 294: invokestatic qeaa361f143ee4a0894bd168fd9b30c66/qf4ccf8f5435d4a78bdca4d6a018b578e/aabaab.aab (FF)Lnet/minecraft/class_243;
      // 297: getstatic qeaa361f143ee4a0894bd168fd9b30c66/qf4ccf8f5435d4a78bdca4d6a018b578e/abaabb.a Lqeaa361f143ee4a0894bd168fd9b30c66/qf4ccf8f5435d4a78bdca4d6a018b578e/abaabb;
      // 29a: aload 10
      // 29c: invokespecial qeaa361f143ee4a0894bd168fd9b30c66/qf4ccf8f5435d4a78bdca4d6a018b578e/aabb.<init> (Lnet/minecraft/class_243;Lqeaa361f143ee4a0894bd168fd9b30c66/qf4ccf8f5435d4a78bdca4d6a018b578e/abaabb;Lnet/minecraft/class_243;)V
      // 29f: invokeinterface java/util/List.add (Ljava/lang/Object;)Z 2
      // 2a4: pop
      // 2a5: aload 9
      // 2a7: areturn
   }

   private class_4184 bab(aabbbbaaa param1) {
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
      // 06: ifne 1a
      // 09: invokeinterface qeaa361f143ee4a0894bd168fd9b30c66/qf4ccf8f5435d4a78bdca4d6a018b578e/aabbbbaaa.aaaa ()Lnet/minecraft/class_4184; 1
      // 0e: ifnull 22
      // 11: goto 15
      // 14: athrow
      // 15: aload 1
      // 16: goto 1a
      // 19: athrow
      // 1a: invokeinterface qeaa361f143ee4a0894bd168fd9b30c66/qf4ccf8f5435d4a78bdca4d6a018b578e/aabbbbaaa.aaaa ()Lnet/minecraft/class_4184; 1
      // 1f: goto 2b
      // 22: invokestatic net/minecraft/class_310.method_1551 ()Lnet/minecraft/class_310;
      // 25: getfield net/minecraft/class_310.field_1773 Lnet/minecraft/class_757;
      // 28: invokevirtual net/minecraft/class_757.method_19418 ()Lnet/minecraft/class_4184;
      // 2b: areturn
   }

   private static class_243 bba(class_243 var0, class_243 var1, double var2, double var4, double var6) {
      return var0.method_35590(var1, (var6 - var2) / (var4 - var2));
   }

   private static boolean bbb(class_638 var0, Integer var1) {
      try {
         if (var0.method_8469(var1) == null) {
            return true;
         }
      } catch (MatchException var2) {
         throw var2;
      }

      return false;
   }

   static class_243 aaaa(float param0, float param1, float param2, double param3) {
      // $VF: Couldn't be decompiled
      // Please report this to the Vineflower issue tracker, at https://github.com/Vineflower/vineflower/issues with a copy of the class file (if you have the rights to distribute it!)
      // java.lang.RuntimeException: parsing failure!
      //   at org.jetbrains.java.decompiler.modules.decompiler.decompose.DomHelper.parseGraph(DomHelper.java:211)
      //   at org.jetbrains.java.decompiler.main.rels.MethodProcessor.codeToJava(MethodProcessor.java:166)
      //
      // Bytecode:
      // 00: getstatic qeaa361f143ee4a0894bd168fd9b30c66/qf4ccf8f5435d4a78bdca4d6a018b578e/baaabbaa.bba I
      // 03: ldc_w 0.017453292
      // 06: fstore 6
      // 08: istore 5
      // 0a: new net/minecraft/class_243
      // 0d: dup
      // 0e: fload 1
      // 0f: fload 6
      // 11: fmul
      // 12: f2d
      // 13: invokestatic net/minecraft/class_3532.method_15374 (D)F
      // 16: fneg
      // 17: fload 0
      // 18: fload 6
      // 1a: fmul
      // 1b: f2d
      // 1c: invokestatic net/minecraft/class_3532.method_15362 (D)F
      // 1f: fmul
      // 20: f2d
      // 21: fload 0
      // 22: fload 2
      // 23: fadd
      // 24: fload 6
      // 26: fmul
      // 27: f2d
      // 28: invokestatic net/minecraft/class_3532.method_15374 (D)F
      // 2b: fneg
      // 2c: f2d
      // 2d: fload 1
      // 2e: fload 6
      // 30: fmul
      // 31: f2d
      // 32: invokestatic net/minecraft/class_3532.method_15362 (D)F
      // 35: fload 0
      // 36: fload 6
      // 38: fmul
      // 39: f2d
      // 3a: invokestatic net/minecraft/class_3532.method_15362 (D)F
      // 3d: fmul
      // 3e: f2d
      // 3f: invokespecial net/minecraft/class_243.<init> (DDD)V
      // 42: astore 7
      // 44: aload 7
      // 46: iload 5
      // 48: ifne 66
      // 4b: invokevirtual net/minecraft/class_243.method_1027 ()D
      // 4e: ldc2_w 1.0E-12
      // 51: dcmpl
      // 52: ifle 69
      // 55: goto 59
      // 58: athrow
      // 59: aload 7
      // 5b: invokevirtual net/minecraft/class_243.method_1029 ()Lnet/minecraft/class_243;
      // 5e: dload 3
      // 5f: invokevirtual net/minecraft/class_243.method_1021 (D)Lnet/minecraft/class_243;
      // 62: goto 66
      // 65: athrow
      // 66: goto 6c
      // 69: getstatic net/minecraft/class_243.field_1353 Lnet/minecraft/class_243;
      // 6c: areturn
   }

   private class_238 aaab(abaaba param1, float param2) {
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
      // 006: ifne 04c
      // 009: invokevirtual qeaa361f143ee4a0894bd168fd9b30c66/qf4ccf8f5435d4a78bdca4d6a018b578e/abaaba.aa ()Lnet/minecraft/class_1297;
      // 00c: ifnull 04b
      // 00f: goto 013
      // 012: athrow
      // 013: aload 1
      // 014: invokevirtual qeaa361f143ee4a0894bd168fd9b30c66/qf4ccf8f5435d4a78bdca4d6a018b578e/abaaba.aa ()Lnet/minecraft/class_1297;
      // 017: astore 4
      // 019: aload 4
      // 01b: fload 2
      // 01c: invokevirtual net/minecraft/class_1297.method_30950 (F)Lnet/minecraft/class_243;
      // 01f: aload 4
      // 021: invokevirtual net/minecraft/class_1297.method_23317 ()D
      // 024: aload 4
      // 026: invokevirtual net/minecraft/class_1297.method_23318 ()D
      // 029: aload 4
      // 02b: invokevirtual net/minecraft/class_1297.method_23321 ()D
      // 02e: invokevirtual net/minecraft/class_243.method_1023 (DDD)Lnet/minecraft/class_243;
      // 031: astore 5
      // 033: aload 4
      // 035: invokevirtual net/minecraft/class_1297.method_5829 ()Lnet/minecraft/class_238;
      // 038: aload 5
      // 03a: invokevirtual net/minecraft/class_238.method_997 (Lnet/minecraft/class_243;)Lnet/minecraft/class_238;
      // 03d: aload 4
      // 03f: invokevirtual net/minecraft/class_1297.method_5871 ()F
      // 042: f2d
      // 043: ldc2_w 0.05
      // 046: dadd
      // 047: invokevirtual net/minecraft/class_238.method_1014 (D)Lnet/minecraft/class_238;
      // 04a: areturn
      // 04b: aload 1
      // 04c: invokevirtual qeaa361f143ee4a0894bd168fd9b30c66/qf4ccf8f5435d4a78bdca4d6a018b578e/abaaba.b ()Lnet/minecraft/class_2350;
      // 04f: astore 4
      // 051: aload 4
      // 053: iload 3
      // 054: ifne 075
      // 057: ifnonnull 061
      // 05a: goto 05e
      // 05d: athrow
      // 05e: aconst_null
      // 05f: areturn
      // 060: athrow
      // 061: aload 1
      // 062: invokevirtual qeaa361f143ee4a0894bd168fd9b30c66/qf4ccf8f5435d4a78bdca4d6a018b578e/abaaba.a ()Ljava/util/List;
      // 065: aload 1
      // 066: invokevirtual qeaa361f143ee4a0894bd168fd9b30c66/qf4ccf8f5435d4a78bdca4d6a018b578e/abaaba.a ()Ljava/util/List;
      // 069: invokeinterface java/util/List.size ()I 1
      // 06e: bipush 1
      // 06f: isub
      // 070: invokeinterface java/util/List.get (I)Ljava/lang/Object; 2
      // 075: checkcast net/minecraft/class_243
      // 078: aload 4
      // 07a: invokevirtual net/minecraft/class_2350.method_10148 ()I
      // 07d: i2d
      // 07e: ldc2_w 0.012
      // 081: dmul
      // 082: aload 4
      // 084: invokevirtual net/minecraft/class_2350.method_10164 ()I
      // 087: i2d
      // 088: ldc2_w 0.012
      // 08b: dmul
      // 08c: aload 4
      // 08e: invokevirtual net/minecraft/class_2350.method_10165 ()I
      // 091: i2d
      // 092: ldc2_w 0.012
      // 095: dmul
      // 096: invokevirtual net/minecraft/class_243.method_1031 (DDD)Lnet/minecraft/class_243;
      // 099: astore 5
      // 09b: aload 4
      // 09d: invokevirtual net/minecraft/class_2350.method_10166 ()Lnet/minecraft/class_2350$class_2351;
      // 0a0: astore 6
      // 0a2: aload 6
      // 0a4: getstatic net/minecraft/class_2350$class_2351.field_11048 Lnet/minecraft/class_2350$class_2351;
      // 0a7: if_acmpne 0b1
      // 0aa: ldc2_w 0.012
      // 0ad: goto 0b4
      // 0b0: athrow
      // 0b1: ldc2_w 0.22
      // 0b4: dstore 7
      // 0b6: aload 6
      // 0b8: getstatic net/minecraft/class_2350$class_2351.field_11052 Lnet/minecraft/class_2350$class_2351;
      // 0bb: if_acmpne 0c5
      // 0be: ldc2_w 0.012
      // 0c1: goto 0c8
      // 0c4: athrow
      // 0c5: ldc2_w 0.22
      // 0c8: dstore 9
      // 0ca: aload 6
      // 0cc: getstatic net/minecraft/class_2350$class_2351.field_11051 Lnet/minecraft/class_2350$class_2351;
      // 0cf: if_acmpne 0d9
      // 0d2: ldc2_w 0.012
      // 0d5: goto 0dc
      // 0d8: athrow
      // 0d9: ldc2_w 0.22
      // 0dc: dstore 11
      // 0de: new net/minecraft/class_238
      // 0e1: dup
      // 0e2: aload 5
      // 0e4: getfield net/minecraft/class_243.field_1352 D
      // 0e7: dload 7
      // 0e9: dsub
      // 0ea: aload 5
      // 0ec: getfield net/minecraft/class_243.field_1351 D
      // 0ef: dload 9
      // 0f1: dsub
      // 0f2: aload 5
      // 0f4: getfield net/minecraft/class_243.field_1350 D
      // 0f7: dload 11
      // 0f9: dsub
      // 0fa: aload 5
      // 0fc: getfield net/minecraft/class_243.field_1352 D
      // 0ff: dload 7
      // 101: dadd
      // 102: aload 5
      // 104: getfield net/minecraft/class_243.field_1351 D
      // 107: dload 9
      // 109: dadd
      // 10a: aload 5
      // 10c: getfield net/minecraft/class_243.field_1350 D
      // 10f: dload 11
      // 111: dadd
      // 112: invokespecial net/minecraft/class_238.<init> (DDDDDD)V
      // 115: areturn
   }

   private abaaba aaba(
      class_1937 param1, class_1297 param2, class_243 param3, class_243 param4, abaabb param5, double param6
   ) {
      // $VF: Couldn't be decompiled
      // Please report this to the Vineflower issue tracker, at https://github.com/Vineflower/vineflower/issues with a copy of the class file (if you have the rights to distribute it!)
      // java.lang.RuntimeException: parsing failure!
      //   at org.jetbrains.java.decompiler.modules.decompiler.decompose.DomHelper.parseGraph(DomHelper.java:211)
      //   at org.jetbrains.java.decompiler.main.rels.MethodProcessor.codeToJava(MethodProcessor.java:166)
      //
      // Bytecode:
      // 000: aload 0
      // 001: invokevirtual qeaa361f143ee4a0894bd168fd9b30c66/qf4ccf8f5435d4a78bdca4d6a018b578e/aabaab.bb ()I
      // 004: istore 9
      // 006: new java/util/ArrayList
      // 009: dup
      // 00a: iload 9
      // 00c: bipush 1
      // 00d: iadd
      // 00e: invokespecial java/util/ArrayList.<init> (I)V
      // 011: astore 10
      // 013: getstatic qeaa361f143ee4a0894bd168fd9b30c66/qf4ccf8f5435d4a78bdca4d6a018b578e/baaabbaa.bba I
      // 016: aload 3
      // 017: astore 11
      // 019: aload 4
      // 01b: astore 12
      // 01d: istore 8
      // 01f: aload 5
      // 021: getfield qeaa361f143ee4a0894bd168fd9b30c66/qf4ccf8f5435d4a78bdca4d6a018b578e/abaabb.ba Z
      // 024: ifne 04c
      // 027: aload 2
      // 028: iload 8
      // 02a: ifne 039
      // 02d: goto 031
      // 030: athrow
      // 031: ifnull 04c
      // 034: goto 038
      // 037: athrow
      // 038: aload 2
      // 039: invokevirtual net/minecraft/class_1297.method_5799 ()Z
      // 03c: iload 8
      // 03e: ifne 049
      // 041: ifeq 04c
      // 044: goto 048
      // 047: athrow
      // 048: bipush 1
      // 049: goto 04d
      // 04c: bipush 0
      // 04d: istore 13
      // 04f: aload 5
      // 051: getfield qeaa361f143ee4a0894bd168fd9b30c66/qf4ccf8f5435d4a78bdca4d6a018b578e/abaabb.ba Z
      // 054: ifeq 05e
      // 057: getstatic net/minecraft/class_3959$class_242.field_1347 Lnet/minecraft/class_3959$class_242;
      // 05a: goto 061
      // 05d: athrow
      // 05e: getstatic net/minecraft/class_3959$class_242.field_1348 Lnet/minecraft/class_3959$class_242;
      // 061: astore 14
      // 063: aload 2
      // 064: iload 8
      // 066: ifne 078
      // 069: instanceof net/minecraft/class_1676
      // 06c: ifeq 085
      // 06f: goto 073
      // 072: athrow
      // 073: aload 2
      // 074: goto 078
      // 077: athrow
      // 078: checkcast net/minecraft/class_1676
      // 07b: astore 16
      // 07d: aload 16
      // 07f: getfield net/minecraft/class_1676.field_6012 I
      // 082: goto 086
      // 085: bipush 0
      // 086: istore 15
      // 088: aload 10
      // 08a: aload 11
      // 08c: invokeinterface java/util/List.add (Ljava/lang/Object;)Z 2
      // 091: pop
      // 092: bipush 0
      // 093: istore 16
      // 095: iload 16
      // 097: iload 9
      // 099: if_icmpge 1de
      // 09c: aload 5
      // 09e: aload 12
      // 0a0: iload 13
      // 0a2: dload 6
      // 0a4: invokevirtual qeaa361f143ee4a0894bd168fd9b30c66/qf4ccf8f5435d4a78bdca4d6a018b578e/abaabb.b (Lnet/minecraft/class_243;ZD)Lqeaa361f143ee4a0894bd168fd9b30c66/qf4ccf8f5435d4a78bdca4d6a018b578e/bbaaa;
      // 0a7: astore 17
      // 0a9: aload 11
      // 0ab: aload 17
      // 0ad: invokevirtual qeaa361f143ee4a0894bd168fd9b30c66/qf4ccf8f5435d4a78bdca4d6a018b578e/bbaaa.a ()Lnet/minecraft/class_243;
      // 0b0: invokevirtual net/minecraft/class_243.method_1019 (Lnet/minecraft/class_243;)Lnet/minecraft/class_243;
      // 0b3: astore 18
      // 0b5: iload 15
      // 0b7: iload 16
      // 0b9: iadd
      // 0ba: bipush 2
      // 0bb: isub
      // 0bc: i2d
      // 0bd: ldc2_w 20.0
      // 0c0: ddiv
      // 0c1: dconst_0
      // 0c2: ldc2_w 0.3
      // 0c5: invokestatic net/minecraft/class_3532.method_15350 (DDD)D
      // 0c8: dstore 19
      // 0ca: aload 0
      // 0cb: aload 1
      // 0cc: aload 2
      // 0cd: aload 11
      // 0cf: aload 18
      // 0d1: dload 19
      // 0d3: invokevirtual qeaa361f143ee4a0894bd168fd9b30c66/qf4ccf8f5435d4a78bdca4d6a018b578e/aabaab.aba (Lnet/minecraft/class_1937;Lnet/minecraft/class_1297;Lnet/minecraft/class_243;Lnet/minecraft/class_243;D)Lqeaa361f143ee4a0894bd168fd9b30c66/qf4ccf8f5435d4a78bdca4d6a018b578e/aaaaba;
      // 0d6: astore 21
      // 0d8: aload 1
      // 0d9: new net/minecraft/class_3959
      // 0dc: dup
      // 0dd: aload 11
      // 0df: aload 18
      // 0e1: getstatic net/minecraft/class_3959$class_3960.field_17558 Lnet/minecraft/class_3959$class_3960;
      // 0e4: aload 14
      // 0e6: aload 2
      // 0e7: invokespecial net/minecraft/class_3959.<init> (Lnet/minecraft/class_243;Lnet/minecraft/class_243;Lnet/minecraft/class_3959$class_3960;Lnet/minecraft/class_3959$class_242;Lnet/minecraft/class_1297;)V
      // 0ea: invokevirtual net/minecraft/class_1937.method_17742 (Lnet/minecraft/class_3959;)Lnet/minecraft/class_3965;
      // 0ed: astore 22
      // 0ef: aload 22
      // 0f1: invokevirtual net/minecraft/class_3965.method_17783 ()Lnet/minecraft/class_239$class_240;
      // 0f4: getstatic net/minecraft/class_239$class_240.field_1333 Lnet/minecraft/class_239$class_240;
      // 0f7: if_acmpeq 144
      // 0fa: aload 21
      // 0fc: ifnull 123
      // 0ff: goto 103
      // 102: athrow
      // 103: aload 11
      // 105: aload 22
      // 107: invokevirtual net/minecraft/class_3965.method_17784 ()Lnet/minecraft/class_243;
      // 10a: invokevirtual net/minecraft/class_243.method_1025 (Lnet/minecraft/class_243;)D
      // 10d: aload 21
      // 10f: invokevirtual qeaa361f143ee4a0894bd168fd9b30c66/qf4ccf8f5435d4a78bdca4d6a018b578e/aaaaba.a ()D
      // 112: dcmpg
      // 113: iload 8
      // 115: ifne 133
      // 118: goto 11c
      // 11b: athrow
      // 11c: ifge 144
      // 11f: goto 123
      // 122: athrow
      // 123: aload 10
      // 125: aload 22
      // 127: invokevirtual net/minecraft/class_3965.method_17784 ()Lnet/minecraft/class_243;
      // 12a: invokeinterface java/util/List.add (Ljava/lang/Object;)Z 2
      // 12f: goto 133
      // 132: athrow
      // 133: pop
      // 134: new qeaa361f143ee4a0894bd168fd9b30c66/qf4ccf8f5435d4a78bdca4d6a018b578e/abaaba
      // 137: dup
      // 138: aload 10
      // 13a: aload 22
      // 13c: invokevirtual net/minecraft/class_3965.method_17780 ()Lnet/minecraft/class_2350;
      // 13f: aconst_null
      // 140: invokespecial qeaa361f143ee4a0894bd168fd9b30c66/qf4ccf8f5435d4a78bdca4d6a018b578e/abaaba.<init> (Ljava/util/List;Lnet/minecraft/class_2350;Lnet/minecraft/class_1297;)V
      // 143: areturn
      // 144: aload 21
      // 146: ifnull 167
      // 149: aload 10
      // 14b: aload 21
      // 14d: invokevirtual qeaa361f143ee4a0894bd168fd9b30c66/qf4ccf8f5435d4a78bdca4d6a018b578e/aaaaba.ab ()Lnet/minecraft/class_243;
      // 150: invokeinterface java/util/List.add (Ljava/lang/Object;)Z 2
      // 155: pop
      // 156: new qeaa361f143ee4a0894bd168fd9b30c66/qf4ccf8f5435d4a78bdca4d6a018b578e/abaaba
      // 159: dup
      // 15a: aload 10
      // 15c: aconst_null
      // 15d: aload 21
      // 15f: invokevirtual qeaa361f143ee4a0894bd168fd9b30c66/qf4ccf8f5435d4a78bdca4d6a018b578e/aaaaba.aa ()Lnet/minecraft/class_1297;
      // 162: invokespecial qeaa361f143ee4a0894bd168fd9b30c66/qf4ccf8f5435d4a78bdca4d6a018b578e/abaaba.<init> (Ljava/util/List;Lnet/minecraft/class_2350;Lnet/minecraft/class_1297;)V
      // 165: areturn
      // 166: athrow
      // 167: aload 5
      // 169: getfield qeaa361f143ee4a0894bd168fd9b30c66/qf4ccf8f5435d4a78bdca4d6a018b578e/abaabb.ba Z
      // 16c: iload 8
      // 16e: ifne 1c6
      // 171: ifne 189
      // 174: goto 178
      // 177: athrow
      // 178: aload 1
      // 179: aload 18
      // 17b: invokestatic net/minecraft/class_2338.method_49638 (Lnet/minecraft/class_2374;)Lnet/minecraft/class_2338;
      // 17e: invokevirtual net/minecraft/class_1937.method_8316 (Lnet/minecraft/class_2338;)Lnet/minecraft/class_3610;
      // 181: getstatic net/minecraft/class_3486.field_15517 Lnet/minecraft/class_6862;
      // 184: invokevirtual net/minecraft/class_3610.method_15767 (Lnet/minecraft/class_6862;)Z
      // 187: istore 13
      // 189: aload 18
      // 18b: astore 11
      // 18d: iload 8
      // 18f: aload 17
      // 191: invokevirtual qeaa361f143ee4a0894bd168fd9b30c66/qf4ccf8f5435d4a78bdca4d6a018b578e/bbaaa.b ()Lnet/minecraft/class_243;
      // 194: astore 12
      // 196: ifne 1d9
      // 199: aload 10
      // 19b: aload 11
      // 19d: invokeinterface java/util/List.add (Ljava/lang/Object;)Z 2
      // 1a2: pop
      // 1a3: aload 11
      // 1a5: getfield net/minecraft/class_243.field_1351 D
      // 1a8: aload 1
      // 1a9: invokevirtual net/minecraft/class_1937.method_31607 ()I
      // 1ac: ldc_w -1871813179
      // 1af: ldc_w 1823421790
      // 1b2: ldc_w 1203072417
      // 1b5: ixor
      // 1b6: invokestatic qeaa361f143ee4a0894bd168fd9b30c66/qf4ccf8f5435d4a78bdca4d6a018b578e/aabaab.a (II)I
      // 1b9: ldc2_w 2600415073219914975
      // 1bc: invokestatic qeaa361f143ee4a0894bd168fd9b30c66/qf4ccf8f5435d4a78bdca4d6a018b578e/aabaab.ab (IJ)I
      // 1bf: isub
      // 1c0: i2d
      // 1c1: dcmpg
      // 1c2: goto 1c6
      // 1c5: athrow
      // 1c6: ifge 1d2
      // 1c9: iload 8
      // 1cb: ifeq 1de
      // 1ce: goto 1d2
      // 1d1: athrow
      // 1d2: iinc 16 1
      // 1d5: goto 1d9
      // 1d8: athrow
      // 1d9: iload 8
      // 1db: ifeq 095
      // 1de: new qeaa361f143ee4a0894bd168fd9b30c66/qf4ccf8f5435d4a78bdca4d6a018b578e/abaaba
      // 1e1: dup
      // 1e2: aload 10
      // 1e4: aconst_null
      // 1e5: aconst_null
      // 1e6: invokespecial qeaa361f143ee4a0894bd168fd9b30c66/qf4ccf8f5435d4a78bdca4d6a018b578e/abaaba.<init> (Ljava/util/List;Lnet/minecraft/class_2350;Lnet/minecraft/class_1297;)V
      // 1e9: areturn
   }

   private static String aabb(int var0, int var1) {
      int var9 = 1545037641;
      int var2 = (var0 ^ a(-1871813180, var9 ^ -1260366313)) & a(-1871813173, var9 ^ -70664206);
      if (bbba[var2] == null) {
         char[] var3 = baaa[var2].toCharArray();

         int var4 = switch (var3[0] & a(-1871813174, var9 ^ -703828674)) {
            case 0 -> a(-1871813175, var9 ^ 1194616143);
            case 1 -> a(-1871813176, var9 ^ 1814438735);
            case 2 -> a(-1871813169, var9 ^ -1424421500);
            case 3 -> a(-1871813170, var9 ^ -1430512353);
            case 4 -> a(-1871813171, var9 ^ -850093195);
            case 5 -> a(-1871813172, var9 ^ -471205741);
            case 6 -> a(-1871813165, var9 ^ 209953821);
            case 7 -> a(-1871813166, var9 ^ 564052392);
            case 8 -> a(-1871813167, var9 ^ 301362344);
            case 9 -> a(-1871813168, var9 ^ 1654711689);
            case 10 -> a(-1871813161, var9 ^ 1567606783);
            case 11 -> a(-1871813162, var9 ^ -1586594560);
            case 12 -> a(-1871813163, var9 ^ 443550735);
            case 13 -> a(-1871813164, var9 ^ 533203241);
            case 14 -> a(-1871813157, var9 ^ -1949468483);
            case 15 -> a(-1871813158, var9 ^ 82877543);
            case 16 -> a(-1871813159, var9 ^ 179624517);
            case 17 -> a(-1871813160, var9 ^ -1458845546);
            case 18 -> a(-1871813153, var9 ^ 1507660092);
            case 19 -> a(-1871813154, var9 ^ -158578340);
            case 20 -> a(-1871813155, var9 ^ -894671502);
            case 21 -> a(-1871813156, var9 ^ -1676620198);
            case 22 -> a(-1871813213, var9 ^ -1250991865);
            case 23 -> a(-1871813214, var9 ^ -1393414817);
            case 24 -> a(-1871813215, var9 ^ -2036644352);
            case 25 -> a(-1871813216, var9 ^ -2098754461);
            case 26 -> a(-1871813209, var9 ^ 1745244053);
            case 27 -> a(-1871813210, var9 ^ 1568938868);
            case 28 -> a(-1871813211, var9 ^ 1530578136);
            case 29 -> a(-1871813212, var9 ^ 1821452040);
            case 30 -> a(-1871813205, var9 ^ -773202760);
            case 31 -> a(-1871813206, var9 ^ -304432273);
            case 32 -> a(-1871813207, var9 ^ -1204409317);
            case 33 -> a(-1871813208, var9 ^ -1217106325);
            case 34 -> a(-1871813201, var9 ^ 716890012);
            case 35 -> a(-1871813202, var9 ^ 2020585561);
            case 36 -> a(-1871813203, var9 ^ 75455822);
            case 37 -> a(-1871813204, var9 ^ 382549759);
            case 38 -> a(-1871813197, var9 ^ 984260433);
            case 39 -> a(-1871813198, var9 ^ 440809953);
            case 40 -> a(-1871813199, var9 ^ -583874675);
            case 41 -> 4;
            case 42 -> a(-1871813200, var9 ^ -1961737389);
            case 43 -> a(-1871813193, var9 ^ 882456503);
            case 44 -> a(-1871813194, var9 ^ -1761404373);
            case 45 -> a(-1871813195, var9 ^ 1791389978);
            case 46 -> a(-1871813196, var9 ^ -167319316);
            case 47 -> a(-1871813189, var9 ^ 1110535444);
            case 48 -> a(-1871813190, var9 ^ -491248082);
            case 49 -> a(-1871813191, var9 ^ -1813203706);
            case 50 -> a(-1871813192, var9 ^ -1426791319);
            case 51 -> a(-1871813185, var9 ^ 774031492);
            case 52 -> a(-1871813186, var9 ^ -1160177695);
            case 53 -> a(-1871813187, var9 ^ 2039048652);
            case 54 -> a(-1871813188, var9 ^ 1384375517);
            case 55 -> a(-1871813245, var9 ^ -1408639480);
            case 56 -> a(-1871813246, var9 ^ -845001581);
            case 57 -> a(-1871813247, var9 ^ -545704926);
            case 58 -> a(-1871813248, var9 ^ -369580046);
            case 59 -> a(-1871813241, var9 ^ 1092291709);
            case 60 -> a(-1871813242, var9 ^ 1596463411);
            case 61 -> a(-1871813243, var9 ^ -1045183671);
            case 62 -> a(-1871813244, var9 ^ 1712909557);
            case 63 -> a(-1871813237, var9 ^ 665253741);
            case 64 -> a(-1871813238, var9 ^ 425870805);
            case 65 -> a(-1871813239, var9 ^ 1943303485);
            case 66 -> a(-1871813240, var9 ^ 423738992);
            case 67 -> a(-1871813233, var9 ^ 1226098573);
            case 68 -> a(-1871813234, var9 ^ -453425279);
            case 69 -> a(-1871813235, var9 ^ -1964421591);
            case 70 -> a(-1871813236, var9 ^ 1187621088);
            case 71 -> a(-1871813229, var9 ^ -1101804612);
            case 72 -> a(-1871813230, var9 ^ 495680904);
            case 73 -> a(-1871813231, var9 ^ 1798347073);
            case 74 -> a(-1871813232, var9 ^ -1348559672);
            case 75 -> a(-1871813225, var9 ^ -1916748342);
            case 76 -> a(-1871813226, var9 ^ -282337536);
            case 77 -> a(-1871813227, var9 ^ -1214545097);
            case 78 -> a(-1871813228, var9 ^ 871164994);
            case 79 -> a(-1871813221, var9 ^ 1536533420);
            case 80 -> a(-1871813222, var9 ^ -102868949);
            case 81 -> a(-1871813223, var9 ^ -789684869);
            case 82 -> a(-1871813224, var9 ^ 528250018);
            case 83 -> a(-1871813217, var9 ^ -1281418868);
            case 84 -> a(-1871813218, var9 ^ -641991627);
            case 85 -> a(-1871813219, var9 ^ 2132957926);
            case 86 -> a(-1871813220, var9 ^ 1862531394);
            case 87 -> a(-1871813277, var9 ^ 2012915835);
            case 88 -> a(-1871813278, var9 ^ 530117501);
            case 89 -> a(-1871813279, var9 ^ -379401267);
            case 90 -> a(-1871813280, var9 ^ -2053408685);
            case 91 -> a(-1871813273, var9 ^ 213844279);
            case 92 -> a(-1871813274, var9 ^ 2025361085);
            case 93 -> a(-1871813275, var9 ^ -1192366175);
            case 94 -> a(-1871813276, var9 ^ 1089806255);
            case 95 -> a(-1871813269, var9 ^ -701378640);
            case 96 -> a(-1871813270, var9 ^ -574875271);
            case 97 -> a(-1871813271, var9 ^ 124863177);
            case 98 -> a(-1871813272, var9 ^ -1211390164);
            case 99 -> a(-1871813265, var9 ^ 2139044681);
            case 100 -> a(-1871813266, var9 ^ -1052036192);
            case 101 -> a(-1871813267, var9 ^ -1348062026);
            case 102 -> a(-1871813268, var9 ^ 1982806256);
            case 103 -> a(-1871813261, var9 ^ 266526815);
            case 104 -> a(-1871813262, var9 ^ 405689238);
            case 105 -> 3;
            case 106 -> a(-1871813263, var9 ^ 1096696048);
            case 107 -> a(-1871813264, var9 ^ -130697674);
            case 108 -> a(-1871813257, var9 ^ -2032401476);
            case 109 -> 1;
            case 110 -> a(-1871813258, var9 ^ -186580553);
            case 111 -> a(-1871813259, var9 ^ 669048009);
            case 112 -> a(-1871813260, var9 ^ 321831225);
            case 113 -> a(-1871813253, var9 ^ 460811450);
            case 114 -> a(-1871813254, var9 ^ -1898858530);
            case 115 -> a(-1871813255, var9 ^ -1401463454);
            case 116 -> a(-1871813256, var9 ^ -1331564177);
            case 117 -> a(-1871813249, var9 ^ -1750411770);
            case 118 -> a(-1871813250, var9 ^ 1254357368);
            case 119 -> a(-1871813251, var9 ^ 1335341188);
            case 120 -> a(-1871813252, var9 ^ 1418739779);
            case 121 -> a(-1871813309, var9 ^ -1730175223);
            case 122 -> a(-1871813310, var9 ^ 187769984);
            case 123 -> a(-1871813311, var9 ^ -1125106325);
            case 124 -> a(-1871813312, var9 ^ -937566354);
            case 125 -> a(-1871813305, var9 ^ 614526886);
            case 126 -> a(-1871813306, var9 ^ 359891140);
            case 127 -> a(-1871813307, var9 ^ -1079183008);
            case 128 -> a(-1871813308, var9 ^ 997971000);
            case 129 -> a(-1871813301, var9 ^ 1929242129);
            case 130 -> a(-1871813302, var9 ^ -892778293);
            case 131 -> a(-1871813303, var9 ^ -1309623765);
            case 132 -> a(-1871813304, var9 ^ 543173852);
            case 133 -> a(-1871813297, var9 ^ -529073140);
            case 134 -> a(-1871813298, var9 ^ 766590744);
            case 135 -> a(-1871813299, var9 ^ -2117076366);
            case 136 -> a(-1871813300, var9 ^ -1808910453);
            case 137 -> a(-1871813293, var9 ^ -1166170961);
            case 138 -> a(-1871813294, var9 ^ 1572822332);
            case 139 -> a(-1871813295, var9 ^ 669176389);
            case 140 -> a(-1871813296, var9 ^ 1446531373);
            case 141 -> a(-1871813289, var9 ^ -445590780);
            case 142 -> 5;
            case 143 -> a(-1871813290, var9 ^ 1056338);
            case 144 -> a(-1871813291, var9 ^ 1548468595);
            case 145 -> a(-1871813292, var9 ^ 1901020701);
            case 146 -> a(-1871813285, var9 ^ -366490866);
            case 147 -> a(-1871813286, var9 ^ 1019028936);
            case 148 -> a(-1871813287, var9 ^ 1426776907);
            case 149 -> a(-1871813288, var9 ^ 1165430027);
            case 150 -> a(-1871813281, var9 ^ 1438438921);
            case 151 -> a(-1871813282, var9 ^ 197094609);
            case 152 -> a(-1871813283, var9 ^ -340965647);
            case 153 -> a(-1871813284, var9 ^ -1816037721);
            case 154 -> a(-1871813341, var9 ^ -310672824);
            case 155 -> a(-1871813342, var9 ^ -397110880);
            case 156 -> a(-1871813343, var9 ^ 171749982);
            case 157 -> a(-1871813344, var9 ^ 438558080);
            case 158 -> 2;
            case 159 -> a(-1871813337, var9 ^ 843487917);
            case 160 -> a(-1871813338, var9 ^ -172748922);
            case 161 -> a(-1871813339, var9 ^ -930122268);
            case 162 -> a(-1871813340, var9 ^ -998186248);
            case 163 -> a(-1871813333, var9 ^ -1004937034);
            case 164 -> a(-1871813334, var9 ^ -561154685);
            case 165 -> a(-1871813335, var9 ^ 1060971470);
            case 166 -> a(-1871813336, var9 ^ -90868351);
            case 167 -> a(-1871813329, var9 ^ -1326966330);
            case 168 -> a(-1871813330, var9 ^ 964881090);
            case 169 -> a(-1871813331, var9 ^ 83815012);
            case 170 -> a(-1871813332, var9 ^ 929624479);
            case 171 -> a(-1871813325, var9 ^ 172106723);
            case 172 -> a(-1871813326, var9 ^ 1751176983);
            case 173 -> a(-1871813327, var9 ^ 1527439359);
            case 174 -> a(-1871813328, var9 ^ -1171645088);
            case 175 -> a(-1871813321, var9 ^ 1735629604);
            case 176 -> a(-1871813322, var9 ^ 533591054);
            case 177 -> a(-1871813323, var9 ^ 742898526);
            case 178 -> a(-1871813324, var9 ^ 142695069);
            case 179 -> a(-1871813317, var9 ^ -871042145);
            case 180 -> a(-1871813318, var9 ^ -1387966991);
            case 181 -> a(-1871813319, var9 ^ -1473978856);
            case 182 -> a(-1871813320, var9 ^ -1591242653);
            case 183 -> a(-1871813313, var9 ^ -1188345000);
            case 184 -> a(-1871813314, var9 ^ 284154807);
            case 185 -> a(-1871813315, var9 ^ -1011447528);
            case 186 -> a(-1871813316, var9 ^ -1174189424);
            case 187 -> a(-1871813373, var9 ^ 1761790585);
            case 188 -> a(-1871813374, var9 ^ 2062916209);
            case 189 -> a(-1871813375, var9 ^ -1891876716);
            case 190 -> a(-1871813376, var9 ^ 342909629);
            case 191 -> a(-1871813369, var9 ^ -871785832);
            case 192 -> a(-1871813370, var9 ^ 1066219510);
            case 193 -> a(-1871813371, var9 ^ -564403714);
            case 194 -> a(-1871813372, var9 ^ 1344242705);
            case 195 -> a(-1871813365, var9 ^ 1235196045);
            case 196 -> a(-1871813366, var9 ^ 1997255673);
            case 197 -> a(-1871813367, var9 ^ -1823838115);
            case 198 -> a(-1871813368, var9 ^ 1258628739);
            case 199 -> a(-1871813361, var9 ^ -697290717);
            case 200 -> a(-1871813362, var9 ^ 1087056774);
            case 201 -> a(-1871813363, var9 ^ -990483418);
            case 202 -> a(-1871813364, var9 ^ 1917855419);
            case 203 -> a(-1871813357, var9 ^ 1144007753);
            case 204 -> 0;
            case 205 -> a(-1871813358, var9 ^ -848131013);
            case 206 -> a(-1871813359, var9 ^ -565551916);
            case 207 -> a(-1871813360, var9 ^ 1894936800);
            case 208 -> a(-1871813353, var9 ^ 1343054363);
            case 209 -> a(-1871813354, var9 ^ -1885839965);
            case 210 -> a(-1871813355, var9 ^ 108587522);
            case 211 -> a(-1871813356, var9 ^ 485856499);
            case 212 -> a(-1871813349, var9 ^ 1375890278);
            case 213 -> a(-1871813350, var9 ^ 690677789);
            case 214 -> a(-1871813351, var9 ^ 740793183);
            case 215 -> a(-1871813352, var9 ^ 1965477227);
            case 216 -> a(-1871813345, var9 ^ -629749039);
            case 217 -> a(-1871813346, var9 ^ -1645002499);
            case 218 -> a(-1871813347, var9 ^ 348499678);
            case 219 -> a(-1871813348, var9 ^ 1879080230);
            case 220 -> a(-1871813405, var9 ^ 2107529860);
            case 221 -> a(-1871813406, var9 ^ -51479084);
            case 222 -> a(-1871813407, var9 ^ 1396461843);
            case 223 -> a(-1871813408, var9 ^ 714829747);
            case 224 -> a(-1871813401, var9 ^ 147755954);
            case 225 -> a(-1871813402, var9 ^ 578384219);
            case 226 -> a(-1871813403, var9 ^ 998405451);
            case 227 -> a(-1871813404, var9 ^ 1235317049);
            case 228 -> a(-1871813397, var9 ^ -1533518446);
            case 229 -> a(-1871813398, var9 ^ 1807772561);
            case 230 -> a(-1871813399, var9 ^ -1287031389);
            case 231 -> a(-1871813400, var9 ^ -994052168);
            case 232 -> a(-1871813393, var9 ^ -1648139056);
            case 233 -> a(-1871813394, var9 ^ 1100885897);
            case 234 -> a(-1871813395, var9 ^ -1108289328);
            case 235 -> a(-1871813396, var9 ^ -1346318597);
            case 236 -> a(-1871813389, var9 ^ 652775067);
            case 237 -> a(-1871813390, var9 ^ -528721846);
            case 238 -> a(-1871813391, var9 ^ 255012387);
            case 239 -> a(-1871813392, var9 ^ -397608311);
            case 240 -> a(-1871813385, var9 ^ -1339331383);
            case 241 -> a(-1871813386, var9 ^ 1882758864);
            case 242 -> a(-1871813387, var9 ^ 1455679950);
            case 243 -> a(-1871813388, var9 ^ -1475802703);
            case 244 -> a(-1871813381, var9 ^ 259583810);
            case 245 -> a(-1871813382, var9 ^ 2143895965);
            case 246 -> a(-1871813383, var9 ^ -244277717);
            case 247 -> a(-1871813384, var9 ^ 14731066);
            case 248 -> a(-1871813377, var9 ^ 1461248473);
            case 249 -> a(-1871813378, var9 ^ 1238751953);
            case 250 -> a(-1871813379, var9 ^ -1770010518);
            case 251 -> a(-1871813380, var9 ^ -1278233547);
            case 252 -> a(-1871813437, var9 ^ 2126297057);
            case 253 -> a(-1871813438, var9 ^ -334775577);
            case 254 -> a(-1871813439, var9 ^ -1601727865);
            default -> a(-1871813440, var9 ^ -1054027647);
         };
         int var5 = (var1 & a(-1871813433, var9 ^ 1572660367)) - var4;
         if (var5 < 0) {
            var5 += 256;
         }

         int var6 = ((var1 & a(-1871813434, var9 ^ -1333587347)) >>> a(-1871813435, var9 ^ 833099882)) - var4;
         if (var6 < 0) {
            var6 += 256;
         }

         for (int var7 = 0; var7 < var3.length; var7++) {
            int var8 = var7 % 2;
            char var10002 = var3[var7];
            if (var8 == 0) {
               var3[var7] = (char)(var10002 ^ var5);
               var5 = ((var5 >>> 3 | var5 << 5) ^ var3[var7]) & a(-1871813436, var9 ^ 339257019);
            } else {
               var3[var7] = (char)(var10002 ^ var6);
               var6 = ((var6 >>> 3 | var6 << 5) ^ var3[var7]) & a(-1871813429, var9 ^ 1008733632);
            }
         }

         bbba[var2] = new String(var3).intern();
      }

      return bbba[var2];
   }

   private static class_243 abaa(class_243 param0, class_243 param1, class_243 param2, class_243 param3, double param4) {
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
      // 05: invokevirtual net/minecraft/class_243.method_1022 (Lnet/minecraft/class_243;)D
      // 08: invokestatic java/lang/Math.sqrt (D)D
      // 0b: dstore 7
      // 0d: istore 6
      // 0f: aload 1
      // 10: aload 2
      // 11: invokevirtual net/minecraft/class_243.method_1022 (Lnet/minecraft/class_243;)D
      // 14: invokestatic java/lang/Math.sqrt (D)D
      // 17: dstore 9
      // 19: aload 2
      // 1a: aload 3
      // 1b: invokevirtual net/minecraft/class_243.method_1022 (Lnet/minecraft/class_243;)D
      // 1e: invokestatic java/lang/Math.sqrt (D)D
      // 21: dstore 11
      // 23: dload 7
      // 25: iload 6
      // 27: ifne 3b
      // 2a: ldc2_w 1.0E-4
      // 2d: dcmpg
      // 2e: iflt 61
      // 31: goto 35
      // 34: athrow
      // 35: dload 9
      // 37: goto 3b
      // 3a: athrow
      // 3b: ldc2_w 1.0E-4
      // 3e: iload 6
      // 40: ifne 5d
      // 43: dcmpg
      // 44: iflt 61
      // 47: goto 4b
      // 4a: athrow
      // 4b: dload 11
      // 4d: iload 6
      // 4f: ifne 6c
      // 52: goto 56
      // 55: athrow
      // 56: ldc2_w 1.0E-4
      // 59: goto 5d
      // 5c: athrow
      // 5d: dcmpg
      // 5e: ifge 6a
      // 61: aload 1
      // 62: aload 2
      // 63: dload 4
      // 65: invokevirtual net/minecraft/class_243.method_35590 (Lnet/minecraft/class_243;D)Lnet/minecraft/class_243;
      // 68: areturn
      // 69: athrow
      // 6a: dload 7
      // 6c: dstore 13
      // 6e: dload 13
      // 70: dload 9
      // 72: dadd
      // 73: dstore 15
      // 75: dload 15
      // 77: dload 11
      // 79: dadd
      // 7a: dstore 17
      // 7c: dload 13
      // 7e: dload 4
      // 80: dload 9
      // 82: dmul
      // 83: dadd
      // 84: dstore 19
      // 86: aload 0
      // 87: aload 1
      // 88: dconst_0
      // 89: dload 13
      // 8b: dload 19
      // 8d: invokestatic qeaa361f143ee4a0894bd168fd9b30c66/qf4ccf8f5435d4a78bdca4d6a018b578e/aabaab.bba (Lnet/minecraft/class_243;Lnet/minecraft/class_243;DDD)Lnet/minecraft/class_243;
      // 90: astore 21
      // 92: aload 1
      // 93: aload 2
      // 94: dload 13
      // 96: dload 15
      // 98: dload 19
      // 9a: invokestatic qeaa361f143ee4a0894bd168fd9b30c66/qf4ccf8f5435d4a78bdca4d6a018b578e/aabaab.bba (Lnet/minecraft/class_243;Lnet/minecraft/class_243;DDD)Lnet/minecraft/class_243;
      // 9d: astore 22
      // 9f: aload 2
      // a0: aload 3
      // a1: dload 15
      // a3: dload 17
      // a5: dload 19
      // a7: invokestatic qeaa361f143ee4a0894bd168fd9b30c66/qf4ccf8f5435d4a78bdca4d6a018b578e/aabaab.bba (Lnet/minecraft/class_243;Lnet/minecraft/class_243;DDD)Lnet/minecraft/class_243;
      // aa: astore 23
      // ac: aload 21
      // ae: aload 22
      // b0: dconst_0
      // b1: dload 15
      // b3: dload 19
      // b5: invokestatic qeaa361f143ee4a0894bd168fd9b30c66/qf4ccf8f5435d4a78bdca4d6a018b578e/aabaab.bba (Lnet/minecraft/class_243;Lnet/minecraft/class_243;DDD)Lnet/minecraft/class_243;
      // b8: astore 24
      // ba: aload 22
      // bc: aload 23
      // be: dload 13
      // c0: dload 17
      // c2: dload 19
      // c4: invokestatic qeaa361f143ee4a0894bd168fd9b30c66/qf4ccf8f5435d4a78bdca4d6a018b578e/aabaab.bba (Lnet/minecraft/class_243;Lnet/minecraft/class_243;DDD)Lnet/minecraft/class_243;
      // c7: astore 25
      // c9: aload 24
      // cb: aload 25
      // cd: dload 13
      // cf: dload 15
      // d1: dload 19
      // d3: invokestatic qeaa361f143ee4a0894bd168fd9b30c66/qf4ccf8f5435d4a78bdca4d6a018b578e/aabaab.bba (Lnet/minecraft/class_243;Lnet/minecraft/class_243;DDD)Lnet/minecraft/class_243;
      // d6: areturn
   }

   private boolean abab(class_1297 param1, class_1297 param2) {
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
      // 06: ifne 17
      // 09: invokevirtual net/minecraft/class_1297.method_49108 ()Z
      // 0c: ifne 16
      // 0f: goto 13
      // 12: athrow
      // 13: bipush 0
      // 14: ireturn
      // 15: athrow
      // 16: aload 1
      // 17: iload 3
      // 18: ifne 2a
      // 1b: instanceof net/minecraft/class_1676
      // 1e: ifeq 37
      // 21: goto 25
      // 24: athrow
      // 25: aload 1
      // 26: goto 2a
      // 29: athrow
      // 2a: checkcast net/minecraft/class_1676
      // 2d: astore 5
      // 2f: aload 5
      // 31: invokevirtual net/minecraft/class_1676.method_24921 ()Lnet/minecraft/class_1297;
      // 34: goto 38
      // 37: aload 1
      // 38: astore 4
      // 3a: aload 4
      // 3c: iload 3
      // 3d: ifne 49
      // 40: ifnull 58
      // 43: goto 47
      // 46: athrow
      // 47: aload 4
      // 49: aload 2
      // 4a: invokevirtual net/minecraft/class_1297.method_5794 (Lnet/minecraft/class_1297;)Z
      // 4d: iload 3
      // 4e: ifne 59
      // 51: ifne 5c
      // 54: goto 58
      // 57: athrow
      // 58: bipush 1
      // 59: goto 5d
      // 5c: bipush 0
      // 5d: ireturn
   }

   static List abba(List param0, class_243 param1) {
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
      // 05: invokevirtual net/minecraft/class_243.method_1027 ()D
      // 08: ldc2_w 1.0E-8
      // 0b: dcmpg
      // 0c: iload 2
      // 0d: ifne 29
      // 10: iflt 2d
      // 13: goto 17
      // 16: athrow
      // 17: aload 0
      // 18: iload 2
      // 19: ifne 32
      // 1c: goto 20
      // 1f: athrow
      // 20: invokeinterface java/util/List.size ()I 1
      // 25: goto 29
      // 28: athrow
      // 29: bipush 2
      // 2a: if_icmpge 33
      // 2d: aload 0
      // 2e: goto 32
      // 31: athrow
      // 32: areturn
      // 33: dconst_0
      // 34: dstore 3
      // 35: bipush 1
      // 36: istore 5
      // 38: iload 5
      // 3a: aload 0
      // 3b: invokeinterface java/util/List.size ()I 1
      // 40: if_icmpge 6c
      // 43: dload 3
      // 44: aload 0
      // 45: iload 5
      // 47: bipush 1
      // 48: isub
      // 49: invokeinterface java/util/List.get (I)Ljava/lang/Object; 2
      // 4e: checkcast net/minecraft/class_243
      // 51: aload 0
      // 52: iload 5
      // 54: invokeinterface java/util/List.get (I)Ljava/lang/Object; 2
      // 59: checkcast net/minecraft/class_243
      // 5c: invokevirtual net/minecraft/class_243.method_1022 (Lnet/minecraft/class_243;)D
      // 5f: dadd
      // 60: iload 2
      // 61: ifne 6d
      // 64: dstore 3
      // 65: iload 2
      // 66: iinc 5 1
      // 69: ifeq 38
      // 6c: dload 3
      // 6d: ldc2_w 1.0E-4
      // 70: dcmpg
      // 71: ifge 77
      // 74: aload 0
      // 75: areturn
      // 76: athrow
      // 77: new java/util/ArrayList
      // 7a: dup
      // 7b: aload 0
      // 7c: invokeinterface java/util/List.size ()I 1
      // 81: invokespecial java/util/ArrayList.<init> (I)V
      // 84: astore 5
      // 86: dconst_0
      // 87: dstore 6
      // 89: bipush 0
      // 8a: istore 8
      // 8c: iload 8
      // 8e: aload 0
      // 8f: invokeinterface java/util/List.size ()I 1
      // 94: if_icmpge eb
      // 97: iload 8
      // 99: iload 2
      // 9a: ifne e3
      // 9d: ifle c4
      // a0: goto a4
      // a3: athrow
      // a4: dload 6
      // a6: aload 0
      // a7: iload 8
      // a9: bipush 1
      // aa: isub
      // ab: invokeinterface java/util/List.get (I)Ljava/lang/Object; 2
      // b0: checkcast net/minecraft/class_243
      // b3: aload 0
      // b4: iload 8
      // b6: invokeinterface java/util/List.get (I)Ljava/lang/Object; 2
      // bb: checkcast net/minecraft/class_243
      // be: invokevirtual net/minecraft/class_243.method_1022 (Lnet/minecraft/class_243;)D
      // c1: dadd
      // c2: dstore 6
      // c4: aload 5
      // c6: aload 0
      // c7: iload 8
      // c9: invokeinterface java/util/List.get (I)Ljava/lang/Object; 2
      // ce: checkcast net/minecraft/class_243
      // d1: aload 1
      // d2: dconst_1
      // d3: dload 6
      // d5: dload 3
      // d6: ddiv
      // d7: dsub
      // d8: invokevirtual net/minecraft/class_243.method_1021 (D)Lnet/minecraft/class_243;
      // db: invokevirtual net/minecraft/class_243.method_1019 (Lnet/minecraft/class_243;)Lnet/minecraft/class_243;
      // de: invokeinterface java/util/List.add (Ljava/lang/Object;)Z 2
      // e3: pop
      // e4: iload 2
      // e5: iinc 8 1
      // e8: ifeq 8c
      // eb: aload 5
      // ed: areturn
   }

   private void abbb(aabbbbaaa var1, class_310 var2, float var3) {
      int var10000 = baaabbaa.bba;
      class_746 var5 = var2.field_1724;
      class_1799 var6 = var5.method_6047();
      int var4 = var10000;

      try {
         if (var6.method_7960()) {
            return;
         }
      } catch (MatchException var17) {
         throw var17;
      }

      class_243 var7 = var5.method_30950(var3).method_1031(0.0, var5.method_5751(), 0.0);
      float var8 = var5.method_5695(var3);
      float var9 = var5.method_5705(var3);
      class_243 var10 = this.baba(var5, var3);
      Color var11 = (Color)this.baab.abbb();

      for (aabb var13 : this.abb(var6, var5, var8, var9, var3)) {
         class_243 var14 = var7.method_1019(var13.b());
         abaaba var15 = this.aaba(var2.field_1687, var5, var14, var13.aa().method_1019(var10), var13.a(), 0.0);
         class_243 var16 = this.baaa(var1, var5, var14, var8, var9);
         this.b(var1, abba(var15.a(), var16), var15, var3, var11);
         if (var4 != 0) {
            break;
         }
      }
   }

   // $VF: Handled exception range with multiple entry points by splitting it
   // $VF: Duplicated exception handlers to handle obfuscated exceptions
   private class_243 baaa(aabbbbaaa var1, class_746 var2, class_243 var3, float var4, float var5) {
      int var10000 = baaabbaa.bba;
      class_4184 var7 = this.bab(var1);
      int var6 = var10000;

      label48: {
         label43: {
            try {
               var18 = var7;
               if (var6 != 0) {
                  break label43;
               }

               if (var7 == null) {
                  break label48;
               }
            } catch (MatchException var17) {
               throw var17;
            }

            var18 = var7;
         }

         try {
            if (var18.method_19333()) {
               break label48;
            }
         } catch (MatchException var16) {
            throw var16;
         }

         class_243 var8 = class_243.method_1030(var4, var5);
         class_243 var9 = class_243.method_1030(0.0F, var5 + 90.0F);
         class_243 var10 = var9.method_1036(var8);

         label30: {
            try {
               if (var2.method_6068() == class_1306.field_6182) {
                  var19 = -1.0;
                  break label30;
               }
            } catch (MatchException var15) {
               throw var15;
            }

            var19 = 1.0;
         }

         double var11 = var19;
         class_243 var13 = bbaabbaa.baaab(var1)
            .method_1019(var9.method_1021(var11 * 0.28))
            .method_1019(var10.method_1021(-0.22))
            .method_1019(var8.method_1021(0.6));
         return var13.method_1020(var3);
      }

      try {
         return class_243.field_1353;
      } catch (MatchException var14) {
         throw var14;
      }
   }

   public aabaab() {
      int var1 = 1969089700;
      super(
         aabbaaaba.aaab(aabb(a(-1871813430, var1 ^ -802376161), a(-1871813431, var1 ^ 1700558320))),
         bbaabbba.bab,
         aabbaaaba.aaab(aabb(a(-1871813432, var1 ^ -1938970890), a(-1871813425, var1 ^ -1020632937)))
      );
      this.bbab = (bababa)this.abbbaaa(
         new bababa(
            aabbaaaba.aaab(aabb(a(-1871813426, var1 ^ -2084664911), a(-1871813427, var1 ^ -388283119))),
            120.0,
            30.0,
            300.0,
            10.0
         )
      );
      this.aaba = (abbaaaaa)this.abbbaaa(
         new abbaaaaa(
            aabbaaaba.aaab(aabb(a(-1871813428, var1 ^ -1729666888), a(-1871813421, var1 ^ 2020197173))), true
         )
      );
      this.bbb = (abbaaaaa)this.abbbaaa(
         new abbaaaaa(
            aabbaaaba.aaab(aabb(a(-1871813422, var1 ^ -1302063426), a(-1871813423, var1 ^ 149883297))), true
         )
      );
      this.baab = (abaabaaab)this.abbbaaa(
         new abaabaaab(
            aabbaaaba.aaab(aabb(a(-1871813424, var1 ^ 1165069986), a(-1871813417, var1 ^ -1388893053))),
            new Color(
               ab(a(-1871813418, var1 ^ 646561381), 9222451659827951615L),
               ab(a(-1871813419, var1 ^ -880033220), 710215924789091159L),
               ab(a(-1871813420, var1 ^ 72190765), 7124810289411593055L),
               ab(a(-1871813413, var1 ^ 636907621), 2860668579159615443L)
            )
         )
      );
      this.ba = (abaabaaab)this.abbbaaa(
         new abaabaaab(
            aabbaaaba.aaab(aabb(a(-1871813414, var1 ^ -1856949895), a(-1871813415, var1 ^ -554068649))),
            new Color(
               ab(a(-1871813416, var1 ^ 1144764012), 5513893816519971626L),
               ab(a(-1871813409, var1 ^ 104424129), 5873342275829248443L),
               ab(a(-1871813410, var1 ^ 1721339425), 1043165556720339867L),
               ab(a(-1871813411, var1 ^ 1376188504), 4915566612456623380L)
            )
         )
      );
      this.aaaa = new HashMap();
      this.aaa = ab(a(-1871813412, var1 ^ -427096651), 285671436757337566L);
      this.bba = class_243.field_1353;
      this.babb = class_243.field_1353;
   }

   private void baab(class_1799 param1, class_243 param2, List param3) {
      // $VF: Couldn't be decompiled
      // Please report this to the Vineflower issue tracker, at https://github.com/Vineflower/vineflower/issues with a copy of the class file (if you have the rights to distribute it!)
      // java.lang.RuntimeException: parsing failure!
      //   at org.jetbrains.java.decompiler.modules.decompiler.decompose.DomHelper.parseGraph(DomHelper.java:211)
      //   at org.jetbrains.java.decompiler.main.rels.MethodProcessor.codeToJava(MethodProcessor.java:166)
      //
      // Bytecode:
      // 00: getstatic qeaa361f143ee4a0894bd168fd9b30c66/qf4ccf8f5435d4a78bdca4d6a018b578e/baaabbaa.bba I
      // 03: aload 1
      // 04: getstatic net/minecraft/class_9334.field_49649 Lnet/minecraft/class_9331;
      // 07: invokevirtual net/minecraft/class_1799.method_58694 (Lnet/minecraft/class_9331;)Ljava/lang/Object;
      // 0a: checkcast net/minecraft/class_9278
      // 0d: astore 5
      // 0f: istore 4
      // 11: aload 5
      // 13: iload 4
      // 15: ifne 21
      // 18: ifnull 37
      // 1b: goto 1f
      // 1e: athrow
      // 1f: aload 5
      // 21: getstatic net/minecraft/class_1802.field_8639 Lnet/minecraft/class_1792;
      // 24: invokevirtual net/minecraft/class_9278.method_57438 (Lnet/minecraft/class_1792;)Z
      // 27: iload 4
      // 29: ifne 34
      // 2c: ifeq 37
      // 2f: goto 33
      // 32: athrow
      // 33: bipush 1
      // 34: goto 38
      // 37: bipush 0
      // 38: istore 6
      // 3a: iload 6
      // 3c: ifeq 46
      // 3f: getstatic qeaa361f143ee4a0894bd168fd9b30c66/qf4ccf8f5435d4a78bdca4d6a018b578e/abaabb.aaa Lqeaa361f143ee4a0894bd168fd9b30c66/qf4ccf8f5435d4a78bdca4d6a018b578e/abaabb;
      // 42: goto 49
      // 45: athrow
      // 46: getstatic qeaa361f143ee4a0894bd168fd9b30c66/qf4ccf8f5435d4a78bdca4d6a018b578e/abaabb.b Lqeaa361f143ee4a0894bd168fd9b30c66/qf4ccf8f5435d4a78bdca4d6a018b578e/abaabb;
      // 49: astore 7
      // 4b: new net/minecraft/class_243
      // 4e: dup
      // 4f: dconst_0
      // 50: iload 6
      // 52: ifeq 5c
      // 55: ldc2_w 0.15
      // 58: goto 5f
      // 5b: athrow
      // 5c: ldc2_w 0.1
      // 5f: dneg
      // 60: dconst_0
      // 61: invokespecial net/minecraft/class_243.<init> (DDD)V
      // 64: astore 8
      // 66: aload 2
      // 67: iload 6
      // 69: ifeq 73
      // 6c: ldc2_w 1.6
      // 6f: goto 76
      // 72: athrow
      // 73: ldc2_w 3.15
      // 76: invokevirtual net/minecraft/class_243.method_1021 (D)Lnet/minecraft/class_243;
      // 79: astore 9
      // 7b: aload 3
      // 7c: iload 4
      // 7e: ifne a2
      // 81: new qeaa361f143ee4a0894bd168fd9b30c66/qf4ccf8f5435d4a78bdca4d6a018b578e/aabb
      // 84: dup
      // 85: aload 9
      // 87: aload 7
      // 89: aload 8
      // 8b: invokespecial qeaa361f143ee4a0894bd168fd9b30c66/qf4ccf8f5435d4a78bdca4d6a018b578e/aabb.<init> (Lnet/minecraft/class_243;Lqeaa361f143ee4a0894bd168fd9b30c66/qf4ccf8f5435d4a78bdca4d6a018b578e/abaabb;Lnet/minecraft/class_243;)V
      // 8e: invokeinterface java/util/List.add (Ljava/lang/Object;)Z 2
      // 93: pop
      // 94: aload 5
      // 96: ifnull f4
      // 99: goto 9d
      // 9c: athrow
      // 9d: aload 5
      // 9f: invokevirtual net/minecraft/class_9278.method_57437 ()Ljava/util/List;
      // a2: iload 4
      // a4: ifne d7
      // a7: invokeinterface java/util/List.size ()I 1
      // ac: bipush 1
      // ad: if_icmple f4
      // b0: goto b4
      // b3: athrow
      // b4: aload 3
      // b5: new qeaa361f143ee4a0894bd168fd9b30c66/qf4ccf8f5435d4a78bdca4d6a018b578e/aabb
      // b8: dup
      // b9: aload 9
      // bb: ldc2_w 10.0
      // be: invokestatic java/lang/Math.toRadians (D)D
      // c1: d2f
      // c2: invokevirtual net/minecraft/class_243.method_1024 (F)Lnet/minecraft/class_243;
      // c5: aload 7
      // c7: aload 8
      // c9: invokespecial qeaa361f143ee4a0894bd168fd9b30c66/qf4ccf8f5435d4a78bdca4d6a018b578e/aabb.<init> (Lnet/minecraft/class_243;Lqeaa361f143ee4a0894bd168fd9b30c66/qf4ccf8f5435d4a78bdca4d6a018b578e/abaabb;Lnet/minecraft/class_243;)V
      // cc: invokeinterface java/util/List.add (Ljava/lang/Object;)Z 2
      // d1: pop
      // d2: aload 3
      // d3: goto d7
      // d6: athrow
      // d7: new qeaa361f143ee4a0894bd168fd9b30c66/qf4ccf8f5435d4a78bdca4d6a018b578e/aabb
      // da: dup
      // db: aload 9
      // dd: ldc2_w -10.0
      // e0: invokestatic java/lang/Math.toRadians (D)D
      // e3: d2f
      // e4: invokevirtual net/minecraft/class_243.method_1024 (F)Lnet/minecraft/class_243;
      // e7: aload 7
      // e9: aload 8
      // eb: invokespecial qeaa361f143ee4a0894bd168fd9b30c66/qf4ccf8f5435d4a78bdca4d6a018b578e/aabb.<init> (Lnet/minecraft/class_243;Lqeaa361f143ee4a0894bd168fd9b30c66/qf4ccf8f5435d4a78bdca4d6a018b578e/abaabb;Lnet/minecraft/class_243;)V
      // ee: invokeinterface java/util/List.add (Ljava/lang/Object;)Z 2
      // f3: pop
      // f4: return
   }

   private static int a(int var0, int var1) {
      int var2 = aaaba[var0 ^ -1871813149] ^ var1 ^ var0;
      var2 += 62913;
      var2 += 57201;
      var2 -= 63161;
      var2 += 42214;
      var2 -= 24027;
      var2 += 2682;
      return var2 - 7560;
   }

   private class_243 baba(class_746 param1, float param2) {
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
      // 05: getfield net/minecraft/class_746.field_6012 I
      // 08: aload 0
      // 09: getfield qeaa361f143ee4a0894bd168fd9b30c66/qf4ccf8f5435d4a78bdca4d6a018b578e/aabaab.aaa I
      // 0c: if_icmpeq 77
      // 0f: new net/minecraft/class_243
      // 12: dup
      // 13: aload 1
      // 14: invokevirtual net/minecraft/class_746.method_23317 ()D
      // 17: aload 1
      // 18: getfield net/minecraft/class_746.field_6014 D
      // 1b: dsub
      // 1c: aload 1
      // 1d: invokevirtual net/minecraft/class_746.method_24828 ()Z
      // 20: ifeq 2c
      // 23: goto 27
      // 26: athrow
      // 27: dconst_0
      // 28: goto 35
      // 2b: athrow
      // 2c: aload 1
      // 2d: invokevirtual net/minecraft/class_746.method_23318 ()D
      // 30: aload 1
      // 31: getfield net/minecraft/class_746.field_6036 D
      // 34: dsub
      // 35: aload 1
      // 36: invokevirtual net/minecraft/class_746.method_23321 ()D
      // 39: aload 1
      // 3a: getfield net/minecraft/class_746.field_5969 D
      // 3d: dsub
      // 3e: invokespecial net/minecraft/class_243.<init> (DDD)V
      // 41: astore 4
      // 43: aload 0
      // 44: aload 0
      // 45: iload 3
      // 46: ifne 5e
      // 49: getfield qeaa361f143ee4a0894bd168fd9b30c66/qf4ccf8f5435d4a78bdca4d6a018b578e/aabaab.aaa I
      // 4c: aload 1
      // 4d: getfield net/minecraft/class_746.field_6012 I
      // 50: bipush 1
      // 51: isub
      // 52: if_icmpne 64
      // 55: goto 59
      // 58: athrow
      // 59: aload 0
      // 5a: goto 5e
      // 5d: athrow
      // 5e: getfield qeaa361f143ee4a0894bd168fd9b30c66/qf4ccf8f5435d4a78bdca4d6a018b578e/aabaab.babb Lnet/minecraft/class_243;
      // 61: goto 66
      // 64: aload 4
      // 66: putfield qeaa361f143ee4a0894bd168fd9b30c66/qf4ccf8f5435d4a78bdca4d6a018b578e/aabaab.bba Lnet/minecraft/class_243;
      // 69: aload 0
      // 6a: aload 4
      // 6c: putfield qeaa361f143ee4a0894bd168fd9b30c66/qf4ccf8f5435d4a78bdca4d6a018b578e/aabaab.babb Lnet/minecraft/class_243;
      // 6f: aload 0
      // 70: aload 1
      // 71: getfield net/minecraft/class_746.field_6012 I
      // 74: putfield qeaa361f143ee4a0894bd168fd9b30c66/qf4ccf8f5435d4a78bdca4d6a018b578e/aabaab.aaa I
      // 77: aload 0
      // 78: getfield qeaa361f143ee4a0894bd168fd9b30c66/qf4ccf8f5435d4a78bdca4d6a018b578e/aabaab.bba Lnet/minecraft/class_243;
      // 7b: aload 0
      // 7c: getfield qeaa361f143ee4a0894bd168fd9b30c66/qf4ccf8f5435d4a78bdca4d6a018b578e/aabaab.babb Lnet/minecraft/class_243;
      // 7f: fload 2
      // 80: f2d
      // 81: invokevirtual net/minecraft/class_243.method_35590 (Lnet/minecraft/class_243;D)Lnet/minecraft/class_243;
      // 84: areturn
   }

   // $VF: Irreducible bytecode was duplicated to produce valid code
   static {
      int var32 = 1871606417;
      char[] var23 = "°!h\n\u0010\n".toCharArray();
      short var21 = 27988;
      byte var28 = -1;
      String var22 = "倜傈僕偰僀傟倣傐傓倜傜僀僯倵傟倨傚僯値働停僃僣倰僮僱倀偂偙僈僀傮傼偹僼倶僸傺僙候傩僳備傉值僄倂偏傍倧僉傮傰偯倂僦僅偿偲僭僱倁僓値偦倖傔傢倢傳傞偭偃傈傛們偀偔備偓倮倄傗傊傪倩偷傏僉倥僖偽偄偷倚傏僶倐僐倽傞倀倲偙倉傮做傎僔傥僉偣偺僜僆偭傤偤傲僫傦偍倠健倛偭偩倌倪像僞僵偍偊倘偛僃偗偝偞偮偌债偎僗僤僝僜僜倦傡倅偉做倾僷倯僈偎傷倃個僉側倀倌假僎傚倕倶傼僶傤傷倿麋鸙鸑鹗麎黤麺黽黂麅黒鸰麺麯鹟鸶麐黪鹞黃鹦黫鸗麏鹗鸤鹜鸚鹶鸠鸦鸇麥⬇⬩⮳⬼⬻⭑⭰⬥⯚⭜⭛⯿⯹⮀⮴⯄⯂⬹⯱⭝⬋⯲⯐⯵⮭⮹⮡⯰⯑⬆⭾⬼⬞⯅⯅⯼⯀⮠⭎⭒⭠⮐⮮⭶⮙⬨⮭⮞⮜⭱⮡⭒⯃⭉⮶⮱⭦⮲⯒⯲⮮⬌⯩⮟⮡⮮⭊⬒⭤⬜⭗⮂⭗⭦⯸⯎⭡⮐⬚⭜⬒⬽⭷⬔⬑⮨⮡⭨⬶⮦⭖⮾⭟⮺⯋⭰⮚⮇⮳⬝⯴⬱⯵⯆걳겔갮곘곫겜갩겆겫곸ퟒ흹힍ힸ휤흠흜흘흰ퟝ\ud7a7흃흨ퟴퟩ\ud7feͶΑ̫ϝϮΙ̬\u0383ήϽ";
      String[] var24 = new String[var23.length];

      while (true) {
         int var25 = 0;
         char var26 = 0;
         char var27 = '\u0000';
         if (var28 == 0) {
            aaabb = var24;
            aabaa = new Object[var24.length];
            int var17 = 52238577;
            byte[] var15 = "òÇP¾\u0006\u0012T?6étá43\u00827Ò²\u0081_\u000b\u0015ÝåÍHô\u009f\tÃ\u0089S\u009fí·qx\u001b\u0085Û£Ôî\u0010ÈÎÃ\u0099mÜN\u009d\u0084l%ïÑk´Î\u0000LÙ¥g}e\u008fÂ½\u0099÷+Ü(ú{.\bÖ\u00024\u0087\u0080/\u0094Ý\u0015¨R2¶÷\u0016oz©À\u0080R¼\n$\u0000\u0004£×ÅI&\u0091<£½û\u0097ò\u0080A\u0087Q\tÃ38SÍ©ûK5p¬vôvïø\u001de\u0080F\u0004Søëèí\u0090éVíG\u0096<í\u0084z±!ËRH\bæ\u0096\u0099Åw®\u0092Û\\¼×'\u009b\u0083ú_\u009a&êÃýÎo\u001bÓs\f\u009d<\u0019Pð\u0011\u00045Ø!l\u0098¥R:\u0011ämõ05\u0091ô\u0089Z*êøI/Rý=»W\u008c¢4jkï:.-í\u0099\u0091<ÚiGæÎÆ\u0016¾\u0085ú6\u0092\u0083¬\u008a:|\u0085õ\u0095\u001d\u009chÙ\u0002¶\u0001±Ä²}x\u0006X\u009c»\u009am\u001eìÑk 0Æ\\\u000bÓ\u0006ás+\u007fÝ@LÐ\u0088¬Ø\u001f\u0087î\u009ah\u001a (fHõDz4å©:&WÊá\n0h\u008f*ÜÍ§í¨3\u0095»\u0088·x\u0004\u0003ÀL§\u0099î2Z\\\u0086ÆÆ\u009c\u001f$r«\u009a\u0080Ò\"Ò\u0012£vA\u0084\u009an\u0010M\u001e¸?\u0011\u008aCã\u0090I\u0013\u009d\u0091b\u0019\u0010\u0092\u009c\u0093)\u0091ý8»\rïãÃ\u00adÙbP\u001cq\u0081ø\u001co²îúñ)4¹V\u0082\u001bV\u0017<\u0000È)ø²\u0014CN\u0081&)ÛJ\u0013y\u008e3ÊÔc³öºsºFvS_\u000f\u008eÉ?\u009e-\u0011\u0089Ë[ªm\u000f\u009f\u0004hØ½ZIåß±+`\u0087\u0001w_\u0003v\u0018Tk\u000fTaÉD¬)àt©Ó/æ\u0083M\u0083\u0005í·é!\bGO¸\u00ad%_\u0099\r:G`_;/\u0002\u0007ðÙø<Üµ\u0001\u008cå<%õ\u009bH\"z\u0015\u0088w\u001bþpoë3æ«;\fí&îr7ë¶R\u0087QSãOåÏÌñÑÇ[\u009f<Ã\u008fFµÌt?x\u0014\u001c(´§`qÄ´\u001bÈ¯AC¶F÷\u0013Ä{ö\u0081\u0017z+õ#´5Ê+í\u009bÚ¾KC\u001e\u009cíªi\u0080;\u0005\u009c§0!>zY\rØ\u007f\rDzd\n·B¨Ehl;«Óª\u008cjÊ}ø\u0087(f\u0014:\u001bV%éw\u009d\u008f6\r\u0080\u000bá#bBg\u0012\u0088úS¿\u0096\u0081jN^\u0010úØ@Ðì\u000b%\u001d+È ±U\u000e\u0091¤´Ãf\u008açS²m%©Ý\u0017x&Áf¢¥ Õê$'0\u008aéIlÑ5õAÕ±mÚ½</\f'ÑSe\u0090\u0017¦uíùÜe&\"ã;%\u009båÛ7²5£[\u0081ýÝávüØÎe\u0007:¦FÁ*¹*Â\u0002ÜmÎÅ.ø\u0081ø\u0015\u0082¦ô\u001a\u0016Lô\u0083\u0014Mî\u0017\u0082«\u000f§Ô÷Ê\u000f\u0081Y\u0080ríh\t\u0018\u001dõ4d\u001d_\u0007ò\u0005i:Ø×3Xú#æk\u0090+\u0003\u008a°êPWéoý/W\u0000©\u001cÝL*8\u001b®\u000fü\u008e\u0007M\u009dßº\u0092\u0098¾)}\u0091½g\"\u0089±¼l u,Öó,~\u0005\u008a\u0099¾IY\u0098>°Jom#¿¦··$ê\u0096zü\u0093mÅ\u000f\u0017À¶îÁ\u0015G`\u0085pòy\u0005oÃG\u0091Ge£Ð\u0084Ý{\u009fÑÓæêÇfpQÜöôl\u009bXBÊÒ\u008etªÛ\u0001ýè{%îÐ¨ø@h\u0084\u001d`\u0097\u0095]¿\u0002©I6â\u001d\u0016,ocöb\u0098\u009fÂ\u0019°\u001fx\u001c½o\u009dE¼9\u0088êì>S\u00adi·\u0088$_Y\u0080@\u009a\u0089ÄM\u0004¬tÌt\u0088\tc¦§¡\u001a\u0001\u009aÍ8Tfß\u0012ã\u0087Ý\u000b\u0018\u0083\u0087y;\u0087Ð\u0094\u0002¨É[Z\u009d9\u0083Ó\u00831ô%\u0002Ø\u00adY\u0092[q\u0004Úø\u008dj.R\u009fZ;\u0099\u0016rx\u0010Ðæ\u00adI?©Û\u001bØÖ\f}\u0080±\u009a\u0015@¢k\u0090fY\u001cÎ\u0098\u0093ÿO?â\u001aNOS·nÁêk~0z2úg\u0082\u0017\u000eyO/é¦å=v\u0083UBìN&A:Ü\u0091Oé\u0090\u001ddNñ¶&Nm&\u0011y\u0080\u0018ä\u009a\u00012î\u0085$¢SN\fºø:ÉüÛÏ|\u008dàò\u0095½Ë Úû£/\u009anägñ\nÿ¢\u00817\roa¹ìþ«´{s\u0011>¨£\\¡ãw´çuD?X0ÚÒZ[\u001d\u001d\u009c\u001a\u000b<'îõ\u0088\u0081\\ºÇ(+\u0014]êg\u0014\u001fèÖÃ\u007fIäñK×_9ÿ[e\u001c"
               .getBytes("ISO-8859-1");
            int var16 = var15.length / 4;
            aaaba = new int[var16];
            byte var18 = 0;
            int var19 = 0;

            do {
               int var20 = (var15[var18] & 255) << 24 | (var15[var18 + 1] & 255) << 16 | (var15[var18 + 2] & 255) << 8 | var15[var18 + 3] & 255;
               var20 ^= var17;
               aaaba[var19] = var20;
               var18 += 4;
            } while (++var19 < var16);

            String[] var13 = new String[a(-1871813145, var32 ^ -776903863)];
            int var11 = 0;
            String var10;
            int var12 = (var10 = bbab(22121, -1530057783, (short)12030)).length();
            int var9 = a(-1871813146, var32 ^ 135675897);
            int var35 = -1;

            label119:
            while (true) {
               String var38 = var10.substring(++var35, var35 + var9);
               int var10001 = -1;

               while (true) {
                  char[] var54;
                  label114: {
                     char[] var42 = var38.toCharArray();
                     int var10003 = var42.length;
                     int var14 = 0;
                     var54 = var42;
                     var10001 = var10003;
                     char[] var64;
                     int var10004;
                     if (var10003 <= 1) {
                        var64 = var42;
                        var10004 = var14;
                     } else {
                        var54 = var42;
                        var10001 = var10003;
                        if (var10003 <= var14) {
                           break label114;
                        }

                        var64 = var42;
                        var10004 = var14;
                     }

                     while (true) {
                        var64[var10004] = (char)(var64[var10004] ^ switch (var14 % a(-1871813141, var32 ^ -1662102165)) {
                           case 0 -> a(-1871813142, var32 ^ 2065197039);
                           case 1 -> a(-1871813143, var32 ^ -1596519338);
                           case 2 -> a(-1871813144, var32 ^ -875748992);
                           case 3 -> a(-1871813137, var32 ^ 1860152518);
                           case 4 -> a(-1871813138, var32 ^ -2022717561);
                           case 5 -> a(-1871813139, var32 ^ -764914026);
                           default -> a(-1871813140, var32 ^ 55524290);
                        });
                        var14++;
                        if (var10001 == 0) {
                           var10004 = var10001;
                           var64 = var54;
                        } else {
                           if (var10001 <= var14) {
                              break;
                           }

                           var64 = var54;
                           var10004 = var14;
                        }
                     }
                  }

                  String var71 = new String(var54).intern();
                  switch (var10001) {
                     case 0:
                        var13[var11++] = var71;
                        if ((var35 += var9) >= var12) {
                           baaa = var13;
                           bbba = new String[a(-1871813148, var32 ^ 180382534)];
                           long var0 = 1693274587693222900L;
                           long[] var6 = new long[a(-1871813133, var32 ^ 1686013829)];
                           int var3 = 0;
                           String var4;
                           int var5 = (var4 = bbab(23296, -1530057781, 22678)).length();
                           byte var2 = 0;

                           label93:
                           while (true) {
                              int var49 = var2;
                              var2 += 8;
                              byte[] var7 = var4.substring(var49, var2).getBytes(bbab((short)-31440, -1530057782, 381));
                              long[] var40 = var6;
                              var49 = var3++;
                              long var60 = (var7[0] & 255L) << a(-1871813134, var32 ^ -1044481113)
                                 | (var7[1] & 255L) << a(-1871813135, var32 ^ 685755089)
                                 | (var7[2] & 255L) << a(-1871813136, var32 ^ 2016275188)
                                 | (var7[3] & 255L) << a(-1871813129, var32 ^ 20407741)
                                 | (var7[4] & 255L) << a(-1871813130, var32 ^ 748109601)
                                 | (var7[5] & 255L) << a(-1871813131, var32 ^ -1420701511)
                                 | (var7[a(-1871813132, var32 ^ -199914114)] & 255L) << a(-1871813125, var32 ^ -1430035877)
                                 | var7[a(-1871813126, var32 ^ -1089878517)] & 255L;
                              byte var72 = -1;

                              while (true) {
                                 long var75 = var60 ^ var0;
                                 switch (var72) {
                                    case 0:
                                       var40[var49] = var75;
                                       if (var2 >= var5) {
                                          baba = var6;
                                          abb = new Integer[a(-1871813184, var32 ^ -2092571030)];
                                          aab = ab(a(-1871813177, var32 ^ -68571064), 6926944510518226492L);
                                          aaab = ab(a(-1871813178, var32 ^ -1813286600), 4744135504374087072L);
                                          return;
                                       }
                                       break;
                                    default:
                                       var40[var49] = var75;
                                       if (var2 < var5) {
                                          continue label93;
                                       }

                                       var5 = (var4 = bbab((short)16628, -1530057779, (short)-16485)).length();
                                       var2 = 0;
                                 }

                                 byte var51 = var2;
                                 var2 += 8;
                                 var7 = var4.substring(var51, var2).getBytes(bbab((short)2218, -1530057780, (short)9188));
                                 var40 = var6;
                                 var49 = var3++;
                                 var60 = (var7[0] & 255L) << a(-1871813127, var32 ^ 127939998)
                                    | (var7[1] & 255L) << a(-1871813128, var32 ^ 1243968286)
                                    | (var7[2] & 255L) << a(-1871813121, var32 ^ -1598154310)
                                    | (var7[3] & 255L) << a(-1871813122, var32 ^ -243031117)
                                    | (var7[4] & 255L) << a(-1871813123, var32 ^ 1376395532)
                                    | (var7[5] & 255L) << a(-1871813124, var32 ^ 995110831)
                                    | (var7[a(-1871813181, var32 ^ -129444029)] & 255L) << a(-1871813182, var32 ^ -1351281082)
                                    | var7[a(-1871813183, var32 ^ -319029419)] & 255L;
                                 var72 = 0;
                              }
                           }
                        }

                        var9 = var10.charAt(var35);
                        break;
                     default:
                        var13[var11++] = var71;
                        if ((var35 += var9) < var12) {
                           var9 = var10.charAt(var35);
                           continue label119;
                        }

                        var12 = (var10 = bbab(13427, -1530057784, (short)-32024)).length();
                        var9 = a(-1871813147, var32 ^ -833939836);
                        var35 = -1;
                  }

                  var38 = var10.substring(++var35, var35 + var9);
                  var10001 = 0;
               }
            }
         }

         do {
            var27 = var23[var25];
            char[] var29 = var22.substring(var26, var26 + var27).toCharArray();
            int var30 = 0;

            do {
               short var31 = switch (var30 % 6) {
                  default -> 231;
                  case 1 -> 246;
                  case 2 -> 119;
                  case 3 -> 148;
                  case 4 -> 206;
                  case 5 -> 14;
               };
               var29[var30] = (char)(var29[var30] ^ var31 ^ var21);
            } while (++var30 < var29.length);

            var24[var25] = new String(var29).intern();
            var26 += var27;
         } while (++var25 < var23.length);

         var28 = 0;
      }
   }

   private void babb(aabbbbaaa param1, class_310 param2, float param3) {
      // $VF: Couldn't be decompiled
      // Please report this to the Vineflower issue tracker, at https://github.com/Vineflower/vineflower/issues with a copy of the class file (if you have the rights to distribute it!)
      // java.lang.NullPointerException: Cannot invoke "org.jetbrains.java.decompiler.code.cfg.ExceptionRangeCFG.isCircular()" because "range" is null
      //   at org.jetbrains.java.decompiler.modules.decompiler.decompose.DomHelper.graphToStatement(DomHelper.java:84)
      //   at org.jetbrains.java.decompiler.modules.decompiler.decompose.DomHelper.parseGraph(DomHelper.java:203)
      //   at org.jetbrains.java.decompiler.main.rels.MethodProcessor.codeToJava(MethodProcessor.java:166)
      //
      // Bytecode:
      // 000: aload 2
      // 001: getfield net/minecraft/class_310.field_1687 Lnet/minecraft/class_638;
      // 004: astore 5
      // 006: aload 5
      // 008: invokevirtual net/minecraft/class_638.method_75260 ()J
      // 00b: lstore 6
      // 00d: aload 0
      // 00e: invokevirtual qeaa361f143ee4a0894bd168fd9b30c66/qf4ccf8f5435d4a78bdca4d6a018b578e/aabaab.bb ()I
      // 011: istore 8
      // 013: getstatic qeaa361f143ee4a0894bd168fd9b30c66/qf4ccf8f5435d4a78bdca4d6a018b578e/baaabbaa.bba I
      // 016: aload 0
      // 017: getfield qeaa361f143ee4a0894bd168fd9b30c66/qf4ccf8f5435d4a78bdca4d6a018b578e/aabaab.ba Lqeaa361f143ee4a0894bd168fd9b30c66/qf4ccf8f5435d4a78bdca4d6a018b578e/abaabaaab;
      // 01a: invokevirtual qeaa361f143ee4a0894bd168fd9b30c66/qf4ccf8f5435d4a78bdca4d6a018b578e/abaabaaab.abbb ()Ljava/lang/Object;
      // 01d: checkcast java/awt/Color
      // 020: astore 9
      // 022: aload 5
      // 024: invokevirtual net/minecraft/class_638.method_18112 ()Ljava/lang/Iterable;
      // 027: invokeinterface java/lang/Iterable.iterator ()Ljava/util/Iterator; 1
      // 02c: astore 10
      // 02e: istore 4
      // 030: aload 10
      // 032: invokeinterface java/util/Iterator.hasNext ()Z 1
      // 037: ifeq 1d1
      // 03a: aload 10
      // 03c: iload 4
      // 03e: ifne 032
      // 041: invokeinterface java/util/Iterator.next ()Ljava/lang/Object; 1
      // 046: checkcast net/minecraft/class_1297
      // 049: astore 11
      // 04b: iload 4
      // 04d: ifne 1e7
      // 050: aload 11
      // 052: invokestatic qeaa361f143ee4a0894bd168fd9b30c66/qf4ccf8f5435d4a78bdca4d6a018b578e/abaabb.ba (Lnet/minecraft/class_1297;)Lqeaa361f143ee4a0894bd168fd9b30c66/qf4ccf8f5435d4a78bdca4d6a018b578e/abaabb;
      // 055: astore 12
      // 057: aload 12
      // 059: ifnull 030
      // 05c: aload 11
      // 05e: iload 4
      // 060: ifne 06f
      // 063: invokevirtual net/minecraft/class_1297.method_5805 ()Z
      // 066: ifeq 030
      // 069: goto 06d
      // 06c: athrow
      // 06d: aload 11
      // 06f: iload 4
      // 071: ifne 089
      // 074: invokevirtual net/minecraft/class_1297.method_31481 ()Z
      // 077: ifeq 087
      // 07a: goto 07e
      // 07d: athrow
      // 07e: iload 4
      // 080: ifeq 030
      // 083: goto 087
      // 086: athrow
      // 087: aload 11
      // 089: invokevirtual net/minecraft/class_1297.method_18798 ()Lnet/minecraft/class_243;
      // 08c: astore 13
      // 08e: aload 13
      // 090: iload 4
      // 092: ifne 0c2
      // 095: invokevirtual net/minecraft/class_243.method_1027 ()D
      // 098: ldc2_w 1.0E-6
      // 09b: dcmpg
      // 09c: ifge 0ac
      // 09f: goto 0a3
      // 0a2: athrow
      // 0a3: iload 4
      // 0a5: ifeq 030
      // 0a8: goto 0ac
      // 0ab: athrow
      // 0ac: new net/minecraft/class_243
      // 0af: dup
      // 0b0: aload 11
      // 0b2: invokevirtual net/minecraft/class_1297.method_23317 ()D
      // 0b5: aload 11
      // 0b7: invokevirtual net/minecraft/class_1297.method_23318 ()D
      // 0ba: aload 11
      // 0bc: invokevirtual net/minecraft/class_1297.method_23321 ()D
      // 0bf: invokespecial net/minecraft/class_243.<init> (DDD)V
      // 0c2: astore 14
      // 0c4: aload 0
      // 0c5: getfield qeaa361f143ee4a0894bd168fd9b30c66/qf4ccf8f5435d4a78bdca4d6a018b578e/aabaab.aaaa Ljava/util/Map;
      // 0c8: aload 11
      // 0ca: invokevirtual net/minecraft/class_1297.method_5628 ()I
      // 0cd: invokestatic java/lang/Integer.valueOf (I)Ljava/lang/Integer;
      // 0d0: invokeinterface java/util/Map.get (Ljava/lang/Object;)Ljava/lang/Object; 2
      // 0d5: checkcast qeaa361f143ee4a0894bd168fd9b30c66/qf4ccf8f5435d4a78bdca4d6a018b578e/aaabbbba
      // 0d8: astore 15
      // 0da: aload 15
      // 0dc: iload 4
      // 0de: ifne 0ea
      // 0e1: ifnull 111
      // 0e4: goto 0e8
      // 0e7: athrow
      // 0e8: aload 15
      // 0ea: aload 5
      // 0ec: lload 6
      // 0ee: aload 14
      // 0f0: aload 13
      // 0f2: aload 12
      // 0f4: iload 8
      // 0f6: invokevirtual qeaa361f143ee4a0894bd168fd9b30c66/qf4ccf8f5435d4a78bdca4d6a018b578e/aaabbbba.b (Lnet/minecraft/class_1937;JLnet/minecraft/class_243;Lnet/minecraft/class_243;Lqeaa361f143ee4a0894bd168fd9b30c66/qf4ccf8f5435d4a78bdca4d6a018b578e/abaabb;I)Z
      // 0f9: iload 4
      // 0fb: ifne 123
      // 0fe: ifeq 111
      // 101: goto 105
      // 104: athrow
      // 105: aload 15
      // 107: invokevirtual qeaa361f143ee4a0894bd168fd9b30c66/qf4ccf8f5435d4a78bdca4d6a018b578e/aaabbbba.bb ()Lqeaa361f143ee4a0894bd168fd9b30c66/qf4ccf8f5435d4a78bdca4d6a018b578e/abaaba;
      // 10a: astore 16
      // 10c: iload 4
      // 10e: ifeq 171
      // 111: aload 11
      // 113: iload 4
      // 115: ifne 128
      // 118: goto 11c
      // 11b: athrow
      // 11c: instanceof net/minecraft/class_1668
      // 11f: goto 123
      // 122: athrow
      // 123: ifeq 135
      // 126: aload 11
      // 128: checkcast net/minecraft/class_1668
      // 12b: astore 19
      // 12d: aload 19
      // 12f: getfield net/minecraft/class_1668.field_51893 D
      // 132: goto 136
      // 135: dconst_0
      // 136: dstore 17
      // 138: aload 0
      // 139: aload 5
      // 13b: aload 11
      // 13d: aload 14
      // 13f: aload 13
      // 141: aload 12
      // 143: dload 17
      // 145: invokevirtual qeaa361f143ee4a0894bd168fd9b30c66/qf4ccf8f5435d4a78bdca4d6a018b578e/aabaab.aaba (Lnet/minecraft/class_1937;Lnet/minecraft/class_1297;Lnet/minecraft/class_243;Lnet/minecraft/class_243;Lqeaa361f143ee4a0894bd168fd9b30c66/qf4ccf8f5435d4a78bdca4d6a018b578e/abaabb;D)Lqeaa361f143ee4a0894bd168fd9b30c66/qf4ccf8f5435d4a78bdca4d6a018b578e/abaaba;
      // 148: astore 16
      // 14a: aload 0
      // 14b: getfield qeaa361f143ee4a0894bd168fd9b30c66/qf4ccf8f5435d4a78bdca4d6a018b578e/aabaab.aaaa Ljava/util/Map;
      // 14e: aload 11
      // 150: invokevirtual net/minecraft/class_1297.method_5628 ()I
      // 153: invokestatic java/lang/Integer.valueOf (I)Ljava/lang/Integer;
      // 156: new qeaa361f143ee4a0894bd168fd9b30c66/qf4ccf8f5435d4a78bdca4d6a018b578e/aaabbbba
      // 159: dup
      // 15a: aload 5
      // 15c: lload 6
      // 15e: aload 14
      // 160: aload 13
      // 162: aload 12
      // 164: iload 8
      // 166: aload 16
      // 168: invokespecial qeaa361f143ee4a0894bd168fd9b30c66/qf4ccf8f5435d4a78bdca4d6a018b578e/aaabbbba.<init> (Lnet/minecraft/class_1937;JLnet/minecraft/class_243;Lnet/minecraft/class_243;Lqeaa361f143ee4a0894bd168fd9b30c66/qf4ccf8f5435d4a78bdca4d6a018b578e/abaabb;ILqeaa361f143ee4a0894bd168fd9b30c66/qf4ccf8f5435d4a78bdca4d6a018b578e/abaaba;)V
      // 16b: invokeinterface java/util/Map.put (Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object; 3
      // 170: pop
      // 171: new java/util/ArrayList
      // 174: dup
      // 175: aload 16
      // 177: invokevirtual qeaa361f143ee4a0894bd168fd9b30c66/qf4ccf8f5435d4a78bdca4d6a018b578e/abaaba.a ()Ljava/util/List;
      // 17a: invokeinterface java/util/List.size ()I 1
      // 17f: bipush 1
      // 180: iadd
      // 181: invokespecial java/util/ArrayList.<init> (I)V
      // 184: astore 17
      // 186: iload 4
      // 188: aload 11
      // 18a: fload 3
      // 18b: invokevirtual net/minecraft/class_1297.method_30950 (F)Lnet/minecraft/class_243;
      // 18e: astore 18
      // 190: ifne 1cc
      // 193: aload 18
      // 195: aload 14
      // 197: invokevirtual net/minecraft/class_243.method_1025 (Lnet/minecraft/class_243;)D
      // 19a: ldc2_w 1.0E-8
      // 19d: dcmpl
      // 19e: ifle 1b3
      // 1a1: goto 1a5
      // 1a4: athrow
      // 1a5: aload 17
      // 1a7: aload 18
      // 1a9: invokeinterface java/util/List.add (Ljava/lang/Object;)Z 2
      // 1ae: pop
      // 1af: goto 1b3
      // 1b2: athrow
      // 1b3: aload 17
      // 1b5: aload 16
      // 1b7: invokevirtual qeaa361f143ee4a0894bd168fd9b30c66/qf4ccf8f5435d4a78bdca4d6a018b578e/abaaba.a ()Ljava/util/List;
      // 1ba: invokeinterface java/util/List.addAll (Ljava/util/Collection;)Z 2
      // 1bf: pop
      // 1c0: aload 0
      // 1c1: aload 1
      // 1c2: aload 17
      // 1c4: aload 16
      // 1c6: fload 3
      // 1c7: aload 9
      // 1c9: invokevirtual qeaa361f143ee4a0894bd168fd9b30c66/qf4ccf8f5435d4a78bdca4d6a018b578e/aabaab.b (Lqeaa361f143ee4a0894bd168fd9b30c66/qf4ccf8f5435d4a78bdca4d6a018b578e/aabbbbaaa;Ljava/util/List;Lqeaa361f143ee4a0894bd168fd9b30c66/qf4ccf8f5435d4a78bdca4d6a018b578e/abaaba;FLjava/awt/Color;)V
      // 1cc: iload 4
      // 1ce: ifeq 030
      // 1d1: aload 0
      // 1d2: getfield qeaa361f143ee4a0894bd168fd9b30c66/qf4ccf8f5435d4a78bdca4d6a018b578e/aabaab.aaaa Ljava/util/Map;
      // 1d5: invokeinterface java/util/Map.keySet ()Ljava/util/Set; 1
      // 1da: aload 5
      // 1dc: invokedynamic test (Lnet/minecraft/class_638;)Ljava/util/function/Predicate; bsm=java/lang/invoke/LambdaMetafactory.metafactory (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;Ljava/lang/invoke/MethodType;Ljava/lang/invoke/MethodHandle;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[ (Ljava/lang/Object;)Z, qeaa361f143ee4a0894bd168fd9b30c66/qf4ccf8f5435d4a78bdca4d6a018b578e/aabaab.bbb (Lnet/minecraft/class_638;Ljava/lang/Integer;)Z, (Ljava/lang/Integer;)Z ]
      // 1e1: invokeinterface java/util/Set.removeIf (Ljava/util/function/Predicate;)Z 2
      // 1e6: pop
      // 1e7: return
   }

   private void b(aabbbbaaa param1, List param2, abaaba param3, float param4, Color param5) {
      // $VF: Couldn't be decompiled
      // Please report this to the Vineflower issue tracker, at https://github.com/Vineflower/vineflower/issues with a copy of the class file (if you have the rights to distribute it!)
      // java.lang.RuntimeException: parsing failure!
      //   at org.jetbrains.java.decompiler.modules.decompiler.decompose.DomHelper.parseGraph(DomHelper.java:211)
      //   at org.jetbrains.java.decompiler.main.rels.MethodProcessor.codeToJava(MethodProcessor.java:166)
      //
      // Bytecode:
      // 00: getstatic qeaa361f143ee4a0894bd168fd9b30c66/qf4ccf8f5435d4a78bdca4d6a018b578e/baaabbaa.bba I
      // 03: istore 6
      // 05: aload 2
      // 06: invokeinterface java/util/List.size ()I 1
      // 0b: iload 6
      // 0d: ifne 1f
      // 10: bipush 2
      // 11: if_icmpge 1a
      // 14: goto 18
      // 17: athrow
      // 18: return
      // 19: athrow
      // 1a: aload 5
      // 1c: invokevirtual java/awt/Color.getAlpha ()I
      // 1f: i2d
      // 20: dstore 7
      // 22: aload 2
      // 23: invokestatic qeaa361f143ee4a0894bd168fd9b30c66/qf4ccf8f5435d4a78bdca4d6a018b578e/aabaab.aaa (Ljava/util/List;)Ljava/util/List;
      // 26: astore 9
      // 28: bipush 0
      // 29: istore 10
      // 2b: iload 10
      // 2d: bipush 1
      // 2e: iadd
      // 2f: aload 9
      // 31: invokeinterface java/util/List.size ()I 1
      // 36: if_icmpge 6d
      // 39: iload 6
      // 3b: ifne 88
      // 3e: aload 1
      // 3f: aload 9
      // 41: iload 10
      // 43: invokeinterface java/util/List.get (I)Ljava/lang/Object; 2
      // 48: checkcast net/minecraft/class_243
      // 4b: aload 9
      // 4d: iload 10
      // 4f: bipush 1
      // 50: iadd
      // 51: invokeinterface java/util/List.get (I)Ljava/lang/Object; 2
      // 56: checkcast net/minecraft/class_243
      // 59: aload 5
      // 5b: dload 7
      // 5d: fconst_2
      // 5e: invokestatic qeaa361f143ee4a0894bd168fd9b30c66/qf4ccf8f5435d4a78bdca4d6a018b578e/bbaabbaa.abaa (Lqeaa361f143ee4a0894bd168fd9b30c66/qf4ccf8f5435d4a78bdca4d6a018b578e/aabbbbaaa;Lnet/minecraft/class_243;Lnet/minecraft/class_243;Ljava/awt/Color;DF)V
      // 61: iload 6
      // 63: iinc 10 1
      // 66: ifeq 2b
      // 69: goto 6d
      // 6c: athrow
      // 6d: aload 0
      // 6e: iload 6
      // 70: ifne 89
      // 73: getfield qeaa361f143ee4a0894bd168fd9b30c66/qf4ccf8f5435d4a78bdca4d6a018b578e/aabaab.aaba Lqeaa361f143ee4a0894bd168fd9b30c66/qf4ccf8f5435d4a78bdca4d6a018b578e/abbaaaaa;
      // 76: invokevirtual qeaa361f143ee4a0894bd168fd9b30c66/qf4ccf8f5435d4a78bdca4d6a018b578e/abbaaaaa.abbb ()Ljava/lang/Object;
      // 79: checkcast java/lang/Boolean
      // 7c: invokevirtual java/lang/Boolean.booleanValue ()Z
      // 7f: ifne 88
      // 82: goto 86
      // 85: athrow
      // 86: return
      // 87: athrow
      // 88: aload 0
      // 89: aload 3
      // 8a: fload 4
      // 8c: invokevirtual qeaa361f143ee4a0894bd168fd9b30c66/qf4ccf8f5435d4a78bdca4d6a018b578e/aabaab.aaab (Lqeaa361f143ee4a0894bd168fd9b30c66/qf4ccf8f5435d4a78bdca4d6a018b578e/abaaba;F)Lnet/minecraft/class_238;
      // 8f: astore 10
      // 91: iload 6
      // 93: ifne b1
      // 96: aload 10
      // 98: ifnull bc
      // 9b: goto 9f
      // 9e: athrow
      // 9f: aload 1
      // a0: aload 10
      // a2: aload 5
      // a4: dload 7
      // a6: ldc2_w 0.22
      // a9: dmul
      // aa: invokestatic qeaa361f143ee4a0894bd168fd9b30c66/qf4ccf8f5435d4a78bdca4d6a018b578e/bbaabbaa.aabaaa (Ljava/lang/Object;Lnet/minecraft/class_238;Ljava/awt/Color;D)V
      // ad: goto b1
      // b0: athrow
      // b1: aload 1
      // b2: aload 10
      // b4: aload 5
      // b6: dload 7
      // b8: fconst_2
      // b9: invokestatic qeaa361f143ee4a0894bd168fd9b30c66/qf4ccf8f5435d4a78bdca4d6a018b578e/bbaabbaa.aaaba (Lqeaa361f143ee4a0894bd168fd9b30c66/qf4ccf8f5435d4a78bdca4d6a018b578e/aabbbbaaa;Lnet/minecraft/class_238;Ljava/awt/Color;DF)V
      // bc: return
   }
}
