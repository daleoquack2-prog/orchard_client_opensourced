package nsc;

import net.fabricmc.api.EnvType;
import net.fabricmc.api.Environment;
import net.minecraft.class_1799;
import net.minecraft.class_1842;
import net.minecraft.class_1844;
import net.minecraft.class_2960;
import net.minecraft.class_6880;
import net.minecraft.class_746;
import net.minecraft.class_7923;
import net.minecraft.class_9334;

@Environment(EnvType.CLIENT)
public final class baab extends abbaabbaa {
   private static final long[] aa;
   private final ababbbba ab;
   private final ababbbba ba;
   private static final String[] aabb;
   private aaaaaaba bb;
   private static final int aaa;
   private static final String[] aab;
   private static final int[] aaba;
   private final ababbbba aba;
   private static final String[] abb;
   private final bababa baa;
   private int bab;
   private static final Integer[] bba;
   private final ababbbba bbb;
   private aaaaaaba aaaa;
   private static final Object[] abaa;
   private final ababbbba aaab;

   private static int aa(int var0, long var1) {
      int var3 = var0 ^ (int)(var1 & 32767L) ^ a(-552833537, -17908911 ^ -674187634);
      if (bba[var3] == null) {
         bba[var3] = (int)(aa[var3] ^ var1);
      }

      return bba[var3];
   }

   private String ab(aaaaaaba param1) {
      // $VF: Couldn't be decompiled
      // Please report this to the Vineflower issue tracker, at https://github.com/Vineflower/vineflower/issues with a copy of the class file (if you have the rights to distribute it!)
      // java.lang.IndexOutOfBoundsException: Index 1 out of bounds for length 0
      //   at java.base/jdk.internal.util.Preconditions.outOfBounds(Preconditions.java:100)
      //   at java.base/jdk.internal.util.Preconditions.outOfBoundsCheckIndex(Preconditions.java:106)
      //   at java.base/jdk.internal.util.Preconditions.checkIndex(Preconditions.java:302)
      //   at java.base/java.util.Objects.checkIndex(Objects.java:385)
      //   at java.base/java.util.ArrayList.get(ArrayList.java:427)
      //   at org.jetbrains.java.decompiler.modules.decompiler.SwitchHelper.simplifySwitchOnEnumJ21(SwitchHelper.java:341)
      //   at org.jetbrains.java.decompiler.modules.decompiler.SwitchHelper.simplify(SwitchHelper.java:41)
      //   at org.jetbrains.java.decompiler.modules.decompiler.SwitchHelper.simplifySwitches(SwitchHelper.java:30)
      //   at org.jetbrains.java.decompiler.modules.decompiler.SwitchHelper.simplifySwitches(SwitchHelper.java:34)
      //   at org.jetbrains.java.decompiler.modules.decompiler.SwitchHelper.simplifySwitches(SwitchHelper.java:34)
      //   at org.jetbrains.java.decompiler.main.rels.MethodProcessor.codeToJava(MethodProcessor.java:388)
      //
      // Bytecode:
      // 00: aload 1
      // 01: invokevirtual qeaa361f143ee4a0894bd168fd9b30c66/qf4ccf8f5435d4a78bdca4d6a018b578e/aaaaaaba.ordinal ()I
      // 04: tableswitch 36 0 4 47 57 67 77 87
      // 28: new java/lang/MatchException
      // 2b: dup
      // 2c: aconst_null
      // 2d: aconst_null
      // 2e: invokespecial java/lang/MatchException.<init> (Ljava/lang/String;Ljava/lang/Throwable;)V
      // 31: athrow
      // 32: athrow
      // 33: aload 0
      // 34: getfield qeaa361f143ee4a0894bd168fd9b30c66/qf4ccf8f5435d4a78bdca4d6a018b578e/baab.aba Lqeaa361f143ee4a0894bd168fd9b30c66/qf4ccf8f5435d4a78bdca4d6a018b578e/ababbbba;
      // 37: invokevirtual qeaa361f143ee4a0894bd168fd9b30c66/qf4ccf8f5435d4a78bdca4d6a018b578e/ababbbba.abb ()Ljava/lang/String;
      // 3a: goto 62
      // 3d: aload 0
      // 3e: getfield qeaa361f143ee4a0894bd168fd9b30c66/qf4ccf8f5435d4a78bdca4d6a018b578e/baab.aaab Lqeaa361f143ee4a0894bd168fd9b30c66/qf4ccf8f5435d4a78bdca4d6a018b578e/ababbbba;
      // 41: invokevirtual qeaa361f143ee4a0894bd168fd9b30c66/qf4ccf8f5435d4a78bdca4d6a018b578e/ababbbba.abb ()Ljava/lang/String;
      // 44: goto 62
      // 47: aload 0
      // 48: getfield qeaa361f143ee4a0894bd168fd9b30c66/qf4ccf8f5435d4a78bdca4d6a018b578e/baab.ab Lqeaa361f143ee4a0894bd168fd9b30c66/qf4ccf8f5435d4a78bdca4d6a018b578e/ababbbba;
      // 4b: invokevirtual qeaa361f143ee4a0894bd168fd9b30c66/qf4ccf8f5435d4a78bdca4d6a018b578e/ababbbba.abb ()Ljava/lang/String;
      // 4e: goto 62
      // 51: aload 0
      // 52: getfield qeaa361f143ee4a0894bd168fd9b30c66/qf4ccf8f5435d4a78bdca4d6a018b578e/baab.ba Lqeaa361f143ee4a0894bd168fd9b30c66/qf4ccf8f5435d4a78bdca4d6a018b578e/ababbbba;
      // 55: invokevirtual qeaa361f143ee4a0894bd168fd9b30c66/qf4ccf8f5435d4a78bdca4d6a018b578e/ababbbba.abb ()Ljava/lang/String;
      // 58: goto 62
      // 5b: aload 0
      // 5c: getfield qeaa361f143ee4a0894bd168fd9b30c66/qf4ccf8f5435d4a78bdca4d6a018b578e/baab.bbb Lqeaa361f143ee4a0894bd168fd9b30c66/qf4ccf8f5435d4a78bdca4d6a018b578e/ababbbba;
      // 5f: invokevirtual qeaa361f143ee4a0894bd168fd9b30c66/qf4ccf8f5435d4a78bdca4d6a018b578e/ababbbba.abb ()Ljava/lang/String;
      // 62: areturn
   }

