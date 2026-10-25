package nsc;

import net.fabricmc.api.EnvType;
import net.fabricmc.api.Environment;
import net.minecraft.class_304;
import net.minecraft.class_310;
import net.minecraft.class_315;

@Environment(EnvType.CLIENT)
public final class bbabaabb extends abbaabbaa {
   private boolean aa;
   private static final String[] ab;
   private boolean ba;
   private static final String[] bb;
   private static final int[] bba;
   private long aaa;
   private long aab;
   private static final String[] bbb;
   private long aba;
   private boolean abb;
   private long baa;
   private static final Object[] aaaa;
   private boolean bab;

   private static int a(int var0, int var1) {
      int var2 = bba[var0 ^ -663077405] ^ var1 ^ var0;
      var2 += 20077;
      var2 ^= 49821;
      var2 -= 29343;
      var2 -= 29108;
      var2 ^= 1819;
      var2 ^= 32669;
      var2 ^= 37002;
      return var2 ^ 56632;
   }

   @Override
   public void bbaabb(class_310 param1) {
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
      // 006: ifne 011
      // 009: ifnull 03d
      // 00c: goto 010
      // 00f: athrow
      // 010: aload 1
      // 011: iload 2
      // 012: ifne 024
      // 015: getfield net/minecraft/class_310.field_1724 Lnet/minecraft/class_746;
      // 018: ifnull 03d
      // 01b: goto 01f
      // 01e: athrow
      // 01f: aload 1
      // 020: goto 024
      // 023: athrow
      // 024: iload 2
      // 025: ifne 037
      // 028: getfield net/minecraft/class_310.field_1690 Lnet/minecraft/class_315;
      // 02b: ifnull 03d
      // 02e: goto 032
      // 031: athrow
      // 032: aload 1
      // 033: goto 037
      // 036: athrow
      // 037: getfield net/minecraft/class_310.field_1755 Lnet/minecraft/class_437;
      // 03a: ifnull 03f
      // 03d: return
      // 03e: athrow
      // 03f: invokestatic qeaa361f143ee4a0894bd168fd9b30c66/qf4ccf8f5435d4a78bdca4d6a018b578e/abaaaaaba.aaaaa ()Lqeaa361f143ee4a0894bd168fd9b30c66/qf4ccf8f5435d4a78bdca4d6a018b578e/abaaaaaba;
      // 042: astore 3
      // 043: aload 3
      // 044: iload 2
      // 045: ifne 050
      // 048: ifnull 087
      // 04b: goto 04f
      // 04e: athrow
      // 04f: aload 3
      // 050: iload 2
      // 051: ifne 063
      // 054: invokevirtual qeaa361f143ee4a0894bd168fd9b30c66/qf4ccf8f5435d4a78bdca4d6a018b578e/abaaaaaba.aaba ()Lqeaa361f143ee4a0894bd168fd9b30c66/qf4ccf8f5435d4a78bdca4d6a018b578e/babbaba;
      // 057: ifnull 087
      // 05a: goto 05e
      // 05d: athrow
      // 05e: aload 3
      // 05f: goto 063
      // 062: athrow
      // 063: invokevirtual qeaa361f143ee4a0894bd168fd9b30c66/qf4ccf8f5435d4a78bdca4d6a018b578e/abaaaaaba.aaba ()Lqeaa361f143ee4a0894bd168fd9b30c66/qf4ccf8f5435d4a78bdca4d6a018b578e/babbaba;
      // 066: iload 2
      // 067: ifne 07c
      // 06a: invokevirtual qeaa361f143ee4a0894bd168fd9b30c66/qf4ccf8f5435d4a78bdca4d6a018b578e/babbaba.baaa ()Lqeaa361f143ee4a0894bd168fd9b30c66/qf4ccf8f5435d4a78bdca4d6a018b578e/aaababaa;
      // 06d: ifnull 087
      // 070: goto 074
      // 073: athrow
      // 074: aload 3
      // 075: invokevirtual qeaa361f143ee4a0894bd168fd9b30c66/qf4ccf8f5435d4a78bdca4d6a018b578e/abaaaaaba.aaba ()Lqeaa361f143ee4a0894bd168fd9b30c66/qf4ccf8f5435d4a78bdca4d6a018b578e/babbaba;
      // 078: goto 07c
      // 07b: athrow
      // 07c: invokevirtual qeaa361f143ee4a0894bd168fd9b30c66/qf4ccf8f5435d4a78bdca4d6a018b578e/babbaba.baaa ()Lqeaa361f143ee4a0894bd168fd9b30c66/qf4ccf8f5435d4a78bdca4d6a018b578e/aaababaa;
      // 07f: invokevirtual qeaa361f143ee4a0894bd168fd9b30c66/qf4ccf8f5435d4a78bdca4d6a018b578e/aaababaa.abb ()Z
      // 082: ifeq 087
      // 085: return
      // 086: athrow
      // 087: aload 1
      // 088: getfield net/minecraft/class_310.field_1690 Lnet/minecraft/class_315;
      // 08b: astore 4
      // 08d: aload 1
      // 08e: aload 4
      // 090: getfield net/minecraft/class_315.field_1913 Lnet/minecraft/class_304;
      // 093: invokestatic qeaa361f143ee4a0894bd168fd9b30c66/qf4ccf8f5435d4a78bdca4d6a018b578e/aabbabbbb.aaab (Lnet/minecraft/class_310;Lnet/minecraft/class_304;)Z
      // 096: istore 5
      // 098: aload 1
      // 099: aload 4
      // 09b: getfield net/minecraft/class_315.field_1849 Lnet/minecraft/class_304;
      // 09e: invokestatic qeaa361f143ee4a0894bd168fd9b30c66/qf4ccf8f5435d4a78bdca4d6a018b578e/aabbabbbb.aaab (Lnet/minecraft/class_310;Lnet/minecraft/class_304;)Z
      // 0a1: istore 6
      // 0a3: aload 1
      // 0a4: aload 4
      // 0a6: getfield net/minecraft/class_315.field_1894 Lnet/minecraft/class_304;
      // 0a9: invokestatic qeaa361f143ee4a0894bd168fd9b30c66/qf4ccf8f5435d4a78bdca4d6a018b578e/aabbabbbb.aaab (Lnet/minecraft/class_310;Lnet/minecraft/class_304;)Z
      // 0ac: istore 7
      // 0ae: aload 1
      // 0af: aload 4
      // 0b1: getfield net/minecraft/class_315.field_1881 Lnet/minecraft/class_304;
      // 0b4: invokestatic qeaa361f143ee4a0894bd168fd9b30c66/qf4ccf8f5435d4a78bdca4d6a018b578e/aabbabbbb.aaab (Lnet/minecraft/class_310;Lnet/minecraft/class_304;)Z
      // 0b7: istore 8
      // 0b9: invokestatic java/lang/System.currentTimeMillis ()J
      // 0bc: lstore 9
      // 0be: iload 5
      // 0c0: iload 2
      // 0c1: ifne 0ea
      // 0c4: ifeq 0e8
      // 0c7: goto 0cb
      // 0ca: athrow
      // 0cb: aload 0
      // 0cc: getfield qeaa361f143ee4a0894bd168fd9b30c66/qf4ccf8f5435d4a78bdca4d6a018b578e/bbabaabb.bab Z
      // 0cf: iload 2
      // 0d0: ifne 0ea
      // 0d3: goto 0d7
      // 0d6: athrow
      // 0d7: ifne 0e8
      // 0da: goto 0de
      // 0dd: athrow
      // 0de: aload 0
      // 0df: lload 9
      // 0e1: putfield qeaa361f143ee4a0894bd168fd9b30c66/qf4ccf8f5435d4a78bdca4d6a018b578e/bbabaabb.aab J
      // 0e4: goto 0e8
      // 0e7: athrow
      // 0e8: iload 6
      // 0ea: iload 2
      // 0eb: ifne 114
      // 0ee: ifeq 112
      // 0f1: goto 0f5
      // 0f4: athrow
      // 0f5: aload 0
      // 0f6: getfield qeaa361f143ee4a0894bd168fd9b30c66/qf4ccf8f5435d4a78bdca4d6a018b578e/bbabaabb.ba Z
      // 0f9: iload 2
      // 0fa: ifne 114
      // 0fd: goto 101
      // 100: athrow
      // 101: ifne 112
      // 104: goto 108
      // 107: athrow
      // 108: aload 0
      // 109: lload 9
      // 10b: putfield qeaa361f143ee4a0894bd168fd9b30c66/qf4ccf8f5435d4a78bdca4d6a018b578e/bbabaabb.aba J
      // 10e: goto 112
      // 111: athrow
      // 112: iload 7
      // 114: iload 2
      // 115: ifne 13e
      // 118: ifeq 13c
      // 11b: goto 11f
      // 11e: athrow
      // 11f: aload 0
      // 120: getfield qeaa361f143ee4a0894bd168fd9b30c66/qf4ccf8f5435d4a78bdca4d6a018b578e/bbabaabb.abb Z
      // 123: iload 2
      // 124: ifne 13e
      // 127: goto 12b
      // 12a: athrow
      // 12b: ifne 13c
      // 12e: goto 132
      // 131: athrow
      // 132: aload 0
      // 133: lload 9
      // 135: putfield qeaa361f143ee4a0894bd168fd9b30c66/qf4ccf8f5435d4a78bdca4d6a018b578e/bbabaabb.baa J
      // 138: goto 13c
      // 13b: athrow
      // 13c: iload 8
      // 13e: iload 2
      // 13f: ifne 18e
      // 142: ifeq 166
      // 145: goto 149
      // 148: athrow
      // 149: aload 0
      // 14a: iload 2
      // 14b: ifne 179
      // 14e: goto 152
      // 151: athrow
      // 152: getfield qeaa361f143ee4a0894bd168fd9b30c66/qf4ccf8f5435d4a78bdca4d6a018b578e/bbabaabb.aa Z
      // 155: ifne 166
      // 158: goto 15c
      // 15b: athrow
      // 15c: aload 0
      // 15d: lload 9
      // 15f: putfield qeaa361f143ee4a0894bd168fd9b30c66/qf4ccf8f5435d4a78bdca4d6a018b578e/bbabaabb.aaa J
      // 162: goto 166
      // 165: athrow
      // 166: aload 0
      // 167: iload 5
      // 169: putfield qeaa361f143ee4a0894bd168fd9b30c66/qf4ccf8f5435d4a78bdca4d6a018b578e/bbabaabb.bab Z
      // 16c: aload 0
      // 16d: iload 6
      // 16f: putfield qeaa361f143ee4a0894bd168fd9b30c66/qf4ccf8f5435d4a78bdca4d6a018b578e/bbabaabb.ba Z
      // 172: aload 0
      // 173: iload 7
      // 175: putfield qeaa361f143ee4a0894bd168fd9b30c66/qf4ccf8f5435d4a78bdca4d6a018b578e/bbabaabb.abb Z
      // 178: aload 0
      // 179: iload 8
      // 17b: putfield qeaa361f143ee4a0894bd168fd9b30c66/qf4ccf8f5435d4a78bdca4d6a018b578e/bbabaabb.aa Z
      // 17e: iload 5
      // 180: iload 6
      // 182: aload 0
      // 183: getfield qeaa361f143ee4a0894bd168fd9b30c66/qf4ccf8f5435d4a78bdca4d6a018b578e/bbabaabb.aab J
      // 186: aload 0
      // 187: getfield qeaa361f143ee4a0894bd168fd9b30c66/qf4ccf8f5435d4a78bdca4d6a018b578e/bbabaabb.aba J
      // 18a: bipush 1
      // 18b: invokestatic qeaa361f143ee4a0894bd168fd9b30c66/qf4ccf8f5435d4a78bdca4d6a018b578e/bbabaabb.ab (ZZJJZ)Z
      // 18e: istore 11
      // 190: iload 5
      // 192: iload 6
      // 194: aload 0
      // 195: getfield qeaa361f143ee4a0894bd168fd9b30c66/qf4ccf8f5435d4a78bdca4d6a018b578e/bbabaabb.aab J
      // 198: aload 0
      // 199: getfield qeaa361f143ee4a0894bd168fd9b30c66/qf4ccf8f5435d4a78bdca4d6a018b578e/bbabaabb.aba J
      // 19c: bipush 0
      // 19d: invokestatic qeaa361f143ee4a0894bd168fd9b30c66/qf4ccf8f5435d4a78bdca4d6a018b578e/bbabaabb.ab (ZZJJZ)Z
      // 1a0: istore 12
      // 1a2: iload 8
      // 1a4: iload 7
      // 1a6: aload 0
      // 1a7: getfield qeaa361f143ee4a0894bd168fd9b30c66/qf4ccf8f5435d4a78bdca4d6a018b578e/bbabaabb.aaa J
      // 1aa: aload 0
      // 1ab: getfield qeaa361f143ee4a0894bd168fd9b30c66/qf4ccf8f5435d4a78bdca4d6a018b578e/bbabaabb.baa J
      // 1ae: bipush 0
      // 1af: invokestatic qeaa361f143ee4a0894bd168fd9b30c66/qf4ccf8f5435d4a78bdca4d6a018b578e/bbabaabb.ab (ZZJJZ)Z
      // 1b2: istore 13
      // 1b4: iload 8
      // 1b6: iload 7
      // 1b8: aload 0
      // 1b9: getfield qeaa361f143ee4a0894bd168fd9b30c66/qf4ccf8f5435d4a78bdca4d6a018b578e/bbabaabb.aaa J
      // 1bc: aload 0
      // 1bd: getfield qeaa361f143ee4a0894bd168fd9b30c66/qf4ccf8f5435d4a78bdca4d6a018b578e/bbabaabb.baa J
      // 1c0: bipush 1
      // 1c1: invokestatic qeaa361f143ee4a0894bd168fd9b30c66/qf4ccf8f5435d4a78bdca4d6a018b578e/bbabaabb.ab (ZZJJZ)Z
      // 1c4: istore 14
      // 1c6: aload 0
      // 1c7: aload 1
      // 1c8: aload 4
      // 1ca: getfield net/minecraft/class_315.field_1913 Lnet/minecraft/class_304;
      // 1cd: iload 5
      // 1cf: iload 11
      // 1d1: aload 4
      // 1d3: getfield net/minecraft/class_315.field_1849 Lnet/minecraft/class_304;
      // 1d6: iload 6
      // 1d8: iload 12
      // 1da: invokevirtual qeaa361f143ee4a0894bd168fd9b30c66/qf4ccf8f5435d4a78bdca4d6a018b578e/bbabaabb.b (Lnet/minecraft/class_310;Lnet/minecraft/class_304;ZZLnet/minecraft/class_304;ZZ)V
      // 1dd: aload 0
      // 1de: aload 1
      // 1df: aload 4
      // 1e1: getfield net/minecraft/class_315.field_1894 Lnet/minecraft/class_304;
      // 1e4: iload 7
      // 1e6: iload 13
      // 1e8: aload 4
      // 1ea: getfield net/minecraft/class_315.field_1881 Lnet/minecraft/class_304;
      // 1ed: iload 8
      // 1ef: iload 14
      // 1f1: invokevirtual qeaa361f143ee4a0894bd168fd9b30c66/qf4ccf8f5435d4a78bdca4d6a018b578e/bbabaabb.b (Lnet/minecraft/class_310;Lnet/minecraft/class_304;ZZLnet/minecraft/class_304;ZZ)V
      // 1f4: aload 4
      // 1f6: getfield net/minecraft/class_315.field_1913 Lnet/minecraft/class_304;
      // 1f9: iload 11
      // 1fb: invokevirtual net/minecraft/class_304.method_23481 (Z)V
      // 1fe: aload 4
      // 200: getfield net/minecraft/class_315.field_1849 Lnet/minecraft/class_304;
      // 203: iload 12
      // 205: invokevirtual net/minecraft/class_304.method_23481 (Z)V
      // 208: aload 4
      // 20a: getfield net/minecraft/class_315.field_1894 Lnet/minecraft/class_304;
      // 20d: iload 13
      // 20f: invokevirtual net/minecraft/class_304.method_23481 (Z)V
      // 212: aload 4
      // 214: getfield net/minecraft/class_315.field_1881 Lnet/minecraft/class_304;
      // 217: iload 14
      // 219: invokevirtual net/minecraft/class_304.method_23481 (Z)V
      // 21c: return
   }

