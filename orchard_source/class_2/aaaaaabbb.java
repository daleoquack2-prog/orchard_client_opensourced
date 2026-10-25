package nsc;

import com.google.gson.JsonObject;
import java.util.concurrent.ThreadLocalRandom;
import net.fabricmc.api.EnvType;
import net.fabricmc.api.Environment;
import net.minecraft.class_1268;
import net.minecraft.class_1269;
import net.minecraft.class_1657;
import net.minecraft.class_1792;
import net.minecraft.class_1799;
import net.minecraft.class_1802;
import net.minecraft.class_2338;
import net.minecraft.class_243;
import net.minecraft.class_2680;
import net.minecraft.class_310;
import net.minecraft.class_3965;

@Environment(EnvType.CLIENT)
public final class aaaaaabbb extends abbaabbaa {
   private static final long ba;
   private final aaabbbab aaa;
   private boolean aab;
   private static final String[] aba;
   private static final int[] aabab;
   private static final long[] abb;
   private class_2338 baa;
   private final abbaaaaa bab;
   private static final String[] bba;
   private boolean bb;
   private static final Integer[] bbb;
   private static final long[] aaaa;
   private long aaab;
   private int aaba;
   private static final double aabb = 4.5;
   private static String[] abaa;
   private static final String abab;
   private static final double abba = 20.25;
   private static final Long[] abbb;
   private static final Object[] aabbb;
   private static final int baaa = 1;
   private boolean baab;
   private static final int aa;
   private int baba;
   private class_3965 babb;
   private int bbaa;
   private long bbab;
   private static final int bbba;
   private bbbbaaaa bbbb;
   private int aaaaa;
   private final aaabbbab aaaab;
   private int aaaba;
   private static final String[] aabba;
   private int aaabb;
   private static final double ab = 0.125;
   private int aabaa;

   private boolean aa(class_310 var1, class_2338 var2) {
      return this.bbab(var1, var2);
   }

   private int ab(aaabbbab var1) {
      return Math.max(0, (int)Math.ceil(this.bb(var1) / 50.0));
   }

   public void ba(class_310 param1, class_1268 param2, class_3965 param3) {
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
      // 08: ifne 3f
      // 0b: aload 1
      // 0c: aload 2
      // 0d: aload 3
      // 0e: invokevirtual qeaa361f143ee4a0894bd168fd9b30c66/qf4ccf8f5435d4a78bdca4d6a018b578e/aaaaaabbb.aabba (Lnet/minecraft/class_310;Lnet/minecraft/class_1268;Lnet/minecraft/class_3965;)Z
      // 11: ifne 1a
      // 14: goto 18
      // 17: athrow
      // 18: return
      // 19: athrow
      // 1a: aload 0
      // 1b: aload 1
      // 1c: invokevirtual qeaa361f143ee4a0894bd168fd9b30c66/qf4ccf8f5435d4a78bdca4d6a018b578e/aaaaaabbb.bba (Lnet/minecraft/class_310;)V
      // 1f: aload 0
      // 20: invokevirtual qeaa361f143ee4a0894bd168fd9b30c66/qf4ccf8f5435d4a78bdca4d6a018b578e/aaaaaabbb.aaaaa ()V
      // 23: aload 0
      // 24: invokevirtual qeaa361f143ee4a0894bd168fd9b30c66/qf4ccf8f5435d4a78bdca4d6a018b578e/aaaaaabbb.aaabb ()V
      // 27: aload 0
      // 28: aload 1
      // 29: getfield net/minecraft/class_310.field_1724 Lnet/minecraft/class_746;
      // 2c: getfield net/minecraft/class_746.field_6012 I
      // 2f: putfield qeaa361f143ee4a0894bd168fd9b30c66/qf4ccf8f5435d4a78bdca4d6a018b578e/aaaaaabbb.baba I
      // 32: aload 0
      // 33: invokestatic qeaa361f143ee4a0894bd168fd9b30c66/qf4ccf8f5435d4a78bdca4d6a018b578e/aabbabbbb.bbbaa ()J
      // 36: putfield qeaa361f143ee4a0894bd168fd9b30c66/qf4ccf8f5435d4a78bdca4d6a018b578e/aaaaaabbb.bbab J
      // 39: aload 0
      // 3a: aload 3
      // 3b: putfield qeaa361f143ee4a0894bd168fd9b30c66/qf4ccf8f5435d4a78bdca4d6a018b578e/aaaaaabbb.babb Lnet/minecraft/class_3965;
      // 3e: aload 0
      // 3f: aload 1
      // 40: getfield net/minecraft/class_310.field_1724 Lnet/minecraft/class_746;
      // 43: invokevirtual net/minecraft/class_746.method_31548 ()Lnet/minecraft/class_1661;
      // 46: invokestatic qeaa361f143ee4a0894bd168fd9b30c66/qf4ccf8f5435d4a78bdca4d6a018b578e/aabbabbbb.abaabaa (Lnet/minecraft/class_1661;)I
      // 49: putfield qeaa361f143ee4a0894bd168fd9b30c66/qf4ccf8f5435d4a78bdca4d6a018b578e/aaaaaabbb.aaaaa I
      // 4c: return
   }

   private long bb(aaabbbab var1) {
      double var2 = var1.bab();
      double var4 = var1.abb();

      try {
         if (var2 >= var4) {
            return Math.max(0L, Math.round(var2));
         }
      } catch (MatchException var6) {
         throw var6;
      }

      return Math.max(0L, Math.round(ThreadLocalRandom.current().nextDouble(var2, var4)));
   }

   @Override
   public String babbabb() {
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
      // 05: invokevirtual qeaa361f143ee4a0894bd168fd9b30c66/qf4ccf8f5435d4a78bdca4d6a018b578e/aaaaaabbb.ababa ()Ljava/lang/String;
      // 08: astore 2
      // 09: aload 2
      // 0a: iload 1
      // 0b: ifne 30
      // 0e: ifnull 28
      // 11: goto 15
      // 14: athrow
      // 15: aload 2
      // 16: iload 1
      // 17: ifne 37
      // 1a: goto 1e
      // 1d: athrow
      // 1e: invokevirtual java/lang/String.isBlank ()Z
      // 21: ifeq 33
      // 24: goto 28
      // 27: athrow
      // 28: aload 0
      // 29: invokevirtual qeaa361f143ee4a0894bd168fd9b30c66/qf4ccf8f5435d4a78bdca4d6a018b578e/aaaaaabbb.abbbbb ()Ljava/lang/String;
      // 2c: goto 30
      // 2f: athrow
      // 30: goto 6c
      // 33: aload 0
      // 34: invokevirtual qeaa361f143ee4a0894bd168fd9b30c66/qf4ccf8f5435d4a78bdca4d6a018b578e/aaaaaabbb.abbbbb ()Ljava/lang/String;
      // 37: getstatic qeaa361f143ee4a0894bd168fd9b30c66/qf4ccf8f5435d4a78bdca4d6a018b578e/aaaaaabbb.abaa [Ljava/lang/String;
      // 3a: ldc 67705481
      // 3c: ldc 395528263
      // 3e: ldc 254998515
      // 40: ixor
      // 41: invokestatic qeaa361f143ee4a0894bd168fd9b30c66/qf4ccf8f5435d4a78bdca4d6a018b578e/aaaaaabbb.a (II)I
      // 44: ldc2_w 7558806549081026660
      // 47: invokestatic qeaa361f143ee4a0894bd168fd9b30c66/qf4ccf8f5435d4a78bdca4d6a018b578e/aaaaaabbb.baaa (IJ)I
      // 4a: aaload
      // 4b: invokestatic qeaa361f143ee4a0894bd168fd9b30c66/qf4ccf8f5435d4a78bdca4d6a018b578e/aabbaaaba.abba (Ljava/lang/String;)Ljava/lang/String;
      // 4e: aload 2
      // 4f: astore 5
      // 51: astore 4
      // 53: astore 3
      // 54: new java/lang/StringBuilder
      // 57: dup
      // 58: invokespecial java/lang/StringBuilder.<init> ()V
      // 5b: aload 3
      // 5c: invokevirtual java/lang/StringBuilder.append (Ljava/lang/Object;)Ljava/lang/StringBuilder;
      // 5f: aload 4
      // 61: invokevirtual java/lang/StringBuilder.append (Ljava/lang/Object;)Ljava/lang/StringBuilder;
      // 64: aload 5
      // 66: invokevirtual java/lang/StringBuilder.append (Ljava/lang/Object;)Ljava/lang/StringBuilder;
      // 69: invokevirtual java/lang/StringBuilder.toString ()Ljava/lang/String;
      // 6c: areturn
   }

   private static String abaaa(int var0, int var1, char var2) {
      int var3 = var2 ^ 30051;
      char[] var4 = aabba[var3].toCharArray();
      StackTraceElement[] var5 = (StackTraceElement[])aabbb[var3];
      StackTraceElement[] var6;
      if (var5 != null) {
         var6 = var5;
      } else {
         var6 = new Throwable().getStackTrace();
         aabbb[var3] = var6;
      }

      StackTraceElement var7 = var6[1];
      int var8 = (var7.getClassName().hashCode() ^ var7.getMethodName().hashCode()) >> 16 ^ 27289;
      int var9 = 0;

      do {
         int var10 = var4[var9] + 22001;
         var10 += 7826;
         var10 += 42584;
         var10 += 57066;
         var10 -= 3331;
         var4[var9] = (char)(var10 ^ var8 ^ var1 ^ var0 >> 16);
      } while (++var9 < var4.length);

      return new String(var4).intern();
   }

   @Override
   public void bbaa() {
      this.aaba(class_310.method_1551());
   }

   private boolean aaa() {
      // $VF: Couldn't be decompiled
      // Please report this to the Vineflower issue tracker, at https://github.com/Vineflower/vineflower/issues with a copy of the class file (if you have the rights to distribute it!)
      // java.lang.RuntimeException: parsing failure!
      //   at org.jetbrains.java.decompiler.modules.decompiler.decompose.DomHelper.parseGraph(DomHelper.java:211)
      //   at org.jetbrains.java.decompiler.main.rels.MethodProcessor.codeToJava(MethodProcessor.java:166)
      //
      // Bytecode:
      // 00: getstatic qeaa361f143ee4a0894bd168fd9b30c66/qf4ccf8f5435d4a78bdca4d6a018b578e/baaabbaa.bba I
      // 03: istore 1
      // 04: invokestatic qeaa361f143ee4a0894bd168fd9b30c66/qf4ccf8f5435d4a78bdca4d6a018b578e/abaaaaaba.aaaaa ()Lqeaa361f143ee4a0894bd168fd9b30c66/qf4ccf8f5435d4a78bdca4d6a018b578e/abaaaaaba;
      // 07: astore 2
      // 08: aload 2
      // 09: iload 1
      // 0a: ifne 15
      // 0d: ifnull 23
      // 10: goto 14
      // 13: athrow
      // 14: aload 2
      // 15: iload 1
      // 16: ifne 27
      // 19: invokevirtual qeaa361f143ee4a0894bd168fd9b30c66/qf4ccf8f5435d4a78bdca4d6a018b578e/abaaaaaba.aaba ()Lqeaa361f143ee4a0894bd168fd9b30c66/qf4ccf8f5435d4a78bdca4d6a018b578e/babbaba;
      // 1c: ifnonnull 26
      // 1f: goto 23
      // 22: athrow
      // 23: bipush 0
      // 24: ireturn
      // 25: athrow
      // 26: aload 2
      // 27: invokevirtual qeaa361f143ee4a0894bd168fd9b30c66/qf4ccf8f5435d4a78bdca4d6a018b578e/abaaaaaba.aaba ()Lqeaa361f143ee4a0894bd168fd9b30c66/qf4ccf8f5435d4a78bdca4d6a018b578e/babbaba;
      // 2a: invokevirtual qeaa361f143ee4a0894bd168fd9b30c66/qf4ccf8f5435d4a78bdca4d6a018b578e/babbaba.bbaaa ()Lqeaa361f143ee4a0894bd168fd9b30c66/qf4ccf8f5435d4a78bdca4d6a018b578e/abbbabab;
      // 2d: astore 3
      // 2e: aload 3
      // 2f: iload 1
      // 30: ifne 3b
      // 33: ifnull 4b
      // 36: goto 3a
      // 39: athrow
      // 3a: aload 3
      // 3b: invokevirtual qeaa361f143ee4a0894bd168fd9b30c66/qf4ccf8f5435d4a78bdca4d6a018b578e/abbbabab.aabbab ()Z
      // 3e: iload 1
      // 3f: ifne 4a
      // 42: ifeq 4b
      // 45: goto 49
      // 48: athrow
      // 49: bipush 1
      // 4a: ireturn
      // 4b: aload 2
      // 4c: invokevirtual qeaa361f143ee4a0894bd168fd9b30c66/qf4ccf8f5435d4a78bdca4d6a018b578e/abaaaaaba.aaba ()Lqeaa361f143ee4a0894bd168fd9b30c66/qf4ccf8f5435d4a78bdca4d6a018b578e/babbaba;
      // 4f: invokevirtual qeaa361f143ee4a0894bd168fd9b30c66/qf4ccf8f5435d4a78bdca4d6a018b578e/babbaba.abaaa ()Lqeaa361f143ee4a0894bd168fd9b30c66/qf4ccf8f5435d4a78bdca4d6a018b578e/aabbbbabb;
      // 52: astore 4
      // 54: aload 4
      // 56: iload 1
      // 57: ifne 63
      // 5a: ifnull 75
      // 5d: goto 61
      // 60: athrow
      // 61: aload 4
      // 63: invokevirtual qeaa361f143ee4a0894bd168fd9b30c66/qf4ccf8f5435d4a78bdca4d6a018b578e/aabbbbabb.bbbbbbb ()Z
      // 66: iload 1
      // 67: ifne 72
      // 6a: ifeq 75
      // 6d: goto 71
      // 70: athrow
      // 71: bipush 1
      // 72: goto 76
      // 75: bipush 0
      // 76: ireturn
   }

   private boolean aab(class_1799 param1) {
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
      // 09: ifnull 7b
      // 0c: goto 10
      // 0f: athrow
      // 10: aload 1
      // 11: iload 2
      // 12: ifne 24
      // 15: invokevirtual net/minecraft/class_1799.method_7960 ()Z
      // 18: ifne 7b
      // 1b: goto 1f
      // 1e: athrow
      // 1f: aload 1
      // 20: goto 24
      // 23: athrow
      // 24: getstatic net/minecraft/class_1802.field_8129 Lnet/minecraft/class_1792;
      // 27: invokevirtual net/minecraft/class_1799.method_31574 (Lnet/minecraft/class_1792;)Z
      // 2a: iload 2
      // 2b: ifne 78
      // 2e: ifne 77
      // 31: goto 35
      // 34: athrow
      // 35: aload 1
      // 36: getstatic net/minecraft/class_1802.field_8848 Lnet/minecraft/class_1792;
      // 39: invokevirtual net/minecraft/class_1799.method_31574 (Lnet/minecraft/class_1792;)Z
      // 3c: iload 2
      // 3d: ifne 78
      // 40: goto 44
      // 43: athrow
      // 44: ifne 77
      // 47: goto 4b
      // 4a: athrow
      // 4b: aload 1
      // 4c: getstatic net/minecraft/class_1802.field_8211 Lnet/minecraft/class_1792;
      // 4f: invokevirtual net/minecraft/class_1799.method_31574 (Lnet/minecraft/class_1792;)Z
      // 52: iload 2
      // 53: ifne 78
      // 56: goto 5a
      // 59: athrow
      // 5a: ifne 77
      // 5d: goto 61
      // 60: athrow
      // 61: aload 1
      // 62: getstatic net/minecraft/class_1802.field_8655 Lnet/minecraft/class_1792;
      // 65: invokevirtual net/minecraft/class_1799.method_31574 (Lnet/minecraft/class_1792;)Z
      // 68: iload 2
      // 69: ifne 78
      // 6c: goto 70
      // 6f: athrow
      // 70: ifeq 7b
      // 73: goto 77
      // 76: athrow
      // 77: bipush 1
      // 78: goto 7c
      // 7b: bipush 0
      // 7c: ireturn
   }

   private boolean aba(class_310 param1) {
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
      // 05: invokevirtual qeaa361f143ee4a0894bd168fd9b30c66/qf4ccf8f5435d4a78bdca4d6a018b578e/aaaaaabbb.babbaab ()Z
      // 08: ifeq 6a
      // 0b: aload 1
      // 0c: iload 2
      // 0d: ifne 1c
      // 10: goto 14
      // 13: athrow
      // 14: ifnull 6a
      // 17: goto 1b
      // 1a: athrow
      // 1b: aload 1
      // 1c: iload 2
      // 1d: ifne 2f
      // 20: getfield net/minecraft/class_310.field_1724 Lnet/minecraft/class_746;
      // 23: ifnull 6a
      // 26: goto 2a
      // 29: athrow
      // 2a: aload 1
      // 2b: goto 2f
      // 2e: athrow
      // 2f: iload 2
      // 30: ifne 42
      // 33: getfield net/minecraft/class_310.field_1687 Lnet/minecraft/class_638;
      // 36: ifnull 6a
      // 39: goto 3d
      // 3c: athrow
      // 3d: aload 1
      // 3e: goto 42
      // 41: athrow
      // 42: iload 2
      // 43: ifne 55
      // 46: getfield net/minecraft/class_310.field_1761 Lnet/minecraft/class_636;
      // 49: ifnull 6a
      // 4c: goto 50
      // 4f: athrow
      // 50: aload 1
      // 51: goto 55
      // 54: athrow
      // 55: getfield net/minecraft/class_310.field_1724 Lnet/minecraft/class_746;
      // 58: invokevirtual net/minecraft/class_746.method_5805 ()Z
      // 5b: iload 2
      // 5c: ifne 67
      // 5f: ifeq 6a
      // 62: goto 66
      // 65: athrow
      // 66: bipush 1
      // 67: goto 6b
      // 6a: bipush 0
      // 6b: ireturn
   }

