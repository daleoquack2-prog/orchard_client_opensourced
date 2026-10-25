package nsc;

import net.fabricmc.api.EnvType;
import net.fabricmc.api.Environment;

@Environment(EnvType.CLIENT)
public final class babbaaba extends abbaabbaa {
   private static final String[] aa;
   private static final String[] baa;
   private static final Object[] bab;
   private static final int[] abb;
   private static final String[] ab;
   private static final Long[] ba;
   private static final long[] bb;
   private static final Integer[] aaa;
   private static String[] aab;
   private static final long[] aba;

   private static int aa(int var0, long var1) {
      int var3 = var0 ^ (int)(var1 & 32767L) ^ a(46789903, 103474578 ^ -945079090);
      if (aaa[var3] == null) {
         aaa[var3] = (int)(aba[var3] ^ var1);
      }

      return aaa[var3];
   }

   private static String ab(char[] var0, long var1, int var3) {
      int var4 = aa(a(46789902, -1064605007 ^ 1528385605), 7959735073942881679L) ^ var3;

      for (int var5 = 0; var5 < var0.length; var5++) {
         int var7 = var4 ^ (int)var1 ^ ~var5;
         int var8 = var7 ^ var3 - var5 * var0.length;
         var4 = -var8 * var3 | var5;
         var0[var5] = (char)(var0[var5] ^ var4);
         int var6 = var5 & aa(a(46789901, -1064605007 ^ 656114919), 2564035148918414403L);
         var3 = var3 << var6 | var3 >>> -var6;
         var1 ^= var6;
      }

      return new String(var0);
   }

   public static boolean ba() {
      // $VF: Couldn't be decompiled
      // Please report this to the Vineflower issue tracker, at https://github.com/Vineflower/vineflower/issues with a copy of the class file (if you have the rights to distribute it!)
      // java.lang.RuntimeException: parsing failure!
      //   at org.jetbrains.java.decompiler.modules.decompiler.decompose.DomHelper.parseGraph(DomHelper.java:211)
      //   at org.jetbrains.java.decompiler.main.rels.MethodProcessor.codeToJava(MethodProcessor.java:166)
      //
      // Bytecode:
      // 00: getstatic qeaa361f143ee4a0894bd168fd9b30c66/qf4ccf8f5435d4a78bdca4d6a018b578e/baaabbaa.bba I
      // 03: istore 0
      // 04: invokestatic qeaa361f143ee4a0894bd168fd9b30c66/qf4ccf8f5435d4a78bdca4d6a018b578e/abaaaaaba.aaaaa ()Lqeaa361f143ee4a0894bd168fd9b30c66/qf4ccf8f5435d4a78bdca4d6a018b578e/abaaaaaba;
      // 07: astore 1
      // 08: aload 1
      // 09: iload 0
      // 0a: ifne 15
      // 0d: ifnull 23
      // 10: goto 14
      // 13: athrow
      // 14: aload 1
      // 15: iload 0
      // 16: ifne 27
      // 19: invokevirtual qeaa361f143ee4a0894bd168fd9b30c66/qf4ccf8f5435d4a78bdca4d6a018b578e/abaaaaaba.aaba ()Lqeaa361f143ee4a0894bd168fd9b30c66/qf4ccf8f5435d4a78bdca4d6a018b578e/babbaba;
      // 1c: ifnonnull 26
      // 1f: goto 23
      // 22: athrow
      // 23: bipush 0
      // 24: ireturn
      // 25: athrow
      // 26: aload 1
      // 27: iload 0
      // 28: ifne 3d
      // 2b: invokevirtual qeaa361f143ee4a0894bd168fd9b30c66/qf4ccf8f5435d4a78bdca4d6a018b578e/abaaaaaba.aaba ()Lqeaa361f143ee4a0894bd168fd9b30c66/qf4ccf8f5435d4a78bdca4d6a018b578e/babbaba;
      // 2e: invokevirtual qeaa361f143ee4a0894bd168fd9b30c66/qf4ccf8f5435d4a78bdca4d6a018b578e/babbaba.bbbbbb ()Lqeaa361f143ee4a0894bd168fd9b30c66/qf4ccf8f5435d4a78bdca4d6a018b578e/babbaaba;
      // 31: ifnull 55
      // 34: goto 38
      // 37: athrow
      // 38: aload 1
      // 39: goto 3d
      // 3c: athrow
      // 3d: invokevirtual qeaa361f143ee4a0894bd168fd9b30c66/qf4ccf8f5435d4a78bdca4d6a018b578e/abaaaaaba.aaba ()Lqeaa361f143ee4a0894bd168fd9b30c66/qf4ccf8f5435d4a78bdca4d6a018b578e/babbaba;
      // 40: invokevirtual qeaa361f143ee4a0894bd168fd9b30c66/qf4ccf8f5435d4a78bdca4d6a018b578e/babbaba.bbbbbb ()Lqeaa361f143ee4a0894bd168fd9b30c66/qf4ccf8f5435d4a78bdca4d6a018b578e/babbaaba;
      // 43: invokevirtual qeaa361f143ee4a0894bd168fd9b30c66/qf4ccf8f5435d4a78bdca4d6a018b578e/babbaaba.babbaab ()Z
      // 46: iload 0
      // 47: ifne 52
      // 4a: ifeq 55
      // 4d: goto 51
      // 50: athrow
      // 51: bipush 1
      // 52: goto 56
      // 55: bipush 0
      // 56: ireturn
   }

