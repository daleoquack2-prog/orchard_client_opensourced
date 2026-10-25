package nsc;

import java.util.Map;
import java.util.Map.Entry;
import java.util.concurrent.ConcurrentHashMap;
import net.fabricmc.api.EnvType;
import net.fabricmc.api.Environment;
import net.minecraft.class_2596;
import net.minecraft.class_2923;
import net.minecraft.class_310;
import net.minecraft.class_634;

@Environment(EnvType.CLIENT)
public final class abbabbaa {
   private static final double aa = 25.0;
   private volatile int ab;
   private long ba;
   private static final long[] bb;
   private double aaa;
   private volatile bbaabaa aab = bbaabaa.a;
   private static final long aba;
   private int abb;
   private volatile boolean baa;
   private static final int bab;
   private volatile boolean bba;
   private final Map bbb;
   private static final int[] abaaa;
   private volatile boolean aaaa;
   private final int[] aaab;
   private static final double aaba = 0.07;
   private boolean aabb;
   private static final long abaa;
   private volatile boolean abab;
   private long abba;
   private static final abbabbaa abbb;
   private long a;
   private double baaa;
   private int baab;
   private static final Integer[] baba;
   private static final long[] babb;
   private static final int bbaa;
   private static final String[] bbab;
   private static final Object[] ababa;
   private volatile boolean bbba;
   private static final long bbbb;
   private volatile boolean aaaaa;
   private static final long aaaab;
   private aaaabbaa b;
   private static final int aaaba;
   private static final String[] abaab;
   private static final Long[] aaabb;
   private int aabaa;
   private long aabab;
   private static final String[] aabba;
   private static final long aabbb;

   static boolean aa(class_2596 param0) {
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
      // 14: invokestatic qeaa361f143ee4a0894bd168fd9b30c66/qf4ccf8f5435d4a78bdca4d6a018b578e/abbabbaa.aab (Lnet/minecraft/class_2596;)Z
      // 17: iload 1
      // 18: ifne 99
      // 1b: ifne 94
      // 1e: goto 22
      // 21: athrow
      // 22: aload 0
      // 23: instanceof net/minecraft/class_2670
      // 26: iload 1
      // 27: ifne 99
      // 2a: goto 2e
      // 2d: athrow
      // 2e: ifne 94
      // 31: goto 35
      // 34: athrow
      // 35: aload 0
      // 36: instanceof net/minecraft/class_6373
      // 39: iload 1
      // 3a: ifne 99
      // 3d: goto 41
      // 40: athrow
      // 41: ifne 94
      // 44: goto 48
      // 47: athrow
      // 48: aload 0
      // 49: instanceof net/minecraft/class_2923
      // 4c: iload 1
      // 4d: ifne 99
      // 50: goto 54
      // 53: athrow
      // 54: ifne 94
      // 57: goto 5b
      // 5a: athrow
      // 5b: aload 0
      // 5c: instanceof net/minecraft/class_7439
      // 5f: iload 1
      // 60: ifne 99
      // 63: goto 67
      // 66: athrow
      // 67: ifne 94
      // 6a: goto 6e
      // 6d: athrow
      // 6e: aload 0
      // 6f: instanceof net/minecraft/class_7827
      // 72: iload 1
      // 73: ifne 99
      // 76: goto 7a
      // 79: athrow
      // 7a: ifne 94
      // 7d: goto 81
      // 80: athrow
      // 81: aload 0
      // 82: iload 1
      // 83: ifne 9b
      // 86: goto 8a
      // 89: athrow
      // 8a: instanceof net/minecraft/class_7438
      // 8d: ifeq 9a
      // 90: goto 94
      // 93: athrow
      // 94: bipush 1
      // 95: goto 99
      // 98: athrow
      // 99: ireturn
      // 9a: aload 0
      // 9b: iload 1
      // 9c: ifne ed
      // 9f: instanceof net/minecraft/class_8038
      // a2: ifeq ec
      // a5: goto a9
      // a8: athrow
      // a9: aload 0
      // aa: checkcast net/minecraft/class_8038
      // ad: astore 2
      // ae: aload 2
      // af: invokevirtual net/minecraft/class_8038.method_48324 ()Ljava/lang/Iterable;
      // b2: invokeinterface java/lang/Iterable.iterator ()Ljava/util/Iterator; 1
      // b7: astore 3
      // b8: aload 3
      // b9: invokeinterface java/util/Iterator.hasNext ()Z 1
      // be: ifeq ea
      // c1: aload 3
      // c2: invokeinterface java/util/Iterator.next ()Ljava/lang/Object; 1
      // c7: checkcast net/minecraft/class_2596
      // ca: astore 4
      // cc: aload 4
      // ce: invokestatic qeaa361f143ee4a0894bd168fd9b30c66/qf4ccf8f5435d4a78bdca4d6a018b578e/abbabbaa.aa (Lnet/minecraft/class_2596;)Z
      // d1: iload 1
      // d2: ifne eb
      // d5: iload 1
      // d6: ifne e5
      // d9: goto dd
      // dc: athrow
      // dd: ifne e6
      // e0: goto e4
      // e3: athrow
      // e4: bipush 0
      // e5: ireturn
      // e6: iload 1
      // e7: ifeq b8
      // ea: bipush 1
      // eb: ireturn
      // ec: aload 0
      // ed: invokeinterface net/minecraft/class_2596.getClass ()Ljava/lang/Class; 1
      // f2: invokevirtual java/lang/Class.getName ()Ljava/lang/String;
      // f5: invokestatic qeaa361f143ee4a0894bd168fd9b30c66/qf4ccf8f5435d4a78bdca4d6a018b578e/abbabbaa.bbaa (Ljava/lang/String;)Z
      // f8: ireturn
   }

   private void ab(long param1) {
      // $VF: Couldn't be decompiled
      // Please report this to the Vineflower issue tracker, at https://github.com/Vineflower/vineflower/issues with a copy of the class file (if you have the rights to distribute it!)
      // java.lang.RuntimeException: parsing failure!
      //   at org.jetbrains.java.decompiler.modules.decompiler.decompose.DomHelper.parseGraph(DomHelper.java:211)
      //   at org.jetbrains.java.decompiler.main.rels.MethodProcessor.codeToJava(MethodProcessor.java:166)
      //
      // Bytecode:
      // 00: getstatic qeaa361f143ee4a0894bd168fd9b30c66/qf4ccf8f5435d4a78bdca4d6a018b578e/baaabbaa.bba I
      // 03: lload 1
      // 04: l2d
      // 05: aload 0
      // 06: getfield qeaa361f143ee4a0894bd168fd9b30c66/qf4ccf8f5435d4a78bdca4d6a018b578e/abbabbaa.aaa D
      // 09: dsub
      // 0a: dstore 4
      // 0c: istore 3
      // 0d: dload 4
      // 0f: invokestatic java/lang/Math.abs (D)D
      // 12: dstore 6
      // 14: dload 6
      // 16: ldc2_w 0.01
      // 19: iload 3
      // 1a: ifne 30
      // 1d: dcmpg
      // 1e: ifge 2d
      // 21: goto 25
      // 24: athrow
      // 25: aload 0
      // 26: lload 1
      // 27: l2d
      // 28: putfield qeaa361f143ee4a0894bd168fd9b30c66/qf4ccf8f5435d4a78bdca4d6a018b578e/abbabbaa.aaa D
      // 2b: return
      // 2c: athrow
      // 2d: dload 4
      // 2f: dconst_0
      // 30: dcmpg
      // 31: iload 3
      // 32: ifne 3d
      // 35: ifge 40
      // 38: goto 3c
      // 3b: athrow
      // 3c: bipush 1
      // 3d: goto 41
      // 40: bipush 0
      // 41: istore 8
      // 43: iload 8
      // 45: ifeq 4f
      // 48: ldc2_w 0.25
      // 4b: goto 52
      // 4e: athrow
      // 4f: ldc2_w 0.5
      // 52: dstore 9
      // 54: iload 8
      // 56: ifeq 60
      // 59: ldc2_w 16.0
      // 5c: goto 63
      // 5f: athrow
      // 60: ldc2_w 60.0
      // 63: dstore 11
      // 65: dload 6
      // 67: ldc2_w 20.0
      // 6a: ddiv
      // 6b: dconst_1
      // 6c: invokestatic java/lang/Math.min (DD)D
      // 6f: dstore 13
      // 71: iload 8
      // 73: ifeq 84
      // 76: ldc2_w 0.15
      // 79: ldc2_w 0.45
      // 7c: dload 13
      // 7e: dmul
      // 7f: dadd
      // 80: goto 8e
      // 83: athrow
      // 84: ldc2_w 0.3
      // 87: ldc2_w 0.7
      // 8a: dload 13
      // 8c: dmul
      // 8d: dadd
      // 8e: dstore 15
      // 90: dload 6
      // 92: dload 15
      // 94: dmul
      // 95: dstore 17
      // 97: dload 6
      // 99: dload 9
      // 9b: dload 17
      // 9d: dload 11
      // 9f: invokestatic java/lang/Math.min (DD)D
      // a2: invokestatic java/lang/Math.max (DD)D
      // a5: invokestatic java/lang/Math.min (DD)D
      // a8: dstore 17
      // aa: aload 0
      // ab: dup
      // ac: getfield qeaa361f143ee4a0894bd168fd9b30c66/qf4ccf8f5435d4a78bdca4d6a018b578e/abbabbaa.aaa D
      // af: iload 3
      // b0: ifne da
      // b3: dload 17
      // b5: dload 4
      // b7: invokestatic java/lang/Math.copySign (DD)D
      // ba: dadd
      // bb: putfield qeaa361f143ee4a0894bd168fd9b30c66/qf4ccf8f5435d4a78bdca4d6a018b578e/abbabbaa.aaa D
      // be: lload 1
      // bf: l2d
      // c0: aload 0
      // c1: getfield qeaa361f143ee4a0894bd168fd9b30c66/qf4ccf8f5435d4a78bdca4d6a018b578e/abbabbaa.aaa D
      // c4: dsub
      // c5: invokestatic java/lang/Math.abs (D)D
      // c8: ldc2_w 0.5
      // cb: dcmpg
      // cc: ifge dd
      // cf: goto d3
      // d2: athrow
      // d3: aload 0
      // d4: lload 1
      // d5: l2d
      // d6: goto da
      // d9: athrow
      // da: putfield qeaa361f143ee4a0894bd168fd9b30c66/qf4ccf8f5435d4a78bdca4d6a018b578e/abbabbaa.aaa D
      // dd: return
   }

   private boolean ba(long param1) {
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
      // 05: getfield qeaa361f143ee4a0894bd168fd9b30c66/qf4ccf8f5435d4a78bdca4d6a018b578e/abbabbaa.aabaa I
      // 08: iload 3
      // 09: ifne 2e
      // 0c: ifle 3d
      // 0f: goto 13
      // 12: athrow
      // 13: lload 1
      // 14: aload 0
      // 15: getfield qeaa361f143ee4a0894bd168fd9b30c66/qf4ccf8f5435d4a78bdca4d6a018b578e/abbabbaa.a J
      // 18: lsub
      // 19: ldc -1322926171
      // 1b: ldc 1416073586
      // 1d: ldc 1917665187
      // 1f: ixor
      // 20: invokestatic qeaa361f143ee4a0894bd168fd9b30c66/qf4ccf8f5435d4a78bdca4d6a018b578e/abbabbaa.baaba (II)I
      // 23: ldc2_w 4709400163700099924
      // 26: invokestatic qeaa361f143ee4a0894bd168fd9b30c66/qf4ccf8f5435d4a78bdca4d6a018b578e/abbabbaa.aaaa (IJ)J
      // 29: lcmp
      // 2a: goto 2e
      // 2d: athrow
      // 2e: iload 3
      // 2f: ifne 3a
      // 32: ifgt 3d
      // 35: goto 39
      // 38: athrow
      // 39: bipush 1
      // 3a: goto 3e
      // 3d: bipush 0
      // 3e: ireturn
   }

   public boolean bb() {
      return this.bbba;
   }

   private static boolean aaa(long var0, Entry var2) {
      int var3 = baaabbaa.bba;

      try {
         long var5;
         int var10000 = (var5 = var0 - (Long)var2.getKey() - aaaa(baaba(-1322926172, -1577564726 ^ 617243561), 6421867011539362448L)) == 0L
            ? 0
            : (var5 < 0L ? -1 : 1);
         if (var3 != 0) {
            return (boolean)var10000;
         }

         if (var10000 > 0) {
            return (boolean)1;
         }
      } catch (MatchException var4) {
         throw var4;
      }

      return (boolean)0;
   }