   private static String ba(int var0, int var1) {
      int var9 = 428202900;
      int var2 = (var0 ^ a(-552833538, var9 ^ 709798857)) & a(-552833539, var9 ^ 190597517);
      if (aab[var2] == null) {
         char[] var3 = abb[var2].toCharArray();

         int var4 = switch (var3[0] & a(-552833540, var9 ^ -1284891484)) {
            case 0 -> a(-552833541, var9 ^ -2053681466);
            case 1 -> a(-552833542, var9 ^ -2083972857);
            case 2 -> a(-552833543, var9 ^ -280269498);
            case 3 -> a(-552833544, var9 ^ -1499088507);
            case 4 -> a(-552833545, var9 ^ 1312729353);
            case 5 -> a(-552833546, var9 ^ -601949360);
            case 6 -> a(-552833547, var9 ^ -616997738);
            case 7 -> a(-552833548, var9 ^ 446839156);
            case 8 -> a(-552833549, var9 ^ 2010612844);
            case 9 -> a(-552833550, var9 ^ 838754563);
            case 10 -> a(-552833551, var9 ^ 1648093056);
            case 11 -> a(-552833552, var9 ^ -168013168);
            case 12 -> a(-552833553, var9 ^ 1883491403);
            case 13 -> a(-552833554, var9 ^ -522001587);
            case 14 -> a(-552833555, var9 ^ -1211328540);
            case 15 -> a(-552833556, var9 ^ 528437115);
            case 16 -> a(-552833557, var9 ^ 1830560833);
            case 17 -> a(-552833558, var9 ^ 847699262);
            case 18 -> a(-552833559, var9 ^ 413385256);
            case 19 -> a(-552833560, var9 ^ -1733893808);
            case 20 -> a(-552833561, var9 ^ 1318846395);
            case 21 -> a(-552833562, var9 ^ -1177480217);
            case 22 -> a(-552833563, var9 ^ 1249043298);
            case 23 -> a(-552833564, var9 ^ 825507683);
            case 24 -> a(-552833565, var9 ^ -306127995);
            case 25 -> a(-552833566, var9 ^ -225751312);
            case 26 -> a(-552833567, var9 ^ -605285171);
            case 27 -> a(-552833568, var9 ^ -2131526922);
            case 28 -> a(-552833569, var9 ^ -2130989994);
            case 29 -> a(-552833570, var9 ^ -1263664021);
            case 30 -> a(-552833571, var9 ^ 361948748);
            case 31 -> a(-552833572, var9 ^ -590978605);
            case 32 -> a(-552833573, var9 ^ 510139148);
            case 33 -> 5;
            case 34 -> a(-552833574, var9 ^ 286817426);
            case 35 -> a(-552833575, var9 ^ -813769530);
            case 36 -> a(-552833576, var9 ^ -2112022797);
            case 37 -> a(-552833577, var9 ^ -2102186036);
            case 38 -> a(-552833578, var9 ^ -1764186397);
            case 39 -> a(-552833579, var9 ^ -2011247663);
            case 40 -> a(-552833580, var9 ^ -792387202);
            case 41 -> a(-552833581, var9 ^ 28630390);
            case 42 -> a(-552833582, var9 ^ 1820306947);
            case 43 -> a(-552833583, var9 ^ -408589535);
            case 44 -> a(-552833584, var9 ^ -1211826720);
            case 45 -> a(-552833585, var9 ^ -1843309430);
            case 46 -> a(-552833586, var9 ^ -366140205);
            case 47 -> a(-552833587, var9 ^ 334612785);
            case 48 -> a(-552833588, var9 ^ -1411866786);
            case 49 -> 1;
            case 50 -> a(-552833589, var9 ^ 508053025);
            case 51 -> a(-552833590, var9 ^ 696443671);
            case 52 -> a(-552833591, var9 ^ -139348988);
            case 53 -> a(-552833592, var9 ^ 598237629);
            case 54 -> a(-552833593, var9 ^ -1668738883);
            case 55 -> a(-552833594, var9 ^ -307470795);
            case 56 -> a(-552833595, var9 ^ 633405626);
            case 57 -> a(-552833596, var9 ^ -2037777699);
            case 58 -> a(-552833597, var9 ^ 772931466);
            case 59 -> a(-552833598, var9 ^ 605102304);
            case 60 -> a(-552833599, var9 ^ 1328222374);
            case 61 -> a(-552833600, var9 ^ 348059544);
            case 62 -> a(-552833601, var9 ^ 1575792422);
            case 63 -> a(-552833602, var9 ^ 1506205334);
            case 64 -> a(-552833603, var9 ^ 846275184);
            case 65 -> a(-552833604, var9 ^ 520882025);
            case 66 -> a(-552833605, var9 ^ 1959176494);
            case 67 -> a(-552833606, var9 ^ 2117343280);
            case 68 -> a(-552833607, var9 ^ -2132680880);
            case 69 -> a(-552833608, var9 ^ -1006633244);
            case 70 -> a(-552833609, var9 ^ 1302659685);
            case 71 -> a(-552833610, var9 ^ -1835558395);
            case 72 -> a(-552833611, var9 ^ 1562153543);
            case 73 -> a(-552833612, var9 ^ 1177239867);
            case 74 -> a(-552833613, var9 ^ -1802999754);
            case 75 -> a(-552833614, var9 ^ -422042438);
            case 76 -> a(-552833615, var9 ^ 999570802);
            case 77 -> a(-552833616, var9 ^ 1767509763);
            case 78 -> a(-552833617, var9 ^ -1692712340);
            case 79 -> 2;
            case 80 -> a(-552833618, var9 ^ -1401191799);
            case 81 -> a(-552833619, var9 ^ 846787236);
            case 82 -> a(-552833620, var9 ^ -578573324);
            case 83 -> a(-552833621, var9 ^ -1118050711);
            case 84 -> a(-552833622, var9 ^ -1778440866);
            case 85 -> a(-552833623, var9 ^ 1700469712);
            case 86 -> a(-552833624, var9 ^ -680443064);
            case 87 -> a(-552833625, var9 ^ -504933085);
            case 88 -> a(-552833626, var9 ^ -822974746);
            case 89 -> a(-552833627, var9 ^ -1374847894);
            case 90 -> a(-552833628, var9 ^ 1184426564);
            case 91 -> a(-552833629, var9 ^ -1556540282);
            case 92 -> a(-552833630, var9 ^ -1142538399);
            case 93 -> a(-552833631, var9 ^ -1792003778);
            case 94 -> a(-552833632, var9 ^ 682013446);
            case 95 -> a(-552833633, var9 ^ 914723551);
            case 96 -> a(-552833634, var9 ^ 1222737410);
            case 97 -> a(-552833635, var9 ^ 625999099);
            case 98 -> a(-552833636, var9 ^ 263908215);
            case 99 -> a(-552833637, var9 ^ -1885766909);
            case 100 -> a(-552833638, var9 ^ -650530940);
            case 101 -> a(-552833639, var9 ^ 791790628);
            case 102 -> a(-552833640, var9 ^ 1969006046);
            case 103 -> a(-552833641, var9 ^ -921769781);
            case 104 -> a(-552833642, var9 ^ 263473638);
            case 105 -> a(-552833643, var9 ^ 1740614136);
            case 106 -> a(-552833644, var9 ^ -106972607);
            case 107 -> a(-552833645, var9 ^ 1575879919);
            case 108 -> a(-552833646, var9 ^ -1420389682);
            case 109 -> a(-552833647, var9 ^ 718307910);
            case 110 -> a(-552833648, var9 ^ 892630365);
            case 111 -> a(-552833649, var9 ^ 1689486444);
            case 112 -> a(-552833650, var9 ^ -1791409882);
            case 113 -> a(-552833651, var9 ^ -446137736);
            case 114 -> a(-552833652, var9 ^ -1667999922);
            case 115 -> a(-552833653, var9 ^ -99280723);
            case 116 -> a(-552833654, var9 ^ 330727554);
            case 117 -> a(-552833655, var9 ^ 562096959);
            case 118 -> a(-552833656, var9 ^ -1454531413);
            case 119 -> a(-552833657, var9 ^ 1532308917);
            case 120 -> a(-552833658, var9 ^ -811568544);
            case 121 -> a(-552833659, var9 ^ -1262447680);
            case 122 -> a(-552833660, var9 ^ 1094489533);
            case 123 -> a(-552833661, var9 ^ 997708838);
            case 124 -> a(-552833662, var9 ^ 925294465);
            case 125 -> a(-552833663, var9 ^ 485405917);
            case 126 -> a(-552833664, var9 ^ 1709298105);
            case 127 -> a(-552833665, var9 ^ 2056102327);
            case 128 -> a(-552833666, var9 ^ 1959492065);
            case 129 -> a(-552833667, var9 ^ -837935150);
            case 130 -> a(-552833668, var9 ^ -1211072276);
            case 131 -> a(-552833669, var9 ^ -464486771);
            case 132 -> a(-552833670, var9 ^ -654771929);
            case 133 -> a(-552833671, var9 ^ 44728603);
            case 134 -> a(-552833672, var9 ^ 215829684);
            case 135 -> a(-552833673, var9 ^ 812893181);
            case 136 -> a(-552833674, var9 ^ 1658603005);
            case 137 -> a(-552833675, var9 ^ 1514626820);
            case 138 -> a(-552833676, var9 ^ -510353461);
            case 139 -> a(-552833677, var9 ^ 1800620010);
            case 140 -> a(-552833678, var9 ^ 1907689260);
            case 141 -> a(-552833679, var9 ^ -958740270);
            case 142 -> a(-552833680, var9 ^ -901536011);
            case 143 -> a(-552833681, var9 ^ 1784906675);
            case 144 -> a(-552833682, var9 ^ -502744318);
            case 145 -> a(-552833683, var9 ^ 169656057);
            case 146 -> 3;
            case 147 -> a(-552833684, var9 ^ 354915933);
            case 148 -> a(-552833685, var9 ^ 1111826768);
            case 149 -> a(-552833686, var9 ^ -1501026349);
            case 150 -> a(-552833687, var9 ^ 498919908);
            case 151 -> a(-552833688, var9 ^ -1307378076);
            case 152 -> a(-552833689, var9 ^ -849877479);
            case 153 -> a(-552833690, var9 ^ 1563584159);
            case 154 -> a(-552833691, var9 ^ 1943034550);
            case 155 -> a(-552833692, var9 ^ 846465311);
            case 156 -> a(-552833693, var9 ^ 211656626);
            case 157 -> a(-552833694, var9 ^ -1847394330);
            case 158 -> a(-552833695, var9 ^ -1541258718);
            case 159 -> a(-552833696, var9 ^ 94814166);
            case 160 -> a(-552833697, var9 ^ -1780009086);
            case 161 -> a(-552833698, var9 ^ 1049771798);
            case 162 -> a(-552833699, var9 ^ 1866128451);
            case 163 -> a(-552833700, var9 ^ -1722979706);
            case 164 -> a(-552833701, var9 ^ -1653531868);
            case 165 -> a(-552833702, var9 ^ -172759203);
            case 166 -> a(-552833703, var9 ^ -361031134);
            case 167 -> a(-552833704, var9 ^ 408437196);
            case 168 -> a(-552833705, var9 ^ -344201519);
            case 169 -> a(-552833706, var9 ^ 1351071043);
            case 170 -> a(-552833707, var9 ^ -258317963);
            case 171 -> a(-552833708, var9 ^ 84256561);
            case 172 -> a(-552833709, var9 ^ -1238469265);
            case 173 -> a(-552833710, var9 ^ -1306468936);
            case 174 -> a(-552833711, var9 ^ -1082300759);
            case 175 -> a(-552833712, var9 ^ 1864937590);
            case 176 -> a(-552833713, var9 ^ -1076457220);
            case 177 -> a(-552833714, var9 ^ 1714850546);
            case 178 -> 4;
            case 179 -> a(-552833715, var9 ^ 373646781);
            case 180 -> a(-552833716, var9 ^ -195059230);
            case 181 -> 0;
            case 182 -> a(-552833717, var9 ^ -867155687);
            case 183 -> a(-552833718, var9 ^ -1819418458);
            case 184 -> a(-552833719, var9 ^ -1936914296);
            case 185 -> a(-552833720, var9 ^ 1140227608);
            case 186 -> a(-552833721, var9 ^ -253382601);
            case 187 -> a(-552833722, var9 ^ -1195448141);
            case 188 -> a(-552833723, var9 ^ -1060004103);
            case 189 -> a(-552833724, var9 ^ -1329570058);
            case 190 -> a(-552833725, var9 ^ -531828737);
            case 191 -> a(-552833726, var9 ^ -638695759);
            case 192 -> a(-552833727, var9 ^ -1661501489);
            case 193 -> a(-552833728, var9 ^ -628190294);
            case 194 -> a(-552833729, var9 ^ 718546264);
            case 195 -> a(-552833730, var9 ^ 1095618262);
            case 196 -> a(-552833731, var9 ^ 188183084);
            case 197 -> a(-552833732, var9 ^ -8370116);
            case 198 -> a(-552833733, var9 ^ -193419969);
            case 199 -> a(-552833734, var9 ^ -1404536387);
            case 200 -> a(-552833735, var9 ^ -814989767);
            case 201 -> a(-552833736, var9 ^ -1647668991);
            case 202 -> a(-552833737, var9 ^ 1371397430);
            case 203 -> a(-552833738, var9 ^ 582474195);
            case 204 -> a(-552833739, var9 ^ 986366493);
            case 205 -> a(-552833740, var9 ^ 1576085246);
            case 206 -> a(-552833741, var9 ^ -1987589917);
            case 207 -> a(-552833742, var9 ^ -205819362);
            case 208 -> a(-552833743, var9 ^ -857946770);
            case 209 -> a(-552833744, var9 ^ 347705310);
            case 210 -> a(-552833745, var9 ^ -519687215);
            case 211 -> a(-552833746, var9 ^ -323848206);
            case 212 -> a(-552833747, var9 ^ -1801192509);
            case 213 -> a(-552833748, var9 ^ -1753814266);
            case 214 -> a(-552833749, var9 ^ 1870629246);
            case 215 -> a(-552833750, var9 ^ 1578741247);
            case 216 -> a(-552833751, var9 ^ 276184136);
            case 217 -> a(-552833752, var9 ^ -1701990890);
            case 218 -> a(-552833753, var9 ^ -768072164);
            case 219 -> a(-552833754, var9 ^ -285445280);
            case 220 -> a(-552833755, var9 ^ -311846910);
            case 221 -> a(-552833756, var9 ^ -1802346138);
            case 222 -> a(-552833757, var9 ^ 2126144766);
            case 223 -> a(-552833758, var9 ^ 1691401500);
            case 224 -> a(-552833759, var9 ^ -1924748422);
            case 225 -> a(-552833760, var9 ^ 1588930385);
            case 226 -> a(-552833761, var9 ^ 1637426937);
            case 227 -> a(-552833762, var9 ^ 239449514);
            case 228 -> a(-552833763, var9 ^ 2139685387);
            case 229 -> a(-552833764, var9 ^ -793725107);
            case 230 -> a(-552833765, var9 ^ 91030870);
            case 231 -> a(-552833766, var9 ^ -487663513);
            case 232 -> a(-552833767, var9 ^ -1036208112);
            case 233 -> a(-552833768, var9 ^ -654889418);
            case 234 -> a(-552833769, var9 ^ -820185319);
            case 235 -> a(-552833770, var9 ^ -1549085200);
            case 236 -> a(-552833771, var9 ^ 731726461);
            case 237 -> a(-552833772, var9 ^ 1692497170);
            case 238 -> a(-552833773, var9 ^ 243976336);
            case 239 -> a(-552833774, var9 ^ -126297490);
            case 240 -> a(-552833775, var9 ^ -408986228);
            case 241 -> a(-552833776, var9 ^ -534506832);
            case 242 -> a(-552833777, var9 ^ -175228039);
            case 243 -> a(-552833778, var9 ^ -1625581302);
            case 244 -> a(-552833779, var9 ^ 1366091165);
            case 245 -> a(-552833780, var9 ^ -1686822700);
            case 246 -> a(-552833781, var9 ^ -367462925);
            case 247 -> a(-552833782, var9 ^ -1380331350);
            case 248 -> a(-552833783, var9 ^ -480694206);
            case 249 -> a(-552833784, var9 ^ 1652560394);
            case 250 -> a(-552833785, var9 ^ 1842933458);
            case 251 -> a(-552833786, var9 ^ 1306038545);
            case 252 -> a(-552833787, var9 ^ -2018089166);
            case 253 -> a(-552833788, var9 ^ -204275933);
            case 254 -> a(-552833789, var9 ^ -1881293331);
            default -> a(-552833790, var9 ^ 302648535);
         };
         int var5 = (var1 & a(-552833791, var9 ^ 987930710)) - var4;
         if (var5 < 0) {
            var5 += 256;
         }

         int var6 = ((var1 & a(-552833792, var9 ^ -2097493660)) >>> a(-552833793, var9 ^ 1666576596)) - var4;
         if (var6 < 0) {
            var6 += 256;
         }

         for (int var7 = 0; var7 < var3.length; var7++) {
            int var8 = var7 % 2;
            char var10002 = var3[var7];
            if (var8 == 0) {
               var3[var7] = (char)(var10002 ^ var5);
               var5 = ((var5 >>> 3 | var5 << 5) ^ var3[var7]) & a(-552833794, var9 ^ -2121397025);
            } else {
               var3[var7] = (char)(var10002 ^ var6);
               var6 = ((var6 >>> 3 | var6 << 5) ^ var3[var7]) & a(-552833795, var9 ^ -66681252);
            }
         }

         aab[var2] = new String(var3).intern();
      }

      return aab[var2];
   }

