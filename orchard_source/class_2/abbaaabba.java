package nsc;

import net.fabricmc.api.EnvType;
import net.fabricmc.api.Environment;

@Environment(EnvType.CLIENT)
public enum abbaaabba {
   private static final long[] aa;
   public static final abbaaabba ab;
   private static final String[] ba;
   private static final long[] bb;
   private static final Object[] bba;
   private static final Long[] aaa;
   private static final Integer[] aab;
   public static final abbaaabba aba;
   private static final int[] b;
   private static final abbaaabba[] abb;
   private static final String[] a;
   private static String[] baa;
   private static final String[] bab;

   public static abbaaabba aa(String var0) {
      return Enum.valueOf(abbaaabba.class, var0);
   }

   private static String aba(short var0, int var1, char var2) {
      int var3 = var2 ^ '髑';
      char[] var4 = bab[var3].toCharArray();
      StackTraceElement[] var5 = (StackTraceElement[])bba[var3];
      StackTraceElement[] var6;
      if (var5 != null) {
         var6 = var5;
      } else {
         var6 = new Throwable().getStackTrace();
         bba[var3] = var6;
      }

      StackTraceElement var7 = var6[1];
      int var8 = (var7.getClassName().hashCode() ^ var7.getMethodName().hashCode()) >> 16 ^ 30856;
      int var9 = 0;

      do {
         int var10 = var4[var9] - 28400;
         var10 -= 25218;
         var10 ^= 8665;
         var10 -= 8783;
         var10 += 35960;
         var4[var9] = (char)(var10 ^ var8 ^ var0 ^ var1 >> 16);
      } while (++var9 < var4.length);

      return new String(var4).intern();
   }

   private static abbaaabba[] ab() {
      return new abbaaabba[]{aba, ab};
   }

   private static void ba() {
      int var0 = -2042349624;
      baa[0] = aab(
         bb(a(-677985702, var0 ^ -762712441), a(-677985701, var0 ^ 159425505)).toCharArray(),
         aaa(a(-677985704, var0 ^ -756662452), 2499353147983801012L),
         b(a(-677985703, var0 ^ -1089623487), 1645022365758057148L)
      );
      baa[1] = aab(
         bb(a(-677985698, var0 ^ 1281370713), a(-677985697, var0 ^ -1395808727)).toCharArray(),
         aaa(a(-677985700, var0 ^ 1034250401), 6263352315323584804L),
         b(a(-677985699, var0 ^ -1167381179), 6929153638392058067L)
      );
   }

