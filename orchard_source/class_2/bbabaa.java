package nsc;

import com.mojang.authlib.GameProfile;
import java.lang.reflect.Field;
import java.util.UUID;
import net.fabricmc.api.EnvType;
import net.fabricmc.api.Environment;
import net.minecraft.class_1657;
import net.minecraft.class_2561;
import net.minecraft.class_310;
import net.minecraft.class_640;

@Environment(EnvType.CLIENT)
public final class bbabaa {
   private static final int[] b;
   private static final Object[] aaa;
   private static final String[] aa;
   private static final String[] ab;
   private static final String[] bb;
   private static final ababbbbaa ba;
   private static Field a;

   private static String aa(int var0, int var1) {
      int var9 = -824731500;
      int var2 = (var0 ^ a(-2127333329, var9 ^ -2131963107)) & a(-2127333330, var9 ^ 1176267888);
      if (ab[var2] == null) {
         char[] var3 = aa[var2].toCharArray();

         int var4 = switch (var3[0] & a(-2127333331, var9 ^ 2032038543)) {
            case 0 -> a(-2127333332, var9 ^ -740555640);
            case 1 -> a(-2127333333, var9 ^ -1048813497);
            case 2 -> a(-2127333334, var9 ^ -1263929509);
            case 3 -> a(-2127333335, var9 ^ -112977169);
            case 4 -> 0;
            case 5 -> a(-2127333336, var9 ^ -1596470339);
            case 6 -> a(-2127333337, var9 ^ 1474915701);
            case 7 -> a(-2127333338, var9 ^ 1460839929);
            case 8 -> a(-2127333339, var9 ^ -823984092);
            case 9 -> a(-2127333340, var9 ^ -1706693310);
            case 10 -> a(-2127333341, var9 ^ 904974887);
            case 11 -> a(-2127333342, var9 ^ 1521185409);
            case 12 -> a(-2127333343, var9 ^ 2139187722);
            case 13 -> a(-2127333344, var9 ^ -270936649);
            case 14 -> a(-2127333313, var9 ^ -767747853);
            case 15 -> a(-2127333314, var9 ^ -1003870195);
            case 16 -> a(-2127333315, var9 ^ 104139675);
            case 17 -> a(-2127333316, var9 ^ 673333452);
            case 18 -> a(-2127333317, var9 ^ 1735462680);
            case 19 -> a(-2127333318, var9 ^ 1137331301);
            case 20 -> a(-2127333319, var9 ^ 1373539977);
            case 21 -> a(-2127333320, var9 ^ -2100278650);
            case 22 -> a(-2127333321, var9 ^ -247029735);
            case 23 -> a(-2127333322, var9 ^ -1542432963);
            case 24 -> a(-2127333323, var9 ^ -31597255);
            case 25 -> a(-2127333324, var9 ^ -2129891741);
            case 26 -> a(-2127333325, var9 ^ 2004412095);
            case 27 -> a(-2127333326, var9 ^ -159256006);
            case 28 -> a(-2127333327, var9 ^ 1375907290);
            case 29 -> a(-2127333328, var9 ^ -1248257175);
            case 30 -> a(-2127333361, var9 ^ -86778291);
            case 31 -> a(-2127333362, var9 ^ 1530458880);
            case 32 -> a(-2127333363, var9 ^ 84305655);
            case 33 -> a(-2127333364, var9 ^ -1271255585);
            case 34 -> a(-2127333365, var9 ^ 36456019);
            case 35 -> a(-2127333366, var9 ^ -2120794427);
            case 36 -> a(-2127333367, var9 ^ -80382595);
            case 37 -> a(-2127333368, var9 ^ -1102965814);
            case 38 -> a(-2127333369, var9 ^ -278436647);
            case 39 -> a(-2127333370, var9 ^ 433574657);
            case 40 -> a(-2127333371, var9 ^ -1726689632);
            case 41 -> a(-2127333372, var9 ^ 2026739925);
            case 42 -> a(-2127333373, var9 ^ 1332560881);
            case 43 -> a(-2127333374, var9 ^ 784050315);
            case 44 -> a(-2127333375, var9 ^ -289351402);
            case 45 -> a(-2127333376, var9 ^ -1233193724);
            case 46 -> a(-2127333345, var9 ^ -51829388);
            case 47 -> a(-2127333346, var9 ^ 1724001529);
            case 48 -> a(-2127333347, var9 ^ -146720688);
            case 49 -> a(-2127333348, var9 ^ -1444795515);
            case 50 -> a(-2127333349, var9 ^ -260735175);
            case 51 -> a(-2127333350, var9 ^ 2099202535);
            case 52 -> a(-2127333351, var9 ^ 1952306440);
            case 53 -> a(-2127333352, var9 ^ -57130243);
            case 54 -> a(-2127333353, var9 ^ 1231051754);
            case 55 -> a(-2127333354, var9 ^ -1676499254);
            case 56 -> a(-2127333355, var9 ^ 335061839);
            case 57 -> a(-2127333356, var9 ^ 300990497);
            case 58 -> a(-2127333357, var9 ^ 1866650617);
            case 59 -> a(-2127333358, var9 ^ 887535753);
            case 60 -> a(-2127333359, var9 ^ 1094133902);
            case 61 -> a(-2127333360, var9 ^ 369866723);
            case 62 -> a(-2127333265, var9 ^ 941556965);
            case 63 -> a(-2127333266, var9 ^ 1767135823);
            case 64 -> a(-2127333267, var9 ^ 1706716167);
            case 65 -> a(-2127333268, var9 ^ -2067658803);
            case 66 -> a(-2127333269, var9 ^ 1476002697);
            case 67 -> a(-2127333270, var9 ^ -1006227729);
            case 68 -> a(-2127333271, var9 ^ 993984653);
            case 69 -> a(-2127333272, var9 ^ -1726021819);
            case 70 -> a(-2127333273, var9 ^ 591211409);
            case 71 -> a(-2127333274, var9 ^ -1941379512);
            case 72 -> a(-2127333275, var9 ^ -568232093);
            case 73 -> a(-2127333276, var9 ^ -1719513345);
            case 74 -> a(-2127333277, var9 ^ 1310351221);
            case 75 -> a(-2127333278, var9 ^ -1775427017);
            case 76 -> a(-2127333279, var9 ^ 46836222);
            case 77 -> a(-2127333280, var9 ^ 1543208964);
            case 78 -> a(-2127333249, var9 ^ 738377766);
            case 79 -> a(-2127333250, var9 ^ 837789088);
            case 80 -> a(-2127333251, var9 ^ -65985011);
            case 81 -> a(-2127333252, var9 ^ 1408786812);
            case 82 -> 4;
            case 83 -> a(-2127333253, var9 ^ -1717405084);
            case 84 -> a(-2127333254, var9 ^ -1533742382);
            case 85 -> a(-2127333255, var9 ^ 1283214500);
            case 86 -> a(-2127333256, var9 ^ -1427384414);
            case 87 -> a(-2127333257, var9 ^ -783658754);
            case 88 -> a(-2127333258, var9 ^ -1513519242);
            case 89 -> a(-2127333259, var9 ^ 878431583);
            case 90 -> a(-2127333260, var9 ^ -221792941);
            case 91 -> a(-2127333261, var9 ^ -1915412632);
            case 92 -> a(-2127333262, var9 ^ 346786005);
            case 93 -> a(-2127333263, var9 ^ -1466679297);
            case 94 -> a(-2127333264, var9 ^ -836052054);
            case 95 -> a(-2127333297, var9 ^ -277953898);
            case 96 -> a(-2127333298, var9 ^ 1740507933);
            case 97 -> a(-2127333299, var9 ^ 1802429363);
            case 98 -> a(-2127333300, var9 ^ -281567072);
            case 99 -> a(-2127333301, var9 ^ -539083770);
            case 100 -> a(-2127333302, var9 ^ -1848078098);
            case 101 -> a(-2127333303, var9 ^ 128141488);
            case 102 -> a(-2127333304, var9 ^ -1794375118);
            case 103 -> a(-2127333305, var9 ^ -547466268);
            case 104 -> a(-2127333306, var9 ^ 341066641);
            case 105 -> a(-2127333307, var9 ^ -1272006964);
            case 106 -> a(-2127333308, var9 ^ 1970007919);
            case 107 -> a(-2127333309, var9 ^ -2069247679);
            case 108 -> a(-2127333310, var9 ^ -908542877);
            case 109 -> a(-2127333311, var9 ^ -1191143057);
            case 110 -> a(-2127333312, var9 ^ -694574314);
            case 111 -> a(-2127333281, var9 ^ -1657970255);
            case 112 -> a(-2127333282, var9 ^ 1544586640);
            case 113 -> a(-2127333283, var9 ^ -550220252);
            case 114 -> a(-2127333284, var9 ^ -1484445263);
            case 115 -> a(-2127333285, var9 ^ -774482976);
            case 116 -> a(-2127333286, var9 ^ 1791936309);
            case 117 -> a(-2127333287, var9 ^ -1256806726);
            case 118 -> a(-2127333288, var9 ^ -1173311150);
            case 119 -> a(-2127333289, var9 ^ 1589761019);
            case 120 -> a(-2127333290, var9 ^ 978204581);
            case 121 -> a(-2127333291, var9 ^ 1187156545);
            case 122 -> a(-2127333292, var9 ^ 232705020);
            case 123 -> a(-2127333293, var9 ^ 905870346);
            case 124 -> a(-2127333294, var9 ^ -1773231286);
            case 125 -> a(-2127333295, var9 ^ -1536816484);
            case 126 -> a(-2127333296, var9 ^ 1065434733);
            case 127 -> a(-2127333201, var9 ^ -194886898);
            case 128 -> a(-2127333202, var9 ^ -1385565369);
            case 129 -> a(-2127333203, var9 ^ 1468951497);
            case 130 -> a(-2127333204, var9 ^ 373172602);
            case 131 -> 5;
            case 132 -> a(-2127333205, var9 ^ 1820536964);
            case 133 -> a(-2127333206, var9 ^ -980172373);
            case 134 -> a(-2127333207, var9 ^ 70714559);
            case 135 -> a(-2127333208, var9 ^ 2078810405);
            case 136 -> a(-2127333209, var9 ^ 313879231);
            case 137 -> a(-2127333210, var9 ^ -2135840938);
            case 138 -> a(-2127333211, var9 ^ 2092337092);
            case 139 -> a(-2127333212, var9 ^ 257698869);
            case 140 -> a(-2127333213, var9 ^ -833380232);
            case 141 -> a(-2127333214, var9 ^ 36407403);
            case 142 -> a(-2127333215, var9 ^ -1009116651);
            case 143 -> a(-2127333216, var9 ^ 1832964432);
            case 144 -> a(-2127333185, var9 ^ -267137490);
            case 145 -> a(-2127333186, var9 ^ 1492392187);
            case 146 -> a(-2127333187, var9 ^ 1418965554);
            case 147 -> a(-2127333188, var9 ^ 1690264399);
            case 148 -> a(-2127333189, var9 ^ 1165461982);
            case 149 -> a(-2127333190, var9 ^ 10029763);
            case 150 -> a(-2127333191, var9 ^ -254087192);
            case 151 -> a(-2127333192, var9 ^ 904224099);
            case 152 -> a(-2127333193, var9 ^ -1308080768);
            case 153 -> a(-2127333194, var9 ^ -1765864903);
            case 154 -> a(-2127333195, var9 ^ 658808059);
            case 155 -> a(-2127333196, var9 ^ -611932877);
            case 156 -> a(-2127333197, var9 ^ -796639197);
            case 157 -> a(-2127333198, var9 ^ 1533811642);
            case 158 -> a(-2127333199, var9 ^ -1060868263);
            case 159 -> a(-2127333200, var9 ^ -1675117933);
            case 160 -> a(-2127333233, var9 ^ 1650033094);
            case 161 -> a(-2127333234, var9 ^ 811436532);
            case 162 -> a(-2127333235, var9 ^ 512935689);
            case 163 -> a(-2127333236, var9 ^ -1399965823);
            case 164 -> a(-2127333237, var9 ^ 1382552657);
            case 165 -> a(-2127333238, var9 ^ -113140880);
            case 166 -> a(-2127333239, var9 ^ 2026909245);
            case 167 -> a(-2127333240, var9 ^ 1857110709);
            case 168 -> a(-2127333241, var9 ^ -1986115441);
            case 169 -> a(-2127333242, var9 ^ -688217361);
            case 170 -> a(-2127333243, var9 ^ 1475361295);
            case 171 -> a(-2127333244, var9 ^ 1836155127);
            case 172 -> a(-2127333245, var9 ^ 1630839012);
            case 173 -> a(-2127333246, var9 ^ -868213551);
            case 174 -> a(-2127333247, var9 ^ -1434743054);
            case 175 -> a(-2127333248, var9 ^ -676860713);
            case 176 -> a(-2127333217, var9 ^ -2097079960);
            case 177 -> a(-2127333218, var9 ^ 398827554);
            case 178 -> a(-2127333219, var9 ^ 261165456);
            case 179 -> a(-2127333220, var9 ^ -94972633);
            case 180 -> a(-2127333221, var9 ^ -1938760185);
            case 181 -> a(-2127333222, var9 ^ 1983536605);
            case 182 -> a(-2127333223, var9 ^ 581171100);
            case 183 -> a(-2127333224, var9 ^ -1833755831);
            case 184 -> a(-2127333225, var9 ^ -629451900);
            case 185 -> a(-2127333226, var9 ^ -426583627);
            case 186 -> a(-2127333227, var9 ^ -274431472);
            case 187 -> a(-2127333228, var9 ^ 57429291);
            case 188 -> a(-2127333229, var9 ^ 1405603110);
            case 189 -> a(-2127333230, var9 ^ 1051583741);
            case 190 -> a(-2127333231, var9 ^ 891770234);
            case 191 -> a(-2127333232, var9 ^ 1849760447);
            case 192 -> a(-2127333137, var9 ^ -1292374214);
            case 193 -> a(-2127333138, var9 ^ 232719768);
            case 194 -> a(-2127333139, var9 ^ -1422193683);
            case 195 -> a(-2127333140, var9 ^ 550314681);
            case 196 -> a(-2127333141, var9 ^ -917019839);
            case 197 -> a(-2127333142, var9 ^ -1315660621);
            case 198 -> a(-2127333143, var9 ^ 2135496364);
            case 199 -> a(-2127333144, var9 ^ 491884427);
            case 200 -> a(-2127333145, var9 ^ 164090698);
            case 201 -> 3;
            case 202 -> a(-2127333146, var9 ^ -509571287);
            case 203 -> a(-2127333147, var9 ^ -892943791);
            case 204 -> a(-2127333148, var9 ^ 670546222);
            case 205 -> a(-2127333149, var9 ^ -1812084095);
            case 206 -> a(-2127333150, var9 ^ -1683745720);
            case 207 -> a(-2127333151, var9 ^ -1672061600);
            case 208 -> a(-2127333152, var9 ^ 2022046779);
            case 209 -> a(-2127333121, var9 ^ -829001503);
            case 210 -> a(-2127333122, var9 ^ 1179074392);
            case 211 -> a(-2127333123, var9 ^ -1093111477);
            case 212 -> 1;
            case 213 -> a(-2127333124, var9 ^ 1587136235);
            case 214 -> a(-2127333125, var9 ^ 452361521);
            case 215 -> a(-2127333126, var9 ^ -943136294);
            case 216 -> a(-2127333127, var9 ^ -1624438329);
            case 217 -> a(-2127333128, var9 ^ 989824052);
            case 218 -> a(-2127333129, var9 ^ 534264500);
            case 219 -> a(-2127333130, var9 ^ 1670471336);
            case 220 -> a(-2127333131, var9 ^ 222069630);
            case 221 -> a(-2127333132, var9 ^ -1276883281);
            case 222 -> a(-2127333133, var9 ^ 1698804550);
            case 223 -> a(-2127333134, var9 ^ 548457682);
            case 224 -> a(-2127333135, var9 ^ 1721548976);
            case 225 -> a(-2127333136, var9 ^ 800907628);
            case 226 -> 2;
            case 227 -> a(-2127333169, var9 ^ 537353100);
            case 228 -> a(-2127333170, var9 ^ 1586524286);
            case 229 -> a(-2127333171, var9 ^ -712274314);
            case 230 -> a(-2127333172, var9 ^ 1281342323);
            case 231 -> a(-2127333173, var9 ^ 1572871795);
            case 232 -> a(-2127333174, var9 ^ 1883281574);
            case 233 -> a(-2127333175, var9 ^ 247315978);
            case 234 -> a(-2127333176, var9 ^ -1117096508);
            case 235 -> a(-2127333177, var9 ^ -253024809);
            case 236 -> a(-2127333178, var9 ^ 822272300);
            case 237 -> a(-2127333179, var9 ^ -1093018822);
            case 238 -> a(-2127333180, var9 ^ 391909995);
            case 239 -> a(-2127333181, var9 ^ 358019934);
            case 240 -> a(-2127333182, var9 ^ -1107989766);
            case 241 -> a(-2127333183, var9 ^ -1204244381);
            case 242 -> a(-2127333184, var9 ^ 1783888923);
            case 243 -> a(-2127333153, var9 ^ -1746079396);
            case 244 -> a(-2127333154, var9 ^ -1516323877);
            case 245 -> a(-2127333155, var9 ^ 2016378276);
            case 246 -> a(-2127333156, var9 ^ -134269463);
            case 247 -> a(-2127333157, var9 ^ 1688285092);
            case 248 -> a(-2127333158, var9 ^ 694761398);
            case 249 -> a(-2127333159, var9 ^ 990922519);
            case 250 -> a(-2127333160, var9 ^ 1849609089);
            case 251 -> a(-2127333161, var9 ^ 1353251990);
            case 252 -> a(-2127333162, var9 ^ 1946188345);
            case 253 -> a(-2127333163, var9 ^ 1562970962);
            case 254 -> a(-2127333164, var9 ^ -698815596);
            default -> a(-2127333165, var9 ^ -719575270);
         };
         int var5 = (var1 & a(-2127333166, var9 ^ -1277650658)) - var4;
         if (var5 < 0) {
            var5 += 256;
         }

         int var6 = ((var1 & a(-2127333167, var9 ^ -1701656767)) >>> a(-2127333168, var9 ^ -1015848492)) - var4;
         if (var6 < 0) {
            var6 += 256;
         }

         for (int var7 = 0; var7 < var3.length; var7++) {
            int var8 = var7 % 2;
            char var10002 = var3[var7];
            if (var8 == 0) {
               var3[var7] = (char)(var10002 ^ var5);
               var5 = ((var5 >>> 3 | var5 << 5) ^ var3[var7]) & a(-2127333073, var9 ^ -551967120);
            } else {
               var3[var7] = (char)(var10002 ^ var6);
               var6 = ((var6 >>> 3 | var6 << 5) ^ var3[var7]) & a(-2127333074, var9 ^ 84733540);
            }
         }

         ab[var2] = new String(var3).intern();
      }

      return ab[var2];
   }

