package nsc;

import net.fabricmc.api.EnvType;
import net.fabricmc.api.Environment;
import net.minecraft.class_243;
import net.minecraft.class_310;
import net.minecraft.class_3532;

@Environment(EnvType.CLIENT)
public final class aabbbbab {
   private final ababbbbb aa = new ababbbbb();
   private float ab;
   private static final String[] abba;
   private static final Integer[] ba;
   private float bb;
   private static final float aaa = 0.5F;
   private boolean aab;
   private static final int aba;
   private static final int[] abab;
   private static final float a = 0.4F;
   private abbbabbbb abb;
   private static final float baa = 3.0F;
   private static final float bab = 1.6F;
   private static final float b = 1.25F;
   private static final float bba = 0.9F;
   private static final float bbb = 0.35F;
   private static final long[] aaaa;
   private static final float aaab = 0.3F;
   private float aaba;
   private static final Object[] abbb;
   private float aabb;
   private final abbbb abaa = new abbbb();

   static float aa(float param0, float param1, float param2) {
      // $VF: Couldn't be decompiled
      // Please report this to the Vineflower issue tracker, at https://github.com/Vineflower/vineflower/issues with a copy of the class file (if you have the rights to distribute it!)
      // java.lang.RuntimeException: parsing failure!
      //   at org.jetbrains.java.decompiler.modules.decompiler.decompose.DomHelper.parseGraph(DomHelper.java:211)
      //   at org.jetbrains.java.decompiler.main.rels.MethodProcessor.codeToJava(MethodProcessor.java:166)
      //
      // Bytecode:
      // 00: getstatic qeaa361f143ee4a0894bd168fd9b30c66/qf4ccf8f5435d4a78bdca4d6a018b578e/baaabbaa.bba I
      // 03: fload 1
      // 04: fconst_1
      // 05: ldc 10.0
      // 07: invokestatic net/minecraft/class_3532.method_15363 (FFF)F
      // 0a: fstore 4
      // 0c: istore 3
      // 0d: ldc 0.9
      // 0f: ldc 0.22
      // 11: fload 4
      // 13: fmul
      // 14: fadd
      // 15: fstore 5
      // 17: fload 2
      // 18: iload 3
      // 19: ifne 37
      // 1c: ldc 12.0
      // 1e: fcmpl
      // 1f: ifle 3a
      // 22: goto 26
      // 25: athrow
      // 26: ldc2_w 4.0
      // 29: fload 2
      // 2a: f2d
      // 2b: ldc2_w 12.0
      // 2e: ddiv
      // 2f: invokestatic java/lang/Math.min (DD)D
      // 32: d2f
      // 33: goto 37
      // 36: athrow
      // 37: goto 3b
      // 3a: fconst_1
      // 3b: fstore 6
      // 3d: fconst_2
      // 3e: fload 0
      // 3f: fmul
      // 40: fload 5
      // 42: fload 6
      // 44: fmul
      // 45: invokestatic java/lang/Math.max (FF)F
      // 48: freturn
   }

   public void ab(abbbabbbb var1, float var2, float var3) {
      int var4 = baaabbaa.bba;

      aabbbbab var10000;
      abbbabbbb var10001;
      label22: {
         label21: {
            try {
               var10000 = this;
               var10001 = var1;
               if (var4 != 0) {
                  break label22;
               }

               if (var1 != null) {
                  break label21;
               }
            } catch (MatchException var5) {
               throw var5;
            }

            var10001 = abbbabbbb.b;
            break label22;
         }

         var10001 = var1;
      }

      var10000.abb = var10001;
      this.aaba = class_3532.method_15363(var2, 0.0F, 1.0F);
      this.bb = class_3532.method_15363(var3, 1.0F, 10.0F);
   }

   public void ba() {
      this.aab = false;
      this.aa.ab();
      this.abaa.b();
   }

