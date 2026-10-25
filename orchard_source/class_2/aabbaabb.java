package nsc;

import java.util.IdentityHashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Set;
import net.fabricmc.api.EnvType;
import net.fabricmc.api.Environment;
import net.minecraft.class_304;
import net.minecraft.class_310;
import net.minecraft.class_315;
import net.minecraft.class_744;
import net.minecraft.class_3675.class_306;

@Environment(EnvType.CLIENT)
public final class aabbaabb {
   private final Map aa;
   private static final aabbaabb ab = new aabbaabb();
   private final Map a = new IdentityHashMap();

   public boolean aa(class_306 param1) {
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
      // 05: invokestatic qeaa361f143ee4a0894bd168fd9b30c66/qf4ccf8f5435d4a78bdca4d6a018b578e/aabbabbbb.bbaaaaa (Lnet/minecraft/class_3675$class_306;)Z
      // 08: iload 2
      // 09: ifne 14
      // 0c: ifeq 15
      // 0f: goto 13
      // 12: athrow
      // 13: bipush 0
      // 14: ireturn
      // 15: aload 0
      // 16: getfield qeaa361f143ee4a0894bd168fd9b30c66/qf4ccf8f5435d4a78bdca4d6a018b578e/aabbaabb.a Ljava/util/Map;
      // 19: invokeinterface java/util/Map.keySet ()Ljava/util/Set; 1
      // 1e: invokeinterface java/util/Set.iterator ()Ljava/util/Iterator; 1
      // 23: astore 3
      // 24: aload 3
      // 25: invokeinterface java/util/Iterator.hasNext ()Z 1
      // 2a: ifeq 5a
      // 2d: aload 3
      // 2e: invokeinterface java/util/Iterator.next ()Ljava/lang/Object; 1
      // 33: checkcast net/minecraft/class_304
      // 36: astore 4
      // 38: aload 1
      // 39: aload 4
      // 3b: invokestatic qeaa361f143ee4a0894bd168fd9b30c66/qf4ccf8f5435d4a78bdca4d6a018b578e/aabbabbbb.abbaabb (Lnet/minecraft/class_304;)Lnet/minecraft/class_3675$class_306;
      // 3e: invokevirtual net/minecraft/class_3675$class_306.equals (Ljava/lang/Object;)Z
      // 41: iload 2
      // 42: ifne 5b
      // 45: iload 2
      // 46: ifne 55
      // 49: goto 4d
      // 4c: athrow
      // 4d: ifeq 56
      // 50: goto 54
      // 53: athrow
      // 54: bipush 1
      // 55: ireturn
      // 56: iload 2
      // 57: ifeq 24
      // 5a: bipush 0
      // 5b: ireturn
   }

   public aabbaabb() {
      this.aa = new IdentityHashMap();
   }

   public boolean ab(class_310 param1, class_304 param2) {
      // $VF: Couldn't be decompiled
      // Please report this to the Vineflower issue tracker, at https://github.com/Vineflower/vineflower/issues with a copy of the class file (if you have the rights to distribute it!)
      // java.lang.RuntimeException: parsing failure!
      //   at org.jetbrains.java.decompiler.modules.decompiler.decompose.DomHelper.parseGraph(DomHelper.java:211)
      //   at org.jetbrains.java.decompiler.main.rels.MethodProcessor.codeToJava(MethodProcessor.java:166)
      //
      // Bytecode:
      // 00: getstatic qeaa361f143ee4a0894bd168fd9b30c66/qf4ccf8f5435d4a78bdca4d6a018b578e/aabbabbab.ab I
      // 03: istore 3
      // 04: aload 2
      // 05: iload 3
      // 06: ifne 1d
      // 09: ifnonnull 13
      // 0c: goto 10
      // 0f: athrow
      // 10: bipush 0
      // 11: ireturn
      // 12: athrow
      // 13: aload 0
      // 14: getfield qeaa361f143ee4a0894bd168fd9b30c66/qf4ccf8f5435d4a78bdca4d6a018b578e/aabbaabb.a Ljava/util/Map;
      // 17: aload 2
      // 18: invokeinterface java/util/Map.get (Ljava/lang/Object;)Ljava/lang/Object; 2
      // 1d: checkcast java/util/Map
      // 20: astore 4
      // 22: aload 4
      // 24: iload 3
      // 25: ifne 31
      // 28: ifnull 41
      // 2b: goto 2f
      // 2e: athrow
      // 2f: aload 4
      // 31: iload 3
      // 32: ifne 4c
      // 35: invokeinterface java/util/Map.isEmpty ()Z 1
      // 3a: ifeq 4a
      // 3d: goto 41
      // 40: athrow
      // 41: aload 1
      // 42: aload 2
      // 43: invokestatic qeaa361f143ee4a0894bd168fd9b30c66/qf4ccf8f5435d4a78bdca4d6a018b578e/aabbabbbb.aaab (Lnet/minecraft/class_310;Lnet/minecraft/class_304;)Z
      // 46: goto 4f
      // 49: athrow
      // 4a: aload 4
      // 4c: invokestatic qeaa361f143ee4a0894bd168fd9b30c66/qf4ccf8f5435d4a78bdca4d6a018b578e/aabbaabb.aaab (Ljava/util/Map;)Z
      // 4f: ireturn
   }

