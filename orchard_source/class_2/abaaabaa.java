package nsc;

import java.util.ArrayDeque;
import java.util.Deque;
import java.util.Iterator;
import java.util.concurrent.atomic.AtomicLong;
import net.fabricmc.api.EnvType;
import net.fabricmc.api.Environment;

@Environment(EnvType.CLIENT)
public final class abaaabaa {
   private static final long aa;
   private static final Long[] a;
   private static final Object[] abb;
   private static final Integer[] ab;
   private static final long[] ba;
   private static final int[] aab;
   private static final String[] aba;
   private static final long[] bb;
   private final Deque aaa = new ArrayDeque();
   private final AtomicLong b = new AtomicLong();

   public synchronized boolean aa(
      abbbaaa param1,
      abaabbba param2,
      int param3,
      bbbabbab param4,
      int param5
   ) {
      // $VF: Couldn't be decompiled
      // Please report this to the Vineflower issue tracker, at https://github.com/Vineflower/vineflower/issues with a copy of the class file (if you have the rights to distribute it!)
      // java.lang.RuntimeException: parsing failure!
      //   at org.jetbrains.java.decompiler.modules.decompiler.decompose.DomHelper.parseGraph(DomHelper.java:211)
      //   at org.jetbrains.java.decompiler.main.rels.MethodProcessor.codeToJava(MethodProcessor.java:166)
      //
      // Bytecode:
      // 00: getstatic qeaa361f143ee4a0894bd168fd9b30c66/qf4ccf8f5435d4a78bdca4d6a018b578e/baaabbaa.bba I
      // 03: istore 6
      // 05: aload 1
      // 06: aload 2
      // 07: iload 6
      // 09: ifne 19
      // 0c: ifnonnull 18
      // 0f: goto 13
      // 12: athrow
      // 13: aconst_null
      // 14: goto 1c
      // 17: athrow
      // 18: aload 2
      // 19: invokevirtual qeaa361f143ee4a0894bd168fd9b30c66/qf4ccf8f5435d4a78bdca4d6a018b578e/abaabbba.a ()Ljava/lang/Object;
      // 1c: iload 3
      // 1d: aload 4
      // 1f: invokestatic qeaa361f143ee4a0894bd168fd9b30c66/qf4ccf8f5435d4a78bdca4d6a018b578e/abaaabaa.aaaab (Lqeaa361f143ee4a0894bd168fd9b30c66/qf4ccf8f5435d4a78bdca4d6a018b578e/abbbaaa;Ljava/lang/Object;ILqeaa361f143ee4a0894bd168fd9b30c66/qf4ccf8f5435d4a78bdca4d6a018b578e/bbbabbab;)Z
      // 22: iload 6
      // 24: ifne 61
      // 27: ifeq 5c
      // 2a: goto 2e
      // 2d: athrow
      // 2e: aload 2
      // 2f: invokevirtual qeaa361f143ee4a0894bd168fd9b30c66/qf4ccf8f5435d4a78bdca4d6a018b578e/abaabbba.ab ()J
      // 32: lconst_0
      // 33: lcmp
      // 34: iload 6
      // 36: ifne 61
      // 39: goto 3d
      // 3c: athrow
      // 3d: ifeq 5c
      // 40: goto 44
      // 43: athrow
      // 44: aload 1
      // 45: invokeinterface qeaa361f143ee4a0894bd168fd9b30c66/qf4ccf8f5435d4a78bdca4d6a018b578e/abbbaaa.aa ()I 1
      // 4a: iload 6
      // 4c: ifne 68
      // 4f: goto 53
      // 52: athrow
      // 53: iload 5
      // 55: if_icmpge 62
      // 58: goto 5c
      // 5b: athrow
      // 5c: bipush 0
      // 5d: goto 61
      // 60: athrow
      // 61: ireturn
      // 62: aload 2
      // 63: invokevirtual qeaa361f143ee4a0894bd168fd9b30c66/qf4ccf8f5435d4a78bdca4d6a018b578e/abaabbba.ab ()J
      // 66: lconst_0
      // 67: lcmp
      // 68: iload 6
      // 6a: ifne 87
      // 6d: ifge 7f
      // 70: goto 74
      // 73: athrow
      // 74: aload 1
      // 75: aload 4
      // 77: iload 3
      // 78: invokeinterface qeaa361f143ee4a0894bd168fd9b30c66/qf4ccf8f5435d4a78bdca4d6a018b578e/abbbaaa.ab (Lqeaa361f143ee4a0894bd168fd9b30c66/qf4ccf8f5435d4a78bdca4d6a018b578e/bbbabbab;I)Z 3
      // 7d: ireturn
      // 7e: athrow
      // 7f: aload 0
      // 80: aload 1
      // 81: aload 2
      // 82: iload 5
      // 84: invokevirtual qeaa361f143ee4a0894bd168fd9b30c66/qf4ccf8f5435d4a78bdca4d6a018b578e/abaaabaa.baaa (Lqeaa361f143ee4a0894bd168fd9b30c66/qf4ccf8f5435d4a78bdca4d6a018b578e/abbbaaa;Lqeaa361f143ee4a0894bd168fd9b30c66/qf4ccf8f5435d4a78bdca4d6a018b578e/abaabbba;I)Z
      // 87: ireturn
   }

   public synchronized boolean ab() {
      int var1 = baaabbaa.bba;
      aaabbaaba var2 = (aaabbaaba)this.aaa.peekFirst();

      aaabbaaba var10000;
      label27: {
         try {
            var10000 = var2;
            if (var1 != 0) {
               break label27;
            }

            if (var2 == null) {
               return false;
            }
         } catch (MatchException var4) {
            throw var4;
         }

         var10000 = var2;
      }

      try {
         if (var10000.b == bbbabbab.b) {
            return true;
         }
      } catch (MatchException var3) {
         throw var3;
      }

      return false;
   }

   private static int aabab(int var0, int var1) {
      int var2 = aab[var0 ^ -1836150830] ^ var1 ^ var0;
      var2 += 39568;
      var2 ^= 4936;
      var2 ^= 9041;
      var2 -= 26592;
      var2 ^= 4604;
      var2 -= 11130;
      var2 += 32357;
      return var2 ^ 17761;
   }

   public synchronized boolean ba(Object param1, int param2) {
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
      // 05: getfield qeaa361f143ee4a0894bd168fd9b30c66/qf4ccf8f5435d4a78bdca4d6a018b578e/abaaabaa.aaa Ljava/util/Deque;
      // 08: invokeinterface java/util/Deque.peekFirst ()Ljava/lang/Object; 1
      // 0d: checkcast qeaa361f143ee4a0894bd168fd9b30c66/qf4ccf8f5435d4a78bdca4d6a018b578e/aaabbaaba
      // 10: astore 4
      // 12: aload 1
      // 13: ifnull 83
      // 16: iload 2
      // 17: iload 3
      // 18: ifne 88
      // 1b: goto 1f
      // 1e: athrow
      // 1f: iflt 83
      // 22: goto 26
      // 25: athrow
      // 26: iload 2
      // 27: iload 3
      // 28: ifne 88
      // 2b: goto 2f
      // 2e: athrow
      // 2f: ldc -1836150834
      // 31: ldc 1136007175
      // 33: ldc -1905097080
      // 35: ixor
      // 36: invokestatic qeaa361f143ee4a0894bd168fd9b30c66/qf4ccf8f5435d4a78bdca4d6a018b578e/abaaabaa.aabab (II)I
      // 39: ldc2_w 2624808371382612161
      // 3c: invokestatic qeaa361f143ee4a0894bd168fd9b30c66/qf4ccf8f5435d4a78bdca4d6a018b578e/abaaabaa.abba (IJ)I
      // 3f: if_icmpgt 83
      // 42: goto 46
      // 45: athrow
      // 46: aload 4
      // 48: iload 3
      // 49: ifne 6b
      // 4c: goto 50
      // 4f: athrow
      // 50: ifnull 83
      // 53: goto 57
      // 56: athrow
      // 57: aload 4
      // 59: iload 3
      // 5a: ifne 75
      // 5d: goto 61
      // 60: athrow
      // 61: getfield qeaa361f143ee4a0894bd168fd9b30c66/qf4ccf8f5435d4a78bdca4d6a018b578e/aaabbaaba.aba Lqeaa361f143ee4a0894bd168fd9b30c66/qf4ccf8f5435d4a78bdca4d6a018b578e/abaabbba;
      // 64: invokevirtual qeaa361f143ee4a0894bd168fd9b30c66/qf4ccf8f5435d4a78bdca4d6a018b578e/abaabbba.a ()Ljava/lang/Object;
      // 67: goto 6b
      // 6a: athrow
      // 6b: aload 1
      // 6c: if_acmpne 83
      // 6f: aload 4
      // 71: goto 75
      // 74: athrow
      // 75: iload 3
      // 76: ifne 8b
      // 79: getfield qeaa361f143ee4a0894bd168fd9b30c66/qf4ccf8f5435d4a78bdca4d6a018b578e/aaabbaaba.aa Z
      // 7c: ifeq 89
      // 7f: goto 83
      // 82: athrow
      // 83: bipush 0
      // 84: goto 88
      // 87: athrow
      // 88: ireturn
      // 89: aload 4
      // 8b: iload 2
      // 8c: putfield qeaa361f143ee4a0894bd168fd9b30c66/qf4ccf8f5435d4a78bdca4d6a018b578e/aaabbaaba.a I
      // 8f: bipush 1
      // 90: ireturn
   }

   public synchronized boolean bb() {
      int var1 = baaabbaa.bba;

      try {
         boolean var10000 = this.aaa.isEmpty();
         if (var1 != 0) {
            return var10000;
         }

         if (!var10000) {
            return true;
         }
      } catch (MatchException var2) {
         throw var2;
      }

      return false;
   }

   public synchronized void aaa(
      abbbaaa param1, abaabbba param2, abbaaabba param3
   ) {
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
      // 06: aload 2
      // 07: invokevirtual qeaa361f143ee4a0894bd168fd9b30c66/qf4ccf8f5435d4a78bdca4d6a018b578e/abaaabaa.babb (Lqeaa361f143ee4a0894bd168fd9b30c66/qf4ccf8f5435d4a78bdca4d6a018b578e/abaabbba;)Lqeaa361f143ee4a0894bd168fd9b30c66/qf4ccf8f5435d4a78bdca4d6a018b578e/aaabbaaba;
      // 0a: astore 5
      // 0c: iload 4
      // 0e: ifne 30
      // 11: aload 5
      // 13: ifnonnull 1c
      // 16: goto 1a
      // 19: athrow
      // 1a: return
      // 1b: athrow
      // 1c: aload 0
      // 1d: iload 4
      // 1f: ifne 54
      // 22: aload 5
      // 24: invokevirtual qeaa361f143ee4a0894bd168fd9b30c66/qf4ccf8f5435d4a78bdca4d6a018b578e/abaaabaa.bbab (Lqeaa361f143ee4a0894bd168fd9b30c66/qf4ccf8f5435d4a78bdca4d6a018b578e/aaabbaaba;)V
      // 27: aload 5
      // 29: invokestatic qeaa361f143ee4a0894bd168fd9b30c66/qf4ccf8f5435d4a78bdca4d6a018b578e/abaaabaa.aaaba (Lqeaa361f143ee4a0894bd168fd9b30c66/qf4ccf8f5435d4a78bdca4d6a018b578e/aaabbaaba;)V
      // 2c: goto 30
      // 2f: athrow
      // 30: aload 3
      // 31: getstatic qeaa361f143ee4a0894bd168fd9b30c66/qf4ccf8f5435d4a78bdca4d6a018b578e/abbaaabba.aba Lqeaa361f143ee4a0894bd168fd9b30c66/qf4ccf8f5435d4a78bdca4d6a018b578e/abbaaabba;
      // 34: if_acmpne 47
      // 37: aload 0
      // 38: aload 1
      // 39: aload 5
      // 3b: invokevirtual qeaa361f143ee4a0894bd168fd9b30c66/qf4ccf8f5435d4a78bdca4d6a018b578e/abaaabaa.b (Lqeaa361f143ee4a0894bd168fd9b30c66/qf4ccf8f5435d4a78bdca4d6a018b578e/abbbaaa;Lqeaa361f143ee4a0894bd168fd9b30c66/qf4ccf8f5435d4a78bdca4d6a018b578e/aaabbaaba;)V
      // 3e: iload 4
      // 40: ifeq 55
      // 43: goto 47
      // 46: athrow
      // 47: aload 0
      // 48: getfield qeaa361f143ee4a0894bd168fd9b30c66/qf4ccf8f5435d4a78bdca4d6a018b578e/abaaabaa.aaa Ljava/util/Deque;
      // 4b: invokeinterface java/util/Deque.removeFirst ()Ljava/lang/Object; 1
      // 50: goto 54
      // 53: athrow
      // 54: pop
      // 55: aload 3
      // 56: getstatic qeaa361f143ee4a0894bd168fd9b30c66/qf4ccf8f5435d4a78bdca4d6a018b578e/abbaaabba.aba Lqeaa361f143ee4a0894bd168fd9b30c66/qf4ccf8f5435d4a78bdca4d6a018b578e/abbaaabba;
      // 59: if_acmpeq 97
      // 5c: aload 0
      // 5d: iload 4
      // 5f: ifne 82
      // 62: goto 66
      // 65: athrow
      // 66: getfield qeaa361f143ee4a0894bd168fd9b30c66/qf4ccf8f5435d4a78bdca4d6a018b578e/abaaabaa.aaa Ljava/util/Deque;
      // 69: invokeinterface java/util/Deque.isEmpty ()Z 1
      // 6e: ifne 97
      // 71: goto 75
      // 74: athrow
      // 75: aload 0
      // 76: getfield qeaa361f143ee4a0894bd168fd9b30c66/qf4ccf8f5435d4a78bdca4d6a018b578e/abaaabaa.aaa Ljava/util/Deque;
      // 79: invokeinterface java/util/Deque.peekFirst ()Ljava/lang/Object; 1
      // 7e: goto 82
      // 81: athrow
      // 82: checkcast qeaa361f143ee4a0894bd168fd9b30c66/qf4ccf8f5435d4a78bdca4d6a018b578e/aaabbaaba
      // 85: astore 6
      // 87: aload 1
      // 88: aload 6
      // 8a: getfield qeaa361f143ee4a0894bd168fd9b30c66/qf4ccf8f5435d4a78bdca4d6a018b578e/aaabbaaba.b Lqeaa361f143ee4a0894bd168fd9b30c66/qf4ccf8f5435d4a78bdca4d6a018b578e/bbbabbab;
      // 8d: aload 6
      // 8f: getfield qeaa361f143ee4a0894bd168fd9b30c66/qf4ccf8f5435d4a78bdca4d6a018b578e/aaabbaaba.a I
      // 92: invokeinterface qeaa361f143ee4a0894bd168fd9b30c66/qf4ccf8f5435d4a78bdca4d6a018b578e/abbbaaa.ba (Lqeaa361f143ee4a0894bd168fd9b30c66/qf4ccf8f5435d4a78bdca4d6a018b578e/bbbabbab;I)V 3
      // 97: return
   }

