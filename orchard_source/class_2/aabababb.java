package nsc;

import net.fabricmc.api.EnvType;
import net.fabricmc.api.Environment;
import net.minecraft.class_1282;
import net.minecraft.class_1309;
import net.minecraft.class_1657;
import net.minecraft.class_310;

@Environment(EnvType.CLIENT)
public final class aabababb extends abbaabbaa {
   private static final int[] aabb;
   private final baabaab aa;
   private boolean ab;
   private class_1309 ba;
   private final abbaaaaa bb;
   private static final Object[] abab;
   private static final String[] aaa;
   private int aab;
   private static final String[] abaa;
   private final bababa aba;
   private final bababa abb;
   private final abbaaaaa baa;
   private static final long bab;
   private static final String[] bba;
   private int bbb;
   private boolean aaaa;
   private int aaab;
   private static final int aaba = 1;

   private static String b(int var0, int var1) {
      int var3 = var0 ^ -582563054;
      char[] var4 = abaa[var3].toCharArray();
      StackTraceElement[] var2 = (StackTraceElement[])abab[var3];
      StackTraceElement[] var5;
      if (var2 != null) {
         var5 = var2;
      } else {
         var5 = new Throwable().getStackTrace();
         abab[var3] = var5;
      }

      StackTraceElement var6 = var5[1];
      int var7 = (var6.getClassName().hashCode() ^ var6.getMethodName().hashCode()) >> 16 ^ 1901412245;
      int var8 = 0;

      do {
         var4[var8] = (char)(var4[var8] ^ switch (var8 & 31) {
            default -> 241;
            case 1 -> 150;
            case 2 -> 154;
            case 3 -> 111;
            case 4 -> 130;
            case 5 -> 150;
            case 6 -> 39;
            case 7 -> 20;
            case 8 -> 170;
            case 9 -> 147;
            case 10 -> 210;
            case 11 -> 238;
            case 12 -> 200;
            case 13 -> 160;
            case 14 -> 87;
            case 15 -> 129;
            case 16 -> 150;
            case 17 -> 18;
            case 18 -> 207;
            case 19 -> 197;
            case 20 -> 192;
            case 21 -> 74;
            case 22 -> 173;
            case 23 -> 235;
            case 24 -> 72;
            case 25 -> 148;
            case 26 -> 199;
            case 27 -> 255;
            case 28 -> 43;
            case 29 -> 236;
            case 30 -> 250;
            case 31 -> 177;
         } ^ var1 >> 16 ^ var7);
      } while (++var8 < var4.length);

      return new String(var4).intern();
   }

   public void aa(class_310 param1, boolean param2) {
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
      // 04: aload 1
      // 05: iload 3
      // 06: ifne 11
      // 09: ifnull 2d
      // 0c: goto 10
      // 0f: athrow
      // 10: aload 1
      // 11: iload 3
      // 12: ifne 24
      // 15: getfield net/minecraft/class_310.field_1690 Lnet/minecraft/class_315;
      // 18: ifnull 2d
      // 1b: goto 1f
      // 1e: athrow
      // 1f: aload 1
      // 20: goto 24
      // 23: athrow
      // 24: getfield net/minecraft/class_310.field_1690 Lnet/minecraft/class_315;
      // 27: getfield net/minecraft/class_315.field_1903 Lnet/minecraft/class_304;
      // 2a: ifnonnull 2f
      // 2d: return
      // 2e: athrow
      // 2f: invokestatic qeaa361f143ee4a0894bd168fd9b30c66/qf4ccf8f5435d4a78bdca4d6a018b578e/aabbaabb.bab ()Lqeaa361f143ee4a0894bd168fd9b30c66/qf4ccf8f5435d4a78bdca4d6a018b578e/aabbaabb;
      // 32: astore 4
      // 34: aload 4
      // 36: ifnull 6e
      // 39: iload 2
      // 3a: ifeq 58
      // 3d: goto 41
      // 40: athrow
      // 41: aload 4
      // 43: aload 0
      // 44: aload 1
      // 45: aload 1
      // 46: getfield net/minecraft/class_310.field_1690 Lnet/minecraft/class_315;
      // 49: getfield net/minecraft/class_315.field_1903 Lnet/minecraft/class_304;
      // 4c: bipush 1
      // 4d: invokevirtual qeaa361f143ee4a0894bd168fd9b30c66/qf4ccf8f5435d4a78bdca4d6a018b578e/aabbaabb.ba (Ljava/lang/Object;Lnet/minecraft/class_310;Lnet/minecraft/class_304;Z)V
      // 50: iload 3
      // 51: ifeq a7
      // 54: goto 58
      // 57: athrow
      // 58: aload 4
      // 5a: aload 0
      // 5b: aload 1
      // 5c: aload 1
      // 5d: getfield net/minecraft/class_310.field_1690 Lnet/minecraft/class_315;
      // 60: getfield net/minecraft/class_315.field_1903 Lnet/minecraft/class_304;
      // 63: invokevirtual qeaa361f143ee4a0894bd168fd9b30c66/qf4ccf8f5435d4a78bdca4d6a018b578e/aabbaabb.baa (Ljava/lang/Object;Lnet/minecraft/class_310;Lnet/minecraft/class_304;)V
      // 66: iload 3
      // 67: ifeq a7
      // 6a: goto 6e
      // 6d: athrow
      // 6e: aload 1
      // 6f: getfield net/minecraft/class_310.field_1690 Lnet/minecraft/class_315;
      // 72: getfield net/minecraft/class_315.field_1903 Lnet/minecraft/class_304;
      // 75: iload 2
      // 76: iload 3
      // 77: ifne a0
      // 7a: goto 7e
      // 7d: athrow
      // 7e: ifne 9f
      // 81: goto 85
      // 84: athrow
      // 85: aload 1
      // 86: aload 1
      // 87: getfield net/minecraft/class_310.field_1690 Lnet/minecraft/class_315;
      // 8a: getfield net/minecraft/class_315.field_1903 Lnet/minecraft/class_304;
      // 8d: invokestatic qeaa361f143ee4a0894bd168fd9b30c66/qf4ccf8f5435d4a78bdca4d6a018b578e/aabbabbbb.aaab (Lnet/minecraft/class_310;Lnet/minecraft/class_304;)Z
      // 90: iload 3
      // 91: ifne a0
      // 94: goto 98
      // 97: athrow
      // 98: ifeq a3
      // 9b: goto 9f
      // 9e: athrow
      // 9f: bipush 1
      // a0: goto a4
      // a3: bipush 0
      // a4: invokevirtual net/minecraft/class_304.method_23481 (Z)V
      // a7: return
   }

   private void ab() {
      this.bbb = 0;
      this.aaaa = false;
      this.aab = 0;
      this.aaab = 0;
      this.abb();
   }

