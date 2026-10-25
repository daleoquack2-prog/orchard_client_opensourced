package nsc;

import net.fabricmc.api.EnvType;
import net.fabricmc.api.Environment;
import net.minecraft.class_1297;
import net.minecraft.class_243;
import net.minecraft.class_304;
import net.minecraft.class_310;
import net.minecraft.class_3532;
import net.minecraft.class_745;

@Environment(EnvType.CLIENT)
public final class bbabbaaa extends abbaabbaa {
   private float aa;
   private static String[] ab;
   private static final Long[] ba;
   private float bb;
   private static final long[] aaa;
   private static final String[] abab;
   private static final String[] aab;
   private static final Object[] abba;
   private static final Integer[] aba;
   private static final long[] abb;
   private final bababa baa;
   private static final String[] bab;
   private class_745 bba;
   private class_243 bbb;
   private float aaaa;
   private class_1297 aaab;
   private static final int[] abaa;
   private float aaba;
   private class_243 aabb;

   private static int a(int var0, int var1) {
      int var2 = abaa[var0 ^ -867778936] ^ var1 ^ var0;
      var2 += 24515;
      var2 ^= 986;
      var2 += 34325;
      var2 += 64415;
      var2 ^= 61006;
      var2 -= 10631;
      var2 -= 7221;
      var2 ^= 63061;
      return var2 + 22990;
   }

   public void aa(float param1, float param2, float param3, float param4) {
      // $VF: Couldn't be decompiled
      // Please report this to the Vineflower issue tracker, at https://github.com/Vineflower/vineflower/issues with a copy of the class file (if you have the rights to distribute it!)
      // java.lang.RuntimeException: parsing failure!
      //   at org.jetbrains.java.decompiler.modules.decompiler.decompose.DomHelper.parseGraph(DomHelper.java:211)
      //   at org.jetbrains.java.decompiler.main.rels.MethodProcessor.codeToJava(MethodProcessor.java:166)
      //
      // Bytecode:
      // 00: getstatic qeaa361f143ee4a0894bd168fd9b30c66/qf4ccf8f5435d4a78bdca4d6a018b578e/baaabbaa.bba I
      // 03: istore 5
      // 05: aload 0
      // 06: iload 5
      // 08: ifne 1a
      // 0b: invokevirtual qeaa361f143ee4a0894bd168fd9b30c66/qf4ccf8f5435d4a78bdca4d6a018b578e/bbabbaaa.babbaab ()Z
      // 0e: ifeq 20
      // 11: goto 15
      // 14: athrow
      // 15: aload 0
      // 16: goto 1a
      // 19: athrow
      // 1a: getfield qeaa361f143ee4a0894bd168fd9b30c66/qf4ccf8f5435d4a78bdca4d6a018b578e/bbabbaaa.bba Lnet/minecraft/class_745;
      // 1d: ifnonnull 22
      // 20: return
      // 21: athrow
      // 22: fload 3
      // 23: fload 1
      // 24: fsub
      // 25: invokestatic net/minecraft/class_3532.method_15393 (F)F
      // 28: fstore 6
      // 2a: fload 4
      // 2c: fload 2
      // 2d: fsub
      // 2e: fstore 7
      // 30: aload 0
      // 31: aload 0
      // 32: getfield qeaa361f143ee4a0894bd168fd9b30c66/qf4ccf8f5435d4a78bdca4d6a018b578e/bbabbaaa.aa F
      // 35: putfield qeaa361f143ee4a0894bd168fd9b30c66/qf4ccf8f5435d4a78bdca4d6a018b578e/bbabbaaa.bb F
      // 38: aload 0
      // 39: aload 0
      // 3a: getfield qeaa361f143ee4a0894bd168fd9b30c66/qf4ccf8f5435d4a78bdca4d6a018b578e/bbabbaaa.aaaa F
      // 3d: putfield qeaa361f143ee4a0894bd168fd9b30c66/qf4ccf8f5435d4a78bdca4d6a018b578e/bbabbaaa.aaba F
      // 40: aload 0
      // 41: dup
      // 42: getfield qeaa361f143ee4a0894bd168fd9b30c66/qf4ccf8f5435d4a78bdca4d6a018b578e/bbabbaaa.aa F
      // 45: fload 6
      // 47: fadd
      // 48: putfield qeaa361f143ee4a0894bd168fd9b30c66/qf4ccf8f5435d4a78bdca4d6a018b578e/bbabbaaa.aa F
      // 4b: aload 0
      // 4c: aload 0
      // 4d: getfield qeaa361f143ee4a0894bd168fd9b30c66/qf4ccf8f5435d4a78bdca4d6a018b578e/bbabbaaa.aaaa F
      // 50: fload 7
      // 52: fadd
      // 53: ldc -90.0
      // 55: ldc 90.0
      // 57: invokestatic net/minecraft/class_3532.method_15363 (FFF)F
      // 5a: putfield qeaa361f143ee4a0894bd168fd9b30c66/qf4ccf8f5435d4a78bdca4d6a018b578e/bbabbaaa.aaaa F
      // 5d: aload 0
      // 5e: getfield qeaa361f143ee4a0894bd168fd9b30c66/qf4ccf8f5435d4a78bdca4d6a018b578e/bbabbaaa.bba Lnet/minecraft/class_745;
      // 61: aload 0
      // 62: getfield qeaa361f143ee4a0894bd168fd9b30c66/qf4ccf8f5435d4a78bdca4d6a018b578e/bbabbaaa.aa F
      // 65: invokevirtual net/minecraft/class_745.method_36456 (F)V
      // 68: aload 0
      // 69: getfield qeaa361f143ee4a0894bd168fd9b30c66/qf4ccf8f5435d4a78bdca4d6a018b578e/bbabbaaa.bba Lnet/minecraft/class_745;
      // 6c: aload 0
      // 6d: getfield qeaa361f143ee4a0894bd168fd9b30c66/qf4ccf8f5435d4a78bdca4d6a018b578e/bbabbaaa.aaaa F
      // 70: invokevirtual net/minecraft/class_745.method_36457 (F)V
      // 73: return
   }

   public class_243 ab(float param1) {
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
      // 06: ifne 19
      // 09: getfield qeaa361f143ee4a0894bd168fd9b30c66/qf4ccf8f5435d4a78bdca4d6a018b578e/bbabbaaa.bbb Lnet/minecraft/class_243;
      // 0c: ifnonnull 18
      // 0f: goto 13
      // 12: athrow
      // 13: getstatic net/minecraft/class_243.field_1353 Lnet/minecraft/class_243;
      // 16: areturn
      // 17: athrow
      // 18: aload 0
      // 19: iload 2
      // 1a: ifne 2e
      // 1d: getfield qeaa361f143ee4a0894bd168fd9b30c66/qf4ccf8f5435d4a78bdca4d6a018b578e/bbabbaaa.aabb Lnet/minecraft/class_243;
      // 20: ifnonnull 2d
      // 23: goto 27
      // 26: athrow
      // 27: aload 0
      // 28: getfield qeaa361f143ee4a0894bd168fd9b30c66/qf4ccf8f5435d4a78bdca4d6a018b578e/bbabbaaa.bbb Lnet/minecraft/class_243;
      // 2b: areturn
      // 2c: athrow
      // 2d: aload 0
      // 2e: getfield qeaa361f143ee4a0894bd168fd9b30c66/qf4ccf8f5435d4a78bdca4d6a018b578e/bbabbaaa.aabb Lnet/minecraft/class_243;
      // 31: aload 0
      // 32: getfield qeaa361f143ee4a0894bd168fd9b30c66/qf4ccf8f5435d4a78bdca4d6a018b578e/bbabbaaa.bbb Lnet/minecraft/class_243;
      // 35: fload 1
      // 36: fconst_0
      // 37: fconst_1
      // 38: invokestatic net/minecraft/class_3532.method_15363 (FFF)F
      // 3b: f2d
      // 3c: invokevirtual net/minecraft/class_243.method_35590 (Lnet/minecraft/class_243;D)Lnet/minecraft/class_243;
      // 3f: areturn
   }

   private static void ba() {
      int var0 = 1564221103;
      ab[0] = aba(
         aab(a(-867778900, var0 ^ 64555099), a(-867778899, var0 ^ -2085372782)).toCharArray(),
         bbb(a(-867778898, var0 ^ -539317385), 7387894866167551353L),
         bb(a(-867778897, var0 ^ -1901561605), 3007935846026598436L)
      );
      ab[1] = aba(
         aab(a(-867778912, var0 ^ -947608153), a(-867778911, var0 ^ -1738615351)).toCharArray(),
         bbb(a(-867778910, var0 ^ -2101924812), 7994353491967483041L),
         bb(a(-867778909, var0 ^ 556871374), 6601988449648300626L)
      );
      ab[2] = aba(
         aab(a(-867778908, var0 ^ 229563957), a(-867778907, var0 ^ -1400244772)).toCharArray(),
         bbb(a(-867778906, var0 ^ 3489437), 7849548278235470204L),
         bb(a(-867778905, var0 ^ -688856559), 2308231965399982733L)
      );
   }

