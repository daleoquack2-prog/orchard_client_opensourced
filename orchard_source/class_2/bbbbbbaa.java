package nsc;

import net.fabricmc.api.EnvType;
import net.fabricmc.api.Environment;
import net.minecraft.class_310;

@Environment(EnvType.CLIENT)
public final class bbbbbbaa {
   private static int aa;
   private static int ab;
   private static final Object[] aaaa;
   private static final int ba;
   private static int a;
   private static int bb;
   private static final int[] bba;
   private static int aaa;
   private static int aab;
   private static final String[] bbb;
   private static final Integer[] aba;
   private static int abb;
   private static int baa;
   private static final double bab = 0.01;
   private static final long[] b;

   private static int aa(int var0, long var1) {
      int var3 = var0 ^ (int)(var1 & 32767L) ^ aaaba(-876582777, -842140769 ^ 86877344);
      if (aba[var3] == null) {
         aba[var3] = (int)(b[var3] ^ var1);
      }

      return aba[var3];
   }

   private static String aaabb(char var0, int var1, short var2) {
      int var3 = var0 ^ '\ud886';
      char[] var4 = bbb[var3].toCharArray();
      StackTraceElement[] var5 = (StackTraceElement[])aaaa[var3];
      StackTraceElement[] var6;
      if (var5 != null) {
         var6 = var5;
      } else {
         var6 = new Throwable().getStackTrace();
         aaaa[var3] = var6;
      }

      StackTraceElement var7 = var6[1];
      int var8 = (var7.getClassName().hashCode() ^ var7.getMethodName().hashCode()) >> 16 ^ 11213;
      int var9 = 0;

      do {
         int var10 = var4[var9] + '볷';
         var10 ^= 51570;
         var10 -= 28943;
         var10 += 23454;
         var10 -= 4825;
         var10 ^= 2026;
         var10 += 52335;
         var10 += 47206;
         var10 ^= 20707;
         var4[var9] = (char)(var10 ^ var8 ^ var2 ^ var1 >> 16);
      } while (++var9 < var4.length);

      return new String(var4).intern();
   }

   public static boolean ab(class_310 var0) {
      return aaaaa(var0);
   }

   public static void ba(class_310 var0) {
   }

   private static boolean bb(class_310 param0) {
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
      // 06: ifne 11
      // 09: ifnull 32
      // 0c: goto 10
      // 0f: athrow
      // 10: aload 0
      // 11: iload 1
      // 12: ifne 24
      // 15: getfield net/minecraft/class_310.field_1724 Lnet/minecraft/class_746;
      // 18: ifnull 32
      // 1b: goto 1f
      // 1e: athrow
      // 1f: aload 0
      // 20: goto 24
      // 23: athrow
      // 24: iload 1
      // 25: ifne 36
      // 28: getfield net/minecraft/class_310.field_1690 Lnet/minecraft/class_315;
      // 2b: ifnonnull 35
      // 2e: goto 32
      // 31: athrow
      // 32: bipush 0
      // 33: ireturn
      // 34: athrow
      // 35: aload 0
      // 36: getfield net/minecraft/class_310.field_1690 Lnet/minecraft/class_315;
      // 39: getfield net/minecraft/class_315.field_1894 Lnet/minecraft/class_304;
      // 3c: invokevirtual net/minecraft/class_304.method_1434 ()Z
      // 3f: iload 1
      // 40: ifne cc
      // 43: ifne c7
      // 46: goto 4a
      // 49: athrow
      // 4a: aload 0
      // 4b: getfield net/minecraft/class_310.field_1690 Lnet/minecraft/class_315;
      // 4e: getfield net/minecraft/class_315.field_1881 Lnet/minecraft/class_304;
      // 51: invokevirtual net/minecraft/class_304.method_1434 ()Z
      // 54: iload 1
      // 55: ifne cc
      // 58: goto 5c
      // 5b: athrow
      // 5c: ifne c7
      // 5f: goto 63
      // 62: athrow
      // 63: aload 0
      // 64: getfield net/minecraft/class_310.field_1690 Lnet/minecraft/class_315;
      // 67: getfield net/minecraft/class_315.field_1913 Lnet/minecraft/class_304;
      // 6a: invokevirtual net/minecraft/class_304.method_1434 ()Z
      // 6d: iload 1
      // 6e: ifne cc
      // 71: goto 75
      // 74: athrow
      // 75: ifne c7
      // 78: goto 7c
      // 7b: athrow
      // 7c: aload 0
      // 7d: getfield net/minecraft/class_310.field_1690 Lnet/minecraft/class_315;
      // 80: getfield net/minecraft/class_315.field_1849 Lnet/minecraft/class_304;
      // 83: invokevirtual net/minecraft/class_304.method_1434 ()Z
      // 86: iload 1
      // 87: ifne cc
      // 8a: goto 8e
      // 8d: athrow
      // 8e: ifne c7
      // 91: goto 95
      // 94: athrow
      // 95: aload 0
      // 96: getfield net/minecraft/class_310.field_1690 Lnet/minecraft/class_315;
      // 99: getfield net/minecraft/class_315.field_1903 Lnet/minecraft/class_304;
      // 9c: invokevirtual net/minecraft/class_304.method_1434 ()Z
      // 9f: iload 1
      // a0: ifne cc
      // a3: goto a7
      // a6: athrow
      // a7: ifne c7
      // aa: goto ae
      // ad: athrow
      // ae: aload 0
      // af: iload 1
      // b0: ifne ce
      // b3: goto b7
      // b6: athrow
      // b7: getfield net/minecraft/class_310.field_1690 Lnet/minecraft/class_315;
      // ba: getfield net/minecraft/class_315.field_1832 Lnet/minecraft/class_304;
      // bd: invokevirtual net/minecraft/class_304.method_1434 ()Z
      // c0: ifeq cd
      // c3: goto c7
      // c6: athrow
      // c7: bipush 1
      // c8: goto cc
      // cb: athrow
      // cc: ireturn
      // cd: aload 0
      // ce: invokestatic qeaa361f143ee4a0894bd168fd9b30c66/qf4ccf8f5435d4a78bdca4d6a018b578e/aabbabbbb.bbabaab (Lnet/minecraft/class_310;)Z
      // d1: ireturn
   }

   public static void aaa(class_310 var0, int var1) {
      int var2 = baaabbaa.bba;

      int var10000;
      label22: {
         try {
            var10000 = bab(var0);
            if (var2 != 0) {
               break label22;
            }

            if (var10000 == 0) {
               return;
            }
         } catch (MatchException var4) {
            throw var4;
         }

         var10000 = Math.max(1, var1);
      }

      int var3 = var10000;
      aaa = Math.max(aaa, var0.field_1724.field_6012 + var3);
   }

   public static boolean aab(class_310 param0) {
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
      // 05: invokestatic qeaa361f143ee4a0894bd168fd9b30c66/qf4ccf8f5435d4a78bdca4d6a018b578e/bbbbbbaa.bab (Lnet/minecraft/class_310;)Z
      // 08: iload 1
      // 09: ifne 16
      // 0c: ifeq 30
      // 0f: goto 13
      // 12: athrow
      // 13: getstatic qeaa361f143ee4a0894bd168fd9b30c66/qf4ccf8f5435d4a78bdca4d6a018b578e/bbbbbbaa.bb I
      // 16: iload 1
      // 17: ifne 2d
      // 1a: aload 0
      // 1b: getfield net/minecraft/class_310.field_1724 Lnet/minecraft/class_746;
      // 1e: getfield net/minecraft/class_746.field_6012 I
      // 21: if_icmpne 30
      // 24: goto 28
      // 27: athrow
      // 28: bipush 1
      // 29: goto 2d
      // 2c: athrow
      // 2d: goto 31
      // 30: bipush 0
      // 31: ireturn
   }

   public static boolean aba(class_310 param0) {
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
      // 05: invokestatic qeaa361f143ee4a0894bd168fd9b30c66/qf4ccf8f5435d4a78bdca4d6a018b578e/bbbbbbaa.bab (Lnet/minecraft/class_310;)Z
      // 08: iload 1
      // 09: ifne 19
      // 0c: ifne 16
      // 0f: goto 13
      // 12: athrow
      // 13: bipush 0
      // 14: ireturn
      // 15: athrow
      // 16: getstatic qeaa361f143ee4a0894bd168fd9b30c66/qf4ccf8f5435d4a78bdca4d6a018b578e/bbbbbbaa.bb I
      // 19: iload 1
      // 1a: ifne 33
      // 1d: aload 0
      // 1e: getfield net/minecraft/class_310.field_1724 Lnet/minecraft/class_746;
      // 21: getfield net/minecraft/class_746.field_6012 I
      // 24: if_icmpne 2e
      // 27: goto 2b
      // 2a: athrow
      // 2b: bipush 1
      // 2c: ireturn
      // 2d: athrow
      // 2e: aload 0
      // 2f: invokestatic qeaa361f143ee4a0894bd168fd9b30c66/qf4ccf8f5435d4a78bdca4d6a018b578e/bbbbbbaa.bbab (Lnet/minecraft/class_310;)V
      // 32: bipush 0
      // 33: ireturn
   }

