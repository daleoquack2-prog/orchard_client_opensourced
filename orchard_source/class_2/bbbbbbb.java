package nsc;

import net.fabricmc.api.EnvType;
import net.fabricmc.api.Environment;

@Environment(EnvType.CLIENT)
final class bbbbbbb {
   private static final String[] aa;
   private static final String[] ab;
   private static String[] b;
   private static final String[] aba;
   private static final long[] a;
   private static final int[] aab;
   private static final Long[] ba;
   private static final long[] bb;
   private static final Object[] abb;
   private static final Integer[] aaa;

   private static void aa() {
      int var0 = 1589099113;
      b[0] = aab(
         aaa(a(-1510549579, var0 ^ 1466624628), a(-1510549580, var0 ^ -975878762)).toCharArray(),
         ba(a(-1510549577, var0 ^ -461547518), 7904314546844679765L),
         abab(a(-1510549578, var0 ^ 1030215382), 8914857390329500157L)
      );
      b[1] = aab(
         aaa(a(-1510549583, var0 ^ -1022526473), a(-1510549584, var0 ^ 1300564472)).toCharArray(),
         ba(a(-1510549581, var0 ^ 465160747), 183498147737236558L),
         abab(a(-1510549582, var0 ^ -1553685692), 5305301435685252594L)
      );
      b[2] = aab(
         aaa(a(-1510549571, var0 ^ 1495125129), a(-1510549572, var0 ^ 1792973712)).toCharArray(),
         ba(a(-1510549569, var0 ^ -2008866867), 2794226363825061631L),
         abab(a(-1510549570, var0 ^ -404483383), 7506074101132266387L)
      );
      b[3] = aab(
         aaa(a(-1510549575, var0 ^ -928126703), a(-1510549576, var0 ^ -350620582)).toCharArray(),
         ba(a(-1510549573, var0 ^ -1285671625), 8090492466305632252L),
         abab(a(-1510549574, var0 ^ -1392451380), 7020765570492090267L)
      );
   }

   private static String babb(int var0, int var1) {
      int var3 = var0 ^ -964189936;
      char[] var4 = aba[var3].toCharArray();
      StackTraceElement[] var2 = (StackTraceElement[])abb[var3];
      StackTraceElement[] var5;
      if (var2 != null) {
         var5 = var2;
      } else {
         var5 = new Throwable().getStackTrace();
         abb[var3] = var5;
      }

      StackTraceElement var6 = var5[1];
      int var7 = (var6.getClassName().hashCode() ^ var6.getMethodName().hashCode()) >> 16 ^ -1848870720;
      int var8 = 0;

      do {
         var4[var8] = (char)(var4[var8] ^ switch (var8 & 31) {
            default -> 148;
            case 1 -> 23;
            case 2 -> 146;
            case 3 -> 129;
            case 4 -> 227;
            case 5 -> 11;
            case 6 -> 160;
            case 7 -> 151;
            case 8 -> 3;
            case 9 -> 234;
            case 10 -> 241;
            case 11 -> 202;
            case 12 -> 94;
            case 13 -> 168;
            case 14 -> 111;
            case 15 -> 223;
            case 16 -> 30;
            case 17 -> 45;
            case 18 -> 161;
            case 19 -> 5;
            case 20 -> 70;
            case 21 -> 199;
            case 22 -> 223;
            case 23 -> 214;
            case 24 -> 139;
            case 25 -> 9;
            case 26 -> 55;
            case 27 -> 250;
            case 28 -> 107;
            case 29 -> 91;
            case 30 -> 201;
            case 31 -> 115;
         } ^ var1 >> 16 ^ var7);
      } while (++var8 < var4.length);

      return new String(var4).intern();
   }

   public static double ab(double param0, double param2, double param4) {
      // $VF: Couldn't be decompiled
      // Please report this to the Vineflower issue tracker, at https://github.com/Vineflower/vineflower/issues with a copy of the class file (if you have the rights to distribute it!)
      // java.lang.RuntimeException: parsing failure!
      //   at org.jetbrains.java.decompiler.modules.decompiler.decompose.DomHelper.parseGraph(DomHelper.java:211)
      //   at org.jetbrains.java.decompiler.main.rels.MethodProcessor.codeToJava(MethodProcessor.java:166)
      //
      // Bytecode:
      // 00: getstatic qeaa361f143ee4a0894bd168fd9b30c66/qf4ccf8f5435d4a78bdca4d6a018b578e/baaabbaa.bba I
      // 03: istore 6
      // 05: dload 4
      // 07: iload 6
      // 09: ifne 25
      // 0c: dload 2
      // 0d: dcmpg
      // 0e: ifgt 18
      // 11: goto 15
      // 14: athrow
      // 15: dconst_0
      // 16: dreturn
      // 17: athrow
      // 18: dload 0
      // 19: dload 2
      // 1a: dsub
      // 1b: dload 4
      // 1d: dload 2
      // 1e: dsub
      // 1f: ddiv
      // 20: dconst_0
      // 21: dconst_1
      // 22: invokestatic qeaa361f143ee4a0894bd168fd9b30c66/qf4ccf8f5435d4a78bdca4d6a018b578e/bbbbbbb.bab (DDD)D
      // 25: dreturn
   }

   private static long ba(int var0, long var1) {
      int var3 = (var0 ^ (int)var1 ^ a(-1510549595, 867667739 ^ 879634925)) & a(-1510549596, 867667739 ^ -1497021845);
      if (ba[var3] == null) {
         ba[var3] = bb[var3] ^ var1;
      }

      return ba[var3];
   }

   public static double bb(double var0, double var2, double var4) {
      return babbbaab.bba(var0, var2, var4);
   }

   private static int a(int var0, int var1) {
      int var2 = aab[var0 ^ -1510549579] ^ var1 ^ var0;
      var2 -= 22296;
      var2 += 35822;
      var2 -= 13653;
      var2 += 15442;
      var2 -= 23538;
      var2 -= 41704;
      return var2 ^ 37056;
   }

   private bbbbbbb() {
   }

