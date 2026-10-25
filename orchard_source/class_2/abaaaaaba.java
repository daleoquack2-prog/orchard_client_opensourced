package nsc;

import java.util.List;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.function.BooleanSupplier;
import java.util.function.Consumer;
import net.fabricmc.api.ClientModInitializer;
import net.fabricmc.api.EnvType;
import net.fabricmc.api.Environment;
import net.minecraft.class_310;
import net.minecraft.class_332;
import net.minecraft.class_9779;

@Environment(EnvType.CLIENT)
public final class abaaaaaba implements ClientModInitializer {
   private Thread aa;
   private static volatile abaaaaaba ab;
   public static boolean a;
   private boolean ba;
   private Runnable bb;
   private babbaba aaa;
   private static final ExecutorService aab = Executors.newSingleThreadExecutor(abaaaaaba::aa);
   private babaaaa aba;
   private List abb;
   private boolean baa;
   private aabbaaab bab;
   private boolean bba;
   private volatile boolean bbb;
   private bbaabbb aaaa;
   private BooleanSupplier aaab = this::aabab;
   private baaaabaa aaba;
   private aabbaabab b;

   private static Thread aa(Runnable var0) {
      Thread var1 = new Thread(var0);
      var1.setDaemon(true);
      return var1;
   }

   public void ab() {
      // $VF: Couldn't be decompiled
      // Please report this to the Vineflower issue tracker, at https://github.com/Vineflower/vineflower/issues with a copy of the class file (if you have the rights to distribute it!)
      // java.lang.RuntimeException: parsing failure!
      //   at org.jetbrains.java.decompiler.modules.decompiler.decompose.DomHelper.parseGraph(DomHelper.java:211)
      //   at org.jetbrains.java.decompiler.main.rels.MethodProcessor.codeToJava(MethodProcessor.java:166)
      //
      // Bytecode:
      // 00: getstatic qeaa361f143ee4a0894bd168fd9b30c66/qf4ccf8f5435d4a78bdca4d6a018b578e/abaaaaaba.a Z
      // 03: istore 1
      // 04: aload 0
      // 05: iload 1
      // 06: ifne 16
      // 09: invokevirtual qeaa361f143ee4a0894bd168fd9b30c66/qf4ccf8f5435d4a78bdca4d6a018b578e/abaaaaaba.bbbb ()Z
      // 0c: ifne 15
      // 0f: goto 13
      // 12: athrow
      // 13: return
      // 14: athrow
      // 15: aload 0
      // 16: getfield qeaa361f143ee4a0894bd168fd9b30c66/qf4ccf8f5435d4a78bdca4d6a018b578e/abaaaaaba.aba Lqeaa361f143ee4a0894bd168fd9b30c66/qf4ccf8f5435d4a78bdca4d6a018b578e/babaaaa;
      // 19: aload 0
      // 1a: getfield qeaa361f143ee4a0894bd168fd9b30c66/qf4ccf8f5435d4a78bdca4d6a018b578e/abaaaaaba.aaa Lqeaa361f143ee4a0894bd168fd9b30c66/qf4ccf8f5435d4a78bdca4d6a018b578e/babbaba;
      // 1d: invokevirtual qeaa361f143ee4a0894bd168fd9b30c66/qf4ccf8f5435d4a78bdca4d6a018b578e/babaaaa.abbaaa (Lqeaa361f143ee4a0894bd168fd9b30c66/qf4ccf8f5435d4a78bdca4d6a018b578e/babbaba;)V
      // 20: return
   }

   private void ba() {
      try {
         if (!abbabaa.aa()) {
            this.ab();
         }
      } catch (IllegalStateException var1) {
         throw var1;
      }
   }

   public void bb(Consumer param1) {
      // $VF: Couldn't be decompiled
      // Please report this to the Vineflower issue tracker, at https://github.com/Vineflower/vineflower/issues with a copy of the class file (if you have the rights to distribute it!)
      // java.lang.RuntimeException: parsing failure!
      //   at org.jetbrains.java.decompiler.modules.decompiler.decompose.DomHelper.parseGraph(DomHelper.java:211)
      //   at org.jetbrains.java.decompiler.main.rels.MethodProcessor.codeToJava(MethodProcessor.java:166)
      //
      // Bytecode:
      // 00: getstatic qeaa361f143ee4a0894bd168fd9b30c66/qf4ccf8f5435d4a78bdca4d6a018b578e/abaaaaaba.a Z
      // 03: istore 2
      // 04: aload 0
      // 05: invokevirtual qeaa361f143ee4a0894bd168fd9b30c66/qf4ccf8f5435d4a78bdca4d6a018b578e/abaaaaaba.bbbb ()Z
      // 08: ifne 26
      // 0b: aload 1
      // 0c: iload 2
      // 0d: ifne 1c
      // 10: goto 14
      // 13: athrow
      // 14: ifnull 25
      // 17: goto 1b
      // 1a: athrow
      // 1b: aload 1
      // 1c: bipush 0
      // 1d: invokestatic java/lang/Boolean.valueOf (Z)Ljava/lang/Boolean;
      // 20: invokeinterface java/util/function/Consumer.accept (Ljava/lang/Object;)V 2
      // 25: return
      // 26: getstatic qeaa361f143ee4a0894bd168fd9b30c66/qf4ccf8f5435d4a78bdca4d6a018b578e/abaaaaaba.aab Ljava/util/concurrent/ExecutorService;
      // 29: aload 0
      // 2a: aload 1
      // 2b: invokedynamic run (Lqeaa361f143ee4a0894bd168fd9b30c66/qf4ccf8f5435d4a78bdca4d6a018b578e/abaaaaaba;Ljava/util/function/Consumer;)Ljava/lang/Runnable; bsm=java/lang/invoke/LambdaMetafactory.metafactory (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;Ljava/lang/invoke/MethodType;Ljava/lang/invoke/MethodHandle;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[ ()V, qeaa361f143ee4a0894bd168fd9b30c66/qf4ccf8f5435d4a78bdca4d6a018b578e/abaaaaaba.aab (Ljava/util/function/Consumer;)V, ()V ]
      // 30: invokeinterface java/util/concurrent/ExecutorService.execute (Ljava/lang/Runnable;)V 2
      // 35: return
   }

