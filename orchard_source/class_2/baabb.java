package nsc;

import com.google.gson.JsonObject;
import net.fabricmc.api.EnvType;
import net.fabricmc.api.Environment;
import net.minecraft.class_1297;
import net.minecraft.class_1657;
import net.minecraft.class_1661;
import net.minecraft.class_1792;
import net.minecraft.class_2338;
import net.minecraft.class_243;
import net.minecraft.class_310;
import net.minecraft.class_3965;
import net.minecraft.class_3966;

@Environment(EnvType.CLIENT)
public final class baabb extends abbaabbaa {
   private int aa;
   private int ba;
   private static final int[] bbab;
   private static final String[] bbba;
   private int bb;
   private static final Object[] bbbb;
   private final abbaaaaa aaa;
   private final aaabbbab aab;
   private class_3965 aba;
   private static final int abb = 1;
   private final aaabbbab baa;
   private static final long[] bab;
   private class_243 bba;
   private static final double bbb = 4.0;
   private static String[] aaaa;
   private final abbaaaaa aaab;
   private final abbaaaaa aaba;
   private static final Integer[] aabb;
   private static final Long[] abaa;
   private long ab;
   private int abab;
   private final baabaab abba;
   private static final long[] abbb;
   private static final int baaa = 1;
   private static final String[] baab;
   private static final long baba;
   private static final String[] babb;
   private final abbaaaaa bbaa;

   private void aa(class_310 param1) {
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
      // 05: getfield net/minecraft/class_310.field_1724 Lnet/minecraft/class_746;
      // 08: getfield net/minecraft/class_746.field_6012 I
      // 0b: istore 3
      // 0c: iload 2
      // 0d: ifne 53
      // 10: aload 0
      // 11: getfield qeaa361f143ee4a0894bd168fd9b30c66/qf4ccf8f5435d4a78bdca4d6a018b578e/baabb.bb I
      // 14: iload 3
      // 15: if_icmpgt 4a
      // 18: goto 1c
      // 1b: athrow
      // 1c: aload 0
      // 1d: iload 2
      // 1e: ifne 50
      // 21: goto 25
      // 24: athrow
      // 25: getfield qeaa361f143ee4a0894bd168fd9b30c66/qf4ccf8f5435d4a78bdca4d6a018b578e/baabb.abab I
      // 28: iload 3
      // 29: bipush 4
      // 2a: iadd
      // 2b: if_icmpgt 4a
      // 2e: goto 32
      // 31: athrow
      // 32: aload 0
      // 33: iload 2
      // 34: ifne 50
      // 37: goto 3b
      // 3a: athrow
      // 3b: getfield qeaa361f143ee4a0894bd168fd9b30c66/qf4ccf8f5435d4a78bdca4d6a018b578e/baabb.aa I
      // 3e: iload 3
      // 3f: bipush 4
      // 40: iadd
      // 41: if_icmpgt 4a
      // 44: goto 48
      // 47: athrow
      // 48: return
      // 49: athrow
      // 4a: aload 0
      // 4b: aload 1
      // 4c: invokevirtual qeaa361f143ee4a0894bd168fd9b30c66/qf4ccf8f5435d4a78bdca4d6a018b578e/baabb.a (Lnet/minecraft/class_310;)V
      // 4f: aload 0
      // 50: invokevirtual qeaa361f143ee4a0894bd168fd9b30c66/qf4ccf8f5435d4a78bdca4d6a018b578e/baabb.bbba ()V
      // 53: return
   }

   private double ab(class_1657 param1) {
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
      // 05: ifnull 1b
      // 08: aload 0
      // 09: getfield qeaa361f143ee4a0894bd168fd9b30c66/qf4ccf8f5435d4a78bdca4d6a018b578e/baabb.bba Lnet/minecraft/class_243;
      // 0c: iload 2
      // 0d: ifne 33
      // 10: goto 14
      // 13: athrow
      // 14: ifnonnull 20
      // 17: goto 1b
      // 1a: athrow
      // 1b: ldc2_w Infinity
      // 1e: dreturn
      // 1f: athrow
      // 20: new net/minecraft/class_243
      // 23: dup
      // 24: aload 1
      // 25: invokevirtual net/minecraft/class_1657.method_23317 ()D
      // 28: aload 1
      // 29: invokevirtual net/minecraft/class_1657.method_23318 ()D
      // 2c: aload 1
      // 2d: invokevirtual net/minecraft/class_1657.method_23321 ()D
      // 30: invokespecial net/minecraft/class_243.<init> (DDD)V
      // 33: astore 3
      // 34: aload 3
      // 35: aload 0
      // 36: getfield qeaa361f143ee4a0894bd168fd9b30c66/qf4ccf8f5435d4a78bdca4d6a018b578e/baabb.bba Lnet/minecraft/class_243;
      // 39: invokevirtual net/minecraft/class_243.method_1025 (Lnet/minecraft/class_243;)D
      // 3c: invokestatic java/lang/Math.sqrt (D)D
      // 3f: dreturn
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
      // 00: getstatic qeaa361f143ee4a0894bd168fd9b30c66/qf4ccf8f5435d4a78bdca4d6a018b578e/baaabbaa.bba I
      // 03: istore 2
      // 04: invokestatic qeaa361f143ee4a0894bd168fd9b30c66/qf4ccf8f5435d4a78bdca4d6a018b578e/aabbabbbb.aabbba ()Z
      // 07: iload 2
      // 08: ifne 25
      // 0b: ifeq 18
      // 0e: goto 12
      // 11: athrow
      // 12: aload 0
      // 13: invokevirtual qeaa361f143ee4a0894bd168fd9b30c66/qf4ccf8f5435d4a78bdca4d6a018b578e/baabb.bbba ()V
      // 16: return
      // 17: athrow
      // 18: aload 0
      // 19: aload 1
      // 1a: iload 2
      // 1b: ifne 42
      // 1e: invokevirtual qeaa361f143ee4a0894bd168fd9b30c66/qf4ccf8f5435d4a78bdca4d6a018b578e/baabb.baab (Lnet/minecraft/class_310;)Z
      // 21: goto 25
      // 24: athrow
      // 25: ifne 33
      // 28: aload 0
      // 29: aload 1
      // 2a: invokevirtual qeaa361f143ee4a0894bd168fd9b30c66/qf4ccf8f5435d4a78bdca4d6a018b578e/baabb.a (Lnet/minecraft/class_310;)V
      // 2d: aload 0
      // 2e: invokevirtual qeaa361f143ee4a0894bd168fd9b30c66/qf4ccf8f5435d4a78bdca4d6a018b578e/baabb.bbba ()V
      // 31: return
      // 32: athrow
      // 33: aload 0
      // 34: aload 1
      // 35: invokespecial qeaa361f143ee4a0894bd168fd9b30c66/qf4ccf8f5435d4a78bdca4d6a018b578e/baabb.aa (Lnet/minecraft/class_310;)V
      // 38: aload 0
      // 39: iload 2
      // 3a: ifne 5e
      // 3d: aload 1
      // 3e: goto 42
      // 41: athrow
      // 42: invokevirtual qeaa361f143ee4a0894bd168fd9b30c66/qf4ccf8f5435d4a78bdca4d6a018b578e/baabb.bba (Lnet/minecraft/class_310;)Z
      // 45: ifne 4f
      // 48: aload 0
      // 49: aload 1
      // 4a: invokevirtual qeaa361f143ee4a0894bd168fd9b30c66/qf4ccf8f5435d4a78bdca4d6a018b578e/baabb.a (Lnet/minecraft/class_310;)V
      // 4d: return
      // 4e: athrow
      // 4f: aload 0
      // 50: iload 2
      // 51: ifne 86
      // 54: getfield qeaa361f143ee4a0894bd168fd9b30c66/qf4ccf8f5435d4a78bdca4d6a018b578e/baabb.bbaa Lqeaa361f143ee4a0894bd168fd9b30c66/qf4ccf8f5435d4a78bdca4d6a018b578e/abbaaaaa;
      // 57: invokevirtual qeaa361f143ee4a0894bd168fd9b30c66/qf4ccf8f5435d4a78bdca4d6a018b578e/abbaaaaa.abbb ()Ljava/lang/Object;
      // 5a: goto 5e
      // 5d: athrow
      // 5e: checkcast java/lang/Boolean
      // 61: invokevirtual java/lang/Boolean.booleanValue ()Z
      // 64: ifeq 80
      // 67: aload 1
      // 68: getfield net/minecraft/class_310.field_1724 Lnet/minecraft/class_746;
      // 6b: invokevirtual net/minecraft/class_746.method_24828 ()Z
      // 6e: ifne 80
      // 71: goto 75
      // 74: athrow
      // 75: aload 0
      // 76: aload 1
      // 77: invokevirtual qeaa361f143ee4a0894bd168fd9b30c66/qf4ccf8f5435d4a78bdca4d6a018b578e/baabb.a (Lnet/minecraft/class_310;)V
      // 7a: aload 0
      // 7b: invokevirtual qeaa361f143ee4a0894bd168fd9b30c66/qf4ccf8f5435d4a78bdca4d6a018b578e/baabb.bbba ()V
      // 7e: return
      // 7f: athrow
      // 80: aload 0
      // 81: aload 1
      // 82: invokevirtual qeaa361f143ee4a0894bd168fd9b30c66/qf4ccf8f5435d4a78bdca4d6a018b578e/baabb.baaa (Lnet/minecraft/class_310;)V
      // 85: aload 0
      // 86: aload 1
      // 87: invokevirtual qeaa361f143ee4a0894bd168fd9b30c66/qf4ccf8f5435d4a78bdca4d6a018b578e/baabb.abba (Lnet/minecraft/class_310;)V
      // 8a: return
   }

   private boolean ba(class_310 param1, class_3966 param2) {
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
      // 05: getfield qeaa361f143ee4a0894bd168fd9b30c66/qf4ccf8f5435d4a78bdca4d6a018b578e/baabb.aaa Lqeaa361f143ee4a0894bd168fd9b30c66/qf4ccf8f5435d4a78bdca4d6a018b578e/abbaaaaa;
      // 08: invokevirtual qeaa361f143ee4a0894bd168fd9b30c66/qf4ccf8f5435d4a78bdca4d6a018b578e/baaabbaa.abbb ()Ljava/lang/Object;
      // 0b: checkcast java/lang/Boolean
      // 0e: invokevirtual java/lang/Boolean.booleanValue ()Z
      // 11: iload 3
      // 12: ifne 53
      // 15: ifeq 4e
      // 18: goto 1c
      // 1b: athrow
      // 1c: aload 1
      // 1d: iload 3
      // 1e: ifne 4f
      // 21: goto 25
      // 24: athrow
      // 25: getfield net/minecraft/class_310.field_1724 Lnet/minecraft/class_746;
      // 28: aload 2
      // 29: invokevirtual net/minecraft/class_3966.method_17782 ()Lnet/minecraft/class_1297;
      // 2c: invokevirtual net/minecraft/class_1297.method_73189 ()Lnet/minecraft/class_243;
      // 2f: ldc 6.0
      // 31: invokestatic qeaa361f143ee4a0894bd168fd9b30c66/qf4ccf8f5435d4a78bdca4d6a018b578e/aaabaaaa.aab (Lnet/minecraft/class_1309;Lnet/minecraft/class_243;F)F
      // 34: aload 1
      // 35: getfield net/minecraft/class_310.field_1724 Lnet/minecraft/class_746;
      // 38: invokevirtual net/minecraft/class_746.method_6032 ()F
      // 3b: aload 1
      // 3c: getfield net/minecraft/class_310.field_1724 Lnet/minecraft/class_746;
      // 3f: invokevirtual net/minecraft/class_746.method_6067 ()F
      // 42: fadd
      // 43: fcmpg
      // 44: iflt 4e
      // 47: goto 4b
      // 4a: athrow
      // 4b: bipush 0
      // 4c: ireturn
      // 4d: athrow
      // 4e: aload 1
      // 4f: aload 2
      // 50: invokestatic qeaa361f143ee4a0894bd168fd9b30c66/qf4ccf8f5435d4a78bdca4d6a018b578e/aabbabbbb.bbabbb (Lnet/minecraft/class_310;Lnet/minecraft/class_3966;)Z
      // 53: ireturn
   }

   @Override
   public void bbaa() {
   }