   private int abb(class_1657 param1, class_1792 param2) {
      // $VF: Couldn't be decompiled
      // Please report this to the Vineflower issue tracker, at https://github.com/Vineflower/vineflower/issues with a copy of the class file (if you have the rights to distribute it!)
      // java.lang.RuntimeException: parsing failure!
      //   at org.jetbrains.java.decompiler.modules.decompiler.decompose.DomHelper.parseGraph(DomHelper.java:211)
      //   at org.jetbrains.java.decompiler.main.rels.MethodProcessor.codeToJava(MethodProcessor.java:166)
      //
      // Bytecode:
      // 00: getstatic qeaa361f143ee4a0894bd168fd9b30c66/qf4ccf8f5435d4a78bdca4d6a018b578e/baaabbaa.bba I
      // 03: istore 3
      // 04: bipush 0
      // 05: istore 4
      // 07: iload 4
      // 09: ldc_w 67705480
      // 0c: ldc_w -1008875048
      // 0f: ldc_w 458096421
      // 12: ixor
      // 13: invokestatic qeaa361f143ee4a0894bd168fd9b30c66/qf4ccf8f5435d4a78bdca4d6a018b578e/aaaaaabbb.a (II)I
      // 16: ldc2_w 117178773667972595
      // 19: invokestatic qeaa361f143ee4a0894bd168fd9b30c66/qf4ccf8f5435d4a78bdca4d6a018b578e/aaaaaabbb.baaa (IJ)I
      // 1c: if_icmpge 4e
      // 1f: aload 1
      // 20: invokevirtual net/minecraft/class_1657.method_31548 ()Lnet/minecraft/class_1661;
      // 23: iload 4
      // 25: invokevirtual net/minecraft/class_1661.method_5438 (I)Lnet/minecraft/class_1799;
      // 28: astore 5
      // 2a: iload 3
      // 2b: ifne 4a
      // 2e: aload 5
      // 30: aload 2
      // 31: invokevirtual net/minecraft/class_1799.method_31574 (Lnet/minecraft/class_1792;)Z
      // 34: iload 3
      // 35: ifne 4f
      // 38: goto 3c
      // 3b: athrow
      // 3c: ifeq 47
      // 3f: goto 43
      // 42: athrow
      // 43: iload 4
      // 45: ireturn
      // 46: athrow
      // 47: iinc 4 1
      // 4a: iload 3
      // 4b: ifeq 07
      // 4e: bipush -1
      // 4f: ireturn
   }

   public boolean bab() {
      return this.bb;
   }

   private void bba(class_310 param1) {
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
      // 06: ifne 1c
      // 09: getfield qeaa361f143ee4a0894bd168fd9b30c66/qf4ccf8f5435d4a78bdca4d6a018b578e/aaaaaabbb.aaaba I
      // 0c: iflt 1b
      // 0f: goto 13
      // 12: athrow
      // 13: aload 0
      // 14: getfield qeaa361f143ee4a0894bd168fd9b30c66/qf4ccf8f5435d4a78bdca4d6a018b578e/aaaaaabbb.aaaba I
      // 17: goto 1f
      // 1a: athrow
      // 1b: aload 0
      // 1c: getfield qeaa361f143ee4a0894bd168fd9b30c66/qf4ccf8f5435d4a78bdca4d6a018b578e/aaaaaabbb.aaaaa I
      // 1f: istore 3
      // 20: aload 1
      // 21: iload 2
      // 22: ifne 2d
      // 25: ifnull 3b
      // 28: goto 2c
      // 2b: athrow
      // 2c: aload 1
      // 2d: iload 2
      // 2e: ifne 44
      // 31: getfield net/minecraft/class_310.field_1724 Lnet/minecraft/class_746;
      // 34: ifnonnull 3d
      // 37: goto 3b
      // 3a: athrow
      // 3b: return
      // 3c: athrow
      // 3d: aload 0
      // 3e: getfield qeaa361f143ee4a0894bd168fd9b30c66/qf4ccf8f5435d4a78bdca4d6a018b578e/aaaaaabbb.bab Lqeaa361f143ee4a0894bd168fd9b30c66/qf4ccf8f5435d4a78bdca4d6a018b578e/abbaaaaa;
      // 41: invokevirtual qeaa361f143ee4a0894bd168fd9b30c66/qf4ccf8f5435d4a78bdca4d6a018b578e/abbaaaaa.abbb ()Ljava/lang/Object;
      // 44: checkcast java/lang/Boolean
      // 47: invokevirtual java/lang/Boolean.booleanValue ()Z
      // 4a: iload 2
      // 4b: ifne 56
      // 4e: ifeq 86
      // 51: goto 55
      // 54: athrow
      // 55: iload 3
      // 56: iload 2
      // 57: ifne 62
      // 5a: iflt 86
      // 5d: goto 61
      // 60: athrow
      // 61: iload 3
      // 62: ldc_w 67705483
      // 65: ldc_w 1083097368
      // 68: ldc_w 1343282842
      // 6b: ixor
      // 6c: invokestatic qeaa361f143ee4a0894bd168fd9b30c66/qf4ccf8f5435d4a78bdca4d6a018b578e/aaaaaabbb.a (II)I
      // 6f: ldc2_w 2115980057182297119
      // 72: invokestatic qeaa361f143ee4a0894bd168fd9b30c66/qf4ccf8f5435d4a78bdca4d6a018b578e/aaaaaabbb.baaa (IJ)I
      // 75: if_icmpge 86
      // 78: aload 1
      // 79: aload 0
      // 7a: iload 3
      // 7b: invokestatic qeaa361f143ee4a0894bd168fd9b30c66/qf4ccf8f5435d4a78bdca4d6a018b578e/aabbabbbb.aaaabaa (Lnet/minecraft/class_310;Ljava/lang/Object;I)V
      // 7e: iload 2
      // 7f: ifeq 92
      // 82: goto 86
      // 85: athrow
      // 86: aload 1
      // 87: aload 0
      // 88: getstatic qeaa361f143ee4a0894bd168fd9b30c66/qf4ccf8f5435d4a78bdca4d6a018b578e/abbaaabba.ab Lqeaa361f143ee4a0894bd168fd9b30c66/qf4ccf8f5435d4a78bdca4d6a018b578e/abbaaabba;
      // 8b: invokestatic qeaa361f143ee4a0894bd168fd9b30c66/qf4ccf8f5435d4a78bdca4d6a018b578e/aabbabbbb.bbaaabb (Lnet/minecraft/class_310;Ljava/lang/Object;Lqeaa361f143ee4a0894bd168fd9b30c66/qf4ccf8f5435d4a78bdca4d6a018b578e/abbaaabba;)V
      // 8e: goto 92
      // 91: athrow
      // 92: return
   }

   @Override
   public String ababa() {
      return null;
   }

   public void bbb(class_310 param1, class_1268 param2, class_3965 param3, class_1269 param4) {
      // $VF: Couldn't be decompiled
      // Please report this to the Vineflower issue tracker, at https://github.com/Vineflower/vineflower/issues with a copy of the class file (if you have the rights to distribute it!)
      // java.lang.RuntimeException: parsing failure!
      //   at org.jetbrains.java.decompiler.modules.decompiler.decompose.DomHelper.parseGraph(DomHelper.java:211)
      //   at org.jetbrains.java.decompiler.main.rels.MethodProcessor.codeToJava(MethodProcessor.java:166)
      //
      // Bytecode:
      // 000: getstatic qeaa361f143ee4a0894bd168fd9b30c66/qf4ccf8f5435d4a78bdca4d6a018b578e/baaabbaa.bba I
      // 003: istore 5
      // 005: aload 0
      // 006: iload 5
      // 008: ifne 02b
      // 00b: getfield qeaa361f143ee4a0894bd168fd9b30c66/qf4ccf8f5435d4a78bdca4d6a018b578e/aaaaaabbb.baba I
      // 00e: ldc_w 67705482
      // 011: ldc_w 391047146
      // 014: ldc_w 1664671933
      // 017: ixor
      // 018: invokestatic qeaa361f143ee4a0894bd168fd9b30c66/qf4ccf8f5435d4a78bdca4d6a018b578e/aaaaaabbb.a (II)I
      // 01b: ldc2_w 6402118672161460834
      // 01e: invokestatic qeaa361f143ee4a0894bd168fd9b30c66/qf4ccf8f5435d4a78bdca4d6a018b578e/aaaaaabbb.baaa (IJ)I
      // 021: if_icmpne 02a
      // 024: goto 028
      // 027: athrow
      // 028: return
      // 029: athrow
      // 02a: aload 0
      // 02b: iload 5
      // 02d: ifne 0f4
      // 030: invokevirtual qeaa361f143ee4a0894bd168fd9b30c66/qf4ccf8f5435d4a78bdca4d6a018b578e/aaaaaabbb.babbaab ()Z
      // 033: ifeq 0f3
      // 036: goto 03a
      // 039: athrow
      // 03a: aload 0
      // 03b: iload 5
      // 03d: ifne 0f4
      // 040: goto 044
      // 043: athrow
      // 044: getfield qeaa361f143ee4a0894bd168fd9b30c66/qf4ccf8f5435d4a78bdca4d6a018b578e/aaaaaabbb.bb Z
      // 047: ifne 0f3
      // 04a: goto 04e
      // 04d: athrow
      // 04e: aload 0
      // 04f: iload 5
      // 051: ifne 0f4
      // 054: goto 058
      // 057: athrow
      // 058: invokevirtual qeaa361f143ee4a0894bd168fd9b30c66/qf4ccf8f5435d4a78bdca4d6a018b578e/aaaaaabbb.aaa ()Z
      // 05b: ifne 0f3
      // 05e: goto 062
      // 061: athrow
      // 062: aload 4
      // 064: iload 5
      // 066: ifne 076
      // 069: goto 06d
      // 06c: athrow
      // 06d: ifnull 0f3
      // 070: goto 074
      // 073: athrow
      // 074: aload 4
      // 076: invokeinterface net/minecraft/class_1269.method_23665 ()Z 1
      // 07b: ifeq 0f3
      // 07e: aload 1
      // 07f: iload 5
      // 081: ifne 090
      // 084: goto 088
      // 087: athrow
      // 088: ifnull 0f3
      // 08b: goto 08f
      // 08e: athrow
      // 08f: aload 1
      // 090: iload 5
      // 092: ifne 0a4
      // 095: getfield net/minecraft/class_310.field_1724 Lnet/minecraft/class_746;
      // 098: ifnull 0f3
      // 09b: goto 09f
      // 09e: athrow
      // 09f: aload 1
      // 0a0: goto 0a4
      // 0a3: athrow
      // 0a4: iload 5
      // 0a6: ifne 0b8
      // 0a9: getfield net/minecraft/class_310.field_1687 Lnet/minecraft/class_638;
      // 0ac: ifnull 0f3
      // 0af: goto 0b3
      // 0b2: athrow
      // 0b3: aload 1
      // 0b4: goto 0b8
      // 0b7: athrow
      // 0b8: getfield net/minecraft/class_310.field_1761 Lnet/minecraft/class_636;
      // 0bb: ifnull 0f3
      // 0be: aload 2
      // 0bf: getstatic net/minecraft/class_1268.field_5808 Lnet/minecraft/class_1268;
      // 0c2: if_acmpne 0f3
      // 0c5: goto 0c9
      // 0c8: athrow
      // 0c9: aload 1
      // 0ca: getfield net/minecraft/class_310.field_1724 Lnet/minecraft/class_746;
      // 0cd: getfield net/minecraft/class_746.field_6012 I
      // 0d0: iload 5
      // 0d2: ifne 0f0
      // 0d5: goto 0d9
      // 0d8: athrow
      // 0d9: aload 0
      // 0da: getfield qeaa361f143ee4a0894bd168fd9b30c66/qf4ccf8f5435d4a78bdca4d6a018b578e/aaaaaabbb.baba I
      // 0dd: if_icmpne 0f3
      // 0e0: goto 0e4
      // 0e3: athrow
      // 0e4: invokestatic qeaa361f143ee4a0894bd168fd9b30c66/qf4ccf8f5435d4a78bdca4d6a018b578e/aabbabbbb.bbbaa ()J
      // 0e7: aload 0
      // 0e8: getfield qeaa361f143ee4a0894bd168fd9b30c66/qf4ccf8f5435d4a78bdca4d6a018b578e/aaaaaabbb.bbab J
      // 0eb: lcmp
      // 0ec: goto 0f0
      // 0ef: athrow
      // 0f0: ifgt 0f8
      // 0f3: aload 0
      // 0f4: invokevirtual qeaa361f143ee4a0894bd168fd9b30c66/qf4ccf8f5435d4a78bdca4d6a018b578e/aaaaaabbb.aaaaa ()V
      // 0f7: return
      // 0f8: aload 0
      // 0f9: iload 5
      // 0fb: ifne 10d
      // 0fe: getfield qeaa361f143ee4a0894bd168fd9b30c66/qf4ccf8f5435d4a78bdca4d6a018b578e/aaaaaabbb.babb Lnet/minecraft/class_3965;
      // 101: ifnull 113
      // 104: goto 108
      // 107: athrow
      // 108: aload 0
      // 109: goto 10d
      // 10c: athrow
      // 10d: getfield qeaa361f143ee4a0894bd168fd9b30c66/qf4ccf8f5435d4a78bdca4d6a018b578e/aaaaaabbb.babb Lnet/minecraft/class_3965;
      // 110: goto 114
      // 113: aload 3
      // 114: astore 6
      // 116: iload 5
      // 118: aload 0
      // 119: aload 1
      // 11a: aload 6
      // 11c: invokevirtual qeaa361f143ee4a0894bd168fd9b30c66/qf4ccf8f5435d4a78bdca4d6a018b578e/aaaaaabbb.aaaab (Lnet/minecraft/class_310;Lnet/minecraft/class_3965;)Lnet/minecraft/class_2338;
      // 11f: astore 7
      // 121: ifne 144
      // 124: aload 7
      // 126: ifnull 140
      // 129: goto 12d
      // 12c: athrow
      // 12d: aload 0
      // 12e: aload 7
      // 130: aload 0
      // 131: getfield qeaa361f143ee4a0894bd168fd9b30c66/qf4ccf8f5435d4a78bdca4d6a018b578e/aaaaaabbb.aaaaa I
      // 134: invokevirtual qeaa361f143ee4a0894bd168fd9b30c66/qf4ccf8f5435d4a78bdca4d6a018b578e/aaaaaabbb.aabb (Lnet/minecraft/class_2338;I)V
      // 137: aload 0
      // 138: aload 1
      // 139: invokevirtual qeaa361f143ee4a0894bd168fd9b30c66/qf4ccf8f5435d4a78bdca4d6a018b578e/aaaaaabbb.aaba (Lnet/minecraft/class_310;)V
      // 13c: goto 140
      // 13f: athrow
      // 140: aload 0
      // 141: invokevirtual qeaa361f143ee4a0894bd168fd9b30c66/qf4ccf8f5435d4a78bdca4d6a018b578e/aaaaaabbb.aaaaa ()V
      // 144: goto 150
      // 147: astore 8
      // 149: aload 0
      // 14a: invokevirtual qeaa361f143ee4a0894bd168fd9b30c66/qf4ccf8f5435d4a78bdca4d6a018b578e/aaaaaabbb.aaaaa ()V
      // 14d: aload 8
      // 14f: athrow
      // 150: return
   }

   private boolean aaaa(class_310 param1, class_2338 param2) {
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
      // 05: aload 1
      // 06: invokevirtual qeaa361f143ee4a0894bd168fd9b30c66/qf4ccf8f5435d4a78bdca4d6a018b578e/aaaaaabbb.aba (Lnet/minecraft/class_310;)Z
      // 09: ifeq 55
      // 0c: aload 2
      // 0d: ifnull 55
      // 10: goto 14
      // 13: athrow
      // 14: aload 0
      // 15: aload 1
      // 16: getfield net/minecraft/class_310.field_1687 Lnet/minecraft/class_638;
      // 19: aload 2
      // 1a: invokevirtual net/minecraft/class_638.method_8320 (Lnet/minecraft/class_2338;)Lnet/minecraft/class_2680;
      // 1d: invokevirtual qeaa361f143ee4a0894bd168fd9b30c66/qf4ccf8f5435d4a78bdca4d6a018b578e/aaaaaabbb.baba (Lnet/minecraft/class_2680;)Z
      // 20: iload 3
      // 21: ifne 46
      // 24: goto 28
      // 27: athrow
      // 28: ifeq 55
      // 2b: goto 2f
      // 2e: athrow
      // 2f: aload 1
      // 30: getfield net/minecraft/class_310.field_1724 Lnet/minecraft/class_746;
      // 33: invokevirtual net/minecraft/class_746.method_33571 ()Lnet/minecraft/class_243;
      // 36: aload 0
      // 37: aload 2
      // 38: invokevirtual qeaa361f143ee4a0894bd168fd9b30c66/qf4ccf8f5435d4a78bdca4d6a018b578e/aaaaaabbb.abab (Lnet/minecraft/class_2338;)Lnet/minecraft/class_243;
      // 3b: invokevirtual net/minecraft/class_243.method_1025 (Lnet/minecraft/class_243;)D
      // 3e: ldc2_w 20.25
      // 41: dcmpg
      // 42: goto 46
      // 45: athrow
      // 46: iload 3
      // 47: ifne 52
      // 4a: ifgt 55
      // 4d: goto 51
      // 50: athrow
      // 51: bipush 1
      // 52: goto 56
      // 55: bipush 0
      // 56: ireturn
   }

   private boolean aaab(class_310 param1, int param2) {
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
      // 06: ifne 11
      // 09: ifnull 5d
      // 0c: goto 10
      // 0f: athrow
      // 10: aload 1
      // 11: getfield net/minecraft/class_310.field_1724 Lnet/minecraft/class_746;
      // 14: ifnull 5d
      // 17: iload 2
      // 18: iload 3
      // 19: ifne 5e
      // 1c: goto 20
      // 1f: athrow
      // 20: iflt 5d
      // 23: goto 27
      // 26: athrow
      // 27: iload 2
      // 28: iload 3
      // 29: ifne 5e
      // 2c: goto 30
      // 2f: athrow
      // 30: ldc_w 67705485
      // 33: ldc_w -182530600
      // 36: ldc_w 1085054213
      // 39: ixor
      // 3a: invokestatic qeaa361f143ee4a0894bd168fd9b30c66/qf4ccf8f5435d4a78bdca4d6a018b578e/aaaaaabbb.a (II)I
      // 3d: ldc2_w 117178773667972595
      // 40: invokestatic qeaa361f143ee4a0894bd168fd9b30c66/qf4ccf8f5435d4a78bdca4d6a018b578e/aaaaaabbb.baaa (IJ)I
      // 43: if_icmpge 5d
      // 46: goto 4a
      // 49: athrow
      // 4a: aload 1
      // 4b: invokestatic qeaa361f143ee4a0894bd168fd9b30c66/qf4ccf8f5435d4a78bdca4d6a018b578e/bbbbbbaa.aabb (Lnet/minecraft/class_310;)Z
      // 4e: iload 3
      // 4f: ifne 6e
      // 52: goto 56
      // 55: athrow
      // 56: ifeq 5f
      // 59: goto 5d
      // 5c: athrow
      // 5d: bipush 0
      // 5e: ireturn
      // 5f: aload 0
      // 60: aload 1
      // 61: getfield net/minecraft/class_310.field_1724 Lnet/minecraft/class_746;
      // 64: invokevirtual net/minecraft/class_746.method_31548 ()Lnet/minecraft/class_1661;
      // 67: iload 2
      // 68: invokevirtual net/minecraft/class_1661.method_5438 (I)Lnet/minecraft/class_1799;
      // 6b: invokevirtual qeaa361f143ee4a0894bd168fd9b30c66/qf4ccf8f5435d4a78bdca4d6a018b578e/aaaaaabbb.aaaba (Lnet/minecraft/class_1799;)Z
      // 6e: ireturn
   }