   public void aaa() {
      // $VF: Couldn't be decompiled
      // Please report this to the Vineflower issue tracker, at https://github.com/Vineflower/vineflower/issues with a copy of the class file (if you have the rights to distribute it!)
      // java.lang.RuntimeException: parsing failure!
      //   at org.jetbrains.java.decompiler.modules.decompiler.decompose.DomHelper.parseGraph(DomHelper.java:211)
      //   at org.jetbrains.java.decompiler.main.rels.MethodProcessor.codeToJava(MethodProcessor.java:166)
      //
      // Bytecode:
      // 00: getstatic qeaa361f143ee4a0894bd168fd9b30c66/qf4ccf8f5435d4a78bdca4d6a018b578e/abaaaaaba.a Z
      // 03: istore 1
      // 04: invokestatic qeaa361f143ee4a0894bd168fd9b30c66/qf4ccf8f5435d4a78bdca4d6a018b578e/abbabaa.aa ()Z
      // 07: iload 1
      // 08: ifne 1d
      // 0b: ifne 20
      // 0e: goto 12
      // 11: athrow
      // 12: aload 0
      // 13: getfield qeaa361f143ee4a0894bd168fd9b30c66/qf4ccf8f5435d4a78bdca4d6a018b578e/abaaaaaba.aba Lqeaa361f143ee4a0894bd168fd9b30c66/qf4ccf8f5435d4a78bdca4d6a018b578e/babaaaa;
      // 16: invokevirtual qeaa361f143ee4a0894bd168fd9b30c66/qf4ccf8f5435d4a78bdca4d6a018b578e/babaaaa.aaabb ()Z
      // 19: goto 1d
      // 1c: athrow
      // 1d: ifeq 21
      // 20: return
      // 21: getstatic qeaa361f143ee4a0894bd168fd9b30c66/qf4ccf8f5435d4a78bdca4d6a018b578e/abaaaaaba.aab Ljava/util/concurrent/ExecutorService;
      // 24: aload 0
      // 25: invokedynamic run (Lqeaa361f143ee4a0894bd168fd9b30c66/qf4ccf8f5435d4a78bdca4d6a018b578e/abaaaaaba;)Ljava/lang/Runnable; bsm=java/lang/invoke/LambdaMetafactory.metafactory (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;Ljava/lang/invoke/MethodType;Ljava/lang/invoke/MethodHandle;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[ ()V, qeaa361f143ee4a0894bd168fd9b30c66/qf4ccf8f5435d4a78bdca4d6a018b578e/abaaaaaba.abba ()V, ()V ]
      // 2a: invokeinterface java/util/concurrent/ExecutorService.execute (Ljava/lang/Runnable;)V 2
      // 2f: return
   }

   private void aab(Consumer var1) {
      boolean var3 = false;
      boolean var2 = a;

      try {
         this.aba.abbaaa(this.aaa);
         var3 = true;
      } catch (Throwable var5) {
      }

      Consumer var10000;
      label26: {
         try {
            var10000 = var1;
            if (var2) {
               break label26;
            }

            if (var1 == null) {
               return;
            }
         } catch (Throwable var6) {
            throw var6;
         }

         var10000 = var1;
      }

      var10000.accept(var3);
   }

   public babaaaa aba() {
      return this.aba;
   }

   public void abb() {
      this.bba = true;
   }

   public abaaaaaba() {
      this.bb = this::abab;
   }