   private static boolean bb(class_1799 var0, String var1) {
      int var10000 = aabbabbab.ab;
      class_1844 var3 = (class_1844)var0.method_58694(class_9334.field_49651);
      int var2 = var10000;

      label87: {
         label66: {
            try {
               var9 = var3;
               if (var2 != 0) {
                  break label66;
               }

               if (var3 == null) {
                  return false;
               }
            } catch (MatchException var8) {
               throw var8;
            }

            var9 = var3;
         }

         try {
            boolean var10 = var9.comp_2378().isPresent();
            if (var2 != 0) {
               return var10;
            }

            if (var10) {
               break label87;
            }
         } catch (MatchException var7) {
            throw var7;
         }

         return false;
      }

      class_2960 var4 = class_7923.field_41179.method_10221((class_1842)((class_6880)var3.comp_2378().get()).comp_349());

      label47: {
         try {
            var11 = var4;
            if (var2 != 0) {
               break label47;
            }

            if (var4 == null) {
               return false;
            }
         } catch (MatchException var6) {
            throw var6;
         }

         var11 = var4;
      }

      try {
         boolean var12 = var11.method_12832().contains(var1);
         if (var2 != 0) {
            return var12;
         }

         if (var12) {
            return true;
         }
      } catch (MatchException var5) {
         throw var5;
      }

      return false;
   }

   private static String b(int var0, short var1, char var2) {
      int var3 = var2 ^ 22837;
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
      int var8 = (var7.getClassName().hashCode() ^ var7.getMethodName().hashCode()) >> 16 ^ 14495;
      int var9 = 0;

      do {
         int var10 = var4[var9] + '꜎';
         var10 -= 31561;
         var10 ^= 34188;
         var10 -= 34737;
         var4[var9] = (char)(var10 ^ var8 ^ var1 ^ var0 >> 16);
      } while (++var9 < var4.length);

      return new String(var4).intern();
   }

