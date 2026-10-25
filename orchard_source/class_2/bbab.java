package nsc;

import net.fabricmc.api.EnvType;
import net.fabricmc.api.Environment;
import net.minecraft.class_2815;

@Environment(EnvType.CLIENT)
public final class bbab extends abbaabbaa {
   private static String[] aa;
   private static final long[] ab;
   private static final Long[] ba;
   private static final int[] baa;
   private static final String[] bab;
   private static final Object[] bba;
   private boolean bb;
   private static final long[] aaa;
   private static final String[] aab;
   private static final Integer[] aba;
   private static final String[] abb;

   public bbab() {
      super(
         aabbaaaba.aaab(aa[0]),
         bbaabbba.bba,
         aabbaaaba.aaab(aa[1])
      );
   }

   public boolean aa(class_2815 param1) {
      // $VF: Couldn't be decompiled
      // Please report this to the Vineflower issue tracker, at https://github.com/Vineflower/vineflower/issues with a copy of the class file (if you have the rights to distribute it!)
      // java.lang.RuntimeException: parsing failure!
      //   at org.jetbrains.java.decompiler.modules.decompiler.decompose.DomHelper.parseGraph(DomHelper.java:211)
      //   at org.jetbrains.java.decompiler.main.rels.MethodProcessor.codeToJava(MethodProcessor.java:166)
      //
      // Bytecode:
      // 00: getstatic qeaa361f143ee4a0894bd168fd9b30c66/qf4ccf8f5435d4a78bdca4d6a018b578e/baaabbaa.bba I
      // 03: istore 2
      // 04: invokestatic net/minecraft/class_310.method_1551 ()Lnet/minecraft/class_310;
      // 07: astore 3
      // 08: aload 3
      // 09: getfield net/minecraft/class_310.field_1724 Lnet/minecraft/class_746;
      // 0c: ifnull 1f
      // 0f: aload 1
      // 10: iload 2
      // 11: ifne 23
      // 14: goto 18
      // 17: athrow
      // 18: ifnonnull 22
      // 1b: goto 1f
      // 1e: athrow
      // 1f: bipush 0
      // 20: ireturn
      // 21: athrow
      // 22: aload 1
      // 23: invokevirtual net/minecraft/class_2815.method_36168 ()I
      // 26: iload 2
      // 27: ifne 4a
      // 2a: aload 3
      // 2b: getfield net/minecraft/class_310.field_1724 Lnet/minecraft/class_746;
      // 2e: getfield net/minecraft/class_746.field_7498 Lnet/minecraft/class_1723;
      // 31: getfield net/minecraft/class_1723.field_7763 I
      // 34: if_icmpeq 3e
      // 37: goto 3b
      // 3a: athrow
      // 3b: bipush 0
      // 3c: ireturn
      // 3d: athrow
      // 3e: aload 0
      // 3f: iload 2
      // 40: ifne 56
      // 43: getfield qeaa361f143ee4a0894bd168fd9b30c66/qf4ccf8f5435d4a78bdca4d6a018b578e/bbab.bb Z
      // 46: goto 4a
      // 49: athrow
      // 4a: ifeq 55
      // 4d: aload 0
      // 4e: bipush 0
      // 4f: putfield qeaa361f143ee4a0894bd168fd9b30c66/qf4ccf8f5435d4a78bdca4d6a018b578e/bbab.bb Z
      // 52: bipush 0
      // 53: ireturn
      // 54: athrow
      // 55: aload 0
      // 56: invokevirtual qeaa361f143ee4a0894bd168fd9b30c66/qf4ccf8f5435d4a78bdca4d6a018b578e/bbab.babbaab ()Z
      // 59: ireturn
   }

   private static String abb(char var0, byte var1, int var2, short var3, int var4, char var5) {
      int var10 = var4 ^ 1369935816;
      char[] var9 = bab[var10].toCharArray();
      StackTraceElement[] var11 = (StackTraceElement[])bba[var10];
      StackTraceElement[] var12;
      if (var11 != null) {
         var12 = var11;
      } else {
         var12 = new Throwable().getStackTrace();
         bba[var10] = var12;
      }

      StackTraceElement var13 = var12[1];
      int var7 = (var13.getClassName().hashCode() ^ var13.getMethodName().hashCode()) >> 16 ^ 24582;
      int var8 = 0;

      do {
         var9[var8] = (char)(var9[var8] ^ var8 ^ switch (var8 % 31) {
            default -> 1;
            case 1 -> 13;
            case 2 -> 210;
            case 3 -> 202;
            case 4 -> 27;
            case 5 -> 119;
            case 6 -> 7;
            case 7 -> 214;
            case 8 -> 21;
            case 9 -> 12;
            case 10 -> 154;
            case 11 -> 244;
            case 12 -> 186;
            case 13 -> 92;
            case 14 -> 164;
            case 15 -> 77;
            case 16 -> 219;
            case 17 -> 81;
            case 18 -> 84;
            case 19 -> 1;
            case 20 -> 182;
            case 21 -> 109;
            case 22 -> 196;
            case 23 -> 201;
            case 24 -> 109;
            case 25 -> 135;
            case 26 -> 250;
            case 27 -> 238;
            case 28 -> 130;
            case 29 -> 137;
            case 30 -> 47;
         } ^ 8273 ^ var5 ^ var2 ^ var7 ^ var0 ^ var4 ^ var3 ^ var1);
      } while (++var8 < var9.length);

      return new String(var9).intern();
   }