   private void baa(class_310 param1) {
      // $VF: Couldn't be decompiled
      // Please report this to the Vineflower issue tracker, at https://github.com/Vineflower/vineflower/issues with a copy of the class file (if you have the rights to distribute it!)
      // java.lang.RuntimeException: parsing failure!
      //   at org.jetbrains.java.decompiler.modules.decompiler.decompose.DomHelper.parseGraph(DomHelper.java:211)
      //   at org.jetbrains.java.decompiler.main.rels.MethodProcessor.codeToJava(MethodProcessor.java:166)
      //
      // Bytecode:
      // 000: getstatic qeaa361f143ee4a0894bd168fd9b30c66/qf4ccf8f5435d4a78bdca4d6a018b578e/abaaaaaba.a Z
      // 003: istore 2
      // 004: invokestatic qeaa361f143ee4a0894bd168fd9b30c66/qf4ccf8f5435d4a78bdca4d6a018b578e/abbabaa.aa ()Z
      // 007: iload 2
      // 008: ifne 01f
      // 00b: ifeq 013
      // 00e: goto 012
      // 011: athrow
      // 012: return
      // 013: aload 0
      // 014: iload 2
      // 015: ifne 03c
      // 018: invokevirtual qeaa361f143ee4a0894bd168fd9b30c66/qf4ccf8f5435d4a78bdca4d6a018b578e/abaaaaaba.bbbb ()Z
      // 01b: goto 01f
      // 01e: athrow
      // 01f: ifne 023
      // 022: return
      // 023: aload 0
      // 024: getfield qeaa361f143ee4a0894bd168fd9b30c66/qf4ccf8f5435d4a78bdca4d6a018b578e/abaaaaaba.b Lqeaa361f143ee4a0894bd168fd9b30c66/qf4ccf8f5435d4a78bdca4d6a018b578e/aabbaabab;
      // 027: aload 1
      // 028: invokevirtual qeaa361f143ee4a0894bd168fd9b30c66/qf4ccf8f5435d4a78bdca4d6a018b578e/aabbaabab.aabb (Lnet/minecraft/class_310;)V
      // 02b: aload 0
      // 02c: getfield qeaa361f143ee4a0894bd168fd9b30c66/qf4ccf8f5435d4a78bdca4d6a018b578e/abaaaaaba.aaba Lqeaa361f143ee4a0894bd168fd9b30c66/qf4ccf8f5435d4a78bdca4d6a018b578e/baaaabaa;
      // 02f: aload 1
      // 030: invokevirtual qeaa361f143ee4a0894bd168fd9b30c66/qf4ccf8f5435d4a78bdca4d6a018b578e/baaaabaa.aba (Lnet/minecraft/class_310;)V
      // 033: aload 0
      // 034: getfield qeaa361f143ee4a0894bd168fd9b30c66/qf4ccf8f5435d4a78bdca4d6a018b578e/abaaaaaba.aaa Lqeaa361f143ee4a0894bd168fd9b30c66/qf4ccf8f5435d4a78bdca4d6a018b578e/babbaba;
      // 037: aload 1
      // 038: invokevirtual qeaa361f143ee4a0894bd168fd9b30c66/qf4ccf8f5435d4a78bdca4d6a018b578e/babbaba.baa (Lnet/minecraft/class_310;)V
      // 03b: aload 0
      // 03c: getfield qeaa361f143ee4a0894bd168fd9b30c66/qf4ccf8f5435d4a78bdca4d6a018b578e/abaaaaaba.aaa Lqeaa361f143ee4a0894bd168fd9b30c66/qf4ccf8f5435d4a78bdca4d6a018b578e/babbaba;
      // 03f: invokevirtual qeaa361f143ee4a0894bd168fd9b30c66/qf4ccf8f5435d4a78bdca4d6a018b578e/babbaba.aabaa ()V
      // 042: bipush 0
      // 043: istore 3
      // 044: aload 1
      // 045: iload 2
      // 046: ifne 058
      // 049: getfield net/minecraft/class_310.field_1755 Lnet/minecraft/class_437;
      // 04c: ifnull 0f1
      // 04f: goto 053
      // 052: athrow
      // 053: aload 1
      // 054: goto 058
      // 057: athrow
      // 058: getfield net/minecraft/class_310.field_1755 Lnet/minecraft/class_437;
      // 05b: instanceof net/minecraft/class_408
      // 05e: iload 2
      // 05f: ifne 09a
      // 062: ifne 095
      // 065: goto 069
      // 068: athrow
      // 069: aload 1
      // 06a: getfield net/minecraft/class_310.field_1755 Lnet/minecraft/class_437;
      // 06d: instanceof net/minecraft/class_7743
      // 070: iload 2
      // 071: ifne 09a
      // 074: goto 078
      // 077: athrow
      // 078: ifne 095
      // 07b: goto 07f
      // 07e: athrow
      // 07f: aload 1
      // 080: iload 2
      // 081: ifne 0a4
      // 084: goto 088
      // 087: athrow
      // 088: getfield net/minecraft/class_310.field_1755 Lnet/minecraft/class_437;
      // 08b: instanceof net/minecraft/class_473
      // 08e: ifeq 09f
      // 091: goto 095
      // 094: athrow
      // 095: bipush 1
      // 096: goto 09a
      // 099: athrow
      // 09a: istore 3
      // 09b: iload 2
      // 09c: ifeq 0f1
      // 09f: aload 1
      // 0a0: goto 0a4
      // 0a3: athrow
      // 0a4: getfield net/minecraft/class_310.field_1755 Lnet/minecraft/class_437;
      // 0a7: astore 5
      // 0a9: iload 2
      // 0aa: ifne 0df
      // 0ad: aload 5
      // 0af: instanceof qeaa361f143ee4a0894bd168fd9b30c66/qf4ccf8f5435d4a78bdca4d6a018b578e/baaba
      // 0b2: ifeq 0d6
      // 0b5: goto 0b9
      // 0b8: athrow
      // 0b9: aload 5
      // 0bb: checkcast qeaa361f143ee4a0894bd168fd9b30c66/qf4ccf8f5435d4a78bdca4d6a018b578e/baaba
      // 0be: iload 2
      // 0bf: ifne 0e1
      // 0c2: goto 0c6
      // 0c5: athrow
      // 0c6: astore 4
      // 0c8: aload 4
      // 0ca: invokevirtual qeaa361f143ee4a0894bd168fd9b30c66/qf4ccf8f5435d4a78bdca4d6a018b578e/baaba.aabbaaa ()Z
      // 0cd: ifne 0d6
      // 0d0: bipush 1
      // 0d1: istore 3
      // 0d2: iload 2
      // 0d3: ifeq 0f1
      // 0d6: aload 1
      // 0d7: getfield net/minecraft/class_310.field_1755 Lnet/minecraft/class_437;
      // 0da: invokevirtual net/minecraft/class_437.method_25399 ()Lnet/minecraft/class_364;
      // 0dd: astore 5
      // 0df: aload 5
      // 0e1: instanceof net/minecraft/class_342
      // 0e4: iload 2
      // 0e5: ifne 0f0
      // 0e8: ifeq 0f1
      // 0eb: goto 0ef
      // 0ee: athrow
      // 0ef: bipush 1
      // 0f0: istore 3
      // 0f1: aload 0
      // 0f2: getfield qeaa361f143ee4a0894bd168fd9b30c66/qf4ccf8f5435d4a78bdca4d6a018b578e/abaaaaaba.aba Lqeaa361f143ee4a0894bd168fd9b30c66/qf4ccf8f5435d4a78bdca4d6a018b578e/babaaaa;
      // 0f5: invokevirtual qeaa361f143ee4a0894bd168fd9b30c66/qf4ccf8f5435d4a78bdca4d6a018b578e/babaaaa.aab ()Lnet/minecraft/class_3675$class_306;
      // 0f8: astore 4
      // 0fa: iload 3
      // 0fb: iload 2
      // 0fc: ifne 113
      // 0ff: ifne 137
      // 102: goto 106
      // 105: athrow
      // 106: aload 0
      // 107: getfield qeaa361f143ee4a0894bd168fd9b30c66/qf4ccf8f5435d4a78bdca4d6a018b578e/abaaaaaba.aaa Lqeaa361f143ee4a0894bd168fd9b30c66/qf4ccf8f5435d4a78bdca4d6a018b578e/babbaba;
      // 10a: aload 4
      // 10c: invokevirtual qeaa361f143ee4a0894bd168fd9b30c66/qf4ccf8f5435d4a78bdca4d6a018b578e/babbaba.bbba (Lnet/minecraft/class_3675$class_306;)Z
      // 10f: goto 113
      // 112: athrow
      // 113: iload 2
      // 114: ifne 128
      // 117: ifne 137
      // 11a: goto 11e
      // 11d: athrow
      // 11e: aload 1
      // 11f: aload 4
      // 121: invokestatic qeaa361f143ee4a0894bd168fd9b30c66/qf4ccf8f5435d4a78bdca4d6a018b578e/aabbabbbb.abbbbab (Lnet/minecraft/class_310;Lnet/minecraft/class_3675$class_306;)Z
      // 124: goto 128
      // 127: athrow
      // 128: iload 2
      // 129: ifne 134
      // 12c: ifeq 137
      // 12f: goto 133
      // 132: athrow
      // 133: bipush 1
      // 134: goto 138
      // 137: bipush 0
      // 138: istore 5
      // 13a: iload 2
      // 13b: ifne 168
      // 13e: iload 5
      // 140: ifeq 162
      // 143: goto 147
      // 146: athrow
      // 147: aload 0
      // 148: iload 2
      // 149: ifne 163
      // 14c: goto 150
      // 14f: athrow
      // 150: getfield qeaa361f143ee4a0894bd168fd9b30c66/qf4ccf8f5435d4a78bdca4d6a018b578e/abaaaaaba.bba Z
      // 153: ifne 162
      // 156: goto 15a
      // 159: athrow
      // 15a: aload 0
      // 15b: invokevirtual qeaa361f143ee4a0894bd168fd9b30c66/qf4ccf8f5435d4a78bdca4d6a018b578e/abaaaaaba.abbb ()V
      // 15e: goto 162
      // 161: athrow
      // 162: aload 0
      // 163: iload 5
      // 165: putfield qeaa361f143ee4a0894bd168fd9b30c66/qf4ccf8f5435d4a78bdca4d6a018b578e/abaaaaaba.bba Z
      // 168: return
   }

   public void bab() {
      // $VF: Couldn't be decompiled
      // Please report this to the Vineflower issue tracker, at https://github.com/Vineflower/vineflower/issues with a copy of the class file (if you have the rights to distribute it!)
      // java.lang.RuntimeException: parsing failure!
      //   at org.jetbrains.java.decompiler.modules.decompiler.decompose.DomHelper.parseGraph(DomHelper.java:211)
      //   at org.jetbrains.java.decompiler.main.rels.MethodProcessor.codeToJava(MethodProcessor.java:166)
      //
      // Bytecode:
      // 00: getstatic qeaa361f143ee4a0894bd168fd9b30c66/qf4ccf8f5435d4a78bdca4d6a018b578e/abaaaaaba.a Z
      // 03: istore 1
      // 04: aload 0
      // 05: iload 1
      // 06: ifne 24
      // 09: bipush 0
      // 0a: putfield qeaa361f143ee4a0894bd168fd9b30c66/qf4ccf8f5435d4a78bdca4d6a018b578e/abaaaaaba.bbb Z
      // 0d: aload 0
      // 0e: getfield qeaa361f143ee4a0894bd168fd9b30c66/qf4ccf8f5435d4a78bdca4d6a018b578e/abaaaaaba.aaba Lqeaa361f143ee4a0894bd168fd9b30c66/qf4ccf8f5435d4a78bdca4d6a018b578e/baaaabaa;
      // 11: ifnull 23
      // 14: goto 18
      // 17: athrow
      // 18: aload 0
      // 19: getfield qeaa361f143ee4a0894bd168fd9b30c66/qf4ccf8f5435d4a78bdca4d6a018b578e/abaaaaaba.aaba Lqeaa361f143ee4a0894bd168fd9b30c66/qf4ccf8f5435d4a78bdca4d6a018b578e/baaaabaa;
      // 1c: invokevirtual qeaa361f143ee4a0894bd168fd9b30c66/qf4ccf8f5435d4a78bdca4d6a018b578e/baaaabaa.ab ()V
      // 1f: goto 23
      // 22: athrow
      // 23: aload 0
      // 24: getfield qeaa361f143ee4a0894bd168fd9b30c66/qf4ccf8f5435d4a78bdca4d6a018b578e/abaaaaaba.aa Ljava/lang/Thread;
      // 27: astore 2
      // 28: aload 0
      // 29: iload 1
      // 2a: ifne 4b
      // 2d: aconst_null
      // 2e: putfield qeaa361f143ee4a0894bd168fd9b30c66/qf4ccf8f5435d4a78bdca4d6a018b578e/abaaaaaba.aa Ljava/lang/Thread;
      // 31: aload 2
      // 32: ifnull 48
      // 35: goto 39
      // 38: athrow
      // 39: invokestatic java/lang/Runtime.getRuntime ()Ljava/lang/Runtime;
      // 3c: aload 2
      // 3d: invokevirtual java/lang/Runtime.removeShutdownHook (Ljava/lang/Thread;)Z
      // 40: pop
      // 41: goto 48
      // 44: athrow
      // 45: astore 3
      // 46: aload 3
      // 47: pop
      // 48: getstatic qeaa361f143ee4a0894bd168fd9b30c66/qf4ccf8f5435d4a78bdca4d6a018b578e/abaaaaaba.ab Lqeaa361f143ee4a0894bd168fd9b30c66/qf4ccf8f5435d4a78bdca4d6a018b578e/abaaaaaba;
      // 4b: aload 0
      // 4c: if_acmpne 57
      // 4f: aconst_null
      // 50: putstatic qeaa361f143ee4a0894bd168fd9b30c66/qf4ccf8f5435d4a78bdca4d6a018b578e/abaaaaaba.ab Lqeaa361f143ee4a0894bd168fd9b30c66/qf4ccf8f5435d4a78bdca4d6a018b578e/abaaaaaba;
      // 53: goto 57
      // 56: athrow
      // 57: return
   }