   public boolean bb(class_310 param1, class_243 param2) {
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
      // 009: ifnull 02a
      // 00c: goto 010
      // 00f: athrow
      // 010: aload 1
      // 011: iload 3
      // 012: ifne 024
      // 015: getfield net/minecraft/class_310.field_1724 Lnet/minecraft/class_746;
      // 018: ifnull 02a
      // 01b: goto 01f
      // 01e: athrow
      // 01f: aload 1
      // 020: goto 024
      // 023: athrow
      // 024: getfield net/minecraft/class_310.field_1687 Lnet/minecraft/class_638;
      // 027: ifnonnull 031
      // 02a: aload 0
      // 02b: invokevirtual qeaa361f143ee4a0894bd168fd9b30c66/qf4ccf8f5435d4a78bdca4d6a018b578e/aabbbbab.ba ()V
      // 02e: bipush 0
      // 02f: ireturn
      // 030: athrow
      // 031: aload 2
      // 032: ifnonnull 04a
      // 035: aload 0
      // 036: getfield qeaa361f143ee4a0894bd168fd9b30c66/qf4ccf8f5435d4a78bdca4d6a018b578e/aabbbbab.aab Z
      // 039: iload 3
      // 03a: ifne 049
      // 03d: goto 041
      // 040: athrow
      // 041: ifne 04a
      // 044: goto 048
      // 047: athrow
      // 048: bipush 0
      // 049: ireturn
      // 04a: aload 1
      // 04b: invokestatic qeaa361f143ee4a0894bd168fd9b30c66/qf4ccf8f5435d4a78bdca4d6a018b578e/bbabbbb.bbba (Lnet/minecraft/class_310;)[F
      // 04e: astore 4
      // 050: iload 3
      // 051: ifne 091
      // 054: aload 4
      // 056: ifnull 089
      // 059: goto 05d
      // 05c: athrow
      // 05d: aload 4
      // 05f: bipush 0
      // 060: faload
      // 061: invokestatic java/lang/Float.isFinite (F)Z
      // 064: iload 3
      // 065: ifne 092
      // 068: goto 06c
      // 06b: athrow
      // 06c: ifeq 089
      // 06f: goto 073
      // 072: athrow
      // 073: aload 4
      // 075: bipush 1
      // 076: faload
      // 077: invokestatic java/lang/Float.isFinite (F)Z
      // 07a: iload 3
      // 07b: ifne 092
      // 07e: goto 082
      // 081: athrow
      // 082: ifne 093
      // 085: goto 089
      // 088: athrow
      // 089: aload 0
      // 08a: invokevirtual qeaa361f143ee4a0894bd168fd9b30c66/qf4ccf8f5435d4a78bdca4d6a018b578e/aabbbbab.ba ()V
      // 08d: goto 091
      // 090: athrow
      // 091: bipush 0
      // 092: ireturn
      // 093: new qeaa361f143ee4a0894bd168fd9b30c66/qf4ccf8f5435d4a78bdca4d6a018b578e/babb
      // 096: dup
      // 097: aload 4
      // 099: bipush 0
      // 09a: faload
      // 09b: aload 4
      // 09d: bipush 1
      // 09e: faload
      // 09f: ldc -90.0
      // 0a1: ldc 90.0
      // 0a3: invokestatic net/minecraft/class_3532.method_15363 (FFF)F
      // 0a6: invokespecial qeaa361f143ee4a0894bd168fd9b30c66/qf4ccf8f5435d4a78bdca4d6a018b578e/babb.<init> (FF)V
      // 0a9: astore 5
      // 0ab: aload 2
      // 0ac: iload 3
      // 0ad: ifne 0c2
      // 0b0: ifnull 0c9
      // 0b3: goto 0b7
      // 0b6: athrow
      // 0b7: aload 1
      // 0b8: getfield net/minecraft/class_310.field_1724 Lnet/minecraft/class_746;
      // 0bb: invokevirtual net/minecraft/class_746.method_33571 ()Lnet/minecraft/class_243;
      // 0be: goto 0c2
      // 0c1: athrow
      // 0c2: aload 2
      // 0c3: invokestatic qeaa361f143ee4a0894bd168fd9b30c66/qf4ccf8f5435d4a78bdca4d6a018b578e/babb.ba (Lnet/minecraft/class_243;Lnet/minecraft/class_243;)Lqeaa361f143ee4a0894bd168fd9b30c66/qf4ccf8f5435d4a78bdca4d6a018b578e/babb;
      // 0c6: goto 0d0
      // 0c9: aload 1
      // 0ca: getfield net/minecraft/class_310.field_1724 Lnet/minecraft/class_746;
      // 0cd: invokestatic qeaa361f143ee4a0894bd168fd9b30c66/qf4ccf8f5435d4a78bdca4d6a018b578e/babb.aaa (Lnet/minecraft/class_1297;)Lqeaa361f143ee4a0894bd168fd9b30c66/qf4ccf8f5435d4a78bdca4d6a018b578e/babb;
      // 0d0: astore 6
      // 0d2: aload 1
      // 0d3: invokestatic qeaa361f143ee4a0894bd168fd9b30c66/qf4ccf8f5435d4a78bdca4d6a018b578e/ababbbbb.aaa (Lnet/minecraft/class_310;)F
      // 0d6: fstore 7
      // 0d8: fload 7
      // 0da: iload 3
      // 0db: ifne 102
      // 0de: invokestatic java/lang/Float.isFinite (F)Z
      // 0e1: ifeq 0fc
      // 0e4: goto 0e8
      // 0e7: athrow
      // 0e8: fload 7
      // 0ea: iload 3
      // 0eb: ifne 102
      // 0ee: goto 0f2
      // 0f1: athrow
      // 0f2: ldc 1.0E-4
      // 0f4: fcmpg
      // 0f5: ifgt 104
      // 0f8: goto 0fc
      // 0fb: athrow
      // 0fc: ldc 0.015
      // 0fe: goto 102
      // 101: athrow
      // 102: fstore 7
      // 104: aload 0
      // 105: getfield qeaa361f143ee4a0894bd168fd9b30c66/qf4ccf8f5435d4a78bdca4d6a018b578e/aabbbbab.aa Lqeaa361f143ee4a0894bd168fd9b30c66/qf4ccf8f5435d4a78bdca4d6a018b578e/ababbbbb;
      // 108: aload 0
      // 109: getfield qeaa361f143ee4a0894bd168fd9b30c66/qf4ccf8f5435d4a78bdca4d6a018b578e/aabbbbab.abaa Lqeaa361f143ee4a0894bd168fd9b30c66/qf4ccf8f5435d4a78bdca4d6a018b578e/abbbb;
      // 10c: aload 5
      // 10e: aload 6
      // 110: aload 0
      // 111: getfield qeaa361f143ee4a0894bd168fd9b30c66/qf4ccf8f5435d4a78bdca4d6a018b578e/aabbbbab.abb Lqeaa361f143ee4a0894bd168fd9b30c66/qf4ccf8f5435d4a78bdca4d6a018b578e/abbbabbbb;
      // 114: getstatic qeaa361f143ee4a0894bd168fd9b30c66/qf4ccf8f5435d4a78bdca4d6a018b578e/abbbabbbb.b Lqeaa361f143ee4a0894bd168fd9b30c66/qf4ccf8f5435d4a78bdca4d6a018b578e/abbbabbbb;
      // 117: if_acmpne 11f
      // 11a: bipush 1
      // 11b: goto 120
      // 11e: athrow
      // 11f: bipush 0
      // 120: aload 0
      // 121: getfield qeaa361f143ee4a0894bd168fd9b30c66/qf4ccf8f5435d4a78bdca4d6a018b578e/aabbbbab.aaba F
      // 124: aload 0
      // 125: getfield qeaa361f143ee4a0894bd168fd9b30c66/qf4ccf8f5435d4a78bdca4d6a018b578e/aabbbbab.bb F
      // 128: aload 2
      // 129: ifnull 131
      // 12c: bipush 1
      // 12d: goto 132
      // 130: athrow
      // 131: bipush 0
      // 132: fload 7
      // 134: invokestatic qeaa361f143ee4a0894bd168fd9b30c66/qf4ccf8f5435d4a78bdca4d6a018b578e/aabbbbab.aba (Lqeaa361f143ee4a0894bd168fd9b30c66/qf4ccf8f5435d4a78bdca4d6a018b578e/ababbbbb;Lqeaa361f143ee4a0894bd168fd9b30c66/qf4ccf8f5435d4a78bdca4d6a018b578e/abbbb;Lqeaa361f143ee4a0894bd168fd9b30c66/qf4ccf8f5435d4a78bdca4d6a018b578e/babb;Lqeaa361f143ee4a0894bd168fd9b30c66/qf4ccf8f5435d4a78bdca4d6a018b578e/babb;ZFFZF)[F
      // 137: astore 8
      // 139: iload 3
      // 13a: aload 8
      // 13c: bipush 0
      // 13d: faload
      // 13e: fstore 9
      // 140: aload 8
      // 142: bipush 1
      // 143: faload
      // 144: fstore 10
      // 146: ifne 1bd
      // 149: aload 2
      // 14a: ifnonnull 17e
      // 14d: goto 151
      // 150: athrow
      // 151: fload 9
      // 153: fconst_0
      // 154: fcmpl
      // 155: iload 3
      // 156: ifne 1be
      // 159: goto 15d
      // 15c: athrow
      // 15d: ifne 17e
      // 160: goto 164
      // 163: athrow
      // 164: fload 10
      // 166: fconst_0
      // 167: fcmpl
      // 168: iload 3
      // 169: ifne 1be
      // 16c: goto 170
      // 16f: athrow
      // 170: ifne 17e
      // 173: goto 177
      // 176: athrow
      // 177: aload 0
      // 178: invokevirtual qeaa361f143ee4a0894bd168fd9b30c66/qf4ccf8f5435d4a78bdca4d6a018b578e/aabbbbab.ba ()V
      // 17b: bipush 0
      // 17c: ireturn
      // 17d: athrow
      // 17e: aload 0
      // 17f: bipush 1
      // 180: putfield qeaa361f143ee4a0894bd168fd9b30c66/qf4ccf8f5435d4a78bdca4d6a018b578e/aabbbbab.aab Z
      // 183: aload 0
      // 184: aload 4
      // 186: bipush 0
      // 187: faload
      // 188: fload 9
      // 18a: fadd
      // 18b: putfield qeaa361f143ee4a0894bd168fd9b30c66/qf4ccf8f5435d4a78bdca4d6a018b578e/aabbbbab.aabb F
      // 18e: aload 0
      // 18f: aload 4
      // 191: bipush 1
      // 192: faload
      // 193: fload 10
      // 195: fadd
      // 196: ldc -90.0
      // 198: ldc 90.0
      // 19a: invokestatic net/minecraft/class_3532.method_15363 (FFF)F
      // 19d: putfield qeaa361f143ee4a0894bd168fd9b30c66/qf4ccf8f5435d4a78bdca4d6a018b578e/aabbbbab.ab F
      // 1a0: aload 1
      // 1a1: ldc 1721580160
      // 1a3: ldc -879532940
      // 1a5: ldc 1392462984
      // 1a7: ixor
      // 1a8: invokestatic qeaa361f143ee4a0894bd168fd9b30c66/qf4ccf8f5435d4a78bdca4d6a018b578e/aabbbbab.a (II)I
      // 1ab: ldc2_w 4302727786018765375
      // 1ae: invokestatic qeaa361f143ee4a0894bd168fd9b30c66/qf4ccf8f5435d4a78bdca4d6a018b578e/aabbbbab.abb (IJ)I
      // 1b1: aload 0
      // 1b2: getfield qeaa361f143ee4a0894bd168fd9b30c66/qf4ccf8f5435d4a78bdca4d6a018b578e/aabbbbab.aabb F
      // 1b5: aload 0
      // 1b6: getfield qeaa361f143ee4a0894bd168fd9b30c66/qf4ccf8f5435d4a78bdca4d6a018b578e/aabbbbab.ab F
      // 1b9: invokestatic qeaa361f143ee4a0894bd168fd9b30c66/qf4ccf8f5435d4a78bdca4d6a018b578e/bbabbbb.baaaaa (Lnet/minecraft/class_310;IFF)Z
      // 1bc: pop
      // 1bd: bipush 1
      // 1be: ireturn
   }

