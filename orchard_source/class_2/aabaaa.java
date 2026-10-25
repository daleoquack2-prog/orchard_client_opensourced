package nsc;

import io.netty.channel.ChannelDuplexHandler;
import io.netty.channel.ChannelHandlerContext;
import io.netty.channel.ChannelPromise;
import io.netty.util.concurrent.Future;
import java.nio.channels.ClosedChannelException;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.Set;
import java.util.concurrent.CancellationException;
import java.util.concurrent.ConcurrentHashMap;
import java.util.concurrent.ConcurrentLinkedQueue;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.atomic.AtomicBoolean;
import java.util.concurrent.atomic.AtomicLong;
import java.util.function.Consumer;
import java.util.function.Predicate;
import net.fabricmc.api.EnvType;
import net.fabricmc.api.Environment;
import net.minecraft.class_2596;
import net.minecraft.class_2828;
import net.minecraft.class_2868;
import net.minecraft.class_2886;
import net.minecraft.class_310;
import net.minecraft.class_2828.class_2829;
import net.minecraft.class_2828.class_5911;

@Environment(EnvType.CLIENT)
public final class aabaaa extends ChannelDuplexHandler {
   private volatile ChannelHandlerContext ba;
   private volatile boolean aa;
   private final ConcurrentLinkedQueue aaa;
   private volatile boolean aab;
   private final ConcurrentLinkedQueue aba;
   private final ConcurrentLinkedQueue abb;
   private static final long baa;
   private static final int bab;
   private static final int bba;
   private final ConcurrentLinkedQueue bbb;
   private static final long[] aaaa;
   private volatile boolean aaab;
   private static volatile int aaba;
   private static final int aabb;
   private static final long abaa;
   private static volatile baabbba a;
   private static volatile long abab;
   private static final Set abba;
   private final AtomicBoolean abbb;
   private float baaa;
   private static final int baab;
   private static final Object baba;
   private static final int babb;
   private float[] bbaa;
   private final ConcurrentLinkedQueue bbab = new ConcurrentLinkedQueue();
   private float bbba;
   private boolean bbbb;
   private volatile int aaaaa;
   private static final long aaaab;
   private boolean b;
   private final AtomicBoolean aaaba;
   private boolean aaabb;
   private static final ConcurrentHashMap aabaa;
   private volatile long aabab;
   private volatile long aabba;
   private volatile long aabbb;
   private static volatile aaabbabbb abaaa;
   private static volatile aaabbabbb abaab;
   private static final Integer[] ababa;
   private volatile boolean ababb;
   private final AtomicLong abbaa;
   private static long abbab;
   private float abbba;
   private static volatile long abbbb;
   private volatile int baaaa;
   private boolean baaab;
   private static volatile boolean baaba;
   private static volatile abaaaabba baabb;
   private static final int babaa;
   private final AtomicBoolean babab;
   private static final ConcurrentHashMap babba;
   private static final Set babbb;
   private static final int bbaaa;
   private static final int bbaab;
   private final AtomicBoolean bbaba;
   private static volatile boolean bbabb;
   private static final int[] abbaab;
   private final Set bbbaa;
   private static final Object[] abbabb;
   private static final String[] bbbab;
   private final ConcurrentLinkedQueue bb;
   private static final String[] abbaba;
   private static volatile long bbbba;
   private static final int bbbbb;
   private volatile boolean aaaaaa;
   private static volatile boolean aaaaab;
   private static volatile abaaaabba aaaaba;
   private final AtomicBoolean aaaabb;
   private static volatile boolean aaabaa;
   private volatile boolean aaabab;
   private static final long ab;
   private static final int aaabba;
   private static final int aaabbb;
   private static final String[] aabaaa;
   private static volatile boolean aabaab;
   private static volatile int aababa;
   private static volatile abbbbbbb aababb;
   private final ConcurrentLinkedQueue aabbaa;
   private static final int aabbab;
   private volatile long aabbba;
   private boolean aabbbb;
   private static final Long[] abaaaa;
   private float abaaab;
   private boolean abaaba;
   private float abaabb;
   private static final long[] ababaa;
   private float ababab;
   private static final long ababba;
   private static volatile boolean ababbb;
   private boolean abbaaa;

   private static void aa(baabbba param0, class_2596 param1) {
      // $VF: Couldn't be decompiled
      // Please report this to the Vineflower issue tracker, at https://github.com/Vineflower/vineflower/issues with a copy of the class file (if you have the rights to distribute it!)
      // java.lang.RuntimeException: parsing failure!
      //   at org.jetbrains.java.decompiler.modules.decompiler.decompose.DomHelper.parseGraph(DomHelper.java:211)
      //   at org.jetbrains.java.decompiler.main.rels.MethodProcessor.codeToJava(MethodProcessor.java:166)
      //
      // Bytecode:
      // 00: getstatic qeaa361f143ee4a0894bd168fd9b30c66/qf4ccf8f5435d4a78bdca4d6a018b578e/baaabbaa.bba I
      // 03: istore 2
      // 04: getstatic qeaa361f143ee4a0894bd168fd9b30c66/qf4ccf8f5435d4a78bdca4d6a018b578e/aabaaa.a Lqeaa361f143ee4a0894bd168fd9b30c66/qf4ccf8f5435d4a78bdca4d6a018b578e/baabbba;
      // 07: iload 2
      // 08: ifne 16
      // 0b: aload 0
      // 0c: if_acmpeq 15
      // 0f: goto 13
      // 12: athrow
      // 13: return
      // 14: athrow
      // 15: aload 0
      // 16: invokevirtual qeaa361f143ee4a0894bd168fd9b30c66/qf4ccf8f5435d4a78bdca4d6a018b578e/baabbba.aa ()Ljava/util/function/Consumer;
      // 19: aload 1
      // 1a: invokeinterface java/util/function/Consumer.accept (Ljava/lang/Object;)V 2
      // 1f: goto 25
      // 22: astore 3
      // 23: aload 3
      // 24: pop
      // 25: return
   }

   static void ab(boolean var0) {
      ababbb = var0;
   }

   private void ba(ChannelHandlerContext var1, long var2, abaaaabba var4) {
      this.aababa(var1, var2, var4);
   }

   private void bb() {
      this.ababb = false;
      this.aaab = false;
      this.aab = false;
      this.aaaaaa = false;
   }

   private static long aaa(int var0, long var1) {
      int var3 = (var0 ^ (int)var1 ^ baaaaab(-522994203, -640617300 ^ 1059115691)) & baaaaab(-522994204, -640617300 ^ 569406176);
      if (abaaaa[var3] == null) {
         abaaaa[var3] = ababaa[var3] ^ var1;
      }

      return abaaaa[var3];
   }

   public static int aab() {
      return aaba;
   }

   public static boolean aba(aaabbabbb param0, boolean param1) {
      // $VF: Couldn't be decompiled
      // Please report this to the Vineflower issue tracker, at https://github.com/Vineflower/vineflower/issues with a copy of the class file (if you have the rights to distribute it!)
      // java.lang.NullPointerException: Cannot invoke "org.jetbrains.java.decompiler.code.cfg.ExceptionRangeCFG.isCircular()" because "range" is null
      //   at org.jetbrains.java.decompiler.modules.decompiler.decompose.DomHelper.graphToStatement(DomHelper.java:84)
      //   at org.jetbrains.java.decompiler.modules.decompiler.decompose.DomHelper.parseGraph(DomHelper.java:203)
      //   at org.jetbrains.java.decompiler.main.rels.MethodProcessor.codeToJava(MethodProcessor.java:166)
      //
      // Bytecode:
      // 00: getstatic qeaa361f143ee4a0894bd168fd9b30c66/qf4ccf8f5435d4a78bdca4d6a018b578e/baaabbaa.bba I
      // 03: istore 2
      // 04: aload 0
      // 05: iload 2
      // 06: ifne 16
      // 09: ifnonnull 13
      // 0c: goto 10
      // 0f: athrow
      // 10: bipush 0
      // 11: ireturn
      // 12: athrow
      // 13: getstatic qeaa361f143ee4a0894bd168fd9b30c66/qf4ccf8f5435d4a78bdca4d6a018b578e/aabaaa.baba Ljava/lang/Object;
      // 16: dup
      // 17: astore 3
      // 18: monitorenter
      // 19: getstatic qeaa361f143ee4a0894bd168fd9b30c66/qf4ccf8f5435d4a78bdca4d6a018b578e/aabaaa.aaabaa Z
      // 1c: iload 2
      // 1d: ifne 3d
      // 20: ifeq 36
      // 23: getstatic qeaa361f143ee4a0894bd168fd9b30c66/qf4ccf8f5435d4a78bdca4d6a018b578e/aabaaa.abaab Lqeaa361f143ee4a0894bd168fd9b30c66/qf4ccf8f5435d4a78bdca4d6a018b578e/aaabbabbb;
      // 26: iload 2
      // 27: ifne 51
      // 2a: goto 2e
      // 2d: athrow
      // 2e: aload 0
      // 2f: if_acmpeq 3e
      // 32: goto 36
      // 35: athrow
      // 36: bipush 0
      // 37: aload 3
      // 38: monitorexit
      // 39: goto 3d
      // 3c: athrow
      // 3d: ireturn
      // 3e: bipush 0
      // 3f: putstatic qeaa361f143ee4a0894bd168fd9b30c66/qf4ccf8f5435d4a78bdca4d6a018b578e/aabaaa.aaabaa Z
      // 42: aconst_null
      // 43: putstatic qeaa361f143ee4a0894bd168fd9b30c66/qf4ccf8f5435d4a78bdca4d6a018b578e/aabaaa.abaab Lqeaa361f143ee4a0894bd168fd9b30c66/qf4ccf8f5435d4a78bdca4d6a018b578e/aaabbabbb;
      // 46: aload 0
      // 47: putstatic qeaa361f143ee4a0894bd168fd9b30c66/qf4ccf8f5435d4a78bdca4d6a018b578e/aabaaa.abaaa Lqeaa361f143ee4a0894bd168fd9b30c66/qf4ccf8f5435d4a78bdca4d6a018b578e/aaabbabbb;
      // 4a: getstatic qeaa361f143ee4a0894bd168fd9b30c66/qf4ccf8f5435d4a78bdca4d6a018b578e/aabaaa.baabb Lqeaa361f143ee4a0894bd168fd9b30c66/qf4ccf8f5435d4a78bdca4d6a018b578e/abaaaabba;
      // 4d: putstatic qeaa361f143ee4a0894bd168fd9b30c66/qf4ccf8f5435d4a78bdca4d6a018b578e/aabaaa.aaaaba Lqeaa361f143ee4a0894bd168fd9b30c66/qf4ccf8f5435d4a78bdca4d6a018b578e/abaaaabba;
      // 50: aload 3
      // 51: monitorexit
      // 52: goto 5c
      // 55: astore 4
      // 57: aload 3
      // 58: monitorexit
      // 59: aload 4
      // 5b: athrow
      // 5c: getstatic qeaa361f143ee4a0894bd168fd9b30c66/qf4ccf8f5435d4a78bdca4d6a018b578e/aabaaa.abba Ljava/util/Set;
      // 5f: invokeinterface java/util/Set.iterator ()Ljava/util/Iterator; 1
      // 64: astore 3
      // 65: aload 3
      // 66: invokeinterface java/util/Iterator.hasNext ()Z 1
      // 6b: ifeq a7
      // 6e: aload 3
      // 6f: invokeinterface java/util/Iterator.next ()Ljava/lang/Object; 1
      // 74: checkcast qeaa361f143ee4a0894bd168fd9b30c66/qf4ccf8f5435d4a78bdca4d6a018b578e/aabaaa
      // 77: astore 4
      // 79: iload 2
      // 7a: ifne 96
      // 7d: iload 2
      // 7e: ifne aa
      // 81: goto 85
      // 84: athrow
      // 85: iload 1
      // 86: ifeq 9a
      // 89: goto 8d
      // 8c: athrow
      // 8d: aload 4
      // 8f: invokevirtual qeaa361f143ee4a0894bd168fd9b30c66/qf4ccf8f5435d4a78bdca4d6a018b578e/aabaaa.aaaaaab ()V
      // 92: goto 96
      // 95: athrow
      // 96: iload 2
      // 97: ifeq a3
      // 9a: aload 4
      // 9c: invokevirtual qeaa361f143ee4a0894bd168fd9b30c66/qf4ccf8f5435d4a78bdca4d6a018b578e/aabaaa.bbbbba ()V
      // 9f: goto a3
      // a2: athrow
      // a3: iload 2
      // a4: ifeq 65
      // a7: invokestatic qeaa361f143ee4a0894bd168fd9b30c66/qf4ccf8f5435d4a78bdca4d6a018b578e/aabaaa.bbbaba ()V
      // aa: bipush 1
      // ab: ireturn
   }

   private void abb(ChannelHandlerContext param1) {
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
      // 004: bipush 0
      // 005: istore 3
      // 006: new java/util/ArrayList
      // 009: dup
      // 00a: invokespecial java/util/ArrayList.<init> ()V
      // 00d: astore 4
      // 00f: aload 0
      // 010: getfield qeaa361f143ee4a0894bd168fd9b30c66/qf4ccf8f5435d4a78bdca4d6a018b578e/aabaaa.bbaba Ljava/util/concurrent/atomic/AtomicBoolean;
      // 013: bipush 0
      // 014: invokevirtual java/util/concurrent/atomic/AtomicBoolean.set (Z)V
      // 017: aload 0
      // 018: getfield qeaa361f143ee4a0894bd168fd9b30c66/qf4ccf8f5435d4a78bdca4d6a018b578e/aabaaa.bb Ljava/util/concurrent/ConcurrentLinkedQueue;
      // 01b: invokevirtual java/util/concurrent/ConcurrentLinkedQueue.poll ()Ljava/lang/Object;
      // 01e: checkcast qeaa361f143ee4a0894bd168fd9b30c66/qf4ccf8f5435d4a78bdca4d6a018b578e/ababbb
      // 021: dup
      // 022: astore 5
      // 024: ifnull 0b4
      // 027: aload 5
      // 029: iload 2
      // 02a: ifne 0be
      // 02d: getfield qeaa361f143ee4a0894bd168fd9b30c66/qf4ccf8f5435d4a78bdca4d6a018b578e/ababbb.aa Lqeaa361f143ee4a0894bd168fd9b30c66/qf4ccf8f5435d4a78bdca4d6a018b578e/abaaaabba;
      // 030: iload 2
      // 031: ifne 095
      // 034: goto 038
      // 037: athrow
      // 038: getstatic qeaa361f143ee4a0894bd168fd9b30c66/qf4ccf8f5435d4a78bdca4d6a018b578e/abaaaabba.ba Lqeaa361f143ee4a0894bd168fd9b30c66/qf4ccf8f5435d4a78bdca4d6a018b578e/abaaaabba;
      // 03b: if_acmpne 07e
      // 03e: goto 042
      // 041: athrow
      // 042: aload 5
      // 044: iload 2
      // 045: ifne 092
      // 048: goto 04c
      // 04b: athrow
      // 04c: getfield qeaa361f143ee4a0894bd168fd9b30c66/qf4ccf8f5435d4a78bdca4d6a018b578e/ababbb.bb Ljava/lang/Object;
      // 04f: instanceof net/minecraft/class_2851
      // 052: ifeq 07e
      // 055: goto 059
      // 058: athrow
      // 059: iload 3
      // 05a: iload 2
      // 05b: ifne 07d
      // 05e: goto 062
      // 061: athrow
      // 062: ifeq 07c
      // 065: goto 069
      // 068: athrow
      // 069: aload 5
      // 06b: getfield qeaa361f143ee4a0894bd168fd9b30c66/qf4ccf8f5435d4a78bdca4d6a018b578e/ababbb.ab Lio/netty/channel/ChannelPromise;
      // 06e: invokeinterface io/netty/channel/ChannelPromise.trySuccess ()Z 1
      // 073: pop
      // 074: iload 2
      // 075: ifeq 017
      // 078: goto 07c
      // 07b: athrow
      // 07c: bipush 1
      // 07d: istore 3
      // 07e: aload 4
      // 080: iload 2
      // 081: ifne 0a0
      // 084: aload 5
      // 086: invokeinterface java/util/List.add (Ljava/lang/Object;)Z 2
      // 08b: pop
      // 08c: aload 5
      // 08e: goto 092
      // 091: athrow
      // 092: getfield qeaa361f143ee4a0894bd168fd9b30c66/qf4ccf8f5435d4a78bdca4d6a018b578e/ababbb.aa Lqeaa361f143ee4a0894bd168fd9b30c66/qf4ccf8f5435d4a78bdca4d6a018b578e/abaaaabba;
      // 095: getstatic qeaa361f143ee4a0894bd168fd9b30c66/qf4ccf8f5435d4a78bdca4d6a018b578e/abaaaabba.ba Lqeaa361f143ee4a0894bd168fd9b30c66/qf4ccf8f5435d4a78bdca4d6a018b578e/abaaaabba;
      // 098: if_acmpne 017
      // 09b: aload 5
      // 09d: getfield qeaa361f143ee4a0894bd168fd9b30c66/qf4ccf8f5435d4a78bdca4d6a018b578e/ababbb.bb Ljava/lang/Object;
      // 0a0: instanceof net/minecraft/class_9836
      // 0a3: iload 2
      // 0a4: ifne 0af
      // 0a7: ifeq 017
      // 0aa: goto 0ae
      // 0ad: athrow
      // 0ae: bipush 0
      // 0af: istore 3
      // 0b0: iload 2
      // 0b1: ifeq 017
      // 0b4: aload 0
      // 0b5: getfield qeaa361f143ee4a0894bd168fd9b30c66/qf4ccf8f5435d4a78bdca4d6a018b578e/aabaaa.aba Ljava/util/concurrent/ConcurrentLinkedQueue;
      // 0b8: invokevirtual java/util/concurrent/ConcurrentLinkedQueue.poll ()Ljava/lang/Object;
      // 0bb: checkcast qeaa361f143ee4a0894bd168fd9b30c66/qf4ccf8f5435d4a78bdca4d6a018b578e/ababbb
      // 0be: dup
      // 0bf: astore 6
      // 0c1: ifnull 0de
      // 0c4: aload 4
      // 0c6: aload 6
      // 0c8: invokeinterface java/util/List.add (Ljava/lang/Object;)Z 2
      // 0cd: iload 2
      // 0ce: ifne 0ee
      // 0d1: goto 0d5
      // 0d4: athrow
      // 0d5: pop
      // 0d6: iload 2
      // 0d7: ifeq 0b4
      // 0da: goto 0de
      // 0dd: athrow
      // 0de: aload 4
      // 0e0: invokedynamic applyAsLong ()Ljava/util/function/ToLongFunction; bsm=java/lang/invoke/LambdaMetafactory.metafactory (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;Ljava/lang/invoke/MethodType;Ljava/lang/invoke/MethodHandle;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[ (Ljava/lang/Object;)J, qeaa361f143ee4a0894bd168fd9b30c66/qf4ccf8f5435d4a78bdca4d6a018b578e/ababbb.b ()J, (Lqeaa361f143ee4a0894bd168fd9b30c66/qf4ccf8f5435d4a78bdca4d6a018b578e/ababbb;)J ]
      // 0e5: invokestatic java/util/Comparator.comparingLong (Ljava/util/function/ToLongFunction;)Ljava/util/Comparator;
      // 0e8: invokeinterface java/util/List.sort (Ljava/util/Comparator;)V 2
      // 0ed: bipush 0
      // 0ee: istore 7
      // 0f0: aload 4
      // 0f2: iload 2
      // 0f3: ifne 12d
      // 0f6: invokeinterface java/util/List.isEmpty ()Z 1
      // 0fb: ifne 127
      // 0fe: goto 102
      // 101: athrow
      // 102: aload 0
      // 103: iload 2
      // 104: ifne 11a
      // 107: goto 10b
      // 10a: athrow
      // 10b: invokevirtual qeaa361f143ee4a0894bd168fd9b30c66/qf4ccf8f5435d4a78bdca4d6a018b578e/aabaaa.aabbbaa ()Z
      // 10e: ifeq 127
      // 111: goto 115
      // 114: athrow
      // 115: aload 0
      // 116: goto 11a
      // 119: athrow
      // 11a: getfield qeaa361f143ee4a0894bd168fd9b30c66/qf4ccf8f5435d4a78bdca4d6a018b578e/aabaaa.aba Ljava/util/concurrent/ConcurrentLinkedQueue;
      // 11d: aload 4
      // 11f: invokevirtual java/util/concurrent/ConcurrentLinkedQueue.addAll (Ljava/util/Collection;)Z
      // 122: pop
      // 123: iload 2
      // 124: ifeq 166
      // 127: aload 4
      // 129: goto 12d
      // 12c: athrow
      // 12d: invokeinterface java/util/List.iterator ()Ljava/util/Iterator; 1
      // 132: astore 8
      // 134: aload 8
      // 136: invokeinterface java/util/Iterator.hasNext ()Z 1
      // 13b: ifeq 166
      // 13e: aload 8
      // 140: invokeinterface java/util/Iterator.next ()Ljava/lang/Object; 1
      // 145: checkcast qeaa361f143ee4a0894bd168fd9b30c66/qf4ccf8f5435d4a78bdca4d6a018b578e/ababbb
      // 148: astore 9
      // 14a: iload 2
      // 14b: ifne 1a7
      // 14e: iload 7
      // 150: aload 0
      // 151: aload 1
      // 152: aload 9
      // 154: getfield qeaa361f143ee4a0894bd168fd9b30c66/qf4ccf8f5435d4a78bdca4d6a018b578e/ababbb.bb Ljava/lang/Object;
      // 157: aload 9
      // 159: getfield qeaa361f143ee4a0894bd168fd9b30c66/qf4ccf8f5435d4a78bdca4d6a018b578e/ababbb.ab Lio/netty/channel/ChannelPromise;
      // 15c: invokevirtual qeaa361f143ee4a0894bd168fd9b30c66/qf4ccf8f5435d4a78bdca4d6a018b578e/aabaaa.abbaabb (Lio/netty/channel/ChannelHandlerContext;Ljava/lang/Object;Lio/netty/channel/ChannelPromise;)Z
      // 15f: ior
      // 160: istore 7
      // 162: iload 2
      // 163: ifeq 134
      // 166: iload 7
      // 168: iload 2
      // 169: ifne 18a
      // 16c: ifeq 19f
      // 16f: goto 173
      // 172: athrow
      // 173: aload 1
      // 174: iload 2
      // 175: ifne 197
      // 178: goto 17c
      // 17b: athrow
      // 17c: invokeinterface io/netty/channel/ChannelHandlerContext.channel ()Lio/netty/channel/Channel; 1
      // 181: invokeinterface io/netty/channel/Channel.isOpen ()Z 1
      // 186: goto 18a
      // 189: athrow
      // 18a: ifeq 19f
      // 18d: aload 1
      // 18e: invokeinterface io/netty/channel/ChannelHandlerContext.flush ()Lio/netty/channel/ChannelHandlerContext; 1
      // 193: goto 197
      // 196: athrow
      // 197: pop
      // 198: aload 0
      // 199: invokestatic java/lang/System.nanoTime ()J
      // 19c: putfield qeaa361f143ee4a0894bd168fd9b30c66/qf4ccf8f5435d4a78bdca4d6a018b578e/aabaaa.aabba J
      // 19f: aload 0
      // 1a0: bipush 0
      // 1a1: putfield qeaa361f143ee4a0894bd168fd9b30c66/qf4ccf8f5435d4a78bdca4d6a018b578e/aabaaa.aaabab Z
      // 1a4: invokestatic qeaa361f143ee4a0894bd168fd9b30c66/qf4ccf8f5435d4a78bdca4d6a018b578e/aabaaa.bbbaba ()V
      // 1a7: goto 1b5
      // 1aa: astore 3
      // 1ab: aload 0
      // 1ac: getfield qeaa361f143ee4a0894bd168fd9b30c66/qf4ccf8f5435d4a78bdca4d6a018b578e/aabaaa.bbaba Ljava/util/concurrent/atomic/AtomicBoolean;
      // 1af: bipush 0
      // 1b0: invokevirtual java/util/concurrent/atomic/AtomicBoolean.set (Z)V
      // 1b3: aload 3
      // 1b4: athrow
      // 1b5: return
   }

   private boolean baa(Object param1) {
      // $VF: Couldn't be decompiled
      // Please report this to the Vineflower issue tracker, at https://github.com/Vineflower/vineflower/issues with a copy of the class file (if you have the rights to distribute it!)
      // java.lang.RuntimeException: parsing failure!
      //   at org.jetbrains.java.decompiler.modules.decompiler.decompose.DomHelper.parseGraph(DomHelper.java:211)
      //   at org.jetbrains.java.decompiler.main.rels.MethodProcessor.codeToJava(MethodProcessor.java:166)
      //
      // Bytecode:
      // 00: getstatic qeaa361f143ee4a0894bd168fd9b30c66/qf4ccf8f5435d4a78bdca4d6a018b578e/baaabbaa.bba I
      // 03: invokestatic qeaa361f143ee4a0894bd168fd9b30c66/qf4ccf8f5435d4a78bdca4d6a018b578e/abbabbaa.abb ()Lqeaa361f143ee4a0894bd168fd9b30c66/qf4ccf8f5435d4a78bdca4d6a018b578e/abbabbaa;
      // 06: astore 3
      // 07: istore 2
      // 08: aload 3
      // 09: invokevirtual qeaa361f143ee4a0894bd168fd9b30c66/qf4ccf8f5435d4a78bdca4d6a018b578e/abbabbaa.aaab ()Z
      // 0c: iload 2
      // 0d: ifne 72
      // 10: ifeq 6d
      // 13: goto 17
      // 16: athrow
      // 17: aload 3
      // 18: invokevirtual qeaa361f143ee4a0894bd168fd9b30c66/qf4ccf8f5435d4a78bdca4d6a018b578e/abbabbaa.bb ()Z
      // 1b: iload 2
      // 1c: ifne 72
      // 1f: goto 23
      // 22: athrow
      // 23: ifeq 6d
      // 26: goto 2a
      // 29: athrow
      // 2a: aload 3
      // 2b: invokevirtual qeaa361f143ee4a0894bd168fd9b30c66/qf4ccf8f5435d4a78bdca4d6a018b578e/abbabbaa.baab ()Z
      // 2e: iload 2
      // 2f: ifne 72
      // 32: goto 36
      // 35: athrow
      // 36: ifeq 6d
      // 39: goto 3d
      // 3c: athrow
      // 3d: aload 3
      // 3e: invokevirtual qeaa361f143ee4a0894bd168fd9b30c66/qf4ccf8f5435d4a78bdca4d6a018b578e/abbabbaa.aabab ()Z
      // 41: iload 2
      // 42: ifne 72
      // 45: goto 49
      // 48: athrow
      // 49: ifne 6d
      // 4c: goto 50
      // 4f: athrow
      // 50: aload 1
      // 51: instanceof net/minecraft/class_2596
      // 54: iload 2
      // 55: ifne 72
      // 58: goto 5c
      // 5b: athrow
      // 5c: ifeq 6d
      // 5f: goto 63
      // 62: athrow
      // 63: aload 1
      // 64: checkcast net/minecraft/class_2596
      // 67: astore 4
      // 69: iload 2
      // 6a: ifeq 73
      // 6d: bipush 0
      // 6e: goto 72
      // 71: athrow
      // 72: ireturn
      // 73: aload 4
      // 75: instanceof net/minecraft/class_6374
      // 78: iload 2
      // 79: ifne e8
      // 7c: ifne e7
      // 7f: goto 83
      // 82: athrow
      // 83: aload 4
      // 85: instanceof net/minecraft/class_2827
      // 88: iload 2
      // 89: ifne e8
      // 8c: goto 90
      // 8f: athrow
      // 90: ifne e7
      // 93: goto 97
      // 96: athrow
      // 97: aload 4
      // 99: instanceof net/minecraft/class_8590
      // 9c: iload 2
      // 9d: ifne e8
      // a0: goto a4
      // a3: athrow
      // a4: ifne e7
      // a7: goto ab
      // aa: athrow
      // ab: aload 4
      // ad: instanceof net/minecraft/class_8591
      // b0: iload 2
      // b1: ifne e8
      // b4: goto b8
      // b7: athrow
      // b8: ifne e7
      // bb: goto bf
      // be: athrow
      // bf: aload 4
      // c1: instanceof net/minecraft/class_7640
      // c4: iload 2
      // c5: ifne e8
      // c8: goto cc
      // cb: athrow
      // cc: ifne e7
      // cf: goto d3
      // d2: athrow
      // d3: aload 4
      // d5: invokestatic qeaa361f143ee4a0894bd168fd9b30c66/qf4ccf8f5435d4a78bdca4d6a018b578e/aabaaa.a (Lnet/minecraft/class_2596;)Z
      // d8: iload 2
      // d9: ifne e8
      // dc: goto e0
      // df: athrow
      // e0: ifeq eb
      // e3: goto e7
      // e6: athrow
      // e7: bipush 1
      // e8: goto ec
      // eb: bipush 0
      // ec: ireturn
   }

   private long bab(aababbab param1) {
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
      // 05: getfield qeaa361f143ee4a0894bd168fd9b30c66/qf4ccf8f5435d4a78bdca4d6a018b578e/aababbab.aa Ljava/lang/Object;
      // 08: invokevirtual qeaa361f143ee4a0894bd168fd9b30c66/qf4ccf8f5435d4a78bdca4d6a018b578e/aabaaa.abbaaaa (Ljava/lang/Object;)J
      // 0b: lstore 3
      // 0c: istore 2
      // 0d: lload 3
      // 0e: lconst_0
      // 0f: lcmp
      // 10: iload 2
      // 11: ifne 25
      // 14: ifgt 1e
      // 17: goto 1b
      // 1a: athrow
      // 1b: lconst_0
      // 1c: lreturn
      // 1d: athrow
      // 1e: aload 0
      // 1f: getfield qeaa361f143ee4a0894bd168fd9b30c66/qf4ccf8f5435d4a78bdca4d6a018b578e/aabaaa.bbab Ljava/util/concurrent/ConcurrentLinkedQueue;
      // 22: invokevirtual java/util/concurrent/ConcurrentLinkedQueue.size ()I
      // 25: bipush 4
      // 26: if_icmple 2c
      // 29: lconst_0
      // 2a: lreturn
      // 2b: athrow
      // 2c: getstatic java/util/concurrent/TimeUnit.NANOSECONDS Ljava/util/concurrent/TimeUnit;
      // 2f: invokestatic java/lang/System.nanoTime ()J
      // 32: aload 1
      // 33: getfield qeaa361f143ee4a0894bd168fd9b30c66/qf4ccf8f5435d4a78bdca4d6a018b578e/aababbab.a J
      // 36: lsub
      // 37: invokevirtual java/util/concurrent/TimeUnit.toMillis (J)J
      // 3a: lstore 5
      // 3c: lload 5
      // 3e: iload 2
      // 3f: ifne 78
      // 42: ldc_w -522994201
      // 45: ldc_w 712412883
      // 48: ldc_w 1130655225
      // 4b: ixor
      // 4c: invokestatic qeaa361f143ee4a0894bd168fd9b30c66/qf4ccf8f5435d4a78bdca4d6a018b578e/aabaaa.baaaaab (II)I
      // 4f: ldc2_w 2844678610597244537
      // 52: invokestatic qeaa361f143ee4a0894bd168fd9b30c66/qf4ccf8f5435d4a78bdca4d6a018b578e/aabaaa.aaa (IJ)J
      // 55: lcmp
      // 56: iflt 61
      // 59: goto 5d
      // 5c: athrow
      // 5d: lload 5
      // 5f: lreturn
      // 60: athrow
      // 61: lload 3
      // 62: ldc_w -522994202
      // 65: ldc_w 712412883
      // 68: ldc_w 1455506421
      // 6b: ixor
      // 6c: invokestatic qeaa361f143ee4a0894bd168fd9b30c66/qf4ccf8f5435d4a78bdca4d6a018b578e/aabaaa.baaaaab (II)I
      // 6f: ldc2_w 5315913783800157619
      // 72: invokestatic qeaa361f143ee4a0894bd168fd9b30c66/qf4ccf8f5435d4a78bdca4d6a018b578e/aabaaa.aaa (IJ)J
      // 75: invokestatic java/lang/Math.min (JJ)J
      // 78: lreturn
   }

   private void bba(ConcurrentLinkedQueue var1, Throwable var2) {
      int var3 = baaabbaa.bba;

      ababbb var4;
      while ((var4 = (ababbb)var1.poll()) != null) {
         var4.ab.tryFailure(var2);
         if (var3 != 0) {
            break;
         }
      }
   }

   public static void bbb() {
      bbabb = true;
      aabaab = true;
   }

   private static boolean aaaa(Object param0) {
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
      // 05: instanceof net/minecraft/class_2824
      // 08: iload 1
      // 09: ifne 3e
      // 0c: ifne 39
      // 0f: goto 13
      // 12: athrow
      // 13: aload 0
      // 14: iload 1
      // 15: ifne 2b
      // 18: goto 1c
      // 1b: athrow
      // 1c: instanceof net/minecraft/class_2846
      // 1f: ifeq 41
      // 22: goto 26
      // 25: athrow
      // 26: aload 0
      // 27: goto 2b
      // 2a: athrow
      // 2b: checkcast net/minecraft/class_2846
      // 2e: astore 2
      // 2f: aload 2
      // 30: invokevirtual net/minecraft/class_2846.method_12363 ()Lnet/minecraft/class_2846$class_2847;
      // 33: getstatic net/minecraft/class_2846$class_2847.field_63165 Lnet/minecraft/class_2846$class_2847;
      // 36: if_acmpne 41
      // 39: bipush 1
      // 3a: goto 3e
      // 3d: athrow
      // 3e: goto 42
      // 41: bipush 0
      // 42: ireturn
   }

   private static boolean aaab(class_2596 param0) {
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
      // 0b: getstatic qeaa361f143ee4a0894bd168fd9b30c66/qf4ccf8f5435d4a78bdca4d6a018b578e/aabaaa.a Lqeaa361f143ee4a0894bd168fd9b30c66/qf4ccf8f5435d4a78bdca4d6a018b578e/baabbba;
      // 0e: astore 2
      // 0f: aload 2
      // 10: iload 1
      // 11: ifne 1c
      // 14: ifnull 2a
      // 17: goto 1b
      // 1a: athrow
      // 1b: aload 2
      // 1c: iload 1
      // 1d: ifne 2e
      // 20: invokevirtual qeaa361f143ee4a0894bd168fd9b30c66/qf4ccf8f5435d4a78bdca4d6a018b578e/baabbba.a ()Ljava/util/function/Predicate;
      // 23: ifnonnull 2d
      // 26: goto 2a
      // 29: athrow
      // 2a: bipush 0
      // 2b: ireturn
      // 2c: athrow
      // 2d: aload 2
      // 2e: invokevirtual qeaa361f143ee4a0894bd168fd9b30c66/qf4ccf8f5435d4a78bdca4d6a018b578e/baabbba.a ()Ljava/util/function/Predicate;
      // 31: aload 0
      // 32: invokeinterface java/util/function/Predicate.test (Ljava/lang/Object;)Z 2
      // 37: ireturn
      // 38: astore 3
      // 39: aload 3
      // 3a: pop
      // 3b: bipush 0
      // 3c: ireturn
   }

   private void aaba(ChannelHandlerContext param1, long param2) {
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
      // 08: ifne 1d
      // 0b: getfield qeaa361f143ee4a0894bd168fd9b30c66/qf4ccf8f5435d4a78bdca4d6a018b578e/aabaaa.aaaba Ljava/util/concurrent/atomic/AtomicBoolean;
      // 0e: bipush 0
      // 0f: bipush 1
      // 10: invokevirtual java/util/concurrent/atomic/AtomicBoolean.compareAndSet (ZZ)Z
      // 13: ifne 1c
      // 16: goto 1a
      // 19: athrow
      // 1a: return
      // 1b: athrow
      // 1c: aload 0
      // 1d: aload 1
      // 1e: invokedynamic run (Lqeaa361f143ee4a0894bd168fd9b30c66/qf4ccf8f5435d4a78bdca4d6a018b578e/aabaaa;Lio/netty/channel/ChannelHandlerContext;)Ljava/lang/Runnable; bsm=java/lang/invoke/LambdaMetafactory.metafactory (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;Ljava/lang/invoke/MethodType;Ljava/lang/invoke/MethodHandle;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[ ()V, qeaa361f143ee4a0894bd168fd9b30c66/qf4ccf8f5435d4a78bdca4d6a018b578e/aabaaa.abbabab (Lio/netty/channel/ChannelHandlerContext;)V, ()V ]
      // 23: astore 5
      // 25: lload 2
      // 26: lconst_0
      // 27: lcmp
      // 28: iload 4
      // 2a: ifne 62
      // 2d: ifle 4e
      // 30: goto 34
      // 33: athrow
      // 34: aload 1
      // 35: invokeinterface io/netty/channel/ChannelHandlerContext.executor ()Lio/netty/util/concurrent/EventExecutor; 1
      // 3a: aload 5
      // 3c: lload 2
      // 3d: getstatic qeaa361f143ee4a0894bd168fd9b30c66/qf4ccf8f5435d4a78bdca4d6a018b578e/aabaaa.abaa J
      // 40: invokestatic java/lang/Math.max (JJ)J
      // 43: getstatic java/util/concurrent/TimeUnit.NANOSECONDS Ljava/util/concurrent/TimeUnit;
      // 46: invokeinterface io/netty/util/concurrent/EventExecutor.schedule (Ljava/lang/Runnable;JLjava/util/concurrent/TimeUnit;)Lio/netty/util/concurrent/ScheduledFuture; 5
      // 4b: pop
      // 4c: return
      // 4d: athrow
      // 4e: aload 1
      // 4f: iload 4
      // 51: ifne 7a
      // 54: invokeinterface io/netty/channel/ChannelHandlerContext.executor ()Lio/netty/util/concurrent/EventExecutor; 1
      // 59: invokeinterface io/netty/util/concurrent/EventExecutor.inEventLoop ()Z 1
      // 5e: goto 62
      // 61: athrow
      // 62: ifeq 75
      // 65: aload 5
      // 67: invokeinterface java/lang/Runnable.run ()V 1
      // 6c: iload 4
      // 6e: ifeq 86
      // 71: goto 75
      // 74: athrow
      // 75: aload 1
      // 76: goto 7a
      // 79: athrow
      // 7a: invokeinterface io/netty/channel/ChannelHandlerContext.executor ()Lio/netty/util/concurrent/EventExecutor; 1
      // 7f: aload 5
      // 81: invokeinterface io/netty/util/concurrent/EventExecutor.execute (Ljava/lang/Runnable;)V 2
      // 86: return
   }

   public static void aabb() {
      // $VF: Couldn't be decompiled
      // Please report this to the Vineflower issue tracker, at https://github.com/Vineflower/vineflower/issues with a copy of the class file (if you have the rights to distribute it!)
      // java.lang.NullPointerException: Cannot invoke "org.jetbrains.java.decompiler.code.cfg.ExceptionRangeCFG.isCircular()" because "range" is null
      //   at org.jetbrains.java.decompiler.modules.decompiler.decompose.DomHelper.graphToStatement(DomHelper.java:84)
      //   at org.jetbrains.java.decompiler.modules.decompiler.decompose.DomHelper.parseGraph(DomHelper.java:203)
      //   at org.jetbrains.java.decompiler.main.rels.MethodProcessor.codeToJava(MethodProcessor.java:166)
      //
      // Bytecode:
      // 00: getstatic qeaa361f143ee4a0894bd168fd9b30c66/qf4ccf8f5435d4a78bdca4d6a018b578e/baaabbaa.bba I
      // 03: istore 0
      // 04: getstatic qeaa361f143ee4a0894bd168fd9b30c66/qf4ccf8f5435d4a78bdca4d6a018b578e/aaabbabbb.a Lqeaa361f143ee4a0894bd168fd9b30c66/qf4ccf8f5435d4a78bdca4d6a018b578e/aaabbabbb;
      // 07: bipush 1
      // 08: invokestatic qeaa361f143ee4a0894bd168fd9b30c66/qf4ccf8f5435d4a78bdca4d6a018b578e/aabaaa.aba (Lqeaa361f143ee4a0894bd168fd9b30c66/qf4ccf8f5435d4a78bdca4d6a018b578e/aaabbabbb;Z)Z
      // 0b: pop
      // 0c: getstatic qeaa361f143ee4a0894bd168fd9b30c66/qf4ccf8f5435d4a78bdca4d6a018b578e/aaabbabbb.b Lqeaa361f143ee4a0894bd168fd9b30c66/qf4ccf8f5435d4a78bdca4d6a018b578e/aaabbabbb;
      // 0f: bipush 1
      // 10: invokestatic qeaa361f143ee4a0894bd168fd9b30c66/qf4ccf8f5435d4a78bdca4d6a018b578e/aabaaa.aba (Lqeaa361f143ee4a0894bd168fd9b30c66/qf4ccf8f5435d4a78bdca4d6a018b578e/aaabbabbb;Z)Z
      // 13: pop
      // 14: invokestatic qeaa361f143ee4a0894bd168fd9b30c66/qf4ccf8f5435d4a78bdca4d6a018b578e/aabaaa.abbbaab ()V
      // 17: invokestatic qeaa361f143ee4a0894bd168fd9b30c66/qf4ccf8f5435d4a78bdca4d6a018b578e/aabaaa.abaaaab ()V
      // 1a: invokestatic qeaa361f143ee4a0894bd168fd9b30c66/qf4ccf8f5435d4a78bdca4d6a018b578e/aabaaa.bbaaba ()V
      // 1d: invokestatic qeaa361f143ee4a0894bd168fd9b30c66/qf4ccf8f5435d4a78bdca4d6a018b578e/aabaaa.abbabb ()V
      // 20: invokestatic qeaa361f143ee4a0894bd168fd9b30c66/qf4ccf8f5435d4a78bdca4d6a018b578e/aabaaa.abbbb ()V
      // 23: goto 27
      // 26: astore 1
      // 27: new java/util/ArrayList
      // 2a: dup
      // 2b: getstatic qeaa361f143ee4a0894bd168fd9b30c66/qf4ccf8f5435d4a78bdca4d6a018b578e/aabaaa.abba Ljava/util/Set;
      // 2e: invokespecial java/util/ArrayList.<init> (Ljava/util/Collection;)V
      // 31: invokevirtual java/util/ArrayList.iterator ()Ljava/util/Iterator;
      // 34: astore 1
      // 35: aload 1
      // 36: invokeinterface java/util/Iterator.hasNext ()Z 1
      // 3b: ifeq e1
      // 3e: aload 1
      // 3f: invokeinterface java/util/Iterator.next ()Ljava/lang/Object; 1
      // 44: checkcast qeaa361f143ee4a0894bd168fd9b30c66/qf4ccf8f5435d4a78bdca4d6a018b578e/aabaaa
      // 47: astore 2
      // 48: aload 2
      // 49: getfield qeaa361f143ee4a0894bd168fd9b30c66/qf4ccf8f5435d4a78bdca4d6a018b578e/aabaaa.ba Lio/netty/channel/ChannelHandlerContext;
      // 4c: astore 3
      // 4d: iload 0
      // 4e: ifne ef
      // 51: aload 3
      // 52: iload 0
      // 53: ifne 62
      // 56: goto 5a
      // 59: athrow
      // 5a: ifnull d1
      // 5d: goto 61
      // 60: athrow
      // 61: aload 3
      // 62: iload 0
      // 63: ifne 77
      // 66: invokeinterface io/netty/channel/ChannelHandlerContext.channel ()Lio/netty/channel/Channel; 1
      // 6b: ifnull d1
      // 6e: goto 72
      // 71: athrow
      // 72: aload 3
      // 73: goto 77
      // 76: athrow
      // 77: invokeinterface io/netty/channel/ChannelHandlerContext.channel ()Lio/netty/channel/Channel; 1
      // 7c: invokeinterface io/netty/channel/Channel.isActive ()Z 1
      // 81: ifeq d1
      // 84: aload 2
      // 85: aload 3
      // 86: invokedynamic run (Lqeaa361f143ee4a0894bd168fd9b30c66/qf4ccf8f5435d4a78bdca4d6a018b578e/aabaaa;Lio/netty/channel/ChannelHandlerContext;)Ljava/lang/Runnable; bsm=java/lang/invoke/LambdaMetafactory.metafactory (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;Ljava/lang/invoke/MethodType;Ljava/lang/invoke/MethodHandle;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[ ()V, qeaa361f143ee4a0894bd168fd9b30c66/qf4ccf8f5435d4a78bdca4d6a018b578e/aabaaa.aabbbab (Lqeaa361f143ee4a0894bd168fd9b30c66/qf4ccf8f5435d4a78bdca4d6a018b578e/aabaaa;Lio/netty/channel/ChannelHandlerContext;)V, ()V ]
      // 8b: astore 4
      // 8d: aload 3
      // 8e: invokeinterface io/netty/channel/ChannelHandlerContext.channel ()Lio/netty/channel/Channel; 1
      // 93: iload 0
      // 94: ifne c1
      // 97: invokeinterface io/netty/channel/Channel.eventLoop ()Lio/netty/channel/EventLoop; 1
      // 9c: invokeinterface io/netty/channel/EventLoop.inEventLoop ()Z 1
      // a1: ifeq b7
      // a4: goto a8
      // a7: athrow
      // a8: aload 4
      // aa: invokeinterface java/lang/Runnable.run ()V 1
      // af: iload 0
      // b0: ifeq cd
      // b3: goto b7
      // b6: athrow
      // b7: aload 3
      // b8: invokeinterface io/netty/channel/ChannelHandlerContext.channel ()Lio/netty/channel/Channel; 1
      // bd: goto c1
      // c0: athrow
      // c1: invokeinterface io/netty/channel/Channel.eventLoop ()Lio/netty/channel/EventLoop; 1
      // c6: aload 4
      // c8: invokeinterface io/netty/channel/EventLoop.execute (Ljava/lang/Runnable;)V 2
      // cd: iload 0
      // ce: ifeq d9
      // d1: aload 2
      // d2: invokevirtual qeaa361f143ee4a0894bd168fd9b30c66/qf4ccf8f5435d4a78bdca4d6a018b578e/aabaaa.babbaa ()V
      // d5: goto d9
      // d8: athrow
      // d9: goto dd
      // dc: astore 3
      // dd: iload 0
      // de: ifeq 35
      // e1: getstatic qeaa361f143ee4a0894bd168fd9b30c66/qf4ccf8f5435d4a78bdca4d6a018b578e/aabaaa.abba Ljava/util/Set;
      // e4: invokeinterface java/util/Set.clear ()V 1
      // e9: invokestatic qeaa361f143ee4a0894bd168fd9b30c66/qf4ccf8f5435d4a78bdca4d6a018b578e/aabaaa.ababbba ()V
      // ec: invokestatic qeaa361f143ee4a0894bd168fd9b30c66/qf4ccf8f5435d4a78bdca4d6a018b578e/aabaaa.babab ()V
      // ef: return
   }

   private static Integer abaa(class_2596 param0) {
      // $VF: Couldn't be decompiled
      // Please report this to the Vineflower issue tracker, at https://github.com/Vineflower/vineflower/issues with a copy of the class file (if you have the rights to distribute it!)
      // java.lang.RuntimeException: parsing failure!
      //   at org.jetbrains.java.decompiler.modules.decompiler.decompose.DomHelper.parseGraph(DomHelper.java:211)
      //   at org.jetbrains.java.decompiler.main.rels.MethodProcessor.codeToJava(MethodProcessor.java:166)
      //
      // Bytecode:
      // 000: ldc_w 665470191
      // 003: istore 5
      // 005: getstatic qeaa361f143ee4a0894bd168fd9b30c66/qf4ccf8f5435d4a78bdca4d6a018b578e/baaabbaa.bba I
      // 008: istore 1
      // 009: aload 0
      // 00a: iload 1
      // 00b: ifne 045
      // 00e: instanceof net/minecraft/class_6374
      // 011: ifeq 044
      // 014: goto 018
      // 017: athrow
      // 018: aload 0
      // 019: checkcast net/minecraft/class_6374
      // 01c: astore 2
      // 01d: aload 2
      // 01e: invokevirtual net/minecraft/class_6374.method_36960 ()I
      // 021: istore 3
      // 022: iload 3
      // 023: iload 1
      // 024: ifne 02f
      // 027: ifge 03c
      // 02a: goto 02e
      // 02d: athrow
      // 02e: iload 3
      // 02f: iload 1
      // 030: ifne 040
      // 033: iload 3
      // 034: i2s
      // 035: if_icmpeq 03f
      // 038: goto 03c
      // 03b: athrow
      // 03c: aconst_null
      // 03d: areturn
      // 03e: athrow
      // 03f: iload 3
      // 040: invokestatic java/lang/Integer.valueOf (I)Ljava/lang/Integer;
      // 043: areturn
      // 044: aload 0
      // 045: invokeinterface net/minecraft/class_2596.getClass ()Ljava/lang/Class; 1
      // 04a: invokevirtual java/lang/Class.getName ()Ljava/lang/String;
      // 04d: astore 2
      // 04e: aload 2
      // 04f: ldc_w -522994207
      // 052: iload 5
      // 054: ldc_w 775979896
      // 057: ixor
      // 058: invokestatic qeaa361f143ee4a0894bd168fd9b30c66/qf4ccf8f5435d4a78bdca4d6a018b578e/aabaaa.baaaaab (II)I
      // 05b: ldc_w -522994208
      // 05e: iload 5
      // 060: ldc_w -46175488
      // 063: ixor
      // 064: invokestatic qeaa361f143ee4a0894bd168fd9b30c66/qf4ccf8f5435d4a78bdca4d6a018b578e/aabaaa.baaaaab (II)I
      // 067: invokestatic qeaa361f143ee4a0894bd168fd9b30c66/qf4ccf8f5435d4a78bdca4d6a018b578e/aabaaa.aabbaab (II)Ljava/lang/String;
      // 06a: invokestatic qeaa361f143ee4a0894bd168fd9b30c66/qf4ccf8f5435d4a78bdca4d6a018b578e/aabbaaaba.abba (Ljava/lang/String;)Ljava/lang/String;
      // 06d: invokevirtual java/lang/String.endsWith (Ljava/lang/String;)Z
      // 070: iload 1
      // 071: ifne 10f
      // 074: ifne 10e
      // 077: goto 07b
      // 07a: athrow
      // 07b: aload 2
      // 07c: ldc_w -522994205
      // 07f: iload 5
      // 081: ldc_w 1468826117
      // 084: ixor
      // 085: invokestatic qeaa361f143ee4a0894bd168fd9b30c66/qf4ccf8f5435d4a78bdca4d6a018b578e/aabaaa.baaaaab (II)I
      // 088: ldc_w -522994206
      // 08b: iload 5
      // 08d: ldc_w -1194498050
      // 090: ixor
      // 091: invokestatic qeaa361f143ee4a0894bd168fd9b30c66/qf4ccf8f5435d4a78bdca4d6a018b578e/aabaaa.baaaaab (II)I
      // 094: invokestatic qeaa361f143ee4a0894bd168fd9b30c66/qf4ccf8f5435d4a78bdca4d6a018b578e/aabaaa.aabbaab (II)Ljava/lang/String;
      // 097: invokestatic qeaa361f143ee4a0894bd168fd9b30c66/qf4ccf8f5435d4a78bdca4d6a018b578e/aabbaaaba.abba (Ljava/lang/String;)Ljava/lang/String;
      // 09a: iload 1
      // 09b: ifne 100
      // 09e: goto 0a2
      // 0a1: athrow
      // 0a2: invokevirtual java/lang/String.contains (Ljava/lang/CharSequence;)Z
      // 0a5: ifeq 0dd
      // 0a8: goto 0ac
      // 0ab: athrow
      // 0ac: aload 2
      // 0ad: ldc_w -522994195
      // 0b0: iload 5
      // 0b2: ldc_w -399249846
      // 0b5: ixor
      // 0b6: invokestatic qeaa361f143ee4a0894bd168fd9b30c66/qf4ccf8f5435d4a78bdca4d6a018b578e/aabaaa.baaaaab (II)I
      // 0b9: ldc_w -522994196
      // 0bc: iload 5
      // 0be: ldc_w 665114245
      // 0c1: ixor
      // 0c2: invokestatic qeaa361f143ee4a0894bd168fd9b30c66/qf4ccf8f5435d4a78bdca4d6a018b578e/aabaaa.baaaaab (II)I
      // 0c5: invokestatic qeaa361f143ee4a0894bd168fd9b30c66/qf4ccf8f5435d4a78bdca4d6a018b578e/aabaaa.aabbaab (II)Ljava/lang/String;
      // 0c8: invokestatic qeaa361f143ee4a0894bd168fd9b30c66/qf4ccf8f5435d4a78bdca4d6a018b578e/aabbaaaba.abba (Ljava/lang/String;)Ljava/lang/String;
      // 0cb: invokevirtual java/lang/String.endsWith (Ljava/lang/String;)Z
      // 0ce: iload 1
      // 0cf: ifne 10f
      // 0d2: goto 0d6
      // 0d5: athrow
      // 0d6: ifne 10e
      // 0d9: goto 0dd
      // 0dc: athrow
      // 0dd: aload 2
      // 0de: ldc_w -522994193
      // 0e1: iload 5
      // 0e3: ldc_w 340088500
      // 0e6: ixor
      // 0e7: invokestatic qeaa361f143ee4a0894bd168fd9b30c66/qf4ccf8f5435d4a78bdca4d6a018b578e/aabaaa.baaaaab (II)I
      // 0ea: ldc_w -522994194
      // 0ed: iload 5
      // 0ef: ldc_w 227491257
      // 0f2: ixor
      // 0f3: invokestatic qeaa361f143ee4a0894bd168fd9b30c66/qf4ccf8f5435d4a78bdca4d6a018b578e/aabaaa.baaaaab (II)I
      // 0f6: invokestatic qeaa361f143ee4a0894bd168fd9b30c66/qf4ccf8f5435d4a78bdca4d6a018b578e/aabaaa.aabbaab (II)Ljava/lang/String;
      // 0f9: invokestatic qeaa361f143ee4a0894bd168fd9b30c66/qf4ccf8f5435d4a78bdca4d6a018b578e/aabbaaaba.abba (Ljava/lang/String;)Ljava/lang/String;
      // 0fc: goto 100
      // 0ff: athrow
      // 100: invokevirtual java/lang/String.endsWith (Ljava/lang/String;)Z
      // 103: iload 1
      // 104: ifne 10f
      // 107: ifeq 112
      // 10a: goto 10e
      // 10d: athrow
      // 10e: bipush 1
      // 10f: goto 113
      // 112: bipush 0
      // 113: istore 3
      // 114: iload 3
      // 115: ifne 11b
      // 118: aconst_null
      // 119: areturn
      // 11a: athrow
      // 11b: aload 0
      // 11c: bipush 4
      // 11d: anewarray 591
      // 120: dup
      // 121: bipush 0
      // 122: ldc_w -522994199
      // 125: iload 5
      // 127: ldc_w -449373852
      // 12a: ixor
      // 12b: invokestatic qeaa361f143ee4a0894bd168fd9b30c66/qf4ccf8f5435d4a78bdca4d6a018b578e/aabaaa.baaaaab (II)I
      // 12e: ldc_w -522994200
      // 131: iload 5
      // 133: ldc_w 475149880
      // 136: ixor
      // 137: invokestatic qeaa361f143ee4a0894bd168fd9b30c66/qf4ccf8f5435d4a78bdca4d6a018b578e/aabaaa.baaaaab (II)I
      // 13a: invokestatic qeaa361f143ee4a0894bd168fd9b30c66/qf4ccf8f5435d4a78bdca4d6a018b578e/aabaaa.aabbaab (II)Ljava/lang/String;
      // 13d: invokestatic qeaa361f143ee4a0894bd168fd9b30c66/qf4ccf8f5435d4a78bdca4d6a018b578e/aabbaaaba.abba (Ljava/lang/String;)Ljava/lang/String;
      // 140: aastore
      // 141: dup
      // 142: bipush 1
      // 143: ldc_w -522994197
      // 146: iload 5
      // 148: ldc_w -103665497
      // 14b: ixor
      // 14c: invokestatic qeaa361f143ee4a0894bd168fd9b30c66/qf4ccf8f5435d4a78bdca4d6a018b578e/aabaaa.baaaaab (II)I
      // 14f: ldc_w -522994198
      // 152: iload 5
      // 154: ldc_w -1327383744
      // 157: ixor
      // 158: invokestatic qeaa361f143ee4a0894bd168fd9b30c66/qf4ccf8f5435d4a78bdca4d6a018b578e/aabaaa.baaaaab (II)I
      // 15b: invokestatic qeaa361f143ee4a0894bd168fd9b30c66/qf4ccf8f5435d4a78bdca4d6a018b578e/aabaaa.aabbaab (II)Ljava/lang/String;
      // 15e: invokestatic qeaa361f143ee4a0894bd168fd9b30c66/qf4ccf8f5435d4a78bdca4d6a018b578e/aabbaaaba.abba (Ljava/lang/String;)Ljava/lang/String;
      // 161: aastore
      // 162: dup
      // 163: bipush 2
      // 164: ldc_w -522994187
      // 167: iload 5
      // 169: ldc_w 38180850
      // 16c: ixor
      // 16d: invokestatic qeaa361f143ee4a0894bd168fd9b30c66/qf4ccf8f5435d4a78bdca4d6a018b578e/aabaaa.baaaaab (II)I
      // 170: ldc_w -522994188
      // 173: iload 5
      // 175: ldc_w 720301016
      // 178: ixor
      // 179: invokestatic qeaa361f143ee4a0894bd168fd9b30c66/qf4ccf8f5435d4a78bdca4d6a018b578e/aabaaa.baaaaab (II)I
      // 17c: invokestatic qeaa361f143ee4a0894bd168fd9b30c66/qf4ccf8f5435d4a78bdca4d6a018b578e/aabaaa.aabbaab (II)Ljava/lang/String;
      // 17f: invokestatic qeaa361f143ee4a0894bd168fd9b30c66/qf4ccf8f5435d4a78bdca4d6a018b578e/aabbaaaba.abba (Ljava/lang/String;)Ljava/lang/String;
      // 182: aastore
      // 183: dup
      // 184: bipush 3
      // 185: ldc_w -522994185
      // 188: iload 5
      // 18a: ldc_w 409207033
      // 18d: ixor
      // 18e: invokestatic qeaa361f143ee4a0894bd168fd9b30c66/qf4ccf8f5435d4a78bdca4d6a018b578e/aabaaa.baaaaab (II)I
      // 191: ldc_w -522994186
      // 194: iload 5
      // 196: ldc_w -365749456
      // 199: ixor
      // 19a: invokestatic qeaa361f143ee4a0894bd168fd9b30c66/qf4ccf8f5435d4a78bdca4d6a018b578e/aabaaa.baaaaab (II)I
      // 19d: invokestatic qeaa361f143ee4a0894bd168fd9b30c66/qf4ccf8f5435d4a78bdca4d6a018b578e/aabaaa.aabbaab (II)Ljava/lang/String;
      // 1a0: invokestatic qeaa361f143ee4a0894bd168fd9b30c66/qf4ccf8f5435d4a78bdca4d6a018b578e/aabbaaaba.abba (Ljava/lang/String;)Ljava/lang/String;
      // 1a3: aastore
      // 1a4: invokestatic qeaa361f143ee4a0894bd168fd9b30c66/qf4ccf8f5435d4a78bdca4d6a018b578e/aabaaa.bababa (Lnet/minecraft/class_2596;[Ljava/lang/String;)Ljava/lang/Integer;
      // 1a7: astore 4
      // 1a9: aload 4
      // 1ab: iload 1
      // 1ac: ifne 1b8
      // 1af: ifnull 1e0
      // 1b2: goto 1b6
      // 1b5: athrow
      // 1b6: aload 4
      // 1b8: iload 1
      // 1b9: ifne 1cc
      // 1bc: invokevirtual java/lang/Integer.intValue ()I
      // 1bf: ifge 1e0
      // 1c2: goto 1c6
      // 1c5: athrow
      // 1c6: aload 4
      // 1c8: goto 1cc
      // 1cb: athrow
      // 1cc: iload 1
      // 1cd: ifne 1e5
      // 1d0: invokevirtual java/lang/Integer.intValue ()I
      // 1d3: aload 4
      // 1d5: invokevirtual java/lang/Integer.intValue ()I
      // 1d8: i2s
      // 1d9: if_icmpeq 1e3
      // 1dc: goto 1e0
      // 1df: athrow
      // 1e0: aconst_null
      // 1e1: areturn
      // 1e2: athrow
      // 1e3: aload 4
      // 1e5: areturn
   }

   public static int abab() {
      return aababa;
   }

   public static abbbbbbb abba() {
      return aababb;
   }

   private void abbb(ChannelHandlerContext param1) {
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
      // 005: getfield qeaa361f143ee4a0894bd168fd9b30c66/qf4ccf8f5435d4a78bdca4d6a018b578e/aabaaa.bbaba Ljava/util/concurrent/atomic/AtomicBoolean;
      // 008: bipush 0
      // 009: invokevirtual java/util/concurrent/atomic/AtomicBoolean.set (Z)V
      // 00c: aload 0
      // 00d: getfield qeaa361f143ee4a0894bd168fd9b30c66/qf4ccf8f5435d4a78bdca4d6a018b578e/aabaaa.abbb Ljava/util/concurrent/atomic/AtomicBoolean;
      // 010: bipush 0
      // 011: invokevirtual java/util/concurrent/atomic/AtomicBoolean.set (Z)V
      // 014: aload 0
      // 015: getfield qeaa361f143ee4a0894bd168fd9b30c66/qf4ccf8f5435d4a78bdca4d6a018b578e/aabaaa.aaaabb Ljava/util/concurrent/atomic/AtomicBoolean;
      // 018: bipush 0
      // 019: invokevirtual java/util/concurrent/atomic/AtomicBoolean.set (Z)V
      // 01c: new java/util/ArrayList
      // 01f: dup
      // 020: invokespecial java/util/ArrayList.<init> ()V
      // 023: astore 3
      // 024: aload 0
      // 025: getfield qeaa361f143ee4a0894bd168fd9b30c66/qf4ccf8f5435d4a78bdca4d6a018b578e/aabaaa.bb Ljava/util/concurrent/ConcurrentLinkedQueue;
      // 028: invokevirtual java/util/concurrent/ConcurrentLinkedQueue.poll ()Ljava/lang/Object;
      // 02b: checkcast qeaa361f143ee4a0894bd168fd9b30c66/qf4ccf8f5435d4a78bdca4d6a018b578e/ababbb
      // 02e: dup
      // 02f: astore 4
      // 031: ifnull 05e
      // 034: aload 3
      // 035: new qeaa361f143ee4a0894bd168fd9b30c66/qf4ccf8f5435d4a78bdca4d6a018b578e/abbbaba
      // 038: dup
      // 039: aload 4
      // 03b: getfield qeaa361f143ee4a0894bd168fd9b30c66/qf4ccf8f5435d4a78bdca4d6a018b578e/ababbb.bb Ljava/lang/Object;
      // 03e: aload 4
      // 040: getfield qeaa361f143ee4a0894bd168fd9b30c66/qf4ccf8f5435d4a78bdca4d6a018b578e/ababbb.ab Lio/netty/channel/ChannelPromise;
      // 043: aload 4
      // 045: getfield qeaa361f143ee4a0894bd168fd9b30c66/qf4ccf8f5435d4a78bdca4d6a018b578e/ababbb.ba J
      // 048: aconst_null
      // 049: invokespecial qeaa361f143ee4a0894bd168fd9b30c66/qf4ccf8f5435d4a78bdca4d6a018b578e/abbbaba.<init> (Ljava/lang/Object;Lio/netty/channel/ChannelPromise;JLqeaa361f143ee4a0894bd168fd9b30c66/qf4ccf8f5435d4a78bdca4d6a018b578e/aabaaab;)V
      // 04c: invokeinterface java/util/List.add (Ljava/lang/Object;)Z 2
      // 051: iload 2
      // 052: ifne 093
      // 055: pop
      // 056: iload 2
      // 057: ifeq 024
      // 05a: goto 05e
      // 05d: athrow
      // 05e: aload 0
      // 05f: getfield qeaa361f143ee4a0894bd168fd9b30c66/qf4ccf8f5435d4a78bdca4d6a018b578e/aabaaa.aba Ljava/util/concurrent/ConcurrentLinkedQueue;
      // 062: invokevirtual java/util/concurrent/ConcurrentLinkedQueue.poll ()Ljava/lang/Object;
      // 065: checkcast qeaa361f143ee4a0894bd168fd9b30c66/qf4ccf8f5435d4a78bdca4d6a018b578e/ababbb
      // 068: dup
      // 069: astore 4
      // 06b: ifnull 098
      // 06e: aload 3
      // 06f: iload 2
      // 070: ifne 09f
      // 073: new qeaa361f143ee4a0894bd168fd9b30c66/qf4ccf8f5435d4a78bdca4d6a018b578e/abbbaba
      // 076: dup
      // 077: aload 4
      // 079: getfield qeaa361f143ee4a0894bd168fd9b30c66/qf4ccf8f5435d4a78bdca4d6a018b578e/ababbb.bb Ljava/lang/Object;
      // 07c: aload 4
      // 07e: getfield qeaa361f143ee4a0894bd168fd9b30c66/qf4ccf8f5435d4a78bdca4d6a018b578e/ababbb.ab Lio/netty/channel/ChannelPromise;
      // 081: aload 4
      // 083: getfield qeaa361f143ee4a0894bd168fd9b30c66/qf4ccf8f5435d4a78bdca4d6a018b578e/ababbb.ba J
      // 086: aconst_null
      // 087: invokespecial qeaa361f143ee4a0894bd168fd9b30c66/qf4ccf8f5435d4a78bdca4d6a018b578e/abbbaba.<init> (Ljava/lang/Object;Lio/netty/channel/ChannelPromise;JLqeaa361f143ee4a0894bd168fd9b30c66/qf4ccf8f5435d4a78bdca4d6a018b578e/aabaaab;)V
      // 08a: invokeinterface java/util/List.add (Ljava/lang/Object;)Z 2
      // 08f: goto 093
      // 092: athrow
      // 093: pop
      // 094: iload 2
      // 095: ifeq 05e
      // 098: aload 0
      // 099: getfield qeaa361f143ee4a0894bd168fd9b30c66/qf4ccf8f5435d4a78bdca4d6a018b578e/aabaaa.aabbaa Ljava/util/concurrent/ConcurrentLinkedQueue;
      // 09c: invokevirtual java/util/concurrent/ConcurrentLinkedQueue.poll ()Ljava/lang/Object;
      // 09f: checkcast qeaa361f143ee4a0894bd168fd9b30c66/qf4ccf8f5435d4a78bdca4d6a018b578e/aabaaab
      // 0a2: dup
      // 0a3: astore 5
      // 0a5: ifnull 0e3
      // 0a8: aload 0
      // 0a9: getfield qeaa361f143ee4a0894bd168fd9b30c66/qf4ccf8f5435d4a78bdca4d6a018b578e/aabaaa.bbbaa Ljava/util/Set;
      // 0ac: aload 5
      // 0ae: invokeinterface java/util/Set.remove (Ljava/lang/Object;)Z 2
      // 0b3: pop
      // 0b4: aload 3
      // 0b5: iload 2
      // 0b6: ifne 0ea
      // 0b9: goto 0bd
      // 0bc: athrow
      // 0bd: new qeaa361f143ee4a0894bd168fd9b30c66/qf4ccf8f5435d4a78bdca4d6a018b578e/abbbaba
      // 0c0: dup
      // 0c1: aload 5
      // 0c3: getfield qeaa361f143ee4a0894bd168fd9b30c66/qf4ccf8f5435d4a78bdca4d6a018b578e/aabaaab.ba Ljava/lang/Object;
      // 0c6: aload 5
      // 0c8: getfield qeaa361f143ee4a0894bd168fd9b30c66/qf4ccf8f5435d4a78bdca4d6a018b578e/aabaaab.ab Lio/netty/channel/ChannelPromise;
      // 0cb: aload 5
      // 0cd: getfield qeaa361f143ee4a0894bd168fd9b30c66/qf4ccf8f5435d4a78bdca4d6a018b578e/aabaaab.b J
      // 0d0: aload 5
      // 0d2: invokespecial qeaa361f143ee4a0894bd168fd9b30c66/qf4ccf8f5435d4a78bdca4d6a018b578e/abbbaba.<init> (Ljava/lang/Object;Lio/netty/channel/ChannelPromise;JLqeaa361f143ee4a0894bd168fd9b30c66/qf4ccf8f5435d4a78bdca4d6a018b578e/aabaaab;)V
      // 0d5: invokeinterface java/util/List.add (Ljava/lang/Object;)Z 2
      // 0da: pop
      // 0db: iload 2
      // 0dc: ifeq 098
      // 0df: goto 0e3
      // 0e2: athrow
      // 0e3: aload 0
      // 0e4: getfield qeaa361f143ee4a0894bd168fd9b30c66/qf4ccf8f5435d4a78bdca4d6a018b578e/aabaaa.bbab Ljava/util/concurrent/ConcurrentLinkedQueue;
      // 0e7: invokevirtual java/util/concurrent/ConcurrentLinkedQueue.poll ()Ljava/lang/Object;
      // 0ea: checkcast qeaa361f143ee4a0894bd168fd9b30c66/qf4ccf8f5435d4a78bdca4d6a018b578e/aababbab
      // 0ed: dup
      // 0ee: astore 6
      // 0f0: ifnull 121
      // 0f3: iload 2
      // 0f4: ifne 12f
      // 0f7: goto 0fb
      // 0fa: athrow
      // 0fb: aload 3
      // 0fc: new qeaa361f143ee4a0894bd168fd9b30c66/qf4ccf8f5435d4a78bdca4d6a018b578e/abbbaba
      // 0ff: dup
      // 100: aload 6
      // 102: getfield qeaa361f143ee4a0894bd168fd9b30c66/qf4ccf8f5435d4a78bdca4d6a018b578e/aababbab.aa Ljava/lang/Object;
      // 105: aload 6
      // 107: getfield qeaa361f143ee4a0894bd168fd9b30c66/qf4ccf8f5435d4a78bdca4d6a018b578e/aababbab.ab Lio/netty/channel/ChannelPromise;
      // 10a: aload 6
      // 10c: getfield qeaa361f143ee4a0894bd168fd9b30c66/qf4ccf8f5435d4a78bdca4d6a018b578e/aababbab.b J
      // 10f: aconst_null
      // 110: invokespecial qeaa361f143ee4a0894bd168fd9b30c66/qf4ccf8f5435d4a78bdca4d6a018b578e/abbbaba.<init> (Ljava/lang/Object;Lio/netty/channel/ChannelPromise;JLqeaa361f143ee4a0894bd168fd9b30c66/qf4ccf8f5435d4a78bdca4d6a018b578e/aabaaab;)V
      // 113: invokeinterface java/util/List.add (Ljava/lang/Object;)Z 2
      // 118: pop
      // 119: iload 2
      // 11a: ifeq 0e3
      // 11d: goto 121
      // 120: athrow
      // 121: aload 3
      // 122: invokedynamic applyAsLong ()Ljava/util/function/ToLongFunction; bsm=java/lang/invoke/LambdaMetafactory.metafactory (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;Ljava/lang/invoke/MethodType;Ljava/lang/invoke/MethodHandle;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[ (Ljava/lang/Object;)J, qeaa361f143ee4a0894bd168fd9b30c66/qf4ccf8f5435d4a78bdca4d6a018b578e/abbbaba.ab ()J, (Lqeaa361f143ee4a0894bd168fd9b30c66/qf4ccf8f5435d4a78bdca4d6a018b578e/abbbaba;)J ]
      // 127: invokestatic java/util/Comparator.comparingLong (Ljava/util/function/ToLongFunction;)Ljava/util/Comparator;
      // 12a: invokeinterface java/util/List.sort (Ljava/util/Comparator;)V 2
      // 12f: aload 3
      // 130: invokeinterface java/util/List.iterator ()Ljava/util/Iterator; 1
      // 135: astore 7
      // 137: aload 7
      // 139: invokeinterface java/util/Iterator.hasNext ()Z 1
      // 13e: ifeq 186
      // 141: aload 7
      // 143: invokeinterface java/util/Iterator.next ()Ljava/lang/Object; 1
      // 148: checkcast qeaa361f143ee4a0894bd168fd9b30c66/qf4ccf8f5435d4a78bdca4d6a018b578e/abbbaba
      // 14b: astore 8
      // 14d: aload 0
      // 14e: iload 2
      // 14f: ifne 17a
      // 152: aload 1
      // 153: aload 8
      // 155: getfield qeaa361f143ee4a0894bd168fd9b30c66/qf4ccf8f5435d4a78bdca4d6a018b578e/abbbaba.ab Ljava/lang/Object;
      // 158: aload 8
      // 15a: getfield qeaa361f143ee4a0894bd168fd9b30c66/qf4ccf8f5435d4a78bdca4d6a018b578e/abbbaba.a Lio/netty/channel/ChannelPromise;
      // 15d: invokevirtual qeaa361f143ee4a0894bd168fd9b30c66/qf4ccf8f5435d4a78bdca4d6a018b578e/aabaaa.abbaabb (Lio/netty/channel/ChannelHandlerContext;Ljava/lang/Object;Lio/netty/channel/ChannelPromise;)Z
      // 160: pop
      // 161: iload 2
      // 162: ifne 1af
      // 165: goto 169
      // 168: athrow
      // 169: aload 8
      // 16b: getfield qeaa361f143ee4a0894bd168fd9b30c66/qf4ccf8f5435d4a78bdca4d6a018b578e/abbbaba.b Lqeaa361f143ee4a0894bd168fd9b30c66/qf4ccf8f5435d4a78bdca4d6a018b578e/aabaaab;
      // 16e: ifnull 182
      // 171: goto 175
      // 174: athrow
      // 175: aload 0
      // 176: goto 17a
      // 179: athrow
      // 17a: aload 8
      // 17c: getfield qeaa361f143ee4a0894bd168fd9b30c66/qf4ccf8f5435d4a78bdca4d6a018b578e/abbbaba.b Lqeaa361f143ee4a0894bd168fd9b30c66/qf4ccf8f5435d4a78bdca4d6a018b578e/aabaaab;
      // 17f: invokevirtual qeaa361f143ee4a0894bd168fd9b30c66/qf4ccf8f5435d4a78bdca4d6a018b578e/aabaaa.abbbbb (Lqeaa361f143ee4a0894bd168fd9b30c66/qf4ccf8f5435d4a78bdca4d6a018b578e/aabaaab;)V
      // 182: iload 2
      // 183: ifeq 137
      // 186: aload 1
      // 187: iload 2
      // 188: ifne 1a6
      // 18b: invokeinterface io/netty/channel/ChannelHandlerContext.channel ()Lio/netty/channel/Channel; 1
      // 190: invokeinterface io/netty/channel/Channel.isOpen ()Z 1
      // 195: ifeq 1a7
      // 198: goto 19c
      // 19b: athrow
      // 19c: aload 1
      // 19d: invokeinterface io/netty/channel/ChannelHandlerContext.flush ()Lio/netty/channel/ChannelHandlerContext; 1
      // 1a2: goto 1a6
      // 1a5: athrow
      // 1a6: pop
      // 1a7: aload 0
      // 1a8: bipush 0
      // 1a9: putfield qeaa361f143ee4a0894bd168fd9b30c66/qf4ccf8f5435d4a78bdca4d6a018b578e/aabaaa.aaabab Z
      // 1ac: invokestatic qeaa361f143ee4a0894bd168fd9b30c66/qf4ccf8f5435d4a78bdca4d6a018b578e/aabaaa.bbbaba ()V
      // 1af: goto 1b3
      // 1b2: astore 3
      // 1b3: return
   }

   public static void baaa(abbbbbbb param0) {
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
      // 06: ifne 13
      // 09: ifnonnull 16
      // 0c: goto 10
      // 0f: athrow
      // 10: getstatic qeaa361f143ee4a0894bd168fd9b30c66/qf4ccf8f5435d4a78bdca4d6a018b578e/abbbbbbb.a Lqeaa361f143ee4a0894bd168fd9b30c66/qf4ccf8f5435d4a78bdca4d6a018b578e/abbbbbbb;
      // 13: goto 17
      // 16: aload 0
      // 17: astore 2
      // 18: iload 1
      // 19: ifne 30
      // 1c: getstatic qeaa361f143ee4a0894bd168fd9b30c66/qf4ccf8f5435d4a78bdca4d6a018b578e/aabaaa.aababb Lqeaa361f143ee4a0894bd168fd9b30c66/qf4ccf8f5435d4a78bdca4d6a018b578e/abbbbbbb;
      // 1f: aload 2
      // 20: if_acmpne 29
      // 23: goto 27
      // 26: athrow
      // 27: return
      // 28: athrow
      // 29: aload 2
      // 2a: putstatic qeaa361f143ee4a0894bd168fd9b30c66/qf4ccf8f5435d4a78bdca4d6a018b578e/aabaaa.aababb Lqeaa361f143ee4a0894bd168fd9b30c66/qf4ccf8f5435d4a78bdca4d6a018b578e/abbbbbbb;
      // 2d: invokestatic qeaa361f143ee4a0894bd168fd9b30c66/qf4ccf8f5435d4a78bdca4d6a018b578e/aabaaa.aababab ()V
      // 30: return
   }

   private static boolean baab(class_2596 param0) {
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
      // 005: instanceof net/minecraft/class_2828
      // 008: iload 1
      // 009: ifne 10f
      // 00c: ifne 10a
      // 00f: goto 013
      // 012: athrow
      // 013: aload 0
      // 014: instanceof net/minecraft/class_2833
      // 017: iload 1
      // 018: ifne 10f
      // 01b: goto 01f
      // 01e: athrow
      // 01f: ifne 10a
      // 022: goto 026
      // 025: athrow
      // 026: aload 0
      // 027: instanceof net/minecraft/class_9836
      // 02a: iload 1
      // 02b: ifne 10f
      // 02e: goto 032
      // 031: athrow
      // 032: ifne 10a
      // 035: goto 039
      // 038: athrow
      // 039: aload 0
      // 03a: instanceof net/minecraft/class_2824
      // 03d: iload 1
      // 03e: ifne 10f
      // 041: goto 045
      // 044: athrow
      // 045: ifne 10a
      // 048: goto 04c
      // 04b: athrow
      // 04c: aload 0
      // 04d: instanceof net/minecraft/class_2846
      // 050: iload 1
      // 051: ifne 10f
      // 054: goto 058
      // 057: athrow
      // 058: ifne 10a
      // 05b: goto 05f
      // 05e: athrow
      // 05f: aload 0
      // 060: instanceof net/minecraft/class_2885
      // 063: iload 1
      // 064: ifne 10f
      // 067: goto 06b
      // 06a: athrow
      // 06b: ifne 10a
      // 06e: goto 072
      // 071: athrow
      // 072: aload 0
      // 073: instanceof net/minecraft/class_2886
      // 076: iload 1
      // 077: ifne 10f
      // 07a: goto 07e
      // 07d: athrow
      // 07e: ifne 10a
      // 081: goto 085
      // 084: athrow
      // 085: aload 0
      // 086: instanceof net/minecraft/class_2879
      // 089: iload 1
      // 08a: ifne 10f
      // 08d: goto 091
      // 090: athrow
      // 091: ifne 10a
      // 094: goto 098
      // 097: athrow
      // 098: aload 0
      // 099: instanceof net/minecraft/class_2868
      // 09c: iload 1
      // 09d: ifne 10f
      // 0a0: goto 0a4
      // 0a3: athrow
      // 0a4: ifne 10a
      // 0a7: goto 0ab
      // 0aa: athrow
      // 0ab: aload 0
      // 0ac: instanceof net/minecraft/class_2848
      // 0af: iload 1
      // 0b0: ifne 10f
      // 0b3: goto 0b7
      // 0b6: athrow
      // 0b7: ifne 10a
      // 0ba: goto 0be
      // 0bd: athrow
      // 0be: aload 0
      // 0bf: instanceof net/minecraft/class_2851
      // 0c2: iload 1
      // 0c3: ifne 10f
      // 0c6: goto 0ca
      // 0c9: athrow
      // 0ca: ifne 10a
      // 0cd: goto 0d1
      // 0d0: athrow
      // 0d1: aload 0
      // 0d2: instanceof net/minecraft/class_2813
      // 0d5: iload 1
      // 0d6: ifne 10f
      // 0d9: goto 0dd
      // 0dc: athrow
      // 0dd: ifne 10a
      // 0e0: goto 0e4
      // 0e3: athrow
      // 0e4: aload 0
      // 0e5: instanceof net/minecraft/class_2815
      // 0e8: iload 1
      // 0e9: ifne 10f
      // 0ec: goto 0f0
      // 0ef: athrow
      // 0f0: ifne 10a
      // 0f3: goto 0f7
      // 0f6: athrow
      // 0f7: aload 0
      // 0f8: iload 1
      // 0f9: ifne 111
      // 0fc: goto 100
      // 0ff: athrow
      // 100: instanceof net/minecraft/class_2799
      // 103: ifeq 110
      // 106: goto 10a
      // 109: athrow
      // 10a: bipush 1
      // 10b: goto 10f
      // 10e: athrow
      // 10f: ireturn
      // 110: aload 0
      // 111: invokestatic qeaa361f143ee4a0894bd168fd9b30c66/qf4ccf8f5435d4a78bdca4d6a018b578e/aabaaa.a (Lnet/minecraft/class_2596;)Z
      // 114: iload 1
      // 115: ifne 15b
      // 118: ifne 15a
      // 11b: goto 11f
      // 11e: athrow
      // 11f: aload 0
      // 120: invokeinterface net/minecraft/class_2596.getClass ()Ljava/lang/Class; 1
      // 125: invokevirtual java/lang/Class.getName ()Ljava/lang/String;
      // 128: ldc_w -522994191
      // 12b: ldc_w -289051858
      // 12e: ldc_w -269857693
      // 131: ixor
      // 132: invokestatic qeaa361f143ee4a0894bd168fd9b30c66/qf4ccf8f5435d4a78bdca4d6a018b578e/aabaaa.baaaaab (II)I
      // 135: ldc_w -522994192
      // 138: ldc_w -289051858
      // 13b: ldc_w -542401930
      // 13e: ixor
      // 13f: invokestatic qeaa361f143ee4a0894bd168fd9b30c66/qf4ccf8f5435d4a78bdca4d6a018b578e/aabaaa.baaaaab (II)I
      // 142: invokestatic qeaa361f143ee4a0894bd168fd9b30c66/qf4ccf8f5435d4a78bdca4d6a018b578e/aabaaa.aabbaab (II)Ljava/lang/String;
      // 145: invokestatic qeaa361f143ee4a0894bd168fd9b30c66/qf4ccf8f5435d4a78bdca4d6a018b578e/aabbaaaba.abba (Ljava/lang/String;)Ljava/lang/String;
      // 148: invokevirtual java/lang/String.endsWith (Ljava/lang/String;)Z
      // 14b: iload 1
      // 14c: ifne 15b
      // 14f: goto 153
      // 152: athrow
      // 153: ifeq 15e
      // 156: goto 15a
      // 159: athrow
      // 15a: bipush 1
      // 15b: goto 15f
      // 15e: bipush 0
      // 15f: ireturn
   }

   private void baba(ChannelHandlerContext param1, Object param2, ChannelPromise param3) throws Exception {
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
      // 08: ifne 5a
      // 0b: getfield qeaa361f143ee4a0894bd168fd9b30c66/qf4ccf8f5435d4a78bdca4d6a018b578e/aabaaa.aaab Z
      // 0e: ifeq 3a
      // 11: goto 15
      // 14: athrow
      // 15: aload 0
      // 16: iload 4
      // 18: ifne 5a
      // 1b: goto 1f
      // 1e: athrow
      // 1f: getfield qeaa361f143ee4a0894bd168fd9b30c66/qf4ccf8f5435d4a78bdca4d6a018b578e/aabaaa.bbb Ljava/util/concurrent/ConcurrentLinkedQueue;
      // 22: invokevirtual java/util/concurrent/ConcurrentLinkedQueue.isEmpty ()Z
      // 25: ifne 3a
      // 28: goto 2c
      // 2b: athrow
      // 2c: aload 0
      // 2d: bipush 0
      // 2e: putfield qeaa361f143ee4a0894bd168fd9b30c66/qf4ccf8f5435d4a78bdca4d6a018b578e/aabaaa.aaaaaa Z
      // 31: aload 0
      // 32: aload 1
      // 33: invokevirtual qeaa361f143ee4a0894bd168fd9b30c66/qf4ccf8f5435d4a78bdca4d6a018b578e/aabaaa.bbbbbb (Lio/netty/channel/ChannelHandlerContext;)V
      // 36: goto 3a
      // 39: athrow
      // 3a: aload 0
      // 3b: aload 1
      // 3c: aload 2
      // 3d: aload 3
      // 3e: invokevirtual qeaa361f143ee4a0894bd168fd9b30c66/qf4ccf8f5435d4a78bdca4d6a018b578e/aabaaa.babaaa (Lio/netty/channel/ChannelHandlerContext;Ljava/lang/Object;Lio/netty/channel/ChannelPromise;)V
      // 41: aload 0
      // 42: bipush 0
      // 43: putfield qeaa361f143ee4a0894bd168fd9b30c66/qf4ccf8f5435d4a78bdca4d6a018b578e/aabaaa.aab Z
      // 46: aload 0
      // 47: bipush 0
      // 48: iload 4
      // 4a: ifne 69
      // 4d: putfield qeaa361f143ee4a0894bd168fd9b30c66/qf4ccf8f5435d4a78bdca4d6a018b578e/aabaaa.aaaaaa Z
      // 50: aload 0
      // 51: bipush 0
      // 52: putfield qeaa361f143ee4a0894bd168fd9b30c66/qf4ccf8f5435d4a78bdca4d6a018b578e/aabaaa.ababb Z
      // 55: aload 0
      // 56: goto 5a
      // 59: athrow
      // 5a: aload 0
      // 5b: getfield qeaa361f143ee4a0894bd168fd9b30c66/qf4ccf8f5435d4a78bdca4d6a018b578e/aabaaa.bbb Ljava/util/concurrent/ConcurrentLinkedQueue;
      // 5e: invokevirtual java/util/concurrent/ConcurrentLinkedQueue.isEmpty ()Z
      // 61: ifne 6c
      // 64: bipush 1
      // 65: goto 69
      // 68: athrow
      // 69: goto 6d
      // 6c: bipush 0
      // 6d: putfield qeaa361f143ee4a0894bd168fd9b30c66/qf4ccf8f5435d4a78bdca4d6a018b578e/aabaaa.aaab Z
      // 70: return
   }

   public aabaaa() {
      this.bbb = new ConcurrentLinkedQueue();
      this.aabbaa = new ConcurrentLinkedQueue();
      this.aaa = new ConcurrentLinkedQueue();
      this.bb = new ConcurrentLinkedQueue();
      this.aba = new ConcurrentLinkedQueue();
      this.abb = new ConcurrentLinkedQueue();
      this.bbbaa = ConcurrentHashMap.newKeySet();
      this.aaaabb = new AtomicBoolean();
      this.abbb = new AtomicBoolean();
      this.aaaba = new AtomicBoolean();
      this.bbaba = new AtomicBoolean();
      this.babab = new AtomicBoolean();
      this.abbaa = new AtomicLong();
      this.aaaaa = -1;
   }

   private boolean babb(long param1, abaaaabba param3) {
      // $VF: Couldn't be decompiled
      // Please report this to the Vineflower issue tracker, at https://github.com/Vineflower/vineflower/issues with a copy of the class file (if you have the rights to distribute it!)
      // java.lang.RuntimeException: parsing failure!
      //   at org.jetbrains.java.decompiler.modules.decompiler.decompose.DomHelper.parseGraph(DomHelper.java:211)
      //   at org.jetbrains.java.decompiler.main.rels.MethodProcessor.codeToJava(MethodProcessor.java:166)
      //
      // Bytecode:
      // 00: getstatic qeaa361f143ee4a0894bd168fd9b30c66/qf4ccf8f5435d4a78bdca4d6a018b578e/baaabbaa.bba I
      // 03: aload 0
      // 04: getfield qeaa361f143ee4a0894bd168fd9b30c66/qf4ccf8f5435d4a78bdca4d6a018b578e/aabaaa.bb Ljava/util/concurrent/ConcurrentLinkedQueue;
      // 07: invokevirtual java/util/concurrent/ConcurrentLinkedQueue.peek ()Ljava/lang/Object;
      // 0a: checkcast qeaa361f143ee4a0894bd168fd9b30c66/qf4ccf8f5435d4a78bdca4d6a018b578e/ababbb
      // 0d: astore 5
      // 0f: istore 4
      // 11: aload 5
      // 13: ifnull 58
      // 16: aload 3
      // 17: iload 4
      // 19: ifne 39
      // 1c: goto 20
      // 1f: athrow
      // 20: ifnull 3d
      // 23: goto 27
      // 26: athrow
      // 27: aload 5
      // 29: iload 4
      // 2b: ifne 43
      // 2e: goto 32
      // 31: athrow
      // 32: getfield qeaa361f143ee4a0894bd168fd9b30c66/qf4ccf8f5435d4a78bdca4d6a018b578e/ababbb.aa Lqeaa361f143ee4a0894bd168fd9b30c66/qf4ccf8f5435d4a78bdca4d6a018b578e/abaaaabba;
      // 35: goto 39
      // 38: athrow
      // 39: aload 3
      // 3a: if_acmpne 58
      // 3d: aload 5
      // 3f: goto 43
      // 42: athrow
      // 43: getfield qeaa361f143ee4a0894bd168fd9b30c66/qf4ccf8f5435d4a78bdca4d6a018b578e/ababbb.b J
      // 46: lload 1
      // 47: lcmp
      // 48: iload 4
      // 4a: ifne 55
      // 4d: ifgt 58
      // 50: goto 54
      // 53: athrow
      // 54: bipush 1
      // 55: goto 59
      // 58: bipush 0
      // 59: ireturn
   }

   private void bbaa(aaaabbaa param1) {
      // $VF: Couldn't be decompiled
      // Please report this to the Vineflower issue tracker, at https://github.com/Vineflower/vineflower/issues with a copy of the class file (if you have the rights to distribute it!)
      // java.lang.RuntimeException: parsing failure!
      //   at org.jetbrains.java.decompiler.modules.decompiler.decompose.DomHelper.parseGraph(DomHelper.java:211)
      //   at org.jetbrains.java.decompiler.main.rels.MethodProcessor.codeToJava(MethodProcessor.java:166)
      //
      // Bytecode:
      // 000: getstatic qeaa361f143ee4a0894bd168fd9b30c66/qf4ccf8f5435d4a78bdca4d6a018b578e/baaabbaa.bba I
      // 003: aload 0
      // 004: getfield qeaa361f143ee4a0894bd168fd9b30c66/qf4ccf8f5435d4a78bdca4d6a018b578e/aabaaa.ba Lio/netty/channel/ChannelHandlerContext;
      // 007: astore 3
      // 008: istore 2
      // 009: aload 3
      // 00a: ifnonnull 046
      // 00d: aload 1
      // 00e: iload 2
      // 00f: ifne 034
      // 012: goto 016
      // 015: athrow
      // 016: invokevirtual qeaa361f143ee4a0894bd168fd9b30c66/qf4ccf8f5435d4a78bdca4d6a018b578e/aaaabbaa.a ()Z
      // 019: ifeq 033
      // 01c: goto 020
      // 01f: athrow
      // 020: aload 0
      // 021: aload 0
      // 022: getfield qeaa361f143ee4a0894bd168fd9b30c66/qf4ccf8f5435d4a78bdca4d6a018b578e/aabaaa.aba Ljava/util/concurrent/ConcurrentLinkedQueue;
      // 025: new java/nio/channels/ClosedChannelException
      // 028: dup
      // 029: invokespecial java/nio/channels/ClosedChannelException.<init> ()V
      // 02c: invokevirtual qeaa361f143ee4a0894bd168fd9b30c66/qf4ccf8f5435d4a78bdca4d6a018b578e/aabaaa.bba (Ljava/util/concurrent/ConcurrentLinkedQueue;Ljava/lang/Throwable;)V
      // 02f: goto 033
      // 032: athrow
      // 033: aload 1
      // 034: invokevirtual qeaa361f143ee4a0894bd168fd9b30c66/qf4ccf8f5435d4a78bdca4d6a018b578e/aaaabbaa.b ()Z
      // 037: ifeq 045
      // 03a: aload 0
      // 03b: getfield qeaa361f143ee4a0894bd168fd9b30c66/qf4ccf8f5435d4a78bdca4d6a018b578e/aabaaa.abb Ljava/util/concurrent/ConcurrentLinkedQueue;
      // 03e: invokevirtual java/util/concurrent/ConcurrentLinkedQueue.clear ()V
      // 041: goto 045
      // 044: athrow
      // 045: return
      // 046: aload 1
      // 047: iload 2
      // 048: ifne 095
      // 04b: invokevirtual qeaa361f143ee4a0894bd168fd9b30c66/qf4ccf8f5435d4a78bdca4d6a018b578e/aaaabbaa.a ()Z
      // 04e: ifeq 094
      // 051: goto 055
      // 054: athrow
      // 055: aload 0
      // 056: aload 3
      // 057: invokedynamic run (Lqeaa361f143ee4a0894bd168fd9b30c66/qf4ccf8f5435d4a78bdca4d6a018b578e/aabaaa;Lio/netty/channel/ChannelHandlerContext;)Ljava/lang/Runnable; bsm=java/lang/invoke/LambdaMetafactory.metafactory (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;Ljava/lang/invoke/MethodType;Ljava/lang/invoke/MethodHandle;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[ ()V, qeaa361f143ee4a0894bd168fd9b30c66/qf4ccf8f5435d4a78bdca4d6a018b578e/aabaaa.baabbb (Lio/netty/channel/ChannelHandlerContext;)V, ()V ]
      // 05c: astore 4
      // 05e: aload 3
      // 05f: iload 2
      // 060: ifne 088
      // 063: invokeinterface io/netty/channel/ChannelHandlerContext.executor ()Lio/netty/util/concurrent/EventExecutor; 1
      // 068: invokeinterface io/netty/util/concurrent/EventExecutor.inEventLoop ()Z 1
      // 06d: ifeq 083
      // 070: goto 074
      // 073: athrow
      // 074: aload 4
      // 076: invokeinterface java/lang/Runnable.run ()V 1
      // 07b: iload 2
      // 07c: ifeq 094
      // 07f: goto 083
      // 082: athrow
      // 083: aload 3
      // 084: goto 088
      // 087: athrow
      // 088: invokeinterface io/netty/channel/ChannelHandlerContext.executor ()Lio/netty/util/concurrent/EventExecutor; 1
      // 08d: aload 4
      // 08f: invokeinterface io/netty/util/concurrent/EventExecutor.execute (Ljava/lang/Runnable;)V 2
      // 094: aload 1
      // 095: iload 2
      // 096: ifne 0cb
      // 099: invokevirtual qeaa361f143ee4a0894bd168fd9b30c66/qf4ccf8f5435d4a78bdca4d6a018b578e/aaaabbaa.a ()Z
      // 09c: ifeq 0ca
      // 09f: goto 0a3
      // 0a2: athrow
      // 0a3: aload 0
      // 0a4: getfield qeaa361f143ee4a0894bd168fd9b30c66/qf4ccf8f5435d4a78bdca4d6a018b578e/aabaaa.bbab Ljava/util/concurrent/ConcurrentLinkedQueue;
      // 0a7: invokevirtual java/util/concurrent/ConcurrentLinkedQueue.isEmpty ()Z
      // 0aa: iload 2
      // 0ab: ifne 0d6
      // 0ae: goto 0b2
      // 0b1: athrow
      // 0b2: ifne 0ca
      // 0b5: goto 0b9
      // 0b8: athrow
      // 0b9: aload 0
      // 0ba: getfield qeaa361f143ee4a0894bd168fd9b30c66/qf4ccf8f5435d4a78bdca4d6a018b578e/aabaaa.aaaabb Ljava/util/concurrent/atomic/AtomicBoolean;
      // 0bd: bipush 0
      // 0be: invokevirtual java/util/concurrent/atomic/AtomicBoolean.set (Z)V
      // 0c1: aload 0
      // 0c2: aload 3
      // 0c3: invokevirtual qeaa361f143ee4a0894bd168fd9b30c66/qf4ccf8f5435d4a78bdca4d6a018b578e/aabaaa.bbbbab (Lio/netty/channel/ChannelHandlerContext;)V
      // 0c6: goto 0ca
      // 0c9: athrow
      // 0ca: aload 1
      // 0cb: iload 2
      // 0cc: ifne 0e2
      // 0cf: invokevirtual qeaa361f143ee4a0894bd168fd9b30c66/qf4ccf8f5435d4a78bdca4d6a018b578e/aaaabbaa.b ()Z
      // 0d2: goto 0d6
      // 0d5: athrow
      // 0d6: ifeq 0e1
      // 0d9: aload 0
      // 0da: invokevirtual qeaa361f143ee4a0894bd168fd9b30c66/qf4ccf8f5435d4a78bdca4d6a018b578e/aabaaa.babbb ()V
      // 0dd: goto 0e1
      // 0e0: athrow
      // 0e1: aload 1
      // 0e2: invokevirtual qeaa361f143ee4a0894bd168fd9b30c66/qf4ccf8f5435d4a78bdca4d6a018b578e/aaaabbaa.b ()Z
      // 0e5: iload 2
      // 0e6: ifne 103
      // 0e9: ifeq 117
      // 0ec: goto 0f0
      // 0ef: athrow
      // 0f0: aload 0
      // 0f1: iload 2
      // 0f2: ifne 113
      // 0f5: goto 0f9
      // 0f8: athrow
      // 0f9: getfield qeaa361f143ee4a0894bd168fd9b30c66/qf4ccf8f5435d4a78bdca4d6a018b578e/aabaaa.aaa Ljava/util/concurrent/ConcurrentLinkedQueue;
      // 0fc: invokevirtual java/util/concurrent/ConcurrentLinkedQueue.isEmpty ()Z
      // 0ff: goto 103
      // 102: athrow
      // 103: ifne 117
      // 106: aload 0
      // 107: getfield qeaa361f143ee4a0894bd168fd9b30c66/qf4ccf8f5435d4a78bdca4d6a018b578e/aabaaa.aaaba Ljava/util/concurrent/atomic/AtomicBoolean;
      // 10a: bipush 0
      // 10b: invokevirtual java/util/concurrent/atomic/AtomicBoolean.set (Z)V
      // 10e: aload 0
      // 10f: goto 113
      // 112: athrow
      // 113: aload 3
      // 114: invokevirtual qeaa361f143ee4a0894bd168fd9b30c66/qf4ccf8f5435d4a78bdca4d6a018b578e/aabaaa.babbba (Lio/netty/channel/ChannelHandlerContext;)V
      // 117: return
   }

   private void bbab(Object param1) {
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
      // 09: instanceof net/minecraft/class_2935
      // 0c: ifeq 26
      // 0f: goto 13
      // 12: athrow
      // 13: aload 1
      // 14: goto 18
      // 17: athrow
      // 18: checkcast net/minecraft/class_2935
      // 1b: astore 3
      // 1c: invokestatic qeaa361f143ee4a0894bd168fd9b30c66/qf4ccf8f5435d4a78bdca4d6a018b578e/abbabbaa.abb ()Lqeaa361f143ee4a0894bd168fd9b30c66/qf4ccf8f5435d4a78bdca4d6a018b578e/abbabbaa;
      // 1f: aload 3
      // 20: invokevirtual net/minecraft/class_2935.method_12700 ()J
      // 23: invokevirtual qeaa361f143ee4a0894bd168fd9b30c66/qf4ccf8f5435d4a78bdca4d6a018b578e/abbabbaa.baba (J)V
      // 26: return
   }

   private void bbba(ChannelHandlerContext param1, long param2) {
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
      // 08: ifne 1d
      // 0b: getfield qeaa361f143ee4a0894bd168fd9b30c66/qf4ccf8f5435d4a78bdca4d6a018b578e/aabaaa.abbb Ljava/util/concurrent/atomic/AtomicBoolean;
      // 0e: bipush 0
      // 0f: bipush 1
      // 10: invokevirtual java/util/concurrent/atomic/AtomicBoolean.compareAndSet (ZZ)Z
      // 13: ifne 1c
      // 16: goto 1a
      // 19: athrow
      // 1a: return
      // 1b: athrow
      // 1c: aload 0
      // 1d: aload 1
      // 1e: invokedynamic run (Lqeaa361f143ee4a0894bd168fd9b30c66/qf4ccf8f5435d4a78bdca4d6a018b578e/aabaaa;Lio/netty/channel/ChannelHandlerContext;)Ljava/lang/Runnable; bsm=java/lang/invoke/LambdaMetafactory.metafactory (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;Ljava/lang/invoke/MethodType;Ljava/lang/invoke/MethodHandle;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[ ()V, qeaa361f143ee4a0894bd168fd9b30c66/qf4ccf8f5435d4a78bdca4d6a018b578e/aabaaa.aababb (Lio/netty/channel/ChannelHandlerContext;)V, ()V ]
      // 23: astore 5
      // 25: lload 2
      // 26: lconst_0
      // 27: lcmp
      // 28: iload 4
      // 2a: ifne 62
      // 2d: ifle 4e
      // 30: goto 34
      // 33: athrow
      // 34: aload 1
      // 35: invokeinterface io/netty/channel/ChannelHandlerContext.executor ()Lio/netty/util/concurrent/EventExecutor; 1
      // 3a: aload 5
      // 3c: lload 2
      // 3d: getstatic qeaa361f143ee4a0894bd168fd9b30c66/qf4ccf8f5435d4a78bdca4d6a018b578e/aabaaa.abaa J
      // 40: invokestatic java/lang/Math.max (JJ)J
      // 43: getstatic java/util/concurrent/TimeUnit.NANOSECONDS Ljava/util/concurrent/TimeUnit;
      // 46: invokeinterface io/netty/util/concurrent/EventExecutor.schedule (Ljava/lang/Runnable;JLjava/util/concurrent/TimeUnit;)Lio/netty/util/concurrent/ScheduledFuture; 5
      // 4b: pop
      // 4c: return
      // 4d: athrow
      // 4e: aload 1
      // 4f: iload 4
      // 51: ifne 7a
      // 54: invokeinterface io/netty/channel/ChannelHandlerContext.executor ()Lio/netty/util/concurrent/EventExecutor; 1
      // 59: invokeinterface io/netty/util/concurrent/EventExecutor.inEventLoop ()Z 1
      // 5e: goto 62
      // 61: athrow
      // 62: ifeq 75
      // 65: aload 5
      // 67: invokeinterface java/lang/Runnable.run ()V 1
      // 6c: iload 4
      // 6e: ifeq 86
      // 71: goto 75
      // 74: athrow
      // 75: aload 1
      // 76: goto 7a
      // 79: athrow
      // 7a: invokeinterface io/netty/channel/ChannelHandlerContext.executor ()Lio/netty/util/concurrent/EventExecutor; 1
      // 7f: aload 5
      // 81: invokeinterface io/netty/util/concurrent/EventExecutor.execute (Ljava/lang/Runnable;)V 2
      // 86: return
   }

   private void bbbb(ChannelHandlerContext var1) {
      this.babbbb(var1);
   }

   public static boolean aaaaa() {
      // $VF: Couldn't be decompiled
      // Please report this to the Vineflower issue tracker, at https://github.com/Vineflower/vineflower/issues with a copy of the class file (if you have the rights to distribute it!)
      // java.lang.RuntimeException: parsing failure!
      //   at org.jetbrains.java.decompiler.modules.decompiler.decompose.DomHelper.parseGraph(DomHelper.java:211)
      //   at org.jetbrains.java.decompiler.main.rels.MethodProcessor.codeToJava(MethodProcessor.java:166)
      //
      // Bytecode:
      // 00: getstatic qeaa361f143ee4a0894bd168fd9b30c66/qf4ccf8f5435d4a78bdca4d6a018b578e/baaabbaa.bba I
      // 03: istore 0
      // 04: getstatic qeaa361f143ee4a0894bd168fd9b30c66/qf4ccf8f5435d4a78bdca4d6a018b578e/aabaaa.abaaa Lqeaa361f143ee4a0894bd168fd9b30c66/qf4ccf8f5435d4a78bdca4d6a018b578e/aaabbabbb;
      // 07: ifnull 1a
      // 0a: getstatic qeaa361f143ee4a0894bd168fd9b30c66/qf4ccf8f5435d4a78bdca4d6a018b578e/aabaaa.aaaaba Lqeaa361f143ee4a0894bd168fd9b30c66/qf4ccf8f5435d4a78bdca4d6a018b578e/abaaaabba;
      // 0d: getstatic qeaa361f143ee4a0894bd168fd9b30c66/qf4ccf8f5435d4a78bdca4d6a018b578e/abaaaabba.ba Lqeaa361f143ee4a0894bd168fd9b30c66/qf4ccf8f5435d4a78bdca4d6a018b578e/abaaaabba;
      // 10: if_acmpne 1a
      // 13: goto 17
      // 16: athrow
      // 17: bipush 1
      // 18: ireturn
      // 19: athrow
      // 1a: getstatic qeaa361f143ee4a0894bd168fd9b30c66/qf4ccf8f5435d4a78bdca4d6a018b578e/aabaaa.abba Ljava/util/Set;
      // 1d: invokeinterface java/util/Set.iterator ()Ljava/util/Iterator; 1
      // 22: astore 1
      // 23: aload 1
      // 24: invokeinterface java/util/Iterator.hasNext ()Z 1
      // 29: ifeq 82
      // 2c: aload 1
      // 2d: invokeinterface java/util/Iterator.next ()Ljava/lang/Object; 1
      // 32: checkcast qeaa361f143ee4a0894bd168fd9b30c66/qf4ccf8f5435d4a78bdca4d6a018b578e/aabaaa
      // 35: astore 2
      // 36: aload 2
      // 37: iload 0
      // 38: ifne 4d
      // 3b: getfield qeaa361f143ee4a0894bd168fd9b30c66/qf4ccf8f5435d4a78bdca4d6a018b578e/aabaaa.aaabab Z
      // 3e: iload 0
      // 3f: ifne 83
      // 42: ifeq 4c
      // 45: goto 49
      // 48: athrow
      // 49: bipush 1
      // 4a: ireturn
      // 4b: athrow
      // 4c: aload 2
      // 4d: getfield qeaa361f143ee4a0894bd168fd9b30c66/qf4ccf8f5435d4a78bdca4d6a018b578e/aabaaa.bb Ljava/util/concurrent/ConcurrentLinkedQueue;
      // 50: invokevirtual java/util/concurrent/ConcurrentLinkedQueue.iterator ()Ljava/util/Iterator;
      // 53: astore 3
      // 54: aload 3
      // 55: invokeinterface java/util/Iterator.hasNext ()Z 1
      // 5a: ifeq 7e
      // 5d: aload 3
      // 5e: invokeinterface java/util/Iterator.next ()Ljava/lang/Object; 1
      // 63: checkcast qeaa361f143ee4a0894bd168fd9b30c66/qf4ccf8f5435d4a78bdca4d6a018b578e/ababbb
      // 66: iload 0
      // 67: ifne 32
      // 6a: astore 4
      // 6c: aload 4
      // 6e: getfield qeaa361f143ee4a0894bd168fd9b30c66/qf4ccf8f5435d4a78bdca4d6a018b578e/ababbb.aa Lqeaa361f143ee4a0894bd168fd9b30c66/qf4ccf8f5435d4a78bdca4d6a018b578e/abaaaabba;
      // 71: getstatic qeaa361f143ee4a0894bd168fd9b30c66/qf4ccf8f5435d4a78bdca4d6a018b578e/abaaaabba.ba Lqeaa361f143ee4a0894bd168fd9b30c66/qf4ccf8f5435d4a78bdca4d6a018b578e/abaaaabba;
      // 74: if_acmpne 7a
      // 77: bipush 1
      // 78: ireturn
      // 79: athrow
      // 7a: iload 0
      // 7b: ifeq 54
      // 7e: iload 0
      // 7f: ifeq 23
      // 82: bipush 0
      // 83: ireturn
   }

   private void aaaab(ChannelHandlerContext param1) {
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
      // 09: ifnull 26
      // 0c: goto 10
      // 0f: athrow
      // 10: aload 1
      // 11: iload 2
      // 12: ifne 3d
      // 15: invokeinterface io/netty/channel/ChannelHandlerContext.channel ()Lio/netty/channel/Channel; 1
      // 1a: invokeinterface io/netty/channel/Channel.isOpen ()Z 1
      // 1f: ifne 36
      // 22: goto 26
      // 25: athrow
      // 26: aload 0
      // 27: getfield qeaa361f143ee4a0894bd168fd9b30c66/qf4ccf8f5435d4a78bdca4d6a018b578e/aabaaa.aaa Ljava/util/concurrent/ConcurrentLinkedQueue;
      // 2a: invokevirtual java/util/concurrent/ConcurrentLinkedQueue.clear ()V
      // 2d: aload 0
      // 2e: getfield qeaa361f143ee4a0894bd168fd9b30c66/qf4ccf8f5435d4a78bdca4d6a018b578e/aabaaa.abb Ljava/util/concurrent/ConcurrentLinkedQueue;
      // 31: invokevirtual java/util/concurrent/ConcurrentLinkedQueue.clear ()V
      // 34: return
      // 35: athrow
      // 36: aload 0
      // 37: getfield qeaa361f143ee4a0894bd168fd9b30c66/qf4ccf8f5435d4a78bdca4d6a018b578e/aabaaa.aaa Ljava/util/concurrent/ConcurrentLinkedQueue;
      // 3a: invokevirtual java/util/concurrent/ConcurrentLinkedQueue.poll ()Ljava/lang/Object;
      // 3d: checkcast qeaa361f143ee4a0894bd168fd9b30c66/qf4ccf8f5435d4a78bdca4d6a018b578e/abbbbbab
      // 40: dup
      // 41: astore 3
      // 42: ifnull 5d
      // 45: iload 2
      // 46: ifne 62
      // 49: goto 4d
      // 4c: athrow
      // 4d: aload 1
      // 4e: aload 3
      // 4f: invokevirtual qeaa361f143ee4a0894bd168fd9b30c66/qf4ccf8f5435d4a78bdca4d6a018b578e/abbbbbab.aa ()Ljava/lang/Object;
      // 52: invokestatic qeaa361f143ee4a0894bd168fd9b30c66/qf4ccf8f5435d4a78bdca4d6a018b578e/aabaaa.aabaaa (Lio/netty/channel/ChannelHandlerContext;Ljava/lang/Object;)V
      // 55: iload 2
      // 56: ifeq 36
      // 59: goto 5d
      // 5c: athrow
      // 5d: aload 0
      // 5e: aload 1
      // 5f: invokevirtual qeaa361f143ee4a0894bd168fd9b30c66/qf4ccf8f5435d4a78bdca4d6a018b578e/aabaaa.bbaab (Lio/netty/channel/ChannelHandlerContext;)V
      // 62: return
   }

   private void aaaba(Throwable param1) {
      // $VF: Couldn't be decompiled
      // Please report this to the Vineflower issue tracker, at https://github.com/Vineflower/vineflower/issues with a copy of the class file (if you have the rights to distribute it!)
      // java.lang.RuntimeException: parsing failure!
      //   at org.jetbrains.java.decompiler.modules.decompiler.decompose.DomHelper.parseGraph(DomHelper.java:211)
      //   at org.jetbrains.java.decompiler.main.rels.MethodProcessor.codeToJava(MethodProcessor.java:166)
      //
      // Bytecode:
      // 00: aload 0
      // 01: getfield qeaa361f143ee4a0894bd168fd9b30c66/qf4ccf8f5435d4a78bdca4d6a018b578e/aabaaa.ba Lio/netty/channel/ChannelHandlerContext;
      // 04: astore 3
      // 05: invokestatic qeaa361f143ee4a0894bd168fd9b30c66/qf4ccf8f5435d4a78bdca4d6a018b578e/aabaaa.abbbb ()V
      // 08: invokestatic qeaa361f143ee4a0894bd168fd9b30c66/qf4ccf8f5435d4a78bdca4d6a018b578e/abab.aa ()Lqeaa361f143ee4a0894bd168fd9b30c66/qf4ccf8f5435d4a78bdca4d6a018b578e/abab;
      // 0b: invokevirtual qeaa361f143ee4a0894bd168fd9b30c66/qf4ccf8f5435d4a78bdca4d6a018b578e/abab.a ()V
      // 0e: aload 0
      // 0f: aload 3
      // 10: aload 1
      // 11: invokevirtual qeaa361f143ee4a0894bd168fd9b30c66/qf4ccf8f5435d4a78bdca4d6a018b578e/aabaaa.aabbbb (Lio/netty/channel/ChannelHandlerContext;Ljava/lang/Throwable;)V
      // 14: aload 0
      // 15: aload 3
      // 16: invokevirtual qeaa361f143ee4a0894bd168fd9b30c66/qf4ccf8f5435d4a78bdca4d6a018b578e/aabaaa.aaaab (Lio/netty/channel/ChannelHandlerContext;)V
      // 19: aload 0
      // 1a: getfield qeaa361f143ee4a0894bd168fd9b30c66/qf4ccf8f5435d4a78bdca4d6a018b578e/aabaaa.bbbaa Ljava/util/Set;
      // 1d: invokeinterface java/util/Set.clear ()V 1
      // 22: getstatic qeaa361f143ee4a0894bd168fd9b30c66/qf4ccf8f5435d4a78bdca4d6a018b578e/baaabbaa.bba I
      // 25: aload 0
      // 26: invokevirtual qeaa361f143ee4a0894bd168fd9b30c66/qf4ccf8f5435d4a78bdca4d6a018b578e/aabaaa.bb ()V
      // 29: istore 2
      // 2a: aload 0
      // 2b: invokevirtual qeaa361f143ee4a0894bd168fd9b30c66/qf4ccf8f5435d4a78bdca4d6a018b578e/aabaaa.aaabaab ()V
      // 2e: iload 2
      // 2f: invokestatic qeaa361f143ee4a0894bd168fd9b30c66/qf4ccf8f5435d4a78bdca4d6a018b578e/aabaaa.babab ()V
      // 32: aload 0
      // 33: getfield qeaa361f143ee4a0894bd168fd9b30c66/qf4ccf8f5435d4a78bdca4d6a018b578e/aabaaa.aaaabb Ljava/util/concurrent/atomic/AtomicBoolean;
      // 36: bipush 0
      // 37: invokevirtual java/util/concurrent/atomic/AtomicBoolean.set (Z)V
      // 3a: aload 0
      // 3b: getfield qeaa361f143ee4a0894bd168fd9b30c66/qf4ccf8f5435d4a78bdca4d6a018b578e/aabaaa.abbb Ljava/util/concurrent/atomic/AtomicBoolean;
      // 3e: bipush 0
      // 3f: invokevirtual java/util/concurrent/atomic/AtomicBoolean.set (Z)V
      // 42: aload 0
      // 43: getfield qeaa361f143ee4a0894bd168fd9b30c66/qf4ccf8f5435d4a78bdca4d6a018b578e/aabaaa.aaaba Ljava/util/concurrent/atomic/AtomicBoolean;
      // 46: bipush 0
      // 47: invokevirtual java/util/concurrent/atomic/AtomicBoolean.set (Z)V
      // 4a: aload 0
      // 4b: getfield qeaa361f143ee4a0894bd168fd9b30c66/qf4ccf8f5435d4a78bdca4d6a018b578e/aabaaa.bbaba Ljava/util/concurrent/atomic/AtomicBoolean;
      // 4e: bipush 0
      // 4f: invokevirtual java/util/concurrent/atomic/AtomicBoolean.set (Z)V
      // 52: aload 0
      // 53: getfield qeaa361f143ee4a0894bd168fd9b30c66/qf4ccf8f5435d4a78bdca4d6a018b578e/aabaaa.babab Ljava/util/concurrent/atomic/AtomicBoolean;
      // 56: bipush 0
      // 57: invokevirtual java/util/concurrent/atomic/AtomicBoolean.set (Z)V
      // 5a: aload 0
      // 5b: bipush 0
      // 5c: putfield qeaa361f143ee4a0894bd168fd9b30c66/qf4ccf8f5435d4a78bdca4d6a018b578e/aabaaa.aaabab Z
      // 5f: aload 0
      // 60: lconst_0
      // 61: putfield qeaa361f143ee4a0894bd168fd9b30c66/qf4ccf8f5435d4a78bdca4d6a018b578e/aabaaa.aabbb J
      // 64: aload 0
      // 65: lconst_0
      // 66: putfield qeaa361f143ee4a0894bd168fd9b30c66/qf4ccf8f5435d4a78bdca4d6a018b578e/aabaaa.aabab J
      // 69: aload 0
      // 6a: lconst_0
      // 6b: putfield qeaa361f143ee4a0894bd168fd9b30c66/qf4ccf8f5435d4a78bdca4d6a018b578e/aabaaa.aabba J
      // 6e: aload 0
      // 6f: lconst_0
      // 70: putfield qeaa361f143ee4a0894bd168fd9b30c66/qf4ccf8f5435d4a78bdca4d6a018b578e/aabaaa.aabbba J
      // 73: bipush 0
      // 74: putstatic qeaa361f143ee4a0894bd168fd9b30c66/qf4ccf8f5435d4a78bdca4d6a018b578e/aabaaa.bbabb Z
      // 77: bipush 0
      // 78: putstatic qeaa361f143ee4a0894bd168fd9b30c66/qf4ccf8f5435d4a78bdca4d6a018b578e/aabaaa.aabaab Z
      // 7b: aload 0
      // 7c: bipush -1
      // 7d: putfield qeaa361f143ee4a0894bd168fd9b30c66/qf4ccf8f5435d4a78bdca4d6a018b578e/aabaaa.aaaaa I
      // 80: invokestatic qeaa361f143ee4a0894bd168fd9b30c66/qf4ccf8f5435d4a78bdca4d6a018b578e/aabaaa.ababbba ()V
      // 83: invokestatic qeaa361f143ee4a0894bd168fd9b30c66/qf4ccf8f5435d4a78bdca4d6a018b578e/abbabbaa.abb ()Lqeaa361f143ee4a0894bd168fd9b30c66/qf4ccf8f5435d4a78bdca4d6a018b578e/abbabbaa;
      // 86: astore 4
      // 88: aload 4
      // 8a: bipush 0
      // 8b: invokevirtual qeaa361f143ee4a0894bd168fd9b30c66/qf4ccf8f5435d4a78bdca4d6a018b578e/abbabbaa.aaaab (Z)V
      // 8e: ifne a8
      // 91: aload 4
      // 93: invokevirtual qeaa361f143ee4a0894bd168fd9b30c66/qf4ccf8f5435d4a78bdca4d6a018b578e/abbabbaa.bba ()Lqeaa361f143ee4a0894bd168fd9b30c66/qf4ccf8f5435d4a78bdca4d6a018b578e/aaaabbaa;
      // 96: pop
      // 97: invokestatic qeaa361f143ee4a0894bd168fd9b30c66/qf4ccf8f5435d4a78bdca4d6a018b578e/abaaaaaba.aaaaa ()Lqeaa361f143ee4a0894bd168fd9b30c66/qf4ccf8f5435d4a78bdca4d6a018b578e/abaaaaaba;
      // 9a: ifnull ab
      // 9d: goto a1
      // a0: athrow
      // a1: invokestatic qeaa361f143ee4a0894bd168fd9b30c66/qf4ccf8f5435d4a78bdca4d6a018b578e/aabbabbbb.aaabbbb ()V
      // a4: goto a8
      // a7: athrow
      // a8: invokestatic qeaa361f143ee4a0894bd168fd9b30c66/qf4ccf8f5435d4a78bdca4d6a018b578e/bbabbbb.aab ()V
      // ab: return
   }

   private void aaabb(long param1) {
      // $VF: Couldn't be decompiled
      // Please report this to the Vineflower issue tracker, at https://github.com/Vineflower/vineflower/issues with a copy of the class file (if you have the rights to distribute it!)
      // java.lang.RuntimeException: parsing failure!
      //   at org.jetbrains.java.decompiler.modules.decompiler.decompose.DomHelper.parseGraph(DomHelper.java:211)
      //   at org.jetbrains.java.decompiler.main.rels.MethodProcessor.codeToJava(MethodProcessor.java:166)
      //
      // Bytecode:
      // 00: getstatic qeaa361f143ee4a0894bd168fd9b30c66/qf4ccf8f5435d4a78bdca4d6a018b578e/baaabbaa.bba I
      // 03: istore 3
      // 04: iload 3
      // 05: aload 0
      // 06: getfield qeaa361f143ee4a0894bd168fd9b30c66/qf4ccf8f5435d4a78bdca4d6a018b578e/aabaaa.ba Lio/netty/channel/ChannelHandlerContext;
      // 09: astore 4
      // 0b: ifne 22
      // 0e: aload 4
      // 10: ifnonnull 23
      // 13: goto 17
      // 16: athrow
      // 17: aload 0
      // 18: getfield qeaa361f143ee4a0894bd168fd9b30c66/qf4ccf8f5435d4a78bdca4d6a018b578e/aabaaa.abb Ljava/util/concurrent/ConcurrentLinkedQueue;
      // 1b: invokevirtual java/util/concurrent/ConcurrentLinkedQueue.clear ()V
      // 1e: goto 22
      // 21: athrow
      // 22: return
      // 23: aload 0
      // 24: aload 4
      // 26: lload 1
      // 27: invokedynamic run (Lqeaa361f143ee4a0894bd168fd9b30c66/qf4ccf8f5435d4a78bdca4d6a018b578e/aabaaa;Lio/netty/channel/ChannelHandlerContext;J)Ljava/lang/Runnable; bsm=java/lang/invoke/LambdaMetafactory.metafactory (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;Ljava/lang/invoke/MethodType;Ljava/lang/invoke/MethodHandle;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[ ()V, qeaa361f143ee4a0894bd168fd9b30c66/qf4ccf8f5435d4a78bdca4d6a018b578e/aabaaa.baaaa (Lio/netty/channel/ChannelHandlerContext;J)V, ()V ]
      // 2c: astore 5
      // 2e: aload 4
      // 30: iload 3
      // 31: ifne 5a
      // 34: invokeinterface io/netty/channel/ChannelHandlerContext.executor ()Lio/netty/util/concurrent/EventExecutor; 1
      // 39: invokeinterface io/netty/util/concurrent/EventExecutor.inEventLoop ()Z 1
      // 3e: ifeq 54
      // 41: goto 45
      // 44: athrow
      // 45: aload 5
      // 47: invokeinterface java/lang/Runnable.run ()V 1
      // 4c: iload 3
      // 4d: ifeq 66
      // 50: goto 54
      // 53: athrow
      // 54: aload 4
      // 56: goto 5a
      // 59: athrow
      // 5a: invokeinterface io/netty/channel/ChannelHandlerContext.executor ()Lio/netty/util/concurrent/EventExecutor; 1
      // 5f: aload 5
      // 61: invokeinterface io/netty/util/concurrent/EventExecutor.execute (Ljava/lang/Runnable;)V 2
      // 66: return
   }

   private static boolean aabaa(class_2596 var0) {
      return false;
   }

   public static void aabab() {
      baaba = true;
   }

   private void aabba() {
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
      // 05: aload 0
      // 06: getfield qeaa361f143ee4a0894bd168fd9b30c66/qf4ccf8f5435d4a78bdca4d6a018b578e/aabaaa.ba Lio/netty/channel/ChannelHandlerContext;
      // 09: astore 2
      // 0a: ifne 2c
      // 0d: aload 2
      // 0e: ifnonnull 2d
      // 11: goto 15
      // 14: athrow
      // 15: aload 0
      // 16: new java/nio/channels/ClosedChannelException
      // 19: dup
      // 1a: invokespecial java/nio/channels/ClosedChannelException.<init> ()V
      // 1d: invokevirtual qeaa361f143ee4a0894bd168fd9b30c66/qf4ccf8f5435d4a78bdca4d6a018b578e/aabaaa.aaaabba (Ljava/lang/Throwable;)V
      // 20: aload 0
      // 21: getfield qeaa361f143ee4a0894bd168fd9b30c66/qf4ccf8f5435d4a78bdca4d6a018b578e/aabaaa.abbb Ljava/util/concurrent/atomic/AtomicBoolean;
      // 24: bipush 0
      // 25: invokevirtual java/util/concurrent/atomic/AtomicBoolean.set (Z)V
      // 28: goto 2c
      // 2b: athrow
      // 2c: return
      // 2d: aload 0
      // 2e: aload 2
      // 2f: invokedynamic run (Lqeaa361f143ee4a0894bd168fd9b30c66/qf4ccf8f5435d4a78bdca4d6a018b578e/aabaaa;Lio/netty/channel/ChannelHandlerContext;)Ljava/lang/Runnable; bsm=java/lang/invoke/LambdaMetafactory.metafactory (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;Ljava/lang/invoke/MethodType;Ljava/lang/invoke/MethodHandle;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[ ()V, qeaa361f143ee4a0894bd168fd9b30c66/qf4ccf8f5435d4a78bdca4d6a018b578e/aabaaa.aaababb (Lio/netty/channel/ChannelHandlerContext;)V, ()V ]
      // 34: astore 3
      // 35: aload 2
      // 36: iload 1
      // 37: ifne 5e
      // 3a: invokeinterface io/netty/channel/ChannelHandlerContext.executor ()Lio/netty/util/concurrent/EventExecutor; 1
      // 3f: invokeinterface io/netty/util/concurrent/EventExecutor.inEventLoop ()Z 1
      // 44: ifeq 59
      // 47: goto 4b
      // 4a: athrow
      // 4b: aload 3
      // 4c: invokeinterface java/lang/Runnable.run ()V 1
      // 51: iload 1
      // 52: ifeq 69
      // 55: goto 59
      // 58: athrow
      // 59: aload 2
      // 5a: goto 5e
      // 5d: athrow
      // 5e: invokeinterface io/netty/channel/ChannelHandlerContext.executor ()Lio/netty/util/concurrent/EventExecutor; 1
      // 63: aload 3
      // 64: invokeinterface io/netty/util/concurrent/EventExecutor.execute (Ljava/lang/Runnable;)V 2
      // 69: return
   }

   private baa aabbb() {
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
      // 0a: ifne 18
      // 0d: ifnonnull 17
      // 10: goto 14
      // 13: athrow
      // 14: aconst_null
      // 15: areturn
      // 16: athrow
      // 17: aload 2
      // 18: invokevirtual qeaa361f143ee4a0894bd168fd9b30c66/qf4ccf8f5435d4a78bdca4d6a018b578e/abaaaaaba.aaba ()Lqeaa361f143ee4a0894bd168fd9b30c66/qf4ccf8f5435d4a78bdca4d6a018b578e/babbaba;
      // 1b: invokevirtual qeaa361f143ee4a0894bd168fd9b30c66/qf4ccf8f5435d4a78bdca4d6a018b578e/babbaba.aabbbab ()Lqeaa361f143ee4a0894bd168fd9b30c66/qf4ccf8f5435d4a78bdca4d6a018b578e/baa;
      // 1e: astore 3
      // 1f: aload 3
      // 20: iload 1
      // 21: ifne 2c
      // 24: ifnull 3a
      // 27: goto 2b
      // 2a: athrow
      // 2b: aload 3
      // 2c: iload 1
      // 2d: ifne 3e
      // 30: invokevirtual qeaa361f143ee4a0894bd168fd9b30c66/qf4ccf8f5435d4a78bdca4d6a018b578e/baa.babbaab ()Z
      // 33: ifne 3d
      // 36: goto 3a
      // 39: athrow
      // 3a: aconst_null
      // 3b: areturn
      // 3c: athrow
      // 3d: aload 3
      // 3e: iload 1
      // 3f: ifne 51
      // 42: invokevirtual qeaa361f143ee4a0894bd168fd9b30c66/qf4ccf8f5435d4a78bdca4d6a018b578e/baa.ba ()Z
      // 45: ifeq 54
      // 48: goto 4c
      // 4b: athrow
      // 4c: aload 3
      // 4d: goto 51
      // 50: athrow
      // 51: goto 55
      // 54: aconst_null
      // 55: areturn
   }

   private static boolean abaaa(Object param0) {
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
      // 09: instanceof net/minecraft/class_2799
      // 0c: ifeq 2b
      // 0f: goto 13
      // 12: athrow
      // 13: aload 0
      // 14: goto 18
      // 17: athrow
      // 18: checkcast net/minecraft/class_2799
      // 1b: astore 2
      // 1c: aload 2
      // 1d: invokevirtual net/minecraft/class_2799.method_12119 ()Lnet/minecraft/class_2799$class_2800;
      // 20: getstatic net/minecraft/class_2799$class_2800.field_12774 Lnet/minecraft/class_2799$class_2800;
      // 23: if_acmpne 2b
      // 26: bipush 1
      // 27: goto 2c
      // 2a: athrow
      // 2b: bipush 0
      // 2c: ireturn
   }

   private ababbb abaab(Object var1, ChannelPromise var2, abaaaabba var3) {
      return new ababbb(var1, var2, var3, System.nanoTime(), this.abbaa.incrementAndGet());
   }

   private boolean ababa(ababbb param1) {
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
      // 06: ifne 2d
      // 09: getfield qeaa361f143ee4a0894bd168fd9b30c66/qf4ccf8f5435d4a78bdca4d6a018b578e/aabaaa.aba Ljava/util/concurrent/ConcurrentLinkedQueue;
      // 0c: invokevirtual java/util/concurrent/ConcurrentLinkedQueue.size ()I
      // 0f: ldc_w -522994189
      // 12: ldc_w 308658251
      // 15: ldc_w 375727629
      // 18: ixor
      // 19: invokestatic qeaa361f143ee4a0894bd168fd9b30c66/qf4ccf8f5435d4a78bdca4d6a018b578e/aabaaa.baaaaab (II)I
      // 1c: ldc2_w 3135826274739139856
      // 1f: invokestatic qeaa361f143ee4a0894bd168fd9b30c66/qf4ccf8f5435d4a78bdca4d6a018b578e/aabaaa.abbbbab (IJ)I
      // 22: if_icmplt 2c
      // 25: goto 29
      // 28: athrow
      // 29: bipush 0
      // 2a: ireturn
      // 2b: athrow
      // 2c: aload 0
      // 2d: getfield qeaa361f143ee4a0894bd168fd9b30c66/qf4ccf8f5435d4a78bdca4d6a018b578e/aabaaa.aba Ljava/util/concurrent/ConcurrentLinkedQueue;
      // 30: aload 1
      // 31: invokevirtual java/util/concurrent/ConcurrentLinkedQueue.offer (Ljava/lang/Object;)Z
      // 34: pop
      // 35: bipush 1
      // 36: ireturn
   }

   private void ababb(aaaabbaa param1, ChannelHandlerContext param2) {
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
      // 06: ifne 1d
      // 09: invokevirtual qeaa361f143ee4a0894bd168fd9b30c66/qf4ccf8f5435d4a78bdca4d6a018b578e/aaaabbaa.a ()Z
      // 0c: ifeq 1c
      // 0f: goto 13
      // 12: athrow
      // 13: aload 0
      // 14: aload 2
      // 15: invokevirtual qeaa361f143ee4a0894bd168fd9b30c66/qf4ccf8f5435d4a78bdca4d6a018b578e/aabaaa.babaa (Lio/netty/channel/ChannelHandlerContext;)V
      // 18: goto 1c
      // 1b: athrow
      // 1c: aload 1
      // 1d: invokevirtual qeaa361f143ee4a0894bd168fd9b30c66/qf4ccf8f5435d4a78bdca4d6a018b578e/aaaabbaa.b ()Z
      // 20: ifeq 34
      // 23: aload 0
      // 24: getfield qeaa361f143ee4a0894bd168fd9b30c66/qf4ccf8f5435d4a78bdca4d6a018b578e/aabaaa.babab Ljava/util/concurrent/atomic/AtomicBoolean;
      // 27: bipush 0
      // 28: invokevirtual java/util/concurrent/atomic/AtomicBoolean.set (Z)V
      // 2b: aload 0
      // 2c: aload 2
      // 2d: invokevirtual qeaa361f143ee4a0894bd168fd9b30c66/qf4ccf8f5435d4a78bdca4d6a018b578e/aabaaa.bbaab (Lio/netty/channel/ChannelHandlerContext;)V
      // 30: goto 34
      // 33: athrow
      // 34: return
   }

   private void abbaa(int param1) {
      // $VF: Couldn't be decompiled
      // Please report this to the Vineflower issue tracker, at https://github.com/Vineflower/vineflower/issues with a copy of the class file (if you have the rights to distribute it!)
      // java.lang.RuntimeException: parsing failure!
      //   at org.jetbrains.java.decompiler.modules.decompiler.decompose.DomHelper.parseGraph(DomHelper.java:211)
      //   at org.jetbrains.java.decompiler.main.rels.MethodProcessor.codeToJava(MethodProcessor.java:166)
      //
      // Bytecode:
      // 00: getstatic qeaa361f143ee4a0894bd168fd9b30c66/qf4ccf8f5435d4a78bdca4d6a018b578e/baaabbaa.bba I
      // 03: aload 0
      // 04: getfield qeaa361f143ee4a0894bd168fd9b30c66/qf4ccf8f5435d4a78bdca4d6a018b578e/aabaaa.aabbaa Ljava/util/concurrent/ConcurrentLinkedQueue;
      // 07: invokevirtual java/util/concurrent/ConcurrentLinkedQueue.iterator ()Ljava/util/Iterator;
      // 0a: astore 3
      // 0b: istore 2
      // 0c: aload 3
      // 0d: invokeinterface java/util/Iterator.hasNext ()Z 1
      // 12: ifeq 45
      // 15: aload 3
      // 16: invokeinterface java/util/Iterator.next ()Ljava/lang/Object; 1
      // 1b: checkcast qeaa361f143ee4a0894bd168fd9b30c66/qf4ccf8f5435d4a78bdca4d6a018b578e/aabaaab
      // 1e: astore 4
      // 20: aload 4
      // 22: getfield qeaa361f143ee4a0894bd168fd9b30c66/qf4ccf8f5435d4a78bdca4d6a018b578e/aabaaab.a I
      // 25: iload 2
      // 26: ifne 40
      // 29: iload 1
      // 2a: if_icmpge 41
      // 2d: goto 31
      // 30: athrow
      // 31: aload 0
      // 32: getfield qeaa361f143ee4a0894bd168fd9b30c66/qf4ccf8f5435d4a78bdca4d6a018b578e/aabaaa.bbbaa Ljava/util/Set;
      // 35: aload 4
      // 37: invokeinterface java/util/Set.add (Ljava/lang/Object;)Z 2
      // 3c: goto 40
      // 3f: athrow
      // 40: pop
      // 41: iload 2
      // 42: ifeq 0c
      // 45: return
   }

   private static void abbab(Object param0) {
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
      // 09: instanceof net/minecraft/class_2923
      // 0c: ifeq 2d
      // 0f: goto 13
      // 12: athrow
      // 13: aload 0
      // 14: goto 18
      // 17: athrow
      // 18: checkcast net/minecraft/class_2923
      // 1b: astore 2
      // 1c: invokestatic qeaa361f143ee4a0894bd168fd9b30c66/qf4ccf8f5435d4a78bdca4d6a018b578e/abbabbaa.abb ()Lqeaa361f143ee4a0894bd168fd9b30c66/qf4ccf8f5435d4a78bdca4d6a018b578e/abbabbaa;
      // 1f: astore 3
      // 20: aload 3
      // 21: aload 2
      // 22: invokevirtual net/minecraft/class_2923.comp_2201 ()J
      // 25: invokevirtual qeaa361f143ee4a0894bd168fd9b30c66/qf4ccf8f5435d4a78bdca4d6a018b578e/abbabbaa.aaba (J)V
      // 28: aload 3
      // 29: aload 2
      // 2a: invokevirtual qeaa361f143ee4a0894bd168fd9b30c66/qf4ccf8f5435d4a78bdca4d6a018b578e/abbabbaa.aaaba (Lnet/minecraft/class_2923;)V
      // 2d: return
   }

   private aababbab abbba(Object var1, ChannelPromise var2) {
      return new aababbab(var1, var2, System.nanoTime(), this.abbaa.incrementAndGet());
   }

   public static void abbbb() {
      a = null;
   }

   private void baaaa(ChannelHandlerContext var1, long var2) {
      this.baabab(var1, var2);
   }

   private static boolean baaab() {
      int var10000 = baaabbaa.bba;
      class_310 var1 = class_310.method_1551();
      int var0 = var10000;

      label27: {
         try {
            var4 = var1;
            if (var0 != 0) {
               break label27;
            }

            if (var1 == null) {
               return false;
            }
         } catch (CancellationException var3) {
            throw var3;
         }

         var4 = var1;
      }

      try {
         if (var4.field_1755 != null) {
            return true;
         }
      } catch (CancellationException var2) {
         throw var2;
      }

      return false;
   }

   private long baaba(long param1, long param3, long param5) {
      // $VF: Couldn't be decompiled
      // Please report this to the Vineflower issue tracker, at https://github.com/Vineflower/vineflower/issues with a copy of the class file (if you have the rights to distribute it!)
      // java.lang.RuntimeException: parsing failure!
      //   at org.jetbrains.java.decompiler.modules.decompiler.decompose.DomHelper.parseGraph(DomHelper.java:211)
      //   at org.jetbrains.java.decompiler.main.rels.MethodProcessor.codeToJava(MethodProcessor.java:166)
      //
      // Bytecode:
      // 00: getstatic qeaa361f143ee4a0894bd168fd9b30c66/qf4ccf8f5435d4a78bdca4d6a018b578e/baaabbaa.bba I
      // 03: istore 7
      // 05: lload 1
      // 06: iload 7
      // 08: ifne 21
      // 0b: lconst_0
      // 0c: lcmp
      // 0d: ifgt 17
      // 10: goto 14
      // 13: athrow
      // 14: lconst_0
      // 15: lreturn
      // 16: athrow
      // 17: lconst_0
      // 18: lload 1
      // 19: lload 3
      // 1a: ladd
      // 1b: lload 5
      // 1d: lsub
      // 1e: invokestatic java/lang/Math.max (JJ)J
      // 21: lreturn
   }

   private void baabb(ChannelHandlerContext param1) {
      // $VF: Couldn't be decompiled
      // Please report this to the Vineflower issue tracker, at https://github.com/Vineflower/vineflower/issues with a copy of the class file (if you have the rights to distribute it!)
      // java.lang.RuntimeException: parsing failure!
      //   at org.jetbrains.java.decompiler.modules.decompiler.decompose.DomHelper.parseGraph(DomHelper.java:211)
      //   at org.jetbrains.java.decompiler.main.rels.MethodProcessor.codeToJava(MethodProcessor.java:166)
      //
      // Bytecode:
      // 00: getstatic qeaa361f143ee4a0894bd168fd9b30c66/qf4ccf8f5435d4a78bdca4d6a018b578e/baaabbaa.bba I
      // 03: invokestatic qeaa361f143ee4a0894bd168fd9b30c66/qf4ccf8f5435d4a78bdca4d6a018b578e/abbabbaa.abb ()Lqeaa361f143ee4a0894bd168fd9b30c66/qf4ccf8f5435d4a78bdca4d6a018b578e/abbabbaa;
      // 06: astore 3
      // 07: istore 2
      // 08: getstatic qeaa361f143ee4a0894bd168fd9b30c66/qf4ccf8f5435d4a78bdca4d6a018b578e/aabaaa.baaba Z
      // 0b: iload 2
      // 0c: ifne 26
      // 0f: ifne 30
      // 12: goto 16
      // 15: athrow
      // 16: aload 3
      // 17: iload 2
      // 18: ifne 2a
      // 1b: goto 1f
      // 1e: athrow
      // 1f: invokevirtual qeaa361f143ee4a0894bd168fd9b30c66/qf4ccf8f5435d4a78bdca4d6a018b578e/abbabbaa.aaab ()Z
      // 22: goto 26
      // 25: athrow
      // 26: ifne 32
      // 29: aload 3
      // 2a: invokevirtual qeaa361f143ee4a0894bd168fd9b30c66/qf4ccf8f5435d4a78bdca4d6a018b578e/abbabbaa.a ()Z
      // 2d: ifne 32
      // 30: return
      // 31: athrow
      // 32: invokestatic qeaa361f143ee4a0894bd168fd9b30c66/qf4ccf8f5435d4a78bdca4d6a018b578e/aabaaa.aabaabb ()V
      // 35: return
   }

   private void babaa(ChannelHandlerContext param1) {
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
      // 06: istore 2
      // 07: aload 0
      // 08: getfield qeaa361f143ee4a0894bd168fd9b30c66/qf4ccf8f5435d4a78bdca4d6a018b578e/aabaaa.aba Ljava/util/concurrent/ConcurrentLinkedQueue;
      // 0b: invokevirtual java/util/concurrent/ConcurrentLinkedQueue.poll ()Ljava/lang/Object;
      // 0e: checkcast qeaa361f143ee4a0894bd168fd9b30c66/qf4ccf8f5435d4a78bdca4d6a018b578e/ababbb
      // 11: dup
      // 12: astore 3
      // 13: ifnull 30
      // 16: iload 4
      // 18: iload 2
      // 19: ifne 32
      // 1c: aload 0
      // 1d: aload 1
      // 1e: aload 3
      // 1f: getfield qeaa361f143ee4a0894bd168fd9b30c66/qf4ccf8f5435d4a78bdca4d6a018b578e/ababbb.bb Ljava/lang/Object;
      // 22: aload 3
      // 23: getfield qeaa361f143ee4a0894bd168fd9b30c66/qf4ccf8f5435d4a78bdca4d6a018b578e/ababbb.ab Lio/netty/channel/ChannelPromise;
      // 26: invokevirtual qeaa361f143ee4a0894bd168fd9b30c66/qf4ccf8f5435d4a78bdca4d6a018b578e/aabaaa.abbaabb (Lio/netty/channel/ChannelHandlerContext;Ljava/lang/Object;Lio/netty/channel/ChannelPromise;)Z
      // 29: ior
      // 2a: istore 4
      // 2c: iload 2
      // 2d: ifeq 07
      // 30: iload 4
      // 32: iload 2
      // 33: ifne 54
      // 36: ifeq 62
      // 39: goto 3d
      // 3c: athrow
      // 3d: aload 1
      // 3e: iload 2
      // 3f: ifne 61
      // 42: goto 46
      // 45: athrow
      // 46: invokeinterface io/netty/channel/ChannelHandlerContext.channel ()Lio/netty/channel/Channel; 1
      // 4b: invokeinterface io/netty/channel/Channel.isOpen ()Z 1
      // 50: goto 54
      // 53: athrow
      // 54: ifeq 62
      // 57: aload 1
      // 58: invokeinterface io/netty/channel/ChannelHandlerContext.flush ()Lio/netty/channel/ChannelHandlerContext; 1
      // 5d: goto 61
      // 60: athrow
      // 61: pop
      // 62: return
   }

   private static void babab() {
      aabaa.clear();
      aaaaab = false;
      babbb.clear();
   }

   private static class_2886 babba(class_2886 param0) {
      // $VF: Couldn't be decompiled
      // Please report this to the Vineflower issue tracker, at https://github.com/Vineflower/vineflower/issues with a copy of the class file (if you have the rights to distribute it!)
      // java.lang.RuntimeException: parsing failure!
      //   at org.jetbrains.java.decompiler.modules.decompiler.decompose.DomHelper.parseGraph(DomHelper.java:211)
      //   at org.jetbrains.java.decompiler.main.rels.MethodProcessor.codeToJava(MethodProcessor.java:166)
      //
      // Bytecode:
      // 00: getstatic qeaa361f143ee4a0894bd168fd9b30c66/qf4ccf8f5435d4a78bdca4d6a018b578e/baaabbaa.bba I
      // 03: getstatic qeaa361f143ee4a0894bd168fd9b30c66/qf4ccf8f5435d4a78bdca4d6a018b578e/aabaaa.babba Ljava/util/concurrent/ConcurrentHashMap;
      // 06: new qeaa361f143ee4a0894bd168fd9b30c66/qf4ccf8f5435d4a78bdca4d6a018b578e/baaa
      // 09: dup
      // 0a: aload 0
      // 0b: invokespecial qeaa361f143ee4a0894bd168fd9b30c66/qf4ccf8f5435d4a78bdca4d6a018b578e/baaa.<init> (Lnet/minecraft/class_2596;)V
      // 0e: invokevirtual java/util/concurrent/ConcurrentHashMap.get (Ljava/lang/Object;)Ljava/lang/Object;
      // 11: checkcast [F
      // 14: astore 2
      // 15: istore 1
      // 16: aload 2
      // 17: iload 1
      // 18: ifne 23
      // 1b: ifnull 2f
      // 1e: goto 22
      // 21: athrow
      // 22: aload 2
      // 23: bipush 0
      // 24: faload
      // 25: fstore 3
      // 26: iload 1
      // 27: aload 2
      // 28: bipush 1
      // 29: faload
      // 2a: fstore 4
      // 2c: ifeq 76
      // 2f: aload 0
      // 30: invokevirtual net/minecraft/class_2886.method_60586 ()F
      // 33: invokestatic qeaa361f143ee4a0894bd168fd9b30c66/qf4ccf8f5435d4a78bdca4d6a018b578e/bbabbbb.bbaab (F)F
      // 36: fstore 3
      // 37: aload 0
      // 38: invokevirtual net/minecraft/class_2886.method_60587 ()F
      // 3b: invokestatic qeaa361f143ee4a0894bd168fd9b30c66/qf4ccf8f5435d4a78bdca4d6a018b578e/bbabbbb.aaabbb (F)F
      // 3e: fstore 4
      // 40: fload 3
      // 41: iload 1
      // 42: ifne 55
      // 45: invokestatic java/lang/Float.isFinite (F)Z
      // 48: ifeq 63
      // 4b: goto 4f
      // 4e: athrow
      // 4f: fload 4
      // 51: goto 55
      // 54: athrow
      // 55: iload 1
      // 56: ifne 74
      // 59: invokestatic java/lang/Float.isFinite (F)Z
      // 5c: ifne 66
      // 5f: goto 63
      // 62: athrow
      // 63: aload 0
      // 64: areturn
      // 65: athrow
      // 66: ldc_w -90.0
      // 69: ldc_w 90.0
      // 6c: fload 4
      // 6e: invokestatic java/lang/Math.min (FF)F
      // 71: invokestatic java/lang/Math.max (FF)F
      // 74: fstore 4
      // 76: aload 0
      // 77: iload 1
      // 78: ifne c0
      // 7b: invokevirtual net/minecraft/class_2886.method_60586 ()F
      // 7e: fload 3
      // 7f: fsub
      // 80: invokestatic java/lang/Math.abs (F)F
      // 83: ldc_w 1.0E-4
      // 86: fcmpg
      // 87: ifgt ae
      // 8a: goto 8e
      // 8d: athrow
      // 8e: aload 0
      // 8f: iload 1
      // 90: ifne c0
      // 93: goto 97
      // 96: athrow
      // 97: invokevirtual net/minecraft/class_2886.method_60587 ()F
      // 9a: fload 4
      // 9c: fsub
      // 9d: invokestatic java/lang/Math.abs (F)F
      // a0: ldc_w 1.0E-4
      // a3: fcmpg
      // a4: ifgt ae
      // a7: goto ab
      // aa: athrow
      // ab: aload 0
      // ac: areturn
      // ad: athrow
      // ae: new net/minecraft/class_2886
      // b1: dup
      // b2: aload 0
      // b3: invokevirtual net/minecraft/class_2886.method_12551 ()Lnet/minecraft/class_1268;
      // b6: aload 0
      // b7: invokevirtual net/minecraft/class_2886.method_42081 ()I
      // ba: fload 3
      // bb: fload 4
      // bd: invokespecial net/minecraft/class_2886.<init> (Lnet/minecraft/class_1268;IFF)V
      // c0: astore 5
      // c2: iload 1
      // c3: ifne e1
      // c6: aload 2
      // c7: ifnull f2
      // ca: goto ce
      // cd: athrow
      // ce: getstatic qeaa361f143ee4a0894bd168fd9b30c66/qf4ccf8f5435d4a78bdca4d6a018b578e/aabaaa.babba Ljava/util/concurrent/ConcurrentHashMap;
      // d1: new qeaa361f143ee4a0894bd168fd9b30c66/qf4ccf8f5435d4a78bdca4d6a018b578e/baaa
      // d4: dup
      // d5: aload 0
      // d6: invokespecial qeaa361f143ee4a0894bd168fd9b30c66/qf4ccf8f5435d4a78bdca4d6a018b578e/baaa.<init> (Lnet/minecraft/class_2596;)V
      // d9: invokevirtual java/util/concurrent/ConcurrentHashMap.remove (Ljava/lang/Object;)Ljava/lang/Object;
      // dc: pop
      // dd: goto e1
      // e0: athrow
      // e1: getstatic qeaa361f143ee4a0894bd168fd9b30c66/qf4ccf8f5435d4a78bdca4d6a018b578e/aabaaa.babba Ljava/util/concurrent/ConcurrentHashMap;
      // e4: new qeaa361f143ee4a0894bd168fd9b30c66/qf4ccf8f5435d4a78bdca4d6a018b578e/baaa
      // e7: dup
      // e8: aload 5
      // ea: invokespecial qeaa361f143ee4a0894bd168fd9b30c66/qf4ccf8f5435d4a78bdca4d6a018b578e/baaa.<init> (Lnet/minecraft/class_2596;)V
      // ed: aload 2
      // ee: invokevirtual java/util/concurrent/ConcurrentHashMap.put (Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;
      // f1: pop
      // f2: aload 5
      // f4: areturn
   }

   private void babbb() {
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
      // 05: aload 0
      // 06: getfield qeaa361f143ee4a0894bd168fd9b30c66/qf4ccf8f5435d4a78bdca4d6a018b578e/aabaaa.ba Lio/netty/channel/ChannelHandlerContext;
      // 09: astore 2
      // 0a: ifne 24
      // 0d: aload 2
      // 0e: ifnonnull 1e
      // 11: goto 15
      // 14: athrow
      // 15: aload 0
      // 16: getfield qeaa361f143ee4a0894bd168fd9b30c66/qf4ccf8f5435d4a78bdca4d6a018b578e/aabaaa.abb Ljava/util/concurrent/ConcurrentLinkedQueue;
      // 19: invokevirtual java/util/concurrent/ConcurrentLinkedQueue.clear ()V
      // 1c: return
      // 1d: athrow
      // 1e: aload 0
      // 1f: aload 2
      // 20: lconst_0
      // 21: invokevirtual qeaa361f143ee4a0894bd168fd9b30c66/qf4ccf8f5435d4a78bdca4d6a018b578e/aabaaa.aaabba (Lio/netty/channel/ChannelHandlerContext;J)V
      // 24: return
   }

   public static long bbaaa() {
      return bbbba;
   }

   private void bbaab(ChannelHandlerContext param1) {
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
      // 05: getfield qeaa361f143ee4a0894bd168fd9b30c66/qf4ccf8f5435d4a78bdca4d6a018b578e/aabaaa.abb Ljava/util/concurrent/ConcurrentLinkedQueue;
      // 08: invokevirtual java/util/concurrent/ConcurrentLinkedQueue.poll ()Ljava/lang/Object;
      // 0b: checkcast qeaa361f143ee4a0894bd168fd9b30c66/qf4ccf8f5435d4a78bdca4d6a018b578e/abbbbaaaa
      // 0e: dup
      // 0f: astore 3
      // 10: ifnull 3f
      // 13: iload 2
      // 14: ifne 47
      // 17: aload 1
      // 18: iload 2
      // 19: ifne 34
      // 1c: goto 20
      // 1f: athrow
      // 20: invokeinterface io/netty/channel/ChannelHandlerContext.channel ()Lio/netty/channel/Channel; 1
      // 25: invokeinterface io/netty/channel/Channel.isOpen ()Z 1
      // 2a: ifeq 04
      // 2d: goto 31
      // 30: athrow
      // 31: aload 0
      // 32: pop
      // 33: aload 1
      // 34: aload 3
      // 35: getfield qeaa361f143ee4a0894bd168fd9b30c66/qf4ccf8f5435d4a78bdca4d6a018b578e/abbbbaaaa.b Ljava/lang/Object;
      // 38: invokestatic qeaa361f143ee4a0894bd168fd9b30c66/qf4ccf8f5435d4a78bdca4d6a018b578e/aabaaa.aabaaa (Lio/netty/channel/ChannelHandlerContext;Ljava/lang/Object;)V
      // 3b: iload 2
      // 3c: ifeq 04
      // 3f: aload 0
      // 40: getfield qeaa361f143ee4a0894bd168fd9b30c66/qf4ccf8f5435d4a78bdca4d6a018b578e/aabaaa.babab Ljava/util/concurrent/atomic/AtomicBoolean;
      // 43: bipush 0
      // 44: invokevirtual java/util/concurrent/atomic/AtomicBoolean.set (Z)V
      // 47: return
   }

   private static boolean bbaba(class_2596 var0) {
      return false;
   }

   private void bbabb(ChannelHandlerContext param1) {
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
      // 05: getfield qeaa361f143ee4a0894bd168fd9b30c66/qf4ccf8f5435d4a78bdca4d6a018b578e/aabaaa.bbab Ljava/util/concurrent/ConcurrentLinkedQueue;
      // 08: invokevirtual java/util/concurrent/ConcurrentLinkedQueue.peek ()Ljava/lang/Object;
      // 0b: checkcast qeaa361f143ee4a0894bd168fd9b30c66/qf4ccf8f5435d4a78bdca4d6a018b578e/aababbab
      // 0e: astore 3
      // 0f: iload 2
      // 10: ifne 27
      // 13: aload 3
      // 14: ifnonnull 28
      // 17: goto 1b
      // 1a: athrow
      // 1b: aload 0
      // 1c: getfield qeaa361f143ee4a0894bd168fd9b30c66/qf4ccf8f5435d4a78bdca4d6a018b578e/aabaaa.aaaabb Ljava/util/concurrent/atomic/AtomicBoolean;
      // 1f: bipush 0
      // 20: invokevirtual java/util/concurrent/atomic/AtomicBoolean.set (Z)V
      // 23: goto 27
      // 26: athrow
      // 27: return
      // 28: aload 0
      // 29: aload 3
      // 2a: getfield qeaa361f143ee4a0894bd168fd9b30c66/qf4ccf8f5435d4a78bdca4d6a018b578e/aababbab.a J
      // 2d: aload 0
      // 2e: aload 3
      // 2f: invokevirtual qeaa361f143ee4a0894bd168fd9b30c66/qf4ccf8f5435d4a78bdca4d6a018b578e/aabaaa.bab (Lqeaa361f143ee4a0894bd168fd9b30c66/qf4ccf8f5435d4a78bdca4d6a018b578e/aababbab;)J
      // 32: invokevirtual qeaa361f143ee4a0894bd168fd9b30c66/qf4ccf8f5435d4a78bdca4d6a018b578e/aabaaa.ababbbb (JJ)J
      // 35: lstore 4
      // 37: iload 2
      // 38: ifne 66
      // 3b: lload 4
      // 3d: lconst_0
      // 3e: lcmp
      // 3f: ifle 56
      // 42: goto 46
      // 45: athrow
      // 46: aload 0
      // 47: getfield qeaa361f143ee4a0894bd168fd9b30c66/qf4ccf8f5435d4a78bdca4d6a018b578e/aabaaa.aaaabb Ljava/util/concurrent/atomic/AtomicBoolean;
      // 4a: bipush 0
      // 4b: invokevirtual java/util/concurrent/atomic/AtomicBoolean.set (Z)V
      // 4e: aload 0
      // 4f: aload 1
      // 50: lload 4
      // 52: invokevirtual qeaa361f143ee4a0894bd168fd9b30c66/qf4ccf8f5435d4a78bdca4d6a018b578e/aabaaa.b (Lio/netty/channel/ChannelHandlerContext;J)V
      // 55: return
      // 56: aload 0
      // 57: getfield qeaa361f143ee4a0894bd168fd9b30c66/qf4ccf8f5435d4a78bdca4d6a018b578e/aabaaa.bbab Ljava/util/concurrent/ConcurrentLinkedQueue;
      // 5a: iload 2
      // 5b: ifne 9c
      // 5e: invokevirtual java/util/concurrent/ConcurrentLinkedQueue.poll ()Ljava/lang/Object;
      // 61: pop
      // 62: goto 66
      // 65: athrow
      // 66: aload 0
      // 67: aload 1
      // 68: aload 3
      // 69: getfield qeaa361f143ee4a0894bd168fd9b30c66/qf4ccf8f5435d4a78bdca4d6a018b578e/aababbab.aa Ljava/lang/Object;
      // 6c: aload 3
      // 6d: getfield qeaa361f143ee4a0894bd168fd9b30c66/qf4ccf8f5435d4a78bdca4d6a018b578e/aababbab.ab Lio/netty/channel/ChannelPromise;
      // 70: invokevirtual qeaa361f143ee4a0894bd168fd9b30c66/qf4ccf8f5435d4a78bdca4d6a018b578e/aabaaa.abbaabb (Lio/netty/channel/ChannelHandlerContext;Ljava/lang/Object;Lio/netty/channel/ChannelPromise;)Z
      // 73: ifeq 88
      // 76: aload 1
      // 77: invokeinterface io/netty/channel/ChannelHandlerContext.flush ()Lio/netty/channel/ChannelHandlerContext; 1
      // 7c: pop
      // 7d: aload 0
      // 7e: invokestatic java/lang/System.nanoTime ()J
      // 81: putfield qeaa361f143ee4a0894bd168fd9b30c66/qf4ccf8f5435d4a78bdca4d6a018b578e/aabaaa.aabbb J
      // 84: goto 88
      // 87: athrow
      // 88: aload 0
      // 89: iload 2
      // 8a: ifne a7
      // 8d: getfield qeaa361f143ee4a0894bd168fd9b30c66/qf4ccf8f5435d4a78bdca4d6a018b578e/aabaaa.aaaabb Ljava/util/concurrent/atomic/AtomicBoolean;
      // 90: bipush 0
      // 91: invokevirtual java/util/concurrent/atomic/AtomicBoolean.set (Z)V
      // 94: aload 0
      // 95: getfield qeaa361f143ee4a0894bd168fd9b30c66/qf4ccf8f5435d4a78bdca4d6a018b578e/aabaaa.bbab Ljava/util/concurrent/ConcurrentLinkedQueue;
      // 98: goto 9c
      // 9b: athrow
      // 9c: invokevirtual java/util/concurrent/ConcurrentLinkedQueue.isEmpty ()Z
      // 9f: ifne ab
      // a2: aload 0
      // a3: goto a7
      // a6: athrow
      // a7: aload 1
      // a8: invokevirtual qeaa361f143ee4a0894bd168fd9b30c66/qf4ccf8f5435d4a78bdca4d6a018b578e/aabaaa.bbbbab (Lio/netty/channel/ChannelHandlerContext;)V
      // ab: goto b9
      // ae: astore 3
      // af: aload 0
      // b0: getfield qeaa361f143ee4a0894bd168fd9b30c66/qf4ccf8f5435d4a78bdca4d6a018b578e/aabaaa.aaaabb Ljava/util/concurrent/atomic/AtomicBoolean;
      // b3: bipush 0
      // b4: invokevirtual java/util/concurrent/atomic/AtomicBoolean.set (Z)V
      // b7: aload 3
      // b8: athrow
      // b9: return
   }

   public static void bbbaa(Predicate var0, Consumer var1, Predicate var2) {
      aabbabb(var0, var1, var2, aabaaa::abbabaa);
   }

   private void bbbab(ChannelHandlerContext param1) {
      // $VF: Couldn't be decompiled
      // Please report this to the Vineflower issue tracker, at https://github.com/Vineflower/vineflower/issues with a copy of the class file (if you have the rights to distribute it!)
      // java.lang.RuntimeException: parsing failure!
      //   at org.jetbrains.java.decompiler.modules.decompiler.decompose.DomHelper.parseGraph(DomHelper.java:211)
      //   at org.jetbrains.java.decompiler.main.rels.MethodProcessor.codeToJava(MethodProcessor.java:166)
      //
      // Bytecode:
      // 00: getstatic qeaa361f143ee4a0894bd168fd9b30c66/qf4ccf8f5435d4a78bdca4d6a018b578e/baaabbaa.bba I
      // 03: aload 0
      // 04: getfield qeaa361f143ee4a0894bd168fd9b30c66/qf4ccf8f5435d4a78bdca4d6a018b578e/aabaaa.bbaa [F
      // 07: astore 3
      // 08: istore 2
      // 09: aload 3
      // 0a: ifnull 20
      // 0d: aload 0
      // 0e: iload 2
      // 0f: ifne 30
      // 12: goto 16
      // 15: athrow
      // 16: getfield qeaa361f143ee4a0894bd168fd9b30c66/qf4ccf8f5435d4a78bdca4d6a018b578e/aabaaa.abbaaa Z
      // 19: ifeq 22
      // 1c: goto 20
      // 1f: athrow
      // 20: return
      // 21: athrow
      // 22: aload 0
      // 23: iload 2
      // 24: ifne 3b
      // 27: aconst_null
      // 28: putfield qeaa361f143ee4a0894bd168fd9b30c66/qf4ccf8f5435d4a78bdca4d6a018b578e/aabaaa.bbaa [F
      // 2b: aload 0
      // 2c: goto 30
      // 2f: athrow
      // 30: getfield qeaa361f143ee4a0894bd168fd9b30c66/qf4ccf8f5435d4a78bdca4d6a018b578e/aabaaa.aabbbb Z
      // 33: ifeq 99
      // 36: aload 0
      // 37: goto 3b
      // 3a: athrow
      // 3b: getfield qeaa361f143ee4a0894bd168fd9b30c66/qf4ccf8f5435d4a78bdca4d6a018b578e/aabaaa.abaaba Z
      // 3e: iload 2
      // 3f: ifne 5b
      // 42: ifeq 99
      // 45: goto 49
      // 48: athrow
      // 49: aload 3
      // 4a: bipush 0
      // 4b: faload
      // 4c: iload 2
      // 4d: ifne 65
      // 50: goto 54
      // 53: athrow
      // 54: invokestatic java/lang/Float.isFinite (F)Z
      // 57: goto 5b
      // 5a: athrow
      // 5b: ifeq 99
      // 5e: aload 3
      // 5f: bipush 1
      // 60: faload
      // 61: goto 65
      // 64: athrow
      // 65: iload 2
      // 66: ifne 7b
      // 69: invokestatic java/lang/Float.isFinite (F)Z
      // 6c: ifeq 99
      // 6f: goto 73
      // 72: athrow
      // 73: aload 0
      // 74: getfield qeaa361f143ee4a0894bd168fd9b30c66/qf4ccf8f5435d4a78bdca4d6a018b578e/aabaaa.ababab F
      // 77: goto 7b
      // 7a: athrow
      // 7b: aload 3
      // 7c: bipush 0
      // 7d: faload
      // 7e: iload 2
      // 7f: ifne 95
      // 82: fcmpl
      // 83: ifne 9b
      // 86: goto 8a
      // 89: athrow
      // 8a: aload 0
      // 8b: getfield qeaa361f143ee4a0894bd168fd9b30c66/qf4ccf8f5435d4a78bdca4d6a018b578e/aabaaa.abaabb F
      // 8e: aload 3
      // 8f: bipush 1
      // 90: faload
      // 91: goto 95
      // 94: athrow
      // 95: fcmpl
      // 96: ifne 9b
      // 99: return
      // 9a: athrow
      // 9b: new net/minecraft/class_2828$class_2831
      // 9e: dup
      // 9f: aload 3
      // a0: bipush 0
      // a1: faload
      // a2: aload 3
      // a3: bipush 1
      // a4: faload
      // a5: aload 0
      // a6: getfield qeaa361f143ee4a0894bd168fd9b30c66/qf4ccf8f5435d4a78bdca4d6a018b578e/aabaaa.bbbb Z
      // a9: aload 0
      // aa: getfield qeaa361f143ee4a0894bd168fd9b30c66/qf4ccf8f5435d4a78bdca4d6a018b578e/aabaaa.b Z
      // ad: invokespecial net/minecraft/class_2828$class_2831.<init> (FFZZ)V
      // b0: astore 4
      // b2: aload 0
      // b3: aload 3
      // b4: bipush 0
      // b5: faload
      // b6: putfield qeaa361f143ee4a0894bd168fd9b30c66/qf4ccf8f5435d4a78bdca4d6a018b578e/aabaaa.ababab F
      // b9: aload 0
      // ba: aload 3
      // bb: bipush 1
      // bc: faload
      // bd: putfield qeaa361f143ee4a0894bd168fd9b30c66/qf4ccf8f5435d4a78bdca4d6a018b578e/aabaaa.abaabb F
      // c0: aload 4
      // c2: invokestatic qeaa361f143ee4a0894bd168fd9b30c66/qf4ccf8f5435d4a78bdca4d6a018b578e/abbaabaaa.aaab (Ljava/lang/Object;)V
      // c5: aload 1
      // c6: invokeinterface io/netty/channel/ChannelHandlerContext.newPromise ()Lio/netty/channel/ChannelPromise; 1
      // cb: astore 5
      // cd: aload 5
      // cf: aload 0
      // d0: aload 4
      // d2: invokedynamic operationComplete (Lqeaa361f143ee4a0894bd168fd9b30c66/qf4ccf8f5435d4a78bdca4d6a018b578e/aabaaa;Lnet/minecraft/class_2828;)Lio/netty/util/concurrent/GenericFutureListener; bsm=java/lang/invoke/LambdaMetafactory.metafactory (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;Ljava/lang/invoke/MethodType;Ljava/lang/invoke/MethodHandle;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[ (Lio/netty/util/concurrent/Future;)V, qeaa361f143ee4a0894bd168fd9b30c66/qf4ccf8f5435d4a78bdca4d6a018b578e/aabaaa.aaaaab (Lnet/minecraft/class_2828;Lio/netty/util/concurrent/Future;)V, (Lio/netty/util/concurrent/Future;)V ]
      // d7: invokeinterface io/netty/channel/ChannelPromise.addListener (Lio/netty/util/concurrent/GenericFutureListener;)Lio/netty/channel/ChannelPromise; 2
      // dc: pop
      // dd: aload 1
      // de: aload 4
      // e0: aload 5
      // e2: invokeinterface io/netty/channel/ChannelHandlerContext.write (Ljava/lang/Object;Lio/netty/channel/ChannelPromise;)Lio/netty/channel/ChannelFuture; 3
      // e7: pop
      // e8: return
   }

   private void bbbba(aaaabbaa param1) {
      // $VF: Couldn't be decompiled
      // Please report this to the Vineflower issue tracker, at https://github.com/Vineflower/vineflower/issues with a copy of the class file (if you have the rights to distribute it!)
      // java.lang.RuntimeException: parsing failure!
      //   at org.jetbrains.java.decompiler.modules.decompiler.decompose.DomHelper.parseGraph(DomHelper.java:211)
      //   at org.jetbrains.java.decompiler.main.rels.MethodProcessor.codeToJava(MethodProcessor.java:166)
      //
      // Bytecode:
      // 00: getstatic qeaa361f143ee4a0894bd168fd9b30c66/qf4ccf8f5435d4a78bdca4d6a018b578e/baaabbaa.bba I
      // 03: aload 0
      // 04: getfield qeaa361f143ee4a0894bd168fd9b30c66/qf4ccf8f5435d4a78bdca4d6a018b578e/aabaaa.ba Lio/netty/channel/ChannelHandlerContext;
      // 07: astore 3
      // 08: istore 2
      // 09: aload 3
      // 0a: ifnonnull 46
      // 0d: aload 1
      // 0e: iload 2
      // 0f: ifne 34
      // 12: goto 16
      // 15: athrow
      // 16: invokevirtual qeaa361f143ee4a0894bd168fd9b30c66/qf4ccf8f5435d4a78bdca4d6a018b578e/aaaabbaa.a ()Z
      // 19: ifeq 33
      // 1c: goto 20
      // 1f: athrow
      // 20: aload 0
      // 21: aload 0
      // 22: getfield qeaa361f143ee4a0894bd168fd9b30c66/qf4ccf8f5435d4a78bdca4d6a018b578e/aabaaa.aba Ljava/util/concurrent/ConcurrentLinkedQueue;
      // 25: new java/nio/channels/ClosedChannelException
      // 28: dup
      // 29: invokespecial java/nio/channels/ClosedChannelException.<init> ()V
      // 2c: invokevirtual qeaa361f143ee4a0894bd168fd9b30c66/qf4ccf8f5435d4a78bdca4d6a018b578e/aabaaa.bba (Ljava/util/concurrent/ConcurrentLinkedQueue;Ljava/lang/Throwable;)V
      // 2f: goto 33
      // 32: athrow
      // 33: aload 1
      // 34: invokevirtual qeaa361f143ee4a0894bd168fd9b30c66/qf4ccf8f5435d4a78bdca4d6a018b578e/aaaabbaa.b ()Z
      // 37: ifeq 45
      // 3a: aload 0
      // 3b: getfield qeaa361f143ee4a0894bd168fd9b30c66/qf4ccf8f5435d4a78bdca4d6a018b578e/aabaaa.abb Ljava/util/concurrent/ConcurrentLinkedQueue;
      // 3e: invokevirtual java/util/concurrent/ConcurrentLinkedQueue.clear ()V
      // 41: goto 45
      // 44: athrow
      // 45: return
      // 46: aload 0
      // 47: aload 1
      // 48: aload 3
      // 49: invokedynamic run (Lqeaa361f143ee4a0894bd168fd9b30c66/qf4ccf8f5435d4a78bdca4d6a018b578e/aabaaa;Lqeaa361f143ee4a0894bd168fd9b30c66/qf4ccf8f5435d4a78bdca4d6a018b578e/aaaabbaa;Lio/netty/channel/ChannelHandlerContext;)Ljava/lang/Runnable; bsm=java/lang/invoke/LambdaMetafactory.metafactory (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;Ljava/lang/invoke/MethodType;Ljava/lang/invoke/MethodHandle;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[ ()V, qeaa361f143ee4a0894bd168fd9b30c66/qf4ccf8f5435d4a78bdca4d6a018b578e/aabaaa.ababb (Lqeaa361f143ee4a0894bd168fd9b30c66/qf4ccf8f5435d4a78bdca4d6a018b578e/aaaabbaa;Lio/netty/channel/ChannelHandlerContext;)V, ()V ]
      // 4e: astore 4
      // 50: aload 3
      // 51: iload 2
      // 52: ifne 70
      // 55: invokeinterface io/netty/channel/ChannelHandlerContext.executor ()Lio/netty/util/concurrent/EventExecutor; 1
      // 5a: invokeinterface io/netty/util/concurrent/EventExecutor.inEventLoop ()Z 1
      // 5f: ifeq 6f
      // 62: goto 66
      // 65: athrow
      // 66: aload 4
      // 68: invokeinterface java/lang/Runnable.run ()V 1
      // 6d: return
      // 6e: athrow
      // 6f: aload 3
      // 70: invokeinterface io/netty/channel/ChannelHandlerContext.executor ()Lio/netty/util/concurrent/EventExecutor; 1
      // 75: aload 4
      // 77: invokeinterface io/netty/util/concurrent/EventExecutor.submit (Ljava/lang/Runnable;)Lio/netty/util/concurrent/Future; 2
      // 7c: invokeinterface io/netty/util/concurrent/Future.syncUninterruptibly ()Lio/netty/util/concurrent/Future; 1
      // 81: pop
      // 82: return
   }

   private static int baaaaab(int var0, int var1) {
      int var2 = abbaab[var0 ^ -522994203] ^ var1 ^ var0;
      var2 ^= 26593;
      var2 ^= 28813;
      var2 += 57561;
      var2 -= 34327;
      var2 += 22240;
      var2 -= 4582;
      var2 ^= 60336;
      var2 ^= 23196;
      return var2 + 48001;
   }

   private static boolean bbbbb(Object param0) {
      // $VF: Couldn't be decompiled
      // Please report this to the Vineflower issue tracker, at https://github.com/Vineflower/vineflower/issues with a copy of the class file (if you have the rights to distribute it!)
      // java.lang.RuntimeException: parsing failure!
      //   at org.jetbrains.java.decompiler.modules.decompiler.decompose.DomHelper.parseGraph(DomHelper.java:211)
      //   at org.jetbrains.java.decompiler.main.rels.MethodProcessor.codeToJava(MethodProcessor.java:166)
      //
      // Bytecode:
      // 000: ldc_w -1531290647
      // 003: istore 3
      // 004: getstatic qeaa361f143ee4a0894bd168fd9b30c66/qf4ccf8f5435d4a78bdca4d6a018b578e/baaabbaa.bba I
      // 007: istore 1
      // 008: aload 0
      // 009: iload 1
      // 00a: ifne 018
      // 00d: ifnonnull 017
      // 010: goto 014
      // 013: athrow
      // 014: bipush 0
      // 015: ireturn
      // 016: athrow
      // 017: aload 0
      // 018: instanceof net/minecraft/class_3944
      // 01b: iload 1
      // 01c: ifne 0c3
      // 01f: ifne 0be
      // 022: goto 026
      // 025: athrow
      // 026: aload 0
      // 027: instanceof net/minecraft/class_2645
      // 02a: iload 1
      // 02b: ifne 0c3
      // 02e: goto 032
      // 031: athrow
      // 032: ifne 0be
      // 035: goto 039
      // 038: athrow
      // 039: aload 0
      // 03a: instanceof net/minecraft/class_2653
      // 03d: iload 1
      // 03e: ifne 0c3
      // 041: goto 045
      // 044: athrow
      // 045: ifne 0be
      // 048: goto 04c
      // 04b: athrow
      // 04c: aload 0
      // 04d: instanceof net/minecraft/class_2651
      // 050: iload 1
      // 051: ifne 0c3
      // 054: goto 058
      // 057: athrow
      // 058: ifne 0be
      // 05b: goto 05f
      // 05e: athrow
      // 05f: aload 0
      // 060: instanceof net/minecraft/class_2648
      // 063: iload 1
      // 064: ifne 0c3
      // 067: goto 06b
      // 06a: athrow
      // 06b: ifne 0be
      // 06e: goto 072
      // 071: athrow
      // 072: aload 0
      // 073: instanceof net/minecraft/class_2649
      // 076: iload 1
      // 077: ifne 0c3
      // 07a: goto 07e
      // 07d: athrow
      // 07e: ifne 0be
      // 081: goto 085
      // 084: athrow
      // 085: aload 0
      // 086: instanceof net/minecraft/class_9835
      // 089: iload 1
      // 08a: ifne 0c3
      // 08d: goto 091
      // 090: athrow
      // 091: ifne 0be
      // 094: goto 098
      // 097: athrow
      // 098: aload 0
      // 099: instanceof net/minecraft/class_2813
      // 09c: iload 1
      // 09d: ifne 0c3
      // 0a0: goto 0a4
      // 0a3: athrow
      // 0a4: ifne 0be
      // 0a7: goto 0ab
      // 0aa: athrow
      // 0ab: aload 0
      // 0ac: iload 1
      // 0ad: ifne 0c5
      // 0b0: goto 0b4
      // 0b3: athrow
      // 0b4: instanceof net/minecraft/class_2815
      // 0b7: ifeq 0c4
      // 0ba: goto 0be
      // 0bd: athrow
      // 0be: bipush 1
      // 0bf: goto 0c3
      // 0c2: athrow
      // 0c3: ireturn
      // 0c4: aload 0
      // 0c5: invokevirtual java/lang/Object.getClass ()Ljava/lang/Class;
      // 0c8: invokevirtual java/lang/Class.getSimpleName ()Ljava/lang/String;
      // 0cb: astore 2
      // 0cc: aload 2
      // 0cd: ldc_w -522994247
      // 0d0: iload 3
      // 0d1: ldc_w 1031761910
      // 0d4: ixor
      // 0d5: invokestatic qeaa361f143ee4a0894bd168fd9b30c66/qf4ccf8f5435d4a78bdca4d6a018b578e/aabaaa.baaaaab (II)I
      // 0d8: ldc_w -522994248
      // 0db: iload 3
      // 0dc: ldc_w 310558266
      // 0df: ixor
      // 0e0: invokestatic qeaa361f143ee4a0894bd168fd9b30c66/qf4ccf8f5435d4a78bdca4d6a018b578e/aabaaa.baaaaab (II)I
      // 0e3: invokestatic qeaa361f143ee4a0894bd168fd9b30c66/qf4ccf8f5435d4a78bdca4d6a018b578e/aabaaa.aabbaab (II)Ljava/lang/String;
      // 0e6: invokestatic qeaa361f143ee4a0894bd168fd9b30c66/qf4ccf8f5435d4a78bdca4d6a018b578e/aabbaaaba.abba (Ljava/lang/String;)Ljava/lang/String;
      // 0e9: invokevirtual java/lang/String.contains (Ljava/lang/CharSequence;)Z
      // 0ec: iload 1
      // 0ed: ifne 1b4
      // 0f0: ifne 1b3
      // 0f3: goto 0f7
      // 0f6: athrow
      // 0f7: aload 2
      // 0f8: ldc_w -522994245
      // 0fb: iload 3
      // 0fc: ldc_w -1013730211
      // 0ff: ixor
      // 100: invokestatic qeaa361f143ee4a0894bd168fd9b30c66/qf4ccf8f5435d4a78bdca4d6a018b578e/aabaaa.baaaaab (II)I
      // 103: ldc_w -522994246
      // 106: iload 3
      // 107: ldc_w -2036963453
      // 10a: ixor
      // 10b: invokestatic qeaa361f143ee4a0894bd168fd9b30c66/qf4ccf8f5435d4a78bdca4d6a018b578e/aabaaa.baaaaab (II)I
      // 10e: invokestatic qeaa361f143ee4a0894bd168fd9b30c66/qf4ccf8f5435d4a78bdca4d6a018b578e/aabaaa.aabbaab (II)Ljava/lang/String;
      // 111: invokestatic qeaa361f143ee4a0894bd168fd9b30c66/qf4ccf8f5435d4a78bdca4d6a018b578e/aabbaaaba.abba (Ljava/lang/String;)Ljava/lang/String;
      // 114: invokevirtual java/lang/String.contains (Ljava/lang/CharSequence;)Z
      // 117: iload 1
      // 118: ifne 1b4
      // 11b: goto 11f
      // 11e: athrow
      // 11f: ifne 1b3
      // 122: goto 126
      // 125: athrow
      // 126: aload 2
      // 127: ldc_w -522994299
      // 12a: iload 3
      // 12b: ldc_w -886827021
      // 12e: ixor
      // 12f: invokestatic qeaa361f143ee4a0894bd168fd9b30c66/qf4ccf8f5435d4a78bdca4d6a018b578e/aabaaa.baaaaab (II)I
      // 132: ldc_w -522994300
      // 135: iload 3
      // 136: ldc_w -1523705969
      // 139: ixor
      // 13a: invokestatic qeaa361f143ee4a0894bd168fd9b30c66/qf4ccf8f5435d4a78bdca4d6a018b578e/aabaaa.baaaaab (II)I
      // 13d: invokestatic qeaa361f143ee4a0894bd168fd9b30c66/qf4ccf8f5435d4a78bdca4d6a018b578e/aabaaa.aabbaab (II)Ljava/lang/String;
      // 140: invokestatic qeaa361f143ee4a0894bd168fd9b30c66/qf4ccf8f5435d4a78bdca4d6a018b578e/aabbaaaba.abba (Ljava/lang/String;)Ljava/lang/String;
      // 143: invokevirtual java/lang/String.contains (Ljava/lang/CharSequence;)Z
      // 146: iload 1
      // 147: ifne 1b4
      // 14a: goto 14e
      // 14d: athrow
      // 14e: ifne 1b3
      // 151: goto 155
      // 154: athrow
      // 155: aload 2
      // 156: ldc_w -522994297
      // 159: iload 3
      // 15a: ldc_w -247078951
      // 15d: ixor
      // 15e: invokestatic qeaa361f143ee4a0894bd168fd9b30c66/qf4ccf8f5435d4a78bdca4d6a018b578e/aabaaa.baaaaab (II)I
      // 161: ldc_w -522994298
      // 164: iload 3
      // 165: ldc_w -1610168278
      // 168: ixor
      // 169: invokestatic qeaa361f143ee4a0894bd168fd9b30c66/qf4ccf8f5435d4a78bdca4d6a018b578e/aabaaa.baaaaab (II)I
      // 16c: invokestatic qeaa361f143ee4a0894bd168fd9b30c66/qf4ccf8f5435d4a78bdca4d6a018b578e/aabaaa.aabbaab (II)Ljava/lang/String;
      // 16f: invokestatic qeaa361f143ee4a0894bd168fd9b30c66/qf4ccf8f5435d4a78bdca4d6a018b578e/aabbaaaba.abba (Ljava/lang/String;)Ljava/lang/String;
      // 172: invokevirtual java/lang/String.contains (Ljava/lang/CharSequence;)Z
      // 175: iload 1
      // 176: ifne 1b4
      // 179: goto 17d
      // 17c: athrow
      // 17d: ifne 1b3
      // 180: goto 184
      // 183: athrow
      // 184: aload 2
      // 185: ldc_w -522994303
      // 188: iload 3
      // 189: ldc_w 751751427
      // 18c: ixor
      // 18d: invokestatic qeaa361f143ee4a0894bd168fd9b30c66/qf4ccf8f5435d4a78bdca4d6a018b578e/aabaaa.baaaaab (II)I
      // 190: ldc_w -522994304
      // 193: iload 3
      // 194: ldc_w -1434102268
      // 197: ixor
      // 198: invokestatic qeaa361f143ee4a0894bd168fd9b30c66/qf4ccf8f5435d4a78bdca4d6a018b578e/aabaaa.baaaaab (II)I
      // 19b: invokestatic qeaa361f143ee4a0894bd168fd9b30c66/qf4ccf8f5435d4a78bdca4d6a018b578e/aabaaa.aabbaab (II)Ljava/lang/String;
      // 19e: invokestatic qeaa361f143ee4a0894bd168fd9b30c66/qf4ccf8f5435d4a78bdca4d6a018b578e/aabbaaaba.abba (Ljava/lang/String;)Ljava/lang/String;
      // 1a1: invokevirtual java/lang/String.contains (Ljava/lang/CharSequence;)Z
      // 1a4: iload 1
      // 1a5: ifne 1b4
      // 1a8: goto 1ac
      // 1ab: athrow
      // 1ac: ifeq 1b7
      // 1af: goto 1b3
      // 1b2: athrow
      // 1b3: bipush 1
      // 1b4: goto 1b8
      // 1b7: bipush 0
      // 1b8: ireturn
   }

   private static boolean aaaaaa(Object param0) {
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
      // 05: instanceof net/minecraft/class_2824
      // 08: iload 1
      // 09: ifne 86
      // 0c: ifne 85
      // 0f: goto 13
      // 12: athrow
      // 13: aload 0
      // 14: instanceof net/minecraft/class_2885
      // 17: iload 1
      // 18: ifne 86
      // 1b: goto 1f
      // 1e: athrow
      // 1f: ifne 85
      // 22: goto 26
      // 25: athrow
      // 26: aload 0
      // 27: instanceof net/minecraft/class_2886
      // 2a: iload 1
      // 2b: ifne 86
      // 2e: goto 32
      // 31: athrow
      // 32: ifne 85
      // 35: goto 39
      // 38: athrow
      // 39: aload 0
      // 3a: instanceof net/minecraft/class_2846
      // 3d: iload 1
      // 3e: ifne 86
      // 41: goto 45
      // 44: athrow
      // 45: ifne 85
      // 48: goto 4c
      // 4b: athrow
      // 4c: aload 0
      // 4d: instanceof net/minecraft/class_2879
      // 50: iload 1
      // 51: ifne 86
      // 54: goto 58
      // 57: athrow
      // 58: ifne 85
      // 5b: goto 5f
      // 5e: athrow
      // 5f: aload 0
      // 60: instanceof net/minecraft/class_2848
      // 63: iload 1
      // 64: ifne 86
      // 67: goto 6b
      // 6a: athrow
      // 6b: ifne 85
      // 6e: goto 72
      // 71: athrow
      // 72: aload 0
      // 73: instanceof net/minecraft/class_2799
      // 76: iload 1
      // 77: ifne 86
      // 7a: goto 7e
      // 7d: athrow
      // 7e: ifeq 89
      // 81: goto 85
      // 84: athrow
      // 85: bipush 1
      // 86: goto 8a
      // 89: bipush 0
      // 8a: ireturn
   }

   private void aaaaab(class_2828 var1, Future var2) throws Exception {
      try {
         if (var2.isSuccess()) {
            this.abbbabb(var1);
         }
      } catch (Exception var3) {
         throw var3;
      }
   }

   private void aaaaba(ChannelHandlerContext var1, ConcurrentLinkedQueue var2) {
      int var3 = baaabbaa.bba;

      while (true) {
         ababbb var4;
         if ((var4 = (ababbb)var2.poll()) != null) {
            try {
               if (var3 != 0) {
                  break;
               }

               this.abbaabb(var1, var4.bb(), var4.ab());
               if (var3 == 0) {
                  continue;
               }
            } catch (CancellationException var6) {
               throw var6;
            }
         }

         try {
            if (var2 == this.bb) {
               this.aaabab = false;
               bbbaba();
            }
            break;
         } catch (CancellationException var5) {
            throw var5;
         }
      }
   }

   private void aaaabb(ChannelHandlerContext var1) {
      this.abaaab(var1);
   }

   public static void aaabaa() {
      // $VF: Couldn't be decompiled
      // Please report this to the Vineflower issue tracker, at https://github.com/Vineflower/vineflower/issues with a copy of the class file (if you have the rights to distribute it!)
      // java.lang.RuntimeException: parsing failure!
      //   at org.jetbrains.java.decompiler.modules.decompiler.decompose.DomHelper.parseGraph(DomHelper.java:211)
      //   at org.jetbrains.java.decompiler.main.rels.MethodProcessor.codeToJava(MethodProcessor.java:166)
      //
      // Bytecode:
      // 00: getstatic qeaa361f143ee4a0894bd168fd9b30c66/qf4ccf8f5435d4a78bdca4d6a018b578e/baaabbaa.bba I
      // 03: istore 0
      // 04: invokestatic qeaa361f143ee4a0894bd168fd9b30c66/qf4ccf8f5435d4a78bdca4d6a018b578e/abbabaa.aa ()Z
      // 07: ifeq 0c
      // 0a: return
      // 0b: athrow
      // 0c: getstatic qeaa361f143ee4a0894bd168fd9b30c66/qf4ccf8f5435d4a78bdca4d6a018b578e/aabaaa.abbab J
      // 0f: lconst_1
      // 10: ladd
      // 11: putstatic qeaa361f143ee4a0894bd168fd9b30c66/qf4ccf8f5435d4a78bdca4d6a018b578e/aabaaa.abbab J
      // 14: getstatic qeaa361f143ee4a0894bd168fd9b30c66/qf4ccf8f5435d4a78bdca4d6a018b578e/aabaaa.abba Ljava/util/Set;
      // 17: invokeinterface java/util/Set.iterator ()Ljava/util/Iterator; 1
      // 1c: astore 1
      // 1d: aload 1
      // 1e: invokeinterface java/util/Iterator.hasNext ()Z 1
      // 23: ifeq 84
      // 26: aload 1
      // 27: invokeinterface java/util/Iterator.next ()Ljava/lang/Object; 1
      // 2c: checkcast qeaa361f143ee4a0894bd168fd9b30c66/qf4ccf8f5435d4a78bdca4d6a018b578e/aabaaa
      // 2f: astore 2
      // 30: aload 2
      // 31: getfield qeaa361f143ee4a0894bd168fd9b30c66/qf4ccf8f5435d4a78bdca4d6a018b578e/aabaaa.ba Lio/netty/channel/ChannelHandlerContext;
      // 34: astore 3
      // 35: aload 3
      // 36: ifnonnull 41
      // 39: iload 0
      // 3a: ifeq 1d
      // 3d: goto 41
      // 40: athrow
      // 41: aload 2
      // 42: aload 3
      // 43: invokedynamic run (Lqeaa361f143ee4a0894bd168fd9b30c66/qf4ccf8f5435d4a78bdca4d6a018b578e/aabaaa;Lio/netty/channel/ChannelHandlerContext;)Ljava/lang/Runnable; bsm=java/lang/invoke/LambdaMetafactory.metafactory (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;Ljava/lang/invoke/MethodType;Ljava/lang/invoke/MethodHandle;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[ ()V, qeaa361f143ee4a0894bd168fd9b30c66/qf4ccf8f5435d4a78bdca4d6a018b578e/aabaaa.babaab (Lqeaa361f143ee4a0894bd168fd9b30c66/qf4ccf8f5435d4a78bdca4d6a018b578e/aabaaa;Lio/netty/channel/ChannelHandlerContext;)V, ()V ]
      // 48: astore 4
      // 4a: aload 3
      // 4b: iload 0
      // 4c: ifne 74
      // 4f: invokeinterface io/netty/channel/ChannelHandlerContext.executor ()Lio/netty/util/concurrent/EventExecutor; 1
      // 54: invokeinterface io/netty/util/concurrent/EventExecutor.inEventLoop ()Z 1
      // 59: ifeq 6f
      // 5c: goto 60
      // 5f: athrow
      // 60: aload 4
      // 62: invokeinterface java/lang/Runnable.run ()V 1
      // 67: iload 0
      // 68: ifeq 80
      // 6b: goto 6f
      // 6e: athrow
      // 6f: aload 3
      // 70: goto 74
      // 73: athrow
      // 74: invokeinterface io/netty/channel/ChannelHandlerContext.executor ()Lio/netty/util/concurrent/EventExecutor; 1
      // 79: aload 4
      // 7b: invokeinterface io/netty/util/concurrent/EventExecutor.execute (Ljava/lang/Runnable;)V 2
      // 80: iload 0
      // 81: ifeq 1d
      // 84: return
   }

   private static void aaabab(class_2596 param0) {
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
      // 0a: ifne 1a
      // 0d: ifnonnull 19
      // 10: goto 14
      // 13: athrow
      // 14: aconst_null
      // 15: goto 1d
      // 18: athrow
      // 19: aload 2
      // 1a: invokevirtual qeaa361f143ee4a0894bd168fd9b30c66/qf4ccf8f5435d4a78bdca4d6a018b578e/abaaaaaba.aaba ()Lqeaa361f143ee4a0894bd168fd9b30c66/qf4ccf8f5435d4a78bdca4d6a018b578e/babbaba;
      // 1d: astore 3
      // 1e: aload 3
      // 1f: iload 1
      // 20: ifne 2b
      // 23: ifnull 2f
      // 26: goto 2a
      // 29: athrow
      // 2a: aload 3
      // 2b: aload 0
      // 2c: invokevirtual qeaa361f143ee4a0894bd168fd9b30c66/qf4ccf8f5435d4a78bdca4d6a018b578e/babbaba.aabbaab (Lnet/minecraft/class_2596;)V
      // 2f: return
   }

   private void aaabba(ChannelHandlerContext param1, long param2) {
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
      // 08: ifne 1d
      // 0b: getfield qeaa361f143ee4a0894bd168fd9b30c66/qf4ccf8f5435d4a78bdca4d6a018b578e/aabaaa.babab Ljava/util/concurrent/atomic/AtomicBoolean;
      // 0e: bipush 0
      // 0f: bipush 1
      // 10: invokevirtual java/util/concurrent/atomic/AtomicBoolean.compareAndSet (ZZ)Z
      // 13: ifne 1c
      // 16: goto 1a
      // 19: athrow
      // 1a: return
      // 1b: athrow
      // 1c: aload 0
      // 1d: aload 1
      // 1e: invokedynamic run (Lqeaa361f143ee4a0894bd168fd9b30c66/qf4ccf8f5435d4a78bdca4d6a018b578e/aabaaa;Lio/netty/channel/ChannelHandlerContext;)Ljava/lang/Runnable; bsm=java/lang/invoke/LambdaMetafactory.metafactory (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;Ljava/lang/invoke/MethodType;Ljava/lang/invoke/MethodHandle;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[ ()V, qeaa361f143ee4a0894bd168fd9b30c66/qf4ccf8f5435d4a78bdca4d6a018b578e/aabaaa.bbbb (Lio/netty/channel/ChannelHandlerContext;)V, ()V ]
      // 23: astore 5
      // 25: lload 2
      // 26: lconst_0
      // 27: lcmp
      // 28: iload 4
      // 2a: ifne 62
      // 2d: ifle 4e
      // 30: goto 34
      // 33: athrow
      // 34: aload 1
      // 35: invokeinterface io/netty/channel/ChannelHandlerContext.executor ()Lio/netty/util/concurrent/EventExecutor; 1
      // 3a: aload 5
      // 3c: lload 2
      // 3d: getstatic qeaa361f143ee4a0894bd168fd9b30c66/qf4ccf8f5435d4a78bdca4d6a018b578e/aabaaa.abaa J
      // 40: invokestatic java/lang/Math.max (JJ)J
      // 43: getstatic java/util/concurrent/TimeUnit.NANOSECONDS Ljava/util/concurrent/TimeUnit;
      // 46: invokeinterface io/netty/util/concurrent/EventExecutor.schedule (Ljava/lang/Runnable;JLjava/util/concurrent/TimeUnit;)Lio/netty/util/concurrent/ScheduledFuture; 5
      // 4b: pop
      // 4c: return
      // 4d: athrow
      // 4e: aload 1
      // 4f: iload 4
      // 51: ifne 7a
      // 54: invokeinterface io/netty/channel/ChannelHandlerContext.executor ()Lio/netty/util/concurrent/EventExecutor; 1
      // 59: invokeinterface io/netty/util/concurrent/EventExecutor.inEventLoop ()Z 1
      // 5e: goto 62
      // 61: athrow
      // 62: ifeq 75
      // 65: aload 5
      // 67: invokeinterface java/lang/Runnable.run ()V 1
      // 6c: iload 4
      // 6e: ifeq 86
      // 71: goto 75
      // 74: athrow
      // 75: aload 1
      // 76: goto 7a
      // 79: athrow
      // 7a: invokeinterface io/netty/channel/ChannelHandlerContext.executor ()Lio/netty/util/concurrent/EventExecutor; 1
      // 7f: aload 5
      // 81: invokeinterface io/netty/util/concurrent/EventExecutor.execute (Ljava/lang/Runnable;)V 2
      // 86: return
   }

   private void aaabbb(ChannelHandlerContext param1) {
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
      // 09: getfield qeaa361f143ee4a0894bd168fd9b30c66/qf4ccf8f5435d4a78bdca4d6a018b578e/aabaaa.bbb Ljava/util/concurrent/ConcurrentLinkedQueue;
      // 0c: invokevirtual java/util/concurrent/ConcurrentLinkedQueue.isEmpty ()Z
      // 0f: ifne 1f
      // 12: goto 16
      // 15: athrow
      // 16: aload 0
      // 17: goto 1b
      // 1a: athrow
      // 1b: aload 1
      // 1c: invokevirtual qeaa361f143ee4a0894bd168fd9b30c66/qf4ccf8f5435d4a78bdca4d6a018b578e/aabaaa.bbbbbb (Lio/netty/channel/ChannelHandlerContext;)V
      // 1f: goto 25
      // 22: astore 3
      // 23: aload 3
      // 24: pop
      // 25: aload 0
      // 26: invokevirtual qeaa361f143ee4a0894bd168fd9b30c66/qf4ccf8f5435d4a78bdca4d6a018b578e/aabaaa.baaaba ()V
      // 29: return
   }

   public static void aabaaa(ChannelHandlerContext var0, Object var1) {
      abbab(var1);
      aabbaa(var0, var1);
      var0.fireChannelRead(var1);
      bbaaab(var1);
   }

   static void aabaab() {
      ababbba();
   }

   private void aababa(ChannelHandlerContext param1, long param2, abaaaabba param4) {
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
      // 005: aload 4
      // 007: getstatic qeaa361f143ee4a0894bd168fd9b30c66/qf4ccf8f5435d4a78bdca4d6a018b578e/abaaaabba.ba Lqeaa361f143ee4a0894bd168fd9b30c66/qf4ccf8f5435d4a78bdca4d6a018b578e/abaaaabba;
      // 00a: if_acmpne 014
      // 00d: getstatic qeaa361f143ee4a0894bd168fd9b30c66/qf4ccf8f5435d4a78bdca4d6a018b578e/aabaaa.ababba J
      // 010: goto 017
      // 013: athrow
      // 014: getstatic qeaa361f143ee4a0894bd168fd9b30c66/qf4ccf8f5435d4a78bdca4d6a018b578e/aabaaa.aaaab J
      // 017: lstore 6
      // 019: iload 5
      // 01b: invokestatic java/lang/System.nanoTime ()J
      // 01e: lstore 8
      // 020: aload 0
      // 021: aload 0
      // 022: getfield qeaa361f143ee4a0894bd168fd9b30c66/qf4ccf8f5435d4a78bdca4d6a018b578e/aabaaa.aabba J
      // 025: lload 6
      // 027: lload 8
      // 029: invokevirtual qeaa361f143ee4a0894bd168fd9b30c66/qf4ccf8f5435d4a78bdca4d6a018b578e/aabaaa.baaba (JJJ)J
      // 02c: lstore 10
      // 02e: ifne 052
      // 031: lload 10
      // 033: lconst_0
      // 034: lcmp
      // 035: ifle 053
      // 038: goto 03c
      // 03b: athrow
      // 03c: aload 0
      // 03d: getfield qeaa361f143ee4a0894bd168fd9b30c66/qf4ccf8f5435d4a78bdca4d6a018b578e/aabaaa.bbaba Ljava/util/concurrent/atomic/AtomicBoolean;
      // 040: bipush 0
      // 041: invokevirtual java/util/concurrent/atomic/AtomicBoolean.set (Z)V
      // 044: aload 0
      // 045: aload 1
      // 046: lload 2
      // 047: aload 4
      // 049: lload 10
      // 04b: invokevirtual qeaa361f143ee4a0894bd168fd9b30c66/qf4ccf8f5435d4a78bdca4d6a018b578e/aabaaa.abaabaa (Lio/netty/channel/ChannelHandlerContext;JLqeaa361f143ee4a0894bd168fd9b30c66/qf4ccf8f5435d4a78bdca4d6a018b578e/abaaaabba;J)V
      // 04e: goto 052
      // 051: athrow
      // 052: return
      // 053: aload 4
      // 055: getstatic qeaa361f143ee4a0894bd168fd9b30c66/qf4ccf8f5435d4a78bdca4d6a018b578e/abaaaabba.ba Lqeaa361f143ee4a0894bd168fd9b30c66/qf4ccf8f5435d4a78bdca4d6a018b578e/abaaaabba;
      // 058: if_acmpne 072
      // 05b: ldc_w -522994301
      // 05e: ldc_w 414558990
      // 061: ldc_w -850184376
      // 064: ixor
      // 065: invokestatic qeaa361f143ee4a0894bd168fd9b30c66/qf4ccf8f5435d4a78bdca4d6a018b578e/aabaaa.baaaaab (II)I
      // 068: ldc2_w 1655499389324327963
      // 06b: invokestatic qeaa361f143ee4a0894bd168fd9b30c66/qf4ccf8f5435d4a78bdca4d6a018b578e/aabaaa.abbbbab (IJ)I
      // 06e: goto 085
      // 071: athrow
      // 072: ldc_w -522994302
      // 075: ldc_w 414558990
      // 078: ldc_w 1951670885
      // 07b: ixor
      // 07c: invokestatic qeaa361f143ee4a0894bd168fd9b30c66/qf4ccf8f5435d4a78bdca4d6a018b578e/aabaaa.baaaaab (II)I
      // 07f: ldc2_w 1394829197470904801
      // 082: invokestatic qeaa361f143ee4a0894bd168fd9b30c66/qf4ccf8f5435d4a78bdca4d6a018b578e/aabaaa.abbbbab (IJ)I
      // 085: istore 12
      // 087: bipush 0
      // 088: istore 13
      // 08a: new java/util/ArrayList
      // 08d: dup
      // 08e: iload 12
      // 090: invokespecial java/util/ArrayList.<init> (I)V
      // 093: astore 14
      // 095: aload 14
      // 097: invokeinterface java/util/List.size ()I 1
      // 09c: iload 12
      // 09e: if_icmpge 1b0
      // 0a1: aload 0
      // 0a2: getfield qeaa361f143ee4a0894bd168fd9b30c66/qf4ccf8f5435d4a78bdca4d6a018b578e/aabaaa.bb Ljava/util/concurrent/ConcurrentLinkedQueue;
      // 0a5: invokevirtual java/util/concurrent/ConcurrentLinkedQueue.peek ()Ljava/lang/Object;
      // 0a8: checkcast qeaa361f143ee4a0894bd168fd9b30c66/qf4ccf8f5435d4a78bdca4d6a018b578e/ababbb
      // 0ab: dup
      // 0ac: astore 15
      // 0ae: ifnull 1b0
      // 0b1: aload 4
      // 0b3: iload 5
      // 0b5: ifne 0d5
      // 0b8: goto 0bc
      // 0bb: athrow
      // 0bc: ifnull 0e3
      // 0bf: goto 0c3
      // 0c2: athrow
      // 0c3: aload 15
      // 0c5: iload 5
      // 0c7: ifne 0e9
      // 0ca: goto 0ce
      // 0cd: athrow
      // 0ce: getfield qeaa361f143ee4a0894bd168fd9b30c66/qf4ccf8f5435d4a78bdca4d6a018b578e/ababbb.aa Lqeaa361f143ee4a0894bd168fd9b30c66/qf4ccf8f5435d4a78bdca4d6a018b578e/abaaaabba;
      // 0d1: goto 0d5
      // 0d4: athrow
      // 0d5: aload 4
      // 0d7: if_acmpeq 0e3
      // 0da: iload 5
      // 0dc: ifeq 1b0
      // 0df: goto 0e3
      // 0e2: athrow
      // 0e3: aload 15
      // 0e5: goto 0e9
      // 0e8: athrow
      // 0e9: iload 5
      // 0eb: ifne 11a
      // 0ee: getfield qeaa361f143ee4a0894bd168fd9b30c66/qf4ccf8f5435d4a78bdca4d6a018b578e/ababbb.b J
      // 0f1: lload 2
      // 0f2: lcmp
      // 0f3: ifle 103
      // 0f6: goto 0fa
      // 0f9: athrow
      // 0fa: iload 5
      // 0fc: ifeq 1b0
      // 0ff: goto 103
      // 102: athrow
      // 103: aload 0
      // 104: getfield qeaa361f143ee4a0894bd168fd9b30c66/qf4ccf8f5435d4a78bdca4d6a018b578e/aabaaa.bb Ljava/util/concurrent/ConcurrentLinkedQueue;
      // 107: invokevirtual java/util/concurrent/ConcurrentLinkedQueue.poll ()Ljava/lang/Object;
      // 10a: checkcast qeaa361f143ee4a0894bd168fd9b30c66/qf4ccf8f5435d4a78bdca4d6a018b578e/ababbb
      // 10d: iload 5
      // 10f: ifne 12c
      // 112: goto 116
      // 115: athrow
      // 116: astore 15
      // 118: aload 15
      // 11a: ifnonnull 126
      // 11d: iload 5
      // 11f: ifeq 1b0
      // 122: goto 126
      // 125: athrow
      // 126: aload 15
      // 128: goto 12c
      // 12b: athrow
      // 12c: getfield qeaa361f143ee4a0894bd168fd9b30c66/qf4ccf8f5435d4a78bdca4d6a018b578e/ababbb.aa Lqeaa361f143ee4a0894bd168fd9b30c66/qf4ccf8f5435d4a78bdca4d6a018b578e/abaaaabba;
      // 12f: iload 5
      // 131: ifne 197
      // 134: getstatic qeaa361f143ee4a0894bd168fd9b30c66/qf4ccf8f5435d4a78bdca4d6a018b578e/abaaaabba.ba Lqeaa361f143ee4a0894bd168fd9b30c66/qf4ccf8f5435d4a78bdca4d6a018b578e/abaaaabba;
      // 137: if_acmpne 17f
      // 13a: goto 13e
      // 13d: athrow
      // 13e: aload 15
      // 140: iload 5
      // 142: ifne 194
      // 145: goto 149
      // 148: athrow
      // 149: getfield qeaa361f143ee4a0894bd168fd9b30c66/qf4ccf8f5435d4a78bdca4d6a018b578e/ababbb.bb Ljava/lang/Object;
      // 14c: instanceof net/minecraft/class_2851
      // 14f: ifeq 17f
      // 152: goto 156
      // 155: athrow
      // 156: iload 13
      // 158: iload 5
      // 15a: ifne 17d
      // 15d: goto 161
      // 160: athrow
      // 161: ifeq 17c
      // 164: goto 168
      // 167: athrow
      // 168: aload 15
      // 16a: getfield qeaa361f143ee4a0894bd168fd9b30c66/qf4ccf8f5435d4a78bdca4d6a018b578e/ababbb.ab Lio/netty/channel/ChannelPromise;
      // 16d: invokeinterface io/netty/channel/ChannelPromise.trySuccess ()Z 1
      // 172: pop
      // 173: iload 5
      // 175: ifeq 095
      // 178: goto 17c
      // 17b: athrow
      // 17c: bipush 1
      // 17d: istore 13
      // 17f: aload 14
      // 181: iload 5
      // 183: ifne 1a2
      // 186: aload 15
      // 188: invokeinterface java/util/List.add (Ljava/lang/Object;)Z 2
      // 18d: pop
      // 18e: aload 15
      // 190: goto 194
      // 193: athrow
      // 194: getfield qeaa361f143ee4a0894bd168fd9b30c66/qf4ccf8f5435d4a78bdca4d6a018b578e/ababbb.aa Lqeaa361f143ee4a0894bd168fd9b30c66/qf4ccf8f5435d4a78bdca4d6a018b578e/abaaaabba;
      // 197: getstatic qeaa361f143ee4a0894bd168fd9b30c66/qf4ccf8f5435d4a78bdca4d6a018b578e/abaaaabba.ba Lqeaa361f143ee4a0894bd168fd9b30c66/qf4ccf8f5435d4a78bdca4d6a018b578e/abaaaabba;
      // 19a: if_acmpne 095
      // 19d: aload 15
      // 19f: getfield qeaa361f143ee4a0894bd168fd9b30c66/qf4ccf8f5435d4a78bdca4d6a018b578e/ababbb.bb Ljava/lang/Object;
      // 1a2: instanceof net/minecraft/class_9836
      // 1a5: iload 5
      // 1a7: ifne 09c
      // 1aa: ifeq 095
      // 1ad: goto 1b0
      // 1b0: bipush 0
      // 1b1: istore 16
      // 1b3: aload 14
      // 1b5: invokeinterface java/util/List.iterator ()Ljava/util/Iterator; 1
      // 1ba: astore 17
      // 1bc: aload 17
      // 1be: invokeinterface java/util/Iterator.hasNext ()Z 1
      // 1c3: ifeq 1f0
      // 1c6: aload 17
      // 1c8: invokeinterface java/util/Iterator.next ()Ljava/lang/Object; 1
      // 1cd: checkcast qeaa361f143ee4a0894bd168fd9b30c66/qf4ccf8f5435d4a78bdca4d6a018b578e/ababbb
      // 1d0: astore 18
      // 1d2: iload 5
      // 1d4: ifne 23c
      // 1d7: iload 16
      // 1d9: aload 0
      // 1da: aload 1
      // 1db: aload 18
      // 1dd: getfield qeaa361f143ee4a0894bd168fd9b30c66/qf4ccf8f5435d4a78bdca4d6a018b578e/ababbb.bb Ljava/lang/Object;
      // 1e0: aload 18
      // 1e2: getfield qeaa361f143ee4a0894bd168fd9b30c66/qf4ccf8f5435d4a78bdca4d6a018b578e/ababbb.ab Lio/netty/channel/ChannelPromise;
      // 1e5: invokevirtual qeaa361f143ee4a0894bd168fd9b30c66/qf4ccf8f5435d4a78bdca4d6a018b578e/aabaaa.abbaabb (Lio/netty/channel/ChannelHandlerContext;Ljava/lang/Object;Lio/netty/channel/ChannelPromise;)Z
      // 1e8: ior
      // 1e9: istore 16
      // 1eb: iload 5
      // 1ed: ifeq 1bc
      // 1f0: iload 16
      // 1f2: iload 5
      // 1f4: ifne 216
      // 1f7: ifeq 22b
      // 1fa: goto 1fe
      // 1fd: athrow
      // 1fe: aload 1
      // 1ff: iload 5
      // 201: ifne 223
      // 204: goto 208
      // 207: athrow
      // 208: invokeinterface io/netty/channel/ChannelHandlerContext.channel ()Lio/netty/channel/Channel; 1
      // 20d: invokeinterface io/netty/channel/Channel.isOpen ()Z 1
      // 212: goto 216
      // 215: athrow
      // 216: ifeq 22b
      // 219: aload 1
      // 21a: invokeinterface io/netty/channel/ChannelHandlerContext.flush ()Lio/netty/channel/ChannelHandlerContext; 1
      // 21f: goto 223
      // 222: athrow
      // 223: pop
      // 224: aload 0
      // 225: invokestatic java/lang/System.nanoTime ()J
      // 228: putfield qeaa361f143ee4a0894bd168fd9b30c66/qf4ccf8f5435d4a78bdca4d6a018b578e/aabaaa.aabba J
      // 22b: aload 0
      // 22c: iload 5
      // 22e: ifne 2ae
      // 231: getfield qeaa361f143ee4a0894bd168fd9b30c66/qf4ccf8f5435d4a78bdca4d6a018b578e/aabaaa.bbaba Ljava/util/concurrent/atomic/AtomicBoolean;
      // 234: bipush 0
      // 235: invokevirtual java/util/concurrent/atomic/AtomicBoolean.set (Z)V
      // 238: goto 23c
      // 23b: athrow
      // 23c: getstatic qeaa361f143ee4a0894bd168fd9b30c66/qf4ccf8f5435d4a78bdca4d6a018b578e/aabaaa.abaaa Lqeaa361f143ee4a0894bd168fd9b30c66/qf4ccf8f5435d4a78bdca4d6a018b578e/aaabbabbb;
      // 23f: ifnull 2a9
      // 242: aload 0
      // 243: iload 5
      // 245: ifne 2ae
      // 248: goto 24c
      // 24b: athrow
      // 24c: getfield qeaa361f143ee4a0894bd168fd9b30c66/qf4ccf8f5435d4a78bdca4d6a018b578e/aabaaa.bb Ljava/util/concurrent/ConcurrentLinkedQueue;
      // 24f: invokevirtual java/util/concurrent/ConcurrentLinkedQueue.isEmpty ()Z
      // 252: ifne 2a9
      // 255: goto 259
      // 258: athrow
      // 259: aload 0
      // 25a: aload 0
      // 25b: iload 5
      // 25d: ifne 27c
      // 260: goto 264
      // 263: athrow
      // 264: getfield qeaa361f143ee4a0894bd168fd9b30c66/qf4ccf8f5435d4a78bdca4d6a018b578e/aabaaa.bb Ljava/util/concurrent/ConcurrentLinkedQueue;
      // 267: invokevirtual java/util/concurrent/ConcurrentLinkedQueue.peek ()Ljava/lang/Object;
      // 26a: ifnull 28d
      // 26d: goto 271
      // 270: athrow
      // 271: aload 0
      // 272: getfield qeaa361f143ee4a0894bd168fd9b30c66/qf4ccf8f5435d4a78bdca4d6a018b578e/aabaaa.bb Ljava/util/concurrent/ConcurrentLinkedQueue;
      // 275: invokevirtual java/util/concurrent/ConcurrentLinkedQueue.peek ()Ljava/lang/Object;
      // 278: goto 27c
      // 27b: athrow
      // 27c: checkcast qeaa361f143ee4a0894bd168fd9b30c66/qf4ccf8f5435d4a78bdca4d6a018b578e/ababbb
      // 27f: getfield qeaa361f143ee4a0894bd168fd9b30c66/qf4ccf8f5435d4a78bdca4d6a018b578e/ababbb.aa Lqeaa361f143ee4a0894bd168fd9b30c66/qf4ccf8f5435d4a78bdca4d6a018b578e/abaaaabba;
      // 282: getstatic qeaa361f143ee4a0894bd168fd9b30c66/qf4ccf8f5435d4a78bdca4d6a018b578e/abaaaabba.ba Lqeaa361f143ee4a0894bd168fd9b30c66/qf4ccf8f5435d4a78bdca4d6a018b578e/abaaaabba;
      // 285: if_acmpne 28d
      // 288: bipush 1
      // 289: goto 28e
      // 28c: athrow
      // 28d: bipush 0
      // 28e: putfield qeaa361f143ee4a0894bd168fd9b30c66/qf4ccf8f5435d4a78bdca4d6a018b578e/aabaaa.aaabab Z
      // 291: iload 5
      // 293: aload 0
      // 294: aload 1
      // 295: aload 0
      // 296: aload 0
      // 297: getfield qeaa361f143ee4a0894bd168fd9b30c66/qf4ccf8f5435d4a78bdca4d6a018b578e/aabaaa.bb Ljava/util/concurrent/ConcurrentLinkedQueue;
      // 29a: invokevirtual java/util/concurrent/ConcurrentLinkedQueue.peek ()Ljava/lang/Object;
      // 29d: checkcast qeaa361f143ee4a0894bd168fd9b30c66/qf4ccf8f5435d4a78bdca4d6a018b578e/ababbb
      // 2a0: invokevirtual qeaa361f143ee4a0894bd168fd9b30c66/qf4ccf8f5435d4a78bdca4d6a018b578e/aabaaa.aaaaabb (Lqeaa361f143ee4a0894bd168fd9b30c66/qf4ccf8f5435d4a78bdca4d6a018b578e/ababbb;)J
      // 2a3: invokevirtual qeaa361f143ee4a0894bd168fd9b30c66/qf4ccf8f5435d4a78bdca4d6a018b578e/aabaaa.aaaabbb (Lio/netty/channel/ChannelHandlerContext;J)V
      // 2a6: ifeq 2ce
      // 2a9: aload 0
      // 2aa: goto 2ae
      // 2ad: athrow
      // 2ae: iload 5
      // 2b0: ifne 2c5
      // 2b3: lload 2
      // 2b4: aload 4
      // 2b6: invokevirtual qeaa361f143ee4a0894bd168fd9b30c66/qf4ccf8f5435d4a78bdca4d6a018b578e/aabaaa.babb (JLqeaa361f143ee4a0894bd168fd9b30c66/qf4ccf8f5435d4a78bdca4d6a018b578e/abaaaabba;)Z
      // 2b9: ifeq 2ce
      // 2bc: goto 2c0
      // 2bf: athrow
      // 2c0: aload 0
      // 2c1: goto 2c5
      // 2c4: athrow
      // 2c5: aload 1
      // 2c6: lload 2
      // 2c7: aload 4
      // 2c9: lload 6
      // 2cb: invokevirtual qeaa361f143ee4a0894bd168fd9b30c66/qf4ccf8f5435d4a78bdca4d6a018b578e/aabaaa.abaabaa (Lio/netty/channel/ChannelHandlerContext;JLqeaa361f143ee4a0894bd168fd9b30c66/qf4ccf8f5435d4a78bdca4d6a018b578e/abaaaabba;J)V
      // 2ce: goto 2de
      // 2d1: astore 6
      // 2d3: aload 0
      // 2d4: getfield qeaa361f143ee4a0894bd168fd9b30c66/qf4ccf8f5435d4a78bdca4d6a018b578e/aabaaa.bbaba Ljava/util/concurrent/atomic/AtomicBoolean;
      // 2d7: bipush 0
      // 2d8: invokevirtual java/util/concurrent/atomic/AtomicBoolean.set (Z)V
      // 2db: aload 6
      // 2dd: athrow
      // 2de: return
   }

   private void aababb(ChannelHandlerContext var1) {
      this.ababbb(var1);
   }

   private static void aabbaa(ChannelHandlerContext param0, Object param1) {
      // $VF: Couldn't be decompiled
      // Please report this to the Vineflower issue tracker, at https://github.com/Vineflower/vineflower/issues with a copy of the class file (if you have the rights to distribute it!)
      // java.lang.NullPointerException: Cannot invoke "org.jetbrains.java.decompiler.code.cfg.ExceptionRangeCFG.isCircular()" because "range" is null
      //   at org.jetbrains.java.decompiler.modules.decompiler.decompose.DomHelper.graphToStatement(DomHelper.java:84)
      //   at org.jetbrains.java.decompiler.modules.decompiler.decompose.DomHelper.parseGraph(DomHelper.java:203)
      //   at org.jetbrains.java.decompiler.main.rels.MethodProcessor.codeToJava(MethodProcessor.java:166)
      //
      // Bytecode:
      // 00: getstatic qeaa361f143ee4a0894bd168fd9b30c66/qf4ccf8f5435d4a78bdca4d6a018b578e/baaabbaa.bba I
      // 03: istore 2
      // 04: aload 1
      // 05: iload 2
      // 06: ifne 18
      // 09: instanceof net/minecraft/class_2708
      // 0c: ifne 1e
      // 0f: goto 13
      // 12: athrow
      // 13: aload 1
      // 14: goto 18
      // 17: athrow
      // 18: instanceof net/minecraft/class_10265
      // 1b: ifeq 67
      // 1e: aload 0
      // 1f: iload 2
      // 20: ifne 2f
      // 23: goto 27
      // 26: athrow
      // 27: ifnull 67
      // 2a: goto 2e
      // 2d: athrow
      // 2e: aload 0
      // 2f: invokeinterface io/netty/channel/ChannelHandlerContext.handler ()Lio/netty/channel/ChannelHandler; 1
      // 34: astore 4
      // 36: aload 4
      // 38: iload 2
      // 39: ifne 4c
      // 3c: instanceof qeaa361f143ee4a0894bd168fd9b30c66/qf4ccf8f5435d4a78bdca4d6a018b578e/aabaaa
      // 3f: ifeq 67
      // 42: goto 46
      // 45: athrow
      // 46: aload 4
      // 48: goto 4c
      // 4b: athrow
      // 4c: checkcast qeaa361f143ee4a0894bd168fd9b30c66/qf4ccf8f5435d4a78bdca4d6a018b578e/aabaaa
      // 4f: astore 3
      // 50: aload 3
      // 51: ldc_w -522994291
      // 54: ldc_w -166853962
      // 57: ldc_w -1276236196
      // 5a: ixor
      // 5b: invokestatic qeaa361f143ee4a0894bd168fd9b30c66/qf4ccf8f5435d4a78bdca4d6a018b578e/aabaaa.baaaaab (II)I
      // 5e: ldc2_w 425471016334716668
      // 61: invokestatic qeaa361f143ee4a0894bd168fd9b30c66/qf4ccf8f5435d4a78bdca4d6a018b578e/aabaaa.abbbbab (IJ)I
      // 64: putfield qeaa361f143ee4a0894bd168fd9b30c66/qf4ccf8f5435d4a78bdca4d6a018b578e/aabaaa.baaaa I
      // 67: return
   }

   public void write(ChannelHandlerContext param1, Object param2, ChannelPromise param3) throws Exception {
      // $VF: Couldn't be decompiled
      // Please report this to the Vineflower issue tracker, at https://github.com/Vineflower/vineflower/issues with a copy of the class file (if you have the rights to distribute it!)
      // java.lang.RuntimeException: parsing failure!
      //   at org.jetbrains.java.decompiler.modules.decompiler.decompose.DomHelper.parseGraph(DomHelper.java:211)
      //   at org.jetbrains.java.decompiler.main.rels.MethodProcessor.codeToJava(MethodProcessor.java:166)
      //
      // Bytecode:
      // 000: getstatic qeaa361f143ee4a0894bd168fd9b30c66/qf4ccf8f5435d4a78bdca4d6a018b578e/baaabbaa.bba I
      // 003: istore 4
      // 005: invokestatic qeaa361f143ee4a0894bd168fd9b30c66/qf4ccf8f5435d4a78bdca4d6a018b578e/abbabaa.aa ()Z
      // 008: iload 4
      // 00a: ifne 030
      // 00d: ifeq 01f
      // 010: goto 014
      // 013: athrow
      // 014: aload 1
      // 015: aload 2
      // 016: aload 3
      // 017: invokeinterface io/netty/channel/ChannelHandlerContext.write (Ljava/lang/Object;Lio/netty/channel/ChannelPromise;)Lio/netty/channel/ChannelFuture; 3
      // 01c: pop
      // 01d: return
      // 01e: athrow
      // 01f: aload 0
      // 020: aload 1
      // 021: aload 2
      // 022: aload 3
      // 023: invokevirtual qeaa361f143ee4a0894bd168fd9b30c66/qf4ccf8f5435d4a78bdca4d6a018b578e/aabaaa.abbbbbb (Lio/netty/channel/ChannelHandlerContext;Ljava/lang/Object;Lio/netty/channel/ChannelPromise;)Lio/netty/channel/ChannelPromise;
      // 026: iload 4
      // 028: ifne 034
      // 02b: astore 3
      // 02c: aload 2
      // 02d: instanceof net/minecraft/class_2868
      // 030: ifeq 05a
      // 033: aload 2
      // 034: checkcast net/minecraft/class_2868
      // 037: astore 6
      // 039: getstatic qeaa361f143ee4a0894bd168fd9b30c66/qf4ccf8f5435d4a78bdca4d6a018b578e/aabaaa.babbb Ljava/util/Set;
      // 03c: new qeaa361f143ee4a0894bd168fd9b30c66/qf4ccf8f5435d4a78bdca4d6a018b578e/baaa
      // 03f: dup
      // 040: aload 6
      // 042: invokespecial qeaa361f143ee4a0894bd168fd9b30c66/qf4ccf8f5435d4a78bdca4d6a018b578e/baaa.<init> (Lnet/minecraft/class_2596;)V
      // 045: invokeinterface java/util/Set.remove (Ljava/lang/Object;)Z 2
      // 04a: iload 4
      // 04c: ifne 057
      // 04f: ifeq 05a
      // 052: goto 056
      // 055: athrow
      // 056: bipush 1
      // 057: goto 05b
      // 05a: bipush 0
      // 05b: istore 5
      // 05d: aload 0
      // 05e: iload 4
      // 060: ifne 0ac
      // 063: getfield qeaa361f143ee4a0894bd168fd9b30c66/qf4ccf8f5435d4a78bdca4d6a018b578e/aabaaa.aaab Z
      // 066: ifeq 0ab
      // 069: goto 06d
      // 06c: athrow
      // 06d: aload 0
      // 06e: iload 4
      // 070: ifne 0ac
      // 073: goto 077
      // 076: athrow
      // 077: getfield qeaa361f143ee4a0894bd168fd9b30c66/qf4ccf8f5435d4a78bdca4d6a018b578e/aabaaa.bbb Ljava/util/concurrent/ConcurrentLinkedQueue;
      // 07a: invokevirtual java/util/concurrent/ConcurrentLinkedQueue.isEmpty ()Z
      // 07d: ifne 0ab
      // 080: goto 084
      // 083: athrow
      // 084: aload 2
      // 085: iload 4
      // 087: ifne 0ac
      // 08a: goto 08e
      // 08d: athrow
      // 08e: invokestatic qeaa361f143ee4a0894bd168fd9b30c66/qf4ccf8f5435d4a78bdca4d6a018b578e/aabaaa.aabbbbb (Ljava/lang/Object;)Z
      // 091: ifne 0ab
      // 094: goto 098
      // 097: athrow
      // 098: aload 0
      // 099: bipush 0
      // 09a: putfield qeaa361f143ee4a0894bd168fd9b30c66/qf4ccf8f5435d4a78bdca4d6a018b578e/aabaaa.aaaaaa Z
      // 09d: aload 0
      // 09e: aload 1
      // 09f: invokevirtual qeaa361f143ee4a0894bd168fd9b30c66/qf4ccf8f5435d4a78bdca4d6a018b578e/aabaaa.bbbbbb (Lio/netty/channel/ChannelHandlerContext;)V
      // 0a2: aload 0
      // 0a3: bipush 0
      // 0a4: putfield qeaa361f143ee4a0894bd168fd9b30c66/qf4ccf8f5435d4a78bdca4d6a018b578e/aabaaa.aaab Z
      // 0a7: goto 0ab
      // 0aa: athrow
      // 0ab: aload 2
      // 0ac: iload 4
      // 0ae: ifne 0de
      // 0b1: instanceof net/minecraft/class_2596
      // 0b4: ifeq 0dd
      // 0b7: goto 0bb
      // 0ba: athrow
      // 0bb: aload 2
      // 0bc: checkcast net/minecraft/class_2596
      // 0bf: astore 6
      // 0c1: aload 6
      // 0c3: iload 4
      // 0c5: ifne 0de
      // 0c8: invokeinterface net/minecraft/class_2596.method_55943 ()Z 1
      // 0cd: ifeq 0dd
      // 0d0: goto 0d4
      // 0d3: athrow
      // 0d4: aload 0
      // 0d5: aload 1
      // 0d6: invokevirtual qeaa361f143ee4a0894bd168fd9b30c66/qf4ccf8f5435d4a78bdca4d6a018b578e/aabaaa.aaabbb (Lio/netty/channel/ChannelHandlerContext;)V
      // 0d9: goto 0dd
      // 0dc: athrow
      // 0dd: aload 2
      // 0de: iload 4
      // 0e0: ifne 122
      // 0e3: invokestatic qeaa361f143ee4a0894bd168fd9b30c66/qf4ccf8f5435d4a78bdca4d6a018b578e/aabaaa.abaaa (Ljava/lang/Object;)Z
      // 0e6: ifeq 121
      // 0e9: goto 0ed
      // 0ec: athrow
      // 0ed: aload 0
      // 0ee: new java/util/concurrent/CancellationException
      // 0f1: dup
      // 0f2: ldc_w -522994292
      // 0f5: ldc_w 948862865
      // 0f8: ldc_w 178191503
      // 0fb: ixor
      // 0fc: invokestatic qeaa361f143ee4a0894bd168fd9b30c66/qf4ccf8f5435d4a78bdca4d6a018b578e/aabaaa.baaaaab (II)I
      // 0ff: ldc_w -522994289
      // 102: ldc_w 948862865
      // 105: ldc_w -35355385
      // 108: ixor
      // 109: invokestatic qeaa361f143ee4a0894bd168fd9b30c66/qf4ccf8f5435d4a78bdca4d6a018b578e/aabaaa.baaaaab (II)I
      // 10c: invokestatic qeaa361f143ee4a0894bd168fd9b30c66/qf4ccf8f5435d4a78bdca4d6a018b578e/aabaaa.aabbaab (II)Ljava/lang/String;
      // 10f: invokestatic qeaa361f143ee4a0894bd168fd9b30c66/qf4ccf8f5435d4a78bdca4d6a018b578e/aabbaaaba.abba (Ljava/lang/String;)Ljava/lang/String;
      // 112: invokespecial java/util/concurrent/CancellationException.<init> (Ljava/lang/String;)V
      // 115: invokevirtual qeaa361f143ee4a0894bd168fd9b30c66/qf4ccf8f5435d4a78bdca4d6a018b578e/aabaaa.aaaba (Ljava/lang/Throwable;)V
      // 118: aload 0
      // 119: aload 1
      // 11a: aload 2
      // 11b: aload 3
      // 11c: invokevirtual qeaa361f143ee4a0894bd168fd9b30c66/qf4ccf8f5435d4a78bdca4d6a018b578e/aabaaa.aaaabaa (Lio/netty/channel/ChannelHandlerContext;Ljava/lang/Object;Lio/netty/channel/ChannelPromise;)V
      // 11f: return
      // 120: athrow
      // 121: aload 2
      // 122: instanceof net/minecraft/class_2813
      // 125: iload 4
      // 127: ifne 14c
      // 12a: ifne 145
      // 12d: goto 131
      // 130: athrow
      // 131: aload 2
      // 132: iload 4
      // 134: ifne 188
      // 137: goto 13b
      // 13a: athrow
      // 13b: instanceof net/minecraft/class_2815
      // 13e: ifeq 187
      // 141: goto 145
      // 144: athrow
      // 145: invokestatic qeaa361f143ee4a0894bd168fd9b30c66/qf4ccf8f5435d4a78bdca4d6a018b578e/aabaaa.baaab ()Z
      // 148: goto 14c
      // 14b: athrow
      // 14c: iload 4
      // 14e: ifne 194
      // 151: ifeq 187
      // 154: goto 158
      // 157: athrow
      // 158: aload 0
      // 159: bipush 0
      // 15a: putfield qeaa361f143ee4a0894bd168fd9b30c66/qf4ccf8f5435d4a78bdca4d6a018b578e/aabaaa.aab Z
      // 15d: aload 0
      // 15e: bipush 0
      // 15f: putfield qeaa361f143ee4a0894bd168fd9b30c66/qf4ccf8f5435d4a78bdca4d6a018b578e/aabaaa.aaaaaa Z
      // 162: aload 0
      // 163: iload 4
      // 165: ifne 188
      // 168: goto 16c
      // 16b: athrow
      // 16c: bipush 0
      // 16d: putfield qeaa361f143ee4a0894bd168fd9b30c66/qf4ccf8f5435d4a78bdca4d6a018b578e/aabaaa.ababb Z
      // 170: aload 0
      // 171: getfield qeaa361f143ee4a0894bd168fd9b30c66/qf4ccf8f5435d4a78bdca4d6a018b578e/aabaaa.bbb Ljava/util/concurrent/ConcurrentLinkedQueue;
      // 174: invokevirtual java/util/concurrent/ConcurrentLinkedQueue.isEmpty ()Z
      // 177: ifne 187
      // 17a: goto 17e
      // 17d: athrow
      // 17e: aload 0
      // 17f: aload 1
      // 180: invokevirtual qeaa361f143ee4a0894bd168fd9b30c66/qf4ccf8f5435d4a78bdca4d6a018b578e/aabaaa.bbbbbb (Lio/netty/channel/ChannelHandlerContext;)V
      // 183: goto 187
      // 186: athrow
      // 187: aload 2
      // 188: iload 4
      // 18a: ifne 1ab
      // 18d: instanceof net/minecraft/class_2828
      // 190: goto 194
      // 193: athrow
      // 194: ifeq 1aa
      // 197: aload 0
      // 198: aload 1
      // 199: aload 2
      // 19a: aload 3
      // 19b: invokevirtual qeaa361f143ee4a0894bd168fd9b30c66/qf4ccf8f5435d4a78bdca4d6a018b578e/aabaaa.abaaba (Lio/netty/channel/ChannelHandlerContext;Ljava/lang/Object;Lio/netty/channel/ChannelPromise;)V
      // 19e: aload 0
      // 19f: bipush 1
      // 1a0: putfield qeaa361f143ee4a0894bd168fd9b30c66/qf4ccf8f5435d4a78bdca4d6a018b578e/aabaaa.aab Z
      // 1a3: aload 0
      // 1a4: bipush 1
      // 1a5: putfield qeaa361f143ee4a0894bd168fd9b30c66/qf4ccf8f5435d4a78bdca4d6a018b578e/aabaaa.aaaaaa Z
      // 1a8: return
      // 1a9: athrow
      // 1aa: aload 2
      // 1ab: instanceof net/minecraft/class_9836
      // 1ae: iload 4
      // 1b0: ifne 1d0
      // 1b3: ifeq 1c3
      // 1b6: goto 1ba
      // 1b9: athrow
      // 1ba: aload 0
      // 1bb: aload 1
      // 1bc: aload 2
      // 1bd: aload 3
      // 1be: invokevirtual qeaa361f143ee4a0894bd168fd9b30c66/qf4ccf8f5435d4a78bdca4d6a018b578e/aabaaa.baba (Lio/netty/channel/ChannelHandlerContext;Ljava/lang/Object;Lio/netty/channel/ChannelPromise;)V
      // 1c1: return
      // 1c2: athrow
      // 1c3: aload 0
      // 1c4: iload 4
      // 1c6: ifne 1d4
      // 1c9: getfield qeaa361f143ee4a0894bd168fd9b30c66/qf4ccf8f5435d4a78bdca4d6a018b578e/aabaaa.aa Z
      // 1cc: goto 1d0
      // 1cf: athrow
      // 1d0: ifeq 1e7
      // 1d3: aload 2
      // 1d4: instanceof net/minecraft/class_2879
      // 1d7: iload 4
      // 1d9: ifne 1e4
      // 1dc: ifeq 1e7
      // 1df: goto 1e3
      // 1e2: athrow
      // 1e3: bipush 1
      // 1e4: goto 1e8
      // 1e7: bipush 0
      // 1e8: istore 6
      // 1ea: aload 2
      // 1eb: invokestatic qeaa361f143ee4a0894bd168fd9b30c66/qf4ccf8f5435d4a78bdca4d6a018b578e/aabaaa.aabbbbb (Ljava/lang/Object;)Z
      // 1ee: iload 4
      // 1f0: ifne 205
      // 1f3: ifne 203
      // 1f6: goto 1fa
      // 1f9: athrow
      // 1fa: aload 0
      // 1fb: bipush 0
      // 1fc: putfield qeaa361f143ee4a0894bd168fd9b30c66/qf4ccf8f5435d4a78bdca4d6a018b578e/aabaaa.aa Z
      // 1ff: goto 203
      // 202: athrow
      // 203: iload 6
      // 205: iload 4
      // 207: ifne 269
      // 20a: ifne 267
      // 20d: goto 211
      // 210: athrow
      // 211: aload 0
      // 212: iload 4
      // 214: ifne 23a
      // 217: goto 21b
      // 21a: athrow
      // 21b: getfield qeaa361f143ee4a0894bd168fd9b30c66/qf4ccf8f5435d4a78bdca4d6a018b578e/aabaaa.aab Z
      // 21e: ifne 239
      // 221: goto 225
      // 224: athrow
      // 225: aload 0
      // 226: getfield qeaa361f143ee4a0894bd168fd9b30c66/qf4ccf8f5435d4a78bdca4d6a018b578e/aabaaa.aaaaaa Z
      // 229: iload 4
      // 22b: ifne 269
      // 22e: goto 232
      // 231: athrow
      // 232: ifeq 267
      // 235: goto 239
      // 238: athrow
      // 239: aload 2
      // 23a: invokestatic qeaa361f143ee4a0894bd168fd9b30c66/qf4ccf8f5435d4a78bdca4d6a018b578e/aabaaa.aaaaaa (Ljava/lang/Object;)Z
      // 23d: iload 4
      // 23f: ifne 269
      // 242: ifeq 267
      // 245: goto 249
      // 248: athrow
      // 249: aload 0
      // 24a: aload 2
      // 24b: invokevirtual qeaa361f143ee4a0894bd168fd9b30c66/qf4ccf8f5435d4a78bdca4d6a018b578e/aabaaa.abbaaa (Ljava/lang/Object;)Z
      // 24e: iload 4
      // 250: ifne 269
      // 253: goto 257
      // 256: athrow
      // 257: ifeq 267
      // 25a: goto 25e
      // 25d: athrow
      // 25e: aload 0
      // 25f: aload 1
      // 260: aload 2
      // 261: aload 3
      // 262: invokevirtual qeaa361f143ee4a0894bd168fd9b30c66/qf4ccf8f5435d4a78bdca4d6a018b578e/aabaaa.abbaba (Lio/netty/channel/ChannelHandlerContext;Ljava/lang/Object;Lio/netty/channel/ChannelPromise;)V
      // 265: return
      // 266: athrow
      // 267: iload 6
      // 269: iload 4
      // 26b: ifne 2ab
      // 26e: ifne 2a9
      // 271: goto 275
      // 274: athrow
      // 275: aload 0
      // 276: getfield qeaa361f143ee4a0894bd168fd9b30c66/qf4ccf8f5435d4a78bdca4d6a018b578e/aabaaa.bbb Ljava/util/concurrent/ConcurrentLinkedQueue;
      // 279: invokevirtual java/util/concurrent/ConcurrentLinkedQueue.isEmpty ()Z
      // 27c: iload 4
      // 27e: ifne 2ab
      // 281: goto 285
      // 284: athrow
      // 285: ifne 2a9
      // 288: goto 28c
      // 28b: athrow
      // 28c: aload 2
      // 28d: invokestatic qeaa361f143ee4a0894bd168fd9b30c66/qf4ccf8f5435d4a78bdca4d6a018b578e/aabaaa.aabbbbb (Ljava/lang/Object;)Z
      // 290: iload 4
      // 292: ifne 2ab
      // 295: goto 299
      // 298: athrow
      // 299: ifne 2a9
      // 29c: goto 2a0
      // 29f: athrow
      // 2a0: aload 0
      // 2a1: aload 1
      // 2a2: aload 2
      // 2a3: aload 3
      // 2a4: invokevirtual qeaa361f143ee4a0894bd168fd9b30c66/qf4ccf8f5435d4a78bdca4d6a018b578e/aabaaa.abbaba (Lio/netty/channel/ChannelHandlerContext;Ljava/lang/Object;Lio/netty/channel/ChannelPromise;)V
      // 2a7: return
      // 2a8: athrow
      // 2a9: iload 5
      // 2ab: iload 4
      // 2ad: ifne 2c8
      // 2b0: ifeq 2df
      // 2b3: goto 2b7
      // 2b6: athrow
      // 2b7: aload 0
      // 2b8: iload 4
      // 2ba: ifne 2cc
      // 2bd: goto 2c1
      // 2c0: athrow
      // 2c1: getfield qeaa361f143ee4a0894bd168fd9b30c66/qf4ccf8f5435d4a78bdca4d6a018b578e/aabaaa.aab Z
      // 2c4: goto 2c8
      // 2c7: athrow
      // 2c8: ifne 2df
      // 2cb: aload 0
      // 2cc: getfield qeaa361f143ee4a0894bd168fd9b30c66/qf4ccf8f5435d4a78bdca4d6a018b578e/aabaaa.aaaaaa Z
      // 2cf: iload 4
      // 2d1: ifne 2dc
      // 2d4: ifne 2df
      // 2d7: goto 2db
      // 2da: athrow
      // 2db: bipush 1
      // 2dc: goto 2e0
      // 2df: bipush 0
      // 2e0: istore 7
      // 2e2: aload 2
      // 2e3: iload 4
      // 2e5: ifne 36f
      // 2e8: instanceof net/minecraft/class_2868
      // 2eb: ifeq 35e
      // 2ee: goto 2f2
      // 2f1: athrow
      // 2f2: iload 7
      // 2f4: iload 4
      // 2f6: ifne 372
      // 2f9: goto 2fd
      // 2fc: athrow
      // 2fd: ifne 35e
      // 300: goto 304
      // 303: athrow
      // 304: aload 0
      // 305: iload 4
      // 307: ifne 345
      // 30a: goto 30e
      // 30d: athrow
      // 30e: getfield qeaa361f143ee4a0894bd168fd9b30c66/qf4ccf8f5435d4a78bdca4d6a018b578e/aabaaa.ababb Z
      // 311: ifne 340
      // 314: goto 318
      // 317: athrow
      // 318: aload 0
      // 319: iload 4
      // 31b: ifne 345
      // 31e: goto 322
      // 321: athrow
      // 322: getfield qeaa361f143ee4a0894bd168fd9b30c66/qf4ccf8f5435d4a78bdca4d6a018b578e/aabaaa.aab Z
      // 325: ifne 340
      // 328: goto 32c
      // 32b: athrow
      // 32c: aload 0
      // 32d: iload 4
      // 32f: ifne 36f
      // 332: goto 336
      // 335: athrow
      // 336: getfield qeaa361f143ee4a0894bd168fd9b30c66/qf4ccf8f5435d4a78bdca4d6a018b578e/aabaaa.aaaaaa Z
      // 339: ifeq 35e
      // 33c: goto 340
      // 33f: athrow
      // 340: aload 0
      // 341: goto 345
      // 344: athrow
      // 345: iload 4
      // 347: ifne 36f
      // 34a: aload 2
      // 34b: invokevirtual qeaa361f143ee4a0894bd168fd9b30c66/qf4ccf8f5435d4a78bdca4d6a018b578e/aabaaa.abbaaa (Ljava/lang/Object;)Z
      // 34e: ifeq 35e
      // 351: goto 355
      // 354: athrow
      // 355: aload 0
      // 356: aload 1
      // 357: aload 2
      // 358: aload 3
      // 359: invokevirtual qeaa361f143ee4a0894bd168fd9b30c66/qf4ccf8f5435d4a78bdca4d6a018b578e/aabaaa.abbaba (Lio/netty/channel/ChannelHandlerContext;Ljava/lang/Object;Lio/netty/channel/ChannelPromise;)V
      // 35c: return
      // 35d: athrow
      // 35e: aload 0
      // 35f: iload 4
      // 361: ifne 37f
      // 364: aload 1
      // 365: aload 2
      // 366: aload 3
      // 367: invokevirtual qeaa361f143ee4a0894bd168fd9b30c66/qf4ccf8f5435d4a78bdca4d6a018b578e/aabaaa.babaaa (Lio/netty/channel/ChannelHandlerContext;Ljava/lang/Object;Lio/netty/channel/ChannelPromise;)V
      // 36a: aload 2
      // 36b: goto 36f
      // 36e: athrow
      // 36f: invokestatic qeaa361f143ee4a0894bd168fd9b30c66/qf4ccf8f5435d4a78bdca4d6a018b578e/aabaaa.aaaaaa (Ljava/lang/Object;)Z
      // 372: ifeq 37e
      // 375: aload 0
      // 376: bipush 1
      // 377: putfield qeaa361f143ee4a0894bd168fd9b30c66/qf4ccf8f5435d4a78bdca4d6a018b578e/aabaaa.ababb Z
      // 37a: goto 37e
      // 37d: athrow
      // 37e: aload 2
      // 37f: invokestatic qeaa361f143ee4a0894bd168fd9b30c66/qf4ccf8f5435d4a78bdca4d6a018b578e/aabaaa.aaaa (Ljava/lang/Object;)Z
      // 382: ifeq 38e
      // 385: aload 0
      // 386: bipush 1
      // 387: putfield qeaa361f143ee4a0894bd168fd9b30c66/qf4ccf8f5435d4a78bdca4d6a018b578e/aabaaa.aa Z
      // 38a: goto 38e
      // 38d: athrow
      // 38e: return
   }

   private void aabbab(ChannelHandlerContext param1) {
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
      // 05: getfield qeaa361f143ee4a0894bd168fd9b30c66/qf4ccf8f5435d4a78bdca4d6a018b578e/aabaaa.bbab Ljava/util/concurrent/ConcurrentLinkedQueue;
      // 08: iload 2
      // 09: ifne 33
      // 0c: invokevirtual java/util/concurrent/ConcurrentLinkedQueue.isEmpty ()Z
      // 0f: ifne 27
      // 12: goto 16
      // 15: athrow
      // 16: aload 0
      // 17: getfield qeaa361f143ee4a0894bd168fd9b30c66/qf4ccf8f5435d4a78bdca4d6a018b578e/aabaaa.aaaabb Ljava/util/concurrent/atomic/AtomicBoolean;
      // 1a: bipush 0
      // 1b: invokevirtual java/util/concurrent/atomic/AtomicBoolean.set (Z)V
      // 1e: aload 0
      // 1f: aload 1
      // 20: invokevirtual qeaa361f143ee4a0894bd168fd9b30c66/qf4ccf8f5435d4a78bdca4d6a018b578e/aabaaa.bbbbab (Lio/netty/channel/ChannelHandlerContext;)V
      // 23: goto 27
      // 26: athrow
      // 27: aload 0
      // 28: iload 2
      // 29: ifne 4b
      // 2c: getfield qeaa361f143ee4a0894bd168fd9b30c66/qf4ccf8f5435d4a78bdca4d6a018b578e/aabaaa.aabbaa Ljava/util/concurrent/ConcurrentLinkedQueue;
      // 2f: goto 33
      // 32: athrow
      // 33: invokevirtual java/util/concurrent/ConcurrentLinkedQueue.isEmpty ()Z
      // 36: ifne 4a
      // 39: aload 0
      // 3a: getfield qeaa361f143ee4a0894bd168fd9b30c66/qf4ccf8f5435d4a78bdca4d6a018b578e/aabaaa.abbb Ljava/util/concurrent/atomic/AtomicBoolean;
      // 3d: bipush 0
      // 3e: invokevirtual java/util/concurrent/atomic/AtomicBoolean.set (Z)V
      // 41: aload 0
      // 42: aload 1
      // 43: invokevirtual qeaa361f143ee4a0894bd168fd9b30c66/qf4ccf8f5435d4a78bdca4d6a018b578e/aabaaa.abbbbaa (Lio/netty/channel/ChannelHandlerContext;)V
      // 46: goto 4a
      // 49: athrow
      // 4a: aload 0
      // 4b: iload 2
      // 4c: ifne 69
      // 4f: getfield qeaa361f143ee4a0894bd168fd9b30c66/qf4ccf8f5435d4a78bdca4d6a018b578e/aabaaa.aaa Ljava/util/concurrent/ConcurrentLinkedQueue;
      // 52: invokevirtual java/util/concurrent/ConcurrentLinkedQueue.isEmpty ()Z
      // 55: ifne 6d
      // 58: goto 5c
      // 5b: athrow
      // 5c: aload 0
      // 5d: getfield qeaa361f143ee4a0894bd168fd9b30c66/qf4ccf8f5435d4a78bdca4d6a018b578e/aabaaa.aaaba Ljava/util/concurrent/atomic/AtomicBoolean;
      // 60: bipush 0
      // 61: invokevirtual java/util/concurrent/atomic/AtomicBoolean.set (Z)V
      // 64: aload 0
      // 65: goto 69
      // 68: athrow
      // 69: aload 1
      // 6a: invokevirtual qeaa361f143ee4a0894bd168fd9b30c66/qf4ccf8f5435d4a78bdca4d6a018b578e/aabaaa.babbba (Lio/netty/channel/ChannelHandlerContext;)V
      // 6d: return
   }

   private boolean aabbba(abbbbaaaa param1) {
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
      // 09: ifnull 5e
      // 0c: goto 10
      // 0f: athrow
      // 10: aload 1
      // 11: invokevirtual qeaa361f143ee4a0894bd168fd9b30c66/qf4ccf8f5435d4a78bdca4d6a018b578e/abbbbaaaa.aa ()Ljava/lang/Object;
      // 14: goto 18
      // 17: athrow
      // 18: astore 5
      // 1a: aload 5
      // 1c: iload 2
      // 1d: ifne 30
      // 20: instanceof net/minecraft/class_2596
      // 23: ifeq 5e
      // 26: goto 2a
      // 29: athrow
      // 2a: aload 5
      // 2c: goto 30
      // 2f: athrow
      // 30: checkcast net/minecraft/class_2596
      // 33: astore 4
      // 35: invokestatic qeaa361f143ee4a0894bd168fd9b30c66/qf4ccf8f5435d4a78bdca4d6a018b578e/abbabbaa.abb ()Lqeaa361f143ee4a0894bd168fd9b30c66/qf4ccf8f5435d4a78bdca4d6a018b578e/abbabbaa;
      // 38: invokevirtual qeaa361f143ee4a0894bd168fd9b30c66/qf4ccf8f5435d4a78bdca4d6a018b578e/abbabbaa.abbbb ()Z
      // 3b: iload 2
      // 3c: ifne 4f
      // 3f: ifne 5e
      // 42: goto 46
      // 45: athrow
      // 46: aload 4
      // 48: invokestatic qeaa361f143ee4a0894bd168fd9b30c66/qf4ccf8f5435d4a78bdca4d6a018b578e/aabaaa.aaabbba (Lnet/minecraft/class_2596;)Z
      // 4b: goto 4f
      // 4e: athrow
      // 4f: iload 2
      // 50: ifne 5b
      // 53: ifeq 5e
      // 56: goto 5a
      // 59: athrow
      // 5a: bipush 1
      // 5b: goto 5f
      // 5e: bipush 0
      // 5f: istore 3
      // 60: iload 2
      // 61: ifne a9
      // 64: iload 3
      // 65: ifne 98
      // 68: goto 6c
      // 6b: athrow
      // 6c: aload 0
      // 6d: getfield qeaa361f143ee4a0894bd168fd9b30c66/qf4ccf8f5435d4a78bdca4d6a018b578e/aabaaa.abb Ljava/util/concurrent/ConcurrentLinkedQueue;
      // 70: iload 2
      // 71: ifne 9c
      // 74: goto 78
      // 77: athrow
      // 78: invokevirtual java/util/concurrent/ConcurrentLinkedQueue.size ()I
      // 7b: ldc_w -522994290
      // 7e: ldc_w -1579402128
      // 81: ldc_w -1596504248
      // 84: ixor
      // 85: invokestatic qeaa361f143ee4a0894bd168fd9b30c66/qf4ccf8f5435d4a78bdca4d6a018b578e/aabaaa.baaaaab (II)I
      // 88: ldc2_w 6550969807700643117
      // 8b: invokestatic qeaa361f143ee4a0894bd168fd9b30c66/qf4ccf8f5435d4a78bdca4d6a018b578e/aabaaa.abbbbab (IJ)I
      // 8e: if_icmplt 98
      // 91: goto 95
      // 94: athrow
      // 95: bipush 0
      // 96: ireturn
      // 97: athrow
      // 98: aload 0
      // 99: getfield qeaa361f143ee4a0894bd168fd9b30c66/qf4ccf8f5435d4a78bdca4d6a018b578e/aabaaa.abb Ljava/util/concurrent/ConcurrentLinkedQueue;
      // 9c: aload 1
      // 9d: invokevirtual java/util/concurrent/ConcurrentLinkedQueue.offer (Ljava/lang/Object;)Z
      // a0: iload 2
      // a1: ifne cc
      // a4: pop
      // a5: goto a9
      // a8: athrow
      // a9: aload 1
      // aa: ifnull cb
      // ad: aload 1
      // ae: iload 2
      // af: ifne c8
      // b2: goto b6
      // b5: athrow
      // b6: invokevirtual qeaa361f143ee4a0894bd168fd9b30c66/qf4ccf8f5435d4a78bdca4d6a018b578e/abbbbaaaa.aa ()Ljava/lang/Object;
      // b9: ifnull cb
      // bc: goto c0
      // bf: athrow
      // c0: aload 1
      // c1: invokevirtual qeaa361f143ee4a0894bd168fd9b30c66/qf4ccf8f5435d4a78bdca4d6a018b578e/abbbbaaaa.aa ()Ljava/lang/Object;
      // c4: goto c8
      // c7: athrow
      // c8: invokestatic qeaa361f143ee4a0894bd168fd9b30c66/qf4ccf8f5435d4a78bdca4d6a018b578e/aabaaa.aaabbaa (Ljava/lang/Object;)V
      // cb: bipush 1
      // cc: ireturn
   }

   private void aabbbb(ChannelHandlerContext param1, Throwable param2) {
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
      // 009: ifnull 01e
      // 00c: goto 010
      // 00f: athrow
      // 010: aload 1
      // 011: invokeinterface io/netty/channel/ChannelHandlerContext.channel ()Lio/netty/channel/Channel; 1
      // 016: invokeinterface io/netty/channel/Channel.isOpen ()Z 1
      // 01b: ifne 025
      // 01e: aload 0
      // 01f: aload 2
      // 020: invokevirtual qeaa361f143ee4a0894bd168fd9b30c66/qf4ccf8f5435d4a78bdca4d6a018b578e/aabaaa.abbbab (Ljava/lang/Throwable;)V
      // 023: return
      // 024: athrow
      // 025: new java/util/ArrayList
      // 028: dup
      // 029: invokespecial java/util/ArrayList.<init> ()V
      // 02c: astore 4
      // 02e: aload 0
      // 02f: getfield qeaa361f143ee4a0894bd168fd9b30c66/qf4ccf8f5435d4a78bdca4d6a018b578e/aabaaa.bbb Ljava/util/concurrent/ConcurrentLinkedQueue;
      // 032: invokevirtual java/util/concurrent/ConcurrentLinkedQueue.poll ()Ljava/lang/Object;
      // 035: checkcast qeaa361f143ee4a0894bd168fd9b30c66/qf4ccf8f5435d4a78bdca4d6a018b578e/aababbab
      // 038: dup
      // 039: astore 5
      // 03b: ifnull 069
      // 03e: aload 4
      // 040: new qeaa361f143ee4a0894bd168fd9b30c66/qf4ccf8f5435d4a78bdca4d6a018b578e/abbbaba
      // 043: dup
      // 044: aload 5
      // 046: invokevirtual qeaa361f143ee4a0894bd168fd9b30c66/qf4ccf8f5435d4a78bdca4d6a018b578e/aababbab.b ()Ljava/lang/Object;
      // 049: aload 5
      // 04b: invokevirtual qeaa361f143ee4a0894bd168fd9b30c66/qf4ccf8f5435d4a78bdca4d6a018b578e/aababbab.ab ()Lio/netty/channel/ChannelPromise;
      // 04e: aload 5
      // 050: invokevirtual qeaa361f143ee4a0894bd168fd9b30c66/qf4ccf8f5435d4a78bdca4d6a018b578e/aababbab.a ()J
      // 053: aconst_null
      // 054: invokespecial qeaa361f143ee4a0894bd168fd9b30c66/qf4ccf8f5435d4a78bdca4d6a018b578e/abbbaba.<init> (Ljava/lang/Object;Lio/netty/channel/ChannelPromise;JLqeaa361f143ee4a0894bd168fd9b30c66/qf4ccf8f5435d4a78bdca4d6a018b578e/aabaaab;)V
      // 057: iload 3
      // 058: ifne 09a
      // 05b: invokeinterface java/util/List.add (Ljava/lang/Object;)Z 2
      // 060: pop
      // 061: iload 3
      // 062: ifeq 02e
      // 065: goto 069
      // 068: athrow
      // 069: aload 0
      // 06a: getfield qeaa361f143ee4a0894bd168fd9b30c66/qf4ccf8f5435d4a78bdca4d6a018b578e/aabaaa.bbab Ljava/util/concurrent/ConcurrentLinkedQueue;
      // 06d: invokevirtual java/util/concurrent/ConcurrentLinkedQueue.poll ()Ljava/lang/Object;
      // 070: checkcast qeaa361f143ee4a0894bd168fd9b30c66/qf4ccf8f5435d4a78bdca4d6a018b578e/aababbab
      // 073: dup
      // 074: astore 5
      // 076: ifnull 0a4
      // 079: aload 4
      // 07b: iload 3
      // 07c: ifne 0ab
      // 07f: new qeaa361f143ee4a0894bd168fd9b30c66/qf4ccf8f5435d4a78bdca4d6a018b578e/abbbaba
      // 082: dup
      // 083: aload 5
      // 085: invokevirtual qeaa361f143ee4a0894bd168fd9b30c66/qf4ccf8f5435d4a78bdca4d6a018b578e/aababbab.b ()Ljava/lang/Object;
      // 088: aload 5
      // 08a: invokevirtual qeaa361f143ee4a0894bd168fd9b30c66/qf4ccf8f5435d4a78bdca4d6a018b578e/aababbab.ab ()Lio/netty/channel/ChannelPromise;
      // 08d: aload 5
      // 08f: invokevirtual qeaa361f143ee4a0894bd168fd9b30c66/qf4ccf8f5435d4a78bdca4d6a018b578e/aababbab.a ()J
      // 092: aconst_null
      // 093: invokespecial qeaa361f143ee4a0894bd168fd9b30c66/qf4ccf8f5435d4a78bdca4d6a018b578e/abbbaba.<init> (Ljava/lang/Object;Lio/netty/channel/ChannelPromise;JLqeaa361f143ee4a0894bd168fd9b30c66/qf4ccf8f5435d4a78bdca4d6a018b578e/aabaaab;)V
      // 096: goto 09a
      // 099: athrow
      // 09a: invokeinterface java/util/List.add (Ljava/lang/Object;)Z 2
      // 09f: pop
      // 0a0: iload 3
      // 0a1: ifeq 069
      // 0a4: aload 0
      // 0a5: getfield qeaa361f143ee4a0894bd168fd9b30c66/qf4ccf8f5435d4a78bdca4d6a018b578e/aabaaa.aabbaa Ljava/util/concurrent/ConcurrentLinkedQueue;
      // 0a8: invokevirtual java/util/concurrent/ConcurrentLinkedQueue.poll ()Ljava/lang/Object;
      // 0ab: checkcast qeaa361f143ee4a0894bd168fd9b30c66/qf4ccf8f5435d4a78bdca4d6a018b578e/aabaaab
      // 0ae: dup
      // 0af: astore 6
      // 0b1: ifnull 0e4
      // 0b4: aload 4
      // 0b6: iload 3
      // 0b7: ifne 0eb
      // 0ba: goto 0be
      // 0bd: athrow
      // 0be: new qeaa361f143ee4a0894bd168fd9b30c66/qf4ccf8f5435d4a78bdca4d6a018b578e/abbbaba
      // 0c1: dup
      // 0c2: aload 6
      // 0c4: invokevirtual qeaa361f143ee4a0894bd168fd9b30c66/qf4ccf8f5435d4a78bdca4d6a018b578e/aabaaab.bb ()Ljava/lang/Object;
      // 0c7: aload 6
      // 0c9: invokevirtual qeaa361f143ee4a0894bd168fd9b30c66/qf4ccf8f5435d4a78bdca4d6a018b578e/aabaaab.a ()Lio/netty/channel/ChannelPromise;
      // 0cc: aload 6
      // 0ce: invokevirtual qeaa361f143ee4a0894bd168fd9b30c66/qf4ccf8f5435d4a78bdca4d6a018b578e/aabaaab.ab ()J
      // 0d1: aload 6
      // 0d3: invokespecial qeaa361f143ee4a0894bd168fd9b30c66/qf4ccf8f5435d4a78bdca4d6a018b578e/abbbaba.<init> (Ljava/lang/Object;Lio/netty/channel/ChannelPromise;JLqeaa361f143ee4a0894bd168fd9b30c66/qf4ccf8f5435d4a78bdca4d6a018b578e/aabaaab;)V
      // 0d6: invokeinterface java/util/List.add (Ljava/lang/Object;)Z 2
      // 0db: pop
      // 0dc: iload 3
      // 0dd: ifeq 0a4
      // 0e0: goto 0e4
      // 0e3: athrow
      // 0e4: aload 0
      // 0e5: getfield qeaa361f143ee4a0894bd168fd9b30c66/qf4ccf8f5435d4a78bdca4d6a018b578e/aabaaa.bb Ljava/util/concurrent/ConcurrentLinkedQueue;
      // 0e8: invokevirtual java/util/concurrent/ConcurrentLinkedQueue.poll ()Ljava/lang/Object;
      // 0eb: checkcast qeaa361f143ee4a0894bd168fd9b30c66/qf4ccf8f5435d4a78bdca4d6a018b578e/ababbb
      // 0ee: dup
      // 0ef: astore 7
      // 0f1: ifnull 123
      // 0f4: aload 4
      // 0f6: new qeaa361f143ee4a0894bd168fd9b30c66/qf4ccf8f5435d4a78bdca4d6a018b578e/abbbaba
      // 0f9: dup
      // 0fa: aload 7
      // 0fc: invokevirtual qeaa361f143ee4a0894bd168fd9b30c66/qf4ccf8f5435d4a78bdca4d6a018b578e/ababbb.bb ()Ljava/lang/Object;
      // 0ff: aload 7
      // 101: invokevirtual qeaa361f143ee4a0894bd168fd9b30c66/qf4ccf8f5435d4a78bdca4d6a018b578e/ababbb.ab ()Lio/netty/channel/ChannelPromise;
      // 104: aload 7
      // 106: invokevirtual qeaa361f143ee4a0894bd168fd9b30c66/qf4ccf8f5435d4a78bdca4d6a018b578e/ababbb.b ()J
      // 109: aconst_null
      // 10a: invokespecial qeaa361f143ee4a0894bd168fd9b30c66/qf4ccf8f5435d4a78bdca4d6a018b578e/abbbaba.<init> (Ljava/lang/Object;Lio/netty/channel/ChannelPromise;JLqeaa361f143ee4a0894bd168fd9b30c66/qf4ccf8f5435d4a78bdca4d6a018b578e/aabaaab;)V
      // 10d: iload 3
      // 10e: ifne 154
      // 111: goto 115
      // 114: athrow
      // 115: invokeinterface java/util/List.add (Ljava/lang/Object;)Z 2
      // 11a: pop
      // 11b: iload 3
      // 11c: ifeq 0e4
      // 11f: goto 123
      // 122: athrow
      // 123: aload 0
      // 124: getfield qeaa361f143ee4a0894bd168fd9b30c66/qf4ccf8f5435d4a78bdca4d6a018b578e/aabaaa.aba Ljava/util/concurrent/ConcurrentLinkedQueue;
      // 127: invokevirtual java/util/concurrent/ConcurrentLinkedQueue.poll ()Ljava/lang/Object;
      // 12a: checkcast qeaa361f143ee4a0894bd168fd9b30c66/qf4ccf8f5435d4a78bdca4d6a018b578e/ababbb
      // 12d: dup
      // 12e: astore 7
      // 130: ifnull 15e
      // 133: aload 4
      // 135: iload 3
      // 136: ifne 160
      // 139: new qeaa361f143ee4a0894bd168fd9b30c66/qf4ccf8f5435d4a78bdca4d6a018b578e/abbbaba
      // 13c: dup
      // 13d: aload 7
      // 13f: invokevirtual qeaa361f143ee4a0894bd168fd9b30c66/qf4ccf8f5435d4a78bdca4d6a018b578e/ababbb.bb ()Ljava/lang/Object;
      // 142: aload 7
      // 144: invokevirtual qeaa361f143ee4a0894bd168fd9b30c66/qf4ccf8f5435d4a78bdca4d6a018b578e/ababbb.ab ()Lio/netty/channel/ChannelPromise;
      // 147: aload 7
      // 149: invokevirtual qeaa361f143ee4a0894bd168fd9b30c66/qf4ccf8f5435d4a78bdca4d6a018b578e/ababbb.b ()J
      // 14c: aconst_null
      // 14d: invokespecial qeaa361f143ee4a0894bd168fd9b30c66/qf4ccf8f5435d4a78bdca4d6a018b578e/abbbaba.<init> (Ljava/lang/Object;Lio/netty/channel/ChannelPromise;JLqeaa361f143ee4a0894bd168fd9b30c66/qf4ccf8f5435d4a78bdca4d6a018b578e/aabaaab;)V
      // 150: goto 154
      // 153: athrow
      // 154: invokeinterface java/util/List.add (Ljava/lang/Object;)Z 2
      // 159: pop
      // 15a: iload 3
      // 15b: ifeq 123
      // 15e: aload 4
      // 160: invokedynamic applyAsLong ()Ljava/util/function/ToLongFunction; bsm=java/lang/invoke/LambdaMetafactory.metafactory (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;Ljava/lang/invoke/MethodType;Ljava/lang/invoke/MethodHandle;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[ (Ljava/lang/Object;)J, qeaa361f143ee4a0894bd168fd9b30c66/qf4ccf8f5435d4a78bdca4d6a018b578e/abbbaba.ab ()J, (Lqeaa361f143ee4a0894bd168fd9b30c66/qf4ccf8f5435d4a78bdca4d6a018b578e/abbbaba;)J ]
      // 165: invokestatic java/util/Comparator.comparingLong (Ljava/util/function/ToLongFunction;)Ljava/util/Comparator;
      // 168: invokeinterface java/util/List.sort (Ljava/util/Comparator;)V 2
      // 16d: bipush 0
      // 16e: istore 8
      // 170: aload 4
      // 172: invokeinterface java/util/List.iterator ()Ljava/util/Iterator; 1
      // 177: astore 9
      // 179: aload 9
      // 17b: invokeinterface java/util/Iterator.hasNext ()Z 1
      // 180: ifeq 202
      // 183: aload 9
      // 185: invokeinterface java/util/Iterator.next ()Ljava/lang/Object; 1
      // 18a: checkcast qeaa361f143ee4a0894bd168fd9b30c66/qf4ccf8f5435d4a78bdca4d6a018b578e/abbbaba
      // 18d: astore 10
      // 18f: iload 3
      // 190: ifne 1d1
      // 193: iload 3
      // 194: ifne 212
      // 197: goto 19b
      // 19a: athrow
      // 19b: aload 10
      // 19d: invokevirtual qeaa361f143ee4a0894bd168fd9b30c66/qf4ccf8f5435d4a78bdca4d6a018b578e/abbbaba.aa ()Ljava/lang/Object;
      // 1a0: instanceof net/minecraft/class_2828
      // 1a3: ifne 1c1
      // 1a6: goto 1aa
      // 1a9: athrow
      // 1aa: aload 10
      // 1ac: iload 3
      // 1ad: ifne 1eb
      // 1b0: goto 1b4
      // 1b3: athrow
      // 1b4: invokevirtual qeaa361f143ee4a0894bd168fd9b30c66/qf4ccf8f5435d4a78bdca4d6a018b578e/abbbaba.aa ()Ljava/lang/Object;
      // 1b7: instanceof net/minecraft/class_2833
      // 1ba: ifeq 1d5
      // 1bd: goto 1c1
      // 1c0: athrow
      // 1c1: aload 10
      // 1c3: invokevirtual qeaa361f143ee4a0894bd168fd9b30c66/qf4ccf8f5435d4a78bdca4d6a018b578e/abbbaba.a ()Lio/netty/channel/ChannelPromise;
      // 1c6: aload 2
      // 1c7: invokeinterface io/netty/channel/ChannelPromise.tryFailure (Ljava/lang/Throwable;)Z 2
      // 1cc: pop
      // 1cd: goto 1d1
      // 1d0: athrow
      // 1d1: iload 3
      // 1d2: ifeq 179
      // 1d5: iload 8
      // 1d7: aload 0
      // 1d8: aload 1
      // 1d9: aload 10
      // 1db: invokevirtual qeaa361f143ee4a0894bd168fd9b30c66/qf4ccf8f5435d4a78bdca4d6a018b578e/abbbaba.aa ()Ljava/lang/Object;
      // 1de: aload 10
      // 1e0: invokevirtual qeaa361f143ee4a0894bd168fd9b30c66/qf4ccf8f5435d4a78bdca4d6a018b578e/abbbaba.a ()Lio/netty/channel/ChannelPromise;
      // 1e3: invokevirtual qeaa361f143ee4a0894bd168fd9b30c66/qf4ccf8f5435d4a78bdca4d6a018b578e/aabaaa.abbaabb (Lio/netty/channel/ChannelHandlerContext;Ljava/lang/Object;Lio/netty/channel/ChannelPromise;)Z
      // 1e6: ior
      // 1e7: istore 8
      // 1e9: aload 10
      // 1eb: invokevirtual qeaa361f143ee4a0894bd168fd9b30c66/qf4ccf8f5435d4a78bdca4d6a018b578e/abbbaba.b ()Lqeaa361f143ee4a0894bd168fd9b30c66/qf4ccf8f5435d4a78bdca4d6a018b578e/aabaaab;
      // 1ee: ifnull 1fe
      // 1f1: aload 0
      // 1f2: aload 10
      // 1f4: invokevirtual qeaa361f143ee4a0894bd168fd9b30c66/qf4ccf8f5435d4a78bdca4d6a018b578e/abbbaba.b ()Lqeaa361f143ee4a0894bd168fd9b30c66/qf4ccf8f5435d4a78bdca4d6a018b578e/aabaaab;
      // 1f7: invokevirtual qeaa361f143ee4a0894bd168fd9b30c66/qf4ccf8f5435d4a78bdca4d6a018b578e/aabaaa.abbbbb (Lqeaa361f143ee4a0894bd168fd9b30c66/qf4ccf8f5435d4a78bdca4d6a018b578e/aabaaab;)V
      // 1fa: goto 1fe
      // 1fd: athrow
      // 1fe: iload 3
      // 1ff: ifeq 179
      // 202: iload 8
      // 204: ifeq 212
      // 207: aload 1
      // 208: invokeinterface io/netty/channel/ChannelHandlerContext.flush ()Lio/netty/channel/ChannelHandlerContext; 1
      // 20d: pop
      // 20e: goto 212
      // 211: athrow
      // 212: return
   }

   private static boolean abaaaa(class_2596 param0) {
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
      // 0b: getstatic qeaa361f143ee4a0894bd168fd9b30c66/qf4ccf8f5435d4a78bdca4d6a018b578e/aabaaa.a Lqeaa361f143ee4a0894bd168fd9b30c66/qf4ccf8f5435d4a78bdca4d6a018b578e/baabbba;
      // 0e: astore 2
      // 0f: aload 2
      // 10: iload 1
      // 11: ifne 1f
      // 14: ifnonnull 1e
      // 17: goto 1b
      // 1a: athrow
      // 1b: bipush 0
      // 1c: ireturn
      // 1d: athrow
      // 1e: aload 2
      // 1f: invokevirtual qeaa361f143ee4a0894bd168fd9b30c66/qf4ccf8f5435d4a78bdca4d6a018b578e/baabbba.ab ()Ljava/util/function/Predicate;
      // 22: aload 0
      // 23: invokeinterface java/util/function/Predicate.test (Ljava/lang/Object;)Z 2
      // 28: ireturn
      // 29: astore 3
      // 2a: aload 3
      // 2b: pop
      // 2c: bipush 0
      // 2d: ireturn
   }

   private void abaaab(ChannelHandlerContext param1) {
      // $VF: Couldn't be decompiled
      // Please report this to the Vineflower issue tracker, at https://github.com/Vineflower/vineflower/issues with a copy of the class file (if you have the rights to distribute it!)
      // java.lang.NullPointerException: Cannot invoke "org.jetbrains.java.decompiler.code.cfg.ExceptionRangeCFG.isCircular()" because "range" is null
      //   at org.jetbrains.java.decompiler.modules.decompiler.decompose.DomHelper.graphToStatement(DomHelper.java:84)
      //   at org.jetbrains.java.decompiler.modules.decompiler.decompose.DomHelper.parseGraph(DomHelper.java:203)
      //   at org.jetbrains.java.decompiler.main.rels.MethodProcessor.codeToJava(MethodProcessor.java:166)
      //
      // Bytecode:
      // 00: getstatic qeaa361f143ee4a0894bd168fd9b30c66/qf4ccf8f5435d4a78bdca4d6a018b578e/baaabbaa.bba I
      // 03: istore 2
      // 04: aload 0
      // 05: getfield qeaa361f143ee4a0894bd168fd9b30c66/qf4ccf8f5435d4a78bdca4d6a018b578e/aabaaa.bb Ljava/util/concurrent/ConcurrentLinkedQueue;
      // 08: invokevirtual java/util/concurrent/ConcurrentLinkedQueue.peek ()Ljava/lang/Object;
      // 0b: checkcast qeaa361f143ee4a0894bd168fd9b30c66/qf4ccf8f5435d4a78bdca4d6a018b578e/ababbb
      // 0e: astore 3
      // 0f: aload 3
      // 10: iload 2
      // 11: ifne 1c
      // 14: ifnull 2e
      // 17: goto 1b
      // 1a: athrow
      // 1b: aload 3
      // 1c: getfield qeaa361f143ee4a0894bd168fd9b30c66/qf4ccf8f5435d4a78bdca4d6a018b578e/ababbb.aa Lqeaa361f143ee4a0894bd168fd9b30c66/qf4ccf8f5435d4a78bdca4d6a018b578e/abaaaabba;
      // 1f: getstatic qeaa361f143ee4a0894bd168fd9b30c66/qf4ccf8f5435d4a78bdca4d6a018b578e/abaaaabba.ba Lqeaa361f143ee4a0894bd168fd9b30c66/qf4ccf8f5435d4a78bdca4d6a018b578e/abaaaabba;
      // 22: if_acmpne 2e
      // 25: aload 0
      // 26: aload 1
      // 27: invokevirtual qeaa361f143ee4a0894bd168fd9b30c66/qf4ccf8f5435d4a78bdca4d6a018b578e/aabaaa.abaabab (Lio/netty/channel/ChannelHandlerContext;)Z
      // 2a: goto 33
      // 2d: athrow
      // 2e: aload 0
      // 2f: aload 1
      // 30: invokevirtual qeaa361f143ee4a0894bd168fd9b30c66/qf4ccf8f5435d4a78bdca4d6a018b578e/aabaaa.abaaaba (Lio/netty/channel/ChannelHandlerContext;)Z
      // 33: istore 4
      // 35: iload 2
      // 36: ifne 7a
      // 39: iload 4
      // 3b: ifeq 6e
      // 3e: goto 42
      // 41: athrow
      // 42: aload 1
      // 43: invokeinterface io/netty/channel/ChannelHandlerContext.channel ()Lio/netty/channel/Channel; 1
      // 48: invokeinterface io/netty/channel/Channel.isOpen ()Z 1
      // 4d: iload 2
      // 4e: ifne 81
      // 51: goto 55
      // 54: athrow
      // 55: ifeq 6e
      // 58: goto 5c
      // 5b: athrow
      // 5c: aload 1
      // 5d: invokeinterface io/netty/channel/ChannelHandlerContext.flush ()Lio/netty/channel/ChannelHandlerContext; 1
      // 62: pop
      // 63: aload 0
      // 64: invokestatic java/lang/System.nanoTime ()J
      // 67: putfield qeaa361f143ee4a0894bd168fd9b30c66/qf4ccf8f5435d4a78bdca4d6a018b578e/aabaaa.aabba J
      // 6a: goto 6e
      // 6d: athrow
      // 6e: aload 0
      // 6f: getfield qeaa361f143ee4a0894bd168fd9b30c66/qf4ccf8f5435d4a78bdca4d6a018b578e/aabaaa.bbaba Ljava/util/concurrent/atomic/AtomicBoolean;
      // 72: bipush 0
      // 73: invokevirtual java/util/concurrent/atomic/AtomicBoolean.set (Z)V
      // 76: iload 2
      // 77: ifne a8
      // 7a: aload 0
      // 7b: getfield qeaa361f143ee4a0894bd168fd9b30c66/qf4ccf8f5435d4a78bdca4d6a018b578e/aabaaa.bb Ljava/util/concurrent/ConcurrentLinkedQueue;
      // 7e: invokevirtual java/util/concurrent/ConcurrentLinkedQueue.isEmpty ()Z
      // 81: ifne 9f
      // 84: aload 0
      // 85: aload 1
      // 86: aload 0
      // 87: aload 0
      // 88: getfield qeaa361f143ee4a0894bd168fd9b30c66/qf4ccf8f5435d4a78bdca4d6a018b578e/aabaaa.bb Ljava/util/concurrent/ConcurrentLinkedQueue;
      // 8b: invokevirtual java/util/concurrent/ConcurrentLinkedQueue.peek ()Ljava/lang/Object;
      // 8e: checkcast qeaa361f143ee4a0894bd168fd9b30c66/qf4ccf8f5435d4a78bdca4d6a018b578e/ababbb
      // 91: invokevirtual qeaa361f143ee4a0894bd168fd9b30c66/qf4ccf8f5435d4a78bdca4d6a018b578e/aabaaa.aaaaabb (Lqeaa361f143ee4a0894bd168fd9b30c66/qf4ccf8f5435d4a78bdca4d6a018b578e/ababbb;)J
      // 94: invokevirtual qeaa361f143ee4a0894bd168fd9b30c66/qf4ccf8f5435d4a78bdca4d6a018b578e/aabaaa.aaaabbb (Lio/netty/channel/ChannelHandlerContext;J)V
      // 97: iload 2
      // 98: ifeq ab
      // 9b: goto 9f
      // 9e: athrow
      // 9f: aload 0
      // a0: bipush 0
      // a1: putfield qeaa361f143ee4a0894bd168fd9b30c66/qf4ccf8f5435d4a78bdca4d6a018b578e/aabaaa.aaabab Z
      // a4: goto a8
      // a7: athrow
      // a8: invokestatic qeaa361f143ee4a0894bd168fd9b30c66/qf4ccf8f5435d4a78bdca4d6a018b578e/aabaaa.bbbaba ()V
      // ab: goto b9
      // ae: astore 3
      // af: aload 0
      // b0: getfield qeaa361f143ee4a0894bd168fd9b30c66/qf4ccf8f5435d4a78bdca4d6a018b578e/aabaaa.bbaba Ljava/util/concurrent/atomic/AtomicBoolean;
      // b3: bipush 0
      // b4: invokevirtual java/util/concurrent/atomic/AtomicBoolean.set (Z)V
      // b7: aload 3
      // b8: athrow
      // b9: return
   }

   private void abaaba(ChannelHandlerContext param1, Object param2, ChannelPromise param3) throws Exception {
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
      // 05: aload 2
      // 06: aload 3
      // 07: invokevirtual qeaa361f143ee4a0894bd168fd9b30c66/qf4ccf8f5435d4a78bdca4d6a018b578e/aabaaa.babaaa (Lio/netty/channel/ChannelHandlerContext;Ljava/lang/Object;Lio/netty/channel/ChannelPromise;)V
      // 0a: istore 4
      // 0c: invokestatic qeaa361f143ee4a0894bd168fd9b30c66/qf4ccf8f5435d4a78bdca4d6a018b578e/aabbabbbb.abaaaaa ()V
      // 0f: iload 4
      // 11: ifne 51
      // 14: invokestatic qeaa361f143ee4a0894bd168fd9b30c66/qf4ccf8f5435d4a78bdca4d6a018b578e/aabbabbbb.aaba ()V
      // 17: aload 0
      // 18: getfield qeaa361f143ee4a0894bd168fd9b30c66/qf4ccf8f5435d4a78bdca4d6a018b578e/aabaaa.aaab Z
      // 1b: ifeq 47
      // 1e: goto 22
      // 21: athrow
      // 22: aload 0
      // 23: iload 4
      // 25: ifne 4d
      // 28: goto 2c
      // 2b: athrow
      // 2c: getfield qeaa361f143ee4a0894bd168fd9b30c66/qf4ccf8f5435d4a78bdca4d6a018b578e/aabaaa.bbb Ljava/util/concurrent/ConcurrentLinkedQueue;
      // 2f: invokevirtual java/util/concurrent/ConcurrentLinkedQueue.isEmpty ()Z
      // 32: ifne 47
      // 35: goto 39
      // 38: athrow
      // 39: aload 0
      // 3a: bipush 0
      // 3b: putfield qeaa361f143ee4a0894bd168fd9b30c66/qf4ccf8f5435d4a78bdca4d6a018b578e/aabaaa.aaaaaa Z
      // 3e: aload 0
      // 3f: aload 1
      // 40: invokevirtual qeaa361f143ee4a0894bd168fd9b30c66/qf4ccf8f5435d4a78bdca4d6a018b578e/aabaaa.bbbbbb (Lio/netty/channel/ChannelHandlerContext;)V
      // 43: goto 47
      // 46: athrow
      // 47: aload 0
      // 48: bipush 0
      // 49: putfield qeaa361f143ee4a0894bd168fd9b30c66/qf4ccf8f5435d4a78bdca4d6a018b578e/aabaaa.ababb Z
      // 4c: aload 0
      // 4d: bipush 0
      // 4e: putfield qeaa361f143ee4a0894bd168fd9b30c66/qf4ccf8f5435d4a78bdca4d6a018b578e/aabaaa.aaab Z
      // 51: return
   }

   private boolean abaabb(ababbb param1) {
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
      // 05: getfield qeaa361f143ee4a0894bd168fd9b30c66/qf4ccf8f5435d4a78bdca4d6a018b578e/aabaaa.bb Ljava/util/concurrent/ConcurrentLinkedQueue;
      // 08: iload 2
      // 09: ifne 30
      // 0c: invokevirtual java/util/concurrent/ConcurrentLinkedQueue.size ()I
      // 0f: ldc_w -522994295
      // 12: ldc_w 732622354
      // 15: ldc_w -493318039
      // 18: ixor
      // 19: invokestatic qeaa361f143ee4a0894bd168fd9b30c66/qf4ccf8f5435d4a78bdca4d6a018b578e/aabaaa.baaaaab (II)I
      // 1c: ldc2_w 6550969807700643117
      // 1f: invokestatic qeaa361f143ee4a0894bd168fd9b30c66/qf4ccf8f5435d4a78bdca4d6a018b578e/aabaaa.abbbbab (IJ)I
      // 22: if_icmplt 2c
      // 25: goto 29
      // 28: athrow
      // 29: bipush 0
      // 2a: ireturn
      // 2b: athrow
      // 2c: aload 0
      // 2d: getfield qeaa361f143ee4a0894bd168fd9b30c66/qf4ccf8f5435d4a78bdca4d6a018b578e/aabaaa.bb Ljava/util/concurrent/ConcurrentLinkedQueue;
      // 30: aload 1
      // 31: invokevirtual java/util/concurrent/ConcurrentLinkedQueue.offer (Ljava/lang/Object;)Z
      // 34: pop
      // 35: bipush 1
      // 36: ireturn
   }

   public static void ababaa() {
      aababab();
   }

   private Integer ababab(Object param1) {
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
      // 09: instanceof net/minecraft/class_2596
      // 0c: ifeq 20
      // 0f: goto 13
      // 12: athrow
      // 13: aload 1
      // 14: goto 18
      // 17: athrow
      // 18: checkcast net/minecraft/class_2596
      // 1b: astore 3
      // 1c: iload 2
      // 1d: ifeq 23
      // 20: aconst_null
      // 21: areturn
      // 22: athrow
      // 23: aload 3
      // 24: invokestatic qeaa361f143ee4a0894bd168fd9b30c66/qf4ccf8f5435d4a78bdca4d6a018b578e/aabaaa.abaa (Lnet/minecraft/class_2596;)Ljava/lang/Integer;
      // 27: areturn
   }

   public static boolean ababba() {
      return bbabb;
   }

   private void ababbb(ChannelHandlerContext param1) {
      // $VF: Couldn't be decompiled
      // Please report this to the Vineflower issue tracker, at https://github.com/Vineflower/vineflower/issues with a copy of the class file (if you have the rights to distribute it!)
      // java.lang.RuntimeException: parsing failure!
      //   at org.jetbrains.java.decompiler.modules.decompiler.decompose.DomHelper.parseGraph(DomHelper.java:211)
      //   at org.jetbrains.java.decompiler.main.rels.MethodProcessor.codeToJava(MethodProcessor.java:166)
      //
      // Bytecode:
      // 00: getstatic qeaa361f143ee4a0894bd168fd9b30c66/qf4ccf8f5435d4a78bdca4d6a018b578e/baaabbaa.bba I
      // 03: istore 2
      // 04: invokestatic qeaa361f143ee4a0894bd168fd9b30c66/qf4ccf8f5435d4a78bdca4d6a018b578e/aabaaa.abba ()Lqeaa361f143ee4a0894bd168fd9b30c66/qf4ccf8f5435d4a78bdca4d6a018b578e/abbbbbbb;
      // 07: iload 2
      // 08: ifne 22
      // 0b: getstatic qeaa361f143ee4a0894bd168fd9b30c66/qf4ccf8f5435d4a78bdca4d6a018b578e/abbbbbbb.b Lqeaa361f143ee4a0894bd168fd9b30c66/qf4ccf8f5435d4a78bdca4d6a018b578e/abbbbbbb;
      // 0e: if_acmpne 1b
      // 11: goto 15
      // 14: athrow
      // 15: aload 0
      // 16: aload 1
      // 17: invokevirtual qeaa361f143ee4a0894bd168fd9b30c66/qf4ccf8f5435d4a78bdca4d6a018b578e/aabaaa.abaaabb (Lio/netty/channel/ChannelHandlerContext;)V
      // 1a: return
      // 1b: aload 0
      // 1c: getfield qeaa361f143ee4a0894bd168fd9b30c66/qf4ccf8f5435d4a78bdca4d6a018b578e/aabaaa.aabbaa Ljava/util/concurrent/ConcurrentLinkedQueue;
      // 1f: invokevirtual java/util/concurrent/ConcurrentLinkedQueue.peek ()Ljava/lang/Object;
      // 22: checkcast qeaa361f143ee4a0894bd168fd9b30c66/qf4ccf8f5435d4a78bdca4d6a018b578e/aabaaab
      // 25: astore 3
      // 26: iload 2
      // 27: ifne 3e
      // 2a: aload 3
      // 2b: ifnonnull 3f
      // 2e: goto 32
      // 31: athrow
      // 32: aload 0
      // 33: getfield qeaa361f143ee4a0894bd168fd9b30c66/qf4ccf8f5435d4a78bdca4d6a018b578e/aabaaa.abbb Ljava/util/concurrent/atomic/AtomicBoolean;
      // 36: bipush 0
      // 37: invokevirtual java/util/concurrent/atomic/AtomicBoolean.set (Z)V
      // 3a: goto 3e
      // 3d: athrow
      // 3e: return
      // 3f: aload 0
      // 40: aload 3
      // 41: getfield qeaa361f143ee4a0894bd168fd9b30c66/qf4ccf8f5435d4a78bdca4d6a018b578e/aabaaab.aa J
      // 44: aload 0
      // 45: aload 3
      // 46: invokevirtual qeaa361f143ee4a0894bd168fd9b30c66/qf4ccf8f5435d4a78bdca4d6a018b578e/aabaaa.aabaaaa (Lqeaa361f143ee4a0894bd168fd9b30c66/qf4ccf8f5435d4a78bdca4d6a018b578e/aabaaab;)J
      // 49: invokevirtual qeaa361f143ee4a0894bd168fd9b30c66/qf4ccf8f5435d4a78bdca4d6a018b578e/aabaaa.ababbbb (JJ)J
      // 4c: lstore 4
      // 4e: iload 2
      // 4f: ifne 84
      // 52: lload 4
      // 54: lconst_0
      // 55: lcmp
      // 56: ifle 6d
      // 59: goto 5d
      // 5c: athrow
      // 5d: aload 0
      // 5e: getfield qeaa361f143ee4a0894bd168fd9b30c66/qf4ccf8f5435d4a78bdca4d6a018b578e/aabaaa.abbb Ljava/util/concurrent/atomic/AtomicBoolean;
      // 61: bipush 0
      // 62: invokevirtual java/util/concurrent/atomic/AtomicBoolean.set (Z)V
      // 65: aload 0
      // 66: aload 1
      // 67: lload 4
      // 69: invokevirtual qeaa361f143ee4a0894bd168fd9b30c66/qf4ccf8f5435d4a78bdca4d6a018b578e/aabaaa.bbba (Lio/netty/channel/ChannelHandlerContext;J)V
      // 6c: return
      // 6d: aload 0
      // 6e: getfield qeaa361f143ee4a0894bd168fd9b30c66/qf4ccf8f5435d4a78bdca4d6a018b578e/aabaaa.aabbaa Ljava/util/concurrent/ConcurrentLinkedQueue;
      // 71: invokevirtual java/util/concurrent/ConcurrentLinkedQueue.poll ()Ljava/lang/Object;
      // 74: pop
      // 75: iload 2
      // 76: aload 0
      // 77: getfield qeaa361f143ee4a0894bd168fd9b30c66/qf4ccf8f5435d4a78bdca4d6a018b578e/aabaaa.bbbaa Ljava/util/Set;
      // 7a: aload 3
      // 7b: invokeinterface java/util/Set.remove (Ljava/lang/Object;)Z 2
      // 80: pop
      // 81: ifne b4
      // 84: aload 0
      // 85: aload 1
      // 86: aload 3
      // 87: getfield qeaa361f143ee4a0894bd168fd9b30c66/qf4ccf8f5435d4a78bdca4d6a018b578e/aabaaab.ba Ljava/lang/Object;
      // 8a: aload 3
      // 8b: getfield qeaa361f143ee4a0894bd168fd9b30c66/qf4ccf8f5435d4a78bdca4d6a018b578e/aabaaab.ab Lio/netty/channel/ChannelPromise;
      // 8e: invokevirtual qeaa361f143ee4a0894bd168fd9b30c66/qf4ccf8f5435d4a78bdca4d6a018b578e/aabaaa.abbaabb (Lio/netty/channel/ChannelHandlerContext;Ljava/lang/Object;Lio/netty/channel/ChannelPromise;)Z
      // 91: ifeq 9f
      // 94: aload 1
      // 95: invokeinterface io/netty/channel/ChannelHandlerContext.flush ()Lio/netty/channel/ChannelHandlerContext; 1
      // 9a: pop
      // 9b: goto 9f
      // 9e: athrow
      // 9f: aload 0
      // a0: aload 3
      // a1: invokevirtual qeaa361f143ee4a0894bd168fd9b30c66/qf4ccf8f5435d4a78bdca4d6a018b578e/aabaaa.abbbbb (Lqeaa361f143ee4a0894bd168fd9b30c66/qf4ccf8f5435d4a78bdca4d6a018b578e/aabaaab;)V
      // a4: aload 0
      // a5: iload 2
      // a6: ifne c3
      // a9: getfield qeaa361f143ee4a0894bd168fd9b30c66/qf4ccf8f5435d4a78bdca4d6a018b578e/aabaaa.abbb Ljava/util/concurrent/atomic/AtomicBoolean;
      // ac: bipush 0
      // ad: invokevirtual java/util/concurrent/atomic/AtomicBoolean.set (Z)V
      // b0: goto b4
      // b3: athrow
      // b4: aload 0
      // b5: getfield qeaa361f143ee4a0894bd168fd9b30c66/qf4ccf8f5435d4a78bdca4d6a018b578e/aabaaa.aabbaa Ljava/util/concurrent/ConcurrentLinkedQueue;
      // b8: invokevirtual java/util/concurrent/ConcurrentLinkedQueue.isEmpty ()Z
      // bb: ifne c7
      // be: aload 0
      // bf: goto c3
      // c2: athrow
      // c3: aload 1
      // c4: invokevirtual qeaa361f143ee4a0894bd168fd9b30c66/qf4ccf8f5435d4a78bdca4d6a018b578e/aabaaa.abbbbaa (Lio/netty/channel/ChannelHandlerContext;)V
      // c7: goto d5
      // ca: astore 3
      // cb: aload 0
      // cc: getfield qeaa361f143ee4a0894bd168fd9b30c66/qf4ccf8f5435d4a78bdca4d6a018b578e/aabaaa.abbb Ljava/util/concurrent/atomic/AtomicBoolean;
      // cf: bipush 0
      // d0: invokevirtual java/util/concurrent/atomic/AtomicBoolean.set (Z)V
      // d3: aload 3
      // d4: athrow
      // d5: return
   }

   public void handlerAdded(ChannelHandlerContext var1) {
      int var2 = baaabbaa.bba;

      label37: {
         try {
            boolean var10000 = abbabaa.aa();
            if (var2 != 0) {
               return;
            }

            if (var10000) {
               break label37;
            }
         } catch (Throwable var5) {
            throw var5;
         }

         this.ba = var1;
         abba.add(this);
         return;
      }

      try {
         var1.pipeline().remove(this);
      } catch (Throwable var4) {
      }
   }

   private boolean abbaaa(Object param1) {
      // $VF: Couldn't be decompiled
      // Please report this to the Vineflower issue tracker, at https://github.com/Vineflower/vineflower/issues with a copy of the class file (if you have the rights to distribute it!)
      // java.lang.RuntimeException: parsing failure!
      //   at org.jetbrains.java.decompiler.modules.decompiler.decompose.DomHelper.parseGraph(DomHelper.java:211)
      //   at org.jetbrains.java.decompiler.main.rels.MethodProcessor.codeToJava(MethodProcessor.java:166)
      //
      // Bytecode:
      // 000: getstatic qeaa361f143ee4a0894bd168fd9b30c66/qf4ccf8f5435d4a78bdca4d6a018b578e/baaabbaa.bba I
      // 003: istore 2
      // 004: invokestatic qeaa361f143ee4a0894bd168fd9b30c66/qf4ccf8f5435d4a78bdca4d6a018b578e/aabbabbbb.bbabbaa ()Z
      // 007: iload 2
      // 008: ifne 040
      // 00b: ifeq 03d
      // 00e: goto 012
      // 011: athrow
      // 012: aload 1
      // 013: invokestatic qeaa361f143ee4a0894bd168fd9b30c66/qf4ccf8f5435d4a78bdca4d6a018b578e/aabaaa.aaaaaa (Ljava/lang/Object;)Z
      // 016: iload 2
      // 017: ifne 040
      // 01a: goto 01e
      // 01d: athrow
      // 01e: ifeq 03d
      // 021: goto 025
      // 024: athrow
      // 025: invokestatic net/minecraft/class_310.method_1551 ()Lnet/minecraft/class_310;
      // 028: invokestatic qeaa361f143ee4a0894bd168fd9b30c66/qf4ccf8f5435d4a78bdca4d6a018b578e/aabbabbbb.ababbaa (Lnet/minecraft/class_310;)Z
      // 02b: iload 2
      // 02c: ifne 040
      // 02f: goto 033
      // 032: athrow
      // 033: ifne 03d
      // 036: goto 03a
      // 039: athrow
      // 03a: bipush 0
      // 03b: ireturn
      // 03c: athrow
      // 03d: getstatic qeaa361f143ee4a0894bd168fd9b30c66/qf4ccf8f5435d4a78bdca4d6a018b578e/aabaaa.ababbb Z
      // 040: iload 2
      // 041: ifne 04f
      // 044: ifeq 04e
      // 047: goto 04b
      // 04a: athrow
      // 04b: bipush 1
      // 04c: ireturn
      // 04d: athrow
      // 04e: bipush 0
      // 04f: istore 3
      // 050: getstatic qeaa361f143ee4a0894bd168fd9b30c66/qf4ccf8f5435d4a78bdca4d6a018b578e/aabaaa.aaaaab Z
      // 053: iload 2
      // 054: ifne 0aa
      // 057: ifeq 0a9
      // 05a: goto 05e
      // 05d: athrow
      // 05e: aload 1
      // 05f: instanceof net/minecraft/class_2596
      // 062: iload 2
      // 063: ifne 0aa
      // 066: goto 06a
      // 069: athrow
      // 06a: ifeq 0a9
      // 06d: goto 071
      // 070: athrow
      // 071: aload 1
      // 072: checkcast net/minecraft/class_2596
      // 075: astore 4
      // 077: getstatic qeaa361f143ee4a0894bd168fd9b30c66/qf4ccf8f5435d4a78bdca4d6a018b578e/aabaaa.aabaa Ljava/util/concurrent/ConcurrentHashMap;
      // 07a: new qeaa361f143ee4a0894bd168fd9b30c66/qf4ccf8f5435d4a78bdca4d6a018b578e/baaa
      // 07d: dup
      // 07e: aload 4
      // 080: invokespecial qeaa361f143ee4a0894bd168fd9b30c66/qf4ccf8f5435d4a78bdca4d6a018b578e/baaa.<init> (Lnet/minecraft/class_2596;)V
      // 083: invokevirtual java/util/concurrent/ConcurrentHashMap.remove (Ljava/lang/Object;)Ljava/lang/Object;
      // 086: ifnull 08e
      // 089: bipush 1
      // 08a: goto 08f
      // 08d: athrow
      // 08e: bipush 0
      // 08f: istore 3
      // 090: getstatic qeaa361f143ee4a0894bd168fd9b30c66/qf4ccf8f5435d4a78bdca4d6a018b578e/aabaaa.aabaa Ljava/util/concurrent/ConcurrentHashMap;
      // 093: invokevirtual java/util/concurrent/ConcurrentHashMap.isEmpty ()Z
      // 096: iload 2
      // 097: ifne 0aa
      // 09a: ifeq 0a9
      // 09d: goto 0a1
      // 0a0: athrow
      // 0a1: bipush 0
      // 0a2: putstatic qeaa361f143ee4a0894bd168fd9b30c66/qf4ccf8f5435d4a78bdca4d6a018b578e/aabaaa.aaaaab Z
      // 0a5: goto 0a9
      // 0a8: athrow
      // 0a9: iload 3
      // 0aa: iload 2
      // 0ab: ifne 103
      // 0ae: ifne 102
      // 0b1: goto 0b5
      // 0b4: athrow
      // 0b5: aload 1
      // 0b6: instanceof net/minecraft/class_2868
      // 0b9: iload 2
      // 0ba: ifne 103
      // 0bd: goto 0c1
      // 0c0: athrow
      // 0c1: ifne 102
      // 0c4: goto 0c8
      // 0c7: athrow
      // 0c8: invokestatic qeaa361f143ee4a0894bd168fd9b30c66/qf4ccf8f5435d4a78bdca4d6a018b578e/aabbabbbb.aaaaaba ()Z
      // 0cb: iload 2
      // 0cc: ifne 103
      // 0cf: goto 0d3
      // 0d2: athrow
      // 0d3: ifne 102
      // 0d6: goto 0da
      // 0d9: athrow
      // 0da: invokestatic qeaa361f143ee4a0894bd168fd9b30c66/qf4ccf8f5435d4a78bdca4d6a018b578e/bbabbbb.aaabba ()Z
      // 0dd: iload 2
      // 0de: ifne 103
      // 0e1: goto 0e5
      // 0e4: athrow
      // 0e5: ifne 102
      // 0e8: goto 0ec
      // 0eb: athrow
      // 0ec: aload 0
      // 0ed: getfield qeaa361f143ee4a0894bd168fd9b30c66/qf4ccf8f5435d4a78bdca4d6a018b578e/aabaaa.bbb Ljava/util/concurrent/ConcurrentLinkedQueue;
      // 0f0: invokevirtual java/util/concurrent/ConcurrentLinkedQueue.isEmpty ()Z
      // 0f3: iload 2
      // 0f4: ifne 103
      // 0f7: goto 0fb
      // 0fa: athrow
      // 0fb: ifne 106
      // 0fe: goto 102
      // 101: athrow
      // 102: bipush 1
      // 103: goto 107
      // 106: bipush 0
      // 107: ireturn
   }

   private void abbaab() {
      // $VF: Couldn't be decompiled
      // Please report this to the Vineflower issue tracker, at https://github.com/Vineflower/vineflower/issues with a copy of the class file (if you have the rights to distribute it!)
      // java.lang.RuntimeException: parsing failure!
      //   at org.jetbrains.java.decompiler.modules.decompiler.decompose.DomHelper.parseGraph(DomHelper.java:211)
      //   at org.jetbrains.java.decompiler.main.rels.MethodProcessor.codeToJava(MethodProcessor.java:166)
      //
      // Bytecode:
      // 00: getstatic qeaa361f143ee4a0894bd168fd9b30c66/qf4ccf8f5435d4a78bdca4d6a018b578e/baaabbaa.bba I
      // 03: aload 0
      // 04: getfield qeaa361f143ee4a0894bd168fd9b30c66/qf4ccf8f5435d4a78bdca4d6a018b578e/aabaaa.ba Lio/netty/channel/ChannelHandlerContext;
      // 07: astore 2
      // 08: istore 1
      // 09: aload 2
      // 0a: ifnonnull 0f
      // 0d: return
      // 0e: athrow
      // 0f: aload 0
      // 10: aload 2
      // 11: invokedynamic run (Lqeaa361f143ee4a0894bd168fd9b30c66/qf4ccf8f5435d4a78bdca4d6a018b578e/aabaaa;Lio/netty/channel/ChannelHandlerContext;)Ljava/lang/Runnable; bsm=java/lang/invoke/LambdaMetafactory.metafactory (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;Ljava/lang/invoke/MethodType;Ljava/lang/invoke/MethodHandle;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[ ()V, qeaa361f143ee4a0894bd168fd9b30c66/qf4ccf8f5435d4a78bdca4d6a018b578e/aabaaa.aabbab (Lio/netty/channel/ChannelHandlerContext;)V, ()V ]
      // 16: astore 3
      // 17: aload 2
      // 18: iload 1
      // 19: ifne 40
      // 1c: invokeinterface io/netty/channel/ChannelHandlerContext.executor ()Lio/netty/util/concurrent/EventExecutor; 1
      // 21: invokeinterface io/netty/util/concurrent/EventExecutor.inEventLoop ()Z 1
      // 26: ifeq 3b
      // 29: goto 2d
      // 2c: athrow
      // 2d: aload 3
      // 2e: invokeinterface java/lang/Runnable.run ()V 1
      // 33: iload 1
      // 34: ifeq 4b
      // 37: goto 3b
      // 3a: athrow
      // 3b: aload 2
      // 3c: goto 40
      // 3f: athrow
      // 40: invokeinterface io/netty/channel/ChannelHandlerContext.executor ()Lio/netty/util/concurrent/EventExecutor; 1
      // 45: aload 3
      // 46: invokeinterface io/netty/util/concurrent/EventExecutor.execute (Ljava/lang/Runnable;)V 2
      // 4b: return
   }

   private void abbaba(ChannelHandlerContext param1, Object param2, ChannelPromise param3) throws Exception {
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
      // 06: getfield qeaa361f143ee4a0894bd168fd9b30c66/qf4ccf8f5435d4a78bdca4d6a018b578e/aabaaa.bbb Ljava/util/concurrent/ConcurrentLinkedQueue;
      // 09: iload 4
      // 0b: ifne 3d
      // 0e: invokevirtual java/util/concurrent/ConcurrentLinkedQueue.size ()I
      // 11: ldc_w -522994296
      // 14: ldc_w 1465130295
      // 17: ldc_w 1842265725
      // 1a: ixor
      // 1b: invokestatic qeaa361f143ee4a0894bd168fd9b30c66/qf4ccf8f5435d4a78bdca4d6a018b578e/aabaaa.baaaaab (II)I
      // 1e: ldc2_w 6550969807700643117
      // 21: invokestatic qeaa361f143ee4a0894bd168fd9b30c66/qf4ccf8f5435d4a78bdca4d6a018b578e/aabaaa.abbbbab (IJ)I
      // 24: if_icmplt 39
      // 27: goto 2b
      // 2a: athrow
      // 2b: aload 0
      // 2c: aload 1
      // 2d: invokevirtual qeaa361f143ee4a0894bd168fd9b30c66/qf4ccf8f5435d4a78bdca4d6a018b578e/aabaaa.bbbbbb (Lio/netty/channel/ChannelHandlerContext;)V
      // 30: aload 0
      // 31: aload 1
      // 32: aload 2
      // 33: aload 3
      // 34: invokevirtual qeaa361f143ee4a0894bd168fd9b30c66/qf4ccf8f5435d4a78bdca4d6a018b578e/aabaaa.babaaa (Lio/netty/channel/ChannelHandlerContext;Ljava/lang/Object;Lio/netty/channel/ChannelPromise;)V
      // 37: return
      // 38: athrow
      // 39: aload 0
      // 3a: getfield qeaa361f143ee4a0894bd168fd9b30c66/qf4ccf8f5435d4a78bdca4d6a018b578e/aabaaa.bbb Ljava/util/concurrent/ConcurrentLinkedQueue;
      // 3d: invokevirtual java/util/concurrent/ConcurrentLinkedQueue.isEmpty ()Z
      // 40: istore 5
      // 42: aload 0
      // 43: iload 4
      // 45: ifne 63
      // 48: getfield qeaa361f143ee4a0894bd168fd9b30c66/qf4ccf8f5435d4a78bdca4d6a018b578e/aabaaa.bbb Ljava/util/concurrent/ConcurrentLinkedQueue;
      // 4b: aload 0
      // 4c: aload 2
      // 4d: aload 3
      // 4e: invokevirtual qeaa361f143ee4a0894bd168fd9b30c66/qf4ccf8f5435d4a78bdca4d6a018b578e/aabaaa.abbba (Ljava/lang/Object;Lio/netty/channel/ChannelPromise;)Lqeaa361f143ee4a0894bd168fd9b30c66/qf4ccf8f5435d4a78bdca4d6a018b578e/aababbab;
      // 51: invokevirtual java/util/concurrent/ConcurrentLinkedQueue.offer (Ljava/lang/Object;)Z
      // 54: pop
      // 55: iload 5
      // 57: ifeq 67
      // 5a: goto 5e
      // 5d: athrow
      // 5e: aload 0
      // 5f: goto 63
      // 62: athrow
      // 63: bipush 0
      // 64: putfield qeaa361f143ee4a0894bd168fd9b30c66/qf4ccf8f5435d4a78bdca4d6a018b578e/aabaaa.aaab Z
      // 67: return
   }

   // $VF: Irreducible bytecode was duplicated to produce valid code
   static {
      int var39 = -369038508;
      int var32 = 0;
      int var30 = "ǉ힏\ue752켃彴쿄輼짯靖섃齰썄\uf73f줯录\ud9a3ᝲ턤\uef3e쥏佖쏣읱찤蜼쐏彑쑣뽶\udea4⼺짯ὒ잃㽷\udc24缾쌏ᝓ즃ཷ\udd84휺쑏코젃齴쇄뜼\udd0f坖쾣併셄㜸\udeef\uf752쿃㝰틤윺쭏띑쉣坳푄ꜽ\ud80f䝗춃ί\udcc4霺쥏轑쏣坰\ud8c4켸싏ݓ햣罷\uda64弹쬯띒\udc03㽳쫄Ἶ\udc2f当\udc63齱칤伺\udb2f콖삃齵키圾얏罒툃轷퀤漻싏བ삣䝲핤漸쬏潖\udfc3⽲햄윾콏뽗쇃睵\uda44✽쏯\uf757푃轷큄缸춯\uf755츣꽲쁄朹죯㝖\ud943佶텤圿\udc2f띒\udde3睱젤윻캯\uf751쿃潶\udd64\uef38흯❖\ude23罶퓄㼾쓯睐\udca3靰퓤⼽\udacf\u1754\udfa3띳졤蜼쿏㝒싣䝳\udf04＾턏轓캃\ue777좤霼솯坖푃❲\ud844켹횏\udf50\udc43㝶큤蜸휯ݕ읣흷햄Ꜹ훯콒쩣佲졄伹\uda8f靔\ude83靵쵄윺\ude4f佐윃彷줄윺슏\ue751킣꽵쭤휻ퟏ齒\udae3\u1777\ud944꼿읯⽓\udd63❰잤\uf738\udbaf㝔\udf43콴진朸쬏\udf55흃㝵츄꼸쁯\uf757톣杰쯤ܹ섏❕쏣䝳푤Ἴ쵏睕\udf83\ue770\ude24뼻좯흒\udc83轱썄䜾왯읐솃뽰첤Ἱ읯靖첣\ue772턤霺삯꽑\ud8a3佲쫤Ꜻ쾯\u1755좃佷쒤༼\udbaf꽗퉃흷채ܽ콯靔폃ꝲ옄伾폯ｒ\udae3ݱ쑄\ue73a짏㽓\ud8a3꽷\uda44켼텏佗옣ꝵ솤ܼ왯靖셣\uef71팄㼽틏\uf756쯣佰\ud8a4鼻왯⽕캃蝵즄\uef3f찏\uef50\ud803佲\udce4輾쪯\u1755\udb63靳위\u173f쵯彐팃❳\uda84朽\udc2f齔쎃ά팤强읏罓\udb43坵줤＿텯띐홣ꝷ\udde4輺쳏㝓앣罶\uda04\u1739쒯흑팣❰\udd04\udf3c\ud8afꝒ휃ꝱ\ude04漻쒯㽐썣轷엄\uf73b촯ꝑ쌃흳풄\uef3c쐏蝗튃杴\udba4✽풏䝗샣坱퇤鼿촏Ꝗ\ud9c3꽵쒤缽첯蝕왃潲\ud804\udf39\ud9efὔ픣❴쌄꼽튏䝗츃\udf71쪄뼼푏띓욃ꝳ쭤漻쿯M\ude19勗켵狷\ud812諭\udc79닕쓕㫶얒芾쮹髓쁵ዳ\udb32窼젹鋑쯕\ue2f4퇲㊿탹⫗홵\u1af5\ud8d2\ueabf폹櫒쾵狴툲\ue2ba\ud999\u1ad6퇕竱쮲势\udd59\ue2d6톕䫶퇲㪽\udab9䫖쾵\ueaf5\udc52㊻휹닓좕⫵퉲㊸잙䫓썕髳쁲芺퉙ዐ퇵㫴푒媼콙㮝싕싳쌒°儆崱告봓妭㕘婆蔰䊊씔塍鵟䧦䴰偪蔖圭쵟䀆ല及ﴔ噭㵘䑆ⴵ巪봒伭䕝否䴶僊㴖傭쵞倦ᔵ䍪ꔔ寭핟儆\uf530堊\udd12䖍\uf55d䥦䔵傪䴕䘭\udd5c䋦ⴴ卪Ԗ䤭\uf55f俆攰嚪甕妭\ued5c䜆男僪䴑䩍浟䛆洶䗪紖䑍\udd59䣦崳妪ꔔ䍍൙分紱妪攗咍啟䬦锱塊봕乍镟䄆崴嗊㔓䦭ⵞ峦딱嶊디䇍蕝嗆洳䏪甖䷍㵝学攳䇊\uf515匍ᵘ历ꔷ忊봕䗍敚分ⴰ只씒凭ﵟ並䔵䬊봕崍핛媆ᴰ䕊崗岭啙亦攱只\uf514䇍ꕞ但┳䘪攐䃭ൟ䶆贵堪딓䤭ՙ囆봶咪ഖ姭絘䩆┴嗊洕䝍ꕘ䓆电\n\uf608庘\ue4a4\uf6baﮣﻷ\uef88뚚\uf064纼\u0010◵ꇫ⊙燈㕾ᆆ㧕৩㶙꧌ㄞ覅⥵쇭㔹㇎\n▕맬㜹ᇎ⠾ᦃ㰕凮⏹駈Pむ岯㰌璍㦋\uecc4⊠粫㍬\uf48d㧋擅㌠蒭ㄌ蒍に䳇㶠粬⌌\uf48a⡫\ue4c0㰀钨㥌䒋⊫䓀㯀㲯㚬鲍㷋ﳁ㊠ҫ⯌䲎㵫铄\u2fe0\uf4afぬ벊㍋Ⓡ㢠쒭\u2d6cҌ㍋Ⓛ㶀벭㞌\u0c8dㆋ䓇⿀풬⦬\u0c8d㋫\uecc5㶠\udcacレ뒉⩋쓅㟠钨㷌\udc8d㛋ⳇ⋠Ҩ\n≽䏭パ\uebcf\u2fd6\ue382㯽\uabef␑揉\u0010\u20ce木ア伎Ⅵ址㼮휮⚢✊㞥ꝇ㸎༮㈢㼈\n尪혲了縐冁癝䖪㸰婆\uf616"
         .length();
      short var34 = 8234;
      String[] var31 = new String[10];
      String var29 = "ǉ힏\ue752켃彴쿄輼짯靖섃齰썄\uf73f줯录\ud9a3ᝲ턤\uef3e쥏佖쏣읱찤蜼쐏彑쑣뽶\udea4⼺짯ὒ잃㽷\udc24缾쌏ᝓ즃ཷ\udd84휺쑏코젃齴쇄뜼\udd0f坖쾣併셄㜸\udeef\uf752쿃㝰틤윺쭏띑쉣坳푄ꜽ\ud80f䝗춃ί\udcc4霺쥏轑쏣坰\ud8c4켸싏ݓ햣罷\uda64弹쬯띒\udc03㽳쫄Ἶ\udc2f当\udc63齱칤伺\udb2f콖삃齵키圾얏罒툃轷퀤漻싏བ삣䝲핤漸쬏潖\udfc3⽲햄윾콏뽗쇃睵\uda44✽쏯\uf757푃轷큄缸춯\uf755츣꽲쁄朹죯㝖\ud943佶텤圿\udc2f띒\udde3睱젤윻캯\uf751쿃潶\udd64\uef38흯❖\ude23罶퓄㼾쓯睐\udca3靰퓤⼽\udacf\u1754\udfa3띳졤蜼쿏㝒싣䝳\udf04＾턏轓캃\ue777좤霼솯坖푃❲\ud844켹횏\udf50\udc43㝶큤蜸휯ݕ읣흷햄Ꜹ훯콒쩣佲졄伹\uda8f靔\ude83靵쵄윺\ude4f佐윃彷줄윺슏\ue751킣꽵쭤휻ퟏ齒\udae3\u1777\ud944꼿읯⽓\udd63❰잤\uf738\udbaf㝔\udf43콴진朸쬏\udf55흃㝵츄꼸쁯\uf757톣杰쯤ܹ섏❕쏣䝳푤Ἴ쵏睕\udf83\ue770\ude24뼻좯흒\udc83轱썄䜾왯읐솃뽰첤Ἱ읯靖첣\ue772턤霺삯꽑\ud8a3佲쫤Ꜻ쾯\u1755좃佷쒤༼\udbaf꽗퉃흷채ܽ콯靔폃ꝲ옄伾폯ｒ\udae3ݱ쑄\ue73a짏㽓\ud8a3꽷\uda44켼텏佗옣ꝵ솤ܼ왯靖셣\uef71팄㼽틏\uf756쯣佰\ud8a4鼻왯⽕캃蝵즄\uef3f찏\uef50\ud803佲\udce4輾쪯\u1755\udb63靳위\u173f쵯彐팃❳\uda84朽\udc2f齔쎃ά팤强읏罓\udb43坵줤＿텯띐홣ꝷ\udde4輺쳏㝓앣罶\uda04\u1739쒯흑팣❰\udd04\udf3c\ud8afꝒ휃ꝱ\ude04漻쒯㽐썣轷엄\uf73b촯ꝑ쌃흳풄\uef3c쐏蝗튃杴\udba4✽풏䝗샣坱퇤鼿촏Ꝗ\ud9c3꽵쒤缽첯蝕왃潲\ud804\udf39\ud9efὔ픣❴쌄꼽튏䝗츃\udf71쪄뼼푏띓욃ꝳ쭤漻쿯M\ude19勗켵狷\ud812諭\udc79닕쓕㫶얒芾쮹髓쁵ዳ\udb32窼젹鋑쯕\ue2f4퇲㊿탹⫗홵\u1af5\ud8d2\ueabf폹櫒쾵狴툲\ue2ba\ud999\u1ad6퇕竱쮲势\udd59\ue2d6톕䫶퇲㪽\udab9䫖쾵\ueaf5\udc52㊻휹닓좕⫵퉲㊸잙䫓썕髳쁲芺퉙ዐ퇵㫴푒媼콙㮝싕싳쌒°儆崱告봓妭㕘婆蔰䊊씔塍鵟䧦䴰偪蔖圭쵟䀆ല及ﴔ噭㵘䑆ⴵ巪봒伭䕝否䴶僊㴖傭쵞倦ᔵ䍪ꔔ寭핟儆\uf530堊\udd12䖍\uf55d䥦䔵傪䴕䘭\udd5c䋦ⴴ卪Ԗ䤭\uf55f俆攰嚪甕妭\ued5c䜆男僪䴑䩍浟䛆洶䗪紖䑍\udd59䣦崳妪ꔔ䍍൙分紱妪攗咍啟䬦锱塊봕乍镟䄆崴嗊㔓䦭ⵞ峦딱嶊디䇍蕝嗆洳䏪甖䷍㵝学攳䇊\uf515匍ᵘ历ꔷ忊봕䗍敚分ⴰ只씒凭ﵟ並䔵䬊봕崍핛媆ᴰ䕊崗岭啙亦攱只\uf514䇍ꕞ但┳䘪攐䃭ൟ䶆贵堪딓䤭ՙ囆봶咪ഖ姭絘䩆┴嗊洕䝍ꕘ䓆电\n\uf608庘\ue4a4\uf6baﮣﻷ\uef88뚚\uf064纼\u0010◵ꇫ⊙燈㕾ᆆ㧕৩㶙꧌ㄞ覅⥵쇭㔹㇎\n▕맬㜹ᇎ⠾ᦃ㰕凮⏹駈Pむ岯㰌璍㦋\uecc4⊠粫㍬\uf48d㧋擅㌠蒭ㄌ蒍に䳇㶠粬⌌\uf48a⡫\ue4c0㰀钨㥌䒋⊫䓀㯀㲯㚬鲍㷋ﳁ㊠ҫ⯌䲎㵫铄\u2fe0\uf4afぬ벊㍋Ⓡ㢠쒭\u2d6cҌ㍋Ⓛ㶀벭㞌\u0c8dㆋ䓇⿀풬⦬\u0c8d㋫\uecc5㶠\udcacレ뒉⩋쓅㟠钨㷌\udc8d㛋ⳇ⋠Ҩ\n≽䏭パ\uebcf\u2fd6\ue382㯽\uabef␑揉\u0010\u20ce木ア伎Ⅵ址㼮휮⚢✊㞥ꝇ㸎༮㈢㼈\n尪혲了縐冁癝䖪㸰婆\uf616";
      int var33 = 0;

      do {
         char var35 = var29.charAt(var33);
         int var10001 = var33 + 1;
         int var10002 = var33 + 1;
         int var37 = 0;
         char[] var36 = var29.substring(var10001, var10002 + var35).toCharArray();

         do {
            int var38 = var36[var37];

            var38 = (char)(switch (var37 % 6) {
               default -> 80;
               case 1 -> 163;
               case 2 -> 28;
               case 3 -> 134;
               case 4 -> 155;
               case 5 -> 201;
            }) ^ var38;
            if (var37 % 2 == 0) {
               var36[var37] = (char)((var38 >>> 5 | var38 << 11) & 65535 ^ var34);
            } else {
               var36[var37] = (char)((var38 << 5 | var38 >>> 11) & 65535 ^ var34);
            }
         } while (++var37 < var36.length);

         var31[var32] = new String(var36);
         var32++;
         var33 = var33 + var35 + 1;
      } while (var33 < var30);

      abbaba = var31;
      abbabb = new Object[var31.length];
      int var25 = -1018951722;
      byte[] var23 = ":\u0098½\u0018$Iþ\u0084µ{Í¸ Þ\u000bðÕ\u0080\u00ad\u0006\u0006ý\u0093\u009d¬L¬{C\u000fÑ\u0082\u0013óÀ#ÜgÄ\u0015ï\u0085xËöLD\u0011\u001e÷7\u001cç\u0091AF\u0002\u0012\u001eÐK\"½\u0098ù\u0086¹\u0099Ñ,+\u0085ã¤.\u008b\u0011ð\u0080 ÝEMËí\u0004\u0088¢ØiÊfÞ<ª6 \u0015\u0095ÇWb¿\u001aý\u0005*çRØ\u00adõ\u0089Jñ\u0002¡-ÍÁKþ\u001cõ\u007f-^£\u001e½\u0093º¶Øo4Blì\u0091\u008bÛ(\u0098ß\u0081[v\u0007hs6\u001a\u009eÊÊ4BõYéïÌ'\u008e±\u008bbE»¡ò.ø@Ú\u001c=¸yäd¦ÓzÊ~j\u0096È¬\u001dt\u0091J\u0096Àh\u0091¤a\u001bÃÎÎö\u0019lÁøï\u0007vå½\b¼\u001a¨<4Ø\u0007\u0092Æ´\u000f¶*'?\tãì\u008c\u0000\r\u008aÊA\u001a\u0018-iØ¿?¶\u009bÑpl\u0005U,iNÌ§\u00ad\u0018á\u0099û²b¾/Ü\u001cÊ\u0081\u008bÏ¶\u0084Z>ÞQBd\u0002\u009fÛËLæãJÐ\u0010\f\u0094UC\u008dÑÆµ´\n®¥\u0087·wdN|c¢Ä\u0086\u0013p6\u001f\u0007\u0000{DWs±=¬}OÕk³QÞ\"vå\u001e¸\u0086}{\u0011>, \u008e¿b\u001eç\n\u0004\u00ad\u0001\u0013K¨\u0099~ë\u0010BS\u000bdNFE¯^ÎjQ£i»C\u0085{þE\u0001`³ô&ÒÝüß\u0085\u0089\u0095îÞØÕª\u0004T\u001eà\u0017ÒW²T\t\u008egü°\u0088§L\u0099\u0088ÇÆîzéö\u0019\u0000ú¥ÝcÿI\u0015Zú\ræò'=ÜÆ.wc\fÓµ\u0086\bÓ4é²øL\u0081\u000f§d\u0082Ñø\u001bq\u0011$@Ö\tsË\u0099YE=*\u000e+³\bW`>1ÛªR@^\u0098lå\u0096\u0097\u000bì\u009fd\u001a·ÈÎ\u0080\u0081é\u009e21íÔ\u0014\u008cå´\u0083\u001eª\u009b9sÖ\u0085q\u0007`\u000fNY\u0010ßi\u009d©\u0087¾\u009cò\u0092èÅåÚ\u0086Ú|rf\u0011À&T\u009e\u0012\u009bFj\u001bÙx%)4\"°þ£úì\u008d\u0098\u008aõ\r\u008f¡Ð«¡\u0007U$àÝ\u009eÎÖ÷/P\u008f\u0005*á9\u0097`¼÷°KìVô\u0097\u0082ªîäÔ©\u008eÙÁÜ\u0014á\u0019\u008c<Å\u009br7O¸\u0098¯\u0091\u001e\n\u008aF\nÑ\u0018¤3\u001fÑ2Y\u0002`ÒeW?U\u0092\u008a¡¥À\u0080  òKy%18ë\u000eò}o\u008eQÌMë\u0007w\u0003\u0000°»«\u0086½\u000f\u009d·\u008c\u0016\u001a\b\u0080\u001bDus\u0003ßõÆ´è¹\u009be\u0087\u009b~yø\u009fqÈ,´\u001c\u0089\r¾\u0006¦o\u0088ÅÜý³eJt`¶U\u0099\u0000%q \\ù\u0097ç}Æ\u008dçåª\b§Ï\u008cqh1±c6\u008f\u00845\u0092{I\u0000÷\b®µ1'\u0081ñwìÞ\u008fÐó\u0095Ñ]\u0014\u009b\u008a\u0000¹\u0094~A\nÀ\u0081\u009c\u0005½\u0080¶âè½N\u001c)ÜÐøØ\b¸ô\u0019\u0087.¦¸tÝQ]wÙ*_ l×\u0097\u00142ü\u0081:\u0080\u0015ã?Óî\u0093\u001eî,n\u008býY\u00023RP\u0098©iG»r\u0084}Z\u0003\f\u0010Ð©ÏÉL\\âòF.\u0094!2jTT\u0080\u000fz3ú£7ç\u00ade Õ\\\u000eM¿©nn¨\u001b)êÌQv\u000fÁ§\u001fµ\u000bå¼\u000f¹õ½Ã\u0018\u0091V\u0011°Wò`àA\u0003½!qÕò[üz»Ûä³ñ¯\n|ee,4\u009fÄ\u001fþëßÈ6Aü\u0097à\u007fóîõ¹\u0087S©·ÿ«\u008c\u0093+×\u0089=/&Î6V\f^·±[\u0099\u001f^ó\u0003\\\u0080¡û\u0091&¾\u0092\bäl\\o8\u0091\u0019\u0086|fù0\u009aÜÂ\u009f:\u0093\u0087j°¢R\bß%\u001ac\u007fÜw\u009fÜ\u009c\u0003:Rïæ \u009e\u0098W\u009eÂLµ8ØÌeÞËdOVY4ÈSØëñ%Á¶·è\u0092\u0006Ë5¬\u0099þ|Êø¥5y¸\u0015Ì\u009a\u001bÍ\"´ÚëÝ|\u0084ª_yõú>öÖµ\u0093ú\u0098IV,Ó\u0000{êinì»´Zpt\r;\u0097¥$¢<\u0003>\u008dxLH-\u0002\u008c\u0096g¢c¥\u0012é3¶÷\u0017\u008f¼ÎÂå\u0087ÎS\u0086VÄù\u0091\u008ejÚ\u009aS N\u0097Ü¹E¢©h\u0093®Úiiõù\u0092\u0012¸÷w\u0015é¾0^\u009cî£æïzZÊ\u008eTÌDoVcxTsm»v\u009ed5ïbk\u001c\bÖ\u0018\u009do·6\u0084GM¢y¾¹GïºÚ\u008eLùYÆDy¤¨n7Nç·§WM=ÁAVü}\u001bÇCkfacñ01µ\u0092\u0096ÀÊÌ\u0099_2Õ!\u0088\u008eqfÐ\u009b÷Üwèï\u00adYZpHÉû\u0099AEªoÁ\u001fs\u0003ïº;\u0087 èuo$fR²\u00ad¤¿)¤ö6\u001cö¨?ÊÄ=ådÍ\u001cÅpëìõ Ò\u0006¬\u009e\u0093\u009fv«r\u0088Ç8ü \r¡à.?H¬iq«ÿlS|ã\u0016h;\u0011\u0016]ñ46O?'\u008c96r¡×\u001aP\u00996Àþ3d\u0096\u001d»ÃzüeL\u0014Ë¥u\t\u0099²n\u009bâá\u0015ÉÀ§¨+Ár\u0013\u009fR\u009bÞÇ$Yt°iÓ`\u0012\u0092ÇFg´S¹sN\u0019<\u001e\u0094\u0083\u001fâ)Ò \u0095i:²n\u0011ã£\u0086CN%.\u007f[ï\u009fâ=Yq\u0091\u0094v\u0019\u009aÚ@\n&ouDÙâ\u000f,Ú\u0013\u008c$u\u0092M\n\u008f\u008bîÑ\u001a·Ærê«àÖO_¸¸\u008d\u008dì\u008c{wÉìÀZ®\u00816ÙZZ\u0085\u0002'\\!t\u001a§µ[Ki²í\u0005Ü\u0089\u009e\b\u0081¸Ôå\u000eÌ°ýÒ*\u008aÍÇ®\u008c®\u0091N}\u0019×¢\u0083ïO\u009cð\u0098b\u001dËÂ"
         .getBytes("ISO-8859-1");
      int var24 = var23.length / 4;
      abbaab = new int[var24];
      byte var26 = 0;
      int var27 = 0;

      do {
         int var28 = (var23[var26] & 255) << 24 | (var23[var26 + 1] & 255) << 16 | (var23[var26 + 2] & 255) << 8 | var23[var26 + 3] & 255;
         var28 ^= var25;
         abbaab[var27] = var28;
         var26 += 4;
      } while (++var27 < var24);

      String[] var21 = new String[baaaaab(-522994190, var39 ^ -397100503)];
      int var19 = 0;
      String var18;
      int var20 = (var18 = baaaaba(-1033132910, var39 ^ 1799936077)).length();
      int var17 = baaaaab(-522994179, var39 ^ 377325059);
      int var43 = -1;

      label140:
      while (true) {
         String var46 = var18.substring(++var43, var43 + var17);
         int var55 = -1;

         while (true) {
            char[] var77;
            label135: {
               char[] var57 = var46.toCharArray();
               int var10003 = var57.length;
               int var22 = 0;
               var77 = var57;
               var55 = var10003;
               char[] var93;
               int var10004;
               if (var10003 <= 1) {
                  var93 = var57;
                  var10004 = var22;
               } else {
                  var77 = var57;
                  var55 = var10003;
                  if (var10003 <= var22) {
                     break label135;
                  }

                  var93 = var57;
                  var10004 = var22;
               }

               while (true) {
                  var93[var10004] = (char)(var93[var10004] ^ switch (var22 % baaaaab(-522994178, var39 ^ 1689304587)) {
                     case 0 -> baaaaab(-522994183, var39 ^ -1088232753);
                     case 1 -> baaaaab(-522994184, var39 ^ -1757028804);
                     case 2 -> baaaaab(-522994181, var39 ^ 2106986301);
                     case 3 -> baaaaab(-522994182, var39 ^ 1229278574);
                     case 4 -> baaaaab(-522994235, var39 ^ 685080670);
                     case 5 -> baaaaab(-522994236, var39 ^ -2135916781);
                     default -> baaaaab(-522994233, var39 ^ 1946484546);
                  });
                  var22++;
                  if (var55 == 0) {
                     var10004 = var55;
                     var93 = var77;
                  } else {
                     if (var55 <= var22) {
                        break;
                     }

                     var93 = var77;
                     var10004 = var22;
                  }
               }
            }

            String var100 = new String(var77).intern();
            switch (var55) {
               case 0:
                  var21[var19++] = var100;
                  if ((var43 += var17) >= var20) {
                     bbbab = var21;
                     aabaaa = new String[baaaaab(-522994177, var39 ^ -882033931)];
                     long var8 = 3275048931915365870L;
                     long[] var14 = new long[baaaaab(-522994234, var39 ^ -1112327345)];
                     int var11 = 0;
                     String var12;
                     int var13 = (var12 = baaaaba(-1033132912, var39 ^ 664533703)).length();
                     byte var10 = 0;

                     label114:
                     while (true) {
                        int var64 = var10;
                        var10 += 8;
                        var46 = var12.substring(var64, var10);
                        var64 = -1033132911;
                        int var83 = var39 ^ 1375835975;
                        byte[] var15 = var46.getBytes("ISO-8859-1");
                        long[] var49 = var14;
                        var64 = var11++;
                        long var84 = (var15[0] & 255L) << baaaaab(-522994239, var39 ^ -370587514)
                           | (var15[1] & 255L) << baaaaab(-522994240, var39 ^ 822108383)
                           | (var15[2] & 255L) << baaaaab(-522994237, var39 ^ 754374952)
                           | (var15[3] & 255L) << baaaaab(-522994238, var39 ^ 36365954)
                           | (var15[4] & 255L) << baaaaab(-522994227, var39 ^ -544743429)
                           | (var15[5] & 255L) << baaaaab(-522994228, var39 ^ -1193699161)
                           | (var15[baaaaab(-522994225, var39 ^ 1943253566)] & 255L) << baaaaab(-522994226, var39 ^ 412111637)
                           | var15[baaaaab(-522994231, var39 ^ 710257584)] & 255L;
                        byte var101 = -1;

                        while (true) {
                           long var106 = var84 ^ var8;
                           switch (var101) {
                              case 0:
                                 var49[var64] = var106;
                                 if (var10 >= var13) {
                                    aaaa = var14;
                                    ababa = new Integer[baaaaab(-522994221, var39 ^ -1972192258)];
                                    aabbab = abbbbab(baaaaab(-522994222, var39 ^ 45091022), 2610739242679463209L);
                                    aaabbb = abbbbab(baaaaab(-522994211, var39 ^ -253900074), 2514001988621546287L);
                                    babb = abbbbab(baaaaab(-522994212, var39 ^ 474931276), 6640179787160075580L);
                                    bbaaa = abbbbab(baaaaab(-522994209, var39 ^ -712731368), 6641463802677589460L);
                                    bab = abbbbab(baaaaab(-522994210, var39 ^ 1004720371), 1727064867986470412L);
                                    bba = abbbbab(baaaaab(-522994215, var39 ^ 745561093), 3437704265185812272L);
                                    aabb = abbbbab(baaaaab(-522994216, var39 ^ -287900973), 2514001988621546287L);
                                    babaa = abbbbab(baaaaab(-522994213, var39 ^ -1380357413), 1727064867986470412L);
                                    baab = abbbbab(baaaaab(-522994214, var39 ^ 859628187), 4937456118354455462L);
                                    bbaab = abbbbab(baaaaab(-522994267, var39 ^ 2024065853), 5205326578725865908L);
                                    aaabba = abbbbab(baaaaab(-522994268, var39 ^ 780792590), 7348689533952050757L);
                                    bbbbb = abbbbab(baaaaab(-522994265, var39 ^ -2079616823), 1004214337193183820L);
                                    long var0 = 763798372179438573L;
                                    long[] var6 = new long[baaaaab(-522994266, var39 ^ -361440990)];
                                    int var3 = 0;
                                    String var4;
                                    int var5 = (var4 = baaaaba(-1033132908, var39 ^ 340901479)).length();
                                    byte var2 = 0;

                                    label104:
                                    while (true) {
                                       int var69 = var2;
                                       var2 += 8;
                                       var46 = var4.substring(var69, var2);
                                       var69 = -1033132907;
                                       int var87 = var39 ^ -56438227;
                                       byte[] var7 = var46.getBytes("ISO-8859-1");
                                       long[] var52 = var6;
                                       var69 = var3++;
                                       long var88 = (var7[0] & 255L) << baaaaab(-522994271, var39 ^ -1113086700)
                                          | (var7[1] & 255L) << baaaaab(-522994272, var39 ^ 1817628120)
                                          | (var7[2] & 255L) << baaaaab(-522994269, var39 ^ 1946947869)
                                          | (var7[3] & 255L) << baaaaab(-522994270, var39 ^ -308060323)
                                          | (var7[4] & 255L) << baaaaab(-522994259, var39 ^ -719141972)
                                          | (var7[5] & 255L) << baaaaab(-522994260, var39 ^ 989611750)
                                          | (var7[baaaaab(-522994257, var39 ^ -1145449191)] & 255L) << baaaaab(-522994258, var39 ^ -2107458294)
                                          | var7[baaaaab(-522994263, var39 ^ -1310759731)] & 255L;
                                       byte var103 = -1;

                                       while (true) {
                                          var106 = var88 ^ var0;
                                          switch (var103) {
                                             case 0:
                                                var52[var69] = var106;
                                                if (var2 >= var5) {
                                                   ababaa = var6;
                                                   abaaaa = new Long[baaaaab(-522994253, var39 ^ 449355017)];
                                                   ab = aaa(baaaaab(-522994254, var39 ^ 1417055195), 7820645193388136116L);
                                                   baa = aaa(baaaaab(-522994243, var39 ^ 851778953), 1477847457415145343L);
                                                   abaa = TimeUnit.MILLISECONDS.toNanos(1L);
                                                   aaaab = TimeUnit.MILLISECONDS.toNanos(aaa(baaaaab(-522994244, var39 ^ 2109820554), 3822889679528369044L));
                                                   ababba = TimeUnit.MILLISECONDS.toNanos(aaa(baaaaab(-522994241, var39 ^ -579238634), 3646720796519722283L));
                                                   int var54 = baaaaab(-522994242, var39 ^ 1024287796);
                                                   abba = ConcurrentHashMap.newKeySet();
                                                   baba = new Object();
                                                   aaabaa = false;
                                                   bbabb = false;
                                                   aabaab = false;
                                                   baaba = false;
                                                   baabb = abaaaabba.aa;
                                                   aababb = abbbbbbb.a;
                                                   abbbb = aaa(var54, 1947094968767108647L);
                                                   aabaa = new ConcurrentHashMap();
                                                   babbb = ConcurrentHashMap.newKeySet();
                                                   babba = new ConcurrentHashMap();
                                                   return;
                                                }
                                                break;
                                             default:
                                                var52[var69] = var106;
                                                if (var2 < var5) {
                                                   continue label104;
                                                }

                                                var5 = (var4 = baaaaba(-1033132902, var39 ^ 1690434856)).length();
                                                var2 = 0;
                                          }

                                          int var72 = var2;
                                          var2 += 8;
                                          var46 = var4.substring(var72, var2);
                                          var72 = -1033132901;
                                          int var90 = var39 ^ 1196487751;
                                          var7 = var46.getBytes("ISO-8859-1");
                                          var52 = var6;
                                          var69 = var3++;
                                          var88 = (var7[0] & 255L) << baaaaab(-522994264, var39 ^ 2014605371)
                                             | (var7[1] & 255L) << baaaaab(-522994261, var39 ^ -219283214)
                                             | (var7[2] & 255L) << baaaaab(-522994262, var39 ^ 7804043)
                                             | (var7[3] & 255L) << baaaaab(-522994251, var39 ^ 1294746847)
                                             | (var7[4] & 255L) << baaaaab(-522994252, var39 ^ -2024423464)
                                             | (var7[5] & 255L) << baaaaab(-522994249, var39 ^ 2042460173)
                                             | (var7[baaaaab(-522994250, var39 ^ 1739993539)] & 255L) << baaaaab(-522994255, var39 ^ -747197642)
                                             | var7[baaaaab(-522994256, var39 ^ 1259537038)] & 255L;
                                          var103 = 0;
                                       }
                                    }
                                 }
                                 break;
                              default:
                                 var49[var64] = var106;
                                 if (var10 < var13) {
                                    continue label114;
                                 }

                                 var13 = (var12 = baaaaba(-1033132906, var39 ^ -1135943592)).length();
                                 var10 = 0;
                           }

                           int var67 = var10;
                           var10 += 8;
                           var46 = var12.substring(var67, var10);
                           var67 = -1033132905;
                           int var86 = var39 ^ -1130513370;
                           var15 = var46.getBytes("ISO-8859-1");
                           var49 = var14;
                           var64 = var11++;
                           var84 = (var15[0] & 255L) << baaaaab(-522994232, var39 ^ -770919126)
                              | (var15[1] & 255L) << baaaaab(-522994229, var39 ^ 1285713288)
                              | (var15[2] & 255L) << baaaaab(-522994230, var39 ^ -1600077834)
                              | (var15[3] & 255L) << baaaaab(-522994219, var39 ^ 1123637594)
                              | (var15[4] & 255L) << baaaaab(-522994220, var39 ^ -167738783)
                              | (var15[5] & 255L) << baaaaab(-522994217, var39 ^ 1467207696)
                              | (var15[baaaaab(-522994218, var39 ^ -123860295)] & 255L) << baaaaab(-522994223, var39 ^ -141493033)
                              | var15[baaaaab(-522994224, var39 ^ 1083027160)] & 255L;
                           var101 = 0;
                        }
                     }
                  }

                  var17 = var18.charAt(var43);
                  break;
               default:
                  var21[var19++] = var100;
                  if ((var43 += var17) < var20) {
                     var17 = var18.charAt(var43);
                     continue label140;
                  }

                  var20 = (var18 = baaaaba(-1033132909, var39 ^ -617159834)).length();
                  var17 = baaaaab(-522994180, var39 ^ 1628089539);
                  var43 = -1;
            }

            var46 = var18.substring(++var43, var43 + var17);
            var55 = 0;
         }
      }
   }

   public static void abbabb() {
      int var10000 = baaabbaa.bba;
      Iterator var1 = abba.iterator();
      int var0 = var10000;

      while (var1.hasNext()) {
         aabaaa var2 = (aabaaa)var1.next();
         var2.baaaba();
         if (var0 != 0) {
            break;
         }
      }
   }

   public static long abbbaa() {
      return abbab;
   }

   private void abbbab(Throwable var1) {
      this.baabaa(this.bbb, var1);
      this.baabaa(this.bbab, var1);
      this.aaaabba(var1);
      this.bba(this.bb, var1);
      this.bba(this.aba, var1);
   }

   public static long abbbba() {
      return abab;
   }

   private void abbbbb(aabaaab param1) {
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
      // 05: ifnonnull 0a
      // 08: return
      // 09: athrow
      // 0a: getstatic java/util/concurrent/TimeUnit.NANOSECONDS Ljava/util/concurrent/TimeUnit;
      // 0d: invokestatic java/lang/System.nanoTime ()J
      // 10: aload 1
      // 11: invokevirtual qeaa361f143ee4a0894bd168fd9b30c66/qf4ccf8f5435d4a78bdca4d6a018b578e/aabaaab.aa ()J
      // 14: lsub
      // 15: invokevirtual java/util/concurrent/TimeUnit.toMillis (J)J
      // 18: lstore 3
      // 19: getstatic qeaa361f143ee4a0894bd168fd9b30c66/qf4ccf8f5435d4a78bdca4d6a018b578e/aabaaa.abab J
      // 1c: lstore 5
      // 1e: lload 5
      // 20: iload 2
      // 21: ifne 34
      // 24: lconst_0
      // 25: lcmp
      // 26: ifgt 32
      // 29: goto 2d
      // 2c: athrow
      // 2d: lload 3
      // 2e: goto 41
      // 31: athrow
      // 32: lload 5
      // 34: l2d
      // 35: ldc2_w 0.85
      // 38: dmul
      // 39: lload 3
      // 3a: l2d
      // 3b: ldc2_w 0.15
      // 3e: dmul
      // 3f: dadd
      // 40: d2l
      // 41: putstatic qeaa361f143ee4a0894bd168fd9b30c66/qf4ccf8f5435d4a78bdca4d6a018b578e/aabaaa.abab J
      // 44: invokestatic java/lang/System.currentTimeMillis ()J
      // 47: putstatic qeaa361f143ee4a0894bd168fd9b30c66/qf4ccf8f5435d4a78bdca4d6a018b578e/aabaaa.bbbba J
      // 4a: aload 0
      // 4b: getfield qeaa361f143ee4a0894bd168fd9b30c66/qf4ccf8f5435d4a78bdca4d6a018b578e/aabaaa.aabbaa Ljava/util/concurrent/ConcurrentLinkedQueue;
      // 4e: invokevirtual java/util/concurrent/ConcurrentLinkedQueue.size ()I
      // 51: putstatic qeaa361f143ee4a0894bd168fd9b30c66/qf4ccf8f5435d4a78bdca4d6a018b578e/aabaaa.aababa I
      // 54: return
   }

   private void baaaaa(boolean param1, class_2596 param2, boolean param3, Future param4) throws Exception {
      // $VF: Couldn't be decompiled
      // Please report this to the Vineflower issue tracker, at https://github.com/Vineflower/vineflower/issues with a copy of the class file (if you have the rights to distribute it!)
      // java.lang.RuntimeException: parsing failure!
      //   at org.jetbrains.java.decompiler.modules.decompiler.decompose.DomHelper.parseGraph(DomHelper.java:211)
      //   at org.jetbrains.java.decompiler.main.rels.MethodProcessor.codeToJava(MethodProcessor.java:166)
      //
      // Bytecode:
      // 00: getstatic qeaa361f143ee4a0894bd168fd9b30c66/qf4ccf8f5435d4a78bdca4d6a018b578e/baaabbaa.bba I
      // 03: istore 5
      // 05: aload 4
      // 07: invokeinterface io/netty/util/concurrent/Future.isSuccess ()Z 1
      // 0c: iload 5
      // 0e: ifne 1a
      // 11: ifne 19
      // 14: goto 18
      // 17: athrow
      // 18: return
      // 19: iload 1
      // 1a: iload 5
      // 1c: ifne 30
      // 1f: ifeq 2f
      // 22: goto 26
      // 25: athrow
      // 26: aload 0
      // 27: aload 2
      // 28: invokevirtual qeaa361f143ee4a0894bd168fd9b30c66/qf4ccf8f5435d4a78bdca4d6a018b578e/aabaaa.bbab (Ljava/lang/Object;)V
      // 2b: goto 2f
      // 2e: athrow
      // 2f: iload 3
      // 30: ifeq 3c
      // 33: aload 0
      // 34: aload 2
      // 35: invokevirtual qeaa361f143ee4a0894bd168fd9b30c66/qf4ccf8f5435d4a78bdca4d6a018b578e/aabaaa.abbbabb (Lnet/minecraft/class_2596;)V
      // 38: goto 3c
      // 3b: athrow
      // 3c: return
   }

   private void baaaab(ChannelHandlerContext param1) {
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
      // 05: getfield qeaa361f143ee4a0894bd168fd9b30c66/qf4ccf8f5435d4a78bdca4d6a018b578e/aabaaa.aaa Ljava/util/concurrent/ConcurrentLinkedQueue;
      // 08: invokevirtual java/util/concurrent/ConcurrentLinkedQueue.peek ()Ljava/lang/Object;
      // 0b: checkcast qeaa361f143ee4a0894bd168fd9b30c66/qf4ccf8f5435d4a78bdca4d6a018b578e/abbbbbab
      // 0e: astore 3
      // 0f: iload 2
      // 10: ifne 27
      // 13: aload 3
      // 14: ifnonnull 28
      // 17: goto 1b
      // 1a: athrow
      // 1b: aload 0
      // 1c: getfield qeaa361f143ee4a0894bd168fd9b30c66/qf4ccf8f5435d4a78bdca4d6a018b578e/aabaaa.aaaba Ljava/util/concurrent/atomic/AtomicBoolean;
      // 1f: bipush 0
      // 20: invokevirtual java/util/concurrent/atomic/AtomicBoolean.set (Z)V
      // 23: goto 27
      // 26: athrow
      // 27: return
      // 28: aload 0
      // 29: aload 3
      // 2a: getfield qeaa361f143ee4a0894bd168fd9b30c66/qf4ccf8f5435d4a78bdca4d6a018b578e/abbbbbab.aa J
      // 2d: aload 0
      // 2e: aload 3
      // 2f: getfield qeaa361f143ee4a0894bd168fd9b30c66/qf4ccf8f5435d4a78bdca4d6a018b578e/abbbbbab.b Ljava/lang/Object;
      // 32: invokevirtual qeaa361f143ee4a0894bd168fd9b30c66/qf4ccf8f5435d4a78bdca4d6a018b578e/aabaaa.abababb (Ljava/lang/Object;)J
      // 35: invokevirtual qeaa361f143ee4a0894bd168fd9b30c66/qf4ccf8f5435d4a78bdca4d6a018b578e/aabaaa.ababbbb (JJ)J
      // 38: lstore 4
      // 3a: iload 2
      // 3b: ifne 65
      // 3e: lload 4
      // 40: lconst_0
      // 41: lcmp
      // 42: ifle 59
      // 45: goto 49
      // 48: athrow
      // 49: aload 0
      // 4a: getfield qeaa361f143ee4a0894bd168fd9b30c66/qf4ccf8f5435d4a78bdca4d6a018b578e/aabaaa.aaaba Ljava/util/concurrent/atomic/AtomicBoolean;
      // 4d: bipush 0
      // 4e: invokevirtual java/util/concurrent/atomic/AtomicBoolean.set (Z)V
      // 51: aload 0
      // 52: aload 1
      // 53: lload 4
      // 55: invokevirtual qeaa361f143ee4a0894bd168fd9b30c66/qf4ccf8f5435d4a78bdca4d6a018b578e/aabaaa.aaba (Lio/netty/channel/ChannelHandlerContext;J)V
      // 58: return
      // 59: aload 0
      // 5a: getfield qeaa361f143ee4a0894bd168fd9b30c66/qf4ccf8f5435d4a78bdca4d6a018b578e/aabaaa.aaa Ljava/util/concurrent/ConcurrentLinkedQueue;
      // 5d: invokevirtual java/util/concurrent/ConcurrentLinkedQueue.poll ()Ljava/lang/Object;
      // 60: pop
      // 61: iload 2
      // 62: ifne 98
      // 65: aload 1
      // 66: invokeinterface io/netty/channel/ChannelHandlerContext.channel ()Lio/netty/channel/Channel; 1
      // 6b: invokeinterface io/netty/channel/Channel.isOpen ()Z 1
      // 70: ifeq 88
      // 73: aload 0
      // 74: pop
      // 75: aload 1
      // 76: aload 3
      // 77: getfield qeaa361f143ee4a0894bd168fd9b30c66/qf4ccf8f5435d4a78bdca4d6a018b578e/abbbbbab.b Ljava/lang/Object;
      // 7a: invokestatic qeaa361f143ee4a0894bd168fd9b30c66/qf4ccf8f5435d4a78bdca4d6a018b578e/aabaaa.aabaaa (Lio/netty/channel/ChannelHandlerContext;Ljava/lang/Object;)V
      // 7d: aload 0
      // 7e: invokestatic java/lang/System.nanoTime ()J
      // 81: putfield qeaa361f143ee4a0894bd168fd9b30c66/qf4ccf8f5435d4a78bdca4d6a018b578e/aabaaa.aabab J
      // 84: goto 88
      // 87: athrow
      // 88: aload 0
      // 89: iload 2
      // 8a: ifne a7
      // 8d: getfield qeaa361f143ee4a0894bd168fd9b30c66/qf4ccf8f5435d4a78bdca4d6a018b578e/aabaaa.aaaba Ljava/util/concurrent/atomic/AtomicBoolean;
      // 90: bipush 0
      // 91: invokevirtual java/util/concurrent/atomic/AtomicBoolean.set (Z)V
      // 94: goto 98
      // 97: athrow
      // 98: aload 0
      // 99: getfield qeaa361f143ee4a0894bd168fd9b30c66/qf4ccf8f5435d4a78bdca4d6a018b578e/aabaaa.aaa Ljava/util/concurrent/ConcurrentLinkedQueue;
      // 9c: invokevirtual java/util/concurrent/ConcurrentLinkedQueue.isEmpty ()Z
      // 9f: ifne ab
      // a2: aload 0
      // a3: goto a7
      // a6: athrow
      // a7: aload 1
      // a8: invokevirtual qeaa361f143ee4a0894bd168fd9b30c66/qf4ccf8f5435d4a78bdca4d6a018b578e/aabaaa.babbba (Lio/netty/channel/ChannelHandlerContext;)V
      // ab: goto b9
      // ae: astore 3
      // af: aload 0
      // b0: getfield qeaa361f143ee4a0894bd168fd9b30c66/qf4ccf8f5435d4a78bdca4d6a018b578e/aabaaa.aaaba Ljava/util/concurrent/atomic/AtomicBoolean;
      // b3: bipush 0
      // b4: invokevirtual java/util/concurrent/atomic/AtomicBoolean.set (Z)V
      // b7: aload 3
      // b8: athrow
      // b9: return
   }

   private void baaaba() {
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
      // 05: aload 0
      // 06: getfield qeaa361f143ee4a0894bd168fd9b30c66/qf4ccf8f5435d4a78bdca4d6a018b578e/aabaaa.ba Lio/netty/channel/ChannelHandlerContext;
      // 09: astore 2
      // 0a: ifne 41
      // 0d: aload 2
      // 0e: ifnonnull 42
      // 11: goto 15
      // 14: athrow
      // 15: aload 0
      // 16: new java/nio/channels/ClosedChannelException
      // 19: dup
      // 1a: invokespecial java/nio/channels/ClosedChannelException.<init> ()V
      // 1d: invokevirtual qeaa361f143ee4a0894bd168fd9b30c66/qf4ccf8f5435d4a78bdca4d6a018b578e/aabaaa.abbbab (Ljava/lang/Throwable;)V
      // 20: aload 0
      // 21: getfield qeaa361f143ee4a0894bd168fd9b30c66/qf4ccf8f5435d4a78bdca4d6a018b578e/aabaaa.bbaba Ljava/util/concurrent/atomic/AtomicBoolean;
      // 24: bipush 0
      // 25: invokevirtual java/util/concurrent/atomic/AtomicBoolean.set (Z)V
      // 28: aload 0
      // 29: getfield qeaa361f143ee4a0894bd168fd9b30c66/qf4ccf8f5435d4a78bdca4d6a018b578e/aabaaa.abbb Ljava/util/concurrent/atomic/AtomicBoolean;
      // 2c: bipush 0
      // 2d: invokevirtual java/util/concurrent/atomic/AtomicBoolean.set (Z)V
      // 30: aload 0
      // 31: getfield qeaa361f143ee4a0894bd168fd9b30c66/qf4ccf8f5435d4a78bdca4d6a018b578e/aabaaa.aaaabb Ljava/util/concurrent/atomic/AtomicBoolean;
      // 34: bipush 0
      // 35: invokevirtual java/util/concurrent/atomic/AtomicBoolean.set (Z)V
      // 38: aload 0
      // 39: bipush 0
      // 3a: putfield qeaa361f143ee4a0894bd168fd9b30c66/qf4ccf8f5435d4a78bdca4d6a018b578e/aabaaa.aaabab Z
      // 3d: goto 41
      // 40: athrow
      // 41: return
      // 42: aload 0
      // 43: aload 2
      // 44: invokedynamic run (Lqeaa361f143ee4a0894bd168fd9b30c66/qf4ccf8f5435d4a78bdca4d6a018b578e/aabaaa;Lio/netty/channel/ChannelHandlerContext;)Ljava/lang/Runnable; bsm=java/lang/invoke/LambdaMetafactory.metafactory (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;Ljava/lang/invoke/MethodType;Ljava/lang/invoke/MethodHandle;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[ ()V, qeaa361f143ee4a0894bd168fd9b30c66/qf4ccf8f5435d4a78bdca4d6a018b578e/aabaaa.abbb (Lio/netty/channel/ChannelHandlerContext;)V, ()V ]
      // 49: astore 3
      // 4a: aload 2
      // 4b: iload 1
      // 4c: ifne 6f
      // 4f: invokeinterface io/netty/channel/ChannelHandlerContext.executor ()Lio/netty/util/concurrent/EventExecutor; 1
      // 54: invokeinterface io/netty/util/concurrent/EventExecutor.inEventLoop ()Z 1
      // 59: ifeq 6e
      // 5c: goto 60
      // 5f: athrow
      // 60: aload 3
      // 61: invokeinterface java/lang/Runnable.run ()V 1
      // 66: iload 1
      // 67: ifeq 8e
      // 6a: goto 6e
      // 6d: athrow
      // 6e: aload 2
      // 6f: invokeinterface io/netty/channel/ChannelHandlerContext.executor ()Lio/netty/util/concurrent/EventExecutor; 1
      // 74: aload 3
      // 75: invokeinterface io/netty/util/concurrent/EventExecutor.submit (Ljava/lang/Runnable;)Lio/netty/util/concurrent/Future; 2
      // 7a: invokeinterface io/netty/util/concurrent/Future.sync ()Lio/netty/util/concurrent/Future; 1
      // 7f: pop
      // 80: goto 8e
      // 83: astore 4
      // 85: aload 4
      // 87: pop
      // 88: invokestatic java/lang/Thread.currentThread ()Ljava/lang/Thread;
      // 8b: invokevirtual java/lang/Thread.interrupt ()V
      // 8e: return
   }

   static void baaabb(class_2886 param0, float param1, float param2) {
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
      // 05: ifnull 2e
      // 08: fload 1
      // 09: iload 3
      // 0a: ifne 20
      // 0d: goto 11
      // 10: athrow
      // 11: invokestatic java/lang/Float.isFinite (F)Z
      // 14: ifeq 2e
      // 17: goto 1b
      // 1a: athrow
      // 1b: fload 2
      // 1c: goto 20
      // 1f: athrow
      // 20: invokestatic java/lang/Float.isFinite (F)Z
      // 23: iload 3
      // 24: ifne 3d
      // 27: ifne 2f
      // 2a: goto 2e
      // 2d: athrow
      // 2e: return
      // 2f: getstatic qeaa361f143ee4a0894bd168fd9b30c66/qf4ccf8f5435d4a78bdca4d6a018b578e/aabaaa.babba Ljava/util/concurrent/ConcurrentHashMap;
      // 32: iload 3
      // 33: ifne 82
      // 36: invokevirtual java/util/concurrent/ConcurrentHashMap.size ()I
      // 39: goto 3d
      // 3c: athrow
      // 3d: ldc_w -522994293
      // 40: ldc_w -2089273331
      // 43: ldc_w -2083010852
      // 46: ixor
      // 47: invokestatic qeaa361f143ee4a0894bd168fd9b30c66/qf4ccf8f5435d4a78bdca4d6a018b578e/aabaaa.baaaaab (II)I
      // 4a: ldc2_w 2597419738744493710
      // 4d: invokestatic qeaa361f143ee4a0894bd168fd9b30c66/qf4ccf8f5435d4a78bdca4d6a018b578e/aabaaa.abbbbab (IJ)I
      // 50: if_icmplt 5d
      // 53: getstatic qeaa361f143ee4a0894bd168fd9b30c66/qf4ccf8f5435d4a78bdca4d6a018b578e/aabaaa.babba Ljava/util/concurrent/ConcurrentHashMap;
      // 56: invokevirtual java/util/concurrent/ConcurrentHashMap.clear ()V
      // 59: goto 5d
      // 5c: athrow
      // 5d: getstatic qeaa361f143ee4a0894bd168fd9b30c66/qf4ccf8f5435d4a78bdca4d6a018b578e/aabaaa.babba Ljava/util/concurrent/ConcurrentHashMap;
      // 60: new qeaa361f143ee4a0894bd168fd9b30c66/qf4ccf8f5435d4a78bdca4d6a018b578e/baaa
      // 63: dup
      // 64: aload 0
      // 65: invokespecial qeaa361f143ee4a0894bd168fd9b30c66/qf4ccf8f5435d4a78bdca4d6a018b578e/baaa.<init> (Lnet/minecraft/class_2596;)V
      // 68: bipush 2
      // 69: newarray 6
      // 6b: dup
      // 6c: bipush 0
      // 6d: fload 1
      // 6e: fastore
      // 6f: dup
      // 70: bipush 1
      // 71: ldc_w -90.0
      // 74: ldc_w 90.0
      // 77: fload 2
      // 78: invokestatic java/lang/Math.min (FF)F
      // 7b: invokestatic java/lang/Math.max (FF)F
      // 7e: fastore
      // 7f: invokevirtual java/util/concurrent/ConcurrentHashMap.put (Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;
      // 82: pop
      // 83: return
   }

   private void baabaa(ConcurrentLinkedQueue var1, Throwable var2) {
      int var3 = baaabbaa.bba;

      aababbab var4;
      while ((var4 = (aababbab)var1.poll()) != null) {
         var4.ab.tryFailure(var2);
         if (var3 != 0) {
            break;
         }
      }
   }

   private void baabab(ChannelHandlerContext param1, long param2) {
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
      // 06: getfield qeaa361f143ee4a0894bd168fd9b30c66/qf4ccf8f5435d4a78bdca4d6a018b578e/aabaaa.abb Ljava/util/concurrent/ConcurrentLinkedQueue;
      // 09: invokevirtual java/util/concurrent/ConcurrentLinkedQueue.peek ()Ljava/lang/Object;
      // 0c: checkcast qeaa361f143ee4a0894bd168fd9b30c66/qf4ccf8f5435d4a78bdca4d6a018b578e/abbbbaaaa
      // 0f: dup
      // 10: astore 5
      // 12: ifnull 69
      // 15: aload 5
      // 17: iload 4
      // 19: ifne 3f
      // 1c: getfield qeaa361f143ee4a0894bd168fd9b30c66/qf4ccf8f5435d4a78bdca4d6a018b578e/abbbbaaaa.aa J
      // 1f: lload 2
      // 20: lcmp
      // 21: ifgt 69
      // 24: goto 28
      // 27: athrow
      // 28: aload 0
      // 29: getfield qeaa361f143ee4a0894bd168fd9b30c66/qf4ccf8f5435d4a78bdca4d6a018b578e/aabaaa.abb Ljava/util/concurrent/ConcurrentLinkedQueue;
      // 2c: invokevirtual java/util/concurrent/ConcurrentLinkedQueue.poll ()Ljava/lang/Object;
      // 2f: checkcast qeaa361f143ee4a0894bd168fd9b30c66/qf4ccf8f5435d4a78bdca4d6a018b578e/abbbbaaaa
      // 32: iload 4
      // 34: ifne 12
      // 37: goto 3b
      // 3a: athrow
      // 3b: astore 5
      // 3d: aload 5
      // 3f: ifnull 05
      // 42: aload 1
      // 43: iload 4
      // 45: ifne 5c
      // 48: invokeinterface io/netty/channel/ChannelHandlerContext.channel ()Lio/netty/channel/Channel; 1
      // 4d: invokeinterface io/netty/channel/Channel.isOpen ()Z 1
      // 52: ifeq 05
      // 55: goto 59
      // 58: athrow
      // 59: aload 0
      // 5a: pop
      // 5b: aload 1
      // 5c: aload 5
      // 5e: getfield qeaa361f143ee4a0894bd168fd9b30c66/qf4ccf8f5435d4a78bdca4d6a018b578e/abbbbaaaa.b Ljava/lang/Object;
      // 61: invokestatic qeaa361f143ee4a0894bd168fd9b30c66/qf4ccf8f5435d4a78bdca4d6a018b578e/aabaaa.aabaaa (Lio/netty/channel/ChannelHandlerContext;Ljava/lang/Object;)V
      // 64: iload 4
      // 66: ifeq 05
      // 69: return
   }

   private void baabba(ChannelHandlerContext param1) {
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
      // 05: invokevirtual qeaa361f143ee4a0894bd168fd9b30c66/qf4ccf8f5435d4a78bdca4d6a018b578e/aabaaa.babbaa ()V
      // 08: aload 1
      // 09: iload 2
      // 0a: ifne 15
      // 0d: ifnull 4d
      // 10: goto 14
      // 13: athrow
      // 14: aload 1
      // 15: iload 2
      // 16: ifne 3d
      // 19: invokeinterface io/netty/channel/ChannelHandlerContext.pipeline ()Lio/netty/channel/ChannelPipeline; 1
      // 1e: ifnull 4d
      // 21: goto 25
      // 24: athrow
      // 25: aload 1
      // 26: iload 2
      // 27: ifne 41
      // 2a: goto 2e
      // 2d: athrow
      // 2e: invokeinterface io/netty/channel/ChannelHandlerContext.pipeline ()Lio/netty/channel/ChannelPipeline; 1
      // 33: aload 0
      // 34: invokeinterface io/netty/channel/ChannelPipeline.context (Lio/netty/channel/ChannelHandler;)Lio/netty/channel/ChannelHandlerContext; 2
      // 39: goto 3d
      // 3c: athrow
      // 3d: ifnull 4d
      // 40: aload 1
      // 41: invokeinterface io/netty/channel/ChannelHandlerContext.pipeline ()Lio/netty/channel/ChannelPipeline; 1
      // 46: aload 0
      // 47: invokeinterface io/netty/channel/ChannelPipeline.remove (Lio/netty/channel/ChannelHandler;)Lio/netty/channel/ChannelPipeline; 2
      // 4c: pop
      // 4d: goto 53
      // 50: astore 3
      // 51: aload 3
      // 52: pop
      // 53: return
   }

   private void baabbb(ChannelHandlerContext var1) {
      this.babaa(var1);
   }

   private void babaaa(ChannelHandlerContext param1, Object param2, ChannelPromise param3) throws Exception {
      // $VF: Couldn't be decompiled
      // Please report this to the Vineflower issue tracker, at https://github.com/Vineflower/vineflower/issues with a copy of the class file (if you have the rights to distribute it!)
      // java.lang.RuntimeException: parsing failure!
      //   at org.jetbrains.java.decompiler.modules.decompiler.decompose.DomHelper.parseGraph(DomHelper.java:211)
      //   at org.jetbrains.java.decompiler.main.rels.MethodProcessor.codeToJava(MethodProcessor.java:166)
      //
      // Bytecode:
      // 000: getstatic qeaa361f143ee4a0894bd168fd9b30c66/qf4ccf8f5435d4a78bdca4d6a018b578e/baaabbaa.bba I
      // 003: istore 4
      // 005: aload 2
      // 006: instanceof net/minecraft/class_2886
      // 009: iload 4
      // 00b: ifne 02b
      // 00e: ifeq 021
      // 011: goto 015
      // 014: athrow
      // 015: aload 2
      // 016: checkcast net/minecraft/class_2886
      // 019: astore 5
      // 01b: aload 5
      // 01d: invokestatic qeaa361f143ee4a0894bd168fd9b30c66/qf4ccf8f5435d4a78bdca4d6a018b578e/aabaaa.babba (Lnet/minecraft/class_2886;)Lnet/minecraft/class_2886;
      // 020: astore 2
      // 021: aload 0
      // 022: aload 1
      // 023: invokevirtual qeaa361f143ee4a0894bd168fd9b30c66/qf4ccf8f5435d4a78bdca4d6a018b578e/aabaaa.baabb (Lio/netty/channel/ChannelHandlerContext;)V
      // 026: aload 0
      // 027: aload 2
      // 028: invokevirtual qeaa361f143ee4a0894bd168fd9b30c66/qf4ccf8f5435d4a78bdca4d6a018b578e/aabaaa.baa (Ljava/lang/Object;)Z
      // 02b: iload 4
      // 02d: ifne 044
      // 030: ifeq 041
      // 033: goto 037
      // 036: athrow
      // 037: aload 0
      // 038: aload 1
      // 039: aload 2
      // 03a: aload 3
      // 03b: invokevirtual qeaa361f143ee4a0894bd168fd9b30c66/qf4ccf8f5435d4a78bdca4d6a018b578e/aabaaa.abbaabb (Lio/netty/channel/ChannelHandlerContext;Ljava/lang/Object;Lio/netty/channel/ChannelPromise;)Z
      // 03e: pop
      // 03f: return
      // 040: athrow
      // 041: getstatic qeaa361f143ee4a0894bd168fd9b30c66/qf4ccf8f5435d4a78bdca4d6a018b578e/aabaaa.aaabaa Z
      // 044: iload 4
      // 046: ifne 072
      // 049: ifeq 064
      // 04c: goto 050
      // 04f: athrow
      // 050: aload 2
      // 051: invokestatic qeaa361f143ee4a0894bd168fd9b30c66/qf4ccf8f5435d4a78bdca4d6a018b578e/aabaaa.aaaaaaa (Ljava/lang/Object;)Lqeaa361f143ee4a0894bd168fd9b30c66/qf4ccf8f5435d4a78bdca4d6a018b578e/abaaaabba;
      // 054: ifnull 064
      // 057: goto 05b
      // 05a: athrow
      // 05b: aload 0
      // 05c: aload 1
      // 05d: aload 2
      // 05e: aload 3
      // 05f: invokevirtual qeaa361f143ee4a0894bd168fd9b30c66/qf4ccf8f5435d4a78bdca4d6a018b578e/aabaaa.aababaa (Lio/netty/channel/ChannelHandlerContext;Ljava/lang/Object;Lio/netty/channel/ChannelPromise;)V
      // 062: return
      // 063: athrow
      // 064: aload 0
      // 065: iload 4
      // 067: ifne 0b0
      // 06a: aload 2
      // 06b: invokevirtual qeaa361f143ee4a0894bd168fd9b30c66/qf4ccf8f5435d4a78bdca4d6a018b578e/aabaaa.bbbabb (Ljava/lang/Object;)Z
      // 06e: goto 072
      // 071: athrow
      // 072: ifeq 0af
      // 075: aload 0
      // 076: iload 4
      // 078: ifne 0a0
      // 07b: goto 07f
      // 07e: athrow
      // 07f: aload 0
      // 080: aload 2
      // 081: aload 3
      // 082: getstatic qeaa361f143ee4a0894bd168fd9b30c66/qf4ccf8f5435d4a78bdca4d6a018b578e/abaaaabba.aa Lqeaa361f143ee4a0894bd168fd9b30c66/qf4ccf8f5435d4a78bdca4d6a018b578e/abaaaabba;
      // 085: invokevirtual qeaa361f143ee4a0894bd168fd9b30c66/qf4ccf8f5435d4a78bdca4d6a018b578e/aabaaa.abaab (Ljava/lang/Object;Lio/netty/channel/ChannelPromise;Lqeaa361f143ee4a0894bd168fd9b30c66/qf4ccf8f5435d4a78bdca4d6a018b578e/abaaaabba;)Lqeaa361f143ee4a0894bd168fd9b30c66/qf4ccf8f5435d4a78bdca4d6a018b578e/ababbb;
      // 088: invokevirtual qeaa361f143ee4a0894bd168fd9b30c66/qf4ccf8f5435d4a78bdca4d6a018b578e/aabaaa.ababa (Lqeaa361f143ee4a0894bd168fd9b30c66/qf4ccf8f5435d4a78bdca4d6a018b578e/ababbb;)Z
      // 08b: ifne 0ae
      // 08e: goto 092
      // 091: athrow
      // 092: aload 0
      // 093: aload 1
      // 094: aload 0
      // 095: getfield qeaa361f143ee4a0894bd168fd9b30c66/qf4ccf8f5435d4a78bdca4d6a018b578e/aabaaa.aba Ljava/util/concurrent/ConcurrentLinkedQueue;
      // 098: invokevirtual qeaa361f143ee4a0894bd168fd9b30c66/qf4ccf8f5435d4a78bdca4d6a018b578e/aabaaa.aaaaba (Lio/netty/channel/ChannelHandlerContext;Ljava/util/concurrent/ConcurrentLinkedQueue;)V
      // 09b: aload 0
      // 09c: goto 0a0
      // 09f: athrow
      // 0a0: aload 1
      // 0a1: aload 2
      // 0a2: aload 3
      // 0a3: invokevirtual qeaa361f143ee4a0894bd168fd9b30c66/qf4ccf8f5435d4a78bdca4d6a018b578e/aabaaa.abbaabb (Lio/netty/channel/ChannelHandlerContext;Ljava/lang/Object;Lio/netty/channel/ChannelPromise;)Z
      // 0a6: pop
      // 0a7: aload 1
      // 0a8: invokeinterface io/netty/channel/ChannelHandlerContext.flush ()Lio/netty/channel/ChannelHandlerContext; 1
      // 0ad: pop
      // 0ae: return
      // 0af: aload 2
      // 0b0: iload 4
      // 0b2: ifne 0d1
      // 0b5: instanceof net/minecraft/class_2935
      // 0b8: ifeq 0d0
      // 0bb: goto 0bf
      // 0be: athrow
      // 0bf: aload 2
      // 0c0: checkcast net/minecraft/class_2935
      // 0c3: astore 5
      // 0c5: invokestatic qeaa361f143ee4a0894bd168fd9b30c66/qf4ccf8f5435d4a78bdca4d6a018b578e/abbabbaa.abb ()Lqeaa361f143ee4a0894bd168fd9b30c66/qf4ccf8f5435d4a78bdca4d6a018b578e/abbabbaa;
      // 0c8: aload 5
      // 0ca: invokevirtual net/minecraft/class_2935.method_12700 ()J
      // 0cd: invokevirtual qeaa361f143ee4a0894bd168fd9b30c66/qf4ccf8f5435d4a78bdca4d6a018b578e/abbabbaa.babb (J)V
      // 0d0: aload 2
      // 0d1: invokestatic qeaa361f143ee4a0894bd168fd9b30c66/qf4ccf8f5435d4a78bdca4d6a018b578e/aabaaa.aaaaaaa (Ljava/lang/Object;)Lqeaa361f143ee4a0894bd168fd9b30c66/qf4ccf8f5435d4a78bdca4d6a018b578e/abaaaabba;
      // 0d4: ifnull 0e0
      // 0d7: aload 0
      // 0d8: aload 1
      // 0d9: aload 2
      // 0da: aload 3
      // 0db: invokevirtual qeaa361f143ee4a0894bd168fd9b30c66/qf4ccf8f5435d4a78bdca4d6a018b578e/aabaaa.aababaa (Lio/netty/channel/ChannelHandlerContext;Ljava/lang/Object;Lio/netty/channel/ChannelPromise;)V
      // 0de: return
      // 0df: athrow
      // 0e0: aload 0
      // 0e1: aload 2
      // 0e2: invokevirtual qeaa361f143ee4a0894bd168fd9b30c66/qf4ccf8f5435d4a78bdca4d6a018b578e/aabaaa.abbaaaa (Ljava/lang/Object;)J
      // 0e5: lstore 5
      // 0e7: lload 5
      // 0e9: lconst_0
      // 0ea: lcmp
      // 0eb: iload 4
      // 0ed: ifne 105
      // 0f0: ifgt 101
      // 0f3: goto 0f7
      // 0f6: athrow
      // 0f7: aload 0
      // 0f8: aload 1
      // 0f9: aload 2
      // 0fa: aload 3
      // 0fb: invokevirtual qeaa361f143ee4a0894bd168fd9b30c66/qf4ccf8f5435d4a78bdca4d6a018b578e/aabaaa.abbaabb (Lio/netty/channel/ChannelHandlerContext;Ljava/lang/Object;Lio/netty/channel/ChannelPromise;)Z
      // 0fe: pop
      // 0ff: return
      // 100: athrow
      // 101: aload 2
      // 102: instanceof net/minecraft/class_2935
      // 105: iload 4
      // 107: ifne 137
      // 10a: ifeq 124
      // 10d: goto 111
      // 110: athrow
      // 111: aload 2
      // 112: checkcast net/minecraft/class_2935
      // 115: astore 7
      // 117: invokestatic qeaa361f143ee4a0894bd168fd9b30c66/qf4ccf8f5435d4a78bdca4d6a018b578e/abbabbaa.abb ()Lqeaa361f143ee4a0894bd168fd9b30c66/qf4ccf8f5435d4a78bdca4d6a018b578e/abbabbaa;
      // 11a: aload 7
      // 11c: invokevirtual net/minecraft/class_2935.method_12700 ()J
      // 11f: lload 5
      // 121: invokevirtual qeaa361f143ee4a0894bd168fd9b30c66/qf4ccf8f5435d4a78bdca4d6a018b578e/abbabbaa.abbba (JJ)V
      // 124: aload 0
      // 125: iload 4
      // 127: ifne 179
      // 12a: aload 0
      // 12b: aload 2
      // 12c: aload 3
      // 12d: invokevirtual qeaa361f143ee4a0894bd168fd9b30c66/qf4ccf8f5435d4a78bdca4d6a018b578e/aabaaa.abbba (Ljava/lang/Object;Lio/netty/channel/ChannelPromise;)Lqeaa361f143ee4a0894bd168fd9b30c66/qf4ccf8f5435d4a78bdca4d6a018b578e/aababbab;
      // 130: invokevirtual qeaa361f143ee4a0894bd168fd9b30c66/qf4ccf8f5435d4a78bdca4d6a018b578e/aabaaa.aabbbba (Lqeaa361f143ee4a0894bd168fd9b30c66/qf4ccf8f5435d4a78bdca4d6a018b578e/aababbab;)Z
      // 133: goto 137
      // 136: athrow
      // 137: ifne 178
      // 13a: aload 0
      // 13b: getfield qeaa361f143ee4a0894bd168fd9b30c66/qf4ccf8f5435d4a78bdca4d6a018b578e/aabaaa.bbab Ljava/util/concurrent/ConcurrentLinkedQueue;
      // 13e: invokevirtual java/util/concurrent/ConcurrentLinkedQueue.poll ()Ljava/lang/Object;
      // 141: checkcast qeaa361f143ee4a0894bd168fd9b30c66/qf4ccf8f5435d4a78bdca4d6a018b578e/aababbab
      // 144: dup
      // 145: astore 7
      // 147: ifnull 168
      // 14a: aload 0
      // 14b: aload 1
      // 14c: aload 7
      // 14e: invokevirtual qeaa361f143ee4a0894bd168fd9b30c66/qf4ccf8f5435d4a78bdca4d6a018b578e/aababbab.b ()Ljava/lang/Object;
      // 151: aload 7
      // 153: invokevirtual qeaa361f143ee4a0894bd168fd9b30c66/qf4ccf8f5435d4a78bdca4d6a018b578e/aababbab.ab ()Lio/netty/channel/ChannelPromise;
      // 156: iload 4
      // 158: ifne 16c
      // 15b: invokevirtual qeaa361f143ee4a0894bd168fd9b30c66/qf4ccf8f5435d4a78bdca4d6a018b578e/aabaaa.abbaabb (Lio/netty/channel/ChannelHandlerContext;Ljava/lang/Object;Lio/netty/channel/ChannelPromise;)Z
      // 15e: pop
      // 15f: iload 4
      // 161: ifeq 13a
      // 164: goto 168
      // 167: athrow
      // 168: aload 0
      // 169: aload 1
      // 16a: aload 2
      // 16b: aload 3
      // 16c: invokevirtual qeaa361f143ee4a0894bd168fd9b30c66/qf4ccf8f5435d4a78bdca4d6a018b578e/aabaaa.abbaabb (Lio/netty/channel/ChannelHandlerContext;Ljava/lang/Object;Lio/netty/channel/ChannelPromise;)Z
      // 16f: pop
      // 170: aload 1
      // 171: invokeinterface io/netty/channel/ChannelHandlerContext.flush ()Lio/netty/channel/ChannelHandlerContext; 1
      // 176: pop
      // 177: return
      // 178: aload 0
      // 179: aload 1
      // 17a: invokevirtual qeaa361f143ee4a0894bd168fd9b30c66/qf4ccf8f5435d4a78bdca4d6a018b578e/aabaaa.bbbbab (Lio/netty/channel/ChannelHandlerContext;)V
      // 17d: return
   }

   private static void babaab(aabaaa var0, ChannelHandlerContext var1) {
      var0.ababbab(var1);
   }

   private static Integer bababa(class_2596 param0, String[] param1) {
      // $VF: Couldn't be decompiled
      // Please report this to the Vineflower issue tracker, at https://github.com/Vineflower/vineflower/issues with a copy of the class file (if you have the rights to distribute it!)
      // java.lang.RuntimeException: parsing failure!
      //   at org.jetbrains.java.decompiler.modules.decompiler.decompose.DomHelper.parseGraph(DomHelper.java:211)
      //   at org.jetbrains.java.decompiler.main.rels.MethodProcessor.codeToJava(MethodProcessor.java:166)
      //
      // Bytecode:
      // 00: getstatic qeaa361f143ee4a0894bd168fd9b30c66/qf4ccf8f5435d4a78bdca4d6a018b578e/baaabbaa.bba I
      // 03: aload 1
      // 04: astore 3
      // 05: aload 3
      // 06: arraylength
      // 07: istore 4
      // 09: bipush 0
      // 0a: istore 5
      // 0c: istore 2
      // 0d: iload 5
      // 0f: iload 4
      // 11: if_icmpge ab
      // 14: aload 3
      // 15: iload 5
      // 17: aaload
      // 18: astore 6
      // 1a: aload 0
      // 1b: invokeinterface net/minecraft/class_2596.getClass ()Ljava/lang/Class; 1
      // 20: aload 6
      // 22: bipush 0
      // 23: anewarray 572
      // 26: invokevirtual java/lang/Class.getMethod (Ljava/lang/String;[Ljava/lang/Class;)Ljava/lang/reflect/Method;
      // 29: astore 7
      // 2b: aload 7
      // 2d: aload 0
      // 2e: bipush 0
      // 2f: anewarray 249
      // 32: invokevirtual java/lang/reflect/Method.invoke (Ljava/lang/Object;[Ljava/lang/Object;)Ljava/lang/Object;
      // 35: astore 8
      // 37: aload 8
      // 39: iload 2
      // 3a: ifne 4d
      // 3d: instanceof java/lang/Number
      // 40: ifeq 5b
      // 43: goto 47
      // 46: athrow
      // 47: aload 8
      // 49: goto 4d
      // 4c: athrow
      // 4d: checkcast java/lang/Number
      // 50: astore 9
      // 52: aload 9
      // 54: invokevirtual java/lang/Number.intValue ()I
      // 57: invokestatic java/lang/Integer.valueOf (I)Ljava/lang/Integer;
      // 5a: areturn
      // 5b: goto 60
      // 5e: astore 7
      // 60: aload 0
      // 61: invokeinterface net/minecraft/class_2596.getClass ()Ljava/lang/Class; 1
      // 66: aload 6
      // 68: invokevirtual java/lang/Class.getDeclaredField (Ljava/lang/String;)Ljava/lang/reflect/Field;
      // 6b: astore 7
      // 6d: aload 7
      // 6f: bipush 1
      // 70: invokevirtual java/lang/reflect/Field.setAccessible (Z)V
      // 73: aload 7
      // 75: aload 0
      // 76: invokevirtual java/lang/reflect/Field.get (Ljava/lang/Object;)Ljava/lang/Object;
      // 79: astore 8
      // 7b: aload 8
      // 7d: iload 2
      // 7e: ifne 91
      // 81: instanceof java/lang/Number
      // 84: ifeq 9f
      // 87: goto 8b
      // 8a: athrow
      // 8b: aload 8
      // 8d: goto 91
      // 90: athrow
      // 91: checkcast java/lang/Number
      // 94: astore 9
      // 96: aload 9
      // 98: invokevirtual java/lang/Number.intValue ()I
      // 9b: invokestatic java/lang/Integer.valueOf (I)Ljava/lang/Integer;
      // 9e: areturn
      // 9f: goto a4
      // a2: astore 7
      // a4: iinc 5 1
      // a7: iload 2
      // a8: ifeq 0d
      // ab: aconst_null
      // ac: areturn
   }

   private static boolean bababb(class_2596 var0) {
      return false;
   }

   public void babbaa() {
      abbbb();
      this.abbbab(new ClosedChannelException());
      this.aaa.clear();
      this.abb.clear();
      this.bbbaa.clear();
      this.ababb = false;
      this.aaab = false;
      this.aab = false;
      this.aaaaaa = false;
      this.aaaabb.set(false);
      this.abbb.set(false);
      this.aaaba.set(false);
      this.bbaba.set(false);
      this.babab.set(false);
      this.aaabab = false;
      this.aabbb = 0L;
      this.aabab = 0L;
      this.aabba = 0L;
      this.aabbba = 0L;
   }

   public static void babbab(long var0, long var2) {
      aababab();
   }

   private void babbba(ChannelHandlerContext var1) {
      this.aaba(var1, 0L);
   }

   private void babbbb(ChannelHandlerContext param1) {
      // $VF: Couldn't be decompiled
      // Please report this to the Vineflower issue tracker, at https://github.com/Vineflower/vineflower/issues with a copy of the class file (if you have the rights to distribute it!)
      // java.lang.RuntimeException: parsing failure!
      //   at org.jetbrains.java.decompiler.modules.decompiler.decompose.DomHelper.parseGraph(DomHelper.java:211)
      //   at org.jetbrains.java.decompiler.main.rels.MethodProcessor.codeToJava(MethodProcessor.java:166)
      //
      // Bytecode:
      // 00: getstatic qeaa361f143ee4a0894bd168fd9b30c66/qf4ccf8f5435d4a78bdca4d6a018b578e/baaabbaa.bba I
      // 03: istore 2
      // 04: invokestatic java/lang/System.nanoTime ()J
      // 07: lstore 3
      // 08: aload 0
      // 09: aload 0
      // 0a: getfield qeaa361f143ee4a0894bd168fd9b30c66/qf4ccf8f5435d4a78bdca4d6a018b578e/aabaaa.aabbba J
      // 0d: getstatic qeaa361f143ee4a0894bd168fd9b30c66/qf4ccf8f5435d4a78bdca4d6a018b578e/aabaaa.aaaab J
      // 10: lload 3
      // 11: invokevirtual qeaa361f143ee4a0894bd168fd9b30c66/qf4ccf8f5435d4a78bdca4d6a018b578e/aabaaa.baaba (JJJ)J
      // 14: lstore 5
      // 16: lload 5
      // 18: lconst_0
      // 19: lcmp
      // 1a: iload 2
      // 1b: ifne 36
      // 1e: ifle 35
      // 21: goto 25
      // 24: athrow
      // 25: aload 0
      // 26: getfield qeaa361f143ee4a0894bd168fd9b30c66/qf4ccf8f5435d4a78bdca4d6a018b578e/aabaaa.babab Ljava/util/concurrent/atomic/AtomicBoolean;
      // 29: bipush 0
      // 2a: invokevirtual java/util/concurrent/atomic/AtomicBoolean.set (Z)V
      // 2d: aload 0
      // 2e: aload 1
      // 2f: lload 5
      // 31: invokevirtual qeaa361f143ee4a0894bd168fd9b30c66/qf4ccf8f5435d4a78bdca4d6a018b578e/aabaaa.aaabba (Lio/netty/channel/ChannelHandlerContext;J)V
      // 34: return
      // 35: bipush 0
      // 36: istore 7
      // 38: iload 7
      // 3a: ldc_w -522994294
      // 3d: ldc_w 1191917626
      // 40: ldc_w -126958176
      // 43: ixor
      // 44: invokestatic qeaa361f143ee4a0894bd168fd9b30c66/qf4ccf8f5435d4a78bdca4d6a018b578e/aabaaa.baaaaab (II)I
      // 47: ldc2_w 1394829197470904801
      // 4a: invokestatic qeaa361f143ee4a0894bd168fd9b30c66/qf4ccf8f5435d4a78bdca4d6a018b578e/aabaaa.abbbbab (IJ)I
      // 4d: if_icmpge 94
      // 50: aload 0
      // 51: iload 2
      // 52: ifne bd
      // 55: getfield qeaa361f143ee4a0894bd168fd9b30c66/qf4ccf8f5435d4a78bdca4d6a018b578e/aabaaa.abb Ljava/util/concurrent/ConcurrentLinkedQueue;
      // 58: invokevirtual java/util/concurrent/ConcurrentLinkedQueue.poll ()Ljava/lang/Object;
      // 5b: checkcast qeaa361f143ee4a0894bd168fd9b30c66/qf4ccf8f5435d4a78bdca4d6a018b578e/abbbbaaaa
      // 5e: dup
      // 5f: astore 8
      // 61: ifnull 94
      // 64: aload 1
      // 65: iload 2
      // 66: ifne 85
      // 69: goto 6d
      // 6c: athrow
      // 6d: invokeinterface io/netty/channel/ChannelHandlerContext.channel ()Lio/netty/channel/Channel; 1
      // 72: invokeinterface io/netty/channel/Channel.isOpen ()Z 1
      // 77: ifeq 8d
      // 7a: goto 7e
      // 7d: athrow
      // 7e: aload 0
      // 7f: pop
      // 80: aload 1
      // 81: goto 85
      // 84: athrow
      // 85: aload 8
      // 87: getfield qeaa361f143ee4a0894bd168fd9b30c66/qf4ccf8f5435d4a78bdca4d6a018b578e/abbbbaaaa.b Ljava/lang/Object;
      // 8a: invokestatic qeaa361f143ee4a0894bd168fd9b30c66/qf4ccf8f5435d4a78bdca4d6a018b578e/aabaaa.aabaaa (Lio/netty/channel/ChannelHandlerContext;Ljava/lang/Object;)V
      // 8d: iinc 7 1
      // 90: iload 2
      // 91: ifeq 38
      // 94: iload 7
      // 96: iload 2
      // 97: ifne c3
      // 9a: ifle ac
      // 9d: goto a1
      // a0: athrow
      // a1: aload 0
      // a2: invokestatic java/lang/System.nanoTime ()J
      // a5: putfield qeaa361f143ee4a0894bd168fd9b30c66/qf4ccf8f5435d4a78bdca4d6a018b578e/aabaaa.aabbba J
      // a8: goto ac
      // ab: athrow
      // ac: aload 0
      // ad: iload 2
      // ae: ifne c7
      // b1: getfield qeaa361f143ee4a0894bd168fd9b30c66/qf4ccf8f5435d4a78bdca4d6a018b578e/aabaaa.babab Ljava/util/concurrent/atomic/AtomicBoolean;
      // b4: bipush 0
      // b5: invokevirtual java/util/concurrent/atomic/AtomicBoolean.set (Z)V
      // b8: aload 0
      // b9: goto bd
      // bc: athrow
      // bd: getfield qeaa361f143ee4a0894bd168fd9b30c66/qf4ccf8f5435d4a78bdca4d6a018b578e/aabaaa.abb Ljava/util/concurrent/ConcurrentLinkedQueue;
      // c0: invokevirtual java/util/concurrent/ConcurrentLinkedQueue.isEmpty ()Z
      // c3: ifne ce
      // c6: aload 0
      // c7: aload 1
      // c8: getstatic qeaa361f143ee4a0894bd168fd9b30c66/qf4ccf8f5435d4a78bdca4d6a018b578e/aabaaa.aaaab J
      // cb: invokevirtual qeaa361f143ee4a0894bd168fd9b30c66/qf4ccf8f5435d4a78bdca4d6a018b578e/aabaaa.aaabba (Lio/netty/channel/ChannelHandlerContext;J)V
      // ce: goto dc
      // d1: astore 3
      // d2: aload 0
      // d3: getfield qeaa361f143ee4a0894bd168fd9b30c66/qf4ccf8f5435d4a78bdca4d6a018b578e/aabaaa.babab Ljava/util/concurrent/atomic/AtomicBoolean;
      // d6: bipush 0
      // d7: invokevirtual java/util/concurrent/atomic/AtomicBoolean.set (Z)V
      // da: aload 3
      // db: athrow
      // dc: return
   }

   public static void bbaaaa(Predicate var0, Consumer var1) {
      aabbabb(var0, var1, aabaaa::aaabbbb, aabaaa::bbaba);
   }

   private static void bbaaab(Object param0) {
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
      // 06: ifne 2b
      // 09: instanceof net/minecraft/class_2708
      // 0c: ifne 26
      // 0f: goto 13
      // 12: athrow
      // 13: aload 0
      // 14: iload 1
      // 15: ifne 2b
      // 18: goto 1c
      // 1b: athrow
      // 1c: instanceof net/minecraft/class_2724
      // 1f: ifeq 46
      // 22: goto 26
      // 25: athrow
      // 26: aload 0
      // 27: goto 2b
      // 2a: athrow
      // 2b: iload 1
      // 2c: ifne 3e
      // 2f: instanceof net/minecraft/class_2596
      // 32: ifeq 46
      // 35: goto 39
      // 38: athrow
      // 39: aload 0
      // 3a: goto 3e
      // 3d: athrow
      // 3e: checkcast net/minecraft/class_2596
      // 41: astore 2
      // 42: iload 1
      // 43: ifeq 48
      // 46: return
      // 47: athrow
      // 48: invokestatic qeaa361f143ee4a0894bd168fd9b30c66/qf4ccf8f5435d4a78bdca4d6a018b578e/abaaaaaba.aaaaa ()Lqeaa361f143ee4a0894bd168fd9b30c66/qf4ccf8f5435d4a78bdca4d6a018b578e/abaaaaaba;
      // 4b: astore 3
      // 4c: aload 3
      // 4d: iload 1
      // 4e: ifne 59
      // 51: ifnull 73
      // 54: goto 58
      // 57: athrow
      // 58: aload 3
      // 59: iload 1
      // 5a: ifne 6c
      // 5d: invokevirtual qeaa361f143ee4a0894bd168fd9b30c66/qf4ccf8f5435d4a78bdca4d6a018b578e/abaaaaaba.aaba ()Lqeaa361f143ee4a0894bd168fd9b30c66/qf4ccf8f5435d4a78bdca4d6a018b578e/babbaba;
      // 60: ifnull 73
      // 63: goto 67
      // 66: athrow
      // 67: aload 3
      // 68: goto 6c
      // 6b: athrow
      // 6c: invokevirtual qeaa361f143ee4a0894bd168fd9b30c66/qf4ccf8f5435d4a78bdca4d6a018b578e/abaaaaaba.aaba ()Lqeaa361f143ee4a0894bd168fd9b30c66/qf4ccf8f5435d4a78bdca4d6a018b578e/babbaba;
      // 6f: aload 2
      // 70: invokevirtual qeaa361f143ee4a0894bd168fd9b30c66/qf4ccf8f5435d4a78bdca4d6a018b578e/babbaba.aaaaaa (Lnet/minecraft/class_2596;)V
      // 73: return
   }

   public static void bbaaba() {
      int var10000 = baaabbaa.bba;
      Iterator var1 = abba.iterator();
      int var0 = var10000;

      while (var1.hasNext()) {
         aabaaa var2 = (aabaaa)var1.next();
         var2.aabba();
         if (var0 != 0) {
            break;
         }
      }
   }

   private static void bbaabb(Runnable param0) {
      // $VF: Couldn't be decompiled
      // Please report this to the Vineflower issue tracker, at https://github.com/Vineflower/vineflower/issues with a copy of the class file (if you have the rights to distribute it!)
      // java.lang.RuntimeException: parsing failure!
      //   at org.jetbrains.java.decompiler.modules.decompiler.decompose.DomHelper.parseGraph(DomHelper.java:211)
      //   at org.jetbrains.java.decompiler.main.rels.MethodProcessor.codeToJava(MethodProcessor.java:166)
      //
      // Bytecode:
      // 00: getstatic qeaa361f143ee4a0894bd168fd9b30c66/qf4ccf8f5435d4a78bdca4d6a018b578e/baaabbaa.bba I
      // 03: invokestatic net/minecraft/class_310.method_1551 ()Lnet/minecraft/class_310;
      // 06: astore 2
      // 07: istore 1
      // 08: aload 2
      // 09: iload 1
      // 0a: ifne 15
      // 0d: ifnull 30
      // 10: goto 14
      // 13: athrow
      // 14: aload 2
      // 15: iload 1
      // 16: ifne 28
      // 19: invokevirtual net/minecraft/class_310.method_18854 ()Z
      // 1c: ifne 30
      // 1f: goto 23
      // 22: athrow
      // 23: aload 2
      // 24: goto 28
      // 27: athrow
      // 28: aload 0
      // 29: invokevirtual net/minecraft/class_310.execute (Ljava/lang/Runnable;)V
      // 2c: iload 1
      // 2d: ifeq 3a
      // 30: aload 0
      // 31: invokeinterface java/lang/Runnable.run ()V 1
      // 36: goto 3a
      // 39: athrow
      // 3a: return
   }

   private void bbabaa(ChannelHandlerContext var1) {
      this.abb(var1);
   }

   private class_2828 bbabab(class_2828 param1) {
      // $VF: Couldn't be decompiled
      // Please report this to the Vineflower issue tracker, at https://github.com/Vineflower/vineflower/issues with a copy of the class file (if you have the rights to distribute it!)
      // java.lang.RuntimeException: parsing failure!
      //   at org.jetbrains.java.decompiler.modules.decompiler.decompose.DomHelper.parseGraph(DomHelper.java:211)
      //   at org.jetbrains.java.decompiler.main.rels.MethodProcessor.codeToJava(MethodProcessor.java:166)
      //
      // Bytecode:
      // 000: getstatic qeaa361f143ee4a0894bd168fd9b30c66/qf4ccf8f5435d4a78bdca4d6a018b578e/baaabbaa.bba I
      // 003: aload 0
      // 004: getfield qeaa361f143ee4a0894bd168fd9b30c66/qf4ccf8f5435d4a78bdca4d6a018b578e/aabaaa.bbaa [F
      // 007: astore 3
      // 008: aload 0
      // 009: aconst_null
      // 00a: putfield qeaa361f143ee4a0894bd168fd9b30c66/qf4ccf8f5435d4a78bdca4d6a018b578e/aabaaa.bbaa [F
      // 00d: aload 1
      // 00e: invokevirtual net/minecraft/class_2828.method_36172 ()Z
      // 011: istore 4
      // 013: istore 2
      // 014: aload 0
      // 015: getfield qeaa361f143ee4a0894bd168fd9b30c66/qf4ccf8f5435d4a78bdca4d6a018b578e/aabaaa.aaabb Z
      // 018: iload 2
      // 019: ifne 072
      // 01c: ifeq 070
      // 01f: goto 023
      // 022: athrow
      // 023: aload 0
      // 024: iload 2
      // 025: ifne 06a
      // 028: goto 02c
      // 02b: athrow
      // 02c: bipush 0
      // 02d: putfield qeaa361f143ee4a0894bd168fd9b30c66/qf4ccf8f5435d4a78bdca4d6a018b578e/aabaaa.aaabb Z
      // 030: aload 0
      // 031: aload 3
      // 032: putfield qeaa361f143ee4a0894bd168fd9b30c66/qf4ccf8f5435d4a78bdca4d6a018b578e/aabaaa.bbaa [F
      // 035: iload 4
      // 037: ifeq 06e
      // 03a: goto 03e
      // 03d: athrow
      // 03e: aload 0
      // 03f: aload 1
      // 040: fconst_0
      // 041: invokevirtual net/minecraft/class_2828.method_12271 (F)F
      // 044: putfield qeaa361f143ee4a0894bd168fd9b30c66/qf4ccf8f5435d4a78bdca4d6a018b578e/aabaaa.baaa F
      // 047: aload 0
      // 048: aload 1
      // 049: fconst_0
      // 04a: invokevirtual net/minecraft/class_2828.method_12270 (F)F
      // 04d: putfield qeaa361f143ee4a0894bd168fd9b30c66/qf4ccf8f5435d4a78bdca4d6a018b578e/aabaaa.abbba F
      // 050: aload 0
      // 051: bipush 1
      // 052: putfield qeaa361f143ee4a0894bd168fd9b30c66/qf4ccf8f5435d4a78bdca4d6a018b578e/aabaaa.baaab Z
      // 055: aload 0
      // 056: aload 0
      // 057: getfield qeaa361f143ee4a0894bd168fd9b30c66/qf4ccf8f5435d4a78bdca4d6a018b578e/aabaaa.baaa F
      // 05a: putfield qeaa361f143ee4a0894bd168fd9b30c66/qf4ccf8f5435d4a78bdca4d6a018b578e/aabaaa.ababab F
      // 05d: aload 0
      // 05e: aload 0
      // 05f: getfield qeaa361f143ee4a0894bd168fd9b30c66/qf4ccf8f5435d4a78bdca4d6a018b578e/aabaaa.abbba F
      // 062: putfield qeaa361f143ee4a0894bd168fd9b30c66/qf4ccf8f5435d4a78bdca4d6a018b578e/aabaaa.abaabb F
      // 065: aload 0
      // 066: goto 06a
      // 069: athrow
      // 06a: bipush 1
      // 06b: putfield qeaa361f143ee4a0894bd168fd9b30c66/qf4ccf8f5435d4a78bdca4d6a018b578e/aabaaa.aabbbb Z
      // 06e: aload 1
      // 06f: areturn
      // 070: iload 4
      // 072: iload 2
      // 073: ifne 085
      // 076: ifeq 094
      // 079: goto 07d
      // 07c: athrow
      // 07d: aload 0
      // 07e: getfield qeaa361f143ee4a0894bd168fd9b30c66/qf4ccf8f5435d4a78bdca4d6a018b578e/aabaaa.baaaa I
      // 081: goto 085
      // 084: athrow
      // 085: iload 2
      // 086: ifne 091
      // 089: ifle 094
      // 08c: goto 090
      // 08f: athrow
      // 090: bipush 1
      // 091: goto 095
      // 094: bipush 0
      // 095: istore 5
      // 097: iload 5
      // 099: iload 2
      // 09a: ifne 0b4
      // 09d: ifeq 0b2
      // 0a0: goto 0a4
      // 0a3: athrow
      // 0a4: aload 0
      // 0a5: dup
      // 0a6: getfield qeaa361f143ee4a0894bd168fd9b30c66/qf4ccf8f5435d4a78bdca4d6a018b578e/aabaaa.baaaa I
      // 0a9: bipush 1
      // 0aa: isub
      // 0ab: putfield qeaa361f143ee4a0894bd168fd9b30c66/qf4ccf8f5435d4a78bdca4d6a018b578e/aabaaa.baaaa I
      // 0ae: goto 0b2
      // 0b1: athrow
      // 0b2: iload 5
      // 0b4: iload 2
      // 0b5: ifne 0c2
      // 0b8: ifne 0d1
      // 0bb: goto 0bf
      // 0be: athrow
      // 0bf: invokestatic qeaa361f143ee4a0894bd168fd9b30c66/qf4ccf8f5435d4a78bdca4d6a018b578e/aabaaa.aababba ()Z
      // 0c2: iload 2
      // 0c3: ifne 0ce
      // 0c6: ifne 0d1
      // 0c9: goto 0cd
      // 0cc: athrow
      // 0cd: bipush 1
      // 0ce: goto 0d2
      // 0d1: bipush 0
      // 0d2: istore 6
      // 0d4: iload 2
      // 0d5: ifne 0f7
      // 0d8: iload 4
      // 0da: ifeq 0fc
      // 0dd: goto 0e1
      // 0e0: athrow
      // 0e1: aload 0
      // 0e2: aload 1
      // 0e3: fconst_0
      // 0e4: invokevirtual net/minecraft/class_2828.method_12271 (F)F
      // 0e7: putfield qeaa361f143ee4a0894bd168fd9b30c66/qf4ccf8f5435d4a78bdca4d6a018b578e/aabaaa.baaa F
      // 0ea: aload 0
      // 0eb: aload 1
      // 0ec: fconst_0
      // 0ed: invokevirtual net/minecraft/class_2828.method_12270 (F)F
      // 0f0: putfield qeaa361f143ee4a0894bd168fd9b30c66/qf4ccf8f5435d4a78bdca4d6a018b578e/aabaaa.abbba F
      // 0f3: goto 0f7
      // 0f6: athrow
      // 0f7: aload 0
      // 0f8: bipush 1
      // 0f9: putfield qeaa361f143ee4a0894bd168fd9b30c66/qf4ccf8f5435d4a78bdca4d6a018b578e/aabaaa.baaab Z
      // 0fc: aload 3
      // 0fd: iload 2
      // 0fe: ifne 109
      // 101: ifnull 13c
      // 104: goto 108
      // 107: athrow
      // 108: aload 3
      // 109: bipush 0
      // 10a: faload
      // 10b: invokestatic java/lang/Float.isFinite (F)Z
      // 10e: iload 2
      // 10f: ifne 13e
      // 112: ifeq 13c
      // 115: goto 119
      // 118: athrow
      // 119: aload 3
      // 11a: bipush 1
      // 11b: faload
      // 11c: invokestatic java/lang/Float.isFinite (F)Z
      // 11f: iload 2
      // 120: ifne 13e
      // 123: goto 127
      // 126: athrow
      // 127: ifeq 13c
      // 12a: goto 12e
      // 12d: athrow
      // 12e: aload 3
      // 12f: bipush 0
      // 130: faload
      // 131: fstore 7
      // 133: iload 2
      // 134: aload 3
      // 135: bipush 1
      // 136: faload
      // 137: fstore 8
      // 139: ifeq 236
      // 13c: iload 4
      // 13e: iload 2
      // 13f: ifne 1b1
      // 142: ifne 1af
      // 145: goto 149
      // 148: athrow
      // 149: aload 0
      // 14a: getfield qeaa361f143ee4a0894bd168fd9b30c66/qf4ccf8f5435d4a78bdca4d6a018b578e/aabaaa.baaab Z
      // 14d: iload 2
      // 14e: ifne 1b1
      // 151: goto 155
      // 154: athrow
      // 155: ifeq 1af
      // 158: goto 15c
      // 15b: athrow
      // 15c: aload 0
      // 15d: getfield qeaa361f143ee4a0894bd168fd9b30c66/qf4ccf8f5435d4a78bdca4d6a018b578e/aabaaa.aabbbb Z
      // 160: iload 2
      // 161: ifne 1b1
      // 164: goto 168
      // 167: athrow
      // 168: ifeq 1af
      // 16b: goto 16f
      // 16e: athrow
      // 16f: aload 0
      // 170: iload 2
      // 171: ifne 1a0
      // 174: goto 178
      // 177: athrow
      // 178: getfield qeaa361f143ee4a0894bd168fd9b30c66/qf4ccf8f5435d4a78bdca4d6a018b578e/aabaaa.ababab F
      // 17b: aload 0
      // 17c: getfield qeaa361f143ee4a0894bd168fd9b30c66/qf4ccf8f5435d4a78bdca4d6a018b578e/aabaaa.baaa F
      // 17f: fcmpl
      // 180: ifne 19f
      // 183: goto 187
      // 186: athrow
      // 187: aload 0
      // 188: getfield qeaa361f143ee4a0894bd168fd9b30c66/qf4ccf8f5435d4a78bdca4d6a018b578e/aabaaa.abaabb F
      // 18b: aload 0
      // 18c: getfield qeaa361f143ee4a0894bd168fd9b30c66/qf4ccf8f5435d4a78bdca4d6a018b578e/aabaaa.abbba F
      // 18f: fcmpl
      // 190: iload 2
      // 191: ifne 1b1
      // 194: goto 198
      // 197: athrow
      // 198: ifeq 1af
      // 19b: goto 19f
      // 19e: athrow
      // 19f: aload 0
      // 1a0: getfield qeaa361f143ee4a0894bd168fd9b30c66/qf4ccf8f5435d4a78bdca4d6a018b578e/aabaaa.baaa F
      // 1a3: fstore 7
      // 1a5: iload 2
      // 1a6: aload 0
      // 1a7: getfield qeaa361f143ee4a0894bd168fd9b30c66/qf4ccf8f5435d4a78bdca4d6a018b578e/aabaaa.abbba F
      // 1aa: fstore 8
      // 1ac: ifeq 236
      // 1af: iload 4
      // 1b1: iload 2
      // 1b2: ifne 218
      // 1b5: ifeq 216
      // 1b8: goto 1bc
      // 1bb: athrow
      // 1bc: iload 6
      // 1be: iload 2
      // 1bf: ifne 218
      // 1c2: goto 1c6
      // 1c5: athrow
      // 1c6: ifeq 216
      // 1c9: goto 1cd
      // 1cc: athrow
      // 1cd: aload 0
      // 1ce: getfield qeaa361f143ee4a0894bd168fd9b30c66/qf4ccf8f5435d4a78bdca4d6a018b578e/aabaaa.aabbbb Z
      // 1d1: iload 2
      // 1d2: ifne 218
      // 1d5: goto 1d9
      // 1d8: athrow
      // 1d9: ifeq 216
      // 1dc: goto 1e0
      // 1df: athrow
      // 1e0: aload 0
      // 1e1: getfield qeaa361f143ee4a0894bd168fd9b30c66/qf4ccf8f5435d4a78bdca4d6a018b578e/aabaaa.baaa F
      // 1e4: aload 0
      // 1e5: getfield qeaa361f143ee4a0894bd168fd9b30c66/qf4ccf8f5435d4a78bdca4d6a018b578e/aabaaa.ababab F
      // 1e8: fcmpl
      // 1e9: iload 2
      // 1ea: ifne 218
      // 1ed: goto 1f1
      // 1f0: athrow
      // 1f1: ifne 216
      // 1f4: goto 1f8
      // 1f7: athrow
      // 1f8: aload 0
      // 1f9: getfield qeaa361f143ee4a0894bd168fd9b30c66/qf4ccf8f5435d4a78bdca4d6a018b578e/aabaaa.abbba F
      // 1fc: aload 0
      // 1fd: getfield qeaa361f143ee4a0894bd168fd9b30c66/qf4ccf8f5435d4a78bdca4d6a018b578e/aabaaa.abaabb F
      // 200: fcmpl
      // 201: iload 2
      // 202: ifne 218
      // 205: goto 209
      // 208: athrow
      // 209: ifne 216
      // 20c: goto 210
      // 20f: athrow
      // 210: aload 1
      // 211: invokestatic qeaa361f143ee4a0894bd168fd9b30c66/qf4ccf8f5435d4a78bdca4d6a018b578e/aabaaa.abbaaba (Lnet/minecraft/class_2828;)Lnet/minecraft/class_2828;
      // 214: areturn
      // 215: athrow
      // 216: iload 4
      // 218: ifeq 234
      // 21b: aload 0
      // 21c: aload 0
      // 21d: getfield qeaa361f143ee4a0894bd168fd9b30c66/qf4ccf8f5435d4a78bdca4d6a018b578e/aabaaa.baaa F
      // 220: putfield qeaa361f143ee4a0894bd168fd9b30c66/qf4ccf8f5435d4a78bdca4d6a018b578e/aabaaa.ababab F
      // 223: aload 0
      // 224: aload 0
      // 225: getfield qeaa361f143ee4a0894bd168fd9b30c66/qf4ccf8f5435d4a78bdca4d6a018b578e/aabaaa.abbba F
      // 228: putfield qeaa361f143ee4a0894bd168fd9b30c66/qf4ccf8f5435d4a78bdca4d6a018b578e/aabaaa.abaabb F
      // 22b: aload 0
      // 22c: bipush 1
      // 22d: putfield qeaa361f143ee4a0894bd168fd9b30c66/qf4ccf8f5435d4a78bdca4d6a018b578e/aabaaa.aabbbb Z
      // 230: goto 234
      // 233: athrow
      // 234: aload 1
      // 235: areturn
      // 236: aload 0
      // 237: iload 2
      // 238: ifne 24a
      // 23b: getfield qeaa361f143ee4a0894bd168fd9b30c66/qf4ccf8f5435d4a78bdca4d6a018b578e/aabaaa.aabbbb Z
      // 23e: ifeq 275
      // 241: goto 245
      // 244: athrow
      // 245: aload 0
      // 246: goto 24a
      // 249: athrow
      // 24a: getfield qeaa361f143ee4a0894bd168fd9b30c66/qf4ccf8f5435d4a78bdca4d6a018b578e/aabaaa.ababab F
      // 24d: fload 7
      // 24f: iload 2
      // 250: ifne 265
      // 253: fcmpl
      // 254: ifne 275
      // 257: goto 25b
      // 25a: athrow
      // 25b: aload 0
      // 25c: getfield qeaa361f143ee4a0894bd168fd9b30c66/qf4ccf8f5435d4a78bdca4d6a018b578e/aabaaa.abaabb F
      // 25f: fload 8
      // 261: goto 265
      // 264: athrow
      // 265: fcmpl
      // 266: iload 2
      // 267: ifne 272
      // 26a: ifne 275
      // 26d: goto 271
      // 270: athrow
      // 271: bipush 1
      // 272: goto 276
      // 275: bipush 0
      // 276: istore 9
      // 278: iload 4
      // 27a: iload 2
      // 27b: ifne 291
      // 27e: ifeq 2bc
      // 281: goto 285
      // 284: athrow
      // 285: aload 1
      // 286: fconst_0
      // 287: invokevirtual net/minecraft/class_2828.method_12271 (F)F
      // 28a: fload 7
      // 28c: fcmpl
      // 28d: goto 291
      // 290: athrow
      // 291: iload 2
      // 292: ifne 2b9
      // 295: ifne 2b8
      // 298: goto 29c
      // 29b: athrow
      // 29c: aload 1
      // 29d: fconst_0
      // 29e: invokevirtual net/minecraft/class_2828.method_12270 (F)F
      // 2a1: fload 8
      // 2a3: fcmpl
      // 2a4: iload 2
      // 2a5: ifne 2b9
      // 2a8: goto 2ac
      // 2ab: athrow
      // 2ac: ifne 2b8
      // 2af: goto 2b3
      // 2b2: athrow
      // 2b3: bipush 1
      // 2b4: goto 2be
      // 2b7: athrow
      // 2b8: bipush 0
      // 2b9: goto 2be
      // 2bc: iload 9
      // 2be: istore 10
      // 2c0: aload 0
      // 2c1: fload 7
      // 2c3: putfield qeaa361f143ee4a0894bd168fd9b30c66/qf4ccf8f5435d4a78bdca4d6a018b578e/aabaaa.ababab F
      // 2c6: aload 0
      // 2c7: fload 8
      // 2c9: putfield qeaa361f143ee4a0894bd168fd9b30c66/qf4ccf8f5435d4a78bdca4d6a018b578e/aabaaa.abaabb F
      // 2cc: aload 0
      // 2cd: bipush 1
      // 2ce: putfield qeaa361f143ee4a0894bd168fd9b30c66/qf4ccf8f5435d4a78bdca4d6a018b578e/aabaaa.aabbbb Z
      // 2d1: iload 10
      // 2d3: iload 2
      // 2d4: ifne 30b
      // 2d7: ifeq 309
      // 2da: goto 2de
      // 2dd: athrow
      // 2de: iload 4
      // 2e0: iload 2
      // 2e1: ifne 2f1
      // 2e4: goto 2e8
      // 2e7: athrow
      // 2e8: ifeq 307
      // 2eb: goto 2ef
      // 2ee: athrow
      // 2ef: iload 9
      // 2f1: iload 2
      // 2f2: ifne 2fe
      // 2f5: ifeq 307
      // 2f8: goto 2fc
      // 2fb: athrow
      // 2fc: iload 6
      // 2fe: ifeq 307
      // 301: aload 1
      // 302: invokestatic qeaa361f143ee4a0894bd168fd9b30c66/qf4ccf8f5435d4a78bdca4d6a018b578e/aabaaa.abbaaba (Lnet/minecraft/class_2828;)Lnet/minecraft/class_2828;
      // 305: areturn
      // 306: athrow
      // 307: aload 1
      // 308: areturn
      // 309: iload 9
      // 30b: iload 2
      // 30c: ifne 320
      // 30f: ifeq 31c
      // 312: goto 316
      // 315: athrow
      // 316: aload 1
      // 317: invokestatic qeaa361f143ee4a0894bd168fd9b30c66/qf4ccf8f5435d4a78bdca4d6a018b578e/aabaaa.abbaaba (Lnet/minecraft/class_2828;)Lnet/minecraft/class_2828;
      // 31a: areturn
      // 31b: athrow
      // 31c: aload 1
      // 31d: invokevirtual net/minecraft/class_2828.method_36171 ()Z
      // 320: ifeq 347
      // 323: new net/minecraft/class_2828$class_2830
      // 326: dup
      // 327: aload 1
      // 328: dconst_0
      // 329: invokevirtual net/minecraft/class_2828.method_12269 (D)D
      // 32c: aload 1
      // 32d: dconst_0
      // 32e: invokevirtual net/minecraft/class_2828.method_12268 (D)D
      // 331: aload 1
      // 332: dconst_0
      // 333: invokevirtual net/minecraft/class_2828.method_12274 (D)D
      // 336: fload 7
      // 338: fload 8
      // 33a: aload 1
      // 33b: invokevirtual net/minecraft/class_2828.method_12273 ()Z
      // 33e: aload 1
      // 33f: invokevirtual net/minecraft/class_2828.method_61225 ()Z
      // 342: invokespecial net/minecraft/class_2828$class_2830.<init> (DDDFFZZ)V
      // 345: areturn
      // 346: athrow
      // 347: new net/minecraft/class_2828$class_2831
      // 34a: dup
      // 34b: fload 7
      // 34d: fload 8
      // 34f: aload 1
      // 350: invokevirtual net/minecraft/class_2828.method_12273 ()Z
      // 353: aload 1
      // 354: invokevirtual net/minecraft/class_2828.method_61225 ()Z
      // 357: invokespecial net/minecraft/class_2828$class_2831.<init> (FFZZ)V
      // 35a: areturn
   }

   private static boolean bbabba(class_2596 param0) {
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
      // 05: invokestatic qeaa361f143ee4a0894bd168fd9b30c66/qf4ccf8f5435d4a78bdca4d6a018b578e/abbabbaa.bbba (Lnet/minecraft/class_2596;)Z
      // 08: iload 1
      // 09: ifne 14
      // 0c: ifne 15
      // 0f: goto 13
      // 12: athrow
      // 13: bipush 0
      // 14: ireturn
      // 15: invokestatic qeaa361f143ee4a0894bd168fd9b30c66/qf4ccf8f5435d4a78bdca4d6a018b578e/abbabbaa.abb ()Lqeaa361f143ee4a0894bd168fd9b30c66/qf4ccf8f5435d4a78bdca4d6a018b578e/abbabbaa;
      // 18: astore 2
      // 19: aload 2
      // 1a: iload 1
      // 1b: ifne 31
      // 1e: invokevirtual qeaa361f143ee4a0894bd168fd9b30c66/qf4ccf8f5435d4a78bdca4d6a018b578e/abbabbaa.aaab ()Z
      // 21: ifeq 70
      // 24: goto 28
      // 27: athrow
      // 28: aload 2
      // 29: iload 1
      // 2a: ifne 40
      // 2d: goto 31
      // 30: athrow
      // 31: invokevirtual qeaa361f143ee4a0894bd168fd9b30c66/qf4ccf8f5435d4a78bdca4d6a018b578e/abbabbaa.bb ()Z
      // 34: ifeq 70
      // 37: aload 2
      // 38: iload 1
      // 39: ifne 4b
      // 3c: goto 40
      // 3f: athrow
      // 40: invokevirtual qeaa361f143ee4a0894bd168fd9b30c66/qf4ccf8f5435d4a78bdca4d6a018b578e/abbabbaa.baab ()Z
      // 43: ifeq 70
      // 46: aload 2
      // 47: goto 4b
      // 4a: athrow
      // 4b: invokevirtual qeaa361f143ee4a0894bd168fd9b30c66/qf4ccf8f5435d4a78bdca4d6a018b578e/abbabbaa.abbbb ()Z
      // 4e: iload 1
      // 4f: ifne 61
      // 52: ifne 70
      // 55: goto 59
      // 58: athrow
      // 59: aload 0
      // 5a: invokestatic qeaa361f143ee4a0894bd168fd9b30c66/qf4ccf8f5435d4a78bdca4d6a018b578e/aabaaa.aaabbba (Lnet/minecraft/class_2596;)Z
      // 5d: goto 61
      // 60: athrow
      // 61: iload 1
      // 62: ifne 6d
      // 65: ifeq 70
      // 68: goto 6c
      // 6b: athrow
      // 6c: bipush 1
      // 6d: goto 71
      // 70: bipush 0
      // 71: ireturn
   }

   public static void bbabbb(long var0) {
      int var10000 = baaabbaa.bba;
      long var3 = System.currentTimeMillis() - Math.max(0L, var0);
      int var2 = var10000;

      for (aabaaa var6 : abba) {
         var6.aaabb(var3);
         if (var2 != 0) {
            break;
         }
      }
   }

   public static boolean bbbaaa() {
      return aaabaa;
   }

   static boolean bbbaab(class_2596 param0, boolean param1, boolean param2) {
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
      // 09: ifnull 43
      // 0c: goto 10
      // 0f: athrow
      // 10: aload 0
      // 11: instanceof net/minecraft/class_2868
      // 14: iload 3
      // 15: ifne 40
      // 18: ifne 3f
      // 1b: goto 1f
      // 1e: athrow
      // 1f: iload 1
      // 20: iload 3
      // 21: ifne 40
      // 24: goto 28
      // 27: athrow
      // 28: ifne 3f
      // 2b: goto 2f
      // 2e: athrow
      // 2f: iload 2
      // 30: iload 3
      // 31: ifne 40
      // 34: goto 38
      // 37: athrow
      // 38: ifeq 43
      // 3b: goto 3f
      // 3e: athrow
      // 3f: bipush 1
      // 40: goto 44
      // 43: bipush 0
      // 44: ireturn
   }

   private static void bbbaba() {
      // $VF: Couldn't be decompiled
      // Please report this to the Vineflower issue tracker, at https://github.com/Vineflower/vineflower/issues with a copy of the class file (if you have the rights to distribute it!)
      // java.lang.RuntimeException: parsing failure!
      //   at org.jetbrains.java.decompiler.modules.decompiler.decompose.DomHelper.parseGraph(DomHelper.java:211)
      //   at org.jetbrains.java.decompiler.main.rels.MethodProcessor.codeToJava(MethodProcessor.java:166)
      //
      // Bytecode:
      // 00: getstatic qeaa361f143ee4a0894bd168fd9b30c66/qf4ccf8f5435d4a78bdca4d6a018b578e/baaabbaa.bba I
      // 03: istore 0
      // 04: getstatic qeaa361f143ee4a0894bd168fd9b30c66/qf4ccf8f5435d4a78bdca4d6a018b578e/aabaaa.baba Ljava/lang/Object;
      // 07: dup
      // 08: astore 1
      // 09: iload 0
      // 0a: ifne 15
      // 0d: monitorenter
      // 0e: getstatic qeaa361f143ee4a0894bd168fd9b30c66/qf4ccf8f5435d4a78bdca4d6a018b578e/aabaaa.abaaa Lqeaa361f143ee4a0894bd168fd9b30c66/qf4ccf8f5435d4a78bdca4d6a018b578e/aaabbabbb;
      // 11: ifnonnull 17
      // 14: aload 1
      // 15: monitorexit
      // 16: return
      // 17: getstatic qeaa361f143ee4a0894bd168fd9b30c66/qf4ccf8f5435d4a78bdca4d6a018b578e/aabaaa.abba Ljava/util/Set;
      // 1a: invokeinterface java/util/Set.iterator ()Ljava/util/Iterator; 1
      // 1f: astore 2
      // 20: aload 2
      // 21: invokeinterface java/util/Iterator.hasNext ()Z 1
      // 26: ifeq 58
      // 29: aload 2
      // 2a: invokeinterface java/util/Iterator.next ()Ljava/lang/Object; 1
      // 2f: checkcast qeaa361f143ee4a0894bd168fd9b30c66/qf4ccf8f5435d4a78bdca4d6a018b578e/aabaaa
      // 32: astore 3
      // 33: iload 0
      // 34: ifne 62
      // 37: aload 3
      // 38: iload 0
      // 39: ifne 52
      // 3c: goto 40
      // 3f: athrow
      // 40: getfield qeaa361f143ee4a0894bd168fd9b30c66/qf4ccf8f5435d4a78bdca4d6a018b578e/aabaaa.bb Ljava/util/concurrent/ConcurrentLinkedQueue;
      // 43: invokevirtual java/util/concurrent/ConcurrentLinkedQueue.isEmpty ()Z
      // 46: ifne 54
      // 49: goto 4d
      // 4c: athrow
      // 4d: aload 1
      // 4e: goto 52
      // 51: athrow
      // 52: monitorexit
      // 53: return
      // 54: iload 0
      // 55: ifeq 20
      // 58: aconst_null
      // 59: putstatic qeaa361f143ee4a0894bd168fd9b30c66/qf4ccf8f5435d4a78bdca4d6a018b578e/aabaaa.abaaa Lqeaa361f143ee4a0894bd168fd9b30c66/qf4ccf8f5435d4a78bdca4d6a018b578e/aaabbabbb;
      // 5c: aconst_null
      // 5d: putstatic qeaa361f143ee4a0894bd168fd9b30c66/qf4ccf8f5435d4a78bdca4d6a018b578e/aabaaa.aaaaba Lqeaa361f143ee4a0894bd168fd9b30c66/qf4ccf8f5435d4a78bdca4d6a018b578e/abaaaabba;
      // 60: aload 1
      // 61: monitorexit
      // 62: goto 6c
      // 65: astore 4
      // 67: aload 1
      // 68: monitorexit
      // 69: aload 4
      // 6b: athrow
      // 6c: return
   }

   private boolean bbbabb(Object param1) {
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
      // 05: instanceof net/minecraft/class_2596
      // 08: iload 2
      // 09: ifne 21
      // 0c: ifeq 1c
      // 0f: goto 13
      // 12: athrow
      // 13: aload 1
      // 14: checkcast net/minecraft/class_2596
      // 17: astore 3
      // 18: iload 2
      // 19: ifeq 22
      // 1c: bipush 0
      // 1d: goto 21
      // 20: athrow
      // 21: ireturn
      // 22: aload 3
      // 23: instanceof net/minecraft/class_2856
      // 26: iload 2
      // 27: ifne 32
      // 2a: ifeq 33
      // 2d: goto 31
      // 30: athrow
      // 31: bipush 0
      // 32: ireturn
      // 33: invokestatic qeaa361f143ee4a0894bd168fd9b30c66/qf4ccf8f5435d4a78bdca4d6a018b578e/abbabbaa.abb ()Lqeaa361f143ee4a0894bd168fd9b30c66/qf4ccf8f5435d4a78bdca4d6a018b578e/abbabbaa;
      // 36: astore 4
      // 38: aload 4
      // 3a: iload 2
      // 3b: ifne 52
      // 3e: invokevirtual qeaa361f143ee4a0894bd168fd9b30c66/qf4ccf8f5435d4a78bdca4d6a018b578e/abbabbaa.aaab ()Z
      // 41: ifeq 85
      // 44: goto 48
      // 47: athrow
      // 48: aload 4
      // 4a: iload 2
      // 4b: ifne 5e
      // 4e: goto 52
      // 51: athrow
      // 52: invokevirtual qeaa361f143ee4a0894bd168fd9b30c66/qf4ccf8f5435d4a78bdca4d6a018b578e/abbabbaa.bb ()Z
      // 55: ifeq 85
      // 58: aload 4
      // 5a: goto 5e
      // 5d: athrow
      // 5e: invokevirtual qeaa361f143ee4a0894bd168fd9b30c66/qf4ccf8f5435d4a78bdca4d6a018b578e/abbabbaa.aabab ()Z
      // 61: iload 2
      // 62: ifne 76
      // 65: ifeq 85
      // 68: goto 6c
      // 6b: athrow
      // 6c: aload 3
      // 6d: invokeinterface net/minecraft/class_2596.method_55943 ()Z 1
      // 72: goto 76
      // 75: athrow
      // 76: iload 2
      // 77: ifne 82
      // 7a: ifne 85
      // 7d: goto 81
      // 80: athrow
      // 81: bipush 1
      // 82: goto 86
      // 85: bipush 0
      // 86: ireturn
   }

   public static boolean bbbbaa(aaabbabbb param0, abaaaabba param1) {
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
      // 05: ifnonnull 0b
      // 08: bipush 0
      // 09: ireturn
      // 0a: athrow
      // 0b: aload 1
      // 0c: iload 2
      // 0d: ifne 1a
      // 10: ifnonnull 1d
      // 13: goto 17
      // 16: athrow
      // 17: getstatic qeaa361f143ee4a0894bd168fd9b30c66/qf4ccf8f5435d4a78bdca4d6a018b578e/abaaaabba.aa Lqeaa361f143ee4a0894bd168fd9b30c66/qf4ccf8f5435d4a78bdca4d6a018b578e/abaaaabba;
      // 1a: goto 1e
      // 1d: aload 1
      // 1e: astore 3
      // 1f: getstatic qeaa361f143ee4a0894bd168fd9b30c66/qf4ccf8f5435d4a78bdca4d6a018b578e/aabaaa.baba Ljava/lang/Object;
      // 22: dup
      // 23: astore 4
      // 25: monitorenter
      // 26: getstatic qeaa361f143ee4a0894bd168fd9b30c66/qf4ccf8f5435d4a78bdca4d6a018b578e/aabaaa.aaabaa Z
      // 29: ifeq 48
      // 2c: getstatic qeaa361f143ee4a0894bd168fd9b30c66/qf4ccf8f5435d4a78bdca4d6a018b578e/aabaaa.abaab Lqeaa361f143ee4a0894bd168fd9b30c66/qf4ccf8f5435d4a78bdca4d6a018b578e/aaabbabbb;
      // 2f: aload 0
      // 30: if_acmpne 43
      // 33: getstatic qeaa361f143ee4a0894bd168fd9b30c66/qf4ccf8f5435d4a78bdca4d6a018b578e/aabaaa.baabb Lqeaa361f143ee4a0894bd168fd9b30c66/qf4ccf8f5435d4a78bdca4d6a018b578e/abaaaabba;
      // 36: aload 3
      // 37: if_acmpne 43
      // 3a: goto 3e
      // 3d: athrow
      // 3e: bipush 1
      // 3f: goto 44
      // 42: athrow
      // 43: bipush 0
      // 44: aload 4
      // 46: monitorexit
      // 47: ireturn
      // 48: getstatic qeaa361f143ee4a0894bd168fd9b30c66/qf4ccf8f5435d4a78bdca4d6a018b578e/aabaaa.abaaa Lqeaa361f143ee4a0894bd168fd9b30c66/qf4ccf8f5435d4a78bdca4d6a018b578e/aaabbabbb;
      // 4b: iload 2
      // 4c: ifne 5c
      // 4f: ifnull 5b
      // 52: goto 56
      // 55: athrow
      // 56: bipush 0
      // 57: aload 4
      // 59: monitorexit
      // 5a: ireturn
      // 5b: aload 0
      // 5c: putstatic qeaa361f143ee4a0894bd168fd9b30c66/qf4ccf8f5435d4a78bdca4d6a018b578e/aabaaa.abaab Lqeaa361f143ee4a0894bd168fd9b30c66/qf4ccf8f5435d4a78bdca4d6a018b578e/aaabbabbb;
      // 5f: aload 3
      // 60: putstatic qeaa361f143ee4a0894bd168fd9b30c66/qf4ccf8f5435d4a78bdca4d6a018b578e/aabaaa.baabb Lqeaa361f143ee4a0894bd168fd9b30c66/qf4ccf8f5435d4a78bdca4d6a018b578e/abaaaabba;
      // 63: bipush 1
      // 64: putstatic qeaa361f143ee4a0894bd168fd9b30c66/qf4ccf8f5435d4a78bdca4d6a018b578e/aabaaa.aaabaa Z
      // 67: bipush 1
      // 68: aload 4
      // 6a: monitorexit
      // 6b: ireturn
      // 6c: astore 5
      // 6e: aload 4
      // 70: monitorexit
      // 71: aload 5
      // 73: athrow
   }

   private void bbbbab(ChannelHandlerContext var1) {
      this.b(var1, 0L);
   }

   private void bbbbba() {
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
      // 05: aload 0
      // 06: getfield qeaa361f143ee4a0894bd168fd9b30c66/qf4ccf8f5435d4a78bdca4d6a018b578e/aabaaa.ba Lio/netty/channel/ChannelHandlerContext;
      // 09: astore 2
      // 0a: ifne 30
      // 0d: aload 2
      // 0e: ifnonnull 31
      // 11: goto 15
      // 14: athrow
      // 15: aload 0
      // 16: aload 0
      // 17: getfield qeaa361f143ee4a0894bd168fd9b30c66/qf4ccf8f5435d4a78bdca4d6a018b578e/aabaaa.bb Ljava/util/concurrent/ConcurrentLinkedQueue;
      // 1a: new java/nio/channels/ClosedChannelException
      // 1d: dup
      // 1e: invokespecial java/nio/channels/ClosedChannelException.<init> ()V
      // 21: invokevirtual qeaa361f143ee4a0894bd168fd9b30c66/qf4ccf8f5435d4a78bdca4d6a018b578e/aabaaa.bba (Ljava/util/concurrent/ConcurrentLinkedQueue;Ljava/lang/Throwable;)V
      // 24: aload 0
      // 25: bipush 0
      // 26: putfield qeaa361f143ee4a0894bd168fd9b30c66/qf4ccf8f5435d4a78bdca4d6a018b578e/aabaaa.aaabab Z
      // 29: invokestatic qeaa361f143ee4a0894bd168fd9b30c66/qf4ccf8f5435d4a78bdca4d6a018b578e/aabaaa.bbbaba ()V
      // 2c: goto 30
      // 2f: athrow
      // 30: return
      // 31: aload 0
      // 32: aload 0
      // 33: iload 1
      // 34: ifne 4f
      // 37: getfield qeaa361f143ee4a0894bd168fd9b30c66/qf4ccf8f5435d4a78bdca4d6a018b578e/aabaaa.bb Ljava/util/concurrent/ConcurrentLinkedQueue;
      // 3a: invokevirtual java/util/concurrent/ConcurrentLinkedQueue.peek ()Ljava/lang/Object;
      // 3d: ifnull 60
      // 40: goto 44
      // 43: athrow
      // 44: aload 0
      // 45: getfield qeaa361f143ee4a0894bd168fd9b30c66/qf4ccf8f5435d4a78bdca4d6a018b578e/aabaaa.bb Ljava/util/concurrent/ConcurrentLinkedQueue;
      // 48: invokevirtual java/util/concurrent/ConcurrentLinkedQueue.peek ()Ljava/lang/Object;
      // 4b: goto 4f
      // 4e: athrow
      // 4f: checkcast qeaa361f143ee4a0894bd168fd9b30c66/qf4ccf8f5435d4a78bdca4d6a018b578e/ababbb
      // 52: getfield qeaa361f143ee4a0894bd168fd9b30c66/qf4ccf8f5435d4a78bdca4d6a018b578e/ababbb.aa Lqeaa361f143ee4a0894bd168fd9b30c66/qf4ccf8f5435d4a78bdca4d6a018b578e/abaaaabba;
      // 55: getstatic qeaa361f143ee4a0894bd168fd9b30c66/qf4ccf8f5435d4a78bdca4d6a018b578e/abaaaabba.ba Lqeaa361f143ee4a0894bd168fd9b30c66/qf4ccf8f5435d4a78bdca4d6a018b578e/abaaaabba;
      // 58: if_acmpne 60
      // 5b: bipush 1
      // 5c: goto 61
      // 5f: athrow
      // 60: bipush 0
      // 61: putfield qeaa361f143ee4a0894bd168fd9b30c66/qf4ccf8f5435d4a78bdca4d6a018b578e/aabaaa.aaabab Z
      // 64: aload 0
      // 65: aload 2
      // 66: lconst_0
      // 67: invokevirtual qeaa361f143ee4a0894bd168fd9b30c66/qf4ccf8f5435d4a78bdca4d6a018b578e/aabaaa.aaaabbb (Lio/netty/channel/ChannelHandlerContext;J)V
      // 6a: return
   }

   private void bbbbbb(ChannelHandlerContext var1) throws Exception {
      int var2 = baaabbaa.bba;

      aababbab var3;
      while ((var3 = (aababbab)this.bbb.poll()) != null) {
         aabaaa var10000;
         label23: {
            try {
               var10000 = this;
               if (var2 != 0) {
                  break label23;
               }

               this.babaaa(var1, var3.b(), var3.ab());
               if (!aaaaaa(var3.b())) {
                  continue;
               }
            } catch (Exception var4) {
               throw var4;
            }

            var10000 = this;
         }

         var10000.ababb = true;
         if (var2 != 0) {
            break;
         }
      }
   }

   private static abaaaabba aaaaaaa(Object param0) {
      // $VF: Couldn't be decompiled
      // Please report this to the Vineflower issue tracker, at https://github.com/Vineflower/vineflower/issues with a copy of the class file (if you have the rights to distribute it!)
      // java.lang.RuntimeException: parsing failure!
      //   at org.jetbrains.java.decompiler.modules.decompiler.decompose.DomHelper.parseGraph(DomHelper.java:211)
      //   at org.jetbrains.java.decompiler.main.rels.MethodProcessor.codeToJava(MethodProcessor.java:166)
      //
      // Bytecode:
      // 00: getstatic qeaa361f143ee4a0894bd168fd9b30c66/qf4ccf8f5435d4a78bdca4d6a018b578e/baaabbaa.bba I
      // 03: istore 1
      // 04: getstatic qeaa361f143ee4a0894bd168fd9b30c66/qf4ccf8f5435d4a78bdca4d6a018b578e/aabaaa.aaabaa Z
      // 07: ifne 1f
      // 0a: getstatic qeaa361f143ee4a0894bd168fd9b30c66/qf4ccf8f5435d4a78bdca4d6a018b578e/aabaaa.abaaa Lqeaa361f143ee4a0894bd168fd9b30c66/qf4ccf8f5435d4a78bdca4d6a018b578e/aaabbabbb;
      // 0d: iload 1
      // 0e: ifne 22
      // 11: goto 15
      // 14: athrow
      // 15: ifnonnull 1f
      // 18: goto 1c
      // 1b: athrow
      // 1c: aconst_null
      // 1d: areturn
      // 1e: athrow
      // 1f: getstatic qeaa361f143ee4a0894bd168fd9b30c66/qf4ccf8f5435d4a78bdca4d6a018b578e/aabaaa.baba Ljava/lang/Object;
      // 22: dup
      // 23: astore 2
      // 24: iload 1
      // 25: ifne 30
      // 28: monitorenter
      // 29: getstatic qeaa361f143ee4a0894bd168fd9b30c66/qf4ccf8f5435d4a78bdca4d6a018b578e/aabaaa.aaabaa Z
      // 2c: ifeq 3f
      // 2f: aload 0
      // 30: getstatic qeaa361f143ee4a0894bd168fd9b30c66/qf4ccf8f5435d4a78bdca4d6a018b578e/aabaaa.baabb Lqeaa361f143ee4a0894bd168fd9b30c66/qf4ccf8f5435d4a78bdca4d6a018b578e/abaaaabba;
      // 33: invokestatic qeaa361f143ee4a0894bd168fd9b30c66/qf4ccf8f5435d4a78bdca4d6a018b578e/aabaaa.aabaaab (Ljava/lang/Object;Lqeaa361f143ee4a0894bd168fd9b30c66/qf4ccf8f5435d4a78bdca4d6a018b578e/abaaaabba;)Z
      // 36: ifeq 3f
      // 39: getstatic qeaa361f143ee4a0894bd168fd9b30c66/qf4ccf8f5435d4a78bdca4d6a018b578e/aabaaa.baabb Lqeaa361f143ee4a0894bd168fd9b30c66/qf4ccf8f5435d4a78bdca4d6a018b578e/abaaaabba;
      // 3c: aload 2
      // 3d: monitorexit
      // 3e: areturn
      // 3f: getstatic qeaa361f143ee4a0894bd168fd9b30c66/qf4ccf8f5435d4a78bdca4d6a018b578e/aabaaa.abaaa Lqeaa361f143ee4a0894bd168fd9b30c66/qf4ccf8f5435d4a78bdca4d6a018b578e/aaabbabbb;
      // 42: iload 1
      // 43: ifne 4e
      // 46: ifnull 5d
      // 49: goto 4d
      // 4c: athrow
      // 4d: aload 0
      // 4e: getstatic qeaa361f143ee4a0894bd168fd9b30c66/qf4ccf8f5435d4a78bdca4d6a018b578e/aabaaa.aaaaba Lqeaa361f143ee4a0894bd168fd9b30c66/qf4ccf8f5435d4a78bdca4d6a018b578e/abaaaabba;
      // 51: invokestatic qeaa361f143ee4a0894bd168fd9b30c66/qf4ccf8f5435d4a78bdca4d6a018b578e/aabaaa.aabaaab (Ljava/lang/Object;Lqeaa361f143ee4a0894bd168fd9b30c66/qf4ccf8f5435d4a78bdca4d6a018b578e/abaaaabba;)Z
      // 54: ifeq 5d
      // 57: getstatic qeaa361f143ee4a0894bd168fd9b30c66/qf4ccf8f5435d4a78bdca4d6a018b578e/aabaaa.aaaaba Lqeaa361f143ee4a0894bd168fd9b30c66/qf4ccf8f5435d4a78bdca4d6a018b578e/abaaaabba;
      // 5a: aload 2
      // 5b: monitorexit
      // 5c: areturn
      // 5d: aconst_null
      // 5e: aload 2
      // 5f: monitorexit
      // 60: areturn
      // 61: astore 3
      // 62: aload 2
      // 63: monitorexit
      // 64: aload 3
      // 65: athrow
   }

   private void aaaaaab() {
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
      // 05: aload 0
      // 06: getfield qeaa361f143ee4a0894bd168fd9b30c66/qf4ccf8f5435d4a78bdca4d6a018b578e/aabaaa.ba Lio/netty/channel/ChannelHandlerContext;
      // 09: astore 2
      // 0a: ifne 38
      // 0d: aload 2
      // 0e: ifnonnull 39
      // 11: goto 15
      // 14: athrow
      // 15: aload 0
      // 16: aload 0
      // 17: getfield qeaa361f143ee4a0894bd168fd9b30c66/qf4ccf8f5435d4a78bdca4d6a018b578e/aabaaa.bb Ljava/util/concurrent/ConcurrentLinkedQueue;
      // 1a: new java/nio/channels/ClosedChannelException
      // 1d: dup
      // 1e: invokespecial java/nio/channels/ClosedChannelException.<init> ()V
      // 21: invokevirtual qeaa361f143ee4a0894bd168fd9b30c66/qf4ccf8f5435d4a78bdca4d6a018b578e/aabaaa.bba (Ljava/util/concurrent/ConcurrentLinkedQueue;Ljava/lang/Throwable;)V
      // 24: aload 0
      // 25: getfield qeaa361f143ee4a0894bd168fd9b30c66/qf4ccf8f5435d4a78bdca4d6a018b578e/aabaaa.bbaba Ljava/util/concurrent/atomic/AtomicBoolean;
      // 28: bipush 0
      // 29: invokevirtual java/util/concurrent/atomic/AtomicBoolean.set (Z)V
      // 2c: aload 0
      // 2d: bipush 0
      // 2e: putfield qeaa361f143ee4a0894bd168fd9b30c66/qf4ccf8f5435d4a78bdca4d6a018b578e/aabaaa.aaabab Z
      // 31: invokestatic qeaa361f143ee4a0894bd168fd9b30c66/qf4ccf8f5435d4a78bdca4d6a018b578e/aabaaa.bbbaba ()V
      // 34: goto 38
      // 37: athrow
      // 38: return
      // 39: aload 0
      // 3a: aload 2
      // 3b: invokedynamic run (Lqeaa361f143ee4a0894bd168fd9b30c66/qf4ccf8f5435d4a78bdca4d6a018b578e/aabaaa;Lio/netty/channel/ChannelHandlerContext;)Ljava/lang/Runnable; bsm=java/lang/invoke/LambdaMetafactory.metafactory (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;Ljava/lang/invoke/MethodType;Ljava/lang/invoke/MethodHandle;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[ ()V, qeaa361f143ee4a0894bd168fd9b30c66/qf4ccf8f5435d4a78bdca4d6a018b578e/aabaaa.bbabaa (Lio/netty/channel/ChannelHandlerContext;)V, ()V ]
      // 40: astore 3
      // 41: iload 1
      // 42: ifne 71
      // 45: aload 2
      // 46: invokeinterface io/netty/channel/ChannelHandlerContext.executor ()Lio/netty/util/concurrent/EventExecutor; 1
      // 4b: invokeinterface io/netty/util/concurrent/EventExecutor.inEventLoop ()Z 1
      // 50: ifeq 5f
      // 53: goto 57
      // 56: athrow
      // 57: aload 3
      // 58: invokeinterface java/lang/Runnable.run ()V 1
      // 5d: return
      // 5e: athrow
      // 5f: aload 2
      // 60: invokeinterface io/netty/channel/ChannelHandlerContext.executor ()Lio/netty/util/concurrent/EventExecutor; 1
      // 65: aload 3
      // 66: invokeinterface io/netty/util/concurrent/EventExecutor.submit (Ljava/lang/Runnable;)Lio/netty/util/concurrent/Future; 2
      // 6b: invokeinterface io/netty/util/concurrent/Future.sync ()Lio/netty/util/concurrent/Future; 1
      // 70: pop
      // 71: goto 96
      // 74: astore 4
      // 76: invokestatic java/lang/Thread.currentThread ()Ljava/lang/Thread;
      // 79: invokevirtual java/lang/Thread.interrupt ()V
      // 7c: aload 0
      // 7d: aload 0
      // 7e: getfield qeaa361f143ee4a0894bd168fd9b30c66/qf4ccf8f5435d4a78bdca4d6a018b578e/aabaaa.bb Ljava/util/concurrent/ConcurrentLinkedQueue;
      // 81: aload 4
      // 83: invokevirtual qeaa361f143ee4a0894bd168fd9b30c66/qf4ccf8f5435d4a78bdca4d6a018b578e/aabaaa.bba (Ljava/util/concurrent/ConcurrentLinkedQueue;Ljava/lang/Throwable;)V
      // 86: aload 0
      // 87: getfield qeaa361f143ee4a0894bd168fd9b30c66/qf4ccf8f5435d4a78bdca4d6a018b578e/aabaaa.bbaba Ljava/util/concurrent/atomic/AtomicBoolean;
      // 8a: bipush 0
      // 8b: invokevirtual java/util/concurrent/atomic/AtomicBoolean.set (Z)V
      // 8e: aload 0
      // 8f: bipush 0
      // 90: putfield qeaa361f143ee4a0894bd168fd9b30c66/qf4ccf8f5435d4a78bdca4d6a018b578e/aabaaa.aaabab Z
      // 93: invokestatic qeaa361f143ee4a0894bd168fd9b30c66/qf4ccf8f5435d4a78bdca4d6a018b578e/aabaaa.bbbaba ()V
      // 96: return
   }

   public static boolean aaaaaba(aaabbabbb param0) {
      // $VF: Couldn't be decompiled
      // Please report this to the Vineflower issue tracker, at https://github.com/Vineflower/vineflower/issues with a copy of the class file (if you have the rights to distribute it!)
      // java.lang.RuntimeException: parsing failure!
      //   at org.jetbrains.java.decompiler.modules.decompiler.decompose.DomHelper.parseGraph(DomHelper.java:211)
      //   at org.jetbrains.java.decompiler.main.rels.MethodProcessor.codeToJava(MethodProcessor.java:166)
      //
      // Bytecode:
      // 00: aload 0
      // 01: ifnull 1e
      // 04: getstatic qeaa361f143ee4a0894bd168fd9b30c66/qf4ccf8f5435d4a78bdca4d6a018b578e/aabaaa.aaabaa Z
      // 07: ifeq 1e
      // 0a: goto 0e
      // 0d: athrow
      // 0e: getstatic qeaa361f143ee4a0894bd168fd9b30c66/qf4ccf8f5435d4a78bdca4d6a018b578e/aabaaa.abaab Lqeaa361f143ee4a0894bd168fd9b30c66/qf4ccf8f5435d4a78bdca4d6a018b578e/aaabbabbb;
      // 11: aload 0
      // 12: if_acmpne 1e
      // 15: goto 19
      // 18: athrow
      // 19: bipush 1
      // 1a: goto 1f
      // 1d: athrow
      // 1e: bipush 0
      // 1f: ireturn
   }

   private long aaaaabb(ababbb var1) {
      int var2 = baaabbaa.bba;

      ababbb var10000;
      label27: {
         try {
            var10000 = var1;
            if (var2 != 0) {
               break label27;
            }

            if (var1 == null) {
               return aaaab;
            }
         } catch (CancellationException var4) {
            throw var4;
         }

         var10000 = var1;
      }

      try {
         if (var10000.aa == abaaaabba.ba) {
            return ababba;
         }
      } catch (CancellationException var3) {
         throw var3;
      }

      return aaaab;
   }

   private void aaaabaa(ChannelHandlerContext param1, Object param2, ChannelPromise param3) {
      // $VF: Couldn't be decompiled
      // Please report this to the Vineflower issue tracker, at https://github.com/Vineflower/vineflower/issues with a copy of the class file (if you have the rights to distribute it!)
      // java.lang.RuntimeException: parsing failure!
      //   at org.jetbrains.java.decompiler.modules.decompiler.decompose.DomHelper.parseGraph(DomHelper.java:211)
      //   at org.jetbrains.java.decompiler.main.rels.MethodProcessor.codeToJava(MethodProcessor.java:166)
      //
      // Bytecode:
      // 00: getstatic qeaa361f143ee4a0894bd168fd9b30c66/qf4ccf8f5435d4a78bdca4d6a018b578e/baaabbaa.bba I
      // 03: istore 4
      // 05: aload 3
      // 06: iload 4
      // 08: ifne 21
      // 0b: invokeinterface io/netty/channel/ChannelPromise.isVoid ()Z 1
      // 10: ifeq 24
      // 13: goto 17
      // 16: athrow
      // 17: aload 1
      // 18: invokeinterface io/netty/channel/ChannelHandlerContext.newPromise ()Lio/netty/channel/ChannelPromise; 1
      // 1d: goto 21
      // 20: athrow
      // 21: goto 25
      // 24: aload 3
      // 25: astore 5
      // 27: aload 5
      // 29: aload 1
      // 2a: aload 2
      // 2b: invokedynamic operationComplete (Lio/netty/channel/ChannelHandlerContext;Ljava/lang/Object;)Lio/netty/util/concurrent/GenericFutureListener; bsm=java/lang/invoke/LambdaMetafactory.metafactory (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;Ljava/lang/invoke/MethodType;Ljava/lang/invoke/MethodHandle;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[ (Lio/netty/util/concurrent/Future;)V, qeaa361f143ee4a0894bd168fd9b30c66/qf4ccf8f5435d4a78bdca4d6a018b578e/aabaaa.aaaabab (Lio/netty/channel/ChannelHandlerContext;Ljava/lang/Object;Lio/netty/util/concurrent/Future;)V, (Lio/netty/util/concurrent/Future;)V ]
      // 30: invokeinterface io/netty/channel/ChannelPromise.addListener (Lio/netty/util/concurrent/GenericFutureListener;)Lio/netty/channel/ChannelPromise; 2
      // 35: pop
      // 36: aload 0
      // 37: aload 1
      // 38: aload 2
      // 39: aload 5
      // 3b: invokevirtual qeaa361f143ee4a0894bd168fd9b30c66/qf4ccf8f5435d4a78bdca4d6a018b578e/aabaaa.abbaabb (Lio/netty/channel/ChannelHandlerContext;Ljava/lang/Object;Lio/netty/channel/ChannelPromise;)Z
      // 3e: pop
      // 3f: return
   }

   private static void aaaabab(ChannelHandlerContext param0, Object param1, Future param2) throws Exception {
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
      // 05: invokeinterface io/netty/util/concurrent/Future.isSuccess ()Z 1
      // 0a: iload 3
      // 0b: ifne 2c
      // 0e: ifne 2f
      // 11: goto 15
      // 14: athrow
      // 15: aload 0
      // 16: iload 3
      // 17: ifne 31
      // 1a: goto 1e
      // 1d: athrow
      // 1e: invokeinterface io/netty/channel/ChannelHandlerContext.channel ()Lio/netty/channel/Channel; 1
      // 23: invokeinterface io/netty/channel/Channel.isOpen ()Z 1
      // 28: goto 2c
      // 2b: athrow
      // 2c: ifne 30
      // 2f: return
      // 30: aload 0
      // 31: invokeinterface io/netty/channel/ChannelHandlerContext.executor ()Lio/netty/util/concurrent/EventExecutor; 1
      // 36: aload 0
      // 37: aload 1
      // 38: invokedynamic run (Lio/netty/channel/ChannelHandlerContext;Ljava/lang/Object;)Ljava/lang/Runnable; bsm=java/lang/invoke/LambdaMetafactory.metafactory (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;Ljava/lang/invoke/MethodType;Ljava/lang/invoke/MethodHandle;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[ ()V, qeaa361f143ee4a0894bd168fd9b30c66/qf4ccf8f5435d4a78bdca4d6a018b578e/aabaaa.abbbaba (Lio/netty/channel/ChannelHandlerContext;Ljava/lang/Object;)V, ()V ]
      // 3d: invokeinterface io/netty/util/concurrent/EventExecutor.execute (Ljava/lang/Runnable;)V 2
      // 42: return
   }

   private void aaaabba(Throwable var1) {
      int var2 = baaabbaa.bba;

      aabaaab var3;
      while ((var3 = (aabaaab)this.aabbaa.poll()) != null) {
         this.bbbaa.remove(var3);
         var3.ab.tryFailure(var1);
         if (var2 != 0) {
            break;
         }
      }
   }

   private void aaaabbb(ChannelHandlerContext param1, long param2) {
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
      // 08: ifne 1d
      // 0b: getfield qeaa361f143ee4a0894bd168fd9b30c66/qf4ccf8f5435d4a78bdca4d6a018b578e/aabaaa.bbaba Ljava/util/concurrent/atomic/AtomicBoolean;
      // 0e: bipush 0
      // 0f: bipush 1
      // 10: invokevirtual java/util/concurrent/atomic/AtomicBoolean.compareAndSet (ZZ)Z
      // 13: ifne 1c
      // 16: goto 1a
      // 19: athrow
      // 1a: return
      // 1b: athrow
      // 1c: aload 0
      // 1d: aload 1
      // 1e: invokedynamic run (Lqeaa361f143ee4a0894bd168fd9b30c66/qf4ccf8f5435d4a78bdca4d6a018b578e/aabaaa;Lio/netty/channel/ChannelHandlerContext;)Ljava/lang/Runnable; bsm=java/lang/invoke/LambdaMetafactory.metafactory (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;Ljava/lang/invoke/MethodType;Ljava/lang/invoke/MethodHandle;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[ ()V, qeaa361f143ee4a0894bd168fd9b30c66/qf4ccf8f5435d4a78bdca4d6a018b578e/aabaaa.aaaabb (Lio/netty/channel/ChannelHandlerContext;)V, ()V ]
      // 23: astore 5
      // 25: lload 2
      // 26: lconst_0
      // 27: lcmp
      // 28: iload 4
      // 2a: ifne 62
      // 2d: ifle 4e
      // 30: goto 34
      // 33: athrow
      // 34: aload 1
      // 35: invokeinterface io/netty/channel/ChannelHandlerContext.executor ()Lio/netty/util/concurrent/EventExecutor; 1
      // 3a: aload 5
      // 3c: lload 2
      // 3d: getstatic qeaa361f143ee4a0894bd168fd9b30c66/qf4ccf8f5435d4a78bdca4d6a018b578e/aabaaa.abaa J
      // 40: invokestatic java/lang/Math.max (JJ)J
      // 43: getstatic java/util/concurrent/TimeUnit.NANOSECONDS Ljava/util/concurrent/TimeUnit;
      // 46: invokeinterface io/netty/util/concurrent/EventExecutor.schedule (Ljava/lang/Runnable;JLjava/util/concurrent/TimeUnit;)Lio/netty/util/concurrent/ScheduledFuture; 5
      // 4b: pop
      // 4c: return
      // 4d: athrow
      // 4e: aload 1
      // 4f: iload 4
      // 51: ifne 7a
      // 54: invokeinterface io/netty/channel/ChannelHandlerContext.executor ()Lio/netty/util/concurrent/EventExecutor; 1
      // 59: invokeinterface io/netty/util/concurrent/EventExecutor.inEventLoop ()Z 1
      // 5e: goto 62
      // 61: athrow
      // 62: ifeq 75
      // 65: aload 5
      // 67: invokeinterface java/lang/Runnable.run ()V 1
      // 6c: iload 4
      // 6e: ifeq 86
      // 71: goto 75
      // 74: athrow
      // 75: aload 1
      // 76: goto 7a
      // 79: athrow
      // 7a: invokeinterface io/netty/channel/ChannelHandlerContext.executor ()Lio/netty/util/concurrent/EventExecutor; 1
      // 7f: aload 5
      // 81: invokeinterface io/netty/util/concurrent/EventExecutor.execute (Ljava/lang/Runnable;)V 2
      // 86: return
   }

   private static boolean aaabaaa(class_2596 param0) {
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
      // 05: instanceof net/minecraft/class_2868
      // 08: iload 1
      // 09: ifne 2b
      // 0c: ifne 26
      // 0f: goto 13
      // 12: athrow
      // 13: aload 0
      // 14: iload 1
      // 15: ifne 2d
      // 18: goto 1c
      // 1b: athrow
      // 1c: instanceof net/minecraft/class_2828
      // 1f: ifeq 2c
      // 22: goto 26
      // 25: athrow
      // 26: bipush 1
      // 27: goto 2b
      // 2a: athrow
      // 2b: ireturn
      // 2c: aload 0
      // 2d: instanceof net/minecraft/class_2824
      // 30: iload 1
      // 31: ifne 3c
      // 34: ifne 3d
      // 37: goto 3b
      // 3a: athrow
      // 3b: bipush 0
      // 3c: ireturn
      // 3d: invokestatic qeaa361f143ee4a0894bd168fd9b30c66/qf4ccf8f5435d4a78bdca4d6a018b578e/abaaaaaba.aaaaa ()Lqeaa361f143ee4a0894bd168fd9b30c66/qf4ccf8f5435d4a78bdca4d6a018b578e/abaaaaaba;
      // 40: astore 2
      // 41: aload 2
      // 42: iload 1
      // 43: ifne 53
      // 46: ifnonnull 52
      // 49: goto 4d
      // 4c: athrow
      // 4d: aconst_null
      // 4e: goto 56
      // 51: athrow
      // 52: aload 2
      // 53: invokevirtual qeaa361f143ee4a0894bd168fd9b30c66/qf4ccf8f5435d4a78bdca4d6a018b578e/abaaaaaba.aaba ()Lqeaa361f143ee4a0894bd168fd9b30c66/qf4ccf8f5435d4a78bdca4d6a018b578e/babbaba;
      // 56: astore 3
      // 57: aload 3
      // 58: iload 1
      // 59: ifne 64
      // 5c: ifnull 77
      // 5f: goto 63
      // 62: athrow
      // 63: aload 3
      // 64: aload 0
      // 65: invokevirtual qeaa361f143ee4a0894bd168fd9b30c66/qf4ccf8f5435d4a78bdca4d6a018b578e/babbaba.aaaaabb (Lnet/minecraft/class_2596;)Z
      // 68: iload 1
      // 69: ifne 74
      // 6c: ifeq 77
      // 6f: goto 73
      // 72: athrow
      // 73: bipush 1
      // 74: goto 78
      // 77: bipush 0
      // 78: ireturn
   }

   private void aaabaab() {
      this.bbaa = null;
      this.aabbbb = false;
      this.baaab = false;
      this.aaabb = false;
      this.baaaa = 0;
      this.abbaaa = false;
      this.abaaba = false;
   }

   public static void aaababa(aaabbabbb param0, long param1) {
      // $VF: Couldn't be decompiled
      // Please report this to the Vineflower issue tracker, at https://github.com/Vineflower/vineflower/issues with a copy of the class file (if you have the rights to distribute it!)
      // java.lang.NullPointerException: Cannot invoke "org.jetbrains.java.decompiler.code.cfg.ExceptionRangeCFG.isCircular()" because "range" is null
      //   at org.jetbrains.java.decompiler.modules.decompiler.decompose.DomHelper.graphToStatement(DomHelper.java:84)
      //   at org.jetbrains.java.decompiler.modules.decompiler.decompose.DomHelper.parseGraph(DomHelper.java:203)
      //   at org.jetbrains.java.decompiler.main.rels.MethodProcessor.codeToJava(MethodProcessor.java:166)
      //
      // Bytecode:
      // 00: getstatic qeaa361f143ee4a0894bd168fd9b30c66/qf4ccf8f5435d4a78bdca4d6a018b578e/baaabbaa.bba I
      // 03: istore 3
      // 04: getstatic qeaa361f143ee4a0894bd168fd9b30c66/qf4ccf8f5435d4a78bdca4d6a018b578e/aabaaa.baba Ljava/lang/Object;
      // 07: dup
      // 08: astore 5
      // 0a: iload 3
      // 0b: ifne 3a
      // 0e: monitorenter
      // 0f: getstatic qeaa361f143ee4a0894bd168fd9b30c66/qf4ccf8f5435d4a78bdca4d6a018b578e/aabaaa.aaabaa Z
      // 12: ifeq 34
      // 15: aload 0
      // 16: iload 3
      // 17: ifne 3a
      // 1a: ifnull 34
      // 1d: goto 21
      // 20: athrow
      // 21: getstatic qeaa361f143ee4a0894bd168fd9b30c66/qf4ccf8f5435d4a78bdca4d6a018b578e/aabaaa.abaab Lqeaa361f143ee4a0894bd168fd9b30c66/qf4ccf8f5435d4a78bdca4d6a018b578e/aaabbabbb;
      // 24: iload 3
      // 25: ifne 3a
      // 28: goto 2c
      // 2b: athrow
      // 2c: aload 0
      // 2d: if_acmpeq 3c
      // 30: goto 34
      // 33: athrow
      // 34: aload 5
      // 36: goto 3a
      // 39: athrow
      // 3a: monitorexit
      // 3b: return
      // 3c: getstatic qeaa361f143ee4a0894bd168fd9b30c66/qf4ccf8f5435d4a78bdca4d6a018b578e/aabaaa.baabb Lqeaa361f143ee4a0894bd168fd9b30c66/qf4ccf8f5435d4a78bdca4d6a018b578e/abaaaabba;
      // 3f: astore 4
      // 41: aload 5
      // 43: monitorexit
      // 44: goto 4f
      // 47: astore 6
      // 49: aload 5
      // 4b: monitorexit
      // 4c: aload 6
      // 4e: athrow
      // 4f: lconst_0
      // 50: lload 1
      // 51: invokestatic java/lang/Math.max (JJ)J
      // 54: lstore 5
      // 56: invokestatic java/lang/System.nanoTime ()J
      // 59: getstatic java/util/concurrent/TimeUnit.MILLISECONDS Ljava/util/concurrent/TimeUnit;
      // 5c: lload 5
      // 5e: invokevirtual java/util/concurrent/TimeUnit.toNanos (J)J
      // 61: lsub
      // 62: lstore 7
      // 64: getstatic qeaa361f143ee4a0894bd168fd9b30c66/qf4ccf8f5435d4a78bdca4d6a018b578e/aabaaa.abba Ljava/util/Set;
      // 67: invokeinterface java/util/Set.iterator ()Ljava/util/Iterator; 1
      // 6c: astore 9
      // 6e: aload 9
      // 70: invokeinterface java/util/Iterator.hasNext ()Z 1
      // 75: ifeq 91
      // 78: aload 9
      // 7a: invokeinterface java/util/Iterator.next ()Ljava/lang/Object; 1
      // 7f: checkcast qeaa361f143ee4a0894bd168fd9b30c66/qf4ccf8f5435d4a78bdca4d6a018b578e/aabaaa
      // 82: astore 10
      // 84: iload 3
      // 85: aload 10
      // 87: lload 7
      // 89: aload 4
      // 8b: invokevirtual qeaa361f143ee4a0894bd168fd9b30c66/qf4ccf8f5435d4a78bdca4d6a018b578e/aabaaa.ababbaa (JLqeaa361f143ee4a0894bd168fd9b30c66/qf4ccf8f5435d4a78bdca4d6a018b578e/abaaaabba;)V
      // 8e: ifeq 6e
      // 91: return
   }

   private void aaababb(ChannelHandlerContext param1) {
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
      // 05: getfield qeaa361f143ee4a0894bd168fd9b30c66/qf4ccf8f5435d4a78bdca4d6a018b578e/aabaaa.abbb Ljava/util/concurrent/atomic/AtomicBoolean;
      // 08: bipush 0
      // 09: invokevirtual java/util/concurrent/atomic/AtomicBoolean.set (Z)V
      // 0c: bipush 0
      // 0d: istore 4
      // 0f: aload 0
      // 10: getfield qeaa361f143ee4a0894bd168fd9b30c66/qf4ccf8f5435d4a78bdca4d6a018b578e/aabaaa.aabbaa Ljava/util/concurrent/ConcurrentLinkedQueue;
      // 13: invokevirtual java/util/concurrent/ConcurrentLinkedQueue.poll ()Ljava/lang/Object;
      // 16: checkcast qeaa361f143ee4a0894bd168fd9b30c66/qf4ccf8f5435d4a78bdca4d6a018b578e/aabaaab
      // 19: dup
      // 1a: astore 3
      // 1b: ifnull 48
      // 1e: aload 0
      // 1f: getfield qeaa361f143ee4a0894bd168fd9b30c66/qf4ccf8f5435d4a78bdca4d6a018b578e/aabaaa.bbbaa Ljava/util/Set;
      // 22: aload 3
      // 23: invokeinterface java/util/Set.remove (Ljava/lang/Object;)Z 2
      // 28: pop
      // 29: iload 4
      // 2b: aload 0
      // 2c: aload 1
      // 2d: aload 3
      // 2e: getfield qeaa361f143ee4a0894bd168fd9b30c66/qf4ccf8f5435d4a78bdca4d6a018b578e/aabaaab.ba Ljava/lang/Object;
      // 31: aload 3
      // 32: getfield qeaa361f143ee4a0894bd168fd9b30c66/qf4ccf8f5435d4a78bdca4d6a018b578e/aabaaab.ab Lio/netty/channel/ChannelPromise;
      // 35: invokevirtual qeaa361f143ee4a0894bd168fd9b30c66/qf4ccf8f5435d4a78bdca4d6a018b578e/aabaaa.abbaabb (Lio/netty/channel/ChannelHandlerContext;Ljava/lang/Object;Lio/netty/channel/ChannelPromise;)Z
      // 38: ior
      // 39: iload 2
      // 3a: ifne 4a
      // 3d: istore 4
      // 3f: iload 2
      // 40: aload 0
      // 41: aload 3
      // 42: invokevirtual qeaa361f143ee4a0894bd168fd9b30c66/qf4ccf8f5435d4a78bdca4d6a018b578e/aabaaa.abbbbb (Lqeaa361f143ee4a0894bd168fd9b30c66/qf4ccf8f5435d4a78bdca4d6a018b578e/aabaaab;)V
      // 45: ifeq 0f
      // 48: iload 4
      // 4a: iload 2
      // 4b: ifne 6c
      // 4e: ifeq 7a
      // 51: goto 55
      // 54: athrow
      // 55: aload 1
      // 56: iload 2
      // 57: ifne 79
      // 5a: goto 5e
      // 5d: athrow
      // 5e: invokeinterface io/netty/channel/ChannelHandlerContext.channel ()Lio/netty/channel/Channel; 1
      // 63: invokeinterface io/netty/channel/Channel.isOpen ()Z 1
      // 68: goto 6c
      // 6b: athrow
      // 6c: ifeq 7a
      // 6f: aload 1
      // 70: invokeinterface io/netty/channel/ChannelHandlerContext.flush ()Lio/netty/channel/ChannelHandlerContext; 1
      // 75: goto 79
      // 78: athrow
      // 79: pop
      // 7a: goto 86
      // 7d: astore 3
      // 7e: aload 0
      // 7f: getfield qeaa361f143ee4a0894bd168fd9b30c66/qf4ccf8f5435d4a78bdca4d6a018b578e/aabaaa.abbb Ljava/util/concurrent/atomic/AtomicBoolean;
      // 82: bipush 0
      // 83: invokevirtual java/util/concurrent/atomic/AtomicBoolean.set (Z)V
      // 86: return
   }

   private static void aaabbaa(Object param0) {
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
      // 09: instanceof net/minecraft/class_2596
      // 0c: ifeq 20
      // 0f: goto 13
      // 12: athrow
      // 13: aload 0
      // 14: goto 18
      // 17: athrow
      // 18: checkcast net/minecraft/class_2596
      // 1b: astore 2
      // 1c: iload 1
      // 1d: ifeq 22
      // 20: return
      // 21: athrow
      // 22: getstatic qeaa361f143ee4a0894bd168fd9b30c66/qf4ccf8f5435d4a78bdca4d6a018b578e/aabaaa.a Lqeaa361f143ee4a0894bd168fd9b30c66/qf4ccf8f5435d4a78bdca4d6a018b578e/baabbba;
      // 25: astore 3
      // 26: iload 1
      // 27: ifne 3e
      // 2a: aload 3
      // 2b: ifnonnull 34
      // 2e: goto 32
      // 31: athrow
      // 32: return
      // 33: athrow
      // 34: aload 3
      // 35: aload 2
      // 36: invokedynamic run (Lqeaa361f143ee4a0894bd168fd9b30c66/qf4ccf8f5435d4a78bdca4d6a018b578e/baabbba;Lnet/minecraft/class_2596;)Ljava/lang/Runnable; bsm=java/lang/invoke/LambdaMetafactory.metafactory (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;Ljava/lang/invoke/MethodType;Ljava/lang/invoke/MethodHandle;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[ ()V, qeaa361f143ee4a0894bd168fd9b30c66/qf4ccf8f5435d4a78bdca4d6a018b578e/aabaaa.aa (Lqeaa361f143ee4a0894bd168fd9b30c66/qf4ccf8f5435d4a78bdca4d6a018b578e/baabbba;Lnet/minecraft/class_2596;)V, ()V ]
      // 3b: invokestatic qeaa361f143ee4a0894bd168fd9b30c66/qf4ccf8f5435d4a78bdca4d6a018b578e/aabaaa.bbaabb (Ljava/lang/Runnable;)V
      // 3e: return
   }

   private static void aaabbab(class_2868 param0, Future param1) throws Exception {
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
      // 05: invokeinterface io/netty/util/concurrent/Future.isSuccess ()Z 1
      // 0a: iload 2
      // 0b: ifne 1d
      // 0e: ifne 20
      // 11: goto 15
      // 14: athrow
      // 15: aload 0
      // 16: invokevirtual net/minecraft/class_2868.method_12442 ()I
      // 19: goto 1d
      // 1c: athrow
      // 1d: invokestatic qeaa361f143ee4a0894bd168fd9b30c66/qf4ccf8f5435d4a78bdca4d6a018b578e/bbbbbbba.aba (I)V
      // 20: return
   }

   private static boolean aaabbba(class_2596 param0) {
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
      // 0b: getstatic qeaa361f143ee4a0894bd168fd9b30c66/qf4ccf8f5435d4a78bdca4d6a018b578e/aabaaa.a Lqeaa361f143ee4a0894bd168fd9b30c66/qf4ccf8f5435d4a78bdca4d6a018b578e/baabbba;
      // 0e: astore 2
      // 0f: aload 2
      // 10: iload 1
      // 11: ifne 1f
      // 14: ifnonnull 1e
      // 17: goto 1b
      // 1a: athrow
      // 1b: bipush 0
      // 1c: ireturn
      // 1d: athrow
      // 1e: aload 2
      // 1f: invokevirtual qeaa361f143ee4a0894bd168fd9b30c66/qf4ccf8f5435d4a78bdca4d6a018b578e/baabbba.b ()Ljava/util/function/Predicate;
      // 22: aload 0
      // 23: invokeinterface java/util/function/Predicate.test (Ljava/lang/Object;)Z 2
      // 28: ireturn
      // 29: astore 3
      // 2a: aload 3
      // 2b: pop
      // 2c: bipush 0
      // 2d: ireturn
   }

   private static boolean aaabbbb(class_2596 var0) {
      return false;
   }

   private long aabaaaa(aabaaab param1) {
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
      // 05: getfield qeaa361f143ee4a0894bd168fd9b30c66/qf4ccf8f5435d4a78bdca4d6a018b578e/aabaaab.ba Ljava/lang/Object;
      // 08: invokevirtual qeaa361f143ee4a0894bd168fd9b30c66/qf4ccf8f5435d4a78bdca4d6a018b578e/aabaaa.abbbbba (Ljava/lang/Object;)J
      // 0b: lstore 3
      // 0c: istore 2
      // 0d: lload 3
      // 0e: lconst_0
      // 0f: lcmp
      // 10: iload 2
      // 11: ifne 25
      // 14: ifgt 1e
      // 17: goto 1b
      // 1a: athrow
      // 1b: lconst_0
      // 1c: lreturn
      // 1d: athrow
      // 1e: aload 0
      // 1f: getfield qeaa361f143ee4a0894bd168fd9b30c66/qf4ccf8f5435d4a78bdca4d6a018b578e/aabaaa.aabbaa Ljava/util/concurrent/ConcurrentLinkedQueue;
      // 22: invokevirtual java/util/concurrent/ConcurrentLinkedQueue.size ()I
      // 25: ldc_w -522994283
      // 28: ldc_w -528508156
      // 2b: ldc_w -1172331122
      // 2e: ixor
      // 2f: invokestatic qeaa361f143ee4a0894bd168fd9b30c66/qf4ccf8f5435d4a78bdca4d6a018b578e/aabaaa.baaaaab (II)I
      // 32: ldc2_w 1318330099735229031
      // 35: invokestatic qeaa361f143ee4a0894bd168fd9b30c66/qf4ccf8f5435d4a78bdca4d6a018b578e/aabaaa.abbbbab (IJ)I
      // 38: if_icmple 3e
      // 3b: lconst_0
      // 3c: lreturn
      // 3d: athrow
      // 3e: invokestatic qeaa361f143ee4a0894bd168fd9b30c66/qf4ccf8f5435d4a78bdca4d6a018b578e/aabaaa.abba ()Lqeaa361f143ee4a0894bd168fd9b30c66/qf4ccf8f5435d4a78bdca4d6a018b578e/abbbbbbb;
      // 41: getstatic qeaa361f143ee4a0894bd168fd9b30c66/qf4ccf8f5435d4a78bdca4d6a018b578e/abbbbbbb.b Lqeaa361f143ee4a0894bd168fd9b30c66/qf4ccf8f5435d4a78bdca4d6a018b578e/abbbbbbb;
      // 44: if_acmpne 74
      // 47: aload 0
      // 48: getfield qeaa361f143ee4a0894bd168fd9b30c66/qf4ccf8f5435d4a78bdca4d6a018b578e/aabaaa.bbbaa Ljava/util/Set;
      // 4b: aload 1
      // 4c: invokeinterface java/util/Set.contains (Ljava/lang/Object;)Z 2
      // 51: ifeq 74
      // 54: goto 58
      // 57: athrow
      // 58: ldc_w -522994284
      // 5b: ldc_w -528508156
      // 5e: ldc_w -710569640
      // 61: ixor
      // 62: invokestatic qeaa361f143ee4a0894bd168fd9b30c66/qf4ccf8f5435d4a78bdca4d6a018b578e/aabaaa.baaaaab (II)I
      // 65: ldc2_w 8055197680891570951
      // 68: invokestatic qeaa361f143ee4a0894bd168fd9b30c66/qf4ccf8f5435d4a78bdca4d6a018b578e/aabaaa.aaa (IJ)J
      // 6b: lload 3
      // 6c: invokestatic qeaa361f143ee4a0894bd168fd9b30c66/qf4ccf8f5435d4a78bdca4d6a018b578e/aabaaa.baaaaaa ()J
      // 6f: ladd
      // 70: invokestatic java/lang/Math.min (JJ)J
      // 73: lstore 3
      // 74: getstatic java/util/concurrent/TimeUnit.NANOSECONDS Ljava/util/concurrent/TimeUnit;
      // 77: invokestatic java/lang/System.nanoTime ()J
      // 7a: aload 1
      // 7b: getfield qeaa361f143ee4a0894bd168fd9b30c66/qf4ccf8f5435d4a78bdca4d6a018b578e/aabaaab.aa J
      // 7e: lsub
      // 7f: invokevirtual java/util/concurrent/TimeUnit.toMillis (J)J
      // 82: lstore 5
      // 84: lload 5
      // 86: iload 2
      // 87: ifne c0
      // 8a: ldc_w -522994281
      // 8d: ldc_w -528508156
      // 90: ldc_w -1122431652
      // 93: ixor
      // 94: invokestatic qeaa361f143ee4a0894bd168fd9b30c66/qf4ccf8f5435d4a78bdca4d6a018b578e/aabaaa.baaaaab (II)I
      // 97: ldc2_w 6412079310953113141
      // 9a: invokestatic qeaa361f143ee4a0894bd168fd9b30c66/qf4ccf8f5435d4a78bdca4d6a018b578e/aabaaa.aaa (IJ)J
      // 9d: lcmp
      // 9e: iflt a9
      // a1: goto a5
      // a4: athrow
      // a5: lload 5
      // a7: lreturn
      // a8: athrow
      // a9: lload 3
      // aa: ldc_w -522994282
      // ad: ldc_w -528508156
      // b0: ldc_w -1094233566
      // b3: ixor
      // b4: invokestatic qeaa361f143ee4a0894bd168fd9b30c66/qf4ccf8f5435d4a78bdca4d6a018b578e/aabaaa.baaaaab (II)I
      // b7: ldc2_w 6412079310953113141
      // ba: invokestatic qeaa361f143ee4a0894bd168fd9b30c66/qf4ccf8f5435d4a78bdca4d6a018b578e/aabaaa.aaa (IJ)J
      // bd: invokestatic java/lang/Math.min (JJ)J
      // c0: lreturn
   }

   private static boolean aabaaab(Object param0, abaaaabba param1) {
      // $VF: Couldn't be decompiled
      // Please report this to the Vineflower issue tracker, at https://github.com/Vineflower/vineflower/issues with a copy of the class file (if you have the rights to distribute it!)
      // java.lang.RuntimeException: parsing failure!
      //   at org.jetbrains.java.decompiler.modules.decompiler.decompose.DomHelper.parseGraph(DomHelper.java:211)
      //   at org.jetbrains.java.decompiler.main.rels.MethodProcessor.codeToJava(MethodProcessor.java:166)
      //
      // Bytecode:
      // 000: ldc_w 682123414
      // 003: istore 5
      // 005: getstatic qeaa361f143ee4a0894bd168fd9b30c66/qf4ccf8f5435d4a78bdca4d6a018b578e/baaabbaa.bba I
      // 008: istore 2
      // 009: aload 1
      // 00a: iload 2
      // 00b: ifne 016
      // 00e: ifnull 02d
      // 011: goto 015
      // 014: athrow
      // 015: aload 0
      // 016: instanceof net/minecraft/class_2596
      // 019: iload 2
      // 01a: ifne 032
      // 01d: ifeq 02d
      // 020: goto 024
      // 023: athrow
      // 024: aload 0
      // 025: checkcast net/minecraft/class_2596
      // 028: astore 3
      // 029: iload 2
      // 02a: ifeq 033
      // 02d: bipush 0
      // 02e: goto 032
      // 031: athrow
      // 032: ireturn
      // 033: aload 3
      // 034: instanceof net/minecraft/class_2856
      // 037: iload 2
      // 038: ifne 043
      // 03b: ifeq 044
      // 03e: goto 042
      // 041: athrow
      // 042: bipush 0
      // 043: ireturn
      // 044: aload 1
      // 045: iload 2
      // 046: ifne 057
      // 049: getstatic qeaa361f143ee4a0894bd168fd9b30c66/qf4ccf8f5435d4a78bdca4d6a018b578e/abaaaabba.aa Lqeaa361f143ee4a0894bd168fd9b30c66/qf4ccf8f5435d4a78bdca4d6a018b578e/abaaaabba;
      // 04c: if_acmpne 056
      // 04f: goto 053
      // 052: athrow
      // 053: bipush 1
      // 054: ireturn
      // 055: athrow
      // 056: aload 1
      // 057: iload 2
      // 058: ifne 0a5
      // 05b: getstatic qeaa361f143ee4a0894bd168fd9b30c66/qf4ccf8f5435d4a78bdca4d6a018b578e/abaaaabba.b Lqeaa361f143ee4a0894bd168fd9b30c66/qf4ccf8f5435d4a78bdca4d6a018b578e/abaaaabba;
      // 05e: if_acmpne 0a4
      // 061: goto 065
      // 064: athrow
      // 065: aload 3
      // 066: instanceof net/minecraft/class_2828
      // 069: iload 2
      // 06a: ifne 09f
      // 06d: goto 071
      // 070: athrow
      // 071: ifne 09e
      // 074: goto 078
      // 077: athrow
      // 078: aload 3
      // 079: instanceof net/minecraft/class_2833
      // 07c: iload 2
      // 07d: ifne 09f
      // 080: goto 084
      // 083: athrow
      // 084: ifne 09e
      // 087: goto 08b
      // 08a: athrow
      // 08b: aload 3
      // 08c: instanceof net/minecraft/class_9836
      // 08f: iload 2
      // 090: ifne 09f
      // 093: goto 097
      // 096: athrow
      // 097: ifeq 0a2
      // 09a: goto 09e
      // 09d: athrow
      // 09e: bipush 1
      // 09f: goto 0a3
      // 0a2: bipush 0
      // 0a3: ireturn
      // 0a4: aload 1
      // 0a5: getstatic qeaa361f143ee4a0894bd168fd9b30c66/qf4ccf8f5435d4a78bdca4d6a018b578e/abaaaabba.ba Lqeaa361f143ee4a0894bd168fd9b30c66/qf4ccf8f5435d4a78bdca4d6a018b578e/abaaaabba;
      // 0a8: if_acmpne 0b1
      // 0ab: aload 3
      // 0ac: invokestatic qeaa361f143ee4a0894bd168fd9b30c66/qf4ccf8f5435d4a78bdca4d6a018b578e/aabaaa.baab (Lnet/minecraft/class_2596;)Z
      // 0af: ireturn
      // 0b0: athrow
      // 0b1: aload 3
      // 0b2: invokeinterface net/minecraft/class_2596.getClass ()Ljava/lang/Class; 1
      // 0b7: invokevirtual java/lang/Class.getName ()Ljava/lang/String;
      // 0ba: astore 4
      // 0bc: aload 4
      // 0be: ldc_w -522994287
      // 0c1: iload 5
      // 0c3: ldc_w -2049757666
      // 0c6: ixor
      // 0c7: invokestatic qeaa361f143ee4a0894bd168fd9b30c66/qf4ccf8f5435d4a78bdca4d6a018b578e/aabaaa.baaaaab (II)I
      // 0ca: ldc_w -522994288
      // 0cd: iload 5
      // 0cf: ldc_w 583729987
      // 0d2: ixor
      // 0d3: invokestatic qeaa361f143ee4a0894bd168fd9b30c66/qf4ccf8f5435d4a78bdca4d6a018b578e/aabaaa.baaaaab (II)I
      // 0d6: invokestatic qeaa361f143ee4a0894bd168fd9b30c66/qf4ccf8f5435d4a78bdca4d6a018b578e/aabaaa.aabbaab (II)Ljava/lang/String;
      // 0d9: invokestatic qeaa361f143ee4a0894bd168fd9b30c66/qf4ccf8f5435d4a78bdca4d6a018b578e/aabbaaaba.abba (Ljava/lang/String;)Ljava/lang/String;
      // 0dc: invokevirtual java/lang/String.contains (Ljava/lang/CharSequence;)Z
      // 0df: iload 2
      // 0e0: ifne 181
      // 0e3: ifne 180
      // 0e6: goto 0ea
      // 0e9: athrow
      // 0ea: aload 4
      // 0ec: ldc_w -522994285
      // 0ef: iload 5
      // 0f1: ldc_w 1838894925
      // 0f4: ixor
      // 0f5: invokestatic qeaa361f143ee4a0894bd168fd9b30c66/qf4ccf8f5435d4a78bdca4d6a018b578e/aabaaa.baaaaab (II)I
      // 0f8: ldc_w -522994286
      // 0fb: iload 5
      // 0fd: ldc_w -556883323
      // 100: ixor
      // 101: invokestatic qeaa361f143ee4a0894bd168fd9b30c66/qf4ccf8f5435d4a78bdca4d6a018b578e/aabaaa.baaaaab (II)I
      // 104: invokestatic qeaa361f143ee4a0894bd168fd9b30c66/qf4ccf8f5435d4a78bdca4d6a018b578e/aabaaa.aabbaab (II)Ljava/lang/String;
      // 107: invokestatic qeaa361f143ee4a0894bd168fd9b30c66/qf4ccf8f5435d4a78bdca4d6a018b578e/aabbaaaba.abba (Ljava/lang/String;)Ljava/lang/String;
      // 10a: invokevirtual java/lang/String.contains (Ljava/lang/CharSequence;)Z
      // 10d: iload 2
      // 10e: ifne 181
      // 111: goto 115
      // 114: athrow
      // 115: ifne 180
      // 118: goto 11c
      // 11b: athrow
      // 11c: aload 4
      // 11e: ldc_w -522994275
      // 121: iload 5
      // 123: ldc_w -57316782
      // 126: ixor
      // 127: invokestatic qeaa361f143ee4a0894bd168fd9b30c66/qf4ccf8f5435d4a78bdca4d6a018b578e/aabaaa.baaaaab (II)I
      // 12a: ldc_w -522994276
      // 12d: iload 5
      // 12f: ldc_w -988092006
      // 132: ixor
      // 133: invokestatic qeaa361f143ee4a0894bd168fd9b30c66/qf4ccf8f5435d4a78bdca4d6a018b578e/aabaaa.baaaaab (II)I
      // 136: invokestatic qeaa361f143ee4a0894bd168fd9b30c66/qf4ccf8f5435d4a78bdca4d6a018b578e/aabaaa.aabbaab (II)Ljava/lang/String;
      // 139: invokestatic qeaa361f143ee4a0894bd168fd9b30c66/qf4ccf8f5435d4a78bdca4d6a018b578e/aabbaaaba.abba (Ljava/lang/String;)Ljava/lang/String;
      // 13c: invokevirtual java/lang/String.contains (Ljava/lang/CharSequence;)Z
      // 13f: iload 2
      // 140: ifne 181
      // 143: goto 147
      // 146: athrow
      // 147: ifne 180
      // 14a: goto 14e
      // 14d: athrow
      // 14e: aload 4
      // 150: ldc_w -522994273
      // 153: iload 5
      // 155: ldc_w -1264807421
      // 158: ixor
      // 159: invokestatic qeaa361f143ee4a0894bd168fd9b30c66/qf4ccf8f5435d4a78bdca4d6a018b578e/aabaaa.baaaaab (II)I
      // 15c: ldc_w -522994274
      // 15f: iload 5
      // 161: ldc_w 290776706
      // 164: ixor
      // 165: invokestatic qeaa361f143ee4a0894bd168fd9b30c66/qf4ccf8f5435d4a78bdca4d6a018b578e/aabaaa.baaaaab (II)I
      // 168: invokestatic qeaa361f143ee4a0894bd168fd9b30c66/qf4ccf8f5435d4a78bdca4d6a018b578e/aabaaa.aabbaab (II)Ljava/lang/String;
      // 16b: invokestatic qeaa361f143ee4a0894bd168fd9b30c66/qf4ccf8f5435d4a78bdca4d6a018b578e/aabbaaaba.abba (Ljava/lang/String;)Ljava/lang/String;
      // 16e: invokevirtual java/lang/String.contains (Ljava/lang/CharSequence;)Z
      // 171: iload 2
      // 172: ifne 181
      // 175: goto 179
      // 178: athrow
      // 179: ifeq 184
      // 17c: goto 180
      // 17f: athrow
      // 180: bipush 1
      // 181: goto 185
      // 184: bipush 0
      // 185: ireturn
   }

   static void aabaaba() {
      babba.clear();
   }

   public static void aabaabb() {
      int var10000 = baaabbaa.bba;
      aaaabbaa var1 = abbabbaa.abb().bba();
      int var0 = var10000;

      try {
         if (var1.ab()) {
            return;
         }
      } catch (CancellationException var4) {
         throw var4;
      }

      for (aabaaa var3 : abba) {
         var3.bbaa(var1);
         if (var0 != 0) {
            break;
         }
      }
   }

   private void aababaa(ChannelHandlerContext param1, Object param2, ChannelPromise param3) {
      // $VF: Couldn't be decompiled
      // Please report this to the Vineflower issue tracker, at https://github.com/Vineflower/vineflower/issues with a copy of the class file (if you have the rights to distribute it!)
      // java.lang.NullPointerException: Cannot invoke "org.jetbrains.java.decompiler.code.cfg.ExceptionRangeCFG.isCircular()" because "range" is null
      //   at org.jetbrains.java.decompiler.modules.decompiler.decompose.DomHelper.graphToStatement(DomHelper.java:84)
      //   at org.jetbrains.java.decompiler.modules.decompiler.decompose.DomHelper.parseGraph(DomHelper.java:203)
      //   at org.jetbrains.java.decompiler.main.rels.MethodProcessor.codeToJava(MethodProcessor.java:166)
      //
      // Bytecode:
      // 00: getstatic qeaa361f143ee4a0894bd168fd9b30c66/qf4ccf8f5435d4a78bdca4d6a018b578e/baaabbaa.bba I
      // 03: istore 4
      // 05: iload 4
      // 07: aload 2
      // 08: invokestatic qeaa361f143ee4a0894bd168fd9b30c66/qf4ccf8f5435d4a78bdca4d6a018b578e/aabaaa.aaaaaaa (Ljava/lang/Object;)Lqeaa361f143ee4a0894bd168fd9b30c66/qf4ccf8f5435d4a78bdca4d6a018b578e/abaaaabba;
      // 0b: astore 5
      // 0d: ifne 25
      // 10: aload 5
      // 12: ifnonnull 26
      // 15: goto 19
      // 18: athrow
      // 19: aload 0
      // 1a: aload 1
      // 1b: aload 2
      // 1c: aload 3
      // 1d: invokevirtual qeaa361f143ee4a0894bd168fd9b30c66/qf4ccf8f5435d4a78bdca4d6a018b578e/aabaaa.abbaabb (Lio/netty/channel/ChannelHandlerContext;Ljava/lang/Object;Lio/netty/channel/ChannelPromise;)Z
      // 20: pop
      // 21: goto 25
      // 24: athrow
      // 25: return
      // 26: aload 0
      // 27: iload 4
      // 29: ifne 4c
      // 2c: aload 0
      // 2d: aload 2
      // 2e: aload 3
      // 2f: aload 5
      // 31: invokevirtual qeaa361f143ee4a0894bd168fd9b30c66/qf4ccf8f5435d4a78bdca4d6a018b578e/aabaaa.abaab (Ljava/lang/Object;Lio/netty/channel/ChannelPromise;Lqeaa361f143ee4a0894bd168fd9b30c66/qf4ccf8f5435d4a78bdca4d6a018b578e/abaaaabba;)Lqeaa361f143ee4a0894bd168fd9b30c66/qf4ccf8f5435d4a78bdca4d6a018b578e/ababbb;
      // 34: invokevirtual qeaa361f143ee4a0894bd168fd9b30c66/qf4ccf8f5435d4a78bdca4d6a018b578e/aabaaa.abaabb (Lqeaa361f143ee4a0894bd168fd9b30c66/qf4ccf8f5435d4a78bdca4d6a018b578e/ababbb;)Z
      // 37: ifne 5f
      // 3a: goto 3e
      // 3d: athrow
      // 3e: aload 0
      // 3f: aload 1
      // 40: aload 0
      // 41: getfield qeaa361f143ee4a0894bd168fd9b30c66/qf4ccf8f5435d4a78bdca4d6a018b578e/aabaaa.bb Ljava/util/concurrent/ConcurrentLinkedQueue;
      // 44: invokevirtual qeaa361f143ee4a0894bd168fd9b30c66/qf4ccf8f5435d4a78bdca4d6a018b578e/aabaaa.aaaaba (Lio/netty/channel/ChannelHandlerContext;Ljava/util/concurrent/ConcurrentLinkedQueue;)V
      // 47: aload 0
      // 48: goto 4c
      // 4b: athrow
      // 4c: aload 1
      // 4d: aload 2
      // 4e: aload 3
      // 4f: invokevirtual qeaa361f143ee4a0894bd168fd9b30c66/qf4ccf8f5435d4a78bdca4d6a018b578e/aabaaa.abbaabb (Lio/netty/channel/ChannelHandlerContext;Ljava/lang/Object;Lio/netty/channel/ChannelPromise;)Z
      // 52: pop
      // 53: iload 4
      // 55: aload 1
      // 56: invokeinterface io/netty/channel/ChannelHandlerContext.flush ()Lio/netty/channel/ChannelHandlerContext; 1
      // 5b: pop
      // 5c: ifeq 71
      // 5f: getstatic qeaa361f143ee4a0894bd168fd9b30c66/qf4ccf8f5435d4a78bdca4d6a018b578e/aabaaa.abaaa Lqeaa361f143ee4a0894bd168fd9b30c66/qf4ccf8f5435d4a78bdca4d6a018b578e/aaabbabbb;
      // 62: ifnull 71
      // 65: goto 69
      // 68: athrow
      // 69: aload 0
      // 6a: invokevirtual qeaa361f143ee4a0894bd168fd9b30c66/qf4ccf8f5435d4a78bdca4d6a018b578e/aabaaa.bbbbba ()V
      // 6d: goto 71
      // 70: athrow
      // 71: return
   }

   public static void aababab() {
      int var10000 = baaabbaa.bba;
      Iterator var1 = abba.iterator();
      int var0 = var10000;

      while (var1.hasNext()) {
         aabaaa var2 = (aabaaa)var1.next();
         var2.abbaab();
         if (var0 != 0) {
            break;
         }
      }
   }

   private static boolean aababba() {
      // $VF: Couldn't be decompiled
      // Please report this to the Vineflower issue tracker, at https://github.com/Vineflower/vineflower/issues with a copy of the class file (if you have the rights to distribute it!)
      // java.lang.RuntimeException: parsing failure!
      //   at org.jetbrains.java.decompiler.modules.decompiler.decompose.DomHelper.parseGraph(DomHelper.java:211)
      //   at org.jetbrains.java.decompiler.main.rels.MethodProcessor.codeToJava(MethodProcessor.java:166)
      //
      // Bytecode:
      // 00: getstatic qeaa361f143ee4a0894bd168fd9b30c66/qf4ccf8f5435d4a78bdca4d6a018b578e/baaabbaa.bba I
      // 03: invokestatic net/minecraft/class_310.method_1551 ()Lnet/minecraft/class_310;
      // 06: astore 1
      // 07: istore 0
      // 08: aload 1
      // 09: iload 0
      // 0a: ifne 1a
      // 0d: ifnonnull 19
      // 10: goto 14
      // 13: athrow
      // 14: aconst_null
      // 15: goto 1d
      // 18: athrow
      // 19: aload 1
      // 1a: getfield net/minecraft/class_310.field_1724 Lnet/minecraft/class_746;
      // 1d: astore 2
      // 1e: aload 2
      // 1f: iload 0
      // 20: ifne 2b
      // 23: ifnull 3d
      // 26: goto 2a
      // 29: athrow
      // 2a: aload 2
      // 2b: invokevirtual net/minecraft/class_746.method_5765 ()Z
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

   public void aababbb(ChannelHandlerContext param1, Object param2) throws Exception {
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
      // 004: invokestatic qeaa361f143ee4a0894bd168fd9b30c66/qf4ccf8f5435d4a78bdca4d6a018b578e/abbabaa.aa ()Z
      // 007: iload 3
      // 008: ifne 01c
      // 00b: ifeq 019
      // 00e: goto 012
      // 011: athrow
      // 012: aload 1
      // 013: aload 2
      // 014: invokestatic qeaa361f143ee4a0894bd168fd9b30c66/qf4ccf8f5435d4a78bdca4d6a018b578e/aabaaa.aabaaa (Lio/netty/channel/ChannelHandlerContext;Ljava/lang/Object;)V
      // 017: return
      // 018: athrow
      // 019: invokestatic qeaa361f143ee4a0894bd168fd9b30c66/qf4ccf8f5435d4a78bdca4d6a018b578e/abbaabaaa.aab ()Z
      // 01c: iload 3
      // 01d: ifne 0db
      // 020: ifeq 0cf
      // 023: goto 027
      // 026: athrow
      // 027: aload 2
      // 028: iload 3
      // 029: ifne 0d0
      // 02c: goto 030
      // 02f: athrow
      // 030: instanceof net/minecraft/class_2596
      // 033: ifeq 0cf
      // 036: goto 03a
      // 039: athrow
      // 03a: aload 2
      // 03b: checkcast net/minecraft/class_2596
      // 03e: astore 4
      // 040: aload 2
      // 041: iload 3
      // 042: ifne 06a
      // 045: instanceof net/minecraft/class_2661
      // 048: ifeq 065
      // 04b: goto 04f
      // 04e: athrow
      // 04f: aload 2
      // 050: checkcast net/minecraft/class_2661
      // 053: astore 5
      // 055: iload 3
      // 056: aload 2
      // 057: invokestatic qeaa361f143ee4a0894bd168fd9b30c66/qf4ccf8f5435d4a78bdca4d6a018b578e/abbaabaaa.ba (Ljava/lang/Object;)V
      // 05a: aload 5
      // 05c: invokevirtual net/minecraft/class_2661.comp_2325 ()Lnet/minecraft/class_2561;
      // 05f: invokestatic qeaa361f143ee4a0894bd168fd9b30c66/qf4ccf8f5435d4a78bdca4d6a018b578e/abbaabaaa.bbb (Lnet/minecraft/class_2561;)V
      // 062: ifeq 0cf
      // 065: aload 2
      // 066: goto 06a
      // 069: athrow
      // 06a: iload 3
      // 06b: ifne 0cc
      // 06e: instanceof net/minecraft/class_2678
      // 071: ifne 0c7
      // 074: goto 078
      // 077: athrow
      // 078: aload 2
      // 079: iload 3
      // 07a: ifne 0cc
      // 07d: goto 081
      // 080: athrow
      // 081: instanceof net/minecraft/class_2724
      // 084: ifne 0c7
      // 087: goto 08b
      // 08a: athrow
      // 08b: aload 2
      // 08c: iload 3
      // 08d: ifne 0cc
      // 090: goto 094
      // 093: athrow
      // 094: instanceof net/minecraft/class_2708
      // 097: ifne 0c7
      // 09a: goto 09e
      // 09d: athrow
      // 09e: aload 4
      // 0a0: iload 3
      // 0a1: ifne 0cc
      // 0a4: goto 0a8
      // 0a7: athrow
      // 0a8: invokeinterface net/minecraft/class_2596.method_55943 ()Z 1
      // 0ad: ifne 0c7
      // 0b0: goto 0b4
      // 0b3: athrow
      // 0b4: aload 2
      // 0b5: iload 3
      // 0b6: ifne 0d0
      // 0b9: goto 0bd
      // 0bc: athrow
      // 0bd: invokestatic qeaa361f143ee4a0894bd168fd9b30c66/qf4ccf8f5435d4a78bdca4d6a018b578e/abbaabaaa.a (Ljava/lang/Object;)Z
      // 0c0: ifeq 0cf
      // 0c3: goto 0c7
      // 0c6: athrow
      // 0c7: aload 2
      // 0c8: goto 0cc
      // 0cb: athrow
      // 0cc: invokestatic qeaa361f143ee4a0894bd168fd9b30c66/qf4ccf8f5435d4a78bdca4d6a018b578e/abbaabaaa.ba (Ljava/lang/Object;)V
      // 0cf: aload 2
      // 0d0: iload 3
      // 0d1: ifne 111
      // 0d4: invokestatic qeaa361f143ee4a0894bd168fd9b30c66/qf4ccf8f5435d4a78bdca4d6a018b578e/aabaaa.aabbaaa (Ljava/lang/Object;)Z
      // 0d7: goto 0db
      // 0da: athrow
      // 0db: ifeq 110
      // 0de: aload 0
      // 0df: new java/util/concurrent/CancellationException
      // 0e2: dup
      // 0e3: ldc_w -522994279
      // 0e6: ldc_w 829442378
      // 0e9: ldc_w 25511871
      // 0ec: ixor
      // 0ed: invokestatic qeaa361f143ee4a0894bd168fd9b30c66/qf4ccf8f5435d4a78bdca4d6a018b578e/aabaaa.baaaaab (II)I
      // 0f0: ldc_w -522994280
      // 0f3: ldc_w 829442378
      // 0f6: ldc_w 1523587744
      // 0f9: ixor
      // 0fa: invokestatic qeaa361f143ee4a0894bd168fd9b30c66/qf4ccf8f5435d4a78bdca4d6a018b578e/aabaaa.baaaaab (II)I
      // 0fd: invokestatic qeaa361f143ee4a0894bd168fd9b30c66/qf4ccf8f5435d4a78bdca4d6a018b578e/aabaaa.aabbaab (II)Ljava/lang/String;
      // 100: invokestatic qeaa361f143ee4a0894bd168fd9b30c66/qf4ccf8f5435d4a78bdca4d6a018b578e/aabbaaaba.abba (Ljava/lang/String;)Ljava/lang/String;
      // 103: invokespecial java/util/concurrent/CancellationException.<init> (Ljava/lang/String;)V
      // 106: invokevirtual qeaa361f143ee4a0894bd168fd9b30c66/qf4ccf8f5435d4a78bdca4d6a018b578e/aabaaa.aaaba (Ljava/lang/Throwable;)V
      // 109: aload 1
      // 10a: aload 2
      // 10b: invokestatic qeaa361f143ee4a0894bd168fd9b30c66/qf4ccf8f5435d4a78bdca4d6a018b578e/aabaaa.aabaaa (Lio/netty/channel/ChannelHandlerContext;Ljava/lang/Object;)V
      // 10e: return
      // 10f: athrow
      // 110: aload 2
      // 111: iload 3
      // 112: ifne 124
      // 115: instanceof net/minecraft/class_2735
      // 118: ifne 132
      // 11b: goto 11f
      // 11e: athrow
      // 11f: aload 2
      // 120: goto 124
      // 123: athrow
      // 124: iload 3
      // 125: ifne 13c
      // 128: instanceof net/minecraft/class_2678
      // 12b: ifeq 13b
      // 12e: goto 132
      // 131: athrow
      // 132: aload 0
      // 133: bipush -1
      // 134: putfield qeaa361f143ee4a0894bd168fd9b30c66/qf4ccf8f5435d4a78bdca4d6a018b578e/aabaaa.aaaaa I
      // 137: goto 13b
      // 13a: athrow
      // 13b: aload 2
      // 13c: iload 3
      // 13d: ifne 153
      // 140: instanceof net/minecraft/class_2678
      // 143: ifeq 152
      // 146: goto 14a
      // 149: athrow
      // 14a: aload 0
      // 14b: invokevirtual qeaa361f143ee4a0894bd168fd9b30c66/qf4ccf8f5435d4a78bdca4d6a018b578e/aabaaa.aaabaab ()V
      // 14e: goto 152
      // 151: athrow
      // 152: aload 2
      // 153: iload 3
      // 154: ifne 169
      // 157: invokestatic qeaa361f143ee4a0894bd168fd9b30c66/qf4ccf8f5435d4a78bdca4d6a018b578e/aabaaa.bbbbb (Ljava/lang/Object;)Z
      // 15a: ifeq 168
      // 15d: goto 161
      // 160: athrow
      // 161: aload 1
      // 162: aload 2
      // 163: invokestatic qeaa361f143ee4a0894bd168fd9b30c66/qf4ccf8f5435d4a78bdca4d6a018b578e/aabaaa.aabaaa (Lio/netty/channel/ChannelHandlerContext;Ljava/lang/Object;)V
      // 166: return
      // 167: athrow
      // 168: aload 2
      // 169: iload 3
      // 16a: ifne 190
      // 16d: instanceof net/minecraft/class_2596
      // 170: ifeq 18f
      // 173: goto 177
      // 176: athrow
      // 177: aload 2
      // 178: checkcast net/minecraft/class_2596
      // 17b: iload 3
      // 17c: ifne 190
      // 17f: goto 183
      // 182: athrow
      // 183: astore 4
      // 185: aload 4
      // 187: invokestatic qeaa361f143ee4a0894bd168fd9b30c66/qf4ccf8f5435d4a78bdca4d6a018b578e/aabaaa.aaab (Lnet/minecraft/class_2596;)Z
      // 18a: ifeq 18f
      // 18d: return
      // 18e: athrow
      // 18f: aload 2
      // 190: iload 3
      // 191: ifne 328
      // 194: instanceof net/minecraft/class_8038
      // 197: ifeq 327
      // 19a: goto 19e
      // 19d: athrow
      // 19e: aload 2
      // 19f: checkcast net/minecraft/class_8038
      // 1a2: astore 4
      // 1a4: aconst_null
      // 1a5: astore 5
      // 1a7: aload 4
      // 1a9: invokevirtual net/minecraft/class_8038.method_48324 ()Ljava/lang/Iterable;
      // 1ac: invokeinterface java/lang/Iterable.iterator ()Ljava/util/Iterator; 1
      // 1b1: astore 6
      // 1b3: aload 6
      // 1b5: invokeinterface java/util/Iterator.hasNext ()Z 1
      // 1ba: ifeq 300
      // 1bd: aload 6
      // 1bf: invokeinterface java/util/Iterator.next ()Ljava/lang/Object; 1
      // 1c4: checkcast net/minecraft/class_2596
      // 1c7: astore 7
      // 1c9: iload 3
      // 1ca: ifne 327
      // 1cd: aload 7
      // 1cf: iload 3
      // 1d0: ifne 250
      // 1d3: goto 1d7
      // 1d6: athrow
      // 1d7: invokestatic qeaa361f143ee4a0894bd168fd9b30c66/qf4ccf8f5435d4a78bdca4d6a018b578e/aabaaa.aaab (Lnet/minecraft/class_2596;)Z
      // 1da: ifeq 24e
      // 1dd: goto 1e1
      // 1e0: athrow
      // 1e1: aload 5
      // 1e3: iload 3
      // 1e4: ifne 200
      // 1e7: goto 1eb
      // 1ea: athrow
      // 1eb: ifnonnull 1b3
      // 1ee: goto 1f2
      // 1f1: athrow
      // 1f2: new java/util/ArrayList
      // 1f5: dup
      // 1f6: invokespecial java/util/ArrayList.<init> ()V
      // 1f9: astore 5
      // 1fb: aload 4
      // 1fd: invokevirtual net/minecraft/class_8038.method_48324 ()Ljava/lang/Iterable;
      // 200: invokeinterface java/lang/Iterable.iterator ()Ljava/util/Iterator; 1
      // 205: astore 8
      // 207: aload 8
      // 209: invokeinterface java/util/Iterator.hasNext ()Z 1
      // 20e: ifeq 24a
      // 211: aload 8
      // 213: invokeinterface java/util/Iterator.next ()Ljava/lang/Object; 1
      // 218: checkcast net/minecraft/class_2596
      // 21b: astore 9
      // 21d: iload 3
      // 21e: ifne 246
      // 221: iload 3
      // 222: ifne 1b3
      // 225: goto 229
      // 228: athrow
      // 229: aload 9
      // 22b: aload 7
      // 22d: if_acmpne 238
      // 230: iload 3
      // 231: ifeq 24a
      // 234: goto 238
      // 237: athrow
      // 238: aload 5
      // 23a: aload 9
      // 23c: invokeinterface java/util/List.add (Ljava/lang/Object;)Z 2
      // 241: pop
      // 242: goto 246
      // 245: athrow
      // 246: iload 3
      // 247: ifeq 207
      // 24a: iload 3
      // 24b: ifeq 1b3
      // 24e: aload 7
      // 250: iload 3
      // 251: ifne 264
      // 254: invokestatic qeaa361f143ee4a0894bd168fd9b30c66/qf4ccf8f5435d4a78bdca4d6a018b578e/abbabbaa.aab (Lnet/minecraft/class_2596;)Z
      // 257: ifeq 2e1
      // 25a: goto 25e
      // 25d: athrow
      // 25e: aload 7
      // 260: goto 264
      // 263: athrow
      // 264: invokestatic qeaa361f143ee4a0894bd168fd9b30c66/qf4ccf8f5435d4a78bdca4d6a018b578e/aabaaa.aaabbba (Lnet/minecraft/class_2596;)Z
      // 267: ifne 2e1
      // 26a: aload 5
      // 26c: iload 3
      // 26d: ifne 289
      // 270: goto 274
      // 273: athrow
      // 274: ifnonnull 2d7
      // 277: goto 27b
      // 27a: athrow
      // 27b: new java/util/ArrayList
      // 27e: dup
      // 27f: invokespecial java/util/ArrayList.<init> ()V
      // 282: astore 5
      // 284: aload 4
      // 286: invokevirtual net/minecraft/class_8038.method_48324 ()Ljava/lang/Iterable;
      // 289: invokeinterface java/lang/Iterable.iterator ()Ljava/util/Iterator; 1
      // 28e: astore 8
      // 290: aload 8
      // 292: invokeinterface java/util/Iterator.hasNext ()Z 1
      // 297: ifeq 2d7
      // 29a: aload 8
      // 29c: invokeinterface java/util/Iterator.next ()Ljava/lang/Object; 1
      // 2a1: checkcast net/minecraft/class_2596
      // 2a4: astore 9
      // 2a6: iload 3
      // 2a7: ifne 2d3
      // 2aa: iload 3
      // 2ab: ifne 2dd
      // 2ae: goto 2b2
      // 2b1: athrow
      // 2b2: aload 9
      // 2b4: aload 7
      // 2b6: if_acmpne 2c5
      // 2b9: goto 2bd
      // 2bc: athrow
      // 2bd: iload 3
      // 2be: ifeq 2d7
      // 2c1: goto 2c5
      // 2c4: athrow
      // 2c5: aload 5
      // 2c7: aload 9
      // 2c9: invokeinterface java/util/List.add (Ljava/lang/Object;)Z 2
      // 2ce: pop
      // 2cf: goto 2d3
      // 2d2: athrow
      // 2d3: iload 3
      // 2d4: ifeq 290
      // 2d7: aload 1
      // 2d8: aload 7
      // 2da: invokestatic qeaa361f143ee4a0894bd168fd9b30c66/qf4ccf8f5435d4a78bdca4d6a018b578e/aabaaa.aabaaa (Lio/netty/channel/ChannelHandlerContext;Ljava/lang/Object;)V
      // 2dd: iload 3
      // 2de: ifeq 2fc
      // 2e1: aload 5
      // 2e3: iload 3
      // 2e4: ifne 2f4
      // 2e7: goto 2eb
      // 2ea: athrow
      // 2eb: ifnull 2fc
      // 2ee: goto 2f2
      // 2f1: athrow
      // 2f2: aload 5
      // 2f4: aload 7
      // 2f6: invokeinterface java/util/List.add (Ljava/lang/Object;)Z 2
      // 2fb: pop
      // 2fc: iload 3
      // 2fd: ifeq 1b3
      // 300: aload 5
      // 302: iload 3
      // 303: ifne 328
      // 306: ifnull 327
      // 309: goto 30d
      // 30c: athrow
      // 30d: aload 5
      // 30f: invokeinterface java/util/List.isEmpty ()Z 1
      // 314: ifeq 31d
      // 317: goto 31b
      // 31a: athrow
      // 31b: return
      // 31c: athrow
      // 31d: new net/minecraft/class_8042
      // 320: dup
      // 321: aload 5
      // 323: invokespecial net/minecraft/class_8042.<init> (Ljava/lang/Iterable;)V
      // 326: astore 2
      // 327: aload 2
      // 328: iload 3
      // 329: ifne 356
      // 32c: instanceof net/minecraft/class_2596
      // 32f: ifeq 355
      // 332: goto 336
      // 335: athrow
      // 336: aload 2
      // 337: checkcast net/minecraft/class_2596
      // 33a: iload 3
      // 33b: ifne 356
      // 33e: goto 342
      // 341: athrow
      // 342: astore 4
      // 344: aload 4
      // 346: invokestatic qeaa361f143ee4a0894bd168fd9b30c66/qf4ccf8f5435d4a78bdca4d6a018b578e/aabaaa.abaaaa (Lnet/minecraft/class_2596;)Z
      // 349: ifeq 355
      // 34c: aload 0
      // 34d: aload 1
      // 34e: invokevirtual qeaa361f143ee4a0894bd168fd9b30c66/qf4ccf8f5435d4a78bdca4d6a018b578e/aabaaa.bbaab (Lio/netty/channel/ChannelHandlerContext;)V
      // 351: goto 355
      // 354: athrow
      // 355: aload 2
      // 356: instanceof net/minecraft/class_2596
      // 359: iload 3
      // 35a: ifne 398
      // 35d: ifeq 395
      // 360: goto 364
      // 363: athrow
      // 364: aload 2
      // 365: checkcast net/minecraft/class_2596
      // 368: astore 4
      // 36a: aload 4
      // 36c: invokestatic qeaa361f143ee4a0894bd168fd9b30c66/qf4ccf8f5435d4a78bdca4d6a018b578e/abbabbaa.aa (Lnet/minecraft/class_2596;)Z
      // 36f: iload 3
      // 370: ifne 398
      // 373: ifeq 395
      // 376: goto 37a
      // 379: athrow
      // 37a: aload 4
      // 37c: invokestatic qeaa361f143ee4a0894bd168fd9b30c66/qf4ccf8f5435d4a78bdca4d6a018b578e/aabaaa.bbabba (Lnet/minecraft/class_2596;)Z
      // 37f: iload 3
      // 380: ifne 398
      // 383: goto 387
      // 386: athrow
      // 387: ifne 395
      // 38a: goto 38e
      // 38d: athrow
      // 38e: aload 1
      // 38f: aload 2
      // 390: invokestatic qeaa361f143ee4a0894bd168fd9b30c66/qf4ccf8f5435d4a78bdca4d6a018b578e/aabaaa.aabaaa (Lio/netty/channel/ChannelHandlerContext;Ljava/lang/Object;)V
      // 393: return
      // 394: athrow
      // 395: getstatic qeaa361f143ee4a0894bd168fd9b30c66/qf4ccf8f5435d4a78bdca4d6a018b578e/aabaaa.baaba Z
      // 398: iload 3
      // 399: ifne 3d8
      // 39c: ifeq 3ce
      // 39f: goto 3a3
      // 3a2: athrow
      // 3a3: aload 0
      // 3a4: iload 3
      // 3a5: ifne 3c7
      // 3a8: goto 3ac
      // 3ab: athrow
      // 3ac: new qeaa361f143ee4a0894bd168fd9b30c66/qf4ccf8f5435d4a78bdca4d6a018b578e/abbbbaaaa
      // 3af: dup
      // 3b0: aload 2
      // 3b1: invokestatic java/lang/System.currentTimeMillis ()J
      // 3b4: invokespecial qeaa361f143ee4a0894bd168fd9b30c66/qf4ccf8f5435d4a78bdca4d6a018b578e/abbbbaaaa.<init> (Ljava/lang/Object;J)V
      // 3b7: invokevirtual qeaa361f143ee4a0894bd168fd9b30c66/qf4ccf8f5435d4a78bdca4d6a018b578e/aabaaa.aabbba (Lqeaa361f143ee4a0894bd168fd9b30c66/qf4ccf8f5435d4a78bdca4d6a018b578e/abbbbaaaa;)Z
      // 3ba: ifne 3cd
      // 3bd: goto 3c1
      // 3c0: athrow
      // 3c1: aload 0
      // 3c2: aload 1
      // 3c3: invokevirtual qeaa361f143ee4a0894bd168fd9b30c66/qf4ccf8f5435d4a78bdca4d6a018b578e/aabaaa.bbaab (Lio/netty/channel/ChannelHandlerContext;)V
      // 3c6: aload 0
      // 3c7: pop
      // 3c8: aload 1
      // 3c9: aload 2
      // 3ca: invokestatic qeaa361f143ee4a0894bd168fd9b30c66/qf4ccf8f5435d4a78bdca4d6a018b578e/aabaaa.aabaaa (Lio/netty/channel/ChannelHandlerContext;Ljava/lang/Object;)V
      // 3cd: return
      // 3ce: aload 0
      // 3cf: aload 1
      // 3d0: invokevirtual qeaa361f143ee4a0894bd168fd9b30c66/qf4ccf8f5435d4a78bdca4d6a018b578e/aabaaa.baabb (Lio/netty/channel/ChannelHandlerContext;)V
      // 3d3: aload 0
      // 3d4: aload 2
      // 3d5: invokevirtual qeaa361f143ee4a0894bd168fd9b30c66/qf4ccf8f5435d4a78bdca4d6a018b578e/aabaaa.abaabba (Ljava/lang/Object;)Z
      // 3d8: iload 3
      // 3d9: ifne 411
      // 3dc: ifeq 40e
      // 3df: goto 3e3
      // 3e2: athrow
      // 3e3: aload 0
      // 3e4: iload 3
      // 3e5: ifne 407
      // 3e8: goto 3ec
      // 3eb: athrow
      // 3ec: new qeaa361f143ee4a0894bd168fd9b30c66/qf4ccf8f5435d4a78bdca4d6a018b578e/abbbbaaaa
      // 3ef: dup
      // 3f0: aload 2
      // 3f1: invokestatic java/lang/System.currentTimeMillis ()J
      // 3f4: invokespecial qeaa361f143ee4a0894bd168fd9b30c66/qf4ccf8f5435d4a78bdca4d6a018b578e/abbbbaaaa.<init> (Ljava/lang/Object;J)V
      // 3f7: invokevirtual qeaa361f143ee4a0894bd168fd9b30c66/qf4ccf8f5435d4a78bdca4d6a018b578e/aabaaa.aabbba (Lqeaa361f143ee4a0894bd168fd9b30c66/qf4ccf8f5435d4a78bdca4d6a018b578e/abbbbaaaa;)Z
      // 3fa: ifne 40d
      // 3fd: goto 401
      // 400: athrow
      // 401: aload 0
      // 402: aload 1
      // 403: invokevirtual qeaa361f143ee4a0894bd168fd9b30c66/qf4ccf8f5435d4a78bdca4d6a018b578e/aabaaa.bbaab (Lio/netty/channel/ChannelHandlerContext;)V
      // 406: aload 0
      // 407: pop
      // 408: aload 1
      // 409: aload 2
      // 40a: invokestatic qeaa361f143ee4a0894bd168fd9b30c66/qf4ccf8f5435d4a78bdca4d6a018b578e/aabaaa.aabaaa (Lio/netty/channel/ChannelHandlerContext;Ljava/lang/Object;)V
      // 40d: return
      // 40e: getstatic qeaa361f143ee4a0894bd168fd9b30c66/qf4ccf8f5435d4a78bdca4d6a018b578e/aabaaa.bbabb Z
      // 411: iload 3
      // 412: ifne 437
      // 415: ifeq 44b
      // 418: goto 41c
      // 41b: athrow
      // 41c: aload 0
      // 41d: iload 3
      // 41e: ifne 444
      // 421: goto 425
      // 424: athrow
      // 425: new qeaa361f143ee4a0894bd168fd9b30c66/qf4ccf8f5435d4a78bdca4d6a018b578e/abbbbaaaa
      // 428: dup
      // 429: aload 2
      // 42a: invokestatic java/lang/System.currentTimeMillis ()J
      // 42d: invokespecial qeaa361f143ee4a0894bd168fd9b30c66/qf4ccf8f5435d4a78bdca4d6a018b578e/abbbbaaaa.<init> (Ljava/lang/Object;J)V
      // 430: invokevirtual qeaa361f143ee4a0894bd168fd9b30c66/qf4ccf8f5435d4a78bdca4d6a018b578e/aabaaa.aabbba (Lqeaa361f143ee4a0894bd168fd9b30c66/qf4ccf8f5435d4a78bdca4d6a018b578e/abbbbaaaa;)Z
      // 433: goto 437
      // 436: athrow
      // 437: ifne 44a
      // 43a: aload 0
      // 43b: aload 1
      // 43c: invokevirtual qeaa361f143ee4a0894bd168fd9b30c66/qf4ccf8f5435d4a78bdca4d6a018b578e/aabaaa.bbaab (Lio/netty/channel/ChannelHandlerContext;)V
      // 43f: aload 0
      // 440: goto 444
      // 443: athrow
      // 444: pop
      // 445: aload 1
      // 446: aload 2
      // 447: invokestatic qeaa361f143ee4a0894bd168fd9b30c66/qf4ccf8f5435d4a78bdca4d6a018b578e/aabaaa.aabaaa (Lio/netty/channel/ChannelHandlerContext;Ljava/lang/Object;)V
      // 44a: return
      // 44b: aload 0
      // 44c: aload 2
      // 44d: invokevirtual qeaa361f143ee4a0894bd168fd9b30c66/qf4ccf8f5435d4a78bdca4d6a018b578e/aabaaa.abababb (Ljava/lang/Object;)J
      // 450: lstore 4
      // 452: iload 3
      // 453: ifne 4db
      // 456: lload 4
      // 458: lconst_0
      // 459: lcmp
      // 45a: ifle 4d4
      // 45d: goto 461
      // 460: athrow
      // 461: aload 2
      // 462: instanceof net/minecraft/class_2923
      // 465: iload 3
      // 466: ifne 49e
      // 469: goto 46d
      // 46c: athrow
      // 46d: ifeq 487
      // 470: goto 474
      // 473: athrow
      // 474: aload 2
      // 475: checkcast net/minecraft/class_2923
      // 478: astore 6
      // 47a: invokestatic qeaa361f143ee4a0894bd168fd9b30c66/qf4ccf8f5435d4a78bdca4d6a018b578e/abbabbaa.abb ()Lqeaa361f143ee4a0894bd168fd9b30c66/qf4ccf8f5435d4a78bdca4d6a018b578e/abbabbaa;
      // 47d: aload 6
      // 47f: invokevirtual net/minecraft/class_2923.comp_2201 ()J
      // 482: lload 4
      // 484: invokevirtual qeaa361f143ee4a0894bd168fd9b30c66/qf4ccf8f5435d4a78bdca4d6a018b578e/abbabbaa.aba (JJ)V
      // 487: aload 0
      // 488: iload 3
      // 489: ifne 4cf
      // 48c: new qeaa361f143ee4a0894bd168fd9b30c66/qf4ccf8f5435d4a78bdca4d6a018b578e/abbbbbab
      // 48f: dup
      // 490: aload 2
      // 491: invokestatic java/lang/System.nanoTime ()J
      // 494: invokespecial qeaa361f143ee4a0894bd168fd9b30c66/qf4ccf8f5435d4a78bdca4d6a018b578e/abbbbbab.<init> (Ljava/lang/Object;J)V
      // 497: invokevirtual qeaa361f143ee4a0894bd168fd9b30c66/qf4ccf8f5435d4a78bdca4d6a018b578e/aabaaa.abbaaab (Lqeaa361f143ee4a0894bd168fd9b30c66/qf4ccf8f5435d4a78bdca4d6a018b578e/abbbbbab;)Z
      // 49a: goto 49e
      // 49d: athrow
      // 49e: ifne 4ce
      // 4a1: aload 0
      // 4a2: getfield qeaa361f143ee4a0894bd168fd9b30c66/qf4ccf8f5435d4a78bdca4d6a018b578e/aabaaa.aaa Ljava/util/concurrent/ConcurrentLinkedQueue;
      // 4a5: invokevirtual java/util/concurrent/ConcurrentLinkedQueue.poll ()Ljava/lang/Object;
      // 4a8: checkcast qeaa361f143ee4a0894bd168fd9b30c66/qf4ccf8f5435d4a78bdca4d6a018b578e/abbbbbab
      // 4ab: dup
      // 4ac: astore 6
      // 4ae: ifnull 4c6
      // 4b1: aload 1
      // 4b2: aload 6
      // 4b4: iload 3
      // 4b5: ifne 4ca
      // 4b8: invokevirtual qeaa361f143ee4a0894bd168fd9b30c66/qf4ccf8f5435d4a78bdca4d6a018b578e/abbbbbab.aa ()Ljava/lang/Object;
      // 4bb: invokestatic qeaa361f143ee4a0894bd168fd9b30c66/qf4ccf8f5435d4a78bdca4d6a018b578e/aabaaa.aabaaa (Lio/netty/channel/ChannelHandlerContext;Ljava/lang/Object;)V
      // 4be: iload 3
      // 4bf: ifeq 4a1
      // 4c2: goto 4c6
      // 4c5: athrow
      // 4c6: aload 0
      // 4c7: pop
      // 4c8: aload 1
      // 4c9: aload 2
      // 4ca: invokestatic qeaa361f143ee4a0894bd168fd9b30c66/qf4ccf8f5435d4a78bdca4d6a018b578e/aabaaa.aabaaa (Lio/netty/channel/ChannelHandlerContext;Ljava/lang/Object;)V
      // 4cd: return
      // 4ce: aload 0
      // 4cf: aload 1
      // 4d0: invokevirtual qeaa361f143ee4a0894bd168fd9b30c66/qf4ccf8f5435d4a78bdca4d6a018b578e/aabaaa.babbba (Lio/netty/channel/ChannelHandlerContext;)V
      // 4d3: return
      // 4d4: aload 0
      // 4d5: pop
      // 4d6: aload 1
      // 4d7: aload 2
      // 4d8: invokestatic qeaa361f143ee4a0894bd168fd9b30c66/qf4ccf8f5435d4a78bdca4d6a018b578e/aabaaa.aabaaa (Lio/netty/channel/ChannelHandlerContext;Ljava/lang/Object;)V
      // 4db: return
   }

   private static boolean aabbaaa(Object param0) {
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
      // 05: instanceof net/minecraft/class_2724
      // 08: iload 1
      // 09: ifne 41
      // 0c: ifne 40
      // 0f: goto 13
      // 12: athrow
      // 13: aload 0
      // 14: iload 1
      // 15: ifne 2b
      // 18: goto 1c
      // 1b: athrow
      // 1c: instanceof net/minecraft/class_2749
      // 1f: ifeq 44
      // 22: goto 26
      // 25: athrow
      // 26: aload 0
      // 27: goto 2b
      // 2a: athrow
      // 2b: checkcast net/minecraft/class_2749
      // 2e: astore 2
      // 2f: aload 2
      // 30: invokevirtual net/minecraft/class_2749.method_11833 ()F
      // 33: fconst_0
      // 34: fcmpg
      // 35: iload 1
      // 36: ifne 41
      // 39: ifgt 44
      // 3c: goto 40
      // 3f: athrow
      // 40: bipush 1
      // 41: goto 45
      // 44: bipush 0
      // 45: ireturn
   }

   private static String aabbaab(int var0, int var1) {
      int var9 = 511098482;
      int var2 = (var0 ^ baaaaab(-522994277, var9 ^ 1140148909)) & baaaaab(-522994278, var9 ^ 202150608);
      if (aabaaa[var2] == null) {
         char[] var3 = bbbab[var2].toCharArray();

         int var4 = switch (var3[0] & baaaaab(-522994331, var9 ^ 1325134776)) {
            case 0 -> baaaaab(-522994332, var9 ^ -592126914);
            case 1 -> baaaaab(-522994329, var9 ^ -1312243095);
            case 2 -> baaaaab(-522994330, var9 ^ -981579017);
            case 3 -> baaaaab(-522994335, var9 ^ -1693542140);
            case 4 -> baaaaab(-522994336, var9 ^ 1605878310);
            case 5 -> baaaaab(-522994333, var9 ^ 1592579543);
            case 6 -> baaaaab(-522994334, var9 ^ 133930346);
            case 7 -> baaaaab(-522994323, var9 ^ 409089385);
            case 8 -> baaaaab(-522994324, var9 ^ -740400728);
            case 9 -> baaaaab(-522994321, var9 ^ 1544346760);
            case 10 -> baaaaab(-522994322, var9 ^ -1476026759);
            case 11 -> baaaaab(-522994327, var9 ^ -415796642);
            case 12 -> baaaaab(-522994328, var9 ^ 1927341666);
            case 13 -> baaaaab(-522994325, var9 ^ 781442954);
            case 14 -> baaaaab(-522994326, var9 ^ 924043738);
            case 15 -> baaaaab(-522994315, var9 ^ 313910839);
            case 16 -> baaaaab(-522994316, var9 ^ -1757763605);
            case 17 -> baaaaab(-522994313, var9 ^ 1557172412);
            case 18 -> baaaaab(-522994314, var9 ^ -313603429);
            case 19 -> baaaaab(-522994319, var9 ^ -385909104);
            case 20 -> baaaaab(-522994320, var9 ^ -1566396320);
            case 21 -> baaaaab(-522994317, var9 ^ -1980624725);
            case 22 -> baaaaab(-522994318, var9 ^ 1436347545);
            case 23 -> baaaaab(-522994307, var9 ^ 650833900);
            case 24 -> baaaaab(-522994308, var9 ^ 467639059);
            case 25 -> baaaaab(-522994305, var9 ^ 587713299);
            case 26 -> baaaaab(-522994306, var9 ^ 126170570);
            case 27 -> baaaaab(-522994311, var9 ^ -1918443802);
            case 28 -> baaaaab(-522994312, var9 ^ 1392528706);
            case 29 -> baaaaab(-522994309, var9 ^ -2079025342);
            case 30 -> baaaaab(-522994310, var9 ^ 1714247896);
            case 31 -> baaaaab(-522994363, var9 ^ -263764936);
            case 32 -> baaaaab(-522994364, var9 ^ 276500481);
            case 33 -> baaaaab(-522994361, var9 ^ -1752379999);
            case 34 -> baaaaab(-522994362, var9 ^ 1742653174);
            case 35 -> baaaaab(-522994367, var9 ^ 1659637427);
            case 36 -> baaaaab(-522994368, var9 ^ -416318108);
            case 37 -> baaaaab(-522994365, var9 ^ -856933814);
            case 38 -> baaaaab(-522994366, var9 ^ 1280281451);
            case 39 -> baaaaab(-522994355, var9 ^ 689516776);
            case 40 -> baaaaab(-522994356, var9 ^ -1028719151);
            case 41 -> baaaaab(-522994353, var9 ^ 1151552059);
            case 42 -> baaaaab(-522994354, var9 ^ 1972523295);
            case 43 -> baaaaab(-522994359, var9 ^ -895590668);
            case 44 -> baaaaab(-522994360, var9 ^ -1217575707);
            case 45 -> baaaaab(-522994357, var9 ^ 936964752);
            case 46 -> baaaaab(-522994358, var9 ^ 2072323025);
            case 47 -> baaaaab(-522994347, var9 ^ 1499479949);
            case 48 -> baaaaab(-522994348, var9 ^ 1567592192);
            case 49 -> baaaaab(-522994345, var9 ^ 1979895540);
            case 50 -> baaaaab(-522994346, var9 ^ 2082005970);
            case 51 -> baaaaab(-522994351, var9 ^ 1255906282);
            case 52 -> baaaaab(-522994352, var9 ^ 1903889849);
            case 53 -> baaaaab(-522994349, var9 ^ -1566043578);
            case 54 -> baaaaab(-522994350, var9 ^ -1036306621);
            case 55 -> baaaaab(-522994339, var9 ^ -1628975041);
            case 56 -> baaaaab(-522994340, var9 ^ -1076311318);
            case 57 -> baaaaab(-522994337, var9 ^ 666128076);
            case 58 -> baaaaab(-522994338, var9 ^ 227685578);
            case 59 -> baaaaab(-522994343, var9 ^ -206625107);
            case 60 -> baaaaab(-522994344, var9 ^ 1301967526);
            case 61 -> baaaaab(-522994341, var9 ^ -1185462962);
            case 62 -> baaaaab(-522994342, var9 ^ -894373028);
            case 63 -> baaaaab(-522994395, var9 ^ -442517816);
            case 64 -> baaaaab(-522994396, var9 ^ 784386586);
            case 65 -> baaaaab(-522994393, var9 ^ 831231131);
            case 66 -> baaaaab(-522994394, var9 ^ -695874172);
            case 67 -> baaaaab(-522994399, var9 ^ 2072656774);
            case 68 -> baaaaab(-522994400, var9 ^ -924924858);
            case 69 -> baaaaab(-522994397, var9 ^ -945567784);
            case 70 -> baaaaab(-522994398, var9 ^ 553056399);
            case 71 -> baaaaab(-522994387, var9 ^ -566781245);
            case 72 -> baaaaab(-522994388, var9 ^ 986074793);
            case 73 -> baaaaab(-522994385, var9 ^ 906477858);
            case 74 -> baaaaab(-522994386, var9 ^ 1688613592);
            case 75 -> baaaaab(-522994391, var9 ^ -1824313170);
            case 76 -> baaaaab(-522994392, var9 ^ -398334562);
            case 77 -> baaaaab(-522994389, var9 ^ 361321014);
            case 78 -> baaaaab(-522994390, var9 ^ 1050640197);
            case 79 -> baaaaab(-522994379, var9 ^ -671254077);
            case 80 -> baaaaab(-522994380, var9 ^ 747461437);
            case 81 -> baaaaab(-522994377, var9 ^ -294597058);
            case 82 -> baaaaab(-522994378, var9 ^ -1692633447);
            case 83 -> baaaaab(-522994383, var9 ^ -1836651374);
            case 84 -> baaaaab(-522994384, var9 ^ -2052769973);
            case 85 -> baaaaab(-522994381, var9 ^ -1086045038);
            case 86 -> baaaaab(-522994382, var9 ^ -758190084);
            case 87 -> baaaaab(-522994371, var9 ^ 189929729);
            case 88 -> baaaaab(-522994372, var9 ^ 811101021);
            case 89 -> baaaaab(-522994369, var9 ^ -483643964);
            case 90 -> baaaaab(-522994370, var9 ^ -1768011411);
            case 91 -> baaaaab(-522994375, var9 ^ -236657394);
            case 92 -> baaaaab(-522994376, var9 ^ 632496640);
            case 93 -> baaaaab(-522994373, var9 ^ 390220250);
            case 94 -> baaaaab(-522994374, var9 ^ 2109156247);
            case 95 -> 2;
            case 96 -> baaaaab(-522994427, var9 ^ 1778740253);
            case 97 -> baaaaab(-522994428, var9 ^ 240071006);
            case 98 -> baaaaab(-522994425, var9 ^ 62478974);
            case 99 -> baaaaab(-522994426, var9 ^ -906232984);
            case 100 -> baaaaab(-522994431, var9 ^ 2079062707);
            case 101 -> baaaaab(-522994432, var9 ^ -628158095);
            case 102 -> baaaaab(-522994429, var9 ^ 1917433338);
            case 103 -> baaaaab(-522994430, var9 ^ 576668866);
            case 104 -> baaaaab(-522994419, var9 ^ -479227230);
            case 105 -> baaaaab(-522994420, var9 ^ -1713226491);
            case 106 -> baaaaab(-522994417, var9 ^ 435877495);
            case 107 -> baaaaab(-522994418, var9 ^ 1830042419);
            case 108 -> baaaaab(-522994423, var9 ^ -1489866098);
            case 109 -> baaaaab(-522994424, var9 ^ 100776738);
            case 110 -> baaaaab(-522994421, var9 ^ 500592925);
            case 111 -> baaaaab(-522994422, var9 ^ 1049208231);
            case 112 -> baaaaab(-522994411, var9 ^ 837857816);
            case 113 -> baaaaab(-522994412, var9 ^ 1162735130);
            case 114 -> baaaaab(-522994409, var9 ^ 1035323728);
            case 115 -> baaaaab(-522994410, var9 ^ -372650305);
            case 116 -> baaaaab(-522994415, var9 ^ -315061909);
            case 117 -> baaaaab(-522994416, var9 ^ -1810752687);
            case 118 -> baaaaab(-522994413, var9 ^ 1933958347);
            case 119 -> baaaaab(-522994414, var9 ^ -1662172098);
            case 120 -> baaaaab(-522994403, var9 ^ 1119862352);
            case 121 -> baaaaab(-522994404, var9 ^ -459221670);
            case 122 -> baaaaab(-522994401, var9 ^ 645012071);
            case 123 -> baaaaab(-522994402, var9 ^ -91267563);
            case 124 -> baaaaab(-522994407, var9 ^ -1099382993);
            case 125 -> baaaaab(-522994408, var9 ^ 1489143628);
            case 126 -> baaaaab(-522994405, var9 ^ -124927308);
            case 127 -> baaaaab(-522994406, var9 ^ 1924928887);
            case 128 -> baaaaab(-522994459, var9 ^ 490429457);
            case 129 -> baaaaab(-522994460, var9 ^ -1111346245);
            case 130 -> baaaaab(-522994457, var9 ^ 511853764);
            case 131 -> baaaaab(-522994458, var9 ^ -1863212979);
            case 132 -> baaaaab(-522994463, var9 ^ 1552289912);
            case 133 -> baaaaab(-522994464, var9 ^ 5436256);
            case 134 -> baaaaab(-522994461, var9 ^ 449978830);
            case 135 -> baaaaab(-522994462, var9 ^ 158992828);
            case 136 -> baaaaab(-522994451, var9 ^ -1691709510);
            case 137 -> baaaaab(-522994452, var9 ^ 452310724);
            case 138 -> baaaaab(-522994449, var9 ^ 61404119);
            case 139 -> baaaaab(-522994450, var9 ^ 1343786392);
            case 140 -> baaaaab(-522994455, var9 ^ 1854388267);
            case 141 -> baaaaab(-522994456, var9 ^ 149349065);
            case 142 -> baaaaab(-522994453, var9 ^ -1146727564);
            case 143 -> baaaaab(-522994454, var9 ^ 1476758386);
            case 144 -> baaaaab(-522994443, var9 ^ 1992601000);
            case 145 -> baaaaab(-522994444, var9 ^ -1097143274);
            case 146 -> baaaaab(-522994441, var9 ^ -1142178656);
            case 147 -> baaaaab(-522994442, var9 ^ 885584464);
            case 148 -> baaaaab(-522994447, var9 ^ 948309685);
            case 149 -> baaaaab(-522994448, var9 ^ -288536879);
            case 150 -> baaaaab(-522994445, var9 ^ 678897744);
            case 151 -> baaaaab(-522994446, var9 ^ 2041192012);
            case 152 -> baaaaab(-522994435, var9 ^ -1240236579);
            case 153 -> baaaaab(-522994436, var9 ^ 1731913220);
            case 154 -> baaaaab(-522994433, var9 ^ -1054815467);
            case 155 -> baaaaab(-522994434, var9 ^ -1906938947);
            case 156 -> baaaaab(-522994439, var9 ^ 1317544423);
            case 157 -> baaaaab(-522994440, var9 ^ -1581558117);
            case 158 -> baaaaab(-522994437, var9 ^ -240602313);
            case 159 -> baaaaab(-522994438, var9 ^ 1302497554);
            case 160 -> baaaaab(-522994491, var9 ^ 664373644);
            case 161 -> baaaaab(-522994492, var9 ^ 1145602709);
            case 162 -> baaaaab(-522994489, var9 ^ 1401957461);
            case 163 -> baaaaab(-522994490, var9 ^ 1481467612);
            case 164 -> baaaaab(-522994495, var9 ^ 1438842629);
            case 165 -> baaaaab(-522994496, var9 ^ 1622617261);
            case 166 -> baaaaab(-522994493, var9 ^ 1824796425);
            case 167 -> baaaaab(-522994494, var9 ^ 937940154);
            case 168 -> baaaaab(-522994483, var9 ^ 2062102762);
            case 169 -> 1;
            case 170 -> 3;
            case 171 -> baaaaab(-522994484, var9 ^ 731936292);
            case 172 -> baaaaab(-522994481, var9 ^ 1592846335);
            case 173 -> baaaaab(-522994482, var9 ^ 761535627);
            case 174 -> baaaaab(-522994487, var9 ^ 1279953609);
            case 175 -> baaaaab(-522994488, var9 ^ -1387780843);
            case 176 -> baaaaab(-522994485, var9 ^ -1771230794);
            case 177 -> baaaaab(-522994486, var9 ^ -1266670968);
            case 178 -> baaaaab(-522994475, var9 ^ 763112679);
            case 179 -> baaaaab(-522994476, var9 ^ -892838037);
            case 180 -> baaaaab(-522994473, var9 ^ -1381404448);
            case 181 -> baaaaab(-522994474, var9 ^ -2058099701);
            case 182 -> baaaaab(-522994479, var9 ^ 2091320265);
            case 183 -> baaaaab(-522994480, var9 ^ 2026162202);
            case 184 -> baaaaab(-522994477, var9 ^ 994541574);
            case 185 -> baaaaab(-522994478, var9 ^ -1145377683);
            case 186 -> baaaaab(-522994467, var9 ^ -179265273);
            case 187 -> baaaaab(-522994468, var9 ^ 1699285759);
            case 188 -> baaaaab(-522994465, var9 ^ 56562427);
            case 189 -> baaaaab(-522994466, var9 ^ -1090157739);
            case 190 -> baaaaab(-522994471, var9 ^ -1451743309);
            case 191 -> 5;
            case 192 -> baaaaab(-522994472, var9 ^ 858683003);
            case 193 -> baaaaab(-522994469, var9 ^ 1351124551);
            case 194 -> baaaaab(-522994470, var9 ^ 243734899);
            case 195 -> baaaaab(-522994523, var9 ^ 390057768);
            case 196 -> baaaaab(-522994524, var9 ^ -1283942742);
            case 197 -> baaaaab(-522994521, var9 ^ 901918824);
            case 198 -> baaaaab(-522994522, var9 ^ 766713699);
            case 199 -> baaaaab(-522994527, var9 ^ -1302950480);
            case 200 -> baaaaab(-522994528, var9 ^ 1532953092);
            case 201 -> baaaaab(-522994525, var9 ^ -1377871534);
            case 202 -> baaaaab(-522994526, var9 ^ -1041105391);
            case 203 -> baaaaab(-522994515, var9 ^ 1170124363);
            case 204 -> baaaaab(-522994516, var9 ^ -1388699468);
            case 205 -> baaaaab(-522994513, var9 ^ 1890837153);
            case 206 -> baaaaab(-522994514, var9 ^ -340086544);
            case 207 -> baaaaab(-522994519, var9 ^ -555160064);
            case 208 -> baaaaab(-522994520, var9 ^ 148536295);
            case 209 -> baaaaab(-522994517, var9 ^ -1496098107);
            case 210 -> baaaaab(-522994518, var9 ^ -1292522959);
            case 211 -> baaaaab(-522994507, var9 ^ 1657553058);
            case 212 -> baaaaab(-522994508, var9 ^ 1552800190);
            case 213 -> baaaaab(-522994505, var9 ^ 1768738327);
            case 214 -> baaaaab(-522994506, var9 ^ -85793697);
            case 215 -> baaaaab(-522994511, var9 ^ 1677617751);
            case 216 -> baaaaab(-522994512, var9 ^ -1968033922);
            case 217 -> 0;
            case 218 -> baaaaab(-522994509, var9 ^ 1776364210);
            case 219 -> baaaaab(-522994510, var9 ^ -1090694623);
            case 220 -> baaaaab(-522994499, var9 ^ -116436425);
            case 221 -> baaaaab(-522994500, var9 ^ 858419319);
            case 222 -> baaaaab(-522994497, var9 ^ -46544177);
            case 223 -> baaaaab(-522994498, var9 ^ -194189756);
            case 224 -> baaaaab(-522994503, var9 ^ -665919859);
            case 225 -> baaaaab(-522994504, var9 ^ 48264399);
            case 226 -> baaaaab(-522994501, var9 ^ 1409547576);
            case 227 -> baaaaab(-522994502, var9 ^ -1193139375);
            case 228 -> baaaaab(-522994555, var9 ^ -690625660);
            case 229 -> baaaaab(-522994556, var9 ^ -880282155);
            case 230 -> baaaaab(-522994553, var9 ^ 1509729972);
            case 231 -> baaaaab(-522994554, var9 ^ 199156731);
            case 232 -> baaaaab(-522994559, var9 ^ -371247897);
            case 233 -> baaaaab(-522994560, var9 ^ 1565318432);
            case 234 -> baaaaab(-522994557, var9 ^ 87695276);
            case 235 -> baaaaab(-522994558, var9 ^ 1920439533);
            case 236 -> baaaaab(-522994547, var9 ^ -796098111);
            case 237 -> baaaaab(-522994548, var9 ^ -1515580370);
            case 238 -> baaaaab(-522994545, var9 ^ -1320132838);
            case 239 -> baaaaab(-522994546, var9 ^ -594884776);
            case 240 -> baaaaab(-522994551, var9 ^ 540513865);
            case 241 -> baaaaab(-522994552, var9 ^ 1467448484);
            case 242 -> baaaaab(-522994549, var9 ^ -1408260783);
            case 243 -> baaaaab(-522994550, var9 ^ 1146947830);
            case 244 -> baaaaab(-522994539, var9 ^ -329179651);
            case 245 -> baaaaab(-522994540, var9 ^ 1576827621);
            case 246 -> baaaaab(-522994537, var9 ^ -1282420686);
            case 247 -> baaaaab(-522994538, var9 ^ -612065753);
            case 248 -> baaaaab(-522994543, var9 ^ -935843063);
            case 249 -> baaaaab(-522994544, var9 ^ -2033736701);
            case 250 -> baaaaab(-522994541, var9 ^ -289122902);
            case 251 -> baaaaab(-522994542, var9 ^ -429140478);
            case 252 -> 4;
            case 253 -> baaaaab(-522994531, var9 ^ -929968194);
            case 254 -> baaaaab(-522994532, var9 ^ 319091638);
            default -> baaaaab(-522994529, var9 ^ -1326125158);
         };
         int var5 = (var1 & baaaaab(-522994530, var9 ^ 340859256)) - var4;
         if (var5 < 0) {
            var5 += 256;
         }

         int var6 = ((var1 & baaaaab(-522994535, var9 ^ -2056467925)) >>> baaaaab(-522994536, var9 ^ 1315254390)) - var4;
         if (var6 < 0) {
            var6 += 256;
         }

         for (int var7 = 0; var7 < var3.length; var7++) {
            int var8 = var7 % 2;
            char var10002 = var3[var7];
            if (var8 == 0) {
               var3[var7] = (char)(var10002 ^ var5);
               var5 = ((var5 >>> 3 | var5 << 5) ^ var3[var7]) & baaaaab(-522994533, var9 ^ 786308203);
            } else {
               var3[var7] = (char)(var10002 ^ var6);
               var6 = ((var6 >>> 3 | var6 << 5) ^ var3[var7]) & baaaaab(-522994534, var9 ^ 1126735774);
            }
         }

         aabaaa[var2] = new String(var3).intern();
      }

      return aabaaa[var2];
   }

   public static boolean aabbaba() {
      // $VF: Couldn't be decompiled
      // Please report this to the Vineflower issue tracker, at https://github.com/Vineflower/vineflower/issues with a copy of the class file (if you have the rights to distribute it!)
      // java.lang.RuntimeException: parsing failure!
      //   at org.jetbrains.java.decompiler.modules.decompiler.decompose.DomHelper.parseGraph(DomHelper.java:211)
      //   at org.jetbrains.java.decompiler.main.rels.MethodProcessor.codeToJava(MethodProcessor.java:166)
      //
      // Bytecode:
      // 00: getstatic qeaa361f143ee4a0894bd168fd9b30c66/qf4ccf8f5435d4a78bdca4d6a018b578e/baaabbaa.bba I
      // 03: istore 0
      // 04: getstatic qeaa361f143ee4a0894bd168fd9b30c66/qf4ccf8f5435d4a78bdca4d6a018b578e/aabaaa.abba Ljava/util/Set;
      // 07: iload 0
      // 08: ifne 1d
      // 0b: invokeinterface java/util/Set.isEmpty ()Z 1
      // 10: ifeq 1a
      // 13: goto 17
      // 16: athrow
      // 17: bipush 0
      // 18: ireturn
      // 19: athrow
      // 1a: getstatic qeaa361f143ee4a0894bd168fd9b30c66/qf4ccf8f5435d4a78bdca4d6a018b578e/aabaaa.abba Ljava/util/Set;
      // 1d: invokeinterface java/util/Set.iterator ()Ljava/util/Iterator; 1
      // 22: astore 1
      // 23: aload 1
      // 24: invokeinterface java/util/Iterator.hasNext ()Z 1
      // 29: ifeq 7c
      // 2c: aload 1
      // 2d: invokeinterface java/util/Iterator.next ()Ljava/lang/Object; 1
      // 32: checkcast qeaa361f143ee4a0894bd168fd9b30c66/qf4ccf8f5435d4a78bdca4d6a018b578e/aabaaa
      // 35: astore 2
      // 36: aload 2
      // 37: getfield qeaa361f143ee4a0894bd168fd9b30c66/qf4ccf8f5435d4a78bdca4d6a018b578e/aabaaa.bbb Ljava/util/concurrent/ConcurrentLinkedQueue;
      // 3a: invokevirtual java/util/concurrent/ConcurrentLinkedQueue.isEmpty ()Z
      // 3d: iload 0
      // 3e: ifne 7d
      // 41: iload 0
      // 42: ifne 77
      // 45: goto 49
      // 48: athrow
      // 49: ifeq 76
      // 4c: goto 50
      // 4f: athrow
      // 50: aload 2
      // 51: getfield qeaa361f143ee4a0894bd168fd9b30c66/qf4ccf8f5435d4a78bdca4d6a018b578e/aabaaa.aab Z
      // 54: iload 0
      // 55: ifne 77
      // 58: goto 5c
      // 5b: athrow
      // 5c: ifne 76
      // 5f: goto 63
      // 62: athrow
      // 63: aload 2
      // 64: getfield qeaa361f143ee4a0894bd168fd9b30c66/qf4ccf8f5435d4a78bdca4d6a018b578e/aabaaa.aaaaaa Z
      // 67: iload 0
      // 68: ifne 77
      // 6b: goto 6f
      // 6e: athrow
      // 6f: ifeq 78
      // 72: goto 76
      // 75: athrow
      // 76: bipush 0
      // 77: ireturn
      // 78: iload 0
      // 79: ifeq 23
      // 7c: bipush 1
      // 7d: ireturn
   }

   public static void aabbabb(Predicate param0, Consumer param1, Predicate param2, Predicate param3) {
      // $VF: Couldn't be decompiled
      // Please report this to the Vineflower issue tracker, at https://github.com/Vineflower/vineflower/issues with a copy of the class file (if you have the rights to distribute it!)
      // java.lang.RuntimeException: parsing failure!
      //   at org.jetbrains.java.decompiler.modules.decompiler.decompose.DomHelper.parseGraph(DomHelper.java:211)
      //   at org.jetbrains.java.decompiler.main.rels.MethodProcessor.codeToJava(MethodProcessor.java:166)
      //
      // Bytecode:
      // 00: aload 0
      // 01: ifnull 0c
      // 04: aload 1
      // 05: ifnonnull 12
      // 08: goto 0c
      // 0b: athrow
      // 0c: aconst_null
      // 0d: putstatic qeaa361f143ee4a0894bd168fd9b30c66/qf4ccf8f5435d4a78bdca4d6a018b578e/aabaaa.a Lqeaa361f143ee4a0894bd168fd9b30c66/qf4ccf8f5435d4a78bdca4d6a018b578e/baabbba;
      // 10: return
      // 11: athrow
      // 12: new qeaa361f143ee4a0894bd168fd9b30c66/qf4ccf8f5435d4a78bdca4d6a018b578e/baabbba
      // 15: dup
      // 16: aload 0
      // 17: aload 1
      // 18: aload 2
      // 19: ifnonnull 25
      // 1c: invokedynamic test ()Ljava/util/function/Predicate; bsm=java/lang/invoke/LambdaMetafactory.metafactory (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;Ljava/lang/invoke/MethodType;Ljava/lang/invoke/MethodHandle;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[ (Ljava/lang/Object;)Z, qeaa361f143ee4a0894bd168fd9b30c66/qf4ccf8f5435d4a78bdca4d6a018b578e/aabaaa.bababb (Lnet/minecraft/class_2596;)Z, (Lnet/minecraft/class_2596;)Z ]
      // 21: goto 26
      // 24: athrow
      // 25: aload 2
      // 26: aload 3
      // 27: ifnonnull 32
      // 2a: invokedynamic test ()Ljava/util/function/Predicate; bsm=java/lang/invoke/LambdaMetafactory.metafactory (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;Ljava/lang/invoke/MethodType;Ljava/lang/invoke/MethodHandle;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[ (Ljava/lang/Object;)Z, qeaa361f143ee4a0894bd168fd9b30c66/qf4ccf8f5435d4a78bdca4d6a018b578e/aabaaa.aabaa (Lnet/minecraft/class_2596;)Z, (Lnet/minecraft/class_2596;)Z ]
      // 2f: goto 33
      // 32: aload 3
      // 33: invokespecial qeaa361f143ee4a0894bd168fd9b30c66/qf4ccf8f5435d4a78bdca4d6a018b578e/baabbba.<init> (Ljava/util/function/Predicate;Ljava/util/function/Consumer;Ljava/util/function/Predicate;Ljava/util/function/Predicate;)V
      // 36: putstatic qeaa361f143ee4a0894bd168fd9b30c66/qf4ccf8f5435d4a78bdca4d6a018b578e/aabaaa.a Lqeaa361f143ee4a0894bd168fd9b30c66/qf4ccf8f5435d4a78bdca4d6a018b578e/baabbba;
      // 39: return
   }

   private boolean aabbbaa() {
      // $VF: Couldn't be decompiled
      // Please report this to the Vineflower issue tracker, at https://github.com/Vineflower/vineflower/issues with a copy of the class file (if you have the rights to distribute it!)
      // java.lang.RuntimeException: parsing failure!
      //   at org.jetbrains.java.decompiler.modules.decompiler.decompose.DomHelper.parseGraph(DomHelper.java:211)
      //   at org.jetbrains.java.decompiler.main.rels.MethodProcessor.codeToJava(MethodProcessor.java:166)
      //
      // Bytecode:
      // 00: getstatic qeaa361f143ee4a0894bd168fd9b30c66/qf4ccf8f5435d4a78bdca4d6a018b578e/baaabbaa.bba I
      // 03: invokestatic qeaa361f143ee4a0894bd168fd9b30c66/qf4ccf8f5435d4a78bdca4d6a018b578e/abbabbaa.abb ()Lqeaa361f143ee4a0894bd168fd9b30c66/qf4ccf8f5435d4a78bdca4d6a018b578e/abbabbaa;
      // 06: astore 2
      // 07: istore 1
      // 08: aload 2
      // 09: iload 1
      // 0a: ifne 1c
      // 0d: invokevirtual qeaa361f143ee4a0894bd168fd9b30c66/qf4ccf8f5435d4a78bdca4d6a018b578e/abbabbaa.aaab ()Z
      // 10: ifeq 41
      // 13: goto 17
      // 16: athrow
      // 17: aload 2
      // 18: goto 1c
      // 1b: athrow
      // 1c: iload 1
      // 1d: ifne 2f
      // 20: invokevirtual qeaa361f143ee4a0894bd168fd9b30c66/qf4ccf8f5435d4a78bdca4d6a018b578e/abbabbaa.bb ()Z
      // 23: ifeq 41
      // 26: goto 2a
      // 29: athrow
      // 2a: aload 2
      // 2b: goto 2f
      // 2e: athrow
      // 2f: invokevirtual qeaa361f143ee4a0894bd168fd9b30c66/qf4ccf8f5435d4a78bdca4d6a018b578e/abbabbaa.aabab ()Z
      // 32: iload 1
      // 33: ifne 3e
      // 36: ifeq 41
      // 39: goto 3d
      // 3c: athrow
      // 3d: bipush 1
      // 3e: goto 42
      // 41: bipush 0
      // 42: ireturn
   }

   private static void aabbbab(aabaaa var0, ChannelHandlerContext var1) {
      var0.baabba(var1);
   }

   private boolean aabbbba(aababbab param1) {
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
      // 09: getfield qeaa361f143ee4a0894bd168fd9b30c66/qf4ccf8f5435d4a78bdca4d6a018b578e/aabaaa.bbab Ljava/util/concurrent/ConcurrentLinkedQueue;
      // 0c: invokevirtual java/util/concurrent/ConcurrentLinkedQueue.size ()I
      // 0f: bipush 4
      // 10: if_icmplt 1a
      // 13: goto 17
      // 16: athrow
      // 17: bipush 0
      // 18: ireturn
      // 19: athrow
      // 1a: aload 0
      // 1b: getfield qeaa361f143ee4a0894bd168fd9b30c66/qf4ccf8f5435d4a78bdca4d6a018b578e/aabaaa.bbab Ljava/util/concurrent/ConcurrentLinkedQueue;
      // 1e: aload 1
      // 1f: invokevirtual java/util/concurrent/ConcurrentLinkedQueue.offer (Ljava/lang/Object;)Z
      // 22: pop
      // 23: bipush 1
      // 24: ireturn
   }

   private static String baaaaba(int var0, int var1) {
      int var3 = var0 ^ -1033132910;
      char[] var4 = abbaba[var3].toCharArray();
      StackTraceElement[] var2 = (StackTraceElement[])abbabb[var3];
      StackTraceElement[] var5;
      if (var2 != null) {
         var5 = var2;
      } else {
         var5 = new Throwable().getStackTrace();
         abbabb[var3] = var5;
      }

      StackTraceElement var6 = var5[1];
      int var7 = (var6.getClassName().hashCode() ^ var6.getMethodName().hashCode()) >> 16 ^ -999952657;
      int var8 = 0;

      do {
         var4[var8] = (char)(var4[var8] ^ switch (var8 & 31) {
            default -> 255;
            case 1 -> 60;
            case 2 -> 110;
            case 3 -> 183;
            case 4 -> 229;
            case 5 -> 227;
            case 6 -> 79;
            case 7 -> 11;
            case 8 -> 170;
            case 9 -> 122;
            case 10 -> 223;
            case 11 -> 214;
            case 12 -> 159;
            case 13 -> 85;
            case 14 -> 118;
            case 15 -> 174;
            case 16 -> 193;
            case 17 -> 233;
            case 18 -> 249;
            case 19 -> 175;
            case 20 -> 119;
            case 21 -> 107;
            case 22 -> 93;
            case 23 -> 59;
            case 24 -> 208;
            case 25 -> 55;
            case 26 -> 147;
            case 27 -> 48;
            case 28 -> 242;
            case 29 -> 254;
            case 30 -> 159;
            case 31 -> 234;
         } ^ var1 >> 16 ^ var7);
      } while (++var8 < var4.length);

      return new String(var4).intern();
   }

   private static boolean aabbbbb(Object param0) {
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
      // 05: instanceof net/minecraft/class_2827
      // 08: iload 1
      // 09: ifne bf
      // 0c: ifne be
      // 0f: goto 13
      // 12: athrow
      // 13: aload 0
      // 14: instanceof net/minecraft/class_6374
      // 17: iload 1
      // 18: ifne bf
      // 1b: goto 1f
      // 1e: athrow
      // 1f: ifne be
      // 22: goto 26
      // 25: athrow
      // 26: aload 0
      // 27: instanceof net/minecraft/class_2856
      // 2a: iload 1
      // 2b: ifne bf
      // 2e: goto 32
      // 31: athrow
      // 32: ifne be
      // 35: goto 39
      // 38: athrow
      // 39: aload 0
      // 3a: instanceof net/minecraft/class_2935
      // 3d: iload 1
      // 3e: ifne bf
      // 41: goto 45
      // 44: athrow
      // 45: ifne be
      // 48: goto 4c
      // 4b: athrow
      // 4c: aload 0
      // 4d: instanceof net/minecraft/class_7640
      // 50: iload 1
      // 51: ifne bf
      // 54: goto 58
      // 57: athrow
      // 58: ifne be
      // 5b: goto 5f
      // 5e: athrow
      // 5f: aload 0
      // 60: instanceof net/minecraft/class_8590
      // 63: iload 1
      // 64: ifne bf
      // 67: goto 6b
      // 6a: athrow
      // 6b: ifne be
      // 6e: goto 72
      // 71: athrow
      // 72: aload 0
      // 73: instanceof net/minecraft/class_8591
      // 76: iload 1
      // 77: ifne bf
      // 7a: goto 7e
      // 7d: athrow
      // 7e: ifne be
      // 81: goto 85
      // 84: athrow
      // 85: aload 0
      // 86: instanceof net/minecraft/class_2833
      // 89: iload 1
      // 8a: ifne bf
      // 8d: goto 91
      // 90: athrow
      // 91: ifne be
      // 94: goto 98
      // 97: athrow
      // 98: aload 0
      // 99: instanceof net/minecraft/class_2813
      // 9c: iload 1
      // 9d: ifne bf
      // a0: goto a4
      // a3: athrow
      // a4: ifne be
      // a7: goto ab
      // aa: athrow
      // ab: aload 0
      // ac: instanceof net/minecraft/class_2815
      // af: iload 1
      // b0: ifne bf
      // b3: goto b7
      // b6: athrow
      // b7: ifeq c2
      // ba: goto be
      // bd: athrow
      // be: bipush 1
      // bf: goto c3
      // c2: bipush 0
      // c3: ireturn
   }

   public static int abaaaaa() {
      // $VF: Couldn't be decompiled
      // Please report this to the Vineflower issue tracker, at https://github.com/Vineflower/vineflower/issues with a copy of the class file (if you have the rights to distribute it!)
      // java.lang.RuntimeException: parsing failure!
      //   at org.jetbrains.java.decompiler.modules.decompiler.decompose.DomHelper.parseGraph(DomHelper.java:211)
      //   at org.jetbrains.java.decompiler.main.rels.MethodProcessor.codeToJava(MethodProcessor.java:166)
      //
      // Bytecode:
      // 00: getstatic qeaa361f143ee4a0894bd168fd9b30c66/qf4ccf8f5435d4a78bdca4d6a018b578e/baaabbaa.bba I
      // 03: lconst_0
      // 04: lstore 1
      // 05: istore 0
      // 06: getstatic qeaa361f143ee4a0894bd168fd9b30c66/qf4ccf8f5435d4a78bdca4d6a018b578e/aabaaa.abba Ljava/util/Set;
      // 09: invokeinterface java/util/Set.iterator ()Ljava/util/Iterator; 1
      // 0e: astore 3
      // 0f: aload 3
      // 10: invokeinterface java/util/Iterator.hasNext ()Z 1
      // 15: ifeq 37
      // 18: aload 3
      // 19: invokeinterface java/util/Iterator.next ()Ljava/lang/Object; 1
      // 1e: checkcast qeaa361f143ee4a0894bd168fd9b30c66/qf4ccf8f5435d4a78bdca4d6a018b578e/aabaaa
      // 21: astore 4
      // 23: lload 1
      // 24: aload 4
      // 26: getfield qeaa361f143ee4a0894bd168fd9b30c66/qf4ccf8f5435d4a78bdca4d6a018b578e/aabaaa.bb Ljava/util/concurrent/ConcurrentLinkedQueue;
      // 29: invokevirtual java/util/concurrent/ConcurrentLinkedQueue.size ()I
      // 2c: i2l
      // 2d: ladd
      // 2e: iload 0
      // 2f: ifne 38
      // 32: lstore 1
      // 33: iload 0
      // 34: ifeq 0f
      // 37: lload 1
      // 38: iload 0
      // 39: ifne 6f
      // 3c: ldc_w -522994587
      // 3f: ldc_w -1378171061
      // 42: ldc_w 724960984
      // 45: ixor
      // 46: invokestatic qeaa361f143ee4a0894bd168fd9b30c66/qf4ccf8f5435d4a78bdca4d6a018b578e/aabaaa.baaaaab (II)I
      // 49: ldc2_w 3633379651209419221
      // 4c: invokestatic qeaa361f143ee4a0894bd168fd9b30c66/qf4ccf8f5435d4a78bdca4d6a018b578e/aabaaa.aaa (IJ)J
      // 4f: lcmp
      // 50: ifle 6e
      // 53: goto 57
      // 56: athrow
      // 57: ldc_w -522994588
      // 5a: ldc_w -1378171061
      // 5d: ldc_w 764625530
      // 60: ixor
      // 61: invokestatic qeaa361f143ee4a0894bd168fd9b30c66/qf4ccf8f5435d4a78bdca4d6a018b578e/aabaaa.baaaaab (II)I
      // 64: ldc2_w 4176645215530251923
      // 67: invokestatic qeaa361f143ee4a0894bd168fd9b30c66/qf4ccf8f5435d4a78bdca4d6a018b578e/aabaaa.abbbbab (IJ)I
      // 6a: goto 70
      // 6d: athrow
      // 6e: lload 1
      // 6f: l2i
      // 70: ireturn
   }

   // $VF: Could not verify finally blocks. A semaphore variable has been added to preserve control flow.
   // Please report this to the Vineflower issue tracker, at https://github.com/Vineflower/vineflower/issues with a copy of the class file (if you have the rights to distribute it!)
   public static void abaaaab() {
      int var10000 = baaabbaa.bba;
      aaaabbaa var1 = abbabbaa.abb().bba();
      int var0 = var10000;
      boolean var7 = false /* VF: Semaphore variable */;

      try {
         var7 = true;
         Iterator var2 = abba.iterator();

         while (true) {
            if (var2.hasNext()) {
               aabaaa var3 = (aabaaa)var2.next();

               try {
                  if (var0 != 0) {
                     var7 = false;
                     return;
                  }

                  var3.bbbba(var1);
                  if (var0 == 0) {
                     continue;
                  }

                  var7 = false;
                  break;
               } catch (CancellationException var8) {
                  throw var8;
               }
            }

            var7 = false;
            break;
         }
      } finally {
         if (var7) {
            baaba = false;
         }
      }

      baaba = false;
   }

   private boolean abaaaba(ChannelHandlerContext var1) {
      int var10000 = baaabbaa.bba;
      ArrayList var3 = new ArrayList(abbbbab(baaaaab(-522994585, 178314320 ^ 1903968761), 5862819850800368346L));
      int var2 = var10000;

      while (var3.size() < abbbbab(baaaaab(-522994586, 178314320 ^ -1082450282), 1394829197470904801L)) {
         ababbb var4;
         ababbb var9 = var4 = (ababbb)this.bb.poll();

         try {
            if (var9 == null) {
               break;
            }

            var3.add(var4);
            if (var2 != 0) {
               break;
            }
         } catch (CancellationException var8) {
            throw var8;
         }
      }

      boolean var5 = false;
      Iterator var6 = var3.iterator();

      while (true) {
         if (var6.hasNext()) {
            ababbb var7 = (ababbb)var6.next();
            var10 = var5;
            if (var2 != 0) {
               break;
            }

            var5 |= this.abbaabb(var1, var7.bb, var7.ab);
            if (var2 == 0) {
               continue;
            }
         }

         var10 = var5;
         break;
      }

      return var10;
   }

   private void abaaabb(ChannelHandlerContext param1) {
      // $VF: Couldn't be decompiled
      // Please report this to the Vineflower issue tracker, at https://github.com/Vineflower/vineflower/issues with a copy of the class file (if you have the rights to distribute it!)
      // java.lang.RuntimeException: parsing failure!
      //   at org.jetbrains.java.decompiler.modules.decompiler.decompose.DomHelper.parseGraph(DomHelper.java:211)
      //   at org.jetbrains.java.decompiler.main.rels.MethodProcessor.codeToJava(MethodProcessor.java:166)
      //
      // Bytecode:
      // 000: aconst_null
      // 001: astore 3
      // 002: getstatic qeaa361f143ee4a0894bd168fd9b30c66/qf4ccf8f5435d4a78bdca4d6a018b578e/baaabbaa.bba I
      // 005: ldc_w -522994591
      // 008: ldc_w 1872001841
      // 00b: ldc_w 1869939822
      // 00e: ixor
      // 00f: invokestatic qeaa361f143ee4a0894bd168fd9b30c66/qf4ccf8f5435d4a78bdca4d6a018b578e/aabaaa.baaaaab (II)I
      // 012: ldc2_w 3340777758401312703
      // 015: invokestatic qeaa361f143ee4a0894bd168fd9b30c66/qf4ccf8f5435d4a78bdca4d6a018b578e/aabaaa.aaa (IJ)J
      // 018: lstore 4
      // 01a: aload 0
      // 01b: getfield qeaa361f143ee4a0894bd168fd9b30c66/qf4ccf8f5435d4a78bdca4d6a018b578e/aabaaa.aabbaa Ljava/util/concurrent/ConcurrentLinkedQueue;
      // 01e: invokevirtual java/util/concurrent/ConcurrentLinkedQueue.iterator ()Ljava/util/Iterator;
      // 021: astore 6
      // 023: istore 2
      // 024: aload 6
      // 026: invokeinterface java/util/Iterator.hasNext ()Z 1
      // 02b: ifeq 0d3
      // 02e: aload 6
      // 030: invokeinterface java/util/Iterator.next ()Ljava/lang/Object; 1
      // 035: checkcast qeaa361f143ee4a0894bd168fd9b30c66/qf4ccf8f5435d4a78bdca4d6a018b578e/aabaaab
      // 038: astore 7
      // 03a: aload 0
      // 03b: aload 7
      // 03d: iload 2
      // 03e: ifne 167
      // 041: getfield qeaa361f143ee4a0894bd168fd9b30c66/qf4ccf8f5435d4a78bdca4d6a018b578e/aabaaab.aa J
      // 044: aload 0
      // 045: aload 7
      // 047: invokevirtual qeaa361f143ee4a0894bd168fd9b30c66/qf4ccf8f5435d4a78bdca4d6a018b578e/aabaaa.aabaaaa (Lqeaa361f143ee4a0894bd168fd9b30c66/qf4ccf8f5435d4a78bdca4d6a018b578e/aabaaab;)J
      // 04a: invokevirtual qeaa361f143ee4a0894bd168fd9b30c66/qf4ccf8f5435d4a78bdca4d6a018b578e/aabaaa.ababbbb (JJ)J
      // 04d: lstore 8
      // 04f: lload 8
      // 051: iload 2
      // 052: ifne 0cd
      // 055: lconst_0
      // 056: lcmp
      // 057: ifgt 0c2
      // 05a: goto 05e
      // 05d: athrow
      // 05e: aload 3
      // 05f: iload 2
      // 060: ifne 0bd
      // 063: goto 067
      // 066: athrow
      // 067: ifnull 0b7
      // 06a: goto 06e
      // 06d: athrow
      // 06e: aload 7
      // 070: iload 2
      // 071: ifne 0bd
      // 074: goto 078
      // 077: athrow
      // 078: getfield qeaa361f143ee4a0894bd168fd9b30c66/qf4ccf8f5435d4a78bdca4d6a018b578e/aabaaab.a I
      // 07b: aload 3
      // 07c: getfield qeaa361f143ee4a0894bd168fd9b30c66/qf4ccf8f5435d4a78bdca4d6a018b578e/aabaaab.a I
      // 07f: if_icmpgt 0b7
      // 082: goto 086
      // 085: athrow
      // 086: aload 7
      // 088: iload 2
      // 089: ifne 0a4
      // 08c: goto 090
      // 08f: athrow
      // 090: getfield qeaa361f143ee4a0894bd168fd9b30c66/qf4ccf8f5435d4a78bdca4d6a018b578e/aabaaab.a I
      // 093: aload 3
      // 094: getfield qeaa361f143ee4a0894bd168fd9b30c66/qf4ccf8f5435d4a78bdca4d6a018b578e/aabaaab.a I
      // 097: if_icmpne 0cf
      // 09a: goto 09e
      // 09d: athrow
      // 09e: aload 7
      // 0a0: goto 0a4
      // 0a3: athrow
      // 0a4: iload 2
      // 0a5: ifne 0bd
      // 0a8: getfield qeaa361f143ee4a0894bd168fd9b30c66/qf4ccf8f5435d4a78bdca4d6a018b578e/aabaaab.aa J
      // 0ab: aload 3
      // 0ac: getfield qeaa361f143ee4a0894bd168fd9b30c66/qf4ccf8f5435d4a78bdca4d6a018b578e/aabaaab.aa J
      // 0af: lcmp
      // 0b0: ifle 0cf
      // 0b3: goto 0b7
      // 0b6: athrow
      // 0b7: aload 7
      // 0b9: goto 0bd
      // 0bc: athrow
      // 0bd: astore 3
      // 0be: iload 2
      // 0bf: ifeq 0cf
      // 0c2: lload 4
      // 0c4: lload 8
      // 0c6: invokestatic java/lang/Math.min (JJ)J
      // 0c9: goto 0cd
      // 0cc: athrow
      // 0cd: lstore 4
      // 0cf: iload 2
      // 0d0: ifeq 024
      // 0d3: aload 3
      // 0d4: ifnonnull 12a
      // 0d7: aload 0
      // 0d8: iload 2
      // 0d9: ifne 0fa
      // 0dc: goto 0e0
      // 0df: athrow
      // 0e0: getfield qeaa361f143ee4a0894bd168fd9b30c66/qf4ccf8f5435d4a78bdca4d6a018b578e/aabaaa.abbb Ljava/util/concurrent/atomic/AtomicBoolean;
      // 0e3: bipush 0
      // 0e4: invokevirtual java/util/concurrent/atomic/AtomicBoolean.set (Z)V
      // 0e7: aload 0
      // 0e8: getfield qeaa361f143ee4a0894bd168fd9b30c66/qf4ccf8f5435d4a78bdca4d6a018b578e/aabaaa.aabbaa Ljava/util/concurrent/ConcurrentLinkedQueue;
      // 0eb: invokevirtual java/util/concurrent/ConcurrentLinkedQueue.isEmpty ()Z
      // 0ee: ifne 129
      // 0f1: goto 0f5
      // 0f4: athrow
      // 0f5: aload 0
      // 0f6: goto 0fa
      // 0f9: athrow
      // 0fa: aload 1
      // 0fb: lload 4
      // 0fd: iload 2
      // 0fe: ifne 121
      // 101: ldc_w -522994592
      // 104: ldc_w 1872001841
      // 107: ldc_w 843412239
      // 10a: ixor
      // 10b: invokestatic qeaa361f143ee4a0894bd168fd9b30c66/qf4ccf8f5435d4a78bdca4d6a018b578e/aabaaa.baaaaab (II)I
      // 10e: ldc2_w 7427055331774585409
      // 111: invokestatic qeaa361f143ee4a0894bd168fd9b30c66/qf4ccf8f5435d4a78bdca4d6a018b578e/aabaaa.aaa (IJ)J
      // 114: lcmp
      // 115: ifne 124
      // 118: goto 11c
      // 11b: athrow
      // 11c: lconst_0
      // 11d: goto 121
      // 120: athrow
      // 121: goto 126
      // 124: lload 4
      // 126: invokevirtual qeaa361f143ee4a0894bd168fd9b30c66/qf4ccf8f5435d4a78bdca4d6a018b578e/aabaaa.bbba (Lio/netty/channel/ChannelHandlerContext;J)V
      // 129: return
      // 12a: aload 0
      // 12b: iload 2
      // 12c: ifne 179
      // 12f: getfield qeaa361f143ee4a0894bd168fd9b30c66/qf4ccf8f5435d4a78bdca4d6a018b578e/aabaaa.aabbaa Ljava/util/concurrent/ConcurrentLinkedQueue;
      // 132: aload 3
      // 133: invokevirtual java/util/concurrent/ConcurrentLinkedQueue.remove (Ljava/lang/Object;)Z
      // 136: ifne 165
      // 139: goto 13d
      // 13c: athrow
      // 13d: aload 0
      // 13e: iload 2
      // 13f: ifne 160
      // 142: goto 146
      // 145: athrow
      // 146: getfield qeaa361f143ee4a0894bd168fd9b30c66/qf4ccf8f5435d4a78bdca4d6a018b578e/aabaaa.abbb Ljava/util/concurrent/atomic/AtomicBoolean;
      // 149: bipush 0
      // 14a: invokevirtual java/util/concurrent/atomic/AtomicBoolean.set (Z)V
      // 14d: aload 0
      // 14e: getfield qeaa361f143ee4a0894bd168fd9b30c66/qf4ccf8f5435d4a78bdca4d6a018b578e/aabaaa.aabbaa Ljava/util/concurrent/ConcurrentLinkedQueue;
      // 151: invokevirtual java/util/concurrent/ConcurrentLinkedQueue.isEmpty ()Z
      // 154: ifne 164
      // 157: goto 15b
      // 15a: athrow
      // 15b: aload 0
      // 15c: goto 160
      // 15f: athrow
      // 160: aload 1
      // 161: invokevirtual qeaa361f143ee4a0894bd168fd9b30c66/qf4ccf8f5435d4a78bdca4d6a018b578e/aabaaa.abbbbaa (Lio/netty/channel/ChannelHandlerContext;)V
      // 164: return
      // 165: aload 0
      // 166: aload 3
      // 167: getfield qeaa361f143ee4a0894bd168fd9b30c66/qf4ccf8f5435d4a78bdca4d6a018b578e/aabaaab.a I
      // 16a: invokevirtual qeaa361f143ee4a0894bd168fd9b30c66/qf4ccf8f5435d4a78bdca4d6a018b578e/aabaaa.abbaa (I)V
      // 16d: aload 0
      // 16e: getfield qeaa361f143ee4a0894bd168fd9b30c66/qf4ccf8f5435d4a78bdca4d6a018b578e/aabaaa.bbbaa Ljava/util/Set;
      // 171: aload 3
      // 172: invokeinterface java/util/Set.remove (Ljava/lang/Object;)Z 2
      // 177: pop
      // 178: aload 0
      // 179: iload 2
      // 17a: ifne 1b1
      // 17d: aload 1
      // 17e: aload 3
      // 17f: getfield qeaa361f143ee4a0894bd168fd9b30c66/qf4ccf8f5435d4a78bdca4d6a018b578e/aabaaab.ba Ljava/lang/Object;
      // 182: aload 3
      // 183: getfield qeaa361f143ee4a0894bd168fd9b30c66/qf4ccf8f5435d4a78bdca4d6a018b578e/aabaaab.ab Lio/netty/channel/ChannelPromise;
      // 186: invokevirtual qeaa361f143ee4a0894bd168fd9b30c66/qf4ccf8f5435d4a78bdca4d6a018b578e/aabaaa.abbaabb (Lio/netty/channel/ChannelHandlerContext;Ljava/lang/Object;Lio/netty/channel/ChannelPromise;)Z
      // 189: ifeq 19b
      // 18c: goto 190
      // 18f: athrow
      // 190: aload 1
      // 191: invokeinterface io/netty/channel/ChannelHandlerContext.flush ()Lio/netty/channel/ChannelHandlerContext; 1
      // 196: pop
      // 197: goto 19b
      // 19a: athrow
      // 19b: aload 0
      // 19c: aload 3
      // 19d: invokevirtual qeaa361f143ee4a0894bd168fd9b30c66/qf4ccf8f5435d4a78bdca4d6a018b578e/aabaaa.abbbbb (Lqeaa361f143ee4a0894bd168fd9b30c66/qf4ccf8f5435d4a78bdca4d6a018b578e/aabaaab;)V
      // 1a0: aload 0
      // 1a1: iload 2
      // 1a2: ifne 1bf
      // 1a5: getfield qeaa361f143ee4a0894bd168fd9b30c66/qf4ccf8f5435d4a78bdca4d6a018b578e/aabaaa.abbb Ljava/util/concurrent/atomic/AtomicBoolean;
      // 1a8: bipush 0
      // 1a9: invokevirtual java/util/concurrent/atomic/AtomicBoolean.set (Z)V
      // 1ac: aload 0
      // 1ad: goto 1b1
      // 1b0: athrow
      // 1b1: getfield qeaa361f143ee4a0894bd168fd9b30c66/qf4ccf8f5435d4a78bdca4d6a018b578e/aabaaa.aabbaa Ljava/util/concurrent/ConcurrentLinkedQueue;
      // 1b4: invokevirtual java/util/concurrent/ConcurrentLinkedQueue.isEmpty ()Z
      // 1b7: ifne 1c3
      // 1ba: aload 0
      // 1bb: goto 1bf
      // 1be: athrow
      // 1bf: aload 1
      // 1c0: invokevirtual qeaa361f143ee4a0894bd168fd9b30c66/qf4ccf8f5435d4a78bdca4d6a018b578e/aabaaa.abbbbaa (Lio/netty/channel/ChannelHandlerContext;)V
      // 1c3: return
   }

   private void abaabaa(ChannelHandlerContext param1, long param2, abaaaabba param4, long param5) {
      // $VF: Couldn't be decompiled
      // Please report this to the Vineflower issue tracker, at https://github.com/Vineflower/vineflower/issues with a copy of the class file (if you have the rights to distribute it!)
      // java.lang.RuntimeException: parsing failure!
      //   at org.jetbrains.java.decompiler.modules.decompiler.decompose.DomHelper.parseGraph(DomHelper.java:211)
      //   at org.jetbrains.java.decompiler.main.rels.MethodProcessor.codeToJava(MethodProcessor.java:166)
      //
      // Bytecode:
      // 00: getstatic qeaa361f143ee4a0894bd168fd9b30c66/qf4ccf8f5435d4a78bdca4d6a018b578e/baaabbaa.bba I
      // 03: istore 7
      // 05: aload 0
      // 06: iload 7
      // 08: ifne 1d
      // 0b: getfield qeaa361f143ee4a0894bd168fd9b30c66/qf4ccf8f5435d4a78bdca4d6a018b578e/aabaaa.bbaba Ljava/util/concurrent/atomic/AtomicBoolean;
      // 0e: bipush 0
      // 0f: bipush 1
      // 10: invokevirtual java/util/concurrent/atomic/AtomicBoolean.compareAndSet (ZZ)Z
      // 13: ifne 1c
      // 16: goto 1a
      // 19: athrow
      // 1a: return
      // 1b: athrow
      // 1c: aload 0
      // 1d: aload 1
      // 1e: lload 2
      // 1f: aload 4
      // 21: invokedynamic run (Lqeaa361f143ee4a0894bd168fd9b30c66/qf4ccf8f5435d4a78bdca4d6a018b578e/aabaaa;Lio/netty/channel/ChannelHandlerContext;JLqeaa361f143ee4a0894bd168fd9b30c66/qf4ccf8f5435d4a78bdca4d6a018b578e/abaaaabba;)Ljava/lang/Runnable; bsm=java/lang/invoke/LambdaMetafactory.metafactory (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;Ljava/lang/invoke/MethodType;Ljava/lang/invoke/MethodHandle;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[ ()V, qeaa361f143ee4a0894bd168fd9b30c66/qf4ccf8f5435d4a78bdca4d6a018b578e/aabaaa.ba (Lio/netty/channel/ChannelHandlerContext;JLqeaa361f143ee4a0894bd168fd9b30c66/qf4ccf8f5435d4a78bdca4d6a018b578e/abaaaabba;)V, ()V ]
      // 26: astore 8
      // 28: lload 5
      // 2a: lconst_0
      // 2b: lcmp
      // 2c: iload 7
      // 2e: ifne 67
      // 31: ifle 53
      // 34: goto 38
      // 37: athrow
      // 38: aload 1
      // 39: invokeinterface io/netty/channel/ChannelHandlerContext.executor ()Lio/netty/util/concurrent/EventExecutor; 1
      // 3e: aload 8
      // 40: lload 5
      // 42: getstatic qeaa361f143ee4a0894bd168fd9b30c66/qf4ccf8f5435d4a78bdca4d6a018b578e/aabaaa.abaa J
      // 45: invokestatic java/lang/Math.max (JJ)J
      // 48: getstatic java/util/concurrent/TimeUnit.NANOSECONDS Ljava/util/concurrent/TimeUnit;
      // 4b: invokeinterface io/netty/util/concurrent/EventExecutor.schedule (Ljava/lang/Runnable;JLjava/util/concurrent/TimeUnit;)Lio/netty/util/concurrent/ScheduledFuture; 5
      // 50: pop
      // 51: return
      // 52: athrow
      // 53: aload 1
      // 54: iload 7
      // 56: ifne 7f
      // 59: invokeinterface io/netty/channel/ChannelHandlerContext.executor ()Lio/netty/util/concurrent/EventExecutor; 1
      // 5e: invokeinterface io/netty/util/concurrent/EventExecutor.inEventLoop ()Z 1
      // 63: goto 67
      // 66: athrow
      // 67: ifeq 7a
      // 6a: aload 8
      // 6c: invokeinterface java/lang/Runnable.run ()V 1
      // 71: iload 7
      // 73: ifeq 8b
      // 76: goto 7a
      // 79: athrow
      // 7a: aload 1
      // 7b: goto 7f
      // 7e: athrow
      // 7f: invokeinterface io/netty/channel/ChannelHandlerContext.executor ()Lio/netty/util/concurrent/EventExecutor; 1
      // 84: aload 8
      // 86: invokeinterface io/netty/util/concurrent/EventExecutor.execute (Ljava/lang/Runnable;)V 2
      // 8b: return
   }

   private boolean abaabab(ChannelHandlerContext param1) {
      // $VF: Couldn't be decompiled
      // Please report this to the Vineflower issue tracker, at https://github.com/Vineflower/vineflower/issues with a copy of the class file (if you have the rights to distribute it!)
      // java.lang.RuntimeException: parsing failure!
      //   at org.jetbrains.java.decompiler.modules.decompiler.decompose.DomHelper.parseGraph(DomHelper.java:211)
      //   at org.jetbrains.java.decompiler.main.rels.MethodProcessor.codeToJava(MethodProcessor.java:166)
      //
      // Bytecode:
      // 000: getstatic qeaa361f143ee4a0894bd168fd9b30c66/qf4ccf8f5435d4a78bdca4d6a018b578e/baaabbaa.bba I
      // 003: bipush 0
      // 004: istore 3
      // 005: bipush 0
      // 006: istore 4
      // 008: new java/util/ArrayList
      // 00b: dup
      // 00c: ldc_w -522994589
      // 00f: ldc_w 2011822541
      // 012: ldc_w -1521631255
      // 015: ixor
      // 016: invokestatic qeaa361f143ee4a0894bd168fd9b30c66/qf4ccf8f5435d4a78bdca4d6a018b578e/aabaaa.baaaaab (II)I
      // 019: ldc2_w 7792292559522560662
      // 01c: invokestatic qeaa361f143ee4a0894bd168fd9b30c66/qf4ccf8f5435d4a78bdca4d6a018b578e/aabaaa.abbbbab (IJ)I
      // 01f: invokespecial java/util/ArrayList.<init> (I)V
      // 022: astore 5
      // 024: istore 2
      // 025: iload 3
      // 026: ldc_w -522994590
      // 029: ldc_w 2011822541
      // 02c: ldc_w 2041314298
      // 02f: ixor
      // 030: invokestatic qeaa361f143ee4a0894bd168fd9b30c66/qf4ccf8f5435d4a78bdca4d6a018b578e/aabaaa.baaaaab (II)I
      // 033: ldc2_w 2839131183898874101
      // 036: invokestatic qeaa361f143ee4a0894bd168fd9b30c66/qf4ccf8f5435d4a78bdca4d6a018b578e/aabaaa.abbbbab (IJ)I
      // 039: if_icmpge 11f
      // 03c: aload 0
      // 03d: getfield qeaa361f143ee4a0894bd168fd9b30c66/qf4ccf8f5435d4a78bdca4d6a018b578e/aabaaa.bb Ljava/util/concurrent/ConcurrentLinkedQueue;
      // 040: invokevirtual java/util/concurrent/ConcurrentLinkedQueue.peek ()Ljava/lang/Object;
      // 043: checkcast qeaa361f143ee4a0894bd168fd9b30c66/qf4ccf8f5435d4a78bdca4d6a018b578e/ababbb
      // 046: dup
      // 047: astore 6
      // 049: iload 2
      // 04a: ifne 056
      // 04d: ifnull 11f
      // 050: goto 054
      // 053: athrow
      // 054: aload 6
      // 056: iload 2
      // 057: ifne 08d
      // 05a: getfield qeaa361f143ee4a0894bd168fd9b30c66/qf4ccf8f5435d4a78bdca4d6a018b578e/ababbb.aa Lqeaa361f143ee4a0894bd168fd9b30c66/qf4ccf8f5435d4a78bdca4d6a018b578e/abaaaabba;
      // 05d: getstatic qeaa361f143ee4a0894bd168fd9b30c66/qf4ccf8f5435d4a78bdca4d6a018b578e/abaaaabba.ba Lqeaa361f143ee4a0894bd168fd9b30c66/qf4ccf8f5435d4a78bdca4d6a018b578e/abaaaabba;
      // 060: if_acmpeq 077
      // 063: goto 067
      // 066: athrow
      // 067: iload 3
      // 068: ifle 077
      // 06b: goto 06f
      // 06e: athrow
      // 06f: iload 2
      // 070: ifeq 11f
      // 073: goto 077
      // 076: athrow
      // 077: aload 0
      // 078: getfield qeaa361f143ee4a0894bd168fd9b30c66/qf4ccf8f5435d4a78bdca4d6a018b578e/aabaaa.bb Ljava/util/concurrent/ConcurrentLinkedQueue;
      // 07b: invokevirtual java/util/concurrent/ConcurrentLinkedQueue.poll ()Ljava/lang/Object;
      // 07e: checkcast qeaa361f143ee4a0894bd168fd9b30c66/qf4ccf8f5435d4a78bdca4d6a018b578e/ababbb
      // 081: astore 6
      // 083: iload 2
      // 084: ifne 09f
      // 087: aload 6
      // 089: goto 08d
      // 08c: athrow
      // 08d: ifnonnull 098
      // 090: iload 2
      // 091: ifeq 11f
      // 094: goto 098
      // 097: athrow
      // 098: iinc 3 1
      // 09b: goto 09f
      // 09e: athrow
      // 09f: aload 6
      // 0a1: iload 2
      // 0a2: ifne 104
      // 0a5: getfield qeaa361f143ee4a0894bd168fd9b30c66/qf4ccf8f5435d4a78bdca4d6a018b578e/ababbb.aa Lqeaa361f143ee4a0894bd168fd9b30c66/qf4ccf8f5435d4a78bdca4d6a018b578e/abaaaabba;
      // 0a8: getstatic qeaa361f143ee4a0894bd168fd9b30c66/qf4ccf8f5435d4a78bdca4d6a018b578e/abaaaabba.ba Lqeaa361f143ee4a0894bd168fd9b30c66/qf4ccf8f5435d4a78bdca4d6a018b578e/abaaaabba;
      // 0ab: if_acmpne 0f0
      // 0ae: goto 0b2
      // 0b1: athrow
      // 0b2: aload 6
      // 0b4: iload 2
      // 0b5: ifne 104
      // 0b8: goto 0bc
      // 0bb: athrow
      // 0bc: getfield qeaa361f143ee4a0894bd168fd9b30c66/qf4ccf8f5435d4a78bdca4d6a018b578e/ababbb.bb Ljava/lang/Object;
      // 0bf: instanceof net/minecraft/class_2851
      // 0c2: ifeq 0f0
      // 0c5: goto 0c9
      // 0c8: athrow
      // 0c9: iload 4
      // 0cb: iload 2
      // 0cc: ifne 0ee
      // 0cf: goto 0d3
      // 0d2: athrow
      // 0d3: ifeq 0ed
      // 0d6: goto 0da
      // 0d9: athrow
      // 0da: aload 6
      // 0dc: getfield qeaa361f143ee4a0894bd168fd9b30c66/qf4ccf8f5435d4a78bdca4d6a018b578e/ababbb.ab Lio/netty/channel/ChannelPromise;
      // 0df: invokeinterface io/netty/channel/ChannelPromise.trySuccess ()Z 1
      // 0e4: pop
      // 0e5: iload 2
      // 0e6: ifeq 025
      // 0e9: goto 0ed
      // 0ec: athrow
      // 0ed: bipush 1
      // 0ee: istore 4
      // 0f0: aload 5
      // 0f2: aload 6
      // 0f4: invokeinterface java/util/List.add (Ljava/lang/Object;)Z 2
      // 0f9: iload 2
      // 0fa: ifne 115
      // 0fd: pop
      // 0fe: aload 6
      // 100: goto 104
      // 103: athrow
      // 104: getfield qeaa361f143ee4a0894bd168fd9b30c66/qf4ccf8f5435d4a78bdca4d6a018b578e/ababbb.aa Lqeaa361f143ee4a0894bd168fd9b30c66/qf4ccf8f5435d4a78bdca4d6a018b578e/abaaaabba;
      // 107: getstatic qeaa361f143ee4a0894bd168fd9b30c66/qf4ccf8f5435d4a78bdca4d6a018b578e/abaaaabba.ba Lqeaa361f143ee4a0894bd168fd9b30c66/qf4ccf8f5435d4a78bdca4d6a018b578e/abaaaabba;
      // 10a: if_acmpne 025
      // 10d: aload 6
      // 10f: getfield qeaa361f143ee4a0894bd168fd9b30c66/qf4ccf8f5435d4a78bdca4d6a018b578e/ababbb.bb Ljava/lang/Object;
      // 112: instanceof net/minecraft/class_9836
      // 115: iload 2
      // 116: ifne 026
      // 119: ifeq 025
      // 11c: goto 11f
      // 11f: bipush 0
      // 120: istore 7
      // 122: aload 5
      // 124: invokeinterface java/util/List.iterator ()Ljava/util/Iterator; 1
      // 129: astore 8
      // 12b: aload 8
      // 12d: invokeinterface java/util/Iterator.hasNext ()Z 1
      // 132: ifeq 15d
      // 135: aload 8
      // 137: invokeinterface java/util/Iterator.next ()Ljava/lang/Object; 1
      // 13c: checkcast qeaa361f143ee4a0894bd168fd9b30c66/qf4ccf8f5435d4a78bdca4d6a018b578e/ababbb
      // 13f: astore 9
      // 141: iload 7
      // 143: iload 2
      // 144: ifne 15f
      // 147: aload 0
      // 148: aload 1
      // 149: aload 9
      // 14b: getfield qeaa361f143ee4a0894bd168fd9b30c66/qf4ccf8f5435d4a78bdca4d6a018b578e/ababbb.bb Ljava/lang/Object;
      // 14e: aload 9
      // 150: getfield qeaa361f143ee4a0894bd168fd9b30c66/qf4ccf8f5435d4a78bdca4d6a018b578e/ababbb.ab Lio/netty/channel/ChannelPromise;
      // 153: invokevirtual qeaa361f143ee4a0894bd168fd9b30c66/qf4ccf8f5435d4a78bdca4d6a018b578e/aabaaa.abbaabb (Lio/netty/channel/ChannelHandlerContext;Ljava/lang/Object;Lio/netty/channel/ChannelPromise;)Z
      // 156: ior
      // 157: istore 7
      // 159: iload 2
      // 15a: ifeq 12b
      // 15d: iload 7
      // 15f: ireturn
   }

   private boolean abaabba(Object param1) {
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
      // 05: instanceof net/minecraft/class_2596
      // 08: iload 2
      // 09: ifne 21
      // 0c: ifeq 1c
      // 0f: goto 13
      // 12: athrow
      // 13: aload 1
      // 14: checkcast net/minecraft/class_2596
      // 17: astore 3
      // 18: iload 2
      // 19: ifeq 22
      // 1c: bipush 0
      // 1d: goto 21
      // 20: athrow
      // 21: ireturn
      // 22: invokestatic qeaa361f143ee4a0894bd168fd9b30c66/qf4ccf8f5435d4a78bdca4d6a018b578e/abbabbaa.abb ()Lqeaa361f143ee4a0894bd168fd9b30c66/qf4ccf8f5435d4a78bdca4d6a018b578e/abbabbaa;
      // 25: astore 4
      // 27: aload 4
      // 29: invokevirtual qeaa361f143ee4a0894bd168fd9b30c66/qf4ccf8f5435d4a78bdca4d6a018b578e/abbabbaa.aaab ()Z
      // 2c: iload 2
      // 2d: ifne 75
      // 30: ifeq 74
      // 33: goto 37
      // 36: athrow
      // 37: aload 4
      // 39: invokevirtual qeaa361f143ee4a0894bd168fd9b30c66/qf4ccf8f5435d4a78bdca4d6a018b578e/abbabbaa.bb ()Z
      // 3c: iload 2
      // 3d: ifne 75
      // 40: goto 44
      // 43: athrow
      // 44: ifeq 74
      // 47: goto 4b
      // 4a: athrow
      // 4b: aload 4
      // 4d: invokevirtual qeaa361f143ee4a0894bd168fd9b30c66/qf4ccf8f5435d4a78bdca4d6a018b578e/abbabbaa.baab ()Z
      // 50: iload 2
      // 51: ifne 75
      // 54: goto 58
      // 57: athrow
      // 58: ifeq 74
      // 5b: goto 5f
      // 5e: athrow
      // 5f: aload 3
      // 60: invokeinterface net/minecraft/class_2596.method_55943 ()Z 1
      // 65: iload 2
      // 66: ifne 7b
      // 69: goto 6d
      // 6c: athrow
      // 6d: ifeq 76
      // 70: goto 74
      // 73: athrow
      // 74: bipush 0
      // 75: ireturn
      // 76: aload 4
      // 78: invokevirtual qeaa361f143ee4a0894bd168fd9b30c66/qf4ccf8f5435d4a78bdca4d6a018b578e/abbabbaa.abbbb ()Z
      // 7b: iload 2
      // 7c: ifne 9a
      // 7f: ifeq 99
      // 82: goto 86
      // 85: athrow
      // 86: aload 3
      // 87: invokestatic qeaa361f143ee4a0894bd168fd9b30c66/qf4ccf8f5435d4a78bdca4d6a018b578e/aabaaa.aaabbba (Lnet/minecraft/class_2596;)Z
      // 8a: iload 2
      // 8b: ifne 9a
      // 8e: goto 92
      // 91: athrow
      // 92: ifeq 9d
      // 95: goto 99
      // 98: athrow
      // 99: bipush 1
      // 9a: goto 9e
      // 9d: bipush 0
      // 9e: ireturn
   }

   private class_2828 abaabbb(class_2828 param1) {
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
      // 006: ifne 017
      // 009: invokevirtual net/minecraft/class_2828.method_36172 ()Z
      // 00c: ifne 016
      // 00f: goto 013
      // 012: athrow
      // 013: aload 1
      // 014: areturn
      // 015: athrow
      // 016: aload 1
      // 017: ldc_w NaN
      // 01a: invokevirtual net/minecraft/class_2828.method_12271 (F)F
      // 01d: fstore 3
      // 01e: aload 1
      // 01f: ldc_w NaN
      // 022: invokevirtual net/minecraft/class_2828.method_12270 (F)F
      // 025: fstore 4
      // 027: fload 3
      // 028: iload 2
      // 029: ifne 083
      // 02c: invokestatic java/lang/Float.isFinite (F)Z
      // 02f: ifeq 082
      // 032: goto 036
      // 035: athrow
      // 036: fload 4
      // 038: iload 2
      // 039: ifne 083
      // 03c: goto 040
      // 03f: athrow
      // 040: invokestatic java/lang/Float.isFinite (F)Z
      // 043: ifeq 082
      // 046: goto 04a
      // 049: athrow
      // 04a: fload 4
      // 04c: iload 2
      // 04d: ifne 083
      // 050: goto 054
      // 053: athrow
      // 054: ldc_w -90.0
      // 057: fcmpl
      // 058: iflt 082
      // 05b: goto 05f
      // 05e: athrow
      // 05f: fload 4
      // 061: iload 2
      // 062: ifne 083
      // 065: goto 069
      // 068: athrow
      // 069: ldc_w 90.0
      // 06c: fcmpg
      // 06d: ifgt 082
      // 070: goto 074
      // 073: athrow
      // 074: aload 0
      // 075: fload 3
      // 076: putfield qeaa361f143ee4a0894bd168fd9b30c66/qf4ccf8f5435d4a78bdca4d6a018b578e/aabaaa.abaaab F
      // 079: aload 0
      // 07a: fload 4
      // 07c: putfield qeaa361f143ee4a0894bd168fd9b30c66/qf4ccf8f5435d4a78bdca4d6a018b578e/aabaaa.bbba F
      // 07f: aload 1
      // 080: areturn
      // 081: athrow
      // 082: fload 3
      // 083: iload 2
      // 084: ifne 096
      // 087: invokestatic java/lang/Float.isFinite (F)Z
      // 08a: ifeq 099
      // 08d: goto 091
      // 090: athrow
      // 091: fload 3
      // 092: goto 096
      // 095: athrow
      // 096: goto 09d
      // 099: aload 0
      // 09a: getfield qeaa361f143ee4a0894bd168fd9b30c66/qf4ccf8f5435d4a78bdca4d6a018b578e/aabaaa.abaaab F
      // 09d: fstore 5
      // 09f: fload 4
      // 0a1: iload 2
      // 0a2: ifne 0c1
      // 0a5: invokestatic java/lang/Float.isFinite (F)Z
      // 0a8: ifeq 0c4
      // 0ab: goto 0af
      // 0ae: athrow
      // 0af: ldc_w -90.0
      // 0b2: ldc_w 90.0
      // 0b5: fload 4
      // 0b7: invokestatic java/lang/Math.min (FF)F
      // 0ba: invokestatic java/lang/Math.max (FF)F
      // 0bd: goto 0c1
      // 0c0: athrow
      // 0c1: goto 0c8
      // 0c4: aload 0
      // 0c5: getfield qeaa361f143ee4a0894bd168fd9b30c66/qf4ccf8f5435d4a78bdca4d6a018b578e/aabaaa.bbba F
      // 0c8: fstore 6
      // 0ca: aload 0
      // 0cb: fload 5
      // 0cd: putfield qeaa361f143ee4a0894bd168fd9b30c66/qf4ccf8f5435d4a78bdca4d6a018b578e/aabaaa.abaaab F
      // 0d0: aload 0
      // 0d1: fload 6
      // 0d3: putfield qeaa361f143ee4a0894bd168fd9b30c66/qf4ccf8f5435d4a78bdca4d6a018b578e/aabaaa.bbba F
      // 0d6: aload 1
      // 0d7: invokevirtual net/minecraft/class_2828.method_36171 ()Z
      // 0da: ifeq 101
      // 0dd: new net/minecraft/class_2828$class_2830
      // 0e0: dup
      // 0e1: aload 1
      // 0e2: dconst_0
      // 0e3: invokevirtual net/minecraft/class_2828.method_12269 (D)D
      // 0e6: aload 1
      // 0e7: dconst_0
      // 0e8: invokevirtual net/minecraft/class_2828.method_12268 (D)D
      // 0eb: aload 1
      // 0ec: dconst_0
      // 0ed: invokevirtual net/minecraft/class_2828.method_12274 (D)D
      // 0f0: fload 5
      // 0f2: fload 6
      // 0f4: aload 1
      // 0f5: invokevirtual net/minecraft/class_2828.method_12273 ()Z
      // 0f8: aload 1
      // 0f9: invokevirtual net/minecraft/class_2828.method_61225 ()Z
      // 0fc: invokespecial net/minecraft/class_2828$class_2830.<init> (DDDFFZZ)V
      // 0ff: areturn
      // 100: athrow
      // 101: new net/minecraft/class_2828$class_2831
      // 104: dup
      // 105: fload 5
      // 107: fload 6
      // 109: aload 1
      // 10a: invokevirtual net/minecraft/class_2828.method_12273 ()Z
      // 10d: aload 1
      // 10e: invokevirtual net/minecraft/class_2828.method_61225 ()Z
      // 111: invokespecial net/minecraft/class_2828$class_2831.<init> (FFZZ)V
      // 114: areturn
   }

   private void ababaaa(ChannelHandlerContext var1) {
      this.bbabb(var1);
   }

   public static void ababaab(class_2596 param0) {
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
      // 0a: getstatic qeaa361f143ee4a0894bd168fd9b30c66/qf4ccf8f5435d4a78bdca4d6a018b578e/aabaaa.babbb Ljava/util/Set;
      // 0d: iload 1
      // 0e: ifne 3f
      // 11: invokeinterface java/util/Set.size ()I 1
      // 16: ldc_w -522994579
      // 19: ldc_w 1331039554
      // 1c: ldc_w 1418812843
      // 1f: ixor
      // 20: invokestatic qeaa361f143ee4a0894bd168fd9b30c66/qf4ccf8f5435d4a78bdca4d6a018b578e/aabaaa.baaaaab (II)I
      // 23: ldc2_w 7923008871455335008
      // 26: invokestatic qeaa361f143ee4a0894bd168fd9b30c66/qf4ccf8f5435d4a78bdca4d6a018b578e/aabaaa.abbbbab (IJ)I
      // 29: if_icmplt 3c
      // 2c: goto 30
      // 2f: athrow
      // 30: getstatic qeaa361f143ee4a0894bd168fd9b30c66/qf4ccf8f5435d4a78bdca4d6a018b578e/aabaaa.babbb Ljava/util/Set;
      // 33: invokeinterface java/util/Set.clear ()V 1
      // 38: goto 3c
      // 3b: athrow
      // 3c: getstatic qeaa361f143ee4a0894bd168fd9b30c66/qf4ccf8f5435d4a78bdca4d6a018b578e/aabaaa.babbb Ljava/util/Set;
      // 3f: new qeaa361f143ee4a0894bd168fd9b30c66/qf4ccf8f5435d4a78bdca4d6a018b578e/baaa
      // 42: dup
      // 43: aload 0
      // 44: invokespecial qeaa361f143ee4a0894bd168fd9b30c66/qf4ccf8f5435d4a78bdca4d6a018b578e/baaa.<init> (Lnet/minecraft/class_2596;)V
      // 47: invokeinterface java/util/Set.add (Ljava/lang/Object;)Z 2
      // 4c: pop
      // 4d: return
   }

   public static void abababa(long param0) {
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
      // 05: lconst_0
      // 06: lload 0
      // 07: ldc_w -522994580
      // 0a: ldc_w -325894824
      // 0d: ldc_w -1582010234
      // 10: ixor
      // 11: invokestatic qeaa361f143ee4a0894bd168fd9b30c66/qf4ccf8f5435d4a78bdca4d6a018b578e/aabaaa.baaaaab (II)I
      // 14: ldc2_w 6412079310953113141
      // 17: invokestatic qeaa361f143ee4a0894bd168fd9b30c66/qf4ccf8f5435d4a78bdca4d6a018b578e/aabaaa.aaa (IJ)J
      // 1a: invokestatic java/lang/Math.min (JJ)J
      // 1d: invokestatic java/lang/Math.max (JJ)J
      // 20: lstore 3
      // 21: ifne 39
      // 24: getstatic qeaa361f143ee4a0894bd168fd9b30c66/qf4ccf8f5435d4a78bdca4d6a018b578e/aabaaa.abbbb J
      // 27: lload 3
      // 28: lcmp
      // 29: ifne 32
      // 2c: goto 30
      // 2f: athrow
      // 30: return
      // 31: athrow
      // 32: lload 3
      // 33: putstatic qeaa361f143ee4a0894bd168fd9b30c66/qf4ccf8f5435d4a78bdca4d6a018b578e/aabaaa.abbbb J
      // 36: invokestatic qeaa361f143ee4a0894bd168fd9b30c66/qf4ccf8f5435d4a78bdca4d6a018b578e/aabaaa.aababab ()V
      // 39: return
   }

   private long abababb(Object param1) {
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
      // 09: instanceof net/minecraft/class_2596
      // 0c: ifeq 20
      // 0f: goto 13
      // 12: athrow
      // 13: aload 1
      // 14: goto 18
      // 17: athrow
      // 18: checkcast net/minecraft/class_2596
      // 1b: astore 3
      // 1c: iload 2
      // 1d: ifeq 23
      // 20: lconst_0
      // 21: lreturn
      // 22: athrow
      // 23: invokestatic qeaa361f143ee4a0894bd168fd9b30c66/qf4ccf8f5435d4a78bdca4d6a018b578e/abbabbaa.abb ()Lqeaa361f143ee4a0894bd168fd9b30c66/qf4ccf8f5435d4a78bdca4d6a018b578e/abbabbaa;
      // 26: astore 4
      // 28: aload 4
      // 2a: iload 2
      // 2b: ifne 3e
      // 2e: invokevirtual qeaa361f143ee4a0894bd168fd9b30c66/qf4ccf8f5435d4a78bdca4d6a018b578e/abbabbaa.aaab ()Z
      // 31: ifeq 59
      // 34: goto 38
      // 37: athrow
      // 38: aload 4
      // 3a: goto 3e
      // 3d: athrow
      // 3e: invokevirtual qeaa361f143ee4a0894bd168fd9b30c66/qf4ccf8f5435d4a78bdca4d6a018b578e/abbabbaa.baab ()Z
      // 41: iload 2
      // 42: ifne 56
      // 45: ifeq 59
      // 48: goto 4c
      // 4b: athrow
      // 4c: aload 3
      // 4d: invokeinterface net/minecraft/class_2596.method_55943 ()Z 1
      // 52: goto 56
      // 55: athrow
      // 56: ifeq 5c
      // 59: lconst_0
      // 5a: lreturn
      // 5b: athrow
      // 5c: lconst_0
      // 5d: aload 4
      // 5f: invokevirtual qeaa361f143ee4a0894bd168fd9b30c66/qf4ccf8f5435d4a78bdca4d6a018b578e/abbabbaa.aabbb ()J
      // 62: invokestatic java/lang/Math.max (JJ)J
      // 65: lreturn
   }

   private void ababbaa(long param1, abaaaabba param3) {
      // $VF: Couldn't be decompiled
      // Please report this to the Vineflower issue tracker, at https://github.com/Vineflower/vineflower/issues with a copy of the class file (if you have the rights to distribute it!)
      // java.lang.RuntimeException: parsing failure!
      //   at org.jetbrains.java.decompiler.modules.decompiler.decompose.DomHelper.parseGraph(DomHelper.java:211)
      //   at org.jetbrains.java.decompiler.main.rels.MethodProcessor.codeToJava(MethodProcessor.java:166)
      //
      // Bytecode:
      // 00: getstatic qeaa361f143ee4a0894bd168fd9b30c66/qf4ccf8f5435d4a78bdca4d6a018b578e/baaabbaa.bba I
      // 03: aload 0
      // 04: getfield qeaa361f143ee4a0894bd168fd9b30c66/qf4ccf8f5435d4a78bdca4d6a018b578e/aabaaa.ba Lio/netty/channel/ChannelHandlerContext;
      // 07: astore 5
      // 09: istore 4
      // 0b: aload 5
      // 0d: ifnull 27
      // 10: aload 0
      // 11: iload 4
      // 13: ifne 2a
      // 16: goto 1a
      // 19: athrow
      // 1a: getfield qeaa361f143ee4a0894bd168fd9b30c66/qf4ccf8f5435d4a78bdca4d6a018b578e/aabaaa.bb Ljava/util/concurrent/ConcurrentLinkedQueue;
      // 1d: invokevirtual java/util/concurrent/ConcurrentLinkedQueue.isEmpty ()Z
      // 20: ifeq 29
      // 23: goto 27
      // 26: athrow
      // 27: return
      // 28: athrow
      // 29: aload 0
      // 2a: aload 5
      // 2c: lload 1
      // 2d: aload 3
      // 2e: lconst_0
      // 2f: invokevirtual qeaa361f143ee4a0894bd168fd9b30c66/qf4ccf8f5435d4a78bdca4d6a018b578e/aabaaa.abaabaa (Lio/netty/channel/ChannelHandlerContext;JLqeaa361f143ee4a0894bd168fd9b30c66/qf4ccf8f5435d4a78bdca4d6a018b578e/abaaaabba;J)V
      // 32: return
   }

   private void ababbab(ChannelHandlerContext param1) {
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
      // 06: ifne 20
      // 09: getfield qeaa361f143ee4a0894bd168fd9b30c66/qf4ccf8f5435d4a78bdca4d6a018b578e/aabaaa.bbb Ljava/util/concurrent/ConcurrentLinkedQueue;
      // 0c: invokevirtual java/util/concurrent/ConcurrentLinkedQueue.isEmpty ()Z
      // 0f: ifne 1f
      // 12: goto 16
      // 15: athrow
      // 16: aload 0
      // 17: aload 1
      // 18: invokevirtual qeaa361f143ee4a0894bd168fd9b30c66/qf4ccf8f5435d4a78bdca4d6a018b578e/aabaaa.bbbbbb (Lio/netty/channel/ChannelHandlerContext;)V
      // 1b: goto 1f
      // 1e: athrow
      // 1f: aload 0
      // 20: invokevirtual qeaa361f143ee4a0894bd168fd9b30c66/qf4ccf8f5435d4a78bdca4d6a018b578e/aabaaa.bb ()V
      // 23: goto 40
      // 26: astore 3
      // 27: aload 0
      // 28: aload 0
      // 29: getfield qeaa361f143ee4a0894bd168fd9b30c66/qf4ccf8f5435d4a78bdca4d6a018b578e/aabaaa.bbb Ljava/util/concurrent/ConcurrentLinkedQueue;
      // 2c: aload 3
      // 2d: invokevirtual qeaa361f143ee4a0894bd168fd9b30c66/qf4ccf8f5435d4a78bdca4d6a018b578e/aabaaa.baabaa (Ljava/util/concurrent/ConcurrentLinkedQueue;Ljava/lang/Throwable;)V
      // 30: aload 0
      // 31: invokevirtual qeaa361f143ee4a0894bd168fd9b30c66/qf4ccf8f5435d4a78bdca4d6a018b578e/aabaaa.bb ()V
      // 34: goto 40
      // 37: astore 4
      // 39: aload 0
      // 3a: invokevirtual qeaa361f143ee4a0894bd168fd9b30c66/qf4ccf8f5435d4a78bdca4d6a018b578e/aabaaa.bb ()V
      // 3d: aload 4
      // 3f: athrow
      // 40: return
   }

   private static void ababbba() {
      synchronized (baba) {
         aaabaa = false;
         abaab = null;
         abaaa = null;
         aaaaba = null;
         baabb = abaaaabba.aa;
         baaba = false;
      }
   }

   private long ababbbb(long param1, long param3) {
      // $VF: Couldn't be decompiled
      // Please report this to the Vineflower issue tracker, at https://github.com/Vineflower/vineflower/issues with a copy of the class file (if you have the rights to distribute it!)
      // java.lang.RuntimeException: parsing failure!
      //   at org.jetbrains.java.decompiler.modules.decompiler.decompose.DomHelper.parseGraph(DomHelper.java:211)
      //   at org.jetbrains.java.decompiler.main.rels.MethodProcessor.codeToJava(MethodProcessor.java:166)
      //
      // Bytecode:
      // 00: getstatic qeaa361f143ee4a0894bd168fd9b30c66/qf4ccf8f5435d4a78bdca4d6a018b578e/baaabbaa.bba I
      // 03: istore 5
      // 05: lload 3
      // 06: iload 5
      // 08: ifne 24
      // 0b: lconst_0
      // 0c: lcmp
      // 0d: ifgt 17
      // 10: goto 14
      // 13: athrow
      // 14: lconst_0
      // 15: lreturn
      // 16: athrow
      // 17: lload 1
      // 18: getstatic java/util/concurrent/TimeUnit.MILLISECONDS Ljava/util/concurrent/TimeUnit;
      // 1b: lload 3
      // 1c: invokevirtual java/util/concurrent/TimeUnit.toNanos (J)J
      // 1f: ladd
      // 20: invokestatic java/lang/System.nanoTime ()J
      // 23: lsub
      // 24: lreturn
   }

   public void handlerRemoved(ChannelHandlerContext param1) {
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
      // 05: aload 0
      // 06: aconst_null
      // 07: putfield qeaa361f143ee4a0894bd168fd9b30c66/qf4ccf8f5435d4a78bdca4d6a018b578e/aabaaa.ba Lio/netty/channel/ChannelHandlerContext;
      // 0a: ifne 31
      // 0d: getstatic qeaa361f143ee4a0894bd168fd9b30c66/qf4ccf8f5435d4a78bdca4d6a018b578e/aabaaa.abba Ljava/util/Set;
      // 10: aload 0
      // 11: invokeinterface java/util/Set.remove (Ljava/lang/Object;)Z 2
      // 16: pop
      // 17: aload 0
      // 18: invokevirtual qeaa361f143ee4a0894bd168fd9b30c66/qf4ccf8f5435d4a78bdca4d6a018b578e/aabaaa.babbaa ()V
      // 1b: getstatic qeaa361f143ee4a0894bd168fd9b30c66/qf4ccf8f5435d4a78bdca4d6a018b578e/aabaaa.abba Ljava/util/Set;
      // 1e: invokeinterface java/util/Set.isEmpty ()Z 1
      // 23: ifeq 34
      // 26: goto 2a
      // 29: athrow
      // 2a: invokestatic qeaa361f143ee4a0894bd168fd9b30c66/qf4ccf8f5435d4a78bdca4d6a018b578e/aabaaa.ababbba ()V
      // 2d: goto 31
      // 30: athrow
      // 31: invokestatic qeaa361f143ee4a0894bd168fd9b30c66/qf4ccf8f5435d4a78bdca4d6a018b578e/aabaaa.babab ()V
      // 34: return
   }

   private long abbaaaa(Object param1) {
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
      // 09: instanceof net/minecraft/class_2596
      // 0c: ifeq 20
      // 0f: goto 13
      // 12: athrow
      // 13: aload 1
      // 14: goto 18
      // 17: athrow
      // 18: checkcast net/minecraft/class_2596
      // 1b: astore 3
      // 1c: iload 2
      // 1d: ifeq 23
      // 20: lconst_0
      // 21: lreturn
      // 22: athrow
      // 23: aload 3
      // 24: instanceof net/minecraft/class_2856
      // 27: ifeq 2d
      // 2a: lconst_0
      // 2b: lreturn
      // 2c: athrow
      // 2d: lconst_0
      // 2e: lstore 4
      // 30: invokestatic qeaa361f143ee4a0894bd168fd9b30c66/qf4ccf8f5435d4a78bdca4d6a018b578e/abbabbaa.abb ()Lqeaa361f143ee4a0894bd168fd9b30c66/qf4ccf8f5435d4a78bdca4d6a018b578e/abbabbaa;
      // 33: astore 6
      // 35: aload 6
      // 37: iload 2
      // 38: ifne 4b
      // 3b: invokevirtual qeaa361f143ee4a0894bd168fd9b30c66/qf4ccf8f5435d4a78bdca4d6a018b578e/abbabbaa.aaab ()Z
      // 3e: ifeq 72
      // 41: goto 45
      // 44: athrow
      // 45: aload 6
      // 47: goto 4b
      // 4a: athrow
      // 4b: invokevirtual qeaa361f143ee4a0894bd168fd9b30c66/qf4ccf8f5435d4a78bdca4d6a018b578e/abbabbaa.aabab ()Z
      // 4e: iload 2
      // 4f: ifne 63
      // 52: ifeq 72
      // 55: goto 59
      // 58: athrow
      // 59: aload 3
      // 5a: invokeinterface net/minecraft/class_2596.method_55943 ()Z 1
      // 5f: goto 63
      // 62: athrow
      // 63: ifne 72
      // 66: lload 4
      // 68: aload 6
      // 6a: invokevirtual qeaa361f143ee4a0894bd168fd9b30c66/qf4ccf8f5435d4a78bdca4d6a018b578e/abbabbaa.baaab ()J
      // 6d: invokestatic java/lang/Math.max (JJ)J
      // 70: lstore 4
      // 72: aload 0
      // 73: invokevirtual qeaa361f143ee4a0894bd168fd9b30c66/qf4ccf8f5435d4a78bdca4d6a018b578e/aabaaa.aabbb ()Lqeaa361f143ee4a0894bd168fd9b30c66/qf4ccf8f5435d4a78bdca4d6a018b578e/baa;
      // 76: astore 7
      // 78: aload 3
      // 79: instanceof net/minecraft/class_2827
      // 7c: ifeq 94
      // 7f: aload 7
      // 81: ifnull 94
      // 84: goto 88
      // 87: athrow
      // 88: lload 4
      // 8a: aload 7
      // 8c: invokevirtual qeaa361f143ee4a0894bd168fd9b30c66/qf4ccf8f5435d4a78bdca4d6a018b578e/baa.abba ()J
      // 8f: invokestatic java/lang/Math.max (JJ)J
      // 92: lstore 4
      // 94: lload 4
      // 96: lreturn
   }

   private boolean abbaaab(abbbbbab param1) {
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
      // 05: getfield qeaa361f143ee4a0894bd168fd9b30c66/qf4ccf8f5435d4a78bdca4d6a018b578e/aabaaa.aaa Ljava/util/concurrent/ConcurrentLinkedQueue;
      // 08: iload 2
      // 09: ifne 30
      // 0c: invokevirtual java/util/concurrent/ConcurrentLinkedQueue.size ()I
      // 0f: ldc_w -522994577
      // 12: ldc_w 1085020049
      // 15: ldc_w 1264978189
      // 18: ixor
      // 19: invokestatic qeaa361f143ee4a0894bd168fd9b30c66/qf4ccf8f5435d4a78bdca4d6a018b578e/aabaaa.baaaaab (II)I
      // 1c: ldc2_w 7245071914008995156
      // 1f: invokestatic qeaa361f143ee4a0894bd168fd9b30c66/qf4ccf8f5435d4a78bdca4d6a018b578e/aabaaa.abbbbab (IJ)I
      // 22: if_icmplt 2c
      // 25: goto 29
      // 28: athrow
      // 29: bipush 0
      // 2a: ireturn
      // 2b: athrow
      // 2c: aload 0
      // 2d: getfield qeaa361f143ee4a0894bd168fd9b30c66/qf4ccf8f5435d4a78bdca4d6a018b578e/aabaaa.aaa Ljava/util/concurrent/ConcurrentLinkedQueue;
      // 30: aload 1
      // 31: invokevirtual java/util/concurrent/ConcurrentLinkedQueue.offer (Ljava/lang/Object;)Z
      // 34: pop
      // 35: bipush 1
      // 36: ireturn
   }

   private static class_2828 abbaaba(class_2828 var0) {
      try {
         if (var0.method_36171()) {
            return new class_2829(var0.method_12269(0.0), var0.method_12268(0.0), var0.method_12274(0.0), var0.method_12273(), var0.method_61225());
         }
      } catch (CancellationException var1) {
         throw var1;
      }

      return new class_5911(var0.method_12273(), var0.method_61225());
   }

   private boolean abbaabb(ChannelHandlerContext param1, Object param2, ChannelPromise param3) {
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
      // 005: aload 1
      // 006: iload 4
      // 008: ifne 013
      // 00b: ifnull 029
      // 00e: goto 012
      // 011: athrow
      // 012: aload 1
      // 013: invokeinterface io/netty/channel/ChannelHandlerContext.channel ()Lio/netty/channel/Channel; 1
      // 018: iload 4
      // 01a: ifne 03b
      // 01d: invokeinterface io/netty/channel/Channel.isOpen ()Z 1
      // 022: ifne 03a
      // 025: goto 029
      // 028: athrow
      // 029: aload 3
      // 02a: new java/nio/channels/ClosedChannelException
      // 02d: dup
      // 02e: invokespecial java/nio/channels/ClosedChannelException.<init> ()V
      // 031: invokeinterface io/netty/channel/ChannelPromise.tryFailure (Ljava/lang/Throwable;)Z 2
      // 036: pop
      // 037: bipush 0
      // 038: ireturn
      // 039: athrow
      // 03a: aload 2
      // 03b: iload 4
      // 03d: ifne 082
      // 040: instanceof net/minecraft/class_2886
      // 043: ifeq 081
      // 046: goto 04a
      // 049: athrow
      // 04a: aload 2
      // 04b: checkcast net/minecraft/class_2886
      // 04e: astore 5
      // 050: aload 5
      // 052: invokestatic qeaa361f143ee4a0894bd168fd9b30c66/qf4ccf8f5435d4a78bdca4d6a018b578e/aabaaa.babba (Lnet/minecraft/class_2886;)Lnet/minecraft/class_2886;
      // 055: astore 6
      // 057: getstatic qeaa361f143ee4a0894bd168fd9b30c66/qf4ccf8f5435d4a78bdca4d6a018b578e/aabaaa.babba Ljava/util/concurrent/ConcurrentHashMap;
      // 05a: new qeaa361f143ee4a0894bd168fd9b30c66/qf4ccf8f5435d4a78bdca4d6a018b578e/baaa
      // 05d: dup
      // 05e: aload 6
      // 060: invokespecial qeaa361f143ee4a0894bd168fd9b30c66/qf4ccf8f5435d4a78bdca4d6a018b578e/baaa.<init> (Lnet/minecraft/class_2596;)V
      // 063: invokevirtual java/util/concurrent/ConcurrentHashMap.remove (Ljava/lang/Object;)Ljava/lang/Object;
      // 066: pop
      // 067: aload 6
      // 069: astore 2
      // 06a: aload 0
      // 06b: bipush 2
      // 06c: newarray 6
      // 06e: dup
      // 06f: bipush 0
      // 070: aload 6
      // 072: invokevirtual net/minecraft/class_2886.method_60586 ()F
      // 075: fastore
      // 076: dup
      // 077: bipush 1
      // 078: aload 6
      // 07a: invokevirtual net/minecraft/class_2886.method_60587 ()F
      // 07d: fastore
      // 07e: putfield qeaa361f143ee4a0894bd168fd9b30c66/qf4ccf8f5435d4a78bdca4d6a018b578e/aabaaa.bbaa [F
      // 081: aload 2
      // 082: iload 4
      // 084: ifne 0b2
      // 087: instanceof net/minecraft/class_2828
      // 08a: ifeq 0b1
      // 08d: goto 091
      // 090: athrow
      // 091: aload 2
      // 092: checkcast net/minecraft/class_2828
      // 095: astore 5
      // 097: iload 4
      // 099: aload 0
      // 09a: aload 0
      // 09b: aload 5
      // 09d: invokevirtual qeaa361f143ee4a0894bd168fd9b30c66/qf4ccf8f5435d4a78bdca4d6a018b578e/aabaaa.abaabbb (Lnet/minecraft/class_2828;)Lnet/minecraft/class_2828;
      // 0a0: invokevirtual qeaa361f143ee4a0894bd168fd9b30c66/qf4ccf8f5435d4a78bdca4d6a018b578e/aabaaa.bbabab (Lnet/minecraft/class_2828;)Lnet/minecraft/class_2828;
      // 0a3: astore 6
      // 0a5: aload 0
      // 0a6: aload 6
      // 0a8: invokevirtual qeaa361f143ee4a0894bd168fd9b30c66/qf4ccf8f5435d4a78bdca4d6a018b578e/aabaaa.abbabbb (Lnet/minecraft/class_2828;)V
      // 0ab: aload 6
      // 0ad: astore 2
      // 0ae: ifeq 0f1
      // 0b1: aload 2
      // 0b2: iload 4
      // 0b4: ifne 0d4
      // 0b7: instanceof net/minecraft/class_2793
      // 0ba: ifeq 0cf
      // 0bd: goto 0c1
      // 0c0: athrow
      // 0c1: aload 0
      // 0c2: bipush 1
      // 0c3: putfield qeaa361f143ee4a0894bd168fd9b30c66/qf4ccf8f5435d4a78bdca4d6a018b578e/aabaaa.aaabb Z
      // 0c6: iload 4
      // 0c8: ifeq 0f1
      // 0cb: goto 0cf
      // 0ce: athrow
      // 0cf: aload 2
      // 0d0: goto 0d4
      // 0d3: athrow
      // 0d4: iload 4
      // 0d6: ifne 0f2
      // 0d9: instanceof net/minecraft/class_9836
      // 0dc: ifeq 0f1
      // 0df: goto 0e3
      // 0e2: athrow
      // 0e3: aload 0
      // 0e4: aload 1
      // 0e5: invokevirtual qeaa361f143ee4a0894bd168fd9b30c66/qf4ccf8f5435d4a78bdca4d6a018b578e/aabaaa.bbbab (Lio/netty/channel/ChannelHandlerContext;)V
      // 0e8: aload 0
      // 0e9: bipush 0
      // 0ea: putfield qeaa361f143ee4a0894bd168fd9b30c66/qf4ccf8f5435d4a78bdca4d6a018b578e/aabaaa.abbaaa Z
      // 0ed: goto 0f1
      // 0f0: athrow
      // 0f1: aload 2
      // 0f2: iload 4
      // 0f4: ifne 134
      // 0f7: instanceof net/minecraft/class_2868
      // 0fa: ifeq 133
      // 0fd: goto 101
      // 100: athrow
      // 101: aload 2
      // 102: checkcast net/minecraft/class_2868
      // 105: astore 5
      // 107: iload 4
      // 109: aload 5
      // 10b: invokevirtual net/minecraft/class_2868.method_12442 ()I
      // 10e: istore 6
      // 110: ifne 12b
      // 113: iload 6
      // 115: aload 0
      // 116: getfield qeaa361f143ee4a0894bd168fd9b30c66/qf4ccf8f5435d4a78bdca4d6a018b578e/aabaaa.aaaaa I
      // 119: if_icmpne 12d
      // 11c: goto 120
      // 11f: athrow
      // 120: aload 3
      // 121: invokeinterface io/netty/channel/ChannelPromise.trySuccess ()Z 1
      // 126: pop
      // 127: goto 12b
      // 12a: athrow
      // 12b: bipush 1
      // 12c: ireturn
      // 12d: aload 0
      // 12e: iload 6
      // 130: putfield qeaa361f143ee4a0894bd168fd9b30c66/qf4ccf8f5435d4a78bdca4d6a018b578e/aabaaa.aaaaa I
      // 133: aload 2
      // 134: invokestatic qeaa361f143ee4a0894bd168fd9b30c66/qf4ccf8f5435d4a78bdca4d6a018b578e/abbaabaaa.aaab (Ljava/lang/Object;)V
      // 137: iload 4
      // 139: aload 3
      // 13a: astore 5
      // 13c: ifne 1c2
      // 13f: aload 2
      // 140: instanceof net/minecraft/class_2596
      // 143: ifeq 1b8
      // 146: goto 14a
      // 149: athrow
      // 14a: aload 2
      // 14b: checkcast net/minecraft/class_2596
      // 14e: astore 6
      // 150: aload 6
      // 152: instanceof net/minecraft/class_2935
      // 155: istore 7
      // 157: aload 6
      // 159: invokestatic qeaa361f143ee4a0894bd168fd9b30c66/qf4ccf8f5435d4a78bdca4d6a018b578e/aabaaa.aaabaaa (Lnet/minecraft/class_2596;)Z
      // 15c: istore 8
      // 15e: iload 7
      // 160: iload 4
      // 162: ifne 191
      // 165: ifne 17e
      // 168: goto 16c
      // 16b: athrow
      // 16c: iload 8
      // 16e: iload 4
      // 170: ifne 1c3
      // 173: goto 177
      // 176: athrow
      // 177: ifeq 1b8
      // 17a: goto 17e
      // 17d: athrow
      // 17e: aload 3
      // 17f: iload 4
      // 181: ifne 19e
      // 184: goto 188
      // 187: athrow
      // 188: invokeinterface io/netty/channel/ChannelPromise.isVoid ()Z 1
      // 18d: goto 191
      // 190: athrow
      // 191: ifeq 1a1
      // 194: aload 1
      // 195: invokeinterface io/netty/channel/ChannelHandlerContext.newPromise ()Lio/netty/channel/ChannelPromise; 1
      // 19a: goto 19e
      // 19d: athrow
      // 19e: goto 1a2
      // 1a1: aload 3
      // 1a2: astore 5
      // 1a4: aload 5
      // 1a6: aload 0
      // 1a7: iload 7
      // 1a9: aload 6
      // 1ab: iload 8
      // 1ad: invokedynamic operationComplete (Lqeaa361f143ee4a0894bd168fd9b30c66/qf4ccf8f5435d4a78bdca4d6a018b578e/aabaaa;ZLnet/minecraft/class_2596;Z)Lio/netty/util/concurrent/GenericFutureListener; bsm=java/lang/invoke/LambdaMetafactory.metafactory (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;Ljava/lang/invoke/MethodType;Ljava/lang/invoke/MethodHandle;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[ (Lio/netty/util/concurrent/Future;)V, qeaa361f143ee4a0894bd168fd9b30c66/qf4ccf8f5435d4a78bdca4d6a018b578e/aabaaa.baaaaa (ZLnet/minecraft/class_2596;ZLio/netty/util/concurrent/Future;)V, (Lio/netty/util/concurrent/Future;)V ]
      // 1b2: invokeinterface io/netty/channel/ChannelPromise.addListener (Lio/netty/util/concurrent/GenericFutureListener;)Lio/netty/channel/ChannelPromise; 2
      // 1b7: pop
      // 1b8: aload 1
      // 1b9: aload 2
      // 1ba: aload 5
      // 1bc: invokeinterface io/netty/channel/ChannelHandlerContext.write (Ljava/lang/Object;Lio/netty/channel/ChannelPromise;)Lio/netty/channel/ChannelFuture; 3
      // 1c1: pop
      // 1c2: bipush 1
      // 1c3: ireturn
      // 1c4: astore 6
      // 1c6: aload 5
      // 1c8: aload 6
      // 1ca: invokeinterface io/netty/channel/ChannelPromise.tryFailure (Ljava/lang/Throwable;)Z 2
      // 1cf: pop
      // 1d0: bipush 0
      // 1d1: ireturn
   }

   private static boolean abbabaa(class_2596 var0) {
      return false;
   }

   private void abbabab(ChannelHandlerContext var1) {
      this.baaaab(var1);
   }

   public static void abbabba(class_2596 param0) {
      // $VF: Couldn't be decompiled
      // Please report this to the Vineflower issue tracker, at https://github.com/Vineflower/vineflower/issues with a copy of the class file (if you have the rights to distribute it!)
      // java.lang.RuntimeException: parsing failure!
      //   at org.jetbrains.java.decompiler.modules.decompiler.decompose.DomHelper.parseGraph(DomHelper.java:211)
      //   at org.jetbrains.java.decompiler.main.rels.MethodProcessor.codeToJava(MethodProcessor.java:166)
      //
      // Bytecode:
      // 00: getstatic qeaa361f143ee4a0894bd168fd9b30c66/qf4ccf8f5435d4a78bdca4d6a018b578e/baaabbaa.bba I
      // 03: istore 1
      // 04: invokestatic qeaa361f143ee4a0894bd168fd9b30c66/qf4ccf8f5435d4a78bdca4d6a018b578e/abbabaa.aa ()Z
      // 07: iload 1
      // 08: ifne 16
      // 0b: ifeq 13
      // 0e: goto 12
      // 11: athrow
      // 12: return
      // 13: invokestatic qeaa361f143ee4a0894bd168fd9b30c66/qf4ccf8f5435d4a78bdca4d6a018b578e/aabbabbbb.bbabbaa ()Z
      // 16: iload 1
      // 17: ifne 29
      // 1a: ifeq 42
      // 1d: goto 21
      // 20: athrow
      // 21: aload 0
      // 22: invokestatic qeaa361f143ee4a0894bd168fd9b30c66/qf4ccf8f5435d4a78bdca4d6a018b578e/aabaaa.aaaaaa (Ljava/lang/Object;)Z
      // 25: goto 29
      // 28: athrow
      // 29: iload 1
      // 2a: ifne 3e
      // 2d: ifeq 42
      // 30: goto 34
      // 33: athrow
      // 34: invokestatic net/minecraft/class_310.method_1551 ()Lnet/minecraft/class_310;
      // 37: invokestatic qeaa361f143ee4a0894bd168fd9b30c66/qf4ccf8f5435d4a78bdca4d6a018b578e/aabbabbbb.ababbaa (Lnet/minecraft/class_310;)Z
      // 3a: goto 3e
      // 3d: athrow
      // 3e: ifne 42
      // 41: return
      // 42: invokestatic qeaa361f143ee4a0894bd168fd9b30c66/qf4ccf8f5435d4a78bdca4d6a018b578e/abaaaaaba.aaaaa ()Lqeaa361f143ee4a0894bd168fd9b30c66/qf4ccf8f5435d4a78bdca4d6a018b578e/abaaaaaba;
      // 45: ifnull 61
      // 48: aload 0
      // 49: invokestatic qeaa361f143ee4a0894bd168fd9b30c66/qf4ccf8f5435d4a78bdca4d6a018b578e/aabbabbbb.aaaaaba ()Z
      // 4c: invokestatic qeaa361f143ee4a0894bd168fd9b30c66/qf4ccf8f5435d4a78bdca4d6a018b578e/bbabbbb.aaabba ()Z
      // 4f: invokestatic qeaa361f143ee4a0894bd168fd9b30c66/qf4ccf8f5435d4a78bdca4d6a018b578e/aabaaa.bbbaab (Lnet/minecraft/class_2596;ZZ)Z
      // 52: iload 1
      // 53: ifne 70
      // 56: goto 5a
      // 59: athrow
      // 5a: ifne 62
      // 5d: goto 61
      // 60: athrow
      // 61: return
      // 62: getstatic qeaa361f143ee4a0894bd168fd9b30c66/qf4ccf8f5435d4a78bdca4d6a018b578e/aabaaa.aabaa Ljava/util/concurrent/ConcurrentHashMap;
      // 65: iload 1
      // 66: ifne a1
      // 69: invokevirtual java/util/concurrent/ConcurrentHashMap.size ()I
      // 6c: goto 70
      // 6f: athrow
      // 70: ldc_w -522994578
      // 73: ldc_w 1335114027
      // 76: ldc_w -597560626
      // 79: ixor
      // 7a: invokestatic qeaa361f143ee4a0894bd168fd9b30c66/qf4ccf8f5435d4a78bdca4d6a018b578e/aabaaa.baaaaab (II)I
      // 7d: ldc2_w 2609147041536196416
      // 80: invokestatic qeaa361f143ee4a0894bd168fd9b30c66/qf4ccf8f5435d4a78bdca4d6a018b578e/aabaaa.abbbbab (IJ)I
      // 83: if_icmplt 90
      // 86: getstatic qeaa361f143ee4a0894bd168fd9b30c66/qf4ccf8f5435d4a78bdca4d6a018b578e/aabaaa.aabaa Ljava/util/concurrent/ConcurrentHashMap;
      // 89: invokevirtual java/util/concurrent/ConcurrentHashMap.clear ()V
      // 8c: goto 90
      // 8f: athrow
      // 90: getstatic qeaa361f143ee4a0894bd168fd9b30c66/qf4ccf8f5435d4a78bdca4d6a018b578e/aabaaa.aabaa Ljava/util/concurrent/ConcurrentHashMap;
      // 93: new qeaa361f143ee4a0894bd168fd9b30c66/qf4ccf8f5435d4a78bdca4d6a018b578e/baaa
      // 96: dup
      // 97: aload 0
      // 98: invokespecial qeaa361f143ee4a0894bd168fd9b30c66/qf4ccf8f5435d4a78bdca4d6a018b578e/baaa.<init> (Lnet/minecraft/class_2596;)V
      // 9b: getstatic java/lang/Boolean.TRUE Ljava/lang/Boolean;
      // 9e: invokevirtual java/util/concurrent/ConcurrentHashMap.put (Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;
      // a1: pop
      // a2: bipush 1
      // a3: putstatic qeaa361f143ee4a0894bd168fd9b30c66/qf4ccf8f5435d4a78bdca4d6a018b578e/aabaaa.aaaaab Z
      // a6: return
   }

   private void abbabbb(class_2828 var1) {
      this.abbaaa = true;
      this.bbbb = var1.method_12273();
      this.b = var1.method_61225();
      this.abaaba = true;
   }

   public static void abbbaaa(class_2596 param0) {
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
      // 09: instanceof net/minecraft/class_2886
      // 0c: ifeq 20
      // 0f: goto 13
      // 12: athrow
      // 13: aload 0
      // 14: goto 18
      // 17: athrow
      // 18: checkcast net/minecraft/class_2886
      // 1b: astore 2
      // 1c: iload 1
      // 1d: ifeq 22
      // 20: return
      // 21: athrow
      // 22: invokestatic net/minecraft/class_310.method_1551 ()Lnet/minecraft/class_310;
      // 25: astore 3
      // 26: aload 3
      // 27: iload 1
      // 28: ifne 33
      // 2b: ifnull 39
      // 2e: goto 32
      // 31: athrow
      // 32: aload 3
      // 33: invokevirtual net/minecraft/class_310.method_18854 ()Z
      // 36: ifne 3b
      // 39: return
      // 3a: athrow
      // 3b: aload 2
      // 3c: aload 2
      // 3d: invokevirtual net/minecraft/class_2886.method_60586 ()F
      // 40: invokestatic qeaa361f143ee4a0894bd168fd9b30c66/qf4ccf8f5435d4a78bdca4d6a018b578e/bbabbbb.bbaab (F)F
      // 43: aload 2
      // 44: invokevirtual net/minecraft/class_2886.method_60587 ()F
      // 47: invokestatic qeaa361f143ee4a0894bd168fd9b30c66/qf4ccf8f5435d4a78bdca4d6a018b578e/bbabbbb.aaabbb (F)F
      // 4a: invokestatic qeaa361f143ee4a0894bd168fd9b30c66/qf4ccf8f5435d4a78bdca4d6a018b578e/aabaaa.baaabb (Lnet/minecraft/class_2886;FF)V
      // 4d: return
   }

   private void b(ChannelHandlerContext param1, long param2) {
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
      // 08: ifne 1d
      // 0b: getfield qeaa361f143ee4a0894bd168fd9b30c66/qf4ccf8f5435d4a78bdca4d6a018b578e/aabaaa.aaaabb Ljava/util/concurrent/atomic/AtomicBoolean;
      // 0e: bipush 0
      // 0f: bipush 1
      // 10: invokevirtual java/util/concurrent/atomic/AtomicBoolean.compareAndSet (ZZ)Z
      // 13: ifne 1c
      // 16: goto 1a
      // 19: athrow
      // 1a: return
      // 1b: athrow
      // 1c: aload 0
      // 1d: aload 1
      // 1e: invokedynamic run (Lqeaa361f143ee4a0894bd168fd9b30c66/qf4ccf8f5435d4a78bdca4d6a018b578e/aabaaa;Lio/netty/channel/ChannelHandlerContext;)Ljava/lang/Runnable; bsm=java/lang/invoke/LambdaMetafactory.metafactory (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;Ljava/lang/invoke/MethodType;Ljava/lang/invoke/MethodHandle;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[ ()V, qeaa361f143ee4a0894bd168fd9b30c66/qf4ccf8f5435d4a78bdca4d6a018b578e/aabaaa.ababaaa (Lio/netty/channel/ChannelHandlerContext;)V, ()V ]
      // 23: astore 5
      // 25: lload 2
      // 26: lconst_0
      // 27: lcmp
      // 28: iload 4
      // 2a: ifne 62
      // 2d: ifle 4e
      // 30: goto 34
      // 33: athrow
      // 34: aload 1
      // 35: invokeinterface io/netty/channel/ChannelHandlerContext.executor ()Lio/netty/util/concurrent/EventExecutor; 1
      // 3a: aload 5
      // 3c: lload 2
      // 3d: getstatic qeaa361f143ee4a0894bd168fd9b30c66/qf4ccf8f5435d4a78bdca4d6a018b578e/aabaaa.abaa J
      // 40: invokestatic java/lang/Math.max (JJ)J
      // 43: getstatic java/util/concurrent/TimeUnit.NANOSECONDS Ljava/util/concurrent/TimeUnit;
      // 46: invokeinterface io/netty/util/concurrent/EventExecutor.schedule (Ljava/lang/Runnable;JLjava/util/concurrent/TimeUnit;)Lio/netty/util/concurrent/ScheduledFuture; 5
      // 4b: pop
      // 4c: return
      // 4d: athrow
      // 4e: aload 1
      // 4f: iload 4
      // 51: ifne 7a
      // 54: invokeinterface io/netty/channel/ChannelHandlerContext.executor ()Lio/netty/util/concurrent/EventExecutor; 1
      // 59: invokeinterface io/netty/util/concurrent/EventExecutor.inEventLoop ()Z 1
      // 5e: goto 62
      // 61: athrow
      // 62: ifeq 75
      // 65: aload 5
      // 67: invokeinterface java/lang/Runnable.run ()V 1
      // 6c: iload 4
      // 6e: ifeq 86
      // 71: goto 75
      // 74: athrow
      // 75: aload 1
      // 76: goto 7a
      // 79: athrow
      // 7a: invokeinterface io/netty/channel/ChannelHandlerContext.executor ()Lio/netty/util/concurrent/EventExecutor; 1
      // 7f: aload 5
      // 81: invokeinterface io/netty/util/concurrent/EventExecutor.execute (Ljava/lang/Runnable;)V 2
      // 86: return
   }

   public static void abbbaab() {
      int var10000 = baaabbaa.bba;
      aabaab = false;
      int var0 = var10000;
      bbabb = false;

      for (aabaaa var2 : abba) {
         var2.babbb();
         if (var0 != 0) {
            break;
         }
      }
   }

   private static void abbbaba(ChannelHandlerContext param0, Object param1) {
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
      // 06: ifne 1f
      // 09: invokeinterface io/netty/channel/ChannelHandlerContext.channel ()Lio/netty/channel/Channel; 1
      // 0e: invokeinterface io/netty/channel/Channel.isOpen ()Z 1
      // 13: ifeq 2c
      // 16: goto 1a
      // 19: athrow
      // 1a: aload 0
      // 1b: goto 1f
      // 1e: athrow
      // 1f: aload 1
      // 20: aload 0
      // 21: invokeinterface io/netty/channel/ChannelHandlerContext.newPromise ()Lio/netty/channel/ChannelPromise; 1
      // 26: invokeinterface io/netty/channel/ChannelHandlerContext.writeAndFlush (Ljava/lang/Object;Lio/netty/channel/ChannelPromise;)Lio/netty/channel/ChannelFuture; 3
      // 2b: pop
      // 2c: return
   }

   private void abbbabb(class_2596 param1) {
      // $VF: Couldn't be decompiled
      // Please report this to the Vineflower issue tracker, at https://github.com/Vineflower/vineflower/issues with a copy of the class file (if you have the rights to distribute it!)
      // java.lang.RuntimeException: parsing failure!
      //   at org.jetbrains.java.decompiler.modules.decompiler.decompose.DomHelper.parseGraph(DomHelper.java:211)
      //   at org.jetbrains.java.decompiler.main.rels.MethodProcessor.codeToJava(MethodProcessor.java:166)
      //
      // Bytecode:
      // 00: getstatic qeaa361f143ee4a0894bd168fd9b30c66/qf4ccf8f5435d4a78bdca4d6a018b578e/baaabbaa.bba I
      // 03: aload 1
      // 04: invokedynamic run (Lnet/minecraft/class_2596;)Ljava/lang/Runnable; bsm=java/lang/invoke/LambdaMetafactory.metafactory (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;Ljava/lang/invoke/MethodType;Ljava/lang/invoke/MethodHandle;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[ ()V, qeaa361f143ee4a0894bd168fd9b30c66/qf4ccf8f5435d4a78bdca4d6a018b578e/aabaaa.aaabab (Lnet/minecraft/class_2596;)V, ()V ]
      // 09: astore 3
      // 0a: invokestatic net/minecraft/class_310.method_1551 ()Lnet/minecraft/class_310;
      // 0d: astore 4
      // 0f: istore 2
      // 10: aload 4
      // 12: iload 2
      // 13: ifne 1f
      // 16: ifnull 3b
      // 19: goto 1d
      // 1c: athrow
      // 1d: aload 4
      // 1f: iload 2
      // 20: ifne 33
      // 23: invokevirtual net/minecraft/class_310.method_18854 ()Z
      // 26: ifne 3b
      // 29: goto 2d
      // 2c: athrow
      // 2d: aload 4
      // 2f: goto 33
      // 32: athrow
      // 33: aload 3
      // 34: invokevirtual net/minecraft/class_310.execute (Ljava/lang/Runnable;)V
      // 37: iload 2
      // 38: ifeq 45
      // 3b: aload 3
      // 3c: invokeinterface java/lang/Runnable.run ()V 1
      // 41: goto 45
      // 44: athrow
      // 45: return
   }

   private void abbbbaa(ChannelHandlerContext var1) {
      this.bbba(var1, 0L);
   }

   private static int abbbbab(int var0, long var1) {
      int var3 = var0 ^ (int)(var1 & 32767L) ^ baaaaab(-522994583, 345489978 ^ -1427933363);
      if (ababa[var3] == null) {
         ababa[var3] = (int)(aaaa[var3] ^ var1);
      }

      return ababa[var3];
   }

   private long abbbbba(Object var1) {
      return 0L;
   }

   private ChannelPromise abbbbbb(ChannelHandlerContext param1, Object param2, ChannelPromise param3) {
      // $VF: Couldn't be decompiled
      // Please report this to the Vineflower issue tracker, at https://github.com/Vineflower/vineflower/issues with a copy of the class file (if you have the rights to distribute it!)
      // java.lang.RuntimeException: parsing failure!
      //   at org.jetbrains.java.decompiler.modules.decompiler.decompose.DomHelper.parseGraph(DomHelper.java:211)
      //   at org.jetbrains.java.decompiler.main.rels.MethodProcessor.codeToJava(MethodProcessor.java:166)
      //
      // Bytecode:
      // 00: getstatic qeaa361f143ee4a0894bd168fd9b30c66/qf4ccf8f5435d4a78bdca4d6a018b578e/baaabbaa.bba I
      // 03: istore 4
      // 05: aload 2
      // 06: iload 4
      // 08: ifne 1a
      // 0b: instanceof net/minecraft/class_2868
      // 0e: ifeq 24
      // 11: goto 15
      // 14: athrow
      // 15: aload 2
      // 16: goto 1a
      // 19: athrow
      // 1a: checkcast net/minecraft/class_2868
      // 1d: astore 5
      // 1f: iload 4
      // 21: ifeq 27
      // 24: aload 3
      // 25: areturn
      // 26: athrow
      // 27: aload 3
      // 28: iload 4
      // 2a: ifne 43
      // 2d: invokeinterface io/netty/channel/ChannelPromise.isVoid ()Z 1
      // 32: ifeq 46
      // 35: goto 39
      // 38: athrow
      // 39: aload 1
      // 3a: invokeinterface io/netty/channel/ChannelHandlerContext.newPromise ()Lio/netty/channel/ChannelPromise; 1
      // 3f: goto 43
      // 42: athrow
      // 43: goto 47
      // 46: aload 3
      // 47: astore 6
      // 49: aload 6
      // 4b: aload 5
      // 4d: invokedynamic operationComplete (Lnet/minecraft/class_2868;)Lio/netty/util/concurrent/GenericFutureListener; bsm=java/lang/invoke/LambdaMetafactory.metafactory (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;Ljava/lang/invoke/MethodType;Ljava/lang/invoke/MethodHandle;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[ (Lio/netty/util/concurrent/Future;)V, qeaa361f143ee4a0894bd168fd9b30c66/qf4ccf8f5435d4a78bdca4d6a018b578e/aabaaa.aaabbab (Lnet/minecraft/class_2868;Lio/netty/util/concurrent/Future;)V, (Lio/netty/util/concurrent/Future;)V ]
      // 52: invokeinterface io/netty/channel/ChannelPromise.addListener (Lio/netty/util/concurrent/GenericFutureListener;)Lio/netty/channel/ChannelPromise; 2
      // 57: pop
      // 58: aload 6
      // 5a: areturn
   }

   private static boolean a(class_2596 var0) {
      try {
         if (abaa(var0) != null) {
            return true;
         }
      } catch (CancellationException var1) {
         throw var1;
      }

      return false;
   }

   public static long baaaaaa() {
      return abbbb;
   }
}
