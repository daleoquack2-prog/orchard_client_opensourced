package nsc;

import net.fabricmc.api.EnvType;
import net.fabricmc.api.Environment;

@Environment(EnvType.CLIENT)
public enum aaaaab {
   private static final String[] aa;
   private static final Integer[] ab;
   private static final long[] ba;
   private static String[] bb;
   private static final long[] b;
   private static final aaaaab[] aaa;
   private static final String[] a;
   private static final Long[] aab;
   private static final Object[] bba;
   public static final aaaaab aba;
   private static final int[] baa;
   public static final aaaaab abb;
   private static final String[] bab;

   private static int b(int var0, int var1) {
      int var2 = baa[var0 ^ -91374565] ^ var1 ^ var0;
      var2 -= 15840;
      var2 ^= 61398;
      var2 -= 61634;
      var2 ^= 16682;
      var2 -= 37931;
      var2 -= 17283;
      var2 += 65166;
      var2 -= 7484;
      return var2 + 56928;
   }

   private static String aba(int var0, int var1) {
      int var3 = var0 ^ -698265447;
      char[] var4 = bab[var3].toCharArray();
      StackTraceElement[] var2 = (StackTraceElement[])bba[var3];
      StackTraceElement[] var5;
      if (var2 != null) {
         var5 = var2;
      } else {
         var5 = new Throwable().getStackTrace();
         bba[var3] = var5;
      }

      StackTraceElement var6 = var5[1];
      int var7 = (var6.getClassName().hashCode() ^ var6.getMethodName().hashCode()) >> 16 ^ 97620442;
      int var8 = 0;

      do {
         var4[var8] = (char)(var4[var8] ^ switch (var8 & 31) {
            default -> 153;
            case 1 -> 117;
            case 2 -> 175;
            case 3 -> 101;
            case 4 -> 237;
            case 5 -> 57;
            case 6 -> 110;
            case 7 -> 215;
            case 8 -> 68;
            case 9 -> 251;
            case 10 -> 70;
            case 11 -> 169;
            case 12 -> 181;
            case 13 -> 23;
            case 14 -> 217;
            case 15 -> 3;
            case 16 -> 83;
            case 17 -> 131;
            case 18 -> 50;
            case 19 -> 245;
            case 20 -> 30;
            case 21 -> 242;
            case 22 -> 113;
            case 23 -> 188;
            case 24 -> 69;
            case 25 -> 130;
            case 26 -> 170;
            case 27 -> 31;
            case 28 -> 52;
            case 29 -> 52;
            case 30 -> 60;
            case 31 -> 5;
         } ^ var1 >> 16 ^ var7);
      } while (++var8 < var4.length);

      return new String(var4).intern();
   }

   private static int aa(int var0, long var1) {
      int var3 = var0 ^ (int)(var1 & 32767L) ^ b(-91374565, 1819338609 ^ 1776723774);
      if (ab[var3] == null) {
         ab[var3] = (int)(ba[var3] ^ var1);
      }

      return ab[var3];
   }

   private static String ab(char[] var0, long var1, int var3) {
      int var4 = aa(b(-91374566, -403020313 ^ 1231742544), 483557261660946787L) ^ var3;

      for (int var5 = 0; var5 < var0.length; var5++) {
         int var7 = var4 ^ (int)var1 ^ ~var5;
         int var8 = var7 ^ var3 - var5 * var0.length;
         var4 = -var8 * var3 | var5;
         var0[var5] = (char)(var0[var5] ^ var4);
         int var6 = var5 & aa(b(-91374567, -403020313 ^ -2000731391), 821681335025467552L);
         var3 = var3 << var6 | var3 >>> -var6;
         var1 ^= var6;
      }

      return new String(var0);
   }

   public static aaaaab ba(String var0) {
      return Enum.valueOf(aaaaab.class, var0);
   }