   // $VF: Irreducible bytecode was duplicated to produce valid code
   static {
      int var25 = -1303939712;
      int var19 = 0;
      int var18 = 0;
      int var10001 = "ß\ue770伺ⶀ࿌\ue599뽂ᥖ濃Ⴌｔቐ輻⾀꿽ᠹ㽁ᣆ\udfc3Ṍ佪ဠ濍ᯰￌ\ue6c9뾈\uea96翼⾼潩ዐ鼲\ue560⼇ᎉ轀\ue736켊ጌྠⳐ꼄ᆀ\u1ff1\ue439\udf7dⷆ꿾᭼꽕ᢰ\udf3a\ue790鿌\ue529ᾉᅖ忼\ue4ccབྷ\ue5f0뿃ᤰ伇፩\udf85\ue5d6翼Ḍ彖ူ\uef37ᆠ忏\uea89⽿ሖ＊ᮜབነ鿌\uea90⿱ⴙ罼ᅦ뿽\u2efc彫ူ\uefce⻠뿱Ꮹ龅\ue616ￃጬྣⱀ켷ᙀ忻⿹ｱቦ輈ᦜ⾣\ue510鼅က翌\uead9齂\ue7f6༈ቼ㾬\ue490㼰ኀ⿳⸹ག\ue716忼\ue4ec뽕ᄠ⼲ᅰ꿱ᅉｿ\u13f6迼\uea4c꽟\ue560俍ዀ࿌⽙㾉Ⲇ\udff6\ue71cｖ\ue410濎\ue4e0㼅\ue499澋\uebf6꼊\ue5dc㾡ᯠ\udfcc\ue7a0翸⾉羉\ue496\udfffᏬ코\ue790༸Ḡ鼉\ue6d9龅⼆㿷ᇜ佔ᡐ迍\ue430༄ⱹ콀ⷖ輈Ⲽ꽫\ueaf0弅\ue730㼉\u2d99ὀ\ue7a6俷ာ꾢\ue480뿌᪀翺ᇹ\udf42ᠦ濶ⱌཪ⽀濏Ⲡ༅\ue499律ဖ\udff9⺬བྷ\uea30\udf31ጀ%펲㷲\ueda2봎\ud8eb涿꩷ﴹ퀞뻢\udb42ⷻ\ud852鹉퇫趼퇴้ꔍ軠\ueff2淲큲ṅ꘨\u0dbfꙷᴷ퇎满ꘁ巅\uecb2蹅횛ﶂ\uec54\u0018戳䱋打岜挺氌瘵첌憏\uec33眃챇懓\u1c8a縚Ⱂ粥鲑榟䰸粣\udc5e笳벁\n\ud8ecꏱ\ud90c䌱\uedd5鎂틪茂튠Ϋ"
         .length();
      String[] var10002 = new String[4];
      short var20 = 29905;
      String[] var17 = var10002;
      int var16 = var10001;
      String var15 = "ß\ue770伺ⶀ࿌\ue599뽂ᥖ濃Ⴌｔቐ輻⾀꿽ᠹ㽁ᣆ\udfc3Ṍ佪ဠ濍ᯰￌ\ue6c9뾈\uea96翼⾼潩ዐ鼲\ue560⼇ᎉ轀\ue736켊ጌྠⳐ꼄ᆀ\u1ff1\ue439\udf7dⷆ꿾᭼꽕ᢰ\udf3a\ue790鿌\ue529ᾉᅖ忼\ue4ccབྷ\ue5f0뿃ᤰ伇፩\udf85\ue5d6翼Ḍ彖ူ\uef37ᆠ忏\uea89⽿ሖ＊ᮜབነ鿌\uea90⿱ⴙ罼ᅦ뿽\u2efc彫ူ\uefce⻠뿱Ꮹ龅\ue616ￃጬྣⱀ켷ᙀ忻⿹ｱቦ輈ᦜ⾣\ue510鼅က翌\uead9齂\ue7f6༈ቼ㾬\ue490㼰ኀ⿳⸹ག\ue716忼\ue4ec뽕ᄠ⼲ᅰ꿱ᅉｿ\u13f6迼\uea4c꽟\ue560俍ዀ࿌⽙㾉Ⲇ\udff6\ue71cｖ\ue410濎\ue4e0㼅\ue499澋\uebf6꼊\ue5dc㾡ᯠ\udfcc\ue7a0翸⾉羉\ue496\udfffᏬ코\ue790༸Ḡ鼉\ue6d9龅⼆㿷ᇜ佔ᡐ迍\ue430༄ⱹ콀ⷖ輈Ⲽ꽫\ueaf0弅\ue730㼉\u2d99ὀ\ue7a6俷ာ꾢\ue480뿌᪀翺ᇹ\udf42ᠦ濶ⱌཪ⽀濏Ⲡ༅\ue499律ဖ\udff9⺬བྷ\uea30\udf31ጀ%펲㷲\ueda2봎\ud8eb涿꩷ﴹ퀞뻢\udb42ⷻ\ud852鹉퇫趼퇴้ꔍ軠\ueff2淲큲ṅ꘨\u0dbfꙷᴷ퇎满ꘁ巅\uecb2蹅횛ﶂ\uec54\u0018戳䱋打岜挺氌瘵첌憏\uec33眃챇懓\u1c8a縚Ⱂ粥鲑榟䰸粣\udc5e笳벁\n\ud8ecꏱ\ud90c䌱\uedd5鎂틪茂튠Ϋ";

      do {
         char var21 = var15.charAt(var19);
         int var23 = 0;
         char[] var22 = var15.substring(var19 + 1, var19 + 1 + var21).toCharArray();

         do {
            int var24 = var22[var23];

            var24 = (char)(switch (var23 % 5) {
               default -> 111;
               case 1 -> 41;
               case 2 -> 239;
               case 3 -> 227;
               case 4 -> 70;
            }) ^ var24;
            if (var23 % 2 == 0) {
               var22[var23] = (char)((var24 >>> 4 | var24 << 12) & 65535 ^ var20);
            } else {
               var22[var23] = (char)((var24 << 4 | var24 >>> 12) & 65535 ^ var20);
            }
         } while (++var23 < var22.length);

         var17[var18] = new String(var22);
         var18++;
         var19 = var19 + var21 + 1;
      } while (var19 < var16);

      aabb = var17;
      abaa = new Object[var17.length];
      aaba = new int[302];
      byte var29 = 0;
      int var32 = 0;
      byte[] var46 = "n_¦\u008b\u008bT±\u000eªG[}í\u008f¯UÛrýæÝ,ªã±®Þ¾ø@\nË\u0010Û\u001aD\u0082ûH\u00ad\u0085ÜïØDG\u008a<)27\\o\u001bÒ\u000e<ÞUA«\u0019á\u0013.¦\u007fy¾\u0007P\u008eé)$ÅA\u009aüé3ù\u0097alcnÎFFqtÆCRD\u0010~Lbç4 \u0094\u0014\u0097P³oÑ\u008fÇ³%hÂ¬ný^\u0085\t§ÏÞ\u0016ÉzÞ\u001e\u001f\u0089êK·wKwUª\u0082#ÒH@\u008d¨¾OýÏâ\u0091\u009boeÜø¥÷ÜV\u009c\u001eÈ=\u0015eÖûxÖ\u008e \u0092'_QnÒ2\u009a\u001dA¹@ØÉé!N\u0011ÌÄç8´È\u0097úM\u0014z\u0084õ=/Ñ@\u00adõúwgP3©T\u0007-}MÒ\u0081Âl£ø³Ií\u0085{$²LØlJMpôL\rzô\u0093&\u0011Î£[J[Dé\u0003\t\u001cP\u0007#mQl\u0094\u0091IAé´D*#\u001a³ Ñ«hÞ\u0004o¨\u009d\u001aMÂ\u0013@±ÝÌr)\u009f\u0003ù!r\u0018ÎñÑÊmØÝ¸=\u0097\u0080eq\u008en7¿¼ÜÅþñ,ò\u009e1Êl\u009dAn\u0083f\u0018°ã¾U£Ë\u001a\u0096Ã;¾«%\u0089\u0094ðË¿\u0002æõ\u0090\u0017Õ\u0080ðèÏ×\u0018}Y\u0006ýÜ§Äå\u0003\u008cWËÕ\u0082ÔvC\u0000\u0006h`!ç\u0016\u0004Í>{ªO\u0097Q_XaÑ|Èf\u0087Ü\u001cQqÔw\u0012+¹\u0016Á\u0097ë['QQúù9Z\u001a\u0088§z\n\u008e\u0003\u000b·^õ³!Ðt52\u0082kÑÆ\u0003:V7\u0011ËÜòí»\u008dÉ\u001fÂqäá¤ð«ÍMS3Û\u007feX\u009c÷¨/S\u0005°\u009dh\u0091EÁÆê% -\u001fÙ&\u0089e\u0092g\u000eiÃl¼B\u000b\u0007å;\u0004bw$h\u0012ì*.ÊW\u0090ë¬¸é53ïºµÍõ\u0086\u001dJÏ\\O2\u0099R8ÿÞn\u0096pK<9ö~\u0004¢ì\u0082¿q,\u00985¶ôÊ/P´:\u0098?{ë\u0094¦\u0015=4\u00860\u0018¼í\bxTù\r&KÂ%{\u001c \u0092\u009eøm\u0094lCYZTì÷M²\u0093²U\u0092\u0003×Õ\t-5é\\l\u0091ºõRx,\u0001Ï\u0007LêúÇñA[C\f\u0002Ë\u0002\u0084\u0007`w\u008f\u00111ßo²Ç¨Ù¸Ã\u0094«=«VT/´\u009e©¥F½ò\u0087µ\u009eU\u001b\u000eb\u0006Ã®\u007fÑv[à\u0014,èËÆ*ìÅn\u001dá\u0098Õ'1Í\u0003\tá3#28Ó9kH Ö\nªº\u0012¨\u0092µòwÍhS+Òh»\u0007\u001d\u0013ÍX®\u0000\u0003Jæ[[ä\u009e4- î%í¿¾©\\\u0084\u0087\u000bõ\u0093Â\u0012ÌÈ\u0084k >t1\u0096\u0091\u001f¨}\u0001UÒÁè¡eû·ª\u009d\u0016\rò\u00adÊ\f\u0091\u0089\u008d=Ã/\"ö\u000fXnS|Rjþd/q®\u0003\u0014\u0095w×b{Ì\u00ad^Á\u009f\u00929vXJ\\<+¿ã\u0080a²WÄÉÊFH\u009bÉ\u0093X31\u009a:ö\u0000ü\u001eÙN\u0093\u008fÈÄh\u001d\u0090\u008cÝ\u0095\u0004°\u0019ÀY³\u008c+jÊwÒ/ _×¯:5\u000eoÓ£\u001b\u0006\u0000P\u0094\u0089?|\u0095\u0092P \u0006È!l°$\u008eU\u0004Ò[\u0088¶å¼\u000bk¬\u009cÙ\u000b¯\u0086\u0012\u009d\u008f\u0091ùDóýOg×uxñF:\u0004Æ\fPoxÜ¦\u009dia¹zî¨¾Á¡m«k\u0088¼Áþ*b\u000f\u0089VõÅ\u0090\u0093²´ýFkó\\c%½¼\u0080\u001c<e¡i3=]¶\u0013=\">ÙSÔï\u00ad7L\u0011Ñ8\u000eàLï¿1d\u0007\u0013Z#áÛi=°B©ßk¾,¢ã4¬\u001d¥\u009aT@bZþTþ¦\u001a á#/-\nm¯\u0081\u0093,E³¦\nm\u0088 û/¶¬o\u009b©\fCXnD´Ô\u008bwAúG(^\u0098Ù{\t\u0096ñ:\u0084~U\u0085E\u0018ß\u009b¦ÏÆ¸¹Úbà»)[0\u0004a\u0000\u009e0Ü©ý+X\u007fdÈöu\u000f]4q \\J\u009c\u0010(Ëì§\u001epÍËpÓw\u0017¡\"Åá»OÉ1\u009b\u0002¤£\u001dU\u0090rSz\u0013×u¶Á,9\u0010@\u0016e8È\u0017®bîa\u0012AH\u0081([P¤\u000f¹\u0011\u0089\u009aL2k\u0088ê§ÚS\u001c"
         .getBytes("ISO-8859-1");

      int var68;
      do {
         aaba[var29] = ((var46[var32] & 255) << 24 | (var46[var32 + 1] & 255) << 16 | (var46[var32 + 2] & 255) << 8 | var46[var32 + 3] & 255) ^ -1737678939;
         var29 += 1;
         var68 = var32 + 4;
         var32 += 4;
      } while (var68 < var46.length);

      String[] var13 = new String[a(-552833796, var25 ^ -394099140)];
      int var11 = 0;
      String var10;
      int var12 = (var10 = b(var25 ^ 1666660300, (short)'\uf212', '夵')).length();
      int var9 = a(-552833797, var25 ^ -1253751153);
      int var27 = -1;

      label113:
      while (true) {
         String var30 = var10.substring(++var27, var27 + var9);
         var32 = (byte)-1;

         while (true) {
            label108: {
               char[] var37 = var30.toCharArray();
               var68 = var37.length;
               int var14 = 0;
               var55 = var37;
               var32 = var68;
               char[] var72;
               int var87;
               if (var68 <= 1) {
                  var72 = var37;
                  var87 = var14;
               } else {
                  var55 = var37;
                  var32 = var68;
                  if (var68 <= var14) {
                     break label108;
                  }

                  var72 = var37;
                  var87 = var14;
               }

               while (true) {
                  var72[var87] = (char)(var72[var87] ^ switch (var14 % a(-552833800, var25 ^ -668110378)) {
                     case 0 -> a(-552833801, var25 ^ 1957965869);
                     case 1 -> a(-552833802, var25 ^ 1182864930);
                     case 2 -> a(-552833803, var25 ^ 2106058592);
                     case 3 -> a(-552833804, var25 ^ 1133212671);
                     case 4 -> a(-552833805, var25 ^ 1546346295);
                     case 5 -> a(-552833806, var25 ^ -1687967496);
                     default -> 2;
                  });
                  var14++;
                  if (var32 == 0) {
                     var87 = var32;
                     var72 = var55;
                  } else {
                     if (var32 <= var14) {
                        break;
                     }

                     var72 = var55;
                     var87 = var14;
                  }
               }
            }

            String var79 = new String(var55).intern();
            switch (var32) {
               case 0:
                  var13[var11++] = var79;
                  if ((var27 += var9) >= var12) {
                     abb = var13;
                     aab = new String[a(-552833799, var25 ^ 1439055682)];
                     long var0 = 3734973631538014347L;
                     long[] var6 = new long[3];
                     int var3 = 0;
                     String var4;
                     int var5 = (var4 = b(var25 ^ 1042753722, (short)'탩', '夷')).length();
                     byte var2 = 0;

                     do {
                        int var44 = var2;
                        var2 += 8;
                        byte[] var7 = var4.substring(var44, var2).getBytes(b(var25 ^ -836619344, (short)'魰', '夶'));
                        var44 = var3++;
                        long var88 = (
                              (var7[0] & 255L) << a(-552833807, var25 ^ 2119195693)
                                 | (var7[1] & 255L) << a(-552833808, var25 ^ -1307622730)
                                 | (var7[2] & 255L) << a(-552833809, var25 ^ 744232335)
                                 | (var7[3] & 255L) << a(-552833810, var25 ^ 69048446)
                                 | (var7[4] & 255L) << a(-552833811, var25 ^ -1599973069)
                                 | (var7[5] & 255L) << a(-552833812, var25 ^ 717011677)
                                 | (var7[a(-552833813, var25 ^ 866100657)] & 255L) << a(-552833814, var25 ^ -1748523179)
                                 | var7[a(-552833815, var25 ^ -1374218231)] & 255L
                           )
                           ^ var0;
                        byte var80 = -1;
                        var6[var44] = var88;
                     } while (var2 < var5);

                     aa = var6;
                     bba = new Integer[3];
                     aaa = aa(a(-552833816, var25 ^ -172425422), 6879739041168625719L);
                     return;
                  }

                  var9 = var10.charAt(var27);
                  break;
               default:
                  var13[var11++] = var79;
                  if ((var27 += var9) < var12) {
                     var9 = var10.charAt(var27);
                     continue label113;
                  }

                  var12 = (var10 = b(var25 ^ -915984883, (short)15589, '头')).length();
                  var9 = a(-552833798, var25 ^ -1579566562);
                  var27 = -1;
            }

            var30 = var10.substring(++var27, var27 + var9);
            var32 = (byte)0;
         }
      }
   }

