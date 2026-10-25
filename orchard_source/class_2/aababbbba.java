package nsc;

import java.util.List;
import java.util.concurrent.ThreadLocalRandom;
import net.fabricmc.api.EnvType;
import net.fabricmc.api.Environment;
import net.minecraft.class_310;
import net.minecraft.class_746;

@Environment(EnvType.CLIENT)
public final class aababbbba extends abbaabbaa {
   private static final Object[] abaa;
   private boolean aa;
   private int ab;
   private final aaaaa ba;
   private boolean bb;
   private int aaa;
   private static final String[] aab;
   private static final String[] aabb;
   private static final int[] aaba;
   private final aaaaa aba;
   private final abaabbbb abb;
   private static final ababbbbaa[] baa;
   private final aaaaa bab;
   private final bababa bba;
   private static final String[] bbb;
   private final aaaaa aaaa;
   private final aaabbbab aaab;

   private static String b(byte var0, char var1, byte var2, short var3, int var4) {
      int var9 = var4 ^ -1364303766;
      char[] var8 = aabb[var9].toCharArray();
      StackTraceElement[] var10 = (StackTraceElement[])abaa[var9];
      StackTraceElement[] var11;
      if (var10 != null) {
         var11 = var10;
      } else {
         var11 = new Throwable().getStackTrace();
         abaa[var9] = var11;
      }

      StackTraceElement var12 = var11[1];
      int var6 = (var12.getClassName().hashCode() ^ var12.getMethodName().hashCode()) >> 16 ^ 13210;

      for (int var7 = 0; var7 < var8.length; var7++) {
         var8[var7] = (char)(var8[var7] ^ 12942 ^ switch (var7 % 15) {
            default -> 50;
            case 1 -> 156;
            case 2 -> 149;
            case 3 -> 101;
            case 4 -> 146;
            case 5 -> 124;
            case 6 -> 113;
            case 7 -> 64;
            case 8 -> 244;
            case 9 -> 183;
            case 10 -> 57;
            case 11 -> 11;
            case 12 -> 57;
            case 13 -> 254;
            case 14 -> 56;
         } ^ var7 ^ var2 ^ var3 ^ var1 ^ var0 ^ var4 ^ var6);
      }

      return new String(var8).intern();
   }

   private static int a(int var0, int var1) {
      int var2 = aaba[var0 ^ -2057473564] ^ var1 ^ var0;
      var2 ^= 49584;
      var2 -= 38744;
      var2 ^= 17431;
      var2 -= 44533;
      var2 -= 58817;
      var2 ^= 42269;
      var2 -= 14618;
      return var2 ^ 35381;
   }