   private static int bb(int var0, long var1) {
      int var3 = var0 ^ (int)(var1 & 32767L) ^ a(-867778888, 1981792092 ^ 2113318122);
      if (aba[var3] == null) {
         aba[var3] = (int)(abb[var3] ^ var1);
      }

      return aba[var3];
   }

   public boolean aaa(class_1297 param1) {
      // $VF: Couldn't be decompiled
      // Please report this to the Vineflower issue tracker, at https://github.com/Vineflower/vineflower/issues with a copy of the class file (if you have the rights to distribute it!)
      // java.lang.RuntimeException: parsing failure!
      //   at org.jetbrains.java.decompiler.modules.decompiler.decompose.DomHelper.parseGraph(DomHelper.java:211)
      //   at org.jetbrains.java.decompiler.main.rels.MethodProcessor.codeToJava(MethodProcessor.java:166)
      //
      // Bytecode:
      // 00: aload 0
      // 01: invokevirtual qeaa361f143ee4a0894bd168fd9b30c66/qf4ccf8f5435d4a78bdca4d6a018b578e/bbabbaaa.babbaab ()Z
      // 04: ifeq 1f
      // 07: aload 1
      // 08: ifnull 1f
      // 0b: goto 0f
      // 0e: athrow
      // 0f: aload 0
      // 10: getfield qeaa361f143ee4a0894bd168fd9b30c66/qf4ccf8f5435d4a78bdca4d6a018b578e/bbabbaaa.bbb Lnet/minecraft/class_243;
      // 13: ifnull 1f
      // 16: goto 1a
      // 19: athrow
      // 1a: bipush 1
      // 1b: goto 20
      // 1e: athrow
      // 1f: bipush 0
      // 20: ireturn
   }

