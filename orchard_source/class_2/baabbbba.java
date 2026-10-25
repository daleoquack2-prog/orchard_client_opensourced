package nsc;

import java.awt.Color;
import java.util.ArrayList;
import java.util.List;
import net.fabricmc.api.EnvType;
import net.fabricmc.api.Environment;
import net.minecraft.class_1657;
import net.minecraft.class_238;
import net.minecraft.class_2960;
import net.minecraft.class_310;
import net.minecraft.class_332;

@Environment(EnvType.CLIENT)
public final class baabbbba extends abbaabbaa {
   private static final byte aa;
   private static final byte ba = 0;
   private static final int[] bbba;
   private static final double aaa = 4.0;
   private static final ababbbbaa aab;
   private final baabaab aba;
   private static final Object[] aaaaa;
   private final List abb;
   private static final Integer[] baa;
   private final byte[] bb;
   private static final ababbbbaa bab;
   private static final float bba = 0.05F;
   private static final String[] bbb;
   private static final ababbbbaa aaaa;
   private static final byte aaab = 1;
   private static final String[] aaba;
   private final abbaaaaa aabb;
   private final bababa abaa;
   private static final long[] abab;
   private final abbaaaaa ab;
   private static final double abba = 1.0;
   private final abaabaaab abbb;
   private static final int baaa;
   private final baabaab baab;
   private final abbaaaaa baba;
   private final baabaab babb;
   private static final String[] bbbb;
   private final abbaaaaa bbaa;
   private static final double bbab = 0.5;

   private void aa(class_332 param1, abbabbaaa param2) {
      // $VF: Couldn't be decompiled
      // Please report this to the Vineflower issue tracker, at https://github.com/Vineflower/vineflower/issues with a copy of the class file (if you have the rights to distribute it!)
      // java.lang.RuntimeException: parsing failure!
      //   at org.jetbrains.java.decompiler.modules.decompiler.decompose.DomHelper.parseGraph(DomHelper.java:211)
      //   at org.jetbrains.java.decompiler.main.rels.MethodProcessor.codeToJava(MethodProcessor.java:166)
      //
      // Bytecode:
      // 000: getstatic qeaa361f143ee4a0894bd168fd9b30c66/qf4ccf8f5435d4a78bdca4d6a018b578e/aabbabbab.ab I
      // 003: invokestatic net/minecraft/class_310.method_1551 ()Lnet/minecraft/class_310;
      // 006: astore 4
      // 008: istore 3
      // 009: aload 4
      // 00b: iload 3
      // 00c: ifne 018
      // 00f: ifnull 01e
      // 012: goto 016
      // 015: athrow
      // 016: aload 4
      // 018: invokevirtual net/minecraft/class_310.method_22683 ()Lnet/minecraft/class_1041;
      // 01b: ifnonnull 023
      // 01e: dconst_1
      // 01f: goto 030
      // 022: athrow
      // 023: dconst_1
      // 024: aload 4
      // 026: invokevirtual net/minecraft/class_310.method_22683 ()Lnet/minecraft/class_1041;
      // 029: invokevirtual net/minecraft/class_1041.method_4495 ()I
      // 02c: i2d
      // 02d: invokestatic java/lang/Math.max (DD)D
      // 030: dstore 5
      // 032: iload 3
      // 033: dconst_1
      // 034: dload 5
      // 036: ddiv
      // 037: dstore 7
      // 039: ldc2_w 0.5
      // 03c: dload 5
      // 03e: ddiv
      // 03f: dstore 9
      // 041: aload 2
      // 042: invokevirtual qeaa361f143ee4a0894bd168fd9b30c66/qf4ccf8f5435d4a78bdca4d6a018b578e/abbabbaaa.b ()D
      // 045: dload 5
      // 047: dmul
      // 048: invokestatic java/lang/Math.round (D)J
      // 04b: l2d
      // 04c: dload 5
      // 04e: ddiv
      // 04f: dstore 11
      // 051: aload 2
      // 052: invokevirtual qeaa361f143ee4a0894bd168fd9b30c66/qf4ccf8f5435d4a78bdca4d6a018b578e/abbabbaaa.aa ()D
      // 055: dload 5
      // 057: dmul
      // 058: invokestatic java/lang/Math.round (D)J
      // 05b: l2d
      // 05c: dload 5
      // 05e: ddiv
      // 05f: dstore 13
      // 061: ldc2_w 4.0
      // 064: aload 2
      // 065: invokevirtual qeaa361f143ee4a0894bd168fd9b30c66/qf4ccf8f5435d4a78bdca4d6a018b578e/abbabbaaa.ab ()D
      // 068: invokestatic java/lang/Math.ceil (D)D
      // 06b: invokestatic java/lang/Math.max (DD)D
      // 06e: dstore 15
      // 070: ldc2_w 4.0
      // 073: aload 2
      // 074: invokevirtual qeaa361f143ee4a0894bd168fd9b30c66/qf4ccf8f5435d4a78bdca4d6a018b578e/abbabbaaa.a ()D
      // 077: invokestatic java/lang/Math.ceil (D)D
      // 07a: invokestatic java/lang/Math.max (DD)D
      // 07d: dstore 17
      // 07f: ifne 11c
      // 082: aload 0
      // 083: getfield qeaa361f143ee4a0894bd168fd9b30c66/qf4ccf8f5435d4a78bdca4d6a018b578e/baabbbba.aba Lqeaa361f143ee4a0894bd168fd9b30c66/qf4ccf8f5435d4a78bdca4d6a018b578e/baabaab;
      // 086: invokevirtual qeaa361f143ee4a0894bd168fd9b30c66/qf4ccf8f5435d4a78bdca4d6a018b578e/baabaab.abbb ()Ljava/lang/Object;
      // 089: getstatic qeaa361f143ee4a0894bd168fd9b30c66/qf4ccf8f5435d4a78bdca4d6a018b578e/baabaaa.ab Lqeaa361f143ee4a0894bd168fd9b30c66/qf4ccf8f5435d4a78bdca4d6a018b578e/baabaaa;
      // 08c: if_acmpne 0d7
      // 08f: goto 093
      // 092: athrow
      // 093: aload 0
      // 094: aload 1
      // 095: dload 11
      // 097: dload 13
      // 099: dload 15
      // 09b: dload 17
      // 09d: ldc 1726314611
      // 09f: ldc 1460359241
      // 0a1: ldc -469254274
      // 0a3: ixor
      // 0a4: invokestatic qeaa361f143ee4a0894bd168fd9b30c66/qf4ccf8f5435d4a78bdca4d6a018b578e/baabbbba.b (II)I
      // 0a7: ldc2_w 1002423328820923512
      // 0aa: invokestatic qeaa361f143ee4a0894bd168fd9b30c66/qf4ccf8f5435d4a78bdca4d6a018b578e/baabbbba.a (IJ)I
      // 0ad: dload 9
      // 0af: dload 7
      // 0b1: dload 9
      // 0b3: ldc2_w 2.0
      // 0b6: dmul
      // 0b7: dadd
      // 0b8: invokevirtual qeaa361f143ee4a0894bd168fd9b30c66/qf4ccf8f5435d4a78bdca4d6a018b578e/baabbbba.aaba (Lnet/minecraft/class_332;DDDDIDD)V
      // 0bb: iload 3
      // 0bc: aload 0
      // 0bd: aload 1
      // 0be: dload 11
      // 0c0: dload 13
      // 0c2: dload 15
      // 0c4: dload 17
      // 0c6: aload 2
      // 0c7: invokevirtual qeaa361f143ee4a0894bd168fd9b30c66/qf4ccf8f5435d4a78bdca4d6a018b578e/abbabbaaa.aaa ()I
      // 0ca: dconst_0
      // 0cb: dload 7
      // 0cd: invokevirtual qeaa361f143ee4a0894bd168fd9b30c66/qf4ccf8f5435d4a78bdca4d6a018b578e/baabbbba.aaba (Lnet/minecraft/class_332;DDDDIDD)V
      // 0d0: ifeq 12f
      // 0d3: goto 0d7
      // 0d6: athrow
      // 0d7: aload 1
      // 0d8: dload 11
      // 0da: dload 13
      // 0dc: dload 15
      // 0de: dload 17
      // 0e0: ldc 1726314610
      // 0e2: ldc 1460359241
      // 0e4: ldc -1179337302
      // 0e6: ixor
      // 0e7: invokestatic qeaa361f143ee4a0894bd168fd9b30c66/qf4ccf8f5435d4a78bdca4d6a018b578e/baabbbba.b (II)I
      // 0ea: ldc2_w 2414753576049770998
      // 0ed: invokestatic qeaa361f143ee4a0894bd168fd9b30c66/qf4ccf8f5435d4a78bdca4d6a018b578e/baabbbba.a (IJ)I
      // 0f0: dload 9
      // 0f2: dneg
      // 0f3: dload 9
      // 0f5: invokestatic qeaa361f143ee4a0894bd168fd9b30c66/qf4ccf8f5435d4a78bdca4d6a018b578e/baabbbba.aabb (Lnet/minecraft/class_332;DDDDIDD)V
      // 0f8: aload 1
      // 0f9: dload 11
      // 0fb: dload 13
      // 0fd: dload 15
      // 0ff: dload 17
      // 101: ldc 1726314609
      // 103: ldc 1460359241
      // 105: ldc 621320529
      // 107: ixor
      // 108: invokestatic qeaa361f143ee4a0894bd168fd9b30c66/qf4ccf8f5435d4a78bdca4d6a018b578e/baabbbba.b (II)I
      // 10b: ldc2_w 2414753576049770998
      // 10e: invokestatic qeaa361f143ee4a0894bd168fd9b30c66/qf4ccf8f5435d4a78bdca4d6a018b578e/baabbbba.a (IJ)I
      // 111: dload 7
      // 113: dload 9
      // 115: invokestatic qeaa361f143ee4a0894bd168fd9b30c66/qf4ccf8f5435d4a78bdca4d6a018b578e/baabbbba.aabb (Lnet/minecraft/class_332;DDDDIDD)V
      // 118: goto 11c
      // 11b: athrow
      // 11c: aload 1
      // 11d: dload 11
      // 11f: dload 13
      // 121: dload 15
      // 123: dload 17
      // 125: aload 2
      // 126: invokevirtual qeaa361f143ee4a0894bd168fd9b30c66/qf4ccf8f5435d4a78bdca4d6a018b578e/abbabbaaa.aaa ()I
      // 129: dconst_0
      // 12a: dload 7
      // 12c: invokestatic qeaa361f143ee4a0894bd168fd9b30c66/qf4ccf8f5435d4a78bdca4d6a018b578e/baabbbba.aabb (Lnet/minecraft/class_332;DDDDIDD)V
      // 12f: aload 0
      // 130: getfield qeaa361f143ee4a0894bd168fd9b30c66/qf4ccf8f5435d4a78bdca4d6a018b578e/baabbbba.aabb Lqeaa361f143ee4a0894bd168fd9b30c66/qf4ccf8f5435d4a78bdca4d6a018b578e/abbaaaaa;
      // 133: invokevirtual qeaa361f143ee4a0894bd168fd9b30c66/qf4ccf8f5435d4a78bdca4d6a018b578e/abbaaaaa.abbb ()Ljava/lang/Object;
      // 136: checkcast java/lang/Boolean
      // 139: invokevirtual java/lang/Boolean.booleanValue ()Z
      // 13c: ifeq 157
      // 13f: aload 1
      // 140: aload 2
      // 141: invokevirtual qeaa361f143ee4a0894bd168fd9b30c66/qf4ccf8f5435d4a78bdca4d6a018b578e/abbabbaaa.bb ()D
      // 144: dload 11
      // 146: dload 13
      // 148: dload 15
      // 14a: dload 17
      // 14c: dload 7
      // 14e: dload 9
      // 150: invokestatic qeaa361f143ee4a0894bd168fd9b30c66/qf4ccf8f5435d4a78bdca4d6a018b578e/baabbbba.bba (Lnet/minecraft/class_332;DDDDDDD)V
      // 153: goto 157
      // 156: athrow
      // 157: return
   }

   private boolean ab() {
      try {
         if (this.babb.abbb() == aabbbbbba.a) {
            return true;
         }
      } catch (RuntimeException var1) {
         throw var1;
      }

      return false;
   }

   private boolean ba() {
      try {
         if (this.babb.abbb() == aabbbbbba.bb) {
            return true;
         }
      } catch (RuntimeException var1) {
         throw var1;
      }

      return false;
   }

   private boolean bb() {
      try {
         if (this.babb.abbb() == aabbbbbba.bb) {
            return true;
         }
      } catch (RuntimeException var1) {
         throw var1;
      }

      return false;
   }

   public boolean aaa() {
      // $VF: Couldn't be decompiled
      // Please report this to the Vineflower issue tracker, at https://github.com/Vineflower/vineflower/issues with a copy of the class file (if you have the rights to distribute it!)
      // java.lang.RuntimeException: parsing failure!
      //   at org.jetbrains.java.decompiler.modules.decompiler.decompose.DomHelper.parseGraph(DomHelper.java:211)
      //   at org.jetbrains.java.decompiler.main.rels.MethodProcessor.codeToJava(MethodProcessor.java:166)
      //
      // Bytecode:
      // 00: getstatic qeaa361f143ee4a0894bd168fd9b30c66/qf4ccf8f5435d4a78bdca4d6a018b578e/aabbabbab.ab I
      // 03: aload 0
      // 04: getfield qeaa361f143ee4a0894bd168fd9b30c66/qf4ccf8f5435d4a78bdca4d6a018b578e/baabbbba.babb Lqeaa361f143ee4a0894bd168fd9b30c66/qf4ccf8f5435d4a78bdca4d6a018b578e/baabaab;
      // 07: invokevirtual qeaa361f143ee4a0894bd168fd9b30c66/qf4ccf8f5435d4a78bdca4d6a018b578e/baabaab.abbb ()Ljava/lang/Object;
      // 0a: checkcast qeaa361f143ee4a0894bd168fd9b30c66/qf4ccf8f5435d4a78bdca4d6a018b578e/aabbbbbba
      // 0d: astore 2
      // 0e: istore 1
      // 0f: aload 2
      // 10: iload 1
      // 11: ifne 23
      // 14: getstatic qeaa361f143ee4a0894bd168fd9b30c66/qf4ccf8f5435d4a78bdca4d6a018b578e/aabbbbbba.aa Lqeaa361f143ee4a0894bd168fd9b30c66/qf4ccf8f5435d4a78bdca4d6a018b578e/aabbbbbba;
      // 17: if_acmpeq 29
      // 1a: goto 1e
      // 1d: athrow
      // 1e: aload 2
      // 1f: goto 23
      // 22: athrow
      // 23: getstatic qeaa361f143ee4a0894bd168fd9b30c66/qf4ccf8f5435d4a78bdca4d6a018b578e/aabbbbbba.a Lqeaa361f143ee4a0894bd168fd9b30c66/qf4ccf8f5435d4a78bdca4d6a018b578e/aabbbbbba;
      // 26: if_acmpne 2e
      // 29: bipush 1
      // 2a: goto 2f
      // 2d: athrow
      // 2e: bipush 0
      // 2f: ireturn
   }

