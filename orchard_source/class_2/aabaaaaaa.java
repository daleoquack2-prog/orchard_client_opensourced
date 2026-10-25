package nsc;

import java.lang.reflect.Method;
import net.fabricmc.api.EnvType;
import net.fabricmc.api.Environment;
import net.minecraft.class_310;
import net.minecraft.class_4185;
import net.minecraft.class_419;
import net.minecraft.class_437;
import net.minecraft.class_442;
import net.minecraft.class_500;
import net.minecraft.class_642;

@Environment(EnvType.CLIENT)
public final class aabaaaaaa extends abbaabbaa {
   private static final String[] aa;
   private static final String[] baa;
   private static final int[] abb;
   private final bababa ab;
   private static final long ba;
   private Object bb;
   private long aaa;
   private static final String[] aab;
   private static final Object[] bab;
   private class_642 aba;

   private class_437 aa() {
      return new class_500(new class_442());
   }

   private static int b(int var0, int var1) {
      int var2 = abb[var0 ^ 1058332324] ^ var1 ^ var0;
      var2 += 51046;
      var2 += 20869;
      var2 ^= 21413;
      var2 ^= 36343;
      var2 += 22101;
      return var2 + 44727;
   }

   private boolean ab(class_4185 param1) {
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
      // 006: ifne 014
      // 009: ifnonnull 013
      // 00c: goto 010
      // 00f: athrow
      // 010: bipush 0
      // 011: ireturn
      // 012: athrow
      // 013: aload 1
      // 014: invokevirtual java/lang/Object.getClass ()Ljava/lang/Class;
      // 017: ldc 1058332324
      // 019: ldc 404959417
      // 01b: ldc 1241458163
      // 01d: ixor
      // 01e: invokestatic qeaa361f143ee4a0894bd168fd9b30c66/qf4ccf8f5435d4a78bdca4d6a018b578e/aabaaaaaa.b (II)I
      // 021: ldc 1058332325
      // 023: ldc 404959417
      // 025: ldc 1632785334
      // 027: ixor
      // 028: invokestatic qeaa361f143ee4a0894bd168fd9b30c66/qf4ccf8f5435d4a78bdca4d6a018b578e/aabaaaaaa.b (II)I
      // 02b: invokestatic qeaa361f143ee4a0894bd168fd9b30c66/qf4ccf8f5435d4a78bdca4d6a018b578e/aabaaaaaa.aba (II)Ljava/lang/String;
      // 02e: invokestatic qeaa361f143ee4a0894bd168fd9b30c66/qf4ccf8f5435d4a78bdca4d6a018b578e/aabbaaaba.abba (Ljava/lang/String;)Ljava/lang/String;
      // 031: bipush 0
      // 032: anewarray 78
      // 035: invokevirtual java/lang/Class.getMethod (Ljava/lang/String;[Ljava/lang/Class;)Ljava/lang/reflect/Method;
      // 038: astore 3
      // 039: aload 3
      // 03a: aload 1
      // 03b: bipush 0
      // 03c: anewarray 57
      // 03f: invokevirtual java/lang/reflect/Method.invoke (Ljava/lang/Object;[Ljava/lang/Object;)Ljava/lang/Object;
      // 042: pop
      // 043: bipush 1
      // 044: ireturn
      // 045: astore 3
      // 046: aload 1
      // 047: invokevirtual java/lang/Object.getClass ()Ljava/lang/Class;
      // 04a: invokevirtual java/lang/Class.getMethods ()[Ljava/lang/reflect/Method;
      // 04d: astore 3
      // 04e: aload 3
      // 04f: arraylength
      // 050: istore 4
      // 052: bipush 0
      // 053: istore 5
      // 055: iload 5
      // 057: iload 4
      // 059: if_icmpge 10f
      // 05c: aload 3
      // 05d: iload 5
      // 05f: aaload
      // 060: astore 6
      // 062: iload 2
      // 063: ifne 10b
      // 066: aload 6
      // 068: invokevirtual java/lang/reflect/Method.getName ()Ljava/lang/String;
      // 06b: ldc 1058332326
      // 06d: ldc 404959417
      // 06f: ldc 1000512961
      // 071: ixor
      // 072: invokestatic qeaa361f143ee4a0894bd168fd9b30c66/qf4ccf8f5435d4a78bdca4d6a018b578e/aabaaaaaa.b (II)I
      // 075: ldc 1058332327
      // 077: ldc 404959417
      // 079: ldc 1296886094
      // 07b: ixor
      // 07c: invokestatic qeaa361f143ee4a0894bd168fd9b30c66/qf4ccf8f5435d4a78bdca4d6a018b578e/aabaaaaaa.b (II)I
      // 07f: invokestatic qeaa361f143ee4a0894bd168fd9b30c66/qf4ccf8f5435d4a78bdca4d6a018b578e/aabaaaaaa.aba (II)Ljava/lang/String;
      // 082: invokestatic qeaa361f143ee4a0894bd168fd9b30c66/qf4ccf8f5435d4a78bdca4d6a018b578e/aabbaaaba.abba (Ljava/lang/String;)Ljava/lang/String;
      // 085: invokevirtual java/lang/String.equals (Ljava/lang/Object;)Z
      // 088: iload 2
      // 089: ifne 110
      // 08c: goto 090
      // 08f: athrow
      // 090: ifeq 108
      // 093: goto 097
      // 096: athrow
      // 097: aload 6
      // 099: iload 2
      // 09a: ifne 0ba
      // 09d: goto 0a1
      // 0a0: athrow
      // 0a1: invokevirtual java/lang/reflect/Method.getParameterCount ()I
      // 0a4: bipush 1
      // 0a5: if_icmpeq 0b4
      // 0a8: goto 0ac
      // 0ab: athrow
      // 0ac: iload 2
      // 0ad: ifeq 108
      // 0b0: goto 0b4
      // 0b3: athrow
      // 0b4: aload 6
      // 0b6: goto 0ba
      // 0b9: athrow
      // 0ba: invokevirtual java/lang/reflect/Method.getParameterTypes ()[Ljava/lang/Class;
      // 0bd: bipush 0
      // 0be: aaload
      // 0bf: astore 7
      // 0c1: aload 7
      // 0c3: iload 2
      // 0c4: ifne 0eb
      // 0c7: invokevirtual java/lang/Class.isInterface ()Z
      // 0ca: ifeq 0ee
      // 0cd: goto 0d1
      // 0d0: athrow
      // 0d1: aload 7
      // 0d3: invokevirtual java/lang/Class.getClassLoader ()Ljava/lang/ClassLoader;
      // 0d6: bipush 1
      // 0d7: anewarray 78
      // 0da: dup
      // 0db: bipush 0
      // 0dc: aload 7
      // 0de: aastore
      // 0df: invokedynamic invoke ()Ljava/lang/reflect/InvocationHandler; bsm=java/lang/invoke/LambdaMetafactory.metafactory (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;Ljava/lang/invoke/MethodType;Ljava/lang/invoke/MethodHandle;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[ (Ljava/lang/Object;Ljava/lang/reflect/Method;[Ljava/lang/Object;)Ljava/lang/Object;, qeaa361f143ee4a0894bd168fd9b30c66/qf4ccf8f5435d4a78bdca4d6a018b578e/aabaaaaaa.bab (Ljava/lang/Object;Ljava/lang/reflect/Method;[Ljava/lang/Object;)Ljava/lang/Object;, (Ljava/lang/Object;Ljava/lang/reflect/Method;[Ljava/lang/Object;)Ljava/lang/Object; ]
      // 0e4: invokestatic java/lang/reflect/Proxy.newProxyInstance (Ljava/lang/ClassLoader;[Ljava/lang/Class;Ljava/lang/reflect/InvocationHandler;)Ljava/lang/Object;
      // 0e7: goto 0eb
      // 0ea: athrow
      // 0eb: goto 0ef
      // 0ee: aconst_null
      // 0ef: astore 8
      // 0f1: aload 6
      // 0f3: aload 1
      // 0f4: bipush 1
      // 0f5: anewarray 57
      // 0f8: dup
      // 0f9: bipush 0
      // 0fa: aload 8
      // 0fc: aastore
      // 0fd: invokevirtual java/lang/reflect/Method.invoke (Ljava/lang/Object;[Ljava/lang/Object;)Ljava/lang/Object;
      // 100: pop
      // 101: bipush 1
      // 102: ireturn
      // 103: astore 9
      // 105: aload 9
      // 107: pop
      // 108: iinc 5 1
      // 10b: iload 2
      // 10c: ifeq 055
      // 10f: bipush 0
      // 110: ireturn
   }

   public aabaaaaaa() {
      int var1 = 1508012980;
      super(
         aabbaaaba.aaab(aba(b(1058332320, var1 ^ -171110193), b(1058332321, var1 ^ 1457934733))),
         bbaabbba.bba,
         aabbaaaba.aaab(aba(b(1058332322, var1 ^ 963742073), b(1058332323, var1 ^ 1925031092)))
      );
      this.ab = (bababa)this.abbbaaa(
         new bababa(
               aabbaaaba.aaab(aba(b(1058332332, var1 ^ -58243922), b(1058332333, var1 ^ 547846582))), 3.0, 0.5, 30.0, 0.5
            )
            .bba(aabbaaaba.aaab(aba(b(1058332334, var1 ^ 1325349912), b(1058332335, var1 ^ -1433265835))))
      );
   }

