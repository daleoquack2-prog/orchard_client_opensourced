package nsc;

import net.fabricmc.api.EnvType;
import net.fabricmc.api.Environment;
import net.minecraft.class_310;
import net.minecraft.class_3532;
import net.minecraft.class_746;

@Environment(EnvType.CLIENT)
public final class bbbaaa {
   private float aa;
   private boolean ab;
   private int a;
   private static final long[] ba;
   private float bb;
   private static final Object[] bba;
   private float aaa;
   private static final Integer[] aab;
   private boolean aba;
   private static final int[] baa;
   private static final String[] bab;
   private float b;
   private boolean abb;

   private static int aa(int var0, long var1) {
      int var3 = var0 ^ (int)(var1 & 32767L) ^ a(-472963026, -1130636662 ^ 684636713);
      if (aab[var3] == null) {
         aab[var3] = (int)(ba[var3] ^ var1);
      }

      return aab[var3];
   }

   public boolean ab() {
      return this.aba;
   }

   private void ba(class_310 param1, boolean param2) {
      // $VF: Couldn't be decompiled
      // Please report this to the Vineflower issue tracker, at https://github.com/Vineflower/vineflower/issues with a copy of the class file (if you have the rights to distribute it!)
      // java.lang.RuntimeException: parsing failure!
      //   at org.jetbrains.java.decompiler.modules.decompiler.decompose.DomHelper.parseGraph(DomHelper.java:211)
      //   at org.jetbrains.java.decompiler.main.rels.MethodProcessor.codeToJava(MethodProcessor.java:166)
      //
      // Bytecode:
      // 00: getstatic qeaa361f143ee4a0894bd168fd9b30c66/qf4ccf8f5435d4a78bdca4d6a018b578e/aabbabbab.ab I
      // 03: istore 3
      // 04: aload 0
      // 05: getfield qeaa361f143ee4a0894bd168fd9b30c66/qf4ccf8f5435d4a78bdca4d6a018b578e/bbbaaa.aba Z
      // 08: iload 3
      // 09: ifne 14
      // 0c: ifeq 17
      // 0f: goto 13
      // 12: athrow
      // 13: iload 2
      // 14: ifne 18
      // 17: return
      // 18: aload 1
      // 19: iload 3
      // 1a: ifne 25
      // 1d: ifnull 9b
      // 20: goto 24
      // 23: athrow
      // 24: aload 1
      // 25: iload 3
      // 26: ifne 75
      // 29: getfield net/minecraft/class_310.field_1724 Lnet/minecraft/class_746;
      // 2c: ifnull 9b
      // 2f: goto 33
      // 32: athrow
      // 33: aload 1
      // 34: getfield net/minecraft/class_310.field_1724 Lnet/minecraft/class_746;
      // 37: aload 0
      // 38: getfield qeaa361f143ee4a0894bd168fd9b30c66/qf4ccf8f5435d4a78bdca4d6a018b578e/bbbaaa.aa F
      // 3b: invokevirtual net/minecraft/class_746.method_36456 (F)V
      // 3e: aload 1
      // 3f: getfield net/minecraft/class_310.field_1724 Lnet/minecraft/class_746;
      // 42: aload 0
      // 43: getfield qeaa361f143ee4a0894bd168fd9b30c66/qf4ccf8f5435d4a78bdca4d6a018b578e/bbbaaa.bb F
      // 46: invokestatic qeaa361f143ee4a0894bd168fd9b30c66/qf4ccf8f5435d4a78bdca4d6a018b578e/bbbaaa.aaa (F)F
      // 49: invokevirtual net/minecraft/class_746.method_36457 (F)V
      // 4c: aload 1
      // 4d: getfield net/minecraft/class_310.field_1724 Lnet/minecraft/class_746;
      // 50: aload 0
      // 51: getfield qeaa361f143ee4a0894bd168fd9b30c66/qf4ccf8f5435d4a78bdca4d6a018b578e/bbbaaa.aa F
      // 54: putfield net/minecraft/class_746.field_3931 F
      // 57: aload 1
      // 58: getfield net/minecraft/class_310.field_1724 Lnet/minecraft/class_746;
      // 5b: aload 0
      // 5c: getfield qeaa361f143ee4a0894bd168fd9b30c66/qf4ccf8f5435d4a78bdca4d6a018b578e/bbbaaa.aa F
      // 5f: putfield net/minecraft/class_746.field_3932 F
      // 62: aload 1
      // 63: getfield net/minecraft/class_310.field_1724 Lnet/minecraft/class_746;
      // 66: aload 0
      // 67: getfield qeaa361f143ee4a0894bd168fd9b30c66/qf4ccf8f5435d4a78bdca4d6a018b578e/bbbaaa.bb F
      // 6a: invokestatic qeaa361f143ee4a0894bd168fd9b30c66/qf4ccf8f5435d4a78bdca4d6a018b578e/bbbaaa.aaa (F)F
      // 6d: putfield net/minecraft/class_746.field_3914 F
      // 70: aload 1
      // 71: goto 75
      // 74: athrow
      // 75: getfield net/minecraft/class_310.field_1724 Lnet/minecraft/class_746;
      // 78: aload 0
      // 79: getfield qeaa361f143ee4a0894bd168fd9b30c66/qf4ccf8f5435d4a78bdca4d6a018b578e/bbbaaa.bb F
      // 7c: invokestatic qeaa361f143ee4a0894bd168fd9b30c66/qf4ccf8f5435d4a78bdca4d6a018b578e/bbbaaa.aaa (F)F
      // 7f: putfield net/minecraft/class_746.field_3916 F
      // 82: aload 0
      // 83: bipush 1
      // 84: putfield qeaa361f143ee4a0894bd168fd9b30c66/qf4ccf8f5435d4a78bdca4d6a018b578e/bbbaaa.abb Z
      // 87: aload 0
      // 88: ldc -472963025
      // 8a: ldc -790627707
      // 8c: ldc 1157901891
      // 8e: ixor
      // 8f: invokestatic qeaa361f143ee4a0894bd168fd9b30c66/qf4ccf8f5435d4a78bdca4d6a018b578e/bbbaaa.a (II)I
      // 92: ldc2_w 5633579924564350316
      // 95: invokestatic qeaa361f143ee4a0894bd168fd9b30c66/qf4ccf8f5435d4a78bdca4d6a018b578e/bbbaaa.aa (IJ)I
      // 98: putfield qeaa361f143ee4a0894bd168fd9b30c66/qf4ccf8f5435d4a78bdca4d6a018b578e/bbbaaa.a I
      // 9b: aload 0
      // 9c: bipush 0
      // 9d: putfield qeaa361f143ee4a0894bd168fd9b30c66/qf4ccf8f5435d4a78bdca4d6a018b578e/bbbaaa.aba Z
      // a0: return
   }

