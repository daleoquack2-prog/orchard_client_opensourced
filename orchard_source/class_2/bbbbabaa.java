package nsc;

import net.fabricmc.api.EnvType;
import net.fabricmc.api.Environment;

@Environment(EnvType.CLIENT)
public record bbbbabaa(
   float a,
   abaaabbb b,
   abbabbabb c,
   boolean d,
   aaaabbbba e,
   abababaa f,
   boolean g,
   float aX,
   boolean aY
) {
   private final aaaabbbba aa;
   private final abbabbabb ab;
   private final abababaa ba;
   private final boolean bb;
   private final float aaa;
   private final boolean aab;
   private final abaaabbb aba;
   private final float b;
   private final boolean a;

   bbbbabaa(
      float var1,
      abaaabbb var2,
      abbabbabb var3,
      boolean var4,
      aaaabbbba var5
   ) {
      this(var1, var2, var3, var4, var5, abababaa.aa(), false, 1.0F);
   }

   public boolean aa() {
      return this.bb;
   }

   public bbbbabaa(
      float var1,
      abaaabbb var2,
      abbabbabb var3,
      boolean var4,
      aaaabbbba var5,
      abababaa var6,
      boolean var7,
      float var8
   ) {
      this(var1, var2, var3, var4, var5, var6, var7, var8, false);
   }

   public boolean ab() {
      return this.a;
   }

   static bbbbabaa ba(float param0, boolean param1, float param2) {
      // $VF: Couldn't be decompiled
      // Please report this to the Vineflower issue tracker, at https://github.com/Vineflower/vineflower/issues with a copy of the class file (if you have the rights to distribute it!)
      // java.lang.RuntimeException: parsing failure!
      //   at org.jetbrains.java.decompiler.modules.decompiler.decompose.DomHelper.parseGraph(DomHelper.java:211)
      //   at org.jetbrains.java.decompiler.main.rels.MethodProcessor.codeToJava(MethodProcessor.java:166)
      //
      // Bytecode:
      // 00: getstatic qeaa361f143ee4a0894bd168fd9b30c66/qf4ccf8f5435d4a78bdca4d6a018b578e/baaabbaa.bba I
      // 03: istore 3
      // 04: fload 0
      // 05: iload 3
      // 06: ifne 18
      // 09: invokestatic java/lang/Float.isFinite (F)Z
      // 0c: ifeq 1b
      // 0f: goto 13
      // 12: athrow
      // 13: fload 0
      // 14: goto 18
      // 17: athrow
      // 18: goto 1c
      // 1b: fconst_0
      // 1c: fstore 4
      // 1e: fload 4
      // 20: ldc 100.0
      // 22: fdiv
      // 23: ldc 0.01
      // 25: fconst_1
      // 26: invokestatic net/minecraft/class_3532.method_15363 (FFF)F
      // 29: fstore 5
      // 2b: fload 4
      // 2d: ldc 4.5
      // 2f: fmul
      // 30: ldc 120.0
      // 32: ldc 485.0
      // 34: invokestatic net/minecraft/class_3532.method_15363 (FFF)F
      // 37: fstore 6
      // 39: ldc 1.6
      // 3b: ldc 4.4
      // 3d: fload 5
      // 3f: fmul
      // 40: fadd
      // 41: fstore 7
      // 43: fload 2
      // 44: fconst_0
      // 45: fconst_1
      // 46: invokestatic net/minecraft/class_3532.method_15363 (FFF)F
      // 49: fstore 8
      // 4b: fload 4
      // 4d: ldc 100.0
      // 4f: fdiv
      // 50: ldc 0.01
      // 52: ldc 2.5
      // 54: invokestatic net/minecraft/class_3532.method_15363 (FFF)F
      // 57: fstore 9
      // 59: new qeaa361f143ee4a0894bd168fd9b30c66/qf4ccf8f5435d4a78bdca4d6a018b578e/bbbbabaa
      // 5c: dup
      // 5d: fload 6
      // 5f: getstatic qeaa361f143ee4a0894bd168fd9b30c66/qf4ccf8f5435d4a78bdca4d6a018b578e/abaaabbb.a Lqeaa361f143ee4a0894bd168fd9b30c66/qf4ccf8f5435d4a78bdca4d6a018b578e/abaaabbb;
      // 62: getstatic qeaa361f143ee4a0894bd168fd9b30c66/qf4ccf8f5435d4a78bdca4d6a018b578e/abbabbabb.a Lqeaa361f143ee4a0894bd168fd9b30c66/qf4ccf8f5435d4a78bdca4d6a018b578e/abbabbabb;
      // 65: iload 1
      // 66: fload 6
      // 68: getstatic qeaa361f143ee4a0894bd168fd9b30c66/qf4ccf8f5435d4a78bdca4d6a018b578e/abbabbabb.a Lqeaa361f143ee4a0894bd168fd9b30c66/qf4ccf8f5435d4a78bdca4d6a018b578e/abbabbabb;
      // 6b: invokestatic qeaa361f143ee4a0894bd168fd9b30c66/qf4ccf8f5435d4a78bdca4d6a018b578e/aaaabbbba.aaab (FLqeaa361f143ee4a0894bd168fd9b30c66/qf4ccf8f5435d4a78bdca4d6a018b578e/abbabbabb;)Lqeaa361f143ee4a0894bd168fd9b30c66/qf4ccf8f5435d4a78bdca4d6a018b578e/aaaabbbba;
      // 6e: new qeaa361f143ee4a0894bd168fd9b30c66/qf4ccf8f5435d4a78bdca4d6a018b578e/abababaa
      // 71: dup
      // 72: fload 8
      // 74: fconst_0
      // 75: fconst_0
      // 76: fconst_0
      // 77: fconst_1
      // 78: fconst_0
      // 79: fload 9
      // 7b: fload 9
      // 7d: invokespecial qeaa361f143ee4a0894bd168fd9b30c66/qf4ccf8f5435d4a78bdca4d6a018b578e/abababaa.<init> (FFFFFFFF)V
      // 80: bipush 0
      // 81: fload 7
      // 83: invokespecial qeaa361f143ee4a0894bd168fd9b30c66/qf4ccf8f5435d4a78bdca4d6a018b578e/bbbbabaa.<init> (FLqeaa361f143ee4a0894bd168fd9b30c66/qf4ccf8f5435d4a78bdca4d6a018b578e/abaaabbb;Lqeaa361f143ee4a0894bd168fd9b30c66/qf4ccf8f5435d4a78bdca4d6a018b578e/abbabbabb;ZLqeaa361f143ee4a0894bd168fd9b30c66/qf4ccf8f5435d4a78bdca4d6a018b578e/aaaabbbba;Lqeaa361f143ee4a0894bd168fd9b30c66/qf4ccf8f5435d4a78bdca4d6a018b578e/abababaa;ZF)V
      // 86: areturn
   }

   public abaaabbb bb() {
      return this.aba;
   }

   bbbbabaa(
      float var1,
      abaaabbb var2,
      abbabbabb var3,
      boolean var4,
      aaaabbbba var5,
      abababaa var6
   ) {
      this(var1, var2, var3, var4, var5, var6, false, 1.0F);
   }

   static bbbbabaa aaa(float var0, boolean var1) {
      return ba(var0, var1, 0.2578F);
   }

   static bbbbabaa aab(float param0, boolean param1, float param2) {
      // $VF: Couldn't be decompiled
      // Please report this to the Vineflower issue tracker, at https://github.com/Vineflower/vineflower/issues with a copy of the class file (if you have the rights to distribute it!)
      // java.lang.RuntimeException: parsing failure!
      //   at org.jetbrains.java.decompiler.modules.decompiler.decompose.DomHelper.parseGraph(DomHelper.java:211)
      //   at org.jetbrains.java.decompiler.main.rels.MethodProcessor.codeToJava(MethodProcessor.java:166)
      //
      // Bytecode:
      // 00: getstatic qeaa361f143ee4a0894bd168fd9b30c66/qf4ccf8f5435d4a78bdca4d6a018b578e/baaabbaa.bba I
      // 03: istore 3
      // 04: fload 0
      // 05: iload 3
      // 06: ifne 1c
      // 09: invokestatic java/lang/Float.isFinite (F)Z
      // 0c: ifeq 1f
      // 0f: goto 13
      // 12: athrow
      // 13: fconst_1
      // 14: fload 0
      // 15: invokestatic java/lang/Math.max (FF)F
      // 18: goto 1c
      // 1b: athrow
      // 1c: goto 21
      // 1f: ldc 50.0
      // 21: fstore 4
      // 23: fload 4
      // 25: ldc 4.5
      // 27: fmul
      // 28: ldc 120.0
      // 2a: ldc 485.0
      // 2c: invokestatic net/minecraft/class_3532.method_15363 (FFF)F
      // 2f: fstore 5
      // 31: fload 4
      // 33: ldc 9.0
      // 35: fsub
      // 36: ldc 81.0
      // 38: fdiv
      // 39: fconst_0
      // 3a: fconst_1
      // 3b: invokestatic net/minecraft/class_3532.method_15363 (FFF)F
      // 3e: fstore 6
      // 40: ldc 0.6
      // 42: ldc 3.4
      // 44: fload 6
      // 46: f2d
      // 47: ldc2_w 1.3
      // 4a: invokestatic java/lang/Math.pow (DD)D
      // 4d: d2f
      // 4e: fmul
      // 4f: fadd
      // 50: fstore 7
      // 52: new qeaa361f143ee4a0894bd168fd9b30c66/qf4ccf8f5435d4a78bdca4d6a018b578e/bbbbabaa
      // 55: dup
      // 56: fload 5
      // 58: getstatic qeaa361f143ee4a0894bd168fd9b30c66/qf4ccf8f5435d4a78bdca4d6a018b578e/abaaabbb.a Lqeaa361f143ee4a0894bd168fd9b30c66/qf4ccf8f5435d4a78bdca4d6a018b578e/abaaabbb;
      // 5b: getstatic qeaa361f143ee4a0894bd168fd9b30c66/qf4ccf8f5435d4a78bdca4d6a018b578e/abbabbabb.a Lqeaa361f143ee4a0894bd168fd9b30c66/qf4ccf8f5435d4a78bdca4d6a018b578e/abbabbabb;
      // 5e: iload 1
      // 5f: fload 5
      // 61: getstatic qeaa361f143ee4a0894bd168fd9b30c66/qf4ccf8f5435d4a78bdca4d6a018b578e/abbabbabb.a Lqeaa361f143ee4a0894bd168fd9b30c66/qf4ccf8f5435d4a78bdca4d6a018b578e/abbabbabb;
      // 64: invokestatic qeaa361f143ee4a0894bd168fd9b30c66/qf4ccf8f5435d4a78bdca4d6a018b578e/aaaabbbba.aaab (FLqeaa361f143ee4a0894bd168fd9b30c66/qf4ccf8f5435d4a78bdca4d6a018b578e/abbabbabb;)Lqeaa361f143ee4a0894bd168fd9b30c66/qf4ccf8f5435d4a78bdca4d6a018b578e/aaaabbbba;
      // 67: new qeaa361f143ee4a0894bd168fd9b30c66/qf4ccf8f5435d4a78bdca4d6a018b578e/abababaa
      // 6a: dup
      // 6b: fload 2
      // 6c: fconst_0
      // 6d: fconst_1
      // 6e: invokestatic net/minecraft/class_3532.method_15363 (FFF)F
      // 71: fconst_0
      // 72: fconst_0
      // 73: fconst_0
      // 74: fconst_1
      // 75: fconst_0
      // 76: fconst_1
      // 77: fconst_1
      // 78: invokespecial qeaa361f143ee4a0894bd168fd9b30c66/qf4ccf8f5435d4a78bdca4d6a018b578e/abababaa.<init> (FFFFFFFF)V
      // 7b: bipush 0
      // 7c: fload 7
      // 7e: invokespecial qeaa361f143ee4a0894bd168fd9b30c66/qf4ccf8f5435d4a78bdca4d6a018b578e/bbbbabaa.<init> (FLqeaa361f143ee4a0894bd168fd9b30c66/qf4ccf8f5435d4a78bdca4d6a018b578e/abaaabbb;Lqeaa361f143ee4a0894bd168fd9b30c66/qf4ccf8f5435d4a78bdca4d6a018b578e/abbabbabb;ZLqeaa361f143ee4a0894bd168fd9b30c66/qf4ccf8f5435d4a78bdca4d6a018b578e/aaaabbbba;Lqeaa361f143ee4a0894bd168fd9b30c66/qf4ccf8f5435d4a78bdca4d6a018b578e/abababaa;ZF)V
      // 81: areturn
   }

   static bbbbabaa aba(float param0) {
      // $VF: Couldn't be decompiled
      // Please report this to the Vineflower issue tracker, at https://github.com/Vineflower/vineflower/issues with a copy of the class file (if you have the rights to distribute it!)
      // java.lang.RuntimeException: parsing failure!
      //   at org.jetbrains.java.decompiler.modules.decompiler.decompose.DomHelper.parseGraph(DomHelper.java:211)
      //   at org.jetbrains.java.decompiler.main.rels.MethodProcessor.codeToJava(MethodProcessor.java:166)
      //
      // Bytecode:
      // 00: getstatic qeaa361f143ee4a0894bd168fd9b30c66/qf4ccf8f5435d4a78bdca4d6a018b578e/baaabbaa.bba I
      // 03: istore 1
      // 04: fload 0
      // 05: iload 1
      // 06: ifne 1c
      // 09: invokestatic java/lang/Float.isFinite (F)Z
      // 0c: ifeq 1f
      // 0f: goto 13
      // 12: athrow
      // 13: fconst_1
      // 14: fload 0
      // 15: invokestatic java/lang/Math.max (FF)F
      // 18: goto 1c
      // 1b: athrow
      // 1c: goto 21
      // 1f: ldc 50.0
      // 21: fstore 2
      // 22: fload 2
      // 23: ldc 100.0
      // 25: fdiv
      // 26: ldc 0.01
      // 28: fconst_1
      // 29: invokestatic net/minecraft/class_3532.method_15363 (FFF)F
      // 2c: fstore 3
      // 2d: fload 2
      // 2e: ldc 3.2
      // 30: fmul
      // 31: ldc 107.0
      // 33: ldc 320.0
      // 35: invokestatic net/minecraft/class_3532.method_15363 (FFF)F
      // 38: fstore 4
      // 3a: ldc 0.78
      // 3c: fload 3
      // 3d: ldc 0.32
      // 3f: fmul
      // 40: fsub
      // 41: ldc 0.42
      // 43: ldc 0.78
      // 45: invokestatic net/minecraft/class_3532.method_15363 (FFF)F
      // 48: fstore 5
      // 4a: fload 2
      // 4b: ldc 38.0
      // 4d: fdiv
      // 4e: ldc 0.65
      // 50: ldc 2.85
      // 52: invokestatic net/minecraft/class_3532.method_15363 (FFF)F
      // 55: fstore 6
      // 57: new qeaa361f143ee4a0894bd168fd9b30c66/qf4ccf8f5435d4a78bdca4d6a018b578e/bbbbabaa
      // 5a: dup
      // 5b: fload 4
      // 5d: getstatic qeaa361f143ee4a0894bd168fd9b30c66/qf4ccf8f5435d4a78bdca4d6a018b578e/abaaabbb.a Lqeaa361f143ee4a0894bd168fd9b30c66/qf4ccf8f5435d4a78bdca4d6a018b578e/abaaabbb;
      // 60: getstatic qeaa361f143ee4a0894bd168fd9b30c66/qf4ccf8f5435d4a78bdca4d6a018b578e/abbabbabb.a Lqeaa361f143ee4a0894bd168fd9b30c66/qf4ccf8f5435d4a78bdca4d6a018b578e/abbabbabb;
      // 63: bipush 1
      // 64: fload 4
      // 66: getstatic qeaa361f143ee4a0894bd168fd9b30c66/qf4ccf8f5435d4a78bdca4d6a018b578e/abbabbabb.a Lqeaa361f143ee4a0894bd168fd9b30c66/qf4ccf8f5435d4a78bdca4d6a018b578e/abbabbabb;
      // 69: invokestatic qeaa361f143ee4a0894bd168fd9b30c66/qf4ccf8f5435d4a78bdca4d6a018b578e/aaaabbbba.aaab (FLqeaa361f143ee4a0894bd168fd9b30c66/qf4ccf8f5435d4a78bdca4d6a018b578e/abbabbabb;)Lqeaa361f143ee4a0894bd168fd9b30c66/qf4ccf8f5435d4a78bdca4d6a018b578e/aaaabbbba;
      // 6c: new qeaa361f143ee4a0894bd168fd9b30c66/qf4ccf8f5435d4a78bdca4d6a018b578e/abababaa
      // 6f: dup
      // 70: fload 5
      // 72: fconst_0
      // 73: fconst_0
      // 74: fconst_0
      // 75: fconst_1
      // 76: fconst_0
      // 77: fload 3
      // 78: fload 3
      // 79: invokespecial qeaa361f143ee4a0894bd168fd9b30c66/qf4ccf8f5435d4a78bdca4d6a018b578e/abababaa.<init> (FFFFFFFF)V
      // 7c: bipush 0
      // 7d: fload 6
      // 7f: invokespecial qeaa361f143ee4a0894bd168fd9b30c66/qf4ccf8f5435d4a78bdca4d6a018b578e/bbbbabaa.<init> (FLqeaa361f143ee4a0894bd168fd9b30c66/qf4ccf8f5435d4a78bdca4d6a018b578e/abaaabbb;Lqeaa361f143ee4a0894bd168fd9b30c66/qf4ccf8f5435d4a78bdca4d6a018b578e/abbabbabb;ZLqeaa361f143ee4a0894bd168fd9b30c66/qf4ccf8f5435d4a78bdca4d6a018b578e/aaaabbbba;Lqeaa361f143ee4a0894bd168fd9b30c66/qf4ccf8f5435d4a78bdca4d6a018b578e/abababaa;ZF)V
      // 82: areturn
   }

   static bbbbabaa abb(float var0) {
      return aaa(var0, true);
   }

   public float b() {
      return this.aaa;
   }

   public boolean baa() {
      return this.aab;
   }

   bbbbabaa(
      float var1, abaaabbb var2, abbabbabb var3, boolean var4
   ) {
      this(var1, var2, var3, var4, aaaabbbba.aaab(var1, var3), abababaa.aa(), false, 1.0F);
   }

   public abababaa bab() {
      return this.ba;
   }

   public bbbbabaa(
      float a,
      abaaabbb b,
      abbabbabb c,
      boolean d,
      aaaabbbba e,
      abababaa f,
      boolean g,
      float aX,
      boolean aY
   ) {
      // $VF: Couldn't be decompiled
      // Please report this to the Vineflower issue tracker, at https://github.com/Vineflower/vineflower/issues with a copy of the class file (if you have the rights to distribute it!)
      // java.lang.RuntimeException: parsing failure!
      //   at org.jetbrains.java.decompiler.modules.decompiler.decompose.DomHelper.parseGraph(DomHelper.java:211)
      //   at org.jetbrains.java.decompiler.main.rels.MethodProcessor.codeToJava(MethodProcessor.java:166)
      //
      // Bytecode:
      // 00: getstatic qeaa361f143ee4a0894bd168fd9b30c66/qf4ccf8f5435d4a78bdca4d6a018b578e/baaabbaa.bba I
      // 03: aload 0
      // 04: invokespecial java/lang/Record.<init> ()V
      // 07: istore 10
      // 09: aload 5
      // 0b: iload 10
      // 0d: ifne 20
      // 10: ifnonnull 22
      // 13: goto 17
      // 16: athrow
      // 17: fload 1
      // 18: aload 3
      // 19: invokestatic qeaa361f143ee4a0894bd168fd9b30c66/qf4ccf8f5435d4a78bdca4d6a018b578e/aaaabbbba.aaab (FLqeaa361f143ee4a0894bd168fd9b30c66/qf4ccf8f5435d4a78bdca4d6a018b578e/abbabbabb;)Lqeaa361f143ee4a0894bd168fd9b30c66/qf4ccf8f5435d4a78bdca4d6a018b578e/aaaabbbba;
      // 1c: goto 20
      // 1f: athrow
      // 20: astore 5
      // 22: aload 6
      // 24: iload 10
      // 26: ifne 33
      // 29: ifnonnull 35
      // 2c: goto 30
      // 2f: athrow
      // 30: invokestatic qeaa361f143ee4a0894bd168fd9b30c66/qf4ccf8f5435d4a78bdca4d6a018b578e/abababaa.aa ()Lqeaa361f143ee4a0894bd168fd9b30c66/qf4ccf8f5435d4a78bdca4d6a018b578e/abababaa;
      // 33: astore 6
      // 35: fload 8
      // 37: iload 10
      // 39: ifne 5f
      // 3c: invokestatic java/lang/Float.isFinite (F)Z
      // 3f: ifeq 5a
      // 42: goto 46
      // 45: athrow
      // 46: fload 8
      // 48: iload 10
      // 4a: ifne 5f
      // 4d: goto 51
      // 50: athrow
      // 51: fconst_0
      // 52: fcmpg
      // 53: ifgt 61
      // 56: goto 5a
      // 59: athrow
      // 5a: fconst_1
      // 5b: goto 5f
      // 5e: athrow
      // 5f: fstore 8
      // 61: aload 0
      // 62: fload 1
      // 63: putfield qeaa361f143ee4a0894bd168fd9b30c66/qf4ccf8f5435d4a78bdca4d6a018b578e/bbbbabaa.b F
      // 66: aload 0
      // 67: aload 2
      // 68: putfield qeaa361f143ee4a0894bd168fd9b30c66/qf4ccf8f5435d4a78bdca4d6a018b578e/bbbbabaa.aba Lqeaa361f143ee4a0894bd168fd9b30c66/qf4ccf8f5435d4a78bdca4d6a018b578e/abaaabbb;
      // 6b: aload 0
      // 6c: aload 3
      // 6d: putfield qeaa361f143ee4a0894bd168fd9b30c66/qf4ccf8f5435d4a78bdca4d6a018b578e/bbbbabaa.ab Lqeaa361f143ee4a0894bd168fd9b30c66/qf4ccf8f5435d4a78bdca4d6a018b578e/abbabbabb;
      // 70: aload 0
      // 71: iload 4
      // 73: putfield qeaa361f143ee4a0894bd168fd9b30c66/qf4ccf8f5435d4a78bdca4d6a018b578e/bbbbabaa.a Z
      // 76: aload 0
      // 77: aload 5
      // 79: putfield qeaa361f143ee4a0894bd168fd9b30c66/qf4ccf8f5435d4a78bdca4d6a018b578e/bbbbabaa.aa Lqeaa361f143ee4a0894bd168fd9b30c66/qf4ccf8f5435d4a78bdca4d6a018b578e/aaaabbbba;
      // 7c: aload 0
      // 7d: aload 6
      // 7f: putfield qeaa361f143ee4a0894bd168fd9b30c66/qf4ccf8f5435d4a78bdca4d6a018b578e/bbbbabaa.ba Lqeaa361f143ee4a0894bd168fd9b30c66/qf4ccf8f5435d4a78bdca4d6a018b578e/abababaa;
      // 82: aload 0
      // 83: iload 7
      // 85: putfield qeaa361f143ee4a0894bd168fd9b30c66/qf4ccf8f5435d4a78bdca4d6a018b578e/bbbbabaa.bb Z
      // 88: aload 0
      // 89: fload 8
      // 8b: putfield qeaa361f143ee4a0894bd168fd9b30c66/qf4ccf8f5435d4a78bdca4d6a018b578e/bbbbabaa.aaa F
      // 8e: aload 0
      // 8f: iload 9
      // 91: putfield qeaa361f143ee4a0894bd168fd9b30c66/qf4ccf8f5435d4a78bdca4d6a018b578e/bbbbabaa.aab Z
      // 94: return
   }

   bbbbabaa(
      float var1,
      abaaabbb var2,
      abbabbabb var3,
      boolean var4,
      aaaabbbba var5,
      boolean var6
   ) {
      this(var1, var2, var3, var4, var5, abababaa.aa(), var6, 1.0F);
   }

   public float bba() {
      return this.b;
   }

   public aaaabbbba a() {
      return this.aa;
   }

   public abbabbabb bbb() {
      return this.ab;
   }
}
