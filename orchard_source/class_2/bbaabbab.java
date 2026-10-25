package nsc;

import net.fabricmc.api.EnvType;
import net.fabricmc.api.Environment;
import net.minecraft.class_2596;

@Environment(EnvType.CLIENT)
public final class bbaabbab extends abbaabbaa {
   private static final Object[] aab;
   private static final int[] bb;
   private static volatile bbaabbab aa;
   private static final String[] ab;
   private static final String[] ba;
   private static final String[] aaa;

   private static String b(int var0, int var1) {
      int var9 = 397946907;
      int var2 = (var0 ^ a(1075404526, var9 ^ 679177096)) & a(1075404527, var9 ^ 1513359917);
      if (ba[var2] == null) {
         char[] var3 = ab[var2].toCharArray();

         int var4 = switch (var3[0] & a(1075404524, var9 ^ -621959944)) {
            case 0 -> a(1075404525, var9 ^ 144318835);
            case 1 -> a(1075404522, var9 ^ -507557148);
            case 2 -> a(1075404523, var9 ^ -209801713);
            case 3 -> a(1075404520, var9 ^ -991035584);
            case 4 -> 2;
            case 5 -> a(1075404521, var9 ^ 1745572673);
            case 6 -> a(1075404518, var9 ^ -753549493);
            case 7 -> a(1075404519, var9 ^ 602980345);
            case 8 -> a(1075404516, var9 ^ 954981907);
            case 9 -> a(1075404517, var9 ^ -621527535);
            case 10 -> a(1075404514, var9 ^ -1274567177);
            case 11 -> a(1075404515, var9 ^ 237649992);
            case 12 -> a(1075404512, var9 ^ -1687178638);
            case 13 -> a(1075404513, var9 ^ -965240642);
            case 14 -> a(1075404542, var9 ^ 256779450);
            case 15 -> a(1075404543, var9 ^ -686433326);
            case 16 -> a(1075404540, var9 ^ -1306507195);
            case 17 -> a(1075404541, var9 ^ -660104365);
            case 18 -> a(1075404538, var9 ^ 1878010162);
            case 19 -> a(1075404539, var9 ^ 947726623);
            case 20 -> 0;
            case 21 -> a(1075404536, var9 ^ 1265574749);
            case 22 -> a(1075404537, var9 ^ 1935622383);
            case 23 -> a(1075404534, var9 ^ 653781360);
            case 24 -> a(1075404535, var9 ^ 1975213209);
            case 25 -> a(1075404532, var9 ^ -1048728485);
            case 26 -> a(1075404533, var9 ^ 41886421);
            case 27 -> a(1075404530, var9 ^ 1629335148);
            case 28 -> a(1075404531, var9 ^ -759751834);
            case 29 -> a(1075404528, var9 ^ 590704237);
            case 30 -> a(1075404529, var9 ^ 996654236);
            case 31 -> a(1075404494, var9 ^ 1607767774);
            case 32 -> a(1075404495, var9 ^ 896850278);
            case 33 -> a(1075404492, var9 ^ 806193247);
            case 34 -> a(1075404493, var9 ^ 1299972612);
            case 35 -> a(1075404490, var9 ^ -1781848742);
            case 36 -> a(1075404491, var9 ^ -1342963272);
            case 37 -> a(1075404488, var9 ^ 376621891);
            case 38 -> a(1075404489, var9 ^ -1941422821);
            case 39 -> a(1075404486, var9 ^ 1680406732);
            case 40 -> a(1075404487, var9 ^ 1250282096);
            case 41 -> a(1075404484, var9 ^ 1270592660);
            case 42 -> a(1075404485, var9 ^ -1816580564);
            case 43 -> a(1075404482, var9 ^ 89614160);
            case 44 -> a(1075404483, var9 ^ 1692819207);
            case 45 -> a(1075404480, var9 ^ -1060916541);
            case 46 -> a(1075404481, var9 ^ -245762313);
            case 47 -> a(1075404510, var9 ^ 249863785);
            case 48 -> a(1075404511, var9 ^ 1519840845);
            case 49 -> a(1075404508, var9 ^ -2094165098);
            case 50 -> a(1075404509, var9 ^ 515289388);
            case 51 -> a(1075404506, var9 ^ 1217332460);
            case 52 -> a(1075404507, var9 ^ -1371382211);
            case 53 -> a(1075404504, var9 ^ -253274345);
            case 54 -> a(1075404505, var9 ^ 159660944);
            case 55 -> a(1075404502, var9 ^ -1078984277);
            case 56 -> a(1075404503, var9 ^ 1285178224);
            case 57 -> a(1075404500, var9 ^ 2134163257);
            case 58 -> a(1075404501, var9 ^ 80979041);
            case 59 -> a(1075404498, var9 ^ 1278743874);
            case 60 -> a(1075404499, var9 ^ -1410560619);
            case 61 -> a(1075404496, var9 ^ 685644457);
            case 62 -> a(1075404497, var9 ^ -789902587);
            case 63 -> a(1075404462, var9 ^ 1057732060);
            case 64 -> a(1075404463, var9 ^ -1213506221);
            case 65 -> a(1075404460, var9 ^ 256919645);
            case 66 -> a(1075404461, var9 ^ 1041027007);
            case 67 -> a(1075404458, var9 ^ -1381310657);
            case 68 -> a(1075404459, var9 ^ -1352517602);
            case 69 -> a(1075404456, var9 ^ 1111293216);
            case 70 -> a(1075404457, var9 ^ 527453515);
            case 71 -> a(1075404454, var9 ^ -270818237);
            case 72 -> a(1075404455, var9 ^ -646483207);
            case 73 -> a(1075404452, var9 ^ 95486453);
            case 74 -> a(1075404453, var9 ^ 1966659898);
            case 75 -> a(1075404450, var9 ^ 36497216);
            case 76 -> a(1075404451, var9 ^ -1947767742);
            case 77 -> a(1075404448, var9 ^ 1088084886);
            case 78 -> a(1075404449, var9 ^ -697161428);
            case 79 -> a(1075404478, var9 ^ 1378716624);
            case 80 -> a(1075404479, var9 ^ -1797258678);
            case 81 -> a(1075404476, var9 ^ -976805018);
            case 82 -> a(1075404477, var9 ^ -1397544034);
            case 83 -> a(1075404474, var9 ^ -1334304981);
            case 84 -> a(1075404475, var9 ^ -237124083);
            case 85 -> a(1075404472, var9 ^ -1010239299);
            case 86 -> a(1075404473, var9 ^ -592367938);
            case 87 -> a(1075404470, var9 ^ 261064452);
            case 88 -> a(1075404471, var9 ^ -1470134006);
            case 89 -> a(1075404468, var9 ^ -1225846690);
            case 90 -> a(1075404469, var9 ^ -25464934);
            case 91 -> a(1075404466, var9 ^ -1976400444);
            case 92 -> a(1075404467, var9 ^ 1509318406);
            case 93 -> a(1075404464, var9 ^ -1750088659);
            case 94 -> a(1075404465, var9 ^ 1880410564);
            case 95 -> 1;
            case 96 -> a(1075404430, var9 ^ 1227777925);
            case 97 -> a(1075404431, var9 ^ -391172605);
            case 98 -> a(1075404428, var9 ^ 1273712525);
            case 99 -> a(1075404429, var9 ^ 787789969);
            case 100 -> a(1075404426, var9 ^ 902418256);
            case 101 -> a(1075404427, var9 ^ 786937869);
            case 102 -> a(1075404424, var9 ^ -1932833958);
            case 103 -> a(1075404425, var9 ^ 292667050);
            case 104 -> a(1075404422, var9 ^ 1802775888);
            case 105 -> a(1075404423, var9 ^ 485528150);
            case 106 -> a(1075404420, var9 ^ 1109626578);
            case 107 -> a(1075404421, var9 ^ 908620081);
            case 108 -> a(1075404418, var9 ^ 1149691139);
            case 109 -> a(1075404419, var9 ^ 1941677548);
            case 110 -> a(1075404416, var9 ^ 248830184);
            case 111 -> a(1075404417, var9 ^ 33267339);
            case 112 -> a(1075404446, var9 ^ -593049941);
            case 113 -> a(1075404447, var9 ^ 1366485111);
            case 114 -> a(1075404444, var9 ^ 528196012);
            case 115 -> a(1075404445, var9 ^ -1028747628);
            case 116 -> a(1075404442, var9 ^ 1118798082);
            case 117 -> a(1075404443, var9 ^ -1935135567);
            case 118 -> a(1075404440, var9 ^ 389799972);
            case 119 -> a(1075404441, var9 ^ 1135538360);
            case 120 -> a(1075404438, var9 ^ -372991996);
            case 121 -> a(1075404439, var9 ^ 1434479994);
            case 122 -> a(1075404436, var9 ^ 1230246356);
            case 123 -> a(1075404437, var9 ^ -612382590);
            case 124 -> a(1075404434, var9 ^ -196245683);
            case 125 -> a(1075404435, var9 ^ -31015667);
            case 126 -> a(1075404432, var9 ^ 1334274857);
            case 127 -> a(1075404433, var9 ^ 2057202047);
            case 128 -> a(1075404398, var9 ^ -424462920);
            case 129 -> a(1075404399, var9 ^ -1438002853);
            case 130 -> a(1075404396, var9 ^ -939004022);
            case 131 -> a(1075404397, var9 ^ 2138838188);
            case 132 -> a(1075404394, var9 ^ -110334149);
            case 133 -> a(1075404395, var9 ^ 806927670);
            case 134 -> a(1075404392, var9 ^ 1234814749);
            case 135 -> a(1075404393, var9 ^ -956933135);
            case 136 -> a(1075404390, var9 ^ 1695911497);
            case 137 -> a(1075404391, var9 ^ -1360555197);
            case 138 -> a(1075404388, var9 ^ 1863169914);
            case 139 -> a(1075404389, var9 ^ 991107259);
            case 140 -> a(1075404386, var9 ^ -338675211);
            case 141 -> a(1075404387, var9 ^ 510742570);
            case 142 -> a(1075404384, var9 ^ 1437315234);
            case 143 -> a(1075404385, var9 ^ -156035561);
            case 144 -> a(1075404414, var9 ^ 1322720578);
            case 145 -> a(1075404415, var9 ^ -1973114896);
            case 146 -> a(1075404412, var9 ^ -579619068);
            case 147 -> a(1075404413, var9 ^ -559630978);
            case 148 -> a(1075404410, var9 ^ 949567310);
            case 149 -> a(1075404411, var9 ^ 1786920391);
            case 150 -> a(1075404408, var9 ^ -1981386126);
            case 151 -> a(1075404409, var9 ^ 1831241422);
            case 152 -> a(1075404406, var9 ^ 1649975465);
            case 153 -> a(1075404407, var9 ^ -1968237188);
            case 154 -> a(1075404404, var9 ^ 2041449471);
            case 155 -> a(1075404405, var9 ^ 1943057726);
            case 156 -> a(1075404402, var9 ^ -568567846);
            case 157 -> a(1075404403, var9 ^ 430903509);
            case 158 -> 4;
            case 159 -> a(1075404400, var9 ^ -380392059);
            case 160 -> a(1075404401, var9 ^ 887164231);
            case 161 -> a(1075404366, var9 ^ -1041151933);
            case 162 -> a(1075404367, var9 ^ -51555489);
            case 163 -> a(1075404364, var9 ^ -611793281);
            case 164 -> a(1075404365, var9 ^ 940437841);
            case 165 -> a(1075404362, var9 ^ 827756702);
            case 166 -> a(1075404363, var9 ^ -1920651282);
            case 167 -> a(1075404360, var9 ^ 1028494493);
            case 168 -> a(1075404361, var9 ^ -1558364271);
            case 169 -> a(1075404358, var9 ^ -55981742);
            case 170 -> a(1075404359, var9 ^ 763835978);
            case 171 -> a(1075404356, var9 ^ -604185871);
            case 172 -> a(1075404357, var9 ^ -2076617025);
            case 173 -> a(1075404354, var9 ^ 756312759);
            case 174 -> a(1075404355, var9 ^ -2077765116);
            case 175 -> a(1075404352, var9 ^ -528455103);
            case 176 -> a(1075404353, var9 ^ 209535796);
            case 177 -> a(1075404382, var9 ^ 1911394067);
            case 178 -> a(1075404383, var9 ^ -1493299914);
            case 179 -> 3;
            case 180 -> a(1075404380, var9 ^ 1414966082);
            case 181 -> a(1075404381, var9 ^ -2048967599);
            case 182 -> a(1075404378, var9 ^ -142388744);
            case 183 -> a(1075404379, var9 ^ 2111226537);
            case 184 -> a(1075404376, var9 ^ 1523246263);
            case 185 -> a(1075404377, var9 ^ 613748207);
            case 186 -> a(1075404374, var9 ^ 1976648293);
            case 187 -> a(1075404375, var9 ^ -1380649992);
            case 188 -> a(1075404372, var9 ^ 1209880095);
            case 189 -> a(1075404373, var9 ^ 684945318);
            case 190 -> a(1075404370, var9 ^ 715781098);
            case 191 -> a(1075404371, var9 ^ -1549648457);
            case 192 -> a(1075404368, var9 ^ -1378371560);
            case 193 -> a(1075404369, var9 ^ 1856669514);
            case 194 -> a(1075404334, var9 ^ -1267662083);
            case 195 -> a(1075404335, var9 ^ 700358827);
            case 196 -> a(1075404332, var9 ^ 371934841);
            case 197 -> a(1075404333, var9 ^ -2376104);
            case 198 -> a(1075404330, var9 ^ -78034377);
            case 199 -> a(1075404331, var9 ^ -1010204679);
            case 200 -> a(1075404328, var9 ^ 474432214);
            case 201 -> a(1075404329, var9 ^ 8292384);
            case 202 -> a(1075404326, var9 ^ -433989660);
            case 203 -> a(1075404327, var9 ^ 1290735888);
            case 204 -> a(1075404324, var9 ^ 343566998);
            case 205 -> a(1075404325, var9 ^ -328420927);
            case 206 -> a(1075404322, var9 ^ 466673676);
            case 207 -> a(1075404323, var9 ^ -539591979);
            case 208 -> a(1075404320, var9 ^ -1827059825);
            case 209 -> a(1075404321, var9 ^ 1439803130);
            case 210 -> a(1075404350, var9 ^ 539221666);
            case 211 -> a(1075404351, var9 ^ -854614449);
            case 212 -> a(1075404348, var9 ^ -1236368144);
            case 213 -> a(1075404349, var9 ^ -162950488);
            case 214 -> a(1075404346, var9 ^ 990748322);
            case 215 -> a(1075404347, var9 ^ 256573595);
            case 216 -> a(1075404344, var9 ^ 1475573883);
            case 217 -> a(1075404345, var9 ^ -1238838278);
            case 218 -> a(1075404342, var9 ^ 1080680504);
            case 219 -> a(1075404343, var9 ^ -1884306924);
            case 220 -> a(1075404340, var9 ^ 1832560454);
            case 221 -> a(1075404341, var9 ^ -1952636883);
            case 222 -> a(1075404338, var9 ^ 263795928);
            case 223 -> a(1075404339, var9 ^ -2078199233);
            case 224 -> a(1075404336, var9 ^ 209822145);
            case 225 -> a(1075404337, var9 ^ -1128481503);
            case 226 -> a(1075404302, var9 ^ 833341890);
            case 227 -> a(1075404303, var9 ^ 736049559);
            case 228 -> a(1075404300, var9 ^ -1322492510);
            case 229 -> a(1075404301, var9 ^ 435756122);
            case 230 -> a(1075404298, var9 ^ 1153137457);
            case 231 -> a(1075404299, var9 ^ -1579834886);
            case 232 -> a(1075404296, var9 ^ -274302735);
            case 233 -> a(1075404297, var9 ^ -1580632991);
            case 234 -> a(1075404294, var9 ^ 1079190622);
            case 235 -> a(1075404295, var9 ^ -452140733);
            case 236 -> a(1075404292, var9 ^ -1141528225);
            case 237 -> a(1075404293, var9 ^ 1316680714);
            case 238 -> a(1075404290, var9 ^ 1235557135);
            case 239 -> a(1075404291, var9 ^ -669387662);
            case 240 -> a(1075404288, var9 ^ -5930484);
            case 241 -> a(1075404289, var9 ^ -1400796667);
            case 242 -> a(1075404318, var9 ^ 647782689);
            case 243 -> a(1075404319, var9 ^ -1428884361);
            case 244 -> a(1075404316, var9 ^ -352420463);
            case 245 -> a(1075404317, var9 ^ -894369547);
            case 246 -> a(1075404314, var9 ^ 2051099761);
            case 247 -> a(1075404315, var9 ^ 735619479);
            case 248 -> a(1075404312, var9 ^ -1493514027);
            case 249 -> a(1075404313, var9 ^ 315348457);
            case 250 -> a(1075404310, var9 ^ -1290724044);
            case 251 -> a(1075404311, var9 ^ 612991749);
            case 252 -> 5;
            case 253 -> a(1075404308, var9 ^ 1209679060);
            case 254 -> a(1075404309, var9 ^ -1598930530);
            default -> a(1075404306, var9 ^ 1867611272);
         };
         int var5 = (var1 & a(1075404307, var9 ^ 533531982)) - var4;
         if (var5 < 0) {
            var5 += 256;
         }

         int var6 = ((var1 & a(1075404304, var9 ^ -609954374)) >>> a(1075404305, var9 ^ 1564707277)) - var4;
         if (var6 < 0) {
            var6 += 256;
         }

         for (int var7 = 0; var7 < var3.length; var7++) {
            int var8 = var7 % 2;
            char var10002 = var3[var7];
            if (var8 == 0) {
               var3[var7] = (char)(var10002 ^ var5);
               var5 = ((var5 >>> 3 | var5 << 5) ^ var3[var7]) & a(1075404782, var9 ^ 1217687415);
            } else {
               var3[var7] = (char)(var10002 ^ var6);
               var6 = ((var6 >>> 3 | var6 << 5) ^ var3[var7]) & a(1075404783, var9 ^ -1910966272);
            }
         }

         ba[var2] = new String(var3).intern();
      }

      return ba[var2];
   }

