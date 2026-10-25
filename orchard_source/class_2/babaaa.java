package nsc;

import net.fabricmc.api.EnvType;
import net.fabricmc.api.Environment;
import net.minecraft.class_6880;

@Environment(EnvType.CLIENT)
public final class babaaa extends abbaabbaa {
   private static final Object[] bab;
   private static final long[] aa;
   private static final long[] ab;
   private static final Integer[] ba;
   private static String[] bb;
   private static final String[] baa;
   private static final Long[] aaa;
   private static final String[] aab;
   private static final int[] abb;
   private static final String[] aba;

   public boolean aa(class_6880 param1) {
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
      // 05: invokevirtual qeaa361f143ee4a0894bd168fd9b30c66/qf4ccf8f5435d4a78bdca4d6a018b578e/babaaa.babbaab ()Z
      // 08: iload 2
      // 09: ifne 20
      // 0c: ifeq 5f
      // 0f: goto 13
      // 12: athrow
      // 13: getstatic net/minecraft/class_1294.field_5919 Lnet/minecraft/class_6880;
      // 16: aload 1
      // 17: invokeinterface net/minecraft/class_6880.equals (Ljava/lang/Object;)Z 2
      // 1c: goto 20
      // 1f: athrow
      // 20: iload 2
      // 21: ifne 5c
      // 24: ifne 5b
      // 27: goto 2b
      // 2a: athrow
      // 2b: getstatic net/minecraft/class_1294.field_38092 Lnet/minecraft/class_6880;
      // 2e: aload 1
      // 2f: invokeinterface net/minecraft/class_6880.equals (Ljava/lang/Object;)Z 2
      // 34: iload 2
      // 35: ifne 5c
      // 38: goto 3c
      // 3b: athrow
      // 3c: ifne 5b
      // 3f: goto 43
      // 42: athrow
      // 43: getstatic net/minecraft/class_1294.field_5916 Lnet/minecraft/class_6880;
      // 46: aload 1
      // 47: invokeinterface net/minecraft/class_6880.equals (Ljava/lang/Object;)Z 2
      // 4c: iload 2
      // 4d: ifne 5c
      // 50: goto 54
      // 53: athrow
      // 54: ifeq 5f
      // 57: goto 5b
      // 5a: athrow
      // 5b: bipush 1
      // 5c: goto 60
      // 5f: bipush 0
      // 60: ireturn
   }

   private static String ab(char[] var0, long var1, int var3) {
      int var4 = ba(a(-1004296467, 1313996600 ^ -1950874922), 3805703380881209819L) ^ var3;

      for (int var5 = 0; var5 < var0.length; var5++) {
         int var7 = var4 ^ (int)var1 ^ ~var5;
         int var8 = var7 ^ var3 - var5 * var0.length;
         var4 = -var8 * var3 | var5;
         var0[var5] = (char)(var0[var5] ^ var4);
         int var6 = var5 & ba(a(-1004296468, 1313996600 ^ -12786104), 8091765816546914068L);
         var3 = var3 << var6 | var3 >>> -var6;
         var1 ^= var6;
      }

      return new String(var0);
   }

   private static int a(int var0, int var1) {
      int var2 = abb[var0 ^ -1004296467] ^ var1 ^ var0;
      var2 += 30049;
      var2 += 12848;
      var2 -= 45458;
      var2 ^= 56406;
      var2 ^= 46661;
      var2 ^= 5175;
      var2 ^= 53213;
      var2 += 58285;
      var2 ^= 31195;
      return var2 + 4783;
   }

   private static int ba(int var0, long var1) {
      int var3 = var0 ^ (int)(var1 & 32767L) ^ a(-1004296465, -192849140 ^ -2115023980);
      if (ba[var3] == null) {
         ba[var3] = (int)(aa[var3] ^ var1);
      }

      return ba[var3];
   }

   private static String aab(short var0, short var1, byte var2, int var3, byte var4) {
      int var9 = var3 ^ 1507817844;
      char[] var8 = baa[var9].toCharArray();
      StackTraceElement[] var10 = (StackTraceElement[])bab[var9];
      StackTraceElement[] var11;
      if (var10 != null) {
         var11 = var10;
      } else {
         var11 = new Throwable().getStackTrace();
         bab[var9] = var11;
      }

      StackTraceElement var12 = var11[1];
      int var6 = (var12.getClassName().hashCode() ^ var12.getMethodName().hashCode()) >> 16 ^ 54265;

      for (int var7 = 0; var7 < var8.length; var7++) {
         var8[var7] = (char)(var8[var7] ^ 18795 ^ var7 ^ var2 ^ var3 ^ var6 ^ var4 ^ var1 ^ var0);
      }

      return new String(var8).intern();
   }

