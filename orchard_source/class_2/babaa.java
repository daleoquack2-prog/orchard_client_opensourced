package nsc;

import net.fabricmc.api.EnvType;
import net.fabricmc.api.Environment;
import net.minecraft.class_4184;
import net.minecraft.class_4587;
import net.minecraft.class_4597;
import net.minecraft.class_4604;
import net.minecraft.class_757;
import org.joml.Matrix4f;
import org.joml.Matrix4fc;

@Environment(EnvType.CLIENT)
final class babaa implements aabbbbaaa {
   private final Matrix4f aa;
   private static final Object[] aaba;
   private final class_757 ab;
   private static String[] ba;
   private static final long[] bb;
   private final class_4604 aaa;
   private static final int[] aaaa;
   private static final Integer[] aab;
   private final Matrix4f aba;
   private final class_4587 abb;
   private static final long[] a;
   private static final String[] baa;
   private final class_4597 bab;
   private static final Long[] b;
   private final class_4184 bba;
   private static final String[] bbb;
   private static final String[] aaab;

   private static Object aa(Object param0, Class param1, String[] param2) {
      // $VF: Couldn't be decompiled
      // Please report this to the Vineflower issue tracker, at https://github.com/Vineflower/vineflower/issues with a copy of the class file (if you have the rights to distribute it!)
      // java.lang.RuntimeException: parsing failure!
      //   at org.jetbrains.java.decompiler.modules.decompiler.decompose.DomHelper.parseGraph(DomHelper.java:211)
      //   at org.jetbrains.java.decompiler.main.rels.MethodProcessor.codeToJava(MethodProcessor.java:166)
      //
      // Bytecode:
      // 00: getstatic qeaa361f143ee4a0894bd168fd9b30c66/qf4ccf8f5435d4a78bdca4d6a018b578e/baaabbaa.bba I
      // 03: istore 3
      // 04: aload 0
      // 05: ifnonnull 0b
      // 08: aconst_null
      // 09: areturn
      // 0a: athrow
      // 0b: aload 2
      // 0c: astore 4
      // 0e: aload 4
      // 10: arraylength
      // 11: istore 5
      // 13: bipush 0
      // 14: istore 6
      // 16: iload 6
      // 18: iload 5
      // 1a: if_icmpge 4c
      // 1d: aload 4
      // 1f: iload 6
      // 21: aaload
      // 22: astore 7
      // 24: iload 3
      // 25: aload 0
      // 26: aload 7
      // 28: invokestatic qeaa361f143ee4a0894bd168fd9b30c66/qf4ccf8f5435d4a78bdca4d6a018b578e/babaa.abb (Ljava/lang/Object;Ljava/lang/String;)Ljava/lang/Object;
      // 2b: astore 8
      // 2d: ifne 48
      // 30: aload 1
      // 31: aload 8
      // 33: invokevirtual java/lang/Class.isInstance (Ljava/lang/Object;)Z
      // 36: ifeq 45
      // 39: goto 3d
      // 3c: athrow
      // 3d: aload 1
      // 3e: aload 8
      // 40: invokevirtual java/lang/Class.cast (Ljava/lang/Object;)Ljava/lang/Object;
      // 43: areturn
      // 44: athrow
      // 45: iinc 6 1
      // 48: iload 3
      // 49: ifeq 16
      // 4c: aconst_null
      // 4d: areturn
   }

   private static String ab(char[] var0, long var1, int var3) {
      int var4 = bbb(aaab(-2008890376, -1684797952 ^ 208426380), 7456280649346325476L) ^ var3;

      for (int var5 = 0; var5 < var0.length; var5++) {
         int var7 = var4 ^ (int)var1 ^ ~var5;
         int var8 = var7 ^ var3 - var5 * var0.length;
         var4 = -var8 * var3 | var5;
         var0[var5] = (char)(var0[var5] ^ var4);
         int var6 = var5 & bbb(aaab(-2008890375, -1684797952 ^ -1131781999), 1334769241036229650L);
         var3 = var3 << var6 | var3 >>> -var6;
         var1 ^= var6;
      }

      return new String(var0);
   }

   @Override
   public class_4587 ba() {
      return this.abb;
   }

