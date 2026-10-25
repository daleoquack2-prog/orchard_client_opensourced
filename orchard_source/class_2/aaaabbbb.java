package nsc;

import com.sun.jna.Pointer;
import net.fabricmc.api.EnvType;
import net.fabricmc.api.Environment;
import net.minecraft.class_310;
import net.minecraft.class_3675.class_306;

@Environment(EnvType.CLIENT)
public final class aaaabbbb {
   private static final Long[] aa;
   private static long ab;
   private static final int ba;
   private static double b;
   private static final int bb = 1;
   private static final long[] aaa;
   private static double aab;
   private static final Object[] abba;
   private static final int[] a;
   private static final String[] abab;
   private static final long[] aba;
   private static final int abb;
   private static final int baa = 0;
   private static boolean bab;
   private static final int bba;
   private static final int bbb;
   private static boolean aaaa;
   private static final Integer[] aaab;
   private static final long aaba;
   private static final int aabb;
   private static final int abaa = 1;

   private static boolean aa(abaaabbab var0, Pointer var1) {
      try {
         if (var1 == null) {
            return false;
         }
      } catch (MatchException var7) {
         throw var7;
      }

      boolean var2;
      try {
         var0.aba.invokeVoid(new Object[]{0, var1});
         var2 = true;
      } finally {
         var0.aab.invokeVoid(new Object[]{var1});
      }

      return var2;
   }

   public static synchronized void ab() {
      // $VF: Couldn't be decompiled
      // Please report this to the Vineflower issue tracker, at https://github.com/Vineflower/vineflower/issues with a copy of the class file (if you have the rights to distribute it!)
      // java.lang.RuntimeException: parsing failure!
      //   at org.jetbrains.java.decompiler.modules.decompiler.decompose.DomHelper.parseGraph(DomHelper.java:211)
      //   at org.jetbrains.java.decompiler.main.rels.MethodProcessor.codeToJava(MethodProcessor.java:166)
      //
      // Bytecode:
      // 00: getstatic qeaa361f143ee4a0894bd168fd9b30c66/qf4ccf8f5435d4a78bdca4d6a018b578e/aabbabbab.ab I
      // 03: getstatic qeaa361f143ee4a0894bd168fd9b30c66/qf4ccf8f5435d4a78bdca4d6a018b578e/abaaabbab.ab Lqeaa361f143ee4a0894bd168fd9b30c66/qf4ccf8f5435d4a78bdca4d6a018b578e/abaaabbab;
      // 06: astore 1
      // 07: istore 0
      // 08: aload 1
      // 09: ifnull 31
      // 0c: getstatic qeaa361f143ee4a0894bd168fd9b30c66/qf4ccf8f5435d4a78bdca4d6a018b578e/aaaabbbb.bab Z
      // 0f: iload 0
      // 10: ifne 2e
      // 13: goto 17
      // 16: athrow
      // 17: ifne 31
      // 1a: goto 1e
      // 1d: athrow
      // 1e: aload 1
      // 1f: iload 0
      // 20: ifne 3f
      // 23: goto 27
      // 26: athrow
      // 27: invokestatic qeaa361f143ee4a0894bd168fd9b30c66/qf4ccf8f5435d4a78bdca4d6a018b578e/aaaabbbb.abb (Lqeaa361f143ee4a0894bd168fd9b30c66/qf4ccf8f5435d4a78bdca4d6a018b578e/abaaabbab;)Z
      // 2a: goto 2e
      // 2d: athrow
      // 2e: ifeq 32
      // 31: return
      // 32: bipush 1
      // 33: putstatic qeaa361f143ee4a0894bd168fd9b30c66/qf4ccf8f5435d4a78bdca4d6a018b578e/aaaabbbb.bab Z
      // 36: iload 0
      // 37: ifne 59
      // 3a: aload 1
      // 3b: goto 3f
      // 3e: athrow
      // 3f: getfield qeaa361f143ee4a0894bd168fd9b30c66/qf4ccf8f5435d4a78bdca4d6a018b578e/abaaabbab.aaa Lcom/sun/jna/Function;
      // 42: ifnull 55
      // 45: aload 1
      // 46: getfield qeaa361f143ee4a0894bd168fd9b30c66/qf4ccf8f5435d4a78bdca4d6a018b578e/abaaabbab.aaa Lcom/sun/jna/Function;
      // 49: bipush 0
      // 4a: anewarray 4
      // 4d: invokevirtual com/sun/jna/Function.invokeInt ([Ljava/lang/Object;)I
      // 50: pop
      // 51: goto 55
      // 54: athrow
      // 55: lconst_0
      // 56: putstatic qeaa361f143ee4a0894bd168fd9b30c66/qf4ccf8f5435d4a78bdca4d6a018b578e/aaaabbbb.ab J
      // 59: return
   }

   private static long ba(int var0, long var1) {
      int var3 = (var0 ^ (int)var1 ^ a(-1970208283, 798751982 ^ -2121091162)) & a(-1970208284, 798751982 ^ -409983545);
      if (aa[var3] == null) {
         aa[var3] = aaa[var3] ^ var1;
      }

      return aa[var3];
   }