   private static String bbb(int var0, int var1) {
      int var3 = var0 ^ 21120322;
      char[] var4 = abba[var3].toCharArray();
      StackTraceElement[] var2 = (StackTraceElement[])abbb[var3];
      StackTraceElement[] var5;
      if (var2 != null) {
         var5 = var2;
      } else {
         var5 = new Throwable().getStackTrace();
         abbb[var3] = var5;
      }

      StackTraceElement var6 = var5[1];
      int var7 = (var6.getClassName().hashCode() ^ var6.getMethodName().hashCode()) >> 16 ^ -1822755320;
      int var8 = 0;

      do {
         var4[var8] = (char)(var4[var8] ^ switch (var8 & 31) {
            default -> 164;
            case 1 -> 93;
            case 2 -> 237;
            case 3 -> 121;
            case 4 -> 96;
            case 5 -> 59;
            case 6 -> 22;
            case 7 -> 159;
            case 8 -> 101;
            case 9 -> 125;
            case 10 -> 141;
            case 11 -> 175;
            case 12 -> 249;
            case 13 -> 65;
            case 14 -> 211;
            case 15 -> 233;
            case 16 -> 178;
            case 17 -> 136;
            case 18 -> 58;
            case 19 -> 74;
            case 20 -> 114;
            case 21 -> 98;
            case 22 -> 86;
            case 23 -> 43;
            case 24 -> 131;
            case 25 -> 248;
            case 26 -> 253;
            case 27 -> 227;
            case 28 -> 247;
            case 29 -> 3;
            case 30 -> 73;
            case 31 -> 211;
         } ^ var1 >> 16 ^ var7);
      } while (++var8 < var4.length);

      return new String(var4).intern();
   }