   private void aaba(class_310 param1) {
      // $VF: Couldn't be decompiled
      // Please report this to the Vineflower issue tracker, at https://github.com/Vineflower/vineflower/issues with a copy of the class file (if you have the rights to distribute it!)
      // java.lang.RuntimeException: parsing failure!
      //   at org.jetbrains.java.decompiler.modules.decompiler.decompose.DomHelper.parseGraph(DomHelper.java:211)
      //   at org.jetbrains.java.decompiler.main.rels.MethodProcessor.codeToJava(MethodProcessor.java:166)
      //
      // Bytecode:
      // 000: ldc_w -2147315435
      // 003: istore 6
      // 005: getstatic qeaa361f143ee4a0894bd168fd9b30c66/qf4ccf8f5435d4a78bdca4d6a018b578e/baaabbaa.bba I
      // 008: istore 2
      // 009: aload 0
      // 00a: iload 2
      // 00b: ifne 01b
      // 00e: getfield qeaa361f143ee4a0894bd168fd9b30c66/qf4ccf8f5435d4a78bdca4d6a018b578e/aaaaaabbb.baa Lnet/minecraft/class_2338;
      // 011: ifnonnull 01a
      // 014: goto 018
      // 017: athrow
      // 018: return
      // 019: athrow
      // 01a: aload 0
      // 01b: iload 2
      // 01c: ifne 031
      // 01f: invokevirtual qeaa361f143ee4a0894bd168fd9b30c66/qf4ccf8f5435d4a78bdca4d6a018b578e/aaaaaabbb.aaa ()Z
      // 022: ifeq 030
      // 025: goto 029
      // 028: athrow
      // 029: aload 0
      // 02a: aload 1
      // 02b: invokevirtual qeaa361f143ee4a0894bd168fd9b30c66/qf4ccf8f5435d4a78bdca4d6a018b578e/aaaaaabbb.bbba (Lnet/minecraft/class_310;)V
      // 02e: return
      // 02f: athrow
      // 030: aload 0
      // 031: iload 2
      // 032: ifne 04c
      // 035: aload 1
      // 036: invokevirtual qeaa361f143ee4a0894bd168fd9b30c66/qf4ccf8f5435d4a78bdca4d6a018b578e/aaaaaabbb.aba (Lnet/minecraft/class_310;)Z
      // 039: ifne 04b
      // 03c: goto 040
      // 03f: athrow
      // 040: aload 0
      // 041: aload 1
      // 042: invokevirtual qeaa361f143ee4a0894bd168fd9b30c66/qf4ccf8f5435d4a78bdca4d6a018b578e/aaaaaabbb.bba (Lnet/minecraft/class_310;)V
      // 045: aload 0
      // 046: invokevirtual qeaa361f143ee4a0894bd168fd9b30c66/qf4ccf8f5435d4a78bdca4d6a018b578e/aaaaaabbb.aaabb ()V
      // 049: return
      // 04a: athrow
      // 04b: aload 0
      // 04c: iload 2
      // 04d: ifne 08b
      // 050: getfield qeaa361f143ee4a0894bd168fd9b30c66/qf4ccf8f5435d4a78bdca4d6a018b578e/aaaaaabbb.aabaa I
      // 053: ldc_w 67705484
      // 056: iload 6
      // 058: ldc_w -1800939186
      // 05b: ixor
      // 05c: invokestatic qeaa361f143ee4a0894bd168fd9b30c66/qf4ccf8f5435d4a78bdca4d6a018b578e/aaaaaabbb.a (II)I
      // 05f: ldc2_w 6402118672161460834
      // 062: invokestatic qeaa361f143ee4a0894bd168fd9b30c66/qf4ccf8f5435d4a78bdca4d6a018b578e/aaaaaabbb.baaa (IJ)I
      // 065: if_icmpeq 08a
      // 068: goto 06c
      // 06b: athrow
      // 06c: aload 1
      // 06d: getfield net/minecraft/class_310.field_1724 Lnet/minecraft/class_746;
      // 070: getfield net/minecraft/class_746.field_6012 I
      // 073: aload 0
      // 074: getfield qeaa361f143ee4a0894bd168fd9b30c66/qf4ccf8f5435d4a78bdca4d6a018b578e/aaaaaabbb.aabaa I
      // 077: if_icmpge 080
      // 07a: goto 07e
      // 07d: athrow
      // 07e: return
      // 07f: athrow
      // 080: aload 0
      // 081: aload 1
      // 082: invokevirtual qeaa361f143ee4a0894bd168fd9b30c66/qf4ccf8f5435d4a78bdca4d6a018b578e/aaaaaabbb.bba (Lnet/minecraft/class_310;)V
      // 085: aload 0
      // 086: invokevirtual qeaa361f143ee4a0894bd168fd9b30c66/qf4ccf8f5435d4a78bdca4d6a018b578e/aaaaaabbb.aaabb ()V
      // 089: return
      // 08a: aload 0
      // 08b: getfield qeaa361f143ee4a0894bd168fd9b30c66/qf4ccf8f5435d4a78bdca4d6a018b578e/aaaaaabbb.aaba I
      // 08e: iload 2
      // 08f: ifne 0f8
      // 092: ldc_w 67705487
      // 095: iload 6
      // 097: ldc_w 1048139392
      // 09a: ixor
      // 09b: invokestatic qeaa361f143ee4a0894bd168fd9b30c66/qf4ccf8f5435d4a78bdca4d6a018b578e/aaaaaabbb.a (II)I
      // 09e: ldc2_w 6402118672161460834
      // 0a1: invokestatic qeaa361f143ee4a0894bd168fd9b30c66/qf4ccf8f5435d4a78bdca4d6a018b578e/aaaaaabbb.baaa (IJ)I
      // 0a4: if_icmpeq 0f0
      // 0a7: goto 0ab
      // 0aa: athrow
      // 0ab: aload 1
      // 0ac: getfield net/minecraft/class_310.field_1724 Lnet/minecraft/class_746;
      // 0af: getfield net/minecraft/class_746.field_6012 I
      // 0b2: aload 0
      // 0b3: getfield qeaa361f143ee4a0894bd168fd9b30c66/qf4ccf8f5435d4a78bdca4d6a018b578e/aaaaaabbb.aaba I
      // 0b6: if_icmpgt 0bf
      // 0b9: goto 0bd
      // 0bc: athrow
      // 0bd: return
      // 0be: athrow
      // 0bf: aload 0
      // 0c0: ldc_w 67705486
      // 0c3: iload 6
      // 0c5: ldc_w -1036758663
      // 0c8: ixor
      // 0c9: invokestatic qeaa361f143ee4a0894bd168fd9b30c66/qf4ccf8f5435d4a78bdca4d6a018b578e/aaaaaabbb.a (II)I
      // 0cc: ldc2_w 6402118672161460834
      // 0cf: invokestatic qeaa361f143ee4a0894bd168fd9b30c66/qf4ccf8f5435d4a78bdca4d6a018b578e/aaaaaabbb.baaa (IJ)I
      // 0d2: putfield qeaa361f143ee4a0894bd168fd9b30c66/qf4ccf8f5435d4a78bdca4d6a018b578e/aaaaaabbb.aaba I
      // 0d5: aload 0
      // 0d6: invokestatic java/lang/System.currentTimeMillis ()J
      // 0d9: ldc_w 67705473
      // 0dc: iload 6
      // 0de: ldc_w 336905063
      // 0e1: ixor
      // 0e2: invokestatic qeaa361f143ee4a0894bd168fd9b30c66/qf4ccf8f5435d4a78bdca4d6a018b578e/aaaaaabbb.a (II)I
      // 0e5: ldc2_w 247751255801993059
      // 0e8: invokestatic qeaa361f143ee4a0894bd168fd9b30c66/qf4ccf8f5435d4a78bdca4d6a018b578e/aaaaaabbb.bbbb (IJ)J
      // 0eb: ladd
      // 0ec: putfield qeaa361f143ee4a0894bd168fd9b30c66/qf4ccf8f5435d4a78bdca4d6a018b578e/aaaaaabbb.aaab J
      // 0ef: return
      // 0f0: invokestatic java/lang/System.currentTimeMillis ()J
      // 0f3: aload 0
      // 0f4: getfield qeaa361f143ee4a0894bd168fd9b30c66/qf4ccf8f5435d4a78bdca4d6a018b578e/aaaaaabbb.aaab J
      // 0f7: lcmp
      // 0f8: ifge 0fc
      // 0fb: return
      // 0fc: aload 0
      // 0fd: getfield qeaa361f143ee4a0894bd168fd9b30c66/qf4ccf8f5435d4a78bdca4d6a018b578e/aaaaaabbb.baa Lnet/minecraft/class_2338;
      // 100: astore 3
      // 101: aload 0
      // 102: aload 1
      // 103: iload 2
      // 104: ifne 129
      // 107: getfield net/minecraft/class_310.field_1687 Lnet/minecraft/class_638;
      // 10a: aload 3
      // 10b: invokevirtual net/minecraft/class_638.method_8320 (Lnet/minecraft/class_2338;)Lnet/minecraft/class_2680;
      // 10e: invokevirtual qeaa361f143ee4a0894bd168fd9b30c66/qf4ccf8f5435d4a78bdca4d6a018b578e/aaaaaabbb.baba (Lnet/minecraft/class_2680;)Z
      // 111: ifne 11f
      // 114: goto 118
      // 117: athrow
      // 118: aload 0
      // 119: aload 1
      // 11a: invokevirtual qeaa361f143ee4a0894bd168fd9b30c66/qf4ccf8f5435d4a78bdca4d6a018b578e/aaaaaabbb.abbb (Lnet/minecraft/class_310;)V
      // 11d: return
      // 11e: athrow
      // 11f: aload 0
      // 120: iload 2
      // 121: ifne 138
      // 124: aload 1
      // 125: goto 129
      // 128: athrow
      // 129: aload 3
      // 12a: invokevirtual qeaa361f143ee4a0894bd168fd9b30c66/qf4ccf8f5435d4a78bdca4d6a018b578e/aaaaaabbb.aaaa (Lnet/minecraft/class_310;Lnet/minecraft/class_2338;)Z
      // 12d: ifne 137
      // 130: aload 0
      // 131: aload 1
      // 132: invokevirtual qeaa361f143ee4a0894bd168fd9b30c66/qf4ccf8f5435d4a78bdca4d6a018b578e/aaaaaabbb.baab (Lnet/minecraft/class_310;)V
      // 135: return
      // 136: athrow
      // 137: aload 0
      // 138: iload 2
      // 139: ifne 157
      // 13c: getfield qeaa361f143ee4a0894bd168fd9b30c66/qf4ccf8f5435d4a78bdca4d6a018b578e/aaaaaabbb.bbaa I
      // 13f: ifge 156
      // 142: goto 146
      // 145: athrow
      // 146: aload 0
      // 147: aload 0
      // 148: aload 1
      // 149: getfield net/minecraft/class_310.field_1724 Lnet/minecraft/class_746;
      // 14c: invokevirtual qeaa361f143ee4a0894bd168fd9b30c66/qf4ccf8f5435d4a78bdca4d6a018b578e/aaaaaabbb.abaa (Lnet/minecraft/class_1657;)I
      // 14f: putfield qeaa361f143ee4a0894bd168fd9b30c66/qf4ccf8f5435d4a78bdca4d6a018b578e/aaaaaabbb.bbaa I
      // 152: goto 156
      // 155: athrow
      // 156: aload 0
      // 157: iload 2
      // 158: ifne 26d
      // 15b: getfield qeaa361f143ee4a0894bd168fd9b30c66/qf4ccf8f5435d4a78bdca4d6a018b578e/aaaaaabbb.aab Z
      // 15e: ifne 26c
      // 161: goto 165
      // 164: athrow
      // 165: aload 0
      // 166: iload 2
      // 167: ifne 195
      // 16a: goto 16e
      // 16d: athrow
      // 16e: getfield qeaa361f143ee4a0894bd168fd9b30c66/qf4ccf8f5435d4a78bdca4d6a018b578e/aaaaaabbb.bbaa I
      // 171: iflt 190
      // 174: goto 178
      // 177: athrow
      // 178: aload 0
      // 179: iload 2
      // 17a: ifne 19b
      // 17d: goto 181
      // 180: athrow
      // 181: aload 1
      // 182: aload 0
      // 183: getfield qeaa361f143ee4a0894bd168fd9b30c66/qf4ccf8f5435d4a78bdca4d6a018b578e/aaaaaabbb.bbaa I
      // 186: invokevirtual qeaa361f143ee4a0894bd168fd9b30c66/qf4ccf8f5435d4a78bdca4d6a018b578e/aaaaaabbb.aaab (Lnet/minecraft/class_310;I)Z
      // 189: ifne 19a
      // 18c: goto 190
      // 18f: athrow
      // 190: aload 0
      // 191: goto 195
      // 194: athrow
      // 195: aload 1
      // 196: invokevirtual qeaa361f143ee4a0894bd168fd9b30c66/qf4ccf8f5435d4a78bdca4d6a018b578e/aaaaaabbb.baab (Lnet/minecraft/class_310;)V
      // 199: return
      // 19a: aload 0
      // 19b: getfield qeaa361f143ee4a0894bd168fd9b30c66/qf4ccf8f5435d4a78bdca4d6a018b578e/aaaaaabbb.bbbb Lqeaa361f143ee4a0894bd168fd9b30c66/qf4ccf8f5435d4a78bdca4d6a018b578e/bbbbaaaa;
      // 19e: ifnull 1d2
      // 1a1: aload 1
      // 1a2: iload 2
      // 1a3: ifne 1d7
      // 1a6: goto 1aa
      // 1a9: athrow
      // 1aa: aload 0
      // 1ab: getfield qeaa361f143ee4a0894bd168fd9b30c66/qf4ccf8f5435d4a78bdca4d6a018b578e/aaaaaabbb.bbbb Lqeaa361f143ee4a0894bd168fd9b30c66/qf4ccf8f5435d4a78bdca4d6a018b578e/bbbbaaaa;
      // 1ae: invokestatic qeaa361f143ee4a0894bd168fd9b30c66/qf4ccf8f5435d4a78bdca4d6a018b578e/aabbabbbb.ababbab (Lnet/minecraft/class_310;Lqeaa361f143ee4a0894bd168fd9b30c66/qf4ccf8f5435d4a78bdca4d6a018b578e/bbbbaaaa;)Z
      // 1b1: ifeq 1d2
      // 1b4: goto 1b8
      // 1b7: athrow
      // 1b8: aload 0
      // 1b9: iload 2
      // 1ba: ifne 224
      // 1bd: goto 1c1
      // 1c0: athrow
      // 1c1: getfield qeaa361f143ee4a0894bd168fd9b30c66/qf4ccf8f5435d4a78bdca4d6a018b578e/aaaaaabbb.bbbb Lqeaa361f143ee4a0894bd168fd9b30c66/qf4ccf8f5435d4a78bdca4d6a018b578e/bbbbaaaa;
      // 1c4: invokevirtual qeaa361f143ee4a0894bd168fd9b30c66/qf4ccf8f5435d4a78bdca4d6a018b578e/bbbbaaaa.aa ()I
      // 1c7: aload 0
      // 1c8: getfield qeaa361f143ee4a0894bd168fd9b30c66/qf4ccf8f5435d4a78bdca4d6a018b578e/aaaaaabbb.bbaa I
      // 1cb: if_icmpeq 223
      // 1ce: goto 1d2
      // 1d1: athrow
      // 1d2: aload 1
      // 1d3: goto 1d7
      // 1d6: athrow
      // 1d7: invokestatic qeaa361f143ee4a0894bd168fd9b30c66/qf4ccf8f5435d4a78bdca4d6a018b578e/aabbabbbb.baabaab (Lnet/minecraft/class_310;)I
      // 1da: iload 2
      // 1db: ifne 1ee
      // 1de: aload 0
      // 1df: getfield qeaa361f143ee4a0894bd168fd9b30c66/qf4ccf8f5435d4a78bdca4d6a018b578e/aaaaaabbb.bbaa I
      // 1e2: if_icmpeq 1f1
      // 1e5: goto 1e9
      // 1e8: athrow
      // 1e9: bipush 1
      // 1ea: goto 1ee
      // 1ed: athrow
      // 1ee: goto 1f2
      // 1f1: bipush 0
      // 1f2: istore 4
      // 1f4: iload 4
      // 1f6: iload 2
      // 1f7: ifne 20d
      // 1fa: ifeq 210
      // 1fd: goto 201
      // 200: athrow
      // 201: aload 0
      // 202: aload 0
      // 203: getfield qeaa361f143ee4a0894bd168fd9b30c66/qf4ccf8f5435d4a78bdca4d6a018b578e/aaaaaabbb.aaaab Lqeaa361f143ee4a0894bd168fd9b30c66/qf4ccf8f5435d4a78bdca4d6a018b578e/aaabbbab;
      // 206: invokevirtual qeaa361f143ee4a0894bd168fd9b30c66/qf4ccf8f5435d4a78bdca4d6a018b578e/aaaaaabbb.ab (Lqeaa361f143ee4a0894bd168fd9b30c66/qf4ccf8f5435d4a78bdca4d6a018b578e/aaabbbab;)I
      // 209: goto 20d
      // 20c: athrow
      // 20d: goto 211
      // 210: bipush 0
      // 211: istore 5
      // 213: aload 0
      // 214: aload 1
      // 215: aload 0
      // 216: aload 0
      // 217: getfield qeaa361f143ee4a0894bd168fd9b30c66/qf4ccf8f5435d4a78bdca4d6a018b578e/aaaaaabbb.bbaa I
      // 21a: iload 5
      // 21c: bipush 1
      // 21d: invokestatic qeaa361f143ee4a0894bd168fd9b30c66/qf4ccf8f5435d4a78bdca4d6a018b578e/aabbabbbb.aaabaa (Lnet/minecraft/class_310;Ljava/lang/Object;IIZ)Lqeaa361f143ee4a0894bd168fd9b30c66/qf4ccf8f5435d4a78bdca4d6a018b578e/bbbbaaaa;
      // 220: putfield qeaa361f143ee4a0894bd168fd9b30c66/qf4ccf8f5435d4a78bdca4d6a018b578e/aaaaaabbb.bbbb Lqeaa361f143ee4a0894bd168fd9b30c66/qf4ccf8f5435d4a78bdca4d6a018b578e/bbbbaaaa;
      // 223: aload 0
      // 224: getfield qeaa361f143ee4a0894bd168fd9b30c66/qf4ccf8f5435d4a78bdca4d6a018b578e/aaaaaabbb.bbbb Lqeaa361f143ee4a0894bd168fd9b30c66/qf4ccf8f5435d4a78bdca4d6a018b578e/bbbbaaaa;
      // 227: invokevirtual qeaa361f143ee4a0894bd168fd9b30c66/qf4ccf8f5435d4a78bdca4d6a018b578e/bbbbaaaa.b ()Z
      // 22a: iload 2
      // 22b: ifne 25e
      // 22e: ifne 256
      // 231: goto 235
      // 234: athrow
      // 235: aload 0
      // 236: aconst_null
      // 237: putfield qeaa361f143ee4a0894bd168fd9b30c66/qf4ccf8f5435d4a78bdca4d6a018b578e/aaaaaabbb.bbbb Lqeaa361f143ee4a0894bd168fd9b30c66/qf4ccf8f5435d4a78bdca4d6a018b578e/bbbbaaaa;
      // 23a: aload 0
      // 23b: invokestatic java/lang/System.currentTimeMillis ()J
      // 23e: ldc_w 67705472
      // 241: iload 6
      // 243: ldc_w 349053800
      // 246: ixor
      // 247: invokestatic qeaa361f143ee4a0894bd168fd9b30c66/qf4ccf8f5435d4a78bdca4d6a018b578e/aaaaaabbb.a (II)I
      // 24a: ldc2_w 5764858383757622107
      // 24d: invokestatic qeaa361f143ee4a0894bd168fd9b30c66/qf4ccf8f5435d4a78bdca4d6a018b578e/aaaaaabbb.bbbb (IJ)J
      // 250: ladd
      // 251: putfield qeaa361f143ee4a0894bd168fd9b30c66/qf4ccf8f5435d4a78bdca4d6a018b578e/aaaaaabbb.aaab J
      // 254: return
      // 255: athrow
      // 256: aload 1
      // 257: aload 0
      // 258: getfield qeaa361f143ee4a0894bd168fd9b30c66/qf4ccf8f5435d4a78bdca4d6a018b578e/aaaaaabbb.bbbb Lqeaa361f143ee4a0894bd168fd9b30c66/qf4ccf8f5435d4a78bdca4d6a018b578e/bbbbaaaa;
      // 25b: invokestatic qeaa361f143ee4a0894bd168fd9b30c66/qf4ccf8f5435d4a78bdca4d6a018b578e/aabbabbbb.abbbba (Lnet/minecraft/class_310;Lqeaa361f143ee4a0894bd168fd9b30c66/qf4ccf8f5435d4a78bdca4d6a018b578e/bbbbaaaa;)Z
      // 25e: ifne 262
      // 261: return
      // 262: aload 0
      // 263: aconst_null
      // 264: putfield qeaa361f143ee4a0894bd168fd9b30c66/qf4ccf8f5435d4a78bdca4d6a018b578e/aaaaaabbb.bbbb Lqeaa361f143ee4a0894bd168fd9b30c66/qf4ccf8f5435d4a78bdca4d6a018b578e/bbbbaaaa;
      // 267: aload 0
      // 268: bipush 1
      // 269: putfield qeaa361f143ee4a0894bd168fd9b30c66/qf4ccf8f5435d4a78bdca4d6a018b578e/aaaaaabbb.aab Z
      // 26c: aload 0
      // 26d: aload 1
      // 26e: aload 3
      // 26f: iload 2
      // 270: ifne 284
      // 273: invokevirtual qeaa361f143ee4a0894bd168fd9b30c66/qf4ccf8f5435d4a78bdca4d6a018b578e/aaaaaabbb.babb (Lnet/minecraft/class_310;Lnet/minecraft/class_2338;)Z
      // 276: ifeq 289
      // 279: goto 27d
      // 27c: athrow
      // 27d: aload 0
      // 27e: aload 1
      // 27f: aload 3
      // 280: goto 284
      // 283: athrow
      // 284: invokevirtual qeaa361f143ee4a0894bd168fd9b30c66/qf4ccf8f5435d4a78bdca4d6a018b578e/aaaaaabbb.bbab (Lnet/minecraft/class_310;Lnet/minecraft/class_2338;)Z
      // 287: pop
      // 288: return
      // 289: aload 1
      // 28a: aload 0
      // 28b: aload 3
      // 28c: invokevirtual qeaa361f143ee4a0894bd168fd9b30c66/qf4ccf8f5435d4a78bdca4d6a018b578e/aaaaaabbb.abab (Lnet/minecraft/class_2338;)Lnet/minecraft/class_243;
      // 28f: invokestatic qeaa361f143ee4a0894bd168fd9b30c66/qf4ccf8f5435d4a78bdca4d6a018b578e/bbabbbb.babaab (Lnet/minecraft/class_310;Lnet/minecraft/class_243;)[F
      // 292: astore 4
      // 294: iload 2
      // 295: ifne 2b5
      // 298: aload 4
      // 29a: ifnonnull 2a8
      // 29d: goto 2a1
      // 2a0: athrow
      // 2a1: aload 0
      // 2a2: aload 1
      // 2a3: invokevirtual qeaa361f143ee4a0894bd168fd9b30c66/qf4ccf8f5435d4a78bdca4d6a018b578e/aaaaaabbb.abbb (Lnet/minecraft/class_310;)V
      // 2a6: return
      // 2a7: athrow
      // 2a8: aload 0
      // 2a9: aload 1
      // 2aa: getfield net/minecraft/class_310.field_1724 Lnet/minecraft/class_746;
      // 2ad: getfield net/minecraft/class_746.field_6012 I
      // 2b0: bipush 1
      // 2b1: iadd
      // 2b2: putfield qeaa361f143ee4a0894bd168fd9b30c66/qf4ccf8f5435d4a78bdca4d6a018b578e/aaaaaabbb.aaba I
      // 2b5: aload 1
      // 2b6: ldc_w 67705475
      // 2b9: iload 6
      // 2bb: ldc_w 1585602646
      // 2be: ixor
      // 2bf: invokestatic qeaa361f143ee4a0894bd168fd9b30c66/qf4ccf8f5435d4a78bdca4d6a018b578e/aaaaaabbb.a (II)I
      // 2c2: ldc2_w 4000485411582078025
      // 2c5: invokestatic qeaa361f143ee4a0894bd168fd9b30c66/qf4ccf8f5435d4a78bdca4d6a018b578e/aaaaaabbb.baaa (IJ)I
      // 2c8: aload 4
      // 2ca: bipush 0
      // 2cb: faload
      // 2cc: aload 4
      // 2ce: bipush 1
      // 2cf: faload
      // 2d0: aload 0
      // 2d1: aload 1
      // 2d2: aload 3
      // 2d3: invokedynamic run (Lqeaa361f143ee4a0894bd168fd9b30c66/qf4ccf8f5435d4a78bdca4d6a018b578e/aaaaaabbb;Lnet/minecraft/class_310;Lnet/minecraft/class_2338;)Lqeaa361f143ee4a0894bd168fd9b30c66/qf4ccf8f5435d4a78bdca4d6a018b578e/aabbaabbb; bsm=java/lang/invoke/LambdaMetafactory.metafactory (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;Ljava/lang/invoke/MethodType;Ljava/lang/invoke/MethodHandle;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[ ()Z, qeaa361f143ee4a0894bd168fd9b30c66/qf4ccf8f5435d4a78bdca4d6a018b578e/aaaaaabbb.aa (Lnet/minecraft/class_310;Lnet/minecraft/class_2338;)Z, ()Z ]
      // 2d8: invokestatic qeaa361f143ee4a0894bd168fd9b30c66/qf4ccf8f5435d4a78bdca4d6a018b578e/bbabbbb.ba (Lnet/minecraft/class_310;IFFLqeaa361f143ee4a0894bd168fd9b30c66/qf4ccf8f5435d4a78bdca4d6a018b578e/aabbaabbb;)Z
      // 2db: istore 5
      // 2dd: iload 2
      // 2de: ifne 304
      // 2e1: iload 5
      // 2e3: ifne 31e
      // 2e6: goto 2ea
      // 2e9: athrow
      // 2ea: aload 0
      // 2eb: ldc_w 67705474
      // 2ee: iload 6
      // 2f0: ldc_w 1641264790
      // 2f3: ixor
      // 2f4: invokestatic qeaa361f143ee4a0894bd168fd9b30c66/qf4ccf8f5435d4a78bdca4d6a018b578e/aaaaaabbb.a (II)I
      // 2f7: ldc2_w 6402118672161460834
      // 2fa: invokestatic qeaa361f143ee4a0894bd168fd9b30c66/qf4ccf8f5435d4a78bdca4d6a018b578e/aaaaaabbb.baaa (IJ)I
      // 2fd: putfield qeaa361f143ee4a0894bd168fd9b30c66/qf4ccf8f5435d4a78bdca4d6a018b578e/aaaaaabbb.aaba I
      // 300: goto 304
      // 303: athrow
      // 304: aload 0
      // 305: invokestatic java/lang/System.currentTimeMillis ()J
      // 308: ldc_w 67705477
      // 30b: iload 6
      // 30d: ldc_w 82995451
      // 310: ixor
      // 311: invokestatic qeaa361f143ee4a0894bd168fd9b30c66/qf4ccf8f5435d4a78bdca4d6a018b578e/aaaaaabbb.a (II)I
      // 314: ldc2_w 5764858383757622107
      // 317: invokestatic qeaa361f143ee4a0894bd168fd9b30c66/qf4ccf8f5435d4a78bdca4d6a018b578e/aaaaaabbb.bbbb (IJ)J
      // 31a: ladd
      // 31b: putfield qeaa361f143ee4a0894bd168fd9b30c66/qf4ccf8f5435d4a78bdca4d6a018b578e/aaaaaabbb.aaab J
      // 31e: return
   }