   public synchronized boolean aab(Object param1) {
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
      // 06: invokevirtual qeaa361f143ee4a0894bd168fd9b30c66/qf4ccf8f5435d4a78bdca4d6a018b578e/abaaabaa.bbbb (Ljava/lang/Object;)Lqeaa361f143ee4a0894bd168fd9b30c66/qf4ccf8f5435d4a78bdca4d6a018b578e/aaabbaaba;
      // 09: astore 3
      // 0a: iload 2
      // 0b: ifne 1e
      // 0e: aload 3
      // 0f: ifnonnull 19
      // 12: goto 16
      // 15: athrow
      // 16: bipush 0
      // 17: ireturn
      // 18: athrow
      // 19: aload 3
      // 1a: aconst_null
      // 1b: putfield qeaa361f143ee4a0894bd168fd9b30c66/qf4ccf8f5435d4a78bdca4d6a018b578e/aaabbaaba.ba Ljava/lang/Runnable;
      // 1e: aload 0
      // 1f: getfield qeaa361f143ee4a0894bd168fd9b30c66/qf4ccf8f5435d4a78bdca4d6a018b578e/abaaabaa.aaa Ljava/util/Deque;
      // 22: aload 3
      // 23: invokeinterface java/util/Deque.remove (Ljava/lang/Object;)Z 2
      // 28: ireturn
   }

   private static bbbabbab aba(bbbabbab param0) {
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
      // 06: ifne 1a
      // 09: getstatic qeaa361f143ee4a0894bd168fd9b30c66/qf4ccf8f5435d4a78bdca4d6a018b578e/bbbabbab.b Lqeaa361f143ee4a0894bd168fd9b30c66/qf4ccf8f5435d4a78bdca4d6a018b578e/bbbabbab;
      // 0c: if_acmpne 1d
      // 0f: goto 13
      // 12: athrow
      // 13: getstatic qeaa361f143ee4a0894bd168fd9b30c66/qf4ccf8f5435d4a78bdca4d6a018b578e/bbbabbab.b Lqeaa361f143ee4a0894bd168fd9b30c66/qf4ccf8f5435d4a78bdca4d6a018b578e/bbbabbab;
      // 16: goto 1a
      // 19: athrow
      // 1a: goto 1e
      // 1d: aload 0
      // 1e: areturn
   }

   public synchronized bbbabbab abb(Object param1) {
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
      // 05: getfield qeaa361f143ee4a0894bd168fd9b30c66/qf4ccf8f5435d4a78bdca4d6a018b578e/abaaabaa.aaa Ljava/util/Deque;
      // 08: invokeinterface java/util/Deque.peekFirst ()Ljava/lang/Object; 1
      // 0d: checkcast qeaa361f143ee4a0894bd168fd9b30c66/qf4ccf8f5435d4a78bdca4d6a018b578e/aaabbaaba
      // 10: astore 3
      // 11: aload 1
      // 12: ifnull 47
      // 15: aload 3
      // 16: iload 2
      // 17: ifne 38
      // 1a: goto 1e
      // 1d: athrow
      // 1e: ifnull 47
      // 21: goto 25
      // 24: athrow
      // 25: aload 3
      // 26: iload 2
      // 27: ifne 41
      // 2a: goto 2e
      // 2d: athrow
      // 2e: getfield qeaa361f143ee4a0894bd168fd9b30c66/qf4ccf8f5435d4a78bdca4d6a018b578e/aaabbaaba.aba Lqeaa361f143ee4a0894bd168fd9b30c66/qf4ccf8f5435d4a78bdca4d6a018b578e/abaabbba;
      // 31: invokevirtual qeaa361f143ee4a0894bd168fd9b30c66/qf4ccf8f5435d4a78bdca4d6a018b578e/abaabbba.a ()Ljava/lang/Object;
      // 34: goto 38
      // 37: athrow
      // 38: aload 1
      // 39: if_acmpne 47
      // 3c: aload 3
      // 3d: goto 41
      // 40: athrow
      // 41: getfield qeaa361f143ee4a0894bd168fd9b30c66/qf4ccf8f5435d4a78bdca4d6a018b578e/aaabbaaba.b Lqeaa361f143ee4a0894bd168fd9b30c66/qf4ccf8f5435d4a78bdca4d6a018b578e/bbbabbab;
      // 44: goto 48
      // 47: aconst_null
      // 48: areturn
   }

   public synchronized boolean baa(abaabbba var1) {
      try {
         if (this.babb(var1) != null) {
            return true;
         }
      } catch (MatchException var2) {
         throw var2;
      }

      return false;
   }

   public synchronized boolean bab() {
      int var1 = baaabbaa.bba;
      aaabbaaba var2 = (aaabbaaba)this.aaa.peekFirst();

      aaabbaaba var10000;
      label33: {
         try {
            var10000 = var2;
            if (var1 != 0) {
               break label33;
            }

            if (var2 == null) {
               return false;
            }
         } catch (MatchException var4) {
            throw var4;
         }

         var10000 = var2;
      }

      try {
         if (var1 != 0) {
            return var10000.aa;
         }

         if (var10000.aa) {
            return true;
         }
      } catch (MatchException var3) {
         throw var3;
      }

      return false;
   }

   public synchronized abaabbba bba(
      abbbaaa param1,
      Object param2,
      int param3,
      bbbabbab param4,
      int param5,
      boolean param6,
      Runnable param7
   ) {
      // $VF: Couldn't be decompiled
      // Please report this to the Vineflower issue tracker, at https://github.com/Vineflower/vineflower/issues with a copy of the class file (if you have the rights to distribute it!)
      // java.lang.RuntimeException: parsing failure!
      //   at org.jetbrains.java.decompiler.modules.decompiler.decompose.DomHelper.parseGraph(DomHelper.java:211)
      //   at org.jetbrains.java.decompiler.main.rels.MethodProcessor.codeToJava(MethodProcessor.java:166)
      //
      // Bytecode:
      // 00: getstatic qeaa361f143ee4a0894bd168fd9b30c66/qf4ccf8f5435d4a78bdca4d6a018b578e/baaabbaa.bba I
      // 03: istore 8
      // 05: aload 1
      // 06: aload 2
      // 07: iload 3
      // 08: aload 4
      // 0a: invokestatic qeaa361f143ee4a0894bd168fd9b30c66/qf4ccf8f5435d4a78bdca4d6a018b578e/abaaabaa.aaaab (Lqeaa361f143ee4a0894bd168fd9b30c66/qf4ccf8f5435d4a78bdca4d6a018b578e/abbbaaa;Ljava/lang/Object;ILqeaa361f143ee4a0894bd168fd9b30c66/qf4ccf8f5435d4a78bdca4d6a018b578e/bbbabbab;)Z
      // 0d: ifne 1b
      // 10: new qeaa361f143ee4a0894bd168fd9b30c66/qf4ccf8f5435d4a78bdca4d6a018b578e/abaabbba
      // 13: dup
      // 14: lconst_0
      // 15: aload 2
      // 16: invokespecial qeaa361f143ee4a0894bd168fd9b30c66/qf4ccf8f5435d4a78bdca4d6a018b578e/abaabbba.<init> (JLjava/lang/Object;)V
      // 19: areturn
      // 1a: athrow
      // 1b: aload 0
      // 1c: aload 2
      // 1d: invokevirtual qeaa361f143ee4a0894bd168fd9b30c66/qf4ccf8f5435d4a78bdca4d6a018b578e/abaaabaa.bbbb (Ljava/lang/Object;)Lqeaa361f143ee4a0894bd168fd9b30c66/qf4ccf8f5435d4a78bdca4d6a018b578e/aaabbaaba;
      // 20: astore 9
      // 22: aload 0
      // 23: iload 8
      // 25: ifne 4e
      // 28: getfield qeaa361f143ee4a0894bd168fd9b30c66/qf4ccf8f5435d4a78bdca4d6a018b578e/abaaabaa.aaa Ljava/util/Deque;
      // 2b: invokeinterface java/util/Deque.isEmpty ()Z 1
      // 30: ifeq 4d
      // 33: goto 37
      // 36: athrow
      // 37: aload 4
      // 39: getstatic qeaa361f143ee4a0894bd168fd9b30c66/qf4ccf8f5435d4a78bdca4d6a018b578e/bbbabbab.b Lqeaa361f143ee4a0894bd168fd9b30c66/qf4ccf8f5435d4a78bdca4d6a018b578e/bbbabbab;
      // 3c: if_acmpne 4d
      // 3f: goto 43
      // 42: athrow
      // 43: aload 1
      // 44: invokeinterface qeaa361f143ee4a0894bd168fd9b30c66/qf4ccf8f5435d4a78bdca4d6a018b578e/abbbaaa.bb ()I 1
      // 49: goto 52
      // 4c: athrow
      // 4d: aload 0
      // 4e: aload 1
      // 4f: invokevirtual qeaa361f143ee4a0894bd168fd9b30c66/qf4ccf8f5435d4a78bdca4d6a018b578e/abaaabaa.baba (Lqeaa361f143ee4a0894bd168fd9b30c66/qf4ccf8f5435d4a78bdca4d6a018b578e/abbbaaa;)I
      // 52: istore 10
      // 54: aload 9
      // 56: ifnonnull 97
      // 59: iload 10
      // 5b: iload 3
      // 5c: if_icmpne 97
      // 5f: goto 63
      // 62: athrow
      // 63: aload 4
      // 65: getstatic qeaa361f143ee4a0894bd168fd9b30c66/qf4ccf8f5435d4a78bdca4d6a018b578e/bbbabbab.b Lqeaa361f143ee4a0894bd168fd9b30c66/qf4ccf8f5435d4a78bdca4d6a018b578e/bbbabbab;
      // 68: if_acmpne 7d
      // 6b: goto 6f
      // 6e: athrow
      // 6f: aload 1
      // 70: invokeinterface qeaa361f143ee4a0894bd168fd9b30c66/qf4ccf8f5435d4a78bdca4d6a018b578e/abbbaaa.b ()I 1
      // 75: iload 3
      // 76: if_icmpne 97
      // 79: goto 7d
      // 7c: athrow
      // 7d: new qeaa361f143ee4a0894bd168fd9b30c66/qf4ccf8f5435d4a78bdca4d6a018b578e/abaabbba
      // 80: dup
      // 81: ldc -1836150833
      // 83: ldc -1909584310
      // 85: ldc -1143369258
      // 87: ixor
      // 88: invokestatic qeaa361f143ee4a0894bd168fd9b30c66/qf4ccf8f5435d4a78bdca4d6a018b578e/abaaabaa.aabab (II)I
      // 8b: ldc2_w 2107905379958151267
      // 8e: invokestatic qeaa361f143ee4a0894bd168fd9b30c66/qf4ccf8f5435d4a78bdca4d6a018b578e/abaaabaa.aaba (IJ)J
      // 91: aload 2
      // 92: invokespecial qeaa361f143ee4a0894bd168fd9b30c66/qf4ccf8f5435d4a78bdca4d6a018b578e/abaabbba.<init> (JLjava/lang/Object;)V
      // 95: areturn
      // 96: athrow
      // 97: aload 0
      // 98: aload 1
      // 99: aload 2
      // 9a: iload 3
      // 9b: aload 4
      // 9d: iload 5
      // 9f: iload 6
      // a1: aload 7
      // a3: invokevirtual qeaa361f143ee4a0894bd168fd9b30c66/qf4ccf8f5435d4a78bdca4d6a018b578e/abaaabaa.bbba (Lqeaa361f143ee4a0894bd168fd9b30c66/qf4ccf8f5435d4a78bdca4d6a018b578e/abbbaaa;Ljava/lang/Object;ILqeaa361f143ee4a0894bd168fd9b30c66/qf4ccf8f5435d4a78bdca4d6a018b578e/bbbabbab;IZLjava/lang/Runnable;)Lqeaa361f143ee4a0894bd168fd9b30c66/qf4ccf8f5435d4a78bdca4d6a018b578e/abaabbba;
      // a6: areturn
   }