   private void bb(JsonObject param1, String param2, aaabbbab param3) {
      // $VF: Couldn't be decompiled
      // Please report this to the Vineflower issue tracker, at https://github.com/Vineflower/vineflower/issues with a copy of the class file (if you have the rights to distribute it!)
      //
      // Bytecode:
      // 00: getstatic qeaa361f143ee4a0894bd168fd9b30c66/qf4ccf8f5435d4a78bdca4d6a018b578e/baaabbaa.bba I
      // 03: istore 4
      // 05: aload 1
      // 06: ifnull 2d
      // 09: aload 2
      // 0a: ifnull 2d
      // 0d: goto 11
      // 10: athrow
      // 11: aload 1
      // 12: iload 4
      // 14: ifne 3b
      // 17: goto 1b
      // 1a: athrow
      // 1b: getstatic qeaa361f143ee4a0894bd168fd9b30c66/qf4ccf8f5435d4a78bdca4d6a018b578e/baabb.aaaa [Ljava/lang/String;
      // 1e: bipush 0
      // 1f: aaload
      // 20: invokestatic qeaa361f143ee4a0894bd168fd9b30c66/qf4ccf8f5435d4a78bdca4d6a018b578e/aabbaaaba.abba (Ljava/lang/String;)Ljava/lang/String;
      // 23: invokevirtual com/google/gson/JsonObject.has (Ljava/lang/String;)Z
      // 26: ifne 2f
      // 29: goto 2d
      // 2c: athrow
      // 2d: return
      // 2e: athrow
      // 2f: aload 1
      // 30: getstatic qeaa361f143ee4a0894bd168fd9b30c66/qf4ccf8f5435d4a78bdca4d6a018b578e/baabb.aaaa [Ljava/lang/String;
      // 33: bipush 0
      // 34: aaload
      // 35: invokestatic qeaa361f143ee4a0894bd168fd9b30c66/qf4ccf8f5435d4a78bdca4d6a018b578e/aabbaaaba.abba (Ljava/lang/String;)Ljava/lang/String;
      // 38: invokevirtual com/google/gson/JsonObject.getAsJsonObject (Ljava/lang/String;)Lcom/google/gson/JsonObject;
      // 3b: astore 5
      // 3d: aload 5
      // 3f: aload 2
      // 40: invokevirtual com/google/gson/JsonObject.get (Ljava/lang/String;)Lcom/google/gson/JsonElement;
      // 43: astore 6
      // 45: aload 6
      // 47: iload 4
      // 49: ifne 55
      // 4c: ifnull 64
      // 4f: goto 53
      // 52: athrow
      // 53: aload 6
      // 55: iload 4
      // 57: ifne 68
      // 5a: invokevirtual com/google/gson/JsonElement.isJsonNull ()Z
      // 5d: ifeq 66
      // 60: goto 64
      // 63: athrow
      // 64: return
      // 65: athrow
      // 66: aload 6
      // 68: iload 4
      // 6a: ifne cc
      // 6d: invokevirtual com/google/gson/JsonElement.isJsonArray ()Z
      // 70: ifeq c6
      // 73: goto 77
      // 76: athrow
      // 77: aload 6
      // 79: invokevirtual com/google/gson/JsonElement.getAsJsonArray ()Lcom/google/gson/JsonArray;
      // 7c: astore 7
      // 7e: aload 7
      // 80: iload 4
      // 82: ifne 9a
      // 85: invokevirtual com/google/gson/JsonArray.size ()I
      // 88: bipush 2
      // 89: if_icmplt c1
      // 8c: goto 90
      // 8f: athrow
      // 90: aload 7
      // 92: bipush 0
      // 93: invokevirtual com/google/gson/JsonArray.get (I)Lcom/google/gson/JsonElement;
      // 96: goto 9a
      // 99: athrow
      // 9a: invokevirtual com/google/gson/JsonElement.getAsDouble ()D
      // 9d: invokestatic qeaa361f143ee4a0894bd168fd9b30c66/qf4ccf8f5435d4a78bdca4d6a018b578e/baabb.abab (D)D
      // a0: dstore 8
      // a2: aload 7
      // a4: bipush 1
      // a5: invokevirtual com/google/gson/JsonArray.get (I)Lcom/google/gson/JsonElement;
      // a8: invokevirtual com/google/gson/JsonElement.getAsDouble ()D
      // ab: invokestatic qeaa361f143ee4a0894bd168fd9b30c66/qf4ccf8f5435d4a78bdca4d6a018b578e/baabb.abab (D)D
      // ae: dstore 10
      // b0: aload 3
      // b1: bipush 2
      // b2: newarray 7
      // b4: dup
      // b5: bipush 0
      // b6: dload 8
      // b8: dastore
      // b9: dup
      // ba: bipush 1
      // bb: dload 10
      // bd: dastore
      // be: invokevirtual qeaa361f143ee4a0894bd168fd9b30c66/qf4ccf8f5435d4a78bdca4d6a018b578e/aaabbbab.a ([D)V
      // c1: iload 4
      // c3: ifeq fa
      // c6: aload 6
      // c8: goto cc
      // cb: athrow
      // cc: iload 4
      // ce: ifne e1
      // d1: invokevirtual com/google/gson/JsonElement.isJsonPrimitive ()Z
      // d4: ifeq fa
      // d7: goto db
      // da: athrow
      // db: aload 6
      // dd: goto e1
      // e0: athrow
      // e1: invokevirtual com/google/gson/JsonElement.getAsDouble ()D
      // e4: invokestatic qeaa361f143ee4a0894bd168fd9b30c66/qf4ccf8f5435d4a78bdca4d6a018b578e/baabb.abab (D)D
      // e7: dstore 7
      // e9: aload 3
      // ea: bipush 2
      // eb: newarray 7
      // ed: dup
      // ee: bipush 0
      // ef: dload 7
      // f1: dastore
      // f2: dup
      // f3: bipush 1
      // f4: dload 7
      // f6: dastore
      // f7: invokevirtual qeaa361f143ee4a0894bd168fd9b30c66/qf4ccf8f5435d4a78bdca4d6a018b578e/aaabbbab.a ([D)V
      // fa: goto ff
      // fd: astore 7
      // ff: return
   }

   private void aaa(class_243 var1) {
      this.bba = var1;
      this.ab = System.currentTimeMillis();
   }

   private void aab() {
      this.bba = null;
      this.ab = 0L;
   }

   @Override
   public void abaab() {
      this.bbba();
      this.aab();
   }

   private static int bbbb(int var0, int var1) {
      int var2 = bbab[var0 ^ -285258555] ^ var1 ^ var0;
      var2 -= 45241;
      var2 ^= 53710;
      var2 -= 19023;
      var2 -= 15842;
      var2 -= 22100;
      var2 -= 55421;
      var2 ^= 7924;
      return var2 - 13073;
   }

   private static void aba() {
      int var0 = 1371748967;
      aaaa[0] = aaba(
         abbb(bbbb(-285258555, var0 ^ -1100669765), bbbb(-285258556, var0 ^ -1254508583)).toCharArray(),
         baba(bbbb(-285258553, var0 ^ 1988415572), 3564209871820440693L),
         abb(bbbb(-285258554, var0 ^ 849930492), 8980887012418222102L)
      );
      aaaa[1] = aaba(
         abbb(bbbb(-285258559, var0 ^ 1485639950), bbbb(-285258560, var0 ^ -1350846987)).toCharArray(),
         baba(bbbb(-285258557, var0 ^ -417708738), 7622151397100656327L),
         abb(bbbb(-285258558, var0 ^ -507900698), 92435999520998432L)
      );
      aaaa[2] = aaba(
         abbb(bbbb(-285258547, var0 ^ -801624238), bbbb(-285258548, var0 ^ 786148292)).toCharArray(),
         baba(bbbb(-285258545, var0 ^ -1978925375), 5634731437630560597L),
         abb(bbbb(-285258546, var0 ^ -43477375), 359284461417911854L)
      );
      aaaa[3] = aaba(
         abbb(bbbb(-285258551, var0 ^ -1331959264), bbbb(-285258552, var0 ^ 377017253)).toCharArray(),
         baba(bbbb(-285258549, var0 ^ -744273913), 8905769663307230638L),
         abb(bbbb(-285258550, var0 ^ 191421779), 2758099224854056094L)
      );
      aaaa[4] = aaba(
         abbb(bbbb(-285258539, var0 ^ 904671465), bbbb(-285258540, var0 ^ 988502055)).toCharArray(),
         baba(bbbb(-285258537, var0 ^ 559532836), 8140571749673983180L),
         abb(bbbb(-285258538, var0 ^ 1719796718), 1091788217675799264L)
      );
      aaaa[5] = aaba(
         abbb(bbbb(-285258543, var0 ^ 643168979), bbbb(-285258544, var0 ^ 2051741730)).toCharArray(),
         baba(bbbb(-285258541, var0 ^ 762232640), 7632080974445888295L),
         abb(bbbb(-285258542, var0 ^ -1554857295), 2898649798288347595L)
      );
      aaaa[abb(bbbb(-285258531, var0 ^ 1239005397), 4434401979240810239L)] = aaba(
         abbb(bbbb(-285258532, var0 ^ 69513908), bbbb(-285258529, var0 ^ -1217267729)).toCharArray(),
         baba(bbbb(-285258530, var0 ^ 955476615), 8889636438270567339L),
         abb(bbbb(-285258535, var0 ^ 405629964), 7827021746004289715L)
      );
      aaaa[abb(bbbb(-285258536, var0 ^ 947909213), 4191084701294461535L)] = aaba(
         abbb(bbbb(-285258533, var0 ^ 1410274696), bbbb(-285258534, var0 ^ 1457888882)).toCharArray(),
         baba(bbbb(-285258523, var0 ^ 1698333555), 2308236050279125635L),
         abb(bbbb(-285258524, var0 ^ 645288306), 599766046376635297L)
      );
      aaaa[abb(bbbb(-285258521, var0 ^ -512958308), 1066176535325147207L)] = aaba(
         abbb(bbbb(-285258522, var0 ^ -1066131886), bbbb(-285258527, var0 ^ -1098586090)).toCharArray(),
         baba(bbbb(-285258528, var0 ^ -440719131), 996137198090694132L),
         abb(bbbb(-285258525, var0 ^ -1357492644), 5690111489323274823L)
      );
      aaaa[abb(bbbb(-285258526, var0 ^ 1124839250), 8292038560580776859L)] = aaba(
         abbb(bbbb(-285258515, var0 ^ 957485935), bbbb(-285258516, var0 ^ -1697074114)).toCharArray(),
         baba(bbbb(-285258513, var0 ^ -1109102068), 6332874416915009155L),
         abb(bbbb(-285258514, var0 ^ -1144060620), 2027600343455052086L)
      );
   }

   public baabb() {
      int var1 = 407563915;
      super(
         aabbaaaba.aaab(aaaa[1]),
         bbaabbba.aa,
         aabbaaaba.aaab(aaaa[3])
      );
      this.abba = (baabaab)this.abbbaaa(
         new baabaab(
            aabbaaaba.aaab(aaaa[2]),
            abaaaabab.class,
            abaaaabab.abb
         )
      );
      this.bbaa = (abbaaaaa)this.abbbaaa(
         new abbaaaaa(
            aabbaaaba.aaab(aaaa[abb(bbbb(-285258519, var1 ^ -748891958), 8292038560580776859L)]), false
         )
      );
      aaabbbab var10002 = new aaabbbab(
         aabbaaaba.aaab(aaaa[abb(bbbb(-285258520, var1 ^ -20045183), 4033262175375976945L)]), 1.0, 1.0, 1.0, 4.0, 1.0
      );
      aabbaaaba.abba(aaaa[4]);
      this.aab = (aaabbbab)this.abbbaaa(
         var10002.aaa(abbb(bbbb(-285258517, var1 ^ -497453022), bbbb(-285258518, var1 ^ -242693344)))
      );
      var10002 = new aaabbbab(
         aabbaaaba.aaab(aaaa[abb(bbbb(-285258507, var1 ^ 119459407), 804285526411919897L)]), 1.0, 1.0, 1.0, 4.0, 1.0
      );
      aabbaaaba.abba(aaaa[4]);
      this.baa = (aaabbbab)this.abbbaaa(
         var10002.aaa(abbb(bbbb(-285258508, var1 ^ -912571230), bbbb(-285258505, var1 ^ 136630330)))
      );
      this.aaba = new abbaaaaa(
         aabbaaaba.aaab(aaaa[abb(bbbb(-285258506, var1 ^ 1949126406), 6324319932549000283L)]), true
      );
      this.aaab = (abbaaaaa)this.abbbaaa(
         new abbaaaaa(aabbaaaba.aaab(aaaa[5]), true)
      );
      this.ba = -1;
      this.bb = abb(bbbb(-285258511, var1 ^ 1591870315), 100066870474859377L);
      this.aaa = (abbaaaaa)this.abbbaaa(
         new abbaaaaa(abbb(bbbb(-285258512, var1 ^ 1440885990), bbbb(-285258509, var1 ^ -1943184670)), false)
      );
   }

   private static int abb(int var0, long var1) {
      int var3 = var0 ^ (int)(var1 & 32767L) ^ bbbb(-285258510, -164092143 ^ 1131903038);
      if (aabb[var3] == null) {
         aabb[var3] = (int)(bab[var3] ^ var1);
      }

      return aabb[var3];
   }

   private boolean bab() {
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
      // 05: getfield qeaa361f143ee4a0894bd168fd9b30c66/qf4ccf8f5435d4a78bdca4d6a018b578e/baabb.bba Lnet/minecraft/class_243;
      // 08: ifnull 3a
      // 0b: invokestatic java/lang/System.currentTimeMillis ()J
      // 0e: aload 0
      // 0f: getfield qeaa361f143ee4a0894bd168fd9b30c66/qf4ccf8f5435d4a78bdca4d6a018b578e/baabb.ab J
      // 12: lsub
      // 13: ldc_w -285258499
      // 16: ldc_w 182577915
      // 19: ldc_w -1734649070
      // 1c: ixor
      // 1d: invokestatic qeaa361f143ee4a0894bd168fd9b30c66/qf4ccf8f5435d4a78bdca4d6a018b578e/baabb.bbbb (II)I
      // 20: ldc2_w 5077039965745421625
      // 23: invokestatic qeaa361f143ee4a0894bd168fd9b30c66/qf4ccf8f5435d4a78bdca4d6a018b578e/baabb.baba (IJ)J
      // 26: lcmp
      // 27: iload 1
      // 28: ifne 37
      // 2b: goto 2f
      // 2e: athrow
      // 2f: ifgt 3a
      // 32: goto 36
      // 35: athrow
      // 36: bipush 1
      // 37: goto 3b
      // 3a: bipush 0
      // 3b: ireturn
   }

   private static String aaaaa(int var0, int var1) {
      int var3 = var0 ^ 14197890;
      char[] var4 = bbba[var3].toCharArray();
      StackTraceElement[] var2 = (StackTraceElement[])bbbb[var3];
      StackTraceElement[] var5;
      if (var2 != null) {
         var5 = var2;
      } else {
         var5 = new Throwable().getStackTrace();
         bbbb[var3] = var5;
      }

      StackTraceElement var6 = var5[1];
      int var7 = (var6.getClassName().hashCode() ^ var6.getMethodName().hashCode()) >> 16 ^ 1157441090;
      int var8 = 0;

      do {
         var4[var8] = (char)(var4[var8] ^ switch (var8 & 31) {
            default -> 160;
            case 1 -> 223;
            case 2 -> 213;
            case 3 -> 205;
            case 4 -> 36;
            case 5 -> 119;
            case 6 -> 155;
            case 7 -> 142;
            case 8 -> 209;
            case 9 -> 68;
            case 10 -> 179;
            case 11 -> 1;
            case 12 -> 85;
            case 13 -> 116;
            case 14 -> 176;
            case 15 -> 247;
            case 16 -> 61;
            case 17 -> 73;
            case 18 -> 153;
            case 19 -> 69;
            case 20 -> 241;
            case 21 -> 14;
            case 22 -> 212;
            case 23 -> 231;
            case 24 -> 132;
            case 25 -> 169;
            case 26 -> 148;
            case 27 -> 36;
            case 28 -> 166;
            case 29 -> 126;
            case 30 -> 85;
            case 31 -> 108;
         } ^ var1 >> 16 ^ var7);
      } while (++var8 < var4.length);

      return new String(var4).intern();
   }

   @Override
   public void abbaaba(class_1297 var1, byte var2) {
   }