   private static int a(int var0, int var1) {
      int var2 = abb[var0 ^ 46789931] ^ var1 ^ var0;
      var2 -= 25208;
      var2 += 59463;
      var2 ^= 5160;
      var2 += 55844;
      var2 ^= 22172;
      var2 += 48579;
      var2 -= 7294;
      var2 -= 20571;
      var2 ^= 46519;
      return var2 + 17003;
   }

   private static long bb(int var0, long var1) {
      int var3 = (var0 ^ (int)var1 ^ a(46789900, -1274618463 ^ -1936914959)) & a(46789891, -1274618463 ^ 1201596553);
      if (ba[var3] == null) {
         ba[var3] = bb[var3] ^ var1;
      }

      return ba[var3];
   }

   private static String b(int var0, int var1, int var2) {
      int var3 = var1 ^ 57068;
      char[] var4 = baa[var3].toCharArray();
      StackTraceElement[] var5 = (StackTraceElement[])bab[var3];
      StackTraceElement[] var6;
      if (var5 != null) {
         var6 = var5;
      } else {
         var6 = new Throwable().getStackTrace();
         bab[var3] = var6;
      }

      StackTraceElement var7 = var6[1];
      int var8 = (var7.getClassName().hashCode() ^ var7.getMethodName().hashCode()) >> 16 ^ 6990;
      int var9 = 0;

      do {
         int var10 = var4[var9] - '겢';
         var10 += 10023;
         var10 ^= 48860;
         var10 -= 19694;
         var10 -= 26235;
         var10 ^= 4424;
         var10 -= 25398;
         var4[var9] = (char)(var10 ^ var8 ^ var2 ^ var0 >> 16);
      } while (++var9 < var4.length);

      return new String(var4).intern();
   }