   public synchronized boolean bbb(Object var1) {
      try {
         if (this.bbbb(var1) != null) {
            return true;
         }
      } catch (MatchException var2) {
         throw var2;
      }

      return false;
   }

   private static aaaaab aaaa(int var0) {
      try {
         if (var0 > 0) {
            return aaaaab.aba;
         }
      } catch (MatchException var1) {
         throw var1;
      }

      return aaaaab.abb;
   }

   public synchronized boolean aaab(abaabbba param1, int param2, int param3, aaaaab param4) {
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
      // 06: aload 1
      // 07: invokevirtual qeaa361f143ee4a0894bd168fd9b30c66/qf4ccf8f5435d4a78bdca4d6a018b578e/abaaabaa.babb (Lqeaa361f143ee4a0894bd168fd9b30c66/qf4ccf8f5435d4a78bdca4d6a018b578e/abaabbba;)Lqeaa361f143ee4a0894bd168fd9b30c66/qf4ccf8f5435d4a78bdca4d6a018b578e/aaabbaaba;
      // 0a: astore 6
      // 0c: aload 6
      // 0e: iload 5
      // 10: ifne 1c
      // 13: ifnull 2b
      // 16: goto 1a
      // 19: athrow
      // 1a: aload 6
      // 1c: iload 5
      // 1e: ifne 30
      // 21: getfield qeaa361f143ee4a0894bd168fd9b30c66/qf4ccf8f5435d4a78bdca4d6a018b578e/aaabbaaba.aa Z
      // 24: ifeq 2e
      // 27: goto 2b
      // 2a: athrow
      // 2b: bipush 0
      // 2c: ireturn
      // 2d: athrow
      // 2e: aload 6
      // 30: getfield qeaa361f143ee4a0894bd168fd9b30c66/qf4ccf8f5435d4a78bdca4d6a018b578e/aaabbaaba.b Lqeaa361f143ee4a0894bd168fd9b30c66/qf4ccf8f5435d4a78bdca4d6a018b578e/bbbabbab;
      // 33: getstatic qeaa361f143ee4a0894bd168fd9b30c66/qf4ccf8f5435d4a78bdca4d6a018b578e/bbbabbab.b Lqeaa361f143ee4a0894bd168fd9b30c66/qf4ccf8f5435d4a78bdca4d6a018b578e/bbbabbab;
      // 36: if_acmpne 56
      // 39: iload 3
      // 3a: iload 5
      // 3c: ifne 53
      // 3f: goto 43
      // 42: athrow
      // 43: iflt 56
      // 46: goto 4a
      // 49: athrow
      // 4a: bipush 1
      // 4b: iload 3
      // 4c: invokestatic java/lang/Math.max (II)I
      // 4f: goto 53
      // 52: athrow
      // 53: goto 57
      // 56: iload 3
      // 57: istore 7
      // 59: aload 6
      // 5b: bipush 1
      // 5c: iload 5
      // 5e: ifne 84
      // 61: putfield qeaa361f143ee4a0894bd168fd9b30c66/qf4ccf8f5435d4a78bdca4d6a018b578e/aaabbaaba.ab Z
      // 64: aload 6
      // 66: iload 7
      // 68: ifge 83
      // 6b: goto 6f
      // 6e: athrow
      // 6f: ldc -1836150836
      // 71: ldc 13067833
      // 73: ldc 1813916113
      // 75: ixor
      // 76: invokestatic qeaa361f143ee4a0894bd168fd9b30c66/qf4ccf8f5435d4a78bdca4d6a018b578e/abaaabaa.aabab (II)I
      // 79: ldc2_w 5035082443597498785
      // 7c: invokestatic qeaa361f143ee4a0894bd168fd9b30c66/qf4ccf8f5435d4a78bdca4d6a018b578e/abaaabaa.aaba (IJ)J
      // 7f: goto 89
      // 82: athrow
      // 83: iload 2
      // 84: i2l
      // 85: iload 7
      // 87: i2l
      // 88: ladd
      // 89: putfield qeaa361f143ee4a0894bd168fd9b30c66/qf4ccf8f5435d4a78bdca4d6a018b578e/aaabbaaba.bb J
      // 8c: aload 6
      // 8e: aload 4
      // 90: ifnonnull b1
      // 93: aload 6
      // 95: getfield qeaa361f143ee4a0894bd168fd9b30c66/qf4ccf8f5435d4a78bdca4d6a018b578e/aaabbaaba.b Lqeaa361f143ee4a0894bd168fd9b30c66/qf4ccf8f5435d4a78bdca4d6a018b578e/bbbabbab;
      // 98: getstatic qeaa361f143ee4a0894bd168fd9b30c66/qf4ccf8f5435d4a78bdca4d6a018b578e/bbbabbab.b Lqeaa361f143ee4a0894bd168fd9b30c66/qf4ccf8f5435d4a78bdca4d6a018b578e/bbbabbab;
      // 9b: if_acmpne a9
      // 9e: goto a2
      // a1: athrow
      // a2: getstatic qeaa361f143ee4a0894bd168fd9b30c66/qf4ccf8f5435d4a78bdca4d6a018b578e/aaaaab.aba Lqeaa361f143ee4a0894bd168fd9b30c66/qf4ccf8f5435d4a78bdca4d6a018b578e/aaaaab;
      // a5: goto b3
      // a8: athrow
      // a9: iload 7
      // ab: invokestatic qeaa361f143ee4a0894bd168fd9b30c66/qf4ccf8f5435d4a78bdca4d6a018b578e/abaaabaa.aaaa (I)Lqeaa361f143ee4a0894bd168fd9b30c66/qf4ccf8f5435d4a78bdca4d6a018b578e/aaaaab;
      // ae: goto b3
      // b1: aload 4
      // b3: putfield qeaa361f143ee4a0894bd168fd9b30c66/qf4ccf8f5435d4a78bdca4d6a018b578e/aaabbaaba.abb Lqeaa361f143ee4a0894bd168fd9b30c66/qf4ccf8f5435d4a78bdca4d6a018b578e/aaaaab;
      // b6: bipush 1
      // b7: ireturn
   }

   private static long aaba(int var0, long var1) {
      int var3 = (var0 ^ (int)var1 ^ aabab(-1836150835, 787036709 ^ -719698817)) & aabab(-1836150798, 787036709 ^ -1028850712);
      if (a[var3] == null) {
         a[var3] = bb[var3] ^ var1;
      }

      return a[var3];
   }

   public synchronized boolean aabb(Object param1, int param2, int param3, aaaaab param4) {
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
      // 06: aload 1
      // 07: invokevirtual qeaa361f143ee4a0894bd168fd9b30c66/qf4ccf8f5435d4a78bdca4d6a018b578e/abaaabaa.bbbb (Ljava/lang/Object;)Lqeaa361f143ee4a0894bd168fd9b30c66/qf4ccf8f5435d4a78bdca4d6a018b578e/aaabbaaba;
      // 0a: astore 6
      // 0c: aload 6
      // 0e: ifnull 32
      // 11: aload 0
      // 12: aload 6
      // 14: getfield qeaa361f143ee4a0894bd168fd9b30c66/qf4ccf8f5435d4a78bdca4d6a018b578e/aaabbaaba.aba Lqeaa361f143ee4a0894bd168fd9b30c66/qf4ccf8f5435d4a78bdca4d6a018b578e/abaabbba;
      // 17: iload 2
      // 18: iload 3
      // 19: aload 4
      // 1b: invokevirtual qeaa361f143ee4a0894bd168fd9b30c66/qf4ccf8f5435d4a78bdca4d6a018b578e/abaaabaa.aaab (Lqeaa361f143ee4a0894bd168fd9b30c66/qf4ccf8f5435d4a78bdca4d6a018b578e/abaabbba;IILqeaa361f143ee4a0894bd168fd9b30c66/qf4ccf8f5435d4a78bdca4d6a018b578e/aaaaab;)Z
      // 1e: iload 5
      // 20: ifne 2f
      // 23: goto 27
      // 26: athrow
      // 27: ifeq 32
      // 2a: goto 2e
      // 2d: athrow
      // 2e: bipush 1
      // 2f: goto 33
      // 32: bipush 0
      // 33: ireturn
   }

   private static void abaa(aaabbaaba param0, int param1, int param2) {
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
      // 05: getfield qeaa361f143ee4a0894bd168fd9b30c66/qf4ccf8f5435d4a78bdca4d6a018b578e/aaabbaaba.b Lqeaa361f143ee4a0894bd168fd9b30c66/qf4ccf8f5435d4a78bdca4d6a018b578e/bbbabbab;
      // 08: getstatic qeaa361f143ee4a0894bd168fd9b30c66/qf4ccf8f5435d4a78bdca4d6a018b578e/bbbabbab.b Lqeaa361f143ee4a0894bd168fd9b30c66/qf4ccf8f5435d4a78bdca4d6a018b578e/bbbabbab;
      // 0b: if_acmpne 2a
      // 0e: iload 2
      // 0f: iload 3
      // 10: ifne 27
      // 13: goto 17
      // 16: athrow
      // 17: iflt 2a
      // 1a: goto 1e
      // 1d: athrow
      // 1e: bipush 1
      // 1f: iload 2
      // 20: invokestatic java/lang/Math.max (II)I
      // 23: goto 27
      // 26: athrow
      // 27: goto 2b
      // 2a: iload 2
      // 2b: istore 4
      // 2d: aload 0
      // 2e: iload 4
      // 30: iload 3
      // 31: ifne 50
      // 34: ifge 4f
      // 37: goto 3b
      // 3a: athrow
      // 3b: ldc -1836150797
      // 3d: ldc 837333323
      // 3f: ldc 69091110
      // 41: ixor
      // 42: invokestatic qeaa361f143ee4a0894bd168fd9b30c66/qf4ccf8f5435d4a78bdca4d6a018b578e/abaaabaa.aabab (II)I
      // 45: ldc2_w 2727110890242353695
      // 48: invokestatic qeaa361f143ee4a0894bd168fd9b30c66/qf4ccf8f5435d4a78bdca4d6a018b578e/abaaabaa.aaba (IJ)J
      // 4b: goto 55
      // 4e: athrow
      // 4f: iload 1
      // 50: i2l
      // 51: iload 4
      // 53: i2l
      // 54: ladd
      // 55: putfield qeaa361f143ee4a0894bd168fd9b30c66/qf4ccf8f5435d4a78bdca4d6a018b578e/aaabbaaba.bb J
      // 58: aload 0
      // 59: aload 0
      // 5a: getfield qeaa361f143ee4a0894bd168fd9b30c66/qf4ccf8f5435d4a78bdca4d6a018b578e/aaabbaaba.b Lqeaa361f143ee4a0894bd168fd9b30c66/qf4ccf8f5435d4a78bdca4d6a018b578e/bbbabbab;
      // 5d: getstatic qeaa361f143ee4a0894bd168fd9b30c66/qf4ccf8f5435d4a78bdca4d6a018b578e/bbbabbab.b Lqeaa361f143ee4a0894bd168fd9b30c66/qf4ccf8f5435d4a78bdca4d6a018b578e/bbbabbab;
      // 60: if_acmpne 6a
      // 63: getstatic qeaa361f143ee4a0894bd168fd9b30c66/qf4ccf8f5435d4a78bdca4d6a018b578e/aaaaab.aba Lqeaa361f143ee4a0894bd168fd9b30c66/qf4ccf8f5435d4a78bdca4d6a018b578e/aaaaab;
      // 66: goto 6f
      // 69: athrow
      // 6a: iload 4
      // 6c: invokestatic qeaa361f143ee4a0894bd168fd9b30c66/qf4ccf8f5435d4a78bdca4d6a018b578e/abaaabaa.aaaa (I)Lqeaa361f143ee4a0894bd168fd9b30c66/qf4ccf8f5435d4a78bdca4d6a018b578e/aaaaab;
      // 6f: putfield qeaa361f143ee4a0894bd168fd9b30c66/qf4ccf8f5435d4a78bdca4d6a018b578e/aaabbaaba.abb Lqeaa361f143ee4a0894bd168fd9b30c66/qf4ccf8f5435d4a78bdca4d6a018b578e/aaaaab;
      // 72: return
   }

   private aaabbaaba abab(aaabbaaba var1) {
      boolean var3 = false;
      int var10000 = baaabbaa.bba;
      Iterator var4 = this.aaa.iterator();
      int var2 = var10000;

      while (var4.hasNext()) {
         aaabbaaba var5 = (aaabbaaba)var4.next();

         try {
            if (var3) {
               return var5;
            }
         } catch (MatchException var6) {
            throw var6;
         }

         label31: {
            try {
               if (var5 == var1) {
                  var8 = true;
                  break label31;
               }
            } catch (MatchException var7) {
               throw var7;
            }

            var8 = false;
         }

         var3 = var8;
         if (var2 != 0) {
            break;
         }
      }

      return null;
   }