   private static String aa(int var0, int var1) {
      int var9 = 599092210;
      int var2 = (var0 ^ a(-2057473552, var9 ^ 930032089)) & a(-2057473551, var9 ^ 276082310);
      if (aab[var2] == null) {
         char[] var3 = bbb[var2].toCharArray();

         int var4 = switch (var3[0] & a(-2057473550, var9 ^ -745421969)) {
            case 0 -> a(-2057473549, var9 ^ -1679556547);
            case 1 -> a(-2057473540, var9 ^ -165207501);
            case 2 -> a(-2057473539, var9 ^ -1584564660);
            case 3 -> a(-2057473538, var9 ^ 1015885898);
            case 4 -> a(-2057473537, var9 ^ -111740068);
            case 5 -> a(-2057473544, var9 ^ -497710110);
            case 6 -> a(-2057473543, var9 ^ -493245874);
            case 7 -> a(-2057473542, var9 ^ 1537387620);
            case 8 -> a(-2057473541, var9 ^ 710566285);
            case 9 -> a(-2057473596, var9 ^ 1112390120);
            case 10 -> a(-2057473595, var9 ^ 1803821519);
            case 11 -> a(-2057473594, var9 ^ -574241202);
            case 12 -> a(-2057473593, var9 ^ -19789684);
            case 13 -> a(-2057473600, var9 ^ -153483421);
            case 14 -> a(-2057473599, var9 ^ -940023970);
            case 15 -> a(-2057473598, var9 ^ -1506964578);
            case 16 -> a(-2057473597, var9 ^ -1343211742);
            case 17 -> a(-2057473588, var9 ^ 1143076100);
            case 18 -> a(-2057473587, var9 ^ 832654394);
            case 19 -> a(-2057473586, var9 ^ -696869697);
            case 20 -> a(-2057473585, var9 ^ 656901948);
            case 21 -> a(-2057473592, var9 ^ -42210269);
            case 22 -> a(-2057473591, var9 ^ 135565921);
            case 23 -> a(-2057473590, var9 ^ -627122030);
            case 24 -> a(-2057473589, var9 ^ 551818662);
            case 25 -> a(-2057473580, var9 ^ 968519056);
            case 26 -> a(-2057473579, var9 ^ -1443440971);
            case 27 -> a(-2057473578, var9 ^ -80921861);
            case 28 -> a(-2057473577, var9 ^ 1014354121);
            case 29 -> a(-2057473584, var9 ^ -671884013);
            case 30 -> a(-2057473583, var9 ^ 747214617);
            case 31 -> a(-2057473582, var9 ^ 711354658);
            case 32 -> a(-2057473581, var9 ^ -1320710892);
            case 33 -> a(-2057473572, var9 ^ -6709080);
            case 34 -> a(-2057473571, var9 ^ 2136887499);
            case 35 -> a(-2057473570, var9 ^ 2001709519);
            case 36 -> a(-2057473569, var9 ^ -1521623452);
            case 37 -> a(-2057473576, var9 ^ 1943972844);
            case 38 -> a(-2057473575, var9 ^ 1734594069);
            case 39 -> a(-2057473574, var9 ^ -904259347);
            case 40 -> a(-2057473573, var9 ^ 87789119);
            case 41 -> a(-2057473628, var9 ^ -1372663042);
            case 42 -> a(-2057473627, var9 ^ 498800179);
            case 43 -> a(-2057473626, var9 ^ 38342199);
            case 44 -> a(-2057473625, var9 ^ 1056492232);
            case 45 -> 3;
            case 46 -> a(-2057473632, var9 ^ 1802473948);
            case 47 -> a(-2057473631, var9 ^ -85869946);
            case 48 -> a(-2057473630, var9 ^ -1698460029);
            case 49 -> a(-2057473629, var9 ^ 1705808956);
            case 50 -> a(-2057473620, var9 ^ 1059645265);
            case 51 -> a(-2057473619, var9 ^ -365043648);
            case 52 -> a(-2057473618, var9 ^ -1985678200);
            case 53 -> a(-2057473617, var9 ^ -660535541);
            case 54 -> a(-2057473624, var9 ^ 896637567);
            case 55 -> a(-2057473623, var9 ^ -1108120359);
            case 56 -> a(-2057473622, var9 ^ -336107071);
            case 57 -> a(-2057473621, var9 ^ 2121831393);
            case 58 -> a(-2057473612, var9 ^ 2109554504);
            case 59 -> a(-2057473611, var9 ^ 808808088);
            case 60 -> a(-2057473610, var9 ^ 1292190044);
            case 61 -> a(-2057473609, var9 ^ 1020352370);
            case 62 -> a(-2057473616, var9 ^ -1414938817);
            case 63 -> a(-2057473615, var9 ^ -1150593312);
            case 64 -> a(-2057473614, var9 ^ 900112772);
            case 65 -> a(-2057473613, var9 ^ 421731060);
            case 66 -> a(-2057473604, var9 ^ -1513377498);
            case 67 -> 1;
            case 68 -> a(-2057473603, var9 ^ 837838846);
            case 69 -> a(-2057473602, var9 ^ 743490734);
            case 70 -> a(-2057473601, var9 ^ -2009040401);
            case 71 -> a(-2057473608, var9 ^ 649259149);
            case 72 -> a(-2057473607, var9 ^ -605221659);
            case 73 -> a(-2057473606, var9 ^ 1010536587);
            case 74 -> a(-2057473605, var9 ^ -495627877);
            case 75 -> a(-2057473660, var9 ^ -689634597);
            case 76 -> a(-2057473659, var9 ^ 495791705);
            case 77 -> 5;
            case 78 -> a(-2057473658, var9 ^ 261233996);
            case 79 -> a(-2057473657, var9 ^ -1858755705);
            case 80 -> a(-2057473664, var9 ^ -1576884135);
            case 81 -> a(-2057473663, var9 ^ 1468233418);
            case 82 -> a(-2057473662, var9 ^ 854638640);
            case 83 -> a(-2057473661, var9 ^ 1951139984);
            case 84 -> 4;
            case 85 -> 2;
            case 86 -> a(-2057473652, var9 ^ -204036039);
            case 87 -> a(-2057473651, var9 ^ -301437311);
            case 88 -> a(-2057473650, var9 ^ -1205335671);
            case 89 -> a(-2057473649, var9 ^ -487661694);
            case 90 -> a(-2057473656, var9 ^ 1693056134);
            case 91 -> a(-2057473655, var9 ^ 805864959);
            case 92 -> a(-2057473654, var9 ^ -1935162670);
            case 93 -> a(-2057473653, var9 ^ 2135894401);
            case 94 -> a(-2057473644, var9 ^ 2007468780);
            case 95 -> a(-2057473643, var9 ^ 677268105);
            case 96 -> a(-2057473642, var9 ^ 1863380498);
            case 97 -> a(-2057473641, var9 ^ 1698841981);
            case 98 -> a(-2057473648, var9 ^ 1979529117);
            case 99 -> a(-2057473647, var9 ^ 2070084456);
            case 100 -> a(-2057473646, var9 ^ 1167023414);
            case 101 -> a(-2057473645, var9 ^ -2015442801);
            case 102 -> a(-2057473636, var9 ^ -621891552);
            case 103 -> a(-2057473635, var9 ^ -1993480113);
            case 104 -> a(-2057473634, var9 ^ 1930679308);
            case 105 -> 0;
            case 106 -> a(-2057473633, var9 ^ -219451661);
            case 107 -> a(-2057473640, var9 ^ -1156120081);
            case 108 -> a(-2057473639, var9 ^ 1651449580);
            case 109 -> a(-2057473638, var9 ^ 813545825);
            case 110 -> a(-2057473637, var9 ^ -1435793101);
            case 111 -> a(-2057473692, var9 ^ -213611267);
            case 112 -> a(-2057473691, var9 ^ 1265756119);
            case 113 -> a(-2057473690, var9 ^ -1769296228);
            case 114 -> a(-2057473689, var9 ^ -1931010474);
            case 115 -> a(-2057473696, var9 ^ -1657205758);
            case 116 -> a(-2057473695, var9 ^ 2045443953);
            case 117 -> a(-2057473694, var9 ^ -148164835);
            case 118 -> a(-2057473693, var9 ^ -540198423);
            case 119 -> a(-2057473684, var9 ^ 2136482114);
            case 120 -> a(-2057473683, var9 ^ -1479312648);
            case 121 -> a(-2057473682, var9 ^ -1975782500);
            case 122 -> a(-2057473681, var9 ^ -1357135018);
            case 123 -> a(-2057473688, var9 ^ -216951843);
            case 124 -> a(-2057473687, var9 ^ -1972128279);
            case 125 -> a(-2057473686, var9 ^ -457594941);
            case 126 -> a(-2057473685, var9 ^ -1408237654);
            case 127 -> a(-2057473676, var9 ^ -529744388);
            case 128 -> a(-2057473675, var9 ^ -629269180);
            case 129 -> a(-2057473674, var9 ^ 209238160);
            case 130 -> a(-2057473673, var9 ^ -1376836823);
            case 131 -> a(-2057473680, var9 ^ -1103590496);
            case 132 -> a(-2057473679, var9 ^ 743738337);
            case 133 -> a(-2057473678, var9 ^ 1009900244);
            case 134 -> a(-2057473677, var9 ^ -1657425602);
            case 135 -> a(-2057473668, var9 ^ 2016288690);
            case 136 -> a(-2057473667, var9 ^ 1770702529);
            case 137 -> a(-2057473666, var9 ^ -59278020);
            case 138 -> a(-2057473665, var9 ^ -1520422688);
            case 139 -> a(-2057473672, var9 ^ -1830362169);
            case 140 -> a(-2057473671, var9 ^ -1165359349);
            case 141 -> a(-2057473670, var9 ^ 667180166);
            case 142 -> a(-2057473669, var9 ^ 556699401);
            case 143 -> a(-2057473724, var9 ^ -456978901);
            case 144 -> a(-2057473723, var9 ^ 2109082832);
            case 145 -> a(-2057473722, var9 ^ -1119531044);
            case 146 -> a(-2057473721, var9 ^ -1602326702);
            case 147 -> a(-2057473728, var9 ^ 1764832528);
            case 148 -> a(-2057473727, var9 ^ 1367577049);
            case 149 -> a(-2057473726, var9 ^ 360638139);
            case 150 -> a(-2057473725, var9 ^ -950775997);
            case 151 -> a(-2057473716, var9 ^ 1535111);
            case 152 -> a(-2057473715, var9 ^ -1482422036);
            case 153 -> a(-2057473714, var9 ^ -286710567);
            case 154 -> a(-2057473713, var9 ^ -1259454463);
            case 155 -> a(-2057473720, var9 ^ 1462871879);
            case 156 -> a(-2057473719, var9 ^ -940011805);
            case 157 -> a(-2057473718, var9 ^ 1118544020);
            case 158 -> a(-2057473717, var9 ^ -356571978);
            case 159 -> a(-2057473708, var9 ^ 1555335855);
            case 160 -> a(-2057473707, var9 ^ 1252507004);
            case 161 -> a(-2057473706, var9 ^ -511504878);
            case 162 -> a(-2057473705, var9 ^ 1075366995);
            case 163 -> a(-2057473712, var9 ^ -1363923550);
            case 164 -> a(-2057473711, var9 ^ 63432310);
            case 165 -> a(-2057473710, var9 ^ -600511515);
            case 166 -> a(-2057473709, var9 ^ 1702546760);
            case 167 -> a(-2057473700, var9 ^ 1357069296);
            case 168 -> a(-2057473699, var9 ^ 132213753);
            case 169 -> a(-2057473698, var9 ^ 871742457);
            case 170 -> a(-2057473697, var9 ^ -1002941028);
            case 171 -> a(-2057473704, var9 ^ -228091332);
            case 172 -> a(-2057473703, var9 ^ 1771696326);
            case 173 -> a(-2057473702, var9 ^ -837007982);
            case 174 -> a(-2057473701, var9 ^ 1990809673);
            case 175 -> a(-2057473756, var9 ^ -385082182);
            case 176 -> a(-2057473755, var9 ^ -1442979958);
            case 177 -> a(-2057473754, var9 ^ 1297483535);
            case 178 -> a(-2057473753, var9 ^ 1319274032);
            case 179 -> a(-2057473760, var9 ^ 1855008461);
            case 180 -> a(-2057473759, var9 ^ -1050681271);
            case 181 -> a(-2057473758, var9 ^ 1726605326);
            case 182 -> a(-2057473757, var9 ^ -1319278542);
            case 183 -> a(-2057473748, var9 ^ 882340413);
            case 184 -> a(-2057473747, var9 ^ 937748420);
            case 185 -> a(-2057473746, var9 ^ -1727527737);
            case 186 -> a(-2057473745, var9 ^ 1887939307);
            case 187 -> a(-2057473752, var9 ^ 684421499);
            case 188 -> a(-2057473751, var9 ^ 1553934315);
            case 189 -> a(-2057473750, var9 ^ 1901386627);
            case 190 -> a(-2057473749, var9 ^ 1164289652);
            case 191 -> a(-2057473740, var9 ^ -80669824);
            case 192 -> a(-2057473739, var9 ^ 979139051);
            case 193 -> a(-2057473738, var9 ^ -92332858);
            case 194 -> a(-2057473737, var9 ^ -123832848);
            case 195 -> a(-2057473744, var9 ^ 1430893613);
            case 196 -> a(-2057473743, var9 ^ 1809618802);
            case 197 -> a(-2057473742, var9 ^ -1876881188);
            case 198 -> a(-2057473741, var9 ^ -573061885);
            case 199 -> a(-2057473732, var9 ^ -753801604);
            case 200 -> a(-2057473731, var9 ^ -1902752851);
            case 201 -> a(-2057473730, var9 ^ -1147501761);
            case 202 -> a(-2057473729, var9 ^ -1602929657);
            case 203 -> a(-2057473736, var9 ^ -269627795);
            case 204 -> a(-2057473735, var9 ^ 1804273061);
            case 205 -> a(-2057473734, var9 ^ -452293638);
            case 206 -> a(-2057473733, var9 ^ -937210498);
            case 207 -> a(-2057473788, var9 ^ 75006396);
            case 208 -> a(-2057473787, var9 ^ -877650804);
            case 209 -> a(-2057473786, var9 ^ 378403064);
            case 210 -> a(-2057473785, var9 ^ 1757153882);
            case 211 -> a(-2057473792, var9 ^ 118341767);
            case 212 -> a(-2057473791, var9 ^ -1982339905);
            case 213 -> a(-2057473790, var9 ^ -420853343);
            case 214 -> a(-2057473789, var9 ^ 1541054779);
            case 215 -> a(-2057473780, var9 ^ 1861438630);
            case 216 -> a(-2057473779, var9 ^ -1554704955);
            case 217 -> a(-2057473778, var9 ^ -1581253837);
            case 218 -> a(-2057473777, var9 ^ 251190685);
            case 219 -> a(-2057473784, var9 ^ 1844820157);
            case 220 -> a(-2057473783, var9 ^ -1989911923);
            case 221 -> a(-2057473782, var9 ^ -1859475140);
            case 222 -> a(-2057473781, var9 ^ 353925313);
            case 223 -> a(-2057473772, var9 ^ -1045405695);
            case 224 -> a(-2057473771, var9 ^ -736895256);
            case 225 -> a(-2057473770, var9 ^ 1714393495);
            case 226 -> a(-2057473769, var9 ^ -189572590);
            case 227 -> a(-2057473776, var9 ^ 1883981759);
            case 228 -> a(-2057473775, var9 ^ -375121294);
            case 229 -> a(-2057473774, var9 ^ -1130331514);
            case 230 -> a(-2057473773, var9 ^ -408576147);
            case 231 -> a(-2057473764, var9 ^ 442974002);
            case 232 -> a(-2057473763, var9 ^ -1902640782);
            case 233 -> a(-2057473762, var9 ^ 934982681);
            case 234 -> a(-2057473761, var9 ^ -1492706674);
            case 235 -> a(-2057473768, var9 ^ 1382748303);
            case 236 -> a(-2057473767, var9 ^ 1712927811);
            case 237 -> a(-2057473766, var9 ^ 667527290);
            case 238 -> a(-2057473765, var9 ^ 1454786821);
            case 239 -> a(-2057473820, var9 ^ 2042747800);
            case 240 -> a(-2057473819, var9 ^ 2137255153);
            case 241 -> a(-2057473818, var9 ^ -778504898);
            case 242 -> a(-2057473817, var9 ^ -19383701);
            case 243 -> a(-2057473824, var9 ^ 796222021);
            case 244 -> a(-2057473823, var9 ^ 975001239);
            case 245 -> a(-2057473822, var9 ^ 568576487);
            case 246 -> a(-2057473821, var9 ^ 1542506933);
            case 247 -> a(-2057473812, var9 ^ -913400236);
            case 248 -> a(-2057473811, var9 ^ 1743640896);
            case 249 -> a(-2057473810, var9 ^ -1333800094);
            case 250 -> a(-2057473809, var9 ^ -20029782);
            case 251 -> a(-2057473816, var9 ^ -1646249976);
            case 252 -> a(-2057473815, var9 ^ 1898608398);
            case 253 -> a(-2057473814, var9 ^ 1905000361);
            case 254 -> a(-2057473813, var9 ^ -1973658297);
            default -> a(-2057473804, var9 ^ -801121518);
         };
         int var5 = (var1 & a(-2057473803, var9 ^ 1152750918)) - var4;
         if (var5 < 0) {
            var5 += 256;
         }

         int var6 = ((var1 & a(-2057473802, var9 ^ -38581202)) >>> a(-2057473801, var9 ^ 1148795248)) - var4;
         if (var6 < 0) {
            var6 += 256;
         }

         for (int var7 = 0; var7 < var3.length; var7++) {
            int var8 = var7 % 2;
            char var10002 = var3[var7];
            if (var8 == 0) {
               var3[var7] = (char)(var10002 ^ var5);
               var5 = ((var5 >>> 3 | var5 << 5) ^ var3[var7]) & a(-2057473808, var9 ^ 1134791945);
            } else {
               var3[var7] = (char)(var10002 ^ var6);
               var6 = ((var6 >>> 3 | var6 << 5) ^ var3[var7]) & a(-2057473807, var9 ^ 640792097);
            }
         }

         aab[var2] = new String(var3).intern();
      }

      return aab[var2];
   }