   public float bb(float param1) {
      // $VF: Couldn't be decompiled
      // Please report this to the Vineflower issue tracker, at https://github.com/Vineflower/vineflower/issues with a copy of the class file (if you have the rights to distribute it!)
      // java.lang.RuntimeException: parsing failure!
      //   at org.jetbrains.java.decompiler.modules.decompiler.decompose.DomHelper.parseGraph(DomHelper.java:211)
      //   at org.jetbrains.java.decompiler.main.rels.MethodProcessor.codeToJava(MethodProcessor.java:166)
      //
      // Bytecode:
      // 00: getstatic qeaa361f143ee4a0894bd168fd9b30c66/qf4ccf8f5435d4a78bdca4d6a018b578e/aabbabbab.ab I
      // 03: istore 2
      // 04: aload 0
      // 05: getfield qeaa361f143ee4a0894bd168fd9b30c66/qf4ccf8f5435d4a78bdca4d6a018b578e/bbbaaa.abb Z
      // 08: ifeq 37
      // 0b: invokestatic net/minecraft/class_310.method_1551 ()Lnet/minecraft/class_310;
      // 0e: astore 3
      // 0f: aload 3
      // 10: iload 2
      // 11: ifne 1c
      // 14: ifnull 37
      // 17: goto 1b
      // 1a: athrow
      // 1b: aload 3
      // 1c: iload 2
      // 1d: ifne 2f
      // 20: getfield net/minecraft/class_310.field_1724 Lnet/minecraft/class_746;
      // 23: ifnull 37
      // 26: goto 2a
      // 29: athrow
      // 2a: aload 3
      // 2b: goto 2f
      // 2e: athrow
      // 2f: getfield net/minecraft/class_310.field_1724 Lnet/minecraft/class_746;
      // 32: fload 1
      // 33: invokevirtual net/minecraft/class_746.method_5705 (F)F
      // 36: freturn
      // 37: fload 1
      // 38: aload 0
      // 39: getfield qeaa361f143ee4a0894bd168fd9b30c66/qf4ccf8f5435d4a78bdca4d6a018b578e/bbbaaa.aaa F
      // 3c: aload 0
      // 3d: getfield qeaa361f143ee4a0894bd168fd9b30c66/qf4ccf8f5435d4a78bdca4d6a018b578e/bbbaaa.aa F
      // 40: invokestatic net/minecraft/class_3532.method_17821 (FFF)F
      // 43: freturn
   }

   private static float aaa(float var0) {
      return class_3532.method_15363(var0, -90.0F, 90.0F);
   }

   private static int a(int var0, int var1) {
      int var2 = baa[var0 ^ -472963026] ^ var1 ^ var0;
      var2 += 3873;
      var2 += 57247;
      var2 ^= 43461;
      var2 -= 17159;
      var2 += 46166;
      var2 -= 63228;
      var2 += 10434;
      var2 ^= 60304;
      return var2 - 22645;
   }