   private void aaa(aaaaaaba param1) {
      // $VF: Couldn't be decompiled
      // Please report this to the Vineflower issue tracker, at https://github.com/Vineflower/vineflower/issues with a copy of the class file (if you have the rights to distribute it!)
      // java.lang.RuntimeException: parsing failure!
      //   at org.jetbrains.java.decompiler.modules.decompiler.decompose.DomHelper.parseGraph(DomHelper.java:211)
      //   at org.jetbrains.java.decompiler.main.rels.MethodProcessor.codeToJava(MethodProcessor.java:166)
      //
      // Bytecode:
      // 00: getstatic qeaa361f143ee4a0894bd168fd9b30c66/qf4ccf8f5435d4a78bdca4d6a018b578e/aabbabbab.ab I
      // 03: invokestatic qeaa361f143ee4a0894bd168fd9b30c66/qf4ccf8f5435d4a78bdca4d6a018b578e/abaaaaaba.aaaaa ()Lqeaa361f143ee4a0894bd168fd9b30c66/qf4ccf8f5435d4a78bdca4d6a018b578e/abaaaaaba;
      // 06: astore 3
      // 07: istore 2
      // 08: aload 3
      // 09: iload 2
      // 0a: ifne 15
      // 0d: ifnull 2e
      // 10: goto 14
      // 13: athrow
      // 14: aload 3
      // 15: iload 2
      // 16: ifne 28
      // 19: invokevirtual qeaa361f143ee4a0894bd168fd9b30c66/qf4ccf8f5435d4a78bdca4d6a018b578e/abaaaaaba.aaba ()Lqeaa361f143ee4a0894bd168fd9b30c66/qf4ccf8f5435d4a78bdca4d6a018b578e/babbaba;
      // 1c: ifnull 2e
      // 1f: goto 23
      // 22: athrow
      // 23: aload 3
      // 24: goto 28
      // 27: athrow
      // 28: invokevirtual qeaa361f143ee4a0894bd168fd9b30c66/qf4ccf8f5435d4a78bdca4d6a018b578e/abaaaaaba.a ()Lqeaa361f143ee4a0894bd168fd9b30c66/qf4ccf8f5435d4a78bdca4d6a018b578e/aabbaaab;
      // 2b: ifnonnull 30
      // 2e: return
      // 2f: athrow
      // 30: aload 0
      // 31: aload 1
      // 32: invokevirtual qeaa361f143ee4a0894bd168fd9b30c66/qf4ccf8f5435d4a78bdca4d6a018b578e/baab.ab (Lqeaa361f143ee4a0894bd168fd9b30c66/qf4ccf8f5435d4a78bdca4d6a018b578e/aaaaaaba;)Ljava/lang/String;
      // 35: astore 4
      // 37: aload 4
      // 39: iload 2
      // 3a: ifne 46
      // 3d: ifnull 54
      // 40: goto 44
      // 43: athrow
      // 44: aload 4
      // 46: invokevirtual java/lang/String.isBlank ()Z
      // 49: iload 2
      // 4a: ifne 65
      // 4d: ifeq 55
      // 50: goto 54
      // 53: athrow
      // 54: return
      // 55: aload 3
      // 56: invokevirtual qeaa361f143ee4a0894bd168fd9b30c66/qf4ccf8f5435d4a78bdca4d6a018b578e/abaaaaaba.a ()Lqeaa361f143ee4a0894bd168fd9b30c66/qf4ccf8f5435d4a78bdca4d6a018b578e/aabbaaab;
      // 59: aload 4
      // 5b: invokevirtual java/lang/String.trim ()Ljava/lang/String;
      // 5e: aload 3
      // 5f: invokevirtual qeaa361f143ee4a0894bd168fd9b30c66/qf4ccf8f5435d4a78bdca4d6a018b578e/abaaaaaba.aaba ()Lqeaa361f143ee4a0894bd168fd9b30c66/qf4ccf8f5435d4a78bdca4d6a018b578e/babbaba;
      // 62: invokevirtual qeaa361f143ee4a0894bd168fd9b30c66/qf4ccf8f5435d4a78bdca4d6a018b578e/aabbaaab.aaba (Ljava/lang/String;Lqeaa361f143ee4a0894bd168fd9b30c66/qf4ccf8f5435d4a78bdca4d6a018b578e/babbaba;)Z
      // 65: pop
      // 66: return
   }