   public boolean bba(class_310 param1) {
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
      // 12: ifne 29
      // 15: getfield net/minecraft/class_310.field_1690 Lnet/minecraft/class_315;
      // 18: ifnonnull 22
      // 1b: goto 1f
      // 1e: athrow
      // 1f: bipush 0
      // 20: ireturn
      // 21: athrow
      // 22: aload 0
      // 23: getfield qeaa361f143ee4a0894bd168fd9b30c66/qf4ccf8f5435d4a78bdca4d6a018b578e/baabb.abba Lqeaa361f143ee4a0894bd168fd9b30c66/qf4ccf8f5435d4a78bdca4d6a018b578e/baabaab;
      // 26: invokevirtual qeaa361f143ee4a0894bd168fd9b30c66/qf4ccf8f5435d4a78bdca4d6a018b578e/baabaab.abbb ()Ljava/lang/Object;
      // 29: checkcast qeaa361f143ee4a0894bd168fd9b30c66/qf4ccf8f5435d4a78bdca4d6a018b578e/abaaaabab
      // 2c: invokevirtual qeaa361f143ee4a0894bd168fd9b30c66/qf4ccf8f5435d4a78bdca4d6a018b578e/abaaaabab.ordinal ()I
      // 2f: tableswitch 25 0 2 36 40 113
      // 48: new java/lang/MatchException
      // 4b: dup
      // 4c: aconst_null
      // 4d: aconst_null
      // 4e: invokespecial java/lang/MatchException.<init> (Ljava/lang/String;Ljava/lang/Throwable;)V
      // 51: athrow
      // 52: athrow
      // 53: bipush 1
      // 54: goto e6
      // 57: aload 1
      // 58: iload 2
      // 59: ifne 83
      // 5c: getfield net/minecraft/class_310.field_1690 Lnet/minecraft/class_315;
      // 5f: getfield net/minecraft/class_315.field_1886 Lnet/minecraft/class_304;
      // 62: ifnull 82
      // 65: goto 69
      // 68: athrow
      // 69: aload 1
      // 6a: getfield net/minecraft/class_310.field_1690 Lnet/minecraft/class_315;
      // 6d: getfield net/minecraft/class_315.field_1886 Lnet/minecraft/class_304;
      // 70: invokevirtual net/minecraft/class_304.method_1434 ()Z
      // 73: iload 2
      // 74: ifne 99
      // 77: goto 7b
      // 7a: athrow
      // 7b: ifne 98
      // 7e: goto 82
      // 81: athrow
      // 82: aload 1
      // 83: aload 1
      // 84: getfield net/minecraft/class_310.field_1690 Lnet/minecraft/class_315;
      // 87: getfield net/minecraft/class_315.field_1886 Lnet/minecraft/class_304;
      // 8a: invokestatic qeaa361f143ee4a0894bd168fd9b30c66/qf4ccf8f5435d4a78bdca4d6a018b578e/aabbabbbb.aaab (Lnet/minecraft/class_310;Lnet/minecraft/class_304;)Z
      // 8d: iload 2
      // 8e: ifne 9d
      // 91: ifeq 9c
      // 94: goto 98
      // 97: athrow
      // 98: bipush 1
      // 99: goto e6
      // 9c: bipush 0
      // 9d: goto e6
      // a0: aload 1
      // a1: iload 2
      // a2: ifne cc
      // a5: getfield net/minecraft/class_310.field_1690 Lnet/minecraft/class_315;
      // a8: getfield net/minecraft/class_315.field_1904 Lnet/minecraft/class_304;
      // ab: ifnull cb
      // ae: goto b2
      // b1: athrow
      // b2: aload 1
      // b3: getfield net/minecraft/class_310.field_1690 Lnet/minecraft/class_315;
      // b6: getfield net/minecraft/class_315.field_1904 Lnet/minecraft/class_304;
      // b9: invokevirtual net/minecraft/class_304.method_1434 ()Z
      // bc: iload 2
      // bd: ifne e2
      // c0: goto c4
      // c3: athrow
      // c4: ifne e1
      // c7: goto cb
      // ca: athrow
      // cb: aload 1
      // cc: aload 1
      // cd: getfield net/minecraft/class_310.field_1690 Lnet/minecraft/class_315;
      // d0: getfield net/minecraft/class_315.field_1904 Lnet/minecraft/class_304;
      // d3: invokestatic qeaa361f143ee4a0894bd168fd9b30c66/qf4ccf8f5435d4a78bdca4d6a018b578e/aabbabbbb.aaab (Lnet/minecraft/class_310;Lnet/minecraft/class_304;)Z
      // d6: iload 2
      // d7: ifne e2
      // da: ifeq e5
      // dd: goto e1
      // e0: athrow
      // e1: bipush 1
      // e2: goto e6
      // e5: bipush 0
      // e6: ireturn
   }

   private void bbb(class_310 param1) {
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
      // 006: ifne 02b
      // 009: getfield qeaa361f143ee4a0894bd168fd9b30c66/qf4ccf8f5435d4a78bdca4d6a018b578e/baabb.ba I
      // 00c: iflt 026
      // 00f: goto 013
      // 012: athrow
      // 013: aload 0
      // 014: iload 2
      // 015: ifne 02b
      // 018: goto 01c
      // 01b: athrow
      // 01c: getfield qeaa361f143ee4a0894bd168fd9b30c66/qf4ccf8f5435d4a78bdca4d6a018b578e/baabb.aba Lnet/minecraft/class_3965;
      // 01f: ifnonnull 02f
      // 022: goto 026
      // 025: athrow
      // 026: aload 0
      // 027: goto 02b
      // 02a: athrow
      // 02b: invokevirtual qeaa361f143ee4a0894bd168fd9b30c66/qf4ccf8f5435d4a78bdca4d6a018b578e/baabb.abaa ()V
      // 02e: return
      // 02f: aload 1
      // 030: iload 2
      // 031: ifne 03c
      // 034: ifnull 05c
      // 037: goto 03b
      // 03a: athrow
      // 03b: aload 1
      // 03c: iload 2
      // 03d: ifne 04f
      // 040: getfield net/minecraft/class_310.field_1724 Lnet/minecraft/class_746;
      // 043: ifnull 05c
      // 046: goto 04a
      // 049: athrow
      // 04a: aload 1
      // 04b: goto 04f
      // 04e: athrow
      // 04f: getfield net/minecraft/class_310.field_1724 Lnet/minecraft/class_746;
      // 052: getfield net/minecraft/class_746.field_6012 I
      // 055: aload 0
      // 056: getfield qeaa361f143ee4a0894bd168fd9b30c66/qf4ccf8f5435d4a78bdca4d6a018b578e/baabb.bb I
      // 059: if_icmpge 05e
      // 05c: return
      // 05d: athrow
      // 05e: aload 0
      // 05f: getfield qeaa361f143ee4a0894bd168fd9b30c66/qf4ccf8f5435d4a78bdca4d6a018b578e/baabb.aba Lnet/minecraft/class_3965;
      // 062: astore 3
      // 063: iload 2
      // 064: aload 0
      // 065: getfield qeaa361f143ee4a0894bd168fd9b30c66/qf4ccf8f5435d4a78bdca4d6a018b578e/baabb.ba I
      // 068: istore 4
      // 06a: aload 1
      // 06b: getfield net/minecraft/class_310.field_1765 Lnet/minecraft/class_239;
      // 06e: astore 6
      // 070: ifne 0d5
      // 073: aload 6
      // 075: instanceof net/minecraft/class_3965
      // 078: ifeq 0cd
      // 07b: goto 07f
      // 07e: athrow
      // 07f: aload 6
      // 081: checkcast net/minecraft/class_3965
      // 084: astore 5
      // 086: iload 2
      // 087: ifne 0d5
      // 08a: aload 5
      // 08c: invokevirtual net/minecraft/class_3965.method_17783 ()Lnet/minecraft/class_239$class_240;
      // 08f: getstatic net/minecraft/class_239$class_240.field_1332 Lnet/minecraft/class_239$class_240;
      // 092: if_acmpne 0cd
      // 095: goto 099
      // 098: athrow
      // 099: aload 3
      // 09a: invokevirtual net/minecraft/class_3965.method_17777 ()Lnet/minecraft/class_2338;
      // 09d: aload 5
      // 09f: invokevirtual net/minecraft/class_3965.method_17777 ()Lnet/minecraft/class_2338;
      // 0a2: invokevirtual net/minecraft/class_2338.equals (Ljava/lang/Object;)Z
      // 0a5: iload 2
      // 0a6: ifne 0c2
      // 0a9: goto 0ad
      // 0ac: athrow
      // 0ad: ifeq 0cd
      // 0b0: goto 0b4
      // 0b3: athrow
      // 0b4: aload 0
      // 0b5: aload 1
      // 0b6: aload 5
      // 0b8: invokevirtual net/minecraft/class_3965.method_17777 ()Lnet/minecraft/class_2338;
      // 0bb: invokevirtual qeaa361f143ee4a0894bd168fd9b30c66/qf4ccf8f5435d4a78bdca4d6a018b578e/baabb.aaaa (Lnet/minecraft/class_310;Lnet/minecraft/class_2338;)Z
      // 0be: goto 0c2
      // 0c1: athrow
      // 0c2: iload 2
      // 0c3: ifne 0f0
      // 0c6: ifne 0d6
      // 0c9: goto 0cd
      // 0cc: athrow
      // 0cd: aload 0
      // 0ce: invokevirtual qeaa361f143ee4a0894bd168fd9b30c66/qf4ccf8f5435d4a78bdca4d6a018b578e/baabb.abaa ()V
      // 0d1: goto 0d5
      // 0d4: athrow
      // 0d5: return
      // 0d6: aload 1
      // 0d7: getfield net/minecraft/class_310.field_1724 Lnet/minecraft/class_746;
      // 0da: iload 2
      // 0db: ifne 10b
      // 0de: invokevirtual net/minecraft/class_746.method_31548 ()Lnet/minecraft/class_1661;
      // 0e1: iload 4
      // 0e3: invokevirtual net/minecraft/class_1661.method_5438 (I)Lnet/minecraft/class_1799;
      // 0e6: getstatic net/minecraft/class_1802.field_8301 Lnet/minecraft/class_1792;
      // 0e9: invokevirtual net/minecraft/class_1799.method_31574 (Lnet/minecraft/class_1792;)Z
      // 0ec: goto 0f0
      // 0ef: athrow
      // 0f0: ifne 107
      // 0f3: aload 0
      // 0f4: aload 1
      // 0f5: invokevirtual qeaa361f143ee4a0894bd168fd9b30c66/qf4ccf8f5435d4a78bdca4d6a018b578e/baabb.a (Lnet/minecraft/class_310;)V
      // 0f8: aload 0
      // 0f9: aload 1
      // 0fa: getfield net/minecraft/class_310.field_1724 Lnet/minecraft/class_746;
      // 0fd: getfield net/minecraft/class_746.field_6012 I
      // 100: bipush 1
      // 101: iadd
      // 102: putfield qeaa361f143ee4a0894bd168fd9b30c66/qf4ccf8f5435d4a78bdca4d6a018b578e/baabb.abab I
      // 105: return
      // 106: athrow
      // 107: aload 1
      // 108: getfield net/minecraft/class_310.field_1724 Lnet/minecraft/class_746;
      // 10b: invokevirtual net/minecraft/class_746.method_31548 ()Lnet/minecraft/class_1661;
      // 10e: invokestatic qeaa361f143ee4a0894bd168fd9b30c66/qf4ccf8f5435d4a78bdca4d6a018b578e/aabbabbbb.abaabaa (Lnet/minecraft/class_1661;)I
      // 111: istore 6
      // 113: iload 6
      // 115: iload 2
      // 116: ifne 137
      // 119: iload 4
      // 11b: if_icmpeq 131
      // 11e: goto 122
      // 121: athrow
      // 122: aload 1
      // 123: iload 4
      // 125: bipush 1
      // 126: invokestatic qeaa361f143ee4a0894bd168fd9b30c66/qf4ccf8f5435d4a78bdca4d6a018b578e/aabbabbbb.ababaaa (Lnet/minecraft/class_310;IZ)V
      // 129: aload 1
      // 12a: invokestatic qeaa361f143ee4a0894bd168fd9b30c66/qf4ccf8f5435d4a78bdca4d6a018b578e/aabbabbbb.aabaa (Lnet/minecraft/class_310;)V
      // 12d: goto 131
      // 130: athrow
      // 131: aload 1
      // 132: aload 5
      // 134: invokestatic qeaa361f143ee4a0894bd168fd9b30c66/qf4ccf8f5435d4a78bdca4d6a018b578e/aabbabbbb.bbababa (Lnet/minecraft/class_310;Lnet/minecraft/class_3965;)Z
      // 137: istore 7
      // 139: iload 2
      // 13a: ifne 17f
      // 13d: iload 7
      // 13f: ifeq 16e
      // 142: goto 146
      // 145: athrow
      // 146: aload 0
      // 147: aload 5
      // 149: invokevirtual net/minecraft/class_3965.method_17777 ()Lnet/minecraft/class_2338;
      // 14c: invokevirtual net/minecraft/class_2338.method_10084 ()Lnet/minecraft/class_2338;
      // 14f: invokestatic net/minecraft/class_243.method_24953 (Lnet/minecraft/class_2382;)Lnet/minecraft/class_243;
      // 152: invokevirtual qeaa361f143ee4a0894bd168fd9b30c66/qf4ccf8f5435d4a78bdca4d6a018b578e/baabb.aaa (Lnet/minecraft/class_243;)V
      // 155: iload 2
      // 156: aload 0
      // 157: aload 0
      // 158: aload 1
      // 159: aload 0
      // 15a: getfield qeaa361f143ee4a0894bd168fd9b30c66/qf4ccf8f5435d4a78bdca4d6a018b578e/baabb.aab Lqeaa361f143ee4a0894bd168fd9b30c66/qf4ccf8f5435d4a78bdca4d6a018b578e/aaabbbab;
      // 15d: invokevirtual qeaa361f143ee4a0894bd168fd9b30c66/qf4ccf8f5435d4a78bdca4d6a018b578e/baabb.bbab (Lnet/minecraft/class_310;Lqeaa361f143ee4a0894bd168fd9b30c66/qf4ccf8f5435d4a78bdca4d6a018b578e/aaabbbab;)I
      // 160: putfield qeaa361f143ee4a0894bd168fd9b30c66/qf4ccf8f5435d4a78bdca4d6a018b578e/baabb.abab I
      // 163: aload 0
      // 164: invokevirtual qeaa361f143ee4a0894bd168fd9b30c66/qf4ccf8f5435d4a78bdca4d6a018b578e/baabb.abaa ()V
      // 167: ifeq 183
      // 16a: goto 16e
      // 16d: athrow
      // 16e: aload 0
      // 16f: aload 1
      // 170: getfield net/minecraft/class_310.field_1724 Lnet/minecraft/class_746;
      // 173: getfield net/minecraft/class_746.field_6012 I
      // 176: bipush 1
      // 177: iadd
      // 178: putfield qeaa361f143ee4a0894bd168fd9b30c66/qf4ccf8f5435d4a78bdca4d6a018b578e/baabb.abab I
      // 17b: goto 17f
      // 17e: athrow
      // 17f: aload 0
      // 180: invokevirtual qeaa361f143ee4a0894bd168fd9b30c66/qf4ccf8f5435d4a78bdca4d6a018b578e/baabb.abaa ()V
      // 183: return
   }