   public void ba(Object param1, class_310 param2, class_304 param3, boolean param4) {
      // $VF: Couldn't be decompiled
      // Please report this to the Vineflower issue tracker, at https://github.com/Vineflower/vineflower/issues with a copy of the class file (if you have the rights to distribute it!)
      // java.lang.RuntimeException: parsing failure!
      //   at org.jetbrains.java.decompiler.modules.decompiler.decompose.DomHelper.parseGraph(DomHelper.java:211)
      //   at org.jetbrains.java.decompiler.main.rels.MethodProcessor.codeToJava(MethodProcessor.java:166)
      //
      // Bytecode:
      // 00: getstatic qeaa361f143ee4a0894bd168fd9b30c66/qf4ccf8f5435d4a78bdca4d6a018b578e/aabbabbab.ab I
      // 03: istore 5
      // 05: aload 1
      // 06: ifnull 11
      // 09: aload 3
      // 0a: ifnonnull 13
      // 0d: goto 11
      // 10: athrow
      // 11: return
      // 12: athrow
      // 13: aload 2
      // 14: iload 5
      // 16: ifne 3b
      // 19: invokestatic qeaa361f143ee4a0894bd168fd9b30c66/qf4ccf8f5435d4a78bdca4d6a018b578e/aabbaabb.aab (Lnet/minecraft/class_310;)Z
      // 1c: ifne 2c
      // 1f: goto 23
      // 22: athrow
      // 23: aload 0
      // 24: aload 1
      // 25: aload 2
      // 26: aload 3
      // 27: invokevirtual qeaa361f143ee4a0894bd168fd9b30c66/qf4ccf8f5435d4a78bdca4d6a018b578e/aabbaabb.aba (Ljava/lang/Object;Lnet/minecraft/class_310;Lnet/minecraft/class_304;)V
      // 2a: return
      // 2b: athrow
      // 2c: aload 0
      // 2d: getfield qeaa361f143ee4a0894bd168fd9b30c66/qf4ccf8f5435d4a78bdca4d6a018b578e/aabbaabb.a Ljava/util/Map;
      // 30: aload 3
      // 31: invokedynamic apply ()Ljava/util/function/Function; bsm=java/lang/invoke/LambdaMetafactory.metafactory (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;Ljava/lang/invoke/MethodType;Ljava/lang/invoke/MethodHandle;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[ (Ljava/lang/Object;)Ljava/lang/Object;, qeaa361f143ee4a0894bd168fd9b30c66/qf4ccf8f5435d4a78bdca4d6a018b578e/aabbaabb.aaaa (Lnet/minecraft/class_304;)Ljava/util/Map;, (Lnet/minecraft/class_304;)Ljava/util/Map; ]
      // 36: invokeinterface java/util/Map.computeIfAbsent (Ljava/lang/Object;Ljava/util/function/Function;)Ljava/lang/Object; 3
      // 3b: checkcast java/util/Map
      // 3e: astore 6
      // 40: aload 6
      // 42: iload 5
      // 44: ifne 5e
      // 47: invokeinterface java/util/Map.isEmpty ()Z 1
      // 4c: ifeq 5c
      // 4f: goto 53
      // 52: athrow
      // 53: aload 2
      // 54: aload 3
      // 55: invokestatic qeaa361f143ee4a0894bd168fd9b30c66/qf4ccf8f5435d4a78bdca4d6a018b578e/aabbabbbb.aaab (Lnet/minecraft/class_310;Lnet/minecraft/class_304;)Z
      // 58: goto 61
      // 5b: athrow
      // 5c: aload 6
      // 5e: invokestatic qeaa361f143ee4a0894bd168fd9b30c66/qf4ccf8f5435d4a78bdca4d6a018b578e/aabbaabb.aaab (Ljava/util/Map;)Z
      // 61: istore 7
      // 63: iload 5
      // 65: ifne 98
      // 68: aload 6
      // 6a: invokeinterface java/util/Map.isEmpty ()Z 1
      // 6f: ifeq 8a
      // 72: goto 76
      // 75: athrow
      // 76: aload 0
      // 77: getfield qeaa361f143ee4a0894bd168fd9b30c66/qf4ccf8f5435d4a78bdca4d6a018b578e/aabbaabb.aa Ljava/util/Map;
      // 7a: aload 3
      // 7b: iload 7
      // 7d: invokestatic java/lang/Boolean.valueOf (Z)Ljava/lang/Boolean;
      // 80: invokeinterface java/util/Map.put (Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object; 3
      // 85: pop
      // 86: goto 8a
      // 89: athrow
      // 8a: aload 6
      // 8c: aload 1
      // 8d: iload 4
      // 8f: invokestatic java/lang/Boolean.valueOf (Z)Ljava/lang/Boolean;
      // 92: invokeinterface java/util/Map.put (Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object; 3
      // 97: pop
      // 98: aload 6
      // 9a: invokestatic qeaa361f143ee4a0894bd168fd9b30c66/qf4ccf8f5435d4a78bdca4d6a018b578e/aabbaabb.aaab (Ljava/util/Map;)Z
      // 9d: istore 8
      // 9f: aload 0
      // a0: aload 3
      // a1: iload 8
      // a3: iload 7
      // a5: iload 5
      // a7: ifne b3
      // aa: ifne c3
      // ad: goto b1
      // b0: athrow
      // b1: iload 8
      // b3: iload 5
      // b5: ifne c0
      // b8: ifeq c3
      // bb: goto bf
      // be: athrow
      // bf: bipush 1
      // c0: goto c4
      // c3: bipush 0
      // c4: invokevirtual qeaa361f143ee4a0894bd168fd9b30c66/qf4ccf8f5435d4a78bdca4d6a018b578e/aabbaabb.aaa (Lnet/minecraft/class_304;ZZ)V
      // c7: return
   }

