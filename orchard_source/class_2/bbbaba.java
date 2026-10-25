package nsc;

import com.mojang.authlib.GameProfile;
import net.fabricmc.api.EnvType;
import net.fabricmc.api.Environment;
import net.minecraft.class_1657;
import net.minecraft.class_310;
import net.minecraft.class_640;
import net.minecraft.class_745;
import org.jetbrains.annotations.Nullable;

@Environment(EnvType.CLIENT)
public final class bbbaba extends class_745 {
   private final int aa;
   private static final class_310 ab = class_310.method_1551();
   @Nullable
   private class_640 a;

   public void aa() {
      // $VF: Couldn't be decompiled
      // Please report this to the Vineflower issue tracker, at https://github.com/Vineflower/vineflower/issues with a copy of the class file (if you have the rights to distribute it!)
      // java.lang.RuntimeException: parsing failure!
      //   at org.jetbrains.java.decompiler.modules.decompiler.decompose.DomHelper.parseGraph(DomHelper.java:211)
      //   at org.jetbrains.java.decompiler.main.rels.MethodProcessor.codeToJava(MethodProcessor.java:166)
      //
      // Bytecode:
      // 00: getstatic qeaa361f143ee4a0894bd168fd9b30c66/qf4ccf8f5435d4a78bdca4d6a018b578e/baaabbaa.bba I
      // 03: istore 1
      // 04: getstatic qeaa361f143ee4a0894bd168fd9b30c66/qf4ccf8f5435d4a78bdca4d6a018b578e/bbbaba.ab Lnet/minecraft/class_310;
      // 07: iload 1
      // 08: ifne 23
      // 0b: getfield net/minecraft/class_310.field_1687 Lnet/minecraft/class_638;
      // 0e: ifnonnull 17
      // 11: goto 15
      // 14: athrow
      // 15: return
      // 16: athrow
      // 17: aload 0
      // 18: invokevirtual qeaa361f143ee4a0894bd168fd9b30c66/qf4ccf8f5435d4a78bdca4d6a018b578e/bbbaba.method_31482 ()V
      // 1b: aload 0
      // 1c: bipush 0
      // 1d: putfield qeaa361f143ee4a0894bd168fd9b30c66/qf4ccf8f5435d4a78bdca4d6a018b578e/bbbaba.field_5960 Z
      // 20: getstatic qeaa361f143ee4a0894bd168fd9b30c66/qf4ccf8f5435d4a78bdca4d6a018b578e/bbbaba.ab Lnet/minecraft/class_310;
      // 23: getfield net/minecraft/class_310.field_1687 Lnet/minecraft/class_638;
      // 26: aload 0
      // 27: invokevirtual net/minecraft/class_638.method_53875 (Lnet/minecraft/class_1297;)V
      // 2a: return
   }

   public int ab() {
      return this.aa;
   }