   @Override
   public void abaab() {
      this.bab = false;
      this.ba = false;
      this.abb = false;
      this.aa = false;
      this.aab = 0L;
      this.aba = 0L;
      this.baa = 0L;
      this.aaa = 0L;
   }

   private void b(class_310 param1, class_304 param2, boolean param3, boolean param4, class_304 param5, boolean param6, boolean param7) {
      // $VF: Couldn't be decompiled
      // Please report this to the Vineflower issue tracker, at https://github.com/Vineflower/vineflower/issues with a copy of the class file (if you have the rights to distribute it!)
      // java.lang.RuntimeException: parsing failure!
      //   at org.jetbrains.java.decompiler.modules.decompiler.decompose.DomHelper.parseGraph(DomHelper.java:211)
      //   at org.jetbrains.java.decompiler.main.rels.MethodProcessor.codeToJava(MethodProcessor.java:166)
      //
      // Bytecode:
      // 00: getstatic qeaa361f143ee4a0894bd168fd9b30c66/qf4ccf8f5435d4a78bdca4d6a018b578e/baaabbaa.bba I
      // 03: invokestatic qeaa361f143ee4a0894bd168fd9b30c66/qf4ccf8f5435d4a78bdca4d6a018b578e/aabbaabb.bab ()Lqeaa361f143ee4a0894bd168fd9b30c66/qf4ccf8f5435d4a78bdca4d6a018b578e/aabbaabb;
      // 06: astore 9
      // 08: istore 8
      // 0a: aload 9
      // 0c: ifnonnull 11
      // 0f: return
      // 10: athrow
      // 11: iload 3
      // 12: iload 8
      // 14: ifne 20
      // 17: ifeq 41
      // 1a: goto 1e
      // 1d: athrow
      // 1e: iload 6
      // 20: ifeq 41
      // 23: aload 9
      // 25: aload 0
      // 26: aload 1
      // 27: aload 2
      // 28: iload 4
      // 2a: invokevirtual qeaa361f143ee4a0894bd168fd9b30c66/qf4ccf8f5435d4a78bdca4d6a018b578e/aabbaabb.ba (Ljava/lang/Object;Lnet/minecraft/class_310;Lnet/minecraft/class_304;Z)V
      // 2d: iload 8
      // 2f: aload 9
      // 31: aload 0
      // 32: aload 1
      // 33: aload 5
      // 35: iload 7
      // 37: invokevirtual qeaa361f143ee4a0894bd168fd9b30c66/qf4ccf8f5435d4a78bdca4d6a018b578e/aabbaabb.ba (Ljava/lang/Object;Lnet/minecraft/class_310;Lnet/minecraft/class_304;Z)V
      // 3a: ifeq 56
      // 3d: goto 41
      // 40: athrow
      // 41: aload 9
      // 43: aload 0
      // 44: aload 1
      // 45: aload 2
      // 46: invokevirtual qeaa361f143ee4a0894bd168fd9b30c66/qf4ccf8f5435d4a78bdca4d6a018b578e/aabbaabb.baa (Ljava/lang/Object;Lnet/minecraft/class_310;Lnet/minecraft/class_304;)V
      // 49: aload 9
      // 4b: aload 0
      // 4c: aload 1
      // 4d: aload 5
      // 4f: invokevirtual qeaa361f143ee4a0894bd168fd9b30c66/qf4ccf8f5435d4a78bdca4d6a018b578e/aabbaabb.baa (Ljava/lang/Object;Lnet/minecraft/class_310;Lnet/minecraft/class_304;)V
      // 52: goto 56
      // 55: athrow
      // 56: return
   }