   public boolean ba(class_310 param1) {
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
      // 006: ifne 063
      // 009: invokevirtual qeaa361f143ee4a0894bd168fd9b30c66/qf4ccf8f5435d4a78bdca4d6a018b578e/aabababb.babbaab ()Z
      // 00c: ifeq 058
      // 00f: goto 013
      // 012: athrow
      // 013: aload 1
      // 014: iload 2
      // 015: ifne 024
      // 018: goto 01c
      // 01b: athrow
      // 01c: ifnull 058
      // 01f: goto 023
      // 022: athrow
      // 023: aload 1
      // 024: iload 2
      // 025: ifne 037
      // 028: getfield net/minecraft/class_310.field_1724 Lnet/minecraft/class_746;
      // 02b: ifnull 058
      // 02e: goto 032
      // 031: athrow
      // 032: aload 1
      // 033: goto 037
      // 036: athrow
      // 037: iload 2
      // 038: ifne 04a
      // 03b: getfield net/minecraft/class_310.field_1755 Lnet/minecraft/class_437;
      // 03e: ifnonnull 058
      // 041: goto 045
      // 044: athrow
      // 045: aload 1
      // 046: goto 04a
      // 049: athrow
      // 04a: invokevirtual net/minecraft/class_310.method_1569 ()Z
      // 04d: iload 2
      // 04e: ifne 06c
      // 051: ifne 068
      // 054: goto 058
      // 057: athrow
      // 058: aload 0
      // 059: aload 1
      // 05a: bipush 0
      // 05b: invokevirtual qeaa361f143ee4a0894bd168fd9b30c66/qf4ccf8f5435d4a78bdca4d6a018b578e/aabababb.aa (Lnet/minecraft/class_310;Z)V
      // 05e: aload 0
      // 05f: goto 063
      // 062: athrow
      // 063: invokevirtual qeaa361f143ee4a0894bd168fd9b30c66/qf4ccf8f5435d4a78bdca4d6a018b578e/aabababb.ab ()V
      // 066: bipush 0
      // 067: ireturn
      // 068: aload 0
      // 069: getfield qeaa361f143ee4a0894bd168fd9b30c66/qf4ccf8f5435d4a78bdca4d6a018b578e/aabababb.aab I
      // 06c: iload 2
      // 06d: ifne 08c
      // 070: ifle 085
      // 073: goto 077
      // 076: athrow
      // 077: aload 0
      // 078: dup
      // 079: getfield qeaa361f143ee4a0894bd168fd9b30c66/qf4ccf8f5435d4a78bdca4d6a018b578e/aabababb.aab I
      // 07c: bipush 1
      // 07d: isub
      // 07e: putfield qeaa361f143ee4a0894bd168fd9b30c66/qf4ccf8f5435d4a78bdca4d6a018b578e/aabababb.aab I
      // 081: goto 085
      // 084: athrow
      // 085: aload 1
      // 086: getfield net/minecraft/class_310.field_1724 Lnet/minecraft/class_746;
      // 089: getfield net/minecraft/class_746.field_6235 I
      // 08c: istore 3
      // 08d: iload 2
      // 08e: ifne 11a
      // 091: iload 3
      // 092: ifle 115
      // 095: goto 099
      // 098: athrow
      // 099: aload 0
      // 09a: iload 2
      // 09b: ifne 116
      // 09e: goto 0a2
      // 0a1: athrow
      // 0a2: getfield qeaa361f143ee4a0894bd168fd9b30c66/qf4ccf8f5435d4a78bdca4d6a018b578e/aabababb.aaab I
      // 0a5: ifne 115
      // 0a8: goto 0ac
      // 0ab: athrow
      // 0ac: iload 3
      // 0ad: iload 2
      // 0ae: ifne 11b
      // 0b1: goto 0b5
      // 0b4: athrow
      // 0b5: getstatic qeaa361f143ee4a0894bd168fd9b30c66/qf4ccf8f5435d4a78bdca4d6a018b578e/aabababb.bab J
      // 0b8: l2i
      // 0b9: if_icmplt 115
      // 0bc: goto 0c0
      // 0bf: athrow
      // 0c0: aload 0
      // 0c1: bipush 1
      // 0c2: putfield qeaa361f143ee4a0894bd168fd9b30c66/qf4ccf8f5435d4a78bdca4d6a018b578e/aabababb.ab Z
      // 0c5: iload 2
      // 0c6: ifne 11a
      // 0c9: goto 0cd
      // 0cc: athrow
      // 0cd: aload 0
      // 0ce: getfield qeaa361f143ee4a0894bd168fd9b30c66/qf4ccf8f5435d4a78bdca4d6a018b578e/aabababb.ba Lnet/minecraft/class_1309;
      // 0d1: ifnonnull 115
      // 0d4: goto 0d8
      // 0d7: athrow
      // 0d8: aload 1
      // 0d9: getfield net/minecraft/class_310.field_1724 Lnet/minecraft/class_746;
      // 0dc: invokevirtual net/minecraft/class_746.method_6065 ()Lnet/minecraft/class_1309;
      // 0df: astore 4
      // 0e1: aload 4
      // 0e3: iload 2
      // 0e4: ifne 0f9
      // 0e7: ifnonnull 0f7
      // 0ea: goto 0ee
      // 0ed: athrow
      // 0ee: aload 1
      // 0ef: getfield net/minecraft/class_310.field_1724 Lnet/minecraft/class_746;
      // 0f2: invokevirtual net/minecraft/class_746.method_6124 ()Lnet/minecraft/class_1309;
      // 0f5: astore 4
      // 0f7: aload 4
      // 0f9: iload 2
      // 0fa: ifne 10d
      // 0fd: ifnonnull 10f
      // 100: goto 104
      // 103: athrow
      // 104: aload 0
      // 105: aload 1
      // 106: invokevirtual qeaa361f143ee4a0894bd168fd9b30c66/qf4ccf8f5435d4a78bdca4d6a018b578e/aabababb.bab (Lnet/minecraft/class_310;)Lnet/minecraft/class_1309;
      // 109: goto 10d
      // 10c: athrow
      // 10d: astore 4
      // 10f: aload 0
      // 110: aload 4
      // 112: putfield qeaa361f143ee4a0894bd168fd9b30c66/qf4ccf8f5435d4a78bdca4d6a018b578e/aabababb.ba Lnet/minecraft/class_1309;
      // 115: aload 0
      // 116: iload 3
      // 117: putfield qeaa361f143ee4a0894bd168fd9b30c66/qf4ccf8f5435d4a78bdca4d6a018b578e/aabababb.aaab I
      // 11a: bipush 0
      // 11b: istore 4
      // 11d: aload 0
      // 11e: iload 2
      // 11f: ifne 1e3
      // 122: getfield qeaa361f143ee4a0894bd168fd9b30c66/qf4ccf8f5435d4a78bdca4d6a018b578e/aabababb.ab Z
      // 125: ifeq 1e2
      // 128: goto 12c
      // 12b: athrow
      // 12c: aload 0
      // 12d: getfield qeaa361f143ee4a0894bd168fd9b30c66/qf4ccf8f5435d4a78bdca4d6a018b578e/aabababb.ba Lnet/minecraft/class_1309;
      // 130: astore 5
      // 132: iload 2
      // 133: ifne 14e
      // 136: aload 5
      // 138: ifnonnull 146
      // 13b: goto 13f
      // 13e: athrow
      // 13f: aload 0
      // 140: aload 1
      // 141: invokevirtual qeaa361f143ee4a0894bd168fd9b30c66/qf4ccf8f5435d4a78bdca4d6a018b578e/aabababb.bab (Lnet/minecraft/class_310;)Lnet/minecraft/class_1309;
      // 144: astore 5
      // 146: aload 0
      // 147: invokevirtual qeaa361f143ee4a0894bd168fd9b30c66/qf4ccf8f5435d4a78bdca4d6a018b578e/aabababb.abb ()V
      // 14a: iload 2
      // 14b: ifne 1dd
      // 14e: aload 0
      // 14f: getfield qeaa361f143ee4a0894bd168fd9b30c66/qf4ccf8f5435d4a78bdca4d6a018b578e/aabababb.aab I
      // 152: ifne 1d4
      // 155: aload 0
      // 156: iload 2
      // 157: ifne 1de
      // 15a: goto 15e
      // 15d: athrow
      // 15e: aload 1
      // 15f: aload 5
      // 161: invokevirtual qeaa361f143ee4a0894bd168fd9b30c66/qf4ccf8f5435d4a78bdca4d6a018b578e/aabababb.aaa (Lnet/minecraft/class_310;Lnet/minecraft/class_1309;)Z
      // 164: ifeq 1d4
      // 167: goto 16b
      // 16a: athrow
      // 16b: invokestatic java/lang/Math.random ()D
      // 16e: ldc2_w 100.0
      // 171: dmul
      // 172: aload 0
      // 173: getfield qeaa361f143ee4a0894bd168fd9b30c66/qf4ccf8f5435d4a78bdca4d6a018b578e/aabababb.abb Lqeaa361f143ee4a0894bd168fd9b30c66/qf4ccf8f5435d4a78bdca4d6a018b578e/bababa;
      // 176: invokevirtual qeaa361f143ee4a0894bd168fd9b30c66/qf4ccf8f5435d4a78bdca4d6a018b578e/bababa.abbb ()Ljava/lang/Object;
      // 179: checkcast java/lang/Double
      // 17c: invokevirtual java/lang/Double.doubleValue ()D
      // 17f: dcmpg
      // 180: ifge 1d4
      // 183: goto 187
      // 186: athrow
      // 187: aload 0
      // 188: aload 0
      // 189: getfield qeaa361f143ee4a0894bd168fd9b30c66/qf4ccf8f5435d4a78bdca4d6a018b578e/aabababb.aba Lqeaa361f143ee4a0894bd168fd9b30c66/qf4ccf8f5435d4a78bdca4d6a018b578e/bababa;
      // 18c: invokevirtual qeaa361f143ee4a0894bd168fd9b30c66/qf4ccf8f5435d4a78bdca4d6a018b578e/bababa.abbb ()Ljava/lang/Object;
      // 18f: checkcast java/lang/Double
      // 192: invokevirtual java/lang/Double.intValue ()I
      // 195: putfield qeaa361f143ee4a0894bd168fd9b30c66/qf4ccf8f5435d4a78bdca4d6a018b578e/aabababb.aab I
      // 198: iload 2
      // 199: ifne 1d0
      // 19c: goto 1a0
      // 19f: athrow
      // 1a0: aload 0
      // 1a1: getfield qeaa361f143ee4a0894bd168fd9b30c66/qf4ccf8f5435d4a78bdca4d6a018b578e/aabababb.aa Lqeaa361f143ee4a0894bd168fd9b30c66/qf4ccf8f5435d4a78bdca4d6a018b578e/baabaab;
      // 1a4: invokevirtual qeaa361f143ee4a0894bd168fd9b30c66/qf4ccf8f5435d4a78bdca4d6a018b578e/baabaab.abbb ()Ljava/lang/Object;
      // 1a7: getstatic qeaa361f143ee4a0894bd168fd9b30c66/qf4ccf8f5435d4a78bdca4d6a018b578e/bbbab.aa Lqeaa361f143ee4a0894bd168fd9b30c66/qf4ccf8f5435d4a78bdca4d6a018b578e/bbbab;
      // 1aa: if_acmpne 1c2
      // 1ad: goto 1b1
      // 1b0: athrow
      // 1b1: aload 0
      // 1b2: bipush 1
      // 1b3: putfield qeaa361f143ee4a0894bd168fd9b30c66/qf4ccf8f5435d4a78bdca4d6a018b578e/aabababb.aaaa Z
      // 1b6: iload 2
      // 1b7: aload 0
      // 1b8: bipush 0
      // 1b9: putfield qeaa361f143ee4a0894bd168fd9b30c66/qf4ccf8f5435d4a78bdca4d6a018b578e/aabababb.bbb I
      // 1bc: bipush 1
      // 1bd: istore 4
      // 1bf: ifeq 1e2
      // 1c2: aload 0
      // 1c3: bipush 0
      // 1c4: putfield qeaa361f143ee4a0894bd168fd9b30c66/qf4ccf8f5435d4a78bdca4d6a018b578e/aabababb.aaaa Z
      // 1c7: aload 0
      // 1c8: bipush 1
      // 1c9: putfield qeaa361f143ee4a0894bd168fd9b30c66/qf4ccf8f5435d4a78bdca4d6a018b578e/aabababb.bbb I
      // 1cc: goto 1d0
      // 1cf: athrow
      // 1d0: iload 2
      // 1d1: ifeq 1e2
      // 1d4: aload 0
      // 1d5: bipush 0
      // 1d6: putfield qeaa361f143ee4a0894bd168fd9b30c66/qf4ccf8f5435d4a78bdca4d6a018b578e/aabababb.aaaa Z
      // 1d9: goto 1dd
      // 1dc: athrow
      // 1dd: aload 0
      // 1de: bipush 0
      // 1df: putfield qeaa361f143ee4a0894bd168fd9b30c66/qf4ccf8f5435d4a78bdca4d6a018b578e/aabababb.bbb I
      // 1e2: aload 0
      // 1e3: iload 2
      // 1e4: ifne 211
      // 1e7: getfield qeaa361f143ee4a0894bd168fd9b30c66/qf4ccf8f5435d4a78bdca4d6a018b578e/aabababb.aaaa Z
      // 1ea: ifeq 210
      // 1ed: goto 1f1
      // 1f0: athrow
      // 1f1: iload 4
      // 1f3: iload 2
      // 1f4: ifne 214
      // 1f7: goto 1fb
      // 1fa: athrow
      // 1fb: ifne 210
      // 1fe: goto 202
      // 201: athrow
      // 202: aload 0
      // 203: bipush 0
      // 204: putfield qeaa361f143ee4a0894bd168fd9b30c66/qf4ccf8f5435d4a78bdca4d6a018b578e/aabababb.aaaa Z
      // 207: aload 0
      // 208: bipush 1
      // 209: putfield qeaa361f143ee4a0894bd168fd9b30c66/qf4ccf8f5435d4a78bdca4d6a018b578e/aabababb.bbb I
      // 20c: goto 210
      // 20f: athrow
      // 210: aload 0
      // 211: getfield qeaa361f143ee4a0894bd168fd9b30c66/qf4ccf8f5435d4a78bdca4d6a018b578e/aabababb.bbb I
      // 214: iload 2
      // 215: ifne 220
      // 218: ifle 223
      // 21b: goto 21f
      // 21e: athrow
      // 21f: bipush 1
      // 220: goto 224
      // 223: bipush 0
      // 224: istore 5
      // 226: aload 0
      // 227: getfield qeaa361f143ee4a0894bd168fd9b30c66/qf4ccf8f5435d4a78bdca4d6a018b578e/aabababb.bbb I
      // 22a: iload 2
      // 22b: ifne 245
      // 22e: ifle 243
      // 231: goto 235
      // 234: athrow
      // 235: aload 0
      // 236: dup
      // 237: getfield qeaa361f143ee4a0894bd168fd9b30c66/qf4ccf8f5435d4a78bdca4d6a018b578e/aabababb.bbb I
      // 23a: bipush 1
      // 23b: isub
      // 23c: putfield qeaa361f143ee4a0894bd168fd9b30c66/qf4ccf8f5435d4a78bdca4d6a018b578e/aabababb.bbb I
      // 23f: goto 243
      // 242: athrow
      // 243: iload 5
      // 245: ireturn
   }