   private int ab() {
      int var1 = Math.max(1, (int)Math.round(this.aaab.bab()));
      int var2 = Math.max(var1, (int)Math.round(this.aaab.abb()));
      return ThreadLocalRandom.current().nextInt(var1, var2 + 1);
   }

   @Override
   public void aabaa() {
      this.aab();
   }

   public aababbbba() {
      int var1 = -1853877117;
      super(
         aabbaaaba.aaab(aa(a(-2057473806, var1 ^ 1425991842), a(-2057473805, var1 ^ -414589466))),
         bbaabbba.bba,
         aabbaaaba.aaab(aa(a(-2057473796, var1 ^ 2084322353), a(-2057473795, var1 ^ 1416202495)))
      );
      this.aaab = (aaabbbab)this.abbbaaa(
         new aaabbbab(
               aabbaaaba.aaab(aa(a(-2057473794, var1 ^ 953781623), a(-2057473793, var1 ^ 1798417766))),
               1.0,
               1.0,
               1.0,
               4.0,
               1.0
            )
            .bbb(aabbaaaba.aaab(aa(a(-2057473800, var1 ^ -645141948), a(-2057473799, var1 ^ -464543957))))
      );
      this.bba = (bababa)this.abbbaaa(
         new bababa(
            aabbaaaba.aaab(aa(a(-2057473798, var1 ^ -429109811), a(-2057473797, var1 ^ -569215632))), 0.3, 0.2, 1.0, 0.05
         )
      );
      this.abb = (abaabbbb)this.abbbaaa(
         new abaabbbb(
            aabbaaaba.aaab(aa(a(-2057473852, var1 ^ 374600732), a(-2057473851, var1 ^ -155804438))),
            bbabbab(baa),
            List.of(baa[3])
         )
      );
      this.aba = abbbaba(this.abb, 0);
      this.ba = abbbaba(this.abb, 1);
      this.bab = abbbaba(this.abb, 2);
      this.aaaa = abbbaba(this.abb, 3);
      this.bbbabab(this.abb, new ababbbbaa[0]);
   }