   private static String aaab(int var0, int var1) {
      int var3 = var0 ^ -1698867573;
      char[] var4 = bab[var3].toCharArray();
      StackTraceElement[] var2 = (StackTraceElement[])bba[var3];
      StackTraceElement[] var5;
      if (var2 != null) {
         var5 = var2;
      } else {
         var5 = new Throwable().getStackTrace();
         bba[var3] = var5;
      }

      StackTraceElement var6 = var5[1];
      int var7 = (var6.getClassName().hashCode() ^ var6.getMethodName().hashCode()) >> 16 ^ -1511654167;
      int var8 = 0;

      do {
         var4[var8] = (char)(var4[var8] ^ switch (var8 & 31) {
            default -> 76;
            case 1 -> 75;
            case 2 -> 218;
            case 3 -> 6;
            case 4 -> 156;
            case 5 -> 9;
            case 6 -> 122;
            case 7 -> 221;
            case 8 -> 252;
            case 9 -> 203;
            case 10 -> 211;
            case 11 -> 24;
            case 12 -> 193;
            case 13 -> 152;
            case 14 -> 152;
            case 15 -> 194;
            case 16 -> 177;
            case 17 -> 66;
            case 18 -> 68;
            case 19 -> 209;
            case 20 -> 195;
            case 21 -> 236;
            case 22 -> 86;
            case 23 -> 3;
            case 24 -> 167;
            case 25 -> 181;
            case 26 -> 90;
            case 27 -> 113;
            case 28 -> 191;
            case 29 -> 44;
            case 30 -> 81;
            case 31 -> 119;
         } ^ var1 >> 16 ^ var7);
      } while (++var8 < var4.length);

      return new String(var4).intern();
   }

   public boolean aab() {
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
      // 05: getfield qeaa361f143ee4a0894bd168fd9b30c66/qf4ccf8f5435d4a78bdca4d6a018b578e/bbbaaa.ab Z
      // 08: iload 1
      // 09: ifne 3a
      // 0c: ifne 39
      // 0f: goto 13
      // 12: athrow
      // 13: aload 0
      // 14: getfield qeaa361f143ee4a0894bd168fd9b30c66/qf4ccf8f5435d4a78bdca4d6a018b578e/bbbaaa.aba Z
      // 17: iload 1
      // 18: ifne 3a
      // 1b: goto 1f
      // 1e: athrow
      // 1f: ifne 39
      // 22: goto 26
      // 25: athrow
      // 26: aload 0
      // 27: getfield qeaa361f143ee4a0894bd168fd9b30c66/qf4ccf8f5435d4a78bdca4d6a018b578e/bbbaaa.abb Z
      // 2a: iload 1
      // 2b: ifne 3a
      // 2e: goto 32
      // 31: athrow
      // 32: ifeq 3d
      // 35: goto 39
      // 38: athrow
      // 39: bipush 1
      // 3a: goto 3e
      // 3d: bipush 0
      // 3e: ireturn
   }

   public boolean aba() {
      return this.abb;
   }

   static {
      int var24 = 1208820354;
      String[] var10002 = new String[2];
      int var17 = 0;
      int var18 = 0;
      String[] var16 = var10002;
      int var10001 = "\u0010焎\ue776爳ꝅ灾➚片\ue7f6燕\ue760焚Ꝺ牳\ue775状ꞯ\n㺩펮㲀Ꭸ㳥鍍㽨팑㴚厷".length();
      short var19 = 14455;
      int var15 = var10001;
      String var14 = "\u0010焎\ue776爳ꝅ灾➚片\ue7f6燕\ue760焚Ꝺ牳\ue775状ꞯ\n㺩펮㲀Ꭸ㳥鍍㽨팑㴚厷";

      do {
         int var22 = 0;
         char var20 = var14.charAt(var18);
         char[] var21 = var14.substring(var18 + 1, var18 + 1 + var20).toCharArray();

         do {
            int var23 = var21[var22];

            var23 = (char)(switch (var22 % 5) {
               default -> 160;
               case 1 -> 73;
               case 2 -> 201;
               case 3 -> 67;
               case 4 -> 104;
            }) ^ var23;
            if (var22 % 2 == 0) {
               var21[var22] = (char)((var23 >>> 2 | var23 << 14) & 65535 ^ var19);
            } else {
               var21[var22] = (char)((var23 << 2 | var23 >>> 14) & 65535 ^ var19);
            }
         } while (++var22 < var21.length);

         var16[var17] = new String(var21);
         var17++;
         var18 = var18 + var20 + 1;
      } while (var18 < var15);

      bab = var16;
      bba = new Object[var16.length];
      int var10 = 198372095;
      byte[] var8 = "\u0083·»I\u00829,`ep}ûÉ\u007fÝä&wM\u001aJ}\u009f0÷\u009fêüd,ö<ð*¹ÐO\u0001Ùp\u0080×¢çCÍ\u0099Y".getBytes("ISO-8859-1");
      int var9 = var8.length / 4;
      baa = new int[var9];
      byte var11 = 0;
      int var12 = 0;

      do {
         int var13 = (var8[var11] & 255) << 24 | (var8[var11 + 1] & 255) << 16 | (var8[var11 + 2] & 255) << 8 | var8[var11 + 3] & 255;
         var13 ^= var10;
         baa[var12] = var13;
         var11 += 4;
      } while (++var12 < var9);

      long var0 = 5296501776509698467L;
      long[] var6 = new long[2];
      int var3 = 0;
      String var4;
      int var5 = (var4 = aaab(-1698867573, var24 ^ -1557702255)).length();
      byte var2 = 0;

      do {
         int var27 = var2;
         var2 += 8;
         byte[] var7 = var4.substring(var27, var2).getBytes(aaab(-1698867574, var24 ^ 1889232496));
         var27 = var3++;
         long var10004 = (
               (var7[0] & 255L) << a(-472963028, var24 ^ -983542137)
                  | (var7[1] & 255L) << a(-472963027, var24 ^ 1768945297)
                  | (var7[2] & 255L) << a(-472963030, var24 ^ -2040063440)
                  | (var7[3] & 255L) << a(-472963029, var24 ^ -361904109)
                  | (var7[4] & 255L) << a(-472963032, var24 ^ 1469039012)
                  | (var7[5] & 255L) << a(-472963031, var24 ^ -1002644115)
                  | (var7[a(-472963034, var24 ^ 1346016216)] & 255L) << a(-472963033, var24 ^ -284036233)
                  | var7[a(-472963036, var24 ^ 549947628)] & 255L
            )
            ^ var0;
         byte var10003 = -1;
         var6[var27] = var10004;
      } while (var2 < var5);

      ba = var6;
      aab = new Integer[2];
   }