   private static String aa(int var0, int var1) {
      int var9 = 18943451;
      int var2 = (var0 ^ a(-663077398, var9 ^ 2000183390)) & a(-663077399, var9 ^ -988873742);
      if (bb[var2] == null) {
         char[] var3 = ab[var2].toCharArray();

         int var4 = switch (var3[0] & a(-663077400, var9 ^ -1245721841)) {
            case 0 -> a(-663077393, var9 ^ 564271967);
            case 1 -> a(-663077394, var9 ^ -688635343);
            case 2 -> a(-663077395, var9 ^ -510644908);
            case 3 -> a(-663077396, var9 ^ 2016321636);
            case 4 -> a(-663077389, var9 ^ -977944979);
            case 5 -> a(-663077390, var9 ^ 801534825);
            case 6 -> a(-663077391, var9 ^ 1722080603);
            case 7 -> a(-663077392, var9 ^ -277150205);
            case 8 -> a(-663077385, var9 ^ -1152211875);
            case 9 -> a(-663077386, var9 ^ 766995568);
            case 10 -> a(-663077387, var9 ^ 2075643273);
            case 11 -> a(-663077388, var9 ^ 1549171238);
            case 12 -> a(-663077381, var9 ^ 1567702391);
            case 13 -> a(-663077382, var9 ^ 1540816118);
            case 14 -> a(-663077383, var9 ^ -1434857488);
            case 15 -> a(-663077384, var9 ^ 1626329304);
            case 16 -> a(-663077377, var9 ^ -1031412015);
            case 17 -> a(-663077378, var9 ^ -1175615101);
            case 18 -> a(-663077379, var9 ^ -1299034580);
            case 19 -> a(-663077380, var9 ^ -1079787207);
            case 20 -> a(-663077437, var9 ^ 1267184947);
            case 21 -> a(-663077438, var9 ^ -2071445923);
            case 22 -> a(-663077439, var9 ^ -83490848);
            case 23 -> a(-663077440, var9 ^ -1651891185);
            case 24 -> a(-663077433, var9 ^ -1138389819);
            case 25 -> a(-663077434, var9 ^ 2019363471);
            case 26 -> a(-663077435, var9 ^ -1695070063);
            case 27 -> a(-663077436, var9 ^ -1261746903);
            case 28 -> a(-663077429, var9 ^ -7216338);
            case 29 -> a(-663077430, var9 ^ -1882452710);
            case 30 -> a(-663077431, var9 ^ 434248483);
            case 31 -> a(-663077432, var9 ^ 1490287134);
            case 32 -> a(-663077425, var9 ^ 2033912984);
            case 33 -> a(-663077426, var9 ^ -1515473990);
            case 34 -> a(-663077427, var9 ^ 2046925850);
            case 35 -> a(-663077428, var9 ^ 1432767632);
            case 36 -> a(-663077421, var9 ^ 860540830);
            case 37 -> a(-663077422, var9 ^ 2034946688);
            case 38 -> a(-663077423, var9 ^ 339890943);
            case 39 -> a(-663077424, var9 ^ 1326298432);
            case 40 -> a(-663077417, var9 ^ -289002552);
            case 41 -> a(-663077418, var9 ^ 561898245);
            case 42 -> a(-663077419, var9 ^ 1739539585);
            case 43 -> a(-663077420, var9 ^ 1481309925);
            case 44 -> a(-663077413, var9 ^ 1701577816);
            case 45 -> a(-663077414, var9 ^ -1311599389);
            case 46 -> a(-663077415, var9 ^ -85642226);
            case 47 -> a(-663077416, var9 ^ -374057003);
            case 48 -> a(-663077409, var9 ^ -1028688395);
            case 49 -> a(-663077410, var9 ^ 1572010627);
            case 50 -> a(-663077411, var9 ^ 528521133);
            case 51 -> a(-663077412, var9 ^ 546682741);
            case 52 -> a(-663077469, var9 ^ -657092263);
            case 53 -> a(-663077470, var9 ^ 869975050);
            case 54 -> a(-663077471, var9 ^ 1612282965);
            case 55 -> a(-663077472, var9 ^ 978640862);
            case 56 -> a(-663077465, var9 ^ -1243660406);
            case 57 -> a(-663077466, var9 ^ -388231175);
            case 58 -> a(-663077467, var9 ^ -1580218388);
            case 59 -> a(-663077468, var9 ^ 348835011);
            case 60 -> a(-663077461, var9 ^ -1772417605);
            case 61 -> a(-663077462, var9 ^ 2104303558);
            case 62 -> a(-663077463, var9 ^ 511839489);
            case 63 -> a(-663077464, var9 ^ 993727167);
            case 64 -> a(-663077457, var9 ^ -281385768);
            case 65 -> a(-663077458, var9 ^ 1918958924);
            case 66 -> a(-663077459, var9 ^ 1613848044);
            case 67 -> a(-663077460, var9 ^ 1708835536);
            case 68 -> a(-663077453, var9 ^ 735616330);
            case 69 -> a(-663077454, var9 ^ 2042536660);
            case 70 -> a(-663077455, var9 ^ 1066733149);
            case 71 -> a(-663077456, var9 ^ 897247731);
            case 72 -> a(-663077449, var9 ^ 996189902);
            case 73 -> a(-663077450, var9 ^ -499020639);
            case 74 -> a(-663077451, var9 ^ 339227732);
            case 75 -> a(-663077452, var9 ^ 883113032);
            case 76 -> a(-663077445, var9 ^ 879536490);
            case 77 -> a(-663077446, var9 ^ 1888548461);
            case 78 -> a(-663077447, var9 ^ -1690113574);
            case 79 -> a(-663077448, var9 ^ 788567522);
            case 80 -> a(-663077441, var9 ^ -265941934);
            case 81 -> a(-663077442, var9 ^ 602580990);
            case 82 -> a(-663077443, var9 ^ 1484130580);
            case 83 -> a(-663077444, var9 ^ -1013866172);
            case 84 -> a(-663077501, var9 ^ -1995479637);
            case 85 -> a(-663077502, var9 ^ 1582434846);
            case 86 -> a(-663077503, var9 ^ -1443613735);
            case 87 -> a(-663077504, var9 ^ -132320134);
            case 88 -> a(-663077497, var9 ^ 299666893);
            case 89 -> a(-663077498, var9 ^ -19985973);
            case 90 -> 0;
            case 91 -> 4;
            case 92 -> a(-663077499, var9 ^ 835318838);
            case 93 -> a(-663077500, var9 ^ -2047889111);
            case 94 -> a(-663077493, var9 ^ -497515680);
            case 95 -> a(-663077494, var9 ^ 1361578729);
            case 96 -> a(-663077495, var9 ^ 1572224347);
            case 97 -> a(-663077496, var9 ^ -1080055433);
            case 98 -> a(-663077489, var9 ^ -73270619);
            case 99 -> a(-663077490, var9 ^ -780062820);
            case 100 -> a(-663077491, var9 ^ 1820070910);
            case 101 -> a(-663077492, var9 ^ 245235500);
            case 102 -> a(-663077485, var9 ^ -1744754679);
            case 103 -> a(-663077486, var9 ^ -712774688);
            case 104 -> a(-663077487, var9 ^ 1883215293);
            case 105 -> a(-663077488, var9 ^ 1619240412);
            case 106 -> a(-663077481, var9 ^ 182146900);
            case 107 -> a(-663077482, var9 ^ 65241007);
            case 108 -> a(-663077483, var9 ^ 2052508952);
            case 109 -> a(-663077484, var9 ^ 507127399);
            case 110 -> a(-663077477, var9 ^ 1493188521);
            case 111 -> a(-663077478, var9 ^ 539243663);
            case 112 -> a(-663077479, var9 ^ -311813562);
            case 113 -> a(-663077480, var9 ^ 1459726108);
            case 114 -> a(-663077473, var9 ^ -522443029);
            case 115 -> a(-663077474, var9 ^ -575445214);
            case 116 -> a(-663077475, var9 ^ -936441001);
            case 117 -> a(-663077476, var9 ^ -1782446176);
            case 118 -> a(-663077533, var9 ^ -864171849);
            case 119 -> a(-663077534, var9 ^ 696426903);
            case 120 -> a(-663077535, var9 ^ -1908527441);
            case 121 -> a(-663077536, var9 ^ -1422577558);
            case 122 -> a(-663077529, var9 ^ -2119750762);
            case 123 -> a(-663077530, var9 ^ -2065090834);
            case 124 -> a(-663077531, var9 ^ -2083491773);
            case 125 -> a(-663077532, var9 ^ -767284259);
            case 126 -> a(-663077525, var9 ^ 1015949248);
            case 127 -> a(-663077526, var9 ^ 1944875517);
            case 128 -> a(-663077527, var9 ^ 2097083307);
            case 129 -> a(-663077528, var9 ^ 977301313);
            case 130 -> a(-663077521, var9 ^ -194201297);
            case 131 -> a(-663077522, var9 ^ 1965345243);
            case 132 -> a(-663077523, var9 ^ 1463654602);
            case 133 -> a(-663077524, var9 ^ -1460557882);
            case 134 -> a(-663077517, var9 ^ 1363132210);
            case 135 -> a(-663077518, var9 ^ -657702875);
            case 136 -> a(-663077519, var9 ^ -1987543627);
            case 137 -> a(-663077520, var9 ^ -1382301151);
            case 138 -> a(-663077513, var9 ^ 1241216871);
            case 139 -> 5;
            case 140 -> a(-663077514, var9 ^ -1429232277);
            case 141 -> a(-663077515, var9 ^ -1085174349);
            case 142 -> a(-663077516, var9 ^ -1306830864);
            case 143 -> a(-663077509, var9 ^ -63815743);
            case 144 -> a(-663077510, var9 ^ 121062609);
            case 145 -> a(-663077511, var9 ^ -48167968);
            case 146 -> a(-663077512, var9 ^ 1426286207);
            case 147 -> a(-663077505, var9 ^ 758731879);
            case 148 -> a(-663077506, var9 ^ 1486472057);
            case 149 -> a(-663077507, var9 ^ 1029012887);
            case 150 -> a(-663077508, var9 ^ 300007360);
            case 151 -> a(-663077565, var9 ^ 87572667);
            case 152 -> a(-663077566, var9 ^ 483843690);
            case 153 -> a(-663077567, var9 ^ 2079926339);
            case 154 -> a(-663077568, var9 ^ -1673787109);
            case 155 -> a(-663077561, var9 ^ -1304239335);
            case 156 -> a(-663077562, var9 ^ -1500756443);
            case 157 -> a(-663077563, var9 ^ -1924823579);
            case 158 -> a(-663077564, var9 ^ -718536247);
            case 159 -> a(-663077557, var9 ^ -1201348603);
            case 160 -> a(-663077558, var9 ^ 1226261321);
            case 161 -> a(-663077559, var9 ^ -904430627);
            case 162 -> a(-663077560, var9 ^ -42785422);
            case 163 -> a(-663077553, var9 ^ 327257985);
            case 164 -> a(-663077554, var9 ^ -258576437);
            case 165 -> a(-663077555, var9 ^ -57551432);
            case 166 -> a(-663077556, var9 ^ -277235839);
            case 167 -> a(-663077549, var9 ^ -1685317977);
            case 168 -> a(-663077550, var9 ^ 249466056);
            case 169 -> a(-663077551, var9 ^ 1360072977);
            case 170 -> a(-663077552, var9 ^ 180665197);
            case 171 -> a(-663077545, var9 ^ -818431681);
            case 172 -> a(-663077546, var9 ^ 975976746);
            case 173 -> a(-663077547, var9 ^ 1384651358);
            case 174 -> a(-663077548, var9 ^ -834201297);
            case 175 -> a(-663077541, var9 ^ -1609437972);
            case 176 -> a(-663077542, var9 ^ -605435250);
            case 177 -> a(-663077543, var9 ^ -2030150618);
            case 178 -> a(-663077544, var9 ^ 1375293231);
            case 179 -> a(-663077537, var9 ^ 568215550);
            case 180 -> a(-663077538, var9 ^ -1011599266);
            case 181 -> a(-663077539, var9 ^ -1715665147);
            case 182 -> a(-663077540, var9 ^ 657576611);
            case 183 -> a(-663077597, var9 ^ -279492061);
            case 184 -> a(-663077598, var9 ^ 971078401);
            case 185 -> a(-663077599, var9 ^ 1642900839);
            case 186 -> a(-663077600, var9 ^ 1357929818);
            case 187 -> a(-663077593, var9 ^ 1071323060);
            case 188 -> a(-663077594, var9 ^ -824520479);
            case 189 -> a(-663077595, var9 ^ 1721921835);
            case 190 -> a(-663077596, var9 ^ -1854774132);
            case 191 -> a(-663077589, var9 ^ -1474901245);
            case 192 -> a(-663077590, var9 ^ 597178108);
            case 193 -> a(-663077591, var9 ^ 1731363791);
            case 194 -> a(-663077592, var9 ^ 150783882);
            case 195 -> a(-663077585, var9 ^ -1880066094);
            case 196 -> a(-663077586, var9 ^ -730056209);
            case 197 -> a(-663077587, var9 ^ -137595148);
            case 198 -> a(-663077588, var9 ^ 1691258585);
            case 199 -> a(-663077581, var9 ^ -1271950285);
            case 200 -> 1;
            case 201 -> a(-663077582, var9 ^ -1807025810);
            case 202 -> a(-663077583, var9 ^ 550534343);
            case 203 -> a(-663077584, var9 ^ -1156578029);
            case 204 -> a(-663077577, var9 ^ 721696276);
            case 205 -> a(-663077578, var9 ^ 1504909439);
            case 206 -> a(-663077579, var9 ^ -1104645445);
            case 207 -> a(-663077580, var9 ^ 285676919);
            case 208 -> a(-663077573, var9 ^ -1919074843);
            case 209 -> a(-663077574, var9 ^ -870499879);
            case 210 -> a(-663077575, var9 ^ 693711195);
            case 211 -> a(-663077576, var9 ^ -1956030792);
            case 212 -> a(-663077569, var9 ^ -712443311);
            case 213 -> a(-663077570, var9 ^ -576905122);
            case 214 -> a(-663077571, var9 ^ 745634578);
            case 215 -> a(-663077572, var9 ^ -2135591424);
            case 216 -> a(-663077629, var9 ^ 1631145343);
            case 217 -> a(-663077630, var9 ^ -359339313);
            case 218 -> a(-663077631, var9 ^ -1487823968);
            case 219 -> a(-663077632, var9 ^ -1818345114);
            case 220 -> a(-663077625, var9 ^ -253477486);
            case 221 -> a(-663077626, var9 ^ 1434641646);
            case 222 -> a(-663077627, var9 ^ 1084118995);
            case 223 -> a(-663077628, var9 ^ 2044095214);
            case 224 -> a(-663077621, var9 ^ 863983177);
            case 225 -> a(-663077622, var9 ^ -413003788);
            case 226 -> a(-663077623, var9 ^ 2093578621);
            case 227 -> a(-663077624, var9 ^ 1658190756);
            case 228 -> a(-663077617, var9 ^ -1234773648);
            case 229 -> a(-663077618, var9 ^ -24471827);
            case 230 -> a(-663077619, var9 ^ 1108751451);
            case 231 -> a(-663077620, var9 ^ -1937694925);
            case 232 -> a(-663077613, var9 ^ -470394873);
            case 233 -> a(-663077614, var9 ^ 684761791);
            case 234 -> a(-663077615, var9 ^ -417093112);
            case 235 -> 3;
            case 236 -> a(-663077616, var9 ^ -709073749);
            case 237 -> a(-663077609, var9 ^ -534558149);
            case 238 -> a(-663077610, var9 ^ 150693504);
            case 239 -> a(-663077611, var9 ^ 2054605951);
            case 240 -> a(-663077612, var9 ^ 381676475);
            case 241 -> a(-663077605, var9 ^ 578480722);
            case 242 -> a(-663077606, var9 ^ -2040696804);
            case 243 -> a(-663077607, var9 ^ -1616696309);
            case 244 -> a(-663077608, var9 ^ -1569342970);
            case 245 -> 2;
            case 246 -> a(-663077601, var9 ^ -1156453957);
            case 247 -> a(-663077602, var9 ^ -1120789324);
            case 248 -> a(-663077603, var9 ^ -1334439059);
            case 249 -> a(-663077604, var9 ^ 139883245);
            case 250 -> a(-663077661, var9 ^ -1304631027);
            case 251 -> a(-663077662, var9 ^ 330203060);
            case 252 -> a(-663077663, var9 ^ -227490673);
            case 253 -> a(-663077664, var9 ^ 1871174756);
            case 254 -> a(-663077657, var9 ^ 2124871644);
            default -> a(-663077658, var9 ^ 270225371);
         };
         int var5 = (var1 & a(-663077659, var9 ^ 2017712695)) - var4;
         if (var5 < 0) {
            var5 += 256;
         }

         int var6 = ((var1 & a(-663077660, var9 ^ -1995660462)) >>> a(-663077653, var9 ^ 1120861132)) - var4;
         if (var6 < 0) {
            var6 += 256;
         }

         for (int var7 = 0; var7 < var3.length; var7++) {
            int var8 = var7 % 2;
            char var10002 = var3[var7];
            if (var8 == 0) {
               var3[var7] = (char)(var10002 ^ var5);
               var5 = ((var5 >>> 3 | var5 << 5) ^ var3[var7]) & a(-663077654, var9 ^ -1343852869);
            } else {
               var3[var7] = (char)(var10002 ^ var6);
               var6 = ((var6 >>> 3 | var6 << 5) ^ var3[var7]) & a(-663077655, var9 ^ 1685892619);
            }
         }

         bb[var2] = new String(var3).intern();
      }

      return bb[var2];
   }