   private static String aaa(int var0, int var1) {
      int var9 = 1901012650;
      int var2 = (var0 ^ a(46789890, var9 ^ -812580196)) & a(46789889, var9 ^ 661707138);
      if (ab[var2] == null) {
         char[] var3 = aa[var2].toCharArray();

         int var4 = switch (var3[0] & a(46789888, var9 ^ -1370825102)) {
            case 0 -> a(46789895, var9 ^ 1917451647);
            case 1 -> a(46789894, var9 ^ 591043150);
            case 2 -> a(46789893, var9 ^ -669774314);
            case 3 -> a(46789892, var9 ^ 1619518212);
            case 4 -> a(46789915, var9 ^ -1047828175);
            case 5 -> a(46789914, var9 ^ -1404893829);
            case 6 -> a(46789913, var9 ^ 1442146778);
            case 7 -> a(46789912, var9 ^ 1476206465);
            case 8 -> a(46789919, var9 ^ -450336313);
            case 9 -> a(46789918, var9 ^ -1139130992);
            case 10 -> a(46789917, var9 ^ 321031521);
            case 11 -> a(46789916, var9 ^ -1040197500);
            case 12 -> a(46789907, var9 ^ 324504405);
            case 13 -> a(46789906, var9 ^ -1236577581);
            case 14 -> a(46789905, var9 ^ 1052395915);
            case 15 -> a(46789904, var9 ^ 1714516946);
            case 16 -> a(46789911, var9 ^ 1945219039);
            case 17 -> a(46789910, var9 ^ 1316986716);
            case 18 -> a(46789909, var9 ^ 1664729410);
            case 19 -> a(46789908, var9 ^ -1366305037);
            case 20 -> a(46789995, var9 ^ 1558711697);
            case 21 -> a(46789994, var9 ^ 2138778262);
            case 22 -> a(46789993, var9 ^ 1922614135);
            case 23 -> a(46789992, var9 ^ -374192433);
            case 24 -> a(46789999, var9 ^ 1941073583);
            case 25 -> a(46789998, var9 ^ -1761853808);
            case 26 -> a(46789997, var9 ^ 117920934);
            case 27 -> a(46789996, var9 ^ 89450050);
            case 28 -> a(46789987, var9 ^ 302864535);
            case 29 -> a(46789986, var9 ^ -754276985);
            case 30 -> a(46789985, var9 ^ -682254956);
            case 31 -> a(46789984, var9 ^ -1952298396);
            case 32 -> a(46789991, var9 ^ -200885499);
            case 33 -> a(46789990, var9 ^ -173185460);
            case 34 -> a(46789989, var9 ^ 1901849879);
            case 35 -> a(46789988, var9 ^ 209706115);
            case 36 -> a(46790011, var9 ^ -1596589943);
            case 37 -> a(46790010, var9 ^ -296185396);
            case 38 -> a(46790009, var9 ^ -1293306525);
            case 39 -> a(46790008, var9 ^ -710924280);
            case 40 -> a(46790015, var9 ^ 1113345738);
            case 41 -> a(46790014, var9 ^ 1971974706);
            case 42 -> a(46790013, var9 ^ -1610611392);
            case 43 -> a(46790012, var9 ^ 2055262181);
            case 44 -> a(46790003, var9 ^ 852048395);
            case 45 -> a(46790002, var9 ^ -1218100090);
            case 46 -> a(46790001, var9 ^ -253939259);
            case 47 -> a(46790000, var9 ^ -1341740136);
            case 48 -> a(46790007, var9 ^ -1950832629);
            case 49 -> a(46790006, var9 ^ -1332682596);
            case 50 -> a(46790005, var9 ^ -1331642150);
            case 51 -> a(46790004, var9 ^ 1444885675);
            case 52 -> a(46789963, var9 ^ 1418920355);
            case 53 -> a(46789962, var9 ^ 604615234);
            case 54 -> a(46789961, var9 ^ -1410606874);
            case 55 -> a(46789960, var9 ^ 1991150578);
            case 56 -> a(46789967, var9 ^ 492755853);
            case 57 -> a(46789966, var9 ^ 1193957796);
            case 58 -> a(46789965, var9 ^ 956311029);
            case 59 -> a(46789964, var9 ^ -1659535631);
            case 60 -> a(46789955, var9 ^ -2054902212);
            case 61 -> a(46789954, var9 ^ 538286610);
            case 62 -> a(46789953, var9 ^ 780642620);
            case 63 -> a(46789952, var9 ^ -544024285);
            case 64 -> a(46789959, var9 ^ -605843087);
            case 65 -> a(46789958, var9 ^ -189256421);
            case 66 -> a(46789957, var9 ^ -1563812339);
            case 67 -> 4;
            case 68 -> a(46789956, var9 ^ -396283959);
            case 69 -> a(46789979, var9 ^ -1695300742);
            case 70 -> a(46789978, var9 ^ -1780050298);
            case 71 -> a(46789977, var9 ^ 1560198680);
            case 72 -> a(46789976, var9 ^ 910101684);
            case 73 -> a(46789983, var9 ^ 1676379036);
            case 74 -> a(46789982, var9 ^ -1080228865);
            case 75 -> a(46789981, var9 ^ -1538555597);
            case 76 -> a(46789980, var9 ^ 693418840);
            case 77 -> a(46789971, var9 ^ -1209581920);
            case 78 -> a(46789970, var9 ^ -220563569);
            case 79 -> a(46789969, var9 ^ 1098971224);
            case 80 -> a(46789968, var9 ^ -633305751);
            case 81 -> a(46789975, var9 ^ 293168407);
            case 82 -> a(46789974, var9 ^ -1675024933);
            case 83 -> a(46789973, var9 ^ -1221248109);
            case 84 -> a(46789972, var9 ^ 1152704289);
            case 85 -> a(46790059, var9 ^ -639988833);
            case 86 -> a(46790058, var9 ^ -1931475530);
            case 87 -> a(46790057, var9 ^ 796869399);
            case 88 -> a(46790056, var9 ^ -894742335);
            case 89 -> a(46790063, var9 ^ -756898928);
            case 90 -> a(46790062, var9 ^ 1107221960);
            case 91 -> a(46790061, var9 ^ -437824855);
            case 92 -> a(46790060, var9 ^ 93735662);
            case 93 -> a(46790051, var9 ^ -491348271);
            case 94 -> a(46790050, var9 ^ -1901383758);
            case 95 -> a(46790049, var9 ^ -1401711029);
            case 96 -> a(46790048, var9 ^ -1097898767);
            case 97 -> a(46790055, var9 ^ 408409802);
            case 98 -> a(46790054, var9 ^ 1032747932);
            case 99 -> a(46790053, var9 ^ -1873577132);
            case 100 -> a(46790052, var9 ^ -629226459);
            case 101 -> 1;
            case 102 -> a(46790075, var9 ^ -1962837141);
            case 103 -> a(46790074, var9 ^ 627725915);
            case 104 -> a(46790073, var9 ^ 736710095);
            case 105 -> a(46790072, var9 ^ -357002250);
            case 106 -> a(46790079, var9 ^ 29286941);
            case 107 -> a(46790078, var9 ^ -80023267);
            case 108 -> a(46790077, var9 ^ 535957250);
            case 109 -> a(46790076, var9 ^ -990770140);
            case 110 -> a(46790067, var9 ^ 684703381);
            case 111 -> a(46790066, var9 ^ -1025424310);
            case 112 -> 3;
            case 113 -> a(46790065, var9 ^ 1271838418);
            case 114 -> a(46790064, var9 ^ -1237583844);
            case 115 -> a(46790071, var9 ^ 9845030);
            case 116 -> a(46790070, var9 ^ 1819236003);
            case 117 -> a(46790069, var9 ^ 1475660732);
            case 118 -> a(46790068, var9 ^ -354889094);
            case 119 -> a(46790027, var9 ^ -648920645);
            case 120 -> a(46790026, var9 ^ 2004736589);
            case 121 -> a(46790025, var9 ^ 159565665);
            case 122 -> a(46790024, var9 ^ -1498571096);
            case 123 -> a(46790031, var9 ^ 1974422423);
            case 124 -> a(46790030, var9 ^ 8872910);
            case 125 -> a(46790029, var9 ^ -872118173);
            case 126 -> a(46790028, var9 ^ -836791556);
            case 127 -> a(46790019, var9 ^ -554094588);
            case 128 -> a(46790018, var9 ^ -595896503);
            case 129 -> a(46790017, var9 ^ 1309417513);
            case 130 -> a(46790016, var9 ^ 918770930);
            case 131 -> a(46790023, var9 ^ 1170160007);
            case 132 -> a(46790022, var9 ^ -591438688);
            case 133 -> a(46790021, var9 ^ 1946799194);
            case 134 -> a(46790020, var9 ^ 1119547739);
            case 135 -> a(46790043, var9 ^ -999517267);
            case 136 -> a(46790042, var9 ^ -554067806);
            case 137 -> a(46790041, var9 ^ -1633659630);
            case 138 -> a(46790040, var9 ^ 95233422);
            case 139 -> a(46790047, var9 ^ -597719337);
            case 140 -> a(46790046, var9 ^ 1145071226);
            case 141 -> a(46790045, var9 ^ 436367073);
            case 142 -> a(46790044, var9 ^ -773118548);
            case 143 -> a(46790035, var9 ^ 2076887187);
            case 144 -> a(46790034, var9 ^ 1714247215);
            case 145 -> a(46790033, var9 ^ -2051017156);
            case 146 -> a(46790032, var9 ^ -1259760568);
            case 147 -> a(46790039, var9 ^ -2011265764);
            case 148 -> a(46790038, var9 ^ -81213227);
            case 149 -> a(46790037, var9 ^ 1003653777);
            case 150 -> a(46790036, var9 ^ 1479056722);
            case 151 -> a(46790123, var9 ^ -1126605256);
            case 152 -> a(46790122, var9 ^ 1316892128);
            case 153 -> a(46790121, var9 ^ -532291871);
            case 154 -> a(46790120, var9 ^ 485815729);
            case 155 -> a(46790127, var9 ^ -494794925);
            case 156 -> a(46790126, var9 ^ -1907397518);
            case 157 -> a(46790125, var9 ^ -2125287484);
            case 158 -> a(46790124, var9 ^ -546527561);
            case 159 -> a(46790115, var9 ^ 670658676);
            case 160 -> 0;
            case 161 -> a(46790114, var9 ^ -552935208);
            case 162 -> a(46790113, var9 ^ 629835177);
            case 163 -> a(46790112, var9 ^ -1411745535);
            case 164 -> a(46790119, var9 ^ 1367615169);
            case 165 -> a(46790118, var9 ^ -524518582);
            case 166 -> a(46790117, var9 ^ 1136057340);
            case 167 -> a(46790116, var9 ^ -74816991);
            case 168 -> a(46790139, var9 ^ 1794546110);
            case 169 -> a(46790138, var9 ^ -1221654423);
            case 170 -> a(46790137, var9 ^ -1528327584);
            case 171 -> a(46790136, var9 ^ -87128203);
            case 172 -> a(46790143, var9 ^ -1657560011);
            case 173 -> a(46790142, var9 ^ 1744560328);
            case 174 -> a(46790141, var9 ^ -775438017);
            case 175 -> a(46790140, var9 ^ -351942948);
            case 176 -> a(46790131, var9 ^ 1383622320);
            case 177 -> a(46790130, var9 ^ 955451112);
            case 178 -> a(46790129, var9 ^ 778774394);
            case 179 -> a(46790128, var9 ^ 1566485277);
            case 180 -> a(46790135, var9 ^ 631716814);
            case 181 -> a(46790134, var9 ^ 2056168110);
            case 182 -> a(46790133, var9 ^ 1379729142);
            case 183 -> a(46790132, var9 ^ -1328617142);
            case 184 -> a(46790091, var9 ^ 1302991080);
            case 185 -> a(46790090, var9 ^ 714691884);
            case 186 -> a(46790089, var9 ^ -2028420934);
            case 187 -> a(46790088, var9 ^ 1434882657);
            case 188 -> a(46790095, var9 ^ 90136975);
            case 189 -> a(46790094, var9 ^ 1387701748);
            case 190 -> a(46790093, var9 ^ 121624881);
            case 191 -> a(46790092, var9 ^ -1659080474);
            case 192 -> a(46790083, var9 ^ -92120158);
            case 193 -> a(46790082, var9 ^ 1897674154);
            case 194 -> a(46790081, var9 ^ 2053077891);
            case 195 -> a(46790080, var9 ^ -1405035023);
            case 196 -> a(46790087, var9 ^ -1616391933);
            case 197 -> a(46790086, var9 ^ -1907883193);
            case 198 -> a(46790085, var9 ^ -1270838047);
            case 199 -> a(46790084, var9 ^ 418673234);
            case 200 -> a(46790107, var9 ^ -929341067);
            case 201 -> a(46790106, var9 ^ 770223786);
            case 202 -> a(46790105, var9 ^ -1144728306);
            case 203 -> a(46790104, var9 ^ -686619763);
            case 204 -> a(46790111, var9 ^ -2010373865);
            case 205 -> a(46790110, var9 ^ 1570052893);
            case 206 -> a(46790109, var9 ^ 824430393);
            case 207 -> a(46790108, var9 ^ -241894647);
            case 208 -> a(46790099, var9 ^ 36209733);
            case 209 -> a(46790098, var9 ^ 37077951);
            case 210 -> a(46790097, var9 ^ -1157107926);
            case 211 -> 2;
            case 212 -> a(46790096, var9 ^ 747082907);
            case 213 -> a(46790103, var9 ^ -796708474);
            case 214 -> a(46790102, var9 ^ 625518134);
            case 215 -> a(46790101, var9 ^ -1008357218);
            case 216 -> a(46790100, var9 ^ 1666575977);
            case 217 -> a(46789675, var9 ^ -2091394667);
            case 218 -> a(46789674, var9 ^ 463390805);
            case 219 -> a(46789673, var9 ^ -1046424708);
            case 220 -> a(46789672, var9 ^ 526572686);
            case 221 -> a(46789679, var9 ^ 723429191);
            case 222 -> a(46789678, var9 ^ 143106335);
            case 223 -> a(46789677, var9 ^ 908414809);
            case 224 -> a(46789676, var9 ^ -1451502540);
            case 225 -> a(46789667, var9 ^ 774790058);
            case 226 -> a(46789666, var9 ^ -519856437);
            case 227 -> a(46789665, var9 ^ -1219851772);
            case 228 -> a(46789664, var9 ^ 201344535);
            case 229 -> a(46789671, var9 ^ 651807508);
            case 230 -> a(46789670, var9 ^ -518230375);
            case 231 -> a(46789669, var9 ^ -944902953);
            case 232 -> a(46789668, var9 ^ 1838675192);
            case 233 -> a(46789691, var9 ^ 992103427);
            case 234 -> a(46789690, var9 ^ -133066964);
            case 235 -> a(46789689, var9 ^ 86860884);
            case 236 -> a(46789688, var9 ^ -537674277);
            case 237 -> a(46789695, var9 ^ 307303991);
            case 238 -> 5;
            case 239 -> a(46789694, var9 ^ 1245107111);
            case 240 -> a(46789693, var9 ^ -242627789);
            case 241 -> a(46789692, var9 ^ -973123172);
            case 242 -> a(46789683, var9 ^ 919862482);
            case 243 -> a(46789682, var9 ^ -705403279);
            case 244 -> a(46789681, var9 ^ -1645891697);
            case 245 -> a(46789680, var9 ^ -178499677);
            case 246 -> a(46789687, var9 ^ -993721481);
            case 247 -> a(46789686, var9 ^ -627359829);
            case 248 -> a(46789685, var9 ^ -1919104180);
            case 249 -> a(46789684, var9 ^ 1369359625);
            case 250 -> a(46789643, var9 ^ -247232919);
            case 251 -> a(46789642, var9 ^ -359002372);
            case 252 -> a(46789641, var9 ^ -1293978168);
            case 253 -> a(46789640, var9 ^ 398768001);
            case 254 -> a(46789647, var9 ^ 1920348848);
            default -> a(46789646, var9 ^ -15830743);
         };
         int var5 = (var1 & a(46789645, var9 ^ 1502281673)) - var4;
         if (var5 < 0) {
            var5 += 256;
         }

         int var6 = ((var1 & a(46789644, var9 ^ 605407841)) >>> a(46789635, var9 ^ -1127821599)) - var4;
         if (var6 < 0) {
            var6 += 256;
         }

         for (int var7 = 0; var7 < var3.length; var7++) {
            int var8 = var7 % 2;
            char var10002 = var3[var7];
            if (var8 == 0) {
               var3[var7] = (char)(var10002 ^ var5);
               var5 = ((var5 >>> 3 | var5 << 5) ^ var3[var7]) & a(46789634, var9 ^ 1799569576);
            } else {
               var3[var7] = (char)(var10002 ^ var6);
               var6 = ((var6 >>> 3 | var6 << 5) ^ var3[var7]) & a(46789633, var9 ^ 1081712344);
            }
         }

         ab[var2] = new String(var3).intern();
      }

      return ab[var2];
   }