   private static int abba(int var0, long var1) {
      int var3 = var0 ^ (int)(var1 & 32767L) ^ aabab(-1836150800, -1701659976 ^ -69162646);
      if (ab[var3] == null) {
         ab[var3] = (int)(ba[var3] ^ var1);
      }

      return ab[var3];
   }

   public synchronized boolean abbb(Object param1) {
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
      // 05: getfield qeaa361f143ee4a0894bd168fd9b30c66/qf4ccf8f5435d4a78bdca4d6a018b578e/abaaabaa.aaa Ljava/util/Deque;
      // 08: invokeinterface java/util/Deque.peekFirst ()Ljava/lang/Object; 1
      // 0d: checkcast qeaa361f143ee4a0894bd168fd9b30c66/qf4ccf8f5435d4a78bdca4d6a018b578e/aaabbaaba
      // 10: astore 3
      // 11: aload 1
      // 12: ifnull 39
      // 15: aload 3
      // 16: iload 2
      // 17: ifne 30
      // 1a: goto 1e
      // 1d: athrow
      // 1e: ifnull 39
      // 21: goto 25
      // 24: athrow
      // 25: aload 3
      // 26: getfield qeaa361f143ee4a0894bd168fd9b30c66/qf4ccf8f5435d4a78bdca4d6a018b578e/aaabbaaba.aba Lqeaa361f143ee4a0894bd168fd9b30c66/qf4ccf8f5435d4a78bdca4d6a018b578e/abaabbba;
      // 29: invokevirtual qeaa361f143ee4a0894bd168fd9b30c66/qf4ccf8f5435d4a78bdca4d6a018b578e/abaabbba.a ()Ljava/lang/Object;
      // 2c: goto 30
      // 2f: athrow
      // 30: aload 1
      // 31: if_acmpne 39
      // 34: bipush 1
      // 35: goto 3a
      // 38: athrow
      // 39: bipush 0
      // 3a: ireturn
   }

   public synchronized boolean baaa(abbbaaa param1, abaabbba param2, int param3) {
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
      // 06: aload 2
      // 07: invokevirtual qeaa361f143ee4a0894bd168fd9b30c66/qf4ccf8f5435d4a78bdca4d6a018b578e/abaaabaa.babb (Lqeaa361f143ee4a0894bd168fd9b30c66/qf4ccf8f5435d4a78bdca4d6a018b578e/abaabbba;)Lqeaa361f143ee4a0894bd168fd9b30c66/qf4ccf8f5435d4a78bdca4d6a018b578e/aaabbaaba;
      // 0a: astore 5
      // 0c: aload 5
      // 0e: iload 4
      // 10: ifne 1c
      // 13: ifnull 81
      // 16: goto 1a
      // 19: athrow
      // 1a: aload 5
      // 1c: iload 4
      // 1e: ifne 37
      // 21: aload 0
      // 22: getfield qeaa361f143ee4a0894bd168fd9b30c66/qf4ccf8f5435d4a78bdca4d6a018b578e/abaaabaa.aaa Ljava/util/Deque;
      // 25: invokeinterface java/util/Deque.peekFirst ()Ljava/lang/Object; 1
      // 2a: if_acmpne 81
      // 2d: goto 31
      // 30: athrow
      // 31: aload 5
      // 33: goto 37
      // 36: athrow
      // 37: getfield qeaa361f143ee4a0894bd168fd9b30c66/qf4ccf8f5435d4a78bdca4d6a018b578e/aaabbaaba.aa Z
      // 3a: iload 4
      // 3c: ifne 59
      // 3f: ifne 81
      // 42: goto 46
      // 45: athrow
      // 46: aload 1
      // 47: iload 4
      // 49: ifne 62
      // 4c: goto 50
      // 4f: athrow
      // 50: invokeinterface qeaa361f143ee4a0894bd168fd9b30c66/qf4ccf8f5435d4a78bdca4d6a018b578e/abbbaaa.aa ()I 1
      // 55: goto 59
      // 58: athrow
      // 59: iload 3
      // 5a: if_icmplt 81
      // 5d: aload 1
      // 5e: goto 62
      // 61: athrow
      // 62: aload 5
      // 64: getfield qeaa361f143ee4a0894bd168fd9b30c66/qf4ccf8f5435d4a78bdca4d6a018b578e/aaabbaaba.b Lqeaa361f143ee4a0894bd168fd9b30c66/qf4ccf8f5435d4a78bdca4d6a018b578e/bbbabbab;
      // 67: aload 5
      // 69: getfield qeaa361f143ee4a0894bd168fd9b30c66/qf4ccf8f5435d4a78bdca4d6a018b578e/aaabbaaba.a I
      // 6c: invokeinterface qeaa361f143ee4a0894bd168fd9b30c66/qf4ccf8f5435d4a78bdca4d6a018b578e/abbbaaa.ab (Lqeaa361f143ee4a0894bd168fd9b30c66/qf4ccf8f5435d4a78bdca4d6a018b578e/bbbabbab;I)Z 3
      // 71: iload 4
      // 73: ifne 7e
      // 76: ifeq 81
      // 79: goto 7d
      // 7c: athrow
      // 7d: bipush 1
      // 7e: goto 82
      // 81: bipush 0
      // 82: ireturn
   }

   public synchronized void baab(abbbaaa param1, aaaaab param2) {
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
      // 05: getfield qeaa361f143ee4a0894bd168fd9b30c66/qf4ccf8f5435d4a78bdca4d6a018b578e/abaaabaa.aaa Ljava/util/Deque;
      // 08: invokeinterface java/util/Deque.peekFirst ()Ljava/lang/Object; 1
      // 0d: checkcast qeaa361f143ee4a0894bd168fd9b30c66/qf4ccf8f5435d4a78bdca4d6a018b578e/aaabbaaba
      // 10: astore 4
      // 12: aload 4
      // 14: ifnonnull 18
      // 17: return
      // 18: aload 4
      // 1a: iload 3
      // 1b: ifne 39
      // 1e: getfield qeaa361f143ee4a0894bd168fd9b30c66/qf4ccf8f5435d4a78bdca4d6a018b578e/aaabbaaba.aa Z
      // 21: ifeq 37
      // 24: goto 28
      // 27: athrow
      // 28: aload 0
      // 29: aload 1
      // 2a: aload 4
      // 2c: invokevirtual qeaa361f143ee4a0894bd168fd9b30c66/qf4ccf8f5435d4a78bdca4d6a018b578e/abaaabaa.bbaa (Lqeaa361f143ee4a0894bd168fd9b30c66/qf4ccf8f5435d4a78bdca4d6a018b578e/abbbaaa;Lqeaa361f143ee4a0894bd168fd9b30c66/qf4ccf8f5435d4a78bdca4d6a018b578e/aaabbaaba;)Z
      // 2f: ifne 04
      // 32: goto 36
      // 35: athrow
      // 36: return
      // 37: aload 4
      // 39: iload 3
      // 3a: ifne 52
      // 3d: aload 1
      // 3e: invokeinterface qeaa361f143ee4a0894bd168fd9b30c66/qf4ccf8f5435d4a78bdca4d6a018b578e/abbbaaa.aa ()I 1
      // 43: aload 2
      // 44: invokevirtual qeaa361f143ee4a0894bd168fd9b30c66/qf4ccf8f5435d4a78bdca4d6a018b578e/aaabbaaba.b (ILqeaa361f143ee4a0894bd168fd9b30c66/qf4ccf8f5435d4a78bdca4d6a018b578e/aaaaab;)Z
      // 47: ifne 50
      // 4a: goto 4e
      // 4d: athrow
      // 4e: return
      // 4f: athrow
      // 50: aload 4
      // 52: getfield qeaa361f143ee4a0894bd168fd9b30c66/qf4ccf8f5435d4a78bdca4d6a018b578e/aaabbaaba.ab Z
      // 55: istore 5
      // 57: aload 4
      // 59: iload 3
      // 5a: ifne 8e
      // 5d: invokestatic qeaa361f143ee4a0894bd168fd9b30c66/qf4ccf8f5435d4a78bdca4d6a018b578e/abaaabaa.aaaba (Lqeaa361f143ee4a0894bd168fd9b30c66/qf4ccf8f5435d4a78bdca4d6a018b578e/aaabbaaba;)V
      // 60: iload 5
      // 62: ifeq 85
      // 65: goto 69
      // 68: athrow
      // 69: aload 0
      // 6a: aload 1
      // 6b: aload 4
      // 6d: invokevirtual qeaa361f143ee4a0894bd168fd9b30c66/qf4ccf8f5435d4a78bdca4d6a018b578e/abaaabaa.b (Lqeaa361f143ee4a0894bd168fd9b30c66/qf4ccf8f5435d4a78bdca4d6a018b578e/abbbaaa;Lqeaa361f143ee4a0894bd168fd9b30c66/qf4ccf8f5435d4a78bdca4d6a018b578e/aaabbaaba;)V
      // 70: aload 4
      // 72: getfield qeaa361f143ee4a0894bd168fd9b30c66/qf4ccf8f5435d4a78bdca4d6a018b578e/aaabbaaba.aa Z
      // 75: iload 3
      // 76: ifne 91
      // 79: goto 7d
      // 7c: athrow
      // 7d: ifeq 8f
      // 80: goto 84
      // 83: athrow
      // 84: return
      // 85: aload 0
      // 86: getfield qeaa361f143ee4a0894bd168fd9b30c66/qf4ccf8f5435d4a78bdca4d6a018b578e/abaaabaa.aaa Ljava/util/Deque;
      // 89: invokeinterface java/util/Deque.removeFirst ()Ljava/lang/Object; 1
      // 8e: pop
      // 8f: iload 5
      // 91: iload 3
      // 92: ifne b1
      // 95: ifne d6
      // 98: goto 9c
      // 9b: athrow
      // 9c: aload 0
      // 9d: iload 3
      // 9e: ifne c1
      // a1: goto a5
      // a4: athrow
      // a5: getfield qeaa361f143ee4a0894bd168fd9b30c66/qf4ccf8f5435d4a78bdca4d6a018b578e/abaaabaa.aaa Ljava/util/Deque;
      // a8: invokeinterface java/util/Deque.isEmpty ()Z 1
      // ad: goto b1
      // b0: athrow
      // b1: ifne d6
      // b4: aload 0
      // b5: getfield qeaa361f143ee4a0894bd168fd9b30c66/qf4ccf8f5435d4a78bdca4d6a018b578e/abaaabaa.aaa Ljava/util/Deque;
      // b8: invokeinterface java/util/Deque.peekFirst ()Ljava/lang/Object; 1
      // bd: goto c1
      // c0: athrow
      // c1: checkcast qeaa361f143ee4a0894bd168fd9b30c66/qf4ccf8f5435d4a78bdca4d6a018b578e/aaabbaaba
      // c4: astore 6
      // c6: aload 1
      // c7: aload 6
      // c9: getfield qeaa361f143ee4a0894bd168fd9b30c66/qf4ccf8f5435d4a78bdca4d6a018b578e/aaabbaaba.b Lqeaa361f143ee4a0894bd168fd9b30c66/qf4ccf8f5435d4a78bdca4d6a018b578e/bbbabbab;
      // cc: aload 6
      // ce: getfield qeaa361f143ee4a0894bd168fd9b30c66/qf4ccf8f5435d4a78bdca4d6a018b578e/aaabbaaba.a I
      // d1: invokeinterface qeaa361f143ee4a0894bd168fd9b30c66/qf4ccf8f5435d4a78bdca4d6a018b578e/abbbaaa.ba (Lqeaa361f143ee4a0894bd168fd9b30c66/qf4ccf8f5435d4a78bdca4d6a018b578e/bbbabbab;I)V 3
      // d6: goto 04
   }

   public synchronized int baba(abbbaaa param1) {
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
      // 05: getfield qeaa361f143ee4a0894bd168fd9b30c66/qf4ccf8f5435d4a78bdca4d6a018b578e/abaaabaa.aaa Ljava/util/Deque;
      // 08: invokeinterface java/util/Deque.peekFirst ()Ljava/lang/Object; 1
      // 0d: checkcast qeaa361f143ee4a0894bd168fd9b30c66/qf4ccf8f5435d4a78bdca4d6a018b578e/aaabbaaba
      // 10: astore 3
      // 11: aload 3
      // 12: iload 2
      // 13: ifne 28
      // 16: ifnonnull 27
      // 19: goto 1d
      // 1c: athrow
      // 1d: aload 1
      // 1e: invokeinterface qeaa361f143ee4a0894bd168fd9b30c66/qf4ccf8f5435d4a78bdca4d6a018b578e/abbbaaa.b ()I 1
      // 23: goto 2b
      // 26: athrow
      // 27: aload 3
      // 28: getfield qeaa361f143ee4a0894bd168fd9b30c66/qf4ccf8f5435d4a78bdca4d6a018b578e/aaabbaaba.a I
      // 2b: ireturn
   }