   private bbaabbab() {
      super(
         aabbaaaba.aaab(b(a(1075404780, 788147955 ^ 1197243854), a(1075404781, 788147955 ^ -967063270))),
         bbaabbba.a,
         aabbaaaba.aaab(b(a(1075404778, 788147955 ^ 1128315920), a(1075404779, 788147955 ^ 1904440228)))
      );
   }

   // $VF: Irreducible bytecode was duplicated to produce valid code
   static {
      int var18 = -1309340914;
      char[] var9 = "㚇".toCharArray();
      short var7 = 13994;
      String var8 = "䵏䵗䶨䰦䴅䶰䰁䷨䱾䰈䲮䱓䲳䰈䲀䵽䶁䶲䳮䲄䲆䷞䱏䷂䳣䳚䳈䰪䰘䶵䳠䷙䰼䰏䳧䱢䰃䵙䶡䳫䴧䳘䲉䷸䳖";
      byte var14 = -1;
      String[] var10 = new String[var9.length];

      while (true) {
         int var11 = 0;
         int var12 = 0;
         int var13 = 0;
         if (var14 == 0) {
            aaa = var10;
            aab = new Object[var10.length];
            byte var21 = 0;
            int var10001 = 0;
            bb = new int[271];
            byte[] var10002 = "i\bqÀ\u001bDhQ\u009b\u009eÇ\u0087IéCá Ì(\u008d²\rÍ´\u0085\u009e\u009c8)x0\u0096\u0092fÝ\u0007b\u0083Ý\u0096y\u0098¼ç\u009b\u0087_\tõtÄãOY#ðÚ\u001cÐå\u0087\u0004û\u0015N=G\r\u0096f¹\u0006óS+æ\u0099Ôù».\u0083Kºy\u000eK\u009e\n\u001c@\u009e2,!øg\u0084\u008884È=Á\u0080\u000eÎÁC\fAw nÌ\u0001\u0093ÄzrbF\u000f!z\u0014ß-\u001e§÷¯t\u0007»\"q~é'\f\u000f`ÉÔ¸Gèî\u0087`¡W\u0001©\u0093Í;^û%[\u009bV\u000bö¨±\nÈÖÄÒÊO7D$\u0005\u0099%\u0095<\u0088\u0081°Ó¹°*\u0097\u0098O\u0097üÌ\u001bå\u008fNÂ^ò§_ÅÓ\u0082\tüeÏï1?!±\u00944\u0095H÷Y&þÃcr\ré!¯>GÞ\u0012E Å\r\rKwµê\u009fì÷i\u00ad{²\u0091\u0098iË~x×\u001böØ<\tN#*ý\u007f\u007f\u00ad\u0016ìÙ¾mî\u0011[Þ\u0003O\u009f-^\u0003,\u0007®¨Ç\u0082\u0098\u0004\u0011pDÂc'4KºþC_\u0085FÊ\u0094\u000eó\u0001©º\u0086\u0097\u0001K\u0016\u0013^êÝÕ\u0093`ã\u0084´AÁíÀHAñ\u000b|Ô°®§\u001a\u0082»\u009b6\u009dÂMoNüå5é,èJ÷\u009cq\u000e¿\b\u000eëËAçV\u0018\u0085>SÖÜ¥Q1g¨\u0089\b]\u0005 ©ÜM\u0001\n\u0098.êo\u0087Ú`tº¬\u009eo\u0094Ú&Í¸*8P\u0002Ü:*\u0007L7]\u0083ðÛ\u0003Pìõw[\u0010~\u0005õ\u008462ÈÇ\u001fO§ºÎ@\u0088ÿ¿\u009dÕ¤Y\u0010\u0001\u008bÞ^\bÃ.\u0083Ýïê\u0003Üã0ÍÛMñVH\u0083\u0088\u0002Ý\u0092¶¨·û¥\u0014ó\f\u0005\b's5\u009a\fª\u0006µ>å²¿UÜ(\u000eô\bÚ;í\nÞ§ÀVéë:²s\u0089t\u008c¸>\u000fw\u0098¸\u001f\f\u0012qkßÛ\bê¥_\u0087\u00859\u009d$fì\u000eï\u0094òÕ.~Ô~z`zÓª£[\u0083_\u00021 \u0014ØÓ\u0083·Àw\u0088\u000f¤\u007fAË\u0017Æ|\u009c\u0000Õ{\u009f×ÔÖyê]5+ñ_-È\u0095\u0010\u008f,Uçr#+Â}ËÜv98Ýi\u00822£×:\u009fo6\u007fXÜr\u0082¨ Î¤u\u0092lø\u0080\u0082*\u001a½\u009e0\u0083\u009aû¥\u001fy~\u0092 p%óîÌöM!|>öWân^\b½Ú¨ÇlôT\u0011\u009a\u008f»aÅJ7#lg\t\u0090ÅT±\u007f¡ó\tGM\u000e\"Ø0\u009eì`ç\u008dnX\u0015%ÊþÄ¬^\u000e¶ð0\u001f<¥¡°\u001b¹\u0087§eæo 4¢#ßìÇ\u0090ä\tn,Ái \u000e5kÚ\u0090÷âÑ\\\u001fì¤Ùá/ÙæÆõ\u0002`\u00adhÍÂ\u0097WX$ô¾¨Ý(º*(5\u0082º\u001cï]4 \u007fA\réÄ§R¶\u0014\r\u009cpøU\t\b2\u00ad\u001fÒ¶Z£\u0083\u0017\u009e¥\u0019dÒj$á\u0014¢Ç\naP¼¿\u008c|ÿ²÷=æU·:ðáz~ÿwN8az\u0016\u0080\u001aß÷[°©\u0001\u001a\u0081þÎÜ¡u,IÅêÊîC-NÊU\u0010ÅRSÓMòÃëýÏÞHpØ¨\fj¬Zþð_<mX\u008a~Y\u0005È\u0018_à¦Ãl®Õ\u001a^àº\u0016\u0011\u0001 E\u0091¤\u007f\u0080\u008cú\u0086Ë}\u000f\t\u0097[\bÖzµ\u0099j\u0095Ã¾ÖãþíòéQgï\u0000Ëë§\u0096J«\u008d\u001co\u008bÂa);2-Ðj«Ë«ç\u0089«âS¸·nòb~qeúá\u0015\ti^ÝáÁ\"Æ.\"\u001dB^¾nÎ\u009aÔ·9\u001c0ëJ\tç\r\nÏk\u009a|?mxl¾k\u0013\u009a;q¹³\t²Sw2zº\u008e\u0087p\u0083>Ã\u0011Mú¤ä\u0096BÀûi\u0010ÒvV>¬VKê8\u0082,\u008cgp§Ä"
               .getBytes("ISO-8859-1");

            int var51;
            do {
               bb[var21] = (
                     (var10002[var10001] & 255) << 24
                        | (var10002[var10001 + 1] & 255) << 16
                        | (var10002[var10001 + 2] & 255) << 8
                        | var10002[var10001 + 3] & 255
                  )
                  ^ 382986329;
               var21 += 1;
               var51 = var10001 + 4;
               var10001 += 4;
            } while (var51 < var10002.length);

            String[] var5 = new String[2];
            int var3 = 0;
            String var2;
            int var4 = (var2 = ba('⋼', '䦵', var18 ^ -1108969988)).length();
            int var1 = a(1075404776, var18 ^ -716905775);
            int var0 = -1;

            while (true) {
               label89: {
                  char[] var24 = var2.substring(++var0, var0 + var1).toCharArray();
                  var51 = var24.length;
                  int var6 = 0;
                  var39 = var24;
                  var10001 = var51;
                  char[] var55;
                  int var69;
                  if (var51 <= 1) {
                     var55 = var24;
                     var69 = var6;
                  } else {
                     var39 = var24;
                     var10001 = var51;
                     if (var51 <= var6) {
                        break label89;
                     }

                     var55 = var24;
                     var69 = var6;
                  }

                  while (true) {
                     var55[var69] = (char)(var55[var69] ^ switch (var6 % a(1075404777, var18 ^ 1615780697)) {
                        case 0 -> a(1075404774, var18 ^ 607065475);
                        case 1 -> a(1075404775, var18 ^ 1138413102);
                        case 2 -> a(1075404772, var18 ^ 667234900);
                        case 3 -> a(1075404773, var18 ^ 893914813);
                        case 4 -> a(1075404770, var18 ^ 1265111249);
                        case 5 -> a(1075404771, var18 ^ -541296684);
                        default -> a(1075404768, var18 ^ -2142307101);
                     });
                     var6++;
                     if (var10001 == 0) {
                        var69 = var10001;
                        var55 = var39;
                     } else {
                        if (var10001 <= var6) {
                           break;
                        }

                        var55 = var39;
                        var69 = var6;
                     }
                  }
               }

               String var62 = new String(var39).intern();
               byte var31 = -1;
               var5[var3++] = var62;
               if ((var0 += var1) >= var4) {
                  ab = var5;
                  ba = new String[2];
                  return;
               }

               var1 = var2.charAt(var0);
            }
         }

         do {
            var13 = var9[var11] ^ var7;
            char[] var15 = var8.substring(var12, var12 + var13).toCharArray();
            int var16 = 0;

            do {
               short var17 = switch (var16 % 6) {
                  default -> 104;
                  case 1 -> 89;
                  case 2 -> 184;
                  case 3 -> 222;
                  case 4 -> 43;
                  case 5 -> 187;
               };
               var15[var16] = (char)(var15[var16] ^ var17);
            } while (++var16 < var15.length);

            var10[var11] = new String(var15).intern();
            var12 += var13;
         } while (++var11 < var9.length);

         var14 = 0;
      }
   }