   private static String aaa(int var0, int var1) {
      int var9 = 1075469681;
      int var2 = (var0 ^ a(-1510549593, var9 ^ -1075546876)) & a(-1510549594, var9 ^ -313059522);
      if (aa[var2] == null) {
         char[] var3 = ab[var2].toCharArray();

         int var4 = switch (var3[0] & a(-1510549599, var9 ^ 1346737309)) {
            case 0 -> a(-1510549600, var9 ^ -1532163483);
            case 1 -> a(-1510549597, var9 ^ -1194283223);
            case 2 -> a(-1510549598, var9 ^ -782642056);
            case 3 -> a(-1510549587, var9 ^ 1169706849);
            case 4 -> a(-1510549588, var9 ^ -1308319557);
            case 5 -> a(-1510549585, var9 ^ 186785959);
            case 6 -> a(-1510549586, var9 ^ -2033829437);
            case 7 -> a(-1510549591, var9 ^ -1563154449);
            case 8 -> a(-1510549592, var9 ^ -778942196);
            case 9 -> a(-1510549589, var9 ^ -217987105);
            case 10 -> a(-1510549590, var9 ^ 1803401554);
            case 11 -> a(-1510549611, var9 ^ 1339755701);
            case 12 -> a(-1510549612, var9 ^ 1597080990);
            case 13 -> a(-1510549609, var9 ^ -461165632);
            case 14 -> a(-1510549610, var9 ^ 1983928436);
            case 15 -> a(-1510549615, var9 ^ -1555672353);
            case 16 -> a(-1510549616, var9 ^ -1004545146);
            case 17 -> a(-1510549613, var9 ^ 665644522);
            case 18 -> a(-1510549614, var9 ^ -206865764);
            case 19 -> a(-1510549603, var9 ^ -747886713);
            case 20 -> a(-1510549604, var9 ^ 1821239546);
            case 21 -> a(-1510549601, var9 ^ 1884794206);
            case 22 -> a(-1510549602, var9 ^ 1199654487);
            case 23 -> a(-1510549607, var9 ^ 82761972);
            case 24 -> a(-1510549608, var9 ^ 2052858373);
            case 25 -> a(-1510549605, var9 ^ -1936869192);
            case 26 -> a(-1510549606, var9 ^ 1727260327);
            case 27 -> 2;
            case 28 -> a(-1510549627, var9 ^ -956695581);
            case 29 -> a(-1510549628, var9 ^ -472993261);
            case 30 -> a(-1510549625, var9 ^ 1733710835);
            case 31 -> a(-1510549626, var9 ^ -1506383461);
            case 32 -> a(-1510549631, var9 ^ 580204733);
            case 33 -> a(-1510549632, var9 ^ 539953790);
            case 34 -> a(-1510549629, var9 ^ 49867332);
            case 35 -> a(-1510549630, var9 ^ -2031356511);
            case 36 -> a(-1510549619, var9 ^ 1677787279);
            case 37 -> a(-1510549620, var9 ^ -1233545949);
            case 38 -> a(-1510549617, var9 ^ -1886971883);
            case 39 -> a(-1510549618, var9 ^ 792164868);
            case 40 -> a(-1510549623, var9 ^ 992068163);
            case 41 -> a(-1510549624, var9 ^ -14201090);
            case 42 -> a(-1510549621, var9 ^ -1139813371);
            case 43 -> a(-1510549622, var9 ^ 116923594);
            case 44 -> a(-1510549515, var9 ^ -13204555);
            case 45 -> a(-1510549516, var9 ^ -375332444);
            case 46 -> a(-1510549513, var9 ^ 8666065);
            case 47 -> a(-1510549514, var9 ^ 814104741);
            case 48 -> a(-1510549519, var9 ^ -505811662);
            case 49 -> a(-1510549520, var9 ^ -251681210);
            case 50 -> a(-1510549517, var9 ^ 532753009);
            case 51 -> a(-1510549518, var9 ^ -340268969);
            case 52 -> a(-1510549507, var9 ^ 137247991);
            case 53 -> a(-1510549508, var9 ^ -1966320017);
            case 54 -> a(-1510549505, var9 ^ -240251982);
            case 55 -> a(-1510549506, var9 ^ -1057184503);
            case 56 -> a(-1510549511, var9 ^ 919505502);
            case 57 -> a(-1510549512, var9 ^ 1933242831);
            case 58 -> a(-1510549509, var9 ^ -409458398);
            case 59 -> a(-1510549510, var9 ^ 1054906280);
            case 60 -> a(-1510549531, var9 ^ 750026716);
            case 61 -> a(-1510549532, var9 ^ -1419013162);
            case 62 -> a(-1510549529, var9 ^ 2100448721);
            case 63 -> a(-1510549530, var9 ^ -1840701605);
            case 64 -> a(-1510549535, var9 ^ -1364883936);
            case 65 -> a(-1510549536, var9 ^ -532404682);
            case 66 -> a(-1510549533, var9 ^ 495299751);
            case 67 -> a(-1510549534, var9 ^ 685968121);
            case 68 -> a(-1510549523, var9 ^ 421082918);
            case 69 -> a(-1510549524, var9 ^ 814673925);
            case 70 -> a(-1510549521, var9 ^ 92035605);
            case 71 -> a(-1510549522, var9 ^ -533950819);
            case 72 -> a(-1510549527, var9 ^ -543280526);
            case 73 -> a(-1510549528, var9 ^ 871488573);
            case 74 -> a(-1510549525, var9 ^ -279721245);
            case 75 -> a(-1510549526, var9 ^ -1403666011);
            case 76 -> a(-1510549547, var9 ^ 299576777);
            case 77 -> a(-1510549548, var9 ^ -311585332);
            case 78 -> a(-1510549545, var9 ^ -1959035653);
            case 79 -> a(-1510549546, var9 ^ -482766017);
            case 80 -> a(-1510549551, var9 ^ 592650140);
            case 81 -> a(-1510549552, var9 ^ -1879076099);
            case 82 -> a(-1510549549, var9 ^ 907384615);
            case 83 -> a(-1510549550, var9 ^ 301335157);
            case 84 -> a(-1510549539, var9 ^ 484449224);
            case 85 -> a(-1510549540, var9 ^ 1595733088);
            case 86 -> a(-1510549537, var9 ^ 334529826);
            case 87 -> a(-1510549538, var9 ^ 1842927780);
            case 88 -> a(-1510549543, var9 ^ -1605884256);
            case 89 -> a(-1510549544, var9 ^ 1175111062);
            case 90 -> a(-1510549541, var9 ^ 1781339522);
            case 91 -> a(-1510549542, var9 ^ -2038842078);
            case 92 -> a(-1510549563, var9 ^ 137596001);
            case 93 -> a(-1510549564, var9 ^ -510798624);
            case 94 -> a(-1510549561, var9 ^ 486631627);
            case 95 -> a(-1510549562, var9 ^ -189390042);
            case 96 -> a(-1510549567, var9 ^ -1421567762);
            case 97 -> a(-1510549568, var9 ^ -451377101);
            case 98 -> a(-1510549565, var9 ^ 2109811903);
            case 99 -> a(-1510549566, var9 ^ 917455064);
            case 100 -> a(-1510549555, var9 ^ -1175877010);
            case 101 -> a(-1510549556, var9 ^ 1512093197);
            case 102 -> a(-1510549553, var9 ^ 559825603);
            case 103 -> a(-1510549554, var9 ^ 1546709171);
            case 104 -> a(-1510549559, var9 ^ 675348942);
            case 105 -> a(-1510549560, var9 ^ 496184062);
            case 106 -> 4;
            case 107 -> a(-1510549557, var9 ^ -1957956415);
            case 108 -> a(-1510549558, var9 ^ -282790081);
            case 109 -> a(-1510549707, var9 ^ 1600218145);
            case 110 -> a(-1510549708, var9 ^ 1094160844);
            case 111 -> a(-1510549705, var9 ^ 606039043);
            case 112 -> a(-1510549706, var9 ^ -1713954681);
            case 113 -> a(-1510549711, var9 ^ 711772301);
            case 114 -> a(-1510549712, var9 ^ -1806416801);
            case 115 -> a(-1510549709, var9 ^ -1597748657);
            case 116 -> a(-1510549710, var9 ^ 1127188328);
            case 117 -> a(-1510549699, var9 ^ 1035857194);
            case 118 -> a(-1510549700, var9 ^ 522175646);
            case 119 -> a(-1510549697, var9 ^ 902330127);
            case 120 -> a(-1510549698, var9 ^ -258565050);
            case 121 -> a(-1510549703, var9 ^ 1202013970);
            case 122 -> a(-1510549704, var9 ^ 1998091439);
            case 123 -> a(-1510549701, var9 ^ -1874452444);
            case 124 -> 3;
            case 125 -> a(-1510549702, var9 ^ 880151393);
            case 126 -> a(-1510549723, var9 ^ 1101586899);
            case 127 -> a(-1510549724, var9 ^ -377122261);
            case 128 -> a(-1510549721, var9 ^ -1937701946);
            case 129 -> a(-1510549722, var9 ^ 1395408832);
            case 130 -> a(-1510549727, var9 ^ 2132477542);
            case 131 -> a(-1510549728, var9 ^ -1862737049);
            case 132 -> a(-1510549725, var9 ^ -965926513);
            case 133 -> a(-1510549726, var9 ^ 1002797997);
            case 134 -> a(-1510549715, var9 ^ -501746093);
            case 135 -> a(-1510549716, var9 ^ 2074029972);
            case 136 -> a(-1510549713, var9 ^ -1622715297);
            case 137 -> a(-1510549714, var9 ^ -2038214460);
            case 138 -> a(-1510549719, var9 ^ 1058229660);
            case 139 -> a(-1510549720, var9 ^ -861445742);
            case 140 -> a(-1510549717, var9 ^ -942866460);
            case 141 -> a(-1510549718, var9 ^ 1127948010);
            case 142 -> a(-1510549739, var9 ^ 615542293);
            case 143 -> a(-1510549740, var9 ^ 1566219411);
            case 144 -> a(-1510549737, var9 ^ 1658318964);
            case 145 -> a(-1510549738, var9 ^ 1467254670);
            case 146 -> a(-1510549743, var9 ^ 834910043);
            case 147 -> a(-1510549744, var9 ^ 1793872652);
            case 148 -> a(-1510549741, var9 ^ 2008504850);
            case 149 -> a(-1510549742, var9 ^ 1162482849);
            case 150 -> a(-1510549731, var9 ^ -1928789230);
            case 151 -> a(-1510549732, var9 ^ 600761060);
            case 152 -> a(-1510549729, var9 ^ -1579473579);
            case 153 -> a(-1510549730, var9 ^ 1764461972);
            case 154 -> a(-1510549735, var9 ^ 1013510990);
            case 155 -> a(-1510549736, var9 ^ -623857857);
            case 156 -> a(-1510549733, var9 ^ 1108182963);
            case 157 -> a(-1510549734, var9 ^ 1565561743);
            case 158 -> a(-1510549755, var9 ^ -407718954);
            case 159 -> a(-1510549756, var9 ^ 1669177050);
            case 160 -> a(-1510549753, var9 ^ -1513657953);
            case 161 -> a(-1510549754, var9 ^ -2133645002);
            case 162 -> 5;
            case 163 -> a(-1510549759, var9 ^ -1716386488);
            case 164 -> a(-1510549760, var9 ^ -1534753897);
            case 165 -> a(-1510549757, var9 ^ -595020565);
            case 166 -> a(-1510549758, var9 ^ 61011806);
            case 167 -> a(-1510549747, var9 ^ -322403947);
            case 168 -> a(-1510549748, var9 ^ 485348808);
            case 169 -> a(-1510549745, var9 ^ -2073393134);
            case 170 -> a(-1510549746, var9 ^ 416086120);
            case 171 -> a(-1510549751, var9 ^ 1840102137);
            case 172 -> a(-1510549752, var9 ^ -6257588);
            case 173 -> a(-1510549749, var9 ^ 1730216181);
            case 174 -> a(-1510549750, var9 ^ 762997041);
            case 175 -> a(-1510549643, var9 ^ -427068603);
            case 176 -> a(-1510549644, var9 ^ -409036676);
            case 177 -> a(-1510549641, var9 ^ 507688624);
            case 178 -> a(-1510549642, var9 ^ -1393691127);
            case 179 -> a(-1510549647, var9 ^ -1377880070);
            case 180 -> a(-1510549648, var9 ^ -1436890376);
            case 181 -> a(-1510549645, var9 ^ -872121116);
            case 182 -> a(-1510549646, var9 ^ -2018616177);
            case 183 -> a(-1510549635, var9 ^ -614613833);
            case 184 -> a(-1510549636, var9 ^ -700512136);
            case 185 -> a(-1510549633, var9 ^ -1457462014);
            case 186 -> a(-1510549634, var9 ^ -234222699);
            case 187 -> a(-1510549639, var9 ^ 470485321);
            case 188 -> a(-1510549640, var9 ^ -1143009720);
            case 189 -> a(-1510549637, var9 ^ -915751068);
            case 190 -> a(-1510549638, var9 ^ 1710366423);
            case 191 -> a(-1510549659, var9 ^ 1618229107);
            case 192 -> a(-1510549660, var9 ^ 589854151);
            case 193 -> a(-1510549657, var9 ^ -886908492);
            case 194 -> a(-1510549658, var9 ^ -139847611);
            case 195 -> a(-1510549663, var9 ^ 285306764);
            case 196 -> a(-1510549664, var9 ^ 819940459);
            case 197 -> a(-1510549661, var9 ^ 879898892);
            case 198 -> a(-1510549662, var9 ^ -826765203);
            case 199 -> a(-1510549651, var9 ^ 547631109);
            case 200 -> a(-1510549652, var9 ^ 1270239293);
            case 201 -> a(-1510549649, var9 ^ 826800988);
            case 202 -> a(-1510549650, var9 ^ 584516360);
            case 203 -> a(-1510549655, var9 ^ 4270513);
            case 204 -> a(-1510549656, var9 ^ -674338089);
            case 205 -> a(-1510549653, var9 ^ 233902490);
            case 206 -> a(-1510549654, var9 ^ -876932102);
            case 207 -> a(-1510549675, var9 ^ -1518369800);
            case 208 -> a(-1510549676, var9 ^ -864893965);
            case 209 -> a(-1510549673, var9 ^ 1494262455);
            case 210 -> a(-1510549674, var9 ^ 1162986457);
            case 211 -> a(-1510549679, var9 ^ 1632659962);
            case 212 -> a(-1510549680, var9 ^ -479169500);
            case 213 -> a(-1510549677, var9 ^ -512663397);
            case 214 -> a(-1510549678, var9 ^ -642096170);
            case 215 -> a(-1510549667, var9 ^ -1371215448);
            case 216 -> 0;
            case 217 -> a(-1510549668, var9 ^ -1858792186);
            case 218 -> a(-1510549665, var9 ^ 1288764607);
            case 219 -> a(-1510549666, var9 ^ -418961487);
            case 220 -> a(-1510549671, var9 ^ -1415286104);
            case 221 -> a(-1510549672, var9 ^ 1491509952);
            case 222 -> a(-1510549669, var9 ^ 1079401386);
            case 223 -> a(-1510549670, var9 ^ -2005257893);
            case 224 -> a(-1510549691, var9 ^ 1562328669);
            case 225 -> a(-1510549692, var9 ^ -373728966);
            case 226 -> a(-1510549689, var9 ^ 337585875);
            case 227 -> a(-1510549690, var9 ^ 1166825042);
            case 228 -> a(-1510549695, var9 ^ -298820398);
            case 229 -> a(-1510549696, var9 ^ 1226914562);
            case 230 -> a(-1510549693, var9 ^ 833147050);
            case 231 -> 1;
            case 232 -> a(-1510549694, var9 ^ -1174202489);
            case 233 -> a(-1510549683, var9 ^ 1478113204);
            case 234 -> a(-1510549684, var9 ^ 142659928);
            case 235 -> a(-1510549681, var9 ^ -1412077400);
            case 236 -> a(-1510549682, var9 ^ 54073420);
            case 237 -> a(-1510549687, var9 ^ -1815478453);
            case 238 -> a(-1510549688, var9 ^ -1307015343);
            case 239 -> a(-1510549685, var9 ^ 1402653181);
            case 240 -> a(-1510549686, var9 ^ -1999787906);
            case 241 -> a(-1510549835, var9 ^ 634260836);
            case 242 -> a(-1510549836, var9 ^ 839759148);
            case 243 -> a(-1510549833, var9 ^ 1586742021);
            case 244 -> a(-1510549834, var9 ^ 1971064127);
            case 245 -> a(-1510549839, var9 ^ -572753094);
            case 246 -> a(-1510549840, var9 ^ 160649120);
            case 247 -> a(-1510549837, var9 ^ 1877945114);
            case 248 -> a(-1510549838, var9 ^ -1689562289);
            case 249 -> a(-1510549827, var9 ^ -1921307747);
            case 250 -> a(-1510549828, var9 ^ 1485246889);
            case 251 -> a(-1510549825, var9 ^ -857380954);
            case 252 -> a(-1510549826, var9 ^ 1878698439);
            case 253 -> a(-1510549831, var9 ^ -1479337600);
            case 254 -> a(-1510549832, var9 ^ -1635942144);
            default -> a(-1510549829, var9 ^ 1418543763);
         };
         int var5 = (var1 & a(-1510549830, var9 ^ 1632687155)) - var4;
         if (var5 < 0) {
            var5 += 256;
         }

         int var6 = ((var1 & a(-1510549851, var9 ^ 19364297)) >>> a(-1510549852, var9 ^ -1034881672)) - var4;
         if (var6 < 0) {
            var6 += 256;
         }

         for (int var7 = 0; var7 < var3.length; var7++) {
            int var8 = var7 % 2;
            char var10002 = var3[var7];
            if (var8 == 0) {
               var3[var7] = (char)(var10002 ^ var5);
               var5 = ((var5 >>> 3 | var5 << 5) ^ var3[var7]) & a(-1510549849, var9 ^ 993280837);
            } else {
               var3[var7] = (char)(var10002 ^ var6);
               var6 = ((var6 >>> 3 | var6 << 5) ^ var3[var7]) & a(-1510549850, var9 ^ -251410098);
            }
         }

         aa[var2] = new String(var3).intern();
      }

      return aa[var2];
   }