   @Override
   public void bbaa() {
      // $VF: Couldn't be decompiled
      // Please report this to the Vineflower issue tracker, at https://github.com/Vineflower/vineflower/issues with a copy of the class file (if you have the rights to distribute it!)
      // java.lang.RuntimeException: parsing failure!
      //   at org.jetbrains.java.decompiler.modules.decompiler.decompose.DomHelper.parseGraph(DomHelper.java:211)
      //   at org.jetbrains.java.decompiler.main.rels.MethodProcessor.codeToJava(MethodProcessor.java:166)
      //
      // Bytecode:
      // 000: getstatic qeaa361f143ee4a0894bd168fd9b30c66/qf4ccf8f5435d4a78bdca4d6a018b578e/baaabbaa.bba I
      // 003: istore 1
      // 004: iload 1
      // 005: invokestatic net/minecraft/class_310.method_1551 ()Lnet/minecraft/class_310;
      // 008: astore 2
      // 009: ifne 01f
      // 00c: aload 2
      // 00d: ifnonnull 01a
      // 010: goto 014
      // 013: athrow
      // 014: aload 0
      // 015: invokevirtual qeaa361f143ee4a0894bd168fd9b30c66/qf4ccf8f5435d4a78bdca4d6a018b578e/aabaaaaaa.bba ()V
      // 018: return
      // 019: athrow
      // 01a: aload 0
      // 01b: aload 2
      // 01c: invokevirtual qeaa361f143ee4a0894bd168fd9b30c66/qf4ccf8f5435d4a78bdca4d6a018b578e/aabaaaaaa.aab (Lnet/minecraft/class_310;)V
      // 01f: aload 2
      // 020: getfield net/minecraft/class_310.field_1755 Lnet/minecraft/class_437;
      // 023: astore 4
      // 025: iload 1
      // 026: ifne 047
      // 029: aload 4
      // 02b: instanceof net/minecraft/class_419
      // 02e: ifeq 03f
      // 031: goto 035
      // 034: athrow
      // 035: aload 4
      // 037: checkcast net/minecraft/class_419
      // 03a: astore 3
      // 03b: iload 1
      // 03c: ifeq 048
      // 03f: aload 0
      // 040: invokevirtual qeaa361f143ee4a0894bd168fd9b30c66/qf4ccf8f5435d4a78bdca4d6a018b578e/aabaaaaaa.bba ()V
      // 043: goto 047
      // 046: athrow
      // 047: return
      // 048: aload 0
      // 049: iload 1
      // 04a: ifne 05d
      // 04d: aload 2
      // 04e: invokevirtual qeaa361f143ee4a0894bd168fd9b30c66/qf4ccf8f5435d4a78bdca4d6a018b578e/aabaaaaaa.bb (Lnet/minecraft/class_310;)Z
      // 051: ifne 061
      // 054: goto 058
      // 057: athrow
      // 058: aload 0
      // 059: goto 05d
      // 05c: athrow
      // 05d: invokevirtual qeaa361f143ee4a0894bd168fd9b30c66/qf4ccf8f5435d4a78bdca4d6a018b578e/aabaaaaaa.bba ()V
      // 060: return
      // 061: invokestatic java/lang/System.nanoTime ()J
      // 064: getstatic qeaa361f143ee4a0894bd168fd9b30c66/qf4ccf8f5435d4a78bdca4d6a018b578e/aabaaaaaa.ba J
      // 067: ldiv
      // 068: lstore 4
      // 06a: iload 1
      // 06b: ifne 0a2
      // 06e: aload 0
      // 06f: getfield qeaa361f143ee4a0894bd168fd9b30c66/qf4ccf8f5435d4a78bdca4d6a018b578e/aabaaaaaa.bb Ljava/lang/Object;
      // 072: aload 3
      // 073: if_acmpeq 0a3
      // 076: goto 07a
      // 079: athrow
      // 07a: aload 0
      // 07b: aload 3
      // 07c: putfield qeaa361f143ee4a0894bd168fd9b30c66/qf4ccf8f5435d4a78bdca4d6a018b578e/aabaaaaaa.bb Ljava/lang/Object;
      // 07f: aload 0
      // 080: lload 4
      // 082: lconst_0
      // 083: aload 0
      // 084: getfield qeaa361f143ee4a0894bd168fd9b30c66/qf4ccf8f5435d4a78bdca4d6a018b578e/aabaaaaaa.ab Lqeaa361f143ee4a0894bd168fd9b30c66/qf4ccf8f5435d4a78bdca4d6a018b578e/bababa;
      // 087: invokevirtual qeaa361f143ee4a0894bd168fd9b30c66/qf4ccf8f5435d4a78bdca4d6a018b578e/bababa.abbb ()Ljava/lang/Object;
      // 08a: checkcast java/lang/Double
      // 08d: invokevirtual java/lang/Double.doubleValue ()D
      // 090: ldc2_w 1000.0
      // 093: dmul
      // 094: invokestatic java/lang/Math.round (D)J
      // 097: invokestatic java/lang/Math.max (JJ)J
      // 09a: ladd
      // 09b: putfield qeaa361f143ee4a0894bd168fd9b30c66/qf4ccf8f5435d4a78bdca4d6a018b578e/aabaaaaaa.aaa J
      // 09e: goto 0a2
      // 0a1: athrow
      // 0a2: return
      // 0a3: lload 4
      // 0a5: aload 0
      // 0a6: getfield qeaa361f143ee4a0894bd168fd9b30c66/qf4ccf8f5435d4a78bdca4d6a018b578e/aabaaaaaa.aaa J
      // 0a9: lcmp
      // 0aa: iload 1
      // 0ab: ifne 0c3
      // 0ae: ifge 0b6
      // 0b1: goto 0b5
      // 0b4: athrow
      // 0b5: return
      // 0b6: aload 0
      // 0b7: iload 1
      // 0b8: ifne 0cd
      // 0bb: aload 3
      // 0bc: invokevirtual qeaa361f143ee4a0894bd168fd9b30c66/qf4ccf8f5435d4a78bdca4d6a018b578e/aabaaaaaa.abb (Lnet/minecraft/class_419;)Z
      // 0bf: goto 0c3
      // 0c2: athrow
      // 0c3: ifeq 0cc
      // 0c6: aload 0
      // 0c7: invokevirtual qeaa361f143ee4a0894bd168fd9b30c66/qf4ccf8f5435d4a78bdca4d6a018b578e/aabaaaaaa.bba ()V
      // 0ca: return
      // 0cb: athrow
      // 0cc: aload 0
      // 0cd: aload 0
      // 0ce: getfield qeaa361f143ee4a0894bd168fd9b30c66/qf4ccf8f5435d4a78bdca4d6a018b578e/aabaaaaaa.aba Lnet/minecraft/class_642;
      // 0d1: invokevirtual qeaa361f143ee4a0894bd168fd9b30c66/qf4ccf8f5435d4a78bdca4d6a018b578e/aabaaaaaa.bbb (Lnet/minecraft/class_642;)Lnet/minecraft/class_642;
      // 0d4: astore 6
      // 0d6: iload 1
      // 0d7: ifne 104
      // 0da: aload 6
      // 0dc: ifnonnull 0e9
      // 0df: goto 0e3
      // 0e2: athrow
      // 0e3: aload 0
      // 0e4: invokevirtual qeaa361f143ee4a0894bd168fd9b30c66/qf4ccf8f5435d4a78bdca4d6a018b578e/aabaaaaaa.bba ()V
      // 0e7: return
      // 0e8: athrow
      // 0e9: aload 0
      // 0ea: invokevirtual qeaa361f143ee4a0894bd168fd9b30c66/qf4ccf8f5435d4a78bdca4d6a018b578e/aabaaaaaa.bba ()V
      // 0ed: aload 0
      // 0ee: aload 3
      // 0ef: invokevirtual qeaa361f143ee4a0894bd168fd9b30c66/qf4ccf8f5435d4a78bdca4d6a018b578e/aabaaaaaa.a (Lnet/minecraft/class_419;)Lnet/minecraft/class_437;
      // 0f2: aload 2
      // 0f3: aload 6
      // 0f5: getfield net/minecraft/class_642.field_3761 Ljava/lang/String;
      // 0f8: invokestatic net/minecraft/class_639.method_2950 (Ljava/lang/String;)Lnet/minecraft/class_639;
      // 0fb: aload 6
      // 0fd: bipush 0
      // 0fe: invokestatic qeaa361f143ee4a0894bd168fd9b30c66/qf4ccf8f5435d4a78bdca4d6a018b578e/bbbbabbb.b ()Lnet/minecraft/class_9112;
      // 101: invokestatic net/minecraft/class_412.method_36877 (Lnet/minecraft/class_437;Lnet/minecraft/class_310;Lnet/minecraft/class_639;Lnet/minecraft/class_642;ZLnet/minecraft/class_9112;)V
      // 104: return
   }

   private class_437 ba(class_419 param1) {
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
      // 0b: ldc net/minecraft/class_419
      // 0d: ldc_w 1058332328
      // 10: ldc_w -1370861039
      // 13: ldc_w -836160270
      // 16: ixor
      // 17: invokestatic qeaa361f143ee4a0894bd168fd9b30c66/qf4ccf8f5435d4a78bdca4d6a018b578e/aabaaaaaa.b (II)I
      // 1a: ldc_w 1058332329
      // 1d: ldc_w -1370861039
      // 20: ldc_w 62128682
      // 23: ixor
      // 24: invokestatic qeaa361f143ee4a0894bd168fd9b30c66/qf4ccf8f5435d4a78bdca4d6a018b578e/aabaaaaaa.b (II)I
      // 27: invokestatic qeaa361f143ee4a0894bd168fd9b30c66/qf4ccf8f5435d4a78bdca4d6a018b578e/aabaaaaaa.aba (II)Ljava/lang/String;
      // 2a: invokestatic qeaa361f143ee4a0894bd168fd9b30c66/qf4ccf8f5435d4a78bdca4d6a018b578e/aabbaaaba.abba (Ljava/lang/String;)Ljava/lang/String;
      // 2d: invokevirtual java/lang/Class.getDeclaredField (Ljava/lang/String;)Ljava/lang/reflect/Field;
      // 30: astore 3
      // 31: aload 3
      // 32: bipush 1
      // 33: invokevirtual java/lang/reflect/Field.setAccessible (Z)V
      // 36: aload 3
      // 37: aload 1
      // 38: invokevirtual java/lang/reflect/Field.get (Ljava/lang/Object;)Ljava/lang/Object;
      // 3b: astore 4
      // 3d: aload 4
      // 3f: iload 2
      // 40: ifne 53
      // 43: instanceof net/minecraft/class_437
      // 46: ifeq 5b
      // 49: goto 4d
      // 4c: athrow
      // 4d: aload 4
      // 4f: goto 53
      // 52: athrow
      // 53: checkcast net/minecraft/class_437
      // 56: astore 5
      // 58: aload 5
      // 5a: areturn
      // 5b: aconst_null
      // 5c: areturn
      // 5d: astore 3
      // 5e: aconst_null
      // 5f: areturn
   }