   private static boolean ab(GameProfile param0) {
      // $VF: Couldn't be decompiled
      // Please report this to the Vineflower issue tracker, at https://github.com/Vineflower/vineflower/issues with a copy of the class file (if you have the rights to distribute it!)
      // java.lang.RuntimeException: parsing failure!
      //   at org.jetbrains.java.decompiler.modules.decompiler.decompose.DomHelper.parseGraph(DomHelper.java:211)
      //   at org.jetbrains.java.decompiler.main.rels.MethodProcessor.codeToJava(MethodProcessor.java:166)
      //
      // Bytecode:
      // 00: getstatic qeaa361f143ee4a0894bd168fd9b30c66/qf4ccf8f5435d4a78bdca4d6a018b578e/baaabbaa.bba I
      // 03: istore 1
      // 04: aload 0
      // 05: ifnull 1a
      // 08: invokestatic qeaa361f143ee4a0894bd168fd9b30c66/qf4ccf8f5435d4a78bdca4d6a018b578e/bbabaa.bb ()Z
      // 0b: iload 1
      // 0c: ifne 1b
      // 0f: goto 13
      // 12: athrow
      // 13: ifne 1c
      // 16: goto 1a
      // 19: athrow
      // 1a: bipush 0
      // 1b: ireturn
      // 1c: invokestatic net/minecraft/class_310.method_1551 ()Lnet/minecraft/class_310;
      // 1f: astore 2
      // 20: aload 2
      // 21: getfield net/minecraft/class_310.field_1724 Lnet/minecraft/class_746;
      // 24: ifnonnull 2a
      // 27: bipush 0
      // 28: ireturn
      // 29: athrow
      // 2a: aload 0
      // 2b: invokestatic qeaa361f143ee4a0894bd168fd9b30c66/qf4ccf8f5435d4a78bdca4d6a018b578e/baababbb.bb (Lcom/mojang/authlib/GameProfile;)Ljava/util/UUID;
      // 2e: astore 3
      // 2f: aload 3
      // 30: iload 1
      // 31: ifne 3c
      // 34: ifnull 52
      // 37: goto 3b
      // 3a: athrow
      // 3b: aload 3
      // 3c: aload 2
      // 3d: getfield net/minecraft/class_310.field_1724 Lnet/minecraft/class_746;
      // 40: invokestatic qeaa361f143ee4a0894bd168fd9b30c66/qf4ccf8f5435d4a78bdca4d6a018b578e/bbabaa.abb (Ljava/util/UUID;Lnet/minecraft/class_1657;)Z
      // 43: iload 1
      // 44: ifne 4f
      // 47: ifeq 52
      // 4a: goto 4e
      // 4d: athrow
      // 4e: bipush 1
      // 4f: goto 53
      // 52: bipush 0
      // 53: ireturn
   }