   // $VF: Irreducible bytecode was duplicated to produce valid code
   static {
      int var18 = 1793975504;
      char[] var9 = "m".toCharArray();
      byte var14 = -1;
      String var8 = "⼲⾰⽰⹓\u2feb⽧⸉⾘⾤⿓⾈⾕⾖\u2e64⺩⻝⸱\u2e77⿴⺉⾓⸒\u2fe8⾔⺣⻅⿆⼆\u2e6a⽠⻧⸄⾑⹊⿋⽙⸒⾍⼵⽁⾶⸚⼛⾓\u2fd6⽎⽲⼒⼂⽌⼑⽎\u2e64⿶⼅⼴⸁⿔⿵⼔⼩⽬⿔⾊⽶⾩⽆⼥⽈⺆⼘⾹\u2fea⼩\u2fe8⻈⸿⾑⿋\u2ffd⽃⸄⼤⼵\u2feb⼔⸦⼉⾯⽀⼄⽹\u2fea\u2fdf⿋⼛⽱\u2fdc⾝⿉⽌⽅\u2fe5⼛⺌\u2efc⿋⾤\u2e69";
      short var7 = 11346;
      String[] var10 = new String[var9.length];

      while (true) {
         int var11 = 0;
         char var12 = 0;
         char var13 = '\u0000';
         if (var14 == 0) {
            bbb = var10;
            aaaa = new Object[var10.length];
            byte var21 = 0;
            int var10001 = 0;
            bba = new int[271];
            byte[] var10002 = "±u\u0013#\b\u00adûÏßþÎ\u009b\u001e¨B2\u0018ØY\u0081òpú\u0086ÀÓ°d}>óôJË\u001byÓ=§\b\u009eõétîDL\u0088zY\u009aj\u008d\u000fÅ\u0092ºk\u00adÌ#Õ!P\u009eN?%t=ôÇ=_]Ó´\u0080\u0081Ïà©%OvLëµ LJ:\u0007\u00adýæ\u0006\u008a½ü\u0000-|{ñ\u0082Nç;\u0014Ws\u0099~g½â\u0016\u000e1éiÏ\fäXA4\u0010|2\u009aßs¿, ý\u0087WÆq¥~çÞ\u000bB#¦\u008bäÁ\fÉ¸ï0Åê¤jb2Ô7\u008dõB\u0019\u009câ\u0003(z÷\"À\u008dÏþP46!ú\u001d\\\u000e\u009dÌ¯h±H\u0006\"±SÂO¹Õx\u0014ö5jµ=ª¦z\u0086då<TÄ^\u0003±\u007f\u0092>\u0097\u0083³ê)\u0014\u001a¡\u001eµ6²OÐ0\u0099Tõ)\u0006I}\u0006D{\u0010I{n6\u0002\u0083.\u00104h!CÉ;âýZa¯X!î$¾²³'\u008f#ú4FÆO1MàÍ \u008dd&\u0096\u0098WEy\u008cK`À\u0095\n´Áãn)\u009bzÄ;ÊÜß>!Càp#\u001a\u0094\"E\"idn\u0089£n\u0081n\u0014`\u009b&\u0006¹º\u000b>OÃµuoX¼\u0094o\u0097(w+kw\u0012À¹h×tû\u0014Ì«Ý\u008d\u0007x\u0011'°\u0003\u008d\u0088\u001b\u0098j uÒôå&\u0005©\u008bVò\u000f²ò£çséJ'\nt¥4\u008e\nj2s¥Þ\u00141Ö¹£\u0002\u0006\nÓ\u008bÏ\u0006M¼Oäd.å Z}{\u008az¯ù7\u0087\u0094\u001fUf~:Ãú©z\u008exkt+Ä\u0015Q;x$ðQ ×¹X\u0018þ\u0089!\u00adMxEÁ¦\u001b\u0002û¾ý{ßµ\u00ad¶\u0091\u009dê\fú' »'¡*\u0086Hà©\u0093Ô\u008c\u0097Î9\u0086î\u0097\u0086I]ry UÕÅ¯oðÎ°-Ú\\ª5ß\u0012¶\u008cØ+ðW\u0089¿«Êgu§Y(\u0017ñl'\u0005tða»î¾¯\u00979¹.ßN\u008a\fÆ\u0019dó\n'W\nÄ>é\u00837Ç\u001fÒsýÄö`Ey\u0012\u0000ö·ñ4\"xäª\fFéàÐÔ§É¸«\\ÌÃò¦Ú\u0082\u000b\u000eøá\u0018vÂÓM\u0003bDDf®ýÅJ\u001a>Z^ÃÀùG-Y\u0010 \u0002¯\u0016ÇÇ\u008eGé¹bÔýwÇÇÖ¾\u0002»\u008e×\u0080$ã\u009f`°\u0012ìÂ´\u0091ìúR¦\u0088¤ØHz\u000f¥«mïý§jTd´\u00826pÀw\u0097JU%\u000bù\nê\u0091¶Q?;É\u0094Ì8¸a×¹Q\ts\u009a\u0006\u0095¼\u009e)ûêk\u0086\u0080\u0012J=Ý\u0005Ûv\n\u0002Îâz%Àõ\u0098O¸,ÂF\u0086Ã|ÊS2´¬Ídb\u001aú¯:\u0017-h\u000b\u000bÚMd \u0096\u001b\u0095!P;=Yñ\u000bÊ\u0089å\nóíK\u0002xc±Æ<É\u0002=S\u0007G®Ô\u000bðê\u008f\u0087¸d¬7ñ\u009c?5\u000f{ïÔ\u0015ÁÏ±x\u009e{+û²àë\u0084\u0095pÿ±L\u0002H\u0099ÌåÓõÖJü\u0094\u0095Öf¼\u001e\u0097æ¹\u008ar¢±zÐ\u0092Ñ\u008b\u008es{¥\u0086f \u0012w\u008aüIÛNñ\":ÂÌÉ±ojÏüª\u001a~ÈeÁ\u0099«\u001fºÛ\u000eye\f\u001beÖ\n\"-í«h\u0084Öº¼\u0099\u008e}'2ø\u00ad9.z-í\u009dX³¥q\u0017Y\u0019í³1×z\u009eø¸\rßvs+%÷¼Ø+\u0080\u008eGå\\»ØË¨S\u0000áö!\u008dL\u009dMDl½y\u0081mbÝ¦÷<ÄX\u00ad\u0094ù\u008e:<àêh&æÉ\u009dEë\u008d\u0094:S\u00adò\u008féÇi'HUù\u001f©\u008bDÑ4|\\+%]qUKàÎ\u001d#¸\\½Ò÷°Ù\u00195{ûô\u001dè>?\u0087(\u008d}\u0097à²å»\u0004¥\\\u0081\u008e?3@DV"
               .getBytes("ISO-8859-1");

            int var51;
            do {
               bba[var21] = (
                     (var10002[var10001] & 255) << 24
                        | (var10002[var10001 + 1] & 255) << 16
                        | (var10002[var10001 + 2] & 255) << 8
                        | var10002[var10001 + 3] & 255
                  )
                  ^ -2103362142;
               var21 += 1;
               var51 = var10001 + 4;
               var10001 += 4;
            } while (var51 < var10002.length);

            String[] var5 = new String[2];
            int var3 = 0;
            String var2;
            int var4 = (var2 = ba(var18 ^ 1205136165, '챴', '뮓')).length();
            int var1 = a(-663077405, var18 ^ -2126349541);
            int var0 = -1;

            while (true) {
               label88: {
                  char[] var24 = var2.substring(++var0, var0 + var1).toCharArray();
                  var51 = var24.length;
                  int var6 = 0;
                  var39 = var24;
                  var10001 = var51;
                  char[] var55;
                  int var69;
                  if (var51 <= 1) {
                     var55 = var24;
                     var69 = var6;
                  } else {
                     var39 = var24;
                     var10001 = var51;
                     if (var51 <= var6) {
                        break label88;
                     }

                     var55 = var24;
                     var69 = var6;
                  }

                  while (true) {
                     var55[var69] = (char)(var55[var69] ^ switch (var6 % a(-663077406, var18 ^ 949654513)) {
                        case 0 -> a(-663077407, var18 ^ -271997201);
                        case 1 -> a(-663077408, var18 ^ 782183391);
                        case 2 -> a(-663077401, var18 ^ 686764530);
                        case 3 -> a(-663077402, var18 ^ -1035496787);
                        case 4 -> a(-663077403, var18 ^ -253437845);
                        case 5 -> a(-663077404, var18 ^ 1292475384);
                        default -> a(-663077397, var18 ^ 2063364911);
                     });
                     var6++;
                     if (var10001 == 0) {
                        var69 = var10001;
                        var55 = var39;
                     } else {
                        if (var10001 <= var6) {
                           break;
                        }

                        var55 = var39;
                        var69 = var6;
                     }
                  }
               }

               String var62 = new String(var39).intern();
               byte var31 = -1;
               var5[var3++] = var62;
               if ((var0 += var1) >= var4) {
                  ab = var5;
                  bb = new String[2];
                  return;
               }

               var1 = var2.charAt(var0);
            }
         }

         do {
            var13 = var9[var11];
            char[] var15 = var8.substring(var12, var12 + var13).toCharArray();
            int var16 = 0;

            do {
               short var17 = switch (var16 % 5) {
                  default -> 137;
                  case 1 -> 73;
                  case 2 -> 44;
                  case 3 -> 20;
                  case 4 -> 203;
               };
               var15[var16] = (char)(var15[var16] ^ var17 ^ var7);
            } while (++var16 < var15.length);

            var10[var11] = new String(var15).intern();
            var12 += var13;
         } while (++var11 < var9.length);

         var14 = 0;
      }
   }