   private static int a(int var0, int var1) {
      int var2 = bb[var0 ^ 1075404526] ^ var1 ^ var0;
      var2 ^= 6448;
      var2 ^= 39055;
      var2 += 4712;
      var2 -= 42685;
      var2 ^= 42842;
      return var2 - 30276;
   }

   private static String ba(char var0, char var1, int var2) {
      int var3 = var1 ^ 18869;
      char[] var4 = aaa[var3].toCharArray();
      StackTraceElement[] var5 = (StackTraceElement[])aab[var3];
      StackTraceElement[] var6;
      if (var5 != null) {
         var6 = var5;
      } else {
         var6 = new Throwable().getStackTrace();
         aab[var3] = var6;
      }

      StackTraceElement var7 = var6[1];
      int var8 = (var7.getClassName().hashCode() ^ var7.getMethodName().hashCode()) >> 16 ^ 30291;
      int var9 = 0;

      do {
         int var10 = var4[var9] - '踲';
         var10 ^= 24685;
         var10 += 2900;
         var10 += 48014;
         var10 += 49346;
         var10 -= 34242;
         var10 -= 30484;
         var4[var9] = (char)(var10 ^ var8 ^ var0 ^ var2 >> 16);
      } while (++var9 < var4.length);

      return new String(var4).intern();
   }