   static void ba() {
      a = null;
   }

   private static boolean bb() {
      // $VF: Couldn't be decompiled
      // Please report this to the Vineflower issue tracker, at https://github.com/Vineflower/vineflower/issues with a copy of the class file (if you have the rights to distribute it!)
      // java.lang.RuntimeException: parsing failure!
      //   at org.jetbrains.java.decompiler.modules.decompiler.decompose.DomHelper.parseGraph(DomHelper.java:211)
      //   at org.jetbrains.java.decompiler.main.rels.MethodProcessor.codeToJava(MethodProcessor.java:166)
      //
      // Bytecode:
      // 00: getstatic qeaa361f143ee4a0894bd168fd9b30c66/qf4ccf8f5435d4a78bdca4d6a018b578e/baaabbaa.bba I
      // 03: invokestatic qeaa361f143ee4a0894bd168fd9b30c66/qf4ccf8f5435d4a78bdca4d6a018b578e/abaaaaaba.aaaaa ()Lqeaa361f143ee4a0894bd168fd9b30c66/qf4ccf8f5435d4a78bdca4d6a018b578e/abaaaaaba;
      // 06: astore 1
      // 07: istore 0
      // 08: aload 1
      // 09: iload 0
      // 0a: ifne 18
      // 0d: ifnonnull 17
      // 10: goto 14
      // 13: athrow
      // 14: bipush 0
      // 15: ireturn
      // 16: athrow
      // 17: aload 1
      // 18: invokevirtual qeaa361f143ee4a0894bd168fd9b30c66/qf4ccf8f5435d4a78bdca4d6a018b578e/abaaaaaba.aaba ()Lqeaa361f143ee4a0894bd168fd9b30c66/qf4ccf8f5435d4a78bdca4d6a018b578e/babbaba;
      // 1b: invokevirtual qeaa361f143ee4a0894bd168fd9b30c66/qf4ccf8f5435d4a78bdca4d6a018b578e/babbaba.ab ()Lqeaa361f143ee4a0894bd168fd9b30c66/qf4ccf8f5435d4a78bdca4d6a018b578e/abaaaaba;
      // 1e: astore 2
      // 1f: aload 2
      // 20: iload 0
      // 21: ifne 2c
      // 24: ifnull 3e
      // 27: goto 2b
      // 2a: athrow
      // 2b: aload 2
      // 2c: invokevirtual qeaa361f143ee4a0894bd168fd9b30c66/qf4ccf8f5435d4a78bdca4d6a018b578e/abaaaaba.babbaab ()Z
      // 2f: iload 0
      // 30: ifne 3b
      // 33: ifeq 3e
      // 36: goto 3a
      // 39: athrow
      // 3a: bipush 1
      // 3b: goto 3f
      // 3e: bipush 0
      // 3f: ireturn
   }