   private boolean bb(class_1657 param1, class_1309 param2) {
      // $VF: Couldn't be decompiled
      // Please report this to the Vineflower issue tracker, at https://github.com/Vineflower/vineflower/issues with a copy of the class file (if you have the rights to distribute it!)
      // java.lang.RuntimeException: parsing failure!
      //   at org.jetbrains.java.decompiler.modules.decompiler.decompose.DomHelper.parseGraph(DomHelper.java:211)
      //   at org.jetbrains.java.decompiler.main.rels.MethodProcessor.codeToJava(MethodProcessor.java:166)
      //
      // Bytecode:
      // 00: aload 2
      // 01: invokevirtual net/minecraft/class_1309.method_23317 ()D
      // 04: aload 1
      // 05: invokevirtual net/minecraft/class_1657.method_23317 ()D
      // 08: dsub
      // 09: dstore 4
      // 0b: getstatic qeaa361f143ee4a0894bd168fd9b30c66/qf4ccf8f5435d4a78bdca4d6a018b578e/baaabbaa.bba I
      // 0e: aload 2
      // 0f: invokevirtual net/minecraft/class_1309.method_23321 ()D
      // 12: aload 1
      // 13: invokevirtual net/minecraft/class_1657.method_23321 ()D
      // 16: dsub
      // 17: dstore 6
      // 19: istore 3
      // 1a: dload 4
      // 1c: dload 4
      // 1e: dmul
      // 1f: iload 3
      // 20: ifne 45
      // 23: dload 6
      // 25: dload 6
      // 27: dmul
      // 28: dadd
      // 29: ldc2_w 1.0E-6
      // 2c: dcmpg
      // 2d: ifge 37
      // 30: goto 34
      // 33: athrow
      // 34: bipush 1
      // 35: ireturn
      // 36: athrow
      // 37: dload 6
      // 39: dload 4
      // 3b: invokestatic java/lang/Math.atan2 (DD)D
      // 3e: invokestatic java/lang/Math.toDegrees (D)D
      // 41: ldc2_w 90.0
      // 44: dsub
      // 45: d2f
      // 46: fstore 8
      // 48: fload 8
      // 4a: aload 1
      // 4b: invokevirtual net/minecraft/class_1657.method_36454 ()F
      // 4e: fsub
      // 4f: invokestatic net/minecraft/class_3532.method_15393 (F)F
      // 52: invokestatic java/lang/Math.abs (F)F
      // 55: ldc_w 90.0
      // 58: fcmpg
      // 59: iload 3
      // 5a: ifne 65
      // 5d: ifgt 68
      // 60: goto 64
      // 63: athrow
      // 64: bipush 1
      // 65: goto 69
      // 68: bipush 0
      // 69: ireturn
   }