   private static String b(int var0, int var1) {
      int var9 = -578712091;
      int var2 = (var0 ^ a(-1004296466, var9 ^ 446943372)) & a(-1004296471, var9 ^ 1428709795);
      if (aba[var2] == null) {
         char[] var3 = aab[var2].toCharArray();

         int var4 = switch (var3[0] & a(-1004296472, var9 ^ 647861370)) {
            case 0 -> a(-1004296469, var9 ^ -1714485060);
            case 1 -> a(-1004296470, var9 ^ -374535139);
            case 2 -> a(-1004296475, var9 ^ -1910024852);
            case 3 -> a(-1004296476, var9 ^ -910470584);
            case 4 -> a(-1004296473, var9 ^ -1794169945);
            case 5 -> a(-1004296474, var9 ^ -1867984807);
            case 6 -> a(-1004296479, var9 ^ -1926922015);
            case 7 -> a(-1004296480, var9 ^ -1159500882);
            case 8 -> a(-1004296477, var9 ^ 1016256743);
            case 9 -> a(-1004296478, var9 ^ 857894900);
            case 10 -> a(-1004296451, var9 ^ -1423218162);
            case 11 -> a(-1004296452, var9 ^ 958803795);
            case 12 -> a(-1004296449, var9 ^ -555185741);
            case 13 -> a(-1004296450, var9 ^ 936337222);
            case 14 -> a(-1004296455, var9 ^ 1166921738);
            case 15 -> a(-1004296456, var9 ^ 113140679);
            case 16 -> a(-1004296453, var9 ^ 1704343440);
            case 17 -> a(-1004296454, var9 ^ -797478034);
            case 18 -> a(-1004296459, var9 ^ -1312576461);
            case 19 -> a(-1004296460, var9 ^ 1445705981);
            case 20 -> a(-1004296457, var9 ^ 1774140201);
            case 21 -> a(-1004296458, var9 ^ -975911168);
            case 22 -> a(-1004296463, var9 ^ 930766564);
            case 23 -> a(-1004296464, var9 ^ 425099009);
            case 24 -> a(-1004296461, var9 ^ 1727653117);
            case 25 -> a(-1004296462, var9 ^ -1337439201);
            case 26 -> a(-1004296499, var9 ^ -2096390378);
            case 27 -> a(-1004296500, var9 ^ 1018342897);
            case 28 -> a(-1004296497, var9 ^ -1053658296);
            case 29 -> a(-1004296498, var9 ^ -846671174);
            case 30 -> a(-1004296503, var9 ^ -1078629561);
            case 31 -> a(-1004296504, var9 ^ -2084376088);
            case 32 -> a(-1004296501, var9 ^ 1707672502);
            case 33 -> a(-1004296502, var9 ^ -2041741923);
            case 34 -> a(-1004296507, var9 ^ 142051762);
            case 35 -> a(-1004296508, var9 ^ 538094888);
            case 36 -> a(-1004296505, var9 ^ -470761416);
            case 37 -> a(-1004296506, var9 ^ -2013851974);
            case 38 -> a(-1004296511, var9 ^ -703464340);
            case 39 -> a(-1004296512, var9 ^ -240268098);
            case 40 -> a(-1004296509, var9 ^ -654911160);
            case 41 -> a(-1004296510, var9 ^ 1016650786);
            case 42 -> a(-1004296483, var9 ^ 1192369643);
            case 43 -> a(-1004296484, var9 ^ -1669273883);
            case 44 -> a(-1004296481, var9 ^ 545328081);
            case 45 -> a(-1004296482, var9 ^ 1805291303);
            case 46 -> a(-1004296487, var9 ^ -1726096381);
            case 47 -> a(-1004296488, var9 ^ 40625165);
            case 48 -> a(-1004296485, var9 ^ 232816563);
            case 49 -> a(-1004296486, var9 ^ 1165251711);
            case 50 -> a(-1004296491, var9 ^ -232042186);
            case 51 -> a(-1004296492, var9 ^ 737465601);
            case 52 -> a(-1004296489, var9 ^ -764314502);
            case 53 -> a(-1004296490, var9 ^ -1184711284);
            case 54 -> a(-1004296495, var9 ^ -630909954);
            case 55 -> a(-1004296496, var9 ^ -1212586103);
            case 56 -> a(-1004296493, var9 ^ 1046272622);
            case 57 -> a(-1004296494, var9 ^ 1864529833);
            case 58 -> a(-1004296531, var9 ^ -1790078546);
            case 59 -> a(-1004296532, var9 ^ -902241525);
            case 60 -> a(-1004296529, var9 ^ 1523946875);
            case 61 -> a(-1004296530, var9 ^ 1789349478);
            case 62 -> a(-1004296535, var9 ^ -704849879);
            case 63 -> a(-1004296536, var9 ^ 1636616857);
            case 64 -> a(-1004296533, var9 ^ -2055513620);
            case 65 -> a(-1004296534, var9 ^ 1942061479);
            case 66 -> a(-1004296539, var9 ^ -769243094);
            case 67 -> a(-1004296540, var9 ^ -1931438039);
            case 68 -> a(-1004296537, var9 ^ -1395567354);
            case 69 -> a(-1004296538, var9 ^ -1853270389);
            case 70 -> a(-1004296543, var9 ^ -240415845);
            case 71 -> a(-1004296544, var9 ^ 532005451);
            case 72 -> a(-1004296541, var9 ^ -1606731163);
            case 73 -> a(-1004296542, var9 ^ -1706923642);
            case 74 -> a(-1004296515, var9 ^ 1688259828);
            case 75 -> a(-1004296516, var9 ^ 788715275);
            case 76 -> a(-1004296513, var9 ^ -1748453644);
            case 77 -> a(-1004296514, var9 ^ 235347821);
            case 78 -> a(-1004296519, var9 ^ 1365254566);
            case 79 -> a(-1004296520, var9 ^ -1193830550);
            case 80 -> a(-1004296517, var9 ^ -1426449660);
            case 81 -> a(-1004296518, var9 ^ -1392120642);
            case 82 -> a(-1004296523, var9 ^ -879286493);
            case 83 -> a(-1004296524, var9 ^ 1287904918);
            case 84 -> a(-1004296521, var9 ^ 1739853017);
            case 85 -> a(-1004296522, var9 ^ -688504769);
            case 86 -> a(-1004296527, var9 ^ -27007970);
            case 87 -> a(-1004296528, var9 ^ -779885314);
            case 88 -> a(-1004296525, var9 ^ 1840972172);
            case 89 -> a(-1004296526, var9 ^ 334272579);
            case 90 -> a(-1004296563, var9 ^ 1588616313);
            case 91 -> a(-1004296564, var9 ^ -98969099);
            case 92 -> a(-1004296561, var9 ^ -61683312);
            case 93 -> a(-1004296562, var9 ^ 431519465);
            case 94 -> a(-1004296567, var9 ^ 972712714);
            case 95 -> a(-1004296568, var9 ^ -13023551);
            case 96 -> a(-1004296565, var9 ^ 1245977191);
            case 97 -> a(-1004296566, var9 ^ 557195623);
            case 98 -> a(-1004296571, var9 ^ -531400934);
            case 99 -> a(-1004296572, var9 ^ 716078605);
            case 100 -> a(-1004296569, var9 ^ 662748852);
            case 101 -> a(-1004296570, var9 ^ -1039304901);
            case 102 -> a(-1004296575, var9 ^ 1900197711);
            case 103 -> 0;
            case 104 -> a(-1004296576, var9 ^ 773703318);
            case 105 -> a(-1004296573, var9 ^ 300226070);
            case 106 -> a(-1004296574, var9 ^ 1545816948);
            case 107 -> a(-1004296547, var9 ^ 429268019);
            case 108 -> a(-1004296548, var9 ^ -1953914902);
            case 109 -> a(-1004296545, var9 ^ -170455970);
            case 110 -> a(-1004296546, var9 ^ -1177534436);
            case 111 -> a(-1004296551, var9 ^ -399434310);
            case 112 -> a(-1004296552, var9 ^ -1281203351);
            case 113 -> a(-1004296549, var9 ^ -1396298772);
            case 114 -> a(-1004296550, var9 ^ -2065348289);
            case 115 -> a(-1004296555, var9 ^ 1956512984);
            case 116 -> a(-1004296556, var9 ^ -1932631261);
            case 117 -> a(-1004296553, var9 ^ 155671020);
            case 118 -> a(-1004296554, var9 ^ 850312247);
            case 119 -> a(-1004296559, var9 ^ 1008898914);
            case 120 -> a(-1004296560, var9 ^ -1675338081);
            case 121 -> a(-1004296557, var9 ^ 1065129649);
            case 122 -> a(-1004296558, var9 ^ -1988653375);
            case 123 -> a(-1004296595, var9 ^ 121332350);
            case 124 -> a(-1004296596, var9 ^ 1137786753);
            case 125 -> a(-1004296593, var9 ^ 1033894346);
            case 126 -> a(-1004296594, var9 ^ -333454763);
            case 127 -> a(-1004296599, var9 ^ -413727193);
            case 128 -> a(-1004296600, var9 ^ -1811430840);
            case 129 -> a(-1004296597, var9 ^ -197669601);
            case 130 -> a(-1004296598, var9 ^ -335665986);
            case 131 -> a(-1004296603, var9 ^ 292605211);
            case 132 -> a(-1004296604, var9 ^ -64835896);
            case 133 -> a(-1004296601, var9 ^ 1399698705);
            case 134 -> a(-1004296602, var9 ^ -1900010096);
            case 135 -> a(-1004296607, var9 ^ 431676817);
            case 136 -> a(-1004296608, var9 ^ 1950272606);
            case 137 -> a(-1004296605, var9 ^ -1187477101);
            case 138 -> a(-1004296606, var9 ^ -1302212502);
            case 139 -> a(-1004296579, var9 ^ -1369069787);
            case 140 -> a(-1004296580, var9 ^ -208117903);
            case 141 -> a(-1004296577, var9 ^ -2110368391);
            case 142 -> a(-1004296578, var9 ^ -583294360);
            case 143 -> a(-1004296583, var9 ^ -1024798457);
            case 144 -> a(-1004296584, var9 ^ -856921860);
            case 145 -> a(-1004296581, var9 ^ -288658404);
            case 146 -> a(-1004296582, var9 ^ 404793353);
            case 147 -> a(-1004296587, var9 ^ 332365504);
            case 148 -> a(-1004296588, var9 ^ 865101247);
            case 149 -> a(-1004296585, var9 ^ -1334315209);
            case 150 -> a(-1004296586, var9 ^ 1345576858);
            case 151 -> 1;
            case 152 -> a(-1004296591, var9 ^ -148126201);
            case 153 -> a(-1004296592, var9 ^ 182573489);
            case 154 -> a(-1004296589, var9 ^ -414200484);
            case 155 -> a(-1004296590, var9 ^ 1952832784);
            case 156 -> a(-1004296627, var9 ^ -885802641);
            case 157 -> a(-1004296628, var9 ^ -1524191794);
            case 158 -> a(-1004296625, var9 ^ -921151633);
            case 159 -> a(-1004296626, var9 ^ -2068922684);
            case 160 -> a(-1004296631, var9 ^ 75112676);
            case 161 -> a(-1004296632, var9 ^ -515873425);
            case 162 -> a(-1004296629, var9 ^ 186314645);
            case 163 -> 3;
            case 164 -> a(-1004296630, var9 ^ 2099220292);
            case 165 -> a(-1004296635, var9 ^ -1635783952);
            case 166 -> a(-1004296636, var9 ^ 1209390964);
            case 167 -> 2;
            case 168 -> a(-1004296633, var9 ^ 2044933902);
            case 169 -> a(-1004296634, var9 ^ 1232730360);
            case 170 -> a(-1004296639, var9 ^ -3304649);
            case 171 -> a(-1004296640, var9 ^ 79321191);
            case 172 -> a(-1004296637, var9 ^ -525288974);
            case 173 -> a(-1004296638, var9 ^ 2040415091);
            case 174 -> a(-1004296611, var9 ^ -634764719);
            case 175 -> a(-1004296612, var9 ^ 1204985688);
            case 176 -> a(-1004296609, var9 ^ 433934650);
            case 177 -> a(-1004296610, var9 ^ 1499778414);
            case 178 -> a(-1004296615, var9 ^ -1729263334);
            case 179 -> a(-1004296616, var9 ^ -1860409124);
            case 180 -> a(-1004296613, var9 ^ -301650797);
            case 181 -> a(-1004296614, var9 ^ -1590555129);
            case 182 -> a(-1004296619, var9 ^ 28844925);
            case 183 -> a(-1004296620, var9 ^ 996114495);
            case 184 -> a(-1004296617, var9 ^ 1531632475);
            case 185 -> 5;
            case 186 -> a(-1004296618, var9 ^ 223433119);
            case 187 -> a(-1004296623, var9 ^ -1307985934);
            case 188 -> a(-1004296624, var9 ^ -1586500777);
            case 189 -> a(-1004296621, var9 ^ -1685435921);
            case 190 -> a(-1004296622, var9 ^ 1384229495);
            case 191 -> a(-1004296659, var9 ^ 1955199078);
            case 192 -> a(-1004296660, var9 ^ 1330850447);
            case 193 -> a(-1004296657, var9 ^ -146338294);
            case 194 -> a(-1004296658, var9 ^ 2018100160);
            case 195 -> a(-1004296663, var9 ^ 2060795720);
            case 196 -> a(-1004296664, var9 ^ -1492053677);
            case 197 -> a(-1004296661, var9 ^ -1448181889);
            case 198 -> a(-1004296662, var9 ^ -2025855463);
            case 199 -> a(-1004296667, var9 ^ 1187305665);
            case 200 -> a(-1004296668, var9 ^ 31010114);
            case 201 -> a(-1004296665, var9 ^ -297329355);
            case 202 -> a(-1004296666, var9 ^ -1784179791);
            case 203 -> a(-1004296671, var9 ^ 628807357);
            case 204 -> a(-1004296672, var9 ^ -1206506603);
            case 205 -> a(-1004296669, var9 ^ -806620130);
            case 206 -> a(-1004296670, var9 ^ -1846356008);
            case 207 -> a(-1004296643, var9 ^ 939943477);
            case 208 -> a(-1004296644, var9 ^ 778156343);
            case 209 -> a(-1004296641, var9 ^ 1222238020);
            case 210 -> a(-1004296642, var9 ^ 1390591753);
            case 211 -> a(-1004296647, var9 ^ -2056792759);
            case 212 -> a(-1004296648, var9 ^ -498978343);
            case 213 -> a(-1004296645, var9 ^ -789848999);
            case 214 -> a(-1004296646, var9 ^ 513874859);
            case 215 -> a(-1004296651, var9 ^ 1357457072);
            case 216 -> a(-1004296652, var9 ^ 1411755939);
            case 217 -> a(-1004296649, var9 ^ 1051655470);
            case 218 -> a(-1004296650, var9 ^ 763076369);
            case 219 -> a(-1004296655, var9 ^ -995084125);
            case 220 -> a(-1004296656, var9 ^ -1547732123);
            case 221 -> a(-1004296653, var9 ^ 1685112445);
            case 222 -> a(-1004296654, var9 ^ -172306325);
            case 223 -> a(-1004296691, var9 ^ -1017935590);
            case 224 -> a(-1004296692, var9 ^ 2036471807);
            case 225 -> a(-1004296689, var9 ^ -743822894);
            case 226 -> a(-1004296690, var9 ^ -438402334);
            case 227 -> a(-1004296695, var9 ^ -890301749);
            case 228 -> a(-1004296696, var9 ^ 514768637);
            case 229 -> a(-1004296693, var9 ^ 285457923);
            case 230 -> a(-1004296694, var9 ^ 1477206031);
            case 231 -> a(-1004296699, var9 ^ 1485992721);
            case 232 -> a(-1004296700, var9 ^ 1264387290);
            case 233 -> a(-1004296697, var9 ^ 457010433);
            case 234 -> a(-1004296698, var9 ^ -1875326907);
            case 235 -> a(-1004296703, var9 ^ 232483688);
            case 236 -> a(-1004296704, var9 ^ 887034167);
            case 237 -> a(-1004296701, var9 ^ -1277069048);
            case 238 -> a(-1004296702, var9 ^ 2113320055);
            case 239 -> a(-1004296675, var9 ^ 302997542);
            case 240 -> a(-1004296676, var9 ^ 2102069605);
            case 241 -> a(-1004296673, var9 ^ -1611495217);
            case 242 -> 4;
            case 243 -> a(-1004296674, var9 ^ 1431260406);
            case 244 -> a(-1004296679, var9 ^ -932620799);
            case 245 -> a(-1004296680, var9 ^ 2108046729);
            case 246 -> a(-1004296677, var9 ^ 589472010);
            case 247 -> a(-1004296678, var9 ^ 329264547);
            case 248 -> a(-1004296683, var9 ^ -1542451951);
            case 249 -> a(-1004296684, var9 ^ -2039550716);
            case 250 -> a(-1004296681, var9 ^ -855270844);
            case 251 -> a(-1004296682, var9 ^ -600745176);
            case 252 -> a(-1004296687, var9 ^ 1403172990);
            case 253 -> a(-1004296688, var9 ^ -1617253057);
            case 254 -> a(-1004296685, var9 ^ -2072624878);
            default -> a(-1004296686, var9 ^ -343528518);
         };
         int var5 = (var1 & a(-1004296211, var9 ^ 1822386939)) - var4;
         if (var5 < 0) {
            var5 += 256;
         }

         int var6 = ((var1 & a(-1004296212, var9 ^ 2086790115)) >>> a(-1004296209, var9 ^ -830326014)) - var4;
         if (var6 < 0) {
            var6 += 256;
         }

         for (int var7 = 0; var7 < var3.length; var7++) {
            int var8 = var7 % 2;
            char var10002 = var3[var7];
            if (var8 == 0) {
               var3[var7] = (char)(var10002 ^ var5);
               var5 = ((var5 >>> 3 | var5 << 5) ^ var3[var7]) & a(-1004296210, var9 ^ -1787530768);
            } else {
               var3[var7] = (char)(var10002 ^ var6);
               var6 = ((var6 >>> 3 | var6 << 5) ^ var3[var7]) & a(-1004296215, var9 ^ -1896273703);
            }
         }

         aba[var2] = new String(var3).intern();
      }

      return aba[var2];
   }

