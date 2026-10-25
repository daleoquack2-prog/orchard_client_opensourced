package nsc;

import net.fabricmc.api.EnvType;
import net.fabricmc.api.Environment;
import net.minecraft.class_310;
import net.minecraft.class_327;
import net.minecraft.class_332;

@Environment(EnvType.CLIENT)
public final class aabaabbb
   extends abbaabbaa
   implements bababba {
   private static final Object[] abaa;
   private static final bbabbab aa;
   private static final Long[] ab;
   private static final double ba = 4.0;
   private final bababa bb;
   private static final String[] aaa;
   private static String[] aab;
   private static final int[] aaba;
   private final bababa aba;
   private static final long[] abb;
   private static final long[] baa;
   private static final String[] aabb;
   private static final double bab = 18.0;
   private static final String[] bba;
   private static final double bbb = 7.0;
   private static final Integer[] aaaa;
   private final bababa aaab;

   private static int aaaa(int var0, int var1) {
      int var2 = aaba[var0 ^ -721158911] ^ var1 ^ var0;
      var2 -= 61027;
      var2 -= 267;
      var2 -= 46642;
      var2 -= 32218;
      var2 += 35191;
      var2 += 9852;
      var2 += 16630;
      var2 ^= 38952;
      return var2 ^ 33800;
   }

   private static void aa() {
      int var0 = -1759678929;
      aab[0] = aba(
         ba(aaaa(-721158911, var0 ^ -2066239171), aaaa(-721158912, var0 ^ 880087859)).toCharArray(),
         ab(aaaa(-721158909, var0 ^ -564617168), 2356342400298843705L),
         aab(aaaa(-721158910, var0 ^ 22917793), 4274468527205242159L)
      );
      aab[1] = aba(
         ba(aaaa(-721158907, var0 ^ -788629508), aaaa(-721158908, var0 ^ -112466788)).toCharArray(),
         ab(aaaa(-721158905, var0 ^ -1025749920), 4966672630499959420L),
         aab(aaaa(-721158906, var0 ^ 1077216687), 7251005126946429674L)
      );
      aab[2] = aba(
         ba(aaaa(-721158903, var0 ^ -265901734), aaaa(-721158904, var0 ^ 1693568587)).toCharArray(),
         ab(aaaa(-721158901, var0 ^ -310177244), 1770833747969527226L),
         aab(aaaa(-721158902, var0 ^ 1536635841), 7981200060152993869L)
      );
      aab[3] = aba(
         ba(aaaa(-721158899, var0 ^ 1173588380), aaaa(-721158900, var0 ^ 1478698822)).toCharArray(),
         ab(aaaa(-721158897, var0 ^ 983864382), 151385469836960992L),
         aab(aaaa(-721158898, var0 ^ 1112214930), 8042703372746462863L)
      );
      aab[4] = aba(
         ba(aaaa(-721158895, var0 ^ 1696265053), aaaa(-721158896, var0 ^ -753548102)).toCharArray(),
         ab(aaaa(-721158893, var0 ^ -1639256931), 10617754178037244L),
         aab(aaaa(-721158894, var0 ^ 1883926427), 510677828651020921L)
      );
      aab[5] = aba(
         ba(aaaa(-721158891, var0 ^ 32635685), aaaa(-721158892, var0 ^ 1928706429)).toCharArray(),
         ab(aaaa(-721158889, var0 ^ 1271369443), 5977015392948676033L),
         aab(aaaa(-721158890, var0 ^ 102057441), 7644642164819825307L)
      );
      aab[aab(aaaa(-721158887, var0 ^ -357715437), 1515490320232849802L)] = aba(
         ba(aaaa(-721158888, var0 ^ -1997523197), aaaa(-721158885, var0 ^ -935746419)).toCharArray(),
         ab(aaaa(-721158886, var0 ^ 981737306), 695462887221630663L),
         aab(aaaa(-721158883, var0 ^ 596238987), 7745681055601491319L)
      );
      aab[aab(aaaa(-721158884, var0 ^ 478152141), 8827256729007994063L)] = aba(
         ba(aaaa(-721158881, var0 ^ -2088783348), aaaa(-721158882, var0 ^ -1569053101)).toCharArray(),
         ab(aaaa(-721158879, var0 ^ -202380809), 961887089389161213L),
         aab(aaaa(-721158880, var0 ^ -2023026636), 5151159093245177131L)
      );
   }

   private static long ab(int var0, long var1) {
      int var3 = (var0 ^ (int)var1 ^ aaaa(-721158877, -1050527242 ^ -1193876579)) & aaaa(-721158878, -1050527242 ^ 903969271);
      if (ab[var3] == null) {
         ab[var3] = abb[var3] ^ var1;
      }

      return ab[var3];
   }

   // $VF: Handled exception range with multiple entry points by splitting it
   // $VF: Duplicated exception handlers to handle obfuscated exceptions
   @Override
   public double aaaaa() {
      int var1 = baaabbaa.bba;
      class_310 var2 = class_310.method_1551();

      label30: {
         class_310 var10000;
         label29: {
            try {
               var10000 = var2;
               if (var1 != 0) {
                  break label29;
               }

               if (var2 == null) {
                  break label30;
               }
            } catch (MatchException var5) {
               throw var5;
            }

            var10000 = var2;
         }

         try {
            if (var10000.field_1772 != null) {
               return this.aaa(var2.field_1772, this.bba()) * this.a();
            }
         } catch (MatchException var4) {
            throw var4;
         }
      }

      try {
         return 42.0 * this.a();
      } catch (MatchException var3) {
         throw var3;
      }
   }

   private static String ba(int var0, int var1) {
      int var9 = 1607795195;
      int var2 = (var0 ^ aaaa(-721158823, var9 ^ -1405117742)) & aaaa(-721158824, var9 ^ 1714926733);
      if (aaa[var2] == null) {
         char[] var3 = bba[var2].toCharArray();

         int var4 = switch (var3[0] & aaaa(-721158821, var9 ^ -1368511548)) {
            case 0 -> aaaa(-721158822, var9 ^ 2130258512);
            case 1 -> aaaa(-721158819, var9 ^ -1998615517);
            case 2 -> aaaa(-721158820, var9 ^ 1119026651);
            case 3 -> aaaa(-721158817, var9 ^ 989166725);
            case 4 -> aaaa(-721158818, var9 ^ 1937135799);
            case 5 -> aaaa(-721158815, var9 ^ 714445464);
            case 6 -> aaaa(-721158816, var9 ^ -842268607);
            case 7 -> aaaa(-721158813, var9 ^ 859931992);
            case 8 -> aaaa(-721158814, var9 ^ -1923819444);
            case 9 -> aaaa(-721158811, var9 ^ -876796918);
            case 10 -> aaaa(-721158812, var9 ^ -1792609681);
            case 11 -> aaaa(-721158809, var9 ^ 827777805);
            case 12 -> aaaa(-721158810, var9 ^ -336227688);
            case 13 -> aaaa(-721158807, var9 ^ -195648382);
            case 14 -> aaaa(-721158808, var9 ^ -1696558016);
            case 15 -> aaaa(-721158805, var9 ^ 1529178932);
            case 16 -> aaaa(-721158806, var9 ^ -1270382970);
            case 17 -> aaaa(-721158803, var9 ^ 1855363135);
            case 18 -> aaaa(-721158804, var9 ^ -1655601788);
            case 19 -> aaaa(-721158801, var9 ^ 842060450);
            case 20 -> aaaa(-721158802, var9 ^ -1021750111);
            case 21 -> aaaa(-721158799, var9 ^ 1333356727);
            case 22 -> aaaa(-721158800, var9 ^ -2143866725);
            case 23 -> aaaa(-721158797, var9 ^ -58025259);
            case 24 -> aaaa(-721158798, var9 ^ -1269783374);
            case 25 -> aaaa(-721158795, var9 ^ -620598937);
            case 26 -> aaaa(-721158796, var9 ^ -22935274);
            case 27 -> aaaa(-721158793, var9 ^ 742961095);
            case 28 -> aaaa(-721158794, var9 ^ 1859019208);
            case 29 -> aaaa(-721158791, var9 ^ -843414335);
            case 30 -> aaaa(-721158792, var9 ^ -1553031521);
            case 31 -> aaaa(-721158789, var9 ^ 889980326);
            case 32 -> aaaa(-721158790, var9 ^ 1083255187);
            case 33 -> aaaa(-721158787, var9 ^ 729918582);
            case 34 -> aaaa(-721158788, var9 ^ -1602479596);
            case 35 -> aaaa(-721158785, var9 ^ 723111449);
            case 36 -> aaaa(-721158786, var9 ^ -475723159);
            case 37 -> aaaa(-721158783, var9 ^ 242499894);
            case 38 -> aaaa(-721158784, var9 ^ 258188041);
            case 39 -> aaaa(-721158781, var9 ^ 207331579);
            case 40 -> aaaa(-721158782, var9 ^ -1628259683);
            case 41 -> aaaa(-721158779, var9 ^ -2094815796);
            case 42 -> aaaa(-721158780, var9 ^ 1305812389);
            case 43 -> aaaa(-721158777, var9 ^ 1220635716);
            case 44 -> aaaa(-721158778, var9 ^ 1226029374);
            case 45 -> aaaa(-721158775, var9 ^ -1510204297);
            case 46 -> aaaa(-721158776, var9 ^ 1732074050);
            case 47 -> aaaa(-721158773, var9 ^ -1893783526);
            case 48 -> aaaa(-721158774, var9 ^ -1178085678);
            case 49 -> aaaa(-721158771, var9 ^ -2123222998);
            case 50 -> aaaa(-721158772, var9 ^ -311478328);
            case 51 -> aaaa(-721158769, var9 ^ -1241975694);
            case 52 -> aaaa(-721158770, var9 ^ 1764551250);
            case 53 -> aaaa(-721158767, var9 ^ 344436460);
            case 54 -> aaaa(-721158768, var9 ^ -139882658);
            case 55 -> aaaa(-721158765, var9 ^ -615242341);
            case 56 -> aaaa(-721158766, var9 ^ 592313954);
            case 57 -> aaaa(-721158763, var9 ^ 1452530911);
            case 58 -> aaaa(-721158764, var9 ^ -1576899062);
            case 59 -> 0;
            case 60 -> aaaa(-721158761, var9 ^ -1359551020);
            case 61 -> aaaa(-721158762, var9 ^ 1100283994);
            case 62 -> aaaa(-721158759, var9 ^ -1069925265);
            case 63 -> aaaa(-721158760, var9 ^ 374321484);
            case 64 -> aaaa(-721158757, var9 ^ -1119375245);
            case 65 -> aaaa(-721158758, var9 ^ 1099351398);
            case 66 -> aaaa(-721158755, var9 ^ 150124576);
            case 67 -> aaaa(-721158756, var9 ^ -684728916);
            case 68 -> aaaa(-721158753, var9 ^ -1979123615);
            case 69 -> aaaa(-721158754, var9 ^ 618785631);
            case 70 -> aaaa(-721158751, var9 ^ -213858963);
            case 71 -> aaaa(-721158752, var9 ^ 170264859);
            case 72 -> aaaa(-721158749, var9 ^ 801895091);
            case 73 -> aaaa(-721158750, var9 ^ 1737390582);
            case 74 -> 5;
            case 75 -> aaaa(-721158747, var9 ^ 1328034180);
            case 76 -> aaaa(-721158748, var9 ^ 232463828);
            case 77 -> aaaa(-721158745, var9 ^ -342621416);
            case 78 -> aaaa(-721158746, var9 ^ 994687439);
            case 79 -> aaaa(-721158743, var9 ^ 889398542);
            case 80 -> aaaa(-721158744, var9 ^ 1765350297);
            case 81 -> 3;
            case 82 -> aaaa(-721158741, var9 ^ -840965693);
            case 83 -> aaaa(-721158742, var9 ^ -958433708);
            case 84 -> aaaa(-721158739, var9 ^ 1392680027);
            case 85 -> aaaa(-721158740, var9 ^ 1689466025);
            case 86 -> aaaa(-721158737, var9 ^ -530825181);
            case 87 -> aaaa(-721158738, var9 ^ 1675909374);
            case 88 -> aaaa(-721158735, var9 ^ -1239457959);
            case 89 -> aaaa(-721158736, var9 ^ -1873654677);
            case 90 -> aaaa(-721158733, var9 ^ 1063621208);
            case 91 -> aaaa(-721158734, var9 ^ 150552841);
            case 92 -> aaaa(-721158731, var9 ^ 956810625);
            case 93 -> aaaa(-721158732, var9 ^ 17944739);
            case 94 -> aaaa(-721158729, var9 ^ -671017616);
            case 95 -> aaaa(-721158730, var9 ^ 1566520946);
            case 96 -> aaaa(-721158727, var9 ^ 1296245627);
            case 97 -> aaaa(-721158728, var9 ^ -77509450);
            case 98 -> aaaa(-721158725, var9 ^ -1462082171);
            case 99 -> aaaa(-721158726, var9 ^ -1772188690);
            case 100 -> aaaa(-721158723, var9 ^ -135147997);
            case 101 -> aaaa(-721158724, var9 ^ 116558095);
            case 102 -> aaaa(-721158721, var9 ^ 1438114752);
            case 103 -> aaaa(-721158722, var9 ^ 775148190);
            case 104 -> aaaa(-721158719, var9 ^ 1106919523);
            case 105 -> aaaa(-721158720, var9 ^ 767966092);
            case 106 -> aaaa(-721158717, var9 ^ 1398436787);
            case 107 -> aaaa(-721158718, var9 ^ 710697708);
            case 108 -> aaaa(-721158715, var9 ^ 2065879710);
            case 109 -> aaaa(-721158716, var9 ^ 482277359);
            case 110 -> aaaa(-721158713, var9 ^ -794514498);
            case 111 -> aaaa(-721158714, var9 ^ -739205066);
            case 112 -> aaaa(-721158711, var9 ^ 775247553);
            case 113 -> aaaa(-721158712, var9 ^ -1444485413);
            case 114 -> aaaa(-721158709, var9 ^ -650458756);
            case 115 -> aaaa(-721158710, var9 ^ 779880332);
            case 116 -> aaaa(-721158707, var9 ^ -387063028);
            case 117 -> aaaa(-721158708, var9 ^ 1018444142);
            case 118 -> aaaa(-721158705, var9 ^ -625987613);
            case 119 -> aaaa(-721158706, var9 ^ -1648725873);
            case 120 -> aaaa(-721158703, var9 ^ -1516739974);
            case 121 -> aaaa(-721158704, var9 ^ -2144642433);
            case 122 -> aaaa(-721158701, var9 ^ -1760564865);
            case 123 -> aaaa(-721158702, var9 ^ 938766756);
            case 124 -> aaaa(-721158699, var9 ^ -328034485);
            case 125 -> aaaa(-721158700, var9 ^ -1325772046);
            case 126 -> aaaa(-721158697, var9 ^ 1695208494);
            case 127 -> aaaa(-721158698, var9 ^ 177950833);
            case 128 -> aaaa(-721158695, var9 ^ 1400388200);
            case 129 -> 4;
            case 130 -> aaaa(-721158696, var9 ^ -410694046);
            case 131 -> aaaa(-721158693, var9 ^ 1419038558);
            case 132 -> aaaa(-721158694, var9 ^ 661350137);
            case 133 -> aaaa(-721158691, var9 ^ 1635784294);
            case 134 -> aaaa(-721158692, var9 ^ 1970174900);
            case 135 -> aaaa(-721158689, var9 ^ -977566840);
            case 136 -> aaaa(-721158690, var9 ^ 1260865668);
            case 137 -> aaaa(-721158687, var9 ^ 321410969);
            case 138 -> aaaa(-721158688, var9 ^ 995778023);
            case 139 -> aaaa(-721158685, var9 ^ 1206600673);
            case 140 -> aaaa(-721158686, var9 ^ -753062609);
            case 141 -> aaaa(-721158683, var9 ^ -567036904);
            case 142 -> aaaa(-721158684, var9 ^ -219097073);
            case 143 -> aaaa(-721158681, var9 ^ 784829210);
            case 144 -> aaaa(-721158682, var9 ^ -1641346548);
            case 145 -> aaaa(-721158679, var9 ^ -603270603);
            case 146 -> aaaa(-721158680, var9 ^ -200716530);
            case 147 -> aaaa(-721158677, var9 ^ -1892839819);
            case 148 -> aaaa(-721158678, var9 ^ -1976048583);
            case 149 -> aaaa(-721158675, var9 ^ 1328005290);
            case 150 -> aaaa(-721158676, var9 ^ 1706484341);
            case 151 -> aaaa(-721158673, var9 ^ 571708077);
            case 152 -> aaaa(-721158674, var9 ^ -436634921);
            case 153 -> aaaa(-721158671, var9 ^ 761151023);
            case 154 -> aaaa(-721158672, var9 ^ -8065699);
            case 155 -> aaaa(-721158669, var9 ^ 241013084);
            case 156 -> aaaa(-721158670, var9 ^ -2093459081);
            case 157 -> aaaa(-721158667, var9 ^ -152644706);
            case 158 -> aaaa(-721158668, var9 ^ -1219624764);
            case 159 -> aaaa(-721158665, var9 ^ -419907014);
            case 160 -> aaaa(-721158666, var9 ^ 1680912886);
            case 161 -> aaaa(-721158663, var9 ^ 88758952);
            case 162 -> aaaa(-721158664, var9 ^ -1386296369);
            case 163 -> aaaa(-721158661, var9 ^ 428831184);
            case 164 -> aaaa(-721158662, var9 ^ 1416460341);
            case 165 -> aaaa(-721158659, var9 ^ -514655384);
            case 166 -> aaaa(-721158660, var9 ^ 755266833);
            case 167 -> aaaa(-721158657, var9 ^ 354333437);
            case 168 -> aaaa(-721158658, var9 ^ 1968155995);
            case 169 -> aaaa(-721159167, var9 ^ -2044434486);
            case 170 -> aaaa(-721159168, var9 ^ 924320573);
            case 171 -> aaaa(-721159165, var9 ^ -1667024087);
            case 172 -> aaaa(-721159166, var9 ^ -96892823);
            case 173 -> aaaa(-721159163, var9 ^ 64817422);
            case 174 -> aaaa(-721159164, var9 ^ 799221366);
            case 175 -> aaaa(-721159161, var9 ^ -756190717);
            case 176 -> aaaa(-721159162, var9 ^ 1622963231);
            case 177 -> aaaa(-721159159, var9 ^ 1134325300);
            case 178 -> aaaa(-721159160, var9 ^ -2116896035);
            case 179 -> aaaa(-721159157, var9 ^ 1269646035);
            case 180 -> aaaa(-721159158, var9 ^ 2130784011);
            case 181 -> aaaa(-721159155, var9 ^ -772309057);
            case 182 -> aaaa(-721159156, var9 ^ -7528408);
            case 183 -> aaaa(-721159153, var9 ^ -1671642381);
            case 184 -> aaaa(-721159154, var9 ^ -983096511);
            case 185 -> aaaa(-721159151, var9 ^ 1414423782);
            case 186 -> aaaa(-721159152, var9 ^ 1736460318);
            case 187 -> aaaa(-721159149, var9 ^ -904398797);
            case 188 -> aaaa(-721159150, var9 ^ 274678738);
            case 189 -> aaaa(-721159147, var9 ^ 574337550);
            case 190 -> aaaa(-721159148, var9 ^ 327195711);
            case 191 -> aaaa(-721159145, var9 ^ 1798348627);
            case 192 -> aaaa(-721159146, var9 ^ 913761289);
            case 193 -> aaaa(-721159143, var9 ^ -1942225187);
            case 194 -> aaaa(-721159144, var9 ^ -739337488);
            case 195 -> aaaa(-721159141, var9 ^ -326360690);
            case 196 -> 2;
            case 197 -> aaaa(-721159142, var9 ^ -1327954149);
            case 198 -> aaaa(-721159139, var9 ^ -598129120);
            case 199 -> aaaa(-721159140, var9 ^ -548334887);
            case 200 -> aaaa(-721159137, var9 ^ 305383680);
            case 201 -> aaaa(-721159138, var9 ^ 1267114970);
            case 202 -> aaaa(-721159135, var9 ^ -1275973095);
            case 203 -> aaaa(-721159136, var9 ^ -1031133493);
            case 204 -> aaaa(-721159133, var9 ^ -1240053385);
            case 205 -> aaaa(-721159134, var9 ^ 1817805526);
            case 206 -> aaaa(-721159131, var9 ^ 2064569475);
            case 207 -> aaaa(-721159132, var9 ^ 1870109268);
            case 208 -> aaaa(-721159129, var9 ^ 562997969);
            case 209 -> aaaa(-721159130, var9 ^ -1453224699);
            case 210 -> aaaa(-721159127, var9 ^ 536771160);
            case 211 -> aaaa(-721159128, var9 ^ 615436452);
            case 212 -> aaaa(-721159125, var9 ^ 2041066285);
            case 213 -> aaaa(-721159126, var9 ^ -739442389);
            case 214 -> aaaa(-721159123, var9 ^ 382716917);
            case 215 -> aaaa(-721159124, var9 ^ 1481847071);
            case 216 -> aaaa(-721159121, var9 ^ 202827336);
            case 217 -> aaaa(-721159122, var9 ^ -1828962971);
            case 218 -> aaaa(-721159119, var9 ^ 117908769);
            case 219 -> aaaa(-721159120, var9 ^ -2065411060);
            case 220 -> aaaa(-721159117, var9 ^ 1060533146);
            case 221 -> aaaa(-721159118, var9 ^ 1131571735);
            case 222 -> aaaa(-721159115, var9 ^ 1064254129);
            case 223 -> aaaa(-721159116, var9 ^ -490925339);
            case 224 -> aaaa(-721159113, var9 ^ 1501263796);
            case 225 -> aaaa(-721159114, var9 ^ 1420721442);
            case 226 -> aaaa(-721159111, var9 ^ 1130317499);
            case 227 -> aaaa(-721159112, var9 ^ -1816922755);
            case 228 -> aaaa(-721159109, var9 ^ 1997490055);
            case 229 -> aaaa(-721159110, var9 ^ 277770198);
            case 230 -> aaaa(-721159107, var9 ^ 987266106);
            case 231 -> aaaa(-721159108, var9 ^ 334076831);
            case 232 -> aaaa(-721159105, var9 ^ 1647104523);
            case 233 -> aaaa(-721159106, var9 ^ -108618622);
            case 234 -> aaaa(-721159103, var9 ^ 1137405988);
            case 235 -> aaaa(-721159104, var9 ^ 1252507962);
            case 236 -> aaaa(-721159101, var9 ^ -1766564477);
            case 237 -> aaaa(-721159102, var9 ^ -238745657);
            case 238 -> aaaa(-721159099, var9 ^ 706475446);
            case 239 -> aaaa(-721159100, var9 ^ 1125890377);
            case 240 -> aaaa(-721159097, var9 ^ 2073044559);
            case 241 -> aaaa(-721159098, var9 ^ 1053419169);
            case 242 -> 1;
            case 243 -> aaaa(-721159095, var9 ^ 1990757497);
            case 244 -> aaaa(-721159096, var9 ^ -384212415);
            case 245 -> aaaa(-721159093, var9 ^ -2014395959);
            case 246 -> aaaa(-721159094, var9 ^ -378630465);
            case 247 -> aaaa(-721159091, var9 ^ -1120746970);
            case 248 -> aaaa(-721159092, var9 ^ 1661223919);
            case 249 -> aaaa(-721159089, var9 ^ -442888752);
            case 250 -> aaaa(-721159090, var9 ^ 1092797417);
            case 251 -> aaaa(-721159087, var9 ^ -1447298358);
            case 252 -> aaaa(-721159088, var9 ^ -219061657);
            case 253 -> aaaa(-721159085, var9 ^ 811710641);
            case 254 -> aaaa(-721159086, var9 ^ 1691073797);
            default -> aaaa(-721159083, var9 ^ 1447310834);
         };
         int var5 = (var1 & aaaa(-721159084, var9 ^ -1103055906)) - var4;
         if (var5 < 0) {
            var5 += 256;
         }

         int var6 = ((var1 & aaaa(-721159081, var9 ^ -1637816540)) >>> aaaa(-721159082, var9 ^ -125982652)) - var4;
         if (var6 < 0) {
            var6 += 256;
         }

         for (int var7 = 0; var7 < var3.length; var7++) {
            int var8 = var7 % 2;
            char var10002 = var3[var7];
            if (var8 == 0) {
               var3[var7] = (char)(var10002 ^ var5);
               var5 = ((var5 >>> 3 | var5 << 5) ^ var3[var7]) & aaaa(-721159079, var9 ^ 1691067606);
            } else {
               var3[var7] = (char)(var10002 ^ var6);
               var6 = ((var6 >>> 3 | var6 << 5) ^ var3[var7]) & aaaa(-721159080, var9 ^ -1292372563);
            }
         }

         aaa[var2] = new String(var3).intern();
      }

      return aaa[var2];
   }

   private void bb(class_332 param1, boolean param2) {
      // $VF: Couldn't be decompiled
      // Please report this to the Vineflower issue tracker, at https://github.com/Vineflower/vineflower/issues with a copy of the class file (if you have the rights to distribute it!)
      // java.lang.RuntimeException: parsing failure!
      //   at org.jetbrains.java.decompiler.modules.decompiler.decompose.DomHelper.parseGraph(DomHelper.java:211)
      //   at org.jetbrains.java.decompiler.main.rels.MethodProcessor.codeToJava(MethodProcessor.java:166)
      //
      // Bytecode:
      // 00: getstatic qeaa361f143ee4a0894bd168fd9b30c66/qf4ccf8f5435d4a78bdca4d6a018b578e/baaabbaa.bba I
      // 03: istore 3
      // 04: invokestatic net/minecraft/class_310.method_1551 ()Lnet/minecraft/class_310;
      // 07: astore 4
      // 09: aload 1
      // 0a: ifnull 26
      // 0d: aload 4
      // 0f: iload 3
      // 10: ifne 20
      // 13: goto 17
      // 16: athrow
      // 17: ifnull 26
      // 1a: goto 1e
      // 1d: athrow
      // 1e: aload 4
      // 20: getfield net/minecraft/class_310.field_1772 Lnet/minecraft/class_327;
      // 23: ifnonnull 28
      // 26: return
      // 27: athrow
      // 28: aload 0
      // 29: invokevirtual qeaa361f143ee4a0894bd168fd9b30c66/qf4ccf8f5435d4a78bdca4d6a018b578e/aabaabbb.a ()D
      // 2c: dstore 5
      // 2e: aload 0
      // 2f: invokevirtual qeaa361f143ee4a0894bd168fd9b30c66/qf4ccf8f5435d4a78bdca4d6a018b578e/aabaabbb.aabb ()D
      // 32: dstore 7
      // 34: aload 0
      // 35: invokevirtual qeaa361f143ee4a0894bd168fd9b30c66/qf4ccf8f5435d4a78bdca4d6a018b578e/aabaabbb.abb ()D
      // 38: dstore 9
      // 3a: aload 4
      // 3c: getfield net/minecraft/class_310.field_1772 Lnet/minecraft/class_327;
      // 3f: astore 11
      // 41: getstatic qeaa361f143ee4a0894bd168fd9b30c66/qf4ccf8f5435d4a78bdca4d6a018b578e/aabaabbb.aab [Ljava/lang/String;
      // 44: bipush 0
      // 45: aaload
      // 46: invokestatic qeaa361f143ee4a0894bd168fd9b30c66/qf4ccf8f5435d4a78bdca4d6a018b578e/aabbaaaba.abba (Ljava/lang/String;)Ljava/lang/String;
      // 49: astore 12
      // 4b: aload 0
      // 4c: invokevirtual qeaa361f143ee4a0894bd168fd9b30c66/qf4ccf8f5435d4a78bdca4d6a018b578e/aabaabbb.bba ()Ljava/lang/String;
      // 4f: astore 13
      // 51: aload 0
      // 52: aload 11
      // 54: aload 13
      // 56: invokevirtual qeaa361f143ee4a0894bd168fd9b30c66/qf4ccf8f5435d4a78bdca4d6a018b578e/aabaabbb.aaa (Lnet/minecraft/class_327;Ljava/lang/String;)D
      // 59: dstore 14
      // 5b: aload 1
      // 5c: invokestatic qeaa361f143ee4a0894bd168fd9b30c66/qf4ccf8f5435d4a78bdca4d6a018b578e/abbaa.abbaab (Lnet/minecraft/class_332;)V
      // 5f: aload 1
      // 60: dload 7
      // 62: dload 9
      // 64: invokestatic qeaa361f143ee4a0894bd168fd9b30c66/qf4ccf8f5435d4a78bdca4d6a018b578e/abbaa.bb (Lnet/minecraft/class_332;DD)V
      // 67: aload 1
      // 68: dload 5
      // 6a: dload 5
      // 6c: invokestatic qeaa361f143ee4a0894bd168fd9b30c66/qf4ccf8f5435d4a78bdca4d6a018b578e/abbaa.bbbbba (Lnet/minecraft/class_332;DD)V
      // 6f: aload 1
      // 70: getstatic qeaa361f143ee4a0894bd168fd9b30c66/qf4ccf8f5435d4a78bdca4d6a018b578e/aabaabbb.aa Lqeaa361f143ee4a0894bd168fd9b30c66/qf4ccf8f5435d4a78bdca4d6a018b578e/bbabbab;
      // 73: dconst_0
      // 74: dconst_0
      // 75: dload 14
      // 77: ldc2_w 18.0
      // 7a: iload 2
      // 7b: invokestatic qeaa361f143ee4a0894bd168fd9b30c66/qf4ccf8f5435d4a78bdca4d6a018b578e/bbbbbaa.babb (Lnet/minecraft/class_332;Lqeaa361f143ee4a0894bd168fd9b30c66/qf4ccf8f5435d4a78bdca4d6a018b578e/bbabbab;DDDDZ)V
      // 7e: ldc2_w 7.0
      // 81: dstore 16
      // 83: dload 16
      // 85: aload 11
      // 87: aload 12
      // 89: invokestatic qeaa361f143ee4a0894bd168fd9b30c66/qf4ccf8f5435d4a78bdca4d6a018b578e/abbaa.baabba (Lnet/minecraft/class_327;Ljava/lang/String;)I
      // 8c: i2d
      // 8d: dadd
      // 8e: ldc2_w 4.0
      // 91: dadd
      // 92: dstore 18
      // 94: ldc2_w 18.0
      // 97: aload 11
      // 99: invokestatic java/util/Objects.requireNonNull (Ljava/lang/Object;)Ljava/lang/Object;
      // 9c: pop
      // 9d: ldc2_w 9.0
      // a0: dsub
      // a1: ldc2_w 0.5
      // a4: dmul
      // a5: dstore 20
      // a7: bipush 1
      // a8: invokestatic java/lang/Boolean.valueOf (Z)Ljava/lang/Boolean;
      // ab: aload 1
      // ac: aload 11
      // ae: aload 12
      // b0: dload 16
      // b2: dload 20
      // b4: invokedynamic run (Lnet/minecraft/class_332;Lnet/minecraft/class_327;Ljava/lang/String;DD)Ljava/lang/Runnable; bsm=java/lang/invoke/LambdaMetafactory.metafactory (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;Ljava/lang/invoke/MethodType;Ljava/lang/invoke/MethodHandle;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[ ()V, qeaa361f143ee4a0894bd168fd9b30c66/qf4ccf8f5435d4a78bdca4d6a018b578e/aabaabbb.b (Lnet/minecraft/class_332;Lnet/minecraft/class_327;Ljava/lang/String;DD)V, ()V ]
      // b9: invokestatic qeaa361f143ee4a0894bd168fd9b30c66/qf4ccf8f5435d4a78bdca4d6a018b578e/abbaa.bbaaba (Ljava/lang/Boolean;Ljava/lang/Runnable;)V
      // bc: aload 1
      // bd: aload 11
      // bf: aload 13
      // c1: dload 18
      // c3: dload 20
      // c5: ldc_w -721159077
      // c8: ldc_w -1289932041
      // cb: ldc_w -1017712149
      // ce: ixor
      // cf: invokestatic qeaa361f143ee4a0894bd168fd9b30c66/qf4ccf8f5435d4a78bdca4d6a018b578e/aabaabbb.aaaa (II)I
      // d2: ldc2_w 2037591703955978842
      // d5: invokestatic qeaa361f143ee4a0894bd168fd9b30c66/qf4ccf8f5435d4a78bdca4d6a018b578e/aabaabbb.aab (IJ)I
      // d8: invokestatic qeaa361f143ee4a0894bd168fd9b30c66/qf4ccf8f5435d4a78bdca4d6a018b578e/bbbbbaa.baa (I)I
      // db: invokestatic qeaa361f143ee4a0894bd168fd9b30c66/qf4ccf8f5435d4a78bdca4d6a018b578e/abbaa.b (Lnet/minecraft/class_332;Lnet/minecraft/class_327;Ljava/lang/String;DDI)V
      // de: aload 1
      // df: invokestatic qeaa361f143ee4a0894bd168fd9b30c66/qf4ccf8f5435d4a78bdca4d6a018b578e/abbaa.ababbb (Lnet/minecraft/class_332;)V
      // e2: goto ee
      // e5: astore 22
      // e7: aload 1
      // e8: invokestatic qeaa361f143ee4a0894bd168fd9b30c66/qf4ccf8f5435d4a78bdca4d6a018b578e/abbaa.ababbb (Lnet/minecraft/class_332;)V
      // eb: aload 22
      // ed: athrow
      // ee: return
   }

   private double aaa(class_327 var1, String var2) {
      return 14.0
         + abbaa.baabba(var1, aabbaaaba.abba(aab[0]))
         + 4.0
         + abbaa.baabba(var1, var2);
   }

   @Override
   public double aabb() {
      return (Double)this.aaab.abbb();
   }

   private static int aab(int var0, long var1) {
      int var3 = var0 ^ (int)(var1 & 32767L) ^ aaaa(-721159078, -1802719682 ^ 446317945);
      if (aaaa[var3] == null) {
         aaaa[var3] = (int)(baa[var3] ^ var1);
      }

      return aaaa[var3];
   }

   private static void b(class_332 var0, class_327 var1, String var2, double var3, double var5) {
      abbaa.b(
         var0, var1, var2, var3, var5, bbbbbaa.baa(aab(aaaa(-721159075, 1565909358 ^ -768858568), 1204416497563169461L))
      );
   }

   @Override
   public boolean abba(double param1, double param3) {
      // $VF: Couldn't be decompiled
      // Please report this to the Vineflower issue tracker, at https://github.com/Vineflower/vineflower/issues with a copy of the class file (if you have the rights to distribute it!)
      // java.lang.RuntimeException: parsing failure!
      //   at org.jetbrains.java.decompiler.modules.decompiler.decompose.DomHelper.parseGraph(DomHelper.java:211)
      //   at org.jetbrains.java.decompiler.main.rels.MethodProcessor.codeToJava(MethodProcessor.java:166)
      //
      // Bytecode:
      // 00: getstatic qeaa361f143ee4a0894bd168fd9b30c66/qf4ccf8f5435d4a78bdca4d6a018b578e/baaabbaa.bba I
      // 03: istore 5
      // 05: dload 1
      // 06: aload 0
      // 07: invokevirtual qeaa361f143ee4a0894bd168fd9b30c66/qf4ccf8f5435d4a78bdca4d6a018b578e/aabaabbb.aabb ()D
      // 0a: iload 5
      // 0c: ifne 2e
      // 0f: dcmpl
      // 10: iflt 67
      // 13: goto 17
      // 16: athrow
      // 17: dload 1
      // 18: iload 5
      // 1a: ifne 37
      // 1d: goto 21
      // 20: athrow
      // 21: aload 0
      // 22: invokevirtual qeaa361f143ee4a0894bd168fd9b30c66/qf4ccf8f5435d4a78bdca4d6a018b578e/aabaabbb.aabb ()D
      // 25: aload 0
      // 26: invokevirtual qeaa361f143ee4a0894bd168fd9b30c66/qf4ccf8f5435d4a78bdca4d6a018b578e/aabaabbb.aaaaa ()D
      // 29: dadd
      // 2a: goto 2e
      // 2d: athrow
      // 2e: dcmpg
      // 2f: ifgt 67
      // 32: dload 3
      // 33: goto 37
      // 36: athrow
      // 37: aload 0
      // 38: invokevirtual qeaa361f143ee4a0894bd168fd9b30c66/qf4ccf8f5435d4a78bdca4d6a018b578e/aabaabbb.abb ()D
      // 3b: iload 5
      // 3d: ifne 56
      // 40: dcmpl
      // 41: iflt 67
      // 44: goto 48
      // 47: athrow
      // 48: dload 3
      // 49: aload 0
      // 4a: invokevirtual qeaa361f143ee4a0894bd168fd9b30c66/qf4ccf8f5435d4a78bdca4d6a018b578e/aabaabbb.abb ()D
      // 4d: aload 0
      // 4e: invokevirtual qeaa361f143ee4a0894bd168fd9b30c66/qf4ccf8f5435d4a78bdca4d6a018b578e/aabaabbb.baab ()D
      // 51: dadd
      // 52: goto 56
      // 55: athrow
      // 56: dcmpg
      // 57: iload 5
      // 59: ifne 64
      // 5c: ifgt 67
      // 5f: goto 63
      // 62: athrow
      // 63: bipush 1
      // 64: goto 68
      // 67: bipush 0
      // 68: ireturn
   }

   private static String aba(char[] var0, long var1, int var3) {
      int var4 = aab(aaaa(-721159076, 961311931 ^ -792695245), 7184328209003987517L) ^ var3;

      for (int var5 = 0; var5 < var0.length; var5++) {
         int var7 = var4 ^ (int)var1 ^ ~var5;
         int var8 = var7 ^ var3 - var5 * var0.length;
         var4 = -var8 * var3 | var5;
         var0[var5] = (char)(var0[var5] ^ var4);
         int var6 = var5 & aab(aaaa(-721159073, 961311931 ^ -1523856789), 4864209723781928100L);
         var3 = var3 << var6 | var3 >>> -var6;
         var1 ^= var6;
      }

      return new String(var0);
   }

   @Override
   public void bbb(class_332 var1, int var2, int var3, float var4, boolean var5) {
      this.bb(var1, var5);
   }

   @Override
   public void aabbb(class_332 var1, int var2, int var3, float var4) {
      this.bb(var1, false);
   }

   private double a() {
      return (Double)this.aba.abbb() / 100.0;
   }

   private String bba() {
      return String.valueOf(class_310.method_1551().method_47599());
   }

   @Override
   public void bab(class_332 var1, int var2, int var3, float var4) {
      this.bb(var1, false);
   }

   @Override
   public double baab() {
      return 18.0 * this.a();
   }

   @Override
   public double abb() {
      return (Double)this.bb.abbb();
   }

   // $VF: Irreducible bytecode was duplicated to produce valid code
   static {
      int var33 = 1788452393;
      int var27 = 0;
      String[] var10001 = new String[10];
      int var26 = 0;
      String[] var25 = var10001;
      int var24 = "U햕䍥\uf5d3䉭릏淐ⱬ뷱₻✽ಁ̀볱徂\uf794卺\uaaff妠弖媫ﻛ繙\ue925\ud943朁剉\uda4e㪸\ue5b7嘲㍡浥숒뾏鿹틖ᝐ뷸媓\ue411䓆✩굂迤㺩㷖亁\uf098窗슳ꃭŎ藁羛ꁄ\ue3de㟝\u20f4㪥쵆䴘\ue1adⶃ\uf01a\ud9e7薇搮᭧ﳉ밽尛\udbbc늺薑甋藢亝\uedc8벌掀尋非Ｄ澿ꢨ\t꿖衺㚈\uf5db汫⮙籋✏뱥x\udeca굋\udfd1\ued96\ud85d淆\udcaaⴏ\ud925궣\ud99dⷑ\udb4eⴵ\uda95귓\udf8dⶎ\udafe\ued57\udf29귒\udae5\ueda0\ud966浗\ud969귎\udfe1ⷘ\ud916浿\uda85ⶉ\uded1\ueda4\udf16\u2d7a\udf05ⶵ\ud8d5궉\ud9fa洃\ud915궷\ud93d\ueddb\ude1a\ued51\ud85d涥\udf99귃\udab2\ued78\udfcd涌\ude5d\uedb2\ud9f2\u2d7d\udced淀\udaf9궏\udf76괰\udcb1궤\ud931淋\udf0aⴆ\ud84d涸\ude61ⶦ\ud916굢\ude21ⷐ\ud91d\uedef\uda8aⴰ\udec5涌\ud959\ueddf\ude5aⵯ\udf25\uedd3\ud95d\ued8c\ud806\u2d7a\ud91d궯\udb51귒\udcfeⴘ\ud9f9淕\udfcd淔\uda92굕\ude6d궾\ud909淂\ud922굥\ud80d귝\udb45\u2dbf\n鄉姭酦\ud96f鍚饳遹\ud9ca铞\ud968\u0010☿\uf28cⅤ㉫⅌父⢇\uf29a \uf208⅄爰⛟㊈⇘㈴\n㦮⍧㤁ꎡ㡽\ue3c1㠞ꍸ㠹ꎢ0킧ﰧ찼糲출㲅찳糀쳘籪최㱴캳㲶차簜킼﵎숧ﰾ태박캸ﲟ챏ﳞ쉔㳴춘벖쉣ﰬ탸簒술㰏촣뷶숌ﳦ췰㱿쵧㳇쳌ﳺ췌ﲂ\n胨䬋뽇쯱봻讕봘쬬봿쯾\u0010\ue83c丁\ue807컐\uee63仓\uea88丏\ue81f躼\ue91b躴\ueaf0一\uef3b캸\nꔋ窭ꕤ絛Ꝙ먳ꑻ慠\ua8dc直"
         .length();
      String var23 = "U햕䍥\uf5d3䉭릏淐ⱬ뷱₻✽ಁ̀볱徂\uf794卺\uaaff妠弖媫ﻛ繙\ue925\ud943朁剉\uda4e㪸\ue5b7嘲㍡浥숒뾏鿹틖ᝐ뷸媓\ue411䓆✩굂迤㺩㷖亁\uf098窗슳ꃭŎ藁羛ꁄ\ue3de㟝\u20f4㪥쵆䴘\ue1adⶃ\uf01a\ud9e7薇搮᭧ﳉ밽尛\udbbc늺薑甋藢亝\uedc8벌掀尋非Ｄ澿ꢨ\t꿖衺㚈\uf5db汫⮙籋✏뱥x\udeca굋\udfd1\ued96\ud85d淆\udcaaⴏ\ud925궣\ud99dⷑ\udb4eⴵ\uda95귓\udf8dⶎ\udafe\ued57\udf29귒\udae5\ueda0\ud966浗\ud969귎\udfe1ⷘ\ud916浿\uda85ⶉ\uded1\ueda4\udf16\u2d7a\udf05ⶵ\ud8d5궉\ud9fa洃\ud915궷\ud93d\ueddb\ude1a\ued51\ud85d涥\udf99귃\udab2\ued78\udfcd涌\ude5d\uedb2\ud9f2\u2d7d\udced淀\udaf9궏\udf76괰\udcb1궤\ud931淋\udf0aⴆ\ud84d涸\ude61ⶦ\ud916굢\ude21ⷐ\ud91d\uedef\uda8aⴰ\udec5涌\ud959\ueddf\ude5aⵯ\udf25\uedd3\ud95d\ued8c\ud806\u2d7a\ud91d궯\udb51귒\udcfeⴘ\ud9f9淕\udfcd淔\uda92굕\ude6d궾\ud909淂\ud922굥\ud80d귝\udb45\u2dbf\n鄉姭酦\ud96f鍚饳遹\ud9ca铞\ud968\u0010☿\uf28cⅤ㉫⅌父⢇\uf29a \uf208⅄爰⛟㊈⇘㈴\n㦮⍧㤁ꎡ㡽\ue3c1㠞ꍸ㠹ꎢ0킧ﰧ찼糲출㲅찳糀쳘籪최㱴캳㲶차簜킼﵎숧ﰾ태박캸ﲟ챏ﳞ쉔㳴춘벖쉣ﰬ탸簒술㰏촣뷶숌ﳦ췰㱿쵧㳇쳌ﳺ췌ﲂ\n胨䬋뽇쯱봻讕봘쬬봿쯾\u0010\ue83c丁\ue807컐\uee63仓\uea88丏\ue81f躼\ue91b躴\ueaf0一\uef3b캸\nꔋ窭ꕤ絛Ꝙ먳ꑻ慠\ua8dc直";
      short var28 = 19265;

      do {
         int var31 = 0;
         char var29 = var23.charAt(var27);
         char[] var30 = var23.substring(var27 + 1, var27 + 1 + var29).toCharArray();

         do {
            int var32 = var30[var31];

            var32 = (char)(switch (var31 % 6) {
               default -> 196;
               case 1 -> 242;
               case 2 -> 195;
               case 3 -> 46;
               case 4 -> 211;
               case 5 -> 75;
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

      aabb = var25;
      abaa = new Object[var25.length];
      aaba = new int[353];
      byte var39 = 0;
      byte var48 = 0;
      byte[] var10002 = "\u0016\u0092óL¦02ÈL\u001d}¡\u0093\u0018\u008dbB»5\u0088k\u000fI\u000bP\u0099¬0Òpp¥bcë'öµKu\u007fÆÒ;ÉÒûg×¶ËâÊfb\u0081¨á¯\u009bÐ\u000etù÷_±;AP\u00adh\f\u000fÔ]â\u000f½;\u0093´¹Bà°Û+Ù\u0082vz\u0094P7kxè\u0090c\u001aµumZ|©q¨ÁjÅ±Ì5!\u008eÅ\u001a÷\u0011:ð~0?{þaª \u0001\u0015.÷Ð|ì²-ñÛòáµF2µ\b\",>Ôx©\u0005\tE\u001fþ\u001bþ4a\u0093\u009a\u0016hzrÒp¯áÊpEÀ\u0081i$Àq\u0081~Ã_`Z\u008c\u0088\u008bñ\u0087öºÉd~ï#C#¹Îã\u008e$§°\u0006$<º,Jè\u0016Q\u0092\bÊõ¸'ê\u000bå>È \u0010Æ©\u0017\u0088aqã\u0095]0</ÈCÑ¾\u0095¨Áï\u0090»M \u0006i\u0018ÏÔÚnÌQÇkëÑQê±]ð}\u0080ÖY\u0088\u0085Â¿p\u0083p@§&\r\u0019\u007f\u000fá=\u0084Q!)\u009f\u0098#R\u0080oäN\u0010´\u0092·Û\u0016\u0088ü\u0096ÙMâº> :*\b\u0086,ÎÓ `{a,Ã\u009d\u0090\u0096ß-\u0018î«§ñ\u00ad\u001câÙí¾\u0095Ñö²·2<¹\u0087ìôãA¦$t@[ÒRçÿ\u0018?\u0097\u0090`x\u0016ß)û2ÿp\u0018ùj\u0097AjgiÌîÊ×Ù³ý\u00910O\u0098Ï«\u0098bkÛ\u0089y±xøÍ®ÛÏ\u000fÀmþ\u0014\u0001¨\u0001\u0098îÊ\u0014¡4\u001bòfÇÜî_h½¸\u000f\u0099\u0094?S\u0015ô\u0003WÚº[?¦\u0007ñ\u0001îÝÎ\u008f\u0081\u008f\u0003)¤/cGvÅÅâ4C\u000b³\u00977ï:ùãô\u009eo\u0081oÜ\u001a\u001cCªq\fÇ\u009fúñp\u0013q\u0094¥º¹(a\u0085Tù*;UîÈ5VÖÊ\\Ä\u007fÑýÙ®ÎÒ\u0017Xw\u001e\u0012L\u0006®\u0013\u009eÒ/ÿqw\u001d=°0ÛÕ\u0092C\"ãJ½\u008dÛÿ[|·â\\âïu\u009fx3¡\u0080âN\nÄq\u00ad$å\u000f\u0081ÙOLyÀ\u0094ä\f\u001e·Ðø\u008f\u0004\u0086ô{\u008eÚ\u001b\u0018jË\u009a·VÌLÂÛÝçÊÚÐ\u001b\u000b¯\u008aR\u007fÒä\u008d¢·8Ð\u0085\u00925~l\u0081ï©Í®ZP«bEuF\u0099\u008f=\u0003\u0013\u0013\u0015¥ZªWVvè±\u0019i\u009caÄÒ\u008co\u008eNU3´qe\u0097R\u008a²\u009cR\u001d\u0015\t\u008föý>>^4ºÑ*ð9i2\u0090ì\u00925\u009dÊß&Ôeèù;Rt+æc\u008a®\u009a[\u009cºf\u0082\u008c\u007f¹\u0007Ò]L\u0017ÎHA¡ì&\u0004òW\u000fVÌÓàÒ\u00ad|¥\u0011\\\u007fâl\u000f:\u0088¨t¾¸x\u001bw+\u0007wKQV\t×\u0019\u001apÑ\bo!¯¹ºF3\u009c\u008b\u008a)Áf\u0089}Ê\u0092t¸=¸ók\u008ck\u0083·£ÿtñlû²`\u0088Tf9RR\u0080=E_Ç7\u001bÈÿ\u0015\b\u0086Ú¦0ÐÍ\u0082\u0082\u0000my\u001bZ¶ÿü\u0000êw8\u0006?\u0087¿\u0017P\u0016;Q\tõPæ½\b%l\u000e\u0019¤\u000b}æ\r¾;\r|ë/ã\u0010ì\u009f6é\f\u0011ª#òI¥<¦a×6¤\u001df)I\u0089\u0090GØ\u0084¾Þ3¨}³9tJà\u000eÄ¦`ß\u0086\u0087¸\u0015®\u0084$DÕ äXÐº\u008ff\u0015ªª\u0088?;\u0088\u009bx\u009eøm¿t\u0011¹wÓUe¥\t\u0086\u001bTÐû\u0086Ùµ27¬k¸ûíÃj)¼uÐ¡>½Ûn_Ç0_÷Ó ºC\u0002\u001aË\u000eà\u0012©»ß\u0090\u007fw\u0089\u001f)O\u0093Ø\u0010/ÂÇoÜ©\r,m\u0095iÐÆ.QÆ ´ã\bYPbÃu.LÈ\u0088`\u0019.:1\u001f;\u0019\u0011\u0005kÛ_Ðk\u0011 (1%\u008cE®\u008bz\u0015\u000b¥\u0000K~ÆÑ©\u0097\u009fêIÈ\u000eÃ\u000f¾=\r#n\u0090\u009a\u0093\bJÒ(áx¶ØÃI\rö\u00861½ôslû\u008e÷Ö¶\u0095\u0088\u0089cñ\u0087¶\u0001JñêTl1\u0086Ô-9\u0085ÜxnH¾¢4\u0011\u000bÈÂé\u007fXé\u0098\u0007Mëì\u009b#ð6Ôè~!\u0083¿Á5úð\u0096{\u0003ÁíóìæàEs\u0011\"~#»A#%X\u001b\u0089`j7LB \u0096\u0002ÞZsV\u009b\u008dUÈqW\u0096]\u008aN\u000eÞi>Ée»\u0018Ì\u0019ÿ\u0000\u008feâQ\u0098¸0y\u001d\u0003ö\u001c¥\u000e#\u0016J\u0019Ò-òÉ>\u009fñ-\u0082-SJ\u0003\u0004¹`U\u0017\u0004IdðÂ8¡¹í£\u000b÷Ë\u0019F\u001a\u0091\u0010*«ÂÌ97a«HlÀp\u0096\u009fB\u0019\u0096ÒÈ!\u001dMrdD\u008cX,%æÉ³\u0094\tKÝcªö³ãååç¿©R9\u0089(é¿\u0017fÃ\u001b¯¨\u0080ó6\u0091Ä¨|\t\njìÒK>FÖ*\fÉ^ÕäÍØ³ÄîÕJ¢ðÂâ>FÏ¶èz\u009eÌu\u0013\u0086µ\u008bN\u0084Ù\u008a!u\\ìÔ·\n\u0099?îèÊ\u00963Çëñ\u0084n"
         .getBytes("ISO-8859-1");

      int var99;
      do {
         aaba[var39] = ((var10002[var48] & 255) << 24 | (var10002[var48 + 1] & 255) << 16 | (var10002[var48 + 2] & 255) << 8 | var10002[var48 + 3] & 255)
            ^ -799352398;
         var39 += 1;
         var99 = var48 + 4;
         var48 += 4;
      } while (var99 < var10002.length);

      String[] var21 = new String[aaaa(-721158875, var33 ^ -628635982)];
      int var19 = 0;
      String var18;
      int var20 = (var18 = aaab(var33 ^ -848058118, 20781, '垯')).length();
      int var17 = aaaa(-721158876, var33 ^ 1742985272);
      int var37 = -1;

      label141:
      while (true) {
         String var40 = var18.substring(++var37, var37 + var17);
         byte var51 = -1;

         while (true) {
            label136: {
               char[] var53 = var40.toCharArray();
               var99 = var53.length;
               int var22 = 0;
               var78 = var53;
               int var56 = var99;
               char[] var103;
               int var125;
               if (var99 <= 1) {
                  var103 = var53;
                  var125 = var22;
               } else {
                  var78 = var53;
                  var56 = var99;
                  if (var99 <= var22) {
                     break label136;
                  }

                  var103 = var53;
                  var125 = var22;
               }

               while (true) {
                  var103[var125] = (char)(var103[var125] ^ switch (var22 % aaaa(-721158874, var33 ^ 1719987195)) {
                     case 0 -> aaaa(-721158871, var33 ^ 1950335092);
                     case 1 -> aaaa(-721158872, var33 ^ -61087173);
                     case 2 -> aaaa(-721158869, var33 ^ 364062212);
                     case 3 -> aaaa(-721158870, var33 ^ -1071628675);
                     case 4 -> aaaa(-721158867, var33 ^ 704738674);
                     case 5 -> aaaa(-721158868, var33 ^ 1258390932);
                     default -> aaaa(-721158865, var33 ^ 285387559);
                  });
                  var22++;
                  if (var56 == 0) {
                     var125 = var56;
                     var103 = var78;
                  } else {
                     if (var56 <= var22) {
                        break;
                     }

                     var103 = var78;
                     var125 = var22;
                  }
               }
            }

            String var110 = new String(var78).intern();
            switch (var51) {
               case 0:
                  var21[var19++] = var110;
                  if ((var37 += var17) >= var20) {
                     bba = var21;
                     aaa = new String[aaaa(-721158873, var33 ^ -1145479936)];
                     long var8 = 729464066383285387L;
                     long[] var14 = new long[aaaa(-721158866, var33 ^ 894270716)];
                     int var11 = 0;
                     String var12;
                     int var13 = (var12 = aaab(var33 ^ 1961876427, 3892, '垭')).length();
                     byte var10 = 0;

                     label115:
                     while (true) {
                        byte var60 = var10;
                        var10 += 8;
                        String var42 = var12.substring(var60, var10);
                        int var61 = var33 ^ 71207058;
                        short var84 = 18796;
                        short var111 = 22444;
                        byte[] var15 = var42.getBytes("ISO-8859-1");
                        long[] var43 = var14;
                        int var62 = var11++;
                        long var85 = (var15[0] & 255L) << aaaa(-721158863, var33 ^ -1639578951)
                           | (var15[1] & 255L) << aaaa(-721158864, var33 ^ -1499100443)
                           | (var15[2] & 255L) << aaaa(-721158861, var33 ^ 1283643272)
                           | (var15[3] & 255L) << aaaa(-721158862, var33 ^ -1591576036)
                           | (var15[4] & 255L) << aaaa(-721158859, var33 ^ -932056509)
                           | (var15[5] & 255L) << aaaa(-721158860, var33 ^ 1400625188)
                           | (var15[aaaa(-721158857, var33 ^ -2015910519)] & 255L) << aaaa(-721158858, var33 ^ 1728774572)
                           | var15[aaaa(-721158855, var33 ^ 1210843135)] & 255L;
                        short var112 = -1;

                        while (true) {
                           long var127 = var85 ^ var8;
                           switch (var112) {
                              case 0:
                                 var43[var62] = var127;
                                 if (var10 >= var13) {
                                    baa = var14;
                                    aaaa = new Integer[aaaa(-721158845, var33 ^ 1040621553)];
                                    long var0 = 6702957539957912332L;
                                    long[] var6 = new long[aaaa(-721158846, var33 ^ -1097851183)];
                                    int var3 = 0;
                                    String var4;
                                    int var5 = (var4 = aaab(var33 ^ 164864267, 4576, '垩')).length();
                                    byte var2 = 0;

                                    label105:
                                    while (true) {
                                       byte var65 = var2;
                                       var2 += 8;
                                       String var45 = var4.substring(var65, var2);
                                       int var66 = var33 ^ 469205736;
                                       char var88 = 'ￍ';
                                       var112 = 22440;
                                       byte[] var7 = var45.getBytes("ISO-8859-1");
                                       long[] var46 = var6;
                                       int var67 = var3++;
                                       long var89 = (var7[0] & 255L) << aaaa(-721158843, var33 ^ 842107383)
                                          | (var7[1] & 255L) << aaaa(-721158844, var33 ^ -1181188869)
                                          | (var7[2] & 255L) << aaaa(-721158841, var33 ^ -1384217402)
                                          | (var7[3] & 255L) << aaaa(-721158842, var33 ^ 528569194)
                                          | (var7[4] & 255L) << aaaa(-721158839, var33 ^ 1658358548)
                                          | (var7[5] & 255L) << aaaa(-721158840, var33 ^ -1896058813)
                                          | (var7[aaaa(-721158837, var33 ^ 1323854847)] & 255L) << aaaa(-721158838, var33 ^ 1284731911)
                                          | var7[aaaa(-721158835, var33 ^ -1953504038)] & 255L;
                                       short var116 = -1;

                                       while (true) {
                                          var127 = var89 ^ var0;
                                          switch (var116) {
                                             case 0:
                                                var46[var67] = var127;
                                                if (var2 >= var5) {
                                                   abb = var6;
                                                   ab = new Long[aaaa(-721158825, var33 ^ -1025698132)];
                                                   aab = new String[aab(aaaa(-721158826, var33 ^ -2105579321), 11213473381286565L)];
                                                   aa();
                                                   aa = bbabbab.bba;
                                                   return;
                                                }
                                                break;
                                             default:
                                                var46[var67] = var127;
                                                if (var2 < var5) {
                                                   continue label105;
                                                }

                                                var5 = (var4 = aaab(var33 ^ 1447148806, 47443, '垧')).length();
                                                var2 = 0;
                                          }

                                          byte var68 = var2;
                                          var2 += 8;
                                          String var47 = var4.substring(var68, var2);
                                          int var69 = var33 ^ -104925912;
                                          char var91 = '\udbec';
                                          var116 = 22438;
                                          var7 = var47.getBytes("ISO-8859-1");
                                          var46 = var6;
                                          var67 = var3++;
                                          var89 = (var7[0] & 255L) << aaaa(-721158836, var33 ^ -42586264)
                                             | (var7[1] & 255L) << aaaa(-721158833, var33 ^ -415407444)
                                             | (var7[2] & 255L) << aaaa(-721158834, var33 ^ 572739186)
                                             | (var7[3] & 255L) << aaaa(-721158831, var33 ^ -805577133)
                                             | (var7[4] & 255L) << aaaa(-721158832, var33 ^ -370328879)
                                             | (var7[5] & 255L) << aaaa(-721158829, var33 ^ -811495576)
                                             | (var7[aaaa(-721158830, var33 ^ 1124231662)] & 255L) << aaaa(-721158827, var33 ^ -115418769)
                                             | var7[aaaa(-721158828, var33 ^ -2123738234)] & 255L;
                                          var116 = 0;
                                       }
                                    }
                                 }
                                 break;
                              default:
                                 var43[var62] = var127;
                                 if (var10 < var13) {
                                    continue label115;
                                 }

                                 var13 = (var12 = aaab(var33 ^ 170887065, 51991, '垫')).length();
                                 var10 = 0;
                           }

                           byte var63 = var10;
                           var10 += 8;
                           String var44 = var12.substring(var63, var10);
                           int var64 = var33 ^ 768526340;
                           short var87 = 11941;
                           var112 = 22442;
                           var15 = var44.getBytes("ISO-8859-1");
                           var43 = var14;
                           var62 = var11++;
                           var85 = (var15[0] & 255L) << aaaa(-721158856, var33 ^ 1359565850)
                              | (var15[1] & 255L) << aaaa(-721158853, var33 ^ -1452743799)
                              | (var15[2] & 255L) << aaaa(-721158854, var33 ^ 246421421)
                              | (var15[3] & 255L) << aaaa(-721158851, var33 ^ 854706200)
                              | (var15[4] & 255L) << aaaa(-721158852, var33 ^ -1484642864)
                              | (var15[5] & 255L) << aaaa(-721158849, var33 ^ -93768310)
                              | (var15[aaaa(-721158850, var33 ^ -8734414)] & 255L) << aaaa(-721158847, var33 ^ 1772678316)
                              | var15[aaaa(-721158848, var33 ^ -1155818833)] & 255L;
                           var112 = 0;
                        }
                     }
                  }

                  var17 = var18.charAt(var37);
                  break;
               default:
                  var21[var19++] = var110;
                  if ((var37 += var17) < var20) {
                     var17 = var18.charAt(var37);
                     continue label141;
                  }

                  var20 = (var18 = aaab(var33 ^ -1389514685, 23935, '垮')).length();
                  var17 = 4;
                  var37 = -1;
            }

            var40 = var18.substring(++var37, var37 + var17);
            var51 = 0;
         }
      }
   }

   @Override
   public void abbb(double var1, double var3) {
      this.aaab.aaa(Math.max(0.0, var1));
      this.bb.aaa(Math.max(0.0, var3));
   }

   private static String aaab(int var0, int var1, char var2) {
      int var3 = var2 ^ 22447;
      char[] var4 = aabb[var3].toCharArray();
      StackTraceElement[] var5 = (StackTraceElement[])abaa[var3];
      StackTraceElement[] var6;
      if (var5 != null) {
         var6 = var5;
      } else {
         var6 = new Throwable().getStackTrace();
         abaa[var3] = var6;
      }

      StackTraceElement var7 = var6[1];
      int var8 = (var7.getClassName().hashCode() ^ var7.getMethodName().hashCode()) >> 16 ^ 2831;
      int var9 = 0;

      do {
         int var10 = var4[var9] ^ '\uf35e';
         var10 -= 3097;
         var10 ^= 36200;
         var10 += 9571;
         var4[var9] = (char)(var10 ^ var8 ^ var1 ^ var0 >> 16);
      } while (++var9 < var4.length);

      return new String(var4).intern();
   }

   public aabaabbb() {
      super(
         aabbaaaba.aaab(aab[1]),
         bbaabbba.ba,
         aabbaaaba.aaab(aab[5])
      );
      this.aaab = (bababa)this.abbbaaa(
         new bababa(aabbaaaba.aaab(aab[2]), 18.0, 0.0, 4000.0, 1.0)
            .bb(aabbaaaba.abba(aab[3]))
      );
      this.bb = (bababa)this.abbbaaa(
         new bababa(aabbaaaba.aaab(aab[4]), 72.0, 0.0, 4000.0, 1.0)
            .bb(aabbaaaba.abba(aab[3]))
      );
      this.aba = (bababa)this.abbbaaa(
         new bababa(
               aabbaaaba.aaab(aab[aab(aaaa(-721159074, 1997794423 ^ -1193447138), 1937185741502402397L)]),
               100.0,
               75.0,
               200.0,
               5.0
            )
            .bb(aabbaaaba.abba(aab[aab(aaaa(-721159071, 1997794423 ^ -1715852352), 6243339159053509787L)]))
      );
   }
}