   public boolean ba(class_310 var1) {
      return false;
   }

   public boolean bb(class_310 param1) {
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
      // 06: ifne 18
      // 09: invokevirtual qeaa361f143ee4a0894bd168fd9b30c66/qf4ccf8f5435d4a78bdca4d6a018b578e/aababbbba.babbaab ()Z
      // 0c: ifeq 2a
      // 0f: goto 13
      // 12: athrow
      // 13: aload 0
      // 14: goto 18
      // 17: athrow
      // 18: getfield qeaa361f143ee4a0894bd168fd9b30c66/qf4ccf8f5435d4a78bdca4d6a018b578e/aababbbba.aa Z
      // 1b: iload 2
      // 1c: ifne 27
      // 1f: ifeq 2a
      // 22: goto 26
      // 25: athrow
      // 26: bipush 1
      // 27: goto 2b
      // 2a: bipush 0
      // 2b: ireturn
   }

   public double aaa(class_310 param1) {
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
      // 06: ifne 18
      // 09: invokevirtual qeaa361f143ee4a0894bd168fd9b30c66/qf4ccf8f5435d4a78bdca4d6a018b578e/aababbbba.babbaab ()Z
      // 0c: ifeq 3a
      // 0f: goto 13
      // 12: athrow
      // 13: aload 0
      // 14: goto 18
      // 17: athrow
      // 18: iload 2
      // 19: ifne 31
      // 1c: getfield qeaa361f143ee4a0894bd168fd9b30c66/qf4ccf8f5435d4a78bdca4d6a018b578e/aababbbba.bb Z
      // 1f: ifeq 3a
      // 22: goto 26
      // 25: athrow
      // 26: aload 0
      // 27: getfield qeaa361f143ee4a0894bd168fd9b30c66/qf4ccf8f5435d4a78bdca4d6a018b578e/aababbbba.bba Lqeaa361f143ee4a0894bd168fd9b30c66/qf4ccf8f5435d4a78bdca4d6a018b578e/bababa;
      // 2a: invokevirtual qeaa361f143ee4a0894bd168fd9b30c66/qf4ccf8f5435d4a78bdca4d6a018b578e/bababa.abbb ()Ljava/lang/Object;
      // 2d: goto 31
      // 30: athrow
      // 31: checkcast java/lang/Double
      // 34: invokevirtual java/lang/Double.doubleValue ()D
      // 37: goto 3b
      // 3a: dconst_1
      // 3b: dreturn
   }

   private void aab() {
      this.aa = false;
      this.aaa = 0;
      this.ab = 0;
      this.bb = false;
   }