   private boolean bb(class_310 param1) {
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
      // 05: invokevirtual net/minecraft/class_310.method_1542 ()Z
      // 08: iload 2
      // 09: ifne 2b
      // 0c: ifne 26
      // 0f: goto 13
      // 12: athrow
      // 13: aload 0
      // 14: iload 2
      // 15: ifne 2d
      // 18: goto 1c
      // 1b: athrow
      // 1c: getfield qeaa361f143ee4a0894bd168fd9b30c66/qf4ccf8f5435d4a78bdca4d6a018b578e/aabaaaaaa.aba Lnet/minecraft/class_642;
      // 1f: ifnonnull 2c
      // 22: goto 26
      // 25: athrow
      // 26: bipush 0
      // 27: goto 2b
      // 2a: athrow
      // 2b: ireturn
      // 2c: aload 0
      // 2d: getfield qeaa361f143ee4a0894bd168fd9b30c66/qf4ccf8f5435d4a78bdca4d6a018b578e/aabaaaaaa.aba Lnet/minecraft/class_642;
      // 30: getfield net/minecraft/class_642.field_3761 Ljava/lang/String;
      // 33: astore 3
      // 34: aload 3
      // 35: iload 2
      // 36: ifne 41
      // 39: ifnull 66
      // 3c: goto 40
      // 3f: athrow
      // 40: aload 3
      // 41: iload 2
      // 42: ifne 54
      // 45: invokevirtual java/lang/String.isBlank ()Z
      // 48: ifne 66
      // 4b: goto 4f
      // 4e: athrow
      // 4f: aload 3
      // 50: goto 54
      // 53: athrow
      // 54: invokestatic net/minecraft/class_639.method_36224 (Ljava/lang/String;)Z
      // 57: iload 2
      // 58: ifne 63
      // 5b: ifeq 66
      // 5e: goto 62
      // 61: athrow
      // 62: bipush 1
      // 63: goto 67
      // 66: bipush 0
      // 67: ireturn
   }

   private boolean aaa(class_4185 param1) {
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
      // 11: getfield net/minecraft/class_4185.field_22763 Z
      // 14: iload 2
      // 15: ifne 37
      // 18: ifeq 32
      // 1b: goto 1f
      // 1e: athrow
      // 1f: aload 1
      // 20: iload 2
      // 21: ifne 39
      // 24: goto 28
      // 27: athrow
      // 28: getfield net/minecraft/class_4185.field_22764 Z
      // 2b: ifne 38
      // 2e: goto 32
      // 31: athrow
      // 32: bipush 0
      // 33: goto 37
      // 36: athrow
      // 37: ireturn
      // 38: aload 1
      // 39: iload 2
      // 3a: ifne 4f
      // 3d: invokevirtual net/minecraft/class_4185.method_25369 ()Lnet/minecraft/class_2561;
      // 40: ifnonnull 4e
      // 43: goto 47
      // 46: athrow
      // 47: ldc_w ""
      // 4a: goto 57
      // 4d: athrow
      // 4e: aload 1
      // 4f: invokevirtual net/minecraft/class_4185.method_25369 ()Lnet/minecraft/class_2561;
      // 52: invokeinterface net/minecraft/class_2561.getString ()Ljava/lang/String; 1
      // 57: astore 3
      // 58: aload 3
      // 59: iload 2
      // 5a: ifne 6f
      // 5d: ifnull a1
      // 60: goto 64
      // 63: athrow
      // 64: aload 3
      // 65: getstatic java/util/Locale.ROOT Ljava/util/Locale;
      // 68: invokevirtual java/lang/String.toLowerCase (Ljava/util/Locale;)Ljava/lang/String;
      // 6b: goto 6f
      // 6e: athrow
      // 6f: ldc_w 1058332349
      // 72: ldc_w -2071857471
      // 75: ldc_w -1285926396
      // 78: ixor
      // 79: invokestatic qeaa361f143ee4a0894bd168fd9b30c66/qf4ccf8f5435d4a78bdca4d6a018b578e/aabaaaaaa.b (II)I
      // 7c: ldc_w 1058332350
      // 7f: ldc_w -2071857471
      // 82: ldc_w -1668367304
      // 85: ixor
      // 86: invokestatic qeaa361f143ee4a0894bd168fd9b30c66/qf4ccf8f5435d4a78bdca4d6a018b578e/aabaaaaaa.b (II)I
      // 89: invokestatic qeaa361f143ee4a0894bd168fd9b30c66/qf4ccf8f5435d4a78bdca4d6a018b578e/aabaaaaaa.aba (II)Ljava/lang/String;
      // 8c: invokestatic qeaa361f143ee4a0894bd168fd9b30c66/qf4ccf8f5435d4a78bdca4d6a018b578e/aabbaaaba.abba (Ljava/lang/String;)Ljava/lang/String;
      // 8f: invokevirtual java/lang/String.contains (Ljava/lang/CharSequence;)Z
      // 92: iload 2
      // 93: ifne 9e
      // 96: ifeq a1
      // 99: goto 9d
      // 9c: athrow
      // 9d: bipush 1
      // 9e: goto a2
      // a1: bipush 0
      // a2: ireturn
   }

   private void aab(class_310 param1) {
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
      // 06: ifne 16
      // 09: invokevirtual net/minecraft/class_310.method_1542 ()Z
      // 0c: ifeq 15
      // 0f: goto 13
      // 12: athrow
      // 13: return
      // 14: athrow
      // 15: aload 1
      // 16: invokevirtual net/minecraft/class_310.method_1558 ()Lnet/minecraft/class_642;
      // 19: astore 3
      // 1a: aload 3
      // 1b: iload 2
      // 1c: ifne 27
      // 1f: ifnull 43
      // 22: goto 26
      // 25: athrow
      // 26: aload 3
      // 27: iload 2
      // 28: ifne 3a
      // 2b: getfield net/minecraft/class_642.field_3761 Ljava/lang/String;
      // 2e: ifnull 43
      // 31: goto 35
      // 34: athrow
      // 35: aload 3
      // 36: goto 3a
      // 39: athrow
      // 3a: getfield net/minecraft/class_642.field_3761 Ljava/lang/String;
      // 3d: invokevirtual java/lang/String.isBlank ()Z
      // 40: ifeq 45
      // 43: return
      // 44: athrow
      // 45: aload 0
      // 46: aload 0
      // 47: aload 3
      // 48: invokevirtual qeaa361f143ee4a0894bd168fd9b30c66/qf4ccf8f5435d4a78bdca4d6a018b578e/aabaaaaaa.bbb (Lnet/minecraft/class_642;)Lnet/minecraft/class_642;
      // 4b: putfield qeaa361f143ee4a0894bd168fd9b30c66/qf4ccf8f5435d4a78bdca4d6a018b578e/aabaaaaaa.aba Lnet/minecraft/class_642;
      // 4e: return
   }