   public static boolean aab(class_2596 param0) {
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
      // 05: instanceof net/minecraft/class_2767
      // 08: iload 1
      // 09: ifne 4d
      // 0c: ifne 4c
      // 0f: goto 13
      // 12: athrow
      // 13: aload 0
      // 14: instanceof net/minecraft/class_2765
      // 17: iload 1
      // 18: ifne 4d
      // 1b: goto 1f
      // 1e: athrow
      // 1f: ifne 4c
      // 22: goto 26
      // 25: athrow
      // 26: aload 0
      // 27: instanceof net/minecraft/class_2770
      // 2a: iload 1
      // 2b: ifne 4d
      // 2e: goto 32
      // 31: athrow
      // 32: ifne 4c
      // 35: goto 39
      // 38: athrow
      // 39: aload 0
      // 3a: instanceof net/minecraft/class_2673
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

   public void aba(long var1, long var3) {
      int var10000 = baaabbaa.bba;
      aabaaaab var6 = (aabaaaab)this.bbb.get(var1);
      int var5 = var10000;

      label20: {
         try {
            var8 = var6;
            if (var5 != 0) {
               break label20;
            }

            if (var6 == null) {
               return;
            }
         } catch (MatchException var7) {
            throw var7;
         }

         var8 = var6;
      }

      var8.aaa = var3;
   }

   public static abbabbaa abb() {
      return abbb;
   }

   private int baa(class_310 param1) {
      // $VF: Couldn't be decompiled
      // Please report this to the Vineflower issue tracker, at https://github.com/Vineflower/vineflower/issues with a copy of the class file (if you have the rights to distribute it!)
      // java.lang.RuntimeException: parsing failure!
      //   at org.jetbrains.java.decompiler.modules.decompiler.decompose.DomHelper.parseGraph(DomHelper.java:211)
      //   at org.jetbrains.java.decompiler.main.rels.MethodProcessor.codeToJava(MethodProcessor.java:166)
      //
      // Bytecode:
      // 00: getstatic qeaa361f143ee4a0894bd168fd9b30c66/qf4ccf8f5435d4a78bdca4d6a018b578e/baaabbaa.bba I
      // 03: aload 0
      // 04: invokevirtual qeaa361f143ee4a0894bd168fd9b30c66/qf4ccf8f5435d4a78bdca4d6a018b578e/abbabbaa.abaaa ()I
      // 07: istore 3
      // 08: istore 2
      // 09: aload 1
      // 0a: iload 2
      // 0b: ifne 16
      // 0e: ifnull 37
      // 11: goto 15
      // 14: athrow
      // 15: aload 1
      // 16: iload 2
      // 17: ifne 29
      // 1a: getfield net/minecraft/class_310.field_1724 Lnet/minecraft/class_746;
      // 1d: ifnull 37
      // 20: goto 24
      // 23: athrow
      // 24: aload 1
      // 25: goto 29
      // 28: athrow
      // 29: iload 2
      // 2a: ifne 3b
      // 2d: invokevirtual net/minecraft/class_310.method_1562 ()Lnet/minecraft/class_634;
      // 30: ifnonnull 3a
      // 33: goto 37
      // 36: athrow
      // 37: iload 3
      // 38: ireturn
      // 39: athrow
      // 3a: aload 1
      // 3b: invokevirtual net/minecraft/class_310.method_1562 ()Lnet/minecraft/class_634;
      // 3e: aload 1
      // 3f: getfield net/minecraft/class_310.field_1724 Lnet/minecraft/class_746;
      // 42: invokevirtual net/minecraft/class_746.method_5667 ()Ljava/util/UUID;
      // 45: invokevirtual net/minecraft/class_634.method_2871 (Ljava/util/UUID;)Lnet/minecraft/class_640;
      // 48: astore 4
      // 4a: aload 4
      // 4c: iload 2
      // 4d: ifne 59
      // 50: ifnull 71
      // 53: goto 57
      // 56: athrow
      // 57: aload 4
      // 59: invokevirtual net/minecraft/class_640.method_2959 ()I
      // 5c: iload 2
      // 5d: ifne 72
      // 60: ifle 71
      // 63: goto 67
      // 66: athrow
      // 67: iload 3
      // 68: aload 4
      // 6a: invokevirtual net/minecraft/class_640.method_2959 ()I
      // 6d: invokestatic java/lang/Math.max (II)I
      // 70: istore 3
      // 71: iload 3
      // 72: ireturn
   }

   public synchronized void bab() {
      int var10000 = baaabbaa.bba;
      this.b = this.b.aa(this.aaaaa, this.baa);
      int var1 = var10000;

      boolean var10001;
      label22: {
         label21: {
            try {
               var3 = this;
               var10001 = this.b.ab();
               if (var1 != 0) {
                  break label22;
               }

               if (!var10001) {
                  break label21;
               }
            } catch (MatchException var2) {
               throw var2;
            }

            var10001 = false;
            break label22;
         }

         var10001 = true;
      }

      var3.bba = var10001;
   }

   public synchronized aaaabbaa bba() {
      aaaabbaa var1 = this.b;
      this.b = aaaabbaa.b;
      this.bba = false;
      return var1;
   }

   private void bbb(int param1) {
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
      // 05: ifgt 0a
      // 08: return
      // 09: athrow
      // 0a: invokestatic java/lang/System.currentTimeMillis ()J
      // 0d: lstore 3
      // 0e: aload 0
      // 0f: aload 0
      // 10: iload 2
      // 11: ifne 3f
      // 14: getfield qeaa361f143ee4a0894bd168fd9b30c66/qf4ccf8f5435d4a78bdca4d6a018b578e/abbabbaa.aabaa I
      // 17: iload 1
      // 18: invokestatic java/lang/Math.max (II)I
      // 1b: putfield qeaa361f143ee4a0894bd168fd9b30c66/qf4ccf8f5435d4a78bdca4d6a018b578e/abbabbaa.aabaa I
      // 1e: aload 0
      // 1f: getfield qeaa361f143ee4a0894bd168fd9b30c66/qf4ccf8f5435d4a78bdca4d6a018b578e/abbabbaa.baaa D
      // 22: dconst_0
      // 23: dcmpg
      // 24: ifgt 39
      // 27: goto 2b
      // 2a: athrow
      // 2b: aload 0
      // 2c: iload 1
      // 2d: i2d
      // 2e: putfield qeaa361f143ee4a0894bd168fd9b30c66/qf4ccf8f5435d4a78bdca4d6a018b578e/abbabbaa.baaa D
      // 31: iload 2
      // 32: ifeq 4a
      // 35: goto 39
      // 38: athrow
      // 39: aload 0
      // 3a: aload 0
      // 3b: goto 3f
      // 3e: athrow
      // 3f: getfield qeaa361f143ee4a0894bd168fd9b30c66/qf4ccf8f5435d4a78bdca4d6a018b578e/abbabbaa.baaa D
      // 42: iload 1
      // 43: i2d
      // 44: invokestatic java/lang/Math.max (DD)D
      // 47: putfield qeaa361f143ee4a0894bd168fd9b30c66/qf4ccf8f5435d4a78bdca4d6a018b578e/abbabbaa.baaa D
      // 4a: aload 0
      // 4b: lload 3
      // 4c: putfield qeaa361f143ee4a0894bd168fd9b30c66/qf4ccf8f5435d4a78bdca4d6a018b578e/abbabbaa.a J
      // 4f: return
   }

   private static long aaaa(int var0, long var1) {
      int var3 = (var0 ^ (int)var1 ^ baaba(-1322926183, 397041351 ^ 433617965)) & baaba(-1322926184, 397041351 ^ 1071638299);
      if (aaabb[var3] == null) {
         aaabb[var3] = bb[var3] ^ var1;
      }

      return aaabb[var3];
   }

   public boolean aaab() {
      return this.abab;
   }

   public void aaba(long var1) {
      int var10000 = baaabbaa.bba;
      aabaaaab var4 = (aabaaaab)this.bbb.get(var1);
      int var3 = var10000;

      label20: {
         try {
            var6 = var4;
            if (var3 != 0) {
               break label20;
            }

            if (var4 == null) {
               return;
            }
         } catch (MatchException var5) {
            throw var5;
         }

         var6 = var4;
      }

      var6.bb = System.currentTimeMillis();
   }

   public synchronized void aabb() {
      this.aabaa(true);
   }

   private void abaa(class_634 param1, boolean param2) {
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
      // 05: invokestatic java/lang/System.currentTimeMillis ()J
      // 08: lstore 4
      // 0a: ifne 71
      // 0d: aload 0
      // 0e: lload 4
      // 10: invokevirtual qeaa361f143ee4a0894bd168fd9b30c66/qf4ccf8f5435d4a78bdca4d6a018b578e/abbabbaa.aabba (J)V
      // 13: iload 2
      // 14: ifne 64
      // 17: goto 1b
      // 1a: athrow
      // 1b: aload 0
      // 1c: iload 3
      // 1d: ifne 33
      // 20: goto 24
      // 23: athrow
      // 24: lload 4
      // 26: invokevirtual qeaa361f143ee4a0894bd168fd9b30c66/qf4ccf8f5435d4a78bdca4d6a018b578e/abbabbaa.ba (J)Z
      // 29: ifeq 32
      // 2c: goto 30
      // 2f: athrow
      // 30: return
      // 31: athrow
      // 32: aload 0
      // 33: getfield qeaa361f143ee4a0894bd168fd9b30c66/qf4ccf8f5435d4a78bdca4d6a018b578e/abbabbaa.aabb Z
      // 36: iload 3
      // 37: ifne 60
      // 3a: ifeq 64
      // 3d: goto 41
      // 40: athrow
      // 41: lload 4
      // 43: aload 0
      // 44: getfield qeaa361f143ee4a0894bd168fd9b30c66/qf4ccf8f5435d4a78bdca4d6a018b578e/abbabbaa.abba J
      // 47: lsub
      // 48: ldc_w -1322926181
      // 4b: ldc_w 1063249016
      // 4e: ldc_w -260213695
      // 51: ixor
      // 52: invokestatic qeaa361f143ee4a0894bd168fd9b30c66/qf4ccf8f5435d4a78bdca4d6a018b578e/abbabbaa.baaba (II)I
      // 55: ldc2_w 7673671598213570648
      // 58: invokestatic qeaa361f143ee4a0894bd168fd9b30c66/qf4ccf8f5435d4a78bdca4d6a018b578e/abbabbaa.aaaa (IJ)J
      // 5b: lcmp
      // 5c: goto 60
      // 5f: athrow
      // 60: ifge 64
      // 63: return
      // 64: aload 1
      // 65: new net/minecraft/class_2935
      // 68: dup
      // 69: lload 4
      // 6b: invokespecial net/minecraft/class_2935.<init> (J)V
      // 6e: invokevirtual net/minecraft/class_634.method_52787 (Lnet/minecraft/class_2596;)V
      // 71: return
   }

   private abbabbaa() {
      this.b = aaaabbaa.b;
      this.aaaaa = true;
      this.baa = true;
      this.aaab = new int[5];
      this.bbb = new ConcurrentHashMap();
   }

   private void abab() {
      this.bbb.clear();
      this.aabb = false;
      this.abba = 0L;
      this.aabaa = 0;
      this.baaa = 0.0;
      this.a = 0L;
      this.abb = 0;
      this.baab = 0;
   }

   private int abba(int param1) {
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
      // 06: ifne 35
      // 09: ifgt 13
      // 0c: goto 10
      // 0f: athrow
      // 10: bipush -1
      // 11: ireturn
      // 12: athrow
      // 13: aload 0
      // 14: getfield qeaa361f143ee4a0894bd168fd9b30c66/qf4ccf8f5435d4a78bdca4d6a018b578e/abbabbaa.aaab [I
      // 17: aload 0
      // 18: getfield qeaa361f143ee4a0894bd168fd9b30c66/qf4ccf8f5435d4a78bdca4d6a018b578e/abbabbaa.baab I
      // 1b: iload 2
      // 1c: ifne 4f
      // 1f: iload 1
      // 20: iastore
      // 21: aload 0
      // 22: aload 0
      // 23: getfield qeaa361f143ee4a0894bd168fd9b30c66/qf4ccf8f5435d4a78bdca4d6a018b578e/abbabbaa.baab I
      // 26: bipush 1
      // 27: iadd
      // 28: bipush 5
      // 29: irem
      // 2a: putfield qeaa361f143ee4a0894bd168fd9b30c66/qf4ccf8f5435d4a78bdca4d6a018b578e/abbabbaa.baab I
      // 2d: aload 0
      // 2e: getfield qeaa361f143ee4a0894bd168fd9b30c66/qf4ccf8f5435d4a78bdca4d6a018b578e/abbabbaa.abb I
      // 31: goto 35
      // 34: athrow
      // 35: bipush 5
      // 36: if_icmpge 47
      // 39: aload 0
      // 3a: dup
      // 3b: getfield qeaa361f143ee4a0894bd168fd9b30c66/qf4ccf8f5435d4a78bdca4d6a018b578e/abbabbaa.abb I
      // 3e: bipush 1
      // 3f: iadd
      // 40: putfield qeaa361f143ee4a0894bd168fd9b30c66/qf4ccf8f5435d4a78bdca4d6a018b578e/abbabbaa.abb I
      // 43: goto 47
      // 46: athrow
      // 47: aload 0
      // 48: getfield qeaa361f143ee4a0894bd168fd9b30c66/qf4ccf8f5435d4a78bdca4d6a018b578e/abbabbaa.aaab [I
      // 4b: aload 0
      // 4c: getfield qeaa361f143ee4a0894bd168fd9b30c66/qf4ccf8f5435d4a78bdca4d6a018b578e/abbabbaa.abb I
      // 4f: invokestatic java/util/Arrays.copyOf ([II)[I
      // 52: astore 3
      // 53: aload 3
      // 54: invokestatic java/util/Arrays.sort ([I)V
      // 57: aload 3
      // 58: aload 0
      // 59: getfield qeaa361f143ee4a0894bd168fd9b30c66/qf4ccf8f5435d4a78bdca4d6a018b578e/abbabbaa.abb I
      // 5c: bipush 2
      // 5d: idiv
      // 5e: iaload
      // 5f: ireturn
   }

   private static int baaba(int var0, int var1) {
      int var2 = abaaa[var0 ^ -1322926171] ^ var1 ^ var0;
      var2 -= 18691;
      var2 ^= 3496;
      var2 += 64085;
      var2 += 29361;
      var2 += 56028;
      var2 += 40718;
      var2 ^= 7780;
      var2 ^= 55215;
      return var2 + 19390;
   }

   // $VF: Irreducible bytecode was duplicated to produce valid code
   static {
      int var39 = -157131816;
      short var34 = 12915;
      int var30 = "ź쁢勃욢ዀ콂ꋊ콢担츲拌쾢싎쵢ˇ쓂鋇쐒拄솲㋂쫢拉쑲䋃쬒苈싢ꋆ쐂拏칢\uf2c0캂ꋉ쐢ዀ좒틃쏲틃콂싈좢䋁썢勄쭒\uf2cd쁲\ue2c8쐲㋆췒苋쵂䋋샲苈씢싄섲˃셒\ue2cb셒ˋ쟂苎엲\u12c7웢닇쩒苉옒ꋂ쿢틋쪢鋉읢苏콒ꋄ쐲勀쮢닊캢勃좂拌쥲ˏ씢틉솲\ue2c4셂勂췲싌썒䋄쑢\uf2ca쥒鋉칲ˋ쉢\uf2cf쯲\uf2c3쿢狏쵒鋉켒拁췲ዎ읢ˌ왂틄쨢닍쪒狋좒싅즢ዄ쯒싇찂\ue2cb옢狇쎢鋈쐒닉췲㋋춂\ue2c8얂鋄챒\u12c7컲닏얒㋍쥢ዌ쬢니쌲ꋎ쯂싃춲狏콒닌셒싁썂틊쫲拋쵂拍쮲狃쳂ꋃ쮢틋웂싂읢ˇ켒ꋉ옂닂챲⋍짲⋂켲ˌ쏒싂왲싅쟲\uf2c6쐢ꋃ쓂ˁ셢⋍쾢\uf2c0쑒ˀ섒\uf2c3숲䋅즒䋅콢틏쳂鋌츂㋌쉂싏첲닌젢\u12c7셲㋍잲㋆쥒ˍ쁂⋊슲ው썒勆쩢⋎죒ዃ쿂苌칂ꋈ쿢\uf2c7춲\uf2c0앂ˍ짂拀쳢⋏젲苂짂닊쯲狌촒싎삢닋옒싏쌂狅쳢닂옢ꋈ쾢䋇싲\uf2cc쑒䋍쿢틇쇲㋂쉲⋋쯲狄앂ꋍ쎢勅쏂ꋂ얒\uf2cd첂㋎쏂苅춲⋄샲勎쉂˅쐢닆쎲\uf2ca졲틊윲ꋊ욢\ue2c3쟢ው쬒니엲싉쇂틊얲˃캲㋈숢勄켢勆얢\uf2c3쯲싇섒苌솂㋅샒\ue2c0촒鋊켒㋋젂\uf2cb쭒ꋌ좂䋆춢㋎쩢ˀ첒䋍웢싌섢勆쾲닃읒\uf2c8쭢鋅쨢\ue2c5욲勃쒲\uf2c19\u2fdc鰢ⰼ\uec25☬氫┼鰤⟼谡\u200cⰢ₼\uec23⋬䰭⤬\uec2b⚜䰢⦜尤ⰼ갬⋌氭⪜భ⧬簡♼簢⼜బ⸬య\u218c\uec28⯬\u0c29ⷜ谬\u2d7c㰢⠼鰭⁼ﰭ✌䰤❜\udc22⁜밢⤜\uec29⇬\u0018㏃錽㘣\uf33c㦓쌴㦓팹㿃錼\u3103㌱㸳錺㛓挴㮣挶㔃匲㾓㌳㥓茻\n乌䱀䴜豀䩬\udc4f䑜䱌䯼籋\u0010裡熈肑\uf18d蓁ↈ輑醍莑ㆃ莁䆇話놆訁冁\n\uf2c5염\uf195\u05fc\uf6e5嗳\uf8d5연\uf775\uf5f7P퉈\ue8d5\udf58꣑편\ud8da퇸\uf8d5큈\ue8de\udfb8壖\uddf8食훸࣒헸\ue8d8큸⣕탸⣛탘ᣕ홈䣕퀘䣖\udbf8죔\ud998⣕퍸죓턈飜튈䣒훨룘탸棖텈㣑\ud898ࣚ탸壕훈\uf8de픨\ue8df\uda88\ue8da페ᣔ픨裕푸꣖퉸룞\ude68磒폈壕핸裛톘䣓흸壞혨\ue8da횈\uf8d4턘磖햘壑\n삅藎쏕䗎쒥ᗁ쪕藂씵뗅\u0010Ի⬃५묆ྋ欉౫㬆һᬀۛ\ueb02ƻ鬍\u0efb\udb0c\n\uf344䓽\uf014蓽\uf764퓲凜䓱\uf6f4瓶"
         .length();
      String var29 = "ź쁢勃욢ዀ콂ꋊ콢担츲拌쾢싎쵢ˇ쓂鋇쐒拄솲㋂쫢拉쑲䋃쬒苈싢ꋆ쐂拏칢\uf2c0캂ꋉ쐢ዀ좒틃쏲틃콂싈좢䋁썢勄쭒\uf2cd쁲\ue2c8쐲㋆췒苋쵂䋋샲苈씢싄섲˃셒\ue2cb셒ˋ쟂苎엲\u12c7웢닇쩒苉옒ꋂ쿢틋쪢鋉읢苏콒ꋄ쐲勀쮢닊캢勃좂拌쥲ˏ씢틉솲\ue2c4셂勂췲싌썒䋄쑢\uf2ca쥒鋉칲ˋ쉢\uf2cf쯲\uf2c3쿢狏쵒鋉켒拁췲ዎ읢ˌ왂틄쨢닍쪒狋좒싅즢ዄ쯒싇찂\ue2cb옢狇쎢鋈쐒닉췲㋋춂\ue2c8얂鋄챒\u12c7컲닏얒㋍쥢ዌ쬢니쌲ꋎ쯂싃춲狏콒닌셒싁썂틊쫲拋쵂拍쮲狃쳂ꋃ쮢틋웂싂읢ˇ켒ꋉ옂닂챲⋍짲⋂켲ˌ쏒싂왲싅쟲\uf2c6쐢ꋃ쓂ˁ셢⋍쾢\uf2c0쑒ˀ섒\uf2c3숲䋅즒䋅콢틏쳂鋌츂㋌쉂싏첲닌젢\u12c7셲㋍잲㋆쥒ˍ쁂⋊슲ው썒勆쩢⋎죒ዃ쿂苌칂ꋈ쿢\uf2c7춲\uf2c0앂ˍ짂拀쳢⋏젲苂짂닊쯲狌촒싎삢닋옒싏쌂狅쳢닂옢ꋈ쾢䋇싲\uf2cc쑒䋍쿢틇쇲㋂쉲⋋쯲狄앂ꋍ쎢勅쏂ꋂ얒\uf2cd첂㋎쏂苅춲⋄샲勎쉂˅쐢닆쎲\uf2ca졲틊윲ꋊ욢\ue2c3쟢ው쬒니엲싉쇂틊얲˃캲㋈숢勄켢勆얢\uf2c3쯲싇섒苌솂㋅샒\ue2c0촒鋊켒㋋젂\uf2cb쭒ꋌ좂䋆춢㋎쩢ˀ첒䋍웢싌섢勆쾲닃읒\uf2c8쭢鋅쨢\ue2c5욲勃쒲\uf2c19\u2fdc鰢ⰼ\uec25☬氫┼鰤⟼谡\u200cⰢ₼\uec23⋬䰭⤬\uec2b⚜䰢⦜尤ⰼ갬⋌氭⪜భ⧬簡♼簢⼜బ⸬య\u218c\uec28⯬\u0c29ⷜ谬\u2d7c㰢⠼鰭⁼ﰭ✌䰤❜\udc22⁜밢⤜\uec29⇬\u0018㏃錽㘣\uf33c㦓쌴㦓팹㿃錼\u3103㌱㸳錺㛓挴㮣挶㔃匲㾓㌳㥓茻\n乌䱀䴜豀䩬\udc4f䑜䱌䯼籋\u0010裡熈肑\uf18d蓁ↈ輑醍莑ㆃ莁䆇話놆訁冁\n\uf2c5염\uf195\u05fc\uf6e5嗳\uf8d5연\uf775\uf5f7P퉈\ue8d5\udf58꣑편\ud8da퇸\uf8d5큈\ue8de\udfb8壖\uddf8食훸࣒헸\ue8d8큸⣕탸⣛탘ᣕ홈䣕퀘䣖\udbf8죔\ud998⣕퍸죓턈飜튈䣒훨룘탸棖텈㣑\ud898ࣚ탸壕훈\uf8de픨\ue8df\uda88\ue8da페ᣔ픨裕푸꣖퉸룞\ude68磒폈壕핸裛톘䣓흸壞혨\ue8da횈\uf8d4턘磖햘壑\n삅藎쏕䗎쒥ᗁ쪕藂씵뗅\u0010Ի⬃५묆ྋ欉౫㬆һᬀۛ\ueb02ƻ鬍\u0efb\udb0c\n\uf344䓽\uf014蓽\uf764퓲凜䓱\uf6f4瓶";
      int var33 = 0;
      String[] var10000 = new String[10];
      int var32 = 0;
      String[] var31 = var10000;

      do {
         char var35 = var29.charAt(var33);
         String var45 = var29.substring(var33 + 1, var33 + 1 + var35);
         int var37 = 0;
         char[] var36 = var45.toCharArray();

         do {
            char var38 = var36[var37];
            if (var37 % 2 == 0) {
               var36[var37] = (char)((var38 >>> 4 | var38 << '\f') & 65535 ^ var34);
            } else {
               var36[var37] = (char)((var38 << 4 | var38 >>> '\f') & 65535 ^ var34);
            }
         } while (++var37 < var36.length);

         var31[var32] = new String(var36);
         var32++;
         var33 = var33 + var35 + 1;
      } while (var33 < var30);

      abaab = var31;
      ababa = new Object[var31.length];
      int var25 = -402035044;
      byte[] var23 = "\u0080ø\u001aá#àê\u000ef\u008fu÷\u0013xlE&ÈõÜ5_¡p÷\u009dX\u0012häÏÏ\\B\u001bB4Ss¸ßk§\u001a|\u0019CêY\u008cG\u009c8o\u001c-Úê-aÚò\u009ci6 _;#£f¬\u000bä S\u008fUá7Í\u0015ÂYUJ\u0003ï\u0098eZ\u009fW£:Xúð4ÈS\u001cwÙø¼\u009a¤]x§à\u0019'4¾G}9\u0000dhöT¶\u0017[v\u0007\u0007ýÙõ-å\u000f\u0010Ò-ú8ÄÅ>\u009câ¤\u0012¥\u0096\u0015Ûu}\u007fõ×\u0082·JÚy\u0097ó\u0005\u009c¼\u0085³\u0085\u0096¯CÔÀÏ Þ>âßT}Õæ\u0002\u001a\u0093\u0019cr¡½\u0005G\u009cË~\u001eÎ§ ¥}:Á#ê\u0016\u000f³ÈxË^Ò\r\u0083Ü»h9öâ\u008fòø\u0001R\u0012oí/\u0082\rÄCo8 ¨¢\u0089\u0010\u008e§\fíiò\u001b7Ø\u0085~\u0013'ÛI\u0015æ\u0016é\u0012l ~¾¡©³pw\u0011ô5\u009btSì0Þ¿\u0002\u0015¼Ei`ÿÉ\u008d¢7¢RÏNÒA\u001aã\u0003p\u0015Ø(¿Ï=ì±¶Î|di\u001cvù\u0090\u0015?2-E7^ âK´Ô¿Þ\n\u000b\u0014Á4\u0089%{ÆR?ü^Á\u0087üRõC2ÿ\f¶«e\u0093g6ÞÅÀ\u0086OC.º(e2\u0015\u009bô^¼\u0016¹¾\u00adåØ?»®\u0097/p\u009c\u00ad:»\b1\u0097µ9ðè\u0094Ë0ç\u0006\u0087±¶5\u0085À¶6\u0003\u0093:t»I\u0017\u0096Ê; Ï\u0094jkX\u0002\fÕêÃ\u0090-`ÐEïV\u000bêQ\u008a1¶&Ôe\u0091\u008eÍ\u001cY\u0098²Huð\u007f\u009b¯sª)\u008ajO\u0010Õ;¯NîD\u000e\u0094I \u0086\u001c9sóÏ\u001eÃ\u0098çÿ8x'E¹Ö\u009døFA\u00830ZO\u0003t\u001aÁ\u00ad\u008fTJY\u0095e\u009d¯ªÔ@6 áiil!Ú]LÇZ ãEÏ\"EL·×Ï\u000e\b-ÇUÍÓv¦×¼\u0002à6\u000edL\r÷ÃóJî¥óÏ\u0007\u0089p\u00927I%Üú_¤5\u008eÖ\u0088ûe%@¢7si\u0007ìÀ\u0093¢\u008fpZ\u0086ÉÕ@´\u0019ã«Ê\u0088\u00838Kíaç\u009d\u008d\u0005>èü]¾y\u001bÀ±JxÖÅ\u0011mgsßµéV+\u001b\u001c\u0016-¡IÏ×ðËÊ\u0081nJ(\u0080\u0083(\u000býI+w¢´®Å\tû\u0095\u0094\u0085³cíiê\u0012¿kþ$X*\u0092%\u0092ñÌæO{e,°\u008cÁÛs¥VPýî\u0001.ð¨\u001c\u0011ºí+\u0094\u001a{þã (´ò\t\u0019°b\u009fIÖM\u001e\u008fd²\u008aÃ»\u0013(\u0081\u00113\u0086Ö\u0015½Ø7Xÿà\u008c#é¶Ý\u008a\n£9ÏîsHJ\u009bg\u009d\u0012[\u000f!u²0¾´\u0003þë´(Ìf\u000e\u0013\u007fô\u0081&8Öv\u0099®ý\u0081é\u0095Ië\u001c÷\u0000ê§7\u009a]êKî<9°¦ª\u0086Õ*t©y\u0014ò-\u008d\u0093J v,\u000fNwÐM[O3q}%÷\u008e\f¶y\u009dBW²áè\fÉõL\n\u008e\u0098[kDëGÝÈ!\u0015\u008dþ}×\u0014÷´)ßc\u00984'K\u0082\u0000BO,PþÕ:-Yvhm_\u0083\u001a\u000f`Ùù>xÝ¬\u0015cgõo\u00144ª- I\u0012V^\u0019¸Ó^s`cÝ¿õ|×\u007fñÅ<_*áµçc¡T_^a8\u009e[§\u0096NrJGXë¼\u001a8y!\\\u0015\u00198?\u009dtò\u00021¶q\u0099ãñ\u007f¯0V{\u008a¾\u008d.§\u009e Í'tÑ¤|Ã\u0099Eìñ¯\u000b«\u001b+\u008dQß£\u009e\u0083ýþþY\\WayQgd\t&wó\u0015\u0016mÃïc\u0017\u0007à\u0012\u0080àR\u0011í*\u0004\u0098µµû}\u0012°ªÝ8Z\u0019à\u00ad{Xá\u000bºB25½\u000e\u0089¶lÁL\u0003(\u001dNCÛ³É\t\u001a\u0082\u0098\u008cý\f\u0006epàS=lôö`:N,\u0080\u0088G\u001c\u009dç· 5µ\u0012\u0096l\u0006¯\u0095>ÆL\u0018Ä\u009a®f\u001f¸sÒóþ×ô;\u0013\u009bZ\u0084½\u001bÔV:Ñ¶E\u0098ÑêkÄô\u0001Y×-\u0095\u008b:¦aú~*8.ã1\u0084+ù\u0084á\u000e\"h\u0011p4ç\u0013FIæõO+-lP¶¸\u0003\u008c(YýlÝW!\u001aìÞY%cãÈ\u0083\u0005ì\u0086\u009bo\u0082¡¾*ï\u009eÝÿô\u009al7B©d\u0001¤\u0000\u0097ÿç=\u000bÃ\\Ig\u0005i\u0082dÜ-ª\tä\u0081y=òvÄ` Ù\u008b\u0004þao¿\u0093í\u009eÔ\u001c¥GOä\u0084ô\u001f'á\"\u0002¬ã3ÄëFa²e¡'³×ûa²\u0090ÄYî\u0011\u0003\u0081üÍ\u0085\u0090r\u00046¹}\u0006H`rTÖöÆS§i\u009cb\u008f\u000fº6Bå¿©Ë¸åwÅ±rDb\u001d[\u008eÔ5t»èÏßz >È\\\u0018\u0090¤å®~9Ñ\tY\u0084\u001e;T\u0093 ¬TpV>ê\u0080v]4úk\u000b\u0017\u0096I£ÚÓ{b\u0004CÙ\u001dá\u0088RéF>\u009e\u008f\u0001C½Ó\u001e|ö/Y\u009a"
         .getBytes("ISO-8859-1");
      int var24 = var23.length / 4;
      abaaa = new int[var24];
      byte var26 = 0;
      int var27 = 0;

      do {
         int var28 = (var23[var26] & 255) << 24 | (var23[var26 + 1] & 255) << 16 | (var23[var26 + 2] & 255) << 8 | var23[var26 + 3] & 255;
         var28 ^= var25;
         abaaa[var27] = var28;
         var26 += 4;
      } while (++var27 < var24);

      String[] var21 = new String[baaba(-1322926169, var39 ^ 922557227)];
      int var19 = 0;
      String var18;
      int var20 = (var18 = baabb(-88164444, var39 ^ -1005772131)).length();
      int var17 = baaba(-1322926170, var39 ^ 1124729523);
      int var43 = -1;

      label128:
      while (true) {
         String var46 = var18.substring(++var43, var43 + var17);
         int var10001 = -1;

         while (true) {
            char[] var74;
            label123: {
               char[] var55 = var46.toCharArray();
               int var10003 = var55.length;
               int var22 = 0;
               var74 = var55;
               var10001 = var10003;
               char[] var90;
               int var10004;
               if (var10003 <= 1) {
                  var90 = var55;
                  var10004 = var22;
               } else {
                  var74 = var55;
                  var10001 = var10003;
                  if (var10003 <= var22) {
                     break label123;
                  }

                  var90 = var55;
                  var10004 = var22;
               }

               while (true) {
                  var90[var10004] = (char)(var90[var10004] ^ switch (var22 % baaba(-1322926173, var39 ^ -1477495096)) {
                     case 0 -> baaba(-1322926174, var39 ^ 949395801);
                     case 1 -> baaba(-1322926163, var39 ^ 204502462);
                     case 2 -> baaba(-1322926164, var39 ^ 1679891828);
                     case 3 -> baaba(-1322926161, var39 ^ -1894135514);
                     case 4 -> baaba(-1322926162, var39 ^ 745221486);
                     case 5 -> baaba(-1322926167, var39 ^ 167651723);
                     default -> baaba(-1322926168, var39 ^ 1746760428);
                  });
                  var22++;
                  if (var10001 == 0) {
                     var10004 = var10001;
                     var90 = var74;
                  } else {
                     if (var10001 <= var22) {
                        break;
                     }

                     var90 = var74;
                     var10004 = var22;
                  }
               }
            }

            String var97 = new String(var74).intern();
            switch (var10001) {
               case 0:
                  var21[var19++] = var97;
                  if ((var43 += var17) >= var20) {
                     aabba = var21;
                     bbab = new String[baaba(-1322926176, var39 ^ 1697501099)];
                     long var8 = 8954960823666048123L;
                     long[] var14 = new long[5];
                     int var11 = 0;
                     String var12;
                     int var13 = (var12 = baabb(-88164442, var39 ^ -613847952)).length();
                     byte var10 = 0;

                     label102:
                     while (true) {
                        int var62 = var10;
                        var10 += 8;
                        String var48 = var12.substring(var62, var10);
                        var62 = -88164441;
                        int var80 = var39 ^ 743709408;
                        byte[] var15 = var48.getBytes("ISO-8859-1");
                        long[] var49 = var14;
                        var62 = var11++;
                        long var81 = (var15[0] & 255L) << baaba(-1322926165, var39 ^ -1969732638)
                           | (var15[1] & 255L) << baaba(-1322926166, var39 ^ -1971260701)
                           | (var15[2] & 255L) << baaba(-1322926155, var39 ^ 1716662742)
                           | (var15[3] & 255L) << baaba(-1322926156, var39 ^ 1943078984)
                           | (var15[4] & 255L) << baaba(-1322926153, var39 ^ 1536609964)
                           | (var15[5] & 255L) << baaba(-1322926154, var39 ^ -551055423)
                           | (var15[baaba(-1322926159, var39 ^ -1654149998)] & 255L) << baaba(-1322926160, var39 ^ 87584039)
                           | var15[baaba(-1322926157, var39 ^ -938003371)] & 255L;
                        byte var98 = -1;

                        while (true) {
                           long var103 = var81 ^ var8;
                           switch (var98) {
                              case 0:
                                 var49[var62] = var103;
                                 if (var10 >= var13) {
                                    babb = var14;
                                    baba = new Integer[5];
                                    aaaba = bbab(baaba(-1322926203, var39 ^ 1467339764), 1520260764496274730L);
                                    bbaa = bbab(baaba(-1322926204, var39 ^ -1520608730), 3945696467797387299L);
                                    bab = bbab(baaba(-1322926201, var39 ^ 1084229172), 5862450788398867588L);
                                    long var0 = 3798124082182681501L;
                                    long[] var6 = new long[baaba(-1322926202, var39 ^ 1756801980)];
                                    int var3 = 0;
                                    String var4;
                                    int var5 = (var4 = baabb(-88164446, var39 ^ 1707869199)).length();
                                    byte var2 = 0;

                                    label92:
                                    while (true) {
                                       int var67 = var2;
                                       var2 += 8;
                                       String var51 = var4.substring(var67, var2);
                                       var67 = -88164445;
                                       int var84 = var39 ^ -1262991368;
                                       byte[] var7 = var51.getBytes("ISO-8859-1");
                                       long[] var52 = var6;
                                       var67 = var3++;
                                       long var85 = (var7[0] & 255L) << baaba(-1322926207, var39 ^ -862926149)
                                          | (var7[1] & 255L) << baaba(-1322926208, var39 ^ -169575557)
                                          | (var7[2] & 255L) << baaba(-1322926205, var39 ^ 621744430)
                                          | (var7[3] & 255L) << baaba(-1322926206, var39 ^ -2014258792)
                                          | (var7[4] & 255L) << baaba(-1322926195, var39 ^ -1978926794)
                                          | (var7[5] & 255L) << baaba(-1322926196, var39 ^ 1441714761)
                                          | (var7[baaba(-1322926193, var39 ^ -470288294)] & 255L) << baaba(-1322926194, var39 ^ 329690681)
                                          | var7[baaba(-1322926199, var39 ^ -257142766)] & 255L;
                                       byte var100 = -1;

                                       while (true) {
                                          var103 = var85 ^ var0;
                                          switch (var100) {
                                             case 0:
                                                var52[var67] = var103;
                                                if (var2 >= var5) {
                                                   bb = var6;
                                                   aaabb = new Long[baaba(-1322926189, var39 ^ 1576120876)];
                                                   abaa = aaaa(baaba(-1322926190, var39 ^ 944330211), 6630858843386830625L);
                                                   aba = aaaa(baaba(-1322926179, var39 ^ -545110382), 7402119597911570836L);
                                                   bbbb = aaaa(baaba(-1322926180, var39 ^ 40021471), 4198790637548104446L);
                                                   aabbb = aaaa(baaba(-1322926177, var39 ^ 2146437965), 2676358763378274711L);
                                                   aaaab = aaaa(baaba(-1322926178, var39 ^ 320719861), 3588795648949030741L);
                                                   abbb = new abbabbaa();
                                                   return;
                                                }
                                                break;
                                             default:
                                                var52[var67] = var103;
                                                if (var2 < var5) {
                                                   continue label92;
                                                }

                                                var5 = (var4 = baabb(-88164436, var39 ^ 1491010704)).length();
                                                var2 = 0;
                                          }

                                          int var70 = var2;
                                          var2 += 8;
                                          String var53 = var4.substring(var70, var2);
                                          var70 = -88164435;
                                          int var87 = var39 ^ -1484500667;
                                          var7 = var53.getBytes("ISO-8859-1");
                                          var52 = var6;
                                          var67 = var3++;
                                          var85 = (var7[0] & 255L) << baaba(-1322926200, var39 ^ -1893330059)
                                             | (var7[1] & 255L) << baaba(-1322926197, var39 ^ -1234144200)
                                             | (var7[2] & 255L) << baaba(-1322926198, var39 ^ 1225858163)
                                             | (var7[3] & 255L) << baaba(-1322926187, var39 ^ -310957735)
                                             | (var7[4] & 255L) << baaba(-1322926188, var39 ^ -1693683694)
                                             | (var7[5] & 255L) << baaba(-1322926185, var39 ^ -137180246)
                                             | (var7[baaba(-1322926186, var39 ^ 1790135558)] & 255L) << baaba(-1322926191, var39 ^ 1182653729)
                                             | var7[baaba(-1322926192, var39 ^ 683225147)] & 255L;
                                          var100 = 0;
                                       }
                                    }
                                 }
                                 break;
                              default:
                                 var49[var62] = var103;
                                 if (var10 < var13) {
                                    continue label102;
                                 }

                                 var13 = (var12 = baabb(-88164448, var39 ^ -259193525)).length();
                                 var10 = 0;
                           }

                           int var65 = var10;
                           var10 += 8;
                           String var50 = var12.substring(var65, var10);
                           var65 = -88164447;
                           int var83 = var39 ^ -1214502844;
                           var15 = var50.getBytes("ISO-8859-1");
                           var49 = var14;
                           var62 = var11++;
                           var81 = (var15[0] & 255L) << baaba(-1322926158, var39 ^ 131159234)
                              | (var15[1] & 255L) << baaba(-1322926147, var39 ^ -1434297771)
                              | (var15[2] & 255L) << baaba(-1322926148, var39 ^ 57547069)
                              | (var15[3] & 255L) << baaba(-1322926145, var39 ^ -1462832053)
                              | (var15[4] & 255L) << baaba(-1322926146, var39 ^ 218810646)
                              | (var15[5] & 255L) << baaba(-1322926151, var39 ^ 1230330439)
                              | (var15[baaba(-1322926152, var39 ^ 386881474)] & 255L) << baaba(-1322926149, var39 ^ 874158231)
                              | var15[baaba(-1322926150, var39 ^ -429574731)] & 255L;
                           var98 = 0;
                        }
                     }
                  }

                  var17 = var18.charAt(var43);
                  break;
               default:
                  var21[var19++] = var97;
                  if ((var43 += var17) < var20) {
                     var17 = var18.charAt(var43);
                     continue label128;
                  }

                  var20 = (var18 = baabb(-88164443, var39 ^ 721365536)).length();
                  var17 = baaba(-1322926175, var39 ^ 1991940905);
                  var43 = -1;
            }

            var46 = var18.substring(++var43, var43 + var17);
            var10001 = 0;
         }
      }
   }

   public int abbb() {
      return (int)this.aabab;
   }

   public void baaa(class_310 param1) {
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
      // 006: ifne 01b
      // 009: getfield qeaa361f143ee4a0894bd168fd9b30c66/qf4ccf8f5435d4a78bdca4d6a018b578e/abbabbaa.abab Z
      // 00c: ifne 01a
      // 00f: goto 013
      // 012: athrow
      // 013: aload 0
      // 014: lconst_0
      // 015: putfield qeaa361f143ee4a0894bd168fd9b30c66/qf4ccf8f5435d4a78bdca4d6a018b578e/abbabbaa.aabab J
      // 018: return
      // 019: athrow
      // 01a: aload 0
      // 01b: iload 2
      // 01c: ifne 03a
      // 01f: getfield qeaa361f143ee4a0894bd168fd9b30c66/qf4ccf8f5435d4a78bdca4d6a018b578e/abbabbaa.aab Lqeaa361f143ee4a0894bd168fd9b30c66/qf4ccf8f5435d4a78bdca4d6a018b578e/bbaabaa;
      // 022: getstatic qeaa361f143ee4a0894bd168fd9b30c66/qf4ccf8f5435d4a78bdca4d6a018b578e/bbaabaa.aa Lqeaa361f143ee4a0894bd168fd9b30c66/qf4ccf8f5435d4a78bdca4d6a018b578e/bbaabaa;
      // 025: if_acmpne 045
      // 028: goto 02c
      // 02b: athrow
      // 02c: aload 0
      // 02d: aload 0
      // 02e: getfield qeaa361f143ee4a0894bd168fd9b30c66/qf4ccf8f5435d4a78bdca4d6a018b578e/abbabbaa.ab I
      // 031: i2d
      // 032: putfield qeaa361f143ee4a0894bd168fd9b30c66/qf4ccf8f5435d4a78bdca4d6a018b578e/abbabbaa.aaa D
      // 035: aload 0
      // 036: goto 03a
      // 039: athrow
      // 03a: aload 0
      // 03b: getfield qeaa361f143ee4a0894bd168fd9b30c66/qf4ccf8f5435d4a78bdca4d6a018b578e/abbabbaa.aaa D
      // 03e: invokestatic qeaa361f143ee4a0894bd168fd9b30c66/qf4ccf8f5435d4a78bdca4d6a018b578e/abbabbaa.abbaa (D)J
      // 041: putfield qeaa361f143ee4a0894bd168fd9b30c66/qf4ccf8f5435d4a78bdca4d6a018b578e/abbabbaa.aabab J
      // 044: return
      // 045: aload 1
      // 046: iload 2
      // 047: ifne 056
      // 04a: ifnonnull 055
      // 04d: goto 051
      // 050: athrow
      // 051: invokestatic net/minecraft/class_310.method_1551 ()Lnet/minecraft/class_310;
      // 054: astore 1
      // 055: aload 1
      // 056: iload 2
      // 057: ifne 062
      // 05a: ifnull 070
      // 05d: goto 061
      // 060: athrow
      // 061: aload 1
      // 062: iload 2
      // 063: ifne 073
      // 066: getfield net/minecraft/class_310.field_1724 Lnet/minecraft/class_746;
      // 069: ifnonnull 072
      // 06c: goto 070
      // 06f: athrow
      // 070: return
      // 071: athrow
      // 072: aload 1
      // 073: invokevirtual net/minecraft/class_310.method_1562 ()Lnet/minecraft/class_634;
      // 076: astore 3
      // 077: aload 3
      // 078: ifnonnull 07d
      // 07b: return
      // 07c: athrow
      // 07d: invokestatic java/lang/System.currentTimeMillis ()J
      // 080: lstore 4
      // 082: aload 0
      // 083: aload 3
      // 084: bipush 0
      // 085: invokevirtual qeaa361f143ee4a0894bd168fd9b30c66/qf4ccf8f5435d4a78bdca4d6a018b578e/abbabbaa.abaa (Lnet/minecraft/class_634;Z)V
      // 088: aload 0
      // 089: iload 2
      // 08a: ifne 0db
      // 08d: lload 4
      // 08f: invokevirtual qeaa361f143ee4a0894bd168fd9b30c66/qf4ccf8f5435d4a78bdca4d6a018b578e/abbabbaa.ba (J)Z
      // 092: ifne 0da
      // 095: goto 099
      // 098: athrow
      // 099: aload 0
      // 09a: iload 2
      // 09b: ifne 0b1
      // 09e: goto 0a2
      // 0a1: athrow
      // 0a2: getfield qeaa361f143ee4a0894bd168fd9b30c66/qf4ccf8f5435d4a78bdca4d6a018b578e/abbabbaa.aabaa I
      // 0a5: ifgt 0d8
      // 0a8: goto 0ac
      // 0ab: athrow
      // 0ac: aload 0
      // 0ad: goto 0b1
      // 0b0: athrow
      // 0b1: aload 1
      // 0b2: invokevirtual qeaa361f143ee4a0894bd168fd9b30c66/qf4ccf8f5435d4a78bdca4d6a018b578e/abbabbaa.baa (Lnet/minecraft/class_310;)I
      // 0b5: istore 6
      // 0b7: iload 2
      // 0b8: ifne 0ce
      // 0bb: iload 6
      // 0bd: ifle 0d2
      // 0c0: goto 0c4
      // 0c3: athrow
      // 0c4: aload 0
      // 0c5: iload 6
      // 0c7: invokevirtual qeaa361f143ee4a0894bd168fd9b30c66/qf4ccf8f5435d4a78bdca4d6a018b578e/abbabbaa.bbb (I)V
      // 0ca: goto 0ce
      // 0cd: athrow
      // 0ce: iload 2
      // 0cf: ifeq 0d4
      // 0d2: return
      // 0d3: athrow
      // 0d4: iload 2
      // 0d5: ifeq 0da
      // 0d8: return
      // 0d9: athrow
      // 0da: aload 0
      // 0db: invokevirtual qeaa361f143ee4a0894bd168fd9b30c66/qf4ccf8f5435d4a78bdca4d6a018b578e/abbabbaa.abaaa ()I
      // 0de: istore 6
      // 0e0: bipush 0
      // 0e1: aload 0
      // 0e2: getfield qeaa361f143ee4a0894bd168fd9b30c66/qf4ccf8f5435d4a78bdca4d6a018b578e/abbabbaa.ab I
      // 0e5: iload 6
      // 0e7: isub
      // 0e8: invokestatic java/lang/Math.max (II)I
      // 0eb: i2l
      // 0ec: lstore 7
      // 0ee: aload 0
      // 0ef: lload 7
      // 0f1: invokevirtual qeaa361f143ee4a0894bd168fd9b30c66/qf4ccf8f5435d4a78bdca4d6a018b578e/abbabbaa.ab (J)V
      // 0f4: aload 0
      // 0f5: lload 4
      // 0f7: aload 0
      // 0f8: getfield qeaa361f143ee4a0894bd168fd9b30c66/qf4ccf8f5435d4a78bdca4d6a018b578e/abbabbaa.aaa D
      // 0fb: invokestatic qeaa361f143ee4a0894bd168fd9b30c66/qf4ccf8f5435d4a78bdca4d6a018b578e/abbabbaa.abbaa (D)J
      // 0fe: invokevirtual qeaa361f143ee4a0894bd168fd9b30c66/qf4ccf8f5435d4a78bdca4d6a018b578e/abbabbaa.bbbb (JJ)V
      // 101: return
   }

   public boolean baab() {
      return this.baa;
   }

   public void baba(long var1) {
      int var10000 = baaabbaa.bba;
      aabaaaab var4 = (aabaaaab)this.bbb.get(var1);
      int var3 = var10000;

      label20: {
         try {
            var6 = var4;
            if (var3 != 0) {
               break label20;
            }

            if (var4 == null) {
               return;
            }
         } catch (MatchException var5) {
            throw var5;
         }

         var6 = var4;
      }

      var6.aab = System.currentTimeMillis();
   }

   public void babb(long var1) {
      try {
         if (!this.abab) {
            return;
         }
      } catch (MatchException var6) {
         throw var6;
      }

      long var3 = System.currentTimeMillis();
      this.aabba(var3);
      aabaaaab var5 = new aabaaaab();
      var5.b = this.aabab;
      var5.ba = this.baaab();
      var5.aaa = this.aabbb();
      this.bbb.put(var1, var5);
      this.abba = var3;
      this.aabb = true;
   }

   public static boolean bbaa(String param0) {
      // $VF: Couldn't be decompiled
      // Please report this to the Vineflower issue tracker, at https://github.com/Vineflower/vineflower/issues with a copy of the class file (if you have the rights to distribute it!)
      // java.lang.RuntimeException: parsing failure!
      //   at org.jetbrains.java.decompiler.modules.decompiler.decompose.DomHelper.parseGraph(DomHelper.java:211)
      //   at org.jetbrains.java.decompiler.main.rels.MethodProcessor.codeToJava(MethodProcessor.java:166)
      //
      // Bytecode:
      // 000: ldc_w 913674514
      // 003: istore 2
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
      // 018: ldc_w -1322926182
      // 01b: iload 2
      // 01c: ldc_w 1210109579
      // 01f: ixor
      // 020: invokestatic qeaa361f143ee4a0894bd168fd9b30c66/qf4ccf8f5435d4a78bdca4d6a018b578e/abbabbaa.baaba (II)I
      // 023: ldc_w -1322926107
      // 026: iload 2
      // 027: ldc_w -1216439588
      // 02a: ixor
      // 02b: invokestatic qeaa361f143ee4a0894bd168fd9b30c66/qf4ccf8f5435d4a78bdca4d6a018b578e/abbabbaa.baaba (II)I
      // 02e: invokestatic qeaa361f143ee4a0894bd168fd9b30c66/qf4ccf8f5435d4a78bdca4d6a018b578e/abbabbaa.ababa (II)Ljava/lang/String;
      // 031: invokestatic qeaa361f143ee4a0894bd168fd9b30c66/qf4ccf8f5435d4a78bdca4d6a018b578e/aabbaaaba.abba (Ljava/lang/String;)Ljava/lang/String;
      // 034: invokevirtual java/lang/String.endsWith (Ljava/lang/String;)Z
      // 037: iload 1
      // 038: ifne 18c
      // 03b: ifne 18b
      // 03e: goto 042
      // 041: athrow
      // 042: aload 0
      // 043: ldc_w -1322926108
      // 046: iload 2
      // 047: ldc_w 1991465456
      // 04a: ixor
      // 04b: invokestatic qeaa361f143ee4a0894bd168fd9b30c66/qf4ccf8f5435d4a78bdca4d6a018b578e/abbabbaa.baaba (II)I
      // 04e: ldc_w -1322926105
      // 051: iload 2
      // 052: ldc_w -58336128
      // 055: ixor
      // 056: invokestatic qeaa361f143ee4a0894bd168fd9b30c66/qf4ccf8f5435d4a78bdca4d6a018b578e/abbabbaa.baaba (II)I
      // 059: invokestatic qeaa361f143ee4a0894bd168fd9b30c66/qf4ccf8f5435d4a78bdca4d6a018b578e/abbabbaa.ababa (II)Ljava/lang/String;
      // 05c: invokestatic qeaa361f143ee4a0894bd168fd9b30c66/qf4ccf8f5435d4a78bdca4d6a018b578e/aabbaaaba.abba (Ljava/lang/String;)Ljava/lang/String;
      // 05f: invokevirtual java/lang/String.endsWith (Ljava/lang/String;)Z
      // 062: iload 1
      // 063: ifne 18c
      // 066: goto 06a
      // 069: athrow
      // 06a: ifne 18b
      // 06d: goto 071
      // 070: athrow
      // 071: aload 0
      // 072: ldc_w -1322926106
      // 075: iload 2
      // 076: ldc_w 822870929
      // 079: ixor
      // 07a: invokestatic qeaa361f143ee4a0894bd168fd9b30c66/qf4ccf8f5435d4a78bdca4d6a018b578e/abbabbaa.baaba (II)I
      // 07d: ldc_w -1322926111
      // 080: iload 2
      // 081: ldc_w -407458101
      // 084: ixor
      // 085: invokestatic qeaa361f143ee4a0894bd168fd9b30c66/qf4ccf8f5435d4a78bdca4d6a018b578e/abbabbaa.baaba (II)I
      // 088: invokestatic qeaa361f143ee4a0894bd168fd9b30c66/qf4ccf8f5435d4a78bdca4d6a018b578e/abbabbaa.ababa (II)Ljava/lang/String;
      // 08b: invokestatic qeaa361f143ee4a0894bd168fd9b30c66/qf4ccf8f5435d4a78bdca4d6a018b578e/aabbaaaba.abba (Ljava/lang/String;)Ljava/lang/String;
      // 08e: invokevirtual java/lang/String.endsWith (Ljava/lang/String;)Z
      // 091: iload 1
      // 092: ifne 18c
      // 095: goto 099
      // 098: athrow
      // 099: ifne 18b
      // 09c: goto 0a0
      // 09f: athrow
      // 0a0: aload 0
      // 0a1: ldc_w -1322926112
      // 0a4: iload 2
      // 0a5: ldc_w 198304535
      // 0a8: ixor
      // 0a9: invokestatic qeaa361f143ee4a0894bd168fd9b30c66/qf4ccf8f5435d4a78bdca4d6a018b578e/abbabbaa.baaba (II)I
      // 0ac: ldc_w -1322926109
      // 0af: iload 2
      // 0b0: ldc_w -1602529826
      // 0b3: ixor
      // 0b4: invokestatic qeaa361f143ee4a0894bd168fd9b30c66/qf4ccf8f5435d4a78bdca4d6a018b578e/abbabbaa.baaba (II)I
      // 0b7: invokestatic qeaa361f143ee4a0894bd168fd9b30c66/qf4ccf8f5435d4a78bdca4d6a018b578e/abbabbaa.ababa (II)Ljava/lang/String;
      // 0ba: invokestatic qeaa361f143ee4a0894bd168fd9b30c66/qf4ccf8f5435d4a78bdca4d6a018b578e/aabbaaaba.abba (Ljava/lang/String;)Ljava/lang/String;
      // 0bd: invokevirtual java/lang/String.endsWith (Ljava/lang/String;)Z
      // 0c0: iload 1
      // 0c1: ifne 18c
      // 0c4: goto 0c8
      // 0c7: athrow
      // 0c8: ifne 18b
      // 0cb: goto 0cf
      // 0ce: athrow
      // 0cf: aload 0
      // 0d0: ldc_w -1322926110
      // 0d3: iload 2
      // 0d4: ldc_w -2061896306
      // 0d7: ixor
      // 0d8: invokestatic qeaa361f143ee4a0894bd168fd9b30c66/qf4ccf8f5435d4a78bdca4d6a018b578e/abbabbaa.baaba (II)I
      // 0db: ldc_w -1322926099
      // 0de: iload 2
      // 0df: ldc_w -262427593
      // 0e2: ixor
      // 0e3: invokestatic qeaa361f143ee4a0894bd168fd9b30c66/qf4ccf8f5435d4a78bdca4d6a018b578e/abbabbaa.baaba (II)I
      // 0e6: invokestatic qeaa361f143ee4a0894bd168fd9b30c66/qf4ccf8f5435d4a78bdca4d6a018b578e/abbabbaa.ababa (II)Ljava/lang/String;
      // 0e9: invokestatic qeaa361f143ee4a0894bd168fd9b30c66/qf4ccf8f5435d4a78bdca4d6a018b578e/aabbaaaba.abba (Ljava/lang/String;)Ljava/lang/String;
      // 0ec: invokevirtual java/lang/String.endsWith (Ljava/lang/String;)Z
      // 0ef: iload 1
      // 0f0: ifne 18c
      // 0f3: goto 0f7
      // 0f6: athrow
      // 0f7: ifne 18b
      // 0fa: goto 0fe
      // 0fd: athrow
      // 0fe: aload 0
      // 0ff: ldc_w -1322926100
      // 102: iload 2
      // 103: ldc_w 848433847
      // 106: ixor
      // 107: invokestatic qeaa361f143ee4a0894bd168fd9b30c66/qf4ccf8f5435d4a78bdca4d6a018b578e/abbabbaa.baaba (II)I
      // 10a: ldc_w -1322926097
      // 10d: iload 2
      // 10e: ldc_w 1609149711
      // 111: ixor
      // 112: invokestatic qeaa361f143ee4a0894bd168fd9b30c66/qf4ccf8f5435d4a78bdca4d6a018b578e/abbabbaa.baaba (II)I
      // 115: invokestatic qeaa361f143ee4a0894bd168fd9b30c66/qf4ccf8f5435d4a78bdca4d6a018b578e/abbabbaa.ababa (II)Ljava/lang/String;
      // 118: invokestatic qeaa361f143ee4a0894bd168fd9b30c66/qf4ccf8f5435d4a78bdca4d6a018b578e/aabbaaaba.abba (Ljava/lang/String;)Ljava/lang/String;
      // 11b: invokevirtual java/lang/String.endsWith (Ljava/lang/String;)Z
      // 11e: iload 1
      // 11f: ifne 18c
      // 122: goto 126
      // 125: athrow
      // 126: ifne 18b
      // 129: goto 12d
      // 12c: athrow
      // 12d: aload 0
      // 12e: ldc_w -1322926098
      // 131: iload 2
      // 132: ldc_w -1975078014
      // 135: ixor
      // 136: invokestatic qeaa361f143ee4a0894bd168fd9b30c66/qf4ccf8f5435d4a78bdca4d6a018b578e/abbabbaa.baaba (II)I
      // 139: ldc_w -1322926103
      // 13c: iload 2
      // 13d: ldc_w -2055270949
      // 140: ixor
      // 141: invokestatic qeaa361f143ee4a0894bd168fd9b30c66/qf4ccf8f5435d4a78bdca4d6a018b578e/abbabbaa.baaba (II)I
      // 144: invokestatic qeaa361f143ee4a0894bd168fd9b30c66/qf4ccf8f5435d4a78bdca4d6a018b578e/abbabbaa.ababa (II)Ljava/lang/String;
      // 147: invokestatic qeaa361f143ee4a0894bd168fd9b30c66/qf4ccf8f5435d4a78bdca4d6a018b578e/aabbaaaba.abba (Ljava/lang/String;)Ljava/lang/String;
      // 14a: invokevirtual java/lang/String.endsWith (Ljava/lang/String;)Z
      // 14d: iload 1
      // 14e: ifne 18c
      // 151: goto 155
      // 154: athrow
      // 155: ifne 18b
      // 158: goto 15c
      // 15b: athrow
      // 15c: aload 0
      // 15d: ldc_w -1322926104
      // 160: iload 2
      // 161: ldc_w 1603820632
      // 164: ixor
      // 165: invokestatic qeaa361f143ee4a0894bd168fd9b30c66/qf4ccf8f5435d4a78bdca4d6a018b578e/abbabbaa.baaba (II)I
      // 168: ldc_w -1322926101
      // 16b: iload 2
      // 16c: ldc_w 644603207
      // 16f: ixor
      // 170: invokestatic qeaa361f143ee4a0894bd168fd9b30c66/qf4ccf8f5435d4a78bdca4d6a018b578e/abbabbaa.baaba (II)I
      // 173: invokestatic qeaa361f143ee4a0894bd168fd9b30c66/qf4ccf8f5435d4a78bdca4d6a018b578e/abbabbaa.ababa (II)Ljava/lang/String;
      // 176: invokestatic qeaa361f143ee4a0894bd168fd9b30c66/qf4ccf8f5435d4a78bdca4d6a018b578e/aabbaaaba.abba (Ljava/lang/String;)Ljava/lang/String;
      // 179: invokevirtual java/lang/String.endsWith (Ljava/lang/String;)Z
      // 17c: iload 1
      // 17d: ifne 18c
      // 180: goto 184
      // 183: athrow
      // 184: ifeq 18f
      // 187: goto 18b
      // 18a: athrow
      // 18b: bipush 1
      // 18c: goto 190
      // 18f: bipush 0
      // 190: ireturn
   }

   private static int bbab(int var0, long var1) {
      int var3 = var0 ^ (int)(var1 & 32767L) ^ baaba(-1322926102, -2128200296 ^ 1323874195);
      if (baba[var3] == null) {
         baba[var3] = (int)(babb[var3] ^ var1);
      }

      return baba[var3];
   }

   public static boolean bbba(class_2596 param0) {
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
      // 05: instanceof net/minecraft/class_6373
      // 08: iload 1
      // 09: ifne 27
      // 0c: ifne 26
      // 0f: goto 13
      // 12: athrow
      // 13: aload 0
      // 14: instanceof net/minecraft/class_2670
      // 17: iload 1
      // 18: ifne 27
      // 1b: goto 1f
      // 1e: athrow
      // 1f: ifeq 2a
      // 22: goto 26
      // 25: athrow
      // 26: bipush 1
      // 27: goto 2b
      // 2a: bipush 0
      // 2b: ireturn
   }

   private void bbbb(long param1, long param3) {
      // $VF: Couldn't be decompiled
      // Please report this to the Vineflower issue tracker, at https://github.com/Vineflower/vineflower/issues with a copy of the class file (if you have the rights to distribute it!)
      // java.lang.RuntimeException: parsing failure!
      //   at org.jetbrains.java.decompiler.modules.decompiler.decompose.DomHelper.parseGraph(DomHelper.java:211)
      //   at org.jetbrains.java.decompiler.main.rels.MethodProcessor.codeToJava(MethodProcessor.java:166)
      //
      // Bytecode:
      // 00: getstatic qeaa361f143ee4a0894bd168fd9b30c66/qf4ccf8f5435d4a78bdca4d6a018b578e/baaabbaa.bba I
      // 03: lload 3
      // 04: aload 0
      // 05: getfield qeaa361f143ee4a0894bd168fd9b30c66/qf4ccf8f5435d4a78bdca4d6a018b578e/abbabbaa.aabab J
      // 08: lsub
      // 09: invokestatic java/lang/Math.abs (J)J
      // 0c: lstore 6
      // 0e: istore 5
      // 10: lload 6
      // 12: lconst_0
      // 13: iload 5
      // 15: ifne 37
      // 18: lcmp
      // 19: ifne 22
      // 1c: goto 20
      // 1f: athrow
      // 20: return
      // 21: athrow
      // 22: lload 6
      // 24: ldc_w -1322926091
      // 27: ldc_w -73396226
      // 2a: ldc_w -848970435
      // 2d: ixor
      // 2e: invokestatic qeaa361f143ee4a0894bd168fd9b30c66/qf4ccf8f5435d4a78bdca4d6a018b578e/abbabbaa.baaba (II)I
      // 31: ldc2_w 4687751030456135402
      // 34: invokestatic qeaa361f143ee4a0894bd168fd9b30c66/qf4ccf8f5435d4a78bdca4d6a018b578e/abbabbaa.aaaa (IJ)J
      // 37: lcmp
      // 38: iload 5
      // 3a: ifne 45
      // 3d: iflt 48
      // 40: goto 44
      // 43: athrow
      // 44: bipush 1
      // 45: goto 49
      // 48: bipush 0
      // 49: istore 8
      // 4b: lload 6
      // 4d: ldc_w -1322926092
      // 50: ldc_w -73396226
      // 53: ldc_w 1882540708
      // 56: ixor
      // 57: invokestatic qeaa361f143ee4a0894bd168fd9b30c66/qf4ccf8f5435d4a78bdca4d6a018b578e/abbabbaa.baaba (II)I
      // 5a: ldc2_w 3911011026264618353
      // 5d: invokestatic qeaa361f143ee4a0894bd168fd9b30c66/qf4ccf8f5435d4a78bdca4d6a018b578e/abbabbaa.aaaa (IJ)J
      // 60: lcmp
      // 61: iload 5
      // 63: ifne 6e
      // 66: iflt 71
      // 69: goto 6d
      // 6c: athrow
      // 6d: bipush 1
      // 6e: goto 72
      // 71: bipush 0
      // 72: istore 9
      // 74: lload 1
      // 75: aload 0
      // 76: getfield qeaa361f143ee4a0894bd168fd9b30c66/qf4ccf8f5435d4a78bdca4d6a018b578e/abbabbaa.ba J
      // 79: lsub
      // 7a: ldc_w -1322926089
      // 7d: ldc_w -73396226
      // 80: ldc_w 2106625639
      // 83: ixor
      // 84: invokestatic qeaa361f143ee4a0894bd168fd9b30c66/qf4ccf8f5435d4a78bdca4d6a018b578e/abbabbaa.baaba (II)I
      // 87: ldc2_w 4409011664149769355
      // 8a: invokestatic qeaa361f143ee4a0894bd168fd9b30c66/qf4ccf8f5435d4a78bdca4d6a018b578e/abbabbaa.aaaa (IJ)J
      // 8d: lcmp
      // 8e: iload 5
      // 90: ifne 9b
      // 93: iflt 9e
      // 96: goto 9a
      // 99: athrow
      // 9a: bipush 1
      // 9b: goto 9f
      // 9e: bipush 0
      // 9f: istore 10
      // a1: iload 5
      // a3: ifne cf
      // a6: iload 8
      // a8: ifne c6
      // ab: goto af
      // ae: athrow
      // af: iload 9
      // b1: iload 5
      // b3: ifne c3
      // b6: goto ba
      // b9: athrow
      // ba: ifeq d4
      // bd: goto c1
      // c0: athrow
      // c1: iload 10
      // c3: ifeq d4
      // c6: aload 0
      // c7: lload 3
      // c8: putfield qeaa361f143ee4a0894bd168fd9b30c66/qf4ccf8f5435d4a78bdca4d6a018b578e/abbabbaa.aabab J
      // cb: goto cf
      // ce: athrow
      // cf: aload 0
      // d0: lload 1
      // d1: putfield qeaa361f143ee4a0894bd168fd9b30c66/qf4ccf8f5435d4a78bdca4d6a018b578e/abbabbaa.ba J
      // d4: return
   }

   public synchronized void aaaaa(boolean param1, bbaabaa param2, int param3) {
      // $VF: Couldn't be decompiled
      // Please report this to the Vineflower issue tracker, at https://github.com/Vineflower/vineflower/issues with a copy of the class file (if you have the rights to distribute it!)
      // java.lang.RuntimeException: parsing failure!
      //   at org.jetbrains.java.decompiler.modules.decompiler.decompose.DomHelper.parseGraph(DomHelper.java:211)
      //   at org.jetbrains.java.decompiler.main.rels.MethodProcessor.codeToJava(MethodProcessor.java:166)
      //
      // Bytecode:
      // 000: getstatic qeaa361f143ee4a0894bd168fd9b30c66/qf4ccf8f5435d4a78bdca4d6a018b578e/baaabbaa.bba I
      // 003: aload 0
      // 004: getfield qeaa361f143ee4a0894bd168fd9b30c66/qf4ccf8f5435d4a78bdca4d6a018b578e/abbabbaa.abab Z
      // 007: istore 5
      // 009: istore 4
      // 00b: aload 2
      // 00c: iload 4
      // 00e: ifne 01b
      // 011: ifnonnull 01e
      // 014: goto 018
      // 017: athrow
      // 018: getstatic qeaa361f143ee4a0894bd168fd9b30c66/qf4ccf8f5435d4a78bdca4d6a018b578e/bbaabaa.a Lqeaa361f143ee4a0894bd168fd9b30c66/qf4ccf8f5435d4a78bdca4d6a018b578e/bbaabaa;
      // 01b: goto 01f
      // 01e: aload 2
      // 01f: astore 6
      // 021: bipush 0
      // 022: iload 3
      // 023: invokestatic java/lang/Math.max (II)I
      // 026: istore 7
      // 028: aload 0
      // 029: getfield qeaa361f143ee4a0894bd168fd9b30c66/qf4ccf8f5435d4a78bdca4d6a018b578e/abbabbaa.ab I
      // 02c: iload 4
      // 02e: ifne 04c
      // 031: iload 7
      // 033: if_icmpne 047
      // 036: goto 03a
      // 039: athrow
      // 03a: aload 0
      // 03b: getfield qeaa361f143ee4a0894bd168fd9b30c66/qf4ccf8f5435d4a78bdca4d6a018b578e/abbabbaa.aab Lqeaa361f143ee4a0894bd168fd9b30c66/qf4ccf8f5435d4a78bdca4d6a018b578e/bbaabaa;
      // 03e: aload 6
      // 040: if_acmpeq 04f
      // 043: goto 047
      // 046: athrow
      // 047: bipush 1
      // 048: goto 04c
      // 04b: athrow
      // 04c: goto 050
      // 04f: bipush 0
      // 050: istore 8
      // 052: aload 0
      // 053: iload 1
      // 054: putfield qeaa361f143ee4a0894bd168fd9b30c66/qf4ccf8f5435d4a78bdca4d6a018b578e/abbabbaa.abab Z
      // 057: aload 0
      // 058: aload 6
      // 05a: putfield qeaa361f143ee4a0894bd168fd9b30c66/qf4ccf8f5435d4a78bdca4d6a018b578e/abbabbaa.aab Lqeaa361f143ee4a0894bd168fd9b30c66/qf4ccf8f5435d4a78bdca4d6a018b578e/bbaabaa;
      // 05d: aload 0
      // 05e: iload 7
      // 060: putfield qeaa361f143ee4a0894bd168fd9b30c66/qf4ccf8f5435d4a78bdca4d6a018b578e/abbabbaa.ab I
      // 063: iload 1
      // 064: iload 4
      // 066: ifne 07e
      // 069: ifne 07c
      // 06c: goto 070
      // 06f: athrow
      // 070: aload 0
      // 071: lconst_0
      // 072: putfield qeaa361f143ee4a0894bd168fd9b30c66/qf4ccf8f5435d4a78bdca4d6a018b578e/abbabbaa.aabab J
      // 075: aload 0
      // 076: dconst_0
      // 077: putfield qeaa361f143ee4a0894bd168fd9b30c66/qf4ccf8f5435d4a78bdca4d6a018b578e/abbabbaa.aaa D
      // 07a: return
      // 07b: athrow
      // 07c: iload 5
      // 07e: iload 4
      // 080: ifne 08c
      // 083: ifeq 08f
      // 086: goto 08a
      // 089: athrow
      // 08a: iload 8
      // 08c: ifeq 097
      // 08f: aload 0
      // 090: invokevirtual qeaa361f143ee4a0894bd168fd9b30c66/qf4ccf8f5435d4a78bdca4d6a018b578e/abbabbaa.abab ()V
      // 093: goto 097
      // 096: athrow
      // 097: aload 0
      // 098: iload 4
      // 09a: ifne 0c3
      // 09d: getfield qeaa361f143ee4a0894bd168fd9b30c66/qf4ccf8f5435d4a78bdca4d6a018b578e/abbabbaa.aab Lqeaa361f143ee4a0894bd168fd9b30c66/qf4ccf8f5435d4a78bdca4d6a018b578e/bbaabaa;
      // 0a0: getstatic qeaa361f143ee4a0894bd168fd9b30c66/qf4ccf8f5435d4a78bdca4d6a018b578e/bbaabaa.aa Lqeaa361f143ee4a0894bd168fd9b30c66/qf4ccf8f5435d4a78bdca4d6a018b578e/bbaabaa;
      // 0a3: if_acmpne 0ca
      // 0a6: goto 0aa
      // 0a9: athrow
      // 0aa: aload 0
      // 0ab: aload 0
      // 0ac: getfield qeaa361f143ee4a0894bd168fd9b30c66/qf4ccf8f5435d4a78bdca4d6a018b578e/abbabbaa.ab I
      // 0af: i2d
      // 0b0: putfield qeaa361f143ee4a0894bd168fd9b30c66/qf4ccf8f5435d4a78bdca4d6a018b578e/abbabbaa.aaa D
      // 0b3: aload 0
      // 0b4: aload 0
      // 0b5: getfield qeaa361f143ee4a0894bd168fd9b30c66/qf4ccf8f5435d4a78bdca4d6a018b578e/abbabbaa.aaa D
      // 0b8: invokestatic qeaa361f143ee4a0894bd168fd9b30c66/qf4ccf8f5435d4a78bdca4d6a018b578e/abbabbaa.abbaa (D)J
      // 0bb: putfield qeaa361f143ee4a0894bd168fd9b30c66/qf4ccf8f5435d4a78bdca4d6a018b578e/abbabbaa.aabab J
      // 0be: aload 0
      // 0bf: goto 0c3
      // 0c2: athrow
      // 0c3: invokestatic java/lang/System.currentTimeMillis ()J
      // 0c6: putfield qeaa361f143ee4a0894bd168fd9b30c66/qf4ccf8f5435d4a78bdca4d6a018b578e/abbabbaa.ba J
      // 0c9: return
      // 0ca: iload 5
      // 0cc: iload 4
      // 0ce: ifne 0da
      // 0d1: ifeq 0dd
      // 0d4: goto 0d8
      // 0d7: athrow
      // 0d8: iload 8
      // 0da: ifeq 128
      // 0dd: invokestatic net/minecraft/class_310.method_1551 ()Lnet/minecraft/class_310;
      // 0e0: astore 9
      // 0e2: iload 4
      // 0e4: aload 0
      // 0e5: aload 9
      // 0e7: invokevirtual qeaa361f143ee4a0894bd168fd9b30c66/qf4ccf8f5435d4a78bdca4d6a018b578e/abbabbaa.baa (Lnet/minecraft/class_310;)I
      // 0ea: istore 10
      // 0ec: ifne 102
      // 0ef: iload 10
      // 0f1: ifle 128
      // 0f4: goto 0f8
      // 0f7: athrow
      // 0f8: aload 0
      // 0f9: iload 10
      // 0fb: invokevirtual qeaa361f143ee4a0894bd168fd9b30c66/qf4ccf8f5435d4a78bdca4d6a018b578e/abbabbaa.bbb (I)V
      // 0fe: goto 102
      // 101: athrow
      // 102: bipush 0
      // 103: aload 0
      // 104: getfield qeaa361f143ee4a0894bd168fd9b30c66/qf4ccf8f5435d4a78bdca4d6a018b578e/abbabbaa.ab I
      // 107: iload 10
      // 109: isub
      // 10a: invokestatic java/lang/Math.max (II)I
      // 10d: i2d
      // 10e: dstore 11
      // 110: aload 0
      // 111: dload 11
      // 113: putfield qeaa361f143ee4a0894bd168fd9b30c66/qf4ccf8f5435d4a78bdca4d6a018b578e/abbabbaa.aaa D
      // 116: aload 0
      // 117: aload 0
      // 118: getfield qeaa361f143ee4a0894bd168fd9b30c66/qf4ccf8f5435d4a78bdca4d6a018b578e/abbabbaa.aaa D
      // 11b: invokestatic qeaa361f143ee4a0894bd168fd9b30c66/qf4ccf8f5435d4a78bdca4d6a018b578e/abbabbaa.abbaa (D)J
      // 11e: putfield qeaa361f143ee4a0894bd168fd9b30c66/qf4ccf8f5435d4a78bdca4d6a018b578e/abbabbaa.aabab J
      // 121: aload 0
      // 122: invokestatic java/lang/System.currentTimeMillis ()J
      // 125: putfield qeaa361f143ee4a0894bd168fd9b30c66/qf4ccf8f5435d4a78bdca4d6a018b578e/abbabbaa.ba J
      // 128: return
   }

   public synchronized void aaaab(boolean var1) {
      this.bbba = var1;
   }

   public void aaaba(class_2923 param1) {
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
      // 006: ifne 021
      // 009: ifnonnull 011
      // 00c: goto 010
      // 00f: athrow
      // 010: return
      // 011: aload 0
      // 012: getfield qeaa361f143ee4a0894bd168fd9b30c66/qf4ccf8f5435d4a78bdca4d6a018b578e/abbabbaa.bbb Ljava/util/Map;
      // 015: aload 1
      // 016: invokevirtual net/minecraft/class_2923.comp_2201 ()J
      // 019: invokestatic java/lang/Long.valueOf (J)Ljava/lang/Long;
      // 01c: invokeinterface java/util/Map.remove (Ljava/lang/Object;)Ljava/lang/Object; 2
      // 021: checkcast qeaa361f143ee4a0894bd168fd9b30c66/qf4ccf8f5435d4a78bdca4d6a018b578e/aabaaaab
      // 024: astore 3
      // 025: aload 3
      // 026: ifnonnull 02b
      // 029: return
      // 02a: athrow
      // 02b: invokestatic java/lang/System.currentTimeMillis ()J
      // 02e: lstore 4
      // 030: aload 3
      // 031: iload 2
      // 032: ifne 046
      // 035: getfield qeaa361f143ee4a0894bd168fd9b30c66/qf4ccf8f5435d4a78bdca4d6a018b578e/aabaaaab.bb J
      // 038: lconst_0
      // 039: lcmp
      // 03a: ifle 04c
      // 03d: goto 041
      // 040: athrow
      // 041: aload 3
      // 042: goto 046
      // 045: athrow
      // 046: getfield qeaa361f143ee4a0894bd168fd9b30c66/qf4ccf8f5435d4a78bdca4d6a018b578e/aabaaaab.bb J
      // 049: goto 04e
      // 04c: lload 4
      // 04e: lstore 6
      // 050: lconst_0
      // 051: lload 6
      // 053: aload 1
      // 054: invokevirtual net/minecraft/class_2923.comp_2201 ()J
      // 057: lsub
      // 058: invokestatic java/lang/Math.max (JJ)J
      // 05b: lstore 8
      // 05d: aload 3
      // 05e: getfield qeaa361f143ee4a0894bd168fd9b30c66/qf4ccf8f5435d4a78bdca4d6a018b578e/aabaaaab.ba J
      // 061: aload 3
      // 062: getfield qeaa361f143ee4a0894bd168fd9b30c66/qf4ccf8f5435d4a78bdca4d6a018b578e/aabaaaab.aaa J
      // 065: ladd
      // 066: lstore 10
      // 068: lload 10
      // 06a: iload 2
      // 06b: ifne 07d
      // 06e: lconst_0
      // 06f: lcmp
      // 070: ifle 080
      // 073: goto 077
      // 076: athrow
      // 077: lload 10
      // 079: goto 07d
      // 07c: athrow
      // 07d: goto 084
      // 080: aload 3
      // 081: getfield qeaa361f143ee4a0894bd168fd9b30c66/qf4ccf8f5435d4a78bdca4d6a018b578e/aabaaaab.b J
      // 084: lstore 12
      // 086: iload 2
      // 087: lconst_0
      // 088: lload 8
      // 08a: lload 12
      // 08c: lsub
      // 08d: invokestatic java/lang/Math.max (JJ)J
      // 090: lstore 14
      // 092: aload 0
      // 093: lload 14
      // 095: l2i
      // 096: invokevirtual qeaa361f143ee4a0894bd168fd9b30c66/qf4ccf8f5435d4a78bdca4d6a018b578e/abbabbaa.abba (I)I
      // 099: istore 16
      // 09b: ifne 0b4
      // 09e: iload 16
      // 0a0: ifgt 0ae
      // 0a3: goto 0a7
      // 0a6: athrow
      // 0a7: aload 0
      // 0a8: bipush 0
      // 0a9: putfield qeaa361f143ee4a0894bd168fd9b30c66/qf4ccf8f5435d4a78bdca4d6a018b578e/abbabbaa.aabb Z
      // 0ac: return
      // 0ad: athrow
      // 0ae: aload 0
      // 0af: iload 16
      // 0b1: putfield qeaa361f143ee4a0894bd168fd9b30c66/qf4ccf8f5435d4a78bdca4d6a018b578e/abbabbaa.aabaa I
      // 0b4: iload 16
      // 0b6: i2d
      // 0b7: dstore 17
      // 0b9: aload 0
      // 0ba: iload 2
      // 0bb: ifne 0ed
      // 0be: getfield qeaa361f143ee4a0894bd168fd9b30c66/qf4ccf8f5435d4a78bdca4d6a018b578e/abbabbaa.baaa D
      // 0c1: dconst_0
      // 0c2: dcmpl
      // 0c3: ifle 0ec
      // 0c6: goto 0ca
      // 0c9: athrow
      // 0ca: aload 0
      // 0cb: getfield qeaa361f143ee4a0894bd168fd9b30c66/qf4ccf8f5435d4a78bdca4d6a018b578e/abbabbaa.baaa D
      // 0ce: ldc2_w 25.0
      // 0d1: dsub
      // 0d2: dstore 19
      // 0d4: aload 0
      // 0d5: getfield qeaa361f143ee4a0894bd168fd9b30c66/qf4ccf8f5435d4a78bdca4d6a018b578e/abbabbaa.baaa D
      // 0d8: ldc2_w 25.0
      // 0db: dadd
      // 0dc: dstore 21
      // 0de: dload 19
      // 0e0: dload 21
      // 0e2: dload 17
      // 0e4: invokestatic java/lang/Math.min (DD)D
      // 0e7: invokestatic java/lang/Math.max (DD)D
      // 0ea: dstore 17
      // 0ec: aload 0
      // 0ed: aload 0
      // 0ee: getfield qeaa361f143ee4a0894bd168fd9b30c66/qf4ccf8f5435d4a78bdca4d6a018b578e/abbabbaa.baaa D
      // 0f1: iload 2
      // 0f2: ifne 10c
      // 0f5: dconst_0
      // 0f6: dcmpl
      // 0f7: ifne 104
      // 0fa: goto 0fe
      // 0fd: athrow
      // 0fe: dload 17
      // 100: goto 113
      // 103: athrow
      // 104: aload 0
      // 105: getfield qeaa361f143ee4a0894bd168fd9b30c66/qf4ccf8f5435d4a78bdca4d6a018b578e/abbabbaa.baaa D
      // 108: ldc2_w 0.9299999999999999
      // 10b: dmul
      // 10c: dload 17
      // 10e: ldc2_w 0.07
      // 111: dmul
      // 112: dadd
      // 113: putfield qeaa361f143ee4a0894bd168fd9b30c66/qf4ccf8f5435d4a78bdca4d6a018b578e/abbabbaa.baaa D
      // 116: aload 0
      // 117: lload 4
      // 119: putfield qeaa361f143ee4a0894bd168fd9b30c66/qf4ccf8f5435d4a78bdca4d6a018b578e/abbabbaa.a J
      // 11c: aload 0
      // 11d: bipush 0
      // 11e: putfield qeaa361f143ee4a0894bd168fd9b30c66/qf4ccf8f5435d4a78bdca4d6a018b578e/abbabbaa.aabb Z
      // 121: return
   }

   public synchronized boolean aaabb() {
      int var1 = baaabbaa.bba;

      try {
         boolean var10000 = this.bba().ab();
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

   public synchronized void aabaa(boolean param1) {
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
      // 05: ifeq 1f
      // 08: aload 0
      // 09: aload 0
      // 0a: getfield qeaa361f143ee4a0894bd168fd9b30c66/qf4ccf8f5435d4a78bdca4d6a018b578e/abbabbaa.b Lqeaa361f143ee4a0894bd168fd9b30c66/qf4ccf8f5435d4a78bdca4d6a018b578e/aaaabbaa;
      // 0d: aload 0
      // 0e: getfield qeaa361f143ee4a0894bd168fd9b30c66/qf4ccf8f5435d4a78bdca4d6a018b578e/abbabbaa.aaaaa Z
      // 11: aload 0
      // 12: getfield qeaa361f143ee4a0894bd168fd9b30c66/qf4ccf8f5435d4a78bdca4d6a018b578e/abbabbaa.baa Z
      // 15: invokevirtual qeaa361f143ee4a0894bd168fd9b30c66/qf4ccf8f5435d4a78bdca4d6a018b578e/aaaabbaa.aa (ZZ)Lqeaa361f143ee4a0894bd168fd9b30c66/qf4ccf8f5435d4a78bdca4d6a018b578e/aaaabbaa;
      // 18: putfield qeaa361f143ee4a0894bd168fd9b30c66/qf4ccf8f5435d4a78bdca4d6a018b578e/abbabbaa.b Lqeaa361f143ee4a0894bd168fd9b30c66/qf4ccf8f5435d4a78bdca4d6a018b578e/aaaabbaa;
      // 1b: goto 1f
      // 1e: athrow
      // 1f: aload 0
      // 20: bipush 0
      // 21: putfield qeaa361f143ee4a0894bd168fd9b30c66/qf4ccf8f5435d4a78bdca4d6a018b578e/abbabbaa.bbba Z
      // 24: aload 0
      // 25: bipush 1
      // 26: putfield qeaa361f143ee4a0894bd168fd9b30c66/qf4ccf8f5435d4a78bdca4d6a018b578e/abbabbaa.aaaaa Z
      // 29: aload 0
      // 2a: bipush 1
      // 2b: putfield qeaa361f143ee4a0894bd168fd9b30c66/qf4ccf8f5435d4a78bdca4d6a018b578e/abbabbaa.baa Z
      // 2e: aload 0
      // 2f: bipush 0
      // 30: iload 2
      // 31: ifne 63
      // 34: putfield qeaa361f143ee4a0894bd168fd9b30c66/qf4ccf8f5435d4a78bdca4d6a018b578e/abbabbaa.aaaa Z
      // 37: aload 0
      // 38: bipush 0
      // 39: putfield qeaa361f143ee4a0894bd168fd9b30c66/qf4ccf8f5435d4a78bdca4d6a018b578e/abbabbaa.abab Z
      // 3c: aload 0
      // 3d: bipush 0
      // 3e: putfield qeaa361f143ee4a0894bd168fd9b30c66/qf4ccf8f5435d4a78bdca4d6a018b578e/abbabbaa.ab I
      // 41: aload 0
      // 42: lconst_0
      // 43: putfield qeaa361f143ee4a0894bd168fd9b30c66/qf4ccf8f5435d4a78bdca4d6a018b578e/abbabbaa.aabab J
      // 46: aload 0
      // 47: dconst_0
      // 48: putfield qeaa361f143ee4a0894bd168fd9b30c66/qf4ccf8f5435d4a78bdca4d6a018b578e/abbabbaa.aaa D
      // 4b: aload 0
      // 4c: invokevirtual qeaa361f143ee4a0894bd168fd9b30c66/qf4ccf8f5435d4a78bdca4d6a018b578e/abbabbaa.abab ()V
      // 4f: aload 0
      // 50: aload 0
      // 51: getfield qeaa361f143ee4a0894bd168fd9b30c66/qf4ccf8f5435d4a78bdca4d6a018b578e/abbabbaa.b Lqeaa361f143ee4a0894bd168fd9b30c66/qf4ccf8f5435d4a78bdca4d6a018b578e/aaaabbaa;
      // 54: invokevirtual qeaa361f143ee4a0894bd168fd9b30c66/qf4ccf8f5435d4a78bdca4d6a018b578e/aaaabbaa.ab ()Z
      // 57: ifne 66
      // 5a: goto 5e
      // 5d: athrow
      // 5e: bipush 1
      // 5f: goto 63
      // 62: athrow
      // 63: goto 67
      // 66: bipush 0
      // 67: putfield qeaa361f143ee4a0894bd168fd9b30c66/qf4ccf8f5435d4a78bdca4d6a018b578e/abbabbaa.bba Z
      // 6a: return
   }

   public boolean aabab() {
      return this.aaaaa;
   }

   private void aabba(long param1) {
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
      // 05: getfield qeaa361f143ee4a0894bd168fd9b30c66/qf4ccf8f5435d4a78bdca4d6a018b578e/abbabbaa.bbb Ljava/util/Map;
      // 08: invokeinterface java/util/Map.entrySet ()Ljava/util/Set; 1
      // 0d: iload 3
      // 0e: ifne 4b
      // 11: lload 1
      // 12: invokedynamic test (J)Ljava/util/function/Predicate; bsm=java/lang/invoke/LambdaMetafactory.metafactory (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;Ljava/lang/invoke/MethodType;Ljava/lang/invoke/MethodHandle;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[ (Ljava/lang/Object;)Z, qeaa361f143ee4a0894bd168fd9b30c66/qf4ccf8f5435d4a78bdca4d6a018b578e/abbabbaa.aaa (JLjava/util/Map$Entry;)Z, (Ljava/util/Map$Entry;)Z ]
      // 17: invokeinterface java/util/Set.removeIf (Ljava/util/function/Predicate;)Z 2
      // 1c: pop
      // 1d: aload 0
      // 1e: getfield qeaa361f143ee4a0894bd168fd9b30c66/qf4ccf8f5435d4a78bdca4d6a018b578e/abbabbaa.bbb Ljava/util/Map;
      // 21: invokeinterface java/util/Map.size ()I 1
      // 26: ldc_w -1322926090
      // 29: ldc_w -1112976113
      // 2c: ldc_w -809095875
      // 2f: ixor
      // 30: invokestatic qeaa361f143ee4a0894bd168fd9b30c66/qf4ccf8f5435d4a78bdca4d6a018b578e/abbabbaa.baaba (II)I
      // 33: ldc2_w 4917643237778549582
      // 36: invokestatic qeaa361f143ee4a0894bd168fd9b30c66/qf4ccf8f5435d4a78bdca4d6a018b578e/abbabbaa.bbab (IJ)I
      // 39: if_icmpgt 42
      // 3c: goto 40
      // 3f: athrow
      // 40: return
      // 41: athrow
      // 42: aload 0
      // 43: getfield qeaa361f143ee4a0894bd168fd9b30c66/qf4ccf8f5435d4a78bdca4d6a018b578e/abbabbaa.bbb Ljava/util/Map;
      // 46: invokeinterface java/util/Map.keySet ()Ljava/util/Set; 1
      // 4b: invokeinterface java/util/Set.stream ()Ljava/util/stream/Stream; 1
      // 50: invokeinterface java/util/stream/Stream.sorted ()Ljava/util/stream/Stream; 1
      // 55: aload 0
      // 56: getfield qeaa361f143ee4a0894bd168fd9b30c66/qf4ccf8f5435d4a78bdca4d6a018b578e/abbabbaa.bbb Ljava/util/Map;
      // 59: invokeinterface java/util/Map.size ()I 1
      // 5e: ldc_w -1322926095
      // 61: ldc_w -1112976113
      // 64: ldc_w 275589770
      // 67: ixor
      // 68: invokestatic qeaa361f143ee4a0894bd168fd9b30c66/qf4ccf8f5435d4a78bdca4d6a018b578e/abbabbaa.baaba (II)I
      // 6b: ldc2_w 8633073260428411641
      // 6e: invokestatic qeaa361f143ee4a0894bd168fd9b30c66/qf4ccf8f5435d4a78bdca4d6a018b578e/abbabbaa.bbab (IJ)I
      // 71: isub
      // 72: i2l
      // 73: invokeinterface java/util/stream/Stream.limit (J)Ljava/util/stream/Stream; 3
      // 78: invokeinterface java/util/stream/Stream.toList ()Ljava/util/List; 1
      // 7d: aload 0
      // 7e: getfield qeaa361f143ee4a0894bd168fd9b30c66/qf4ccf8f5435d4a78bdca4d6a018b578e/abbabbaa.bbb Ljava/util/Map;
      // 81: dup
      // 82: invokestatic java/util/Objects.requireNonNull (Ljava/lang/Object;)Ljava/lang/Object;
      // 85: pop
      // 86: invokedynamic accept (Ljava/util/Map;)Ljava/util/function/Consumer; bsm=java/lang/invoke/LambdaMetafactory.metafactory (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;Ljava/lang/invoke/MethodType;Ljava/lang/invoke/MethodHandle;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[ (Ljava/lang/Object;)V, java/util/Map.remove (Ljava/lang/Object;)Ljava/lang/Object;, (Ljava/lang/Long;)V ]
      // 8b: invokeinterface java/util/List.forEach (Ljava/util/function/Consumer;)V 2
      // 90: return
   }

   public long aabbb() {
      return this.aabab - this.baaab();
   }

   private int abaaa() {
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
      // 06: ifne 1e
      // 09: getfield qeaa361f143ee4a0894bd168fd9b30c66/qf4ccf8f5435d4a78bdca4d6a018b578e/abbabbaa.baaa D
      // 0c: dconst_0
      // 0d: dcmpl
      // 0e: ifle 1d
      // 11: goto 15
      // 14: athrow
      // 15: aload 0
      // 16: getfield qeaa361f143ee4a0894bd168fd9b30c66/qf4ccf8f5435d4a78bdca4d6a018b578e/abbabbaa.baaa D
      // 19: goto 22
      // 1c: athrow
      // 1d: aload 0
      // 1e: getfield qeaa361f143ee4a0894bd168fd9b30c66/qf4ccf8f5435d4a78bdca4d6a018b578e/abbabbaa.aabaa I
      // 21: i2d
      // 22: dstore 2
      // 23: dload 2
      // 24: invokestatic java/lang/Math.round (D)J
      // 27: l2i
      // 28: ireturn
   }

   public synchronized void abaab(boolean var1, boolean var2) {
      this.aaaaa = var1;
      this.baa = var2;
   }

   private static String ababa(int var0, int var1) {
      int var9 = -1556733648;
      int var2 = (var0 ^ baaba(-1322926096, var9 ^ -1933346033)) & baaba(-1322926093, var9 ^ 1473833012);
      if (bbab[var2] == null) {
         char[] var3 = aabba[var2].toCharArray();

         int var4 = switch (var3[0] & baaba(-1322926094, var9 ^ -1000215239)) {
            case 0 -> baaba(-1322926083, var9 ^ -257612238);
            case 1 -> baaba(-1322926084, var9 ^ 156286883);
            case 2 -> baaba(-1322926081, var9 ^ -1769921879);
            case 3 -> 4;
            case 4 -> baaba(-1322926082, var9 ^ -1071213897);
            case 5 -> baaba(-1322926087, var9 ^ 1187556984);
            case 6 -> baaba(-1322926088, var9 ^ 1624506660);
            case 7 -> baaba(-1322926085, var9 ^ -239556385);
            case 8 -> baaba(-1322926086, var9 ^ -1135035154);
            case 9 -> baaba(-1322926139, var9 ^ -572936434);
            case 10 -> baaba(-1322926140, var9 ^ -1832295311);
            case 11 -> baaba(-1322926137, var9 ^ -1461932278);
            case 12 -> baaba(-1322926138, var9 ^ 879862033);
            case 13 -> baaba(-1322926143, var9 ^ -183599097);
            case 14 -> baaba(-1322926144, var9 ^ 889262652);
            case 15 -> baaba(-1322926141, var9 ^ -1269816151);
            case 16 -> baaba(-1322926142, var9 ^ -984603945);
            case 17 -> baaba(-1322926131, var9 ^ -1763942348);
            case 18 -> baaba(-1322926132, var9 ^ 1290895916);
            case 19 -> baaba(-1322926129, var9 ^ 1044831043);
            case 20 -> baaba(-1322926130, var9 ^ 1871531227);
            case 21 -> baaba(-1322926135, var9 ^ 154402442);
            case 22 -> baaba(-1322926136, var9 ^ -1781829140);
            case 23 -> baaba(-1322926133, var9 ^ 1074349877);
            case 24 -> baaba(-1322926134, var9 ^ -273178960);
            case 25 -> baaba(-1322926123, var9 ^ -1279213339);
            case 26 -> baaba(-1322926124, var9 ^ -1805067929);
            case 27 -> baaba(-1322926121, var9 ^ 1551803255);
            case 28 -> baaba(-1322926122, var9 ^ 1880517429);
            case 29 -> baaba(-1322926127, var9 ^ -1433027793);
            case 30 -> baaba(-1322926128, var9 ^ -1886626992);
            case 31 -> baaba(-1322926125, var9 ^ -790774839);
            case 32 -> baaba(-1322926126, var9 ^ -341697920);
            case 33 -> baaba(-1322926115, var9 ^ 1288083218);
            case 34 -> baaba(-1322926116, var9 ^ 1016455920);
            case 35 -> baaba(-1322926113, var9 ^ 455444938);
            case 36 -> baaba(-1322926114, var9 ^ -86086494);
            case 37 -> baaba(-1322926119, var9 ^ 1080018867);
            case 38 -> baaba(-1322926120, var9 ^ -39824048);
            case 39 -> baaba(-1322926117, var9 ^ 901536710);
            case 40 -> baaba(-1322926118, var9 ^ 1912395091);
            case 41 -> 5;
            case 42 -> baaba(-1322926299, var9 ^ -1968021773);
            case 43 -> baaba(-1322926300, var9 ^ -1870427871);
            case 44 -> baaba(-1322926297, var9 ^ -1355656098);
            case 45 -> baaba(-1322926298, var9 ^ 621247907);
            case 46 -> baaba(-1322926303, var9 ^ 1774702106);
            case 47 -> baaba(-1322926304, var9 ^ 1226919633);
            case 48 -> baaba(-1322926301, var9 ^ -425469102);
            case 49 -> baaba(-1322926302, var9 ^ 1084925497);
            case 50 -> baaba(-1322926291, var9 ^ -890758661);
            case 51 -> baaba(-1322926292, var9 ^ -1028400778);
            case 52 -> baaba(-1322926289, var9 ^ 1933624288);
            case 53 -> baaba(-1322926290, var9 ^ 117842507);
            case 54 -> baaba(-1322926295, var9 ^ 1638537709);
            case 55 -> baaba(-1322926296, var9 ^ -971678741);
            case 56 -> baaba(-1322926293, var9 ^ -1609180393);
            case 57 -> baaba(-1322926294, var9 ^ -1936292267);
            case 58 -> baaba(-1322926283, var9 ^ 1287900432);
            case 59 -> baaba(-1322926284, var9 ^ 1514283470);
            case 60 -> baaba(-1322926281, var9 ^ -747704552);
            case 61 -> baaba(-1322926282, var9 ^ 547796600);
            case 62 -> baaba(-1322926287, var9 ^ 1989088210);
            case 63 -> baaba(-1322926288, var9 ^ -982141235);
            case 64 -> baaba(-1322926285, var9 ^ 1975292566);
            case 65 -> baaba(-1322926286, var9 ^ -794386364);
            case 66 -> baaba(-1322926275, var9 ^ -431105160);
            case 67 -> baaba(-1322926276, var9 ^ -2032246873);
            case 68 -> baaba(-1322926273, var9 ^ 1677822328);
            case 69 -> baaba(-1322926274, var9 ^ 14219578);
            case 70 -> baaba(-1322926279, var9 ^ 1482190152);
            case 71 -> baaba(-1322926280, var9 ^ -984129796);
            case 72 -> baaba(-1322926277, var9 ^ -752680795);
            case 73 -> baaba(-1322926278, var9 ^ 1653984214);
            case 74 -> baaba(-1322926331, var9 ^ -323993842);
            case 75 -> baaba(-1322926332, var9 ^ 435173764);
            case 76 -> baaba(-1322926329, var9 ^ 1277806103);
            case 77 -> baaba(-1322926330, var9 ^ -835940162);
            case 78 -> baaba(-1322926335, var9 ^ 1338938417);
            case 79 -> baaba(-1322926336, var9 ^ 770566413);
            case 80 -> baaba(-1322926333, var9 ^ 781301399);
            case 81 -> baaba(-1322926334, var9 ^ -1423763416);
            case 82 -> baaba(-1322926323, var9 ^ -1871539128);
            case 83 -> baaba(-1322926324, var9 ^ 1712028997);
            case 84 -> 2;
            case 85 -> baaba(-1322926321, var9 ^ 391741432);
            case 86 -> 3;
            case 87 -> baaba(-1322926322, var9 ^ 566115995);
            case 88 -> 1;
            case 89 -> baaba(-1322926327, var9 ^ 544531943);
            case 90 -> baaba(-1322926328, var9 ^ -475435048);
            case 91 -> baaba(-1322926325, var9 ^ 693541077);
            case 92 -> baaba(-1322926326, var9 ^ -560615039);
            case 93 -> baaba(-1322926315, var9 ^ 1427896963);
            case 94 -> baaba(-1322926316, var9 ^ 722910403);
            case 95 -> baaba(-1322926313, var9 ^ 341637503);
            case 96 -> baaba(-1322926314, var9 ^ -1845727274);
            case 97 -> baaba(-1322926319, var9 ^ -423215918);
            case 98 -> baaba(-1322926320, var9 ^ -135328317);
            case 99 -> baaba(-1322926317, var9 ^ 1736005649);
            case 100 -> baaba(-1322926318, var9 ^ 1224252280);
            case 101 -> baaba(-1322926307, var9 ^ -1217603805);
            case 102 -> baaba(-1322926308, var9 ^ 382637362);
            case 103 -> baaba(-1322926305, var9 ^ 912310834);
            case 104 -> baaba(-1322926306, var9 ^ -1203887273);
            case 105 -> baaba(-1322926311, var9 ^ -100231077);
            case 106 -> baaba(-1322926312, var9 ^ -330249847);
            case 107 -> baaba(-1322926309, var9 ^ 256191850);
            case 108 -> baaba(-1322926310, var9 ^ -342532908);
            case 109 -> baaba(-1322926235, var9 ^ -1635677843);
            case 110 -> baaba(-1322926236, var9 ^ 1592340719);
            case 111 -> baaba(-1322926233, var9 ^ -1210668437);
            case 112 -> baaba(-1322926234, var9 ^ 102301461);
            case 113 -> baaba(-1322926239, var9 ^ 757757878);
            case 114 -> baaba(-1322926240, var9 ^ 379184401);
            case 115 -> baaba(-1322926237, var9 ^ 601801252);
            case 116 -> baaba(-1322926238, var9 ^ -1672943225);
            case 117 -> baaba(-1322926227, var9 ^ -327983640);
            case 118 -> baaba(-1322926228, var9 ^ 420549032);
            case 119 -> baaba(-1322926225, var9 ^ -1563324908);
            case 120 -> baaba(-1322926226, var9 ^ -273810850);
            case 121 -> baaba(-1322926231, var9 ^ 1012314693);
            case 122 -> baaba(-1322926232, var9 ^ -2093793703);
            case 123 -> baaba(-1322926229, var9 ^ -1398865697);
            case 124 -> baaba(-1322926230, var9 ^ 678135589);
            case 125 -> baaba(-1322926219, var9 ^ 630208709);
            case 126 -> baaba(-1322926220, var9 ^ 1267843488);
            case 127 -> baaba(-1322926217, var9 ^ 1588143962);
            case 128 -> baaba(-1322926218, var9 ^ 2026103749);
            case 129 -> baaba(-1322926223, var9 ^ 156265867);
            case 130 -> baaba(-1322926224, var9 ^ 1202824953);
            case 131 -> baaba(-1322926221, var9 ^ -303375093);
            case 132 -> baaba(-1322926222, var9 ^ 1240242842);
            case 133 -> baaba(-1322926211, var9 ^ 1586319404);
            case 134 -> baaba(-1322926212, var9 ^ 1111219329);
            case 135 -> baaba(-1322926209, var9 ^ 275507807);
            case 136 -> baaba(-1322926210, var9 ^ -755834024);
            case 137 -> baaba(-1322926215, var9 ^ 741963631);
            case 138 -> baaba(-1322926216, var9 ^ 834756525);
            case 139 -> baaba(-1322926213, var9 ^ 94657293);
            case 140 -> baaba(-1322926214, var9 ^ 1427685725);
            case 141 -> baaba(-1322926267, var9 ^ 683632567);
            case 142 -> baaba(-1322926268, var9 ^ 1756992140);
            case 143 -> baaba(-1322926265, var9 ^ 176606226);
            case 144 -> baaba(-1322926266, var9 ^ 1000261981);
            case 145 -> baaba(-1322926271, var9 ^ 277180953);
            case 146 -> baaba(-1322926272, var9 ^ 1794253005);
            case 147 -> baaba(-1322926269, var9 ^ 675699997);
            case 148 -> baaba(-1322926270, var9 ^ 1404570968);
            case 149 -> baaba(-1322926259, var9 ^ -692558043);
            case 150 -> baaba(-1322926260, var9 ^ 1715187349);
            case 151 -> baaba(-1322926257, var9 ^ 2033282652);
            case 152 -> baaba(-1322926258, var9 ^ -1059435569);
            case 153 -> baaba(-1322926263, var9 ^ -464260213);
            case 154 -> baaba(-1322926264, var9 ^ -1531819119);
            case 155 -> baaba(-1322926261, var9 ^ 1692307402);
            case 156 -> baaba(-1322926262, var9 ^ -1569695217);
            case 157 -> baaba(-1322926251, var9 ^ 1335971027);
            case 158 -> baaba(-1322926252, var9 ^ -1174655886);
            case 159 -> baaba(-1322926249, var9 ^ 616169820);
            case 160 -> baaba(-1322926250, var9 ^ 1037666794);
            case 161 -> baaba(-1322926255, var9 ^ -136043179);
            case 162 -> baaba(-1322926256, var9 ^ 1954542173);
            case 163 -> baaba(-1322926253, var9 ^ 2051613856);
            case 164 -> baaba(-1322926254, var9 ^ 2121050851);
            case 165 -> baaba(-1322926243, var9 ^ 725715592);
            case 166 -> baaba(-1322926244, var9 ^ -926851018);
            case 167 -> baaba(-1322926241, var9 ^ -1583687802);
            case 168 -> baaba(-1322926242, var9 ^ 1074455895);
            case 169 -> baaba(-1322926247, var9 ^ 239931154);
            case 170 -> baaba(-1322926248, var9 ^ -2001220609);
            case 171 -> baaba(-1322926245, var9 ^ -1687819820);
            case 172 -> baaba(-1322926246, var9 ^ -71348797);
            case 173 -> baaba(-1322926427, var9 ^ 1688159371);
            case 174 -> baaba(-1322926428, var9 ^ 1643066194);
            case 175 -> baaba(-1322926425, var9 ^ -151846025);
            case 176 -> baaba(-1322926426, var9 ^ -972458451);
            case 177 -> baaba(-1322926431, var9 ^ 33949460);
            case 178 -> baaba(-1322926432, var9 ^ -441187191);
            case 179 -> baaba(-1322926429, var9 ^ 803376635);
            case 180 -> baaba(-1322926430, var9 ^ -1340249936);
            case 181 -> baaba(-1322926419, var9 ^ -1253259105);
            case 182 -> baaba(-1322926420, var9 ^ 1610609996);
            case 183 -> baaba(-1322926417, var9 ^ 2126443736);
            case 184 -> baaba(-1322926418, var9 ^ -1079760976);
            case 185 -> baaba(-1322926423, var9 ^ -1192715234);
            case 186 -> baaba(-1322926424, var9 ^ 1764186500);
            case 187 -> baaba(-1322926421, var9 ^ 771447633);
            case 188 -> baaba(-1322926422, var9 ^ -564798432);
            case 189 -> baaba(-1322926411, var9 ^ 526683579);
            case 190 -> baaba(-1322926412, var9 ^ -118877261);
            case 191 -> baaba(-1322926409, var9 ^ 1963345468);
            case 192 -> 0;
            case 193 -> baaba(-1322926410, var9 ^ 1762845558);
            case 194 -> baaba(-1322926415, var9 ^ 1067990250);
            case 195 -> baaba(-1322926416, var9 ^ -1918825257);
            case 196 -> baaba(-1322926413, var9 ^ -497994284);
            case 197 -> baaba(-1322926414, var9 ^ -1326152800);
            case 198 -> baaba(-1322926403, var9 ^ 55149927);
            case 199 -> baaba(-1322926404, var9 ^ -1012265721);
            case 200 -> baaba(-1322926401, var9 ^ -1622641057);
            case 201 -> baaba(-1322926402, var9 ^ -1114257635);
            case 202 -> baaba(-1322926407, var9 ^ -80617165);
            case 203 -> baaba(-1322926408, var9 ^ 377311013);
            case 204 -> baaba(-1322926405, var9 ^ -1191328758);
            case 205 -> baaba(-1322926406, var9 ^ 1060610983);
            case 206 -> baaba(-1322926459, var9 ^ -1657274523);
            case 207 -> baaba(-1322926460, var9 ^ -1055780572);
            case 208 -> baaba(-1322926457, var9 ^ -758415165);
            case 209 -> baaba(-1322926458, var9 ^ 1061188827);
            case 210 -> baaba(-1322926463, var9 ^ 2076978582);
            case 211 -> baaba(-1322926464, var9 ^ -422080003);
            case 212 -> baaba(-1322926461, var9 ^ -60624540);
            case 213 -> baaba(-1322926462, var9 ^ 663617807);
            case 214 -> baaba(-1322926451, var9 ^ 822150755);
            case 215 -> baaba(-1322926452, var9 ^ 1275125863);
            case 216 -> baaba(-1322926449, var9 ^ 785086748);
            case 217 -> baaba(-1322926450, var9 ^ -1285679421);
            case 218 -> baaba(-1322926455, var9 ^ 767551547);
            case 219 -> baaba(-1322926456, var9 ^ -659475365);
            case 220 -> baaba(-1322926453, var9 ^ -382187192);
            case 221 -> baaba(-1322926454, var9 ^ 1711660299);
            case 222 -> baaba(-1322926443, var9 ^ 693018);
            case 223 -> baaba(-1322926444, var9 ^ 1784984761);
            case 224 -> baaba(-1322926441, var9 ^ 789154696);
            case 225 -> baaba(-1322926442, var9 ^ -99448289);
            case 226 -> baaba(-1322926447, var9 ^ 849657065);
            case 227 -> baaba(-1322926448, var9 ^ 71439686);
            case 228 -> baaba(-1322926445, var9 ^ -100587514);
            case 229 -> baaba(-1322926446, var9 ^ -960866003);
            case 230 -> baaba(-1322926435, var9 ^ 9410361);
            case 231 -> baaba(-1322926436, var9 ^ -640958531);
            case 232 -> baaba(-1322926433, var9 ^ -513315818);
            case 233 -> baaba(-1322926434, var9 ^ -141503445);
            case 234 -> baaba(-1322926439, var9 ^ -1522557417);
            case 235 -> baaba(-1322926440, var9 ^ -75005961);
            case 236 -> baaba(-1322926437, var9 ^ -1777628161);
            case 237 -> baaba(-1322926438, var9 ^ 423842518);
            case 238 -> baaba(-1322926363, var9 ^ -513613404);
            case 239 -> baaba(-1322926364, var9 ^ 570898384);
            case 240 -> baaba(-1322926361, var9 ^ -1459279987);
            case 241 -> baaba(-1322926362, var9 ^ -291474367);
            case 242 -> baaba(-1322926367, var9 ^ 1615278787);
            case 243 -> baaba(-1322926368, var9 ^ -769821649);
            case 244 -> baaba(-1322926365, var9 ^ -1792914313);
            case 245 -> baaba(-1322926366, var9 ^ 350590098);
            case 246 -> baaba(-1322926355, var9 ^ -933001813);
            case 247 -> baaba(-1322926356, var9 ^ 30452914);
            case 248 -> baaba(-1322926353, var9 ^ 61765048);
            case 249 -> baaba(-1322926354, var9 ^ 1362159299);
            case 250 -> baaba(-1322926359, var9 ^ 1447132262);
            case 251 -> baaba(-1322926360, var9 ^ 1734941212);
            case 252 -> baaba(-1322926357, var9 ^ 866448821);
            case 253 -> baaba(-1322926358, var9 ^ -1406292634);
            case 254 -> baaba(-1322926347, var9 ^ 1914937709);
            default -> baaba(-1322926348, var9 ^ 1099171890);
         };
         int var5 = (var1 & baaba(-1322926345, var9 ^ -1959647974)) - var4;
         if (var5 < 0) {
            var5 += 256;
         }

         int var6 = ((var1 & baaba(-1322926346, var9 ^ -1106257232)) >>> baaba(-1322926351, var9 ^ 2135305129)) - var4;
         if (var6 < 0) {
            var6 += 256;
         }

         for (int var7 = 0; var7 < var3.length; var7++) {
            int var8 = var7 % 2;
            char var10002 = var3[var7];
            if (var8 == 0) {
               var3[var7] = (char)(var10002 ^ var5);
               var5 = ((var5 >>> 3 | var5 << 5) ^ var3[var7]) & baaba(-1322926352, var9 ^ 1509851341);
            } else {
               var3[var7] = (char)(var10002 ^ var6);
               var6 = ((var6 >>> 3 | var6 << 5) ^ var3[var7]) & baaba(-1322926349, var9 ^ -532124077);
            }
         }

         bbab[var2] = new String(var3).intern();
      }

      return bbab[var2];
   }

   public int ababb() {
      return this.ab;
   }

   private static long abbaa(double param0) {
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
      // 06: ifne 16
      // 09: dconst_0
      // 0a: dcmpg
      // 0b: ifgt 15
      // 0e: goto 12
      // 11: athrow
      // 12: lconst_0
      // 13: lreturn
      // 14: athrow
      // 15: dload 0
      // 16: invokestatic java/lang/Math.round (D)J
      // 19: lstore 3
      // 1a: lconst_1
      // 1b: lstore 5
      // 1d: lload 3
      // 1e: lload 5
      // 20: ladd
      // 21: ldc_w -1322926350
      // 24: ldc_w -627683898
      // 27: ldc_w -1387403153
      // 2a: ixor
      // 2b: invokestatic qeaa361f143ee4a0894bd168fd9b30c66/qf4ccf8f5435d4a78bdca4d6a018b578e/abbabbaa.baaba (II)I
      // 2e: ldc2_w 8575551567626260891
      // 31: invokestatic qeaa361f143ee4a0894bd168fd9b30c66/qf4ccf8f5435d4a78bdca4d6a018b578e/abbabbaa.aaaa (IJ)J
      // 34: ldiv
      // 35: ldc_w -1322926339
      // 38: ldc_w -627683898
      // 3b: ldc_w 1652386392
      // 3e: ixor
      // 3f: invokestatic qeaa361f143ee4a0894bd168fd9b30c66/qf4ccf8f5435d4a78bdca4d6a018b578e/abbabbaa.baaba (II)I
      // 42: ldc2_w 3911011026264618353
      // 45: invokestatic qeaa361f143ee4a0894bd168fd9b30c66/qf4ccf8f5435d4a78bdca4d6a018b578e/abbabbaa.aaaa (IJ)J
      // 48: lmul
      // 49: lstore 7
      // 4b: lconst_0
      // 4c: lload 7
      // 4e: invokestatic java/lang/Math.max (JJ)J
      // 51: lreturn
   }

   public void abbab(boolean var1) {
      this.aaaa = var1;
   }

   public void abbba(long var1, long var3) {
      int var10000 = baaabbaa.bba;
      aabaaaab var6 = (aabaaaab)this.bbb.get(var1);
      int var5 = var10000;

      label20: {
         try {
            var8 = var6;
            if (var5 != 0) {
               break label20;
            }

            if (var6 == null) {
               return;
            }
         } catch (MatchException var7) {
            throw var7;
         }

         var8 = var6;
      }

      var8.ba = var3;
   }

   public boolean a() {
      return this.bba;
   }

   public boolean abbbb() {
      return this.aaaa;
   }

   private static String baabb(int var0, int var1) {
      int var3 = var0 ^ -88164444;
      char[] var4 = abaab[var3].toCharArray();
      StackTraceElement[] var2 = (StackTraceElement[])ababa[var3];
      StackTraceElement[] var5;
      if (var2 != null) {
         var5 = var2;
      } else {
         var5 = new Throwable().getStackTrace();
         ababa[var3] = var5;
      }

      StackTraceElement var6 = var5[1];
      int var7 = (var6.getClassName().hashCode() ^ var6.getMethodName().hashCode()) >> 16 ^ -641599963;
      int var8 = 0;

      do {
         var4[var8] = (char)(var4[var8] ^ switch (var8 & 31) {
            default -> 247;
            case 1 -> 13;
            case 2 -> 196;
            case 3 -> 127;
            case 4 -> 196;
            case 5 -> 159;
            case 6 -> 42;
            case 7 -> 167;
            case 8 -> 200;
            case 9 -> 220;
            case 10 -> 133;
            case 11 -> 203;
            case 12 -> 19;
            case 13 -> 43;
            case 14 -> 52;
            case 15 -> 131;
            case 16 -> 240;
            case 17 -> 230;
            case 18 -> 110;
            case 19 -> 47;
            case 20 -> 183;
            case 21 -> 176;
            case 22 -> 43;
            case 23 -> 174;
            case 24 -> 211;
            case 25 -> 45;
            case 26 -> 90;
            case 27 -> 165;
            case 28 -> 115;
            case 29 -> 27;
            case 30 -> 134;
            case 31 -> 225;
         } ^ var1 >> 16 ^ var7);
      } while (++var8 < var4.length);

      return new String(var4).intern();
   }

   public static boolean baaaa(String param0) {
      // $VF: Couldn't be decompiled
      // Please report this to the Vineflower issue tracker, at https://github.com/Vineflower/vineflower/issues with a copy of the class file (if you have the rights to distribute it!)
      // java.lang.RuntimeException: parsing failure!
      //   at org.jetbrains.java.decompiler.modules.decompiler.decompose.DomHelper.parseGraph(DomHelper.java:211)
      //   at org.jetbrains.java.decompiler.main.rels.MethodProcessor.codeToJava(MethodProcessor.java:166)
      //
      // Bytecode:
      // 000: ldc_w 504920726
      // 003: istore 2
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
      // 018: ldc_w -1322926340
      // 01b: iload 2
      // 01c: ldc_w -1738273272
      // 01f: ixor
      // 020: invokestatic qeaa361f143ee4a0894bd168fd9b30c66/qf4ccf8f5435d4a78bdca4d6a018b578e/abbabbaa.baaba (II)I
      // 023: ldc_w -1322926337
      // 026: iload 2
      // 027: ldc_w -285832217
      // 02a: ixor
      // 02b: invokestatic qeaa361f143ee4a0894bd168fd9b30c66/qf4ccf8f5435d4a78bdca4d6a018b578e/abbabbaa.baaba (II)I
      // 02e: invokestatic qeaa361f143ee4a0894bd168fd9b30c66/qf4ccf8f5435d4a78bdca4d6a018b578e/abbabbaa.ababa (II)Ljava/lang/String;
      // 031: invokestatic qeaa361f143ee4a0894bd168fd9b30c66/qf4ccf8f5435d4a78bdca4d6a018b578e/aabbaaaba.abba (Ljava/lang/String;)Ljava/lang/String;
      // 034: invokevirtual java/lang/String.endsWith (Ljava/lang/String;)Z
      // 037: iload 1
      // 038: ifne 0ff
      // 03b: ifne 0fe
      // 03e: goto 042
      // 041: athrow
      // 042: aload 0
      // 043: ldc_w -1322926338
      // 046: iload 2
      // 047: ldc_w -829067624
      // 04a: ixor
      // 04b: invokestatic qeaa361f143ee4a0894bd168fd9b30c66/qf4ccf8f5435d4a78bdca4d6a018b578e/abbabbaa.baaba (II)I
      // 04e: ldc_w -1322926343
      // 051: iload 2
      // 052: ldc_w -742191668
      // 055: ixor
      // 056: invokestatic qeaa361f143ee4a0894bd168fd9b30c66/qf4ccf8f5435d4a78bdca4d6a018b578e/abbabbaa.baaba (II)I
      // 059: invokestatic qeaa361f143ee4a0894bd168fd9b30c66/qf4ccf8f5435d4a78bdca4d6a018b578e/abbabbaa.ababa (II)Ljava/lang/String;
      // 05c: invokestatic qeaa361f143ee4a0894bd168fd9b30c66/qf4ccf8f5435d4a78bdca4d6a018b578e/aabbaaaba.abba (Ljava/lang/String;)Ljava/lang/String;
      // 05f: invokevirtual java/lang/String.endsWith (Ljava/lang/String;)Z
      // 062: iload 1
      // 063: ifne 0ff
      // 066: goto 06a
      // 069: athrow
      // 06a: ifne 0fe
      // 06d: goto 071
      // 070: athrow
      // 071: aload 0
      // 072: ldc_w -1322926344
      // 075: iload 2
      // 076: ldc_w -244612948
      // 079: ixor
      // 07a: invokestatic qeaa361f143ee4a0894bd168fd9b30c66/qf4ccf8f5435d4a78bdca4d6a018b578e/abbabbaa.baaba (II)I
      // 07d: ldc_w -1322926341
      // 080: iload 2
      // 081: ldc_w -1012247331
      // 084: ixor
      // 085: invokestatic qeaa361f143ee4a0894bd168fd9b30c66/qf4ccf8f5435d4a78bdca4d6a018b578e/abbabbaa.baaba (II)I
      // 088: invokestatic qeaa361f143ee4a0894bd168fd9b30c66/qf4ccf8f5435d4a78bdca4d6a018b578e/abbabbaa.ababa (II)Ljava/lang/String;
      // 08b: invokestatic qeaa361f143ee4a0894bd168fd9b30c66/qf4ccf8f5435d4a78bdca4d6a018b578e/aabbaaaba.abba (Ljava/lang/String;)Ljava/lang/String;
      // 08e: invokevirtual java/lang/String.endsWith (Ljava/lang/String;)Z
      // 091: iload 1
      // 092: ifne 0ff
      // 095: goto 099
      // 098: athrow
      // 099: ifne 0fe
      // 09c: goto 0a0
      // 09f: athrow
      // 0a0: aload 0
      // 0a1: ldc_w -1322926342
      // 0a4: iload 2
      // 0a5: ldc_w 1641397225
      // 0a8: ixor
      // 0a9: invokestatic qeaa361f143ee4a0894bd168fd9b30c66/qf4ccf8f5435d4a78bdca4d6a018b578e/abbabbaa.baaba (II)I
      // 0ac: ldc_w -1322926395
      // 0af: iload 2
      // 0b0: ldc_w -366895490
      // 0b3: ixor
      // 0b4: invokestatic qeaa361f143ee4a0894bd168fd9b30c66/qf4ccf8f5435d4a78bdca4d6a018b578e/abbabbaa.baaba (II)I
      // 0b7: invokestatic qeaa361f143ee4a0894bd168fd9b30c66/qf4ccf8f5435d4a78bdca4d6a018b578e/abbabbaa.ababa (II)Ljava/lang/String;
      // 0ba: invokestatic qeaa361f143ee4a0894bd168fd9b30c66/qf4ccf8f5435d4a78bdca4d6a018b578e/aabbaaaba.abba (Ljava/lang/String;)Ljava/lang/String;
      // 0bd: invokevirtual java/lang/String.endsWith (Ljava/lang/String;)Z
      // 0c0: iload 1
      // 0c1: ifne 0ff
      // 0c4: goto 0c8
      // 0c7: athrow
      // 0c8: ifne 0fe
      // 0cb: goto 0cf
      // 0ce: athrow
      // 0cf: aload 0
      // 0d0: ldc_w -1322926396
      // 0d3: iload 2
      // 0d4: ldc_w 642210589
      // 0d7: ixor
      // 0d8: invokestatic qeaa361f143ee4a0894bd168fd9b30c66/qf4ccf8f5435d4a78bdca4d6a018b578e/abbabbaa.baaba (II)I
      // 0db: ldc_w -1322926393
      // 0de: iload 2
      // 0df: ldc_w 85627251
      // 0e2: ixor
      // 0e3: invokestatic qeaa361f143ee4a0894bd168fd9b30c66/qf4ccf8f5435d4a78bdca4d6a018b578e/abbabbaa.baaba (II)I
      // 0e6: invokestatic qeaa361f143ee4a0894bd168fd9b30c66/qf4ccf8f5435d4a78bdca4d6a018b578e/abbabbaa.ababa (II)Ljava/lang/String;
      // 0e9: invokestatic qeaa361f143ee4a0894bd168fd9b30c66/qf4ccf8f5435d4a78bdca4d6a018b578e/aabbaaaba.abba (Ljava/lang/String;)Ljava/lang/String;
      // 0ec: invokevirtual java/lang/String.endsWith (Ljava/lang/String;)Z
      // 0ef: iload 1
      // 0f0: ifne 0ff
      // 0f3: goto 0f7
      // 0f6: athrow
      // 0f7: ifeq 102
      // 0fa: goto 0fe
      // 0fd: athrow
      // 0fe: bipush 1
      // 0ff: goto 103
      // 102: bipush 0
      // 103: ireturn
   }

   public int b() {
      return this.abaaa();
   }

   public long baaab() {
      return this.aabab / aaaa(baaba(-1322926394, 305982193 ^ 1120125021), 3911011026264618353L);
   }
}