   private static boolean bb(class_310 param0) {
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
      // 09: ifnull 1f
      // 0c: goto 10
      // 0f: athrow
      // 10: aload 0
      // 11: iload 1
      // 12: ifne 23
      // 15: invokevirtual net/minecraft/class_310.method_22683 ()Lnet/minecraft/class_1041;
      // 18: ifnonnull 22
      // 1b: goto 1f
      // 1e: athrow
      // 1f: bipush 0
      // 20: ireturn
      // 21: athrow
      // 22: aload 0
      // 23: invokevirtual net/minecraft/class_310.method_22683 ()Lnet/minecraft/class_1041;
      // 26: invokevirtual net/minecraft/class_1041.method_4490 ()J
      // 29: lstore 2
      // 2a: bipush 1
      // 2b: newarray 10
      // 2d: astore 4
      // 2f: bipush 1
      // 30: newarray 10
      // 32: astore 5
      // 34: bipush 1
      // 35: newarray 10
      // 37: astore 6
      // 39: bipush 1
      // 3a: newarray 10
      // 3c: astore 7
      // 3e: lload 2
      // 3f: aload 4
      // 41: aload 5
      // 43: invokestatic org/lwjgl/glfw/GLFW.glfwGetWindowPos (J[I[I)V
      // 46: lload 2
      // 47: aload 6
      // 49: aload 7
      // 4b: invokestatic org/lwjgl/glfw/GLFW.glfwGetWindowSize (J[I[I)V
      // 4e: aload 6
      // 50: bipush 0
      // 51: iaload
      // 52: iload 1
      // 53: ifne 75
      // 56: ifle 70
      // 59: goto 5d
      // 5c: athrow
      // 5d: aload 7
      // 5f: iload 1
      // 60: ifne 8a
      // 63: goto 67
      // 66: athrow
      // 67: bipush 0
      // 68: iaload
      // 69: ifgt 76
      // 6c: goto 70
      // 6f: athrow
      // 70: bipush 0
      // 71: goto 75
      // 74: athrow
      // 75: ireturn
      // 76: aload 4
      // 78: bipush 0
      // 79: iaload
      // 7a: i2d
      // 7b: aload 6
      // 7d: bipush 0
      // 7e: iaload
      // 7f: i2d
      // 80: ldc2_w 0.5
      // 83: dmul
      // 84: dadd
      // 85: putstatic qeaa361f143ee4a0894bd168fd9b30c66/qf4ccf8f5435d4a78bdca4d6a018b578e/aaaabbbb.b D
      // 88: aload 5
      // 8a: bipush 0
      // 8b: iaload
      // 8c: i2d
      // 8d: aload 7
      // 8f: bipush 0
      // 90: iaload
      // 91: i2d
      // 92: ldc2_w 0.5
      // 95: dmul
      // 96: dadd
      // 97: putstatic qeaa361f143ee4a0894bd168fd9b30c66/qf4ccf8f5435d4a78bdca4d6a018b578e/aaaabbbb.aab D
      // 9a: bipush 1
      // 9b: ireturn
   }

   public static void aaa() {
      aba();
   }

   private static int a(int var0, int var1) {
      int var2 = a[var0 ^ -1970208283] ^ var1 ^ var0;
      var2 -= 4104;
      var2 -= 43425;
      var2 += 63873;
      var2 ^= 53682;
      var2 -= 39300;
      return var2 ^ 22658;
   }

   private static int b(int var0, long var1) {
      int var3 = var0 ^ (int)(var1 & 32767L) ^ a(-1970208320, -1685092003 ^ 1371773665);
      if (aaab[var3] == null) {
         aaab[var3] = (int)(aba[var3] ^ var1);
      }

      return aaab[var3];
   }