   private void aabb(class_2338 var1, int var2) {
      this.baa = var1.method_10062();
      this.aaaba = var2;
      this.bbaa = -1;
      this.aab = false;
      this.bbbb = null;
      this.aaabb = 0;
      this.aaba = baaa(a(67705476, -967332759 ^ -1964767457), 6402118672161460834L);
      this.aabaa = baaa(a(67705479, -967332759 ^ -1611018404), 6402118672161460834L);
      this.baab = false;
      this.aaab = System.currentTimeMillis() + this.bb(this.aaa);
   }

   private int abaa(class_1657 var1) {
      return this.abb(var1, class_1802.field_8069);
   }

   // $VF: Irreducible bytecode was duplicated to produce valid code
   static {
      int var39 = -1343474068;
      int var33 = 0;
      int var32 = 0;
      int var30 = "\u0081ᗤꉺڻ틯朗팋障볂惧鳼貄宭\uda42\uaafb쐗㮏蒘봻歋裂\udab8瘉䮜鞨巩툆\ueb84ʊ\uebad푈燘\uf45b\uf794胀蠯㲀倂꼠\ue093\u2ddf\uf82e⬛멏昛ᜨ읂惷쵰渌ᦙ虪崌쇰遷㦻돵摩趏翸\ue46fု\ude2b\ue680瘁垇䳿ꗙᥕ㸹浾䟹츩䢶괒掠勌\udde2\u139e윲픆甥\u20f6籰⚝ఐ⌾里Ȟ彅ꍿႰ팫\uf201駆\ue3cf㩹䭓\udee9闒枊\uddf1\uf750\uf7b5夨耡แ㑕쳭푛\u0cd3挜戛諾\ude07᪉燚圏뗠뇆ț惗꾶ང⺑\u12c7뉬\uf543䤹\ue36e\u0015꙳쌕箍\ue6b4焊溶檣⻄渌\ue303떾촂\ueaa7㭛ⷭﲞ맭贃㢝᮰鑳¨稉ឩ紕ퟜ砙ដ笭鞏碅埕磅ញ竵ឭ碭域緍垼綉垓硵鞄磅ឯ綍្篹垡筵垾綩힁窅垬竹鞮紹힅窽垁穥垃緥ឮ筱鞨穥힃砹ퟗ稕鞸稡型碥埞緽ퟕ篱ឆ笩鞨穝ឧ硡힏碝\ud7ab硕型硽\ud7a7筍ុ窅鞸砉អ磕ូ砝ឯ綑鞀紁ឪ稱垹磝힋稩ហ砭័笹韞碕ힰ篵垭綉\ud7ad笑힁竽鞲砭鞎箽韐緅៛碥្硱垰窉鞵緁힏硽ហ窅ힱ築型砹ힿ緕៑笝ퟖ硩៝磝韐砵ឪ緩垁綹垪碅ខ硍鞶笉鞾緹鞢笙ힼ碑៚穩鞽維ឨ緹ퟓ砉ퟛ砝垊竑韓篵垡\n欝嚶歵횈棙隍棭획梍횏\u0010謈袽蠄ࢠ詴䢰趬䢽趴袱行䢿趸袱贀䢇\n庈\u05ed庀蔑兌씔典蔔儘蔖X譴ࢯ趄袻趠裛贠ࢆ衈ࢣ衘ࢢ詀袽蠴좼謐䢁贸袲评䣞計ࢾ裴袮袬좤詄좡謈袢衜ࢊ誤袀詄좆贜ࢎ讜ࢻ謐ࣚ誜袄訸裞蠬䢉誼䣞诨죗袴袨诨좍袔䣝许좼跄䣞诠ࣝ袴袻衤좪謸ࢠ衜ࢽ趴ࢢ赬裙譌䢎衈ࣛ褴袌誘ࢆ跰࢈\n쎸఼쎐谂쁼찇쁈谇쀨谅\u0010䢠ҩ䵀쒄䪜蒎䭰ӝ䬜蒵䭬쒵䩜Ә䵜蒈\n순䰦쉴챘엘豝여챝얌챟"
         .length();
      String[] var31 = new String[10];
      String var29 = "\u0081ᗤꉺڻ틯朗팋障볂惧鳼貄宭\uda42\uaafb쐗㮏蒘봻歋裂\udab8瘉䮜鞨巩툆\ueb84ʊ\uebad푈燘\uf45b\uf794胀蠯㲀倂꼠\ue093\u2ddf\uf82e⬛멏昛ᜨ읂惷쵰渌ᦙ虪崌쇰遷㦻돵摩趏翸\ue46fု\ude2b\ue680瘁垇䳿ꗙᥕ㸹浾䟹츩䢶괒掠勌\udde2\u139e윲픆甥\u20f6籰⚝ఐ⌾里Ȟ彅ꍿႰ팫\uf201駆\ue3cf㩹䭓\udee9闒枊\uddf1\uf750\uf7b5夨耡แ㑕쳭푛\u0cd3挜戛諾\ude07᪉燚圏뗠뇆ț惗꾶ང⺑\u12c7뉬\uf543䤹\ue36e\u0015꙳쌕箍\ue6b4焊溶檣⻄渌\ue303떾촂\ueaa7㭛ⷭﲞ맭贃㢝᮰鑳¨稉ឩ紕ퟜ砙ដ笭鞏碅埕磅ញ竵ឭ碭域緍垼綉垓硵鞄磅ឯ綍្篹垡筵垾綩힁窅垬竹鞮紹힅窽垁穥垃緥ឮ筱鞨穥힃砹ퟗ稕鞸稡型碥埞緽ퟕ篱ឆ笩鞨穝ឧ硡힏碝\ud7ab硕型硽\ud7a7筍ុ窅鞸砉អ磕ូ砝ឯ綑鞀紁ឪ稱垹磝힋稩ហ砭័笹韞碕ힰ篵垭綉\ud7ad笑힁竽鞲砭鞎箽韐緅៛碥្硱垰窉鞵緁힏硽ហ窅ힱ築型砹ힿ緕៑笝ퟖ硩៝磝韐砵ឪ緩垁綹垪碅ខ硍鞶笉鞾緹鞢笙ힼ碑៚穩鞽維ឨ緹ퟓ砉ퟛ砝垊竑韓篵垡\n欝嚶歵횈棙隍棭획梍횏\u0010謈袽蠄ࢠ詴䢰趬䢽趴袱行䢿趸袱贀䢇\n庈\u05ed庀蔑兌씔典蔔儘蔖X譴ࢯ趄袻趠裛贠ࢆ衈ࢣ衘ࢢ詀袽蠴좼謐䢁贸袲评䣞計ࢾ裴袮袬좤詄좡謈袢衜ࢊ誤袀詄좆贜ࢎ讜ࢻ謐ࣚ誜袄訸裞蠬䢉誼䣞诨죗袴袨诨좍袔䣝许좼跄䣞诠ࣝ袴袻衤좪謸ࢠ衜ࢽ趴ࢢ赬裙譌䢎衈ࣛ褴袌誘ࢆ跰࢈\n쎸఼쎐谂쁼찇쁈谇쀨谅\u0010䢠ҩ䵀쒄䪜蒎䭰ӝ䬜蒵䭬쒵䩜Ә䵜蒈\n순䰦쉴챘엘豝여챝얌챟";
      short var34 = 28275;

      do {
         int var37 = 0;
         char var35 = var29.charAt(var33);
         char[] var36 = var29.substring(var33 + 1, var33 + 1 + var35).toCharArray();

         do {
            char var38 = var36[var37];
            if (var37 % 2 == 0) {
               var36[var37] = (char)((var38 >>> 2 | var38 << 14) & 65535 ^ var34);
            } else {
               var36[var37] = (char)((var38 << 2 | var38 >>> 14) & 65535 ^ var34);
            }
         } while (++var37 < var36.length);

         var31[var32] = new String(var36);
         var32++;
         var33 = var33 + var35 + 1;
      } while (var33 < var30);

      aabba = var31;
      aabbb = new Object[var31.length];
      int var25 = 1442995136;
      byte[] var23 = "Jª\u0016_\u008a\u009ak\u009bB\u0095]\u0011&}D®ç¸\r¾F®\u000b¤ìp\u0084i\u0010=\u0083\u0091Æ\u001cTZÆÆØn\u008c\u008b\u0003\t³ÚdrÖú\u0093ø\u001e¸è\u0081\u000b¥ Á*\u0005«.\u0016\u0084+¤Þgu<QôÀ¢m\u008eÔlõR\u000bîÉÿ\\\u0007>Úõy\u0095>¡J\u001a\u001dÉDPâÆDbªt\u0018î\u00938·+FAØæ=Âúøå\u0010yû¬gyû\u0084\u008døî\u00894\u0007\u0085\u008eÿ,@\u0097¦?1K\u0098\u001b\"²\u00ad=hdÕ;p\u0097áêr> $m\u0006\u0005\u0084\u0093\u001fWß#¿i\u0083Ï¸\u0097\u0013(ä§\u0099k7Su~\u00ad\u0085þÎ£²ç*!WG\u000eïW\u008eíÍ×\u0084\u001a>I¦M6#\u001edø¿ß\nªÍ©à Û\u0017IÙÏV_8\u000fÙh'þÁ<hÜ+\u0016\u0095D\u009e]\u0006±hvRÜ\u0081 Ú\u001dâ¿\u001ee0¯)¯ªß\u009bmkÖýUèC\u0010gã³Ò\u0014ï\u0015Ñ\rõ&+÷,}\u008fõ\u0001¢xv\u0011\u001b°íxø5\u000eE¿\u0017r\u009bô¹N¼m\u008eh\r ¸1\u0006¡\u009c}²\u001cY¼\u001aÁÊw8h\b\u0087\u0090a»\u009b+\u0099\u0085\u001bA\u008b\u0093[ì\u001f\u0083¬ÒÖ\u0007ö0b\\\u0095\u008c´à¢ò>hÌí\u0089Â¡Ð\u0089\u0090ÅN\u0096\u0081y¬\u0007ë\u0094NÏ\u0097M!ö³®\u0097>\u009aÀ\rif\u0084åó8\u0017Jß,\u001f=øW \"]ã\u0084tFÞ\u0097X\fÒ=g³(\u0092ØwVo¯áQ«Ä\u0088\u0094è°N5u\u0007s²ÐÇ\u0012\fØ#Í\u0011\u0018\u0089ÚdP\u001cÁÐåvZYbÜ(Ñðìn´¤ \u0001È^ÝM}ç³x\u00946\u0097ëK[\u001a¸\f\u009fy\u008e´ÛÏÙì\u009cpç\u001f!W\u008a\u0088ý®\u009e\u0011`¤5\u008a6ÏÆT÷ß\u008eÀ'W\u0083þà\u009a\u009eéÌ\u008e-;ä©\u0081¦Ð¹\u00ad\u000bíÈ©[\u009cUY©Dvç§õ{¸\u008e¹;è\u008c_3»¨9Z)y\u001fæ*\u0098býLñ+bù\u0090±\u008dxP×\t\u000bG\u0019V³9é\u0084l\u0090©pµt`UöJ\u008eÖ8'\u0095U°¬m\u0084 \u0091\u0018\u0091*\u0092è÷sÖ\u0002Þ´q5¤<4¾îb\u001c\u001a\u0000Ê)êõ\u0019â\u0000íGÚÊ\u001f¤Ô*\u009bn,Ð»¡ ´\u008c\u0003°q? þ\u0089@¶JÐ*fÙ<¡/3~¿Ò\u0005Î®HþbbÝÈGà\u009b©\u000bí\u0090R\u0095ú\u0002\u0083£Ò\u008c~j?¹\u009fMÀ\u0089\u009dn-Êö¬T\u0097#r\u001dôþ\u007f? +\u0006\u00ad}yÑZe\u009bg·\u0003¹\u0096R\u0019ß\u008fÊàT:äå\u0086Ó¶\u0098\u008cÙ\u009eé\u0092\u008e^t£}oi)¶\u0086\u0092Cð¾\t\u0014±Pí-\u0083\u0000jB²{\u0019\f*j/¬ì3\u0097¾\u008e¸~..É°¦@°Ø\"\u0019:\u0096E{N¿ºU/B^'\u0003\u007f¹ÎáVëÐ õ\u009e~¸tàÆ)Én\u0011 ÝDEâ\u0007>If\u0014\u001cõD\u0002G=%\u009d<É\u000bé\u0086S\u009eÝÏuI\u0093\u0015M\u007fí·ÚO\tÞbG'Õ2`õ\u0084EúBûT¦ùCçÛ|ø#è\u001eN\u0098p[ª\n\n\u0017\u0013¼#\u0013îXOi\u0098b²îM\u001bö\u0089§a@rØ\u0080\u0086¯?Ò³³£\u0007NæN\u0090K[-x\b5\u000fÈY\u0084h\u008fù\u0000º\u001f9û;\u0081\u008bj\u0089H;\u0010õRi\u009c.P=.Z§aDÕëzÑéJ~\u0003KÏ%_&'å]\u0088ð²¿ÞÙ \u0087D\fHñ\u0003}\u001c\"\u0015,j\u0004æ*ÜÝz3.'Àº\u0080-~ë\u0088f8%<\u001eïhG°0IüÚ\u00073C³Ìâú\"Ý´`ªbì¯GeøC¨)¹J\\©\u009fVªe\u001azþ^6\u0090\u0094\u007f]\u0096á\t\bä³r¿ª\u0081B!ËQÛFÈ\u0094BlÐBV\u0018\u0081\u0089F,/Å\u0096[m^?C¥\u0016\u000eòÑÃwÍaji\u0097ãú\u0003F\u001e\u001cxw»\u001b©\u0017<¨P\u0098Ã&s\u0082\rfP\u0000ÚyíP\u0080Ë\u000föÇ·[e<\u0019a\u0013\u001añ\u001e\u0090ôü\u0004\u0087^¨Q\näädìU%\fy\u0092>@Ü´Ê<°\u0000¹\u0011mà\u001d\\Óö\u0016¬VÓ\u008fÎæ[h-pò>\u001bno`\u008c×\u009d½\u001fa\u009dþVSA\u0088~ø~%\u0089\u001dòÞGõGâ\bÌâÉ\u0005=\u001eUc´\u009cÇ\u0081\u0014V\u009fÑ\u0085pÀ\r>9bì©¢\u0003d\u001f\u008e³\u0082J4]Pg®!«\u0080\u0095è\u0004§sÕÓ¤Àj¢s©«\u0017¦£Éß£áÝÊ\u0014Nôøs\u0089\u0092Ç\u0012XóäF\u0012Å%\u0088+LªNà\u0019ðdÏÍ.²\u0083¤Ù\u000eVÞ\u0080\u008f \u0006\u0083Qmm\u009eg\u008c3tò\u009e\u000b\u0000\u0085Ì\u009bÌ¡fÕ`u\u0089\u0004\",\tÁ#5 \u000e[LüÁ-Ä\u001e´/T\u008doE¶©søê\u0016N\\\u0013\\\u008b\u008b\u0080\u0086\u0086b\f-YÚögg»%É,\u000eà\u001feÿóLI$\u0083,\\\u0088\u0013\u0012Uäe\u0011\u009d\u0003V\u0012ô\u0000\u000b\f\u009d²Ñ¿onÛP·\u0098\u000b[^Ä¢\u009d^Â\u001eåÙ\u0004íÏ;W\u0090\u0080MM¯È\r³é5\u009f¾ö\u0095\n«Ç¶!¤@\tÕpA3"
         .getBytes("ISO-8859-1");
      int var24 = var23.length / 4;
      aabab = new int[var24];
      byte var26 = 0;
      int var27 = 0;

      do {
         int var28 = (var23[var26] & 255) << 24 | (var23[var26 + 1] & 255) << 16 | (var23[var26 + 2] & 255) << 8 | var23[var26 + 3] & 255;
         var28 ^= var25;
         aabab[var27] = var28;
         var26 += 4;
      } while (++var27 < var24);

      String[] var21 = new String[a(67705498, var39 ^ -1872125647)];
      int var19 = 0;
      String var18;
      int var20 = (var18 = abaaa(var39 ^ -1405804137, 44947, '畣')).length();
      int var17 = a(67705501, var39 ^ 146112180);
      int var43 = -1;

      label128:
      while (true) {
         String var10000 = var18.substring(++var43, var43 + var17);
         int var10001 = -1;

         while (true) {
            char[] var72;
            label123: {
               char[] var53 = var10000.toCharArray();
               int var10003 = var53.length;
               int var22 = 0;
               var72 = var53;
               var10001 = var10003;
               char[] var88;
               int var10004;
               if (var10003 <= 1) {
                  var88 = var53;
                  var10004 = var22;
               } else {
                  var72 = var53;
                  var10001 = var10003;
                  if (var10003 <= var22) {
                     break label123;
                  }

                  var88 = var53;
                  var10004 = var22;
               }

               while (true) {
                  var88[var10004] = (char)(var88[var10004] ^ switch (var22 % a(67705503, var39 ^ -1019379658)) {
                     case 0 -> a(67705502, var39 ^ 1759106462);
                     case 1 -> a(67705489, var39 ^ -402998257);
                     case 2 -> a(67705488, var39 ^ -1392132620);
                     case 3 -> a(67705491, var39 ^ -1622339687);
                     case 4 -> a(67705490, var39 ^ 326386490);
                     case 5 -> a(67705493, var39 ^ -694076852);
                     default -> a(67705492, var39 ^ 467318718);
                  });
                  var22++;
                  if (var10001 == 0) {
                     var10004 = var10001;
                     var88 = var72;
                  } else {
                     if (var10001 <= var22) {
                        break;
                     }

                     var88 = var72;
                     var10004 = var22;
                  }
               }
            }

            String var95 = new String(var72).intern();
            switch (var10001) {
               case 0:
                  var21[var19++] = var95;
                  if ((var43 += var17) >= var20) {
                     bba = var21;
                     aba = new String[a(67705500, var39 ^ 873998684)];
                     long var8 = 4190258307341455089L;
                     long[] var14 = new long[a(67705495, var39 ^ 84044750)];
                     int var11 = 0;
                     String var12;
                     int var13 = (var12 = abaaa(var39 ^ 1379039153, 61233, '畡')).length();
                     byte var10 = 0;

                     label102:
                     while (true) {
                        int var60 = var10;
                        var10 += 8;
                        var10000 = var12.substring(var60, var10);
                        var60 = var39 ^ -1553188136;
                        short var78 = 8949;
                        short var96 = 30048;
                        byte[] var15 = var10000.getBytes("ISO-8859-1");
                        long[] var47 = var14;
                        var60 = var11++;
                        long var79 = (var15[0] & 255L) << a(67705494, var39 ^ 105585880)
                           | (var15[1] & 255L) << a(67705513, var39 ^ 107214414)
                           | (var15[2] & 255L) << a(67705512, var39 ^ 325996424)
                           | (var15[3] & 255L) << a(67705515, var39 ^ 2020181128)
                           | (var15[4] & 255L) << a(67705514, var39 ^ -1116679358)
                           | (var15[5] & 255L) << a(67705517, var39 ^ -861084791)
                           | (var15[a(67705516, var39 ^ -548022208)] & 255L) << a(67705519, var39 ^ -1786535853)
                           | var15[a(67705518, var39 ^ -1922001772)] & 255L;
                        byte var97 = -1;

                        while (true) {
                           long var105 = var79 ^ var8;
                           switch (var97) {
                              case 0:
                                 var47[var60] = var105;
                                 if (var10 >= var13) {
                                    aaaa = var14;
                                    bbb = new Integer[a(67705528, var39 ^ -674878241)];
                                    aa = baaa(a(67705531, var39 ^ -217500526), 5514359299725430257L);
                                    bbba = baaa(a(67705530, var39 ^ 271214920), 4369275086051469829L);
                                    long var0 = 2499697332374911789L;
                                    long[] var6 = new long[a(67705533, var39 ^ -405193535)];
                                    int var3 = 0;
                                    String var4;
                                    int var5 = (var4 = abaaa(var39 ^ -502244605, 31719, '略')).length();
                                    byte var2 = 0;

                                    label92:
                                    while (true) {
                                       int var65 = var2;
                                       var2 += 8;
                                       var10000 = var4.substring(var65, var2);
                                       var65 = var39 ^ 1861773321;
                                       char var82 = '蕈';
                                       short var100 = 30052;
                                       byte[] var7 = var10000.getBytes("ISO-8859-1");
                                       long[] var50 = var6;
                                       var65 = var3++;
                                       long var83 = (var7[0] & 255L) << a(67705532, var39 ^ -1328457579)
                                          | (var7[1] & 255L) << a(67705535, var39 ^ -1725971329)
                                          | (var7[2] & 255L) << a(67705534, var39 ^ -145902032)
                                          | (var7[3] & 255L) << a(67705521, var39 ^ 499622057)
                                          | (var7[4] & 255L) << a(67705520, var39 ^ -1270957519)
                                          | (var7[5] & 255L) << a(67705523, var39 ^ -1562413995)
                                          | (var7[a(67705522, var39 ^ -1782543454)] & 255L) << a(67705525, var39 ^ -1047549607)
                                          | var7[a(67705524, var39 ^ -344837638)] & 255L;
                                       byte var101 = -1;

                                       while (true) {
                                          var105 = var83 ^ var0;
                                          switch (var101) {
                                             case 0:
                                                var50[var65] = var105;
                                                if (var2 >= var5) {
                                                   abb = var6;
                                                   abbb = new Long[a(67705550, var39 ^ -399083295)];
                                                   ba = bbbb(a(67705537, var39 ^ -607270532), 6195959232421502019L);
                                                   abaa = new String[baaa(a(67705536, var39 ^ -2140559876), 160533098856857445L)];
                                                   abba();
                                                   abab = aabbaaaba.abba(
                                                      abaa[baaa(a(67705539, var39 ^ 1604198099), 4592459825262200685L)]
                                                   );
                                                   return;
                                                }
                                                break;
                                             default:
                                                var50[var65] = var105;
                                                if (var2 < var5) {
                                                   continue label92;
                                                }

                                                var5 = (var4 = abaaa(var39 ^ -528845404, 10569, '畫')).length();
                                                var2 = 0;
                                          }

                                          int var68 = var2;
                                          var2 += 8;
                                          var10000 = var4.substring(var68, var2);
                                          var68 = var39 ^ -1796199489;
                                          short var85 = 32681;
                                          short var103 = 30058;
                                          var7 = var10000.getBytes("ISO-8859-1");
                                          var50 = var6;
                                          var65 = var3++;
                                          var83 = (var7[0] & 255L) << a(67705527, var39 ^ -1595815192)
                                             | (var7[1] & 255L) << a(67705526, var39 ^ -1951029464)
                                             | (var7[2] & 255L) << a(67705545, var39 ^ 1564304908)
                                             | (var7[3] & 255L) << a(67705544, var39 ^ 1123622647)
                                             | (var7[4] & 255L) << a(67705547, var39 ^ 1389288118)
                                             | (var7[5] & 255L) << a(67705546, var39 ^ 578557598)
                                             | (var7[a(67705549, var39 ^ 723132660)] & 255L) << a(67705548, var39 ^ -1091104024)
                                             | var7[a(67705551, var39 ^ 1312121328)] & 255L;
                                          var101 = 0;
                                       }
                                    }
                                 }
                                 break;
                              default:
                                 var47[var60] = var105;
                                 if (var10 < var13) {
                                    continue label102;
                                 }

                                 var13 = (var12 = abaaa(var39 ^ 1717003206, 65481, '畧')).length();
                                 var10 = 0;
                           }

                           int var63 = var10;
                           var10 += 8;
                           var10000 = var12.substring(var63, var10);
                           var63 = var39 ^ -336761911;
                           short var81 = 11665;
                           short var99 = 30054;
                           var15 = var10000.getBytes("ISO-8859-1");
                           var47 = var14;
                           var60 = var11++;
                           var79 = (var15[0] & 255L) << a(67705505, var39 ^ -1881547854)
                              | (var15[1] & 255L) << a(67705504, var39 ^ -1864270277)
                              | (var15[2] & 255L) << a(67705507, var39 ^ 1861758043)
                              | (var15[3] & 255L) << a(67705506, var39 ^ -564653522)
                              | (var15[4] & 255L) << a(67705509, var39 ^ 845144673)
                              | (var15[5] & 255L) << a(67705508, var39 ^ -721167358)
                              | (var15[a(67705511, var39 ^ -1764743677)] & 255L) << a(67705510, var39 ^ -2092240737)
                              | var15[a(67705529, var39 ^ 860145550)] & 255L;
                           var97 = 0;
                        }
                     }
                  }

                  var17 = var18.charAt(var43);
                  break;
               default:
                  var21[var19++] = var95;
                  if ((var43 += var17) < var20) {
                     var17 = var18.charAt(var43);
                     continue label128;
                  }

                  var20 = (var18 = abaaa(var39 ^ -447386641, 39696, '畢')).length();
                  var17 = 4;
                  var43 = -1;
            }

            var10000 = var18.substring(++var43, var43 + var17);
            var10001 = 0;
         }
      }
   }