   private static String aab(int var0, int var1) {
      int var9 = 1523087798;
      int var2 = (var0 ^ b(1726314608, var9 ^ 1733467228)) & b(1726314615, var9 ^ -686645161);
      if (aaba[var2] == null) {
         char[] var3 = bbb[var2].toCharArray();

         int var4 = switch (var3[0] & b(1726314614, var9 ^ -213093158)) {
            case 0 -> b(1726314613, var9 ^ -565875775);
            case 1 -> b(1726314612, var9 ^ 2135306213);
            case 2 -> b(1726314619, var9 ^ 1100019605);
            case 3 -> b(1726314618, var9 ^ -521966950);
            case 4 -> b(1726314617, var9 ^ -1979598686);
            case 5 -> b(1726314616, var9 ^ 1299424247);
            case 6 -> b(1726314623, var9 ^ 1465101008);
            case 7 -> b(1726314622, var9 ^ 679234278);
            case 8 -> b(1726314621, var9 ^ 63167869);
            case 9 -> b(1726314620, var9 ^ -1320707979);
            case 10 -> b(1726314595, var9 ^ -174875981);
            case 11 -> b(1726314594, var9 ^ -1175295291);
            case 12 -> b(1726314593, var9 ^ -124119843);
            case 13 -> b(1726314592, var9 ^ -542732454);
            case 14 -> b(1726314599, var9 ^ -238453445);
            case 15 -> b(1726314598, var9 ^ 860274448);
            case 16 -> b(1726314597, var9 ^ -871083514);
            case 17 -> b(1726314596, var9 ^ -1548986679);
            case 18 -> b(1726314603, var9 ^ -1616644972);
            case 19 -> b(1726314602, var9 ^ 423099576);
            case 20 -> b(1726314601, var9 ^ -1128490480);
            case 21 -> b(1726314600, var9 ^ -633628991);
            case 22 -> b(1726314607, var9 ^ -1822406207);
            case 23 -> b(1726314606, var9 ^ 278692944);
            case 24 -> b(1726314605, var9 ^ -1258271627);
            case 25 -> b(1726314604, var9 ^ 402529505);
            case 26 -> b(1726314579, var9 ^ -1175260625);
            case 27 -> b(1726314578, var9 ^ 148146058);
            case 28 -> b(1726314577, var9 ^ 843088827);
            case 29 -> b(1726314576, var9 ^ -2044448439);
            case 30 -> b(1726314583, var9 ^ -201027032);
            case 31 -> b(1726314582, var9 ^ 134159295);
            case 32 -> b(1726314581, var9 ^ 905409091);
            case 33 -> b(1726314580, var9 ^ 1985316255);
            case 34 -> b(1726314587, var9 ^ 379312176);
            case 35 -> b(1726314586, var9 ^ 1839167104);
            case 36 -> b(1726314585, var9 ^ -1296438159);
            case 37 -> b(1726314584, var9 ^ -145935595);
            case 38 -> b(1726314591, var9 ^ -1471087625);
            case 39 -> b(1726314590, var9 ^ 2001132459);
            case 40 -> b(1726314589, var9 ^ 516143035);
            case 41 -> b(1726314588, var9 ^ -1884031162);
            case 42 -> b(1726314563, var9 ^ -1646555453);
            case 43 -> b(1726314562, var9 ^ 1828862627);
            case 44 -> b(1726314561, var9 ^ -1743412347);
            case 45 -> b(1726314560, var9 ^ -1424554286);
            case 46 -> b(1726314567, var9 ^ 412721471);
            case 47 -> b(1726314566, var9 ^ 1220129103);
            case 48 -> b(1726314565, var9 ^ 708934277);
            case 49 -> b(1726314564, var9 ^ 687441412);
            case 50 -> b(1726314571, var9 ^ 456316973);
            case 51 -> 3;
            case 52 -> b(1726314570, var9 ^ 376616255);
            case 53 -> b(1726314569, var9 ^ -1076781021);
            case 54 -> b(1726314568, var9 ^ 1305690716);
            case 55 -> b(1726314575, var9 ^ -1030179290);
            case 56 -> b(1726314574, var9 ^ 938296531);
            case 57 -> b(1726314573, var9 ^ -907523642);
            case 58 -> b(1726314572, var9 ^ -122604522);
            case 59 -> b(1726314547, var9 ^ 49289580);
            case 60 -> b(1726314546, var9 ^ 1674142561);
            case 61 -> b(1726314545, var9 ^ -121038634);
            case 62 -> b(1726314544, var9 ^ 1965134043);
            case 63 -> b(1726314551, var9 ^ -745181422);
            case 64 -> b(1726314550, var9 ^ -75446629);
            case 65 -> b(1726314549, var9 ^ -1080094223);
            case 66 -> b(1726314548, var9 ^ 939294028);
            case 67 -> b(1726314555, var9 ^ -1149629801);
            case 68 -> b(1726314554, var9 ^ 1303399027);
            case 69 -> b(1726314553, var9 ^ -2039556319);
            case 70 -> b(1726314552, var9 ^ 76916887);
            case 71 -> b(1726314559, var9 ^ -1838817745);
            case 72 -> b(1726314558, var9 ^ -1885309281);
            case 73 -> b(1726314557, var9 ^ 262715797);
            case 74 -> b(1726314556, var9 ^ -287064985);
            case 75 -> b(1726314531, var9 ^ -1210775795);
            case 76 -> b(1726314530, var9 ^ 1279306899);
            case 77 -> b(1726314529, var9 ^ -1269856755);
            case 78 -> b(1726314528, var9 ^ -214754817);
            case 79 -> b(1726314535, var9 ^ 1561615700);
            case 80 -> b(1726314534, var9 ^ -1176449650);
            case 81 -> b(1726314533, var9 ^ -478603447);
            case 82 -> b(1726314532, var9 ^ 553928962);
            case 83 -> b(1726314539, var9 ^ -1291052297);
            case 84 -> b(1726314538, var9 ^ -982734646);
            case 85 -> b(1726314537, var9 ^ 1570984939);
            case 86 -> b(1726314536, var9 ^ 1178593326);
            case 87 -> b(1726314543, var9 ^ 502898834);
            case 88 -> b(1726314542, var9 ^ -2046790191);
            case 89 -> b(1726314541, var9 ^ 264834590);
            case 90 -> b(1726314540, var9 ^ 881936905);
            case 91 -> b(1726314515, var9 ^ 790583482);
            case 92 -> b(1726314514, var9 ^ -1377131689);
            case 93 -> b(1726314513, var9 ^ -1846333901);
            case 94 -> b(1726314512, var9 ^ 1584461757);
            case 95 -> b(1726314519, var9 ^ 686849089);
            case 96 -> b(1726314518, var9 ^ 325717724);
            case 97 -> b(1726314517, var9 ^ 1621084272);
            case 98 -> b(1726314516, var9 ^ 1559291282);
            case 99 -> b(1726314523, var9 ^ -258436765);
            case 100 -> b(1726314522, var9 ^ 1421311628);
            case 101 -> b(1726314521, var9 ^ -1149125842);
            case 102 -> b(1726314520, var9 ^ -564521496);
            case 103 -> b(1726314527, var9 ^ 402844991);
            case 104 -> b(1726314526, var9 ^ 2001175109);
            case 105 -> b(1726314525, var9 ^ 1876343663);
            case 106 -> b(1726314524, var9 ^ 294447045);
            case 107 -> b(1726314499, var9 ^ 1862871138);
            case 108 -> b(1726314498, var9 ^ 1689090853);
            case 109 -> b(1726314497, var9 ^ -872725343);
            case 110 -> b(1726314496, var9 ^ 873858194);
            case 111 -> b(1726314503, var9 ^ -1447614814);
            case 112 -> b(1726314502, var9 ^ -1433783470);
            case 113 -> b(1726314501, var9 ^ 791127704);
            case 114 -> b(1726314500, var9 ^ 86790979);
            case 115 -> b(1726314507, var9 ^ 349938986);
            case 116 -> b(1726314506, var9 ^ 1041877885);
            case 117 -> b(1726314505, var9 ^ -834049246);
            case 118 -> b(1726314504, var9 ^ 1063692268);
            case 119 -> b(1726314511, var9 ^ 871228253);
            case 120 -> b(1726314510, var9 ^ 1906181982);
            case 121 -> b(1726314509, var9 ^ -641738882);
            case 122 -> b(1726314508, var9 ^ 1485141556);
            case 123 -> b(1726314739, var9 ^ 344268976);
            case 124 -> b(1726314738, var9 ^ -728033636);
            case 125 -> b(1726314737, var9 ^ 1442560177);
            case 126 -> b(1726314736, var9 ^ 1012964272);
            case 127 -> b(1726314743, var9 ^ -2147032359);
            case 128 -> b(1726314742, var9 ^ 1562445688);
            case 129 -> b(1726314741, var9 ^ -904195889);
            case 130 -> b(1726314740, var9 ^ 1135145798);
            case 131 -> b(1726314747, var9 ^ -299468240);
            case 132 -> b(1726314746, var9 ^ 1149472946);
            case 133 -> b(1726314745, var9 ^ -1845441200);
            case 134 -> b(1726314744, var9 ^ 711263663);
            case 135 -> b(1726314751, var9 ^ -543016454);
            case 136 -> b(1726314750, var9 ^ 1911343752);
            case 137 -> b(1726314749, var9 ^ -1358883802);
            case 138 -> b(1726314748, var9 ^ -960038780);
            case 139 -> b(1726314723, var9 ^ 1383474306);
            case 140 -> b(1726314722, var9 ^ 1453211660);
            case 141 -> b(1726314721, var9 ^ 1063582432);
            case 142 -> b(1726314720, var9 ^ -524962525);
            case 143 -> b(1726314727, var9 ^ 1468921913);
            case 144 -> b(1726314726, var9 ^ -151780340);
            case 145 -> b(1726314725, var9 ^ -966976290);
            case 146 -> b(1726314724, var9 ^ -1528665484);
            case 147 -> b(1726314731, var9 ^ -1268140476);
            case 148 -> b(1726314730, var9 ^ 804221900);
            case 149 -> b(1726314729, var9 ^ 795883138);
            case 150 -> b(1726314728, var9 ^ 1390170126);
            case 151 -> b(1726314735, var9 ^ 352377113);
            case 152 -> b(1726314734, var9 ^ -1242652607);
            case 153 -> b(1726314733, var9 ^ -69045494);
            case 154 -> b(1726314732, var9 ^ 1929500546);
            case 155 -> b(1726314707, var9 ^ 1778098853);
            case 156 -> 4;
            case 157 -> 5;
            case 158 -> b(1726314706, var9 ^ -947246593);
            case 159 -> b(1726314705, var9 ^ -2058666211);
            case 160 -> b(1726314704, var9 ^ -1109933706);
            case 161 -> b(1726314711, var9 ^ 1074413424);
            case 162 -> b(1726314710, var9 ^ -772210821);
            case 163 -> b(1726314709, var9 ^ 617608955);
            case 164 -> b(1726314708, var9 ^ -286373397);
            case 165 -> b(1726314715, var9 ^ -386114299);
            case 166 -> b(1726314714, var9 ^ -9600478);
            case 167 -> b(1726314713, var9 ^ -261432475);
            case 168 -> b(1726314712, var9 ^ 1830647463);
            case 169 -> b(1726314719, var9 ^ -48450477);
            case 170 -> b(1726314718, var9 ^ 524144697);
            case 171 -> 2;
            case 172 -> b(1726314717, var9 ^ -1275335875);
            case 173 -> b(1726314716, var9 ^ 53820524);
            case 174 -> b(1726314691, var9 ^ 1815283069);
            case 175 -> b(1726314690, var9 ^ 1820240730);
            case 176 -> b(1726314689, var9 ^ -1743501642);
            case 177 -> b(1726314688, var9 ^ 264648941);
            case 178 -> b(1726314695, var9 ^ 2039270350);
            case 179 -> b(1726314694, var9 ^ -1902831673);
            case 180 -> b(1726314693, var9 ^ -847678909);
            case 181 -> b(1726314692, var9 ^ -243399975);
            case 182 -> b(1726314699, var9 ^ -365347096);
            case 183 -> b(1726314698, var9 ^ -357056616);
            case 184 -> b(1726314697, var9 ^ 1471925717);
            case 185 -> b(1726314696, var9 ^ 1702100789);
            case 186 -> b(1726314703, var9 ^ -379506655);
            case 187 -> b(1726314702, var9 ^ 19970860);
            case 188 -> b(1726314701, var9 ^ -1680115071);
            case 189 -> b(1726314700, var9 ^ -1209269097);
            case 190 -> b(1726314675, var9 ^ 756464436);
            case 191 -> b(1726314674, var9 ^ 1766161400);
            case 192 -> b(1726314673, var9 ^ -872021467);
            case 193 -> b(1726314672, var9 ^ -1659810575);
            case 194 -> b(1726314679, var9 ^ -365866228);
            case 195 -> b(1726314678, var9 ^ -545770165);
            case 196 -> b(1726314677, var9 ^ -999833049);
            case 197 -> b(1726314676, var9 ^ -1573485735);
            case 198 -> b(1726314683, var9 ^ -1925511541);
            case 199 -> b(1726314682, var9 ^ -1816151861);
            case 200 -> b(1726314681, var9 ^ -1558938073);
            case 201 -> b(1726314680, var9 ^ 1973463107);
            case 202 -> b(1726314687, var9 ^ 91520267);
            case 203 -> b(1726314686, var9 ^ -409409836);
            case 204 -> b(1726314685, var9 ^ 1285482064);
            case 205 -> b(1726314684, var9 ^ 1246450251);
            case 206 -> b(1726314659, var9 ^ -882234418);
            case 207 -> b(1726314658, var9 ^ -581038434);
            case 208 -> b(1726314657, var9 ^ 808121868);
            case 209 -> b(1726314656, var9 ^ -158848470);
            case 210 -> b(1726314663, var9 ^ 1247867384);
            case 211 -> b(1726314662, var9 ^ -2088316163);
            case 212 -> b(1726314661, var9 ^ 1799693459);
            case 213 -> b(1726314660, var9 ^ 706710583);
            case 214 -> b(1726314667, var9 ^ -1483230523);
            case 215 -> b(1726314666, var9 ^ -235332448);
            case 216 -> b(1726314665, var9 ^ -1570704750);
            case 217 -> b(1726314664, var9 ^ -1703933243);
            case 218 -> b(1726314671, var9 ^ -1549714942);
            case 219 -> b(1726314670, var9 ^ 2110033173);
            case 220 -> b(1726314669, var9 ^ 1002447561);
            case 221 -> b(1726314668, var9 ^ 1670182454);
            case 222 -> b(1726314643, var9 ^ -819865647);
            case 223 -> b(1726314642, var9 ^ 1418090573);
            case 224 -> b(1726314641, var9 ^ 1711697116);
            case 225 -> b(1726314640, var9 ^ -1758013363);
            case 226 -> b(1726314647, var9 ^ -888977469);
            case 227 -> b(1726314646, var9 ^ 1271336616);
            case 228 -> b(1726314645, var9 ^ 828367939);
            case 229 -> b(1726314644, var9 ^ 790286632);
            case 230 -> b(1726314651, var9 ^ 468559601);
            case 231 -> b(1726314650, var9 ^ 1244736916);
            case 232 -> b(1726314649, var9 ^ 1198547183);
            case 233 -> b(1726314648, var9 ^ -49826661);
            case 234 -> b(1726314655, var9 ^ -1126544887);
            case 235 -> b(1726314654, var9 ^ -456382814);
            case 236 -> b(1726314653, var9 ^ 1379015404);
            case 237 -> 0;
            case 238 -> b(1726314652, var9 ^ -940631249);
            case 239 -> b(1726314627, var9 ^ 1355569753);
            case 240 -> b(1726314626, var9 ^ -1735519499);
            case 241 -> b(1726314625, var9 ^ 167877105);
            case 242 -> b(1726314624, var9 ^ 356647213);
            case 243 -> b(1726314631, var9 ^ 331627893);
            case 244 -> b(1726314630, var9 ^ -745925442);
            case 245 -> b(1726314629, var9 ^ -485769510);
            case 246 -> b(1726314628, var9 ^ 1753041918);
            case 247 -> b(1726314635, var9 ^ -593960321);
            case 248 -> b(1726314634, var9 ^ -579803804);
            case 249 -> b(1726314633, var9 ^ 1388166326);
            case 250 -> b(1726314632, var9 ^ 671911993);
            case 251 -> b(1726314639, var9 ^ -716481292);
            case 252 -> 1;
            case 253 -> b(1726314638, var9 ^ -234965221);
            case 254 -> b(1726314637, var9 ^ 438529049);
            default -> b(1726314636, var9 ^ 68902506);
         };
         int var5 = (var1 & b(1726314867, var9 ^ 801959985)) - var4;
         if (var5 < 0) {
            var5 += 256;
         }

         int var6 = ((var1 & b(1726314866, var9 ^ 1237780354)) >>> b(1726314865, var9 ^ -1536597022)) - var4;
         if (var6 < 0) {
            var6 += 256;
         }

         for (int var7 = 0; var7 < var3.length; var7++) {
            int var8 = var7 % 2;
            char var10002 = var3[var7];
            if (var8 == 0) {
               var3[var7] = (char)(var10002 ^ var5);
               var5 = ((var5 >>> 3 | var5 << 5) ^ var3[var7]) & b(1726314864, var9 ^ 1163452302);
            } else {
               var3[var7] = (char)(var10002 ^ var6);
               var6 = ((var6 >>> 3 | var6 << 5) ^ var3[var7]) & b(1726314871, var9 ^ 1364791530);
            }
         }

         aaba[var2] = new String(var3).intern();
      }

      return aaba[var2];
   }

   private static int aba(Color var0) {
      return var0.getAlpha() << a(b(1726314870, -1088123874 ^ -686541239), 2039201096828830616L)
         | var0.getRed() << a(b(1726314869, -1088123874 ^ 832555194), 4651721636070183214L)
         | var0.getGreen() << a(b(1726314868, -1088123874 ^ 1220064563), 7019960217588991858L)
         | var0.getBlue();
   }