   private boolean aaaa(class_310 param1, class_2338 param2) {
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
      // 2e: getstatic net/minecraft/class_2246.field_10540 Lnet/minecraft/class_2248;
      // 31: invokevirtual net/minecraft/class_2680.method_27852 (Lnet/minecraft/class_2248;)Z
      // 34: iload 3
      // 35: ifne 62
      // 38: ifne 59
      // 3b: goto 3f
      // 3e: athrow
      // 3f: aload 4
      // 41: getstatic net/minecraft/class_2246.field_9987 Lnet/minecraft/class_2248;
      // 44: invokevirtual net/minecraft/class_2680.method_27852 (Lnet/minecraft/class_2248;)Z
      // 47: iload 3
      // 48: ifne 62
      // 4b: goto 4f
      // 4e: athrow
      // 4f: ifne 59
      // 52: goto 56
      // 55: athrow
      // 56: bipush 0
      // 57: ireturn
      // 58: athrow
      // 59: aload 0
      // 5a: aload 1
      // 5b: aload 2
      // 5c: invokevirtual net/minecraft/class_2338.method_10084 ()Lnet/minecraft/class_2338;
      // 5f: invokevirtual qeaa361f143ee4a0894bd168fd9b30c66/qf4ccf8f5435d4a78bdca4d6a018b578e/baabb.babb (Lnet/minecraft/class_310;Lnet/minecraft/class_2338;)Z
      // 62: iload 3
      // 63: ifne 6e
      // 66: ifne 6f
      // 69: goto 6d
      // 6c: athrow
      // 6d: bipush 0
      // 6e: ireturn
      // 6f: aload 2
      // 70: invokevirtual net/minecraft/class_2338.method_10084 ()Lnet/minecraft/class_2338;
      // 73: invokestatic net/minecraft/class_243.method_24953 (Lnet/minecraft/class_2382;)Lnet/minecraft/class_243;
      // 76: astore 5
      // 78: aload 0
      // 79: getfield qeaa361f143ee4a0894bd168fd9b30c66/qf4ccf8f5435d4a78bdca4d6a018b578e/baabb.aaa Lqeaa361f143ee4a0894bd168fd9b30c66/qf4ccf8f5435d4a78bdca4d6a018b578e/abbaaaaa;
      // 7c: invokevirtual qeaa361f143ee4a0894bd168fd9b30c66/qf4ccf8f5435d4a78bdca4d6a018b578e/baaabbaa.abbb ()Ljava/lang/Object;
      // 7f: checkcast java/lang/Boolean
      // 82: invokevirtual java/lang/Boolean.booleanValue ()Z
      // 85: iload 3
      // 86: ifne ee
      // 89: ifeq ed
      // 8c: goto 90
      // 8f: athrow
      // 90: aload 1
      // 91: iload 3
      // 92: ifne a8
      // 95: goto 99
      // 98: athrow
      // 99: getfield net/minecraft/class_310.field_1724 Lnet/minecraft/class_746;
      // 9c: ifnull ed
      // 9f: goto a3
      // a2: athrow
      // a3: aload 1
      // a4: goto a8
      // a7: athrow
      // a8: getfield net/minecraft/class_310.field_1724 Lnet/minecraft/class_746;
      // ab: aload 5
      // ad: ldc 6.0
      // af: invokestatic qeaa361f143ee4a0894bd168fd9b30c66/qf4ccf8f5435d4a78bdca4d6a018b578e/aaabaaaa.aaab (Lnet/minecraft/class_1309;Lnet/minecraft/class_243;F)F
      // b2: fstore 6
      // b4: aload 1
      // b5: getfield net/minecraft/class_310.field_1724 Lnet/minecraft/class_746;
      // b8: invokevirtual net/minecraft/class_746.method_6032 ()F
      // bb: aload 1
      // bc: getfield net/minecraft/class_310.field_1724 Lnet/minecraft/class_746;
      // bf: invokevirtual net/minecraft/class_746.method_6067 ()F
      // c2: fadd
      // c3: fstore 7
      // c5: fload 7
      // c7: ldc_w 4.0
      // ca: fcmpg
      // cb: iload 3
      // cc: ifne ee
      // cf: ifge ed
      // d2: goto d6
      // d5: athrow
      // d6: fload 6
      // d8: fload 7
      // da: fcmpl
      // db: iload 3
      // dc: ifne ee
      // df: goto e3
      // e2: athrow
      // e3: iflt ed
      // e6: goto ea
      // e9: athrow
      // ea: bipush 0
      // eb: ireturn
      // ec: athrow
      // ed: bipush 1
      // ee: ireturn
   }

   private int aaab(aaabbbab param1) {
      // $VF: Couldn't be decompiled
      // Please report this to the Vineflower issue tracker, at https://github.com/Vineflower/vineflower/issues with a copy of the class file (if you have the rights to distribute it!)
      // java.lang.RuntimeException: parsing failure!
      //   at org.jetbrains.java.decompiler.modules.decompiler.decompose.DomHelper.parseGraph(DomHelper.java:211)
      //   at org.jetbrains.java.decompiler.main.rels.MethodProcessor.codeToJava(MethodProcessor.java:166)
      //
      // Bytecode:
      // 00: aload 1
      // 01: invokevirtual qeaa361f143ee4a0894bd168fd9b30c66/qf4ccf8f5435d4a78bdca4d6a018b578e/aaabbbab.bab ()D
      // 04: dstore 3
      // 05: getstatic qeaa361f143ee4a0894bd168fd9b30c66/qf4ccf8f5435d4a78bdca4d6a018b578e/baaabbaa.bba I
      // 08: aload 1
      // 09: invokevirtual qeaa361f143ee4a0894bd168fd9b30c66/qf4ccf8f5435d4a78bdca4d6a018b578e/aaabbbab.abb ()D
      // 0c: dstore 5
      // 0e: istore 2
      // 0f: dload 3
      // 10: dload 5
      // 12: dcmpl
      // 13: iload 2
      // 14: ifne 2c
      // 17: ifne 2b
      // 1a: goto 1e
      // 1d: athrow
      // 1e: bipush 1
      // 1f: dload 3
      // 20: invokestatic java/lang/Math.round (D)J
      // 23: l2i
      // 24: invokestatic java/lang/Math.max (II)I
      // 27: goto 3c
      // 2a: athrow
      // 2b: bipush 1
      // 2c: invokestatic java/util/concurrent/ThreadLocalRandom.current ()Ljava/util/concurrent/ThreadLocalRandom;
      // 2f: dload 3
      // 30: dload 5
      // 32: invokevirtual java/util/concurrent/ThreadLocalRandom.nextDouble (DD)D
      // 35: invokestatic java/lang/Math.round (D)J
      // 38: l2i
      // 39: invokestatic java/lang/Math.max (II)I
      // 3c: ireturn
   }

   private static String aaba(char[] var0, long var1, int var3) {
      int var4 = abb(bbbb(-285258581, 1707041246 ^ -1695310912), 4881777830560524067L) ^ var3;

      for (int var5 = 0; var5 < var0.length; var5++) {
         int var7 = var4 ^ (int)var1 ^ ~var5;
         int var8 = var7 ^ var3 - var5 * var0.length;
         var4 = -var8 * var3 | var5;
         var0[var5] = (char)(var0[var5] ^ var4);
         int var6 = var5 & abb(bbbb(-285258582, 1707041246 ^ 1952970315), 1624589163442149436L);
         var3 = var3 << var6 | var3 >>> -var6;
         var1 ^= var6;
      }

      return new String(var0);
   }

   @Override
   public void abbbab(JsonObject var1) {
      super.abbbab(var1);
      this.bb(var1, aabbaaaba.abba(aaaa[abb(bbbb(-285258571, 825674604 ^ -1242960903), 4191084701294461535L)]), this.aab);
      this.bb(var1, aabbaaaba.abba(aaaa[abb(bbbb(-285258572, 825674604 ^ -602082532), 1066176535325147207L)]), this.baa);
   }

   private int aabb(class_1661 param1, class_1792 param2) {
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
      // 05: ifnull 10
      // 08: aload 2
      // 09: ifnonnull 13
      // 0c: goto 10
      // 0f: athrow
      // 10: bipush -1
      // 11: ireturn
      // 12: athrow
      // 13: bipush 0
      // 14: istore 4
      // 16: iload 4
      // 18: ldc_w -285258569
      // 1b: ldc_w 907067402
      // 1e: ldc_w 110469008
      // 21: ixor
      // 22: invokestatic qeaa361f143ee4a0894bd168fd9b30c66/qf4ccf8f5435d4a78bdca4d6a018b578e/baabb.bbbb (II)I
      // 25: ldc2_w 37893733860937169
      // 28: invokestatic qeaa361f143ee4a0894bd168fd9b30c66/qf4ccf8f5435d4a78bdca4d6a018b578e/baabb.abb (IJ)I
      // 2b: if_icmpge 55
      // 2e: aload 1
      // 2f: iload 4
      // 31: invokevirtual net/minecraft/class_1661.method_5438 (I)Lnet/minecraft/class_1799;
      // 34: aload 2
      // 35: invokevirtual net/minecraft/class_1799.method_31574 (Lnet/minecraft/class_1792;)Z
      // 38: iload 3
      // 39: ifne 56
      // 3c: iload 3
      // 3d: ifne 4d
      // 40: goto 44
      // 43: athrow
      // 44: ifeq 4e
      // 47: goto 4b
      // 4a: athrow
      // 4b: iload 4
      // 4d: ireturn
      // 4e: iinc 4 1
      // 51: iload 3
      // 52: ifeq 16
      // 55: bipush -1
      // 56: ireturn
   }

   private void abaa() {
      this.aba = null;
      this.ba = -1;
      this.bb = abb(bbbb(-285258570, -7788305 ^ 487352793), 2227830387028765966L);
   }

   private static double abab(double param0) {
      // $VF: Couldn't be decompiled
      // Please report this to the Vineflower issue tracker, at https://github.com/Vineflower/vineflower/issues with a copy of the class file (if you have the rights to distribute it!)
      // java.lang.RuntimeException: parsing failure!
      //   at org.jetbrains.java.decompiler.modules.decompiler.decompose.DomHelper.parseGraph(DomHelper.java:211)
      //   at org.jetbrains.java.decompiler.main.rels.MethodProcessor.codeToJava(MethodProcessor.java:166)
      //
      // Bytecode:
      // 00: getstatic qeaa361f143ee4a0894bd168fd9b30c66/qf4ccf8f5435d4a78bdca4d6a018b578e/baaabbaa.bba I
      // 03: istore 2
      // 04: dload 0
      // 05: iload 2
      // 06: ifne 34
      // 09: ldc2_w 4.0
      // 0c: dcmpl
      // 0d: ifle 29
      // 10: goto 14
      // 13: athrow
      // 14: dconst_1
      // 15: ldc2_w 4.0
      // 18: dload 0
      // 19: ldc2_w 50.0
      // 1c: ddiv
      // 1d: invokestatic java/lang/Math.round (D)J
      // 20: l2d
      // 21: invokestatic java/lang/Math.min (DD)D
      // 24: invokestatic java/lang/Math.max (DD)D
      // 27: dreturn
      // 28: athrow
      // 29: dconst_1
      // 2a: ldc2_w 4.0
      // 2d: dload 0
      // 2e: invokestatic java/lang/Math.min (DD)D
      // 31: invokestatic java/lang/Math.max (DD)D
      // 34: dreturn
   }

   private void abba(class_310 param1) {
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
      // 09: ifnull 32
      // 0c: goto 10
      // 0f: athrow
      // 10: aload 1
      // 11: iload 2
      // 12: ifne 24
      // 15: getfield net/minecraft/class_310.field_1724 Lnet/minecraft/class_746;
      // 18: ifnull 32
      // 1b: goto 1f
      // 1e: athrow
      // 1f: aload 1
      // 20: goto 24
      // 23: athrow
      // 24: iload 2
      // 25: ifne 35
      // 28: getfield net/minecraft/class_310.field_1687 Lnet/minecraft/class_638;
      // 2b: ifnonnull 34
      // 2e: goto 32
      // 31: athrow
      // 32: return
      // 33: athrow
      // 34: aload 1
      // 35: iload 2
      // 36: ifne 4d
      // 39: getfield net/minecraft/class_310.field_1724 Lnet/minecraft/class_746;
      // 3c: getfield net/minecraft/class_746.field_6012 I
      // 3f: aload 0
      // 40: getfield qeaa361f143ee4a0894bd168fd9b30c66/qf4ccf8f5435d4a78bdca4d6a018b578e/baabb.abab I
      // 43: if_icmpge 4c
      // 46: goto 4a
      // 49: athrow
      // 4a: return
      // 4b: athrow
      // 4c: aload 1
      // 4d: getfield net/minecraft/class_310.field_1765 Lnet/minecraft/class_239;
      // 50: astore 4
      // 52: aload 4
      // 54: iload 2
      // 55: ifne 68
      // 58: instanceof net/minecraft/class_3965
      // 5b: ifeq 76
      // 5e: goto 62
      // 61: athrow
      // 62: aload 4
      // 64: goto 68
      // 67: athrow
      // 68: checkcast net/minecraft/class_3965
      // 6b: astore 3
      // 6c: aload 3
      // 6d: invokevirtual net/minecraft/class_3965.method_17783 ()Lnet/minecraft/class_239$class_240;
      // 70: getstatic net/minecraft/class_239$class_240.field_1332 Lnet/minecraft/class_239$class_240;
      // 73: if_acmpeq 78
      // 76: return
      // 77: athrow
      // 78: aload 0
      // 79: aload 1
      // 7a: iload 2
      // 7b: ifne 90
      // 7e: aload 3
      // 7f: invokevirtual net/minecraft/class_3965.method_17777 ()Lnet/minecraft/class_2338;
      // 82: invokevirtual qeaa361f143ee4a0894bd168fd9b30c66/qf4ccf8f5435d4a78bdca4d6a018b578e/baabb.aaaa (Lnet/minecraft/class_310;Lnet/minecraft/class_2338;)Z
      // 85: ifne 8e
      // 88: goto 8c
      // 8b: athrow
      // 8c: return
      // 8d: athrow
      // 8e: aload 0
      // 8f: aload 1
      // 90: invokevirtual qeaa361f143ee4a0894bd168fd9b30c66/qf4ccf8f5435d4a78bdca4d6a018b578e/baabb.b (Lnet/minecraft/class_310;)I
      // 93: istore 4
      // 95: iload 2
      // 96: ifne bf
      // 99: iload 4
      // 9b: ifge a4
      // 9e: goto a2
      // a1: athrow
      // a2: return
      // a3: athrow
      // a4: aload 0
      // a5: aload 3
      // a6: putfield qeaa361f143ee4a0894bd168fd9b30c66/qf4ccf8f5435d4a78bdca4d6a018b578e/baabb.aba Lnet/minecraft/class_3965;
      // a9: aload 0
      // aa: iload 4
      // ac: putfield qeaa361f143ee4a0894bd168fd9b30c66/qf4ccf8f5435d4a78bdca4d6a018b578e/baabb.ba I
      // af: aload 0
      // b0: aload 1
      // b1: getfield net/minecraft/class_310.field_1724 Lnet/minecraft/class_746;
      // b4: getfield net/minecraft/class_746.field_6012 I
      // b7: putfield qeaa361f143ee4a0894bd168fd9b30c66/qf4ccf8f5435d4a78bdca4d6a018b578e/baabb.bb I
      // ba: aload 0
      // bb: aload 1
      // bc: invokevirtual qeaa361f143ee4a0894bd168fd9b30c66/qf4ccf8f5435d4a78bdca4d6a018b578e/baabb.bbb (Lnet/minecraft/class_310;)V
      // bf: return
   }