   public boolean aa(class_2596 var1) {
      return false;
   }

   static bbaabbab ab() {
      // $VF: Couldn't be decompiled
      // Please report this to the Vineflower issue tracker, at https://github.com/Vineflower/vineflower/issues with a copy of the class file (if you have the rights to distribute it!)
      // java.lang.IndexOutOfBoundsException: Index 0 out of bounds for length 0
      //   at java.base/jdk.internal.util.Preconditions.outOfBounds(Preconditions.java:100)
      //   at java.base/jdk.internal.util.Preconditions.outOfBoundsCheckIndex(Preconditions.java:106)
      //   at java.base/jdk.internal.util.Preconditions.checkIndex(Preconditions.java:302)
      //   at java.base/java.util.Objects.checkIndex(Objects.java:385)
      //   at java.base/java.util.ArrayList.remove(ArrayList.java:551)
      //   at org.jetbrains.java.decompiler.modules.decompiler.FinallyProcessor.removeExceptionInstructionsEx(FinallyProcessor.java:1057)
      //   at org.jetbrains.java.decompiler.modules.decompiler.FinallyProcessor.insertSemaphore(FinallyProcessor.java:350)
      //   at org.jetbrains.java.decompiler.modules.decompiler.FinallyProcessor.iterateGraph(FinallyProcessor.java:99)
      //   at org.jetbrains.java.decompiler.main.rels.MethodProcessor.codeToJava(MethodProcessor.java:178)
      //
      // Bytecode:
      // 00: getstatic qeaa361f143ee4a0894bd168fd9b30c66/qf4ccf8f5435d4a78bdca4d6a018b578e/baaabbaa.bba I
      // 03: getstatic qeaa361f143ee4a0894bd168fd9b30c66/qf4ccf8f5435d4a78bdca4d6a018b578e/bbaabbab.aa Lqeaa361f143ee4a0894bd168fd9b30c66/qf4ccf8f5435d4a78bdca4d6a018b578e/bbaabbab;
      // 06: astore 1
      // 07: istore 0
      // 08: aload 1
      // 09: iload 0
      // 0a: ifne 3c
      // 0d: ifnonnull 3b
      // 10: goto 14
      // 13: athrow
      // 14: ldc qeaa361f143ee4a0894bd168fd9b30c66/qf4ccf8f5435d4a78bdca4d6a018b578e/bbaabbab
      // 16: dup
      // 17: astore 2
      // 18: iload 0
      // 19: ifne 32
      // 1c: monitorenter
      // 1d: getstatic qeaa361f143ee4a0894bd168fd9b30c66/qf4ccf8f5435d4a78bdca4d6a018b578e/bbaabbab.aa Lqeaa361f143ee4a0894bd168fd9b30c66/qf4ccf8f5435d4a78bdca4d6a018b578e/bbaabbab;
      // 20: astore 1
      // 21: aload 1
      // 22: ifnonnull 31
      // 25: new qeaa361f143ee4a0894bd168fd9b30c66/qf4ccf8f5435d4a78bdca4d6a018b578e/bbaabbab
      // 28: dup
      // 29: invokespecial qeaa361f143ee4a0894bd168fd9b30c66/qf4ccf8f5435d4a78bdca4d6a018b578e/bbaabbab.<init> ()V
      // 2c: astore 1
      // 2d: aload 1
      // 2e: putstatic qeaa361f143ee4a0894bd168fd9b30c66/qf4ccf8f5435d4a78bdca4d6a018b578e/bbaabbab.aa Lqeaa361f143ee4a0894bd168fd9b30c66/qf4ccf8f5435d4a78bdca4d6a018b578e/bbaabbab;
      // 31: aload 2
      // 32: monitorexit
      // 33: goto 3b
      // 36: astore 3
      // 37: aload 2
      // 38: monitorexit
      // 39: aload 3
      // 3a: athrow
      // 3b: aload 1
      // 3c: areturn
   }
}