   private abbabbaaa abb(aabbbbaaa param1, class_310 param2, class_1657 param3, float param4) {
      // $VF: Couldn't be decompiled
      // Please report this to the Vineflower issue tracker, at https://github.com/Vineflower/vineflower/issues with a copy of the class file (if you have the rights to distribute it!)
      // java.lang.RuntimeException: parsing failure!
      //   at org.jetbrains.java.decompiler.modules.decompiler.decompose.DomHelper.parseGraph(DomHelper.java:211)
      //   at org.jetbrains.java.decompiler.main.rels.MethodProcessor.codeToJava(MethodProcessor.java:166)
      //
      // Bytecode:
      // 000: getstatic qeaa361f143ee4a0894bd168fd9b30c66/qf4ccf8f5435d4a78bdca4d6a018b578e/aabbabbab.ab I
      // 003: istore 5
      // 005: aload 2
      // 006: iload 5
      // 008: ifne 019
      // 00b: invokevirtual net/minecraft/class_310.method_22683 ()Lnet/minecraft/class_1041;
      // 00e: ifnonnull 018
      // 011: goto 015
      // 014: athrow
      // 015: aconst_null
      // 016: areturn
      // 017: athrow
      // 018: aload 2
      // 019: invokevirtual net/minecraft/class_310.method_22683 ()Lnet/minecraft/class_1041;
      // 01c: invokevirtual net/minecraft/class_1041.method_4486 ()I
      // 01f: istore 6
      // 021: aload 2
      // 022: invokevirtual net/minecraft/class_310.method_22683 ()Lnet/minecraft/class_1041;
      // 025: invokevirtual net/minecraft/class_1041.method_4502 ()I
      // 028: istore 7
      // 02a: iload 6
      // 02c: iload 5
      // 02e: ifne 03a
      // 031: ifle 03d
      // 034: goto 038
      // 037: athrow
      // 038: iload 7
      // 03a: ifgt 040
      // 03d: aconst_null
      // 03e: areturn
      // 03f: athrow
      // 040: aload 3
      // 041: fload 4
      // 043: invokestatic qeaa361f143ee4a0894bd168fd9b30c66/qf4ccf8f5435d4a78bdca4d6a018b578e/bbaabbaa.aa (Lnet/minecraft/class_1297;F)Lnet/minecraft/class_243;
      // 046: astore 8
      // 048: aload 3
      // 049: invokevirtual net/minecraft/class_1657.method_5829 ()Lnet/minecraft/class_238;
      // 04c: aload 8
      // 04e: getfield net/minecraft/class_243.field_1352 D
      // 051: aload 3
      // 052: invokevirtual net/minecraft/class_1657.method_23317 ()D
      // 055: dsub
      // 056: aload 8
      // 058: getfield net/minecraft/class_243.field_1351 D
      // 05b: aload 3
      // 05c: invokevirtual net/minecraft/class_1657.method_23318 ()D
      // 05f: dsub
      // 060: aload 8
      // 062: getfield net/minecraft/class_243.field_1350 D
      // 065: aload 3
      // 066: invokevirtual net/minecraft/class_1657.method_23321 ()D
      // 069: dsub
      // 06a: invokevirtual net/minecraft/class_238.method_989 (DDD)Lnet/minecraft/class_238;
      // 06d: astore 9
      // 06f: aload 1
      // 070: aload 9
      // 072: iload 6
      // 074: iload 7
      // 076: invokestatic qeaa361f143ee4a0894bd168fd9b30c66/qf4ccf8f5435d4a78bdca4d6a018b578e/baabbbba.baab (Lqeaa361f143ee4a0894bd168fd9b30c66/qf4ccf8f5435d4a78bdca4d6a018b578e/aabbbbaaa;Lnet/minecraft/class_238;II)[D
      // 079: astore 10
      // 07b: aload 10
      // 07d: ifnonnull 083
      // 080: aconst_null
      // 081: areturn
      // 082: athrow
      // 083: ldc2_w 4.0
      // 086: aload 10
      // 088: bipush 2
      // 089: daload
      // 08a: aload 10
      // 08c: bipush 0
      // 08d: daload
      // 08e: dsub
      // 08f: invokestatic java/lang/Math.max (DD)D
      // 092: dstore 11
      // 094: ldc2_w 4.0
      // 097: aload 10
      // 099: bipush 3
      // 09a: daload
      // 09b: aload 10
      // 09d: bipush 1
      // 09e: daload
      // 09f: dsub
      // 0a0: invokestatic java/lang/Math.max (DD)D
      // 0a3: dstore 13
      // 0a5: aload 10
      // 0a7: bipush 0
      // 0a8: daload
      // 0a9: aload 10
      // 0ab: bipush 2
      // 0ac: daload
      // 0ad: dadd
      // 0ae: ldc2_w 0.5
      // 0b1: dmul
      // 0b2: dstore 15
      // 0b4: aload 10
      // 0b6: bipush 1
      // 0b7: daload
      // 0b8: aload 10
      // 0ba: bipush 3
      // 0bb: daload
      // 0bc: dadd
      // 0bd: ldc2_w 0.5
      // 0c0: dmul
      // 0c1: dstore 17
      // 0c3: dload 15
      // 0c5: dload 11
      // 0c7: ldc2_w 0.5
      // 0ca: dmul
      // 0cb: dsub
      // 0cc: dstore 19
      // 0ce: dload 17
      // 0d0: dload 13
      // 0d2: ldc2_w 0.5
      // 0d5: dmul
      // 0d6: dsub
      // 0d7: dstore 21
      // 0d9: aload 10
      // 0db: bipush 2
      // 0dc: iload 5
      // 0de: ifne 0f4
      // 0e1: daload
      // 0e2: ldc2_w -60.0
      // 0e5: dcmpg
      // 0e6: iflt 134
      // 0e9: goto 0ed
      // 0ec: athrow
      // 0ed: aload 10
      // 0ef: bipush 0
      // 0f0: goto 0f4
      // 0f3: athrow
      // 0f4: daload
      // 0f5: iload 6
      // 0f7: i2d
      // 0f8: iload 5
      // 0fa: ifne 114
      // 0fd: ldc2_w 60.0
      // 100: dadd
      // 101: dcmpl
      // 102: ifgt 134
      // 105: goto 109
      // 108: athrow
      // 109: aload 10
      // 10b: bipush 3
      // 10c: daload
      // 10d: ldc2_w -60.0
      // 110: goto 114
      // 113: athrow
      // 114: iload 5
      // 116: ifne 130
      // 119: dcmpg
      // 11a: iflt 134
      // 11d: goto 121
      // 120: athrow
      // 121: aload 10
      // 123: bipush 1
      // 124: daload
      // 125: iload 7
      // 127: i2d
      // 128: ldc2_w 60.0
      // 12b: dadd
      // 12c: goto 130
      // 12f: athrow
      // 130: dcmpl
      // 131: ifle 137
      // 134: aconst_null
      // 135: areturn
      // 136: athrow
      // 137: new qeaa361f143ee4a0894bd168fd9b30c66/qf4ccf8f5435d4a78bdca4d6a018b578e/abbabbaaa
      // 13a: dup
      // 13b: dload 19
      // 13d: dload 21
      // 13f: dload 11
      // 141: dload 13
      // 143: aload 3
      // 144: aload 2
      // 145: getfield net/minecraft/class_310.field_1724 Lnet/minecraft/class_746;
      // 148: invokevirtual net/minecraft/class_1657.method_5858 (Lnet/minecraft/class_1297;)D
      // 14b: aload 3
      // 14c: invokestatic qeaa361f143ee4a0894bd168fd9b30c66/qf4ccf8f5435d4a78bdca4d6a018b578e/baabbbba.bbab (Lnet/minecraft/class_1657;)D
      // 14f: aload 0
      // 150: invokevirtual qeaa361f143ee4a0894bd168fd9b30c66/qf4ccf8f5435d4a78bdca4d6a018b578e/baabbbba.abba ()Ljava/awt/Color;
      // 153: invokestatic qeaa361f143ee4a0894bd168fd9b30c66/qf4ccf8f5435d4a78bdca4d6a018b578e/baabbbba.aba (Ljava/awt/Color;)I
      // 156: invokespecial qeaa361f143ee4a0894bd168fd9b30c66/qf4ccf8f5435d4a78bdca4d6a018b578e/abbabbaaa.<init> (DDDDDDI)V
      // 159: areturn
   }

   private void bab(aabbbbaaa param1, class_1657 param2, float param3) {
      // $VF: Couldn't be decompiled
      // Please report this to the Vineflower issue tracker, at https://github.com/Vineflower/vineflower/issues with a copy of the class file (if you have the rights to distribute it!)
      // java.lang.RuntimeException: parsing failure!
      //   at org.jetbrains.java.decompiler.modules.decompiler.decompose.DomHelper.parseGraph(DomHelper.java:211)
      //   at org.jetbrains.java.decompiler.main.rels.MethodProcessor.codeToJava(MethodProcessor.java:166)
      //
      // Bytecode:
      // 00: getstatic qeaa361f143ee4a0894bd168fd9b30c66/qf4ccf8f5435d4a78bdca4d6a018b578e/aabbabbab.ab I
      // 03: aload 2
      // 04: fload 3
      // 05: invokestatic qeaa361f143ee4a0894bd168fd9b30c66/qf4ccf8f5435d4a78bdca4d6a018b578e/bbaabbaa.aa (Lnet/minecraft/class_1297;F)Lnet/minecraft/class_243;
      // 08: astore 5
      // 0a: istore 4
      // 0c: aload 2
      // 0d: invokevirtual net/minecraft/class_1657.method_5829 ()Lnet/minecraft/class_238;
      // 10: aload 5
      // 12: getfield net/minecraft/class_243.field_1352 D
      // 15: aload 2
      // 16: invokevirtual net/minecraft/class_1657.method_23317 ()D
      // 19: dsub
      // 1a: aload 5
      // 1c: getfield net/minecraft/class_243.field_1351 D
      // 1f: aload 2
      // 20: invokevirtual net/minecraft/class_1657.method_23318 ()D
      // 23: dsub
      // 24: aload 5
      // 26: getfield net/minecraft/class_243.field_1350 D
      // 29: aload 2
      // 2a: invokevirtual net/minecraft/class_1657.method_23321 ()D
      // 2d: dsub
      // 2e: invokevirtual net/minecraft/class_238.method_989 (DDD)Lnet/minecraft/class_238;
      // 31: astore 6
      // 33: aload 1
      // 34: aload 6
      // 36: invokestatic qeaa361f143ee4a0894bd168fd9b30c66/qf4ccf8f5435d4a78bdca4d6a018b578e/bbaabbaa.abaaa (Ljava/lang/Object;Lnet/minecraft/class_238;)Z
      // 39: ifne 3e
      // 3c: return
      // 3d: athrow
      // 3e: aload 0
      // 3f: invokevirtual qeaa361f143ee4a0894bd168fd9b30c66/qf4ccf8f5435d4a78bdca4d6a018b578e/baabbbba.abba ()Ljava/awt/Color;
      // 42: astore 7
      // 44: aload 0
      // 45: getfield qeaa361f143ee4a0894bd168fd9b30c66/qf4ccf8f5435d4a78bdca4d6a018b578e/baabbbba.abaa Lqeaa361f143ee4a0894bd168fd9b30c66/qf4ccf8f5435d4a78bdca4d6a018b578e/bababa;
      // 48: invokevirtual qeaa361f143ee4a0894bd168fd9b30c66/qf4ccf8f5435d4a78bdca4d6a018b578e/bababa.abbb ()Ljava/lang/Object;
      // 4b: checkcast java/lang/Double
      // 4e: invokevirtual java/lang/Double.doubleValue ()D
      // 51: ldc2_w 100.0
      // 54: ddiv
      // 55: ldc2_w 255.0
      // 58: dmul
      // 59: dstore 8
      // 5b: aload 0
      // 5c: iload 4
      // 5e: ifne 9d
      // 61: getfield qeaa361f143ee4a0894bd168fd9b30c66/qf4ccf8f5435d4a78bdca4d6a018b578e/baabbbba.baba Lqeaa361f143ee4a0894bd168fd9b30c66/qf4ccf8f5435d4a78bdca4d6a018b578e/abbaaaaa;
      // 64: invokevirtual qeaa361f143ee4a0894bd168fd9b30c66/qf4ccf8f5435d4a78bdca4d6a018b578e/abbaaaaa.abbb ()Ljava/lang/Object;
      // 67: checkcast java/lang/Boolean
      // 6a: invokevirtual java/lang/Boolean.booleanValue ()Z
      // 6d: ifeq 96
      // 70: goto 74
      // 73: athrow
      // 74: dload 8
      // 76: dconst_0
      // 77: dcmpl
      // 78: iload 4
      // 7a: ifne a3
      // 7d: goto 81
      // 80: athrow
      // 81: ifle 96
      // 84: goto 88
      // 87: athrow
      // 88: aload 1
      // 89: aload 6
      // 8b: aload 7
      // 8d: dload 8
      // 8f: invokestatic qeaa361f143ee4a0894bd168fd9b30c66/qf4ccf8f5435d4a78bdca4d6a018b578e/bbaabbaa.abaaab (Ljava/lang/Object;Lnet/minecraft/class_238;Ljava/awt/Color;D)V
      // 92: goto 96
      // 95: athrow
      // 96: aload 0
      // 97: getfield qeaa361f143ee4a0894bd168fd9b30c66/qf4ccf8f5435d4a78bdca4d6a018b578e/baabbbba.ab Lqeaa361f143ee4a0894bd168fd9b30c66/qf4ccf8f5435d4a78bdca4d6a018b578e/abbaaaaa;
      // 9a: invokevirtual qeaa361f143ee4a0894bd168fd9b30c66/qf4ccf8f5435d4a78bdca4d6a018b578e/abbaaaaa.abbb ()Ljava/lang/Object;
      // 9d: checkcast java/lang/Boolean
      // a0: invokevirtual java/lang/Boolean.booleanValue ()Z
      // a3: ifeq b6
      // a6: aload 1
      // a7: aload 6
      // a9: aload 7
      // ab: ldc2_w 255.0
      // ae: fconst_2
      // af: invokestatic qeaa361f143ee4a0894bd168fd9b30c66/qf4ccf8f5435d4a78bdca4d6a018b578e/bbaabbaa.bbaaa (Ljava/lang/Object;Lnet/minecraft/class_238;Ljava/awt/Color;DF)V
      // b2: goto b6
      // b5: athrow
      // b6: return
   }

   private static void bba(class_332 var0, double var1, double var3, double var5, double var7, double var9, double var11, double var13) {
      double var18 = 2.5;
      int var15 = aabbabbab.ab;
      double var20 = var3 - var11 - var18;

      double var10000;
      label21: {
         label20: {
            try {
               var10000 = var20;
               if (var15 != 0) {
                  break label21;
               }

               if (!(var20 < 1.0)) {
                  break label20;
               }
            } catch (RuntimeException var26) {
               throw var26;
            }

            var20 = var3 + var7 + var18;
         }

         var10000 = Math.max(0.0, Math.min(1.0, var1));
      }

      double var22 = var10000;
      double var24 = Math.max(1.0, (double)Math.round(var9 * var22));
      bbb(var0, var20 - var13, var5 - var13, var11 + var13 * 2.0, var9 + var13 * 2.0, a(b(1726314875, -1505987807 ^ -676579377), 2414753576049770998L));
      bbb(var0, var20, var5 + var9 - var24, var11, var24, ababbbaba.aaa(var22).getRGB());
   }

   // $VF: Handled exception range with multiple entry points by splitting it
   // $VF: Duplicated exception handlers to handle obfuscated exceptions
   private static void bbb(class_332 var0, double var1, double var3, double var5, double var7, int var9) {
      int var10000 = aabbabbab.ab;
      class_310 var11 = class_310.method_1551();
      int var10 = var10000;

      label66: {
         label65: {
            label64: {
               label63: {
                  try {
                     var23 = var11;
                     if (var10 != 0) {
                        break label63;
                     }

                     if (var11 == null) {
                        break label64;
                     }
                  } catch (RuntimeException var22) {
                     throw var22;
                  }

                  var23 = var11;
               }

               try {
                  if (var23.method_22683() != null) {
                     break label65;
                  }
               } catch (RuntimeException var21) {
                  throw var21;
               }
            }

            try {
               var24 = 1.0;
               break label66;
            } catch (RuntimeException var20) {
               throw var20;
            }
         }

         var24 = Math.max(1.0, (double)var11.method_22683().method_4495());
      }

      double var12 = var24;
      var0.method_51448().pushMatrix();

      try {
         var0.method_51448().scale((float)(1.0 / var12));
         abbaa.aabab(var0, var1 * var12, var3 * var12, var5 * var12, var7 * var12, 0.0, var9);
      } finally {
         var0.method_51448().popMatrix();
      }
   }

   private boolean aaaa() {
      try {
         if (this.babb.abbb() == aabbbbbba.ab) {
            return true;
         }
      } catch (RuntimeException var1) {
         throw var1;
      }

      return false;
   }