   private static String aab(int var0, int var1) {
      int var9 = -1019621278;
      int var2 = (var0 ^ a(-867778887, var9 ^ -1474465870)) & a(-867778886, var9 ^ -1559743871);
      if (bab[var2] == null) {
         char[] var3 = aab[var2].toCharArray();

         int var4 = switch (var3[0] & a(-867778885, var9 ^ -1517763269)) {
            case 0 -> a(-867778884, var9 ^ -934985592);
            case 1 -> a(-867778883, var9 ^ 813567588);
            case 2 -> a(-867778882, var9 ^ 1645079322);
            case 3 -> a(-867778881, var9 ^ 379038591);
            case 4 -> a(-867778896, var9 ^ -866334666);
            case 5 -> a(-867778895, var9 ^ -1729389173);
            case 6 -> a(-867778894, var9 ^ -751536817);
            case 7 -> a(-867778893, var9 ^ 2027541824);
            case 8 -> a(-867778892, var9 ^ -883751276);
            case 9 -> a(-867778891, var9 ^ -301415617);
            case 10 -> a(-867778890, var9 ^ -2006654505);
            case 11 -> a(-867778889, var9 ^ 1067569713);
            case 12 -> a(-867778872, var9 ^ 1116714513);
            case 13 -> a(-867778871, var9 ^ -948631664);
            case 14 -> a(-867778870, var9 ^ 1548234567);
            case 15 -> a(-867778869, var9 ^ -1203250217);
            case 16 -> a(-867778868, var9 ^ 948108564);
            case 17 -> a(-867778867, var9 ^ 609862586);
            case 18 -> a(-867778866, var9 ^ -1885507258);
            case 19 -> a(-867778865, var9 ^ -714489104);
            case 20 -> a(-867778880, var9 ^ -416423853);
            case 21 -> a(-867778879, var9 ^ -1118397221);
            case 22 -> a(-867778878, var9 ^ -227636386);
            case 23 -> a(-867778877, var9 ^ -584103649);
            case 24 -> a(-867778876, var9 ^ -1277123255);
            case 25 -> a(-867778875, var9 ^ -1290148547);
            case 26 -> a(-867778874, var9 ^ -2087149538);
            case 27 -> a(-867778873, var9 ^ -1190076887);
            case 28 -> a(-867778856, var9 ^ 1605597577);
            case 29 -> a(-867778855, var9 ^ -1232127254);
            case 30 -> a(-867778854, var9 ^ -235836244);
            case 31 -> a(-867778853, var9 ^ 1721634894);
            case 32 -> a(-867778852, var9 ^ -1960027945);
            case 33 -> a(-867778851, var9 ^ -644308414);
            case 34 -> a(-867778850, var9 ^ -1861708473);
            case 35 -> a(-867778849, var9 ^ -1479991490);
            case 36 -> a(-867778864, var9 ^ -169803089);
            case 37 -> a(-867778863, var9 ^ -1455697566);
            case 38 -> a(-867778862, var9 ^ 1991354578);
            case 39 -> a(-867778861, var9 ^ -2081729563);
            case 40 -> a(-867778860, var9 ^ -2109912072);
            case 41 -> a(-867778859, var9 ^ 1278570105);
            case 42 -> a(-867778858, var9 ^ 1652675508);
            case 43 -> a(-867778857, var9 ^ -1769980214);
            case 44 -> a(-867778840, var9 ^ -2064042355);
            case 45 -> a(-867778839, var9 ^ 83133108);
            case 46 -> a(-867778838, var9 ^ -1941433720);
            case 47 -> a(-867778837, var9 ^ 329242787);
            case 48 -> a(-867778836, var9 ^ -155838820);
            case 49 -> a(-867778835, var9 ^ 643953663);
            case 50 -> a(-867778834, var9 ^ 2048308806);
            case 51 -> a(-867778833, var9 ^ 1879651403);
            case 52 -> a(-867778848, var9 ^ -739843249);
            case 53 -> a(-867778847, var9 ^ -1295309226);
            case 54 -> a(-867778846, var9 ^ -1681707378);
            case 55 -> a(-867778845, var9 ^ -2111988900);
            case 56 -> a(-867778844, var9 ^ 1145302996);
            case 57 -> a(-867778843, var9 ^ 960758423);
            case 58 -> a(-867778842, var9 ^ 2045057935);
            case 59 -> a(-867778841, var9 ^ -1091146721);
            case 60 -> a(-867778824, var9 ^ -1561941724);
            case 61 -> a(-867778823, var9 ^ 2048241384);
            case 62 -> a(-867778822, var9 ^ 419413690);
            case 63 -> a(-867778821, var9 ^ -2101433978);
            case 64 -> a(-867778820, var9 ^ 632981160);
            case 65 -> a(-867778819, var9 ^ 2050717930);
            case 66 -> 5;
            case 67 -> a(-867778818, var9 ^ 1067790828);
            case 68 -> a(-867778817, var9 ^ 2103286140);
            case 69 -> a(-867778832, var9 ^ -1580844216);
            case 70 -> a(-867778831, var9 ^ 1994049744);
            case 71 -> a(-867778830, var9 ^ -979135301);
            case 72 -> a(-867778829, var9 ^ 2084011634);
            case 73 -> a(-867778828, var9 ^ 1464746677);
            case 74 -> a(-867778827, var9 ^ 900602882);
            case 75 -> a(-867778826, var9 ^ -1068400890);
            case 76 -> a(-867778825, var9 ^ 2057215300);
            case 77 -> a(-867779064, var9 ^ -2094451002);
            case 78 -> a(-867779063, var9 ^ -397635313);
            case 79 -> a(-867779062, var9 ^ -1389880474);
            case 80 -> a(-867779061, var9 ^ 737834769);
            case 81 -> a(-867779060, var9 ^ 1229055192);
            case 82 -> a(-867779059, var9 ^ -1682895569);
            case 83 -> a(-867779058, var9 ^ 743165053);
            case 84 -> a(-867779057, var9 ^ -86149756);
            case 85 -> a(-867779072, var9 ^ 636681729);
            case 86 -> a(-867779071, var9 ^ -778126908);
            case 87 -> a(-867779070, var9 ^ -742423721);
            case 88 -> a(-867779069, var9 ^ -783770902);
            case 89 -> a(-867779068, var9 ^ 274261361);
            case 90 -> a(-867779067, var9 ^ 1493892547);
            case 91 -> a(-867779066, var9 ^ 1482608552);
            case 92 -> a(-867779065, var9 ^ -326349888);
            case 93 -> a(-867779048, var9 ^ 224586983);
            case 94 -> 2;
            case 95 -> a(-867779047, var9 ^ 863784496);
            case 96 -> a(-867779046, var9 ^ -1615704807);
            case 97 -> a(-867779045, var9 ^ -1679206019);
            case 98 -> a(-867779044, var9 ^ -1675451462);
            case 99 -> a(-867779043, var9 ^ -648689005);
            case 100 -> a(-867779042, var9 ^ -1432419609);
            case 101 -> a(-867779041, var9 ^ 224660554);
            case 102 -> a(-867779056, var9 ^ -1413899130);
            case 103 -> a(-867779055, var9 ^ 2070209348);
            case 104 -> a(-867779054, var9 ^ -1764124962);
            case 105 -> a(-867779053, var9 ^ -1163822405);
            case 106 -> a(-867779052, var9 ^ 663588500);
            case 107 -> a(-867779051, var9 ^ 2077768512);
            case 108 -> a(-867779050, var9 ^ 2138116878);
            case 109 -> a(-867779049, var9 ^ 390423027);
            case 110 -> a(-867779032, var9 ^ -571392294);
            case 111 -> a(-867779031, var9 ^ 612433923);
            case 112 -> a(-867779030, var9 ^ 472842341);
            case 113 -> a(-867779029, var9 ^ -1003687998);
            case 114 -> a(-867779028, var9 ^ 1480701843);
            case 115 -> a(-867779027, var9 ^ -521150617);
            case 116 -> a(-867779026, var9 ^ -1762318955);
            case 117 -> a(-867779025, var9 ^ 666406771);
            case 118 -> a(-867779040, var9 ^ -443874347);
            case 119 -> a(-867779039, var9 ^ 637124015);
            case 120 -> a(-867779038, var9 ^ -1749172553);
            case 121 -> a(-867779037, var9 ^ 1102683899);
            case 122 -> a(-867779036, var9 ^ 616634125);
            case 123 -> a(-867779035, var9 ^ 1229139934);
            case 124 -> a(-867779034, var9 ^ -679968251);
            case 125 -> a(-867779033, var9 ^ 309064692);
            case 126 -> a(-867779016, var9 ^ -1129473623);
            case 127 -> a(-867779015, var9 ^ -1241075597);
            case 128 -> a(-867779014, var9 ^ 647899974);
            case 129 -> a(-867779013, var9 ^ -834598522);
            case 130 -> a(-867779012, var9 ^ -1631998895);
            case 131 -> a(-867779011, var9 ^ -2040881854);
            case 132 -> a(-867779010, var9 ^ -1400636619);
            case 133 -> a(-867779009, var9 ^ 375163194);
            case 134 -> a(-867779024, var9 ^ -340261338);
            case 135 -> a(-867779023, var9 ^ -1800116749);
            case 136 -> a(-867779022, var9 ^ 1649379256);
            case 137 -> a(-867779021, var9 ^ -1876586841);
            case 138 -> a(-867779020, var9 ^ -1566949970);
            case 139 -> a(-867779019, var9 ^ 196115512);
            case 140 -> a(-867779018, var9 ^ -1866705217);
            case 141 -> a(-867779017, var9 ^ 1411015871);
            case 142 -> a(-867779000, var9 ^ 1041013674);
            case 143 -> a(-867778999, var9 ^ -1801308118);
            case 144 -> a(-867778998, var9 ^ -118119613);
            case 145 -> a(-867778997, var9 ^ -679744726);
            case 146 -> a(-867778996, var9 ^ -613884985);
            case 147 -> a(-867778995, var9 ^ 1314992788);
            case 148 -> 4;
            case 149 -> a(-867778994, var9 ^ -992051825);
            case 150 -> a(-867778993, var9 ^ -1448352571);
            case 151 -> a(-867779008, var9 ^ 1980677692);
            case 152 -> a(-867779007, var9 ^ 510338521);
            case 153 -> a(-867779006, var9 ^ -792504697);
            case 154 -> a(-867779005, var9 ^ -1173968875);
            case 155 -> a(-867779004, var9 ^ -2040494546);
            case 156 -> a(-867779003, var9 ^ -1542187366);
            case 157 -> a(-867779002, var9 ^ 1912897223);
            case 158 -> a(-867779001, var9 ^ -586047695);
            case 159 -> a(-867778984, var9 ^ 1622480632);
            case 160 -> a(-867778983, var9 ^ 126827593);
            case 161 -> a(-867778982, var9 ^ -1791626442);
            case 162 -> a(-867778981, var9 ^ -1048214511);
            case 163 -> a(-867778980, var9 ^ -1626737949);
            case 164 -> a(-867778979, var9 ^ 1060384582);
            case 165 -> a(-867778978, var9 ^ -161951014);
            case 166 -> a(-867778977, var9 ^ -959799880);
            case 167 -> a(-867778992, var9 ^ -110773516);
            case 168 -> a(-867778991, var9 ^ 346358650);
            case 169 -> a(-867778990, var9 ^ -554627375);
            case 170 -> a(-867778989, var9 ^ 1571666523);
            case 171 -> a(-867778988, var9 ^ -1617501301);
            case 172 -> a(-867778987, var9 ^ -1352018951);
            case 173 -> a(-867778986, var9 ^ 1439225178);
            case 174 -> a(-867778985, var9 ^ 1599740731);
            case 175 -> a(-867778968, var9 ^ 1097969656);
            case 176 -> a(-867778967, var9 ^ 1301182320);
            case 177 -> a(-867778966, var9 ^ 237989564);
            case 178 -> a(-867778965, var9 ^ 931665559);
            case 179 -> a(-867778964, var9 ^ -224240733);
            case 180 -> 0;
            case 181 -> a(-867778963, var9 ^ -68136495);
            case 182 -> a(-867778962, var9 ^ -1599741240);
            case 183 -> a(-867778961, var9 ^ -502950813);
            case 184 -> a(-867778976, var9 ^ -371077986);
            case 185 -> a(-867778975, var9 ^ 579338871);
            case 186 -> a(-867778974, var9 ^ 85234295);
            case 187 -> a(-867778973, var9 ^ -723601066);
            case 188 -> a(-867778972, var9 ^ 2126332096);
            case 189 -> a(-867778971, var9 ^ 980828856);
            case 190 -> a(-867778970, var9 ^ 1642226753);
            case 191 -> a(-867778969, var9 ^ -1784731081);
            case 192 -> a(-867778952, var9 ^ -1009182655);
            case 193 -> a(-867778951, var9 ^ 1917439994);
            case 194 -> a(-867778950, var9 ^ -760915579);
            case 195 -> a(-867778949, var9 ^ 1797944261);
            case 196 -> a(-867778948, var9 ^ 1413816798);
            case 197 -> a(-867778947, var9 ^ -203631094);
            case 198 -> a(-867778946, var9 ^ -1747212796);
            case 199 -> a(-867778945, var9 ^ -41230134);
            case 200 -> a(-867778960, var9 ^ 426252970);
            case 201 -> a(-867778959, var9 ^ -2041562570);
            case 202 -> a(-867778958, var9 ^ 430715694);
            case 203 -> a(-867778957, var9 ^ -14223110);
            case 204 -> a(-867778956, var9 ^ 1138129531);
            case 205 -> a(-867778955, var9 ^ 1131415789);
            case 206 -> a(-867778954, var9 ^ 534836445);
            case 207 -> a(-867778953, var9 ^ 1457910690);
            case 208 -> 3;
            case 209 -> a(-867778680, var9 ^ 453431370);
            case 210 -> a(-867778679, var9 ^ -796208017);
            case 211 -> a(-867778678, var9 ^ -1209845088);
            case 212 -> a(-867778677, var9 ^ -989061330);
            case 213 -> a(-867778676, var9 ^ 1280872565);
            case 214 -> a(-867778675, var9 ^ 1520713435);
            case 215 -> a(-867778674, var9 ^ 755864588);
            case 216 -> a(-867778673, var9 ^ 663528725);
            case 217 -> a(-867778688, var9 ^ -461195459);
            case 218 -> a(-867778687, var9 ^ 242537814);
            case 219 -> a(-867778686, var9 ^ -1959538205);
            case 220 -> a(-867778685, var9 ^ 831632396);
            case 221 -> a(-867778684, var9 ^ -1015253109);
            case 222 -> a(-867778683, var9 ^ -1808776294);
            case 223 -> a(-867778682, var9 ^ -1197530666);
            case 224 -> a(-867778681, var9 ^ 1585716695);
            case 225 -> a(-867778664, var9 ^ -2053697634);
            case 226 -> a(-867778663, var9 ^ 1673703183);
            case 227 -> a(-867778662, var9 ^ 263764332);
            case 228 -> a(-867778661, var9 ^ -803164492);
            case 229 -> a(-867778660, var9 ^ -1810259996);
            case 230 -> a(-867778659, var9 ^ 1729100370);
            case 231 -> a(-867778658, var9 ^ -1674829703);
            case 232 -> a(-867778657, var9 ^ -872326759);
            case 233 -> a(-867778672, var9 ^ -382099081);
            case 234 -> a(-867778671, var9 ^ 557156727);
            case 235 -> a(-867778670, var9 ^ 785412932);
            case 236 -> a(-867778669, var9 ^ -380098297);
            case 237 -> a(-867778668, var9 ^ -1729897323);
            case 238 -> a(-867778667, var9 ^ -824524271);
            case 239 -> a(-867778666, var9 ^ 700583456);
            case 240 -> a(-867778665, var9 ^ -1442718933);
            case 241 -> a(-867778648, var9 ^ -1682135270);
            case 242 -> a(-867778647, var9 ^ 1858636167);
            case 243 -> a(-867778646, var9 ^ -2013874427);
            case 244 -> a(-867778645, var9 ^ -1850694745);
            case 245 -> a(-867778644, var9 ^ -2067283235);
            case 246 -> 1;
            case 247 -> a(-867778643, var9 ^ 1512222470);
            case 248 -> a(-867778642, var9 ^ 1754355293);
            case 249 -> a(-867778641, var9 ^ 1784120022);
            case 250 -> a(-867778656, var9 ^ 112958308);
            case 251 -> a(-867778655, var9 ^ -2010589967);
            case 252 -> a(-867778654, var9 ^ 334247013);
            case 253 -> a(-867778653, var9 ^ -311655977);
            case 254 -> a(-867778652, var9 ^ 1136712756);
            default -> a(-867778651, var9 ^ -834341418);
         };
         int var5 = (var1 & a(-867778650, var9 ^ 922419796)) - var4;
         if (var5 < 0) {
            var5 += 256;
         }

         int var6 = ((var1 & a(-867778649, var9 ^ 676891205)) >>> a(-867778632, var9 ^ -270972903)) - var4;
         if (var6 < 0) {
            var6 += 256;
         }

         for (int var7 = 0; var7 < var3.length; var7++) {
            int var8 = var7 % 2;
            char var10002 = var3[var7];
            if (var8 == 0) {
               var3[var7] = (char)(var10002 ^ var5);
               var5 = ((var5 >>> 3 | var5 << 5) ^ var3[var7]) & a(-867778631, var9 ^ 928328841);
            } else {
               var3[var7] = (char)(var10002 ^ var6);
               var6 = ((var6 >>> 3 | var6 << 5) ^ var3[var7]) & a(-867778630, var9 ^ -780298743);
            }
         }

         bab[var2] = new String(var3).intern();
      }

      return bab[var2];
   }