   public static boolean abb(class_310 param0) {
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
      // 06: ifne 17
      // 09: invokestatic qeaa361f143ee4a0894bd168fd9b30c66/qf4ccf8f5435d4a78bdca4d6a018b578e/bbbbbbaa.bab (Lnet/minecraft/class_310;)Z
      // 0c: ifne 16
      // 0f: goto 13
      // 12: athrow
      // 13: bipush 0
      // 14: ireturn
      // 15: athrow
      // 16: aload 0
      // 17: invokestatic qeaa361f143ee4a0894bd168fd9b30c66/qf4ccf8f5435d4a78bdca4d6a018b578e/bbbbbbaa.aabb (Lnet/minecraft/class_310;)Z
      // 1a: iload 1
      // 1b: ifne 26
      // 1e: ifne 29
      // 21: goto 25
      // 24: athrow
      // 25: bipush 1
      // 26: goto 2a
      // 29: bipush 0
      // 2a: ireturn
   }

   private static int aaaba(int var0, int var1) {
      int var2 = bba[var0 ^ -876582777] ^ var1 ^ var0;
      var2 += 25808;
      var2 ^= 21255;
      var2 -= 28400;
      var2 ^= 42077;
      var2 -= 35248;
      var2 += 57763;
      var2 ^= 20496;
      var2 ^= 27007;
      var2 += 48187;
      return var2 ^ 55317;
   }

   public static boolean baa(class_310 param0) {
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
      // 06: ifne 17
      // 09: invokestatic qeaa361f143ee4a0894bd168fd9b30c66/qf4ccf8f5435d4a78bdca4d6a018b578e/bbbbbbaa.bab (Lnet/minecraft/class_310;)Z
      // 0c: ifne 16
      // 0f: goto 13
      // 12: athrow
      // 13: bipush 0
      // 14: ireturn
      // 15: athrow
      // 16: aload 0
      // 17: iload 1
      // 18: ifne 29
      // 1b: invokestatic qeaa361f143ee4a0894bd168fd9b30c66/qf4ccf8f5435d4a78bdca4d6a018b578e/bbbbbbaa.aaaab (Lnet/minecraft/class_310;)Z
      // 1e: ifne 28
      // 21: goto 25
      // 24: athrow
      // 25: bipush 0
      // 26: ireturn
      // 27: athrow
      // 28: aload 0
      // 29: invokestatic qeaa361f143ee4a0894bd168fd9b30c66/qf4ccf8f5435d4a78bdca4d6a018b578e/bbbbbbaa.aabb (Lnet/minecraft/class_310;)Z
      // 2c: iload 1
      // 2d: ifne 3b
      // 30: ifeq 3a
      // 33: goto 37
      // 36: athrow
      // 37: bipush 0
      // 38: ireturn
      // 39: athrow
      // 3a: bipush 1
      // 3b: ireturn
   }

   private static boolean bab(class_310 param0) {
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
      // 06: ifne 11
      // 09: ifnull 35
      // 0c: goto 10
      // 0f: athrow
      // 10: aload 0
      // 11: iload 1
      // 12: ifne 24
      // 15: getfield net/minecraft/class_310.field_1724 Lnet/minecraft/class_746;
      // 18: ifnull 35
      // 1b: goto 1f
      // 1e: athrow
      // 1f: aload 0
      // 20: goto 24
      // 23: athrow
      // 24: getfield net/minecraft/class_310.field_1724 Lnet/minecraft/class_746;
      // 27: iload 1
      // 28: ifne 43
      // 2b: invokevirtual net/minecraft/class_746.method_5805 ()Z
      // 2e: ifne 3f
      // 31: goto 35
      // 34: athrow
      // 35: invokestatic qeaa361f143ee4a0894bd168fd9b30c66/qf4ccf8f5435d4a78bdca4d6a018b578e/bbbbbbaa.baba ()V
      // 38: bipush 0
      // 39: putstatic qeaa361f143ee4a0894bd168fd9b30c66/qf4ccf8f5435d4a78bdca4d6a018b578e/bbbbbbaa.aa I
      // 3c: bipush 0
      // 3d: ireturn
      // 3e: athrow
      // 3f: aload 0
      // 40: getfield net/minecraft/class_310.field_1724 Lnet/minecraft/class_746;
      // 43: invokestatic java/lang/System.identityHashCode (Ljava/lang/Object;)I
      // 46: istore 2
      // 47: getstatic qeaa361f143ee4a0894bd168fd9b30c66/qf4ccf8f5435d4a78bdca4d6a018b578e/bbbbbbaa.aa I
      // 4a: iload 1
      // 4b: ifne 62
      // 4e: iload 2
      // 4f: if_icmpeq 61
      // 52: goto 56
      // 55: athrow
      // 56: iload 2
      // 57: putstatic qeaa361f143ee4a0894bd168fd9b30c66/qf4ccf8f5435d4a78bdca4d6a018b578e/bbbbbbaa.aa I
      // 5a: invokestatic qeaa361f143ee4a0894bd168fd9b30c66/qf4ccf8f5435d4a78bdca4d6a018b578e/bbbbbbaa.baba ()V
      // 5d: goto 61
      // 60: athrow
      // 61: bipush 1
      // 62: ireturn
   }