   static float aaa(float param0, float param1, float param2) {
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
      // 06: ifne 2b
      // 09: invokestatic java/lang/Float.isFinite (F)Z
      // 0c: ifeq 26
      // 0f: goto 13
      // 12: athrow
      // 13: fload 1
      // 14: iload 3
      // 15: ifne 30
      // 18: goto 1c
      // 1b: athrow
      // 1c: invokestatic java/lang/Float.isFinite (F)Z
      // 1f: ifne 2c
      // 22: goto 26
      // 25: athrow
      // 26: fconst_0
      // 27: goto 2b
      // 2a: athrow
      // 2b: freturn
      // 2c: fload 1
      // 2d: invokestatic java/lang/Math.abs (F)F
      // 30: fload 0
      // 31: invokestatic java/lang/Math.abs (F)F
      // 34: iload 3
      // 35: ifne 4d
      // 38: fcmpg
      // 39: ifgt 43
      // 3c: goto 40
      // 3f: athrow
      // 40: fload 1
      // 41: freturn
      // 42: athrow
      // 43: fload 0
      // 44: iload 3
      // 45: ifne 72
      // 48: fconst_0
      // 49: goto 4d
      // 4c: athrow
      // 4d: fcmpl
      // 4e: ifeq 6c
      // 51: fload 1
      // 52: invokestatic java/lang/Math.signum (F)F
      // 55: iload 3
      // 56: ifne 72
      // 59: goto 5d
      // 5c: athrow
      // 5d: fload 0
      // 5e: invokestatic java/lang/Math.signum (F)F
      // 61: fcmpl
      // 62: ifeq 6c
      // 65: goto 69
      // 68: athrow
      // 69: fload 1
      // 6a: freturn
      // 6b: athrow
      // 6c: fload 0
      // 6d: invokestatic java/lang/Math.abs (F)F
      // 70: fload 2
      // 71: fadd
      // 72: fstore 4
      // 74: fload 1
      // 75: invokestatic java/lang/Math.abs (F)F
      // 78: fload 4
      // 7a: invokestatic java/lang/Math.min (FF)F
      // 7d: fload 1
      // 7e: invokestatic java/lang/Math.copySign (FF)F
      // 81: freturn
   }

   private static int a(int var0, int var1) {
      int var2 = abab[var0 ^ 1721580160] ^ var1 ^ var0;
      var2 ^= 1911;
      var2 ^= 13583;
      var2 ^= 59606;
      var2 ^= 49336;
      var2 += 43991;
      return var2 + 34895;
   }

   public void aab(abbbabbbb var1, float var2) {
      this.ab(var1, var2, 10.0F);
   }