   private static String ab(char[] var0, long var1, int var3) {
      int var4 = a(b(-617376095, -516332412 ^ -43056158), 8838516269237101238L) ^ var3;

      for (int var5 = 0; var5 < var0.length; var5++) {
         int var7 = var4 ^ (int)var1 ^ ~var5;
         int var8 = var7 ^ var3 - var5 * var0.length;
         var4 = -var8 * var3 | var5;
         var0[var5] = (char)(var0[var5] ^ var4);
         int var6 = var5 & a(b(-617376096, -516332412 ^ -305581142), 2599515596535287213L);
         var3 = var3 << var6 | var3 >>> -var6;
         var1 ^= var6;
      }

      return new String(var0);
   }

   private static String ba(int var0, int var1) {
      int var9 = 1318780812;
      int var2 = (var0 ^ b(-617376093, var9 ^ 796517190)) & b(-617376094, var9 ^ 480003362);
      if (aab[var2] == null) {
         char[] var3 = abb[var2].toCharArray();

         int var4 = switch (var3[0] & b(-617376091, var9 ^ 390629033)) {
            case 0 -> b(-617376092, var9 ^ 1564998745);
            case 1 -> b(-617376089, var9 ^ 1578776075);
            case 2 -> b(-617376090, var9 ^ -142291062);
            case 3 -> b(-617376087, var9 ^ -1163295058);
            case 4 -> b(-617376088, var9 ^ 23507504);
            case 5 -> b(-617376085, var9 ^ 465636878);
            case 6 -> b(-617376086, var9 ^ -1163121986);
            case 7 -> b(-617376083, var9 ^ -1635272348);
            case 8 -> b(-617376084, var9 ^ -1414996632);
            case 9 -> b(-617376081, var9 ^ 2109643812);
            case 10 -> b(-617376082, var9 ^ -450670424);
            case 11 -> b(-617376079, var9 ^ 855053423);
            case 12 -> b(-617376080, var9 ^ 611406821);
            case 13 -> b(-617376077, var9 ^ 1232792377);
            case 14 -> b(-617376078, var9 ^ 172444323);
            case 15 -> b(-617376075, var9 ^ 977034084);
            case 16 -> b(-617376076, var9 ^ 659406919);
            case 17 -> b(-617376073, var9 ^ -1238522228);
            case 18 -> b(-617376074, var9 ^ 1630261316);
            case 19 -> b(-617376071, var9 ^ -940741291);
            case 20 -> b(-617376072, var9 ^ -1077142164);
            case 21 -> b(-617376069, var9 ^ -176894956);
            case 22 -> b(-617376070, var9 ^ -972875906);
            case 23 -> b(-617376067, var9 ^ -1401935382);
            case 24 -> b(-617376068, var9 ^ 1205049259);
            case 25 -> b(-617376065, var9 ^ 715969281);
            case 26 -> b(-617376066, var9 ^ 1540324224);
            case 27 -> b(-617376127, var9 ^ -1014896251);
            case 28 -> b(-617376128, var9 ^ -1542572729);
            case 29 -> b(-617376125, var9 ^ -3462267);
            case 30 -> b(-617376126, var9 ^ 97655051);
            case 31 -> b(-617376123, var9 ^ 687483530);
            case 32 -> 2;
            case 33 -> b(-617376124, var9 ^ -727994780);
            case 34 -> b(-617376121, var9 ^ 1356438665);
            case 35 -> b(-617376122, var9 ^ 1965713972);
            case 36 -> b(-617376119, var9 ^ -355988584);
            case 37 -> b(-617376120, var9 ^ -708820319);
            case 38 -> b(-617376117, var9 ^ -1042625276);
            case 39 -> b(-617376118, var9 ^ -692532613);
            case 40 -> b(-617376115, var9 ^ 1119034913);
            case 41 -> b(-617376116, var9 ^ -1621727841);
            case 42 -> b(-617376113, var9 ^ 2021174167);
            case 43 -> b(-617376114, var9 ^ -944434857);
            case 44 -> b(-617376111, var9 ^ -1788945918);
            case 45 -> b(-617376112, var9 ^ -1842870707);
            case 46 -> b(-617376109, var9 ^ 946639544);
            case 47 -> b(-617376110, var9 ^ -1543743770);
            case 48 -> b(-617376107, var9 ^ -1307203380);
            case 49 -> b(-617376108, var9 ^ 1084087480);
            case 50 -> b(-617376105, var9 ^ -1329399870);
            case 51 -> b(-617376106, var9 ^ -1416890666);
            case 52 -> b(-617376103, var9 ^ -1519408577);
            case 53 -> b(-617376104, var9 ^ 952836332);
            case 54 -> b(-617376101, var9 ^ 850097369);
            case 55 -> b(-617376102, var9 ^ -208534232);
            case 56 -> b(-617376099, var9 ^ 667882840);
            case 57 -> b(-617376100, var9 ^ 1684316383);
            case 58 -> b(-617376097, var9 ^ -1246951491);
            case 59 -> b(-617376098, var9 ^ 2032922824);
            case 60 -> b(-617376031, var9 ^ -1368281651);
            case 61 -> b(-617376032, var9 ^ 1147693370);
            case 62 -> b(-617376029, var9 ^ 1729557097);
            case 63 -> b(-617376030, var9 ^ -1618135612);
            case 64 -> b(-617376027, var9 ^ 2047638062);
            case 65 -> b(-617376028, var9 ^ -1559353240);
            case 66 -> b(-617376025, var9 ^ -413977550);
            case 67 -> b(-617376026, var9 ^ 320322520);
            case 68 -> b(-617376023, var9 ^ 1513937035);
            case 69 -> b(-617376024, var9 ^ -1529335358);
            case 70 -> b(-617376021, var9 ^ -655448128);
            case 71 -> b(-617376022, var9 ^ 677771717);
            case 72 -> b(-617376019, var9 ^ -515199961);
            case 73 -> b(-617376020, var9 ^ 1484647277);
            case 74 -> b(-617376017, var9 ^ 68812895);
            case 75 -> b(-617376018, var9 ^ -1905656876);
            case 76 -> b(-617376015, var9 ^ 2107293808);
            case 77 -> b(-617376016, var9 ^ 53132359);
            case 78 -> b(-617376013, var9 ^ -1457890007);
            case 79 -> b(-617376014, var9 ^ -549206421);
            case 80 -> b(-617376011, var9 ^ 576581301);
            case 81 -> b(-617376012, var9 ^ 339601108);
            case 82 -> 3;
            case 83 -> b(-617376009, var9 ^ -1502243001);
            case 84 -> b(-617376010, var9 ^ -1542422108);
            case 85 -> b(-617376007, var9 ^ -2012959269);
            case 86 -> b(-617376008, var9 ^ 315481746);
            case 87 -> b(-617376005, var9 ^ 546794811);
            case 88 -> b(-617376006, var9 ^ -1702538067);
            case 89 -> b(-617376003, var9 ^ 1181633174);
            case 90 -> b(-617376004, var9 ^ -269915677);
            case 91 -> b(-617376001, var9 ^ 1239162082);
            case 92 -> b(-617376002, var9 ^ -1380651962);
            case 93 -> b(-617376063, var9 ^ 2104269293);
            case 94 -> b(-617376064, var9 ^ 177214800);
            case 95 -> b(-617376061, var9 ^ 1027856394);
            case 96 -> b(-617376062, var9 ^ 1360953975);
            case 97 -> b(-617376059, var9 ^ -1883635089);
            case 98 -> b(-617376060, var9 ^ -2108211349);
            case 99 -> b(-617376057, var9 ^ 1692235902);
            case 100 -> b(-617376058, var9 ^ 58399553);
            case 101 -> b(-617376055, var9 ^ -984895861);
            case 102 -> b(-617376056, var9 ^ -342672853);
            case 103 -> b(-617376053, var9 ^ 1271231898);
            case 104 -> b(-617376054, var9 ^ 1685009999);
            case 105 -> b(-617376051, var9 ^ -1282847181);
            case 106 -> b(-617376052, var9 ^ 558462245);
            case 107 -> b(-617376049, var9 ^ -930655225);
            case 108 -> b(-617376050, var9 ^ 639437840);
            case 109 -> b(-617376047, var9 ^ 17293799);
            case 110 -> b(-617376048, var9 ^ -1437189146);
            case 111 -> b(-617376045, var9 ^ -1817753549);
            case 112 -> b(-617376046, var9 ^ -1684116430);
            case 113 -> b(-617376043, var9 ^ 1182359943);
            case 114 -> b(-617376044, var9 ^ 1671978738);
            case 115 -> b(-617376041, var9 ^ -1119557313);
            case 116 -> b(-617376042, var9 ^ 440014291);
            case 117 -> b(-617376039, var9 ^ -111372534);
            case 118 -> b(-617376040, var9 ^ -1495031184);
            case 119 -> b(-617376037, var9 ^ 1513754794);
            case 120 -> b(-617376038, var9 ^ 2020400441);
            case 121 -> b(-617376035, var9 ^ -134056103);
            case 122 -> b(-617376036, var9 ^ -1175500960);
            case 123 -> b(-617376033, var9 ^ 754486857);
            case 124 -> b(-617376034, var9 ^ 439098783);
            case 125 -> b(-617376223, var9 ^ -439488931);
            case 126 -> b(-617376224, var9 ^ -1512151574);
            case 127 -> b(-617376221, var9 ^ -432419307);
            case 128 -> b(-617376222, var9 ^ -196106605);
            case 129 -> b(-617376219, var9 ^ 561174863);
            case 130 -> 0;
            case 131 -> b(-617376220, var9 ^ 1660110826);
            case 132 -> b(-617376217, var9 ^ -1098401229);
            case 133 -> b(-617376218, var9 ^ -1171202255);
            case 134 -> b(-617376215, var9 ^ 1592352845);
            case 135 -> 5;
            case 136 -> b(-617376216, var9 ^ -301144448);
            case 137 -> b(-617376213, var9 ^ 1985082692);
            case 138 -> b(-617376214, var9 ^ -1501178007);
            case 139 -> b(-617376211, var9 ^ 424564890);
            case 140 -> b(-617376212, var9 ^ -790173314);
            case 141 -> b(-617376209, var9 ^ -19364662);
            case 142 -> b(-617376210, var9 ^ -688665681);
            case 143 -> b(-617376207, var9 ^ -1169471026);
            case 144 -> b(-617376208, var9 ^ 1359703004);
            case 145 -> b(-617376205, var9 ^ -1800088178);
            case 146 -> b(-617376206, var9 ^ -243345954);
            case 147 -> b(-617376203, var9 ^ -1522935811);
            case 148 -> b(-617376204, var9 ^ -1593265902);
            case 149 -> b(-617376201, var9 ^ 1048168672);
            case 150 -> b(-617376202, var9 ^ 1941601692);
            case 151 -> b(-617376199, var9 ^ 1521889017);
            case 152 -> b(-617376200, var9 ^ 2090909790);
            case 153 -> b(-617376197, var9 ^ 654680448);
            case 154 -> b(-617376198, var9 ^ -1975892291);
            case 155 -> b(-617376195, var9 ^ -1451739048);
            case 156 -> b(-617376196, var9 ^ -36263481);
            case 157 -> b(-617376193, var9 ^ 404855401);
            case 158 -> b(-617376194, var9 ^ -528682661);
            case 159 -> b(-617376255, var9 ^ 1884667566);
            case 160 -> b(-617376256, var9 ^ -1652703165);
            case 161 -> b(-617376253, var9 ^ 1496699457);
            case 162 -> b(-617376254, var9 ^ -814753219);
            case 163 -> b(-617376251, var9 ^ -823739984);
            case 164 -> b(-617376252, var9 ^ 249081305);
            case 165 -> 1;
            case 166 -> b(-617376249, var9 ^ -595572626);
            case 167 -> b(-617376250, var9 ^ 478038234);
            case 168 -> b(-617376247, var9 ^ 1844169013);
            case 169 -> b(-617376248, var9 ^ 1173160552);
            case 170 -> b(-617376245, var9 ^ 1023625981);
            case 171 -> b(-617376246, var9 ^ 1349741018);
            case 172 -> b(-617376243, var9 ^ -1001938510);
            case 173 -> b(-617376244, var9 ^ 1349612545);
            case 174 -> b(-617376241, var9 ^ 2050038908);
            case 175 -> b(-617376242, var9 ^ 1590013899);
            case 176 -> b(-617376239, var9 ^ 782578415);
            case 177 -> b(-617376240, var9 ^ 1392860923);
            case 178 -> b(-617376237, var9 ^ 622870998);
            case 179 -> b(-617376238, var9 ^ -1278332455);
            case 180 -> b(-617376235, var9 ^ -245710377);
            case 181 -> b(-617376236, var9 ^ 2115030812);
            case 182 -> b(-617376233, var9 ^ 987095229);
            case 183 -> 4;
            case 184 -> b(-617376234, var9 ^ -653599822);
            case 185 -> b(-617376231, var9 ^ -2031952650);
            case 186 -> b(-617376232, var9 ^ 1233489637);
            case 187 -> b(-617376229, var9 ^ -1717628722);
            case 188 -> b(-617376230, var9 ^ -122664970);
            case 189 -> b(-617376227, var9 ^ 1056545055);
            case 190 -> b(-617376228, var9 ^ 639428321);
            case 191 -> b(-617376225, var9 ^ 2051587524);
            case 192 -> b(-617376226, var9 ^ -1826073545);
            case 193 -> b(-617376159, var9 ^ 2046645513);
            case 194 -> b(-617376160, var9 ^ -1096776689);
            case 195 -> b(-617376157, var9 ^ 731022290);
            case 196 -> b(-617376158, var9 ^ -699194307);
            case 197 -> b(-617376155, var9 ^ -109821899);
            case 198 -> b(-617376156, var9 ^ 990270993);
            case 199 -> b(-617376153, var9 ^ 1477269356);
            case 200 -> b(-617376154, var9 ^ -528052534);
            case 201 -> b(-617376151, var9 ^ 984242521);
            case 202 -> b(-617376152, var9 ^ 31485537);
            case 203 -> b(-617376149, var9 ^ 1769385733);
            case 204 -> b(-617376150, var9 ^ -479573525);
            case 205 -> b(-617376147, var9 ^ 373903219);
            case 206 -> b(-617376148, var9 ^ 951628807);
            case 207 -> b(-617376145, var9 ^ 309080582);
            case 208 -> b(-617376146, var9 ^ 1605741129);
            case 209 -> b(-617376143, var9 ^ -1044338426);
            case 210 -> b(-617376144, var9 ^ 1452488682);
            case 211 -> b(-617376141, var9 ^ 683217436);
            case 212 -> b(-617376142, var9 ^ 147176856);
            case 213 -> b(-617376139, var9 ^ -238132193);
            case 214 -> b(-617376140, var9 ^ -355741431);
            case 215 -> b(-617376137, var9 ^ 257174249);
            case 216 -> b(-617376138, var9 ^ -1720486289);
            case 217 -> b(-617376135, var9 ^ -1905032427);
            case 218 -> b(-617376136, var9 ^ 567604901);
            case 219 -> b(-617376133, var9 ^ 1123343561);
            case 220 -> b(-617376134, var9 ^ -415909302);
            case 221 -> b(-617376131, var9 ^ -1122385845);
            case 222 -> b(-617376132, var9 ^ 1830242778);
            case 223 -> b(-617376129, var9 ^ 5134388);
            case 224 -> b(-617376130, var9 ^ -109464456);
            case 225 -> b(-617376191, var9 ^ 2090964577);
            case 226 -> b(-617376192, var9 ^ -1242797893);
            case 227 -> b(-617376189, var9 ^ -310474957);
            case 228 -> b(-617376190, var9 ^ 2121329893);
            case 229 -> b(-617376187, var9 ^ -779761837);
            case 230 -> b(-617376188, var9 ^ 1683626714);
            case 231 -> b(-617376185, var9 ^ 1736955540);
            case 232 -> b(-617376186, var9 ^ 1331513514);
            case 233 -> b(-617376183, var9 ^ 1862374827);
            case 234 -> b(-617376184, var9 ^ -709688878);
            case 235 -> b(-617376181, var9 ^ 102154909);
            case 236 -> b(-617376182, var9 ^ 24315035);
            case 237 -> b(-617376179, var9 ^ 134930582);
            case 238 -> b(-617376180, var9 ^ 519691766);
            case 239 -> b(-617376177, var9 ^ 1585161796);
            case 240 -> b(-617376178, var9 ^ 2074504701);
            case 241 -> b(-617376175, var9 ^ 1273753284);
            case 242 -> b(-617376176, var9 ^ -517104466);
            case 243 -> b(-617376173, var9 ^ -1419507100);
            case 244 -> b(-617376174, var9 ^ 475338621);
            case 245 -> b(-617376171, var9 ^ 868715192);
            case 246 -> b(-617376172, var9 ^ -846066134);
            case 247 -> b(-617376169, var9 ^ 816191358);
            case 248 -> b(-617376170, var9 ^ -1360705789);
            case 249 -> b(-617376167, var9 ^ -114413851);
            case 250 -> b(-617376168, var9 ^ -438070655);
            case 251 -> b(-617376165, var9 ^ -1484479239);
            case 252 -> b(-617376166, var9 ^ -1906697842);
            case 253 -> b(-617376163, var9 ^ -64041575);
            case 254 -> b(-617376164, var9 ^ -1177557710);
            default -> b(-617376161, var9 ^ -143036041);
         };
         int var5 = (var1 & b(-617376162, var9 ^ -1624434794)) - var4;
         if (var5 < 0) {
            var5 += 256;
         }

         int var6 = ((var1 & b(-617375839, var9 ^ -19239028)) >>> b(-617375840, var9 ^ -822943601)) - var4;
         if (var6 < 0) {
            var6 += 256;
         }

         for (int var7 = 0; var7 < var3.length; var7++) {
            int var8 = var7 % 2;
            char var10002 = var3[var7];
            if (var8 == 0) {
               var3[var7] = (char)(var10002 ^ var5);
               var5 = ((var5 >>> 3 | var5 << 5) ^ var3[var7]) & b(-617375837, var9 ^ -2091112437);
            } else {
               var3[var7] = (char)(var10002 ^ var6);
               var6 = ((var6 >>> 3 | var6 << 5) ^ var3[var7]) & b(-617375838, var9 ^ -1710676935);
            }
         }

         aab[var2] = new String(var3).intern();
      }

      return aab[var2];
   }