   public static boolean bba(class_310 param0) {
      // $VF: Couldn't be decompiled
      // Please report this to the Vineflower issue tracker, at https://github.com/Vineflower/vineflower/issues with a copy of the class file (if you have the rights to distribute it!)
      // java.lang.RuntimeException: parsing failure!
      //   at org.jetbrains.java.decompiler.modules.decompiler.decompose.DomHelper.parseGraph(DomHelper.java:211)
      //   at org.jetbrains.java.decompiler.main.rels.MethodProcessor.codeToJava(MethodProcessor.java:166)
      //
      // Bytecode:
      // 000: ldc 1503076618
      // 002: istore 3
      // 003: getstatic qeaa361f143ee4a0894bd168fd9b30c66/qf4ccf8f5435d4a78bdca4d6a018b578e/baaabbaa.bba I
      // 006: istore 1
      // 007: aload 0
      // 008: invokestatic qeaa361f143ee4a0894bd168fd9b30c66/qf4ccf8f5435d4a78bdca4d6a018b578e/bbbbbbaa.bab (Lnet/minecraft/class_310;)Z
      // 00b: iload 1
      // 00c: ifne 01c
      // 00f: ifne 019
      // 012: goto 016
      // 015: athrow
      // 016: bipush 0
      // 017: ireturn
      // 018: athrow
      // 019: getstatic qeaa361f143ee4a0894bd168fd9b30c66/qf4ccf8f5435d4a78bdca4d6a018b578e/bbbbbbaa.a I
      // 01c: iload 1
      // 01d: ifne 048
      // 020: ldc -876582778
      // 022: iload 3
      // 023: ldc 875893294
      // 025: ixor
      // 026: invokestatic qeaa361f143ee4a0894bd168fd9b30c66/qf4ccf8f5435d4a78bdca4d6a018b578e/bbbbbbaa.aaaba (II)I
      // 029: ldc2_w 8059398804031287877
      // 02c: invokestatic qeaa361f143ee4a0894bd168fd9b30c66/qf4ccf8f5435d4a78bdca4d6a018b578e/bbbbbbaa.aa (IJ)I
      // 02f: if_icmpne 039
      // 032: goto 036
      // 035: athrow
      // 036: bipush 0
      // 037: ireturn
      // 038: athrow
      // 039: aload 0
      // 03a: getfield net/minecraft/class_310.field_1724 Lnet/minecraft/class_746;
      // 03d: iload 1
      // 03e: ifne 055
      // 041: getfield net/minecraft/class_746.field_6012 I
      // 044: goto 048
      // 047: athrow
      // 048: getstatic qeaa361f143ee4a0894bd168fd9b30c66/qf4ccf8f5435d4a78bdca4d6a018b578e/bbbbbbaa.a I
      // 04b: if_icmpge 051
      // 04e: bipush 0
      // 04f: ireturn
      // 050: athrow
      // 051: aload 0
      // 052: getfield net/minecraft/class_310.field_1724 Lnet/minecraft/class_746;
      // 055: getfield net/minecraft/class_746.field_6012 I
      // 058: iload 1
      // 059: ifne 130
      // 05c: getstatic qeaa361f143ee4a0894bd168fd9b30c66/qf4ccf8f5435d4a78bdca4d6a018b578e/bbbbbbaa.a I
      // 05f: if_icmplt 12f
      // 062: goto 066
      // 065: athrow
      // 066: getstatic qeaa361f143ee4a0894bd168fd9b30c66/qf4ccf8f5435d4a78bdca4d6a018b578e/bbbbbbaa.ab I
      // 069: iload 1
      // 06a: ifne 084
      // 06d: goto 071
      // 070: athrow
      // 071: aload 0
      // 072: getfield net/minecraft/class_310.field_1724 Lnet/minecraft/class_746;
      // 075: getfield net/minecraft/class_746.field_6012 I
      // 078: if_icmpne 087
      // 07b: goto 07f
      // 07e: athrow
      // 07f: bipush 1
      // 080: goto 084
      // 083: athrow
      // 084: goto 088
      // 087: bipush 0
      // 088: istore 2
      // 089: ldc -876582779
      // 08b: iload 3
      // 08c: ldc -1870976073
      // 08e: ixor
      // 08f: invokestatic qeaa361f143ee4a0894bd168fd9b30c66/qf4ccf8f5435d4a78bdca4d6a018b578e/bbbbbbaa.aaaba (II)I
      // 092: ldc2_w 8059398804031287877
      // 095: invokestatic qeaa361f143ee4a0894bd168fd9b30c66/qf4ccf8f5435d4a78bdca4d6a018b578e/bbbbbbaa.aa (IJ)I
      // 098: iload 1
      // 099: ifne 118
      // 09c: putstatic qeaa361f143ee4a0894bd168fd9b30c66/qf4ccf8f5435d4a78bdca4d6a018b578e/bbbbbbaa.a I
      // 09f: aload 0
      // 0a0: getfield net/minecraft/class_310.field_1724 Lnet/minecraft/class_746;
      // 0a3: getfield net/minecraft/class_746.field_6012 I
      // 0a6: putstatic qeaa361f143ee4a0894bd168fd9b30c66/qf4ccf8f5435d4a78bdca4d6a018b578e/bbbbbbaa.bb I
      // 0a9: iload 2
      // 0aa: ifeq 105
      // 0ad: goto 0b1
      // 0b0: athrow
      // 0b1: getstatic qeaa361f143ee4a0894bd168fd9b30c66/qf4ccf8f5435d4a78bdca4d6a018b578e/bbbbbbaa.aab I
      // 0b4: iload 1
      // 0b5: ifne 0fe
      // 0b8: goto 0bc
      // 0bb: athrow
      // 0bc: ldc -876582780
      // 0be: iload 3
      // 0bf: ldc 2070433364
      // 0c1: ixor
      // 0c2: invokestatic qeaa361f143ee4a0894bd168fd9b30c66/qf4ccf8f5435d4a78bdca4d6a018b578e/bbbbbbaa.aaaba (II)I
      // 0c5: ldc2_w 8059398804031287877
      // 0c8: invokestatic qeaa361f143ee4a0894bd168fd9b30c66/qf4ccf8f5435d4a78bdca4d6a018b578e/bbbbbbaa.aa (IJ)I
      // 0cb: if_icmpeq 0eb
      // 0ce: goto 0d2
      // 0d1: athrow
      // 0d2: getstatic qeaa361f143ee4a0894bd168fd9b30c66/qf4ccf8f5435d4a78bdca4d6a018b578e/bbbbbbaa.aab I
      // 0d5: aload 0
      // 0d6: iload 1
      // 0d7: ifne 10d
      // 0da: goto 0de
      // 0dd: athrow
      // 0de: getfield net/minecraft/class_310.field_1724 Lnet/minecraft/class_746;
      // 0e1: getfield net/minecraft/class_746.field_6012 I
      // 0e4: if_icmpge 105
      // 0e7: goto 0eb
      // 0ea: athrow
      // 0eb: ldc -876582781
      // 0ed: iload 3
      // 0ee: ldc -969105409
      // 0f0: ixor
      // 0f1: invokestatic qeaa361f143ee4a0894bd168fd9b30c66/qf4ccf8f5435d4a78bdca4d6a018b578e/bbbbbbaa.aaaba (II)I
      // 0f4: ldc2_w 8059398804031287877
      // 0f7: invokestatic qeaa361f143ee4a0894bd168fd9b30c66/qf4ccf8f5435d4a78bdca4d6a018b578e/bbbbbbaa.aa (IJ)I
      // 0fa: goto 0fe
      // 0fd: athrow
      // 0fe: putstatic qeaa361f143ee4a0894bd168fd9b30c66/qf4ccf8f5435d4a78bdca4d6a018b578e/bbbbbbaa.aab I
      // 101: iload 1
      // 102: ifeq 11b
      // 105: getstatic qeaa361f143ee4a0894bd168fd9b30c66/qf4ccf8f5435d4a78bdca4d6a018b578e/bbbbbbaa.aab I
      // 108: aload 0
      // 109: goto 10d
      // 10c: athrow
      // 10d: getfield net/minecraft/class_310.field_1724 Lnet/minecraft/class_746;
      // 110: getfield net/minecraft/class_746.field_6012 I
      // 113: bipush 4
      // 114: iadd
      // 115: invokestatic java/lang/Math.max (II)I
      // 118: putstatic qeaa361f143ee4a0894bd168fd9b30c66/qf4ccf8f5435d4a78bdca4d6a018b578e/bbbbbbaa.aab I
      // 11b: ldc -876582782
      // 11d: iload 3
      // 11e: ldc -1270078896
      // 120: ixor
      // 121: invokestatic qeaa361f143ee4a0894bd168fd9b30c66/qf4ccf8f5435d4a78bdca4d6a018b578e/bbbbbbaa.aaaba (II)I
      // 124: ldc2_w 8059398804031287877
      // 127: invokestatic qeaa361f143ee4a0894bd168fd9b30c66/qf4ccf8f5435d4a78bdca4d6a018b578e/bbbbbbaa.aa (IJ)I
      // 12a: putstatic qeaa361f143ee4a0894bd168fd9b30c66/qf4ccf8f5435d4a78bdca4d6a018b578e/bbbbbbaa.ab I
      // 12d: bipush 1
      // 12e: ireturn
      // 12f: bipush 0
      // 130: ireturn
   }

   public static void bbb(class_310 param0) {
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
      // 06: ifne 16
      // 09: invokestatic qeaa361f143ee4a0894bd168fd9b30c66/qf4ccf8f5435d4a78bdca4d6a018b578e/bbbbbbaa.bab (Lnet/minecraft/class_310;)Z
      // 0c: ifne 15
      // 0f: goto 13
      // 12: athrow
      // 13: return
      // 14: athrow
      // 15: aload 0
      // 16: getfield net/minecraft/class_310.field_1724 Lnet/minecraft/class_746;
      // 19: astore 2
      // 1a: ldc -876582783
      // 1c: ldc 1863787718
      // 1e: ldc 196745676
      // 20: ixor
      // 21: invokestatic qeaa361f143ee4a0894bd168fd9b30c66/qf4ccf8f5435d4a78bdca4d6a018b578e/bbbbbbaa.aaaba (II)I
      // 24: getstatic qeaa361f143ee4a0894bd168fd9b30c66/qf4ccf8f5435d4a78bdca4d6a018b578e/bbbbbbaa.a I
      // 27: aload 2
      // 28: getfield net/minecraft/class_746.field_6012 I
      // 2b: bipush 1
      // 2c: iadd
      // 2d: invokestatic java/lang/Math.max (II)I
      // 30: putstatic qeaa361f143ee4a0894bd168fd9b30c66/qf4ccf8f5435d4a78bdca4d6a018b578e/bbbbbbaa.a I
      // 33: ldc2_w 8059398804031287877
      // 36: getstatic qeaa361f143ee4a0894bd168fd9b30c66/qf4ccf8f5435d4a78bdca4d6a018b578e/bbbbbbaa.aab I
      // 39: aload 2
      // 3a: getfield net/minecraft/class_746.field_6012 I
      // 3d: bipush 4
      // 3e: iadd
      // 3f: invokestatic java/lang/Math.max (II)I
      // 42: putstatic qeaa361f143ee4a0894bd168fd9b30c66/qf4ccf8f5435d4a78bdca4d6a018b578e/bbbbbbaa.aab I
      // 45: invokestatic qeaa361f143ee4a0894bd168fd9b30c66/qf4ccf8f5435d4a78bdca4d6a018b578e/bbbbbbaa.aa (IJ)I
      // 48: putstatic qeaa361f143ee4a0894bd168fd9b30c66/qf4ccf8f5435d4a78bdca4d6a018b578e/bbbbbbaa.ab I
      // 4b: return
   }