   public boolean abb() {
      return this.ab;
   }

   public void baa(class_310 param1, boolean param2, boolean param3) {
      // $VF: Couldn't be decompiled
      // Please report this to the Vineflower issue tracker, at https://github.com/Vineflower/vineflower/issues with a copy of the class file (if you have the rights to distribute it!)
      // java.lang.RuntimeException: parsing failure!
      //   at org.jetbrains.java.decompiler.modules.decompiler.decompose.DomHelper.parseGraph(DomHelper.java:211)
      //   at org.jetbrains.java.decompiler.main.rels.MethodProcessor.codeToJava(MethodProcessor.java:166)
      //
      // Bytecode:
      // 000: getstatic qeaa361f143ee4a0894bd168fd9b30c66/qf4ccf8f5435d4a78bdca4d6a018b578e/aabbabbab.ab I
      // 003: istore 4
      // 005: iload 2
      // 006: iload 4
      // 008: ifne 084
      // 00b: ifeq 077
      // 00e: goto 012
      // 011: athrow
      // 012: aload 0
      // 013: bipush 0
      // 014: putfield qeaa361f143ee4a0894bd168fd9b30c66/qf4ccf8f5435d4a78bdca4d6a018b578e/bbbaaa.abb Z
      // 017: aload 0
      // 018: bipush 0
      // 019: putfield qeaa361f143ee4a0894bd168fd9b30c66/qf4ccf8f5435d4a78bdca4d6a018b578e/bbbaaa.a I
      // 01c: aload 0
      // 01d: getfield qeaa361f143ee4a0894bd168fd9b30c66/qf4ccf8f5435d4a78bdca4d6a018b578e/bbbaaa.ab Z
      // 020: ifne 076
      // 023: goto 027
      // 026: athrow
      // 027: aload 1
      // 028: iload 4
      // 02a: ifne 039
      // 02d: goto 031
      // 030: athrow
      // 031: ifnull 076
      // 034: goto 038
      // 037: athrow
      // 038: aload 1
      // 039: getfield net/minecraft/class_310.field_1724 Lnet/minecraft/class_746;
      // 03c: ifnull 076
      // 03f: aload 0
      // 040: bipush 1
      // 041: putfield qeaa361f143ee4a0894bd168fd9b30c66/qf4ccf8f5435d4a78bdca4d6a018b578e/bbbaaa.ab Z
      // 044: aload 0
      // 045: bipush 0
      // 046: putfield qeaa361f143ee4a0894bd168fd9b30c66/qf4ccf8f5435d4a78bdca4d6a018b578e/bbbaaa.aba Z
      // 049: aload 0
      // 04a: aload 1
      // 04b: getfield net/minecraft/class_310.field_1724 Lnet/minecraft/class_746;
      // 04e: invokevirtual net/minecraft/class_746.method_36454 ()F
      // 051: putfield qeaa361f143ee4a0894bd168fd9b30c66/qf4ccf8f5435d4a78bdca4d6a018b578e/bbbaaa.aa F
      // 054: aload 0
      // 055: aload 1
      // 056: getfield net/minecraft/class_310.field_1724 Lnet/minecraft/class_746;
      // 059: invokevirtual net/minecraft/class_746.method_36455 ()F
      // 05c: invokestatic qeaa361f143ee4a0894bd168fd9b30c66/qf4ccf8f5435d4a78bdca4d6a018b578e/bbbaaa.aaa (F)F
      // 05f: putfield qeaa361f143ee4a0894bd168fd9b30c66/qf4ccf8f5435d4a78bdca4d6a018b578e/bbbaaa.bb F
      // 062: aload 0
      // 063: aload 0
      // 064: getfield qeaa361f143ee4a0894bd168fd9b30c66/qf4ccf8f5435d4a78bdca4d6a018b578e/bbbaaa.aa F
      // 067: putfield qeaa361f143ee4a0894bd168fd9b30c66/qf4ccf8f5435d4a78bdca4d6a018b578e/bbbaaa.aaa F
      // 06a: aload 0
      // 06b: aload 0
      // 06c: getfield qeaa361f143ee4a0894bd168fd9b30c66/qf4ccf8f5435d4a78bdca4d6a018b578e/bbbaaa.bb F
      // 06f: putfield qeaa361f143ee4a0894bd168fd9b30c66/qf4ccf8f5435d4a78bdca4d6a018b578e/bbbaaa.b F
      // 072: goto 076
      // 075: athrow
      // 076: return
      // 077: aload 0
      // 078: iload 4
      // 07a: ifne 095
      // 07d: getfield qeaa361f143ee4a0894bd168fd9b30c66/qf4ccf8f5435d4a78bdca4d6a018b578e/bbbaaa.ab Z
      // 080: goto 084
      // 083: athrow
      // 084: ifne 094
      // 087: aload 0
      // 088: aload 1
      // 089: iload 3
      // 08a: invokevirtual qeaa361f143ee4a0894bd168fd9b30c66/qf4ccf8f5435d4a78bdca4d6a018b578e/bbbaaa.ba (Lnet/minecraft/class_310;Z)V
      // 08d: aload 0
      // 08e: aload 1
      // 08f: invokevirtual qeaa361f143ee4a0894bd168fd9b30c66/qf4ccf8f5435d4a78bdca4d6a018b578e/bbbaaa.bba (Lnet/minecraft/class_310;)V
      // 092: return
      // 093: athrow
      // 094: aload 0
      // 095: iload 4
      // 097: ifne 139
      // 09a: bipush 0
      // 09b: putfield qeaa361f143ee4a0894bd168fd9b30c66/qf4ccf8f5435d4a78bdca4d6a018b578e/bbbaaa.ab Z
      // 09e: iload 3
      // 09f: ifeq 138
      // 0a2: goto 0a6
      // 0a5: athrow
      // 0a6: aload 1
      // 0a7: iload 4
      // 0a9: ifne 0b8
      // 0ac: goto 0b0
      // 0af: athrow
      // 0b0: ifnull 138
      // 0b3: goto 0b7
      // 0b6: athrow
      // 0b7: aload 1
      // 0b8: iload 4
      // 0ba: ifne 10e
      // 0bd: getfield net/minecraft/class_310.field_1724 Lnet/minecraft/class_746;
      // 0c0: ifnull 138
      // 0c3: goto 0c7
      // 0c6: athrow
      // 0c7: aload 0
      // 0c8: bipush 0
      // 0c9: putfield qeaa361f143ee4a0894bd168fd9b30c66/qf4ccf8f5435d4a78bdca4d6a018b578e/bbbaaa.aba Z
      // 0cc: aload 1
      // 0cd: getfield net/minecraft/class_310.field_1724 Lnet/minecraft/class_746;
      // 0d0: aload 0
      // 0d1: getfield qeaa361f143ee4a0894bd168fd9b30c66/qf4ccf8f5435d4a78bdca4d6a018b578e/bbbaaa.aa F
      // 0d4: invokevirtual net/minecraft/class_746.method_36456 (F)V
      // 0d7: aload 1
      // 0d8: getfield net/minecraft/class_310.field_1724 Lnet/minecraft/class_746;
      // 0db: aload 0
      // 0dc: getfield qeaa361f143ee4a0894bd168fd9b30c66/qf4ccf8f5435d4a78bdca4d6a018b578e/bbbaaa.bb F
      // 0df: invokestatic qeaa361f143ee4a0894bd168fd9b30c66/qf4ccf8f5435d4a78bdca4d6a018b578e/bbbaaa.aaa (F)F
      // 0e2: invokevirtual net/minecraft/class_746.method_36457 (F)V
      // 0e5: aload 1
      // 0e6: getfield net/minecraft/class_310.field_1724 Lnet/minecraft/class_746;
      // 0e9: aload 0
      // 0ea: getfield qeaa361f143ee4a0894bd168fd9b30c66/qf4ccf8f5435d4a78bdca4d6a018b578e/bbbaaa.aa F
      // 0ed: putfield net/minecraft/class_746.field_3931 F
      // 0f0: aload 1
      // 0f1: getfield net/minecraft/class_310.field_1724 Lnet/minecraft/class_746;
      // 0f4: aload 0
      // 0f5: getfield qeaa361f143ee4a0894bd168fd9b30c66/qf4ccf8f5435d4a78bdca4d6a018b578e/bbbaaa.aa F
      // 0f8: putfield net/minecraft/class_746.field_3932 F
      // 0fb: aload 1
      // 0fc: getfield net/minecraft/class_310.field_1724 Lnet/minecraft/class_746;
      // 0ff: aload 0
      // 100: getfield qeaa361f143ee4a0894bd168fd9b30c66/qf4ccf8f5435d4a78bdca4d6a018b578e/bbbaaa.bb F
      // 103: invokestatic qeaa361f143ee4a0894bd168fd9b30c66/qf4ccf8f5435d4a78bdca4d6a018b578e/bbbaaa.aaa (F)F
      // 106: putfield net/minecraft/class_746.field_3914 F
      // 109: aload 1
      // 10a: goto 10e
      // 10d: athrow
      // 10e: getfield net/minecraft/class_310.field_1724 Lnet/minecraft/class_746;
      // 111: aload 0
      // 112: getfield qeaa361f143ee4a0894bd168fd9b30c66/qf4ccf8f5435d4a78bdca4d6a018b578e/bbbaaa.bb F
      // 115: invokestatic qeaa361f143ee4a0894bd168fd9b30c66/qf4ccf8f5435d4a78bdca4d6a018b578e/bbbaaa.aaa (F)F
      // 118: putfield net/minecraft/class_746.field_3916 F
      // 11b: aload 0
      // 11c: bipush 1
      // 11d: putfield qeaa361f143ee4a0894bd168fd9b30c66/qf4ccf8f5435d4a78bdca4d6a018b578e/bbbaaa.abb Z
      // 120: aload 0
      // 121: ldc_w -472963035
      // 124: ldc_w 728592885
      // 127: ldc_w 2135061055
      // 12a: ixor
      // 12b: invokestatic qeaa361f143ee4a0894bd168fd9b30c66/qf4ccf8f5435d4a78bdca4d6a018b578e/bbbaaa.a (II)I
      // 12e: ldc2_w 7378184461311853490
      // 131: invokestatic qeaa361f143ee4a0894bd168fd9b30c66/qf4ccf8f5435d4a78bdca4d6a018b578e/bbbaaa.aa (IJ)I
      // 134: putfield qeaa361f143ee4a0894bd168fd9b30c66/qf4ccf8f5435d4a78bdca4d6a018b578e/bbbaaa.a I
      // 137: return
      // 138: aload 0
      // 139: bipush 1
      // 13a: putfield qeaa361f143ee4a0894bd168fd9b30c66/qf4ccf8f5435d4a78bdca4d6a018b578e/bbbaaa.aba Z
      // 13d: return
   }