   public static synchronized boolean aab(class_310 param0, class_306 param1, boolean param2) {
      // $VF: Couldn't be decompiled
      // Please report this to the Vineflower issue tracker, at https://github.com/Vineflower/vineflower/issues with a copy of the class file (if you have the rights to distribute it!)
      // java.lang.RuntimeException: parsing failure!
      //   at org.jetbrains.java.decompiler.modules.decompiler.decompose.DomHelper.parseGraph(DomHelper.java:211)
      //   at org.jetbrains.java.decompiler.main.rels.MethodProcessor.codeToJava(MethodProcessor.java:166)
      //
      // Bytecode:
      // 00: getstatic qeaa361f143ee4a0894bd168fd9b30c66/qf4ccf8f5435d4a78bdca4d6a018b578e/aabbabbab.ab I
      // 03: getstatic qeaa361f143ee4a0894bd168fd9b30c66/qf4ccf8f5435d4a78bdca4d6a018b578e/abaaabbab.ab Lqeaa361f143ee4a0894bd168fd9b30c66/qf4ccf8f5435d4a78bdca4d6a018b578e/abaaabbab;
      // 06: astore 4
      // 08: istore 3
      // 09: aload 4
      // 0b: iload 3
      // 0c: ifne 18
      // 0f: ifnull 26
      // 12: goto 16
      // 15: athrow
      // 16: aload 4
      // 18: invokestatic qeaa361f143ee4a0894bd168fd9b30c66/qf4ccf8f5435d4a78bdca4d6a018b578e/aaaabbbb.abb (Lqeaa361f143ee4a0894bd168fd9b30c66/qf4ccf8f5435d4a78bdca4d6a018b578e/abaaabbab;)Z
      // 1b: iload 3
      // 1c: ifne 27
      // 1f: ifne 28
      // 22: goto 26
      // 25: athrow
      // 26: bipush 0
      // 27: ireturn
      // 28: aload 1
      // 29: iload 3
      // 2a: ifne 48
      // 2d: invokevirtual net/minecraft/class_3675$class_306.method_1442 ()Lnet/minecraft/class_3675$class_307;
      // 30: getstatic net/minecraft/class_3675$class_307.field_1672 Lnet/minecraft/class_3675$class_307;
      // 33: if_acmpne 47
      // 36: goto 3a
      // 39: athrow
      // 3a: aload 4
      // 3c: aload 0
      // 3d: aload 1
      // 3e: invokevirtual net/minecraft/class_3675$class_306.method_1444 ()I
      // 41: iload 2
      // 42: invokestatic qeaa361f143ee4a0894bd168fd9b30c66/qf4ccf8f5435d4a78bdca4d6a018b578e/aaaabbbb.baa (Lqeaa361f143ee4a0894bd168fd9b30c66/qf4ccf8f5435d4a78bdca4d6a018b578e/abaaabbab;Lnet/minecraft/class_310;IZ)Z
      // 45: ireturn
      // 46: athrow
      // 47: aload 1
      // 48: iload 3
      // 49: ifne 62
      // 4c: invokevirtual net/minecraft/class_3675$class_306.method_1442 ()Lnet/minecraft/class_3675$class_307;
      // 4f: getstatic net/minecraft/class_3675$class_307.field_1671 Lnet/minecraft/class_3675$class_307;
      // 52: if_acmpne 61
      // 55: goto 59
      // 58: athrow
      // 59: aload 1
      // 5a: invokevirtual net/minecraft/class_3675$class_306.method_1444 ()I
      // 5d: goto 68
      // 60: athrow
      // 61: aload 1
      // 62: invokevirtual net/minecraft/class_3675$class_306.method_1444 ()I
      // 65: invokestatic org/lwjgl/glfw/GLFW.glfwGetKeyScancode (I)I
      // 68: istore 5
      // 6a: iload 5
      // 6c: iload 3
      // 6d: ifne 9d
      // 70: iflt 98
      // 73: goto 77
      // 76: athrow
      // 77: iload 5
      // 79: iload 3
      // 7a: ifne 9d
      // 7d: goto 81
      // 80: athrow
      // 81: ldc -1970208317
      // 83: ldc 457267710
      // 85: ldc 779255607
      // 87: ixor
      // 88: invokestatic qeaa361f143ee4a0894bd168fd9b30c66/qf4ccf8f5435d4a78bdca4d6a018b578e/aaaabbbb.a (II)I
      // 8b: ldc2_w 7034659913633109503
      // 8e: invokestatic qeaa361f143ee4a0894bd168fd9b30c66/qf4ccf8f5435d4a78bdca4d6a018b578e/aaaabbbb.b (IJ)I
      // 91: if_icmple 9e
      // 94: goto 98
      // 97: athrow
      // 98: bipush 0
      // 99: goto 9d
      // 9c: athrow
      // 9d: ireturn
      // 9e: aload 4
      // a0: getfield qeaa361f143ee4a0894bd168fd9b30c66/qf4ccf8f5435d4a78bdca4d6a018b578e/abaaabbab.abb Lcom/sun/jna/Function;
      // a3: bipush 3
      // a4: anewarray 4
      // a7: dup
      // a8: bipush 0
      // a9: aconst_null
      // aa: aastore
      // ab: dup
      // ac: bipush 1
      // ad: iload 5
      // af: i2s
      // b0: iload 3
      // b1: ifne c7
      // b4: invokestatic java/lang/Short.valueOf (S)Ljava/lang/Short;
      // b7: aastore
      // b8: dup
      // b9: bipush 2
      // ba: iload 2
      // bb: ifeq ca
      // be: goto c2
      // c1: athrow
      // c2: bipush 1
      // c3: goto c7
      // c6: athrow
      // c7: goto cb
      // ca: bipush 0
      // cb: invokestatic java/lang/Integer.valueOf (I)Ljava/lang/Integer;
      // ce: aastore
      // cf: invokevirtual com/sun/jna/Function.invokePointer ([Ljava/lang/Object;)Lcom/sun/jna/Pointer;
      // d2: astore 6
      // d4: aload 4
      // d6: aload 6
      // d8: invokestatic qeaa361f143ee4a0894bd168fd9b30c66/qf4ccf8f5435d4a78bdca4d6a018b578e/aaaabbbb.aa (Lqeaa361f143ee4a0894bd168fd9b30c66/qf4ccf8f5435d4a78bdca4d6a018b578e/abaaabbab;Lcom/sun/jna/Pointer;)Z
      // db: ireturn
   }