   private static String bbba(int var0, int var1) {
      int var3 = var0 ^ 44344311;
      char[] var4 = bbbb[var3].toCharArray();
      StackTraceElement[] var2 = (StackTraceElement[])aaaaa[var3];
      StackTraceElement[] var5;
      if (var2 != null) {
         var5 = var2;
      } else {
         var5 = new Throwable().getStackTrace();
         aaaaa[var3] = var5;
      }

      StackTraceElement var6 = var5[1];
      int var7 = (var6.getClassName().hashCode() ^ var6.getMethodName().hashCode()) >> 16 ^ 1853797434;
      int var8 = 0;

      do {
         var4[var8] = (char)(var4[var8] ^ switch (var8 & 31) {
            default -> 183;
            case 1 -> 242;
            case 2 -> 46;
            case 3 -> 240;
            case 4 -> 64;
            case 5 -> 232;
            case 6 -> 105;
            case 7 -> 253;
            case 8 -> 103;
            case 9 -> 222;
            case 10 -> 24;
            case 11 -> 67;
            case 12 -> 157;
            case 13 -> 232;
            case 14 -> 154;
            case 15 -> 145;
            case 16 -> 78;
            case 17 -> 202;
            case 18 -> 68;
            case 19 -> 142;
            case 20 -> 78;
            case 21 -> 157;
            case 22 -> 180;
            case 23 -> 249;
            case 24 -> 216;
            case 25 -> 90;
            case 26 -> 7;
            case 27 -> 159;
            case 28 -> 192;
            case 29 -> 182;
            case 30 -> 218;
            case 31 -> 156;
         } ^ var1 >> 16 ^ var7);
      } while (++var8 < var4.length);

      return new String(var4).intern();
   }

   public baabbbba() {
      int var1 = 1850207144;
      super(
         aabbaaaba.aaab(aab(b(1726314874, var1 ^ -1643433224), b(1726314873, var1 ^ -448002986))),
         bbaabbba.bab,
         aabbaaaba.aaab(aab(b(1726314872, var1 ^ 1052411598), b(1726314879, var1 ^ -848388341)))
      );
      this.babb = (baabaab)this.abbbaaa(
         new baabaab(
            aabbaaaba.aaab(aab(b(1726314878, var1 ^ 1013456998), b(1726314877, var1 ^ -394926679))),
            aabbbbbba.class,
            aabbbbbba.a
         )
      );
      this.baab = (baabaab)this.abbbaaa(
         new baabaab(
            aabbaaaba.aaab(aab(b(1726314876, var1 ^ 392715469), b(1726314851, var1 ^ -1211585515))),
            babbaab.class,
            babbaab.b
         )
      );
      this.aba = (baabaab)this.abbbaaa(
         new baabaab(
            aabbaaaba.aaab(aab(b(1726314850, var1 ^ -250650595), b(1726314849, var1 ^ -734054869))),
            baabaaa.class,
            baabaaa.a
         )
      );
      this.aabb = (abbaaaaa)this.abbbaaa(
         new abbaaaaa(
            aabbaaaba.aaab(aab(b(1726314848, var1 ^ -2027226601), b(1726314855, var1 ^ -1775385534))), true
         )
      );
      this.baba = (abbaaaaa)this.abbbaaa(
         new abbaaaaa(
            aabbaaaba.aaab(aab(b(1726314854, var1 ^ 734281305), b(1726314853, var1 ^ -25055317))), true
         )
      );
      this.ab = (abbaaaaa)this.abbbaaa(
         new abbaaaaa(
            aabbaaaba.aaab(aab(b(1726314852, var1 ^ -286035911), b(1726314859, var1 ^ 1134886741))), true
         )
      );
      this.abaa = (bababa)this.abbbaaa(
         new bababa(
               aabbaaaba.aaab(aab(b(1726314858, var1 ^ -1956910753), b(1726314857, var1 ^ -639148026))), 25.0, 0.0, 100.0, 1.0
            )
            .bba(aabbaaaba.aaab(aab(b(1726314856, var1 ^ -165054942), b(1726314863, var1 ^ -1148138911))))
      );
      this.bbaa = (abbaaaaa)this.abbbaaa(
         new abbaaaaa(
            aabbaaaba.aaab(aab(b(1726314862, var1 ^ -677540070), b(1726314861, var1 ^ 644657463))), true
         )
      );
      this.abbb = (abaabaaab)this.abbbaaa(
         new abaabaaab(
            aabbaaaba.aaab(aab(b(1726314860, var1 ^ -816406147), b(1726314835, var1 ^ 2000063825))),
            new Color(
               a(b(1726314834, var1 ^ 1203486133), 5415759710290174760L),
               a(b(1726314833, var1 ^ 1902233895), 2529988533759574833L),
               a(b(1726314832, var1 ^ 2121318355), 8514788593084424871L)
            )
         )
      );
      this.bb = new byte[babbaab.values().length];
      this.abb = new ArrayList();
      this.baab.babb(this::ab);
      this.aba.babb(this::bb);
      this.aabb.babb(this::ba);
      this.baba.babb(this::aaaa);
      this.ab.babb(this::abbb);
      this.abaa.babb(this::baba);
      this.abbb.babb(this::abaa);
   }

   @Override
   public void aabaa() {
      aaaabba.bb();
      this.abb.clear();
   }

   @Override
   public void aabbb(class_332 param1, int param2, int param3, float param4) {
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
      // 08: ifne 29
      // 0b: invokevirtual qeaa361f143ee4a0894bd168fd9b30c66/qf4ccf8f5435d4a78bdca4d6a018b578e/baabbbba.babbaab ()Z
      // 0e: ifeq 48
      // 11: goto 15
      // 14: athrow
      // 15: aload 0
      // 16: iload 5
      // 18: ifne 34
      // 1b: goto 1f
      // 1e: athrow
      // 1f: getfield qeaa361f143ee4a0894bd168fd9b30c66/qf4ccf8f5435d4a78bdca4d6a018b578e/baabbbba.babb Lqeaa361f143ee4a0894bd168fd9b30c66/qf4ccf8f5435d4a78bdca4d6a018b578e/baabaab;
      // 22: invokevirtual qeaa361f143ee4a0894bd168fd9b30c66/qf4ccf8f5435d4a78bdca4d6a018b578e/baabaab.abbb ()Ljava/lang/Object;
      // 25: goto 29
      // 28: athrow
      // 29: getstatic qeaa361f143ee4a0894bd168fd9b30c66/qf4ccf8f5435d4a78bdca4d6a018b578e/aabbbbbba.bb Lqeaa361f143ee4a0894bd168fd9b30c66/qf4ccf8f5435d4a78bdca4d6a018b578e/aabbbbbba;
      // 2c: if_acmpne 48
      // 2f: aload 0
      // 30: goto 34
      // 33: athrow
      // 34: iload 5
      // 36: ifne 4b
      // 39: getfield qeaa361f143ee4a0894bd168fd9b30c66/qf4ccf8f5435d4a78bdca4d6a018b578e/baabbbba.abb Ljava/util/List;
      // 3c: invokeinterface java/util/List.isEmpty ()Z 1
      // 41: ifeq 4a
      // 44: goto 48
      // 47: athrow
      // 48: return
      // 49: athrow
      // 4a: aload 0
      // 4b: getfield qeaa361f143ee4a0894bd168fd9b30c66/qf4ccf8f5435d4a78bdca4d6a018b578e/baabbbba.abb Ljava/util/List;
      // 4e: invokeinterface java/util/List.iterator ()Ljava/util/Iterator; 1
      // 53: astore 6
      // 55: aload 6
      // 57: invokeinterface java/util/Iterator.hasNext ()Z 1
      // 5c: ifeq 77
      // 5f: aload 6
      // 61: invokeinterface java/util/Iterator.next ()Ljava/lang/Object; 1
      // 66: checkcast qeaa361f143ee4a0894bd168fd9b30c66/qf4ccf8f5435d4a78bdca4d6a018b578e/abbabbaaa
      // 69: astore 7
      // 6b: iload 5
      // 6d: aload 0
      // 6e: aload 1
      // 6f: aload 7
      // 71: invokevirtual qeaa361f143ee4a0894bd168fd9b30c66/qf4ccf8f5435d4a78bdca4d6a018b578e/baabbbba.aa (Lnet/minecraft/class_332;Lqeaa361f143ee4a0894bd168fd9b30c66/qf4ccf8f5435d4a78bdca4d6a018b578e/abbabbaaa;)V
      // 74: ifeq 55
      // 77: return
   }

   @Override
   public void baa(aabbbbaaa param1) {
      // $VF: Couldn't be decompiled
      // Please report this to the Vineflower issue tracker, at https://github.com/Vineflower/vineflower/issues with a copy of the class file (if you have the rights to distribute it!)
      //
      // Bytecode:
      // 000: getstatic qeaa361f143ee4a0894bd168fd9b30c66/qf4ccf8f5435d4a78bdca4d6a018b578e/aabbabbab.ab I
      // 003: aload 0
      // 004: getfield qeaa361f143ee4a0894bd168fd9b30c66/qf4ccf8f5435d4a78bdca4d6a018b578e/baabbbba.abb Ljava/util/List;
      // 007: invokeinterface java/util/List.clear ()V 1
      // 00c: istore 2
      // 00d: aload 0
      // 00e: getfield qeaa361f143ee4a0894bd168fd9b30c66/qf4ccf8f5435d4a78bdca4d6a018b578e/baabbbba.babb Lqeaa361f143ee4a0894bd168fd9b30c66/qf4ccf8f5435d4a78bdca4d6a018b578e/baabaab;
      // 011: invokevirtual qeaa361f143ee4a0894bd168fd9b30c66/qf4ccf8f5435d4a78bdca4d6a018b578e/baabaab.abbb ()Ljava/lang/Object;
      // 014: checkcast qeaa361f143ee4a0894bd168fd9b30c66/qf4ccf8f5435d4a78bdca4d6a018b578e/aabbbbbba
      // 017: astore 3
      // 018: aload 0
      // 019: invokevirtual qeaa361f143ee4a0894bd168fd9b30c66/qf4ccf8f5435d4a78bdca4d6a018b578e/baabbbba.babbaab ()Z
      // 01c: ifeq 048
      // 01f: aload 3
      // 020: iload 2
      // 021: ifne 037
      // 024: goto 028
      // 027: athrow
      // 028: getstatic qeaa361f143ee4a0894bd168fd9b30c66/qf4ccf8f5435d4a78bdca4d6a018b578e/aabbbbbba.bb Lqeaa361f143ee4a0894bd168fd9b30c66/qf4ccf8f5435d4a78bdca4d6a018b578e/aabbbbbba;
      // 02b: if_acmpeq 03d
      // 02e: goto 032
      // 031: athrow
      // 032: aload 3
      // 033: goto 037
      // 036: athrow
      // 037: getstatic qeaa361f143ee4a0894bd168fd9b30c66/qf4ccf8f5435d4a78bdca4d6a018b578e/aabbbbbba.ab Lqeaa361f143ee4a0894bd168fd9b30c66/qf4ccf8f5435d4a78bdca4d6a018b578e/aabbbbbba;
      // 03a: if_acmpne 048
      // 03d: aload 1
      // 03e: invokestatic qeaa361f143ee4a0894bd168fd9b30c66/qf4ccf8f5435d4a78bdca4d6a018b578e/bbaabbaa.bba (Ljava/lang/Object;)Z
      // 041: ifne 04a
      // 044: goto 048
      // 047: athrow
      // 048: return
      // 049: athrow
      // 04a: invokestatic net/minecraft/class_310.method_1551 ()Lnet/minecraft/class_310;
      // 04d: astore 4
      // 04f: aload 4
      // 051: iload 2
      // 052: ifne 065
      // 055: getfield net/minecraft/class_310.field_1724 Lnet/minecraft/class_746;
      // 058: ifnull 073
      // 05b: goto 05f
      // 05e: athrow
      // 05f: aload 4
      // 061: goto 065
      // 064: athrow
      // 065: iload 2
      // 066: ifne 077
      // 069: getfield net/minecraft/class_310.field_1687 Lnet/minecraft/class_638;
      // 06c: ifnonnull 075
      // 06f: goto 073
      // 072: athrow
      // 073: return
      // 074: athrow
      // 075: aload 4
      // 077: invokestatic qeaa361f143ee4a0894bd168fd9b30c66/qf4ccf8f5435d4a78bdca4d6a018b578e/aabbabbbb.abbaa (Lnet/minecraft/class_310;)F
      // 07a: fstore 5
      // 07c: aload 4
      // 07e: getfield net/minecraft/class_310.field_1687 Lnet/minecraft/class_638;
      // 081: invokevirtual net/minecraft/class_638.method_18456 ()Ljava/util/List;
      // 084: invokeinterface java/util/List.iterator ()Ljava/util/Iterator; 1
      // 089: astore 6
      // 08b: aload 6
      // 08d: invokeinterface java/util/Iterator.hasNext ()Z 1
      // 092: ifeq 0f9
      // 095: aload 6
      // 097: invokeinterface java/util/Iterator.next ()Ljava/lang/Object; 1
      // 09c: checkcast net/minecraft/class_1657
      // 09f: astore 7
      // 0a1: iload 2
      // 0a2: ifne 10f
      // 0a5: aload 4
      // 0a7: aload 7
      // 0a9: invokestatic qeaa361f143ee4a0894bd168fd9b30c66/qf4ccf8f5435d4a78bdca4d6a018b578e/bbaabbaa.ba (Lnet/minecraft/class_310;Lnet/minecraft/class_1657;)Z
      // 0ac: ifne 0bb
      // 0af: goto 0b3
      // 0b2: athrow
      // 0b3: iload 2
      // 0b4: ifeq 08b
      // 0b7: goto 0bb
      // 0ba: athrow
      // 0bb: aload 3
      // 0bc: getstatic qeaa361f143ee4a0894bd168fd9b30c66/qf4ccf8f5435d4a78bdca4d6a018b578e/aabbbbbba.ab Lqeaa361f143ee4a0894bd168fd9b30c66/qf4ccf8f5435d4a78bdca4d6a018b578e/aabbbbbba;
      // 0bf: if_acmpne 0d3
      // 0c2: aload 0
      // 0c3: aload 1
      // 0c4: aload 7
      // 0c6: fload 5
      // 0c8: invokevirtual qeaa361f143ee4a0894bd168fd9b30c66/qf4ccf8f5435d4a78bdca4d6a018b578e/baabbbba.bab (Lqeaa361f143ee4a0894bd168fd9b30c66/qf4ccf8f5435d4a78bdca4d6a018b578e/aabbbbaaa;Lnet/minecraft/class_1657;F)V
      // 0cb: iload 2
      // 0cc: ifeq 08b
      // 0cf: goto 0d3
      // 0d2: athrow
      // 0d3: aload 0
      // 0d4: aload 1
      // 0d5: aload 4
      // 0d7: aload 7
      // 0d9: fload 5
      // 0db: invokevirtual qeaa361f143ee4a0894bd168fd9b30c66/qf4ccf8f5435d4a78bdca4d6a018b578e/baabbbba.abb (Lqeaa361f143ee4a0894bd168fd9b30c66/qf4ccf8f5435d4a78bdca4d6a018b578e/aabbbbaaa;Lnet/minecraft/class_310;Lnet/minecraft/class_1657;F)Lqeaa361f143ee4a0894bd168fd9b30c66/qf4ccf8f5435d4a78bdca4d6a018b578e/abbabbaaa;
      // 0de: astore 8
      // 0e0: aload 8
      // 0e2: ifnull 0f5
      // 0e5: aload 0
      // 0e6: getfield qeaa361f143ee4a0894bd168fd9b30c66/qf4ccf8f5435d4a78bdca4d6a018b578e/baabbbba.abb Ljava/util/List;
      // 0e9: aload 8
      // 0eb: invokeinterface java/util/List.add (Ljava/lang/Object;)Z 2
      // 0f0: pop
      // 0f1: goto 0f5
      // 0f4: athrow
      // 0f5: iload 2
      // 0f6: ifeq 08b
      // 0f9: aload 0
      // 0fa: getfield qeaa361f143ee4a0894bd168fd9b30c66/qf4ccf8f5435d4a78bdca4d6a018b578e/baabbbba.abb Ljava/util/List;
      // 0fd: invokedynamic applyAsDouble ()Ljava/util/function/ToDoubleFunction; bsm=java/lang/invoke/LambdaMetafactory.metafactory (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;Ljava/lang/invoke/MethodType;Ljava/lang/invoke/MethodHandle;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[ (Ljava/lang/Object;)D, qeaa361f143ee4a0894bd168fd9b30c66/qf4ccf8f5435d4a78bdca4d6a018b578e/abbabbaaa.ba ()D, (Lqeaa361f143ee4a0894bd168fd9b30c66/qf4ccf8f5435d4a78bdca4d6a018b578e/abbabbaaa;)D ]
      // 102: invokestatic java/util/Comparator.comparingDouble (Ljava/util/function/ToDoubleFunction;)Ljava/util/Comparator;
      // 105: invokeinterface java/util/Comparator.reversed ()Ljava/util/Comparator; 1
      // 10a: invokeinterface java/util/List.sort (Ljava/util/Comparator;)V 2
      // 10f: return
   }