   private boolean bb(class_304 param1, boolean param2) {
      // $VF: Couldn't be decompiled
      // Please report this to the Vineflower issue tracker, at https://github.com/Vineflower/vineflower/issues with a copy of the class file (if you have the rights to distribute it!)
      // java.lang.RuntimeException: parsing failure!
      //   at org.jetbrains.java.decompiler.modules.decompiler.decompose.DomHelper.parseGraph(DomHelper.java:211)
      //   at org.jetbrains.java.decompiler.main.rels.MethodProcessor.codeToJava(MethodProcessor.java:166)
      //
      // Bytecode:
      // 00: getstatic qeaa361f143ee4a0894bd168fd9b30c66/qf4ccf8f5435d4a78bdca4d6a018b578e/aabbabbab.ab I
      // 03: aload 0
      // 04: getfield qeaa361f143ee4a0894bd168fd9b30c66/qf4ccf8f5435d4a78bdca4d6a018b578e/aabbaabb.a Ljava/util/Map;
      // 07: aload 1
      // 08: invokeinterface java/util/Map.get (Ljava/lang/Object;)Ljava/lang/Object; 2
      // 0d: checkcast java/util/Map
      // 10: astore 4
      // 12: istore 3
      // 13: aload 4
      // 15: iload 3
      // 16: ifne 22
      // 19: ifnull 32
      // 1c: goto 20
      // 1f: athrow
      // 20: aload 4
      // 22: iload 3
      // 23: ifne 39
      // 26: invokeinterface java/util/Map.isEmpty ()Z 1
      // 2b: ifeq 37
      // 2e: goto 32
      // 31: athrow
      // 32: iload 2
      // 33: goto 3c
      // 36: athrow
      // 37: aload 4
      // 39: invokestatic qeaa361f143ee4a0894bd168fd9b30c66/qf4ccf8f5435d4a78bdca4d6a018b578e/aabbaabb.aaab (Ljava/util/Map;)Z
      // 3c: ireturn
   }