   public float bab(float param1) {
      // $VF: Couldn't be decompiled
      // Please report this to the Vineflower issue tracker, at https://github.com/Vineflower/vineflower/issues with a copy of the class file (if you have the rights to distribute it!)
      // java.lang.RuntimeException: parsing failure!
      //   at org.jetbrains.java.decompiler.modules.decompiler.decompose.DomHelper.parseGraph(DomHelper.java:211)
      //   at org.jetbrains.java.decompiler.main.rels.MethodProcessor.codeToJava(MethodProcessor.java:166)
      //
      // Bytecode:
      // 00: getstatic qeaa361f143ee4a0894bd168fd9b30c66/qf4ccf8f5435d4a78bdca4d6a018b578e/aabbabbab.ab I
      // 03: istore 2
      // 04: aload 0
      // 05: getfield qeaa361f143ee4a0894bd168fd9b30c66/qf4ccf8f5435d4a78bdca4d6a018b578e/bbbaaa.abb Z
      // 08: ifeq 37
      // 0b: invokestatic net/minecraft/class_310.method_1551 ()Lnet/minecraft/class_310;
      // 0e: astore 3
      // 0f: aload 3
      // 10: iload 2
      // 11: ifne 1c
      // 14: ifnull 37
      // 17: goto 1b
      // 1a: athrow
      // 1b: aload 3
      // 1c: iload 2
      // 1d: ifne 2f
      // 20: getfield net/minecraft/class_310.field_1724 Lnet/minecraft/class_746;
      // 23: ifnull 37
      // 26: goto 2a
      // 29: athrow
      // 2a: aload 3
      // 2b: goto 2f
      // 2e: athrow
      // 2f: getfield net/minecraft/class_310.field_1724 Lnet/minecraft/class_746;
      // 32: fload 1
      // 33: invokevirtual net/minecraft/class_746.method_5695 (F)F
      // 36: freturn
      // 37: fload 1
      // 38: aload 0
      // 39: getfield qeaa361f143ee4a0894bd168fd9b30c66/qf4ccf8f5435d4a78bdca4d6a018b578e/bbbaaa.b F
      // 3c: aload 0
      // 3d: getfield qeaa361f143ee4a0894bd168fd9b30c66/qf4ccf8f5435d4a78bdca4d6a018b578e/bbbaaa.bb F
      // 40: invokestatic net/minecraft/class_3532.method_16439 (FFF)F
      // 43: freturn
   }