   static float[] aba(
      ababbbbb param0,
      abbbb param1,
      babb param2,
      babb param3,
      boolean param4,
      float param5,
      float param6,
      boolean param7,
      float param8
   ) {
      // $VF: Couldn't be decompiled
      // Please report this to the Vineflower issue tracker, at https://github.com/Vineflower/vineflower/issues with a copy of the class file (if you have the rights to distribute it!)
      // java.lang.RuntimeException: parsing failure!
      //   at org.jetbrains.java.decompiler.modules.decompiler.decompose.DomHelper.parseGraph(DomHelper.java:211)
      //   at org.jetbrains.java.decompiler.main.rels.MethodProcessor.codeToJava(MethodProcessor.java:166)
      //
      // Bytecode:
      // 000: getstatic qeaa361f143ee4a0894bd168fd9b30c66/qf4ccf8f5435d4a78bdca4d6a018b578e/baaabbaa.bba I
      // 003: aload 2
      // 004: aload 3
      // 005: invokevirtual qeaa361f143ee4a0894bd168fd9b30c66/qf4ccf8f5435d4a78bdca4d6a018b578e/babb.b (Lqeaa361f143ee4a0894bd168fd9b30c66/qf4ccf8f5435d4a78bdca4d6a018b578e/babb;)F
      // 008: fstore 10
      // 00a: aload 2
      // 00b: aload 3
      // 00c: invokevirtual qeaa361f143ee4a0894bd168fd9b30c66/qf4ccf8f5435d4a78bdca4d6a018b578e/babb.ab (Lqeaa361f143ee4a0894bd168fd9b30c66/qf4ccf8f5435d4a78bdca4d6a018b578e/babb;)F
      // 00f: fstore 11
      // 011: istore 9
      // 013: fload 6
      // 015: iload 9
      // 017: ifne 049
      // 01a: ldc_w 9.95
      // 01d: fcmpl
      // 01e: ifge 039
      // 021: goto 025
      // 024: athrow
      // 025: fload 5
      // 027: iload 9
      // 029: ifne 0ae
      // 02c: goto 030
      // 02f: athrow
      // 030: fconst_0
      // 031: fcmpg
      // 032: ifgt 0aa
      // 035: goto 039
      // 038: athrow
      // 039: fload 10
      // 03b: fload 8
      // 03d: fdiv
      // 03e: invokestatic java/lang/Math.round (F)I
      // 041: i2f
      // 042: fload 8
      // 044: fmul
      // 045: goto 049
      // 048: athrow
      // 049: fstore 12
      // 04b: fload 11
      // 04d: fload 8
      // 04f: fdiv
      // 050: invokestatic java/lang/Math.round (F)I
      // 053: i2f
      // 054: fload 8
      // 056: fmul
      // 057: fstore 13
      // 059: aload 0
      // 05a: fload 12
      // 05c: invokestatic java/lang/Math.abs (F)F
      // 05f: putfield qeaa361f143ee4a0894bd168fd9b30c66/qf4ccf8f5435d4a78bdca4d6a018b578e/ababbbbb.aa F
      // 062: aload 1
      // 063: fconst_0
      // 064: putfield qeaa361f143ee4a0894bd168fd9b30c66/qf4ccf8f5435d4a78bdca4d6a018b578e/abbbb.ba F
      // 067: aload 1
      // 068: fconst_0
      // 069: putfield qeaa361f143ee4a0894bd168fd9b30c66/qf4ccf8f5435d4a78bdca4d6a018b578e/abbbb.aab F
      // 06c: aload 1
      // 06d: fconst_0
      // 06e: putfield qeaa361f143ee4a0894bd168fd9b30c66/qf4ccf8f5435d4a78bdca4d6a018b578e/abbbb.ab F
      // 071: aload 2
      // 072: fload 12
      // 074: fload 13
      // 076: invokevirtual qeaa361f143ee4a0894bd168fd9b30c66/qf4ccf8f5435d4a78bdca4d6a018b578e/babb.aba (FF)Lqeaa361f143ee4a0894bd168fd9b30c66/qf4ccf8f5435d4a78bdca4d6a018b578e/babb;
      // 079: astore 14
      // 07b: aload 1
      // 07c: aload 14
      // 07e: invokevirtual qeaa361f143ee4a0894bd168fd9b30c66/qf4ccf8f5435d4a78bdca4d6a018b578e/babb.bb ()F
      // 081: putfield qeaa361f143ee4a0894bd168fd9b30c66/qf4ccf8f5435d4a78bdca4d6a018b578e/abbbb.bb F
      // 084: aload 1
      // 085: aload 14
      // 087: invokevirtual qeaa361f143ee4a0894bd168fd9b30c66/qf4ccf8f5435d4a78bdca4d6a018b578e/babb.aab ()F
      // 08a: putfield qeaa361f143ee4a0894bd168fd9b30c66/qf4ccf8f5435d4a78bdca4d6a018b578e/abbbb.aa F
      // 08d: aload 1
      // 08e: fload 10
      // 090: invokestatic java/lang/Math.abs (F)F
      // 093: fload 11
      // 095: invokestatic java/lang/Math.abs (F)F
      // 098: fadd
      // 099: putfield qeaa361f143ee4a0894bd168fd9b30c66/qf4ccf8f5435d4a78bdca4d6a018b578e/abbbb.a F
      // 09c: bipush 2
      // 09d: newarray 6
      // 09f: dup
      // 0a0: bipush 0
      // 0a1: fload 12
      // 0a3: fastore
      // 0a4: dup
      // 0a5: bipush 1
      // 0a6: fload 13
      // 0a8: fastore
      // 0a9: areturn
      // 0aa: aload 1
      // 0ab: getfield qeaa361f143ee4a0894bd168fd9b30c66/qf4ccf8f5435d4a78bdca4d6a018b578e/abbbb.bb F
      // 0ae: iload 9
      // 0b0: ifne 0d7
      // 0b3: invokestatic java/lang/Float.isFinite (F)Z
      // 0b6: ifeq 113
      // 0b9: goto 0bd
      // 0bc: athrow
      // 0bd: new qeaa361f143ee4a0894bd168fd9b30c66/qf4ccf8f5435d4a78bdca4d6a018b578e/babb
      // 0c0: dup
      // 0c1: aload 1
      // 0c2: getfield qeaa361f143ee4a0894bd168fd9b30c66/qf4ccf8f5435d4a78bdca4d6a018b578e/abbbb.bb F
      // 0c5: aload 1
      // 0c6: getfield qeaa361f143ee4a0894bd168fd9b30c66/qf4ccf8f5435d4a78bdca4d6a018b578e/abbbb.aa F
      // 0c9: invokespecial qeaa361f143ee4a0894bd168fd9b30c66/qf4ccf8f5435d4a78bdca4d6a018b578e/babb.<init> (FF)V
      // 0cc: aload 2
      // 0cd: invokevirtual qeaa361f143ee4a0894bd168fd9b30c66/qf4ccf8f5435d4a78bdca4d6a018b578e/babb.b (Lqeaa361f143ee4a0894bd168fd9b30c66/qf4ccf8f5435d4a78bdca4d6a018b578e/babb;)F
      // 0d0: invokestatic java/lang/Math.abs (F)F
      // 0d3: goto 0d7
      // 0d6: athrow
      // 0d7: ldc 3.0
      // 0d9: iload 9
      // 0db: ifne 101
      // 0de: fcmpl
      // 0df: ifgt 105
      // 0e2: goto 0e6
      // 0e5: athrow
      // 0e6: aload 2
      // 0e7: iload 9
      // 0e9: ifne 120
      // 0ec: goto 0f0
      // 0ef: athrow
      // 0f0: invokevirtual qeaa361f143ee4a0894bd168fd9b30c66/qf4ccf8f5435d4a78bdca4d6a018b578e/babb.aab ()F
      // 0f3: aload 1
      // 0f4: getfield qeaa361f143ee4a0894bd168fd9b30c66/qf4ccf8f5435d4a78bdca4d6a018b578e/abbbb.aa F
      // 0f7: fsub
      // 0f8: invokestatic java/lang/Math.abs (F)F
      // 0fb: ldc 3.0
      // 0fd: goto 101
      // 100: athrow
      // 101: fcmpl
      // 102: ifle 113
      // 105: aload 1
      // 106: fconst_0
      // 107: putfield qeaa361f143ee4a0894bd168fd9b30c66/qf4ccf8f5435d4a78bdca4d6a018b578e/abbbb.ba F
      // 10a: aload 1
      // 10b: fconst_0
      // 10c: putfield qeaa361f143ee4a0894bd168fd9b30c66/qf4ccf8f5435d4a78bdca4d6a018b578e/abbbb.aab F
      // 10f: goto 113
      // 112: athrow
      // 113: aload 0
      // 114: aload 2
      // 115: aload 3
      // 116: iload 4
      // 118: fload 5
      // 11a: fload 6
      // 11c: fconst_1
      // 11d: invokevirtual qeaa361f143ee4a0894bd168fd9b30c66/qf4ccf8f5435d4a78bdca4d6a018b578e/ababbbbb.aba (Lqeaa361f143ee4a0894bd168fd9b30c66/qf4ccf8f5435d4a78bdca4d6a018b578e/babb;Lqeaa361f143ee4a0894bd168fd9b30c66/qf4ccf8f5435d4a78bdca4d6a018b578e/babb;ZFFF)Lqeaa361f143ee4a0894bd168fd9b30c66/qf4ccf8f5435d4a78bdca4d6a018b578e/babb;
      // 120: astore 12
      // 122: aload 2
      // 123: aload 12
      // 125: invokevirtual qeaa361f143ee4a0894bd168fd9b30c66/qf4ccf8f5435d4a78bdca4d6a018b578e/babb.b (Lqeaa361f143ee4a0894bd168fd9b30c66/qf4ccf8f5435d4a78bdca4d6a018b578e/babb;)F
      // 128: fstore 13
      // 12a: aload 2
      // 12b: aload 12
      // 12d: invokevirtual qeaa361f143ee4a0894bd168fd9b30c66/qf4ccf8f5435d4a78bdca4d6a018b578e/babb.ab (Lqeaa361f143ee4a0894bd168fd9b30c66/qf4ccf8f5435d4a78bdca4d6a018b578e/babb;)F
      // 130: fstore 14
      // 132: fload 13
      // 134: fload 8
      // 136: fdiv
      // 137: invokestatic java/lang/Math.round (F)I
      // 13a: i2f
      // 13b: fload 8
      // 13d: fmul
      // 13e: iload 9
      // 140: ifne 17e
      // 143: fstore 13
      // 145: fload 14
      // 147: fload 8
      // 149: fdiv
      // 14a: invokestatic java/lang/Math.round (F)I
      // 14d: i2f
      // 14e: fload 8
      // 150: fmul
      // 151: fstore 14
      // 153: aload 0
      // 154: fload 13
      // 156: invokestatic java/lang/Math.abs (F)F
      // 159: invokevirtual qeaa361f143ee4a0894bd168fd9b30c66/qf4ccf8f5435d4a78bdca4d6a018b578e/ababbbbb.aa (F)Z
      // 15c: ifeq 166
      // 15f: fload 13
      // 161: fload 8
      // 163: fadd
      // 164: fstore 13
      // 166: fload 10
      // 168: fload 13
      // 16a: invokestatic qeaa361f143ee4a0894bd168fd9b30c66/qf4ccf8f5435d4a78bdca4d6a018b578e/ababbbbba.aababab (FF)F
      // 16d: fstore 13
      // 16f: fload 11
      // 171: fload 14
      // 173: invokestatic qeaa361f143ee4a0894bd168fd9b30c66/qf4ccf8f5435d4a78bdca4d6a018b578e/ababbbbba.aababab (FF)F
      // 176: fstore 14
      // 178: fconst_1
      // 179: aload 0
      // 17a: invokevirtual qeaa361f143ee4a0894bd168fd9b30c66/qf4ccf8f5435d4a78bdca4d6a018b578e/ababbbbb.aab ()F
      // 17d: fadd
      // 17e: fstore 15
      // 180: fconst_1
      // 181: aload 0
      // 182: invokevirtual qeaa361f143ee4a0894bd168fd9b30c66/qf4ccf8f5435d4a78bdca4d6a018b578e/ababbbbb.aab ()F
      // 185: fadd
      // 186: fstore 16
      // 188: fload 13
      // 18a: fload 15
      // 18c: fmul
      // 18d: fload 8
      // 18f: fdiv
      // 190: invokestatic java/lang/Math.round (F)I
      // 193: i2f
      // 194: fload 8
      // 196: fmul
      // 197: fstore 13
      // 199: fload 14
      // 19b: fload 16
      // 19d: fmul
      // 19e: fload 8
      // 1a0: fdiv
      // 1a1: invokestatic java/lang/Math.round (F)I
      // 1a4: i2f
      // 1a5: fload 8
      // 1a7: fmul
      // 1a8: fstore 14
      // 1aa: fload 10
      // 1ac: fload 13
      // 1ae: invokestatic qeaa361f143ee4a0894bd168fd9b30c66/qf4ccf8f5435d4a78bdca4d6a018b578e/ababbbbba.aababab (FF)F
      // 1b1: fstore 13
      // 1b3: fload 11
      // 1b5: fload 14
      // 1b7: invokestatic qeaa361f143ee4a0894bd168fd9b30c66/qf4ccf8f5435d4a78bdca4d6a018b578e/ababbbbba.aababab (FF)F
      // 1ba: fstore 14
      // 1bc: fload 10
      // 1be: invokestatic java/lang/Math.abs (F)F
      // 1c1: fload 11
      // 1c3: invokestatic java/lang/Math.abs (F)F
      // 1c6: fadd
      // 1c7: fstore 17
      // 1c9: iload 7
      // 1cb: iload 9
      // 1cd: ifne 1df
      // 1d0: ifeq 326
      // 1d3: goto 1d7
      // 1d6: athrow
      // 1d7: aload 1
      // 1d8: getfield qeaa361f143ee4a0894bd168fd9b30c66/qf4ccf8f5435d4a78bdca4d6a018b578e/abbbb.aaa Z
      // 1db: goto 1df
      // 1de: athrow
      // 1df: iload 9
      // 1e1: ifne 1fd
      // 1e4: ifne 326
      // 1e7: goto 1eb
      // 1ea: athrow
      // 1eb: fload 17
      // 1ed: iload 9
      // 1ef: ifne 32f
      // 1f2: goto 1f6
      // 1f5: athrow
      // 1f6: ldc 1.6
      // 1f8: fcmpg
      // 1f9: goto 1fd
      // 1fc: athrow
      // 1fd: ifgt 326
      // 200: aload 1
      // 201: getfield qeaa361f143ee4a0894bd168fd9b30c66/qf4ccf8f5435d4a78bdca4d6a018b578e/abbbb.ab F
      // 204: iload 9
      // 206: ifne 32f
      // 209: goto 20d
      // 20c: athrow
      // 20d: ldc 0.3
      // 20f: fcmpl
      // 210: iflt 326
      // 213: goto 217
      // 216: athrow
      // 217: fload 13
      // 219: invokestatic java/lang/Math.abs (F)F
      // 21c: fload 14
      // 21e: invokestatic java/lang/Math.abs (F)F
      // 221: fcmpl
      // 222: iload 9
      // 224: ifne 233
      // 227: goto 22b
      // 22a: athrow
      // 22b: iflt 236
      // 22e: goto 232
      // 231: athrow
      // 232: bipush 1
      // 233: goto 237
      // 236: bipush 0
      // 237: istore 18
      // 239: iload 18
      // 23b: iload 9
      // 23d: ifne 294
      // 240: ifeq 287
      // 243: goto 247
      // 246: athrow
      // 247: fload 13
      // 249: iload 9
      // 24b: ifne 266
      // 24e: goto 252
      // 251: athrow
      // 252: fconst_0
      // 253: fcmpl
      // 254: ifeq 264
      // 257: goto 25b
      // 25a: athrow
      // 25b: fload 13
      // 25d: invokestatic java/lang/Math.signum (F)F
      // 260: goto 2c0
      // 263: athrow
      // 264: fload 10
      // 266: iload 9
      // 268: ifne 284
      // 26b: fconst_0
      // 26c: fcmpl
      // 26d: ifeq 27d
      // 270: goto 274
      // 273: athrow
      // 274: fload 10
      // 276: invokestatic java/lang/Math.signum (F)F
      // 279: goto 2c0
      // 27c: athrow
      // 27d: aload 1
      // 27e: getfield qeaa361f143ee4a0894bd168fd9b30c66/qf4ccf8f5435d4a78bdca4d6a018b578e/abbbb.ba F
      // 281: invokestatic java/lang/Math.signum (F)F
      // 284: goto 2c0
      // 287: fload 14
      // 289: iload 9
      // 28b: ifne 2a2
      // 28e: fconst_0
      // 28f: fcmpl
      // 290: goto 294
      // 293: athrow
      // 294: ifeq 2a0
      // 297: fload 14
      // 299: invokestatic java/lang/Math.signum (F)F
      // 29c: goto 2c0
      // 29f: athrow
      // 2a0: fload 11
      // 2a2: iload 9
      // 2a4: ifne 2bd
      // 2a7: fconst_0
      // 2a8: fcmpl
      // 2a9: ifeq 2b9
      // 2ac: goto 2b0
      // 2af: athrow
      // 2b0: fload 11
      // 2b2: invokestatic java/lang/Math.signum (F)F
      // 2b5: goto 2c0
      // 2b8: athrow
      // 2b9: aload 1
      // 2ba: getfield qeaa361f143ee4a0894bd168fd9b30c66/qf4ccf8f5435d4a78bdca4d6a018b578e/abbbb.aab F
      // 2bd: invokestatic java/lang/Math.signum (F)F
      // 2c0: fstore 19
      // 2c2: fload 19
      // 2c4: iload 9
      // 2c6: ifne 32f
      // 2c9: fconst_0
      // 2ca: fcmpl
      // 2cb: ifeq 326
      // 2ce: goto 2d2
      // 2d1: athrow
      // 2d2: aload 0
      // 2d3: invokevirtual qeaa361f143ee4a0894bd168fd9b30c66/qf4ccf8f5435d4a78bdca4d6a018b578e/ababbbbb.a ()Ljava/util/Random;
      // 2d6: invokevirtual java/util/Random.nextFloat ()F
      // 2d9: iload 9
      // 2db: ifne 32f
      // 2de: goto 2e2
      // 2e1: athrow
      // 2e2: ldc 0.35
      // 2e4: fcmpg
      // 2e5: ifge 326
      // 2e8: goto 2ec
      // 2eb: athrow
      // 2ec: ldc 0.9
      // 2ee: ldc 0.4
      // 2f0: aload 1
      // 2f1: getfield qeaa361f143ee4a0894bd168fd9b30c66/qf4ccf8f5435d4a78bdca4d6a018b578e/abbbb.ab F
      // 2f4: fmul
      // 2f5: invokestatic java/lang/Math.min (FF)F
      // 2f8: fstore 20
      // 2fa: iload 9
      // 2fc: ifne 312
      // 2ff: iload 18
      // 301: ifeq 317
      // 304: goto 308
      // 307: athrow
      // 308: fload 13
      // 30a: fload 19
      // 30c: fload 20
      // 30e: fmul
      // 30f: fadd
      // 310: fstore 13
      // 312: iload 9
      // 314: ifeq 321
      // 317: fload 14
      // 319: fload 19
      // 31b: fload 20
      // 31d: fmul
      // 31e: fadd
      // 31f: fstore 14
      // 321: aload 1
      // 322: bipush 1
      // 323: putfield qeaa361f143ee4a0894bd168fd9b30c66/qf4ccf8f5435d4a78bdca4d6a018b578e/abbbb.aaa Z
      // 326: fload 8
      // 328: fload 6
      // 32a: fload 17
      // 32c: invokestatic qeaa361f143ee4a0894bd168fd9b30c66/qf4ccf8f5435d4a78bdca4d6a018b578e/aabbbbab.aa (FFF)F
      // 32f: fstore 18
      // 331: aload 1
      // 332: getfield qeaa361f143ee4a0894bd168fd9b30c66/qf4ccf8f5435d4a78bdca4d6a018b578e/abbbb.ba F
      // 335: fload 13
      // 337: fload 18
      // 339: invokestatic qeaa361f143ee4a0894bd168fd9b30c66/qf4ccf8f5435d4a78bdca4d6a018b578e/aabbbbab.aaa (FFF)F
      // 33c: fstore 13
      // 33e: aload 1
      // 33f: getfield qeaa361f143ee4a0894bd168fd9b30c66/qf4ccf8f5435d4a78bdca4d6a018b578e/abbbb.aab F
      // 342: fload 14
      // 344: fload 18
      // 346: invokestatic qeaa361f143ee4a0894bd168fd9b30c66/qf4ccf8f5435d4a78bdca4d6a018b578e/aabbbbab.aaa (FFF)F
      // 349: fstore 14
      // 34b: fload 13
      // 34d: fload 8
      // 34f: fdiv
      // 350: invokestatic java/lang/Math.round (F)I
      // 353: i2f
      // 354: fload 8
      // 356: fmul
      // 357: fstore 13
      // 359: fload 14
      // 35b: fload 8
      // 35d: fdiv
      // 35e: invokestatic java/lang/Math.round (F)I
      // 361: i2f
      // 362: fload 8
      // 364: fmul
      // 365: fstore 14
      // 367: aload 0
      // 368: fload 13
      // 36a: invokestatic java/lang/Math.abs (F)F
      // 36d: putfield qeaa361f143ee4a0894bd168fd9b30c66/qf4ccf8f5435d4a78bdca4d6a018b578e/ababbbbb.aa F
      // 370: aload 1
      // 371: fload 13
      // 373: putfield qeaa361f143ee4a0894bd168fd9b30c66/qf4ccf8f5435d4a78bdca4d6a018b578e/abbbb.ba F
      // 376: aload 1
      // 377: fload 14
      // 379: putfield qeaa361f143ee4a0894bd168fd9b30c66/qf4ccf8f5435d4a78bdca4d6a018b578e/abbbb.aab F
      // 37c: aload 1
      // 37d: fload 13
      // 37f: invokestatic java/lang/Math.abs (F)F
      // 382: fload 14
      // 384: invokestatic java/lang/Math.abs (F)F
      // 387: fadd
      // 388: putfield qeaa361f143ee4a0894bd168fd9b30c66/qf4ccf8f5435d4a78bdca4d6a018b578e/abbbb.ab F
      // 38b: aload 2
      // 38c: fload 13
      // 38e: fload 14
      // 390: invokevirtual qeaa361f143ee4a0894bd168fd9b30c66/qf4ccf8f5435d4a78bdca4d6a018b578e/babb.aba (FF)Lqeaa361f143ee4a0894bd168fd9b30c66/qf4ccf8f5435d4a78bdca4d6a018b578e/babb;
      // 393: astore 19
      // 395: aload 1
      // 396: aload 19
      // 398: invokevirtual qeaa361f143ee4a0894bd168fd9b30c66/qf4ccf8f5435d4a78bdca4d6a018b578e/babb.bb ()F
      // 39b: putfield qeaa361f143ee4a0894bd168fd9b30c66/qf4ccf8f5435d4a78bdca4d6a018b578e/abbbb.bb F
      // 39e: aload 1
      // 39f: iload 9
      // 3a1: ifne 3d8
      // 3a4: aload 19
      // 3a6: invokevirtual qeaa361f143ee4a0894bd168fd9b30c66/qf4ccf8f5435d4a78bdca4d6a018b578e/babb.aab ()F
      // 3a9: putfield qeaa361f143ee4a0894bd168fd9b30c66/qf4ccf8f5435d4a78bdca4d6a018b578e/abbbb.aa F
      // 3ac: aload 1
      // 3ad: getfield qeaa361f143ee4a0894bd168fd9b30c66/qf4ccf8f5435d4a78bdca4d6a018b578e/abbbb.a F
      // 3b0: invokestatic java/lang/Float.isFinite (F)Z
      // 3b3: ifeq 3d7
      // 3b6: goto 3ba
      // 3b9: athrow
      // 3ba: fload 17
      // 3bc: aload 1
      // 3bd: getfield qeaa361f143ee4a0894bd168fd9b30c66/qf4ccf8f5435d4a78bdca4d6a018b578e/abbbb.a F
      // 3c0: ldc 1.25
      // 3c2: fmul
      // 3c3: ldc 0.5
      // 3c5: fadd
      // 3c6: fcmpl
      // 3c7: iload 9
      // 3c9: ifne 3e3
      // 3cc: goto 3d0
      // 3cf: athrow
      // 3d0: ifle 3dc
      // 3d3: goto 3d7
      // 3d6: athrow
      // 3d7: aload 1
      // 3d8: bipush 0
      // 3d9: putfield qeaa361f143ee4a0894bd168fd9b30c66/qf4ccf8f5435d4a78bdca4d6a018b578e/abbbb.aaa Z
      // 3dc: aload 1
      // 3dd: fload 17
      // 3df: putfield qeaa361f143ee4a0894bd168fd9b30c66/qf4ccf8f5435d4a78bdca4d6a018b578e/abbbb.a F
      // 3e2: bipush 2
      // 3e3: newarray 6
      // 3e5: dup
      // 3e6: bipush 0
      // 3e7: fload 13
      // 3e9: fastore
      // 3ea: dup
      // 3eb: bipush 1
      // 3ec: fload 14
      // 3ee: fastore
      // 3ef: areturn
   }