   private static String abbb(int var0, int var1) {
      int var9 = 1830035127;
      int var2 = (var0 ^ bbbb(-285258575, var9 ^ 1845831693)) & bbbb(-285258576, var9 ^ 648014534);
      if (babb[var2] == null) {
         char[] var3 = baab[var2].toCharArray();

         int var4 = switch (var3[0] & bbbb(-285258573, var9 ^ 733442227)) {
            case 0 -> bbbb(-285258574, var9 ^ -1097749521);
            case 1 -> bbbb(-285258563, var9 ^ -1950560119);
            case 2 -> bbbb(-285258564, var9 ^ 1086599596);
            case 3 -> bbbb(-285258561, var9 ^ -1018815331);
            case 4 -> bbbb(-285258562, var9 ^ -58688099);
            case 5 -> bbbb(-285258567, var9 ^ 493948889);
            case 6 -> bbbb(-285258568, var9 ^ -241228171);
            case 7 -> bbbb(-285258565, var9 ^ 1575301830);
            case 8 -> bbbb(-285258566, var9 ^ -2081532364);
            case 9 -> bbbb(-285258683, var9 ^ 1113299533);
            case 10 -> bbbb(-285258684, var9 ^ -553506080);
            case 11 -> bbbb(-285258681, var9 ^ 2127682550);
            case 12 -> bbbb(-285258682, var9 ^ -1602974750);
            case 13 -> bbbb(-285258687, var9 ^ -1445181351);
            case 14 -> bbbb(-285258688, var9 ^ -1542116348);
            case 15 -> bbbb(-285258685, var9 ^ 1150206339);
            case 16 -> bbbb(-285258686, var9 ^ -521890974);
            case 17 -> bbbb(-285258675, var9 ^ 376875881);
            case 18 -> bbbb(-285258676, var9 ^ 1794164642);
            case 19 -> bbbb(-285258673, var9 ^ -216771324);
            case 20 -> bbbb(-285258674, var9 ^ -2065049013);
            case 21 -> 3;
            case 22 -> bbbb(-285258679, var9 ^ 1615541215);
            case 23 -> bbbb(-285258680, var9 ^ -1127145395);
            case 24 -> bbbb(-285258677, var9 ^ -488556633);
            case 25 -> bbbb(-285258678, var9 ^ 459487418);
            case 26 -> bbbb(-285258667, var9 ^ 749291784);
            case 27 -> bbbb(-285258668, var9 ^ 499169168);
            case 28 -> bbbb(-285258665, var9 ^ 540060554);
            case 29 -> bbbb(-285258666, var9 ^ 91228852);
            case 30 -> bbbb(-285258671, var9 ^ -1389382584);
            case 31 -> bbbb(-285258672, var9 ^ -1034443442);
            case 32 -> bbbb(-285258669, var9 ^ 776505632);
            case 33 -> bbbb(-285258670, var9 ^ 1088234883);
            case 34 -> bbbb(-285258659, var9 ^ 660201813);
            case 35 -> bbbb(-285258660, var9 ^ 341829906);
            case 36 -> bbbb(-285258657, var9 ^ -69741292);
            case 37 -> bbbb(-285258658, var9 ^ -1779829023);
            case 38 -> 4;
            case 39 -> bbbb(-285258663, var9 ^ -1979424107);
            case 40 -> bbbb(-285258664, var9 ^ 356173318);
            case 41 -> bbbb(-285258661, var9 ^ 981750501);
            case 42 -> bbbb(-285258662, var9 ^ 1508352541);
            case 43 -> bbbb(-285258651, var9 ^ 908178298);
            case 44 -> bbbb(-285258652, var9 ^ 138496521);
            case 45 -> bbbb(-285258649, var9 ^ -1649690417);
            case 46 -> bbbb(-285258650, var9 ^ -98938879);
            case 47 -> bbbb(-285258655, var9 ^ 2049906932);
            case 48 -> bbbb(-285258656, var9 ^ -746571361);
            case 49 -> bbbb(-285258653, var9 ^ -94784154);
            case 50 -> bbbb(-285258654, var9 ^ 1976479800);
            case 51 -> bbbb(-285258643, var9 ^ 1973106828);
            case 52 -> bbbb(-285258644, var9 ^ -532096228);
            case 53 -> bbbb(-285258641, var9 ^ 400175797);
            case 54 -> bbbb(-285258642, var9 ^ 159893390);
            case 55 -> bbbb(-285258647, var9 ^ 1060675695);
            case 56 -> bbbb(-285258648, var9 ^ 1202336261);
            case 57 -> bbbb(-285258645, var9 ^ -2060171813);
            case 58 -> bbbb(-285258646, var9 ^ 1078038225);
            case 59 -> bbbb(-285258635, var9 ^ 6867661);
            case 60 -> bbbb(-285258636, var9 ^ -1432021826);
            case 61 -> bbbb(-285258633, var9 ^ 800210212);
            case 62 -> bbbb(-285258634, var9 ^ 592014250);
            case 63 -> bbbb(-285258639, var9 ^ 1236110927);
            case 64 -> bbbb(-285258640, var9 ^ -1120470203);
            case 65 -> bbbb(-285258637, var9 ^ -2049266894);
            case 66 -> bbbb(-285258638, var9 ^ -1380027783);
            case 67 -> bbbb(-285258627, var9 ^ 305631504);
            case 68 -> bbbb(-285258628, var9 ^ -598752487);
            case 69 -> bbbb(-285258625, var9 ^ 1139699658);
            case 70 -> bbbb(-285258626, var9 ^ -948990874);
            case 71 -> bbbb(-285258631, var9 ^ 543124426);
            case 72 -> 1;
            case 73 -> bbbb(-285258632, var9 ^ 497215017);
            case 74 -> bbbb(-285258629, var9 ^ -102478129);
            case 75 -> bbbb(-285258630, var9 ^ -1872031589);
            case 76 -> bbbb(-285258747, var9 ^ 267177718);
            case 77 -> bbbb(-285258748, var9 ^ -1911085317);
            case 78 -> bbbb(-285258745, var9 ^ -1110262155);
            case 79 -> bbbb(-285258746, var9 ^ -247449493);
            case 80 -> bbbb(-285258751, var9 ^ -612278651);
            case 81 -> bbbb(-285258752, var9 ^ -1913217197);
            case 82 -> bbbb(-285258749, var9 ^ 453798669);
            case 83 -> bbbb(-285258750, var9 ^ -858893045);
            case 84 -> bbbb(-285258739, var9 ^ 1044876282);
            case 85 -> bbbb(-285258740, var9 ^ 1650165893);
            case 86 -> bbbb(-285258737, var9 ^ -1027924261);
            case 87 -> bbbb(-285258738, var9 ^ 55645794);
            case 88 -> bbbb(-285258743, var9 ^ -549639911);
            case 89 -> bbbb(-285258744, var9 ^ -430863743);
            case 90 -> bbbb(-285258741, var9 ^ 1730302034);
            case 91 -> bbbb(-285258742, var9 ^ -1279503174);
            case 92 -> bbbb(-285258731, var9 ^ 2066015880);
            case 93 -> bbbb(-285258732, var9 ^ 433008855);
            case 94 -> bbbb(-285258729, var9 ^ 1799134023);
            case 95 -> bbbb(-285258730, var9 ^ -505279123);
            case 96 -> bbbb(-285258735, var9 ^ 428436104);
            case 97 -> bbbb(-285258736, var9 ^ 2030466253);
            case 98 -> bbbb(-285258733, var9 ^ -422684016);
            case 99 -> bbbb(-285258734, var9 ^ 1398089931);
            case 100 -> bbbb(-285258723, var9 ^ 1873166464);
            case 101 -> bbbb(-285258724, var9 ^ 1993815530);
            case 102 -> bbbb(-285258721, var9 ^ 2070679893);
            case 103 -> bbbb(-285258722, var9 ^ -20411337);
            case 104 -> bbbb(-285258727, var9 ^ 1069025007);
            case 105 -> bbbb(-285258728, var9 ^ 397759822);
            case 106 -> bbbb(-285258725, var9 ^ -2097913515);
            case 107 -> bbbb(-285258726, var9 ^ 1250626775);
            case 108 -> bbbb(-285258715, var9 ^ -912718142);
            case 109 -> 0;
            case 110 -> bbbb(-285258716, var9 ^ 1851720181);
            case 111 -> bbbb(-285258713, var9 ^ -629898797);
            case 112 -> 2;
            case 113 -> bbbb(-285258714, var9 ^ -1235826733);
            case 114 -> bbbb(-285258719, var9 ^ -651020431);
            case 115 -> bbbb(-285258720, var9 ^ 514673039);
            case 116 -> bbbb(-285258717, var9 ^ 1911873203);
            case 117 -> bbbb(-285258718, var9 ^ -1213089088);
            case 118 -> bbbb(-285258707, var9 ^ 1513160739);
            case 119 -> bbbb(-285258708, var9 ^ 1828060512);
            case 120 -> bbbb(-285258705, var9 ^ -64741953);
            case 121 -> bbbb(-285258706, var9 ^ -1243431743);
            case 122 -> bbbb(-285258711, var9 ^ 1096100155);
            case 123 -> bbbb(-285258712, var9 ^ 423338235);
            case 124 -> bbbb(-285258709, var9 ^ -1232846437);
            case 125 -> bbbb(-285258710, var9 ^ -688002443);
            case 126 -> bbbb(-285258699, var9 ^ 431131284);
            case 127 -> bbbb(-285258700, var9 ^ 328019302);
            case 128 -> bbbb(-285258697, var9 ^ -1750731122);
            case 129 -> bbbb(-285258698, var9 ^ -1080872169);
            case 130 -> bbbb(-285258703, var9 ^ -692538216);
            case 131 -> bbbb(-285258704, var9 ^ 1807405310);
            case 132 -> bbbb(-285258701, var9 ^ 642052120);
            case 133 -> bbbb(-285258702, var9 ^ -1381643354);
            case 134 -> bbbb(-285258691, var9 ^ -236954916);
            case 135 -> bbbb(-285258692, var9 ^ 636390618);
            case 136 -> bbbb(-285258689, var9 ^ 1157719640);
            case 137 -> bbbb(-285258690, var9 ^ 1510514751);
            case 138 -> bbbb(-285258695, var9 ^ -1400358509);
            case 139 -> bbbb(-285258696, var9 ^ -519245871);
            case 140 -> bbbb(-285258693, var9 ^ 1821742543);
            case 141 -> bbbb(-285258694, var9 ^ -1743354321);
            case 142 -> bbbb(-285258299, var9 ^ 768642422);
            case 143 -> bbbb(-285258300, var9 ^ -1833956755);
            case 144 -> bbbb(-285258297, var9 ^ 583519618);
            case 145 -> bbbb(-285258298, var9 ^ -1542601389);
            case 146 -> bbbb(-285258303, var9 ^ 1224074026);
            case 147 -> bbbb(-285258304, var9 ^ 1602606317);
            case 148 -> bbbb(-285258301, var9 ^ 1137667400);
            case 149 -> bbbb(-285258302, var9 ^ 905551363);
            case 150 -> bbbb(-285258291, var9 ^ 1129346732);
            case 151 -> bbbb(-285258292, var9 ^ -2004764701);
            case 152 -> bbbb(-285258289, var9 ^ 324112797);
            case 153 -> bbbb(-285258290, var9 ^ -1474815130);
            case 154 -> bbbb(-285258295, var9 ^ -808249800);
            case 155 -> bbbb(-285258296, var9 ^ -617556628);
            case 156 -> bbbb(-285258293, var9 ^ -1615963894);
            case 157 -> bbbb(-285258294, var9 ^ 478906688);
            case 158 -> bbbb(-285258283, var9 ^ -1048055005);
            case 159 -> bbbb(-285258284, var9 ^ -625505700);
            case 160 -> bbbb(-285258281, var9 ^ -519311388);
            case 161 -> bbbb(-285258282, var9 ^ 1796216674);
            case 162 -> bbbb(-285258287, var9 ^ -2020336445);
            case 163 -> bbbb(-285258288, var9 ^ -1525548730);
            case 164 -> bbbb(-285258285, var9 ^ 1958846668);
            case 165 -> bbbb(-285258286, var9 ^ 556595331);
            case 166 -> bbbb(-285258275, var9 ^ -715037897);
            case 167 -> bbbb(-285258276, var9 ^ 157558739);
            case 168 -> bbbb(-285258273, var9 ^ -570912329);
            case 169 -> bbbb(-285258274, var9 ^ -1403391848);
            case 170 -> bbbb(-285258279, var9 ^ 144192835);
            case 171 -> bbbb(-285258280, var9 ^ 431307695);
            case 172 -> bbbb(-285258277, var9 ^ 805385092);
            case 173 -> bbbb(-285258278, var9 ^ -1443189816);
            case 174 -> bbbb(-285258267, var9 ^ -1277312076);
            case 175 -> bbbb(-285258268, var9 ^ 882325892);
            case 176 -> bbbb(-285258265, var9 ^ -909285591);
            case 177 -> bbbb(-285258266, var9 ^ -93128883);
            case 178 -> bbbb(-285258271, var9 ^ 1354353186);
            case 179 -> bbbb(-285258272, var9 ^ 1551412740);
            case 180 -> bbbb(-285258269, var9 ^ -1339364194);
            case 181 -> bbbb(-285258270, var9 ^ 1273919922);
            case 182 -> bbbb(-285258259, var9 ^ 1154533071);
            case 183 -> bbbb(-285258260, var9 ^ 727587060);
            case 184 -> bbbb(-285258257, var9 ^ -780579450);
            case 185 -> bbbb(-285258258, var9 ^ -604564139);
            case 186 -> bbbb(-285258263, var9 ^ 1767224420);
            case 187 -> bbbb(-285258264, var9 ^ 1455576147);
            case 188 -> bbbb(-285258261, var9 ^ -963876490);
            case 189 -> bbbb(-285258262, var9 ^ 1441002306);
            case 190 -> bbbb(-285258251, var9 ^ 1052053284);
            case 191 -> bbbb(-285258252, var9 ^ -116626520);
            case 192 -> bbbb(-285258249, var9 ^ 641838587);
            case 193 -> bbbb(-285258250, var9 ^ 1791395901);
            case 194 -> bbbb(-285258255, var9 ^ 1892116452);
            case 195 -> bbbb(-285258256, var9 ^ 1767349545);
            case 196 -> bbbb(-285258253, var9 ^ 511999268);
            case 197 -> bbbb(-285258254, var9 ^ 370671853);
            case 198 -> 5;
            case 199 -> bbbb(-285258243, var9 ^ -2117123401);
            case 200 -> bbbb(-285258244, var9 ^ -604352452);
            case 201 -> bbbb(-285258241, var9 ^ 64352489);
            case 202 -> bbbb(-285258242, var9 ^ 722788300);
            case 203 -> bbbb(-285258247, var9 ^ -1915515);
            case 204 -> bbbb(-285258248, var9 ^ 1614724493);
            case 205 -> bbbb(-285258245, var9 ^ 1984809638);
            case 206 -> bbbb(-285258246, var9 ^ 480086427);
            case 207 -> bbbb(-285258363, var9 ^ 92981824);
            case 208 -> bbbb(-285258364, var9 ^ -85330995);
            case 209 -> bbbb(-285258361, var9 ^ 1000695177);
            case 210 -> bbbb(-285258362, var9 ^ -1654768126);
            case 211 -> bbbb(-285258367, var9 ^ -676625236);
            case 212 -> bbbb(-285258368, var9 ^ 1187879459);
            case 213 -> bbbb(-285258365, var9 ^ 711042293);
            case 214 -> bbbb(-285258366, var9 ^ -1242032241);
            case 215 -> bbbb(-285258355, var9 ^ 1839643145);
            case 216 -> bbbb(-285258356, var9 ^ 20664344);
            case 217 -> bbbb(-285258353, var9 ^ -602852253);
            case 218 -> bbbb(-285258354, var9 ^ -130457165);
            case 219 -> bbbb(-285258359, var9 ^ -1411004576);
            case 220 -> bbbb(-285258360, var9 ^ 392121460);
            case 221 -> bbbb(-285258357, var9 ^ 1432346906);
            case 222 -> bbbb(-285258358, var9 ^ 110986967);
            case 223 -> bbbb(-285258347, var9 ^ -757501750);
            case 224 -> bbbb(-285258348, var9 ^ -384949110);
            case 225 -> bbbb(-285258345, var9 ^ 1041369439);
            case 226 -> bbbb(-285258346, var9 ^ 675842262);
            case 227 -> bbbb(-285258351, var9 ^ -993185236);
            case 228 -> bbbb(-285258352, var9 ^ -210823339);
            case 229 -> bbbb(-285258349, var9 ^ 724647411);
            case 230 -> bbbb(-285258350, var9 ^ -253999324);
            case 231 -> bbbb(-285258339, var9 ^ -363075132);
            case 232 -> bbbb(-285258340, var9 ^ 629238997);
            case 233 -> bbbb(-285258337, var9 ^ -1699891300);
            case 234 -> bbbb(-285258338, var9 ^ -809899590);
            case 235 -> bbbb(-285258343, var9 ^ -338005684);
            case 236 -> bbbb(-285258344, var9 ^ -1980547259);
            case 237 -> bbbb(-285258341, var9 ^ -1456760946);
            case 238 -> bbbb(-285258342, var9 ^ 1554730456);
            case 239 -> bbbb(-285258331, var9 ^ 812245931);
            case 240 -> bbbb(-285258332, var9 ^ -1619432065);
            case 241 -> bbbb(-285258329, var9 ^ 1627553588);
            case 242 -> bbbb(-285258330, var9 ^ 1989863185);
            case 243 -> bbbb(-285258335, var9 ^ 1634045999);
            case 244 -> bbbb(-285258336, var9 ^ 615540366);
            case 245 -> bbbb(-285258333, var9 ^ 980810196);
            case 246 -> bbbb(-285258334, var9 ^ -1411497951);
            case 247 -> bbbb(-285258323, var9 ^ 2113863239);
            case 248 -> bbbb(-285258324, var9 ^ -1210055809);
            case 249 -> bbbb(-285258321, var9 ^ 518157786);
            case 250 -> bbbb(-285258322, var9 ^ 823602574);
            case 251 -> bbbb(-285258327, var9 ^ 1789665064);
            case 252 -> bbbb(-285258328, var9 ^ 110634012);
            case 253 -> bbbb(-285258325, var9 ^ -1816205096);
            case 254 -> bbbb(-285258326, var9 ^ -2118242452);
            default -> bbbb(-285258315, var9 ^ -1587689270);
         };
         int var5 = (var1 & bbbb(-285258316, var9 ^ 500440708)) - var4;
         if (var5 < 0) {
            var5 += 256;
         }

         int var6 = ((var1 & bbbb(-285258313, var9 ^ 1934885690)) >>> bbbb(-285258314, var9 ^ -939758059)) - var4;
         if (var6 < 0) {
            var6 += 256;
         }

         for (int var7 = 0; var7 < var3.length; var7++) {
            int var8 = var7 % 2;
            char var10002 = var3[var7];
            if (var8 == 0) {
               var3[var7] = (char)(var10002 ^ var5);
               var5 = ((var5 >>> 3 | var5 << 5) ^ var3[var7]) & bbbb(-285258319, var9 ^ 697978587);
            } else {
               var3[var7] = (char)(var10002 ^ var6);
               var6 = ((var6 >>> 3 | var6 << 5) ^ var3[var7]) & bbbb(-285258320, var9 ^ -1609790730);
            }
         }

         babb[var2] = new String(var3).intern();
      }

      return babb[var2];
   }