   private static long bb(int var0, long var1) {
      int var3 = (var0 ^ (int)var1 ^ a(-1004296216, 276396439 ^ 1220878513)) & a(-1004296213, 276396439 ^ 1927816663);
      if (aaa[var3] == null) {
         aaa[var3] = ab[var3] ^ var1;
      }

      return aaa[var3];
   }

   private static void aaa() {
      int var0 = -622975854;
      bb[0] = ab(
         b(a(-1004296214, var0 ^ 1453617230), a(-1004296219, var0 ^ 1493308923)).toCharArray(),
         bb(a(-1004296220, var0 ^ -1100877947), 989994066204251790L),
         ba(a(-1004296217, var0 ^ -454149810), 4839869147391694493L)
      );
      bb[1] = ab(
         b(a(-1004296218, var0 ^ 1119542707), a(-1004296223, var0 ^ 505652635)).toCharArray(),
         bb(a(-1004296224, var0 ^ -193754035), 415400521784286845L),
         ba(a(-1004296221, var0 ^ 1457486018), 6126265669861262269L)
      );
   }

   // $VF: Irreducible bytecode was duplicated to produce valid code
   static {
      int var34 = -1145351976;
      short var23 = 10696;
      char[] var25 = "U\u0010\n\u0010\n\u0010\n".toCharArray();
      String var24 = "쥧茢禇̟♑\u192d\u2e6e鐒衞肰벎ፙ\uefb2撓鸞籬䚬\uda7aꂧ\ue887\uf46a塊顱괬汈䏀\ue7b6㕼翷乤砢ꓢᷚ椻ೳ퐖㬽٪渧䬌똀鐞ﲳЦೇ蠒ⵧ燚䨙疭뱂烵ꆂ⾰欚瀃倖曳\uee13㈐㥾凰烽⛿ᵝ蓺⤮唴﮺㞬\ude24귱\uf6bb뙾炱ṍ꼧螶\u31ef䄎✱権ප읪썕嗛啾唩嗽唹啋啵啭啮唝喆唵嗨啮嗊啕\uf745\uf78d\uf712\uf759\uf70f\uf72d\uf73f\uf7e1\uf77a\uf74f뿰뽭뽧뽎뿧뽩뼂뿁뿨뾡뽠뾛뽻뿂뼝뿓禢祪秵禾秨秊秘礆禝禨徭爫全縉祐惘爫\ufa6e𥳐流\ufaf0\ufafe度\ufaef喝恵져죰졯젤졲졐졂좜젇젲";
      byte var30 = -1;
      String[] var26 = new String[var25.length];

      while (true) {
         int var27 = 0;
         char var28 = 0;
         char var29 = '\u0000';
         if (var30 == 0) {
            baa = var26;
            bab = new Object[var26.length];
            abb = new int[307];
            byte var38 = 0;
            int var10001 = 0;
            byte[] var10002 = "õ»\u008b\u0089\u0081?áÜE<Næ÷p9ø¸û\\èËO®0t\u001d5P\u0004\u007f5¼cõho$ioºxÝ\u001f;}zìË`÷½§W1QÑÑ@ä{ÞðR÷FùWFÔô\u0012w3:´öÚ\u001df\u008d¨_éÈëlYª\u0088D\n¡=¥Nm\\\u0011\u0091.»ù\u0085ø\u0084m\u0007½(\u0006þ»Ú¨céô\u0084C\u0082\u008b+Ù\u0010]\u009au¥nÙ¢bÑ`\u0090ö,àI\u0013 Zï}RgRãn\u0010Ì*\u0088\u001b>\u0083k\u009f@Yå¥´\u0094ÍÀ\u0094Ì\u000e\"ýWj%4ë;ÃÁ\u001f\u001c\u007fñä5$ä¥ÑJáãªÀ$YqRÛ\u001dÍS6\u0019\u0086H¶\u0090tÏå\u0080ï¹Ý\u0088à2Bª¨¦mû\u001fùl7Æ&èÿ?£F1T°\u0080¿7·.\nZk^7Ó\u008eçg\u0082ðJðx\u009f¬\u0081'êÞL·\u0007¬é\u0087uw\u009b8.á¹\u008c^ójh©d}\u009e\u0013¼Ý?ôu¨a2¤øA\u0003h\u008e|[ol\u001cy¶ÅògÿðMé\u0000Tw\u0090Tè\u0089rñþÂÐê\u0007z\u001a\u008a+ãÕ\">¼²\u0018#U\u0005ª\u0015G(&i@×Ñ(&E\u001ac¡\u0011ã\u009e\u008af1¹;$}*\u0013±Þ7<QÙã\u0080i;¢þ>¤\u0080³baz\u0017Ëà \u0011\u0080ô\u0095ôjJ\u001aÔ(VK\u0012ë\u007f(§\u0096'éÌä\u001c\u0010\r\u0081J\u0012Ç|C4ÊR\u0083á/ßKË\u009c\u0090\u008e\u009eÃÏÿ!ü7+\u0099±ñvwôD Üf[¢r\u0018\u00051èT\u0002}_\u0005ã'¥^pZ¦A\u0014\u0016ci7tV\u0099L=\ba\u001c^bä\u0095diß|\u0081dÑð®3qögSÒ®«/d¥·7êé_Ü®\u0003\u0006¹ÐMÀÉ\u0001ÍÛ\u0005\n\u0085;ëyÕÿ8\u0019åð|\u0006,\u0019#ü¢ðd\u0011ð\u0097ã¾¿\u008c8c\u0012\u0018\u0019ôhà|\u0099ìñàTê°¨_³é^C·\u009b>\u001eJb³oähÝ0é\u009f\u001d/8è8!>QÀ\u0003\u0019UUõò\u0091Bþ\u001dCxÞB_P]¥ÊO½áår\u001aùûwç3äÇ\n\u009dðþ\u0099·à»&á\u0084ËHô\u0094Å$Ên\u0003i|\u0083;é¨\u0019Ê\f\u0092\\eæÈÓ§\u0090Í²½s\u00ad×©¥Çê-\u00941\u000e}¤«Á\u0098\u0012\u001f®géhe£\rb\u0085É\u0094L~\u00197ø\u007fâª\u0000¦Qô\u000fl\u009f´¶ð\u008fu?´\u0080|ÎUJ\u0003×\u0011/Là3éìj\u0019±Ö\u008d¹]¶\u0098æ\u0084à\u0083hö_Û\u008a\u0082L½ÖãvXp×¿S\u0097Õ\u0099[Á.¢\u0081\u0010\t\u001a\u00953\u0084\u0095\u009bú\u0086\u0097\u0007\u0006\u000bJÃ(8D|C$jíÛ\u0011«\u0016å-ì\u000b\u0010ï\u0003\u0095 \u009dxu®,È¨ïÕUÄ\u0016¬\"9ÈJ| ê\u0018ÕÔ[þÃ³\u0084«¥\u000bây¿0\u0086whµïð\u000f\u0090\f'=9æóós\"Û½;\u001bV¹÷\u0096¯Ó|À4À©¢\u0083)b\u0005`NmA÷\u0089¢û¢\u0018hé\u0015.\u0081´<\u0094°*ó>x\u00147\b\f»½'=/tó|\u0087\u0097üÑ\u0083\u0018µÞ]\u0082µ@N¬¦\u008f9\u0001öïTT}êõÆà\tW\u0017Ù\r,\u0099^3C\u0088\u0090$\u008d*ÿÝ]Ï\u0090\u00994fr µ+¸\u009dqC%»kÙ\u0090t\u0000qÎð\u0098\"þr\u0010AIÂ0Øk¼Ð¶ ×§\u00971ãf+¾p\u0081\u0015rH\u0091Si¤|\u0012\u0006T\u0012\u0098\u0081MQ´\u0091²ß\u00ad#P\u0007Jx¦J¼c+\u0013\u0092\u0097\u0011ã§RÃmì¼(1I³\u008f\u000f¸Tí¿D\u000eb{Í¨6\u009c¯ô¯yz\u001eÿôb¼Rù¦ÇºI\u001f\r\u008cÅE\u009bñ\u007f\u0006p\u0082KÙûDð\u008fýbê\u009a?K\u008dþ6-ÛÀÏ¯\u0097s_\u00070Ö+\tXá¦³\u0089#¾3)kû£\u0016\u00adÝiº\u0012¹õAG\u009fåÉUk\u0005A\u0017\u0098\u009d\u0004\u0017ý\u0097ù\u0089\u0088\u009eVtÇ¸!õ¡íØBP9gH½Û(Ì±\u001etR+ð\u0085\u0003áñæe¨ðâ\u000f\u009e¿Äg²ym\u008eØ\u001d\u0085wØt*\u0086]/÷×\u0018¾ª\u0001H=Ü\u0090"
               .getBytes("ISO-8859-1");

            int var76;
            do {
               abb[var38] = (
                     (var10002[var10001] & 255) << 24
                        | (var10002[var10001 + 1] & 255) << 16
                        | (var10002[var10001 + 2] & 255) << 8
                        | var10002[var10001 + 3] & 255
                  )
                  ^ 193863023;
               var38 += 1;
               var76 = var10001 + 4;
               var10001 += 4;
            } while (var76 < var10002.length);

            String[] var21 = new String[2];
            int var19 = 0;
            String var18;
            int var20 = (var18 = aab((short)4707, 28565, (byte)-64, 1507817844, 103)).length();
            int var17 = a(-1004296222, var34 ^ 1280485395);
            int var16 = -1;

            while (true) {
               label120: {
                  char[] var42 = var18.substring(++var16, var16 + var17).toCharArray();
                  var76 = var42.length;
                  int var22 = 0;
                  var62 = var42;
                  var10001 = var76;
                  char[] var80;
                  int var97;
                  if (var76 <= 1) {
                     var80 = var42;
                     var97 = var22;
                  } else {
                     var62 = var42;
                     var10001 = var76;
                     if (var76 <= var22) {
                        break label120;
                     }

                     var80 = var42;
                     var97 = var22;
                  }

                  while (true) {
                     var80[var97] = (char)(var80[var97] ^ switch (var22 % a(-1004296195, var34 ^ -2040257473)) {
                        case 0 -> a(-1004296196, var34 ^ 270114520);
                        case 1 -> a(-1004296193, var34 ^ -76895379);
                        case 2 -> a(-1004296194, var34 ^ 1890324972);
                        case 3 -> a(-1004296199, var34 ^ 1988758420);
                        case 4 -> a(-1004296200, var34 ^ -1264358078);
                        case 5 -> a(-1004296197, var34 ^ -1111147810);
                        default -> a(-1004296198, var34 ^ 1145533972);
                     });
                     var22++;
                     if (var10001 == 0) {
                        var97 = var10001;
                        var80 = var62;
                     } else {
                        if (var10001 <= var22) {
                           break;
                        }

                        var80 = var62;
                        var97 = var22;
                     }
                  }
               }

               String var87 = new String(var62).intern();
               int var49 = -1;
               var21[var19++] = var87;
               if ((var16 += var17) >= var20) {
                  aab = var21;
                  aba = new String[2];
                  long var8 = 1295522401843066071L;
                  long[] var14 = new long[4];
                  int var11 = 0;
                  String var12;
                  int var13 = (var12 = aab((short)13581, 6557, (byte)39, 1507817845, (byte)50)).length();
                  byte var10 = 0;

                  label104:
                  while (true) {
                     var49 = var10;
                     var10 += 8;
                     byte[] var15 = var12.substring(var49, var10).getBytes(aab((short)-28319, (short)-8129, (byte)-36, 1507817846, (byte)96));
                     long[] var39 = var14;
                     var49 = var11++;
                     long var67 = (var15[0] & 255L) << a(-1004296203, var34 ^ -722480695)
                        | (var15[1] & 255L) << a(-1004296204, var34 ^ -1595819529)
                        | (var15[2] & 255L) << a(-1004296201, var34 ^ 760965230)
                        | (var15[3] & 255L) << a(-1004296202, var34 ^ 903596079)
                        | (var15[4] & 255L) << a(-1004296207, var34 ^ 1884026390)
                        | (var15[5] & 255L) << a(-1004296208, var34 ^ 1451317920)
                        | (var15[a(-1004296205, var34 ^ 840802340)] & 255L) << a(-1004296206, var34 ^ 336406589)
                        | var15[a(-1004296243, var34 ^ -521297827)] & 255L;
                     byte var88 = -1;

                     while (true) {
                        long var99 = var67 ^ var8;
                        switch (var88) {
                           case 0:
                              var39[var49] = var99;
                              if (var10 >= var13) {
                                 aa = var14;
                                 ba = new Integer[4];
                                 long var0 = 3646987441585012876L;
                                 long[] var6 = new long[2];
                                 int var3 = 0;
                                 String var4;
                                 int var5 = (var4 = aab((short)-1089, 30925, (byte)75, 1507817841, 106)).length();
                                 byte var2 = 0;

                                 do {
                                    int var53 = var2;
                                    var2 += 8;
                                    byte[] var7 = var4.substring(var53, var2).getBytes(aab((short)-18999, 1127, (byte)103, 1507817842, (byte)82));
                                    var53 = var3++;
                                    var99 = (
                                          (var7[0] & 255L) << a(-1004296249, var34 ^ 1780025160)
                                             | (var7[1] & 255L) << a(-1004296250, var34 ^ 588776235)
                                             | (var7[2] & 255L) << a(-1004296255, var34 ^ 358032668)
                                             | (var7[3] & 255L) << a(-1004296256, var34 ^ 965840124)
                                             | (var7[4] & 255L) << a(-1004296253, var34 ^ 1408591358)
                                             | (var7[5] & 255L) << a(-1004296254, var34 ^ 1402784262)
                                             | (var7[a(-1004296227, var34 ^ -691595622)] & 255L) << a(-1004296228, var34 ^ -1823061177)
                                             | var7[a(-1004296225, var34 ^ -1009435192)] & 255L
                                       )
                                       ^ var0;
                                    var88 = -1;
                                    var6[var53] = var99;
                                 } while (var2 < var5);

                                 ab = var6;
                                 aaa = new Long[2];
                                 bb = new String[2];
                                 aaa();
                                 return;
                              }
                              break;
                           default:
                              var39[var49] = var99;
                              if (var10 < var13) {
                                 continue label104;
                              }

                              var13 = (var12 = aab((short)-23145, (short)-25562, (byte)35, 1507817847, (byte)-26)).length();
                              var10 = 0;
                        }

                        byte var52 = var10;
                        var10 += 8;
                        var15 = var12.substring(var52, var10).getBytes(aab((short)-29371, (short)29339, (byte)107, 1507817840, (byte)-74));
                        var39 = var14;
                        var49 = var11++;
                        var67 = (var15[0] & 255L) << a(-1004296244, var34 ^ 326493489)
                           | (var15[1] & 255L) << a(-1004296241, var34 ^ 1988040868)
                           | (var15[2] & 255L) << a(-1004296242, var34 ^ 58111744)
                           | (var15[3] & 255L) << a(-1004296247, var34 ^ 1280360590)
                           | (var15[4] & 255L) << a(-1004296248, var34 ^ 704985280)
                           | (var15[5] & 255L) << a(-1004296245, var34 ^ -607025215)
                           | (var15[a(-1004296246, var34 ^ 909363606)] & 255L) << a(-1004296251, var34 ^ 989238541)
                           | var15[a(-1004296252, var34 ^ -1609014208)] & 255L;
                        var88 = 0;
                     }
                  }
               }

               var17 = var18.charAt(var16);
            }
         }

         do {
            var29 = var25[var27];
            char[] var31 = var24.substring(var28, var28 + var29).toCharArray();
            int var32 = 0;

            do {
               short var33 = switch (var32 % 6) {
                  default -> 95;
                  case 1 -> 140;
                  case 2 -> 12;
                  case 3 -> 36;
                  case 4 -> 96;
                  case 5 -> 67;
               };
               var31[var32] = (char)(var31[var32] ^ var33 ^ var23);
            } while (++var32 < var31.length);

            var26[var27] = new String(var31).intern();
            var28 += var29;
         } while (++var27 < var25.length);

         var30 = 0;
      }
   }

   public babaaa() {
      super(
         aabbaaaba.aaab(bb[1]),
         bbaabbba.bab,
         aabbaaaba.aaab(bb[0])
      );
   }
}
