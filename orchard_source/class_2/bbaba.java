package nsc;

import com.google.gson.JsonObject;
import java.util.List;
import net.fabricmc.api.EnvType;
import net.fabricmc.api.Environment;
import net.minecraft.class_1799;
import net.minecraft.class_310;

@Environment(EnvType.CLIENT)
public final class bbaba extends abbaabbaa {
   private static final String aa;
   private final aaabbbab ab;
   private static final Integer[] ba;
   private static final long[] bb;
   private static String[] aaa;
   private static final Long[] aab;
   private final bb aba;
   private static final String abb;
   private static final String[] baa;
   private static final int[] bbb;
   private static final String[] bab;
   private static final Object[] aaab;
   private static final long[] bba;
   private static final String[] aaaa;

   public void aa(class_310 var1) {
      this.aab(var1, true);
   }

   private static int a(int var0, int var1) {
      int var2 = bbb[var0 ^ -779608912] ^ var1 ^ var0;
      var2 -= 43403;
      var2 -= 52546;
      var2 -= 25277;
      var2 += 16211;
      var2 -= 11404;
      var2 -= 29321;
      var2 += 11554;
      return var2 ^ 24604;
   }

   private boolean ab(class_1799 param1) {
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
      // 09: ifnull 22
      // 0c: goto 10
      // 0f: athrow
      // 10: aload 1
      // 11: iload 2
      // 12: ifne 2c
      // 15: invokevirtual net/minecraft/class_1799.method_7909 ()Lnet/minecraft/class_1792;
      // 18: instanceof net/minecraft/class_1747
      // 1b: ifne 25
      // 1e: goto 22
      // 21: athrow
      // 22: bipush 0
      // 23: ireturn
      // 24: athrow
      // 25: aload 0
      // 26: getfield qeaa361f143ee4a0894bd168fd9b30c66/qf4ccf8f5435d4a78bdca4d6a018b578e/bbaba.aba Lqeaa361f143ee4a0894bd168fd9b30c66/qf4ccf8f5435d4a78bdca4d6a018b578e/bb;
      // 29: invokevirtual qeaa361f143ee4a0894bd168fd9b30c66/qf4ccf8f5435d4a78bdca4d6a018b578e/bb.abbb ()Ljava/lang/Object;
      // 2c: checkcast java/util/List
      // 2f: astore 3
      // 30: aload 3
      // 31: invokeinterface java/util/List.isEmpty ()Z 1
      // 36: iload 2
      // 37: ifne 42
      // 3a: ifeq 43
      // 3d: goto 41
      // 40: athrow
      // 41: bipush 1
      // 42: ireturn
      // 43: getstatic net/minecraft/class_7923.field_41178 Lnet/minecraft/class_7922;
      // 46: aload 1
      // 47: invokevirtual net/minecraft/class_1799.method_7909 ()Lnet/minecraft/class_1792;
      // 4a: invokeinterface net/minecraft/class_7922.method_10221 (Ljava/lang/Object;)Lnet/minecraft/class_2960; 2
      // 4f: invokevirtual net/minecraft/class_2960.toString ()Ljava/lang/String;
      // 52: astore 4
      // 54: aload 4
      // 56: aload 3
      // 57: invokestatic qeaa361f143ee4a0894bd168fd9b30c66/qf4ccf8f5435d4a78bdca4d6a018b578e/bbaba.ba (Ljava/lang/String;Ljava/util/List;)Z
      // 5a: iload 2
      // 5b: ifne 66
      // 5e: ifne 69
      // 61: goto 65
      // 64: athrow
      // 65: bipush 1
      // 66: goto 6a
      // 69: bipush 0
      // 6a: ireturn
   }

   @Override
   public String ababa() {
      // $VF: Couldn't be decompiled
      // Please report this to the Vineflower issue tracker, at https://github.com/Vineflower/vineflower/issues with a copy of the class file (if you have the rights to distribute it!)
      // java.lang.RuntimeException: parsing failure!
      //   at org.jetbrains.java.decompiler.modules.decompiler.decompose.DomHelper.parseGraph(DomHelper.java:211)
      //   at org.jetbrains.java.decompiler.main.rels.MethodProcessor.codeToJava(MethodProcessor.java:166)
      //
      // Bytecode:
      // 00: aload 0
      // 01: getfield qeaa361f143ee4a0894bd168fd9b30c66/qf4ccf8f5435d4a78bdca4d6a018b578e/bbaba.ab Lqeaa361f143ee4a0894bd168fd9b30c66/qf4ccf8f5435d4a78bdca4d6a018b578e/aaabbbab;
      // 04: invokevirtual qeaa361f143ee4a0894bd168fd9b30c66/qf4ccf8f5435d4a78bdca4d6a018b578e/aaabbbab.bab ()D
      // 07: invokestatic java/lang/Math.round (D)J
      // 0a: l2i
      // 0b: istore 2
      // 0c: getstatic qeaa361f143ee4a0894bd168fd9b30c66/qf4ccf8f5435d4a78bdca4d6a018b578e/baaabbaa.bba I
      // 0f: aload 0
      // 10: getfield qeaa361f143ee4a0894bd168fd9b30c66/qf4ccf8f5435d4a78bdca4d6a018b578e/bbaba.ab Lqeaa361f143ee4a0894bd168fd9b30c66/qf4ccf8f5435d4a78bdca4d6a018b578e/aaabbbab;
      // 13: invokevirtual qeaa361f143ee4a0894bd168fd9b30c66/qf4ccf8f5435d4a78bdca4d6a018b578e/aaabbbab.abb ()D
      // 16: invokestatic java/lang/Math.round (D)J
      // 19: l2i
      // 1a: istore 3
      // 1b: istore 1
      // 1c: iload 2
      // 1d: iload 1
      // 1e: ifne 32
      // 21: iload 3
      // 22: if_icmpne 31
      // 25: goto 29
      // 28: athrow
      // 29: iload 2
      // 2a: invokestatic java/lang/Integer.toString (I)Ljava/lang/String;
      // 2d: goto 69
      // 30: athrow
      // 31: iload 2
      // 32: getstatic qeaa361f143ee4a0894bd168fd9b30c66/qf4ccf8f5435d4a78bdca4d6a018b578e/bbaba.aaa [Ljava/lang/String;
      // 35: ldc -779608912
      // 37: ldc -569096660
      // 39: ldc 2124434211
      // 3b: ixor
      // 3c: invokestatic qeaa361f143ee4a0894bd168fd9b30c66/qf4ccf8f5435d4a78bdca4d6a018b578e/bbaba.a (II)I
      // 3f: ldc2_w 5011481711939055577
      // 42: invokestatic qeaa361f143ee4a0894bd168fd9b30c66/qf4ccf8f5435d4a78bdca4d6a018b578e/bbaba.bbb (IJ)I
      // 45: aaload
      // 46: invokestatic qeaa361f143ee4a0894bd168fd9b30c66/qf4ccf8f5435d4a78bdca4d6a018b578e/aabbaaaba.abba (Ljava/lang/String;)Ljava/lang/String;
      // 49: iload 3
      // 4a: istore 6
      // 4c: astore 5
      // 4e: istore 4
      // 50: new java/lang/StringBuilder
      // 53: dup
      // 54: invokespecial java/lang/StringBuilder.<init> ()V
      // 57: iload 4
      // 59: invokevirtual java/lang/StringBuilder.append (I)Ljava/lang/StringBuilder;
      // 5c: aload 5
      // 5e: invokevirtual java/lang/StringBuilder.append (Ljava/lang/Object;)Ljava/lang/StringBuilder;
      // 61: iload 6
      // 63: invokevirtual java/lang/StringBuilder.append (I)Ljava/lang/StringBuilder;
      // 66: invokevirtual java/lang/StringBuilder.toString ()Ljava/lang/String;
      // 69: areturn
   }

   static boolean ba(String param0, List param1) {
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
      // 11: invokevirtual java/lang/String.isBlank ()Z
      // 14: iload 2
      // 15: ifne 41
      // 18: ifne 40
      // 1b: goto 1f
      // 1e: athrow
      // 1f: aload 1
      // 20: iload 2
      // 21: ifne 30
      // 24: goto 28
      // 27: athrow
      // 28: ifnull 40
      // 2b: goto 2f
      // 2e: athrow
      // 2f: aload 1
      // 30: invokeinterface java/util/List.isEmpty ()Z 1
      // 35: iload 2
      // 36: ifne 41
      // 39: ifeq 42
      // 3c: goto 40
      // 3f: athrow
      // 40: bipush 0
      // 41: ireturn
      // 42: aload 0
      // 43: invokevirtual java/lang/String.trim ()Ljava/lang/String;
      // 46: getstatic java/util/Locale.ROOT Ljava/util/Locale;
      // 49: invokevirtual java/lang/String.toLowerCase (Ljava/util/Locale;)Ljava/lang/String;
      // 4c: astore 3
      // 4d: aload 1
      // 4e: invokeinterface java/util/List.stream ()Ljava/util/stream/Stream; 1
      // 53: invokedynamic test ()Ljava/util/function/Predicate; bsm=java/lang/invoke/LambdaMetafactory.metafactory (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;Ljava/lang/invoke/MethodType;Ljava/lang/invoke/MethodHandle;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[ (Ljava/lang/Object;)Z, qeaa361f143ee4a0894bd168fd9b30c66/qf4ccf8f5435d4a78bdca4d6a018b578e/bbaba.bab (Ljava/lang/String;)Z, (Ljava/lang/String;)Z ]
      // 58: invokeinterface java/util/stream/Stream.filter (Ljava/util/function/Predicate;)Ljava/util/stream/Stream; 2
      // 5d: invokedynamic apply ()Ljava/util/function/Function; bsm=java/lang/invoke/LambdaMetafactory.metafactory (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;Ljava/lang/invoke/MethodType;Ljava/lang/invoke/MethodHandle;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[ (Ljava/lang/Object;)Ljava/lang/Object;, qeaa361f143ee4a0894bd168fd9b30c66/qf4ccf8f5435d4a78bdca4d6a018b578e/bbaba.bba (Ljava/lang/String;)Ljava/lang/String;, (Ljava/lang/String;)Ljava/lang/String; ]
      // 62: invokeinterface java/util/stream/Stream.map (Ljava/util/function/Function;)Ljava/util/stream/Stream; 2
      // 67: aload 3
      // 68: dup
      // 69: invokestatic java/util/Objects.requireNonNull (Ljava/lang/Object;)Ljava/lang/Object;
      // 6c: pop
      // 6d: invokedynamic test (Ljava/lang/String;)Ljava/util/function/Predicate; bsm=java/lang/invoke/LambdaMetafactory.metafactory (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;Ljava/lang/invoke/MethodType;Ljava/lang/invoke/MethodHandle;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[ (Ljava/lang/Object;)Z, java/lang/String.equals (Ljava/lang/Object;)Z, (Ljava/lang/String;)Z ]
      // 72: invokeinterface java/util/stream/Stream.anyMatch (Ljava/util/function/Predicate;)Z 2
      // 77: ireturn
   }