   // $VF: Irreducible bytecode was duplicated to produce valid code
   static {
      int var17 = 1177625260;
      int var11 = 0;
      short var12 = 28705;
      int var10 = 0;
      String[] var9 = new String[2];
      int var8 = "ÿ鮻讚逻ᮑ銻\u0b9d骫䮑閻\ueb9e鬫殑闛ꮞ鹫㮛鷻殖鵋䮖鸻뮖钫\u0b91阻箖鉛㮞鹛宜阻쮒髻箞霛뮝銛鮞鸋ᮞ醻殖鋛ஐ鑛箙頻க鲻ᮘ鏛㮓鎋鮑郋ᮞ龻뮒鐫ட餫宐阛䮙鶫\ueb96鵻㮖鸫ட鲫ꮖ陫鮗遛\u0b97飫箙醻宗鳫쮜靋䮕酛鮑黛ᮜ靋\ueb9d麫殑鷫㮓馻ꮛ錫㮗鎋ᮝ髛宜闻殘陋\udb92铫鮙鸋\ueb9d驛쮗飫讙邛\u2b96醻䮘陫㮛釛箛鍫宝鑛鮘騫箝鉋\udb94鯻讗騻䮚龋ஓ鲛ﮘ鷻宜騋ꮜ鳛쮚饻⮟鄋쮟鏛\ueb9b鍫讑鼫讙靋箓隋ஒ錻\udb93郻鮖駫鮔醻ﮔ鹻\udb99銛宖闋ﮓ銻뮐鉋讑駛ᮑ醋⮔鮻쮝鏫ꮕ鮻䮕鍫䮐鞛箐鑻쮞骻鮐颋\u0b9b龻ꮑ锻ꮕ魛箝鑋㮗黋䮒鳋ﮕ鏻\udb96麻㮓龻鮘鯻쮗釛뮟驛쮛鋛箝遻宛陻뮟黻鮟齫ꮝ闛ꮖ鋋\udb9f韋뮞閛뮞釋讝鲫뮒龛箚鍛ﮓ驻鮔铻\ueb94鰻쮕颋㮘铫-쨚\ueace쉺㫃쾊⫍콚竇쭺髎즚⫀쵺䫋옚\ueacc쓺竁잪醙쿪쫂쏚᫉쎪䫁츺\u0aca즚쫃슊\udac1쿊嫋줪뫎앚쫊콚ꫂ쓚䫀쁺\udace쨚"
         .length();
      String var7 = "ÿ鮻讚逻ᮑ銻\u0b9d骫䮑閻\ueb9e鬫殑闛ꮞ鹫㮛鷻殖鵋䮖鸻뮖钫\u0b91阻箖鉛㮞鹛宜阻쮒髻箞霛뮝銛鮞鸋ᮞ醻殖鋛ஐ鑛箙頻க鲻ᮘ鏛㮓鎋鮑郋ᮞ龻뮒鐫ட餫宐阛䮙鶫\ueb96鵻㮖鸫ட鲫ꮖ陫鮗遛\u0b97飫箙醻宗鳫쮜靋䮕酛鮑黛ᮜ靋\ueb9d麫殑鷫㮓馻ꮛ錫㮗鎋ᮝ髛宜闻殘陋\udb92铫鮙鸋\ueb9d驛쮗飫讙邛\u2b96醻䮘陫㮛釛箛鍫宝鑛鮘騫箝鉋\udb94鯻讗騻䮚龋ஓ鲛ﮘ鷻宜騋ꮜ鳛쮚饻⮟鄋쮟鏛\ueb9b鍫讑鼫讙靋箓隋ஒ錻\udb93郻鮖駫鮔醻ﮔ鹻\udb99銛宖闋ﮓ銻뮐鉋讑駛ᮑ醋⮔鮻쮝鏫ꮕ鮻䮕鍫䮐鞛箐鑻쮞骻鮐颋\u0b9b龻ꮑ锻ꮕ魛箝鑋㮗黋䮒鳋ﮕ鏻\udb96麻㮓龻鮘鯻쮗釛뮟驛쮛鋛箝遻宛陻뮟黻鮟齫ꮝ闛ꮖ鋋\udb9f韋뮞閛뮞釋讝鲫뮒龛箚鍛ﮓ驻鮔铻\ueb94鰻쮕颋㮘铫-쨚\ueace쉺㫃쾊⫍콚竇쭺髎즚⫀쵺䫋옚\ueacc쓺竁잪醙쿪쫂쏚᫉쎪䫁츺\u0aca즚쫃슊\udac1쿊嫋줪뫎앚쫊콚ꫂ쓚䫀쁺\udace쨚";

      do {
         char var10000 = var7.charAt(var11);
         int var15 = 0;
         char var13 = var10000;
         char[] var14 = var7.substring(var11 + 1, var11 + 1 + var13).toCharArray();

         do {
            char var16 = var14[var15];
            if (var15 % 2 == 0) {
               var14[var15] = (char)((var16 >>> 4 | var16 << '\f') & 65535 ^ var12);
            } else {
               var14[var15] = (char)((var16 << 4 | var16 >>> '\f') & 65535 ^ var12);
            }
         } while (++var15 < var14.length);

         var9[var10] = new String(var14);
         var10++;
         var11 = var11 + var13 + 1;
      } while (var11 < var8);

      aabb = var9;
      abaa = new Object[var9.length];
      byte var20 = 0;
      int var10001 = 0;
      aaba = new int[290];
      byte[] var10002 = "ë^\u0011¼jxÌ®2\u0094ÞÜ/Ôr*k\"\u0093\u0019g¾¦¬¶G\u0011¦\u008f]ÔÆâ\u0005;OaKü:N{[d\u001f\u0086T\u009b×%å\u0086\u0094\u001d`\u001eã\u0015\u0013³\u0093\u0011àÇ±¥\u000b\u00151÷×\u0012\u00ad/<~ú´\u0019F1\u001bÊ\u0090\u0016\u0000ÝðÕå\u0095\u001a\u009d\u0090UÜðSw\u000f§ù#Õ:ùf-ÿ\"®sä!Þ}äíÿ¼]ÖùÂ,.4\u001eD9ì}mðtÞÛ±\u0093Èø¦]Uð®R2Á\u008c\n3 YÞV©\u0084bqBU á7Õ\u001ajÐ\u0002Êð!SÒºû\u000f¹\u0018\u000e`Ç®Üê¨ç&\u0090@¥?Î8\u008d¯\u0082\u0083¤ýYlª:\u0001\u0085\u0013Ñ\u0087\u0088û*ýÂ\u008e,\u0012<\u0004·3Ø1ùíõ\u0083y*\u0005ýq;üJ£9\u008bÃuªþÚa\u0017\u009bÕÌnMõ\u0003OÆl¨Z\u0087Ï\u001bÏ@\r\u0004=[ê8\u008c\u009fUm\u001bÙÛü\u0095ïK\u009c·Ø£cØÁÐ9\\¯XìIµ\u008c\u008fÐ¡\u0089ÞÕR\u00ad3\u0005Ïä»\u00879Úí\u0083<Rx\fÆø{Éw@6A;@Kq\u0014;:¥\u001f\u007f\u00adÝêÿ½\u001f\u0003\u00153Òô\u0098\u001fWO1£¿ä\u00987\u0084/å*$\u0091y\u008e4,ä Æ½ãÝ\u0099Y£:OÅ|ä\u0001\u0004ÞÐ\u0091W}\u001bù{\u0094\tæHz\u0097Aö\u0017¤vý\u0015Q÷ Õ4\u0084\u0095¦r8]Ýõ¢ýöè|8\u008f¾\\\\\u0088ä\u009a\u008aüb\u009d©\u00116|Ðr\u008aÓ\u0097\u0012y;|ÇqÓß\u0002.*\u001fäid»5c6\u0010ÿs\u0089b\r}\u0016®ÑCû\b\u0091\u0081ª\u009d*Ü\u009aåy\u008fY¾Nug\u0081±ô\u009f;W½cT\td\u001bK\u00076\tìP¬\u001fÜGõ0Ù´M\u0005²Z\u0090þûç\u008a\u0093K6\u009bMY\u0002\u007f\u009eª\"ñ_zdÙ¹l¥y,tÒ¡§/ÿ\u008cO¦\u0010©o\u0096\u001cõeÆ÷\u008c\u0007àùâÍòºª{·Hæ\u0018õ\u0005Ü\nH\u0098\n\fíÂ«\u009buØ¸LÝU* Þ\u0093:E\u008fã\u009bAäf~ZJ\roþ\u0093}ú\u00035Î£\u0014e¹\u0094\u0092¶S¼þRM!°\t\u0080'ZÚ9â·[Ø{ÂY\u0099»1\u00078¦\n:voE`\rW÷Äh\u0013\n®BÁ \u001aA\u0006c9û¡Ð^9è\u009dqB²\u009a\u0015,QEòÔÁ\u008cÛ$DßõµìËlwZÀÞ\u0094LÓè÷ç÷[xFl\u0099w¨Àx\u0087\u0005³³\u0006Ú@¾ðc\u000e\u0085¦V\u0097nØ\u0001\u0095>C5\u0081î}ÂL\u001dzô\u0013Ï·oí¥CÈh\u0010\u009cpÝ\r\u000eïxIL¯\u0089\u008avK\"R\u001eHÖÓþhå{»Ç+µD`\u009d½\u009a·)=Æ2ã'\t1\u0090²\"\u009f|Q\u001cvóÿ\u0091.¿$]ZëqXw \u008e\u0097C\u0011îüýEF®<(,4ü\u000bH\u009eþê çS=á`m¨Â\u009c\u0096UXOÛ£\u0090öÕe®à\u0088â\u0003\u0007½îÖ¬¦\u0001j§é\u0099\u009brmÿP[ã~Þ\nÎW\u0018k\u0002\fÔëÍÄIÇ\u0010ù\u00adînÈ_,\u0001y\u0095\u0086\u008f£±Sà\u009e\u0001\u001b]®ô\th\u0087\u0004!¥!@`§Ë®Þ\b\u008c\u0088kk\u0081í\u009f\u008f\u0010\u000f\u008b\u0097^á\u0088\u0013l-ÏÇÄ5(Òg\u008b\u0098`[ÄÖòÇ\u000fzv?\u0012öïÐRðºÔ×ÄáÑÊv\u001c\u0013i®\u0088ìT[1Îá\u0011¡sO$T\u001fE\u0086`ma\u0082!½þäPÂ\u0001\u0088\u007fµ\u0092îy\u0017¸J×ì¡*ø¬nC)\u00016ú<i\u0002â'\u0097\u009d¶]\u0084\u009d\fÏúÊEa\u0099\u008dË¶\u000b\u0087Qøº\n\u0017\u009b\u0094l\u0097w^>Cwÿ«\u001b\u008c(\tJÖK\u008fªBÁÂ4ûÇ>_B\rm\u007fE×Ú~ EáWà¿u\u0098S\b\u0090«È}¡/à(\u0018_\u008c\u0098\u0010jßpÝûmÊwuP\u000f\u0017ïR-ÐÐjSB\u0001¢\u0012i>Bô.\u0086"
         .getBytes("ISO-8859-1");

      int var55;
      do {
         aaba[var20] = (
               (var10002[var10001] & 255) << 24 | (var10002[var10001 + 1] & 255) << 16 | (var10002[var10001 + 2] & 255) << 8 | var10002[var10001 + 3] & 255
            )
            ^ -1600201771;
         var20 += 1;
         var55 = var10001 + 4;
         var10001 += 4;
      } while (var55 < var10002.length);

      String[] var5 = new String[a(-2057473564, var17 ^ -2001859116)];
      int var3 = 0;
      String var2;
      int var4 = (var2 = b((byte)-10, '袲', (byte)-14, (short)-19834, -1364303766)).length();
      int var1 = a(-2057473563, var17 ^ 159961309);
      int var19 = -1;

      label90:
      while (true) {
         String var21 = var2.substring(++var19, var19 + var1);
         var10001 = (byte)-1;

         while (true) {
            label85: {
               char[] var27 = var21.toCharArray();
               var55 = var27.length;
               int var6 = 0;
               var42 = var27;
               var10001 = var55;
               char[] var59;
               int var73;
               if (var55 <= 1) {
                  var59 = var27;
                  var73 = var6;
               } else {
                  var42 = var27;
                  var10001 = var55;
                  if (var55 <= var6) {
                     break label85;
                  }

                  var59 = var27;
                  var73 = var6;
               }

               while (true) {
                  var59[var73] = (char)(var59[var73] ^ switch (var6 % a(-2057473568, var17 ^ 148016984)) {
                     case 0 -> a(-2057473567, var17 ^ 72268472);
                     case 1 -> a(-2057473566, var17 ^ -709423701);
                     case 2 -> a(-2057473565, var17 ^ -324155261);
                     case 3 -> a(-2057473556, var17 ^ -2114639907);
                     case 4 -> a(-2057473555, var17 ^ 45867066);
                     case 5 -> a(-2057473554, var17 ^ 764102417);
                     default -> a(-2057473553, var17 ^ 2088126516);
                  });
                  var6++;
                  if (var10001 == 0) {
                     var73 = var10001;
                     var59 = var42;
                  } else {
                     if (var10001 <= var6) {
                        break;
                     }

                     var59 = var42;
                     var73 = var6;
                  }
               }
            }

            String var66 = new String(var42).intern();
            switch (var10001) {
               case 0:
                  var5[var3++] = var66;
                  if ((var19 += var1) >= var4) {
                     bbb = var5;
                     aab = new String[a(-2057473561, var17 ^ 1277455937)];
                     baa = new ababbbbaa[]{
                        aabbaaaba.aaab(aa(a(-2057473560, var17 ^ -1261088879), a(-2057473559, var17 ^ -135455191))),
                        aabbaaaba.aaab(aa(a(-2057473558, var17 ^ -2132428357), a(-2057473557, var17 ^ -253653409))),
                        aabbaaaba.aaab(aa(a(-2057473548, var17 ^ -766140158), a(-2057473547, var17 ^ 1376127370))),
                        aabbaaaba.aaab(aa(a(-2057473546, var17 ^ -824207754), a(-2057473545, var17 ^ -1723359861)))
                     };
                     return;
                  }

                  var1 = var2.charAt(var19);
                  break;
               default:
                  var5[var3++] = var66;
                  if ((var19 += var1) < var4) {
                     var1 = var2.charAt(var19);
                     continue label90;
                  }

                  var4 = (var2 = b((byte)-70, 'ค', 125, (short)-8525, -1364303765)).length();
                  var1 = a(-2057473562, var17 ^ 1365557932);
                  var19 = -1;
            }

            var21 = var2.substring(++var19, var19 + var1);
            var10001 = (byte)0;
         }
      }
   }