   private void bba(aabbbbaaa param1) {
      // $VF: Couldn't be decompiled
      // Please report this to the Vineflower issue tracker, at https://github.com/Vineflower/vineflower/issues with a copy of the class file (if you have the rights to distribute it!)
      // java.lang.RuntimeException: parsing failure!
      //   at org.jetbrains.java.decompiler.modules.decompiler.decompose.DomHelper.parseGraph(DomHelper.java:211)
      //   at org.jetbrains.java.decompiler.main.rels.MethodProcessor.codeToJava(MethodProcessor.java:166)
      //
      // Bytecode:
      // 00: getstatic qeaa361f143ee4a0894bd168fd9b30c66/qf4ccf8f5435d4a78bdca4d6a018b578e/abaaaaaba.a Z
      // 03: istore 2
      // 04: aload 0
      // 05: iload 2
      // 06: ifne 16
      // 09: invokevirtual qeaa361f143ee4a0894bd168fd9b30c66/qf4ccf8f5435d4a78bdca4d6a018b578e/abaaaaaba.bbbb ()Z
      // 0c: ifne 15
      // 0f: goto 13
      // 12: athrow
      // 13: return
      // 14: athrow
      // 15: aload 0
      // 16: getfield qeaa361f143ee4a0894bd168fd9b30c66/qf4ccf8f5435d4a78bdca4d6a018b578e/abaaaaaba.aaa Lqeaa361f143ee4a0894bd168fd9b30c66/qf4ccf8f5435d4a78bdca4d6a018b578e/babbaba;
      // 19: aload 1
      // 1a: invokevirtual qeaa361f143ee4a0894bd168fd9b30c66/qf4ccf8f5435d4a78bdca4d6a018b578e/babbaba.aabbab (Lqeaa361f143ee4a0894bd168fd9b30c66/qf4ccf8f5435d4a78bdca4d6a018b578e/aabbbbaaa;)V
      // 1d: return
   }

   public void bbb() {
      this.aaaba(bababbab.b);
   }

   public void aaaa() {
   }

   public void aaab() {
      this.aaaba(bababbab.aaa);
   }

   public babbaba aaba() {
      return this.aaa;
   }

   private static void aabb(String var0) {
   }

   public bbaabbb abaa() {
      return this.aaaa;
   }

   private void abab() {
   }

   private void abba() {
      try {
         this.aba.abbaaa(this.aaa);
      } catch (Throwable var2) {
      }
   }

   public void abbb() {
      this.aaaba(bababbab.a);
   }

   private void baaa(class_332 param1, class_9779 param2) {
      // $VF: Couldn't be decompiled
      // Please report this to the Vineflower issue tracker, at https://github.com/Vineflower/vineflower/issues with a copy of the class file (if you have the rights to distribute it!)
      // java.lang.RuntimeException: parsing failure!
      //   at org.jetbrains.java.decompiler.modules.decompiler.decompose.DomHelper.parseGraph(DomHelper.java:211)
      //   at org.jetbrains.java.decompiler.main.rels.MethodProcessor.codeToJava(MethodProcessor.java:166)
      //
      // Bytecode:
      // 00: getstatic qeaa361f143ee4a0894bd168fd9b30c66/qf4ccf8f5435d4a78bdca4d6a018b578e/abaaaaaba.a Z
      // 03: istore 3
      // 04: aload 0
      // 05: iload 3
      // 06: ifne 16
      // 09: invokevirtual qeaa361f143ee4a0894bd168fd9b30c66/qf4ccf8f5435d4a78bdca4d6a018b578e/abaaaaaba.bbbb ()Z
      // 0c: ifne 15
      // 0f: goto 13
      // 12: athrow
      // 13: return
      // 14: athrow
      // 15: aload 0
      // 16: getfield qeaa361f143ee4a0894bd168fd9b30c66/qf4ccf8f5435d4a78bdca4d6a018b578e/abaaaaaba.aaa Lqeaa361f143ee4a0894bd168fd9b30c66/qf4ccf8f5435d4a78bdca4d6a018b578e/babbaba;
      // 19: aload 1
      // 1a: bipush 0
      // 1b: bipush 0
      // 1c: aload 2
      // 1d: bipush 1
      // 1e: invokestatic qeaa361f143ee4a0894bd168fd9b30c66/qf4ccf8f5435d4a78bdca4d6a018b578e/aabbabbbb.baababa (Lnet/minecraft/class_9779;Z)F
      // 21: invokevirtual qeaa361f143ee4a0894bd168fd9b30c66/qf4ccf8f5435d4a78bdca4d6a018b578e/babbaba.abbabaa (Lnet/minecraft/class_332;IIF)V
      // 24: return
   }

   public void baab() {
      this.abb();
   }

   public aabbaabab baba() {
      return this.b;
   }

   private void babb() {
      boolean var10000 = a;
      this.bbb = true;
      ab = this;
      boolean var1 = var10000;
      abaaaab.aaa();
      var10000 = var1;
      List var2 = this.abb;

      label50: {
         try {
            if (var10000) {
               return;
            }

            if (var2 != null) {
               break label50;
            }
         } catch (Throwable var7) {
            throw var7;
         }

         this.aba.aabbbb(this.aaa);
         return;
      }

      this.abb = null;

      for (abbaabbaa var4 : var2) {
         try {
            var4.abbbaab(true);
         } catch (Throwable var6) {
         }

         if (var1) {
            break;
         }
      }
   }

   private static void bbaa(class_310 var0) {
      aabbabbbb.aabaaab();
   }