   private static void bb() {
      int var0 = -1955800957;
      aaa[0] = abb(
         aaab(a(-779608911, var0 ^ 492562000), a(-779608910, var0 ^ 1513997834)).toCharArray(),
         aaaa(a(-779608909, var0 ^ -1324228152), 4616174938297389542L),
         bbb(a(-779608908, var0 ^ -935193712), 2998696024325770127L)
      );
      aaa[1] = abb(
         aaab(a(-779608907, var0 ^ 674236675), a(-779608906, var0 ^ -1899310391)).toCharArray(),
         aaaa(a(-779608905, var0 ^ -2000080987), 8757685702120546484L),
         bbb(a(-779608904, var0 ^ -972055228), 3560328754023431132L)
      );
      aaa[2] = abb(
         aaab(a(-779608903, var0 ^ -938528003), a(-779608902, var0 ^ 1919992136)).toCharArray(),
         aaaa(a(-779608901, var0 ^ -99306538), 1338334462106727020L),
         bbb(a(-779608900, var0 ^ 863342954), 2702913930531568099L)
      );
      aaa[3] = abb(
         aaab(a(-779608899, var0 ^ 1093255443), a(-779608898, var0 ^ -1218749887)).toCharArray(),
         aaaa(a(-779608897, var0 ^ -1428001557), 5776217492088859437L),
         bbb(a(-779608928, var0 ^ -1460047312), 5394932898883612346L)
      );
      aaa[4] = abb(
         aaab(a(-779608927, var0 ^ -793601956), a(-779608926, var0 ^ -1610877831)).toCharArray(),
         aaaa(a(-779608925, var0 ^ -1687093539), 3085506742443642339L),
         bbb(a(-779608924, var0 ^ -1909752097), 3977678166473571442L)
      );
      aaa[5] = abb(
         aaab(a(-779608923, var0 ^ 16560116), a(-779608922, var0 ^ -1727658876)).toCharArray(),
         aaaa(a(-779608921, var0 ^ 1250613929), 3979088205430248140L),
         bbb(a(-779608920, var0 ^ -1708784972), 6677421402740078177L)
      );
      aaa[bbb(a(-779608919, var0 ^ -1694769002), 8404956055540088617L)] = abb(
         aaab(a(-779608918, var0 ^ -2063147003), a(-779608917, var0 ^ 1054569682)).toCharArray(),
         aaaa(a(-779608916, var0 ^ -265977310), 1414819191283886620L),
         bbb(a(-779608915, var0 ^ -2055802340), 123546641433641654L)
      );
      aaa[bbb(a(-779608914, var0 ^ 537484462), 5938275840161335812L)] = abb(
         aaab(a(-779608913, var0 ^ 320626567), a(-779608944, var0 ^ -185062077)).toCharArray(),
         aaaa(a(-779608943, var0 ^ 1479828863), 5913782874250244726L),
         bbb(a(-779608942, var0 ^ 1226243591), 296636260115276362L)
      );
      aaa[bbb(a(-779608941, var0 ^ -1556784231), 1757152515754898536L)] = abb(
         aaab(a(-779608940, var0 ^ -222130806), a(-779608939, var0 ^ 953241087)).toCharArray(),
         aaaa(a(-779608938, var0 ^ -129475889), 8489650544704723362L),
         bbb(a(-779608937, var0 ^ 1767994546), 8507463232948241207L)
      );
      aaa[bbb(a(-779608936, var0 ^ -2057353020), 7100566720464884730L)] = abb(
         aaab(a(-779608935, var0 ^ -647046230), a(-779608934, var0 ^ 1569064202)).toCharArray(),
         aaaa(a(-779608933, var0 ^ 418027810), 8857416900372598914L),
         bbb(a(-779608932, var0 ^ -875927059), 3893116465765011317L)
      );
   }

   private boolean aaa(class_310 param1) {
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
      // 08: invokevirtual net/minecraft/class_746.method_6047 ()Lnet/minecraft/class_1799;
      // 0b: astore 3
      // 0c: aload 3
      // 0d: iload 2
      // 0e: ifne 19
      // 11: ifnull 31
      // 14: goto 18
      // 17: athrow
      // 18: aload 3
      // 19: invokevirtual net/minecraft/class_1799.method_7909 ()Lnet/minecraft/class_1792;
      // 1c: instanceof net/minecraft/class_1747
      // 1f: iload 2
      // 20: ifne 3c
      // 23: ifeq 31
      // 26: goto 2a
      // 29: athrow
      // 2a: aload 0
      // 2b: aload 3
      // 2c: invokevirtual qeaa361f143ee4a0894bd168fd9b30c66/qf4ccf8f5435d4a78bdca4d6a018b578e/bbaba.ab (Lnet/minecraft/class_1799;)Z
      // 2f: ireturn
      // 30: athrow
      // 31: aload 0
      // 32: aload 1
      // 33: getfield net/minecraft/class_310.field_1724 Lnet/minecraft/class_746;
      // 36: invokevirtual net/minecraft/class_746.method_6079 ()Lnet/minecraft/class_1799;
      // 39: invokevirtual qeaa361f143ee4a0894bd168fd9b30c66/qf4ccf8f5435d4a78bdca4d6a018b578e/bbaba.ab (Lnet/minecraft/class_1799;)Z
      // 3c: ireturn
   }

   private void aab(class_310 param1, boolean param2) {
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
      // 05: invokevirtual qeaa361f143ee4a0894bd168fd9b30c66/qf4ccf8f5435d4a78bdca4d6a018b578e/bbaba.babbaab ()Z
      // 08: ifeq 36
      // 0b: aload 1
      // 0c: iload 3
      // 0d: ifne 1c
      // 10: goto 14
      // 13: athrow
      // 14: ifnull 36
      // 17: goto 1b
      // 1a: athrow
      // 1b: aload 1
      // 1c: getfield net/minecraft/class_310.field_1724 Lnet/minecraft/class_746;
      // 1f: ifnull 36
      // 22: aload 0
      // 23: aload 1
      // 24: invokevirtual qeaa361f143ee4a0894bd168fd9b30c66/qf4ccf8f5435d4a78bdca4d6a018b578e/bbaba.aaa (Lnet/minecraft/class_310;)Z
      // 27: iload 3
      // 28: ifne 3a
      // 2b: goto 2f
      // 2e: athrow
      // 2f: ifne 37
      // 32: goto 36
      // 35: athrow
      // 36: return
      // 37: invokestatic qeaa361f143ee4a0894bd168fd9b30c66/qf4ccf8f5435d4a78bdca4d6a018b578e/aabbabbbb.aaaaaba ()Z
      // 3a: iload 3
      // 3b: ifne 48
      // 3e: ifne 66
      // 41: goto 45
      // 44: athrow
      // 45: invokestatic qeaa361f143ee4a0894bd168fd9b30c66/qf4ccf8f5435d4a78bdca4d6a018b578e/bbabbbb.aaabba ()Z
      // 48: iload 3
      // 49: ifne 63
      // 4c: ifne 66
      // 4f: goto 53
      // 52: athrow
      // 53: aload 1
      // 54: iload 3
      // 55: ifne 68
      // 58: goto 5c
      // 5b: athrow
      // 5c: invokestatic qeaa361f143ee4a0894bd168fd9b30c66/qf4ccf8f5435d4a78bdca4d6a018b578e/bbbbbbaa.aabb (Lnet/minecraft/class_310;)Z
      // 5f: goto 63
      // 62: athrow
      // 63: ifeq 67
      // 66: return
      // 67: aload 1
      // 68: checkcast qeaa361f143ee4a0894bd168fd9b30c66/q9fca77a8c4f94f01ae294010b0bee919/abbaabb
      // 6b: astore 4
      // 6d: aload 0
      // 6e: invokevirtual qeaa361f143ee4a0894bd168fd9b30c66/qf4ccf8f5435d4a78bdca4d6a018b578e/bbaba.aba ()I
      // 71: istore 5
      // 73: iload 2
      // 74: iload 3
      // 75: ifne 92
      // 78: ifne 97
      // 7b: goto 7f
      // 7e: athrow
      // 7f: aload 4
      // 81: iload 3
      // 82: ifne 9d
      // 85: goto 89
      // 88: athrow
      // 89: invokeinterface qeaa361f143ee4a0894bd168fd9b30c66/q9fca77a8c4f94f01ae294010b0bee919/abbaabb.wq$getUseCd ()I 1
      // 8e: goto 92
      // 91: athrow
      // 92: iload 5
      // 94: if_icmple a4
      // 97: aload 4
      // 99: goto 9d
      // 9c: athrow
      // 9d: iload 5
      // 9f: invokeinterface qeaa361f143ee4a0894bd168fd9b30c66/q9fca77a8c4f94f01ae294010b0bee919/abbaabb.wq$setUseCd (I)V 2
      // a4: return
   }