   public static boolean aba() {
      try {
         if (abaaabbab.ab != null) {
            return true;
         }
      } catch (MatchException var0) {
         throw var0;
      }

      return false;
   }

   private static String bab(int var0, int var1) {
      int var3 = var0 ^ -1879414369;
      char[] var4 = abab[var3].toCharArray();
      StackTraceElement[] var2 = (StackTraceElement[])abba[var3];
      StackTraceElement[] var5;
      if (var2 != null) {
         var5 = var2;
      } else {
         var5 = new Throwable().getStackTrace();
         abba[var3] = var5;
      }

      StackTraceElement var6 = var5[1];
      int var7 = (var6.getClassName().hashCode() ^ var6.getMethodName().hashCode()) >> 16 ^ 1708066139;
      int var8 = 0;

      do {
         var4[var8] = (char)(var4[var8] ^ switch (var8 & 31) {
            default -> 205;
            case 1 -> 202;
            case 2 -> 54;
            case 3 -> 191;
            case 4 -> 205;
            case 5 -> 98;
            case 6 -> 216;
            case 7 -> 78;
            case 8 -> 156;
            case 9 -> 158;
            case 10 -> 111;
            case 11 -> 2;
            case 12 -> 20;
            case 13 -> 51;
            case 14 -> 52;
            case 15 -> 206;
            case 16 -> 60;
            case 17 -> 33;
            case 18 -> 13;
            case 19 -> 0;
            case 20 -> 22;
            case 21 -> 58;
            case 22 -> 76;
            case 23 -> 239;
            case 24 -> 151;
            case 25 -> 65;
            case 26 -> 148;
            case 27 -> 164;
            case 28 -> 109;
            case 29 -> 129;
            case 30 -> 166;
            case 31 -> 84;
         } ^ var1 >> 16 ^ var7);
      } while (++var8 < var4.length);

      return new String(var4).intern();
   }

   private static boolean abb(abaaabbab param0) {
      // $VF: Couldn't be decompiled
      // Please report this to the Vineflower issue tracker, at https://github.com/Vineflower/vineflower/issues with a copy of the class file (if you have the rights to distribute it!)
      // java.lang.NullPointerException: Cannot invoke "org.jetbrains.java.decompiler.code.cfg.ExceptionRangeCFG.isCircular()" because "range" is null
      //   at org.jetbrains.java.decompiler.modules.decompiler.decompose.DomHelper.graphToStatement(DomHelper.java:84)
      //   at org.jetbrains.java.decompiler.modules.decompiler.decompose.DomHelper.parseGraph(DomHelper.java:203)
      //   at org.jetbrains.java.decompiler.main.rels.MethodProcessor.codeToJava(MethodProcessor.java:166)
      //
      // Bytecode:
      // 00: getstatic qeaa361f143ee4a0894bd168fd9b30c66/qf4ccf8f5435d4a78bdca4d6a018b578e/aabbabbab.ab I
      // 03: istore 1
      // 04: aload 0
      // 05: getfield qeaa361f143ee4a0894bd168fd9b30c66/qf4ccf8f5435d4a78bdca4d6a018b578e/abaaabbab.aa Lcom/sun/jna/Function;
      // 08: ifnonnull 0e
      // 0b: bipush 1
      // 0c: ireturn
      // 0d: athrow
      // 0e: invokestatic java/lang/System.nanoTime ()J
      // 11: lstore 2
      // 12: getstatic qeaa361f143ee4a0894bd168fd9b30c66/qf4ccf8f5435d4a78bdca4d6a018b578e/aaaabbbb.ab J
      // 15: lconst_0
      // 16: lcmp
      // 17: iload 1
      // 18: ifne 75
      // 1b: ifeq 4a
      // 1e: goto 22
      // 21: athrow
      // 22: lload 2
      // 23: getstatic qeaa361f143ee4a0894bd168fd9b30c66/qf4ccf8f5435d4a78bdca4d6a018b578e/aaaabbbb.ab J
      // 26: lsub
      // 27: ldc_w -1970208318
      // 2a: ldc_w 299928153
      // 2d: ldc_w -1575606161
      // 30: ixor
      // 31: invokestatic qeaa361f143ee4a0894bd168fd9b30c66/qf4ccf8f5435d4a78bdca4d6a018b578e/aaaabbbb.a (II)I
      // 34: ldc2_w 6241970738016568023
      // 37: invokestatic qeaa361f143ee4a0894bd168fd9b30c66/qf4ccf8f5435d4a78bdca4d6a018b578e/aaaabbbb.ba (IJ)J
      // 3a: lcmp
      // 3b: iload 1
      // 3c: ifne 87
      // 3f: goto 43
      // 42: athrow
      // 43: ifle 84
      // 46: goto 4a
      // 49: athrow
      // 4a: aload 0
      // 4b: getfield qeaa361f143ee4a0894bd168fd9b30c66/qf4ccf8f5435d4a78bdca4d6a018b578e/abaaabbab.aa Lcom/sun/jna/Function;
      // 4e: bipush 0
      // 4f: anewarray 4
      // 52: invokevirtual com/sun/jna/Function.invokeInt ([Ljava/lang/Object;)I
      // 55: iload 1
      // 56: ifne 79
      // 59: goto 5d
      // 5c: athrow
      // 5d: ldc_w -1970208307
      // 60: ldc_w 299928153
      // 63: ldc_w 716979557
      // 66: ixor
      // 67: invokestatic qeaa361f143ee4a0894bd168fd9b30c66/qf4ccf8f5435d4a78bdca4d6a018b578e/aaaabbbb.a (II)I
      // 6a: ldc2_w 2718833477014861766
      // 6d: invokestatic qeaa361f143ee4a0894bd168fd9b30c66/qf4ccf8f5435d4a78bdca4d6a018b578e/aaaabbbb.b (IJ)I
      // 70: iand
      // 71: goto 75
      // 74: athrow
      // 75: ifeq 7c
      // 78: bipush 1
      // 79: goto 7d
      // 7c: bipush 0
      // 7d: putstatic qeaa361f143ee4a0894bd168fd9b30c66/qf4ccf8f5435d4a78bdca4d6a018b578e/aaaabbbb.aaaa Z
      // 80: lload 2
      // 81: putstatic qeaa361f143ee4a0894bd168fd9b30c66/qf4ccf8f5435d4a78bdca4d6a018b578e/aaaabbbb.ab J
      // 84: getstatic qeaa361f143ee4a0894bd168fd9b30c66/qf4ccf8f5435d4a78bdca4d6a018b578e/aaaabbbb.aaaa Z
      // 87: ireturn
   }