   @Override
   public void aabaa() {
      this.aa(class_310.method_1551(), false);
      this.ab();
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
      // 00: getstatic qeaa361f143ee4a0894bd168fd9b30c66/qf4ccf8f5435d4a78bdca4d6a018b578e/baaabbaa.bba I
      // 03: istore 1
      // 04: iload 1
      // 05: invokestatic net/minecraft/class_310.method_1551 ()Lnet/minecraft/class_310;
      // 08: astore 2
      // 09: ifne 4f
      // 0c: aload 2
      // 0d: ifnull 45
      // 10: goto 14
      // 13: athrow
      // 14: aload 2
      // 15: iload 1
      // 16: ifne 2c
      // 19: goto 1d
      // 1c: athrow
      // 1d: getfield net/minecraft/class_310.field_1724 Lnet/minecraft/class_746;
      // 20: ifnull 45
      // 23: goto 27
      // 26: athrow
      // 27: aload 2
      // 28: goto 2c
      // 2b: athrow
      // 2c: iload 1
      // 2d: ifne 3f
      // 30: getfield net/minecraft/class_310.field_1755 Lnet/minecraft/class_437;
      // 33: ifnonnull 45
      // 36: goto 3a
      // 39: athrow
      // 3a: aload 2
      // 3b: goto 3f
      // 3e: athrow
      // 3f: invokevirtual net/minecraft/class_310.method_1569 ()Z
      // 42: ifne 53
      // 45: aload 0
      // 46: aload 2
      // 47: bipush 0
      // 48: invokevirtual qeaa361f143ee4a0894bd168fd9b30c66/qf4ccf8f5435d4a78bdca4d6a018b578e/aabababb.aa (Lnet/minecraft/class_310;Z)V
      // 4b: goto 4f
      // 4e: athrow
      // 4f: aload 0
      // 50: invokevirtual qeaa361f143ee4a0894bd168fd9b30c66/qf4ccf8f5435d4a78bdca4d6a018b578e/aabababb.ab ()V
      // 53: return
   }

   private boolean aaa(class_310 param1, class_1309 param2) {
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
      // 06: ifne 18
      // 09: getfield net/minecraft/class_310.field_1724 Lnet/minecraft/class_746;
      // 0c: ifnull 3f
      // 0f: goto 13
      // 12: athrow
      // 13: aload 1
      // 14: goto 18
      // 17: athrow
      // 18: getfield net/minecraft/class_310.field_1724 Lnet/minecraft/class_746;
      // 1b: invokevirtual net/minecraft/class_746.method_24828 ()Z
      // 1e: iload 3
      // 1f: ifne 44
      // 22: ifeq 3f
      // 25: goto 29
      // 28: athrow
      // 29: aload 1
      // 2a: getfield net/minecraft/class_310.field_1724 Lnet/minecraft/class_746;
      // 2d: iload 3
      // 2e: ifne 46
      // 31: goto 35
      // 34: athrow
      // 35: invokevirtual net/minecraft/class_746.method_6115 ()Z
      // 38: ifeq 45
      // 3b: goto 3f
      // 3e: athrow
      // 3f: bipush 0
      // 40: goto 44
      // 43: athrow
      // 44: ireturn
      // 45: aload 2
      // 46: iload 3
      // 47: ifne 67
      // 4a: aload 1
      // 4b: getfield net/minecraft/class_310.field_1724 Lnet/minecraft/class_746;
      // 4e: if_acmpne 58
      // 51: goto 55
      // 54: athrow
      // 55: bipush 0
      // 56: ireturn
      // 57: athrow
      // 58: aload 0
      // 59: iload 3
      // 5a: ifne 8d
      // 5d: getfield qeaa361f143ee4a0894bd168fd9b30c66/qf4ccf8f5435d4a78bdca4d6a018b578e/aabababb.bb Lqeaa361f143ee4a0894bd168fd9b30c66/qf4ccf8f5435d4a78bdca4d6a018b578e/abbaaaaa;
      // 60: invokevirtual qeaa361f143ee4a0894bd168fd9b30c66/qf4ccf8f5435d4a78bdca4d6a018b578e/abbaaaaa.abbb ()Ljava/lang/Object;
      // 63: goto 67
      // 66: athrow
      // 67: checkcast java/lang/Boolean
      // 6a: invokevirtual java/lang/Boolean.booleanValue ()Z
      // 6d: ifeq 86
      // 70: aload 2
      // 71: iload 3
      // 72: ifne 8d
      // 75: goto 79
      // 78: athrow
      // 79: instanceof net/minecraft/class_1657
      // 7c: ifne 86
      // 7f: goto 83
      // 82: athrow
      // 83: bipush 0
      // 84: ireturn
      // 85: athrow
      // 86: aload 0
      // 87: getfield qeaa361f143ee4a0894bd168fd9b30c66/qf4ccf8f5435d4a78bdca4d6a018b578e/aabababb.baa Lqeaa361f143ee4a0894bd168fd9b30c66/qf4ccf8f5435d4a78bdca4d6a018b578e/abbaaaaa;
      // 8a: invokevirtual qeaa361f143ee4a0894bd168fd9b30c66/qf4ccf8f5435d4a78bdca4d6a018b578e/abbaaaaa.abbb ()Ljava/lang/Object;
      // 8d: checkcast java/lang/Boolean
      // 90: invokevirtual java/lang/Boolean.booleanValue ()Z
      // 93: iload 3
      // 94: ifne c5
      // 97: ifeq c4
      // 9a: goto 9e
      // 9d: athrow
      // 9e: aload 2
      // 9f: ifnull c2
      // a2: goto a6
      // a5: athrow
      // a6: aload 0
      // a7: aload 1
      // a8: getfield net/minecraft/class_310.field_1724 Lnet/minecraft/class_746;
      // ab: aload 2
      // ac: invokevirtual qeaa361f143ee4a0894bd168fd9b30c66/qf4ccf8f5435d4a78bdca4d6a018b578e/aabababb.bb (Lnet/minecraft/class_1657;Lnet/minecraft/class_1309;)Z
      // af: iload 3
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
      // c4: bipush 1
      // c5: ireturn
   }