   private void bbab(class_310 param1) {
      // $VF: Couldn't be decompiled
      // Please report this to the Vineflower issue tracker, at https://github.com/Vineflower/vineflower/issues with a copy of the class file (if you have the rights to distribute it!)
      // java.lang.RuntimeException: parsing failure!
      //   at org.jetbrains.java.decompiler.modules.decompiler.decompose.DomHelper.parseGraph(DomHelper.java:211)
      //   at org.jetbrains.java.decompiler.main.rels.MethodProcessor.codeToJava(MethodProcessor.java:166)
      //
      // Bytecode:
      // 00: getstatic qeaa361f143ee4a0894bd168fd9b30c66/qf4ccf8f5435d4a78bdca4d6a018b578e/abaaaaaba.a Z
      // 03: istore 2
      // 04: aload 0
      // 05: iload 2
      // 06: ifne 18
      // 09: getfield qeaa361f143ee4a0894bd168fd9b30c66/qf4ccf8f5435d4a78bdca4d6a018b578e/abaaaaaba.aba Lqeaa361f143ee4a0894bd168fd9b30c66/qf4ccf8f5435d4a78bdca4d6a018b578e/babaaaa;
      // 0c: ifnull 31
      // 0f: goto 13
      // 12: athrow
      // 13: aload 0
      // 14: goto 18
      // 17: athrow
      // 18: iload 2
      // 19: ifne 2e
      // 1c: getfield qeaa361f143ee4a0894bd168fd9b30c66/qf4ccf8f5435d4a78bdca4d6a018b578e/abaaaaaba.aba Lqeaa361f143ee4a0894bd168fd9b30c66/qf4ccf8f5435d4a78bdca4d6a018b578e/babaaaa;
      // 1f: invokevirtual qeaa361f143ee4a0894bd168fd9b30c66/qf4ccf8f5435d4a78bdca4d6a018b578e/babaaaa.aaabb ()Z
      // 22: ifne 31
      // 25: goto 29
      // 28: athrow
      // 29: aload 0
      // 2a: goto 2e
      // 2d: athrow
      // 2e: invokevirtual qeaa361f143ee4a0894bd168fd9b30c66/qf4ccf8f5435d4a78bdca4d6a018b578e/abaaaaaba.ab ()V
      // 31: return
   }

   public static void bbba() {
      aab.shutdownNow();
   }