   static {
      int var18 = 1442263370;
      int var9 = "\u0018욂猝᛬뢶獬䂷\uda62ᬛ\udd62̝牌\ueb1f氬謜琌\ufb1c眬䬛왢\uf319灌ጚ捌\ue31b\n\ue707㆖塆懸\uea27觺\uee87䇸\ue187ǻ".length();
      short var13 = 6839;
      String[] var10 = new String[2];
      String var8 = "\u0018욂猝᛬뢶獬䂷\uda62ᬛ\udd62̝牌\ueb1f氬謜琌\ufb1c眬䬛왢\uf319灌ጚ捌\ue31b\n\ue707㆖塆懸\uea27觺\uee87䇸\ue187ǻ";
      int var11 = 0;
      int var12 = 0;

      do {
         char var14 = var8.charAt(var12);
         String var10000 = var8.substring(var12 + 1, var12 + 1 + var14);
         int var16 = 0;
         char[] var15 = var10000.toCharArray();

         do {
            char var17 = var15[var16];
            if (var16 % 2 == 0) {
               var15[var16] = (char)((var17 >>> 5 | var17 << 11) & 65535 ^ var13);
            } else {
               var15[var16] = (char)((var17 << 5 | var17 >>> 11) & 65535 ^ var13);
            }
         } while (++var16 < var15.length);

         var10[var11] = new String(var15);
         var11++;
         var12 = var12 + var14 + 1;
      } while (var12 < var9);

      bbb = var10;
      aaaa = new Object[var10.length];
      byte var19 = 0;
      int var10001 = 0;
      byte[] var10002 = "°çn\b\u0015¥ÐU±ëéÏZø\u008c-ç¬]\u0081\u0095Üà/\u001cªÞ|ìG\u0004WwXÝôà¡ÜO\f9A»Ç\u008e,¯à,Ú\u0016cøû\u0017ôó)Ì\u008eM·+½2®¨ Åp\u008e\u0090\u0095\u009fû¡CÈöÃçH\u0086\u000e+\u0013\u008dëë«\u0089¬+\u0019Ü\u009fs\u0006¶Y\u000fU¾Y\u0091\u0007r\rëL\u0006Ü\u0006ÊÈ¨\u000b\u000fÛ\u001bÏÓ97¼k²* HWÙØJâ3®Îÿ1\u009eà¢\u0007Õ\u0012\u0083"
         .getBytes("ISO-8859-1");
      bba = new int[37];

      int var36;
      do {
         bba[var19] = (
               (var10002[var10001] & 255) << 24 | (var10002[var10001 + 1] & 255) << 16 | (var10002[var10001 + 2] & 255) << 8 | var10002[var10001 + 3] & 255
            )
            ^ 1278751291;
         var19 += 1;
         var36 = var10001 + 4;
         var10001 += 4;
      } while (var36 < var10002.length);

      long var0 = 5116233424560785700L;
      long[] var6 = new long[3];
      int var3 = 0;
      String var4;
      int var5 = (var4 = aaabb('\ud886', var18 ^ 380056947, (short)24499)).length();
      byte var2 = 0;

      do {
         var10001 = var2;
         var2 += 8;
         byte[] var7 = var4.substring(var10001, var2).getBytes(aaabb('\ud887', var18 ^ -512139836, (short)29745));
         var10001 = var3++;
         long var44 = (
               (var7[0] & 255L) << aaaba(-876582784, var18 ^ -1044953674)
                  | (var7[1] & 255L) << aaaba(-876582769, var18 ^ 1521000418)
                  | (var7[2] & 255L) << aaaba(-876582770, var18 ^ -850292240)
                  | (var7[3] & 255L) << aaaba(-876582771, var18 ^ 566820959)
                  | (var7[4] & 255L) << aaaba(-876582772, var18 ^ -360812830)
                  | (var7[5] & 255L) << aaaba(-876582773, var18 ^ -841180188)
                  | (var7[aaaba(-876582774, var18 ^ 1309194578)] & 255L) << aaaba(-876582775, var18 ^ -654087212)
                  | var7[aaaba(-876582776, var18 ^ -1547831955)] & 255L
            )
            ^ var0;
         byte var37 = -1;
         var6[var10001] = var44;
      } while (var2 < var5);

      b = var6;
      aba = new Integer[3];
      ba = aa(aaaba(-876582761, var18 ^ -1866306646), 2824823785340380350L);
      baa = aa(aaaba(-876582762, var18 ^ -1925864795), 8059398804031287877L);
      a = aa(aaaba(-876582763, var18 ^ -1117434413), 8059398804031287877L);
      bb = aa(aaaba(-876582764, var18 ^ -1934419233), 8059398804031287877L);
      aab = aa(aaaba(-876582765, var18 ^ -300442968), 8059398804031287877L);
      ab = aa(aaaba(-876582766, var18 ^ 601604514), 8059398804031287877L);
      aaa = aa(aaaba(-876582767, var18 ^ -971277915), 8059398804031287877L);
      abb = aa(aaaba(-876582768, var18 ^ -2116301839), 8059398804031287877L);
      aa = 0;
   }

   private static boolean aaaa(class_310 param0) {
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
      // 06: ifne 17
      // 09: invokestatic qeaa361f143ee4a0894bd168fd9b30c66/qf4ccf8f5435d4a78bdca4d6a018b578e/bbbbbbaa.bab (Lnet/minecraft/class_310;)Z
      // 0c: ifne 16
      // 0f: goto 13
      // 12: athrow
      // 13: bipush 0
      // 14: ireturn
      // 15: athrow
      // 16: aload 0
      // 17: getfield net/minecraft/class_310.field_1724 Lnet/minecraft/class_746;
      // 1a: astore 2
      // 1b: aload 2
      // 1c: invokevirtual net/minecraft/class_746.method_18798 ()Lnet/minecraft/class_243;
      // 1f: getfield net/minecraft/class_243.field_1352 D
      // 22: dstore 3
      // 23: aload 2
      // 24: invokevirtual net/minecraft/class_746.method_18798 ()Lnet/minecraft/class_243;
      // 27: getfield net/minecraft/class_243.field_1350 D
      // 2a: dstore 5
      // 2c: dload 3
      // 2d: dload 3
      // 2e: dmul
      // 2f: dload 5
      // 31: dload 5
      // 33: dmul
      // 34: dadd
      // 35: invokestatic java/lang/Math.sqrt (D)D
      // 38: dstore 7
      // 3a: dload 7
      // 3c: ldc2_w 0.01
      // 3f: dcmpl
      // 40: iload 1
      // 41: ifne 4c
      // 44: ifle 4d
      // 47: goto 4b
      // 4a: athrow
      // 4b: bipush 0
      // 4c: ireturn
      // 4d: aload 0
      // 4e: iload 1
      // 4f: ifne 60
      // 52: getfield net/minecraft/class_310.field_1690 Lnet/minecraft/class_315;
      // 55: ifnonnull 5f
      // 58: goto 5c
      // 5b: athrow
      // 5c: bipush 1
      // 5d: ireturn
      // 5e: athrow
      // 5f: aload 0
      // 60: getfield net/minecraft/class_310.field_1690 Lnet/minecraft/class_315;
      // 63: getfield net/minecraft/class_315.field_1894 Lnet/minecraft/class_304;
      // 66: iload 1
      // 67: ifne 7f
      // 6a: invokevirtual net/minecraft/class_304.method_1434 ()Z
      // 6d: ifne c3
      // 70: goto 74
      // 73: athrow
      // 74: aload 0
      // 75: getfield net/minecraft/class_310.field_1690 Lnet/minecraft/class_315;
      // 78: getfield net/minecraft/class_315.field_1881 Lnet/minecraft/class_304;
      // 7b: goto 7f
      // 7e: athrow
      // 7f: iload 1
      // 80: ifne a0
      // 83: invokevirtual net/minecraft/class_304.method_1434 ()Z
      // 86: ifne c3
      // 89: goto 8d
      // 8c: athrow
      // 8d: aload 0
      // 8e: getfield net/minecraft/class_310.field_1690 Lnet/minecraft/class_315;
      // 91: iload 1
      // 92: ifne ae
      // 95: goto 99
      // 98: athrow
      // 99: getfield net/minecraft/class_315.field_1913 Lnet/minecraft/class_304;
      // 9c: goto a0
      // 9f: athrow
      // a0: invokevirtual net/minecraft/class_304.method_1434 ()Z
      // a3: ifne c3
      // a6: aload 0
      // a7: getfield net/minecraft/class_310.field_1690 Lnet/minecraft/class_315;
      // aa: goto ae
      // ad: athrow
      // ae: getfield net/minecraft/class_315.field_1849 Lnet/minecraft/class_304;
      // b1: invokevirtual net/minecraft/class_304.method_1434 ()Z
      // b4: iload 1
      // b5: ifne c0
      // b8: ifne c3
      // bb: goto bf
      // be: athrow
      // bf: bipush 1
      // c0: goto c4
      // c3: bipush 0
      // c4: ireturn
   }