   public void b(class_310 var1, boolean var2) {
      this.baa(var1, var2, true);
   }

   private void bba(class_310 param1) {
      // $VF: Couldn't be decompiled
      // Please report this to the Vineflower issue tracker, at https://github.com/Vineflower/vineflower/issues with a copy of the class file (if you have the rights to distribute it!)
      // java.lang.RuntimeException: parsing failure!
      //   at org.jetbrains.java.decompiler.modules.decompiler.decompose.DomHelper.parseGraph(DomHelper.java:211)
      //   at org.jetbrains.java.decompiler.main.rels.MethodProcessor.codeToJava(MethodProcessor.java:166)
      //
      // Bytecode:
      // 00: getstatic qeaa361f143ee4a0894bd168fd9b30c66/qf4ccf8f5435d4a78bdca4d6a018b578e/aabbabbab.ab I
      // 03: istore 2
      // 04: aload 0
      // 05: getfield qeaa361f143ee4a0894bd168fd9b30c66/qf4ccf8f5435d4a78bdca4d6a018b578e/bbbaaa.abb Z
      // 08: ifne 0d
      // 0b: return
      // 0c: athrow
      // 0d: aload 1
      // 0e: iload 2
      // 0f: ifne 1a
      // 12: ifnull 28
      // 15: goto 19
      // 18: athrow
      // 19: aload 1
      // 1a: iload 2
      // 1b: ifne 35
      // 1e: getfield net/minecraft/class_310.field_1724 Lnet/minecraft/class_746;
      // 21: ifnonnull 34
      // 24: goto 28
      // 27: athrow
      // 28: aload 0
      // 29: bipush 0
      // 2a: putfield qeaa361f143ee4a0894bd168fd9b30c66/qf4ccf8f5435d4a78bdca4d6a018b578e/bbbaaa.abb Z
      // 2d: aload 0
      // 2e: bipush 0
      // 2f: putfield qeaa361f143ee4a0894bd168fd9b30c66/qf4ccf8f5435d4a78bdca4d6a018b578e/bbbaaa.a I
      // 32: return
      // 33: athrow
      // 34: aload 1
      // 35: getfield net/minecraft/class_310.field_1724 Lnet/minecraft/class_746;
      // 38: invokestatic qeaa361f143ee4a0894bd168fd9b30c66/qf4ccf8f5435d4a78bdca4d6a018b578e/bbbaaa.bbb (Lnet/minecraft/class_746;)Z
      // 3b: iload 2
      // 3c: ifne 5d
      // 3f: ifne 60
      // 42: goto 46
      // 45: athrow
      // 46: aload 0
      // 47: dup
      // 48: getfield qeaa361f143ee4a0894bd168fd9b30c66/qf4ccf8f5435d4a78bdca4d6a018b578e/bbbaaa.a I
      // 4b: iload 2
      // 4c: ifne 6b
      // 4f: goto 53
      // 52: athrow
      // 53: bipush 1
      // 54: isub
      // 55: dup_x1
      // 56: putfield qeaa361f143ee4a0894bd168fd9b30c66/qf4ccf8f5435d4a78bdca4d6a018b578e/bbbaaa.a I
      // 59: goto 5d
      // 5c: athrow
      // 5d: ifgt 6e
      // 60: aload 0
      // 61: bipush 0
      // 62: putfield qeaa361f143ee4a0894bd168fd9b30c66/qf4ccf8f5435d4a78bdca4d6a018b578e/bbbaaa.abb Z
      // 65: aload 0
      // 66: bipush 0
      // 67: goto 6b
      // 6a: athrow
      // 6b: putfield qeaa361f143ee4a0894bd168fd9b30c66/qf4ccf8f5435d4a78bdca4d6a018b578e/bbbaaa.a I
      // 6e: return
   }