   public static boolean aaa(Object param0) {
      // $VF: Couldn't be decompiled
      // Please report this to the Vineflower issue tracker, at https://github.com/Vineflower/vineflower/issues with a copy of the class file (if you have the rights to distribute it!)
      //
      // Bytecode:
      // 00: getstatic qeaa361f143ee4a0894bd168fd9b30c66/qf4ccf8f5435d4a78bdca4d6a018b578e/baaabbaa.bba I
      // 03: istore 1
      // 04: aload 0
      // 05: ifnonnull 0b
      // 08: bipush 0
      // 09: ireturn
      // 0a: athrow
      // 0b: getstatic qeaa361f143ee4a0894bd168fd9b30c66/qf4ccf8f5435d4a78bdca4d6a018b578e/bbabaa.a Ljava/lang/reflect/Field;
      // 0e: iload 1
      // 0f: ifne 63
      // 12: ifnull 32
      // 15: goto 19
      // 18: athrow
      // 19: getstatic qeaa361f143ee4a0894bd168fd9b30c66/qf4ccf8f5435d4a78bdca4d6a018b578e/bbabaa.a Ljava/lang/reflect/Field;
      // 1c: iload 1
      // 1d: ifne 6e
      // 20: goto 24
      // 23: athrow
      // 24: invokevirtual java/lang/reflect/Field.getDeclaringClass ()Ljava/lang/Class;
      // 27: aload 0
      // 28: invokevirtual java/lang/Object.getClass ()Ljava/lang/Class;
      // 2b: if_acmpeq 67
      // 2e: goto 32
      // 31: athrow
      // 32: aload 0
      // 33: invokevirtual java/lang/Object.getClass ()Ljava/lang/Class;
      // 36: ldc_w -2127333075
      // 39: ldc_w 1605594190
      // 3c: ldc_w 1007681271
      // 3f: ixor
      // 40: invokestatic qeaa361f143ee4a0894bd168fd9b30c66/qf4ccf8f5435d4a78bdca4d6a018b578e/bbabaa.a (II)I
      // 43: ldc_w -2127333076
      // 46: ldc_w 1605594190
      // 49: ldc_w -1962163426
      // 4c: ixor
      // 4d: invokestatic qeaa361f143ee4a0894bd168fd9b30c66/qf4ccf8f5435d4a78bdca4d6a018b578e/bbabaa.a (II)I
      // 50: invokestatic qeaa361f143ee4a0894bd168fd9b30c66/qf4ccf8f5435d4a78bdca4d6a018b578e/bbabaa.aa (II)Ljava/lang/String;
      // 53: invokestatic qeaa361f143ee4a0894bd168fd9b30c66/qf4ccf8f5435d4a78bdca4d6a018b578e/aabbaaaba.abba (Ljava/lang/String;)Ljava/lang/String;
      // 56: invokevirtual java/lang/Class.getDeclaredField (Ljava/lang/String;)Ljava/lang/reflect/Field;
      // 59: putstatic qeaa361f143ee4a0894bd168fd9b30c66/qf4ccf8f5435d4a78bdca4d6a018b578e/bbabaa.a Ljava/lang/reflect/Field;
      // 5c: getstatic qeaa361f143ee4a0894bd168fd9b30c66/qf4ccf8f5435d4a78bdca4d6a018b578e/bbabaa.a Ljava/lang/reflect/Field;
      // 5f: goto 63
      // 62: athrow
      // 63: bipush 1
      // 64: invokevirtual java/lang/reflect/Field.setAccessible (Z)V
      // 67: getstatic qeaa361f143ee4a0894bd168fd9b30c66/qf4ccf8f5435d4a78bdca4d6a018b578e/bbabaa.a Ljava/lang/reflect/Field;
      // 6a: aload 0
      // 6b: invokevirtual java/lang/reflect/Field.get (Ljava/lang/Object;)Ljava/lang/Object;
      // 6e: astore 2
      // 6f: aload 2
      // 70: iload 1
      // 71: ifne 83
      // 74: instanceof net/minecraft/class_1657
      // 77: ifeq 9d
      // 7a: goto 7e
      // 7d: athrow
      // 7e: aload 2
      // 7f: goto 83
      // 82: athrow
      // 83: checkcast net/minecraft/class_1657
      // 86: astore 3
      // 87: aload 3
      // 88: invokevirtual net/minecraft/class_1657.method_7334 ()Lcom/mojang/authlib/GameProfile;
      // 8b: invokestatic qeaa361f143ee4a0894bd168fd9b30c66/qf4ccf8f5435d4a78bdca4d6a018b578e/bbabaa.b (Lcom/mojang/authlib/GameProfile;)Z
      // 8e: iload 1
      // 8f: ifne 9a
      // 92: ifeq 9d
      // 95: goto 99
      // 98: athrow
      // 99: bipush 1
      // 9a: goto 9e
      // 9d: bipush 0
      // 9e: ireturn
      // 9f: astore 2
      // a0: bipush 0
      // a1: ireturn
   }