   public babbaaba() {
      super(
         aabbaaaba.aaab(aab[1]),
         bbaabbba.bab,
         aabbaaaba.aaab(aab[0])
      );
   }

   // $VF: Irreducible bytecode was duplicated to produce valid code
   static {
      int var33 = 1881354976;
      String[] var10002 = new String[7];
      short var28 = 2975;
      String[] var25 = var10002;
      int var26 = 0;
      int var10001 = "Q찇㐓裻곰擓⯐楏뭗뾮杧몰ቜ骝癢ꜳ湝菗鯢ೈꛌ䊟ꈠ\u20c5⫘뵫픴\uf69d悰\uf0f8ꄦ쨟죥慧\ue35e環ఏ\ueece믝ᄫЉⵢ遻\ua87eﯳ鯇ꐪ뉂ⶖ髥₉ኄ箛猎툼\ue282䰅♧㋯\ue6eaꞳ\ude1dⱧ嚋颶ņ䯿\uf468ﳂ\ue08cͿ슘\uee5b萑彀カ㜪繬곂䨖遾羳\u0010\ue890探\uf7e8揚ﰘϑ\uf6e8쏐\uf468ϖ쉀推\uf648挍솰\ue3f5\n銹♋銩星萱옐螙\ue610蟙\ue61d\u0010↶᭙≶魓죞笢좎孝혆孝퓦\udb77졞\udb5e쥦颋\n\ue555鞘\ue4c5\ud7c8\ueddd瞷\uf0f5垷\uf235埜\u0010쮞ᬯ≆颇Ω\uf885\udd76ᢄ픞᭒풾\udb22핎鬡⇮嬣\n냉\ue6c2낙ꤥ嶂ॶ䦪⥵䥪⚌"
         .length();
      int var27 = 0;
      int var24 = var10001;
      String var23 = "Q찇㐓裻곰擓⯐楏뭗뾮杧몰ቜ骝癢ꜳ湝菗鯢ೈꛌ䊟ꈠ\u20c5⫘뵫픴\uf69d悰\uf0f8ꄦ쨟죥慧\ue35e環ఏ\ueece믝ᄫЉⵢ遻\ua87eﯳ鯇ꐪ뉂ⶖ髥₉ኄ箛猎툼\ue282䰅♧㋯\ue6eaꞳ\ude1dⱧ嚋颶ņ䯿\uf468ﳂ\ue08cͿ슘\uee5b萑彀カ㜪繬곂䨖遾羳\u0010\ue890探\uf7e8揚ﰘϑ\uf6e8쏐\uf468ϖ쉀推\uf648挍솰\ue3f5\n銹♋銩星萱옐螙\ue610蟙\ue61d\u0010↶᭙≶魓죞笢좎孝혆孝퓦\udb77졞\udb5e쥦颋\n\ue555鞘\ue4c5\ud7c8\ueddd瞷\uf0f5垷\uf235埜\u0010쮞ᬯ≆颇Ω\uf885\udd76ᢄ픞᭒풾\udb22핎鬡⇮嬣\n냉\ue6c2낙ꤥ嶂ॶ䦪⥵䥪⚌";

      do {
         char var29 = var23.charAt(var27);
         int var31 = 0;
         char[] var30 = var23.substring(var27 + 1, var27 + 1 + var29).toCharArray();

         do {
            char var32 = var30[var31];
            if (var31 % 2 == 0) {
               var30[var31] = (char)((var32 >>> 3 | var32 << '\r') & 65535 ^ var28);
            } else {
               var30[var31] = (char)((var32 << 3 | var32 >>> '\r') & 65535 ^ var28);
            }
         } while (++var31 < var30.length);

         var25[var26] = new String(var30);
         var26++;
         var27 = var27 + var29 + 1;
      } while (var27 < var24);

      baa = var25;
      bab = new Object[var25.length];
      byte var10000 = 0;
      int var40 = 0;
      abb = new int[307];
      byte[] var59 = "²TÙ|\\$!Ü\u0090O@h\u009fÆ\u0006Ða\u0090\rÊ\u0014A[P¡\u009d\u0001L\u00166J-\u008fÐt\u00ad\u0098¿XúÙM\u001a_õ82ß\u009f\u008a\u008ey\u0017\u0012J²º2#ÒOIG@ì\u0005J\u00adº5-\\ñmí>\u0088÷2j¥9ÿoSåïI\u0003\u000fÅ¥¢Õ3\u008dk\u0092ù\u0080²\u0084ÄI\u0017^R¤4Ø\u001d \u0095\u001aÛ×ö[u¾L¹Nãå}®\u0007ÌeZI\n3ë¢bl\u0084í¥òî\u0005X¶®\"\u0002¦\u0001/~¤ÜÕ¡¼´\u0013j\u00ad¶ª'ê\u001e¦Ï\u000bü¨F2öY\u009a1Ø`ËB²v0l'`\u0088ÿËQ)óLdD;#\u0083½\u008dO$¿\u00856\u0019\rP@ZTb\u0014öûZ«¤)\u0087ðÀû/£\u008d^3z\u0087ÖÂlÒ\u008eI[m\u009b\u0089\u0087x¦\u0007¹¬\u008bAé7F÷óÞ´\u0090%3\u0097\u0003\u0002\u0090\u009aàåý\u0001Ênæ\u009bÊFu~\u0084\u001a÷ï\u007fq×í,Î´úup\u0003;r\u0080Ç?-µÈcÚoü\u001c~\u0093Î\u001dÕN¿\u0099#ÅËä\u0007ô/H\u00adÑ\u0080\u0006 ¸×Z\u0091\u0093Û=Ø\u0000´ª$hZ\u009dñÚ*Hx#î\u0092øæéÚ±\u001fI_\u001dl¨\u0018¥\u0018ËX~\u008eÎcÀ\u0080ÔXèÅÿXØè3¾g\u001cM¼ë'\u0001Ìq\u0096\u0004C\u0093þp\u009eÖ£ùõ&ó¡¯RpnÑx\u0003RumXlmü\u008b[Èm¿fÆÿ\u0081¾7êñÍ3\u009b¸³\u001cÀ\u0005\u009aJ²;\u001e\u0000\u0019\ter\u008bë\u0083}\u009e¾²´\u0086\u009b_ÞG$\u009b\u008b\u0093ªJWå+XL3©3Á,\u0093C_\u009f\u0018(\u001a¢Q1©øÞé28 Éù\u0001@RtQ\rç_M\u0013\u0089¬Ìú\u00941¢¢Od\u0098-íÇ\u0007k&\"ÓxÂ:\u009a\u008bý©\u0086øC\r\u009fz@íîoÏ\nÎ¶'fÓ\u0007ÇD\u000b°:V÷LÇð/ÿ\u0013Õö^-x+S?2\u0006ìécyShÍ\u0012ræÃ\u0091eº\u0002À·LéÆÊb\u0013BÕ¥÷\u008a'á,\u008a)ÏÀ·\u009bl*\u0099lÃ£¶\u0093ë^CÐ\u0001èî\u0011þ\u0084\u0017s\u009b¿\u008cã·\u0002 ú\u00181*i¡\u009f\u0005ÿÔáúïLNÕ¶\u007f\u009d×n\u0001èÿJÆ$|\u00adõ&gº[6\u0081\u0014\u00884\u0003\u007f\r¦t\b\u0012Þ»q\u000b\u00adÇ\u0011[4ÇyÛ\u009cqåªªÂÙK,\u0014¶\u00046\u0081½\u0018vØp¤íÕ\u0000å4' \u0096¬8NAòzH¡9\u0093\u0000Ì\u0093²íÿ\u008eU~ÐmÇÞÙ\\\u0091±ï`f \u009b\u0013Pà\u0086Óª£y°P¸áT¡v\u0081¦\u0006\bñ\b=ö\"ô\u008cÝ\u0015\nú/\u009df7Eài*\u008b)7\u0014\u008eòÏ\u0081Y\u001b7rÈ\u008cÍò\u00ad\nC¢Q.¹ü\u000eA\bÄ]A«Îýý\u0013òJR\u0082\u008e¼·_W ÓL\u009f·Ò\u0012¶¢\u0007uK\u0081»\u008f\u0083È\u008a9¿äÃ\u0003}àüº\u0000N\u0019Ð\u008b#äÆ\u0013\u0002\u009dµ&\u008efÍß\u001e\u0010\u0092ö\u008a\u0011ºDÖSX¶Á#¥ÒÇ.Âá}Ao`èÓ½þº\ní'I\u0094ºÎ\u0080cïGñAudT/\u0012úsÞ\u0099d\u0010<\u0092'RÁD8õ\u0082wßùEf0Ô\u008a\\8¤Ðð\u008c¥\u0098 ãIÌÅ\u0090\u0086½S¼ðô?k&H`T\u0004Üµí>ÙÙ[é\n\u0019ìÓ\u007fêP¡lêMëýS\u007fÇÖÄÿ¼Ð8û\u0019\u0088Í0\u0082ã+\u009d\u0098ù\u008b-Æ\u0087k/\u000f´óæáæ)Ø÷y÷\u001aõ\u0000Ãf\u008eßàÿ\u0086ãÞ]k\u0081A\u0003ýKÆVs\u000e\t{ºö_2®\u0015äxbAÎ¡ï\u0000\tdJ\u008b/ÕÄ}\u0085ïÝmÓZ\u009a0\u0010i¨ÌíUMÌ7\u008b\u0094Xú)?þ¢Nú-\u0019ñâj-\u0087xåÞ«Û\n=\u008cO&u\u009d\u0086t\u001d$hF,½*)2ã\u0016öeäâê¹æâØ\u0019;¯ý\u0002â*»Z§]»ÿ¼\u0092\u008d\u009a\u000e\u001b\u0087\u0017vX¹±òÖïÌnîFT¾êÒ\u0083;i\u0081¨\u0001·ò\u0012\u008e\b.zº`¤Mb\u0092IE\u0082×¥×A³;1LB½ÞT/\u0019Ùµn½"
         .getBytes("ISO-8859-1");

      int var84;
      do {
         abb[var10000] = ((var59[var40] & 255) << 24 | (var59[var40 + 1] & 255) << 16 | (var59[var40 + 2] & 255) << 8 | var59[var40 + 3] & 255) ^ 1677949787;
         var10000 += 1;
         var84 = var40 + 4;
         var40 += 4;
      } while (var84 < var59.length);

      String[] var21 = new String[2];
      int var19 = 0;
      String var18;
      int var20 = (var18 = b(var33 ^ 1318717126, 57068, 53516)).length();
      int var17 = a(46789931, var33 ^ 1530981365);
      int var16 = -1;

      while (true) {
         label109: {
            char[] var43 = var18.substring(++var16, var16 + var17).toCharArray();
            var84 = var43.length;
            int var22 = 0;
            var67 = var43;
            var40 = var84;
            char[] var88;
            int var108;
            if (var84 <= 1) {
               var88 = var43;
               var108 = var22;
            } else {
               var67 = var43;
               var40 = var84;
               if (var84 <= var22) {
                  break label109;
               }

               var88 = var43;
               var108 = var22;
            }

            while (true) {
               var88[var108] = (char)(var88[var108] ^ switch (var22 % a(46789930, var33 ^ -1255141233)) {
                  case 0 -> a(46789929, var33 ^ 2036038816);
                  case 1 -> a(46789928, var33 ^ 1993488376);
                  case 2 -> a(46789935, var33 ^ -2004599665);
                  case 3 -> a(46789934, var33 ^ -44733987);
                  case 4 -> a(46789933, var33 ^ 1216953750);
                  case 5 -> a(46789932, var33 ^ -14518128);
                  default -> a(46789923, var33 ^ 1724138890);
               });
               var22++;
               if (var40 == 0) {
                  var108 = var40;
                  var88 = var67;
               } else {
                  if (var40 <= var22) {
                     break;
                  }

                  var88 = var67;
                  var108 = var22;
               }
            }
         }

         String var95 = new String(var67).intern();
         int var50 = -1;
         var21[var19++] = var95;
         if ((var16 += var17) >= var20) {
            aa = var21;
            ab = new String[2];
            long var8 = 2619149003257310355L;
            long[] var14 = new long[4];
            int var11 = 0;
            String var12;
            int var13 = (var12 = b(var33 ^ 172299555, 57069, 28094)).length();
            byte var10 = 0;

            label93:
            while (true) {
               var50 = var10;
               var10 += 8;
               String var36 = var12.substring(var50, var10);
               var50 = var33 ^ -838568278;
               char var72 = '\udeee';
               short var96 = 17384;
               byte[] var15 = var36.getBytes("ISO-8859-1");
               long[] var37 = var14;
               var50 = var11++;
               long var73 = (var15[0] & 255L) << a(46789922, var33 ^ 1907058834)
                  | (var15[1] & 255L) << a(46789921, var33 ^ 811150284)
                  | (var15[2] & 255L) << a(46789920, var33 ^ 472646565)
                  | (var15[3] & 255L) << a(46789927, var33 ^ 1990115228)
                  | (var15[4] & 255L) << a(46789926, var33 ^ -33129474)
                  | (var15[5] & 255L) << a(46789925, var33 ^ 1395004069)
                  | (var15[a(46789924, var33 ^ -1503824356)] & 255L) << a(46789947, var33 ^ 85031916)
                  | var15[a(46789946, var33 ^ 1394678815)] & 255L;
               short var97 = -1;

               while (true) {
                  long var110 = var73 ^ var8;
                  switch (var97) {
                     case 0:
                        var37[var50] = var110;
                        if (var10 >= var13) {
                           aba = var14;
                           aaa = new Integer[4];
                           long var0 = 5399462998914171387L;
                           long[] var6 = new long[2];
                           int var3 = 0;
                           String var4;
                           int var5 = (var4 = b(var33 ^ -297190154, 57065, 27904)).length();
                           byte var2 = 0;

                           do {
                              int var56 = var2;
                              var2 += 8;
                              String var39 = var4.substring(var56, var2);
                              var56 = var33 ^ -1332973929;
                              char var76 = '\udeea';
                              var97 = 186;
                              byte[] var7 = var39.getBytes("ISO-8859-1");
                              var56 = var3++;
                              var110 = (
                                    (var7[0] & 255L) << a(46789936, var33 ^ -573821606)
                                       | (var7[1] & 255L) << a(46789943, var33 ^ 2081352274)
                                       | (var7[2] & 255L) << a(46789942, var33 ^ 525288658)
                                       | (var7[3] & 255L) << a(46789941, var33 ^ -1515356396)
                                       | (var7[4] & 255L) << a(46789940, var33 ^ 208248665)
                                       | (var7[5] & 255L) << a(46789899, var33 ^ 628189968)
                                       | (var7[a(46789898, var33 ^ -483927344)] & 255L) << a(46789897, var33 ^ -1955023458)
                                       | var7[a(46789896, var33 ^ 1290198900)] & 255L
                                 )
                                 ^ var0;
                              byte var101 = -1;
                              var6[var56] = var110;
                           } while (var2 < var5);

                           bb = var6;
                           ba = new Long[2];
                           aab = new String[2];
                           aab();
                           return;
                        }
                        break;
                     default:
                        var37[var50] = var110;
                        if (var10 < var13) {
                           continue label93;
                        }

                        var13 = (var12 = b(var33 ^ -1882242026, 57071, 3243)).length();
                        var10 = 0;
                  }

                  int var54 = var10;
                  var10 += 8;
                  String var38 = var12.substring(var54, var10);
                  var54 = var33 ^ 107229092;
                  char var75 = '\udee8';
                  var97 = 4061;
                  var15 = var38.getBytes("ISO-8859-1");
                  var37 = var14;
                  var50 = var11++;
                  var73 = (var15[0] & 255L) << a(46789945, var33 ^ 410639693)
                     | (var15[1] & 255L) << a(46789944, var33 ^ 1642267616)
                     | (var15[2] & 255L) << a(46789951, var33 ^ 1278070282)
                     | (var15[3] & 255L) << a(46789950, var33 ^ -1158553931)
                     | (var15[4] & 255L) << a(46789949, var33 ^ -367266574)
                     | (var15[5] & 255L) << a(46789948, var33 ^ 1270940387)
                     | (var15[a(46789939, var33 ^ -2105095989)] & 255L) << a(46789938, var33 ^ 1536226561)
                     | var15[a(46789937, var33 ^ -28679188)] & 255L;
                  var97 = 0;
               }
            }
         }

         var17 = var18.charAt(var16);
      }
   }

   private static void aab() {
      int var0 = 1519130615;
      aab[0] = ab(
         aaa(a(46789632, var0 ^ -784980917), a(46789639, var0 ^ -1191024093)).toCharArray(),
         bb(a(46789638, var0 ^ -1898347275), 5352830317377821727L),
         aa(a(46789637, var0 ^ -2042983795), 6614741767443142022L)
      );
      aab[1] = ab(
         aaa(a(46789636, var0 ^ 351903555), a(46789659, var0 ^ -218657791)).toCharArray(),
         bb(a(46789658, var0 ^ 502229455), 6553108778943842004L),
         aa(a(46789657, var0 ^ 437136790), 1764260939616794782L)
      );
   }
}