   private aaabbaaba babb(abaabbba param1) {
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
      // 11: invokevirtual qeaa361f143ee4a0894bd168fd9b30c66/qf4ccf8f5435d4a78bdca4d6a018b578e/abaabbba.aa ()Z
      // 14: ifne 1a
      // 17: aconst_null
      // 18: areturn
      // 19: athrow
      // 1a: aload 0
      // 1b: getfield qeaa361f143ee4a0894bd168fd9b30c66/qf4ccf8f5435d4a78bdca4d6a018b578e/abaaabaa.aaa Ljava/util/Deque;
      // 1e: invokeinterface java/util/Deque.iterator ()Ljava/util/Iterator; 1
      // 23: astore 3
      // 24: aload 3
      // 25: invokeinterface java/util/Iterator.hasNext ()Z 1
      // 2a: ifeq 76
      // 2d: aload 3
      // 2e: invokeinterface java/util/Iterator.next ()Ljava/lang/Object; 1
      // 33: checkcast qeaa361f143ee4a0894bd168fd9b30c66/qf4ccf8f5435d4a78bdca4d6a018b578e/aaabbaaba
      // 36: astore 4
      // 38: aload 4
      // 3a: iload 2
      // 3b: ifne 64
      // 3e: getfield qeaa361f143ee4a0894bd168fd9b30c66/qf4ccf8f5435d4a78bdca4d6a018b578e/aaabbaaba.aba Lqeaa361f143ee4a0894bd168fd9b30c66/qf4ccf8f5435d4a78bdca4d6a018b578e/abaabbba;
      // 41: invokevirtual qeaa361f143ee4a0894bd168fd9b30c66/qf4ccf8f5435d4a78bdca4d6a018b578e/abaabbba.ab ()J
      // 44: aload 1
      // 45: invokevirtual qeaa361f143ee4a0894bd168fd9b30c66/qf4ccf8f5435d4a78bdca4d6a018b578e/abaabbba.ab ()J
      // 48: lcmp
      // 49: ifne 72
      // 4c: goto 50
      // 4f: athrow
      // 50: aload 4
      // 52: iload 2
      // 53: ifne 71
      // 56: goto 5a
      // 59: athrow
      // 5a: getfield qeaa361f143ee4a0894bd168fd9b30c66/qf4ccf8f5435d4a78bdca4d6a018b578e/aaabbaaba.aba Lqeaa361f143ee4a0894bd168fd9b30c66/qf4ccf8f5435d4a78bdca4d6a018b578e/abaabbba;
      // 5d: invokevirtual qeaa361f143ee4a0894bd168fd9b30c66/qf4ccf8f5435d4a78bdca4d6a018b578e/abaabbba.a ()Ljava/lang/Object;
      // 60: goto 64
      // 63: athrow
      // 64: aload 1
      // 65: invokevirtual qeaa361f143ee4a0894bd168fd9b30c66/qf4ccf8f5435d4a78bdca4d6a018b578e/abaabbba.a ()Ljava/lang/Object;
      // 68: if_acmpne 72
      // 6b: aload 4
      // 6d: goto 71
      // 70: athrow
      // 71: areturn
      // 72: iload 2
      // 73: ifeq 24
      // 76: aconst_null
      // 77: areturn
   }

   private boolean bbaa(abbbaaa param1, aaabbaaba param2) {
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
      // 05: aload 2
      // 06: getfield qeaa361f143ee4a0894bd168fd9b30c66/qf4ccf8f5435d4a78bdca4d6a018b578e/aaabbaaba.b Lqeaa361f143ee4a0894bd168fd9b30c66/qf4ccf8f5435d4a78bdca4d6a018b578e/bbbabbab;
      // 09: aload 2
      // 0a: getfield qeaa361f143ee4a0894bd168fd9b30c66/qf4ccf8f5435d4a78bdca4d6a018b578e/aaabbaaba.a I
      // 0d: invokeinterface qeaa361f143ee4a0894bd168fd9b30c66/qf4ccf8f5435d4a78bdca4d6a018b578e/abbbaaa.ab (Lqeaa361f143ee4a0894bd168fd9b30c66/qf4ccf8f5435d4a78bdca4d6a018b578e/bbbabbab;I)Z 3
      // 12: iload 3
      // 13: ifne 2f
      // 16: ifne 20
      // 19: goto 1d
      // 1c: athrow
      // 1d: bipush 0
      // 1e: ireturn
      // 1f: athrow
      // 20: aload 2
      // 21: bipush 0
      // 22: putfield qeaa361f143ee4a0894bd168fd9b30c66/qf4ccf8f5435d4a78bdca4d6a018b578e/aaabbaaba.aa Z
      // 25: aload 0
      // 26: getfield qeaa361f143ee4a0894bd168fd9b30c66/qf4ccf8f5435d4a78bdca4d6a018b578e/abaaabaa.aaa Ljava/util/Deque;
      // 29: aload 2
      // 2a: invokeinterface java/util/Deque.remove (Ljava/lang/Object;)Z 2
      // 2f: ireturn
   }

   private void bbab(aaabbaaba param1) {
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
      // 05: getfield qeaa361f143ee4a0894bd168fd9b30c66/qf4ccf8f5435d4a78bdca4d6a018b578e/abaaabaa.aaa Ljava/util/Deque;
      // 08: invokeinterface java/util/Deque.isEmpty ()Z 1
      // 0d: ifne 3e
      // 10: aload 0
      // 11: getfield qeaa361f143ee4a0894bd168fd9b30c66/qf4ccf8f5435d4a78bdca4d6a018b578e/abaaabaa.aaa Ljava/util/Deque;
      // 14: invokeinterface java/util/Deque.peekFirst ()Ljava/lang/Object; 1
      // 19: checkcast qeaa361f143ee4a0894bd168fd9b30c66/qf4ccf8f5435d4a78bdca4d6a018b578e/aaabbaaba
      // 1c: astore 3
      // 1d: iload 2
      // 1e: ifne 3a
      // 21: aload 3
      // 22: aload 1
      // 23: if_acmpne 2c
      // 26: goto 2a
      // 29: athrow
      // 2a: return
      // 2b: athrow
      // 2c: aload 0
      // 2d: getfield qeaa361f143ee4a0894bd168fd9b30c66/qf4ccf8f5435d4a78bdca4d6a018b578e/abaaabaa.aaa Ljava/util/Deque;
      // 30: invokeinterface java/util/Deque.removeFirst ()Ljava/lang/Object; 1
      // 35: pop
      // 36: aload 3
      // 37: invokestatic qeaa361f143ee4a0894bd168fd9b30c66/qf4ccf8f5435d4a78bdca4d6a018b578e/abaaabaa.aaaba (Lqeaa361f143ee4a0894bd168fd9b30c66/qf4ccf8f5435d4a78bdca4d6a018b578e/aaabbaaba;)V
      // 3a: iload 2
      // 3b: ifeq 04
      // 3e: return
   }