   private static String aab(char[] var0, long var1, int var3) {
      int var4 = abab(a(-1510549855, -1669907419 ^ 1930230487), 7029533075246098406L) ^ var3;

      for (int var5 = 0; var5 < var0.length; var5++) {
         int var7 = var4 ^ (int)var1 ^ ~var5;
         int var8 = var7 ^ var3 - var5 * var0.length;
         var4 = -var8 * var3 | var5;
         var0[var5] = (char)(var0[var5] ^ var4);
         int var6 = var5 & abab(a(-1510549856, -1669907419 ^ -264711313), 5104071610860594018L);
         var3 = var3 << var6 | var3 >>> -var6;
         var1 ^= var6;
      }

      return new String(var0);
   }

   public static int aba(int var0, double var1) {
      return babbbaab.aba(var0, var1);
   }

   // $VF: Irreducible bytecode was duplicated to produce valid code
   static {
      int var33 = 1371460281;
      int var27 = 0;
      int var26 = 0;
      int var24 = "\t轋匴ꔕꁤ艥힜駨\ueef5炜\tო宂靈눉㑫\udc2b䘻鿕苵h졩\uf262젭摒쒃銂췉\uea60\udacd\uea8b흃ʆ윩艥옍摒씃檁폩驣\udfcd摒쥃誇\udca9\uf261팭骊읃\uea80\udac9穥짭\uf28f슃⊁\uda29≢\udb6d\uf28c쮣\uf284흩≧앭ꊍ읃튃컩扢콭쪏쫃슆\udb49穣쪭抌킃ኄ쾉䉣픍劌쳣\uf282용㩥쟍犉쟃劆\udc09ɦ\udfcd\ue28d턃쪇톩\u0a64첍ኋ잃ʃ픉扡퓍\uda8c쳃몃줉\uea66펍늋\uda43骀쏩⩣삭늉슣惘\ude09艡\n\ue64a犪\ue6ee㉄\ue640쩍\uef4a⊭\uf88e詇\u0010╀砝㠄ᣴ㩊\u18fd㱀〞⩤惴オ䣾⅀〞ↄ惰\n㋊功㉮ቱ㋀\uea78㯊ʘⰎꩲ\u0010⌟鿟↻漲⦕휻㞿蟟㗛ᜳ㈵Ἱ㱟ퟚ㫻✰\n煽뽏燙ﾡ煷ި硽\uef48澹䞢\u0010퍛⛡\ud9df☈\udd91㘇\ud89b䛠슿縈쯑ꘆ핛훣ퟟ丌\n德හ弓䴪徽딣嚷巃䅳\uf529"
         .length();
      String[] var25 = new String[10];
      short var28 = 16962;
      String var23 = "\t轋匴ꔕꁤ艥힜駨\ueef5炜\tო宂靈눉㑫\udc2b䘻鿕苵h졩\uf262젭摒쒃銂췉\uea60\udacd\uea8b흃ʆ윩艥옍摒씃檁폩驣\udfcd摒쥃誇\udca9\uf261팭骊읃\uea80\udac9穥짭\uf28f슃⊁\uda29≢\udb6d\uf28c쮣\uf284흩≧앭ꊍ읃튃컩扢콭쪏쫃슆\udb49穣쪭抌킃ኄ쾉䉣픍劌쳣\uf282용㩥쟍犉쟃劆\udc09ɦ\udfcd\ue28d턃쪇톩\u0a64첍ኋ잃ʃ픉扡퓍\uda8c쳃몃줉\uea66펍늋\uda43骀쏩⩣삭늉슣惘\ude09艡\n\ue64a犪\ue6ee㉄\ue640쩍\uef4a⊭\uf88e詇\u0010╀砝㠄ᣴ㩊\u18fd㱀〞⩤惴オ䣾⅀〞ↄ惰\n㋊功㉮ቱ㋀\uea78㯊ʘⰎꩲ\u0010⌟鿟↻漲⦕휻㞿蟟㗛ᜳ㈵Ἱ㱟ퟚ㫻✰\n煽뽏燙ﾡ煷ި硽\uef48澹䞢\u0010퍛⛡\ud9df☈\udd91㘇\ud89b䛠슿縈쯑ꘆ핛훣ퟟ丌\n德හ弓䴪徽딣嚷巃䅳\uf529";

      do {
         int var31 = 0;
         char var29 = var23.charAt(var27);
         char[] var30 = var23.substring(var27 + 1, var27 + 1 + var29).toCharArray();

         do {
            int var32 = var30[var31];

            var32 = (char)(switch (var31 % 6) {
               default -> 161;
               case 1 -> 87;
               case 2 -> 5;
               case 3 -> 190;
               case 4 -> 107;
               case 5 -> 179;
            }) ^ var32;
            if (var31 % 2 == 0) {
               var30[var31] = (char)((var32 >>> 5 | var32 << 11) & 65535 ^ var28);
            } else {
               var30[var31] = (char)((var32 << 5 | var32 >>> 11) & 65535 ^ var28);
            }
         } while (++var31 < var30.length);

         var25[var26] = new String(var30);
         var26++;
         var27 = var27 + var29 + 1;
      } while (var27 < var24);

      aba = var25;
      abb = new Object[var25.length];
      byte var39 = 0;
      aab = new int[347];
      int var10001 = 0;
      byte[] var10002 = " jî\t2Ôá\u009e\u0013|ø\nÊfd®4\r\u007f\u0083º\u0085#Òì¸° Te\u0015\u0000®\u001dÈó\u009dßûÄ\u007fB\u007fz\u0010å\u008aå?\u00adín\u001c\u0018H\u0090D_¾\u008bZ\u0001¼î®o\u009að<Ä×\u0014VI\u0096|\u0004ûÐ)¹é2\u008dM\u0001¬tQ|\tÍ8õrÈ¬\u0014éV[¨\u0006\u0091â\u008e\u0086\u0011oj\u009f^Kx\u0081l8>ï\u001e\u001a\u00adf\u0082\u0082Ñ\u001f\u008e¦wª\u009f¶\u009d#f\r/\u008d\u0007\u009fìþ\tJêô\u008c-³}$Î\u0000K\u001b\u001a\u0007Üð:À\u0081¿\u0085!NÁ\u0099û\u000bW®-à¬íB~Ú\u0093ð\u0084+e!\u001e\b\u008f_@\u0018/U]Í\nb\u0014´\u008eúõìO\u009aÏzË9\u009e2É\u0083¬\u0081ëTL½oGSô\u008d\u00ad¦\u0005_Õ3çf+¾0Æ\u009bÜ\u0003Ò\u008dd×\u0016\u008bèéU£r\u0088ïTº\u0091\u0016\u009a%\u009f\u0000\fG¼é(\u009dbÙ*æ\u0004\buK\u008d\u0019S\u0000\u0015öm\u008c\"\u0002\u001bN1á\u0082\u009aec`ð³\u0018\u0002\u00adÐ)P\u0003[ßb,¸\u009a\u0096W@\u000e4\u008f÷×L1)Å\u0018ÙøBÇ5,\u0094\u009eëR{å¾HG\t =\tè\u0080£ô)\n\u0006ÁO¬ûðµ\u0091LÙ\"V\u0098ìÐü\u009c\t\u0080(k62\u0094\u0096Ú]zI\u0006ÿl³Eùg¦øw\u008bø\u0004Á3hb\u0097Úm\n\u00955±Êÿ¹tfS4Pß¹1$øZ¤±õL½<¶°R\u009dú\\#\u008e\u0084t~ØIä\u0080¿¯¦c\u0085\u0083\u0081³0oÕ\u001bäá\u009f*q\b!r¶ô\u00adÎ\u0004\u001d\u001a\u0085\u0007Bè>\u0086\f´.¡\u0094m\u008a\u0005ß\u0003æIPE+W³\u008c\u0010IÈòä\u009dµ\u009cNòÁí§\u0012ô?\u008c\u0098bçRñ\u0006\u0088Q³¶ÍÂY¨\u009b7\u0090Í³Ê#p{\u0086îÃÀng}øâfIhì7ª\u0083!\u0006Ô\u0011Kwö³bxÜdÖÇ\u0019::)®\táî\u009e´Ò¦yê\u0086\\ÝÚ\u00ad\u0096¨\u0004GÐ\u0000)4ée-¥\u008cº\u0080\u0099v\u0096· \u001dyTE\u008d/Á\u0087qÒiÝW\u000b»Pq\u00923\u0089\u0006vëò]o/ö\u0081Ö¿ë\u0000%\u000bÇC.`Y*ª\u0097¸ÄÍ\u001cÈ\u0081´ö:/\u008b{VÐ¾Ø!<Øo\u0011\u0000\u0083@õr\u009e\u001bü\u008c¬æ²°d¥¥CÊbD\u0015Hw\u0083Æ\u0080\u0087+\u0019ÕÄU43|\t\u0097«¡!\u001c´ü5½\u000e\u001e\u0015ß\u008aÑ8\u0085LkÏÝi\u007f\u008fìp\u001e£³M)%N5$\u0012\u0090ê\u000eQ\u0001\u0005d'LõAsëmÆ.Ýñ`^Q\u0084\u0001\u001cs\u0016\f\"%\u008e\u008d¦îÄÖÏ»\u000f'Õæ\u000e2>\u009d÷î\u0010¹EAP\u0095Ds\u0091\u000fCölü%¨Ú\u008dn\u0002úc2ñ\u001a+?\u0093®\u0081@\u008cCl\u001b¦\u00ad%õ§¯\u0082Rs¨\n Æ\u00193\u008c^¸n\u0089Ø\u0091YÊ\u0084Ó^\"\u008e\u007f=\u001e\u0006¾ðø\u00adÉÉÙsêKÝÞ\u0097M'\u00146VÉ\b\u0096\u0080¢\u001aö\u0095Øë]ôË{¥féí\u0088*>bÌ´ä]·L\"\u0017µúLÓ%\u000b%Þeo°¼\u0004\u000f¬ýe\u0005\u0088üÏÿ\nÜÒ\u008c\bÝÆp0\u0016Å\u0086GèO<x\u0099³\u0088¥|Zn\u000e«\u0081ÙB\bÔ^±J\u0004W©úý¯aÖ\u0097H´³\u0098M\u0000\u0015ÿ\u007fý³\u0080\u008f¬ ðf\u0007\u009cú\n \u008d\u009d²Ø\u0004výS¯±ý±¶\u0091\u001aá,wöByÉ\u0016ê\u0095¾\u0080zeY6[´!eº6ozaa\u000e\u0013ÌbªhÛ¡\u0012\u0003·?d¸\u009cÐª\u009a4pÜUà?è\u0087\u0086C\u008c\"rçôPd×\u008bÓ±+¶´%IÀ\u001c\u0086V\u000eLN\u007f¾\u0085wÑ&î½!å×\u0088üs8è\u008b¿Ý+üRäÒ\u0098äS\u0018¯nYFÍÁÇÅù4ùLó\u0005°³\u0082Y\u009e¸÷¨f<×10¤Å\u009dX\\\u008a\u001dÂÔ2(H±ß¬\u001fï`K\u000fR×°ö\u0004éG~\u008a\nÛyÌEk\n}è\u0089q\u0088\u0083]uØ¹~\u008dp\u000f\u0002ÝYÈG<híÐ\u0097vr\u008c©\u0012¶°©ò\u001d\u0092Wì3\u001fC(\u0005û¡âû0\u009c\u0016ó^\"\u0097O\u008c²:ðâîëôK>Ð\u0005Z×H6\u001b*Û\u0086>Màeß×aRØ¶e\u0094}h;ï¶þjõ!n\f´CÜ/\u0011y\u009c\t\u009aaN§<\u0097\u0011M\u0080ág8³ø\u0004úé\u0084åÕ¼ýÍ\u0019<t§\u0003·J#¨¡Ø°\b=îC \f\u0017\tr\u009b}K·_\u0012Ê\u0016â\u0014ò=\u0003ÙßÛÎg\t\u001d÷r\u0082\u00adµ1ý&ÀÖÌO\u0004«Éw,,\u0001\u0000w,YÏ7úÿ'hS]ô\u008b\u0019·æ7\u0090õ9HìGï©XÌwx÷Ú\u0003b^f"
         .getBytes("ISO-8859-1");

      int var98;
      do {
         aab[var39] = (
               (var10002[var10001] & 255) << 24 | (var10002[var10001 + 1] & 255) << 16 | (var10002[var10001 + 2] & 255) << 8 | var10002[var10001 + 3] & 255
            )
            ^ 205619078;
         var39 += 1;
         var98 = var10001 + 4;
         var10001 += 4;
      } while (var98 < var10002.length);

      String[] var21 = new String[4];
      int var19 = 0;
      String var18;
      int var20 = (var18 = babb(-964189936, var33 ^ 542042567)).length();
      char var17 = 4;
      int var37 = -1;

      label143:
      while (true) {
         String var40 = var18.substring(++var37, var37 + var17);
         var10001 = (byte)-1;

         while (true) {
            label138: {
               char[] var52 = var40.toCharArray();
               var98 = var52.length;
               int var22 = 0;
               var77 = var52;
               var10001 = var98;
               char[] var102;
               int var120;
               if (var98 <= 1) {
                  var102 = var52;
                  var120 = var22;
               } else {
                  var77 = var52;
                  var10001 = var98;
                  if (var98 <= var22) {
                     break label138;
                  }

                  var102 = var52;
                  var120 = var22;
               }

               while (true) {
                  var102[var120] = (char)(var102[var120] ^ switch (var22 % a(-1510549853, var33 ^ -1258607134)) {
                     case 0 -> a(-1510549854, var33 ^ 1267364341);
                     case 1 -> a(-1510549843, var33 ^ 1090486340);
                     case 2 -> a(-1510549844, var33 ^ -992011989);
                     case 3 -> a(-1510549841, var33 ^ 1556985119);
                     case 4 -> a(-1510549842, var33 ^ -1534970454);
                     case 5 -> 5;
                     default -> a(-1510549847, var33 ^ 742000604);
                  });
                  var22++;
                  if (var10001 == 0) {
                     var120 = var10001;
                     var102 = var77;
                  } else {
                     if (var10001 <= var22) {
                        break;
                     }

                     var102 = var77;
                     var120 = var22;
                  }
               }
            }

            String var109 = new String(var77).intern();
            switch (var10001) {
               case 0:
                  var21[var19++] = var109;
                  if ((var37 += var17) >= var20) {
                     ab = var21;
                     aa = new String[4];
                     long var8 = 2052771424661147982L;
                     long[] var14 = new long[a(-1510549848, var33 ^ 1238860894)];
                     int var11 = 0;
                     String var12;
                     int var13 = (var12 = babb(-964189934, var33 ^ 302054711)).length();
                     byte var10 = 0;

                     label117:
                     while (true) {
                        int var59 = var10;
                        var10 += 8;
                        String var42 = var12.substring(var59, var10);
                        var59 = -964189933;
                        int var83 = var33 ^ 190022447;
                        byte[] var15 = var42.getBytes("ISO-8859-1");
                        long[] var43 = var14;
                        var59 = var11++;
                        long var84 = (var15[0] & 255L) << a(-1510549845, var33 ^ 392717156)
                           | (var15[1] & 255L) << a(-1510549846, var33 ^ -1428186988)
                           | (var15[2] & 255L) << a(-1510549867, var33 ^ -52334789)
                           | (var15[3] & 255L) << a(-1510549868, var33 ^ 1912795957)
                           | (var15[4] & 255L) << a(-1510549865, var33 ^ 877478781)
                           | (var15[5] & 255L) << a(-1510549866, var33 ^ -2048876273)
                           | (var15[a(-1510549871, var33 ^ 1888187670)] & 255L) << a(-1510549872, var33 ^ 548493037)
                           | var15[a(-1510549869, var33 ^ -2012796225)] & 255L;
                        byte var110 = -1;

                        while (true) {
                           long var122 = var84 ^ var8;
                           switch (var110) {
                              case 0:
                                 var43[var59] = var122;
                                 if (var10 >= var13) {
                                    a = var14;
                                    aaa = new Integer[a(-1510549883, var33 ^ 1866966238)];
                                    long var0 = 3760727948236096980L;
                                    long[] var6 = new long[4];
                                    int var3 = 0;
                                    String var4;
                                    int var5 = (var4 = babb(-964189930, var33 ^ -1526288437)).length();
                                    byte var2 = 0;

                                    label107:
                                    while (true) {
                                       int var64 = var2;
                                       var2 += 8;
                                       String var45 = var4.substring(var64, var2);
                                       var64 = -964189929;
                                       int var87 = var33 ^ -1209338056;
                                       byte[] var7 = var45.getBytes("ISO-8859-1");
                                       long[] var46 = var6;
                                       var64 = var3++;
                                       long var88 = (var7[0] & 255L) << a(-1510549884, var33 ^ -1023882582)
                                          | (var7[1] & 255L) << a(-1510549881, var33 ^ 335307633)
                                          | (var7[2] & 255L) << a(-1510549882, var33 ^ 671969921)
                                          | (var7[3] & 255L) << a(-1510549887, var33 ^ -1338100877)
                                          | (var7[4] & 255L) << a(-1510549888, var33 ^ 596514349)
                                          | (var7[5] & 255L) << a(-1510549885, var33 ^ 409860028)
                                          | (var7[a(-1510549886, var33 ^ -1722093370)] & 255L) << a(-1510549875, var33 ^ -1650698987)
                                          | var7[a(-1510549876, var33 ^ -1008230781)] & 255L;
                                       var110 = -1;

                                       while (true) {
                                          var122 = var88 ^ var0;
                                          switch (var110) {
                                             case 0:
                                                var46[var64] = var122;
                                                if (var2 >= var5) {
                                                   bb = var6;
                                                   ba = new Long[4];
                                                   b = new String[4];
                                                   aa();
                                                   return;
                                                }
                                                break;
                                             default:
                                                var46[var64] = var122;
                                                if (var2 < var5) {
                                                   continue label107;
                                                }

                                                var5 = (var4 = babb(-964189928, var33 ^ -2098494590)).length();
                                                var2 = 0;
                                          }

                                          int var67 = var2;
                                          var2 += 8;
                                          String var47 = var4.substring(var67, var2);
                                          var67 = -964189927;
                                          int var90 = var33 ^ -425924845;
                                          var7 = var47.getBytes("ISO-8859-1");
                                          var46 = var6;
                                          var64 = var3++;
                                          var88 = (var7[0] & 255L) << a(-1510549873, var33 ^ -1828910815)
                                             | (var7[1] & 255L) << a(-1510549874, var33 ^ -188978278)
                                             | (var7[2] & 255L) << a(-1510549879, var33 ^ -686206523)
                                             | (var7[3] & 255L) << a(-1510549880, var33 ^ -242071266)
                                             | (var7[4] & 255L) << a(-1510549877, var33 ^ 1597292410)
                                             | (var7[5] & 255L) << a(-1510549878, var33 ^ -1249326843)
                                             | (var7[a(-1510549771, var33 ^ -1061433341)] & 255L) << a(-1510549772, var33 ^ 48344289)
                                             | var7[a(-1510549769, var33 ^ 766825931)] & 255L;
                                          var110 = 0;
                                       }
                                    }
                                 }
                                 break;
                              default:
                                 var43[var59] = var122;
                                 if (var10 < var13) {
                                    continue label117;
                                 }

                                 var13 = (var12 = babb(-964189932, var33 ^ 1567987444)).length();
                                 var10 = 0;
                           }

                           int var62 = var10;
                           var10 += 8;
                           String var44 = var12.substring(var62, var10);
                           var62 = -964189931;
                           int var86 = var33 ^ 234352557;
                           var15 = var44.getBytes("ISO-8859-1");
                           var43 = var14;
                           var59 = var11++;
                           var84 = (var15[0] & 255L) << a(-1510549870, var33 ^ -1581224082)
                              | (var15[1] & 255L) << a(-1510549859, var33 ^ -1863976766)
                              | (var15[2] & 255L) << a(-1510549860, var33 ^ -1904565019)
                              | (var15[3] & 255L) << a(-1510549857, var33 ^ -356607762)
                              | (var15[4] & 255L) << a(-1510549858, var33 ^ 169196073)
                              | (var15[5] & 255L) << a(-1510549863, var33 ^ 339425074)
                              | (var15[a(-1510549864, var33 ^ -804400181)] & 255L) << a(-1510549861, var33 ^ 452139255)
                              | var15[a(-1510549862, var33 ^ -285510071)] & 255L;
                           var110 = 0;
                        }
                     }
                  }

                  var17 = var18.charAt(var37);
                  break;
               default:
                  var21[var19++] = var109;
                  if ((var37 += var17) < var20) {
                     var17 = var18.charAt(var37);
                     continue label143;
                  }

                  var20 = (var18 = babb(-964189935, var33 ^ 1442743385)).length();
                  var17 = 4;
                  var37 = -1;
            }

            var40 = var18.substring(++var37, var37 + var17);
            var10001 = (byte)0;
         }
      }
   }