   public static boolean aaab(class_310 param0, int param1) {
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
      // 06: ifne 17
      // 09: invokestatic qeaa361f143ee4a0894bd168fd9b30c66/qf4ccf8f5435d4a78bdca4d6a018b578e/bbbbbbaa.bab (Lnet/minecraft/class_310;)Z
      // 0c: ifne 16
      // 0f: goto 13
      // 12: athrow
      // 13: bipush 0
      // 14: ireturn
      // 15: athrow
      // 16: aload 0
      // 17: iload 2
      // 18: ifne 29
      // 1b: invokestatic qeaa361f143ee4a0894bd168fd9b30c66/qf4ccf8f5435d4a78bdca4d6a018b578e/bbbbbbaa.aaaab (Lnet/minecraft/class_310;)Z
      // 1e: ifne 28
      // 21: goto 25
      // 24: athrow
      // 25: bipush 0
      // 26: ireturn
      // 27: athrow
      // 28: aload 0
      // 29: getfield net/minecraft/class_310.field_1724 Lnet/minecraft/class_746;
      // 2c: getfield net/minecraft/class_746.field_6012 I
      // 2f: istore 3
      // 30: iload 2
      // 31: ifne 4b
      // 34: getstatic qeaa361f143ee4a0894bd168fd9b30c66/qf4ccf8f5435d4a78bdca4d6a018b578e/bbbbbbaa.baa I
      // 37: iload 3
      // 38: if_icmpne 42
      // 3b: goto 3f
      // 3e: athrow
      // 3f: bipush 0
      // 40: ireturn
      // 41: athrow
      // 42: iload 3
      // 43: putstatic qeaa361f143ee4a0894bd168fd9b30c66/qf4ccf8f5435d4a78bdca4d6a018b578e/bbbbbbaa.baa I
      // 46: aload 0
      // 47: iload 1
      // 48: invokestatic qeaa361f143ee4a0894bd168fd9b30c66/qf4ccf8f5435d4a78bdca4d6a018b578e/bbbbbbaa.aaa (Lnet/minecraft/class_310;I)V
      // 4b: bipush 1
      // 4c: ireturn
   }

   public static boolean aaba(class_310 var0) {
      return aaaa(var0);
   }

   public static boolean aabb(class_310 param0) {
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
      // 05: invokestatic qeaa361f143ee4a0894bd168fd9b30c66/qf4ccf8f5435d4a78bdca4d6a018b578e/bbbbbbaa.bab (Lnet/minecraft/class_310;)Z
      // 08: iload 1
      // 09: ifne 16
      // 0c: ifeq 55
      // 0f: goto 13
      // 12: athrow
      // 13: getstatic qeaa361f143ee4a0894bd168fd9b30c66/qf4ccf8f5435d4a78bdca4d6a018b578e/bbbbbbaa.aaa I
      // 16: iload 1
      // 17: ifne 3f
      // 1a: ldc_w -876582753
      // 1d: ldc_w 302236310
      // 20: ldc_w -176740536
      // 23: ixor
      // 24: invokestatic qeaa361f143ee4a0894bd168fd9b30c66/qf4ccf8f5435d4a78bdca4d6a018b578e/bbbbbbaa.aaaba (II)I
      // 27: ldc2_w 8059398804031287877
      // 2a: invokestatic qeaa361f143ee4a0894bd168fd9b30c66/qf4ccf8f5435d4a78bdca4d6a018b578e/bbbbbbaa.aa (IJ)I
      // 2d: if_icmpeq 55
      // 30: goto 34
      // 33: athrow
      // 34: aload 0
      // 35: getfield net/minecraft/class_310.field_1724 Lnet/minecraft/class_746;
      // 38: getfield net/minecraft/class_746.field_6012 I
      // 3b: goto 3f
      // 3e: athrow
      // 3f: iload 1
      // 40: ifne 52
      // 43: getstatic qeaa361f143ee4a0894bd168fd9b30c66/qf4ccf8f5435d4a78bdca4d6a018b578e/bbbbbbaa.aaa I
      // 46: if_icmpgt 55
      // 49: goto 4d
      // 4c: athrow
      // 4d: bipush 1
      // 4e: goto 52
      // 51: athrow
      // 52: goto 56
      // 55: bipush 0
      // 56: ireturn
   }

   public static boolean abaa(class_310 param0) {
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
      // 06: ifne 17
      // 09: invokestatic qeaa361f143ee4a0894bd168fd9b30c66/qf4ccf8f5435d4a78bdca4d6a018b578e/bbbbbbaa.bab (Lnet/minecraft/class_310;)Z
      // 0c: ifne 16
      // 0f: goto 13
      // 12: athrow
      // 13: bipush 0
      // 14: ireturn
      // 15: athrow
      // 16: aload 0
      // 17: iload 1
      // 18: ifne 29
      // 1b: invokestatic qeaa361f143ee4a0894bd168fd9b30c66/qf4ccf8f5435d4a78bdca4d6a018b578e/bbbbbbaa.aaaab (Lnet/minecraft/class_310;)Z
      // 1e: ifne 28
      // 21: goto 25
      // 24: athrow
      // 25: bipush 0
      // 26: ireturn
      // 27: athrow
      // 28: aload 0
      // 29: getfield net/minecraft/class_310.field_1724 Lnet/minecraft/class_746;
      // 2c: getfield net/minecraft/class_746.field_6012 I
      // 2f: istore 2
      // 30: getstatic qeaa361f143ee4a0894bd168fd9b30c66/qf4ccf8f5435d4a78bdca4d6a018b578e/bbbbbbaa.baa I
      // 33: iload 1
      // 34: ifne 53
      // 37: iload 2
      // 38: if_icmpeq 52
      // 3b: goto 3f
      // 3e: athrow
      // 3f: aload 0
      // 40: invokestatic qeaa361f143ee4a0894bd168fd9b30c66/qf4ccf8f5435d4a78bdca4d6a018b578e/bbbbbbaa.aabb (Lnet/minecraft/class_310;)Z
      // 43: iload 1
      // 44: ifne 59
      // 47: goto 4b
      // 4a: athrow
      // 4b: ifeq 54
      // 4e: goto 52
      // 51: athrow
      // 52: bipush 0
      // 53: ireturn
      // 54: iload 2
      // 55: putstatic qeaa361f143ee4a0894bd168fd9b30c66/qf4ccf8f5435d4a78bdca4d6a018b578e/bbbbbbaa.baa I
      // 58: bipush 1
      // 59: ireturn
   }

   public static boolean abab(class_310 param0) {
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
      // 05: invokestatic qeaa361f143ee4a0894bd168fd9b30c66/qf4ccf8f5435d4a78bdca4d6a018b578e/bbbbbbaa.bab (Lnet/minecraft/class_310;)Z
      // 08: iload 1
      // 09: ifne 16
      // 0c: ifeq 55
      // 0f: goto 13
      // 12: athrow
      // 13: getstatic qeaa361f143ee4a0894bd168fd9b30c66/qf4ccf8f5435d4a78bdca4d6a018b578e/bbbbbbaa.aab I
      // 16: iload 1
      // 17: ifne 3f
      // 1a: ldc_w -876582754
      // 1d: ldc_w -1521645689
      // 20: ldc_w -2075840176
      // 23: ixor
      // 24: invokestatic qeaa361f143ee4a0894bd168fd9b30c66/qf4ccf8f5435d4a78bdca4d6a018b578e/bbbbbbaa.aaaba (II)I
      // 27: ldc2_w 8059398804031287877
      // 2a: invokestatic qeaa361f143ee4a0894bd168fd9b30c66/qf4ccf8f5435d4a78bdca4d6a018b578e/bbbbbbaa.aa (IJ)I
      // 2d: if_icmpeq 55
      // 30: goto 34
      // 33: athrow
      // 34: aload 0
      // 35: getfield net/minecraft/class_310.field_1724 Lnet/minecraft/class_746;
      // 38: getfield net/minecraft/class_746.field_6012 I
      // 3b: goto 3f
      // 3e: athrow
      // 3f: iload 1
      // 40: ifne 52
      // 43: getstatic qeaa361f143ee4a0894bd168fd9b30c66/qf4ccf8f5435d4a78bdca4d6a018b578e/bbbbbbaa.aab I
      // 46: if_icmpgt 55
      // 49: goto 4d
      // 4c: athrow
      // 4d: bipush 1
      // 4e: goto 52
      // 51: athrow
      // 52: goto 56
      // 55: bipush 0
      // 56: ireturn
   }