   public bbbaba(class_1657 param1, String param2, float param3, boolean param4, boolean param5) {
      // $VF: Couldn't be decompiled
      // Please report this to the Vineflower issue tracker, at https://github.com/Vineflower/vineflower/issues with a copy of the class file (if you have the rights to distribute it!)
      // java.lang.RuntimeException: parsing failure!
      //   at org.jetbrains.java.decompiler.modules.decompiler.decompose.DomHelper.parseGraph(DomHelper.java:211)
      //   at org.jetbrains.java.decompiler.main.rels.MethodProcessor.codeToJava(MethodProcessor.java:166)
      //
      // Bytecode:
      // 000: getstatic qeaa361f143ee4a0894bd168fd9b30c66/qf4ccf8f5435d4a78bdca4d6a018b578e/baaabbaa.bba I
      // 003: istore 6
      // 005: aload 0
      // 006: getstatic qeaa361f143ee4a0894bd168fd9b30c66/qf4ccf8f5435d4a78bdca4d6a018b578e/bbbaba.ab Lnet/minecraft/class_310;
      // 009: getfield net/minecraft/class_310.field_1687 Lnet/minecraft/class_638;
      // 00c: aload 1
      // 00d: aload 2
      // 00e: invokestatic qeaa361f143ee4a0894bd168fd9b30c66/qf4ccf8f5435d4a78bdca4d6a018b578e/bbbaba.b (Lnet/minecraft/class_1657;Ljava/lang/String;)Lcom/mojang/authlib/GameProfile;
      // 011: invokespecial net/minecraft/class_745.<init> (Lnet/minecraft/class_638;Lcom/mojang/authlib/GameProfile;)V
      // 014: iload 6
      // 016: ifne 033
      // 019: getstatic qeaa361f143ee4a0894bd168fd9b30c66/qf4ccf8f5435d4a78bdca4d6a018b578e/bbbaba.ab Lnet/minecraft/class_310;
      // 01c: getfield net/minecraft/class_310.field_1687 Lnet/minecraft/class_638;
      // 01f: ifnull 02a
      // 022: aload 1
      // 023: ifnonnull 034
      // 026: goto 02a
      // 029: athrow
      // 02a: aload 0
      // 02b: bipush 0
      // 02c: putfield qeaa361f143ee4a0894bd168fd9b30c66/qf4ccf8f5435d4a78bdca4d6a018b578e/bbbaba.aa I
      // 02f: goto 033
      // 032: athrow
      // 033: return
      // 034: aload 0
      // 035: aload 1
      // 036: invokevirtual qeaa361f143ee4a0894bd168fd9b30c66/qf4ccf8f5435d4a78bdca4d6a018b578e/bbbaba.method_5719 (Lnet/minecraft/class_1297;)V
      // 039: iload 6
      // 03b: aload 0
      // 03c: aload 1
      // 03d: getfield net/minecraft/class_1657.field_6014 D
      // 040: putfield qeaa361f143ee4a0894bd168fd9b30c66/qf4ccf8f5435d4a78bdca4d6a018b578e/bbbaba.field_6014 D
      // 043: aload 0
      // 044: aload 1
      // 045: getfield net/minecraft/class_1657.field_6036 D
      // 048: putfield qeaa361f143ee4a0894bd168fd9b30c66/qf4ccf8f5435d4a78bdca4d6a018b578e/bbbaba.field_6036 D
      // 04b: aload 0
      // 04c: aload 1
      // 04d: getfield net/minecraft/class_1657.field_5969 D
      // 050: putfield qeaa361f143ee4a0894bd168fd9b30c66/qf4ccf8f5435d4a78bdca4d6a018b578e/bbbaba.field_5969 D
      // 053: aload 0
      // 054: aload 1
      // 055: getfield net/minecraft/class_1657.field_6241 F
      // 058: putfield qeaa361f143ee4a0894bd168fd9b30c66/qf4ccf8f5435d4a78bdca4d6a018b578e/bbbaba.field_6241 F
      // 05b: aload 0
      // 05c: aload 1
      // 05d: getfield net/minecraft/class_1657.field_6283 F
      // 060: putfield qeaa361f143ee4a0894bd168fd9b30c66/qf4ccf8f5435d4a78bdca4d6a018b578e/bbbaba.field_6283 F
      // 063: aload 0
      // 064: aload 1
      // 065: invokevirtual net/minecraft/class_1657.method_18798 ()Lnet/minecraft/class_243;
      // 068: invokevirtual qeaa361f143ee4a0894bd168fd9b30c66/qf4ccf8f5435d4a78bdca4d6a018b578e/bbbaba.method_18799 (Lnet/minecraft/class_243;)V
      // 06b: aload 0
      // 06c: aload 1
      // 06d: invokevirtual net/minecraft/class_1657.method_24828 ()Z
      // 070: invokevirtual qeaa361f143ee4a0894bd168fd9b30c66/qf4ccf8f5435d4a78bdca4d6a018b578e/bbbaba.method_24830 (Z)V
      // 073: aload 0
      // 074: aload 1
      // 075: invokevirtual net/minecraft/class_1657.method_5715 ()Z
      // 078: invokevirtual qeaa361f143ee4a0894bd168fd9b30c66/qf4ccf8f5435d4a78bdca4d6a018b578e/bbbaba.method_5660 (Z)V
      // 07b: aload 0
      // 07c: aload 1
      // 07d: invokevirtual net/minecraft/class_1657.method_5624 ()Z
      // 080: invokevirtual qeaa361f143ee4a0894bd168fd9b30c66/qf4ccf8f5435d4a78bdca4d6a018b578e/bbbaba.method_5728 (Z)V
      // 083: aload 0
      // 084: aload 1
      // 085: invokevirtual net/minecraft/class_1657.method_5681 ()Z
      // 088: invokevirtual qeaa361f143ee4a0894bd168fd9b30c66/qf4ccf8f5435d4a78bdca4d6a018b578e/bbbaba.method_5796 (Z)V
      // 08b: aload 0
      // 08c: aload 1
      // 08d: invokevirtual net/minecraft/class_1657.method_5669 ()I
      // 090: invokevirtual qeaa361f143ee4a0894bd168fd9b30c66/qf4ccf8f5435d4a78bdca4d6a018b578e/bbbaba.method_5855 (I)V
      // 093: ifne 0dd
      // 096: aload 0
      // 097: aload 1
      // 098: invokevirtual net/minecraft/class_1657.method_20802 ()I
      // 09b: invokevirtual qeaa361f143ee4a0894bd168fd9b30c66/qf4ccf8f5435d4a78bdca4d6a018b578e/bbbaba.method_20803 (I)V
      // 09e: aload 0
      // 09f: invokevirtual qeaa361f143ee4a0894bd168fd9b30c66/qf4ccf8f5435d4a78bdca4d6a018b578e/bbbaba.method_6127 ()Lnet/minecraft/class_5131;
      // 0a2: aload 1
      // 0a3: invokevirtual net/minecraft/class_1657.method_6127 ()Lnet/minecraft/class_5131;
      // 0a6: invokevirtual net/minecraft/class_5131.method_26846 (Lnet/minecraft/class_5131;)V
      // 0a9: aload 0
      // 0aa: aload 1
      // 0ab: invokevirtual net/minecraft/class_1657.method_18376 ()Lnet/minecraft/class_4050;
      // 0ae: invokevirtual qeaa361f143ee4a0894bd168fd9b30c66/qf4ccf8f5435d4a78bdca4d6a018b578e/bbbaba.method_18380 (Lnet/minecraft/class_4050;)V
      // 0b1: aload 0
      // 0b2: bipush 0
      // 0b3: putfield qeaa361f143ee4a0894bd168fd9b30c66/qf4ccf8f5435d4a78bdca4d6a018b578e/bbbaba.field_5960 Z
      // 0b6: fload 3
      // 0b7: ldc 20.0
      // 0b9: fcmpg
      // 0ba: ifgt 0d3
      // 0bd: goto 0c1
      // 0c0: athrow
      // 0c1: aload 0
      // 0c2: fconst_1
      // 0c3: fload 3
      // 0c4: invokestatic java/lang/Math.max (FF)F
      // 0c7: invokevirtual qeaa361f143ee4a0894bd168fd9b30c66/qf4ccf8f5435d4a78bdca4d6a018b578e/bbbaba.method_6033 (F)V
      // 0ca: iload 6
      // 0cc: ifeq 0e5
      // 0cf: goto 0d3
      // 0d2: athrow
      // 0d3: aload 0
      // 0d4: ldc 20.0
      // 0d6: invokevirtual qeaa361f143ee4a0894bd168fd9b30c66/qf4ccf8f5435d4a78bdca4d6a018b578e/bbbaba.method_6033 (F)V
      // 0d9: goto 0dd
      // 0dc: athrow
      // 0dd: aload 0
      // 0de: fload 3
      // 0df: ldc 20.0
      // 0e1: fsub
      // 0e2: invokevirtual qeaa361f143ee4a0894bd168fd9b30c66/qf4ccf8f5435d4a78bdca4d6a018b578e/bbbaba.method_6073 (F)V
      // 0e5: iload 5
      // 0e7: iload 6
      // 0e9: ifne 0fe
      // 0ec: ifeq 0fc
      // 0ef: goto 0f3
      // 0f2: athrow
      // 0f3: aload 0
      // 0f4: bipush 1
      // 0f5: invokevirtual qeaa361f143ee4a0894bd168fd9b30c66/qf4ccf8f5435d4a78bdca4d6a018b578e/bbbaba.method_5648 (Z)V
      // 0f8: goto 0fc
      // 0fb: athrow
      // 0fc: iload 4
      // 0fe: ifeq 110
      // 101: aload 0
      // 102: invokevirtual qeaa361f143ee4a0894bd168fd9b30c66/qf4ccf8f5435d4a78bdca4d6a018b578e/bbbaba.method_31548 ()Lnet/minecraft/class_1661;
      // 105: aload 1
      // 106: invokevirtual net/minecraft/class_1657.method_31548 ()Lnet/minecraft/class_1661;
      // 109: invokevirtual net/minecraft/class_1661.method_7377 (Lnet/minecraft/class_1661;)V
      // 10c: goto 110
      // 10f: athrow
      // 110: aload 0
      // 111: getstatic qeaa361f143ee4a0894bd168fd9b30c66/qf4ccf8f5435d4a78bdca4d6a018b578e/bbbaba.ab Lnet/minecraft/class_310;
      // 114: iload 6
      // 116: ifne 12b
      // 119: invokevirtual net/minecraft/class_310.method_1562 ()Lnet/minecraft/class_634;
      // 11c: ifnonnull 128
      // 11f: goto 123
      // 122: athrow
      // 123: aconst_null
      // 124: goto 135
      // 127: athrow
      // 128: getstatic qeaa361f143ee4a0894bd168fd9b30c66/qf4ccf8f5435d4a78bdca4d6a018b578e/bbbaba.ab Lnet/minecraft/class_310;
      // 12b: invokevirtual net/minecraft/class_310.method_1562 ()Lnet/minecraft/class_634;
      // 12e: aload 1
      // 12f: invokevirtual net/minecraft/class_1657.method_5667 ()Ljava/util/UUID;
      // 132: invokevirtual net/minecraft/class_634.method_2871 (Ljava/util/UUID;)Lnet/minecraft/class_640;
      // 135: putfield qeaa361f143ee4a0894bd168fd9b30c66/qf4ccf8f5435d4a78bdca4d6a018b578e/bbbaba.a Lnet/minecraft/class_640;
      // 138: aload 0
      // 139: aload 0
      // 13a: iload 6
      // 13c: ifne 14f
      // 13f: getfield qeaa361f143ee4a0894bd168fd9b30c66/qf4ccf8f5435d4a78bdca4d6a018b578e/bbbaba.a Lnet/minecraft/class_640;
      // 142: ifnonnull 14e
      // 145: goto 149
      // 148: athrow
      // 149: bipush 0
      // 14a: goto 155
      // 14d: athrow
      // 14e: aload 0
      // 14f: getfield qeaa361f143ee4a0894bd168fd9b30c66/qf4ccf8f5435d4a78bdca4d6a018b578e/bbbaba.a Lnet/minecraft/class_640;
      // 152: invokevirtual net/minecraft/class_640.method_2959 ()I
      // 155: putfield qeaa361f143ee4a0894bd168fd9b30c66/qf4ccf8f5435d4a78bdca4d6a018b578e/bbbaba.aa I
      // 158: return
   }