   private static boolean baa(abaaabbab param0, class_310 param1, int param2, boolean param3) {
      // $VF: Couldn't be decompiled
      // Please report this to the Vineflower issue tracker, at https://github.com/Vineflower/vineflower/issues with a copy of the class file (if you have the rights to distribute it!)
      // java.lang.NullPointerException: Cannot invoke "org.jetbrains.java.decompiler.code.cfg.ExceptionRangeCFG.isCircular()" because "range" is null
      //   at org.jetbrains.java.decompiler.modules.decompiler.decompose.DomHelper.graphToStatement(DomHelper.java:84)
      //   at org.jetbrains.java.decompiler.modules.decompiler.decompose.DomHelper.parseGraph(DomHelper.java:203)
      //   at org.jetbrains.java.decompiler.main.rels.MethodProcessor.codeToJava(MethodProcessor.java:166)
      //
      // Bytecode:
      // 000: getstatic qeaa361f143ee4a0894bd168fd9b30c66/qf4ccf8f5435d4a78bdca4d6a018b578e/aabbabbab.ab I
      // 003: istore 4
      // 005: iload 2
      // 006: iload 4
      // 008: ifne 064
      // 00b: lookupswitch 84 2 0 26 1 55
      // 024: athrow
      // 025: iload 3
      // 026: iload 4
      // 028: ifne 037
      // 02b: goto 02f
      // 02e: athrow
      // 02f: ifeq 03a
      // 032: goto 036
      // 035: athrow
      // 036: bipush 1
      // 037: goto 03b
      // 03a: bipush 2
      // 03b: istore 5
      // 03d: iload 4
      // 03f: ifeq 0d3
      // 042: iload 3
      // 043: iload 4
      // 045: ifne 054
      // 048: goto 04c
      // 04b: athrow
      // 04c: ifeq 057
      // 04f: goto 053
      // 052: athrow
      // 053: bipush 3
      // 054: goto 058
      // 057: bipush 4
      // 058: istore 5
      // 05a: iload 4
      // 05c: ifeq 0d3
      // 05f: iload 2
      // 060: goto 064
      // 063: athrow
      // 064: iload 4
      // 066: ifne 09a
      // 069: bipush 2
      // 06a: if_icmplt 095
      // 06d: goto 071
      // 070: athrow
      // 071: iload 2
      // 072: iload 4
      // 074: ifne 09c
      // 077: goto 07b
      // 07a: athrow
      // 07b: ldc_w -1970208308
      // 07e: ldc_w 344777215
      // 081: ldc_w -1117897114
      // 084: ixor
      // 085: invokestatic qeaa361f143ee4a0894bd168fd9b30c66/qf4ccf8f5435d4a78bdca4d6a018b578e/aaaabbbb.a (II)I
      // 088: ldc2_w 420160520038254301
      // 08b: invokestatic qeaa361f143ee4a0894bd168fd9b30c66/qf4ccf8f5435d4a78bdca4d6a018b578e/aaaabbbb.b (IJ)I
      // 08e: if_icmple 09b
      // 091: goto 095
      // 094: athrow
      // 095: bipush 0
      // 096: goto 09a
      // 099: athrow
      // 09a: ireturn
      // 09b: iload 3
      // 09c: iload 4
      // 09e: ifne 0bb
      // 0a1: ifeq 0be
      // 0a4: goto 0a8
      // 0a7: athrow
      // 0a8: ldc_w -1970208305
      // 0ab: ldc_w 344777215
      // 0ae: ldc_w 702466937
      // 0b1: ixor
      // 0b2: invokestatic qeaa361f143ee4a0894bd168fd9b30c66/qf4ccf8f5435d4a78bdca4d6a018b578e/aaaabbbb.a (II)I
      // 0b5: ldc2_w 5974348593345510947
      // 0b8: invokestatic qeaa361f143ee4a0894bd168fd9b30c66/qf4ccf8f5435d4a78bdca4d6a018b578e/aaaabbbb.b (IJ)I
      // 0bb: goto 0d1
      // 0be: ldc_w -1970208306
      // 0c1: ldc_w 344777215
      // 0c4: ldc_w 1945185240
      // 0c7: ixor
      // 0c8: invokestatic qeaa361f143ee4a0894bd168fd9b30c66/qf4ccf8f5435d4a78bdca4d6a018b578e/aaaabbbb.a (II)I
      // 0cb: ldc2_w 3343054892899688770
      // 0ce: invokestatic qeaa361f143ee4a0894bd168fd9b30c66/qf4ccf8f5435d4a78bdca4d6a018b578e/aaaabbbb.b (IJ)I
      // 0d1: istore 5
      // 0d3: iload 3
      // 0d4: iload 4
      // 0d6: ifne 0fe
      // 0d9: ifne 0f6
      // 0dc: goto 0e0
      // 0df: athrow
      // 0e0: getstatic qeaa361f143ee4a0894bd168fd9b30c66/qf4ccf8f5435d4a78bdca4d6a018b578e/aaaabbbb.b D
      // 0e3: invokestatic java/lang/Double.isNaN (D)Z
      // 0e6: iload 4
      // 0e8: ifne 0fe
      // 0eb: goto 0ef
      // 0ee: athrow
      // 0ef: ifeq 10c
      // 0f2: goto 0f6
      // 0f5: athrow
      // 0f6: aload 1
      // 0f7: invokestatic qeaa361f143ee4a0894bd168fd9b30c66/qf4ccf8f5435d4a78bdca4d6a018b578e/aaaabbbb.bb (Lnet/minecraft/class_310;)Z
      // 0fa: goto 0fe
      // 0fd: athrow
      // 0fe: iload 4
      // 100: ifne 10b
      // 103: ifne 10c
      // 106: goto 10a
      // 109: athrow
      // 10a: bipush 0
      // 10b: ireturn
      // 10c: aload 0
      // 10d: getfield qeaa361f143ee4a0894bd168fd9b30c66/qf4ccf8f5435d4a78bdca4d6a018b578e/abaaabbab.ba Lcom/sun/jna/Function;
      // 110: bipush 5
      // 111: anewarray 4
      // 114: dup
      // 115: bipush 0
      // 116: aconst_null
      // 117: aastore
      // 118: dup
      // 119: bipush 1
      // 11a: iload 5
      // 11c: invokestatic java/lang/Integer.valueOf (I)Ljava/lang/Integer;
      // 11f: aastore
      // 120: dup
      // 121: bipush 2
      // 122: getstatic qeaa361f143ee4a0894bd168fd9b30c66/qf4ccf8f5435d4a78bdca4d6a018b578e/aaaabbbb.b D
      // 125: invokestatic java/lang/Double.valueOf (D)Ljava/lang/Double;
      // 128: aastore
      // 129: dup
      // 12a: bipush 3
      // 12b: getstatic qeaa361f143ee4a0894bd168fd9b30c66/qf4ccf8f5435d4a78bdca4d6a018b578e/aaaabbbb.aab D
      // 12e: invokestatic java/lang/Double.valueOf (D)Ljava/lang/Double;
      // 131: aastore
      // 132: dup
      // 133: bipush 4
      // 134: iload 2
      // 135: invokestatic java/lang/Integer.valueOf (I)Ljava/lang/Integer;
      // 138: aastore
      // 139: invokevirtual com/sun/jna/Function.invokePointer ([Ljava/lang/Object;)Lcom/sun/jna/Pointer;
      // 13c: astore 6
      // 13e: iload 4
      // 140: ifne 16d
      // 143: aload 6
      // 145: ifnonnull 14f
      // 148: goto 14c
      // 14b: athrow
      // 14c: bipush 0
      // 14d: ireturn
      // 14e: athrow
      // 14f: aload 0
      // 150: getfield qeaa361f143ee4a0894bd168fd9b30c66/qf4ccf8f5435d4a78bdca4d6a018b578e/abaaabbab.a Lcom/sun/jna/Function;
      // 153: bipush 3
      // 154: anewarray 4
      // 157: dup
      // 158: bipush 0
      // 159: aload 6
      // 15b: aastore
      // 15c: dup
      // 15d: bipush 1
      // 15e: bipush 1
      // 15f: invokestatic java/lang/Integer.valueOf (I)Ljava/lang/Integer;
      // 162: aastore
      // 163: dup
      // 164: bipush 2
      // 165: lconst_1
      // 166: invokestatic java/lang/Long.valueOf (J)Ljava/lang/Long;
      // 169: aastore
      // 16a: invokevirtual com/sun/jna/Function.invokeVoid ([Ljava/lang/Object;)V
      // 16d: aload 0
      // 16e: aload 6
      // 170: invokestatic qeaa361f143ee4a0894bd168fd9b30c66/qf4ccf8f5435d4a78bdca4d6a018b578e/aaaabbbb.aa (Lqeaa361f143ee4a0894bd168fd9b30c66/qf4ccf8f5435d4a78bdca4d6a018b578e/abaaabbab;Lcom/sun/jna/Pointer;)Z
      // 173: ireturn
   }