   public static boolean abba(class_310 param0, int param1) {
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
      // 06: ifne 17
      // 09: invokestatic qeaa361f143ee4a0894bd168fd9b30c66/qf4ccf8f5435d4a78bdca4d6a018b578e/bbbbbbaa.bab (Lnet/minecraft/class_310;)Z
      // 0c: ifne 16
      // 0f: goto 13
      // 12: athrow
      // 13: bipush 0
      // 14: ireturn
      // 15: athrow
      // 16: aload 0
      // 17: getfield net/minecraft/class_310.field_1724 Lnet/minecraft/class_746;
      // 1a: getfield net/minecraft/class_746.field_6012 I
      // 1d: istore 3
      // 1e: iload 2
      // 1f: ifne 39
      // 22: getstatic qeaa361f143ee4a0894bd168fd9b30c66/qf4ccf8f5435d4a78bdca4d6a018b578e/bbbbbbaa.baa I
      // 25: iload 3
      // 26: if_icmpne 30
      // 29: goto 2d
      // 2c: athrow
      // 2d: bipush 0
      // 2e: ireturn
      // 2f: athrow
      // 30: iload 3
      // 31: putstatic qeaa361f143ee4a0894bd168fd9b30c66/qf4ccf8f5435d4a78bdca4d6a018b578e/bbbbbbaa.baa I
      // 34: aload 0
      // 35: iload 1
      // 36: invokestatic qeaa361f143ee4a0894bd168fd9b30c66/qf4ccf8f5435d4a78bdca4d6a018b578e/bbbbbbaa.aaa (Lnet/minecraft/class_310;I)V
      // 39: bipush 1
      // 3a: ireturn
   }

   public static boolean abbb(class_310 param0, int param1) {
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
      // 06: ifne 17
      // 09: invokestatic qeaa361f143ee4a0894bd168fd9b30c66/qf4ccf8f5435d4a78bdca4d6a018b578e/bbbbbbaa.bab (Lnet/minecraft/class_310;)Z
      // 0c: ifne 16
      // 0f: goto 13
      // 12: athrow
      // 13: bipush 0
      // 14: ireturn
      // 15: athrow
      // 16: aload 0
      // 17: iload 2
      // 18: ifne 29
      // 1b: invokestatic qeaa361f143ee4a0894bd168fd9b30c66/qf4ccf8f5435d4a78bdca4d6a018b578e/bbbbbbaa.aaaab (Lnet/minecraft/class_310;)Z
      // 1e: ifne 28
      // 21: goto 25
      // 24: athrow
      // 25: bipush 0
      // 26: ireturn
      // 27: athrow
      // 28: aload 0
      // 29: getfield net/minecraft/class_310.field_1724 Lnet/minecraft/class_746;
      // 2c: getfield net/minecraft/class_746.field_6012 I
      // 2f: istore 3
      // 30: iload 2
      // 31: ifne 4b
      // 34: getstatic qeaa361f143ee4a0894bd168fd9b30c66/qf4ccf8f5435d4a78bdca4d6a018b578e/bbbbbbaa.baa I
      // 37: iload 3
      // 38: if_icmpne 42
      // 3b: goto 3f
      // 3e: athrow
      // 3f: bipush 0
      // 40: ireturn
      // 41: athrow
      // 42: iload 3
      // 43: putstatic qeaa361f143ee4a0894bd168fd9b30c66/qf4ccf8f5435d4a78bdca4d6a018b578e/bbbbbbaa.baa I
      // 46: aload 0
      // 47: iload 1
      // 48: invokestatic qeaa361f143ee4a0894bd168fd9b30c66/qf4ccf8f5435d4a78bdca4d6a018b578e/bbbbbbaa.aaa (Lnet/minecraft/class_310;I)V
      // 4b: bipush 1
      // 4c: ireturn
   }

   public static void baaa(class_310 var0) {
   }

   public static void baab(class_310 var0) {
      int var1 = baaabbaa.bba;

      int var10000;
      label22: {
         try {
            var10000 = bab(var0);
            if (var1 != 0) {
               break label22;
            }

            if (var10000 == 0) {
               return;
            }
         } catch (MatchException var2) {
            throw var2;
         }

         var10000 = Math.max(abb, var0.field_1724.field_6012);
      }

      abb = var10000;
   }

   private static void baba() {
      int var0 = -1652736416;
      baa = aa(aaaba(-876582755, var0 ^ -1125446895), 1448105905540825982L);
      a = aa(aaaba(-876582756, var0 ^ -393113331), 8059398804031287877L);
      bb = aa(aaaba(-876582757, var0 ^ 964433860), 8059398804031287877L);
      aab = aa(aaaba(-876582758, var0 ^ 1299305174), 8059398804031287877L);
      ab = aa(aaaba(-876582759, var0 ^ -21688777), 8059398804031287877L);
      aaa = aa(aaaba(-876582760, var0 ^ -758729027), 8059398804031287877L);
      abb = aa(aaaba(-876582745, var0 ^ -807758489), 8059398804031287877L);
   }

   public static boolean a(class_310 param0) {
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
      // 06: ifne 17
      // 09: invokestatic qeaa361f143ee4a0894bd168fd9b30c66/qf4ccf8f5435d4a78bdca4d6a018b578e/bbbbbbaa.bab (Lnet/minecraft/class_310;)Z
      // 0c: ifne 16
      // 0f: goto 13
      // 12: athrow
      // 13: bipush 0
      // 14: ireturn
      // 15: athrow
      // 16: aload 0
      // 17: invokestatic qeaa361f143ee4a0894bd168fd9b30c66/qf4ccf8f5435d4a78bdca4d6a018b578e/bbbbbbaa.aabb (Lnet/minecraft/class_310;)Z
      // 1a: iload 1
      // 1b: ifne 26
      // 1e: ifne 29
      // 21: goto 25
      // 24: athrow
      // 25: bipush 1
      // 26: goto 2a
      // 29: bipush 0
      // 2a: ireturn
   }