   public static class_2561 aab(Object param0, class_2561 param1) {
      // $VF: Couldn't be decompiled
      // Please report this to the Vineflower issue tracker, at https://github.com/Vineflower/vineflower/issues with a copy of the class file (if you have the rights to distribute it!)
      //
      // Bytecode:
      // 00: getstatic qeaa361f143ee4a0894bd168fd9b30c66/qf4ccf8f5435d4a78bdca4d6a018b578e/baaabbaa.bba I
      // 03: istore 2
      // 04: aload 0
      // 05: ifnonnull 0b
      // 08: aload 1
      // 09: areturn
      // 0a: athrow
      // 0b: getstatic qeaa361f143ee4a0894bd168fd9b30c66/qf4ccf8f5435d4a78bdca4d6a018b578e/bbabaa.a Ljava/lang/reflect/Field;
      // 0e: iload 2
      // 0f: ifne 63
      // 12: ifnull 32
      // 15: goto 19
      // 18: athrow
      // 19: getstatic qeaa361f143ee4a0894bd168fd9b30c66/qf4ccf8f5435d4a78bdca4d6a018b578e/bbabaa.a Ljava/lang/reflect/Field;
      // 1c: iload 2
      // 1d: ifne 6e
      // 20: goto 24
      // 23: athrow
      // 24: invokevirtual java/lang/reflect/Field.getDeclaringClass ()Ljava/lang/Class;
      // 27: aload 0
      // 28: invokevirtual java/lang/Object.getClass ()Ljava/lang/Class;
      // 2b: if_acmpeq 67
      // 2e: goto 32
      // 31: athrow
      // 32: aload 0
      // 33: invokevirtual java/lang/Object.getClass ()Ljava/lang/Class;
      // 36: ldc_w -2127333077
      // 39: ldc_w 2128227768
      // 3c: ldc_w 883312884
      // 3f: ixor
      // 40: invokestatic qeaa361f143ee4a0894bd168fd9b30c66/qf4ccf8f5435d4a78bdca4d6a018b578e/bbabaa.a (II)I
      // 43: ldc_w -2127333078
      // 46: ldc_w 2128227768
      // 49: ldc_w 1434214934
      // 4c: ixor
      // 4d: invokestatic qeaa361f143ee4a0894bd168fd9b30c66/qf4ccf8f5435d4a78bdca4d6a018b578e/bbabaa.a (II)I
      // 50: invokestatic qeaa361f143ee4a0894bd168fd9b30c66/qf4ccf8f5435d4a78bdca4d6a018b578e/bbabaa.aa (II)Ljava/lang/String;
      // 53: invokestatic qeaa361f143ee4a0894bd168fd9b30c66/qf4ccf8f5435d4a78bdca4d6a018b578e/aabbaaaba.abba (Ljava/lang/String;)Ljava/lang/String;
      // 56: invokevirtual java/lang/Class.getDeclaredField (Ljava/lang/String;)Ljava/lang/reflect/Field;
      // 59: putstatic qeaa361f143ee4a0894bd168fd9b30c66/qf4ccf8f5435d4a78bdca4d6a018b578e/bbabaa.a Ljava/lang/reflect/Field;
      // 5c: getstatic qeaa361f143ee4a0894bd168fd9b30c66/qf4ccf8f5435d4a78bdca4d6a018b578e/bbabaa.a Ljava/lang/reflect/Field;
      // 5f: goto 63
      // 62: athrow
      // 63: bipush 1
      // 64: invokevirtual java/lang/reflect/Field.setAccessible (Z)V
      // 67: getstatic qeaa361f143ee4a0894bd168fd9b30c66/qf4ccf8f5435d4a78bdca4d6a018b578e/bbabaa.a Ljava/lang/reflect/Field;
      // 6a: aload 0
      // 6b: invokevirtual java/lang/reflect/Field.get (Ljava/lang/Object;)Ljava/lang/Object;
      // 6e: astore 3
      // 6f: aload 3
      // 70: iload 2
      // 71: ifne 83
      // 74: instanceof net/minecraft/class_1657
      // 77: ifeq a4
      // 7a: goto 7e
      // 7d: athrow
      // 7e: aload 3
      // 7f: goto 83
      // 82: athrow
      // 83: checkcast net/minecraft/class_1657
      // 86: astore 4
      // 88: aload 4
      // 8a: iload 2
      // 8b: ifne 9c
      // 8e: invokestatic qeaa361f143ee4a0894bd168fd9b30c66/qf4ccf8f5435d4a78bdca4d6a018b578e/bbabaa.baa (Lnet/minecraft/class_1657;)Z
      // 91: ifeq 9a
      // 94: goto 98
      // 97: athrow
      // 98: aload 1
      // 99: areturn
      // 9a: aload 4
      // 9c: invokevirtual net/minecraft/class_1657.method_7334 ()Lcom/mojang/authlib/GameProfile;
      // 9f: aload 1
      // a0: invokestatic qeaa361f143ee4a0894bd168fd9b30c66/qf4ccf8f5435d4a78bdca4d6a018b578e/bbabaa.bab (Lcom/mojang/authlib/GameProfile;Lnet/minecraft/class_2561;)Lnet/minecraft/class_2561;
      // a3: areturn
      // a4: aload 1
      // a5: areturn
      // a6: astore 3
      // a7: aload 1
      // a8: areturn
   }

   private static String aaab(int var0, int var1) {
      int var3 = var0 ^ 1198650216;
      char[] var4 = bb[var3].toCharArray();
      StackTraceElement[] var2 = (StackTraceElement[])aaa[var3];
      StackTraceElement[] var5;
      if (var2 != null) {
         var5 = var2;
      } else {
         var5 = new Throwable().getStackTrace();
         aaa[var3] = var5;
      }

      StackTraceElement var6 = var5[1];
      int var7 = (var6.getClassName().hashCode() ^ var6.getMethodName().hashCode()) >> 16 ^ 1964826585;
      int var8 = 0;

      do {
         var4[var8] = (char)(var4[var8] ^ switch (var8 & 31) {
            default -> 253;
            case 1 -> 242;
            case 2 -> 95;
            case 3 -> 17;
            case 4 -> 184;
            case 5 -> 144;
            case 6 -> 130;
            case 7 -> 198;
            case 8 -> 243;
            case 9 -> 4;
            case 10 -> 41;
            case 11 -> 106;
            case 12 -> 163;
            case 13 -> 165;
            case 14 -> 48;
            case 15 -> 251;
            case 16 -> 132;
            case 17 -> 237;
            case 18 -> 60;
            case 19 -> 55;
            case 20 -> 118;
            case 21 -> 129;
            case 22 -> 213;
            case 23 -> 142;
            case 24 -> 0;
            case 25 -> 231;
            case 26 -> 188;
            case 27 -> 14;
            case 28 -> 216;
            case 29 -> 146;
            case 30 -> 193;
            case 31 -> 254;
         } ^ var1 >> 16 ^ var7);
      } while (++var8 < var4.length);

      return new String(var4).intern();
   }

   public static class_2561 aba(class_640 param0, class_2561 param1) {
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
      // 10: aload 1
      // 11: areturn
      // 12: athrow
      // 13: aload 0
      // 14: iload 2
      // 15: ifne 29
      // 18: invokevirtual net/minecraft/class_640.method_2966 ()Lcom/mojang/authlib/GameProfile;
      // 1b: invokestatic qeaa361f143ee4a0894bd168fd9b30c66/qf4ccf8f5435d4a78bdca4d6a018b578e/bbabaa.ab (Lcom/mojang/authlib/GameProfile;)Z
      // 1e: ifeq 28
      // 21: goto 25
      // 24: athrow
      // 25: aload 1
      // 26: areturn
      // 27: athrow
      // 28: aload 0
      // 29: invokevirtual net/minecraft/class_640.method_2966 ()Lcom/mojang/authlib/GameProfile;
      // 2c: aload 1
      // 2d: invokestatic qeaa361f143ee4a0894bd168fd9b30c66/qf4ccf8f5435d4a78bdca4d6a018b578e/bbabaa.bab (Lcom/mojang/authlib/GameProfile;Lnet/minecraft/class_2561;)Lnet/minecraft/class_2561;
      // 30: areturn
   }

   private bbabaa() {
   }