   private void aaa(class_304 param1, boolean param2, boolean param3) {
      // $VF: Couldn't be decompiled
      // Please report this to the Vineflower issue tracker, at https://github.com/Vineflower/vineflower/issues with a copy of the class file (if you have the rights to distribute it!)
      // java.lang.RuntimeException: parsing failure!
      //   at org.jetbrains.java.decompiler.modules.decompiler.decompose.DomHelper.parseGraph(DomHelper.java:211)
      //   at org.jetbrains.java.decompiler.main.rels.MethodProcessor.codeToJava(MethodProcessor.java:166)
      //
      // Bytecode:
      // 00: aload 1
      // 01: iload 2
      // 02: invokevirtual net/minecraft/class_304.method_23481 (Z)V
      // 05: getstatic qeaa361f143ee4a0894bd168fd9b30c66/qf4ccf8f5435d4a78bdca4d6a018b578e/aabbabbab.ab I
      // 08: aload 1
      // 09: invokestatic qeaa361f143ee4a0894bd168fd9b30c66/qf4ccf8f5435d4a78bdca4d6a018b578e/aabbabbbb.abbaabb (Lnet/minecraft/class_304;)Lnet/minecraft/class_3675$class_306;
      // 0c: astore 5
      // 0e: istore 4
      // 10: aload 5
      // 12: iload 4
      // 14: ifne 27
      // 17: invokestatic qeaa361f143ee4a0894bd168fd9b30c66/qf4ccf8f5435d4a78bdca4d6a018b578e/aabbabbbb.bbaaaaa (Lnet/minecraft/class_3675$class_306;)Z
      // 1a: ifne 41
      // 1d: goto 21
      // 20: athrow
      // 21: aload 5
      // 23: goto 27
      // 26: athrow
      // 27: iload 4
      // 29: ifne 3e
      // 2c: iload 2
      // 2d: invokestatic net/minecraft/class_304.method_1416 (Lnet/minecraft/class_3675$class_306;Z)V
      // 30: iload 3
      // 31: ifeq 41
      // 34: goto 38
      // 37: athrow
      // 38: aload 5
      // 3a: goto 3e
      // 3d: athrow
      // 3e: invokestatic net/minecraft/class_304.method_1420 (Lnet/minecraft/class_3675$class_306;)V
      // 41: return
   }

   private static boolean aab(class_310 param0) {
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
      // 06: ifne 11
      // 09: ifnull 45
      // 0c: goto 10
      // 0f: athrow
      // 10: aload 0
      // 11: iload 1
      // 12: ifne 28
      // 15: getfield net/minecraft/class_310.field_1755 Lnet/minecraft/class_437;
      // 18: ifnonnull 45
      // 1b: goto 1f
      // 1e: athrow
      // 1f: aload 0
      // 20: iload 1
      // 21: ifne 33
      // 24: goto 28
      // 27: athrow
      // 28: invokevirtual net/minecraft/class_310.method_22683 ()Lnet/minecraft/class_1041;
      // 2b: ifnull 45
      // 2e: aload 0
      // 2f: goto 33
      // 32: athrow
      // 33: invokevirtual net/minecraft/class_310.method_1569 ()Z
      // 36: iload 1
      // 37: ifne 42
      // 3a: ifeq 45
      // 3d: goto 41
      // 40: athrow
      // 41: bipush 1
      // 42: goto 46
      // 45: bipush 0
      // 46: ireturn
   }