   private int aba() {
      // $VF: Couldn't be decompiled
      // Please report this to the Vineflower issue tracker, at https://github.com/Vineflower/vineflower/issues with a copy of the class file (if you have the rights to distribute it!)
      // java.lang.RuntimeException: parsing failure!
      //   at org.jetbrains.java.decompiler.modules.decompiler.decompose.DomHelper.parseGraph(DomHelper.java:211)
      //   at org.jetbrains.java.decompiler.main.rels.MethodProcessor.codeToJava(MethodProcessor.java:166)
      //
      // Bytecode:
      // 00: bipush 1
      // 01: bipush 4
      // 02: aload 0
      // 03: getfield qeaa361f143ee4a0894bd168fd9b30c66/qf4ccf8f5435d4a78bdca4d6a018b578e/bbaba.ab Lqeaa361f143ee4a0894bd168fd9b30c66/qf4ccf8f5435d4a78bdca4d6a018b578e/aaabbbab;
      // 06: invokevirtual qeaa361f143ee4a0894bd168fd9b30c66/qf4ccf8f5435d4a78bdca4d6a018b578e/aaabbbab.bab ()D
      // 09: invokestatic java/lang/Math.round (D)J
      // 0c: l2i
      // 0d: invokestatic java/lang/Math.min (II)I
      // 10: invokestatic java/lang/Math.max (II)I
      // 13: istore 2
      // 14: getstatic qeaa361f143ee4a0894bd168fd9b30c66/qf4ccf8f5435d4a78bdca4d6a018b578e/baaabbaa.bba I
      // 17: iload 2
      // 18: bipush 4
      // 19: aload 0
      // 1a: getfield qeaa361f143ee4a0894bd168fd9b30c66/qf4ccf8f5435d4a78bdca4d6a018b578e/bbaba.ab Lqeaa361f143ee4a0894bd168fd9b30c66/qf4ccf8f5435d4a78bdca4d6a018b578e/aaabbbab;
      // 1d: invokevirtual qeaa361f143ee4a0894bd168fd9b30c66/qf4ccf8f5435d4a78bdca4d6a018b578e/aaabbbab.abb ()D
      // 20: invokestatic java/lang/Math.round (D)J
      // 23: l2i
      // 24: invokestatic java/lang/Math.min (II)I
      // 27: invokestatic java/lang/Math.max (II)I
      // 2a: istore 3
      // 2b: istore 1
      // 2c: iload 2
      // 2d: iload 1
      // 2e: ifne 3e
      // 31: iload 3
      // 32: if_icmpne 41
      // 35: goto 39
      // 38: athrow
      // 39: iload 2
      // 3a: goto 3e
      // 3d: athrow
      // 3e: goto 4b
      // 41: invokestatic java/util/concurrent/ThreadLocalRandom.current ()Ljava/util/concurrent/ThreadLocalRandom;
      // 44: iload 2
      // 45: iload 3
      // 46: bipush 1
      // 47: iadd
      // 48: invokevirtual java/util/concurrent/ThreadLocalRandom.nextInt (II)I
      // 4b: ireturn
   }

   public bbaba() {
      super(
         aabbaaaba.aaab(aaa[5]),
         bbaabbba.bba,
         aabbaaaba.aaab(aaa[2])
      );
      this.ab = (aaabbbab)this.abbbaaa(
         new aaabbbab(aabbaaaba.aaab(aaa[3]), 1.0, 4.0, 1.0, 4.0, 1.0)
            .aaa(aabbaaaba.abba(aaa[4]))
      );
      this.aba = (bb)this.abbbaaa(new bb((Object)aa, List.of()));
   }

   private static String abb(char[] var0, long var1, int var3) {
      int var4 = bbb(a(-779608878, -1124532052 ^ -448875195), 6988865596857543865L) ^ var3;

      for (int var5 = 0; var5 < var0.length; var5++) {
         int var7 = var4 ^ (int)var1 ^ ~var5;
         int var8 = var7 ^ var3 - var5 * var0.length;
         var4 = -var8 * var3 | var5;
         var0[var5] = (char)(var0[var5] ^ var4);
         int var6 = var5 & bbb(a(-779608877, -1124532052 ^ -1639968230), 7390731489870467279L);
         var3 = var3 << var6 | var3 >>> -var6;
         var1 ^= var6;
      }

      return new String(var0);
   }

   @Override
   public void bbaa() {
      this.aab(class_310.method_1551(), false);
   }

   private static boolean bab(String var0) {
      int var1 = baaabbaa.bba;

      String var10000;
      label33: {
         try {
            var10000 = var0;
            if (var1 != 0) {
               break label33;
            }

            if (var0 == null) {
               return false;
            }
         } catch (MatchException var3) {
            throw var3;
         }

         var10000 = var0;
      }

      try {
         boolean var4 = var10000.isBlank();
         if (var1 != 0) {
            return var4;
         }

         if (!var4) {
            return true;
         }
      } catch (MatchException var2) {
         throw var2;
      }

      return false;
   }