   public static class_2960 aaab() {
      // $VF: Couldn't be decompiled
      // Please report this to the Vineflower issue tracker, at https://github.com/Vineflower/vineflower/issues with a copy of the class file (if you have the rights to distribute it!)
      // java.lang.RuntimeException: parsing failure!
      //   at org.jetbrains.java.decompiler.modules.decompiler.decompose.DomHelper.parseGraph(DomHelper.java:211)
      //   at org.jetbrains.java.decompiler.main.rels.MethodProcessor.codeToJava(MethodProcessor.java:166)
      //
      // Bytecode:
      // 00: getstatic qeaa361f143ee4a0894bd168fd9b30c66/qf4ccf8f5435d4a78bdca4d6a018b578e/aabbabbab.ab I
      // 03: invokestatic qeaa361f143ee4a0894bd168fd9b30c66/qf4ccf8f5435d4a78bdca4d6a018b578e/abaaaaaba.aaaaa ()Lqeaa361f143ee4a0894bd168fd9b30c66/qf4ccf8f5435d4a78bdca4d6a018b578e/abaaaaaba;
      // 06: astore 1
      // 07: istore 0
      // 08: aload 1
      // 09: iload 0
      // 0a: ifne 15
      // 0d: ifnull 23
      // 10: goto 14
      // 13: athrow
      // 14: aload 1
      // 15: iload 0
      // 16: ifne 29
      // 19: invokevirtual qeaa361f143ee4a0894bd168fd9b30c66/qf4ccf8f5435d4a78bdca4d6a018b578e/abaaaaaba.aaba ()Lqeaa361f143ee4a0894bd168fd9b30c66/qf4ccf8f5435d4a78bdca4d6a018b578e/babbaba;
      // 1c: ifnonnull 28
      // 1f: goto 23
      // 22: athrow
      // 23: aconst_null
      // 24: goto 2f
      // 27: athrow
      // 28: aload 1
      // 29: invokevirtual qeaa361f143ee4a0894bd168fd9b30c66/qf4ccf8f5435d4a78bdca4d6a018b578e/abaaaaaba.aaba ()Lqeaa361f143ee4a0894bd168fd9b30c66/qf4ccf8f5435d4a78bdca4d6a018b578e/babbaba;
      // 2c: invokevirtual qeaa361f143ee4a0894bd168fd9b30c66/qf4ccf8f5435d4a78bdca4d6a018b578e/babbaba.bbabb ()Lqeaa361f143ee4a0894bd168fd9b30c66/qf4ccf8f5435d4a78bdca4d6a018b578e/baabbbba;
      // 2f: astore 2
      // 30: aload 2
      // 31: iload 0
      // 32: ifne 42
      // 35: ifnonnull 41
      // 38: goto 3c
      // 3b: athrow
      // 3c: aconst_null
      // 3d: goto 45
      // 40: athrow
      // 41: aload 2
      // 42: invokevirtual qeaa361f143ee4a0894bd168fd9b30c66/qf4ccf8f5435d4a78bdca4d6a018b578e/baabbbba.babb ()Lnet/minecraft/class_2960;
      // 45: areturn
   }

   private void aaba(class_332 var1, double var2, double var4, double var6, double var8, int var10, double var11, double var13) {
      double var15 = var2 - var11;
      double var17 = var4 - var11;
      double var19 = var2 + var6 + var11;
      double var21 = var4 + var8 + var11;
      double var23 = Math.max(3.0, Math.min(var6 * 0.22, 10.0)) + var11 * 2.0;
      double var25 = Math.max(3.0, Math.min(var8 * 0.18, 10.0)) + var11 * 2.0;
      bbb(var1, var15, var17, var23, var13, var10);
      bbb(var1, var15, var17 + var13, var13, var25 - var13, var10);
      bbb(var1, var19 - var23, var17, var23, var13, var10);
      bbb(var1, var19 - var13, var17 + var13, var13, var25 - var13, var10);
      bbb(var1, var15, var21 - var13, var23, var13, var10);
      bbb(var1, var15, var21 - var25, var13, var25 - var13, var10);
      bbb(var1, var19 - var23, var21 - var13, var23, var13, var10);
      bbb(var1, var19 - var13, var21 - var25, var13, var25 - var13, var10);
   }

   private static void aabb(class_332 var0, double var1, double var3, double var5, double var7, int var9, double var10, double var12) {
      bbb(var0, var1 + var10, var3 + var10, var5 - var10 * 2.0, var12, var9);
      bbb(var0, var1 + var10, var3 + var7 - var10 - var12, var5 - var10 * 2.0, var12, var9);
      bbb(var0, var1 + var10, var3 + var10 + var12, var12, var7 - var10 * 2.0 - var12 * 2.0, var9);
      bbb(var0, var1 + var5 - var10 - var12, var3 + var10 + var12, var12, var7 - var10 * 2.0 - var12 * 2.0, var9);
   }

   private boolean abaa() {
      int var1 = aabbabbab.ab;

      try {
         boolean var10000 = (Boolean)this.bbaa.abbb();
         if (var1 != 0) {
            return var10000;
         }

         if (!var10000) {
            return true;
         }
      } catch (RuntimeException var2) {
         throw var2;
      }

      return false;
   }

   private static int b(int var0, int var1) {
      int var2 = bbba[var0 ^ 1726314611] ^ var1 ^ var0;
      var2 -= 23703;
      var2 ^= 56178;
      var2 -= 15708;
      var2 += 44461;
      var2 -= 59861;
      var2 ^= 8341;
      var2 -= 43629;
      return var2 ^ 54447;
   }