   private static String b(int var0, byte var1, int var2, char var3, char var4) {
      int var9 = var2 ^ 482145364;
      char[] var8 = abab[var9].toCharArray();
      StackTraceElement[] var10 = (StackTraceElement[])abba[var9];
      StackTraceElement[] var11;
      if (var10 != null) {
         var11 = var10;
      } else {
         var11 = new Throwable().getStackTrace();
         abba[var9] = var11;
      }

      StackTraceElement var12 = var11[1];
      int var6 = (var12.getClassName().hashCode() ^ var12.getMethodName().hashCode()) >> 16 ^ 11243;
      int var7 = 0;

      do {
         var8[var7] = (char)(var8[var7] ^ 30007 ^ switch (var7 % 6) {
            default -> 9;
            case 1 -> 79;
            case 2 -> 125;
            case 3 -> 227;
            case 4 -> 187;
            case 5 -> 194;
         } ^ var6 ^ var0 ^ var4 ^ var3 ^ var2 ^ var1);
      } while (++var7 < var8.length);

      return new String(var8).intern();
   }

   private static String aba(char[] var0, long var1, int var3) {
      int var4 = bb(a(-867778629, 1056975677 ^ -174734717), 2238135520641256128L) ^ var3;

      for (int var5 = 0; var5 < var0.length; var5++) {
         int var7 = var4 ^ (int)var1 ^ ~var5;
         int var8 = var7 ^ var3 - var5 * var0.length;
         var4 = -var8 * var3 | var5;
         var0[var5] = (char)(var0[var5] ^ var4);
         int var6 = var5 & bb(a(-867778628, 1056975677 ^ -1208099272), 6408821757346449548L);
         var3 = var3 << var6 | var3 >>> -var6;
         var1 ^= var6;
      }

      return new String(var0);
   }

   public float abb(float var1) {
      return class_3532.method_17821(class_3532.method_15363(var1, 0.0F, 1.0F), this.bb, this.aa);
   }

   public bbabbaaa() {
      super(
         aabbaaaba.aaab(ab[2]),
         bbaabbba.bab,
         aabbaaaba.aaab(ab[1])
      );
      this.baa = (bababa)this.abbbaaa(
         new bababa(aabbaaaba.aaab(ab[0]), 1.0, 0.1, 10.0, 0.1)
      );
   }

   private void bab(class_310 param1) {
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
      // 05: ifnull 56
      // 08: aload 0
      // 09: iload 2
      // 0a: ifne 5c
      // 0d: goto 11
      // 10: athrow
      // 11: getfield qeaa361f143ee4a0894bd168fd9b30c66/qf4ccf8f5435d4a78bdca4d6a018b578e/bbabbaaa.bba Lnet/minecraft/class_745;
      // 14: ifnull 56
      // 17: goto 1b
      // 1a: athrow
      // 1b: aload 1
      // 1c: invokestatic qeaa361f143ee4a0894bd168fd9b30c66/qf4ccf8f5435d4a78bdca4d6a018b578e/aabbabbbb.baba (Lnet/minecraft/class_310;)Lnet/minecraft/class_1297;
      // 1f: iload 2
      // 20: ifne 42
      // 23: goto 27
      // 26: athrow
      // 27: aload 0
      // 28: getfield qeaa361f143ee4a0894bd168fd9b30c66/qf4ccf8f5435d4a78bdca4d6a018b578e/bbabbaaa.bba Lnet/minecraft/class_745;
      // 2b: if_acmpne 56
      // 2e: goto 32
      // 31: athrow
      // 32: aload 0
      // 33: iload 2
      // 34: ifne 46
      // 37: goto 3b
      // 3a: athrow
      // 3b: getfield qeaa361f143ee4a0894bd168fd9b30c66/qf4ccf8f5435d4a78bdca4d6a018b578e/bbabbaaa.aaab Lnet/minecraft/class_1297;
      // 3e: goto 42
      // 41: athrow
      // 42: ifnull 4c
      // 45: aload 0
      // 46: getfield qeaa361f143ee4a0894bd168fd9b30c66/qf4ccf8f5435d4a78bdca4d6a018b578e/bbabbaaa.aaab Lnet/minecraft/class_1297;
      // 49: goto 50
      // 4c: aload 1
      // 4d: getfield net/minecraft/class_310.field_1724 Lnet/minecraft/class_746;
      // 50: astore 3
      // 51: aload 1
      // 52: aload 3
      // 53: invokestatic qeaa361f143ee4a0894bd168fd9b30c66/qf4ccf8f5435d4a78bdca4d6a018b578e/aabbabbbb.abbaba (Lnet/minecraft/class_310;Lnet/minecraft/class_1297;)V
      // 56: aload 0
      // 57: aconst_null
      // 58: putfield qeaa361f143ee4a0894bd168fd9b30c66/qf4ccf8f5435d4a78bdca4d6a018b578e/bbabbaaa.bba Lnet/minecraft/class_745;
      // 5b: aload 0
      // 5c: aconst_null
      // 5d: putfield qeaa361f143ee4a0894bd168fd9b30c66/qf4ccf8f5435d4a78bdca4d6a018b578e/bbabbaaa.aaab Lnet/minecraft/class_1297;
      // 60: return
   }

