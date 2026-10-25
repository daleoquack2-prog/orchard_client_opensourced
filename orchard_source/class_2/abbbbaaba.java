package nsc;

import net.fabricmc.api.EnvType;
import net.fabricmc.api.Environment;

@Environment(EnvType.CLIENT)
public final class abbbbaaba extends abbaabbaa {
   private static final Integer[] aa;
   private static final String[] ab;
   private static final int[] abb;
   private static final Long[] ba;
   private static final long[] bb;
   private static final long[] aaa;
   private static final String[] baa;
   private static String[] aab;
   private static final Object[] bab;
   private static final String[] aba;

   private static String aa(char[] var0, long var1, int var3) {
      int var4 = a(bb(-1561214616, -1140179768 ^ 1876305644), 2089218427362779555L) ^ var3;

      for (int var5 = 0; var5 < var0.length; var5++) {
         int var7 = var4 ^ (int)var1 ^ ~var5;
         int var8 = var7 ^ var3 - var5 * var0.length;
         var4 = -var8 * var3 | var5;
         var0[var5] = (char)(var0[var5] ^ var4);
         int var6 = var5 & a(bb(-1561214615, -1140179768 ^ 750233108), 6874835527774283554L);
         var3 = var3 << var6 | var3 >>> -var6;
         var1 ^= var6;
      }

      return new String(var0);
   }

   private static void ab() {
      int var0 = 633810895;
      aab[0] = aa(
         ba(bb(-1561214614, var0 ^ -1159583262), bb(-1561214613, var0 ^ 1775840447)).toCharArray(),
         b(bb(-1561214612, var0 ^ 1299418573), 2152065356945829714L),
         a(bb(-1561214611, var0 ^ 2047103866), 827216008966304455L)
      );
      aab[1] = aa(
         ba(bb(-1561214610, var0 ^ 1002196794), bb(-1561214609, var0 ^ -1804869424)).toCharArray(),
         b(bb(-1561214624, var0 ^ -995593741), 3455463856271742361L),
         a(bb(-1561214623, var0 ^ 1714159517), 5930091936863765242L)
      );
   }

   private static String aaa(int var0, char var1, char var2) {
      int var3 = var2 ^ 1005;
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
      int var8 = (var7.getClassName().hashCode() ^ var7.getMethodName().hashCode()) >> 16 ^ 5795;
      int var9 = 0;

      do {
         int var10 = var4[var9] + 21246;
         var10 += 4155;
         var10 -= 63144;
         var10 -= 47198;
         var10 -= 8538;
         var10 ^= 55972;
         var4[var9] = (char)(var10 ^ var8 ^ var1 ^ var0 >> 16);
      } while (++var9 < var4.length);

      return new String(var4).intern();
   }