   private static String aba(int var0, int var1) {
      int var9 = -949081146;
      int var2 = (var0 ^ b(1058332351, var9 ^ 451112164)) & b(1058332344, var9 ^ 4667328);
      if (aab[var2] == null) {
         char[] var3 = aa[var2].toCharArray();

         int var4 = switch (var3[0] & b(1058332345, var9 ^ 2070276132)) {
            case 0 -> b(1058332346, var9 ^ -1381201658);
            case 1 -> b(1058332347, var9 ^ -1749182088);
            case 2 -> b(1058332292, var9 ^ -606126364);
            case 3 -> b(1058332293, var9 ^ 1895832120);
            case 4 -> b(1058332294, var9 ^ 1115311396);
            case 5 -> b(1058332295, var9 ^ 986029909);
            case 6 -> b(1058332288, var9 ^ 1773233629);
            case 7 -> b(1058332289, var9 ^ 558353320);
            case 8 -> b(1058332290, var9 ^ -1297410668);
            case 9 -> b(1058332291, var9 ^ -261501544);
            case 10 -> b(1058332300, var9 ^ 459125752);
            case 11 -> b(1058332301, var9 ^ 1250830307);
            case 12 -> b(1058332302, var9 ^ 1391271341);
            case 13 -> 2;
            case 14 -> b(1058332303, var9 ^ -2104575005);
            case 15 -> b(1058332296, var9 ^ 1739859642);
            case 16 -> b(1058332297, var9 ^ 2114953112);
            case 17 -> b(1058332298, var9 ^ 1334809380);
            case 18 -> b(1058332299, var9 ^ 1051544051);
            case 19 -> b(1058332308, var9 ^ 1239840429);
            case 20 -> b(1058332309, var9 ^ -128109131);
            case 21 -> b(1058332310, var9 ^ 1059168527);
            case 22 -> b(1058332311, var9 ^ -84304553);
            case 23 -> b(1058332304, var9 ^ -1682733795);
            case 24 -> b(1058332305, var9 ^ -1282455360);
            case 25 -> b(1058332306, var9 ^ 648623035);
            case 26 -> b(1058332307, var9 ^ -903335199);
            case 27 -> b(1058332316, var9 ^ 1427449339);
            case 28 -> b(1058332317, var9 ^ 938440152);
            case 29 -> b(1058332318, var9 ^ -1049708433);
            case 30 -> b(1058332319, var9 ^ -863478451);
            case 31 -> b(1058332312, var9 ^ -310998020);
            case 32 -> b(1058332313, var9 ^ 1261016313);
            case 33 -> b(1058332314, var9 ^ 1541928206);
            case 34 -> b(1058332315, var9 ^ -468589516);
            case 35 -> b(1058332388, var9 ^ -2036468256);
            case 36 -> b(1058332389, var9 ^ -263757418);
            case 37 -> b(1058332390, var9 ^ 1560499571);
            case 38 -> b(1058332391, var9 ^ -113994703);
            case 39 -> b(1058332384, var9 ^ -489711634);
            case 40 -> b(1058332385, var9 ^ 1445336248);
            case 41 -> b(1058332386, var9 ^ -673121914);
            case 42 -> b(1058332387, var9 ^ 1669338328);
            case 43 -> b(1058332396, var9 ^ -561982042);
            case 44 -> b(1058332397, var9 ^ 1630095588);
            case 45 -> b(1058332398, var9 ^ -2007314216);
            case 46 -> b(1058332399, var9 ^ 246049721);
            case 47 -> b(1058332392, var9 ^ -1584887981);
            case 48 -> b(1058332393, var9 ^ -1775007899);
            case 49 -> b(1058332394, var9 ^ -1214866977);
            case 50 -> b(1058332395, var9 ^ 69149263);
            case 51 -> b(1058332404, var9 ^ -1067337572);
            case 52 -> b(1058332405, var9 ^ 1449642581);
            case 53 -> b(1058332406, var9 ^ -2070806310);
            case 54 -> b(1058332407, var9 ^ -942185631);
            case 55 -> b(1058332400, var9 ^ -317632312);
            case 56 -> b(1058332401, var9 ^ 1337522845);
            case 57 -> 3;
            case 58 -> b(1058332402, var9 ^ 1623895873);
            case 59 -> b(1058332403, var9 ^ -1521861449);
            case 60 -> b(1058332412, var9 ^ -826941092);
            case 61 -> 0;
            case 62 -> b(1058332413, var9 ^ -1320643860);
            case 63 -> b(1058332414, var9 ^ -33182155);
            case 64 -> b(1058332415, var9 ^ -500823230);
            case 65 -> b(1058332408, var9 ^ 720460598);
            case 66 -> b(1058332409, var9 ^ 1712544073);
            case 67 -> b(1058332410, var9 ^ -497715707);
            case 68 -> b(1058332411, var9 ^ 1083420444);
            case 69 -> b(1058332356, var9 ^ 723531527);
            case 70 -> b(1058332357, var9 ^ -80076998);
            case 71 -> b(1058332358, var9 ^ -118410041);
            case 72 -> b(1058332359, var9 ^ 1914035869);
            case 73 -> b(1058332352, var9 ^ -182491672);
            case 74 -> b(1058332353, var9 ^ -97236755);
            case 75 -> b(1058332354, var9 ^ 559168386);
            case 76 -> b(1058332355, var9 ^ 626697202);
            case 77 -> b(1058332364, var9 ^ -801898161);
            case 78 -> b(1058332365, var9 ^ 1908598817);
            case 79 -> b(1058332366, var9 ^ 208920359);
            case 80 -> b(1058332367, var9 ^ 1638442972);
            case 81 -> b(1058332360, var9 ^ 617607120);
            case 82 -> b(1058332361, var9 ^ 1359616718);
            case 83 -> b(1058332362, var9 ^ 823975238);
            case 84 -> b(1058332363, var9 ^ -1194489182);
            case 85 -> b(1058332372, var9 ^ 1329332440);
            case 86 -> b(1058332373, var9 ^ 654641693);
            case 87 -> b(1058332374, var9 ^ -775905191);
            case 88 -> b(1058332375, var9 ^ -342905857);
            case 89 -> b(1058332368, var9 ^ 949579801);
            case 90 -> 4;
            case 91 -> b(1058332369, var9 ^ 67663158);
            case 92 -> b(1058332370, var9 ^ 451902025);
            case 93 -> b(1058332371, var9 ^ 214179235);
            case 94 -> b(1058332380, var9 ^ 167788351);
            case 95 -> b(1058332381, var9 ^ -1805178368);
            case 96 -> b(1058332382, var9 ^ -1093363361);
            case 97 -> b(1058332383, var9 ^ 2090813273);
            case 98 -> b(1058332376, var9 ^ -732792122);
            case 99 -> b(1058332377, var9 ^ 1302096699);
            case 100 -> b(1058332378, var9 ^ 1198107822);
            case 101 -> b(1058332379, var9 ^ 1521824372);
            case 102 -> b(1058332196, var9 ^ -686840866);
            case 103 -> b(1058332197, var9 ^ -1666199715);
            case 104 -> b(1058332198, var9 ^ 287961683);
            case 105 -> b(1058332199, var9 ^ -1527048026);
            case 106 -> b(1058332192, var9 ^ -1031002936);
            case 107 -> b(1058332193, var9 ^ -2051904182);
            case 108 -> b(1058332194, var9 ^ -2072698599);
            case 109 -> b(1058332195, var9 ^ -2099179678);
            case 110 -> b(1058332204, var9 ^ -691597179);
            case 111 -> b(1058332205, var9 ^ 1681411424);
            case 112 -> b(1058332206, var9 ^ 1039285446);
            case 113 -> b(1058332207, var9 ^ -1478736859);
            case 114 -> b(1058332200, var9 ^ -13490459);
            case 115 -> b(1058332201, var9 ^ 739566342);
            case 116 -> b(1058332202, var9 ^ -1526149178);
            case 117 -> b(1058332203, var9 ^ -898142229);
            case 118 -> b(1058332212, var9 ^ 772201518);
            case 119 -> b(1058332213, var9 ^ -602338727);
            case 120 -> b(1058332214, var9 ^ -495349839);
            case 121 -> b(1058332215, var9 ^ 1326410205);
            case 122 -> b(1058332208, var9 ^ 1660304324);
            case 123 -> b(1058332209, var9 ^ 1150696016);
            case 124 -> b(1058332210, var9 ^ 1919417195);
            case 125 -> b(1058332211, var9 ^ -835951955);
            case 126 -> b(1058332220, var9 ^ -1202623803);
            case 127 -> b(1058332221, var9 ^ 722770536);
            case 128 -> b(1058332222, var9 ^ -979890997);
            case 129 -> b(1058332223, var9 ^ -644786311);
            case 130 -> b(1058332216, var9 ^ 892874663);
            case 131 -> b(1058332217, var9 ^ 395713504);
            case 132 -> b(1058332218, var9 ^ 1246822414);
            case 133 -> b(1058332219, var9 ^ 1552195900);
            case 134 -> b(1058332164, var9 ^ -1111225594);
            case 135 -> b(1058332165, var9 ^ 1977477776);
            case 136 -> b(1058332166, var9 ^ 55605228);
            case 137 -> b(1058332167, var9 ^ -2078187099);
            case 138 -> b(1058332160, var9 ^ -1360776110);
            case 139 -> b(1058332161, var9 ^ -1525175317);
            case 140 -> b(1058332162, var9 ^ 345861891);
            case 141 -> b(1058332163, var9 ^ -530650423);
            case 142 -> b(1058332172, var9 ^ -548106295);
            case 143 -> b(1058332173, var9 ^ -577778237);
            case 144 -> b(1058332174, var9 ^ -1506261117);
            case 145 -> b(1058332175, var9 ^ 1767346090);
            case 146 -> b(1058332168, var9 ^ -611626984);
            case 147 -> b(1058332169, var9 ^ 1073895760);
            case 148 -> b(1058332170, var9 ^ 1891593996);
            case 149 -> b(1058332171, var9 ^ -996502030);
            case 150 -> b(1058332180, var9 ^ -1593116382);
            case 151 -> b(1058332181, var9 ^ 1989162661);
            case 152 -> b(1058332182, var9 ^ -1722827276);
            case 153 -> b(1058332183, var9 ^ 1375309595);
            case 154 -> b(1058332176, var9 ^ 1769912264);
            case 155 -> b(1058332177, var9 ^ 1419862899);
            case 156 -> b(1058332178, var9 ^ -1220748056);
            case 157 -> b(1058332179, var9 ^ 1894147609);
            case 158 -> b(1058332188, var9 ^ -618381287);
            case 159 -> b(1058332189, var9 ^ -1225109864);
            case 160 -> b(1058332190, var9 ^ 637639188);
            case 161 -> b(1058332191, var9 ^ 1086366404);
            case 162 -> b(1058332184, var9 ^ -471023359);
            case 163 -> b(1058332185, var9 ^ -282568879);
            case 164 -> b(1058332186, var9 ^ -807710720);
            case 165 -> b(1058332187, var9 ^ -1911787850);
            case 166 -> b(1058332260, var9 ^ -1456570754);
            case 167 -> b(1058332261, var9 ^ -2057610859);
            case 168 -> b(1058332262, var9 ^ 1207737563);
            case 169 -> b(1058332263, var9 ^ -1608935918);
            case 170 -> b(1058332256, var9 ^ 931429734);
            case 171 -> b(1058332257, var9 ^ 1312699675);
            case 172 -> b(1058332258, var9 ^ 217269383);
            case 173 -> b(1058332259, var9 ^ -1572807295);
            case 174 -> b(1058332268, var9 ^ 541519320);
            case 175 -> b(1058332269, var9 ^ 1161101689);
            case 176 -> b(1058332270, var9 ^ -436757207);
            case 177 -> b(1058332271, var9 ^ 1203534002);
            case 178 -> b(1058332264, var9 ^ 1126967620);
            case 179 -> b(1058332265, var9 ^ 503231395);
            case 180 -> b(1058332266, var9 ^ -1411442426);
            case 181 -> b(1058332267, var9 ^ 460582309);
            case 182 -> b(1058332276, var9 ^ -352570738);
            case 183 -> b(1058332277, var9 ^ -1196059004);
            case 184 -> b(1058332278, var9 ^ -1385036583);
            case 185 -> b(1058332279, var9 ^ 222165708);
            case 186 -> b(1058332272, var9 ^ 1528426188);
            case 187 -> b(1058332273, var9 ^ -1781216698);
            case 188 -> b(1058332274, var9 ^ 1958745819);
            case 189 -> b(1058332275, var9 ^ -2122764327);
            case 190 -> b(1058332284, var9 ^ 1544003720);
            case 191 -> b(1058332285, var9 ^ -567864478);
            case 192 -> b(1058332286, var9 ^ 456427386);
            case 193 -> b(1058332287, var9 ^ -1876907741);
            case 194 -> b(1058332280, var9 ^ 322130630);
            case 195 -> b(1058332281, var9 ^ -1616527871);
            case 196 -> b(1058332282, var9 ^ 2112123232);
            case 197 -> 1;
            case 198 -> b(1058332283, var9 ^ -834532612);
            case 199 -> b(1058332228, var9 ^ 799819833);
            case 200 -> b(1058332229, var9 ^ 1519543582);
            case 201 -> b(1058332230, var9 ^ -1008341128);
            case 202 -> b(1058332231, var9 ^ 1172554182);
            case 203 -> b(1058332224, var9 ^ 1116657860);
            case 204 -> b(1058332225, var9 ^ -451277281);
            case 205 -> b(1058332226, var9 ^ 1688225478);
            case 206 -> b(1058332227, var9 ^ -153378699);
            case 207 -> b(1058332236, var9 ^ 52394616);
            case 208 -> b(1058332237, var9 ^ 576416111);
            case 209 -> b(1058332238, var9 ^ -1886880271);
            case 210 -> b(1058332239, var9 ^ -659967790);
            case 211 -> b(1058332232, var9 ^ 147006136);
            case 212 -> b(1058332233, var9 ^ -1167185826);
            case 213 -> b(1058332234, var9 ^ 565437948);
            case 214 -> 5;
            case 215 -> b(1058332235, var9 ^ 1896562102);
            case 216 -> b(1058332244, var9 ^ -445349064);
            case 217 -> b(1058332245, var9 ^ 615825648);
            case 218 -> b(1058332246, var9 ^ -146902909);
            case 219 -> b(1058332247, var9 ^ 1553822966);
            case 220 -> b(1058332240, var9 ^ -1726040542);
            case 221 -> b(1058332241, var9 ^ -990606284);
            case 222 -> b(1058332242, var9 ^ 1586199835);
            case 223 -> b(1058332243, var9 ^ 2137733341);
            case 224 -> b(1058332252, var9 ^ 728867533);
            case 225 -> b(1058332253, var9 ^ 18674378);
            case 226 -> b(1058332254, var9 ^ 1638970727);
            case 227 -> b(1058332255, var9 ^ -353832904);
            case 228 -> b(1058332248, var9 ^ 1847291709);
            case 229 -> b(1058332249, var9 ^ 716860827);
            case 230 -> b(1058332250, var9 ^ -276225140);
            case 231 -> b(1058332251, var9 ^ 1276243715);
            case 232 -> b(1058332580, var9 ^ 42460557);
            case 233 -> b(1058332581, var9 ^ -1957549990);
            case 234 -> b(1058332582, var9 ^ 1178030984);
            case 235 -> b(1058332583, var9 ^ 331346709);
            case 236 -> b(1058332576, var9 ^ 1223657979);
            case 237 -> b(1058332577, var9 ^ -749565226);
            case 238 -> b(1058332578, var9 ^ 754056918);
            case 239 -> b(1058332579, var9 ^ 1948206291);
            case 240 -> b(1058332588, var9 ^ 952997715);
            case 241 -> b(1058332589, var9 ^ -2002541209);
            case 242 -> b(1058332590, var9 ^ 505399697);
            case 243 -> b(1058332591, var9 ^ 319637077);
            case 244 -> b(1058332584, var9 ^ -45780085);
            case 245 -> b(1058332585, var9 ^ -2024468436);
            case 246 -> b(1058332586, var9 ^ -1038750456);
            case 247 -> b(1058332587, var9 ^ 497675138);
            case 248 -> b(1058332596, var9 ^ 638095415);
            case 249 -> b(1058332597, var9 ^ 428803648);
            case 250 -> b(1058332598, var9 ^ 1101473642);
            case 251 -> b(1058332599, var9 ^ -2069541660);
            case 252 -> b(1058332592, var9 ^ -1852276033);
            case 253 -> b(1058332593, var9 ^ -1041333532);
            case 254 -> b(1058332594, var9 ^ -1107771791);
            default -> b(1058332595, var9 ^ -1820792782);
         };
         int var5 = (var1 & b(1058332604, var9 ^ 1358180602)) - var4;
         if (var5 < 0) {
            var5 += 256;
         }

         int var6 = ((var1 & b(1058332605, var9 ^ 1761325809)) >>> b(1058332606, var9 ^ -887637080)) - var4;
         if (var6 < 0) {
            var6 += 256;
         }

         for (int var7 = 0; var7 < var3.length; var7++) {
            int var8 = var7 % 2;
            char var10002 = var3[var7];
            if (var8 == 0) {
               var3[var7] = (char)(var10002 ^ var5);
               var5 = ((var5 >>> 3 | var5 << 5) ^ var3[var7]) & b(1058332607, var9 ^ 699415608);
            } else {
               var3[var7] = (char)(var10002 ^ var6);
               var6 = ((var6 >>> 3 | var6 << 5) ^ var3[var7]) & b(1058332600, var9 ^ -2062121467);
            }
         }

         aab[var2] = new String(var3).intern();
      }

      return aab[var2];
   }