   private static boolean bbb(class_746 param0) {
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
      // 06: ifne 14
      // 09: ifnonnull 13
      // 0c: goto 10
      // 0f: athrow
      // 10: bipush 1
      // 11: ireturn
      // 12: athrow
      // 13: aload 0
      // 14: getfield net/minecraft/class_746.field_3932 F
      // 17: aload 0
      // 18: invokevirtual net/minecraft/class_746.method_36454 ()F
      // 1b: fsub
      // 1c: invokestatic net/minecraft/class_3532.method_15393 (F)F
      // 1f: invokestatic java/lang/Math.abs (F)F
      // 22: fstore 2
      // 23: aload 0
      // 24: getfield net/minecraft/class_746.field_3916 F
      // 27: aload 0
      // 28: invokevirtual net/minecraft/class_746.method_36455 ()F
      // 2b: fsub
      // 2c: invokestatic java/lang/Math.abs (F)F
      // 2f: fstore 3
      // 30: aload 0
      // 31: getfield net/minecraft/class_746.field_3931 F
      // 34: aload 0
      // 35: invokevirtual net/minecraft/class_746.method_36454 ()F
      // 38: fsub
      // 39: invokestatic net/minecraft/class_3532.method_15393 (F)F
      // 3c: invokestatic java/lang/Math.abs (F)F
      // 3f: fstore 4
      // 41: aload 0
      // 42: getfield net/minecraft/class_746.field_3914 F
      // 45: aload 0
      // 46: invokevirtual net/minecraft/class_746.method_36455 ()F
      // 49: fsub
      // 4a: invokestatic java/lang/Math.abs (F)F
      // 4d: fstore 5
      // 4f: fload 2
      // 50: iload 1
      // 51: ifne 64
      // 54: ldc_w 0.25
      // 57: fcmpg
      // 58: ifge a1
      // 5b: goto 5f
      // 5e: athrow
      // 5f: fload 3
      // 60: goto 64
      // 63: athrow
      // 64: iload 1
      // 65: ifne 79
      // 68: ldc_w 0.25
      // 6b: fcmpg
      // 6c: ifge a1
      // 6f: goto 73
      // 72: athrow
      // 73: fload 4
      // 75: goto 79
      // 78: athrow
      // 79: ldc_w 0.25
      // 7c: iload 1
      // 7d: ifne 91
      // 80: fcmpg
      // 81: ifge a1
      // 84: goto 88
      // 87: athrow
      // 88: fload 5
      // 8a: ldc_w 0.25
      // 8d: goto 91
      // 90: athrow
      // 91: fcmpg
      // 92: iload 1
      // 93: ifne 9e
      // 96: ifge a1
      // 99: goto 9d
      // 9c: athrow
      // 9d: bipush 1
      // 9e: goto a2
      // a1: bipush 0
      // a2: ireturn
   }