   private static boolean abb(UUID param0, class_1657 param1) {
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
      // 05: ifnonnull 0b
      // 08: bipush 0
      // 09: ireturn
      // 0a: athrow
      // 0b: aload 0
      // 0c: iload 2
      // 0d: ifne 28
      // 10: aload 1
      // 11: invokevirtual net/minecraft/class_1657.method_5667 ()Ljava/util/UUID;
      // 14: invokevirtual java/util/UUID.equals (Ljava/lang/Object;)Z
      // 17: ifeq 21
      // 1a: goto 1e
      // 1d: athrow
      // 1e: bipush 1
      // 1f: ireturn
      // 20: athrow
      // 21: aload 1
      // 22: invokevirtual net/minecraft/class_1657.method_7334 ()Lcom/mojang/authlib/GameProfile;
      // 25: invokestatic qeaa361f143ee4a0894bd168fd9b30c66/qf4ccf8f5435d4a78bdca4d6a018b578e/baababbb.bb (Lcom/mojang/authlib/GameProfile;)Ljava/util/UUID;
      // 28: astore 3
      // 29: aload 3
      // 2a: iload 2
      // 2b: ifne 36
      // 2e: ifnull 49
      // 31: goto 35
      // 34: athrow
      // 35: aload 0
      // 36: aload 3
      // 37: invokevirtual java/util/UUID.equals (Ljava/lang/Object;)Z
      // 3a: iload 2
      // 3b: ifne 46
      // 3e: ifeq 49
      // 41: goto 45
      // 44: athrow
      // 45: bipush 1
      // 46: goto 4a
      // 49: bipush 0
      // 4a: ireturn
   }

   private static boolean baa(class_1657 param0) {
      // $VF: Couldn't be decompiled
      // Please report this to the Vineflower issue tracker, at https://github.com/Vineflower/vineflower/issues with a copy of the class file (if you have the rights to distribute it!)
      // java.lang.RuntimeException: parsing failure!
      //   at org.jetbrains.java.decompiler.modules.decompiler.decompose.DomHelper.parseGraph(DomHelper.java:211)
      //   at org.jetbrains.java.decompiler.main.rels.MethodProcessor.codeToJava(MethodProcessor.java:166)
      //
      // Bytecode:
      // 00: getstatic qeaa361f143ee4a0894bd168fd9b30c66/qf4ccf8f5435d4a78bdca4d6a018b578e/baaabbaa.bba I
      // 03: istore 1
      // 04: aload 0
      // 05: ifnull 44
      // 08: invokestatic qeaa361f143ee4a0894bd168fd9b30c66/qf4ccf8f5435d4a78bdca4d6a018b578e/bbabaa.bb ()Z
      // 0b: iload 1
      // 0c: ifne 2e
      // 0f: goto 13
      // 12: athrow
      // 13: ifeq 44
      // 16: goto 1a
      // 19: athrow
      // 1a: aload 0
      // 1b: iload 1
      // 1c: ifne 32
      // 1f: goto 23
      // 22: athrow
      // 23: invokevirtual net/minecraft/class_1657.method_5667 ()Ljava/util/UUID;
      // 26: aload 0
      // 27: invokestatic qeaa361f143ee4a0894bd168fd9b30c66/qf4ccf8f5435d4a78bdca4d6a018b578e/bbabaa.abb (Ljava/util/UUID;Lnet/minecraft/class_1657;)Z
      // 2a: goto 2e
      // 2d: athrow
      // 2e: ifeq 44
      // 31: aload 0
      // 32: invokestatic qeaa361f143ee4a0894bd168fd9b30c66/qf4ccf8f5435d4a78bdca4d6a018b578e/bbabaa.bbb (Lnet/minecraft/class_1657;)Z
      // 35: iload 1
      // 36: ifne 41
      // 39: ifeq 44
      // 3c: goto 40
      // 3f: athrow
      // 40: bipush 1
      // 41: goto 45
      // 44: bipush 0
      // 45: ireturn
   }

   public static class_2561 bab(GameProfile var0, class_2561 var1) {
      return var1;
   }

   public static boolean bba(UUID param0) {
      // $VF: Couldn't be decompiled
      // Please report this to the Vineflower issue tracker, at https://github.com/Vineflower/vineflower/issues with a copy of the class file (if you have the rights to distribute it!)
      // java.lang.RuntimeException: parsing failure!
      //   at org.jetbrains.java.decompiler.modules.decompiler.decompose.DomHelper.parseGraph(DomHelper.java:211)
      //   at org.jetbrains.java.decompiler.main.rels.MethodProcessor.codeToJava(MethodProcessor.java:166)
      //
      // Bytecode:
      // 00: getstatic qeaa361f143ee4a0894bd168fd9b30c66/qf4ccf8f5435d4a78bdca4d6a018b578e/baaabbaa.bba I
      // 03: istore 1
      // 04: aload 0
      // 05: ifnonnull 0b
      // 08: bipush 0
      // 09: ireturn
      // 0a: athrow
      // 0b: invokestatic net/minecraft/class_310.method_1551 ()Lnet/minecraft/class_310;
      // 0e: astore 2
      // 0f: aload 2
      // 10: iload 1
      // 11: ifne 52
      // 14: getfield net/minecraft/class_310.field_1724 Lnet/minecraft/class_746;
      // 17: ifnull 51
      // 1a: goto 1e
      // 1d: athrow
      // 1e: aload 0
      // 1f: aload 2
      // 20: getfield net/minecraft/class_310.field_1724 Lnet/minecraft/class_746;
      // 23: invokestatic qeaa361f143ee4a0894bd168fd9b30c66/qf4ccf8f5435d4a78bdca4d6a018b578e/bbabaa.abb (Ljava/util/UUID;Lnet/minecraft/class_1657;)Z
      // 26: iload 1
      // 27: ifne 4b
      // 2a: goto 2e
      // 2d: athrow
      // 2e: ifeq 51
      // 31: goto 35
      // 34: athrow
      // 35: aload 2
      // 36: iload 1
      // 37: ifne 52
      // 3a: goto 3e
      // 3d: athrow
      // 3e: getfield net/minecraft/class_310.field_1724 Lnet/minecraft/class_746;
      // 41: invokevirtual net/minecraft/class_746.method_7334 ()Lcom/mojang/authlib/GameProfile;
      // 44: invokestatic qeaa361f143ee4a0894bd168fd9b30c66/qf4ccf8f5435d4a78bdca4d6a018b578e/bbabaa.b (Lcom/mojang/authlib/GameProfile;)Z
      // 47: goto 4b
      // 4a: athrow
      // 4b: ifeq 51
      // 4e: bipush 1
      // 4f: ireturn
      // 50: athrow
      // 51: aload 2
      // 52: iload 1
      // 53: ifne 8e
      // 56: invokevirtual net/minecraft/class_310.method_1562 ()Lnet/minecraft/class_634;
      // 59: ifnull 8d
      // 5c: goto 60
      // 5f: athrow
      // 60: aload 2
      // 61: iload 1
      // 62: ifne 8e
      // 65: goto 69
      // 68: athrow
      // 69: invokevirtual net/minecraft/class_310.method_1562 ()Lnet/minecraft/class_634;
      // 6c: aload 0
      // 6d: invokevirtual net/minecraft/class_634.method_2871 (Ljava/util/UUID;)Lnet/minecraft/class_640;
      // 70: astore 3
      // 71: aload 3
      // 72: ifnull 8d
      // 75: aload 3
      // 76: invokevirtual net/minecraft/class_640.method_2966 ()Lcom/mojang/authlib/GameProfile;
      // 79: invokestatic qeaa361f143ee4a0894bd168fd9b30c66/qf4ccf8f5435d4a78bdca4d6a018b578e/bbabaa.b (Lcom/mojang/authlib/GameProfile;)Z
      // 7c: iload 1
      // 7d: ifne 8c
      // 80: goto 84
      // 83: athrow
      // 84: ifeq 8d
      // 87: goto 8b
      // 8a: athrow
      // 8b: bipush 1
      // 8c: ireturn
      // 8d: aload 2
      // 8e: iload 1
      // 8f: ifne a0
      // 92: getfield net/minecraft/class_310.field_1687 Lnet/minecraft/class_638;
      // 95: ifnonnull 9f
      // 98: goto 9c
      // 9b: athrow
      // 9c: bipush 0
      // 9d: ireturn
      // 9e: athrow
      // 9f: aload 2
      // a0: getfield net/minecraft/class_310.field_1687 Lnet/minecraft/class_638;
      // a3: invokevirtual net/minecraft/class_638.method_18456 ()Ljava/util/List;
      // a6: invokeinterface java/util/List.iterator ()Ljava/util/Iterator; 1
      // ab: astore 3
      // ac: aload 3
      // ad: invokeinterface java/util/Iterator.hasNext ()Z 1
      // b2: ifeq f6
      // b5: aload 3
      // b6: invokeinterface java/util/Iterator.next ()Ljava/lang/Object; 1
      // bb: checkcast net/minecraft/class_1657
      // be: astore 4
      // c0: aload 0
      // c1: aload 4
      // c3: invokestatic qeaa361f143ee4a0894bd168fd9b30c66/qf4ccf8f5435d4a78bdca4d6a018b578e/bbabaa.abb (Ljava/util/UUID;Lnet/minecraft/class_1657;)Z
      // c6: iload 1
      // c7: ifne f7
      // ca: iload 1
      // cb: ifne e5
      // ce: goto d2
      // d1: athrow
      // d2: ifeq f2
      // d5: goto d9
      // d8: athrow
      // d9: aload 4
      // db: invokevirtual net/minecraft/class_1657.method_7334 ()Lcom/mojang/authlib/GameProfile;
      // de: invokestatic qeaa361f143ee4a0894bd168fd9b30c66/qf4ccf8f5435d4a78bdca4d6a018b578e/bbabaa.b (Lcom/mojang/authlib/GameProfile;)Z
      // e1: goto e5
      // e4: athrow
      // e5: iload 1
      // e6: ifne f1
      // e9: ifeq f2
      // ec: goto f0
      // ef: athrow
      // f0: bipush 1
      // f1: ireturn
      // f2: iload 1
      // f3: ifeq ac
      // f6: bipush 0
      // f7: ireturn
   }