   private static String bb(int var0, int var1) {
      int var9 = -1230351469;
      int var2 = (var0 ^ a(-677985710, var9 ^ 1452128945)) & a(-677985709, var9 ^ -413211967);
      if (a[var2] == null) {
         char[] var3 = ba[var2].toCharArray();

         int var4 = switch (var3[0] & a(-677985712, var9 ^ -2047891336)) {
            case 0 -> a(-677985711, var9 ^ -626017937);
            case 1 -> a(-677985706, var9 ^ 1187000778);
            case 2 -> a(-677985705, var9 ^ 608549948);
            case 3 -> a(-677985708, var9 ^ 663382010);
            case 4 -> a(-677985707, var9 ^ 25146928);
            case 5 -> a(-677985718, var9 ^ 1992210719);
            case 6 -> a(-677985717, var9 ^ 2029874027);
            case 7 -> a(-677985720, var9 ^ -606745655);
            case 8 -> 5;
            case 9 -> a(-677985719, var9 ^ 1881420047);
            case 10 -> a(-677985714, var9 ^ -1677210719);
            case 11 -> a(-677985713, var9 ^ -645766189);
            case 12 -> a(-677985716, var9 ^ 656948093);
            case 13 -> a(-677985715, var9 ^ 325546097);
            case 14 -> a(-677985726, var9 ^ -1747221005);
            case 15 -> a(-677985725, var9 ^ 570350693);
            case 16 -> a(-677985728, var9 ^ -1449420334);
            case 17 -> a(-677985727, var9 ^ 1780498000);
            case 18 -> a(-677985722, var9 ^ 189711602);
            case 19 -> a(-677985721, var9 ^ -404092336);
            case 20 -> a(-677985724, var9 ^ 1342619699);
            case 21 -> a(-677985723, var9 ^ -1128803140);
            case 22 -> a(-677985670, var9 ^ -1731213500);
            case 23 -> a(-677985669, var9 ^ -1484286643);
            case 24 -> a(-677985672, var9 ^ 1155131624);
            case 25 -> a(-677985671, var9 ^ -833253285);
            case 26 -> a(-677985666, var9 ^ -856686874);
            case 27 -> a(-677985665, var9 ^ -2071427792);
            case 28 -> a(-677985668, var9 ^ -635921905);
            case 29 -> a(-677985667, var9 ^ 1604645426);
            case 30 -> a(-677985678, var9 ^ 368868488);
            case 31 -> a(-677985677, var9 ^ 1100949437);
            case 32 -> a(-677985680, var9 ^ -1827674049);
            case 33 -> a(-677985679, var9 ^ -1850586680);
            case 34 -> a(-677985674, var9 ^ -997762144);
            case 35 -> a(-677985673, var9 ^ -547805228);
            case 36 -> a(-677985676, var9 ^ 328335550);
            case 37 -> a(-677985675, var9 ^ 1309565548);
            case 38 -> a(-677985686, var9 ^ -1700341170);
            case 39 -> a(-677985685, var9 ^ 948717702);
            case 40 -> a(-677985688, var9 ^ 421612205);
            case 41 -> 0;
            case 42 -> a(-677985687, var9 ^ -472020403);
            case 43 -> a(-677985682, var9 ^ -1020684494);
            case 44 -> a(-677985681, var9 ^ -333518278);
            case 45 -> a(-677985684, var9 ^ 1276957208);
            case 46 -> a(-677985683, var9 ^ 70345150);
            case 47 -> a(-677985694, var9 ^ -1526324931);
            case 48 -> a(-677985693, var9 ^ -216990492);
            case 49 -> a(-677985696, var9 ^ -364490406);
            case 50 -> a(-677985695, var9 ^ 2013646747);
            case 51 -> a(-677985690, var9 ^ -1639772637);
            case 52 -> a(-677985689, var9 ^ 567793382);
            case 53 -> a(-677985692, var9 ^ -998195718);
            case 54 -> a(-677985691, var9 ^ 431749888);
            case 55 -> a(-677985766, var9 ^ -1359938829);
            case 56 -> a(-677985765, var9 ^ 166572109);
            case 57 -> a(-677985768, var9 ^ 261700242);
            case 58 -> a(-677985767, var9 ^ -992001409);
            case 59 -> a(-677985762, var9 ^ 537593653);
            case 60 -> a(-677985761, var9 ^ 171229019);
            case 61 -> a(-677985764, var9 ^ 622466738);
            case 62 -> 2;
            case 63 -> a(-677985763, var9 ^ -1643649527);
            case 64 -> a(-677985774, var9 ^ -1162591198);
            case 65 -> a(-677985773, var9 ^ -1801586908);
            case 66 -> a(-677985776, var9 ^ -716738368);
            case 67 -> a(-677985775, var9 ^ -944286174);
            case 68 -> a(-677985770, var9 ^ -211231029);
            case 69 -> a(-677985769, var9 ^ -1178661996);
            case 70 -> a(-677985772, var9 ^ 286002912);
            case 71 -> a(-677985771, var9 ^ -1212154338);
            case 72 -> a(-677985782, var9 ^ -1184945731);
            case 73 -> a(-677985781, var9 ^ 1781888119);
            case 74 -> a(-677985784, var9 ^ 1504911171);
            case 75 -> a(-677985783, var9 ^ -920732685);
            case 76 -> a(-677985778, var9 ^ -490059034);
            case 77 -> a(-677985777, var9 ^ 1362177014);
            case 78 -> a(-677985780, var9 ^ -1484841890);
            case 79 -> a(-677985779, var9 ^ -227215979);
            case 80 -> a(-677985790, var9 ^ -1850714196);
            case 81 -> a(-677985789, var9 ^ -1020939178);
            case 82 -> a(-677985792, var9 ^ -2041339315);
            case 83 -> a(-677985791, var9 ^ 788709319);
            case 84 -> a(-677985786, var9 ^ 1098108042);
            case 85 -> a(-677985785, var9 ^ 777937320);
            case 86 -> a(-677985788, var9 ^ 1628572564);
            case 87 -> a(-677985787, var9 ^ -1014325196);
            case 88 -> a(-677985734, var9 ^ -1099346293);
            case 89 -> a(-677985733, var9 ^ -1829493431);
            case 90 -> a(-677985736, var9 ^ -418505276);
            case 91 -> a(-677985735, var9 ^ -1617342147);
            case 92 -> a(-677985730, var9 ^ -1596463717);
            case 93 -> a(-677985729, var9 ^ 693040373);
            case 94 -> a(-677985732, var9 ^ -1362967223);
            case 95 -> a(-677985731, var9 ^ 432706970);
            case 96 -> a(-677985742, var9 ^ -268959192);
            case 97 -> a(-677985741, var9 ^ -1772217142);
            case 98 -> a(-677985744, var9 ^ -376327036);
            case 99 -> a(-677985743, var9 ^ 1456458964);
            case 100 -> a(-677985738, var9 ^ 2008719913);
            case 101 -> a(-677985737, var9 ^ 1253405477);
            case 102 -> a(-677985740, var9 ^ -267551746);
            case 103 -> a(-677985739, var9 ^ 1342490753);
            case 104 -> a(-677985750, var9 ^ 1183562405);
            case 105 -> a(-677985749, var9 ^ 823579254);
            case 106 -> a(-677985752, var9 ^ 556095277);
            case 107 -> a(-677985751, var9 ^ 1653791538);
            case 108 -> a(-677985746, var9 ^ -688370960);
            case 109 -> a(-677985745, var9 ^ 989091392);
            case 110 -> a(-677985748, var9 ^ -727244607);
            case 111 -> a(-677985747, var9 ^ 973261724);
            case 112 -> a(-677985758, var9 ^ 746662030);
            case 113 -> a(-677985757, var9 ^ 1385496406);
            case 114 -> a(-677985760, var9 ^ 1348488511);
            case 115 -> a(-677985759, var9 ^ 504902539);
            case 116 -> a(-677985754, var9 ^ 668642251);
            case 117 -> a(-677985753, var9 ^ -1943106414);
            case 118 -> a(-677985756, var9 ^ -877119980);
            case 119 -> a(-677985755, var9 ^ 1719743273);
            case 120 -> a(-677985574, var9 ^ 1073851979);
            case 121 -> a(-677985573, var9 ^ 557797112);
            case 122 -> a(-677985576, var9 ^ -29372952);
            case 123 -> a(-677985575, var9 ^ 774122618);
            case 124 -> a(-677985570, var9 ^ -106905661);
            case 125 -> a(-677985569, var9 ^ 914650580);
            case 126 -> a(-677985572, var9 ^ -756056007);
            case 127 -> a(-677985571, var9 ^ -729586285);
            case 128 -> a(-677985582, var9 ^ 1643832644);
            case 129 -> a(-677985581, var9 ^ 646384706);
            case 130 -> a(-677985584, var9 ^ -1775161682);
            case 131 -> a(-677985583, var9 ^ 661707821);
            case 132 -> a(-677985578, var9 ^ -828810537);
            case 133 -> a(-677985577, var9 ^ 1414208302);
            case 134 -> a(-677985580, var9 ^ -715259600);
            case 135 -> a(-677985579, var9 ^ -2019687546);
            case 136 -> a(-677985590, var9 ^ -993363440);
            case 137 -> a(-677985589, var9 ^ -523049002);
            case 138 -> a(-677985592, var9 ^ -614553711);
            case 139 -> a(-677985591, var9 ^ -806711693);
            case 140 -> a(-677985586, var9 ^ 1740237591);
            case 141 -> a(-677985585, var9 ^ 1355015903);
            case 142 -> a(-677985588, var9 ^ -587658417);
            case 143 -> a(-677985587, var9 ^ 118337811);
            case 144 -> a(-677985598, var9 ^ -184985516);
            case 145 -> a(-677985597, var9 ^ -839921652);
            case 146 -> a(-677985600, var9 ^ 130287248);
            case 147 -> a(-677985599, var9 ^ -654004247);
            case 148 -> a(-677985594, var9 ^ 56601508);
            case 149 -> a(-677985593, var9 ^ -467645373);
            case 150 -> a(-677985596, var9 ^ 531697406);
            case 151 -> a(-677985595, var9 ^ -1549682952);
            case 152 -> a(-677985542, var9 ^ -1180038346);
            case 153 -> a(-677985541, var9 ^ 1584221996);
            case 154 -> a(-677985544, var9 ^ -2017292829);
            case 155 -> a(-677985543, var9 ^ 638896505);
            case 156 -> a(-677985538, var9 ^ -1943917137);
            case 157 -> a(-677985537, var9 ^ 633951519);
            case 158 -> a(-677985540, var9 ^ 1137745505);
            case 159 -> a(-677985539, var9 ^ 369471674);
            case 160 -> a(-677985550, var9 ^ -1823010497);
            case 161 -> a(-677985549, var9 ^ 1615808407);
            case 162 -> a(-677985552, var9 ^ -969541094);
            case 163 -> a(-677985551, var9 ^ 500914980);
            case 164 -> a(-677985546, var9 ^ -924678859);
            case 165 -> a(-677985545, var9 ^ 2107051642);
            case 166 -> a(-677985548, var9 ^ -1172139297);
            case 167 -> a(-677985547, var9 ^ 208186347);
            case 168 -> a(-677985558, var9 ^ -610332568);
            case 169 -> a(-677985557, var9 ^ 561800345);
            case 170 -> a(-677985560, var9 ^ -1562269243);
            case 171 -> a(-677985559, var9 ^ -1297096834);
            case 172 -> a(-677985554, var9 ^ 634257309);
            case 173 -> a(-677985553, var9 ^ -1257971013);
            case 174 -> a(-677985556, var9 ^ 1417101775);
            case 175 -> a(-677985555, var9 ^ -1203512592);
            case 176 -> a(-677985566, var9 ^ 953588059);
            case 177 -> a(-677985565, var9 ^ -539530429);
            case 178 -> a(-677985568, var9 ^ 901774395);
            case 179 -> a(-677985567, var9 ^ -304111930);
            case 180 -> a(-677985562, var9 ^ -606483829);
            case 181 -> a(-677985561, var9 ^ -932769232);
            case 182 -> a(-677985564, var9 ^ -2143723154);
            case 183 -> a(-677985563, var9 ^ -16801721);
            case 184 -> a(-677985638, var9 ^ 1699712667);
            case 185 -> a(-677985637, var9 ^ 1445845210);
            case 186 -> a(-677985640, var9 ^ 426393258);
            case 187 -> a(-677985639, var9 ^ -1565588125);
            case 188 -> a(-677985634, var9 ^ 1197336056);
            case 189 -> 1;
            case 190 -> a(-677985633, var9 ^ 759362484);
            case 191 -> a(-677985636, var9 ^ 900212059);
            case 192 -> a(-677985635, var9 ^ 2071630043);
            case 193 -> a(-677985646, var9 ^ -409302662);
            case 194 -> a(-677985645, var9 ^ -544110075);
            case 195 -> a(-677985648, var9 ^ -1368420007);
            case 196 -> a(-677985647, var9 ^ 1686078638);
            case 197 -> a(-677985642, var9 ^ 1677006280);
            case 198 -> a(-677985641, var9 ^ 891033168);
            case 199 -> a(-677985644, var9 ^ -442143841);
            case 200 -> a(-677985643, var9 ^ -1326486456);
            case 201 -> a(-677985654, var9 ^ 1906064164);
            case 202 -> a(-677985653, var9 ^ 612074871);
            case 203 -> 3;
            case 204 -> a(-677985656, var9 ^ -1119185347);
            case 205 -> a(-677985655, var9 ^ 392546682);
            case 206 -> a(-677985650, var9 ^ -1688376630);
            case 207 -> a(-677985649, var9 ^ 1270237504);
            case 208 -> a(-677985652, var9 ^ -475406384);
            case 209 -> a(-677985651, var9 ^ -2050511029);
            case 210 -> a(-677985662, var9 ^ -1791747025);
            case 211 -> a(-677985661, var9 ^ 917539252);
            case 212 -> a(-677985664, var9 ^ -128822284);
            case 213 -> a(-677985663, var9 ^ 1258731270);
            case 214 -> a(-677985658, var9 ^ -1206783368);
            case 215 -> a(-677985657, var9 ^ -1165619533);
            case 216 -> a(-677985660, var9 ^ 908398331);
            case 217 -> 4;
            case 218 -> a(-677985659, var9 ^ 1192848383);
            case 219 -> a(-677985606, var9 ^ 419296719);
            case 220 -> a(-677985605, var9 ^ 1333269848);
            case 221 -> a(-677985608, var9 ^ -195710173);
            case 222 -> a(-677985607, var9 ^ -778066507);
            case 223 -> a(-677985602, var9 ^ 662297485);
            case 224 -> a(-677985601, var9 ^ 661573153);
            case 225 -> a(-677985604, var9 ^ 551497226);
            case 226 -> a(-677985603, var9 ^ -380864147);
            case 227 -> a(-677985614, var9 ^ 246513606);
            case 228 -> a(-677985613, var9 ^ -1269864896);
            case 229 -> a(-677985616, var9 ^ 1316150206);
            case 230 -> a(-677985615, var9 ^ -695224043);
            case 231 -> a(-677985610, var9 ^ 1806187365);
            case 232 -> a(-677985609, var9 ^ 1298930631);
            case 233 -> a(-677985612, var9 ^ -1819783745);
            case 234 -> a(-677985611, var9 ^ 130103507);
            case 235 -> a(-677985622, var9 ^ 1374001226);
            case 236 -> a(-677985621, var9 ^ 627622011);
            case 237 -> a(-677985624, var9 ^ -877807101);
            case 238 -> a(-677985623, var9 ^ 20304299);
            case 239 -> a(-677985618, var9 ^ -389096387);
            case 240 -> a(-677985617, var9 ^ -581680103);
            case 241 -> a(-677985620, var9 ^ 1009016379);
            case 242 -> a(-677985619, var9 ^ 1577663881);
            case 243 -> a(-677985630, var9 ^ 1264331528);
            case 244 -> a(-677985629, var9 ^ 1114807747);
            case 245 -> a(-677985632, var9 ^ 144612031);
            case 246 -> a(-677985631, var9 ^ 1561538934);
            case 247 -> a(-677985626, var9 ^ 123251917);
            case 248 -> a(-677985625, var9 ^ 84079125);
            case 249 -> a(-677985628, var9 ^ -706656804);
            case 250 -> a(-677985627, var9 ^ -1154359579);
            case 251 -> a(-677985446, var9 ^ -632209154);
            case 252 -> a(-677985445, var9 ^ 1355736202);
            case 253 -> a(-677985448, var9 ^ 1443721287);
            case 254 -> a(-677985447, var9 ^ 121674433);
            default -> a(-677985442, var9 ^ 957955811);
         };
         int var5 = (var1 & a(-677985441, var9 ^ 60773782)) - var4;
         if (var5 < 0) {
            var5 += 256;
         }

         int var6 = ((var1 & a(-677985444, var9 ^ 44130924)) >>> a(-677985443, var9 ^ -1290951055)) - var4;
         if (var6 < 0) {
            var6 += 256;
         }

         for (int var7 = 0; var7 < var3.length; var7++) {
            int var8 = var7 % 2;
            char var10002 = var3[var7];
            if (var8 == 0) {
               var3[var7] = (char)(var10002 ^ var5);
               var5 = ((var5 >>> 3 | var5 << 5) ^ var3[var7]) & a(-677985454, var9 ^ 1128507950);
            } else {
               var3[var7] = (char)(var10002 ^ var6);
               var6 = ((var6 >>> 3 | var6 << 5) ^ var3[var7]) & a(-677985453, var9 ^ -1352876122);
            }
         }

         a[var2] = new String(var3).intern();
      }

      return a[var2];
   }