   private static String aab(int var0, int var1) {
      int var9 = 1196911089;
      int var2 = (var0 ^ a(-1488210912, var9 ^ 1824045400)) & a(-1488210905, var9 ^ 2023891291);
      if (bba[var2] == null) {
         char[] var3 = aaa[var2].toCharArray();

         int var4 = switch (var3[0] & a(-1488210906, var9 ^ 1941812016)) {
            case 0 -> a(-1488210907, var9 ^ -178761351);
            case 1 -> a(-1488210908, var9 ^ 1085278901);
            case 2 -> 4;
            case 3 -> a(-1488210885, var9 ^ -1307363760);
            case 4 -> a(-1488210886, var9 ^ 2023564817);
            case 5 -> a(-1488210887, var9 ^ 858674437);
            case 6 -> a(-1488210888, var9 ^ -2037429497);
            case 7 -> a(-1488210881, var9 ^ 1033130538);
            case 8 -> a(-1488210882, var9 ^ -1336299715);
            case 9 -> a(-1488210883, var9 ^ -1119684170);
            case 10 -> a(-1488210884, var9 ^ -1415689237);
            case 11 -> a(-1488210893, var9 ^ 1798904057);
            case 12 -> a(-1488210894, var9 ^ -1941541854);
            case 13 -> a(-1488210895, var9 ^ 2104874518);
            case 14 -> a(-1488210896, var9 ^ 1752346160);
            case 15 -> a(-1488210889, var9 ^ -1822874987);
            case 16 -> a(-1488210890, var9 ^ 1671196133);
            case 17 -> a(-1488210891, var9 ^ 1767984451);
            case 18 -> a(-1488210892, var9 ^ 1319658820);
            case 19 -> a(-1488210933, var9 ^ -1763791872);
            case 20 -> a(-1488210934, var9 ^ -505551383);
            case 21 -> a(-1488210935, var9 ^ -320012503);
            case 22 -> a(-1488210936, var9 ^ -164270369);
            case 23 -> a(-1488210929, var9 ^ -1725190270);
            case 24 -> a(-1488210930, var9 ^ -950026298);
            case 25 -> a(-1488210931, var9 ^ -2049768582);
            case 26 -> a(-1488210932, var9 ^ 84874260);
            case 27 -> a(-1488210941, var9 ^ -1365626103);
            case 28 -> a(-1488210942, var9 ^ 2112187075);
            case 29 -> a(-1488210943, var9 ^ -168674187);
            case 30 -> a(-1488210944, var9 ^ 210476425);
            case 31 -> a(-1488210937, var9 ^ 581203473);
            case 32 -> a(-1488210938, var9 ^ 371578413);
            case 33 -> a(-1488210939, var9 ^ -1838678564);
            case 34 -> a(-1488210940, var9 ^ 1813325259);
            case 35 -> a(-1488210917, var9 ^ -1061460362);
            case 36 -> a(-1488210918, var9 ^ -1750150859);
            case 37 -> a(-1488210919, var9 ^ 1159095119);
            case 38 -> a(-1488210920, var9 ^ 414334496);
            case 39 -> a(-1488210913, var9 ^ 2042145976);
            case 40 -> 1;
            case 41 -> a(-1488210914, var9 ^ -1834948339);
            case 42 -> a(-1488210915, var9 ^ 106589858);
            case 43 -> a(-1488210916, var9 ^ -1410056771);
            case 44 -> a(-1488210925, var9 ^ 156638899);
            case 45 -> a(-1488210926, var9 ^ 480439779);
            case 46 -> a(-1488210927, var9 ^ -505076680);
            case 47 -> a(-1488210928, var9 ^ -271577183);
            case 48 -> a(-1488210921, var9 ^ -65649579);
            case 49 -> a(-1488210922, var9 ^ 1162129005);
            case 50 -> a(-1488210923, var9 ^ -1859162645);
            case 51 -> a(-1488210924, var9 ^ 1243769772);
            case 52 -> a(-1488210837, var9 ^ 856711981);
            case 53 -> a(-1488210838, var9 ^ -1744658023);
            case 54 -> a(-1488210839, var9 ^ -1978622282);
            case 55 -> a(-1488210840, var9 ^ -826790232);
            case 56 -> a(-1488210833, var9 ^ -716020840);
            case 57 -> a(-1488210834, var9 ^ 550952269);
            case 58 -> a(-1488210835, var9 ^ -329803706);
            case 59 -> a(-1488210836, var9 ^ -171262613);
            case 60 -> a(-1488210845, var9 ^ 1536591848);
            case 61 -> a(-1488210846, var9 ^ -1175561980);
            case 62 -> a(-1488210847, var9 ^ -825258021);
            case 63 -> a(-1488210848, var9 ^ -1809851297);
            case 64 -> a(-1488210841, var9 ^ 321762293);
            case 65 -> a(-1488210842, var9 ^ 1735901876);
            case 66 -> a(-1488210843, var9 ^ 534949027);
            case 67 -> a(-1488210844, var9 ^ -1573323501);
            case 68 -> a(-1488210821, var9 ^ -371554567);
            case 69 -> a(-1488210822, var9 ^ 1272276909);
            case 70 -> a(-1488210823, var9 ^ 147219251);
            case 71 -> a(-1488210824, var9 ^ 947535168);
            case 72 -> a(-1488210817, var9 ^ -1668820618);
            case 73 -> a(-1488210818, var9 ^ 2138749542);
            case 74 -> a(-1488210819, var9 ^ -536700430);
            case 75 -> a(-1488210820, var9 ^ 959539408);
            case 76 -> a(-1488210829, var9 ^ -8674550);
            case 77 -> a(-1488210830, var9 ^ 1317521353);
            case 78 -> a(-1488210831, var9 ^ -1687877924);
            case 79 -> a(-1488210832, var9 ^ 329476425);
            case 80 -> a(-1488210825, var9 ^ -504924901);
            case 81 -> a(-1488210826, var9 ^ 1152375270);
            case 82 -> a(-1488210827, var9 ^ -873231165);
            case 83 -> 2;
            case 84 -> a(-1488210828, var9 ^ -288865403);
            case 85 -> a(-1488210869, var9 ^ -1169850174);
            case 86 -> a(-1488210870, var9 ^ -1937567237);
            case 87 -> a(-1488210871, var9 ^ -704969667);
            case 88 -> a(-1488210872, var9 ^ 1885404912);
            case 89 -> a(-1488210865, var9 ^ 757748034);
            case 90 -> a(-1488210866, var9 ^ 1403211232);
            case 91 -> a(-1488210867, var9 ^ -1120835771);
            case 92 -> a(-1488210868, var9 ^ -704853535);
            case 93 -> a(-1488210877, var9 ^ 2004535320);
            case 94 -> 5;
            case 95 -> a(-1488210878, var9 ^ 1178212);
            case 96 -> a(-1488210879, var9 ^ -827525225);
            case 97 -> a(-1488210880, var9 ^ 1215547196);
            case 98 -> a(-1488210873, var9 ^ 109726689);
            case 99 -> a(-1488210874, var9 ^ -782436839);
            case 100 -> a(-1488210875, var9 ^ -1971911560);
            case 101 -> a(-1488210876, var9 ^ -1093695921);
            case 102 -> 0;
            case 103 -> a(-1488210853, var9 ^ -1590117934);
            case 104 -> a(-1488210854, var9 ^ -1005364869);
            case 105 -> a(-1488210855, var9 ^ -197216395);
            case 106 -> a(-1488210856, var9 ^ 2026850617);
            case 107 -> a(-1488210849, var9 ^ -2087511743);
            case 108 -> a(-1488210850, var9 ^ 542409274);
            case 109 -> a(-1488210851, var9 ^ -2038294508);
            case 110 -> a(-1488210852, var9 ^ 81003061);
            case 111 -> a(-1488210861, var9 ^ -906585273);
            case 112 -> a(-1488210862, var9 ^ -1719186380);
            case 113 -> a(-1488210863, var9 ^ -1010953244);
            case 114 -> a(-1488210864, var9 ^ 1308904035);
            case 115 -> a(-1488210857, var9 ^ -1288412296);
            case 116 -> a(-1488210858, var9 ^ -1261598245);
            case 117 -> a(-1488210859, var9 ^ -1492186301);
            case 118 -> a(-1488210860, var9 ^ 1027211714);
            case 119 -> a(-1488210773, var9 ^ 1321897326);
            case 120 -> a(-1488210774, var9 ^ -1856560092);
            case 121 -> a(-1488210775, var9 ^ -342043636);
            case 122 -> a(-1488210776, var9 ^ -82567059);
            case 123 -> a(-1488210769, var9 ^ -1605411320);
            case 124 -> a(-1488210770, var9 ^ 117993997);
            case 125 -> a(-1488210771, var9 ^ 2096732527);
            case 126 -> a(-1488210772, var9 ^ -1229046395);
            case 127 -> a(-1488210781, var9 ^ 1702107068);
            case 128 -> a(-1488210782, var9 ^ -932427469);
            case 129 -> a(-1488210783, var9 ^ -982211245);
            case 130 -> a(-1488210784, var9 ^ 1312804488);
            case 131 -> a(-1488210777, var9 ^ 1426433672);
            case 132 -> a(-1488210778, var9 ^ -410964255);
            case 133 -> a(-1488210779, var9 ^ 1584745914);
            case 134 -> a(-1488210780, var9 ^ -215925005);
            case 135 -> a(-1488210757, var9 ^ 1953808092);
            case 136 -> a(-1488210758, var9 ^ 38363922);
            case 137 -> a(-1488210759, var9 ^ -739785343);
            case 138 -> a(-1488210760, var9 ^ -377793151);
            case 139 -> a(-1488210753, var9 ^ -1539522907);
            case 140 -> a(-1488210754, var9 ^ 1550297568);
            case 141 -> a(-1488210755, var9 ^ -758239835);
            case 142 -> a(-1488210756, var9 ^ -1416211748);
            case 143 -> a(-1488210765, var9 ^ -1043919469);
            case 144 -> a(-1488210766, var9 ^ -1831996120);
            case 145 -> a(-1488210767, var9 ^ -479672346);
            case 146 -> a(-1488210768, var9 ^ 305078998);
            case 147 -> a(-1488210761, var9 ^ 54469850);
            case 148 -> a(-1488210762, var9 ^ 75070827);
            case 149 -> a(-1488210763, var9 ^ -2052059619);
            case 150 -> a(-1488210764, var9 ^ -1100884832);
            case 151 -> a(-1488210805, var9 ^ -195141483);
            case 152 -> a(-1488210806, var9 ^ 1157762225);
            case 153 -> a(-1488210807, var9 ^ -909207145);
            case 154 -> a(-1488210808, var9 ^ 1587180205);
            case 155 -> a(-1488210801, var9 ^ -2141688139);
            case 156 -> a(-1488210802, var9 ^ -394240233);
            case 157 -> a(-1488210803, var9 ^ 384740703);
            case 158 -> a(-1488210804, var9 ^ 824970157);
            case 159 -> a(-1488210813, var9 ^ 1108267980);
            case 160 -> a(-1488210814, var9 ^ 161089040);
            case 161 -> a(-1488210815, var9 ^ -1772169120);
            case 162 -> a(-1488210816, var9 ^ -819930213);
            case 163 -> a(-1488210809, var9 ^ 406374349);
            case 164 -> a(-1488210810, var9 ^ 64821669);
            case 165 -> a(-1488210811, var9 ^ 422564933);
            case 166 -> a(-1488210812, var9 ^ 27499558);
            case 167 -> a(-1488210789, var9 ^ 582158826);
            case 168 -> a(-1488210790, var9 ^ -1383957302);
            case 169 -> a(-1488210791, var9 ^ 1696378071);
            case 170 -> a(-1488210792, var9 ^ -1126805336);
            case 171 -> a(-1488210785, var9 ^ -1737735989);
            case 172 -> a(-1488210786, var9 ^ 1330442189);
            case 173 -> a(-1488210787, var9 ^ 942527309);
            case 174 -> a(-1488210788, var9 ^ 761156359);
            case 175 -> a(-1488210797, var9 ^ 700352660);
            case 176 -> a(-1488210798, var9 ^ -379274084);
            case 177 -> 3;
            case 178 -> a(-1488210799, var9 ^ 448149192);
            case 179 -> a(-1488210800, var9 ^ 1483122883);
            case 180 -> a(-1488210793, var9 ^ 123723712);
            case 181 -> a(-1488210794, var9 ^ 519773906);
            case 182 -> a(-1488210795, var9 ^ 521199015);
            case 183 -> a(-1488210796, var9 ^ -2067017206);
            case 184 -> a(-1488210709, var9 ^ 1392291280);
            case 185 -> a(-1488210710, var9 ^ 1572186550);
            case 186 -> a(-1488210711, var9 ^ -1326711606);
            case 187 -> a(-1488210712, var9 ^ 1782235465);
            case 188 -> a(-1488210705, var9 ^ -2062398093);
            case 189 -> a(-1488210706, var9 ^ 1557152228);
            case 190 -> a(-1488210707, var9 ^ -72500188);
            case 191 -> a(-1488210708, var9 ^ 1834553583);
            case 192 -> a(-1488210717, var9 ^ 1607712553);
            case 193 -> a(-1488210718, var9 ^ 86875369);
            case 194 -> a(-1488210719, var9 ^ 2000629371);
            case 195 -> a(-1488210720, var9 ^ 1835366597);
            case 196 -> a(-1488210713, var9 ^ -1052004508);
            case 197 -> a(-1488210714, var9 ^ 2118404637);
            case 198 -> a(-1488210715, var9 ^ 46626271);
            case 199 -> a(-1488210716, var9 ^ 1765644662);
            case 200 -> a(-1488210693, var9 ^ 1769316310);
            case 201 -> a(-1488210694, var9 ^ 360309624);
            case 202 -> a(-1488210695, var9 ^ -437763790);
            case 203 -> a(-1488210696, var9 ^ -429105402);
            case 204 -> a(-1488210689, var9 ^ -656150208);
            case 205 -> a(-1488210690, var9 ^ -1807624467);
            case 206 -> a(-1488210691, var9 ^ -1525154933);
            case 207 -> a(-1488210692, var9 ^ 1210158100);
            case 208 -> a(-1488210701, var9 ^ 1715487424);
            case 209 -> a(-1488210702, var9 ^ -1112212919);
            case 210 -> a(-1488210703, var9 ^ -913695320);
            case 211 -> a(-1488210704, var9 ^ -513770301);
            case 212 -> a(-1488210697, var9 ^ 1743155294);
            case 213 -> a(-1488210698, var9 ^ -610029833);
            case 214 -> a(-1488210699, var9 ^ 257432786);
            case 215 -> a(-1488210700, var9 ^ -290476053);
            case 216 -> a(-1488210741, var9 ^ -269545123);
            case 217 -> a(-1488210742, var9 ^ -1005295303);
            case 218 -> a(-1488210743, var9 ^ 1836164482);
            case 219 -> a(-1488210744, var9 ^ 598515922);
            case 220 -> a(-1488210737, var9 ^ 1252503500);
            case 221 -> a(-1488210738, var9 ^ 1918232518);
            case 222 -> a(-1488210739, var9 ^ 646145702);
            case 223 -> a(-1488210740, var9 ^ 1523549571);
            case 224 -> a(-1488210749, var9 ^ -969165960);
            case 225 -> a(-1488210750, var9 ^ 1801925715);
            case 226 -> a(-1488210751, var9 ^ 538162294);
            case 227 -> a(-1488210752, var9 ^ 940915820);
            case 228 -> a(-1488210745, var9 ^ 426347259);
            case 229 -> a(-1488210746, var9 ^ -1119699217);
            case 230 -> a(-1488210747, var9 ^ -1911711804);
            case 231 -> a(-1488210748, var9 ^ -1747925475);
            case 232 -> a(-1488210725, var9 ^ 1985246260);
            case 233 -> a(-1488210726, var9 ^ -1404613188);
            case 234 -> a(-1488210727, var9 ^ -1009343521);
            case 235 -> a(-1488210728, var9 ^ -176585496);
            case 236 -> a(-1488210721, var9 ^ -1738657969);
            case 237 -> a(-1488210722, var9 ^ 317190150);
            case 238 -> a(-1488210723, var9 ^ 738530015);
            case 239 -> a(-1488210724, var9 ^ -2078865761);
            case 240 -> a(-1488210733, var9 ^ 659390851);
            case 241 -> a(-1488210734, var9 ^ 2023633537);
            case 242 -> a(-1488210735, var9 ^ 894536574);
            case 243 -> a(-1488210736, var9 ^ 1490029567);
            case 244 -> a(-1488210729, var9 ^ -664460739);
            case 245 -> a(-1488210730, var9 ^ 1225495208);
            case 246 -> a(-1488210731, var9 ^ 737235370);
            case 247 -> a(-1488210732, var9 ^ -2030847146);
            case 248 -> a(-1488210645, var9 ^ 442476815);
            case 249 -> a(-1488210646, var9 ^ 1497949107);
            case 250 -> a(-1488210647, var9 ^ 1997468920);
            case 251 -> a(-1488210648, var9 ^ -1872454992);
            case 252 -> a(-1488210641, var9 ^ -853315676);
            case 253 -> a(-1488210642, var9 ^ -1320285136);
            case 254 -> a(-1488210643, var9 ^ 374241753);
            default -> a(-1488210644, var9 ^ -676776500);
         };
         int var5 = (var1 & a(-1488210653, var9 ^ 337737432)) - var4;
         if (var5 < 0) {
            var5 += 256;
         }

         int var6 = ((var1 & a(-1488210654, var9 ^ -1304509287)) >>> a(-1488210655, var9 ^ -1992286819)) - var4;
         if (var6 < 0) {
            var6 += 256;
         }

         for (int var7 = 0; var7 < var3.length; var7++) {
            int var8 = var7 % 2;
            char var10002 = var3[var7];
            if (var8 == 0) {
               var3[var7] = (char)(var10002 ^ var5);
               var5 = ((var5 >>> 3 | var5 << 5) ^ var3[var7]) & a(-1488210656, var9 ^ -2123610913);
            } else {
               var3[var7] = (char)(var10002 ^ var6);
               var6 = ((var6 >>> 3 | var6 << 5) ^ var3[var7]) & a(-1488210649, var9 ^ 1923675864);
            }
         }

         bba[var2] = new String(var3).intern();
      }

      return bba[var2];
   }