   public synchronized abaabbba bbba(
      abbbaaa param1,
      Object param2,
      int param3,
      bbbabbab param4,
      int param5,
      boolean param6,
      Runnable param7
   ) {
      // $VF: Couldn't be decompiled
      // Please report this to the Vineflower issue tracker, at https://github.com/Vineflower/vineflower/issues with a copy of the class file (if you have the rights to distribute it!)
      // java.lang.RuntimeException: parsing failure!
      //   at org.jetbrains.java.decompiler.modules.decompiler.decompose.DomHelper.parseGraph(DomHelper.java:211)
      //   at org.jetbrains.java.decompiler.main.rels.MethodProcessor.codeToJava(MethodProcessor.java:166)
      //
      // Bytecode:
      // 000: getstatic qeaa361f143ee4a0894bd168fd9b30c66/qf4ccf8f5435d4a78bdca4d6a018b578e/baaabbaa.bba I
      // 003: istore 8
      // 005: aload 1
      // 006: aload 2
      // 007: iload 3
      // 008: aload 4
      // 00a: invokestatic qeaa361f143ee4a0894bd168fd9b30c66/qf4ccf8f5435d4a78bdca4d6a018b578e/abaaabaa.aaaab (Lqeaa361f143ee4a0894bd168fd9b30c66/qf4ccf8f5435d4a78bdca4d6a018b578e/abbbaaa;Ljava/lang/Object;ILqeaa361f143ee4a0894bd168fd9b30c66/qf4ccf8f5435d4a78bdca4d6a018b578e/bbbabbab;)Z
      // 00d: ifne 01b
      // 010: new qeaa361f143ee4a0894bd168fd9b30c66/qf4ccf8f5435d4a78bdca4d6a018b578e/abaabbba
      // 013: dup
      // 014: lconst_0
      // 015: aload 2
      // 016: invokespecial qeaa361f143ee4a0894bd168fd9b30c66/qf4ccf8f5435d4a78bdca4d6a018b578e/abaabbba.<init> (JLjava/lang/Object;)V
      // 019: areturn
      // 01a: athrow
      // 01b: aload 0
      // 01c: aload 2
      // 01d: invokevirtual qeaa361f143ee4a0894bd168fd9b30c66/qf4ccf8f5435d4a78bdca4d6a018b578e/abaaabaa.bbbb (Ljava/lang/Object;)Lqeaa361f143ee4a0894bd168fd9b30c66/qf4ccf8f5435d4a78bdca4d6a018b578e/aaabbaaba;
      // 020: astore 9
      // 022: aload 0
      // 023: getfield qeaa361f143ee4a0894bd168fd9b30c66/qf4ccf8f5435d4a78bdca4d6a018b578e/abaaabaa.aaa Ljava/util/Deque;
      // 026: invokeinterface java/util/Deque.peekFirst ()Ljava/lang/Object; 1
      // 02b: checkcast qeaa361f143ee4a0894bd168fd9b30c66/qf4ccf8f5435d4a78bdca4d6a018b578e/aaabbaaba
      // 02e: astore 10
      // 030: aload 9
      // 032: iload 8
      // 034: ifne 040
      // 037: ifnull 0e2
      // 03a: goto 03e
      // 03d: athrow
      // 03e: aload 9
      // 040: iload 8
      // 042: ifne 054
      // 045: aload 10
      // 047: if_acmpne 063
      // 04a: goto 04e
      // 04d: athrow
      // 04e: aload 9
      // 050: goto 054
      // 053: athrow
      // 054: iload 8
      // 056: ifne 070
      // 059: getfield qeaa361f143ee4a0894bd168fd9b30c66/qf4ccf8f5435d4a78bdca4d6a018b578e/aaabbaaba.aa Z
      // 05c: ifeq 06e
      // 05f: goto 063
      // 062: athrow
      // 063: new qeaa361f143ee4a0894bd168fd9b30c66/qf4ccf8f5435d4a78bdca4d6a018b578e/abaabbba
      // 066: dup
      // 067: lconst_0
      // 068: aload 2
      // 069: invokespecial qeaa361f143ee4a0894bd168fd9b30c66/qf4ccf8f5435d4a78bdca4d6a018b578e/abaabbba.<init> (JLjava/lang/Object;)V
      // 06c: areturn
      // 06d: athrow
      // 06e: aload 10
      // 070: getfield qeaa361f143ee4a0894bd168fd9b30c66/qf4ccf8f5435d4a78bdca4d6a018b578e/aaabbaaba.a I
      // 073: iload 8
      // 075: ifne 093
      // 078: iload 3
      // 079: if_icmpne 08e
      // 07c: goto 080
      // 07f: athrow
      // 080: aload 10
      // 082: getfield qeaa361f143ee4a0894bd168fd9b30c66/qf4ccf8f5435d4a78bdca4d6a018b578e/aaabbaaba.b Lqeaa361f143ee4a0894bd168fd9b30c66/qf4ccf8f5435d4a78bdca4d6a018b578e/bbbabbab;
      // 085: aload 4
      // 087: if_acmpeq 096
      // 08a: goto 08e
      // 08d: athrow
      // 08e: bipush 1
      // 08f: goto 093
      // 092: athrow
      // 093: goto 097
      // 096: bipush 0
      // 097: istore 11
      // 099: aload 10
      // 09b: iload 8
      // 09d: ifne 0de
      // 0a0: iload 3
      // 0a1: putfield qeaa361f143ee4a0894bd168fd9b30c66/qf4ccf8f5435d4a78bdca4d6a018b578e/aaabbaaba.a I
      // 0a4: aload 10
      // 0a6: aload 4
      // 0a8: putfield qeaa361f143ee4a0894bd168fd9b30c66/qf4ccf8f5435d4a78bdca4d6a018b578e/aaabbaaba.b Lqeaa361f143ee4a0894bd168fd9b30c66/qf4ccf8f5435d4a78bdca4d6a018b578e/bbbabbab;
      // 0ab: aload 10
      // 0ad: iload 6
      // 0af: putfield qeaa361f143ee4a0894bd168fd9b30c66/qf4ccf8f5435d4a78bdca4d6a018b578e/aaabbaaba.ab Z
      // 0b2: aload 10
      // 0b4: aload 7
      // 0b6: putfield qeaa361f143ee4a0894bd168fd9b30c66/qf4ccf8f5435d4a78bdca4d6a018b578e/aaabbaaba.ba Ljava/lang/Runnable;
      // 0b9: aload 10
      // 0bb: aload 1
      // 0bc: invokeinterface qeaa361f143ee4a0894bd168fd9b30c66/qf4ccf8f5435d4a78bdca4d6a018b578e/abbbaaa.aa ()I 1
      // 0c1: iload 5
      // 0c3: invokestatic qeaa361f143ee4a0894bd168fd9b30c66/qf4ccf8f5435d4a78bdca4d6a018b578e/abaaabaa.abaa (Lqeaa361f143ee4a0894bd168fd9b30c66/qf4ccf8f5435d4a78bdca4d6a018b578e/aaabbaaba;II)V
      // 0c6: iload 11
      // 0c8: ifeq 0dc
      // 0cb: goto 0cf
      // 0ce: athrow
      // 0cf: aload 1
      // 0d0: aload 4
      // 0d2: iload 3
      // 0d3: invokeinterface qeaa361f143ee4a0894bd168fd9b30c66/qf4ccf8f5435d4a78bdca4d6a018b578e/abbbaaa.ba (Lqeaa361f143ee4a0894bd168fd9b30c66/qf4ccf8f5435d4a78bdca4d6a018b578e/bbbabbab;I)V 3
      // 0d8: goto 0dc
      // 0db: athrow
      // 0dc: aload 10
      // 0de: getfield qeaa361f143ee4a0894bd168fd9b30c66/qf4ccf8f5435d4a78bdca4d6a018b578e/aaabbaaba.aba Lqeaa361f143ee4a0894bd168fd9b30c66/qf4ccf8f5435d4a78bdca4d6a018b578e/abaabbba;
      // 0e1: areturn
      // 0e2: aload 0
      // 0e3: iload 8
      // 0e5: ifne 10e
      // 0e8: getfield qeaa361f143ee4a0894bd168fd9b30c66/qf4ccf8f5435d4a78bdca4d6a018b578e/abaaabaa.aaa Ljava/util/Deque;
      // 0eb: invokeinterface java/util/Deque.isEmpty ()Z 1
      // 0f0: ifeq 10d
      // 0f3: goto 0f7
      // 0f6: athrow
      // 0f7: aload 4
      // 0f9: getstatic qeaa361f143ee4a0894bd168fd9b30c66/qf4ccf8f5435d4a78bdca4d6a018b578e/bbbabbab.b Lqeaa361f143ee4a0894bd168fd9b30c66/qf4ccf8f5435d4a78bdca4d6a018b578e/bbbabbab;
      // 0fc: if_acmpne 10d
      // 0ff: goto 103
      // 102: athrow
      // 103: aload 1
      // 104: invokeinterface qeaa361f143ee4a0894bd168fd9b30c66/qf4ccf8f5435d4a78bdca4d6a018b578e/abbbaaa.bb ()I 1
      // 109: goto 112
      // 10c: athrow
      // 10d: aload 0
      // 10e: aload 1
      // 10f: invokevirtual qeaa361f143ee4a0894bd168fd9b30c66/qf4ccf8f5435d4a78bdca4d6a018b578e/abaaabaa.baba (Lqeaa361f143ee4a0894bd168fd9b30c66/qf4ccf8f5435d4a78bdca4d6a018b578e/abbbaaa;)I
      // 112: istore 11
      // 114: iload 11
      // 116: iload 3
      // 117: if_icmpne 148
      // 11a: aload 4
      // 11c: getstatic qeaa361f143ee4a0894bd168fd9b30c66/qf4ccf8f5435d4a78bdca4d6a018b578e/bbbabbab.b Lqeaa361f143ee4a0894bd168fd9b30c66/qf4ccf8f5435d4a78bdca4d6a018b578e/bbbabbab;
      // 11f: if_acmpne 13d
      // 122: goto 126
      // 125: athrow
      // 126: aload 1
      // 127: iload 8
      // 129: ifne 151
      // 12c: goto 130
      // 12f: athrow
      // 130: invokeinterface qeaa361f143ee4a0894bd168fd9b30c66/qf4ccf8f5435d4a78bdca4d6a018b578e/abbbaaa.b ()I 1
      // 135: iload 3
      // 136: if_icmpne 148
      // 139: goto 13d
      // 13c: athrow
      // 13d: new qeaa361f143ee4a0894bd168fd9b30c66/qf4ccf8f5435d4a78bdca4d6a018b578e/abaabbba
      // 140: dup
      // 141: lconst_0
      // 142: aload 2
      // 143: invokespecial qeaa361f143ee4a0894bd168fd9b30c66/qf4ccf8f5435d4a78bdca4d6a018b578e/abaabbba.<init> (JLjava/lang/Object;)V
      // 146: areturn
      // 147: athrow
      // 148: aload 0
      // 149: getfield qeaa361f143ee4a0894bd168fd9b30c66/qf4ccf8f5435d4a78bdca4d6a018b578e/abaaabaa.aaa Ljava/util/Deque;
      // 14c: invokeinterface java/util/Deque.peekLast ()Ljava/lang/Object; 1
      // 151: checkcast qeaa361f143ee4a0894bd168fd9b30c66/qf4ccf8f5435d4a78bdca4d6a018b578e/aaabbaaba
      // 154: astore 12
      // 156: aload 12
      // 158: iload 8
      // 15a: ifne 170
      // 15d: ifnonnull 16e
      // 160: goto 164
      // 163: athrow
      // 164: aload 1
      // 165: invokeinterface qeaa361f143ee4a0894bd168fd9b30c66/qf4ccf8f5435d4a78bdca4d6a018b578e/abbbaaa.b ()I 1
      // 16a: goto 173
      // 16d: athrow
      // 16e: aload 12
      // 170: getfield qeaa361f143ee4a0894bd168fd9b30c66/qf4ccf8f5435d4a78bdca4d6a018b578e/aaabbaaba.bab I
      // 173: istore 13
      // 175: aload 12
      // 177: iload 8
      // 179: ifne 18e
      // 17c: ifnonnull 18c
      // 17f: goto 183
      // 182: athrow
      // 183: aload 4
      // 185: invokestatic qeaa361f143ee4a0894bd168fd9b30c66/qf4ccf8f5435d4a78bdca4d6a018b578e/abaaabaa.aba (Lqeaa361f143ee4a0894bd168fd9b30c66/qf4ccf8f5435d4a78bdca4d6a018b578e/bbbabbab;)Lqeaa361f143ee4a0894bd168fd9b30c66/qf4ccf8f5435d4a78bdca4d6a018b578e/bbbabbab;
      // 188: goto 191
      // 18b: athrow
      // 18c: aload 12
      // 18e: getfield qeaa361f143ee4a0894bd168fd9b30c66/qf4ccf8f5435d4a78bdca4d6a018b578e/aaabbaaba.aab Lqeaa361f143ee4a0894bd168fd9b30c66/qf4ccf8f5435d4a78bdca4d6a018b578e/bbbabbab;
      // 191: astore 14
      // 193: new qeaa361f143ee4a0894bd168fd9b30c66/qf4ccf8f5435d4a78bdca4d6a018b578e/aaabbaaba
      // 196: dup
      // 197: new qeaa361f143ee4a0894bd168fd9b30c66/qf4ccf8f5435d4a78bdca4d6a018b578e/abaabbba
      // 19a: dup
      // 19b: aload 0
      // 19c: getfield qeaa361f143ee4a0894bd168fd9b30c66/qf4ccf8f5435d4a78bdca4d6a018b578e/abaaabaa.b Ljava/util/concurrent/atomic/AtomicLong;
      // 19f: invokevirtual java/util/concurrent/atomic/AtomicLong.incrementAndGet ()J
      // 1a2: aload 2
      // 1a3: invokespecial qeaa361f143ee4a0894bd168fd9b30c66/qf4ccf8f5435d4a78bdca4d6a018b578e/abaabbba.<init> (JLjava/lang/Object;)V
      // 1a6: iload 13
      // 1a8: aload 14
      // 1aa: iload 11
      // 1ac: aload 10
      // 1ae: ifnonnull 1ba
      // 1b1: aload 4
      // 1b3: invokestatic qeaa361f143ee4a0894bd168fd9b30c66/qf4ccf8f5435d4a78bdca4d6a018b578e/abaaabaa.aba (Lqeaa361f143ee4a0894bd168fd9b30c66/qf4ccf8f5435d4a78bdca4d6a018b578e/bbbabbab;)Lqeaa361f143ee4a0894bd168fd9b30c66/qf4ccf8f5435d4a78bdca4d6a018b578e/bbbabbab;
      // 1b6: goto 1bf
      // 1b9: athrow
      // 1ba: aload 10
      // 1bc: getfield qeaa361f143ee4a0894bd168fd9b30c66/qf4ccf8f5435d4a78bdca4d6a018b578e/aaabbaaba.b Lqeaa361f143ee4a0894bd168fd9b30c66/qf4ccf8f5435d4a78bdca4d6a018b578e/bbbabbab;
      // 1bf: iload 3
      // 1c0: aload 4
      // 1c2: iload 6
      // 1c4: aload 7
      // 1c6: invokespecial qeaa361f143ee4a0894bd168fd9b30c66/qf4ccf8f5435d4a78bdca4d6a018b578e/aaabbaaba.<init> (Lqeaa361f143ee4a0894bd168fd9b30c66/qf4ccf8f5435d4a78bdca4d6a018b578e/abaabbba;ILqeaa361f143ee4a0894bd168fd9b30c66/qf4ccf8f5435d4a78bdca4d6a018b578e/bbbabbab;ILqeaa361f143ee4a0894bd168fd9b30c66/qf4ccf8f5435d4a78bdca4d6a018b578e/bbbabbab;ILqeaa361f143ee4a0894bd168fd9b30c66/qf4ccf8f5435d4a78bdca4d6a018b578e/bbbabbab;ZLjava/lang/Runnable;)V
      // 1c9: astore 15
      // 1cb: aload 15
      // 1cd: aload 1
      // 1ce: invokeinterface qeaa361f143ee4a0894bd168fd9b30c66/qf4ccf8f5435d4a78bdca4d6a018b578e/abbbaaa.aa ()I 1
      // 1d3: iload 5
      // 1d5: invokestatic qeaa361f143ee4a0894bd168fd9b30c66/qf4ccf8f5435d4a78bdca4d6a018b578e/abaaabaa.abaa (Lqeaa361f143ee4a0894bd168fd9b30c66/qf4ccf8f5435d4a78bdca4d6a018b578e/aaabbaaba;II)V
      // 1d8: aload 0
      // 1d9: getfield qeaa361f143ee4a0894bd168fd9b30c66/qf4ccf8f5435d4a78bdca4d6a018b578e/abaaabaa.aaa Ljava/util/Deque;
      // 1dc: aload 15
      // 1de: invokeinterface java/util/Deque.addFirst (Ljava/lang/Object;)V 2
      // 1e3: iload 11
      // 1e5: iload 3
      // 1e6: if_icmpne 1f5
      // 1e9: aload 4
      // 1eb: getstatic qeaa361f143ee4a0894bd168fd9b30c66/qf4ccf8f5435d4a78bdca4d6a018b578e/bbbabbab.b Lqeaa361f143ee4a0894bd168fd9b30c66/qf4ccf8f5435d4a78bdca4d6a018b578e/bbbabbab;
      // 1ee: if_acmpeq 202
      // 1f1: goto 1f5
      // 1f4: athrow
      // 1f5: aload 1
      // 1f6: aload 4
      // 1f8: iload 3
      // 1f9: invokeinterface qeaa361f143ee4a0894bd168fd9b30c66/qf4ccf8f5435d4a78bdca4d6a018b578e/abbbaaa.ba (Lqeaa361f143ee4a0894bd168fd9b30c66/qf4ccf8f5435d4a78bdca4d6a018b578e/bbbabbab;I)V 3
      // 1fe: goto 202
      // 201: athrow
      // 202: aload 15
      // 204: getfield qeaa361f143ee4a0894bd168fd9b30c66/qf4ccf8f5435d4a78bdca4d6a018b578e/aaabbaaba.aba Lqeaa361f143ee4a0894bd168fd9b30c66/qf4ccf8f5435d4a78bdca4d6a018b578e/abaabbba;
      // 207: areturn
   }

   private aaabbaaba bbbb(Object param1) {
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
      // 08: aconst_null
      // 09: areturn
      // 0a: athrow
      // 0b: aload 0
      // 0c: getfield qeaa361f143ee4a0894bd168fd9b30c66/qf4ccf8f5435d4a78bdca4d6a018b578e/abaaabaa.aaa Ljava/util/Deque;
      // 0f: invokeinterface java/util/Deque.iterator ()Ljava/util/Iterator; 1
      // 14: astore 3
      // 15: aload 3
      // 16: invokeinterface java/util/Iterator.hasNext ()Z 1
      // 1b: ifeq 48
      // 1e: aload 3
      // 1f: invokeinterface java/util/Iterator.next ()Ljava/lang/Object; 1
      // 24: checkcast qeaa361f143ee4a0894bd168fd9b30c66/qf4ccf8f5435d4a78bdca4d6a018b578e/aaabbaaba
      // 27: astore 4
      // 29: aload 4
      // 2b: iload 2
      // 2c: ifne 43
      // 2f: getfield qeaa361f143ee4a0894bd168fd9b30c66/qf4ccf8f5435d4a78bdca4d6a018b578e/aaabbaaba.aba Lqeaa361f143ee4a0894bd168fd9b30c66/qf4ccf8f5435d4a78bdca4d6a018b578e/abaabbba;
      // 32: invokevirtual qeaa361f143ee4a0894bd168fd9b30c66/qf4ccf8f5435d4a78bdca4d6a018b578e/abaabbba.a ()Ljava/lang/Object;
      // 35: aload 1
      // 36: if_acmpne 44
      // 39: goto 3d
      // 3c: athrow
      // 3d: aload 4
      // 3f: goto 43
      // 42: athrow
      // 43: areturn
      // 44: iload 2
      // 45: ifeq 15
      // 48: aconst_null
      // 49: areturn
   }