   private static String bb(int var0, int var1) {
      int var9 = 785135760;
      int var2 = (var0 ^ aaab(-2008890374, var9 ^ 1782838999)) & aaab(-2008890373, var9 ^ 136797700);
      if (bbb[var2] == null) {
         char[] var3 = baa[var2].toCharArray();

         int var4 = switch (var3[0] & aaab(-2008890372, var9 ^ -1820609513)) {
            case 0 -> aaab(-2008890371, var9 ^ 1476595554);
            case 1 -> aaab(-2008890370, var9 ^ -382353603);
            case 2 -> aaab(-2008890369, var9 ^ 1215198713);
            case 3 -> aaab(-2008890384, var9 ^ -126278738);
            case 4 -> aaab(-2008890383, var9 ^ -1547445932);
            case 5 -> aaab(-2008890382, var9 ^ 1372987687);
            case 6 -> aaab(-2008890381, var9 ^ 264083893);
            case 7 -> aaab(-2008890380, var9 ^ 1955086880);
            case 8 -> aaab(-2008890379, var9 ^ 1687749128);
            case 9 -> aaab(-2008890378, var9 ^ -403653464);
            case 10 -> aaab(-2008890377, var9 ^ -1362549601);
            case 11 -> aaab(-2008890392, var9 ^ 502314634);
            case 12 -> aaab(-2008890391, var9 ^ 643695726);
            case 13 -> aaab(-2008890390, var9 ^ -353373840);
            case 14 -> aaab(-2008890389, var9 ^ -756568092);
            case 15 -> aaab(-2008890388, var9 ^ 1915611921);
            case 16 -> aaab(-2008890387, var9 ^ 177031679);
            case 17 -> aaab(-2008890386, var9 ^ -1556697901);
            case 18 -> aaab(-2008890385, var9 ^ -438628247);
            case 19 -> aaab(-2008890400, var9 ^ -1728214938);
            case 20 -> aaab(-2008890399, var9 ^ 215125649);
            case 21 -> aaab(-2008890398, var9 ^ 268561116);
            case 22 -> aaab(-2008890397, var9 ^ 2002729999);
            case 23 -> aaab(-2008890396, var9 ^ -2029822158);
            case 24 -> aaab(-2008890395, var9 ^ 1548396406);
            case 25 -> aaab(-2008890394, var9 ^ 428479994);
            case 26 -> aaab(-2008890393, var9 ^ 1695164068);
            case 27 -> aaab(-2008890408, var9 ^ 32203531);
            case 28 -> 1;
            case 29 -> aaab(-2008890407, var9 ^ 1239766675);
            case 30 -> aaab(-2008890406, var9 ^ 561466882);
            case 31 -> aaab(-2008890405, var9 ^ 913498291);
            case 32 -> aaab(-2008890404, var9 ^ 67319487);
            case 33 -> aaab(-2008890403, var9 ^ -1571360523);
            case 34 -> aaab(-2008890402, var9 ^ 1512464189);
            case 35 -> aaab(-2008890401, var9 ^ 1562208948);
            case 36 -> aaab(-2008890416, var9 ^ -356865836);
            case 37 -> aaab(-2008890415, var9 ^ 1688469619);
            case 38 -> 0;
            case 39 -> aaab(-2008890414, var9 ^ -296135164);
            case 40 -> aaab(-2008890413, var9 ^ -1197585654);
            case 41 -> aaab(-2008890412, var9 ^ -1101965718);
            case 42 -> aaab(-2008890411, var9 ^ -2054285137);
            case 43 -> aaab(-2008890410, var9 ^ -1777096009);
            case 44 -> aaab(-2008890409, var9 ^ -1106944861);
            case 45 -> aaab(-2008890424, var9 ^ -432822084);
            case 46 -> aaab(-2008890423, var9 ^ -622395622);
            case 47 -> 3;
            case 48 -> aaab(-2008890422, var9 ^ 1579863447);
            case 49 -> aaab(-2008890421, var9 ^ -511686379);
            case 50 -> aaab(-2008890420, var9 ^ 348591704);
            case 51 -> aaab(-2008890419, var9 ^ 463810206);
            case 52 -> aaab(-2008890418, var9 ^ -377667449);
            case 53 -> aaab(-2008890417, var9 ^ -499903466);
            case 54 -> aaab(-2008890432, var9 ^ 1038615279);
            case 55 -> aaab(-2008890431, var9 ^ -376074259);
            case 56 -> aaab(-2008890430, var9 ^ -1061223234);
            case 57 -> aaab(-2008890429, var9 ^ -346086684);
            case 58 -> aaab(-2008890428, var9 ^ -608989714);
            case 59 -> aaab(-2008890427, var9 ^ -449502875);
            case 60 -> aaab(-2008890426, var9 ^ -1965261990);
            case 61 -> aaab(-2008890425, var9 ^ 1193797053);
            case 62 -> aaab(-2008890440, var9 ^ 1970551203);
            case 63 -> 5;
            case 64 -> aaab(-2008890439, var9 ^ 1724763820);
            case 65 -> aaab(-2008890438, var9 ^ 1830474909);
            case 66 -> aaab(-2008890437, var9 ^ 1591576593);
            case 67 -> aaab(-2008890436, var9 ^ -769506255);
            case 68 -> aaab(-2008890435, var9 ^ 1812471698);
            case 69 -> aaab(-2008890434, var9 ^ 139107479);
            case 70 -> aaab(-2008890433, var9 ^ -1817959921);
            case 71 -> aaab(-2008890448, var9 ^ 869315290);
            case 72 -> aaab(-2008890447, var9 ^ 662423585);
            case 73 -> aaab(-2008890446, var9 ^ 1773898304);
            case 74 -> aaab(-2008890445, var9 ^ 2104203844);
            case 75 -> aaab(-2008890444, var9 ^ 924181548);
            case 76 -> aaab(-2008890443, var9 ^ 234635976);
            case 77 -> aaab(-2008890442, var9 ^ 1251889912);
            case 78 -> aaab(-2008890441, var9 ^ -787199789);
            case 79 -> aaab(-2008890456, var9 ^ -2101825630);
            case 80 -> aaab(-2008890455, var9 ^ -1036297812);
            case 81 -> aaab(-2008890454, var9 ^ 424693555);
            case 82 -> aaab(-2008890453, var9 ^ 1379757117);
            case 83 -> aaab(-2008890452, var9 ^ -265662804);
            case 84 -> aaab(-2008890451, var9 ^ -1672155125);
            case 85 -> aaab(-2008890450, var9 ^ 1801219657);
            case 86 -> aaab(-2008890449, var9 ^ 1758207827);
            case 87 -> aaab(-2008890464, var9 ^ -992420514);
            case 88 -> aaab(-2008890463, var9 ^ -601575358);
            case 89 -> aaab(-2008890462, var9 ^ -2017789756);
            case 90 -> aaab(-2008890461, var9 ^ -70446347);
            case 91 -> aaab(-2008890460, var9 ^ -898778769);
            case 92 -> aaab(-2008890459, var9 ^ 1581715563);
            case 93 -> aaab(-2008890458, var9 ^ 2130404103);
            case 94 -> aaab(-2008890457, var9 ^ -342788058);
            case 95 -> aaab(-2008890472, var9 ^ -2143526129);
            case 96 -> aaab(-2008890471, var9 ^ -1591092674);
            case 97 -> aaab(-2008890470, var9 ^ 840986223);
            case 98 -> aaab(-2008890469, var9 ^ -538766158);
            case 99 -> aaab(-2008890468, var9 ^ 26109152);
            case 100 -> aaab(-2008890467, var9 ^ -1077843349);
            case 101 -> aaab(-2008890466, var9 ^ 25734766);
            case 102 -> aaab(-2008890465, var9 ^ 2030137231);
            case 103 -> aaab(-2008890480, var9 ^ -1267728866);
            case 104 -> aaab(-2008890479, var9 ^ -109398974);
            case 105 -> aaab(-2008890478, var9 ^ 1666698363);
            case 106 -> aaab(-2008890477, var9 ^ 1206951819);
            case 107 -> aaab(-2008890476, var9 ^ -959283437);
            case 108 -> aaab(-2008890475, var9 ^ 1586877230);
            case 109 -> aaab(-2008890474, var9 ^ 943972387);
            case 110 -> aaab(-2008890473, var9 ^ 440792311);
            case 111 -> aaab(-2008890488, var9 ^ 100307848);
            case 112 -> aaab(-2008890487, var9 ^ 350191098);
            case 113 -> aaab(-2008890486, var9 ^ 127544247);
            case 114 -> aaab(-2008890485, var9 ^ 1585615574);
            case 115 -> aaab(-2008890484, var9 ^ 497778372);
            case 116 -> aaab(-2008890483, var9 ^ -1267880786);
            case 117 -> aaab(-2008890482, var9 ^ 1066266890);
            case 118 -> aaab(-2008890481, var9 ^ 2041430330);
            case 119 -> aaab(-2008890496, var9 ^ 141566081);
            case 120 -> aaab(-2008890495, var9 ^ 500518710);
            case 121 -> aaab(-2008890494, var9 ^ 1474532507);
            case 122 -> aaab(-2008890493, var9 ^ 494076410);
            case 123 -> aaab(-2008890492, var9 ^ -1705157963);
            case 124 -> aaab(-2008890491, var9 ^ 663432857);
            case 125 -> aaab(-2008890490, var9 ^ -1295212002);
            case 126 -> aaab(-2008890489, var9 ^ 87703831);
            case 127 -> aaab(-2008890504, var9 ^ 1133269476);
            case 128 -> aaab(-2008890503, var9 ^ -2076929416);
            case 129 -> aaab(-2008890502, var9 ^ 1521339050);
            case 130 -> aaab(-2008890501, var9 ^ 1994746643);
            case 131 -> aaab(-2008890500, var9 ^ 92382295);
            case 132 -> aaab(-2008890499, var9 ^ 2006607661);
            case 133 -> aaab(-2008890498, var9 ^ 2084592428);
            case 134 -> aaab(-2008890497, var9 ^ -161473145);
            case 135 -> aaab(-2008890512, var9 ^ 952703966);
            case 136 -> aaab(-2008890511, var9 ^ -177509035);
            case 137 -> aaab(-2008890510, var9 ^ 905950322);
            case 138 -> aaab(-2008890509, var9 ^ -1449290883);
            case 139 -> aaab(-2008890508, var9 ^ 1492065497);
            case 140 -> aaab(-2008890507, var9 ^ -1243185526);
            case 141 -> aaab(-2008890506, var9 ^ -132447029);
            case 142 -> aaab(-2008890505, var9 ^ -161980241);
            case 143 -> aaab(-2008890520, var9 ^ -1656310401);
            case 144 -> aaab(-2008890519, var9 ^ 95975775);
            case 145 -> aaab(-2008890518, var9 ^ 903617188);
            case 146 -> aaab(-2008890517, var9 ^ 497498709);
            case 147 -> aaab(-2008890516, var9 ^ -1898748434);
            case 148 -> aaab(-2008890515, var9 ^ 791420998);
            case 149 -> aaab(-2008890514, var9 ^ -1000702821);
            case 150 -> 2;
            case 151 -> aaab(-2008890513, var9 ^ -580239742);
            case 152 -> aaab(-2008890528, var9 ^ -1964207319);
            case 153 -> aaab(-2008890527, var9 ^ 1927037489);
            case 154 -> aaab(-2008890526, var9 ^ 1287927421);
            case 155 -> aaab(-2008890525, var9 ^ -696396987);
            case 156 -> aaab(-2008890524, var9 ^ -276448868);
            case 157 -> aaab(-2008890523, var9 ^ 1901420632);
            case 158 -> aaab(-2008890522, var9 ^ 1155178433);
            case 159 -> aaab(-2008890521, var9 ^ 1686911215);
            case 160 -> aaab(-2008890536, var9 ^ -814805249);
            case 161 -> aaab(-2008890535, var9 ^ -674986056);
            case 162 -> aaab(-2008890534, var9 ^ 1013986202);
            case 163 -> aaab(-2008890533, var9 ^ 681843493);
            case 164 -> aaab(-2008890532, var9 ^ 455780135);
            case 165 -> aaab(-2008890531, var9 ^ 1652108929);
            case 166 -> aaab(-2008890530, var9 ^ -1035766717);
            case 167 -> aaab(-2008890529, var9 ^ -1233669221);
            case 168 -> aaab(-2008890544, var9 ^ 1873497506);
            case 169 -> aaab(-2008890543, var9 ^ -573072610);
            case 170 -> aaab(-2008890542, var9 ^ -419079824);
            case 171 -> aaab(-2008890541, var9 ^ 2116008700);
            case 172 -> 4;
            case 173 -> aaab(-2008890540, var9 ^ 1443906583);
            case 174 -> aaab(-2008890539, var9 ^ 853411626);
            case 175 -> aaab(-2008890538, var9 ^ -2062682284);
            case 176 -> aaab(-2008890537, var9 ^ -1014133169);
            case 177 -> aaab(-2008890552, var9 ^ -1582205319);
            case 178 -> aaab(-2008890551, var9 ^ 1723088280);
            case 179 -> aaab(-2008890550, var9 ^ 954277328);
            case 180 -> aaab(-2008890549, var9 ^ -692372363);
            case 181 -> aaab(-2008890548, var9 ^ 454162051);
            case 182 -> aaab(-2008890547, var9 ^ -631156927);
            case 183 -> aaab(-2008890546, var9 ^ -422003026);
            case 184 -> aaab(-2008890545, var9 ^ -727149731);
            case 185 -> aaab(-2008890560, var9 ^ 145432482);
            case 186 -> aaab(-2008890559, var9 ^ 798565780);
            case 187 -> aaab(-2008890558, var9 ^ 560151404);
            case 188 -> aaab(-2008890557, var9 ^ -2018688042);
            case 189 -> aaab(-2008890556, var9 ^ -1234539413);
            case 190 -> aaab(-2008890555, var9 ^ -968819357);
            case 191 -> aaab(-2008890554, var9 ^ -1098032527);
            case 192 -> aaab(-2008890553, var9 ^ -1825709755);
            case 193 -> aaab(-2008890568, var9 ^ 951607475);
            case 194 -> aaab(-2008890567, var9 ^ -1921659550);
            case 195 -> aaab(-2008890566, var9 ^ -417311565);
            case 196 -> aaab(-2008890565, var9 ^ 1350508956);
            case 197 -> aaab(-2008890564, var9 ^ 744115509);
            case 198 -> aaab(-2008890563, var9 ^ -1172390777);
            case 199 -> aaab(-2008890562, var9 ^ -1352056474);
            case 200 -> aaab(-2008890561, var9 ^ -1404027519);
            case 201 -> aaab(-2008890576, var9 ^ 616113459);
            case 202 -> aaab(-2008890575, var9 ^ -818936788);
            case 203 -> aaab(-2008890574, var9 ^ -1698000204);
            case 204 -> aaab(-2008890573, var9 ^ -1307046055);
            case 205 -> aaab(-2008890572, var9 ^ -1565324270);
            case 206 -> aaab(-2008890571, var9 ^ 1977531165);
            case 207 -> aaab(-2008890570, var9 ^ -1810334805);
            case 208 -> aaab(-2008890569, var9 ^ -1893824404);
            case 209 -> aaab(-2008890584, var9 ^ -943950289);
            case 210 -> aaab(-2008890583, var9 ^ -1100292859);
            case 211 -> aaab(-2008890582, var9 ^ -1978664488);
            case 212 -> aaab(-2008890581, var9 ^ 2044958103);
            case 213 -> aaab(-2008890580, var9 ^ -281011607);
            case 214 -> aaab(-2008890579, var9 ^ 2015886995);
            case 215 -> aaab(-2008890578, var9 ^ 2109573256);
            case 216 -> aaab(-2008890577, var9 ^ -1128950463);
            case 217 -> aaab(-2008890592, var9 ^ 669924420);
            case 218 -> aaab(-2008890591, var9 ^ 1184859229);
            case 219 -> aaab(-2008890590, var9 ^ 283069706);
            case 220 -> aaab(-2008890589, var9 ^ -1568427886);
            case 221 -> aaab(-2008890588, var9 ^ -1132067882);
            case 222 -> aaab(-2008890587, var9 ^ 1122920033);
            case 223 -> aaab(-2008890586, var9 ^ -454055076);
            case 224 -> aaab(-2008890585, var9 ^ 403611693);
            case 225 -> aaab(-2008890600, var9 ^ 1567930949);
            case 226 -> aaab(-2008890599, var9 ^ -304275314);
            case 227 -> aaab(-2008890598, var9 ^ 241757046);
            case 228 -> aaab(-2008890597, var9 ^ -1991277434);
            case 229 -> aaab(-2008890596, var9 ^ 430606426);
            case 230 -> aaab(-2008890595, var9 ^ 768229643);
            case 231 -> aaab(-2008890594, var9 ^ -528581136);
            case 232 -> aaab(-2008890593, var9 ^ -125498791);
            case 233 -> aaab(-2008890608, var9 ^ -277071182);
            case 234 -> aaab(-2008890607, var9 ^ -1399556116);
            case 235 -> aaab(-2008890606, var9 ^ -1361643389);
            case 236 -> aaab(-2008890605, var9 ^ 2132453572);
            case 237 -> aaab(-2008890604, var9 ^ 1138461894);
            case 238 -> aaab(-2008890603, var9 ^ 1018003649);
            case 239 -> aaab(-2008890602, var9 ^ -11142587);
            case 240 -> aaab(-2008890601, var9 ^ 797320113);
            case 241 -> aaab(-2008890616, var9 ^ -1093491745);
            case 242 -> aaab(-2008890615, var9 ^ 951196714);
            case 243 -> aaab(-2008890614, var9 ^ 1222614481);
            case 244 -> aaab(-2008890613, var9 ^ -1148457861);
            case 245 -> aaab(-2008890612, var9 ^ 1171803581);
            case 246 -> aaab(-2008890611, var9 ^ 982565143);
            case 247 -> aaab(-2008890610, var9 ^ -43760541);
            case 248 -> aaab(-2008890609, var9 ^ 836547378);
            case 249 -> aaab(-2008890624, var9 ^ -58972839);
            case 250 -> aaab(-2008890623, var9 ^ 1420108397);
            case 251 -> aaab(-2008890622, var9 ^ 1264356350);
            case 252 -> aaab(-2008890621, var9 ^ -1936349321);
            case 253 -> aaab(-2008890620, var9 ^ 957005299);
            case 254 -> aaab(-2008890619, var9 ^ -1319034698);
            default -> aaab(-2008890618, var9 ^ 1778627888);
         };
         int var5 = (var1 & aaab(-2008890617, var9 ^ 1526850926)) - var4;
         if (var5 < 0) {
            var5 += 256;
         }

         int var6 = ((var1 & aaab(-2008890632, var9 ^ 936763429)) >>> aaab(-2008890631, var9 ^ 1145306962)) - var4;
         if (var6 < 0) {
            var6 += 256;
         }

         for (int var7 = 0; var7 < var3.length; var7++) {
            int var8 = var7 % 2;
            char var10002 = var3[var7];
            if (var8 == 0) {
               var3[var7] = (char)(var10002 ^ var5);
               var5 = ((var5 >>> 3 | var5 << 5) ^ var3[var7]) & aaab(-2008890630, var9 ^ 505753038);
            } else {
               var3[var7] = (char)(var10002 ^ var6);
               var6 = ((var6 >>> 3 | var6 << 5) ^ var3[var7]) & aaab(-2008890629, var9 ^ -288912940);
            }
         }

         bbb[var2] = new String(var3).intern();
      }

      return bbb[var2];
   }