   public void aba(class_1282 param1) {
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
      // 05: invokevirtual qeaa361f143ee4a0894bd168fd9b30c66/qf4ccf8f5435d4a78bdca4d6a018b578e/aabababb.babbaab ()Z
      // 08: ifne 0d
      // 0b: return
      // 0c: athrow
      // 0d: aload 1
      // 0e: iload 2
      // 0f: ifne 1f
      // 12: ifnonnull 1e
      // 15: goto 19
      // 18: athrow
      // 19: aconst_null
      // 1a: goto 22
      // 1d: athrow
      // 1e: aload 1
      // 1f: invokevirtual net/minecraft/class_1282.method_5529 ()Lnet/minecraft/class_1297;
      // 22: astore 3
      // 23: aload 3
      // 24: ifnonnull 3c
      // 27: aload 1
      // 28: iload 2
      // 29: ifne 38
      // 2c: goto 30
      // 2f: athrow
      // 30: ifnull 3c
      // 33: goto 37
      // 36: athrow
      // 37: aload 1
      // 38: invokevirtual net/minecraft/class_1282.method_5526 ()Lnet/minecraft/class_1297;
      // 3b: astore 3
      // 3c: aload 0
      // 3d: aload 3
      // 3e: iload 2
      // 3f: ifne 51
      // 42: instanceof net/minecraft/class_1309
      // 45: ifeq 5b
      // 48: goto 4c
      // 4b: athrow
      // 4c: aload 3
      // 4d: goto 51
      // 50: athrow
      // 51: checkcast net/minecraft/class_1309
      // 54: astore 4
      // 56: aload 4
      // 58: goto 5c
      // 5b: aconst_null
      // 5c: putfield qeaa361f143ee4a0894bd168fd9b30c66/qf4ccf8f5435d4a78bdca4d6a018b578e/aabababb.ba Lnet/minecraft/class_1309;
      // 5f: aload 0
      // 60: bipush 1
      // 61: putfield qeaa361f143ee4a0894bd168fd9b30c66/qf4ccf8f5435d4a78bdca4d6a018b578e/aabababb.ab Z
      // 64: return
   }