   public void aab(ababbbba param1, boolean param2) {
      // $VF: Couldn't be decompiled
      // Please report this to the Vineflower issue tracker, at https://github.com/Vineflower/vineflower/issues with a copy of the class file (if you have the rights to distribute it!)
      // java.lang.RuntimeException: parsing failure!
      //   at org.jetbrains.java.decompiler.modules.decompiler.decompose.DomHelper.parseGraph(DomHelper.java:211)
      //   at org.jetbrains.java.decompiler.main.rels.MethodProcessor.codeToJava(MethodProcessor.java:166)
      //
      // Bytecode:
      // 00: getstatic qeaa361f143ee4a0894bd168fd9b30c66/qf4ccf8f5435d4a78bdca4d6a018b578e/aabbabbab.ab I
      // 03: invokestatic qeaa361f143ee4a0894bd168fd9b30c66/qf4ccf8f5435d4a78bdca4d6a018b578e/abaaaaaba.aaaaa ()Lqeaa361f143ee4a0894bd168fd9b30c66/qf4ccf8f5435d4a78bdca4d6a018b578e/abaaaaaba;
      // 06: astore 4
      // 08: istore 3
      // 09: aload 4
      // 0b: iload 3
      // 0c: ifne 18
      // 0f: ifnull 26
      // 12: goto 16
      // 15: athrow
      // 16: aload 4
      // 18: iload 3
      // 19: ifne 2a
      // 1c: invokevirtual qeaa361f143ee4a0894bd168fd9b30c66/qf4ccf8f5435d4a78bdca4d6a018b578e/abaaaaaba.a ()Lqeaa361f143ee4a0894bd168fd9b30c66/qf4ccf8f5435d4a78bdca4d6a018b578e/aabbaaab;
      // 1f: ifnonnull 28
      // 22: goto 26
      // 25: athrow
      // 26: return
      // 27: athrow
      // 28: aload 4
      // 2a: invokevirtual qeaa361f143ee4a0894bd168fd9b30c66/qf4ccf8f5435d4a78bdca4d6a018b578e/abaaaaaba.a ()Lqeaa361f143ee4a0894bd168fd9b30c66/qf4ccf8f5435d4a78bdca4d6a018b578e/aabbaaab;
      // 2d: invokevirtual qeaa361f143ee4a0894bd168fd9b30c66/qf4ccf8f5435d4a78bdca4d6a018b578e/aabbaaab.ba ()Ljava/util/List;
      // 30: astore 5
      // 32: aload 5
      // 34: iload 3
      // 35: ifne 41
      // 38: ifnull 49
      // 3b: goto 3f
      // 3e: athrow
      // 3f: aload 5
      // 41: invokeinterface java/util/List.isEmpty ()Z 1
      // 46: ifeq 4b
      // 49: return
      // 4a: athrow
      // 4b: aload 1
      // 4c: invokevirtual qeaa361f143ee4a0894bd168fd9b30c66/qf4ccf8f5435d4a78bdca4d6a018b578e/ababbbba.abb ()Ljava/lang/String;
      // 4f: astore 6
      // 51: aload 5
      // 53: aload 6
      // 55: invokeinterface java/util/List.indexOf (Ljava/lang/Object;)I 2
      // 5a: istore 7
      // 5c: iload 2
      // 5d: iload 3
      // 5e: ifne 96
      // 61: ifeq 90
      // 64: goto 68
      // 67: athrow
      // 68: iload 7
      // 6a: iload 3
      // 6b: ifne 88
      // 6e: goto 72
      // 71: athrow
      // 72: ifgt 86
      // 75: goto 79
      // 78: athrow
      // 79: aload 5
      // 7b: invokeinterface java/util/List.size ()I 1
      // 80: bipush 1
      // 81: isub
      // 82: goto 8a
      // 85: athrow
      // 86: iload 7
      // 88: bipush 1
      // 89: isub
      // 8a: istore 8
      // 8c: iload 3
      // 8d: ifeq c9
      // 90: iload 7
      // 92: goto 96
      // 95: athrow
      // 96: iload 3
      // 97: ifne c0
      // 9a: iflt bb
      // 9d: goto a1
      // a0: athrow
      // a1: iload 7
      // a3: aload 5
      // a5: invokeinterface java/util/List.size ()I 1
      // aa: iload 3
      // ab: ifne c6
      // ae: goto b2
      // b1: athrow
      // b2: bipush 1
      // b3: isub
      // b4: if_icmplt c3
      // b7: goto bb
      // ba: athrow
      // bb: bipush 0
      // bc: goto c0
      // bf: athrow
      // c0: goto c7
      // c3: iload 7
      // c5: bipush 1
      // c6: iadd
      // c7: istore 8
      // c9: aload 1
      // ca: aload 5
      // cc: iload 8
      // ce: invokeinterface java/util/List.get (I)Ljava/lang/Object; 2
      // d3: checkcast java/lang/String
      // d6: invokevirtual qeaa361f143ee4a0894bd168fd9b30c66/qf4ccf8f5435d4a78bdca4d6a018b578e/ababbbba.bb (Ljava/lang/String;)V
      // d9: return
   }

   private static aaaaaaba aba(class_746 param0) {
      // $VF: Couldn't be decompiled
      // Please report this to the Vineflower issue tracker, at https://github.com/Vineflower/vineflower/issues with a copy of the class file (if you have the rights to distribute it!)
      //
      // Bytecode:
      // 000: ldc_w -552833817
      // 003: ldc_w 1971755228
      // 006: ldc_w 1692693443
      // 009: ixor
      // 00a: invokestatic qeaa361f143ee4a0894bd168fd9b30c66/qf4ccf8f5435d4a78bdca4d6a018b578e/baab.a (II)I
      // 00d: bipush 0
      // 00e: istore 2
      // 00f: ldc_w -552833818
      // 012: ldc_w 1971755228
      // 015: ldc_w -1300381518
      // 018: ixor
      // 019: invokestatic qeaa361f143ee4a0894bd168fd9b30c66/qf4ccf8f5435d4a78bdca4d6a018b578e/baab.a (II)I
      // 01c: getstatic qeaa361f143ee4a0894bd168fd9b30c66/qf4ccf8f5435d4a78bdca4d6a018b578e/aabbabbab.ab I
      // 01f: bipush 0
      // 020: istore 3
      // 021: bipush 0
      // 022: istore 4
      // 024: bipush 0
      // 025: istore 5
      // 027: bipush 0
      // 028: istore 6
      // 02a: bipush 0
      // 02b: istore 7
      // 02d: istore 1
      // 02e: bipush 0
      // 02f: istore 8
      // 031: bipush 0
      // 032: istore 9
      // 034: invokestatic qeaa361f143ee4a0894bd168fd9b30c66/qf4ccf8f5435d4a78bdca4d6a018b578e/baab.ba (II)Ljava/lang/String;
      // 037: invokestatic qeaa361f143ee4a0894bd168fd9b30c66/qf4ccf8f5435d4a78bdca4d6a018b578e/aabbaaaba.aaab (Ljava/lang/String;)Lqeaa361f143ee4a0894bd168fd9b30c66/qf4ccf8f5435d4a78bdca4d6a018b578e/ababbbbaa;
      // 03a: invokevirtual qeaa361f143ee4a0894bd168fd9b30c66/qf4ccf8f5435d4a78bdca4d6a018b578e/ababbbbaa.abab ()Ljava/lang/String;
      // 03d: astore 10
      // 03f: bipush 0
      // 040: istore 11
      // 042: iload 11
      // 044: aload 0
      // 045: invokevirtual net/minecraft/class_746.method_31548 ()Lnet/minecraft/class_1661;
      // 048: invokevirtual net/minecraft/class_1661.method_5439 ()I
      // 04b: if_icmpge 1b7
      // 04e: iload 1
      // 04f: ifne 1c8
      // 052: aload 0
      // 053: invokevirtual net/minecraft/class_746.method_31548 ()Lnet/minecraft/class_1661;
      // 056: iload 11
      // 058: invokevirtual net/minecraft/class_1661.method_5438 (I)Lnet/minecraft/class_1799;
      // 05b: astore 12
      // 05d: iload 1
      // 05e: ifne 1b3
      // 061: aload 12
      // 063: ifnull 1b0
      // 066: goto 06a
      // 069: athrow
      // 06a: aload 12
      // 06c: iload 1
      // 06d: ifne 08c
      // 070: goto 074
      // 073: athrow
      // 074: invokevirtual net/minecraft/class_1799.method_7960 ()Z
      // 077: ifeq 086
      // 07a: goto 07e
      // 07d: athrow
      // 07e: iload 1
      // 07f: ifeq 1b0
      // 082: goto 086
      // 085: athrow
      // 086: aload 12
      // 088: goto 08c
      // 08b: athrow
      // 08c: iload 1
      // 08d: ifne 0a9
      // 090: getstatic net/minecraft/class_3489.field_42611 Lnet/minecraft/class_6862;
      // 093: invokevirtual net/minecraft/class_1799.method_31573 (Lnet/minecraft/class_6862;)Z
      // 096: ifeq 0a3
      // 099: goto 09d
      // 09c: athrow
      // 09d: bipush 1
      // 09e: istore 2
      // 09f: iload 1
      // 0a0: ifeq 1b0
      // 0a3: aload 12
      // 0a5: goto 0a9
      // 0a8: athrow
      // 0a9: iload 1
      // 0aa: ifne 0c6
      // 0ad: getstatic net/minecraft/class_1802.field_49814 Lnet/minecraft/class_1792;
      // 0b0: invokevirtual net/minecraft/class_1799.method_31574 (Lnet/minecraft/class_1792;)Z
      // 0b3: ifeq 0c0
      // 0b6: goto 0ba
      // 0b9: athrow
      // 0ba: bipush 1
      // 0bb: istore 3
      // 0bc: iload 1
      // 0bd: ifeq 1b0
      // 0c0: aload 12
      // 0c2: goto 0c6
      // 0c5: athrow
      // 0c6: getstatic net/minecraft/class_1802.field_8301 Lnet/minecraft/class_1792;
      // 0c9: iload 1
      // 0ca: ifne 0e7
      // 0cd: invokevirtual net/minecraft/class_1799.method_31574 (Lnet/minecraft/class_1792;)Z
      // 0d0: ifeq 0de
      // 0d3: goto 0d7
      // 0d6: athrow
      // 0d7: bipush 1
      // 0d8: istore 4
      // 0da: iload 1
      // 0db: ifeq 1b0
      // 0de: aload 12
      // 0e0: getstatic net/minecraft/class_1802.field_8281 Lnet/minecraft/class_1792;
      // 0e3: goto 0e7
      // 0e6: athrow
      // 0e7: iload 1
      // 0e8: ifne 10d
      // 0eb: invokevirtual net/minecraft/class_1799.method_31574 (Lnet/minecraft/class_1792;)Z
      // 0ee: ifeq 0fc
      // 0f1: goto 0f5
      // 0f4: athrow
      // 0f5: bipush 1
      // 0f6: istore 5
      // 0f8: iload 1
      // 0f9: ifeq 1b0
      // 0fc: aload 12
      // 0fe: iload 1
      // 0ff: ifne 120
      // 102: goto 106
      // 105: athrow
      // 106: getstatic net/minecraft/class_1802.field_8786 Lnet/minecraft/class_1792;
      // 109: goto 10d
      // 10c: athrow
      // 10d: invokevirtual net/minecraft/class_1799.method_31574 (Lnet/minecraft/class_1792;)Z
      // 110: ifeq 11a
      // 113: bipush 1
      // 114: istore 7
      // 116: iload 1
      // 117: ifeq 1b0
      // 11a: aload 12
      // 11c: goto 120
      // 11f: athrow
      // 120: getstatic net/minecraft/class_1802.field_8187 Lnet/minecraft/class_1792;
      // 123: iload 1
      // 124: ifne 141
      // 127: invokevirtual net/minecraft/class_1799.method_31574 (Lnet/minecraft/class_1792;)Z
      // 12a: ifeq 138
      // 12d: goto 131
      // 130: athrow
      // 131: bipush 1
      // 132: istore 8
      // 134: iload 1
      // 135: ifeq 1b0
      // 138: aload 12
      // 13a: getstatic net/minecraft/class_1802.field_8705 Lnet/minecraft/class_1792;
      // 13d: goto 141
      // 140: athrow
      // 141: iload 1
      // 142: ifne 167
      // 145: invokevirtual net/minecraft/class_1799.method_31574 (Lnet/minecraft/class_1792;)Z
      // 148: ifeq 156
      // 14b: goto 14f
      // 14e: athrow
      // 14f: bipush 1
      // 150: istore 9
      // 152: iload 1
      // 153: ifeq 1b0
      // 156: aload 12
      // 158: iload 1
      // 159: ifne 1a1
      // 15c: goto 160
      // 15f: athrow
      // 160: getstatic net/minecraft/class_1802.field_8574 Lnet/minecraft/class_1792;
      // 163: goto 167
      // 166: athrow
      // 167: invokevirtual net/minecraft/class_1799.method_31574 (Lnet/minecraft/class_1792;)Z
      // 16a: ifne 19b
      // 16d: aload 12
      // 16f: iload 1
      // 170: ifne 1a1
      // 173: goto 177
      // 176: athrow
      // 177: getstatic net/minecraft/class_1802.field_8436 Lnet/minecraft/class_1792;
      // 17a: invokevirtual net/minecraft/class_1799.method_31574 (Lnet/minecraft/class_1792;)Z
      // 17d: ifne 19b
      // 180: goto 184
      // 183: athrow
      // 184: aload 12
      // 186: iload 1
      // 187: ifne 1a1
      // 18a: goto 18e
      // 18d: athrow
      // 18e: getstatic net/minecraft/class_1802.field_8150 Lnet/minecraft/class_1792;
      // 191: invokevirtual net/minecraft/class_1799.method_31574 (Lnet/minecraft/class_1792;)Z
      // 194: ifeq 1b0
      // 197: goto 19b
      // 19a: athrow
      // 19b: aload 12
      // 19d: goto 1a1
      // 1a0: athrow
      // 1a1: aload 10
      // 1a3: invokestatic qeaa361f143ee4a0894bd168fd9b30c66/qf4ccf8f5435d4a78bdca4d6a018b578e/baab.bb (Lnet/minecraft/class_1799;Ljava/lang/String;)Z
      // 1a6: ifeq 1b0
      // 1a9: iinc 6 1
      // 1ac: goto 1b0
      // 1af: athrow
      // 1b0: iinc 11 1
      // 1b3: iload 1
      // 1b4: ifeq 042
      // 1b7: iload 3
      // 1b8: iload 1
      // 1b9: ifne 1ca
      // 1bc: ifeq 1c8
      // 1bf: goto 1c3
      // 1c2: athrow
      // 1c3: getstatic qeaa361f143ee4a0894bd168fd9b30c66/qf4ccf8f5435d4a78bdca4d6a018b578e/aaaaaaba.aa Lqeaa361f143ee4a0894bd168fd9b30c66/qf4ccf8f5435d4a78bdca4d6a018b578e/aaaaaaba;
      // 1c6: areturn
      // 1c7: athrow
      // 1c8: iload 4
      // 1ca: iload 1
      // 1cb: ifne 1ed
      // 1ce: ifeq 1eb
      // 1d1: goto 1d5
      // 1d4: athrow
      // 1d5: iload 5
      // 1d7: iload 1
      // 1d8: ifne 1ed
      // 1db: goto 1df
      // 1de: athrow
      // 1df: ifeq 1eb
      // 1e2: goto 1e6
      // 1e5: athrow
      // 1e6: getstatic qeaa361f143ee4a0894bd168fd9b30c66/qf4ccf8f5435d4a78bdca4d6a018b578e/aaaaaaba.b Lqeaa361f143ee4a0894bd168fd9b30c66/qf4ccf8f5435d4a78bdca4d6a018b578e/aaaaaaba;
      // 1e9: areturn
      // 1ea: athrow
      // 1eb: iload 6
      // 1ed: iload 1
      // 1ee: ifne 200
      // 1f1: bipush 2
      // 1f2: if_icmplt 1fe
      // 1f5: goto 1f9
      // 1f8: athrow
      // 1f9: getstatic qeaa361f143ee4a0894bd168fd9b30c66/qf4ccf8f5435d4a78bdca4d6a018b578e/aaaaaaba.aaa Lqeaa361f143ee4a0894bd168fd9b30c66/qf4ccf8f5435d4a78bdca4d6a018b578e/aaaaaaba;
      // 1fc: areturn
      // 1fd: athrow
      // 1fe: iload 7
      // 200: iload 1
      // 201: ifne 233
      // 204: ifeq 232
      // 207: goto 20b
      // 20a: athrow
      // 20b: iload 8
      // 20d: iload 1
      // 20e: ifne 233
      // 211: goto 215
      // 214: athrow
      // 215: ifeq 232
      // 218: goto 21c
      // 21b: athrow
      // 21c: iload 9
      // 21e: iload 1
      // 21f: ifne 233
      // 222: goto 226
      // 225: athrow
      // 226: ifeq 232
      // 229: goto 22d
      // 22c: athrow
      // 22d: getstatic qeaa361f143ee4a0894bd168fd9b30c66/qf4ccf8f5435d4a78bdca4d6a018b578e/aaaaaaba.ba Lqeaa361f143ee4a0894bd168fd9b30c66/qf4ccf8f5435d4a78bdca4d6a018b578e/aaaaaaba;
      // 230: areturn
      // 231: athrow
      // 232: iload 2
      // 233: ifeq 23b
      // 236: getstatic qeaa361f143ee4a0894bd168fd9b30c66/qf4ccf8f5435d4a78bdca4d6a018b578e/aaaaaaba.bb Lqeaa361f143ee4a0894bd168fd9b30c66/qf4ccf8f5435d4a78bdca4d6a018b578e/aaaaaaba;
      // 239: areturn
      // 23a: athrow
      // 23b: aconst_null
      // 23c: areturn
   }