   private static String bb(int var0, int var1) {
      int var9 = 2032257652;
      int var2 = (var0 ^ b(-91374531, var9 ^ 903586916)) & b(-91374532, var9 ^ 820804212);
      if (a[var2] == null) {
         char[] var3 = aa[var2].toCharArray();

         int var4 = switch (var3[0] & b(-91374541, var9 ^ -125478771)) {
            case 0 -> b(-91374542, var9 ^ 2138289175);
            case 1 -> b(-91374543, var9 ^ -532749649);
            case 2 -> b(-91374544, var9 ^ 311781725);
            case 3 -> b(-91374537, var9 ^ 836520588);
            case 4 -> b(-91374538, var9 ^ 545527911);
            case 5 -> b(-91374539, var9 ^ 1344432729);
            case 6 -> b(-91374540, var9 ^ 1841913953);
            case 7 -> b(-91374549, var9 ^ 1629919143);
            case 8 -> b(-91374550, var9 ^ -42249256);
            case 9 -> b(-91374551, var9 ^ -1806310568);
            case 10 -> b(-91374552, var9 ^ -963000818);
            case 11 -> b(-91374545, var9 ^ 1378278247);
            case 12 -> b(-91374546, var9 ^ -1229861349);
            case 13 -> b(-91374547, var9 ^ -1909091089);
            case 14 -> b(-91374548, var9 ^ -1591817909);
            case 15 -> b(-91374557, var9 ^ 632586859);
            case 16 -> b(-91374558, var9 ^ -958814461);
            case 17 -> b(-91374559, var9 ^ -744400017);
            case 18 -> b(-91374560, var9 ^ -1752210186);
            case 19 -> b(-91374553, var9 ^ -172960410);
            case 20 -> b(-91374554, var9 ^ -773575291);
            case 21 -> b(-91374555, var9 ^ -152269190);
            case 22 -> b(-91374556, var9 ^ 2006302566);
            case 23 -> b(-91374501, var9 ^ -931064636);
            case 24 -> b(-91374502, var9 ^ 821242022);
            case 25 -> b(-91374503, var9 ^ 1637619644);
            case 26 -> b(-91374504, var9 ^ 1895866996);
            case 27 -> b(-91374497, var9 ^ -846283584);
            case 28 -> b(-91374498, var9 ^ 69146871);
            case 29 -> 3;
            case 30 -> b(-91374499, var9 ^ -208395922);
            case 31 -> b(-91374500, var9 ^ -1305298599);
            case 32 -> b(-91374509, var9 ^ -319491479);
            case 33 -> b(-91374510, var9 ^ -751742506);
            case 34 -> b(-91374511, var9 ^ -457131717);
            case 35 -> b(-91374512, var9 ^ -464962270);
            case 36 -> b(-91374505, var9 ^ -1437819767);
            case 37 -> b(-91374506, var9 ^ -473751303);
            case 38 -> b(-91374507, var9 ^ -2093002330);
            case 39 -> b(-91374508, var9 ^ 1954486187);
            case 40 -> b(-91374517, var9 ^ -1501392867);
            case 41 -> b(-91374518, var9 ^ 997735252);
            case 42 -> b(-91374519, var9 ^ 576181490);
            case 43 -> b(-91374520, var9 ^ -320832146);
            case 44 -> b(-91374513, var9 ^ -1904508680);
            case 45 -> b(-91374514, var9 ^ -1394307994);
            case 46 -> b(-91374515, var9 ^ 2014145863);
            case 47 -> b(-91374516, var9 ^ -204280425);
            case 48 -> b(-91374525, var9 ^ 1012785132);
            case 49 -> 2;
            case 50 -> b(-91374526, var9 ^ -1156969490);
            case 51 -> b(-91374527, var9 ^ -1035379990);
            case 52 -> b(-91374528, var9 ^ -2010505725);
            case 53 -> b(-91374521, var9 ^ 47525834);
            case 54 -> b(-91374522, var9 ^ -1131508189);
            case 55 -> b(-91374523, var9 ^ -990893184);
            case 56 -> b(-91374524, var9 ^ -1194288860);
            case 57 -> b(-91374469, var9 ^ -394550482);
            case 58 -> b(-91374470, var9 ^ -684656434);
            case 59 -> b(-91374471, var9 ^ -2040200885);
            case 60 -> b(-91374472, var9 ^ -497651570);
            case 61 -> b(-91374465, var9 ^ 676817044);
            case 62 -> b(-91374466, var9 ^ -2079780176);
            case 63 -> b(-91374467, var9 ^ -1647245695);
            case 64 -> b(-91374468, var9 ^ -115394);
            case 65 -> b(-91374477, var9 ^ 1873646673);
            case 66 -> b(-91374478, var9 ^ 536773954);
            case 67 -> b(-91374479, var9 ^ -1955285764);
            case 68 -> b(-91374480, var9 ^ 1460765438);
            case 69 -> b(-91374473, var9 ^ 38548141);
            case 70 -> 4;
            case 71 -> b(-91374474, var9 ^ -917986886);
            case 72 -> b(-91374475, var9 ^ 620441014);
            case 73 -> b(-91374476, var9 ^ 1237795395);
            case 74 -> b(-91374485, var9 ^ -1509352407);
            case 75 -> b(-91374486, var9 ^ -362018974);
            case 76 -> b(-91374487, var9 ^ -2099560932);
            case 77 -> b(-91374488, var9 ^ 344804701);
            case 78 -> b(-91374481, var9 ^ -1977490219);
            case 79 -> b(-91374482, var9 ^ 1954245092);
            case 80 -> 1;
            case 81 -> b(-91374483, var9 ^ -1975740426);
            case 82 -> b(-91374484, var9 ^ -1296351437);
            case 83 -> b(-91374493, var9 ^ 741073450);
            case 84 -> b(-91374494, var9 ^ 337921525);
            case 85 -> b(-91374495, var9 ^ -634597209);
            case 86 -> b(-91374496, var9 ^ -1344827602);
            case 87 -> b(-91374489, var9 ^ 1511566043);
            case 88 -> b(-91374490, var9 ^ -1420781301);
            case 89 -> b(-91374491, var9 ^ -1759615698);
            case 90 -> b(-91374492, var9 ^ 475694692);
            case 91 -> b(-91374437, var9 ^ 1959759748);
            case 92 -> b(-91374438, var9 ^ -660469015);
            case 93 -> b(-91374439, var9 ^ 1993714712);
            case 94 -> b(-91374440, var9 ^ 458494092);
            case 95 -> b(-91374433, var9 ^ -916128621);
            case 96 -> b(-91374434, var9 ^ 1074628444);
            case 97 -> b(-91374435, var9 ^ 462942845);
            case 98 -> b(-91374436, var9 ^ 917053687);
            case 99 -> b(-91374445, var9 ^ -714519863);
            case 100 -> b(-91374446, var9 ^ 918493511);
            case 101 -> b(-91374447, var9 ^ -118811112);
            case 102 -> b(-91374448, var9 ^ -573808837);
            case 103 -> b(-91374441, var9 ^ 1463863848);
            case 104 -> b(-91374442, var9 ^ 1745655753);
            case 105 -> b(-91374443, var9 ^ -499271626);
            case 106 -> b(-91374444, var9 ^ 503581093);
            case 107 -> b(-91374453, var9 ^ -1879188802);
            case 108 -> b(-91374454, var9 ^ 221172374);
            case 109 -> b(-91374455, var9 ^ 968493441);
            case 110 -> b(-91374456, var9 ^ 1217103207);
            case 111 -> b(-91374449, var9 ^ 1459479199);
            case 112 -> b(-91374450, var9 ^ -2115209032);
            case 113 -> b(-91374451, var9 ^ -1274545261);
            case 114 -> b(-91374452, var9 ^ -324363098);
            case 115 -> b(-91374461, var9 ^ 1855644931);
            case 116 -> b(-91374462, var9 ^ 2076855635);
            case 117 -> b(-91374463, var9 ^ 659734271);
            case 118 -> b(-91374464, var9 ^ -135837058);
            case 119 -> b(-91374457, var9 ^ 1390381084);
            case 120 -> b(-91374458, var9 ^ 912567822);
            case 121 -> 0;
            case 122 -> b(-91374459, var9 ^ -1460578390);
            case 123 -> b(-91374460, var9 ^ -2046587404);
            case 124 -> b(-91374405, var9 ^ 1091358396);
            case 125 -> b(-91374406, var9 ^ -223521219);
            case 126 -> b(-91374407, var9 ^ 1161230084);
            case 127 -> b(-91374408, var9 ^ 928055298);
            case 128 -> b(-91374401, var9 ^ -1577426606);
            case 129 -> b(-91374402, var9 ^ -690510037);
            case 130 -> b(-91374403, var9 ^ 798458658);
            case 131 -> b(-91374404, var9 ^ -1029156999);
            case 132 -> b(-91374413, var9 ^ 834721785);
            case 133 -> b(-91374414, var9 ^ -1449354274);
            case 134 -> b(-91374415, var9 ^ -108005363);
            case 135 -> b(-91374416, var9 ^ -1398929240);
            case 136 -> b(-91374409, var9 ^ -1911087925);
            case 137 -> b(-91374410, var9 ^ 773331270);
            case 138 -> b(-91374411, var9 ^ 1202186245);
            case 139 -> b(-91374412, var9 ^ 747398158);
            case 140 -> b(-91374421, var9 ^ 1124890136);
            case 141 -> b(-91374422, var9 ^ -939726133);
            case 142 -> b(-91374423, var9 ^ 454975645);
            case 143 -> b(-91374424, var9 ^ 1225551485);
            case 144 -> b(-91374417, var9 ^ -85864376);
            case 145 -> b(-91374418, var9 ^ 1919309200);
            case 146 -> b(-91374419, var9 ^ -967326732);
            case 147 -> b(-91374420, var9 ^ 224726116);
            case 148 -> b(-91374429, var9 ^ 1094400975);
            case 149 -> b(-91374430, var9 ^ 1338545164);
            case 150 -> b(-91374431, var9 ^ -1228916308);
            case 151 -> b(-91374432, var9 ^ -1016353269);
            case 152 -> b(-91374425, var9 ^ 1441484463);
            case 153 -> b(-91374426, var9 ^ -94480994);
            case 154 -> b(-91374427, var9 ^ -1435694027);
            case 155 -> b(-91374428, var9 ^ -2004305776);
            case 156 -> b(-91374373, var9 ^ 1849446314);
            case 157 -> b(-91374374, var9 ^ -2005289711);
            case 158 -> b(-91374375, var9 ^ -1805738796);
            case 159 -> b(-91374376, var9 ^ 283183527);
            case 160 -> b(-91374369, var9 ^ 324720684);
            case 161 -> b(-91374370, var9 ^ -1508335466);
            case 162 -> b(-91374371, var9 ^ 1452627732);
            case 163 -> b(-91374372, var9 ^ 680509118);
            case 164 -> b(-91374381, var9 ^ -1546133161);
            case 165 -> b(-91374382, var9 ^ 1214844247);
            case 166 -> b(-91374383, var9 ^ -1058580824);
            case 167 -> b(-91374384, var9 ^ -1681299770);
            case 168 -> b(-91374377, var9 ^ 454385664);
            case 169 -> b(-91374378, var9 ^ -601302163);
            case 170 -> b(-91374379, var9 ^ 1676779256);
            case 171 -> b(-91374380, var9 ^ -1114654786);
            case 172 -> b(-91374389, var9 ^ 1793300724);
            case 173 -> b(-91374390, var9 ^ -624647770);
            case 174 -> b(-91374391, var9 ^ 338143899);
            case 175 -> b(-91374392, var9 ^ 656599065);
            case 176 -> b(-91374385, var9 ^ 189744137);
            case 177 -> b(-91374386, var9 ^ -801018420);
            case 178 -> b(-91374387, var9 ^ 1456632193);
            case 179 -> b(-91374388, var9 ^ 1655804480);
            case 180 -> b(-91374397, var9 ^ -73009617);
            case 181 -> b(-91374398, var9 ^ 1334310037);
            case 182 -> b(-91374399, var9 ^ -2036122840);
            case 183 -> b(-91374400, var9 ^ -1778297480);
            case 184 -> b(-91374393, var9 ^ 1132181204);
            case 185 -> b(-91374394, var9 ^ 272776916);
            case 186 -> b(-91374395, var9 ^ -1291090136);
            case 187 -> b(-91374396, var9 ^ 472333037);
            case 188 -> b(-91374341, var9 ^ 182506026);
            case 189 -> b(-91374342, var9 ^ 1183611987);
            case 190 -> b(-91374343, var9 ^ -1714295691);
            case 191 -> b(-91374344, var9 ^ 759744047);
            case 192 -> b(-91374337, var9 ^ -935239836);
            case 193 -> b(-91374338, var9 ^ 1581272003);
            case 194 -> b(-91374339, var9 ^ 1825564609);
            case 195 -> b(-91374340, var9 ^ 2013878659);
            case 196 -> b(-91374349, var9 ^ -1040003820);
            case 197 -> b(-91374350, var9 ^ -758546566);
            case 198 -> b(-91374351, var9 ^ -1395396245);
            case 199 -> b(-91374352, var9 ^ 171314265);
            case 200 -> b(-91374345, var9 ^ 843321830);
            case 201 -> b(-91374346, var9 ^ 923215136);
            case 202 -> b(-91374347, var9 ^ -1470729914);
            case 203 -> b(-91374348, var9 ^ -1312625839);
            case 204 -> b(-91374357, var9 ^ -1470131306);
            case 205 -> b(-91374358, var9 ^ -2080071645);
            case 206 -> b(-91374359, var9 ^ -565897696);
            case 207 -> b(-91374360, var9 ^ 419675924);
            case 208 -> b(-91374353, var9 ^ 1246216844);
            case 209 -> b(-91374354, var9 ^ 467295652);
            case 210 -> b(-91374355, var9 ^ 848501649);
            case 211 -> b(-91374356, var9 ^ 2049295840);
            case 212 -> b(-91374365, var9 ^ -533668005);
            case 213 -> b(-91374366, var9 ^ 302677485);
            case 214 -> b(-91374367, var9 ^ 1955721800);
            case 215 -> b(-91374368, var9 ^ -492255809);
            case 216 -> b(-91374361, var9 ^ 696732546);
            case 217 -> b(-91374362, var9 ^ -415856386);
            case 218 -> b(-91374363, var9 ^ -1069517637);
            case 219 -> b(-91374364, var9 ^ -752887421);
            case 220 -> b(-91374309, var9 ^ 982584461);
            case 221 -> b(-91374310, var9 ^ 1554800061);
            case 222 -> b(-91374311, var9 ^ 1266965401);
            case 223 -> b(-91374312, var9 ^ 344883923);
            case 224 -> b(-91374305, var9 ^ -201885178);
            case 225 -> b(-91374306, var9 ^ -360774386);
            case 226 -> b(-91374307, var9 ^ -889123007);
            case 227 -> b(-91374308, var9 ^ 198683181);
            case 228 -> b(-91374317, var9 ^ -1720882556);
            case 229 -> b(-91374318, var9 ^ -1227727852);
            case 230 -> b(-91374319, var9 ^ -168682230);
            case 231 -> b(-91374320, var9 ^ 430779485);
            case 232 -> b(-91374313, var9 ^ -1469417149);
            case 233 -> b(-91374314, var9 ^ -845174310);
            case 234 -> b(-91374315, var9 ^ -1597910549);
            case 235 -> b(-91374316, var9 ^ 1557782485);
            case 236 -> b(-91374325, var9 ^ -938700819);
            case 237 -> b(-91374326, var9 ^ -666001638);
            case 238 -> b(-91374327, var9 ^ -129398633);
            case 239 -> b(-91374328, var9 ^ -1856316928);
            case 240 -> b(-91374321, var9 ^ 926390168);
            case 241 -> b(-91374322, var9 ^ 536283766);
            case 242 -> b(-91374323, var9 ^ -1136139775);
            case 243 -> b(-91374324, var9 ^ 1266450470);
            case 244 -> 5;
            case 245 -> b(-91374333, var9 ^ 1843865499);
            case 246 -> b(-91374334, var9 ^ -4730809);
            case 247 -> b(-91374335, var9 ^ 1505571765);
            case 248 -> b(-91374336, var9 ^ -1508063413);
            case 249 -> b(-91374329, var9 ^ 1260344858);
            case 250 -> b(-91374330, var9 ^ 996729377);
            case 251 -> b(-91374331, var9 ^ -1738719141);
            case 252 -> b(-91374332, var9 ^ -106586793);
            case 253 -> b(-91374277, var9 ^ -625766277);
            case 254 -> b(-91374278, var9 ^ 1088532235);
            default -> b(-91374279, var9 ^ 1209657368);
         };
         int var5 = (var1 & b(-91374280, var9 ^ 517355467)) - var4;
         if (var5 < 0) {
            var5 += 256;
         }

         int var6 = ((var1 & b(-91374273, var9 ^ -1605288768)) >>> b(-91374274, var9 ^ -301338003)) - var4;
         if (var6 < 0) {
            var6 += 256;
         }

         for (int var7 = 0; var7 < var3.length; var7++) {
            int var8 = var7 % 2;
            char var10002 = var3[var7];
            if (var8 == 0) {
               var3[var7] = (char)(var10002 ^ var5);
               var5 = ((var5 >>> 3 | var5 << 5) ^ var3[var7]) & b(-91374275, var9 ^ -545811176);
            } else {
               var3[var7] = (char)(var10002 ^ var6);
               var6 = ((var6 >>> 3 | var6 << 5) ^ var3[var7]) & b(-91374276, var9 ^ -722307665);
            }
         }

         a[var2] = new String(var3).intern();
      }

      return a[var2];
   }