   private void abb() {
      this.ab = false;
      this.ba = null;
   }

   private static int a(int var0, int var1) {
      int var2 = aabb[var0 ^ -1488210901] ^ var1 ^ var0;
      var2 -= 23663;
      var2 ^= 37868;
      var2 -= 49362;
      var2 += 21518;
      var2 -= 40380;
      var2 ^= 38235;
      var2 -= 21342;
      var2 ^= 3660;
      return var2 ^ 49208;
   }

   private class_1309 bab(class_310 param1) {
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
      // 09: ifnull 2a
      // 0c: goto 10
      // 0f: athrow
      // 10: aload 1
      // 11: iload 2
      // 12: ifne 24
      // 15: getfield net/minecraft/class_310.field_1687 Lnet/minecraft/class_638;
      // 18: ifnull 2a
      // 1b: goto 1f
      // 1e: athrow
      // 1f: aload 1
      // 20: goto 24
      // 23: athrow
      // 24: getfield net/minecraft/class_310.field_1724 Lnet/minecraft/class_746;
      // 27: ifnonnull 2d
      // 2a: aconst_null
      // 2b: areturn
      // 2c: athrow
      // 2d: aconst_null
      // 2e: astore 3
      // 2f: ldc2_w 36.0
      // 32: dstore 4
      // 34: aload 1
      // 35: getfield net/minecraft/class_310.field_1687 Lnet/minecraft/class_638;
      // 38: invokevirtual net/minecraft/class_638.method_18456 ()Ljava/util/List;
      // 3b: invokeinterface java/util/List.iterator ()Ljava/util/Iterator; 1
      // 40: astore 6
      // 42: aload 6
      // 44: invokeinterface java/util/Iterator.hasNext ()Z 1
      // 49: ifeq b0
      // 4c: aload 6
      // 4e: invokeinterface java/util/Iterator.next ()Ljava/lang/Object; 1
      // 53: checkcast net/minecraft/class_1657
      // 56: iload 2
      // 57: ifne b1
      // 5a: astore 7
      // 5c: aload 7
      // 5e: iload 2
      // 5f: ifne 6b
      // 62: ifnull 42
      // 65: goto 69
      // 68: athrow
      // 69: aload 7
      // 6b: iload 2
      // 6c: ifne 7c
      // 6f: aload 1
      // 70: getfield net/minecraft/class_310.field_1724 Lnet/minecraft/class_746;
      // 73: if_acmpeq 42
      // 76: goto 7a
      // 79: athrow
      // 7a: aload 7
      // 7c: invokevirtual net/minecraft/class_1657.method_5805 ()Z
      // 7f: ifne 8a
      // 82: iload 2
      // 83: ifeq 42
      // 86: goto 8a
      // 89: athrow
      // 8a: aload 1
      // 8b: getfield net/minecraft/class_310.field_1724 Lnet/minecraft/class_746;
      // 8e: aload 7
      // 90: invokevirtual net/minecraft/class_746.method_5858 (Lnet/minecraft/class_1297;)D
      // 93: dstore 8
      // 95: iload 2
      // 96: ifne a9
      // 99: dload 8
      // 9b: dload 4
      // 9d: dcmpg
      // 9e: ifge ac
      // a1: goto a5
      // a4: athrow
      // a5: dload 8
      // a7: dstore 4
      // a9: aload 7
      // ab: astore 3
      // ac: iload 2
      // ad: ifeq 42
      // b0: aload 3
      // b1: areturn
   }