   static {
      int var26 = -1509483836;
      String[] var18 = new String[6];
      int var10001 = "@诨袠諜좦袸좕譄ࢁ詨좢袨࢚識䢚蠰좙诰\u0896謤袑诸ࢃ詌ࢱ補袹行좾詠좺袘䢇觤袁諬袿蠘ࢎ覴ࢨ襜좶诤䢖訠䢱謐\u0892謴좥誜䢛诐袃诠䢻蠔䢧觐ࢶ覴䢥览좉\n⬩튵⣝\u12b7⫭ኅ⪍劎⯽劸\u0010呶\ue549埊敕嗂ꕙ嘪ꕉ噆╗嚞╜垾╱埲\ue57c\n䆂搟䉶ꐝ䁆ꐯ䀦\ue424䅖\ue412\u0010⾘˱ⷔ䋗⽴싩⹔䋝\u2fd8싔⸀싔⸌䋻⺐싢\n뺏믯뵻篭뽋篟뼫㯔빛㯢"
         .length();
      short var21 = 31941;
      int var17 = var10001;
      int var20 = 0;
      int var19 = 0;
      String var16 = "@诨袠諜좦袸좕譄ࢁ詨좢袨࢚識䢚蠰좙诰\u0896謤袑诸ࢃ詌ࢱ補袹行좾詠좺袘䢇觤袁諬袿蠘ࢎ覴ࢨ襜좶诤䢖訠䢱謐\u0892謴좥誜䢛诐袃诠䢻蠔䢧觐ࢶ覴䢥览좉\n⬩튵⣝\u12b7⫭ኅ⪍劎⯽劸\u0010呶\ue549埊敕嗂ꕙ嘪ꕉ噆╗嚞╜垾╱埲\ue57c\n䆂搟䉶ꐝ䁆ꐯ䀦\ue424䅖\ue412\u0010⾘˱ⷔ䋗⽴싩⹔䋝\u2fd8싔⸀싔⸌䋻⺐싢\n뺏믯뵻篭뽋篟뼫㯔빛㯢";

      do {
         char var22 = var16.charAt(var20);
         int var24 = 0;
         char[] var23 = var16.substring(var20 + 1, var20 + 1 + var22).toCharArray();

         do {
            char var25 = var23[var24];
            if (var24 % 2 == 0) {
               var23[var24] = (char)((var25 >>> 2 | var25 << 14) & 65535 ^ var21);
            } else {
               var23[var24] = (char)((var25 << 2 | var25 >>> 14) & 65535 ^ var21);
            }
         } while (++var24 < var23.length);

         var18[var19] = new String(var23);
         var19++;
         var20 = var20 + var22 + 1;
      } while (var20 < var17);

      abab = var18;
      abba = new Object[var18.length];
      byte var10000 = 0;
      a = new int[44];
      int var32 = 0;
      byte[] var10002 = "leUÎ\ngÕxàV|§ÃÔÑý\u0018¤+\u009e\u0087$à\u0090´½Yç\u0086Ã$£eÖ¥9î\u0090\u0081Ê\u0092ãc\u0016\u009e\u001a9\u0004\u0003\u0088b\u008dÏôiñ\u0089b\u009eiûÉSîJÔ\u0099-¹FEÇñÒ¢×X\u0088ói\u0095Æ\u0097æÁ¯6\u007f\u00ad¾\u0012\u0091\u0087éé6þ9H_Ë\u0085,\u008b\u000eÜEi\u0006U\u0017ê³ëÒ\u0088Hm\u009bH¤uH\u0010\u008c¹\u001b\u0085JWi\u0010©w\u009e\u0015I\u007fHT·T÷WÝæ$M÷ÞUT\b¡kj\u008edâùù0¥w\u0094@\u009cÉÿ>\u0002AZî+\u0001"
         .getBytes("ISO-8859-1");

      int var60;
      do {
         a[var10000] = ((var10002[var32] & 255) << 24 | (var10002[var32 + 1] & 255) << 16 | (var10002[var32 + 2] & 255) << 8 | var10002[var32 + 3] & 255)
            ^ -1224549010;
         var10000 += 1;
         var60 = var32 + 4;
         var32 += 4;
      } while (var60 < var10002.length);

      long var8 = 2890802807539300027L;
      long[] var14 = new long[a(-1970208281, var26 ^ -2076354292)];
      int var11 = 0;
      String var12;
      int var13 = (var12 = bab(-1879414369, var26 ^ 1360420955)).length();
      byte var10 = 0;

      label66:
      while (true) {
         var32 = var10;
         var10 += 8;
         String var28 = var12.substring(var32, var10);
         var32 = -1879414370;
         int var48 = var26 ^ 965755687;
         byte[] var15 = var28.getBytes("ISO-8859-1");
         long[] var29 = var14;
         var32 = var11++;
         long var49 = (var15[0] & 255L) << a(-1970208282, var26 ^ -1480592379)
            | (var15[1] & 255L) << a(-1970208287, var26 ^ 2093944441)
            | (var15[2] & 255L) << a(-1970208288, var26 ^ -481311458)
            | (var15[3] & 255L) << a(-1970208285, var26 ^ -791249902)
            | (var15[4] & 255L) << a(-1970208286, var26 ^ -492306113)
            | (var15[5] & 255L) << a(-1970208275, var26 ^ 29196466)
            | (var15[a(-1970208276, var26 ^ -1963219858)] & 255L) << a(-1970208273, var26 ^ -158841161)
            | var15[a(-1970208274, var26 ^ -93250397)] & 255L;
         byte var61 = -1;

         while (true) {
            long var71 = var49 ^ var8;
            switch (var61) {
               case 0:
                  var29[var32] = var71;
                  if (var10 >= var13) {
                     aba = var14;
                     aaab = new Integer[a(-1970208272, var26 ^ -1513876541)];
                     abb = b(a(-1970208269, var26 ^ 908809741), 8568631912179338119L);
                     bba = b(a(-1970208270, var26 ^ 477933518), 7114950370998651496L);
                     ba = b(a(-1970208259, var26 ^ 1705778307), 7547517258796111981L);
                     bbb = b(a(-1970208260, var26 ^ 1343255179), 9024590003000279609L);
                     aabb = b(a(-1970208257, var26 ^ 1790395590), 591799536765816561L);
                     long var0 = 3557576577786727327L;
                     long[] var6 = new long[2];
                     int var3 = 0;
                     String var4;
                     int var5 = (var4 = bab(-1879414373, var26 ^ 2027115223)).length();
                     byte var2 = 0;

                     do {
                        int var40 = var2;
                        var2 += 8;
                        String var31 = var4.substring(var40, var2);
                        var40 = -1879414374;
                        int var52 = var26 ^ -1661402437;
                        byte[] var7 = var31.getBytes("ISO-8859-1");
                        var40 = var3++;
                        var71 = (
                              (var7[0] & 255L) << a(-1970208258, var26 ^ 1648243210)
                                 | (var7[1] & 255L) << a(-1970208263, var26 ^ -679413897)
                                 | (var7[2] & 255L) << a(-1970208264, var26 ^ 738639582)
                                 | (var7[3] & 255L) << a(-1970208261, var26 ^ -1071747587)
                                 | (var7[4] & 255L) << a(-1970208262, var26 ^ -388874751)
                                 | (var7[5] & 255L) << a(-1970208315, var26 ^ 775703731)
                                 | (var7[a(-1970208316, var26 ^ -853754983)] & 255L) << a(-1970208313, var26 ^ 756313565)
                                 | var7[a(-1970208314, var26 ^ -750791976)] & 255L
                           )
                           ^ var0;
                        var61 = -1;
                        var6[var40] = var71;
                     } while (var2 < var5);

                     aaa = var6;
                     aa = new Long[2];
                     aaba = ba(a(-1970208319, var26 ^ -1181929134), 1683295003482759081L);
                     b = Double.NaN;
                     aab = Double.NaN;
                     return;
                  }
                  break;
               default:
                  var29[var32] = var71;
                  if (var10 < var13) {
                     continue label66;
                  }

                  var13 = (var12 = bab(-1879414371, var26 ^ -429753693)).length();
                  var10 = 0;
            }

            int var38 = var10;
            var10 += 8;
            String var30 = var12.substring(var38, var10);
            var38 = -1879414372;
            int var51 = var26 ^ -482732767;
            var15 = var30.getBytes("ISO-8859-1");
            var29 = var14;
            var32 = var11++;
            var49 = (var15[0] & 255L) << a(-1970208279, var26 ^ 1742948218)
               | (var15[1] & 255L) << a(-1970208280, var26 ^ -1415623649)
               | (var15[2] & 255L) << a(-1970208277, var26 ^ -318129172)
               | (var15[3] & 255L) << a(-1970208278, var26 ^ -1616742894)
               | (var15[4] & 255L) << a(-1970208267, var26 ^ 784317606)
               | (var15[5] & 255L) << a(-1970208268, var26 ^ -584228779)
               | (var15[a(-1970208265, var26 ^ -1783003288)] & 255L) << a(-1970208266, var26 ^ 1021564625)
               | var15[a(-1970208271, var26 ^ -240274850)] & 255L;
            var61 = 0;
         }
      }
   }

   private aaaabbbb() {
   }
}