   @Override
   public void abaab() {
      // $VF: Couldn't be decompiled
      // Please report this to the Vineflower issue tracker, at https://github.com/Vineflower/vineflower/issues with a copy of the class file (if you have the rights to distribute it!)
      // java.lang.RuntimeException: parsing failure!
      //   at org.jetbrains.java.decompiler.modules.decompiler.decompose.DomHelper.parseGraph(DomHelper.java:211)
      //   at org.jetbrains.java.decompiler.main.rels.MethodProcessor.codeToJava(MethodProcessor.java:166)
      //
      // Bytecode:
      // 00: getstatic qeaa361f143ee4a0894bd168fd9b30c66/qf4ccf8f5435d4a78bdca4d6a018b578e/baaabbaa.bba I
      // 03: istore 1
      // 04: invokestatic net/minecraft/class_310.method_1551 ()Lnet/minecraft/class_310;
      // 07: astore 2
      // 08: aload 0
      // 09: iload 1
      // 0a: ifne 36
      // 0d: aload 2
      // 0e: invokevirtual qeaa361f143ee4a0894bd168fd9b30c66/qf4ccf8f5435d4a78bdca4d6a018b578e/bbabbaaa.bab (Lnet/minecraft/class_310;)V
      // 11: aload 2
      // 12: ifnull 2c
      // 15: goto 19
      // 18: athrow
      // 19: aload 2
      // 1a: iload 1
      // 1b: ifne a7
      // 1e: goto 22
      // 21: athrow
      // 22: getfield net/minecraft/class_310.field_1724 Lnet/minecraft/class_746;
      // 25: ifnonnull 3b
      // 28: goto 2c
      // 2b: athrow
      // 2c: aload 0
      // 2d: aconst_null
      // 2e: putfield qeaa361f143ee4a0894bd168fd9b30c66/qf4ccf8f5435d4a78bdca4d6a018b578e/bbabbaaa.bbb Lnet/minecraft/class_243;
      // 31: aload 0
      // 32: goto 36
      // 35: athrow
      // 36: aconst_null
      // 37: putfield qeaa361f143ee4a0894bd168fd9b30c66/qf4ccf8f5435d4a78bdca4d6a018b578e/bbabbaaa.aabb Lnet/minecraft/class_243;
      // 3a: return
      // 3b: aload 0
      // 3c: aload 2
      // 3d: getfield net/minecraft/class_310.field_1724 Lnet/minecraft/class_746;
      // 40: fconst_1
      // 41: invokevirtual net/minecraft/class_746.method_5836 (F)Lnet/minecraft/class_243;
      // 44: putfield qeaa361f143ee4a0894bd168fd9b30c66/qf4ccf8f5435d4a78bdca4d6a018b578e/bbabbaaa.bbb Lnet/minecraft/class_243;
      // 47: aload 0
      // 48: aload 0
      // 49: getfield qeaa361f143ee4a0894bd168fd9b30c66/qf4ccf8f5435d4a78bdca4d6a018b578e/bbabbaaa.bbb Lnet/minecraft/class_243;
      // 4c: putfield qeaa361f143ee4a0894bd168fd9b30c66/qf4ccf8f5435d4a78bdca4d6a018b578e/bbabbaaa.aabb Lnet/minecraft/class_243;
      // 4f: aload 0
      // 50: aload 2
      // 51: getfield net/minecraft/class_310.field_1724 Lnet/minecraft/class_746;
      // 54: invokevirtual net/minecraft/class_746.method_36454 ()F
      // 57: putfield qeaa361f143ee4a0894bd168fd9b30c66/qf4ccf8f5435d4a78bdca4d6a018b578e/bbabbaaa.aa F
      // 5a: aload 0
      // 5b: aload 0
      // 5c: getfield qeaa361f143ee4a0894bd168fd9b30c66/qf4ccf8f5435d4a78bdca4d6a018b578e/bbabbaaa.aa F
      // 5f: putfield qeaa361f143ee4a0894bd168fd9b30c66/qf4ccf8f5435d4a78bdca4d6a018b578e/bbabbaaa.bb F
      // 62: aload 0
      // 63: aload 2
      // 64: getfield net/minecraft/class_310.field_1724 Lnet/minecraft/class_746;
      // 67: invokevirtual net/minecraft/class_746.method_36455 ()F
      // 6a: putfield qeaa361f143ee4a0894bd168fd9b30c66/qf4ccf8f5435d4a78bdca4d6a018b578e/bbabbaaa.aaaa F
      // 6d: aload 0
      // 6e: aload 0
      // 6f: getfield qeaa361f143ee4a0894bd168fd9b30c66/qf4ccf8f5435d4a78bdca4d6a018b578e/bbabbaaa.aaaa F
      // 72: putfield qeaa361f143ee4a0894bd168fd9b30c66/qf4ccf8f5435d4a78bdca4d6a018b578e/bbabbaaa.aaba F
      // 75: aload 0
      // 76: aload 2
      // 77: invokestatic qeaa361f143ee4a0894bd168fd9b30c66/qf4ccf8f5435d4a78bdca4d6a018b578e/aabbabbbb.baba (Lnet/minecraft/class_310;)Lnet/minecraft/class_1297;
      // 7a: putfield qeaa361f143ee4a0894bd168fd9b30c66/qf4ccf8f5435d4a78bdca4d6a018b578e/bbabbaaa.aaab Lnet/minecraft/class_1297;
      // 7d: aload 0
      // 7e: new net/minecraft/class_745
      // 81: dup
      // 82: aload 2
      // 83: getfield net/minecraft/class_310.field_1687 Lnet/minecraft/class_638;
      // 86: aload 2
      // 87: getfield net/minecraft/class_310.field_1724 Lnet/minecraft/class_746;
      // 8a: invokevirtual net/minecraft/class_746.method_7334 ()Lcom/mojang/authlib/GameProfile;
      // 8d: invokespecial net/minecraft/class_745.<init> (Lnet/minecraft/class_638;Lcom/mojang/authlib/GameProfile;)V
      // 90: putfield qeaa361f143ee4a0894bd168fd9b30c66/qf4ccf8f5435d4a78bdca4d6a018b578e/bbabbaaa.bba Lnet/minecraft/class_745;
      // 93: aload 0
      // 94: getfield qeaa361f143ee4a0894bd168fd9b30c66/qf4ccf8f5435d4a78bdca4d6a018b578e/bbabbaaa.bba Lnet/minecraft/class_745;
      // 97: aload 2
      // 98: getfield net/minecraft/class_310.field_1724 Lnet/minecraft/class_746;
      // 9b: invokevirtual net/minecraft/class_745.method_5719 (Lnet/minecraft/class_1297;)V
      // 9e: aload 0
      // 9f: getfield qeaa361f143ee4a0894bd168fd9b30c66/qf4ccf8f5435d4a78bdca4d6a018b578e/bbabbaaa.bba Lnet/minecraft/class_745;
      // a2: bipush 1
      // a3: putfield net/minecraft/class_745.field_5960 Z
      // a6: aload 2
      // a7: aload 0
      // a8: getfield qeaa361f143ee4a0894bd168fd9b30c66/qf4ccf8f5435d4a78bdca4d6a018b578e/bbabbaaa.bba Lnet/minecraft/class_745;
      // ab: invokestatic qeaa361f143ee4a0894bd168fd9b30c66/qf4ccf8f5435d4a78bdca4d6a018b578e/aabbabbbb.abbaba (Lnet/minecraft/class_310;Lnet/minecraft/class_1297;)V
      // ae: return
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
      // 000: getstatic qeaa361f143ee4a0894bd168fd9b30c66/qf4ccf8f5435d4a78bdca4d6a018b578e/baaabbaa.bba I
      // 003: istore 1
      // 004: invokestatic net/minecraft/class_310.method_1551 ()Lnet/minecraft/class_310;
      // 007: astore 2
      // 008: iload 1
      // 009: ifne 032
      // 00c: aload 2
      // 00d: ifnull 01f
      // 010: goto 014
      // 013: athrow
      // 014: aload 2
      // 015: getfield net/minecraft/class_310.field_1724 Lnet/minecraft/class_746;
      // 018: ifnonnull 033
      // 01b: goto 01f
      // 01e: athrow
      // 01f: aload 0
      // 020: aload 2
      // 021: invokevirtual qeaa361f143ee4a0894bd168fd9b30c66/qf4ccf8f5435d4a78bdca4d6a018b578e/bbabbaaa.bab (Lnet/minecraft/class_310;)V
      // 024: aload 0
      // 025: aconst_null
      // 026: putfield qeaa361f143ee4a0894bd168fd9b30c66/qf4ccf8f5435d4a78bdca4d6a018b578e/bbabbaaa.bbb Lnet/minecraft/class_243;
      // 029: aload 0
      // 02a: aconst_null
      // 02b: putfield qeaa361f143ee4a0894bd168fd9b30c66/qf4ccf8f5435d4a78bdca4d6a018b578e/bbabbaaa.aabb Lnet/minecraft/class_243;
      // 02e: goto 032
      // 031: athrow
      // 032: return
      // 033: aload 0
      // 034: iload 1
      // 035: ifne 05a
      // 038: getfield qeaa361f143ee4a0894bd168fd9b30c66/qf4ccf8f5435d4a78bdca4d6a018b578e/bbabbaaa.bbb Lnet/minecraft/class_243;
      // 03b: ifnull 055
      // 03e: goto 042
      // 041: athrow
      // 042: aload 0
      // 043: iload 1
      // 044: ifne 08d
      // 047: goto 04b
      // 04a: athrow
      // 04b: getfield qeaa361f143ee4a0894bd168fd9b30c66/qf4ccf8f5435d4a78bdca4d6a018b578e/bbabbaaa.bba Lnet/minecraft/class_745;
      // 04e: ifnonnull 05e
      // 051: goto 055
      // 054: athrow
      // 055: aload 0
      // 056: goto 05a
      // 059: athrow
      // 05a: invokevirtual qeaa361f143ee4a0894bd168fd9b30c66/qf4ccf8f5435d4a78bdca4d6a018b578e/bbabbaaa.abaab ()V
      // 05d: return
      // 05e: aload 0
      // 05f: aload 0
      // 060: getfield qeaa361f143ee4a0894bd168fd9b30c66/qf4ccf8f5435d4a78bdca4d6a018b578e/bbabbaaa.bbb Lnet/minecraft/class_243;
      // 063: putfield qeaa361f143ee4a0894bd168fd9b30c66/qf4ccf8f5435d4a78bdca4d6a018b578e/bbabbaaa.aabb Lnet/minecraft/class_243;
      // 066: aload 0
      // 067: aload 0
      // 068: getfield qeaa361f143ee4a0894bd168fd9b30c66/qf4ccf8f5435d4a78bdca4d6a018b578e/bbabbaaa.aa F
      // 06b: putfield qeaa361f143ee4a0894bd168fd9b30c66/qf4ccf8f5435d4a78bdca4d6a018b578e/bbabbaaa.bb F
      // 06e: aload 0
      // 06f: aload 0
      // 070: getfield qeaa361f143ee4a0894bd168fd9b30c66/qf4ccf8f5435d4a78bdca4d6a018b578e/bbabbaaa.aaaa F
      // 073: putfield qeaa361f143ee4a0894bd168fd9b30c66/qf4ccf8f5435d4a78bdca4d6a018b578e/bbabbaaa.aaba F
      // 076: aload 0
      // 077: aload 0
      // 078: getfield qeaa361f143ee4a0894bd168fd9b30c66/qf4ccf8f5435d4a78bdca4d6a018b578e/bbabbaaa.bba Lnet/minecraft/class_745;
      // 07b: invokevirtual net/minecraft/class_745.method_36454 ()F
      // 07e: putfield qeaa361f143ee4a0894bd168fd9b30c66/qf4ccf8f5435d4a78bdca4d6a018b578e/bbabbaaa.aa F
      // 081: aload 0
      // 082: aload 0
      // 083: getfield qeaa361f143ee4a0894bd168fd9b30c66/qf4ccf8f5435d4a78bdca4d6a018b578e/bbabbaaa.bba Lnet/minecraft/class_745;
      // 086: invokevirtual net/minecraft/class_745.method_36455 ()F
      // 089: putfield qeaa361f143ee4a0894bd168fd9b30c66/qf4ccf8f5435d4a78bdca4d6a018b578e/bbabbaaa.aaaa F
      // 08c: aload 0
      // 08d: aload 2
      // 08e: aload 2
      // 08f: getfield net/minecraft/class_310.field_1690 Lnet/minecraft/class_315;
      // 092: getfield net/minecraft/class_315.field_1894 Lnet/minecraft/class_304;
      // 095: aload 2
      // 096: getfield net/minecraft/class_310.field_1690 Lnet/minecraft/class_315;
      // 099: getfield net/minecraft/class_315.field_1881 Lnet/minecraft/class_304;
      // 09c: invokevirtual qeaa361f143ee4a0894bd168fd9b30c66/qf4ccf8f5435d4a78bdca4d6a018b578e/bbabbaaa.aaaa (Lnet/minecraft/class_310;Lnet/minecraft/class_304;Lnet/minecraft/class_304;)D
      // 09f: dstore 3
      // 0a0: aload 0
      // 0a1: aload 2
      // 0a2: aload 2
      // 0a3: getfield net/minecraft/class_310.field_1690 Lnet/minecraft/class_315;
      // 0a6: getfield net/minecraft/class_315.field_1913 Lnet/minecraft/class_304;
      // 0a9: aload 2
      // 0aa: getfield net/minecraft/class_310.field_1690 Lnet/minecraft/class_315;
      // 0ad: getfield net/minecraft/class_315.field_1849 Lnet/minecraft/class_304;
      // 0b0: invokevirtual qeaa361f143ee4a0894bd168fd9b30c66/qf4ccf8f5435d4a78bdca4d6a018b578e/bbabbaaa.aaaa (Lnet/minecraft/class_310;Lnet/minecraft/class_304;Lnet/minecraft/class_304;)D
      // 0b3: dstore 5
      // 0b5: aload 0
      // 0b6: aload 2
      // 0b7: aload 2
      // 0b8: getfield net/minecraft/class_310.field_1690 Lnet/minecraft/class_315;
      // 0bb: getfield net/minecraft/class_315.field_1903 Lnet/minecraft/class_304;
      // 0be: aload 2
      // 0bf: getfield net/minecraft/class_310.field_1690 Lnet/minecraft/class_315;
      // 0c2: getfield net/minecraft/class_315.field_1832 Lnet/minecraft/class_304;
      // 0c5: invokevirtual qeaa361f143ee4a0894bd168fd9b30c66/qf4ccf8f5435d4a78bdca4d6a018b578e/bbabbaaa.aaaa (Lnet/minecraft/class_310;Lnet/minecraft/class_304;Lnet/minecraft/class_304;)D
      // 0c8: dstore 7
      // 0ca: aload 0
      // 0cb: dload 3
      // 0cc: dload 5
      // 0ce: dload 7
      // 0d0: aload 0
      // 0d1: getfield qeaa361f143ee4a0894bd168fd9b30c66/qf4ccf8f5435d4a78bdca4d6a018b578e/bbabbaaa.aa F
      // 0d4: invokevirtual qeaa361f143ee4a0894bd168fd9b30c66/qf4ccf8f5435d4a78bdca4d6a018b578e/bbabbaaa.aaab (DDDF)Lnet/minecraft/class_243;
      // 0d7: astore 9
      // 0d9: aload 9
      // 0db: iload 1
      // 0dc: ifne 0f6
      // 0df: invokevirtual net/minecraft/class_243.method_1027 ()D
      // 0e2: ldc2_w 1.0E-6
      // 0e5: dcmpg
      // 0e6: ifgt 0ef
      // 0e9: goto 0ed
      // 0ec: athrow
      // 0ed: return
      // 0ee: athrow
      // 0ef: aload 0
      // 0f0: getfield qeaa361f143ee4a0894bd168fd9b30c66/qf4ccf8f5435d4a78bdca4d6a018b578e/bbabbaaa.baa Lqeaa361f143ee4a0894bd168fd9b30c66/qf4ccf8f5435d4a78bdca4d6a018b578e/bababa;
      // 0f3: invokevirtual qeaa361f143ee4a0894bd168fd9b30c66/qf4ccf8f5435d4a78bdca4d6a018b578e/bababa.abbb ()Ljava/lang/Object;
      // 0f6: checkcast java/lang/Double
      // 0f9: invokevirtual java/lang/Double.doubleValue ()D
      // 0fc: aload 2
      // 0fd: aload 2
      // 0fe: getfield net/minecraft/class_310.field_1690 Lnet/minecraft/class_315;
      // 101: getfield net/minecraft/class_315.field_1867 Lnet/minecraft/class_304;
      // 104: invokestatic qeaa361f143ee4a0894bd168fd9b30c66/qf4ccf8f5435d4a78bdca4d6a018b578e/aabbabbbb.aaab (Lnet/minecraft/class_310;Lnet/minecraft/class_304;)Z
      // 107: ifeq 111
      // 10a: ldc2_w 0.42
      // 10d: goto 114
      // 110: athrow
      // 111: ldc2_w 0.18
      // 114: dmul
      // 115: dstore 10
      // 117: aload 0
      // 118: aload 0
      // 119: getfield qeaa361f143ee4a0894bd168fd9b30c66/qf4ccf8f5435d4a78bdca4d6a018b578e/bbabbaaa.bbb Lnet/minecraft/class_243;
      // 11c: aload 9
      // 11e: invokevirtual net/minecraft/class_243.method_1029 ()Lnet/minecraft/class_243;
      // 121: dload 10
      // 123: invokevirtual net/minecraft/class_243.method_1021 (D)Lnet/minecraft/class_243;
      // 126: invokevirtual net/minecraft/class_243.method_1019 (Lnet/minecraft/class_243;)Lnet/minecraft/class_243;
      // 129: putfield qeaa361f143ee4a0894bd168fd9b30c66/qf4ccf8f5435d4a78bdca4d6a018b578e/bbabbaaa.bbb Lnet/minecraft/class_243;
      // 12c: aload 0
      // 12d: getfield qeaa361f143ee4a0894bd168fd9b30c66/qf4ccf8f5435d4a78bdca4d6a018b578e/bbabbaaa.bba Lnet/minecraft/class_745;
      // 130: aload 0
      // 131: getfield qeaa361f143ee4a0894bd168fd9b30c66/qf4ccf8f5435d4a78bdca4d6a018b578e/bbabbaaa.bbb Lnet/minecraft/class_243;
      // 134: getfield net/minecraft/class_243.field_1352 D
      // 137: aload 0
      // 138: getfield qeaa361f143ee4a0894bd168fd9b30c66/qf4ccf8f5435d4a78bdca4d6a018b578e/bbabbaaa.bbb Lnet/minecraft/class_243;
      // 13b: getfield net/minecraft/class_243.field_1351 D
      // 13e: aload 0
      // 13f: getfield qeaa361f143ee4a0894bd168fd9b30c66/qf4ccf8f5435d4a78bdca4d6a018b578e/bbabbaaa.bbb Lnet/minecraft/class_243;
      // 142: getfield net/minecraft/class_243.field_1350 D
      // 145: invokevirtual net/minecraft/class_745.method_5814 (DDD)V
      // 148: return
   }