   private void aba(Object param1, class_310 param2, class_304 param3) {
      // $VF: Couldn't be decompiled
      // Please report this to the Vineflower issue tracker, at https://github.com/Vineflower/vineflower/issues with a copy of the class file (if you have the rights to distribute it!)
      // java.lang.RuntimeException: parsing failure!
      //   at org.jetbrains.java.decompiler.modules.decompiler.decompose.DomHelper.parseGraph(DomHelper.java:211)
      //   at org.jetbrains.java.decompiler.main.rels.MethodProcessor.codeToJava(MethodProcessor.java:166)
      //
      // Bytecode:
      // 00: getstatic qeaa361f143ee4a0894bd168fd9b30c66/qf4ccf8f5435d4a78bdca4d6a018b578e/aabbabbab.ab I
      // 03: aload 0
      // 04: getfield qeaa361f143ee4a0894bd168fd9b30c66/qf4ccf8f5435d4a78bdca4d6a018b578e/aabbaabb.a Ljava/util/Map;
      // 07: aload 3
      // 08: invokeinterface java/util/Map.get (Ljava/lang/Object;)Ljava/lang/Object; 2
      // 0d: checkcast java/util/Map
      // 10: astore 5
      // 12: istore 4
      // 14: aload 5
      // 16: iload 4
      // 18: ifne 37
      // 1b: ifnull 3a
      // 1e: goto 22
      // 21: athrow
      // 22: aload 5
      // 24: iload 4
      // 26: ifne 3d
      // 29: goto 2d
      // 2c: athrow
      // 2d: aload 1
      // 2e: invokeinterface java/util/Map.remove (Ljava/lang/Object;)Ljava/lang/Object; 2
      // 33: goto 37
      // 36: athrow
      // 37: ifnonnull 3b
      // 3a: return
      // 3b: aload 5
      // 3d: iload 4
      // 3f: ifne 65
      // 42: invokeinterface java/util/Map.isEmpty ()Z 1
      // 47: ifne 5b
      // 4a: goto 4e
      // 4d: athrow
      // 4e: aload 0
      // 4f: aload 3
      // 50: aload 5
      // 52: invokestatic qeaa361f143ee4a0894bd168fd9b30c66/qf4ccf8f5435d4a78bdca4d6a018b578e/aabbaabb.aaab (Ljava/util/Map;)Z
      // 55: bipush 0
      // 56: invokevirtual qeaa361f143ee4a0894bd168fd9b30c66/qf4ccf8f5435d4a78bdca4d6a018b578e/aabbaabb.aaa (Lnet/minecraft/class_304;ZZ)V
      // 59: return
      // 5a: athrow
      // 5b: aload 0
      // 5c: getfield qeaa361f143ee4a0894bd168fd9b30c66/qf4ccf8f5435d4a78bdca4d6a018b578e/aabbaabb.a Ljava/util/Map;
      // 5f: aload 3
      // 60: invokeinterface java/util/Map.remove (Ljava/lang/Object;)Ljava/lang/Object; 2
      // 65: pop
      // 66: aload 0
      // 67: aload 2
      // 68: aload 3
      // 69: bipush 1
      // 6a: invokevirtual qeaa361f143ee4a0894bd168fd9b30c66/qf4ccf8f5435d4a78bdca4d6a018b578e/aabbaabb.abb (Lnet/minecraft/class_310;Lnet/minecraft/class_304;Z)V
      // 6d: return
   }

   private void abb(class_310 param1, class_304 param2, boolean param3) {
      // $VF: Couldn't be decompiled
      // Please report this to the Vineflower issue tracker, at https://github.com/Vineflower/vineflower/issues with a copy of the class file (if you have the rights to distribute it!)
      // java.lang.RuntimeException: parsing failure!
      //   at org.jetbrains.java.decompiler.modules.decompiler.decompose.DomHelper.parseGraph(DomHelper.java:211)
      //   at org.jetbrains.java.decompiler.main.rels.MethodProcessor.codeToJava(MethodProcessor.java:166)
      //
      // Bytecode:
      // 00: getstatic qeaa361f143ee4a0894bd168fd9b30c66/qf4ccf8f5435d4a78bdca4d6a018b578e/aabbabbab.ab I
      // 03: aload 0
      // 04: getfield qeaa361f143ee4a0894bd168fd9b30c66/qf4ccf8f5435d4a78bdca4d6a018b578e/aabbaabb.aa Ljava/util/Map;
      // 07: aload 2
      // 08: bipush 0
      // 09: invokestatic java/lang/Boolean.valueOf (Z)Ljava/lang/Boolean;
      // 0c: invokeinterface java/util/Map.getOrDefault (Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object; 3
      // 11: checkcast java/lang/Boolean
      // 14: invokevirtual java/lang/Boolean.booleanValue ()Z
      // 17: istore 5
      // 19: istore 4
      // 1b: iload 3
      // 1c: ifeq 52
      // 1f: aload 1
      // 20: iload 4
      // 22: ifne 3e
      // 25: goto 29
      // 28: athrow
      // 29: ifnonnull 3d
      // 2c: goto 30
      // 2f: athrow
      // 30: iload 5
      // 32: ifeq 52
      // 35: goto 39
      // 38: athrow
      // 39: goto 4e
      // 3c: athrow
      // 3d: aload 1
      // 3e: aload 2
      // 3f: invokestatic qeaa361f143ee4a0894bd168fd9b30c66/qf4ccf8f5435d4a78bdca4d6a018b578e/aabbabbbb.aaab (Lnet/minecraft/class_310;Lnet/minecraft/class_304;)Z
      // 42: iload 4
      // 44: ifne 4f
      // 47: ifeq 52
      // 4a: goto 4e
      // 4d: athrow
      // 4e: bipush 1
      // 4f: goto 53
      // 52: bipush 0
      // 53: istore 6
      // 55: aload 0
      // 56: getfield qeaa361f143ee4a0894bd168fd9b30c66/qf4ccf8f5435d4a78bdca4d6a018b578e/aabbaabb.aa Ljava/util/Map;
      // 59: aload 2
      // 5a: invokeinterface java/util/Map.remove (Ljava/lang/Object;)Ljava/lang/Object; 2
      // 5f: pop
      // 60: aload 0
      // 61: aload 2
      // 62: iload 6
      // 64: bipush 0
      // 65: invokevirtual qeaa361f143ee4a0894bd168fd9b30c66/qf4ccf8f5435d4a78bdca4d6a018b578e/aabbaabb.aaa (Lnet/minecraft/class_304;ZZ)V
      // 68: return
   }