   private static long aaa(int var0, long var1) {
      int var3 = (var0 ^ (int)var1 ^ b(-91374285, -1144139486 ^ 415386242)) & b(-91374286, -1144139486 ^ 1003946876);
      if (aab[var3] == null) {
         aab[var3] = b[var3] ^ var1;
      }

      return aab[var3];
   }

   // $VF: Irreducible bytecode was duplicated to produce valid code
   static {
      int var33 = -845383831;
      short var28 = 13410;
      int var27 = 0;
      int var24 = "\n끧屴嘧\uf078\ue885감㑜Ṍඍ꼷\u0010ﾌ㞊﵊㝈ﭞ\ud7adﰝ㞩ﲑ\ud7fdｔ㞑ﬢ坁︮랲\n숚轧쎜侦쉸潚왻轁윧༉\u0010\u0ce5達\u0b3b炆ௗၺ\u0bfc끣ঠဿঽ偐\u0fe3炊ຯ遴\n䂐ꕭ䄖斬䃲䕐䓱ꕋ䖭┃\u0010ཡ⁅೧悙ో\u2061ຨ\ue07dજ总\u0b29恁ද悖ྛꁭ\n䳁\ue15c䵇↝䲣š䢠\ue17a䧼愲"
         .length();
      String[] var10001 = new String[7];
      int var26 = 0;
      String[] var25 = var10001;
      String var23 = "\n끧屴嘧\uf078\ue885감㑜Ṍඍ꼷\u0010ﾌ㞊﵊㝈ﭞ\ud7adﰝ㞩ﲑ\ud7fdｔ㞑ﬢ坁︮랲\n숚轧쎜侦쉸潚왻轁윧༉\u0010\u0ce5達\u0b3b炆ௗၺ\u0bfc끣ঠဿঽ偐\u0fe3炊ຯ遴\n䂐ꕭ䄖斬䃲䕐䓱ꕋ䖭┃\u0010ཡ⁅೧悙ో\u2061ຨ\ue07dજ总\u0b29恁ද悖ྛꁭ\n䳁\ue15c䵇↝䲣š䢠\ue17a䧼愲";

      do {
         int var31 = 0;
         char var29 = var23.charAt(var27);
         char[] var30 = var23.substring(var27 + 1, var27 + 1 + var29).toCharArray();

         do {
            int var32 = var30[var31];

            var32 = (char)(switch (var31 % 5) {
               default -> 73;
               case 1 -> 112;
               case 2 -> 79;
               case 3 -> 188;
               case 4 -> 3;
            }) ^ var32;
            if (var31 % 2 == 0) {
               var30[var31] = (char)((var32 >>> 3 | var32 << 13) & 65535 ^ var28);
            } else {
               var30[var31] = (char)((var32 << 3 | var32 >>> 13) & 65535 ^ var28);
            }
         } while (++var31 < var30.length);

         var25[var26] = new String(var30);
         var26++;
         var27 = var27 + var29 + 1;
      } while (var27 < var24);

      bab = var25;
      bba = new Object[var25.length];
      baa = new int[306];
      byte var37 = 0;
      byte var42 = 0;
      byte[] var10002 = "\u008f;\u0087î$=D·åèæ$\u0093t\\C\u008f®{êÇ<ó;:\u0089Îho¯ûÅß\u0014\u001f\u0014¿:5À·ò·ý\u001f\u008bej´1/\u008fòÌÏÇ:\u0015iª ¹g\u0001o\u0088=]²Pù\r\u00adz¿¢í\u00ad\u0092dÊÕ\u008a?\u00028±V\u009aó\u0005\u0083Í\u0083êï\u0093\u0086G\"õi\u00140c\n V\u008e}úm\u0088=é\u008f®<ã¦÷å\u001b¿è¿2¼\u008a\u0017¥]\u0085\u007f0}^\u009fBè8©Ê[FaÞ¢@×+\u0084ÆW\u008a6Ã`¥»\u000b\b\u0082M\u008cþn^\u0013³8\u0015á\u0018³ÖÂQ\u0090]Ó\tÂú£¯°{\u009eDºû\u0092«M¿\u000eö\u0089ÅgØ9À5\u0014\u001c\u0000¡«\u0001sE<\u0014u}¸NêR\u0093\u0013ÎÖ9XÑ5T}Ú ,\u0081\u000fd\u0002¾Î\u0006=\u000f\u001b\"ið~\u0005aT¼\u0084\u0018e§;\fÎtÃ~òê\u0092\u0011Ê5\u0082\u008dx\u0018>\u0003aG÷\u0092ÂÄ\u0000\u0019û\u0099A¿c\u0015\u001fy(Ð ¼\u008b\u0090\u0017Mc9\u0017Äç\u0016YÁF*\u0010Núßp²\u008c!\u0087òÍøU\u000fJÂÈõá]ÑÚ\u000eæ\u001fm§3}öZ^_iV\u0004\u008b\u0080·ë\u0000_7ÒÏÐ\u0005âH\u0087Ñ\u00191Ä\u0080Ò{§ÄfñXòOO\u0003T]7}ñ²K]CM\u001bö~\u0089$½\"\u0012uèÜñ\u0011Ûª\u0003ÛÚµ<w\u0084ÈIn\\Û6\fsçQ\u009c NSìs_!xùnÿ¤\u009cXiñÁèS:Å{º×v÷¾ºJ\u0098\u0014U\u0084Æ,\u0019áÝMqVä\u0016ç\u0000\u0097{y¬>§\u0087ö³Ñy±MûA6å\u0016ß¦8Öç©\u009f\u009f)¡\nK\\ZUÁ©\u0095p³XÝD¾d\u0093¿Hï×\\\u009e\u0087BU0+/Ðï\u0085XvqèÙÊn:é&\u0016³\u0080]ÿè\u001a(\u001cÅ$ú[&ä\u0090 Å2ÃD\u000bfÌÙ.A\u0085(¤Í\u0010Ã\u009b\u0081Mþ\u0011°bÐí\u0089Ó\u008e|p\u00003þ£\biÊ7Óê»\u0006_á¥p8µra¢\u0099G\u008a&Ç\u001f'F\u001f\u009d\u00178A\u0088G\u0097\u0087Ôßd\u0011\u0004j\u0090\u0097¡RU@Åét\u0013[|\u008d\u0004u\u008eWã²\u0081\u0014\u0095\u0001 \u008c\u000b¶»-èÄÜÚIRw»m%ZzKÜ\u001aY¦1%\u0095ºÂM\n\u008eZ\u0011AS\n\u0002\"\u008d_\u0013Ò\u0085}\u009aÆ+Ý\u0095Ãr´*2]ß\u0001¹u°\u0081¬\u00944q0?è\u0093º\u008eº\u0081´Ø\tl\nø\u0081ë\u008f\u001c5Ú\u0019àþèÖÊ²¶áÏ¼EIxEMãK0æt¹¦f\u0094\u008c\tÓ\u008f\u000eYàÖÌ{\u0005b¼\u009d±\u0095\u009d{ôo©gÓF'ãlÓÝà×\u0002vU\u0095}\u008f¥\u0018\u008d-Û\u0002d%PZ<A»ä×73j\u008c}hD»ßè\u0098ºi/¥\u0001\u0081\u0090|DLN\u0002mÎ\u0099nB\u0001)I{\u0004çªp½Ô¯2\u0085øÂ\u009eØ#Ì·¯¥_«\u0004\u0091<H\u0016\b(+3¼\n.su.á¸e\u008c\u008f¹°öl\bãÏãÈ@\u0086]\u008aïªá\bùm\u000f\u0017µ\u0001¦Tj\\6ÈÞÅ\u001c¯;Ì\u0085&\u00adÍ\u0091\u0089\u009fB=\u0084\u008b\u0084\u0083u1\u008f\u0017\u00ad!D¢F_^,Qù»Ö\u001aÁÉË\u0011Ä\u008aÿ)[Û«\u0013BO1#[ÒN¨w\u0089zÅ-ÈÌàê\u008eb4¹Ê\u0018õèW\u0087VÁ\u001eÁë\u0089¨\u001f`\u0013½\u0005\u0010á\u0087§{\u0087\u001c(\u0005\u0011%\u001fmÚ\n\u0091Y\u0014»R¯3Í¯~ \u0092\u0003ÛÉ\u001c×¸¯!\u0086G¸\t\u0080~ç\u0003Y\u0092\u0000z¡©\u0019òÞn8\u008cÔ\u00adøZq¤jà±\u008eE_\u0087\u0088\u0006\u007fÆqê ÷\u0012[ç¢\u0006>\u0012rkSL\r*¯T\u0004\u008e;\u0081T\u0080+ÀD\u0091\u000bÄSÜb×\u0001\u0098ÄºLyìzÑ3OÊ9\u0007¸ñ[\u009c\u009ejûI\f:\u000b\tª0èÑU\u0091\u001cÓ¸\u0092\u008dõÈå9\u00adkÐ\u009b[\n(F¡)>K\u0018³ltZ»\u00944áí[ì\u0000SÝâ\f\u001d\u0084.\u0083,úNÖ'\u007f®`)£æ÷\n¶Fë\u00admÛ9\u0098D\u008b)\fN´|Q\u0015^\ru\u009e\u0082BüC7óÓ\u00061d\b`6ö"
         .getBytes("ISO-8859-1");

      int var85;
      do {
         baa[var37] = ((var10002[var42] & 255) << 24 | (var10002[var42 + 1] & 255) << 16 | (var10002[var42 + 2] & 255) << 8 | var10002[var42 + 3] & 255)
            ^ 1881231266;
         var37 += 1;
         var85 = var42 + 4;
         var42 += 4;
      } while (var85 < var10002.length);

      String[] var21 = new String[2];
      int var19 = 0;
      String var18;
      int var20 = (var18 = aba(-698265447, var33 ^ 69148984)).length();
      char var17 = 4;
      int var16 = -1;

      while (true) {
         label118: {
            char[] var45 = var18.substring(++var16, var16 + var17).toCharArray();
            var85 = var45.length;
            int var22 = 0;
            var68 = var45;
            int var48 = var85;
            char[] var89;
            int var106;
            if (var85 <= 1) {
               var89 = var45;
               var106 = var22;
            } else {
               var68 = var45;
               var48 = var85;
               if (var85 <= var22) {
                  break label118;
               }

               var89 = var45;
               var106 = var22;
            }

            while (true) {
               var89[var106] = (char)(var89[var106] ^ switch (var22 % b(-91374568, var33 ^ -733725555)) {
                  case 0 -> b(-91374561, var33 ^ -929162019);
                  case 1 -> b(-91374562, var33 ^ -2146659244);
                  case 2 -> b(-91374563, var33 ^ 2109319452);
                  case 3 -> b(-91374564, var33 ^ 681549041);
                  case 4 -> b(-91374573, var33 ^ -1742438439);
                  case 5 -> b(-91374574, var33 ^ -133540581);
                  default -> b(-91374575, var33 ^ -255666399);
               });
               var22++;
               if (var48 == 0) {
                  var106 = var48;
                  var89 = var68;
               } else {
                  if (var48 <= var22) {
                     break;
                  }

                  var89 = var68;
                  var106 = var22;
               }
            }
         }

         String var96 = new String(var68).intern();
         byte var52 = -1;
         var21[var19++] = var96;
         if ((var16 += var17) >= var20) {
            aa = var21;
            a = new String[2];
            long var8 = 3755595354403337198L;
            long[] var14 = new long[4];
            int var11 = 0;
            String var12;
            int var13 = (var12 = aba(-698265448, var33 ^ 1720218293)).length();
            byte var10 = 0;

            label102:
            while (true) {
               byte var53 = var10;
               var10 += 8;
               String var38 = var12.substring(var53, var10);
               int var54 = -698265445;
               int var73 = var33 ^ -1585628367;
               byte[] var15 = var38.getBytes("ISO-8859-1");
               long[] var39 = var14;
               int var55 = var11++;
               long var74 = (var15[0] & 255L) << b(-91374576, var33 ^ 1488651687)
                  | (var15[1] & 255L) << b(-91374569, var33 ^ -218019667)
                  | (var15[2] & 255L) << b(-91374570, var33 ^ -1241732868)
                  | (var15[3] & 255L) << b(-91374571, var33 ^ 2099579258)
                  | (var15[4] & 255L) << b(-91374572, var33 ^ -410451864)
                  | (var15[5] & 255L) << b(-91374581, var33 ^ 683171203)
                  | (var15[b(-91374582, var33 ^ -178218544)] & 255L) << b(-91374583, var33 ^ -364191898)
                  | var15[b(-91374584, var33 ^ -1432489286)] & 255L;
               byte var97 = -1;

               while (true) {
                  long var108 = var74 ^ var8;
                  switch (var97) {
                     case 0:
                        var39[var55] = var108;
                        if (var10 >= var13) {
                           ba = var14;
                           ab = new Integer[4];
                           long var0 = 1542200087887055605L;
                           long[] var6 = new long[2];
                           int var3 = 0;
                           String var4;
                           int var5 = (var4 = aba(-698265444, var33 ^ -660061796)).length();
                           byte var2 = 0;

                           do {
                              byte var58 = var2;
                              var2 += 8;
                              String var41 = var4.substring(var58, var2);
                              int var59 = -698265441;
                              int var77 = var33 ^ -794417186;
                              byte[] var7 = var41.getBytes("ISO-8859-1");
                              int var60 = var3++;
                              var108 = (
                                    (var7[0] & 255L) << b(-91374586, var33 ^ -385055875)
                                       | (var7[1] & 255L) << b(-91374587, var33 ^ -1328186225)
                                       | (var7[2] & 255L) << b(-91374588, var33 ^ -1349560939)
                                       | (var7[3] & 255L) << b(-91374533, var33 ^ -853031517)
                                       | (var7[4] & 255L) << b(-91374534, var33 ^ -1034987718)
                                       | (var7[5] & 255L) << b(-91374535, var33 ^ 430907908)
                                       | (var7[b(-91374536, var33 ^ 2140777140)] & 255L) << b(-91374529, var33 ^ 22134352)
                                       | var7[b(-91374530, var33 ^ 132598636)] & 255L
                                 )
                                 ^ var0;
                              var97 = -1;
                              var6[var60] = var108;
                           } while (var2 < var5);

                           b = var6;
                           aab = new Long[2];
                           bb = new String[2];
                           a();
                           aba = new aaaaab();
                           abb = new aaaaab();
                           aaa = aab();
                           return;
                        }
                        break;
                     default:
                        var39[var55] = var108;
                        if (var10 < var13) {
                           continue label102;
                        }

                        var13 = (var12 = aba(-698265446, var33 ^ 1490234912)).length();
                        var10 = 0;
                  }

                  byte var56 = var10;
                  var10 += 8;
                  String var40 = var12.substring(var56, var10);
                  int var57 = -698265443;
                  int var76 = var33 ^ -248741905;
                  var15 = var40.getBytes("ISO-8859-1");
                  var39 = var14;
                  var55 = var11++;
                  var74 = (var15[0] & 255L) << b(-91374577, var33 ^ -1914311955)
                     | (var15[1] & 255L) << b(-91374578, var33 ^ 1158207085)
                     | (var15[2] & 255L) << b(-91374579, var33 ^ -574397789)
                     | (var15[3] & 255L) << b(-91374580, var33 ^ -1967945178)
                     | (var15[4] & 255L) << b(-91374589, var33 ^ -726261668)
                     | (var15[5] & 255L) << b(-91374590, var33 ^ -1302760217)
                     | (var15[b(-91374591, var33 ^ 607797376)] & 255L) << b(-91374592, var33 ^ -917661024)
                     | var15[b(-91374585, var33 ^ -821196450)] & 255L;
                  var97 = 0;
               }
            }
         }

         var17 = var18.charAt(var16);
      }
   }

   private static aaaaab[] aab() {
      return new aaaaab[]{aba, abb};
   }

   private static void a() {
      int var0 = -1108459399;
      bb[0] = ab(
         bb(b(-91374287, var0 ^ -1708229013), b(-91374288, var0 ^ 1358526674)).toCharArray(),
         aaa(b(-91374281, var0 ^ 990697962), 2807303660422492396L),
         aa(b(-91374282, var0 ^ -1717001478), 5619702161797768716L)
      );
      bb[1] = ab(
         bb(b(-91374283, var0 ^ 1121789717), b(-91374284, var0 ^ -889158024)).toCharArray(),
         aaa(b(-91374293, var0 ^ -465205185), 6490139659666861116L),
         aa(b(-91374294, var0 ^ 1059223802), 3364261553803122989L)
      );
   }
}