   private class_243 abab(class_2338 var1) {
      return class_243.method_24955(var1).method_1031(0.0, 0.125, 0.0);
   }

   public aaaaaabbb() {
      super(
         aabbaaaba.aaab(abaa[0]),
         bbaabbba.aa,
         aabbaaaba.aaab(abaa[3])
      );
      this.aaaab = (aaabbbab)this.abbbaaa(
         new aaabbbab(aabbaaaba.aaab(abaa[2]), 0.0, 0.0, 0.0, 300.0, 5.0)
            .aaa(aabbaaaba.abba(abaa[4]))
      );
      this.aaa = (aaabbbab)this.abbbaaa(
         new aaabbbab(aabbaaaba.aaab(abaa[1]), 0.0, 0.0, 0.0, 300.0, 5.0)
            .aaa(aabbaaaba.abba(abaa[4]))
      );
      this.bab = (abbaaaaa)this.abbbaaa(
         new abbaaaaa(aabbaaaba.aaab(abaa[5]), true)
      );
      this.baba = baaa(a(67705478, -1271089202 ^ -869114091), 6402118672161460834L);
      this.bbab = bbbb(a(67705497, -1271089202 ^ -256703570), 4702402917048699051L);
      this.aaaaa = -1;
      this.aaaba = -1;
      this.bbaa = -1;
      this.aaba = baaa(a(67705496, -1271089202 ^ 944800025), 6402118672161460834L);
      this.aabaa = baaa(a(67705499, -1271089202 ^ -1211943804), 6402118672161460834L);
   }