   public baab() {
      int var1 = 684736119;
      super(
         aabbaaaba.aaab(ba(a(-552833819, var1 ^ -448748791), a(-552833820, var1 ^ -512807687))),
         bbaabbba.bba,
         aabbaaaba.aaab(ba(a(-552833821, var1 ^ 207607550), a(-552833822, var1 ^ 2095622843)))
      );
      this.aba = (ababbbba)this.abbbaaa(
         new ababbbba(
            aabbaaaba.aaab(ba(a(-552833823, var1 ^ 1568968422), a(-552833824, var1 ^ -413656383))), ""
         )
      );
      this.aaab = (ababbbba)this.abbbaaa(
         new ababbbba(
            aabbaaaba.aaab(ba(a(-552833825, var1 ^ 1437484371), a(-552833826, var1 ^ 1501444098))), ""
         )
      );
      this.ab = (ababbbba)this.abbbaaa(
         new ababbbba(
            aabbaaaba.aaab(ba(a(-552833827, var1 ^ 887939921), a(-552833828, var1 ^ 4045045))), ""
         )
      );
      this.ba = (ababbbba)this.abbbaaa(
         new ababbbba(
            aabbaaaba.aaab(ba(a(-552833829, var1 ^ -2087154762), a(-552833830, var1 ^ 1365382859))), ""
         )
      );
      this.bbb = (ababbbba)this.abbbaaa(
         new ababbbba(
            aabbaaaba.aaab(ba(a(-552833831, var1 ^ -799433949), a(-552833832, var1 ^ 1482166710))), ""
         )
      );
      this.baa = (bababa)this.abbbaaa(
         new bababa(
               aabbaaaba.aaab(ba(a(-552833833, var1 ^ 2117004355), a(-552833834, var1 ^ -657540288))), 20.0, 5.0, 100.0, 5.0
            )
            .bba(aabbaaaba.aaab(ba(a(-552833835, var1 ^ -1058278986), a(-552833836, var1 ^ 2117605747))))
      );
   }

   @Override
   public String ababa() {
      // $VF: Couldn't be decompiled
      // Please report this to the Vineflower issue tracker, at https://github.com/Vineflower/vineflower/issues with a copy of the class file (if you have the rights to distribute it!)
      // java.lang.RuntimeException: parsing failure!
      //   at org.jetbrains.java.decompiler.modules.decompiler.decompose.DomHelper.parseGraph(DomHelper.java:211)
      //   at org.jetbrains.java.decompiler.main.rels.MethodProcessor.codeToJava(MethodProcessor.java:166)
      //
      // Bytecode:
      // 00: getstatic qeaa361f143ee4a0894bd168fd9b30c66/qf4ccf8f5435d4a78bdca4d6a018b578e/aabbabbab.ab I
      // 03: aload 0
      // 04: getfield qeaa361f143ee4a0894bd168fd9b30c66/qf4ccf8f5435d4a78bdca4d6a018b578e/baab.bb Lqeaa361f143ee4a0894bd168fd9b30c66/qf4ccf8f5435d4a78bdca4d6a018b578e/aaaaaaba;
      // 07: astore 2
      // 08: istore 1
      // 09: aload 2
      // 0a: iload 1
      // 0b: ifne 1d
      // 0e: ifnonnull 1c
      // 11: goto 15
      // 14: athrow
      // 15: ldc_w ""
      // 18: goto 20
      // 1b: athrow
      // 1c: aload 2
      // 1d: invokevirtual qeaa361f143ee4a0894bd168fd9b30c66/qf4ccf8f5435d4a78bdca4d6a018b578e/aaaaaaba.toString ()Ljava/lang/String;
      // 20: areturn
   }