   public static boolean abb(double var0, double var2, double var4, double var6, double var8, double var10) {
      return babbbaab.baa(var0, var2, var4, var6, var8, var10);
   }

   public static float baa(float var0, float var1, float var2) {
      return babbbaab.abab(var0, var1, var2);
   }

   public static double bab(double var0, double var2, double var4) {
      return babbbaab.bab(var0, var2, var4);
   }

   public static double bba(double var0) {
      double var2 = bab(var0, 0.0, 1.0);
      return 1.0 - (1.0 - var2) * (1.0 - var2);
   }

   public static int bbb(int var0, int var1, double var2) {
      int var18 = 219353568;
      double var4 = bab(var2, 0.0, 1.0);
      int var6 = var0 >>> abab(a(-1510549770, var18 ^ -1114001694), 192301652820546342L) & abab(a(-1510549775, var18 ^ -1491954978), 8445364160051728773L);
      int var7 = var0 >>> abab(a(-1510549776, var18 ^ 201639805), 4055572255982659774L) & abab(a(-1510549773, var18 ^ -1399310660), 8445364160051728773L);
      int var8 = var0 >>> abab(a(-1510549774, var18 ^ -2069285252), 3245101572786788923L) & abab(a(-1510549763, var18 ^ -700537414), 8445364160051728773L);
      int var9 = var0 & abab(a(-1510549764, var18 ^ 335202874), 8445364160051728773L);
      int var10 = var1 >>> abab(a(-1510549761, var18 ^ -1303963367), 3351295518025367177L) & abab(a(-1510549762, var18 ^ -1717173971), 8445364160051728773L);
      int var11 = var1 >>> abab(a(-1510549767, var18 ^ 2137762372), 6635755696067837474L) & abab(a(-1510549768, var18 ^ -1185764746), 8445364160051728773L);
      int var12 = var1 >>> abab(a(-1510549765, var18 ^ 152057165), 1985270328617350594L) & abab(a(-1510549766, var18 ^ -2107306438), 8445364160051728773L);
      int var13 = var1 & abab(a(-1510549787, var18 ^ -341740768), 8445364160051728773L);
      int var14 = b((int)Math.round(aaab(var6, var10, var4)), 0, abab(a(-1510549788, var18 ^ -745933591), 8445364160051728773L));
      int var15 = b((int)Math.round(aaab(var7, var11, var4)), 0, abab(a(-1510549785, var18 ^ -1529678670), 8445364160051728773L));
      int var16 = b((int)Math.round(aaab(var8, var12, var4)), 0, abab(a(-1510549786, var18 ^ 1804739093), 8445364160051728773L));
      int var17 = b((int)Math.round(aaab(var9, var13, var4)), 0, abab(a(-1510549791, var18 ^ -2083681360), 8445364160051728773L));
      return var14 << abab(a(-1510549792, var18 ^ 1345197123), 3351295518025367177L)
         | var15 << abab(a(-1510549789, var18 ^ 1116888482), 6635755696067837474L)
         | var16 << abab(a(-1510549790, var18 ^ -1645352722), 1985270328617350594L)
         | var17;
   }