   // $VF: Irreducible bytecode was duplicated to produce valid code
   static {
      int var33 = 120869485;
      int var10001 = "Z㒁\uf765屵ㄴ櫩¦⋲讛\uede9၀锲덚ꖔ踒䇣࿚㷦㩈礍鬓\udeff\uf4af馊菙\uf421⥭腁넴፫᳃荞썊籔Ꝁ斈\uf54eￗ熷익\uefdb띑걂슜瓮ᇤ艚̬㭚\uef5c䁄扛䝣퍤茵崟攉좄誋ﻪ\uef7e㖖跸ꞅꏘ憭≳ᭌ鐫轎죃༤푽矲ٱ슂ꑄ\ua6fe\uf2f0뚍萚宾Ƴ핕\uef6e퐔븋弸軦뗦簇\u0018奘衑墨졕常\ud858噘록忈硙咸㡜吨록咸䡛巈⡙堈顔媈顟宨ᡚ\nз\uf701̗휌ࠇ霏Ϸ圇Էᜍ\u0010㉯張㯿⼷㝏伸ㆿ弼㨯⼲ㅯ켽㳟缴㓟꼼\nﺂ䋻廉拶\uf2b2⋵壟\ue2fdﾂꋷ\u0018髐悛需炔醰\ue091騀\u3097鴰ₗ饰肜鑐난逐炗釐傒餀삕鿰\uf091鳀\u0093\n氏콩欯\uef64怿꽧每潯洏⽥"
         .length();
      int var26 = 0;
      short var28 = 31771;
      int var27 = 0;
      int var24 = var10001;
      String[] var25 = new String[7];
      String var23 = "Z㒁\uf765屵ㄴ櫩¦⋲讛\uede9၀锲덚ꖔ踒䇣࿚㷦㩈礍鬓\udeff\uf4af馊菙\uf421⥭腁넴፫᳃荞썊籔Ꝁ斈\uf54eￗ熷익\uefdb띑걂슜瓮ᇤ艚̬㭚\uef5c䁄扛䝣퍤茵崟攉좄誋ﻪ\uef7e㖖跸ꞅꏘ憭≳ᭌ鐫轎죃༤푽矲ٱ슂ꑄ\ua6fe\uf2f0뚍萚宾Ƴ핕\uef6e퐔븋弸軦뗦簇\u0018奘衑墨졕常\ud858噘록忈硙咸㡜吨록咸䡛巈⡙堈顔媈顟宨ᡚ\nз\uf701̗휌ࠇ霏Ϸ圇Էᜍ\u0010㉯張㯿⼷㝏伸ㆿ弼㨯⼲ㅯ켽㳟缴㓟꼼\nﺂ䋻廉拶\uf2b2⋵壟\ue2fdﾂꋷ\u0018髐悛需炔醰\ue091騀\u3097鴰ₗ饰肜鑐난逐炗釐傒餀삕鿰\uf091鳀\u0093\n氏콩欯\uef64怿꽧每潯洏⽥";

      do {
         char var29 = var23.charAt(var27);
         char[] var10000 = var23.substring(var27 + 1, var27 + 1 + var29).toCharArray();
         int var31 = 0;
         char[] var30 = var10000;

         do {
            char var32 = var30[var31];
            if (var31 % 2 == 0) {
               var30[var31] = (char)((var32 >>> 4 | var32 << '\f') & 65535 ^ var28);
            } else {
               var30[var31] = (char)((var32 << 4 | var32 >>> '\f') & 65535 ^ var28);
            }
         } while (++var31 < var30.length);

         var25[var26] = new String(var30);
         var26++;
         var27 = var27 + var29 + 1;
      } while (var27 < var24);

      abab = var25;
      abba = new Object[var25.length];
      byte var36 = 0;
      abaa = new int[311];
      int var38 = 0;
      byte[] var10002 = "²-\u0088¿\u008c¼=\u008düUûR2Ò\u009d\u0006\u0083Ó#§1x ,¹ÒÏøi$ûªísDÌÀòÓ£\u008f÷8ËØ\rjýÌzä²r\u0001ÍU\u00921Ñ\u008f#Ù\u0090.\u008dy\u0091Õå\u0092<\u0091Ù¯ÏêïO&\u0090Õo»F\u0017ôõ0,\u009bw|\u0012í·mÃqX\u0001©\u000fÁÇ%BwÃVÒõ\u009df¼â\u001d¨.\u0087M\u001ca¦\u0099Ë1e´\u0094 ¨%ìÐ5¨Ðz·¢»AZa%ØtQ¥²¯4ùÙSf¨©\u0094_á\u0085ÙÀ¾]\u0003«¤¶½°\u00072ëS+¯¢(\u008a\u008aÂÝ&4ª@ðñw\u0010pÔ¹\u0080\u0010\u0019Ý\u007f\u001b\u000f[]\u001d\u008c\u00adæpA);\u0088zhQÚ\t\u0083æ®\u0093ÍMtX¡\u001e ïô\u0001k0\u001c¹ÀÝ½¦sWn^V\fªt0`\u0089Õ\u0087¥»äú\u008bß\u0080\u007fqa¬äLGý\u0000C³*\u0080\u0086\u0094é\u009c]¥Ê7\u0099\u0018¸mmª\u001d_)\u0088\u0016\u0005Rõ\bJjã°e+!X\u000bäÌ\u0017\u000b\u001d\u008dÛ;\u009cÉê\u0001\u0014¶Lç·\u0010´\u000e\u008bR5Iõ\u0004ÕÞ\u009ayþ3(1Þa\u009cÄ$)\fó!\u001fÍvðMådÆ\u0011?¸\u0097ÎµÀ®;ï5Â:9-\u0085ô1\b Ú\u0085µÍ.\u0084VI<ý_@¼ðê!4L{\u0092«\u009b±\u0084N²~>\u009ee\u009bDÂ\u0012ß\u0080È\rR9kâ\u00854\nÏN\u0099#ÇF\u0004:\u0019òNüG\u0089¦\u0081@k(Áár:\u0006ò\u0005a\u001aâÀåÂ\u0011È® ûÖ\u0007:ºÏú\u009d¾à¶Â?\u0011\u000f\u0087¡YwÅYñÉ\u0019Â]\u0012ÎÞ h}§òÝÄ3\u0018GïJ+\u001e\u008dªz|xU\u0019AÂ\u009aûi;-^\u0082PHø\u001a\u0015,r1\u0093þ\u001eèñE\u0082^#µe\u0082\u0094O¥´BÙ\u001c@\u009dö\u0096hi\u009aÐïk»ê\u0085iLó\u009c¨\\\u008d>á\u000e\u0094\u0080àZ§\u0085T\u0088-tµf\u0085\u0002\u008bx( '¶%\u0006#í0Q$&ÊiaQ¢£\u0012\u009bj\u0084µ`em\u0013½ú\nÃ`\u008a\u0002.ÝÿË\u0002¥\u0012\u009c\u009f\u0089çîÃÜ]ÄÇuzu¯A\t\u0082eõVº\u009c\u0085i(¤+iF|(\u00890àEß\tXë¶A.ñL@\u009f¼éú]\u008fe1\u009dýÔ\u008d/¹Ørù½ö©\u009cÅ~ãñGF3o|äÀªo\u0095@\u0004©ð_\u000e\u0002Øm\u009e\u009aB\u0098vE`A&½ÄØ>^ôo\u0014\u0087\u0092\"®XàÑS¼o\u0089,°\føÚKîV(!çG\u001a\u009eTZ³´\u0015_(¸>Éì\u001e\f)\u0086\býJ,¦Q^@ñÅ»o\u007f\u008dïcl²|öe[Î|Ú\u001b!\u0011¯\u008dþÎ\nÖ\u000f¦oMÛhÇ?,\u0002\u0002Ái>dïj\u001c\u0010pcÊ\u0000\u0017\u0092e\u0015ö&Ø±\u007fc¿\u008bU\u0018-1\u0095Òy\u0081í\u0012'\r\u0094\u001b\u00870GVN\\ºö~Îô6AaÒ\u000f¬¡eÆfõf/å©Ü×'\u0092\u00854\u0017mºwíÌ¼\u0000ç^}\u008dùuÆ\u0086õ\u008a\u001eo¶+\b\u000e\u008f\u008c\u007f\u0013J¦2£Cô8§\u0018¡\u008aÑZ\u0001ý\u0018Qå¥?\u009a\u008ckw½\u0010û\u001flÚÐ\u000bÆ¹)N\u0082r+\u000bÙæ\f\u0080-\u009bLç{Ý~üÊM¦\u0096j¡0\u0006Ó.\u001aûìAHoKØ¿D/ßÀÀE\u008e\u0086'¡lr°>TSF¡¨UÜG\"\u0091sûÒ\u0013\u0016ûtnn§ä\u0092\u000eîá\u009bº£\u0002¹Æh\u008e³d\u000fçR4}\bv\u0084ô\\÷nâ Y¸\u0095\tó\u0003\u009f\u0088ÍG\\\u0086ßo¶p¼â37¶ñ\u0089\u0095Üw{x\u001e¢,4$\u0081\u0000\u009bFÓæ\u0080u\f=\u0093gÑÛÆÇ°·¼Ñ(h$Éº,\u001dö9ß\u000b\u0093´$(Hýt\u00051aQ=ÈÇ\u00991á¸\u0096Ô\u001bµQ\\A\u0089 ç´.vÞªF\u0091ÆfE\u0012\u0005²ó#¸Ï¼ÖÌîÂ?òßþ)´Ä\u0083<Ãª\u0097â&Ç¦Ð\u0095?uÒSê\u0091¾¿üt0,¼¯«è\\\u000eUhéHûÄ´ðv@\u009dl\u008eÿk\u0094\u0090_â\u0084WÝ ò\u008fQEViyÿÕ±¨ªÄóÀ±ÓïÏªFå[\u000bI"
         .getBytes("ISO-8859-1");

      int var75;
      do {
         abaa[var36] = ((var10002[var38] & 255) << 24 | (var10002[var38 + 1] & 255) << 16 | (var10002[var38 + 2] & 255) << 8 | var10002[var38 + 3] & 255)
            ^ 1216778905;
         var36 += 1;
         var75 = var38 + 4;
         var38 += 4;
      } while (var75 < var10002.length);

      String[] var21 = new String[3];
      int var19 = 0;
      String var18;
      int var20 = (var18 = b(-1099374628, (byte)-1, 482145364, (char)'\ued48', '悐')).length();
      int var17 = a(-867778936, var33 ^ -836476049);
      int var16 = -1;

      while (true) {
         label109: {
            char[] var41 = var18.substring(++var16, var16 + var17).toCharArray();
            var75 = var41.length;
            int var22 = 0;
            var61 = var41;
            var38 = var75;
            char[] var79;
            int var96;
            if (var75 <= 1) {
               var79 = var41;
               var96 = var22;
            } else {
               var61 = var41;
               var38 = var75;
               if (var75 <= var22) {
                  break label109;
               }

               var79 = var41;
               var96 = var22;
            }

            while (true) {
               var79[var96] = (char)(var79[var96] ^ switch (var22 % a(-867778935, var33 ^ -256518571)) {
                  case 0 -> a(-867778934, var33 ^ -2141446307);
                  case 1 -> a(-867778933, var33 ^ 1323005594);
                  case 2 -> a(-867778932, var33 ^ -2439284);
                  case 3 -> a(-867778931, var33 ^ 1299301453);
                  case 4 -> a(-867778930, var33 ^ -975494107);
                  case 5 -> a(-867778929, var33 ^ 355274976);
                  default -> a(-867778944, var33 ^ -1854234375);
               });
               var22++;
               if (var38 == 0) {
                  var96 = var38;
                  var79 = var61;
               } else {
                  if (var38 <= var22) {
                     break;
                  }

                  var79 = var61;
                  var96 = var22;
               }
            }
         }

         String var86 = new String(var61).intern();
         int var48 = -1;
         var21[var19++] = var86;
         if ((var16 += var17) >= var20) {
            aab = var21;
            bab = new String[3];
            long var8 = 4665239797574676914L;
            long[] var14 = new long[5];
            int var11 = 0;
            String var12;
            int var13 = (var12 = b(-144172481, 71, 482145365, '鯩', (char)'\ue366')).length();
            byte var10 = 0;

            label93:
            while (true) {
               var48 = var10;
               var10 += 8;
               byte[] var15 = var12.substring(var48, var10).getBytes(b(-669220830, (byte)-109, 482145366, '薼', '涯'));
               long[] var37 = var14;
               var48 = var11++;
               long var66 = (var15[0] & 255L) << a(-867778943, var33 ^ -1124386866)
                  | (var15[1] & 255L) << a(-867778942, var33 ^ -201401171)
                  | (var15[2] & 255L) << a(-867778941, var33 ^ -1543205182)
                  | (var15[3] & 255L) << a(-867778940, var33 ^ -1334640510)
                  | (var15[4] & 255L) << a(-867778939, var33 ^ 235415900)
                  | (var15[5] & 255L) << a(-867778938, var33 ^ -298306163)
                  | (var15[a(-867778937, var33 ^ 1607498747)] & 255L) << a(-867778920, var33 ^ -244286959)
                  | var15[a(-867778919, var33 ^ -1717840039)] & 255L;
               byte var87 = -1;

               while (true) {
                  long var98 = var66 ^ var8;
                  switch (var87) {
                     case 0:
                        var37[var48] = var98;
                        if (var10 >= var13) {
                           abb = var14;
                           aba = new Integer[5];
                           long var0 = 5590016841110580143L;
                           long[] var6 = new long[3];
                           int var3 = 0;
                           String var4;
                           int var5 = (var4 = b(-372742065, (byte)-4, 482145361, '\uf873', (char)'臣')).length();
                           byte var2 = 0;

                           do {
                              int var52 = var2;
                              var2 += 8;
                              byte[] var7 = var4.substring(var52, var2).getBytes(b(2058128660, (byte)-110, 482145362, 5570, 30305));
                              var52 = var3++;
                              var98 = (
                                    (var7[0] & 255L) << a(-867778925, var33 ^ 719000034)
                                       | (var7[1] & 255L) << a(-867778924, var33 ^ 448071277)
                                       | (var7[2] & 255L) << a(-867778923, var33 ^ -735616156)
                                       | (var7[3] & 255L) << a(-867778922, var33 ^ 1617445563)
                                       | (var7[4] & 255L) << a(-867778921, var33 ^ -1221033553)
                                       | (var7[5] & 255L) << a(-867778904, var33 ^ -399946743)
                                       | (var7[a(-867778903, var33 ^ -1864769965)] & 255L) << a(-867778902, var33 ^ -1401725868)
                                       | var7[a(-867778901, var33 ^ -951537253)] & 255L
                                 )
                                 ^ var0;
                              var87 = -1;
                              var6[var52] = var98;
                           } while (var2 < var5);

                           aaa = var6;
                           ba = new Long[3];
                           ab = new String[3];
                           ba();
                           return;
                        }
                        break;
                     default:
                        var37[var48] = var98;
                        if (var10 < var13) {
                           continue label93;
                        }

                        var13 = (var12 = b(-69060041, (byte)-104, 482145367, 2569, '\udbd6')).length();
                        var10 = 0;
                  }

                  byte var51 = var10;
                  var10 += 8;
                  var15 = var12.substring(var51, var10).getBytes(b(1616296907, (byte)112, 482145360, '蹏', 'ﷻ'));
                  var37 = var14;
                  var48 = var11++;
                  var66 = (var15[0] & 255L) << a(-867778918, var33 ^ -1515836516)
                     | (var15[1] & 255L) << a(-867778917, var33 ^ -1824079121)
                     | (var15[2] & 255L) << a(-867778916, var33 ^ -1452908698)
                     | (var15[3] & 255L) << a(-867778915, var33 ^ 1811747097)
                     | (var15[4] & 255L) << a(-867778914, var33 ^ 1351783278)
                     | (var15[5] & 255L) << a(-867778913, var33 ^ 1860457334)
                     | (var15[a(-867778928, var33 ^ -1082608701)] & 255L) << a(-867778927, var33 ^ -721016310)
                     | var15[a(-867778926, var33 ^ 1498127360)] & 255L;
                  var87 = 0;
               }
            }
         }

         var17 = var18.charAt(var16);
      }
   }