   private static void abba() {
      int var0 = -1763224033;
      abaa[0] = aabab(
         b(a(67705538, var0 ^ -547569342), a(67705541, var0 ^ -1020879142)).toCharArray(),
         bbbb(a(67705540, var0 ^ 2080072045), 5330426769957530609L),
         baaa(a(67705543, var0 ^ 810917200), 98226278250210600L)
      );
      abaa[1] = aabab(
         b(a(67705542, var0 ^ -1453177848), a(67705561, var0 ^ -464233052)).toCharArray(),
         bbbb(a(67705560, var0 ^ 1701884060), 2702333456599307558L),
         baaa(a(67705563, var0 ^ -659207107), 2071987840271808752L)
      );
      abaa[2] = aabab(
         b(a(67705562, var0 ^ 86399776), a(67705565, var0 ^ 1394286460)).toCharArray(),
         bbbb(a(67705564, var0 ^ -1521011048), 5773829771874333899L),
         baaa(a(67705567, var0 ^ 1567166284), 1848945387989523655L)
      );
      abaa[3] = aabab(
         b(a(67705566, var0 ^ 1333753799), a(67705553, var0 ^ -613449112)).toCharArray(),
         bbbb(a(67705552, var0 ^ 317378270), 4100524041257959164L),
         baaa(a(67705555, var0 ^ -1498380403), 3039699206122350284L)
      );
      abaa[4] = aabab(
         b(a(67705554, var0 ^ 1879871191), a(67705557, var0 ^ -91952000)).toCharArray(),
         bbbb(a(67705556, var0 ^ 1294884328), 4479045834800495161L),
         baaa(a(67705559, var0 ^ 1300089929), 914652170087991266L)
      );
      abaa[5] = aabab(
         b(a(67705558, var0 ^ 1382897036), a(67705577, var0 ^ -1022887128)).toCharArray(),
         bbbb(a(67705576, var0 ^ 192657819), 781686044019916181L),
         baaa(a(67705579, var0 ^ 845104299), 1684239088176148043L)
      );
      abaa[baaa(a(67705578, var0 ^ -92873705), 446316450096305305L)] = aabab(
         b(a(67705581, var0 ^ -1383421703), a(67705580, var0 ^ 936653564)).toCharArray(),
         bbbb(a(67705583, var0 ^ 465653083), 6172188333443387749L),
         baaa(a(67705582, var0 ^ 1018833004), 5744259476869152982L)
      );
      abaa[baaa(a(67705569, var0 ^ -1727060448), 3782231648807022514L)] = aabab(
         b(a(67705568, var0 ^ -2110604476), a(67705571, var0 ^ -935444154)).toCharArray(),
         bbbb(a(67705570, var0 ^ 2009348241), 7163818022251358589L),
         baaa(a(67705573, var0 ^ -1279606405), 6641982346413931067L)
      );
   }

   private void abbb(class_310 param1) {
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
      // 05: dup
      // 06: getfield qeaa361f143ee4a0894bd168fd9b30c66/qf4ccf8f5435d4a78bdca4d6a018b578e/aaaaaabbb.aaabb I
      // 09: bipush 1
      // 0a: iadd
      // 0b: putfield qeaa361f143ee4a0894bd168fd9b30c66/qf4ccf8f5435d4a78bdca4d6a018b578e/aaaaaabbb.aaabb I
      // 0e: iload 2
      // 0f: ifne 52
      // 12: aload 0
      // 13: getfield qeaa361f143ee4a0894bd168fd9b30c66/qf4ccf8f5435d4a78bdca4d6a018b578e/aaaaaabbb.aaabb I
      // 16: ldc_w 67705572
      // 19: ldc_w -1836284796
      // 1c: ldc_w 567755571
      // 1f: ixor
      // 20: invokestatic qeaa361f143ee4a0894bd168fd9b30c66/qf4ccf8f5435d4a78bdca4d6a018b578e/aaaaaabbb.a (II)I
      // 23: ldc2_w 4918746544258299788
      // 26: invokestatic qeaa361f143ee4a0894bd168fd9b30c66/qf4ccf8f5435d4a78bdca4d6a018b578e/aaaaaabbb.baaa (IJ)I
      // 29: if_icmple 37
      // 2c: goto 30
      // 2f: athrow
      // 30: aload 0
      // 31: aload 1
      // 32: invokevirtual qeaa361f143ee4a0894bd168fd9b30c66/qf4ccf8f5435d4a78bdca4d6a018b578e/aaaaaabbb.baab (Lnet/minecraft/class_310;)V
      // 35: return
      // 36: athrow
      // 37: aload 0
      // 38: invokestatic java/lang/System.currentTimeMillis ()J
      // 3b: ldc_w 67705575
      // 3e: ldc_w -1836284796
      // 41: ldc_w 1209140800
      // 44: ixor
      // 45: invokestatic qeaa361f143ee4a0894bd168fd9b30c66/qf4ccf8f5435d4a78bdca4d6a018b578e/aaaaaabbb.a (II)I
      // 48: ldc2_w 5764858383757622107
      // 4b: invokestatic qeaa361f143ee4a0894bd168fd9b30c66/qf4ccf8f5435d4a78bdca4d6a018b578e/aaaaaabbb.bbbb (IJ)J
      // 4e: ladd
      // 4f: putfield qeaa361f143ee4a0894bd168fd9b30c66/qf4ccf8f5435d4a78bdca4d6a018b578e/aaaaaabbb.aaab J
      // 52: return
   }

   private static int baaa(int var0, long var1) {
      int var3 = var0 ^ (int)(var1 & 32767L) ^ a(67705574, -1140006806 ^ -1607218274);
      if (bbb[var3] == null) {
         bbb[var3] = (int)(aaaa[var3] ^ var1);
      }

      return bbb[var3];
   }

   private void baab(class_310 param1) {
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
      // 06: ifne 7c
      // 09: getfield qeaa361f143ee4a0894bd168fd9b30c66/qf4ccf8f5435d4a78bdca4d6a018b578e/aaaaaabbb.bab Lqeaa361f143ee4a0894bd168fd9b30c66/qf4ccf8f5435d4a78bdca4d6a018b578e/abbaaaaa;
      // 0c: invokevirtual qeaa361f143ee4a0894bd168fd9b30c66/qf4ccf8f5435d4a78bdca4d6a018b578e/abbaaaaa.abbb ()Ljava/lang/Object;
      // 0f: checkcast java/lang/Boolean
      // 12: invokevirtual java/lang/Boolean.booleanValue ()Z
      // 15: ifeq 7b
      // 18: goto 1c
      // 1b: athrow
      // 1c: aload 0
      // 1d: iload 2
      // 1e: ifne 7c
      // 21: goto 25
      // 24: athrow
      // 25: getfield qeaa361f143ee4a0894bd168fd9b30c66/qf4ccf8f5435d4a78bdca4d6a018b578e/aaaaaabbb.aaaba I
      // 28: iflt 7b
      // 2b: goto 2f
      // 2e: athrow
      // 2f: aload 0
      // 30: iload 2
      // 31: ifne 7c
      // 34: goto 38
      // 37: athrow
      // 38: getfield qeaa361f143ee4a0894bd168fd9b30c66/qf4ccf8f5435d4a78bdca4d6a018b578e/aaaaaabbb.aaaba I
      // 3b: ldc_w 67705593
      // 3e: ldc_w -453935804
      // 41: ldc_w -985010028
      // 44: ixor
      // 45: invokestatic qeaa361f143ee4a0894bd168fd9b30c66/qf4ccf8f5435d4a78bdca4d6a018b578e/aaaaaabbb.a (II)I
      // 48: ldc2_w 117178773667972595
      // 4b: invokestatic qeaa361f143ee4a0894bd168fd9b30c66/qf4ccf8f5435d4a78bdca4d6a018b578e/aaaaaabbb.baaa (IJ)I
      // 4e: if_icmpge 7b
      // 51: goto 55
      // 54: athrow
      // 55: aload 0
      // 56: iload 2
      // 57: ifne 7c
      // 5a: goto 5e
      // 5d: athrow
      // 5e: getfield qeaa361f143ee4a0894bd168fd9b30c66/qf4ccf8f5435d4a78bdca4d6a018b578e/aaaaaabbb.aaaba I
      // 61: aload 0
      // 62: getfield qeaa361f143ee4a0894bd168fd9b30c66/qf4ccf8f5435d4a78bdca4d6a018b578e/aaaaaabbb.bbaa I
      // 65: if_icmpeq 7b
      // 68: goto 6c
      // 6b: athrow
      // 6c: aload 0
      // 6d: aload 1
      // 6e: getfield net/minecraft/class_310.field_1724 Lnet/minecraft/class_746;
      // 71: getfield net/minecraft/class_746.field_6012 I
      // 74: bipush 1
      // 75: iadd
      // 76: putfield qeaa361f143ee4a0894bd168fd9b30c66/qf4ccf8f5435d4a78bdca4d6a018b578e/aaaaaabbb.aabaa I
      // 79: return
      // 7a: athrow
      // 7b: aload 0
      // 7c: invokevirtual qeaa361f143ee4a0894bd168fd9b30c66/qf4ccf8f5435d4a78bdca4d6a018b578e/aaaaaabbb.aaabb ()V
      // 7f: return
   }

   @Override
   public void abbbab(JsonObject var1) {
      super.abbbab(var1);
      this.bbabaaa(var1, abab, new aaabbbab[]{this.aaaab, this.aaa});
   }

   private boolean baba(class_2680 param1) {
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
      // 09: ifnull 68
      // 0c: goto 10
      // 0f: athrow
      // 10: aload 1
      // 11: getstatic net/minecraft/class_2246.field_10167 Lnet/minecraft/class_2248;
      // 14: invokevirtual net/minecraft/class_2680.method_27852 (Lnet/minecraft/class_2248;)Z
      // 17: iload 2
      // 18: ifne 65
      // 1b: ifne 64
      // 1e: goto 22
      // 21: athrow
      // 22: aload 1
      // 23: getstatic net/minecraft/class_2246.field_10425 Lnet/minecraft/class_2248;
      // 26: invokevirtual net/minecraft/class_2680.method_27852 (Lnet/minecraft/class_2248;)Z
      // 29: iload 2
      // 2a: ifne 65
      // 2d: goto 31
      // 30: athrow
      // 31: ifne 64
      // 34: goto 38
      // 37: athrow
      // 38: aload 1
      // 39: getstatic net/minecraft/class_2246.field_10025 Lnet/minecraft/class_2248;
      // 3c: invokevirtual net/minecraft/class_2680.method_27852 (Lnet/minecraft/class_2248;)Z
      // 3f: iload 2
      // 40: ifne 65
      // 43: goto 47
      // 46: athrow
      // 47: ifne 64
      // 4a: goto 4e
      // 4d: athrow
      // 4e: aload 1
      // 4f: getstatic net/minecraft/class_2246.field_10546 Lnet/minecraft/class_2248;
      // 52: invokevirtual net/minecraft/class_2680.method_27852 (Lnet/minecraft/class_2248;)Z
      // 55: iload 2
      // 56: ifne 65
      // 59: goto 5d
      // 5c: athrow
      // 5d: ifeq 68
      // 60: goto 64
      // 63: athrow
      // 64: bipush 1
      // 65: goto 69
      // 68: bipush 0
      // 69: ireturn
   }

   private boolean babb(class_310 param1, class_2338 param2) {
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
      // 05: aload 1
      // 06: invokevirtual qeaa361f143ee4a0894bd168fd9b30c66/qf4ccf8f5435d4a78bdca4d6a018b578e/aaaaaabbb.aba (Lnet/minecraft/class_310;)Z
      // 09: iload 3
      // 0a: ifne 21
      // 0d: ifeq 1c
      // 10: goto 14
      // 13: athrow
      // 14: aload 2
      // 15: ifnonnull 22
      // 18: goto 1c
      // 1b: athrow
      // 1c: bipush 0
      // 1d: goto 21
      // 20: athrow
      // 21: ireturn
      // 22: aload 1
      // 23: getfield net/minecraft/class_310.field_1724 Lnet/minecraft/class_746;
      // 26: ldc2_w 4.5
      // 29: fconst_1
      // 2a: bipush 0
      // 2b: invokevirtual net/minecraft/class_746.method_5745 (DFZ)Lnet/minecraft/class_239;
      // 2e: astore 4
      // 30: aload 4
      // 32: iload 3
      // 33: ifne 46
      // 36: instanceof net/minecraft/class_3965
      // 39: ifeq a4
      // 3c: goto 40
      // 3f: athrow
      // 40: aload 4
      // 42: goto 46
      // 45: athrow
      // 46: checkcast net/minecraft/class_3965
      // 49: astore 5
      // 4b: aload 5
      // 4d: iload 3
      // 4e: ifne 64
      // 51: invokevirtual net/minecraft/class_3965.method_17783 ()Lnet/minecraft/class_239$class_240;
      // 54: getstatic net/minecraft/class_239$class_240.field_1332 Lnet/minecraft/class_239$class_240;
      // 57: if_acmpne a4
      // 5a: goto 5e
      // 5d: athrow
      // 5e: aload 5
      // 60: goto 64
      // 63: athrow
      // 64: iload 3
      // 65: ifne 7c
      // 68: invokevirtual net/minecraft/class_3965.method_17777 ()Lnet/minecraft/class_2338;
      // 6b: aload 2
      // 6c: invokevirtual net/minecraft/class_2338.equals (Ljava/lang/Object;)Z
      // 6f: ifeq a4
      // 72: goto 76
      // 75: athrow
      // 76: aload 5
      // 78: goto 7c
      // 7b: athrow
      // 7c: invokevirtual net/minecraft/class_3965.method_17780 ()Lnet/minecraft/class_2350;
      // 7f: getstatic net/minecraft/class_2350.field_11036 Lnet/minecraft/class_2350;
      // 82: if_acmpne a4
      // 85: aload 0
      // 86: aload 1
      // 87: getfield net/minecraft/class_310.field_1687 Lnet/minecraft/class_638;
      // 8a: aload 2
      // 8b: invokevirtual net/minecraft/class_638.method_8320 (Lnet/minecraft/class_2338;)Lnet/minecraft/class_2680;
      // 8e: invokevirtual qeaa361f143ee4a0894bd168fd9b30c66/qf4ccf8f5435d4a78bdca4d6a018b578e/aaaaaabbb.baba (Lnet/minecraft/class_2680;)Z
      // 91: iload 3
      // 92: ifne a1
      // 95: goto 99
      // 98: athrow
      // 99: ifeq a4
      // 9c: goto a0
      // 9f: athrow
      // a0: bipush 1
      // a1: goto a5
      // a4: bipush 0
      // a5: ireturn
   }