   // $VF: Irreducible bytecode was duplicated to produce valid code
   static {
      int var25 = -1595962552;
      String[] var10000 = new String[6];
      int var19 = 0;
      String[] var17 = var10000;
      int var18 = 0;
      short var20 = 4949;
      int var16 = "À껍\u1ae6겝嫃꿨嫫겝\u1ad3꾉ᫌ꾄髵꼝髥꼁\u1aec게\u1ae5궑髰겡嫡꽤\udae8괙嫒꾑᫇겘\udaec곡嫮긭\udafa괈高곝\udaf3굙\udafc굼嫩껭\udafc귍嫪갸\udaf3껽髤같嫯궤髼깅\udae4긁\udae0깄\u1af0깑嫒꼡\u1ad8거嫀깥髝깵嫚꽜ᫌ걁\u1ae7꼱髒꿈᫊꽡\u1aeb귙髖그\udaef걉嫕긡嫆꿀\udae2괁髡걩嫏깸髣걕\u1aef귭\udaf9긄\u1aff걥嫱굹\udae1꺘\u1ae7궹᫁꿙\udafd걘嫳꺍髓꾹髨구\u1ad9겁\u1afc굙\udac2꾐嫿꺝\u1adf굙\udac3궈髤갉\udaf7꾵嫐귤嫍갩\udadf겵嫶껨嫾겁嫩깭嫕꺠\udac0괙\udac8괉嫙괼嫫꾉髳굕\udaf5교髊귑\u1ae6꽥髳꺤髼굉髗꽍嫰갼\u1ae7괍髦꿕\u1afa길᫂걝髓꺡\udad8곔\u1af0귙髕꼽\udad4귰髀\u0085㭵厫㨁鎰㥬펁㭥펐㧩鎸㬘᎖㩩厂㬽펼㨴펤㤱厩㣥鎜㤄厀㩑厝㫽ᎅ㯜鎛㯩Ꮀ㣽压㬌펤㡥᎗㪩펂㥰厅㩙펲㠑鎗㨄펧㩱鎑㨝鎀㣈펦㥹᎙㦕Ꭿ㡼\u139a㩍᎕㨥压㤄펡㤁厽㣍鎅㥰Ꮇ㤅펿㤡펋㦌펌㮙\u139e㧱鎠㢤펽㬡펨㮡厲㭠᎒㯍펽㮥鎣㣼펹㦕厯㪙Ꭴ㤴厑㨙\u139a㯑펛㩌Ꭽ㦡펕㦑펐㮐鎲㣍厜㬽鎿㮈펦㮕Ꮍ㯥鎵㣤鎫㤁펉㪑Ꭴ㩔펎㣡P븒毟볦毡뷯⯮빂\uebed뵺⯮뷳\uabfb뼎\uebf2뾶ꯒ볷ꯤ뾮⯻봢\uebf6봻ꯌ봢\uebd1붾毽뱟⯻뵺毒붺毝빃\uebd6붮⯋븲⯦뾿ꯐ뷎ꯤ뼶ꯌ밗⯞뷖ꯚ빎⯏뱃꯱밖\uebdd뽖ꯜ뿳\uabfc벢\uebda뾊\uebef뱣⯣뱆⯈뱊\uebde뿃⯦빢毼뺚⯘뺋毰볒⯉\n伟瓵䵻瓡䶮㓐䶗㓬䷗\uf4ed\u0010ꓭ驒ꜩᩈꗬ\uda68꜁驺\ua631ᩊꗠ\uda4aꗕ婂ꚥ驿\nꇞ標ꎺ樍ꍯ⨼ꍖ⨀ꌖ\uea01"
         .length();
      String var15 = "À껍\u1ae6겝嫃꿨嫫겝\u1ad3꾉ᫌ꾄髵꼝髥꼁\u1aec게\u1ae5궑髰겡嫡꽤\udae8괙嫒꾑᫇겘\udaec곡嫮긭\udafa괈高곝\udaf3굙\udafc굼嫩껭\udafc귍嫪갸\udaf3껽髤같嫯궤髼깅\udae4긁\udae0깄\u1af0깑嫒꼡\u1ad8거嫀깥髝깵嫚꽜ᫌ걁\u1ae7꼱髒꿈᫊꽡\u1aeb귙髖그\udaef걉嫕긡嫆꿀\udae2괁髡걩嫏깸髣걕\u1aef귭\udaf9긄\u1aff걥嫱굹\udae1꺘\u1ae7궹᫁꿙\udafd걘嫳꺍髓꾹髨구\u1ad9겁\u1afc굙\udac2꾐嫿꺝\u1adf굙\udac3궈髤갉\udaf7꾵嫐귤嫍갩\udadf겵嫶껨嫾겁嫩깭嫕꺠\udac0괙\udac8괉嫙괼嫫꾉髳굕\udaf5교髊귑\u1ae6꽥髳꺤髼굉髗꽍嫰갼\u1ae7괍髦꿕\u1afa길᫂걝髓꺡\udad8곔\u1af0귙髕꼽\udad4귰髀\u0085㭵厫㨁鎰㥬펁㭥펐㧩鎸㬘᎖㩩厂㬽펼㨴펤㤱厩㣥鎜㤄厀㩑厝㫽ᎅ㯜鎛㯩Ꮀ㣽压㬌펤㡥᎗㪩펂㥰厅㩙펲㠑鎗㨄펧㩱鎑㨝鎀㣈펦㥹᎙㦕Ꭿ㡼\u139a㩍᎕㨥压㤄펡㤁厽㣍鎅㥰Ꮇ㤅펿㤡펋㦌펌㮙\u139e㧱鎠㢤펽㬡펨㮡厲㭠᎒㯍펽㮥鎣㣼펹㦕厯㪙Ꭴ㤴厑㨙\u139a㯑펛㩌Ꭽ㦡펕㦑펐㮐鎲㣍厜㬽鎿㮈펦㮕Ꮍ㯥鎵㣤鎫㤁펉㪑Ꭴ㩔펎㣡P븒毟볦毡뷯⯮빂\uebed뵺⯮뷳\uabfb뼎\uebf2뾶ꯒ볷ꯤ뾮⯻봢\uebf6봻ꯌ봢\uebd1붾毽뱟⯻뵺毒붺毝빃\uebd6붮⯋븲⯦뾿ꯐ뷎ꯤ뼶ꯌ밗⯞뷖ꯚ빎⯏뱃꯱밖\uebdd뽖ꯜ뿳\uabfc벢\uebda뾊\uebef뱣⯣뱆⯈뱊\uebde뿃⯦빢毼뺚⯘뺋毰볒⯉\n伟瓵䵻瓡䶮㓐䶗㓬䷗\uf4ed\u0010ꓭ驒ꜩᩈꗬ\uda68꜁驺\ua631ᩊꗠ\uda4aꗕ婂ꚥ驿\nꇞ標ꎺ樍ꍯ⨼ꍖ⨀ꌖ\uea01";

      do {
         char var21 = var15.charAt(var19);
         char[] var30 = var15.substring(var19 + 1, var19 + 1 + var21).toCharArray();
         int var23 = 0;
         char[] var22 = var30;

         do {
            int var24 = var22[var23];

            var24 = (char)(switch (var23 % 6) {
               default -> 228;
               case 1 -> 29;
               case 2 -> 252;
               case 3 -> 22;
               case 4 -> 77;
               case 5 -> 36;
            }) ^ var24;
            if (var23 % 2 == 0) {
               var22[var23] = (char)((var24 >>> 2 | var24 << 14) & 65535 ^ var20);
            } else {
               var22[var23] = (char)((var24 << 2 | var24 >>> 14) & 65535 ^ var20);
            }
         } while (++var23 < var22.length);

         var17[var18] = new String(var22);
         var18++;
         var19 = var19 + var21 + 1;
      } while (var19 < var16);

      bbbb = var17;
      aaaaa = new Object[var17.length];
      bbba = new int[336];
      byte var32 = 0;
      int var10001 = 0;
      byte[] var10002 = "=\u0015\fï`¦\u0010Ûü\u001a4#³\u0081,n\u0003ÀR\u007f'\u009dýó\n\u0094Ô+«\u0097\u0091|\u0095AI;42Ô\u001c^Ð\u0006\u0000\u0099¢*0\u0083\u0082#Ìü\u00adÃ9×\u0012c\u0097e\u0096&\u009b!B\u0013ám#Õ\n,K\u009d±\u000bw\u0006\u009d%\u0018ÂÄç\u00976\u001a\u0018Åì\u0085w}èqKrJ|Íæuáhm\u0013\u0019\u000eê\u001fåG±À«ÄM:ïaÑÅjÃ/\u0095\u0095m#{$Ü\u0005\u000epæ\u0091<qRõ\u008fë Õ\u001bsÓ.\u0092\u0092á&û\u0001¢\u0084\fÝÂJf\u00ad¹NÈ\u001afhes#\u009cº,|\u0081{\u0085£\u0097e\u0001Ê\u0012>@[bH3I\n0J¹Ó\u0084&LÄ*\u0084\u007fÆ\u008fßÌH\u001f\u0087\u009ch8Aþ\u0090Ä\u0014ü(\u000f\u0005Ïãg]Â£<)k\u0000)9\u0099\u0002Ëi\u0016I\tïã<û\u001a\u001d9ÀÉ,`½%Ö!§\u0081·\u0018Ý\u009b,\u0018\u0091[¡ð\u0019¥\u0007DÐ\u001d/Qy(kN¯Tã-ôfo«´\u0019\u0099aÃ\u0019R¿^IÐD!\u0011F´`ú[qÿ\u0094Ûy\u0007R:25\u0004c\u0004\u008e\u0094\u0098\u0091\u0012r`\u009e\u000f\u0087'â§8\u0089Åã\u0088m1r\b7¨©\u008cõÕ÷ígÝ\u0093u\u0011½\u0016q\u0089rìç\u0092îa6É(\u001eMRÑüÂÛ\u0018°Üà@ôëûÎç\u0081y;*UE\"\u0090Ì\u008a¡~×ü!Â´Ç»\u0087Ø´Nvé\u0088!lÅ$I.G\u0080f÷\u0097oP2>\n\u008b\u009c\u009eÌÓdX£\u0096=æ»\u0007\u0004öÅ]Y!»Ø¡4°|Ä¹\u001f*Í\u0094àÇ\u008d+}f¯¹~[ºIûö/ëÑýÓgÀ\n\u001bÐêÈB)\u001a\u0098Õéë·\u0018Âç<j9¥O\u008eD\rni\u0090\u008cTÈ\u008cÀT©?\u0000J\u009f\u000b\u0081*\u0007zè±\u0012(T×]\u0002\u0089ð¹8\u001eÊ\u00994\u0097yzù:÷ó\u0091\u0090R.ÂFÑD\u0003þ´»³\u000bs\u0087\u0091¥=Cy{Ðª.\u0012\u0017F\u009d\u0086§\u00adW\u0082Oþ1ëµDØ4d\nY\u0083\\G_\"%º\u0013\u0012\u008c\u0095ip3ÔG`¸?æû>úiû¡\u0088®\u0086\rînÁÑfÝa?)´/3ÌÀ§Ð^\b½*\u001c\u0081\u0013[ \u001fQ\u009a¶ßi\u0006\u007f3\u0094Û\u0081O\u0005)v\tð\u001e\u007f&:?÷ó<-ã?+¼<\"$»eu¹ÌÿÑ)Í=îËìoÃg*Uk×äµ\u0015¸â\u008cÇ¸¯+»LÅøÀÛ\u0017±Y\u00ad]B\u0013ZD\u009er\u0019¨ûÁ%¯¼\u008e>è·t>f\u0001¬\u0083jD\u001a±¢v\u0099=°\u008fÀÕá2¤O\nÅüc=\u008d÷ùÇ\u0005t½\u0094ÅÜ\u0018×\u008b\u0093IÀÅP>àì\u0018\u000b©¼¹\u0010¶KÆvç\nVYê¹¿Gn\u0007øwÅ÷Ç¡q\u0017IÑ¥Ãb3IY@\u0098OfÏ\u009e\u009aìF\u001f»¢m\t\u008f\u00877äûHl\"Y\u0094E\u009e±NaWW[.¿\u0094\u00adFþÎ\u0005úsF;d%(\u0095Kv±{\\N¡\u00830wp³\u0002©\u00152'ï\u0011«{·]\u007f\u0083\u001bð^@\u0080WçF²×å'CçQÈ\u001fÒù½\u009f\u0016°úå\u008emÕûËo!Ï<\u0019E\u009eà¤\n\u0093¡é\b)Ö\nõh\u000bôk0\u001d¯\u000b\u0086ã¤\u009d\u0013>¥3\u0084\u001dÓ«L_¬¯ÞÐ'½Á\u0093\u0088ÚÇ\u0015\u0082P\u0007[«\u008b7Ú\u0000Ò¼¬Â\u0015\bIk\u0099\t¡Z`\u0086l\u0002ÔüÝ\u0019ç\u0001\u009aÕÃ%/>ßÎòÓ\u00adÐÊàdû\u001dx\u001d\u009d\u0015ô¯p¸Ý·\u0091\u0089W¡\u0085\u0088\u0098Âæ)\u0093\u0090\u0000¢K\u0007y\u0085Ì\u008aÿ\u0089¸ß~W\u0011Ë\u0005\u0012ðÏÞæ»7-0ÇíÜ4\u0003ª\b* O÷4\u007fúW\u0096\u0080\f\u0011SC,4`ò³gvÇ÷vrk^Ë\u0098\u001du\u001eÞ\u0018\b\u000e¯S\u0001£úÑ&k\u0007Êz9¹\u009cÁ\u0016uU\u0002[ÏF\u001d7Á¬ÂÆ2Â?/\n\u0082O\u0097ic§§å_@\u0091?ËÍ\u009e.IV!âj³¸ébOþè5qÝ]\u0093õ®Ô\u0001ÂÕì3\u008dY\u0013\u0015û{¸M\u001e»\u009bt2¡ªåE\u0002\u001dàøÃ¿Á!{äf\u0083Ï4\u0000ù,ÿvþÜÈ\u0080ræí=Írp\u0099^Ù+Ã\u0017\u0085\u0085úòrÝKg\u0082M\u0001\u001cü\u001aë¸V\u0090*?ß¤\fÍÐ\u0005bA\u0099§Î1\u0090È\u0095©1«ýà\u0093\u001bãà®<&Ëù\u000f\u009c\u0081µ+0oOC¾·§\u0016\u0082j_\u008fin<\u0085°¯ßÅ~[\u0084>\u0081Á\u009d\r\u001dù\u0004óèPÁ\u00997ðªÂ-d\u0086\u0007³J"
         .getBytes("ISO-8859-1");

      int var79;
      do {
         bbba[var32] = (
               (var10002[var10001] & 255) << 24 | (var10002[var10001 + 1] & 255) << 16 | (var10002[var10001 + 2] & 255) << 8 | var10002[var10001 + 3] & 255
            )
            ^ -386014820;
         var32 += 1;
         var79 = var10001 + 4;
         var10001 += 4;
      } while (var79 < var10002.length);

      String[] var13 = new String[b(1726314839, var25 ^ 254027317)];
      int var11 = 0;
      String var10;
      int var12 = (var10 = bbba(44344311, var25 ^ 1753852509)).length();
      int var9 = b(1726314838, var25 ^ -1775292705);
      int var28 = -1;

      label122:
      while (true) {
         String var33 = var10.substring(++var28, var28 + var9);
         var10001 = (byte)-1;

         while (true) {
            label117: {
               char[] var42 = var33.toCharArray();
               var79 = var42.length;
               int var14 = 0;
               var62 = var42;
               var10001 = var79;
               char[] var83;
               int var99;
               if (var79 <= 1) {
                  var83 = var42;
                  var99 = var14;
               } else {
                  var62 = var42;
                  var10001 = var79;
                  if (var79 <= var14) {
                     break label117;
                  }

                  var83 = var42;
                  var99 = var14;
               }

               while (true) {
                  var83[var99] = (char)(var83[var99] ^ switch (var14 % b(1726314843, var25 ^ -2146284224)) {
                     case 0 -> b(1726314842, var25 ^ -81101057);
                     case 1 -> b(1726314841, var25 ^ 2010470573);
                     case 2 -> b(1726314840, var25 ^ 1434320982);
                     case 3 -> b(1726314847, var25 ^ -1789063534);
                     case 4 -> b(1726314846, var25 ^ -1888704398);
                     case 5 -> b(1726314845, var25 ^ 752594339);
                     default -> b(1726314844, var25 ^ -310801386);
                  });
                  var14++;
                  if (var10001 == 0) {
                     var99 = var10001;
                     var83 = var62;
                  } else {
                     if (var10001 <= var14) {
                        break;
                     }

                     var83 = var62;
                     var99 = var14;
                  }
               }
            }

            String var90 = new String(var62).intern();
            switch (var10001) {
               case 0:
                  var13[var11++] = var90;
                  if ((var28 += var9) >= var12) {
                     bbb = var13;
                     aaba = new String[b(1726314836, var25 ^ -207888528)];
                     long var0 = 6911173186982543625L;
                     long[] var6 = new long[b(1726314819, var25 ^ 1428302342)];
                     int var3 = 0;
                     String var4;
                     int var5 = (var4 = bbba(44344309, var25 ^ -1393766426)).length();
                     byte var2 = 0;

                     label96:
                     while (true) {
                        int var49 = var2;
                        var2 += 8;
                        String var35 = var4.substring(var49, var2);
                        var49 = 44344308;
                        int var68 = var25 ^ -790196055;
                        byte[] var7 = var35.getBytes("ISO-8859-1");
                        long[] var36 = var6;
                        var49 = var3++;
                        long var69 = (var7[0] & 255L) << b(1726314818, var25 ^ -504214127)
                           | (var7[1] & 255L) << b(1726314817, var25 ^ 37304941)
                           | (var7[2] & 255L) << b(1726314816, var25 ^ -233899320)
                           | (var7[3] & 255L) << b(1726314823, var25 ^ -936687768)
                           | (var7[4] & 255L) << b(1726314822, var25 ^ 1555485714)
                           | (var7[5] & 255L) << b(1726314821, var25 ^ -135426464)
                           | (var7[b(1726314820, var25 ^ -1421625746)] & 255L) << b(1726314827, var25 ^ 1545275382)
                           | var7[b(1726314826, var25 ^ -1400156785)] & 255L;
                        byte var91 = -1;

                        while (true) {
                           long var101 = var69 ^ var0;
                           switch (var91) {
                              case 0:
                                 var36[var49] = var101;
                                 if (var2 >= var5) {
                                    abab = var6;
                                    baa = new Integer[b(1726314800, var25 ^ -674639753)];
                                    baaa = a(b(1726314807, var25 ^ -1678924278), 2328611598324301572L);
                                    aa = (byte)a(b(1726314806, var25 ^ 1636118342), 6188382781904271008L);
                                    bab = aabbaaaba.aaab(
                                       aab(b(1726314805, var25 ^ -1982676725), b(1726314804, var25 ^ 1900599529))
                                    );
                                    aaaa = aabbaaaba.aaab(
                                       aab(b(1726314811, var25 ^ 306312129), b(1726314810, var25 ^ -251396795))
                                    );
                                    aab = aabbaaaba.aaab(
                                       aab(b(1726314809, var25 ^ -1426406843), b(1726314808, var25 ^ -1278552984))
                                    );
                                    return;
                                 }
                                 break;
                              default:
                                 var36[var49] = var101;
                                 if (var2 < var5) {
                                    continue label96;
                                 }

                                 var5 = (var4 = bbba(44344307, var25 ^ 1787338518)).length();
                                 var2 = 0;
                           }

                           int var52 = var2;
                           var2 += 8;
                           String var37 = var4.substring(var52, var2);
                           var52 = 44344306;
                           int var71 = var25 ^ -1420383488;
                           var7 = var37.getBytes("ISO-8859-1");
                           var36 = var6;
                           var49 = var3++;
                           var69 = (var7[0] & 255L) << b(1726314825, var25 ^ -757291301)
                              | (var7[1] & 255L) << b(1726314824, var25 ^ 2018928293)
                              | (var7[2] & 255L) << b(1726314831, var25 ^ -245205384)
                              | (var7[3] & 255L) << b(1726314830, var25 ^ -20768531)
                              | (var7[4] & 255L) << b(1726314829, var25 ^ -1218346122)
                              | (var7[5] & 255L) << b(1726314828, var25 ^ -1106323241)
                              | (var7[b(1726314803, var25 ^ 527282443)] & 255L) << b(1726314802, var25 ^ -1109545208)
                              | var7[b(1726314801, var25 ^ -2131072477)] & 255L;
                           var91 = 0;
                        }
                     }
                  }

                  var9 = var10.charAt(var28);
                  break;
               default:
                  var13[var11++] = var90;
                  if ((var28 += var9) < var12) {
                     var9 = var10.charAt(var28);
                     continue label122;
                  }

                  var12 = (var10 = bbba(44344310, var25 ^ 1296824970)).length();
                  var9 = b(1726314837, var25 ^ -802260938);
                  var28 = -1;
            }

            var33 = var10.substring(++var28, var28 + var9);
            var10001 = (byte)0;
         }
      }
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
      // 00: getstatic qeaa361f143ee4a0894bd168fd9b30c66/qf4ccf8f5435d4a78bdca4d6a018b578e/aabbabbab.ab I
      // 03: invokestatic qeaa361f143ee4a0894bd168fd9b30c66/qf4ccf8f5435d4a78bdca4d6a018b578e/aaaabba.bb ()V
      // 06: istore 1
      // 07: aload 0
      // 08: invokevirtual qeaa361f143ee4a0894bd168fd9b30c66/qf4ccf8f5435d4a78bdca4d6a018b578e/baabbbba.aaa ()Z
      // 0b: ifne 10
      // 0e: return
      // 0f: athrow
      // 10: invokestatic net/minecraft/class_310.method_1551 ()Lnet/minecraft/class_310;
      // 13: astore 2
      // 14: aload 2
      // 15: iload 1
      // 16: ifne 21
      // 19: ifnull 42
      // 1c: goto 20
      // 1f: athrow
      // 20: aload 2
      // 21: iload 1
      // 22: ifne 34
      // 25: getfield net/minecraft/class_310.field_1724 Lnet/minecraft/class_746;
      // 28: ifnull 42
      // 2b: goto 2f
      // 2e: athrow
      // 2f: aload 2
      // 30: goto 34
      // 33: athrow
      // 34: iload 1
      // 35: ifne 45
      // 38: getfield net/minecraft/class_310.field_1687 Lnet/minecraft/class_638;
      // 3b: ifnonnull 44
      // 3e: goto 42
      // 41: athrow
      // 42: return
      // 43: athrow
      // 44: aload 2
      // 45: getfield net/minecraft/class_310.field_1687 Lnet/minecraft/class_638;
      // 48: invokevirtual net/minecraft/class_638.method_18456 ()Ljava/util/List;
      // 4b: invokeinterface java/util/List.iterator ()Ljava/util/Iterator; 1
      // 50: astore 3
      // 51: aload 3
      // 52: invokeinterface java/util/Iterator.hasNext ()Z 1
      // 57: ifeq 85
      // 5a: aload 3
      // 5b: invokeinterface java/util/Iterator.next ()Ljava/lang/Object; 1
      // 60: checkcast net/minecraft/class_1657
      // 63: astore 4
      // 65: aload 2
      // 66: aload 4
      // 68: invokestatic qeaa361f143ee4a0894bd168fd9b30c66/qf4ccf8f5435d4a78bdca4d6a018b578e/bbaabbaa.ba (Lnet/minecraft/class_310;Lnet/minecraft/class_1657;)Z
      // 6b: ifeq 81
      // 6e: aload 4
      // 70: invokevirtual net/minecraft/class_1657.method_5667 ()Ljava/util/UUID;
      // 73: aload 0
      // 74: invokevirtual qeaa361f143ee4a0894bd168fd9b30c66/qf4ccf8f5435d4a78bdca4d6a018b578e/baabbbba.abba ()Ljava/awt/Color;
      // 77: invokevirtual java/awt/Color.getRGB ()I
      // 7a: invokestatic qeaa361f143ee4a0894bd168fd9b30c66/qf4ccf8f5435d4a78bdca4d6a018b578e/aaaabba.aab (Ljava/util/UUID;I)V
      // 7d: goto 81
      // 80: athrow
      // 81: iload 1
      // 82: ifeq 51
      // 85: return
   }

   private Color abab() {
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
      // 05: getfield qeaa361f143ee4a0894bd168fd9b30c66/qf4ccf8f5435d4a78bdca4d6a018b578e/baabbbba.bbaa Lqeaa361f143ee4a0894bd168fd9b30c66/qf4ccf8f5435d4a78bdca4d6a018b578e/abbaaaaa;
      // 08: iload 1
      // 09: ifne 27
      // 0c: invokevirtual qeaa361f143ee4a0894bd168fd9b30c66/qf4ccf8f5435d4a78bdca4d6a018b578e/abbaaaaa.abbb ()Ljava/lang/Object;
      // 0f: checkcast java/lang/Boolean
      // 12: invokevirtual java/lang/Boolean.booleanValue ()Z
      // 15: ifne 3f
      // 18: goto 1c
      // 1b: athrow
      // 1c: aload 0
      // 1d: getfield qeaa361f143ee4a0894bd168fd9b30c66/qf4ccf8f5435d4a78bdca4d6a018b578e/baabbbba.abbb Lqeaa361f143ee4a0894bd168fd9b30c66/qf4ccf8f5435d4a78bdca4d6a018b578e/abaabaaab;
      // 20: invokevirtual qeaa361f143ee4a0894bd168fd9b30c66/qf4ccf8f5435d4a78bdca4d6a018b578e/abaabaaab.abbb ()Ljava/lang/Object;
      // 23: goto 27
      // 26: athrow
      // 27: checkcast java/awt/Color
      // 2a: astore 2
      // 2b: aload 2
      // 2c: iload 1
      // 2d: ifne 3a
      // 30: ifnonnull 3d
      // 33: goto 37
      // 36: athrow
      // 37: getstatic java/awt/Color.WHITE Ljava/awt/Color;
      // 3a: goto 3e
      // 3d: aload 2
      // 3e: areturn
      // 3f: invokestatic qeaa361f143ee4a0894bd168fd9b30c66/qf4ccf8f5435d4a78bdca4d6a018b578e/abaaaaaba.aaaaa ()Lqeaa361f143ee4a0894bd168fd9b30c66/qf4ccf8f5435d4a78bdca4d6a018b578e/abaaaaaba;
      // 42: astore 2
      // 43: aload 2
      // 44: iload 1
      // 45: ifne 50
      // 48: ifnull 74
      // 4b: goto 4f
      // 4e: athrow
      // 4f: aload 2
      // 50: iload 1
      // 51: ifne 63
      // 54: invokevirtual qeaa361f143ee4a0894bd168fd9b30c66/qf4ccf8f5435d4a78bdca4d6a018b578e/abaaaaaba.aaba ()Lqeaa361f143ee4a0894bd168fd9b30c66/qf4ccf8f5435d4a78bdca4d6a018b578e/babbaba;
      // 57: ifnull 74
      // 5a: goto 5e
      // 5d: athrow
      // 5e: aload 2
      // 5f: goto 63
      // 62: athrow
      // 63: invokevirtual qeaa361f143ee4a0894bd168fd9b30c66/qf4ccf8f5435d4a78bdca4d6a018b578e/abaaaaaba.aaba ()Lqeaa361f143ee4a0894bd168fd9b30c66/qf4ccf8f5435d4a78bdca4d6a018b578e/babbaba;
      // 66: iload 1
      // 67: ifne 7d
      // 6a: invokevirtual qeaa361f143ee4a0894bd168fd9b30c66/qf4ccf8f5435d4a78bdca4d6a018b578e/babbaba.abbab ()Lqeaa361f143ee4a0894bd168fd9b30c66/qf4ccf8f5435d4a78bdca4d6a018b578e/ababbbaab;
      // 6d: ifnonnull 79
      // 70: goto 74
      // 73: athrow
      // 74: getstatic java/awt/Color.WHITE Ljava/awt/Color;
      // 77: areturn
      // 78: athrow
      // 79: aload 2
      // 7a: invokevirtual qeaa361f143ee4a0894bd168fd9b30c66/qf4ccf8f5435d4a78bdca4d6a018b578e/abaaaaaba.aaba ()Lqeaa361f143ee4a0894bd168fd9b30c66/qf4ccf8f5435d4a78bdca4d6a018b578e/babbaba;
      // 7d: invokevirtual qeaa361f143ee4a0894bd168fd9b30c66/qf4ccf8f5435d4a78bdca4d6a018b578e/babbaba.abbab ()Lqeaa361f143ee4a0894bd168fd9b30c66/qf4ccf8f5435d4a78bdca4d6a018b578e/ababbbaab;
      // 80: invokevirtual qeaa361f143ee4a0894bd168fd9b30c66/qf4ccf8f5435d4a78bdca4d6a018b578e/ababbbaab.aabab ()Ljava/awt/Color;
      // 83: astore 3
      // 84: aload 3
      // 85: iload 1
      // 86: ifne 93
      // 89: ifnonnull 96
      // 8c: goto 90
      // 8f: athrow
      // 90: getstatic java/awt/Color.WHITE Ljava/awt/Color;
      // 93: goto 97
      // 96: aload 3
      // 97: areturn
   }