   public static boolean babb(class_310 param0) {
      // $VF: Couldn't be decompiled
      // Please report this to the Vineflower issue tracker, at https://github.com/Vineflower/vineflower/issues with a copy of the class file (if you have the rights to distribute it!)
      // java.lang.RuntimeException: parsing failure!
      //   at org.jetbrains.java.decompiler.modules.decompiler.decompose.DomHelper.parseGraph(DomHelper.java:211)
      //   at org.jetbrains.java.decompiler.main.rels.MethodProcessor.codeToJava(MethodProcessor.java:166)
      //
      // Bytecode:
      // 000: getstatic qeaa361f143ee4a0894bd168fd9b30c66/qf4ccf8f5435d4a78bdca4d6a018b578e/baaabbaa.bba I
      // 003: istore 1
      // 004: invokestatic qeaa361f143ee4a0894bd168fd9b30c66/qf4ccf8f5435d4a78bdca4d6a018b578e/abaaaaaba.aaaaa ()Lqeaa361f143ee4a0894bd168fd9b30c66/qf4ccf8f5435d4a78bdca4d6a018b578e/abaaaaaba;
      // 007: astore 2
      // 008: aload 2
      // 009: iload 1
      // 00a: ifne 015
      // 00d: ifnull 056
      // 010: goto 014
      // 013: athrow
      // 014: aload 2
      // 015: iload 1
      // 016: ifne 028
      // 019: invokevirtual qeaa361f143ee4a0894bd168fd9b30c66/qf4ccf8f5435d4a78bdca4d6a018b578e/abaaaaaba.aaba ()Lqeaa361f143ee4a0894bd168fd9b30c66/qf4ccf8f5435d4a78bdca4d6a018b578e/babbaba;
      // 01c: ifnull 056
      // 01f: goto 023
      // 022: athrow
      // 023: aload 2
      // 024: goto 028
      // 027: athrow
      // 028: iload 1
      // 029: ifne 03e
      // 02c: invokevirtual qeaa361f143ee4a0894bd168fd9b30c66/qf4ccf8f5435d4a78bdca4d6a018b578e/abaaaaaba.aaba ()Lqeaa361f143ee4a0894bd168fd9b30c66/qf4ccf8f5435d4a78bdca4d6a018b578e/babbaba;
      // 02f: invokevirtual qeaa361f143ee4a0894bd168fd9b30c66/qf4ccf8f5435d4a78bdca4d6a018b578e/babbaba.abaaabb ()Lqeaa361f143ee4a0894bd168fd9b30c66/qf4ccf8f5435d4a78bdca4d6a018b578e/baabbbaa;
      // 032: ifnull 056
      // 035: goto 039
      // 038: athrow
      // 039: aload 2
      // 03a: goto 03e
      // 03d: athrow
      // 03e: invokevirtual qeaa361f143ee4a0894bd168fd9b30c66/qf4ccf8f5435d4a78bdca4d6a018b578e/abaaaaaba.aaba ()Lqeaa361f143ee4a0894bd168fd9b30c66/qf4ccf8f5435d4a78bdca4d6a018b578e/babbaba;
      // 041: invokevirtual qeaa361f143ee4a0894bd168fd9b30c66/qf4ccf8f5435d4a78bdca4d6a018b578e/babbaba.abaaabb ()Lqeaa361f143ee4a0894bd168fd9b30c66/qf4ccf8f5435d4a78bdca4d6a018b578e/baabbbaa;
      // 044: invokevirtual qeaa361f143ee4a0894bd168fd9b30c66/qf4ccf8f5435d4a78bdca4d6a018b578e/baabbbaa.aaab ()Z
      // 047: iload 1
      // 048: ifne 053
      // 04b: ifeq 056
      // 04e: goto 052
      // 051: athrow
      // 052: bipush 1
      // 053: goto 057
      // 056: bipush 0
      // 057: istore 3
      // 058: aload 2
      // 059: iload 1
      // 05a: ifne 065
      // 05d: ifnull 0a6
      // 060: goto 064
      // 063: athrow
      // 064: aload 2
      // 065: iload 1
      // 066: ifne 078
      // 069: invokevirtual qeaa361f143ee4a0894bd168fd9b30c66/qf4ccf8f5435d4a78bdca4d6a018b578e/abaaaaaba.aaba ()Lqeaa361f143ee4a0894bd168fd9b30c66/qf4ccf8f5435d4a78bdca4d6a018b578e/babbaba;
      // 06c: ifnull 0a6
      // 06f: goto 073
      // 072: athrow
      // 073: aload 2
      // 074: goto 078
      // 077: athrow
      // 078: iload 1
      // 079: ifne 08e
      // 07c: invokevirtual qeaa361f143ee4a0894bd168fd9b30c66/qf4ccf8f5435d4a78bdca4d6a018b578e/abaaaaaba.aaba ()Lqeaa361f143ee4a0894bd168fd9b30c66/qf4ccf8f5435d4a78bdca4d6a018b578e/babbaba;
      // 07f: invokevirtual qeaa361f143ee4a0894bd168fd9b30c66/qf4ccf8f5435d4a78bdca4d6a018b578e/babbaba.abbbba ()Lqeaa361f143ee4a0894bd168fd9b30c66/qf4ccf8f5435d4a78bdca4d6a018b578e/abaabbaaa;
      // 082: ifnull 0a6
      // 085: goto 089
      // 088: athrow
      // 089: aload 2
      // 08a: goto 08e
      // 08d: athrow
      // 08e: invokevirtual qeaa361f143ee4a0894bd168fd9b30c66/qf4ccf8f5435d4a78bdca4d6a018b578e/abaaaaaba.aaba ()Lqeaa361f143ee4a0894bd168fd9b30c66/qf4ccf8f5435d4a78bdca4d6a018b578e/babbaba;
      // 091: invokevirtual qeaa361f143ee4a0894bd168fd9b30c66/qf4ccf8f5435d4a78bdca4d6a018b578e/babbaba.abbbba ()Lqeaa361f143ee4a0894bd168fd9b30c66/qf4ccf8f5435d4a78bdca4d6a018b578e/abaabbaaa;
      // 094: invokevirtual qeaa361f143ee4a0894bd168fd9b30c66/qf4ccf8f5435d4a78bdca4d6a018b578e/abaabbaaa.abaaa ()Z
      // 097: iload 1
      // 098: ifne 0a3
      // 09b: ifeq 0a6
      // 09e: goto 0a2
      // 0a1: athrow
      // 0a2: bipush 1
      // 0a3: goto 0a7
      // 0a6: bipush 0
      // 0a7: istore 4
      // 0a9: aload 0
      // 0aa: invokestatic qeaa361f143ee4a0894bd168fd9b30c66/qf4ccf8f5435d4a78bdca4d6a018b578e/bbbbbbaa.bab (Lnet/minecraft/class_310;)Z
      // 0ad: iload 1
      // 0ae: ifne 0bb
      // 0b1: ifeq 117
      // 0b4: goto 0b8
      // 0b7: athrow
      // 0b8: getstatic qeaa361f143ee4a0894bd168fd9b30c66/qf4ccf8f5435d4a78bdca4d6a018b578e/bbbbbbaa.abb I
      // 0bb: iload 1
      // 0bc: ifne 0f7
      // 0bf: ldc_w -876582746
      // 0c2: ldc_w -337532190
      // 0c5: ldc_w 1245578065
      // 0c8: ixor
      // 0c9: invokestatic qeaa361f143ee4a0894bd168fd9b30c66/qf4ccf8f5435d4a78bdca4d6a018b578e/bbbbbbaa.aaaba (II)I
      // 0cc: ldc2_w 8059398804031287877
      // 0cf: invokestatic qeaa361f143ee4a0894bd168fd9b30c66/qf4ccf8f5435d4a78bdca4d6a018b578e/bbbbbbaa.aa (IJ)I
      // 0d2: if_icmpeq 0f2
      // 0d5: goto 0d9
      // 0d8: athrow
      // 0d9: aload 0
      // 0da: getfield net/minecraft/class_310.field_1724 Lnet/minecraft/class_746;
      // 0dd: getfield net/minecraft/class_746.field_6012 I
      // 0e0: iload 1
      // 0e1: ifne 114
      // 0e4: goto 0e8
      // 0e7: athrow
      // 0e8: getstatic qeaa361f143ee4a0894bd168fd9b30c66/qf4ccf8f5435d4a78bdca4d6a018b578e/bbbbbbaa.abb I
      // 0eb: if_icmple 113
      // 0ee: goto 0f2
      // 0f1: athrow
      // 0f2: iload 3
      // 0f3: goto 0f7
      // 0f6: athrow
      // 0f7: iload 1
      // 0f8: ifne 114
      // 0fb: ifne 113
      // 0fe: goto 102
      // 101: athrow
      // 102: iload 4
      // 104: iload 1
      // 105: ifne 114
      // 108: goto 10c
      // 10b: athrow
      // 10c: ifeq 117
      // 10f: goto 113
      // 112: athrow
      // 113: bipush 1
      // 114: goto 118
      // 117: bipush 0
      // 118: ireturn
   }

   public static void bbaa(class_310 var0) {
   }

   public static void bbab(class_310 param0) {
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
      // 06: ifne 16
      // 09: invokestatic qeaa361f143ee4a0894bd168fd9b30c66/qf4ccf8f5435d4a78bdca4d6a018b578e/bbbbbbaa.bab (Lnet/minecraft/class_310;)Z
      // 0c: ifne 15
      // 0f: goto 13
      // 12: athrow
      // 13: return
      // 14: athrow
      // 15: aload 0
      // 16: getfield net/minecraft/class_310.field_1724 Lnet/minecraft/class_746;
      // 19: getfield net/minecraft/class_746.field_6012 I
      // 1c: bipush 1
      // 1d: iadd
      // 1e: istore 2
      // 1f: getstatic qeaa361f143ee4a0894bd168fd9b30c66/qf4ccf8f5435d4a78bdca4d6a018b578e/bbbbbbaa.a I
      // 22: iload 2
      // 23: invokestatic java/lang/Math.max (II)I
      // 26: putstatic qeaa361f143ee4a0894bd168fd9b30c66/qf4ccf8f5435d4a78bdca4d6a018b578e/bbbbbbaa.a I
      // 29: getstatic qeaa361f143ee4a0894bd168fd9b30c66/qf4ccf8f5435d4a78bdca4d6a018b578e/bbbbbbaa.aab I
      // 2c: iload 1
      // 2d: ifne 68
      // 30: ldc_w -876582747
      // 33: ldc_w 291562056
      // 36: ldc_w 1523175397
      // 39: ixor
      // 3a: invokestatic qeaa361f143ee4a0894bd168fd9b30c66/qf4ccf8f5435d4a78bdca4d6a018b578e/bbbbbbaa.aaaba (II)I
      // 3d: ldc2_w 8059398804031287877
      // 40: invokestatic qeaa361f143ee4a0894bd168fd9b30c66/qf4ccf8f5435d4a78bdca4d6a018b578e/bbbbbbaa.aa (IJ)I
      // 43: if_icmpeq 5d
      // 46: goto 4a
      // 49: athrow
      // 4a: getstatic qeaa361f143ee4a0894bd168fd9b30c66/qf4ccf8f5435d4a78bdca4d6a018b578e/bbbbbbaa.aab I
      // 4d: iload 1
      // 4e: ifne 68
      // 51: goto 55
      // 54: athrow
      // 55: iload 2
      // 56: if_icmpge 6b
      // 59: goto 5d
      // 5c: athrow
      // 5d: getstatic qeaa361f143ee4a0894bd168fd9b30c66/qf4ccf8f5435d4a78bdca4d6a018b578e/bbbbbbaa.ab I
      // 60: iload 2
      // 61: invokestatic java/lang/Math.max (II)I
      // 64: goto 68
      // 67: athrow
      // 68: putstatic qeaa361f143ee4a0894bd168fd9b30c66/qf4ccf8f5435d4a78bdca4d6a018b578e/bbbbbbaa.ab I
      // 6b: return
   }