   private static String ba(int var0, int var1) {
      int var9 = 1404251373;
      int var2 = (var0 ^ bb(-1561214622, var9 ^ 1172240755)) & bb(-1561214621, var9 ^ 1487395622);
      if (aba[var2] == null) {
         char[] var3 = ab[var2].toCharArray();

         int var4 = switch (var3[0] & bb(-1561214620, var9 ^ 1957461980)) {
            case 0 -> bb(-1561214619, var9 ^ 2020584300);
            case 1 -> bb(-1561214618, var9 ^ -118433907);
            case 2 -> bb(-1561214617, var9 ^ 1140755275);
            case 3 -> bb(-1561214600, var9 ^ 1622838021);
            case 4 -> bb(-1561214599, var9 ^ 265856037);
            case 5 -> bb(-1561214598, var9 ^ 854461134);
            case 6 -> bb(-1561214597, var9 ^ 315863374);
            case 7 -> bb(-1561214596, var9 ^ -547607633);
            case 8 -> bb(-1561214595, var9 ^ -655950559);
            case 9 -> bb(-1561214594, var9 ^ -860699333);
            case 10 -> bb(-1561214593, var9 ^ -1157889163);
            case 11 -> bb(-1561214608, var9 ^ 799359290);
            case 12 -> bb(-1561214607, var9 ^ -1071526858);
            case 13 -> bb(-1561214606, var9 ^ 2084791062);
            case 14 -> bb(-1561214605, var9 ^ 2066014870);
            case 15 -> bb(-1561214604, var9 ^ -515854773);
            case 16 -> bb(-1561214603, var9 ^ -175191946);
            case 17 -> bb(-1561214602, var9 ^ 2011117436);
            case 18 -> bb(-1561214601, var9 ^ -358116981);
            case 19 -> bb(-1561214648, var9 ^ -619510210);
            case 20 -> bb(-1561214647, var9 ^ -2106847004);
            case 21 -> bb(-1561214646, var9 ^ -982834995);
            case 22 -> bb(-1561214645, var9 ^ -1439453036);
            case 23 -> bb(-1561214644, var9 ^ -71603563);
            case 24 -> bb(-1561214643, var9 ^ 1824067621);
            case 25 -> bb(-1561214642, var9 ^ -2080229661);
            case 26 -> bb(-1561214641, var9 ^ 430180404);
            case 27 -> bb(-1561214656, var9 ^ 872485139);
            case 28 -> bb(-1561214655, var9 ^ -1934130106);
            case 29 -> bb(-1561214654, var9 ^ -116283611);
            case 30 -> bb(-1561214653, var9 ^ -1515882620);
            case 31 -> bb(-1561214652, var9 ^ 2005406629);
            case 32 -> bb(-1561214651, var9 ^ 1981201607);
            case 33 -> bb(-1561214650, var9 ^ -789230552);
            case 34 -> bb(-1561214649, var9 ^ -1231378605);
            case 35 -> bb(-1561214632, var9 ^ -727046215);
            case 36 -> bb(-1561214631, var9 ^ -750921299);
            case 37 -> bb(-1561214630, var9 ^ 492635846);
            case 38 -> bb(-1561214629, var9 ^ -1446295617);
            case 39 -> bb(-1561214628, var9 ^ 1419072200);
            case 40 -> bb(-1561214627, var9 ^ 1688979408);
            case 41 -> bb(-1561214626, var9 ^ 1009858239);
            case 42 -> bb(-1561214625, var9 ^ 1525193769);
            case 43 -> bb(-1561214640, var9 ^ -1876486883);
            case 44 -> bb(-1561214639, var9 ^ -794677647);
            case 45 -> bb(-1561214638, var9 ^ 1623821153);
            case 46 -> bb(-1561214637, var9 ^ 174128346);
            case 47 -> bb(-1561214636, var9 ^ 651296225);
            case 48 -> bb(-1561214635, var9 ^ -1572395667);
            case 49 -> bb(-1561214634, var9 ^ -557361505);
            case 50 -> bb(-1561214633, var9 ^ 1372808278);
            case 51 -> bb(-1561214680, var9 ^ -1548446643);
            case 52 -> bb(-1561214679, var9 ^ 1737620819);
            case 53 -> bb(-1561214678, var9 ^ 2079422597);
            case 54 -> bb(-1561214677, var9 ^ -184375228);
            case 55 -> bb(-1561214676, var9 ^ -172547669);
            case 56 -> bb(-1561214675, var9 ^ -1550346548);
            case 57 -> bb(-1561214674, var9 ^ 1596246460);
            case 58 -> bb(-1561214673, var9 ^ 373560837);
            case 59 -> bb(-1561214688, var9 ^ 485971636);
            case 60 -> bb(-1561214687, var9 ^ -2077636138);
            case 61 -> bb(-1561214686, var9 ^ -1195731092);
            case 62 -> bb(-1561214685, var9 ^ 2067130647);
            case 63 -> bb(-1561214684, var9 ^ -1434927530);
            case 64 -> bb(-1561214683, var9 ^ 771029560);
            case 65 -> bb(-1561214682, var9 ^ 1987851393);
            case 66 -> bb(-1561214681, var9 ^ 1728027786);
            case 67 -> bb(-1561214664, var9 ^ -179021673);
            case 68 -> bb(-1561214663, var9 ^ 1344614637);
            case 69 -> 1;
            case 70 -> bb(-1561214662, var9 ^ -1773379297);
            case 71 -> bb(-1561214661, var9 ^ -813582622);
            case 72 -> bb(-1561214660, var9 ^ 1365988125);
            case 73 -> bb(-1561214659, var9 ^ 306566725);
            case 74 -> bb(-1561214658, var9 ^ -1030346332);
            case 75 -> bb(-1561214657, var9 ^ -2125245488);
            case 76 -> bb(-1561214672, var9 ^ -1576815080);
            case 77 -> bb(-1561214671, var9 ^ -1995874963);
            case 78 -> bb(-1561214670, var9 ^ -1342606301);
            case 79 -> bb(-1561214669, var9 ^ -1485304433);
            case 80 -> bb(-1561214668, var9 ^ 912849159);
            case 81 -> bb(-1561214667, var9 ^ -1326751619);
            case 82 -> bb(-1561214666, var9 ^ -1227891764);
            case 83 -> bb(-1561214665, var9 ^ -945961049);
            case 84 -> bb(-1561214712, var9 ^ 1109483125);
            case 85 -> bb(-1561214711, var9 ^ 617323162);
            case 86 -> bb(-1561214710, var9 ^ 471039058);
            case 87 -> bb(-1561214709, var9 ^ 221995265);
            case 88 -> bb(-1561214708, var9 ^ -254196690);
            case 89 -> 5;
            case 90 -> bb(-1561214707, var9 ^ 1150201941);
            case 91 -> bb(-1561214706, var9 ^ -1615527159);
            case 92 -> bb(-1561214705, var9 ^ -1751757394);
            case 93 -> bb(-1561214720, var9 ^ 1952135756);
            case 94 -> bb(-1561214719, var9 ^ -305812278);
            case 95 -> bb(-1561214718, var9 ^ -272369098);
            case 96 -> bb(-1561214717, var9 ^ 1294504244);
            case 97 -> bb(-1561214716, var9 ^ 1643586510);
            case 98 -> bb(-1561214715, var9 ^ -1166696702);
            case 99 -> bb(-1561214714, var9 ^ 1657043144);
            case 100 -> bb(-1561214713, var9 ^ -566613423);
            case 101 -> bb(-1561214696, var9 ^ -1303252762);
            case 102 -> bb(-1561214695, var9 ^ -776559168);
            case 103 -> bb(-1561214694, var9 ^ -1010354010);
            case 104 -> bb(-1561214693, var9 ^ 990992051);
            case 105 -> bb(-1561214692, var9 ^ -119608446);
            case 106 -> bb(-1561214691, var9 ^ 60562920);
            case 107 -> bb(-1561214690, var9 ^ -1030054164);
            case 108 -> bb(-1561214689, var9 ^ -664928063);
            case 109 -> bb(-1561214704, var9 ^ -626276773);
            case 110 -> bb(-1561214703, var9 ^ -1653384261);
            case 111 -> bb(-1561214702, var9 ^ 1419321526);
            case 112 -> bb(-1561214701, var9 ^ 444325064);
            case 113 -> bb(-1561214700, var9 ^ -81506317);
            case 114 -> bb(-1561214699, var9 ^ 253808214);
            case 115 -> bb(-1561214698, var9 ^ -1207779474);
            case 116 -> bb(-1561214697, var9 ^ 1768373506);
            case 117 -> bb(-1561214488, var9 ^ 467164605);
            case 118 -> bb(-1561214487, var9 ^ 1118437662);
            case 119 -> bb(-1561214486, var9 ^ 909264202);
            case 120 -> bb(-1561214485, var9 ^ -1624207134);
            case 121 -> bb(-1561214484, var9 ^ 1762053733);
            case 122 -> bb(-1561214483, var9 ^ 936964731);
            case 123 -> bb(-1561214482, var9 ^ -1587948186);
            case 124 -> bb(-1561214481, var9 ^ -1792883388);
            case 125 -> bb(-1561214496, var9 ^ 1908988591);
            case 126 -> bb(-1561214495, var9 ^ -1357533214);
            case 127 -> bb(-1561214494, var9 ^ -1879028765);
            case 128 -> bb(-1561214493, var9 ^ -555195871);
            case 129 -> bb(-1561214492, var9 ^ -1346453730);
            case 130 -> bb(-1561214491, var9 ^ 757532007);
            case 131 -> bb(-1561214490, var9 ^ 1878902966);
            case 132 -> bb(-1561214489, var9 ^ 1552797331);
            case 133 -> bb(-1561214472, var9 ^ -461954824);
            case 134 -> bb(-1561214471, var9 ^ 1244637047);
            case 135 -> bb(-1561214470, var9 ^ 1175589908);
            case 136 -> bb(-1561214469, var9 ^ -1314772694);
            case 137 -> bb(-1561214468, var9 ^ 1265078861);
            case 138 -> bb(-1561214467, var9 ^ -550234036);
            case 139 -> bb(-1561214466, var9 ^ 1329311580);
            case 140 -> bb(-1561214465, var9 ^ -1005188035);
            case 141 -> bb(-1561214480, var9 ^ 2089699402);
            case 142 -> bb(-1561214479, var9 ^ 614662660);
            case 143 -> bb(-1561214478, var9 ^ 59214229);
            case 144 -> bb(-1561214477, var9 ^ 1085039922);
            case 145 -> bb(-1561214476, var9 ^ 674857029);
            case 146 -> bb(-1561214475, var9 ^ 185511365);
            case 147 -> bb(-1561214474, var9 ^ 1351687750);
            case 148 -> bb(-1561214473, var9 ^ 220906961);
            case 149 -> bb(-1561214520, var9 ^ 346615743);
            case 150 -> bb(-1561214519, var9 ^ 1837212812);
            case 151 -> bb(-1561214518, var9 ^ 1327851873);
            case 152 -> bb(-1561214517, var9 ^ 2054817583);
            case 153 -> bb(-1561214516, var9 ^ 1629075708);
            case 154 -> bb(-1561214515, var9 ^ -2126364765);
            case 155 -> bb(-1561214514, var9 ^ -829700317);
            case 156 -> bb(-1561214513, var9 ^ 328306760);
            case 157 -> bb(-1561214528, var9 ^ 92608952);
            case 158 -> bb(-1561214527, var9 ^ 1763704653);
            case 159 -> bb(-1561214526, var9 ^ -1347504711);
            case 160 -> bb(-1561214525, var9 ^ 903410077);
            case 161 -> bb(-1561214524, var9 ^ -1150769483);
            case 162 -> bb(-1561214523, var9 ^ 1070115117);
            case 163 -> bb(-1561214522, var9 ^ -1526098362);
            case 164 -> bb(-1561214521, var9 ^ -558139087);
            case 165 -> bb(-1561214504, var9 ^ -911345542);
            case 166 -> bb(-1561214503, var9 ^ 1783957098);
            case 167 -> bb(-1561214502, var9 ^ 805145584);
            case 168 -> bb(-1561214501, var9 ^ -2023280918);
            case 169 -> bb(-1561214500, var9 ^ 89250710);
            case 170 -> bb(-1561214499, var9 ^ -1677160468);
            case 171 -> bb(-1561214498, var9 ^ 1320618838);
            case 172 -> bb(-1561214497, var9 ^ -437940304);
            case 173 -> bb(-1561214512, var9 ^ -155424510);
            case 174 -> bb(-1561214511, var9 ^ -51275375);
            case 175 -> bb(-1561214510, var9 ^ 330224394);
            case 176 -> bb(-1561214509, var9 ^ 1308650362);
            case 177 -> bb(-1561214508, var9 ^ -1874144269);
            case 178 -> bb(-1561214507, var9 ^ -1392759568);
            case 179 -> bb(-1561214506, var9 ^ -1153197405);
            case 180 -> bb(-1561214505, var9 ^ -186438731);
            case 181 -> bb(-1561214552, var9 ^ 1407531349);
            case 182 -> bb(-1561214551, var9 ^ -1584924163);
            case 183 -> bb(-1561214550, var9 ^ 1346548191);
            case 184 -> bb(-1561214549, var9 ^ 1847264155);
            case 185 -> bb(-1561214548, var9 ^ -502427844);
            case 186 -> bb(-1561214547, var9 ^ 966416176);
            case 187 -> bb(-1561214546, var9 ^ -1263768345);
            case 188 -> bb(-1561214545, var9 ^ 112672706);
            case 189 -> bb(-1561214560, var9 ^ 585490791);
            case 190 -> bb(-1561214559, var9 ^ 2056415677);
            case 191 -> bb(-1561214558, var9 ^ -1093311543);
            case 192 -> bb(-1561214557, var9 ^ 1157269199);
            case 193 -> bb(-1561214556, var9 ^ -287486498);
            case 194 -> bb(-1561214555, var9 ^ -1249692945);
            case 195 -> bb(-1561214554, var9 ^ 1828763117);
            case 196 -> bb(-1561214553, var9 ^ 1487904544);
            case 197 -> bb(-1561214536, var9 ^ 499925623);
            case 198 -> bb(-1561214535, var9 ^ -719075766);
            case 199 -> bb(-1561214534, var9 ^ 193910651);
            case 200 -> bb(-1561214533, var9 ^ -1244930473);
            case 201 -> bb(-1561214532, var9 ^ -1178609256);
            case 202 -> bb(-1561214531, var9 ^ 236901792);
            case 203 -> bb(-1561214530, var9 ^ 552647507);
            case 204 -> bb(-1561214529, var9 ^ -1438922145);
            case 205 -> bb(-1561214544, var9 ^ 145728622);
            case 206 -> bb(-1561214543, var9 ^ -1088346601);
            case 207 -> 2;
            case 208 -> bb(-1561214542, var9 ^ 561301017);
            case 209 -> bb(-1561214541, var9 ^ -1979512602);
            case 210 -> bb(-1561214540, var9 ^ -148404480);
            case 211 -> bb(-1561214539, var9 ^ 823721253);
            case 212 -> bb(-1561214538, var9 ^ 180362911);
            case 213 -> bb(-1561214537, var9 ^ 793420137);
            case 214 -> bb(-1561214584, var9 ^ -968500406);
            case 215 -> bb(-1561214583, var9 ^ 257143879);
            case 216 -> 0;
            case 217 -> bb(-1561214582, var9 ^ 1639773665);
            case 218 -> bb(-1561214581, var9 ^ -724229089);
            case 219 -> bb(-1561214580, var9 ^ 1710070885);
            case 220 -> 3;
            case 221 -> bb(-1561214579, var9 ^ 953505434);
            case 222 -> bb(-1561214578, var9 ^ 2064761823);
            case 223 -> bb(-1561214577, var9 ^ -346409882);
            case 224 -> bb(-1561214592, var9 ^ 1665636410);
            case 225 -> bb(-1561214591, var9 ^ -2055145917);
            case 226 -> 4;
            case 227 -> bb(-1561214590, var9 ^ -161878273);
            case 228 -> bb(-1561214589, var9 ^ -1986247268);
            case 229 -> bb(-1561214588, var9 ^ 1060787473);
            case 230 -> bb(-1561214587, var9 ^ -963415169);
            case 231 -> bb(-1561214586, var9 ^ 628273171);
            case 232 -> bb(-1561214585, var9 ^ 1342690215);
            case 233 -> bb(-1561214568, var9 ^ 291374916);
            case 234 -> bb(-1561214567, var9 ^ -1991314021);
            case 235 -> bb(-1561214566, var9 ^ -61528114);
            case 236 -> bb(-1561214565, var9 ^ 40553673);
            case 237 -> bb(-1561214564, var9 ^ -1779103108);
            case 238 -> bb(-1561214563, var9 ^ -1277555507);
            case 239 -> bb(-1561214562, var9 ^ -1880241023);
            case 240 -> bb(-1561214561, var9 ^ -1273065582);
            case 241 -> bb(-1561214576, var9 ^ 512230133);
            case 242 -> bb(-1561214575, var9 ^ 1475491568);
            case 243 -> bb(-1561214574, var9 ^ 1569504161);
            case 244 -> bb(-1561214573, var9 ^ 244438634);
            case 245 -> bb(-1561214572, var9 ^ -1241673548);
            case 246 -> bb(-1561214571, var9 ^ 1046452452);
            case 247 -> bb(-1561214570, var9 ^ 1170233824);
            case 248 -> bb(-1561214569, var9 ^ 1641909877);
            case 249 -> bb(-1561214872, var9 ^ -623347865);
            case 250 -> bb(-1561214871, var9 ^ -46974745);
            case 251 -> bb(-1561214870, var9 ^ 65341807);
            case 252 -> bb(-1561214869, var9 ^ 1404699271);
            case 253 -> bb(-1561214868, var9 ^ 1747768116);
            case 254 -> bb(-1561214867, var9 ^ -653960851);
            default -> bb(-1561214866, var9 ^ -254321269);
         };
         int var5 = (var1 & bb(-1561214865, var9 ^ -1886396425)) - var4;
         if (var5 < 0) {
            var5 += 256;
         }

         int var6 = ((var1 & bb(-1561214880, var9 ^ 1916705674)) >>> bb(-1561214879, var9 ^ 275050800)) - var4;
         if (var6 < 0) {
            var6 += 256;
         }

         for (int var7 = 0; var7 < var3.length; var7++) {
            int var8 = var7 % 2;
            char var10002 = var3[var7];
            if (var8 == 0) {
               var3[var7] = (char)(var10002 ^ var5);
               var5 = ((var5 >>> 3 | var5 << 5) ^ var3[var7]) & bb(-1561214878, var9 ^ -1627961533);
            } else {
               var3[var7] = (char)(var10002 ^ var6);
               var6 = ((var6 >>> 3 | var6 << 5) ^ var3[var7]) & bb(-1561214877, var9 ^ -1027249547);
            }
         }

         aba[var2] = new String(var3).intern();
      }

      return aba[var2];
   }