   public void aaaa(float param1, float param2, float param3, float param4) {
      // $VF: Couldn't be decompiled
      // Please report this to the Vineflower issue tracker, at https://github.com/Vineflower/vineflower/issues with a copy of the class file (if you have the rights to distribute it!)
      // java.lang.RuntimeException: parsing failure!
      //   at org.jetbrains.java.decompiler.modules.decompiler.decompose.DomHelper.parseGraph(DomHelper.java:211)
      //   at org.jetbrains.java.decompiler.main.rels.MethodProcessor.codeToJava(MethodProcessor.java:166)
      //
      // Bytecode:
      // 00: getstatic qeaa361f143ee4a0894bd168fd9b30c66/qf4ccf8f5435d4a78bdca4d6a018b578e/aabbabbab.ab I
      // 03: istore 5
      // 05: aload 0
      // 06: iload 5
      // 08: ifne 4e
      // 0b: getfield qeaa361f143ee4a0894bd168fd9b30c66/qf4ccf8f5435d4a78bdca4d6a018b578e/bbbaaa.ab Z
      // 0e: ifne 2b
      // 11: goto 15
      // 14: athrow
      // 15: aload 0
      // 16: iload 5
      // 18: ifne 4e
      // 1b: goto 1f
      // 1e: athrow
      // 1f: getfield qeaa361f143ee4a0894bd168fd9b30c66/qf4ccf8f5435d4a78bdca4d6a018b578e/bbbaaa.aba Z
      // 22: ifne 2b
      // 25: goto 29
      // 28: athrow
      // 29: return
      // 2a: athrow
      // 2b: aload 0
      // 2c: aload 0
      // 2d: getfield qeaa361f143ee4a0894bd168fd9b30c66/qf4ccf8f5435d4a78bdca4d6a018b578e/bbbaaa.aa F
      // 30: putfield qeaa361f143ee4a0894bd168fd9b30c66/qf4ccf8f5435d4a78bdca4d6a018b578e/bbbaaa.aaa F
      // 33: aload 0
      // 34: aload 0
      // 35: getfield qeaa361f143ee4a0894bd168fd9b30c66/qf4ccf8f5435d4a78bdca4d6a018b578e/bbbaaa.bb F
      // 38: putfield qeaa361f143ee4a0894bd168fd9b30c66/qf4ccf8f5435d4a78bdca4d6a018b578e/bbbaaa.b F
      // 3b: aload 0
      // 3c: aload 0
      // 3d: getfield qeaa361f143ee4a0894bd168fd9b30c66/qf4ccf8f5435d4a78bdca4d6a018b578e/bbbaaa.aa F
      // 40: fload 3
      // 41: fload 1
      // 42: fsub
      // 43: invokestatic net/minecraft/class_3532.method_15393 (F)F
      // 46: fadd
      // 47: invokestatic net/minecraft/class_3532.method_15393 (F)F
      // 4a: putfield qeaa361f143ee4a0894bd168fd9b30c66/qf4ccf8f5435d4a78bdca4d6a018b578e/bbbaaa.aa F
      // 4d: aload 0
      // 4e: aload 0
      // 4f: getfield qeaa361f143ee4a0894bd168fd9b30c66/qf4ccf8f5435d4a78bdca4d6a018b578e/bbbaaa.bb F
      // 52: fload 4
      // 54: fadd
      // 55: fload 2
      // 56: fsub
      // 57: invokestatic qeaa361f143ee4a0894bd168fd9b30c66/qf4ccf8f5435d4a78bdca4d6a018b578e/bbbaaa.aaa (F)F
      // 5a: putfield qeaa361f143ee4a0894bd168fd9b30c66/qf4ccf8f5435d4a78bdca4d6a018b578e/bbbaaa.bb F
      // 5d: return
   }
}