   private void baaa(class_310 param1) {
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
      // 011: iload 2
      // 012: ifne 022
      // 015: getfield net/minecraft/class_310.field_1724 Lnet/minecraft/class_746;
      // 018: ifnonnull 021
      // 01b: goto 01f
      // 01e: athrow
      // 01f: return
      // 020: athrow
      // 021: aload 1
      // 022: getfield net/minecraft/class_310.field_1724 Lnet/minecraft/class_746;
      // 025: getfield net/minecraft/class_746.field_6012 I
      // 028: aload 0
      // 029: getfield qeaa361f143ee4a0894bd168fd9b30c66/qf4ccf8f5435d4a78bdca4d6a018b578e/baabb.aa I
      // 02c: if_icmpge 031
      // 02f: return
      // 030: athrow
      // 031: aconst_null
      // 032: astore 3
      // 033: aload 1
      // 034: getfield net/minecraft/class_310.field_1765 Lnet/minecraft/class_239;
      // 037: astore 7
      // 039: aload 7
      // 03b: iload 2
      // 03c: ifne 04f
      // 03f: instanceof net/minecraft/class_3966
      // 042: ifeq 094
      // 045: goto 049
      // 048: athrow
      // 049: aload 7
      // 04b: goto 04f
      // 04e: athrow
      // 04f: checkcast net/minecraft/class_3966
      // 052: astore 4
      // 054: iload 2
      // 055: aload 4
      // 057: invokevirtual net/minecraft/class_3966.method_17782 ()Lnet/minecraft/class_1297;
      // 05a: astore 7
      // 05c: ifne 09a
      // 05f: aload 7
      // 061: instanceof net/minecraft/class_1511
      // 064: ifeq 094
      // 067: goto 06b
      // 06a: athrow
      // 06b: aload 7
      // 06d: checkcast net/minecraft/class_1511
      // 070: astore 5
      // 072: aload 5
      // 074: iload 2
      // 075: ifne 088
      // 078: invokevirtual net/minecraft/class_1511.method_31481 ()Z
      // 07b: ifne 0db
      // 07e: goto 082
      // 081: athrow
      // 082: aload 5
      // 084: goto 088
      // 087: athrow
      // 088: invokevirtual net/minecraft/class_1511.method_5805 ()Z
      // 08b: ifeq 0db
      // 08e: aload 4
      // 090: astore 3
      // 091: goto 0db
      // 094: aload 1
      // 095: getfield net/minecraft/class_310.field_1692 Lnet/minecraft/class_1297;
      // 098: astore 7
      // 09a: aload 7
      // 09c: iload 2
      // 09d: ifne 0b0
      // 0a0: instanceof net/minecraft/class_1511
      // 0a3: ifeq 0db
      // 0a6: goto 0aa
      // 0a9: athrow
      // 0aa: aload 7
      // 0ac: goto 0b0
      // 0af: athrow
      // 0b0: checkcast net/minecraft/class_1511
      // 0b3: astore 6
      // 0b5: aload 6
      // 0b7: iload 2
      // 0b8: ifne 0cb
      // 0bb: invokevirtual net/minecraft/class_1511.method_31481 ()Z
      // 0be: ifne 0db
      // 0c1: goto 0c5
      // 0c4: athrow
      // 0c5: aload 6
      // 0c7: goto 0cb
      // 0ca: athrow
      // 0cb: invokevirtual net/minecraft/class_1511.method_5805 ()Z
      // 0ce: ifeq 0db
      // 0d1: new net/minecraft/class_3966
      // 0d4: dup
      // 0d5: aload 6
      // 0d7: invokespecial net/minecraft/class_3966.<init> (Lnet/minecraft/class_1297;)V
      // 0da: astore 3
      // 0db: aload 3
      // 0dc: ifnonnull 0e1
      // 0df: return
      // 0e0: athrow
      // 0e1: aload 0
      // 0e2: iload 2
      // 0e3: ifne 10c
      // 0e6: aload 1
      // 0e7: aload 3
      // 0e8: invokespecial qeaa361f143ee4a0894bd168fd9b30c66/qf4ccf8f5435d4a78bdca4d6a018b578e/baabb.ba (Lnet/minecraft/class_310;Lnet/minecraft/class_3966;)Z
      // 0eb: ifeq 107
      // 0ee: goto 0f2
      // 0f1: athrow
      // 0f2: aload 0
      // 0f3: aload 0
      // 0f4: aload 1
      // 0f5: aload 0
      // 0f6: getfield qeaa361f143ee4a0894bd168fd9b30c66/qf4ccf8f5435d4a78bdca4d6a018b578e/baabb.baa Lqeaa361f143ee4a0894bd168fd9b30c66/qf4ccf8f5435d4a78bdca4d6a018b578e/aaabbbab;
      // 0f9: invokevirtual qeaa361f143ee4a0894bd168fd9b30c66/qf4ccf8f5435d4a78bdca4d6a018b578e/baabb.bbab (Lnet/minecraft/class_310;Lqeaa361f143ee4a0894bd168fd9b30c66/qf4ccf8f5435d4a78bdca4d6a018b578e/aaabbbab;)I
      // 0fc: putfield qeaa361f143ee4a0894bd168fd9b30c66/qf4ccf8f5435d4a78bdca4d6a018b578e/baabb.aa I
      // 0ff: iload 2
      // 100: ifeq 118
      // 103: goto 107
      // 106: athrow
      // 107: aload 0
      // 108: goto 10c
      // 10b: athrow
      // 10c: aload 1
      // 10d: getfield net/minecraft/class_310.field_1724 Lnet/minecraft/class_746;
      // 110: getfield net/minecraft/class_746.field_6012 I
      // 113: bipush 1
      // 114: iadd
      // 115: putfield qeaa361f143ee4a0894bd168fd9b30c66/qf4ccf8f5435d4a78bdca4d6a018b578e/baabb.aa I
      // 118: return
   }

   private boolean baab(class_310 param1) {
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
      // 09: ifnull 85
      // 0c: goto 10
      // 0f: athrow
      // 10: aload 1
      // 11: iload 2
      // 12: ifne 24
      // 15: getfield net/minecraft/class_310.field_1724 Lnet/minecraft/class_746;
      // 18: ifnull 85
      // 1b: goto 1f
      // 1e: athrow
      // 1f: aload 1
      // 20: goto 24
      // 23: athrow
      // 24: iload 2
      // 25: ifne 37
      // 28: getfield net/minecraft/class_310.field_1687 Lnet/minecraft/class_638;
      // 2b: ifnull 85
      // 2e: goto 32
      // 31: athrow
      // 32: aload 1
      // 33: goto 37
      // 36: athrow
      // 37: iload 2
      // 38: ifne 4a
      // 3b: getfield net/minecraft/class_310.field_1761 Lnet/minecraft/class_636;
      // 3e: ifnull 85
      // 41: goto 45
      // 44: athrow
      // 45: aload 1
      // 46: goto 4a
      // 49: athrow
      // 4a: iload 2
      // 4b: ifne 5d
      // 4e: getfield net/minecraft/class_310.field_1690 Lnet/minecraft/class_315;
      // 51: ifnull 85
      // 54: goto 58
      // 57: athrow
      // 58: aload 1
      // 59: goto 5d
      // 5c: athrow
      // 5d: iload 2
      // 5e: ifne 70
      // 61: getfield net/minecraft/class_310.field_1755 Lnet/minecraft/class_437;
      // 64: ifnonnull 85
      // 67: goto 6b
      // 6a: athrow
      // 6b: aload 1
      // 6c: goto 70
      // 6f: athrow
      // 70: getfield net/minecraft/class_310.field_1724 Lnet/minecraft/class_746;
      // 73: invokevirtual net/minecraft/class_746.method_5805 ()Z
      // 76: iload 2
      // 77: ifne 82
      // 7a: ifeq 85
      // 7d: goto 81
      // 80: athrow
      // 81: bipush 1
      // 82: goto 86
      // 85: bipush 0
      // 86: ireturn
   }

   private static long baba(int var0, long var1) {
      int var3 = (var0 ^ (int)var1 ^ bbbb(-285258317, 1238574134 ^ -1787491943)) & bbbb(-285258318, 1238574134 ^ 555716223);
      if (abaa[var3] == null) {
         abaa[var3] = abbb[var3] ^ var1;
      }

      return abaa[var3];
   }