   private static int abb(int var0, long var1) {
      int var3 = var0 ^ (int)(var1 & 32767L) ^ a(1721580171, -2095061370 ^ 1081389576);
      if (ba[var3] == null) {
         ba[var3] = (int)(aaaa[var3] ^ var1);
      }

      return ba[var3];
   }

   public aabbbbab() {
      this.abb = abbbabbbb.b;
      this.aaba = 0.5F;
      this.bb = 10.0F;
   }

   public boolean baa() {
      return this.aab;
   }

   public float bab() {
      return this.aabb;
   }

   public float b() {
      return this.ab;
   }

   static {
      int var19 = 1684707811;
      char[] var10 = "廥廿".toCharArray();
      byte var15 = -1;
      String var9 = "ඣ\u0df9ඇഉഷ\u0dfaഝෞ൳එ\u0d65\u0d50ധ\u0dcdൎൻ贙赢趟贞趭赥跗跊赵贆";
      short var8 = 24309;
      String[] var11 = new String[var10.length];

      while (true) {
         int var12 = 0;
         int var13 = 0;
         int var14 = 0;
         if (var15 == 0) {
            abba = var11;
            abbb = new Object[var11.length];
            byte var21 = 0;
            int var10001 = 0;
            byte[] var10002 = "&\"ç{Cï¾@vi«Õ\u008a8Áì!Áeº\u008b\u000f\u0099ö\bWJþ²a}ú`Ë\u007fA#\u008c\u009eñ²<_\r|%\u0091à".getBytes("ISO-8859-1");
            abab = new int[12];

            int var38;
            do {
               abab[var21] = (
                     (var10002[var10001] & 255) << 24
                        | (var10002[var10001 + 1] & 255) << 16
                        | (var10002[var10001 + 2] & 255) << 8
                        | var10002[var10001 + 3] & 255
                  )
                  ^ 640475290;
               var21 += 1;
               var38 = var10001 + 4;
               var10001 += 4;
            } while (var38 < var10002.length);

            long var0 = 2235097118710060414L;
            long[] var6 = new long[2];
            int var3 = 0;
            String var4;
            int var5 = (var4 = bbb(21120322, var19 ^ 834712030)).length();
            byte var2 = 0;

            do {
               var10001 = var2;
               var2 += 8;
               byte[] var7 = var4.substring(var10001, var2).getBytes(bbb(21120323, var19 ^ -1311774408));
               var10001 = var3++;
               long var46 = (
                     (var7[0] & 255L) << a(1721580161, var19 ^ -1731580996)
                        | (var7[1] & 255L) << a(1721580162, var19 ^ -1387512270)
                        | (var7[2] & 255L) << a(1721580163, var19 ^ 1360876546)
                        | (var7[3] & 255L) << a(1721580164, var19 ^ -85657685)
                        | (var7[4] & 255L) << a(1721580165, var19 ^ 1344932846)
                        | (var7[5] & 255L) << a(1721580166, var19 ^ -747448067)
                        | (var7[a(1721580167, var19 ^ 1766125554)] & 255L) << a(1721580168, var19 ^ -1141969596)
                        | var7[a(1721580169, var19 ^ -123138826)] & 255L
                  )
                  ^ var0;
               byte var39 = -1;
               var6[var10001] = var46;
            } while (var2 < var5);

            aaaa = var6;
            ba = new Integer[2];
            aba = abb(a(1721580170, var19 ^ 1763307255), 3554864310073075146L);
            return;
         }

         do {
            var14 = var10[var12] ^ var8;
            char[] var16 = var9.substring(var13, var13 + var14).toCharArray();
            int var17 = 0;

            do {
               short var18 = switch (var17 % 6) {
                  default -> 91;
                  case 1 -> 195;
                  case 2 -> 146;
                  case 3 -> 229;
                  case 4 -> 90;
                  case 5 -> 201;
               };
               var16[var17] = (char)(var16[var17] ^ var18);
            } while (++var17 < var16.length);

            var11[var12] = new String(var16).intern();
            var13 += var14;
         } while (++var12 < var10.length);

         var15 = 0;
      }
   }

   void bba(long var1) {
      this.aa.ba(var1);
   }
}