   public static boolean bbba(class_310 param0) {
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
      // 06: ifne 17
      // 09: invokestatic qeaa361f143ee4a0894bd168fd9b30c66/qf4ccf8f5435d4a78bdca4d6a018b578e/bbbbbbaa.bab (Lnet/minecraft/class_310;)Z
      // 0c: ifne 16
      // 0f: goto 13
      // 12: athrow
      // 13: bipush 0
      // 14: ireturn
      // 15: athrow
      // 16: aload 0
      // 17: getfield net/minecraft/class_310.field_1724 Lnet/minecraft/class_746;
      // 1a: getfield net/minecraft/class_746.field_6012 I
      // 1d: istore 2
      // 1e: getstatic qeaa361f143ee4a0894bd168fd9b30c66/qf4ccf8f5435d4a78bdca4d6a018b578e/bbbbbbaa.baa I
      // 21: iload 1
      // 22: ifne 32
      // 25: iload 2
      // 26: if_icmpeq 35
      // 29: goto 2d
      // 2c: athrow
      // 2d: bipush 1
      // 2e: goto 32
      // 31: athrow
      // 32: goto 36
      // 35: bipush 0
      // 36: ireturn
   }

   private bbbbbbaa() {
   }

   public static boolean b(class_310 param0) {
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
      // 05: invokestatic qeaa361f143ee4a0894bd168fd9b30c66/qf4ccf8f5435d4a78bdca4d6a018b578e/bbbbbbaa.bab (Lnet/minecraft/class_310;)Z
      // 08: iload 1
      // 09: ifne 3d
      // 0c: ifeq 38
      // 0f: goto 13
      // 12: athrow
      // 13: getstatic qeaa361f143ee4a0894bd168fd9b30c66/qf4ccf8f5435d4a78bdca4d6a018b578e/bbbbbbaa.aab I
      // 16: iload 1
      // 17: ifne 45
      // 1a: goto 1e
      // 1d: athrow
      // 1e: ldc_w -876582748
      // 21: ldc_w 1028825411
      // 24: ldc_w 1959502514
      // 27: ixor
      // 28: invokestatic qeaa361f143ee4a0894bd168fd9b30c66/qf4ccf8f5435d4a78bdca4d6a018b578e/bbbbbbaa.aaaba (II)I
      // 2b: ldc2_w 8059398804031287877
      // 2e: invokestatic qeaa361f143ee4a0894bd168fd9b30c66/qf4ccf8f5435d4a78bdca4d6a018b578e/bbbbbbaa.aa (IJ)I
      // 31: if_icmpne 3e
      // 34: goto 38
      // 37: athrow
      // 38: bipush 0
      // 39: goto 3d
      // 3c: athrow
      // 3d: ireturn
      // 3e: aload 0
      // 3f: getfield net/minecraft/class_310.field_1724 Lnet/minecraft/class_746;
      // 42: getfield net/minecraft/class_746.field_6012 I
      // 45: iload 1
      // 46: ifne 6d
      // 49: getstatic qeaa361f143ee4a0894bd168fd9b30c66/qf4ccf8f5435d4a78bdca4d6a018b578e/bbbbbbaa.aab I
      // 4c: if_icmpgt 56
      // 4f: goto 53
      // 52: athrow
      // 53: bipush 0
      // 54: ireturn
      // 55: athrow
      // 56: ldc_w -876582749
      // 59: ldc_w 1028825411
      // 5c: ldc_w 1115705492
      // 5f: ixor
      // 60: invokestatic qeaa361f143ee4a0894bd168fd9b30c66/qf4ccf8f5435d4a78bdca4d6a018b578e/bbbbbbaa.aaaba (II)I
      // 63: ldc2_w 8059398804031287877
      // 66: invokestatic qeaa361f143ee4a0894bd168fd9b30c66/qf4ccf8f5435d4a78bdca4d6a018b578e/bbbbbbaa.aa (IJ)I
      // 69: putstatic qeaa361f143ee4a0894bd168fd9b30c66/qf4ccf8f5435d4a78bdca4d6a018b578e/bbbbbbaa.aab I
      // 6c: bipush 1
      // 6d: ireturn
   }

   public static boolean bbbb(class_310 param0) {
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
      // 05: invokestatic qeaa361f143ee4a0894bd168fd9b30c66/qf4ccf8f5435d4a78bdca4d6a018b578e/bbbbbbaa.bab (Lnet/minecraft/class_310;)Z
      // 08: iload 1
      // 09: ifne 19
      // 0c: ifne 16
      // 0f: goto 13
      // 12: athrow
      // 13: bipush 0
      // 14: ireturn
      // 15: athrow
      // 16: getstatic qeaa361f143ee4a0894bd168fd9b30c66/qf4ccf8f5435d4a78bdca4d6a018b578e/bbbbbbaa.bb I
      // 19: iload 1
      // 1a: ifne 33
      // 1d: aload 0
      // 1e: getfield net/minecraft/class_310.field_1724 Lnet/minecraft/class_746;
      // 21: getfield net/minecraft/class_746.field_6012 I
      // 24: if_icmpne 2e
      // 27: goto 2b
      // 2a: athrow
      // 2b: bipush 1
      // 2c: ireturn
      // 2d: athrow
      // 2e: aload 0
      // 2f: invokestatic qeaa361f143ee4a0894bd168fd9b30c66/qf4ccf8f5435d4a78bdca4d6a018b578e/bbbbbbaa.bbb (Lnet/minecraft/class_310;)V
      // 32: bipush 0
      // 33: ireturn
   }

   public static boolean aaaaa(class_310 param0) {
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
      // 05: invokestatic qeaa361f143ee4a0894bd168fd9b30c66/qf4ccf8f5435d4a78bdca4d6a018b578e/bbbbbbaa.bab (Lnet/minecraft/class_310;)Z
      // 08: iload 1
      // 09: ifne 19
      // 0c: ifne 16
      // 0f: goto 13
      // 12: athrow
      // 13: bipush 0
      // 14: ireturn
      // 15: athrow
      // 16: getstatic qeaa361f143ee4a0894bd168fd9b30c66/qf4ccf8f5435d4a78bdca4d6a018b578e/bbbbbbaa.bb I
      // 19: iload 1
      // 1a: ifne 33
      // 1d: aload 0
      // 1e: getfield net/minecraft/class_310.field_1724 Lnet/minecraft/class_746;
      // 21: getfield net/minecraft/class_746.field_6012 I
      // 24: if_icmpne 2e
      // 27: goto 2b
      // 2a: athrow
      // 2b: bipush 1
      // 2c: ireturn
      // 2d: athrow
      // 2e: aload 0
      // 2f: invokestatic qeaa361f143ee4a0894bd168fd9b30c66/qf4ccf8f5435d4a78bdca4d6a018b578e/bbbbbbaa.bbb (Lnet/minecraft/class_310;)V
      // 32: bipush 0
      // 33: ireturn
   }

   private static boolean aaaab(class_310 param0) {
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
      // 06: ifne 17
      // 09: invokestatic qeaa361f143ee4a0894bd168fd9b30c66/qf4ccf8f5435d4a78bdca4d6a018b578e/bbbbbbaa.bab (Lnet/minecraft/class_310;)Z
      // 0c: ifne 16
      // 0f: goto 13
      // 12: athrow
      // 13: bipush 0
      // 14: ireturn
      // 15: athrow
      // 16: aload 0
      // 17: invokestatic qeaa361f143ee4a0894bd168fd9b30c66/qf4ccf8f5435d4a78bdca4d6a018b578e/bbbbbbaa.bb (Lnet/minecraft/class_310;)Z
      // 1a: iload 1
      // 1b: ifne 2b
      // 1e: ifne 28
      // 21: goto 25
      // 24: athrow
      // 25: bipush 1
      // 26: ireturn
      // 27: athrow
      // 28: getstatic qeaa361f143ee4a0894bd168fd9b30c66/qf4ccf8f5435d4a78bdca4d6a018b578e/bbbbbbaa.bb I
      // 2b: iload 1
      // 2c: ifne 45
      // 2f: aload 0
      // 30: getfield net/minecraft/class_310.field_1724 Lnet/minecraft/class_746;
      // 33: getfield net/minecraft/class_746.field_6012 I
      // 36: if_icmpne 40
      // 39: goto 3d
      // 3c: athrow
      // 3d: bipush 1
      // 3e: ireturn
      // 3f: athrow
      // 40: aload 0
      // 41: invokestatic qeaa361f143ee4a0894bd168fd9b30c66/qf4ccf8f5435d4a78bdca4d6a018b578e/bbbbbbaa.bbb (Lnet/minecraft/class_310;)V
      // 44: bipush 0
      // 45: ireturn
   }
}