   private boolean abb(class_419 param1) {
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
      // 14: invokevirtual net/minecraft/class_419.method_25396 ()Ljava/util/List;
      // 17: invokeinterface java/util/List.iterator ()Ljava/util/Iterator; 1
      // 1c: astore 3
      // 1d: aload 3
      // 1e: invokeinterface java/util/Iterator.hasNext ()Z 1
      // 23: ifeq 7c
      // 26: aload 3
      // 27: invokeinterface java/util/Iterator.next ()Ljava/lang/Object; 1
      // 2c: checkcast net/minecraft/class_364
      // 2f: astore 4
      // 31: aload 4
      // 33: iload 2
      // 34: ifne 4b
      // 37: instanceof net/minecraft/class_4185
      // 3a: iload 2
      // 3b: ifne 7d
      // 3e: goto 42
      // 41: athrow
      // 42: ifeq 78
      // 45: goto 49
      // 48: athrow
      // 49: aload 4
      // 4b: checkcast net/minecraft/class_4185
      // 4e: astore 5
      // 50: aload 0
      // 51: iload 2
      // 52: ifne 66
      // 55: aload 5
      // 57: invokevirtual qeaa361f143ee4a0894bd168fd9b30c66/qf4ccf8f5435d4a78bdca4d6a018b578e/aabaaaaaa.aaa (Lnet/minecraft/class_4185;)Z
      // 5a: ifeq 78
      // 5d: goto 61
      // 60: athrow
      // 61: aload 0
      // 62: goto 66
      // 65: athrow
      // 66: aload 5
      // 68: invokevirtual qeaa361f143ee4a0894bd168fd9b30c66/qf4ccf8f5435d4a78bdca4d6a018b578e/aabaaaaaa.ab (Lnet/minecraft/class_4185;)Z
      // 6b: iload 2
      // 6c: ifne 77
      // 6f: ifeq 78
      // 72: goto 76
      // 75: athrow
      // 76: bipush 1
      // 77: ireturn
      // 78: iload 2
      // 79: ifeq 1d
      // 7c: bipush 0
      // 7d: ireturn
   }