   // $VF: Irreducible bytecode was duplicated to produce valid code
   static {
      int var17 = 27557712;
      int var8 = "&䨟\uf481䭳\uf488䩓뒉䫣璌䦿㒸䦻㒲䢛뒧䦣뒃䢻㒟䬇\uf494䫋\uf4b6䢷\uf4b7䩻뒘䩫\uf489䨻뒅䢓뒱䡟뒣䭓뒿䭏㒻".length();
      int var11 = 0;
      int var10 = 0;
      String[] var9 = new String[1];
      short var12 = 24348;
      String var7 = "&䨟\uf481䭳\uf488䩓뒉䫣璌䦿㒸䦻㒲䢛뒧䦣뒃䢻㒟䬇\uf494䫋\uf4b6䢷\uf4b7䩻뒘䩫\uf489䨻뒅䢓뒱䡟뒣䭓뒿䭏㒻";

      do {
         int var15 = 0;
         char var13 = var7.charAt(var11);
         char[] var14 = var7.substring(var11 + 1, var11 + 1 + var13).toCharArray();

         do {
            char var16 = var14[var15];
            if (var15 % 2 == 0) {
               var14[var15] = (char)((var16 >>> 2 | var16 << 14) & 65535 ^ var12);
            } else {
               var14[var15] = (char)((var16 << 2 | var16 >>> 14) & 65535 ^ var12);
            }
         } while (++var15 < var14.length);

         var9[var10] = new String(var14);
         var10++;
         var11 = var11 + var13 + 1;
      } while (var11 < var8);

      bb = var9;
      aaa = new Object[var9.length];
      byte var10000 = 0;
      int var10001 = 0;
      b = new int[273];
      byte[] var10002 = "\u0010I\u0006àÖ¹¯Cé»B¿Cy<NQØ Ú$\fÏ\u0087iá*»0róbÇL]\tÇ·\u009d\n^GÃ \nàÕ\u009b¥UârÊ\u000eJdï$Z+\u007f|íyB\u0098 \u0014T\u008f\u0018u\u0096\u00903S¸\u0087x\b÷ÕÌ\u0003Óot\u009dÁ{¶K\u0012uzçaã\u0090n4µoÕn¹\u001d\u009e\u0011¨®ôçÝÖýf$Ê\u0017Â§\u009d\u0093%<#\u0097jvæ\u008dË\u009dÃK\u0095£WN$\u009f\u001d¯\u0092\u0089~¬\u00112\u000e\u0087k\u0091µÍ.æÓ\u001d\u007fÂTÀ\u0089s\u0013\u008d\t°\u000e,èh¨±ßÉ\u0083C¾\u001e\u0090j~d\u0019ª&Ú6&lMåÆöfì|gä\b\f9Fë\u0012`ÐOií»\u0089Häøíãl=rªÙÄ\u0098Ø\f·\u009e5\u0083]\u009bn\u0081T\u0003\bÿæ\u0013t¤C\u0088\u0082Ñ\u0092\u0010_\u0086®\u008f\u0011¨»Ç¼ùð\u009a®õ\u001f\\$\u0014g7òÇ_3\u0084T£\u001e\u009e«\u009bÀ_\t»Ï_³\u0098\u0013\u0011\u001cíÖ~N\u0085·\u009c\t'~óÞ¿gì\u0006\u0088\u001a\u0081\u0092o\u0099ÝË_@Ã¼¦\u0000ã¡KeJl´\u001e½Ã\\¢)\t\u0007J\u001641ÊLÜØ\u008c@:Nï6Aï`ë5l·D¤ÿ\u000e>bcv\u001b\u001dp.\u0084\u0084\u000e°w81\u0007S^\u008fë¯\u007fËú\u0002÷\u001b;FûËÛ:\u007f\u0092\u0090ëO{\f.\u0001}¨w\u0097\u0007\u0088I\u0005©2\u001eOú\u0093\t\u0084ð\u0083r$\u008b\u0086âåÎ×Û\u0014\fñýY}\u0084ø)¤Y\u008eF<\u0093\f\r\u0088Q¿Ì´EeO\u0090\u008d^7 \u0011$AscÜúkÿ\u0093%²fo*µ\u0089ÆÎdëUªêôÝÖgªÅ\u009d{óY¥[L3\u0006ë\u0093a4ÂÊE¯$\u000eMdÇsõ=Í0ÙÇ+S®\u0086\u009aêþü'òBU6ñ\u0010\u0094\u00924[ëLá?\u0082\u0010Zb\u0010\u0014\u0097\u0091ì\u0013·L\u009fù\u001cÿ^÷`h\u0092\u008fHMS\u007f*¨ýä\u0011O`·\r¦ÈQ(\u001dÄ6\u008aiô\u001b ÆÕÒ±\u009b\u0090<2®`~/Ç¥@mÕ\"\u00ad}Ä\u0006\u001a:\u0087·á¬\rK\"f\u008a@!pîËÉ+]P`¬Â\f\u0082\u008a}òýB{ ùIû\u008e6\u0004µ<+\u000fßÂÌÔJiä«¦ètî\u001cþ\u0014r`\u0019:\u0088\u009bF_\u0092lÇU\u0002BýÔ°`ñ\u0091\u0098¡\\å,':Þ¾iG\u0003,ñ\u0013¤)¡\u0087`\u0090Ë\u009f5Ò\"jóí^\u001cÕîÐæ\u009flª²\u0006ÇW\u0002\u0017ÛVJß\u0093\u0084v6\u001a\u0007\u007f\u0001²\u0084\u0093È\u008e\u0093Ãc\r)®\bÔ\u0014¥\u0082m\u000bþåÚ·\"S/U\u009dz5`;\u009fË®°iásYòS¬!1¬0ïì&\u0002\u008dô¿q\u0099bëlq\u0005¿ªZcò¤·R\u0081%\u0003Xú\u001d\u000b\u0000×\u0089\fò\u009e»è!<V^2°\u009bÖãÿ\u000f.}AÿÎ=\u0006\u0082\u008aSE\u001cWmÙë\u000f\u008894ª[DJ\u008f|úâó5\u009dm\u009d\u0098C7#A~Lõä\u0083Ù°\u0014\f\u0082ö8\u0000ù¿\u0018\"·°¢k^Î4°\u001fE.¾°Üú\u0083cÍe.·àå ¶\u009e\u0018\u008eÀ-Î¶S`Oå\u0093¡§Ù).|ë\u0090\u0087øÒ!\u0085óÃ\u0099-Qªº(\u009cp3ú÷?ã\u0007IÁÔ5;\u0083äè\u008aE\u0092g[õ\u0099ô\u0004\u001f5¹Í÷õ«´\u0087jþ\u009a\u000bçÀ\rÄ©ä¥B*Í\u008c;ôFýÛXE¸ç~#}©Ñ\n7\u0004\u008dS×¢>O¼\u0097B\u0095©ßW=ÎÞÏ\u008aÊ\u0011\u009e\u0014\u000e)/uÔ\u0003ê,ÜX¯eá\u0094>\\M)wl¬\u0095\u0005\u000f>)y\u008c\u0088<¥S\u000b\u009aÚÞ\u0010à,v\u001dÝ\u0082½\u001b1µÙZ[¼"
         .getBytes("ISO-8859-1");

      int var48;
      do {
         b[var10000] = (
               (var10002[var10001] & 255) << 24 | (var10002[var10001 + 1] & 255) << 16 | (var10002[var10001 + 2] & 255) << 8 | var10002[var10001 + 3] & 255
            )
            ^ 549383510;
         var10000 += 1;
         var48 = var10001 + 4;
         var10001 += 4;
      } while (var48 < var10002.length);

      String[] var5 = new String[3];
      int var3 = 0;
      String var2;
      int var4 = (var2 = aaab(1198650216, var17 ^ -530161063)).length();
      int var1 = a(-2127333079, var17 ^ 1930132852);
      int var0 = -1;

      while (true) {
         label77: {
            char[] var21 = var2.substring(++var0, var0 + var1).toCharArray();
            var48 = var21.length;
            int var6 = 0;
            var36 = var21;
            var10001 = var48;
            char[] var52;
            int var66;
            if (var48 <= 1) {
               var52 = var21;
               var66 = var6;
            } else {
               var36 = var21;
               var10001 = var48;
               if (var48 <= var6) {
                  break label77;
               }

               var52 = var21;
               var66 = var6;
            }

            while (true) {
               var52[var66] = (char)(var52[var66] ^ switch (var6 % a(-2127333080, var17 ^ 976663015)) {
                  case 0 -> a(-2127333081, var17 ^ 60427448);
                  case 1 -> a(-2127333082, var17 ^ 863744192);
                  case 2 -> a(-2127333083, var17 ^ 1357450389);
                  case 3 -> a(-2127333084, var17 ^ -748756345);
                  case 4 -> a(-2127333085, var17 ^ 215792827);
                  case 5 -> a(-2127333086, var17 ^ -2117714388);
                  default -> a(-2127333087, var17 ^ 701170565);
               });
               var6++;
               if (var10001 == 0) {
                  var66 = var10001;
                  var52 = var36;
               } else {
                  if (var10001 <= var6) {
                     break;
                  }

                  var52 = var36;
                  var66 = var6;
               }
            }
         }

         String var59 = new String(var36).intern();
         byte var28 = -1;
         var5[var3++] = var59;
         if ((var0 += var1) >= var4) {
            aa = var5;
            ab = new String[3];
            ba = aabbaaaba.aaab(aa(a(-2127333088, var17 ^ -489880957), a(-2127333057, var17 ^ 2037580168)));
            return;
         }

         var1 = var2.charAt(var0);
      }
   }