   private static boolean ab(boolean param0, boolean param1, long param2, long param4, boolean param6) {
      // $VF: Couldn't be decompiled
      // Please report this to the Vineflower issue tracker, at https://github.com/Vineflower/vineflower/issues with a copy of the class file (if you have the rights to distribute it!)
      // java.lang.RuntimeException: parsing failure!
      //   at org.jetbrains.java.decompiler.modules.decompiler.decompose.DomHelper.parseGraph(DomHelper.java:211)
      //   at org.jetbrains.java.decompiler.main.rels.MethodProcessor.codeToJava(MethodProcessor.java:166)
      //
      // Bytecode:
      // 00: getstatic qeaa361f143ee4a0894bd168fd9b30c66/qf4ccf8f5435d4a78bdca4d6a018b578e/baaabbaa.bba I
      // 03: istore 7
      // 05: iload 0
      // 06: iload 7
      // 08: ifne 68
      // 0b: ifeq 66
      // 0e: goto 12
      // 11: athrow
      // 12: iload 1
      // 13: iload 7
      // 15: ifne 68
      // 18: goto 1c
      // 1b: athrow
      // 1c: ifeq 66
      // 1f: goto 23
      // 22: athrow
      // 23: lload 2
      // 24: lload 4
      // 26: lcmp
      // 27: iload 7
      // 29: ifne 38
      // 2c: goto 30
      // 2f: athrow
      // 30: ifle 3b
      // 33: goto 37
      // 36: athrow
      // 37: bipush 1
      // 38: goto 3c
      // 3b: bipush 0
      // 3c: istore 8
      // 3e: iload 6
      // 40: iload 7
      // 42: ifne 54
      // 45: ifeq 52
      // 48: goto 4c
      // 4b: athrow
      // 4c: iload 8
      // 4e: goto 65
      // 51: athrow
      // 52: iload 8
      // 54: iload 7
      // 56: ifne 61
      // 59: ifne 64
      // 5c: goto 60
      // 5f: athrow
      // 60: bipush 1
      // 61: goto 65
      // 64: bipush 0
      // 65: ireturn
      // 66: iload 6
      // 68: iload 7
      // 6a: ifne 75
      // 6d: ifeq 78
      // 70: goto 74
      // 73: athrow
      // 74: iload 0
      // 75: goto 79
      // 78: iload 1
      // 79: ireturn
   }