   // $VF: Irreducible bytecode was duplicated to produce valid code
   static {
      int var20 = 1056372080;
      byte var16 = -1;
      String var10 = "㻪㺄㻟㻏㺹㸪㸓㸥㻯㸶㻏㸩㻀㸂㹄㻫㹲㻕㻫㺢㺡㺅㺄㻻㹕㺪㹊㻧㻩㸤㸏㸗㸪㺯㺊㸡㸠㺡㹠㻜㺇㺛㹇㹐㻙㹔㻣㺈㺂㺚㺱㻳㻳㻩㺐㺓㻼㹇㻻㹠㻦㺊㹃㻯㸫㸝㻜㸳㹾㺎㹚㺋㺱㺺㹅㹸㸳㸓㺕㸷㻗㸆㻸㻣㺄㻅㻤㻴㹹㸑㻡㻘㸃㺵㹛㻉㹲㹗㻲㹓㻊㻐㻨㺲㻰㺗㹆㺃㻃㻧㸂㺷㻂㸲㻦㻎㹲㻮㹄㹂㸟㹴㸶㸢㺩㻰㻌㹌㺸㹊㻵㸭㺼㸯㺌㹭㻪㸪㻮㹛㺉㸡\ua7e4ꞕ\ua7cdꝌꞩꝅꝥꞷꝥ\ua7ceꞘꝊ\ua7e7Ꞩ꜊꜓\ua7daꝷꞄꝺ\ua7dc\ua7e5ꝶꞔꜿ꞊\ua7cfꝧ꜎ꝀꝖꝡꟵꞒꟉ\ua7cc\ua7eeꝓꞓꞰꟃꝉꞸꝝꟗ";
      char[] var11 = "ۼٟ".toCharArray();
      short var9 = 1650;
      String[] var12 = new String[var11.length];

      while (true) {
         int var13 = 0;
         int var14 = 0;
         int var15 = 0;
         if (var16 == 0) {
            abaa = var12;
            abab = new Object[var12.length];
            byte var24 = 0;
            int var10001 = 0;
            aabb = new int[287];
            byte[] var10002 = "\u0080ÿ\u00ad,r\nåÔÍ¥.\u000f8-}VL\u00adÏ\u008aá:OQ$\u0006\u001dó\u0005DM\u009b\u008aþs§+Fw\u0013EÁ\u0090ÀFY/LR@\u0002\u0092Y\\õøß¹\u0017äjQk¾\u0098òq?R|GT\u0019Ï4}¬n\rÃ\u0017u\u0014q\u009a¸Î>\u0097£\u0098\u0082\u0081\u007f\f\u008dAØ^g¦§*ªW\u0094\u0090EB\u0093éR¹¸C¦I}\føC\u0080,¯dI#û¼?ÍÚË<\u0084;Æ\r¹ÎÜÔ\u000f\u001b³ÊÎ[í¾ùS¯2E\u0010/îR\u0090\u0084{u\u0080W\u0004,^ß\u0013]J&jüS\bE\u0017`<Ä·\u0007¸\u0086»vFôD£êZ\u0007¹½O°\u0014o÷%N2Sx\u0088SYÍß¸A¯¨,»(T\u0081\u0015{½#·\u007f\u00936C\u008cÁË\u0004b\u0090Å1I\u001dÖ÷\u0002#o¥è¶»Î+k`Ã-1\u0019ñ%\u0086²ãçu ñÙ\u0087äYh&ÿ³\u0002Þ\n7\u009b\u0095Æ¶ÞBß+ûóqwæ\u008b\u0093\u000f8Wä.É)¾þ\u009bs9ÌÒ«M\u0096\u0085\u00815\u0003ê½\u0088Ù»ßÃ;çÈa4\u0006\u0098\"'%^\u0012\u009b{\"¶f\u0097cU\u009bÛfÊãßé\u0013Ð\t\u009aÕ\u009aÂzdf\u0081Y±\u0084gÞ9B/¼Ë\u00063ÆnN¸çá\u0012íöÄ)\u0005\b\u0090¤áË¦bWNÿ\u001ae©Z\u0081¸Ö\u0007Ë\u0017\u0081yB\u000b7\u0097Ð!|ÿ\u001d\u008fJ]\u009b\u008eÔ*ð½qäM±Qb\u0092¦I,k\r7û½°4 \u0096Cd\u0094.Àc\u008bÙØ\u0081îò8\u0019Þßñ R.\u000e7©r_ñ\nµã ¬cy<.5cGã\u0017Ý§³f\n\u009cé_U¥då+\u0013\u0099Õ\u0002i\u009e,Ï\u0098\u008dîLJ\u0017ÛG8d+ì¸»¶b9Á}\u0092cÑõAÄ\u008a®\u0018\\-é4½V\u0018ßU\u009c_{ÔO\u0095QÚâ\u008d\u000f\u008aï\u0095ãddÞ¯\u000b\u007fäà·Í`Ojt\u0094,XÙÀ_\u001e^\u0095øê(¨%,ù\u0006\u0083+Ã\u009a\u0013Ñ\u008eÝß2v\u0086ÈXø/k¾\u0081w\u0014¢ë&Kº¸,\u0094¼É\u0089¦\u00198Îdp)Þbª.\u0098\u001c\u0001¯QH5\u0094\u0080\u0092×Þ¿&¬oãJ\u008eã/ø!t{\u0013/ª¹(\u0093Âa\u0019\u0017<\u000fë¿\u001bÍj,hï\u0095¬#{g\u009d¼¿\u009eóåÁº\u001e2Ù¦n)<_Ö3Îµ\u001f+BÚ\u0006\bRhE\u0087c;\u000fOýêå\u00967\u0016Ù²\u008d\u0006;e\u00ad©N\u0012Ì²\u0000\u0007¿\u0015h\u0003_Î¹Ã\u0085úâ0Wpþr\u0087ï\b-¾¾'4\u001aY\u001a5ñ\u009b°®*³\u009cx\u001dêkwTï?\u009a\n\u009d\t@Û z¯ó\u000b>v1 0ÑLúHG¸VÉu2ÞÄ/ÌÚõ]Þh\u0004G\u0084>@ëªé\u0092T¥\fO(&3%CÜø\u0095C\u0094Ù4?\u0098¥\u0012Ï\t \u0015Ì\u008d>\u0084ò\u0002·ß¾ ·2\u008fö\u009a¡bÀÊ|L¡\u0004\u0090\u0097U\u009b\u008cãk|\u0011Ë\u0081:ÓM\u00076*ñBÏ&%¹ZßÄNéûÅ\u000epEîõ\b°G\u0090Äw\tMæ§`FéÊX´¡â\fb\u0007\u0012p.äDìÚõ\u0007A\u0086UÔ\nòòA\u0012ôz\u00133\u0088Ìô\u0097£øÌ¤ìÑ\u0093½1\u0080|\\µ2N\u0086¦\u000b¨é7ÂKß\u0098åA²¿Nì8\u0006·\u008d\u0006äsp®ögf\r¬à\u0082R\u007ft¾\u001f°Í\u000fr1júò\u0084CÈcêÔ\u009f\u0001\u0010\u0017ÿ¬\u0012ýC0¾î\u0095s©\u0083Ò]ï³Mº\u0085úªçÂ(D\u009b¯K\t<¯?©ýHs±>À1\u0015\u0098ÜæU£¡ZC«\u008d\u0003\u0011XI±\u0011þÞEDn°b½\u0081Ø`®¬û\r$;-YIy\u0013\nigÃAÙi<ØÆ\fÁ\bª= /a_Î\u0080¸q3!!E·\u001d0åu\"\u0095\u0094\u0095\u007fÂ\u0003#÷sc<\u0089äs)\u0000="
               .getBytes("ISO-8859-1");

            int var61;
            do {
               aabb[var24] = (
                     (var10002[var10001] & 255) << 24
                        | (var10002[var10001 + 1] & 255) << 16
                        | (var10002[var10001 + 2] & 255) << 8
                        | var10002[var10001 + 3] & 255
                  )
                  ^ -889253294;
               var24 += 1;
               var61 = var10001 + 4;
               var10001 += 4;
            } while (var61 < var10002.length);

            String[] var7 = new String[a(-1488210901, var20 ^ -742426754)];
            int var5 = 0;
            String var4;
            int var6 = (var4 = b(-582563054, var20 ^ -1852994903)).length();
            int var3 = 4;
            int var22 = -1;

            label106:
            while (true) {
               String var25 = var4.substring(++var22, var22 + var3);
               var10001 = (byte)-1;

               while (true) {
                  label101: {
                     char[] var31 = var25.toCharArray();
                     var61 = var31.length;
                     int var8 = 0;
                     var47 = var31;
                     var10001 = var61;
                     char[] var65;
                     int var79;
                     if (var61 <= 1) {
                        var65 = var31;
                        var79 = var8;
                     } else {
                        var47 = var31;
                        var10001 = var61;
                        if (var61 <= var8) {
                           break label101;
                        }

                        var65 = var31;
                        var79 = var8;
                     }

                     while (true) {
                        var65[var79] = (char)(var65[var79] ^ switch (var8 % a(-1488210904, var20 ^ 1802348297)) {
                           case 0 -> a(-1488210897, var20 ^ 535631325);
                           case 1 -> a(-1488210898, var20 ^ -1300589240);
                           case 2 -> a(-1488210899, var20 ^ 2001127313);
                           case 3 -> a(-1488210900, var20 ^ 1443141222);
                           case 4 -> a(-1488210909, var20 ^ -641816069);
                           case 5 -> a(-1488210910, var20 ^ 2013703427);
                           default -> a(-1488210911, var20 ^ 377571996);
                        });
                        var8++;
                        if (var10001 == 0) {
                           var79 = var10001;
                           var65 = var47;
                        } else {
                           if (var10001 <= var8) {
                              break;
                           }

                           var65 = var47;
                           var79 = var8;
                        }
                     }
                  }

                  String var72 = new String(var47).intern();
                  switch (var10001) {
                     case 0:
                        var7[var5++] = var72;
                        if ((var22 += var3) >= var6) {
                           aaa = var7;
                           bba = new String[a(-1488210903, var20 ^ -1629096865)];
                           long var0 = 3929097681113109358L;
                           long var53 = -7283678760295017625L ^ var0;
                           byte var38 = -1;
                           bab = var53;
                           return;
                        }

                        var3 = var4.charAt(var22);
                        break;
                     default:
                        var7[var5++] = var72;
                        if ((var22 += var3) < var6) {
                           var3 = var4.charAt(var22);
                           continue label106;
                        }

                        var6 = (var4 = b(-582563053, var20 ^ 134937556)).length();
                        var3 = a(-1488210902, var20 ^ 558514108);
                        var22 = -1;
                  }

                  var25 = var4.substring(++var22, var22 + var3);
                  var10001 = (byte)0;
               }
            }
         }

         do {
            var15 = var11[var13] ^ var9;
            char[] var17 = var10.substring(var14, var14 + var15).toCharArray();
            int var18 = 0;

            do {
               short var19 = switch (var18 % 5) {
                  default -> 4;
                  case 1 -> 9;
                  case 2 -> 168;
                  case 3 -> 79;
                  case 4 -> 206;
               };
               var17[var18] = (char)(var17[var18] ^ var19);
            } while (++var18 < var17.length);

            var12[var13] = new String(var17).intern();
            var14 += var15;
         } while (++var13 < var11.length);

         var16 = 0;
      }
   }

   public aabababb() {
      int var1 = 100611826;
      super(
         aabbaaaba.aaab(aab(a(-1488210650, var1 ^ -1768452675), a(-1488210651, var1 ^ 116990849))),
         bbaabbba.aaa,
         aabbaaaba.aaab(aab(a(-1488210652, var1 ^ -376330066), a(-1488210629, var1 ^ -995098305)))
      );
      this.aa = (baabaab)this.abbbaaa(
         new baabaab(
            aabbaaaba.aaab(aab(a(-1488210630, var1 ^ 1399099723), a(-1488210631, var1 ^ 291158323))),
            bbbab.class,
            bbbab.a
         )
      );
      this.bb = (abbaaaaa)this.abbbaaa(
         new abbaaaaa(
            aabbaaaba.aaab(aab(a(-1488210632, var1 ^ 260737472), a(-1488210625, var1 ^ 24525338))), true
         )
      );
      this.baa = (abbaaaaa)this.abbbaaa(
         new abbaaaaa(
            aabbaaaba.aaab(aab(a(-1488210626, var1 ^ 1686683830), a(-1488210627, var1 ^ 1441389252))), true
         )
      );
      this.abb = (bababa)this.abbbaaa(
         new bababa(
               aabbaaaba.aaab(aab(a(-1488210628, var1 ^ 931612839), a(-1488210637, var1 ^ 427427954))), 100.0, 0.0, 100.0, 1.0
            )
            .bba(aabbaaaba.aaab(aab(a(-1488210638, var1 ^ 771675445), a(-1488210639, var1 ^ -1925447626))))
      );
      this.aba = (bababa)this.abbbaaa(
         new bababa(
               aabbaaaba.aaab(aab(a(-1488210640, var1 ^ -52643881), a(-1488210633, var1 ^ 1802124745))), 10.0, 0.0, 20.0, 1.0
            )
            .bba(aabbaaaba.aaab(aab(a(-1488210634, var1 ^ 192233972), a(-1488210635, var1 ^ 459338097))))
      );
   }
}