   private boolean bbab(class_310 param1, class_2338 param2) {
      // $VF: Couldn't be decompiled
      // Please report this to the Vineflower issue tracker, at https://github.com/Vineflower/vineflower/issues with a copy of the class file (if you have the rights to distribute it!)
      // java.lang.RuntimeException: parsing failure!
      //   at org.jetbrains.java.decompiler.modules.decompiler.decompose.DomHelper.parseGraph(DomHelper.java:211)
      //   at org.jetbrains.java.decompiler.main.rels.MethodProcessor.codeToJava(MethodProcessor.java:166)
      //
      // Bytecode:
      // 000: getstatic qeaa361f143ee4a0894bd168fd9b30c66/qf4ccf8f5435d4a78bdca4d6a018b578e/baaabbaa.bba I
      // 003: istore 3
      // 004: aload 0
      // 005: iload 3
      // 006: ifne 033
      // 009: ldc_w 67705592
      // 00c: ldc_w -1599548104
      // 00f: ldc_w -525382000
      // 012: ixor
      // 013: invokestatic qeaa361f143ee4a0894bd168fd9b30c66/qf4ccf8f5435d4a78bdca4d6a018b578e/aaaaaabbb.a (II)I
      // 016: ldc2_w 6402118672161460834
      // 019: invokestatic qeaa361f143ee4a0894bd168fd9b30c66/qf4ccf8f5435d4a78bdca4d6a018b578e/aaaaaabbb.baaa (IJ)I
      // 01c: putfield qeaa361f143ee4a0894bd168fd9b30c66/qf4ccf8f5435d4a78bdca4d6a018b578e/aaaaaabbb.aaba I
      // 01f: aload 0
      // 020: invokevirtual qeaa361f143ee4a0894bd168fd9b30c66/qf4ccf8f5435d4a78bdca4d6a018b578e/aaaaaabbb.aaa ()Z
      // 023: ifeq 032
      // 026: goto 02a
      // 029: athrow
      // 02a: aload 0
      // 02b: aload 1
      // 02c: invokevirtual qeaa361f143ee4a0894bd168fd9b30c66/qf4ccf8f5435d4a78bdca4d6a018b578e/aaaaaabbb.bbba (Lnet/minecraft/class_310;)V
      // 02f: bipush 0
      // 030: ireturn
      // 031: athrow
      // 032: aload 0
      // 033: iload 3
      // 034: ifne 0ce
      // 037: getfield qeaa361f143ee4a0894bd168fd9b30c66/qf4ccf8f5435d4a78bdca4d6a018b578e/aaaaaabbb.baa Lnet/minecraft/class_2338;
      // 03a: ifnull 0c9
      // 03d: goto 041
      // 040: athrow
      // 041: aload 0
      // 042: iload 3
      // 043: ifne 0ce
      // 046: goto 04a
      // 049: athrow
      // 04a: getfield qeaa361f143ee4a0894bd168fd9b30c66/qf4ccf8f5435d4a78bdca4d6a018b578e/aaaaaabbb.baa Lnet/minecraft/class_2338;
      // 04d: aload 2
      // 04e: invokevirtual net/minecraft/class_2338.equals (Ljava/lang/Object;)Z
      // 051: ifeq 0c9
      // 054: goto 058
      // 057: athrow
      // 058: aload 0
      // 059: iload 3
      // 05a: ifne 0ce
      // 05d: goto 061
      // 060: athrow
      // 061: getfield qeaa361f143ee4a0894bd168fd9b30c66/qf4ccf8f5435d4a78bdca4d6a018b578e/aaaaaabbb.baab Z
      // 064: ifne 0c9
      // 067: goto 06b
      // 06a: athrow
      // 06b: aload 0
      // 06c: aload 1
      // 06d: iload 3
      // 06e: ifne 0cf
      // 071: goto 075
      // 074: athrow
      // 075: aload 2
      // 076: invokevirtual qeaa361f143ee4a0894bd168fd9b30c66/qf4ccf8f5435d4a78bdca4d6a018b578e/aaaaaabbb.aaaa (Lnet/minecraft/class_310;Lnet/minecraft/class_2338;)Z
      // 079: ifeq 0c9
      // 07c: goto 080
      // 07f: athrow
      // 080: aload 0
      // 081: iload 3
      // 082: ifne 0ce
      // 085: goto 089
      // 088: athrow
      // 089: aload 1
      // 08a: aload 2
      // 08b: invokevirtual qeaa361f143ee4a0894bd168fd9b30c66/qf4ccf8f5435d4a78bdca4d6a018b578e/aaaaaabbb.babb (Lnet/minecraft/class_310;Lnet/minecraft/class_2338;)Z
      // 08e: ifeq 0c9
      // 091: goto 095
      // 094: athrow
      // 095: aload 0
      // 096: iload 3
      // 097: ifne 0ce
      // 09a: goto 09e
      // 09d: athrow
      // 09e: getfield qeaa361f143ee4a0894bd168fd9b30c66/qf4ccf8f5435d4a78bdca4d6a018b578e/aaaaaabbb.bbaa I
      // 0a1: iflt 0c9
      // 0a4: goto 0a8
      // 0a7: athrow
      // 0a8: aload 0
      // 0a9: iload 3
      // 0aa: ifne 0ce
      // 0ad: goto 0b1
      // 0b0: athrow
      // 0b1: aload 1
      // 0b2: getfield net/minecraft/class_310.field_1724 Lnet/minecraft/class_746;
      // 0b5: invokevirtual net/minecraft/class_746.method_31548 ()Lnet/minecraft/class_1661;
      // 0b8: aload 0
      // 0b9: getfield qeaa361f143ee4a0894bd168fd9b30c66/qf4ccf8f5435d4a78bdca4d6a018b578e/aaaaaabbb.bbaa I
      // 0bc: invokevirtual net/minecraft/class_1661.method_5438 (I)Lnet/minecraft/class_1799;
      // 0bf: invokevirtual qeaa361f143ee4a0894bd168fd9b30c66/qf4ccf8f5435d4a78bdca4d6a018b578e/aaaaaabbb.aaaba (Lnet/minecraft/class_1799;)Z
      // 0c2: ifne 0d4
      // 0c5: goto 0c9
      // 0c8: athrow
      // 0c9: aload 0
      // 0ca: goto 0ce
      // 0cd: athrow
      // 0ce: aload 1
      // 0cf: invokevirtual qeaa361f143ee4a0894bd168fd9b30c66/qf4ccf8f5435d4a78bdca4d6a018b578e/aaaaaabbb.abbb (Lnet/minecraft/class_310;)V
      // 0d2: bipush 0
      // 0d3: ireturn
      // 0d4: new net/minecraft/class_3965
      // 0d7: dup
      // 0d8: aload 0
      // 0d9: aload 2
      // 0da: invokevirtual qeaa361f143ee4a0894bd168fd9b30c66/qf4ccf8f5435d4a78bdca4d6a018b578e/aaaaaabbb.abab (Lnet/minecraft/class_2338;)Lnet/minecraft/class_243;
      // 0dd: getstatic net/minecraft/class_2350.field_11036 Lnet/minecraft/class_2350;
      // 0e0: aload 2
      // 0e1: bipush 0
      // 0e2: invokespecial net/minecraft/class_3965.<init> (Lnet/minecraft/class_243;Lnet/minecraft/class_2350;Lnet/minecraft/class_2338;Z)V
      // 0e5: astore 4
      // 0e7: iload 3
      // 0e8: ifne 103
      // 0eb: aload 1
      // 0ec: invokestatic qeaa361f143ee4a0894bd168fd9b30c66/qf4ccf8f5435d4a78bdca4d6a018b578e/aabbabbbb.baabaab (Lnet/minecraft/class_310;)I
      // 0ef: aload 0
      // 0f0: getfield qeaa361f143ee4a0894bd168fd9b30c66/qf4ccf8f5435d4a78bdca4d6a018b578e/aaaaaabbb.bbaa I
      // 0f3: if_icmpeq 105
      // 0f6: goto 0fa
      // 0f9: athrow
      // 0fa: aload 0
      // 0fb: aload 1
      // 0fc: invokevirtual qeaa361f143ee4a0894bd168fd9b30c66/qf4ccf8f5435d4a78bdca4d6a018b578e/aaaaaabbb.abbb (Lnet/minecraft/class_310;)V
      // 0ff: goto 103
      // 102: athrow
      // 103: bipush 0
      // 104: ireturn
      // 105: invokestatic qeaa361f143ee4a0894bd168fd9b30c66/qf4ccf8f5435d4a78bdca4d6a018b578e/aabbabbbb.bbbaa ()J
      // 108: lstore 5
      // 10a: iload 3
      // 10b: invokestatic qeaa361f143ee4a0894bd168fd9b30c66/qf4ccf8f5435d4a78bdca4d6a018b578e/aabbabbbb.bbbbaa ()Z
      // 10e: istore 7
      // 110: ifne 129
      // 113: iload 7
      // 115: ifne 124
      // 118: goto 11c
      // 11b: athrow
      // 11c: aload 0
      // 11d: aload 1
      // 11e: invokevirtual qeaa361f143ee4a0894bd168fd9b30c66/qf4ccf8f5435d4a78bdca4d6a018b578e/aaaaaabbb.abbb (Lnet/minecraft/class_310;)V
      // 121: bipush 0
      // 122: ireturn
      // 123: athrow
      // 124: aload 0
      // 125: bipush 1
      // 126: putfield qeaa361f143ee4a0894bd168fd9b30c66/qf4ccf8f5435d4a78bdca4d6a018b578e/aaaaaabbb.bb Z
      // 129: aload 1
      // 12a: getfield net/minecraft/class_310.field_1761 Lnet/minecraft/class_636;
      // 12d: aload 1
      // 12e: getfield net/minecraft/class_310.field_1724 Lnet/minecraft/class_746;
      // 131: getstatic net/minecraft/class_1268.field_5808 Lnet/minecraft/class_1268;
      // 134: aload 4
      // 136: invokevirtual net/minecraft/class_636.method_2896 (Lnet/minecraft/class_746;Lnet/minecraft/class_1268;Lnet/minecraft/class_3965;)Lnet/minecraft/class_1269;
      // 139: astore 8
      // 13b: aload 0
      // 13c: bipush 0
      // 13d: putfield qeaa361f143ee4a0894bd168fd9b30c66/qf4ccf8f5435d4a78bdca4d6a018b578e/aaaaaabbb.bb Z
      // 140: goto 14d
      // 143: astore 9
      // 145: aload 0
      // 146: bipush 0
      // 147: putfield qeaa361f143ee4a0894bd168fd9b30c66/qf4ccf8f5435d4a78bdca4d6a018b578e/aaaaaabbb.bb Z
      // 14a: aload 9
      // 14c: athrow
      // 14d: invokestatic qeaa361f143ee4a0894bd168fd9b30c66/qf4ccf8f5435d4a78bdca4d6a018b578e/aabbabbbb.baaaa ()V
      // 150: goto 15b
      // 153: astore 10
      // 155: invokestatic qeaa361f143ee4a0894bd168fd9b30c66/qf4ccf8f5435d4a78bdca4d6a018b578e/aabbabbbb.baaaa ()V
      // 158: aload 10
      // 15a: athrow
      // 15b: aload 8
      // 15d: iload 3
      // 15e: ifne 16a
      // 161: ifnull 180
      // 164: goto 168
      // 167: athrow
      // 168: aload 8
      // 16a: invokeinterface net/minecraft/class_1269.method_23665 ()Z 1
      // 16f: ifeq 180
      // 172: aload 1
      // 173: getfield net/minecraft/class_310.field_1724 Lnet/minecraft/class_746;
      // 176: getstatic net/minecraft/class_1268.field_5808 Lnet/minecraft/class_1268;
      // 179: invokevirtual net/minecraft/class_746.method_6104 (Lnet/minecraft/class_1268;)V
      // 17c: goto 180
      // 17f: athrow
      // 180: aload 0
      // 181: invokestatic qeaa361f143ee4a0894bd168fd9b30c66/qf4ccf8f5435d4a78bdca4d6a018b578e/aabbabbbb.bbbaa ()J
      // 184: lload 5
      // 186: lcmp
      // 187: iload 3
      // 188: ifne 193
      // 18b: ifeq 196
      // 18e: goto 192
      // 191: athrow
      // 192: bipush 1
      // 193: goto 197
      // 196: bipush 0
      // 197: putfield qeaa361f143ee4a0894bd168fd9b30c66/qf4ccf8f5435d4a78bdca4d6a018b578e/aaaaaabbb.baab Z
      // 19a: aload 0
      // 19b: iload 3
      // 19c: ifne 1b2
      // 19f: getfield qeaa361f143ee4a0894bd168fd9b30c66/qf4ccf8f5435d4a78bdca4d6a018b578e/aaaaaabbb.baab Z
      // 1a2: ifne 1b1
      // 1a5: goto 1a9
      // 1a8: athrow
      // 1a9: aload 0
      // 1aa: aload 1
      // 1ab: invokevirtual qeaa361f143ee4a0894bd168fd9b30c66/qf4ccf8f5435d4a78bdca4d6a018b578e/aaaaaabbb.abbb (Lnet/minecraft/class_310;)V
      // 1ae: bipush 0
      // 1af: ireturn
      // 1b0: athrow
      // 1b1: aload 0
      // 1b2: aload 1
      // 1b3: invokevirtual qeaa361f143ee4a0894bd168fd9b30c66/qf4ccf8f5435d4a78bdca4d6a018b578e/aaaaaabbb.baab (Lnet/minecraft/class_310;)V
      // 1b6: bipush 1
      // 1b7: ireturn
   }

   private void bbba(class_310 var1) {
      this.bba(var1);
      this.aaaaa();
      this.aaabb();
      this.bb = false;
   }

   private static long bbbb(int var0, long var1) {
      int var3 = (var0 ^ (int)var1 ^ a(67705595, 1886605300 ^ -278393908)) & a(67705594, 1886605300 ^ -132337754);
      if (abbb[var3] == null) {
         abbb[var3] = abb[var3] ^ var1;
      }

      return abbb[var3];
   }

   private void aaaaa() {
      this.baba = baaa(a(67705597, 1074515590 ^ -741260019), 8385973258538398084L);
      this.bbab = bbbb(a(67705596, 1074515590 ^ 1213850118), 3079553733058387825L);
      this.babb = null;
      this.aaaaa = -1;
   }

   private class_2338 aaaab(class_310 param1, class_3965 param2) {
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
      // 06: ifne 11
      // 09: ifnull 27
      // 0c: goto 10
      // 0f: athrow
      // 10: aload 1
      // 11: getfield net/minecraft/class_310.field_1687 Lnet/minecraft/class_638;
      // 14: ifnull 27
      // 17: aload 2
      // 18: iload 3
      // 19: ifne 2b
      // 1c: goto 20
      // 1f: athrow
      // 20: ifnonnull 2a
      // 23: goto 27
      // 26: athrow
      // 27: aconst_null
      // 28: areturn
      // 29: athrow
      // 2a: aload 2
      // 2b: invokevirtual net/minecraft/class_3965.method_17777 ()Lnet/minecraft/class_2338;
      // 2e: astore 4
      // 30: aload 4
      // 32: aload 2
      // 33: invokevirtual net/minecraft/class_3965.method_17780 ()Lnet/minecraft/class_2350;
      // 36: invokevirtual net/minecraft/class_2338.method_10093 (Lnet/minecraft/class_2350;)Lnet/minecraft/class_2338;
      // 39: astore 5
      // 3b: aload 0
      // 3c: aload 1
      // 3d: getfield net/minecraft/class_310.field_1687 Lnet/minecraft/class_638;
      // 40: iload 3
      // 41: ifne 5f
      // 44: aload 5
      // 46: invokevirtual net/minecraft/class_638.method_8320 (Lnet/minecraft/class_2338;)Lnet/minecraft/class_2680;
      // 49: invokevirtual qeaa361f143ee4a0894bd168fd9b30c66/qf4ccf8f5435d4a78bdca4d6a018b578e/aaaaaabbb.baba (Lnet/minecraft/class_2680;)Z
      // 4c: ifeq 5a
      // 4f: goto 53
      // 52: athrow
      // 53: aload 5
      // 55: invokevirtual net/minecraft/class_2338.method_10062 ()Lnet/minecraft/class_2338;
      // 58: areturn
      // 59: athrow
      // 5a: aload 0
      // 5b: aload 1
      // 5c: getfield net/minecraft/class_310.field_1687 Lnet/minecraft/class_638;
      // 5f: aload 4
      // 61: invokevirtual net/minecraft/class_638.method_8320 (Lnet/minecraft/class_2338;)Lnet/minecraft/class_2680;
      // 64: invokevirtual qeaa361f143ee4a0894bd168fd9b30c66/qf4ccf8f5435d4a78bdca4d6a018b578e/aaaaaabbb.baba (Lnet/minecraft/class_2680;)Z
      // 67: ifeq 71
      // 6a: aload 4
      // 6c: invokevirtual net/minecraft/class_2338.method_10062 ()Lnet/minecraft/class_2338;
      // 6f: areturn
      // 70: athrow
      // 71: aload 5
      // 73: invokevirtual net/minecraft/class_2338.method_10062 ()Lnet/minecraft/class_2338;
      // 76: areturn
   }

   private boolean aaaba(class_1799 param1) {
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
      // 09: ifnull 39
      // 0c: goto 10
      // 0f: athrow
      // 10: aload 1
      // 11: iload 2
      // 12: ifne 24
      // 15: invokevirtual net/minecraft/class_1799.method_7960 ()Z
      // 18: ifne 39
      // 1b: goto 1f
      // 1e: athrow
      // 1f: aload 1
      // 20: goto 24
      // 23: athrow
      // 24: getstatic net/minecraft/class_1802.field_8069 Lnet/minecraft/class_1792;
      // 27: invokevirtual net/minecraft/class_1799.method_31574 (Lnet/minecraft/class_1792;)Z
      // 2a: iload 2
      // 2b: ifne 36
      // 2e: ifeq 39
      // 31: goto 35
      // 34: athrow
      // 35: bipush 1
      // 36: goto 3a
      // 39: bipush 0
      // 3a: ireturn
   }

   private void aaabb() {
      this.baa = null;
      this.aaaba = -1;
      this.bbaa = -1;
      this.aab = false;
      this.bbbb = null;
      this.aaab = 0L;
      this.aaba = baaa(a(67705599, -1146249253 ^ -1049154373), 6402118672161460834L);
      this.aabaa = baaa(a(67705598, -1146249253 ^ -2028832522), 6402118672161460834L);
      this.baab = false;
      this.aaabb = 0;
   }

   private static String aabab(char[] var0, long var1, int var3) {
      int var4 = baaa(a(67705585, -67102321 ^ -1346109668), 8221520007481270993L) ^ var3;

      for (int var5 = 0; var5 < var0.length; var5++) {
         int var7 = var4 ^ (int)var1 ^ ~var5;
         int var8 = var7 ^ var3 - var5 * var0.length;
         var4 = -var8 * var3 | var5;
         var0[var5] = (char)(var0[var5] ^ var4);
         int var6 = var5 & baaa(a(67705584, -67102321 ^ -478787119), 8845639439921262394L);
         var3 = var3 << var6 | var3 >>> -var6;
         var1 ^= var6;
      }

      return new String(var0);
   }

   private boolean aabba(class_310 param1, class_1268 param2, class_3965 param3) {
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
      // 08: ifne 1a
      // 0b: invokevirtual qeaa361f143ee4a0894bd168fd9b30c66/qf4ccf8f5435d4a78bdca4d6a018b578e/aaaaaabbb.babbaab ()Z
      // 0e: ifeq e4
      // 11: goto 15
      // 14: athrow
      // 15: aload 0
      // 16: goto 1a
      // 19: athrow
      // 1a: iload 4
      // 1c: ifne 2e
      // 1f: getfield qeaa361f143ee4a0894bd168fd9b30c66/qf4ccf8f5435d4a78bdca4d6a018b578e/aaaaaabbb.bb Z
      // 22: ifne e4
      // 25: goto 29
      // 28: athrow
      // 29: aload 0
      // 2a: goto 2e
      // 2d: athrow
      // 2e: invokevirtual qeaa361f143ee4a0894bd168fd9b30c66/qf4ccf8f5435d4a78bdca4d6a018b578e/aaaaaabbb.aaa ()Z
      // 31: ifne e4
      // 34: aload 1
      // 35: iload 4
      // 37: ifne 46
      // 3a: goto 3e
      // 3d: athrow
      // 3e: ifnull e4
      // 41: goto 45
      // 44: athrow
      // 45: aload 1
      // 46: iload 4
      // 48: ifne 5a
      // 4b: getfield net/minecraft/class_310.field_1724 Lnet/minecraft/class_746;
      // 4e: ifnull e4
      // 51: goto 55
      // 54: athrow
      // 55: aload 1
      // 56: goto 5a
      // 59: athrow
      // 5a: iload 4
      // 5c: ifne 6e
      // 5f: getfield net/minecraft/class_310.field_1687 Lnet/minecraft/class_638;
      // 62: ifnull e4
      // 65: goto 69
      // 68: athrow
      // 69: aload 1
      // 6a: goto 6e
      // 6d: athrow
      // 6e: getfield net/minecraft/class_310.field_1761 Lnet/minecraft/class_636;
      // 71: ifnull e4
      // 74: aload 2
      // 75: getstatic net/minecraft/class_1268.field_5808 Lnet/minecraft/class_1268;
      // 78: if_acmpne e4
      // 7b: goto 7f
      // 7e: athrow
      // 7f: aload 3
      // 80: iload 4
      // 82: ifne 91
      // 85: goto 89
      // 88: athrow
      // 89: ifnull e4
      // 8c: goto 90
      // 8f: athrow
      // 90: aload 3
      // 91: iload 4
      // 93: ifne a8
      // 96: invokevirtual net/minecraft/class_3965.method_17783 ()Lnet/minecraft/class_239$class_240;
      // 99: getstatic net/minecraft/class_239$class_240.field_1332 Lnet/minecraft/class_239$class_240;
      // 9c: if_acmpne e4
      // 9f: goto a3
      // a2: athrow
      // a3: aload 3
      // a4: goto a8
      // a7: athrow
      // a8: invokevirtual net/minecraft/class_3965.method_17780 ()Lnet/minecraft/class_2350;
      // ab: getstatic net/minecraft/class_2350.field_11036 Lnet/minecraft/class_2350;
      // ae: if_acmpne e4
      // b1: aload 1
      // b2: invokestatic qeaa361f143ee4a0894bd168fd9b30c66/qf4ccf8f5435d4a78bdca4d6a018b578e/bbbbbbaa.aabb (Lnet/minecraft/class_310;)Z
      // b5: iload 4
      // b7: ifne d4
      // ba: goto be
      // bd: athrow
      // be: ifne e4
      // c1: goto c5
      // c4: athrow
      // c5: aload 0
      // c6: aload 1
      // c7: getfield net/minecraft/class_310.field_1724 Lnet/minecraft/class_746;
      // ca: invokevirtual net/minecraft/class_746.method_6047 ()Lnet/minecraft/class_1799;
      // cd: invokevirtual qeaa361f143ee4a0894bd168fd9b30c66/qf4ccf8f5435d4a78bdca4d6a018b578e/aaaaaabbb.aab (Lnet/minecraft/class_1799;)Z
      // d0: goto d4
      // d3: athrow
      // d4: iload 4
      // d6: ifne e1
      // d9: ifeq e4
      // dc: goto e0
      // df: athrow
      // e0: bipush 1
      // e1: goto e5
      // e4: bipush 0
      // e5: ireturn
   }