   private static String bba(String param0) {
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
      // 05: invokevirtual java/lang/String.trim ()Ljava/lang/String;
      // 08: getstatic java/util/Locale.ROOT Ljava/util/Locale;
      // 0b: invokevirtual java/lang/String.toLowerCase (Ljava/util/Locale;)Ljava/lang/String;
      // 0e: ldc_w -779608876
      // 11: ldc_w 1269901478
      // 14: ldc_w 692083720
      // 17: ixor
      // 18: invokestatic qeaa361f143ee4a0894bd168fd9b30c66/qf4ccf8f5435d4a78bdca4d6a018b578e/bbaba.a (II)I
      // 1b: ldc2_w 2886053122178982800
      // 1e: invokestatic qeaa361f143ee4a0894bd168fd9b30c66/qf4ccf8f5435d4a78bdca4d6a018b578e/bbaba.bbb (IJ)I
      // 21: ldc_w -779608875
      // 24: ldc_w 1269901478
      // 27: ldc_w 134093876
      // 2a: ixor
      // 2b: invokestatic qeaa361f143ee4a0894bd168fd9b30c66/qf4ccf8f5435d4a78bdca4d6a018b578e/bbaba.a (II)I
      // 2e: ldc2_w 4493172835358633735
      // 31: invokestatic qeaa361f143ee4a0894bd168fd9b30c66/qf4ccf8f5435d4a78bdca4d6a018b578e/bbaba.bbb (IJ)I
      // 34: invokevirtual java/lang/String.replace (CC)Ljava/lang/String;
      // 37: astore 2
      // 38: aload 2
      // 39: iload 1
      // 3a: ifne 5c
      // 3d: getstatic qeaa361f143ee4a0894bd168fd9b30c66/qf4ccf8f5435d4a78bdca4d6a018b578e/bbaba.aaa [Ljava/lang/String;
      // 40: bipush 1
      // 41: aaload
      // 42: invokestatic qeaa361f143ee4a0894bd168fd9b30c66/qf4ccf8f5435d4a78bdca4d6a018b578e/aabbaaaba.abba (Ljava/lang/String;)Ljava/lang/String;
      // 45: invokevirtual java/lang/String.contains (Ljava/lang/CharSequence;)Z
      // 48: ifeq 54
      // 4b: goto 4f
      // 4e: athrow
      // 4f: aload 2
      // 50: goto 73
      // 53: athrow
      // 54: getstatic qeaa361f143ee4a0894bd168fd9b30c66/qf4ccf8f5435d4a78bdca4d6a018b578e/bbaba.aaa [Ljava/lang/String;
      // 57: bipush 0
      // 58: aaload
      // 59: invokestatic qeaa361f143ee4a0894bd168fd9b30c66/qf4ccf8f5435d4a78bdca4d6a018b578e/aabbaaaba.abba (Ljava/lang/String;)Ljava/lang/String;
      // 5c: aload 2
      // 5d: astore 4
      // 5f: astore 3
      // 60: new java/lang/StringBuilder
      // 63: dup
      // 64: invokespecial java/lang/StringBuilder.<init> ()V
      // 67: aload 3
      // 68: invokevirtual java/lang/StringBuilder.append (Ljava/lang/Object;)Ljava/lang/StringBuilder;
      // 6b: aload 4
      // 6d: invokevirtual java/lang/StringBuilder.append (Ljava/lang/Object;)Ljava/lang/StringBuilder;
      // 70: invokevirtual java/lang/StringBuilder.toString ()Ljava/lang/String;
      // 73: areturn
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
      // 00: getstatic qeaa361f143ee4a0894bd168fd9b30c66/qf4ccf8f5435d4a78bdca4d6a018b578e/baaabbaa.bba I
      // 03: istore 2
      // 04: aload 1
      // 05: iload 2
      // 06: ifne 11
      // 09: ifnull a9
      // 0c: goto 10
      // 0f: athrow
      // 10: aload 1
      // 11: getstatic qeaa361f143ee4a0894bd168fd9b30c66/qf4ccf8f5435d4a78bdca4d6a018b578e/bbaba.aaa [Ljava/lang/String;
      // 14: iload 2
      // 15: ifne 41
      // 18: ldc_w -779608874
      // 1b: ldc_w 952213449
      // 1e: ldc_w 2109128630
      // 21: ixor
      // 22: invokestatic qeaa361f143ee4a0894bd168fd9b30c66/qf4ccf8f5435d4a78bdca4d6a018b578e/bbaba.a (II)I
      // 25: ldc2_w 4803256649529338177
      // 28: invokestatic qeaa361f143ee4a0894bd168fd9b30c66/qf4ccf8f5435d4a78bdca4d6a018b578e/bbaba.bbb (IJ)I
      // 2b: aaload
      // 2c: invokestatic qeaa361f143ee4a0894bd168fd9b30c66/qf4ccf8f5435d4a78bdca4d6a018b578e/aabbaaaba.abba (Ljava/lang/String;)Ljava/lang/String;
      // 2f: invokevirtual com/google/gson/JsonObject.has (Ljava/lang/String;)Z
      // 32: ifeq a9
      // 35: goto 39
      // 38: athrow
      // 39: aload 1
      // 3a: getstatic qeaa361f143ee4a0894bd168fd9b30c66/qf4ccf8f5435d4a78bdca4d6a018b578e/bbaba.aaa [Ljava/lang/String;
      // 3d: goto 41
      // 40: athrow
      // 41: ldc_w -779608873
      // 44: ldc_w 952213449
      // 47: ldc_w 1254848679
      // 4a: ixor
      // 4b: invokestatic qeaa361f143ee4a0894bd168fd9b30c66/qf4ccf8f5435d4a78bdca4d6a018b578e/bbaba.a (II)I
      // 4e: ldc2_w 4803256649529338177
      // 51: invokestatic qeaa361f143ee4a0894bd168fd9b30c66/qf4ccf8f5435d4a78bdca4d6a018b578e/bbaba.bbb (IJ)I
      // 54: aaload
      // 55: invokestatic qeaa361f143ee4a0894bd168fd9b30c66/qf4ccf8f5435d4a78bdca4d6a018b578e/aabbaaaba.abba (Ljava/lang/String;)Ljava/lang/String;
      // 58: invokevirtual com/google/gson/JsonObject.getAsJsonObject (Ljava/lang/String;)Lcom/google/gson/JsonObject;
      // 5b: astore 3
      // 5c: iload 2
      // 5d: ifne ae
      // 60: aload 3
      // 61: ifnull a9
      // 64: goto 68
      // 67: athrow
      // 68: aload 3
      // 69: getstatic qeaa361f143ee4a0894bd168fd9b30c66/qf4ccf8f5435d4a78bdca4d6a018b578e/bbaba.aa Ljava/lang/String;
      // 6c: iload 2
      // 6d: ifne 8e
      // 70: goto 74
      // 73: athrow
      // 74: invokevirtual com/google/gson/JsonObject.has (Ljava/lang/String;)Z
      // 77: ifne a9
      // 7a: goto 7e
      // 7d: athrow
      // 7e: aload 3
      // 7f: iload 2
      // 80: ifne 99
      // 83: goto 87
      // 86: athrow
      // 87: getstatic qeaa361f143ee4a0894bd168fd9b30c66/qf4ccf8f5435d4a78bdca4d6a018b578e/bbaba.abb Ljava/lang/String;
      // 8a: goto 8e
      // 8d: athrow
      // 8e: invokevirtual com/google/gson/JsonObject.has (Ljava/lang/String;)Z
      // 91: ifeq a9
      // 94: aload 3
      // 95: goto 99
      // 98: athrow
      // 99: getstatic qeaa361f143ee4a0894bd168fd9b30c66/qf4ccf8f5435d4a78bdca4d6a018b578e/bbaba.aa Ljava/lang/String;
      // 9c: aload 3
      // 9d: getstatic qeaa361f143ee4a0894bd168fd9b30c66/qf4ccf8f5435d4a78bdca4d6a018b578e/bbaba.abb Ljava/lang/String;
      // a0: invokevirtual com/google/gson/JsonObject.get (Ljava/lang/String;)Lcom/google/gson/JsonElement;
      // a3: invokevirtual com/google/gson/JsonElement.deepCopy ()Lcom/google/gson/JsonElement;
      // a6: invokevirtual com/google/gson/JsonObject.add (Ljava/lang/String;Lcom/google/gson/JsonElement;)V
      // a9: aload 0
      // aa: aload 1
      // ab: invokespecial qeaa361f143ee4a0894bd168fd9b30c66/qf4ccf8f5435d4a78bdca4d6a018b578e/abbaabbaa.abbbab (Lcom/google/gson/JsonObject;)V
      // ae: return
   }

   private static int bbb(int var0, long var1) {
      int var3 = var0 ^ (int)(var1 & 32767L) ^ a(-779608872, -623272298 ^ -1773468651);
      if (ba[var3] == null) {
         ba[var3] = (int)(bb[var3] ^ var1);
      }

      return ba[var3];
   }

   private static long aaaa(int var0, long var1) {
      int var3 = (var0 ^ (int)var1 ^ a(-779608871, 1352057284 ^ -299571491)) & a(-779608870, 1352057284 ^ 823519069);
      if (aab[var3] == null) {
         aab[var3] = bba[var3] ^ var1;
      }

      return aab[var3];
   }