   public void ba() {
      // $VF: Couldn't be decompiled
      // Please report this to the Vineflower issue tracker, at https://github.com/Vineflower/vineflower/issues with a copy of the class file (if you have the rights to distribute it!)
      // java.lang.RuntimeException: parsing failure!
      //   at org.jetbrains.java.decompiler.modules.decompiler.decompose.DomHelper.parseGraph(DomHelper.java:211)
      //   at org.jetbrains.java.decompiler.main.rels.MethodProcessor.codeToJava(MethodProcessor.java:166)
      //
      // Bytecode:
      // 00: getstatic qeaa361f143ee4a0894bd168fd9b30c66/qf4ccf8f5435d4a78bdca4d6a018b578e/baaabbaa.bba I
      // 03: istore 1
      // 04: getstatic qeaa361f143ee4a0894bd168fd9b30c66/qf4ccf8f5435d4a78bdca4d6a018b578e/bbbaba.ab Lnet/minecraft/class_310;
      // 07: iload 1
      // 08: ifne 1a
      // 0b: getfield net/minecraft/class_310.field_1687 Lnet/minecraft/class_638;
      // 0e: ifnonnull 17
      // 11: goto 15
      // 14: athrow
      // 15: return
      // 16: athrow
      // 17: getstatic qeaa361f143ee4a0894bd168fd9b30c66/qf4ccf8f5435d4a78bdca4d6a018b578e/bbbaba.ab Lnet/minecraft/class_310;
      // 1a: getfield net/minecraft/class_310.field_1687 Lnet/minecraft/class_638;
      // 1d: aload 0
      // 1e: invokevirtual qeaa361f143ee4a0894bd168fd9b30c66/qf4ccf8f5435d4a78bdca4d6a018b578e/bbbaba.method_5628 ()I
      // 21: getstatic net/minecraft/class_1297$class_5529.field_26999 Lnet/minecraft/class_1297$class_5529;
      // 24: invokevirtual net/minecraft/class_638.method_2945 (ILnet/minecraft/class_1297$class_5529;)V
      // 27: aload 0
      // 28: getstatic net/minecraft/class_1297$class_5529.field_26999 Lnet/minecraft/class_1297$class_5529;
      // 2b: invokevirtual qeaa361f143ee4a0894bd168fd9b30c66/qf4ccf8f5435d4a78bdca4d6a018b578e/bbbaba.method_31745 (Lnet/minecraft/class_1297$class_5529;)V
      // 2e: return
   }