   private static String ba(int var0, char var1, char var2) {
      int var3 = var2 ^ '뮓';
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
      int var8 = (var7.getClassName().hashCode() ^ var7.getMethodName().hashCode()) >> 16 ^ 22392;
      int var9 = 0;

      do {
         int var10 = var4[var9] ^ '\uf2ce';
         var10 -= 34501;
         var10 -= 30933;
         var10 -= 27175;
         var4[var9] = (char)(var10 ^ var8 ^ var1 ^ var0 >> 16);
      } while (++var9 < var4.length);

      return new String(var4).intern();
   }

   // $VF: Handled exception range with multiple entry points by splitting it
   // $VF: Duplicated exception handlers to handle obfuscated exceptions
   @Override
   public void aabaa() {
      int var10000 = baaabbaa.bba;
      class_310 var2 = class_310.method_1551();
      int var1 = var10000;

      label52: {
         label47: {
            try {
               var9 = var2;
               if (var1 != 0) {
                  break label47;
               }

               if (var2 == null) {
                  break label52;
               }
            } catch (MatchException var8) {
               throw var8;
            }

            var9 = var2;
         }

         try {
            if (var9.field_1690 == null) {
               break label52;
            }
         } catch (MatchException var7) {
            throw var7;
         }

         aabbaabb var3 = aabbaabb.bab();

         label34: {
            label33: {
               try {
                  var10 = var3;
                  if (var1 != 0) {
                     break label33;
                  }

                  if (var3 == null) {
                     break label34;
                  }
               } catch (MatchException var6) {
                  throw var6;
               }

               var10 = var3;
            }

            var10.bba(this, var2);
         }

         class_315 var4 = var2.field_1690;
         var4.field_1913.method_23481(aabbabbbb.aaab(var2, var4.field_1913));
         var4.field_1849.method_23481(aabbabbbb.aaab(var2, var4.field_1849));
         var4.field_1894.method_23481(aabbabbbb.aaab(var2, var4.field_1894));
         var4.field_1881.method_23481(aabbabbbb.aaab(var2, var4.field_1881));
         return;
      }

      try {
         ;
      } catch (MatchException var5) {
         throw var5;
      }
   }

   public bbabaabb() {
      super(
         aabbaaaba.aaab(aa(a(-663077656, -283535534 ^ 933936239), a(-663077649, -283535534 ^ -1350148610))),
         bbaabbba.aaa,
         aabbaaaba.aaab(aa(a(-663077650, -283535534 ^ 381473505), a(-663077651, -283535534 ^ -2038196818)))
      );
   }
}