   private static long aaa(int var0, long var1) {
      int var3 = (var0 ^ (int)var1 ^ a(-677985420, 1632809506 ^ 1300463035)) & a(-677985419, 1632809506 ^ -1370127566);
      if (aaa[var3] == null) {
         aaa[var3] = aa[var3] ^ var1;
      }

      return aaa[var3];
   }

   private static int a(int var0, int var1) {
      int var2 = b[var0 ^ -677985702] ^ var1 ^ var0;
      var2 -= 8618;
      var2 ^= 60627;
      var2 -= 26982;
      var2 += 42680;
      var2 -= 55375;
      var2 ^= 50632;
      var2 -= 12568;
      var2 += 45206;
      var2 -= 1829;
      return var2 - 50873;
   }

   private static int b(int var0, long var1) {
      int var3 = var0 ^ (int)(var1 & 32767L) ^ a(-677985430, 673608941 ^ 562869599);
      if (aab[var3] == null) {
         aab[var3] = (int)(bb[var3] ^ var1);
      }

      return aab[var3];
   }

   // $VF: Irreducible bytecode was duplicated to produce valid code
   static {
      int var33 = -911918081;
      short var28 = 7449;
      String[] var10002 = new String[7];
      int var26 = 0;
      String[] var25 = var10002;
      int var24 = "\f鏐칅ѿ\ueac6\u0de5䒭鵨ꚗ\uebd5办\ue081赦\u0010憋朅恰曑敹昩惧꘤曠⟭爉\ue634愗昲憔ꛎ\n䧌풭䥧呖䦾钬娼咳䤯啡\u0010⭝腻ᔪ쉪\u16ffũᒭʂᚖ艤ᐣžᕝ䅽ᔮ쉻\n\uf27a뼉\uf2a1㻇\ue778﹀\ue0aa㸠\ue039㻆\u0010툿\uec57튼ⳋ섵汁쁏氻솜\uecc2쀝\uec5e쇫\uec25자\ueded\n밸鬝뱣ᯛ늺\udb1c돨ᬄ뇻᯲"
         .length();
      String var23 = "\f鏐칅ѿ\ueac6\u0de5䒭鵨ꚗ\uebd5办\ue081赦\u0010憋朅恰曑敹昩惧꘤曠⟭爉\ue634愗昲憔ꛎ\n䧌풭䥧呖䦾钬娼咳䤯啡\u0010⭝腻ᔪ쉪\u16ffũᒭʂᚖ艤ᐣžᕝ䅽ᔮ쉻\n\uf27a뼉\uf2a1㻇\ue778﹀\ue0aa㸠\ue039㻆\u0010툿\uec57튼ⳋ섵汁쁏氻솜\uecc2쀝\uec5e쇫\uec25자\ueded\n밸鬝뱣ᯛ늺\udb1c돨ᬄ뇻᯲";
      int var27 = 0;

      do {
         char var29 = var23.charAt(var27);
         int var31 = 0;
         char[] var30 = var23.substring(var27 + 1, var27 + 1 + var29).toCharArray();

         do {
            int var32 = var30[var31];

            var32 = (char)(switch (var31 % 6) {
               default -> 217;
               case 1 -> 38;
               case 2 -> 106;
               case 3 -> 194;
               case 4 -> 231;
               case 5 -> 57;
            }) ^ var32;
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
      byte var37 = 0;
      b = new int[307];
      int var10001 = 0;
      byte[] var60 = "\u0019÷úë=\u0003ôÁ\u0019\u0098*utq&á\u0087\u001e>:g°\u0000\u0019öÛv\u0017q\u0017\u000bµ\u00ad\u001dÊ\u008e\u001cÎr'~|9\u009d!<.\\½S¦\u0083ßÖ+mÜ\u0019öGúì&×\u008d-.A\u0083nüQ FZ\u0000\u008b·¦>g\u0094\\î\"\u0011ô|Ü»¬\u000bèôáªlH\u0012øÚmK;R\b\u000eý\u0091³©DðÝSÀ\u001cy\u009d+«\u0095WºG$CÎc\\V\u009e\\\u0014\u0002&¿Jy95Æ\u0007T7|ið\u007f\u001b\u0012E!\u008b\u000b\u009d¤7e\u007fîoë0º\f¶\u007fh\u009c\u007f\u0093j!Þ`?\u0014Ì\u00ad$Ê·âè\u0001\u0097¹µ\u009dõ2a5M\u0010Ã\u001fß6â²Û;\u0018N\u001d\u00078º\u0000p\u0017\u008dz\u0018·\u008fCÛÿ¢ö>^\u0095¶5\b\u0083mt\u0011ÕÀ\u0080\u0083\u0096XßeÐ\u009e\u0007ÚDG1?\u0013*÷â(l\u0083UcmÎò~!ñô\n«\u0018?LÕ¨Û\u0098\u0096Äñ§.½Þ\u0089\u0087.e\u0094w\u0083A'Ó.o\u000ef¤.Ôá+<$Ç¬\bûN\u0091B,\u009c¼ê\u009f\u0099\u00adL,i\u0006BÌ¹ä\u0091¦åÐ¢ \u0088\u00152\u008d*D\u0019YÛLª¢ºa\\ì\u008dß\tçbûj#Àþ8¶%¡}À5\u0007Ô\u0091._ºà[LÕÍð^\u009a\u0081\u009c[8\u00191ËEêÙeig²R\u001c\u009d\u008cGd\nÀ\u0087[DrîÒÝe\"UQTóâY\u0002\u0091\u0014k\u0095\u001emÍ\u008b+\u0012\u0002#X\u00ad\\]Z\u008c)5h±&ä\n\u000b\u009eêg«\u0097Xæ½\u0018+pÊ\u0085CßÚ¶Æ \u0099\u0001L\u001e-kÝ\u000bÁgÇÖ/4±UÁ\u0091\\\u009b×\u0012¹\u001a©\u0007nä«óÚÌå\u008b£îÜI<!w½\u001b 0+¡>\u009d\u0012£\u001e»\u00929uÚ¬ÙÀ\u0005¬Z9Õ·»D\u00023(aÍ\u0017ä¼)|\u0017$/\u0010ô¤\u009airãÝ\u0014\u009bAm¢¹±ÜãK#5\nÍÙ¯Ø\u008c\u0092.Í\u0090~|\r\u0094=?Yê\u009d\u001bAp? Í0\b4y\u0019\u0087\u009c*{Å«PqÊ'j\u009c\u0088ü\u009e (\u000fjÉ\u001c6|AZüW\u0091n\"\u00978ïøÌ<\u0080\u001f³Û\u008cä\"\u0099rX2!\bB9\u009c\u0093¥þØ\u0006|Q\u001a\nÝ\u0087^þw±º+ÞZÂ\"¸C\t´í\u0096 \u0007hÄ\u0080H\u009bÜÖ\u0094=¦kaæHÌ\u008d3q\u0014k\u0086\u0004\u009f\tA±\u0005í÷û:\u0097 \f\u0087ÿÚïó»Yr>-I<N5Þ^nãN\u0097uC¯äÖwCÐM\u000bÃE\u000eï$DûüÎ,mE\u0016L\tÂ J]¥3ô\u0083%{ªö±\u0005l7|\u009eÜ\u00190\u00ad¾Hòâù¯¼Y<\u0095é¼ÎtÓÖÑd2Î;´f\u0080é\u0001»\u001c\t\u001eë$\u0002\u001d¾Uü\u0006\u0094\u009fì\u0013\u0011\u0098f\u0082zÎ\u008f\u0081«\u001e6ünK|ü\u009e\u008a\u000f«ëßè\u0012\u008cFÙ\u0001TìöXP`Îý\u0013°%ØC\u0018:NÁ~T8én§\u008bzÍ#\u0018Ë\u0003ÁÂ\u008c°\u0095 þC\u0082cUA\u0015\u009f¨Í¶\u0099»¼\u008aü4ãnbX´ë\u0084W\u000fÆ$¨*\f2ÚÜêL<ÜýYóÛL¿A\u0012ßî¯õ\"îóOÜñ0µáL\u0015-\u001c.\u0096\u0090;¬\u009c¶ÿ\u008c\u00adh\u001bÚmüR©Ìªv\b¦ÞûQX0>-\u0092ú¦F:\u0013]K\u0091&ÇÓ±Ç·Ï*¥\u009a¬«°Ï»\u0016¹á\f\u0095ó\r\u000b\u008b¦\u0080¦ñüË=Íþ\u0091e¨.rÒ\n@¢IL!ÂÐO«]tJ\u00ad\u009eæ>üÓ\n6Â\u008a¨xø\fÅ|ù1ó\u0085H\u009e7\u0090¸Ð:ÉTÏ/@ùWçáa¬\u008e2?\u0011N©0É&\u0006µ\u0018X*å×kY5bõkh1ÎI\u0015ÎQ\u008eg}ípJDeW\u0089¨\u0012Ãaµ%ôÝ\u001eNGçI}ÕÓXãëËÆ(a=~J\u0012½\u0099V\u001a75\\\u0094ñÑ\u00ad\u0010Øåj¼s¦BD7\u0011Ûv\u0019#SÚ\u0011\u009c\u009c£\u0092\u0015±]ph¨ÿ\u0093$o ¤T\u0081ý I\u001eBb\u0094\u0002¼\u0085íhQ\u0003âÌJl\u0018\u0006R*¿RÇaé\u0088ã\u0082?sCD\u0093/\u008dÚ;*´à%În"
         .getBytes("ISO-8859-1");

      int var85;
      do {
         b[var37] = ((var60[var10001] & 255) << 24 | (var60[var10001 + 1] & 255) << 16 | (var60[var10001 + 2] & 255) << 8 | var60[var10001 + 3] & 255)
            ^ -1699812649;
         var37 += 1;
         var85 = var10001 + 4;
         var10001 += 4;
      } while (var85 < var60.length);

      String[] var21 = new String[2];
      int var19 = 0;
      String var18;
      int var20 = (var18 = aba((short)'錆', var33 ^ 694690343, '髑')).length();
      int var17 = a(-677985456, var33 ^ 2110462384);
      int var16 = -1;

      while (true) {
         label114: {
            char[] var44 = var18.substring(++var16, var16 + var17).toCharArray();
            var85 = var44.length;
            int var22 = 0;
            var68 = var44;
            var10001 = var85;
            char[] var89;
            int var109;
            if (var85 <= 1) {
               var89 = var44;
               var109 = var22;
            } else {
               var68 = var44;
               var10001 = var85;
               if (var85 <= var22) {
                  break label114;
               }

               var89 = var44;
               var109 = var22;
            }

            while (true) {
               var89[var109] = (char)(var89[var109] ^ switch (var22 % a(-677985455, var33 ^ -449810334)) {
                  case 0 -> a(-677985450, var33 ^ -1148342114);
                  case 1 -> a(-677985449, var33 ^ -1269442529);
                  case 2 -> a(-677985452, var33 ^ 830776850);
                  case 3 -> a(-677985451, var33 ^ 1632343319);
                  case 4 -> a(-677985462, var33 ^ -1308751036);
                  case 5 -> a(-677985461, var33 ^ -324194192);
                  default -> a(-677985464, var33 ^ -1856852089);
               });
               var22++;
               if (var10001 == 0) {
                  var109 = var10001;
                  var89 = var68;
               } else {
                  if (var10001 <= var22) {
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
            ba = var21;
            a = new String[2];
            long var8 = 3568202723609987527L;
            long[] var14 = new long[4];
            int var11 = 0;
            String var12;
            int var13 = (var12 = aba((short)'컻', var33 ^ -1985215291, '髐')).length();
            byte var10 = 0;

            label98:
            while (true) {
               var51 = var10;
               var10 += 8;
               String var38 = var12.substring(var51, var10);
               int var53 = 46118;
               int var73 = var33 ^ -914094249;
               char var97 = '髓';
               byte[] var15 = var38.getBytes("ISO-8859-1");
               long[] var39 = var14;
               var51 = var11++;
               long var74 = (var15[0] & 255L) << a(-677985463, var33 ^ -471788711)
                  | (var15[1] & 255L) << a(-677985458, var33 ^ -824665343)
                  | (var15[2] & 255L) << a(-677985457, var33 ^ 221572156)
                  | (var15[3] & 255L) << a(-677985460, var33 ^ -450241584)
                  | (var15[4] & 255L) << a(-677985459, var33 ^ 1501736970)
                  | (var15[5] & 255L) << a(-677985470, var33 ^ 1674937263)
                  | (var15[a(-677985469, var33 ^ 1472470434)] & 255L) << a(-677985472, var33 ^ 1331352049)
                  | var15[a(-677985471, var33 ^ -1176325038)] & 255L;
               byte var98 = -1;

               while (true) {
                  long var111 = var74 ^ var8;
                  switch (var98) {
                     case 0:
                        var39[var51] = var111;
                        if (var10 >= var13) {
                           bb = var14;
                           aab = new Integer[4];
                           long var0 = 7649915476699414874L;
                           long[] var6 = new long[2];
                           int var3 = 0;
                           String var4;
                           int var5 = (var4 = aba((short)'ퟜ', var33 ^ 142046091, '體')).length();
                           byte var2 = 0;

                           do {
                              byte var57 = var2;
                              var2 += 8;
                              String var41 = var4.substring(var57, var2);
                              var53 = (char)43030;
                              int var77 = var33 ^ -126407169;
                              var97 = '髗';
                              byte[] var7 = var41.getBytes("ISO-8859-1");
                              var53 = var3++;
                              var111 = (
                                    (var7[0] & 255L) << a(-677985409, var33 ^ -185313568)
                                       | (var7[1] & 255L) << a(-677985412, var33 ^ 397971780)
                                       | (var7[2] & 255L) << a(-677985411, var33 ^ 550010672)
                                       | (var7[3] & 255L) << a(-677985422, var33 ^ 617996376)
                                       | (var7[4] & 255L) << a(-677985421, var33 ^ -435618609)
                                       | (var7[5] & 255L) << a(-677985424, var33 ^ 24221209)
                                       | (var7[a(-677985423, var33 ^ -2021772751)] & 255L) << a(-677985418, var33 ^ -393936908)
                                       | var7[a(-677985417, var33 ^ -1373393743)] & 255L
                                 )
                                 ^ var0;
                              byte var102 = -1;
                              var6[var53] = var111;
                           } while (var2 < var5);

                           aa = var6;
                           aaa = new Long[2];
                           baa = new String[2];
                           ba();
                           aba = new abbaaabba();
                           ab = new abbaaabba();
                           abb = ab();
                           return;
                        }
                        break;
                     default:
                        var39[var51] = var111;
                        if (var10 < var13) {
                           continue label98;
                        }

                        var13 = (var12 = aba((short)5349, var33 ^ 2129080896, '髒')).length();
                        var10 = 0;
                  }

                  byte var55 = var10;
                  var10 += 8;
                  String var40 = var12.substring(var55, var10);
                  char var56 = '鼮';
                  int var76 = var33 ^ -1193328431;
                  var97 = '髕';
                  var15 = var40.getBytes("ISO-8859-1");
                  var39 = var14;
                  var51 = var11++;
                  var74 = (var15[0] & 255L) << a(-677985466, var33 ^ 956672060)
                     | (var15[1] & 255L) << a(-677985465, var33 ^ -1280728373)
                     | (var15[2] & 255L) << a(-677985468, var33 ^ 1968002020)
                     | (var15[3] & 255L) << a(-677985467, var33 ^ 1551471761)
                     | (var15[4] & 255L) << a(-677985414, var33 ^ -147145666)
                     | (var15[5] & 255L) << a(-677985413, var33 ^ -1282595531)
                     | (var15[a(-677985416, var33 ^ -1648382552)] & 255L) << a(-677985415, var33 ^ -1795136246)
                     | var15[a(-677985410, var33 ^ 378097442)] & 255L;
                  var98 = 0;
               }
            }
         }

         var17 = var18.charAt(var16);
      }
   }

   private static String aab(char[] var0, long var1, int var3) {
      int var4 = b(a(-677985429, -1583245987 ^ 916681984), 8538067168445076535L) ^ var3;

      for (int var5 = 0; var5 < var0.length; var5++) {
         int var7 = var4 ^ (int)var1 ^ ~var5;
         int var8 = var7 ^ var3 - var5 * var0.length;
         var4 = -var8 * var3 | var5;
         var0[var5] = (char)(var0[var5] ^ var4);
         int var6 = var5 & b(a(-677985432, -1583245987 ^ 213806270), 5839976599025516369L);
         var3 = var3 << var6 | var3 >>> -var6;
         var1 ^= var6;
      }

      return new String(var0);
   }
}