   public static bbabaaaa aaaa(double var0, double var2, double var4, double var6, double var8, double var10) {
      return babbbaab.bbb(var0, var2, var4, var6, var8, var10);
   }

   public static double aaab(double var0, double var2, double var4) {
      return babbbaab.bb(var0, var2, var4);
   }

   public static int b(int var0, int var1, int var2) {
      return babbbaab.aaab(var0, var1, var2);
   }

   public static int aaba(int var0, int var1, double var2) {
      return babbbaab.aab(var0, var1, var2);
   }

   public static boolean aabb(bababba param0, double param1, double param3) {
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
      // 08: ifne 16
      // 0b: ifnonnull 15
      // 0e: goto 12
      // 11: athrow
      // 12: bipush 0
      // 13: ireturn
      // 14: athrow
      // 15: aload 0
      // 16: invokeinterface qeaa361f143ee4a0894bd168fd9b30c66/qf4ccf8f5435d4a78bdca4d6a018b578e/bababba.aabb ()D 1
      // 1b: dstore 6
      // 1d: iload 5
      // 1f: aload 0
      // 20: invokeinterface qeaa361f143ee4a0894bd168fd9b30c66/qf4ccf8f5435d4a78bdca4d6a018b578e/bababba.abb ()D 1
      // 25: dstore 8
      // 27: dload 6
      // 29: dload 8
      // 2b: aload 0
      // 2c: invokeinterface qeaa361f143ee4a0894bd168fd9b30c66/qf4ccf8f5435d4a78bdca4d6a018b578e/bababba.aaaaa ()D 1
      // 31: aload 0
      // 32: invokeinterface qeaa361f143ee4a0894bd168fd9b30c66/qf4ccf8f5435d4a78bdca4d6a018b578e/bababba.baab ()D 1
      // 37: dload 1
      // 38: dload 3
      // 39: invokestatic qeaa361f143ee4a0894bd168fd9b30c66/qf4ccf8f5435d4a78bdca4d6a018b578e/bbbbbbb.aaaa (DDDDDD)Lqeaa361f143ee4a0894bd168fd9b30c66/qf4ccf8f5435d4a78bdca4d6a018b578e/bbabaaaa;
      // 3c: astore 10
      // 3e: ifne 7f
      // 41: dload 6
      // 43: aload 10
      // 45: invokevirtual qeaa361f143ee4a0894bd168fd9b30c66/qf4ccf8f5435d4a78bdca4d6a018b578e/bbabaaaa.ba ()D
      // 48: invokestatic java/lang/Double.compare (DD)I
      // 4b: ifne 6f
      // 4e: goto 52
      // 51: athrow
      // 52: dload 8
      // 54: aload 10
      // 56: invokevirtual qeaa361f143ee4a0894bd168fd9b30c66/qf4ccf8f5435d4a78bdca4d6a018b578e/bbabaaaa.ab ()D
      // 59: invokestatic java/lang/Double.compare (DD)I
      // 5c: iload 5
      // 5e: ifne 80
      // 61: goto 65
      // 64: athrow
      // 65: ifne 6f
      // 68: goto 6c
      // 6b: athrow
      // 6c: bipush 0
      // 6d: ireturn
      // 6e: athrow
      // 6f: aload 0
      // 70: aload 10
      // 72: invokevirtual qeaa361f143ee4a0894bd168fd9b30c66/qf4ccf8f5435d4a78bdca4d6a018b578e/bbabaaaa.ba ()D
      // 75: aload 10
      // 77: invokevirtual qeaa361f143ee4a0894bd168fd9b30c66/qf4ccf8f5435d4a78bdca4d6a018b578e/bbabaaaa.ab ()D
      // 7a: invokeinterface qeaa361f143ee4a0894bd168fd9b30c66/qf4ccf8f5435d4a78bdca4d6a018b578e/bababba.abbb (DD)V 5
      // 7f: bipush 1
      // 80: ireturn
   }