   private static int a(int var0, long var1) {
      int var3 = var0 ^ (int)(var1 & 32767L) ^ bb(-1561214888, -708089277 ^ -1352283368);
      if (aa[var3] == null) {
         aa[var3] = (int)(aaa[var3] ^ var1);
      }

      return aa[var3];
   }

   private static int bb(int var0, int var1) {
      int var2 = abb[var0 ^ -1561214616] ^ var1 ^ var0;
      var2 += 21243;
      var2 += 31944;
      var2 -= 38021;
      var2 -= 53309;
      var2 ^= 28148;
      var2 += 27444;
      return var2 + 23489;
   }

   // $VF: Irreducible bytecode was duplicated to produce valid code
   static {
      int var33 = -119889660;
      int var27 = 0;
      int var10001 = "a崺ߍ딒攙魵\ue6eeꕴ\uececꛟ潜\ue0b2ხ直౼첁墈︆ເꮼ䷛\uf891첒ﰥኙ鐥ɶ\ud853䛏\udae8끾牲㴂授)沮蓌컘頡灒卋᜵瓩햳\uf2a4㟩ᢛ槪窢匈ஂ诇Ì鉰뎝\udc4f跁䟞ါ见羅說ꐣ\ue5d0堟擀꠷ﾍ䁐껞胕噚Ｈ\uaacb尤띳뮨Ѿ諠퉻婫朸湷ᵚః쒄杔䩴扥쎕굘ⰺ쨫絡슂\udbbd\ue0ae꿨\u0010秂䧿筂짮绪짾縒䧧紺\u09ff绒ঊ紺짶笺触\n携ꦕ搊榔旂গ橚\ue996攚\ue9a9\u0010䌉蔅䩡씁䎁씄䒩\ue529䙩\ue505䒙蔛䪱ꔐ䃩\ue51b\n⋎碊⋾룿㱖壱㾮㣱㿮㣾\u0010ᄫ䱒ᕓ챗\u177bⱌႣⱌᚻⱑᆣ\uec56ᝃ䱛ဓ䱖\n犩\ue5cb犙┾伱씼俉ꔼ侉ꔿ"
         .length();
      int var26 = 0;
      int var24 = var10001;
      String[] var25 = new String[7];
      short var28 = 27215;
      String var23 = "a崺ߍ딒攙魵\ue6eeꕴ\uececꛟ潜\ue0b2ხ直౼첁墈︆ເꮼ䷛\uf891첒ﰥኙ鐥ɶ\ud853䛏\udae8끾牲㴂授)沮蓌컘頡灒卋᜵瓩햳\uf2a4㟩ᢛ槪窢匈ஂ诇Ì鉰뎝\udc4f跁䟞ါ见羅說ꐣ\ue5d0堟擀꠷ﾍ䁐껞胕噚Ｈ\uaacb尤띳뮨Ѿ諠퉻婫朸湷ᵚః쒄杔䩴扥쎕굘ⰺ쨫絡슂\udbbd\ue0ae꿨\u0010秂䧿筂짮绪짾縒䧧紺\u09ff绒ঊ紺짶笺触\n携ꦕ搊榔旂গ橚\ue996攚\ue9a9\u0010䌉蔅䩡씁䎁씄䒩\ue529䙩\ue505䒙蔛䪱ꔐ䃩\ue51b\n⋎碊⋾룿㱖壱㾮㣱㿮㣾\u0010ᄫ䱒ᕓ챗\u177bⱌႣⱌᚻⱑᆣ\uec56ᝃ䱛ဓ䱖\n犩\ue5cb犙┾伱씼俉ꔼ侉ꔿ";

      do {
         char var29 = var23.charAt(var27);
         var10001 = var27 + 1;
         int var10002 = var27 + 1;
         int var31 = 0;
         char[] var30 = var23.substring(var10001, var10002 + var29).toCharArray();

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
      int var41 = 0;
      abb = new int[307];
      byte[] var60 = "2¾ ×qß\u009e©~G ÿR\u0083\u0016#\u0089ÖùDA^\u00898ÿ\u0019Æ\"¯1*Åÿò·P]q5\u0000÷\u000fsE\u0015\u0089\u0085\u0010Æ}$íÊ¾õÍJ!\u008c¾ñ/ÕÜÒkÕ>½\tú-\u0080?Tø \u0002ï\u009cm\u008du²j7£ì~c\u009bë\b-]a\u009dt\u001f\u0081rð\u0092jÎ\u0092=\u001cÉõ¼VS\u0091õdG_\u0096&Å\u000eiåXvÏ\u000fiÂXÌ0½N\u000fwº~¥\u0018âîÑIj4¼ÞhNÝ6ÓhE«uV4\u0086ÐO\u0090>fÚ9KÀù·\u0017t)èÅYH¹ÄÇâ\u0015b$\u0012ï\u0004Kùnf{y\u0015aì\u0087Ç¯\u008cX7\u001b\u001a\u0019ÜæD\f\u0004Öz\u0099\u0093\u008eàh\u0081è9Âû\"öKábspåÒ\u0018Õ#¸±¢\u0094\u0094\u0000£Ñ\u0010\u0096{ôl\u0016\baã\u0002:t\u0011eÊ°Õ@£ É &\u008cGÓö+Gf\u007fø\u0011FÈ:íõ\u0097\u0093¤\u0095H\u0096®&\b\u00006ø\u0097(\nkÉ«Éä¶c\u0018©àC\u009f%¤÷Ä\u00adj!Ô.ÂÃG\u0085\u0003õâônÃ$\u009d?°}Pè±ãº\r¾ \u0094\u0088\u0094pGw\u00193\u0082\r-\u0010Òèà;Ø\u0003¼\u001d(*\u0012\u0015©S\n\u0084¹§\u008d\u0002:>\u009c\u0004\u001e\u0085\u0018uL\u0099\u0085ðð\u0000ÿ\u0096\u001aÄå®Â\"T¿ê?ñB\b\u001a\u0014ö_î!-d]{%G\u0013nÆ\u008ad\u0090_\u0014÷\u0097]\u0012¤ÒÿùÏ\u001fÓ&}Ã\b¤Á\u008bÐ\u0015&ûlëtm\u0000\u0080®åcgû\u0004q\u0016cá\u0089À\b;J\u000fµ;±MCÌpKÀxj\u008f^?hz\u0098y/¢\u0005xæH~\u008f¨ª\u0082IIõ\u0011g½ñ\u0090¶\nÓáÛÛ¶c\u0013©\t\u0003rð{_Ù\u0084ã\u001b¼-áÎOÛ×\u0090É\u0085\t¬a\u0013\u0088\u008br'ó\u009b]Ã\u0019\u0084(\u001dÄñÃ\"Ñ\u0015\u0005l9<î\u001doáÿ\u009fö[fÝ,\u0096\u0083î\\\u0090\u0088V¦~HøþùVôÃJÒ\u0003sw\u0000ù¶Ì)måFHýêôûvÇR\fÎ_\u0016=\u0096r\\i±V×\u0005ò};¶\u009aèÞ\u0000¹ßó\"â@@-¿û\u009bÍ¦y±ÖßPú7ýô7\u0006È«YuÓÈæÝ3\u0093a\b|Z\u0099V¡@Îº·TGæÛÎ¡~\u001d\u007fëº\u0087\t¯a\t¹øç\u008d\u0019÷¢\u0017ØÈ¦lj'I{|¦uØ\u0084X\u0093\u009d,Õ\u001d5¶pº·\u0080\u0085².ÙÑ\u0086üfU\u0006W4ÑUDm7æN ÇÏ¡\u007f\u008d¬üÑ5\u007f\"\u009b\u008d\u0088\u001e-wb\t\u0092Ä\bF2uÛá4gÙ\u0013V§Bâ\u0093ï³ÜÊ]÷PÜÑ4\u008bK\t\u0095\u0006}2P´fa´\u00904¿¨ÈC7ÿ\f\u0004=Aö+Ø\u0092\\\f\u0013Â\u0007Rl[ßÑëÃê~Áù¯\u001d\u001c¥gò\u0098i¹_\u0089\u0080\u0007\u001a\u0080F\u000bn\u0087f¼Ï\u008b\u0002\u0092!åà\u0018ê\u0094*º~úÕ\rðx\u008f\u0093¥\u0098\r8ÒVAEöÙÇ\u0083É£\u0090¸\u0011@\u009b\u009d\u009bú\u0080t\u0094\u0080\u0091½\u0082ê\u0087Óm«\bf\u0004z\u008e×<Â$\u008a\u0004\b\u001dÉÀ\u009dÊY\u008bj]Ñ\u0096Æs7Q¨\u008fD\u0088°\u0080;M\u001b\u0007\u008dë\u000b|tB-\u0093\u0097£î2âÖ\u008d¹£\u008fYÓ;\u009f«\u0011N\u0084y³°»\u0092¼'$Q´\u0001\u000bRí=<\u0092/\u0006ÏÑ\u0089¬Y\\àå#hÁï]åí¼@\u0088\u0094\u0007,ÎL\u008c\u008eÆ\u0001÷\u0011\u0007ÿÓ\fÐ¬h\t(tOâg\u008c±4Vôák]\u0013Úý\u008c\u001dkÔ\u0006\u0007B\u0006\u0002Ä=^\u0085Í?\u0010Ä¿¢µ®\u001f,&\u001dtp\u00140CIÌ~¿eXù\t÷=\u0089g<l¾õ(\u0018Ä/klÙ\u0090ò2¹\u0098K¼¤@uIV©\n¼\u0082\u0007N¿³$0ÎÂMù©O£\u009f\t\u0083\u0096`\u0086XçÒ\u0083á§y\u0090*\u0085æ\u007f£\u001fE\u0099ã5GÈ§èdÄÿ\u0080V=è]©&[Þæ¾d6|ã[^±\u0087´#Ö¸Ôý§û7\"e\u0081\u009e¶`ò·ßç|Ô\u0086TIcK\u0082\u0018äx\bþ:\u008f*¯ ØD³?Î\u009bÌÿ8wHwRTÐ¿&"
         .getBytes("ISO-8859-1");

      int var85;
      do {
         abb[var10000] = ((var60[var41] & 255) << 24 | (var60[var41 + 1] & 255) << 16 | (var60[var41 + 2] & 255) << 8 | var60[var41 + 3] & 255) ^ -1133749691;
         var10000 += 1;
         var85 = var41 + 4;
         var41 += 4;
      } while (var85 < var60.length);

      String[] var21 = new String[2];
      int var19 = 0;
      String var18;
      int var20 = (var18 = aaa(var33 ^ 1319295786, 'ﮒ', 'ϭ')).length();
      int var17 = bb(-1561214876, var33 ^ 1349823536);
      int var16 = -1;

      while (true) {
         label104: {
            char[] var44 = var18.substring(++var16, var16 + var17).toCharArray();
            var85 = var44.length;
            int var22 = 0;
            var68 = var44;
            var41 = var85;
            char[] var89;
            int var109;
            if (var85 <= 1) {
               var89 = var44;
               var109 = var22;
            } else {
               var68 = var44;
               var41 = var85;
               if (var85 <= var22) {
                  break label104;
               }

               var89 = var44;
               var109 = var22;
            }

            while (true) {
               var89[var109] = (char)(var89[var109] ^ switch (var22 % bb(-1561214875, var33 ^ 2095066056)) {
                  case 0 -> bb(-1561214874, var33 ^ -293250104);
                  case 1 -> bb(-1561214873, var33 ^ 634678388);
                  case 2 -> bb(-1561214856, var33 ^ 832575120);
                  case 3 -> bb(-1561214855, var33 ^ 1926499290);
                  case 4 -> bb(-1561214854, var33 ^ -343250104);
                  case 5 -> bb(-1561214853, var33 ^ 1376024282);
                  default -> bb(-1561214852, var33 ^ 1827767351);
               });
               var22++;
               if (var41 == 0) {
                  var109 = var41;
                  var89 = var68;
               } else {
                  if (var41 <= var22) {
                     break;
                  }

                  var89 = var68;
                  var109 = var22;
               }
            }
         }

         String var96 = new String(var68).intern();
         int var51 = -1;
         var21[var19++] = var96;
         if ((var16 += var17) >= var20) {
            ab = var21;
            aba = new String[2];
            long var8 = 6072494678480651817L;
            long[] var14 = new long[4];
            int var11 = 0;
            String var12;
            int var13 = (var12 = aaa(var33 ^ 1822801101, '\ue481', 'Ϭ')).length();
            byte var10 = 0;

            label88:
            while (true) {
               var51 = var10;
               var10 += 8;
               String var36 = var12.substring(var51, var10);
               var51 = var33 ^ 334541717;
               char var73 = '骜';
               short var97 = 1007;
               byte[] var15 = var36.getBytes("ISO-8859-1");
               long[] var37 = var14;
               var51 = var11++;
               long var74 = (var15[0] & 255L) << bb(-1561214851, var33 ^ 319049869)
                  | (var15[1] & 255L) << bb(-1561214850, var33 ^ 1460101589)
                  | (var15[2] & 255L) << bb(-1561214849, var33 ^ 695603381)
                  | (var15[3] & 255L) << bb(-1561214864, var33 ^ -535716532)
                  | (var15[4] & 255L) << bb(-1561214863, var33 ^ -2035199632)
                  | (var15[5] & 255L) << bb(-1561214862, var33 ^ 2034141754)
                  | (var15[bb(-1561214861, var33 ^ -885312655)] & 255L) << bb(-1561214860, var33 ^ 1613297750)
                  | var15[bb(-1561214859, var33 ^ -3706418)] & 255L;
               short var98 = -1;

               while (true) {
                  long var111 = var74 ^ var8;
                  switch (var98) {
                     case 0:
                        var37[var51] = var111;
                        if (var10 >= var13) {
                           aaa = var14;
                           aa = new Integer[4];
                           long var0 = 13111366154770346L;
                           long[] var6 = new long[2];
                           int var3 = 0;
                           String var4;
                           int var5 = (var4 = aaa(var33 ^ -380140924, '䊿', 'Ϩ')).length();
                           byte var2 = 0;

                           do {
                              int var57 = var2;
                              var2 += 8;
                              String var39 = var4.substring(var57, var2);
                              var57 = var33 ^ -281157865;
                              short var77 = 2307;
                              var98 = 1003;
                              byte[] var7 = var39.getBytes("ISO-8859-1");
                              var57 = var3++;
                              var111 = (
                                    (var7[0] & 255L) << bb(-1561214897, var33 ^ -1102846566)
                                       | (var7[1] & 255L) << bb(-1561214912, var33 ^ 2084129913)
                                       | (var7[2] & 255L) << bb(-1561214911, var33 ^ 2034918681)
                                       | (var7[3] & 255L) << bb(-1561214910, var33 ^ -20707749)
                                       | (var7[4] & 255L) << bb(-1561214909, var33 ^ 1307685279)
                                       | (var7[5] & 255L) << bb(-1561214908, var33 ^ -1683999085)
                                       | (var7[bb(-1561214907, var33 ^ 289859695)] & 255L) << bb(-1561214906, var33 ^ 857174585)
                                       | var7[bb(-1561214905, var33 ^ 1561062701)] & 255L
                                 )
                                 ^ var0;
                              byte var102 = -1;
                              var6[var57] = var111;
                           } while (var2 < var5);

                           bb = var6;
                           ba = new Long[2];
                           aab = new String[2];
                           ab();
                           return;
                        }
                        break;
                     default:
                        var37[var51] = var111;
                        if (var10 < var13) {
                           continue label88;
                        }

                        var13 = (var12 = aaa(var33 ^ 495186784, '\uf88c', 'Ϯ')).length();
                        var10 = 0;
                  }

                  int var55 = var10;
                  var10 += 8;
                  String var38 = var12.substring(var55, var10);
                  var55 = var33 ^ 2099233070;
                  short var76 = 3389;
                  var98 = 1001;
                  var15 = var38.getBytes("ISO-8859-1");
                  var37 = var14;
                  var51 = var11++;
                  var74 = (var15[0] & 255L) << bb(-1561214858, var33 ^ 1545679284)
                     | (var15[1] & 255L) << bb(-1561214857, var33 ^ 1584428304)
                     | (var15[2] & 255L) << bb(-1561214904, var33 ^ 2105290063)
                     | (var15[3] & 255L) << bb(-1561214903, var33 ^ 1334131339)
                     | (var15[4] & 255L) << bb(-1561214902, var33 ^ -1331787517)
                     | (var15[5] & 255L) << bb(-1561214901, var33 ^ -16337198)
                     | (var15[bb(-1561214900, var33 ^ 1700497847)] & 255L) << bb(-1561214899, var33 ^ -1472239927)
                     | var15[bb(-1561214898, var33 ^ -822082025)] & 255L;
                  var98 = 0;
               }
            }
         }

         var17 = var18.charAt(var16);
      }
   }

   public abbbbaaba() {
      super(
         aabbaaaba.aaab(aab[0]),
         bbaabbba.bab,
         aabbaaaba.aaab(aab[1])
      );
   }

   private static long b(int var0, long var1) {
      int var3 = (var0 ^ (int)var1 ^ bb(-1561214887, -577492797 ^ 1270746701)) & bb(-1561214886, -577492797 ^ -1747360761);
      if (ba[var3] == null) {
         ba[var3] = bb[var3] ^ var1;
      }

      return ba[var3];
   }
}