   public synchronized void aaaaa(abbbaaa param1, Object param2, abbaaabba param3) {
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
      // 06: aload 2
      // 07: invokevirtual qeaa361f143ee4a0894bd168fd9b30c66/qf4ccf8f5435d4a78bdca4d6a018b578e/abaaabaa.bbbb (Ljava/lang/Object;)Lqeaa361f143ee4a0894bd168fd9b30c66/qf4ccf8f5435d4a78bdca4d6a018b578e/aaabbaaba;
      // 0a: astore 5
      // 0c: aload 5
      // 0e: iload 4
      // 10: ifne 1d
      // 13: ifnonnull 1b
      // 16: goto 1a
      // 19: athrow
      // 1a: return
      // 1b: aload 5
      // 1d: iload 4
      // 1f: ifne 47
      // 22: aload 0
      // 23: getfield qeaa361f143ee4a0894bd168fd9b30c66/qf4ccf8f5435d4a78bdca4d6a018b578e/abaaabaa.aaa Ljava/util/Deque;
      // 26: invokeinterface java/util/Deque.peekFirst ()Ljava/lang/Object; 1
      // 2b: if_acmpeq 45
      // 2e: goto 32
      // 31: athrow
      // 32: aload 0
      // 33: getfield qeaa361f143ee4a0894bd168fd9b30c66/qf4ccf8f5435d4a78bdca4d6a018b578e/abaaabaa.aaa Ljava/util/Deque;
      // 36: aload 5
      // 38: invokeinterface java/util/Deque.remove (Ljava/lang/Object;)Z 2
      // 3d: pop
      // 3e: aload 5
      // 40: invokestatic qeaa361f143ee4a0894bd168fd9b30c66/qf4ccf8f5435d4a78bdca4d6a018b578e/abaaabaa.aaaba (Lqeaa361f143ee4a0894bd168fd9b30c66/qf4ccf8f5435d4a78bdca4d6a018b578e/aaabbaaba;)V
      // 43: return
      // 44: athrow
      // 45: aload 5
      // 47: iload 4
      // 49: ifne 77
      // 4c: invokestatic qeaa361f143ee4a0894bd168fd9b30c66/qf4ccf8f5435d4a78bdca4d6a018b578e/abaaabaa.aaaba (Lqeaa361f143ee4a0894bd168fd9b30c66/qf4ccf8f5435d4a78bdca4d6a018b578e/aaabbaaba;)V
      // 4f: aload 3
      // 50: getstatic qeaa361f143ee4a0894bd168fd9b30c66/qf4ccf8f5435d4a78bdca4d6a018b578e/abbaaabba.aba Lqeaa361f143ee4a0894bd168fd9b30c66/qf4ccf8f5435d4a78bdca4d6a018b578e/abbaaabba;
      // 53: if_acmpne 6a
      // 56: goto 5a
      // 59: athrow
      // 5a: aload 0
      // 5b: aload 1
      // 5c: aload 5
      // 5e: invokevirtual qeaa361f143ee4a0894bd168fd9b30c66/qf4ccf8f5435d4a78bdca4d6a018b578e/abaaabaa.b (Lqeaa361f143ee4a0894bd168fd9b30c66/qf4ccf8f5435d4a78bdca4d6a018b578e/abbbaaa;Lqeaa361f143ee4a0894bd168fd9b30c66/qf4ccf8f5435d4a78bdca4d6a018b578e/aaabbaaba;)V
      // 61: iload 4
      // 63: ifeq 78
      // 66: goto 6a
      // 69: athrow
      // 6a: aload 0
      // 6b: getfield qeaa361f143ee4a0894bd168fd9b30c66/qf4ccf8f5435d4a78bdca4d6a018b578e/abaaabaa.aaa Ljava/util/Deque;
      // 6e: invokeinterface java/util/Deque.removeFirst ()Ljava/lang/Object; 1
      // 73: goto 77
      // 76: athrow
      // 77: pop
      // 78: aload 3
      // 79: getstatic qeaa361f143ee4a0894bd168fd9b30c66/qf4ccf8f5435d4a78bdca4d6a018b578e/abbaaabba.aba Lqeaa361f143ee4a0894bd168fd9b30c66/qf4ccf8f5435d4a78bdca4d6a018b578e/abbaaabba;
      // 7c: if_acmpeq ba
      // 7f: aload 0
      // 80: iload 4
      // 82: ifne a5
      // 85: goto 89
      // 88: athrow
      // 89: getfield qeaa361f143ee4a0894bd168fd9b30c66/qf4ccf8f5435d4a78bdca4d6a018b578e/abaaabaa.aaa Ljava/util/Deque;
      // 8c: invokeinterface java/util/Deque.isEmpty ()Z 1
      // 91: ifne ba
      // 94: goto 98
      // 97: athrow
      // 98: aload 0
      // 99: getfield qeaa361f143ee4a0894bd168fd9b30c66/qf4ccf8f5435d4a78bdca4d6a018b578e/abaaabaa.aaa Ljava/util/Deque;
      // 9c: invokeinterface java/util/Deque.peekFirst ()Ljava/lang/Object; 1
      // a1: goto a5
      // a4: athrow
      // a5: checkcast qeaa361f143ee4a0894bd168fd9b30c66/qf4ccf8f5435d4a78bdca4d6a018b578e/aaabbaaba
      // a8: astore 6
      // aa: aload 1
      // ab: aload 6
      // ad: getfield qeaa361f143ee4a0894bd168fd9b30c66/qf4ccf8f5435d4a78bdca4d6a018b578e/aaabbaaba.b Lqeaa361f143ee4a0894bd168fd9b30c66/qf4ccf8f5435d4a78bdca4d6a018b578e/bbbabbab;
      // b0: aload 6
      // b2: getfield qeaa361f143ee4a0894bd168fd9b30c66/qf4ccf8f5435d4a78bdca4d6a018b578e/aaabbaaba.a I
      // b5: invokeinterface qeaa361f143ee4a0894bd168fd9b30c66/qf4ccf8f5435d4a78bdca4d6a018b578e/abbbaaa.ba (Lqeaa361f143ee4a0894bd168fd9b30c66/qf4ccf8f5435d4a78bdca4d6a018b578e/bbbabbab;I)V 3
      // ba: return
   }

   private static String aabba(int var0, int var1, byte var2, char var3, byte var4, int var5, byte var6) {
      int var11 = var5 ^ -207249053;
      char[] var10 = aba[var11].toCharArray();
      StackTraceElement[] var12 = (StackTraceElement[])abb[var11];
      StackTraceElement[] var13;
      if (var12 != null) {
         var13 = var12;
      } else {
         var13 = new Throwable().getStackTrace();
         abb[var11] = var13;
      }

      StackTraceElement var14 = var13[1];
      int var8 = (var14.getClassName().hashCode() ^ var14.getMethodName().hashCode()) >> 16 ^ 7264;
      int var9 = 0;

      do {
         var10[var9] = (char)(var10[var9] ^ switch (var9 % 24) {
            default -> 230;
            case 1 -> 218;
            case 2 -> 14;
            case 3 -> 172;
            case 4 -> 247;
            case 5 -> 155;
            case 6 -> 67;
            case 7 -> 140;
            case 8 -> 39;
            case 9 -> 252;
            case 10 -> 162;
            case 11 -> 194;
            case 12 -> 147;
            case 13 -> 80;
            case 14 -> 219;
            case 15 -> 40;
            case 16 -> 195;
            case 17 -> 186;
            case 18 -> 33;
            case 19 -> 115;
            case 20 -> 156;
            case 21 -> 100;
            case 22 -> 143;
            case 23 -> 205;
         } ^ var0 ^ var1 ^ var4 ^ var5 ^ var8 ^ var6 ^ var3 ^ var2);
      } while (++var9 < var10.length);

      return new String(var10).intern();
   }

   private static boolean aaaab(abbbaaa param0, Object param1, int param2, bbbabbab param3) {
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
      // 0b: ifnull 57
      // 0e: goto 12
      // 11: athrow
      // 12: aload 1
      // 13: ifnull 57
      // 16: aload 3
      // 17: ifnull 57
      // 1a: goto 1e
      // 1d: athrow
      // 1e: iload 2
      // 1f: iload 4
      // 21: ifne 30
      // 24: goto 28
      // 27: athrow
      // 28: iflt 57
      // 2b: goto 2f
      // 2e: athrow
      // 2f: iload 2
      // 30: iload 4
      // 32: ifne 54
      // 35: ldc_w -1836150799
      // 38: ldc_w -36761853
      // 3b: ldc_w 1408012620
      // 3e: ixor
      // 3f: invokestatic qeaa361f143ee4a0894bd168fd9b30c66/qf4ccf8f5435d4a78bdca4d6a018b578e/abaaabaa.aabab (II)I
      // 42: ldc2_w 5031038106412107399
      // 45: invokestatic qeaa361f143ee4a0894bd168fd9b30c66/qf4ccf8f5435d4a78bdca4d6a018b578e/abaaabaa.abba (IJ)I
      // 48: if_icmpgt 57
      // 4b: goto 4f
      // 4e: athrow
      // 4f: bipush 1
      // 50: goto 54
      // 53: athrow
      // 54: goto 58
      // 57: bipush 0
      // 58: ireturn
   }

   private static void aaaba(aaabbaaba var0) {
      int var1 = baaabbaa.bba;
      Runnable var2 = var0.ba;

      try {
         if (var1 != 0) {
            return;
         }

         var0.ba = null;
         if (var2 == null) {
            return;
         }
      } catch (Throwable var5) {
         throw var5;
      }

      try {
         var2.run();
      } catch (Throwable var4) {
         var4.printStackTrace();
      }
   }

   public synchronized void aaabb() {
      this.aaa.clear();
   }