   @Override
   public Matrix4f aaa() {
      return this.aba;
   }

   private static long aab(int var0, long var1) {
      int var3 = (var0 ^ (int)var1 ^ aaab(-2008890628, -615746226 ^ 998937656)) & aaab(-2008890627, -615746226 ^ -332400721);
      if (b[var3] == null) {
         b[var3] = a[var3] ^ var1;
      }

      return b[var3];
   }

   private static int aaab(int var0, int var1) {
      int var2 = aaaa[var0 ^ -2008890376] ^ var1 ^ var0;
      var2 -= 53004;
      var2 -= 11618;
      var2 ^= 23841;
      var2 += 41487;
      var2 -= 1757;
      var2 ^= 12974;
      var2 ^= 28149;
      var2 ^= 47072;
      var2 ^= 42894;
      return var2 ^ 60105;
   }

   @Override
   public Matrix4f aba() {
      return this.aa;
   }

   private babaa(Object param1) {
      // $VF: Couldn't be decompiled
      // Please report this to the Vineflower issue tracker, at https://github.com/Vineflower/vineflower/issues with a copy of the class file (if you have the rights to distribute it!)
      // java.lang.RuntimeException: parsing failure!
      //   at org.jetbrains.java.decompiler.modules.decompiler.decompose.DomHelper.parseGraph(DomHelper.java:211)
      //   at org.jetbrains.java.decompiler.main.rels.MethodProcessor.codeToJava(MethodProcessor.java:166)
      //
      // Bytecode:
      // 000: aload 0
      // 001: invokespecial java/lang/Object.<init> ()V
      // 004: getstatic qeaa361f143ee4a0894bd168fd9b30c66/qf4ccf8f5435d4a78bdca4d6a018b578e/bbbababa.b Lqeaa361f143ee4a0894bd168fd9b30c66/qf4ccf8f5435d4a78bdca4d6a018b578e/abaabaabb;
      // 007: astore 3
      // 008: getstatic qeaa361f143ee4a0894bd168fd9b30c66/qf4ccf8f5435d4a78bdca4d6a018b578e/baaabbaa.bba I
      // 00b: aload 0
      // 00c: aload 1
      // 00d: ldc_w net/minecraft/class_4587
      // 010: bipush 2
      // 011: anewarray 66
      // 014: dup
      // 015: bipush 0
      // 016: getstatic qeaa361f143ee4a0894bd168fd9b30c66/qf4ccf8f5435d4a78bdca4d6a018b578e/babaa.ba [Ljava/lang/String;
      // 019: bipush 1
      // 01a: aaload
      // 01b: invokestatic qeaa361f143ee4a0894bd168fd9b30c66/qf4ccf8f5435d4a78bdca4d6a018b578e/aabbaaaba.abba (Ljava/lang/String;)Ljava/lang/String;
      // 01e: aastore
      // 01f: dup
      // 020: bipush 1
      // 021: getstatic qeaa361f143ee4a0894bd168fd9b30c66/qf4ccf8f5435d4a78bdca4d6a018b578e/babaa.ba [Ljava/lang/String;
      // 024: bipush 3
      // 025: aaload
      // 026: invokestatic qeaa361f143ee4a0894bd168fd9b30c66/qf4ccf8f5435d4a78bdca4d6a018b578e/aabbaaaba.abba (Ljava/lang/String;)Ljava/lang/String;
      // 029: aastore
      // 02a: invokestatic qeaa361f143ee4a0894bd168fd9b30c66/qf4ccf8f5435d4a78bdca4d6a018b578e/babaa.aa (Ljava/lang/Object;Ljava/lang/Class;[Ljava/lang/String;)Ljava/lang/Object;
      // 02d: checkcast net/minecraft/class_4587
      // 030: putfield qeaa361f143ee4a0894bd168fd9b30c66/qf4ccf8f5435d4a78bdca4d6a018b578e/babaa.abb Lnet/minecraft/class_4587;
      // 033: aload 0
      // 034: aload 1
      // 035: ldc_w net/minecraft/class_4597
      // 038: bipush 1
      // 039: anewarray 66
      // 03c: dup
      // 03d: bipush 0
      // 03e: getstatic qeaa361f143ee4a0894bd168fd9b30c66/qf4ccf8f5435d4a78bdca4d6a018b578e/babaa.ba [Ljava/lang/String;
      // 041: ldc_w -2008890626
      // 044: ldc_w 754108208
      // 047: ldc_w -976487493
      // 04a: ixor
      // 04b: invokestatic qeaa361f143ee4a0894bd168fd9b30c66/qf4ccf8f5435d4a78bdca4d6a018b578e/babaa.aaab (II)I
      // 04e: ldc2_w 4531970816110918888
      // 051: invokestatic qeaa361f143ee4a0894bd168fd9b30c66/qf4ccf8f5435d4a78bdca4d6a018b578e/babaa.bbb (IJ)I
      // 054: aaload
      // 055: invokestatic qeaa361f143ee4a0894bd168fd9b30c66/qf4ccf8f5435d4a78bdca4d6a018b578e/aabbaaaba.abba (Ljava/lang/String;)Ljava/lang/String;
      // 058: aastore
      // 059: invokestatic qeaa361f143ee4a0894bd168fd9b30c66/qf4ccf8f5435d4a78bdca4d6a018b578e/babaa.aa (Ljava/lang/Object;Ljava/lang/Class;[Ljava/lang/String;)Ljava/lang/Object;
      // 05c: checkcast net/minecraft/class_4597
      // 05f: putfield qeaa361f143ee4a0894bd168fd9b30c66/qf4ccf8f5435d4a78bdca4d6a018b578e/babaa.bab Lnet/minecraft/class_4597;
      // 062: istore 2
      // 063: aload 1
      // 064: ldc_w net/minecraft/class_4604
      // 067: bipush 1
      // 068: anewarray 66
      // 06b: dup
      // 06c: bipush 0
      // 06d: getstatic qeaa361f143ee4a0894bd168fd9b30c66/qf4ccf8f5435d4a78bdca4d6a018b578e/babaa.ba [Ljava/lang/String;
      // 070: bipush 4
      // 071: aaload
      // 072: invokestatic qeaa361f143ee4a0894bd168fd9b30c66/qf4ccf8f5435d4a78bdca4d6a018b578e/aabbaaaba.abba (Ljava/lang/String;)Ljava/lang/String;
      // 075: aastore
      // 076: invokestatic qeaa361f143ee4a0894bd168fd9b30c66/qf4ccf8f5435d4a78bdca4d6a018b578e/babaa.aa (Ljava/lang/Object;Ljava/lang/Class;[Ljava/lang/String;)Ljava/lang/Object;
      // 079: checkcast net/minecraft/class_4604
      // 07c: astore 4
      // 07e: aload 0
      // 07f: aload 4
      // 081: iload 2
      // 082: ifne 08e
      // 085: ifnull 091
      // 088: goto 08c
      // 08b: athrow
      // 08c: aload 4
      // 08e: goto 097
      // 091: getstatic qeaa361f143ee4a0894bd168fd9b30c66/qf4ccf8f5435d4a78bdca4d6a018b578e/bbbababa.a Lqeaa361f143ee4a0894bd168fd9b30c66/qf4ccf8f5435d4a78bdca4d6a018b578e/abbabbbab;
      // 094: invokevirtual qeaa361f143ee4a0894bd168fd9b30c66/qf4ccf8f5435d4a78bdca4d6a018b578e/abbabbbab.ba ()Lnet/minecraft/class_4604;
      // 097: putfield qeaa361f143ee4a0894bd168fd9b30c66/qf4ccf8f5435d4a78bdca4d6a018b578e/babaa.aaa Lnet/minecraft/class_4604;
      // 09a: aload 1
      // 09b: ldc_w net/minecraft/class_4184
      // 09e: bipush 1
      // 09f: anewarray 66
      // 0a2: dup
      // 0a3: bipush 0
      // 0a4: getstatic qeaa361f143ee4a0894bd168fd9b30c66/qf4ccf8f5435d4a78bdca4d6a018b578e/babaa.ba [Ljava/lang/String;
      // 0a7: bipush 5
      // 0a8: aaload
      // 0a9: invokestatic qeaa361f143ee4a0894bd168fd9b30c66/qf4ccf8f5435d4a78bdca4d6a018b578e/aabbaaaba.abba (Ljava/lang/String;)Ljava/lang/String;
      // 0ac: aastore
      // 0ad: invokestatic qeaa361f143ee4a0894bd168fd9b30c66/qf4ccf8f5435d4a78bdca4d6a018b578e/babaa.aa (Ljava/lang/Object;Ljava/lang/Class;[Ljava/lang/String;)Ljava/lang/Object;
      // 0b0: checkcast net/minecraft/class_4184
      // 0b3: astore 5
      // 0b5: aload 0
      // 0b6: aload 5
      // 0b8: iload 2
      // 0b9: ifne 0d6
      // 0bc: ifnull 0c9
      // 0bf: goto 0c3
      // 0c2: athrow
      // 0c3: aload 5
      // 0c5: goto 0d9
      // 0c8: athrow
      // 0c9: aload 3
      // 0ca: invokevirtual qeaa361f143ee4a0894bd168fd9b30c66/qf4ccf8f5435d4a78bdca4d6a018b578e/abaabaabb.ab ()Lnet/minecraft/class_4184;
      // 0cd: getstatic qeaa361f143ee4a0894bd168fd9b30c66/qf4ccf8f5435d4a78bdca4d6a018b578e/bbbababa.a Lqeaa361f143ee4a0894bd168fd9b30c66/qf4ccf8f5435d4a78bdca4d6a018b578e/abbabbbab;
      // 0d0: invokevirtual qeaa361f143ee4a0894bd168fd9b30c66/qf4ccf8f5435d4a78bdca4d6a018b578e/abbabbbab.ab ()Lnet/minecraft/class_4184;
      // 0d3: invokestatic qeaa361f143ee4a0894bd168fd9b30c66/qf4ccf8f5435d4a78bdca4d6a018b578e/bbbababa.b (Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;
      // 0d6: checkcast net/minecraft/class_4184
      // 0d9: putfield qeaa361f143ee4a0894bd168fd9b30c66/qf4ccf8f5435d4a78bdca4d6a018b578e/babaa.bba Lnet/minecraft/class_4184;
      // 0dc: aload 1
      // 0dd: ldc_w net/minecraft/class_757
      // 0e0: bipush 1
      // 0e1: anewarray 66
      // 0e4: dup
      // 0e5: bipush 0
      // 0e6: getstatic qeaa361f143ee4a0894bd168fd9b30c66/qf4ccf8f5435d4a78bdca4d6a018b578e/babaa.ba [Ljava/lang/String;
      // 0e9: ldc_w -2008890625
      // 0ec: ldc_w 754108208
      // 0ef: ldc_w 204189249
      // 0f2: ixor
      // 0f3: invokestatic qeaa361f143ee4a0894bd168fd9b30c66/qf4ccf8f5435d4a78bdca4d6a018b578e/babaa.aaab (II)I
      // 0f6: ldc2_w 4218102966417935801
      // 0f9: invokestatic qeaa361f143ee4a0894bd168fd9b30c66/qf4ccf8f5435d4a78bdca4d6a018b578e/babaa.bbb (IJ)I
      // 0fc: aaload
      // 0fd: invokestatic qeaa361f143ee4a0894bd168fd9b30c66/qf4ccf8f5435d4a78bdca4d6a018b578e/aabbaaaba.abba (Ljava/lang/String;)Ljava/lang/String;
      // 100: aastore
      // 101: invokestatic qeaa361f143ee4a0894bd168fd9b30c66/qf4ccf8f5435d4a78bdca4d6a018b578e/babaa.aa (Ljava/lang/Object;Ljava/lang/Class;[Ljava/lang/String;)Ljava/lang/Object;
      // 104: checkcast net/minecraft/class_757
      // 107: astore 6
      // 109: aload 0
      // 10a: aload 6
      // 10c: iload 2
      // 10d: ifne 12a
      // 110: ifnull 11d
      // 113: goto 117
      // 116: athrow
      // 117: aload 6
      // 119: goto 12d
      // 11c: athrow
      // 11d: aload 3
      // 11e: invokevirtual qeaa361f143ee4a0894bd168fd9b30c66/qf4ccf8f5435d4a78bdca4d6a018b578e/abaabaabb.aa ()Lnet/minecraft/class_757;
      // 121: getstatic qeaa361f143ee4a0894bd168fd9b30c66/qf4ccf8f5435d4a78bdca4d6a018b578e/bbbababa.a Lqeaa361f143ee4a0894bd168fd9b30c66/qf4ccf8f5435d4a78bdca4d6a018b578e/abbabbbab;
      // 124: invokevirtual qeaa361f143ee4a0894bd168fd9b30c66/qf4ccf8f5435d4a78bdca4d6a018b578e/abbabbbab.bb ()Lnet/minecraft/class_757;
      // 127: invokestatic qeaa361f143ee4a0894bd168fd9b30c66/qf4ccf8f5435d4a78bdca4d6a018b578e/bbbababa.b (Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;
      // 12a: checkcast net/minecraft/class_757
      // 12d: putfield qeaa361f143ee4a0894bd168fd9b30c66/qf4ccf8f5435d4a78bdca4d6a018b578e/babaa.ab Lnet/minecraft/class_757;
      // 130: aload 1
      // 131: bipush 1
      // 132: anewarray 66
      // 135: dup
      // 136: bipush 0
      // 137: getstatic qeaa361f143ee4a0894bd168fd9b30c66/qf4ccf8f5435d4a78bdca4d6a018b578e/babaa.ba [Ljava/lang/String;
      // 13a: ldc_w -2008890640
      // 13d: ldc_w 754108208
      // 140: ldc_w 1406366557
      // 143: ixor
      // 144: invokestatic qeaa361f143ee4a0894bd168fd9b30c66/qf4ccf8f5435d4a78bdca4d6a018b578e/babaa.aaab (II)I
      // 147: ldc2_w 8420442280955519319
      // 14a: invokestatic qeaa361f143ee4a0894bd168fd9b30c66/qf4ccf8f5435d4a78bdca4d6a018b578e/babaa.bbb (IJ)I
      // 14d: aaload
      // 14e: invokestatic qeaa361f143ee4a0894bd168fd9b30c66/qf4ccf8f5435d4a78bdca4d6a018b578e/aabbaaaba.abba (Ljava/lang/String;)Ljava/lang/String;
      // 151: aastore
      // 152: invokestatic qeaa361f143ee4a0894bd168fd9b30c66/qf4ccf8f5435d4a78bdca4d6a018b578e/babaa.bab (Ljava/lang/Object;[Ljava/lang/String;)Lorg/joml/Matrix4f;
      // 155: astore 7
      // 157: aload 0
      // 158: aload 7
      // 15a: iload 2
      // 15b: ifne 178
      // 15e: ifnull 16b
      // 161: goto 165
      // 164: athrow
      // 165: aload 7
      // 167: goto 17b
      // 16a: athrow
      // 16b: aload 3
      // 16c: invokevirtual qeaa361f143ee4a0894bd168fd9b30c66/qf4ccf8f5435d4a78bdca4d6a018b578e/abaabaabb.a ()Lorg/joml/Matrix4f;
      // 16f: getstatic qeaa361f143ee4a0894bd168fd9b30c66/qf4ccf8f5435d4a78bdca4d6a018b578e/bbbababa.a Lqeaa361f143ee4a0894bd168fd9b30c66/qf4ccf8f5435d4a78bdca4d6a018b578e/abbabbbab;
      // 172: invokevirtual qeaa361f143ee4a0894bd168fd9b30c66/qf4ccf8f5435d4a78bdca4d6a018b578e/abbabbbab.baa ()Lorg/joml/Matrix4f;
      // 175: invokestatic qeaa361f143ee4a0894bd168fd9b30c66/qf4ccf8f5435d4a78bdca4d6a018b578e/bbbababa.b (Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;
      // 178: checkcast org/joml/Matrix4f
      // 17b: putfield qeaa361f143ee4a0894bd168fd9b30c66/qf4ccf8f5435d4a78bdca4d6a018b578e/babaa.aa Lorg/joml/Matrix4f;
      // 17e: aload 1
      // 17f: bipush 2
      // 180: anewarray 66
      // 183: dup
      // 184: bipush 0
      // 185: getstatic qeaa361f143ee4a0894bd168fd9b30c66/qf4ccf8f5435d4a78bdca4d6a018b578e/babaa.ba [Ljava/lang/String;
      // 188: bipush 0
      // 189: aaload
      // 18a: invokestatic qeaa361f143ee4a0894bd168fd9b30c66/qf4ccf8f5435d4a78bdca4d6a018b578e/aabbaaaba.abba (Ljava/lang/String;)Ljava/lang/String;
      // 18d: aastore
      // 18e: dup
      // 18f: bipush 1
      // 190: getstatic qeaa361f143ee4a0894bd168fd9b30c66/qf4ccf8f5435d4a78bdca4d6a018b578e/babaa.ba [Ljava/lang/String;
      // 193: bipush 2
      // 194: aaload
      // 195: invokestatic qeaa361f143ee4a0894bd168fd9b30c66/qf4ccf8f5435d4a78bdca4d6a018b578e/aabbaaaba.abba (Ljava/lang/String;)Ljava/lang/String;
      // 198: aastore
      // 199: invokestatic qeaa361f143ee4a0894bd168fd9b30c66/qf4ccf8f5435d4a78bdca4d6a018b578e/babaa.bab (Ljava/lang/Object;[Ljava/lang/String;)Lorg/joml/Matrix4f;
      // 19c: astore 8
      // 19e: aload 0
      // 19f: aload 8
      // 1a1: iload 2
      // 1a2: ifne 1bf
      // 1a5: ifnull 1b2
      // 1a8: goto 1ac
      // 1ab: athrow
      // 1ac: aload 8
      // 1ae: goto 1c2
      // 1b1: athrow
      // 1b2: aload 3
      // 1b3: invokevirtual qeaa361f143ee4a0894bd168fd9b30c66/qf4ccf8f5435d4a78bdca4d6a018b578e/abaabaabb.b ()Lorg/joml/Matrix4f;
      // 1b6: getstatic qeaa361f143ee4a0894bd168fd9b30c66/qf4ccf8f5435d4a78bdca4d6a018b578e/bbbababa.a Lqeaa361f143ee4a0894bd168fd9b30c66/qf4ccf8f5435d4a78bdca4d6a018b578e/abbabbbab;
      // 1b9: invokevirtual qeaa361f143ee4a0894bd168fd9b30c66/qf4ccf8f5435d4a78bdca4d6a018b578e/abbabbbab.bab ()Lorg/joml/Matrix4f;
      // 1bc: invokestatic qeaa361f143ee4a0894bd168fd9b30c66/qf4ccf8f5435d4a78bdca4d6a018b578e/bbbababa.b (Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;
      // 1bf: checkcast org/joml/Matrix4f
      // 1c2: putfield qeaa361f143ee4a0894bd168fd9b30c66/qf4ccf8f5435d4a78bdca4d6a018b578e/babaa.aba Lorg/joml/Matrix4f;
      // 1c5: return
   }