   private static Object bab(Object param0, Method param1, Object[] param2) throws Throwable {
      // $VF: Couldn't be decompiled
      // Please report this to the Vineflower issue tracker, at https://github.com/Vineflower/vineflower/issues with a copy of the class file (if you have the rights to distribute it!)
      // java.lang.NullPointerException: Cannot invoke "org.jetbrains.java.decompiler.code.cfg.ExceptionRangeCFG.isCircular()" because "range" is null
      //   at org.jetbrains.java.decompiler.modules.decompiler.decompose.DomHelper.graphToStatement(DomHelper.java:84)
      //   at org.jetbrains.java.decompiler.modules.decompiler.decompose.DomHelper.parseGraph(DomHelper.java:203)
      //   at org.jetbrains.java.decompiler.main.rels.MethodProcessor.codeToJava(MethodProcessor.java:166)
      //
      // Bytecode:
      // 000: ldc_w -1227734548
      // 003: istore 6
      // 005: getstatic qeaa361f143ee4a0894bd168fd9b30c66/qf4ccf8f5435d4a78bdca4d6a018b578e/baaabbaa.bba I
      // 008: aload 1
      // 009: invokevirtual java/lang/reflect/Method.getName ()Ljava/lang/String;
      // 00c: astore 4
      // 00e: istore 3
      // 00f: bipush -1
      // 010: istore 5
      // 012: aload 4
      // 014: invokevirtual java/lang/String.hashCode ()I
      // 017: iload 3
      // 018: ifne 11b
      // 01b: lookupswitch 254 4 -1901045636 96 -1776922004 204 -1417910757 150 221855894 42
      // 044: athrow
      // 045: aload 4
      // 047: ldc_w 1058332601
      // 04a: iload 6
      // 04c: ldc_w -1970552798
      // 04f: ixor
      // 050: invokestatic qeaa361f143ee4a0894bd168fd9b30c66/qf4ccf8f5435d4a78bdca4d6a018b578e/aabaaaaaa.b (II)I
      // 053: ldc_w 1058332602
      // 056: iload 6
      // 058: ldc_w 676429508
      // 05b: ixor
      // 05c: invokestatic qeaa361f143ee4a0894bd168fd9b30c66/qf4ccf8f5435d4a78bdca4d6a018b578e/aabaaaaaa.b (II)I
      // 05f: invokestatic qeaa361f143ee4a0894bd168fd9b30c66/qf4ccf8f5435d4a78bdca4d6a018b578e/aabaaaaaa.aba (II)Ljava/lang/String;
      // 062: invokevirtual java/lang/String.equals (Ljava/lang/Object;)Z
      // 065: iload 3
      // 066: ifne 11b
      // 069: goto 06d
      // 06c: athrow
      // 06d: ifeq 119
      // 070: goto 074
      // 073: athrow
      // 074: bipush 0
      // 075: istore 5
      // 077: iload 3
      // 078: ifeq 119
      // 07b: aload 4
      // 07d: ldc_w 1058332603
      // 080: iload 6
      // 082: ldc_w 1199530445
      // 085: ixor
      // 086: invokestatic qeaa361f143ee4a0894bd168fd9b30c66/qf4ccf8f5435d4a78bdca4d6a018b578e/aabaaaaaa.b (II)I
      // 089: ldc_w 1058332548
      // 08c: iload 6
      // 08e: ldc_w 1177615718
      // 091: ixor
      // 092: invokestatic qeaa361f143ee4a0894bd168fd9b30c66/qf4ccf8f5435d4a78bdca4d6a018b578e/aabaaaaaa.b (II)I
      // 095: invokestatic qeaa361f143ee4a0894bd168fd9b30c66/qf4ccf8f5435d4a78bdca4d6a018b578e/aabaaaaaa.aba (II)Ljava/lang/String;
      // 098: invokevirtual java/lang/String.equals (Ljava/lang/Object;)Z
      // 09b: iload 3
      // 09c: ifne 11b
      // 09f: goto 0a3
      // 0a2: athrow
      // 0a3: ifeq 119
      // 0a6: goto 0aa
      // 0a9: athrow
      // 0aa: bipush 1
      // 0ab: istore 5
      // 0ad: iload 3
      // 0ae: ifeq 119
      // 0b1: aload 4
      // 0b3: ldc_w 1058332549
      // 0b6: iload 6
      // 0b8: ldc_w 1020759806
      // 0bb: ixor
      // 0bc: invokestatic qeaa361f143ee4a0894bd168fd9b30c66/qf4ccf8f5435d4a78bdca4d6a018b578e/aabaaaaaa.b (II)I
      // 0bf: ldc_w 1058332550
      // 0c2: iload 6
      // 0c4: ldc_w 1076039059
      // 0c7: ixor
      // 0c8: invokestatic qeaa361f143ee4a0894bd168fd9b30c66/qf4ccf8f5435d4a78bdca4d6a018b578e/aabaaaaaa.b (II)I
      // 0cb: invokestatic qeaa361f143ee4a0894bd168fd9b30c66/qf4ccf8f5435d4a78bdca4d6a018b578e/aabaaaaaa.aba (II)Ljava/lang/String;
      // 0ce: invokevirtual java/lang/String.equals (Ljava/lang/Object;)Z
      // 0d1: iload 3
      // 0d2: ifne 11b
      // 0d5: goto 0d9
      // 0d8: athrow
      // 0d9: ifeq 119
      // 0dc: goto 0e0
      // 0df: athrow
      // 0e0: bipush 2
      // 0e1: istore 5
      // 0e3: iload 3
      // 0e4: ifeq 119
      // 0e7: aload 4
      // 0e9: ldc_w 1058332551
      // 0ec: iload 6
      // 0ee: ldc_w 1662380248
      // 0f1: ixor
      // 0f2: invokestatic qeaa361f143ee4a0894bd168fd9b30c66/qf4ccf8f5435d4a78bdca4d6a018b578e/aabaaaaaa.b (II)I
      // 0f5: ldc_w 1058332544
      // 0f8: iload 6
      // 0fa: ldc_w 421192848
      // 0fd: ixor
      // 0fe: invokestatic qeaa361f143ee4a0894bd168fd9b30c66/qf4ccf8f5435d4a78bdca4d6a018b578e/aabaaaaaa.b (II)I
      // 101: invokestatic qeaa361f143ee4a0894bd168fd9b30c66/qf4ccf8f5435d4a78bdca4d6a018b578e/aabaaaaaa.aba (II)Ljava/lang/String;
      // 104: invokevirtual java/lang/String.equals (Ljava/lang/Object;)Z
      // 107: iload 3
      // 108: ifne 11b
      // 10b: goto 10f
      // 10e: athrow
      // 10f: ifeq 119
      // 112: goto 116
      // 115: athrow
      // 116: bipush 3
      // 117: istore 5
      // 119: iload 5
      // 11b: iload 3
      // 11c: ifne 13e
      // 11f: tableswitch 70 0 3 30 30 30 37
      // 13c: athrow
      // 13d: bipush 0
      // 13e: invokestatic java/lang/Integer.valueOf (I)Ljava/lang/Integer;
      // 141: goto 17a
      // 144: ldc_w 1058332545
      // 147: iload 6
      // 149: ldc_w 422449611
      // 14c: ixor
      // 14d: invokestatic qeaa361f143ee4a0894bd168fd9b30c66/qf4ccf8f5435d4a78bdca4d6a018b578e/aabaaaaaa.b (II)I
      // 150: ldc_w 1058332546
      // 153: iload 6
      // 155: ldc_w -774652895
      // 158: ixor
      // 159: invokestatic qeaa361f143ee4a0894bd168fd9b30c66/qf4ccf8f5435d4a78bdca4d6a018b578e/aabaaaaaa.b (II)I
      // 15c: invokestatic qeaa361f143ee4a0894bd168fd9b30c66/qf4ccf8f5435d4a78bdca4d6a018b578e/aabaaaaaa.aba (II)Ljava/lang/String;
      // 15f: invokestatic qeaa361f143ee4a0894bd168fd9b30c66/qf4ccf8f5435d4a78bdca4d6a018b578e/aabbaaaba.abba (Ljava/lang/String;)Ljava/lang/String;
      // 162: goto 17a
      // 165: aload 1
      // 166: invokevirtual java/lang/reflect/Method.getReturnType ()Ljava/lang/Class;
      // 169: getstatic java/lang/Boolean.TYPE Ljava/lang/Class;
      // 16c: if_acmpne 176
      // 16f: getstatic java/lang/Boolean.FALSE Ljava/lang/Boolean;
      // 172: goto 17a
      // 175: athrow
      // 176: bipush 0
      // 177: invokestatic java/lang/Integer.valueOf (I)Ljava/lang/Integer;
      // 17a: areturn
   }

   private void bba() {
      this.bb = null;
      this.aaa = 0L;
   }

   private class_642 bbb(class_642 param1) {
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
      // 06: ifne 26
      // 09: ifnonnull 13
      // 0c: goto 10
      // 0f: athrow
      // 10: aconst_null
      // 11: areturn
      // 12: athrow
      // 13: new net/minecraft/class_642
      // 16: dup
      // 17: aload 1
      // 18: getfield net/minecraft/class_642.field_3752 Ljava/lang/String;
      // 1b: aload 1
      // 1c: getfield net/minecraft/class_642.field_3761 Ljava/lang/String;
      // 1f: aload 1
      // 20: invokevirtual net/minecraft/class_642.method_55616 ()Lnet/minecraft/class_642$class_8678;
      // 23: invokespecial net/minecraft/class_642.<init> (Ljava/lang/String;Ljava/lang/String;Lnet/minecraft/class_642$class_8678;)V
      // 26: astore 3
      // 27: aload 3
      // 28: aload 1
      // 29: invokevirtual net/minecraft/class_642.method_44292 (Lnet/minecraft/class_642;)V
      // 2c: aload 3
      // 2d: areturn
   }