   public void baa(Object param1, class_310 param2, class_304 param3) {
      // $VF: Couldn't be decompiled
      // Please report this to the Vineflower issue tracker, at https://github.com/Vineflower/vineflower/issues with a copy of the class file (if you have the rights to distribute it!)
      // java.lang.RuntimeException: parsing failure!
      //   at org.jetbrains.java.decompiler.modules.decompiler.decompose.DomHelper.parseGraph(DomHelper.java:211)
      //   at org.jetbrains.java.decompiler.main.rels.MethodProcessor.codeToJava(MethodProcessor.java:166)
      //
      // Bytecode:
      // 00: aload 1
      // 01: ifnull 17
      // 04: aload 3
      // 05: ifnull 17
      // 08: goto 0c
      // 0b: athrow
      // 0c: aload 0
      // 0d: aload 1
      // 0e: aload 2
      // 0f: aload 3
      // 10: invokevirtual qeaa361f143ee4a0894bd168fd9b30c66/qf4ccf8f5435d4a78bdca4d6a018b578e/aabbaabb.aba (Ljava/lang/Object;Lnet/minecraft/class_310;Lnet/minecraft/class_304;)V
      // 13: goto 17
      // 16: athrow
      // 17: return
   }

   public static aabbaabb bab() {
      return ab;
   }

   public void bba(Object var1, class_310 var2) {
      int var3 = aabbabbab.ab;

      try {
         if (var1 == null) {
            return;
         }
      } catch (MatchException var6) {
         throw var6;
      }

      for (class_304 var5 : Set.copyOf(this.a.keySet())) {
         this.aba(var1, var2, var5);
         if (var3 != 0) {
            break;
         }
      }
   }

   public void bbb(class_310 param1) {
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
      // 05: getfield qeaa361f143ee4a0894bd168fd9b30c66/qf4ccf8f5435d4a78bdca4d6a018b578e/aabbaabb.a Ljava/util/Map;
      // 08: invokeinterface java/util/Map.isEmpty ()Z 1
      // 0d: iload 2
      // 0e: ifne 20
      // 11: ifne 2d
      // 14: goto 18
      // 17: athrow
      // 18: aload 1
      // 19: invokestatic qeaa361f143ee4a0894bd168fd9b30c66/qf4ccf8f5435d4a78bdca4d6a018b578e/aabbaabb.aab (Lnet/minecraft/class_310;)Z
      // 1c: goto 20
      // 1f: athrow
      // 20: ifne 2d
      // 23: aload 0
      // 24: aload 1
      // 25: bipush 0
      // 26: invokevirtual qeaa361f143ee4a0894bd168fd9b30c66/qf4ccf8f5435d4a78bdca4d6a018b578e/aabbaabb.b (Lnet/minecraft/class_310;Z)V
      // 29: goto 2d
      // 2c: athrow
      // 2d: return
   }

   private static Map aaaa(class_304 var0) {
      return new IdentityHashMap();
   }

   private static boolean aaab(Map param0) {
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
      // 06: ifne 11
      // 09: ifnull 39
      // 0c: goto 10
      // 0f: athrow
      // 10: aload 0
      // 11: invokeinterface java/util/Map.isEmpty ()Z 1
      // 16: iload 1
      // 17: ifne 3e
      // 1a: ifne 39
      // 1d: goto 21
      // 20: athrow
      // 21: aload 0
      // 22: getstatic java/lang/Boolean.FALSE Ljava/lang/Boolean;
      // 25: iload 1
      // 26: ifne 43
      // 29: goto 2d
      // 2c: athrow
      // 2d: invokeinterface java/util/Map.containsValue (Ljava/lang/Object;)Z 2
      // 32: ifeq 3f
      // 35: goto 39
      // 38: athrow
      // 39: bipush 0
      // 3a: goto 3e
      // 3d: athrow
      // 3e: ireturn
      // 3f: aload 0
      // 40: getstatic java/lang/Boolean.TRUE Ljava/lang/Boolean;
      // 43: invokeinterface java/util/Map.containsValue (Ljava/lang/Object;)Z 2
      // 48: ireturn
   }