   private static Object abb(Object param0, String param1) {
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
      // 06: ifne 14
      // 09: ifnonnull 13
      // 0c: goto 10
      // 0f: athrow
      // 10: aconst_null
      // 11: areturn
      // 12: athrow
      // 13: aload 0
      // 14: invokevirtual java/lang/Object.getClass ()Ljava/lang/Class;
      // 17: aload 1
      // 18: bipush 0
      // 19: anewarray 55
      // 1c: invokevirtual java/lang/Class.getMethod (Ljava/lang/String;[Ljava/lang/Class;)Ljava/lang/reflect/Method;
      // 1f: astore 3
      // 20: aload 3
      // 21: bipush 1
      // 22: invokevirtual java/lang/reflect/Method.setAccessible (Z)V
      // 25: aload 3
      // 26: aload 0
      // 27: bipush 0
      // 28: anewarray 4
      // 2b: invokevirtual java/lang/reflect/Method.invoke (Ljava/lang/Object;[Ljava/lang/Object;)Ljava/lang/Object;
      // 2e: areturn
      // 2f: astore 3
      // 30: aconst_null
      // 31: areturn
   }

   private static void baa() {
      int var0 = 1819702545;
      ba[0] = ab(
         bb(aaab(-2008890682, var0 ^ 1253222600), aaab(-2008890681, var0 ^ -2089688045)).toCharArray(),
         aab(aaab(-2008890696, var0 ^ -1140492261), 7971883738389723172L),
         bbb(aaab(-2008890695, var0 ^ -1886892603), 8610261839353402463L)
      );
      ba[1] = ab(
         bb(aaab(-2008890694, var0 ^ 250053295), aaab(-2008890693, var0 ^ 1524209440)).toCharArray(),
         aab(aaab(-2008890692, var0 ^ 1569851530), 809368197792392254L),
         bbb(aaab(-2008890691, var0 ^ -1789591374), 733778481262397984L)
      );
      ba[2] = ab(
         bb(aaab(-2008890690, var0 ^ -452981996), aaab(-2008890689, var0 ^ -160012933)).toCharArray(),
         aab(aaab(-2008890704, var0 ^ 795639732), 2671908926586441365L),
         bbb(aaab(-2008890703, var0 ^ 1731811021), 125286465173761650L)
      );
      ba[3] = ab(
         bb(aaab(-2008890702, var0 ^ 1944903118), aaab(-2008890701, var0 ^ 1499927268)).toCharArray(),
         aab(aaab(-2008890700, var0 ^ 1429674984), 7639039718440104340L),
         bbb(aaab(-2008890699, var0 ^ -1381397592), 7085010309955755026L)
      );
      ba[4] = ab(
         bb(aaab(-2008890698, var0 ^ 1773546073), aaab(-2008890697, var0 ^ 1271736766)).toCharArray(),
         aab(aaab(-2008890712, var0 ^ 913271038), 971440152160257809L),
         bbb(aaab(-2008890711, var0 ^ -588072640), 3942648571407438946L)
      );
      ba[5] = ab(
         bb(aaab(-2008890710, var0 ^ 2035019959), aaab(-2008890709, var0 ^ 1159175233)).toCharArray(),
         aab(aaab(-2008890708, var0 ^ -2084265127), 255252813080098319L),
         bbb(aaab(-2008890707, var0 ^ -1768722998), 6499280514899343614L)
      );
      ba[bbb(aaab(-2008890706, var0 ^ 29512363), 5024284511502295394L)] = ab(
         bb(aaab(-2008890705, var0 ^ -1549014544), aaab(-2008890720, var0 ^ 571345355)).toCharArray(),
         aab(aaab(-2008890719, var0 ^ 857474668), 7238450532863922819L),
         bbb(aaab(-2008890718, var0 ^ 1218934436), 2795868148709762258L)
      );
      ba[bbb(aaab(-2008890717, var0 ^ 168402430), 2656657501498689208L)] = ab(
         bb(aaab(-2008890716, var0 ^ 154301594), aaab(-2008890715, var0 ^ 1999834451)).toCharArray(),
         aab(aaab(-2008890714, var0 ^ 1019162679), 3832256850904208693L),
         bbb(aaab(-2008890713, var0 ^ 229226736), 2006233604384638955L)
      );
      ba[bbb(aaab(-2008890728, var0 ^ 665986805), 4510082481042467105L)] = ab(
         bb(aaab(-2008890727, var0 ^ -1047216520), aaab(-2008890726, var0 ^ -154548421)).toCharArray(),
         aab(aaab(-2008890725, var0 ^ -1956044659), 8715750680365792373L),
         bbb(aaab(-2008890724, var0 ^ -1947229254), 8203702132560960934L)
      );
   }