   public void bb() {
      this.bb = true;
   }

   private static int a(int var0, long var1) {
      int var3 = var0 ^ (int)(var1 & 32767L) ^ b(-617375835, -1634214345 ^ 1279839975);
      if (aba[var3] == null) {
         aba[var3] = (int)(aaa[var3] ^ var1);
      }

      return aba[var3];
   }

   private static long aaa(int var0, long var1) {
      int var3 = (var0 ^ (int)var1 ^ b(-617375836, 1022935408 ^ 1326622334)) & b(-617375833, 1022935408 ^ 339012249);
      if (ba[var3] == null) {
         ba[var3] = ab[var3] ^ var1;
      }

      return ba[var3];
   }

   // $VF: Irreducible bytecode was duplicated to produce valid code
   static {
      int var33 = 74643802;
      short var28 = 7784;
      int var10001 = "a㍝묎꣣춳礔\ud9a0쮤\ue3ba\udba5蚨여퍍䀟肻뒌\u086e肳ⴞ㿣\udaad㡽罯ﾛᕑ\uf2e4ꣂ৬㵮褤蔐\uefa2ば\u218d\uedb7뒈첫誅屌\ued16ⵆ씑\uf861꤈ﴝ\uea92镆艿宣㪯\ue186옵\uf25a眍\uec37퉞찤Ὣ潂螏肋驰韉奾숚Ἵ힎螚곓셔\u07fc\ud8ee牰뢑\u0ad7衼\u0604᠖ߦ퍹ꮪ῁\uf659\uf0acŀ창⏎Хĸ泒⍒\u0ad3߆폁㊅뚄蒻沽\u0010열ౄ옘䱕윸豮쒜豆엔챬쐈\u0c54의ై옼豑\n혠쵧핼\u0d49힜赢ퟐൊퟀൽ\u0010០腞ᒴ腡ᘠōᚘ腝ᓈ셕ᙨŦᒜ䅜ᖨ셳\n㬯㎷㡳\uf399㪓玲㫟\uf39a㫏\uf3ad\u0010々匏㇍匤㌁팥㇅北ㅝጏ㉹錄㈽匤らጰ\nꯥ骻ꢹ媕꩙\udabeꨕ媖ꨅ媡"
         .length();
      int var27 = 0;
      int var26 = 0;
      String[] var25 = new String[7];
      int var24 = var10001;
      String var23 = "a㍝묎꣣춳礔\ud9a0쮤\ue3ba\udba5蚨여퍍䀟肻뒌\u086e肳ⴞ㿣\udaad㡽罯ﾛᕑ\uf2e4ꣂ৬㵮褤蔐\uefa2ば\u218d\uedb7뒈첫誅屌\ued16ⵆ씑\uf861꤈ﴝ\uea92镆艿宣㪯\ue186옵\uf25a眍\uec37퉞찤Ὣ潂螏肋驰韉奾숚Ἵ힎螚곓셔\u07fc\ud8ee牰뢑\u0ad7衼\u0604᠖ߦ퍹ꮪ῁\uf659\uf0acŀ창⏎Хĸ泒⍒\u0ad3߆폁㊅뚄蒻沽\u0010열ౄ옘䱕윸豮쒜豆엔챬쐈\u0c54의ై옼豑\n혠쵧핼\u0d49힜赢ퟐൊퟀൽ\u0010០腞ᒴ腡ᘠōᚘ腝ᓈ셕ᙨŦᒜ䅜ᖨ셳\n㬯㎷㡳\uf399㪓玲㫟\uf39a㫏\uf3ad\u0010々匏㇍匤㌁팥㇅北ㅝጏ㉹錄㈽匤らጰ\nꯥ骻ꢹ媕꩙\udabeꨕ媖ꨅ媡";

      do {
         int var31 = 0;
         char var29 = var23.charAt(var27);
         char[] var30 = var23.substring(var27 + 1, var27 + 1 + var29).toCharArray();

         do {
            char var32 = var30[var31];
            if (var31 % 2 == 0) {
               var30[var31] = (char)((var32 >>> 2 | var32 << 14) & 65535 ^ var28);
            } else {
               var30[var31] = (char)((var32 << 2 | var32 >>> 14) & 65535 ^ var28);
            }
         } while (++var31 < var30.length);

         var25[var26] = new String(var30);
         var26++;
         var27 = var27 + var29 + 1;
      } while (var27 < var24);

      bab = var25;
      bba = new Object[var25.length];
      baa = new int[307];
      byte var10000 = 0;
      int var37 = 0;
      byte[] var10002 = "#ºê\u00923\u001c\u0089Ý^\u000fkÂmê\rw\u0099À\u0095ûÓÏîÑÐ\u0092%Hy\fÜ\u008b4!\u0094.\u008fî µ\u0095I\u001d|4$8\u0017\u0010\u000f«ç% Ïùó6\u0080\u0013k«C7¼\u007f\u0007aªù@îÇòø9\u0084ÏX2´´I\u0089©ÅÜm8¥µ\u008bï£Ã]Ie~c1D\u000f\u0086{üß\nH\u008b\u0004~\"ø;XÉ[\u00855¤$ÀtÕGh\u0083²ö¡üÕy}\nqC8\u001c\u008bZ\u000b¬¦r6\u0085Z\u0013½\u00adÞQ\u008eWû¢x\u0092d@\u0018\f[HQ>°\u00ad\u0085\u009cX0Ù¿3ÄVW\u0011ÞwZöð¸÷I=\u0002\u0095\u001bÖÉéã_N\u0012¶ä\u0081S-tEô<\u009dºTÎ\u0015Î\u0013>Jä;Úü¾¹+ç¹\b¶C3Ü¼#f{}\u001a\u0016\u00adV¸]:êì²K;%\u001b¸÷£ãF ù¾2Êàz9é\u009eáb\u0011\u0005&Eô\u0084i\u001c-\u0086;'iÛ'\u000b\u009d\u009f©\u0004Ô´Ëæ*P\"\u009dVfµ\u0013Y\u0012±ÑoÂ¿£)\n£F\u008a\u0092\u0013Ð\u0000áè»ó\u0012Ór\u008d¢®ì'\u0092N\u000bQËÔ¬¬Õýä\u009aµõ\u0095(ý\u0084Q*\u0098\u009dÅ\u0006\u008c¿~\u009cEÍ\u000f®\u001f~¬\u0014\rG\u0012ÈæY\raaz^ÇT\u000fÁ#<ÿÿ\f\u001bÑ=\u0084\u0018\u0006\u001d³ËË;ß\u0096\u0090þ\u00012\u0010\u0094\fß-\u009fêUkú\u008dó\bÁKÃ½ðe\u001b)\u000eÅMfcêç*\u0019=\u0001]r¯Ág¸F\u000fGF¨\u0095\u001eÚ\u008f\u008fó\u0011$Þ)\u0000\u001d/Zá\u0015\u0016\u007f\u0011Èñ}Áí MY3Ìúã\u0094²\t\u0093wÔ\u0084\u000e(k±sÔ²\u0003¥öäÎCv\u008adú7gT¶¢p\u009d@\u0094¤\u000fCkEüZÔ©-Öh±Ý\nzÇ´\u008a¯úÊ¹\u0013\u0084\u000f\u000e0\u000f©Ë4¸ÌcÐas\u000f`\u0084õ±øÙço(\rÄ£\u0097ÆKø^núûpP\u0098lX{Øå4ÃZ\u001dß\u0083yÄ\u001a<Çî\u007föÆ\u009f+±Ä4/\u0080£{°ñÛ}ý2nÜÔ>=fò(Ó&©\u008d²Î\u0004²U\u0004'ð$õ\u008c¡á>\u0096©\u0088}nôâ°þÝ\u00ad-\u0013õÜÞ×½ÀvAçÉ]¿\u0091ñq\u0080P¿\u008dR\b[Ñ\u0092ö[mãcÚäËe\u0010A³\u008bY\u008b!\u0004!\u0016JÏ²\u0012Þùgb\u000bFT\u009a/²ç\r -!\u0093Ý\u008dLì«¨R5=F\"%\u007fÒÒ\u0086ð\u0098Ý\r´]óØW\u0082Ç?\bjÏQ8òÆ\u0017\u0017\u0017\u0002\u0081v8T\n°q\u0085\u009d¨\u0094úiôÀ¡B\u001d G®÷uGL0(\u0098ú¥\u001a\u0090\u0012XÛ7.wüSÕµ\u008eE\u0014Ö\u0085EAn\u000e\u009dÐ´\"J@\u008fh}\u0011çþ½AmâZÉ\u0098Á\\\b¶0§Òc\u001bz{Ñ=¹eOHº¥Ø\u001b$;¦1\u0000c\u0086M®\u009d\u007fFw\u008fdCÂ\u0017\u0081Ü9N\u0017ûd\u001f\u0000û\u0090\u009b¯\\ä÷Ì|Ï\u000ei½©ù3\u0091Ü¤ã\u009fZm\u008eÆKPwñ¦Sò)\u0084~;d{Ocö\u0094eðøð,_\rÔñêÒ\t2\u0016ð\u009e8ÁÕ[ß\u001evÝ\u0018[;\u0012\u008e\u0088\u009eÑ\f\u008fû\u0016\u008e\u0086\u0082ò\u008d\u0090qÎ\fÐó´<õ.~;Åcò\u0004o¥\u008f\u0085%ì\u00189\u0092Ý\u0004&½O\u0099\u008aC\u001a\u001dø¾.\u0005~ mT÷w¦=Åkk\u0081±Öóì_ÿ-Q r¦Þ(È¸\u00ad yñcr\u0011¥\u0004?\u008f¬&Ú¿\u0085©Ñ\rÔ:_\u0014\u00816lí2:\u008d³ø\u0083Q\u0017!\u001d50é£ú\u007fêZ\u0098zØq¢W\f\u001fÓRZ\u0090\u009aê¿.úÕ£ï\u00ad\u008bÛ\u001bhé'\u0090´\u0006þ¯þiN\u00844\u000b\u00ad\u0083ÿF_<½Èù®r+¼¥cPH\u0090u\u0011M6Ý\u00adõé\u0089b\u000f\u009e\u0018ÜÈ©\u001fs.=\u0011\u009b÷ñè7u\u0004,À8\u0010¥ ËGOLQîÓ\u0007Û\u0090¹äNÐ¸l#ù¡iüþg2@ß{[D*\u008b·~\u0085m\u0014hû\u0099ÂÌç£\ta¨\u0082Ê\u0096\u0015ÖFß@\u0013hîf\u007f;\u001d\u0017\u001d¹\u001f¡¡ï\u008fk»\rá\u0095×ëC¶ô"
         .getBytes("ISO-8859-1");

      int var74;
      do {
         baa[var10000] = ((var10002[var37] & 255) << 24 | (var10002[var37 + 1] & 255) << 16 | (var10002[var37 + 2] & 255) << 8 | var10002[var37 + 3] & 255)
            ^ -455165831;
         var10000 += 1;
         var74 = var37 + 4;
         var37 += 4;
      } while (var74 < var10002.length);

      String[] var21 = new String[2];
      int var19 = 0;
      String var18;
      int var20 = (var18 = abb('\ue12c', (byte)-50, 502390036, (short)-7081, 1369935816, '㟘')).length();
      int var17 = b(-617375826, var33 ^ -759636174);
      int var16 = -1;

      while (true) {
         label107: {
            char[] var40 = var18.substring(++var16, var16 + var17).toCharArray();
            var74 = var40.length;
            int var22 = 0;
            var60 = var40;
            var37 = var74;
            char[] var78;
            int var95;
            if (var74 <= 1) {
               var78 = var40;
               var95 = var22;
            } else {
               var60 = var40;
               var37 = var74;
               if (var74 <= var22) {
                  break label107;
               }

               var78 = var40;
               var95 = var22;
            }

            while (true) {
               var78[var95] = (char)(var78[var95] ^ switch (var22 % b(-617375823, var33 ^ 1029824614)) {
                  case 0 -> b(-617375824, var33 ^ -1389457348);
                  case 1 -> b(-617375821, var33 ^ 808635482);
                  case 2 -> b(-617375822, var33 ^ -2109790083);
                  case 3 -> b(-617375819, var33 ^ 211400073);
                  case 4 -> b(-617375820, var33 ^ -270749389);
                  case 5 -> b(-617375817, var33 ^ -1809283899);
                  default -> b(-617375818, var33 ^ -718462451);
               });
               var22++;
               if (var37 == 0) {
                  var95 = var37;
                  var78 = var60;
               } else {
                  if (var37 <= var22) {
                     break;
                  }

                  var78 = var60;
                  var95 = var22;
               }
            }
         }

         String var85 = new String(var60).intern();
         int var47 = -1;
         var21[var19++] = var85;
         if ((var16 += var17) >= var20) {
            abb = var21;
            aab = new String[2];
            long var8 = 9009366944474998103L;
            long[] var14 = new long[4];
            int var11 = 0;
            String var12;
            int var13 = (var12 = abb(18485, (byte)102, -661728, 7864, 1369935817, '\ue6d1')).length();
            byte var10 = 0;

            label91:
            while (true) {
               var47 = var10;
               var10 += 8;
               byte[] var15 = var12.substring(var47, var10).getBytes(abb((char)'꼨', 72, 470462836, (short)-8507, 1369935818, '鏆'));
               long[] var36 = var14;
               var47 = var11++;
               long var65 = (var15[0] & 255L) << b(-617375815, var33 ^ 1771437384)
                  | (var15[1] & 255L) << b(-617375816, var33 ^ -1502639408)
                  | (var15[2] & 255L) << b(-617375813, var33 ^ 413711788)
                  | (var15[3] & 255L) << b(-617375814, var33 ^ -1219614293)
                  | (var15[4] & 255L) << b(-617375811, var33 ^ -1603748275)
                  | (var15[5] & 255L) << b(-617375812, var33 ^ 216681344)
                  | (var15[b(-617375809, var33 ^ -72917196)] & 255L) << b(-617375810, var33 ^ 458492121)
                  | var15[b(-617375871, var33 ^ 2010030459)] & 255L;
               byte var86 = -1;

               while (true) {
                  long var97 = var65 ^ var8;
                  switch (var86) {
                     case 0:
                        var36[var47] = var97;
                        if (var10 >= var13) {
                           aaa = var14;
                           aba = new Integer[4];
                           long var0 = 716525182829147212L;
                           long[] var6 = new long[2];
                           int var3 = 0;
                           String var4;
                           int var5 = (var4 = abb('ⴔ', (byte)103, 838601633, (short)28923, 1369935821, 31997)).length();
                           byte var2 = 0;

                           do {
                              int var51 = var2;
                              var2 += 8;
                              byte[] var7 = var4.substring(var51, var2).getBytes(abb((char)'ﺎ', (byte)25, 166417277, 4524, 1369935822, (char)'뀤'));
                              var51 = var3++;
                              var97 = (
                                    (var7[0] & 255L) << b(-617375861, var33 ^ -855524239)
                                       | (var7[1] & 255L) << b(-617375862, var33 ^ 251003180)
                                       | (var7[2] & 255L) << b(-617375859, var33 ^ -2101390186)
                                       | (var7[3] & 255L) << b(-617375860, var33 ^ -1399950605)
                                       | (var7[4] & 255L) << b(-617375857, var33 ^ 8542346)
                                       | (var7[5] & 255L) << b(-617375858, var33 ^ -2105479617)
                                       | (var7[b(-617375855, var33 ^ -737139708)] & 255L) << b(-617375856, var33 ^ 914283119)
                                       | var7[b(-617375853, var33 ^ -790824626)] & 255L
                                 )
                                 ^ var0;
                              var86 = -1;
                              var6[var51] = var97;
                           } while (var2 < var5);

                           ab = var6;
                           ba = new Long[2];
                           aa = new String[2];
                           aab();
                           return;
                        }
                        break;
                     default:
                        var36[var47] = var97;
                        if (var10 < var13) {
                           continue label91;
                        }

                        var13 = (var12 = abb('䦼', (byte)-48, -1894417051, (short)-18556, 1369935819, 8031)).length();
                        var10 = 0;
                  }

                  byte var50 = var10;
                  var10 += 8;
                  var15 = var12.substring(var50, var10).getBytes(abb('\u0cba', (byte)-92, 949781923, (short)7732, 1369935820, '샛'));
                  var36 = var14;
                  var47 = var11++;
                  var65 = (var15[0] & 255L) << b(-617375872, var33 ^ -1011121087)
                     | (var15[1] & 255L) << b(-617375869, var33 ^ 539935819)
                     | (var15[2] & 255L) << b(-617375870, var33 ^ -1471943381)
                     | (var15[3] & 255L) << b(-617375867, var33 ^ -1382225182)
                     | (var15[4] & 255L) << b(-617375868, var33 ^ 165646567)
                     | (var15[5] & 255L) << b(-617375865, var33 ^ 1624991004)
                     | (var15[b(-617375866, var33 ^ -1931359547)] & 255L) << b(-617375863, var33 ^ 804762680)
                     | var15[b(-617375864, var33 ^ -111958014)] & 255L;
                  var86 = 0;
               }
            }
         }

         var17 = var18.charAt(var16);
      }
   }