   // $VF: Irreducible bytecode was duplicated to produce valid code
   static {
      int var40 = 1182714581;
      String var30 = "䦇朠彋\uee67笱\uea18\uf4ca\udf83❏\uf3ed昵䌢䢵ⴵ貢販쎾♑帑㯗젿䚾䓫䎲屉㌭춳窅ځ捏\u0df1⢏騕퍁\udb1f㒕\ueb62ؑ鐂윔茷醙椘\ue41e\udffd썝\ud806ꘘꙃ쭾Ḿ\uf426ݫ汓뼈톌\uee72崻힒뗒⛎ネ\ueda3㯻兮㚤쥋뚃봅쏺䠾\uebde鷍韝낶鉳핲\ud886뮳\u2d7a뱇댶볯읥\uea1c멯쏥좨泜쁗臈婞ⴧ릝\ue04a䚞꒤䎅\ueec1쎫ׅ쟯恲紱뚂爼垻㷬歒⛴얂瑦쎆н\ufae3迩轥㴾籽䣪\uda25ᖚ⨙篓邜쎵蚠\ue910ԣ\uf22e쏗䄬䖸笅췋ഡ⒒炴ꕬ闙햼ꮂ攒ﰵ姳偩ꏗ\udbdf\udae0\uda99\udaab\uda55\uda37\uda9c\udae1\udafa\uda1d\uda6d\uda5e\uda11\uda74\udae9\udadc\uda97\udafe\uda26\udaf7\uda93\udad4\uda30\udadd\udab3\udaa7\udaf0\udaa3\udad5\udaef\udab3\udafc\uda80\uda59\uda58\uda5a\uda34\udaf8\uda38\uda1c\uda1d\uda9e\udae9\uda7b\udaf1\uda65\uda90\udae5\uda0d\uda79\uda5f\uda8b\uda67\uda8e\uda6f\udabe\uda40\uda1e\udad8\uda91\udadf\uda4f\uda6f\udaff\uda14\uda30\uda18\uda7f\uda20\uda17\uda29\uda37\udafb\udab1\udaa5\udab6\udabe\udad5\udabc\udade\uda07\uda7c\uda83\udabb\uda1b\uda32\uda20\uda9e\uda87\uda77\udab5\udac3\uda26\uda45\udaf9\uda50\uda63\udaed\uda2e\uda0c\uda43\uda48\uda2b\udade\uda0b\udaf2\udae9\uda3e\udabf\uda36\uda0c\uda79\udacc\udaf4\udab7\uda9f\udab7\uda6a\udad8\udafa\uda4d\uda67\udaf6\uda6e\uda02\uda9c\uda85\uda9c\uda20\uda2d\udac0\uda0f\udadc\uda1d\uda76\uda09\udaa9\uda09\udae5\uda7b\uda44\uda3e\udaa9\uda5b\udafd\uda6c\uda7d\uda45\udad4\uda0d\uda48\udac6\uda65\udaab\uda8a\uda85\udabf\uda6f\uda83\udad2\uda96\udad3\uda61\uda8e\udac4\uda2a\uda6a\uda61\udafc䵩䴕䴰䷓䶥䷹䷴䷗䴍䶇䮉䮭䬝䭖䮔䭶䮈䮓䯝䯒䭑䬾䬲䮲䭈䯾\uda72\uda0e\uda2b\udac8\udabe\udae2\udaef\udacc\uda16\uda9c襴褢觼褚襦褑覆褳襩褻規襖襬褭襔覻觠覹觹褧觎襭觿覃褲褹襈褂覐褬觌觿襤褬觊觼西襊襐覼觌襳褙襵觯触褰襲襅褔襮觅覠褽覾覡褋觅覉觔觺襙褽襓\ue6af\ue6d3\ue6f6\ue615\ue663\ue63f\ue632\ue611\ue6cb\ue641▁╩◐◡╄▼◩▭◒┴╀┩╰◖▟▾栂桾桛梸棎梒梟梼桦棬";
      short var29 = 489;
      char[] var31 = "\u0087\r¨\n\u0010\n@\n\u0010\n".toCharArray();
      byte var36 = -1;
      String[] var32 = new String[var31.length];

      while (true) {
         int var33 = 0;
         char var34 = 0;
         char var35 = '\u0000';
         if (var36 == 0) {
            aaaa = var32;
            aaab = new Object[var32.length];
            int var25 = 46857070;
            byte[] var23 = "sôÃ\bEtW³\u0002\u0012\u0002Úé=·2\u0090njÖp\u001f¸àÖæ§âÐå(¯\u009e#·Ý\u0090 \u0083i*\\Ç\u008e¢8\u0007¤kY¹\u0094\u0019\u0006p\u008aïtý¬òÎ`]ðÕ%\u0092\u0088\u009d)ªÇ×¹\u000eÃ\\Ì2Ö\u0007[¼XÓ\u001e\u0000Á)ò\u0007\u0012¦\u008f`Â\nmÍÂ×\u0086¨Ý)Qüfô©¸¨\t\u008fÈÝZñ¤x%'NK3î\r¬Ô\u0093ó\u0000\u0018Ñ\f\u0011:Ý\u0018û\u00196Ñªí<2`þØ\u000e dDé1M6¶Ýs\u001a\u0005\u0081Ajc\u0005©¦õ@Æ\u008eh\u0093æ\u001f·|P\u0003Ü(¬\u0006\u0011\u008d\f\u00ad t¶^^fêÍÇ\u0003\u0090\u0011\u0001\u009c1gN£©²Z'\u00990Ã(\r5\u001ei¼'b\r¹\f4.þ\u0006Û5È;ó\u0080\u0098:ê\u001aJf\u0096T»\u0090àD\u0011I\u0013\täe\u001dkä±f++*Ö\u008fÆzÈA0\u0019\u0088éáBñ:2Ë\u0006\u0085\u009fpÖe*)õ¦Ph@-\u0098¥VPzE«ªã¾²\t\u001e&Ì´nÕÁ$\f£¸0e\u0005×Ï\"$@)RU\u0014;\u0006+¶eóÛ8Q÷N\b)édrÊïéç±»!Ó\"¤+Â\u0083ÿ\u0091¥mØ\u0003\u000e\u0003 \u0005\u0019\u008bÆM\u0015|ü\u0080Å|£{a\n\u0007\rðµ}o\u007f¾Ã\u008c\f\u008a\u0087x¹ñùÛß±±Í\u001b\u009f\u000fú\u0089\u00967 \u008c¡Jg\u009c\u009fÒ\u0003¯mòØ\u0011²Ãí ê\u000bRbÇò'ocwW\u009e]MÑ\u0003LÃòj\u0015\ngc\u0002\u0088-\u0090 \u0015cJyX¬¿\u0004>\u009a>\u0099\u0085R`\u0007¸\u0080O\u008bp¢\u00107\u001d\u0082ý*J¿ç\u0005Ü\u0083Ú ÓnT½(\u009d\u008bØ\u0005ôXd\u0006Ä\rÄZ\u0012Ð\u0006ag\u001få0'\u001fiFt0Ý`\u00000\nô\u001fÖÁx\u001c>,E(tçÏ·\u0007°üüê¨\u009b]\u0005\u0007;\u009b6\u008eQ¹óÌ\u009bmë=ã9\u0011\u0089tÙ\u008d=Å\u00ad|\u001499Ò\r\u00adó#ÁÔ\u0086æ°\u0090øy\u0088¸\u000f\u001fÐ]ðë³2·Va\u001e×\u0017é6G«&é\u001ahÚôN¼ª~ÆÂ<ß\u0081gG-\u0099k¤?÷\u0017á0ª;\u0010@b\u001b\u0017¯ûF¥\u0004Î\u0092'/}#\u0017À¦Q\u000en\u001dÉÏ\u009bÂK\u001fg\u0005{Ç\u0099\u001c\u0089Ú\u009e(\u0016£°¿U\tìA/x\u000b®9»VëÌO\u0016ÈÌïÝ:\u001c³Þ\u0006«8¶i)ê#\u0080ùFµ!,ì\u001cgI<l\u0017\u0093²ÿ\u0016è\u0097ßÇ\u0089?®\u0001Ñ\u0093Ç\u0003ÚEÌÝ\u0016 4×÷\u009f°ÇÌ\u0006-îP%ãpk\u0080/\u0089\u0007É[Õ\f\u0006®LF\u0017¥Ý^\u0006\u0015\u000b\u001etùx\u0018\u009bû1\u009cÂ\u0094ö0\\N¢\u009c`\u0011m\u0096~ñ<w)I\t\u0003W\u0017·åÅ!\u00ad<¨;æ¤\u0082ÍÜuVm\\(¾ýP\tooà!4}7\u0016\u000e95¾ÕÛÌojÒ×º¢8\u008bá\u008fïÝ³\u001cgmû\u0018\u0093ýÀMDY\u008fU\u0081x\u0094ûÀpXÙ¾\u0004s¡wg\u0015Ã©\u009e]\u0081#à\u0080þæÁÖ/5--\u0010\u0088»»l,\u0087W\u009f@Î\u009cl\u0096\tâA\u0015ÿ,ôøP%Ügªxz\u0090»JÒ*g\u0081Óq½\u008bJ¸\u0087ZÒ;ä«?5P\u008bö3\u009dÏª\u0080~\u0088×cè\u008bèKÆ·ãÐ_HQÀÔ\u009fÜÂ¤\u008b8&ª\u001c¸é>í\u001f# t\u0088\u0016\u0087)Ò5\u0004\u0098\u001a\u000b×2\u0090\rÝJßI3´m\u0011ôka#9Èw\u0087¯¯¶RÁ\u0084/\u0092Y~V8]^Z\u0097\u001f`\u0005³]Öý½ÝðÉá.×ÿX\u0010´¹=\u009b1E9\u0002¶KÇÉ\u0010;\u009f\u0088\u0001W\u008c^X\u001f\u00965ÜÙZ\u001bJ]*y¶õ¥üÑ³ð¡gñ±_\u0014²EîÅ\u0012[ì\u001aõÆR»#³ÛGpgK«æ¸Ü«\u008aó\"8§îå\u001c\u001f\\\u009c\u0096å÷\u0086´r\f©ÄQ´(|\u009f}R¸¾¯ÛxÌ¹\u001c[Í\\²S\u0099¹W®êK\u0010t(ñ\u0098\u0012àìEÝwM\u0017âûÙª<í{\u0096\u0099b\u001aß\b\u0006\fÑa^6g(\u0001²\u001f\u008fo³PóÎPR\u0004c\u0096xv*G\t²[ªT»\u0018Ù\\\u0098VfÕ\u009béa\u0001à61u¦\u0018}2R¦§¼?¨C\u000f´\u0088 Ç*J·âR¸¶4X¨À\u008b\u008a\u001cg!\u008ee-æÀÉÍÜ\u001fy\u001e¡\u00ad·\u009e\u001b\u0004Î\u001b0Ëu·kà'ÿ\u0081¹,bb\u008a\u008a\u009fç=í@9èx\u009cÌ\u001a-þO%¦2B\rf2Oÿ\u0007\nÝÎ\"£É®)r\u00ada\u0080]÷JV\u0093jh\u0089Êô(b\tysÎÒèà¶\u0015[Ü\u0002ÆËÍ\u0093ÀÙ¶¢CªÈÆ`wÿ\u0012BtÔ¨ð\u0015m\u0095Ý\u001cì)ö\u0095Gßëþ £\u008c:\u0080¶\u009bü\u0004Â\u001cãM\u008b&û|VÚ\u009aÇ\u0085¼1\u001f65\ruj\u008bnuYd^KÌ\u000e\u0003[´N\u0001wJPp\u0088"
               .getBytes("ISO-8859-1");
            int var24 = var23.length / 4;
            bbb = new int[var24];
            byte var26 = 0;
            int var27 = 0;

            do {
               int var28 = (var23[var26] & 255) << 24 | (var23[var26 + 1] & 255) << 16 | (var23[var26 + 2] & 255) << 8 | var23[var26 + 3] & 255;
               var28 ^= var25;
               bbb[var27] = var28;
               var26 += 4;
            } while (++var27 < var24);

            String[] var21 = new String[a(-779608931, var40 ^ -378649926)];
            int var19 = 0;
            String var18;
            int var20 = (var18 = b(1468432030, var40 ^ 1459457128)).length();
            int var17 = a(-779608930, var40 ^ -1114487038);
            int var44 = -1;

            label140:
            while (true) {
               String var47 = var18.substring(++var44, var44 + var17);
               int var10001 = -1;

               while (true) {
                  char[] var75;
                  label135: {
                     char[] var56 = var47.toCharArray();
                     int var10003 = var56.length;
                     int var22 = 0;
                     var75 = var56;
                     var10001 = var10003;
                     char[] var91;
                     int var10004;
                     if (var10003 <= 1) {
                        var91 = var56;
                        var10004 = var22;
                     } else {
                        var75 = var56;
                        var10001 = var10003;
                        if (var10003 <= var22) {
                           break label135;
                        }

                        var91 = var56;
                        var10004 = var22;
                     }

                     while (true) {
                        var91[var10004] = (char)(var91[var10004] ^ switch (var22 % a(-779608959, var40 ^ -204174152)) {
                           case 0 -> a(-779608958, var40 ^ -1766961064);
                           case 1 -> 2;
                           case 2 -> a(-779608957, var40 ^ 151987751);
                           case 3 -> a(-779608956, var40 ^ 915927890);
                           case 4 -> a(-779608955, var40 ^ -1297649255);
                           case 5 -> a(-779608954, var40 ^ -1120701257);
                           default -> 2;
                        });
                        var22++;
                        if (var10001 == 0) {
                           var10004 = var10001;
                           var91 = var75;
                        } else {
                           if (var10001 <= var22) {
                              break;
                           }

                           var91 = var75;
                           var10004 = var22;
                        }
                     }
                  }

                  String var98 = new String(var75).intern();
                  switch (var10001) {
                     case 0:
                        var21[var19++] = var98;
                        if ((var44 += var17) >= var20) {
                           baa = var21;
                           bab = new String[a(-779608960, var40 ^ -511172827)];
                           long var8 = 1776898216459321066L;
                           long[] var14 = new long[a(-779608953, var40 ^ -58562965)];
                           int var11 = 0;
                           String var12;
                           int var13 = (var12 = b(1468432028, var40 ^ 1336526992)).length();
                           byte var10 = 0;

                           label114:
                           while (true) {
                              int var63 = var10;
                              var10 += 8;
                              var47 = var12.substring(var63, var10);
                              var63 = 1468432029;
                              int var81 = var40 ^ -660275752;
                              byte[] var15 = var47.getBytes("ISO-8859-1");
                              long[] var50 = var14;
                              var63 = var11++;
                              long var82 = (var15[0] & 255L) << a(-779608952, var40 ^ -1735963319)
                                 | (var15[1] & 255L) << a(-779608951, var40 ^ -1145026625)
                                 | (var15[2] & 255L) << a(-779608950, var40 ^ -1594459492)
                                 | (var15[3] & 255L) << a(-779608949, var40 ^ 363232188)
                                 | (var15[4] & 255L) << a(-779608948, var40 ^ -1888213105)
                                 | (var15[5] & 255L) << a(-779608947, var40 ^ -1048194592)
                                 | (var15[a(-779608946, var40 ^ -785446814)] & 255L) << a(-779608945, var40 ^ -1663425513)
                                 | var15[a(-779608848, var40 ^ -19206040)] & 255L;
                              byte var99 = -1;

                              while (true) {
                                 long var104 = var82 ^ var8;
                                 switch (var99) {
                                    case 0:
                                       var50[var63] = var104;
                                       if (var10 >= var13) {
                                          bb = var14;
                                          ba = new Integer[a(-779608838, var40 ^ -985398049)];
                                          long var0 = 2242916019598336821L;
                                          long[] var6 = new long[a(-779608837, var40 ^ 1071513522)];
                                          int var3 = 0;
                                          String var4;
                                          int var5 = (var4 = b(1468432024, var40 ^ 483975037)).length();
                                          byte var2 = 0;

                                          label104:
                                          while (true) {
                                             int var68 = var2;
                                             var2 += 8;
                                             var47 = var4.substring(var68, var2);
                                             var68 = 1468432025;
                                             int var85 = var40 ^ 1935840864;
                                             byte[] var7 = var47.getBytes("ISO-8859-1");
                                             long[] var53 = var6;
                                             var68 = var3++;
                                             long var86 = (var7[0] & 255L) << a(-779608836, var40 ^ -1675597883)
                                                | (var7[1] & 255L) << a(-779608835, var40 ^ 558929105)
                                                | (var7[2] & 255L) << a(-779608834, var40 ^ -1322065245)
                                                | (var7[3] & 255L) << a(-779608833, var40 ^ -1520745227)
                                                | (var7[4] & 255L) << a(-779608864, var40 ^ 1511810357)
                                                | (var7[5] & 255L) << a(-779608863, var40 ^ -1133767560)
                                                | (var7[a(-779608862, var40 ^ -1372034389)] & 255L) << a(-779608861, var40 ^ -254961058)
                                                | var7[a(-779608860, var40 ^ -993456366)] & 255L;
                                             byte var101 = -1;

                                             while (true) {
                                                var104 = var86 ^ var0;
                                                switch (var101) {
                                                   case 0:
                                                      var53[var68] = var104;
                                                      if (var2 >= var5) {
                                                         bba = var6;
                                                         aab = new Long[a(-779608850, var40 ^ -375571852)];
                                                         aaa = new String[bbb(a(-779608849, var40 ^ -1623633639), 5596239900804978673L)];
                                                         bb();
                                                         aa = aabbaaaba.abba(
                                                            aaa[bbb(a(-779608880, var40 ^ 541290747), 297039237139322034L)]
                                                         );
                                                         abb = aabbaaaba.abba(
                                                            aaa[bbb(a(-779608879, var40 ^ 738056757), 3848716059324128584L)]
                                                         );
                                                         return;
                                                      }
                                                      break;
                                                   default:
                                                      var53[var68] = var104;
                                                      if (var2 < var5) {
                                                         continue label104;
                                                      }

                                                      var5 = (var4 = b(1468432022, var40 ^ -1341529120)).length();
                                                      var2 = 0;
                                                }

                                                int var71 = var2;
                                                var2 += 8;
                                                var47 = var4.substring(var71, var2);
                                                var71 = 1468432023;
                                                int var88 = var40 ^ -36726560;
                                                var7 = var47.getBytes("ISO-8859-1");
                                                var53 = var6;
                                                var68 = var3++;
                                                var86 = (var7[0] & 255L) << a(-779608859, var40 ^ -1126750878)
                                                   | (var7[1] & 255L) << a(-779608858, var40 ^ 1607575788)
                                                   | (var7[2] & 255L) << a(-779608857, var40 ^ 612720849)
                                                   | (var7[3] & 255L) << a(-779608856, var40 ^ -1214616841)
                                                   | (var7[4] & 255L) << a(-779608855, var40 ^ 381800665)
                                                   | (var7[5] & 255L) << a(-779608854, var40 ^ -119127447)
                                                   | (var7[a(-779608853, var40 ^ -1768012787)] & 255L) << a(-779608852, var40 ^ 519572604)
                                                   | var7[a(-779608851, var40 ^ -373112362)] & 255L;
                                                var101 = 0;
                                             }
                                          }
                                       }
                                       break;
                                    default:
                                       var50[var63] = var104;
                                       if (var10 < var13) {
                                          continue label114;
                                       }

                                       var13 = (var12 = b(1468432026, var40 ^ -570176792)).length();
                                       var10 = 0;
                                 }

                                 int var66 = var10;
                                 var10 += 8;
                                 var47 = var12.substring(var66, var10);
                                 var66 = 1468432027;
                                 int var84 = var40 ^ 1337977958;
                                 var15 = var47.getBytes("ISO-8859-1");
                                 var50 = var14;
                                 var63 = var11++;
                                 var82 = (var15[0] & 255L) << a(-779608847, var40 ^ -1105892398)
                                    | (var15[1] & 255L) << a(-779608846, var40 ^ 452475863)
                                    | (var15[2] & 255L) << a(-779608845, var40 ^ -737257314)
                                    | (var15[3] & 255L) << a(-779608844, var40 ^ 2094990296)
                                    | (var15[4] & 255L) << a(-779608843, var40 ^ -1358132634)
                                    | (var15[5] & 255L) << a(-779608842, var40 ^ 278999469)
                                    | (var15[a(-779608841, var40 ^ -267097859)] & 255L) << a(-779608840, var40 ^ 862857533)
                                    | var15[a(-779608839, var40 ^ -1197022127)] & 255L;
                                 var99 = 0;
                              }
                           }
                        }

                        var17 = var18.charAt(var44);
                        break;
                     default:
                        var21[var19++] = var98;
                        if ((var44 += var17) < var20) {
                           var17 = var18.charAt(var44);
                           continue label140;
                        }

                        var20 = (var18 = b(1468432031, var40 ^ 1773504111)).length();
                        var17 = a(-779608929, var40 ^ 405990458);
                        var44 = -1;
                  }

                  var47 = var18.substring(++var44, var44 + var17);
                  var10001 = 0;
               }
            }
         }

         do {
            var35 = var31[var33];
            char[] var37 = var30.substring(var34, var34 + var35).toCharArray();
            int var38 = 0;

            do {
               short var39 = switch (var38 % 6) {
                  default -> 82;
                  case 1 -> 84;
                  case 2 -> 0;
                  case 3 -> 179;
                  case 4 -> 245;
                  case 5 -> 193;
               };
               var37[var38] = (char)(var37[var38] ^ var39 ^ var29);
            } while (++var38 < var37.length);

            var32[var33] = new String(var37).intern();
            var34 += var35;
         } while (++var33 < var31.length);

         var36 = 0;
      }
   }