   private static Matrix4f bab(Object var0, String[] var1) {
      String[] var3 = var1;
      int var4 = var1.length;
      int var5 = 0;
      int var2 = baaabbaa.bba;

      Object var7;
      label33: {
         while (var5 < var4) {
            String var6 = var3[var5];
            int var10000 = var2;
            var7 = abb(var0, var6);

            label29: {
               try {
                  if (var10000 != 0) {
                     break label29;
                  }

                  if (var7 instanceof Matrix4fc) {
                     break label33;
                  }
               } catch (MatchException var9) {
                  throw var9;
               }

               var5++;
            }

            if (var2 != 0) {
               break;
            }
         }

         return null;
      }

      Matrix4fc var8 = (Matrix4fc)var7;
      return new Matrix4f(var8);
   }

   @Override
   public class_757 bba() {
      return this.ab;
   }

   private static String aaba(int var0, int var1, char var2) {
      int var3 = var0 ^ 61708;
      char[] var4 = aaab[var3].toCharArray();
      StackTraceElement[] var5 = (StackTraceElement[])aaba[var3];
      StackTraceElement[] var6;
      if (var5 != null) {
         var6 = var5;
      } else {
         var6 = new Throwable().getStackTrace();
         aaba[var3] = var6;
      }

      StackTraceElement var7 = var6[1];
      int var8 = (var7.getClassName().hashCode() ^ var7.getMethodName().hashCode()) >> 16 ^ 29606;
      int var9 = 0;

      do {
         int var10 = var4[var9] ^ 'ꮤ';
         var10 -= 62;
         var10 -= 64729;
         var10 -= 27512;
         var4[var9] = (char)(var10 ^ var8 ^ var2 ^ var1 >> 16);
      } while (++var9 < var4.length);

      return new String(var4).intern();
   }