   @Nullable
   protected class_640 method_3123() {
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
      // 06: ifne 50
      // 09: getfield qeaa361f143ee4a0894bd168fd9b30c66/qf4ccf8f5435d4a78bdca4d6a018b578e/bbbaba.a Lnet/minecraft/class_640;
      // 0c: ifnonnull 4f
      // 0f: goto 13
      // 12: athrow
      // 13: getstatic qeaa361f143ee4a0894bd168fd9b30c66/qf4ccf8f5435d4a78bdca4d6a018b578e/bbbaba.ab Lnet/minecraft/class_310;
      // 16: iload 1
      // 17: ifne 2f
      // 1a: goto 1e
      // 1d: athrow
      // 1e: invokevirtual net/minecraft/class_310.method_1562 ()Lnet/minecraft/class_634;
      // 21: ifnull 4f
      // 24: goto 28
      // 27: athrow
      // 28: getstatic qeaa361f143ee4a0894bd168fd9b30c66/qf4ccf8f5435d4a78bdca4d6a018b578e/bbbaba.ab Lnet/minecraft/class_310;
      // 2b: goto 2f
      // 2e: athrow
      // 2f: getfield net/minecraft/class_310.field_1724 Lnet/minecraft/class_746;
      // 32: ifnull 4f
      // 35: aload 0
      // 36: getstatic qeaa361f143ee4a0894bd168fd9b30c66/qf4ccf8f5435d4a78bdca4d6a018b578e/bbbaba.ab Lnet/minecraft/class_310;
      // 39: invokevirtual net/minecraft/class_310.method_1562 ()Lnet/minecraft/class_634;
      // 3c: getstatic qeaa361f143ee4a0894bd168fd9b30c66/qf4ccf8f5435d4a78bdca4d6a018b578e/bbbaba.ab Lnet/minecraft/class_310;
      // 3f: getfield net/minecraft/class_310.field_1724 Lnet/minecraft/class_746;
      // 42: invokevirtual net/minecraft/class_746.method_5667 ()Ljava/util/UUID;
      // 45: invokevirtual net/minecraft/class_634.method_2871 (Ljava/util/UUID;)Lnet/minecraft/class_640;
      // 48: putfield qeaa361f143ee4a0894bd168fd9b30c66/qf4ccf8f5435d4a78bdca4d6a018b578e/bbbaba.a Lnet/minecraft/class_640;
      // 4b: goto 4f
      // 4e: athrow
      // 4f: aload 0
      // 50: getfield qeaa361f143ee4a0894bd168fd9b30c66/qf4ccf8f5435d4a78bdca4d6a018b578e/bbbaba.a Lnet/minecraft/class_640;
      // 53: areturn
   }

   private static GameProfile b(class_1657 param0, String param1) {
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
      // 09: ifnull 27
      // 0c: goto 10
      // 0f: athrow
      // 10: aload 1
      // 11: iload 2
      // 12: ifne 24
      // 15: invokevirtual java/lang/String.isEmpty ()Z
      // 18: ifne 27
      // 1b: goto 1f
      // 1e: athrow
      // 1f: aload 1
      // 20: goto 24
      // 23: athrow
      // 24: goto 30
      // 27: aload 0
      // 28: invokevirtual net/minecraft/class_1657.method_5477 ()Lnet/minecraft/class_2561;
      // 2b: invokeinterface net/minecraft/class_2561.getString ()Ljava/lang/String; 1
      // 30: astore 3
      // 31: new com/mojang/authlib/GameProfile
      // 34: dup
      // 35: invokestatic java/util/UUID.randomUUID ()Ljava/util/UUID;
      // 38: aload 3
      // 39: invokespecial com/mojang/authlib/GameProfile.<init> (Ljava/util/UUID;Ljava/lang/String;)V
      // 3c: areturn
   }
}