   // $VF: Irreducible bytecode was duplicated to produce valid code
   static {
      int var34 = 1009045084;
      char[] var25 = "ړٽړرثر٫رثر".toCharArray();
      byte var30 = -1;
      String var24 = "~挽먹꓅ᙩࠧᜂ䋐䉡靎붏牟敏糸赖螐輁\ud9cb愎\uead7\ue42dᚃᚸᘵᛅᘉᚗᛆᘗ\u16faᚢᚉᚨᛨ媨痉斈\ued20洮ⶽ✫䟮鏨ꤍ䏧琨哳ꡐ︧놆匐䫏ꢰ࿀ᚙ촟၈䦖\ue889᷎䲶쳷恭嗆哀徒⭯㰂ꣿ\ueebe䊒ᘖ墱䟩ꫀ㜂䭃\ud9ffꐶ緻\ude49₫軐쭾괯別넍뢢ᚫ摺ಛ\uf8e8ʹ\u1ad6䝏窎홊컯ዪ⃐充ᛯ틐됦畋嵹\ua7e0ዐ儡饽ⷥ铀顮䉱졢横ਃ푤᛫봩た㵹붃ߘꣲ呸繎䯸뉞ઁ\u0ee1쵮ᚒá↼豈轁훸纠鞝뇖铝ꁰ\ue649ቦ䅸裎ᚶ㾢\uf629鬻袭Ṅ\ueede\uf251⿑㡉毮ᐩ䍠㌧竲\uf166㷺䃺\uee21塷㬏薥\ue179ᔇ\uf4e7δ\ued0dጼ\ud936蓙\u0bfbीꖙꨛ펫ᣇ剴恹搕覐漢梋搒\ue7ca\uea07﹩誧諴휐쾟냫崑瀀ഔ勽砼儌쐕\u2cf6驊듊褠絟벛䍅垳렘䲯\uf22b萵髭ဵᗆ檚檽橽檸櫭橬櫇橥模樠檐橇樄樞櫠檝樴櫜\ue785\ue756\ue71b\ue73b\ue706\ue75b\ue7e6\ue7cf\ue743\ue716\ue719\ue708\ue7c0\ue78e\ue792\ue71e\ue717\ue775\ue732\ue771\ue787\ue797\ue7fc\ue7d5\ue755\ue7f0\ue792\ue789\ue73a\ue78c\ue709\ue76b\ue7d3\ue75a\ue7e8\ue7c5\ue784\ue7f4\ue728\ue7fd\ue78b\ue71d\ue775\ue7f4\ue75d\ue783\ue703\ue7c9\ue7e6\ue70e\ue75c\ue744\ue78f\ue794\ue78b\ue76b\ue704\ue760\ue767\ue7b9\ue70e\ue720\ue717\ue70a\ue74e\ue7f7\ue7f0\ue799\ue7d6\ue7d3\ue7bc\ue7f0\ue71c\ue7a6\ue7f3\ue7d5\ue735\ue7c2\ue747\ue76c\ue71c\ue7b7\ue702\ue7c9\ue780\ue752\ue775\ue7ed\ue700\ue771\ue784\ue7f8\ue795\ue720\ue71e\ue73c\ue752\ue74f\ue75f\ue77a\ue7a0\ue716\ue7bd\ue7b6\ue7fb\ue72d\ue7a4\ue7c4\ue7d0\ue734\ue7cc\ue718\ue782\ue790\ue7a3\ue705\ue7be\ue731\ue77b\ue747\ue754\ue765\ue7a4\ue7d5\ue704\ue794\ue7a5\ue7e8\ue703\ue713\ue791\ue771\ue7cd\ue7a2\ue77c\ue773\ue7cd\ue7e7\ue761\ue76a\ue726\ue783\ue7d9\ue7c0\ue7eb\ue7c6\ue76f\ue7bf\ue760\ue746\ue7e6\ue7e5\ue7f0\ue791\ue715\ue7a0\ue7a8\ue791\ue777\ue751\ue75f\ue7c8\ue75d\ue747\ue72b\ue7d5\ue708\ue766箔箱篈筶篴笲箓篥筪箝⪠⫘⫝̸⨜⩴⪼⩷⨖⨀⪽⫲⨧⩟⩬⩞⫱⊥⊀⋹≇⋅∃⊢⋔≛⊬̾͟Χ\u0381ψω̉Ρεͯϳͭϛ͏̺Ϫ΅̲̳͑α͜ϳ̭υΈβ͖̀\u0378ͦϋ͉̙ͨΡ̽϶͕Ϡͳ͠Ρ̳ϔθ̣̳ͣ͞γ\u0383γΩΣϏ̐ͮϪϕΈ̰\u0382ϒϳή̇ϴϴϿΓ̢̡Ϡϸθϑύ͔ά҇ҢӛѥӧСҀӶѹҎꈈꈝꈿꋍꈏꋲꊟꊭꊚꈔꊤꈺꊠꈟꈢꊆ㢞㢻㣂㡼㣾㠸㢙㣯㡠㢗";
      short var23 = 1595;
      String[] var26 = new String[var25.length];

      while (true) {
         int var27 = 0;
         int var28 = 0;
         int var29 = 0;
         if (var30 == 0) {
            bbba = var26;
            bbbb = new Object[var26.length];
            byte var40 = 0;
            int var10001 = 0;
            byte[] var10002 = "ø¢\u0012góÿ\u0017\u001e0Cã2tm\u009aÎ\u001eJ\u001fðé¾ä,¡ÝI.§}\" \u0096ÿ!µh\u001c?sÌÌô¨»\u00ad\u008cÝö\\äÄP½£ \u0095f\t\u0015M¯ûús+>\u000e|,{ùg\u009e\u0001\" G\u001e\u009e`\u0092ô5<\u008e[\\k©\u0080äå\u0095Ä×\u000f\u001eP]Bã¼@ñ·wW~4µ\u00ad^ên£~¸f\u0093\u0012È\u001b`\u0010 \u0089\u0000#ýA\u001c`±\u0099\u0017§«\n}\u0086³\u0010\u0080øAó\u009a£~i\u0018éÑJ¤\u0005ÌLæ\u007fÕ\u001d\u0094Ü\u001f\u009f#û#\u0094ný\bâ,Ü\u0012ç\u0099ñ\u0080ÿÏí\u0017¢\u0015þÆ<ê\bPÎ¼ÆÕ\u009e\u008f\u0007jã\u0093{c\u009d3Q¬ä¡Z¬öÔ\u0083c³ø¢K\u008f`\u0085~º\u0014\u0017IÚ¡\u0085sì\r\u001d=à\u0007Ø·{\u001dc\u0088ár\u0093\u0094TË!\u0082\u0018½å\u001c°Á2ÇF`M8\u00932\u001d;Ï_Ð\u0002@KBÇðÄøÄC\u001fahd\u0010z\u008efà\u0013\u0004v\u0092l\u0000è2x×X\tÇ âÞZ$\u0013f¤ó?\b\u0019ÅëN\fæ[\u001f¯¡&nh\fÍÉ\u008f~ñ³C°\u0094\u000fu©ÉkJ\u0019V1\u008aÖ¿6Ô\u001dÀ¡^\u0093é\u001e\u0010¦bÊï\u008d\fO\u0010íÛ¾k\u0095=\u0085\u0092\u0002VU\u0016ªB\u001d$\u0005\u008d\u0013ä¯\u009c\u001a¥´Jqd\u008dâbÑ\u0001\u0081É\u001f\u009b\u0015_`Qòj+æõ\u008d¾\u009c6Â\u008f=?uí%lÞ¡D\u0085\u009f¤\u0091íÀ«9~\u000fèHÉ_\u0006Ü\u007f[\u0093Û\u008eQú.è¥'\u0081\u0087Ñõ\u0081¶\u0002\u0014\u0015\u0002^\\\u008e\u008e9Q¥\u0011OÄ\u0083Ìmñ®·\u009c:ÖV\u0095¹T}m\u0086\u0092\u001aægcn<\u008b\u008dA/'÷U}ùü1Z8IýÆ¥\u0010Kù\u0004Ã¼nÚfïØÓÎ/9Þ\u0007H'>\u009c \u0085\u009aö÷KldÌç\u0010â `\u0089\u00062Ïþû¾l\u001aYT0ÆÃGö\u0098óS»aq_\u0016V».\u009fgÒÓÑZ\"Ï\u008b\u007fbms×=Ó\u0089¸EÂ2TZè7:ÏB:]K\u0086'nM\u008e\u007f\u0081Å²oïû\u0091%ð\u0016\u0006¤o(¡¡@\u00965W#õÆ\u0017L3Ô\u0081rS-[ç¹ßL\u0080\b7\u0080\u0000=\u007fb©\u0092^f\u0080KÑg\u000fÜ×°\u000f\u0089_í\u009aZ¼NmÈU\"s\u0095 \u001dE*Ç-=¸V\u000bÿ&\"\u001d:SêÆzz\u00adcÐ·sÄU Z¨Y[\fn3¿é\u0004Ç$\u009cµÿÈÏ;×¬\u0015\u009ch%ö\u0091¦]¤®9ü\u000bó½}ëÎZM\u000fâg°\u0081à\u0083ö*æêywsuþª\u008aô\u0005G¾ÇÀÙ§\u008bR_\u0082¡\u0093:á÷äû\u0019a\u001e\f¬¶Ü2·DUìR\u0018Iï<¸©y-yCq¶¥/Mz\u009cCï¯\u001d07þÉ®3\u0093\u00016\u0081'cÝT¯\u0011.üg\u009bðj´c\u009b\r\u009a\u0003\u0014\u0013ý\u009cÜ;Ã)GO\u001e\u0015´'m\fÅQ\u0084\u0001~u:\u0084Úë&EªaËm§2îøæ\u0006å0\u0099kô³\u008bb\u0086\u0014Meµ få\u008bÌD£â£ Pçd¿.\u009a\u000bæ¹:Í£Ýv #g:\u0016ç\u009aA\u00866z¨ÏðÛe;GMgc)Ä½Ì\u0096%ä¬ï\u008d×c ípi\u009fJöí·\u0092ÇÅ\u0081T¼¬ªÐà\u0011¨·ý\\V\u0097ü×·¬\u009c\u008bò=Ó_üë\u0003?\u0013\u0001q \u001aÇ®Ö\u009a]º\u009b\u001e\u0088\t\u0016\u0087ñ\u0080â\u0004áÉWÂë1è¢o½XÕ«DÞ\u001f£\u00002ç\u0086\u008c%\u0097²«9Ý\u000bhOëøB9B\u0010Iò\u0093Ñ7iC÷\u0096Ò\n}®µÁv®¡\"³\u009få¼?Åf\u0099ï:»\u0095\u0096\u0081 ¥ïÝ\u009b\u0019\u008a \u0011\u0002qyý\u0086z8ß\u0003\u009f-\u000eÓÆ£[>\u009eJ¯s\u0003²svA\u008e§ê÷ÜÖK\u0096Ár\u008aPõc§]\u0089J\u0013UÖÓèÍ¤ÉÏ¥KN\u0085_û³ß\u0002ß\u0080`\u0091 *«¬1&jÈØÊ8\u008a£1ü\u001fí>Â êQL~\u0084«k+\u009c¡ås\u0002\u0013GÒM,Ð1Í¼\u009e\u000f@/ñ\u0095\u0006D§ix\u0083\u001e\u000b\u0006\\SÍN\u0010Ôî%\nÕ\u0001ï\u0013Eû÷d\u0096\u001bÜl\nf\u001dûÝ$\u0093¡è61yÇ\u0095eQ\u0006ºR\u0085ð£ó\u001a,ÛP\f_¬Cf\u008fïÒ\u007f\u0098¬H\u0080û\u0095\u0085A·\u0003æçLXB\u00ad¹át<ßü\u0084PsÂIÏêru\u0017´Üe{)6D¦\u0003R%\u0082+\u0007üÑ÷¡\u0004mM*\b/M\u00871|\u008fàÅ¨Ë\u0016r\u0093\u001cB½D\u0000l³RZîì¾ßV\u0094\u0089}w\u009eQ#[g\u008aÎ!n\u0090I\u008fæ_\u0093\n¥à¿×]µ«\u008f=\u0091È\u0014\u0086óáY\u0017Ó9ñ\b&¹+ÔJ{\u0085\u0012åk\u000bÞ\u001b\u0010\u0019A\f\u0088\u0087ô\u001bwö\u0084^¢\u0000¢@g\u009fèÑÌ Ä\u0007ì\u0098ãÍòfÁdð\u0013ÔK\u0005K³\u0010¾y£|\u008aBBé¬\u008e û¬J«ÛO®`gÆ~\u007f\tEfÂ½î\u000b×S\u0088.%Ú\u001eê\tË¢ s\u007fÈQ\u0003\u0091\u0091\u0000¾"
               .getBytes("ISO-8859-1");
            bbab = new int[377];

            int var99;
            do {
               bbab[var40] = (
                     (var10002[var10001] & 255) << 24
                        | (var10002[var10001 + 1] & 255) << 16
                        | (var10002[var10001 + 2] & 255) << 8
                        | var10002[var10001 + 3] & 255
                  )
                  ^ -101133543;
               var40 += 1;
               var99 = var10001 + 4;
               var10001 += 4;
            } while (var99 < var10002.length);

            String[] var21 = new String[bbbb(-285258500, var34 ^ 1013673667)];
            int var19 = 0;
            String var18;
            int var20 = (var18 = aaaaa(14197890, var34 ^ -1410300700)).length();
            int var17 = 4;
            int var38 = -1;

            label142:
            while (true) {
               String var41 = var18.substring(++var38, var38 + var17);
               var10001 = (byte)-1;

               while (true) {
                  label137: {
                     char[] var53 = var41.toCharArray();
                     var99 = var53.length;
                     int var22 = 0;
                     var78 = var53;
                     var10001 = var99;
                     char[] var103;
                     int var121;
                     if (var99 <= 1) {
                        var103 = var53;
                        var121 = var22;
                     } else {
                        var78 = var53;
                        var10001 = var99;
                        if (var99 <= var22) {
                           break label137;
                        }

                        var103 = var53;
                        var121 = var22;
                     }

                     while (true) {
                        var103[var121] = (char)(var103[var121] ^ switch (var22 % bbbb(-285258503, var34 ^ -208285832)) {
                           case 0 -> bbbb(-285258504, var34 ^ 1219122851);
                           case 1 -> bbbb(-285258501, var34 ^ -1195973790);
                           case 2 -> bbbb(-285258502, var34 ^ 178302767);
                           case 3 -> bbbb(-285258619, var34 ^ -834795753);
                           case 4 -> bbbb(-285258620, var34 ^ 434500212);
                           case 5 -> bbbb(-285258617, var34 ^ 1712989430);
                           default -> bbbb(-285258618, var34 ^ 907638918);
                        });
                        var22++;
                        if (var10001 == 0) {
                           var121 = var10001;
                           var103 = var78;
                        } else {
                           if (var10001 <= var22) {
                              break;
                           }

                           var103 = var78;
                           var121 = var22;
                        }
                     }
                  }

                  String var110 = new String(var78).intern();
                  switch (var10001) {
                     case 0:
                        var21[var19++] = var110;
                        if ((var38 += var17) >= var20) {
                           baab = var21;
                           babb = new String[bbbb(-285258498, var34 ^ 908022887)];
                           long var8 = 2662199860875465168L;
                           long[] var14 = new long[bbbb(-285258623, var34 ^ -81726394)];
                           int var11 = 0;
                           String var12;
                           int var13 = (var12 = aaaaa(14197888, var34 ^ 1526174507)).length();
                           byte var10 = 0;

                           label116:
                           while (true) {
                              int var60 = var10;
                              var10 += 8;
                              String var43 = var12.substring(var60, var10);
                              var60 = 14197889;
                              int var84 = var34 ^ -968495939;
                              byte[] var15 = var43.getBytes("ISO-8859-1");
                              long[] var44 = var14;
                              var60 = var11++;
                              long var85 = (var15[0] & 255L) << bbbb(-285258624, var34 ^ 1776633643)
                                 | (var15[1] & 255L) << bbbb(-285258621, var34 ^ -739838741)
                                 | (var15[2] & 255L) << bbbb(-285258622, var34 ^ 1246417005)
                                 | (var15[3] & 255L) << bbbb(-285258611, var34 ^ 1370280682)
                                 | (var15[4] & 255L) << bbbb(-285258612, var34 ^ 942064273)
                                 | (var15[5] & 255L) << bbbb(-285258609, var34 ^ 1193434154)
                                 | (var15[bbbb(-285258610, var34 ^ 1408625702)] & 255L) << bbbb(-285258615, var34 ^ -335391032)
                                 | var15[bbbb(-285258616, var34 ^ 1896261490)] & 255L;
                              byte var111 = -1;

                              while (true) {
                                 long var123 = var85 ^ var8;
                                 switch (var111) {
                                    case 0:
                                       var44[var60] = var123;
                                       if (var10 >= var13) {
                                          bab = var14;
                                          aabb = new Integer[bbbb(-285258606, var34 ^ -1577841880)];
                                          long var0 = 5857000202737383882L;
                                          long[] var6 = new long[bbbb(-285258595, var34 ^ -12618585)];
                                          int var3 = 0;
                                          String var4;
                                          int var5 = (var4 = aaaaa(14197892, var34 ^ -1094269711)).length();
                                          byte var2 = 0;

                                          label106:
                                          while (true) {
                                             int var65 = var2;
                                             var2 += 8;
                                             String var46 = var4.substring(var65, var2);
                                             var65 = 14197893;
                                             int var88 = var34 ^ -1185490709;
                                             byte[] var7 = var46.getBytes("ISO-8859-1");
                                             long[] var47 = var6;
                                             var65 = var3++;
                                             long var89 = (var7[0] & 255L) << bbbb(-285258596, var34 ^ 1974558445)
                                                | (var7[1] & 255L) << bbbb(-285258593, var34 ^ 998561058)
                                                | (var7[2] & 255L) << bbbb(-285258594, var34 ^ -995117010)
                                                | (var7[3] & 255L) << bbbb(-285258599, var34 ^ 1003450272)
                                                | (var7[4] & 255L) << bbbb(-285258600, var34 ^ 1085770130)
                                                | (var7[5] & 255L) << bbbb(-285258597, var34 ^ -1189027239)
                                                | (var7[bbbb(-285258598, var34 ^ 1032386086)] & 255L) << bbbb(-285258587, var34 ^ 254228777)
                                                | var7[bbbb(-285258588, var34 ^ -812832734)] & 255L;
                                             var111 = -1;

                                             while (true) {
                                                var123 = var89 ^ var0;
                                                switch (var111) {
                                                   case 0:
                                                      var47[var65] = var123;
                                                      if (var2 >= var5) {
                                                         abbb = var6;
                                                         abaa = new Long[bbbb(-285258578, var34 ^ -1973014102)];
                                                         baba = baba(bbbb(-285258583, var34 ^ -1884163952), 1898806963664288348L);
                                                         aaaa = new String[abb(bbbb(-285258584, var34 ^ -2145812851), 6202326643345269434L)];
                                                         aba();
                                                         return;
                                                      }
                                                      break;
                                                   default:
                                                      var47[var65] = var123;
                                                      if (var2 < var5) {
                                                         continue label106;
                                                      }

                                                      var5 = (var4 = aaaaa(14197898, var34 ^ 529001395)).length();
                                                      var2 = 0;
                                                }

                                                int var68 = var2;
                                                var2 += 8;
                                                String var48 = var4.substring(var68, var2);
                                                var68 = 14197899;
                                                int var91 = var34 ^ -2058379464;
                                                var7 = var48.getBytes("ISO-8859-1");
                                                var47 = var6;
                                                var65 = var3++;
                                                var89 = (var7[0] & 255L) << bbbb(-285258585, var34 ^ -1902707271)
                                                   | (var7[1] & 255L) << bbbb(-285258586, var34 ^ 1336890803)
                                                   | (var7[2] & 255L) << bbbb(-285258591, var34 ^ -98355817)
                                                   | (var7[3] & 255L) << bbbb(-285258592, var34 ^ 884580728)
                                                   | (var7[4] & 255L) << bbbb(-285258589, var34 ^ 1265845830)
                                                   | (var7[5] & 255L) << bbbb(-285258590, var34 ^ 12861880)
                                                   | (var7[bbbb(-285258579, var34 ^ -1782676786)] & 255L) << bbbb(-285258580, var34 ^ -1541436602)
                                                   | var7[bbbb(-285258577, var34 ^ -972564243)] & 255L;
                                                var111 = 0;
                                             }
                                          }
                                       }
                                       break;
                                    default:
                                       var44[var60] = var123;
                                       if (var10 < var13) {
                                          continue label116;
                                       }

                                       var13 = (var12 = aaaaa(14197894, var34 ^ -1756433160)).length();
                                       var10 = 0;
                                 }

                                 int var63 = var10;
                                 var10 += 8;
                                 String var45 = var12.substring(var63, var10);
                                 var63 = 14197895;
                                 int var87 = var34 ^ -1619748236;
                                 var15 = var45.getBytes("ISO-8859-1");
                                 var44 = var14;
                                 var60 = var11++;
                                 var85 = (var15[0] & 255L) << bbbb(-285258613, var34 ^ -1882093332)
                                    | (var15[1] & 255L) << bbbb(-285258614, var34 ^ 854023347)
                                    | (var15[2] & 255L) << bbbb(-285258603, var34 ^ 667217781)
                                    | (var15[3] & 255L) << bbbb(-285258604, var34 ^ -2071752067)
                                    | (var15[4] & 255L) << bbbb(-285258601, var34 ^ 1127119313)
                                    | (var15[5] & 255L) << bbbb(-285258602, var34 ^ -1537456718)
                                    | (var15[bbbb(-285258607, var34 ^ 1754406975)] & 255L) << bbbb(-285258608, var34 ^ 1586199908)
                                    | var15[bbbb(-285258605, var34 ^ 1631314494)] & 255L;
                                 var111 = 0;
                              }
                           }
                        }

                        var17 = var18.charAt(var38);
                        break;
                     default:
                        var21[var19++] = var110;
                        if ((var38 += var17) < var20) {
                           var17 = var18.charAt(var38);
                           continue label142;
                        }

                        var20 = (var18 = aaaaa(14197891, var34 ^ -680672351)).length();
                        var17 = bbbb(-285258497, var34 ^ -1370399871);
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
                  default -> 31;
                  case 1 -> 95;
                  case 2 -> 48;
                  case 3 -> 244;
                  case 4 -> 138;
               };
               var31[var32] = (char)(var31[var32] ^ var33);
            } while (++var32 < var31.length);

            var26[var27] = new String(var31).intern();
            var28 += var29;
         } while (++var27 < var25.length);

         var30 = 0;
      }
   }

   private boolean babb(class_310 param1, class_2338 param2) {
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
      // 05: getfield net/minecraft/class_310.field_1687 Lnet/minecraft/class_638;
      // 08: aload 2
      // 09: invokevirtual net/minecraft/class_638.method_8320 (Lnet/minecraft/class_2338;)Lnet/minecraft/class_2680;
      // 0c: astore 4
      // 0e: aload 4
      // 10: invokevirtual net/minecraft/class_2680.method_26215 ()Z
      // 13: iload 3
      // 14: ifne 4b
      // 17: ifne 32
      // 1a: goto 1e
      // 1d: athrow
      // 1e: aload 4
      // 20: invokevirtual net/minecraft/class_2680.method_45474 ()Z
      // 23: iload 3
      // 24: ifne 4b
      // 27: goto 2b
      // 2a: athrow
      // 2b: ifeq 5a
      // 2e: goto 32
      // 31: athrow
      // 32: aload 1
      // 33: getfield net/minecraft/class_310.field_1687 Lnet/minecraft/class_638;
      // 36: aconst_null
      // 37: new net/minecraft/class_238
      // 3a: dup
      // 3b: aload 2
      // 3c: invokespecial net/minecraft/class_238.<init> (Lnet/minecraft/class_2338;)V
      // 3f: invokevirtual net/minecraft/class_638.method_8335 (Lnet/minecraft/class_1297;Lnet/minecraft/class_238;)Ljava/util/List;
      // 42: invokeinterface java/util/List.isEmpty ()Z 1
      // 47: goto 4b
      // 4a: athrow
      // 4b: iload 3
      // 4c: ifne 57
      // 4f: ifeq 5a
      // 52: goto 56
      // 55: athrow
      // 56: bipush 1
      // 57: goto 5b
      // 5a: bipush 0
      // 5b: ireturn
   }

   private int b(class_310 param1) {
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
      // 1f: bipush -1
      // 20: ireturn
      // 21: athrow
      // 22: aload 1
      // 23: getfield net/minecraft/class_310.field_1724 Lnet/minecraft/class_746;
      // 26: invokevirtual net/minecraft/class_746.method_31548 ()Lnet/minecraft/class_1661;
      // 29: astore 3
      // 2a: aload 3
      // 2b: invokestatic qeaa361f143ee4a0894bd168fd9b30c66/qf4ccf8f5435d4a78bdca4d6a018b578e/bbbabaa.aaaab (Lnet/minecraft/class_1661;)I
      // 2e: istore 4
      // 30: iload 4
      // 32: iload 2
      // 33: ifne 95
      // 36: iflt 80
      // 39: goto 3d
      // 3c: athrow
      // 3d: iload 4
      // 3f: iload 2
      // 40: ifne 95
      // 43: goto 47
      // 46: athrow
      // 47: ldc_w -285258307
      // 4a: ldc_w 1941323353
      // 4d: ldc_w -182196629
      // 50: ixor
      // 51: invokestatic qeaa361f143ee4a0894bd168fd9b30c66/qf4ccf8f5435d4a78bdca4d6a018b578e/baabb.bbbb (II)I
      // 54: ldc2_w 8292038560580776859
      // 57: invokestatic qeaa361f143ee4a0894bd168fd9b30c66/qf4ccf8f5435d4a78bdca4d6a018b578e/baabb.abb (IJ)I
      // 5a: if_icmpge 80
      // 5d: goto 61
      // 60: athrow
      // 61: aload 3
      // 62: iload 4
      // 64: invokevirtual net/minecraft/class_1661.method_5438 (I)Lnet/minecraft/class_1799;
      // 67: iload 2
      // 68: ifne 8f
      // 6b: goto 6f
      // 6e: athrow
      // 6f: getstatic net/minecraft/class_1802.field_8301 Lnet/minecraft/class_1792;
      // 72: invokevirtual net/minecraft/class_1799.method_31574 (Lnet/minecraft/class_1792;)Z
      // 75: ifeq 80
      // 78: goto 7c
      // 7b: athrow
      // 7c: iload 4
      // 7e: ireturn
      // 7f: athrow
      // 80: aload 0
      // 81: iload 2
      // 82: ifne 9c
      // 85: getfield qeaa361f143ee4a0894bd168fd9b30c66/qf4ccf8f5435d4a78bdca4d6a018b578e/baabb.aaab Lqeaa361f143ee4a0894bd168fd9b30c66/qf4ccf8f5435d4a78bdca4d6a018b578e/abbaaaaa;
      // 88: invokevirtual qeaa361f143ee4a0894bd168fd9b30c66/qf4ccf8f5435d4a78bdca4d6a018b578e/abbaaaaa.abbb ()Ljava/lang/Object;
      // 8b: goto 8f
      // 8e: athrow
      // 8f: checkcast java/lang/Boolean
      // 92: invokevirtual java/lang/Boolean.booleanValue ()Z
      // 95: ifne 9b
      // 98: bipush -1
      // 99: ireturn
      // 9a: athrow
      // 9b: aload 0
      // 9c: aload 3
      // 9d: getstatic net/minecraft/class_1802.field_8301 Lnet/minecraft/class_1792;
      // a0: invokevirtual qeaa361f143ee4a0894bd168fd9b30c66/qf4ccf8f5435d4a78bdca4d6a018b578e/baabb.aabb (Lnet/minecraft/class_1661;Lnet/minecraft/class_1792;)I
      // a3: ireturn
   }

   private int bbab(class_310 param1, aaabbbab param2) {
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
      // 05: aload 2
      // 06: invokevirtual qeaa361f143ee4a0894bd168fd9b30c66/qf4ccf8f5435d4a78bdca4d6a018b578e/baabb.aaab (Lqeaa361f143ee4a0894bd168fd9b30c66/qf4ccf8f5435d4a78bdca4d6a018b578e/aaabbbab;)I
      // 09: istore 4
      // 0b: aload 1
      // 0c: iload 3
      // 0d: ifne 18
      // 10: ifnull 37
      // 13: goto 17
      // 16: athrow
      // 17: aload 1
      // 18: iload 3
      // 19: ifne 2b
      // 1c: getfield net/minecraft/class_310.field_1724 Lnet/minecraft/class_746;
      // 1f: ifnull 37
      // 22: goto 26
      // 25: athrow
      // 26: aload 1
      // 27: goto 2b
      // 2a: athrow
      // 2b: getfield net/minecraft/class_310.field_1724 Lnet/minecraft/class_746;
      // 2e: getfield net/minecraft/class_746.field_6012 I
      // 31: iload 4
      // 33: iadd
      // 34: goto 38
      // 37: bipush 0
      // 38: ireturn
   }

   @Override
   public void aabaa() {
      this.bbba();
      this.aab();
   }

   private void a(class_310 var1) {
      aabbabbbb.bbaaabb(var1, this, abbaaabba.aba);
      this.abaa();
   }

   private void bbba() {
      this.abab = 0;
      this.aa = 0;
   }
}