   @Override
   public void aabaa() {
      this.aaaa = null;
      this.bb = null;
      this.bab = 0;
   }

   private static int a(int var0, int var1) {
      int var2 = aaba[var0 ^ -552833537] ^ var1 ^ var0;
      var2 -= 15364;
      var2 ^= 53103;
      var2 += 40274;
      var2 -= 60266;
      var2 += 60680;
      var2 ^= 36633;
      return var2 ^ 16289;
   }

   @Override
   public void bbaa() {
      // $VF: Couldn't be decompiled
      // Please report this to the Vineflower issue tracker, at https://github.com/Vineflower/vineflower/issues with a copy of the class file (if you have the rights to distribute it!)
      // java.lang.RuntimeException: parsing failure!
      //   at org.jetbrains.java.decompiler.modules.decompiler.decompose.DomHelper.parseGraph(DomHelper.java:211)
      //   at org.jetbrains.java.decompiler.main.rels.MethodProcessor.codeToJava(MethodProcessor.java:166)
      //
      // Bytecode:
      // 000: getstatic qeaa361f143ee4a0894bd168fd9b30c66/qf4ccf8f5435d4a78bdca4d6a018b578e/aabbabbab.ab I
      // 003: invokestatic net/minecraft/class_310.method_1551 ()Lnet/minecraft/class_310;
      // 006: astore 2
      // 007: istore 1
      // 008: aload 2
      // 009: iload 1
      // 00a: ifne 01a
      // 00d: ifnonnull 019
      // 010: goto 014
      // 013: athrow
      // 014: aconst_null
      // 015: goto 01d
      // 018: athrow
      // 019: aload 2
      // 01a: getfield net/minecraft/class_310.field_1724 Lnet/minecraft/class_746;
      // 01d: astore 3
      // 01e: iload 1
      // 01f: ifne 056
      // 022: aload 3
      // 023: ifnull 048
      // 026: goto 02a
      // 029: athrow
      // 02a: aload 2
      // 02b: getfield net/minecraft/class_310.field_1687 Lnet/minecraft/class_638;
      // 02e: ifnull 048
      // 031: goto 035
      // 034: athrow
      // 035: aload 3
      // 036: iload 1
      // 037: ifne 058
      // 03a: goto 03e
      // 03d: athrow
      // 03e: invokevirtual net/minecraft/class_746.method_31548 ()Lnet/minecraft/class_1661;
      // 041: ifnonnull 057
      // 044: goto 048
      // 047: athrow
      // 048: aload 0
      // 049: aconst_null
      // 04a: putfield qeaa361f143ee4a0894bd168fd9b30c66/qf4ccf8f5435d4a78bdca4d6a018b578e/baab.aaaa Lqeaa361f143ee4a0894bd168fd9b30c66/qf4ccf8f5435d4a78bdca4d6a018b578e/aaaaaaba;
      // 04d: aload 0
      // 04e: bipush 0
      // 04f: putfield qeaa361f143ee4a0894bd168fd9b30c66/qf4ccf8f5435d4a78bdca4d6a018b578e/baab.bab I
      // 052: goto 056
      // 055: athrow
      // 056: return
      // 057: aload 3
      // 058: iload 1
      // 059: ifne 07d
      // 05c: getfield net/minecraft/class_746.field_6012 I
      // 05f: ldc_w -552833837
      // 062: ldc_w 1159099853
      // 065: ldc_w 807242567
      // 068: ixor
      // 069: invokestatic qeaa361f143ee4a0894bd168fd9b30c66/qf4ccf8f5435d4a78bdca4d6a018b578e/baab.a (II)I
      // 06c: ldc2_w 7124270327510422584
      // 06f: invokestatic qeaa361f143ee4a0894bd168fd9b30c66/qf4ccf8f5435d4a78bdca4d6a018b578e/baab.aa (IJ)I
      // 072: irem
      // 073: ifeq 07c
      // 076: goto 07a
      // 079: athrow
      // 07a: return
      // 07b: athrow
      // 07c: aload 3
      // 07d: invokestatic qeaa361f143ee4a0894bd168fd9b30c66/qf4ccf8f5435d4a78bdca4d6a018b578e/baab.aba (Lnet/minecraft/class_746;)Lqeaa361f143ee4a0894bd168fd9b30c66/qf4ccf8f5435d4a78bdca4d6a018b578e/aaaaaaba;
      // 080: astore 4
      // 082: aload 4
      // 084: iload 1
      // 085: ifne 0bb
      // 088: aload 0
      // 089: getfield qeaa361f143ee4a0894bd168fd9b30c66/qf4ccf8f5435d4a78bdca4d6a018b578e/baab.aaaa Lqeaa361f143ee4a0894bd168fd9b30c66/qf4ccf8f5435d4a78bdca4d6a018b578e/aaaaaaba;
      // 08c: if_acmpeq 0b9
      // 08f: goto 093
      // 092: athrow
      // 093: aload 0
      // 094: iload 1
      // 095: ifne 0b4
      // 098: goto 09c
      // 09b: athrow
      // 09c: aload 4
      // 09e: putfield qeaa361f143ee4a0894bd168fd9b30c66/qf4ccf8f5435d4a78bdca4d6a018b578e/baab.aaaa Lqeaa361f143ee4a0894bd168fd9b30c66/qf4ccf8f5435d4a78bdca4d6a018b578e/aaaaaaba;
      // 0a1: aload 0
      // 0a2: bipush 0
      // 0a3: putfield qeaa361f143ee4a0894bd168fd9b30c66/qf4ccf8f5435d4a78bdca4d6a018b578e/baab.bab I
      // 0a6: aload 4
      // 0a8: ifnonnull 0b8
      // 0ab: goto 0af
      // 0ae: athrow
      // 0af: aload 0
      // 0b0: goto 0b4
      // 0b3: athrow
      // 0b4: aconst_null
      // 0b5: putfield qeaa361f143ee4a0894bd168fd9b30c66/qf4ccf8f5435d4a78bdca4d6a018b578e/baab.bb Lqeaa361f143ee4a0894bd168fd9b30c66/qf4ccf8f5435d4a78bdca4d6a018b578e/aaaaaaba;
      // 0b8: return
      // 0b9: aload 4
      // 0bb: iload 1
      // 0bc: ifne 0c8
      // 0bf: ifnull 0cf
      // 0c2: goto 0c6
      // 0c5: athrow
      // 0c6: aload 4
      // 0c8: aload 0
      // 0c9: getfield qeaa361f143ee4a0894bd168fd9b30c66/qf4ccf8f5435d4a78bdca4d6a018b578e/baab.bb Lqeaa361f143ee4a0894bd168fd9b30c66/qf4ccf8f5435d4a78bdca4d6a018b578e/aaaaaaba;
      // 0cc: if_acmpne 0d1
      // 0cf: return
      // 0d0: athrow
      // 0d1: aload 0
      // 0d2: iload 1
      // 0d3: ifne 112
      // 0d6: dup
      // 0d7: getfield qeaa361f143ee4a0894bd168fd9b30c66/qf4ccf8f5435d4a78bdca4d6a018b578e/baab.bab I
      // 0da: ldc_w -552833838
      // 0dd: ldc_w 1159099853
      // 0e0: ldc_w -1515432873
      // 0e3: ixor
      // 0e4: invokestatic qeaa361f143ee4a0894bd168fd9b30c66/qf4ccf8f5435d4a78bdca4d6a018b578e/baab.a (II)I
      // 0e7: ldc2_w 6334219742880651302
      // 0ea: invokestatic qeaa361f143ee4a0894bd168fd9b30c66/qf4ccf8f5435d4a78bdca4d6a018b578e/baab.aa (IJ)I
      // 0ed: iadd
      // 0ee: putfield qeaa361f143ee4a0894bd168fd9b30c66/qf4ccf8f5435d4a78bdca4d6a018b578e/baab.bab I
      // 0f1: aload 0
      // 0f2: getfield qeaa361f143ee4a0894bd168fd9b30c66/qf4ccf8f5435d4a78bdca4d6a018b578e/baab.bab I
      // 0f5: aload 0
      // 0f6: getfield qeaa361f143ee4a0894bd168fd9b30c66/qf4ccf8f5435d4a78bdca4d6a018b578e/baab.baa Lqeaa361f143ee4a0894bd168fd9b30c66/qf4ccf8f5435d4a78bdca4d6a018b578e/bababa;
      // 0f9: invokevirtual qeaa361f143ee4a0894bd168fd9b30c66/qf4ccf8f5435d4a78bdca4d6a018b578e/bababa.abbb ()Ljava/lang/Object;
      // 0fc: checkcast java/lang/Double
      // 0ff: invokevirtual java/lang/Double.intValue ()I
      // 102: if_icmpge 10b
      // 105: goto 109
      // 108: athrow
      // 109: return
      // 10a: athrow
      // 10b: aload 0
      // 10c: aload 4
      // 10e: putfield qeaa361f143ee4a0894bd168fd9b30c66/qf4ccf8f5435d4a78bdca4d6a018b578e/baab.bb Lqeaa361f143ee4a0894bd168fd9b30c66/qf4ccf8f5435d4a78bdca4d6a018b578e/aaaaaaba;
      // 111: aload 0
      // 112: aload 4
      // 114: invokevirtual qeaa361f143ee4a0894bd168fd9b30c66/qf4ccf8f5435d4a78bdca4d6a018b578e/baab.aaa (Lqeaa361f143ee4a0894bd168fd9b30c66/qf4ccf8f5435d4a78bdca4d6a018b578e/aaaaaaba;)V
      // 117: return
   }
}