   private static int a(int var0, int var1) {
      int var2 = b[var0 ^ -2127333329] ^ var1 ^ var0;
      var2 ^= 60911;
      var2 ^= 55629;
      var2 += 13889;
      var2 ^= 13354;
      var2 += 7233;
      var2 ^= 64858;
      var2 += 13556;
      var2 -= 36595;
      var2 ^= 21196;
      return var2 + 11939;
   }

   private static boolean bbb(class_1657 var0) {
      int var10000 = baaabbaa.bba;
      class_310 var2 = class_310.method_1551();
      int var1 = var10000;

      label33: {
         try {
            var5 = var2.field_1724;
            if (var1 != 0) {
               break label33;
            }

            if (var2.field_1724 == null) {
               return false;
            }
         } catch (MatchException var4) {
            throw var4;
         }

         var5 = var0;
      }

      try {
         boolean var6 = abb(var5.method_5667(), var2.field_1724);
         if (var1 != 0) {
            return var6;
         }

         if (var6) {
            return true;
         }
      } catch (MatchException var3) {
         throw var3;
      }

      return false;
   }

   private static boolean b(GameProfile param0) {
      // $VF: Couldn't be decompiled
      // Please report this to the Vineflower issue tracker, at https://github.com/Vineflower/vineflower/issues with a copy of the class file (if you have the rights to distribute it!)
      // java.lang.RuntimeException: parsing failure!
      //   at org.jetbrains.java.decompiler.modules.decompiler.decompose.DomHelper.parseGraph(DomHelper.java:211)
      //   at org.jetbrains.java.decompiler.main.rels.MethodProcessor.codeToJava(MethodProcessor.java:166)
      //
      // Bytecode:
      // 00: getstatic qeaa361f143ee4a0894bd168fd9b30c66/qf4ccf8f5435d4a78bdca4d6a018b578e/baaabbaa.bba I
      // 03: istore 1
      // 04: aload 0
      // 05: iload 1
      // 06: ifne 14
      // 09: ifnonnull 13
      // 0c: goto 10
      // 0f: athrow
      // 10: bipush 0
      // 11: ireturn
      // 12: athrow
      // 13: aload 0
      // 14: invokestatic qeaa361f143ee4a0894bd168fd9b30c66/qf4ccf8f5435d4a78bdca4d6a018b578e/baababbb.aab (Lcom/mojang/authlib/GameProfile;)Ljava/lang/String;
      // 17: astore 2
      // 18: getstatic qeaa361f143ee4a0894bd168fd9b30c66/qf4ccf8f5435d4a78bdca4d6a018b578e/bbabaa.ba Lqeaa361f143ee4a0894bd168fd9b30c66/qf4ccf8f5435d4a78bdca4d6a018b578e/ababbbbaa;
      // 1b: aload 2
      // 1c: invokevirtual qeaa361f143ee4a0894bd168fd9b30c66/qf4ccf8f5435d4a78bdca4d6a018b578e/ababbbbaa.baab (Ljava/lang/CharSequence;)Z
      // 1f: ireturn
   }

   public static class_2561 aaaa(class_1657 param0, class_2561 param1) {
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
      // 10: aload 1
      // 11: areturn
      // 12: athrow
      // 13: aload 0
      // 14: iload 2
      // 15: ifne 26
      // 18: invokestatic qeaa361f143ee4a0894bd168fd9b30c66/qf4ccf8f5435d4a78bdca4d6a018b578e/bbabaa.baa (Lnet/minecraft/class_1657;)Z
      // 1b: ifeq 25
      // 1e: goto 22
      // 21: athrow
      // 22: aload 1
      // 23: areturn
      // 24: athrow
      // 25: aload 0
      // 26: invokevirtual net/minecraft/class_1657.method_7334 ()Lcom/mojang/authlib/GameProfile;
      // 29: aload 1
      // 2a: invokestatic qeaa361f143ee4a0894bd168fd9b30c66/qf4ccf8f5435d4a78bdca4d6a018b578e/bbabaa.bab (Lcom/mojang/authlib/GameProfile;Lnet/minecraft/class_2561;)Lnet/minecraft/class_2561;
      // 2d: areturn
   }
}