   private boolean aba(class_746 param1) {
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
      // 05: invokevirtual net/minecraft/class_746.method_6047 ()Lnet/minecraft/class_1799;
      // 08: invokevirtual net/minecraft/class_1799.method_7909 ()Lnet/minecraft/class_1792;
      // 0b: instanceof net/minecraft/class_1747
      // 0e: iload 2
      // 0f: ifne 33
      // 12: ifne 32
      // 15: goto 19
      // 18: athrow
      // 19: aload 1
      // 1a: invokevirtual net/minecraft/class_746.method_6079 ()Lnet/minecraft/class_1799;
      // 1d: invokevirtual net/minecraft/class_1799.method_7909 ()Lnet/minecraft/class_1792;
      // 20: instanceof net/minecraft/class_1747
      // 23: iload 2
      // 24: ifne 33
      // 27: goto 2b
      // 2a: athrow
      // 2b: ifeq 36
      // 2e: goto 32
      // 31: athrow
      // 32: bipush 1
      // 33: goto 37
      // 36: bipush 0
      // 37: ireturn
   }

   public boolean abb(class_310 param1) {
      // $VF: Couldn't be decompiled
      // Please report this to the Vineflower issue tracker, at https://github.com/Vineflower/vineflower/issues with a copy of the class file (if you have the rights to distribute it!)
      // java.lang.RuntimeException: parsing failure!
      //   at org.jetbrains.java.decompiler.modules.decompiler.decompose.DomHelper.parseGraph(DomHelper.java:211)
      //   at org.jetbrains.java.decompiler.main.rels.MethodProcessor.codeToJava(MethodProcessor.java:166)
      //
      // Bytecode:
      // 000: getstatic qeaa361f143ee4a0894bd168fd9b30c66/qf4ccf8f5435d4a78bdca4d6a018b578e/baaabbaa.bba I
      // 003: aload 0
      // 004: bipush 0
      // 005: putfield qeaa361f143ee4a0894bd168fd9b30c66/qf4ccf8f5435d4a78bdca4d6a018b578e/aababbbba.bb Z
      // 008: istore 2
      // 009: aload 0
      // 00a: iload 2
      // 00b: ifne 078
      // 00e: invokevirtual qeaa361f143ee4a0894bd168fd9b30c66/qf4ccf8f5435d4a78bdca4d6a018b578e/aababbbba.babbaab ()Z
      // 011: ifeq 073
      // 014: goto 018
      // 017: athrow
      // 018: aload 1
      // 019: iload 2
      // 01a: ifne 029
      // 01d: goto 021
      // 020: athrow
      // 021: ifnull 073
      // 024: goto 028
      // 027: athrow
      // 028: aload 1
      // 029: iload 2
      // 02a: ifne 03c
      // 02d: getfield net/minecraft/class_310.field_1724 Lnet/minecraft/class_746;
      // 030: ifnull 073
      // 033: goto 037
      // 036: athrow
      // 037: aload 1
      // 038: goto 03c
      // 03b: athrow
      // 03c: iload 2
      // 03d: ifne 04f
      // 040: getfield net/minecraft/class_310.field_1687 Lnet/minecraft/class_638;
      // 043: ifnull 073
      // 046: goto 04a
      // 049: athrow
      // 04a: aload 1
      // 04b: goto 04f
      // 04e: athrow
      // 04f: iload 2
      // 050: ifne 062
      // 053: getfield net/minecraft/class_310.field_1690 Lnet/minecraft/class_315;
      // 056: ifnull 073
      // 059: goto 05d
      // 05c: athrow
      // 05d: aload 1
      // 05e: goto 062
      // 061: athrow
      // 062: iload 2
      // 063: ifne 07e
      // 066: getfield net/minecraft/class_310.field_1724 Lnet/minecraft/class_746;
      // 069: invokevirtual net/minecraft/class_746.method_5805 ()Z
      // 06c: ifne 07d
      // 06f: goto 073
      // 072: athrow
      // 073: aload 0
      // 074: goto 078
      // 077: athrow
      // 078: invokevirtual qeaa361f143ee4a0894bd168fd9b30c66/qf4ccf8f5435d4a78bdca4d6a018b578e/aababbbba.aab ()V
      // 07b: bipush 0
      // 07c: ireturn
      // 07d: aload 1
      // 07e: getfield net/minecraft/class_310.field_1724 Lnet/minecraft/class_746;
      // 081: astore 3
      // 082: aload 0
      // 083: iload 2
      // 084: ifne 099
      // 087: getfield qeaa361f143ee4a0894bd168fd9b30c66/qf4ccf8f5435d4a78bdca4d6a018b578e/aababbbba.ba Lqeaa361f143ee4a0894bd168fd9b30c66/qf4ccf8f5435d4a78bdca4d6a018b578e/aaaaa;
      // 08a: invokevirtual qeaa361f143ee4a0894bd168fd9b30c66/qf4ccf8f5435d4a78bdca4d6a018b578e/aaaaa.b ()Z
      // 08d: ifeq 0b8
      // 090: goto 094
      // 093: athrow
      // 094: aload 0
      // 095: goto 099
      // 098: athrow
      // 099: iload 2
      // 09a: ifne 0b2
      // 09d: aload 3
      // 09e: invokevirtual qeaa361f143ee4a0894bd168fd9b30c66/qf4ccf8f5435d4a78bdca4d6a018b578e/aababbbba.aba (Lnet/minecraft/class_746;)Z
      // 0a1: ifne 0b8
      // 0a4: goto 0a8
      // 0a7: athrow
      // 0a8: aload 0
      // 0a9: bipush 0
      // 0aa: putfield qeaa361f143ee4a0894bd168fd9b30c66/qf4ccf8f5435d4a78bdca4d6a018b578e/aababbbba.aa Z
      // 0ad: aload 0
      // 0ae: goto 0b2
      // 0b1: athrow
      // 0b2: bipush 0
      // 0b3: putfield qeaa361f143ee4a0894bd168fd9b30c66/qf4ccf8f5435d4a78bdca4d6a018b578e/aababbbba.aaa I
      // 0b6: bipush 0
      // 0b7: ireturn
      // 0b8: aload 3
      // 0b9: invokevirtual net/minecraft/class_746.method_23317 ()D
      // 0bc: aload 3
      // 0bd: invokevirtual net/minecraft/class_746.method_23318 ()D
      // 0c0: dconst_1
      // 0c1: dsub
      // 0c2: aload 3
      // 0c3: invokevirtual net/minecraft/class_746.method_23321 ()D
      // 0c6: invokestatic net/minecraft/class_2338.method_49637 (DDD)Lnet/minecraft/class_2338;
      // 0c9: astore 4
      // 0cb: aload 0
      // 0cc: getfield qeaa361f143ee4a0894bd168fd9b30c66/qf4ccf8f5435d4a78bdca4d6a018b578e/aababbbba.aba Lqeaa361f143ee4a0894bd168fd9b30c66/qf4ccf8f5435d4a78bdca4d6a018b578e/aaaaa;
      // 0cf: invokevirtual qeaa361f143ee4a0894bd168fd9b30c66/qf4ccf8f5435d4a78bdca4d6a018b578e/aaaaa.b ()Z
      // 0d2: iload 2
      // 0d3: ifne 0e5
      // 0d6: ifeq 0f4
      // 0d9: goto 0dd
      // 0dc: athrow
      // 0dd: aload 3
      // 0de: invokevirtual net/minecraft/class_746.method_24828 ()Z
      // 0e1: goto 0e5
      // 0e4: athrow
      // 0e5: iload 2
      // 0e6: ifne 0f1
      // 0e9: ifne 0f4
      // 0ec: goto 0f0
      // 0ef: athrow
      // 0f0: bipush 1
      // 0f1: goto 0f5
      // 0f4: bipush 0
      // 0f5: istore 5
      // 0f7: aload 0
      // 0f8: getfield qeaa361f143ee4a0894bd168fd9b30c66/qf4ccf8f5435d4a78bdca4d6a018b578e/aababbbba.bab Lqeaa361f143ee4a0894bd168fd9b30c66/qf4ccf8f5435d4a78bdca4d6a018b578e/aaaaa;
      // 0fb: invokevirtual qeaa361f143ee4a0894bd168fd9b30c66/qf4ccf8f5435d4a78bdca4d6a018b578e/aaaaa.b ()Z
      // 0fe: iload 2
      // 0ff: ifne 117
      // 102: ifeq 126
      // 105: goto 109
      // 108: athrow
      // 109: aload 1
      // 10a: getfield net/minecraft/class_310.field_1690 Lnet/minecraft/class_315;
      // 10d: getfield net/minecraft/class_315.field_1894 Lnet/minecraft/class_304;
      // 110: invokevirtual net/minecraft/class_304.method_1434 ()Z
      // 113: goto 117
      // 116: athrow
      // 117: iload 2
      // 118: ifne 123
      // 11b: ifeq 126
      // 11e: goto 122
      // 121: athrow
      // 122: bipush 1
      // 123: goto 127
      // 126: bipush 0
      // 127: istore 6
      // 129: aload 0
      // 12a: iload 5
      // 12c: iload 2
      // 12d: ifne 139
      // 130: ifne 163
      // 133: goto 137
      // 136: athrow
      // 137: iload 6
      // 139: iload 2
      // 13a: ifne 154
      // 13d: ifne 163
      // 140: goto 144
      // 143: athrow
      // 144: aload 1
      // 145: getfield net/minecraft/class_310.field_1687 Lnet/minecraft/class_638;
      // 148: aload 4
      // 14a: invokevirtual net/minecraft/class_638.method_8320 (Lnet/minecraft/class_2338;)Lnet/minecraft/class_2680;
      // 14d: invokestatic qeaa361f143ee4a0894bd168fd9b30c66/qf4ccf8f5435d4a78bdca4d6a018b578e/aabbabbbb.ababaa (Lnet/minecraft/class_2680;)Z
      // 150: goto 154
      // 153: athrow
      // 154: iload 2
      // 155: ifne 160
      // 158: ifeq 163
      // 15b: goto 15f
      // 15e: athrow
      // 15f: bipush 1
      // 160: goto 164
      // 163: bipush 0
      // 164: putfield qeaa361f143ee4a0894bd168fd9b30c66/qf4ccf8f5435d4a78bdca4d6a018b578e/aababbbba.aa Z
      // 167: aload 0
      // 168: iload 2
      // 169: ifne 195
      // 16c: getfield qeaa361f143ee4a0894bd168fd9b30c66/qf4ccf8f5435d4a78bdca4d6a018b578e/aababbbba.aa Z
      // 16f: ifeq 190
      // 172: goto 176
      // 175: athrow
      // 176: aload 0
      // 177: aload 0
      // 178: invokevirtual qeaa361f143ee4a0894bd168fd9b30c66/qf4ccf8f5435d4a78bdca4d6a018b578e/aababbbba.ab ()I
      // 17b: putfield qeaa361f143ee4a0894bd168fd9b30c66/qf4ccf8f5435d4a78bdca4d6a018b578e/aababbbba.ab I
      // 17e: iload 2
      // 17f: aload 0
      // 180: dup
      // 181: getfield qeaa361f143ee4a0894bd168fd9b30c66/qf4ccf8f5435d4a78bdca4d6a018b578e/aababbbba.aaa I
      // 184: bipush 1
      // 185: iadd
      // 186: putfield qeaa361f143ee4a0894bd168fd9b30c66/qf4ccf8f5435d4a78bdca4d6a018b578e/aababbbba.aaa I
      // 189: ifeq 199
      // 18c: goto 190
      // 18f: athrow
      // 190: aload 0
      // 191: goto 195
      // 194: athrow
      // 195: bipush 0
      // 196: putfield qeaa361f143ee4a0894bd168fd9b30c66/qf4ccf8f5435d4a78bdca4d6a018b578e/aababbbba.aaa I
      // 199: aload 1
      // 19a: aload 1
      // 19b: getfield net/minecraft/class_310.field_1690 Lnet/minecraft/class_315;
      // 19e: getfield net/minecraft/class_315.field_1832 Lnet/minecraft/class_304;
      // 1a1: invokestatic qeaa361f143ee4a0894bd168fd9b30c66/qf4ccf8f5435d4a78bdca4d6a018b578e/aabbabbbb.aaab (Lnet/minecraft/class_310;Lnet/minecraft/class_304;)Z
      // 1a4: istore 7
      // 1a6: aload 0
      // 1a7: getfield qeaa361f143ee4a0894bd168fd9b30c66/qf4ccf8f5435d4a78bdca4d6a018b578e/aababbbba.ab I
      // 1aa: iload 2
      // 1ab: ifne 1b7
      // 1ae: ifle 1dc
      // 1b1: goto 1b5
      // 1b4: athrow
      // 1b5: iload 7
      // 1b7: iload 2
      // 1b8: ifne 1d9
      // 1bb: ifne 1d8
      // 1be: goto 1c2
      // 1c1: athrow
      // 1c2: aload 0
      // 1c3: getfield qeaa361f143ee4a0894bd168fd9b30c66/qf4ccf8f5435d4a78bdca4d6a018b578e/aababbbba.aaaa Lqeaa361f143ee4a0894bd168fd9b30c66/qf4ccf8f5435d4a78bdca4d6a018b578e/aaaaa;
      // 1c6: invokevirtual qeaa361f143ee4a0894bd168fd9b30c66/qf4ccf8f5435d4a78bdca4d6a018b578e/aaaaa.b ()Z
      // 1c9: iload 2
      // 1ca: ifne 1d9
      // 1cd: goto 1d1
      // 1d0: athrow
      // 1d1: ifne 1dc
      // 1d4: goto 1d8
      // 1d7: athrow
      // 1d8: bipush 1
      // 1d9: goto 1dd
      // 1dc: bipush 0
      // 1dd: istore 8
      // 1df: aload 0
      // 1e0: dup
      // 1e1: getfield qeaa361f143ee4a0894bd168fd9b30c66/qf4ccf8f5435d4a78bdca4d6a018b578e/aababbbba.ab I
      // 1e4: bipush 1
      // 1e5: isub
      // 1e6: putfield qeaa361f143ee4a0894bd168fd9b30c66/qf4ccf8f5435d4a78bdca4d6a018b578e/aababbbba.ab I
      // 1e9: aload 0
      // 1ea: aload 0
      // 1eb: iload 2
      // 1ec: ifne 1fe
      // 1ef: getfield qeaa361f143ee4a0894bd168fd9b30c66/qf4ccf8f5435d4a78bdca4d6a018b578e/aababbbba.ab I
      // 1f2: ifle 215
      // 1f5: goto 1f9
      // 1f8: athrow
      // 1f9: aload 0
      // 1fa: goto 1fe
      // 1fd: athrow
      // 1fe: getfield qeaa361f143ee4a0894bd168fd9b30c66/qf4ccf8f5435d4a78bdca4d6a018b578e/aababbbba.aaa I
      // 201: iload 2
      // 202: ifne 212
      // 205: bipush 2
      // 206: if_icmpgt 215
      // 209: goto 20d
      // 20c: athrow
      // 20d: bipush 1
      // 20e: goto 212
      // 211: athrow
      // 212: goto 216
      // 215: bipush 0
      // 216: putfield qeaa361f143ee4a0894bd168fd9b30c66/qf4ccf8f5435d4a78bdca4d6a018b578e/aababbbba.bb Z
      // 219: iload 8
      // 21b: ireturn
   }
}