   static {
      int var32 = 2084102837;
      short var27 = 23229;
      int var26 = 0;
      String[] var10002 = new String[6];
      int var25 = 0;
      String[] var24 = var10002;
      int var23 = "\u0010\udd09\uddfe\ude51ᷦ\udfdd᷽\udf79\uddea\udca5᷾\udd69鷊\ude41巨\udfc1巒\n麏秡鴷秣鼏匿鷫秮鰛称\u0010騝\ud98e髍妇飁妨鯵ᦚ馁馣驍馪骍香魡\ud9a0\n쒟籀윧籂씟ﱊ쟻籏옋籑\u0010堚\ue595妢ꖊ孊\ue5be妒ꖗ姾斺媢料壖░堺ꖡ\n〾挊㎆挈ㆾ\ue300㍚挅㊪挛"
         .length();
      String var22 = "\u0010\udd09\uddfe\ude51ᷦ\udfdd᷽\udf79\uddea\udca5᷾\udd69鷊\ude41巨\udfc1巒\n麏秡鴷秣鼏匿鷫秮鰛称\u0010騝\ud98e髍妇飁妨鯵ᦚ馁馣驍馪骍香魡\ud9a0\n쒟籀윧籂씟ﱊ쟻籏옋籑\u0010堚\ue595妢ꖊ孊\ue5be妒ꖗ姾斺媢料壖░堺ꖡ\n〾挊㎆挈ㆾ\ue300㍚挅㊪挛";

      do {
         int var30 = 0;
         char var28 = var22.charAt(var26);
         char[] var29 = var22.substring(var26 + 1, var26 + 1 + var28).toCharArray();

         do {
            char var31 = var29[var30];
            if (var30 % 2 == 0) {
               var29[var30] = (char)((var31 >>> 2 | var31 << 14) & 65535 ^ var27);
            } else {
               var29[var30] = (char)((var31 << 2 | var31 >>> 14) & 65535 ^ var27);
            }
         } while (++var30 < var29.length);

         var24[var25] = new String(var29);
         var25++;
         var26 = var26 + var28 + 1;
      } while (var26 < var23);

      aba = var24;
      abb = new Object[var24.length];
      int var18 = -874683896;
      byte[] var16 = "ý\u0091;¶\u0085\u0085*\u0003Ülu\u0003Üg2Fs8©\f[¿\r}ëÁØç)2°ÑÎd\\ÖÓ·¥¨2Àc\u0080¡Í?¿ò\u0096fQ9'\u0099÷·\u0098c\u0091\u0000q\t\u0087í?\u0092\u0098\u0098\u0084LtßI\u008d\"l\u0094SÝÍ\u001fqì×\u001eÍ\u00ad\u0082¬\\úû\u00adº\u0088\u0089[U\u009fÏ\u0088ËN/\u009a6hØÅ]}khÚS\u0093[Ì¬5\u008a\u00ad\u001b]_%HJéÿ\u0091\u0093ZïFÇÞ&O÷peQ"
         .getBytes("ISO-8859-1");
      int var17 = var16.length / 4;
      aab = new int[var17];
      byte var19 = 0;
      int var20 = 0;

      do {
         int var21 = (var16[var19] & 255) << 24 | (var16[var19 + 1] & 255) << 16 | (var16[var19 + 2] & 255) << 8 | var16[var19 + 3] & 255;
         var21 ^= var18;
         aab[var20] = var21;
         var19 += 4;
      } while (++var20 < var17);

      long var8 = 3470977711174772708L;
      long[] var14 = new long[2];
      int var11 = 0;
      String var12;
      int var13 = (var12 = aabba(1848987789, 1544540936, (byte)-68, '쨛', (byte)-6, -207249053, 76)).length();
      byte var10 = 0;

      do {
         int var10001 = var10;
         var10 += 8;
         byte[] var15 = var12.substring(var10001, var10).getBytes(aabba(875231189, 1730666972, (byte)-40, 12292, (byte)-20, -207249054, (byte)-86));
         var10001 = var11++;
         long var10004 = (
               (var15[0] & 255L) << aabab(-1836150830, var32 ^ 654693378)
                  | (var15[1] & 255L) << aabab(-1836150829, var32 ^ 1595000254)
                  | (var15[2] & 255L) << aabab(-1836150832, var32 ^ 116956005)
                  | (var15[3] & 255L) << aabab(-1836150831, var32 ^ 116644905)
                  | (var15[4] & 255L) << aabab(-1836150826, var32 ^ -1448327460)
                  | (var15[5] & 255L) << aabab(-1836150825, var32 ^ -2127830364)
                  | (var15[aabab(-1836150828, var32 ^ 827668327)] & 255L) << aabab(-1836150827, var32 ^ -207200430)
                  | var15[aabab(-1836150822, var32 ^ 351318879)] & 255L
            )
            ^ var8;
         byte var10003 = -1;
         var14[var10001] = var10004;
      } while (var10 < var13);

      ba = var14;
      ab = new Integer[2];
      long var0 = 438679998989979278L;
      long[] var6 = new long[4];
      int var3 = 0;
      String var4;
      int var5 = (var4 = aabba(-1707648672, -61675985, (byte)-19, (char)'\ue7cf', (byte)-82, -207249055, (byte)36)).length();
      byte var2 = 0;

      label57:
      while (true) {
         int var36 = var2;
         var2 += 8;
         byte[] var7 = var4.substring(var36, var2).getBytes(aabba(-2078247286, -2014530430, (byte)-123, 3350, (byte)64, -207249056, (byte)-50));
         long[] var10000 = var6;
         var36 = var3++;
         long var39 = (var7[0] & 255L) << aabab(-1836150821, var32 ^ 153307669)
            | (var7[1] & 255L) << aabab(-1836150824, var32 ^ -397112266)
            | (var7[2] & 255L) << aabab(-1836150823, var32 ^ 2069483984)
            | (var7[3] & 255L) << aabab(-1836150818, var32 ^ 671254577)
            | (var7[4] & 255L) << aabab(-1836150817, var32 ^ -474778066)
            | (var7[5] & 255L) << aabab(-1836150820, var32 ^ 1829538883)
            | (var7[aabab(-1836150819, var32 ^ -622467570)] & 255L) << aabab(-1836150846, var32 ^ 933985548)
            | var7[aabab(-1836150845, var32 ^ 1108386788)] & 255L;
         byte var41 = -1;

         while (true) {
            long var44 = var39 ^ var0;
            switch (var41) {
               case 0:
                  var10000[var36] = var44;
                  if (var2 >= var5) {
                     bb = var6;
                     a = new Long[4];
                     aa = aaba(aabab(-1836150839, var32 ^ 38901924), 7166273844328789230L);
                     return;
                  }
                  break;
               default:
                  var10000[var36] = var44;
                  if (var2 < var5) {
                     continue label57;
                  }

                  var5 = (var4 = aabba(414051870, 551251359, (byte)-45, 11141, (byte)-50, -207249049, 63)).length();
                  var2 = 0;
            }

            byte var38 = var2;
            var2 += 8;
            var7 = var4.substring(var38, var2).getBytes(aabba(-2010337669, -185730681, 48, (char)'\ue5d4', (byte)88, -207249050, 123));
            var10000 = var6;
            var36 = var3++;
            var39 = (var7[0] & 255L) << aabab(-1836150848, var32 ^ 98394756)
               | (var7[1] & 255L) << aabab(-1836150847, var32 ^ -1241465742)
               | (var7[2] & 255L) << aabab(-1836150842, var32 ^ 395026332)
               | (var7[3] & 255L) << aabab(-1836150841, var32 ^ 227156948)
               | (var7[4] & 255L) << aabab(-1836150844, var32 ^ 1480110904)
               | (var7[5] & 255L) << aabab(-1836150843, var32 ^ 557405507)
               | (var7[aabab(-1836150838, var32 ^ 1406122497)] & 255L) << aabab(-1836150837, var32 ^ 354165971)
               | var7[aabab(-1836150840, var32 ^ -183576077)] & 255L;
            var41 = 0;
         }
      }
   }

   public synchronized int aabaa() {
      return this.aaa.size();
   }

   private void b(abbbaaa param1, aaabbaaba param2) {
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
      // 06: invokevirtual qeaa361f143ee4a0894bd168fd9b30c66/qf4ccf8f5435d4a78bdca4d6a018b578e/abaaabaa.abab (Lqeaa361f143ee4a0894bd168fd9b30c66/qf4ccf8f5435d4a78bdca4d6a018b578e/aaabbaaba;)Lqeaa361f143ee4a0894bd168fd9b30c66/qf4ccf8f5435d4a78bdca4d6a018b578e/aaabbaaba;
      // 09: astore 4
      // 0b: aload 4
      // 0d: iload 3
      // 0e: ifne 22
      // 11: ifnull 21
      // 14: goto 18
      // 17: athrow
      // 18: aload 4
      // 1a: getfield qeaa361f143ee4a0894bd168fd9b30c66/qf4ccf8f5435d4a78bdca4d6a018b578e/aaabbaaba.a I
      // 1d: goto 25
      // 20: athrow
      // 21: aload 2
      // 22: getfield qeaa361f143ee4a0894bd168fd9b30c66/qf4ccf8f5435d4a78bdca4d6a018b578e/aaabbaaba.bab I
      // 25: istore 5
      // 27: aload 2
      // 28: iload 3
      // 29: ifne 42
      // 2c: getfield qeaa361f143ee4a0894bd168fd9b30c66/qf4ccf8f5435d4a78bdca4d6a018b578e/aaabbaaba.b Lqeaa361f143ee4a0894bd168fd9b30c66/qf4ccf8f5435d4a78bdca4d6a018b578e/bbbabbab;
      // 2f: getstatic qeaa361f143ee4a0894bd168fd9b30c66/qf4ccf8f5435d4a78bdca4d6a018b578e/bbbabbab.b Lqeaa361f143ee4a0894bd168fd9b30c66/qf4ccf8f5435d4a78bdca4d6a018b578e/bbbabbab;
      // 32: if_acmpne 40
      // 35: goto 39
      // 38: athrow
      // 39: getstatic qeaa361f143ee4a0894bd168fd9b30c66/qf4ccf8f5435d4a78bdca4d6a018b578e/bbbabbab.b Lqeaa361f143ee4a0894bd168fd9b30c66/qf4ccf8f5435d4a78bdca4d6a018b578e/bbbabbab;
      // 3c: goto 5a
      // 3f: athrow
      // 40: aload 4
      // 42: iload 3
      // 43: ifne 57
      // 46: ifnull 56
      // 49: goto 4d
      // 4c: athrow
      // 4d: aload 4
      // 4f: getfield qeaa361f143ee4a0894bd168fd9b30c66/qf4ccf8f5435d4a78bdca4d6a018b578e/aaabbaaba.b Lqeaa361f143ee4a0894bd168fd9b30c66/qf4ccf8f5435d4a78bdca4d6a018b578e/bbbabbab;
      // 52: goto 5a
      // 55: athrow
      // 56: aload 2
      // 57: getfield qeaa361f143ee4a0894bd168fd9b30c66/qf4ccf8f5435d4a78bdca4d6a018b578e/aaabbaaba.aab Lqeaa361f143ee4a0894bd168fd9b30c66/qf4ccf8f5435d4a78bdca4d6a018b578e/bbbabbab;
      // 5a: astore 6
      // 5c: iload 3
      // 5d: ifne af
      // 60: aload 2
      // 61: bipush 1
      // 62: putfield qeaa361f143ee4a0894bd168fd9b30c66/qf4ccf8f5435d4a78bdca4d6a018b578e/aaabbaaba.aa Z
      // 65: aload 2
      // 66: iload 5
      // 68: putfield qeaa361f143ee4a0894bd168fd9b30c66/qf4ccf8f5435d4a78bdca4d6a018b578e/aaabbaaba.a I
      // 6b: aload 2
      // 6c: aload 6
      // 6e: putfield qeaa361f143ee4a0894bd168fd9b30c66/qf4ccf8f5435d4a78bdca4d6a018b578e/aaabbaaba.b Lqeaa361f143ee4a0894bd168fd9b30c66/qf4ccf8f5435d4a78bdca4d6a018b578e/bbbabbab;
      // 71: aload 1
      // 72: aload 6
      // 74: iload 5
      // 76: invokeinterface qeaa361f143ee4a0894bd168fd9b30c66/qf4ccf8f5435d4a78bdca4d6a018b578e/abbbaaa.ba (Lqeaa361f143ee4a0894bd168fd9b30c66/qf4ccf8f5435d4a78bdca4d6a018b578e/bbbabbab;I)V 3
      // 7b: aload 6
      // 7d: getstatic qeaa361f143ee4a0894bd168fd9b30c66/qf4ccf8f5435d4a78bdca4d6a018b578e/bbbabbab.b Lqeaa361f143ee4a0894bd168fd9b30c66/qf4ccf8f5435d4a78bdca4d6a018b578e/bbbabbab;
      // 80: if_acmpne a0
      // 83: goto 87
      // 86: athrow
      // 87: aload 1
      // 88: aload 6
      // 8a: iload 5
      // 8c: invokeinterface qeaa361f143ee4a0894bd168fd9b30c66/qf4ccf8f5435d4a78bdca4d6a018b578e/abbbaaa.ab (Lqeaa361f143ee4a0894bd168fd9b30c66/qf4ccf8f5435d4a78bdca4d6a018b578e/bbbabbab;I)Z 3
      // 91: iload 3
      // 92: ifne ae
      // 95: goto 99
      // 98: athrow
      // 99: ifeq b4
      // 9c: goto a0
      // 9f: athrow
      // a0: aload 0
      // a1: getfield qeaa361f143ee4a0894bd168fd9b30c66/qf4ccf8f5435d4a78bdca4d6a018b578e/abaaabaa.aaa Ljava/util/Deque;
      // a4: aload 2
      // a5: invokeinterface java/util/Deque.remove (Ljava/lang/Object;)Z 2
      // aa: goto ae
      // ad: athrow
      // ae: pop
      // af: aload 2
      // b0: bipush 0
      // b1: putfield qeaa361f143ee4a0894bd168fd9b30c66/qf4ccf8f5435d4a78bdca4d6a018b578e/aaabbaaba.aa Z
      // b4: return
   }

   public synchronized int a(Object param1) {
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
      // 05: getfield qeaa361f143ee4a0894bd168fd9b30c66/qf4ccf8f5435d4a78bdca4d6a018b578e/abaaabaa.aaa Ljava/util/Deque;
      // 08: invokeinterface java/util/Deque.peekFirst ()Ljava/lang/Object; 1
      // 0d: checkcast qeaa361f143ee4a0894bd168fd9b30c66/qf4ccf8f5435d4a78bdca4d6a018b578e/aaabbaaba
      // 10: astore 3
      // 11: aload 1
      // 12: ifnull 47
      // 15: aload 3
      // 16: iload 2
      // 17: ifne 38
      // 1a: goto 1e
      // 1d: athrow
      // 1e: ifnull 47
      // 21: goto 25
      // 24: athrow
      // 25: aload 3
      // 26: iload 2
      // 27: ifne 41
      // 2a: goto 2e
      // 2d: athrow
      // 2e: getfield qeaa361f143ee4a0894bd168fd9b30c66/qf4ccf8f5435d4a78bdca4d6a018b578e/aaabbaaba.aba Lqeaa361f143ee4a0894bd168fd9b30c66/qf4ccf8f5435d4a78bdca4d6a018b578e/abaabbba;
      // 31: invokevirtual qeaa361f143ee4a0894bd168fd9b30c66/qf4ccf8f5435d4a78bdca4d6a018b578e/abaabbba.a ()Ljava/lang/Object;
      // 34: goto 38
      // 37: athrow
      // 38: aload 1
      // 39: if_acmpne 47
      // 3c: aload 3
      // 3d: goto 41
      // 40: athrow
      // 41: getfield qeaa361f143ee4a0894bd168fd9b30c66/qf4ccf8f5435d4a78bdca4d6a018b578e/aaabbaaba.a I
      // 44: goto 48
      // 47: bipush -1
      // 48: ireturn
   }
}