   public float bba(float var1) {
      return class_3532.method_16439(class_3532.method_15363(var1, 0.0F, 1.0F), this.aaba, this.aaaa);
   }

   private static long bbb(int var0, long var1) {
      int var3 = (var0 ^ (int)var1 ^ a(-867778627, 1072536301 ^ -1423989922)) & a(-867778626, 1072536301 ^ 1584834846);
      if (ba[var3] == null) {
         ba[var3] = aaa[var3] ^ var1;
      }

      return ba[var3];
   }

   @Override
   public void aabaa() {
      class_310 var1 = class_310.method_1551();
      this.bab(var1);
      this.bbb = null;
      this.aabb = null;
   }

   private double aaaa(class_310 var1, class_304 var2, class_304 var3) {
      double var10000;
      label28: {
         try {
            if (aabbabbbb.aaab(var1, var2)) {
               var10000 = 1.0;
               break label28;
            }
         } catch (MatchException var5) {
            throw var5;
         }

         var10000 = 0.0;
      }

      try {
         if (aabbabbbb.aaab(var1, var3)) {
            return var10000 - 1.0;
         }
      } catch (MatchException var4) {
         throw var4;
      }

      return var10000 - 0.0;
   }

   private class_243 aaab(double var1, double var3, double var5, float var7) {
      double var8 = Math.toRadians(var7);
      double var10 = Math.sin(var8);
      double var12 = Math.cos(var8);
      double var14 = var1 * -var10 + var3 * var12;
      double var16 = var1 * var12 + var3 * var10;
      return new class_243(var14, var5, var16);
   }
}