   private static String b(int var0, int var1) {
      int var3 = var0 ^ 1468432030;
      char[] var4 = aaaa[var3].toCharArray();
      StackTraceElement[] var2 = (StackTraceElement[])aaab[var3];
      StackTraceElement[] var5;
      if (var2 != null) {
         var5 = var2;
      } else {
         var5 = new Throwable().getStackTrace();
         aaab[var3] = var5;
      }

      StackTraceElement var6 = var5[1];
      int var7 = (var6.getClassName().hashCode() ^ var6.getMethodName().hashCode()) >> 16 ^ 1024357689;
      int var8 = 0;

      do {
         var4[var8] = (char)(var4[var8] ^ switch (var8 & 31) {
            default -> 57;
            case 1 -> 89;
            case 2 -> 52;
            case 3 -> 6;
            case 4 -> 35;
            case 5 -> 75;
            case 6 -> 216;
            case 7 -> 241;
            case 8 -> 107;
            case 9 -> 78;
            case 10 -> 209;
            case 11 -> 148;
            case 12 -> 95;
            case 13 -> 18;
            case 14 -> 203;
            case 15 -> 208;
            case 16 -> 109;
            case 17 -> 70;
            case 18 -> 211;
            case 19 -> 76;
            case 20 -> 233;
            case 21 -> 131;
            case 22 -> 251;
            case 23 -> 102;
            case 24 -> 90;
            case 25 -> 232;
            case 26 -> 183;
            case 27 -> 160;
            case 28 -> 239;
            case 29 -> 98;
            case 30 -> 83;
            case 31 -> 176;
         } ^ var1 >> 16 ^ var7);
      } while (++var8 < var4.length);

      return new String(var4).intern();
   }