   private Color abba() {
      return abbaababa.bbb(this.abab(), a(b(1726314815, 786925665 ^ -1542614526), 6478678682326998077L));
   }

   private boolean abbb() {
      try {
         if (this.babb.abbb() == aabbbbbba.ab) {
            return true;
         }
      } catch (RuntimeException var1) {
         throw var1;
      }

      return false;
   }

   private boolean baaa(babbaab param1) {
      // $VF: Couldn't be decompiled
      // Please report this to the Vineflower issue tracker, at https://github.com/Vineflower/vineflower/issues with a copy of the class file (if you have the rights to distribute it!)
      // java.lang.RuntimeException: parsing failure!
      //   at org.jetbrains.java.decompiler.modules.decompiler.decompose.DomHelper.parseGraph(DomHelper.java:211)
      //   at org.jetbrains.java.decompiler.main.rels.MethodProcessor.codeToJava(MethodProcessor.java:166)
      //
      // Bytecode:
      // 000: getstatic qeaa361f143ee4a0894bd168fd9b30c66/qf4ccf8f5435d4a78bdca4d6a018b578e/aabbabbab.ab I
      // 003: aload 0
      // 004: getfield qeaa361f143ee4a0894bd168fd9b30c66/qf4ccf8f5435d4a78bdca4d6a018b578e/baabbbba.bb [B
      // 007: aload 1
      // 008: invokevirtual qeaa361f143ee4a0894bd168fd9b30c66/qf4ccf8f5435d4a78bdca4d6a018b578e/babbaab.ordinal ()I
      // 00b: baload
      // 00c: istore 3
      // 00d: istore 2
      // 00e: iload 3
      // 00f: iload 2
      // 010: ifne 036
      // 013: ifeq 035
      // 016: goto 01a
      // 019: athrow
      // 01a: iload 3
      // 01b: iload 2
      // 01c: ifne 030
      // 01f: goto 023
      // 022: athrow
      // 023: bipush 1
      // 024: if_icmpne 033
      // 027: goto 02b
      // 02a: athrow
      // 02b: bipush 1
      // 02c: goto 030
      // 02f: athrow
      // 030: goto 034
      // 033: bipush 0
      // 034: ireturn
      // 035: bipush 0
      // 036: istore 4
      // 038: invokestatic net/minecraft/class_310.method_1551 ()Lnet/minecraft/class_310;
      // 03b: astore 5
      // 03d: aload 5
      // 03f: iload 2
      // 040: ifne 04c
      // 043: ifnull 118
      // 046: goto 04a
      // 049: athrow
      // 04a: aload 5
      // 04c: invokevirtual net/minecraft/class_310.method_1478 ()Lnet/minecraft/class_3300;
      // 04f: ifnull 118
      // 052: getstatic qeaa361f143ee4a0894bd168fd9b30c66/qf4ccf8f5435d4a78bdca4d6a018b578e/baabbbba.bab Lqeaa361f143ee4a0894bd168fd9b30c66/qf4ccf8f5435d4a78bdca4d6a018b578e/ababbbbaa;
      // 055: invokevirtual qeaa361f143ee4a0894bd168fd9b30c66/qf4ccf8f5435d4a78bdca4d6a018b578e/ababbbbaa.abab ()Ljava/lang/String;
      // 058: getstatic qeaa361f143ee4a0894bd168fd9b30c66/qf4ccf8f5435d4a78bdca4d6a018b578e/baabbbba.aaaa Lqeaa361f143ee4a0894bd168fd9b30c66/qf4ccf8f5435d4a78bdca4d6a018b578e/ababbbbaa;
      // 05b: invokevirtual qeaa361f143ee4a0894bd168fd9b30c66/qf4ccf8f5435d4a78bdca4d6a018b578e/ababbbbaa.abab ()Ljava/lang/String;
      // 05e: aload 1
      // 05f: getfield qeaa361f143ee4a0894bd168fd9b30c66/qf4ccf8f5435d4a78bdca4d6a018b578e/babbaab.ab Lqeaa361f143ee4a0894bd168fd9b30c66/qf4ccf8f5435d4a78bdca4d6a018b578e/ababbbbaa;
      // 062: invokevirtual qeaa361f143ee4a0894bd168fd9b30c66/qf4ccf8f5435d4a78bdca4d6a018b578e/ababbbbaa.abab ()Ljava/lang/String;
      // 065: getstatic qeaa361f143ee4a0894bd168fd9b30c66/qf4ccf8f5435d4a78bdca4d6a018b578e/baabbbba.aab Lqeaa361f143ee4a0894bd168fd9b30c66/qf4ccf8f5435d4a78bdca4d6a018b578e/ababbbbaa;
      // 068: invokevirtual qeaa361f143ee4a0894bd168fd9b30c66/qf4ccf8f5435d4a78bdca4d6a018b578e/ababbbbaa.abab ()Ljava/lang/String;
      // 06b: astore 13
      // 06d: astore 12
      // 06f: astore 11
      // 071: new java/lang/StringBuilder
      // 074: dup
      // 075: invokespecial java/lang/StringBuilder.<init> ()V
      // 078: aload 11
      // 07a: invokevirtual java/lang/StringBuilder.append (Ljava/lang/Object;)Ljava/lang/StringBuilder;
      // 07d: aload 12
      // 07f: invokevirtual java/lang/StringBuilder.append (Ljava/lang/Object;)Ljava/lang/StringBuilder;
      // 082: aload 13
      // 084: invokevirtual java/lang/StringBuilder.append (Ljava/lang/Object;)Ljava/lang/StringBuilder;
      // 087: invokevirtual java/lang/StringBuilder.toString ()Ljava/lang/String;
      // 08a: invokestatic net/minecraft/class_2960.method_60655 (Ljava/lang/String;Ljava/lang/String;)Lnet/minecraft/class_2960;
      // 08d: astore 6
      // 08f: aload 5
      // 091: invokevirtual net/minecraft/class_310.method_1478 ()Lnet/minecraft/class_3300;
      // 094: aload 6
      // 096: invokeinterface net/minecraft/class_3300.method_14486 (Lnet/minecraft/class_2960;)Ljava/util/Optional; 2
      // 09b: astore 7
      // 09d: aload 7
      // 09f: iload 2
      // 0a0: ifne 0b2
      // 0a3: invokevirtual java/util/Optional.isPresent ()Z
      // 0a6: ifeq 118
      // 0a9: goto 0ad
      // 0ac: athrow
      // 0ad: aload 7
      // 0af: invokevirtual java/util/Optional.get ()Ljava/lang/Object;
      // 0b2: checkcast net/minecraft/class_3298
      // 0b5: invokevirtual net/minecraft/class_3298.method_43039 ()Ljava/io/BufferedReader;
      // 0b8: astore 8
      // 0ba: aload 8
      // 0bc: invokestatic com/google/gson/JsonParser.parseReader (Ljava/io/Reader;)Lcom/google/gson/JsonElement;
      // 0bf: astore 9
      // 0c1: iload 2
      // 0c2: ifne 0ea
      // 0c5: getstatic net/minecraft/class_9962.field_53111 Lcom/mojang/serialization/Codec;
      // 0c8: getstatic com/mojang/serialization/JsonOps.INSTANCE Lcom/mojang/serialization/JsonOps;
      // 0cb: aload 9
      // 0cd: invokeinterface com/mojang/serialization/Codec.parse (Lcom/mojang/serialization/DynamicOps;Ljava/lang/Object;)Lcom/mojang/serialization/DataResult; 3
      // 0d2: invokeinterface com/mojang/serialization/DataResult.result ()Ljava/util/Optional; 1
      // 0d7: invokevirtual java/util/Optional.isPresent ()Z
      // 0da: istore 4
      // 0dc: aload 8
      // 0de: ifnull 110
      // 0e1: aload 8
      // 0e3: invokevirtual java/io/Reader.close ()V
      // 0e6: goto 0ea
      // 0e9: athrow
      // 0ea: goto 110
      // 0ed: astore 9
      // 0ef: iload 2
      // 0f0: ifne 101
      // 0f3: aload 8
      // 0f5: ifnull 10d
      // 0f8: goto 0fc
      // 0fb: athrow
      // 0fc: aload 8
      // 0fe: invokevirtual java/io/Reader.close ()V
      // 101: goto 10d
      // 104: astore 10
      // 106: aload 9
      // 108: aload 10
      // 10a: invokevirtual java/lang/Throwable.addSuppressed (Ljava/lang/Throwable;)V
      // 10d: aload 9
      // 10f: athrow
      // 110: goto 118
      // 113: astore 8
      // 115: bipush 0
      // 116: istore 4
      // 118: aload 0
      // 119: getfield qeaa361f143ee4a0894bd168fd9b30c66/qf4ccf8f5435d4a78bdca4d6a018b578e/baabbbba.bb [B
      // 11c: aload 1
      // 11d: invokevirtual qeaa361f143ee4a0894bd168fd9b30c66/qf4ccf8f5435d4a78bdca4d6a018b578e/babbaab.ordinal ()I
      // 120: iload 4
      // 122: iload 2
      // 123: ifne 12e
      // 126: ifeq 131
      // 129: goto 12d
      // 12c: athrow
      // 12d: bipush 1
      // 12e: goto 132
      // 131: bipush 2
      // 132: bastore
      // 133: iload 4
      // 135: ireturn
   }