   private static int bbb(int var0, long var1) {
      int var3 = var0 ^ (int)(var1 & 32767L) ^ aaab(-2008890723, 1452887933 ^ 241140067);
      if (aab[var3] == null) {
         aab[var3] = (int)(bb[var3] ^ var1);
      }

      return aab[var3];
   }

   @Override
   public class_4597 a() {
      return this.bab;
   }

   // $VF: Irreducible bytecode was duplicated to produce valid code
   static {
      int var34 = 1524106338;
      byte var30 = -1;
      String var24 = "罋궭㓜퐣妮ᅫ뉳蹑忐꿇臹܆㕆똘䀔쪂令\ud85a㤶盳봃ⴚ엠纣\uf6bd甫\udec8畠㈘轢슨㨐硖\u0c64伾硩ᘞ쥃ᅈ堓䪄뵠識쮍\ue167鍀饥\ue16aথ\ud8bf➛閫縤\ue412쇝索뢅颺↱૭䏔\uf026\uf374쵽\ud987팏租\uab1b\uda24㖛夅떂잂\ue53e\ue028བྷ\uf6e8췧헳崀녣晫敄侼惡퐘셀뫭뚜\uef13똱깇濶\u1bf5餎ᖀ⸎⍳엙랋۽摾䀜詍愝㤫\ud866ﰟ鞇黎ጁᒌ䍩죞潨廚䧕Ⱒ쵌딛훧駑㥀赽밹킘蘞⭷\uebf7⇃겥꜈뒱慙ꌁ씃窊◍\u0b4e\uf2dd럺쁌\u1a7e\uaaf9㛞눧喙췚㲘ꍦ䪢∡⋸Åↂℬ⇝⊖⋜⇨⋴≄℆℈∍ⅲ∄ℇ℞∿∜⇵⊒⊃≻⊋↽Ⅸℑ∐Ⅰ↬℮≣∇⋞↸⅁⊣⇇⋦≊⋉⊻⇰⋓≿∰⋎≛∟ↀ⊍⋁⇫K≃ⅹ⊠⊨ℽ⇪⊑≭ↆⅉ⇞⋌⋏⇣ℼ≾Ⅾℜ∶⊯⇮℣⅐↾⊍↹⊡℡⇐∖⇓ⅵ⋳∮⋍∬⅁⊛≨ℎ↿⋭Å⇚ℌ∏ⅼ⋽↕⋹⋁⅕⋐≢⊋↤⊛⋟≣⊻≷⊭⋠⇟⊜∓∽⋖≉⊧−ℬ⊢菝茩荁萪荥莲荋茋萪荢᪱ᬳᩇᬸᨣᬘᨊᨖ᪱ᩘ\u1af4ᯯᯧ᭓ᨾ᭮骊騂騪髅驂骕驤騼髅驅쨖줝줍짹쪥쩺줎쪾쨐쥵짛쥾줺쩏쥘즤쪓줷쨏쥦짍줬중쩈쪮짢쥠쫵쩎줨짩쪏쪺쩳쪮짹쫮줻즶줯쩳쫟쫜짥쨙쩽쪃쥖쩁쪸쨼쥸쪓즒쫋즜肕聑耹肒聝肊聳耣肒耪쭹쩕쮄쪸쩛쭄쨓쮮쭛쩅쫑쨆쯏쬔쯸쪰ᘢᛪᚂ᙭ᚺ᙭ᚌᛔ᙭ᚭ";
      char[] var25 = "v!\u0080\n\u0010\n8\n\u0010\n".toCharArray();
      short var23 = 9184;
      String[] var26 = new String[var25.length];

      while (true) {
         int var27 = 0;
         char var28 = 0;
         char var29 = '\u0000';
         if (var30 == 0) {
            aaab = var26;
            aaba = new Object[var26.length];
            aaaa = new int[358];
            byte var40 = 0;
            int var10001 = 0;
            byte[] var10002 = "n\rj¸Þëu\u0018½zØÀß\u001f¯ÔDBôÀ\u008f:OÙ>\fÿ\u008a\u009fW0s/@a³tú\u0099â\u0086ïcÜØ\u0084ÛÁ£±\u0000E³ @:0ÉþÝyðaKÊÉó\u000fñgF_=Ö±\u0086\u0005Þí\u000e¥\u0014©iÝ´\fAt\u000fé`2âUèOÄÊMÛëÌëÇ8ª! f~\bP:\u001d\u0000\u008bsâöÎ³W´²3dÕÖÒ!Ý\u009eÜ\u0014\u0094öN\f&áK¢¦Ó:t\u009fuo°b\u008d\u001f\u001a\u0087\u008a$(\u0098=\u0083èD³\u009dB19`\u0014To§\tSih\u0013ßR·]\u0010A*è°i<\u001e\u00ad1\nêú\rß½\f\u0089\u0013\u008dc6¹\u000b[ÃþV¨Ì\u009cl£>D\u0000t5\rVVêÑB\u001d>¬Ï4\u0017\u0086A\u001f<fg\u0001\f\u008aÏÂ2\fcK]å9\f\u0090\u001e (¢M|a±ô\u008e<º#\u0094d\u0089äÈ\u009c\u0005\u001b\u0006!»1]ÿßsÞèD\u009d`8äéðýðB\u008a7¾\u0082ÈJªRÚàà,¦,ÚÅ\u0007G\u009d§\u0010È\u0006-\r\u001cU\u0081êu\u0015\u0002\u001b\tÎi\u000f×\u0085\u0004.p'\u0013\u000e\u001eKm°\u008e¼e,í¿õ]\u0016\u0013á\u009f\u001b\u000b\u001dð×P\u0083ºÄ,ôRf\u001dTûU\u0089~R6©Â!¦<¨=ÞW\u0005!%v\u0010\u0098.å\u0019,D\bÚV\u008aÖ·&Áhø(!Ö±ë¤®8-\u009ccV¼2.CöX´n\u0089Ì\u0090ÉÝ¼\u0011ë:ë\u0089¬\u0096íïz¢-Í|¶íÒÃÑ\u0084Ãæ8\u0015Ð£i0\u0089»Ð«Ê\u0092<ÉcTî\u0086è´´£®\u0094\u0083ºßIeqÊì\nÆ\u0080ÚÖÑÊJA2Md\u001auð²lÜeõàKÒ\u0003\u0003\u0094\u0094µ\u0014áS\rÐ\n\u008d\u0094\u0088B¡Ü+~Ò¸æÙ £'\u001c«y\u001e5!Y_âïðYA\"R/ââÆöÉ~¤Ó\u0013\u008fÖ^\u00adbß>Õ/\"Ff!a%ªJ\u007f÷±Ò\u0081;\u0083âåZåÊ\u009ez*Yê'wø\u0015bÚ\u0013c> \nS~Ô]ÕÑè¥å\u0007\t\u009být²\u0001D\u009378¼ü\u009a¦l\"\u0094\u0093ãÝ¤³µz\u008d\u0018VNý\u0000ýÅaëIsÿÿ\u009d[3Ì\u0013å¸µ@né\u0015z6\u001faNö\u009a¸\u0092\u000fú\nîÙÓ0<\u0019`©&øk\u0081)\u0001=åçB\tR4µà\u0014´Ëkv\u00884Ì±\u008d\u007fkïØ_%\u0001\u0082~«Ì(³¦\rX\rå1áü:\u0003\u0091Öeß\u0092]Yø `\u0085öZyÙP\u0094\u0006ÄaS)x\u0011y¿\u0098i´\u0018\u0080D\u0014£\u009dï\u0081 ÃZL\u008f\u008f0\u0019\u0014±\u0087Fc\u0011ûc\r:m'þpxP\u0004#{i\u007f#ó\u0080`z\u0018\tFäMóÐge!O[u\u008aNã¢çþCC!9\u009bX'ÈK\u0010\u00854\u001ciS\u009f\u0086]6»A®Ú×H8yX\u0087¯\u001e¼\u0015ª\u0084Êkk\u008cÕ/ð×y8\u0091¦ÆÌÇæ\r;uºðêk¿A\b\u0095×$\u00993ÖëMÏ7â\u0093\u008aMúH:ä`ÒÙQ©\u0080^vÆ2Î\u0093È\túó\u0003Ê7G8\u0092/¼HÜ8ExY{\u00ad2Æyïº1¨#ê0\u0094âÉöë\u0094Å (l¿qø¿a\u001fiëá\u0018ï\u008b^Í\u009fæØ³l²®¢\u0092á\béí©\u0083ù*]\u0001\ræåöh+Eg¦\u0083\u009c`Â\u009ceÉ0[¬â\u001bî3ýîfX`¡½:÷Ö\u008c8¥Bàí\u0010ö\u0093z»\u008fÉ\u001cl\u001f9þÈ\u0004\u00192V<Î\u0096Ê§\u0010Í¿´Ù,4\u008a\u0086Ôýª´,\u001b-\u0013¥Êo\u0098,\u00988\u0010\"9Ü{\f´\u000e4^9ø\u008b*\r·;\u0092ÃÞ1$\u001a\u00ad\u0085ß`J\u0003G«B\u001b\u0006ér9/C\u008f\u0006»v\u0086\u0011\u001c¥;ªÌ'\u009bÆA\fø5\u0095~\u0019\f\u0014a@Úd\u0002\u00859\u0092\u001dU\u008a×Ë}\u001cã5ÃÑyðÜH\u00887RC±\u008cE\u000bR\u00adH\u0082\u008fB·ÜÙ\b2À73ÍtÉ\u0086\u0016\"ë\u0000\u0089Y·SrÇPe\u0001½v£\u0098\u009bUÇL\u008e\u0004×vc¼x\bõ\u0082v\u008d\u001b±éøj7Ï7\u0007`\u0006\u0083Ãö»]\u0090\u009c°f®g]Ê\u0094\u0012¦ÿs\u0018\u0001\b\u008b\u0088ª2\u000bGW\u00034bËk\u001aï\u0093ø:%D\u008d\u009a\u008f\u008bBß1Êoé\fH\u0093)\u0086s¤\u001a\u000bBQ\u009bdà{0¤(\u0099È\u0011næ\u0000×£\u0091p\u0083iÊ\u009c\u000b\u000fUºïBqòº\u0013óæo¿\u0010Ìåç¬À´O/8*Ú¢ü5H\u0080!°\u008f·£ì)£Iqö¾ìÈ\u0092\u007f/j\u0002\u0082\u0016G÷X\u0003\u0011\u009f¾\u0094@®[6(\u008b;HsÎë¦\u009f7éÝ$H¢\u009f\u008a\u0080\u0007\u009c±\u0016]\u001dNa\u001f©<\u000by\u0098*¡\u0087²1$üT\u0017Ü\u008c\u009c´\u0018â\u001eêo\u0002\u001elû\u000f¡3î."
               .getBytes("ISO-8859-1");

            int var99;
            do {
               aaaa[var40] = (
                     (var10002[var10001] & 255) << 24
                        | (var10002[var10001 + 1] & 255) << 16
                        | (var10002[var10001 + 2] & 255) << 8
                        | var10002[var10001 + 3] & 255
                  )
                  ^ 1907813093;
               var40 += 1;
               var99 = var10001 + 4;
               var10001 += 4;
            } while (var99 < var10002.length);

            String[] var21 = new String[aaab(-2008890639, var34 ^ 385966859)];
            int var19 = 0;
            String var18;
            int var20 = (var18 = aaba(61708, var34 ^ -1111265876, '㭹')).length();
            int var17 = aaab(-2008890638, var34 ^ -1333218797);
            int var38 = -1;

            label142:
            while (true) {
               String var41 = var18.substring(++var38, var38 + var17);
               var10001 = (byte)-1;

               while (true) {
                  label137: {
                     char[] var53 = var41.toCharArray();
                     var99 = var53.length;
                     int var22 = 0;
                     var78 = var53;
                     var10001 = var99;
                     char[] var103;
                     int var125;
                     if (var99 <= 1) {
                        var103 = var53;
                        var125 = var22;
                     } else {
                        var78 = var53;
                        var10001 = var99;
                        if (var99 <= var22) {
                           break label137;
                        }

                        var103 = var53;
                        var125 = var22;
                     }

                     while (true) {
                        var103[var125] = (char)(var103[var125] ^ switch (var22 % aaab(-2008890635, var34 ^ -668873686)) {
                           case 0 -> aaab(-2008890634, var34 ^ -1754054228);
                           case 1 -> aaab(-2008890633, var34 ^ 671576581);
                           case 2 -> aaab(-2008890648, var34 ^ -1732265033);
                           case 3 -> aaab(-2008890647, var34 ^ -1844878080);
                           case 4 -> aaab(-2008890646, var34 ^ 653402087);
                           case 5 -> aaab(-2008890645, var34 ^ -1603611495);
                           default -> aaab(-2008890644, var34 ^ -1205102929);
                        });
                        var22++;
                        if (var10001 == 0) {
                           var125 = var10001;
                           var103 = var78;
                        } else {
                           if (var10001 <= var22) {
                              break;
                           }

                           var103 = var78;
                           var125 = var22;
                        }
                     }
                  }

                  String var110 = new String(var78).intern();
                  switch (var10001) {
                     case 0:
                        var21[var19++] = var110;
                        if ((var38 += var17) >= var20) {
                           baa = var21;
                           bbb = new String[aaab(-2008890636, var34 ^ -1290845697)];
                           long var8 = 2335512673879618894L;
                           long[] var14 = new long[aaab(-2008890643, var34 ^ -1711129618)];
                           int var11 = 0;
                           String var12;
                           int var13 = (var12 = aaba(61710, var34 ^ 1329401429, '肁')).length();
                           byte var10 = 0;

                           label116:
                           while (true) {
                              int var60 = var10;
                              var10 += 8;
                              String var43 = var12.substring(var60, var10);
                              int var61 = 61711;
                              int var84 = var34 ^ -1632875945;
                              char var111 = '돊';
                              byte[] var15 = var43.getBytes("ISO-8859-1");
                              long[] var44 = var14;
                              var60 = var11++;
                              long var85 = (var15[0] & 255L) << aaab(-2008890642, var34 ^ -1516892466)
                                 | (var15[1] & 255L) << aaab(-2008890641, var34 ^ -1305354886)
                                 | (var15[2] & 255L) << aaab(-2008890656, var34 ^ 165763085)
                                 | (var15[3] & 255L) << aaab(-2008890655, var34 ^ 1701606247)
                                 | (var15[4] & 255L) << aaab(-2008890654, var34 ^ -1766324611)
                                 | (var15[5] & 255L) << aaab(-2008890653, var34 ^ -1355212499)
                                 | (var15[aaab(-2008890652, var34 ^ 2034858673)] & 255L) << aaab(-2008890651, var34 ^ -1698732698)
                                 | var15[aaab(-2008890650, var34 ^ 704295754)] & 255L;
                              byte var112 = -1;

                              while (true) {
                                 long var127 = var85 ^ var8;
                                 switch (var112) {
                                    case 0:
                                       var44[var60] = var127;
                                       if (var10 >= var13) {
                                          bb = var14;
                                          aab = new Integer[aaab(-2008890672, var34 ^ -2117699371)];
                                          long var0 = 6965872256106829458L;
                                          long[] var6 = new long[aaab(-2008890671, var34 ^ -90559628)];
                                          int var3 = 0;
                                          String var4;
                                          int var5 = (var4 = aaba(61706, var34 ^ 974740948, '淧')).length();
                                          byte var2 = 0;

                                          label106:
                                          while (true) {
                                             byte var65 = var2;
                                             var2 += 8;
                                             String var46 = var4.substring(var65, var2);
                                             var61 = (char)61707;
                                             int var88 = var34 ^ 1254166356;
                                             short var115 = 25855;
                                             byte[] var7 = var46.getBytes("ISO-8859-1");
                                             long[] var47 = var6;
                                             var61 = var3++;
                                             long var89 = (var7[0] & 255L) << aaab(-2008890670, var34 ^ 1685921141)
                                                | (var7[1] & 255L) << aaab(-2008890669, var34 ^ 509336549)
                                                | (var7[2] & 255L) << aaab(-2008890668, var34 ^ 947435758)
                                                | (var7[3] & 255L) << aaab(-2008890667, var34 ^ 757704925)
                                                | (var7[4] & 255L) << aaab(-2008890666, var34 ^ -1064239016)
                                                | (var7[5] & 255L) << aaab(-2008890665, var34 ^ 1454313172)
                                                | (var7[aaab(-2008890680, var34 ^ -1197698592)] & 255L) << aaab(-2008890679, var34 ^ -920996056)
                                                | var7[aaab(-2008890678, var34 ^ -1538425192)] & 255L;
                                             byte var116 = -1;

                                             while (true) {
                                                var127 = var89 ^ var0;
                                                switch (var116) {
                                                   case 0:
                                                      var47[var61] = var127;
                                                      if (var2 >= var5) {
                                                         a = var6;
                                                         b = new Long[aaab(-2008890684, var34 ^ -1727513442)];
                                                         ba = new String[bbb(aaab(-2008890683, var34 ^ 966977739), 7139267686455663499L)];
                                                         baa();
                                                         return;
                                                      }
                                                      break;
                                                   default:
                                                      var47[var61] = var127;
                                                      if (var2 < var5) {
                                                         continue label106;
                                                      }

                                                      var5 = (var4 = aaba(61700, var34 ^ 240329894, '媅')).length();
                                                      var2 = 0;
                                                }

                                                var65 = var2;
                                                var2 += 8;
                                                String var48 = var4.substring(var65, var2);
                                                char var69 = '\uf105';
                                                int var91 = var34 ^ 836713622;
                                                var111 = '詸';
                                                var7 = var48.getBytes("ISO-8859-1");
                                                var47 = var6;
                                                var61 = var3++;
                                                var89 = (var7[0] & 255L) << aaab(-2008890677, var34 ^ 1625015088)
                                                   | (var7[1] & 255L) << aaab(-2008890676, var34 ^ 867289092)
                                                   | (var7[2] & 255L) << aaab(-2008890675, var34 ^ 222962289)
                                                   | (var7[3] & 255L) << aaab(-2008890674, var34 ^ 926931279)
                                                   | (var7[4] & 255L) << aaab(-2008890673, var34 ^ -801801919)
                                                   | (var7[5] & 255L) << aaab(-2008890688, var34 ^ 681955964)
                                                   | (var7[aaab(-2008890687, var34 ^ -1469436142)] & 255L) << aaab(-2008890686, var34 ^ -1756384385)
                                                   | var7[aaab(-2008890685, var34 ^ -1178407958)] & 255L;
                                                var116 = 0;
                                             }
                                          }
                                       }
                                       break;
                                    default:
                                       var44[var60] = var127;
                                       if (var10 < var13) {
                                          continue label116;
                                       }

                                       var13 = (var12 = aaba(61704, var34 ^ 255656726, 'ꮑ')).length();
                                       var10 = 0;
                                 }

                                 byte var63 = var10;
                                 var10 += 8;
                                 String var45 = var12.substring(var63, var10);
                                 char var64 = '\uf109';
                                 int var87 = var34 ^ -1529538864;
                                 var111 = '肚';
                                 var15 = var45.getBytes("ISO-8859-1");
                                 var44 = var14;
                                 var60 = var11++;
                                 var85 = (var15[0] & 255L) << aaab(-2008890649, var34 ^ -1076998782)
                                    | (var15[1] & 255L) << aaab(-2008890664, var34 ^ 1918142634)
                                    | (var15[2] & 255L) << aaab(-2008890663, var34 ^ -341489411)
                                    | (var15[3] & 255L) << aaab(-2008890662, var34 ^ -526584863)
                                    | (var15[4] & 255L) << aaab(-2008890661, var34 ^ -1468017387)
                                    | (var15[5] & 255L) << aaab(-2008890660, var34 ^ 564280037)
                                    | (var15[aaab(-2008890659, var34 ^ 2146725951)] & 255L) << aaab(-2008890658, var34 ^ 1662667717)
                                    | var15[aaab(-2008890657, var34 ^ -672858600)] & 255L;
                                 var112 = 0;
                              }
                           }
                        }

                        var17 = var18.charAt(var38);
                        break;
                     default:
                        var21[var19++] = var110;
                        if ((var38 += var17) < var20) {
                           var17 = var18.charAt(var38);
                           continue label142;
                        }

                        var20 = (var18 = aaba(61709, var34 ^ 734070470, '曌')).length();
                        var17 = aaab(-2008890637, var34 ^ 989978693);
                        var38 = -1;
                  }

                  var41 = var18.substring(++var38, var38 + var17);
                  var10001 = (byte)0;
               }
            }
         }

         do {
            var29 = var25[var27];
            char[] var31 = var24.substring(var28, var28 + var29).toCharArray();
            int var32 = 0;

            do {
               short var33 = switch (var32 % 5) {
                  default -> 6;
                  case 1 -> 244;
                  case 2 -> 160;
                  case 3 -> 109;
                  case 4 -> 209;
               };
               var31[var32] = (char)(var31[var32] ^ var33 ^ var23);
            } while (++var32 < var31.length);

            var26[var27] = new String(var31).intern();
            var28 += var29;
         } while (++var27 < var25.length);

         var30 = 0;
      }
   }

   @Override
   public class_4604 b() {
      return this.aaa;
   }

   @Override
   public class_4184 aaaa() {
      return this.bba;
   }
}