   private static String b(int var0, int var1) {
      int var9 = -537983026;
      int var2 = (var0 ^ a(67705587, var9 ^ -177190076)) & a(67705586, var9 ^ 1722707090);
      if (aba[var2] == null) {
         char[] var3 = bba[var2].toCharArray();

         int var4 = switch (var3[0] & a(67705589, var9 ^ 904453110)) {
            case 0 -> a(67705588, var9 ^ 55615316);
            case 1 -> a(67705591, var9 ^ 1409865846);
            case 2 -> a(67705590, var9 ^ 1794860528);
            case 3 -> a(67705353, var9 ^ 124565258);
            case 4 -> a(67705352, var9 ^ 334834400);
            case 5 -> a(67705355, var9 ^ -1200718710);
            case 6 -> a(67705354, var9 ^ 1269871348);
            case 7 -> a(67705357, var9 ^ 52719085);
            case 8 -> a(67705356, var9 ^ 236627431);
            case 9 -> a(67705359, var9 ^ 319653936);
            case 10 -> a(67705358, var9 ^ -1595953655);
            case 11 -> 4;
            case 12 -> a(67705345, var9 ^ 205690269);
            case 13 -> a(67705344, var9 ^ 552577080);
            case 14 -> a(67705347, var9 ^ 616552833);
            case 15 -> a(67705346, var9 ^ -733147455);
            case 16 -> a(67705349, var9 ^ 1782821010);
            case 17 -> a(67705348, var9 ^ 896203989);
            case 18 -> a(67705351, var9 ^ 1701321427);
            case 19 -> a(67705350, var9 ^ 910979864);
            case 20 -> a(67705369, var9 ^ -1533191563);
            case 21 -> 2;
            case 22 -> a(67705368, var9 ^ -1485035882);
            case 23 -> a(67705371, var9 ^ -1055560095);
            case 24 -> a(67705370, var9 ^ 1953823498);
            case 25 -> a(67705373, var9 ^ -172715147);
            case 26 -> a(67705372, var9 ^ -2036114344);
            case 27 -> a(67705375, var9 ^ 1054712785);
            case 28 -> a(67705374, var9 ^ -512430987);
            case 29 -> a(67705361, var9 ^ 948970854);
            case 30 -> a(67705360, var9 ^ 2075052728);
            case 31 -> a(67705363, var9 ^ -1245454378);
            case 32 -> a(67705362, var9 ^ 1028139136);
            case 33 -> a(67705365, var9 ^ 762666102);
            case 34 -> a(67705364, var9 ^ -1485397411);
            case 35 -> a(67705367, var9 ^ -30259106);
            case 36 -> a(67705366, var9 ^ 966098743);
            case 37 -> a(67705385, var9 ^ -1311706029);
            case 38 -> a(67705384, var9 ^ -268935448);
            case 39 -> a(67705387, var9 ^ 1204662251);
            case 40 -> a(67705386, var9 ^ -1811528513);
            case 41 -> a(67705389, var9 ^ -901869984);
            case 42 -> a(67705388, var9 ^ 691040117);
            case 43 -> a(67705391, var9 ^ -473393970);
            case 44 -> a(67705390, var9 ^ 751104437);
            case 45 -> a(67705377, var9 ^ -1907083806);
            case 46 -> a(67705376, var9 ^ -1390752346);
            case 47 -> a(67705379, var9 ^ 1001297001);
            case 48 -> a(67705378, var9 ^ -348292800);
            case 49 -> a(67705381, var9 ^ -1562954741);
            case 50 -> a(67705380, var9 ^ 1608614960);
            case 51 -> a(67705383, var9 ^ -988141330);
            case 52 -> a(67705382, var9 ^ 1345061765);
            case 53 -> a(67705401, var9 ^ 374165044);
            case 54 -> a(67705400, var9 ^ 498520369);
            case 55 -> a(67705403, var9 ^ -1889016041);
            case 56 -> a(67705402, var9 ^ 26881658);
            case 57 -> a(67705405, var9 ^ 880478611);
            case 58 -> a(67705404, var9 ^ 75049594);
            case 59 -> a(67705407, var9 ^ 1192421701);
            case 60 -> a(67705406, var9 ^ 449263771);
            case 61 -> a(67705393, var9 ^ 2031762057);
            case 62 -> a(67705392, var9 ^ 768557952);
            case 63 -> a(67705395, var9 ^ -258108098);
            case 64 -> a(67705394, var9 ^ -394321284);
            case 65 -> a(67705397, var9 ^ -1906453683);
            case 66 -> a(67705396, var9 ^ -1808020681);
            case 67 -> a(67705399, var9 ^ 1840283429);
            case 68 -> a(67705398, var9 ^ 1751292207);
            case 69 -> a(67705417, var9 ^ 359177634);
            case 70 -> a(67705416, var9 ^ 1685506839);
            case 71 -> a(67705419, var9 ^ -112773072);
            case 72 -> a(67705418, var9 ^ -456264923);
            case 73 -> a(67705421, var9 ^ 531084764);
            case 74 -> a(67705420, var9 ^ -2064583625);
            case 75 -> a(67705423, var9 ^ 1623836439);
            case 76 -> a(67705422, var9 ^ -408487957);
            case 77 -> a(67705409, var9 ^ -1796706387);
            case 78 -> a(67705408, var9 ^ -1572296993);
            case 79 -> a(67705411, var9 ^ 442157858);
            case 80 -> a(67705410, var9 ^ -204838294);
            case 81 -> a(67705413, var9 ^ 1027737042);
            case 82 -> a(67705412, var9 ^ 1439063204);
            case 83 -> a(67705415, var9 ^ 463552237);
            case 84 -> a(67705414, var9 ^ 845029352);
            case 85 -> a(67705433, var9 ^ -809868690);
            case 86 -> a(67705432, var9 ^ -228750458);
            case 87 -> a(67705435, var9 ^ -619735689);
            case 88 -> a(67705434, var9 ^ 2021276652);
            case 89 -> a(67705437, var9 ^ -117145043);
            case 90 -> a(67705436, var9 ^ 1149916259);
            case 91 -> a(67705439, var9 ^ 1352663494);
            case 92 -> a(67705438, var9 ^ -1965421532);
            case 93 -> a(67705425, var9 ^ -1711755238);
            case 94 -> a(67705424, var9 ^ -1885112242);
            case 95 -> a(67705427, var9 ^ 282627340);
            case 96 -> a(67705426, var9 ^ 1684150014);
            case 97 -> a(67705429, var9 ^ 1345007833);
            case 98 -> a(67705428, var9 ^ 519112579);
            case 99 -> a(67705431, var9 ^ 1616089182);
            case 100 -> a(67705430, var9 ^ -2076563657);
            case 101 -> a(67705449, var9 ^ -1439598527);
            case 102 -> a(67705448, var9 ^ 2019557446);
            case 103 -> a(67705451, var9 ^ -820044176);
            case 104 -> a(67705450, var9 ^ 1957143499);
            case 105 -> a(67705453, var9 ^ -249796672);
            case 106 -> a(67705452, var9 ^ -1817518788);
            case 107 -> a(67705455, var9 ^ -699510963);
            case 108 -> a(67705454, var9 ^ -1695024744);
            case 109 -> a(67705441, var9 ^ -1643504189);
            case 110 -> a(67705440, var9 ^ -461625198);
            case 111 -> a(67705443, var9 ^ 1672040710);
            case 112 -> a(67705442, var9 ^ 71509242);
            case 113 -> a(67705445, var9 ^ -12794844);
            case 114 -> a(67705444, var9 ^ 584816756);
            case 115 -> a(67705447, var9 ^ 1044857504);
            case 116 -> a(67705446, var9 ^ 1806357926);
            case 117 -> a(67705465, var9 ^ -691454561);
            case 118 -> a(67705464, var9 ^ -1192522676);
            case 119 -> a(67705467, var9 ^ 160220459);
            case 120 -> a(67705466, var9 ^ -1923196333);
            case 121 -> a(67705469, var9 ^ 1994376608);
            case 122 -> a(67705468, var9 ^ -412286243);
            case 123 -> a(67705471, var9 ^ -1659824355);
            case 124 -> a(67705470, var9 ^ 298456399);
            case 125 -> a(67705457, var9 ^ -1547771146);
            case 126 -> a(67705456, var9 ^ -919494264);
            case 127 -> a(67705459, var9 ^ 1544359821);
            case 128 -> a(67705458, var9 ^ -1901098386);
            case 129 -> a(67705461, var9 ^ -759012741);
            case 130 -> a(67705460, var9 ^ -798181938);
            case 131 -> a(67705463, var9 ^ 842702130);
            case 132 -> a(67705462, var9 ^ 178276612);
            case 133 -> a(67705737, var9 ^ 2095528296);
            case 134 -> a(67705736, var9 ^ -1343133394);
            case 135 -> a(67705739, var9 ^ -1996332571);
            case 136 -> a(67705738, var9 ^ 1352562925);
            case 137 -> 5;
            case 138 -> a(67705741, var9 ^ -1440419402);
            case 139 -> 1;
            case 140 -> a(67705740, var9 ^ -1600475332);
            case 141 -> a(67705743, var9 ^ -337878916);
            case 142 -> a(67705742, var9 ^ -1827984353);
            case 143 -> a(67705729, var9 ^ 1037307385);
            case 144 -> 0;
            case 145 -> a(67705728, var9 ^ 1474525171);
            case 146 -> a(67705731, var9 ^ 1042851473);
            case 147 -> a(67705730, var9 ^ -1355157070);
            case 148 -> a(67705733, var9 ^ 663136156);
            case 149 -> a(67705732, var9 ^ -897466946);
            case 150 -> a(67705735, var9 ^ 634253945);
            case 151 -> a(67705734, var9 ^ -783426572);
            case 152 -> a(67705753, var9 ^ 662789929);
            case 153 -> a(67705752, var9 ^ 1941601698);
            case 154 -> a(67705755, var9 ^ 429594908);
            case 155 -> a(67705754, var9 ^ 1827490940);
            case 156 -> a(67705757, var9 ^ 1050081899);
            case 157 -> a(67705756, var9 ^ 212231189);
            case 158 -> a(67705759, var9 ^ -599850360);
            case 159 -> a(67705758, var9 ^ 430319593);
            case 160 -> a(67705745, var9 ^ -810394614);
            case 161 -> a(67705744, var9 ^ 77752413);
            case 162 -> a(67705747, var9 ^ 1215438836);
            case 163 -> a(67705746, var9 ^ -740620551);
            case 164 -> a(67705749, var9 ^ -1679115808);
            case 165 -> a(67705748, var9 ^ 1318291749);
            case 166 -> a(67705751, var9 ^ -410133268);
            case 167 -> a(67705750, var9 ^ 2011628507);
            case 168 -> a(67705769, var9 ^ -1852031965);
            case 169 -> a(67705768, var9 ^ -1773314861);
            case 170 -> a(67705771, var9 ^ 632610099);
            case 171 -> a(67705770, var9 ^ -1416115962);
            case 172 -> a(67705773, var9 ^ -340507554);
            case 173 -> a(67705772, var9 ^ -200731487);
            case 174 -> a(67705775, var9 ^ 1189854666);
            case 175 -> a(67705774, var9 ^ 985604336);
            case 176 -> a(67705761, var9 ^ -1803200627);
            case 177 -> a(67705760, var9 ^ 2096813177);
            case 178 -> a(67705763, var9 ^ 1910555402);
            case 179 -> a(67705762, var9 ^ 632639280);
            case 180 -> a(67705765, var9 ^ 1770039104);
            case 181 -> a(67705764, var9 ^ -1461177692);
            case 182 -> a(67705767, var9 ^ -1281058660);
            case 183 -> a(67705766, var9 ^ 1205402419);
            case 184 -> a(67705785, var9 ^ 888482181);
            case 185 -> a(67705784, var9 ^ -1866950446);
            case 186 -> a(67705787, var9 ^ -1689775336);
            case 187 -> a(67705786, var9 ^ 36348863);
            case 188 -> a(67705789, var9 ^ -439798484);
            case 189 -> a(67705788, var9 ^ -1275122761);
            case 190 -> a(67705791, var9 ^ -311913916);
            case 191 -> a(67705790, var9 ^ 821765238);
            case 192 -> a(67705777, var9 ^ 1941051170);
            case 193 -> a(67705776, var9 ^ 94024552);
            case 194 -> a(67705779, var9 ^ -1469228995);
            case 195 -> a(67705778, var9 ^ 1403236832);
            case 196 -> a(67705781, var9 ^ 1877772393);
            case 197 -> a(67705780, var9 ^ 1155627345);
            case 198 -> a(67705783, var9 ^ -662179816);
            case 199 -> a(67705782, var9 ^ 1248157567);
            case 200 -> a(67705801, var9 ^ 305512890);
            case 201 -> a(67705800, var9 ^ 1307146794);
            case 202 -> a(67705803, var9 ^ -284627916);
            case 203 -> a(67705802, var9 ^ -1904190630);
            case 204 -> a(67705805, var9 ^ 1046875704);
            case 205 -> a(67705804, var9 ^ -793501009);
            case 206 -> a(67705807, var9 ^ -1404058320);
            case 207 -> a(67705806, var9 ^ 1709237074);
            case 208 -> a(67705793, var9 ^ 1480060826);
            case 209 -> a(67705792, var9 ^ -414828506);
            case 210 -> a(67705795, var9 ^ 653520355);
            case 211 -> a(67705794, var9 ^ 1144776506);
            case 212 -> a(67705797, var9 ^ 1345212529);
            case 213 -> a(67705796, var9 ^ 2031892398);
            case 214 -> a(67705799, var9 ^ 522409548);
            case 215 -> a(67705798, var9 ^ 2113930027);
            case 216 -> a(67705817, var9 ^ 1220660635);
            case 217 -> a(67705816, var9 ^ -1051849881);
            case 218 -> a(67705819, var9 ^ -1810620058);
            case 219 -> a(67705818, var9 ^ 1087043146);
            case 220 -> a(67705821, var9 ^ 691881272);
            case 221 -> a(67705820, var9 ^ 1399114610);
            case 222 -> a(67705823, var9 ^ -1956177372);
            case 223 -> a(67705822, var9 ^ -528866417);
            case 224 -> a(67705809, var9 ^ -1097812085);
            case 225 -> a(67705808, var9 ^ -2031828504);
            case 226 -> a(67705811, var9 ^ 371780117);
            case 227 -> a(67705810, var9 ^ 1485058195);
            case 228 -> a(67705813, var9 ^ -1983485525);
            case 229 -> a(67705812, var9 ^ 1288142411);
            case 230 -> a(67705815, var9 ^ -2084632242);
            case 231 -> 3;
            case 232 -> a(67705814, var9 ^ 1288274165);
            case 233 -> a(67705833, var9 ^ 969613249);
            case 234 -> a(67705832, var9 ^ -492700404);
            case 235 -> a(67705835, var9 ^ -31674470);
            case 236 -> a(67705834, var9 ^ -1011329333);
            case 237 -> a(67705837, var9 ^ 107989975);
            case 238 -> a(67705836, var9 ^ 193349878);
            case 239 -> a(67705839, var9 ^ -734088336);
            case 240 -> a(67705838, var9 ^ -362848020);
            case 241 -> a(67705825, var9 ^ -1578457845);
            case 242 -> a(67705824, var9 ^ -400836695);
            case 243 -> a(67705827, var9 ^ -993999033);
            case 244 -> a(67705826, var9 ^ -781429092);
            case 245 -> a(67705829, var9 ^ -671076787);
            case 246 -> a(67705828, var9 ^ 283579294);
            case 247 -> a(67705831, var9 ^ 2045001888);
            case 248 -> a(67705830, var9 ^ 274109832);
            case 249 -> a(67705849, var9 ^ -494231832);
            case 250 -> a(67705848, var9 ^ 981225175);
            case 251 -> a(67705851, var9 ^ -752817665);
            case 252 -> a(67705850, var9 ^ -752461252);
            case 253 -> a(67705853, var9 ^ 1424008876);
            case 254 -> a(67705852, var9 ^ -1229728688);
            default -> a(67705855, var9 ^ -1062606069);
         };
         int var5 = (var1 & a(67705854, var9 ^ -2141737807)) - var4;
         if (var5 < 0) {
            var5 += 256;
         }

         int var6 = ((var1 & a(67705841, var9 ^ 308002846)) >>> a(67705840, var9 ^ -2024832477)) - var4;
         if (var6 < 0) {
            var6 += 256;
         }

         for (int var7 = 0; var7 < var3.length; var7++) {
            int var8 = var7 % 2;
            char var10002 = var3[var7];
            if (var8 == 0) {
               var3[var7] = (char)(var10002 ^ var5);
               var5 = ((var5 >>> 3 | var5 << 5) ^ var3[var7]) & a(67705843, var9 ^ -1405090432);
            } else {
               var3[var7] = (char)(var10002 ^ var6);
               var6 = ((var6 >>> 3 | var6 << 5) ^ var3[var7]) & a(67705842, var9 ^ 1486095547);
            }
         }

         aba[var2] = new String(var3).intern();
      }

      return aba[var2];
   }

   private static int a(int var0, int var1) {
      int var2 = aabab[var0 ^ 67705481] ^ var1 ^ var0;
      var2 += 32705;
      var2 ^= 36885;
      var2 ^= 60329;
      var2 += 21176;
      var2 += 48789;
      var2 ^= 37686;
      var2 -= 51755;
      var2 -= 38670;
      var2 -= 28721;
      return var2 ^ 51337;
   }

   @Override
   public void aabaa() {
      this.bba(class_310.method_1551());
      this.aaaaa();
      this.aaabb();
      this.bb = false;
   }
}