   // $VF: Irreducible bytecode was duplicated to produce valid code
   static {
      int var19 = -1112445671;
      int var13 = 0;
      String[] var10001 = new String[2];
      short var14 = 26370;
      String[] var11 = var10001;
      int var10 = "ć鐶떥錖\uf5a1顶떧黶궢鰖붢舶붡齶ꖡ髖㖢韶疤钶떧邶喣隖떣袶\uf5a2逶궧臶ඦ鯶斣貶֧鲖ⶠ菶\uf5a4襖\uf5a6蛖\ue5a3黶嶥鰶\ueda4藶֥鉶\ue5a3膖\u2da7芶\u2da7軶\ue5a2蒖㶤蘶趥頖㖠蘶■蚶ꖣ驖趤餖\udda3逖喦鼶趢萶䖢隖润鏶\ue5a4隶薥薖ﶤ茖斠蜶涤艖춧菶涧鲖疣郶궦靶ඣ蒖\uf5a2辶斧齶䖡銖춡賖궧袖㖤鐶\ue5a5肖\udda0鵖関鶖▥鲖춠蔖֦闶涡蕶붢苶\ue5a7轶ᶧ麶▥釶\ueda7閶䖣闖㖣遖涡迖嶡锶関锶斢譶\ueda1驶\udda2鸶ﶠ蚶綦襶㖡誶鶤諶䖦鼖鶦袖涢藶斢鬖떤雖㶥蓶嶣臖▦鈶ᶧ蜖鶧酖綢髖㶢贖薤趖\ue5a0陖ජ耖斡鳖ꖦ鏶綠謖䶦脖ﶠ骖ꖣ輖햠謶\uf5a4錖ꖥ饖ᖡ遶㖠詶떧賶햠诶㶦鯖㖢鈖㶠蕖떧迶喣莶鶢鞶얧肶綥苶䶥鄖喣鎶嶤訶궡鴶ᶤ闶斢谖䖤馶嶡萖薧轶\ueda6鬖䶣萖ᶣ躖綡脶햢鲶ᖢ踶鶦舶\u0011粒ﲛ扲⒛汲ﲛ潒벘泲\uf498琲풘排㒙瘒⒙澲"
         .length();
      int var12 = 0;
      String var9 = "ć鐶떥錖\uf5a1顶떧黶궢鰖붢舶붡齶ꖡ髖㖢韶疤钶떧邶喣隖떣袶\uf5a2逶궧臶ඦ鯶斣貶֧鲖ⶠ菶\uf5a4襖\uf5a6蛖\ue5a3黶嶥鰶\ueda4藶֥鉶\ue5a3膖\u2da7芶\u2da7軶\ue5a2蒖㶤蘶趥頖㖠蘶■蚶ꖣ驖趤餖\udda3逖喦鼶趢萶䖢隖润鏶\ue5a4隶薥薖ﶤ茖斠蜶涤艖춧菶涧鲖疣郶궦靶ඣ蒖\uf5a2辶斧齶䖡銖춡賖궧袖㖤鐶\ue5a5肖\udda0鵖関鶖▥鲖춠蔖֦闶涡蕶붢苶\ue5a7轶ᶧ麶▥釶\ueda7閶䖣闖㖣遖涡迖嶡锶関锶斢譶\ueda1驶\udda2鸶ﶠ蚶綦襶㖡誶鶤諶䖦鼖鶦袖涢藶斢鬖떤雖㶥蓶嶣臖▦鈶ᶧ蜖鶧酖綢髖㶢贖薤趖\ue5a0陖ජ耖斡鳖ꖦ鏶綠謖䶦脖ﶠ骖ꖣ輖햠謶\uf5a4錖ꖥ饖ᖡ遶㖠詶떧賶햠诶㶦鯖㖢鈖㶠蕖떧迶喣莶鶢鞶얧肶綥苶䶥鄖喣鎶嶤訶궡鴶ᶤ闶斢谖䖤馶嶡萖薧轶\ueda6鬖䶣萖ᶣ躖綡脶햢鲶ᖢ踶鶦舶\u0011粒ﲛ扲⒛汲ﲛ潒벘泲\uf498琲풘排㒙瘒⒙澲";

      do {
         char var15 = var9.charAt(var13);
         int var17 = 0;
         char[] var16 = var9.substring(var13 + 1, var13 + 1 + var15).toCharArray();

         do {
            char var18 = var16[var17];
            if (var17 % 2 == 0) {
               var16[var17] = (char)((var18 >>> 5 | var18 << 11) & 65535 ^ var14);
            } else {
               var16[var17] = (char)((var18 << 5 | var18 >>> 11) & 65535 ^ var14);
            }
         } while (++var17 < var16.length);

         var11[var12] = new String(var16);
         var12++;
         var13 = var13 + var15 + 1;
      } while (var13 < var10);

      baa = var11;
      bab = new Object[var11.length];
      byte var10000 = 0;
      abb = new int[299];
      byte var24 = 0;
      byte[] var10002 = "µ0\u0001\u0097\u009d\u009eO\u009fÇm¹Ì±\u0083\b,HÃw ëë\u0000£\u0084\u007fî\fÏ°:\u0097A\u0089#Ò\u009d©\u0010oóñ[\u001d\u0017\u009fD¥\u0084\u008frWI\u0010ËÚ\u008f\u0098rÊÅËdTý\u009bzJù\u0095ÁáR\rÞóë\u009f\u0000â@êu\u0092/\\_À\u0093ì\u0012hÊ×îä\u0012íuÀÓ7°\u001eüà\u0013\u00879aSú#Åp¢Xä¨G\u008e-Éò´<Ù\u0098ø^~\u008aR\u0081Zäaû\rT\u0019DßÃJ0%\u0099\u0002Æ\u008b\u000e\u0091*U\u001cÓè\u008d\u00068Üóài\u000fg}ql]#¡\u000fû\u008fD5f·]\u008eß°l\u000eÒÃ\u001d,\tçjg6àÛÜuÐ\u001c árÙxÝF¸2ÅÍ\u0090\u000e\u000fÿ\u0005(s[é©r*v\u0094e\u0089\u0014n53âïøxï\t\u001ddÎ÷Ë\u0083h¨Õ\bxfµ¦Ç\u0090¤9¥\u001cµ»ÓÆ!&~\u0082\u0015\u001eÚµÔ¯ÁNÖeu§U3ôa¸\u001a@\u0001TOý\u0001\u0095¾B¨\b/«Û\u0090\u000e-++®\u0082\tÇöµ²Ç\u0017\u0094\u0017Ùí'\u009eb\u0002ãàø\u0085uæ\u008a-§\u0013@cäV\"÷Î\u0090\u0010¯l9º$CKïs\u0086Ë|Eí4¦\r\u0092ÉÒTÝ\u0084îIÁ§K¦\tp\u001beE\u0092\u0019\"ÁÔ6¬c\u0012ï¹\b¡wÕØ»_\"ÛpttQ\u0094\u009e\u001bÖ\u009e%\u001eÙµ\b\u0000\u0002Õz/\u0006ÛãróµA§RC¨\u0005/ò\u009f´B)ç¯\u0007N¨Êr\u008bZÀ\u0012\u009d\u009d6\u009bLÊÝl½@F\u0004\u0084J\u0097òAà¡È\u000eë,\u001b\u00181¶'\u00895y9n;ø/E]Ú)\u0081\u007fö·æj\u001b\u009dUÙ\u0098_\u001e\u00077÷Ó;xn\u001d+[dèìTy4r\u009fô\u008eãä¿.\u008f\u00862¨²\u008c\u0087zXMá\rdf¦3- §ôa\u0019¡`OÅõFPØG¹\r\u0019\u001es|Ë\u0084]\u0004\u0086Ü³g°\u000f\u0095£X\u0086\u0089\u008f®éö/\u008b\r\u0087\u009c\u0014ÿ\u0098JÜÁøÏ\u0007l\u008e)\nAwz\u0088g\u0017z\u0083Qæ»ðí\u00ad\"©\u009bÐ*\b\b\u0095Ú®æ\u0019L\u0013ú\u0010\u0017u\u0016¹nó4\u0017[ÅiÐ@Î\u007f\u0005áâ\u009eEK·V\\ª' Ñ7»§ !#\u008det\u0097\u0086\u0096ëÞ7\u001c/¹Ãß«®üÕÏrþ\u000e\u008dV\u0085¹\u0007´JÖÎÀø\n\u0010jc\u0083\u0019ªS>/ñç\u001bÕò\u0082\u008b¹dU\u0011v¨ºÎý>rxÏÏJÿ÷\u0082w #\u008a\u0094½\u009c\u0005Sg'hø¥\u0000\u008f\u0095{\u000e¹\u0005\u0080ÚÕcAâ{Àm\u0086ÈÌ©\u0017ÛìZ\u0010Ô\u00ad\u008d.¡\u008a¯>3¦Ú\u0019¬d}ÜÆ\u0083\u0098Ö]\u0014\u0005=Jm¿t\u0014/r\u0004@\u0081Á\u009c\u0082\u0003Ç\u00ad»f´A\u0003ÆvÝ\u008dd=8y`\u00adi.>\u007fó\u0005\u0088^Yä8ò\u00adåÉ}r7\u009b4ÖÊ\u008eóD?.¼º4x\u0098®´¶U\u008aìWAV3¢øoW\u007f\u0086àÞý¦S\u001c8µÀ«³¡é\u00950²\u0012d¼$þW^e1$íÃJ:\f-\b:y\u0013%©àd¯Nfb\u0081\u0091a\u000f\u0098¾Æ\u009bNÇG!\u0006¥ÕZà) \u009e:³\u0001Ú)\u0081¬\t=#û(ð#+Bb\f\u0099ïh¬\u00022¥YR\u008a}ÐÆõÃ\u00ad\u00075\u0080£Ô¿0è\u007f\u001c4\u0003º\u009föWçuÌ\u0090}\n=\u00ad\\êyé\bðâÇ\"\u009d²\nB1õçÉi°öM\u009a/§\t;-ýÌ\bceo\u0090®1!\u0006¤á¨Óiòe¶\u0015\u00860>²âknÈ\u001dðÓËâ\u000fp¿AW\u009e\u0005d\u001bLÖ¨«\"äÏ=\u009e\u0088-0\u008c\u0007³ÞÄ2 ¤ÔQ\u009fá\u0094\u00adÚ>(ª\u0018\u0005\u0089Ñ\u0084:\u000eG\u0019b&f=§$\rZ²\u0019Ã¨âoÃ\u0081\u009eyÿ\u0087°ù©òsuq\u009cKyô\u0096è\u0096ý¹\n1}]¦\u0097ÇgØµ\u0094\u0017zl\u001e4\u0015A5ÿ\u0014\u000e;ÿnéÚ\u008a\u0012\u001fÁ^1+¼ÉK$\t\rK\u0010EÇ\u0083î°\u0010ÆúC$\"ÚëëKçI§w\u0013`\u008a"
         .getBytes("ISO-8859-1");

      int var59;
      do {
         abb[var10000] = ((var10002[var24] & 255) << 24 | (var10002[var24 + 1] & 255) << 16 | (var10002[var24 + 2] & 255) << 8 | var10002[var24 + 3] & 255)
            ^ 604420522;
         var10000 += 1;
         var59 = var24 + 4;
         var24 += 4;
      } while (var59 < var10002.length);

      String[] var7 = new String[b(1058332330, var19 ^ -691637067)];
      int var5 = 0;
      String var4;
      int var6 = (var4 = aaaa('䢍', (short)-12088, 297593222)).length();
      int var3 = b(1058332331, var19 ^ -1667931605);
      int var21 = -1;

      label94:
      while (true) {
         String var22 = var4.substring(++var21, var21 + var3);
         byte var27 = -1;

         while (true) {
            label89: {
               char[] var29 = var22.toCharArray();
               var59 = var29.length;
               int var8 = 0;
               var45 = var29;
               int var32 = var59;
               char[] var63;
               int var77;
               if (var59 <= 1) {
                  var63 = var29;
                  var77 = var8;
               } else {
                  var45 = var29;
                  var32 = var59;
                  if (var59 <= var8) {
                     break label89;
                  }

                  var63 = var29;
                  var77 = var8;
               }

               while (true) {
                  var63[var77] = (char)(var63[var77] ^ switch (var8 % b(1058332341, var19 ^ -1597259687)) {
                     case 0 -> b(1058332342, var19 ^ 190044306);
                     case 1 -> b(1058332343, var19 ^ -1295972726);
                     case 2 -> b(1058332336, var19 ^ 431256501);
                     case 3 -> b(1058332337, var19 ^ 1979865527);
                     case 4 -> b(1058332338, var19 ^ -894298908);
                     case 5 -> b(1058332339, var19 ^ -1819678522);
                     default -> b(1058332348, var19 ^ 1270051817);
                  });
                  var8++;
                  if (var32 == 0) {
                     var77 = var32;
                     var63 = var45;
                  } else {
                     if (var32 <= var8) {
                        break;
                     }

                     var63 = var45;
                     var77 = var8;
                  }
               }
            }

            String var70 = new String(var45).intern();
            switch (var27) {
               case 0:
                  var7[var5++] = var70;
                  if ((var21 += var3) >= var6) {
                     aa = var7;
                     aab = new String[b(1058332340, var19 ^ -1530561493)];
                     long var0 = 6883916646358571804L;
                     long var51 = 6883916646358358364L ^ var0;
                     byte var36 = -1;
                     ba = var51;
                     return;
                  }

                  var3 = var4.charAt(var21);
                  break;
               default:
                  var7[var5++] = var70;
                  if ((var21 += var3) < var6) {
                     var3 = var4.charAt(var21);
                     continue label94;
                  }

                  var6 = (var4 = aaaa(23014, (short)-6596, 297593223)).length();
                  var3 = 4;
                  var21 = -1;
            }

            var22 = var4.substring(++var21, var21 + var3);
            var27 = 0;
         }
      }
   }