   public static bbabaaaa abaa(bbabaaaa var0, Iterable var1, double var2, double var4) {
      return babbbaab.aaba(var0, var1, var2, var4);
   }

   private static int abab(int var0, long var1) {
      int var3 = var0 ^ (int)(var1 & 32767L) ^ a(-1510549779, 1627929344 ^ 655836500);
      if (aaa[var3] == null) {
         aaa[var3] = (int)(a[var3] ^ var1);
      }

      return aaa[var3];
   }

   public static double abba(double var0) {
      double var2 = bab(var0, 0.0, 1.0);
      double var4 = 1.0 - var2;
      return 1.0 - var4 * var4 * var4;
   }

   public static double abbb(double var0, double var2, double var4, double var6) {
      return babbbaab.abb(var0, var2, var4, var6);
   }

   private static int baaa(double param0) {
      // $VF: Couldn't be decompiled
      // Please report this to the Vineflower issue tracker, at https://github.com/Vineflower/vineflower/issues with a copy of the class file (if you have the rights to distribute it!)
      // java.lang.RuntimeException: parsing failure!
      //   at org.jetbrains.java.decompiler.modules.decompiler.decompose.DomHelper.parseGraph(DomHelper.java:211)
      //   at org.jetbrains.java.decompiler.main.rels.MethodProcessor.codeToJava(MethodProcessor.java:166)
      //
      // Bytecode:
      // 00: getstatic qeaa361f143ee4a0894bd168fd9b30c66/qf4ccf8f5435d4a78bdca4d6a018b578e/baaabbaa.bba I
      // 03: istore 2
      // 04: dload 0
      // 05: invokestatic java/lang/Math.abs (D)D
      // 08: dstore 3
      // 09: dload 3
      // 0a: dconst_0
      // 0b: dcmpg
      // 0c: iload 2
      // 0d: ifne 1b
      // 10: ifgt 1a
      // 13: goto 17
      // 16: athrow
      // 17: bipush 0
      // 18: ireturn
      // 19: athrow
      // 1a: bipush 0
      // 1b: istore 5
      // 1d: iload 5
      // 1f: ldc_w -1510549780
      // 22: ldc_w -914964662
      // 25: ldc_w 397956261
      // 28: ixor
      // 29: invokestatic qeaa361f143ee4a0894bd168fd9b30c66/qf4ccf8f5435d4a78bdca4d6a018b578e/bbbbbbb.a (II)I
      // 2c: ldc2_w 7148999272439037622
      // 2f: invokestatic qeaa361f143ee4a0894bd168fd9b30c66/qf4ccf8f5435d4a78bdca4d6a018b578e/bbbbbbb.abab (IJ)I
      // 32: if_icmpge 62
      // 35: dload 3
      // 36: dload 3
      // 37: invokestatic java/lang/Math.rint (D)D
      // 3a: dsub
      // 3b: invokestatic java/lang/Math.abs (D)D
      // 3e: ldc2_w 1.0E-6
      // 41: dcmpl
      // 42: iload 2
      // 43: ifne 64
      // 46: iload 2
      // 47: ifne 64
      // 4a: goto 4e
      // 4d: athrow
      // 4e: ifle 62
      // 51: goto 55
      // 54: athrow
      // 55: dload 3
      // 56: ldc2_w 10.0
      // 59: dmul
      // 5a: dstore 3
      // 5b: iload 2
      // 5c: iinc 5 1
      // 5f: ifeq 1d
      // 62: iload 5
      // 64: ireturn
   }