   private static String aaab(int var0, int var1) {
      int var9 = -802731055;
      int var2 = (var0 ^ a(-779608869, var9 ^ -378572601)) & a(-779608868, var9 ^ -996858111);
      if (bab[var2] == null) {
         char[] var3 = baa[var2].toCharArray();

         int var4 = switch (var3[0] & a(-779608867, var9 ^ 1611699953)) {
            case 0 -> a(-779608866, var9 ^ 1579815421);
            case 1 -> a(-779608865, var9 ^ 1336160989);
            case 2 -> a(-779608896, var9 ^ 376285162);
            case 3 -> a(-779608895, var9 ^ 32500940);
            case 4 -> a(-779608894, var9 ^ 594715565);
            case 5 -> a(-779608893, var9 ^ 2050976834);
            case 6 -> a(-779608892, var9 ^ 123296489);
            case 7 -> a(-779608891, var9 ^ -1696427342);
            case 8 -> a(-779608890, var9 ^ 81740006);
            case 9 -> a(-779608889, var9 ^ -2011733319);
            case 10 -> a(-779608888, var9 ^ 880427642);
            case 11 -> a(-779608887, var9 ^ 690847563);
            case 12 -> a(-779608886, var9 ^ 112935725);
            case 13 -> a(-779608885, var9 ^ 599043774);
            case 14 -> a(-779608884, var9 ^ -1102094923);
            case 15 -> a(-779608883, var9 ^ -614320927);
            case 16 -> a(-779608882, var9 ^ 1734411458);
            case 17 -> a(-779608881, var9 ^ -952249772);
            case 18 -> a(-779609040, var9 ^ 84321934);
            case 19 -> a(-779609039, var9 ^ -430446843);
            case 20 -> a(-779609038, var9 ^ 1780593901);
            case 21 -> a(-779609037, var9 ^ -569917218);
            case 22 -> a(-779609036, var9 ^ 160686050);
            case 23 -> a(-779609035, var9 ^ -1038099035);
            case 24 -> a(-779609034, var9 ^ 790816979);
            case 25 -> a(-779609033, var9 ^ -458721449);
            case 26 -> a(-779609032, var9 ^ -1281672038);
            case 27 -> a(-779609031, var9 ^ -1409507872);
            case 28 -> a(-779609030, var9 ^ 73161404);
            case 29 -> a(-779609029, var9 ^ -1925810089);
            case 30 -> a(-779609028, var9 ^ -805523989);
            case 31 -> a(-779609027, var9 ^ 1048902052);
            case 32 -> a(-779609026, var9 ^ -1978459671);
            case 33 -> a(-779609025, var9 ^ 1050832313);
            case 34 -> a(-779609056, var9 ^ 392100122);
            case 35 -> a(-779609055, var9 ^ 248132587);
            case 36 -> a(-779609054, var9 ^ -1028438476);
            case 37 -> a(-779609053, var9 ^ -1275643406);
            case 38 -> a(-779609052, var9 ^ -1948266639);
            case 39 -> a(-779609051, var9 ^ -751161302);
            case 40 -> a(-779609050, var9 ^ -1336576098);
            case 41 -> a(-779609049, var9 ^ 1652102995);
            case 42 -> a(-779609048, var9 ^ -363755616);
            case 43 -> a(-779609047, var9 ^ 630119414);
            case 44 -> a(-779609046, var9 ^ -644641194);
            case 45 -> a(-779609045, var9 ^ -1457977674);
            case 46 -> a(-779609044, var9 ^ 1069040052);
            case 47 -> a(-779609043, var9 ^ 1145723242);
            case 48 -> a(-779609042, var9 ^ -1487390902);
            case 49 -> a(-779609041, var9 ^ -497587676);
            case 50 -> a(-779609072, var9 ^ 321364620);
            case 51 -> a(-779609071, var9 ^ 348666611);
            case 52 -> a(-779609070, var9 ^ -1503457675);
            case 53 -> a(-779609069, var9 ^ 608746860);
            case 54 -> a(-779609068, var9 ^ 346515081);
            case 55 -> a(-779609067, var9 ^ 218750413);
            case 56 -> a(-779609066, var9 ^ -855899492);
            case 57 -> a(-779609065, var9 ^ 469812464);
            case 58 -> a(-779609064, var9 ^ -989930298);
            case 59 -> a(-779609063, var9 ^ -637933529);
            case 60 -> 5;
            case 61 -> a(-779609062, var9 ^ -1596489933);
            case 62 -> a(-779609061, var9 ^ 176914868);
            case 63 -> a(-779609060, var9 ^ 2070703788);
            case 64 -> a(-779609059, var9 ^ -1204737140);
            case 65 -> 1;
            case 66 -> a(-779609058, var9 ^ 1282476040);
            case 67 -> a(-779609057, var9 ^ -323290192);
            case 68 -> a(-779609088, var9 ^ -1330002178);
            case 69 -> a(-779609087, var9 ^ 1003596080);
            case 70 -> a(-779609086, var9 ^ -381402979);
            case 71 -> a(-779609085, var9 ^ 1171448293);
            case 72 -> a(-779609084, var9 ^ -277108922);
            case 73 -> a(-779609083, var9 ^ 1057740647);
            case 74 -> a(-779609082, var9 ^ -1315383795);
            case 75 -> a(-779609081, var9 ^ -1799878709);
            case 76 -> a(-779609080, var9 ^ 1019855284);
            case 77 -> a(-779609079, var9 ^ -1868512303);
            case 78 -> a(-779609078, var9 ^ 1185619418);
            case 79 -> a(-779609077, var9 ^ 592648120);
            case 80 -> a(-779609076, var9 ^ -1663629499);
            case 81 -> a(-779609075, var9 ^ 88747674);
            case 82 -> a(-779609074, var9 ^ 646230110);
            case 83 -> a(-779609073, var9 ^ -2092414646);
            case 84 -> a(-779608976, var9 ^ -902032014);
            case 85 -> a(-779608975, var9 ^ 97094900);
            case 86 -> a(-779608974, var9 ^ 348265611);
            case 87 -> a(-779608973, var9 ^ 91409187);
            case 88 -> a(-779608972, var9 ^ 2006890501);
            case 89 -> a(-779608971, var9 ^ -1734545339);
            case 90 -> a(-779608970, var9 ^ -1041025454);
            case 91 -> a(-779608969, var9 ^ 1596547964);
            case 92 -> a(-779608968, var9 ^ 1668721958);
            case 93 -> a(-779608967, var9 ^ 2107047349);
            case 94 -> a(-779608966, var9 ^ 707709339);
            case 95 -> a(-779608965, var9 ^ 1416656727);
            case 96 -> a(-779608964, var9 ^ -968462934);
            case 97 -> a(-779608963, var9 ^ -1420024122);
            case 98 -> a(-779608962, var9 ^ -2119558110);
            case 99 -> a(-779608961, var9 ^ 1426758796);
            case 100 -> a(-779608992, var9 ^ -1113943918);
            case 101 -> a(-779608991, var9 ^ 1812471821);
            case 102 -> a(-779608990, var9 ^ 924514063);
            case 103 -> a(-779608989, var9 ^ 224327066);
            case 104 -> a(-779608988, var9 ^ -692318815);
            case 105 -> a(-779608987, var9 ^ 1773475646);
            case 106 -> a(-779608986, var9 ^ -1587590387);
            case 107 -> a(-779608985, var9 ^ -1937236567);
            case 108 -> a(-779608984, var9 ^ 520137733);
            case 109 -> a(-779608983, var9 ^ 468991472);
            case 110 -> a(-779608982, var9 ^ 1310955584);
            case 111 -> a(-779608981, var9 ^ 1457961163);
            case 112 -> a(-779608980, var9 ^ -123228082);
            case 113 -> a(-779608979, var9 ^ -623262331);
            case 114 -> a(-779608978, var9 ^ -1575966849);
            case 115 -> a(-779608977, var9 ^ -1060217282);
            case 116 -> a(-779609008, var9 ^ -2109464572);
            case 117 -> a(-779609007, var9 ^ -41877455);
            case 118 -> a(-779609006, var9 ^ 743632382);
            case 119 -> a(-779609005, var9 ^ 334461530);
            case 120 -> a(-779609004, var9 ^ 1867204281);
            case 121 -> a(-779609003, var9 ^ -1675162082);
            case 122 -> a(-779609002, var9 ^ 1878116820);
            case 123 -> a(-779609001, var9 ^ 1114783449);
            case 124 -> a(-779609000, var9 ^ -140537617);
            case 125 -> a(-779608999, var9 ^ -553620905);
            case 126 -> a(-779608998, var9 ^ 2046262113);
            case 127 -> a(-779608997, var9 ^ -783440284);
            case 128 -> a(-779608996, var9 ^ -803832510);
            case 129 -> a(-779608995, var9 ^ 1239369383);
            case 130 -> a(-779608994, var9 ^ -782490282);
            case 131 -> a(-779608993, var9 ^ 1012044141);
            case 132 -> a(-779609024, var9 ^ -179020455);
            case 133 -> a(-779609023, var9 ^ -1444429956);
            case 134 -> a(-779609022, var9 ^ -737924882);
            case 135 -> a(-779609021, var9 ^ -349436304);
            case 136 -> a(-779609020, var9 ^ -524837024);
            case 137 -> a(-779609019, var9 ^ 1386681348);
            case 138 -> a(-779609018, var9 ^ -542808929);
            case 139 -> a(-779609017, var9 ^ 994142879);
            case 140 -> a(-779609016, var9 ^ -1148256487);
            case 141 -> a(-779609015, var9 ^ 474275855);
            case 142 -> a(-779609014, var9 ^ -1955510291);
            case 143 -> a(-779609013, var9 ^ -783104929);
            case 144 -> a(-779609012, var9 ^ 426514244);
            case 145 -> a(-779609011, var9 ^ -1821762205);
            case 146 -> a(-779609010, var9 ^ -600902890);
            case 147 -> a(-779609009, var9 ^ 1853240378);
            case 148 -> a(-779608656, var9 ^ 1648687189);
            case 149 -> a(-779608655, var9 ^ 1960865407);
            case 150 -> a(-779608654, var9 ^ -1254817696);
            case 151 -> a(-779608653, var9 ^ 754292915);
            case 152 -> a(-779608652, var9 ^ 1432329223);
            case 153 -> a(-779608651, var9 ^ 1508957932);
            case 154 -> a(-779608650, var9 ^ 114597040);
            case 155 -> a(-779608649, var9 ^ -19259943);
            case 156 -> a(-779608648, var9 ^ -897126551);
            case 157 -> a(-779608647, var9 ^ -62926382);
            case 158 -> a(-779608646, var9 ^ -1168483836);
            case 159 -> a(-779608645, var9 ^ 1180615446);
            case 160 -> a(-779608644, var9 ^ 1218447402);
            case 161 -> a(-779608643, var9 ^ 955795464);
            case 162 -> a(-779608642, var9 ^ 1424727967);
            case 163 -> a(-779608641, var9 ^ 485618765);
            case 164 -> a(-779608672, var9 ^ -633480381);
            case 165 -> a(-779608671, var9 ^ 1582151874);
            case 166 -> a(-779608670, var9 ^ -155042583);
            case 167 -> a(-779608669, var9 ^ -1332256734);
            case 168 -> a(-779608668, var9 ^ -220815745);
            case 169 -> a(-779608667, var9 ^ -1323159694);
            case 170 -> a(-779608666, var9 ^ 289156461);
            case 171 -> a(-779608665, var9 ^ -157183156);
            case 172 -> a(-779608664, var9 ^ 550771415);
            case 173 -> a(-779608663, var9 ^ 1929415206);
            case 174 -> a(-779608662, var9 ^ -438362872);
            case 175 -> a(-779608661, var9 ^ -1986731070);
            case 176 -> a(-779608660, var9 ^ -1534515946);
            case 177 -> a(-779608659, var9 ^ 473652700);
            case 178 -> a(-779608658, var9 ^ -426752253);
            case 179 -> a(-779608657, var9 ^ 1902864639);
            case 180 -> a(-779608688, var9 ^ 1389619651);
            case 181 -> a(-779608687, var9 ^ -1675979931);
            case 182 -> a(-779608686, var9 ^ -1110959379);
            case 183 -> a(-779608685, var9 ^ -807477825);
            case 184 -> a(-779608684, var9 ^ -834964511);
            case 185 -> a(-779608683, var9 ^ -1696688560);
            case 186 -> a(-779608682, var9 ^ -382939046);
            case 187 -> a(-779608681, var9 ^ 731273268);
            case 188 -> a(-779608680, var9 ^ -477395852);
            case 189 -> a(-779608679, var9 ^ 1948964411);
            case 190 -> a(-779608678, var9 ^ -121738689);
            case 191 -> a(-779608677, var9 ^ -300132480);
            case 192 -> a(-779608676, var9 ^ 1635589868);
            case 193 -> a(-779608675, var9 ^ 90902692);
            case 194 -> a(-779608674, var9 ^ 1565632111);
            case 195 -> a(-779608673, var9 ^ 47570587);
            case 196 -> a(-779608704, var9 ^ 1825870204);
            case 197 -> a(-779608703, var9 ^ -851995695);
            case 198 -> a(-779608702, var9 ^ 1626454526);
            case 199 -> a(-779608701, var9 ^ 690014426);
            case 200 -> a(-779608700, var9 ^ 1489868106);
            case 201 -> a(-779608699, var9 ^ 465476898);
            case 202 -> a(-779608698, var9 ^ 1426134094);
            case 203 -> a(-779608697, var9 ^ -368656231);
            case 204 -> a(-779608696, var9 ^ 894874830);
            case 205 -> a(-779608695, var9 ^ 454751109);
            case 206 -> a(-779608694, var9 ^ -1514111542);
            case 207 -> a(-779608693, var9 ^ -1423651150);
            case 208 -> a(-779608692, var9 ^ -1958279613);
            case 209 -> a(-779608691, var9 ^ 1238377236);
            case 210 -> a(-779608690, var9 ^ -1143867980);
            case 211 -> 3;
            case 212 -> a(-779608689, var9 ^ -1415099474);
            case 213 -> a(-779608592, var9 ^ 520151277);
            case 214 -> a(-779608591, var9 ^ 1716135682);
            case 215 -> a(-779608590, var9 ^ -894820873);
            case 216 -> a(-779608589, var9 ^ 2054774940);
            case 217 -> a(-779608588, var9 ^ -1258694141);
            case 218 -> a(-779608587, var9 ^ -847449828);
            case 219 -> a(-779608586, var9 ^ 1993386583);
            case 220 -> a(-779608585, var9 ^ 613957726);
            case 221 -> a(-779608584, var9 ^ 788898609);
            case 222 -> a(-779608583, var9 ^ -1980226000);
            case 223 -> a(-779608582, var9 ^ -299370102);
            case 224 -> a(-779608581, var9 ^ 2080050468);
            case 225 -> 0;
            case 226 -> a(-779608580, var9 ^ 781815307);
            case 227 -> a(-779608579, var9 ^ -1521122331);
            case 228 -> a(-779608578, var9 ^ 1700105938);
            case 229 -> a(-779608577, var9 ^ 74259483);
            case 230 -> a(-779608608, var9 ^ 566495454);
            case 231 -> a(-779608607, var9 ^ 706047126);
            case 232 -> a(-779608606, var9 ^ -2093336825);
            case 233 -> a(-779608605, var9 ^ 1442098062);
            case 234 -> a(-779608604, var9 ^ -1968360026);
            case 235 -> a(-779608603, var9 ^ 1634646037);
            case 236 -> a(-779608602, var9 ^ -843765440);
            case 237 -> a(-779608601, var9 ^ -1250780445);
            case 238 -> 4;
            case 239 -> a(-779608600, var9 ^ 27331112);
            case 240 -> a(-779608599, var9 ^ -1868097054);
            case 241 -> a(-779608598, var9 ^ -1591448945);
            case 242 -> a(-779608597, var9 ^ -989350367);
            case 243 -> a(-779608596, var9 ^ 287683876);
            case 244 -> a(-779608595, var9 ^ -1416113074);
            case 245 -> a(-779608594, var9 ^ -1766138623);
            case 246 -> a(-779608593, var9 ^ 714167455);
            case 247 -> a(-779608624, var9 ^ -594788360);
            case 248 -> a(-779608623, var9 ^ -1595147510);
            case 249 -> 2;
            case 250 -> a(-779608622, var9 ^ -1241760485);
            case 251 -> a(-779608621, var9 ^ -1048894738);
            case 252 -> a(-779608620, var9 ^ -2008991051);
            case 253 -> a(-779608619, var9 ^ 1438472996);
            case 254 -> a(-779608618, var9 ^ -2032406154);
            default -> a(-779608617, var9 ^ 894618832);
         };
         int var5 = (var1 & a(-779608616, var9 ^ 1777118751)) - var4;
         if (var5 < 0) {
            var5 += 256;
         }

         int var6 = ((var1 & a(-779608615, var9 ^ 1510170400)) >>> a(-779608614, var9 ^ -815152640)) - var4;
         if (var6 < 0) {
            var6 += 256;
         }

         for (int var7 = 0; var7 < var3.length; var7++) {
            int var8 = var7 % 2;
            char var10002 = var3[var7];
            if (var8 == 0) {
               var3[var7] = (char)(var10002 ^ var5);
               var5 = ((var5 >>> 3 | var5 << 5) ^ var3[var7]) & a(-779608613, var9 ^ -1222000354);
            } else {
               var3[var7] = (char)(var10002 ^ var6);
               var6 = ((var6 >>> 3 | var6 << 5) ^ var3[var7]) & a(-779608612, var9 ^ 1228386534);
            }
         }

         bab[var2] = new String(var3).intern();
      }

      return bab[var2];
   }
}