   public boolean bbbb() {
      // $VF: Couldn't be decompiled
      // Please report this to the Vineflower issue tracker, at https://github.com/Vineflower/vineflower/issues with a copy of the class file (if you have the rights to distribute it!)
      // java.lang.RuntimeException: parsing failure!
      //   at org.jetbrains.java.decompiler.modules.decompiler.decompose.DomHelper.parseGraph(DomHelper.java:211)
      //   at org.jetbrains.java.decompiler.main.rels.MethodProcessor.codeToJava(MethodProcessor.java:166)
      //
      // Bytecode:
      // 00: getstatic qeaa361f143ee4a0894bd168fd9b30c66/qf4ccf8f5435d4a78bdca4d6a018b578e/abaaaaaba.a Z
      // 03: istore 1
      // 04: aload 0
      // 05: iload 1
      // 06: ifne 18
      // 09: getfield qeaa361f143ee4a0894bd168fd9b30c66/qf4ccf8f5435d4a78bdca4d6a018b578e/abaaaaaba.bbb Z
      // 0c: ifeq 3d
      // 0f: goto 13
      // 12: athrow
      // 13: aload 0
      // 14: goto 18
      // 17: athrow
      // 18: getfield qeaa361f143ee4a0894bd168fd9b30c66/qf4ccf8f5435d4a78bdca4d6a018b578e/abaaaaaba.aaab Ljava/util/function/BooleanSupplier;
      // 1b: invokeinterface java/util/function/BooleanSupplier.getAsBoolean ()Z 1
      // 20: iload 1
      // 21: ifne 2e
      // 24: ifeq 3d
      // 27: goto 2b
      // 2a: athrow
      // 2b: invokestatic qeaa361f143ee4a0894bd168fd9b30c66/qf4ccf8f5435d4a78bdca4d6a018b578e/abbabaa.aa ()Z
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

   public static abaaaaaba aaaaa() {
      // $VF: Couldn't be decompiled
      // Please report this to the Vineflower issue tracker, at https://github.com/Vineflower/vineflower/issues with a copy of the class file (if you have the rights to distribute it!)
      // java.lang.RuntimeException: parsing failure!
      //   at org.jetbrains.java.decompiler.modules.decompiler.decompose.DomHelper.parseGraph(DomHelper.java:211)
      //   at org.jetbrains.java.decompiler.main.rels.MethodProcessor.codeToJava(MethodProcessor.java:166)
      //
      // Bytecode:
      // 00: getstatic qeaa361f143ee4a0894bd168fd9b30c66/qf4ccf8f5435d4a78bdca4d6a018b578e/abaaaaaba.a Z
      // 03: getstatic qeaa361f143ee4a0894bd168fd9b30c66/qf4ccf8f5435d4a78bdca4d6a018b578e/abaaaaaba.ab Lqeaa361f143ee4a0894bd168fd9b30c66/qf4ccf8f5435d4a78bdca4d6a018b578e/abaaaaaba;
      // 06: astore 1
      // 07: istore 0
      // 08: aload 1
      // 09: iload 0
      // 0a: ifne 15
      // 0d: ifnull 2b
      // 10: goto 14
      // 13: athrow
      // 14: aload 1
      // 15: iload 0
      // 16: ifne 28
      // 19: invokevirtual qeaa361f143ee4a0894bd168fd9b30c66/qf4ccf8f5435d4a78bdca4d6a018b578e/abaaaaaba.bbbb ()Z
      // 1c: ifeq 2b
      // 1f: goto 23
      // 22: athrow
      // 23: aload 1
      // 24: goto 28
      // 27: athrow
      // 28: goto 2c
      // 2b: aconst_null
      // 2c: areturn
   }

   public void aaaab() {
      this.aaaba(bababbab.bb);
   }

   private void aaaba(bababbab param1) {
      // $VF: Couldn't be decompiled
      // Please report this to the Vineflower issue tracker, at https://github.com/Vineflower/vineflower/issues with a copy of the class file (if you have the rights to distribute it!)
      // java.lang.RuntimeException: parsing failure!
      //   at org.jetbrains.java.decompiler.modules.decompiler.decompose.DomHelper.parseGraph(DomHelper.java:211)
      //   at org.jetbrains.java.decompiler.main.rels.MethodProcessor.codeToJava(MethodProcessor.java:166)
      //
      // Bytecode:
      // 00: getstatic qeaa361f143ee4a0894bd168fd9b30c66/qf4ccf8f5435d4a78bdca4d6a018b578e/abaaaaaba.a Z
      // 03: istore 2
      // 04: aload 0
      // 05: invokevirtual qeaa361f143ee4a0894bd168fd9b30c66/qf4ccf8f5435d4a78bdca4d6a018b578e/abaaaaaba.bbbb ()Z
      // 08: ifne 0d
      // 0b: return
      // 0c: athrow
      // 0d: invokestatic net/minecraft/class_310.method_1551 ()Lnet/minecraft/class_310;
      // 10: astore 3
      // 11: aload 3
      // 12: iload 2
      // 13: ifne 1f
      // 16: ifnonnull 1e
      // 19: goto 1d
      // 1c: athrow
      // 1d: return
      // 1e: aload 3
      // 1f: getfield net/minecraft/class_310.field_1755 Lnet/minecraft/class_437;
      // 22: astore 5
      // 24: aload 5
      // 26: iload 2
      // 27: ifne 3a
      // 2a: instanceof qeaa361f143ee4a0894bd168fd9b30c66/qf4ccf8f5435d4a78bdca4d6a018b578e/baaba
      // 2d: ifeq 75
      // 30: goto 34
      // 33: athrow
      // 34: aload 5
      // 36: goto 3a
      // 39: athrow
      // 3a: checkcast qeaa361f143ee4a0894bd168fd9b30c66/qf4ccf8f5435d4a78bdca4d6a018b578e/baaba
      // 3d: astore 4
      // 3f: iload 2
      // 40: ifne 64
      // 43: aload 4
      // 45: invokevirtual qeaa361f143ee4a0894bd168fd9b30c66/qf4ccf8f5435d4a78bdca4d6a018b578e/baaba.aabbab ()Z
      // 48: ifeq 56
      // 4b: goto 4f
      // 4e: athrow
      // 4f: aload 4
      // 51: invokevirtual qeaa361f143ee4a0894bd168fd9b30c66/qf4ccf8f5435d4a78bdca4d6a018b578e/baaba.baabbba ()V
      // 54: return
      // 55: athrow
      // 56: aload 4
      // 58: iload 2
      // 59: ifne 71
      // 5c: aload 1
      // 5d: invokevirtual qeaa361f143ee4a0894bd168fd9b30c66/qf4ccf8f5435d4a78bdca4d6a018b578e/baaba.bbaaba (Lqeaa361f143ee4a0894bd168fd9b30c66/qf4ccf8f5435d4a78bdca4d6a018b578e/bababbab;)V
      // 60: goto 64
      // 63: athrow
      // 64: aload 1
      // 65: getstatic qeaa361f143ee4a0894bd168fd9b30c66/qf4ccf8f5435d4a78bdca4d6a018b578e/bababbab.a Lqeaa361f143ee4a0894bd168fd9b30c66/qf4ccf8f5435d4a78bdca4d6a018b578e/bababbab;
      // 68: if_acmpne 74
      // 6b: aload 4
      // 6d: goto 71
      // 70: athrow
      // 71: invokevirtual qeaa361f143ee4a0894bd168fd9b30c66/qf4ccf8f5435d4a78bdca4d6a018b578e/baaba.method_25419 ()V
      // 74: return
      // 75: aload 3
      // 76: iload 2
      // 77: ifne 89
      // 7a: getfield net/minecraft/class_310.field_1724 Lnet/minecraft/class_746;
      // 7d: ifnull 97
      // 80: goto 84
      // 83: athrow
      // 84: aload 3
      // 85: goto 89
      // 88: athrow
      // 89: iload 2
      // 8a: ifne 9e
      // 8d: getfield net/minecraft/class_310.field_1687 Lnet/minecraft/class_638;
      // 90: ifnonnull 99
      // 93: goto 97
      // 96: athrow
      // 97: return
      // 98: athrow
      // 99: aload 0
      // 9a: invokevirtual qeaa361f143ee4a0894bd168fd9b30c66/qf4ccf8f5435d4a78bdca4d6a018b578e/abaaaaaba.abb ()V
      // 9d: aload 3
      // 9e: new qeaa361f143ee4a0894bd168fd9b30c66/qf4ccf8f5435d4a78bdca4d6a018b578e/baaba
      // a1: dup
      // a2: aload 0
      // a3: aload 1
      // a4: invokespecial qeaa361f143ee4a0894bd168fd9b30c66/qf4ccf8f5435d4a78bdca4d6a018b578e/baaba.<init> (Lqeaa361f143ee4a0894bd168fd9b30c66/qf4ccf8f5435d4a78bdca4d6a018b578e/abaaaaaba;Lqeaa361f143ee4a0894bd168fd9b30c66/qf4ccf8f5435d4a78bdca4d6a018b578e/bababbab;)V
      // a7: invokevirtual net/minecraft/class_310.method_1507 (Lnet/minecraft/class_437;)V
      // aa: return
   }

   public aabbaaab a() {
      return this.bab;
   }

   public baaaabaa aaabb() {
      return this.aaba;
   }

   private void aabaa() {
      // $VF: Couldn't be decompiled
      // Please report this to the Vineflower issue tracker, at https://github.com/Vineflower/vineflower/issues with a copy of the class file (if you have the rights to distribute it!)
      // java.lang.RuntimeException: parsing failure!
      //   at org.jetbrains.java.decompiler.modules.decompiler.decompose.DomHelper.parseGraph(DomHelper.java:211)
      //   at org.jetbrains.java.decompiler.main.rels.MethodProcessor.codeToJava(MethodProcessor.java:166)
      //
      // Bytecode:
      // 00: getstatic qeaa361f143ee4a0894bd168fd9b30c66/qf4ccf8f5435d4a78bdca4d6a018b578e/abaaaaaba.a Z
      // 03: istore 1
      // 04: aload 0
      // 05: iload 1
      // 06: ifne 6d
      // 09: getfield qeaa361f143ee4a0894bd168fd9b30c66/qf4ccf8f5435d4a78bdca4d6a018b578e/abaaaaaba.aaa Lqeaa361f143ee4a0894bd168fd9b30c66/qf4ccf8f5435d4a78bdca4d6a018b578e/babbaba;
      // 0c: ifnull 15
      // 0f: goto 13
      // 12: athrow
      // 13: return
      // 14: athrow
      // 15: aload 0
      // 16: new qeaa361f143ee4a0894bd168fd9b30c66/qf4ccf8f5435d4a78bdca4d6a018b578e/baaaabaa
      // 19: dup
      // 1a: invokespecial qeaa361f143ee4a0894bd168fd9b30c66/qf4ccf8f5435d4a78bdca4d6a018b578e/baaaabaa.<init> ()V
      // 1d: putfield qeaa361f143ee4a0894bd168fd9b30c66/qf4ccf8f5435d4a78bdca4d6a018b578e/abaaaaaba.aaba Lqeaa361f143ee4a0894bd168fd9b30c66/qf4ccf8f5435d4a78bdca4d6a018b578e/baaaabaa;
      // 20: aload 0
      // 21: new qeaa361f143ee4a0894bd168fd9b30c66/qf4ccf8f5435d4a78bdca4d6a018b578e/babbaba
      // 24: dup
      // 25: aload 0
      // 26: getfield qeaa361f143ee4a0894bd168fd9b30c66/qf4ccf8f5435d4a78bdca4d6a018b578e/abaaaaaba.aaba Lqeaa361f143ee4a0894bd168fd9b30c66/qf4ccf8f5435d4a78bdca4d6a018b578e/baaaabaa;
      // 29: invokespecial qeaa361f143ee4a0894bd168fd9b30c66/qf4ccf8f5435d4a78bdca4d6a018b578e/babbaba.<init> (Lqeaa361f143ee4a0894bd168fd9b30c66/qf4ccf8f5435d4a78bdca4d6a018b578e/baaaabaa;)V
      // 2c: putfield qeaa361f143ee4a0894bd168fd9b30c66/qf4ccf8f5435d4a78bdca4d6a018b578e/abaaaaaba.aaa Lqeaa361f143ee4a0894bd168fd9b30c66/qf4ccf8f5435d4a78bdca4d6a018b578e/babbaba;
      // 2f: aload 0
      // 30: getfield qeaa361f143ee4a0894bd168fd9b30c66/qf4ccf8f5435d4a78bdca4d6a018b578e/abaaaaaba.aaa Lqeaa361f143ee4a0894bd168fd9b30c66/qf4ccf8f5435d4a78bdca4d6a018b578e/babbaba;
      // 33: aload 0
      // 34: invokedynamic getAsBoolean (Lqeaa361f143ee4a0894bd168fd9b30c66/qf4ccf8f5435d4a78bdca4d6a018b578e/abaaaaaba;)Ljava/util/function/BooleanSupplier; bsm=java/lang/invoke/LambdaMetafactory.metafactory (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;Ljava/lang/invoke/MethodType;Ljava/lang/invoke/MethodHandle;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[ ()Z, qeaa361f143ee4a0894bd168fd9b30c66/qf4ccf8f5435d4a78bdca4d6a018b578e/abaaaaaba.bbbb ()Z, ()Z ]
      // 39: invokevirtual qeaa361f143ee4a0894bd168fd9b30c66/qf4ccf8f5435d4a78bdca4d6a018b578e/babbaba.abbabb (Ljava/util/function/BooleanSupplier;)V
      // 3c: aload 0
      // 3d: new qeaa361f143ee4a0894bd168fd9b30c66/qf4ccf8f5435d4a78bdca4d6a018b578e/babaaaa
      // 40: dup
      // 41: invokespecial qeaa361f143ee4a0894bd168fd9b30c66/qf4ccf8f5435d4a78bdca4d6a018b578e/babaaaa.<init> ()V
      // 44: putfield qeaa361f143ee4a0894bd168fd9b30c66/qf4ccf8f5435d4a78bdca4d6a018b578e/abaaaaaba.aba Lqeaa361f143ee4a0894bd168fd9b30c66/qf4ccf8f5435d4a78bdca4d6a018b578e/babaaaa;
      // 47: aload 0
      // 48: new qeaa361f143ee4a0894bd168fd9b30c66/qf4ccf8f5435d4a78bdca4d6a018b578e/bbaabbb
      // 4b: dup
      // 4c: invokespecial qeaa361f143ee4a0894bd168fd9b30c66/qf4ccf8f5435d4a78bdca4d6a018b578e/bbaabbb.<init> ()V
      // 4f: putfield qeaa361f143ee4a0894bd168fd9b30c66/qf4ccf8f5435d4a78bdca4d6a018b578e/abaaaaaba.aaaa Lqeaa361f143ee4a0894bd168fd9b30c66/qf4ccf8f5435d4a78bdca4d6a018b578e/bbaabbb;
      // 52: aload 0
      // 53: new qeaa361f143ee4a0894bd168fd9b30c66/qf4ccf8f5435d4a78bdca4d6a018b578e/aabbaaab
      // 56: dup
      // 57: aload 0
      // 58: getfield qeaa361f143ee4a0894bd168fd9b30c66/qf4ccf8f5435d4a78bdca4d6a018b578e/abaaaaaba.aba Lqeaa361f143ee4a0894bd168fd9b30c66/qf4ccf8f5435d4a78bdca4d6a018b578e/babaaaa;
      // 5b: invokespecial qeaa361f143ee4a0894bd168fd9b30c66/qf4ccf8f5435d4a78bdca4d6a018b578e/aabbaaab.<init> (Lqeaa361f143ee4a0894bd168fd9b30c66/qf4ccf8f5435d4a78bdca4d6a018b578e/babaaaa;)V
      // 5e: putfield qeaa361f143ee4a0894bd168fd9b30c66/qf4ccf8f5435d4a78bdca4d6a018b578e/abaaaaaba.bab Lqeaa361f143ee4a0894bd168fd9b30c66/qf4ccf8f5435d4a78bdca4d6a018b578e/aabbaaab;
      // 61: aload 0
      // 62: new qeaa361f143ee4a0894bd168fd9b30c66/qf4ccf8f5435d4a78bdca4d6a018b578e/aabbaabab
      // 65: dup
      // 66: invokespecial qeaa361f143ee4a0894bd168fd9b30c66/qf4ccf8f5435d4a78bdca4d6a018b578e/aabbaabab.<init> ()V
      // 69: putfield qeaa361f143ee4a0894bd168fd9b30c66/qf4ccf8f5435d4a78bdca4d6a018b578e/abaaaaaba.b Lqeaa361f143ee4a0894bd168fd9b30c66/qf4ccf8f5435d4a78bdca4d6a018b578e/aabbaabab;
      // 6c: aload 0
      // 6d: getfield qeaa361f143ee4a0894bd168fd9b30c66/qf4ccf8f5435d4a78bdca4d6a018b578e/abaaaaaba.bb Ljava/lang/Runnable;
      // 70: invokeinterface java/lang/Runnable.run ()V 1
      // 75: return
   }

   private boolean aabab() {
      return true;
   }

   public void onInitializeClient() {
      // $VF: Couldn't be decompiled
      // Please report this to the Vineflower issue tracker, at https://github.com/Vineflower/vineflower/issues with a copy of the class file (if you have the rights to distribute it!)
      // java.lang.RuntimeException: parsing failure!
      //   at org.jetbrains.java.decompiler.modules.decompiler.decompose.DomHelper.parseGraph(DomHelper.java:211)
      //   at org.jetbrains.java.decompiler.main.rels.MethodProcessor.codeToJava(MethodProcessor.java:166)
      //
      // Bytecode:
      // 00: getstatic qeaa361f143ee4a0894bd168fd9b30c66/qf4ccf8f5435d4a78bdca4d6a018b578e/abaaaaaba.a Z
      // 03: istore 1
      // 04: aload 0
      // 05: iload 1
      // 06: ifne 53
      // 09: getfield qeaa361f143ee4a0894bd168fd9b30c66/qf4ccf8f5435d4a78bdca4d6a018b578e/abaaaaaba.baa Z
      // 0c: ifne 23
      // 0f: goto 13
      // 12: athrow
      // 13: aload 0
      // 14: invokevirtual qeaa361f143ee4a0894bd168fd9b30c66/qf4ccf8f5435d4a78bdca4d6a018b578e/abaaaaaba.aabaa ()V
      // 17: aload 0
      // 18: invokevirtual qeaa361f143ee4a0894bd168fd9b30c66/qf4ccf8f5435d4a78bdca4d6a018b578e/abaaaaaba.babb ()V
      // 1b: aload 0
      // 1c: invokevirtual qeaa361f143ee4a0894bd168fd9b30c66/qf4ccf8f5435d4a78bdca4d6a018b578e/abaaaaaba.ab ()V
      // 1f: goto 23
      // 22: athrow
      // 23: getstatic net/fabricmc/fabric/api/client/event/lifecycle/v1/ClientTickEvents.START_CLIENT_TICK Lnet/fabricmc/fabric/api/event/Event;
      // 26: aload 0
      // 27: invokedynamic onStartTick (Lqeaa361f143ee4a0894bd168fd9b30c66/qf4ccf8f5435d4a78bdca4d6a018b578e/abaaaaaba;)Lnet/fabricmc/fabric/api/client/event/lifecycle/v1/ClientTickEvents$StartTick; bsm=java/lang/invoke/LambdaMetafactory.metafactory (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;Ljava/lang/invoke/MethodType;Ljava/lang/invoke/MethodHandle;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[ (Lnet/minecraft/class_310;)V, qeaa361f143ee4a0894bd168fd9b30c66/qf4ccf8f5435d4a78bdca4d6a018b578e/abaaaaaba.baa (Lnet/minecraft/class_310;)V, (Lnet/minecraft/class_310;)V ]
      // 2c: invokevirtual net/fabricmc/fabric/api/event/Event.register (Ljava/lang/Object;)V
      // 2f: getstatic net/fabricmc/fabric/api/client/event/lifecycle/v1/ClientTickEvents.END_CLIENT_TICK Lnet/fabricmc/fabric/api/event/Event;
      // 32: invokedynamic onEndTick ()Lnet/fabricmc/fabric/api/client/event/lifecycle/v1/ClientTickEvents$EndTick; bsm=java/lang/invoke/LambdaMetafactory.metafactory (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;Ljava/lang/invoke/MethodType;Ljava/lang/invoke/MethodHandle;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[ (Lnet/minecraft/class_310;)V, qeaa361f143ee4a0894bd168fd9b30c66/qf4ccf8f5435d4a78bdca4d6a018b578e/abaaaaaba.bbaa (Lnet/minecraft/class_310;)V, (Lnet/minecraft/class_310;)V ]
      // 37: invokevirtual net/fabricmc/fabric/api/event/Event.register (Ljava/lang/Object;)V
      // 3a: getstatic net/fabricmc/fabric/api/client/rendering/v1/HudRenderCallback.EVENT Lnet/fabricmc/fabric/api/event/Event;
      // 3d: aload 0
      // 3e: invokedynamic onHudRender (Lqeaa361f143ee4a0894bd168fd9b30c66/qf4ccf8f5435d4a78bdca4d6a018b578e/abaaaaaba;)Lnet/fabricmc/fabric/api/client/rendering/v1/HudRenderCallback; bsm=java/lang/invoke/LambdaMetafactory.metafactory (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;Ljava/lang/invoke/MethodType;Ljava/lang/invoke/MethodHandle;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[ (Lnet/minecraft/class_332;Lnet/minecraft/class_9779;)V, qeaa361f143ee4a0894bd168fd9b30c66/qf4ccf8f5435d4a78bdca4d6a018b578e/abaaaaaba.baaa (Lnet/minecraft/class_332;Lnet/minecraft/class_9779;)V, (Lnet/minecraft/class_332;Lnet/minecraft/class_9779;)V ]
      // 43: invokevirtual net/fabricmc/fabric/api/event/Event.register (Ljava/lang/Object;)V
      // 46: getstatic qeaa361f143ee4a0894bd168fd9b30c66/qf4ccf8f5435d4a78bdca4d6a018b578e/bbbababa.aa Lqeaa361f143ee4a0894bd168fd9b30c66/qf4ccf8f5435d4a78bdca4d6a018b578e/aaabaabb;
      // 49: aload 0
      // 4a: invokedynamic a (Lqeaa361f143ee4a0894bd168fd9b30c66/qf4ccf8f5435d4a78bdca4d6a018b578e/abaaaaaba;)Lqeaa361f143ee4a0894bd168fd9b30c66/qf4ccf8f5435d4a78bdca4d6a018b578e/aaaabbbab; bsm=java/lang/invoke/LambdaMetafactory.metafactory (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;Ljava/lang/invoke/MethodType;Ljava/lang/invoke/MethodHandle;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[ (Lqeaa361f143ee4a0894bd168fd9b30c66/qf4ccf8f5435d4a78bdca4d6a018b578e/aabbbbaaa;)V, qeaa361f143ee4a0894bd168fd9b30c66/qf4ccf8f5435d4a78bdca4d6a018b578e/abaaaaaba.bba (Lqeaa361f143ee4a0894bd168fd9b30c66/qf4ccf8f5435d4a78bdca4d6a018b578e/aabbbbaaa;)V, (Lqeaa361f143ee4a0894bd168fd9b30c66/qf4ccf8f5435d4a78bdca4d6a018b578e/aabbbbaaa;)V ]
      // 4f: invokevirtual qeaa361f143ee4a0894bd168fd9b30c66/qf4ccf8f5435d4a78bdca4d6a018b578e/aaabaabb.b (Lqeaa361f143ee4a0894bd168fd9b30c66/qf4ccf8f5435d4a78bdca4d6a018b578e/aaaabbbab;)V
      // 52: aload 0
      // 53: new java/lang/Thread
      // 56: dup
      // 57: aload 0
      // 58: invokedynamic run (Lqeaa361f143ee4a0894bd168fd9b30c66/qf4ccf8f5435d4a78bdca4d6a018b578e/abaaaaaba;)Ljava/lang/Runnable; bsm=java/lang/invoke/LambdaMetafactory.metafactory (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;Ljava/lang/invoke/MethodType;Ljava/lang/invoke/MethodHandle;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[ ()V, qeaa361f143ee4a0894bd168fd9b30c66/qf4ccf8f5435d4a78bdca4d6a018b578e/abaaaaaba.ba ()V, ()V ]
      // 5d: invokespecial java/lang/Thread.<init> (Ljava/lang/Runnable;)V
      // 60: putfield qeaa361f143ee4a0894bd168fd9b30c66/qf4ccf8f5435d4a78bdca4d6a018b578e/abaaaaaba.aa Ljava/lang/Thread;
      // 63: invokestatic java/lang/Runtime.getRuntime ()Ljava/lang/Runtime;
      // 66: aload 0
      // 67: getfield qeaa361f143ee4a0894bd168fd9b30c66/qf4ccf8f5435d4a78bdca4d6a018b578e/abaaaaaba.aa Ljava/lang/Thread;
      // 6a: invokevirtual java/lang/Runtime.addShutdownHook (Ljava/lang/Thread;)V
      // 6d: getstatic net/fabricmc/fabric/api/client/event/lifecycle/v1/ClientLifecycleEvents.CLIENT_STOPPING Lnet/fabricmc/fabric/api/event/Event;
      // 70: aload 0
      // 71: invokedynamic onClientStopping (Lqeaa361f143ee4a0894bd168fd9b30c66/qf4ccf8f5435d4a78bdca4d6a018b578e/abaaaaaba;)Lnet/fabricmc/fabric/api/client/event/lifecycle/v1/ClientLifecycleEvents$ClientStopping; bsm=java/lang/invoke/LambdaMetafactory.metafactory (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;Ljava/lang/invoke/MethodType;Ljava/lang/invoke/MethodHandle;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[ (Lnet/minecraft/class_310;)V, qeaa361f143ee4a0894bd168fd9b30c66/qf4ccf8f5435d4a78bdca4d6a018b578e/abaaaaaba.bbab (Lnet/minecraft/class_310;)V, (Lnet/minecraft/class_310;)V ]
      // 76: invokevirtual net/fabricmc/fabric/api/event/Event.register (Ljava/lang/Object;)V
      // 79: getstatic qeaa361f143ee4a0894bd168fd9b30c66/qf4ccf8f5435d4a78bdca4d6a018b578e/abbaabbaa.baaaaba I
      // 7c: ifeq 90
      // 7f: iload 1
      // 80: ifeq 8c
      // 83: goto 87
      // 86: athrow
      // 87: bipush 0
      // 88: goto 8d
      // 8b: athrow
      // 8c: bipush 1
      // 8d: putstatic qeaa361f143ee4a0894bd168fd9b30c66/qf4ccf8f5435d4a78bdca4d6a018b578e/abaaaaaba.a Z
      // 90: return
   }
}