   private static String aaaa(char var0, short var1, int var2) {
      int var7 = var2 ^ 297593222;
      char[] var6 = baa[var7].toCharArray();
      StackTraceElement[] var8 = (StackTraceElement[])bab[var7];
      StackTraceElement[] var9;
      if (var8 != null) {
         var9 = var8;
      } else {
         var9 = new Throwable().getStackTrace();
         bab[var7] = var9;
      }

      StackTraceElement var10 = var9[1];
      int var4 = (var10.getClassName().hashCode() ^ var10.getMethodName().hashCode()) >> 16 ^ 12391;
      int var5 = 0;

      do {
         var6[var5] = (char)(var6[var5] ^ switch (var5 % 26) {
            default -> 51;
            case 1 -> 102;
            case 2 -> 201;
            case 3 -> 60;
            case 4 -> 234;
            case 5 -> 42;
            case 6 -> 253;
            case 7 -> 34;
            case 8 -> 205;
            case 9 -> 22;
            case 10 -> 198;
            case 11 -> 58;
            case 12 -> 236;
            case 13 -> 216;
            case 14 -> 202;
            case 15 -> 251;
            case 16 -> 203;
            case 17 -> 68;
            case 18 -> 154;
            case 19 -> 113;
            case 20 -> 51;
            case 21 -> 137;
            case 22 -> 50;
            case 23 -> 18;
            case 24 -> 64;
            case 25 -> 76;
         } ^ var0 ^ var1 ^ var2 ^ var4);
      } while (++var5 < var6.length);

      return new String(var6).intern();
   }

   @Override
   public void aabaa() {
      this.bba();
   }

   private class_437 a(class_419 param1) {
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
      // 05: invokevirtual qeaa361f143ee4a0894bd168fd9b30c66/qf4ccf8f5435d4a78bdca4d6a018b578e/aabaaaaaa.ba (Lnet/minecraft/class_419;)Lnet/minecraft/class_437;
      // 08: astore 3
      // 09: istore 2
      // 0a: aload 3
      // 0b: iload 2
      // 0c: ifne 1d
      // 0f: ifnull 19
      // 12: goto 16
      // 15: athrow
      // 16: aload 3
      // 17: areturn
      // 18: athrow
      // 19: aload 0
      // 1a: invokevirtual qeaa361f143ee4a0894bd168fd9b30c66/qf4ccf8f5435d4a78bdca4d6a018b578e/aabaaaaaa.aa ()Lnet/minecraft/class_437;
      // 1d: areturn
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
      // 00: getstatic qeaa361f143ee4a0894bd168fd9b30c66/qf4ccf8f5435d4a78bdca4d6a018b578e/baaabbaa.bba I
      // 03: aload 0
      // 04: getfield qeaa361f143ee4a0894bd168fd9b30c66/qf4ccf8f5435d4a78bdca4d6a018b578e/aabaaaaaa.ab Lqeaa361f143ee4a0894bd168fd9b30c66/qf4ccf8f5435d4a78bdca4d6a018b578e/bababa;
      // 07: invokevirtual qeaa361f143ee4a0894bd168fd9b30c66/qf4ccf8f5435d4a78bdca4d6a018b578e/bababa.abbb ()Ljava/lang/Object;
      // 0a: checkcast java/lang/Double
      // 0d: invokevirtual java/lang/Double.doubleValue ()D
      // 10: dstore 2
      // 11: istore 1
      // 12: dload 2
      // 13: dload 2
      // 14: invokestatic java/lang/Math.rint (D)D
      // 17: dsub
      // 18: invokestatic java/lang/Math.abs (D)D
      // 1b: iload 1
      // 1c: ifne 32
      // 1f: ldc2_w 0.001
      // 22: dcmpg
      // 23: ifge 6c
      // 26: goto 2a
      // 29: athrow
      // 2a: dload 2
      // 2b: invokestatic java/lang/Math.rint (D)D
      // 2e: goto 32
      // 31: athrow
      // 32: d2i
      // 33: ldc_w 1058332547
      // 36: ldc_w 1852948305
      // 39: ldc_w 1281878414
      // 3c: ixor
      // 3d: invokestatic qeaa361f143ee4a0894bd168fd9b30c66/qf4ccf8f5435d4a78bdca4d6a018b578e/aabaaaaaa.b (II)I
      // 40: ldc_w 1058332556
      // 43: ldc_w 1852948305
      // 46: ldc_w -1471681368
      // 49: ixor
      // 4a: invokestatic qeaa361f143ee4a0894bd168fd9b30c66/qf4ccf8f5435d4a78bdca4d6a018b578e/aabaaaaaa.b (II)I
      // 4d: invokestatic qeaa361f143ee4a0894bd168fd9b30c66/qf4ccf8f5435d4a78bdca4d6a018b578e/aabaaaaaa.aba (II)Ljava/lang/String;
      // 50: invokestatic qeaa361f143ee4a0894bd168fd9b30c66/qf4ccf8f5435d4a78bdca4d6a018b578e/aabbaaaba.abba (Ljava/lang/String;)Ljava/lang/String;
      // 53: astore 5
      // 55: istore 4
      // 57: new java/lang/StringBuilder
      // 5a: dup
      // 5b: invokespecial java/lang/StringBuilder.<init> ()V
      // 5e: iload 4
      // 60: invokevirtual java/lang/StringBuilder.append (I)Ljava/lang/StringBuilder;
      // 63: aload 5
      // 65: invokevirtual java/lang/StringBuilder.append (Ljava/lang/Object;)Ljava/lang/StringBuilder;
      // 68: invokevirtual java/lang/StringBuilder.toString ()Ljava/lang/String;
      // 6b: areturn
      // 6c: getstatic java/util/Locale.ROOT Ljava/util/Locale;
      // 6f: ldc_w 1058332557
      // 72: ldc_w 1852948305
      // 75: ldc_w -1048911076
      // 78: ixor
      // 79: invokestatic qeaa361f143ee4a0894bd168fd9b30c66/qf4ccf8f5435d4a78bdca4d6a018b578e/aabaaaaaa.b (II)I
      // 7c: ldc_w 1058332558
      // 7f: ldc_w 1852948305
      // 82: ldc_w -41058267
      // 85: ixor
      // 86: invokestatic qeaa361f143ee4a0894bd168fd9b30c66/qf4ccf8f5435d4a78bdca4d6a018b578e/aabaaaaaa.b (II)I
      // 89: invokestatic qeaa361f143ee4a0894bd168fd9b30c66/qf4ccf8f5435d4a78bdca4d6a018b578e/aabaaaaaa.aba (II)Ljava/lang/String;
      // 8c: invokestatic qeaa361f143ee4a0894bd168fd9b30c66/qf4ccf8f5435d4a78bdca4d6a018b578e/aabbaaaba.abba (Ljava/lang/String;)Ljava/lang/String;
      // 8f: bipush 1
      // 90: anewarray 57
      // 93: dup
      // 94: bipush 0
      // 95: dload 2
      // 96: invokestatic java/lang/Double.valueOf (D)Ljava/lang/Double;
      // 99: aastore
      // 9a: invokestatic java/lang/String.format (Ljava/util/Locale;Ljava/lang/String;[Ljava/lang/Object;)Ljava/lang/String;
      // 9d: areturn
   }
}