   public void aaba(class_315 param1, class_744 param2) {
      // $VF: Couldn't be decompiled
      // Please report this to the Vineflower issue tracker, at https://github.com/Vineflower/vineflower/issues with a copy of the class file (if you have the rights to distribute it!)
      // java.lang.RuntimeException: parsing failure!
      //   at org.jetbrains.java.decompiler.modules.decompiler.decompose.DomHelper.parseGraph(DomHelper.java:211)
      //   at org.jetbrains.java.decompiler.main.rels.MethodProcessor.codeToJava(MethodProcessor.java:166)
      //
      // Bytecode:
      // 000: getstatic qeaa361f143ee4a0894bd168fd9b30c66/qf4ccf8f5435d4a78bdca4d6a018b578e/aabbabbab.ab I
      // 003: istore 3
      // 004: invokestatic net/minecraft/class_310.method_1551 ()Lnet/minecraft/class_310;
      // 007: invokestatic qeaa361f143ee4a0894bd168fd9b30c66/qf4ccf8f5435d4a78bdca4d6a018b578e/aabbaabb.aab (Lnet/minecraft/class_310;)Z
      // 00a: ifeq 02d
      // 00d: aload 1
      // 00e: ifnull 02d
      // 011: goto 015
      // 014: athrow
      // 015: aload 2
      // 016: ifnull 02d
      // 019: goto 01d
      // 01c: athrow
      // 01d: aload 0
      // 01e: getfield qeaa361f143ee4a0894bd168fd9b30c66/qf4ccf8f5435d4a78bdca4d6a018b578e/aabbaabb.a Ljava/util/Map;
      // 021: invokeinterface java/util/Map.isEmpty ()Z 1
      // 026: ifeq 02f
      // 029: goto 02d
      // 02c: athrow
      // 02d: return
      // 02e: athrow
      // 02f: aload 2
      // 030: getfield net/minecraft/class_744.field_54155 Lnet/minecraft/class_10185;
      // 033: astore 4
      // 035: aload 0
      // 036: aload 1
      // 037: getfield net/minecraft/class_315.field_1894 Lnet/minecraft/class_304;
      // 03a: aload 4
      // 03c: invokevirtual net/minecraft/class_10185.comp_3159 ()Z
      // 03f: invokevirtual qeaa361f143ee4a0894bd168fd9b30c66/qf4ccf8f5435d4a78bdca4d6a018b578e/aabbaabb.bb (Lnet/minecraft/class_304;Z)Z
      // 042: istore 5
      // 044: aload 0
      // 045: aload 1
      // 046: getfield net/minecraft/class_315.field_1881 Lnet/minecraft/class_304;
      // 049: aload 4
      // 04b: invokevirtual net/minecraft/class_10185.comp_3160 ()Z
      // 04e: invokevirtual qeaa361f143ee4a0894bd168fd9b30c66/qf4ccf8f5435d4a78bdca4d6a018b578e/aabbaabb.bb (Lnet/minecraft/class_304;Z)Z
      // 051: istore 6
      // 053: aload 0
      // 054: aload 1
      // 055: getfield net/minecraft/class_315.field_1913 Lnet/minecraft/class_304;
      // 058: aload 4
      // 05a: invokevirtual net/minecraft/class_10185.comp_3161 ()Z
      // 05d: invokevirtual qeaa361f143ee4a0894bd168fd9b30c66/qf4ccf8f5435d4a78bdca4d6a018b578e/aabbaabb.bb (Lnet/minecraft/class_304;Z)Z
      // 060: istore 7
      // 062: aload 0
      // 063: aload 1
      // 064: getfield net/minecraft/class_315.field_1849 Lnet/minecraft/class_304;
      // 067: aload 4
      // 069: invokevirtual net/minecraft/class_10185.comp_3162 ()Z
      // 06c: invokevirtual qeaa361f143ee4a0894bd168fd9b30c66/qf4ccf8f5435d4a78bdca4d6a018b578e/aabbaabb.bb (Lnet/minecraft/class_304;Z)Z
      // 06f: istore 8
      // 071: aload 0
      // 072: aload 1
      // 073: getfield net/minecraft/class_315.field_1903 Lnet/minecraft/class_304;
      // 076: aload 4
      // 078: invokevirtual net/minecraft/class_10185.comp_3163 ()Z
      // 07b: invokevirtual qeaa361f143ee4a0894bd168fd9b30c66/qf4ccf8f5435d4a78bdca4d6a018b578e/aabbaabb.bb (Lnet/minecraft/class_304;Z)Z
      // 07e: istore 9
      // 080: aload 0
      // 081: aload 1
      // 082: getfield net/minecraft/class_315.field_1832 Lnet/minecraft/class_304;
      // 085: aload 4
      // 087: invokevirtual net/minecraft/class_10185.comp_3164 ()Z
      // 08a: invokevirtual qeaa361f143ee4a0894bd168fd9b30c66/qf4ccf8f5435d4a78bdca4d6a018b578e/aabbaabb.bb (Lnet/minecraft/class_304;Z)Z
      // 08d: istore 10
      // 08f: aload 0
      // 090: aload 1
      // 091: getfield net/minecraft/class_315.field_1867 Lnet/minecraft/class_304;
      // 094: aload 4
      // 096: invokevirtual net/minecraft/class_10185.comp_3165 ()Z
      // 099: invokevirtual qeaa361f143ee4a0894bd168fd9b30c66/qf4ccf8f5435d4a78bdca4d6a018b578e/aabbaabb.bb (Lnet/minecraft/class_304;Z)Z
      // 09c: istore 11
      // 09e: aload 2
      // 09f: new net/minecraft/class_10185
      // 0a2: dup
      // 0a3: iload 5
      // 0a5: iload 6
      // 0a7: iload 7
      // 0a9: iload 8
      // 0ab: iload 9
      // 0ad: iload 10
      // 0af: iload 11
      // 0b1: invokespecial net/minecraft/class_10185.<init> (ZZZZZZZ)V
      // 0b4: putfield net/minecraft/class_744.field_54155 Lnet/minecraft/class_10185;
      // 0b7: iload 5
      // 0b9: iload 3
      // 0ba: ifne 0cd
      // 0bd: iload 6
      // 0bf: if_icmpne 0cb
      // 0c2: goto 0c6
      // 0c5: athrow
      // 0c6: fconst_0
      // 0c7: goto 0d8
      // 0ca: athrow
      // 0cb: iload 5
      // 0cd: ifeq 0d5
      // 0d0: fconst_1
      // 0d1: goto 0d8
      // 0d4: athrow
      // 0d5: ldc_w -1.0
      // 0d8: fstore 12
      // 0da: iload 7
      // 0dc: iload 3
      // 0dd: ifne 0f0
      // 0e0: iload 8
      // 0e2: if_icmpne 0ee
      // 0e5: goto 0e9
      // 0e8: athrow
      // 0e9: fconst_0
      // 0ea: goto 0fb
      // 0ed: athrow
      // 0ee: iload 7
      // 0f0: ifeq 0f8
      // 0f3: fconst_1
      // 0f4: goto 0fb
      // 0f7: athrow
      // 0f8: ldc_w -1.0
      // 0fb: fstore 13
      // 0fd: aload 2
      // 0fe: fload 12
      // 100: fload 13
      // 102: invokestatic qeaa361f143ee4a0894bd168fd9b30c66/qf4ccf8f5435d4a78bdca4d6a018b578e/aabbabbbb.baaabaa (Lnet/minecraft/class_744;FF)V
      // 105: return
   }

   public void aabb(class_310 var1) {
      this.b(var1, true);
   }

   private void b(class_310 var1, boolean var2) {
      int var10000 = aabbabbab.ab;
      Iterator var4 = Set.copyOf(this.a.keySet()).iterator();
      int var3 = var10000;

      while (true) {
         if (var4.hasNext()) {
            class_304 var5 = (class_304)var4.next();

            try {
               var7 = this;
               if (var3 != 0) {
                  break;
               }

               this.abb(var1, var5, var2);
               if (var3 == 0) {
                  continue;
               }
            } catch (MatchException var6) {
               throw var6;
            }
         }

         this.a.clear();
         var7 = this;
         break;
      }

      var7.aa.clear();
   }
}