   private static double[] baab(aabbbbaaa param0, class_238 param1, int param2, int param3) {
      // $VF: Couldn't be decompiled
      // Please report this to the Vineflower issue tracker, at https://github.com/Vineflower/vineflower/issues with a copy of the class file (if you have the rights to distribute it!)
      // java.lang.RuntimeException: parsing failure!
      //   at org.jetbrains.java.decompiler.modules.decompiler.decompose.DomHelper.parseGraph(DomHelper.java:211)
      //   at org.jetbrains.java.decompiler.main.rels.MethodProcessor.codeToJava(MethodProcessor.java:166)
      //
      // Bytecode:
      // 000: getstatic qeaa361f143ee4a0894bd168fd9b30c66/qf4ccf8f5435d4a78bdca4d6a018b578e/aabbabbab.ab I
      // 003: new org/joml/Matrix4f
      // 006: dup
      // 007: aload 0
      // 008: invokeinterface qeaa361f143ee4a0894bd168fd9b30c66/qf4ccf8f5435d4a78bdca4d6a018b578e/aabbbbaaa.aaa ()Lorg/joml/Matrix4f; 1
      // 00d: invokespecial org/joml/Matrix4f.<init> (Lorg/joml/Matrix4fc;)V
      // 010: aload 0
      // 011: invokeinterface qeaa361f143ee4a0894bd168fd9b30c66/qf4ccf8f5435d4a78bdca4d6a018b578e/aabbbbaaa.aba ()Lorg/joml/Matrix4f; 1
      // 016: invokevirtual org/joml/Matrix4f.mul (Lorg/joml/Matrix4fc;)Lorg/joml/Matrix4f;
      // 019: astore 5
      // 01b: aload 0
      // 01c: invokestatic qeaa361f143ee4a0894bd168fd9b30c66/qf4ccf8f5435d4a78bdca4d6a018b578e/bbaabbaa.baaab (Ljava/lang/Object;)Lnet/minecraft/class_243;
      // 01f: astore 6
      // 021: ldc_w 1726314814
      // 024: ldc_w 2111006472
      // 027: ldc_w 844329419
      // 02a: ixor
      // 02b: invokestatic qeaa361f143ee4a0894bd168fd9b30c66/qf4ccf8f5435d4a78bdca4d6a018b578e/baabbbba.b (II)I
      // 02e: ldc2_w 4889148785496050485
      // 031: invokestatic qeaa361f143ee4a0894bd168fd9b30c66/qf4ccf8f5435d4a78bdca4d6a018b578e/baabbbba.a (IJ)I
      // 034: anewarray 1513
      // 037: astore 7
      // 039: istore 4
      // 03b: bipush 0
      // 03c: istore 8
      // 03e: bipush 2
      // 03f: newarray 7
      // 041: dup
      // 042: bipush 0
      // 043: aload 1
      // 044: getfield net/minecraft/class_238.field_1323 D
      // 047: dastore
      // 048: dup
      // 049: bipush 1
      // 04a: aload 1
      // 04b: getfield net/minecraft/class_238.field_1320 D
      // 04e: dastore
      // 04f: astore 9
      // 051: aload 9
      // 053: arraylength
      // 054: istore 10
      // 056: bipush 0
      // 057: istore 11
      // 059: iload 11
      // 05b: iload 10
      // 05d: if_icmpge 11a
      // 060: aload 9
      // 062: iload 11
      // 064: daload
      // 065: iload 4
      // 067: ifne 11d
      // 06a: dstore 12
      // 06c: bipush 2
      // 06d: newarray 7
      // 06f: dup
      // 070: bipush 0
      // 071: aload 1
      // 072: getfield net/minecraft/class_238.field_1322 D
      // 075: dastore
      // 076: dup
      // 077: bipush 1
      // 078: aload 1
      // 079: getfield net/minecraft/class_238.field_1325 D
      // 07c: dastore
      // 07d: astore 14
      // 07f: aload 14
      // 081: arraylength
      // 082: istore 15
      // 084: bipush 0
      // 085: istore 16
      // 087: iload 16
      // 089: iload 15
      // 08b: if_icmpge 112
      // 08e: aload 14
      // 090: iload 16
      // 092: daload
      // 093: dstore 17
      // 095: bipush 2
      // 096: newarray 7
      // 098: dup
      // 099: bipush 0
      // 09a: aload 1
      // 09b: iload 4
      // 09d: ifne 079
      // 0a0: getfield net/minecraft/class_238.field_1321 D
      // 0a3: dastore
      // 0a4: dup
      // 0a5: bipush 1
      // 0a6: aload 1
      // 0a7: getfield net/minecraft/class_238.field_1324 D
      // 0aa: dastore
      // 0ab: astore 19
      // 0ad: aload 19
      // 0af: arraylength
      // 0b0: istore 20
      // 0b2: bipush 0
      // 0b3: istore 21
      // 0b5: iload 21
      // 0b7: iload 20
      // 0b9: if_icmpge 10a
      // 0bc: aload 19
      // 0be: iload 21
      // 0c0: daload
      // 0c1: dstore 22
      // 0c3: iload 4
      // 0c5: aload 7
      // 0c7: iload 8
      // 0c9: new org/joml/Vector4f
      // 0cc: dup
      // 0cd: dload 12
      // 0cf: aload 6
      // 0d1: getfield net/minecraft/class_243.field_1352 D
      // 0d4: dsub
      // 0d5: d2f
      // 0d6: dload 17
      // 0d8: aload 6
      // 0da: getfield net/minecraft/class_243.field_1351 D
      // 0dd: dsub
      // 0de: d2f
      // 0df: dload 22
      // 0e1: aload 6
      // 0e3: getfield net/minecraft/class_243.field_1350 D
      // 0e6: dsub
      // 0e7: d2f
      // 0e8: fconst_1
      // 0e9: invokespecial org/joml/Vector4f.<init> (FFFF)V
      // 0ec: aastore
      // 0ed: ifne 10d
      // 0f0: aload 5
      // 0f2: aload 7
      // 0f4: iload 8
      // 0f6: aaload
      // 0f7: invokevirtual org/joml/Matrix4f.transform (Lorg/joml/Vector4f;)Lorg/joml/Vector4f;
      // 0fa: pop
      // 0fb: iload 4
      // 0fd: iinc 8 1
      // 100: iinc 21 1
      // 103: ifeq 0b5
      // 106: goto 10a
      // 109: athrow
      // 10a: iinc 16 1
      // 10d: iload 4
      // 10f: ifeq 087
      // 112: iinc 11 1
      // 115: iload 4
      // 117: ifeq 059
      // 11a: ldc2_w Infinity
      // 11d: dstore 9
      // 11f: ldc2_w Infinity
      // 122: dstore 11
      // 124: ldc2_w -Infinity
      // 127: dstore 13
      // 129: ldc2_w -Infinity
      // 12c: dstore 15
      // 12e: bipush 0
      // 12f: istore 17
      // 131: bipush 0
      // 132: istore 18
      // 134: iload 18
      // 136: ldc_w 1726314813
      // 139: ldc_w 2111006472
      // 13c: ldc_w 1493723996
      // 13f: ixor
      // 140: invokestatic qeaa361f143ee4a0894bd168fd9b30c66/qf4ccf8f5435d4a78bdca4d6a018b578e/baabbbba.b (II)I
      // 143: ldc2_w 4889148785496050485
      // 146: invokestatic qeaa361f143ee4a0894bd168fd9b30c66/qf4ccf8f5435d4a78bdca4d6a018b578e/baabbbba.a (IJ)I
      // 149: if_icmpge 374
      // 14c: iload 4
      // 14e: ifne 3ac
      // 151: bipush 1
      // 152: istore 19
      // 154: iload 19
      // 156: bipush 4
      // 157: if_icmpgt 36c
      // 15a: iload 18
      // 15c: iload 4
      // 15e: ifne 136
      // 161: iload 19
      // 163: iand
      // 164: ifeq 170
      // 167: iload 4
      // 169: ifeq 361
      // 16c: goto 170
      // 16f: athrow
      // 170: aload 7
      // 172: iload 18
      // 174: aaload
      // 175: astore 20
      // 177: aload 7
      // 179: iload 18
      // 17b: iload 19
      // 17d: ior
      // 17e: aaload
      // 17f: astore 21
      // 181: aload 20
      // 183: getfield org/joml/Vector4f.w F
      // 186: ldc 0.05
      // 188: fcmpl
      // 189: iload 4
      // 18b: ifne 196
      // 18e: iflt 199
      // 191: goto 195
      // 194: athrow
      // 195: bipush 1
      // 196: goto 19a
      // 199: bipush 0
      // 19a: istore 22
      // 19c: aload 21
      // 19e: getfield org/joml/Vector4f.w F
      // 1a1: ldc 0.05
      // 1a3: fcmpl
      // 1a4: iload 4
      // 1a6: ifne 1b1
      // 1a9: iflt 1b4
      // 1ac: goto 1b0
      // 1af: athrow
      // 1b0: bipush 1
      // 1b1: goto 1b5
      // 1b4: bipush 0
      // 1b5: istore 23
      // 1b7: iload 22
      // 1b9: iload 4
      // 1bb: ifne 1c7
      // 1be: ifne 1d3
      // 1c1: goto 1c5
      // 1c4: athrow
      // 1c5: iload 23
      // 1c7: ifne 1d3
      // 1ca: iload 4
      // 1cc: ifeq 361
      // 1cf: goto 1d3
      // 1d2: athrow
      // 1d3: aload 20
      // 1d5: astore 24
      // 1d7: aload 21
      // 1d9: astore 25
      // 1db: iload 22
      // 1dd: iload 4
      // 1df: ifne 1eb
      // 1e2: ifeq 1ee
      // 1e5: goto 1e9
      // 1e8: athrow
      // 1e9: iload 23
      // 1eb: ifne 269
      // 1ee: ldc 0.05
      // 1f0: aload 20
      // 1f2: getfield org/joml/Vector4f.w F
      // 1f5: fsub
      // 1f6: aload 21
      // 1f8: getfield org/joml/Vector4f.w F
      // 1fb: aload 20
      // 1fd: getfield org/joml/Vector4f.w F
      // 200: fsub
      // 201: fdiv
      // 202: fstore 26
      // 204: new org/joml/Vector4f
      // 207: dup
      // 208: aload 20
      // 20a: getfield org/joml/Vector4f.x F
      // 20d: aload 21
      // 20f: getfield org/joml/Vector4f.x F
      // 212: aload 20
      // 214: getfield org/joml/Vector4f.x F
      // 217: fsub
      // 218: fload 26
      // 21a: fmul
      // 21b: fadd
      // 21c: aload 20
      // 21e: getfield org/joml/Vector4f.y F
      // 221: aload 21
      // 223: getfield org/joml/Vector4f.y F
      // 226: aload 20
      // 228: getfield org/joml/Vector4f.y F
      // 22b: fsub
      // 22c: fload 26
      // 22e: fmul
      // 22f: fadd
      // 230: aload 20
      // 232: getfield org/joml/Vector4f.z F
      // 235: aload 21
      // 237: getfield org/joml/Vector4f.z F
      // 23a: aload 20
      // 23c: getfield org/joml/Vector4f.z F
      // 23f: fsub
      // 240: fload 26
      // 242: fmul
      // 243: fadd
      // 244: ldc 0.05
      // 246: invokespecial org/joml/Vector4f.<init> (FFFF)V
      // 249: astore 27
      // 24b: iload 22
      // 24d: ifeq 256
      // 250: aload 20
      // 252: goto 258
      // 255: athrow
      // 256: aload 27
      // 258: astore 24
      // 25a: iload 23
      // 25c: ifeq 265
      // 25f: aload 21
      // 261: goto 267
      // 264: athrow
      // 265: aload 27
      // 267: astore 25
      // 269: aload 24
      // 26b: getfield org/joml/Vector4f.x F
      // 26e: aload 24
      // 270: getfield org/joml/Vector4f.w F
      // 273: fdiv
      // 274: f2d
      // 275: ldc2_w 0.5
      // 278: dmul
      // 279: ldc2_w 0.5
      // 27c: dadd
      // 27d: iload 2
      // 27e: i2d
      // 27f: dmul
      // 280: dstore 26
      // 282: iload 4
      // 284: ldc2_w 0.5
      // 287: aload 24
      // 289: getfield org/joml/Vector4f.y F
      // 28c: aload 24
      // 28e: getfield org/joml/Vector4f.w F
      // 291: fdiv
      // 292: f2d
      // 293: ldc2_w 0.5
      // 296: dmul
      // 297: dsub
      // 298: iload 3
      // 299: i2d
      // 29a: dmul
      // 29b: dstore 28
      // 29d: aload 25
      // 29f: getfield org/joml/Vector4f.x F
      // 2a2: aload 25
      // 2a4: getfield org/joml/Vector4f.w F
      // 2a7: fdiv
      // 2a8: f2d
      // 2a9: ldc2_w 0.5
      // 2ac: dmul
      // 2ad: ldc2_w 0.5
      // 2b0: dadd
      // 2b1: iload 2
      // 2b2: i2d
      // 2b3: dmul
      // 2b4: dstore 30
      // 2b6: ldc2_w 0.5
      // 2b9: aload 25
      // 2bb: getfield org/joml/Vector4f.y F
      // 2be: aload 25
      // 2c0: getfield org/joml/Vector4f.w F
      // 2c3: fdiv
      // 2c4: f2d
      // 2c5: ldc2_w 0.5
      // 2c8: dmul
      // 2c9: dsub
      // 2ca: iload 3
      // 2cb: i2d
      // 2cc: dmul
      // 2cd: dstore 32
      // 2cf: ifne 367
      // 2d2: dload 26
      // 2d4: invokestatic java/lang/Double.isFinite (D)Z
      // 2d7: ifeq 361
      // 2da: goto 2de
      // 2dd: athrow
      // 2de: dload 28
      // 2e0: invokestatic java/lang/Double.isFinite (D)Z
      // 2e3: iload 4
      // 2e5: ifne 365
      // 2e8: goto 2ec
      // 2eb: athrow
      // 2ec: ifeq 361
      // 2ef: goto 2f3
      // 2f2: athrow
      // 2f3: dload 30
      // 2f5: invokestatic java/lang/Double.isFinite (D)Z
      // 2f8: iload 4
      // 2fa: ifne 365
      // 2fd: goto 301
      // 300: athrow
      // 301: ifeq 361
      // 304: goto 308
      // 307: athrow
      // 308: dload 32
      // 30a: iload 4
      // 30c: ifne 35f
      // 30f: goto 313
      // 312: athrow
      // 313: invokestatic java/lang/Double.isFinite (D)Z
      // 316: ifne 326
      // 319: goto 31d
      // 31c: athrow
      // 31d: iload 4
      // 31f: ifeq 361
      // 322: goto 326
      // 325: athrow
      // 326: iinc 17 1
      // 329: dload 9
      // 32b: dload 26
      // 32d: dload 30
      // 32f: invokestatic java/lang/Math.min (DD)D
      // 332: invokestatic java/lang/Math.min (DD)D
      // 335: dstore 9
      // 337: dload 11
      // 339: dload 28
      // 33b: dload 32
      // 33d: invokestatic java/lang/Math.min (DD)D
      // 340: invokestatic java/lang/Math.min (DD)D
      // 343: dstore 11
      // 345: dload 13
      // 347: dload 26
      // 349: dload 30
      // 34b: invokestatic java/lang/Math.max (DD)D
      // 34e: invokestatic java/lang/Math.max (DD)D
      // 351: dstore 13
      // 353: dload 15
      // 355: dload 28
      // 357: dload 32
      // 359: invokestatic java/lang/Math.max (DD)D
      // 35c: invokestatic java/lang/Math.max (DD)D
      // 35f: dstore 15
      // 361: iload 19
      // 363: bipush 1
      // 364: ishl
      // 365: istore 19
      // 367: iload 4
      // 369: ifeq 154
      // 36c: iinc 18 1
      // 36f: iload 4
      // 371: ifeq 134
      // 374: iload 17
      // 376: iload 4
      // 378: ifne 394
      // 37b: ifeq 3ac
      // 37e: goto 382
      // 381: athrow
      // 382: dload 13
      // 384: dload 9
      // 386: iload 4
      // 388: ifne 39f
      // 38b: goto 38f
      // 38e: athrow
      // 38f: dcmpg
      // 390: goto 394
      // 393: athrow
      // 394: iflt 3ac
      // 397: dload 15
      // 399: dload 11
      // 39b: goto 39f
      // 39e: athrow
      // 39f: dcmpg
      // 3a0: iload 4
      // 3a2: ifne 3b1
      // 3a5: ifge 3b0
      // 3a8: goto 3ac
      // 3ab: athrow
      // 3ac: aconst_null
      // 3ad: goto 3c7
      // 3b0: bipush 4
      // 3b1: newarray 7
      // 3b3: dup
      // 3b4: bipush 0
      // 3b5: dload 9
      // 3b7: dastore
      // 3b8: dup
      // 3b9: bipush 1
      // 3ba: dload 11
      // 3bc: dastore
      // 3bd: dup
      // 3be: bipush 2
      // 3bf: dload 13
      // 3c1: dastore
      // 3c2: dup
      // 3c3: bipush 3
      // 3c4: dload 15
      // 3c6: dastore
      // 3c7: areturn
   }

   private boolean baba() {
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
      // 05: getfield qeaa361f143ee4a0894bd168fd9b30c66/qf4ccf8f5435d4a78bdca4d6a018b578e/baabbbba.babb Lqeaa361f143ee4a0894bd168fd9b30c66/qf4ccf8f5435d4a78bdca4d6a018b578e/baabaab;
      // 08: iload 1
      // 09: ifne 24
      // 0c: invokevirtual qeaa361f143ee4a0894bd168fd9b30c66/qf4ccf8f5435d4a78bdca4d6a018b578e/baabaab.abbb ()Ljava/lang/Object;
      // 0f: getstatic qeaa361f143ee4a0894bd168fd9b30c66/qf4ccf8f5435d4a78bdca4d6a018b578e/aabbbbbba.ab Lqeaa361f143ee4a0894bd168fd9b30c66/qf4ccf8f5435d4a78bdca4d6a018b578e/aabbbbbba;
      // 12: if_acmpne 39
      // 15: goto 19
      // 18: athrow
      // 19: aload 0
      // 1a: getfield qeaa361f143ee4a0894bd168fd9b30c66/qf4ccf8f5435d4a78bdca4d6a018b578e/baabbbba.baba Lqeaa361f143ee4a0894bd168fd9b30c66/qf4ccf8f5435d4a78bdca4d6a018b578e/abbaaaaa;
      // 1d: invokevirtual qeaa361f143ee4a0894bd168fd9b30c66/qf4ccf8f5435d4a78bdca4d6a018b578e/abbaaaaa.abbb ()Ljava/lang/Object;
      // 20: goto 24
      // 23: athrow
      // 24: checkcast java/lang/Boolean
      // 27: invokevirtual java/lang/Boolean.booleanValue ()Z
      // 2a: iload 1
      // 2b: ifne 36
      // 2e: ifeq 39
      // 31: goto 35
      // 34: athrow
      // 35: bipush 1
      // 36: goto 3a
      // 39: bipush 0
      // 3a: ireturn
   }

   private class_2960 babb() {
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
      // 06: ifne 26
      // 09: invokevirtual qeaa361f143ee4a0894bd168fd9b30c66/qf4ccf8f5435d4a78bdca4d6a018b578e/baabbbba.babbaab ()Z
      // 0c: ifeq 2c
      // 0f: goto 13
      // 12: athrow
      // 13: aload 0
      // 14: iload 1
      // 15: ifne 36
      // 18: goto 1c
      // 1b: athrow
      // 1c: getfield qeaa361f143ee4a0894bd168fd9b30c66/qf4ccf8f5435d4a78bdca4d6a018b578e/baabbbba.babb Lqeaa361f143ee4a0894bd168fd9b30c66/qf4ccf8f5435d4a78bdca4d6a018b578e/baabaab;
      // 1f: invokevirtual qeaa361f143ee4a0894bd168fd9b30c66/qf4ccf8f5435d4a78bdca4d6a018b578e/baabaab.abbb ()Ljava/lang/Object;
      // 22: goto 26
      // 25: athrow
      // 26: getstatic qeaa361f143ee4a0894bd168fd9b30c66/qf4ccf8f5435d4a78bdca4d6a018b578e/aabbbbbba.a Lqeaa361f143ee4a0894bd168fd9b30c66/qf4ccf8f5435d4a78bdca4d6a018b578e/aabbbbbba;
      // 29: if_acmpeq 2f
      // 2c: aconst_null
      // 2d: areturn
      // 2e: athrow
      // 2f: aload 0
      // 30: getfield qeaa361f143ee4a0894bd168fd9b30c66/qf4ccf8f5435d4a78bdca4d6a018b578e/baabbbba.baab Lqeaa361f143ee4a0894bd168fd9b30c66/qf4ccf8f5435d4a78bdca4d6a018b578e/baabaab;
      // 33: invokevirtual qeaa361f143ee4a0894bd168fd9b30c66/qf4ccf8f5435d4a78bdca4d6a018b578e/baabaab.abbb ()Ljava/lang/Object;
      // 36: checkcast qeaa361f143ee4a0894bd168fd9b30c66/qf4ccf8f5435d4a78bdca4d6a018b578e/babbaab
      // 39: astore 2
      // 3a: aload 2
      // 3b: ifnonnull 41
      // 3e: aconst_null
      // 3f: areturn
      // 40: athrow
      // 41: getstatic qeaa361f143ee4a0894bd168fd9b30c66/qf4ccf8f5435d4a78bdca4d6a018b578e/baabbbba.bab Lqeaa361f143ee4a0894bd168fd9b30c66/qf4ccf8f5435d4a78bdca4d6a018b578e/ababbbbaa;
      // 44: invokevirtual qeaa361f143ee4a0894bd168fd9b30c66/qf4ccf8f5435d4a78bdca4d6a018b578e/ababbbbaa.abab ()Ljava/lang/String;
      // 47: aload 2
      // 48: getfield qeaa361f143ee4a0894bd168fd9b30c66/qf4ccf8f5435d4a78bdca4d6a018b578e/babbaab.ab Lqeaa361f143ee4a0894bd168fd9b30c66/qf4ccf8f5435d4a78bdca4d6a018b578e/ababbbbaa;
      // 4b: invokevirtual qeaa361f143ee4a0894bd168fd9b30c66/qf4ccf8f5435d4a78bdca4d6a018b578e/ababbbbaa.abab ()Ljava/lang/String;
      // 4e: invokestatic net/minecraft/class_2960.method_60655 (Ljava/lang/String;Ljava/lang/String;)Lnet/minecraft/class_2960;
      // 51: astore 3
      // 52: aload 0
      // 53: aload 2
      // 54: invokevirtual qeaa361f143ee4a0894bd168fd9b30c66/qf4ccf8f5435d4a78bdca4d6a018b578e/baabbbba.baaa (Lqeaa361f143ee4a0894bd168fd9b30c66/qf4ccf8f5435d4a78bdca4d6a018b578e/babbaab;)Z
      // 57: ifeq 5f
      // 5a: aload 3
      // 5b: goto 60
      // 5e: athrow
      // 5f: aconst_null
      // 60: areturn
   }

   private static double bbab(class_1657 var0) {
      double var1 = Math.max(0.0F, var0.method_6067());
      double var3 = Math.max(0.0F, var0.method_6032()) + var1;
      double var5 = Math.max(1.0, var0.method_6063() + var1);
      return Math.max(0.0, Math.min(1.0, var3 / var5));
   }

   private static int a(int var0, long var1) {
      int var3 = var0 ^ (int)(var1 & 32767L) ^ b(1726314812, -23142952 ^ -159346042);
      if (baa[var3] == null) {
         baa[var3] = (int)(abab[var3] ^ var1);
      }

      return baa[var3];
   }
}