   public static int baab(int var0, int var1) {
      return babbbaab.ba(var0, var1);
   }

   public static String baba(double param0, double param2, String param4) {
      // $VF: Couldn't be decompiled
      // Please report this to the Vineflower issue tracker, at https://github.com/Vineflower/vineflower/issues with a copy of the class file (if you have the rights to distribute it!)
      // java.lang.RuntimeException: parsing failure!
      //   at org.jetbrains.java.decompiler.modules.decompiler.decompose.DomHelper.parseGraph(DomHelper.java:211)
      //   at org.jetbrains.java.decompiler.main.rels.MethodProcessor.codeToJava(MethodProcessor.java:166)
      //
      // Bytecode:
      // 000: getstatic qeaa361f143ee4a0894bd168fd9b30c66/qf4ccf8f5435d4a78bdca4d6a018b578e/baaabbaa.bba I
      // 003: istore 5
      // 005: dload 2
      // 006: invokestatic qeaa361f143ee4a0894bd168fd9b30c66/qf4ccf8f5435d4a78bdca4d6a018b578e/bbbbbbb.baaa (D)I
      // 009: istore 6
      // 00b: iload 6
      // 00d: ifgt 01b
      // 010: dload 0
      // 011: invokestatic java/lang/Math.round (D)J
      // 014: invokestatic java/lang/Long.toString (J)Ljava/lang/String;
      // 017: goto 05d
      // 01a: athrow
      // 01b: getstatic java/util/Locale.US Ljava/util/Locale;
      // 01e: getstatic qeaa361f143ee4a0894bd168fd9b30c66/qf4ccf8f5435d4a78bdca4d6a018b578e/bbbbbbb.b [Ljava/lang/String;
      // 021: bipush 1
      // 022: aaload
      // 023: invokestatic qeaa361f143ee4a0894bd168fd9b30c66/qf4ccf8f5435d4a78bdca4d6a018b578e/aabbaaaba.abba (Ljava/lang/String;)Ljava/lang/String;
      // 026: iload 6
      // 028: getstatic qeaa361f143ee4a0894bd168fd9b30c66/qf4ccf8f5435d4a78bdca4d6a018b578e/bbbbbbb.b [Ljava/lang/String;
      // 02b: bipush 0
      // 02c: aaload
      // 02d: invokestatic qeaa361f143ee4a0894bd168fd9b30c66/qf4ccf8f5435d4a78bdca4d6a018b578e/aabbaaaba.abba (Ljava/lang/String;)Ljava/lang/String;
      // 030: astore 10
      // 032: istore 9
      // 034: astore 8
      // 036: new java/lang/StringBuilder
      // 039: dup
      // 03a: invokespecial java/lang/StringBuilder.<init> ()V
      // 03d: aload 8
      // 03f: invokevirtual java/lang/StringBuilder.append (Ljava/lang/Object;)Ljava/lang/StringBuilder;
      // 042: iload 9
      // 044: invokevirtual java/lang/StringBuilder.append (I)Ljava/lang/StringBuilder;
      // 047: aload 10
      // 049: invokevirtual java/lang/StringBuilder.append (Ljava/lang/Object;)Ljava/lang/StringBuilder;
      // 04c: invokevirtual java/lang/StringBuilder.toString ()Ljava/lang/String;
      // 04f: bipush 1
      // 050: anewarray 4
      // 053: dup
      // 054: bipush 0
      // 055: dload 0
      // 056: invokestatic java/lang/Double.valueOf (D)Ljava/lang/Double;
      // 059: aastore
      // 05a: invokestatic java/lang/String.format (Ljava/util/Locale;Ljava/lang/String;[Ljava/lang/Object;)Ljava/lang/String;
      // 05d: astore 7
      // 05f: iload 6
      // 061: iload 5
      // 063: ifne 092
      // 066: ifle 0ee
      // 069: goto 06d
      // 06c: athrow
      // 06d: aload 7
      // 06f: iload 5
      // 071: ifne 0f0
      // 074: goto 078
      // 077: athrow
      // 078: ldc_w -1510549777
      // 07b: ldc_w 87316080
      // 07e: ldc_w -1344249746
      // 081: ixor
      // 082: invokestatic qeaa361f143ee4a0894bd168fd9b30c66/qf4ccf8f5435d4a78bdca4d6a018b578e/bbbbbbb.a (II)I
      // 085: ldc2_w 5441895586055828197
      // 088: invokestatic qeaa361f143ee4a0894bd168fd9b30c66/qf4ccf8f5435d4a78bdca4d6a018b578e/bbbbbbb.abab (IJ)I
      // 08b: invokevirtual java/lang/String.indexOf (I)I
      // 08e: goto 092
      // 091: athrow
      // 092: iflt 0ee
      // 095: aload 7
      // 097: getstatic qeaa361f143ee4a0894bd168fd9b30c66/qf4ccf8f5435d4a78bdca4d6a018b578e/bbbbbbb.b [Ljava/lang/String;
      // 09a: bipush 3
      // 09b: aaload
      // 09c: invokestatic qeaa361f143ee4a0894bd168fd9b30c66/qf4ccf8f5435d4a78bdca4d6a018b578e/aabbaaaba.abba (Ljava/lang/String;)Ljava/lang/String;
      // 09f: invokevirtual java/lang/String.endsWith (Ljava/lang/String;)Z
      // 0a2: ifeq 0c2
      // 0a5: goto 0a9
      // 0a8: athrow
      // 0a9: aload 7
      // 0ab: bipush 0
      // 0ac: aload 7
      // 0ae: invokevirtual java/lang/String.length ()I
      // 0b1: bipush 1
      // 0b2: iload 5
      // 0b4: ifne 0e8
      // 0b7: isub
      // 0b8: invokevirtual java/lang/String.substring (II)Ljava/lang/String;
      // 0bb: astore 7
      // 0bd: iload 5
      // 0bf: ifeq 095
      // 0c2: aload 7
      // 0c4: iload 5
      // 0c6: ifne 0f0
      // 0c9: getstatic qeaa361f143ee4a0894bd168fd9b30c66/qf4ccf8f5435d4a78bdca4d6a018b578e/bbbbbbb.b [Ljava/lang/String;
      // 0cc: bipush 2
      // 0cd: aaload
      // 0ce: invokestatic qeaa361f143ee4a0894bd168fd9b30c66/qf4ccf8f5435d4a78bdca4d6a018b578e/aabbaaaba.abba (Ljava/lang/String;)Ljava/lang/String;
      // 0d1: invokevirtual java/lang/String.endsWith (Ljava/lang/String;)Z
      // 0d4: ifeq 0ee
      // 0d7: goto 0db
      // 0da: athrow
      // 0db: aload 7
      // 0dd: bipush 0
      // 0de: aload 7
      // 0e0: invokevirtual java/lang/String.length ()I
      // 0e3: bipush 1
      // 0e4: goto 0e8
      // 0e7: athrow
      // 0e8: isub
      // 0e9: invokevirtual java/lang/String.substring (II)Ljava/lang/String;
      // 0ec: astore 7
      // 0ee: aload 4
      // 0f0: iload 5
      // 0f2: ifne 117
      // 0f5: ifnull 111
      // 0f8: goto 0fc
      // 0fb: athrow
      // 0fc: aload 4
      // 0fe: iload 5
      // 100: ifne 11c
      // 103: goto 107
      // 106: athrow
      // 107: invokevirtual java/lang/String.isBlank ()Z
      // 10a: ifeq 11a
      // 10d: goto 111
      // 110: athrow
      // 111: aload 7
      // 113: goto 117
      // 116: athrow
      // 117: goto 136
      // 11a: aload 7
      // 11c: aload 4
      // 11e: astore 10
      // 120: astore 9
      // 122: new java/lang/StringBuilder
      // 125: dup
      // 126: invokespecial java/lang/StringBuilder.<init> ()V
      // 129: aload 9
      // 12b: invokevirtual java/lang/StringBuilder.append (Ljava/lang/Object;)Ljava/lang/StringBuilder;
      // 12e: aload 10
      // 130: invokevirtual java/lang/StringBuilder.append (Ljava/lang/Object;)Ljava/lang/StringBuilder;
      // 133: invokevirtual java/lang/StringBuilder.toString ()Ljava/lang/String;
      // 136: areturn
   }
}