   @Override
   public void aabaa() {
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
      // 08: iload 1
      // 09: ifne 33
      // 0c: aload 2
      // 0d: getfield net/minecraft/class_310.field_1724 Lnet/minecraft/class_746;
      // 10: ifnull 2a
      // 13: goto 17
      // 16: athrow
      // 17: aload 2
      // 18: iload 1
      // 19: ifne 3a
      // 1c: goto 20
      // 1f: athrow
      // 20: invokevirtual net/minecraft/class_310.method_1562 ()Lnet/minecraft/class_634;
      // 23: ifnonnull 34
      // 26: goto 2a
      // 29: athrow
      // 2a: aload 0
      // 2b: bipush 0
      // 2c: putfield qeaa361f143ee4a0894bd168fd9b30c66/qf4ccf8f5435d4a78bdca4d6a018b578e/bbab.bb Z
      // 2f: goto 33
      // 32: athrow
      // 33: return
      // 34: aload 0
      // 35: bipush 1
      // 36: putfield qeaa361f143ee4a0894bd168fd9b30c66/qf4ccf8f5435d4a78bdca4d6a018b578e/bbab.bb Z
      // 39: aload 2
      // 3a: invokevirtual net/minecraft/class_310.method_1562 ()Lnet/minecraft/class_634;
      // 3d: new net/minecraft/class_2815
      // 40: dup
      // 41: aload 2
      // 42: getfield net/minecraft/class_310.field_1724 Lnet/minecraft/class_746;
      // 45: getfield net/minecraft/class_746.field_7498 Lnet/minecraft/class_1723;
      // 48: getfield net/minecraft/class_1723.field_7763 I
      // 4b: invokespecial net/minecraft/class_2815.<init> (I)V
      // 4e: invokevirtual net/minecraft/class_634.method_52787 (Lnet/minecraft/class_2596;)V
      // 51: return
   }

   private static void aab() {
      int var0 = -1986844877;
      aa[0] = ab(
         ba(b(-617375834, var0 ^ -2036927804), b(-617375831, var0 ^ -912976930)).toCharArray(),
         aaa(b(-617375832, var0 ^ -861420255), 991984369936046613L),
         a(b(-617375829, var0 ^ -512517790), 7052959591067957176L)
      );
      aa[1] = ab(
         ba(b(-617375830, var0 ^ -467287633), b(-617375827, var0 ^ 1556155908)).toCharArray(),
         aaa(b(-617375828, var0 ^ -1675373673), 5173669719078798515L),
         a(b(-617375825, var0 ^ 1034201309), 1767945653232298681L)
      );
   }

   public boolean aba() {
      return this.babbaab();
   }

   private static int b(int var0, int var1) {
      int var2 = baa[var0 ^ -617376095] ^ var1 ^ var0;
      var2 ^= 51857;
      var2 -= 43373;
      var2 ^= 24170;
      var2 ^= 62014;
      var2 -= 44220;
      var2 ^= 35501;
      var2 ^= 15610;
      var2 += 14359;
      return var2 + 55303;
   }

   @Override
   public void abaab() {
      this.bb = false;
   }
}
